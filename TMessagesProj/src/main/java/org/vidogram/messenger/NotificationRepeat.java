package org.vidogram.messenger;

import android.app.IntentService;
import android.content.Intent;

public class NotificationRepeat extends IntentService
{
  public NotificationRepeat()
  {
    super("NotificationRepeat");
  }

  protected void onHandleIntent(Intent paramIntent)
  {
    a.a(new Runnable()
    {
      public void run()
      {
        z.a().e();
      }
    });
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.NotificationRepeat
 * JD-Core Version:    0.6.0
 */