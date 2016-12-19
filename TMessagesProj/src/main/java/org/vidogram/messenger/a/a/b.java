package org.vidogram.messenger.a.a;

import java.io.DataInput;
import java.io.EOFException;
import java.io.IOException;
import java.math.BigDecimal;

public class b extends c<org.vidogram.messenger.a.c.b>
{
  public b(org.vidogram.messenger.a.c.b paramb, c<?> paramc, String paramString)
  {
    super(paramb, paramc, paramString);
  }

  private StringBuffer a(StringBuffer paramStringBuffer, c<?> paramc)
  {
    if (paramc.p() != null)
    {
      a(paramStringBuffer, paramc.p());
      paramStringBuffer.append("/");
    }
    return paramStringBuffer.append(paramc.o());
  }

  public long a()
  {
    long l = ((org.vidogram.messenger.a.c.b)r()).a();
    return ((org.vidogram.messenger.a.c.b)r()).b() + l;
  }

  public String a(int paramInt, String paramString)
  {
    paramString = new String(a(paramInt), paramString);
    paramInt = paramString.indexOf(0);
    if (paramInt < 0)
      return paramString;
    return paramString.substring(0, paramInt);
  }

  public b a(String paramString)
  {
    while (c() > 0L)
    {
      b localb = t();
      if (localb.o().matches(paramString))
        return localb;
    }
    throw new IOException("atom type mismatch, not found: " + paramString);
  }

  public byte[] a(int paramInt)
  {
    byte[] arrayOfByte = new byte[paramInt];
    this.a.readFully(arrayOfByte);
    return arrayOfByte;
  }

  public long b()
  {
    return p().q() - q();
  }

  public String b(String paramString)
  {
    return a((int)c(), paramString);
  }

  public void b(int paramInt)
  {
    int i = 0;
    while (i < paramInt)
    {
      int j = this.a.skipBytes(paramInt - i);
      if (j > 0)
      {
        i += j;
        continue;
      }
      throw new EOFException();
    }
  }

  public long c()
  {
    return ((org.vidogram.messenger.a.c.b)r()).b();
  }

  public boolean d()
  {
    long l;
    if (s() != null)
      l = s().c();
    while (l < c())
    {
      return true;
      l = 0L;
    }
    return false;
  }

  public boolean e()
  {
    return this.a.readBoolean();
  }

  public byte f()
  {
    return this.a.readByte();
  }

  public short g()
  {
    return this.a.readShort();
  }

  public int h()
  {
    return this.a.readInt();
  }

  public long i()
  {
    return this.a.readLong();
  }

  public byte[] j()
  {
    return a((int)c());
  }

  public BigDecimal k()
  {
    int i = this.a.readByte();
    int j = this.a.readUnsignedByte();
    return new BigDecimal(String.valueOf(i) + "" + String.valueOf(j));
  }

  public BigDecimal l()
  {
    int i = this.a.readShort();
    int j = this.a.readUnsignedShort();
    return new BigDecimal(String.valueOf(i) + "" + String.valueOf(j));
  }

  public void m()
  {
    while (c() > 0L)
    {
      if (((org.vidogram.messenger.a.c.b)r()).skip(c()) != 0L)
        continue;
      throw new EOFException("Cannot skip atom");
    }
  }

  public String n()
  {
    return a(new StringBuffer(), this).toString();
  }

  public String toString()
  {
    StringBuffer localStringBuffer = new StringBuffer();
    a(localStringBuffer, this);
    localStringBuffer.append("[off=");
    localStringBuffer.append(b());
    localStringBuffer.append(",pos=");
    localStringBuffer.append(q());
    localStringBuffer.append(",len=");
    localStringBuffer.append(a());
    localStringBuffer.append("]");
    return localStringBuffer.toString();
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.a.a.b
 * JD-Core Version:    0.6.0
 */