package org.vidogram.messenger.g.a;

import java.io.UnsupportedEncodingException;
import org.vidogram.messenger.g.l;
import org.vidogram.messenger.g.n;
import org.vidogram.messenger.g.n.a;
import org.vidogram.messenger.g.n.b;
import org.vidogram.messenger.g.t;

public abstract class i<T> extends l<T>
{
  private static final String a = String.format("application/json; charset=%s", new Object[] { "utf-8" });
  private final n.b<T> b;
  private final String c;

  public i(int paramInt, String paramString1, String paramString2, n.b<T> paramb, n.a parama)
  {
    super(paramInt, paramString1, parama);
    this.b = paramb;
    this.c = paramString2;
  }

  protected abstract n<T> a(org.vidogram.messenger.g.i parami);

  protected void b(T paramT)
  {
    this.b.a(paramT);
  }

  public String l()
  {
    return p();
  }

  public byte[] m()
  {
    return q();
  }

  public String p()
  {
    return a;
  }

  public byte[] q()
  {
    try
    {
      if (this.c == null)
        return null;
      byte[] arrayOfByte = this.c.getBytes("utf-8");
      return arrayOfByte;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      t.d("Unsupported Encoding while trying to get the bytes of %s using %s", new Object[] { this.c, "utf-8" });
    }
    return null;
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.g.a.i
 * JD-Core Version:    0.6.0
 */