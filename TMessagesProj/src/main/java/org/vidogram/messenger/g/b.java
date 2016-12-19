package org.vidogram.messenger.g;

import java.util.Collections;
import java.util.Map;

public abstract interface b
{
  public abstract a a(String paramString);

  public abstract void a();

  public abstract void a(String paramString, a parama);

  public static class a
  {
    public byte[] a;
    public String b;
    public long c;
    public long d;
    public long e;
    public long f;
    public Map<String, String> g = Collections.emptyMap();

    public boolean a()
    {
      return this.e < System.currentTimeMillis();
    }

    public boolean b()
    {
      return this.f < System.currentTimeMillis();
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.g.b
 * JD-Core Version:    0.6.0
 */