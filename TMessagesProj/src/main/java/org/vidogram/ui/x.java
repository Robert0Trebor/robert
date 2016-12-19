package org.vidogram.ui;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import org.vidogram.messenger.r;
import org.vidogram.messenger.support.widget.LinearLayoutManager;
import org.vidogram.messenger.support.widget.RecyclerView.a;
import org.vidogram.messenger.support.widget.RecyclerView.i;
import org.vidogram.messenger.support.widget.RecyclerView.u;
import org.vidogram.messenger.y;
import org.vidogram.messenger.y.b;
import org.vidogram.tgnet.g.an;
import org.vidogram.tgnet.g.be;
import org.vidogram.tgnet.g.bf;
import org.vidogram.tgnet.g.lr;
import org.vidogram.tgnet.g.ls;
import org.vidogram.ui.Components.aw;
import org.vidogram.ui.Components.aw.b;
import org.vidogram.ui.Components.bl;
import org.vidogram.ui.Components.bl.c;
import org.vidogram.ui.Components.v;
import org.vidogram.ui.a.a;
import org.vidogram.ui.a.a.a;
import org.vidogram.ui.c.bf;
import org.vidogram.ui.c.s;

public class x extends org.vidogram.ui.a.g
  implements y.b
{
  private a i;
  private LinearLayoutManager j;
  private ArrayList<Long> k = null;
  private HashMap<Long, g.bf> l = new HashMap();
  private int m;
  private int n;
  private int o;
  private int p;

  private void q()
  {
    if (this.j == null);
    int i1;
    int i2;
    do
    {
      do
      {
        return;
        i1 = this.j.m();
      }
      while (i1 == -1);
      i2 = this.j.n();
    }
    while (i2 == -1);
    this.i.a(i1, i2 - i1 + 1);
  }

  private void r()
  {
    this.p = 0;
    ArrayList localArrayList = org.vidogram.messenger.d.g.e();
    int i1;
    if (!localArrayList.isEmpty())
    {
      this.m = this.p;
      this.n = (this.p + localArrayList.size());
      i1 = this.p;
      this.p = (localArrayList.size() + i1);
      i1 = this.p;
      this.p = (i1 + 1);
    }
    for (this.o = i1; ; this.o = -1)
    {
      if (this.i != null)
        this.i.c();
      org.vidogram.messenger.d.g.a(true);
      return;
      this.m = -1;
      this.n = -1;
    }
  }

  public View a(Context paramContext)
  {
    this.d.setBackButtonImage(2130837794);
    this.d.setAllowOverlayTitle(true);
    this.d.setTitle(r.a("FeaturedStickers", 2131231192));
    this.d.setActionBarMenuOnItemClick(new a.a()
    {
      public void a(int paramInt)
      {
        if (paramInt == -1)
          x.this.d();
      }
    });
    this.i = new a(paramContext);
    this.b = new FrameLayout(paramContext);
    FrameLayout localFrameLayout = (FrameLayout)this.b;
    localFrameLayout.setBackgroundColor(-986896);
    aw localaw = new aw(paramContext);
    localaw.setItemAnimator(null);
    localaw.setLayoutAnimation(null);
    localaw.setFocusable(true);
    localaw.setTag(Integer.valueOf(14));
    this.j = new LinearLayoutManager(paramContext)
    {
      public boolean c()
      {
        return false;
      }
    };
    this.j.b(1);
    localaw.setLayoutManager(this.j);
    localFrameLayout.addView(localaw, v.a(-1, -1.0F));
    localaw.setAdapter(this.i);
    localaw.setOnItemClickListener(new aw.b()
    {
      public void a(View paramView, int paramInt)
      {
        g.bf localbf;
        Object localObject;
        if ((paramInt >= x.a(x.this)) && (paramInt < x.b(x.this)) && (x.this.l() != null))
        {
          localbf = (g.bf)org.vidogram.messenger.d.g.e().get(paramInt);
          if (localbf.b.b == 0L)
            break label136;
          localObject = new g.lr();
          ((g.an)localObject).b = localbf.b.b;
        }
        while (true)
        {
          ((g.an)localObject).c = localbf.b.c;
          localObject = new bl(x.this.l(), x.this, (g.an)localObject, null, null);
          ((bl)localObject).a(new bl.c(paramView, localbf)
          {
            public void a()
            {
              ((s)this.a).setDrawProgress(true);
              x.c(x.this).put(Long.valueOf(this.b.b.b), this.b);
            }

            public void b()
            {
            }
          });
          x.this.b((Dialog)localObject);
          return;
          label136: localObject = new g.ls();
          ((g.an)localObject).d = localbf.b.e;
        }
      }
    });
    return this.b;
  }

  public void a(int paramInt, Object[] paramArrayOfObject)
  {
    if (paramInt == y.Q)
    {
      if (this.k == null)
        this.k = org.vidogram.messenger.d.g.f();
      r();
    }
    do
      return;
    while (paramInt != y.P);
    q();
  }

  public boolean f()
  {
    super.f();
    org.vidogram.messenger.d.g.b();
    y.a().a(this, y.Q);
    y.a().a(this, y.P);
    ArrayList localArrayList = org.vidogram.messenger.d.g.f();
    if (localArrayList != null)
      this.k = new ArrayList(localArrayList);
    r();
    return true;
  }

  public void g()
  {
    super.g();
    y.a().b(this, y.Q);
    y.a().b(this, y.P);
  }

  public void i()
  {
    super.i();
    if (this.i != null)
      this.i.c();
  }

  private class a extends RecyclerView.a
  {
    private Context b;

    public a(Context arg2)
    {
      Object localObject;
      this.b = localObject;
    }

    public int a()
    {
      return x.d(x.this);
    }

    public int a(int paramInt)
    {
      if ((paramInt >= x.a(x.this)) && (paramInt < x.b(x.this)));
      do
        return 0;
      while (paramInt != x.f(x.this));
      return 1;
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
        paramViewGroup.setLayoutParams(new RecyclerView.i(-1, -2));
        return new a(paramViewGroup);
        paramViewGroup = new s(this.b);
        paramViewGroup.setBackgroundResource(2130837949);
        ((s)paramViewGroup).setAddOnClickListener(new View.OnClickListener()
        {
          public void onClick(View paramView)
          {
            paramView = (s)paramView.getParent();
            g.bf localbf = paramView.getStickerSet();
            if (x.c(x.this).containsKey(Long.valueOf(localbf.b.b)))
              return;
            x.c(x.this).put(Long.valueOf(localbf.b.b), localbf);
            org.vidogram.messenger.d.g.a(x.this.l(), localbf.b, 2, x.this, false);
            paramView.setDrawProgress(true);
          }
        });
        continue;
        paramViewGroup = new bf(this.b);
        paramViewGroup.setBackgroundResource(2130837783);
      }
    }

    public void a(RecyclerView.u paramu, int paramInt)
    {
      boolean bool2 = true;
      boolean bool3 = false;
      boolean bool1;
      if (a(paramInt) == 0)
      {
        ArrayList localArrayList = org.vidogram.messenger.d.g.e();
        paramu = (s)paramu.a;
        paramu.setTag(Integer.valueOf(paramInt));
        g.bf localbf = (g.bf)localArrayList.get(paramInt);
        if (paramInt == localArrayList.size() - 1)
          break label171;
        bool1 = true;
        if ((x.e(x.this) == null) || (!x.e(x.this).contains(Long.valueOf(localbf.b.b))))
          break label176;
        label93: paramu.a(localbf, bool1, bool2);
        bool1 = x.c(x.this).containsKey(Long.valueOf(localbf.b.b));
        if ((!bool1) || (!paramu.a()))
          break label182;
        x.c(x.this).remove(Long.valueOf(localbf.b.b));
        paramu.setDrawProgress(false);
        bool1 = bool3;
      }
      label171: label176: label182: 
      while (true)
      {
        paramu.setDrawProgress(bool1);
        return;
        bool1 = false;
        break;
        bool2 = false;
        break label93;
      }
    }

    private class a extends RecyclerView.u
    {
      public a(View arg2)
      {
        super();
      }
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.x
 * JD-Core Version:    0.6.0
 */