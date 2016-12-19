package org.vidogram.messenger.exoplayer.c.b;

import org.vidogram.messenger.exoplayer.f.j;
import org.vidogram.messenger.exoplayer.f.m;
import org.vidogram.messenger.exoplayer.f.r;

final class e
  implements c.a
{
  private final long a;
  private final long b;
  private final long c;
  private final long[] d;
  private final long e;
  private final int g;

  private e(long paramLong1, long paramLong2, long paramLong3)
  {
    this(paramLong1, paramLong2, paramLong3, null, 0L, 0);
  }

  private e(long paramLong1, long paramLong2, long paramLong3, long[] paramArrayOfLong, long paramLong4, int paramInt)
  {
    this.a = paramLong1;
    this.b = paramLong2;
    this.c = paramLong3;
    this.d = paramArrayOfLong;
    this.e = paramLong4;
    this.g = paramInt;
  }

  private long a(int paramInt)
  {
    return this.b * paramInt / 100L;
  }

  public static e a(j paramj, m paramm, long paramLong1, long paramLong2)
  {
    int i = paramj.g;
    int j = paramj.d;
    paramLong1 += paramj.c;
    int k = paramm.m();
    int m;
    if ((k & 0x1) == 1)
    {
      m = paramm.s();
      if (m != 0);
    }
    else
    {
      return null;
    }
    long l1 = r.a(m, i * 1000000L, j);
    if ((k & 0x6) != 6)
      return new e(paramLong1, l1, paramLong2);
    long l2 = paramm.s();
    paramm.c(1);
    long[] arrayOfLong = new long[99];
    i = 0;
    while (i < 99)
    {
      arrayOfLong[i] = paramm.f();
      i += 1;
    }
    return new e(paramLong1, l1, paramLong2, arrayOfLong, l2, paramj.c);
  }

  public long a(long paramLong)
  {
    if ((!a()) || (paramLong < this.a))
      return 0L;
    double d1 = 256.0D * (paramLong - this.a) / this.e;
    int i = r.a(this.d, ()d1, true, false) + 1;
    long l2 = a(i);
    long l1;
    label78: long l3;
    if (i == 0)
    {
      paramLong = 0L;
      if (i != 99)
        break label115;
      l1 = 256L;
      l3 = a(i + 1);
      if (l1 != paramLong)
        break label127;
      paramLong = 0L;
    }
    while (true)
    {
      return l2 + paramLong;
      paramLong = this.d[(i - 1)];
      break;
      label115: l1 = this.d[i];
      break label78;
      label127: paramLong = ()((l3 - l2) * (d1 - paramLong) / (l1 - paramLong));
    }
  }

  public boolean a()
  {
    return this.d != null;
  }

  public long b()
  {
    return this.b;
  }

  public long b(long paramLong)
  {
    float f2 = 256.0F;
    float f3 = 0.0F;
    if (!a())
      return this.a;
    float f4 = (float)paramLong * 100.0F / (float)this.b;
    float f1;
    long l1;
    long l2;
    if (f4 <= 0.0F)
    {
      f1 = 0.0F;
      l1 = Math.round(f1 * 0.00390625D * this.e);
      l2 = this.a;
      if (this.c == -1L)
        break label164;
      paramLong = this.c - 1L;
    }
    while (true)
    {
      return Math.min(l2 + l1, paramLong);
      f1 = f2;
      if (f4 >= 100.0F)
        break;
      int i = (int)f4;
      if (i == 0)
        f1 = f3;
      while (true)
      {
        if (i < 99)
          f2 = (float)this.d[i];
        f1 = (f2 - f1) * (f4 - i) + f1;
        break;
        f1 = (float)this.d[(i - 1)];
      }
      label164: paramLong = this.a - this.g + this.e - 1L;
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.exoplayer.c.b.e
 * JD-Core Version:    0.6.0
 */