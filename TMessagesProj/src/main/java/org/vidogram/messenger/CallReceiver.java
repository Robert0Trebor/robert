package org.vidogram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import org.vidogram.a.b;

public class CallReceiver extends BroadcastReceiver
{
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    ((TelephonyManager)paramContext.getSystemService("phone")).listen(new PhoneStateListener()
    {
      public void onCallStateChanged(int paramInt, String paramString)
      {
        super.onCallStateChanged(paramInt, paramString);
        if ((paramInt == 1) && (paramString != null) && (paramString.length() > 0))
          y.a().a(y.as, new Object[] { b.b(paramString) });
      }
    }
    , 32);
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.CallReceiver
 * JD-Core Version:    0.6.0
 */