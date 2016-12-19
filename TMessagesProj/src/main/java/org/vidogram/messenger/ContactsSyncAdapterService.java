package org.vidogram.messenger;

import android.accounts.Account;
import android.app.Service;
import android.content.AbstractThreadedSyncAdapter;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.content.SyncResult;
import android.os.Bundle;
import android.os.IBinder;

public class ContactsSyncAdapterService extends Service
{
  private static a a = null;

  private a a()
  {
    if (a == null)
      a = new a(this);
    return a;
  }

  private static void b(Context paramContext, Account paramAccount, Bundle paramBundle, String paramString, ContentProviderClient paramContentProviderClient, SyncResult paramSyncResult)
  {
    n.b("telegram", "performSync: " + paramAccount.toString());
  }

  public IBinder onBind(Intent paramIntent)
  {
    return a().getSyncAdapterBinder();
  }

  private static class a extends AbstractThreadedSyncAdapter
  {
    private Context a;

    public a(Context paramContext)
    {
      super(true);
      this.a = paramContext;
    }

    public void onPerformSync(Account paramAccount, Bundle paramBundle, String paramString, ContentProviderClient paramContentProviderClient, SyncResult paramSyncResult)
    {
      try
      {
        ContactsSyncAdapterService.a(this.a, paramAccount, paramBundle, paramString, paramContentProviderClient, paramSyncResult);
        return;
      }
      catch (android.accounts.OperationCanceledException paramAccount)
      {
        n.a("tmessages", paramAccount);
      }
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.ContactsSyncAdapterService
 * JD-Core Version:    0.6.0
 */