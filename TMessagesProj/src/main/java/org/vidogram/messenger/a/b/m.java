package org.vidogram.messenger.a.b;

import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.vidogram.messenger.a.a;

public class m extends a
{
  static final Logger v = Logger.getLogger(m.class.getName());

  public m(InputStream paramInputStream, long paramLong)
  {
    this(paramInputStream, paramLong, Level.FINEST);
  }

  public m(InputStream paramInputStream, long paramLong, Level paramLevel)
  {
    this.a = "MP3";
    this.b = "0";
    n localn = new n(paramInputStream);
    if (h.a(localn))
    {
      h localh = new h(localn, paramLevel);
      this.g = localh.e();
      this.f = localh.d();
      this.e = localh.c();
      this.j = localh.h();
      this.t = localh.r();
      this.u = localh.s();
      this.r = localh.p();
      this.p = localh.n();
      this.o = localh.m();
      this.m = localh.k();
      this.n = localh.l();
      this.c = localh.a();
      this.i = localh.g();
      this.q = localh.o();
      this.s = localh.q();
      this.d = localh.b();
      this.k = localh.i();
      this.l = localh.j();
      this.h = localh.f();
    }
    if ((this.c <= 0L) || (this.c >= 3600000L));
    try
    {
      this.c = a(localn, paramLong, new a(paramLong)
      {
        final long a = this.b - 128L;

        public boolean a(n paramn)
        {
          return (paramn.a() == this.a) && (b.a(paramn));
        }
      });
      if (((this.d == null) || (this.g == null) || (this.e == null)) && (localn.a() <= paramLong - 128L))
      {
        localn.a(paramLong - 128L - localn.a());
        if (b.a(paramInputStream))
        {
          paramInputStream = new b(paramInputStream);
          if (this.g == null)
            this.g = paramInputStream.e();
          if (this.e == null)
            this.e = paramInputStream.c();
          if (this.j == null)
            this.j = paramInputStream.h();
          if (this.i == null)
            this.i = paramInputStream.g();
          if (this.d == null)
            this.d = paramInputStream.b();
          if (this.k == 0)
            this.k = paramInputStream.i();
          if (this.h == 0)
            this.h = paramInputStream.f();
        }
      }
      return;
    }
    catch (k localk)
    {
      while (true)
      {
        if (!v.isLoggable(paramLevel))
          continue;
        v.log(paramLevel, "Could not determine MP3 duration", localk);
      }
    }
  }

  long a(n paramn, long paramLong, a parama)
  {
    l locall = a(paramn, parama);
    if (locall != null)
    {
      int i = locall.f();
      if (i > 0)
        return locall.c().a(i * locall.b());
      i = 1;
      long l3 = paramn.a();
      long l4 = locall.b();
      long l1 = locall.b();
      int k = locall.c().h();
      long l2 = k;
      int j = 0;
      int m = 10000 / locall.c().i();
      while (true)
      {
        if ((i == m) && (j == 0) && (paramLong > 0L))
          return locall.c().a(paramLong - (l3 - l4));
        locall = a(paramn, parama, locall);
        if (locall == null)
          return i * (l1 * 1000L) * 8L / l2;
        int n = locall.c().h();
        if (n != k)
          j = 1;
        l2 += n;
        l1 += locall.b();
        i += 1;
      }
    }
    throw new k("No audio frame");
  }

