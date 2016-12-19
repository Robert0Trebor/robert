package org.vidogram.messenger.a.b;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import org.vidogram.messenger.a.c.a;

public class j
{
  private int a = 0;
  private int b = 0;
  private int c = 0;
  private int d = 0;
  private int e = 0;
  private int f = 0;
  private boolean g;
  private boolean h;

  public j(InputStream paramInputStream)
  {
    this(new a(paramInputStream));
  }

  j(a parama)
  {
    long l = parama.a();
    c localc = new c(parama);
    String str = new String(localc.a(3), "ISO-8859-1");
    if (!"ID3".equals(str))
      throw new e("Invalid ID3 identifier: " + str);
    this.a = localc.a();
    if ((this.a != 2) && (this.a != 3) && (this.a != 4))
      throw new e("Unsupported ID3v2 version: " + this.a);
    this.b = localc.a();
    int i = localc.a();
    this.d = (localc.c() + 10);
    if (this.a == 2)
      if ((i & 0x80) != 0)
      {
        bool1 = true;
        this.g = bool1;
        if ((i & 0x40) == 0)
          break label262;
        bool1 = bool2;
        label237: this.h = bool1;
      }
    label389: 
    while (true)
    {
      this.c = (int)(parama.a() - l);
      return;
      bool1 = false;
      break;
      label262: bool1 = false;
      break label237;
      if ((i & 0x80) != 0)
      {
        label276: this.g = bool1;
        if ((i & 0x40) != 0)
        {
          if (this.a != 3)
            break label375;
          int j = localc.b();
          localc.a();
          localc.a();
          this.e = localc.b();
          localc.a(j - 6);
        }
      }
      while (true)
      {
        if ((this.a < 4) || ((i & 0x10) == 0))
          break label389;
        this.f = 10;
        this.d += 10;
        break;
        bool1 = false;
        break label276;
        label375: localc.a(localc.c() - 4);
      }
    }
  }

  public int a()
  {
    return this.a;
  }

  public i a(InputStream paramInputStream)
  {
    if (this.h)
      throw new e("Tag compression is not supported");
    if ((this.a < 4) && (this.g))
    {
      paramInputStream = new c(paramInputStream).a(this.d - this.c);
      int i1 = paramInputStream.length;
      int k = 0;
      int j = 0;
      int n = 0;
      if (k < i1)
      {
        int i = paramInputStream[k];
        int m;
        if (n != 0)
        {
          m = j;
          if (i == 0);
        }
        else
        {
          paramInputStream[j] = i;
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
      return new i(new ByteArrayInputStream(paramInputStream, 0, j), this.c, j, this);
    }
    return new i(paramInputStream, this.c, this.d - this.c - this.f, this);
  }

  public int b()
  {
    return this.b;
  }

  public int c()
  {
    return this.f;
  }

  public String toString()
  {
    return String.format("%s[version=%s, totalTagSize=%d]", new Object[] { getClass().getSimpleName(), Integer.valueOf(this.a), Integer.valueOf(this.d) });
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.a.b.j
 * JD-Core Version:    0.6.0
 */