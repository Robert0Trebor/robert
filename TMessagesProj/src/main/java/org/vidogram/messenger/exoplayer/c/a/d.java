package org.vidogram.messenger.exoplayer.c.a;

import org.vidogram.messenger.exoplayer.r;

abstract class d
{
  protected final org.vidogram.messenger.exoplayer.c.m a;
  private long b;

  protected d(org.vidogram.messenger.exoplayer.c.m paramm)
  {
    this.a = paramm;
    this.b = -1L;
  }

  public final long a()
  {
    return this.b;
  }

  public final void a(long paramLong)
  {
    this.b = paramLong;
  }

  protected abstract void a(org.vidogram.messenger.exoplayer.f.m paramm, long paramLong);

  protected abstract boolean a(org.vidogram.messenger.exoplayer.f.m paramm);

  public final void b(org.vidogram.messenger.exoplayer.f.m paramm, long paramLong)
  {
    if (a(paramm))
      a(paramm, paramLong);
  }

  public static final class a extends r
  {
    public a(String paramString)
    {
      super();
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.exoplayer.c.a.d
 * JD-Core Version:    0.6.0
 */