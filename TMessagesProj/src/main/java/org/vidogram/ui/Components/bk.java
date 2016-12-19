package org.vidogram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import org.vidogram.messenger.a;
import org.vidogram.messenger.d.g;
import org.vidogram.messenger.support.widget.RecyclerView;
import org.vidogram.messenger.support.widget.RecyclerView.a;
import org.vidogram.messenger.support.widget.RecyclerView.h;
import org.vidogram.messenger.support.widget.RecyclerView.l;
import org.vidogram.messenger.support.widget.RecyclerView.u;
import org.vidogram.messenger.support.widget.d;
import org.vidogram.messenger.support.widget.d.c;
import org.vidogram.messenger.y;
import org.vidogram.messenger.y.b;
import org.vidogram.tgnet.g.be;
import org.vidogram.tgnet.g.q;
import org.vidogram.tgnet.g.rg;

public class bk extends FrameLayout
  implements y.b
{
  private ArrayList<g.rg>[] a = { new ArrayList(), new ArrayList() };
  private ArrayList<g.q>[] b = { new ArrayList(), new ArrayList() };
  private int c = 1;
  private b d;
  private c e;
  private ax f;
  private aw g;
  private d h;
  private TextView i;
  private aw.b j;
  private int k;
  private int l = -2;
  private int m;

  public bk(Context paramContext)
  {
    super(paramContext);
    setBackgroundColor(-14540254);
    setClickable(true);
    g.a(0);
    g.a(1);
    this.g = new aw(paramContext)
    {
      public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
      {
        boolean bool = org.vidogram.ui.ax.a().a(paramMotionEvent, bk.a(bk.this), bk.this.getMeasuredHeight());
        return (super.onInterceptTouchEvent(paramMotionEvent)) || (bool);
      }
    };
    aw localaw = this.g;
    Object localObject = new d(paramContext, 5);
    this.h = ((d)localObject);
    localaw.setLayoutManager((RecyclerView.h)localObject);
    this.h.a(new d.c()
    {
      public int a(int paramInt)
      {
        if (paramInt == bk.c.a(bk.b(bk.this)))
          return bk.c.b(bk.b(bk.this));
        return 1;
      }
    });
    this.g.setPadding(0, a.a(4.0F), 0, 0);
    this.g.setClipToPadding(false);
    localaw = this.g;
    localObject = new c(paramContext);
    this.e = ((c)localObject);
    localaw.setAdapter((RecyclerView.a)localObject);
    this.g.setOnTouchListener(new View.OnTouchListener()
    {
      public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
      {
        return org.vidogram.ui.ax.a().a(paramMotionEvent, bk.a(bk.this), bk.this.getMeasuredHeight(), bk.c(bk.this));
      }
    });
    this.j = new aw.b()
    {
      public void a(View paramView, int paramInt)
      {
        if (!(paramView instanceof org.vidogram.ui.c.aw));
        do
        {
          return;
          org.vidogram.ui.ax.a().b();
          paramView = (org.vidogram.ui.c.aw)paramView;
        }
        while (paramView.b());
        paramView = paramView.getSticker();
        bk.d(bk.this).a(paramView);
        g.a(1, paramView, (int)(System.currentTimeMillis() / 1000L));
        org.vidogram.messenger.v.a().a(paramView, true);
      }
    };
    this.g.setOnItemClickListener(this.j);
    this.g.setGlowColor(-657673);
    addView(this.g, v.a(-1, -1.0F, 51, 0.0F, 48.0F, 0.0F, 0.0F));
    this.i = new TextView(paramContext);
    this.i.setTextSize(1, 18.0F);
    this.i.setTextColor(-7829368);
    addView(this.i, v.a(-2, -2.0F, 17, 0.0F, 48.0F, 0.0F, 0.0F));
    this.g.setEmptyView(this.i);
    this.f = new ax(paramContext);
    this.f.setBackgroundColor(-16777216);
    this.f.setUnderlineHeight(a.a(1.0F));
    this.f.setIndicatorColor(-10305560);
    this.f.setUnderlineColor(-15066598);
    this.f.setIndicatorHeight(a.a(1.0F) + 1);
    addView(this.f, v.b(-1, 48, 51));
    b();
    this.f.setDelegate(new ax.a()
    {
      public void a(int paramInt)
      {
        if (paramInt == 0)
        {
          if (bk.e(bk.this) == 0)
            bk.a(bk.this, 1);
          while (true)
          {
            if (bk.d(bk.this) != null)
              bk.d(bk.this).a();
            bk.f(bk.this)[bk.e(bk.this)] = g.b(bk.e(bk.this));
            bk.g(bk.this).a(0, 0);
            bk.h(bk.this);
            bk.i(bk.this);
            bk.j(bk.this);
            bk.k(bk.this);
            return;
            bk.a(bk.this, 0);
          }
        }
        if (paramInt == bk.l(bk.this) + 1)
        {
          bk.g(bk.this).a(0, 0);
          return;
        }
        int i = paramInt - 1 - bk.m(bk.this);
        paramInt = i;
        if (i >= bk.n(bk.this)[bk.e(bk.this)].size())
          paramInt = bk.n(bk.this)[bk.e(bk.this)].size() - 1;
        bk.g(bk.this).a(bk.b(bk.this).a((g.rg)bk.n(bk.this)[bk.e(bk.this)].get(paramInt)), 0);
        bk.o(bk.this);
      }
    });
    this.g.setOnScrollListener(new RecyclerView.l()
    {
      public void a(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
      {
        bk.o(bk.this);
      }
    });
  }

  private void a()
  {
    int n = this.h.m();
    if (n == -1)
      return;
    a(n);
  }

  private void a(int paramInt)
  {
    if (this.g == null)
      return;
    ax localax = this.f;
    int n = this.e.e(paramInt);
    if (this.l > 0);
    for (paramInt = this.l; ; paramInt = this.k)
    {
      localax.a(n + 1, paramInt + 1);
      return;
    }
  }

  private void b()
  {
    if (this.f == null)
      return;
    this.l = -2;
    this.k = 0;
    int i1 = this.f.getCurrentPosition();
    this.f.a();
    label128: g.rg localrg;
    if (this.c == 0)
    {
      this.f.c(2130837849);
      this.i.setText(org.vidogram.messenger.r.a("NoStickers", 2131231517));
      if (!this.b[this.c].isEmpty())
      {
        this.l = this.k;
        this.k += 1;
        this.f.c(2130837850);
      }
      this.a[this.c].clear();
      ArrayList localArrayList = g.d(this.c);
      n = 0;
      if (n >= localArrayList.size())
        break label230;
      localrg = (g.rg)localArrayList.get(n);
      if ((!localrg.c.h) && (localrg.e != null) && (!localrg.e.isEmpty()))
        break label212;
    }
    while (true)
    {
      n += 1;
      break label128;
      this.f.c(2130837853);
      this.i.setText(org.vidogram.messenger.r.a("NoMasks", 2131231496));
      break;
      label212: this.a[this.c].add(localrg);
    }
    label230: int n = 0;
    while (n < this.a[this.c].size())
    {
      this.f.a((g.q)((g.rg)this.a[this.c].get(n)).e.get(0));
      n += 1;
    }
    this.f.b();
    if (i1 != 0)
      this.f.a(i1, i1);
    c();
  }

  private void c()
  {
    if (this.f == null);
    do
    {
      return;
      n = this.h.m();
    }
    while (n == -1);
    ax localax = this.f;
    int i1 = this.e.e(n);
    if (this.l > 0);
    for (int n = this.l; ; n = this.k)
    {
      localax.a(i1 + 1, n + 1);
      return;
    }
  }

  private void d()
  {
    if (this.e != null)
      this.e.c();
    if (org.vidogram.ui.ax.a().c())
      org.vidogram.ui.ax.a().d();
    org.vidogram.ui.ax.a().b();
  }

  private void e()
  {
    int n = this.b[this.c].size();
    this.b[this.c] = g.b(this.c);
    if (this.e != null)
      this.e.c();
    if (n != this.b[this.c].size())
      b();
  }

  public void a(int paramInt, Object[] paramArrayOfObject)
  {
    if (paramInt == y.P)
      if (((Integer)paramArrayOfObject[0]).intValue() == this.c)
      {
        b();
        d();
        c();
      }
    do
      return;
    while ((paramInt != y.ah) || (((Boolean)paramArrayOfObject[0]).booleanValue()) || (((Integer)paramArrayOfObject[1]).intValue() != this.c));
    e();
  }

  public int getCurrentType()
  {
    return this.c;
  }

  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    y.a().a(this, y.P);
    y.a().a(this, y.F);
    a.a(new Runnable()
    {
      public void run()
      {
        bk.h(bk.this);
        bk.i(bk.this);
      }
    });
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (this.m != paramInt3 - paramInt1)
    {
      this.m = (paramInt3 - paramInt1);
      d();
    }
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
  }

  public void setListener(b paramb)
  {
    this.d = paramb;
  }

  public void setVisibility(int paramInt)
  {
    super.setVisibility(paramInt);
    if (paramInt != 8)
    {
      y.a().a(this, y.P);
      y.a().a(this, y.ah);
      b();
      d();
      e();
      g.a(0, false, true);
      g.a(1, false, true);
    }
  }

  private class a extends RecyclerView.u
  {
    public a(View arg2)
    {
      super();
    }
  }

  public static abstract interface b
  {
    public abstract void a();

    public abstract void a(g.q paramq);
  }

  private class c extends RecyclerView.a
  {
    private Context b;
    private int c;
    private HashMap<Integer, g.rg> d = new HashMap();
    private HashMap<g.rg, Integer> e = new HashMap();
    private HashMap<Integer, g.q> f = new HashMap();
    private int g;

    public c(Context arg2)
    {
      Object localObject;
      this.b = localObject;
    }

    public int a()
    {
      if (this.g != 0)
        return this.g + 1;
      return 0;
    }

    public int a(int paramInt)
    {
      if (this.f.get(Integer.valueOf(paramInt)) != null)
        return 0;
      return 1;
    }

    public int a(g.rg paramrg)
    {
      return ((Integer)this.e.get(paramrg)).intValue() * this.c;
    }

    public RecyclerView.u a(ViewGroup paramViewGroup, int paramInt)
    {
      paramViewGroup = null;
      switch (paramInt)
      {
      default:
      case 0:
      case 1:
      }
      while (true)
      {
        return new bk.a(bk.this, paramViewGroup);
        paramViewGroup = new org.vidogram.ui.c.aw(this.b)
        {
          public void onMeasure(int paramInt1, int paramInt2)
          {
            super.onMeasure(paramInt1, View.MeasureSpec.makeMeasureSpec(a.a(82.0F), 1073741824));
          }
        };
        continue;
        paramViewGroup = new org.vidogram.ui.c.r(this.b);
      }
    }

    public void a(RecyclerView.u paramu, int paramInt)
    {
      Object localObject;
      switch (paramu.h())
      {
      default:
        return;
      case 0:
        localObject = (g.q)this.f.get(Integer.valueOf(paramInt));
        ((org.vidogram.ui.c.aw)paramu.a).a((g.q)localObject, false);
        return;
      case 1:
      }
      if (paramInt == this.g)
      {
        paramInt = (paramInt - 1) / this.c;
        localObject = (g.rg)this.d.get(Integer.valueOf(paramInt));
        if (localObject == null)
        {
          ((org.vidogram.ui.c.r)paramu.a).setHeight(1);
          return;
        }
        paramInt = bk.a(bk.this).getMeasuredHeight() - (int)Math.ceil(((g.rg)localObject).e.size() / this.c) * a.a(82.0F);
        paramu = (org.vidogram.ui.c.r)paramu.a;
        if (paramInt > 0);
        while (true)
        {
          paramu.setHeight(paramInt);
          return;
          paramInt = 1;
        }
      }
      ((org.vidogram.ui.c.r)paramu.a).setHeight(a.a(82.0F));
    }

    public void c()
    {
      int j = bk.this.getMeasuredWidth();
      int i = j;
      if (j == 0)
        i = a.c.x;
      this.c = (i / a.a(72.0F));
      bk.g(bk.this).a(this.c);
      this.d.clear();
      this.e.clear();
      this.f.clear();
      this.g = 0;
      ArrayList localArrayList2 = bk.n(bk.this)[bk.e(bk.this)];
      i = -1;
      if (i < localArrayList2.size())
      {
        g.rg localrg = null;
        int k = this.g / this.c;
        ArrayList localArrayList1;
        if (i == -1)
        {
          localArrayList1 = bk.f(bk.this)[bk.e(bk.this)];
          label135: if (!localArrayList1.isEmpty())
            break label185;
        }
        while (true)
        {
          i += 1;
          break;
          localrg = (g.rg)localArrayList2.get(i);
          localArrayList1 = localrg.e;
          this.e.put(localrg, Integer.valueOf(k));
          break label135;
          label185: int m = (int)Math.ceil(localArrayList1.size() / this.c);
          j = 0;
          while (j < localArrayList1.size())
          {
            this.f.put(Integer.valueOf(this.g + j), localArrayList1.get(j));
            j += 1;
          }
          this.g += this.c * m;
          j = 0;
          while (j < m)
          {
            this.d.put(Integer.valueOf(k + j), localrg);
            j += 1;
          }
        }
      }
      super.c();
    }

    public int e(int paramInt)
    {
      if (this.c == 0)
      {
        int j = bk.this.getMeasuredWidth();
        int i = j;
        if (j == 0)
          i = a.c.x;
        this.c = (i / a.a(72.0F));
      }
      paramInt /= this.c;
      g.rg localrg = (g.rg)this.d.get(Integer.valueOf(paramInt));
      if (localrg == null)
        return bk.l(bk.this);
      return bk.n(bk.this)[bk.e(bk.this)].indexOf(localrg) + bk.m(bk.this);
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.Components.bk
 * JD-Core Version:    0.6.0
 */