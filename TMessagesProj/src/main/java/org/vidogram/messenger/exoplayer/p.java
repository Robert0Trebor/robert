package org.vidogram.messenger.exoplayer;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaCrypto;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;
import java.nio.ByteBuffer;
import org.vidogram.messenger.exoplayer.b.b;
import org.vidogram.messenger.exoplayer.b.d;
import org.vidogram.messenger.exoplayer.f.i;
import org.vidogram.messenger.exoplayer.f.r;

@TargetApi(16)
public class p extends n
{
  private final x c;
  private final a d;
  private final long e;
  private final int f;
  private final int g;
  private Surface h;
  private boolean i;
  private boolean j;
  private long k;
  private long l;
  private int m;
  private int n;
  private int o;
  private float p;
  private int q;
  private int r;
  private int s;
  private float t;
  private int u;
  private int v;
  private int w;
  private float x;

  public p(Context paramContext, t paramt, m paramm, int paramInt1, long paramLong, Handler paramHandler, a parama, int paramInt2)
  {
    this(paramContext, paramt, paramm, paramInt1, paramLong, null, false, paramHandler, parama, paramInt2);
  }

  public p(Context paramContext, t paramt, m paramm, int paramInt1, long paramLong, b<d> paramb, boolean paramBoolean, Handler paramHandler, a parama, int paramInt2)
  {
    super(paramt, paramm, paramb, paramBoolean, paramHandler, parama);
    this.c = new x(paramContext);
    this.f = paramInt1;
    this.e = (1000L * paramLong);
    this.d = parama;
    this.g = paramInt2;
    this.k = -1L;
    this.q = -1;
    this.r = -1;
    this.t = -1.0F;
    this.p = -1.0F;
    this.u = -1;
    this.v = -1;
    this.x = -1.0F;
  }

  private void A()
  {
    if ((this.b == null) || (this.d == null) || (this.m == 0))
      return;
    long l1 = SystemClock.elapsedRealtime();
    int i1 = this.m;
    long l2 = this.l;
    this.b.post(new Runnable(i1, l1 - l2)
    {
      public void run()
      {
        p.a(p.this).a(this.a, this.b);
      }
    });
    this.m = 0;
    this.l = l1;
  }

  @SuppressLint({"InlinedApi"})
  private void a(android.media.MediaFormat paramMediaFormat, boolean paramBoolean)
  {
    if (paramMediaFormat.containsKey("max-input-size"))
      return;
    int i1 = paramMediaFormat.getInteger("height");
    int i2 = i1;
    if (paramBoolean)
    {
      i2 = i1;
      if (paramMediaFormat.containsKey("max-height"))
        i2 = Math.max(i1, paramMediaFormat.getInteger("max-height"));
    }
    i1 = paramMediaFormat.getInteger("width");
    int i3 = i1;
    if (paramBoolean)
    {
      i3 = i1;
      if (paramMediaFormat.containsKey("max-width"))
        i3 = Math.max(i2, paramMediaFormat.getInteger("max-width"));
    }
    String str = paramMediaFormat.getString("mime");
    i1 = -1;
    switch (str.hashCode())
    {
    default:
      switch (i1)
      {
      default:
        return;
      case 0:
      case 1:
        label160: i2 *= i3;
        i1 = 2;
      case 2:
      case 3:
      case 4:
      case 5:
      }
    case -1664118616:
    case 1187890754:
    case 1331836730:
    case 1599127256:
    case -1662541442:
    case 1599127257:
    }
    while (true)
    {
      paramMediaFormat.setInteger("max-input-size", i2 * 3 / (i1 * 2));
      return;
      if (!str.equals("video/3gpp"))
        break label160;
      i1 = 0;
      break label160;
      if (!str.equals("video/mp4v-es"))
        break label160;
      i1 = 1;
      break label160;
      if (!str.equals("video/avc"))
        break label160;
      i1 = 2;
      break label160;
      if (!str.equals("video/x-vnd.on2.vp8"))
        break label160;
      i1 = 3;
      break label160;
      if (!str.equals("video/hevc"))
        break label160;
      i1 = 4;
      break label160;
      if (!str.equals("video/x-vnd.on2.vp9"))
        break label160;
      i1 = 5;
      break label160;
      if ("BRAVIA 4K 2015".equals(r.d))
        break;
      i1 = (i3 + 15) / 16;
      i2 = (i2 + 15) / 16 * i1 * 16 * 16;
      i1 = 2;
      continue;
      i2 *= i3;
      i1 = 2;
      continue;
      i2 *= i3;
      i1 = 4;
    }
  }

