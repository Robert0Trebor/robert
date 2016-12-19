package org.vidogram.messenger.exoplayer.c.e;

import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import org.vidogram.messenger.exoplayer.f.r;

public final class o
  implements org.vidogram.messenger.exoplayer.c.e
{
  private static final long d = r.c("AC-3");
  private static final long e = r.c("EAC3");
  private static final long f = r.c("HEVC");
  final SparseArray<d> a;
  final SparseBooleanArray b;
  i c;
  private final m g;
  private final int h;
  private final org.vidogram.messenger.exoplayer.f.m i;
  private final org.vidogram.messenger.exoplayer.f.l j;
  private org.vidogram.messenger.exoplayer.c.g k;

  public o()
  {
    this(new m(0L));
  }

  public o(m paramm)
  {
    this(paramm, 0);
  }

  public o(m paramm, int paramInt)
  {
    this.g = paramm;
    this.h = paramInt;
    this.i = new org.vidogram.messenger.exoplayer.f.m(188);
    this.j = new org.vidogram.messenger.exoplayer.f.l(new byte[3]);
    this.a = new SparseArray();
    this.a.put(0, new a());
    this.b = new SparseBooleanArray();
  }

  public int a(org.vidogram.messenger.exoplayer.c.f paramf, org.vidogram.messenger.exoplayer.c.j paramj)
  {
    if (!paramf.a(this.i.a, 0, 188, true))
      return -1;
    this.i.b(0);
    this.i.a(188);
    if (this.i.f() != 71)
      return 0;
    this.i.a(this.j, 3);
    this.j.b(1);
    boolean bool1 = this.j.b();
    this.j.b(1);
    int m = this.j.c(13);
    this.j.b(2);
    boolean bool2 = this.j.b();
    boolean bool3 = this.j.b();
    if (bool2)
    {
      int n = this.i.f();
      this.i.c(n);
    }
    if (bool3)
    {
      paramf = (d)this.a.get(m);
      if (paramf != null)
        paramf.a(this.i, bool1, this.k);
    }
    return 0;
  }

  public void a(org.vidogram.messenger.exoplayer.c.g paramg)
  {
    this.k = paramg;
    paramg.a(org.vidogram.messenger.exoplayer.c.l.f);
  }

  public boolean a(org.vidogram.messenger.exoplayer.c.f paramf)
  {
    byte[] arrayOfByte = new byte[1];
    int m = 0;
    while (m < 5)
    {
      paramf.c(arrayOfByte, 0, 1);
      if ((arrayOfByte[0] & 0xFF) != 71)
        return false;
      paramf.c(187);
      m += 1;
    }
    return true;
  }

  public void b()
  {
    this.g.a();
    int m = 0;
    while (m < this.a.size())
    {
      ((d)this.a.valueAt(m)).a();
      m += 1;
    }
  }

  public void c()
  {
  }

  private class a extends o.d
  {
    private final org.vidogram.messenger.exoplayer.f.l b = new org.vidogram.messenger.exoplayer.f.l(new byte[4]);

    public a()
    {
      super();
    }

    public void a()
    {
    }

    public void a(org.vidogram.messenger.exoplayer.f.m paramm, boolean paramBoolean, org.vidogram.messenger.exoplayer.c.g paramg)
    {
      if (paramBoolean)
        paramm.c(paramm.f());
      paramm.a(this.b, 3);
      this.b.b(12);
      int i = this.b.c(12);
      paramm.c(5);
      int j = (i - 9) / 4;
      i = 0;
      if (i < j)
      {
        paramm.a(this.b, 4);
        int k = this.b.c(16);
        this.b.b(3);
        if (k == 0)
          this.b.b(13);
        while (true)
        {
          i += 1;
          break;
          k = this.b.c(13);
          o.this.a.put(k, new o.c(o.this));
        }
      }
    }
  }

  private static final class b extends o.d
  {
    private final e a;
    private final m b;
    private final org.vidogram.messenger.exoplayer.f.l c;
    private int d;
    private int e;
    private boolean f;
    private boolean g;
    private boolean h;
    private int i;
    private int j;
    private boolean k;
    private long l;

    public b(e parame, m paramm)
    {
      super();
      this.a = parame;
      this.b = paramm;
      this.c = new org.vidogram.messenger.exoplayer.f.l(new byte[10]);
      this.d = 0;
    }

    private void a(int paramInt)
    {
      this.d = paramInt;
      this.e = 0;
    }

    private boolean a(org.vidogram.messenger.exoplayer.f.m paramm, byte[] paramArrayOfByte, int paramInt)
    {
      int m = Math.min(paramm.b(), paramInt - this.e);
      if (m <= 0)
        return true;
      if (paramArrayOfByte == null)
        paramm.c(m);
      while (true)
      {
        this.e = (m + this.e);
        if (this.e == paramInt)
          break;
        return false;
        paramm.a(paramArrayOfByte, this.e, m);
      }
    }

    private boolean b()
    {
      this.c.a(0);
      int m = this.c.c(24);
      if (m != 1)
      {
        Log.w("TsExtractor", "Unexpected start code prefix: " + m);
        this.j = -1;
        return false;
      }
      this.c.b(8);
      m = this.c.c(16);
      this.c.b(5);
      this.k = this.c.b();
      this.c.b(2);
      this.f = this.c.b();
      this.g = this.c.b();
      this.c.b(6);
      this.i = this.c.c(8);
      if (m == 0);
      for (this.j = -1; ; this.j = (m + 6 - 9 - this.i))
        return true;
    }

    private void c()
    {
      this.c.a(0);
      this.l = -1L;
      if (this.f)
      {
        this.c.b(4);
        long l1 = this.c.c(3);
        this.c.b(1);
        long l2 = this.c.c(15) << 15;
        this.c.b(1);
        long l3 = this.c.c(15);
        this.c.b(1);
        if ((!this.h) && (this.g))
        {
          this.c.b(4);
          long l4 = this.c.c(3);
          this.c.b(1);
          long l5 = this.c.c(15) << 15;
          this.c.b(1);
          long l6 = this.c.c(15);
          this.c.b(1);
          this.b.a(l4 << 30 | l5 | l6);
          this.h = true;
        }
        this.l = this.b.a(l1 << 30 | l2 | l3);
      }
    }

    public void a()
    {
      this.d = 0;
      this.e = 0;
      this.h = false;
      this.a.a();
    }

    public void a(org.vidogram.messenger.exoplayer.f.m paramm, boolean paramBoolean, org.vidogram.messenger.exoplayer.c.g paramg)
    {
      if (paramBoolean)
        switch (this.d)
        {
        case 0:
        case 1:
        default:
          a(1);
        case 2:
        case 3:
        }
      while (true)
      {
        if (paramm.b() <= 0)
          return;
        switch (this.d)
        {
        default:
          break;
        case 0:
          paramm.c(paramm.b());
          continue;
          Log.w("TsExtractor", "Unexpected start indicator reading extended header");
          break;
          if (this.j != -1)
            Log.w("TsExtractor", "Unexpected start indicator: expected " + this.j + " more bytes");
          this.a.b();
          break;
        case 1:
          if (!a(paramm, this.c.a, 9))
            continue;
          if (b());
          for (m = 2; ; m = 0)
          {
            a(m);
            break;
          }
        case 2:
          m = Math.min(10, this.i);
          if ((!a(paramm, this.c.a, m)) || (!a(paramm, null, this.i)))
            continue;
          c();
          this.a.a(this.l, this.k);
          a(3);
        case 3:
        }
      }
      int i1 = paramm.b();
      if (this.j == -1);
      for (int m = 0; ; m = i1 - this.j)
      {
        int n = i1;
        if (m > 0)
        {
          n = i1 - m;
          paramm.a(paramm.d() + n);
        }
        this.a.a(paramm);
        if (this.j == -1)
          break;
        this.j -= n;
        if (this.j != 0)
          break;
        this.a.b();
        a(1);
        break;
      }
    }
  }

  private class c extends o.d
  {
    private final org.vidogram.messenger.exoplayer.f.l b = new org.vidogram.messenger.exoplayer.f.l(new byte[5]);
    private final org.vidogram.messenger.exoplayer.f.m c = new org.vidogram.messenger.exoplayer.f.m();
    private int d;
    private int e;

    public c()
    {
      super();
    }

    private int a(org.vidogram.messenger.exoplayer.f.m paramm, int paramInt)
    {
      int i = -1;
      int j = paramm.d() + paramInt;
      paramInt = i;
      int m;
      int k;
      long l;
      if (paramm.d() < j)
      {
        m = paramm.f();
        k = paramm.f();
        if (m != 5)
          break label99;
        l = paramm.k();
        if (l != o.a())
          break label66;
        paramInt = 129;
      }
      while (true)
      {
        paramm.b(j);
        return paramInt;
        label66: if (l == o.d())
        {
          paramInt = 135;
          continue;
        }
        paramInt = i;
        if (l != o.e())
          continue;
        paramInt = 36;
      }
      label99: if (m == 106)
        paramInt = 129;
      while (true)
      {
        paramm.c(k);
        i = paramInt;
        break;
        if (m == 122)
        {
          paramInt = 135;
          continue;
        }
        paramInt = i;
        if (m != 123)
          continue;
        paramInt = 138;
      }
    }

    public void a()
    {
    }

    public void a(org.vidogram.messenger.exoplayer.f.m paramm, boolean paramBoolean, org.vidogram.messenger.exoplayer.c.g paramg)
    {
      if (paramBoolean)
      {
        paramm.c(paramm.f());
        paramm.a(this.b, 3);
        this.b.b(12);
        this.d = this.b.c(12);
        if (this.c.e() >= this.d)
          break label132;
        this.c.a(new byte[this.d], this.d);
      }
      while (true)
      {
        i = Math.min(paramm.b(), this.d - this.e);
        paramm.a(this.c.a, this.e, i);
        this.e = (i + this.e);
        if (this.e >= this.d)
          break;
        return;
        label132: this.c.a();
        this.c.a(this.d);
      }
      this.c.c(7);
      this.c.a(this.b, 2);
      this.b.b(4);
      int i = this.b.c(12);
      this.c.c(i);
      if (o.this.c == null)
        o.this.c = new i(paramg.d(21));
      i = this.d - 9 - i - 4;
      if (i > 0)
      {
        this.c.a(this.b, 5);
        int j = this.b.c(8);
        this.b.b(3);
        int k = this.b.c(13);
        this.b.b(4);
        int m = this.b.c(12);
        if (j == 6)
          j = a(this.c, m);
        while (true)
        {
          i -= m + 5;
          if (!o.this.b.get(j))
            break label372;
          break;
          this.c.c(m);
        }
        switch (j)
        {
        default:
          label372: paramm = null;
        case 3:
        case 4:
        case 15:
        case 129:
        case 135:
        case 130:
        case 138:
        case 2:
        case 27:
        case 36:
        case 21:
        }
        while (true)
        {
          if (paramm != null)
          {
            o.this.b.put(j, true);
            o.this.a.put(k, new o.b(paramm, o.b(o.this)));
          }
          break;
          paramm = new j(paramg.d(3));
          continue;
          paramm = new j(paramg.d(4));
          continue;
          if ((o.a(o.this) & 0x2) != 0)
          {
            paramm = null;
            continue;
          }
          paramm = new c(paramg.d(15), new org.vidogram.messenger.exoplayer.c.d());
          continue;
          paramm = new a(paramg.d(129), false);
          continue;
          paramm = new a(paramg.d(135), true);
          continue;
          paramm = new d(paramg.d(138));
          continue;
          paramm = new f(paramg.d(2));
          continue;
          if ((o.a(o.this) & 0x4) != 0)
          {
            paramm = null;
            continue;
          }
          paramm = paramg.d(27);
          n localn = new n(paramg.d(256));
          if ((o.a(o.this) & 0x1) != 0)
          {
            paramBoolean = true;
            label738: if ((o.a(o.this) & 0x8) == 0)
              break label776;
          }
          label776: for (boolean bool = true; ; bool = false)
          {
            paramm = new g(paramm, localn, paramBoolean, bool);
            break;
            paramBoolean = false;
            break label738;
          }
          paramm = new h(paramg.d(36), new n(paramg.d(256)));
          continue;
          paramm = o.this.c;
        }
      }
      paramg.f();
    }
  }

  private static abstract class d
  {
    public abstract void a();

    public abstract void a(org.vidogram.messenger.exoplayer.f.m paramm, boolean paramBoolean, org.vidogram.messenger.exoplayer.c.g paramg);
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.exoplayer.c.e.o
 * JD-Core Version:    0.6.0
 */