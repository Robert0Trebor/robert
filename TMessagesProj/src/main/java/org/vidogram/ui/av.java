package org.vidogram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Timer;
import java.util.TimerTask;
import org.vidogram.messenger.Utilities;
import org.vidogram.messenger.ad;
import org.vidogram.messenger.f;
import org.vidogram.messenger.h;
import org.vidogram.messenger.n;
import org.vidogram.messenger.r;
import org.vidogram.messenger.y;
import org.vidogram.messenger.y.b;
import org.vidogram.tgnet.g.fl;
import org.vidogram.tgnet.g.fm;
import org.vidogram.tgnet.g.fn;
import org.vidogram.tgnet.g.i;
import org.vidogram.tgnet.g.j;
import org.vidogram.tgnet.g.k;
import org.vidogram.tgnet.g.l;
import org.vidogram.tgnet.g.vw;
import org.vidogram.tgnet.g.vy;
import org.vidogram.ui.Components.q;
import org.vidogram.ui.a.a.a;
import org.vidogram.ui.a.c;
import org.vidogram.ui.a.d;
import org.vidogram.ui.a.d.b;
import org.vidogram.ui.a.g;
import org.vidogram.ui.c.ba;
import org.vidogram.ui.c.bf;
import org.vidogram.ui.c.bh;

