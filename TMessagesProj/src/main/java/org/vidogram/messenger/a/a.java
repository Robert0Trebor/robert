package org.vidogram.messenger.a;

import android.graphics.Bitmap;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.RandomAccessFile;
import org.vidogram.messenger.a.b.m;

public abstract class a
{
  protected String a;
  protected String b;
  protected long c;
  protected String d;
  protected String e;
  protected String f;
  protected String g;
  protected short h;
  protected String i;
  protected String j;
  protected short k;
  protected short l;
  protected short m;
  protected short n;
  protected String o;
  protected String p;
  protected String q;
  protected boolean r;
  protected String s;
  protected Bitmap t;
  protected Bitmap u;

  public static a a(File paramFile)
  {
    try
    {
      byte[] arrayOfByte = new byte[12];
      Object localObject = new RandomAccessFile(paramFile, "r");
      ((RandomAccessFile)localObject).readFully(arrayOfByte, 0, 8);
      ((RandomAccessFile)localObject).close();
      localObject = new BufferedInputStream(new FileInputStream(paramFile));
      if ((arrayOfByte[4] == 102) && (arrayOfByte[5] == 116) && (arrayOfByte[6] == 121) && (arrayOfByte[7] == 112))
        return new org.vidogram.messenger.a.a.a((InputStream)localObject);
      paramFile = new m((InputStream)localObject, paramFile.length());
      return paramFile;
    }
    catch (java.lang.Exception paramFile)
    {
    }
    return (a)null;
  }

  public long a()
  {
    return this.c;
  }

  public String b()
  {
    return this.d;
  }

  public String c()
  {
    return this.e;
  }

  public String d()
  {
    return this.f;
  }

  public String e()
  {
    return this.g;
  }

  public short f()
  {
    return this.h;
  }

  public String g()
  {
    return this.i;
  }

  public String h()
  {
    return this.j;
  }

  public short i()
  {
    return this.k;
  }

  public short j()
  {
    return this.l;
  }

  public short k()
  {
    return this.m;
  }

  public short l()
  {
    return this.n;
  }

  public String m()
  {
    return this.o;
  }

  public String n()
  {
    return this.p;
  }

  public String o()
  {
    return this.q;
  }

  public boolean p()
  {
    return this.r;
  }

  public String q()
  {
    return this.s;
  }

  public Bitmap r()
  {
    return this.t;
  }

  public Bitmap s()
  {
    return this.u;
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.a.a
 * JD-Core Version:    0.6.0
 */