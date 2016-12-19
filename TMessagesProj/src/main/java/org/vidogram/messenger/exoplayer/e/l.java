package org.vidogram.messenger.exoplayer.e;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import org.vidogram.messenger.exoplayer.f.b;
import org.vidogram.messenger.exoplayer.f.q;
import org.vidogram.messenger.exoplayer.f.r;

public final class l
{
  private final ExecutorService a;
  private b b;
  private boolean c;

  public l(String paramString)
  {
    this.a = r.a(paramString);
  }

  public void a(Looper paramLooper, c paramc, a parama)
  {
    if (!this.c);
    for (boolean bool = true; ; bool = false)
    {
      b.b(bool);
      this.c = true;
      this.b = new b(paramLooper, paramc, parama);
      this.a.submit(this.b);
      return;
    }
  }

  public void a(Runnable paramRunnable)
  {
    if (this.c)
      b();
    if (paramRunnable != null)
      this.a.submit(paramRunnable);
    this.a.shutdown();
  }

  public void a(c paramc, a parama)
  {
    Looper localLooper = Looper.myLooper();
    if (localLooper != null);
    for (boolean bool = true; ; bool = false)
    {
      b.b(bool);
      a(localLooper, paramc, parama);
      return;
    }
  }

  public boolean a()
  {
    return this.c;
  }

  public void b()
  {
    b.b(this.c);
    this.b.a();
  }

  public static abstract interface a
  {
    public abstract void a(l.c paramc);

    public abstract void a(l.c paramc, IOException paramIOException);

    public abstract void b(l.c paramc);
  }

  @SuppressLint({"HandlerLeak"})
  private final class b extends Handler
    implements Runnable
  {
    private final l.c b;
    private final l.a c;
    private volatile Thread d;

    public b(Looper paramc, l.c parama, l.a arg4)
    {
      super();
      this.b = parama;
      Object localObject;
      this.c = localObject;
    }

    private void b()
    {
      l.a(l.this, false);
      l.a(l.this, null);
    }

    public void a()
    {
      this.b.a();
      if (this.d != null)
        this.d.interrupt();
    }

    public void handleMessage(Message paramMessage)
    {
      if (paramMessage.what == 2)
        throw ((Error)paramMessage.obj);
      b();
      if (this.b.b())
      {
        this.c.b(this.b);
        return;
      }
      switch (paramMessage.what)
      {
      default:
        return;
      case 0:
        this.c.a(this.b);
        return;
      case 1:
      }
      this.c.a(this.b, (IOException)paramMessage.obj);
    }

    public void run()
    {
      try
      {
        this.d = Thread.currentThread();
        if (!this.b.b())
        {
          q.a(this.b.getClass().getSimpleName() + ".load()");
          this.b.c();
          q.a();
        }
        sendEmptyMessage(0);
        return;
      }
      catch (IOException localIOException)
      {
        obtainMessage(1, localIOException).sendToTarget();
        return;
      }
      catch (InterruptedException localInterruptedException)
      {
        b.b(this.b.b());
        sendEmptyMessage(0);
        return;
      }
      catch (Exception localException)
      {
        Log.e("LoadTask", "Unexpected exception loading stream", localException);
        obtainMessage(1, new l.d(localException)).sendToTarget();
        return;
      }
      catch (Error localError)
      {
        Log.e("LoadTask", "Unexpected error loading stream", localError);
        obtainMessage(2, localError).sendToTarget();
      }
      throw localError;
    }
  }

  public static abstract interface c
  {
    public abstract void a();

    public abstract boolean b();

    public abstract void c();
  }

  public static final class d extends IOException
  {
    public d(Exception paramException)
    {
      super(paramException);
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.exoplayer.e.l
 * JD-Core Version:    0.6.0
 */