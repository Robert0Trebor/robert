package org.vidogram.messenger.exoplayer;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaCodec.CodecException;
import android.media.MediaCodec.CryptoException;
import android.media.MediaCodec.CryptoInfo;
import android.media.MediaCrypto;
import android.os.Handler;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import org.vidogram.messenger.exoplayer.b.a;
import org.vidogram.messenger.exoplayer.f.k;
import org.vidogram.messenger.exoplayer.f.r;

@TargetApi(16)
public abstract class n extends u
{
  private static final byte[] c = r.d("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78");
  private long A;
  private int B;
  private int C;
  private boolean D;
  private boolean E;
  private int F;
  private int G;
  private boolean H;
  private boolean I;
  private int J;
  private boolean K;
  private boolean L;
  private boolean M;
  private boolean N;
  public final c a;
  protected final Handler b;
  private final m d;
  private final org.vidogram.messenger.exoplayer.b.b<org.vidogram.messenger.exoplayer.b.d> e;
  private final boolean f;
  private final s g;
  private final q h;
  private final List<Long> i;
  private final MediaCodec.BufferInfo j;
  private final b k;
  private final boolean l;
  private MediaFormat m;
  private a n;
  private MediaCodec o;
  private boolean p;
  private boolean q;
  private boolean r;
  private boolean s;
  private boolean t;
  private boolean u;
  private boolean v;
  private boolean w;
  private boolean x;
  private ByteBuffer[] y;
  private ByteBuffer[] z;

  public n(t paramt, m paramm, org.vidogram.messenger.exoplayer.b.b<org.vidogram.messenger.exoplayer.b.d> paramb, boolean paramBoolean, Handler paramHandler, b paramb1)
  {
    this(new t[] { paramt }, paramm, paramb, paramBoolean, paramHandler, paramb1);
  }

  public n(t[] paramArrayOft, m paramm, org.vidogram.messenger.exoplayer.b.b<org.vidogram.messenger.exoplayer.b.d> paramb, boolean paramBoolean, Handler paramHandler, b paramb1)
  {
    super(paramArrayOft);
    if (r.a >= 16);
    for (boolean bool = true; ; bool = false)
    {
      org.vidogram.messenger.exoplayer.f.b.b(bool);
      this.d = ((m)org.vidogram.messenger.exoplayer.f.b.a(paramm));
      this.e = paramb;
      this.f = paramBoolean;
      this.b = paramHandler;
      this.k = paramb1;
      this.l = B();
      this.a = new c();
      this.g = new s(0);
      this.h = new q();
      this.i = new ArrayList();
      this.j = new MediaCodec.BufferInfo();
      this.F = 0;
      this.G = 0;
      return;
    }
  }

  private void A()
  {
    if (this.G == 2)
    {
      p();
      m();
      return;
    }
    this.L = true;
    k();
  }

  private static boolean B()
  {
    return (r.a <= 22) && ("foster".equals(r.b)) && ("NVIDIA".equals(r.c));
  }

  private static MediaCodec.CryptoInfo a(s params, int paramInt)
  {
    params = params.a.a();
    if (paramInt == 0)
      return params;
    if (params.numBytesOfClearData == null)
      params.numBytesOfClearData = new int[1];
    int[] arrayOfInt = params.numBytesOfClearData;
    arrayOfInt[0] += paramInt;
    return params;
  }

  private void a(MediaCodec.CryptoException paramCryptoException)
  {
    if ((this.b != null) && (this.k != null))
      this.b.post(new Runnable(paramCryptoException)
      {
        public void run()
        {
          n.a(n.this).a(this.a);
        }
      });
  }

  private void a(String paramString, long paramLong1, long paramLong2)
  {
    if ((this.b != null) && (this.k != null))
      this.b.post(new Runnable(paramString, paramLong1, paramLong2)
      {
        public void run()
        {
          n.a(n.this).a(this.a, this.b, this.c);
        }
      });
  }

  private void a(a parama)
  {
    b(parama);
    throw new g(parama);
  }

