package org.vidogram.messenger.exoplayer.c;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.concurrent.LinkedBlockingDeque;
import org.vidogram.messenger.exoplayer.d;
import org.vidogram.messenger.exoplayer.e.a;
import org.vidogram.messenger.exoplayer.e.b;
import org.vidogram.messenger.exoplayer.f.m;
import org.vidogram.messenger.exoplayer.s;

final class k
{
  private final b a;
  private final int b;
  private final a c;
  private final LinkedBlockingDeque<a> d;
  private final b e;
  private final m f;
  private long g;
  private long h;
  private a i;
  private int j;

  public k(b paramb)
  {
    this.a = paramb;
    this.b = paramb.b();
    this.c = new a();
    this.d = new LinkedBlockingDeque();
    this.e = new b(null);
    this.f = new m(32);
    this.j = this.b;
  }

  private int a(int paramInt)
  {
    if (this.j == this.b)
    {
      this.j = 0;
      this.i = this.a.a();
      this.d.add(this.i);
    }
    return Math.min(paramInt, this.b - this.j);
  }

  private void a(long paramLong, ByteBuffer paramByteBuffer, int paramInt)
  {
    while (paramInt > 0)
    {
      b(paramLong);
      int k = (int)(paramLong - this.g);
      int m = Math.min(paramInt, this.b - k);
      a locala = (a)this.d.peek();
      paramByteBuffer.put(locala.a, locala.a(k), m);
      paramLong += m;
      paramInt -= m;
    }
  }

  private void a(long paramLong, byte[] paramArrayOfByte, int paramInt)
  {
    int k = 0;
    while (k < paramInt)
    {
      b(paramLong);
      int m = (int)(paramLong - this.g);
      int n = Math.min(paramInt - k, this.b - m);
      a locala = (a)this.d.peek();
      System.arraycopy(locala.a, locala.a(m), paramArrayOfByte, k, n);
      paramLong += n;
      k += n;
    }
  }

  private void a(s params, b paramb)
  {
    int n = 0;
    long l1 = paramb.a;
    a(l1, this.f.a, 1);
    l1 = 1L + l1;
    int m = this.f.a[0];
    if ((m & 0x80) != 0)
    {
      k = 1;
      m &= 127;
      if (params.a.a == null)
        params.a.a = new byte[16];
      a(l1, params.a.a, m);
      l1 += m;
      if (k == 0)
        break label303;
      a(l1, this.f.a, 2);
      this.f.b(0);
      m = this.f.g();
      l1 += 2L;
    }
    Object localObject2;
    Object localObject1;
    while (true)
    {
      localObject2 = params.a.d;
      if (localObject2 != null)
      {
        localObject1 = localObject2;
        if (localObject2.length >= m);
      }
      else
      {
        localObject1 = new int[m];
      }
      int[] arrayOfInt = params.a.e;
      if (arrayOfInt != null)
      {
        localObject2 = arrayOfInt;
        if (arrayOfInt.length >= m);
      }
      else
      {
        localObject2 = new int[m];
      }
      if (k == 0)
        break label309;
      k = m * 6;
      b(this.f, k);
      a(l1, this.f.a, k);
      long l2 = l1 + k;
      this.f.b(0);
      k = n;
      while (true)
      {
        l1 = l2;
        if (k >= m)
          break;
        localObject1[k] = this.f.g();
        localObject2[k] = this.f.s();
        k += 1;
      }
      k = 0;
      break;
      label303: m = 1;
    }
    label309: localObject1[0] = 0;
    localObject2[0] = (params.c - (int)(l1 - paramb.a));
    params.a.a(m, localObject1, localObject2, paramb.b, params.a.a, 1);
    int k = (int)(l1 - paramb.a);
    paramb.a += k;
    params.c -= k;
  }

  private void b(long paramLong)
  {
    int m = (int)(paramLong - this.g) / this.b;
    int k = 0;
    while (k < m)
    {
      this.a.a((a)this.d.remove());
      this.g += this.b;
      k += 1;
    }
  }

  private static void b(m paramm, int paramInt)
  {
    if (paramm.c() < paramInt)
      paramm.a(new byte[paramInt], paramInt);
  }

  public int a(f paramf, int paramInt, boolean paramBoolean)
  {
    paramInt = a(paramInt);
    paramInt = paramf.a(this.i.a, this.i.a(this.j), paramInt);
    if (paramInt == -1)
    {
      if (paramBoolean)
        return -1;
      throw new EOFException();
    }
    this.j += paramInt;
    this.h += paramInt;
    return paramInt;
  }

  public void a()
  {
    this.c.a();
    this.a.a((a[])this.d.toArray(new a[this.d.size()]));
    this.d.clear();
    this.g = 0L;
    this.h = 0L;
    this.i = null;
    this.j = this.b;
  }

  public void a(long paramLong1, int paramInt1, long paramLong2, int paramInt2, byte[] paramArrayOfByte)
  {
    this.c.a(paramLong1, paramInt1, paramLong2, paramInt2, paramArrayOfByte);
  }

  public void a(m paramm, int paramInt)
  {
    while (paramInt > 0)
    {
      int k = a(paramInt);
      paramm.a(this.i.a, this.i.a(this.j), k);
      this.j += k;
      this.h += k;
      paramInt -= k;
    }
  }

  public boolean a(long paramLong)
  {
    paramLong = this.c.a(paramLong);
    if (paramLong == -1L)
      return false;
    b(paramLong);
    return true;
  }

