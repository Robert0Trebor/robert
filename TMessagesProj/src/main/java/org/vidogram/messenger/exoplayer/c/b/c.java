package org.vidogram.messenger.exoplayer.c.b;

import org.vidogram.messenger.exoplayer.MediaFormat;
import org.vidogram.messenger.exoplayer.c.f;
import org.vidogram.messenger.exoplayer.c.g;
import org.vidogram.messenger.exoplayer.c.i;
import org.vidogram.messenger.exoplayer.c.l;

public final class c
  implements org.vidogram.messenger.exoplayer.c.e
{
  private static final int a = org.vidogram.messenger.exoplayer.f.r.c("Xing");
  private static final int b = org.vidogram.messenger.exoplayer.f.r.c("Info");
  private static final int c = org.vidogram.messenger.exoplayer.f.r.c("VBRI");
  private final long d;
  private final org.vidogram.messenger.exoplayer.f.m e;
  private final org.vidogram.messenger.exoplayer.f.j f;
  private g g;
  private org.vidogram.messenger.exoplayer.c.m h;
  private int i;
  private i j;
  private a k;
  private long l;
  private long m;
  private int n;

  public c()
  {
    this(-1L);
  }

  public c(long paramLong)
  {
    this.d = paramLong;
    this.e = new org.vidogram.messenger.exoplayer.f.m(4);
    this.f = new org.vidogram.messenger.exoplayer.f.j();
    this.l = -1L;
  }

  private boolean a(f paramf, boolean paramBoolean)
  {
    paramf.a();
    int i4;
    int i2;
    int i3;
    int i1;
    if (paramf.c() == 0L)
    {
      this.j = b.a(paramf);
      i4 = (int)paramf.b();
      if (!paramBoolean)
        paramf.b(i4);
      i2 = 0;
      i3 = 0;
      i1 = 0;
    }
    while (true)
    {
      if ((paramBoolean) && (i1 == 4096));
      do
      {
        return false;
        if ((paramBoolean) || (i1 != 131072))
          continue;
        throw new org.vidogram.messenger.exoplayer.r("Searched too many bytes.");
      }
      while (!paramf.b(this.e.a, 0, 4, true));
      this.e.b(0);
      int i5 = this.e.m();
      int i6;
      if ((i2 == 0) || ((i5 & 0xFFFE0C00) == (i2 & 0xFFFE0C00)))
      {
        i6 = org.vidogram.messenger.exoplayer.f.j.a(i5);
        if (i6 != -1);
      }
      else
      {
        i3 = i1 + 1;
        if (paramBoolean)
        {
          paramf.a();
          paramf.c(i4 + i3);
          i2 = 0;
        }
        for (i1 = 0; ; i1 = 0)
        {
          i5 = i3;
          i3 = i2;
          i2 = i1;
          i1 = i5;
          break;
          paramf.b(1);
          i2 = 0;
        }
      }
      i3 += 1;
      if (i3 == 1)
      {
        org.vidogram.messenger.exoplayer.f.j.a(i5, this.f);
        i2 = i5;
      }
      while (true)
      {
        paramf.c(i6 - 4);
        i5 = i1;
        i1 = i2;
        i2 = i3;
        i3 = i5;
        break;
        if (i3 == 4)
        {
          if (paramBoolean)
            paramf.b(i4 + i1);
          while (true)
          {
            this.i = i2;
            return true;
            paramf.a();
          }
        }
      }
      i4 = 0;
      i2 = 0;
      i3 = 0;
      i1 = 0;
    }
  }

  private int b(f paramf)
  {
    int i1 = 0;
    if (this.n == 0)
      if (!c(paramf))
        i1 = -1;
    do
    {
      return i1;
      if (this.l == -1L)
      {
        this.l = this.k.a(paramf.c());
        if (this.d != -1L)
        {
          l1 = this.k.a(0L);
          l2 = this.l;
          this.l = (this.d - l1 + l2);
        }
      }
      this.n = this.f.c;
      int i2 = this.h.a(paramf, this.n, true);
      if (i2 == -1)
        return -1;
      this.n -= i2;
    }
    while (this.n > 0);
    long l1 = this.l;
    long l2 = this.m * 1000000L / this.f.d;
    this.h.a(l2 + l1, 1, this.f.c, 0, null);
    this.m += this.f.g;
    this.n = 0;
    return 0;
  }

  private boolean c(f paramf)
  {
    paramf.a();
    if (!paramf.b(this.e.a, 0, 4, true))
      return false;
    this.e.b(0);
    int i1 = this.e.m();
    if (((i1 & 0xFFFE0C00) == (this.i & 0xFFFE0C00)) && (org.vidogram.messenger.exoplayer.f.j.a(i1) != -1))
    {
      org.vidogram.messenger.exoplayer.f.j.a(i1, this.f);
      return true;
    }
    this.i = 0;
    paramf.b(1);
    return d(paramf);
  }

  private boolean d(f paramf)
  {
    try
    {
      boolean bool = a(paramf, false);
      return bool;
    }
    catch (java.io.EOFException paramf)
    {
    }
    return false;
  }

  private void e(f paramf)
  {
    int i1 = 21;
    org.vidogram.messenger.exoplayer.f.m localm = new org.vidogram.messenger.exoplayer.f.m(this.f.c);
    paramf.c(localm.a, 0, this.f.c);
    long l1 = paramf.c();
    long l2 = paramf.d();
    if ((this.f.a & 0x1) != 0)
    {
      if (this.f.e != 1)
        i1 = 36;
      localm.b(i1);
      int i2 = localm.m();
      if ((i2 != a) && (i2 != b))
        break label299;
      this.k = e.a(this.f, localm, l1, l2);
      if ((this.k != null) && (this.j == null))
      {
        paramf.a();
        paramf.c(i1 + 141);
        paramf.c(this.e.a, 0, 3);
        this.e.b(0);
        this.j = i.a(this.e.j());
      }
      paramf.b(this.f.c);
    }
    while (true)
    {
      if (this.k == null)
      {
        paramf.a();
        paramf.c(this.e.a, 0, 4);
        this.e.b(0);
        org.vidogram.messenger.exoplayer.f.j.a(this.e.m(), this.f);
        this.k = new a(paramf.c(), this.f.f, l2);
      }
      return;
      if (this.f.e != 1)
        break;
      i1 = 13;
      break;
      label299: localm.b(36);
      if (localm.m() != c)
        continue;
      this.k = d.a(this.f, localm, l1, l2);
      paramf.b(this.f.c);
    }
  }

  public int a(f paramf, org.vidogram.messenger.exoplayer.c.j paramj)
  {
    if ((this.i == 0) && (!d(paramf)))
      return -1;
    if (this.k == null)
    {
      e(paramf);
      this.g.a(this.k);
      MediaFormat localMediaFormat = MediaFormat.a(null, this.f.b, -1, 4096, this.k.b(), this.f.e, this.f.d, null, null);
      paramj = localMediaFormat;
      if (this.j != null)
        paramj = localMediaFormat.a(this.j.a, this.j.b);
      this.h.a(paramj);
    }
    return b(paramf);
  }

  public void a(g paramg)
  {
    this.g = paramg;
    this.h = paramg.d(0);
    paramg.f();
  }

  public boolean a(f paramf)
  {
    return a(paramf, true);
  }

  public void b()
  {
    this.i = 0;
    this.m = 0L;
    this.l = -1L;
    this.n = 0;
  }

  public void c()
  {
  }

  static abstract interface a extends l
  {
    public abstract long a(long paramLong);

    public abstract long b();
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.exoplayer.c.b.c
 * JD-Core Version:    0.6.0
 */