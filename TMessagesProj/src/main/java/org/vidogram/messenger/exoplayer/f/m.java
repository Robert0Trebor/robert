package org.vidogram.messenger.exoplayer.f;

import java.nio.charset.Charset;

public final class m
{
  public byte[] a;
  private int b;
  private int c;

  public m()
  {
  }

  public m(int paramInt)
  {
    this.a = new byte[paramInt];
    this.c = this.a.length;
  }

  public m(byte[] paramArrayOfByte)
  {
    this.a = paramArrayOfByte;
    this.c = paramArrayOfByte.length;
  }

  public m(byte[] paramArrayOfByte, int paramInt)
  {
    this.a = paramArrayOfByte;
    this.c = paramInt;
  }

  public String a(int paramInt, Charset paramCharset)
  {
    paramCharset = new String(this.a, this.b, paramInt, paramCharset);
    this.b += paramInt;
    return paramCharset;
  }

  public void a()
  {
    this.b = 0;
    this.c = 0;
  }

  public void a(int paramInt)
  {
    if ((paramInt >= 0) && (paramInt <= this.a.length));
    for (boolean bool = true; ; bool = false)
    {
      b.a(bool);
      this.c = paramInt;
      return;
    }
  }

  public void a(l paraml, int paramInt)
  {
    a(paraml.a, 0, paramInt);
    paraml.a(0);
  }

  public void a(byte[] paramArrayOfByte, int paramInt)
  {
    this.a = paramArrayOfByte;
    this.c = paramInt;
    this.b = 0;
  }

