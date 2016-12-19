package org.vidogram.messenger.exoplayer.c.g;

import android.util.Pair;
import android.util.SparseArray;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import org.vidogram.messenger.exoplayer.MediaFormat;
import org.vidogram.messenger.exoplayer.b.a.b;
import org.vidogram.messenger.exoplayer.b.a.c;
import org.vidogram.messenger.exoplayer.c.g;
import org.vidogram.messenger.exoplayer.c.j;
import org.vidogram.messenger.exoplayer.c.l;
import org.vidogram.messenger.exoplayer.f.h;
import org.vidogram.messenger.exoplayer.f.i;
import org.vidogram.messenger.exoplayer.f.k;

public final class f
  implements org.vidogram.messenger.exoplayer.c.e
{
  private static final byte[] a = { 49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10 };
  private static final byte[] b = { 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32 };
  private static final UUID c = new UUID(72057594037932032L, -9223371306706625679L);
  private long A = -1L;
  private h B;
  private h C;
  private boolean D;
  private int E;
  private long F;
  private long G;
  private int H;
  private int I;
  private int[] J;
  private int K;
  private int L;
  private int M;
  private int N;
  private boolean O;
  private int P;
  private int Q;
  private boolean R;
  private boolean S;
  private g T;
  private final b d;
  private final e e;
  private final SparseArray<b> f;
  private final org.vidogram.messenger.exoplayer.f.m g;
  private final org.vidogram.messenger.exoplayer.f.m h;
  private final org.vidogram.messenger.exoplayer.f.m i;
  private final org.vidogram.messenger.exoplayer.f.m j;
  private final org.vidogram.messenger.exoplayer.f.m k;
  private final org.vidogram.messenger.exoplayer.f.m l;
  private final org.vidogram.messenger.exoplayer.f.m m;
  private long n = -1L;
  private long o = -1L;
  private long p = -1L;
  private long q = -1L;
  private long r = -1L;
  private b s;
  private boolean t;
  private boolean u;
  private int v;
  private long w;
  private boolean x;
  private long y = -1L;
  private long z = -1L;

  public f()
  {
    this(new a());
  }

  f(b paramb)
  {
    this.d = paramb;
    this.d.a(new a(null));
    this.e = new e();
    this.f = new SparseArray();
    this.i = new org.vidogram.messenger.exoplayer.f.m(4);
    this.j = new org.vidogram.messenger.exoplayer.f.m(ByteBuffer.allocate(4).putInt(-1).array());
    this.k = new org.vidogram.messenger.exoplayer.f.m(4);
    this.g = new org.vidogram.messenger.exoplayer.f.m(k.a);
    this.h = new org.vidogram.messenger.exoplayer.f.m(4);
    this.l = new org.vidogram.messenger.exoplayer.f.m();
    this.m = new org.vidogram.messenger.exoplayer.f.m();
  }

  private int a(org.vidogram.messenger.exoplayer.c.f paramf, org.vidogram.messenger.exoplayer.c.m paramm, int paramInt)
  {
    int i1 = this.l.b();
    if (i1 > 0)
    {
      paramInt = Math.min(paramInt, i1);
      paramm.a(this.l, paramInt);
    }
    while (true)
    {
      this.N += paramInt;
      this.Q += paramInt;
      return paramInt;
      paramInt = paramm.a(paramf, paramInt, false);
    }
  }

  private long a(long paramLong)
  {
    if (this.p == -1L)
      throw new org.vidogram.messenger.exoplayer.r("Can't scale timecode prior to timecodeScale being set.");
    return org.vidogram.messenger.exoplayer.f.r.a(paramLong, this.p, 1000L);
  }

  private void a(org.vidogram.messenger.exoplayer.c.f paramf, int paramInt)
  {
    if (this.i.c() >= paramInt)
      return;
    if (this.i.e() < paramInt)
      this.i.a(Arrays.copyOf(this.i.a, Math.max(this.i.a.length * 2, paramInt)), this.i.c());
    paramf.b(this.i.a, this.i.c(), paramInt - this.i.c());
    this.i.a(paramInt);
  }

  private void a(org.vidogram.messenger.exoplayer.c.f paramf, b paramb, int paramInt)
  {
    int i1;
    if ("S_TEXT/UTF8".equals(paramb.a))
    {
      i1 = a.length + paramInt;
      if (this.m.e() < i1)
        this.m.a = Arrays.copyOf(a, i1 + paramInt);
      paramf.b(this.m.a, a.length, paramInt);
      this.m.b(0);
      this.m.a(i1);
    }
    org.vidogram.messenger.exoplayer.c.m localm;
    label443: label468: 
    do
    {
      return;
      localm = paramb.s;
      byte[] arrayOfByte;
      int i2;
      if (!this.O)
      {
        if (paramb.e)
        {
          this.M &= -3;
          paramf.b(this.i.a, 0, 1);
          this.N += 1;
          if ((this.i.a[0] & 0x80) == 128)
            throw new org.vidogram.messenger.exoplayer.r("Extension bit is set in signal byte");
          if ((this.i.a[0] & 0x1) == 1)
          {
            this.i.a[0] = 8;
            this.i.b(0);
            localm.a(this.i, 1);
            this.Q += 1;
            this.M |= 2;
          }
          this.O = true;
        }
      }
      else
      {
        paramInt = this.l.c() + paramInt;
        if ((!"V_MPEG4/ISO/AVC".equals(paramb.a)) && (!"V_MPEGH/ISO/HEVC".equals(paramb.a)))
          break label443;
        arrayOfByte = this.h.a;
        arrayOfByte[0] = 0;
        arrayOfByte[1] = 0;
        arrayOfByte[2] = 0;
        i1 = paramb.t;
        i2 = paramb.t;
      }
      while (true)
      {
        if (this.N >= paramInt)
          break label468;
        if (this.P == 0)
        {
          a(paramf, arrayOfByte, 4 - i2, i1);
          this.h.b(0);
          this.P = this.h.s();
          this.g.b(0);
          localm.a(this.g, 4);
          this.Q += 4;
          continue;
          if (paramb.f == null)
            break;
          this.l.a(paramb.f, paramb.f.length);
          break;
        }
        this.P -= a(paramf, localm, this.P);
      }
      while (this.N < paramInt)
        a(paramf, localm, paramInt - this.N);
    }
    while (!"A_VORBIS".equals(paramb.a));
    this.j.b(0);
    localm.a(this.j, 4);
    this.Q += 4;
  }

  private void a(org.vidogram.messenger.exoplayer.c.f paramf, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i1 = Math.min(paramInt2, this.l.b());
    paramf.b(paramArrayOfByte, paramInt1 + i1, paramInt2 - i1);
    if (i1 > 0)
      this.l.a(paramArrayOfByte, paramInt1, i1);
    this.N += paramInt2;
  }

  private void a(b paramb)
  {
    a(this.m.a, this.G);
    paramb.s.a(this.m, this.m.c());
    this.Q += this.m.c();
  }

  private void a(b paramb, long paramLong)
  {
    if ("S_TEXT/UTF8".equals(paramb.a))
      a(paramb);
    paramb.s.a(paramLong, this.M, this.Q, 0, paramb.g);
    this.R = true;
    d();
  }

  private static void a(byte[] paramArrayOfByte, long paramLong)
  {
    if (paramLong == -1L);
    int i1;
    int i2;
    int i3;
    int i4;
    for (byte[] arrayOfByte = b; ; arrayOfByte = String.format(Locale.US, "%02d:%02d:%02d,%03d", new Object[] { Integer.valueOf(i1), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4) }).getBytes())
    {
      System.arraycopy(arrayOfByte, 0, paramArrayOfByte, 19, 12);
      return;
      i1 = (int)(paramLong / 3600000000L);
      paramLong -= i1 * 3600000000L;
      i2 = (int)(paramLong / 60000000L);
      paramLong -= 60000000 * i2;
      i3 = (int)(paramLong / 1000000L);
      i4 = (int)((paramLong - 1000000 * i3) / 1000L);
    }
  }

  private static boolean a(String paramString)
  {
    return ("V_VP8".equals(paramString)) || ("V_VP9".equals(paramString)) || ("V_MPEG2".equals(paramString)) || ("V_MPEG4/ISO/SP".equals(paramString)) || ("V_MPEG4/ISO/ASP".equals(paramString)) || ("V_MPEG4/ISO/AP".equals(paramString)) || ("V_MPEG4/ISO/AVC".equals(paramString)) || ("V_MPEGH/ISO/HEVC".equals(paramString)) || ("V_MS/VFW/FOURCC".equals(paramString)) || ("A_OPUS".equals(paramString)) || ("A_VORBIS".equals(paramString)) || ("A_AAC".equals(paramString)) || ("A_MPEG/L3".equals(paramString)) || ("A_AC3".equals(paramString)) || ("A_EAC3".equals(paramString)) || ("A_TRUEHD".equals(paramString)) || ("A_DTS".equals(paramString)) || ("A_DTS/EXPRESS".equals(paramString)) || ("A_DTS/LOSSLESS".equals(paramString)) || ("A_FLAC".equals(paramString)) || ("A_MS/ACM".equals(paramString)) || ("A_PCM/INT/LIT".equals(paramString)) || ("S_TEXT/UTF8".equals(paramString)) || ("S_VOBSUB".equals(paramString)) || ("S_HDMV/PGS".equals(paramString));
  }

  private boolean a(j paramj, long paramLong)
  {
    if (this.x)
    {
      this.z = paramLong;
      paramj.a = this.y;
      this.x = false;
      return true;
    }
    if ((this.u) && (this.z != -1L))
    {
      paramj.a = this.z;
      this.z = -1L;
      return true;
    }
    return false;
  }

  private static int[] a(int[] paramArrayOfInt, int paramInt)
  {
    int[] arrayOfInt;
    if (paramArrayOfInt == null)
      arrayOfInt = new int[paramInt];
    do
    {
      return arrayOfInt;
      arrayOfInt = paramArrayOfInt;
    }
    while (paramArrayOfInt.length >= paramInt);
    return new int[Math.max(paramArrayOfInt.length * 2, paramInt)];
  }

  private void d()
  {
    this.N = 0;
    this.Q = 0;
    this.P = 0;
    this.O = false;
    this.l.a();
  }

  private l e()
  {
    int i3 = 0;
    if ((this.n == -1L) || (this.r == -1L) || (this.B == null) || (this.B.a() == 0) || (this.C == null) || (this.C.a() != this.B.a()))
    {
      this.B = null;
      this.C = null;
      return l.f;
    }
    int i4 = this.B.a();
    int[] arrayOfInt = new int[i4];
    long[] arrayOfLong1 = new long[i4];
    long[] arrayOfLong2 = new long[i4];
    long[] arrayOfLong3 = new long[i4];
    int i1 = 0;
    int i2;
    while (true)
    {
      i2 = i3;
      if (i1 >= i4)
        break;
      arrayOfLong3[i1] = this.B.a(i1);
      arrayOfLong1[i1] = (this.n + this.C.a(i1));
      i1 += 1;
    }
    while (i2 < i4 - 1)
    {
      arrayOfInt[i2] = (int)(arrayOfLong1[(i2 + 1)] - arrayOfLong1[i2]);
      arrayOfLong2[i2] = (arrayOfLong3[(i2 + 1)] - arrayOfLong3[i2]);
      i2 += 1;
    }
    arrayOfInt[(i4 - 1)] = (int)(this.n + this.o - arrayOfLong1[(i4 - 1)]);
    arrayOfLong2[(i4 - 1)] = (this.r - arrayOfLong3[(i4 - 1)]);
    this.B = null;
    this.C = null;
    return new org.vidogram.messenger.exoplayer.c.a(arrayOfInt, arrayOfLong1, arrayOfLong2, arrayOfLong3);
  }

  int a(int paramInt)
  {
    switch (paramInt)
    {
    default:
      return 0;
    case 160:
    case 174:
    case 183:
    case 187:
    case 224:
    case 225:
    case 18407:
    case 19899:
    case 20532:
    case 20533:
    case 25152:
    case 28032:
    case 290298740:
    case 357149030:
    case 374648427:
    case 408125543:
    case 440786851:
    case 475249515:
    case 524531317:
      return 1;
    case 131:
    case 155:
    case 159:
    case 176:
    case 179:
    case 186:
    case 215:
    case 231:
    case 241:
    case 251:
    case 16980:
    case 17029:
    case 17143:
    case 18401:
    case 18408:
    case 20529:
    case 20530:
    case 21420:
    case 21680:
    case 21682:
    case 21690:
    case 22186:
    case 22203:
    case 25188:
    case 2352003:
    case 2807729:
      return 2;
    case 134:
    case 17026:
    case 2274716:
      return 3;
    case 161:
    case 163:
    case 16981:
    case 18402:
    case 21419:
    case 25506:
      return 4;
    case 181:
    case 17545:
    }
    return 5;
  }

  public int a(org.vidogram.messenger.exoplayer.c.f paramf, j paramj)
  {
    int i1 = 0;
    this.R = false;
    int i2 = 1;
    while ((i2 != 0) && (!this.R))
    {
      boolean bool = this.d.a(paramf);
      i2 = bool;
      if (!bool)
        continue;
      i2 = bool;
      if (!a(paramj, paramf.c()))
        continue;
      i1 = 1;
    }
    do
      return i1;
    while (i2 != 0);
    return -1;
  }

  void a(int paramInt, double paramDouble)
  {
    switch (paramInt)
    {
    default:
      return;
    case 17545:
      this.q = ()paramDouble;
      return;
    case 181:
    }
    this.s.p = (int)paramDouble;
  }

  void a(int paramInt1, int paramInt2, org.vidogram.messenger.exoplayer.c.f paramf)
  {
    switch (paramInt1)
    {
    default:
      throw new org.vidogram.messenger.exoplayer.r("Unexpected id: " + paramInt1);
    case 21419:
      Arrays.fill(this.k.a, 0);
      paramf.b(this.k.a, 4 - paramInt2, paramInt2);
      this.k.b(0);
      this.v = (int)this.k.k();
      return;
    case 25506:
      this.s.h = new byte[paramInt2];
      paramf.b(this.s.h, 0, paramInt2);
      return;
    case 16981:
      this.s.f = new byte[paramInt2];
      paramf.b(this.s.f, 0, paramInt2);
      return;
    case 18402:
      this.s.g = new byte[paramInt2];
      paramf.b(this.s.g, 0, paramInt2);
      return;
    case 161:
    case 163:
    }
    if (this.E == 0)
    {
      this.K = (int)this.e.a(paramf, false, true, 8);
      this.L = this.e.b();
      this.G = -1L;
      this.E = 1;
      this.i.a();
    }
    b localb = (b)this.f.get(this.K);
    if (localb == null)
    {
      paramf.b(paramInt2 - this.L);
      this.E = 0;
      return;
    }
    int i1;
    if (this.E == 1)
    {
      a(paramf, 3);
      i1 = (this.i.a[2] & 0x6) >> 1;
      if (i1 != 0)
        break label584;
      this.I = 1;
      this.J = a(this.J, 1);
      this.J[0] = (paramInt2 - this.L - 3);
      paramInt2 = this.i.a[0];
      i1 = this.i.a[1];
      this.F = (this.A + a(paramInt2 << 8 | i1 & 0xFF));
      if ((this.i.a[2] & 0x8) != 8)
        break label1221;
      paramInt2 = 1;
      label439: if ((localb.c != 2) && ((paramInt1 != 163) || ((this.i.a[2] & 0x80) != 128)))
        break label1226;
      i1 = 1;
      label477: if (i1 == 0)
        break label1232;
      i1 = 1;
      label485: if (paramInt2 == 0)
        break label1238;
    }
    label584: label1096: label1226: label1232: label1238: for (paramInt2 = 134217728; ; paramInt2 = 0)
    {
      this.M = (paramInt2 | i1);
      this.E = 2;
      this.H = 0;
      if (paramInt1 != 163)
        break label1249;
      while (this.H < this.I)
      {
        a(paramf, localb, this.J[this.H]);
        a(localb, this.F + this.H * localb.d / 1000);
        this.H += 1;
      }
      if (paramInt1 != 163)
        throw new org.vidogram.messenger.exoplayer.r("Lacing only supported in SimpleBlocks.");
      a(paramf, 4);
      this.I = ((this.i.a[3] & 0xFF) + 1);
      this.J = a(this.J, this.I);
      if (i1 == 2)
      {
        paramInt2 = (paramInt2 - this.L - 4) / this.I;
        Arrays.fill(this.J, 0, this.I, paramInt2);
        break;
      }
      int i2;
      int i3;
      int i4;
      int i5;
      int[] arrayOfInt;
      if (i1 == 1)
      {
        i2 = 0;
        i1 = 4;
        i3 = 0;
        while (i3 < this.I - 1)
        {
          this.J[i3] = 0;
          i4 = i1;
          do
          {
            i1 = i4 + 1;
            a(paramf, i1);
            i5 = this.i.a[(i1 - 1)] & 0xFF;
            arrayOfInt = this.J;
            arrayOfInt[i3] += i5;
            i4 = i1;
          }
          while (i5 == 255);
          i2 += this.J[i3];
          i3 += 1;
        }
        this.J[(this.I - 1)] = (paramInt2 - this.L - i1 - i2);
        break;
      }
      if (i1 == 3)
      {
        i2 = 0;
        i1 = 4;
        i3 = 0;
        if (i3 < this.I - 1)
        {
          this.J[i3] = 0;
          i5 = i1 + 1;
          a(paramf, i5);
          if (this.i.a[(i5 - 1)] == 0)
            throw new org.vidogram.messenger.exoplayer.r("No valid varint length mask found");
          long l2 = 0L;
          i4 = 0;
          long l1;
          while (true)
          {
            i1 = i5;
            l1 = l2;
            if (i4 < 8)
            {
              i1 = 1 << 7 - i4;
              if ((this.i.a[(i5 - 1)] & i1) == 0)
                break label1096;
              int i6 = i5 - 1;
              i5 += i4;
              a(paramf, i5);
              l2 = this.i.a[i6] & 0xFF & (i1 ^ 0xFFFFFFFF);
              i1 = i6 + 1;
              while (i1 < i5)
              {
                l2 = this.i.a[i1] & 0xFF | l2 << 8;
                i1 += 1;
              }
              i1 = i5;
              l1 = l2;
              if (i3 > 0)
              {
                l1 = l2 - ((1L << i4 * 7 + 6) - 1L);
                i1 = i5;
              }
            }
            if ((l1 >= -2147483648L) && (l1 <= 2147483647L))
              break;
            throw new org.vidogram.messenger.exoplayer.r("EBML lacing sample size out of range.");
            i4 += 1;
          }
          i4 = (int)l1;
          arrayOfInt = this.J;
          if (i3 == 0);
          while (true)
          {
            arrayOfInt[i3] = i4;
            i2 += this.J[i3];
            i3 += 1;
            break;
            i4 += this.J[(i3 - 1)];
          }
        }
        this.J[(this.I - 1)] = (paramInt2 - this.L - i1 - i2);
        break;
      }
      throw new org.vidogram.messenger.exoplayer.r("Unexpected lacing value: " + i1);
      paramInt2 = 0;
      break label439;
      i1 = 0;
      break label477;
      i1 = 0;
      break label485;
    }
    label1221: this.E = 0;
    return;
    label1249: a(paramf, localb, this.J[0]);
  }

  void a(int paramInt, long paramLong)
  {
    switch (paramInt)
    {
    default:
    case 17143:
    case 17029:
    case 21420:
    case 2807729:
    case 176:
    case 186:
    case 21680:
    case 21690:
    case 21682:
    case 215:
    case 131:
    case 2352003:
    case 22186:
    case 22203:
    case 159:
    case 25188:
    case 251:
    case 20529:
    case 20530:
    case 16980:
    case 18401:
    case 18408:
    case 179:
    case 241:
      do
      {
        do
        {
          do
          {
            do
            {
              do
              {
                do
                {
                  do
                  {
                    do
                      return;
                    while (paramLong == 1L);
                    throw new org.vidogram.messenger.exoplayer.r("EBMLReadVersion " + paramLong + " not supported");
                  }
                  while ((paramLong >= 1L) && (paramLong <= 2L));
                  throw new org.vidogram.messenger.exoplayer.r("DocTypeReadVersion " + paramLong + " not supported");
                  this.w = (this.n + paramLong);
                  return;
                  this.p = paramLong;
                  return;
                  this.s.i = (int)paramLong;
                  return;
                  this.s.j = (int)paramLong;
                  return;
                  this.s.k = (int)paramLong;
                  return;
                  this.s.l = (int)paramLong;
                  return;
                  this.s.m = (int)paramLong;
                  return;
                  this.s.b = (int)paramLong;
                  return;
                  this.s.c = (int)paramLong;
                  return;
                  this.s.d = (int)paramLong;
                  return;
                  this.s.q = paramLong;
                  return;
                  this.s.r = paramLong;
                  return;
                  this.s.n = (int)paramLong;
                  return;
                  this.s.o = (int)paramLong;
                  return;
                  this.S = true;
                  return;
                }
                while (paramLong == 0L);
                throw new org.vidogram.messenger.exoplayer.r("ContentEncodingOrder " + paramLong + " not supported");
              }
              while (paramLong == 1L);
              throw new org.vidogram.messenger.exoplayer.r("ContentEncodingScope " + paramLong + " not supported");
            }
            while (paramLong == 3L);
            throw new org.vidogram.messenger.exoplayer.r("ContentCompAlgo " + paramLong + " not supported");
          }
          while (paramLong == 5L);
          throw new org.vidogram.messenger.exoplayer.r("ContentEncAlgo " + paramLong + " not supported");
        }
        while (paramLong == 1L);
        throw new org.vidogram.messenger.exoplayer.r("AESSettingsCipherMode " + paramLong + " not supported");
        this.B.a(a(paramLong));
        return;
      }
      while (this.D);
      this.C.a(paramLong);
      this.D = true;
      return;
    case 231:
      this.A = a(paramLong);
      return;
    case 155:
    }
    this.G = a(paramLong);
  }

  void a(int paramInt, long paramLong1, long paramLong2)
  {
    switch (paramInt)
    {
    case 25152:
    default:
    case 408125543:
    case 19899:
    case 475249515:
    case 187:
    case 524531317:
      do
      {
        return;
        if ((this.n != -1L) && (this.n != paramLong1))
          throw new org.vidogram.messenger.exoplayer.r("Multiple Segment elements not supported");
        this.n = paramLong1;
        this.o = paramLong2;
        return;
        this.v = -1;
        this.w = -1L;
        return;
        this.B = new h();
        this.C = new h();
        return;
        this.D = false;
        return;
      }
      while (this.u);
      if (this.y != -1L)
      {
        this.x = true;
        return;
      }
      this.T.a(l.f);
      this.u = true;
      return;
    case 160:
      this.S = false;
      return;
    case 20533:
      this.s.e = true;
      return;
    case 174:
    }
    this.s = new b(null);
  }

  void a(int paramInt, String paramString)
  {
    switch (paramInt)
    {
    default:
    case 17026:
      do
        return;
      while (("webm".equals(paramString)) || ("matroska".equals(paramString)));
      throw new org.vidogram.messenger.exoplayer.r("DocType " + paramString + " not supported");
    case 134:
      this.s.a = paramString;
      return;
    case 2274716:
    }
    b.a(this.s, paramString);
  }

  public void a(g paramg)
  {
    this.T = paramg;
  }

  public boolean a(org.vidogram.messenger.exoplayer.c.f paramf)
  {
    return new d().a(paramf);
  }

  public void b()
  {
    this.A = -1L;
    this.E = 0;
    this.d.a();
    this.e.a();
    d();
  }

  boolean b(int paramInt)
  {
    return (paramInt == 357149030) || (paramInt == 524531317) || (paramInt == 475249515) || (paramInt == 374648427);
  }

  public void c()
  {
  }

  void c(int paramInt)
  {
    switch (paramInt)
    {
    default:
    case 357149030:
    case 19899:
    case 475249515:
    case 160:
    case 25152:
    case 28032:
      do
      {
        do
        {
          do
          {
            do
            {
              do
              {
                do
                {
                  do
                  {
                    return;
                    if (this.p != -1L)
                      continue;
                    this.p = 1000000L;
                  }
                  while (this.q == -1L);
                  this.r = a(this.q);
                  return;
                  if ((this.v != -1) && (this.w != -1L))
                    continue;
                  throw new org.vidogram.messenger.exoplayer.r("Mandatory element SeekID or SeekPosition not found");
                }
                while (this.v != 475249515);
                this.y = this.w;
                return;
              }
              while (this.u);
              this.T.a(e());
              this.u = true;
              return;
            }
            while (this.E != 2);
            if (!this.S)
              this.M |= 1;
            a((b)this.f.get(this.K), this.F);
            this.E = 0;
            return;
          }
          while (!this.s.e);
          if (this.s.g != null)
            continue;
          throw new org.vidogram.messenger.exoplayer.r("Encrypted Track found but ContentEncKeyID was not found");
        }
        while (this.t);
        this.T.a(new a.c(new a.b("video/webm", this.s.g)));
        this.t = true;
        return;
      }
      while ((!this.s.e) || (this.s.f == null));
      throw new org.vidogram.messenger.exoplayer.r("Combining encryption and compression is not supported");
    case 174:
      if ((this.f.get(this.s.b) == null) && (a(this.s.a)))
      {
        this.s.a(this.T, this.s.b, this.r);
        this.f.put(this.s.b, this.s);
      }
      this.s = null;
      return;
    case 374648427:
    }
    if (this.f.size() == 0)
      throw new org.vidogram.messenger.exoplayer.r("No valid tracks were found");
    this.T.f();
  }

  private final class a
    implements c
  {
    private a()
    {
    }

    public int a(int paramInt)
    {
      return f.this.a(paramInt);
    }

    public void a(int paramInt, double paramDouble)
    {
      f.this.a(paramInt, paramDouble);
    }

    public void a(int paramInt1, int paramInt2, org.vidogram.messenger.exoplayer.c.f paramf)
    {
      f.this.a(paramInt1, paramInt2, paramf);
    }

    public void a(int paramInt, long paramLong)
    {
      f.this.a(paramInt, paramLong);
    }

    public void a(int paramInt, long paramLong1, long paramLong2)
    {
      f.this.a(paramInt, paramLong1, paramLong2);
    }

    public void a(int paramInt, String paramString)
    {
      f.this.a(paramInt, paramString);
    }

    public boolean b(int paramInt)
    {
      return f.this.b(paramInt);
    }

    public void c(int paramInt)
    {
      f.this.c(paramInt);
    }
  }

  private static final class b
  {
    public String a;
    public int b;
    public int c;
    public int d;
    public boolean e;
    public byte[] f;
    public byte[] g;
    public byte[] h;
    public int i = -1;
    public int j = -1;
    public int k = -1;
    public int l = -1;
    public int m = 0;
    public int n = 1;
    public int o = -1;
    public int p = 8000;
    public long q = 0L;
    public long r = 0L;
    public org.vidogram.messenger.exoplayer.c.m s;
    public int t;
    private String u = "eng";

    private static List<byte[]> a(org.vidogram.messenger.exoplayer.f.m paramm)
    {
      try
      {
        paramm.c(16);
        long l1 = paramm.l();
        if (l1 != 826496599L)
          throw new org.vidogram.messenger.exoplayer.r("Unsupported FourCC compression type: " + l1);
      }
      catch (java.lang.ArrayIndexOutOfBoundsException paramm)
      {
        throw new org.vidogram.messenger.exoplayer.r("Error parsing FourCC VC1 codec private");
      }
      int i1 = paramm.d() + 20;
      paramm = paramm.a;
      while (true)
      {
        if (i1 < paramm.length - 4)
        {
          if ((paramm[i1] == 0) && (paramm[(i1 + 1)] == 0) && (paramm[(i1 + 2)] == 1) && (paramm[(i1 + 3)] == 15))
            return Collections.singletonList(Arrays.copyOfRange(paramm, i1, paramm.length));
        }
        else
          throw new org.vidogram.messenger.exoplayer.r("Failed to find FourCC VC1 initialization data");
        i1 += 1;
      }
    }

    private static List<byte[]> a(byte[] paramArrayOfByte)
    {
      int i3 = 0;
      if (paramArrayOfByte[0] != 2)
        try
        {
          throw new org.vidogram.messenger.exoplayer.r("Error parsing vorbis codec private");
        }
        catch (java.lang.ArrayIndexOutOfBoundsException paramArrayOfByte)
        {
          throw new org.vidogram.messenger.exoplayer.r("Error parsing vorbis codec private");
        }
      int i1 = 0;
      int i2 = 1;
      while (paramArrayOfByte[i2] == -1)
      {
        i2 += 1;
        i1 += 255;
      }
      while (true)
      {
        i3 = i2 + 1;
        i2 = paramArrayOfByte[i2];
        if (paramArrayOfByte[i3] != 1)
          throw new org.vidogram.messenger.exoplayer.r("Error parsing vorbis codec private");
        byte[] arrayOfByte1 = new byte[i5];
        System.arraycopy(paramArrayOfByte, i3, arrayOfByte1, 0, i5);
        i3 = i5 + i3;
        if (paramArrayOfByte[i3] != 3)
          throw new org.vidogram.messenger.exoplayer.r("Error parsing vorbis codec private");
        i1 = i1 + i2 + i3;
        if (paramArrayOfByte[i1] != 5)
          throw new org.vidogram.messenger.exoplayer.r("Error parsing vorbis codec private");
        byte[] arrayOfByte2 = new byte[paramArrayOfByte.length - i1];
        System.arraycopy(paramArrayOfByte, i1, arrayOfByte2, 0, paramArrayOfByte.length - i1);
        paramArrayOfByte = new ArrayList(2);
        paramArrayOfByte.add(arrayOfByte1);
        paramArrayOfByte.add(arrayOfByte2);
        return paramArrayOfByte;
        int i4 = i2 + 1;
        int i5 = i1 + paramArrayOfByte[i2];
        i2 = i4;
        i1 = i3;
        while (paramArrayOfByte[i2] == -1)
        {
          i1 += 255;
          i2 += 1;
        }
      }
    }

    private static Pair<List<byte[]>, Integer> b(org.vidogram.messenger.exoplayer.f.m paramm)
    {
      int i2 = 0;
      int i3;
      try
      {
        paramm.b(4);
        i3 = (paramm.f() & 0x3) + 1;
        if (i3 == 3)
          throw new org.vidogram.messenger.exoplayer.r();
      }
      catch (java.lang.ArrayIndexOutOfBoundsException paramm)
      {
        throw new org.vidogram.messenger.exoplayer.r("Error parsing AVC codec private");
      }
      ArrayList localArrayList = new ArrayList();
      int i4 = paramm.f();
      int i1 = 0;
      while (i1 < (i4 & 0x1F))
      {
        localArrayList.add(k.a(paramm));
        i1 += 1;
      }
      i4 = paramm.f();
      i1 = i2;
      while (i1 < i4)
      {
        localArrayList.add(k.a(paramm));
        i1 += 1;
      }
      paramm = Pair.create(localArrayList, Integer.valueOf(i3));
      return paramm;
    }

    private static Pair<List<byte[]>, Integer> c(org.vidogram.messenger.exoplayer.f.m paramm)
    {
      while (true)
      {
        int i2;
        int i1;
        int i3;
        try
        {
          paramm.b(21);
          int i5 = paramm.f();
          int i6 = paramm.f();
          int i4 = paramm.d();
          i2 = 0;
          i1 = 0;
          if (i2 >= i6)
            continue;
          paramm.c(1);
          int i7 = paramm.g();
          i3 = 0;
          if (i3 < i7)
          {
            int i8 = paramm.g();
            i1 += i8 + 4;
            paramm.c(i8);
            i3 += 1;
            continue;
            paramm.b(i4);
            byte[] arrayOfByte = new byte[i1];
            i3 = 0;
            i2 = 0;
            if (i3 >= i6)
              break label232;
            paramm.c(1);
            i7 = paramm.g();
            i4 = 0;
            if (i4 >= i7)
              break label225;
            i8 = paramm.g();
            System.arraycopy(k.a, 0, arrayOfByte, i2, k.a.length);
            i2 += k.a.length;
            System.arraycopy(paramm.a, paramm.d(), arrayOfByte, i2, i8);
            i2 += i8;
            paramm.c(i8);
            i4 += 1;
            continue;
            return Pair.create(paramm, Integer.valueOf((i5 & 0x3) + 1));
            paramm = Collections.singletonList(arrayOfByte);
            continue;
          }
        }
        catch (java.lang.ArrayIndexOutOfBoundsException paramm)
        {
          throw new org.vidogram.messenger.exoplayer.r("Error parsing HEVC codec private");
        }
        i2 += 1;
        continue;
        label225: i3 += 1;
        continue;
        label232: if (i1 != 0)
          continue;
        paramm = null;
      }
    }

    private static boolean d(org.vidogram.messenger.exoplayer.f.m paramm)
    {
      try
      {
        int i1 = paramm.h();
        if (i1 == 1)
          return true;
        if (i1 == 65534)
        {
          paramm.b(24);
          if (paramm.o() == f.a().getMostSignificantBits())
          {
            long l1 = paramm.o();
            long l2 = f.a().getLeastSignificantBits();
            if (l1 == l2);
          }
          else
          {
            return false;
          }
        }
        else
        {
          return false;
        }
      }
      catch (java.lang.ArrayIndexOutOfBoundsException paramm)
      {
        throw new org.vidogram.messenger.exoplayer.r("Error parsing MS/ACM codec private");
      }
      return true;
    }

    public void a(g paramg, int paramInt, long paramLong)
    {
      Object localObject1 = null;
      Object localObject2 = this.a;
      switch (((String)localObject2).hashCode())
      {
      default:
        label224: i1 = -1;
      case 82338133:
      case 82338134:
      case 1809237540:
      case -2095575984:
      case -538363189:
      case -2095576542:
      case -538363109:
      case 855502857:
      case -1373388978:
      case -1730367663:
      case 1951062397:
      case 62923557:
      case -1482641357:
      case 62923603:
      case 1950749482:
      case -1784763192:
      case 62927045:
      case 542569478:
      case -356037306:
      case 1950789798:
      case -1985379776:
      case 725957860:
      case 1422270023:
      case -425012669:
      case 99146302:
      }
      while (true)
        switch (i1)
        {
        default:
          throw new org.vidogram.messenger.exoplayer.r("Unrecognized codec identifier.");
          if (!((String)localObject2).equals("V_VP8"))
            break label224;
          i1 = 0;
          continue;
          if (!((String)localObject2).equals("V_VP9"))
            break label224;
          i1 = 1;
          continue;
          if (!((String)localObject2).equals("V_MPEG2"))
            break label224;
          i1 = 2;
          continue;
          if (!((String)localObject2).equals("V_MPEG4/ISO/SP"))
            break label224;
          i1 = 3;
          continue;
          if (!((String)localObject2).equals("V_MPEG4/ISO/ASP"))
            break label224;
          i1 = 4;
          continue;
          if (!((String)localObject2).equals("V_MPEG4/ISO/AP"))
            break label224;
          i1 = 5;
          continue;
          if (!((String)localObject2).equals("V_MPEG4/ISO/AVC"))
            break label224;
          i1 = 6;
          continue;
          if (!((String)localObject2).equals("V_MPEGH/ISO/HEVC"))
            break label224;
          i1 = 7;
          continue;
          if (!((String)localObject2).equals("V_MS/VFW/FOURCC"))
            break label224;
          i1 = 8;
          continue;
          if (!((String)localObject2).equals("A_VORBIS"))
            break label224;
          i1 = 9;
          continue;
          if (!((String)localObject2).equals("A_OPUS"))
            break label224;
          i1 = 10;
          continue;
          if (!((String)localObject2).equals("A_AAC"))
            break label224;
          i1 = 11;
          continue;
          if (!((String)localObject2).equals("A_MPEG/L3"))
            break label224;
          i1 = 12;
          continue;
          if (!((String)localObject2).equals("A_AC3"))
            break label224;
          i1 = 13;
          continue;
          if (!((String)localObject2).equals("A_EAC3"))
            break label224;
          i1 = 14;
          continue;
          if (!((String)localObject2).equals("A_TRUEHD"))
            break label224;
          i1 = 15;
          continue;
          if (!((String)localObject2).equals("A_DTS"))
            break label224;
          i1 = 16;
          continue;
          if (!((String)localObject2).equals("A_DTS/EXPRESS"))
            break label224;
          i1 = 17;
          continue;
          if (!((String)localObject2).equals("A_DTS/LOSSLESS"))
            break label224;
          i1 = 18;
          continue;
          if (!((String)localObject2).equals("A_FLAC"))
            break label224;
          i1 = 19;
          continue;
          if (!((String)localObject2).equals("A_MS/ACM"))
            break label224;
          i1 = 20;
          continue;
          if (!((String)localObject2).equals("A_PCM/INT/LIT"))
            break label224;
          i1 = 21;
          continue;
          if (!((String)localObject2).equals("S_TEXT/UTF8"))
            break label224;
          i1 = 22;
          continue;
          if (!((String)localObject2).equals("S_VOBSUB"))
            break label224;
          i1 = 23;
          continue;
          if (!((String)localObject2).equals("S_HDMV/PGS"))
            break label224;
          i1 = 24;
        case 0:
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
        case 6:
        case 7:
        case 8:
        case 9:
        case 10:
        case 11:
        case 12:
        case 13:
        case 14:
        case 15:
        case 16:
        case 17:
        case 18:
        case 19:
        case 20:
        case 21:
        case 22:
        case 23:
        case 24:
        }
      localObject1 = "video/x-vnd.on2.vp8";
      localObject2 = null;
      int i2 = -1;
      int i1 = -1;
      while (true)
      {
        if (i.a((String)localObject1))
          localObject1 = MediaFormat.a(Integer.toString(paramInt), (String)localObject1, -1, i1, paramLong, this.n, this.p, (List)localObject2, this.u, i2);
        while (true)
        {
          this.s = paramg.d(this.b);
          this.s.a((MediaFormat)localObject1);
          return;
          localObject1 = "video/x-vnd.on2.vp9";
          localObject2 = null;
          i2 = -1;
          i1 = -1;
          break;
          localObject1 = "video/mpeg2";
          localObject2 = null;
          i2 = -1;
          i1 = -1;
          break;
          String str = "video/mp4v-es";
          if (this.h == null);
          while (true)
          {
            localObject2 = localObject1;
            i2 = -1;
            i1 = -1;
            localObject1 = str;
            break;
            localObject1 = Collections.singletonList(this.h);
          }
          localObject1 = b(new org.vidogram.messenger.exoplayer.f.m(this.h));
          localObject2 = (List)((Pair)localObject1).first;
          this.t = ((Integer)((Pair)localObject1).second).intValue();
          i2 = -1;
          localObject1 = "video/avc";
          i1 = -1;
          break;
          localObject1 = c(new org.vidogram.messenger.exoplayer.f.m(this.h));
          localObject2 = (List)((Pair)localObject1).first;
          this.t = ((Integer)((Pair)localObject1).second).intValue();
          i2 = -1;
          localObject1 = "video/hevc";
          i1 = -1;
          break;
          localObject1 = "video/wvc1";
          localObject2 = a(new org.vidogram.messenger.exoplayer.f.m(this.h));
          i2 = -1;
          i1 = -1;
          break;
          localObject1 = "audio/vorbis";
          i1 = 8192;
          localObject2 = a(this.h);
          i2 = -1;
          break;
          localObject1 = "audio/opus";
          i1 = 5760;
          localObject2 = new ArrayList(3);
          ((List)localObject2).add(this.h);
          ((List)localObject2).add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(this.q).array());
          ((List)localObject2).add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(this.r).array());
          i2 = -1;
          break;
          localObject1 = "audio/mp4a-latm";
          localObject2 = Collections.singletonList(this.h);
          i2 = -1;
          i1 = -1;
          break;
          localObject1 = "audio/mpeg";
          i1 = 4096;
          localObject2 = null;
          i2 = -1;
          break;
          localObject1 = "audio/ac3";
          localObject2 = null;
          i2 = -1;
          i1 = -1;
          break;
          localObject1 = "audio/eac3";
          localObject2 = null;
          i2 = -1;
          i1 = -1;
          break;
          localObject1 = "audio/true-hd";
          localObject2 = null;
          i2 = -1;
          i1 = -1;
          break;
          localObject1 = "audio/vnd.dts";
          localObject2 = null;
          i2 = -1;
          i1 = -1;
          break;
          localObject1 = "audio/vnd.dts.hd";
          localObject2 = null;
          i2 = -1;
          i1 = -1;
          break;
          localObject1 = "audio/x-flac";
          localObject2 = Collections.singletonList(this.h);
          i2 = -1;
          i1 = -1;
          break;
          if (!d(new org.vidogram.messenger.exoplayer.f.m(this.h)))
            throw new org.vidogram.messenger.exoplayer.r("Non-PCM MS/ACM is unsupported");
          i1 = org.vidogram.messenger.exoplayer.f.r.a(this.o);
          i2 = i1;
          if (i1 != 0)
            break label1764;
          throw new org.vidogram.messenger.exoplayer.r("Unsupported PCM bit depth: " + this.o);
          i1 = org.vidogram.messenger.exoplayer.f.r.a(this.o);
          i2 = i1;
          if (i1 != 0)
            break label1764;
          throw new org.vidogram.messenger.exoplayer.r("Unsupported PCM bit depth: " + this.o);
          localObject1 = "application/x-subrip";
          localObject2 = null;
          i2 = -1;
          i1 = -1;
          break;
          localObject1 = "application/vobsub";
          localObject2 = Collections.singletonList(this.h);
          i2 = -1;
          i1 = -1;
          break;
          localObject1 = "application/pgs";
          localObject2 = null;
          i2 = -1;
          i1 = -1;
          break;
          if (i.b((String)localObject1))
          {
            if (this.m == 0)
            {
              if (this.k != -1)
                break label1660;
              i2 = this.i;
              label1551: this.k = i2;
              if (this.l != -1)
                break label1669;
            }
            label1669: for (i2 = this.j; ; i2 = this.l)
            {
              this.l = i2;
              float f2 = -1.0F;
              float f1 = f2;
              if (this.k != -1)
              {
                f1 = f2;
                if (this.l != -1)
                  f1 = this.j * this.k / (this.i * this.l);
              }
              localObject1 = MediaFormat.a(Integer.toString(paramInt), (String)localObject1, -1, i1, paramLong, this.i, this.j, (List)localObject2, -1, f1);
              break;
              label1660: i2 = this.k;
              break label1551;
            }
          }
          if ("application/x-subrip".equals(localObject1))
          {
            localObject1 = MediaFormat.a(Integer.toString(paramInt), (String)localObject1, -1, paramLong, this.u);
            continue;
          }
          if ((!"application/vobsub".equals(localObject1)) && (!"application/pgs".equals(localObject1)))
            break label1753;
          localObject1 = MediaFormat.a(Integer.toString(paramInt), (String)localObject1, -1, paramLong, (List)localObject2, this.u);
        }
        label1753: throw new org.vidogram.messenger.exoplayer.r("Unexpected MIME type.");
        label1764: localObject1 = "audio/raw";
        localObject2 = null;
        i1 = -1;
      }
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.exoplayer.c.g.f
 * JD-Core Version:    0.6.0
 */