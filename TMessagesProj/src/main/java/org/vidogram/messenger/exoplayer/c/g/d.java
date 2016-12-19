package org.vidogram.messenger.exoplayer.c.g;

import org.vidogram.messenger.exoplayer.c.f;
import org.vidogram.messenger.exoplayer.f.m;

final class d
{
  private final m a = new m(8);
  private int b;

  private long b(f paramf)
  {
    int m = 0;
    paramf.c(this.a.a, 0, 1);
    int k = this.a.a[0] & 0xFF;
    if (k == 0)
      return -9223372036854775808L;
    int j = 128;
    int i = 0;
    while ((k & j) == 0)
    {
      i += 1;
      j >>= 1;
    }
    k = (j ^ 0xFFFFFFFF) & k;
    paramf.c(this.a.a, 1, i);
    j = m;
    while (j < i)
    {
      k = (k << 8) + (this.a.a[(j + 1)] & 0xFF);
      j += 1;
    }
    this.b += i + 1;
    return k;
  }

  public boolean a(f paramf)
  {
    long l2 = paramf.d();
    long l1;
    if ((l2 == -1L) || (l2 > 1024L))
    {
      l1 = 1024L;
      int i = (int)l1;
      paramf.c(this.a.a, 0, 4);
      l1 = this.a.k();
      this.b = 4;
      label64: if (l1 == 440786851L)
        break label143;
      int j = this.b + 1;
      this.b = j;
      if (j != i)
        break label99;
    }
    label99: long l3;
    label143: 
    do
    {
      return false;
      l1 = l2;
      break;
      paramf.c(this.a.a, 0, 1);
      l1 = l1 << 8 & 0xFFFFFF00 | this.a.a[0] & 0xFF;
      break label64;
      l1 = b(paramf);
      l3 = this.b;
    }
    while ((l1 == -9223372036854775808L) || ((l2 != -1L) && (l3 + l1 >= l2)));
    while (true)
    {
      if (this.b >= l3 + l1)
        break label267;
      if (b(paramf) == -9223372036854775808L)
        break;
      l2 = b(paramf);
      if ((l2 < 0L) || (l2 > 2147483647L))
        break;
      if (l2 == 0L)
        continue;
      paramf.c((int)l2);
      this.b = (int)(l2 + this.b);
    }
    label267: if (this.b == l1 + l3);
    for (int k = 1; ; k = 0)
      return k;
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.exoplayer.c.g.d
 * JD-Core Version:    0.6.0
 */