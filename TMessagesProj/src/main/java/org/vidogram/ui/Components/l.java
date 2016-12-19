package org.vidogram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Matrix.ScaleToFit;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.view.View;
import org.vidogram.messenger.a;
import org.vidogram.messenger.n;

public class l extends View
{
  private int a;
  private int b;
  private int c;
  private int d;
  private int e;
  private RectF f;
  private Paint g = new Paint();
  private Bitmap h;
  private Matrix i;
  private boolean j;
  private int k;
  private BitmapShader l;
  private Paint m;
  private RectF n;
  private RectF o;
  private Matrix p;
  private float q;
  private float[][] r;

  public l(Context paramContext)
  {
    super(paramContext);
    this.g.setFilterBitmap(true);
    this.i = new Matrix();
    this.f = new RectF();
    this.o = new RectF();
    this.m = new Paint(1);
    this.n = new RectF();
    this.p = new Matrix();
  }

  public float getAnimationProgress()
  {
    return this.q;
  }

  public int getClipBottom()
  {
    return this.a;
  }

  public int getClipHorizontal()
  {
    return this.c;
  }

  public int getClipLeft()
  {
    return this.b;
  }

  public int getClipRight()
  {
    return this.c;
  }

  public int getClipTop()
  {
    return this.d;
  }

  public int getRadius()
  {
    return this.k;
  }

  public void onDraw(Canvas paramCanvas)
  {
    float f2 = 1.0F;
    if (getVisibility() != 0);
    do
      return;
    while (this.h == null);
    float f3 = getScaleY();
    paramCanvas.save();
    if (this.j)
    {
      this.p.reset();
      this.n.set(0.0F, 0.0F, getWidth(), getHeight());
      int i2;
      int i1;
      float f1;
      if ((this.e % 360 == 90) || (this.e % 360 == 270))
      {
        i2 = this.h.getHeight();
        i1 = this.h.getWidth();
        if (getWidth() == 0)
          break label348;
        f1 = i2 / getWidth();
        label123: if (getHeight() != 0)
          f2 = i1 / getHeight();
        float f4 = Math.min(f1, f2);
        if (Math.abs(f1 - f2) <= 1.0E-005F)
          break label353;
        int i3 = (int)Math.floor(getWidth() * f4);
        int i4 = (int)Math.floor(getHeight() * f4);
        this.o.set((i2 - i3) / 2, (i1 - i4) / 2, i3, i4);
        a.a(this.p, this.o, this.n, this.e, Matrix.ScaleToFit.START);
      }
      while (true)
      {
        this.l.setLocalMatrix(this.p);
        paramCanvas.clipRect(this.b / f3, this.d / f3, getWidth() - this.c / f3, getHeight() - this.a / f3);
        paramCanvas.drawRoundRect(this.n, this.k, this.k, this.m);
        paramCanvas.restore();
        return;
        i2 = this.h.getWidth();
        i1 = this.h.getHeight();
        break;
        label348: f1 = 1.0F;
        break label123;
        label353: this.o.set(0.0F, 0.0F, this.h.getWidth(), this.h.getHeight());
        a.a(this.p, this.o, this.n, this.e, Matrix.ScaleToFit.FILL);
      }
    }
    if ((this.e == 90) || (this.e == 270))
    {
      this.f.set(-getHeight() / 2, -getWidth() / 2, getHeight() / 2, getWidth() / 2);
      this.i.setRectToRect(this.o, this.f, Matrix.ScaleToFit.FILL);
      this.i.postRotate(this.e, 0.0F, 0.0F);
      this.i.postTranslate(getWidth() / 2, getHeight() / 2);
    }
    while (true)
    {
      while (true)
      {
        paramCanvas.clipRect(this.b / f3, this.d / f3, getWidth() - this.c / f3, getHeight() - this.a / f3);
        try
        {
          paramCanvas.drawBitmap(this.h, this.i, this.g);
        }
        catch (Exception localException)
        {
          n.a("tmessages", localException);
        }
      }
      break;
      if (this.e == 180)
      {
        this.f.set(-getWidth() / 2, -getHeight() / 2, getWidth() / 2, getHeight() / 2);
        this.i.setRectToRect(this.o, this.f, Matrix.ScaleToFit.FILL);
        this.i.postRotate(this.e, 0.0F, 0.0F);
        this.i.postTranslate(getWidth() / 2, getHeight() / 2);
        continue;
      }
      this.f.set(0.0F, 0.0F, getWidth(), getHeight());
      this.i.setRectToRect(this.o, this.f, Matrix.ScaleToFit.FILL);
    }
  }

  public void setAnimationProgress(float paramFloat)
  {
    this.q = paramFloat;
    setScaleX(this.r[0][0] + (this.r[1][0] - this.r[0][0]) * this.q);
    setScaleY(this.r[0][1] + (this.r[1][1] - this.r[0][1]) * this.q);
    setTranslationX(this.r[0][2] + (this.r[1][2] - this.r[0][2]) * this.q);
    setTranslationY(this.r[0][3] + (this.r[1][3] - this.r[0][3]) * this.q);
    setClipHorizontal((int)(this.r[0][4] + (this.r[1][4] - this.r[0][4]) * this.q));
    setClipTop((int)(this.r[0][5] + (this.r[1][5] - this.r[0][5]) * this.q));
    setClipBottom((int)(this.r[0][6] + (this.r[1][6] - this.r[0][6]) * this.q));
    setRadius((int)(this.r[0][7] + (this.r[1][7] - this.r[0][7]) * this.q));
    invalidate();
  }

  public void setAnimationValues(float[][] paramArrayOfFloat)
  {
    this.r = paramArrayOfFloat;
  }

  public void setClipBottom(int paramInt)
  {
    this.a = paramInt;
    invalidate();
  }

  public void setClipHorizontal(int paramInt)
  {
    this.c = paramInt;
    this.b = paramInt;
    invalidate();
  }

  public void setClipLeft(int paramInt)
  {
    this.b = paramInt;
    invalidate();
  }

  public void setClipRight(int paramInt)
  {
    this.c = paramInt;
    invalidate();
  }

  public void setClipTop(int paramInt)
  {
    this.d = paramInt;
    invalidate();
  }

  public void setClipVertical(int paramInt)
  {
    this.a = paramInt;
    this.d = paramInt;
    invalidate();
  }

  public void setImageBitmap(Bitmap paramBitmap)
  {
    this.h = paramBitmap;
    if (paramBitmap != null)
    {
      this.o.set(0.0F, 0.0F, paramBitmap.getWidth(), paramBitmap.getHeight());
      if (this.j)
      {
        this.l = new BitmapShader(paramBitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
        this.m.setShader(this.l);
      }
    }
    invalidate();
  }

  public void setNeedRadius(boolean paramBoolean)
  {
    this.j = paramBoolean;
  }

  public void setOrientation(int paramInt)
  {
    this.e = paramInt;
  }

  public void setRadius(int paramInt)
  {
    this.k = paramInt;
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.Components.l
 * JD-Core Version:    0.6.0
 */