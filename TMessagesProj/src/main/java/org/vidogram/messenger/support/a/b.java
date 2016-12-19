package org.vidogram.messenger.support.a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;

public class b
{
  private final g a;
  private final ComponentName b;

  b(g paramg, ComponentName paramComponentName)
  {
    this.a = paramg;
    this.b = paramComponentName;
  }

  public static boolean a(Context paramContext, String paramString, d paramd)
  {
    Intent localIntent = new Intent("android.support.customtabs.action.CustomTabsService");
    if (!TextUtils.isEmpty(paramString))
      localIntent.setPackage(paramString);
    return paramContext.bindService(localIntent, paramd, 33);
  }

  public e a(a parama)
  {
    parama = new f.a(parama)
    {
      public void a(int paramInt, Bundle paramBundle)
      {
        if (this.a != null)
          this.a.a(paramInt, paramBundle);
      }

      public void a(String paramString, Bundle paramBundle)
      {
        if (this.a != null)
          this.a.a(paramString, paramBundle);
      }
    };
    try
    {
      boolean bool = this.a.a(parama);
      if (!bool)
        return null;
      return new e(this.a, parama, this.b);
    }
    catch (RemoteException parama)
    {
    }
    return null;
  }

  public boolean a(long paramLong)
  {
    try
    {
      boolean bool = this.a.a(paramLong);
      return bool;
    }
    catch (RemoteException localRemoteException)
    {
    }
    return false;
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.support.a.b
 * JD-Core Version:    0.6.0
 */