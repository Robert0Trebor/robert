package org.vidogram.messenger.support.b.a;

import android.content.ComponentName;
import java.lang.ref.WeakReference;
import org.vidogram.messenger.support.a.d;

public class b extends d
{
  private WeakReference<c> a;

  public b(c paramc)
  {
    this.a = new WeakReference(paramc);
  }

  public void a(ComponentName paramComponentName, org.vidogram.messenger.support.a.b paramb)
  {
    paramComponentName = (c)this.a.get();
    if (paramComponentName != null)
      paramComponentName.a(paramb);
  }

  public void onServiceDisconnected(ComponentName paramComponentName)
  {
    paramComponentName = (c)this.a.get();
    if (paramComponentName != null)
      paramComponentName.a();
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.support.b.a.b
 * JD-Core Version:    0.6.0
 */