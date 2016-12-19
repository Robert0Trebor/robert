package org.vidogram.messenger.a.b;

public class l
{
  private final byte[] a;
  private final b b;

  l(b paramb, byte[] paramArrayOfByte)
  {
    this.b = paramb;
    this.a = paramArrayOfByte;
  }

  boolean a()
  {
    if ((this.b.e() == 0) && (this.b.b() == 1))
    {
      a locala = new a();
      locala.a(this.a[2]);
      locala.a(this.a[3]);
      int j = this.b.j();
      int i = 0;
      while (i < j)
      {
        locala.a(this.a[(i + 6)]);
        i += 1;
      }
      return ((this.a[4] & 0xFF) << 8 | this.a[5] & 0xFF) != locala.a();
    }
    return false;
  }

  public int b()
  {
    return this.a.length;
  }

  public b c()
  {
    return this.b;
  }

  boolean d()
  {
    int i = this.b.k();
    if (this.a.length < i + 12);
    do
    {
      do
        return false;
      while ((i < 0) || (this.a.length < i + 8));
      if ((this.a[i] == 88) && (this.a[(i + 1)] == 105) && (this.a[(i + 2)] == 110) && (this.a[(i + 3)] == 103))
        return true;
    }
    while ((this.a[i] != 73) || (this.a[(i + 1)] != 110) || (this.a[(i + 2)] != 102) || (this.a[(i + 3)] != 111));
    return true;
  }

  boolean e()
  {
    int i = this.b.l();
    if (this.a.length < i + 26);
    do
      return false;
    while ((this.a[i] != 86) || (this.a[(i + 1)] != 66) || (this.a[(i + 2)] != 82) || (this.a[(i + 3)] != 73));
    return true;
  }

  public int f()
  {
    int i;
    int j;
    int k;
    int m;
    if (d())
    {
      i = this.b.k();
      if ((this.a[(i + 7)] & 0x1) != 0)
      {
        j = this.a[(i + 8)];
        k = this.a[(i + 9)];
        m = this.a[(i + 10)];
        return this.a[(i + 11)] & 0xFF | ((j & 0xFF) << 24 | (k & 0xFF) << 16 | (m & 0xFF) << 8);
      }
    }
    else if (e())
    {
      i = this.b.l();
      j = this.a[(i + 14)];
      k = this.a[(i + 15)];
      m = this.a[(i + 16)];
      return this.a[(i + 17)] & 0xFF | ((j & 0xFF) << 24 | (k & 0xFF) << 16 | (m & 0xFF) << 8);
    }
    return -1;
  }

  static final class a
  {
    private short a = -1;

    public short a()
    {
      return this.a;
    }

    public void a(byte paramByte)
    {
      a(paramByte, 8);
    }

    public void a(int paramInt1, int paramInt2)
    {
      paramInt2 = 1 << paramInt2 - 1;
      int i;
      label18: int j;
      if ((this.a & 0x8000) == 0)
      {
        i = 1;
        if ((paramInt1 & paramInt2) != 0)
          break label73;
        j = 1;
        label27: if ((j ^ i) == 0)
          break label79;
        this.a = (short)(this.a << 1);
      }
      label73: label79: for (this.a = (short)(this.a ^ 0x8005); ; this.a = (short)(this.a << 1))
      {
        i = paramInt2 >>> 1;
        paramInt2 = i;
        if (i != 0)
          break;
        return;
        i = 0;
        break label18;
        j = 0;
        break label27;
      }
    }
  }

  public static class b
  {
    private static final int[][] a;
    private static final int[][] b;
    private static final int[][] c;
    private static final int[][] d;
    private static final int[] e;
    private static final int[][] f;
    private final int g;
    private final int h;
    private final int i;
    private final int j;
    private final int k;
    private final int l;
    private final int m;

