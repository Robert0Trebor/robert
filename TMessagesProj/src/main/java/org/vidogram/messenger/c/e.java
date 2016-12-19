package org.vidogram.messenger.c;

public final class e
{
  private final int a;
  private final int b;

  public e(int paramInt1, int paramInt2)
  {
    this.a = paramInt1;
    this.b = paramInt2;
  }

  public int a()
  {
    return this.a;
  }

  public int b()
  {
    return this.b;
  }

  public boolean equals(Object paramObject)
  {
    int i = 1;
    if (paramObject == null);
    do
    {
      return false;
      if (this == paramObject)
        return true;
    }
    while (!(paramObject instanceof e));
    paramObject = (e)paramObject;
    if ((this.a == paramObject.a) && (this.b == paramObject.b));
    while (true)
    {
      return i;
      i = 0;
    }
  }

  public int hashCode()
  {
    return this.b ^ (this.a << 16 | this.a >>> 16);
  }

  public String toString()
  {
    return this.a + "x" + this.b;
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.c.e
 * JD-Core Version:    0.6.0
 */