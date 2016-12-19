package org.vidogram.messenger.exoplayer;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.vidogram.messenger.exoplayer.f.b;
import org.vidogram.messenger.exoplayer.f.p;
import org.vidogram.messenger.exoplayer.f.q;
import org.vidogram.messenger.exoplayer.f.r;

final class j
  implements Handler.Callback
{
  private final Handler a;
  private final HandlerThread b;
  private final Handler c;
  private final v d;
  private final AtomicInteger e;
  private final List<w> f;
  private final MediaFormat[][] g;
  private final int[] h;
  private final long i;
  private final long j;
  private w[] k;
  private w l;
  private k m;
  private boolean n;
  private boolean o;
  private boolean p;
  private int q;
  private int r = 0;
  private int s = 0;
  private long t;
  private long u;
  private volatile long v;
  private volatile long w;
  private volatile long x;

  public j(Handler paramHandler, boolean paramBoolean, int[] paramArrayOfInt, int paramInt1, int paramInt2)
  {
    this.c = paramHandler;
    this.o = paramBoolean;
    this.i = (paramInt1 * 1000L);
    this.j = (paramInt2 * 1000L);
    this.h = Arrays.copyOf(paramArrayOfInt, paramArrayOfInt.length);
    this.q = 1;
    this.v = -1L;
    this.x = -1L;
    this.d = new v();
    this.e = new AtomicInteger();
    this.f = new ArrayList(paramArrayOfInt.length);
    this.g = new MediaFormat[paramArrayOfInt.length][];
    this.b = new p("ExoPlayerImplInternal:Handler", -16);
    this.b.start();
    this.a = new Handler(this.b.getLooper(), this);
  }

  private void a(int paramInt)
  {
    if (this.q != paramInt)
    {
      this.q = paramInt;
      this.c.obtainMessage(2, paramInt, 0).sendToTarget();
    }
  }

  private void a(int paramInt1, int paramInt2)
  {
    boolean bool = true;
    if (this.h[paramInt1] == paramInt2);
    w localw;
    int i1;
    while (true)
    {
      return;
      this.h[paramInt1] = paramInt2;
      if ((this.q == 1) || (this.q == 2))
        continue;
      localw = this.k[paramInt1];
      i1 = localw.u();
      if ((i1 == 0) || (i1 == -1) || (localw.c_() == 0))
        continue;
      if ((i1 != 2) && (i1 != 3))
        break;
      i1 = 1;
      if ((paramInt2 < 0) || (paramInt2 >= this.g[paramInt1].length))
        break label211;
      paramInt1 = 1;
      label97: if (i1 != 0)
      {
        if ((paramInt1 == 0) && (localw == this.l))
          this.d.a(this.m.a());
        e(localw);
        this.f.remove(localw);
      }
      if (paramInt1 == 0)
        continue;
      if ((!this.o) || (this.q != 4))
        break label216;
      paramInt1 = 1;
      label169: if ((i1 != 0) || (paramInt1 == 0))
        break label221;
    }
    while (true)
    {
      a(localw, paramInt2, bool);
      if (paramInt1 != 0)
        localw.v();
      this.a.sendEmptyMessage(7);
      return;
      i1 = 0;
      break;
      label211: paramInt1 = 0;
      break label97;
      label216: paramInt1 = 0;
      break label169;
      label221: bool = false;
    }
  }

  private void a(int paramInt, long paramLong1, long paramLong2)
  {
    paramLong1 = paramLong1 + paramLong2 - SystemClock.elapsedRealtime();
    if (paramLong1 <= 0L)
    {
      this.a.sendEmptyMessage(paramInt);
      return;
    }
    this.a.sendEmptyMessageDelayed(paramInt, paramLong1);
  }

  // ERROR //
  private <T> void a(int paramInt, Object paramObject)
  {
    // Byte code:
    //   0: aload_2
    //   1: checkcast 189	android/util/Pair
    //   4: astore_2
    //   5: aload_2
    //   6: getfield 193	android/util/Pair:first	Ljava/lang/Object;
    //   9: checkcast 195	org/vidogram/messenger/exoplayer/h$a
    //   12: iload_1
    //   13: aload_2
    //   14: getfield 198	android/util/Pair:second	Ljava/lang/Object;
    //   17: invokeinterface 200 3 0
    //   22: aload_0
    //   23: getfield 73	org/vidogram/messenger/exoplayer/j:q	I
    //   26: iconst_1
    //   27: if_icmpeq +21 -> 48
    //   30: aload_0
    //   31: getfield 73	org/vidogram/messenger/exoplayer/j:q	I
    //   34: iconst_2
    //   35: if_icmpeq +13 -> 48
    //   38: aload_0
    //   39: getfield 125	org/vidogram/messenger/exoplayer/j:a	Landroid/os/Handler;
    //   42: bipush 7
    //   44: invokevirtual 176	android/os/Handler:sendEmptyMessage	(I)Z
    //   47: pop
    //   48: aload_0
    //   49: monitorenter
    //   50: aload_0
    //   51: aload_0
    //   52: getfield 53	org/vidogram/messenger/exoplayer/j:s	I
    //   55: iconst_1
    //   56: iadd
    //   57: putfield 53	org/vidogram/messenger/exoplayer/j:s	I
    //   60: aload_0
    //   61: invokevirtual 203	java/lang/Object:notifyAll	()V
    //   64: aload_0
    //   65: monitorexit
    //   66: return
    //   67: astore_2
    //   68: aload_0
    //   69: monitorexit
    //   70: aload_2
    //   71: athrow
    //   72: astore_2
    //   73: aload_0
    //   74: monitorenter
    //   75: aload_0
    //   76: aload_0
    //   77: getfield 53	org/vidogram/messenger/exoplayer/j:s	I
    //   80: iconst_1
    //   81: iadd
    //   82: putfield 53	org/vidogram/messenger/exoplayer/j:s	I
    //   85: aload_0
    //   86: invokevirtual 203	java/lang/Object:notifyAll	()V
    //   89: aload_0
    //   90: monitorexit
    //   91: aload_2
    //   92: athrow
    //   93: astore_2
    //   94: aload_0
    //   95: monitorexit
    //   96: aload_2
    //   97: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   50	66	67	finally
    //   68	70	67	finally
    //   0	48	72	finally
    //   75	91	93	finally
    //   94	96	93	finally
  }

  private void a(w paramw, int paramInt, boolean paramBoolean)
  {
    paramw.b(paramInt, this.w, paramBoolean);
    this.f.add(paramw);
    k localk = paramw.g();
    if (localk != null)
      if (this.m != null)
        break label57;
    label57: for (paramBoolean = true; ; paramBoolean = false)
    {
      b.b(paramBoolean);
      this.m = localk;
      this.l = paramw;
      return;
    }
  }

  private boolean a(w paramw)
  {
    int i2 = 0;
    if (paramw.b());
    do
    {
      return true;
      if (!paramw.c())
        return false;
    }
    while (this.q == 4);
    long l2 = paramw.e();
    long l3 = paramw.f();
    long l1;
    if (this.p)
      l1 = this.j;
    while (true)
    {
      int i1;
      if ((l1 > 0L) && (l3 != -1L) && (l3 != -3L) && (l3 < l1 + this.w))
      {
        i1 = i2;
        if (l2 != -1L)
        {
          i1 = i2;
          if (l2 != -2L)
          {
            i1 = i2;
            if (l3 < l2);
          }
        }
      }
      else
      {
        i1 = 1;
      }
      return i1;
      l1 = this.i;
    }
  }

  private void b(long paramLong)
  {
    try
    {
      long l1 = this.w / 1000L;
      if (paramLong == l1)
        return;
      this.p = false;
      this.w = (paramLong * 1000L);
      this.d.c();
      this.d.a(this.w);
      if (this.q != 1)
      {
        i1 = this.q;
        if (i1 != 2);
      }
      else
      {
        return;
      }
      int i1 = 0;
      while (i1 < this.f.size())
      {
        w localw = (w)this.f.get(i1);
        d(localw);
        localw.b(this.w);
        i1 += 1;
      }
      a(3);
      this.a.sendEmptyMessage(7);
      return;
    }
    finally
    {
      this.e.decrementAndGet();
    }
    throw localObject;
  }

  private void b(w paramw)
  {
    try
    {
      e(paramw);
      return;
    }
    catch (g paramw)
    {
      Log.e("ExoPlayerImplInternal", "Stop failed.", paramw);
      return;
    }
    catch (java.lang.RuntimeException paramw)
    {
      Log.e("ExoPlayerImplInternal", "Stop failed.", paramw);
    }
  }

  private void b(boolean paramBoolean)
  {
    while (true)
    {
      try
      {
        this.p = false;
        this.o = paramBoolean;
        if (paramBoolean)
          continue;
        h();
        i();
        return;
        if (this.q == 4)
        {
          g();
          this.a.sendEmptyMessage(7);
          continue;
        }
      }
      finally
      {
        this.c.obtainMessage(3).sendToTarget();
      }
      if (this.q != 3)
        continue;
      this.a.sendEmptyMessage(7);
    }
  }

  private void b(w[] paramArrayOfw)
  {
    m();
    this.k = paramArrayOfw;
    Arrays.fill(this.g, null);
    a(2);
    f();
  }

  private void c(w paramw)
  {
    try
    {
      paramw.y();
      return;
    }
    catch (g paramw)
    {
      Log.e("ExoPlayerImplInternal", "Release failed.", paramw);
      return;
    }
    catch (java.lang.RuntimeException paramw)
    {
      Log.e("ExoPlayerImplInternal", "Release failed.", paramw);
    }
  }

  private void d(w paramw)
  {
    if (paramw.u() == 3)
      paramw.w();
  }

  private void e(w paramw)
  {
    d(paramw);
    if (paramw.u() == 2)
    {
      paramw.x();
      if (paramw == this.l)
      {
        this.m = null;
        this.l = null;
      }
    }
  }

  private void f()
  {
    long l1 = SystemClock.elapsedRealtime();
    int i2 = 1;
    int i1 = 0;
    w localw;
    while (i1 < this.k.length)
    {
      localw = this.k[i1];
      i3 = i2;
      if (localw.u() == 0)
      {
        i3 = i2;
        if (localw.f(this.w) == 0)
        {
          localw.d();
          i3 = 0;
        }
      }
      i1 += 1;
      i2 = i3;
    }
    if (i2 == 0)
    {
      a(2, l1, 10L);
      return;
    }
    long l2 = 0L;
    i2 = 1;
    int i4 = 1;
    int i3 = 0;
    if (i3 < this.k.length)
    {
      localw = this.k[i3];
      int i6 = localw.c_();
      MediaFormat[] arrayOfMediaFormat = new MediaFormat[i6];
      i1 = 0;
      while (i1 < i6)
      {
        arrayOfMediaFormat[i1] = localw.a(i1);
        i1 += 1;
      }
      this.g[i3] = arrayOfMediaFormat;
      i1 = i4;
      int i5 = i2;
      long l3 = l2;
      if (i6 > 0)
      {
        if (l2 != -1L)
          break label287;
        l1 = l2;
        label183: i6 = this.h[i3];
        i1 = i4;
        i5 = i2;
        l3 = l1;
        if (i6 >= 0)
        {
          i1 = i4;
          i5 = i2;
          l3 = l1;
          if (i6 < arrayOfMediaFormat.length)
          {
            a(localw, i6, false);
            if ((i2 == 0) || (!localw.b()))
              break label336;
            i2 = 1;
            label247: if ((i4 == 0) || (!a(localw)))
              break label341;
            i1 = 1;
            l3 = l1;
            i5 = i2;
          }
        }
      }
      while (true)
      {
        i3 += 1;
        i4 = i1;
        i2 = i5;
        l2 = l3;
        break;
        label287: l3 = localw.e();
        if (l3 == -1L)
        {
          l1 = -1L;
          break label183;
        }
        l1 = l2;
        if (l3 == -2L)
          break label183;
        l1 = Math.max(l2, l3);
        break label183;
        label336: i2 = 0;
        break label247;
        label341: i1 = 0;
        i5 = i2;
        l3 = l1;
      }
    }
    this.v = l2;
    if ((i2 != 0) && ((l2 == -1L) || (l2 <= this.w)))
    {
      this.q = 5;
      this.c.obtainMessage(1, this.q, 0, this.g).sendToTarget();
      if ((this.o) && (this.q == 4))
        g();
      this.a.sendEmptyMessage(7);
      return;
    }
    if (i4 != 0);
    for (i1 = 4; ; i1 = 3)
    {
      this.q = i1;
      break;
    }
  }

  private void g()
  {
    this.p = false;
    this.d.b();
    int i1 = 0;
    while (i1 < this.f.size())
    {
      ((w)this.f.get(i1)).v();
      i1 += 1;
    }
  }

  private void h()
  {
    this.d.c();
    int i1 = 0;
    while (i1 < this.f.size())
    {
      d((w)this.f.get(i1));
      i1 += 1;
    }
  }

  private void i()
  {
    if ((this.m != null) && (this.f.contains(this.l)) && (!this.l.b()))
    {
      this.w = this.m.a();
      this.d.a(this.w);
    }
    while (true)
    {
      this.u = (SystemClock.elapsedRealtime() * 1000L);
      return;
      this.w = this.d.a();
    }
  }

  private void j()
  {
    q.a("doSomeWork");
    long l3 = SystemClock.elapsedRealtime();
    long l1;
    int i2;
    int i1;
    int i3;
    long l2;
    label42: w localw;
    if (this.v != -1L)
    {
      l1 = this.v;
      i();
      i2 = 1;
      i1 = 1;
      i3 = 0;
      l2 = l1;
      if (i3 >= this.f.size())
        break label254;
      localw = (w)this.f.get(i3);
      localw.a(this.w, this.u);
      if ((i1 == 0) || (!localw.b()))
        break label158;
      i1 = 1;
      label97: boolean bool = a(localw);
      if (!bool)
        localw.d();
      if ((i2 == 0) || (!bool))
        break label163;
      i2 = 1;
      label126: if (l2 != -1L)
        break label168;
      l1 = l2;
    }
    while (true)
    {
      i3 += 1;
      l2 = l1;
      break label42;
      l1 = 9223372036854775807L;
      break;
      label158: i1 = 0;
      break label97;
      label163: i2 = 0;
      break label126;
      label168: long l4 = localw.e();
      long l5 = localw.f();
      if (l5 == -1L)
      {
        l1 = -1L;
        continue;
      }
      l1 = l2;
      if (l5 == -3L)
        continue;
      if ((l4 != -1L) && (l4 != -2L))
      {
        l1 = l2;
        if (l5 >= l4)
          continue;
      }
      l1 = Math.min(l2, l5);
    }
    label254: this.x = l2;
    if ((i1 != 0) && ((this.v == -1L) || (this.v <= this.w)))
    {
      a(5);
      h();
      this.a.removeMessages(7);
      if (((!this.o) || (this.q != 4)) && (this.q != 3))
        break label406;
      a(7, l3, 10L);
    }
    while (true)
    {
      q.a();
      return;
      if ((this.q == 3) && (i2 != 0))
      {
        a(4);
        if (!this.o)
          break;
        g();
        break;
      }
      if ((this.q != 4) || (i2 != 0))
        break;
      this.p = this.o;
      a(3);
      h();
      break;
      label406: if (this.f.isEmpty())
        continue;
      a(7, l3, 1000L);
    }
  }

  private void k()
  {
    m();
    a(1);
  }

  private void l()
  {
    m();
    a(1);
    monitorenter;
    try
    {
      this.n = true;
      notifyAll();
      return;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  private void m()
  {
    int i1 = 0;
    this.a.removeMessages(7);
    this.a.removeMessages(2);
    this.p = false;
    this.d.c();
    if (this.k == null)
      return;
    while (i1 < this.k.length)
    {
      w localw = this.k[i1];
      b(localw);
      c(localw);
      i1 += 1;
    }
    this.k = null;
    this.m = null;
    this.l = null;
    this.f.clear();
  }

  public long a()
  {
    if (this.e.get() > 0)
      return this.t;
    return this.w / 1000L;
  }

  public void a(long paramLong)
  {
    this.t = paramLong;
    this.e.incrementAndGet();
    this.a.obtainMessage(6, r.a(paramLong), r.b(paramLong)).sendToTarget();
  }

  public void a(h.a parama, int paramInt, Object paramObject)
  {
    this.r += 1;
    this.a.obtainMessage(9, paramInt, 0, Pair.create(parama, paramObject)).sendToTarget();
  }

  public void a(boolean paramBoolean)
  {
    Handler localHandler = this.a;
    if (paramBoolean);
    for (int i1 = 1; ; i1 = 0)
    {
      localHandler.obtainMessage(3, i1, 0).sendToTarget();
      return;
    }
  }

  public void a(w[] paramArrayOfw)
  {
    this.a.obtainMessage(1, paramArrayOfw).sendToTarget();
  }

  public long b()
  {
    if (this.x == -1L)
      return -1L;
    return this.x / 1000L;
  }

  public void b(h.a parama, int paramInt, Object paramObject)
  {
    monitorenter;
    try
    {
      if (this.n)
      {
        Log.w("ExoPlayerImplInternal", "Sent message(" + paramInt + ") after release. Message ignored.");
        return;
      }
      int i1 = this.r;
      this.r = (i1 + 1);
      this.a.obtainMessage(9, paramInt, 0, Pair.create(parama, paramObject)).sendToTarget();
      while (true)
      {
        paramInt = this.s;
        if (paramInt > i1)
          break;
        try
        {
          wait();
        }
        catch (InterruptedException parama)
        {
          Thread.currentThread().interrupt();
        }
      }
    }
    finally
    {
      monitorexit;
    }
    throw parama;
  }

  public long c()
  {
    if (this.v == -1L)
      return -1L;
    return this.v / 1000L;
  }

  public void d()
  {
    this.a.sendEmptyMessage(4);
  }

  public void e()
  {
    monitorenter;
    while (true)
    {
      try
      {
        boolean bool = this.n;
        if (bool)
          return;
        this.a.sendEmptyMessage(5);
        bool = this.n;
        if (!bool)
        {
          try
          {
            wait();
          }
          catch (InterruptedException localInterruptedException)
          {
            Thread.currentThread().interrupt();
          }
          continue;
        }
      }
      finally
      {
        monitorexit;
      }
      this.b.quit();
    }
  }

  public boolean handleMessage(Message paramMessage)
  {
    boolean bool = false;
    try
    {
      switch (paramMessage.what)
      {
      case 1:
        b((w[])(w[])paramMessage.obj);
        return true;
      case 2:
        f();
        return true;
      case 3:
        if (paramMessage.arg1 != 0)
          bool = true;
        b(bool);
        return true;
      case 7:
        j();
        return true;
      case 6:
        b(r.b(paramMessage.arg1, paramMessage.arg2));
        return true;
      case 4:
        k();
        return true;
      case 5:
        l();
        return true;
      case 9:
        a(paramMessage.arg1, paramMessage.obj);
        return true;
      case 8:
        a(paramMessage.arg1, paramMessage.arg2);
        return true;
      }
    }
    catch (g paramMessage)
    {
      Log.e("ExoPlayerImplInternal", "Internal track renderer error.", paramMessage);
      this.c.obtainMessage(4, paramMessage).sendToTarget();
      k();
      return true;
    }
    catch (java.lang.RuntimeException paramMessage)
    {
      Log.e("ExoPlayerImplInternal", "Internal runtime error.", paramMessage);
      this.c.obtainMessage(4, new g(paramMessage, true)).sendToTarget();
      k();
      return true;
    }
    return false;
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.exoplayer.j
 * JD-Core Version:    0.6.0
 */