  // ERROR //
  l a(n paramn, a parama)
  {
    // Byte code:
    //   0: aload_2
    //   1: aload_1
    //   2: invokeinterface 243 2 0
    //   7: ifeq +58 -> 65
    //   10: iconst_m1
    //   11: istore_3
    //   12: iconst_0
    //   13: istore 4
    //   15: iload_3
    //   16: iconst_m1
    //   17: if_icmpeq +46 -> 63
    //   20: iload 4
    //   22: sipush 255
    //   25: if_icmpne +364 -> 389
    //   28: iload_3
    //   29: sipush 224
    //   32: iand
    //   33: sipush 224
    //   36: if_icmpne +353 -> 389
    //   39: aload_1
    //   40: iconst_2
    //   41: invokevirtual 247	org/vidogram/messenger/a/b/n:mark	(I)V
    //   44: aload_2
    //   45: aload_1
    //   46: invokeinterface 243 2 0
    //   51: ifeq +22 -> 73
    //   54: iconst_m1
    //   55: istore 4
    //   57: iload 4
    //   59: iconst_m1
    //   60: if_icmpne +22 -> 82
    //   63: aconst_null
    //   64: areturn
    //   65: aload_1
    //   66: invokevirtual 250	org/vidogram/messenger/a/b/n:read	()I
    //   69: istore_3
    //   70: goto -58 -> 12
    //   73: aload_1
    //   74: invokevirtual 250	org/vidogram/messenger/a/b/n:read	()I
    //   77: istore 4
    //   79: goto -22 -> 57
    //   82: aload_2
    //   83: aload_1
    //   84: invokeinterface 243 2 0
    //   89: ifeq +140 -> 229
    //   92: iconst_m1
    //   93: istore 5
    //   95: iload 5
    //   97: iconst_m1
    //   98: if_icmpeq -35 -> 63
    //   101: new 219	org/vidogram/messenger/a/b/l$b
    //   104: dup
    //   105: iload_3
    //   106: iload 4
    //   108: iload 5
    //   110: invokespecial 253	org/vidogram/messenger/a/b/l$b:<init>	(III)V
    //   113: astore 7
    //   115: aload 7
    //   117: ifnull +268 -> 385
    //   120: aload_1
    //   121: invokevirtual 256	org/vidogram/messenger/a/b/n:reset	()V
    //   124: aload_1
    //   125: aload 7
    //   127: invokevirtual 258	org/vidogram/messenger/a/b/l$b:g	()I
    //   130: iconst_2
    //   131: iadd
    //   132: invokevirtual 247	org/vidogram/messenger/a/b/n:mark	(I)V
    //   135: aload 7
    //   137: invokevirtual 258	org/vidogram/messenger/a/b/l$b:g	()I
    //   140: newarray byte
    //   142: astore 8
    //   144: aload 8
    //   146: iconst_0
    //   147: iconst_m1
    //   148: bastore
    //   149: aload 8
    //   151: iconst_1
    //   152: iload_3
    //   153: i2b
    //   154: bastore
    //   155: aload_1
    //   156: aload 8
    //   158: iconst_2
    //   159: aload 8
    //   161: arraylength
    //   162: iconst_2
    //   163: isub
    //   164: invokevirtual 261	org/vidogram/messenger/a/b/n:a	([BII)V
    //   167: new 209	org/vidogram/messenger/a/b/l
    //   170: dup
    //   171: aload 7
    //   173: aload 8
    //   175: invokespecial 264	org/vidogram/messenger/a/b/l:<init>	(Lorg/vidogram/messenger/a/b/l$b;[B)V
    //   178: astore 9
    //   180: aload 9
    //   182: invokevirtual 266	org/vidogram/messenger/a/b/l:a	()Z
    //   185: ifne +200 -> 385
    //   188: aload_2
    //   189: aload_1
    //   190: invokeinterface 243 2 0
    //   195: ifeq +51 -> 246
    //   198: iconst_m1
    //   199: istore 5
    //   201: aload_2
    //   202: aload_1
    //   203: invokeinterface 243 2 0
    //   208: ifeq +47 -> 255
    //   211: iconst_m1
    //   212: istore 4
    //   214: iload 5
    //   216: iconst_m1
    //   217: if_icmpeq +9 -> 226
    //   220: iload 4
    //   222: iconst_m1
    //   223: if_icmpne +41 -> 264
    //   226: aload 9
    //   228: areturn
    //   229: aload_1
    //   230: invokevirtual 250	org/vidogram/messenger/a/b/n:read	()I
    //   233: istore 5
    //   235: goto -140 -> 95
    //   238: astore 7
    //   240: aconst_null
    //   241: astore 7
    //   243: goto -128 -> 115
    //   246: aload_1
    //   247: invokevirtual 250	org/vidogram/messenger/a/b/n:read	()I
    //   250: istore 5
    //   252: goto -51 -> 201
    //   255: aload_1
    //   256: invokevirtual 250	org/vidogram/messenger/a/b/n:read	()I
    //   259: istore 4
    //   261: goto -47 -> 214
    //   264: iload 5
    //   266: sipush 255
    //   269: if_icmpne +116 -> 385
    //   272: iload 4
    //   274: sipush 254
    //   277: iand
    //   278: iload_3
    //   279: sipush 254
    //   282: iand
    //   283: if_icmpne +102 -> 385
    //   286: aload_2
    //   287: aload_1
    //   288: invokeinterface 243 2 0
    //   293: ifeq +34 -> 327
    //   296: iconst_m1
    //   297: istore 5
    //   299: aload_2
    //   300: aload_1
    //   301: invokeinterface 243 2 0
    //   306: ifeq +30 -> 336
    //   309: iconst_m1
    //   310: istore 6
    //   312: iload 5
    //   314: iconst_m1
    //   315: if_icmpeq +9 -> 324
    //   318: iload 6
    //   320: iconst_m1
    //   321: if_icmpne +24 -> 345
    //   324: aload 9
    //   326: areturn
    //   327: aload_1
    //   328: invokevirtual 250	org/vidogram/messenger/a/b/n:read	()I
    //   331: istore 5
    //   333: goto -34 -> 299
    //   336: aload_1
    //   337: invokevirtual 250	org/vidogram/messenger/a/b/n:read	()I
    //   340: istore 6
    //   342: goto -30 -> 312
    //   345: new 219	org/vidogram/messenger/a/b/l$b
    //   348: dup
    //   349: iload 4
    //   351: iload 5
    //   353: iload 6
    //   355: invokespecial 253	org/vidogram/messenger/a/b/l$b:<init>	(III)V
    //   358: aload 7
    //   360: invokevirtual 269	org/vidogram/messenger/a/b/l$b:a	(Lorg/vidogram/messenger/a/b/l$b;)Z
    //   363: ifeq +22 -> 385
    //   366: aload_1
    //   367: invokevirtual 256	org/vidogram/messenger/a/b/n:reset	()V
    //   370: aload_1
    //   371: aload 8
    //   373: arraylength
    //   374: iconst_2
    //   375: isub
    //   376: i2l
    //   377: invokevirtual 183	org/vidogram/messenger/a/b/n:a	(J)V
    //   380: aload 9
    //   382: areturn
    //   383: astore 7
    //   385: aload_1
    //   386: invokevirtual 256	org/vidogram/messenger/a/b/n:reset	()V
    //   389: aload_2
    //   390: aload_1
    //   391: invokeinterface 243 2 0
    //   396: ifeq +19 -> 415
    //   399: iconst_m1
    //   400: istore 4
    //   402: iload 4
    //   404: istore 5
    //   406: iload_3
    //   407: istore 4
    //   409: iload 5
    //   411: istore_3
    //   412: goto -397 -> 15
    //   415: aload_1
    //   416: invokevirtual 250	org/vidogram/messenger/a/b/n:read	()I
    //   419: istore 4
    //   421: goto -19 -> 402
    //   424: astore_1
    //   425: goto -362 -> 63
    //
    // Exception table:
    //   from	to	target	type
    //   101	115	238	org/vidogram/messenger/a/b/k
    //   345	380	383	org/vidogram/messenger/a/b/k
    //   155	167	424	java/io/EOFException
  }

