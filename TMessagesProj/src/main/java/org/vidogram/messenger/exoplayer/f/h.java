package org.vidogram.messenger.exoplayer.f;

import java.util.Arrays;

public final class h
{
  private int a;
  private long[] b;

  public h()
  {
    this(32);
  }

  public h(int paramInt)
  {
    this.b = new long[paramInt];
  }

  public int a()
  {
    return this.a;
  }

  public long a(int paramInt)
  {
    if ((paramInt < 0) || (paramInt >= this.a))
      throw new IndexOutOfBoundsException("Invalid size " + paramInt + ", size is " + this.a);
    return this.b[paramInt];
  }

  public void a(long paramLong)
  {
    if (this.a == this.b.length)
      this.b = Arrays.copyOf(this.b, this.a * 2);
    long[] arrayOfLong = this.b;
    int i = this.a;
    this.a = (i + 1);
    arrayOfLong[i] = paramLong;
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.exoplayer.f.h
 * JD-Core Version:    0.6.0
 */