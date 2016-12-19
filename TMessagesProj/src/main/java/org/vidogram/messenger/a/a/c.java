package org.vidogram.messenger.a.a;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.IOException;
import org.vidogram.messenger.a.c.a;

public class c<I extends a>
{
  protected final DataInput a;
  private final I b;
  private final c<?> c;
  private final String d;
  private b e;

  public c(I paramI, c<?> paramc, String paramString)
  {
    this.b = paramI;
    this.c = paramc;
    this.d = paramString;
    this.a = new DataInputStream(paramI);
  }

  public b c(String paramString)
  {
    b localb = t();
    if (localb.o().matches(paramString))
      return localb;
    throw new IOException("atom type mismatch, expected " + paramString + ", got " + localb.o());
  }

  public String o()
  {
    return this.d;
  }

  public c<?> p()
  {
    return this.c;
  }

  public long q()
  {
    return this.b.a();
  }

  public I r()
  {
    return this.b;
  }

  protected b s()
  {
    return this.e;
  }

  public b t()
  {
    if (this.e != null)
      this.e.m();
    int i = this.a.readInt();
    Object localObject = new byte[4];
    this.a.readFully(localObject);
    String str = new String(localObject, "ISO8859_1");
    if (i == 1);
    for (localObject = new org.vidogram.messenger.a.c.b(this.b, 16L, this.a.readLong() - 16L); ; localObject = new org.vidogram.messenger.a.c.b(this.b, 8L, i - 8))
    {
      localObject = new b((org.vidogram.messenger.a.c.b)localObject, this, str);
      this.e = ((b)localObject);
      return localObject;
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.a.a.c
 * JD-Core Version:    0.6.0
 */