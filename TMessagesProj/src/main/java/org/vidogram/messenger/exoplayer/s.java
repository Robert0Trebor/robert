package org.vidogram.messenger.exoplayer;

import java.nio.ByteBuffer;

public final class s
{
  public final d a = new d();
  public ByteBuffer b;
  public int c;
  public int d;
  public long e;
  private final int f;

  public s(int paramInt)
  {
    this.f = paramInt;
  }

  private ByteBuffer b(int paramInt)
  {
    if (this.f == 1)
      return ByteBuffer.allocate(paramInt);
    if (this.f == 2)
      return ByteBuffer.allocateDirect(paramInt);
    if (this.b == null);
    for (int i = 0; ; i = this.b.capacity())
      throw new IllegalStateException("Buffer too small (" + i + " < " + paramInt + ")");
  }

  public void a(int paramInt)
  {
    if (this.b == null)
      this.b = b(paramInt);
    int i;
    int j;
    do
    {
      return;
      i = this.b.capacity();
      j = this.b.position();
      paramInt = j + paramInt;
    }
    while (i >= paramInt);
    ByteBuffer localByteBuffer = b(paramInt);
    if (j > 0)
    {
      this.b.position(0);
      this.b.limit(j);
      localByteBuffer.put(this.b);
    }
    this.b = localByteBuffer;
  }

  public boolean a()
  {
    return (this.d & 0x2) != 0;
  }

  public boolean b()
  {
    return (this.d & 0x8000000) != 0;
  }

  public boolean c()
  {
    return (this.d & 0x1) != 0;
  }

  public void d()
  {
    if (this.b != null)
      this.b.clear();
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.exoplayer.s
 * JD-Core Version:    0.6.0
 */