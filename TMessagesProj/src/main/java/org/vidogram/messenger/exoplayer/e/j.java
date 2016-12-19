package org.vidogram.messenger.exoplayer.e;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;

public final class j
  implements n
{
  private final m a;
  private RandomAccessFile b;
  private String c;
  private long d;
  private boolean e;

  public j()
  {
    this(null);
  }

  public j(m paramm)
  {
    this.a = paramm;
  }

  public int a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (this.d == 0L)
      paramInt1 = -1;
    while (true)
    {
      return paramInt1;
      try
      {
        paramInt2 = this.b.read(paramArrayOfByte, paramInt1, (int)Math.min(this.d, paramInt2));
        paramInt1 = paramInt2;
        if (paramInt2 <= 0)
          continue;
        this.d -= paramInt2;
        paramInt1 = paramInt2;
        if (this.a == null)
          continue;
        this.a.a(paramInt2);
        return paramInt2;
      }
      catch (IOException paramArrayOfByte)
      {
      }
    }
    throw new a(paramArrayOfByte);
  }

  public long a(f paramf)
  {
    while (true)
    {
      try
      {
        this.c = paramf.a.toString();
        this.b = new RandomAccessFile(paramf.a.getPath(), "r");
        this.b.seek(paramf.d);
        if (paramf.e == -1L)
        {
          l = this.b.length() - paramf.d;
          this.d = l;
          if (this.d >= 0L)
            break;
          throw new EOFException();
        }
      }
      catch (IOException paramf)
      {
        throw new a(paramf);
      }
      long l = paramf.e;
    }
    this.e = true;
    if (this.a != null)
      this.a.a();
    return this.d;
  }

  public void a()
  {
    this.c = null;
    if (this.b != null);
    try
    {
      this.b.close();
      return;
    }
    catch (IOException localIOException)
    {
      throw new a(localIOException);
    }
    finally
    {
      this.b = null;
      if (this.e)
      {
        this.e = false;
        if (this.a != null)
          this.a.b();
      }
    }
    throw localObject;
  }

  public static class a extends IOException
  {
    public a(IOException paramIOException)
    {
      super();
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.exoplayer.e.j
 * JD-Core Version:    0.6.0
 */