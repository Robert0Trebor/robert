package org.vidogram.messenger.f;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.Matrix;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

@TargetApi(16)
public class f
{
  private static final float[] a = { -1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F, 0.0F, -1.0F, 1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F };
  private FloatBuffer b;
  private float[] c = new float[16];
  private float[] d = new float[16];
  private int e;
  private int f = -12345;
  private int g;
  private int h;
  private int i;
  private int j;
  private int k = 0;

  public f(int paramInt)
  {
    this.k = paramInt;
    this.b = ByteBuffer.allocateDirect(a.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
    this.b.put(a).position(0);
    Matrix.setIdentityM(this.d, 0);
  }

  private int a(int paramInt, String paramString)
  {
    int m = GLES20.glCreateShader(paramInt);
    a("glCreateShader type=" + paramInt);
    GLES20.glShaderSource(m, paramString);
    GLES20.glCompileShader(m);
    paramString = new int[1];
    GLES20.glGetShaderiv(m, 35713, paramString, 0);
    if (paramString[0] == 0)
    {
      GLES20.glDeleteShader(m);
      return 0;
    }
    return m;
  }

  private int a(String paramString1, String paramString2)
  {
    int m = a(35633, paramString1);
    if (m == 0);
    int n;
    int i1;
    do
    {
      do
      {
        return 0;
        n = a(35632, paramString2);
      }
      while (n == 0);
      i1 = GLES20.glCreateProgram();
      a("glCreateProgram");
    }
    while (i1 == 0);
    GLES20.glAttachShader(i1, m);
    a("glAttachShader");
    GLES20.glAttachShader(i1, n);
    a("glAttachShader");
    GLES20.glLinkProgram(i1);
    paramString1 = new int[1];
    GLES20.glGetProgramiv(i1, 35714, paramString1, 0);
    if (paramString1[0] != 1)
    {
      GLES20.glDeleteProgram(i1);
      return 0;
    }
    return i1;
  }

  public int a()
  {
    return this.f;
  }

  public void a(SurfaceTexture paramSurfaceTexture, boolean paramBoolean)
  {
    a("onDrawFrame start");
    paramSurfaceTexture.getTransformMatrix(this.d);
    if (paramBoolean)
    {
      this.d[5] = (-this.d[5]);
      this.d[13] = (1.0F - this.d[13]);
    }
    GLES20.glUseProgram(this.e);
    a("glUseProgram");
    GLES20.glActiveTexture(33984);
    GLES20.glBindTexture(36197, this.f);
    this.b.position(0);
    GLES20.glVertexAttribPointer(this.i, 3, 5126, false, 20, this.b);
    a("glVertexAttribPointer maPosition");
    GLES20.glEnableVertexAttribArray(this.i);
    a("glEnableVertexAttribArray maPositionHandle");
    this.b.position(3);
    GLES20.glVertexAttribPointer(this.j, 2, 5126, false, 20, this.b);
    a("glVertexAttribPointer maTextureHandle");
    GLES20.glEnableVertexAttribArray(this.j);
    a("glEnableVertexAttribArray maTextureHandle");
    GLES20.glUniformMatrix4fv(this.h, 1, false, this.d, 0);
    GLES20.glUniformMatrix4fv(this.g, 1, false, this.c, 0);
    GLES20.glDrawArrays(5, 0, 4);
    a("glDrawArrays");
    GLES20.glFinish();
  }

  public void a(String paramString)
  {
    int m = GLES20.glGetError();
    if (m != 0)
      throw new RuntimeException(paramString + ": glError " + m);
  }

  public void b()
  {
    this.e = a("uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n", "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n");
    if (this.e == 0)
      throw new RuntimeException("failed creating program");
    this.i = GLES20.glGetAttribLocation(this.e, "aPosition");
    a("glGetAttribLocation aPosition");
    if (this.i == -1)
      throw new RuntimeException("Could not get attrib location for aPosition");
    this.j = GLES20.glGetAttribLocation(this.e, "aTextureCoord");
    a("glGetAttribLocation aTextureCoord");
    if (this.j == -1)
      throw new RuntimeException("Could not get attrib location for aTextureCoord");
    this.g = GLES20.glGetUniformLocation(this.e, "uMVPMatrix");
    a("glGetUniformLocation uMVPMatrix");
    if (this.g == -1)
      throw new RuntimeException("Could not get attrib location for uMVPMatrix");
    this.h = GLES20.glGetUniformLocation(this.e, "uSTMatrix");
    a("glGetUniformLocation uSTMatrix");
    if (this.h == -1)
      throw new RuntimeException("Could not get attrib location for uSTMatrix");
    int[] arrayOfInt = new int[1];
    GLES20.glGenTextures(1, arrayOfInt, 0);
    this.f = arrayOfInt[0];
    GLES20.glBindTexture(36197, this.f);
    a("glBindTexture mTextureID");
    GLES20.glTexParameterf(36197, 10241, 9728.0F);
    GLES20.glTexParameterf(36197, 10240, 9729.0F);
    GLES20.glTexParameteri(36197, 10242, 33071);
    GLES20.glTexParameteri(36197, 10243, 33071);
    a("glTexParameter");
    Matrix.setIdentityM(this.c, 0);
    if (this.k != 0)
      Matrix.rotateM(this.c, 0, this.k, 0.0F, 0.0F, 1.0F);
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.f.f
 * JD-Core Version:    0.6.0
 */