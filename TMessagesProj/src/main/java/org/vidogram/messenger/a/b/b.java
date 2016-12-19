package org.vidogram.messenger.a.b;

import java.io.EOFException;
import java.io.InputStream;

public class b extends org.vidogram.messenger.a.a
{
  public b(InputStream paramInputStream)
  {
    if (a(paramInputStream))
    {
      this.a = "ID3";
      this.b = "1.0";
      paramInputStream = a(paramInputStream, 128);
      this.d = a(paramInputStream, 3, 30);
      this.e = a(paramInputStream, 33, 30);
      this.g = a(paramInputStream, 63, 30);
    }
    try
    {
      this.h = Short.parseShort(a(paramInputStream, 93, 4));
      this.j = a(paramInputStream, 97, 30);
      a locala = a.a(paramInputStream[127]);
      if (locala != null)
        this.i = locala.a();
      if ((paramInputStream[125] == 0) && (paramInputStream[126] != 0))
      {
        this.b = "1.1";
        this.k = (short)(paramInputStream[126] & 0xFF);
      }
      return;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      while (true)
        this.h = 0;
    }
  }

  public static boolean a(InputStream paramInputStream)
  {
    paramInputStream.mark(3);
    try
    {
      if ((paramInputStream.read() == 84) && (paramInputStream.read() == 65))
      {
        int i = paramInputStream.read();
        if (i == 71)
        {
          j = 1;
          return j;
        }
      }
      int j = 0;
    }
    finally
    {
      paramInputStream.reset();
    }
  }

  String a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    try
    {
      paramArrayOfByte = new String(paramArrayOfByte, paramInt1, paramInt2, "ISO-8859-1");
      paramInt1 = paramArrayOfByte.indexOf(0);
      if (paramInt1 < 0)
        return paramArrayOfByte;
      paramArrayOfByte = paramArrayOfByte.substring(0, paramInt1);
      return paramArrayOfByte;
    }
    catch (java.lang.Exception paramArrayOfByte)
    {
    }
    return "";
  }

  byte[] a(InputStream paramInputStream, int paramInt)
  {
    int i = 0;
    byte[] arrayOfByte = new byte[paramInt];
    while (i < paramInt)
    {
      int j = paramInputStream.read(arrayOfByte, i, paramInt - i);
      if (j > 0)
      {
        i += j;
        continue;
      }
      throw new EOFException();
    }
    return arrayOfByte;
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.a.b.b
 * JD-Core Version:    0.6.0
 */