package org.vidogram.messenger.exoplayer.f;

import org.vidogram.messenger.exoplayer.c.l;

public final class e
{
  private final long[] a;
  private final long[] b;

  private e(long[] paramArrayOfLong1, long[] paramArrayOfLong2)
  {
    this.a = paramArrayOfLong1;
    this.b = paramArrayOfLong2;
  }

  public static e a(m paramm)
  {
    paramm.c(1);
    int j = paramm.j() / 18;
    long[] arrayOfLong1 = new long[j];
    long[] arrayOfLong2 = new long[j];
    int i = 0;
    while (i < j)
    {
      arrayOfLong1[i] = paramm.o();
      arrayOfLong2[i] = paramm.o();
      paramm.c(2);
      i += 1;
    }
    return new e(arrayOfLong1, arrayOfLong2);
  }

  public l a(long paramLong1, long paramLong2)
  {
    return new l(paramLong2, paramLong1)
    {
      public boolean a()
      {
        return true;
      }

      public long b(long paramLong)
      {
        paramLong = this.a * paramLong / 1000000L;
        int i = r.a(e.a(e.this), paramLong, true, true);
        paramLong = this.b;
        return e.b(e.this)[i] + paramLong;
      }
    };
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.exoplayer.f.e
 * JD-Core Version:    0.6.0
 */