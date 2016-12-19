package org.vidogram.messenger.exoplayer.c;

import org.vidogram.messenger.exoplayer.MediaFormat;
import org.vidogram.messenger.exoplayer.e.b;
import org.vidogram.messenger.exoplayer.s;

public class c
  implements m
{
  private final k a;
  private final s b;
  private boolean c;
  private long d;
  private long e;
  private volatile long f;
  private volatile MediaFormat g;

  public c(b paramb)
  {
    this.a = new k(paramb);
    this.b = new s(0);
    this.c = true;
    this.d = -9223372036854775808L;
    this.e = -9223372036854775808L;
    this.f = -9223372036854775808L;
  }

  private boolean f()
  {
    boolean bool1 = this.a.a(this.b);
    boolean bool2 = bool1;
    if (this.c)
      while (true)
      {
        bool2 = bool1;
        if (!bool1)
          break;
        bool2 = bool1;
        if (this.b.c())
          break;
        this.a.b();
        bool1 = this.a.a(this.b);
      }
    if (!bool2);
    do
      return false;
    while ((this.e != -9223372036854775808L) && (this.b.e >= this.e));
    return true;
  }

  public int a(f paramf, int paramInt, boolean paramBoolean)
  {
    return this.a.a(paramf, paramInt, paramBoolean);
  }

  public void a()
  {
    this.a.a();
    this.c = true;
    this.d = -9223372036854775808L;
    this.e = -9223372036854775808L;
    this.f = -9223372036854775808L;
  }

  public void a(long paramLong)
  {
    while ((this.a.a(this.b)) && (this.b.e < paramLong))
    {
      this.a.b();
      this.c = true;
    }
    this.d = -9223372036854775808L;
  }

  public void a(long paramLong, int paramInt1, int paramInt2, int paramInt3, byte[] paramArrayOfByte)
  {
    this.f = Math.max(this.f, paramLong);
    this.a.a(paramLong, paramInt1, this.a.c() - paramInt2 - paramInt3, paramInt2, paramArrayOfByte);
  }

  public void a(MediaFormat paramMediaFormat)
  {
    this.g = paramMediaFormat;
  }

  public void a(org.vidogram.messenger.exoplayer.f.m paramm, int paramInt)
  {
    this.a.a(paramm, paramInt);
  }

  public boolean a(s params)
  {
    if (!f())
      return false;
    this.a.b(params);
    this.c = false;
    this.d = params.e;
    return true;
  }

  public boolean b()
  {
    return this.g != null;
  }

  public boolean b(long paramLong)
  {
    return this.a.a(paramLong);
  }

  public MediaFormat c()
  {
    return this.g;
  }

  public long d()
  {
    return this.f;
  }

  public boolean e()
  {
    return !f();
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.exoplayer.c.c
 * JD-Core Version:    0.6.0
 */