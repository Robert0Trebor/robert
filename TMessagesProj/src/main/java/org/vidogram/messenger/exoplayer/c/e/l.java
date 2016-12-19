package org.vidogram.messenger.exoplayer.c.e;

import android.util.SparseArray;
import org.vidogram.messenger.exoplayer.c.g;

public final class l
  implements org.vidogram.messenger.exoplayer.c.e
{
  private final m a;
  private final SparseArray<a> b;
  private final org.vidogram.messenger.exoplayer.f.m c;
  private boolean d;
  private boolean e;
  private boolean f;
  private g g;

  public l()
  {
    this(new m(0L));
  }

  public l(m paramm)
  {
    this.a = paramm;
    this.c = new org.vidogram.messenger.exoplayer.f.m(4096);
    this.b = new SparseArray();
  }

  public int a(org.vidogram.messenger.exoplayer.c.f paramf, org.vidogram.messenger.exoplayer.c.j paramj)
  {
    if (!paramf.b(this.c.a, 0, 4, true));
    do
    {
      return -1;
      this.c.b(0);
      i = this.c.m();
    }
    while (i == 441);
    if (i == 442)
    {
      paramf.c(this.c.a, 0, 10);
      this.c.b(0);
      this.c.c(9);
      paramf.b((this.c.f() & 0x7) + 14);
      return 0;
    }
    if (i == 443)
    {
      paramf.c(this.c.a, 0, 2);
      this.c.b(0);
      paramf.b(this.c.g() + 6);
      return 0;
    }
    if ((i & 0xFFFFFF00) >> 8 != 1)
    {
      paramf.b(1);
      return 0;
    }
    i &= 255;
    a locala2 = (a)this.b.get(i);
    paramj = locala2;
    a locala1;
    if (!this.d)
    {
      locala1 = locala2;
      if (locala2 == null)
      {
        locala1 = null;
        if ((this.e) || (i != 189))
          break label379;
        paramj = new a(this.g.d(i), false);
        this.e = true;
        locala1 = locala2;
        if (paramj != null)
        {
          locala1 = new a(paramj, this.a);
          this.b.put(i, locala1);
        }
      }
      if ((!this.e) || (!this.f))
      {
        paramj = locala1;
        if (paramf.c() <= 1048576L);
      }
      else
      {
        this.d = true;
        this.g.f();
        paramj = locala1;
      }
    }
    paramf.c(this.c.a, 0, 2);
    this.c.b(0);
    int i = this.c.g() + 6;
    if (paramj == null)
      paramf.b(i);
    while (true)
    {
      return 0;
      label379: if ((!this.e) && ((i & 0xE0) == 192))
      {
        paramj = new j(this.g.d(i));
        this.e = true;
        break;
      }
      paramj = locala1;
      if (this.f)
        break;
      paramj = locala1;
      if ((i & 0xF0) != 224)
        break;
      paramj = new f(this.g.d(i));
      this.f = true;
      break;
      if (this.c.e() < i)
        this.c.a(new byte[i], i);
      paramf.b(this.c.a, 0, i);
      this.c.b(6);
      this.c.a(i);
      paramj.a(this.c, this.g);
      this.c.a(this.c.e());
    }
  }

  public void a(g paramg)
  {
    this.g = paramg;
    paramg.a(org.vidogram.messenger.exoplayer.c.l.f);
  }

  public boolean a(org.vidogram.messenger.exoplayer.c.f paramf)
  {
    int k = 1;
    byte[] arrayOfByte = new byte[14];
    paramf.c(arrayOfByte, 0, 14);
    if (442 != ((arrayOfByte[0] & 0xFF) << 24 | (arrayOfByte[1] & 0xFF) << 16 | (arrayOfByte[2] & 0xFF) << 8 | arrayOfByte[3] & 0xFF));
    do
      return false;
    while (((arrayOfByte[4] & 0xC4) != 68) || ((arrayOfByte[6] & 0x4) != 4) || ((arrayOfByte[8] & 0x4) != 4) || ((arrayOfByte[9] & 0x1) != 1) || ((arrayOfByte[12] & 0x3) != 3));
    paramf.c(arrayOfByte[13] & 0x7);
    paramf.c(arrayOfByte, 0, 3);
    int i = arrayOfByte[0];
    int j = arrayOfByte[1];
    if (1 == (arrayOfByte[2] & 0xFF | ((i & 0xFF) << 16 | (j & 0xFF) << 8)));
    while (true)
    {
      return k;
      k = 0;
    }
  }

  public void b()
  {
    this.a.a();
    int i = 0;
    while (i < this.b.size())
    {
      ((a)this.b.valueAt(i)).a();
      i += 1;
    }
  }

  public void c()
  {
  }

  private static final class a
  {
    private final e a;
    private final m b;
    private final org.vidogram.messenger.exoplayer.f.l c;
    private boolean d;
    private boolean e;
    private boolean f;
    private int g;
    private long h;

    public a(e parame, m paramm)
    {
      this.a = parame;
      this.b = paramm;
      this.c = new org.vidogram.messenger.exoplayer.f.l(new byte[64]);
    }

    private void b()
    {
      this.c.b(8);
      this.d = this.c.b();
      this.e = this.c.b();
      this.c.b(6);
      this.g = this.c.c(8);
    }

    private void c()
    {
      this.h = 0L;
      if (this.d)
      {
        this.c.b(4);
        long l1 = this.c.c(3);
        this.c.b(1);
        long l2 = this.c.c(15) << 15;
        this.c.b(1);
        long l3 = this.c.c(15);
        this.c.b(1);
        if ((!this.f) && (this.e))
        {
          this.c.b(4);
          long l4 = this.c.c(3);
          this.c.b(1);
          long l5 = this.c.c(15) << 15;
          this.c.b(1);
          long l6 = this.c.c(15);
          this.c.b(1);
          this.b.a(l4 << 30 | l5 | l6);
          this.f = true;
        }
        this.h = this.b.a(l1 << 30 | l2 | l3);
      }
    }

    public void a()
    {
      this.f = false;
      this.a.a();
    }

    public void a(org.vidogram.messenger.exoplayer.f.m paramm, g paramg)
    {
      paramm.a(this.c.a, 0, 3);
      this.c.a(0);
      b();
      paramm.a(this.c.a, 0, this.g);
      this.c.a(0);
      c();
      this.a.a(this.h, true);
      this.a.a(paramm);
      this.a.b();
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.exoplayer.c.e.l
 * JD-Core Version:    0.6.0
 */