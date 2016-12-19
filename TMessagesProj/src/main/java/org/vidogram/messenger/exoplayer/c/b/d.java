package org.vidogram.messenger.exoplayer.c.b;

import org.vidogram.messenger.exoplayer.f.j;
import org.vidogram.messenger.exoplayer.f.m;
import org.vidogram.messenger.exoplayer.f.r;

final class d
  implements c.a
{
  private final long[] a;
  private final long[] b;
  private final long c;

  private d(long[] paramArrayOfLong1, long[] paramArrayOfLong2, long paramLong)
  {
    this.a = paramArrayOfLong1;
    this.b = paramArrayOfLong2;
    this.c = paramLong;
  }

  public static d a(j paramj, m paramm, long paramLong1, long paramLong2)
  {
    paramm.c(10);
    int i = paramm.m();
    if (i <= 0)
      return null;
    int j = paramj.d;
    long l1 = i;
    if (j >= 32000)
      i = 1152;
    long l2;
    long[] arrayOfLong;
    while (true)
    {
      l2 = r.a(l1, i * 1000000L, j);
      int m = paramm.g();
      int n = paramm.g();
      int i1 = paramm.g();
      paramm.c(2);
      paramLong1 += paramj.c;
      paramj = new long[m + 1];
      arrayOfLong = new long[m + 1];
      paramj[0] = 0L;
      arrayOfLong[0] = paramLong1;
      int k = 1;
      if (k >= paramj.length)
        break;
      switch (i1)
      {
      default:
        return null;
        i = 576;
        break;
      case 1:
        i = paramm.f();
        paramLong1 += i * n;
        paramj[k] = (k * l2 / m);
        if (paramLong2 == -1L)
          l1 = paramLong1;
      case 2:
      case 3:
      case 4:
        while (true)
        {
          label172: arrayOfLong[k] = l1;
          k += 1;
          break;
          i = paramm.g();
          break label172;
          i = paramm.j();
          break label172;
          i = paramm.s();
          break label172;
          l1 = Math.min(paramLong2, paramLong1);
        }
      }
    }
    return new d(paramj, arrayOfLong, l2);
  }

  public long a(long paramLong)
  {
    return this.a[r.a(this.b, paramLong, true, true)];
  }

  public boolean a()
  {
    return true;
  }

  public long b()
  {
    return this.c;
  }

  public long b(long paramLong)
  {
    return this.b[r.a(this.a, paramLong, true, true)];
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.exoplayer.c.b.d
 * JD-Core Version:    0.6.0
 */