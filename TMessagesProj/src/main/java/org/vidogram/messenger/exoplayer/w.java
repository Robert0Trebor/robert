package org.vidogram.messenger.exoplayer;

import org.vidogram.messenger.exoplayer.f.b;

public abstract class w
  implements h.a
{
  private int a;

  protected abstract MediaFormat a(int paramInt);

  protected void a(int paramInt, long paramLong, boolean paramBoolean)
  {
  }

  public void a(int paramInt, Object paramObject)
  {
  }

  protected abstract void a(long paramLong1, long paramLong2);

  protected abstract boolean a(long paramLong);

  final void b(int paramInt, long paramLong, boolean paramBoolean)
  {
    boolean bool = true;
    if (this.a == 1);
    while (true)
    {
      b.b(bool);
      this.a = 2;
      a(paramInt, paramLong, paramBoolean);
      return;
      bool = false;
    }
  }

  protected abstract void b(long paramLong);

  protected abstract boolean b();

  protected abstract boolean c();

  protected abstract int c_();

  protected abstract void d();

  protected abstract long e();

  final int f(long paramLong)
  {
    int i = 1;
    boolean bool;
    if (this.a == 0)
    {
      bool = true;
      b.b(bool);
      if (!a(paramLong))
        break label41;
    }
    while (true)
    {
      this.a = i;
      return this.a;
      bool = false;
      break;
      label41: i = 0;
    }
  }

  protected abstract long f();

  protected k g()
  {
    return null;
  }

  protected void h()
  {
  }

  protected void i()
  {
  }

  protected void j()
  {
  }

  protected void t()
  {
  }

  protected final int u()
  {
    return this.a;
  }

  final void v()
  {
    if (this.a == 2);
    for (boolean bool = true; ; bool = false)
    {
      b.b(bool);
      this.a = 3;
      h();
      return;
    }
  }

  final void w()
  {
    if (this.a == 3);
    for (boolean bool = true; ; bool = false)
    {
      b.b(bool);
      this.a = 2;
      i();
      return;
    }
  }

  final void x()
  {
    if (this.a == 2);
    for (boolean bool = true; ; bool = false)
    {
      b.b(bool);
      this.a = 1;
      j();
      return;
    }
  }

  final void y()
  {
    if ((this.a != 2) && (this.a != 3) && (this.a != -1));
    for (boolean bool = true; ; bool = false)
    {
      b.b(bool);
      this.a = -1;
      t();
      return;
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.exoplayer.w
 * JD-Core Version:    0.6.0
 */