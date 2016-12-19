package org.vidogram.messenger.exoplayer.e;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

public final class c
  implements n
{
  private final AssetManager a;
  private final m b;
  private String c;
  private InputStream d;
  private long e;
  private boolean f;

  public c(Context paramContext, m paramm)
  {
    this.a = paramContext.getAssets();
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
          paramInt2 = this.d.read(paramArrayOfByte, paramInt1, paramInt2);
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
    while (true)
    {
      String str2;
      try
      {
        this.c = paramf.a.toString();
        str2 = paramf.a.getPath();
        if (str2.startsWith("/android_asset/"))
        {
          str1 = str2.substring(15);
          this.c = paramf.a.toString();
          this.d = this.a.open(str1, 1);
          if (this.d.skip(paramf.d) >= paramf.d)
            break;
          throw new EOFException();
        }
      }
      catch (IOException paramf)
      {
        throw new a(paramf);
      }
      String str1 = str2;
      if (!str2.startsWith("/"))
        continue;
      str1 = str2.substring(1);
    }
    if (paramf.e != -1L)
      this.e = paramf.e;
    while (true)
    {
      this.f = true;
      if (this.b != null)
        this.b.a();
      return this.e;
      this.e = this.d.available();
      if (this.e != 2147483647L)
        continue;
      this.e = -1L;
    }
  }

  public void a()
  {
    this.c = null;
    if (this.d != null);
    try
    {
      this.d.close();
      return;
    }
    catch (IOException localIOException)
    {
      throw new a(localIOException);
    }
    finally
    {
      this.d = null;
      if (this.f)
      {
        this.f = false;
        if (this.b != null)
          this.b.b();
      }
    }
    throw localObject;
  }

  public static final class a extends IOException
  {
    public a(IOException paramIOException)
    {
      super();
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.exoplayer.e.c
 * JD-Core Version:    0.6.0
 */