package org.vidogram.messenger.exoplayer.c.a;

import android.util.Pair;
import java.util.Collections;
import org.vidogram.messenger.exoplayer.MediaFormat;
import org.vidogram.messenger.exoplayer.f.c;

final class a extends d
{
  private static final int[] b = { 5500, 11000, 22000, 44000 };
  private boolean c;
  private boolean d;

  public a(org.vidogram.messenger.exoplayer.c.m paramm)
  {
    super(paramm);
  }

  protected void a(org.vidogram.messenger.exoplayer.f.m paramm, long paramLong)
  {
    int i = paramm.f();
    if ((i == 0) && (!this.d))
    {
      byte[] arrayOfByte = new byte[paramm.b()];
      paramm.a(arrayOfByte, 0, arrayOfByte.length);
      paramm = c.a(arrayOfByte);
      paramm = MediaFormat.a(null, "audio/mp4a-latm", -1, -1, a(), ((Integer)paramm.second).intValue(), ((Integer)paramm.first).intValue(), Collections.singletonList(arrayOfByte), null);
      this.a.a(paramm);
      this.d = true;
    }
    do
      return;
    while (i != 1);
    i = paramm.b();
    this.a.a(paramm, i);
    this.a.a(paramLong, 1, i, 0, null);
  }

  protected boolean a(org.vidogram.messenger.exoplayer.f.m paramm)
  {
    if (!this.c)
    {
      int j = paramm.f();
      int i = j >> 4 & 0xF;
      j = j >> 2 & 0x3;
      if ((j < 0) || (j >= b.length))
        throw new d.a("Invalid sample rate index: " + j);
      if (i != 10)
        throw new d.a("Audio format not supported: " + i);
      this.c = true;
      return true;
    }
    paramm.c(1);
    return true;
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.exoplayer.c.a.a
 * JD-Core Version:    0.6.0
 */