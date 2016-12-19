package org.vidogram.messenger.d;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import org.vidogram.SQLite.SQLiteCursor;
import org.vidogram.SQLite.SQLiteDatabase;
import org.vidogram.SQLite.SQLitePreparedStatement;
import org.vidogram.messenger.h;
import org.vidogram.messenger.n;
import org.vidogram.messenger.w;
import org.vidogram.messenger.y;
import org.vidogram.tgnet.NativeByteBuffer;
import org.vidogram.tgnet.g.ar;
import org.vidogram.tgnet.g.b;

public class a
{
  private static HashMap<Integer, g.b> a = new HashMap();
  private static HashMap<Long, g.ar> b = new HashMap();
  private static HashMap<Integer, Long> c = new HashMap();

  public static void a(int paramInt1, boolean paramBoolean, int paramInt2)
  {
    if (paramBoolean)
    {
      g.b localb = (g.b)a.get(Integer.valueOf(paramInt1));
      if (localb != null)
      {
        y.a().a(y.T, new Object[] { localb, Integer.valueOf(paramInt2) });
        return;
      }
    }
    w.a().c().b(new Runnable(paramInt1, paramInt2)
    {
      public void run()
      {
        Object localObject2 = null;
        try
        {
          SQLiteCursor localSQLiteCursor = w.a().b().b(String.format(Locale.US, "SELECT info FROM bot_info WHERE uid = %d", new Object[] { Integer.valueOf(this.a) }), new Object[0]);
          Object localObject1 = localObject2;
          if (localSQLiteCursor.a())
          {
            localObject1 = localObject2;
            if (!localSQLiteCursor.a(0))
            {
              NativeByteBuffer localNativeByteBuffer = localSQLiteCursor.g(0);
              localObject1 = localObject2;
              if (localNativeByteBuffer != null)
              {
                localObject1 = g.b.a(localNativeByteBuffer, localNativeByteBuffer.b(false), false);
                localNativeByteBuffer.e();
              }
            }
          }
          localSQLiteCursor.b();
          if (localObject1 != null)
            org.vidogram.messenger.a.a(new Runnable((g.b)localObject1)
            {
              public void run()
              {
                y.a().a(y.T, new Object[] { this.a, Integer.valueOf(a.3.this.b) });
              }
            });
          return;
        }
        catch (Exception localException)
        {
          n.a("tmessages", localException);
        }
      }
    });
  }

  public static void a(long paramLong)
  {
    g.ar localar = (g.ar)b.get(Long.valueOf(paramLong));
    if (localar != null)
    {
      y.a().a(y.V, new Object[] { localar, Long.valueOf(paramLong) });
      return;
    }
    w.a().c().b(new Runnable(paramLong)
    {
      public void run()
      {
        Object localObject2 = null;
        try
        {
          SQLiteCursor localSQLiteCursor = w.a().b().b(String.format(Locale.US, "SELECT info FROM bot_keyboard WHERE uid = %d", new Object[] { Long.valueOf(this.a) }), new Object[0]);
          Object localObject1 = localObject2;
          if (localSQLiteCursor.a())
          {
            localObject1 = localObject2;
            if (!localSQLiteCursor.a(0))
            {
              NativeByteBuffer localNativeByteBuffer = localSQLiteCursor.g(0);
              localObject1 = localObject2;
              if (localNativeByteBuffer != null)
              {
                localObject1 = g.ar.a(localNativeByteBuffer, localNativeByteBuffer.b(false), false);
                localNativeByteBuffer.e();
              }
            }
          }
          localSQLiteCursor.b();
          if (localObject1 != null)
            org.vidogram.messenger.a.a(new Runnable((g.ar)localObject1)
            {
              public void run()
              {
                y.a().a(y.V, new Object[] { this.a, Long.valueOf(a.2.this.a) });
              }
            });
          return;
        }
        catch (Exception localException)
        {
          n.a("tmessages", localException);
        }
      }
    });
  }

  public static void a(long paramLong, ArrayList<Integer> paramArrayList)
  {
    org.vidogram.messenger.a.a(new Runnable(paramArrayList, paramLong)
    {
      public void run()
      {
        if (this.a != null)
        {
          int i = 0;
          while (i < this.a.size())
          {
            Long localLong = (Long)a.a().get(this.a.get(i));
            if (localLong != null)
            {
              a.b().remove(localLong);
              a.a().remove(this.a.get(i));
              y.a().a(y.V, new Object[] { null, localLong });
            }
            i += 1;
          }
        }
        a.b().remove(Long.valueOf(this.b));
        y.a().a(y.V, new Object[] { null, Long.valueOf(this.b) });
      }
    });
  }

  public static void a(long paramLong, g.ar paramar)
  {
    int i = 0;
    if (paramar == null);
    while (true)
    {
      return;
      try
      {
        Object localObject = w.a().b().b(String.format(Locale.US, "SELECT mid FROM bot_keyboard WHERE uid = %d", new Object[] { Long.valueOf(paramLong) }), new Object[0]);
        if (((SQLiteCursor)localObject).a())
          i = ((SQLiteCursor)localObject).b(0);
        ((SQLiteCursor)localObject).b();
        if (i >= paramar.b)
          continue;
        localObject = w.a().b().a("REPLACE INTO bot_keyboard VALUES(?, ?, ?)");
        ((SQLitePreparedStatement)localObject).d();
        NativeByteBuffer localNativeByteBuffer = new NativeByteBuffer(paramar.b());
        paramar.a(localNativeByteBuffer);
        ((SQLitePreparedStatement)localObject).a(1, paramLong);
        ((SQLitePreparedStatement)localObject).a(2, paramar.b);
        ((SQLitePreparedStatement)localObject).a(3, localNativeByteBuffer);
        ((SQLitePreparedStatement)localObject).b();
        localNativeByteBuffer.e();
        ((SQLitePreparedStatement)localObject).e();
        org.vidogram.messenger.a.a(new Runnable(paramLong, paramar)
        {
          public void run()
          {
            g.ar localar = (g.ar)a.b().put(Long.valueOf(this.a), this.b);
            if (localar != null)
              a.a().remove(Integer.valueOf(localar.b));
            a.a().put(Integer.valueOf(this.b.b), Long.valueOf(this.a));
            y.a().a(y.V, new Object[] { this.b, Long.valueOf(this.a) });
          }
        });
        return;
      }
      catch (Exception paramar)
      {
        n.a("tmessages", paramar);
      }
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.d.a
 * JD-Core Version:    0.6.0
 */