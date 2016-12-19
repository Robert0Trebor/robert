package org.vidogram.messenger.exoplayer.c.e;

import android.util.Log;
import java.util.Collections;
import org.vidogram.messenger.exoplayer.MediaFormat;
import org.vidogram.messenger.exoplayer.f.l;

final class h extends e
{
  private boolean b;
  private final n c;
  private final boolean[] d;
  private final k e;
  private final k f;
  private final k g;
  private final k h;
  private final k i;
  private final a j;
  private long k;
  private long l;
  private final org.vidogram.messenger.exoplayer.f.m m;

  public h(org.vidogram.messenger.exoplayer.c.m paramm, n paramn)
  {
    super(paramm);
    this.c = paramn;
    this.d = new boolean[3];
    this.e = new k(32, 128);
    this.f = new k(33, 128);
    this.g = new k(34, 128);
    this.h = new k(39, 128);
    this.i = new k(40, 128);
    this.j = new a(paramm);
    this.m = new org.vidogram.messenger.exoplayer.f.m();
  }

  private static MediaFormat a(k paramk1, k paramk2, k paramk3)
  {
    byte[] arrayOfByte = new byte[paramk1.b + paramk2.b + paramk3.b];
    System.arraycopy(paramk1.a, 0, arrayOfByte, 0, paramk1.b);
    System.arraycopy(paramk2.a, 0, arrayOfByte, paramk1.b, paramk2.b);
    System.arraycopy(paramk3.a, 0, arrayOfByte, paramk1.b + paramk2.b, paramk3.b);
    org.vidogram.messenger.exoplayer.f.k.a(paramk2.a, paramk2.b);
    paramk1 = new l(paramk2.a);
    paramk1.b(44);
    int i3 = paramk1.c(3);
    paramk1.b(1);
    paramk1.b(88);
    paramk1.b(8);
    int n = 0;
    int i2 = 0;
    while (i2 < i3)
    {
      i1 = n;
      if (paramk1.b())
        i1 = n + 89;
      n = i1;
      if (paramk1.b())
        n = i1 + 8;
      i2 += 1;
    }
    paramk1.b(n);
    if (i3 > 0)
      paramk1.b((8 - i3) * 2);
    paramk1.d();
    int i9 = paramk1.d();
    if (i9 == 3)
      paramk1.b(1);
    int i5 = paramk1.d();
    int i4 = paramk1.d();
    i2 = i5;
    int i1 = i4;
    if (paramk1.b())
    {
      i2 = paramk1.d();
      int i8 = paramk1.d();
      int i6 = paramk1.d();
      int i7 = paramk1.d();
      if ((i9 == 1) || (i9 == 2))
      {
        n = 2;
        if (i9 != 1)
          break label394;
        i1 = 2;
        label305: i2 = i5 - n * (i2 + i8);
        i1 = i4 - i1 * (i6 + i7);
      }
    }
    else
    {
      paramk1.d();
      paramk1.d();
      i4 = paramk1.d();
      if (!paramk1.b())
        break label400;
      n = 0;
    }
    while (true)
    {
      if (n > i3)
        break label407;
      paramk1.d();
      paramk1.d();
      paramk1.d();
      n += 1;
      continue;
      n = 1;
      break;
      label394: i1 = 1;
      break label305;
      label400: n = i3;
    }
    label407: paramk1.d();
    paramk1.d();
    paramk1.d();
    paramk1.d();
    paramk1.d();
    paramk1.d();
    if ((paramk1.b()) && (paramk1.b()))
      a(paramk1);
    paramk1.b(2);
    if (paramk1.b())
    {
      paramk1.b(8);
      paramk1.d();
      paramk1.d();
      paramk1.b(1);
    }
    b(paramk1);
    if (paramk1.b())
    {
      n = 0;
      while (n < paramk1.d())
      {
        paramk1.b(i4 + 4 + 1);
        n += 1;
      }
    }
    paramk1.b(2);
    float f2 = 1.0F;
    float f1;
    if ((paramk1.b()) && (paramk1.b()))
    {
      n = paramk1.c(8);
      if (n == 255)
      {
        n = paramk1.c(16);
        i3 = paramk1.c(16);
        f1 = f2;
        if (n != 0)
        {
          f1 = f2;
          if (i3 != 0)
            f1 = n / i3;
        }
      }
    }
    while (true)
    {
      return MediaFormat.a(null, "video/hevc", -1, -1, -1L, i2, i1, Collections.singletonList(arrayOfByte), -1, f1);
      if (n < org.vidogram.messenger.exoplayer.f.k.b.length)
      {
        f1 = org.vidogram.messenger.exoplayer.f.k.b[n];
        continue;
      }
      Log.w("H265Reader", "Unexpected aspect_ratio_idc value: " + n);
      f1 = 1.0F;
    }
  }

