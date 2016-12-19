package org.vidogram.messenger;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.IBinder;

public class NotificationsService extends Service
{
  public IBinder onBind(Intent paramIntent)
  {
    return null;
  }

  public void onCreate()
  {
    n.a("tmessages", "service started");
    ApplicationLoader.i();
  }

  public void onDestroy()
  {
    n.a("tmessages", "service destroyed");
    if (ApplicationLoader.a.getSharedPreferences("Notifications", 0).getBoolean("pushService", true))
      sendBroadcast(new Intent("org.telegram.start"));
  }

  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    return 1;
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.NotificationsService
 * JD-Core Version:    0.6.0
 */