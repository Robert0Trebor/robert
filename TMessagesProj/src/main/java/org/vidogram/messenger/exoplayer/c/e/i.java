package org.vidogram.messenger.exoplayer.c.e;

import org.vidogram.messenger.exoplayer.MediaFormat;

final class i extends e
{
  private final org.vidogram.messenger.exoplayer.f.m b;
  private boolean c;
  private long d;
  private int e;
  private int f;

  public i(org.vidogram.messenger.exoplayer.c.m paramm)
  {
    super(paramm);
    paramm.a(MediaFormat.a());
    this.b = new org.vidogram.messenger.exoplayer.f.m(10);
  }

  public void a()
  {
    this.c = false;
  }

  public void a(long paramLong, boolean paramBoolean)
  {
    if (!paramBoolean)
      return;
    this.c = true;
    this.d = paramLong;
    this.e = 0;
    this.f = 0;
  }

  public void a(org.vidogram.messenger.exoplayer.f.m paramm)
  {
    if (!this.c)
      return;
    int i = paramm.b();
    if (this.f < 10)
    {
      int j = Math.min(i, 10 - this.f);
      System.arraycopy(paramm.a, paramm.d(), this.b.a, this.f, j);
      if (j + this.f == 10)
      {
        this.b.b(6);
        this.e = (this.b.r() + 10);
      }
    }
    i = Math.min(i, this.e - this.f);
    this.a.a(paramm, i);
    this.f = (i + this.f);
  }

  public void b()
  {
    if ((!this.c) || (this.e == 0) || (this.f != this.e))
      return;
    this.a.a(this.d, 1, this.e, 0, null);
    this.c = false;
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.exoplayer.c.e.i
 * JD-Core Version:    0.6.0
 */