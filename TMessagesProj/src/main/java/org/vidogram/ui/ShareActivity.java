package org.vidogram.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import org.vidogram.messenger.ApplicationLoader;
import org.vidogram.messenger.Utilities;
import org.vidogram.messenger.n;
import org.vidogram.messenger.u;
import org.vidogram.tgnet.e;
import org.vidogram.tgnet.g.ar;
import org.vidogram.ui.Components.bd;

public class ShareActivity extends Activity
{
  private Dialog a;

  protected void onCreate(Bundle paramBundle)
  {
    ApplicationLoader.i();
    org.vidogram.messenger.a.a(this, getResources().getConfiguration());
    requestWindowFeature(1);
    setTheme(2131427470);
    super.onCreate(paramBundle);
    setContentView(new View(this), new ViewGroup.LayoutParams(-1, -1));
    paramBundle = getIntent();
    if ((paramBundle == null) || (!"android.intent.action.VIEW".equals(paramBundle.getAction())) || (paramBundle.getData() == null))
    {
      finish();
      return;
    }
    paramBundle = paramBundle.getData();
    Object localObject1 = paramBundle.getScheme();
    Object localObject2 = paramBundle.toString();
    paramBundle = paramBundle.getQueryParameter("hash");
    if ((!"tgb".equals(localObject1)) || (!((String)localObject2).toLowerCase().startsWith("tgb://share_game_score")) || (TextUtils.isEmpty(paramBundle)))
    {
      finish();
      return;
    }
    localObject1 = ApplicationLoader.a.getSharedPreferences("botshare", 0);
    localObject2 = ((SharedPreferences)localObject1).getString(paramBundle + "_m", null);
    if (TextUtils.isEmpty((CharSequence)localObject2))
    {
      finish();
      return;
    }
    localObject2 = new e(Utilities.d((String)localObject2));
    localObject2 = g.ar.a((org.vidogram.tgnet.a)localObject2, ((e)localObject2).b(false), false);
    if (localObject2 == null)
    {
      finish();
      return;
    }
    paramBundle = ((SharedPreferences)localObject1).getString(paramBundle + "_link", null);
    localObject1 = new u((g.ar)localObject2, null, false);
    ((u)localObject1).a.J = true;
    try
    {
      this.a = new bd(this, (u)localObject1, null, false, paramBundle);
      this.a.setCanceledOnTouchOutside(true);
      this.a.setOnDismissListener(new DialogInterface.OnDismissListener()
      {
        public void onDismiss(DialogInterface paramDialogInterface)
        {
          if (!ShareActivity.this.isFinishing())
            ShareActivity.this.finish();
          ShareActivity.a(ShareActivity.this, null);
        }
      });
      this.a.show();
      return;
    }
    catch (Exception paramBundle)
    {
      n.a("tmessages", paramBundle);
      finish();
    }
  }

  public void onPause()
  {
    super.onPause();
    try
    {
      if ((this.a != null) && (this.a.isShowing()))
      {
        this.a.dismiss();
        this.a = null;
      }
      return;
    }
    catch (Exception localException)
    {
      n.a("tmessages", localException);
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.ShareActivity
 * JD-Core Version:    0.6.0
 */