  private void a(long paramLong1, int paramInt1, int paramInt2, long paramLong2)
  {
    if (this.b)
      this.j.a(paramLong1, paramInt1, paramInt2, paramLong2);
    while (true)
    {
      this.h.a(paramInt2);
      this.i.a(paramInt2);
      return;
      this.e.a(paramInt2);
      this.f.a(paramInt2);
      this.g.a(paramInt2);
    }
  }

  private static void a(l paraml)
  {
    int n = 0;
    while (n < 4)
    {
      int i1 = 0;
      if (i1 < 6)
      {
        if (!paraml.b())
        {
          paraml.d();
          label27: if (n != 3)
            break label85;
        }
        label85: for (int i2 = 3; ; i2 = 1)
        {
          i1 = i2 + i1;
          break;
          int i3 = Math.min(64, 1 << (n << 1) + 4);
          if (n > 1)
            paraml.e();
          i2 = 0;
          while (i2 < i3)
          {
            paraml.e();
            i2 += 1;
          }
          break label27;
        }
      }
      n += 1;
    }
  }

  private void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (this.b)
      this.j.a(paramArrayOfByte, paramInt1, paramInt2);
    while (true)
    {
      this.h.a(paramArrayOfByte, paramInt1, paramInt2);
      this.i.a(paramArrayOfByte, paramInt1, paramInt2);
      return;
      this.e.a(paramArrayOfByte, paramInt1, paramInt2);
      this.f.a(paramArrayOfByte, paramInt1, paramInt2);
      this.g.a(paramArrayOfByte, paramInt1, paramInt2);
    }
  }

  private void b(long paramLong1, int paramInt1, int paramInt2, long paramLong2)
  {
    if (this.b)
      this.j.a(paramLong1, paramInt1);
    while (true)
    {
      if (this.h.b(paramInt2))
      {
        paramInt1 = org.vidogram.messenger.exoplayer.f.k.a(this.h.a, this.h.b);
        this.m.a(this.h.a, paramInt1);
        this.m.c(5);
        this.c.a(paramLong2, this.m);
      }
      if (this.i.b(paramInt2))
      {
        paramInt1 = org.vidogram.messenger.exoplayer.f.k.a(this.i.a, this.i.b);
        this.m.a(this.i.a, paramInt1);
        this.m.c(5);
        this.c.a(paramLong2, this.m);
      }
      return;
      this.e.b(paramInt2);
      this.f.b(paramInt2);
      this.g.b(paramInt2);
      if ((!this.e.b()) || (!this.f.b()) || (!this.g.b()))
        continue;
      this.a.a(a(this.e, this.f, this.g));
      this.b = true;
    }
  }

  private static void b(l paraml)
  {
    int i4 = paraml.d();
    int n = 0;
    int i2 = 0;
    boolean bool = false;
    if (n < i4)
    {
      if (n == 0)
        break label155;
      bool = paraml.b();
    }
    label155: 
    while (true)
    {
      if (bool)
      {
        paraml.b(1);
        paraml.d();
        i3 = 0;
        while (true)
        {
          i1 = i2;
          if (i3 > i2)
            break;
          if (paraml.b())
            paraml.b(1);
          i3 += 1;
        }
      }
      i2 = paraml.d();
      int i5 = paraml.d();
      int i3 = i2 + i5;
      int i1 = 0;
      while (i1 < i2)
      {
        paraml.d();
        paraml.b(1);
        i1 += 1;
      }
      i2 = 0;
      while (true)
      {
        i1 = i3;
        if (i2 >= i5)
          break;
        paraml.d();
        paraml.b(1);
        i2 += 1;
      }
      n += 1;
      i2 = i1;
      break;
      return;
    }
  }

  public void a()
  {
    org.vidogram.messenger.exoplayer.f.k.a(this.d);
    this.e.a();
    this.f.a();
    this.g.a();
    this.h.a();
    this.i.a();
    this.j.a();
    this.k = 0L;
  }

  public void a(long paramLong, boolean paramBoolean)
  {
    this.l = paramLong;
  }

  public void a(org.vidogram.messenger.exoplayer.f.m paramm)
  {
    int i1;
    byte[] arrayOfByte;
    int i2;
    while (paramm.b() > 0)
    {
      n = paramm.d();
      i1 = paramm.c();
      arrayOfByte = paramm.a;
      this.k += paramm.b();
      this.a.a(paramm, paramm.b());
      if (n >= i1)
        continue;
      i2 = org.vidogram.messenger.exoplayer.f.k.a(arrayOfByte, n, i1, this.d);
      if (i2 != i1)
        break label84;
      a(arrayOfByte, n, i1);
    }
    return;
    label84: int i3 = org.vidogram.messenger.exoplayer.f.k.c(arrayOfByte, i2);
    int i5 = i2 - n;
    if (i5 > 0)
      a(arrayOfByte, n, i2);
    int i4 = i1 - i2;
    long l1 = this.k - i4;
    if (i5 < 0);
    for (int n = -i5; ; n = 0)
    {
      b(l1, i4, n, this.l);
      a(l1, i4, i3, this.l);
      n = i2 + 3;
      break;
    }
  }

  public void b()
  {
  }

  private static final class a
  {
    private final org.vidogram.messenger.exoplayer.c.m a;
    private long b;
    private boolean c;
    private int d;
    private long e;
    private boolean f;
    private boolean g;
    private boolean h;
    private boolean i;
    private boolean j;
    private long k;
    private long l;
    private boolean m;

    public a(org.vidogram.messenger.exoplayer.c.m paramm)
    {
      this.a = paramm;
    }

    private void a(int paramInt)
    {
      if (this.m);
      for (int n = 1; ; n = 0)
      {
        int i1 = (int)(this.b - this.k);
        this.a.a(this.l, n, i1, paramInt, null);
        return;
      }
    }

    public void a()
    {
      this.f = false;
      this.g = false;
      this.h = false;
      this.i = false;
      this.j = false;
    }

    public void a(long paramLong, int paramInt)
    {
      if ((this.j) && (this.g))
      {
        this.m = this.c;
        this.j = false;
      }
      do
        return;
      while ((!this.h) && (!this.g));
      if (this.i)
        a((int)(paramLong - this.b) + paramInt);
      this.k = this.b;
      this.l = this.e;
      this.i = true;
      this.m = this.c;
    }

    public void a(long paramLong1, int paramInt1, int paramInt2, long paramLong2)
    {
      boolean bool2 = false;
      this.g = false;
      this.h = false;
      this.e = paramLong2;
      this.d = 0;
      this.b = paramLong1;
      if (paramInt2 >= 32)
      {
        if ((!this.j) && (this.i))
        {
          a(paramInt1);
          this.i = false;
        }
        if (paramInt2 <= 34)
        {
          if (this.j)
            break label139;
          bool1 = true;
          this.h = bool1;
          this.j = true;
        }
      }
      if ((paramInt2 >= 16) && (paramInt2 <= 21));
      for (boolean bool1 = true; ; bool1 = false)
      {
        this.c = bool1;
        if (!this.c)
        {
          bool1 = bool2;
          if (paramInt2 > 9);
        }
        else
        {
          bool1 = true;
        }
        this.f = bool1;
        return;
        label139: bool1 = false;
        break;
      }
    }

    public void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    {
      if (this.f)
      {
        int n = paramInt1 + 2 - this.d;
        if (n >= paramInt2)
          break label55;
        if ((paramArrayOfByte[n] & 0x80) == 0)
          break label49;
      }
      label49: for (boolean bool = true; ; bool = false)
      {
        this.g = bool;
        this.f = false;
        return;
      }
      label55: this.d += paramInt2 - paramInt1;
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.exoplayer.c.e.h
 * JD-Core Version:    0.6.0
 */