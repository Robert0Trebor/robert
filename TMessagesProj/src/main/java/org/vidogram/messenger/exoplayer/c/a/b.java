package org.vidogram.messenger.exoplayer.c.a;

import org.vidogram.messenger.exoplayer.c.f;
import org.vidogram.messenger.exoplayer.c.g;
import org.vidogram.messenger.exoplayer.c.j;
import org.vidogram.messenger.exoplayer.c.l;
import org.vidogram.messenger.exoplayer.f.m;
import org.vidogram.messenger.exoplayer.f.r;

public final class b
  implements org.vidogram.messenger.exoplayer.c.e, l
{
  private static final int d = r.c("FLV");
  public int a;
  public int b;
  public long c;
  private final m e = new m(4);
  private final m g = new m(9);
  private final m h = new m(11);
  private final m i = new m();
  private g j;
  private int k = 1;
  private int l;
  private a m;
  private e n;
  private c o;

  private boolean b(f paramf)
  {
    int i2 = 0;
    if (!paramf.a(this.g.a, 0, 9, true))
      return false;
    this.g.b(0);
    this.g.c(4);
    int i3 = this.g.f();
    if ((i3 & 0x4) != 0);
    for (int i1 = 1; ; i1 = 0)
    {
      if ((i3 & 0x1) != 0)
        i2 = 1;
      if ((i1 != 0) && (this.m == null))
        this.m = new a(this.j.d(8));
      if ((i2 != 0) && (this.n == null))
        this.n = new e(this.j.d(9));
      if (this.o == null)
        this.o = new c(null);
      this.j.f();
      this.j.a(this);
      this.l = (this.g.m() - 9 + 4);
      this.k = 2;
      return true;
    }
  }

  private void c(f paramf)
  {
    paramf.b(this.l);
    this.l = 0;
    this.k = 3;
  }

  private boolean d(f paramf)
  {
    if (!paramf.a(this.h.a, 0, 11, true))
      return false;
    this.h.b(0);
    this.a = this.h.f();
    this.b = this.h.j();
    this.c = this.h.j();
    this.c = ((this.h.f() << 24 | this.c) * 1000L);
    this.h.c(3);
    this.k = 4;
    return true;
  }

  private boolean e(f paramf)
  {
    int i2 = 1;
    int i1;
    if ((this.a == 8) && (this.m != null))
    {
      this.m.b(f(paramf), this.c);
      i1 = i2;
    }
    while (true)
    {
      this.l = 4;
      this.k = 2;
      return i1;
      if ((this.a == 9) && (this.n != null))
      {
        this.n.b(f(paramf), this.c);
        i1 = i2;
        continue;
      }
      if ((this.a == 18) && (this.o != null))
      {
        this.o.b(f(paramf), this.c);
        i1 = i2;
        if (this.o.a() == -1L)
          continue;
        if (this.m != null)
          this.m.a(this.o.a());
        i1 = i2;
        if (this.n == null)
          continue;
        this.n.a(this.o.a());
        i1 = i2;
        continue;
      }
      paramf.b(this.b);
      i1 = 0;
    }
  }

  private m f(f paramf)
  {
    if (this.b > this.i.e())
      this.i.a(new byte[Math.max(this.i.e() * 2, this.b)], 0);
    while (true)
    {
      this.i.a(this.b);
      paramf.b(this.i.a, 0, this.b);
      return this.i;
      this.i.b(0);
    }
  }

  public int a(f paramf, j paramj)
  {
    do
    {
      do
        while (true)
          switch (this.k)
          {
          default:
            break;
          case 1:
            if (b(paramf))
              continue;
            return -1;
          case 2:
            c(paramf);
          case 3:
          case 4:
          }
      while (d(paramf));
      return -1;
    }
    while (!e(paramf));
    return 0;
  }

  public void a(g paramg)
  {
    this.j = paramg;
  }

  public boolean a()
  {
    return false;
  }

  public boolean a(f paramf)
  {
    paramf.c(this.e.a, 0, 3);
    this.e.b(0);
    if (this.e.j() != d);
    do
    {
      do
      {
        return false;
        paramf.c(this.e.a, 0, 2);
        this.e.b(0);
      }
      while ((this.e.g() & 0xFA) != 0);
      paramf.c(this.e.a, 0, 4);
      this.e.b(0);
      int i1 = this.e.m();
      paramf.a();
      paramf.c(i1);
      paramf.c(this.e.a, 0, 4);
      this.e.b(0);
    }
    while (this.e.m() != 0);
    return true;
  }

  public long b(long paramLong)
  {
    return 0L;
  }

  public void b()
  {
    this.k = 1;
    this.l = 0;
  }

  public void c()
  {
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.exoplayer.c.a.b
 * JD-Core Version:    0.6.0
 */