package org.vidogram.ui.Components.a;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.opengl.GLES20;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

public class h
{
  public static RectF a(e parame, i parami)
  {
    int i = 0;
    parami.a = parame.d();
    parami.b = parame.e().a();
    parami.c = parame.e().b();
    parami.d = parame.e().c();
    parami.e = parame.e().d();
    int j = parame.a();
    if (j == 0)
      return null;
    if (j == 1)
      a(parame.b()[0], parami);
    while (true)
    {
      parame.a = parami.f;
      return a(parami);
      g[] arrayOfg = parame.b();
      parami.b();
      while (i < arrayOfg.length - 1)
      {
        a(arrayOfg[i], arrayOfg[(i + 1)], parami);
        i += 1;
      }
    }
  }

  private static RectF a(i parami)
  {
    RectF localRectF1 = new RectF(0.0F, 0.0F, 0.0F, 0.0F);
    int m = parami.a();
    if (m == 0)
      return localRectF1;
    Object localObject = ByteBuffer.allocateDirect((m * 4 + (m - 1) * 2) * 20);
    ((ByteBuffer)localObject).order(ByteOrder.nativeOrder());
    localObject = ((ByteBuffer)localObject).asFloatBuffer();
    ((FloatBuffer)localObject).position(0);
    parami.a(0);
    int i = 0;
    int j = 0;
    float f2;
    float[] arrayOfFloat;
    if (j < m)
    {
      float f3 = parami.c();
      float f4 = parami.c();
      float f5 = parami.c();
      float f1 = parami.c();
      f2 = parami.c();
      RectF localRectF2 = new RectF(f3 - f5, f4 - f5, f3 + f5, f4 + f5);
      arrayOfFloat = new float[8];
      arrayOfFloat[0] = localRectF2.left;
      arrayOfFloat[1] = localRectF2.top;
      arrayOfFloat[2] = localRectF2.right;
      arrayOfFloat[3] = localRectF2.top;
      arrayOfFloat[4] = localRectF2.left;
      arrayOfFloat[5] = localRectF2.bottom;
      arrayOfFloat[6] = localRectF2.right;
      arrayOfFloat[7] = localRectF2.bottom;
      f3 = localRectF2.centerX();
      f4 = localRectF2.centerY();
      Matrix localMatrix = new Matrix();
      localMatrix.setRotate((float)Math.toDegrees(f1), f3, f4);
      localMatrix.mapPoints(arrayOfFloat);
      localMatrix.mapRect(localRectF2);
      q.a(localRectF2);
      localRectF1.union(localRectF2);
      if (i == 0)
        break label676;
      ((FloatBuffer)localObject).put(arrayOfFloat[0]);
      ((FloatBuffer)localObject).put(arrayOfFloat[1]);
      ((FloatBuffer)localObject).put(0.0F);
      ((FloatBuffer)localObject).put(0.0F);
      ((FloatBuffer)localObject).put(f2);
      i += 1;
    }
    label676: 
    while (true)
    {
      ((FloatBuffer)localObject).put(arrayOfFloat[0]);
      ((FloatBuffer)localObject).put(arrayOfFloat[1]);
      ((FloatBuffer)localObject).put(0.0F);
      ((FloatBuffer)localObject).put(0.0F);
      ((FloatBuffer)localObject).put(f2);
      ((FloatBuffer)localObject).put(arrayOfFloat[2]);
      ((FloatBuffer)localObject).put(arrayOfFloat[3]);
      ((FloatBuffer)localObject).put(1.0F);
      ((FloatBuffer)localObject).put(0.0F);
      ((FloatBuffer)localObject).put(f2);
      ((FloatBuffer)localObject).put(arrayOfFloat[4]);
      ((FloatBuffer)localObject).put(arrayOfFloat[5]);
      ((FloatBuffer)localObject).put(0.0F);
      ((FloatBuffer)localObject).put(1.0F);
      ((FloatBuffer)localObject).put(f2);
      ((FloatBuffer)localObject).put(arrayOfFloat[6]);
      ((FloatBuffer)localObject).put(arrayOfFloat[7]);
      ((FloatBuffer)localObject).put(1.0F);
      ((FloatBuffer)localObject).put(1.0F);
      ((FloatBuffer)localObject).put(f2);
      int k = i + 1 + 1 + 1 + 1;
      i = k;
      if (j != m - 1)
      {
        ((FloatBuffer)localObject).put(arrayOfFloat[6]);
        ((FloatBuffer)localObject).put(arrayOfFloat[7]);
        ((FloatBuffer)localObject).put(1.0F);
        ((FloatBuffer)localObject).put(1.0F);
        ((FloatBuffer)localObject).put(f2);
        i = k + 1;
      }
      j += 1;
      break;
      ((FloatBuffer)localObject).position(0);
      GLES20.glVertexAttribPointer(0, 2, 5126, false, 20, ((FloatBuffer)localObject).slice());
      GLES20.glEnableVertexAttribArray(0);
      ((FloatBuffer)localObject).position(2);
      GLES20.glVertexAttribPointer(1, 2, 5126, true, 20, ((FloatBuffer)localObject).slice());
      GLES20.glEnableVertexAttribArray(1);
      ((FloatBuffer)localObject).position(4);
      GLES20.glVertexAttribPointer(2, 1, 5126, true, 20, ((FloatBuffer)localObject).slice());
      GLES20.glEnableVertexAttribArray(2);
      GLES20.glDrawArrays(5, 0, i);
      return localRectF1;
    }
  }

