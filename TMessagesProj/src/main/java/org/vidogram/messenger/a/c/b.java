package org.vidogram.messenger.a.c;

import java.io.InputStream;

public class b extends a
{
  private final long a;

  public b(InputStream paramInputStream, long paramLong1, long paramLong2)
  {
    super(paramInputStream, paramLong1);
    this.a = (paramLong1 + paramLong2);
  }

  public long b()
  {
    return this.a - a();
  }

  public int read()
  {
    if (a() == this.a)
      return -1;
    return super.read();
  }

  public int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i = paramInt2;
    if (a() + paramInt2 > this.a)
    {
      paramInt2 = (int)(this.a - a());
      i = paramInt2;
      if (paramInt2 == 0)
        return -1;
    }
    return super.read(paramArrayOfByte, paramInt1, i);
  }

  public long skip(long paramLong)
  {
    long l = paramLong;
    if (a() + paramLong > this.a)
      l = (int)(this.a - a());
    return super.skip(l);
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.a.c.b
 * JD-Core Version:    0.6.0
 */