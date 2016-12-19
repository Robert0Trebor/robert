package org.vidogram.messenger;

import android.content.Intent;
import com.google.android.gms.iid.b;

public class GcmInstanceIDListenerService extends b
{
  public void b()
  {
    a.a(new Runnable()
    {
      public void run()
      {
        ApplicationLoader.i();
        Intent localIntent = new Intent(ApplicationLoader.a, GcmRegistrationIntentService.class);
        GcmInstanceIDListenerService.this.startService(localIntent);
      }
    });
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.GcmInstanceIDListenerService
 * JD-Core Version:    0.6.0
 */