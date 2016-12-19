package org.vidogram.messenger.support.a;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.a;
import android.support.v4.app.k;
import java.util.ArrayList;

public final class c
{
  public final Intent a;
  public final Bundle b;

  private c(Intent paramIntent, Bundle paramBundle)
  {
    this.a = paramIntent;
    this.b = paramBundle;
  }

  public void a(Activity paramActivity, Uri paramUri)
  {
    this.a.setData(paramUri);
    a.a(paramActivity, this.a, this.b);
  }

  public static final class a
  {
    private final Intent a = new Intent("android.intent.action.VIEW");
    private ArrayList<Bundle> b = null;
    private Bundle c = null;
    private ArrayList<Bundle> d = null;

    public a()
    {
      this(null);
    }

    public a(e parame)
    {
      if (parame != null)
        this.a.setPackage(parame.b().getPackageName());
      Bundle localBundle = new Bundle();
      if (parame == null);
      for (parame = localObject; ; parame = parame.a())
      {
        k.a(localBundle, "android.support.customtabs.extra.SESSION", parame);
        this.a.putExtras(localBundle);
        return;
      }
    }

    public a a(int paramInt)
    {
      this.a.putExtra("android.support.customtabs.extra.TOOLBAR_COLOR", paramInt);
      return this;
    }

    public a a(Bitmap paramBitmap, String paramString, PendingIntent paramPendingIntent, boolean paramBoolean)
    {
      Bundle localBundle = new Bundle();
      localBundle.putInt("android.support.customtabs.customaction.ID", 0);
      localBundle.putParcelable("android.support.customtabs.customaction.ICON", paramBitmap);
      localBundle.putString("android.support.customtabs.customaction.DESCRIPTION", paramString);
      localBundle.putParcelable("android.support.customtabs.customaction.PENDING_INTENT", paramPendingIntent);
      this.a.putExtra("android.support.customtabs.extra.ACTION_BUTTON_BUNDLE", localBundle);
      this.a.putExtra("android.support.customtabs.extra.TINT_ACTION_BUTTON", paramBoolean);
      return this;
    }

    public a a(boolean paramBoolean)
    {
      Intent localIntent = this.a;
      if (paramBoolean);
      for (int i = 1; ; i = 0)
      {
        localIntent.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", i);
        return this;
      }
    }

    public c a()
    {
      if (this.b != null)
        this.a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", this.b);
      if (this.d != null)
        this.a.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", this.d);
      return new c(this.a, this.c, null);
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.support.a.c
 * JD-Core Version:    0.6.0
 */