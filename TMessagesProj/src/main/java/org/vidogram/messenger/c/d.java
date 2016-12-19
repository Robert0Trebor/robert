package org.vidogram.messenger.c;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.view.Display;
import android.view.TextureView;
import android.view.TextureView.SurfaceTextureListener;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.concurrent.Semaphore;

@SuppressLint({"NewApi"})
public class d extends FrameLayout
  implements TextureView.SurfaceTextureListener
{
  private e a;
  private boolean b;
  private TextureView c;
  private c d;
  private boolean e;
  private a f;
  private int g;
  private int h;
  private boolean i;
  private Matrix j = new Matrix();

  public d(Context paramContext)
  {
    super(paramContext, null);
    this.c = new TextureView(paramContext);
    this.c.setSurfaceTextureListener(this);
    addView(this.c);
  }

  private void a(int paramInt1, int paramInt2, int paramInt3)
  {
    this.j.reset();
    int k = getWidth();
    int m = getHeight();
    float f2 = k / 2;
    float f3 = m / 2;
    float f1;
    if ((paramInt3 == 0) || (paramInt3 == 2))
    {
      f1 = Math.max((this.g + m) / paramInt1, (this.h + k) / paramInt2);
      float f5 = paramInt1;
      float f4 = f1 * paramInt2 / k;
      f1 = f5 * f1 / m;
      this.j.postScale(f4, f1, f2, f3);
      if ((1 != paramInt3) && (3 != paramInt3))
        break label242;
      this.j.postRotate((paramInt3 - 2) * 90, f2, f3);
    }
    while (true)
    {
      if (this.b)
        this.j.postScale(-1.0F, 1.0F, f2, f3);
      if ((this.g != 0) || (this.h != 0))
        this.j.postTranslate(-this.h / 2, -this.g / 2);
      this.c.setTransform(this.j);
      return;
      f1 = Math.max((this.g + m) / paramInt2, (this.h + k) / paramInt1);
      break;
      label242: if (2 != paramInt3)
        continue;
      this.j.postRotate(180.0F, f2, f3);
    }
  }

  private void b(boolean paramBoolean)
  {
    Object localObject = a.a().d();
    int k = 0;
    b localb;
    if (k < ((ArrayList)localObject).size())
    {
      localb = (b)((ArrayList)localObject).get(k);
      if (((!this.i) || (localb.e == 0)) && ((this.i) || (localb.e != 0)));
    }
    while (true)
    {
      if (localb == null)
      {
        return;
        k += 1;
        break;
      }
      if (Math.abs(Math.max(org.vidogram.messenger.a.c.x, org.vidogram.messenger.a.c.y) / Math.min(org.vidogram.messenger.a.c.x, org.vidogram.messenger.a.c.y) - 1.333333F) < 0.1F);
      for (localObject = new e(4, 3); ; localObject = new e(16, 9))
      {
        if ((this.c.getWidth() > 0) && (this.c.getHeight() > 0))
        {
          k = Math.min(org.vidogram.messenger.a.c.x, org.vidogram.messenger.a.c.y);
          int m = ((e)localObject).b() * k / ((e)localObject).a();
          this.a = a.a(localb.b(), k, m, (e)localObject);
        }
        localObject = a.a(localb.c(), 1280, 1280, (e)localObject);
        if ((this.a == null) || (this.c.getSurfaceTexture() == null))
          break;
        this.c.getSurfaceTexture().setDefaultBufferSize(this.a.a(), this.a.b());
        this.d = new c(localb, this.a, (e)localObject, 256);
        a.a().a(this.d, this.c.getSurfaceTexture(), new Runnable()
        {
          public void run()
          {
            if (d.a(d.this) != null)
              d.a(d.this).c();
            d.b(d.this);
          }
        });
        return;
      }
      localb = null;
    }
  }

  private void e()
  {
    if (this.a == null)
      return;
    a(this.a.a(), this.a.b(), ((Activity)getContext()).getWindowManager().getDefaultDisplay().getRotation());
  }

  public void a(boolean paramBoolean)
  {
    a locala;
    c localc;
    if (this.d != null)
    {
      this.d.g();
      locala = a.a();
      localc = this.d;
      if (paramBoolean)
        break label45;
    }
    label45: for (Semaphore localSemaphore = new Semaphore(0); ; localSemaphore = null)
    {
      locala.a(localc, localSemaphore);
      return;
    }
  }

  public boolean a()
  {
    return this.i;
  }

  public boolean b()
  {
    int n = 0;
    ArrayList localArrayList = a.a().d();
    int k = 0;
    while (true)
    {
      int m = n;
      if (k < localArrayList.size())
      {
        if (((b)localArrayList.get(k)).e != 0)
          m = 1;
      }
      else
        return m;
      k += 1;
    }
  }

  public void c()
  {
    boolean bool = false;
    if (this.d != null)
    {
      a.a().a(this.d, null);
      this.d = null;
    }
    this.e = false;
    if (!this.i)
      bool = true;
    this.i = bool;
    b(this.i);
  }

  public boolean d()
  {
    return this.e;
  }

  public c getCameraSession()
  {
    return this.d;
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    e();
  }

  public void onSurfaceTextureAvailable(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
    b(this.i);
  }

  public boolean onSurfaceTextureDestroyed(SurfaceTexture paramSurfaceTexture)
  {
    if (this.d != null)
      a.a().a(this.d, null);
    return false;
  }

  public void onSurfaceTextureSizeChanged(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
    e();
  }

  public void onSurfaceTextureUpdated(SurfaceTexture paramSurfaceTexture)
  {
    if ((!this.e) && (this.d != null) && (this.d.d()))
    {
      if (this.f != null)
        this.f.a();
      this.e = true;
    }
  }

  public void setClipLeft(int paramInt)
  {
    this.h = paramInt;
  }

  public void setClipTop(int paramInt)
  {
    this.g = paramInt;
  }

  public void setDelegate(a parama)
  {
    this.f = parama;
  }

  public void setMirror(boolean paramBoolean)
  {
    this.b = paramBoolean;
  }

  public static abstract interface a
  {
    public abstract void a();
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.c.d
 * JD-Core Version:    0.6.0
 */