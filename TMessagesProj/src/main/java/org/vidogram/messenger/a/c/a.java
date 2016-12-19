package org.vidogram.messenger.a.c;

import java.io.FilterInputStream;
import java.io.InputStream;

public class a extends FilterInputStream
{
  private long a;
  private long b;

  public a(InputStream paramInputStream)
  {
    this(paramInputStream, 0L);
  }

  public a(InputStream paramInputStream, long paramLong)
  {
    super(paramInputStream);
    this.a = paramLong;
  }

  public long a()
  {
    return this.a;
  }

  public void mark(int paramInt)
  {
    monitorenter;
    try
    {
      this.b = this.a;
      super.mark(paramInt);
      monitorexit;
      return;
    }
    finally
    {
      localObject = finally;
      monitorexit;
    }
    throw localObject;
  }

  public int read()
  {
    int i = super.read();
    if (i >= 0)
      this.a += 1L;
    return i;
  }

  public final int read(byte[] paramArrayOfByte)
  {
    return read(paramArrayOfByte, 0, paramArrayOfByte.length);
  }

  public int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    long l = this.a;
    paramInt1 = super.read(paramArrayOfByte, paramInt1, paramInt2);
    if (paramInt1 > 0)
      this.a = (l + paramInt1);
    return paramInt1;
  }

  public void reset()
  {
    monitorenter;
    try
    {
      super.reset();
      this.a = this.b;
      monitorexit;
      return;
    }
    finally
    {
      localObject = finally;
      monitorexit;
    }
    throw localObject;
  }

  public long skip(long paramLong)
  {
    long l = this.a;
    paramLong = super.skip(paramLong);
    this.a = (l + paramLong);
    return paramLong;
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.a.c.a
 * JD-Core Version:    0.6.0
 */