package org.vidogram.messenger.support.a;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

public abstract class d
  implements ServiceConnection
{
  public abstract void a(ComponentName paramComponentName, b paramb);

  public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    a(paramComponentName, new b(g.a.a(paramIBinder), paramComponentName)
    {
    });
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.support.a.d
 * JD-Core Version:    0.6.0
 */