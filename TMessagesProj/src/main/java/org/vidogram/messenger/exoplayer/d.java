package org.vidogram.messenger.exoplayer;

import android.annotation.TargetApi;
import android.media.MediaCodec.CryptoInfo;
import org.vidogram.messenger.exoplayer.f.r;

public final class d
{
  public byte[] a;
  public byte[] b;
  public int c;
  public int[] d;
  public int[] e;
  public int f;
  private final MediaCodec.CryptoInfo g;

  public d()
  {
    if (r.a >= 16);
    for (MediaCodec.CryptoInfo localCryptoInfo = b(); ; localCryptoInfo = null)
    {
      this.g = localCryptoInfo;
      return;
    }
  }

  @TargetApi(16)
  private MediaCodec.CryptoInfo b()
  {
    return new MediaCodec.CryptoInfo();
  }

  @TargetApi(16)
  private void c()
  {
    this.g.set(this.f, this.d, this.e, this.b, this.a, this.c);
  }

  @TargetApi(16)
  public MediaCodec.CryptoInfo a()
  {
    return this.g;
  }

  public void a(int paramInt1, int[] paramArrayOfInt1, int[] paramArrayOfInt2, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt2)
  {
    this.f = paramInt1;
    this.d = paramArrayOfInt1;
    this.e = paramArrayOfInt2;
    this.b = paramArrayOfByte1;
    this.a = paramArrayOfByte2;
    this.c = paramInt2;
    if (r.a >= 16)
      c();
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.exoplayer.d
 * JD-Core Version:    0.6.0
 */