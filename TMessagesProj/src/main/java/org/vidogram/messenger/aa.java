package org.vidogram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import org.vidogram.tgnet.ConnectionsManager;

public class aa extends BroadcastReceiver
{
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if (paramIntent.getAction().equals("android.intent.action.SCREEN_OFF"))
    {
      n.a("tmessages", "screen off");
      ConnectionsManager.a().a(true, true);
      ApplicationLoader.c = false;
    }
    while (true)
    {
      y.a().a(y.J, new Object[0]);
      return;
      if (!paramIntent.getAction().equals("android.intent.action.SCREEN_ON"))
        continue;
      n.a("tmessages", "screen on");
      ConnectionsManager.a().a(false, true);
      ApplicationLoader.c = true;
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.aa
 * JD-Core Version:    0.6.0
 */