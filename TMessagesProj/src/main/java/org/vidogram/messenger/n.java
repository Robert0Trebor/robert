package org.vidogram.messenger;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.Locale;
import org.vidogram.messenger.e.a;

public class n
{
  private static volatile n f = null;
  private OutputStreamWriter a = null;
  private a b = null;
  private h c = null;
  private File d = null;
  private File e = null;

  public n()
  {
    if (!d.a);
    while (true)
    {
      return;
      this.b = a.a("dd_MM_yyyy_HH_mm_ss", Locale.US);
      try
      {
        File localFile = ApplicationLoader.a.getExternalFilesDir(null);
        if (localFile == null)
          continue;
        localFile = new File(localFile.getAbsolutePath() + "/logs");
        localFile.mkdirs();
        this.d = new File(localFile, this.b.a(System.currentTimeMillis()) + ".txt");
        try
        {
          this.c = new h("logQueue");
          this.d.createNewFile();
          this.a = new OutputStreamWriter(new FileOutputStream(this.d));
          this.a.write("-----start log " + this.b.a(System.currentTimeMillis()) + "-----\n");
          this.a.flush();
          return;
        }
        catch (Exception localException1)
        {
          localException1.printStackTrace();
          return;
        }
      }
      catch (Exception localException2)
      {
        while (true)
          localException2.printStackTrace();
      }
    }
  }

  public static n a()
  {
    Object localObject1 = f;
    if (localObject1 == null)
    {
      monitorenter;
      try
      {
        n localn = f;
        localObject1 = localn;
        if (localn == null)
        {
          localObject1 = new n();
          f = (n)localObject1;
        }
        return localObject1;
      }
      finally
      {
        monitorexit;
      }
    }
    return (n)localObject2;
  }

  public static void a(String paramString1, String paramString2)
  {
    if (!d.a);
    do
    {
      return;
      Log.e(paramString1, paramString2);
    }
    while (a().a == null);
    a().c.b(new Runnable(paramString1, paramString2)
    {
      public void run()
      {
        try
        {
          n.b(n.a()).write(n.a(n.a()).a(System.currentTimeMillis()) + " E/" + this.a + "﹕ " + this.b + "\n");
          n.b(n.a()).flush();
          return;
        }
        catch (Exception localException)
        {
          localException.printStackTrace();
        }
      }
    });
  }

  public static void a(String paramString1, String paramString2, Throwable paramThrowable)
  {
    if (!d.a);
    do
    {
      return;
      Log.e(paramString1, paramString2, paramThrowable);
    }
    while (a().a == null);
    a().c.b(new Runnable(paramString1, paramString2, paramThrowable)
    {
      public void run()
      {
        try
        {
          n.b(n.a()).write(n.a(n.a()).a(System.currentTimeMillis()) + " E/" + this.a + "﹕ " + this.b + "\n");
          n.b(n.a()).write(this.c.toString());
          n.b(n.a()).flush();
          return;
        }
        catch (Exception localException)
        {
          localException.printStackTrace();
        }
      }
    });
  }

  public static void a(String paramString, Throwable paramThrowable)
  {
    if (!d.a)
      return;
    paramThrowable.printStackTrace();
    if (a().a != null)
    {
      a().c.b(new Runnable(paramString, paramThrowable)
      {
        public void run()
        {
          try
          {
            n.b(n.a()).write(n.a(n.a()).a(System.currentTimeMillis()) + " E/" + this.a + "﹕ " + this.b + "\n");
            StackTraceElement[] arrayOfStackTraceElement = this.b.getStackTrace();
            int i = 0;
            while (i < arrayOfStackTraceElement.length)
            {
              n.b(n.a()).write(n.a(n.a()).a(System.currentTimeMillis()) + " E/" + this.a + "﹕ " + arrayOfStackTraceElement[i] + "\n");
              i += 1;
            }
            n.b(n.a()).flush();
            return;
          }
          catch (Exception localException)
          {
            localException.printStackTrace();
          }
        }
      });
      return;
    }
    paramThrowable.printStackTrace();
  }

  public static String b()
  {
    if (!d.a)
      return "";
    try
    {
      Object localObject = ApplicationLoader.a.getExternalFilesDir(null);
      if (localObject == null)
        return "";
      localObject = new File(((File)localObject).getAbsolutePath() + "/logs");
      ((File)localObject).mkdirs();
      a().e = new File((File)localObject, a().b.a(System.currentTimeMillis()) + "_net.txt");
      localObject = a().e.getAbsolutePath();
      return localObject;
    }
    catch (Throwable localThrowable)
    {
      localThrowable.printStackTrace();
    }
    return (String)"";
  }

  public static void b(String paramString1, String paramString2)
  {
    if (!d.a);
    do
    {
      return;
      Log.d(paramString1, paramString2);
    }
    while (a().a == null);
    a().c.b(new Runnable(paramString1, paramString2)
    {
      public void run()
      {
        try
        {
          n.b(n.a()).write(n.a(n.a()).a(System.currentTimeMillis()) + " D/" + this.a + "﹕ " + this.b + "\n");
          n.b(n.a()).flush();
          return;
        }
        catch (Exception localException)
        {
          localException.printStackTrace();
        }
      }
    });
  }

  public static void c()
  {
    Object localObject1 = ApplicationLoader.a.getExternalFilesDir(null);
    if (localObject1 == null);
    do
    {
      return;
      localObject1 = new File(((File)localObject1).getAbsolutePath() + "/logs").listFiles();
    }
    while (localObject1 == null);
    int i = 0;
    label52: Object localObject2;
    if (i < localObject1.length)
    {
      localObject2 = localObject1[i];
      if ((a().d == null) || (!localObject2.getAbsolutePath().equals(a().d.getAbsolutePath())))
        break label97;
    }
    while (true)
    {
      i += 1;
      break label52;
      break;
      label97: if ((a().e != null) && (localObject2.getAbsolutePath().equals(a().e.getAbsolutePath())))
        continue;
      localObject2.delete();
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.n
 * JD-Core Version:    0.6.0
 */