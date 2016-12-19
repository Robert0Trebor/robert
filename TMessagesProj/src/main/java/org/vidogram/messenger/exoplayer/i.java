package org.vidogram.messenger.exoplayer;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

final class i
  implements h
{
  private final Handler a;
  private final j b;
  private final CopyOnWriteArraySet<h.c> c;
  private final MediaFormat[][] d;
  private final int[] e;
  private boolean f;
  private int g;
  private int h;

  @SuppressLint({"HandlerLeak"})
  public i(int paramInt1, int paramInt2, int paramInt3)
  {
    Log.i("ExoPlayerImpl", "Init 1.5.10");
    this.f = false;
    this.g = 1;
    this.c = new CopyOnWriteArraySet();
    this.d = new MediaFormat[paramInt1][];
    this.e = new int[paramInt1];
    this.a = new Handler()
    {
      public void handleMessage(Message paramMessage)
      {
        i.this.a(paramMessage);
      }
    };
    this.b = new j(this.a, this.f, this.e, paramInt2, paramInt3);
  }

  public int a()
  {
    return this.g;
  }

  public void a(long paramLong)
  {
    this.b.a(paramLong);
  }

  void a(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default:
    case 1:
    case 2:
    case 3:
    case 4:
    }
    while (true)
    {
      return;
      System.arraycopy(paramMessage.obj, 0, this.d, 0, this.d.length);
      this.g = paramMessage.arg1;
      paramMessage = this.c.iterator();
      while (paramMessage.hasNext())
        ((h.c)paramMessage.next()).a(this.f, this.g);
      continue;
      this.g = paramMessage.arg1;
      paramMessage = this.c.iterator();
      while (paramMessage.hasNext())
        ((h.c)paramMessage.next()).a(this.f, this.g);
      continue;
      this.h -= 1;
      if (this.h != 0)
        continue;
      paramMessage = this.c.iterator();
      while (paramMessage.hasNext())
        ((h.c)paramMessage.next()).a();
      continue;
      paramMessage = (g)paramMessage.obj;
      Iterator localIterator = this.c.iterator();
      while (localIterator.hasNext())
        ((h.c)localIterator.next()).a(paramMessage);
    }
  }

  public void a(h.a parama, int paramInt, Object paramObject)
  {
    this.b.a(parama, paramInt, paramObject);
  }

  public void a(h.c paramc)
  {
    this.c.add(paramc);
  }

  public void a(boolean paramBoolean)
  {
    if (this.f != paramBoolean)
    {
      this.f = paramBoolean;
      this.h += 1;
      this.b.a(paramBoolean);
      Iterator localIterator = this.c.iterator();
      while (localIterator.hasNext())
        ((h.c)localIterator.next()).a(paramBoolean, this.g);
    }
  }

  public void a(w[] paramArrayOfw)
  {
    Arrays.fill(this.d, null);
    this.b.a(paramArrayOfw);
  }

  public void b(h.a parama, int paramInt, Object paramObject)
  {
    this.b.b(parama, paramInt, paramObject);
  }

  public boolean b()
  {
    return this.f;
  }

  public void c()
  {
    this.b.d();
  }

  public void d()
  {
    this.b.e();
    this.a.removeCallbacksAndMessages(null);
  }

  public long e()
  {
    return this.b.c();
  }

  public long f()
  {
    return this.b.a();
  }

  public int g()
  {
    long l1 = 100L;
    long l2 = h();
    long l3 = e();
    if ((l2 == -1L) || (l3 == -1L))
      return 0;
    if (l3 == 0L);
    while (true)
    {
      return (int)l1;
      l1 = 100L * l2 / l3;
    }
  }

  public long h()
  {
    return this.b.b();
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.exoplayer.i
 * JD-Core Version:    0.6.0
 */