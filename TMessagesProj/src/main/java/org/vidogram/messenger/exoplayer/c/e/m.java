package org.vidogram.messenger.exoplayer.c.e;

public final class m
{
  private final long a;
  private long b;
  private volatile long c;

  public m(long paramLong)
  {
    this.a = paramLong;
    this.c = -9223372036854775808L;
  }

  public static long b(long paramLong)
  {
    return 1000000L * paramLong / 90000L;
  }

  public long a(long paramLong)
  {
    long l1;
    if (this.c != -9223372036854775808L)
    {
      long l2 = (this.c + 4294967296L) / 8589934592L;
      l1 = (l2 - 1L) * 8589934592L + paramLong;
      paramLong = l2 * 8589934592L + paramLong;
      if (Math.abs(l1 - this.c) < Math.abs(paramLong - this.c))
        paramLong = l1;
    }
    while (true)
    {
      l1 = b(paramLong);
      if ((this.a != 9223372036854775807L) && (this.c == -9223372036854775808L))
        this.b = (this.a - l1);
      this.c = paramLong;
      return this.b + l1;
      continue;
    }
  }

  public void a()
  {
    this.c = -9223372036854775808L;
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.exoplayer.c.e.m
 * JD-Core Version:    0.6.0
 */