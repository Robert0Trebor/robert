package org.vidogram.messenger.exoplayer.c.c;

import org.vidogram.messenger.exoplayer.f.r;

final class d
{
  public static a a(int paramInt, long[] paramArrayOfLong, int[] paramArrayOfInt, long paramLong)
  {
    int i2 = 8192 / paramInt;
    int k = paramArrayOfInt.length;
    int j = 0;
    for (int i = 0; j < k; i = m + i)
    {
      m = r.a(paramArrayOfInt[j], i2);
      j += 1;
    }
    long[] arrayOfLong1 = new long[i];
    int[] arrayOfInt1 = new int[i];
    long[] arrayOfLong2 = new long[i];
    int[] arrayOfInt2 = new int[i];
    int m = 0;
    j = 0;
    k = 0;
    i = 0;
    while (m < paramArrayOfInt.length)
    {
      int n = paramArrayOfInt[m];
      long l = paramArrayOfLong[m];
      int i1 = k;
      k = j;
      j = i1;
      while (n > 0)
      {
        i1 = Math.min(i2, n);
        arrayOfLong1[i] = l;
        arrayOfInt1[i] = (paramInt * i1);
        k = Math.max(k, arrayOfInt1[i]);
        arrayOfLong2[i] = (j * paramLong);
        arrayOfInt2[i] = 1;
        l += arrayOfInt1[i];
        i += 1;
        n -= i1;
        j += i1;
      }
      m += 1;
      n = k;
      k = j;
      j = n;
    }
    return new a(arrayOfLong1, arrayOfInt1, j, arrayOfLong2, arrayOfInt2);
  }

  public static final class a
  {
    public final long[] a;
    public final int[] b;
    public final int c;
    public final long[] d;
    public final int[] e;

    public a(long[] paramArrayOfLong1, int[] paramArrayOfInt1, int paramInt, long[] paramArrayOfLong2, int[] paramArrayOfInt2)
    {
      this.a = paramArrayOfLong1;
      this.b = paramArrayOfInt1;
      this.c = paramInt;
      this.d = paramArrayOfLong2;
      this.e = paramArrayOfInt2;
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.exoplayer.c.c.d
 * JD-Core Version:    0.6.0
 */