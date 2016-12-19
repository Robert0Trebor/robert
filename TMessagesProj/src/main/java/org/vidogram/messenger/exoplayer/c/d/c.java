package org.vidogram.messenger.exoplayer.c.d;

import org.vidogram.messenger.exoplayer.c.f;
import org.vidogram.messenger.exoplayer.f.b;
import org.vidogram.messenger.exoplayer.f.m;
import org.vidogram.messenger.exoplayer.r;

final class c
{
  private final e.b a = new e.b();
  private final m b = new m(282);
  private final e.a c = new e.a();
  private int d = -1;
  private long e;

  public long a(f paramf)
  {
    if (paramf.d() != -1L);
    for (boolean bool = true; ; bool = false)
    {
      b.a(bool);
      e.a(paramf);
      this.a.a();
      while (((this.a.b & 0x4) != 4) && (paramf.c() < paramf.d()))
      {
        e.a(paramf, this.a, this.b, false);
        paramf.b(this.a.h + this.a.i);
      }
    }
    return this.a.c;
  }

  public long a(f paramf, long paramLong)
  {
    e.a(paramf);
    e.a(paramf, this.a, this.b, false);
    while (this.a.c < paramLong)
    {
      paramf.b(this.a.h + this.a.i);
      this.e = this.a.c;
      e.a(paramf, this.a, this.b, false);
    }
    if (this.e == 0L)
      throw new r();
    paramf.a();
    paramLong = this.e;
    this.e = 0L;
    this.d = -1;
    return paramLong;
  }

  public void a()
  {
    this.a.a();
    this.b.a();
    this.d = -1;
  }

  public boolean a(f paramf, m paramm)
  {
    boolean bool;
    if ((paramf != null) && (paramm != null))
      bool = true;
    int i;
    int j;
    int k;
    while (true)
    {
      b.b(bool);
      i = 0;
      if (i != 0)
        break label264;
      if (this.d >= 0)
        break;
      if (!e.a(paramf, this.a, this.b, true))
      {
        return false;
        bool = false;
        continue;
      }
      j = this.a.h;
      if (((this.a.b & 0x1) != 1) || (paramm.c() != 0))
        break label269;
      e.a(this.a, 0, this.c);
      k = this.c.b + 0;
      j += this.c.a;
    }
    while (true)
    {
      paramf.b(j);
      this.d = k;
      e.a(this.a, this.d, this.c);
      j = this.d;
      k = this.c.b + j;
      if (this.c.a > 0)
      {
        paramf.b(paramm.a, paramm.c(), this.c.a);
        paramm.a(paramm.c() + this.c.a);
        if (this.a.j[(k - 1)] != 255)
          i = 1;
      }
      while (true)
      {
        j = k;
        if (k == this.a.g)
          j = -1;
        this.d = j;
        break;
        i = 0;
        continue;
        label264: return true;
      }
      label269: k = 0;
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.exoplayer.c.d.c
 * JD-Core Version:    0.6.0
 */