  private boolean a(long paramLong, boolean paramBoolean)
  {
    if ((this.K) || (this.G == 2))
      return false;
    if (this.B < 0)
    {
      this.B = this.o.dequeueInputBuffer(0L);
      if (this.B < 0)
        return false;
      this.g.b = this.y[this.B];
      this.g.d();
    }
    if (this.G == 1)
    {
      if (this.t);
      while (true)
      {
        this.G = 2;
        return false;
        this.I = true;
        this.o.queueInputBuffer(this.B, 0, 0, 0L, 4);
        this.B = -1;
      }
    }
    if (this.w)
    {
      this.w = false;
      this.g.b.put(c);
      this.o.queueInputBuffer(this.B, 0, c.length, 0L, 0);
      this.B = -1;
      this.H = true;
      return true;
    }
    int i1;
    if (this.M)
      i1 = -3;
    int i2;
    while (i1 == -2)
    {
      return false;
      if (this.F == 1)
      {
        i1 = 0;
        while (i1 < this.m.f.size())
        {
          byte[] arrayOfByte = (byte[])this.m.f.get(i1);
          this.g.b.put(arrayOfByte);
          i1 += 1;
        }
        this.F = 2;
      }
      i2 = a(paramLong, this.h, this.g);
      i1 = i2;
      if (!paramBoolean)
        continue;
      i1 = i2;
      if (this.J != 1)
        continue;
      i1 = i2;
      if (i2 != -2)
        continue;
      this.J = 2;
      i1 = i2;
    }
    if (i1 == -4)
    {
      if (this.F == 2)
      {
        this.g.d();
        this.F = 1;
      }
      a(this.h);
      return true;
    }
    if (i1 == -1)
    {
      if (this.F == 2)
      {
        this.g.d();
        this.F = 1;
      }
      this.K = true;
      if (!this.H)
      {
        A();
        return false;
      }
      try
      {
        if (this.t)
          break label748;
        this.I = true;
        this.o.queueInputBuffer(this.B, 0, 0, 0L, 4);
        this.B = -1;
      }
      catch (MediaCodec.CryptoException localCryptoException1)
      {
        a(localCryptoException1);
        throw new g(localCryptoException1);
      }
    }
    else
    {
      if (this.N)
      {
        if (!this.g.c())
        {
          this.g.d();
          if (this.F == 2)
            this.F = 1;
          return true;
        }
        this.N = false;
      }
      paramBoolean = this.g.a();
      this.M = a(paramBoolean);
      if (this.M)
        return false;
      if ((this.q) && (!paramBoolean))
      {
        k.a(this.g.b);
        if (this.g.b.position() == 0)
          return true;
        this.q = false;
      }
      try
      {
        i1 = this.g.b.position();
        i2 = this.g.c;
        paramLong = this.g.e;
        if (this.g.b())
          this.i.add(Long.valueOf(paramLong));
        a(paramLong, this.g.b, i1, paramBoolean);
        Object localObject;
        if (paramBoolean)
        {
          localObject = a(this.g, i1 - i2);
          this.o.queueSecureInputBuffer(this.B, 0, (MediaCodec.CryptoInfo)localObject, paramLong, 0);
        }
        while (true)
        {
          this.B = -1;
          this.H = true;
          this.F = 0;
          localObject = this.a;
          ((c)localObject).c += 1;
          return true;
          this.o.queueInputBuffer(this.B, 0, i1, paramLong, 0);
        }
      }
      catch (MediaCodec.CryptoException localCryptoException2)
      {
        a(localCryptoException2);
        throw new g(localCryptoException2);
      }
    }
    label748: return false;
  }

  private static boolean a(String paramString)
  {
    return (r.a < 18) || ((r.a == 18) && (("OMX.SEC.avc.dec".equals(paramString)) || ("OMX.SEC.avc.dec.secure".equals(paramString)))) || ((r.a == 19) && (r.d.startsWith("SM-G800")) && (("OMX.Exynos.avc.dec".equals(paramString)) || ("OMX.Exynos.avc.dec.secure".equals(paramString))));
  }

  private static boolean a(String paramString, MediaFormat paramMediaFormat)
  {
    return (r.a < 21) && (paramMediaFormat.f.isEmpty()) && ("OMX.MTK.VIDEO.DECODER.AVC".equals(paramString));
  }

  private boolean a(boolean paramBoolean)
  {
    if (!this.D);
    int i1;
    do
    {
      return false;
      i1 = this.e.b();
      if (i1 != 0)
        continue;
      throw new g(this.e.d());
    }
    while ((i1 == 4) || ((!paramBoolean) && (this.f)));
    return true;
  }

