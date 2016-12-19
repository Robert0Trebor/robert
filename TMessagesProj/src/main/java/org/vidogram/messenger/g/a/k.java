package org.vidogram.messenger.g.a;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.http.AndroidHttpClient;
import android.os.Build.VERSION;
import java.io.File;
import org.vidogram.messenger.g.m;

public class k
{
  public static m a(Context paramContext)
  {
    return a(paramContext, null);
  }

  public static m a(Context paramContext, f paramf)
  {
    File localFile = new File(paramContext.getCacheDir(), "volley");
    Object localObject = "volley/0";
    try
    {
      String str = paramContext.getPackageName();
      paramContext = paramContext.getPackageManager().getPackageInfo(str, 0);
      paramContext = str + "/" + paramContext.versionCode;
      localObject = paramContext;
      label64: paramContext = paramf;
      if (paramf == null)
        if (Build.VERSION.SDK_INT < 9)
          break label118;
      label118: for (paramContext = new g(); ; paramContext = new d(AndroidHttpClient.newInstance((String)localObject)))
      {
        paramContext = new a(paramContext);
        paramContext = new m(new c(localFile), paramContext);
        paramContext.a();
        return paramContext;
      }
    }
    catch (android.content.pm.PackageManager.NameNotFoundException paramContext)
    {
      break label64;
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.g.a.k
 * JD-Core Version:    0.6.0
 */