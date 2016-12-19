package org.vidogram.messenger;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.media.RemoteControlClient;
import android.media.RemoteControlClient.MetadataEditor;
import android.os.Build.VERSION;
import android.os.IBinder;
import android.support.v4.app.ag.d;
import android.widget.RemoteViews;
import org.vidogram.messenger.a.a;
import org.vidogram.ui.LaunchActivity;

public class MusicPlayerService extends Service
  implements y.b
{
  private static boolean c;
  private static boolean d;
  private RemoteControlClient a;
  private AudioManager b;

  static
  {
    boolean bool2 = true;
    if (Build.VERSION.SDK_INT >= 16)
    {
      bool1 = true;
      c = bool1;
      if (Build.VERSION.SDK_INT < 14)
        break label36;
    }
    label36: for (boolean bool1 = bool2; ; bool1 = false)
    {
      d = bool1;
      return;
      bool1 = false;
      break;
    }
  }

  @SuppressLint({"NewApi"})
  private void a(u paramu)
  {
    String str1 = paramu.O();
    String str2 = paramu.Q();
    a locala = MediaController.a().n();
    RemoteViews localRemoteViews = new RemoteViews(getApplicationContext().getPackageName(), 2130968646);
    paramu = null;
    if (c)
      paramu = new RemoteViews(getApplicationContext().getPackageName(), 2130968645);
    Object localObject = new Intent(ApplicationLoader.a, LaunchActivity.class);
    ((Intent)localObject).setAction("com.tmessages.openplayer");
    ((Intent)localObject).setFlags(32768);
    localObject = PendingIntent.getActivity(ApplicationLoader.a, 0, (Intent)localObject, 0);
    localObject = new ag.d(getApplicationContext()).a(2130838088).a((PendingIntent)localObject).a(str1).b();
    ((Notification)localObject).contentView = localRemoteViews;
    if (c)
      ((Notification)localObject).bigContentView = paramu;
    a(localRemoteViews);
    if (c)
      a(paramu);
    if (locala != null)
      paramu = locala.s();
    while (true)
    {
      if (paramu != null)
      {
        ((Notification)localObject).contentView.setImageViewBitmap(2131624140, paramu);
        if (c)
          ((Notification)localObject).bigContentView.setImageViewBitmap(2131624140, paramu);
        label212: if (!MediaController.a().t())
          break label513;
        ((Notification)localObject).contentView.setViewVisibility(2131624146, 8);
        ((Notification)localObject).contentView.setViewVisibility(2131624147, 8);
        ((Notification)localObject).contentView.setViewVisibility(2131624148, 8);
        ((Notification)localObject).contentView.setViewVisibility(2131624145, 8);
        ((Notification)localObject).contentView.setViewVisibility(2131624144, 0);
        if (c)
        {
          ((Notification)localObject).bigContentView.setViewVisibility(2131624146, 8);
          ((Notification)localObject).bigContentView.setViewVisibility(2131624147, 8);
          ((Notification)localObject).bigContentView.setViewVisibility(2131624148, 8);
          ((Notification)localObject).bigContentView.setViewVisibility(2131624145, 8);
          ((Notification)localObject).bigContentView.setViewVisibility(2131624144, 0);
        }
        label345: ((Notification)localObject).contentView.setTextViewText(2131624141, str1);
        ((Notification)localObject).contentView.setTextViewText(2131624143, str2);
        if (c)
        {
          ((Notification)localObject).bigContentView.setTextViewText(2131624141, str1);
          ((Notification)localObject).bigContentView.setTextViewText(2131624143, str2);
        }
        ((Notification)localObject).flags |= 2;
        startForeground(5, (Notification)localObject);
        if (this.a != null)
        {
          paramu = this.a.editMetadata(true);
          paramu.putString(2, str2);
          paramu.putString(7, str1);
          if ((locala == null) || (locala.r() == null));
        }
      }
      try
      {
        paramu.putBitmap(100, locala.r());
        paramu.apply();
        return;
        paramu = null;
        continue;
        ((Notification)localObject).contentView.setImageViewResource(2131624140, 2130838007);
        if (!c)
          break label212;
        ((Notification)localObject).bigContentView.setImageViewResource(2131624140, 2130838006);
        break label212;
        label513: ((Notification)localObject).contentView.setViewVisibility(2131624144, 8);
        ((Notification)localObject).contentView.setViewVisibility(2131624148, 0);
        ((Notification)localObject).contentView.setViewVisibility(2131624145, 0);
        if (c)
        {
          ((Notification)localObject).bigContentView.setViewVisibility(2131624148, 0);
          ((Notification)localObject).bigContentView.setViewVisibility(2131624145, 0);
          ((Notification)localObject).bigContentView.setViewVisibility(2131624144, 8);
        }
        if (MediaController.a().s())
        {
          ((Notification)localObject).contentView.setViewVisibility(2131624146, 8);
          ((Notification)localObject).contentView.setViewVisibility(2131624147, 0);
          if (!c)
            break label345;
          ((Notification)localObject).bigContentView.setViewVisibility(2131624146, 8);
          ((Notification)localObject).bigContentView.setViewVisibility(2131624147, 0);
          break label345;
        }
        ((Notification)localObject).contentView.setViewVisibility(2131624146, 0);
        ((Notification)localObject).contentView.setViewVisibility(2131624147, 8);
        if (!c)
          break label345;
        ((Notification)localObject).bigContentView.setViewVisibility(2131624146, 0);
        ((Notification)localObject).bigContentView.setViewVisibility(2131624147, 8);
      }
      catch (Throwable localThrowable)
      {
        while (true)
          n.a("tmessages", localThrowable);
      }
    }
  }

  public void a(int paramInt, Object[] paramArrayOfObject)
  {
    if (paramInt == y.aG)
    {
      paramArrayOfObject = MediaController.a().j();
      if (paramArrayOfObject != null)
        a(paramArrayOfObject);
    }
    else
    {
      return;
    }
    stopSelf();
  }

  public void a(RemoteViews paramRemoteViews)
  {
    paramRemoteViews.setOnClickPendingIntent(2131624145, PendingIntent.getBroadcast(getApplicationContext(), 0, new Intent("org.telegram.android.musicplayer.previous"), 134217728));
    paramRemoteViews.setOnClickPendingIntent(2131624142, PendingIntent.getBroadcast(getApplicationContext(), 0, new Intent("org.telegram.android.musicplayer.close"), 134217728));
    paramRemoteViews.setOnClickPendingIntent(2131624146, PendingIntent.getBroadcast(getApplicationContext(), 0, new Intent("org.telegram.android.musicplayer.pause"), 134217728));
    paramRemoteViews.setOnClickPendingIntent(2131624148, PendingIntent.getBroadcast(getApplicationContext(), 0, new Intent("org.telegram.android.musicplayer.next"), 134217728));
    paramRemoteViews.setOnClickPendingIntent(2131624147, PendingIntent.getBroadcast(getApplicationContext(), 0, new Intent("org.telegram.android.musicplayer.play"), 134217728));
  }

  public IBinder onBind(Intent paramIntent)
  {
    return null;
  }

  public void onCreate()
  {
    this.b = ((AudioManager)getSystemService("audio"));
    y.a().a(this, y.aE);
    y.a().a(this, y.aG);
    super.onCreate();
  }

  @SuppressLint({"NewApi"})
  public void onDestroy()
  {
    super.onDestroy();
    if (this.a != null)
    {
      RemoteControlClient.MetadataEditor localMetadataEditor = this.a.editMetadata(true);
      localMetadataEditor.clear();
      localMetadataEditor.apply();
      this.b.unregisterRemoteControlClient(this.a);
    }
    y.a().b(this, y.aE);
    y.a().b(this, y.aG);
  }

  // ERROR //
  @SuppressLint({"NewApi"})
  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    // Byte code:
    //   0: invokestatic 51	org/vidogram/messenger/MediaController:a	()Lorg/vidogram/messenger/MediaController;
    //   3: invokevirtual 216	org/vidogram/messenger/MediaController:j	()Lorg/vidogram/messenger/u;
    //   6: astore_1
    //   7: aload_1
    //   8: ifnonnull +16 -> 24
    //   11: new 8	org/vidogram/messenger/MusicPlayerService$1
    //   14: dup
    //   15: aload_0
    //   16: invokespecial 286	org/vidogram/messenger/MusicPlayerService$1:<init>	(Lorg/vidogram/messenger/MusicPlayerService;)V
    //   19: invokestatic 291	org/vidogram/messenger/a:a	(Ljava/lang/Runnable;)V
    //   22: iconst_1
    //   23: ireturn
    //   24: getstatic 27	org/vidogram/messenger/MusicPlayerService:d	Z
    //   27: ifeq +98 -> 125
    //   30: new 293	android/content/ComponentName
    //   33: dup
    //   34: aload_0
    //   35: invokevirtual 61	org/vidogram/messenger/MusicPlayerService:getApplicationContext	()Landroid/content/Context;
    //   38: ldc_w 295
    //   41: invokevirtual 300	java/lang/Class:getName	()Ljava/lang/String;
    //   44: invokespecial 303	android/content/ComponentName:<init>	(Landroid/content/Context;Ljava/lang/String;)V
    //   47: astore 4
    //   49: aload_0
    //   50: getfield 169	org/vidogram/messenger/MusicPlayerService:a	Landroid/media/RemoteControlClient;
    //   53: ifnonnull +62 -> 115
    //   56: aload_0
    //   57: getfield 256	org/vidogram/messenger/MusicPlayerService:b	Landroid/media/AudioManager;
    //   60: aload 4
    //   62: invokevirtual 307	android/media/AudioManager:registerMediaButtonEventReceiver	(Landroid/content/ComponentName;)V
    //   65: new 73	android/content/Intent
    //   68: dup
    //   69: ldc_w 309
    //   72: invokespecial 226	android/content/Intent:<init>	(Ljava/lang/String;)V
    //   75: astore 5
    //   77: aload 5
    //   79: aload 4
    //   81: invokevirtual 313	android/content/Intent:setComponent	(Landroid/content/ComponentName;)Landroid/content/Intent;
    //   84: pop
    //   85: aload_0
    //   86: new 171	android/media/RemoteControlClient
    //   89: dup
    //   90: aload_0
    //   91: iconst_0
    //   92: aload 5
    //   94: iconst_0
    //   95: invokestatic 230	android/app/PendingIntent:getBroadcast	(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;
    //   98: invokespecial 316	android/media/RemoteControlClient:<init>	(Landroid/app/PendingIntent;)V
    //   101: putfield 169	org/vidogram/messenger/MusicPlayerService:a	Landroid/media/RemoteControlClient;
    //   104: aload_0
    //   105: getfield 256	org/vidogram/messenger/MusicPlayerService:b	Landroid/media/AudioManager;
    //   108: aload_0
    //   109: getfield 169	org/vidogram/messenger/MusicPlayerService:a	Landroid/media/RemoteControlClient;
    //   112: invokevirtual 319	android/media/AudioManager:registerRemoteControlClient	(Landroid/media/RemoteControlClient;)V
    //   115: aload_0
    //   116: getfield 169	org/vidogram/messenger/MusicPlayerService:a	Landroid/media/RemoteControlClient;
    //   119: sipush 189
    //   122: invokevirtual 323	android/media/RemoteControlClient:setTransportControlFlags	(I)V
    //   125: aload_0
    //   126: aload_1
    //   127: invokespecial 218	org/vidogram/messenger/MusicPlayerService:a	(Lorg/vidogram/messenger/u;)V
    //   130: iconst_1
    //   131: ireturn
    //   132: astore_1
    //   133: aload_1
    //   134: invokevirtual 326	java/lang/Exception:printStackTrace	()V
    //   137: iconst_1
    //   138: ireturn
    //   139: astore 4
    //   141: ldc 200
    //   143: aload 4
    //   145: invokestatic 205	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   148: goto -23 -> 125
    //
    // Exception table:
    //   from	to	target	type
    //   0	7	132	java/lang/Exception
    //   11	22	132	java/lang/Exception
    //   24	49	132	java/lang/Exception
    //   125	130	132	java/lang/Exception
    //   141	148	132	java/lang/Exception
    //   49	115	139	java/lang/Exception
    //   115	125	139	java/lang/Exception
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.MusicPlayerService
 * JD-Core Version:    0.6.0
 */