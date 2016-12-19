package org.vidogram.messenger.exoplayer.f;

import android.util.Log;
import java.nio.ByteBuffer;
import java.util.Arrays;

public final class k
{
  public static final byte[] a = { 0, 0, 0, 1 };
  public static final float[] b = { 1.0F, 1.0F, 1.090909F, 0.9090909F, 1.454546F, 1.212121F, 2.181818F, 1.818182F, 2.909091F, 2.424243F, 1.636364F, 1.363636F, 1.939394F, 1.616162F, 1.333333F, 1.5F, 2.0F };
  private static final Object c = new Object();
  private static int[] d = new int[10];

  public static int a(byte[] paramArrayOfByte, int paramInt)
  {
    int k = 0;
    Object localObject = c;
    monitorenter;
    int j = 0;
    int i = 0;
    if (i < paramInt);
    while (true)
    {
      try
      {
        i = a(paramArrayOfByte, i, paramInt);
        if (i < paramInt)
        {
          if (d.length > j)
            continue;
          d = Arrays.copyOf(d, d.length * 2);
          d[j] = i;
          j += 1;
          i += 3;
          break;
          if (paramInt >= j)
            continue;
          m = d[paramInt] - i;
          System.arraycopy(paramArrayOfByte, i, paramArrayOfByte, k, m);
          k += m;
          int i1 = k + 1;
          paramArrayOfByte[k] = 0;
          k = i1 + 1;
          paramArrayOfByte[i1] = 0;
          i += m + 3;
          paramInt += 1;
          continue;
          System.arraycopy(paramArrayOfByte, i, paramArrayOfByte, k, n - k);
          return n;
        }
      }
      finally
      {
        monitorexit;
      }
      break;
      int n = paramInt - j;
      int m = 0;
      i = 0;
      paramInt = k;
      k = m;
    }
  }