  private android.media.MediaFormat b(MediaFormat paramMediaFormat)
  {
    paramMediaFormat = paramMediaFormat.b();
    if (this.l)
      paramMediaFormat.setInteger("auto-frc", 0);
    return paramMediaFormat;
  }

  private void b(a parama)
  {
    if ((this.b != null) && (this.k != null))
      this.b.post(new Runnable(parama)
      {
        public void run()
        {
          n.a(n.this).a(this.a);
        }
      });
  }

  private boolean b(long paramLong1, long paramLong2)
  {
    if (this.L)
      return false;
    if (this.C < 0)
      this.C = this.o.dequeueOutputBuffer(this.j, s());
    if (this.C == -2)
    {
      z();
      return true;
    }
    if (this.C == -3)
    {
      this.z = this.o.getOutputBuffers();
      localObject = this.a;
      ((c)localObject).e += 1;
      return true;
    }
    if (this.C < 0)
    {
      if ((this.t) && ((this.K) || (this.G == 2)))
      {
        A();
        return true;
      }
      return false;
    }
    if (this.x)
    {
      this.x = false;
      this.o.releaseOutputBuffer(this.C, false);
      this.C = -1;
      return true;
    }
    if ((this.j.flags & 0x4) != 0)
    {
      A();
      return false;
    }
    int i1 = h(this.j.presentationTimeUs);
    Object localObject = this.o;
    ByteBuffer localByteBuffer = this.z[this.C];
    MediaCodec.BufferInfo localBufferInfo = this.j;
    int i2 = this.C;
    if (i1 != -1);
    for (boolean bool = true; a(paramLong1, paramLong2, (MediaCodec)localObject, localByteBuffer, localBufferInfo, i2, bool); bool = false)
    {
      d(this.j.presentationTimeUs);
      if (i1 != -1)
        this.i.remove(i1);
      this.C = -1;
      return true;
    }
    return false;
  }

  private static boolean b(String paramString)
  {
    return (r.a < 24) && (("OMX.Nvidia.h264.decode".equals(paramString)) || ("OMX.Nvidia.h264.decode.secure".equals(paramString))) && ((r.b.equals("flounder")) || (r.b.equals("flounder_lte")) || (r.b.equals("grouper")) || (r.b.equals("tilapia")));
  }

  private static boolean b(String paramString, MediaFormat paramMediaFormat)
  {
    return (r.a <= 18) && (paramMediaFormat.n == 1) && ("OMX.MTK.AUDIO.DECODER.MP3".equals(paramString));
  }

  private static boolean c(String paramString)
  {
    return (r.a <= 17) && (("OMX.rk.video_decoder.avc".equals(paramString)) || ("OMX.allwinner.video.decoder.avc".equals(paramString)));
  }

  private static boolean d(String paramString)
  {
    return (r.a <= 23) && ("OMX.google.vorbis.decoder".equals(paramString));
  }

  private void g(long paramLong)
  {
    if (a(paramLong, this.h, null) == -4)
      a(this.h);
  }

  private int h(long paramLong)
  {
    int i2 = this.i.size();
    int i1 = 0;
    while (i1 < i2)
    {
      if (((Long)this.i.get(i1)).longValue() == paramLong)
        return i1;
      i1 += 1;
    }
    return -1;
  }

  private boolean l()
  {
    return SystemClock.elapsedRealtime() < this.A + 1000L;
  }

  private void z()
  {
    Object localObject = this.o.getOutputFormat();
    if ((this.s) && (((android.media.MediaFormat)localObject).getInteger("width") == 32) && (((android.media.MediaFormat)localObject).getInteger("height") == 32))
    {
      this.x = true;
      return;
    }
    if (this.v)
      ((android.media.MediaFormat)localObject).setInteger("channel-count", 1);
    a(this.o, (android.media.MediaFormat)localObject);
    localObject = this.a;
    ((c)localObject).d += 1;
  }

  protected e a(m paramm, String paramString, boolean paramBoolean)
  {
    return paramm.a(paramString, paramBoolean);
  }

