package org.vidogram.messenger.exoplayer.c.b;

import android.util.Pair;
import java.nio.charset.Charset;
import org.vidogram.messenger.exoplayer.c.f;
import org.vidogram.messenger.exoplayer.c.i;
import org.vidogram.messenger.exoplayer.f.m;
import org.vidogram.messenger.exoplayer.f.r;

final class b
{
  private static final int a = r.c("ID3");
  private static final Charset[] b = { Charset.forName("ISO-8859-1"), Charset.forName("UTF-16LE"), Charset.forName("UTF-16BE"), Charset.forName("UTF-8") };

  private static Pair<String, String> a(int paramInt, m paramm)
  {
    label14: String str;
    int i;
    int j;
    if (paramInt == 2)
    {
      if (paramm.b() < 6);
      while (true)
      {
        return null;
        str = paramm.a(3, Charset.forName("US-ASCII"));
        if (str.equals(""))
          continue;
        i = paramm.j();
        if ((i == 0) || (i > paramm.b()))
          continue;
        j = i;
        if (!str.equals("COM"))
          break;
        j = i;
        label69: paramInt = paramm.f();
        if ((paramInt < 0) || (paramInt >= b.length))
          continue;
        paramm = paramm.a(j - 1, b[paramInt]).split("");
        if (paramm.length != 2)
          break label253;
      }
    }
    label163: label245: label247: label253: for (paramm = Pair.create(paramm[0], paramm[1]); ; paramm = null)
    {
      return paramm;
      if (paramm.b() < 10)
        break label14;
      str = paramm.a(4, Charset.forName("US-ASCII"));
      if (str.equals(""))
        break label14;
      if (paramInt == 4)
      {
        i = paramm.r();
        if ((i == 0) || (i > paramm.b() - 2))
          break label245;
        j = paramm.g();
        if (((paramInt != 4) || ((j & 0xC) == 0)) && ((paramInt != 3) || ((j & 0xC0) == 0)))
          break label247;
      }
      for (int k = 1; ; k = 0)
      {
        j = i;
        if (k == 0)
        {
          j = i;
          if (str.equals("COMM"))
            break label69;
          j = i;
        }
        paramm.c(j);
        break;
        i = paramm.s();
        break label163;
        break label14;
      }
    }
  }

  public static i a(f paramf)
  {
    m localm = new m(10);
    Object localObject = null;
    int i = 0;
    paramf.c(localm.a, 0, 10);
    localm.b(0);
    if (localm.j() != a)
    {
      paramf.a();
      paramf.c(i);
      return localObject;
    }
    int j = localm.f();
    int k = localm.f();
    int m = localm.f();
    int n = localm.r();
    if ((localObject == null) && (a(j, k, m, n)))
    {
      localObject = new byte[n];
      paramf.c(localObject, 0, n);
      localObject = a(new m(localObject), j, m);
    }
    while (true)
    {
      i += n + 10;
      break;
      paramf.c(n);
    }
  }

  private static i a(m paramm, int paramInt1, int paramInt2)
  {
    b(paramm, paramInt1, paramInt2);
    paramm.b(0);
    if ((paramInt1 == 3) && ((paramInt2 & 0x40) != 0))
    {
      if (paramm.b() < 4)
        return null;
      paramInt2 = paramm.s();
      if (paramInt2 > paramm.b())
        return null;
      if (paramInt2 >= 6)
      {
        paramm.c(2);
        int i = paramm.s();
        paramm.b(4);
        paramm.a(paramm.c() - i);
        if (paramm.b() < paramInt2)
          return null;
      }
      paramm.c(paramInt2);
    }
    while (true)
    {
      Object localObject = a(paramInt1, paramm);
      if (localObject == null)
        break;
      if (((String)((Pair)localObject).first).length() <= 3)
        continue;
      localObject = i.a(((String)((Pair)localObject).first).substring(3), (String)((Pair)localObject).second);
      if (localObject != null)
      {
        return localObject;
        if ((paramInt1 != 4) || ((paramInt2 & 0x40) == 0))
          continue;
        if (paramm.b() < 4)
          return null;
        paramInt2 = paramm.r();
        if ((paramInt2 < 6) || (paramInt2 > paramm.b() + 4))
          return null;
        paramm.b(paramInt2);
      }
    }
    return (i)null;
  }

