package org.vidogram.messenger.a.b;

import java.io.EOFException;
import java.io.InputStream;

public class c
{
  private final InputStream a;

  public c(InputStream paramInputStream)
  {
    this.a = paramInputStream;
  }

  public byte a()
  {
    int i = this.a.read();
    if (i < 0)
      throw new EOFException();
    return (byte)i;
  }

  public void a(long paramLong)
  {
    long l1 = 0L;
    while (l1 < paramLong)
    {
      long l2 = this.a.skip(paramLong - l1);
      if (l2 > 0L)
      {
        l1 += l2;
        continue;
      }
      throw new EOFException();
    }
  }

  public final void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i = 0;
    while (i < paramInt2)
    {
      int j = this.a.read(paramArrayOfByte, paramInt1 + i, paramInt2 - i);
      if (j > 0)
      {
        i += j;
        continue;
      }
      throw new EOFException();
    }
  }

  public byte[] a(int paramInt)
  {
    byte[] arrayOfByte = new byte[paramInt];
    a(arrayOfByte, 0, paramInt);
    return arrayOfByte;
  }

  public int b()
  {
    return (a() & 0xFF) << 24 | (a() & 0xFF) << 16 | (a() & 0xFF) << 8 | a() & 0xFF;
  }

  public int c()
  {
    return (a() & 0x7F) << 21 | (a() & 0x7F) << 14 | (a() & 0x7F) << 7 | a() & 0x7F;
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.a.b.c
 * JD-Core Version:    0.6.0
 */