  l a(n paramn, a parama, l paraml)
  {
    paraml = paraml.c();
    paramn.mark(4);
    int i;
    if (parama.a(paramn))
    {
      i = -1;
      if (!parama.a(paramn))
        break label59;
    }
    label59: for (int j = -1; ; j = paramn.read())
    {
      if ((i != -1) && (j != -1))
        break label68;
      return null;
      i = paramn.read();
      break;
    }
    label68: if ((i == 255) && ((j & 0xE0) == 224))
    {
      int k;
      if (parama.a(paramn))
      {
        k = -1;
        if (!parama.a(paramn))
          break label137;
      }
      for (int m = -1; ; m = paramn.read())
      {
        if ((k != -1) && (m != -1))
          break label146;
        return null;
        k = paramn.read();
        break;
      }
      try
      {
        parama = new l.b(j, k, m);
        if ((parama != null) && (parama.a(paraml)))
        {
          paraml = new byte[parama.g()];
          paraml[0] = (byte)i;
          paraml[1] = (byte)j;
          paraml[2] = (byte)k;
          paraml[3] = (byte)m;
        }
      }
      catch (k parama)
      {
        try
        {
          paramn.a(paraml, 4, paraml.length - 4);
          return new l(parama, paraml);
          parama = parama;
          parama = null;
        }
        catch (java.io.EOFException paramn)
        {
          return null;
        }
      }
    }
    label137: label146: paramn.reset();
    return null;
  }

  static abstract interface a
  {
    public abstract boolean a(n paramn);
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.a.b.m
 * JD-Core Version:    0.6.0
 */