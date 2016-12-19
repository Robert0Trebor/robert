package org.vidogram.messenger.exoplayer.a;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.Arrays;

@TargetApi(21)
public final class a
{
  public static final a a = new a(new int[] { 2 }, 2);
  private final int[] b;
  private final int c;

  a(int[] paramArrayOfInt, int paramInt)
  {
    if (paramArrayOfInt != null)
    {
      this.b = Arrays.copyOf(paramArrayOfInt, paramArrayOfInt.length);
      Arrays.sort(this.b);
    }
    while (true)
    {
      this.c = paramInt;
      return;
      this.b = new int[0];
    }
  }

  public static a a(Context paramContext)
  {
    return a(paramContext.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")));
  }

  @SuppressLint({"InlinedApi"})
  static a a(Intent paramIntent)
  {
    if ((paramIntent == null) || (paramIntent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 0))
      return a;
    return new a(paramIntent.getIntArrayExtra("android.media.extra.ENCODINGS"), paramIntent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 0));
  }

  public boolean a(int paramInt)
  {
    return Arrays.binarySearch(this.b, paramInt) >= 0;
  }

  public boolean equals(Object paramObject)
  {
    if (this == paramObject);
    do
    {
      return true;
      if (!(paramObject instanceof a))
        return false;
      paramObject = (a)paramObject;
    }
    while ((Arrays.equals(this.b, paramObject.b)) && (this.c == paramObject.c));
    return false;
  }

  public int hashCode()
  {
    return this.c + Arrays.hashCode(this.b) * 31;
  }

  public String toString()
  {
    return "AudioCapabilities[maxChannelCount=" + this.c + ", supportedEncodings=" + Arrays.toString(this.b) + "]";
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.exoplayer.a.a
 * JD-Core Version:    0.6.0
 */