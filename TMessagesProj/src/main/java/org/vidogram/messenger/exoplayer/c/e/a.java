package org.vidogram.messenger.exoplayer.c.e;

import org.vidogram.messenger.exoplayer.MediaFormat;
import org.vidogram.messenger.exoplayer.f.l;

final class a extends e
{
  private final boolean b;
  private final l c;
  private final org.vidogram.messenger.exoplayer.f.m d;
  private int e;
  private int f;
  private boolean g;
  private long h;
  private MediaFormat i;
  private int j;
  private long k;

  public a(org.vidogram.messenger.exoplayer.c.m paramm, boolean paramBoolean)
  {
    super(paramm);
    this.b = paramBoolean;
    this.c = new l(new byte[8]);
    this.d = new org.vidogram.messenger.exoplayer.f.m(this.c.a);
    this.e = 0;
  }

  private boolean a(org.vidogram.messenger.exoplayer.f.m paramm, byte[] paramArrayOfByte, int paramInt)
  {
    int m = Math.min(paramm.b(), paramInt - this.f);
    paramm.a(paramArrayOfByte, this.f, m);
    this.f = (m + this.f);
    return this.f == paramInt;
  }

  private boolean b(org.vidogram.messenger.exoplayer.f.m paramm)
  {
    if (paramm.b() > 0)
    {
      if (!this.g)
      {
        if (paramm.f() == 11);
        for (bool = true; ; bool = false)
        {
          this.g = bool;
          break;
        }
      }
      int m = paramm.f();
      if (m == 119)
      {
        this.g = false;
        return true;
      }
      if (m == 11);
      for (boolean bool = true; ; bool = false)
      {
        this.g = bool;
        break;
      }
    }
    return false;
  }

  private void c()
  {
    MediaFormat localMediaFormat;
    if (this.i == null)
    {
      if (this.b)
      {
        localMediaFormat = org.vidogram.messenger.exoplayer.f.a.b(this.c, null, -1L, null);
        this.i = localMediaFormat;
        this.a.a(this.i);
      }
    }
    else
    {
      if (!this.b)
        break label124;
      m = org.vidogram.messenger.exoplayer.f.a.b(this.c.a);
      label63: this.j = m;
      if (!this.b)
        break label138;
    }
    label138: for (int m = org.vidogram.messenger.exoplayer.f.a.c(this.c.a); ; m = org.vidogram.messenger.exoplayer.f.a.a())
    {
      this.h = (int)(m * 1000000L / this.i.o);
      return;
      localMediaFormat = org.vidogram.messenger.exoplayer.f.a.a(this.c, null, -1L, null);
      break;
      label124: m = org.vidogram.messenger.exoplayer.f.a.a(this.c.a);
      break label63;
    }
  }

  public void a()
  {
    this.e = 0;
    this.f = 0;
    this.g = false;
  }

  public void a(long paramLong, boolean paramBoolean)
  {
    this.k = paramLong;
  }

  public void a(org.vidogram.messenger.exoplayer.f.m paramm)
  {
    while (paramm.b() > 0)
    {
      switch (this.e)
      {
      default:
        break;
      case 0:
        if (!b(paramm))
          continue;
        this.e = 1;
        this.d.a[0] = 11;
        this.d.a[1] = 119;
        this.f = 2;
        break;
      case 1:
        if (!a(paramm, this.d.a, 8))
          continue;
        c();
        this.d.b(0);
        this.a.a(this.d, 8);
        this.e = 2;
        break;
      case 2:
      }
      int m = Math.min(paramm.b(), this.j - this.f);
      this.a.a(paramm, m);
      this.f = (m + this.f);
      if (this.f != this.j)
        continue;
      this.a.a(this.k, 1, this.j, 0, null);
      this.k += this.h;
      this.e = 0;
    }
  }

  public void b()
  {
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.exoplayer.c.e.a
 * JD-Core Version:    0.6.0
 */