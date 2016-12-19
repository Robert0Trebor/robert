package org.vidogram.messenger.f;

import android.annotation.TargetApi;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.view.Surface;

@TargetApi(17)
public class a
{
  private EGLDisplay a;
  private EGLContext b;
  private EGLSurface c;
  private Surface d;

  public a(Surface paramSurface)
  {
    if (paramSurface == null)
      throw new NullPointerException();
    this.d = paramSurface;
    d();
  }

  private void a(String paramString)
  {
    for (int i = 0; EGL14.eglGetError() != 12288; i = 1);
    if (i != 0)
      throw new RuntimeException("EGL error encountered (see log)");
  }

  private void d()
  {
    this.a = EGL14.eglGetDisplay(0);
    if (this.a == EGL14.EGL_NO_DISPLAY)
      throw new RuntimeException("unable to get EGL14 display");
    Object localObject = new int[2];
    if (!EGL14.eglInitialize(this.a, localObject, 0, localObject, 1))
    {
      this.a = null;
      throw new RuntimeException("unable to initialize EGL14");
    }
    localObject = new EGLConfig[1];
    int[] arrayOfInt = new int[1];
    EGLDisplay localEGLDisplay = this.a;
    int i = localObject.length;
    if (!EGL14.eglChooseConfig(localEGLDisplay, new int[] { 12324, 8, 12323, 8, 12322, 8, 12352, 4, 12610, 1, 12344 }, 0, localObject, 0, i, arrayOfInt, 0))
      throw new RuntimeException("unable to find RGB888+recordable ES2 EGL config");
    this.b = EGL14.eglCreateContext(this.a, localObject[0], EGL14.EGL_NO_CONTEXT, new int[] { 12440, 2, 12344 }, 0);
    a("eglCreateContext");
    if (this.b == null)
      throw new RuntimeException("null context");
    this.c = EGL14.eglCreateWindowSurface(this.a, localObject[0], this.d, new int[] { 12344 }, 0);
    a("eglCreateWindowSurface");
    if (this.c == null)
      throw new RuntimeException("surface was null");
  }

  public void a()
  {
    if (EGL14.eglGetCurrentContext().equals(this.b))
      EGL14.eglMakeCurrent(this.a, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT);
    EGL14.eglDestroySurface(this.a, this.c);
    EGL14.eglDestroyContext(this.a, this.b);
    this.d.release();
    this.a = null;
    this.b = null;
    this.c = null;
    this.d = null;
  }

  public void a(long paramLong)
  {
    EGLExt.eglPresentationTimeANDROID(this.a, this.c, paramLong);
  }

  public void b()
  {
    if (!EGL14.eglMakeCurrent(this.a, this.c, this.c, this.b))
      throw new RuntimeException("eglMakeCurrent failed");
  }

  public boolean c()
  {
    return EGL14.eglSwapBuffers(this.a, this.c);
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.f.a
 * JD-Core Version:    0.6.0
 */