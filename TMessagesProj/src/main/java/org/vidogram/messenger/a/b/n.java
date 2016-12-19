package org.vidogram.messenger.a.b;

import java.io.EOFException;
import java.io.InputStream;
import org.vidogram.messenger.a.c.a;

public class n extends a
{
  public n(InputStream paramInputStream)
  {
    super(paramInputStream);
  }

  public void a(long paramLong)
  {
    long l1 = 0L;
    while (l1 < paramLong)
    {
      long l2 = skip(paramLong - l1);
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
      int j = read(paramArrayOfByte, paramInt1 + i, paramInt2 - i);
      if (j > 0)
      {
        i += j;
        continue;
      }
      throw new EOFException();
    }
  }

  public String toString()
  {
    return "mp3[pos=" + a() + "]";
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.a.b.n
 * JD-Core Version:    0.6.0
 */