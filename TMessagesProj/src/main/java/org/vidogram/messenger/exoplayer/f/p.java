package org.vidogram.messenger.exoplayer.f;

import android.os.HandlerThread;
import android.os.Process;

public final class p extends HandlerThread
{
  private final int a;

  public p(String paramString, int paramInt)
  {
    super(paramString);
    this.a = paramInt;
  }

  public void run()
  {
    Process.setThreadPriority(this.a);
    super.run();
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.exoplayer.f.p
 * JD-Core Version:    0.6.0
 */