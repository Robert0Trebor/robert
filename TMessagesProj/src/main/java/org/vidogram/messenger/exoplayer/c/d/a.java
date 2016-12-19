package org.vidogram.messenger.exoplayer.c.d;

import java.util.Arrays;
import java.util.Collections;
import org.vidogram.messenger.exoplayer.MediaFormat;
import org.vidogram.messenger.exoplayer.c.j;
import org.vidogram.messenger.exoplayer.c.l;
import org.vidogram.messenger.exoplayer.f.e;

final class a extends f
{
  private org.vidogram.messenger.exoplayer.f.f e;
  private e f;
  private boolean g;

  static boolean a(org.vidogram.messenger.exoplayer.f.m paramm)
  {
    return (paramm.f() == 127) && (paramm.k() == 1179402563L);
  }

  public int a(org.vidogram.messenger.exoplayer.c.f paramf, j paramj)
  {
    long l = paramf.c();
    if (!this.b.a(paramf, this.a))
      return -1;
    paramf = this.a.a;
    if (this.e == null)
    {
      this.e = new org.vidogram.messenger.exoplayer.f.f(paramf, 17);
      paramf = Arrays.copyOfRange(paramf, 9, this.a.c());
      paramf[4] = -128;
      paramf = Collections.singletonList(paramf);
      paramf = MediaFormat.a(null, "audio/x-flac", this.e.a(), -1, this.e.b(), this.e.f, this.e.e, paramf, null);
      this.c.a(paramf);
    }
    while (true)
    {
      this.a.a();
      return 0;
      if (paramf[0] == -1)
      {
        if (!this.g)
        {
          if (this.f == null)
            break label253;
          this.d.a(this.f.a(l, this.e.e));
          this.f = null;
        }
        while (true)
        {
          this.g = true;
          this.c.a(this.a, this.a.c());
          this.a.b(0);
          l = org.vidogram.messenger.exoplayer.f.g.a(this.e, this.a);
          this.c.a(l, 1, this.a.c(), 0, null);
          break;
          label253: this.d.a(l.f);
        }
      }
      if (((paramf[0] & 0x7F) != 3) || (this.f != null))
        continue;
      this.f = e.a(this.a);
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.exoplayer.c.d.a
 * JD-Core Version:    0.6.0
 */