package org.vidogram.messenger.g;

public class d
  implements p
{
  private int a;
  private int b;
  private final int c;
  private final float d;

  public d()
  {
    this(2500, 1, 1.0F);
  }

  public d(int paramInt1, int paramInt2, float paramFloat)
  {
    this.a = paramInt1;
    this.c = paramInt2;
    this.d = paramFloat;
  }

  public int a()
  {
    return this.a;
  }

  public void a(s params)
  {
    this.b += 1;
    this.a = (int)(this.a + this.a * this.d);
    if (!c())
      throw params;
  }

  public int b()
  {
    return this.b;
  }

  protected boolean c()
  {
    return this.b <= this.c;
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.g.d
 * JD-Core Version:    0.6.0
 */