    static
    {
      int[] arrayOfInt1 = { 11025, -1, 22050, 44100 };
      int[] arrayOfInt2 = { 8000, -1, 16000, 32000 };
      int[] arrayOfInt3 = { -1, -1, -1, -1 };
      a = new int[][] { arrayOfInt1, { 12000, -1, 24000, 48000 }, arrayOfInt2, arrayOfInt3 };
      arrayOfInt1 = new int[] { 416000, 320000, 256000, 224000, 144000 };
      b = new int[][] { { 0, 0, 0, 0, 0 }, { 32000, 32000, 32000, 32000, 8000 }, { 64000, 48000, 40000, 48000, 16000 }, { 96000, 56000, 48000, 56000, 24000 }, { 128000, 64000, 56000, 64000, 32000 }, { 160000, 80000, 64000, 80000, 40000 }, { 192000, 96000, 80000, 96000, 48000 }, { 224000, 112000, 96000, 112000, 56000 }, { 256000, 128000, 112000, 128000, 64000 }, { 288000, 160000, 128000, 144000, 80000 }, { 320000, 192000, 160000, 160000, 96000 }, { 352000, 224000, 192000, 176000, 112000 }, { 384000, 256000, 224000, 192000, 128000 }, arrayOfInt1, { 448000, 384000, 320000, 256000, 160000 }, { -1, -1, -1, -1, -1 } };
      c = new int[][] { { -1, 4, 4, 3 }, { -1, -1, -1, -1 }, { -1, 4, 4, 3 }, { -1, 2, 1, 0 } };
      d = new int[][] { { -1, 72, 144, 12 }, { -1, -1, -1, -1 }, { -1, 72, 144, 12 }, { -1, 144, 144, 12 } };
      e = new int[] { -1, 1, 1, 4 };
      f = new int[][] { { 17, -1, 17, 32 }, { 17, -1, 17, 32 }, { 17, -1, 17, 32 }, { 9, -1, 9, 17 } };
    }

    public b(int paramInt1, int paramInt2, int paramInt3)
    {
      this.g = (paramInt1 >> 3 & 0x3);
      if (this.g == 1)
        throw new k("Reserved version");
      this.h = (paramInt1 >> 1 & 0x3);
      if (this.h == 0)
        throw new k("Reserved layer");
      this.j = (paramInt2 >> 4 & 0xF);
      if (this.j == 15)
        throw new k("Reserved bitrate");
      if (this.j == 0)
        throw new k("Free bitrate");
      this.i = (paramInt2 >> 2 & 0x3);
      if (this.i == 3)
        throw new k("Reserved frequency");
      this.k = (paramInt3 >> 6 & 0x3);
      this.l = (paramInt2 >> 1 & 0x1);
      this.m = (paramInt1 & 0x1);
      paramInt1 = 4;
      if (this.m == 0)
        paramInt1 = 6;
      paramInt2 = paramInt1;
      if (this.h == 1)
        paramInt2 = paramInt1 + j();
      if (g() < paramInt2)
        throw new k("Frame size must be at least " + paramInt2);
    }

    public int a()
    {
      return this.g;
    }

    public long a(long paramLong)
    {
      long l1 = 1000L * (f() * paramLong) / (g() * c());
      paramLong = l1;
      if (a() != 3)
      {
        paramLong = l1;
        if (d() == 3)
          paramLong = l1 / 2L;
      }
      return paramLong;
    }

    public boolean a(b paramb)
    {
      return (this.h == paramb.h) && (this.g == paramb.g) && (this.i == paramb.i) && (this.k == paramb.k);
    }

    public int b()
    {
      return this.h;
    }

    public int c()
    {
      return a[this.i][this.g];
    }

    public int d()
    {
      return this.k;
    }

    public int e()
    {
      return this.m;
    }

    public int f()
    {
      if (this.h == 3)
        return 384;
      return 1152;
    }

    public int g()
    {
      return (d[this.g][this.h] * h() / c() + this.l) * e[this.h];
    }

    public int h()
    {
      return b[this.j][c[this.g][this.h]];
    }

    public int i()
    {
      return (int)a(g());
    }

    public int j()
    {
      return f[this.k][this.g];
    }

    public int k()
    {
      return j() + 4;
    }

    public int l()
    {
      return 36;
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.a.b.l
 * JD-Core Version:    0.6.0
 */