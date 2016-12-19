package org.vidogram.messenger.exoplayer.f;

import android.widget.MediaController.MediaPlayerControl;
import org.vidogram.messenger.exoplayer.h;

public class n
  implements MediaController.MediaPlayerControl
{
  private final h a;

  public n(h paramh)
  {
    this.a = paramh;
  }

  public boolean canPause()
  {
    return true;
  }

  public boolean canSeekBackward()
  {
    return true;
  }

  public boolean canSeekForward()
  {
    return true;
  }

  public int getAudioSessionId()
  {
    throw new UnsupportedOperationException();
  }

  public int getBufferPercentage()
  {
    return this.a.g();
  }

  public int getCurrentPosition()
  {
    if (this.a.e() == -1L)
      return 0;
    return (int)this.a.f();
  }

  public int getDuration()
  {
    if (this.a.e() == -1L)
      return 0;
    return (int)this.a.e();
  }

  public boolean isPlaying()
  {
    return this.a.b();
  }

  public void pause()
  {
    this.a.a(false);
  }

  public void seekTo(int paramInt)
  {
    long l;
    if (this.a.e() == -1L)
      l = 0L;
    while (true)
    {
      this.a.a(l);
      return;
      l = Math.min(Math.max(0, paramInt), getDuration());
    }
  }

  public void start()
  {
    this.a.a(true);
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.exoplayer.f.n
 * JD-Core Version:    0.6.0
 */