package org.vidogram.messenger.exoplayer.c.c;

import org.vidogram.messenger.exoplayer.c.f;
import org.vidogram.messenger.exoplayer.f.m;

final class k
{
  public c a;
  public long b;
  public long c;
  public int d;
  public int[] e;
  public int[] f;
  public long[] g;
  public boolean[] h;
  public boolean i;
  public boolean[] j;
  public int k;
  public m l;
  public boolean m;
  public j n;
  public long o;

  public void a()
  {
    this.d = 0;
    this.o = 0L;
    this.i = false;
    this.m = false;
    this.n = null;
  }

  public void a(int paramInt)
  {
    this.d = paramInt;
    if ((this.e == null) || (this.e.length < this.d))
    {
      paramInt = paramInt * 125 / 100;
      this.e = new int[paramInt];
      this.f = new int[paramInt];
      this.g = new long[paramInt];
      this.h = new boolean[paramInt];
      this.j = new boolean[paramInt];
    }
  }

  public void a(f paramf)
  {
    paramf.b(this.l.a, 0, this.k);
    this.l.b(0);
    this.m = false;
  }

  public void a(m paramm)
  {
    paramm.a(this.l.a, 0, this.k);
    this.l.b(0);
    this.m = false;
  }

  public void b(int paramInt)
  {
    if ((this.l == null) || (this.l.c() < paramInt))
      this.l = new m(paramInt);
    this.k = paramInt;
    this.i = true;
    this.m = true;
  }

  public long c(int paramInt)
  {
    return this.g[paramInt] + this.f[paramInt];
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.exoplayer.c.c.k
 * JD-Core Version:    0.6.0
 */