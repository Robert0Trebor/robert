package org.vidogram.messenger.exoplayer.a;

import android.annotation.TargetApi;
import android.media.AudioTimestamp;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.ConditionVariable;
import android.os.SystemClock;
import android.util.Log;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import org.vidogram.messenger.exoplayer.f.d;
import org.vidogram.messenger.exoplayer.f.r;

public final class b
{
  public static boolean a = false;
  public static boolean b = false;
  private int A;
  private int B;
  private long C;
  private long D;
  private long E;
  private float F;
  private byte[] G;
  private int H;
  private int I;
  private ByteBuffer J;
  private boolean K;
  private final a c;
  private final int d;
  private final ConditionVariable e;
  private final long[] f;
  private final a g;
  private AudioTrack h;
  private AudioTrack i;
  private int j;
  private int k;
  private int l;
  private int m;
  private boolean n;
  private int o;
  private int p;
  private long q;
  private int r;
  private int s;
  private long t;
  private long u;
  private boolean v;
  private long w;
  private Method x;
  private long y;
  private long z;

  public b()
  {
    this(null, 3);
  }

  public b(a parama, int paramInt)
  {
    this.c = parama;
    this.d = paramInt;
    this.e = new ConditionVariable(true);
    if (r.a >= 18);
    try
    {
      this.x = AudioTrack.class.getMethod("getLatency", (Class[])null);
      label49: if (r.a >= 23)
        this.g = new c();
      while (true)
      {
        this.f = new long[10];
        this.F = 1.0F;
        this.B = 0;
        return;
        if (r.a >= 19)
        {
          this.g = new b();
          continue;
        }
        this.g = new a(null);
      }
    }
    catch (java.lang.NoSuchMethodException parama)
    {
      break label49;
    }
  }

  private static int a(int paramInt, ByteBuffer paramByteBuffer)
  {
    if ((paramInt == 7) || (paramInt == 8))
      return d.a(paramByteBuffer);
    if (paramInt == 5)
      return org.vidogram.messenger.exoplayer.f.a.a();
    if (paramInt == 6)
      return org.vidogram.messenger.exoplayer.f.a.a(paramByteBuffer);
    throw new IllegalStateException("Unexpected audio encoding: " + paramInt);
  }

  @TargetApi(21)
  private static int a(AudioTrack paramAudioTrack, ByteBuffer paramByteBuffer, int paramInt)
  {
    return paramAudioTrack.write(paramByteBuffer, paramInt, 1);
  }

  private long a(long paramLong)
  {
    return paramLong / this.o;
  }

  private static ByteBuffer a(ByteBuffer paramByteBuffer1, int paramInt1, int paramInt2, int paramInt3, ByteBuffer paramByteBuffer2)
  {
    int i1;
    switch (paramInt3)
    {
    default:
      throw new IllegalStateException();
    case 3:
      i1 = paramInt2 * 2;
    case -2147483648:
    case 1073741824:
    }
    ByteBuffer localByteBuffer;
    int i2;
    while (true)
    {
      if (paramByteBuffer2 != null)
      {
        localByteBuffer = paramByteBuffer2;
        if (paramByteBuffer2.capacity() >= i1);
      }
      else
      {
        localByteBuffer = ByteBuffer.allocateDirect(i1);
      }
      localByteBuffer.position(0);
      localByteBuffer.limit(i1);
      i2 = paramInt1 + paramInt2;
      paramInt2 = paramInt1;
      i1 = paramInt1;
      switch (paramInt3)
      {
      default:
        throw new IllegalStateException();
        i1 = paramInt2 / 3 * 2;
        continue;
        i1 = paramInt2 / 2;
      case 3:
      case -2147483648:
      case 1073741824:
      }
    }
    while (paramInt2 < i2)
    {
      localByteBuffer.put(0);
      localByteBuffer.put((byte)((paramByteBuffer1.get(paramInt2) & 0xFF) - 128));
      paramInt2 += 1;
      continue;
      while (i1 < i2)
      {
        localByteBuffer.put(paramByteBuffer1.get(i1 + 1));
        localByteBuffer.put(paramByteBuffer1.get(i1 + 2));
        i1 += 3;
        continue;
        while (paramInt1 < i2)
        {
          localByteBuffer.put(paramByteBuffer1.get(paramInt1 + 2));
          localByteBuffer.put(paramByteBuffer1.get(paramInt1 + 3));
          paramInt1 += 4;
        }
      }
    }
    localByteBuffer.position(0);
    return localByteBuffer;
  }

