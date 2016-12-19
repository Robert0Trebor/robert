package org.vidogram.messenger.exoplayer.e;

import android.text.TextUtils;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import org.vidogram.messenger.exoplayer.f.o;
import org.vidogram.messenger.exoplayer.f.r;

public abstract interface k extends n
{
  public static final o<String> a = new o()
  {
    public boolean a(String paramString)
    {
      paramString = r.b(paramString);
      return (!TextUtils.isEmpty(paramString)) && ((!paramString.contains("text")) || (paramString.contains("text/vtt"))) && (!paramString.contains("html")) && (!paramString.contains("xml"));
    }
  };

  public static class a extends IOException
  {
    public final int a;
    public final f b;

    public a(IOException paramIOException, f paramf, int paramInt)
    {
      super();
      this.b = paramf;
      this.a = paramInt;
    }

    public a(String paramString, IOException paramIOException, f paramf, int paramInt)
    {
      super(paramIOException);
      this.b = paramf;
      this.a = paramInt;
    }

    public a(String paramString, f paramf, int paramInt)
    {
      super();
      this.b = paramf;
      this.a = paramInt;
    }
  }

  public static final class b extends k.a
  {
    public final String c;

    public b(String paramString, f paramf)
    {
      super(paramf, 1);
      this.c = paramString;
    }
  }

  public static final class c extends k.a
  {
    public final int c;
    public final Map<String, List<String>> d;

    public c(int paramInt, Map<String, List<String>> paramMap, f paramf)
    {
      super(paramf, 1);
      this.c = paramInt;
      this.d = paramMap;
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.exoplayer.e.k
 * JD-Core Version:    0.6.0
 */