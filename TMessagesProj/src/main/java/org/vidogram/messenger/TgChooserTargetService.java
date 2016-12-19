package org.vidogram.messenger;

import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.service.chooser.ChooserTarget;
import android.service.chooser.ChooserTargetService;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Semaphore;
import org.vidogram.SQLite.SQLiteCursor;
import org.vidogram.SQLite.SQLiteDatabase;
import org.vidogram.tgnet.g.i;
import org.vidogram.tgnet.g.m;
import org.vidogram.tgnet.g.vw;
import org.vidogram.tgnet.g.vx;
import org.vidogram.ui.LaunchActivity;

@TargetApi(23)
public class TgChooserTargetService extends ChooserTargetService
{
  private Paint a;
  private RectF b;

  private Icon a(File paramFile)
  {
    try
    {
      paramFile = BitmapFactory.decodeFile(paramFile.toString());
      if (paramFile != null)
      {
        Bitmap localBitmap = Bitmap.createBitmap(paramFile.getWidth(), paramFile.getHeight(), Bitmap.Config.ARGB_8888);
        localBitmap.eraseColor(0);
        Canvas localCanvas = new Canvas(localBitmap);
        BitmapShader localBitmapShader = new BitmapShader(paramFile, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
        if (this.a == null)
        {
          this.a = new Paint(1);
          this.b = new RectF();
        }
        this.a.setShader(localBitmapShader);
        this.b.set(0.0F, 0.0F, paramFile.getWidth(), paramFile.getHeight());
        localCanvas.drawRoundRect(this.b, paramFile.getWidth(), paramFile.getHeight(), this.a);
        paramFile = Icon.createWithBitmap(localBitmap);
        return paramFile;
      }
    }
    catch (java.lang.Throwable paramFile)
    {
      n.a("tmessages", paramFile);
    }
    return null;
  }

  public List<ChooserTarget> onGetChooserTargets(ComponentName paramComponentName, IntentFilter paramIntentFilter)
  {
    paramComponentName = new ArrayList();
    if (!ad.b());
    do
      return paramComponentName;
    while (!ApplicationLoader.a.getSharedPreferences("mainconfig", 0).getBoolean("direct_share", true));
    p.a();
    paramIntentFilter = new Semaphore(0);
    ComponentName localComponentName = new ComponentName(getPackageName(), LaunchActivity.class.getCanonicalName());
    w.a().c().b(new Runnable(paramComponentName, localComponentName, paramIntentFilter)
    {
      public void run()
      {
        ArrayList localArrayList1 = new ArrayList();
        ArrayList localArrayList2 = new ArrayList();
        ArrayList localArrayList3 = new ArrayList();
        try
        {
          Object localObject1 = new ArrayList();
          ((ArrayList)localObject1).add(Integer.valueOf(ad.c()));
          localObject2 = new ArrayList();
          Object localObject3 = w.a().b().b(String.format(Locale.US, "SELECT did FROM dialogs ORDER BY date DESC LIMIT %d,%d", new Object[] { Integer.valueOf(0), Integer.valueOf(30) }), new Object[0]);
          int i;
          while (true)
            if (((SQLiteCursor)localObject3).a())
            {
              long l = ((SQLiteCursor)localObject3).d(0);
              i = (int)l;
              j = (int)(l >> 32);
              if ((i == 0) || (j == 1))
                continue;
              if (i <= 0)
                break label451;
              if (((ArrayList)localObject1).contains(Integer.valueOf(i)))
                break;
              ((ArrayList)localObject1).add(Integer.valueOf(i));
            }
          while (true)
          {
            localArrayList1.add(Integer.valueOf(i));
            if (localArrayList1.size() != 8)
              break;
            ((SQLiteCursor)localObject3).b();
            if (!((ArrayList)localObject2).isEmpty())
              w.a().b(TextUtils.join(",", (Iterable)localObject2), localArrayList2);
            if (!((ArrayList)localObject1).isEmpty())
              w.a().a(TextUtils.join(",", (Iterable)localObject1), localArrayList3);
            i = 0;
            while (true)
            {
              if (i >= localArrayList1.size())
                break label621;
              localBundle = new Bundle();
              k = ((Integer)localArrayList1.get(i)).intValue();
              if (k <= 0)
                break label499;
              j = 0;
              if (j >= localArrayList3.size())
                break label650;
              localObject2 = (g.vw)localArrayList3.get(j);
              if (((g.vw)localObject2).d != k)
                break;
              if (((g.vw)localObject2).r)
                break label650;
              localBundle.putLong("dialogId", k);
              if ((((g.vw)localObject2).j == null) || (((g.vw)localObject2).j.e == null))
                break label644;
              localObject1 = TgChooserTargetService.a(TgChooserTargetService.this, m.a(((g.vw)localObject2).j.e, true));
              localObject3 = f.a(((g.vw)localObject2).e, ((g.vw)localObject2).f);
              localObject2 = localObject1;
              localObject1 = localObject3;
              localObject3 = localObject1;
              localObject1 = localObject2;
              localObject2 = localObject3;
              if (localObject2 != null)
              {
                localObject3 = localObject1;
                if (localObject1 == null)
                  localObject3 = Icon.createWithResource(ApplicationLoader.a, 2130837959);
                this.a.add(new ChooserTarget((CharSequence)localObject2, (Icon)localObject3, 1.0F, this.b, localBundle));
              }
              i += 1;
            }
            label451: j = -i;
            if (((ArrayList)localObject2).contains(Integer.valueOf(j)))
              continue;
            ((ArrayList)localObject2).add(Integer.valueOf(-i));
          }
        }
        catch (Exception localIcon)
        {
          while (true)
          {
            Bundle localBundle;
            int k;
            n.a("tmessages", localException);
            continue;
            j += 1;
            continue;
            label499: int j = 0;
            label501: if (j < localArrayList2.size())
            {
              localObject2 = (g.i)localArrayList2.get(j);
              if (((g.i)localObject2).h == -k)
              {
                if ((e.c((g.i)localObject2)) || ((e.d((g.i)localObject2)) && (!((g.i)localObject2).r)))
                  break label635;
                localBundle.putLong("dialogId", k);
                if ((((g.i)localObject2).j == null) || (((g.i)localObject2).j.b == null))
                  break label629;
              }
              for (localIcon = TgChooserTargetService.a(TgChooserTargetService.this, m.a(((g.i)localObject2).j.b, true)); ; localIcon = null)
              {
                localObject2 = ((g.i)localObject2).i;
                break;
                j += 1;
                break label501;
                this.c.release();
                return;
              }
            }
            label621: label629: label635: Object localObject2 = null;
            Icon localIcon = null;
            continue;
            label644: localIcon = null;
            continue;
            label650: localIcon = null;
            localObject2 = null;
          }
        }
      }
    });
    try
    {
      paramIntentFilter.acquire();
      return paramComponentName;
    }
    catch (Exception paramIntentFilter)
    {
      n.a("tmessages", paramIntentFilter);
    }
    return paramComponentName;
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.TgChooserTargetService
 * JD-Core Version:    0.6.0
 */