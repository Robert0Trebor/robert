package org.vidogram.messenger.exoplayer.f;

public final class l
{
  public byte[] a;
  private int b;
  private int c;
  private int d;

  public l()
  {
  }

  public l(byte[] paramArrayOfByte)
  {
    this(paramArrayOfByte, paramArrayOfByte.length);
  }

  public l(byte[] paramArrayOfByte, int paramInt)
  {
    this.a = paramArrayOfByte;
    this.d = paramInt;
  }

  private int f()
  {
    int j = 0;
    int i = 0;
    while (!b())
      i += 1;
    if (i > 0)
      j = c(i);
    return (1 << i) - 1 + j;
  }

  private void g()
  {
    if ((this.b >= 0) && (this.c >= 0) && (this.c < 8) && ((this.b < this.d) || ((this.b == this.d) && (this.c == 0))));
    for (boolean bool = true; ; bool = false)
    {
      b.b(bool);
      return;
    }
  }

  public int a()
  {
    return (this.d - this.b) * 8 - this.c;
  }

  public void a(int paramInt)
  {
    this.b = (paramInt / 8);
    this.c = (paramInt - this.b * 8);
    g();
  }

  public void a(byte[] paramArrayOfByte)
  {
    a(paramArrayOfByte, paramArrayOfByte.length);
  }

  public void a(byte[] paramArrayOfByte, int paramInt)
  {
    this.a = paramArrayOfByte;
    this.b = 0;
    this.c = 0;
    this.d = paramInt;
  }

  public void b(int paramInt)
  {
    this.b += paramInt / 8;
    this.c += paramInt % 8;
    if (this.c > 7)
    {
      this.b += 1;
      this.c -= 8;
    }
    g();
  }

  public boolean b()
  {
    return c(1) == 1;
  }

  public int c(int paramInt)
  {
    if (paramInt == 0)
      return 0;
    int m = paramInt / 8;
    int i = 0;
    int k = 0;
    int j = paramInt;
    paramInt = k;
    if (i < m)
    {
      if (this.c != 0);
      for (k = (this.a[this.b] & 0xFF) << this.c | (this.a[(this.b + 1)] & 0xFF) >>> 8 - this.c; ; k = this.a[this.b])
      {
        j -= 8;
        paramInt |= (k & 0xFF) << j;
        this.b += 1;
        i += 1;
        break;
      }
    }
    if (j > 0)
    {
      k = this.c + j;
      i = (byte)(255 >> 8 - j);
      if (k > 8)
      {
        paramInt = i & ((this.a[this.b] & 0xFF) << k - 8 | (this.a[(this.b + 1)] & 0xFF) >> 16 - k) | paramInt;
        this.b += 1;
        this.c = (k % 8);
      }
    }
    while (true)
    {
      g();
      return paramInt;
      i = i & (this.a[this.b] & 0xFF) >> 8 - k | paramInt;
      paramInt = i;
      if (k != 8)
        break;
      this.b += 1;
      paramInt = i;
      break;
    }
  }

  public boolean c()
  {
    int k = this.b;
    int m = this.c;
    int i = 0;
    while ((this.b < this.d) && (!b()))
      i += 1;
    if (this.b == this.d);
    for (int j = 1; ; j = 0)
    {
      this.b = k;
      this.c = m;
      if ((j != 0) || (a() < i * 2 + 1))
        break;
      return true;
    }
    return false;
  }

  public int d()
  {
    return f();
  }

  public int e()
  {
    int j = f();
    if (j % 2 == 0);
    for (int i = -1; ; i = 1)
      return i * ((j + 1) / 2);
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.exoplayer.f.l
 * JD-Core Version:    0.6.0
 */