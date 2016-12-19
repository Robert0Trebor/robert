package org.vidogram.SQLite;

import java.io.File;
import org.vidogram.messenger.ApplicationLoader;
import org.vidogram.messenger.n;

public class SQLiteDatabase
{
  private final int a = opendb(paramString, ApplicationLoader.h().getPath());
  private boolean b = false;
  private boolean c = false;

  public SQLiteDatabase(String paramString)
  {
  }

  public int a()
  {
    return this.a;
  }

  public Integer a(String paramString, Object[] paramArrayOfObject)
  {
    c();
    paramString = b(paramString, paramArrayOfObject);
    try
    {
      boolean bool = paramString.a();
      if (!bool)
        return null;
      int i = paramString.b(0);
      return Integer.valueOf(i);
    }
    finally
    {
      paramString.b();
    }
    throw paramArrayOfObject;
  }

  public SQLitePreparedStatement a(String paramString)
  {
    return new SQLitePreparedStatement(this, paramString, true);
  }

  public SQLiteCursor b(String paramString, Object[] paramArrayOfObject)
  {
    c();
    return new SQLitePreparedStatement(this, paramString, true).a(paramArrayOfObject);
  }

  public void b()
  {
    if (this.b);
    try
    {
      e();
      closedb(this.a);
      this.b = false;
      return;
    }
    catch (a locala)
    {
      while (true)
        n.a("tmessages", locala.getMessage(), locala);
    }
  }

  native void beginTransaction(int paramInt);

  void c()
  {
    if (!this.b)
      throw new a("Database closed");
  }

  native void closedb(int paramInt);

  native void commitTransaction(int paramInt);

  public void d()
  {
    if (this.c)
      throw new a("database already in transaction");
    this.c = true;
    beginTransaction(this.a);
  }

  public void e()
  {
    if (!this.c)
      return;
    this.c = false;
    commitTransaction(this.a);
  }

  public void finalize()
  {
    super.finalize();
    b();
  }

  native int opendb(String paramString1, String paramString2);
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.SQLite.SQLiteDatabase
 * JD-Core Version:    0.6.0
 */