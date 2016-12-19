package org.vidogram.messenger.exoplayer.c.e;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.vidogram.messenger.exoplayer.MediaFormat;
import org.vidogram.messenger.exoplayer.f.k.a;
import org.vidogram.messenger.exoplayer.f.k.b;
import org.vidogram.messenger.exoplayer.f.l;

final class g extends e
{
  private boolean b;
  private final n c;
  private final boolean[] d;
  private final a e;
  private final k f;
  private final k g;
  private final k h;
  private long i;
  private long j;
  private final org.vidogram.messenger.exoplayer.f.m k;

  public g(org.vidogram.messenger.exoplayer.c.m paramm, n paramn, boolean paramBoolean1, boolean paramBoolean2)
  {
    super(paramm);
    this.c = paramn;
    this.d = new boolean[3];
    this.e = new a(paramm, paramBoolean1, paramBoolean2);
    this.f = new k(7, 128);
    this.g = new k(8, 128);
    this.h = new k(6, 128);
    this.k = new org.vidogram.messenger.exoplayer.f.m();
  }

  private static l a(k paramk)
  {
    int m = org.vidogram.messenger.exoplayer.f.k.a(paramk.a, paramk.b);
    paramk = new l(paramk.a, m);
    paramk.b(32);
    return paramk;
  }

  private void a(long paramLong1, int paramInt1, int paramInt2, long paramLong2)
  {
    Object localObject;
    if ((!this.b) || (this.e.a()))
    {
      this.f.b(paramInt2);
      this.g.b(paramInt2);
      if (this.b)
        break label300;
      if ((this.f.b()) && (this.g.b()))
      {
        localObject = new ArrayList();
        ((List)localObject).add(Arrays.copyOf(this.f.a, this.f.b));
        ((List)localObject).add(Arrays.copyOf(this.g.a, this.g.b));
        k.b localb = org.vidogram.messenger.exoplayer.f.k.a(a(this.f));
        k.a locala = org.vidogram.messenger.exoplayer.f.k.b(a(this.g));
        this.a.a(MediaFormat.a(null, "video/avc", -1, -1, -1L, localb.b, localb.c, (List)localObject, -1, localb.d));
        this.b = true;
        this.e.a(localb);
        this.e.a(locala);
        this.f.a();
        this.g.a();
      }
    }
    while (true)
    {
      if (this.h.b(paramInt2))
      {
        paramInt2 = org.vidogram.messenger.exoplayer.f.k.a(this.h.a, this.h.b);
        this.k.a(this.h.a, paramInt2);
        this.k.b(4);
        this.c.a(paramLong2, this.k);
      }
      this.e.a(paramLong1, paramInt1);
      return;
      label300: if (this.f.b())
      {
        localObject = org.vidogram.messenger.exoplayer.f.k.a(a(this.f));
        this.e.a((k.b)localObject);
        this.f.a();
        continue;
      }
      if (!this.g.b())
        continue;
      localObject = org.vidogram.messenger.exoplayer.f.k.b(a(this.g));
      this.e.a((k.a)localObject);
      this.g.a();
    }
  }

  private void a(long paramLong1, int paramInt, long paramLong2)
  {
    if ((!this.b) || (this.e.a()))
    {
      this.f.a(paramInt);
      this.g.a(paramInt);
    }
    this.h.a(paramInt);
    this.e.a(paramLong1, paramInt, paramLong2);
  }

