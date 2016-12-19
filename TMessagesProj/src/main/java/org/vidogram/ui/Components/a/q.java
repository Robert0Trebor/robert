package org.vidogram.ui.Components.a;

import android.graphics.RectF;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.util.Log;

public class q
{
  public static void a()
  {
    int i = GLES20.glGetError();
    if (i != 0)
      Log.d("Paint", GLUtils.getEGLErrorString(i));
  }

  public static void a(RectF paramRectF)
  {
    paramRectF.left = (int)Math.floor(paramRectF.left);
    paramRectF.top = (int)Math.floor(paramRectF.top);
    paramRectF.right = (int)Math.ceil(paramRectF.right);
    paramRectF.bottom = (int)Math.ceil(paramRectF.bottom);
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.Components.a.q
 * JD-Core Version:    0.6.0
 */