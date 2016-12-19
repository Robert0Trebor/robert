package org.vidogram.messenger.exoplayer.c.e;

import org.vidogram.messenger.exoplayer.MediaFormat;

final class j extends e
{
  private final org.vidogram.messenger.exoplayer.f.m b = new org.vidogram.messenger.exoplayer.f.m(4);
  private final org.vidogram.messenger.exoplayer.f.j c;
  private int d = 0;
  private int e;
  private boolean f;
  private boolean g;
  private long h;
  private int i;
  private long j;

  public j(org.vidogram.messenger.exoplayer.c.m paramm)
  {
    super(paramm);
    this.b.a[0] = -1;
    this.c = new org.vidogram.messenger.exoplayer.f.j();
  }

  private void b(org.vidogram.messenger.exoplayer.f.m paramm)
  {
    byte[] arrayOfByte = paramm.a;
    int k = paramm.d();
    int n = paramm.c();
    while (k < n)
    {
      boolean bool;
      if ((arrayOfByte[k] & 0xFF) == 255)
      {
        bool = true;
        if ((!this.g) || ((arrayOfByte[k] & 0xE0) != 224))
          break label115;
      }
      label115: for (int m = 1; ; m = 0)
      {
        this.g = bool;
        if (m == 0)
          break label120;
        paramm.b(k + 1);
        this.g = false;
        this.b.a[1] = arrayOfByte[k];
        this.e = 2;
        this.d = 1;
        return;
        bool = false;
        break;
      }
      label120: k += 1;
    }
    paramm.b(n);
  }

  private void c(org.vidogram.messenger.exoplayer.f.m paramm)
  {
    int k = Math.min(paramm.b(), 4 - this.e);
    paramm.a(this.b.a, this.e, k);
    this.e = (k + this.e);
    if (this.e < 4)
      return;
    this.b.b(0);
    if (!org.vidogram.messenger.exoplayer.f.j.a(this.b.m(), this.c))
    {
      this.e = 0;
      this.d = 1;
      return;
    }
    this.i = this.c.c;
    if (!this.f)
    {
      this.h = (1000000L * this.c.g / this.c.d);
      paramm = MediaFormat.a(null, this.c.b, -1, 4096, -1L, this.c.e, this.c.d, null, null);
      this.a.a(paramm);
      this.f = true;
    }
    this.b.b(0);
    this.a.a(this.b, 4);
    this.d = 2;
  }

  private void d(org.vidogram.messenger.exoplayer.f.m paramm)
  {
    int k = Math.min(paramm.b(), this.i - this.e);
    this.a.a(paramm, k);
    this.e = (k + this.e);
    if (this.e < this.i)
      return;
    this.a.a(this.j, 1, this.i, 0, null);
    this.j += this.h;
    this.e = 0;
    this.d = 0;
  }

  public void a()
  {
    this.d = 0;
    this.e = 0;
    this.g = false;
  }

  public void a(long paramLong, boolean paramBoolean)
  {
    this.j = paramLong;
  }

  public void a(org.vidogram.messenger.exoplayer.f.m paramm)
  {
    while (paramm.b() > 0)
    {
      switch (this.d)
      {
      default:
        break;
      case 0:
        b(paramm);
        break;
      case 1:
        c(paramm);
        break;
      case 2:
      }
      d(paramm);
    }
  }

  public void b()
  {
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.exoplayer.c.e.j
 * JD-Core Version:    0.6.0
 */