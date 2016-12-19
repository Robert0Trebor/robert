package org.vidogram.messenger;

import android.annotation.TargetApi;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.media.MediaDescription.Builder;
import android.media.MediaMetadata.Builder;
import android.media.browse.MediaBrowser.MediaItem;
import android.media.session.MediaSession;
import android.media.session.MediaSession.Callback;
import android.media.session.MediaSession.QueueItem;
import android.media.session.PlaybackState.Builder;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Process;
import android.os.SystemClock;
import android.service.media.MediaBrowserService;
import android.service.media.MediaBrowserService.BrowserRoot;
import android.service.media.MediaBrowserService.Result;
import android.text.TextUtils;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import org.vidogram.SQLite.SQLiteCursor;
import org.vidogram.SQLite.SQLiteDatabase;
import org.vidogram.tgnet.NativeByteBuffer;
import org.vidogram.tgnet.g.ar;
import org.vidogram.tgnet.g.i;
import org.vidogram.tgnet.g.iz;
import org.vidogram.tgnet.g.m;
import org.vidogram.tgnet.g.vw;
import org.vidogram.tgnet.g.vx;
import org.vidogram.ui.LaunchActivity;

@TargetApi(21)
public class MusicBrowserService extends MediaBrowserService
  implements y.b
{
  private MediaSession a;
  private boolean b;
  private boolean c;
  private ArrayList<Integer> d = new ArrayList();
  private HashMap<Integer, g.vw> e = new HashMap();
  private HashMap<Integer, g.i> f = new HashMap();
  private HashMap<Integer, ArrayList<u>> g = new HashMap();
  private HashMap<Integer, ArrayList<MediaSession.QueueItem>> h = new HashMap();
  private Paint i;
  private RectF j;
  private boolean k;
  private int l;
  private a m = new a(this, null);

  private long a()
  {
    long l1 = 3076L;
    long l2 = l1;
    if (MediaController.a().j() != null)
    {
      if (!MediaController.a().s())
        l1 = 0xC04 | 0x2;
      l2 = l1 | 0x10 | 0x20;
    }
    return l2;
  }

  private Bitmap a(File paramFile)
  {
    try
    {
      Object localObject = new BitmapFactory.Options();
      ((BitmapFactory.Options)localObject).inSampleSize = 2;
      paramFile = BitmapFactory.decodeFile(paramFile.toString(), (BitmapFactory.Options)localObject);
      if (paramFile != null)
      {
        localObject = Bitmap.createBitmap(paramFile.getWidth(), paramFile.getHeight(), Bitmap.Config.ARGB_8888);
        ((Bitmap)localObject).eraseColor(0);
        Canvas localCanvas = new Canvas((Bitmap)localObject);
        BitmapShader localBitmapShader = new BitmapShader(paramFile, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
        if (this.i == null)
        {
          this.i = new Paint(1);
          this.j = new RectF();
        }
        this.i.setShader(localBitmapShader);
        this.j.set(0.0F, 0.0F, paramFile.getWidth(), paramFile.getHeight());
        localCanvas.drawRoundRect(this.j, paramFile.getWidth(), paramFile.getHeight(), this.i);
        return localObject;
      }
    }
    catch (java.lang.Throwable paramFile)
    {
      n.a("tmessages", paramFile);
    }
    return (Bitmap)null;
  }

  private void a(String paramString)
  {
    long l1 = -1L;
    u localu = MediaController.a().j();
    if (localu != null)
      l1 = localu.l * 1000;
    PlaybackState.Builder localBuilder = new PlaybackState.Builder().setActions(a());
    int n;
    if (localu == null)
    {
      n = 1;
      if (paramString != null)
      {
        localBuilder.setErrorMessage(paramString);
        n = 7;
      }
      localBuilder.setState(n, l1, 1.0F, SystemClock.elapsedRealtime());
      if (localu == null)
        break label142;
      localBuilder.setActiveQueueItemId(MediaController.a().k());
    }
    while (true)
    {
      this.a.setPlaybackState(localBuilder.build());
      return;
      if (MediaController.a().t())
      {
        n = 6;
        break;
      }
      if (MediaController.a().s())
      {
        n = 2;
        break;
      }
      n = 3;
      break;
      label142: localBuilder.setActiveQueueItemId(0L);
    }
  }

  private void a(String paramString, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> paramResult)
  {
    int n = 0;
    ArrayList localArrayList = new ArrayList();
    int i1;
    MediaDescription.Builder localBuilder;
    label150: Object localObject2;
    if ("__ROOT__".equals(paramString))
    {
      if (n >= this.d.size())
        break label525;
      i1 = ((Integer)this.d.get(n)).intValue();
      localBuilder = new MediaDescription.Builder().setMediaId("__CHAT_" + i1);
      if (i1 > 0)
      {
        paramString = (g.vw)this.e.get(Integer.valueOf(i1));
        if (paramString != null)
        {
          localBuilder.setTitle(f.a(paramString.e, paramString.f));
          if ((paramString.j == null) || (!(paramString.j.e instanceof g.iz)))
            break label273;
          paramString = paramString.j.e;
          if (paramString == null)
            break label532;
          localObject2 = a(m.a(paramString, true));
          localObject1 = localObject2;
          if (localObject2 != null)
            localBuilder.setIconBitmap((Bitmap)localObject2);
        }
      }
    }
    label273: label532: for (Object localObject1 = localObject2; ; localObject1 = null)
    {
      if ((paramString == null) || (localObject1 == null))
        localBuilder.setIconUri(Uri.parse("android.resource://" + getApplicationContext().getPackageName() + "/drawable/contact_blue"));
      localArrayList.add(new MediaBrowser.MediaItem(localBuilder.build(), 1));
      n += 1;
      break;
      localBuilder.setTitle("DELETED USER");
      paramString = null;
      break label150;
      paramString = (g.i)this.f.get(Integer.valueOf(-i1));
      if (paramString != null)
      {
        localBuilder.setTitle(paramString.i);
        if ((paramString.j != null) && ((paramString.j.b instanceof g.iz)))
        {
          paramString = paramString.j.b;
          break label150;
        }
      }
      else
      {
        localBuilder.setTitle("DELETED CHAT");
      }
      paramString = null;
      break label150;
      if ((paramString != null) && (paramString.startsWith("__CHAT_")))
        try
        {
          n = Integer.parseInt(paramString.replace("__CHAT_", ""));
          paramString = (ArrayList)this.g.get(Integer.valueOf(n));
          if (paramString != null)
          {
            i1 = 0;
            while (i1 < paramString.size())
            {
              localObject1 = (u)paramString.get(i1);
              localObject2 = new MediaDescription.Builder().setMediaId(n + "_" + i1);
              ((MediaDescription.Builder)localObject2).setTitle(((u)localObject1).O());
              ((MediaDescription.Builder)localObject2).setSubtitle(((u)localObject1).Q());
              localArrayList.add(new MediaBrowser.MediaItem(((MediaDescription.Builder)localObject2).build(), 2));
              i1 += 1;
            }
          }
        }
        catch (Exception paramString)
        {
          while (true)
          {
            n.a("tmessages", paramString);
            n = 0;
          }
        }
      paramResult.sendResult(localArrayList);
      return;
    }
  }

  private void b()
  {
    this.m.removeCallbacksAndMessages(null);
    if (!this.k)
    {
      startService(new Intent(getApplicationContext(), MusicBrowserService.class));
      this.k = true;
    }
    if (!this.a.isActive())
      this.a.setActive(true);
    Object localObject = MediaController.a().j();
    if (localObject == null)
      return;
    MediaMetadata.Builder localBuilder = new MediaMetadata.Builder();
    localBuilder.putLong("android.media.metadata.DURATION", ((u)localObject).P() * 1000);
    localBuilder.putString("android.media.metadata.ARTIST", ((u)localObject).Q());
    localBuilder.putString("android.media.metadata.TITLE", ((u)localObject).O());
    localObject = MediaController.a().n();
    if (localObject != null)
    {
      localObject = ((org.vidogram.messenger.a.a)localObject).r();
      if (localObject != null)
        localBuilder.putBitmap("android.media.metadata.ALBUM_ART", (Bitmap)localObject);
    }
    this.a.setMetadata(localBuilder.build());
  }

  private void b(String paramString)
  {
    this.m.removeCallbacksAndMessages(null);
    this.m.sendEmptyMessageDelayed(0, 30000L);
    a(paramString);
    stopSelf();
    this.k = false;
    y.a().b(this, y.aG);
    y.a().b(this, y.aO);
    y.a().b(this, y.aF);
  }

  private void c()
  {
    MediaController.a().b(MediaController.a().j());
    this.m.removeCallbacksAndMessages(null);
    this.m.sendEmptyMessageDelayed(0, 30000L);
  }

  public void a(int paramInt, Object[] paramArrayOfObject)
  {
    a(null);
    b();
  }

  public void onCreate()
  {
    super.onCreate();
    ApplicationLoader.i();
    this.l = ApplicationLoader.a.getSharedPreferences("Notifications", 0).getInt("auto_lastSelectedDialog", 0);
    this.a = new MediaSession(this, "MusicService");
    setSessionToken(this.a.getSessionToken());
    this.a.setCallback(new b(null));
    this.a.setFlags(3);
    Object localObject = getApplicationContext();
    localObject = PendingIntent.getActivity((Context)localObject, 99, new Intent((Context)localObject, LaunchActivity.class), 134217728);
    this.a.setSessionActivity((PendingIntent)localObject);
    localObject = new Bundle();
    ((Bundle)localObject).putBoolean("com.google.android.gms.car.media.ALWAYS_RESERVE_SPACE_FOR.ACTION_QUEUE", true);
    ((Bundle)localObject).putBoolean("com.google.android.gms.car.media.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", true);
    ((Bundle)localObject).putBoolean("com.google.android.gms.car.media.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", true);
    this.a.setExtras((Bundle)localObject);
    a(null);
    y.a().a(this, y.aG);
    y.a().a(this, y.aO);
    y.a().a(this, y.aF);
  }

  public void onDestroy()
  {
    b(null);
    this.m.removeCallbacksAndMessages(null);
    this.a.release();
  }

  public MediaBrowserService.BrowserRoot onGetRoot(String paramString, int paramInt, Bundle paramBundle)
  {
    if ((paramString == null) || ((1000 != paramInt) && (Process.myUid() != paramInt) && (!paramString.equals("com.google.android.mediasimulator")) && (!paramString.equals("com.google.android.projection.gearhead"))))
      return null;
    return new MediaBrowserService.BrowserRoot("__ROOT__", null);
  }

  public void onLoadChildren(String paramString, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> paramResult)
  {
    if (!this.b)
    {
      paramResult.detach();
      if (this.c)
        return;
      this.c = true;
      w.a().c().b(new Runnable(paramString, paramResult)
      {
        public void run()
        {
          ArrayList localArrayList2;
          ArrayList localArrayList1;
          int i;
          try
          {
            localArrayList2 = new ArrayList();
            localArrayList1 = new ArrayList();
            SQLiteCursor localSQLiteCursor1 = w.a().b().b(String.format(Locale.US, "SELECT DISTINCT uid FROM media_v2 WHERE uid != 0 AND mid > 0 AND type = %d", new Object[] { Integer.valueOf(4) }), new Object[0]);
            while (true)
            {
              if (!localSQLiteCursor1.a())
                break label136;
              i = (int)localSQLiteCursor1.d(0);
              if (i == 0)
                continue;
              MusicBrowserService.a(MusicBrowserService.this).add(Integer.valueOf(i));
              if (i <= 0)
                break;
              localArrayList2.add(Integer.valueOf(i));
            }
          }
          catch (Exception localException)
          {
            n.a("tmessages", localException);
          }
          while (true)
          {
            a.a(new Runnable()
            {
              public void run()
              {
                MusicBrowserService.a(MusicBrowserService.this, true);
                MusicBrowserService.b(MusicBrowserService.this, false);
                MusicBrowserService.a(MusicBrowserService.this, MusicBrowserService.1.this.a, MusicBrowserService.1.this.b);
                if ((MusicBrowserService.f(MusicBrowserService.this) == 0) && (!MusicBrowserService.a(MusicBrowserService.this).isEmpty()))
                  MusicBrowserService.a(MusicBrowserService.this, ((Integer)MusicBrowserService.a(MusicBrowserService.this).get(0)).intValue());
                Object localObject1;
                Object localObject2;
                if (MusicBrowserService.f(MusicBrowserService.this) != 0)
                {
                  localObject1 = (ArrayList)MusicBrowserService.b(MusicBrowserService.this).get(Integer.valueOf(MusicBrowserService.f(MusicBrowserService.this)));
                  localObject2 = (ArrayList)MusicBrowserService.c(MusicBrowserService.this).get(Integer.valueOf(MusicBrowserService.f(MusicBrowserService.this)));
                  if ((localObject1 != null) && (!((ArrayList)localObject1).isEmpty()))
                  {
                    MusicBrowserService.g(MusicBrowserService.this).setQueue((List)localObject2);
                    if (MusicBrowserService.f(MusicBrowserService.this) <= 0)
                      break label379;
                    localObject2 = (g.vw)MusicBrowserService.d(MusicBrowserService.this).get(Integer.valueOf(MusicBrowserService.f(MusicBrowserService.this)));
                    if (localObject2 == null)
                      break label361;
                    MusicBrowserService.g(MusicBrowserService.this).setQueueTitle(f.a(((g.vw)localObject2).e, ((g.vw)localObject2).f));
                  }
                }
                while (true)
                {
                  localObject1 = (u)((ArrayList)localObject1).get(0);
                  localObject2 = new MediaMetadata.Builder();
                  ((MediaMetadata.Builder)localObject2).putLong("android.media.metadata.DURATION", ((u)localObject1).P() * 1000);
                  ((MediaMetadata.Builder)localObject2).putString("android.media.metadata.ARTIST", ((u)localObject1).Q());
                  ((MediaMetadata.Builder)localObject2).putString("android.media.metadata.TITLE", ((u)localObject1).O());
                  MusicBrowserService.g(MusicBrowserService.this).setMetadata(((MediaMetadata.Builder)localObject2).build());
                  MusicBrowserService.a(MusicBrowserService.this, null);
                  return;
                  label361: MusicBrowserService.g(MusicBrowserService.this).setQueueTitle("DELETED USER");
                  continue;
                  label379: localObject2 = (g.i)MusicBrowserService.e(MusicBrowserService.this).get(Integer.valueOf(-MusicBrowserService.f(MusicBrowserService.this)));
                  if (localObject2 != null)
                  {
                    MusicBrowserService.g(MusicBrowserService.this).setQueueTitle(((g.i)localObject2).i);
                    continue;
                  }
                  MusicBrowserService.g(MusicBrowserService.this).setQueueTitle("DELETED CHAT");
                }
              }
            });
            return;
            i = -i;
            localArrayList1.add(Integer.valueOf(i));
            break;
            label136: localException.b();
            if (MusicBrowserService.a(MusicBrowserService.this).isEmpty())
              continue;
            Object localObject1 = TextUtils.join(",", MusicBrowserService.a(MusicBrowserService.this));
            SQLiteCursor localSQLiteCursor2 = w.a().b().b(String.format(Locale.US, "SELECT uid, data, mid FROM media_v2 WHERE uid IN (%s) AND mid > 0 AND type = %d ORDER BY date DESC, mid DESC", new Object[] { localObject1, Integer.valueOf(4) }), new Object[0]);
            Object localObject2;
            while (localSQLiteCursor2.a())
            {
              localObject1 = localSQLiteCursor2.g(1);
              if (localObject1 == null)
                continue;
              g.ar localar = g.ar.a((org.vidogram.tgnet.a)localObject1, ((NativeByteBuffer)localObject1).b(false), false);
              ((NativeByteBuffer)localObject1).e();
              if (!u.h(localar))
                continue;
              i = localSQLiteCursor2.b(0);
              localar.b = localSQLiteCursor2.b(2);
              localar.E = i;
              Object localObject3 = (ArrayList)MusicBrowserService.b(MusicBrowserService.this).get(Integer.valueOf(i));
              localObject1 = (ArrayList)MusicBrowserService.c(MusicBrowserService.this).get(Integer.valueOf(i));
              localObject2 = localObject3;
              if (localObject3 == null)
              {
                localObject2 = new ArrayList();
                MusicBrowserService.b(MusicBrowserService.this).put(Integer.valueOf(i), localObject2);
                localObject1 = new ArrayList();
                MusicBrowserService.c(MusicBrowserService.this).put(Integer.valueOf(i), localObject1);
              }
              localObject3 = new u(localar, null, false);
              ((ArrayList)localObject2).add(0, localObject3);
              localObject2 = new MediaDescription.Builder().setMediaId(i + "_" + ((ArrayList)localObject2).size());
              ((MediaDescription.Builder)localObject2).setTitle(((u)localObject3).O());
              ((MediaDescription.Builder)localObject2).setSubtitle(((u)localObject3).Q());
              ((ArrayList)localObject1).add(0, new MediaSession.QueueItem(((MediaDescription.Builder)localObject2).build(), ((ArrayList)localObject1).size()));
            }
            localSQLiteCursor2.b();
            if (!localArrayList2.isEmpty())
            {
              localObject1 = new ArrayList();
              w.a().a(TextUtils.join(",", localArrayList2), (ArrayList)localObject1);
              i = 0;
              while (i < ((ArrayList)localObject1).size())
              {
                localObject2 = (g.vw)((ArrayList)localObject1).get(i);
                MusicBrowserService.d(MusicBrowserService.this).put(Integer.valueOf(((g.vw)localObject2).d), localObject2);
                i += 1;
              }
            }
            if (localArrayList1.isEmpty())
              continue;
            localObject1 = new ArrayList();
            w.a().b(TextUtils.join(",", localArrayList1), (ArrayList)localObject1);
            i = 0;
            while (i < ((ArrayList)localObject1).size())
            {
              localObject2 = (g.i)((ArrayList)localObject1).get(i);
              MusicBrowserService.e(MusicBrowserService.this).put(Integer.valueOf(((g.i)localObject2).h), localObject2);
              i += 1;
            }
          }
        }
      });
      return;
    }
    a(paramString, paramResult);
  }

  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    return 1;
  }

  private static class a extends Handler
  {
    private final WeakReference<MusicBrowserService> a;

    private a(MusicBrowserService paramMusicBrowserService)
    {
      this.a = new WeakReference(paramMusicBrowserService);
    }

    public void handleMessage(Message paramMessage)
    {
      paramMessage = (MusicBrowserService)this.a.get();
      if ((paramMessage == null) || ((MediaController.a().j() != null) && (!MediaController.a().s())))
        return;
      paramMessage.stopSelf();
      MusicBrowserService.c(paramMessage, false);
    }
  }

  private final class b extends MediaSession.Callback
  {
    private b()
    {
    }

    public void onPause()
    {
      MusicBrowserService.i(MusicBrowserService.this);
    }

    public void onPlay()
    {
      u localu = MediaController.a().j();
      if (localu == null)
      {
        onPlayFromMediaId(MusicBrowserService.f(MusicBrowserService.this) + "_" + 0, null);
        return;
      }
      MediaController.a().a(localu);
    }

    public void onPlayFromMediaId(String paramString, Bundle paramBundle)
    {
      paramString = paramString.split("_");
      if (paramString.length != 2);
      while (true)
      {
        return;
        try
        {
          i = Integer.parseInt(paramString[0]);
          int j = Integer.parseInt(paramString[1]);
          paramString = (ArrayList)MusicBrowserService.b(MusicBrowserService.this).get(Integer.valueOf(i));
          paramBundle = (ArrayList)MusicBrowserService.c(MusicBrowserService.this).get(Integer.valueOf(i));
          if ((paramString == null) || (j < 0) || (j >= paramString.size()))
            continue;
          MusicBrowserService.a(MusicBrowserService.this, i);
          ApplicationLoader.a.getSharedPreferences("Notifications", 0).edit().putInt("auto_lastSelectedDialog", i).commit();
          MediaController.a().a(paramString, (u)paramString.get(j), false);
          MusicBrowserService.g(MusicBrowserService.this).setQueue(paramBundle);
          if (i > 0)
          {
            paramString = (g.vw)MusicBrowserService.d(MusicBrowserService.this).get(Integer.valueOf(i));
            if (paramString != null)
              MusicBrowserService.g(MusicBrowserService.this).setQueueTitle(f.a(paramString.e, paramString.f));
            while (true)
            {
              MusicBrowserService.h(MusicBrowserService.this);
              return;
              MusicBrowserService.g(MusicBrowserService.this).setQueueTitle("DELETED USER");
            }
          }
        }
        catch (Exception paramString)
        {
          while (true)
          {
            int i;
            n.a("tmessages", paramString);
            continue;
            paramString = (g.i)MusicBrowserService.e(MusicBrowserService.this).get(Integer.valueOf(-i));
            if (paramString != null)
            {
              MusicBrowserService.g(MusicBrowserService.this).setQueueTitle(paramString.i);
              continue;
            }
            MusicBrowserService.g(MusicBrowserService.this).setQueueTitle("DELETED CHAT");
          }
        }
      }
    }

    public void onPlayFromSearch(String paramString, Bundle paramBundle)
    {
      if ((paramString == null) || (paramString.length() == 0))
        return;
      paramString = paramString.toLowerCase();
      int i = 0;
      label19: int j;
      if (i < MusicBrowserService.a(MusicBrowserService.this).size())
      {
        j = ((Integer)MusicBrowserService.a(MusicBrowserService.this).get(i)).intValue();
        if (j <= 0)
          break label153;
        paramBundle = (g.vw)MusicBrowserService.d(MusicBrowserService.this).get(Integer.valueOf(j));
        if (paramBundle != null)
          break label87;
      }
      label87: 
      do
      {
        do
        {
          i += 1;
          break label19;
          break;
        }
        while (((paramBundle.e == null) || (!paramBundle.e.startsWith(paramString))) && ((paramBundle.f == null) || (!paramBundle.f.startsWith(paramString))));
        onPlayFromMediaId(j + "_" + 0, null);
        return;
        paramBundle = (g.i)MusicBrowserService.e(MusicBrowserService.this).get(Integer.valueOf(-j));
      }
      while ((paramBundle == null) || (paramBundle.i == null) || (!paramBundle.i.toLowerCase().contains(paramString)));
      label153: onPlayFromMediaId(j + "_" + 0, null);
    }

    public void onSeekTo(long paramLong)
    {
      u localu = MediaController.a().j();
      if (localu != null)
        MediaController.a().a(localu, (float)(paramLong / 1000L) / localu.P());
    }

    public void onSkipToNext()
    {
      MediaController.a().l();
    }

    public void onSkipToPrevious()
    {
      MediaController.a().m();
    }

    public void onSkipToQueueItem(long paramLong)
    {
      MediaController.a().c((int)paramLong);
      MusicBrowserService.h(MusicBrowserService.this);
    }

    public void onStop()
    {
      MusicBrowserService.b(MusicBrowserService.this, null);
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.MusicBrowserService
 * JD-Core Version:    0.6.0
 */