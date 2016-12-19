package org.vidogram.messenger.exoplayer.c.e;

import android.util.Log;
import android.util.Pair;
import java.util.Arrays;
import java.util.Collections;
import org.vidogram.messenger.exoplayer.MediaFormat;
import org.vidogram.messenger.exoplayer.f.l;

final class c extends e
{
  private static final byte[] b = { 73, 68, 51 };
  private final l c;
  private final org.vidogram.messenger.exoplayer.f.m d;
  private final org.vidogram.messenger.exoplayer.c.m e;
  private int f;
  private int g;
  private int h;
  private boolean i;
  private boolean j;
  private long k;
  private int l;
  private long m;
  private org.vidogram.messenger.exoplayer.c.m n;
  private long o;

  public c(org.vidogram.messenger.exoplayer.c.m paramm1, org.vidogram.messenger.exoplayer.c.m paramm2)
  {
    super(paramm1);
    this.e = paramm2;
    paramm2.a(MediaFormat.a());
    this.c = new l(new byte[7]);
    this.d = new org.vidogram.messenger.exoplayer.f.m(Arrays.copyOf(b, 10));
    c();
  }

  private void a(org.vidogram.messenger.exoplayer.c.m paramm, long paramLong, int paramInt1, int paramInt2)
  {
    this.f = 3;
    this.g = paramInt1;
    this.n = paramm;
    this.o = paramLong;
    this.l = paramInt2;
  }

  private boolean a(org.vidogram.messenger.exoplayer.f.m paramm, byte[] paramArrayOfByte, int paramInt)
  {
    int i1 = Math.min(paramm.b(), paramInt - this.g);
    paramm.a(paramArrayOfByte, this.g, i1);
    this.g = (i1 + this.g);
    return this.g == paramInt;
  }

  private void b(org.vidogram.messenger.exoplayer.f.m paramm)
  {
    byte[] arrayOfByte = paramm.a;
    int i1 = paramm.d();
    int i3 = paramm.c();
    while (true)
    {
      int i2;
      if (i1 < i3)
      {
        i2 = i1 + 1;
        i1 = arrayOfByte[i1] & 0xFF;
        if ((this.h == 512) && (i1 >= 240) && (i1 != 255))
        {
          if ((i1 & 0x1) == 0);
          for (boolean bool = true; ; bool = false)
          {
            this.i = bool;
            e();
            paramm.b(i2);
            return;
          }
        }
        switch (i1 | this.h)
        {
        default:
          if (this.h == 256)
            break label216;
          this.h = 256;
          i1 = i2 - 1;
          break;
        case 511:
          this.h = 512;
          i1 = i2;
          break;
        case 329:
          this.h = 768;
          i1 = i2;
          break;
        case 836:
          this.h = 1024;
          i1 = i2;
          break;
        case 1075:
          d();
          paramm.b(i2);
          return;
        }
      }
      paramm.b(i1);
      return;
      label216: i1 = i2;
    }
  }

  private void c()
  {
    this.f = 0;
    this.g = 0;
    this.h = 256;
  }

  private void c(org.vidogram.messenger.exoplayer.f.m paramm)
  {
    int i1 = Math.min(paramm.b(), this.l - this.g);
    this.n.a(paramm, i1);
    this.g = (i1 + this.g);
    if (this.g == this.l)
    {
      this.n.a(this.m, 1, this.l, 0, null);
      this.m += this.o;
      c();
    }
  }

  private void d()
  {
    this.f = 1;
    this.g = b.length;
    this.l = 0;
    this.d.b(0);
  }

  private void e()
  {
    this.f = 2;
    this.g = 0;
  }

  private void f()
  {
    this.e.a(this.d, 10);
    this.d.b(6);
    a(this.e, 0L, 10, this.d.r() + 10);
  }

  private void g()
  {
    int i1 = 2;
    this.c.a(0);
    int i2;
    if (!this.j)
    {
      i2 = this.c.c(2) + 1;
      if (i2 == 2)
        break label229;
      Log.w("AdtsReader", "Detected audio object type: " + i2 + ", but assuming AAC LC.");
    }
    while (true)
    {
      i2 = this.c.c(4);
      this.c.b(1);
      Object localObject = org.vidogram.messenger.exoplayer.f.c.a(i1, i2, this.c.c(3));
      Pair localPair = org.vidogram.messenger.exoplayer.f.c.a(localObject);
      localObject = MediaFormat.a(null, "audio/mp4a-latm", -1, -1, -1L, ((Integer)localPair.second).intValue(), ((Integer)localPair.first).intValue(), Collections.singletonList(localObject), null);
      this.k = (1024000000L / ((MediaFormat)localObject).o);
      this.a.a((MediaFormat)localObject);
      this.j = true;
      while (true)
      {
        this.c.b(4);
        i2 = this.c.c(13) - 2 - 5;
        i1 = i2;
        if (this.i)
          i1 = i2 - 2;
        a(this.a, this.k, 0, i1);
        return;
        this.c.b(10);
      }
      label229: i1 = i2;
    }
  }

  public void a()
  {
    c();
  }

  public void a(long paramLong, boolean paramBoolean)
  {
    this.m = paramLong;
  }

  public void a(org.vidogram.messenger.exoplayer.f.m paramm)
  {
    while (paramm.b() > 0)
    {
      switch (this.f)
      {
      default:
        break;
      case 0:
        b(paramm);
        break;
      case 1:
        if (!a(paramm, this.d.a, 10))
          continue;
        f();
        break;
      case 2:
        if (this.i);
        for (int i1 = 7; a(paramm, this.c.a, i1); i1 = 5)
        {
          g();
          break;
        }
      case 3:
      }
      c(paramm);
    }
  }

  public void b()
  {
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.exoplayer.c.e.c
 * JD-Core Version:    0.6.0
 */