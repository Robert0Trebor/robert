package org.vidogram.ui;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.vidogram.messenger.r;
import org.vidogram.messenger.support.widget.LinearLayoutManager;
import org.vidogram.messenger.support.widget.RecyclerView;
import org.vidogram.messenger.support.widget.RecyclerView.a;
import org.vidogram.messenger.support.widget.RecyclerView.i;
import org.vidogram.messenger.support.widget.RecyclerView.l;
import org.vidogram.messenger.support.widget.RecyclerView.u;
import org.vidogram.messenger.y;
import org.vidogram.messenger.y.b;
import org.vidogram.tgnet.ConnectionsManager;
import org.vidogram.tgnet.g.an;
import org.vidogram.tgnet.g.be;
import org.vidogram.tgnet.g.bf;
import org.vidogram.tgnet.g.lr;
import org.vidogram.tgnet.g.ls;
import org.vidogram.tgnet.g.pn;
import org.vidogram.ui.Components.aw;
import org.vidogram.ui.Components.aw.b;
import org.vidogram.ui.Components.bl;
import org.vidogram.ui.Components.bl.c;
import org.vidogram.ui.Components.q;
import org.vidogram.ui.Components.v;
import org.vidogram.ui.c.bf;
import org.vidogram.ui.c.z;

public class a extends org.vidogram.ui.a.g
  implements y.b
{
  private a i;
  private q j;
  private LinearLayoutManager k;
  private ArrayList<g.bf> l = new ArrayList();
  private boolean m;
  private boolean n;
  private int o;
  private int p;
  private int q;
  private int r;
  private int s;
  private int t;
  private boolean u;

  public a(int paramInt)
  {
    this.t = paramInt;
  }

  private void q()
  {
    this.s = 0;
    int i1;
    if (!this.l.isEmpty())
    {
      this.o = this.s;
      this.p = (this.s + this.l.size());
      this.s += this.l.size();
      if (!this.n)
      {
        i1 = this.s;
        this.s = (i1 + 1);
        this.q = i1;
        this.r = -1;
      }
    }
    while (true)
    {
      if (this.i != null)
        this.i.c();
      return;
      i1 = this.s;
      this.s = (i1 + 1);
      this.r = i1;
      this.q = -1;
      continue;
      this.o = -1;
      this.p = -1;
      this.q = -1;
      this.r = -1;
    }
  }

  private void r()
  {
    if ((this.u) || (this.n))
      return;
    this.u = true;
    if ((this.j != null) && (!this.m))
      this.j.a();
    if (this.i != null)
      this.i.c();
    g.pn localpn = new g.pn();
    long l1;
    if (this.l.isEmpty())
    {
      l1 = 0L;
      localpn.e = l1;
      localpn.f = 15;
      if (this.t != 1)
        break label165;
    }
    label165: for (boolean bool = true; ; bool = false)
    {
      localpn.d = bool;
      int i1 = ConnectionsManager.a().a(localpn, new org.vidogram.tgnet.c()
      {
      });
      ConnectionsManager.a().a(i1, this.e);
      return;
      l1 = ((g.bf)this.l.get(this.l.size() - 1)).b.b;
      break;
    }
  }

  public View a(Context paramContext)
  {
    this.d.setBackButtonImage(2130837794);
    this.d.setAllowOverlayTitle(true);
    FrameLayout localFrameLayout;
    if (this.t == 0)
    {
      this.d.setTitle(r.a("ArchivedStickers", 2131230864));
      this.d.setActionBarMenuOnItemClick(new org.vidogram.ui.a.a.a()
      {
        public void a(int paramInt)
        {
          if (paramInt == -1)
            a.this.d();
        }
      });
      this.i = new a(paramContext);
      this.b = new FrameLayout(paramContext);
      localFrameLayout = (FrameLayout)this.b;
      localFrameLayout.setBackgroundColor(-986896);
      this.j = new q(paramContext);
      if (this.t != 0)
        break label261;
      this.j.setText(r.a("ArchivedStickersEmpty", 2131230867));
      label125: localFrameLayout.addView(this.j, v.a(-1, -1.0F));
      if (!this.u)
        break label278;
      this.j.a();
    }
    while (true)
    {
      aw localaw = new aw(paramContext);
      localaw.setFocusable(true);
      localaw.setEmptyView(this.j);
      paramContext = new LinearLayoutManager(paramContext, 1, false);
      this.k = paramContext;
      localaw.setLayoutManager(paramContext);
      localFrameLayout.addView(localaw, v.a(-1, -1.0F));
      localaw.setAdapter(this.i);
      localaw.setOnItemClickListener(new aw.b()
      {
        public void a(View paramView, int paramInt)
        {
          g.bf localbf;
          Object localObject;
          if ((paramInt >= a.a(a.this)) && (paramInt < a.b(a.this)) && (a.this.l() != null))
          {
            localbf = (g.bf)a.c(a.this).get(paramInt);
            if (localbf.b.b == 0L)
              break label138;
            localObject = new g.lr();
            ((g.an)localObject).b = localbf.b.b;
          }
          while (true)
          {
            ((g.an)localObject).c = localbf.b.c;
            localObject = new bl(a.this.l(), a.this, (g.an)localObject, null, null);
            ((bl)localObject).a(new bl.c(paramView)
            {
              public void a()
              {
                ((org.vidogram.ui.c.c)this.a).setChecked(true);
              }

              public void b()
              {
                ((org.vidogram.ui.c.c)this.a).setChecked(false);
              }
            });
            a.this.b((Dialog)localObject);
            return;
            label138: localObject = new g.ls();
            ((g.an)localObject).d = localbf.b.e;
          }
        }
      });
      localaw.setOnScrollListener(new RecyclerView.l()
      {
        public void a(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
        {
          if ((!a.d(a.this)) && (!a.e(a.this)) && (a.f(a.this).n() > a.g(a.this) - 2))
            a.h(a.this);
        }
      });
      return this.b;
      this.d.setTitle(r.a("ArchivedMasks", 2131230859));
      break;
      label261: this.j.setText(r.a("ArchivedMasksEmpty", 2131230862));
      break label125;
      label278: this.j.b();
    }
  }

  public void a(int paramInt, Object[] paramArrayOfObject)
  {
    if (paramInt == y.aj)
    {
      this.m = false;
      this.n = false;
      this.l.clear();
      q();
      if (this.j != null)
        this.j.a();
      r();
    }
  }

  public boolean f()
  {
    super.f();
    r();
    q();
    y.a().a(this, y.aj);
    return true;
  }

  public void g()
  {
    super.g();
    y.a().b(this, y.aj);
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
      return a.i(a.this);
    }

    public int a(int paramInt)
    {
      if ((paramInt >= a.a(a.this)) && (paramInt < a.b(a.this)));
      do
      {
        return 0;
        if (paramInt == a.g(a.this))
          return 1;
      }
      while (paramInt != a.j(a.this));
      return 2;
    }

    public RecyclerView.u a(ViewGroup paramViewGroup, int paramInt)
    {
      paramViewGroup = null;
      switch (paramInt)
      {
      default:
      case 0:
      case 1:
      case 2:
      }
      while (true)
      {
        paramViewGroup.setLayoutParams(new RecyclerView.i(-1, -2));
        return new a(paramViewGroup);
        paramViewGroup = new org.vidogram.ui.c.c(this.b, true);
        paramViewGroup.setBackgroundResource(2130837949);
        ((org.vidogram.ui.c.c)paramViewGroup).setOnCheckClick(new CompoundButton.OnCheckedChangeListener()
        {
          public void onCheckedChanged(CompoundButton paramCompoundButton, boolean paramBoolean)
          {
            paramCompoundButton = (org.vidogram.ui.c.c)paramCompoundButton.getParent();
            Object localObject = (g.bf)a.c(a.this).get(((Integer)paramCompoundButton.getTag()).intValue());
            paramCompoundButton = a.this.l();
            localObject = ((g.bf)localObject).b;
            if (!paramBoolean);
            for (int i = 1; ; i = 2)
            {
              org.vidogram.messenger.d.g.a(paramCompoundButton, (g.be)localObject, i, a.this, false);
              return;
            }
          }
        });
        continue;
        paramViewGroup = new z(this.b);
        paramViewGroup.setBackgroundResource(2130837783);
        continue;
        paramViewGroup = new bf(this.b);
        paramViewGroup.setBackgroundResource(2130837783);
      }
    }

    public void a(RecyclerView.u paramu, int paramInt)
    {
      g.bf localbf;
      if (a(paramInt) == 0)
      {
        paramu = (org.vidogram.ui.c.c)paramu.a;
        paramu.setTag(Integer.valueOf(paramInt));
        localbf = (g.bf)a.c(a.this).get(paramInt);
        if (paramInt == a.c(a.this).size() - 1)
          break label82;
      }
      label82: for (boolean bool = true; ; bool = false)
      {
        paramu.a(localbf, bool, false);
        paramu.setChecked(org.vidogram.messenger.d.g.a(localbf.b.b));
        return;
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
 * Qualified Name:     org.vidogram.ui.a
 * JD-Core Version:    0.6.0
 */