  private void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if ((!this.b) || (this.e.a()))
    {
      this.f.a(paramArrayOfByte, paramInt1, paramInt2);
      this.g.a(paramArrayOfByte, paramInt1, paramInt2);
    }
    this.h.a(paramArrayOfByte, paramInt1, paramInt2);
    this.e.a(paramArrayOfByte, paramInt1, paramInt2);
  }

  public void a()
  {
    org.vidogram.messenger.exoplayer.f.k.a(this.d);
    this.f.a();
    this.g.a();
    this.h.a();
    this.e.b();
    this.i = 0L;
  }

  public void a(long paramLong, boolean paramBoolean)
  {
    this.j = paramLong;
  }

  public void a(org.vidogram.messenger.exoplayer.f.m paramm)
  {
    int n;
    byte[] arrayOfByte;
    int i1;
    if (paramm.b() > 0)
    {
      m = paramm.d();
      n = paramm.c();
      arrayOfByte = paramm.a;
      this.i += paramm.b();
      this.a.a(paramm, paramm.b());
      i1 = org.vidogram.messenger.exoplayer.f.k.a(arrayOfByte, m, n, this.d);
      if (i1 == n)
        a(arrayOfByte, m, n);
    }
    else
    {
      return;
    }
    int i2 = org.vidogram.messenger.exoplayer.f.k.b(arrayOfByte, i1);
    int i4 = i1 - m;
    if (i4 > 0)
      a(arrayOfByte, m, i1);
    int i3 = n - i1;
    long l = this.i - i3;
    if (i4 < 0);
    for (int m = -i4; ; m = 0)
    {
      a(l, i3, m, this.j);
      a(l, i2, this.j);
      m = i1 + 3;
      break;
    }
  }

  public void b()
  {
  }

  private static final class a
  {
    private final org.vidogram.messenger.exoplayer.c.m a;
    private final boolean b;
    private final boolean c;
    private final l d;
    private final SparseArray<k.b> e;
    private final SparseArray<k.a> f;
    private byte[] g;
    private int h;
    private int i;
    private long j;
    private boolean k;
    private long l;
    private a m;
    private a n;
    private boolean o;
    private long p;
    private long q;
    private boolean r;

    public a(org.vidogram.messenger.exoplayer.c.m paramm, boolean paramBoolean1, boolean paramBoolean2)
    {
      this.a = paramm;
      this.b = paramBoolean1;
      this.c = paramBoolean2;
      this.e = new SparseArray();
      this.f = new SparseArray();
      this.m = new a(null);
      this.n = new a(null);
      this.d = new l();
      this.g = new byte[''];
      b();
    }

    private void a(int paramInt)
    {
      if (this.r);
      for (int i1 = 1; ; i1 = 0)
      {
        int i2 = (int)(this.j - this.p);
        this.a.a(this.q, i1, i2, paramInt, null);
        return;
      }
    }

    public void a(long paramLong, int paramInt)
    {
      int i1 = 0;
      if ((this.i == 9) || ((this.c) && (a.a(this.n, this.m))))
      {
        if (this.o)
          a((int)(paramLong - this.j) + paramInt);
        this.p = this.j;
        this.q = this.l;
        this.r = false;
        this.o = true;
      }
      int i2 = this.r;
      if (this.i != 5)
      {
        paramInt = i1;
        if (this.b)
        {
          paramInt = i1;
          if (this.i == 1)
          {
            paramInt = i1;
            if (!this.n.b());
          }
        }
      }
      else
      {
        paramInt = 1;
      }
      this.r = (paramInt | i2);
    }

    public void a(long paramLong1, int paramInt, long paramLong2)
    {
      this.i = paramInt;
      this.l = paramLong2;
      this.j = paramLong1;
      if (((this.b) && (this.i == 1)) || ((this.c) && ((this.i == 5) || (this.i == 1) || (this.i == 2))))
      {
        a locala = this.m;
        this.m = this.n;
        this.n = locala;
        this.n.a();
        this.h = 0;
        this.k = true;
      }
    }

    public void a(k.a parama)
    {
      this.f.append(parama.a, parama);
    }

    public void a(k.b paramb)
    {
      this.e.append(paramb.a, paramb);
    }

    public void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    {
      if (!this.k);
      int i8;
      int i9;
      int i10;
      k.b localb;
      boolean bool2;
      int i11;
      boolean bool3;
      boolean bool1;
      boolean bool4;
      label403: int i6;
      int i4;
      int i7;
      int i5;
      int i1;
      int i2;
      int i3;
      while (true)
      {
        return;
        paramInt2 -= paramInt1;
        if (this.g.length < this.h + paramInt2)
          this.g = Arrays.copyOf(this.g, (this.h + paramInt2) * 2);
        System.arraycopy(paramArrayOfByte, paramInt1, this.g, this.h, paramInt2);
        this.h = (paramInt2 + this.h);
        this.d.a(this.g, this.h);
        if (this.d.a() < 8)
          continue;
        this.d.b(1);
        i8 = this.d.c(2);
        this.d.b(5);
        if (!this.d.c())
          continue;
        this.d.d();
        if (!this.d.c())
          continue;
        i9 = this.d.d();
        if (!this.c)
        {
          this.k = false;
          this.n.a(i9);
          return;
        }
        if (!this.d.c())
          continue;
        i10 = this.d.d();
        if (this.f.indexOfKey(i10) < 0)
        {
          this.k = false;
          return;
        }
        paramArrayOfByte = (k.a)this.f.get(i10);
        localb = (k.b)this.e.get(paramArrayOfByte.b);
        if (localb.e)
        {
          if (this.d.a() < 2)
            continue;
          this.d.b(2);
        }
        if (this.d.a() < localb.g)
          continue;
        bool2 = false;
        boolean bool5 = false;
        boolean bool6 = false;
        i11 = this.d.c(localb.g);
        bool3 = bool5;
        bool1 = bool6;
        if (!localb.f)
        {
          if (this.d.a() < 1)
            continue;
          bool4 = this.d.b();
          bool2 = bool4;
          bool3 = bool5;
          bool1 = bool6;
          if (bool4)
          {
            if (this.d.a() < 1)
              continue;
            bool1 = this.d.b();
            bool3 = true;
            bool2 = bool4;
          }
        }
        if (this.i != 5)
          break label588;
        bool4 = true;
        paramInt1 = 0;
        if (bool4)
        {
          if (!this.d.c())
            continue;
          paramInt1 = this.d.d();
        }
        i6 = 0;
        i4 = 0;
        i7 = 0;
        i5 = 0;
        if (localb.h != 0)
          break label594;
        if (this.d.a() < localb.i)
          continue;
        i6 = this.d.c(localb.i);
        i1 = i6;
        i2 = i4;
        paramInt2 = i7;
        i3 = i5;
        if (!paramArrayOfByte.c)
          break;
        i1 = i6;
        i2 = i4;
        paramInt2 = i7;
        i3 = i5;
        if (bool2)
          break;
        if (!this.d.c())
          continue;
        i2 = this.d.e();
        i3 = i5;
        paramInt2 = i7;
        i1 = i6;
      }
      while (true)
      {
        this.n.a(localb, i8, i9, i11, i10, bool2, bool3, bool1, bool4, paramInt1, i1, i2, paramInt2, i3);
        this.k = false;
        return;
        label588: bool4 = false;
        break label403;
        label594: i1 = i6;
        i2 = i4;
        paramInt2 = i7;
        i3 = i5;
        if (localb.h != 1)
          continue;
        i1 = i6;
        i2 = i4;
        paramInt2 = i7;
        i3 = i5;
        if (localb.j)
          continue;
        if (!this.d.c())
          break;
        i7 = this.d.e();
        i1 = i6;
        i2 = i4;
        paramInt2 = i7;
        i3 = i5;
        if (!paramArrayOfByte.c)
          continue;
        i1 = i6;
        i2 = i4;
        paramInt2 = i7;
        i3 = i5;
        if (bool2)
          continue;
        if (!this.d.c())
          break;
        i3 = this.d.e();
        i1 = i6;
        i2 = i4;
        paramInt2 = i7;
      }
    }

    public boolean a()
    {
      return this.c;
    }

    public void b()
    {
      this.k = false;
      this.o = false;
      this.n.a();
    }

    private static final class a
    {
      private boolean a;
      private boolean b;
      private k.b c;
      private int d;
      private int e;
      private int f;
      private int g;
      private boolean h;
      private boolean i;
      private boolean j;
      private boolean k;
      private int l;
      private int m;
      private int n;
      private int o;
      private int p;

      private boolean a(a parama)
      {
        return (this.a) && ((!parama.a) || (this.f != parama.f) || (this.g != parama.g) || (this.h != parama.h) || ((this.i) && (parama.i) && (this.j != parama.j)) || ((this.d != parama.d) && ((this.d == 0) || (parama.d == 0))) || ((this.c.h == 0) && (parama.c.h == 0) && ((this.m != parama.m) || (this.n != parama.n))) || ((this.c.h == 1) && (parama.c.h == 1) && ((this.o != parama.o) || (this.p != parama.p))) || (this.k != parama.k) || ((this.k) && (parama.k) && (this.l != parama.l)));
      }

      public void a()
      {
        this.b = false;
        this.a = false;
      }

      public void a(int paramInt)
      {
        this.e = paramInt;
        this.b = true;
      }

      public void a(k.b paramb, int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9)
      {
        this.c = paramb;
        this.d = paramInt1;
        this.e = paramInt2;
        this.f = paramInt3;
        this.g = paramInt4;
        this.h = paramBoolean1;
        this.i = paramBoolean2;
        this.j = paramBoolean3;
        this.k = paramBoolean4;
        this.l = paramInt5;
        this.m = paramInt6;
        this.n = paramInt7;
        this.o = paramInt8;
        this.p = paramInt9;
        this.a = true;
        this.b = true;
      }

      public boolean b()
      {
        return (this.b) && ((this.e == 7) || (this.e == 2));
      }
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.exoplayer.c.e.g
 * JD-Core Version:    0.6.0
 */