package org.vidogram.ui.b;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Timer;
import java.util.TimerTask;
import org.vidogram.messenger.Utilities;
import org.vidogram.messenger.a;
import org.vidogram.messenger.ad;
import org.vidogram.messenger.h;
import org.vidogram.messenger.n;
import org.vidogram.messenger.r;
import org.vidogram.messenger.v;
import org.vidogram.tgnet.g.fw;
import org.vidogram.tgnet.g.i;
import org.vidogram.tgnet.g.vw;
import org.vidogram.ui.c.ak;
import org.vidogram.ui.c.bh;
import org.vidogram.ui.c.u;

public class o extends c
{
  private Context d;
  private HashMap<Integer, g.vw> e;
  private ArrayList<g.vw> f = new ArrayList();
  private ArrayList<CharSequence> g = new ArrayList();
  private HashMap<Integer, ?> h;
  private Timer i;
  private boolean j;
  private boolean k;
  private boolean l;
  private boolean m;
  private boolean n;

  public o(Context paramContext, HashMap<Integer, g.vw> paramHashMap, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4)
  {
    this.d = paramContext;
    this.e = paramHashMap;
    this.l = paramBoolean2;
    this.j = paramBoolean1;
    this.m = paramBoolean3;
    this.n = paramBoolean4;
  }

  private void a(ArrayList<g.vw> paramArrayList, ArrayList<CharSequence> paramArrayList1)
  {
    a.a(new Runnable(paramArrayList, paramArrayList1)
    {
      public void run()
      {
        o.a(o.this, this.a);
        o.b(o.this, this.b);
        o.this.notifyDataSetChanged();
      }
    });
  }

  private void b(String paramString)
  {
    a.a(new Runnable(paramString)
    {
      public void run()
      {
        if (o.b(o.this))
          o.this.a(this.a, o.c(o.this), o.d(o.this));
        ArrayList localArrayList = new ArrayList();
        localArrayList.addAll(org.vidogram.messenger.f.a().e);
        Utilities.e.b(new Runnable(localArrayList)
        {
          public void run()
          {
            String str1 = o.2.this.a.trim().toLowerCase();
            if (str1.length() == 0)
            {
              o.a(o.this, new ArrayList(), new ArrayList());
              return;
            }
            Object localObject = r.a().a(str1);
            if ((str1.equals(localObject)) || (((String)localObject).length() == 0))
              localObject = null;
            while (true)
            {
              int i;
              String[] arrayOfString;
              ArrayList localArrayList1;
              ArrayList localArrayList2;
              int j;
              label131: g.vw localvw;
              if (localObject != null)
              {
                i = 1;
                arrayOfString = new String[i + 1];
                arrayOfString[0] = str1;
                if (localObject != null)
                  arrayOfString[1] = localObject;
                localArrayList1 = new ArrayList();
                localArrayList2 = new ArrayList();
                j = 0;
                if (j >= this.a.size())
                  break label504;
                localObject = (g.fw)this.a.get(j);
                localvw = v.a().a(Integer.valueOf(((g.fw)localObject).c));
                if ((localvw.d != ad.c()) && ((!o.e(o.this)) || (localvw.p)))
                  break label215;
              }
              label215: label365: label494: label502: 
              while (true)
              {
                j += 1;
                break label131;
                i = 0;
                break;
                String str2 = org.vidogram.messenger.f.a(localvw.e, localvw.f).toLowerCase();
                str1 = r.a().a(str2);
                localObject = str1;
                if (str2.equals(str1))
                  localObject = null;
                int n = arrayOfString.length;
                int m = 0;
                int k = 0;
                while (true)
                {
                  if (k >= n)
                    break label502;
                  str1 = arrayOfString[k];
                  if ((str2.startsWith(str1)) || (str2.contains(" " + str1)) || ((localObject != null) && ((((String)localObject).startsWith(str1)) || (((String)localObject).contains(" " + str1)))))
                  {
                    i = 1;
                    if (i == 0)
                      break label494;
                    if (i != 1)
                      break label438;
                    localArrayList2.add(a.a(localvw.e, localvw.f, str1));
                  }
                  while (true)
                  {
                    localArrayList1.add(localvw);
                    break;
                    i = m;
                    if (localvw.g == null)
                      break label365;
                    i = m;
                    if (!localvw.g.startsWith(str1))
                      break label365;
                    i = 2;
                    break label365;
                    localArrayList2.add(a.a("@" + localvw.g, null, "@" + str1));
                  }
                  k += 1;
                  m = i;
                }
              }
              label438: label504: o.a(o.this, localArrayList1, localArrayList2);
              return;
            }
          }
        });
      }
    });
  }

  public void a(String paramString)
  {
    try
    {
      if (this.i != null)
        this.i.cancel();
      if (paramString == null)
      {
        this.f.clear();
        this.g.clear();
        if (this.j)
          a(null, this.m, this.n);
        notifyDataSetChanged();
        return;
      }
    }
    catch (Exception localException)
    {
      while (true)
        n.a("tmessages", localException);
      this.i = new Timer();
      this.i.schedule(new TimerTask(paramString)
      {
        public void run()
        {
          try
          {
            o.a(o.this).cancel();
            o.a(o.this, null);
            o.a(o.this, this.a);
            return;
          }
          catch (Exception localException)
          {
            while (true)
              n.a("tmessages", localException);
          }
        }
      }
      , 200L, 300L);
    }
  }

