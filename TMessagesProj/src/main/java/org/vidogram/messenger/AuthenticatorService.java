package org.vidogram.messenger;

import android.accounts.AbstractAccountAuthenticator;
import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;

public class AuthenticatorService extends Service
{
  private static a a = null;

  protected a a()
  {
    if (a == null)
      a = new a(this);
    return a;
  }

  public IBinder onBind(Intent paramIntent)
  {
    if (paramIntent.getAction().equals("android.accounts.AccountAuthenticator"))
      return a().getIBinder();
    return null;
  }

  private static class a extends AbstractAccountAuthenticator
  {
    private final Context a;

    public a(Context paramContext)
    {
      super();
      this.a = paramContext;
    }

    public Bundle addAccount(AccountAuthenticatorResponse paramAccountAuthenticatorResponse, String paramString1, String paramString2, String[] paramArrayOfString, Bundle paramBundle)
    {
      return null;
    }

    public Bundle confirmCredentials(AccountAuthenticatorResponse paramAccountAuthenticatorResponse, Account paramAccount, Bundle paramBundle)
    {
      return null;
    }

    public Bundle editProperties(AccountAuthenticatorResponse paramAccountAuthenticatorResponse, String paramString)
    {
      return null;
    }

    public Bundle getAccountRemovalAllowed(AccountAuthenticatorResponse paramAccountAuthenticatorResponse, Account paramAccount)
    {
      return super.getAccountRemovalAllowed(paramAccountAuthenticatorResponse, paramAccount);
    }

    public Bundle getAuthToken(AccountAuthenticatorResponse paramAccountAuthenticatorResponse, Account paramAccount, String paramString, Bundle paramBundle)
    {
      return null;
    }

    public String getAuthTokenLabel(String paramString)
    {
      return null;
    }

    public Bundle hasFeatures(AccountAuthenticatorResponse paramAccountAuthenticatorResponse, Account paramAccount, String[] paramArrayOfString)
    {
      return null;
    }

    public Bundle updateCredentials(AccountAuthenticatorResponse paramAccountAuthenticatorResponse, Account paramAccount, String paramString, Bundle paramBundle)
    {
      return null;
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.AuthenticatorService
 * JD-Core Version:    0.6.0
 */