package org.vidogram.messenger.exoplayer;

import android.annotation.TargetApi;
import android.media.MediaCodecInfo.CodecCapabilities;
import org.vidogram.messenger.exoplayer.f.r;

@TargetApi(16)
public final class e
{
  public final String a;
  public final MediaCodecInfo.CodecCapabilities b;
  public final boolean c;

  e(String paramString, MediaCodecInfo.CodecCapabilities paramCodecCapabilities)
  {
    this.a = paramString;
    this.b = paramCodecCapabilities;
    this.c = a(paramCodecCapabilities);
  }

  private static boolean a(MediaCodecInfo.CodecCapabilities paramCodecCapabilities)
  {
    return (paramCodecCapabilities != null) && (r.a >= 19) && (b(paramCodecCapabilities));
  }

  @TargetApi(19)
  private static boolean b(MediaCodecInfo.CodecCapabilities paramCodecCapabilities)
  {
    return paramCodecCapabilities.isFeatureSupported("adaptive-playback");
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.exoplayer.e
 * JD-Core Version:    0.6.0
 */