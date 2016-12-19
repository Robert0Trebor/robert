package org.vidogram.messenger;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.PowerManager;
import android.util.Base64;
import itman.robert.groupchatwebrtc.d.c;
import java.io.File;
import java.io.RandomAccessFile;
import org.vidogram.tgnet.ConnectionsManager;
import org.vidogram.tgnet.g.vw;
import org.vidogram.ui.Components.s;

public class ApplicationLoader extends itman.robert.c.a
{
  public static volatile Context a;
  public static volatile Handler b;
  public static volatile boolean c;
  public static volatile boolean d;
  private static Drawable e;
  private static boolean f;
  private static final Object g = new Object();
  private static int h;
  private static int i;
  private static volatile boolean j = false;
  private static ApplicationLoader k;
  private c l;

  static
  {
    c = false;
    d = true;
  }

  public static boolean b()
  {
    return f;
  }

  public static void c()
  {
    e = null;
    h = 0;
    a.getSharedPreferences("mainconfig", 0).edit().remove("serviceMessageColor").commit();
    f();
  }

  public static int d()
  {
    return h;
  }

  public static int e()
  {
    return i;
  }

  public static void f()
  {
    if (e != null)
      return;
    Utilities.e.b(new Runnable()
    {
      // ERROR //
      public void run()
      {
        // Byte code:
        //   0: iconst_0
        //   1: istore_2
        //   2: invokestatic 24	org/vidogram/messenger/ApplicationLoader:n	()Ljava/lang/Object;
        //   5: astore 4
        //   7: aload 4
        //   9: monitorenter
        //   10: iload_2
        //   11: istore_1
        //   12: getstatic 28	org/vidogram/messenger/ApplicationLoader:a	Landroid/content/Context;
        //   15: ldc 30
        //   17: iconst_0
        //   18: invokevirtual 36	android/content/Context:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
        //   21: astore 5
        //   23: iload_2
        //   24: istore_1
        //   25: aload 5
        //   27: ldc 38
        //   29: ldc 39
        //   31: invokeinterface 45 3 0
        //   36: istore_3
        //   37: iload_2
        //   38: istore_1
        //   39: aload 5
        //   41: ldc 47
        //   43: iconst_0
        //   44: invokeinterface 45 3 0
        //   49: istore_2
        //   50: iload_2
        //   51: istore_1
        //   52: aload 5
        //   54: ldc 49
        //   56: iconst_0
        //   57: invokeinterface 45 3 0
        //   62: invokestatic 52	org/vidogram/messenger/ApplicationLoader:a	(I)I
        //   65: pop
        //   66: iload_2
        //   67: istore_1
        //   68: aload 5
        //   70: ldc 54
        //   72: iconst_0
        //   73: invokeinterface 45 3 0
        //   78: invokestatic 57	org/vidogram/messenger/ApplicationLoader:b	(I)I
        //   81: pop
        //   82: iload_2
        //   83: istore_1
        //   84: iload_2
        //   85: ifne +35 -> 120
        //   88: iload_3
        //   89: ldc 39
        //   91: if_icmpne +80 -> 171
        //   94: iload_2
        //   95: istore_1
        //   96: getstatic 28	org/vidogram/messenger/ApplicationLoader:a	Landroid/content/Context;
        //   99: invokevirtual 61	android/content/Context:getResources	()Landroid/content/res/Resources;
        //   102: ldc 62
        //   104: invokevirtual 68	android/content/res/Resources:getDrawable	(I)Landroid/graphics/drawable/Drawable;
        //   107: invokestatic 71	org/vidogram/messenger/ApplicationLoader:a	(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;
        //   110: pop
        //   111: iload_2
        //   112: istore_1
        //   113: iconst_0
        //   114: invokestatic 74	org/vidogram/messenger/ApplicationLoader:a	(Z)Z
        //   117: pop
        //   118: iload_2
        //   119: istore_1
        //   120: invokestatic 78	org/vidogram/messenger/ApplicationLoader:o	()Landroid/graphics/drawable/Drawable;
        //   123: ifnonnull +24 -> 147
        //   126: iload_1
        //   127: istore_2
        //   128: iload_1
        //   129: ifne +6 -> 135
        //   132: ldc 79
        //   134: istore_2
        //   135: new 81	android/graphics/drawable/ColorDrawable
        //   138: dup
        //   139: iload_2
        //   140: invokespecial 84	android/graphics/drawable/ColorDrawable:<init>	(I)V
        //   143: invokestatic 71	org/vidogram/messenger/ApplicationLoader:a	(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;
        //   146: pop
        //   147: invokestatic 88	org/vidogram/messenger/ApplicationLoader:p	()I
        //   150: ifne +6 -> 156
        //   153: invokestatic 91	org/vidogram/messenger/ApplicationLoader:q	()V
        //   156: new 13	org/vidogram/messenger/ApplicationLoader$1$1
        //   159: dup
        //   160: aload_0
        //   161: invokespecial 94	org/vidogram/messenger/ApplicationLoader$1$1:<init>	(Lorg/vidogram/messenger/ApplicationLoader$1;)V
        //   164: invokestatic 99	org/vidogram/messenger/a:a	(Ljava/lang/Runnable;)V
        //   167: aload 4
        //   169: monitorexit
        //   170: return
        //   171: iload_2
        //   172: istore_1
        //   173: new 101	java/io/File
        //   176: dup
        //   177: invokestatic 105	org/vidogram/messenger/ApplicationLoader:h	()Ljava/io/File;
        //   180: ldc 107
        //   182: invokespecial 110	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
        //   185: astore 5
        //   187: iload_2
        //   188: istore_1
        //   189: aload 5
        //   191: invokevirtual 114	java/io/File:exists	()Z
        //   194: ifeq +29 -> 223
        //   197: iload_2
        //   198: istore_1
        //   199: aload 5
        //   201: invokevirtual 118	java/io/File:getAbsolutePath	()Ljava/lang/String;
        //   204: invokestatic 124	android/graphics/drawable/Drawable:createFromPath	(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;
        //   207: invokestatic 71	org/vidogram/messenger/ApplicationLoader:a	(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;
        //   210: pop
        //   211: iload_2
        //   212: istore_1
        //   213: iconst_1
        //   214: invokestatic 74	org/vidogram/messenger/ApplicationLoader:a	(Z)Z
        //   217: pop
        //   218: iload_2
        //   219: istore_1
        //   220: goto -100 -> 120
        //   223: iload_2
        //   224: istore_1
        //   225: getstatic 28	org/vidogram/messenger/ApplicationLoader:a	Landroid/content/Context;
        //   228: invokevirtual 61	android/content/Context:getResources	()Landroid/content/res/Resources;
        //   231: ldc 62
        //   233: invokevirtual 68	android/content/res/Resources:getDrawable	(I)Landroid/graphics/drawable/Drawable;
        //   236: invokestatic 71	org/vidogram/messenger/ApplicationLoader:a	(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;
        //   239: pop
        //   240: iload_2
        //   241: istore_1
        //   242: iconst_0
        //   243: invokestatic 74	org/vidogram/messenger/ApplicationLoader:a	(Z)Z
        //   246: pop
        //   247: iload_2
        //   248: istore_1
        //   249: goto -129 -> 120
        //   252: astore 5
        //   254: aload 4
        //   256: monitorexit
        //   257: aload 5
        //   259: athrow
        //   260: astore 5
        //   262: goto -142 -> 120
        //
        // Exception table:
        //   from	to	target	type
        //   12	23	252	finally
        //   25	37	252	finally
        //   39	50	252	finally
        //   52	66	252	finally
        //   68	82	252	finally
        //   96	111	252	finally
        //   113	118	252	finally
        //   120	126	252	finally
        //   135	147	252	finally
        //   147	156	252	finally
        //   156	170	252	finally
        //   173	187	252	finally
        //   189	197	252	finally
        //   199	211	252	finally
        //   213	218	252	finally
        //   225	240	252	finally
        //   242	247	252	finally
        //   254	257	252	finally
        //   12	23	260	java/lang/Throwable
        //   25	37	260	java/lang/Throwable
        //   39	50	260	java/lang/Throwable
        //   52	66	260	java/lang/Throwable
        //   68	82	260	java/lang/Throwable
        //   96	111	260	java/lang/Throwable
        //   113	118	260	java/lang/Throwable
        //   173	187	260	java/lang/Throwable
        //   189	197	260	java/lang/Throwable
        //   199	211	260	java/lang/Throwable
        //   213	218	260	java/lang/Throwable
        //   225	240	260	java/lang/Throwable
        //   242	247	260	java/lang/Throwable
      }
    });
  }

