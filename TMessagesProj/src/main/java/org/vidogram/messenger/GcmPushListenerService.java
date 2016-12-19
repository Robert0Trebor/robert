package org.vidogram.messenger;

import android.os.Bundle;
import org.json.JSONObject;
import org.vidogram.tgnet.ConnectionsManager;

public class GcmPushListenerService extends com.google.android.gms.gcm.a
{
  public void a(String paramString, Bundle paramBundle)
  {
    n.b("tmessages", "GCM received bundle: " + paramBundle + " from: " + paramString);
    a.a(new Runnable(paramBundle)
    {
      public void run()
      {
        ApplicationLoader.i();
        try
        {
          if ("DC_UPDATE".equals(this.a.getString("loc_key")))
          {
            Object localObject = new JSONObject(this.a.getString("custom"));
            int i = ((JSONObject)localObject).getInt("dc");
            localObject = ((JSONObject)localObject).getString("addr").split(":");
            if (localObject.length != 2)
              return;
            String str = localObject[0];
            int j = Integer.parseInt(localObject[1]);
            ConnectionsManager.a().a(i, str, j);
          }
          ConnectionsManager.h();
          ConnectionsManager.a().g();
          return;
        }
        catch (Exception localException)
        {
          while (true)
            n.a("tmessages", localException);
        }
      }
    });
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.GcmPushListenerService
 * JD-Core Version:    0.6.0
 */