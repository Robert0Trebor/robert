package org.vidogram.messenger;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.util.Base64;
import java.io.File;
import java.security.SecureRandom;
import org.vidogram.tgnet.a;
import org.vidogram.tgnet.e;
import org.vidogram.tgnet.g.vw;

public class ad
{
  private static g.vw A;
  private static final Object B;
  public static boolean a;
  public static String b = "";
  public static int c = -210000;
  public static int d = -210000;
  public static int e = -1;
  public static String f = "";
  public static boolean g;
  public static boolean h;
  public static String i;
  public static byte[] j;
  public static boolean k;
  public static int l;
  public static int m;
  public static int n;
  public static boolean o;
  public static boolean p;
  public static String q;
  public static int r;
  public static int s;
  public static boolean t;
  public static int u;
  public static int v;
  public static int w;
  public static int x;
  public static int y;
  public static long z;

  static
  {
    B = new Object();
    i = "";
    j = new byte[0];
    m = 3600;
    p = true;
    u = -1;
    v = -1;
    w = -1;
    x = -1;
    y = -1;
    z = -1L;
  }

  public static int a()
  {
    synchronized (B)
    {
      int i1 = c;
      c -= 1;
      return i1;
    }
  }

  public static void a(g.vw paramvw)
  {
    synchronized (B)
    {
      A = paramvw;
      return;
    }
  }

  public static void a(boolean paramBoolean)
  {
    a(paramBoolean, null);
  }

  public static void a(boolean paramBoolean, File paramFile)
  {
    synchronized (B)
    {
      try
      {
        SharedPreferences.Editor localEditor = ApplicationLoader.a.getSharedPreferences("userconfing", 0).edit();
        localEditor.putBoolean("registeredForPush", a);
        localEditor.putString("pushString2", b);
        localEditor.putInt("lastSendMessageId", c);
        localEditor.putInt("lastLocalId", d);
        localEditor.putString("contactsHash", f);
        localEditor.putBoolean("saveIncomingPhotos", h);
        localEditor.putInt("lastBroadcastId", e);
        localEditor.putBoolean("blockedUsersLoaded", g);
        localEditor.putString("passcodeHash1", i);
        Object localObject1;
        if (j.length > 0)
        {
          localObject1 = Base64.encodeToString(j, 0);
          localEditor.putString("passcodeSalt", (String)localObject1);
          localEditor.putBoolean("appLocked", k);
          localEditor.putInt("passcodeType", l);
          localEditor.putInt("autoLockIn", m);
          localEditor.putInt("lastPauseTime", n);
          localEditor.putString("lastUpdateVersion2", q);
          localEditor.putInt("lastContactsSyncTime", r);
          localEditor.putBoolean("useFingerprint", p);
          localEditor.putInt("lastHintsSyncTime", s);
          localEditor.putBoolean("draftsLoaded", t);
          localEditor.putInt("migrateOffsetId", u);
          if (u != -1)
          {
            localEditor.putInt("migrateOffsetDate", v);
            localEditor.putInt("migrateOffsetUserId", w);
            localEditor.putInt("migrateOffsetChatId", x);
            localEditor.putInt("migrateOffsetChannelId", y);
            localEditor.putLong("migrateOffsetAccess", z);
          }
          if (A == null)
            break label440;
          if (paramBoolean)
          {
            localObject1 = new e();
            A.a((a)localObject1);
            localEditor.putString("user", Base64.encodeToString(((e)localObject1).c(), 0));
            ((e)localObject1).b();
          }
        }
        while (true)
        {
          localEditor.commit();
          if (paramFile != null)
            paramFile.delete();
          return;
          localObject1 = "";
          break;
          label440: localEditor.remove("user");
        }
      }
      catch (Exception paramFile)
      {
        while (true)
          n.a("tmessages", paramFile);
      }
    }
  }

