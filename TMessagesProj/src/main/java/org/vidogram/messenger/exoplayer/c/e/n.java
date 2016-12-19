package org.vidogram.messenger.exoplayer.c.e;

import org.vidogram.messenger.exoplayer.MediaFormat;
import org.vidogram.messenger.exoplayer.d.a.a;

final class n
{
  private final org.vidogram.messenger.exoplayer.c.m a;

  public n(org.vidogram.messenger.exoplayer.c.m paramm)
  {
    this.a = paramm;
    paramm.a(MediaFormat.a(null, "application/eia-608", -1, -1L, null));
  }

  public void a(long paramLong, org.vidogram.messenger.exoplayer.f.m paramm)
  {
    while (paramm.b() > 1)
    {
      int i = 0;
      int k;
      int j;
      do
      {
        k = paramm.f();
        j = i + k;
        i = j;
      }
      while (k == 255);
      i = 0;
      int m;
      do
      {
        m = paramm.f();
        k = i + m;
        i = k;
      }
      while (m == 255);
      if (a.a(j, k, paramm))
      {
        this.a.a(paramm, k);
        this.a.a(paramLong, 1, k, 0, null);
        continue;
      }
      paramm.c(k);
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.exoplayer.c.e.n
 * JD-Core Version:    0.6.0
 */