  public static Drawable g()
  {
    synchronized (g)
    {
      Drawable localDrawable = e;
      return localDrawable;
    }
  }

  public static File h()
  {
    int m = 0;
    File localFile;
    while (m < 10)
    {
      localFile = a.getFilesDir();
      if (localFile != null)
        return localFile;
      m += 1;
    }
    try
    {
      localFile = new File(a.getApplicationInfo().dataDir, "files");
      localFile.mkdirs();
      return localFile;
    }
    catch (Exception localException)
    {
      n.a("tmessages", localException);
    }
    return new File("/data/data/org.telegram.messenger/files");
  }

  public static void i()
  {
    if (j)
      return;
    j = true;
    s();
    try
    {
      r.a();
    }
    catch (Exception str1)
    {
      try
      {
        localObject1 = new IntentFilter("android.intent.action.SCREEN_ON");
        ((IntentFilter)localObject1).addAction("android.intent.action.SCREEN_OFF");
        localObject2 = new aa();
        a.registerReceiver((BroadcastReceiver)localObject2, (IntentFilter)localObject1);
      }
      catch (Exception str1)
      {
        try
        {
          c = ((PowerManager)a.getSystemService("power")).isScreenOn();
          n.a("tmessages", "screen state = " + c);
          ad.e();
          str4 = h().toString();
        }
        catch (Exception str1)
        {
          try
          {
            while (true)
            {
              String str4;
              str3 = r.c();
              str2 = Build.MANUFACTURER + Build.MODEL;
              Object localObject1 = a.getPackageManager().getPackageInfo(a.getPackageName(), 0);
              localObject2 = ((PackageInfo)localObject1).versionName + " (" + ((PackageInfo)localObject1).versionCode + ")";
              localObject1 = "SDK " + Build.VERSION.SDK_INT;
              if (str3.trim().length() != 0)
                break label461;
              str3 = "en";
              if (str2.trim().length() != 0)
                break label458;
              str2 = "Android unknown";
              if (((String)localObject2).trim().length() != 0)
                break label455;
              localObject2 = "App version unknown";
              if (((String)localObject1).trim().length() != 0)
                break;
              localObject1 = "SDK Unknown";
              boolean bool = a.getSharedPreferences("Notifications", 0).getBoolean("pushConnection", true);
              v.a();
              ConnectionsManager.a().a(d.b, 57, d.d, str2, (String)localObject1, (String)localObject2, str3, str4, n.b(), ad.c(), bool);
              if (ad.d() != null)
              {
                v.a().a(ad.d(), true);
                ConnectionsManager.a().a(ad.d().i);
                v.a().a(true);
                ac.a().d();
              }
              ((ApplicationLoader)a).t();
              n.a("tmessages", "app initied");
              f.a().e();
              MediaController.a();
              return;
              localException1 = localException1;
              localException1.printStackTrace();
              continue;
              localException2 = localException2;
              localException2.printStackTrace();
            }
            localException3 = localException3;
            n.a("tmessages", localException3);
          }
          catch (Exception str1)
          {
            label455: label458: label461: 
            while (true)
            {
              String str3 = "en";
              String str2 = "Android unknown";
              Object localObject2 = "App version unknown";
              String str1 = "SDK " + Build.VERSION.SDK_INT;
              continue;
              continue;
              continue;
              continue;
            }
          }
        }
      }
    }
  }

