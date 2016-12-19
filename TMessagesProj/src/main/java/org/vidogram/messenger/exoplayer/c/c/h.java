package org.vidogram.messenger.exoplayer.c.c;

import org.vidogram.messenger.exoplayer.c.f;
import org.vidogram.messenger.exoplayer.f.m;
import org.vidogram.messenger.exoplayer.f.r;

final class h
{
  private static final int[] a = { r.c("isom"), r.c("iso2"), r.c("iso3"), r.c("iso4"), r.c("iso5"), r.c("iso6"), r.c("avc1"), r.c("hvc1"), r.c("hev1"), r.c("mp41"), r.c("mp42"), r.c("3g2a"), r.c("3g2b"), r.c("3gr6"), r.c("3gs6"), r.c("3ge6"), r.c("3gg6"), r.c("M4V "), r.c("M4A "), r.c("f4v "), r.c("kddi"), r.c("M4VP"), r.c("qt  "), r.c("MSNV") };

  private static boolean a(int paramInt)
  {
    if (paramInt >>> 8 == r.c("3gp"))
      return true;
    int[] arrayOfInt = a;
    int j = arrayOfInt.length;
    int i = 0;
    while (true)
    {
      if (i >= j)
        break label42;
      if (arrayOfInt[i] == paramInt)
        break;
      i += 1;
    }
    label42: return false;
  }

  public static boolean a(f paramf)
  {
    return a(paramf, true);
  }

  private static boolean a(f paramf, boolean paramBoolean)
  {
    long l2 = paramf.d();
    long l1;
    if (l2 != -1L)
    {
      l1 = l2;
      if (l2 <= 4096L);
    }
    else
    {
      l1 = 4096L;
    }
    int n = (int)l1;
    m localm = new m(64);
    int i = 0;
    boolean bool2 = false;
    int j = 0;
    while (true)
    {
      boolean bool1 = bool2;
      int k;
      int i2;
      int m;
      if (j < n)
      {
        k = 8;
        paramf.c(localm.a, 0, 8);
        localm.b(0);
        l2 = localm.k();
        i2 = localm.m();
        l1 = l2;
        if (l2 == 1L)
        {
          k = 16;
          paramf.c(localm.a, 8, 8);
          l1 = localm.u();
        }
        if (l1 < k)
          return false;
        m = j + k;
        j = m;
        if (i2 == a.A)
          continue;
        if ((i2 != a.J) && (i2 != a.L))
          break label202;
        bool1 = true;
      }
      label202: 
      do
      {
        if ((i == 0) || (paramBoolean != bool1))
          break;
        return true;
        bool1 = bool2;
      }
      while (m + l1 - k >= n);
      int i1 = (int)(l1 - k);
      if (i2 == a.a)
      {
        if (i1 < 8)
          return false;
        if (localm.e() < i1)
          localm.a(new byte[i1], i1);
        paramf.c(localm.a, 0, i1);
        i2 = i1 / 4;
        k = 0;
        j = i;
        if (k < i2)
        {
          if (k == 1)
            localm.c(4);
          do
          {
            k += 1;
            break;
          }
          while (!a(localm.m()));
          j = 1;
        }
        k = j;
        if (j == 0)
          return false;
      }
      else
      {
        k = i;
        if (i1 != 0)
        {
          paramf.c(i1);
          k = i;
        }
      }
      j = m + i1;
      i = k;
    }
    return false;
  }

  public static boolean b(f paramf)
  {
    return a(paramf, false);
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.exoplayer.c.c.h
 * JD-Core Version:    0.6.0
 */