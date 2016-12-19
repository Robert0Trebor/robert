package org.vidogram.messenger;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.v4.app.ag.d;
import android.support.v4.app.ap;

public class VideoEncodingService extends Service
  implements y.b
{
  private ag.d a;
  private String b;
  private int c;

  public VideoEncodingService()
  {
    y.a().a(this, y.ax);
    y.a().a(this, y.A);
  }

  public void a(int paramInt, Object[] paramArrayOfObject)
  {
    boolean bool;
    if (paramInt == y.ax)
    {
      Object localObject = (String)paramArrayOfObject[0];
      if ((this.b != null) && (this.b.equals(localObject)))
      {
        localObject = (Float)paramArrayOfObject[1];
        paramArrayOfObject = (Boolean)paramArrayOfObject[2];
        this.c = (int)(((Float)localObject).floatValue() * 100.0F);
        paramArrayOfObject = this.a;
        paramInt = this.c;
        if (this.c != 0)
          break label108;
        bool = true;
        paramArrayOfObject.a(100, paramInt, bool);
        ap.a(ApplicationLoader.a).a(4, this.a.b());
      }
    }
    label108: 
    do
    {
      do
      {
        return;
        bool = false;
        break;
      }
      while (paramInt != y.A);
      paramArrayOfObject = (String)paramArrayOfObject[0];
    }
    while ((paramArrayOfObject != null) && (!paramArrayOfObject.equals(this.b)));
    stopSelf();
  }

  public IBinder onBind(Intent paramIntent)
  {
    return null;
  }

  public void onDestroy()
  {
    stopForeground(true);
    y.a().b(this, y.ax);
    y.a().b(this, y.A);
    n.a("tmessages", "destroy video service");
  }

  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    boolean bool1 = false;
    this.b = paramIntent.getStringExtra("path");
    boolean bool2 = paramIntent.getBooleanExtra("gif", false);
    if (this.b == null)
    {
      stopSelf();
      return 2;
    }
    n.a("tmessages", "start video service");
    if (this.a == null)
    {
      this.a = new ag.d(ApplicationLoader.a);
      this.a.a(17301640);
      this.a.a(System.currentTimeMillis());
      this.a.a(r.a("AppName", 2131230856));
      if (!bool2)
        break label200;
      this.a.c(r.a("SendingGif", 2131231808));
      this.a.b(r.a("SendingGif", 2131231808));
    }
    while (true)
    {
      this.c = 0;
      paramIntent = this.a;
      paramInt1 = this.c;
      if (this.c == 0)
        bool1 = true;
      paramIntent.a(100, paramInt1, bool1);
      startForeground(4, this.a.b());
      ap.a(ApplicationLoader.a).a(4, this.a.b());
      return 2;
      label200: this.a.c(r.a("SendingVideo", 2131231810));
      this.a.b(r.a("SendingVideo", 2131231810));
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.VideoEncodingService
 * JD-Core Version:    0.6.0
 */