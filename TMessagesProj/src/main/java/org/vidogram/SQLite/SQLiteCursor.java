package org.vidogram.SQLite;

import org.vidogram.messenger.n;
import org.vidogram.tgnet.NativeByteBuffer;

public class SQLiteCursor
{
  SQLitePreparedStatement a;
  boolean b = false;

  public SQLiteCursor(SQLitePreparedStatement paramSQLitePreparedStatement)
  {
    this.a = paramSQLitePreparedStatement;
  }

  public boolean a()
  {
    int i = this.a.step(this.a.a());
    int j = i;
    int k;
    if (i == -1)
    {
      j = 6;
      k = j - 1;
      if (j == 0)
        break label120;
    }
    label96: label120: 
    while (true)
    {
      try
      {
        n.a("tmessages", "sqlite busy, waiting...");
        Thread.sleep(500L);
        j = this.a.b();
        i = j;
        if (i != 0)
          continue;
        j = i;
        if (i != -1)
          break label96;
        throw new a("sqlite busy");
        j = k;
      }
      catch (Exception localException)
      {
        n.a("tmessages", localException);
        j = k;
      }
      break;
      if (j == 0);
      for (boolean bool = true; ; bool = false)
      {
        this.b = bool;
        return this.b;
      }
    }
  }

  public boolean a(int paramInt)
  {
    c();
    return columnIsNull(this.a.a(), paramInt) == 1;
  }

  public int b(int paramInt)
  {
    c();
    return columnIntValue(this.a.a(), paramInt);
  }

  public void b()
  {
    this.a.e();
  }

  public double c(int paramInt)
  {
    c();
    return columnDoubleValue(this.a.a(), paramInt);
  }

  void c()
  {
    if (!this.b)
      throw new a("You must call next before");
  }

  native byte[] columnByteArrayValue(int paramInt1, int paramInt2);

  native int columnByteBufferValue(int paramInt1, int paramInt2);

  native double columnDoubleValue(int paramInt1, int paramInt2);

  native int columnIntValue(int paramInt1, int paramInt2);

  native int columnIsNull(int paramInt1, int paramInt2);

  native long columnLongValue(int paramInt1, int paramInt2);

  native String columnStringValue(int paramInt1, int paramInt2);

  public long d(int paramInt)
  {
    c();
    return columnLongValue(this.a.a(), paramInt);
  }

  public String e(int paramInt)
  {
    c();
    return columnStringValue(this.a.a(), paramInt);
  }

  public byte[] f(int paramInt)
  {
    c();
    return columnByteArrayValue(this.a.a(), paramInt);
  }

  public NativeByteBuffer g(int paramInt)
  {
    c();
    paramInt = columnByteBufferValue(this.a.a(), paramInt);
    if (paramInt != 0)
      return NativeByteBuffer.b(paramInt);
    return null;
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.SQLite.SQLiteCursor
 * JD-Core Version:    0.6.0
 */