  public boolean a(s params)
  {
    return this.c.a(params, this.e);
  }

  public void b()
  {
    b(this.c.b());
  }

  public boolean b(s params)
  {
    if (!this.c.a(params, this.e))
      return false;
    if (params.a())
      a(params, this.e);
    params.a(params.c);
    a(this.e.a, params.b, params.c);
    b(this.c.b());
    return true;
  }

  public long c()
  {
    return this.h;
  }

  private static final class a
  {
    private int a = 1000;
    private long[] b = new long[this.a];
    private int[] c = new int[this.a];
    private int[] d = new int[this.a];
    private long[] e = new long[this.a];
    private byte[][] f = new byte[this.a][];
    private int g;
    private int h;
    private int i;
    private int j;

    public long a(long paramLong)
    {
      long l2 = -1L;
      monitorenter;
      long l1 = l2;
      try
      {
        if (this.g != 0)
        {
          l1 = this.e[this.i];
          if (paramLong >= l1)
            break label45;
          l1 = l2;
        }
        label45: int k;
        label57: int m;
        int n;
        while (true)
        {
          return l1;
          if (this.j != 0)
            break;
          k = this.a;
          l1 = l2;
          if (paramLong > this.e[(k - 1)])
            continue;
          k = 0;
          m = this.i;
          n = -1;
        }
        while (true)
        {
          if ((m == this.j) || (this.e[m] > paramLong))
          {
            l1 = l2;
            if (n == -1)
              break;
            this.g -= n;
            this.i = ((this.i + n) % this.a);
            this.h += n;
            l1 = this.b[this.i];
            break;
            k = this.j;
            break label57;
          }
          if ((this.d[m] & 0x1) != 0)
            n = k;
          m = (m + 1) % this.a;
          k += 1;
        }
      }
      finally
      {
        monitorexit;
      }
      throw localObject;
    }

    public void a()
    {
      this.h = 0;
      this.i = 0;
      this.j = 0;
      this.g = 0;
    }

    public void a(long paramLong1, int paramInt1, long paramLong2, int paramInt2, byte[] paramArrayOfByte)
    {
      monitorenter;
      try
      {
        this.e[this.j] = paramLong1;
        this.b[this.j] = paramLong2;
        this.c[this.j] = paramInt2;
        this.d[this.j] = paramInt1;
        this.f[this.j] = paramArrayOfByte;
        this.g += 1;
        if (this.g == this.a)
        {
          paramInt1 = this.a + 1000;
          paramArrayOfByte = new long[paramInt1];
          long[] arrayOfLong = new long[paramInt1];
          int[] arrayOfInt1 = new int[paramInt1];
          int[] arrayOfInt2 = new int[paramInt1];
          byte[][] arrayOfByte = new byte[paramInt1][];
          paramInt2 = this.a - this.i;
          System.arraycopy(this.b, this.i, paramArrayOfByte, 0, paramInt2);
          System.arraycopy(this.e, this.i, arrayOfLong, 0, paramInt2);
          System.arraycopy(this.d, this.i, arrayOfInt1, 0, paramInt2);
          System.arraycopy(this.c, this.i, arrayOfInt2, 0, paramInt2);
          System.arraycopy(this.f, this.i, arrayOfByte, 0, paramInt2);
          int k = this.i;
          System.arraycopy(this.b, 0, paramArrayOfByte, paramInt2, k);
          System.arraycopy(this.e, 0, arrayOfLong, paramInt2, k);
          System.arraycopy(this.d, 0, arrayOfInt1, paramInt2, k);
          System.arraycopy(this.c, 0, arrayOfInt2, paramInt2, k);
          System.arraycopy(this.f, 0, arrayOfByte, paramInt2, k);
          this.b = paramArrayOfByte;
          this.e = arrayOfLong;
          this.d = arrayOfInt1;
          this.c = arrayOfInt2;
          this.f = arrayOfByte;
          this.i = 0;
          this.j = this.a;
          this.g = this.a;
          this.a = paramInt1;
        }
        while (true)
        {
          return;
          this.j += 1;
          if (this.j != this.a)
            continue;
          this.j = 0;
        }
      }
      finally
      {
        monitorexit;
      }
      throw paramArrayOfByte;
    }

    public boolean a(s params, k.b paramb)
    {
      monitorenter;
      try
      {
        int k = this.g;
        if (k == 0);
        for (int m = 0; ; m = 1)
        {
          return m;
          params.e = this.e[this.i];
          params.c = this.c[this.i];
          params.d = this.d[this.i];
          paramb.a = this.b[this.i];
          paramb.b = this.f[this.i];
        }
      }
      finally
      {
        monitorexit;
      }
      throw params;
    }

    public long b()
    {
      monitorenter;
      try
      {
        this.g -= 1;
        int k = this.i;
        this.i = (k + 1);
        this.h += 1;
        if (this.i == this.a)
          this.i = 0;
        long l1;
        if (this.g > 0)
          l1 = this.b[this.i];
        while (true)
        {
          return l1;
          l1 = this.c[k];
          long l2 = this.b[k];
          l1 = l2 + l1;
        }
      }
      finally
      {
        monitorexit;
      }
      throw localObject;
    }
  }

  private static final class b
  {
    public long a;
    public byte[] b;
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.exoplayer.c.k
 * JD-Core Version:    0.6.0
 */