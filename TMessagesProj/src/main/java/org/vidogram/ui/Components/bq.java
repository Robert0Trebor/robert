package org.vidogram.ui.Components;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.MediaCodec.CryptoException;
import android.net.Uri;
import android.os.Handler;
import android.view.Surface;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.vidogram.messenger.exoplayer.a.a;
import org.vidogram.messenger.exoplayer.c.e;
import org.vidogram.messenger.exoplayer.e.b;
import org.vidogram.messenger.exoplayer.e.i;
import org.vidogram.messenger.exoplayer.f;
import org.vidogram.messenger.exoplayer.f.n;
import org.vidogram.messenger.exoplayer.h.b;
import org.vidogram.messenger.exoplayer.h.c;
import org.vidogram.messenger.exoplayer.l;
import org.vidogram.messenger.exoplayer.m;
import org.vidogram.messenger.exoplayer.n.a;
import org.vidogram.messenger.exoplayer.p;
import org.vidogram.messenger.exoplayer.p.a;
import org.vidogram.messenger.exoplayer.t;
import org.vidogram.messenger.exoplayer.w;

@SuppressLint({"NewApi"})
public class bq
  implements h.c, p.a
{
  private final c a;
  private final org.vidogram.messenger.exoplayer.h b;
  private final Handler c;
  private final CopyOnWriteArrayList<b> d;
  private final n e;
  private int f;
  private int g;
  private boolean h;
  private Surface i;
  private w j;
  private w k;

  public bq(c paramc)
  {
    this.a = paramc;
    this.b = h.b.a(2, 1000, 5000);
    this.b.a(this);
    this.e = new n(this.b);
    this.c = new Handler();
    this.d = new CopyOnWriteArrayList();
    this.g = 1;
    this.f = 1;
  }

  private void c(boolean paramBoolean)
  {
    if (this.j == null)
      return;
    if (paramBoolean)
    {
      this.b.b(this.j, 1, this.i);
      return;
    }
    this.b.a(this.j, 1, this.i);
  }

  private void j()
  {
    boolean bool = this.b.b();
    int m = f();
    if ((this.h != bool) || (this.g != m))
    {
      Iterator localIterator = this.d.iterator();
      while (localIterator.hasNext())
        ((b)localIterator.next()).a(bool, m);
      this.h = bool;
      this.g = m;
    }
  }

  public void a()
  {
  }

  public void a(int paramInt1, int paramInt2, int paramInt3, float paramFloat)
  {
    Iterator localIterator = this.d.iterator();
    while (localIterator.hasNext())
      ((b)localIterator.next()).a(paramInt1, paramInt2, paramInt3, paramFloat);
  }

  public void a(int paramInt, long paramLong)
  {
  }

  public void a(long paramLong)
  {
    this.b.a(paramLong);
  }

  public void a(MediaCodec.CryptoException paramCryptoException)
  {
    Iterator localIterator = this.d.iterator();
    while (localIterator.hasNext())
      ((b)localIterator.next()).a(paramCryptoException);
  }

  public void a(Surface paramSurface)
  {
  }

  public void a(String paramString, long paramLong1, long paramLong2)
  {
  }

  public void a(org.vidogram.messenger.exoplayer.g paramg)
  {
    this.f = 1;
    Iterator localIterator = this.d.iterator();
    while (localIterator.hasNext())
      ((b)localIterator.next()).a(paramg);
  }

  public void a(n.a parama)
  {
    Iterator localIterator = this.d.iterator();
    while (localIterator.hasNext())
      ((b)localIterator.next()).a(parama);
  }

  public void a(b paramb)
  {
    this.d.add(paramb);
  }

  public void a(boolean paramBoolean)
  {
    this.b.a(paramBoolean);
  }

  public void a(boolean paramBoolean, int paramInt)
  {
    j();
  }

  void a(w[] paramArrayOfw)
  {
    int m = 0;
    while (m < 2)
    {
      if (paramArrayOfw[m] == null)
        paramArrayOfw[m] = new f();
      m += 1;
    }
    this.j = paramArrayOfw[0];
    this.k = paramArrayOfw[1];
    c(false);
    this.b.a(paramArrayOfw);
    this.f = 3;
  }

  public n b()
  {
    return this.e;
  }

  public void b(Surface paramSurface)
  {
    this.i = paramSurface;
    c(false);
  }

  public void b(boolean paramBoolean)
  {
    if (this.k == null)
      return;
    if (paramBoolean)
    {
      this.b.a(this.k, 1, Float.valueOf(0.0F));
      return;
    }
    this.b.a(this.k, 1, Float.valueOf(1.0F));
  }

  public void c()
  {
    this.i = null;
    c(true);
  }

  public void d()
  {
    if (this.f == 3)
      this.b.c();
    this.a.a();
    this.j = null;
    this.k = null;
    this.f = 2;
    j();
    this.a.a(this);
  }

  public void e()
  {
    this.a.a();
    this.f = 1;
    this.i = null;
    this.b.d();
  }

  public int f()
  {
    if (this.f == 2);
    int m;
    do
    {
      return 2;
      m = this.b.a();
    }
    while ((this.f == 3) && (m == 1));
    return m;
  }

  public long g()
  {
    return this.b.f();
  }

  public long h()
  {
    return this.b.e();
  }

  Handler i()
  {
    return this.c;
  }

  public static class a
    implements bq.c
  {
    private final Context a;
    private final String b;
    private final Uri c;

    public a(Context paramContext, String paramString, Uri paramUri)
    {
      this.a = paramContext;
      this.b = paramString;
      this.c = paramUri;
    }

    public void a()
    {
    }

    public void a(bq parambq)
    {
      Object localObject = new org.vidogram.messenger.exoplayer.e.g(262144);
      Handler localHandler = parambq.i();
      i locali = new i(this.a, this.b);
      localObject = new org.vidogram.messenger.exoplayer.c.h(this.c, locali, (b)localObject, 67108864, localHandler, null, 0, new e[0]);
      parambq.a(new w[] { new p(this.a, (t)localObject, m.a, 1, 5000L, localHandler, parambq, 50)
      {
        protected void a(long paramLong1, long paramLong2, boolean paramBoolean)
        {
          super.a(paramLong1, paramLong2, paramBoolean);
        }
      }
      , new l((t)localObject, m.a, null, true, localHandler, null, a.a(this.a), 3) });
    }
  }

  public static abstract interface b
  {
    public abstract void a(int paramInt1, int paramInt2, int paramInt3, float paramFloat);

    public abstract void a(Exception paramException);

    public abstract void a(boolean paramBoolean, int paramInt);
  }

  public static abstract interface c
  {
    public abstract void a();

    public abstract void a(bq parambq);
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.Components.bq
 * JD-Core Version:    0.6.0
 */