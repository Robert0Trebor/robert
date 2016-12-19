package org.vidogram.ui.Components.a;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import org.vidogram.ui.Components.bf;

public class o
{
  private Bitmap a;
  private int b;

  public o(Bitmap paramBitmap)
  {
    this.a = paramBitmap;
  }

  public static int a(bf parambf)
  {
    int[] arrayOfInt = new int[1];
    GLES20.glGenTextures(1, arrayOfInt, 0);
    int i = arrayOfInt[0];
    GLES20.glBindTexture(3553, i);
    GLES20.glTexParameteri(3553, 10242, 33071);
    GLES20.glTexParameteri(3553, 10243, 33071);
    GLES20.glTexParameteri(3553, 10240, 9729);
    GLES20.glTexParameteri(3553, 10241, 9729);
    GLES20.glTexImage2D(3553, 0, 6408, (int)parambf.a, (int)parambf.b, 0, 6408, 5121, null);
    return i;
  }

  private boolean a(int paramInt)
  {
    return (paramInt - 1 & paramInt) == 0;
  }

  public int a()
  {
    int j = 9729;
    int k = 1;
    int i = 0;
    if (this.b != 0)
      i = this.b;
    do
      return i;
    while (this.a.isRecycled());
    int[] arrayOfInt = new int[1];
    GLES20.glGenTextures(1, arrayOfInt, 0);
    this.b = arrayOfInt[0];
    GLES20.glBindTexture(3553, this.b);
    if ((a(this.a.getWidth())) && (a(this.a.getHeight())));
    for (i = k; ; i = 0)
    {
      GLES20.glTexParameteri(3553, 10242, 33071);
      GLES20.glTexParameteri(3553, 10243, 33071);
      GLES20.glTexParameteri(3553, 10240, 9729);
      if (i != 0)
        j = 9987;
      GLES20.glTexParameteri(3553, 10241, j);
      GLUtils.texImage2D(3553, 0, this.a, 0);
      if (i != 0)
        GLES20.glGenerateMipmap(3553);
      q.a();
      return this.b;
    }
  }

  public void a(boolean paramBoolean)
  {
    if (this.b == 0);
    do
    {
      return;
      GLES20.glDeleteTextures(1, new int[] { this.b }, 0);
      this.b = 0;
    }
    while (!paramBoolean);
    this.a.recycle();
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.Components.a.o
 * JD-Core Version:    0.6.0
 */