public class av extends g
  implements y.b
{
  private a i;
  private b j;
  private q k;
  private ListView l;
  private g.j m;
  private ArrayList<g.k> n = new ArrayList();
  private int o;
  private g.i p;
  private d q;
  private boolean r;
  private boolean s;
  private int t;
  private int u;
  private int v;
  private int w;
  private int x;

  public av(Bundle paramBundle)
  {
    super(paramBundle);
    this.o = paramBundle.getInt("chat_id");
  }

  private int a(g.k paramk)
  {
    if ((paramk instanceof g.fn))
      return 0;
    if ((paramk instanceof g.fm))
      return 1;
    return 2;
  }

  private void q()
  {
    if (this.m == null);
    do
      return;
    while (this.n.size() == this.m.t.e.size());
    this.n.clear();
    this.n.addAll(this.m.t.e);
    try
    {
      Collections.sort(this.n, new Comparator()
      {
        public int a(g.k paramk1, g.k paramk2)
        {
          int i = av.a(av.this, paramk1);
          int j = av.a(av.this, paramk2);
          if (i > j)
            return 1;
          if (i < j)
            return -1;
          if (i == j)
          {
            paramk2 = org.vidogram.messenger.v.a().a(Integer.valueOf(paramk2.b));
            paramk1 = org.vidogram.messenger.v.a().a(Integer.valueOf(paramk1.b));
            if ((paramk2 == null) || (paramk2.k == null))
              break label204;
          }
          label204: for (i = paramk2.k.c; ; i = 0)
          {
            if ((paramk1 != null) && (paramk1.k != null));
            for (j = paramk1.k.c; ; j = 0)
            {
              if ((i > 0) && (j > 0))
              {
                if (i > j)
                  break;
                if (i < j)
                  return -1;
                return 0;
              }
              if ((i < 0) && (j < 0))
              {
                if (i > j)
                  break;
                if (i < j)
                  return -1;
                return 0;
              }
              if (((i < 0) && (j > 0)) || ((i == 0) && (j != 0)))
                return -1;
              if (((j < 0) && (i > 0)) || ((j == 0) && (i != 0)))
                break;
              return 0;
            }
          }
        }
      });
      return;
    }
    catch (Exception localException)
    {
      n.a("tmessages", localException);
    }
  }

  private void r()
  {
    this.x = 0;
    int i1 = this.x;
    this.x = (i1 + 1);
    this.t = i1;
    i1 = this.x;
    this.x = (i1 + 1);
    this.u = i1;
    if (this.m != null)
    {
      this.v = this.x;
      this.x += this.n.size();
      i1 = this.x;
      this.x = (i1 + 1);
      this.w = i1;
      if ((this.q != null) && (!this.s))
        this.q.setVisibility(0);
    }
    while (true)
    {
      if (this.i != null)
        this.i.notifyDataSetChanged();
      return;
      this.v = -1;
      this.w = -1;
      if (this.q == null)
        continue;
      this.q.setVisibility(8);
    }
  }

  public View a(Context paramContext)
  {
    this.r = false;
    this.s = false;
    this.d.setBackButtonImage(2130837794);
    this.d.setAllowOverlayTitle(true);
    this.d.setTitle(r.a("SetAdminsTitle", 2131231826));
    this.d.setActionBarMenuOnItemClick(new a.a()
    {
      public void a(int paramInt)
      {
        if (paramInt == -1)
          av.this.d();
      }
    });
    this.q = this.d.a().b(0, 2130837806).d(true).a(new d.b()
    {
      public void a()
      {
        av.a(av.this, true);
        av.b(av.this).setEmptyView(av.a(av.this));
      }

      public void a(EditText paramEditText)
      {
        paramEditText = paramEditText.getText().toString();
        if (paramEditText.length() != 0)
        {
          av.b(av.this, true);
          if ((av.e(av.this) != null) && (av.b(av.this).getAdapter() != av.e(av.this)))
          {
            av.b(av.this).setAdapter(av.e(av.this));
            av.f(av.this).setBackgroundColor(-1);
          }
          if ((av.a(av.this) != null) && (av.b(av.this).getEmptyView() != av.a(av.this)))
          {
            av.a(av.this).b();
            av.b(av.this).setEmptyView(av.a(av.this));
          }
        }
        if (av.e(av.this) != null)
          av.e(av.this).a(paramEditText);
      }

      public void c()
      {
        av.a(av.this, false);
        av.b(av.this, false);
        if (av.b(av.this) != null)
        {
          av.b(av.this).setEmptyView(null);
          av.a(av.this).setVisibility(8);
          if (av.b(av.this).getAdapter() != av.c(av.this))
          {
            av.b(av.this).setAdapter(av.c(av.this));
            av.d(av.this).setBackgroundColor(-986896);
          }
        }
        if (av.e(av.this) != null)
          av.e(av.this).a(null);
      }
    });
    this.q.getSearchField().setHint(r.a("Search", 2131231766));
    this.i = new a(paramContext);
    this.j = new b(paramContext);
    this.b = new FrameLayout(paramContext);
    FrameLayout localFrameLayout = (FrameLayout)this.b;
    this.b.setBackgroundColor(-986896);
    this.l = new ListView(paramContext);
    this.l.setDivider(null);
    this.l.setDividerHeight(0);
    this.l.setVerticalScrollBarEnabled(false);
    this.l.setDrawSelectorOnTop(true);
    localFrameLayout.addView(this.l, org.vidogram.ui.Components.v.a(-1, -1.0F));
    this.l.setAdapter(this.i);
    this.l.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
      {
        boolean bool3 = true;
        boolean bool2 = true;
        bh localbh;
        int i;
        if ((av.b(av.this).getAdapter() == av.e(av.this)) || ((paramInt >= av.g(av.this)) && (paramInt < av.h(av.this))))
        {
          localbh = (bh)paramView;
          av.a(av.this, org.vidogram.messenger.v.a().b(Integer.valueOf(av.i(av.this))));
          if (av.b(av.this).getAdapter() == av.e(av.this))
          {
            paramAdapterView = av.e(av.this).a(paramInt);
            i = 0;
            if (i >= av.j(av.this).size())
              break label630;
            if (((g.k)av.j(av.this).get(i)).b != paramAdapterView.b);
          }
        }
        while (true)
        {
          label153: if ((i != -1) && (!(paramAdapterView instanceof g.fn)))
          {
            if (!(paramAdapterView instanceof g.fl))
              break label444;
            paramView = new g.fm();
            paramView.b = paramAdapterView.b;
            paramView.d = paramAdapterView.d;
            paramView.c = paramAdapterView.c;
            label205: av.j(av.this).set(i, paramView);
            i = av.k(av.this).t.e.indexOf(paramAdapterView);
            if (i != -1)
              av.k(av.this).t.e.set(i, paramView);
            if (av.b(av.this).getAdapter() == av.e(av.this))
              av.b.a(av.e(av.this)).set(paramInt, paramView);
            if (((paramView instanceof g.fl)) && ((av.l(av.this) == null) || (av.l(av.this).e)))
              break label479;
            bool1 = true;
            label333: localbh.a(bool1, true);
            if ((av.l(av.this) != null) && (av.l(av.this).e))
            {
              paramAdapterView = org.vidogram.messenger.v.a();
              paramInt = av.i(av.this);
              i = paramView.b;
              if ((paramView instanceof g.fl))
                break label485;
              bool1 = bool2;
              paramAdapterView.c(paramInt, i, bool1);
            }
          }
          label393: label444: label479: label485: 
          do
          {
            do
            {
              return;
              i += 1;
              break;
              paramAdapterView = av.j(av.this);
              i = paramInt - av.g(av.this);
              paramAdapterView = (g.k)paramAdapterView.get(i);
              break label153;
              paramView = new g.fl();
              paramView.b = paramAdapterView.b;
              paramView.d = paramAdapterView.d;
              paramView.c = paramAdapterView.c;
              break label205;
              bool1 = false;
              break label333;
              bool1 = false;
              break label393;
            }
            while (paramInt != av.m(av.this));
            av.a(av.this, org.vidogram.messenger.v.a().b(Integer.valueOf(av.i(av.this))));
          }
          while (av.l(av.this) == null);
          paramAdapterView = av.l(av.this);
          if (!av.l(av.this).e)
          {
            bool1 = true;
            paramAdapterView.e = bool1;
            paramAdapterView = (ba)paramView;
            if (av.l(av.this).e)
              break label624;
          }
          label624: for (boolean bool1 = bool3; ; bool1 = false)
          {
            paramAdapterView.setChecked(bool1);
            org.vidogram.messenger.v.a().c(av.i(av.this), av.l(av.this).e);
            return;
            bool1 = false;
            break;
          }
          label630: i = -1;
        }
      }
    });
    this.k = new q(paramContext);
    this.k.setVisibility(8);
    this.k.setShowAtCenter(true);
    this.k.setText(r.a("NoResult", 2131231509));
    localFrameLayout.addView(this.k, org.vidogram.ui.Components.v.a(-1, -1.0F));
    this.k.b();
    r();
    return this.b;
  }

  public void a(int paramInt, Object[] paramArrayOfObject)
  {
    int i1 = 0;
    if (paramInt == y.n)
    {
      g.j localj = (g.j)paramArrayOfObject[0];
      if (localj.e == this.o)
      {
        this.m = localj;
        q();
        r();
      }
    }
    if (paramInt == y.b)
    {
      int i2 = ((Integer)paramArrayOfObject[0]).intValue();
      if ((((i2 & 0x2) != 0) || ((i2 & 0x1) != 0) || ((i2 & 0x4) != 0)) && (this.l != null))
      {
        int i3 = this.l.getChildCount();
        paramInt = i1;
        while (paramInt < i3)
        {
          paramArrayOfObject = this.l.getChildAt(paramInt);
          if ((paramArrayOfObject instanceof bh))
            ((bh)paramArrayOfObject).a(i2);
          paramInt += 1;
        }
      }
    }
  }

  public void a(g.j paramj)
  {
    this.m = paramj;
    q();
  }

  public boolean f()
  {
    super.f();
    y.a().a(this, y.n);
    y.a().a(this, y.b);
    return true;
  }

  public void g()
  {
    super.g();
    y.a().b(this, y.n);
    y.a().b(this, y.b);
  }

  public void i()
  {
    super.i();
    if (this.i != null)
      this.i.notifyDataSetChanged();
  }

  private class a extends org.vidogram.ui.b.a
  {
    private Context b;

    public a(Context arg2)
    {
      Object localObject;
      this.b = localObject;
    }

    public boolean areAllItemsEnabled()
    {
      return false;
    }

    public int getCount()
    {
      return av.n(av.this);
    }

    public Object getItem(int paramInt)
    {
      return null;
    }

    public long getItemId(int paramInt)
    {
      return paramInt;
    }

    public int getItemViewType(int paramInt)
    {
      if (paramInt == av.m(av.this))
        return 0;
      if ((paramInt == av.o(av.this)) || (paramInt == av.h(av.this)))
        return 1;
      return 2;
    }

    public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      boolean bool2 = false;
      int i = getItemViewType(paramInt);
      if (i == 0)
      {
        if (paramView != null)
          break label461;
        paramView = new ba(this.b);
        paramView.setBackgroundColor(-1);
      }
      label458: label461: 
      while (true)
      {
        paramViewGroup = (ba)paramView;
        av.a(av.this, org.vidogram.messenger.v.a().b(Integer.valueOf(av.i(av.this))));
        Object localObject = r.a("SetAdminsAll", 2131231823);
        if ((av.l(av.this) != null) && (!av.l(av.this).e));
        for (boolean bool1 = true; ; bool1 = false)
        {
          paramViewGroup.a((String)localObject, bool1, false);
          paramViewGroup = paramView;
          return paramViewGroup;
        }
        if (i == 1)
        {
          if (paramView != null)
            break label458;
          paramView = new bf(this.b);
        }
        while (true)
        {
          if (paramInt == av.o(av.this))
          {
            if (av.l(av.this).e)
              ((bf)paramView).setText(r.a("SetAdminsNotAllInfo", 2131231825));
            while (av.g(av.this) != -1)
            {
              paramView.setBackgroundResource(2130837782);
              return paramView;
              ((bf)paramView).setText(r.a("SetAdminsAllInfo", 2131231824));
            }
            paramView.setBackgroundResource(2130837783);
            return paramView;
          }
          paramViewGroup = paramView;
          if (paramInt != av.h(av.this))
            break;
          ((bf)paramView).setText("");
          paramView.setBackgroundResource(2130837783);
          return paramView;
          if (i == 2)
          {
            if (paramView == null)
            {
              paramView = new bh(this.b, 1, 2, false);
              paramView.setBackgroundColor(-1);
            }
            while (true)
            {
              paramViewGroup = (bh)paramView;
              localObject = (g.k)av.j(av.this).get(paramInt - av.g(av.this));
              paramViewGroup.a(org.vidogram.messenger.v.a().a(Integer.valueOf(((g.k)localObject).b)), null, null, 0);
              av.a(av.this, org.vidogram.messenger.v.a().b(Integer.valueOf(av.i(av.this))));
              if ((!(localObject instanceof g.fl)) || ((av.l(av.this) != null) && (!av.l(av.this).e)));
              for (bool1 = true; ; bool1 = false)
              {
                paramViewGroup.a(bool1, false);
                if ((av.l(av.this) != null) && (av.l(av.this).e))
                {
                  bool1 = bool2;
                  if (((g.k)localObject).b != ad.c());
                }
                else
                {
                  bool1 = true;
                }
                paramViewGroup.setCheckDisabled(bool1);
                return paramView;
              }
            }
          }
          return paramView;
        }
      }
    }

    public int getViewTypeCount()
    {
      return 3;
    }

    public boolean hasStableIds()
    {
      return false;
    }

    public boolean isEmpty()
    {
      return false;
    }

    public boolean isEnabled(int paramInt)
    {
      if (paramInt == av.m(av.this))
        return true;
      return (paramInt >= av.g(av.this)) && (paramInt < av.h(av.this)) && (!((g.k)av.j(av.this).get(paramInt - av.g(av.this)) instanceof g.fn));
    }
  }

  public class b extends org.vidogram.ui.b.a
  {
    private Context b;
    private ArrayList<g.k> c = new ArrayList();
    private ArrayList<CharSequence> d = new ArrayList();
    private Timer e;

    public b(Context arg2)
    {
      Object localObject;
      this.b = localObject;
    }

    private void a(ArrayList<g.k> paramArrayList, ArrayList<CharSequence> paramArrayList1)
    {
      org.vidogram.messenger.a.a(new Runnable(paramArrayList, paramArrayList1)
      {
        public void run()
        {
          av.b.a(av.b.this, this.a);
          av.b.b(av.b.this, this.b);
          av.b.this.notifyDataSetChanged();
        }
      });
    }

    private void b(String paramString)
    {
      org.vidogram.messenger.a.a(new Runnable(paramString)
      {
        public void run()
        {
          ArrayList localArrayList = new ArrayList();
          localArrayList.addAll(av.j(av.this));
          Utilities.e.b(new Runnable(localArrayList)
          {
            public void run()
            {
              String str2 = av.b.2.this.a.trim().toLowerCase();
              if (str2.length() == 0)
              {
                av.b.a(av.b.this, new ArrayList(), new ArrayList());
                return;
              }
              String str1 = r.a().a(str2);
              if ((str2.equals(str1)) || (str1.length() == 0))
                str1 = null;
              while (true)
              {
                int i;
                String[] arrayOfString;
                ArrayList localArrayList1;
                ArrayList localArrayList2;
                int j;
                label131: g.k localk;
                g.vw localvw;
                if (str1 != null)
                {
                  i = 1;
                  arrayOfString = new String[i + 1];
                  arrayOfString[0] = str2;
                  if (str1 != null)
                    arrayOfString[1] = str1;
                  localArrayList1 = new ArrayList();
                  localArrayList2 = new ArrayList();
                  j = 0;
                  if (j >= this.a.size())
                    break label483;
                  localk = (g.k)this.a.get(j);
                  localvw = org.vidogram.messenger.v.a().a(Integer.valueOf(localk.b));
                  if (localvw.d != ad.c())
                    break label194;
                }
                label194: label344: label473: label481: 
                while (true)
                {
                  j += 1;
                  break label131;
                  i = 0;
                  break;
                  String str3 = f.a(localvw.e, localvw.f).toLowerCase();
                  str2 = r.a().a(str3);
                  str1 = str2;
                  if (str3.equals(str2))
                    str1 = null;
                  int n = arrayOfString.length;
                  int m = 0;
                  int k = 0;
                  while (true)
                  {
                    if (k >= n)
                      break label481;
                    str2 = arrayOfString[k];
                    if ((str3.startsWith(str2)) || (str3.contains(" " + str2)) || ((str1 != null) && ((str1.startsWith(str2)) || (str1.contains(" " + str2)))))
                    {
                      i = 1;
                      if (i == 0)
                        break label473;
                      if (i != 1)
                        break label417;
                      localArrayList2.add(org.vidogram.messenger.a.a(localvw.e, localvw.f, str2));
                    }
                    while (true)
                    {
                      localArrayList1.add(localk);
                      break;
                      i = m;
                      if (localvw.g == null)
                        break label344;
                      i = m;
                      if (!localvw.g.startsWith(str2))
                        break label344;
                      i = 2;
                      break label344;
                      localArrayList2.add(org.vidogram.messenger.a.a("@" + localvw.g, null, "@" + str2));
                    }
                    k += 1;
                    m = i;
                  }
                }
                label417: label483: av.b.a(av.b.this, localArrayList1, localArrayList2);
                return;
              }
            }
          });
        }
      });
    }

    public g.k a(int paramInt)
    {
      return (g.k)this.c.get(paramInt);
    }

    public void a(String paramString)
    {
      try
      {
        if (this.e != null)
          this.e.cancel();
        if (paramString == null)
        {
          this.c.clear();
          this.d.clear();
          notifyDataSetChanged();
          return;
        }
      }
      catch (Exception localException)
      {
        while (true)
          n.a("tmessages", localException);
        this.e = new Timer();
        this.e.schedule(new TimerTask(paramString)
        {
          public void run()
          {
            try
            {
              av.b.b(av.b.this).cancel();
              av.b.a(av.b.this, null);
              av.b.a(av.b.this, this.a);
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

    public boolean areAllItemsEnabled()
    {
      return true;
    }

    public int getCount()
    {
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
      Object localObject1 = null;
      boolean bool2 = false;
      if (paramView == null);
      for (paramViewGroup = new bh(this.b, 1, 2, false); ; paramViewGroup = paramView)
      {
        g.k localk = a(paramInt);
        g.vw localvw = org.vidogram.messenger.v.a().a(Integer.valueOf(localk.b));
        Object localObject2 = localvw.g;
        if (paramInt < this.c.size())
        {
          paramView = (CharSequence)this.d.get(paramInt);
          if ((paramView == null) || (localObject2 == null) || (((String)localObject2).length() <= 0) || (!paramView.toString().startsWith("@" + (String)localObject2)));
        }
        while (true)
        {
          localObject2 = (bh)paramViewGroup;
          ((bh)localObject2).a(localvw, (CharSequence)localObject1, paramView, 0);
          av.a(av.this, org.vidogram.messenger.v.a().b(Integer.valueOf(av.i(av.this))));
          if ((!(localk instanceof g.fl)) || ((av.l(av.this) != null) && (!av.l(av.this).e)));
          for (boolean bool1 = true; ; bool1 = false)
          {
            ((bh)localObject2).a(bool1, false);
            if ((av.l(av.this) != null) && (av.l(av.this).e))
            {
              bool1 = bool2;
              if (localk.b != ad.c());
            }
            else
            {
              bool1 = true;
            }
            ((bh)localObject2).setCheckDisabled(bool1);
            return paramViewGroup;
          }
          localObject2 = null;
          localObject1 = paramView;
          paramView = (View)localObject2;
          continue;
          paramView = null;
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
      return this.c.isEmpty();
    }

    public boolean isEnabled(int paramInt)
    {
      return true;
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.av
 * JD-Core Version:    0.6.0
 */