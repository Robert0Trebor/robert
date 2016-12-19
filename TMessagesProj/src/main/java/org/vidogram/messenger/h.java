package org.vidogram.messenger;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CountDownLatch;

public class h extends Thread
{
  private volatile Handler a = null;
  private CountDownLatch b = new CountDownLatch(1);

  public h(String paramString)
  {
    setName(paramString);
    start();
  }

  public void a()
  {
    try
    {
      this.b.await();
      this.a.removeCallbacksAndMessages(null);
      return;
    }
    catch (Exception localException)
    {
      n.a("tmessages", localException);
    }
  }

  public void a(Runnable paramRunnable)
  {
    try
    {
      this.b.await();
      this.a.removeCallbacks(paramRunnable);
      return;
    }
    catch (Exception paramRunnable)
    {
      n.a("tmessages", paramRunnable);
    }
  }

  public void a(Runnable paramRunnable, long paramLong)
  {
    try
    {
      this.b.await();
      if (paramLong <= 0L)
      {
        this.a.post(paramRunnable);
        return;
      }
      this.a.postDelayed(paramRunnable, paramLong);
      return;
    }
    catch (Exception paramRunnable)
    {
      n.a("tmessages", paramRunnable);
    }
  }

  public void b(Runnable paramRunnable)
  {
    a(paramRunnable, 0L);
  }

  public void run()
  {
    Looper.prepare();
    this.a = new Handler();
    this.b.countDown();
    Looper.loop();
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.h
 * JD-Core Version:    0.6.0
 */