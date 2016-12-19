package org.vidogram.messenger.f;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;
import android.opengl.GLES20;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

@TargetApi(16)
public class d
  implements SurfaceTexture.OnFrameAvailableListener
{
  private EGL10 a;
  private EGLDisplay b = null;
  private EGLContext c = null;
  private EGLSurface d = null;
  private SurfaceTexture e;
  private Surface f;
  private final Object g = new Object();
  private boolean h;
  private f i;
  private int j;
  private int k;
  private int l = 0;
  private ByteBuffer m;

  public d()
  {
    f();
  }

  public d(int paramInt1, int paramInt2, int paramInt3)
  {
    if ((paramInt1 <= 0) || (paramInt2 <= 0))
      throw new IllegalArgumentException();
    this.j = paramInt1;
    this.k = paramInt2;
    this.l = paramInt3;
    this.m = ByteBuffer.allocateDirect(this.j * this.k * 4);
    this.m.order(ByteOrder.LITTLE_ENDIAN);
    a(paramInt1, paramInt2);
    b();
    f();
  }

  private void a(int paramInt1, int paramInt2)
  {
    this.a = ((EGL10)EGLContext.getEGL());
    this.b = this.a.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
    if (this.b == EGL10.EGL_NO_DISPLAY)
      throw new RuntimeException("unable to get EGL10 display");
    if (!this.a.eglInitialize(this.b, null))
    {
      this.b = null;
      throw new RuntimeException("unable to initialize EGL10");
    }
    EGLConfig[] arrayOfEGLConfig = new EGLConfig[1];
    int[] arrayOfInt = new int[1];
    EGL10 localEGL10 = this.a;
    EGLDisplay localEGLDisplay = this.b;
    int n = arrayOfEGLConfig.length;
    if (!localEGL10.eglChooseConfig(localEGLDisplay, new int[] { 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12339, 1, 12352, 4, 12344 }, arrayOfEGLConfig, n, arrayOfInt))
      throw new RuntimeException("unable to find RGB888+pbuffer EGL config");
    this.c = this.a.eglCreateContext(this.b, arrayOfEGLConfig[0], EGL10.EGL_NO_CONTEXT, new int[] { 12440, 2, 12344 });
    a("eglCreateContext");
    if (this.c == null)
      throw new RuntimeException("null context");
    this.d = this.a.eglCreatePbufferSurface(this.b, arrayOfEGLConfig[0], new int[] { 12375, paramInt1, 12374, paramInt2, 12344 });
    a("eglCreatePbufferSurface");
    if (this.d == null)
      throw new RuntimeException("surface was null");
  }

  private void a(String paramString)
  {
    if (this.a.eglGetError() != 12288)
      throw new RuntimeException("EGL error encountered (see log)");
  }

  private void f()
  {
    this.i = new f(this.l);
    this.i.b();
    this.e = new SurfaceTexture(this.i.a());
    this.e.setOnFrameAvailableListener(this);
    this.f = new Surface(this.e);
  }

  public void a()
  {
    if (this.a != null)
    {
      if (this.a.eglGetCurrentContext().equals(this.c))
        this.a.eglMakeCurrent(this.b, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT);
      this.a.eglDestroySurface(this.b, this.d);
      this.a.eglDestroyContext(this.b, this.c);
    }
    this.f.release();
    this.b = null;
    this.c = null;
    this.d = null;
    this.a = null;
    this.i = null;
    this.f = null;
    this.e = null;
  }

  public void a(boolean paramBoolean)
  {
    this.i.a(this.e, paramBoolean);
  }

  public void b()
  {
    if (this.a == null)
      throw new RuntimeException("not configured for makeCurrent");
    a("before makeCurrent");
    if (!this.a.eglMakeCurrent(this.b, this.d, this.d, this.c))
      throw new RuntimeException("eglMakeCurrent failed");
  }

  public Surface c()
  {
    return this.f;
  }

  public void d()
  {
    synchronized (this.g)
    {
      while (true)
      {
        boolean bool = this.h;
        if (!bool)
          try
          {
            this.g.wait(2500L);
            if (this.h)
              continue;
            throw new RuntimeException("Surface frame wait timed out");
          }
          catch (InterruptedException localInterruptedException)
          {
            throw new RuntimeException(localInterruptedException);
          }
      }
    }
    this.h = false;
    monitorexit;
    this.i.a("before updateTexImage");
    this.e.updateTexImage();
  }

  public ByteBuffer e()
  {
    this.m.rewind();
    GLES20.glReadPixels(0, 0, this.j, this.k, 6408, 5121, this.m);
    return this.m;
  }

  public void onFrameAvailable(SurfaceTexture arg1)
  {
    synchronized (this.g)
    {
      if (this.h)
        throw new RuntimeException("mFrameAvailable already set, frame could be dropped");
    }
    this.h = true;
    this.g.notifyAll();
    monitorexit;
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.f.d
 * JD-Core Version:    0.6.0
 */