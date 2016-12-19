package org.vidogram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.aq;

public class AutoMessageReplyReceiver extends BroadcastReceiver
{
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    ApplicationLoader.i();
    paramContext = aq.a(paramIntent);
    if (paramContext == null);
    long l;
    int i;
    do
    {
      do
      {
        return;
        paramContext = paramContext.getCharSequence("extra_voice_reply");
      }
      while ((paramContext == null) || (paramContext.length() == 0));
      l = paramIntent.getLongExtra("dialog_id", 0L);
      i = paramIntent.getIntExtra("max_id", 0);
    }
    while ((l == 0L) || (i == 0));
    ac.a().a(paramContext.toString(), l, null, null, true, null, null, null);
    v.a().a(l, i, i, 0, true, false);
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.AutoMessageReplyReceiver
 * JD-Core Version:    0.6.0
 */