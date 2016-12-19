package org.vidogram.messenger.exoplayer.c.d;

import java.io.EOFException;
import org.vidogram.messenger.exoplayer.c.f;
import org.vidogram.messenger.exoplayer.f.m;

final class e
{
  private static final int a = org.vidogram.messenger.exoplayer.f.r.c("OggS");

  public static int a(byte paramByte, int paramInt1, int paramInt2)
  {
    return paramByte >> paramInt2 & 255 >>> 8 - paramInt1;
  }

  public static void a(b paramb, int paramInt, a parama)
  {
    parama.b = 0;
    parama.a = 0;
    int i;
    do
    {
      if (parama.b + paramInt >= paramb.g)
        break;
      int[] arrayOfInt = paramb.j;
      i = parama.b;
      parama.b = (i + 1);
      i = arrayOfInt[(i + paramInt)];
      parama.a += i;
    }
    while (i == 255);
  }

  public static void a(f paramf)
  {
    byte[] arrayOfByte = new byte[2048];
    int i;
    for (int j = arrayOfByte.length; ; j = i)
    {
      i = j;
      if (paramf.d() != -1L)
      {
        i = j;
        if (paramf.c() + j > paramf.d())
        {
          j = (int)(paramf.d() - paramf.c());
          i = j;
          if (j < 4)
            throw new EOFException();
        }
      }
      paramf.b(arrayOfByte, 0, i, false);
      j = 0;
      while (j < i - 3)
      {
        if ((arrayOfByte[j] == 79) && (arrayOfByte[(j + 1)] == 103) && (arrayOfByte[(j + 2)] == 103) && (arrayOfByte[(j + 3)] == 83))
        {
          paramf.b(j);
          return;
        }
        j += 1;
      }
      paramf.b(i - 3);
    }
  }

  public static boolean a(f paramf, b paramb, m paramm, boolean paramBoolean)
  {
    int j = 0;
    paramm.a();
    paramb.a();
    if ((paramf.d() == -1L) || (paramf.d() - paramf.b() >= 27L))
    {
      i = 1;
      if ((i != 0) && (paramf.b(paramm.a, 0, 27, true)))
        break label89;
      if (!paramBoolean)
        break label81;
    }
    label81: label89: label115: 
    do
    {
      do
      {
        return false;
        i = 0;
        break;
        throw new EOFException();
        if (paramm.k() == a)
          break label115;
      }
      while (paramBoolean);
      throw new org.vidogram.messenger.exoplayer.r("expected OggS capture pattern at begin of page");
      paramb.a = paramm.f();
      if (paramb.a == 0)
        break label144;
    }
    while (paramBoolean);
    throw new org.vidogram.messenger.exoplayer.r("unsupported bit stream revision");
    label144: paramb.b = paramm.f();
    paramb.c = paramm.p();
    paramb.d = paramm.l();
    paramb.e = paramm.l();
    paramb.f = paramm.l();
    paramb.g = paramm.f();
    paramm.a();
    paramb.h = (paramb.g + 27);
    paramf.c(paramm.a, 0, paramb.g);
    int i = j;
    while (i < paramb.g)
    {
      paramb.j[i] = paramm.f();
      paramb.i += paramb.j[i];
      i += 1;
    }
    return true;
  }

  public static class a
  {
    public int a;
    public int b;
  }

  public static final class b
  {
    public int a;
    public int b;
    public long c;
    public long d;
    public long e;
    public long f;
    public int g;
    public int h;
    public int i;
    public final int[] j = new int['ÿ'];

    public void a()
    {
      this.a = 0;
      this.b = 0;
      this.c = 0L;
      this.d = 0L;
      this.e = 0L;
      this.f = 0L;
      this.g = 0;
      this.h = 0;
      this.i = 0;
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.exoplayer.c.d.e
 * JD-Core Version:    0.6.0
 */