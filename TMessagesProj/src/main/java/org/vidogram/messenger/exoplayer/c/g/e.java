package org.vidogram.messenger.exoplayer.c.g;

import org.vidogram.messenger.exoplayer.c.f;

final class e
{
  private static final long[] a = { 128L, 64L, 32L, 16L, 8L, 4L, 2L, 1L };
  private final byte[] b = new byte[8];
  private int c;
  private int d;

  public static int a(int paramInt)
  {
    int i = 0;
    while (i < a.length)
    {
      if ((a[i] & paramInt) != 0L)
        return i + 1;
      i += 1;
    }
    return -1;
  }

  public static long a(byte[] paramArrayOfByte, int paramInt, boolean paramBoolean)
  {
    long l2 = paramArrayOfByte[0] & 0xFF;
    long l1 = l2;
    if (paramBoolean)
      l1 = l2 & (a[(paramInt - 1)] ^ 0xFFFFFFFF);
    int i = 1;
    while (i < paramInt)
    {
      l1 = l1 << 8 | paramArrayOfByte[i] & 0xFF;
      i += 1;
    }
    return l1;
  }

  public long a(f paramf, boolean paramBoolean1, boolean paramBoolean2, int paramInt)
  {
    if (this.c == 0)
    {
      if (!paramf.a(this.b, 0, 1, paramBoolean1))
        return -1L;
      this.d = a(this.b[0] & 0xFF);
      if (this.d == -1)
        throw new IllegalStateException("No valid varint length mask found");
      this.c = 1;
    }
    if (this.d > paramInt)
    {
      this.c = 0;
      return -2L;
    }
    if (this.d != 1)
      paramf.b(this.b, 1, this.d - 1);
    this.c = 0;
    return a(this.b, this.d, paramBoolean2);
  }

  public void a()
  {
    this.c = 0;
    this.d = 0;
  }

  public int b()
  {
    return this.d;
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.exoplayer.c.g.e
 * JD-Core Version:    0.6.0
 */