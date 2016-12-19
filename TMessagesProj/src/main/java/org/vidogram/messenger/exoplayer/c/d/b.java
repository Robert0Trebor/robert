package org.vidogram.messenger.exoplayer.c.d;

import org.vidogram.messenger.exoplayer.c.g;
import org.vidogram.messenger.exoplayer.c.j;

public class b
  implements org.vidogram.messenger.exoplayer.c.e
{
  private f a;

  public int a(org.vidogram.messenger.exoplayer.c.f paramf, j paramj)
  {
    return this.a.a(paramf, paramj);
  }

  public void a(g paramg)
  {
    org.vidogram.messenger.exoplayer.c.m localm = paramg.d(0);
    paramg.f();
    this.a.a(paramg, localm);
  }

  public boolean a(org.vidogram.messenger.exoplayer.c.f paramf)
  {
    try
    {
      org.vidogram.messenger.exoplayer.f.m localm = new org.vidogram.messenger.exoplayer.f.m(new byte[27], 0);
      e.b localb = new e.b();
      if ((e.a(paramf, localb, localm, true)) && ((localb.b & 0x2) == 2))
      {
        if (localb.i < 7)
          return false;
        localm.a();
        paramf.c(localm.a, 0, 7);
        if (a.a(localm))
        {
          this.a = new a();
          break label123;
        }
        localm.a();
        if (h.a(localm))
          this.a = new h();
      }
    }
    catch (org.vidogram.messenger.exoplayer.r paramf)
    {
      return false;
    }
    finally
    {
    }
    return false;
    label123: return true;
  }

  public void b()
  {
    this.a.b();
  }

  public void c()
  {
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.exoplayer.c.d.b
 * JD-Core Version:    0.6.0
 */