  private static int a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    while (true)
    {
      int i = paramInt2;
      if (paramInt1 < paramInt2 - 2)
      {
        if ((paramArrayOfByte[paramInt1] == 0) && (paramArrayOfByte[(paramInt1 + 1)] == 0) && (paramArrayOfByte[(paramInt1 + 2)] == 3))
          i = paramInt1;
      }
      else
        return i;
      paramInt1 += 1;
    }
  }

  public static int a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, boolean[] paramArrayOfBoolean)
  {
    boolean bool2 = true;
    int i = paramInt2 - paramInt1;
    if (i >= 0)
    {
      bool1 = true;
      b.b(bool1);
      if (i != 0)
        break label34;
    }
    label34: 
    do
    {
      return paramInt2;
      bool1 = false;
      break;
      if (paramArrayOfBoolean != null)
      {
        if (paramArrayOfBoolean[0] != 0)
        {
          a(paramArrayOfBoolean);
          return paramInt1 - 3;
        }
        if ((i > 1) && (paramArrayOfBoolean[1] != 0) && (paramArrayOfByte[paramInt1] == 1))
        {
          a(paramArrayOfBoolean);
          return paramInt1 - 2;
        }
        if ((i > 2) && (paramArrayOfBoolean[2] != 0) && (paramArrayOfByte[paramInt1] == 0) && (paramArrayOfByte[(paramInt1 + 1)] == 1))
        {
          a(paramArrayOfBoolean);
          return paramInt1 - 1;
        }
      }
      paramInt1 += 2;
      if (paramInt1 >= paramInt2 - 1)
        continue;
      if ((paramArrayOfByte[paramInt1] & 0xFE) != 0);
      while (true)
      {
        paramInt1 += 3;
        break;
        if ((paramArrayOfByte[(paramInt1 - 2)] == 0) && (paramArrayOfByte[(paramInt1 - 1)] == 0) && (paramArrayOfByte[paramInt1] == 1))
        {
          if (paramArrayOfBoolean != null)
            a(paramArrayOfBoolean);
          return paramInt1 - 2;
        }
        paramInt1 -= 2;
      }
    }
    while (paramArrayOfBoolean == null);
    if (i > 2)
      if ((paramArrayOfByte[(paramInt2 - 3)] == 0) && (paramArrayOfByte[(paramInt2 - 2)] == 0) && (paramArrayOfByte[(paramInt2 - 1)] == 1))
      {
        bool1 = true;
        paramArrayOfBoolean[0] = bool1;
        if (i <= 1)
          break label356;
        if ((paramArrayOfByte[(paramInt2 - 2)] != 0) || (paramArrayOfByte[(paramInt2 - 1)] != 0))
          break label350;
        bool1 = true;
        label252: paramArrayOfBoolean[1] = bool1;
        if (paramArrayOfByte[(paramInt2 - 1)] != 0)
          break label382;
      }
    label350: label356: label382: for (boolean bool1 = bool2; ; bool1 = false)
    {
      paramArrayOfBoolean[2] = bool1;
      return paramInt2;
      bool1 = false;
      break;
      if (i == 2)
      {
        if ((paramArrayOfBoolean[2] != 0) && (paramArrayOfByte[(paramInt2 - 2)] == 0) && (paramArrayOfByte[(paramInt2 - 1)] == 1))
        {
          bool1 = true;
          break;
        }
        bool1 = false;
        break;
      }
      if ((paramArrayOfBoolean[1] != 0) && (paramArrayOfByte[(paramInt2 - 1)] == 1))
      {
        bool1 = true;
        break;
      }
      bool1 = false;
      break;
      bool1 = false;
      break label252;
      if ((paramArrayOfBoolean[2] != 0) && (paramArrayOfByte[(paramInt2 - 1)] == 0))
      {
        bool1 = true;
        break label252;
      }
      bool1 = false;
      break label252;
    }
  }

  public static b a(l paraml)
  {
    int i = paraml.c(8);
    paraml.b(16);
    int i2 = paraml.d();
    boolean bool1 = false;
    int m;
    int j;
    if ((i == 100) || (i == 110) || (i == 122) || (i == 244) || (i == 44) || (i == 83) || (i == 86) || (i == 118) || (i == 128) || (i == 138))
    {
      m = paraml.d();
      if (m == 3)
        bool1 = paraml.b();
      paraml.d();
      paraml.d();
      paraml.b(1);
      if (paraml.b())
      {
        if (m != 3)
        {
          i = 8;
          j = 0;
          label137: if (j >= i)
            break label189;
          if (paraml.b())
            if (j >= 6)
              break label182;
        }
        label182: for (k = 16; ; k = 64)
        {
          a(paraml, k);
          j += 1;
          break label137;
          i = 12;
          break;
        }
      }
    }
    label189: for (int k = m; ; k = 1)
    {
      int i3 = paraml.d();
      int i4 = paraml.d();
      m = 0;
      boolean bool2 = false;
      int n;
      boolean bool3;
      int i1;
      int i5;
      int i6;
      if (i4 == 0)
      {
        j = paraml.d() + 4;
        paraml.d();
        paraml.b(1);
        n = paraml.d();
        m = paraml.d();
        bool3 = paraml.b();
        if (!bool3)
          break label539;
        i = 1;
        if (!bool3)
          paraml.b(1);
        paraml.b(1);
        i1 = (n + 1) * 16;
        n = (2 - i) * (m + 1) * 16;
        if (!paraml.b())
          break label653;
        int i7 = paraml.d();
        int i8 = paraml.d();
        i5 = paraml.d();
        i6 = paraml.d();
        if (k != 0)
          break label549;
        k = 1;
        if (!bool3)
          break label544;
        i = 1;
        label342: m = 2 - i;
        i = k;
        k = m;
        i = i1 - i * (i7 + i8);
      }
      for (k = n - k * (i5 + i6); ; k = n)
      {
        float f2 = 1.0F;
        float f1;
        if ((paraml.b()) && (paraml.b()))
        {
          m = paraml.c(8);
          if (m == 255)
          {
            m = paraml.c(16);
            n = paraml.c(16);
            f1 = f2;
            if (m != 0)
            {
              f1 = f2;
              if (n != 0)
                f1 = m / n;
            }
          }
        }
        while (true)
        {
          return new b(i2, i, k, f1, bool1, bool3, i3 + 4, i4, j, bool2);
          j = m;
          if (i4 != 1)
            break;
          bool3 = paraml.b();
          paraml.e();
          paraml.e();
          long l = paraml.d();
          i = 0;
          while (true)
          {
            j = m;
            bool2 = bool3;
            if (i >= l)
              break;
            paraml.d();
            i += 1;
          }
          i = 0;
          break label259;
          i = 0;
          break label342;
          if (k == 3)
          {
            i = 1;
            if (k != 1)
              break label591;
            k = 2;
            if (!bool3)
              break label597;
          }
          label591: label597: for (m = 1; ; m = 0)
          {
            k = (2 - m) * k;
            break;
            i = 2;
            break label557;
            k = 1;
            break label566;
          }
          if (m < b.length)
          {
            f1 = b[m];
            continue;
          }
          Log.w("NalUnitUtil", "Unexpected aspect_ratio_idc value: " + m);
          f1 = 1.0F;
        }
        i = i1;
      }
      bool1 = false;
    }
  }

  public static void a(ByteBuffer paramByteBuffer)
  {
    int m = paramByteBuffer.position();
    int k = 0;
    int i = 0;
    while (k + 1 < m)
    {
      int n = paramByteBuffer.get(k) & 0xFF;
      int j;
      if (i == 3)
      {
        j = i;
        if (n == 1)
        {
          j = i;
          if ((paramByteBuffer.get(k + 1) & 0x1F) == 7)
          {
            ByteBuffer localByteBuffer = paramByteBuffer.duplicate();
            localByteBuffer.position(k - 3);
            localByteBuffer.limit(m);
            paramByteBuffer.position(0);
            paramByteBuffer.put(localByteBuffer);
            return;
          }
        }
      }
      else
      {
        j = i;
        if (n == 0)
          j = i + 1;
      }
      i = j;
      if (n != 0)
        i = 0;
      k += 1;
    }
    paramByteBuffer.clear();
  }

  private static void a(l paraml, int paramInt)
  {
    int m = 8;
    int j = 0;
    int k = 8;
    if (j < paramInt)
    {
      int i = m;
      if (m != 0)
        i = (paraml.e() + k + 256) % 256;
      if (i == 0);
      while (true)
      {
        j += 1;
        m = i;
        break;
        k = i;
      }
    }
  }

  public static void a(boolean[] paramArrayOfBoolean)
  {
    paramArrayOfBoolean[0] = false;
    paramArrayOfBoolean[1] = false;
    paramArrayOfBoolean[2] = false;
  }

  public static byte[] a(m paramm)
  {
    int i = paramm.g();
    int j = paramm.d();
    paramm.c(i);
    return c.a(paramm.a, j, i);
  }

  public static int b(byte[] paramArrayOfByte, int paramInt)
  {
    return paramArrayOfByte[(paramInt + 3)] & 0x1F;
  }

  public static a b(l paraml)
  {
    int i = paraml.d();
    int j = paraml.d();
    paraml.b(1);
    return new a(i, j, paraml.b());
  }

  public static int c(byte[] paramArrayOfByte, int paramInt)
  {
    return (paramArrayOfByte[(paramInt + 3)] & 0x7E) >> 1;
  }

  public static final class a
  {
    public final int a;
    public final int b;
    public final boolean c;

    public a(int paramInt1, int paramInt2, boolean paramBoolean)
    {
      this.a = paramInt1;
      this.b = paramInt2;
      this.c = paramBoolean;
    }
  }

  public static final class b
  {
    public final int a;
    public final int b;
    public final int c;
    public final float d;
    public final boolean e;
    public final boolean f;
    public final int g;
    public final int h;
    public final int i;
    public final boolean j;

    public b(int paramInt1, int paramInt2, int paramInt3, float paramFloat, boolean paramBoolean1, boolean paramBoolean2, int paramInt4, int paramInt5, int paramInt6, boolean paramBoolean3)
    {
      this.a = paramInt1;
      this.b = paramInt2;
      this.c = paramInt3;
      this.d = paramFloat;
      this.e = paramBoolean1;
      this.f = paramBoolean2;
      this.g = paramInt4;
      this.h = paramInt5;
      this.i = paramInt6;
      this.j = paramBoolean3;
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.exoplayer.f.k
 * JD-Core Version:    0.6.0
 */