  protected void a(long paramLong1, long paramLong2, boolean paramBoolean)
  {
    int i1;
    if (paramBoolean)
      if (this.J == 0)
        i1 = 1;
    while (true)
    {
      this.J = i1;
      if (this.m == null)
        g(paramLong1);
      m();
      if (this.o != null)
      {
        org.vidogram.messenger.exoplayer.f.q.a("drainAndFeed");
        while (b(paramLong1, paramLong2));
        while ((a(paramLong1, true)) && (a(paramLong1, false)));
        org.vidogram.messenger.exoplayer.f.q.a();
      }
      this.a.a();
      return;
      i1 = this.J;
      continue;
      i1 = 0;
    }
  }

  protected void a(long paramLong, ByteBuffer paramByteBuffer, int paramInt, boolean paramBoolean)
  {
  }

  protected void a(MediaCodec paramMediaCodec, android.media.MediaFormat paramMediaFormat)
  {
  }

  protected abstract void a(MediaCodec paramMediaCodec, boolean paramBoolean, android.media.MediaFormat paramMediaFormat, MediaCrypto paramMediaCrypto);

  protected void a(q paramq)
  {
    boolean bool = true;
    MediaFormat localMediaFormat = this.m;
    this.m = paramq.a;
    this.n = paramq.b;
    if ((this.o != null) && (a(this.o, this.p, localMediaFormat, this.m)))
    {
      this.E = true;
      this.F = 1;
      if ((this.s) && (this.m.h == localMediaFormat.h) && (this.m.i == localMediaFormat.i));
      while (true)
      {
        this.w = bool;
        return;
        bool = false;
      }
    }
    if (this.H)
    {
      this.G = 1;
      return;
    }
    p();
    m();
  }

  protected abstract boolean a(long paramLong1, long paramLong2, MediaCodec paramMediaCodec, ByteBuffer paramByteBuffer, MediaCodec.BufferInfo paramBufferInfo, int paramInt, boolean paramBoolean);

  protected boolean a(MediaCodec paramMediaCodec, boolean paramBoolean, MediaFormat paramMediaFormat1, MediaFormat paramMediaFormat2)
  {
    return false;
  }

  protected final boolean a(MediaFormat paramMediaFormat)
  {
    return a(this.d, paramMediaFormat);
  }

  protected abstract boolean a(m paramm, MediaFormat paramMediaFormat);

  protected boolean b()
  {
    return this.L;
  }

  protected void c(long paramLong)
  {
    this.J = 0;
    this.K = false;
    this.L = false;
    if (this.o != null)
      q();
  }

  protected boolean c()
  {
    return (this.m != null) && (!this.M) && ((this.J != 0) || (this.C >= 0) || (l()));
  }

  protected void d(long paramLong)
  {
  }

  protected void h()
  {
  }

  protected void i()
  {
  }

  protected void j()
  {
    this.m = null;
    this.n = null;
    try
    {
      p();
      try
      {
        if (this.D)
        {
          this.e.a();
          this.D = false;
        }
        return;
      }
      finally
      {
        super.j();
      }
    }
    finally
    {
    }
    throw localObject3;
  }

  protected void k()
  {
  }

  protected final void m()
  {
    if (!n());
    Object localObject3;
    Object localObject1;
    boolean bool;
    while (true)
    {
      return;
      localObject3 = this.m.b;
      if (this.n == null)
        break;
      if (this.e == null)
        throw new g("Media requires a DrmSessionManager");
      if (!this.D)
      {
        this.e.a(this.n);
        this.D = true;
      }
      int i1 = this.e.b();
      if (i1 == 0)
        throw new g(this.e.d());
      if ((i1 != 3) && (i1 != 4))
        continue;
      localObject1 = ((org.vidogram.messenger.exoplayer.b.d)this.e.c()).a();
      bool = this.e.a((String)localObject3);
    }
    while (true)
    {
      try
      {
        localObject3 = a(this.d, (String)localObject3, bool);
        if (localObject3 != null)
          continue;
        a(new a(this.m, null, bool, -49999));
        str = ((e)localObject3).a;
        this.p = ((e)localObject3).c;
        this.q = a(str, this.m);
        this.r = a(str);
        this.s = b(str);
        this.t = c(str);
        this.u = d(str);
        this.v = b(str, this.m);
      }
      catch (o.b localObject4)
      {
        try
        {
          l1 = SystemClock.elapsedRealtime();
          org.vidogram.messenger.exoplayer.f.q.a("createByCodecName(" + str + ")");
          this.o = MediaCodec.createByCodecName(str);
          org.vidogram.messenger.exoplayer.f.q.a();
          org.vidogram.messenger.exoplayer.f.q.a("configureCodec");
          a(this.o, ((e)localObject3).c, b(this.m), (MediaCrypto)localObject1);
          org.vidogram.messenger.exoplayer.f.q.a();
          org.vidogram.messenger.exoplayer.f.q.a("codec.start()");
          this.o.start();
          org.vidogram.messenger.exoplayer.f.q.a();
          long l2 = SystemClock.elapsedRealtime();
          a(str, l2, l2 - l1);
          this.y = this.o.getInputBuffers();
          this.z = this.o.getOutputBuffers();
          if (u() != 3)
            continue;
          l1 = SystemClock.elapsedRealtime();
          this.A = l1;
          this.B = -1;
          this.C = -1;
          this.N = true;
          localObject1 = this.a;
          ((c)localObject1).a += 1;
          return;
          localb = localb;
          a(new a(this.m, localb, bool, -49998));
          Object localObject4 = null;
        }
        catch (Exception localException)
        {
          String str;
          a(new a(this.m, localException, bool, str));
          continue;
          long l1 = -1L;
          continue;
        }
      }
      bool = false;
      Object localObject2 = null;
    }
  }

