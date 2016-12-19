package org.vidogram.ui.b;

import android.location.Location;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONArray;
import org.json.JSONObject;
import org.vidogram.messenger.ApplicationLoader;
import org.vidogram.messenger.d;
import org.vidogram.messenger.g.a.h;
import org.vidogram.messenger.g.a.k;
import org.vidogram.messenger.g.m;
import org.vidogram.messenger.g.n.a;
import org.vidogram.messenger.g.n.b;
import org.vidogram.messenger.g.s;
import org.vidogram.messenger.n;
import org.vidogram.tgnet.g.jd;
import org.vidogram.tgnet.g.of;
import org.vidogram.tgnet.g.y;

public class b extends a
{
  protected boolean a;
  protected ArrayList<g.of> b = new ArrayList();
  protected ArrayList<String> c = new ArrayList();
  private m d = k.a(ApplicationLoader.a);
  private Location e;
  private a f;
  private Timer g;

  public void a()
  {
    if (this.d != null)
    {
      this.d.a("search");
      this.d.b();
    }
  }

  public void a(String paramString, Location paramLocation)
  {
    if ((paramString == null) || (paramString.length() == 0))
    {
      this.b.clear();
      notifyDataSetChanged();
      return;
    }
    try
    {
      if (this.g != null)
        this.g.cancel();
      this.g = new Timer();
      this.g.schedule(new TimerTask(paramString, paramLocation)
      {
        public void run()
        {
          try
          {
            b.a(b.this).cancel();
            b.a(b.this, null);
            org.vidogram.messenger.a.a(new Runnable()
            {
              public void run()
              {
                b.a(b.this, null);
                b.this.b(b.1.this.a, b.1.this.b);
              }
            });
            return;
          }
          catch (Exception localException)
          {
            while (true)
              n.a("tmessages", localException);
          }
        }
      }
      , 200L, 500L);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        n.a("tmessages", localException);
    }
  }

  public void a(a parama)
  {
    this.f = parama;
  }

  public void b(String paramString, Location paramLocation)
  {
    if ((this.e != null) && (paramLocation.distanceTo(this.e) < 200.0F))
      return;
    this.e = paramLocation;
    if (this.a)
    {
      this.a = false;
      this.d.a("search");
    }
    try
    {
      this.a = true;
      String str = String.format(Locale.US, "https://api.foursquare.com/v2/venues/search/?v=%s&locale=en&limit=25&client_id=%s&client_secret=%s&ll=%s", new Object[] { d.m, d.l, d.k, String.format(Locale.US, "%f,%f", new Object[] { Double.valueOf(paramLocation.getLatitude()), Double.valueOf(paramLocation.getLongitude()) }) });
      paramLocation = str;
      if (paramString != null)
      {
        paramLocation = str;
        if (paramString.length() > 0)
          paramLocation = str + "&query=" + URLEncoder.encode(paramString, "UTF-8");
      }
      paramString = new h(0, paramLocation, null, new n.b()
      {
        public void a(JSONObject paramJSONObject)
        {
          while (true)
          {
            int i;
            g.of localof;
            try
            {
              b.this.b.clear();
              b.this.c.clear();
              JSONArray localJSONArray = paramJSONObject.getJSONObject("response").getJSONArray("venues");
              i = 0;
              int j = localJSONArray.length();
              if (i >= j)
                continue;
              try
              {
                JSONObject localJSONObject = localJSONArray.getJSONObject(i);
                localof = null;
                paramJSONObject = localof;
                if (!localJSONObject.has("categories"))
                  continue;
                Object localObject = localJSONObject.getJSONArray("categories");
                paramJSONObject = localof;
                if (((JSONArray)localObject).length() <= 0)
                  continue;
                localObject = ((JSONArray)localObject).getJSONObject(0);
                paramJSONObject = localof;
                if (!((JSONObject)localObject).has("icon"))
                  continue;
                paramJSONObject = ((JSONObject)localObject).getJSONObject("icon");
                paramJSONObject = String.format(Locale.US, "%s64%s", new Object[] { paramJSONObject.getString("prefix"), paramJSONObject.getString("suffix") });
                b.this.c.add(paramJSONObject);
                paramJSONObject = localJSONObject.getJSONObject("location");
                localof = new g.of();
                localof.e = new g.jd();
                localof.e.c = paramJSONObject.getDouble("lat");
                localof.e.b = paramJSONObject.getDouble("lng");
                if (!paramJSONObject.has("address"))
                  continue;
                localof.g = paramJSONObject.getString("address");
                if (!localJSONObject.has("name"))
                  continue;
                localof.f = localJSONObject.getString("name");
                localof.i = localJSONObject.getString("id");
                localof.h = "foursquare";
                b.this.b.add(localof);
                break label475;
                if (paramJSONObject.has("city"))
                {
                  localof.g = paramJSONObject.getString("city");
                  continue;
                }
              }
              catch (Exception paramJSONObject)
              {
                n.a("tmessages", paramJSONObject);
              }
            }
            catch (Exception paramJSONObject)
            {
              n.a("tmessages", paramJSONObject);
              b.this.a = false;
              b.this.notifyDataSetChanged();
              if (b.b(b.this) == null)
                continue;
              b.b(b.this).a(b.this.b);
              return;
            }
            if (paramJSONObject.has("state"))
            {
              localof.g = paramJSONObject.getString("state");
              continue;
            }
            if (paramJSONObject.has("country"))
            {
              localof.g = paramJSONObject.getString("country");
              continue;
            }
            localof.g = String.format(Locale.US, "%f,%f", new Object[] { Double.valueOf(localof.e.c), Double.valueOf(localof.e.b) });
            continue;
            label475: i += 1;
          }
        }
      }
      , new n.a()
      {
        public void a(s params)
        {
          n.a("tmessages", "Error: " + params.getMessage());
          b.this.a = false;
          b.this.notifyDataSetChanged();
          if (b.b(b.this) != null)
            b.b(b.this).a(b.this.b);
        }
      });
      paramString.a(false);
      paramString.a("search");
      this.d.a(paramString);
      notifyDataSetChanged();
      return;
    }
    catch (Exception paramString)
    {
      while (true)
      {
        n.a("tmessages", paramString);
        this.a = false;
        if (this.f == null)
          continue;
        this.f.a(this.b);
      }
    }
  }

  public static abstract interface a
  {
    public abstract void a(ArrayList<g.of> paramArrayList);
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.b.b
 * JD-Core Version:    0.6.0
 */