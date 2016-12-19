package org.vidogram.messenger.exoplayer.c.b;

final class a
  implements c.a
{
  private final long a;
  private final int b;
  private final long c;

  public a(long paramLong1, int paramInt, long paramLong2)
  {
    this.a = paramLong1;
    this.b = paramInt;
    if (paramLong2 == -1L)
      paramLong1 = l;
    while (true)
    {
      this.c = paramLong1;
      return;
      paramLong1 = a(paramLong2);
    }
  }

  public long a(long paramLong)
  {
    return Math.max(0L, paramLong - this.a) * 1000000L * 8L / this.b;
  }

  public boolean a()
  {
    return this.c != -1L;
  }

  public long b()
  {
    return this.c;
  }

  public long b(long paramLong)
  {
    if (this.c == -1L)
      return 0L;
    return this.a + this.b * paramLong / 8000000L;
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.exoplayer.c.b.a
 * JD-Core Version:    0.6.0
 */