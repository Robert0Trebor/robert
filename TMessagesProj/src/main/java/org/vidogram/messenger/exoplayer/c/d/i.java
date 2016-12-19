package org.vidogram.messenger.exoplayer.c.d;

import android.util.Log;
import java.util.Arrays;
import org.vidogram.messenger.exoplayer.f.m;
import org.vidogram.messenger.exoplayer.r;

final class i
{
  public static int a(int paramInt)
  {
    int i = 0;
    while (paramInt > 0)
    {
      i += 1;
      paramInt >>>= 1;
    }
    return i;
  }

  private static long a(long paramLong1, long paramLong2)
  {
    return ()Math.floor(Math.pow(paramLong1, 1.0D / paramLong2));
  }

  public static d a(m paramm)
  {
    a(1, paramm, false);
    long l1 = paramm.l();
    int i = paramm.f();
    long l2 = paramm.l();
    int j = paramm.n();
    int k = paramm.n();
    int m = paramm.n();
    int i1 = paramm.f();
    int n = (int)Math.pow(2.0D, i1 & 0xF);
    i1 = (int)Math.pow(2.0D, (i1 & 0xF0) >> 4);
    if ((paramm.f() & 0x1) > 0);
    for (boolean bool = true; ; bool = false)
      return new d(l1, i, l2, j, k, m, n, i1, bool, Arrays.copyOf(paramm.a, paramm.c()));
  }

  private static void a(int paramInt, g paramg)
  {
    int m = paramg.a(6);
    int i = 0;
    if (i < m + 1)
    {
      int j = paramg.a(16);
      switch (j)
      {
      default:
        Log.e("VorbisUtil", "mapping type other than 0 not supported: " + j);
      case 0:
      }
      while (true)
      {
        i += 1;
        break;
        if (paramg.a());
        for (j = paramg.a(4) + 1; paramg.a(); j = 1)
        {
          int n = paramg.a(8);
          k = 0;
          while (k < n + 1)
          {
            paramg.b(a(paramInt - 1));
            paramg.b(a(paramInt - 1));
            k += 1;
          }
        }
        if (paramg.a(2) != 0)
          throw new r("to reserved bits must be zero after mapping coupling steps");
        if (j > 1)
        {
          k = 0;
          while (k < paramInt)
          {
            paramg.b(4);
            k += 1;
          }
        }
        int k = 0;
        while (k < j)
        {
          paramg.b(8);
          paramg.b(8);
          paramg.b(8);
          k += 1;
        }
      }
    }
  }

  public static boolean a(int paramInt, m paramm, boolean paramBoolean)
  {
    if (paramm.f() != paramInt)
      if (!paramBoolean);
    while (true)
    {
      return false;
      throw new r("expected header type " + Integer.toHexString(paramInt));
      if ((paramm.f() == 118) && (paramm.f() == 111) && (paramm.f() == 114) && (paramm.f() == 98) && (paramm.f() == 105) && (paramm.f() == 115))
        break;
      if (paramBoolean)
        continue;
      throw new r("expected characters 'vorbis'");
    }
    return true;
  }

  private static c[] a(g paramg)
  {
    int j = paramg.a(6) + 1;
    c[] arrayOfc = new c[j];
    int i = 0;
    while (i < j)
    {
      arrayOfc[i] = new c(paramg.a(), paramg.a(16), paramg.a(16), paramg.a(8));
      i += 1;
    }
    return arrayOfc;
  }

  public static c[] a(m paramm, int paramInt)
  {
    int j = 0;
    a(5, paramm, false);
    int k = paramm.f();
    g localg = new g(paramm.a);
    localg.b(paramm.d() * 8);
    int i = 0;
    while (i < k + 1)
    {
      d(localg);
      i += 1;
    }
    k = localg.a(6);
    i = j;
    while (i < k + 1)
    {
      if (localg.a(16) != 0)
        throw new r("placeholder of time domain transforms not zeroed out");
      i += 1;
    }
    c(localg);
    b(localg);
    a(paramInt, localg);
    paramm = a(localg);
    if (!localg.a())
      throw new r("framing bit after modes not set as expected");
    return paramm;
  }

  public static b b(m paramm)
  {
    int i = 0;
    a(3, paramm, false);
    String str = paramm.d((int)paramm.l());
    int j = str.length();
    long l = paramm.l();
    String[] arrayOfString = new String[(int)l];
    j = j + 11 + 4;
    while (i < l)
    {
      arrayOfString[i] = paramm.d((int)paramm.l());
      j = j + 4 + arrayOfString[i].length();
      i += 1;
    }
    if ((paramm.f() & 0x1) == 0)
      throw new r("framing bit expected to be set");
    return new b(str, arrayOfString, j + 1);
  }

  private static void b(g paramg)
  {
    int m = paramg.a(6);
    int i = 0;
    int n;
    int[] arrayOfInt;
    int j;
    label80: int i1;
    if (i < m + 1)
    {
      if (paramg.a(16) > 2)
        throw new r("residueType greater than 2 is not decodable");
      paramg.b(24);
      paramg.b(24);
      paramg.b(24);
      n = paramg.a(6) + 1;
      paramg.b(8);
      arrayOfInt = new int[n];
      j = 0;
      if (j < n)
      {
        i1 = paramg.a(3);
        if (!paramg.a())
          break label179;
      }
    }
    label179: for (int k = paramg.a(5); ; k = 0)
    {
      arrayOfInt[j] = (k * 8 + i1);
      j += 1;
      break label80;
      j = 0;
      while (j < n)
      {
        k = 0;
        while (k < 8)
        {
          if ((arrayOfInt[j] & 1 << k) != 0)
            paramg.b(8);
          k += 1;
        }
        j += 1;
      }
      i += 1;
      break;
      return;
    }
  }

