package org.vidogram.messenger.support.widget;

import android.view.View;

public abstract class i extends RecyclerView.e
{
  boolean a = true;

  public final void a(RecyclerView.u paramu, boolean paramBoolean)
  {
    d(paramu, paramBoolean);
    e(paramu);
  }

  public abstract boolean a(RecyclerView.u paramu);

  public abstract boolean a(RecyclerView.u paramu, int paramInt1, int paramInt2, int paramInt3, int paramInt4);

  public boolean a(RecyclerView.u paramu, RecyclerView.e.c paramc1, RecyclerView.e.c paramc2)
  {
    int k = paramc1.a;
    int m = paramc1.b;
    paramc1 = paramu.a;
    int i;
    if (paramc2 == null)
    {
      i = paramc1.getLeft();
      if (paramc2 != null)
        break label103;
    }
    label103: for (int j = paramc1.getTop(); ; j = paramc2.b)
    {
      if ((paramu.q()) || ((k == i) && (m == j)))
        break label112;
      paramc1.layout(i, j, paramc1.getWidth() + i, paramc1.getHeight() + j);
      return a(paramu, k, m, i, j);
      i = paramc2.a;
      break;
    }
    label112: return a(paramu);
  }

  public abstract boolean a(RecyclerView.u paramu1, RecyclerView.u paramu2, int paramInt1, int paramInt2, int paramInt3, int paramInt4);

  public boolean a(RecyclerView.u paramu1, RecyclerView.u paramu2, RecyclerView.e.c paramc1, RecyclerView.e.c paramc2)
  {
    int k = paramc1.a;
    int m = paramc1.b;
    int i;
    if (paramu2.c())
      i = paramc1.a;
    for (int j = paramc1.b; ; j = paramc2.b)
    {
      return a(paramu1, paramu2, k, m, i, j);
      i = paramc2.a;
    }
  }

  public final void b(RecyclerView.u paramu, boolean paramBoolean)
  {
    c(paramu, paramBoolean);
  }

  public abstract boolean b(RecyclerView.u paramu);

  public boolean b(RecyclerView.u paramu, RecyclerView.e.c paramc1, RecyclerView.e.c paramc2)
  {
    if ((paramc1 != null) && ((paramc1.a != paramc2.a) || (paramc1.b != paramc2.b)))
      return a(paramu, paramc1.a, paramc1.b, paramc2.a, paramc2.b);
    return b(paramu);
  }

  public void c(RecyclerView.u paramu, boolean paramBoolean)
  {
  }

  public boolean c(RecyclerView.u paramu, RecyclerView.e.c paramc1, RecyclerView.e.c paramc2)
  {
    if ((paramc1.a != paramc2.a) || (paramc1.b != paramc2.b))
      return a(paramu, paramc1.a, paramc1.b, paramc2.a, paramc2.b);
    i(paramu);
    return false;
  }

  public void d(RecyclerView.u paramu, boolean paramBoolean)
  {
  }

  public boolean g(RecyclerView.u paramu)
  {
    return (!this.a) || (paramu.n());
  }

  public final void h(RecyclerView.u paramu)
  {
    o(paramu);
    e(paramu);
  }

  public final void i(RecyclerView.u paramu)
  {
    s(paramu);
    e(paramu);
  }

  public final void j(RecyclerView.u paramu)
  {
    q(paramu);
    e(paramu);
  }

  public final void k(RecyclerView.u paramu)
  {
    n(paramu);
  }

  public final void l(RecyclerView.u paramu)
  {
    r(paramu);
  }

  public final void m(RecyclerView.u paramu)
  {
    p(paramu);
  }

  public void n(RecyclerView.u paramu)
  {
  }

  public void o(RecyclerView.u paramu)
  {
  }

  public void p(RecyclerView.u paramu)
  {
  }

  public void q(RecyclerView.u paramu)
  {
  }

  public void r(RecyclerView.u paramu)
  {
  }

  public void s(RecyclerView.u paramu)
  {
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.support.widget.i
 * JD-Core Version:    0.6.0
 */