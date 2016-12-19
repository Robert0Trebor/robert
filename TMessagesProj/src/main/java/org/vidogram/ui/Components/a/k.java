package org.vidogram.ui.Components.a;

import android.graphics.Color;
import android.opengl.GLES20;
import java.util.HashMap;
import java.util.Map;
import org.vidogram.messenger.n;

public class k
{
  protected int a = GLES20.glCreateProgram();
  protected Map<String, Integer> b = new HashMap();
  private int c;

  public k(String paramString1, String paramString2, String[] paramArrayOfString1, String[] paramArrayOfString2)
  {
    paramString1 = a(35633, paramString1);
    if (paramString1.b == 0)
    {
      n.a("tmessages", "Vertex shader compilation failed");
      a(paramString1.a, 0, this.a);
    }
    do
    {
      return;
      paramString2 = a(35632, paramString2);
      if (paramString2.b == 0)
      {
        n.a("tmessages", "Fragment shader compilation failed");
        a(paramString1.a, paramString2.a, this.a);
        return;
      }
      GLES20.glAttachShader(this.a, paramString1.a);
      GLES20.glAttachShader(this.a, paramString2.a);
      int i = 0;
      while (i < paramArrayOfString1.length)
      {
        GLES20.glBindAttribLocation(this.a, i, paramArrayOfString1[i]);
        i += 1;
      }
      if (a(this.a) == 0)
      {
        a(paramString1.a, paramString2.a, this.a);
        return;
      }
      int k = paramArrayOfString2.length;
      i = j;
      while (i < k)
      {
        paramArrayOfString1 = paramArrayOfString2[i];
        this.b.put(paramArrayOfString1, Integer.valueOf(GLES20.glGetUniformLocation(this.a, paramArrayOfString1)));
        i += 1;
      }
      if (paramString1.a == 0)
        continue;
      GLES20.glDeleteShader(paramString1.a);
    }
    while (paramString2.a == 0);
    GLES20.glDeleteShader(paramString2.a);
  }

  private int a(int paramInt)
  {
    GLES20.glLinkProgram(paramInt);
    int[] arrayOfInt = new int[1];
    GLES20.glGetProgramiv(paramInt, 35714, arrayOfInt, 0);
    if (arrayOfInt[0] == 0)
      n.a("tmessages", GLES20.glGetProgramInfoLog(paramInt));
    return arrayOfInt[0];
  }

  private a a(int paramInt, String paramString)
  {
    paramInt = GLES20.glCreateShader(paramInt);
    GLES20.glShaderSource(paramInt, paramString);
    GLES20.glCompileShader(paramInt);
    paramString = new int[1];
    GLES20.glGetShaderiv(paramInt, 35713, paramString, 0);
    if (paramString[0] == 0)
      n.a("tmessages", GLES20.glGetShaderInfoLog(paramInt));
    return new a(paramInt, paramString[0]);
  }

  public static void a(int paramInt1, int paramInt2)
  {
    GLES20.glUniform4f(paramInt1, Color.red(paramInt2) / 255.0F, Color.green(paramInt2) / 255.0F, Color.blue(paramInt2) / 255.0F, Color.alpha(paramInt2) / 255.0F);
  }

  private void a(int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt1 != 0)
      GLES20.glDeleteShader(paramInt1);
    if (paramInt2 != 0)
      GLES20.glDeleteShader(paramInt2);
    if (paramInt3 != 0)
      GLES20.glDeleteProgram(paramInt1);
  }

  public int a(String paramString)
  {
    return ((Integer)this.b.get(paramString)).intValue();
  }

  public void a()
  {
    if (this.a != 0)
    {
      GLES20.glDeleteProgram(this.c);
      this.a = 0;
    }
  }

  private class a
  {
    int a;
    int b;

    a(int paramInt1, int arg3)
    {
      this.a = paramInt1;
      int i;
      this.b = i;
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.Components.a.k
 * JD-Core Version:    0.6.0
 */