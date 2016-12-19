package org.vidogram.messenger.exoplayer.c;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import android.util.SparseArray;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.vidogram.messenger.exoplayer.MediaFormat;
import org.vidogram.messenger.exoplayer.b.a;
import org.vidogram.messenger.exoplayer.e.l.a;
import org.vidogram.messenger.exoplayer.e.l.c;
import org.vidogram.messenger.exoplayer.q;
import org.vidogram.messenger.exoplayer.s;
import org.vidogram.messenger.exoplayer.t;
import org.vidogram.messenger.exoplayer.t.a;

public final class h
  implements g, l.a, t, t.a
{
  private static final List<Class<? extends e>> a = new ArrayList();
  private long A;
  private long B;
  private org.vidogram.messenger.exoplayer.e.l C;
  private b D;
  private IOException E;
  private int F;
  private long G;
  private boolean H;
  private int I;
  private int J;
  private final c b;
  private final org.vidogram.messenger.exoplayer.e.b c;
  private final int d;
  private final SparseArray<d> e;
  private final int f;
  private final Uri g;
  private final org.vidogram.messenger.exoplayer.e.e h;
  private final Handler i;
  private final a j;
  private final int k;
  private volatile boolean l;
  private volatile l m;
  private volatile a n;
  private boolean o;
  private int p;
  private MediaFormat[] q;
  private long r;
  private boolean[] s;
  private boolean[] t;
  private boolean[] u;
  private int v;
  private long w;
  private long x;
  private long y;
  private boolean z;

  static
  {
    try
    {
      a.add(Class.forName("org.vidogram.messenger.exoplayer.c.g.f").asSubclass(e.class));
      try
      {
        label29: a.add(Class.forName("org.vidogram.messenger.exoplayer.c.c.e").asSubclass(e.class));
        try
        {
          label48: a.add(Class.forName("org.vidogram.messenger.exoplayer.c.c.f").asSubclass(e.class));
          try
          {
            label67: a.add(Class.forName("org.vidogram.messenger.exoplayer.c.b.c").asSubclass(e.class));
            try
            {
              label86: a.add(Class.forName("org.vidogram.messenger.exoplayer.c.e.b").asSubclass(e.class));
              try
              {
                label105: a.add(Class.forName("org.vidogram.messenger.exoplayer.c.e.o").asSubclass(e.class));
                try
                {
                  label124: a.add(Class.forName("org.vidogram.messenger.exoplayer.c.a.b").asSubclass(e.class));
                  try
                  {
                    label143: a.add(Class.forName("org.vidogram.messenger.exoplayer.c.d.b").asSubclass(e.class));
                    try
                    {
                      label162: a.add(Class.forName("org.vidogram.messenger.exoplayer.c.e.l").asSubclass(e.class));
                      try
                      {
                        label181: a.add(Class.forName("org.vidogram.messenger.exoplayer.c.f.a").asSubclass(e.class));
                        try
                        {
                          label200: a.add(Class.forName("org.vidogram.messenger.exoplayer.ext.flac.FlacExtractor").asSubclass(e.class));
                          return;
                        }
                        catch (ClassNotFoundException localClassNotFoundException1)
                        {
                          return;
                        }
                      }
                      catch (ClassNotFoundException localClassNotFoundException2)
                      {
                        break label200;
                      }
                    }
                    catch (ClassNotFoundException localClassNotFoundException3)
                    {
                      break label181;
                    }
                  }
                  catch (ClassNotFoundException localClassNotFoundException4)
                  {
                    break label162;
                  }
                }
                catch (ClassNotFoundException localClassNotFoundException5)
                {
                  break label143;
                }
              }
              catch (ClassNotFoundException localClassNotFoundException6)
              {
                break label124;
              }
            }
            catch (ClassNotFoundException localClassNotFoundException7)
            {
              break label105;
            }
          }
          catch (ClassNotFoundException localClassNotFoundException8)
          {
            break label86;
          }
        }
        catch (ClassNotFoundException localClassNotFoundException9)
        {
          break label67;
        }
      }
      catch (ClassNotFoundException localClassNotFoundException10)
      {
        break label48;
      }
    }
    catch (ClassNotFoundException localClassNotFoundException11)
    {
      break label29;
    }
  }

  public h(Uri paramUri, org.vidogram.messenger.exoplayer.e.e parame, org.vidogram.messenger.exoplayer.e.b paramb, int paramInt1, int paramInt2, Handler paramHandler, a parama, int paramInt3, e[] paramArrayOfe)
  {
    this.g = paramUri;
    this.h = parame;
    this.j = parama;
    this.i = paramHandler;
    this.k = paramInt3;
    this.c = paramb;
    this.d = paramInt1;
    this.f = paramInt2;
    if (paramArrayOfe != null)
    {
      paramUri = paramArrayOfe;
      if (paramArrayOfe.length != 0);
    }
    else
    {
      parame = new e[a.size()];
      paramInt1 = 0;
      while (true)
      {
        paramUri = parame;
        if (paramInt1 >= parame.length)
          break;
        try
        {
          parame[paramInt1] = ((e)((Class)a.get(paramInt1)).newInstance());
          paramInt1 += 1;
        }
        catch (java.lang.InstantiationException paramUri)
        {
          throw new IllegalStateException("Unexpected error creating default extractor", paramUri);
        }
        catch (java.lang.IllegalAccessException paramUri)
        {
          throw new IllegalStateException("Unexpected error creating default extractor", paramUri);
        }
      }
    }
    this.b = new c(paramUri, this);
    this.e = new SparseArray();
    this.y = -9223372036854775808L;
  }

  public h(Uri paramUri, org.vidogram.messenger.exoplayer.e.e parame, org.vidogram.messenger.exoplayer.e.b paramb, int paramInt1, Handler paramHandler, a parama, int paramInt2, e[] paramArrayOfe)
  {
    this(paramUri, parame, paramb, paramInt1, -1, paramHandler, parama, paramInt2, paramArrayOfe);
  }

  private void a(IOException paramIOException)
  {
    if ((this.i != null) && (this.j != null))
      this.i.post(new Runnable(paramIOException)
      {
        public void run()
        {
          h.c(h.this).a(h.b(h.this), this.a);
        }
      });
  }

  private void c(long paramLong)
  {
    this.y = paramLong;
    this.H = false;
    if (this.C.a())
    {
      this.C.b();
      return;
    }
    j();
    g();
  }

  private b d(long paramLong)
  {
    return new b(this.g, this.h, this.b, this.c, this.d, this.m.b(paramLong));
  }

  private void e(long paramLong)
  {
    int i1 = 0;
    while (i1 < this.u.length)
    {
      if (this.u[i1] == 0)
        ((d)this.e.valueAt(i1)).a(paramLong);
      i1 += 1;
    }
  }

  private long f(long paramLong)
  {
    return Math.min((paramLong - 1L) * 1000L, 5000L);
  }

  private void g()
  {
    int i2 = 0;
    int i1 = 0;
    if ((this.H) || (this.C.a()));
    while (true)
    {
      return;
      if (this.E == null)
        break;
      if (l())
        continue;
      if (this.D != null);
      for (boolean bool = true; ; bool = false)
      {
        org.vidogram.messenger.exoplayer.f.b.b(bool);
        if (SystemClock.elapsedRealtime() - this.G < f(this.F))
          break;
        this.E = null;
        if (this.o)
          break label148;
        while (i1 < this.e.size())
        {
          ((d)this.e.valueAt(i1)).a();
          i1 += 1;
        }
      }
      this.D = h();
      while (true)
      {
        this.J = this.I;
        this.C.a(this.D, this);
        return;
        label148: if ((this.m.a()) || (this.r != -1L))
          continue;
        i1 = i2;
        while (i1 < this.e.size())
        {
          ((d)this.e.valueAt(i1)).a();
          i1 += 1;
        }
        this.D = h();
        this.A = this.w;
        this.z = true;
      }
    }
    this.B = 0L;
    this.z = false;
    if (!this.o)
      this.D = h();
    while (true)
    {
      this.J = this.I;
      this.C.a(this.D, this);
      return;
      org.vidogram.messenger.exoplayer.f.b.b(k());
      if ((this.r != -1L) && (this.y >= this.r))
      {
        this.H = true;
        this.y = -9223372036854775808L;
        return;
      }
      this.D = d(this.y);
      this.y = -9223372036854775808L;
    }
  }

  private b h()
  {
    return new b(this.g, this.h, this.b, this.c, this.d, 0L);
  }

  private boolean i()
  {
    int i1 = 0;
    while (i1 < this.e.size())
    {
      if (!((d)this.e.valueAt(i1)).b())
        return false;
      i1 += 1;
    }
    return true;
  }

  private void j()
  {
    int i1 = 0;
    while (i1 < this.e.size())
    {
      ((d)this.e.valueAt(i1)).a();
      i1 += 1;
    }
    this.D = null;
    this.E = null;
    this.F = 0;
  }

  private boolean k()
  {
    return this.y != -9223372036854775808L;
  }

  private boolean l()
  {
    return this.E instanceof e;
  }

  public int a(int paramInt, long paramLong, q paramq, s params)
  {
    this.w = paramLong;
    if ((this.t[paramInt] != 0) || (k()))
      return -2;
    d locald = (d)this.e.valueAt(paramInt);
    if (this.s[paramInt] != 0)
    {
      paramq.a = locald.c();
      paramq.b = this.n;
      this.s[paramInt] = false;
      return -4;
    }
    if (locald.a(params))
    {
      int i1;
      if (params.e < this.x)
      {
        paramInt = 1;
        i1 = params.d;
        if (paramInt == 0)
          break label173;
      }
      label173: for (paramInt = 134217728; ; paramInt = 0)
      {
        params.d = (paramInt | i1);
        if (this.z)
        {
          this.B = (this.A - params.e);
          this.z = false;
        }
        params.e += this.B;
        return -3;
        paramInt = 0;
        break;
      }
    }
    if (this.H)
      return -1;
    return -2;
  }

  public MediaFormat a(int paramInt)
  {
    org.vidogram.messenger.exoplayer.f.b.b(this.o);
    return this.q[paramInt];
  }

  public t.a a()
  {
    this.v += 1;
    return this;
  }

  public void a(int paramInt, long paramLong)
  {
    org.vidogram.messenger.exoplayer.f.b.b(this.o);
    if (this.u[paramInt] == 0);
    for (boolean bool = true; ; bool = false)
    {
      org.vidogram.messenger.exoplayer.f.b.b(bool);
      this.p += 1;
      this.u[paramInt] = true;
      this.s[paramInt] = true;
      this.t[paramInt] = false;
      if (this.p == 1)
      {
        if (!this.m.a())
          paramLong = 0L;
        this.w = paramLong;
        this.x = paramLong;
        c(paramLong);
      }
      return;
    }
  }

  public void a(a parama)
  {
    this.n = parama;
  }

  public void a(l paraml)
  {
    this.m = paraml;
  }

  public void a(l.c paramc)
  {
    this.H = true;
  }

  public void a(l.c paramc, IOException paramIOException)
  {
    this.E = paramIOException;
    if (this.I > this.J);
    for (int i1 = 1; ; i1 = this.F + 1)
    {
      this.F = i1;
      this.G = SystemClock.elapsedRealtime();
      a(paramIOException);
      g();
      return;
    }
  }

  public boolean a(long paramLong)
  {
    int i4 = 0;
    int i3;
    if (this.o)
      i3 = 1;
    do
    {
      do
      {
        do
        {
          return i3;
          if (this.C == null)
            this.C = new org.vidogram.messenger.exoplayer.e.l("Loader:ExtractorSampleSource");
          g();
          i3 = i4;
        }
        while (this.m == null);
        i3 = i4;
      }
      while (!this.l);
      i3 = i4;
    }
    while (!i());
    int i2 = this.e.size();
    this.u = new boolean[i2];
    this.t = new boolean[i2];
    this.s = new boolean[i2];
    this.q = new MediaFormat[i2];
    this.r = -1L;
    int i1 = 0;
    while (i1 < i2)
    {
      MediaFormat localMediaFormat = ((d)this.e.valueAt(i1)).c();
      this.q[i1] = localMediaFormat;
      if ((localMediaFormat.e != -1L) && (localMediaFormat.e > this.r))
        this.r = localMediaFormat.e;
      i1 += 1;
    }
    this.o = true;
    return true;
  }

  public long b(int paramInt)
  {
    if (this.t[paramInt] != 0)
    {
      this.t[paramInt] = false;
      return this.x;
    }
    return -9223372036854775808L;
  }

  public void b()
  {
    if (this.E == null);
    while (true)
    {
      return;
      if (l())
        throw this.E;
      int i1;
      if (this.f != -1)
        i1 = this.f;
      while (this.F > i1)
      {
        throw this.E;
        if ((this.m != null) && (!this.m.a()))
        {
          i1 = 6;
          continue;
        }
        i1 = 3;
      }
    }
  }

  public void b(long paramLong)
  {
    int i2 = 0;
    org.vidogram.messenger.exoplayer.f.b.b(this.o);
    boolean bool2;
    long l1;
    if (this.p > 0)
    {
      bool2 = true;
      org.vidogram.messenger.exoplayer.f.b.b(bool2);
      if (!this.m.a())
        paramLong = 0L;
      if (!k())
        break label76;
      l1 = this.y;
      label52: this.w = paramLong;
      this.x = paramLong;
      if (l1 != paramLong)
        break label85;
    }
    while (true)
    {
      return;
      bool2 = false;
      break;
      label76: l1 = this.w;
      break label52;
      label85: if (!k());
      for (boolean bool1 = true; ; bool1 = false)
      {
        i1 = 0;
        while ((bool1) && (i1 < this.e.size()))
        {
          bool1 &= ((d)this.e.valueAt(i1)).b(paramLong);
          i1 += 1;
        }
      }
      int i1 = i2;
      if (!bool1)
      {
        c(paramLong);
        i1 = i2;
      }
      while (i1 < this.t.length)
      {
        this.t[i1] = true;
        i1 += 1;
      }
    }
  }

  public void b(l.c paramc)
  {
    if (this.p > 0)
    {
      c(this.y);
      return;
    }
    j();
    this.c.a(0);
  }

  public boolean b(int paramInt, long paramLong)
  {
    org.vidogram.messenger.exoplayer.f.b.b(this.o);
    org.vidogram.messenger.exoplayer.f.b.b(this.u[paramInt]);
    this.w = paramLong;
    e(this.w);
    if (this.H)
      return true;
    g();
    if (k())
      return false;
    if (!((d)this.e.valueAt(paramInt)).e());
    for (int i1 = 1; ; i1 = 0)
      return i1;
  }

  public int c()
  {
    return this.e.size();
  }

  public void c(int paramInt)
  {
    org.vidogram.messenger.exoplayer.f.b.b(this.o);
    org.vidogram.messenger.exoplayer.f.b.b(this.u[paramInt]);
    this.p -= 1;
    this.u[paramInt] = false;
    if (this.p == 0)
    {
      this.w = -9223372036854775808L;
      if (this.C.a())
        this.C.b();
    }
    else
    {
      return;
    }
    j();
    this.c.a(0);
  }

  public long d()
  {
    long l2;
    if (this.H)
      l2 = -3L;
    long l1;
    do
    {
      return l2;
      if (k())
        return this.y;
      int i1 = 0;
      l1 = -9223372036854775808L;
      while (i1 < this.e.size())
      {
        l1 = Math.max(l1, ((d)this.e.valueAt(i1)).d());
        i1 += 1;
      }
      l2 = l1;
    }
    while (l1 != -9223372036854775808L);
    return this.w;
  }

  public m d(int paramInt)
  {
    d locald2 = (d)this.e.get(paramInt);
    d locald1 = locald2;
    if (locald2 == null)
    {
      locald1 = new d(this.c);
      this.e.put(paramInt, locald1);
    }
    return locald1;
  }

  public void e()
  {
    if (this.v > 0);
    for (boolean bool = true; ; bool = false)
    {
      org.vidogram.messenger.exoplayer.f.b.b(bool);
      int i1 = this.v - 1;
      this.v = i1;
      if ((i1 == 0) && (this.C != null))
      {
        this.C.a(new Runnable()
        {
          public void run()
          {
            h.a(h.this).a();
          }
        });
        this.C = null;
      }
      return;
    }
  }

  public void f()
  {
    this.l = true;
  }

  public static abstract interface a
  {
    public abstract void a(int paramInt, IOException paramIOException);
  }

  private static class b
    implements l.c
  {
    private final Uri a;
    private final org.vidogram.messenger.exoplayer.e.e b;
    private final h.c c;
    private final org.vidogram.messenger.exoplayer.e.b d;
    private final int e;
    private final j f;
    private volatile boolean g;
    private boolean h;

    public b(Uri paramUri, org.vidogram.messenger.exoplayer.e.e parame, h.c paramc, org.vidogram.messenger.exoplayer.e.b paramb, int paramInt, long paramLong)
    {
      this.a = ((Uri)org.vidogram.messenger.exoplayer.f.b.a(paramUri));
      this.b = ((org.vidogram.messenger.exoplayer.e.e)org.vidogram.messenger.exoplayer.f.b.a(parame));
      this.c = ((h.c)org.vidogram.messenger.exoplayer.f.b.a(paramc));
      this.d = ((org.vidogram.messenger.exoplayer.e.b)org.vidogram.messenger.exoplayer.f.b.a(paramb));
      this.e = paramInt;
      this.f = new j();
      this.f.a = paramLong;
      this.h = true;
    }

    public void a()
    {
      this.g = true;
    }

    public boolean b()
    {
      return this.g;
    }

    // ERROR //
    public void c()
    {
      // Byte code:
      //   0: iconst_0
      //   1: istore_1
      //   2: iload_1
      //   3: ifne +239 -> 242
      //   6: aload_0
      //   7: getfield 64	org/vidogram/messenger/exoplayer/c/h$b:g	Z
      //   10: ifne +232 -> 242
      //   13: aload_0
      //   14: getfield 56	org/vidogram/messenger/exoplayer/c/h$b:f	Lorg/vidogram/messenger/exoplayer/c/j;
      //   17: getfield 59	org/vidogram/messenger/exoplayer/c/j:a	J
      //   20: lstore 7
      //   22: aload_0
      //   23: getfield 41	org/vidogram/messenger/exoplayer/c/h$b:b	Lorg/vidogram/messenger/exoplayer/e/e;
      //   26: new 67	org/vidogram/messenger/exoplayer/e/f
      //   29: dup
      //   30: aload_0
      //   31: getfield 37	org/vidogram/messenger/exoplayer/c/h$b:a	Landroid/net/Uri;
      //   34: lload 7
      //   36: ldc2_w 68
      //   39: aconst_null
      //   40: invokespecial 72	org/vidogram/messenger/exoplayer/e/f:<init>	(Landroid/net/Uri;JJLjava/lang/String;)V
      //   43: invokeinterface 75 2 0
      //   48: lstore 5
      //   50: lload 5
      //   52: lstore_3
      //   53: lload 5
      //   55: ldc2_w 68
      //   58: lcmp
      //   59: ifeq +9 -> 68
      //   62: lload 5
      //   64: lload 7
      //   66: ladd
      //   67: lstore_3
      //   68: new 77	org/vidogram/messenger/exoplayer/c/b
      //   71: dup
      //   72: aload_0
      //   73: getfield 41	org/vidogram/messenger/exoplayer/c/h$b:b	Lorg/vidogram/messenger/exoplayer/e/e;
      //   76: lload 7
      //   78: lload_3
      //   79: invokespecial 80	org/vidogram/messenger/exoplayer/c/b:<init>	(Lorg/vidogram/messenger/exoplayer/e/e;JJ)V
      //   82: astore 9
      //   84: aload_0
      //   85: getfield 45	org/vidogram/messenger/exoplayer/c/h$b:c	Lorg/vidogram/messenger/exoplayer/c/h$c;
      //   88: aload 9
      //   90: invokevirtual 83	org/vidogram/messenger/exoplayer/c/h$c:a	(Lorg/vidogram/messenger/exoplayer/c/f;)Lorg/vidogram/messenger/exoplayer/c/e;
      //   93: astore 10
      //   95: aload_0
      //   96: getfield 61	org/vidogram/messenger/exoplayer/c/h$b:h	Z
      //   99: ifeq +15 -> 114
      //   102: aload 10
      //   104: invokeinterface 87 1 0
      //   109: aload_0
      //   110: iconst_0
      //   111: putfield 61	org/vidogram/messenger/exoplayer/c/h$b:h	Z
      //   114: iload_1
      //   115: ifne +42 -> 157
      //   118: aload_0
      //   119: getfield 64	org/vidogram/messenger/exoplayer/c/h$b:g	Z
      //   122: ifne +35 -> 157
      //   125: aload_0
      //   126: getfield 49	org/vidogram/messenger/exoplayer/c/h$b:d	Lorg/vidogram/messenger/exoplayer/e/b;
      //   129: aload_0
      //   130: getfield 51	org/vidogram/messenger/exoplayer/c/h$b:e	I
      //   133: invokeinterface 90 2 0
      //   138: aload 10
      //   140: aload 9
      //   142: aload_0
      //   143: getfield 56	org/vidogram/messenger/exoplayer/c/h$b:f	Lorg/vidogram/messenger/exoplayer/c/j;
      //   146: invokeinterface 93 3 0
      //   151: istore_2
      //   152: iload_2
      //   153: istore_1
      //   154: goto -40 -> 114
      //   157: iload_1
      //   158: iconst_1
      //   159: if_icmpne +17 -> 176
      //   162: iconst_0
      //   163: istore_1
      //   164: aload_0
      //   165: getfield 41	org/vidogram/messenger/exoplayer/c/h$b:b	Lorg/vidogram/messenger/exoplayer/e/e;
      //   168: invokeinterface 95 1 0
      //   173: goto -171 -> 2
      //   176: aload 9
      //   178: ifnull +17 -> 195
      //   181: aload_0
      //   182: getfield 56	org/vidogram/messenger/exoplayer/c/h$b:f	Lorg/vidogram/messenger/exoplayer/c/j;
      //   185: aload 9
      //   187: invokeinterface 100 1 0
      //   192: putfield 59	org/vidogram/messenger/exoplayer/c/j:a	J
      //   195: goto -31 -> 164
      //   198: astore 9
      //   200: aconst_null
      //   201: astore 10
      //   203: iload_1
      //   204: iconst_1
      //   205: if_icmpne +15 -> 220
      //   208: aload_0
      //   209: getfield 41	org/vidogram/messenger/exoplayer/c/h$b:b	Lorg/vidogram/messenger/exoplayer/e/e;
      //   212: invokeinterface 95 1 0
      //   217: aload 9
      //   219: athrow
      //   220: aload 10
      //   222: ifnull -14 -> 208
      //   225: aload_0
      //   226: getfield 56	org/vidogram/messenger/exoplayer/c/h$b:f	Lorg/vidogram/messenger/exoplayer/c/j;
      //   229: aload 10
      //   231: invokeinterface 100 1 0
      //   236: putfield 59	org/vidogram/messenger/exoplayer/c/j:a	J
      //   239: goto -31 -> 208
      //   242: return
      //   243: astore 10
      //   245: aload 9
      //   247: astore 11
      //   249: aload 10
      //   251: astore 9
      //   253: aload 11
      //   255: astore 10
      //   257: goto -54 -> 203
      //   260: astore 11
      //   262: aload 9
      //   264: astore 10
      //   266: aload 11
      //   268: astore 9
      //   270: goto -67 -> 203
      //
      // Exception table:
      //   from	to	target	type
      //   13	50	198	finally
      //   68	84	198	finally
      //   84	114	243	finally
      //   118	152	260	finally
    }
  }

  private static final class c
  {
    private final e[] a;
    private final g b;
    private e c;

    public c(e[] paramArrayOfe, g paramg)
    {
      this.a = paramArrayOfe;
      this.b = paramg;
    }

    // ERROR //
    public e a(f paramf)
    {
      // Byte code:
      //   0: aload_0
      //   1: getfield 27	org/vidogram/messenger/exoplayer/c/h$c:c	Lorg/vidogram/messenger/exoplayer/c/e;
      //   4: ifnull +8 -> 12
      //   7: aload_0
      //   8: getfield 27	org/vidogram/messenger/exoplayer/c/h$c:c	Lorg/vidogram/messenger/exoplayer/c/e;
      //   11: areturn
      //   12: aload_0
      //   13: getfield 19	org/vidogram/messenger/exoplayer/c/h$c:a	[Lorg/vidogram/messenger/exoplayer/c/e;
      //   16: astore 4
      //   18: aload 4
      //   20: arraylength
      //   21: istore_3
      //   22: iconst_0
      //   23: istore_2
      //   24: iload_2
      //   25: iload_3
      //   26: if_icmpge +32 -> 58
      //   29: aload 4
      //   31: iload_2
      //   32: aaload
      //   33: astore 5
      //   35: aload 5
      //   37: aload_1
      //   38: invokeinterface 32 2 0
      //   43: ifeq +34 -> 77
      //   46: aload_0
      //   47: aload 5
      //   49: putfield 27	org/vidogram/messenger/exoplayer/c/h$c:c	Lorg/vidogram/messenger/exoplayer/c/e;
      //   52: aload_1
      //   53: invokeinterface 36 1 0
      //   58: aload_0
      //   59: getfield 27	org/vidogram/messenger/exoplayer/c/h$c:c	Lorg/vidogram/messenger/exoplayer/c/e;
      //   62: ifnonnull +50 -> 112
      //   65: new 38	org/vidogram/messenger/exoplayer/c/h$e
      //   68: dup
      //   69: aload_0
      //   70: getfield 19	org/vidogram/messenger/exoplayer/c/h$c:a	[Lorg/vidogram/messenger/exoplayer/c/e;
      //   73: invokespecial 41	org/vidogram/messenger/exoplayer/c/h$e:<init>	([Lorg/vidogram/messenger/exoplayer/c/e;)V
      //   76: athrow
      //   77: aload_1
      //   78: invokeinterface 36 1 0
      //   83: iload_2
      //   84: iconst_1
      //   85: iadd
      //   86: istore_2
      //   87: goto -63 -> 24
      //   90: astore 5
      //   92: aload_1
      //   93: invokeinterface 36 1 0
      //   98: goto -15 -> 83
      //   101: astore 4
      //   103: aload_1
      //   104: invokeinterface 36 1 0
      //   109: aload 4
      //   111: athrow
      //   112: aload_0
      //   113: getfield 27	org/vidogram/messenger/exoplayer/c/h$c:c	Lorg/vidogram/messenger/exoplayer/c/e;
      //   116: aload_0
      //   117: getfield 21	org/vidogram/messenger/exoplayer/c/h$c:b	Lorg/vidogram/messenger/exoplayer/c/g;
      //   120: invokeinterface 44 2 0
      //   125: aload_0
      //   126: getfield 27	org/vidogram/messenger/exoplayer/c/h$c:c	Lorg/vidogram/messenger/exoplayer/c/e;
      //   129: areturn
      //
      // Exception table:
      //   from	to	target	type
      //   35	52	90	java/io/EOFException
      //   35	52	101	finally
    }

    public void a()
    {
      if (this.c != null)
      {
        this.c.c();
        this.c = null;
      }
    }
  }

  private class d extends c
  {
    public d(org.vidogram.messenger.exoplayer.e.b arg2)
    {
      super();
    }

    public void a(long paramLong, int paramInt1, int paramInt2, int paramInt3, byte[] paramArrayOfByte)
    {
      super.a(paramLong, paramInt1, paramInt2, paramInt3, paramArrayOfByte);
      h.d(h.this);
    }
  }

  public static final class e extends org.vidogram.messenger.exoplayer.r
  {
    public e(e[] paramArrayOfe)
    {
      super();
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.exoplayer.c.h
 * JD-Core Version:    0.6.0
 */