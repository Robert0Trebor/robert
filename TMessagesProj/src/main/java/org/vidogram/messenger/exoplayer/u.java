package org.vidogram.messenger.exoplayer;

import java.util.Arrays;

public abstract class u extends w
{
  private final t.a[] a;
  private int[] b;
  private int[] c;
  private t.a d;
  private int e;
  private long f;

  public u(t[] paramArrayOft)
  {
    this.a = new t.a[paramArrayOft.length];
    int i = 0;
    while (i < paramArrayOft.length)
    {
      this.a[i] = paramArrayOft[i].a();
      i += 1;
    }
  }

  private void a(t.a parama)
  {
    try
    {
      parama.b();
      return;
    }
    catch (java.io.IOException parama)
    {
    }
    throw new g(parama);
  }

  private long d(long paramLong)
  {
    long l = this.d.b(this.e);
    if (l != -9223372036854775808L)
    {
      c(l);
      paramLong = l;
    }
    return paramLong;
  }

  protected final int a(long paramLong, q paramq, s params)
  {
    return this.d.a(this.e, paramLong, paramq, params);
  }

  protected final MediaFormat a(int paramInt)
  {
    return this.a[this.b[paramInt]].a(this.c[paramInt]);
  }

  protected void a(int paramInt, long paramLong, boolean paramBoolean)
  {
    paramLong = e(paramLong);
    this.d = this.a[this.b[paramInt]];
    this.e = this.c[paramInt];
    this.d.a(this.e, paramLong);
    c(paramLong);
  }

  protected final void a(long paramLong1, long paramLong2)
  {
    paramLong1 = e(paramLong1);
    boolean bool = this.d.b(this.e, paramLong1);
    a(d(paramLong1), paramLong2, bool);
  }

  protected abstract void a(long paramLong1, long paramLong2, boolean paramBoolean);

  protected final boolean a(long paramLong)
  {
    int j = 1;
    int i = 0;
    while (i < this.a.length)
    {
      j &= this.a[i].a(paramLong);
      i += 1;
    }
    if (j == 0)
      return false;
    j = 0;
    i = 0;
    while (i < this.a.length)
    {
      j += this.a[i].c();
      i += 1;
    }
    int[] arrayOfInt1 = new int[k];
    int[] arrayOfInt2 = new int[k];
    int i1 = this.a.length;
    i = 0;
    long l1 = 0L;
    int k = 0;
    while (k < i1)
    {
      t.a locala = this.a[k];
      int i2 = locala.c();
      int m = 0;
      if (m < i2)
      {
        MediaFormat localMediaFormat = locala.a(m);
        while (true)
        {
          try
          {
            boolean bool = a(localMediaFormat);
            n = i;
            paramLong = l1;
            if (!bool)
              continue;
            arrayOfInt1[i] = k;
            arrayOfInt2[i] = m;
            i += 1;
            if (l1 == -1L)
            {
              paramLong = l1;
              n = i;
              m += 1;
              i = n;
              l1 = paramLong;
            }
          }
          catch (o.b localb)
          {
            throw new g(localb);
          }
          long l2 = localMediaFormat.e;
          if (l2 == -1L)
          {
            paramLong = -1L;
            n = i;
            continue;
          }
          int n = i;
          paramLong = l1;
          if (l2 == -2L)
            continue;
          paramLong = Math.max(l1, l2);
          n = i;
        }
      }
      k += 1;
    }
    this.f = l1;
    this.b = Arrays.copyOf(localb, i);
    this.c = Arrays.copyOf(arrayOfInt2, i);
    return true;
  }

  protected abstract boolean a(MediaFormat paramMediaFormat);

  protected final void b(long paramLong)
  {
    paramLong = e(paramLong);
    this.d.b(paramLong);
    d(paramLong);
  }

  protected abstract void c(long paramLong);

  protected final int c_()
  {
    return this.c.length;
  }

  protected void d()
  {
    if (this.d != null)
      a(this.d);
    while (true)
    {
      return;
      int j = this.a.length;
      int i = 0;
      while (i < j)
      {
        a(this.a[i]);
        i += 1;
      }
    }
  }

  protected long e()
  {
    return this.f;
  }

  protected long e(long paramLong)
  {
    return paramLong;
  }

  protected long f()
  {
    return this.d.d();
  }

  protected void j()
  {
    this.d.c(this.e);
    this.d = null;
  }

  protected void t()
  {
    int j = this.a.length;
    int i = 0;
    while (i < j)
    {
      this.a[i].e();
      i += 1;
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.exoplayer.u
 * JD-Core Version:    0.6.0
 */