  public static void j()
  {
    if (a.getSharedPreferences("Notifications", 0).getBoolean("pushService", true))
    {
      a.startService(new Intent(a, NotificationsService.class));
      return;
    }
    k();
  }

  public static void k()
  {
    a.stopService(new Intent(a, NotificationsService.class));
    PendingIntent localPendingIntent = PendingIntent.getService(a, 0, new Intent(a, NotificationsService.class), 0);
    ((AlarmManager)a.getSystemService("alarm")).cancel(localPendingIntent);
  }

  public static ApplicationLoader l()
  {
    return k;
  }

  private static void r()
  {
    int[] arrayOfInt = a.a(e);
    h = arrayOfInt[0];
    i = arrayOfInt[1];
    a.getSharedPreferences("mainconfig", 0).edit().putInt("serviceMessageColor", h).putInt("serviceSelectedMessageColor", i).commit();
  }

  private static void s()
  {
    SharedPreferences localSharedPreferences = a.getSharedPreferences("dataconfig", 0);
    org.vidogram.tgnet.e locale;
    boolean bool;
    if (localSharedPreferences.contains("currentDatacenterId"))
    {
      locale = new org.vidogram.tgnet.e(32768);
      locale.a(2);
      if (localSharedPreferences.getInt("datacenterSetId", 0) == 0)
        break label262;
      bool = true;
    }
    while (true)
    {
      locale.a(bool);
      locale.a(true);
      locale.a(localSharedPreferences.getInt("currentDatacenterId", 0));
      locale.a(localSharedPreferences.getInt("timeDifference", 0));
      locale.a(localSharedPreferences.getInt("lastDcUpdateTime", 0));
      locale.a(localSharedPreferences.getLong("pushSessionId", 0L));
      locale.a(false);
      locale.a(0);
      try
      {
        localObject1 = localSharedPreferences.getString("datacenters", null);
        if (localObject1 != null)
        {
          localObject1 = Base64.decode((String)localObject1, 0);
          if (localObject1 != null)
          {
            localObject2 = new org.vidogram.tgnet.e(localObject1);
            locale.a(((org.vidogram.tgnet.e)localObject2).b(false));
            locale.a(localObject1, 4, localObject1.length - 4);
            ((org.vidogram.tgnet.e)localObject2).b();
          }
        }
      }
      catch (Exception localException2)
      {
        try
        {
          while (true)
          {
            Object localObject1 = new RandomAccessFile(new File(h(), "tgnet.dat"), "rws");
            Object localObject2 = locale.c();
            ((RandomAccessFile)localObject1).writeInt(Integer.reverseBytes(localObject2.length));
            ((RandomAccessFile)localObject1).write(localObject2);
            ((RandomAccessFile)localObject1).close();
            locale.b();
            localSharedPreferences.edit().clear().commit();
            return;
            label262: bool = false;
            break;
            localException1 = localException1;
            n.a("tmessages", localException1);
          }
        }
        catch (Exception localException2)
        {
          while (true)
            n.a("tmessages", localException2);
        }
      }
    }
  }

