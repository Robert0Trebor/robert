package org.vidogram.messenger;

import org.vidogram.tgnet.g.di;
import org.vidogram.tgnet.g.dj;
import org.vidogram.tgnet.g.ff;
import org.vidogram.tgnet.g.fg;
import org.vidogram.tgnet.g.i;

public class e
{
  public static g.i a(long paramLong)
  {
    int i = (int)paramLong;
    int j = (int)(paramLong >> 32);
    if (i < 0)
      return v.a().b(Integer.valueOf(-i));
    return null;
  }

  public static boolean a(int paramInt)
  {
    g.i locali = v.a().b(Integer.valueOf(paramInt));
    return ((locali instanceof g.di)) || ((locali instanceof g.dj));
  }

  public static boolean a(g.i parami)
  {
    return (parami == null) || ((parami instanceof g.ff)) || ((parami instanceof g.fg)) || ((parami instanceof g.dj)) || (parami.t) || (parami.g);
  }

  public static boolean b(int paramInt)
  {
    g.i locali = v.a().b(Integer.valueOf(paramInt));
    return (locali != null) && ((locali.c) || (locali.n) || (locali.r));
  }

  public static boolean b(g.i parami)
  {
    return (parami == null) || ((parami instanceof g.ff)) || ((parami instanceof g.fg)) || ((parami instanceof g.dj)) || (parami.d) || (parami.g);
  }

  public static boolean c(g.i parami)
  {
    return (parami == null) || ((parami instanceof g.ff)) || ((parami instanceof g.fg)) || ((parami instanceof g.dj)) || (parami.t) || (parami.d) || (parami.g);
  }

  public static boolean d(g.i parami)
  {
    return ((parami instanceof g.di)) || ((parami instanceof g.dj));
  }

  public static boolean e(g.i parami)
  {
    return (!d(parami)) || (parami.c) || (parami.n) || (!parami.p);
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.e
 * JD-Core Version:    0.6.0
 */