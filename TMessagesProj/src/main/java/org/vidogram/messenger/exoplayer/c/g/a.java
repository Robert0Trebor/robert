package org.vidogram.messenger.exoplayer.c.g;

import java.util.Stack;
import org.vidogram.messenger.exoplayer.c.f;
import org.vidogram.messenger.exoplayer.r;

final class a
  implements b
{
  private final byte[] a = new byte[8];
  private final Stack<a> b = new Stack();
  private final e c = new e();
  private c d;
  private int e;
  private int f;
  private long g;

  private long a(f paramf, int paramInt)
  {
    int i = 0;
    paramf.b(this.a, 0, paramInt);
    long l = 0L;
    while (i < paramInt)
    {
      l = l << 8 | this.a[i] & 0xFF;
      i += 1;
    }
    return l;
  }

  private double b(f paramf, int paramInt)
  {
    long l = a(paramf, paramInt);
    if (paramInt == 4)
      return Float.intBitsToFloat((int)l);
    return Double.longBitsToDouble(l);
  }

  private long b(f paramf)
  {
    paramf.a();
    while (true)
    {
      paramf.c(this.a, 0, 4);
      int i = e.a(this.a[0]);
      if ((i != -1) && (i <= 4))
      {
        int j = (int)e.a(this.a, i, false);
        if (this.d.b(j))
        {
          paramf.b(i);
          return j;
        }
      }
      paramf.b(1);
    }
  }

  private String c(f paramf, int paramInt)
  {
    if (paramInt == 0)
      return "";
    byte[] arrayOfByte = new byte[paramInt];
    paramf.b(arrayOfByte, 0, paramInt);
    return new String(arrayOfByte);
  }

  public void a()
  {
    this.e = 0;
    this.b.clear();
    this.c.a();
  }

  public void a(c paramc)
  {
    this.d = paramc;
  }

  public boolean a(f paramf)
  {
    boolean bool;
    if (this.d != null)
    {
      bool = true;
      org.vidogram.messenger.exoplayer.f.b.b(bool);
    }
    while (true)
    {
      if ((!this.b.isEmpty()) && (paramf.c() >= a.a((a)this.b.peek())))
      {
        this.d.c(a.b((a)this.b.pop()));
        return true;
        bool = false;
        break;
      }
      long l2;
      long l1;
      if (this.e == 0)
      {
        l2 = this.c.a(paramf, true, false, 4);
        l1 = l2;
        if (l2 == -2L)
          l1 = b(paramf);
        if (l1 == -1L)
          return false;
        this.f = (int)l1;
        this.e = 1;
      }
      if (this.e == 1)
      {
        this.g = this.c.a(paramf, false, true, 8);
        this.e = 2;
      }
      int i = this.d.a(this.f);
      switch (i)
      {
      default:
        throw new r("Invalid element type " + i);
      case 1:
        l1 = paramf.c();
        l2 = this.g;
        this.b.add(new a(this.f, l2 + l1, null));
        this.d.a(this.f, l1, this.g);
        this.e = 0;
        return true;
      case 2:
        if (this.g > 8L)
          throw new r("Invalid integer size: " + this.g);
        this.d.a(this.f, a(paramf, (int)this.g));
        this.e = 0;
        return true;
      case 5:
        if ((this.g != 4L) && (this.g != 8L))
          throw new r("Invalid float size: " + this.g);
        this.d.a(this.f, b(paramf, (int)this.g));
        this.e = 0;
        return true;
      case 3:
        if (this.g > 2147483647L)
          throw new r("String element size: " + this.g);
        this.d.a(this.f, c(paramf, (int)this.g));
        this.e = 0;
        return true;
      case 4:
        this.d.a(this.f, (int)this.g, paramf);
        this.e = 0;
        return true;
      case 0:
      }
      paramf.b((int)this.g);
      this.e = 0;
    }
  }

  private static final class a
  {
    private final int a;
    private final long b;

    private a(int paramInt, long paramLong)
    {
      this.a = paramInt;
      this.b = paramLong;
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.exoplayer.c.g.a
 * JD-Core Version:    0.6.0
 */