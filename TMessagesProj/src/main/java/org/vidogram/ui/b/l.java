package org.vidogram.ui.b;

import android.content.Context;
import android.location.Location;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Locale;
import org.vidogram.tgnet.g.of;
import org.vidogram.ui.c.aa;
import org.vidogram.ui.c.ab;
import org.vidogram.ui.c.ac;
import org.vidogram.ui.c.an;
import org.vidogram.ui.c.u;

public class l extends b
{
  private Context d;
  private int e;
  private an f;
  private Location g;
  private Location h;

  public l(Context paramContext)
  {
    this.d = paramContext;
  }

  private void b()
  {
    if (this.f != null)
    {
      if (this.h != null)
        this.f.a(org.vidogram.messenger.r.a("SendSelectedLocation", 2131231804), String.format(Locale.US, "(%f,%f)", new Object[] { Double.valueOf(this.h.getLatitude()), Double.valueOf(this.h.getLongitude()) }));
    }
    else
      return;
    if (this.g != null)
    {
      this.f.a(org.vidogram.messenger.r.a("SendLocation", 2131231800), org.vidogram.messenger.r.a("AccurateTo", 2131230764, new Object[] { org.vidogram.messenger.r.b("Meters", (int)this.g.getAccuracy()) }));
      return;
    }
    this.f.a(org.vidogram.messenger.r.a("SendLocation", 2131231800), org.vidogram.messenger.r.a("Loading", 2131231394));
  }

  public void a(int paramInt)
  {
    this.e = paramInt;
  }

  public void a(Location paramLocation)
  {
    this.g = paramLocation;
    b();
  }

  public boolean areAllItemsEnabled()
  {
    return false;
  }

  public g.of b(int paramInt)
  {
    if ((paramInt > 2) && (paramInt < this.b.size() + 3))
      return (g.of)this.b.get(paramInt - 3);
    return null;
  }

  public void b(Location paramLocation)
  {
    this.h = paramLocation;
    b();
  }

  public int getCount()
  {
    if ((this.a) || ((!this.a) && (this.b.isEmpty())))
      return 4;
    int j = this.b.size();
    if (this.b.isEmpty());
    for (int i = 0; ; i = 1)
      return i + (j + 3);
  }

  public long getItemId(int paramInt)
  {
    return paramInt;
  }

  public int getItemViewType(int paramInt)
  {
    int i = 1;
    if (paramInt == 0)
      i = 0;
    do
      return i;
    while (paramInt == 1);
    if (paramInt == 2)
      return 2;
    if ((this.a) || ((!this.a) && (this.b.isEmpty())))
      return 4;
    if (paramInt == this.b.size() + 3)
      return 5;
    return 3;
  }

  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (paramInt == 0)
    {
      if (paramView != null)
        break label253;
      paramView = new org.vidogram.ui.c.r(this.d);
    }
    label244: label247: label250: label253: 
    while (true)
    {
      ((org.vidogram.ui.c.r)paramView).setHeight(this.e);
      return paramView;
      if (paramInt == 1)
      {
        if (paramView != null)
          break label250;
        paramView = new an(this.d);
      }
      while (true)
      {
        this.f = ((an)paramView);
        b();
        return paramView;
        if (paramInt == 2)
        {
          if (paramView != null)
            break label247;
          paramView = new u(this.d);
        }
        while (true)
        {
          ((u)paramView).setText(org.vidogram.messenger.r.a("NearbyPlaces", 2131231469));
          return paramView;
          if ((this.a) || ((!this.a) && (this.b.isEmpty())))
          {
            if (paramView != null)
              break label244;
            paramView = new ab(this.d);
          }
          while (true)
          {
            ((ab)paramView).setLoading(this.a);
            return paramView;
            if (paramInt == this.b.size() + 3)
            {
              if (paramView == null)
                return new ac(this.d);
            }
            else
            {
              if (paramView == null)
                paramView = new aa(this.d);
              while (true)
              {
                ((aa)paramView).a((g.of)this.b.get(paramInt - 3), (String)this.c.get(paramInt - 3), true);
                return paramView;
              }
            }
            return paramView;
          }
        }
      }
    }
  }

  public int getViewTypeCount()
  {
    return 6;
  }

  public boolean hasStableIds()
  {
    return true;
  }

  public boolean isEmpty()
  {
    return false;
  }

  public boolean isEnabled(int paramInt)
  {
    return (paramInt != 2) && (paramInt != 0) && ((paramInt != 3) || ((!this.a) && ((this.a) || (!this.b.isEmpty())))) && (paramInt != this.b.size() + 3);
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.b.l
 * JD-Core Version:    0.6.0
 */