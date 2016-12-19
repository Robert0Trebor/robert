package org.vidogram.ui.Components.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.TextureView.SurfaceTextureListener;
import java.util.concurrent.Semaphore;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import org.vidogram.messenger.h;
import org.vidogram.messenger.n;
import org.vidogram.ui.Components.bf;

public class j extends TextureView
{
  private b a;
  private p b;
  private h c;
  private d d;
  private a e;
  private c f;
  private Bitmap g;
  private boolean h;
  private int i;
  private float j;
  private int k;
  private a l;
  private boolean m;

  public j(Context paramContext, d paramd, Bitmap paramBitmap, int paramInt)
  {
    super(paramContext);
    this.g = paramBitmap;
    this.i = paramInt;
    this.d = paramd;
    this.d.a(this);
    setSurfaceTextureListener(new TextureView.SurfaceTextureListener()
    {
      public void onSurfaceTextureAvailable(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
      {
        if ((paramSurfaceTexture == null) || (j.a(j.this) != null));
        do
        {
          return;
          j.a(j.this, new j.a(j.this, paramSurfaceTexture));
          j.a(j.this).a(paramInt1, paramInt2);
          j.b(j.this);
          j.a(j.this).b();
        }
        while (!j.c(j.this).d());
        j.c(j.this).e();
      }

      public boolean onSurfaceTextureDestroyed(SurfaceTexture paramSurfaceTexture)
      {
        if (j.a(j.this) == null);
        do
          return true;
        while (j.d(j.this));
        j.c(j.this).a(new Runnable()
        {
          public void run()
          {
            j.a(j.this).e();
            j.a(j.this, null);
          }
        });
        return true;
      }

      public void onSurfaceTextureSizeChanged(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
      {
        if (j.a(j.this) == null)
          return;
        j.a(j.this).a(paramInt1, paramInt2);
        j.b(j.this);
        j.a(j.this).b();
        j.a(j.this).b(new Runnable()
        {
          public void run()
          {
            if (j.a(j.this) != null)
              j.a(j.this).b();
          }
        });
      }

      public void onSurfaceTextureUpdated(SurfaceTexture paramSurfaceTexture)
      {
      }
    });
    this.f = new c(this);
    this.d.a(new d.b()
    {
      public p a()
      {
        return j.e(j.this);
      }

      public void a(RectF paramRectF)
      {
        if (j.a(j.this) != null)
          j.a(j.this).c();
      }

      public h b()
      {
        return j.f(j.this);
      }
    });
  }

  private float a(float paramFloat)
  {
    float f1 = this.d.a().a;
    return f1 * 0.04394531F * paramFloat + 0.0039063F * f1;
  }

  private void d()
  {
    Object localObject = new Matrix();
    int n = getWidth();
    float f1;
    if (this.d != null)
      f1 = n / this.d.a().a;
    while (true)
    {
      float f2 = f1;
      if (f1 <= 0.0F)
        f2 = 1.0F;
      bf localbf = getPainting().a();
      ((Matrix)localObject).preTranslate(getWidth() / 2.0F, getHeight() / 2.0F);
      ((Matrix)localObject).preScale(f2, -f2);
      ((Matrix)localObject).preTranslate(-localbf.a / 2.0F, -localbf.b / 2.0F);
      this.f.a((Matrix)localObject);
      localObject = b.a(b.a(0.0F, a.c(this.e), 0.0F, a.d(this.e), -1.0F, 1.0F), b.a((Matrix)localObject));
      this.d.a(localObject);
      return;
      f1 = 1.0F;
    }
  }

  public void a(Runnable paramRunnable)
  {
    if (this.e == null)
      return;
    this.e.b(new Runnable(paramRunnable)
    {
      public void run()
      {
        if ((j.a(j.this) == null) || (!j.a.a(j.a(j.this))))
          return;
        j.a.e(j.a(j.this));
        this.a.run();
      }
    });
  }

  public void a(boolean paramBoolean)
  {
    if (this.a != null)
      this.a.a(paramBoolean);
  }

  public boolean a()
  {
    return (this.a == null) || (this.a.b());
  }

  public void b()
  {
    if (this.a != null)
      this.a.a();
  }

  public void c()
  {
    this.m = true;
    if (this.e != null)
      a(new Runnable()
      {
        public void run()
        {
          j.c(j.this).a(j.g(j.this));
          j.a(j.this).e();
          j.a(j.this, null);
        }
      });
    setVisibility(8);
  }

  public a getCurrentBrush()
  {
    return this.l;
  }

  public int getCurrentColor()
  {
    return this.k;
  }

  public float getCurrentWeight()
  {
    return this.j;
  }

  public d getPainting()
  {
    return this.d;
  }

  public Bitmap getResultBitmap()
  {
    if (this.e != null)
      return this.e.f();
    return null;
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int i1 = 1;
    int n;
    if (paramMotionEvent.getPointerCount() > 1)
      n = 0;
    do
    {
      do
      {
        do
        {
          return n;
          n = i1;
        }
        while (this.e == null);
        n = i1;
      }
      while (!a.a(this.e));
      n = i1;
    }
    while (!a.b(this.e));
    this.f.a(paramMotionEvent);
    return true;
  }

  public void setBrush(a parama)
  {
    d locald = this.d;
    this.l = parama;
    locald.a(parama);
  }

  public void setBrushSize(float paramFloat)
  {
    this.j = a(paramFloat);
  }

  public void setColor(int paramInt)
  {
    this.k = paramInt;
  }

  public void setDelegate(b paramb)
  {
    this.a = paramb;
  }

  public void setQueue(h paramh)
  {
    this.c = paramh;
  }

  public void setUndoStore(p paramp)
  {
    this.b = paramp;
  }

  private class a extends h
  {
    private final int b = 12440;
    private final int c = 4;
    private SurfaceTexture d;
    private EGL10 e;
    private EGLDisplay f;
    private EGLConfig g;
    private EGLContext h;
    private EGLSurface i;
    private boolean j;
    private boolean k;
    private int l;
    private int m;
    private Runnable n;
    private Runnable o = new Runnable()
    {
      public void run()
      {
        if ((!j.a.a(j.a.this)) || (j.d(j.this)));
        do
        {
          return;
          j.a.e(j.a.this);
          GLES20.glBindFramebuffer(36160, 0);
          GLES20.glViewport(0, 0, j.a.c(j.a.this), j.a.d(j.a.this));
          GLES20.glClearColor(0.0F, 0.0F, 0.0F, 1.0F);
          GLES20.glClear(16384);
          j.c(j.this).c();
          GLES20.glBlendFunc(1, 771);
          j.a.h(j.a.this).eglSwapBuffers(j.a.f(j.a.this), j.a.g(j.a.this));
        }
        while (j.a.b(j.a.this));
        j.f(j.this).a(new Runnable()
        {
          public void run()
          {
            j.a.a(j.a.this, true);
          }
        }
        , 200L);
      }
    };

    public a(SurfaceTexture arg2)
    {
      super();
      Object localObject;
      this.d = localObject;
    }

    private Bitmap a(Bitmap paramBitmap, float paramFloat)
    {
      Matrix localMatrix = new Matrix();
      localMatrix.setScale(paramFloat, paramFloat);
      localMatrix.postRotate(j.i(j.this));
      return Bitmap.createBitmap(paramBitmap, 0, 0, paramBitmap.getWidth(), paramBitmap.getHeight(), localMatrix, true);
    }

    private boolean g()
    {
      this.e = ((EGL10)EGLContext.getEGL());
      this.f = this.e.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
      if (this.f == EGL10.EGL_NO_DISPLAY)
      {
        n.a("tmessages", "eglGetDisplay failed " + GLUtils.getEGLErrorString(this.e.eglGetError()));
        d();
        return false;
      }
      int[] arrayOfInt = new int[2];
      if (!this.e.eglInitialize(this.f, arrayOfInt))
      {
        n.a("tmessages", "eglInitialize failed " + GLUtils.getEGLErrorString(this.e.eglGetError()));
        d();
        return false;
      }
      arrayOfInt = new int[1];
      EGLConfig[] arrayOfEGLConfig = new EGLConfig[1];
      if (!this.e.eglChooseConfig(this.f, new int[] { 12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344 }, arrayOfEGLConfig, 1, arrayOfInt))
      {
        n.a("tmessages", "eglChooseConfig failed " + GLUtils.getEGLErrorString(this.e.eglGetError()));
        d();
        return false;
      }
      if (arrayOfInt[0] > 0)
      {
        this.g = arrayOfEGLConfig[0];
        this.h = this.e.eglCreateContext(this.f, this.g, EGL10.EGL_NO_CONTEXT, new int[] { 12440, 2, 12344 });
        if (this.h == null)
        {
          n.a("tmessages", "eglCreateContext failed " + GLUtils.getEGLErrorString(this.e.eglGetError()));
          d();
          return false;
        }
      }
      else
      {
        n.a("tmessages", "eglConfig not initialized");
        d();
        return false;
      }
      if ((this.d instanceof SurfaceTexture))
      {
        this.i = this.e.eglCreateWindowSurface(this.f, this.g, this.d, null);
        if ((this.i == null) || (this.i == EGL10.EGL_NO_SURFACE))
        {
          n.a("tmessages", "createWindowSurface failed " + GLUtils.getEGLErrorString(this.e.eglGetError()));
          d();
          return false;
        }
      }
      else
      {
        d();
        return false;
      }
      if (!this.e.eglMakeCurrent(this.f, this.i, this.i, this.h))
      {
        n.a("tmessages", "eglMakeCurrent failed " + GLUtils.getEGLErrorString(this.e.eglGetError()));
        d();
        return false;
      }
      GLES20.glEnable(3042);
      GLES20.glDisable(3024);
      GLES20.glDisable(2960);
      GLES20.glDisable(2929);
      j.c(j.this).f();
      h();
      j.c(j.this).a(j.h(j.this));
      q.a();
      return true;
    }

    private void h()
    {
      bf localbf = j.c(j.this).a();
      if ((j.h(j.this).getWidth() != localbf.a) || (j.h(j.this).getHeight() != localbf.b) || (j.i(j.this) != 0))
      {
        float f1 = j.h(j.this).getWidth();
        if ((j.i(j.this) % 360 == 90) || (j.i(j.this) % 360 == 270))
          f1 = j.h(j.this).getHeight();
        f1 = localbf.a / f1;
        j.a(j.this, a(j.h(j.this), f1));
        j.a(j.this, 0);
        j.a(j.this, true);
      }
    }

    private boolean i()
    {
      if (!this.j);
      do
        return false;
      while (((!this.h.equals(this.e.eglGetCurrentContext())) || (!this.i.equals(this.e.eglGetCurrentSurface(12377)))) && (!this.e.eglMakeCurrent(this.f, this.i, this.i, this.h)));
      return true;
    }

    public void a(int paramInt1, int paramInt2)
    {
      this.l = paramInt1;
      this.m = paramInt2;
    }

    public void b()
    {
      b(new Runnable()
      {
        public void run()
        {
          j.a.i(j.a.this).run();
        }
      });
    }

    public void c()
    {
      if (this.n != null)
      {
        a(this.n);
        this.n = null;
      }
      this.n = new Runnable()
      {
        public void run()
        {
          j.a.a(j.a.this, null);
          j.a.i(j.a.this).run();
        }
      };
      a(this.n, 1L);
    }

    public void d()
    {
      if (this.i != null)
      {
        this.e.eglMakeCurrent(this.f, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT);
        this.e.eglDestroySurface(this.f, this.i);
        this.i = null;
      }
      if (this.h != null)
      {
        this.e.eglDestroyContext(this.f, this.h);
        this.h = null;
      }
      if (this.f != null)
      {
        this.e.eglTerminate(this.f);
        this.f = null;
      }
    }

    public void e()
    {
      b(new Runnable()
      {
        public void run()
        {
          j.a.this.d();
          Looper localLooper = Looper.myLooper();
          if (localLooper != null)
            localLooper.quit();
        }
      });
    }

    public Bitmap f()
    {
      if (!this.j)
        return null;
      Semaphore localSemaphore = new Semaphore(0);
      Bitmap[] arrayOfBitmap = new Bitmap[1];
      try
      {
        b(new Runnable(arrayOfBitmap, localSemaphore)
        {
          public void run()
          {
            d.a locala = j.c(j.this).a(new RectF(0.0F, 0.0F, j.c(j.this).a().a, j.c(j.this).a().b), false);
            this.a[0] = locala.a;
            this.b.release();
          }
        });
        localSemaphore.acquire();
        return arrayOfBitmap[0];
      }
      catch (Exception localException)
      {
        while (true)
          n.a("tmessages", localException);
      }
    }

    public void run()
    {
      if ((j.h(j.this) == null) || (j.h(j.this).isRecycled()))
        return;
      this.j = g();
      super.run();
    }
  }

  public static abstract interface b
  {
    public abstract void a();

    public abstract void a(boolean paramBoolean);

    public abstract boolean b();
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.Components.a.j
 * JD-Core Version:    0.6.0
 */