package org.vidogram.messenger.exoplayer.c.d;

import org.vidogram.messenger.exoplayer.f.b;

final class g
{
  public final byte[] a;
  private int b;
  private int c;
  private int d;

  public g(byte[] paramArrayOfByte)
  {
    this(paramArrayOfByte, paramArrayOfByte.length);
  }

  public g(byte[] paramArrayOfByte, int paramInt)
  {
    this.a = paramArrayOfByte;
    this.b = (paramInt * 8);
  }

  public int a(int paramInt)
  {
    if (b() + paramInt <= this.b);
    for (boolean bool = true; ; bool = false)
    {
      b.b(bool);
      if (paramInt != 0)
        break;
      return 0;
    }
    int k;
    int m;
    int i;
    int j;
    if (this.d != 0)
    {
      k = Math.min(paramInt, 8 - this.d);
      m = 255 >>> 8 - k & this.a[this.c] >>> this.d;
      this.d += k;
      i = k;
      j = m;
      if (this.d == 8)
      {
        this.c += 1;
        this.d = 0;
        j = m;
        i = k;
      }
    }
    while (true)
    {
      if (paramInt - i > 7)
      {
        m = (paramInt - i) / 8;
        k = 0;
        while (k < m)
        {
          long l = j;
          byte[] arrayOfByte = this.a;
          j = this.c;
          this.c = (j + 1);
          j = (int)(l | (arrayOfByte[j] & 0xFF) << i);
          i += 8;
          k += 1;
        }
        k = j;
        j = i;
        i = k;
      }
      while (true)
      {
        k = i;
        if (paramInt > j)
        {
          paramInt -= j;
          k = i | (255 >>> 8 - paramInt & this.a[this.c]) << j;
          this.d += paramInt;
        }
        return k;
        k = i;
        i = j;
        j = k;
      }
      i = 0;
      j = 0;
    }
  }

  public boolean a()
  {
    return a(1) == 1;
  }

  public int b()
  {
    return this.c * 8 + this.d;
  }

  public void b(int paramInt)
  {
    if (b() + paramInt <= this.b);
    for (boolean bool = true; ; bool = false)
    {
      b.b(bool);
      this.c += paramInt / 8;
      this.d += paramInt % 8;
      if (this.d > 7)
      {
        this.c += 1;
        this.d -= 8;
      }
      return;
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.exoplayer.c.d.g
 * JD-Core Version:    0.6.0
 */