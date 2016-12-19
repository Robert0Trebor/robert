package org.vidogram.messenger.g.a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class b
{
  protected static final Comparator<byte[]> a = new Comparator()
  {
    public int a(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
    {
      return paramArrayOfByte1.length - paramArrayOfByte2.length;
    }
  };
  private List<byte[]> b = new LinkedList();
  private List<byte[]> c = new ArrayList(64);
  private int d = 0;
  private final int e;

  public b(int paramInt)
  {
    this.e = paramInt;
  }

  private void a()
  {
    monitorenter;
    try
    {
      if (this.d > this.e)
      {
        byte[] arrayOfByte = (byte[])this.b.remove(0);
        this.c.remove(arrayOfByte);
        this.d -= arrayOfByte.length;
      }
    }
    finally
    {
      monitorexit;
    }
  }

  public void a(byte[] paramArrayOfByte)
  {
    monitorenter;
    if (paramArrayOfByte != null);
    try
    {
      int i = paramArrayOfByte.length;
      int j = this.e;
      if (i > j);
      while (true)
      {
        return;
        this.b.add(paramArrayOfByte);
        j = Collections.binarySearch(this.c, paramArrayOfByte, a);
        i = j;
        if (j < 0)
          i = -j - 1;
        this.c.add(i, paramArrayOfByte);
        this.d += paramArrayOfByte.length;
        a();
      }
    }
    finally
    {
      monitorexit;
    }
    throw paramArrayOfByte;
  }

  public byte[] a(int paramInt)
  {
    monitorenter;
    int i = 0;
    try
    {
      byte[] arrayOfByte;
      if (i < this.c.size())
      {
        arrayOfByte = (byte[])this.c.get(i);
        if (arrayOfByte.length >= paramInt)
        {
          this.d -= arrayOfByte.length;
          this.c.remove(i);
          this.b.remove(arrayOfByte);
        }
      }
      while (true)
      {
        return arrayOfByte;
        i += 1;
        break;
        arrayOfByte = new byte[paramInt];
      }
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.g.a.b
 * JD-Core Version:    0.6.0
 */