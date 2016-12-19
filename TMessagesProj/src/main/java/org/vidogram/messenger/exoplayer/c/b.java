package org.vidogram.messenger.exoplayer.c;

import java.io.EOFException;
import java.util.Arrays;
import org.vidogram.messenger.exoplayer.e.e;

public final class b
  implements f
{
  private static final byte[] a = new byte[4096];
  private final e b;
  private final long c;
  private long d;
  private byte[] e;
  private int f;
  private int g;

  public b(e parame, long paramLong1, long paramLong2)
  {
    this.b = parame;
    this.d = paramLong1;
    this.c = paramLong2;
    this.e = new byte[8192];
  }

  private int a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    if (Thread.interrupted())
      throw new InterruptedException();
    paramInt1 = this.b.a(paramArrayOfByte, paramInt1 + paramInt3, paramInt2 - paramInt3);
    if (paramInt1 == -1)
    {
      if ((paramInt3 == 0) && (paramBoolean))
        return -1;
      throw new EOFException();
    }
    return paramInt3 + paramInt1;
  }

  private int d(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (this.g == 0)
      return 0;
    paramInt2 = Math.min(this.g, paramInt2);
    System.arraycopy(this.e, 0, paramArrayOfByte, paramInt1, paramInt2);
    f(paramInt2);
    return paramInt2;
  }

  private void d(int paramInt)
  {
    paramInt = this.f + paramInt;
    if (paramInt > this.e.length)
      this.e = Arrays.copyOf(this.e, Math.max(this.e.length * 2, paramInt));
  }

  private int e(int paramInt)
  {
    paramInt = Math.min(this.g, paramInt);
    f(paramInt);
    return paramInt;
  }

  private void f(int paramInt)
  {
    this.g -= paramInt;
    this.f = 0;
    System.arraycopy(this.e, paramInt, this.e, 0, this.g);
  }

  private void g(int paramInt)
  {
    if (paramInt != -1)
      this.d += paramInt;
  }

  public int a(int paramInt)
  {
    int j = e(paramInt);
    int i = j;
    if (j == 0)
      i = a(a, 0, Math.min(paramInt, a.length), 0, true);
    g(i);
    return i;
  }

  public int a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int j = d(paramArrayOfByte, paramInt1, paramInt2);
    int i = j;
    if (j == 0)
      i = a(paramArrayOfByte, paramInt1, paramInt2, 0, true);
    g(i);
    return i;
  }

  public void a()
  {
    this.f = 0;
  }

  public boolean a(int paramInt, boolean paramBoolean)
  {
    for (int i = e(paramInt); (i < paramInt) && (i != -1); i = a(a, -i, Math.min(paramInt, a.length + i), i, paramBoolean));
    g(i);
    return i != -1;
  }

  public boolean a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    for (int i = d(paramArrayOfByte, paramInt1, paramInt2); (i < paramInt2) && (i != -1); i = a(paramArrayOfByte, paramInt1, paramInt2, i, paramBoolean));
    g(i);
    return i != -1;
  }

  public long b()
  {
    return this.d + this.f;
  }

  public void b(int paramInt)
  {
    a(paramInt, false);
  }

  public void b(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    a(paramArrayOfByte, paramInt1, paramInt2, false);
  }

  public boolean b(int paramInt, boolean paramBoolean)
  {
    d(paramInt);
    int i = Math.min(this.g - this.f, paramInt);
    this.g += paramInt - i;
    while (i < paramInt)
    {
      int j = a(this.e, this.f, paramInt, i, paramBoolean);
      i = j;
      if (j == -1)
        return false;
    }
    this.f += paramInt;
    return true;
  }

  public boolean b(byte[] paramArrayOfByte, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    if (!b(paramInt2, paramBoolean))
      return false;
    System.arraycopy(this.e, this.f - paramInt2, paramArrayOfByte, paramInt1, paramInt2);
    return true;
  }

  public long c()
  {
    return this.d;
  }

  public void c(int paramInt)
  {
    b(paramInt, false);
  }

  public void c(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    b(paramArrayOfByte, paramInt1, paramInt2, false);
  }

  public long d()
  {
    return this.c;
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.exoplayer.c.b
 * JD-Core Version:    0.6.0
 */