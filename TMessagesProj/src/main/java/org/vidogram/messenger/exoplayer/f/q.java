package org.vidogram.messenger.exoplayer.f;

import android.annotation.TargetApi;
import android.os.Trace;

public final class q
{
  public static void a()
  {
    if (r.a >= 18)
      b();
  }

  public static void a(String paramString)
  {
    if (r.a >= 18)
      b(paramString);
  }

  @TargetApi(18)
  private static void b()
  {
    Trace.endSection();
  }

  @TargetApi(18)
  private static void b(String paramString)
  {
    Trace.beginSection(paramString);
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.exoplayer.f.q
 * JD-Core Version:    0.6.0
 */