package org.vidogram.messenger.a.b;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.zip.InflaterInputStream;
import org.vidogram.messenger.a.c.b;

public class i
{
  private final b a;
  private final j b;
  private final c c;

  i(InputStream paramInputStream, long paramLong, int paramInt, j paramj)
  {
    this.a = new b(paramInputStream, paramLong, paramInt);
    this.c = new c(this.a);
    this.b = paramj;
  }

  public c a()
  {
    return this.c;
  }

  public f a(g paramg)
  {
    int j = paramg.c();
    Object localObject = this.a;
    if (paramg.f())
    {
      localObject = this.c.a(paramg.c());
      int i1 = localObject.length;
      int k = 0;
      j = 0;
      int n = 0;
      if (k < i1)
      {
        int i = localObject[k];
        int m;
        if (n != 0)
        {
          m = j;
          if (i == 0);
        }
        else
        {
          localObject[j] = i;
          m = j + 1;
        }
        if (i == 255);
        for (j = 1; ; j = 0)
        {
          k += 1;
          n = j;
          j = m;
          break;
        }
      }
      localObject = new ByteArrayInputStream(localObject, 0, j);
    }
    while (true)
    {
      if (paramg.e())
        throw new e("Frame encryption is not supported");
      if (paramg.d())
      {
        j = paramg.g();
        localObject = new InflaterInputStream((InputStream)localObject);
      }
      while (true)
        return new f((InputStream)localObject, paramg.b(), j, this.b, paramg);
    }
  }

  public long b()
  {
    return this.a.a();
  }

  public long c()
  {
    return this.a.b();
  }

  public j d()
  {
    return this.b;
  }

  public String toString()
  {
    return "id3v2tag[pos=" + b() + ", " + c() + " left]";
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.a.b.i
 * JD-Core Version:    0.6.0
 */