  protected boolean n()
  {
    return (this.o == null) && (this.m != null);
  }

  protected final boolean o()
  {
    return this.o != null;
  }

  protected void p()
  {
    if (this.o != null)
    {
      this.A = -1L;
      this.B = -1;
      this.C = -1;
      this.M = false;
      this.i.clear();
      this.y = null;
      this.z = null;
      this.E = false;
      this.H = false;
      this.p = false;
      this.q = false;
      this.r = false;
      this.s = false;
      this.t = false;
      this.u = false;
      this.v = false;
      this.w = false;
      this.x = false;
      this.I = false;
      this.F = 0;
      this.G = 0;
      c localc = this.a;
      localc.b += 1;
    }
    try
    {
      this.o.stop();
      try
      {
        this.o.release();
        return;
      }
      finally
      {
        this.o = null;
      }
    }
    finally
    {
    }
    throw localObject3;
  }

  protected void q()
  {
    this.A = -1L;
    this.B = -1;
    this.C = -1;
    this.N = true;
    this.M = false;
    this.i.clear();
    this.w = false;
    this.x = false;
    if ((this.r) || ((this.u) && (this.I)))
    {
      p();
      m();
    }
    while (true)
    {
      if ((this.E) && (this.m != null))
        this.F = 1;
      return;
      if (this.G != 0)
      {
        p();
        m();
        continue;
      }
      this.o.flush();
      this.H = false;
    }
  }

  protected final int r()
  {
    return this.J;
  }

  protected long s()
  {
    return 0L;
  }

  public static class a extends Exception
  {
    public final String a;
    public final boolean b;
    public final String c;
    public final String d;

    public a(MediaFormat paramMediaFormat, Throwable paramThrowable, boolean paramBoolean, int paramInt)
    {
      super(paramThrowable);
      this.a = paramMediaFormat.b;
      this.b = paramBoolean;
      this.c = null;
      this.d = a(paramInt);
    }

    public a(MediaFormat paramMediaFormat, Throwable paramThrowable, boolean paramBoolean, String paramString)
    {
      super(paramThrowable);
      this.a = paramMediaFormat.b;
      this.b = paramBoolean;
      this.c = paramString;
      if (r.a >= 21);
      for (paramMediaFormat = a(paramThrowable); ; paramMediaFormat = null)
      {
        this.d = paramMediaFormat;
        return;
      }
    }

    private static String a(int paramInt)
    {
      if (paramInt < 0);
      for (String str = "neg_"; ; str = "")
        return "org.vidogram.messenger.exoplayer.MediaCodecTrackRenderer_" + str + Math.abs(paramInt);
    }

    @TargetApi(21)
    private static String a(Throwable paramThrowable)
    {
      if ((paramThrowable instanceof MediaCodec.CodecException))
        return ((MediaCodec.CodecException)paramThrowable).getDiagnosticInfo();
      return null;
    }
  }

  public static abstract interface b
  {
    public abstract void a(MediaCodec.CryptoException paramCryptoException);

    public abstract void a(String paramString, long paramLong1, long paramLong2);

    public abstract void a(n.a parama);
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.exoplayer.n
 * JD-Core Version:    0.6.0
 */