  public static boolean a(String paramString)
  {
    boolean bool;
    byte[] arrayOfByte;
    if (j.length == 0)
    {
      bool = Utilities.e(paramString).equals(i);
      if (bool);
      try
      {
        j = new byte[16];
        Utilities.b.nextBytes(j);
        paramString = paramString.getBytes("UTF-8");
        arrayOfByte = new byte[paramString.length + 32];
        System.arraycopy(j, 0, arrayOfByte, 0, 16);
        System.arraycopy(paramString, 0, arrayOfByte, 16, paramString.length);
        System.arraycopy(j, 0, arrayOfByte, paramString.length + 16, 16);
        i = Utilities.a(Utilities.b(arrayOfByte, 0, arrayOfByte.length));
        a(false);
        return bool;
      }
      catch (Exception paramString)
      {
        n.a("tmessages", paramString);
        return bool;
      }
    }
    try
    {
      paramString = paramString.getBytes("UTF-8");
      arrayOfByte = new byte[paramString.length + 32];
      System.arraycopy(j, 0, arrayOfByte, 0, 16);
      System.arraycopy(paramString, 0, arrayOfByte, 16, paramString.length);
      System.arraycopy(j, 0, arrayOfByte, paramString.length + 16, 16);
      paramString = Utilities.a(Utilities.b(arrayOfByte, 0, arrayOfByte.length));
      bool = i.equals(paramString);
      return bool;
    }
    catch (Exception paramString)
    {
      n.a("tmessages", paramString);
    }
    return false;
  }

  public static boolean b()
  {
    while (true)
    {
      synchronized (B)
      {
        if (A != null)
        {
          i1 = 1;
          return i1;
        }
      }
      int i1 = 0;
    }
  }

  public static int c()
  {
    while (true)
    {
      synchronized (B)
      {
        if (A != null)
        {
          i1 = A.d;
          return i1;
        }
      }
      int i1 = 0;
    }
  }

  public static g.vw d()
  {
    synchronized (B)
    {
      g.vw localvw = A;
      return localvw;
    }
  }

