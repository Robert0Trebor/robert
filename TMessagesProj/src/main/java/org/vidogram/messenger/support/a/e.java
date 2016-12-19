package org.vidogram.messenger.support.a;

import android.content.ComponentName;
import android.os.IBinder;

public final class e
{
  private final g a;
  private final f b;
  private final ComponentName c;

  e(g paramg, f paramf, ComponentName paramComponentName)
  {
    this.a = paramg;
    this.b = paramf;
    this.c = paramComponentName;
  }

  IBinder a()
  {
    return this.b.asBinder();
  }

  ComponentName b()
  {
    return this.c;
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.support.a.e
 * JD-Core Version:    0.6.0
 */