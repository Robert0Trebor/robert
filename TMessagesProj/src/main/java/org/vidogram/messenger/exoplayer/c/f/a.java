package org.vidogram.messenger.exoplayer.c.f;

import org.vidogram.messenger.exoplayer.MediaFormat;
import org.vidogram.messenger.exoplayer.c.e;
import org.vidogram.messenger.exoplayer.c.f;
import org.vidogram.messenger.exoplayer.c.g;
import org.vidogram.messenger.exoplayer.c.j;
import org.vidogram.messenger.exoplayer.c.l;
import org.vidogram.messenger.exoplayer.c.m;
import org.vidogram.messenger.exoplayer.r;

public final class a
  implements e, l
{
  private g a;
  private m b;
  private b c;
  private int d;
  private int e;

  public int a(f paramf, j paramj)
  {
    if (this.c == null)
    {
      this.c = c.a(paramf);
      if (this.c == null)
        throw new r("Error initializing WavHeader. Did you sniff first?");
      this.d = this.c.b();
    }
    if (!this.c.f())
    {
      c.a(paramf, this.c);
      this.b.a(MediaFormat.a(null, "audio/raw", this.c.c(), 32768, this.c.a(), this.c.e(), this.c.d(), null, null, this.c.g()));
      this.a.a(this);
    }
    int i = this.b.a(paramf, 32768 - this.e, true);
    if (i != -1)
      this.e += i;
    int j = this.e / this.d * this.d;
    if (j > 0)
    {
      long l1 = paramf.c();
      long l2 = this.e;
      this.e -= j;
      this.b.a(this.c.b(l1 - l2), 1, j, this.e, null);
    }
    if (i == -1)
      return -1;
    return 0;
  }

  public void a(g paramg)
  {
    this.a = paramg;
    this.b = paramg.d(0);
    this.c = null;
    paramg.f();
  }

  public boolean a()
  {
    return true;
  }

  public boolean a(f paramf)
  {
    return c.a(paramf) != null;
  }

  public long b(long paramLong)
  {
    return this.c.a(paramLong);
  }

  public void b()
  {
    this.e = 0;
  }

  public void c()
  {
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.exoplayer.c.f.a
 * JD-Core Version:    0.6.0
 */