  public static void e()
  {
    while (true)
    {
      synchronized (B)
      {
        File localFile = new File(ApplicationLoader.h(), "user.dat");
        boolean bool = localFile.exists();
        if (bool)
          try
          {
            localObject4 = new e(localFile);
            int i1 = ((e)localObject4).b(false);
            if (i1 != 1)
              continue;
            A = g.vw.a((a)localObject4, ((e)localObject4).b(false), false);
            w.a = ((e)localObject4).b(false);
            w.b = ((e)localObject4).b(false);
            w.d = ((e)localObject4).b(false);
            a = ((e)localObject4).c(false);
            b = ((e)localObject4).e(false);
            c = ((e)localObject4).b(false);
            d = ((e)localObject4).b(false);
            f = ((e)localObject4).e(false);
            ((e)localObject4).e(false);
            h = ((e)localObject4).c(false);
            w.c = ((e)localObject4).b(false);
            w.e = ((e)localObject4).b(false);
            if (((e)localObject4).b(false) != 1)
              continue;
            w.f = ((e)localObject4).f(false);
            w.g = ((e)localObject4).b(false);
            Utilities.c.b(new Runnable(localFile)
            {
              public void run()
              {
                ad.a(true, this.a);
              }
            });
            if (d <= -210000)
              continue;
            d = -210000;
            if (c <= -210000)
              continue;
            c = -210000;
            ((e)localObject4).b();
            Utilities.c.b(new Runnable(localFile)
            {
              public void run()
              {
                ad.a(true, this.a);
              }
            });
            return;
            if (i1 != 2)
              continue;
            A = g.vw.a((a)localObject4, ((e)localObject4).b(false), false);
            SharedPreferences localSharedPreferences = ApplicationLoader.a.getSharedPreferences("userconfing", 0);
            a = localSharedPreferences.getBoolean("registeredForPush", false);
            b = localSharedPreferences.getString("pushString2", "");
            c = localSharedPreferences.getInt("lastSendMessageId", -210000);
            d = localSharedPreferences.getInt("lastLocalId", -210000);
            f = localSharedPreferences.getString("contactsHash", "");
            h = localSharedPreferences.getBoolean("saveIncomingPhotos", false);
            continue;
          }
          catch (Exception localException)
          {
            n.a("tmessages", localException);
            continue;
          }
      }
      Object localObject3 = ApplicationLoader.a.getSharedPreferences("userconfing", 0);
      a = ((SharedPreferences)localObject3).getBoolean("registeredForPush", false);
      b = ((SharedPreferences)localObject3).getString("pushString2", "");
      c = ((SharedPreferences)localObject3).getInt("lastSendMessageId", -210000);
      d = ((SharedPreferences)localObject3).getInt("lastLocalId", -210000);
      f = ((SharedPreferences)localObject3).getString("contactsHash", "");
      h = ((SharedPreferences)localObject3).getBoolean("saveIncomingPhotos", false);
      e = ((SharedPreferences)localObject3).getInt("lastBroadcastId", -1);
      g = ((SharedPreferences)localObject3).getBoolean("blockedUsersLoaded", false);
      i = ((SharedPreferences)localObject3).getString("passcodeHash1", "");
      k = ((SharedPreferences)localObject3).getBoolean("appLocked", false);
      l = ((SharedPreferences)localObject3).getInt("passcodeType", 0);
      m = ((SharedPreferences)localObject3).getInt("autoLockIn", 3600);
      n = ((SharedPreferences)localObject3).getInt("lastPauseTime", 0);
      p = ((SharedPreferences)localObject3).getBoolean("useFingerprint", true);
      q = ((SharedPreferences)localObject3).getString("lastUpdateVersion2", "3.5");
      r = ((SharedPreferences)localObject3).getInt("lastContactsSyncTime", (int)(System.currentTimeMillis() / 1000L) - 82800);
      s = ((SharedPreferences)localObject3).getInt("lastHintsSyncTime", (int)(System.currentTimeMillis() / 1000L) - 90000);
      t = ((SharedPreferences)localObject3).getBoolean("draftsLoaded", false);
      u = ((SharedPreferences)localObject3).getInt("migrateOffsetId", 0);
      if (u != -1)
      {
        v = ((SharedPreferences)localObject3).getInt("migrateOffsetDate", 0);
        w = ((SharedPreferences)localObject3).getInt("migrateOffsetUserId", 0);
        x = ((SharedPreferences)localObject3).getInt("migrateOffsetChatId", 0);
        y = ((SharedPreferences)localObject3).getInt("migrateOffsetChannelId", 0);
        z = ((SharedPreferences)localObject3).getLong("migrateOffsetAccess", 0L);
      }
      Object localObject4 = ((SharedPreferences)localObject3).getString("user", null);
      if (localObject4 != null)
      {
        localObject4 = Base64.decode((String)localObject4, 0);
        if (localObject4 != null)
        {
          localObject4 = new e(localObject4);
          A = g.vw.a((a)localObject4, ((e)localObject4).b(false), false);
          ((e)localObject4).b();
        }
      }
      localObject3 = ((SharedPreferences)localObject3).getString("passcodeSalt", "");
      if (((String)localObject3).length() > 0)
      {
        j = Base64.decode((String)localObject3, 0);
        continue;
      }
      j = new byte[0];
    }
  }

  public static void f()
  {
    A = null;
    a = false;
    f = "";
    c = -210000;
    e = -1;
    h = false;
    g = false;
    u = -1;
    v = -1;
    w = -1;
    x = -1;
    y = -1;
    z = -1L;
    k = false;
    l = 0;
    i = "";
    j = new byte[0];
    m = 3600;
    n = 0;
    p = true;
    t = true;
    o = false;
    q = d.c;
    r = (int)(System.currentTimeMillis() / 1000L) - 82800;
    s = (int)(System.currentTimeMillis() / 1000L) - 90000;
    a(true);
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.ad
 * JD-Core Version:    0.6.0
 */