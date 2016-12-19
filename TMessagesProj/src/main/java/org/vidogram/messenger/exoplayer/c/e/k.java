package org.vidogram.messenger.exoplayer.c.e;

import java.util.Arrays;
import org.vidogram.messenger.exoplayer.f.b;

final class k
{
  public byte[] a;
  public int b;
  private final int c;
  private boolean d;
  private boolean e;

  public k(int paramInt1, int paramInt2)
  {
    this.c = paramInt1;
    this.a = new byte[paramInt2 + 3];
    this.a[2] = 1;
  }

  public void a()
  {
    this.d = false;
    this.e = false;
  }

  public void a(int paramInt)
  {
    boolean bool2 = true;
    if (!this.d)
    {
      bool1 = true;
      b.b(bool1);
      if (paramInt != this.c)
        break label53;
    }
    label53: for (boolean bool1 = bool2; ; bool1 = false)
    {
      this.d = bool1;
      if (this.d)
      {
        this.b = 3;
        this.e = false;
      }
      return;
      bool1 = false;
      break;
    }
  }

  public void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (!this.d)
      return;
    paramInt2 -= paramInt1;
    if (this.a.length < this.b + paramInt2)
      this.a = Arrays.copyOf(this.a, (this.b + paramInt2) * 2);
    System.arraycopy(paramArrayOfByte, paramInt1, this.a, this.b, paramInt2);
    this.b = (paramInt2 + this.b);
  }

  public boolean b()
  {
    return this.e;
  }

  public boolean b(int paramInt)
  {
    if (!this.d)
      return false;
    this.b -= paramInt;
    this.d = false;
    this.e = true;
    return true;
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.exoplayer.c.e.k
 * JD-Core Version:    0.6.0
 */