package org.vidogram.messenger.a.a;

import java.io.InputStream;
import org.vidogram.messenger.a.c.a;

public final class d extends c<a>
{
  public d(InputStream paramInputStream)
  {
    super(new a(paramInputStream), null, "");
  }

  public b a(String paramString)
  {
    b localb;
    do
      localb = t();
    while (!localb.o().matches(paramString));
    return localb;
  }

  public String toString()
  {
    return "mp4[pos=" + q() + "]";
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.a.a.d
 * JD-Core Version:    0.6.0
 */