package org.vidogram.messenger.exoplayer.b;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.vidogram.messenger.exoplayer.f.b;

public abstract interface a
{
  public static final class a
    implements a
  {
    private final Map<UUID, a.b> a = new HashMap();

    public void a(UUID paramUUID, a.b paramb)
    {
      this.a.put(paramUUID, paramb);
    }
  }

  public static final class b
  {
    public final String a;
    public final byte[] b;

    public b(String paramString, byte[] paramArrayOfByte)
    {
      this.a = ((String)b.a(paramString));
      this.b = ((byte[])b.a(paramArrayOfByte));
    }

    public boolean equals(Object paramObject)
    {
      int j = 1;
      int i;
      if (!(paramObject instanceof b))
        i = 0;
      do
      {
        do
        {
          return i;
          i = j;
        }
        while (paramObject == this);
        paramObject = (b)paramObject;
        if (!this.a.equals(paramObject.a))
          break;
        i = j;
      }
      while (Arrays.equals(this.b, paramObject.b));
      return false;
    }

    public int hashCode()
    {
      return this.a.hashCode() + Arrays.hashCode(this.b) * 31;
    }
  }

  public static final class c
    implements a
  {
    private a.b a;

    public c(a.b paramb)
    {
      this.a = paramb;
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.exoplayer.b.a
 * JD-Core Version:    0.6.0
 */