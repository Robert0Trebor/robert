package org.vidogram.messenger.a.b;

import java.io.InputStream;
import java.nio.charset.Charset;
import org.vidogram.messenger.a.c.b;

public class f
{
  static final ThreadLocal<a> a = new ThreadLocal()
  {
    protected f.a a()
    {
      return new f.a(4096);
    }
  };
  private final b b;
  private final j c;
  private final g d;
  private final c e;

  f(InputStream paramInputStream, long paramLong, int paramInt, j paramj, g paramg)
  {
    this.b = new b(paramInputStream, paramLong, paramInt);
    this.e = new c(this.b);
    this.c = paramj;
    this.d = paramg;
  }

  private String a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, d paramd, boolean paramBoolean)
  {
    int k = paramInt2;
    int j;
    int i;
    if (paramBoolean)
    {
      j = 0;
      i = 0;
    }
    while (true)
    {
      k = paramInt2;
      if (j < paramInt2)
      {
        if ((paramArrayOfByte[(paramInt1 + j)] != 0) || ((paramd == d.b) && (i == 0) && ((paramInt1 + j) % 2 != 0)))
          break label141;
        k = i + 1;
        i = k;
        if (k != paramd.b())
          break label144;
        k = j + 1 - paramd.b();
      }
      try
      {
        paramd = new String(paramArrayOfByte, paramInt1, k, paramd.a().name());
        paramArrayOfByte = paramd;
        if (paramd.length() > 0)
        {
          paramArrayOfByte = paramd;
          if (paramd.charAt(0) == 65279)
            paramArrayOfByte = paramd.substring(1);
        }
        return paramArrayOfByte;
        label141: i = 0;
        label144: j += 1;
      }
      catch (java.lang.Exception paramArrayOfByte)
      {
      }
    }
    return "";
  }

  public String a(int paramInt, d paramd)
  {
    int m = Math.min(paramInt, (int)c());
    byte[] arrayOfByte = ((a)a.get()).a(m);
    int j = 0;
    paramInt = 0;
    while (j < m)
    {
      int i = this.e.a();
      arrayOfByte[j] = i;
      if ((i == 0) && ((paramd != d.b) || (paramInt != 0) || (j % 2 == 0)))
      {
        int k = paramInt + 1;
        paramInt = k;
        if (k == paramd.b())
          return a(arrayOfByte, 0, j + 1 - paramd.b(), paramd, false);
      }
      else
      {
        paramInt = 0;
      }
      j += 1;
    }
    throw new e("Could not read zero-termiated string");
  }

  public c a()
  {
    return this.e;
  }

  public long b()
  {
    return this.b.a();
  }

  public String b(int paramInt, d paramd)
  {
    if (paramInt > c())
      throw new e("Could not read fixed-length string of length: " + paramInt);
    byte[] arrayOfByte = ((a)a.get()).a(paramInt);
    this.e.a(arrayOfByte, 0, paramInt);
    return a(arrayOfByte, 0, paramInt, paramd, true);
  }

  public long c()
  {
    return this.b.b();
  }

  public j d()
  {
    return this.c;
  }

  public g e()
  {
    return this.d;
  }

  public d f()
  {
    int i = this.e.a();
    switch (i)
    {
    default:
      throw new e("Invalid encoding: " + i);
    case 0:
      return d.a;
    case 1:
      return d.b;
    case 2:
      return d.c;
    case 3:
    }
    return d.d;
  }

  public String toString()
  {
    return "id3v2frame[pos=" + b() + ", " + c() + " left]";
  }

  static final class a
  {
    byte[] a;

    a(int paramInt)
    {
      this.a = new byte[paramInt];
    }

    byte[] a(int paramInt)
    {
      if (paramInt > this.a.length)
      {
        int i = this.a.length * 2;
        while (paramInt > i)
          i *= 2;
        this.a = new byte[i];
      }
      return this.a;
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.a.b.f
 * JD-Core Version:    0.6.0
 */