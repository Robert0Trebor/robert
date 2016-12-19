package org.vidogram.messenger.g;

import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public class t
{
  public static String a = "Volley";
  public static boolean b = Log.isLoggable(a, 2);

  public static void a(String paramString, Object[] paramArrayOfObject)
  {
    if (b)
      Log.v(a, e(paramString, paramArrayOfObject));
  }

  public static void a(Throwable paramThrowable, String paramString, Object[] paramArrayOfObject)
  {
    Log.e(a, e(paramString, paramArrayOfObject), paramThrowable);
  }

  public static void b(String paramString, Object[] paramArrayOfObject)
  {
    Log.d(a, e(paramString, paramArrayOfObject));
  }

  public static void c(String paramString, Object[] paramArrayOfObject)
  {
    Log.e(a, e(paramString, paramArrayOfObject));
  }

  public static void d(String paramString, Object[] paramArrayOfObject)
  {
    Log.wtf(a, e(paramString, paramArrayOfObject));
  }

  private static String e(String paramString, Object[] paramArrayOfObject)
  {
    int i;
    label20: String str;
    if (paramArrayOfObject == null)
    {
      paramArrayOfObject = new Throwable().fillInStackTrace().getStackTrace();
      i = 2;
      if (i >= paramArrayOfObject.length)
        break label154;
      if (paramArrayOfObject[i].getClass().equals(t.class))
        break label147;
      str = paramArrayOfObject[i].getClassName();
      str = str.substring(str.lastIndexOf('.') + 1);
      str = str.substring(str.lastIndexOf('$') + 1);
    }
    label147: label154: for (paramArrayOfObject = str + "." + paramArrayOfObject[i].getMethodName(); ; paramArrayOfObject = "<unknown>")
    {
      return String.format(Locale.US, "[%d] %s: %s", new Object[] { Long.valueOf(Thread.currentThread().getId()), paramArrayOfObject, paramString });
      paramString = String.format(Locale.US, paramString, paramArrayOfObject);
      break;
      i += 1;
      break label20;
    }
  }

  static class a
  {
    public static final boolean a = t.b;
    private final List<a> b = new ArrayList();
    private boolean c = false;

    private long a()
    {
      if (this.b.size() == 0)
        return 0L;
      long l = ((a)this.b.get(0)).c;
      return ((a)this.b.get(this.b.size() - 1)).c - l;
    }

    public void a(String paramString)
    {
      monitorenter;
      try
      {
        this.c = true;
        long l2 = a();
        if (l2 <= 0L);
        while (true)
        {
          return;
          long l1 = ((a)this.b.get(0)).c;
          t.b("(%-4d ms) %s", new Object[] { Long.valueOf(l2), paramString });
          paramString = this.b.iterator();
          while (paramString.hasNext())
          {
            a locala = (a)paramString.next();
            l2 = locala.c;
            t.b("(+%-4d) [%2d] %s", new Object[] { Long.valueOf(l2 - l1), Long.valueOf(locala.b), locala.a });
            l1 = l2;
          }
        }
      }
      finally
      {
        monitorexit;
      }
      throw paramString;
    }

    public void a(String paramString, long paramLong)
    {
      monitorenter;
      try
      {
        if (this.c)
          throw new IllegalStateException("Marker added to finished log");
      }
      finally
      {
        monitorexit;
      }
      this.b.add(new a(paramString, paramLong, SystemClock.elapsedRealtime()));
      monitorexit;
    }

    protected void finalize()
    {
      if (!this.c)
      {
        a("Request on the loose");
        t.c("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
      }
    }

    private static class a
    {
      public final String a;
      public final long b;
      public final long c;

      public a(String paramString, long paramLong1, long paramLong2)
      {
        this.a = paramString;
        this.b = paramLong1;
        this.c = paramLong2;
      }
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.g.t
 * JD-Core Version:    0.6.0
 */