package org.vidogram.messenger.exoplayer.c.d;

import java.util.ArrayList;
import org.vidogram.messenger.exoplayer.MediaFormat;
import org.vidogram.messenger.exoplayer.c.g;
import org.vidogram.messenger.exoplayer.c.j;
import org.vidogram.messenger.exoplayer.c.l;

final class h extends f
  implements l
{
  private a e;
  private int g;
  private long h;
  private boolean i;
  private final d j = new d();
  private long k = -1L;
  private i.d l;
  private i.b m;
  private long n;
  private long o;
  private long p;
  private long q;

  private static int a(byte paramByte, a parama)
  {
    int i1 = e.a(paramByte, parama.e, 1);
    if (!parama.d[i1].a)
      return parama.a.g;
    return parama.a.h;
  }

  static void a(org.vidogram.messenger.exoplayer.f.m paramm, long paramLong)
  {
    paramm.a(paramm.c() + 4);
    paramm.a[(paramm.c() - 4)] = (byte)(int)(paramLong & 0xFF);
    paramm.a[(paramm.c() - 3)] = (byte)(int)(paramLong >>> 8 & 0xFF);
    paramm.a[(paramm.c() - 2)] = (byte)(int)(paramLong >>> 16 & 0xFF);
    paramm.a[(paramm.c() - 1)] = (byte)(int)(paramLong >>> 24 & 0xFF);
  }

  static boolean a(org.vidogram.messenger.exoplayer.f.m paramm)
  {
    try
    {
      boolean bool = i.a(1, paramm, true);
      return bool;
    }
    catch (org.vidogram.messenger.exoplayer.r paramm)
    {
    }
    return false;
  }

  public int a(org.vidogram.messenger.exoplayer.c.f paramf, j paramj)
  {
    long l1;
    if (this.p == 0L)
    {
      if (this.e == null)
      {
        this.n = paramf.d();
        this.e = a(paramf, this.a);
        this.o = paramf.c();
        this.d.a(this);
        if (this.n != -1L)
        {
          paramj.a = Math.max(0L, paramf.d() - 8000L);
          return 1;
        }
      }
      ArrayList localArrayList;
      if (this.n == -1L)
      {
        l1 = -1L;
        this.p = l1;
        localArrayList = new ArrayList();
        localArrayList.add(this.e.a.j);
        localArrayList.add(this.e.c);
        if (this.n != -1L)
          break label281;
        l1 = -1L;
      }
      while (true)
      {
        this.q = l1;
        this.c.a(MediaFormat.a(null, "audio/vorbis", this.e.a.e, 65025, this.q, this.e.a.b, (int)this.e.a.c, localArrayList, null));
        if (this.n == -1L)
          break label305;
        this.j.a(this.n - this.o, this.p);
        paramj.a = this.o;
        return 1;
        l1 = this.b.a(paramf);
        break;
        label281: l1 = this.p * 1000000L / this.e.a.c;
      }
    }
    label305: if ((!this.i) && (this.k > -1L))
    {
      e.a(paramf);
      l1 = this.j.a(this.k, paramf);
      if (l1 != -1L)
      {
        paramj.a = l1;
        return 1;
      }
      this.h = this.b.a(paramf, this.k);
      this.g = this.l.g;
      this.i = true;
    }
    if (this.b.a(paramf, this.a))
    {
      int i3;
      if ((this.a.a[0] & 0x1) != 1)
      {
        i3 = a(this.a.a[0], this.e);
        if (!this.i)
          break label583;
      }
      label583: int i2;
      for (int i1 = (this.g + i3) / 4; ; i2 = 0)
      {
        if (this.h + i1 >= this.k)
        {
          a(this.a, i1);
          l1 = this.h * 1000000L / this.e.a.c;
          this.c.a(this.a, this.a.c());
          this.c.a(l1, 1, this.a.c(), 0, null);
          this.k = -1L;
        }
        this.i = true;
        l1 = this.h;
        this.h = (i1 + l1);
        this.g = i3;
        this.a.a();
        return 0;
      }
    }
    return -1;
  }

  a a(org.vidogram.messenger.exoplayer.c.f paramf, org.vidogram.messenger.exoplayer.f.m paramm)
  {
    if (this.l == null)
    {
      this.b.a(paramf, paramm);
      this.l = i.a(paramm);
      paramm.a();
    }
    if (this.m == null)
    {
      this.b.a(paramf, paramm);
      this.m = i.b(paramm);
      paramm.a();
    }
    this.b.a(paramf, paramm);
    paramf = new byte[paramm.c()];
    System.arraycopy(paramm.a, 0, paramf, 0, paramm.c());
    i.c[] arrayOfc = i.a(paramm, this.l.b);
    int i1 = i.a(arrayOfc.length - 1);
    paramm.a();
    return new a(this.l, this.m, paramf, arrayOfc, i1);
  }

  public boolean a()
  {
    return (this.e != null) && (this.n != -1L);
  }

  public long b(long paramLong)
  {
    if (paramLong == 0L)
    {
      this.k = -1L;
      return this.o;
    }
    this.k = (this.e.a.c * paramLong / 1000000L);
    return Math.max(this.o, (this.n - this.o) * paramLong / this.q - 4000L);
  }

  public void b()
  {
    super.b();
    this.g = 0;
    this.h = 0L;
    this.i = false;
  }

  static final class a
  {
    public final i.d a;
    public final i.b b;
    public final byte[] c;
    public final i.c[] d;
    public final int e;

    public a(i.d paramd, i.b paramb, byte[] paramArrayOfByte, i.c[] paramArrayOfc, int paramInt)
    {
      this.a = paramd;
      this.b = paramb;
      this.c = paramArrayOfByte;
      this.d = paramArrayOfc;
      this.e = paramInt;
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.exoplayer.c.d.h
 * JD-Core Version:    0.6.0
 */