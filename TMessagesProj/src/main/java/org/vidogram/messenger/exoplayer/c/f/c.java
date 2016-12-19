package org.vidogram.messenger.exoplayer.c.f;

import android.util.Log;
import org.vidogram.messenger.exoplayer.c.f;
import org.vidogram.messenger.exoplayer.f.m;

final class c
{
  public static b a(f paramf)
  {
    org.vidogram.messenger.exoplayer.f.b.a(paramf);
    m localm = new m(16);
    if (a.a(paramf, localm).a != org.vidogram.messenger.exoplayer.f.r.c("RIFF"))
      return null;
    paramf.c(localm.a, 0, 4);
    localm.b(0);
    int i = localm.m();
    if (i != org.vidogram.messenger.exoplayer.f.r.c("WAVE"))
    {
      Log.e("WavHeaderReader", "Unsupported RIFF format: " + i);
      return null;
    }
    for (a locala = a.a(paramf, localm); locala.a != org.vidogram.messenger.exoplayer.f.r.c("fmt "); locala = a.a(paramf, localm))
      paramf.c((int)locala.b);
    if (locala.b >= 16L);
    int j;
    int k;
    int m;
    int n;
    int i1;
    for (boolean bool = true; ; bool = false)
    {
      org.vidogram.messenger.exoplayer.f.b.b(bool);
      paramf.c(localm.a, 0, 16);
      localm.b(0);
      i = localm.h();
      j = localm.h();
      k = localm.t();
      m = localm.t();
      n = localm.h();
      i1 = localm.h();
      i2 = j * i1 / 8;
      if (n == i2)
        break;
      throw new org.vidogram.messenger.exoplayer.r("Expected block alignment: " + i2 + "; got: " + n);
    }
    int i2 = org.vidogram.messenger.exoplayer.f.r.a(i1);
    if (i2 == 0)
    {
      Log.e("WavHeaderReader", "Unsupported WAV bit depth: " + i1);
      return null;
    }
    if ((i != 1) && (i != 65534))
    {
      Log.e("WavHeaderReader", "Unsupported WAV format type: " + i);
      return null;
    }
    paramf.c((int)locala.b - 16);
    return new b(j, k, m, n, i1, i2);
  }

  public static void a(f paramf, b paramb)
  {
    org.vidogram.messenger.exoplayer.f.b.a(paramf);
    org.vidogram.messenger.exoplayer.f.b.a(paramb);
    paramf.a();
    m localm = new m(8);
    for (a locala = a.a(paramf, localm); locala.a != org.vidogram.messenger.exoplayer.f.r.c("data"); locala = a.a(paramf, localm))
    {
      Log.w("WavHeaderReader", "Ignoring unknown WAV chunk: " + locala.a);
      long l = 8L + locala.b;
      if (locala.a == org.vidogram.messenger.exoplayer.f.r.c("RIFF"))
        l = 12L;
      if (l > 2147483647L)
        throw new org.vidogram.messenger.exoplayer.r("Chunk is too large (~2GB+) to skip; id: " + locala.a);
      paramf.b((int)l);
    }
    paramf.b(8);
    paramb.a(paramf.c(), locala.b);
  }

  private static final class a
  {
    public final int a;
    public final long b;

    private a(int paramInt, long paramLong)
    {
      this.a = paramInt;
      this.b = paramLong;
    }

    public static a a(f paramf, m paramm)
    {
      paramf.c(paramm.a, 0, 8);
      paramm.b(0);
      return new a(paramm.m(), paramm.l());
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.exoplayer.c.f.c
 * JD-Core Version:    0.6.0
 */