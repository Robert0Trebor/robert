package org.vidogram.messenger.exoplayer.e;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class d
  implements n
{
  private final ContentResolver a;
  private final m b;
  private InputStream c;
  private String d;
  private long e;
  private boolean f;

  public d(Context paramContext, m paramm)
  {
    this.a = paramContext.getContentResolver();
    this.b = paramm;
  }

  public int a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (this.e == 0L)
      paramInt1 = -1;
    while (true)
    {
      return paramInt1;
      try
      {
        if (this.e == -1L);
        while (true)
        {
          paramInt2 = this.c.read(paramArrayOfByte, paramInt1, paramInt2);
          paramInt1 = paramInt2;
          if (paramInt2 <= 0)
            break;
          if (this.e != -1L)
            this.e -= paramInt2;
          paramInt1 = paramInt2;
          if (this.b == null)
            break;
          this.b.a(paramInt2);
          return paramInt2;
          long l = Math.min(this.e, paramInt2);
          paramInt2 = (int)l;
        }
      }
      catch (IOException paramArrayOfByte)
      {
      }
    }
    throw new a(paramArrayOfByte);
  }

  public long a(f paramf)
  {
    try
    {
      this.d = paramf.a.toString();
      this.c = new FileInputStream(this.a.openAssetFileDescriptor(paramf.a, "r").getFileDescriptor());
      if (this.c.skip(paramf.d) < paramf.d)
        throw new EOFException();
    }
    catch (IOException paramf)
    {
      throw new a(paramf);
    }
    if (paramf.e != -1L)
      this.e = paramf.e;
    while (true)
    {
      this.f = true;
      if (this.b != null)
        this.b.a();
      return this.e;
      this.e = this.c.available();
      if (this.e != 0L)
        continue;
      this.e = -1L;
    }
  }

  public void a()
  {
    this.d = null;
    if (this.c != null);
    try
    {
      this.c.close();
      return;
    }
    catch (IOException localIOException)
    {
      throw new a(localIOException);
    }
    finally
    {
      this.c = null;
      if (this.f)
      {
        this.f = false;
        if (this.b != null)
          this.b.b();
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
 * Qualified Name:     org.vidogram.messenger.exoplayer.e.d
 * JD-Core Version:    0.6.0
 */