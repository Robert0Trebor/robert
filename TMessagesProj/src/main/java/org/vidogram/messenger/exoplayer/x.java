package org.vidogram.messenger.exoplayer;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.Choreographer.FrameCallback;
import android.view.Display;
import android.view.WindowManager;

@TargetApi(16)
public final class x
{
  private final a a;
  private final boolean b;
  private final long c;
  private final long d;
  private long e;
  private long f;
  private long g;
  private boolean h;
  private long i;
  private long j;
  private long k;

  public x()
  {
    this(-1.0F, false);
  }

  private x(float paramFloat, boolean paramBoolean)
  {
    this.b = paramBoolean;
    if (paramBoolean)
    {
      this.a = a.a();
      this.c = ()(1000000000.0D / paramFloat);
      this.d = (this.c * 80L / 100L);
      return;
    }
    this.a = null;
    this.c = -1L;
    this.d = -1L;
  }

  public x(Context paramContext)
  {
    this(a(paramContext), true);
  }

  private static float a(Context paramContext)
  {
    return ((WindowManager)paramContext.getSystemService("window")).getDefaultDisplay().getRefreshRate();
  }

  private static long a(long paramLong1, long paramLong2, long paramLong3)
  {
    paramLong2 = (paramLong1 - paramLong2) / paramLong3 * paramLong3 + paramLong2;
    long l;
    if (paramLong1 <= paramLong2)
      l = paramLong2 - paramLong3;
    while (paramLong2 - paramLong1 < paramLong1 - l)
    {
      return paramLong2;
      l = paramLong2;
      paramLong2 += paramLong3;
    }
    return l;
  }

  private boolean b(long paramLong1, long paramLong2)
  {
    long l = this.j;
    return Math.abs(paramLong2 - this.i - (paramLong1 - l)) > 20000000L;
  }

  public long a(long paramLong1, long paramLong2)
  {
    long l3 = paramLong1 * 1000L;
    long l1;
    long l2;
    if (this.h)
    {
      if (paramLong1 != this.e)
      {
        this.k += 1L;
        this.f = this.g;
      }
      if (this.k >= 6L)
      {
        l1 = (l3 - this.j) / this.k;
        l2 = this.f + l1;
        if (b(l2, paramLong2))
        {
          this.h = false;
          l1 = paramLong2;
          l2 = l3;
        }
      }
    }
    while (true)
    {
      if (!this.h)
      {
        this.j = l3;
        this.i = paramLong2;
        this.k = 0L;
        this.h = true;
        c();
      }
      this.e = paramLong1;
      this.g = l2;
      if ((this.a != null) && (this.a.a != 0L))
        break;
      return l1;
      l1 = this.i + l2 - this.j;
      continue;
      if (b(l3, paramLong2))
        this.h = false;
      l1 = paramLong2;
      l2 = l3;
    }
    return a(l1, this.a.a, this.c) - this.d;
  }

  public void a()
  {
    this.h = false;
    if (this.b)
      this.a.b();
  }

  public void b()
  {
    if (this.b)
      this.a.c();
  }

  protected void c()
  {
  }

  private static final class a
    implements Handler.Callback, Choreographer.FrameCallback
  {
    private static final a b = new a();
    public volatile long a;
    private final Handler c;
    private final HandlerThread d = new HandlerThread("ChoreographerOwner:Handler");
    private Choreographer e;
    private int f;

    private a()
    {
      this.d.start();
      this.c = new Handler(this.d.getLooper(), this);
      this.c.sendEmptyMessage(0);
    }

    public static a a()
    {
      return b;
    }

    private void d()
    {
      this.e = Choreographer.getInstance();
    }

    private void e()
    {
      this.f += 1;
      if (this.f == 1)
        this.e.postFrameCallback(this);
    }

    private void f()
    {
      this.f -= 1;
      if (this.f == 0)
      {
        this.e.removeFrameCallback(this);
        this.a = 0L;
      }
    }

    public void b()
    {
      this.c.sendEmptyMessage(1);
    }

    public void c()
    {
      this.c.sendEmptyMessage(2);
    }

    public void doFrame(long paramLong)
    {
      this.a = paramLong;
      this.e.postFrameCallbackDelayed(this, 500L);
    }

    public boolean handleMessage(Message paramMessage)
    {
      switch (paramMessage.what)
      {
      default:
        return false;
      case 0:
        d();
        return true;
      case 1:
        e();
        return true;
      case 2:
      }
      f();
      return true;
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.exoplayer.x
 * JD-Core Version:    0.6.0
 */