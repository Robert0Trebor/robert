package org.vidogram.messenger.support.widget;

import android.support.v4.f.a;
import android.support.v4.f.e;
import android.support.v4.f.h.a;
import android.support.v4.f.h.b;

class j
{
  final a<RecyclerView.u, a> a = new a();
  final e<RecyclerView.u> b = new e();

  private RecyclerView.e.c a(RecyclerView.u paramu, int paramInt)
  {
    Object localObject2 = null;
    int i = this.a.a(paramu);
    Object localObject1;
    if (i < 0)
      localObject1 = localObject2;
    a locala;
    do
    {
      do
      {
        return localObject1;
        locala = (a)this.a.c(i);
        localObject1 = localObject2;
      }
      while (locala == null);
      localObject1 = localObject2;
    }
    while ((locala.a & paramInt) == 0);
    locala.a &= (paramInt ^ 0xFFFFFFFF);
    if (paramInt == 4);
    for (paramu = locala.b; ; paramu = locala.c)
    {
      localObject1 = paramu;
      if ((locala.a & 0xC) != 0)
        break;
      this.a.d(i);
      a.a(locala);
      return paramu;
      if (paramInt != 8)
        break label129;
    }
    label129: throw new IllegalArgumentException("Must provide flag PRE or POST");
  }

  RecyclerView.u a(long paramLong)
  {
    return (RecyclerView.u)this.b.a(paramLong);
  }

  void a()
  {
    this.a.clear();
    this.b.c();
  }

  void a(long paramLong, RecyclerView.u paramu)
  {
    this.b.b(paramLong, paramu);
  }

  void a(RecyclerView.u paramu, RecyclerView.e.c paramc)
  {
    a locala2 = (a)this.a.get(paramu);
    a locala1 = locala2;
    if (locala2 == null)
    {
      locala1 = a.a();
      this.a.put(paramu, locala1);
    }
    locala1.b = paramc;
    locala1.a |= 4;
  }

  void a(b paramb)
  {
    int i = this.a.size() - 1;
    if (i >= 0)
    {
      RecyclerView.u localu = (RecyclerView.u)this.a.b(i);
      a locala = (a)this.a.d(i);
      if ((locala.a & 0x3) == 3)
        paramb.a(localu);
      while (true)
      {
        a.a(locala);
        i -= 1;
        break;
        if ((locala.a & 0x1) != 0)
        {
          if (locala.b == null)
          {
            paramb.a(localu);
            continue;
          }
          paramb.a(localu, locala.b, locala.c);
          continue;
        }
        if ((locala.a & 0xE) == 14)
        {
          paramb.b(localu, locala.b, locala.c);
          continue;
        }
        if ((locala.a & 0xC) == 12)
        {
          paramb.c(localu, locala.b, locala.c);
          continue;
        }
        if ((locala.a & 0x4) != 0)
        {
          paramb.a(localu, locala.b, null);
          continue;
        }
        if ((locala.a & 0x8) != 0)
        {
          paramb.b(localu, locala.b, locala.c);
          continue;
        }
        if ((locala.a & 0x2) == 0)
          continue;
      }
    }
  }

  boolean a(RecyclerView.u paramu)
  {
    paramu = (a)this.a.get(paramu);
    return (paramu != null) && ((paramu.a & 0x1) != 0);
  }

  RecyclerView.e.c b(RecyclerView.u paramu)
  {
    return a(paramu, 4);
  }

  void b()
  {
    a.b();
  }

  void b(RecyclerView.u paramu, RecyclerView.e.c paramc)
  {
    a locala2 = (a)this.a.get(paramu);
    a locala1 = locala2;
    if (locala2 == null)
    {
      locala1 = a.a();
      this.a.put(paramu, locala1);
    }
    locala1.a |= 2;
    locala1.b = paramc;
  }

  RecyclerView.e.c c(RecyclerView.u paramu)
  {
    return a(paramu, 8);
  }

  void c(RecyclerView.u paramu, RecyclerView.e.c paramc)
  {
    a locala2 = (a)this.a.get(paramu);
    a locala1 = locala2;
    if (locala2 == null)
    {
      locala1 = a.a();
      this.a.put(paramu, locala1);
    }
    locala1.c = paramc;
    locala1.a |= 8;
  }

  boolean d(RecyclerView.u paramu)
  {
    paramu = (a)this.a.get(paramu);
    return (paramu != null) && ((paramu.a & 0x4) != 0);
  }

  void e(RecyclerView.u paramu)
  {
    a locala2 = (a)this.a.get(paramu);
    a locala1 = locala2;
    if (locala2 == null)
    {
      locala1 = a.a();
      this.a.put(paramu, locala1);
    }
    locala1.a |= 1;
  }

  void f(RecyclerView.u paramu)
  {
    paramu = (a)this.a.get(paramu);
    if (paramu == null)
      return;
    paramu.a &= -2;
  }

  void g(RecyclerView.u paramu)
  {
    int i = this.b.b() - 1;
    while (true)
    {
      if (i >= 0)
      {
        if (paramu == this.b.c(i))
          this.b.a(i);
      }
      else
      {
        paramu = (a)this.a.remove(paramu);
        if (paramu != null)
          a.a(paramu);
        return;
      }
      i -= 1;
    }
  }

  public void h(RecyclerView.u paramu)
  {
    f(paramu);
  }

  static class a
  {
    static h.a<a> d = new h.b(20);
    int a;
    RecyclerView.e.c b;
    RecyclerView.e.c c;

    static a a()
    {
      a locala2 = (a)d.a();
      a locala1 = locala2;
      if (locala2 == null)
        locala1 = new a();
      return locala1;
    }

    static void a(a parama)
    {
      parama.a = 0;
      parama.b = null;
      parama.c = null;
      d.a(parama);
    }

    static void b()
    {
      while (d.a() != null);
    }
  }

  static abstract interface b
  {
    public abstract void a(RecyclerView.u paramu);

    public abstract void a(RecyclerView.u paramu, RecyclerView.e.c paramc1, RecyclerView.e.c paramc2);

    public abstract void b(RecyclerView.u paramu, RecyclerView.e.c paramc1, RecyclerView.e.c paramc2);

    public abstract void c(RecyclerView.u paramu, RecyclerView.e.c paramc1, RecyclerView.e.c paramc2);
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.support.widget.j
 * JD-Core Version:    0.6.0
 */