package org.vidogram.tgnet;

public class f
{
  private static final ThreadLocal<NativeByteBuffer> b = new ThreadLocal()
  {
    protected NativeByteBuffer a()
    {
      return new NativeByteBuffer(true);
    }
  };
  public boolean a = false;

  public void a()
  {
  }

  public void a(a parama)
  {
  }

  public void a(a parama, boolean paramBoolean)
  {
  }

  public int b()
  {
    NativeByteBuffer localNativeByteBuffer = (NativeByteBuffer)b.get();
    localNativeByteBuffer.c();
    a((a)b.get());
    return localNativeByteBuffer.d();
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.tgnet.f
 * JD-Core Version:    0.6.0
 */