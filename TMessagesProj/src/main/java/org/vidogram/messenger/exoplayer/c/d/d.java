package org.vidogram.messenger.exoplayer.c.d;

import org.vidogram.messenger.exoplayer.c.f;
import org.vidogram.messenger.exoplayer.f.b;
import org.vidogram.messenger.exoplayer.f.m;

final class d
{
  private final e.b a = new e.b();
  private final m b = new m(282);
  private long c = -1L;
  private long d;

  public long a(long paramLong, f paramf)
  {
    int i = 1;
    if ((this.c != -1L) && (this.d != 0L));
    for (boolean bool = true; ; bool = false)
    {
      b.b(bool);
      e.a(paramf, this.a, this.b, false);
      paramLong -= this.a.c;
      if ((paramLong > 0L) && (paramLong <= 72000L))
        break;
      int j = this.a.i;
      int k = this.a.h;
      if (paramLong <= 0L)
        i = 2;
      long l = (j + k) * i;
      return paramf.c() - l + paramLong * this.c / this.d;
    }
    paramf.a();
    return -1L;
  }

  public void a(long paramLong1, long paramLong2)
  {
    if ((paramLong1 > 0L) && (paramLong2 > 0L));
    for (boolean bool = true; ; bool = false)
    {
      b.a(bool);
      this.c = paramLong1;
      this.d = paramLong2;
      return;
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.exoplayer.c.d.d
 * JD-Core Version:    0.6.0
 */