package org.vidogram.messenger.b;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import org.vidogram.messenger.ApplicationLoader;
import org.vidogram.messenger.MediaController;
import org.vidogram.messenger.ShareBroadcastReceiver;
import org.vidogram.messenger.n;
import org.vidogram.messenger.r;
import org.vidogram.messenger.support.a.c.a;
import org.vidogram.messenger.support.a.d;
import org.vidogram.messenger.support.a.e;
import org.vidogram.ui.LaunchActivity;
import org.vidogram.ui.a.l;

public class a
{
  private static WeakReference<e> a;
  private static e b;
  private static org.vidogram.messenger.support.a.b c;
  private static d d;
  private static String e;
  private static WeakReference<Activity> f;

  public static void a(Activity paramActivity)
  {
    Activity localActivity = null;
    if (Build.VERSION.SDK_INT < 15)
      return;
    if (f == null);
    while (true)
    {
      while (true)
      {
        if ((localActivity != null) && (localActivity != paramActivity))
          b(localActivity);
        if (c != null)
          break;
        f = new WeakReference(paramActivity);
        try
        {
          if (TextUtils.isEmpty(e))
          {
            e = org.vidogram.messenger.support.b.a.a.a(paramActivity);
            if (e == null)
              break;
          }
          d = new org.vidogram.messenger.support.b.a.b(new org.vidogram.messenger.support.b.a.c()
          {
            public void a()
            {
              a.a(null);
            }

            public void a(org.vidogram.messenger.support.a.b paramb)
            {
              a.a(paramb);
              if ((MediaController.a().D()) && (a.a() != null));
              try
              {
                a.a().a(0L);
                return;
              }
              catch (java.lang.Exception paramb)
              {
                n.a("tmessages", paramb);
              }
            }
          });
          if (org.vidogram.messenger.support.a.b.a(paramActivity, e, d))
            break;
          d = null;
          return;
        }
        catch (java.lang.Exception paramActivity)
        {
          n.a("tmessages", paramActivity);
          return;
        }
      }
      localActivity = (Activity)f.get();
    }
  }

  public static void a(Context paramContext, Uri paramUri, boolean paramBoolean)
  {
    if ((paramContext == null) || (paramUri == null))
      return;
    boolean bool;
    while (true)
    {
      try
      {
        if (paramUri.getScheme() != null)
        {
          localObject = paramUri.getScheme().toLowerCase();
          bool = a(paramUri);
          if ((Build.VERSION.SDK_INT < 15) || (!paramBoolean) || (!MediaController.a().D()) || (bool) || (((String)localObject).equals("tel")))
            break;
          localObject = new Intent(ApplicationLoader.a, ShareBroadcastReceiver.class);
          ((Intent)localObject).setAction("android.intent.action.SEND");
          c.a locala = new c.a(b());
          locala.a(l.a);
          locala.a(true);
          locala.a(BitmapFactory.decodeResource(paramContext.getResources(), 2130837534), r.a("ShareFile", 2131231834), PendingIntent.getBroadcast(ApplicationLoader.a, 0, (Intent)localObject, 0), false);
          locala.a().a((Activity)paramContext, paramUri);
          return;
        }
      }
      catch (java.lang.Exception paramContext)
      {
        n.a("tmessages", paramContext);
        return;
      }
      Object localObject = "";
    }
    paramUri = new Intent("android.intent.action.VIEW", paramUri);
    if (bool)
      paramUri.setComponent(new ComponentName(paramContext.getPackageName(), LaunchActivity.class.getName()));
    paramUri.putExtra("com.android.browser.application_id", paramContext.getPackageName());
    paramContext.startActivity(paramUri);
  }

  public static void a(Context paramContext, String paramString)
  {
    if (paramString == null)
      return;
    a(paramContext, Uri.parse(paramString), true);
  }

  public static void a(Context paramContext, String paramString, boolean paramBoolean)
  {
    if ((paramContext == null) || (paramString == null))
      return;
    a(paramContext, Uri.parse(paramString), paramBoolean);
  }

  private static void a(e parame)
  {
    a = new WeakReference(parame);
  }

  public static boolean a(Uri paramUri)
  {
    String str = paramUri.getHost();
    if (str != null);
    for (str = str.toLowerCase(); ("tg".equals(paramUri.getScheme())) || ("telegram.me".equals(str)) || ("telegram.dog".equals(str)); str = "")
      return true;
    return false;
  }

  public static boolean a(String paramString)
  {
    return a(Uri.parse(paramString));
  }

  private static e b()
  {
    if (c == null)
      b = null;
    while (true)
    {
      return b;
      if (b != null)
        continue;
      b = c.a(new a(null));
      a(b);
    }
  }

  public static void b(Activity paramActivity)
  {
    if ((Build.VERSION.SDK_INT < 15) || (d == null))
      return;
    Activity localActivity;
    if (f == null)
      localActivity = null;
    while (true)
    {
      if (localActivity == paramActivity)
        f.clear();
      try
      {
        paramActivity.unbindService(d);
        c = null;
        b = null;
        return;
        localActivity = (Activity)f.get();
      }
      catch (java.lang.Exception paramActivity)
      {
        while (true)
          n.a("tmessages", paramActivity);
      }
    }
  }

  private static class a extends org.vidogram.messenger.support.a.a
  {
    public void a(int paramInt, Bundle paramBundle)
    {
      n.a("tmessages", "code = " + paramInt + " extras " + paramBundle);
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.b.a
 * JD-Core Version:    0.6.0
 */