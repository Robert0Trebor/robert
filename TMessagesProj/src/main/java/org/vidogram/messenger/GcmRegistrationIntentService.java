package org.vidogram.messenger;

import android.app.IntentService;
import android.content.Intent;

public class GcmRegistrationIntentService extends IntentService
{
  public GcmRegistrationIntentService()
  {
    super("GcmRegistrationIntentService");
  }

  private void a(String paramString)
  {
    Utilities.c.b(new Runnable(paramString)
    {
      public void run()
      {
        ad.b = this.a;
        ad.a = false;
        ad.a(false);
        if (ad.c() != 0)
          a.a(new Runnable()
          {
            public void run()
            {
              v.a().b(GcmRegistrationIntentService.3.this.a);
            }
          });
      }
    });
  }

  protected void onHandleIntent(Intent paramIntent)
  {
    try
    {
      String str = com.google.android.gms.iid.a.c(this).b(getString(2131232666), "GCM", null);
      n.b("tmessages", "GCM Registration Token: " + str);
      a.a(new Runnable(str)
      {
        public void run()
        {
          ApplicationLoader.i();
          GcmRegistrationIntentService.a(GcmRegistrationIntentService.this, this.a);
        }
      });
      return;
    }
    catch (Exception localException)
    {
      int i;
      do
      {
        n.a("tmessages", localException);
        i = paramIntent.getIntExtra("failCount", 0);
      }
      while (i >= 60);
      paramIntent = new Runnable(i)
      {
        public void run()
        {
          try
          {
            Intent localIntent = new Intent(ApplicationLoader.a, GcmRegistrationIntentService.class);
            localIntent.putExtra("failCount", this.a + 1);
            GcmRegistrationIntentService.this.startService(localIntent);
            return;
          }
          catch (Exception localException)
          {
            n.a("tmessages", localException);
          }
        }
      };
      if (i >= 20)
        break label106;
    }
    long l = 10000L;
    while (true)
    {
      a.a(paramIntent, l);
      return;
      label106: l = 1800000L;
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.GcmRegistrationIntentService
 * JD-Core Version:    0.6.0
 */