  private void t()
  {
    a.a(new Runnable()
    {
      public void run()
      {
        if (ApplicationLoader.a(ApplicationLoader.this))
        {
          if ((ad.b != null) && (ad.b.length() != 0))
            n.b("tmessages", "GCM regId = " + ad.b);
          while (true)
          {
            Intent localIntent = new Intent(ApplicationLoader.a, GcmRegistrationIntentService.class);
            ApplicationLoader.this.startService(localIntent);
            return;
            n.b("tmessages", "GCM Registration not found.");
          }
        }
        n.b("tmessages", "No valid Google Play Services APK found.");
      }
    }
    , 1000L);
  }

  private boolean u()
  {
    try
    {
      int m = com.google.android.gms.common.e.a(this);
      return m == 0;
    }
    catch (Exception localException)
    {
      n.a("tmessages", localException);
    }
    return true;
  }

  private void v()
  {
    k = this;
    super.a("39854", "JtensAa9y4AM5Yk", "AsDFwwwxpr3LN5w", "cB3pfVkJBr4ayMYVy4jH");
  }

  public c m()
  {
    monitorenter;
    try
    {
      c localc;
      if (this.l == null)
      {
        localc = new c();
        this.l = localc;
      }
      while (true)
      {
        return localc;
        localc = this.l;
      }
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    try
    {
      r.a().a(paramConfiguration);
      a.a(a, paramConfiguration);
      return;
    }
    catch (Exception paramConfiguration)
    {
      paramConfiguration.printStackTrace();
    }
  }

  public void onCreate()
  {
    super.onCreate();
    v();
    a = getApplicationContext();
    NativeLoader.a(a);
    if ((Build.VERSION.SDK_INT == 14) || (Build.VERSION.SDK_INT == 15));
    for (boolean bool = true; ; bool = false)
    {
      ConnectionsManager.native_setJava(bool);
      new s(this);
      b = new Handler(a.getMainLooper());
      j();
      return;
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.ApplicationLoader
 * JD-Core Version:    0.6.0
 */