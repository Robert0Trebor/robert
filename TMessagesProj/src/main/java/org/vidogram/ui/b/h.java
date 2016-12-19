package org.vidogram.ui.b;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Timer;
import java.util.TimerTask;
import org.vidogram.messenger.Utilities;
import org.vidogram.messenger.n;
import org.vidogram.ui.c.bg;

public class h extends a
{
  private Context a;
  private Timer b;
  private ArrayList<g.a> c;
  private HashMap<String, ArrayList<g.a>> d;

  public h(Context paramContext, HashMap<String, ArrayList<g.a>> paramHashMap)
  {
    this.a = paramContext;
    this.d = paramHashMap;
  }

  private void a(ArrayList<g.a> paramArrayList)
  {
    org.vidogram.messenger.a.a(new Runnable(paramArrayList)
    {
      public void run()
      {
        h.b(h.this, this.a);
        h.this.notifyDataSetChanged();
      }
    });
  }

  private void b(String paramString)
  {
    Utilities.e.b(new Runnable(paramString)
    {
      public void run()
      {
        if (this.a.trim().toLowerCase().length() == 0)
        {
          h.a(h.this, new ArrayList());
          return;
        }
        ArrayList localArrayList = new ArrayList();
        Object localObject = this.a.substring(0, 1);
        localObject = (ArrayList)h.b(h.this).get(((String)localObject).toUpperCase());
        if (localObject != null)
        {
          localObject = ((ArrayList)localObject).iterator();
          while (((Iterator)localObject).hasNext())
          {
            g.a locala = (g.a)((Iterator)localObject).next();
            if (!locala.a.toLowerCase().startsWith(this.a))
              continue;
            localArrayList.add(locala);
          }
        }
        h.a(h.this, localArrayList);
      }
    });
  }

  public g.a a(int paramInt)
  {
    if ((paramInt < 0) || (paramInt >= this.c.size()))
      return null;
    return (g.a)this.c.get(paramInt);
  }

  public void a(String paramString)
  {
    if (paramString == null)
    {
      this.c = null;
      return;
    }
    try
    {
      if (this.b != null)
        this.b.cancel();
      this.b = new Timer();
      this.b.schedule(new TimerTask(paramString)
      {
        public void run()
        {
          try
          {
            h.a(h.this).cancel();
            h.a(h.this, null);
            h.a(h.this, this.a);
            return;
          }
          catch (Exception localException)
          {
            while (true)
              n.a("tmessages", localException);
          }
        }
      }
      , 100L, 300L);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        n.a("tmessages", localException);
    }
  }

  public boolean areAllItemsEnabled()
  {
    return true;
  }

  public int getCount()
  {
    if (this.c == null)
      return 0;
    return this.c.size();
  }

  public long getItemId(int paramInt)
  {
    return paramInt;
  }

  public int getItemViewType(int paramInt)
  {
    return 0;
  }

  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (paramView == null)
      paramView = new bg(this.a);
    while (true)
    {
      Object localObject = (g.a)this.c.get(paramInt);
      paramViewGroup = (bg)paramView;
      String str = ((g.a)localObject).a;
      localObject = "+" + ((g.a)localObject).b;
      if (paramInt != this.c.size() - 1);
      for (boolean bool = true; ; bool = false)
      {
        paramViewGroup.a(str, (String)localObject, bool);
        return paramView;
      }
    }
  }

  public int getViewTypeCount()
  {
    return 1;
  }

  public boolean hasStableIds()
  {
    return true;
  }

  public boolean isEmpty()
  {
    return (this.c == null) || (this.c.size() == 0);
  }

  public boolean isEnabled(int paramInt)
  {
    return true;
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.b.h
 * JD-Core Version:    0.6.0
 */