  private static void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    paramArrayOfByte[paramInt1] = (byte)(paramInt2 >> 21 & 0x7F);
    paramArrayOfByte[(paramInt1 + 1)] = (byte)(paramInt2 >> 14 & 0x7F);
    paramArrayOfByte[(paramInt1 + 2)] = (byte)(paramInt2 >> 7 & 0x7F);
    paramArrayOfByte[(paramInt1 + 3)] = (byte)(paramInt2 & 0x7F);
  }

  private static boolean a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    return (paramInt2 != 255) && (paramInt1 >= 2) && (paramInt1 <= 4) && (paramInt4 <= 3145728) && ((paramInt1 != 2) || (((paramInt3 & 0x3F) == 0) && ((paramInt3 & 0x40) == 0))) && ((paramInt1 != 3) || ((paramInt3 & 0x1F) == 0)) && ((paramInt1 != 4) || ((paramInt3 & 0xF) == 0));
  }

  private static boolean a(m paramm, boolean paramBoolean)
  {
    paramm.b(0);
    while (paramm.b() >= 10)
    {
      if (paramm.m() == 0)
        return true;
      long l2 = paramm.k();
      long l1 = l2;
      if (!paramBoolean)
      {
        if ((0x808080 & l2) != 0L)
          return false;
        l1 = (l2 >> 24 & 0x7F) << 21 | (l2 & 0x7F | (l2 >> 8 & 0x7F) << 7 | (l2 >> 16 & 0x7F) << 14);
      }
      if (l1 > paramm.b() - 2)
        return false;
      if (((paramm.g() & 0x1) != 0) && (paramm.b() < 4))
        return false;
      paramm.c((int)l1);
    }
    return true;
  }

  private static void b(m paramm, boolean paramBoolean)
  {
    paramm.b(0);
    byte[] arrayOfByte = paramm.a;
    if ((paramm.b() < 10) || (paramm.m() == 0))
      return;
    int i;
    int i3;
    int j;
    if (paramBoolean)
    {
      i = paramm.s();
      i3 = paramm.g();
      if ((i3 & 0x1) == 0)
        break label313;
      j = paramm.d();
      System.arraycopy(arrayOfByte, j + 4, arrayOfByte, j, paramm.b() - 4);
      i -= 4;
      j = i3 & 0xFFFFFFFE;
      paramm.a(paramm.c() - 4);
    }
    while (true)
    {
      int k;
      if ((j & 0x2) != 0)
      {
        k = paramm.d() + 1;
        int n = 0;
        int m = k;
        while (true)
          if (n + 1 < i)
          {
            int i2 = k;
            int i1 = i;
            if ((arrayOfByte[(k - 1)] & 0xFF) == 255)
            {
              i2 = k;
              i1 = i;
              if (arrayOfByte[k] == 0)
              {
                i2 = k + 1;
                i1 = i - 1;
              }
            }
            arrayOfByte[m] = arrayOfByte[i2];
            n += 1;
            m += 1;
            k = i2 + 1;
            i = i1;
            continue;
            i = paramm.r();
            break;
          }
        paramm.a(paramm.c() - (k - m));
        System.arraycopy(arrayOfByte, k, arrayOfByte, m, paramm.b() - k);
        j &= -3;
      }
      while (true)
      {
        if ((j != i3) || (paramBoolean))
        {
          k = paramm.d() - 6;
          a(arrayOfByte, k, i);
          arrayOfByte[(k + 4)] = (byte)(j >> 8);
          arrayOfByte[(k + 5)] = (byte)(j & 0xFF);
        }
        paramm.c(i);
        break;
      }
      label313: j = i3;
    }
  }

  private static boolean b(m paramm, int paramInt1, int paramInt2)
  {
    int j = 0;
    if (paramInt1 != 4)
      if ((paramInt2 & 0x80) != 0)
      {
        byte[] arrayOfByte = paramm.a;
        paramInt2 = arrayOfByte.length;
        paramInt1 = 0;
        while (paramInt1 + 1 < paramInt2)
        {
          int i = paramInt2;
          if ((arrayOfByte[paramInt1] & 0xFF) == 255)
          {
            i = paramInt2;
            if (arrayOfByte[(paramInt1 + 1)] == 0)
            {
              System.arraycopy(arrayOfByte, paramInt1 + 2, arrayOfByte, paramInt1 + 1, paramInt2 - paramInt1 - 2);
              i = paramInt2 - 1;
            }
          }
          paramInt1 += 1;
          paramInt2 = i;
        }
        paramm.a(paramInt2);
      }
    while (true)
    {
      j = 1;
      do
      {
        return j;
        if (!a(paramm, false))
          continue;
        b(paramm, false);
        break;
      }
      while (!a(paramm, true));
      b(paramm, true);
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.exoplayer.c.b.b
 * JD-Core Version:    0.6.0
 */