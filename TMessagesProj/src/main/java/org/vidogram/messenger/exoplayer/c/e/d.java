package org.vidogram.messenger.exoplayer.c.e;

import org.vidogram.messenger.exoplayer.MediaFormat;

final class d extends e
{
  private final org.vidogram.messenger.exoplayer.f.m b = new org.vidogram.messenger.exoplayer.f.m(new byte[15]);
  private int c;
  private int d;
  private int e;
  private long f;
  private MediaFormat g;
  private int h;
  private long i;

  public d(org.vidogram.messenger.exoplayer.c.m paramm)
  {
    super(paramm);
    this.b.a[0] = 127;
    this.b.a[1] = -2;
    this.b.a[2] = -128;
    this.b.a[3] = 1;
    this.c = 0;
  }

  private boolean a(org.vidogram.messenger.exoplayer.f.m paramm, byte[] paramArrayOfByte, int paramInt)
  {
    int j = Math.min(paramm.b(), paramInt - this.d);
    paramm.a(paramArrayOfByte, this.d, j);
    this.d = (j + this.d);
    return this.d == paramInt;
  }

  private boolean b(org.vidogram.messenger.exoplayer.f.m paramm)
  {
    int k = 0;
    int j;
    while (true)
    {
      j = k;
      if (paramm.b() <= 0)
        break;
      this.e <<= 8;
      this.e |= paramm.f();
      if (this.e != 2147385345)
        continue;
      this.e = 0;
      j = 1;
    }
    return j;
  }

  private void c()
  {
    byte[] arrayOfByte = this.b.a;
    if (this.g == null)
    {
      this.g = org.vidogram.messenger.exoplayer.f.d.a(arrayOfByte, null, -1L, null);
      this.a.a(this.g);
    }
    this.h = org.vidogram.messenger.exoplayer.f.d.b(arrayOfByte);
    this.f = (int)(org.vidogram.messenger.exoplayer.f.d.a(arrayOfByte) * 1000000L / this.g.o);
  }

  public void a()
  {
    this.c = 0;
    this.d = 0;
    this.e = 0;
  }

  public void a(long paramLong, boolean paramBoolean)
  {
    this.i = paramLong;
  }

  public void a(org.vidogram.messenger.exoplayer.f.m paramm)
  {
    while (paramm.b() > 0)
    {
      switch (this.c)
      {
      default:
        break;
      case 0:
        if (!b(paramm))
          continue;
        this.d = 4;
        this.c = 1;
        break;
      case 1:
        if (!a(paramm, this.b.a, 15))
          continue;
        c();
        this.b.b(0);
        this.a.a(this.b, 15);
        this.c = 2;
        break;
      case 2:
      }
      int j = Math.min(paramm.b(), this.h - this.d);
      this.a.a(paramm, j);
      this.d = (j + this.d);
      if (this.d != this.h)
        continue;
      this.a.a(this.i, 1, this.h, 0, null);
      this.i += this.f;
      this.c = 0;
    }
  }

  public void b()
  {
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.exoplayer.c.e.d
 * JD-Core Version:    0.6.0
 */