  private static void c(g paramg)
  {
    int n = paramg.a(6);
    int i = 0;
    while (i < n + 1)
    {
      int j = paramg.a(16);
      int k;
      switch (j)
      {
      default:
        throw new r("floor type greater than 1 not decodable: " + j);
      case 0:
        paramg.b(8);
        paramg.b(16);
        paramg.b(16);
        paramg.b(6);
        paramg.b(8);
        k = paramg.a(4);
        j = 0;
      case 1:
      }
      while (j < k + 1)
      {
        paramg.b(8);
        j += 1;
        continue;
        int i1 = paramg.a(5);
        k = -1;
        int[] arrayOfInt1 = new int[i1];
        j = 0;
        while (j < i1)
        {
          arrayOfInt1[j] = paramg.a(4);
          m = k;
          if (arrayOfInt1[j] > k)
            m = arrayOfInt1[j];
          j += 1;
          k = m;
        }
        int[] arrayOfInt2 = new int[k + 1];
        j = 0;
        while (j < arrayOfInt2.length)
        {
          arrayOfInt2[j] = (paramg.a(3) + 1);
          m = paramg.a(2);
          if (m > 0)
            paramg.b(8);
          k = 0;
          while (k < 1 << m)
          {
            paramg.b(8);
            k += 1;
          }
          j += 1;
        }
        paramg.b(2);
        int i2 = paramg.a(4);
        k = 0;
        j = 0;
        int m = 0;
        while (j < i1)
        {
          m += arrayOfInt2[arrayOfInt1[j]];
          while (k < m)
          {
            paramg.b(i2);
            k += 1;
          }
          j += 1;
        }
      }
      i += 1;
    }
  }

  private static a d(g paramg)
  {
    int i = 0;
    if (paramg.a(24) != 5653314)
      throw new r("expected code book to start with [0x56, 0x43, 0x42] at " + paramg.b());
    int n = paramg.a(16);
    int i1 = paramg.a(24);
    long[] arrayOfLong = new long[i1];
    boolean bool1 = paramg.a();
    int k;
    if (!bool1)
    {
      boolean bool2 = paramg.a();
      if (i < arrayOfLong.length)
      {
        if (bool2)
          if (paramg.a())
            arrayOfLong[i] = (paramg.a(5) + 1);
        while (true)
        {
          i += 1;
          break;
          arrayOfLong[i] = 0L;
          continue;
          arrayOfLong[i] = (paramg.a(5) + 1);
        }
      }
    }
    else
    {
      i = paramg.a(5) + 1;
      int j = 0;
      while (j < arrayOfLong.length)
      {
        int i2 = paramg.a(a(i1 - j));
        int m = 0;
        while ((m < i2) && (j < arrayOfLong.length))
        {
          arrayOfLong[j] = i;
          m += 1;
          j += 1;
        }
        i += 1;
      }
    }
    i = paramg.a(4);
    if (i > 2)
      throw new r("lookup type greater than 2 not decodable: " + i);
    long l;
    if ((i == 1) || (i == 2))
    {
      paramg.b(32);
      paramg.b(32);
      k = paramg.a(4);
      paramg.b(1);
      if (i != 1)
        break label339;
      if (n == 0)
        break label333;
      l = a(i1, n);
    }
    while (true)
    {
      paramg.b((int)(l * (k + 1)));
      return new a(n, i1, arrayOfLong, i, bool1);
      label333: l = 0L;
      continue;
      label339: l = i1 * n;
    }
  }

  public static final class a
  {
    public final int a;
    public final int b;
    public final long[] c;
    public final int d;
    public final boolean e;

    public a(int paramInt1, int paramInt2, long[] paramArrayOfLong, int paramInt3, boolean paramBoolean)
    {
      this.a = paramInt1;
      this.b = paramInt2;
      this.c = paramArrayOfLong;
      this.d = paramInt3;
      this.e = paramBoolean;
    }
  }

  public static final class b
  {
    public final String a;
    public final String[] b;
    public final int c;

    public b(String paramString, String[] paramArrayOfString, int paramInt)
    {
      this.a = paramString;
      this.b = paramArrayOfString;
      this.c = paramInt;
    }
  }

  public static final class c
  {
    public final boolean a;
    public final int b;
    public final int c;
    public final int d;

    public c(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3)
    {
      this.a = paramBoolean;
      this.b = paramInt1;
      this.c = paramInt2;
      this.d = paramInt3;
    }
  }

  public static final class d
  {
    public final long a;
    public final int b;
    public final long c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final boolean i;
    public final byte[] j;

    public d(long paramLong1, int paramInt1, long paramLong2, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, boolean paramBoolean, byte[] paramArrayOfByte)
    {
      this.a = paramLong1;
      this.b = paramInt1;
      this.c = paramLong2;
      this.d = paramInt2;
      this.e = paramInt3;
      this.f = paramInt4;
      this.g = paramInt5;
      this.h = paramInt6;
      this.i = paramBoolean;
      this.j = paramArrayOfByte;
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.exoplayer.c.d.i
 * JD-Core Version:    0.6.0
 */