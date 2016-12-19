package org.vidogram.ui.Components;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Build.VERSION;
import android.os.Bundle;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.vidogram.messenger.n;

@SuppressLint({"NewApi"})
public class s
  implements Application.ActivityLifecycleCallbacks
{
  private static s e = null;
  private int a;
  private boolean b = true;
  private long c = 0L;
  private CopyOnWriteArrayList<a> d = new CopyOnWriteArrayList();

  public s(Application paramApplication)
  {
    e = this;
    paramApplication.registerActivityLifecycleCallbacks(this);
  }

  public static s a()
  {
    return e;
  }

  public boolean a(boolean paramBoolean)
  {
    if ((paramBoolean) && (Build.VERSION.SDK_INT >= 21) && (System.currentTimeMillis() - this.c < 200L))
      this.b = false;
    return this.b;
  }

  public void b()
  {
    this.b = false;
  }

  public void onActivityCreated(Activity paramActivity, Bundle paramBundle)
  {
  }

  public void onActivityDestroyed(Activity paramActivity)
  {
  }

  public void onActivityPaused(Activity paramActivity)
  {
  }

  public void onActivityResumed(Activity paramActivity)
  {
  }

  public void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle)
  {
  }

  public void onActivityStarted(Activity paramActivity)
  {
    int i = this.a + 1;
    this.a = i;
    if (i == 1)
    {
      if (System.currentTimeMillis() - this.c < 200L)
        this.b = false;
      n.a("tmessages", "switch to foreground");
      paramActivity = this.d.iterator();
      while (paramActivity.hasNext())
      {
        a locala = (a)paramActivity.next();
        try
        {
          locala.a();
        }
        catch (Exception localException)
        {
          n.a("tmessages", localException);
        }
      }
    }
  }

  public void onActivityStopped(Activity paramActivity)
  {
    int i = this.a - 1;
    this.a = i;
    if (i == 0)
    {
      this.c = System.currentTimeMillis();
      this.b = true;
      n.a("tmessages", "switch to background");
      paramActivity = this.d.iterator();
      while (paramActivity.hasNext())
      {
        a locala = (a)paramActivity.next();
        try
        {
          locala.b();
        }
        catch (Exception localException)
        {
          n.a("tmessages", localException);
        }
      }
    }
  }

  public static abstract interface a
  {
    public abstract void a();

    public abstract void b();
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.Components.s
 * JD-Core Version:    0.6.0
 */