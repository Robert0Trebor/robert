package org.vidogram.messenger.exoplayer.c.e;

import org.vidogram.messenger.exoplayer.c.e;
import org.vidogram.messenger.exoplayer.c.f;
import org.vidogram.messenger.exoplayer.c.g;
import org.vidogram.messenger.exoplayer.c.j;
import org.vidogram.messenger.exoplayer.f.m;
import org.vidogram.messenger.exoplayer.f.r;

public final class b
  implements e
{
  private static final int a = r.c("ID3");
  private final long b;
  private final m c;
  private c d;
  private boolean e;

  public b()
  {
    this(0L);
  }

  public b(long paramLong)
  {
    this.b = paramLong;
    this.c = new m(200);
  }

  public int a(f paramf, j paramj)
  {
    int i = paramf.a(this.c.a, 0, 200);
    if (i == -1)
      return -1;
    this.c.b(0);
    this.c.a(i);
    if (!this.e)
    {
      this.d.a(this.b, true);
      this.e = true;
    }
    this.d.a(this.c);
    return 0;
  }

  public void a(g paramg)
  {
    this.d = new c(paramg.d(0), paramg.d(1));
    paramg.f();
    paramg.a(org.vidogram.messenger.exoplayer.c.l.f);
  }

  public boolean a(f paramf)
  {
    m localm = new m(10);
    org.vidogram.messenger.exoplayer.f.l locall = new org.vidogram.messenger.exoplayer.f.l(localm.a);
    int i = 0;
    paramf.c(localm.a, 0, 10);
    localm.b(0);
    int k;
    int j;
    int m;
    if (localm.j() != a)
    {
      paramf.a();
      paramf.c(i);
      k = 0;
      j = 0;
      m = i;
    }
    while (true)
    {
      label79: paramf.c(localm.a, 0, 2);
      localm.b(0);
      if ((localm.g() & 0xFFF6) != 65520)
      {
        paramf.a();
        m += 1;
        if (m - i < 8192);
      }
      int n;
      do
      {
        return false;
        j = (localm.a[6] & 0x7F) << 21 | (localm.a[7] & 0x7F) << 14 | (localm.a[8] & 0x7F) << 7 | localm.a[9] & 0x7F;
        i += j + 10;
        paramf.c(j);
        break;
        paramf.c(m);
        k = 0;
        j = 0;
        break label79;
        k += 1;
        if ((k >= 4) && (j > 188))
          return true;
        paramf.c(localm.a, 0, 4);
        locall.a(14);
        n = locall.c(13);
      }
      while (n <= 6);
      paramf.c(n - 6);
      j += n;
    }
  }

  public void b()
  {
    this.e = false;
    this.d.a();
  }

  public void c()
  {
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.exoplayer.c.e.b
 * JD-Core Version:    0.6.0
 */