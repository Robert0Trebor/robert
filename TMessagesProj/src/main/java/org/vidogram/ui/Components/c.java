package org.vidogram.ui.Components;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.content.FileProvider;
import java.io.File;
import java.util.ArrayList;
import org.vidogram.messenger.MediaController.i;
import org.vidogram.messenger.MediaController.j;
import org.vidogram.messenger.a;
import org.vidogram.messenger.ad;
import org.vidogram.messenger.m;
import org.vidogram.messenger.n;
import org.vidogram.messenger.p;
import org.vidogram.messenger.y;
import org.vidogram.messenger.y.b;
import org.vidogram.tgnet.g.ab;
import org.vidogram.tgnet.g.ad;
import org.vidogram.tgnet.g.az;
import org.vidogram.tgnet.g.x;
import org.vidogram.ui.LaunchActivity;
import org.vidogram.ui.a.g;
import org.vidogram.ui.aj;
import org.vidogram.ui.aj.b;
import org.vidogram.ui.ak;
import org.vidogram.ui.ak.b;
import org.vidogram.ui.am;
import org.vidogram.ui.am.b;

public class c
  implements y.b, ak.b
{
  public String a;
  public String b = null;
  File c = null;
  public g d = null;
  public a e;
  public boolean f = false;
  private g.az g;
  private g.az h;
  private boolean i = false;

  private void a(String paramString, Uri paramUri)
  {
    while (true)
    {
      Object localObject;
      try
      {
        LaunchActivity localLaunchActivity = (LaunchActivity)this.d.l();
        if (localLaunchActivity == null)
          return;
        localObject = new Bundle();
        if (paramString != null)
        {
          ((Bundle)localObject).putString("photoPath", paramString);
          localObject = new ak((Bundle)localObject);
          ((ak)localObject).a(this);
          localLaunchActivity.a((g)localObject);
          return;
        }
      }
      catch (Exception localException)
      {
        n.a("tmessages", localException);
        b(p.a(paramString, paramUri, 800.0F, 800.0F, true));
        return;
      }
      if (paramUri == null)
        continue;
      ((Bundle)localObject).putParcelable("photoUri", paramUri);
    }
  }

  private void b(Bitmap paramBitmap)
  {
    if (paramBitmap == null);
    while (true)
    {
      return;
      this.g = p.a(paramBitmap, 100.0F, 100.0F, 80, false);
      this.h = p.a(paramBitmap, 800.0F, 800.0F, 80, false, 320, 320);
      paramBitmap.recycle();
      if ((this.h == null) || (this.g == null))
        continue;
      if (!this.f)
        break;
      if (this.e == null)
        continue;
      this.e.a(null, this.g, this.h);
      return;
    }
    ad.a(false);
    this.b = (m.a().b(4) + "/" + this.h.c.c + "_" + this.h.c.d + ".jpg");
    y.a().a(this, y.av);
    y.a().a(this, y.aw);
    m.a().a(this.b, false, true);
  }

  public void a()
  {
    if (this.b != null)
    {
      this.i = true;
      return;
    }
    this.d = null;
    this.e = null;
  }

  public void a(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (paramInt2 == -1)
    {
      if (paramInt1 != 13)
        break label176;
      am.a().a(this.d.l());
    }
    label176: 
    do
      try
      {
        paramInt1 = new ExifInterface(this.a).getAttributeInt("Orientation", 1);
        switch (paramInt1)
        {
        case 4:
        case 5:
        case 7:
        default:
          paramInt1 = 0;
        case 6:
        case 3:
        case 8:
        }
        while (true)
        {
          paramIntent = new ArrayList();
          paramIntent.add(new MediaController.i(0, 0, 0L, this.a, paramInt1, false));
          am.a().a(paramIntent, 0, 1, new am.b(paramIntent)
          {
            public void d(int paramInt)
            {
              Object localObject = (MediaController.i)this.a.get(0);
              if (((MediaController.i)localObject).g != null)
                localObject = ((MediaController.i)localObject).g;
              while (true)
              {
                localObject = p.a((String)localObject, null, 800.0F, 800.0F, true);
                c.a(c.this, (Bitmap)localObject);
                return;
                if (((MediaController.i)localObject).d != null)
                {
                  localObject = ((MediaController.i)localObject).d;
                  continue;
                }
                localObject = null;
              }
            }

            public boolean w()
            {
              return false;
            }
          }
          , null);
          a.c(this.a);
          this.a = null;
          return;
          paramInt1 = 90;
          continue;
          paramInt1 = 180;
          continue;
          paramInt1 = 270;
        }
      }
      catch (Exception paramIntent)
      {
        while (true)
        {
          n.a("tmessages", paramIntent);
          paramInt1 = 0;
        }
      }
    while ((paramInt1 != 14) || (paramIntent == null) || (paramIntent.getData() == null));
    a(null, paramIntent.getData());
  }

  public void a(int paramInt, Object[] paramArrayOfObject)
  {
    if (paramInt == y.av)
    {
      String str = (String)paramArrayOfObject[0];
      if ((this.b != null) && (str.equals(this.b)))
      {
        y.a().b(this, y.av);
        y.a().b(this, y.aw);
        if (this.e != null)
          this.e.a((g.ad)paramArrayOfObject[1], this.g, this.h);
        this.b = null;
        if (this.i)
        {
          this.d = null;
          this.e = null;
        }
      }
    }
    do
    {
      do
      {
        do
          return;
        while (paramInt != y.aw);
        paramArrayOfObject = (String)paramArrayOfObject[0];
      }
      while ((this.b == null) || (!paramArrayOfObject.equals(this.b)));
      y.a().b(this, y.av);
      y.a().b(this, y.aw);
      this.b = null;
    }
    while (!this.i);
    this.d = null;
    this.e = null;
  }

  public void a(Bitmap paramBitmap)
  {
    b(paramBitmap);
  }

  public void b()
  {
    try
    {
      Intent localIntent = new Intent("android.media.action.IMAGE_CAPTURE");
      File localFile = a.i();
      if (localFile != null)
      {
        if (Build.VERSION.SDK_INT < 24)
          break label79;
        localIntent.putExtra("output", FileProvider.a(this.d.l(), "org.vidogram.messenger.beta.provider", localFile));
        localIntent.addFlags(2);
        localIntent.addFlags(1);
      }
      while (true)
      {
        this.a = localFile.getAbsolutePath();
        this.d.a(localIntent, 13);
        return;
        label79: localIntent.putExtra("output", Uri.fromFile(localFile));
      }
    }
    catch (Exception localException)
    {
      n.a("tmessages", localException);
    }
  }

  public void c()
  {
    if ((Build.VERSION.SDK_INT >= 23) && (this.d != null) && (this.d.l() != null) && (this.d.l().checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0))
    {
      this.d.l().requestPermissions(new String[] { "android.permission.READ_EXTERNAL_STORAGE" }, 4);
      return;
    }
    aj localaj = new aj(true, false, false, null);
    localaj.a(new aj.b()
    {
      public void a()
      {
        try
        {
          Intent localIntent = new Intent("android.intent.action.GET_CONTENT");
          localIntent.setType("image/*");
          c.this.d.a(localIntent, 14);
          return;
        }
        catch (Exception localException)
        {
          n.a("tmessages", localException);
        }
      }

      public void a(ArrayList<String> paramArrayList1, ArrayList<String> paramArrayList2, ArrayList<ArrayList<g.ab>> paramArrayList, ArrayList<MediaController.j> paramArrayList3)
      {
        if (!paramArrayList1.isEmpty())
        {
          paramArrayList1 = p.a((String)paramArrayList1.get(0), null, 800.0F, 800.0F, true);
          c.a(c.this, paramArrayList1);
        }
      }

      public boolean a(String paramString)
      {
        return true;
      }
    });
    this.d.a(localaj);
  }

  public static abstract interface a
  {
    public abstract void a(g.ad paramad, g.az paramaz1, g.az paramaz2);
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.Components.c
 * JD-Core Version:    0.6.0
 */