  @TargetApi(21)
  private static void a(AudioTrack paramAudioTrack, float paramFloat)
  {
    paramAudioTrack.setVolume(paramFloat);
  }

  private static int b(String paramString)
  {
    int i1 = -1;
    switch (paramString.hashCode())
    {
    default:
    case 187078296:
    case 1504578661:
    case -1095064472:
    case 1505942594:
    }
    while (true)
      switch (i1)
      {
      default:
        return 0;
        if (!paramString.equals("audio/ac3"))
          continue;
        i1 = 0;
        continue;
        if (!paramString.equals("audio/eac3"))
          continue;
        i1 = 1;
        continue;
        if (!paramString.equals("audio/vnd.dts"))
          continue;
        i1 = 2;
        continue;
        if (!paramString.equals("audio/vnd.dts.hd"))
          continue;
        i1 = 3;
      case 0:
      case 1:
      case 2:
      case 3:
      }
    return 5;
    return 6;
    return 7;
    return 8;
  }

  private long b(long paramLong)
  {
    return 1000000L * paramLong / this.j;
  }

  private static void b(AudioTrack paramAudioTrack, float paramFloat)
  {
    paramAudioTrack.setStereoVolume(paramFloat, paramFloat);
  }

  private long c(long paramLong)
  {
    return this.j * paramLong / 1000000L;
  }

  private void l()
  {
    if (!a())
      return;
    if (r.a >= 21)
    {
      a(this.i, this.F);
      return;
    }
    b(this.i, this.F);
  }

  private void m()
  {
    if (this.h == null)
      return;
    AudioTrack localAudioTrack = this.h;
    this.h = null;
    new Thread(localAudioTrack)
    {
      public void run()
      {
        this.a.release();
      }
    }
    .start();
  }

  private boolean n()
  {
    return (a()) && (this.B != 0);
  }

  private void o()
  {
    long l1 = this.g.c();
    if (l1 == 0L);
    long l2;
    do
    {
      return;
      l2 = System.nanoTime() / 1000L;
      if (l2 - this.u < 30000L)
        continue;
      this.f[this.r] = (l1 - l2);
      this.r = ((this.r + 1) % 10);
      if (this.s < 10)
        this.s += 1;
      this.u = l2;
      this.t = 0L;
      int i1 = 0;
      while (i1 < this.s)
      {
        this.t += this.f[i1] / this.s;
        i1 += 1;
      }
    }
    while ((s()) || (l2 - this.w < 500000L));
    this.v = this.g.d();
    long l3;
    long l4;
    if (this.v)
    {
      l3 = this.g.e() / 1000L;
      l4 = this.g.f();
      if (l3 >= this.D)
        break label322;
      this.v = false;
    }
    while (true)
    {
      if ((this.x != null) && (!this.n));
      try
      {
        this.E = (((Integer)this.x.invoke(this.i, (Object[])null)).intValue() * 1000L - this.q);
        this.E = Math.max(this.E, 0L);
        if (this.E > 5000000L)
        {
          Log.w("AudioTrack", "Ignoring impossibly large audio latency: " + this.E);
          this.E = 0L;
        }
        this.w = l2;
        return;
        label322: if (Math.abs(l3 - l2) > 5000000L)
        {
          str = "Spurious audio timestamp (system clock mismatch): " + l4 + ", " + l3 + ", " + l2 + ", " + l1;
          if (b)
            throw new e(str);
          Log.w("AudioTrack", str);
          this.v = false;
          continue;
        }
        if (Math.abs(b(l4) - l1) <= 5000000L)
          continue;
        String str = "Spurious audio timestamp (frame position mismatch): " + l4 + ", " + l3 + ", " + l2 + ", " + l1;
        if (b)
          throw new e(str);
        Log.w("AudioTrack", str);
        this.v = false;
      }
      catch (Exception localException)
      {
        while (true)
          this.x = null;
      }
    }
  }

