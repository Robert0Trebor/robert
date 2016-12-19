package org.vidogram.messenger.exoplayer;

import android.os.SystemClock;

final class v
  implements k
{
  private boolean a;
  private long b;
  private long c;

  private long b(long paramLong)
  {
    return SystemClock.elapsedRealtime() * 1000L - paramLong;
  }

  public long a()
  {
    if (this.a)
      return b(this.c);
    return this.b;
  }

  public void a(long paramLong)
  {
    this.b = paramLong;
    this.c = b(paramLong);
  }

  public void b()
  {
    if (!this.a)
    {
      this.a = true;
      this.c = b(this.b);
    }
  }

  public void c()
  {
    if (this.a)
    {
      this.b = b(this.c);
      this.a = false;
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.exoplayer.v
 * JD-Core Version:    0.6.0
 */