  private static void a(g paramg1, g paramg2, i parami)
  {
    double d2 = paramg1.c(paramg2);
    g localg2 = paramg2.b(paramg1);
    g localg1 = new g(1.0D, 1.0D, 0.0D);
    float f1;
    float f4;
    double d3;
    if (Math.abs(parami.d) > 0.0F)
    {
      f1 = parami.d;
      f4 = parami.a * parami.e;
      d3 = Math.max(1.0F, parami.b * f4);
      if (d2 <= 0.0D)
        break label298;
      localg1 = localg2.a(1.0D / d2);
    }
    label266: label275: label298: 
    while (true)
    {
      float f3 = Math.min(1.0F, parami.c * 1.15F);
      boolean bool2 = paramg1.d;
      boolean bool3 = paramg2.d;
      int i = (int)Math.ceil((d2 - parami.f) / d3);
      int j = parami.a();
      parami.b(i);
      parami.a(j);
      paramg1 = paramg1.a(localg1.a(parami.f));
      double d1 = parami.f;
      boolean bool1 = true;
      while (true)
      {
        float f2;
        if (d1 <= d2)
        {
          if (!bool2)
            break label266;
          f2 = f3;
        }
        while (true)
        {
          bool1 = parami.a(paramg1.a(), f4, f1, f2, -1);
          if (bool1)
            break label275;
          if ((bool1) && (bool3))
          {
            parami.b(1);
            parami.a(paramg2.a(), f4, f1, f3, -1);
          }
          parami.f = (d1 - d2);
          return;
          f1 = (float)Math.atan2(localg2.b, localg2.a);
          break;
          f2 = parami.c;
        }
        paramg1 = paramg1.a(localg1.a(d3));
        d1 += d3;
        bool2 = false;
      }
    }
  }

  private static void a(g paramg, i parami)
  {
    float f1 = 0.0F;
    float f2 = parami.a;
    float f3 = parami.e;
    paramg = paramg.a();
    if (Math.abs(parami.d) > 0.0F)
      f1 = parami.d;
    float f4 = parami.c;
    parami.b();
    parami.b(1);
    parami.a(paramg, f2 * f3, f1, f4, 0);
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.Components.a.h
 * JD-Core Version:    0.6.0
 */