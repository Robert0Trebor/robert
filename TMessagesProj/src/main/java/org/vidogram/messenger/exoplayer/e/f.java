package org.vidogram.messenger.exoplayer.e;

import android.net.Uri;
import java.util.Arrays;
import org.vidogram.messenger.exoplayer.f.b;

public final class f
{
  public final Uri a;
  public final byte[] b;
  public final long c;
  public final long d;
  public final long e;
  public final String f;
  public final int g;

  public f(Uri paramUri, long paramLong1, long paramLong2, long paramLong3, String paramString, int paramInt)
  {
    this(paramUri, null, paramLong1, paramLong2, paramLong3, paramString, paramInt);
  }

  public f(Uri paramUri, long paramLong1, long paramLong2, String paramString)
  {
    this(paramUri, paramLong1, paramLong1, paramLong2, paramString, 0);
  }

  public f(Uri paramUri, byte[] paramArrayOfByte, long paramLong1, long paramLong2, long paramLong3, String paramString, int paramInt)
  {
    if (paramLong1 >= 0L)
    {
      bool = true;
      b.a(bool);
      if (paramLong2 < 0L)
        break label103;
      bool = true;
      label28: b.a(bool);
      if ((paramLong3 <= 0L) && (paramLong3 != -1L))
        break label109;
    }
    label103: label109: for (boolean bool = true; ; bool = false)
    {
      b.a(bool);
      this.a = paramUri;
      this.b = paramArrayOfByte;
      this.c = paramLong1;
      this.d = paramLong2;
      this.e = paramLong3;
      this.f = paramString;
      this.g = paramInt;
      return;
      bool = false;
      break;
      bool = false;
      break label28;
    }
  }

  public String toString()
  {
    return "DataSpec[" + this.a + ", " + Arrays.toString(this.b) + ", " + this.c + ", " + this.d + ", " + this.e + ", " + this.f + ", " + this.g + "]";
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.exoplayer.e.f
 * JD-Core Version:    0.6.0
 */