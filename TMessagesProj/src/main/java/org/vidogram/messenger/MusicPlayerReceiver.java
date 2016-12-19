package org.vidogram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;

public class MusicPlayerReceiver extends BroadcastReceiver
{
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if (paramIntent.getAction().equals("android.intent.action.MEDIA_BUTTON"))
      if (paramIntent.getExtras() != null);
    do
    {
      do
      {
        return;
        paramContext = (KeyEvent)paramIntent.getExtras().get("android.intent.extra.KEY_EVENT");
      }
      while ((paramContext == null) || (paramContext.getAction() != 0));
      switch (paramContext.getKeyCode())
      {
      case 86:
      default:
        return;
      case 79:
      case 85:
        if (MediaController.a().s())
        {
          MediaController.a().a(MediaController.a().j());
          return;
        }
        MediaController.a().b(MediaController.a().j());
        return;
      case 126:
        MediaController.a().a(MediaController.a().j());
        return;
      case 127:
        MediaController.a().b(MediaController.a().j());
        return;
      case 87:
        MediaController.a().l();
        return;
      case 88:
      }
      MediaController.a().m();
      return;
      if (paramIntent.getAction().equals("org.telegram.android.musicplayer.play"))
      {
        MediaController.a().a(MediaController.a().j());
        return;
      }
      if ((paramIntent.getAction().equals("org.telegram.android.musicplayer.pause")) || (paramIntent.getAction().equals("android.media.AUDIO_BECOMING_NOISY")))
      {
        MediaController.a().b(MediaController.a().j());
        return;
      }
      if (paramIntent.getAction().equals("org.telegram.android.musicplayer.next"))
      {
        MediaController.a().l();
        return;
      }
      if (!paramIntent.getAction().equals("org.telegram.android.musicplayer.close"))
        continue;
      MediaController.a().a(true, true);
      return;
    }
    while (!paramIntent.getAction().equals("org.telegram.android.musicplayer.previous"));
    MediaController.a().m();
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.MusicPlayerReceiver
 * JD-Core Version:    0.6.0
 */