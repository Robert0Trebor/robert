package org.vidogram.messenger.support.widget;

import android.support.v4.a.a;
import android.support.v4.view.af;
import android.support.v4.view.at;
import android.support.v4.view.ax;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class c extends i
{
  private ArrayList<RecyclerView.u> b = new ArrayList();
  private ArrayList<RecyclerView.u> c = new ArrayList();
  private ArrayList<b> d = new ArrayList();
  private ArrayList<a> e = new ArrayList();
  private ArrayList<ArrayList<RecyclerView.u>> f = new ArrayList();
  private ArrayList<ArrayList<b>> g = new ArrayList();
  private ArrayList<ArrayList<a>> h = new ArrayList();
  private ArrayList<RecyclerView.u> i = new ArrayList();
  private ArrayList<RecyclerView.u> j = new ArrayList();
  private ArrayList<RecyclerView.u> k = new ArrayList();
  private ArrayList<RecyclerView.u> l = new ArrayList();

  private void a(List<a> paramList, RecyclerView.u paramu)
  {
    int m = paramList.size() - 1;
    while (m >= 0)
    {
      a locala = (a)paramList.get(m);
      if ((a(locala, paramu)) && (locala.a == null) && (locala.b == null))
        paramList.remove(locala);
      m -= 1;
    }
  }

  private void a(a parama)
  {
    View localView = null;
    Object localObject = parama.a;
    if (localObject == null);
    for (localObject = null; ; localObject = ((RecyclerView.u)localObject).a)
    {
      RecyclerView.u localu = parama.b;
      if (localu != null)
        localView = localu.a;
      if (localObject != null)
      {
        localObject = af.p((View)localObject).a(g());
        this.l.add(parama.a);
        ((at)localObject).b(parama.e - parama.c);
        ((at)localObject).c(parama.f - parama.d);
        ((at)localObject).a(0.0F).a(new c(parama, (at)localObject)
        {
          public void a(View paramView)
          {
            c.this.b(this.a.a, true);
          }

          public void b(View paramView)
          {
            this.b.a(null);
            af.c(paramView, 1.0F);
            af.a(paramView, 0.0F);
            af.b(paramView, 0.0F);
            c.this.a(this.a.a, true);
            c.h(c.this).remove(this.a.a);
            c.e(c.this);
          }
        }).c();
      }
      if (localView != null)
      {
        localObject = af.p(localView);
        this.l.add(parama.b);
        ((at)localObject).b(0.0F).c(0.0F).a(g()).a(1.0F).a(new c(parama, (at)localObject, localView)
        {
          public void a(View paramView)
          {
            c.this.b(this.a.b, false);
          }

          public void b(View paramView)
          {
            this.b.a(null);
            af.c(this.c, 1.0F);
            af.a(this.c, 0.0F);
            af.b(this.c, 0.0F);
            c.this.a(this.a.b, false);
            c.h(c.this).remove(this.a.b);
            c.e(c.this);
          }
        }).c();
      }
      return;
    }
  }

  private boolean a(a parama, RecyclerView.u paramu)
  {
    boolean bool2 = false;
    boolean bool1 = false;
    if (parama.b == paramu)
      parama.b = null;
    while (true)
    {
      af.c(paramu.a, 1.0F);
      af.a(paramu.a, 0.0F);
      af.b(paramu.a, 0.0F);
      a(paramu, bool1);
      bool1 = true;
      do
      {
        return bool1;
        bool1 = bool2;
      }
      while (parama.a != paramu);
      parama.a = null;
      bool1 = true;
    }
  }

  private void b(RecyclerView.u paramu, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    Object localObject = paramu.a;
    paramInt1 = paramInt3 - paramInt1;
    paramInt2 = paramInt4 - paramInt2;
    if (paramInt1 != 0)
      af.p((View)localObject).b(0.0F);
    if (paramInt2 != 0)
      af.p((View)localObject).c(0.0F);
    localObject = af.p((View)localObject);
    this.j.add(paramu);
    ((at)localObject).a(d()).a(new c(paramu, paramInt1, paramInt2, (at)localObject)
    {
      public void a(View paramView)
      {
        c.this.l(this.a);
      }

      public void b(View paramView)
      {
        this.d.a(null);
        c.this.i(this.a);
        c.g(c.this).remove(this.a);
        c.e(c.this);
      }

      public void c(View paramView)
      {
        if (this.b != 0)
          af.a(paramView, 0.0F);
        if (this.c != 0)
          af.b(paramView, 0.0F);
      }
    }).c();
  }

  private void b(a parama)
  {
    if (parama.a != null)
      a(parama, parama.a);
    if (parama.b != null)
      a(parama, parama.b);
  }

  private void j()
  {
    if (!b())
      h();
  }

  private void t(RecyclerView.u paramu)
  {
    at localat = af.p(paramu.a);
    this.k.add(paramu);
    localat.a(f()).a(0.0F).a(new c(paramu, localat)
    {
      public void a(View paramView)
      {
        c.this.k(this.a);
      }

      public void b(View paramView)
      {
        this.b.a(null);
        af.c(paramView, 1.0F);
        c.this.h(this.a);
        c.d(c.this).remove(this.a);
        c.e(c.this);
      }
    }).c();
  }

  private void u(RecyclerView.u paramu)
  {
    at localat = af.p(paramu.a);
    this.i.add(paramu);
    localat.a(1.0F).a(e()).a(new c(paramu, localat)
    {
      public void a(View paramView)
      {
        c.this.m(this.a);
      }

      public void b(View paramView)
      {
        this.b.a(null);
        c.this.j(this.a);
        c.f(c.this).remove(this.a);
        c.e(c.this);
      }

      public void c(View paramView)
      {
        af.c(paramView, 1.0F);
      }
    }).c();
  }

  private void v(RecyclerView.u paramu)
  {
    a.a(paramu.a);
    c(paramu);
  }

  public void a()
  {
    int m;
    int n;
    label24: int i1;
    if (!this.b.isEmpty())
    {
      m = 1;
      if (this.d.isEmpty())
        break label72;
      n = 1;
      if (this.e.isEmpty())
        break label77;
      i1 = 1;
      label36: if (this.c.isEmpty())
        break label82;
    }
    label72: label77: label82: for (int i2 = 1; ; i2 = 0)
    {
      if ((m != 0) || (n != 0) || (i2 != 0) || (i1 != 0))
        break label88;
      return;
      m = 0;
      break;
      n = 0;
      break label24;
      i1 = 0;
      break label36;
    }
    label88: Object localObject1 = this.b.iterator();
    while (((Iterator)localObject1).hasNext())
      t((RecyclerView.u)((Iterator)localObject1).next());
    this.b.clear();
    Object localObject2;
    label211: long l1;
    label291: label366: long l2;
    label376: long l3;
    if (n != 0)
    {
      localObject1 = new ArrayList();
      ((ArrayList)localObject1).addAll(this.d);
      this.g.add(localObject1);
      this.d.clear();
      localObject2 = new Runnable((ArrayList)localObject1)
      {
        public void run()
        {
          Iterator localIterator = this.a.iterator();
          while (localIterator.hasNext())
          {
            c.b localb = (c.b)localIterator.next();
            c.a(c.this, localb.a, localb.b, localb.c, localb.d, localb.e);
          }
          this.a.clear();
          c.a(c.this).remove(this.a);
        }
      };
      if (m != 0)
        af.a(((b)((ArrayList)localObject1).get(0)).a.a, (Runnable)localObject2, f());
    }
    else
    {
      if (i1 != 0)
      {
        localObject1 = new ArrayList();
        ((ArrayList)localObject1).addAll(this.e);
        this.h.add(localObject1);
        this.e.clear();
        localObject2 = new Runnable((ArrayList)localObject1)
        {
          public void run()
          {
            Iterator localIterator = this.a.iterator();
            while (localIterator.hasNext())
            {
              c.a locala = (c.a)localIterator.next();
              c.a(c.this, locala);
            }
            this.a.clear();
            c.b(c.this).remove(this.a);
          }
        };
        if (m == 0)
          break label428;
        af.a(((a)((ArrayList)localObject1).get(0)).a.a, (Runnable)localObject2, f());
      }
      if (i2 == 0)
        break label436;
      localObject1 = new ArrayList();
      ((ArrayList)localObject1).addAll(this.c);
      this.f.add(localObject1);
      this.c.clear();
      localObject2 = new Runnable((ArrayList)localObject1)
      {
        public void run()
        {
          Iterator localIterator = this.a.iterator();
          while (localIterator.hasNext())
          {
            RecyclerView.u localu = (RecyclerView.u)localIterator.next();
            c.a(c.this, localu);
          }
          this.a.clear();
          c.c(c.this).remove(this.a);
        }
      };
      if ((m == 0) && (n == 0) && (i1 == 0))
        break label456;
      if (m == 0)
        break label438;
      l1 = f();
      if (n == 0)
        break label444;
      l2 = d();
      if (i1 == 0)
        break label450;
      l3 = g();
    }
    while (true)
    {
      l2 = Math.max(l2, l3);
      af.a(((RecyclerView.u)((ArrayList)localObject1).get(0)).a, (Runnable)localObject2, l1 + l2);
      return;
      ((Runnable)localObject2).run();
      break label211;
      label428: ((Runnable)localObject2).run();
      break label291;
      label436: break;
      label438: l1 = 0L;
      break label366;
      label444: l2 = 0L;
      break label376;
      label450: l3 = 0L;
    }
    label456: ((Runnable)localObject2).run();
  }

  void a(List<RecyclerView.u> paramList)
  {
    int m = paramList.size() - 1;
    while (m >= 0)
    {
      af.p(((RecyclerView.u)paramList.get(m)).a).b();
      m -= 1;
    }
  }

  public boolean a(RecyclerView.u paramu)
  {
    v(paramu);
    this.b.add(paramu);
    return true;
  }

  public boolean a(RecyclerView.u paramu, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    View localView = paramu.a;
    paramInt1 = (int)(paramInt1 + af.k(paramu.a));
    paramInt2 = (int)(paramInt2 + af.l(paramu.a));
    v(paramu);
    int m = paramInt3 - paramInt1;
    int n = paramInt4 - paramInt2;
    if ((m == 0) && (n == 0))
    {
      i(paramu);
      return false;
    }
    if (m != 0)
      af.a(localView, -m);
    if (n != 0)
      af.b(localView, -n);
    this.d.add(new b(paramu, paramInt1, paramInt2, paramInt3, paramInt4, null));
    return true;
  }

  public boolean a(RecyclerView.u paramu, List<Object> paramList)
  {
    return (!paramList.isEmpty()) || (super.a(paramu, paramList));
  }

  public boolean a(RecyclerView.u paramu1, RecyclerView.u paramu2, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (paramu1 == paramu2)
      return a(paramu1, paramInt1, paramInt2, paramInt3, paramInt4);
    float f1 = af.k(paramu1.a);
    float f2 = af.l(paramu1.a);
    float f3 = af.f(paramu1.a);
    v(paramu1);
    int m = (int)(paramInt3 - paramInt1 - f1);
    int n = (int)(paramInt4 - paramInt2 - f2);
    af.a(paramu1.a, f1);
    af.b(paramu1.a, f2);
    af.c(paramu1.a, f3);
    if (paramu2 != null)
    {
      v(paramu2);
      af.a(paramu2.a, -m);
      af.b(paramu2.a, -n);
      af.c(paramu2.a, 0.0F);
    }
    this.e.add(new a(paramu1, paramu2, paramInt1, paramInt2, paramInt3, paramInt4, null));
    return true;
  }

  public boolean b()
  {
    return (!this.c.isEmpty()) || (!this.e.isEmpty()) || (!this.d.isEmpty()) || (!this.b.isEmpty()) || (!this.j.isEmpty()) || (!this.k.isEmpty()) || (!this.i.isEmpty()) || (!this.l.isEmpty()) || (!this.g.isEmpty()) || (!this.f.isEmpty()) || (!this.h.isEmpty());
  }

  public boolean b(RecyclerView.u paramu)
  {
    v(paramu);
    af.c(paramu.a, 0.0F);
    this.c.add(paramu);
    return true;
  }

  public void c()
  {
    int m = this.d.size() - 1;
    Object localObject1;
    Object localObject2;
    while (m >= 0)
    {
      localObject1 = (b)this.d.get(m);
      localObject2 = ((b)localObject1).a.a;
      af.b((View)localObject2, 0.0F);
      af.a((View)localObject2, 0.0F);
      i(((b)localObject1).a);
      this.d.remove(m);
      m -= 1;
    }
    m = this.b.size() - 1;
    while (m >= 0)
    {
      h((RecyclerView.u)this.b.get(m));
      this.b.remove(m);
      m -= 1;
    }
    m = this.c.size() - 1;
    while (m >= 0)
    {
      localObject1 = (RecyclerView.u)this.c.get(m);
      af.c(((RecyclerView.u)localObject1).a, 1.0F);
      j((RecyclerView.u)localObject1);
      this.c.remove(m);
      m -= 1;
    }
    m = this.e.size() - 1;
    while (m >= 0)
    {
      b((a)this.e.get(m));
      m -= 1;
    }
    this.e.clear();
    if (!b())
      return;
    m = this.g.size() - 1;
    int n;
    while (m >= 0)
    {
      localObject1 = (ArrayList)this.g.get(m);
      n = ((ArrayList)localObject1).size() - 1;
      while (n >= 0)
      {
        localObject2 = (b)((ArrayList)localObject1).get(n);
        View localView = ((b)localObject2).a.a;
        af.b(localView, 0.0F);
        af.a(localView, 0.0F);
        i(((b)localObject2).a);
        ((ArrayList)localObject1).remove(n);
        if (((ArrayList)localObject1).isEmpty())
          this.g.remove(localObject1);
        n -= 1;
      }
      m -= 1;
    }
    m = this.f.size() - 1;
    while (m >= 0)
    {
      localObject1 = (ArrayList)this.f.get(m);
      n = ((ArrayList)localObject1).size() - 1;
      while (n >= 0)
      {
        localObject2 = (RecyclerView.u)((ArrayList)localObject1).get(n);
        af.c(((RecyclerView.u)localObject2).a, 1.0F);
        j((RecyclerView.u)localObject2);
        ((ArrayList)localObject1).remove(n);
        if (((ArrayList)localObject1).isEmpty())
          this.f.remove(localObject1);
        n -= 1;
      }
      m -= 1;
    }
    m = this.h.size() - 1;
    while (m >= 0)
    {
      localObject1 = (ArrayList)this.h.get(m);
      n = ((ArrayList)localObject1).size() - 1;
      while (n >= 0)
      {
        b((a)((ArrayList)localObject1).get(n));
        if (((ArrayList)localObject1).isEmpty())
          this.h.remove(localObject1);
        n -= 1;
      }
      m -= 1;
    }
    a(this.k);
    a(this.j);
    a(this.i);
    a(this.l);
    h();
  }

  public void c(RecyclerView.u paramu)
  {
    View localView = paramu.a;
    af.p(localView).b();
    int m = this.d.size() - 1;
    while (m >= 0)
    {
      if (((b)this.d.get(m)).a == paramu)
      {
        af.b(localView, 0.0F);
        af.a(localView, 0.0F);
        i(paramu);
        this.d.remove(m);
      }
      m -= 1;
    }
    a(this.e, paramu);
    if (this.b.remove(paramu))
    {
      af.c(localView, 1.0F);
      h(paramu);
    }
    if (this.c.remove(paramu))
    {
      af.c(localView, 1.0F);
      j(paramu);
    }
    m = this.h.size() - 1;
    ArrayList localArrayList;
    while (m >= 0)
    {
      localArrayList = (ArrayList)this.h.get(m);
      a(localArrayList, paramu);
      if (localArrayList.isEmpty())
        this.h.remove(m);
      m -= 1;
    }
    m = this.g.size() - 1;
    if (m >= 0)
    {
      localArrayList = (ArrayList)this.g.get(m);
      int n = localArrayList.size() - 1;
      while (true)
      {
        if (n >= 0)
        {
          if (((b)localArrayList.get(n)).a != paramu)
            break label293;
          af.b(localView, 0.0F);
          af.a(localView, 0.0F);
          i(paramu);
          localArrayList.remove(n);
          if (localArrayList.isEmpty())
            this.g.remove(m);
        }
        m -= 1;
        break;
        label293: n -= 1;
      }
    }
    m = this.f.size() - 1;
    while (m >= 0)
    {
      localArrayList = (ArrayList)this.f.get(m);
      if (localArrayList.remove(paramu))
      {
        af.c(localView, 1.0F);
        j(paramu);
        if (localArrayList.isEmpty())
          this.f.remove(m);
      }
      m -= 1;
    }
    if ((!this.k.remove(paramu)) || ((!this.i.remove(paramu)) || ((!this.l.remove(paramu)) || (this.j.remove(paramu)))));
    j();
  }

  private static class a
  {
    public RecyclerView.u a;
    public RecyclerView.u b;
    public int c;
    public int d;
    public int e;
    public int f;

    private a(RecyclerView.u paramu1, RecyclerView.u paramu2)
    {
      this.a = paramu1;
      this.b = paramu2;
    }

    private a(RecyclerView.u paramu1, RecyclerView.u paramu2, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      this(paramu1, paramu2);
      this.c = paramInt1;
      this.d = paramInt2;
      this.e = paramInt3;
      this.f = paramInt4;
    }

    public String toString()
    {
      return "ChangeInfo{oldHolder=" + this.a + ", newHolder=" + this.b + ", fromX=" + this.c + ", fromY=" + this.d + ", toX=" + this.e + ", toY=" + this.f + '}';
    }
  }

  private static class b
  {
    public RecyclerView.u a;
    public int b;
    public int c;
    public int d;
    public int e;

    private b(RecyclerView.u paramu, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      this.a = paramu;
      this.b = paramInt1;
      this.c = paramInt2;
      this.d = paramInt3;
      this.e = paramInt4;
    }
  }

  private static class c
    implements ax
  {
    public void a(View paramView)
    {
    }

    public void b(View paramView)
    {
    }

    public void c(View paramView)
    {
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.support.widget.c
 * JD-Core Version:    0.6.0
 */