  public void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    System.arraycopy(this.a, this.b, paramArrayOfByte, paramInt1, paramInt2);
    this.b += paramInt2;
  }

  public int b()
  {
    return this.c - this.b;
  }

  public void b(int paramInt)
  {
    if ((paramInt >= 0) && (paramInt <= this.c));
    for (boolean bool = true; ; bool = false)
    {
      b.a(bool);
      this.b = paramInt;
      return;
    }
  }

  public int c()
  {
    return this.c;
  }

  public void c(int paramInt)
  {
    b(this.b + paramInt);
  }

  public int d()
  {
    return this.b;
  }

  public String d(int paramInt)
  {
    return a(paramInt, Charset.defaultCharset());
  }

  public int e()
  {
    if (this.a == null)
      return 0;
    return this.a.length;
  }

  public int f()
  {
    byte[] arrayOfByte = this.a;
    int i = this.b;
    this.b = (i + 1);
    return arrayOfByte[i] & 0xFF;
  }

  public int g()
  {
    byte[] arrayOfByte = this.a;
    int i = this.b;
    this.b = (i + 1);
    i = arrayOfByte[i];
    arrayOfByte = this.a;
    int j = this.b;
    this.b = (j + 1);
    return (i & 0xFF) << 8 | arrayOfByte[j] & 0xFF;
  }

  public int h()
  {
    byte[] arrayOfByte = this.a;
    int i = this.b;
    this.b = (i + 1);
    i = arrayOfByte[i];
    arrayOfByte = this.a;
    int j = this.b;
    this.b = (j + 1);
    return i & 0xFF | (arrayOfByte[j] & 0xFF) << 8;
  }

  public short i()
  {
    byte[] arrayOfByte = this.a;
    int i = this.b;
    this.b = (i + 1);
    i = arrayOfByte[i];
    arrayOfByte = this.a;
    int j = this.b;
    this.b = (j + 1);
    return (short)((i & 0xFF) << 8 | arrayOfByte[j] & 0xFF);
  }

  public int j()
  {
    byte[] arrayOfByte = this.a;
    int i = this.b;
    this.b = (i + 1);
    i = arrayOfByte[i];
    arrayOfByte = this.a;
    int j = this.b;
    this.b = (j + 1);
    j = arrayOfByte[j];
    arrayOfByte = this.a;
    int k = this.b;
    this.b = (k + 1);
    return (i & 0xFF) << 16 | (j & 0xFF) << 8 | arrayOfByte[k] & 0xFF;
  }

  public long k()
  {
    byte[] arrayOfByte = this.a;
    int i = this.b;
    this.b = (i + 1);
    long l1 = arrayOfByte[i];
    arrayOfByte = this.a;
    i = this.b;
    this.b = (i + 1);
    long l2 = arrayOfByte[i];
    arrayOfByte = this.a;
    i = this.b;
    this.b = (i + 1);
    long l3 = arrayOfByte[i];
    arrayOfByte = this.a;
    i = this.b;
    this.b = (i + 1);
    return (l1 & 0xFF) << 24 | (l2 & 0xFF) << 16 | (l3 & 0xFF) << 8 | arrayOfByte[i] & 0xFF;
  }

  public long l()
  {
    byte[] arrayOfByte = this.a;
    int i = this.b;
    this.b = (i + 1);
    long l1 = arrayOfByte[i];
    arrayOfByte = this.a;
    i = this.b;
    this.b = (i + 1);
    long l2 = arrayOfByte[i];
    arrayOfByte = this.a;
    i = this.b;
    this.b = (i + 1);
    long l3 = arrayOfByte[i];
    arrayOfByte = this.a;
    i = this.b;
    this.b = (i + 1);
    return l1 & 0xFF | (l2 & 0xFF) << 8 | (l3 & 0xFF) << 16 | (arrayOfByte[i] & 0xFF) << 24;
  }

  public int m()
  {
    byte[] arrayOfByte = this.a;
    int i = this.b;
    this.b = (i + 1);
    i = arrayOfByte[i];
    arrayOfByte = this.a;
    int j = this.b;
    this.b = (j + 1);
    j = arrayOfByte[j];
    arrayOfByte = this.a;
    int k = this.b;
    this.b = (k + 1);
    k = arrayOfByte[k];
    arrayOfByte = this.a;
    int m = this.b;
    this.b = (m + 1);
    return (i & 0xFF) << 24 | (j & 0xFF) << 16 | (k & 0xFF) << 8 | arrayOfByte[m] & 0xFF;
  }

  public int n()
  {
    byte[] arrayOfByte = this.a;
    int i = this.b;
    this.b = (i + 1);
    i = arrayOfByte[i];
    arrayOfByte = this.a;
    int j = this.b;
    this.b = (j + 1);
    j = arrayOfByte[j];
    arrayOfByte = this.a;
    int k = this.b;
    this.b = (k + 1);
    k = arrayOfByte[k];
    arrayOfByte = this.a;
    int m = this.b;
    this.b = (m + 1);
    return i & 0xFF | (j & 0xFF) << 8 | (k & 0xFF) << 16 | (arrayOfByte[m] & 0xFF) << 24;
  }

  public long o()
  {
    byte[] arrayOfByte = this.a;
    int i = this.b;
    this.b = (i + 1);
    long l1 = arrayOfByte[i];
    arrayOfByte = this.a;
    i = this.b;
    this.b = (i + 1);
    long l2 = arrayOfByte[i];
    arrayOfByte = this.a;
    i = this.b;
    this.b = (i + 1);
    long l3 = arrayOfByte[i];
    arrayOfByte = this.a;
    i = this.b;
    this.b = (i + 1);
    long l4 = arrayOfByte[i];
    arrayOfByte = this.a;
    i = this.b;
    this.b = (i + 1);
    long l5 = arrayOfByte[i];
    arrayOfByte = this.a;
    i = this.b;
    this.b = (i + 1);
    long l6 = arrayOfByte[i];
    arrayOfByte = this.a;
    i = this.b;
    this.b = (i + 1);
    long l7 = arrayOfByte[i];
    arrayOfByte = this.a;
    i = this.b;
    this.b = (i + 1);
    return (l1 & 0xFF) << 56 | (l2 & 0xFF) << 48 | (l3 & 0xFF) << 40 | (l4 & 0xFF) << 32 | (l5 & 0xFF) << 24 | (l6 & 0xFF) << 16 | (l7 & 0xFF) << 8 | arrayOfByte[i] & 0xFF;
  }

  public long p()
  {
    byte[] arrayOfByte = this.a;
    int i = this.b;
    this.b = (i + 1);
    long l1 = arrayOfByte[i];
    arrayOfByte = this.a;
    i = this.b;
    this.b = (i + 1);
    long l2 = arrayOfByte[i];
    arrayOfByte = this.a;
    i = this.b;
    this.b = (i + 1);
    long l3 = arrayOfByte[i];
    arrayOfByte = this.a;
    i = this.b;
    this.b = (i + 1);
    long l4 = arrayOfByte[i];
    arrayOfByte = this.a;
    i = this.b;
    this.b = (i + 1);
    long l5 = arrayOfByte[i];
    arrayOfByte = this.a;
    i = this.b;
    this.b = (i + 1);
    long l6 = arrayOfByte[i];
    arrayOfByte = this.a;
    i = this.b;
    this.b = (i + 1);
    long l7 = arrayOfByte[i];
    arrayOfByte = this.a;
    i = this.b;
    this.b = (i + 1);
    return l1 & 0xFF | (l2 & 0xFF) << 8 | (l3 & 0xFF) << 16 | (l4 & 0xFF) << 24 | (l5 & 0xFF) << 32 | (l6 & 0xFF) << 40 | (l7 & 0xFF) << 48 | (arrayOfByte[i] & 0xFF) << 56;
  }

  public int q()
  {
    byte[] arrayOfByte = this.a;
    int i = this.b;
    this.b = (i + 1);
    i = arrayOfByte[i];
    arrayOfByte = this.a;
    int j = this.b;
    this.b = (j + 1);
    j = arrayOfByte[j];
    this.b += 2;
    return (i & 0xFF) << 8 | j & 0xFF;
  }

  public int r()
  {
    return f() << 21 | f() << 14 | f() << 7 | f();
  }

  public int s()
  {
    int i = m();
    if (i < 0)
      throw new IllegalStateException("Top bit not zero: " + i);
    return i;
  }

  public int t()
  {
    int i = n();
    if (i < 0)
      throw new IllegalStateException("Top bit not zero: " + i);
    return i;
  }

  public long u()
  {
    long l = o();
    if (l < 0L)
      throw new IllegalStateException("Top bit not zero: " + l);
    return l;
  }

  public double v()
  {
    return Double.longBitsToDouble(o());
  }

  public long w()
  {
    int k = 1;
    int m = 0;
    long l2 = this.a[this.b];
    int j = 7;
    int i;
    while (true)
    {
      i = m;
      long l1 = l2;
      if (j >= 0)
      {
        if ((1 << j & l2) != 0L)
          break label125;
        if (j >= 6)
          break label103;
        l1 = l2 & (1 << j) - 1;
        i = 7 - j;
      }
      while (true)
      {
        j = k;
        l2 = l1;
        if (i != 0)
          break;
        throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + l1);
        label103: i = m;
        l1 = l2;
        if (j != 7)
          continue;
        i = 1;
        l1 = l2;
      }
      label125: j -= 1;
    }
    while (true)
    {
      l2 = l2 << 6 | k & 0x3F;
      j += 1;
      if (j >= i)
        break;
      k = this.a[(this.b + j)];
      if ((k & 0xC0) == 128)
        continue;
      throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + l2);
    }
    this.b += i;
    return l2;
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.exoplayer.f.m
 * JD-Core Version:    0.6.0
 */