  public void a(HashMap<Integer, ?> paramHashMap)
  {
    this.h = paramHashMap;
  }

  public void a(boolean paramBoolean)
  {
    this.k = paramBoolean;
  }

  public boolean a(int paramInt)
  {
    int i1 = this.f.size();
    int i2 = this.a.size();
    if ((paramInt >= 0) && (paramInt < i1));
    do
      return false;
    while ((paramInt <= i1) || (paramInt > i1 + i2));
    return true;
  }

  public boolean areAllItemsEnabled()
  {
    return false;
  }

  public org.vidogram.tgnet.f b(int paramInt)
  {
    int i1 = this.f.size();
    int i2 = this.a.size();
    if ((paramInt >= 0) && (paramInt < i1))
      return (org.vidogram.tgnet.f)this.f.get(paramInt);
    if ((paramInt > i1) && (paramInt <= i2 + i1))
      return (org.vidogram.tgnet.f)this.a.get(paramInt - i1 - 1);
    return null;
  }

  public int getCount()
  {
    int i2 = this.f.size();
    int i3 = this.a.size();
    int i1 = i2;
    if (i3 != 0)
      i1 = i2 + (i3 + 1);
    return i1;
  }

  public long getItemId(int paramInt)
  {
    return paramInt;
  }

  public int getItemViewType(int paramInt)
  {
    if (paramInt == this.f.size())
      return 1;
    return 0;
  }

  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (paramInt == this.f.size())
    {
      if (paramView == null)
      {
        paramViewGroup = new u(this.d);
        ((u)paramViewGroup).setText(r.a("GlobalSearch", 2131231275));
        return paramViewGroup;
      }
    }
    else
    {
      if (paramView == null)
        if (this.k)
        {
          paramView = new bh(this.d, 1, 1, false);
          if (this.h == null)
            break label537;
          ((bh)paramView).a(false, false);
        }
      while (true)
      {
        label85: org.vidogram.tgnet.f localf = b(paramInt);
        paramViewGroup = paramView;
        if (localf == null)
          break;
        int i1;
        if ((localf instanceof g.vw))
        {
          paramViewGroup = ((g.vw)localf).g;
          i1 = ((g.vw)localf).d;
        }
        while (true)
        {
          label126: String str = null;
          Object localObject1;
          if (paramInt < this.f.size())
          {
            localObject1 = (CharSequence)this.g.get(paramInt);
            if ((localObject1 == null) || (paramViewGroup == null) || (paramViewGroup.length() <= 0) || (!((CharSequence)localObject1).toString().startsWith("@" + paramViewGroup)))
              break label519;
            paramViewGroup = null;
          }
          while (true)
          {
            if (this.k)
            {
              ((bh)paramView).a(localf, paramViewGroup, (CharSequence)localObject1, 0);
              paramViewGroup = paramView;
              if (this.h == null)
                break;
              ((bh)paramView).a(this.h.containsKey(Integer.valueOf(i1)), false);
              return paramView;
              paramView = new ak(this.d);
              break label85;
              if (!(localf instanceof g.i))
                break label529;
              paramViewGroup = ((g.i)localf).v;
              i1 = ((g.i)localf).h;
              break label126;
              if ((paramInt > this.f.size()) && (paramViewGroup != null))
              {
                str = this.b;
                localObject1 = str;
                if (str.startsWith("@"))
                  localObject1 = str.substring(1);
                try
                {
                  localObject1 = a.b(String.format("<c#ff4d83b3>@%s</c>%s", new Object[] { paramViewGroup.substring(0, ((String)localObject1).length()), paramViewGroup.substring(((String)localObject1).length()) }));
                  paramViewGroup = null;
                }
                catch (Exception localObject2)
                {
                  n.a("tmessages", localException);
                  str = null;
                  localObject2 = paramViewGroup;
                  paramViewGroup = str;
                }
                continue;
              }
            }
            else
            {
              ((ak)paramView).a(localf, null, paramViewGroup, (CharSequence)localObject2, false);
              paramViewGroup = (ak)paramView;
              if ((paramInt != getCount() - 1) && (paramInt != this.f.size() - 1));
              for (boolean bool = true; ; bool = false)
              {
                paramViewGroup.a = bool;
                paramViewGroup = paramView;
                if (this.e == null)
                  break;
                if (!this.e.containsKey(Integer.valueOf(i1)))
                  break label500;
                ((ak)paramView).b = 0.5F;
                return paramView;
              }
              label500: ((ak)paramView).b = 1.0F;
              return paramView;
            }
            paramViewGroup = null;
            Object localObject2 = str;
            continue;
            label519: paramViewGroup = (ViewGroup)localObject2;
            localObject2 = str;
          }
          label529: i1 = 0;
          paramViewGroup = null;
        }
        label537: continue;
      }
    }
    return (View)(View)paramView;
  }

  public int getViewTypeCount()
  {
    return 2;
  }

  public boolean hasStableIds()
  {
    return true;
  }

  public boolean isEmpty()
  {
    return (this.f.isEmpty()) && (this.a.isEmpty());
  }

  public boolean isEnabled(int paramInt)
  {
    return paramInt != this.f.size();
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.b.o
 * JD-Core Version:    0.6.0
 */