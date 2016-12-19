package org.vidogram.messenger.exoplayer.c.c;

import android.util.Pair;
import android.util.Pair<Ljava.lang.Integer;Lorg.vidogram.messenger.exoplayer.c.c.j;>;
import android.util.Pair<Ljava.lang.String;[B>;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.vidogram.messenger.exoplayer.MediaFormat;
import org.vidogram.messenger.exoplayer.f.c;
import org.vidogram.messenger.exoplayer.f.k;
import org.vidogram.messenger.exoplayer.f.k.b;
import org.vidogram.messenger.exoplayer.f.m;

final class b
{
  private static int a(m paramm, int paramInt1, int paramInt2)
  {
    int i = paramm.d();
    while (i - paramInt1 < paramInt2)
    {
      paramm.b(i);
      int j = paramm.m();
      if (j > 0);
      for (boolean bool = true; ; bool = false)
      {
        org.vidogram.messenger.exoplayer.f.b.a(bool, "childAtomSize should be positive");
        if (paramm.m() != a.I)
          break;
        return i;
      }
      i += j;
    }
    return -1;
  }

  private static int a(m paramm, int paramInt1, int paramInt2, d paramd, int paramInt3)
  {
    boolean bool2 = true;
    int k = 0;
    int i = paramm.d();
    while (true)
    {
      int j = k;
      Integer localInteger;
      if (i - paramInt1 < paramInt2)
      {
        paramm.b(i);
        j = paramm.m();
        if (j <= 0)
          break label119;
        bool1 = true;
        org.vidogram.messenger.exoplayer.f.b.a(bool1, "childAtomSize should be positive");
        if (paramm.m() != a.U)
          break label131;
        paramm = b(paramm, i, j);
        localInteger = (Integer)paramm.first;
        if (localInteger == null)
          break label125;
      }
      label119: label125: for (boolean bool1 = bool2; ; bool1 = false)
      {
        org.vidogram.messenger.exoplayer.f.b.a(bool1, "frma atom is mandatory");
        paramd.a[paramInt3] = ((j)paramm.second);
        j = localInteger.intValue();
        return j;
        bool1 = false;
        break;
      }
      label131: i += j;
    }
  }

  private static Pair<long[], long[]> a(a.a parama)
  {
    if (parama != null)
    {
      parama = parama.d(a.P);
      if (parama != null);
    }
    else
    {
      return Pair.create(null, null);
    }
    parama = parama.aK;
    parama.b(8);
    int j = a.a(parama.m());
    int k = parama.s();
    long[] arrayOfLong1 = new long[k];
    long[] arrayOfLong2 = new long[k];
    int i = 0;
    while (i < k)
    {
      long l;
      if (j == 1)
      {
        l = parama.u();
        arrayOfLong1[i] = l;
        if (j != 1)
          break label124;
        l = parama.o();
      }
      while (true)
      {
        arrayOfLong2[i] = l;
        if (parama.i() == 1)
          break label134;
        throw new IllegalArgumentException("Unsupported media rate.");
        l = parama.k();
        break;
        label124: l = parama.m();
      }
      label134: parama.c(2);
      i += 1;
    }
    return Pair.create(arrayOfLong1, arrayOfLong2);
  }

  private static a a(m paramm, int paramInt)
  {
    paramm.b(paramInt + 8 + 4);
    int i = (paramm.f() & 0x3) + 1;
    if (i == 3)
      throw new IllegalStateException();
    ArrayList localArrayList = new ArrayList();
    float f = 1.0F;
    int j = paramm.f() & 0x1F;
    paramInt = 0;
    while (paramInt < j)
    {
      localArrayList.add(k.a(paramm));
      paramInt += 1;
    }
    int k = paramm.f();
    paramInt = 0;
    while (paramInt < k)
    {
      localArrayList.add(k.a(paramm));
      paramInt += 1;
    }
    if (j > 0)
    {
      paramm = new org.vidogram.messenger.exoplayer.f.l((byte[])localArrayList.get(0));
      paramm.a((i + 1) * 8);
      f = k.a(paramm).d;
    }
    return new a(localArrayList, i, f);
  }

  private static d a(m paramm, int paramInt1, long paramLong, int paramInt2, String paramString, boolean paramBoolean)
  {
    paramm.b(12);
    int j = paramm.m();
    d locald = new d(j);
    int i = 0;
    if (i < j)
    {
      int k = paramm.d();
      int m = paramm.m();
      boolean bool;
      label53: int n;
      if (m > 0)
      {
        bool = true;
        org.vidogram.messenger.exoplayer.f.b.a(bool, "childAtomSize should be positive");
        n = paramm.m();
        if ((n != a.b) && (n != a.c) && (n != a.Y) && (n != a.ak) && (n != a.d) && (n != a.e) && (n != a.f) && (n != a.aF) && (n != a.aG))
          break label180;
        a(paramm, n, k, m, paramInt1, paramLong, paramInt2, locald, i);
      }
      while (true)
      {
        paramm.b(k + m);
        i += 1;
        break;
        bool = false;
        break label53;
        label180: if ((n == a.i) || (n == a.Z) || (n == a.m) || (n == a.o) || (n == a.q) || (n == a.t) || (n == a.r) || (n == a.s) || (n == a.aw) || (n == a.ax) || (n == a.k) || (n == a.l))
        {
          a(paramm, n, k, m, paramInt1, paramLong, paramString, paramBoolean, locald, i);
          continue;
        }
        if (n == a.ai)
        {
          locald.b = MediaFormat.a(Integer.toString(paramInt1), "application/ttml+xml", -1, paramLong, paramString);
          continue;
        }
        if (n == a.at)
        {
          locald.b = MediaFormat.a(Integer.toString(paramInt1), "application/x-quicktime-tx3g", -1, paramLong, paramString);
          continue;
        }
        if (n == a.au)
        {
          locald.b = MediaFormat.a(Integer.toString(paramInt1), "application/x-mp4vtt", -1, paramLong, paramString);
          continue;
        }
        if (n != a.av)
          continue;
        locald.b = MediaFormat.a(Integer.toString(paramInt1), "application/ttml+xml", -1, paramLong, paramString, 0L);
      }
    }
    return locald;
  }

  public static i a(a.a parama, a.b paramb, long paramLong, boolean paramBoolean)
  {
    Object localObject = parama.e(a.D);
    int i = e(((a.a)localObject).d(a.R).aK);
    if ((i != i.b) && (i != i.a) && (i != i.c) && (i != i.d) && (i != i.e))
      return null;
    g localg = d(parama.d(a.N).aK);
    if (paramLong == -1L)
      paramLong = g.a(localg);
    while (true)
    {
      long l = c(paramb.aK);
      if (paramLong == -1L)
        paramLong = -1L;
      while (true)
      {
        a.a locala = ((a.a)localObject).e(a.E).e(a.F);
        paramb = f(((a.a)localObject).d(a.Q).aK);
        localObject = a(locala.d(a.S).aK, g.b(localg), paramLong, g.c(localg), (String)paramb.second, paramBoolean);
        parama = a(parama.e(a.O));
        if (((d)localObject).b != null)
          break;
        return null;
        paramLong = org.vidogram.messenger.exoplayer.f.r.a(paramLong, 1000000L, l);
      }
      return new i(g.b(localg), i, ((Long)paramb.first).longValue(), l, paramLong, ((d)localObject).b, ((d)localObject).a, ((d)localObject).c, (long[])parama.first, (long[])parama.second);
    }
  }

  public static l a(i parami, a.a parama)
  {
    Object localObject1 = parama.d(a.ap);
    if (localObject1 != null);
    int i14;
    for (Object localObject2 = new e((a.b)localObject1); ; localObject2 = new f((a.b)localObject1))
    {
      i14 = ((c)localObject2).a();
      if (i14 != 0)
        break;
      return new l(new long[0], new int[0], 0, new long[0], new int[0]);
      localObject1 = parama.d(a.aq);
      if (localObject1 != null)
        continue;
      throw new org.vidogram.messenger.exoplayer.r("Track has no sample table size information");
    }
    boolean bool = false;
    Object localObject3 = parama.d(a.ar);
    localObject1 = localObject3;
    if (localObject3 == null)
    {
      bool = true;
      localObject1 = parama.d(a.as);
    }
    Object localObject4 = ((a.b)localObject1).aK;
    Object localObject5 = parama.d(a.ao).aK;
    Object localObject7 = parama.d(a.al).aK;
    localObject1 = parama.d(a.am);
    label202: b localb;
    int i5;
    int i6;
    int n;
    int k;
    int i;
    int j;
    if (localObject1 != null)
    {
      localObject1 = ((a.b)localObject1).aK;
      parama = parama.d(a.an);
      if (parama == null)
        break label470;
      localObject3 = parama.aK;
      localb = new b((m)localObject5, (m)localObject4, bool);
      ((m)localObject7).b(12);
      i5 = ((m)localObject7).s() - 1;
      i6 = ((m)localObject7).s();
      n = ((m)localObject7).s();
      k = 0;
      if (localObject3 != null)
      {
        ((m)localObject3).b(12);
        k = ((m)localObject3).s();
      }
      if (localObject1 == null)
        break label1705;
      ((m)localObject1).b(12);
      i = ((m)localObject1).s();
      if (i <= 0)
        break label476;
      j = ((m)localObject1).s() - 1;
      parama = (a.a)localObject1;
    }
    while (true)
    {
      label302: if ((((c)localObject2).c()) && ("audio/raw".equals(parami.k.b)) && (i5 == 0) && (k == 0) && (i == 0));
      int i2;
      Object localObject6;
      long l1;
      int i3;
      long l2;
      int i4;
      int i7;
      int i8;
      for (int m = 1; ; m = 0)
      {
        i2 = 0;
        if (m != 0)
          break label939;
        localObject4 = new long[i14];
        localObject1 = new int[i14];
        localObject5 = new long[i14];
        localObject6 = new int[i14];
        l1 = 0L;
        i3 = 0;
        l2 = 0L;
        m = n;
        i4 = 0;
        i9 = 0;
        n = k;
        i10 = 0;
        i7 = j;
        i8 = i;
        j = m;
        k = i2;
        i2 = i9;
        i = n;
        n = i10;
        if (i4 >= i14)
          break label756;
        while (i3 == 0)
        {
          org.vidogram.messenger.exoplayer.f.b.b(localb.a());
          l1 = localb.d;
          i3 = localb.c;
        }
        localObject1 = null;
        break;
        label470: localObject3 = null;
        break label202;
        label476: j = -1;
        parama = null;
        break label302;
      }
      int i11 = n;
      int i10 = i;
      int i9 = i2;
      if (localObject3 != null)
      {
        while ((i2 == 0) && (i > 0))
        {
          i2 = ((m)localObject3).s();
          n = ((m)localObject3).m();
          i -= 1;
        }
        i9 = i2 - 1;
        i10 = i;
        i11 = n;
      }
      localObject4[i4] = l1;
      localObject1[i4] = ((c)localObject2).b();
      int i12 = k;
      if (localObject1[i4] > k)
        i12 = localObject1[i4];
      localObject5[i4] = (i11 + l2);
      label605: int i13;
      if (parama == null)
      {
        i = 1;
        localObject6[i4] = i;
        m = i8;
        i13 = i7;
        if (i4 == i7)
        {
          localObject6[i4] = 1;
          i = i8 - 1;
          if (i <= 0)
            break label1695;
          i13 = parama.s() - 1;
          m = i;
        }
      }
      while (true)
      {
        l2 += j;
        k = i6 - 1;
        if ((k == 0) && (i5 > 0))
        {
          j = ((m)localObject7).s();
          i = ((m)localObject7).s();
          i5 -= 1;
        }
        while (true)
        {
          long l3 = localObject1[i4];
          i4 += 1;
          i6 = j;
          j = i;
          i3 -= 1;
          l1 += l3;
          n = i11;
          i = i10;
          i2 = i9;
          k = i12;
          i8 = m;
          i7 = i13;
          break;
          i = 0;
          break label605;
          label756: if (i2 == 0)
          {
            bool = true;
            org.vidogram.messenger.exoplayer.f.b.a(bool);
            if (i <= 0)
              break label814;
            if (((m)localObject3).s() != 0)
              break label808;
          }
          label769: label808: for (bool = true; ; bool = false)
          {
            org.vidogram.messenger.exoplayer.f.b.a(bool);
            ((m)localObject3).m();
            i -= 1;
            break label769;
            bool = false;
            break;
          }
          label814: if (i8 == 0)
          {
            bool = true;
            org.vidogram.messenger.exoplayer.f.b.a(bool);
            if (i6 != 0)
              break label921;
            bool = true;
            label835: org.vidogram.messenger.exoplayer.f.b.a(bool);
            if (i3 != 0)
              break label927;
            bool = true;
            label848: org.vidogram.messenger.exoplayer.f.b.a(bool);
            if (i5 != 0)
              break label933;
            bool = true;
            label861: org.vidogram.messenger.exoplayer.f.b.a(bool);
            localObject2 = localObject6;
            localObject3 = localObject5;
            i = k;
            parama = (a.a)localObject4;
          }
          while (true)
          {
            if (parami.m != null)
              break label1046;
            org.vidogram.messenger.exoplayer.f.r.a(localObject3, 1000000L, parami.h);
            return new l(parama, localObject1, i, localObject3, localObject2);
            bool = false;
            break;
            label921: bool = false;
            break label835;
            label927: bool = false;
            break label848;
            label933: bool = false;
            break label861;
            label939: parama = new long[localb.a];
            localObject1 = new int[localb.a];
            while (localb.a())
            {
              parama[localb.b] = localb.d;
              localObject1[localb.b] = localb.c;
            }
            localObject2 = d.a(((c)localObject2).b(), parama, localObject1, n);
            parama = ((d.a)localObject2).a;
            localObject1 = ((d.a)localObject2).b;
            i = ((d.a)localObject2).c;
            localObject3 = ((d.a)localObject2).d;
            localObject2 = ((d.a)localObject2).e;
          }
          label1046: if ((parami.m.length == 1) && (parami.m[0] == 0L))
          {
            j = 0;
            while (j < localObject3.length)
            {
              localObject3[j] = org.vidogram.messenger.exoplayer.f.r.a(localObject3[j] - parami.n[0], 1000000L, parami.h);
              j += 1;
            }
            return new l(parama, localObject1, i, localObject3, localObject2);
          }
          int i1 = 0;
          k = 0;
          m = 0;
          j = 0;
          if (i1 < parami.m.length)
          {
            l1 = parami.n[i1];
            if (l1 == -1L)
              break label1672;
            l2 = org.vidogram.messenger.exoplayer.f.r.a(parami.m[i1], parami.h, parami.i);
            i4 = org.vidogram.messenger.exoplayer.f.r.b(localObject3, l1, true, true);
            i2 = org.vidogram.messenger.exoplayer.f.r.b(localObject3, l2 + l1, true, false);
            i3 = j + (i2 - i4);
            if (m != i4)
            {
              j = 1;
              label1225: m = j | k;
              j = i3;
            }
          }
          for (k = i2; ; k = i2)
          {
            i1 += 1;
            i2 = k;
            k = m;
            m = i2;
            break;
            j = 0;
            break label1225;
            if (j != i14)
            {
              m = 1;
              i2 = k | m;
              if (i2 == 0)
                break label1548;
              localObject4 = new long[j];
              label1290: if (i2 == 0)
                break label1554;
              localObject5 = new int[j];
              label1300: if (i2 == 0)
                break label1561;
              i = 0;
              label1307: if (i2 == 0)
                break label1564;
            }
            label1548: label1554: label1561: label1564: for (localObject6 = new int[j]; ; localObject6 = localObject2)
            {
              localObject7 = new long[j];
              k = 0;
              j = 0;
              l1 = 0L;
              if (k >= parami.m.length)
                break label1587;
              l2 = parami.n[k];
              l3 = parami.m[k];
              if (l2 == -1L)
                break label1669;
              long l4 = org.vidogram.messenger.exoplayer.f.r.a(l3, parami.h, parami.i);
              m = org.vidogram.messenger.exoplayer.f.r.b(localObject3, l2, true, true);
              i3 = org.vidogram.messenger.exoplayer.f.r.b(localObject3, l2 + l4, true, false);
              if (i2 != 0)
              {
                i1 = i3 - m;
                System.arraycopy(parama, m, localObject4, j, i1);
                System.arraycopy(localObject1, m, localObject5, j, i1);
                System.arraycopy(localObject2, m, localObject6, j, i1);
              }
              while (m < i3)
              {
                l4 = org.vidogram.messenger.exoplayer.f.r.a(l1, 1000000L, parami.i);
                localObject7[j] = (org.vidogram.messenger.exoplayer.f.r.a(localObject3[m] - l2, 1000000L, parami.h) + l4);
                i1 = i;
                if (i2 != 0)
                {
                  i1 = i;
                  if (localObject5[j] > i)
                    i1 = localObject1[m];
                }
                j += 1;
                m += 1;
                i = i1;
              }
              m = 0;
              break;
              localObject4 = parama;
              break label1290;
              localObject5 = localObject1;
              break label1300;
              break label1307;
            }
            label1669: 
            while (true)
            {
              k += 1;
              l1 = l3 + l1;
              break;
              label1587: k = 0;
              j = 0;
              if ((j < localObject6.length) && (k == 0))
              {
                if ((localObject6[j] & 0x1) != 0);
                for (m = 1; ; m = 0)
                {
                  k |= m;
                  j += 1;
                  break;
                }
              }
              if (k == 0)
                throw new org.vidogram.messenger.exoplayer.r("The edited sample sequence does not contain a sync sample.");
              return new l(localObject4, localObject5, i, localObject7, localObject6);
            }
            label1672: i2 = m;
            m = k;
          }
          i = j;
          j = k;
        }
        label1695: m = i;
        i13 = i7;
      }
      label1705: j = -1;
      parama = (a.a)localObject1;
      i = 0;
    }
  }

  public static org.vidogram.messenger.exoplayer.c.i a(a.b paramb, boolean paramBoolean)
  {
    if (paramBoolean);
    while (true)
    {
      return null;
      paramb = paramb.aK;
      paramb.b(8);
      while (paramb.b() >= 8)
      {
        int i = paramb.m();
        if (paramb.m() == a.az)
        {
          paramb.b(paramb.d() - 8);
          paramb.a(paramb.d() + i);
          return a(paramb);
        }
        paramb.c(i - 8);
      }
    }
  }

  private static org.vidogram.messenger.exoplayer.c.i a(m paramm)
  {
    paramm.c(12);
    m localm = new m();
    while (paramm.b() >= 8)
    {
      int i = paramm.m() - 8;
      if (paramm.m() == a.aA)
      {
        localm.a(paramm.a, paramm.d() + i);
        localm.b(paramm.d());
        org.vidogram.messenger.exoplayer.c.i locali = b(localm);
        if (locali != null)
          return locali;
      }
      paramm.c(i);
    }
    return null;
  }

  private static void a(m paramm, int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong, int paramInt5, d paramd, int paramInt6)
  {
    paramm.b(paramInt2 + 8);
    paramm.c(24);
    int k = paramm.g();
    int m = paramm.g();
    int j = 0;
    float f = 1.0F;
    paramm.c(50);
    int i = paramm.d();
    if (paramInt1 == a.Y)
    {
      a(paramm, paramInt2, paramInt3, paramd, paramInt6);
      paramm.b(i);
    }
    Object localObject2 = null;
    Object localObject1 = null;
    paramInt6 = j;
    int n;
    if (i - paramInt2 < paramInt3)
    {
      paramm.b(i);
      n = paramm.d();
      j = paramm.m();
      if ((j != 0) || (paramm.d() - paramInt2 != paramInt3));
    }
    else
    {
      if (localObject1 != null)
        break label465;
      return;
    }
    boolean bool;
    label133: int i1;
    if (j > 0)
    {
      bool = true;
      org.vidogram.messenger.exoplayer.f.b.a(bool, "childAtomSize should be positive");
      i1 = paramm.m();
      if (i1 != a.G)
        break label231;
      if (localObject1 != null)
        break label225;
      bool = true;
      label162: org.vidogram.messenger.exoplayer.f.b.b(bool);
      localObject1 = "video/avc";
      a locala = a(paramm, n);
      localObject2 = locala.a;
      paramd.c = locala.b;
      if (paramInt6 == 0)
        f = locala.c;
    }
    while (true)
    {
      i += j;
      break;
      bool = false;
      break label133;
      label225: bool = false;
      break label162;
      label231: if (i1 == a.H)
      {
        if (localObject1 == null);
        for (bool = true; ; bool = false)
        {
          org.vidogram.messenger.exoplayer.f.b.b(bool);
          localObject1 = b(paramm, n);
          localObject2 = (List)((Pair)localObject1).first;
          paramd.c = ((Integer)((Pair)localObject1).second).intValue();
          localObject1 = "video/hevc";
          break;
        }
      }
      if (i1 == a.g)
      {
        if (localObject1 == null);
        for (bool = true; ; bool = false)
        {
          org.vidogram.messenger.exoplayer.f.b.b(bool);
          localObject1 = "video/3gpp";
          break;
        }
      }
      if (i1 == a.I)
      {
        if (localObject1 == null);
        for (bool = true; ; bool = false)
        {
          org.vidogram.messenger.exoplayer.f.b.b(bool);
          localObject2 = d(paramm, n);
          localObject1 = (String)((Pair)localObject2).first;
          localObject2 = Collections.singletonList(((Pair)localObject2).second);
          break;
        }
      }
      if (i1 == a.ah)
      {
        f = c(paramm, n);
        paramInt6 = 1;
        continue;
      }
      if (i1 == a.aH)
      {
        if (localObject1 == null)
        {
          bool = true;
          label431: org.vidogram.messenger.exoplayer.f.b.b(bool);
          if (paramInt1 != a.aF)
            break label457;
        }
        label457: for (localObject1 = "video/x-vnd.on2.vp8"; ; localObject1 = "video/x-vnd.on2.vp9")
        {
          break;
          bool = false;
          break label431;
        }
        label465: paramd.b = MediaFormat.a(Integer.toString(paramInt4), (String)localObject1, -1, -1, paramLong, k, m, (List)localObject2, paramInt5, f);
        return;
      }
    }
  }

  private static void a(m paramm, int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong, String paramString, boolean paramBoolean, d paramd, int paramInt5)
  {
    paramm.b(paramInt2 + 8);
    int k;
    int m;
    int n;
    int i;
    int j;
    label88: Object localObject1;
    label138: Object localObject2;
    label152: boolean bool;
    label180: label226: Object localObject3;
    Object localObject4;
    if (paramBoolean)
    {
      paramm.c(8);
      k = paramm.g();
      paramm.c(6);
      if ((k != 0) && (k != 1))
        break label371;
      m = paramm.g();
      paramm.c(6);
      n = paramm.q();
      i = n;
      j = m;
      if (k == 1)
      {
        paramm.c(16);
        j = m;
        i = n;
      }
      m = paramm.d();
      k = paramInt1;
      if (paramInt1 == a.Z)
      {
        k = a(paramm, paramInt2, paramInt3, paramd, paramInt5);
        paramm.b(m);
      }
      localObject1 = null;
      if (k != a.m)
        break label408;
      localObject1 = "audio/ac3";
      localObject2 = null;
      paramInt1 = i;
      i = j;
      paramInt5 = m;
      if (paramInt5 - paramInt2 >= paramInt3)
        break label727;
      paramm.b(paramInt5);
      m = paramm.m();
      if (m <= 0)
        break label536;
      bool = true;
      org.vidogram.messenger.exoplayer.f.b.a(bool, "childAtomSize should be positive");
      n = paramm.m();
      if ((n != a.I) && ((!paramBoolean) || (n != a.j)))
        break label555;
      if (n != a.I)
        break label542;
      j = paramInt5;
      if (j == -1)
        break label805;
      localObject1 = d(paramm, j);
      localObject3 = (String)((Pair)localObject1).first;
      localObject4 = (byte[])((Pair)localObject1).second;
      localObject1 = localObject3;
      localObject2 = localObject4;
      if ("audio/mp4a-latm".equals(localObject3))
      {
        localObject1 = c.a(localObject4);
        paramInt1 = ((Integer)((Pair)localObject1).first).intValue();
        i = ((Integer)((Pair)localObject1).second).intValue();
        localObject2 = localObject4;
        localObject1 = localObject3;
      }
    }
    label408: label542: label805: 
    while (true)
    {
      localObject3 = localObject2;
      j = paramInt1;
      k = i;
      localObject4 = localObject1;
      while (true)
      {
        paramInt5 += m;
        localObject1 = localObject4;
        i = k;
        paramInt1 = j;
        localObject2 = localObject3;
        break label152;
        paramm.c(16);
        k = 0;
        break;
        label371: if (k != 2)
          break label790;
        paramm.c(16);
        i = (int)Math.round(paramm.v());
        j = paramm.s();
        paramm.c(20);
        break label88;
        if (k == a.o)
        {
          localObject1 = "audio/eac3";
          break label138;
        }
        if (k == a.q)
        {
          localObject1 = "audio/vnd.dts";
          break label138;
        }
        if ((k == a.r) || (k == a.s))
        {
          localObject1 = "audio/vnd.dts.hd";
          break label138;
        }
        if (k == a.t)
        {
          localObject1 = "audio/vnd.dts.hd;profile=lbr";
          break label138;
        }
        if (k == a.aw)
        {
          localObject1 = "audio/3gpp";
          break label138;
        }
        if (k == a.ax)
        {
          localObject1 = "audio/amr-wb";
          break label138;
        }
        if ((k != a.k) && (k != a.l))
          break label138;
        localObject1 = "audio/raw";
        break label138;
        bool = false;
        break label180;
        j = a(paramm, paramInt5, m);
        break label226;
        label555: if (n == a.n)
        {
          paramm.b(paramInt5 + 8);
          paramd.b = org.vidogram.messenger.exoplayer.f.a.a(paramm, Integer.toString(paramInt4), paramLong, paramString);
          localObject4 = localObject1;
          k = i;
          j = paramInt1;
          localObject3 = localObject2;
          continue;
        }
        if (n == a.p)
        {
          paramm.b(paramInt5 + 8);
          paramd.b = org.vidogram.messenger.exoplayer.f.a.b(paramm, Integer.toString(paramInt4), paramLong, paramString);
          localObject4 = localObject1;
          k = i;
          j = paramInt1;
          localObject3 = localObject2;
          continue;
        }
        localObject4 = localObject1;
        k = i;
        j = paramInt1;
        localObject3 = localObject2;
        if (n != a.u)
          continue;
        paramd.b = MediaFormat.a(Integer.toString(paramInt4), (String)localObject1, -1, -1, paramLong, i, paramInt1, null, paramString);
        localObject4 = localObject1;
        k = i;
        j = paramInt1;
        localObject3 = localObject2;
      }
      label727: if ((paramd.b == null) && (localObject1 != null))
      {
        if (!"audio/raw".equals(localObject1))
          break label791;
        paramInt2 = 2;
        localObject3 = Integer.toString(paramInt4);
        if (localObject2 != null)
          break label796;
      }
      for (paramm = null; ; paramm = Collections.singletonList(localObject2))
      {
        paramd.b = MediaFormat.a((String)localObject3, (String)localObject1, -1, -1, paramLong, i, paramInt1, paramm, paramString, paramInt2);
        return;
        paramInt2 = -1;
        break;
      }
    }
  }

  private static Pair<List<byte[]>, Integer> b(m paramm, int paramInt)
  {
    paramm.b(paramInt + 8 + 21);
    int m = paramm.f();
    int n = paramm.f();
    int k = paramm.d();
    int i = 0;
    paramInt = 0;
    int i1;
    int i2;
    while (i < n)
    {
      paramm.c(1);
      i1 = paramm.g();
      j = 0;
      while (j < i1)
      {
        i2 = paramm.g();
        paramInt += i2 + 4;
        paramm.c(i2);
        j += 1;
      }
      i += 1;
    }
    paramm.b(k);
    byte[] arrayOfByte = new byte[paramInt];
    int j = 0;
    i = 0;
    while (j < n)
    {
      paramm.c(1);
      i1 = paramm.g();
      k = 0;
      while (k < i1)
      {
        i2 = paramm.g();
        System.arraycopy(k.a, 0, arrayOfByte, i, k.a.length);
        i += k.a.length;
        System.arraycopy(paramm.a, paramm.d(), arrayOfByte, i, i2);
        i += i2;
        paramm.c(i2);
        k += 1;
      }
      j += 1;
    }
    if (paramInt == 0);
    for (paramm = null; ; paramm = Collections.singletonList(arrayOfByte))
      return Pair.create(paramm, Integer.valueOf((m & 0x3) + 1));
  }

  private static Pair<Integer, j> b(m paramm, int paramInt1, int paramInt2)
  {
    Object localObject1 = null;
    int i = paramInt1 + 8;
    j localj = null;
    if (i - paramInt1 < paramInt2)
    {
      paramm.b(i);
      int j = paramm.m();
      int k = paramm.m();
      Object localObject2;
      if (k == a.aa)
        localObject2 = Integer.valueOf(paramm.m());
      while (true)
      {
        i += j;
        localObject1 = localObject2;
        break;
        if (k == a.V)
        {
          paramm.c(4);
          paramm.m();
          paramm.m();
          localObject2 = localObject1;
          continue;
        }
        localObject2 = localObject1;
        if (k != a.W)
          continue;
        localj = c(paramm, i, j);
        localObject2 = localObject1;
      }
    }
    return (Pair<Integer, j>)Pair.create(localObject1, localj);
  }

  private static org.vidogram.messenger.exoplayer.c.i b(m paramm)
  {
    Object localObject2 = null;
    while (true)
    {
      Object localObject1 = localObject2;
      int i;
      if (paramm.b() > 0)
      {
        i = paramm.d() + paramm.m();
        if (paramm.m() == a.aI)
        {
          String str2 = null;
          String str1 = null;
          localObject1 = null;
          while (paramm.d() < i)
          {
            int j = paramm.m() - 12;
            int k = paramm.m();
            paramm.c(4);
            if (k == a.aB)
            {
              localObject1 = paramm.d(j);
              continue;
            }
            if (k == a.aC)
            {
              str1 = paramm.d(j);
              continue;
            }
            if (k == a.aD)
            {
              paramm.c(4);
              str2 = paramm.d(j - 4);
              continue;
            }
            paramm.c(j);
          }
          if ((str1 == null) || (str2 == null) || (!"com.apple.iTunes".equals(localObject1)))
            continue;
          localObject1 = org.vidogram.messenger.exoplayer.c.i.a(str1, str2);
        }
      }
      else
      {
        return localObject1;
      }
      paramm.b(i);
    }
  }

  private static float c(m paramm, int paramInt)
  {
    paramm.b(paramInt + 8);
    paramInt = paramm.s();
    int i = paramm.s();
    return paramInt / i;
  }

  private static long c(m paramm)
  {
    int i = 8;
    paramm.b(8);
    if (a.a(paramm.m()) == 0);
    while (true)
    {
      paramm.c(i);
      return paramm.k();
      i = 16;
    }
  }

  private static j c(m paramm, int paramInt1, int paramInt2)
  {
    boolean bool = true;
    int i = paramInt1 + 8;
    while (i - paramInt1 < paramInt2)
    {
      paramm.b(i);
      int j = paramm.m();
      if (paramm.m() == a.X)
      {
        paramm.c(6);
        if (paramm.f() == 1);
        while (true)
        {
          paramInt1 = paramm.f();
          byte[] arrayOfByte = new byte[16];
          paramm.a(arrayOfByte, 0, arrayOfByte.length);
          return new j(bool, paramInt1, arrayOfByte);
          bool = false;
        }
      }
      i += j;
    }
    return null;
  }

  private static Pair<String, byte[]> d(m paramm, int paramInt)
  {
    Object localObject = null;
    paramm.b(paramInt + 8 + 4);
    paramm.c(1);
    g(paramm);
    paramm.c(2);
    paramInt = paramm.f();
    if ((paramInt & 0x80) != 0)
      paramm.c(2);
    if ((paramInt & 0x40) != 0)
      paramm.c(paramm.g());
    if ((paramInt & 0x20) != 0)
      paramm.c(2);
    paramm.c(1);
    g(paramm);
    switch (paramm.f())
    {
    default:
    case 107:
    case 32:
    case 33:
    case 35:
    case 64:
    case 102:
    case 103:
    case 104:
    case 165:
    case 166:
      while (true)
      {
        paramm.c(12);
        paramm.c(1);
        paramInt = g(paramm);
        byte[] arrayOfByte = new byte[paramInt];
        paramm.a(arrayOfByte, 0, paramInt);
        return Pair.create(localObject, arrayOfByte);
        return Pair.create("audio/mpeg", null);
        localObject = "video/mp4v-es";
        continue;
        localObject = "video/avc";
        continue;
        localObject = "video/hevc";
        continue;
        localObject = "audio/mp4a-latm";
        continue;
        localObject = "audio/ac3";
        continue;
        localObject = "audio/eac3";
      }
    case 169:
    case 172:
      return Pair.create("audio/vnd.dts", null);
    case 170:
    case 171:
    }
    return (Pair<String, byte[]>)Pair.create("audio/vnd.dts.hd", null);
  }

  private static g d(m paramm)
  {
    int j = 8;
    paramm.b(8);
    int i1 = a.a(paramm.m());
    int i;
    int n;
    int m;
    label62: int k;
    long l1;
    if (i1 == 0)
    {
      i = 8;
      paramm.c(i);
      n = paramm.m();
      paramm.c(4);
      m = 1;
      int i2 = paramm.d();
      i = j;
      if (i1 == 0)
        i = 4;
      j = 0;
      k = m;
      if (j < i)
      {
        if (paramm.a[(i2 + j)] == -1)
          break label177;
        k = 0;
      }
      if (k == 0)
        break label184;
      paramm.c(i);
      l1 = -1L;
      paramm.c(16);
      i = paramm.m();
      j = paramm.m();
      paramm.c(4);
      k = paramm.m();
      m = paramm.m();
      if ((i != 0) || (j != 65536) || (k != -65536) || (m != 0))
        break label223;
      i = 90;
    }
    while (true)
    {
      return new g(n, l1, i);
      i = 16;
      break;
      label177: j += 1;
      break label62;
      label184: long l2;
      if (i1 == 0)
        l2 = paramm.k();
      while (true)
      {
        l1 = l2;
        if (l2 != 0L)
          break;
        l1 = -1L;
        break;
        l2 = paramm.u();
      }
      label223: if ((i == 0) && (j == -65536) && (k == 65536) && (m == 0))
      {
        i = 270;
        continue;
      }
      if ((i == -65536) && (j == 0) && (k == 0) && (m == -65536))
      {
        i = 180;
        continue;
      }
      i = 0;
    }
  }

  private static int e(m paramm)
  {
    paramm.b(16);
    return paramm.m();
  }

  private static Pair<Long, String> f(m paramm)
  {
    int j = 8;
    paramm.b(8);
    int k = a.a(paramm.m());
    if (k == 0);
    for (int i = 8; ; i = 16)
    {
      paramm.c(i);
      long l = paramm.k();
      i = j;
      if (k == 0)
        i = 4;
      paramm.c(i);
      i = paramm.g();
      return Pair.create(Long.valueOf(l), "" + (char)((i >> 10 & 0x1F) + 96) + (char)((i >> 5 & 0x1F) + 96) + (char)((i & 0x1F) + 96));
    }
  }

  private static int g(m paramm)
  {
    int j = paramm.f();
    for (int i = j & 0x7F; (j & 0x80) == 128; i = i << 7 | j & 0x7F)
      j = paramm.f();
    return i;
  }

  private static final class a
  {
    public final List<byte[]> a;
    public final int b;
    public final float c;

    public a(List<byte[]> paramList, int paramInt, float paramFloat)
    {
      this.a = paramList;
      this.b = paramInt;
      this.c = paramFloat;
    }
  }

  private static final class b
  {
    public final int a;
    public int b;
    public int c;
    public long d;
    private final boolean e;
    private final m f;
    private final m g;
    private int h;
    private int i;

    public b(m paramm1, m paramm2, boolean paramBoolean)
    {
      this.g = paramm1;
      this.f = paramm2;
      this.e = paramBoolean;
      paramm2.b(12);
      this.a = paramm2.s();
      paramm1.b(12);
      this.i = paramm1.s();
      if (paramm1.m() == 1);
      for (paramBoolean = bool; ; paramBoolean = false)
      {
        org.vidogram.messenger.exoplayer.f.b.b(paramBoolean, "first_chunk must be 1");
        this.b = -1;
        return;
      }
    }

    public boolean a()
    {
      int j = this.b + 1;
      this.b = j;
      if (j == this.a)
        return false;
      long l;
      if (this.e)
      {
        l = this.f.u();
        this.d = l;
        if (this.b == this.h)
        {
          this.c = this.g.s();
          this.g.c(4);
          j = this.i - 1;
          this.i = j;
          if (j <= 0)
            break label116;
        }
      }
      label116: for (j = this.g.s() - 1; ; j = -1)
      {
        this.h = j;
        return true;
        l = this.f.k();
        break;
      }
    }
  }

  private static abstract interface c
  {
    public abstract int a();

    public abstract int b();

    public abstract boolean c();
  }

  private static final class d
  {
    public final j[] a;
    public MediaFormat b;
    public int c;

    public d(int paramInt)
    {
      this.a = new j[paramInt];
      this.c = -1;
    }
  }

  static final class e
    implements b.c
  {
    private final int a;
    private final int b;
    private final m c;

    public e(a.b paramb)
    {
      this.c = paramb.aK;
      this.c.b(12);
      this.a = this.c.s();
      this.b = this.c.s();
    }

    public int a()
    {
      return this.b;
    }

    public int b()
    {
      if (this.a == 0)
        return this.c.s();
      return this.a;
    }

    public boolean c()
    {
      return this.a != 0;
    }
  }

  static final class f
    implements b.c
  {
    private final m a;
    private final int b;
    private final int c;
    private int d;
    private int e;

    public f(a.b paramb)
    {
      this.a = paramb.aK;
      this.a.b(12);
      this.c = (this.a.s() & 0xFF);
      this.b = this.a.s();
    }

    public int a()
    {
      return this.b;
    }

    public int b()
    {
      if (this.c == 8)
        return this.a.f();
      if (this.c == 16)
        return this.a.g();
      int i = this.d;
      this.d = (i + 1);
      if (i % 2 == 0)
      {
        this.e = this.a.f();
        return (this.e & 0xF0) >> 4;
      }
      return this.e & 0xF;
    }

    public boolean c()
    {
      return false;
    }
  }

  private static final class g
  {
    private final int a;
    private final long b;
    private final int c;

    public g(int paramInt1, long paramLong, int paramInt2)
    {
      this.a = paramInt1;
      this.b = paramLong;
      this.c = paramInt2;
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.exoplayer.c.c.b
 * JD-Core Version:    0.6.0
 */