package org.vidogram.messenger.exoplayer.c;

import org.vidogram.messenger.exoplayer.f.r;

public final class a
  implements l
{
  public final int a;
  public final int[] b;
  public final long[] c;
  public final long[] d;
  public final long[] e;

  public a(int[] paramArrayOfInt, long[] paramArrayOfLong1, long[] paramArrayOfLong2, long[] paramArrayOfLong3)
  {
    this.a = paramArrayOfInt.length;
    this.b = paramArrayOfInt;
    this.c = paramArrayOfLong1;
    this.d = paramArrayOfLong2;
    this.e = paramArrayOfLong3;
  }

  public int a(long paramLong)
  {
    return r.a(this.e, paramLong, true, true);
  }

  public boolean a()
  {
    return true;
  }

  public long b(long paramLong)
  {
    return this.c[a(paramLong)];
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.exoplayer.c.a
 * JD-Core Version:    0.6.0
 */