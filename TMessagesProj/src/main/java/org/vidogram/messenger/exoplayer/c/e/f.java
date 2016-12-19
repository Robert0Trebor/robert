package org.vidogram.messenger.exoplayer.c.e;

import android.util.Pair;
import java.util.Arrays;
import java.util.Collections;
import org.vidogram.messenger.exoplayer.MediaFormat;
import org.vidogram.messenger.exoplayer.f.k;

final class f extends e
{
  private static final double[] b = { 23.976023976023978D, 24.0D, 25.0D, 29.970029970029969D, 30.0D, 50.0D, 59.940059940059939D, 60.0D };
  private boolean c;
  private long d;
  private final boolean[] e = new boolean[4];
  private final a f = new a(128);
  private boolean g;
  private long h;
  private long i;
  private boolean j;
  private boolean k;
  private long l;
  private long m;

  public f(org.vidogram.messenger.exoplayer.c.m paramm)
  {
    super(paramm);
  }

  private static Pair<MediaFormat, Long> a(a parama)
  {
    byte[] arrayOfByte = Arrays.copyOf(parama.c, parama.a);
    int i2 = arrayOfByte[4];
    int n = arrayOfByte[5] & 0xFF;
    int i1 = arrayOfByte[6];
    i2 = (i2 & 0xFF) << 4 | n >> 4;
    n = (n & 0xF) << 8 | i1 & 0xFF;
    float f1 = 1.0F;
    switch ((arrayOfByte[7] & 0xF0) >> 4)
    {
    default:
    case 2:
    case 3:
    case 4:
    }
    while (true)
    {
      MediaFormat localMediaFormat = MediaFormat.a(null, "video/mpeg2", -1, -1, -1L, i2, n, Collections.singletonList(arrayOfByte), -1, f1);
      long l2 = 0L;
      n = (arrayOfByte[7] & 0xF) - 1;
      long l1 = l2;
      if (n >= 0)
      {
        l1 = l2;
        if (n < b.length)
        {
          double d2 = b[n];
          i1 = parama.b;
          n = (arrayOfByte[(i1 + 9)] & 0x60) >> 5;
          i1 = arrayOfByte[(i1 + 9)] & 0x1F;
          double d1 = d2;
          if (n != i1)
            d1 = d2 * ((n + 1.0D) / (i1 + 1));
          l1 = ()(1000000.0D / d1);
        }
      }
      return Pair.create(localMediaFormat, Long.valueOf(l1));
      f1 = n * 4 / (i2 * 3);
      continue;
      f1 = n * 16 / (i2 * 9);
      continue;
      f1 = n * 121 / (i2 * 100);
    }
  }

  public void a()
  {
    k.a(this.e);
    this.f.a();
    this.j = false;
    this.g = false;
    this.h = 0L;
  }

  public void a(long paramLong, boolean paramBoolean)
  {
    if (paramLong != -1L);
    for (paramBoolean = true; ; paramBoolean = false)
    {
      this.j = paramBoolean;
      if (this.j)
        this.i = paramLong;
      return;
    }
  }

  public void a(org.vidogram.messenger.exoplayer.f.m paramm)
  {
    int i1;
    int i3;
    byte[] arrayOfByte;
    if (paramm.b() > 0)
    {
      i1 = paramm.d();
      i3 = paramm.c();
      arrayOfByte = paramm.a;
      this.h += paramm.b();
      this.a.a(paramm, paramm.b());
      n = i1;
      i1 = k.a(arrayOfByte, i1, i3, this.e);
      if (i1 != i3)
        break label93;
      if (!this.c)
        this.f.a(arrayOfByte, n, i3);
    }
    return;
    label93: int i2 = paramm.a[(i1 + 3)] & 0xFF;
    int i4;
    if (!this.c)
    {
      i4 = i1 - n;
      if (i4 > 0)
        this.f.a(arrayOfByte, n, i1);
      if (i4 >= 0)
        break label315;
      n = -i4;
      label144: if (this.f.a(i2, n))
      {
        Pair localPair = a(this.f);
        this.a.a((MediaFormat)localPair.first);
        this.d = ((Long)localPair.second).longValue();
        this.c = true;
      }
    }
    if ((this.c) && ((i2 == 184) || (i2 == 0)))
    {
      i4 = i3 - i1;
      if (this.g)
        if (!this.k)
          break label320;
    }
    label315: label320: for (int n = 1; ; n = 0)
    {
      int i5 = (int)(this.h - this.l);
      this.a.a(this.m, n, i5 - i4, i4, null);
      this.k = false;
      if (i2 != 184)
        break label325;
      this.g = false;
      this.k = true;
      i2 = i1 + 3;
      n = i1;
      i1 = i2;
      break;
      n = 0;
      break label144;
    }
    label325: long l1;
    if (this.j)
      l1 = this.i;
    while (true)
    {
      this.m = l1;
      this.l = (this.h - i4);
      this.j = false;
      this.g = true;
      break;
      l1 = this.m + this.d;
    }
  }

  public void b()
  {
  }

  private static final class a
  {
    public int a;
    public int b;
    public byte[] c;
    private boolean d;

    public a(int paramInt)
    {
      this.c = new byte[paramInt];
    }

    public void a()
    {
      this.d = false;
      this.a = 0;
      this.b = 0;
    }

    public void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    {
      if (!this.d)
        return;
      paramInt2 -= paramInt1;
      if (this.c.length < this.a + paramInt2)
        this.c = Arrays.copyOf(this.c, (this.a + paramInt2) * 2);
      System.arraycopy(paramArrayOfByte, paramInt1, this.c, this.a, paramInt2);
      this.a = (paramInt2 + this.a);
    }

    public boolean a(int paramInt1, int paramInt2)
    {
      if (this.d)
        if ((this.b == 0) && (paramInt1 == 181))
          this.b = this.a;
      while (true)
      {
        return false;
        this.a -= paramInt2;
        this.d = false;
        return true;
        if (paramInt1 != 179)
          continue;
        this.d = true;
      }
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.exoplayer.c.e.f
 * JD-Core Version:    0.6.0
 */