  private void a(Surface paramSurface)
  {
    if (this.h == paramSurface);
    int i1;
    do
    {
      return;
      this.h = paramSurface;
      this.i = false;
      i1 = u();
    }
    while ((i1 != 2) && (i1 != 3));
    p();
    m();
  }

  private void l()
  {
    if ((this.b == null) || (this.d == null) || ((this.u == this.q) && (this.v == this.r) && (this.w == this.s) && (this.x == this.t)))
      return;
    int i1 = this.q;
    int i2 = this.r;
    int i3 = this.s;
    float f1 = this.t;
    this.b.post(new Runnable(i1, i2, i3, f1)
    {
      public void run()
      {
        p.a(p.this).a(this.a, this.b, this.c, this.d);
      }
    });
    this.u = i1;
    this.v = i2;
    this.w = i3;
    this.x = f1;
  }

  private void z()
  {
    if ((this.b == null) || (this.d == null) || (this.i))
      return;
    Surface localSurface = this.h;
    this.b.post(new Runnable(localSurface)
    {
      public void run()
      {
        p.a(p.this).a(this.a);
      }
    });
    this.i = true;
  }

  protected void a(int paramInt, long paramLong, boolean paramBoolean)
  {
    super.a(paramInt, paramLong, paramBoolean);
    if ((paramBoolean) && (this.e > 0L))
      this.k = (SystemClock.elapsedRealtime() * 1000L + this.e);
    this.c.a();
  }

  public void a(int paramInt, Object paramObject)
  {
    if (paramInt == 1)
    {
      a((Surface)paramObject);
      return;
    }
    super.a(paramInt, paramObject);
  }

  protected void a(MediaCodec paramMediaCodec, int paramInt)
  {
    org.vidogram.messenger.exoplayer.f.q.a("skipVideoBuffer");
    paramMediaCodec.releaseOutputBuffer(paramInt, false);
    org.vidogram.messenger.exoplayer.f.q.a();
    paramMediaCodec = this.a;
    paramMediaCodec.g += 1;
  }

  @TargetApi(21)
  protected void a(MediaCodec paramMediaCodec, int paramInt, long paramLong)
  {
    l();
    org.vidogram.messenger.exoplayer.f.q.a("releaseOutputBuffer");
    paramMediaCodec.releaseOutputBuffer(paramInt, paramLong);
    org.vidogram.messenger.exoplayer.f.q.a();
    paramMediaCodec = this.a;
    paramMediaCodec.f += 1;
    this.j = true;
    z();
  }

  protected void a(MediaCodec paramMediaCodec, android.media.MediaFormat paramMediaFormat)
  {
    int i1;
    int i2;
    if ((paramMediaFormat.containsKey("crop-right")) && (paramMediaFormat.containsKey("crop-left")) && (paramMediaFormat.containsKey("crop-bottom")) && (paramMediaFormat.containsKey("crop-top")))
    {
      i1 = 1;
      if (i1 == 0)
        break label175;
      i2 = paramMediaFormat.getInteger("crop-right") - paramMediaFormat.getInteger("crop-left") + 1;
      label65: this.q = i2;
      if (i1 == 0)
        break label186;
      i1 = paramMediaFormat.getInteger("crop-bottom") - paramMediaFormat.getInteger("crop-top") + 1;
      label93: this.r = i1;
      this.t = this.p;
      if (r.a < 21)
        break label196;
      if ((this.o == 90) || (this.o == 270))
      {
        i1 = this.q;
        this.q = this.r;
        this.r = i1;
        this.t = (1.0F / this.t);
      }
    }
    while (true)
    {
      paramMediaCodec.setVideoScalingMode(this.f);
      return;
      i1 = 0;
      break;
      label175: i2 = paramMediaFormat.getInteger("width");
      break label65;
      label186: i1 = paramMediaFormat.getInteger("height");
      break label93;
      label196: this.s = this.o;
    }
  }

  protected void a(MediaCodec paramMediaCodec, boolean paramBoolean, android.media.MediaFormat paramMediaFormat, MediaCrypto paramMediaCrypto)
  {
    a(paramMediaFormat, paramBoolean);
    paramMediaCodec.configure(paramMediaFormat, this.h, paramMediaCrypto, 0);
  }

  protected void a(q paramq)
  {
    super.a(paramq);
    float f1;
    if (paramq.a.m == -1.0F)
    {
      f1 = 1.0F;
      this.p = f1;
      if (paramq.a.l != -1)
        break label55;
    }
    label55: for (int i1 = 0; ; i1 = paramq.a.l)
    {
      this.o = i1;
      return;
      f1 = paramq.a.m;
      break;
    }
  }

