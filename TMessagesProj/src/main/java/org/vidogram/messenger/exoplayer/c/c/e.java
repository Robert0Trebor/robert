package org.vidogram.messenger.exoplayer.c.c;

import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import org.vidogram.messenger.exoplayer.c.f;
import org.vidogram.messenger.exoplayer.c.l;

public class e
  implements org.vidogram.messenger.exoplayer.c.e
{
  private static final int a = org.vidogram.messenger.exoplayer.f.r.c("seig");
  private static final byte[] b = { -94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12 };
  private final int c;
  private final i d;
  private final SparseArray<a> e;
  private final org.vidogram.messenger.exoplayer.f.m f;
  private final org.vidogram.messenger.exoplayer.f.m g;
  private final org.vidogram.messenger.exoplayer.f.m h;
  private final org.vidogram.messenger.exoplayer.f.m i;
  private final byte[] j;
  private final Stack<a.a> k;
  private int l;
  private int m;
  private long n;
  private int o;
  private org.vidogram.messenger.exoplayer.f.m p;
  private long q;
  private a r;
  private int s;
  private int t;
  private int u;
  private org.vidogram.messenger.exoplayer.c.g v;
  private boolean w;

  public e()
  {
    this(0);
  }

  public e(int paramInt)
  {
    this(paramInt, null);
  }

  public e(int paramInt, i parami)
  {
    this.d = parami;
    if (parami != null);
    for (int i1 = 4; ; i1 = 0)
    {
      this.c = (i1 | paramInt);
      this.i = new org.vidogram.messenger.exoplayer.f.m(16);
      this.f = new org.vidogram.messenger.exoplayer.f.m(org.vidogram.messenger.exoplayer.f.k.a);
      this.g = new org.vidogram.messenger.exoplayer.f.m(4);
      this.h = new org.vidogram.messenger.exoplayer.f.m(1);
      this.j = new byte[16];
      this.k = new Stack();
      this.e = new SparseArray();
      a();
      return;
    }
  }

  private int a(a parama)
  {
    k localk = parama.a;
    org.vidogram.messenger.exoplayer.f.m localm = localk.l;
    int i1 = localk.a.a;
    Object localObject;
    int i2;
    int i3;
    if (localk.n != null)
    {
      localObject = localk.n;
      i2 = ((j)localObject).b;
      i3 = localk.j[parama.e];
      localObject = this.h.a;
      if (i3 == 0)
        break label137;
    }
    label137: for (i1 = 128; ; i1 = 0)
    {
      localObject[0] = (byte)(i1 | i2);
      this.h.b(0);
      parama = parama.b;
      parama.a(this.h, 1);
      parama.a(localm, i2);
      if (i3 != 0)
        break label142;
      return i2 + 1;
      localObject = parama.c.l[i1];
      break;
    }
    label142: i1 = localm.g();
    localm.c(-2);
    i1 = i1 * 6 + 2;
    parama.a(localm, i1);
    return i2 + 1 + i1;
  }

  private static Pair<Integer, c> a(org.vidogram.messenger.exoplayer.f.m paramm)
  {
    paramm.b(12);
    return Pair.create(Integer.valueOf(paramm.m()), new c(paramm.s() - 1, paramm.s(), paramm.s(), paramm.m()));
  }

  private static a a(SparseArray<a> paramSparseArray)
  {
    Object localObject = null;
    long l1 = 9223372036854775807L;
    int i2 = paramSparseArray.size();
    int i1 = 0;
    a locala;
    if (i1 < i2)
    {
      locala = (a)paramSparseArray.valueAt(i1);
      if (locala.e != locala.a.d);
    }
    while (true)
    {
      i1 += 1;
      break;
      long l2 = locala.a.b;
      if (l2 < l1)
      {
        localObject = locala;
        l1 = l2;
        continue;
        return localObject;
      }
    }
  }

  private static a a(org.vidogram.messenger.exoplayer.f.m paramm, SparseArray<a> paramSparseArray, int paramInt)
  {
    paramm.b(8);
    int i3 = a.b(paramm.m());
    int i1 = paramm.m();
    if ((paramInt & 0x4) == 0);
    for (paramInt = i1; ; paramInt = 0)
    {
      paramSparseArray = (a)paramSparseArray.get(paramInt);
      if (paramSparseArray != null)
        break;
      return null;
    }
    if ((i3 & 0x1) != 0)
    {
      long l1 = paramm.u();
      paramSparseArray.a.b = l1;
      paramSparseArray.a.c = l1;
    }
    c localc = paramSparseArray.d;
    label112: int i2;
    if ((i3 & 0x2) != 0)
    {
      paramInt = paramm.s() - 1;
      if ((i3 & 0x8) == 0)
        break label171;
      i1 = paramm.s();
      if ((i3 & 0x10) == 0)
        break label180;
      i2 = paramm.s();
      label126: if ((i3 & 0x20) == 0)
        break label190;
    }
    label171: label180: label190: for (i3 = paramm.s(); ; i3 = localc.d)
    {
      paramSparseArray.a.a = new c(paramInt, i1, i2, i3);
      return paramSparseArray;
      paramInt = localc.a;
      break;
      i1 = localc.b;
      break label112;
      i2 = localc.c;
      break label126;
    }
  }

  private void a()
  {
    this.l = 0;
    this.o = 0;
  }

  private void a(long paramLong)
  {
    while ((!this.k.isEmpty()) && (((a.a)this.k.peek()).aK == paramLong))
      a((a.a)this.k.pop());
    a();
  }

  private void a(a.a parama)
  {
    if (parama.aJ == a.A)
      b(parama);
    do
    {
      return;
      if (parama.aJ != a.J)
        continue;
      c(parama);
      return;
    }
    while (this.k.isEmpty());
    ((a.a)this.k.peek()).a(parama);
  }

  private static void a(a.a parama, SparseArray<a> paramSparseArray, int paramInt, byte[] paramArrayOfByte)
  {
    int i2 = parama.aM.size();
    int i1 = 0;
    while (i1 < i2)
    {
      a.a locala = (a.a)parama.aM.get(i1);
      if (locala.aJ == a.K)
        b(locala, paramSparseArray, paramInt, paramArrayOfByte);
      i1 += 1;
    }
  }

  private void a(a.b paramb, long paramLong)
  {
    if (!this.k.isEmpty())
      ((a.a)this.k.peek()).a(paramb);
    do
    {
      return;
      if (paramb.aJ != a.z)
        continue;
      paramb = b(paramb.aK, paramLong);
      this.v.a(paramb);
      this.w = true;
      return;
    }
    while (paramb.aJ != a.aE);
    a(paramb.aK, paramLong);
  }

  private static void a(a parama, long paramLong, int paramInt, org.vidogram.messenger.exoplayer.f.m paramm)
  {
    paramm.b(8);
    int i6 = a.b(paramm.m());
    i locali = parama.c;
    parama = parama.a;
    c localc = parama.a;
    int i11 = paramm.s();
    if ((i6 & 0x1) != 0)
      parama.b += paramm.m();
    int i2;
    int i1;
    int i3;
    label104: int i4;
    label116: int i5;
    label128: label140: long l1;
    if ((i6 & 0x4) != 0)
    {
      i2 = 1;
      i1 = localc.d;
      if (i2 != 0)
        i1 = paramm.s();
      if ((i6 & 0x100) == 0)
        break label396;
      i3 = 1;
      if ((i6 & 0x200) == 0)
        break label402;
      i4 = 1;
      if ((i6 & 0x400) == 0)
        break label408;
      i5 = 1;
      if ((i6 & 0x800) == 0)
        break label414;
      i6 = 1;
      if ((locali.m == null) || (locali.m.length != 1) || (locali.m[0] != 0L))
        break label490;
      l1 = org.vidogram.messenger.exoplayer.f.r.a(locali.n[0], 1000L, locali.h);
    }
    while (true)
    {
      parama.a(i11);
      int[] arrayOfInt1 = parama.e;
      int[] arrayOfInt2 = parama.f;
      long[] arrayOfLong = parama.g;
      boolean[] arrayOfBoolean = parama.h;
      long l2 = locali.h;
      int i7;
      label247: int i8;
      label250: int i9;
      label269: int i10;
      if ((locali.g == i.a) && ((paramInt & 0x1) != 0))
      {
        i7 = 1;
        i8 = 0;
        if (i8 >= i11)
          break label484;
        if (i3 == 0)
          break label426;
        i9 = paramm.s();
        if (i4 == 0)
          break label436;
        i10 = paramm.s();
        label281: if ((i8 != 0) || (i2 == 0))
          break label446;
        paramInt = i1;
        label294: if (i6 == 0)
          break label469;
        arrayOfInt2[i8] = (int)(paramm.m() * 1000 / l2);
        label318: arrayOfLong[i8] = (org.vidogram.messenger.exoplayer.f.r.a(paramLong, 1000L, l2) - l1);
        arrayOfInt1[i8] = i10;
        if (((paramInt >> 16 & 0x1) != 0) || ((i7 != 0) && (i8 != 0)))
          break label478;
      }
      label396: label402: label408: label414: label426: label436: label446: label469: label478: for (int i12 = 1; ; i12 = 0)
      {
        arrayOfBoolean[i8] = i12;
        long l3 = i9;
        i8 += 1;
        paramLong += l3;
        break label250;
        i2 = 0;
        break;
        i3 = 0;
        break label104;
        i4 = 0;
        break label116;
        i5 = 0;
        break label128;
        i6 = 0;
        break label140;
        i7 = 0;
        break label247;
        i9 = localc.b;
        break label269;
        i10 = localc.c;
        break label281;
        if (i5 != 0)
        {
          paramInt = paramm.m();
          break label294;
        }
        paramInt = localc.d;
        break label294;
        arrayOfInt2[i8] = 0;
        break label318;
      }
      label484: parama.o = paramLong;
      return;
      label490: l1 = 0L;
    }
  }

  private static void a(j paramj, org.vidogram.messenger.exoplayer.f.m paramm, k paramk)
  {
    boolean bool = true;
    int i5 = paramj.b;
    paramm.b(8);
    if ((a.b(paramm.m()) & 0x1) == 1)
      paramm.c(8);
    int i1 = paramm.f();
    int i4 = paramm.s();
    if (i4 != paramk.d)
      throw new org.vidogram.messenger.exoplayer.r("Length mismatch: " + i4 + ", " + paramk.d);
    int i3;
    if (i1 == 0)
    {
      paramj = paramk.j;
      int i2 = 0;
      i1 = 0;
      i3 = i1;
      if (i2 < i4)
      {
        i3 = paramm.f();
        if (i3 > i5);
        for (bool = true; ; bool = false)
        {
          paramj[i2] = bool;
          i2 += 1;
          i1 += i3;
          break;
        }
      }
    }
    else
    {
      if (i1 <= i5)
        break label195;
    }
    while (true)
    {
      i3 = i1 * i4 + 0;
      Arrays.fill(paramk.j, 0, i4, bool);
      paramk.b(i3);
      return;
      label195: bool = false;
    }
  }

  private static void a(org.vidogram.messenger.exoplayer.f.m paramm, int paramInt, k paramk)
  {
    paramm.b(paramInt + 8);
    paramInt = a.b(paramm.m());
    if ((paramInt & 0x1) != 0)
      throw new org.vidogram.messenger.exoplayer.r("Overriding TrackEncryptionBox parameters is unsupported.");
    if ((paramInt & 0x2) != 0);
    for (boolean bool = true; ; bool = false)
    {
      paramInt = paramm.s();
      if (paramInt == paramk.d)
        break;
      throw new org.vidogram.messenger.exoplayer.r("Length mismatch: " + paramInt + ", " + paramk.d);
    }
    Arrays.fill(paramk.j, 0, paramInt, bool);
    paramk.b(paramm.b());
    paramk.a(paramm);
  }

  private static void a(org.vidogram.messenger.exoplayer.f.m paramm, k paramk)
  {
    paramm.b(8);
    int i1 = paramm.m();
    if ((a.b(i1) & 0x1) == 1)
      paramm.c(8);
    int i2 = paramm.s();
    if (i2 != 1)
      throw new org.vidogram.messenger.exoplayer.r("Unexpected saio entry count: " + i2);
    i1 = a.a(i1);
    long l2 = paramk.c;
    long l1;
    if (i1 == 0)
      l1 = paramm.k();
    while (true)
    {
      paramk.c = (l1 + l2);
      return;
      l1 = paramm.u();
    }
  }

  private static void a(org.vidogram.messenger.exoplayer.f.m paramm, k paramk, byte[] paramArrayOfByte)
  {
    paramm.b(8);
    paramm.a(paramArrayOfByte, 0, 16);
    if (!Arrays.equals(paramArrayOfByte, b))
      return;
    a(paramm, 16, paramk);
  }

  private static void a(org.vidogram.messenger.exoplayer.f.m paramm1, org.vidogram.messenger.exoplayer.f.m paramm2, k paramk)
  {
    paramm1.b(8);
    int i1 = paramm1.m();
    if (paramm1.m() != a);
    while (true)
    {
      return;
      if (a.a(i1) == 1)
        paramm1.c(4);
      if (paramm1.m() != 1)
        throw new org.vidogram.messenger.exoplayer.r("Entry count in sbgp != 1 (unsupported).");
      paramm2.b(8);
      i1 = paramm2.m();
      if (paramm2.m() != a)
        continue;
      i1 = a.a(i1);
      if (i1 == 1)
      {
        if (paramm2.k() == 0L)
          throw new org.vidogram.messenger.exoplayer.r("Variable length decription in sgpd found (unsupported)");
      }
      else if (i1 >= 2)
        paramm2.c(4);
      if (paramm2.k() != 1L)
        throw new org.vidogram.messenger.exoplayer.r("Entry count in sgpd != 1 (unsupported).");
      paramm2.c(2);
      if (paramm2.f() == 1);
      for (boolean bool = true; bool; bool = false)
      {
        i1 = paramm2.f();
        paramm1 = new byte[16];
        paramm2.a(paramm1, 0, paramm1.length);
        paramk.i = true;
        paramk.n = new j(bool, i1, paramm1);
        return;
      }
    }
  }

  private static boolean a(int paramInt)
  {
    return (paramInt == a.R) || (paramInt == a.Q) || (paramInt == a.B) || (paramInt == a.z) || (paramInt == a.S) || (paramInt == a.v) || (paramInt == a.w) || (paramInt == a.N) || (paramInt == a.x) || (paramInt == a.y) || (paramInt == a.T) || (paramInt == a.ab) || (paramInt == a.ac) || (paramInt == a.ag) || (paramInt == a.ad) || (paramInt == a.ae) || (paramInt == a.af) || (paramInt == a.P) || (paramInt == a.M) || (paramInt == a.aE);
  }

  private static long b(org.vidogram.messenger.exoplayer.f.m paramm)
  {
    paramm.b(8);
    if (a.a(paramm.m()) == 0)
      return paramm.k();
    return paramm.u();
  }

  private static org.vidogram.messenger.exoplayer.c.a b(org.vidogram.messenger.exoplayer.f.m paramm, long paramLong)
  {
    paramm.b(8);
    int i1 = a.a(paramm.m());
    paramm.c(4);
    long l4 = paramm.k();
    long l1;
    long l2;
    int i2;
    int[] arrayOfInt;
    long[] arrayOfLong1;
    long[] arrayOfLong2;
    long[] arrayOfLong3;
    long l3;
    if (i1 == 0)
    {
      l1 = paramm.k();
      l2 = paramm.k() + paramLong;
      paramLong = l1;
      l1 = l2;
      paramm.c(2);
      i2 = paramm.g();
      arrayOfInt = new int[i2];
      arrayOfLong1 = new long[i2];
      arrayOfLong2 = new long[i2];
      arrayOfLong3 = new long[i2];
      l3 = org.vidogram.messenger.exoplayer.f.r.a(paramLong, 1000000L, l4);
      i1 = 0;
      l2 = paramLong;
      paramLong = l1;
      l1 = l3;
    }
    while (true)
    {
      if (i1 >= i2)
        break label237;
      int i3 = paramm.m();
      if ((0x80000000 & i3) != 0)
      {
        throw new org.vidogram.messenger.exoplayer.r("Unhandled indirect reference");
        l2 = paramm.u();
        l1 = paramm.u() + paramLong;
        paramLong = l2;
        break;
      }
      l3 = paramm.k();
      arrayOfInt[i1] = (i3 & 0x7FFFFFFF);
      arrayOfLong1[i1] = paramLong;
      arrayOfLong3[i1] = l1;
      l2 += l3;
      l1 = org.vidogram.messenger.exoplayer.f.r.a(l2, 1000000L, l4);
      arrayOfLong2[i1] = (l1 - arrayOfLong3[i1]);
      paramm.c(4);
      paramLong += arrayOfInt[i1];
      i1 += 1;
    }
    label237: return new org.vidogram.messenger.exoplayer.c.a(arrayOfInt, arrayOfLong1, arrayOfLong2, arrayOfLong3);
  }

  private void b(a.a parama)
  {
    boolean bool2 = true;
    Object localObject3;
    if (this.d == null)
    {
      bool1 = true;
      org.vidogram.messenger.exoplayer.f.b.b(bool1, "Unexpected moov box.");
      localObject3 = parama.aL;
      i2 = ((List)localObject3).size();
      localObject1 = null;
      i1 = 0;
      label40: if (i1 >= i2)
        break label161;
      a.b localb = (a.b)((List)localObject3).get(i1);
      localObject2 = localObject1;
      if (localb.aJ == a.T)
      {
        localObject2 = localObject1;
        if (localObject1 == null)
          localObject2 = new org.vidogram.messenger.exoplayer.b.a.a();
        localObject1 = localb.aK.a;
        if (g.a(localObject1) != null)
          break label136;
        Log.w("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
      }
    }
    while (true)
    {
      i1 += 1;
      localObject1 = localObject2;
      break label40;
      bool1 = false;
      break;
      label136: ((org.vidogram.messenger.exoplayer.b.a.a)localObject2).a(g.a(localObject1), new org.vidogram.messenger.exoplayer.b.a.b("video/mp4", localObject1));
    }
    label161: if (localObject1 != null)
      this.v.a((org.vidogram.messenger.exoplayer.b.a)localObject1);
    Object localObject2 = parama.e(a.L);
    Object localObject1 = new SparseArray();
    long l1 = -1L;
    int i2 = ((a.a)localObject2).aL.size();
    int i1 = 0;
    if (i1 < i2)
    {
      localObject3 = (a.b)((a.a)localObject2).aL.get(i1);
      if (((a.b)localObject3).aJ == a.x)
      {
        localObject3 = a(((a.b)localObject3).aK);
        ((SparseArray)localObject1).put(((Integer)((Pair)localObject3).first).intValue(), ((Pair)localObject3).second);
      }
      while (true)
      {
        i1 += 1;
        break;
        if (((a.b)localObject3).aJ != a.M)
          continue;
        l1 = b(((a.b)localObject3).aK);
      }
    }
    localObject2 = new SparseArray();
    i2 = parama.aM.size();
    i1 = 0;
    while (i1 < i2)
    {
      localObject3 = (a.a)parama.aM.get(i1);
      if (((a.a)localObject3).aJ == a.C)
      {
        localObject3 = b.a((a.a)localObject3, parama.d(a.B), l1, false);
        if (localObject3 != null)
          ((SparseArray)localObject2).put(((i)localObject3).f, localObject3);
      }
      i1 += 1;
    }
    i2 = ((SparseArray)localObject2).size();
    if (this.e.size() == 0)
    {
      i1 = 0;
      while (i1 < i2)
      {
        this.e.put(((i)((SparseArray)localObject2).valueAt(i1)).f, new a(this.v.d(i1)));
        i1 += 1;
      }
      this.v.f();
      i1 = 0;
      while (i1 < i2)
      {
        parama = (i)((SparseArray)localObject2).valueAt(i1);
        ((a)this.e.get(parama.f)).a(parama, (c)((SparseArray)localObject1).get(parama.f));
        i1 += 1;
      }
    }
    if (this.e.size() == i2);
    for (boolean bool1 = bool2; ; bool1 = false)
    {
      org.vidogram.messenger.exoplayer.f.b.b(bool1);
      break;
    }
  }

  private static void b(a.a parama, SparseArray<a> paramSparseArray, int paramInt, byte[] paramArrayOfByte)
  {
    if (parama.f(a.y) != 1)
      throw new org.vidogram.messenger.exoplayer.r("Trun count in traf != 1 (unsupported).");
    Object localObject = a(parama.d(a.w).aK, paramSparseArray, paramInt);
    if (localObject == null);
    while (true)
    {
      return;
      paramSparseArray = ((a)localObject).a;
      long l2 = paramSparseArray.o;
      ((a)localObject).a();
      long l1 = l2;
      if (parama.d(a.v) != null)
      {
        l1 = l2;
        if ((paramInt & 0x2) == 0)
          l1 = c(parama.d(a.v).aK);
      }
      a((a)localObject, l1, paramInt, parama.d(a.y).aK);
      a.b localb = parama.d(a.ab);
      if (localb != null)
        a(localObject.c.l[paramSparseArray.a.a], localb.aK, paramSparseArray);
      localObject = parama.d(a.ac);
      if (localObject != null)
        a(((a.b)localObject).aK, paramSparseArray);
      localObject = parama.d(a.ag);
      if (localObject != null)
        b(((a.b)localObject).aK, paramSparseArray);
      localObject = parama.d(a.ad);
      localb = parama.d(a.ae);
      if ((localObject != null) && (localb != null))
        a(((a.b)localObject).aK, localb.aK, paramSparseArray);
      int i1 = parama.aL.size();
      paramInt = 0;
      while (paramInt < i1)
      {
        localObject = (a.b)parama.aL.get(paramInt);
        if (((a.b)localObject).aJ == a.af)
          a(((a.b)localObject).aK, paramSparseArray, paramArrayOfByte);
        paramInt += 1;
      }
    }
  }

  private static void b(org.vidogram.messenger.exoplayer.f.m paramm, k paramk)
  {
    a(paramm, 0, paramk);
  }

  private static boolean b(int paramInt)
  {
    return (paramInt == a.A) || (paramInt == a.C) || (paramInt == a.D) || (paramInt == a.E) || (paramInt == a.F) || (paramInt == a.J) || (paramInt == a.K) || (paramInt == a.L) || (paramInt == a.O);
  }

  private boolean b(f paramf)
  {
    if (this.o == 0)
    {
      if (!paramf.a(this.i.a, 0, 8, true))
        return false;
      this.o = 8;
      this.i.b(0);
      this.n = this.i.k();
      this.m = this.i.m();
    }
    if (this.n == 1L)
    {
      paramf.b(this.i.a, 8, 8);
      this.o += 8;
      this.n = this.i.u();
    }
    long l1 = paramf.c() - this.o;
    if (this.m == a.J)
    {
      int i2 = this.e.size();
      int i1 = 0;
      while (i1 < i2)
      {
        k localk = ((a)this.e.valueAt(i1)).a;
        localk.c = l1;
        localk.b = l1;
        i1 += 1;
      }
    }
    if (this.m == a.h)
    {
      this.r = null;
      this.q = (this.n + l1);
      if (!this.w)
      {
        this.v.a(l.f);
        this.w = true;
      }
      this.l = 2;
      return true;
    }
    if (b(this.m))
    {
      l1 = paramf.c() + this.n - 8L;
      this.k.add(new a.a(this.m, l1));
      if (this.n == this.o)
        a(l1);
    }
    while (true)
    {
      return true;
      a();
      continue;
      if (a(this.m))
      {
        if (this.o != 8)
          throw new org.vidogram.messenger.exoplayer.r("Leaf atom defines extended atom size (unsupported).");
        if (this.n > 2147483647L)
          throw new org.vidogram.messenger.exoplayer.r("Leaf atom with length > 2147483647 (unsupported).");
        this.p = new org.vidogram.messenger.exoplayer.f.m((int)this.n);
        System.arraycopy(this.i.a, 0, this.p.a, 0, 8);
        this.l = 1;
        continue;
      }
      if (this.n > 2147483647L)
        throw new org.vidogram.messenger.exoplayer.r("Skipping atom with length > 2147483647 (unsupported).");
      this.p = null;
      this.l = 1;
    }
  }

  private static long c(org.vidogram.messenger.exoplayer.f.m paramm)
  {
    paramm.b(8);
    if (a.a(paramm.m()) == 1)
      return paramm.u();
    return paramm.k();
  }

  private void c(a.a parama)
  {
    a(parama, this.e, this.c, this.j);
  }

  private void c(f paramf)
  {
    int i1 = (int)this.n - this.o;
    if (this.p != null)
    {
      paramf.b(this.p.a, 8, i1);
      a(new a.b(this.m, this.p), paramf.c());
    }
    while (true)
    {
      a(paramf.c());
      return;
      paramf.b(i1);
    }
  }

  private void d(f paramf)
  {
    a locala = null;
    long l1 = 9223372036854775807L;
    int i2 = this.e.size();
    int i1 = 0;
    if (i1 < i2)
    {
      k localk = ((a)this.e.valueAt(i1)).a;
      if ((!localk.m) || (localk.c >= l1))
        break label139;
      l1 = localk.c;
      locala = (a)this.e.valueAt(i1);
    }
    label139: 
    while (true)
    {
      i1 += 1;
      break;
      if (locala == null)
      {
        this.l = 3;
        return;
      }
      i1 = (int)(l1 - paramf.c());
      if (i1 < 0)
        throw new org.vidogram.messenger.exoplayer.r("Offset to encryption data was negative.");
      paramf.b(i1);
      locala.a.a(paramf);
      return;
    }
  }

  private boolean e(f paramf)
  {
    int i1 = 2;
    int i2;
    k localk;
    i locali;
    org.vidogram.messenger.exoplayer.c.m localm;
    int i3;
    int i4;
    if (this.l == 3)
    {
      if (this.r == null)
      {
        this.r = a(this.e);
        if (this.r == null)
        {
          i1 = (int)(this.q - paramf.c());
          if (i1 < 0)
            throw new org.vidogram.messenger.exoplayer.r("Offset to end of mdat was negative.");
          paramf.b(i1);
          a();
          return false;
        }
        i2 = (int)(this.r.a.b - paramf.c());
        if (i2 < 0)
          throw new org.vidogram.messenger.exoplayer.r("Offset to sample data was negative.");
        paramf.b(i2);
      }
      this.s = this.r.a.e[this.r.e];
      if (this.r.a.i)
      {
        this.t = a(this.r);
        this.s += this.t;
        this.l = 4;
        this.u = 0;
      }
    }
    else
    {
      localk = this.r.a;
      locali = this.r.c;
      localm = this.r.b;
      i2 = this.r.e;
      if (locali.o == -1)
        break label417;
      byte[] arrayOfByte = this.g.a;
      arrayOfByte[0] = 0;
      arrayOfByte[1] = 0;
      arrayOfByte[2] = 0;
      i3 = locali.o;
      i4 = 4 - locali.o;
    }
    while (true)
    {
      if (this.t >= this.s)
        break label458;
      if (this.u == 0)
      {
        paramf.b(this.g.a, i4, i3);
        this.g.b(0);
        this.u = this.g.s();
        this.f.b(0);
        localm.a(this.f, 4);
        this.t += 4;
        this.s += i4;
        continue;
        this.t = 0;
        break;
      }
      int i5 = localm.a(paramf, this.u, false);
      this.t += i5;
      this.u -= i5;
    }
    label417: 
    while (this.t < this.s)
      this.t = (localm.a(paramf, this.s - this.t, false) + this.t);
    label458: long l1 = localk.c(i2);
    if (localk.i)
    {
      if (localk.h[i2] == 0)
        break label592;
      i2 = 1;
      label486: i3 = localk.a.a;
      paramf = null;
      if (localk.i)
        if (localk.n == null)
          break label597;
    }
    label592: label597: for (paramf = localk.n.c; ; paramf = locali.l[i3].c)
    {
      localm.a(l1 * 1000L, i2 | i1, this.s, 0, paramf);
      paramf = this.r;
      paramf.e += 1;
      if (this.r.e == localk.d)
        this.r = null;
      this.l = 3;
      return true;
      i1 = 0;
      break;
      i2 = 0;
      break label486;
    }
  }

  public final int a(f paramf, org.vidogram.messenger.exoplayer.c.j paramj)
  {
    while (true)
    {
      switch (this.l)
      {
      default:
        if (!e(paramf))
          continue;
        return 0;
      case 0:
        if (b(paramf))
          continue;
        return -1;
      case 1:
        c(paramf);
        break;
      case 2:
      }
      d(paramf);
    }
  }

  public final void a(org.vidogram.messenger.exoplayer.c.g paramg)
  {
    this.v = paramg;
    if (this.d != null)
    {
      paramg = new a(paramg.d(0));
      paramg.a(this.d, new c(0, 0, 0, 0));
      this.e.put(0, paramg);
      this.v.f();
    }
  }

  protected void a(org.vidogram.messenger.exoplayer.f.m paramm, long paramLong)
  {
  }

  public final boolean a(f paramf)
  {
    return h.a(paramf);
  }

  public final void b()
  {
    int i2 = this.e.size();
    int i1 = 0;
    while (i1 < i2)
    {
      ((a)this.e.valueAt(i1)).a();
      i1 += 1;
    }
    this.k.clear();
    a();
  }

  public final void c()
  {
  }

  private static final class a
  {
    public final k a = new k();
    public final org.vidogram.messenger.exoplayer.c.m b;
    public i c;
    public c d;
    public int e;

    public a(org.vidogram.messenger.exoplayer.c.m paramm)
    {
      this.b = paramm;
    }

    public void a()
    {
      this.a.a();
      this.e = 0;
    }

    public void a(i parami, c paramc)
    {
      this.c = ((i)org.vidogram.messenger.exoplayer.f.b.a(parami));
      this.d = ((c)org.vidogram.messenger.exoplayer.f.b.a(paramc));
      this.b.a(parami.k);
      a();
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.exoplayer.c.c.e
 * JD-Core Version:    0.6.0
 */