package org.vidogram.messenger;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import org.vidogram.ui.LaunchActivity;

public class OpenChatReceiver extends Activity
{
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    paramBundle = getIntent();
    if (paramBundle == null)
      finish();
    if ((paramBundle.getAction() == null) || (!paramBundle.getAction().startsWith("com.tmessages.openchat")))
    {
      finish();
      return;
    }
    Intent localIntent = new Intent(this, LaunchActivity.class);
    localIntent.setAction(paramBundle.getAction());
    localIntent.putExtras(paramBundle);
    startActivity(localIntent);
    finish();
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.OpenChatReceiver
 * JD-Core Version:    0.6.0
 */