  // ERROR //
  private void p()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 231	org/vidogram/messenger/exoplayer/a/b:i	Landroid/media/AudioTrack;
    //   4: invokevirtual 335	android/media/AudioTrack:getState	()I
    //   7: istore_1
    //   8: iload_1
    //   9: iconst_1
    //   10: if_icmpne +4 -> 14
    //   13: return
    //   14: aload_0
    //   15: getfield 231	org/vidogram/messenger/exoplayer/a/b:i	Landroid/media/AudioTrack;
    //   18: invokevirtual 338	android/media/AudioTrack:release	()V
    //   21: aload_0
    //   22: aconst_null
    //   23: putfield 231	org/vidogram/messenger/exoplayer/a/b:i	Landroid/media/AudioTrack;
    //   26: new 19	org/vidogram/messenger/exoplayer/a/b$d
    //   29: dup
    //   30: iload_1
    //   31: aload_0
    //   32: getfield 222	org/vidogram/messenger/exoplayer/a/b:j	I
    //   35: aload_0
    //   36: getfield 340	org/vidogram/messenger/exoplayer/a/b:k	I
    //   39: aload_0
    //   40: getfield 342	org/vidogram/messenger/exoplayer/a/b:p	I
    //   43: invokespecial 345	org/vidogram/messenger/exoplayer/a/b$d:<init>	(IIII)V
    //   46: athrow
    //   47: astore_2
    //   48: aload_0
    //   49: aconst_null
    //   50: putfield 231	org/vidogram/messenger/exoplayer/a/b:i	Landroid/media/AudioTrack;
    //   53: goto -27 -> 26
    //   56: astore_2
    //   57: aload_0
    //   58: aconst_null
    //   59: putfield 231	org/vidogram/messenger/exoplayer/a/b:i	Landroid/media/AudioTrack;
    //   62: aload_2
    //   63: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   14	21	47	java/lang/Exception
    //   14	21	56	finally
  }

  private long q()
  {
    if (this.n)
      return this.z;
    return a(this.y);
  }

  private void r()
  {
    this.t = 0L;
    this.s = 0;
    this.r = 0;
    this.u = 0L;
    this.v = false;
    this.w = 0L;
  }

  private boolean s()
  {
    return (r.a < 23) && ((this.m == 5) || (this.m == 6));
  }

  private boolean t()
  {
    return (s()) && (this.i.getPlayState() == 2) && (this.i.getPlaybackHeadPosition() == 0);
  }

  public int a(int paramInt)
  {
    this.e.block();
    if (paramInt == 0);
    for (this.i = new AudioTrack(this.d, this.j, this.k, this.m, this.p, 1); ; this.i = new AudioTrack(this.d, this.j, this.k, this.m, this.p, 1, paramInt))
    {
      p();
      paramInt = this.i.getAudioSessionId();
      if ((a) && (r.a < 21))
      {
        if ((this.h != null) && (paramInt != this.h.getAudioSessionId()))
          m();
        if (this.h == null)
          this.h = new AudioTrack(this.d, 4000, 4, 2, 2, 0, paramInt);
      }
      this.g.a(this.i, s());
      l();
      return paramInt;
    }
  }

  public int a(ByteBuffer paramByteBuffer, int paramInt1, int paramInt2, long paramLong)
  {
    if (s())
    {
      if (this.i.getPlayState() == 2)
      {
        paramInt1 = 0;
        return paramInt1;
      }
      if ((this.i.getPlayState() == 1) && (this.g.b() != 0L))
        return 0;
    }
    boolean bool;
    int i1;
    if (this.I == 0)
    {
      if (paramInt2 == 0)
        return 2;
      if (this.m != this.l)
      {
        bool = true;
        this.K = bool;
        ByteBuffer localByteBuffer = paramByteBuffer;
        int i2 = paramInt1;
        i1 = paramInt2;
        if (this.K)
        {
          if (this.m != 2)
            break label394;
          bool = true;
          label107: org.vidogram.messenger.exoplayer.f.b.b(bool);
          this.J = a(paramByteBuffer, paramInt1, paramInt2, this.l, this.J);
          localByteBuffer = this.J;
          i2 = this.J.position();
          i1 = this.J.limit();
        }
        this.I = i1;
        localByteBuffer.position(i2);
        if ((this.n) && (this.A == 0))
          this.A = a(this.m, localByteBuffer);
        if (this.B != 0)
          break label400;
        this.C = Math.max(0L, paramLong);
        this.B = 1;
        paramInt1 = 0;
        label219: paramInt2 = paramInt1;
        paramByteBuffer = localByteBuffer;
        if (r.a < 21)
        {
          if ((this.G == null) || (this.G.length < i1))
            this.G = new byte[i1];
          localByteBuffer.get(this.G, 0, i1);
          this.H = 0;
          paramByteBuffer = localByteBuffer;
        }
      }
    }
    for (paramInt2 = paramInt1; ; paramInt2 = 0)
    {
      paramInt1 = 0;
      if (r.a < 21)
      {
        i1 = (int)(this.y - this.g.b() * this.o);
        i1 = this.p - i1;
        if (i1 > 0)
        {
          paramInt1 = Math.min(this.I, i1);
          i1 = this.i.write(this.G, this.H, paramInt1);
          paramInt1 = i1;
          if (i1 >= 0)
            this.H += i1;
        }
      }
      for (paramInt1 = i1; ; paramInt1 = a(this.i, paramByteBuffer, this.I))
      {
        if (paramInt1 >= 0)
          break label548;
        throw new f(paramInt1);
        bool = false;
        break;
        label394: bool = false;
        break label107;
        label400: long l1 = this.C + b(q());
        if ((this.B == 1) && (Math.abs(l1 - paramLong) > 200000L))
        {
          Log.e("AudioTrack", "Discontinuity detected [expected " + l1 + ", got " + paramLong + "]");
          this.B = 2;
        }
        if (this.B != 2)
          break label610;
        this.C += paramLong - l1;
        this.B = 1;
        paramInt1 = 1;
        break label219;
        if (!this.K)
          continue;
        paramByteBuffer = this.J;
      }
      label548: this.I -= paramInt1;
      if (!this.n)
        this.y += paramInt1;
      paramInt1 = paramInt2;
      if (this.I != 0)
        break;
      if (this.n)
        this.z += this.A;
      return paramInt2 | 0x2;
      label610: paramInt1 = 0;
      break label219;
    }
  }

  public long a(boolean paramBoolean)
  {
    long l2;
    if (!n())
    {
      l2 = -9223372036854775808L;
      return l2;
    }
    if (this.i.getPlayState() == 3)
      o();
    long l1 = System.nanoTime() / 1000L;
    if (this.v)
      return b(c(()((float)(l1 - this.g.e() / 1000L) * this.g.g())) + this.g.f()) + this.C;
    if (this.s == 0)
      l1 = this.g.c() + this.C;
    while (true)
    {
      l2 = l1;
      if (paramBoolean)
        break;
      return l1 - this.E;
      l1 = l1 + this.t + this.C;
    }
  }

  public void a(float paramFloat)
  {
    if (this.F != paramFloat)
    {
      this.F = paramFloat;
      l();
    }
  }

  public void a(PlaybackParams paramPlaybackParams)
  {
    this.g.a(paramPlaybackParams);
  }

  public void a(String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    a(paramString, paramInt1, paramInt2, paramInt3, 0);
  }

  public void a(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i1;
    boolean bool1;
    label92: int i2;
    switch (paramInt1)
    {
    default:
      throw new IllegalArgumentException("Unsupported channel count: " + paramInt1);
    case 1:
      i1 = 4;
      if ("audio/raw".equals(paramString))
        break;
      bool1 = true;
      if (bool1)
        i2 = b(paramString);
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
    case 7:
    case 8:
    }
    do
    {
      do
      {
        do
        {
          do
          {
            if ((!a()) || (this.l != i2) || (this.j != paramInt2) || (this.k != i1))
              break label270;
            return;
            i1 = 12;
            break;
            i1 = 28;
            break;
            i1 = 204;
            break;
            i1 = 220;
            break;
            i1 = 252;
            break;
            i1 = 1276;
            break;
            i1 = org.vidogram.messenger.exoplayer.b.a;
            break;
            bool1 = false;
            break label92;
            i2 = paramInt3;
          }
          while (paramInt3 == 3);
          i2 = paramInt3;
        }
        while (paramInt3 == 2);
        i2 = paramInt3;
      }
      while (paramInt3 == -2147483648);
      i2 = paramInt3;
    }
    while (paramInt3 == 1073741824);
    throw new IllegalArgumentException("Unsupported PCM encoding: " + paramInt3);
    label270: j();
    this.l = i2;
    this.n = bool1;
    this.j = paramInt2;
    this.k = i1;
    label326: long l1;
    if (bool1)
    {
      this.m = i2;
      this.o = (paramInt1 * 2);
      if (paramInt4 == 0)
        break label349;
      this.p = paramInt4;
      if (!bool1)
        break label495;
      l1 = -1L;
    }
    while (true)
    {
      this.q = l1;
      return;
      i2 = 2;
      break;
      label349: if (bool1)
      {
        if ((this.m == 5) || (this.m == 6))
        {
          this.p = 20480;
          break label326;
        }
        this.p = 49152;
        break label326;
      }
      paramInt3 = AudioTrack.getMinBufferSize(paramInt2, i1, this.m);
      boolean bool2;
      if (paramInt3 != -2)
      {
        bool2 = true;
        label413: org.vidogram.messenger.exoplayer.f.b.b(bool2);
        paramInt1 = paramInt3 * 4;
        paramInt2 = (int)c(250000L) * this.o;
        paramInt3 = (int)Math.max(paramInt3, c(750000L) * this.o);
        if (paramInt1 >= paramInt2)
          break label480;
        paramInt1 = paramInt2;
      }
      while (true)
      {
        this.p = paramInt1;
        break;
        bool2 = false;
        break label413;
        label480: if (paramInt1 > paramInt3)
        {
          paramInt1 = paramInt3;
          continue;
        }
      }
      label495: l1 = b(a(this.p));
    }
  }

  public boolean a()
  {
    return this.i != null;
  }

  public boolean a(String paramString)
  {
    return (this.c != null) && (this.c.a(b(paramString)));
  }

  public int b()
  {
    return a(0);
  }

  public int c()
  {
    return this.p;
  }

  public long d()
  {
    return this.q;
  }

  public void e()
  {
    if (a())
    {
      this.D = (System.nanoTime() / 1000L);
      this.i.play();
    }
  }

  public void f()
  {
    if (this.B == 1)
      this.B = 2;
  }

  public void g()
  {
    if (a())
      this.g.a(q());
  }

  public boolean h()
  {
    return (a()) && ((q() > this.g.b()) || (t()));
  }

  public void i()
  {
    if (a())
    {
      r();
      this.g.a();
    }
  }

  public void j()
  {
    if (a())
    {
      this.y = 0L;
      this.z = 0L;
      this.A = 0;
      this.I = 0;
      this.B = 0;
      this.E = 0L;
      r();
      if (this.i.getPlayState() == 3)
        this.i.pause();
      AudioTrack localAudioTrack = this.i;
      this.i = null;
      this.g.a(null, false);
      this.e.close();
      new Thread(localAudioTrack)
      {
        public void run()
        {
          try
          {
            this.a.flush();
            this.a.release();
            return;
          }
          finally
          {
            b.a(b.this).open();
          }
          throw localObject;
        }
      }
      .start();
    }
  }

  public void k()
  {
    j();
    m();
  }

  private static class a
  {
    protected AudioTrack a;
    private boolean b;
    private int c;
    private long d;
    private long e;
    private long f;
    private long g;
    private long h;
    private long i;

    public void a()
    {
      if (this.g != -1L)
        return;
      this.a.pause();
    }

    public void a(long paramLong)
    {
      this.h = b();
      this.g = (SystemClock.elapsedRealtime() * 1000L);
      this.i = paramLong;
      this.a.stop();
    }

    public void a(AudioTrack paramAudioTrack, boolean paramBoolean)
    {
      this.a = paramAudioTrack;
      this.b = paramBoolean;
      this.g = -1L;
      this.d = 0L;
      this.e = 0L;
      this.f = 0L;
      if (paramAudioTrack != null)
        this.c = paramAudioTrack.getSampleRate();
    }

    public void a(PlaybackParams paramPlaybackParams)
    {
      throw new UnsupportedOperationException();
    }

    public long b()
    {
      if (this.g != -1L)
      {
        l1 = (SystemClock.elapsedRealtime() * 1000L - this.g) * this.c / 1000000L;
        return Math.min(this.i, l1 + this.h);
      }
      int j = this.a.getPlayState();
      if (j == 1)
        return 0L;
      long l2 = 0xFFFFFFFF & this.a.getPlaybackHeadPosition();
      long l1 = l2;
      if (this.b)
      {
        if ((j == 2) && (l2 == 0L))
          this.f = this.d;
        l1 = l2 + this.f;
      }
      if (this.d > l1)
        this.e += 1L;
      this.d = l1;
      return l1 + (this.e << 32);
    }

    public long c()
    {
      return b() * 1000000L / this.c;
    }

    public boolean d()
    {
      return false;
    }

    public long e()
    {
      throw new UnsupportedOperationException();
    }

    public long f()
    {
      throw new UnsupportedOperationException();
    }

    public float g()
    {
      return 1.0F;
    }
  }

  @TargetApi(19)
  private static class b extends b.a
  {
    private final AudioTimestamp b = new AudioTimestamp();
    private long c;
    private long d;
    private long e;

    public b()
    {
      super();
    }

    public void a(AudioTrack paramAudioTrack, boolean paramBoolean)
    {
      super.a(paramAudioTrack, paramBoolean);
      this.c = 0L;
      this.d = 0L;
      this.e = 0L;
    }

    public boolean d()
    {
      boolean bool = this.a.getTimestamp(this.b);
      if (bool)
      {
        long l = this.b.framePosition;
        if (this.d > l)
          this.c += 1L;
        this.d = l;
        this.e = (l + (this.c << 32));
      }
      return bool;
    }

    public long e()
    {
      return this.b.nanoTime;
    }

    public long f()
    {
      return this.e;
    }
  }

  @TargetApi(23)
  private static class c extends b.b
  {
    private PlaybackParams b;
    private float c = 1.0F;

    private void h()
    {
      if ((this.a != null) && (this.b != null))
        this.a.setPlaybackParams(this.b);
    }

    public void a(AudioTrack paramAudioTrack, boolean paramBoolean)
    {
      super.a(paramAudioTrack, paramBoolean);
      h();
    }

    public void a(PlaybackParams paramPlaybackParams)
    {
      if (paramPlaybackParams != null);
      while (true)
      {
        paramPlaybackParams = paramPlaybackParams.allowDefaults();
        this.b = paramPlaybackParams;
        this.c = paramPlaybackParams.getSpeed();
        h();
        return;
        paramPlaybackParams = new PlaybackParams();
      }
    }

    public float g()
    {
      return this.c;
    }
  }

  public static final class d extends Exception
  {
    public final int a;

    public d(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      super();
      this.a = paramInt1;
    }
  }

  public static final class e extends RuntimeException
  {
    public e(String paramString)
    {
      super();
    }
  }

  public static final class f extends Exception
  {
    public final int a;

    public f(int paramInt)
    {
      super();
      this.a = paramInt;
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.exoplayer.a.b
 * JD-Core Version:    0.6.0
 */