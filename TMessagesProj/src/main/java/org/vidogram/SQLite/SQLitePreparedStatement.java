package org.vidogram.SQLite;

import java.nio.ByteBuffer;
import org.vidogram.messenger.n;
import org.vidogram.tgnet.NativeByteBuffer;

public class SQLitePreparedStatement
{
  private boolean a = false;
  private int b;
  private boolean c = false;

  public SQLitePreparedStatement(SQLiteDatabase paramSQLiteDatabase, String paramString, boolean paramBoolean)
  {
    this.c = paramBoolean;
    this.b = prepare(paramSQLiteDatabase.a(), paramString);
  }

  public int a()
  {
    return this.b;
  }

  public SQLiteCursor a(Object[] paramArrayOfObject)
  {
    if (paramArrayOfObject == null)
      throw new IllegalArgumentException();
    f();
    reset(this.b);
    int k = paramArrayOfObject.length;
    int j = 1;
    int i = 0;
    if (i < k)
    {
      Object localObject = paramArrayOfObject[i];
      if (localObject == null)
        bindNull(this.b, j);
      while (true)
      {
        j += 1;
        i += 1;
        break;
        if ((localObject instanceof Integer))
        {
          bindInt(this.b, j, ((Integer)localObject).intValue());
          continue;
        }
        if ((localObject instanceof Double))
        {
          bindDouble(this.b, j, ((Double)localObject).doubleValue());
          continue;
        }
        if (!(localObject instanceof String))
          break label149;
        bindString(this.b, j, (String)localObject);
      }
      label149: throw new IllegalArgumentException();
    }
    return new SQLiteCursor(this);
  }

  public void a(int paramInt)
  {
    bindNull(this.b, paramInt);
  }

  public void a(int paramInt, double paramDouble)
  {
    bindDouble(this.b, paramInt, paramDouble);
  }

  public void a(int paramInt1, int paramInt2)
  {
    bindInt(this.b, paramInt1, paramInt2);
  }

  public void a(int paramInt, long paramLong)
  {
    bindLong(this.b, paramInt, paramLong);
  }

  public void a(int paramInt, String paramString)
  {
    bindString(this.b, paramInt, paramString);
  }

  public void a(int paramInt, NativeByteBuffer paramNativeByteBuffer)
  {
    bindByteBuffer(this.b, paramInt, paramNativeByteBuffer.b, paramNativeByteBuffer.b());
  }

  public int b()
  {
    return step(this.b);
  }

  native void bindByteBuffer(int paramInt1, int paramInt2, ByteBuffer paramByteBuffer, int paramInt3);

  native void bindDouble(int paramInt1, int paramInt2, double paramDouble);

  native void bindInt(int paramInt1, int paramInt2, int paramInt3);

  native void bindLong(int paramInt1, int paramInt2, long paramLong);

  native void bindNull(int paramInt1, int paramInt2);

  native void bindString(int paramInt1, int paramInt2, String paramString);

  public SQLitePreparedStatement c()
  {
    step(this.b);
    return this;
  }

  public void d()
  {
    f();
    reset(this.b);
  }

  public void e()
  {
    if (this.c)
      g();
  }

  void f()
  {
    if (this.a)
      throw new a("Prepared query finalized");
  }

  native void finalize(int paramInt);

  public void g()
  {
    if (this.a)
      return;
    try
    {
      this.a = true;
      finalize(this.b);
      return;
    }
    catch (a locala)
    {
      n.a("tmessages", locala.getMessage(), locala);
    }
  }

  native int prepare(int paramInt, String paramString);

  native void reset(int paramInt);

  native int step(int paramInt);
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.SQLite.SQLitePreparedStatement
 * JD-Core Version:    0.6.0
 */