  protected boolean a(long paramLong1, long paramLong2, MediaCodec paramMediaCodec, ByteBuffer paramByteBuffer, MediaCodec.BufferInfo paramBufferInfo, int paramInt, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      a(paramMediaCodec, paramInt);
      this.n = 0;
      return true;
    }
    if (!this.j)
    {
      if (r.a >= 21)
        a(paramMediaCodec, paramInt, System.nanoTime());
      while (true)
      {
        this.n = 0;
        return true;
        c(paramMediaCodec, paramInt);
      }
    }
    if (u() != 3)
      return false;
    long l2 = SystemClock.elapsedRealtime();
    long l3 = paramBufferInfo.presentationTimeUs;
    long l1 = System.nanoTime();
    paramLong1 = this.c.a(paramBufferInfo.presentationTimeUs, (l3 - paramLong1 - (l2 * 1000L - paramLong2)) * 1000L + l1);
    paramLong2 = (paramLong1 - l1) / 1000L;
    if (paramLong2 < -30000L)
    {
      b(paramMediaCodec, paramInt);
      return true;
    }
    if (r.a >= 21)
    {
      if (paramLong2 < 50000L)
      {
        a(paramMediaCodec, paramInt, paramLong1);
        this.n = 0;
        return true;
      }
    }
    else if (paramLong2 < 30000L)
    {
      if (paramLong2 > 11000L);
      try
      {
        Thread.sleep((paramLong2 - 10000L) / 1000L);
        c(paramMediaCodec, paramInt);
        this.n = 0;
        return true;
      }
      catch (java.lang.InterruptedException paramByteBuffer)
      {
        while (true)
          Thread.currentThread().interrupt();
      }
    }
    return false;
  }

  protected boolean a(MediaCodec paramMediaCodec, boolean paramBoolean, MediaFormat paramMediaFormat1, MediaFormat paramMediaFormat2)
  {
    return (paramMediaFormat2.b.equals(paramMediaFormat1.b)) && ((paramBoolean) || ((paramMediaFormat1.h == paramMediaFormat2.h) && (paramMediaFormat1.i == paramMediaFormat2.i)));
  }

  protected boolean a(m paramm, MediaFormat paramMediaFormat)
  {
    int i2 = 0;
    paramMediaFormat = paramMediaFormat.b;
    int i1 = i2;
    if (i.b(paramMediaFormat))
      if (!"video/x-unknown".equals(paramMediaFormat))
      {
        i1 = i2;
        if (paramm.a(paramMediaFormat, false) == null);
      }
      else
      {
        i1 = 1;
      }
    return i1;
  }

  protected void b(MediaCodec paramMediaCodec, int paramInt)
  {
    org.vidogram.messenger.exoplayer.f.q.a("dropVideoBuffer");
    paramMediaCodec.releaseOutputBuffer(paramInt, false);
    org.vidogram.messenger.exoplayer.f.q.a();
    paramMediaCodec = this.a;
    paramMediaCodec.h += 1;
    this.m += 1;
    this.n += 1;
    this.a.i = Math.max(this.n, this.a.i);
    if (this.m == this.g)
      A();
  }

  protected void c(long paramLong)
  {
    super.c(paramLong);
    this.j = false;
    this.n = 0;
    this.k = -1L;
  }

  protected void c(MediaCodec paramMediaCodec, int paramInt)
  {
    l();
    org.vidogram.messenger.exoplayer.f.q.a("releaseOutputBuffer");
    paramMediaCodec.releaseOutputBuffer(paramInt, true);
    org.vidogram.messenger.exoplayer.f.q.a();
    paramMediaCodec = this.a;
    paramMediaCodec.f += 1;
    this.j = true;
    z();
  }

  protected boolean c()
  {
    if ((super.c()) && ((this.j) || (!o()) || (r() == 2)))
      this.k = -1L;
    do
    {
      return true;
      if (this.k == -1L)
        return false;
    }
    while (SystemClock.elapsedRealtime() * 1000L < this.k);
    this.k = -1L;
    return false;
  }

  protected void h()
  {
    super.h();
    this.m = 0;
    this.l = SystemClock.elapsedRealtime();
  }

  protected void i()
  {
    this.k = -1L;
    A();
    super.i();
  }

  protected void j()
  {
    this.q = -1;
    this.r = -1;
    this.t = -1.0F;
    this.p = -1.0F;
    this.u = -1;
    this.v = -1;
    this.x = -1.0F;
    this.c.b();
    super.j();
  }

  protected boolean n()
  {
    return (super.n()) && (this.h != null) && (this.h.isValid());
  }

  public static abstract interface a extends n.b
  {
    public abstract void a(int paramInt1, int paramInt2, int paramInt3, float paramFloat);

    public abstract void a(int paramInt, long paramLong);

    public abstract void a(Surface paramSurface);
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.exoplayer.p
 * JD-Core Version:    0.6.0
 */