package org.vidogram.messenger.exoplayer.c.c;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import org.vidogram.messenger.exoplayer.MediaFormat;
import org.vidogram.messenger.exoplayer.c.e;
import org.vidogram.messenger.exoplayer.c.g;
import org.vidogram.messenger.exoplayer.c.j;
import org.vidogram.messenger.exoplayer.f.k;
import org.vidogram.messenger.exoplayer.f.r;

public final class f
  implements e, org.vidogram.messenger.exoplayer.c.l
{
  private static final int a = r.c("qt  ");
  private final org.vidogram.messenger.exoplayer.f.m b = new org.vidogram.messenger.exoplayer.f.m(k.a);
  private final org.vidogram.messenger.exoplayer.f.m c = new org.vidogram.messenger.exoplayer.f.m(4);
  private final org.vidogram.messenger.exoplayer.f.m d = new org.vidogram.messenger.exoplayer.f.m(16);
  private final Stack<a.a> e = new Stack();
  private int g;
  private int h;
  private long i;
  private int j;
  private org.vidogram.messenger.exoplayer.f.m k;
  private int l;
  private int m;
  private int n;
  private g o;
  private a[] p;
  private boolean q;

  public f()
  {
    d();
  }

  private void a(long paramLong)
  {
    while ((!this.e.isEmpty()) && (((a.a)this.e.peek()).aK == paramLong))
    {
      a.a locala = (a.a)this.e.pop();
      if (locala.aJ == a.A)
      {
        a(locala);
        this.e.clear();
        this.g = 3;
        continue;
      }
      if (this.e.isEmpty())
        continue;
      ((a.a)this.e.peek()).a(locala);
    }
    if (this.g != 3)
      d();
  }

  private void a(a.a parama)
  {
    ArrayList localArrayList = new ArrayList();
    long l1 = 9223372036854775807L;
    Object localObject1 = parama.d(a.ay);
    if (localObject1 != null);
    for (localObject1 = b.a((a.b)localObject1, this.q); ; localObject1 = null)
    {
      int i1 = 0;
      if (i1 < parama.aM.size())
      {
        Object localObject3 = (a.a)parama.aM.get(i1);
        long l2;
        if (((a.a)localObject3).aJ != a.C)
          l2 = l1;
        while (true)
        {
          i1 += 1;
          l1 = l2;
          break;
          Object localObject2 = b.a((a.a)localObject3, parama.d(a.B), -1L, this.q);
          l2 = l1;
          if (localObject2 == null)
            continue;
          l locall = b.a((i)localObject2, ((a.a)localObject3).e(a.D).e(a.E).e(a.F));
          l2 = l1;
          if (locall.a == 0)
            continue;
          a locala = new a((i)localObject2, locall, this.o.d(i1));
          int i2 = locall.d;
          localObject3 = ((i)localObject2).k.a(i2 + 30);
          localObject2 = localObject3;
          if (localObject1 != null)
            localObject2 = ((MediaFormat)localObject3).a(((org.vidogram.messenger.exoplayer.c.i)localObject1).a, ((org.vidogram.messenger.exoplayer.c.i)localObject1).b);
          locala.c.a((MediaFormat)localObject2);
          localArrayList.add(locala);
          long l3 = locall.b[0];
          l2 = l1;
          if (l3 >= l1)
            continue;
          l2 = l3;
        }
      }
      this.p = ((a[])localArrayList.toArray(new a[0]));
      this.o.f();
      this.o.a(this);
      return;
    }
  }

  private static boolean a(int paramInt)
  {
    return (paramInt == a.Q) || (paramInt == a.B) || (paramInt == a.R) || (paramInt == a.S) || (paramInt == a.al) || (paramInt == a.am) || (paramInt == a.an) || (paramInt == a.P) || (paramInt == a.ao) || (paramInt == a.ap) || (paramInt == a.aq) || (paramInt == a.ar) || (paramInt == a.as) || (paramInt == a.N) || (paramInt == a.a) || (paramInt == a.ay);
  }

  private static boolean a(org.vidogram.messenger.exoplayer.f.m paramm)
  {
    paramm.b(8);
    if (paramm.m() == a)
      return true;
    paramm.c(4);
    while (paramm.b() > 0)
      if (paramm.m() == a)
        return true;
    return false;
  }

  private static boolean b(int paramInt)
  {
    return (paramInt == a.A) || (paramInt == a.C) || (paramInt == a.D) || (paramInt == a.E) || (paramInt == a.F) || (paramInt == a.O);
  }

  private boolean b(org.vidogram.messenger.exoplayer.c.f paramf)
  {
    if (this.j == 0)
    {
      if (!paramf.a(this.d.a, 0, 8, true))
        return false;
      this.j = 8;
      this.d.b(0);
      this.i = this.d.k();
      this.h = this.d.m();
    }
    if (this.i == 1L)
    {
      paramf.b(this.d.a, 8, 8);
      this.j += 8;
      this.i = this.d.u();
    }
    if (b(this.h))
    {
      long l1 = paramf.c() + this.i - this.j;
      this.e.add(new a.a(this.h, l1));
      if (this.i == this.j)
        a(l1);
    }
    while (true)
    {
      return true;
      d();
      continue;
      if (a(this.h))
      {
        if (this.j == 8)
        {
          bool = true;
          label210: org.vidogram.messenger.exoplayer.f.b.b(bool);
          if (this.i > 2147483647L)
            break label285;
        }
        label285: for (boolean bool = true; ; bool = false)
        {
          org.vidogram.messenger.exoplayer.f.b.b(bool);
          this.k = new org.vidogram.messenger.exoplayer.f.m((int)this.i);
          System.arraycopy(this.d.a, 0, this.k.a, 0, 8);
          this.g = 2;
          break;
          bool = false;
          break label210;
        }
      }
      this.k = null;
      this.g = 2;
    }
  }

  private boolean b(org.vidogram.messenger.exoplayer.c.f paramf, j paramj)
  {
    long l1 = this.i - this.j;
    long l2 = paramf.c();
    int i1;
    if (this.k != null)
    {
      paramf.b(this.k.a, this.j, (int)l1);
      if (this.h == a.a)
      {
        this.q = a(this.k);
        i1 = 0;
      }
    }
    while (true)
    {
      a(l2 + l1);
      if ((i1 != 0) && (this.g != 3))
      {
        return true;
        if (!this.e.isEmpty())
        {
          ((a.a)this.e.peek()).a(new a.b(this.h, this.k));
          i1 = 0;
          continue;
          if (l1 < 262144L)
          {
            paramf.b((int)l1);
            i1 = 0;
            continue;
          }
          paramj.a = (l1 + paramf.c());
          i1 = 1;
          continue;
        }
      }
      else
      {
        return false;
      }
      i1 = 0;
    }
  }

  private int c(org.vidogram.messenger.exoplayer.c.f paramf, j paramj)
  {
    int i1 = e();
    if (i1 == -1)
      return -1;
    a locala = this.p[i1];
    org.vidogram.messenger.exoplayer.c.m localm = locala.c;
    i1 = locala.d;
    long l1 = locala.b.b[i1];
    long l2 = l1 - paramf.c() + this.m;
    if ((l2 < 0L) || (l2 >= 262144L))
    {
      paramj.a = l1;
      return 1;
    }
    paramf.b((int)l2);
    this.l = locala.b.c[i1];
    int i2;
    if (locala.a.o != -1)
    {
      paramj = this.c.a;
      paramj[0] = 0;
      paramj[1] = 0;
      paramj[2] = 0;
      i2 = locala.a.o;
      int i3 = 4 - locala.a.o;
      while (this.m < this.l)
      {
        if (this.n == 0)
        {
          paramf.b(this.c.a, i3, i2);
          this.c.b(0);
          this.n = this.c.s();
          this.b.b(0);
          localm.a(this.b, 4);
          this.m += 4;
          this.l += i3;
          continue;
        }
        int i4 = localm.a(paramf, this.n, false);
        this.m += i4;
        this.n -= i4;
      }
    }
    while (this.m < this.l)
    {
      i2 = localm.a(paramf, this.l - this.m, false);
      this.m += i2;
      this.n -= i2;
    }
    localm.a(locala.b.e[i1], locala.b.f[i1], this.l, 0, null);
    locala.d += 1;
    this.m = 0;
    this.n = 0;
    return 0;
  }

  private void d()
  {
    this.g = 1;
    this.j = 0;
  }

  private int e()
  {
    int i2 = -1;
    long l1 = 9223372036854775807L;
    int i1 = 0;
    if (i1 < this.p.length)
    {
      a locala = this.p[i1];
      int i3 = locala.d;
      long l2;
      if (i3 == locala.b.a)
        l2 = l1;
      while (true)
      {
        i1 += 1;
        l1 = l2;
        break;
        long l3 = locala.b.b[i3];
        l2 = l1;
        if (l3 >= l1)
          continue;
        l2 = l3;
        i2 = i1;
      }
    }
    return i2;
  }

  public int a(org.vidogram.messenger.exoplayer.c.f paramf, j paramj)
  {
    do
    {
      do
        while (true)
          switch (this.g)
          {
          default:
            return c(paramf, paramj);
          case 0:
            if (paramf.c() == 0L)
            {
              d();
              continue;
            }
            this.g = 3;
          case 1:
          case 2:
          }
      while (b(paramf));
      return -1;
    }
    while (!b(paramf, paramj));
    return 1;
  }

  public void a(g paramg)
  {
    this.o = paramg;
  }

  public boolean a()
  {
    return true;
  }

  public boolean a(org.vidogram.messenger.exoplayer.c.f paramf)
  {
    return h.b(paramf);
  }

  public long b(long paramLong)
  {
    long l1 = 9223372036854775807L;
    int i1 = 0;
    while (i1 < this.p.length)
    {
      l locall = this.p[i1].b;
      int i3 = locall.a(paramLong);
      int i2 = i3;
      if (i3 == -1)
        i2 = locall.b(paramLong);
      this.p[i1].d = i2;
      long l3 = locall.b[i2];
      long l2 = l1;
      if (l3 < l1)
        l2 = l3;
      i1 += 1;
      l1 = l2;
    }
    return l1;
  }

  public void b()
  {
    this.e.clear();
    this.j = 0;
    this.m = 0;
    this.n = 0;
    this.g = 0;
  }

  public void c()
  {
  }

  private static final class a
  {
    public final i a;
    public final l b;
    public final org.vidogram.messenger.exoplayer.c.m c;
    public int d;

    public a(i parami, l paraml, org.vidogram.messenger.exoplayer.c.m paramm)
    {
      this.a = parami;
      this.b = paraml;
      this.c = paramm;
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.exoplayer.c.c.f
 * JD-Core Version:    0.6.0
 */