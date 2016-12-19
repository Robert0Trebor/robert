package org.vidogram.messenger.exoplayer.c.a;

import java.util.ArrayList;
import java.util.List;
import org.vidogram.messenger.exoplayer.MediaFormat;
import org.vidogram.messenger.exoplayer.f.b;
import org.vidogram.messenger.exoplayer.f.k;
import org.vidogram.messenger.exoplayer.f.k.b;
import org.vidogram.messenger.exoplayer.f.l;

final class e extends d
{
  private final org.vidogram.messenger.exoplayer.f.m b = new org.vidogram.messenger.exoplayer.f.m(k.a);
  private final org.vidogram.messenger.exoplayer.f.m c = new org.vidogram.messenger.exoplayer.f.m(4);
  private int d;
  private boolean e;
  private int f;

  public e(org.vidogram.messenger.exoplayer.c.m paramm)
  {
    super(paramm);
  }

  private a b(org.vidogram.messenger.exoplayer.f.m paramm)
  {
    int j = -1;
    paramm.b(4);
    int k = (paramm.f() & 0x3) + 1;
    if (k != 3);
    ArrayList localArrayList;
    int m;
    for (boolean bool = true; ; bool = false)
    {
      b.b(bool);
      localArrayList = new ArrayList();
      m = paramm.f() & 0x1F;
      i = 0;
      while (i < m)
      {
        localArrayList.add(k.a(paramm));
        i += 1;
      }
    }
    int n = paramm.f();
    int i = 0;
    while (i < n)
    {
      localArrayList.add(k.a(paramm));
      i += 1;
    }
    float f1 = 1.0F;
    if (m > 0)
    {
      paramm = new l((byte[])localArrayList.get(0));
      paramm.a((k + 1) * 8);
      paramm = k.a(paramm);
      i = paramm.b;
      j = paramm.c;
      f1 = paramm.d;
    }
    while (true)
    {
      return new a(localArrayList, k, i, j, f1);
      i = -1;
    }
  }

  protected void a(org.vidogram.messenger.exoplayer.f.m paramm, long paramLong)
  {
    int i = paramm.f();
    long l = paramm.j();
    if ((i == 0) && (!this.e))
    {
      localObject = new org.vidogram.messenger.exoplayer.f.m(new byte[paramm.b()]);
      paramm.a(((org.vidogram.messenger.exoplayer.f.m)localObject).a, 0, paramm.b());
      paramm = b((org.vidogram.messenger.exoplayer.f.m)localObject);
      this.d = paramm.b;
      paramm = MediaFormat.a(null, "video/avc", -1, -1, a(), paramm.d, paramm.e, paramm.a, -1, paramm.c);
      this.a.a(paramm);
      this.e = true;
    }
    do
      return;
    while (i != 1);
    Object localObject = this.c.a;
    localObject[0] = 0;
    localObject[1] = 0;
    localObject[2] = 0;
    int j = this.d;
    int k;
    for (i = 0; paramm.b() > 0; i = i + 4 + k)
    {
      paramm.a(this.c.a, 4 - j, this.d);
      this.c.b(0);
      k = this.c.s();
      this.b.b(0);
      this.a.a(this.b, 4);
      this.a.a(paramm, k);
    }
    paramm = this.a;
    if (this.f == 1);
    for (j = 1; ; j = 0)
    {
      paramm.a(paramLong + l * 1000L, j, i, 0, null);
      return;
    }
  }

  protected boolean a(org.vidogram.messenger.exoplayer.f.m paramm)
  {
    int j = paramm.f();
    int i = j >> 4 & 0xF;
    j &= 15;
    if (j != 7)
      throw new d.a("Video format not supported: " + j);
    this.f = i;
    return i != 5;
  }

  private static final class a
  {
    public final List<byte[]> a;
    public final int b;
    public final float c;
    public final int d;
    public final int e;

    public a(List<byte[]> paramList, int paramInt1, int paramInt2, int paramInt3, float paramFloat)
    {
      this.a = paramList;
      this.b = paramInt1;
      this.c = paramFloat;
      this.d = paramInt2;
      this.e = paramInt3;
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.exoplayer.c.a.e
 * JD-Core Version:    0.6.0
 */