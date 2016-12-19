package org.vidogram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.animation.DecelerateInterpolator;
import org.vidogram.messenger.a;

public class m extends Drawable
{
  private Paint a = new Paint(1);
  private long b;
  private DecelerateInterpolator c = new DecelerateInterpolator();
  private RectF d = new RectF();
  private float e;
  private boolean f;

  public m()
  {
    this.a.setColor(-5395027);
    this.a.setStrokeWidth(a.a(2.0F));
    this.a.setStrokeCap(Paint.Cap.ROUND);
    this.a.setStyle(Paint.Style.STROKE);
  }

  public void a()
  {
    this.f = true;
    this.b = System.currentTimeMillis();
    invalidateSelf();
  }

  public void b()
  {
    this.f = false;
  }

  public void draw(Canvas paramCanvas)
  {
    long l1 = System.currentTimeMillis();
    float f1;
    if (this.b != 0L)
    {
      long l2 = this.b;
      if ((this.f) || (this.e != 0.0F))
      {
        f1 = this.e;
        this.e = ((float)((l1 - l2) * 360L) / 500.0F + f1);
        if ((this.f) || (this.e < 720.0F))
          break label386;
        this.e = 0.0F;
        invalidateSelf();
      }
    }
    paramCanvas.save();
    paramCanvas.translate(getIntrinsicWidth() / 2, getIntrinsicHeight() / 2);
    paramCanvas.rotate(-45.0F);
    float f2;
    float f3;
    float f4;
    if ((this.e >= 0.0F) && (this.e < 90.0F))
    {
      f1 = this.e / 90.0F;
      f2 = 0.0F;
      f3 = 1.0F;
      f4 = 1.0F;
      f1 = 1.0F - f1;
    }
    while (true)
    {
      label154: if (f1 != 0.0F)
        paramCanvas.drawLine(0.0F, 0.0F, 0.0F, a.a(8.0F) * f1, this.a);
      if (f4 != 0.0F)
        paramCanvas.drawLine(-a.a(8.0F) * f4, 0.0F, 0.0F, 0.0F, this.a);
      if (f3 != 0.0F)
        paramCanvas.drawLine(0.0F, -a.a(8.0F) * f3, 0.0F, 0.0F, this.a);
      if (f2 != 1.0F)
        paramCanvas.drawLine(a.a(8.0F) * f2, 0.0F, a.a(8.0F), 0.0F, this.a);
      paramCanvas.restore();
      int i = getBounds().centerX();
      int j = getBounds().centerY();
      this.d.set(i - a.a(8.0F), j - a.a(8.0F), i + a.a(8.0F), j + a.a(8.0F));
      RectF localRectF = this.d;
      if (this.e < 360.0F)
      {
        f1 = 0.0F;
        label348: if (this.e >= 360.0F)
          break label726;
        f2 = this.e;
      }
      while (true)
      {
        paramCanvas.drawArc(localRectF, f1 - 45.0F, f2, false, this.a);
        this.b = l1;
        return;
        label386: this.e -= (int)(this.e / 720.0F) * 720;
        break;
        if ((this.e >= 90.0F) && (this.e < 180.0F))
        {
          f1 = (this.e - 90.0F) / 90.0F;
          f2 = 0.0F;
          f3 = 1.0F;
          f4 = 1.0F - f1;
          f1 = 0.0F;
          break label154;
        }
        if ((this.e >= 180.0F) && (this.e < 270.0F))
        {
          f1 = (this.e - 180.0F) / 90.0F;
          f2 = 0.0F;
          f3 = 1.0F - f1;
          f4 = 0.0F;
          f1 = 0.0F;
          break label154;
        }
        if ((this.e >= 270.0F) && (this.e < 360.0F))
        {
          f2 = (this.e - 270.0F) / 90.0F;
          f3 = 0.0F;
          f4 = 0.0F;
          f1 = 0.0F;
          break label154;
        }
        if ((this.e >= 360.0F) && (this.e < 450.0F))
        {
          f2 = 1.0F - (this.e - 360.0F) / 90.0F;
          f3 = 0.0F;
          f4 = 0.0F;
          f1 = 0.0F;
          break label154;
        }
        if ((this.e >= 450.0F) && (this.e < 540.0F))
        {
          f1 = (this.e - 450.0F) / 90.0F;
          f2 = 0.0F;
          f3 = 0.0F;
          f4 = 0.0F;
          break label154;
        }
        if ((this.e >= 540.0F) && (this.e < 630.0F))
        {
          f4 = (this.e - 540.0F) / 90.0F;
          f2 = 0.0F;
          f3 = 0.0F;
          f1 = 1.0F;
          break label154;
        }
        if ((this.e < 630.0F) || (this.e >= 720.0F))
          break label737;
        f3 = (this.e - 630.0F) / 90.0F;
        f2 = 0.0F;
        f4 = 1.0F;
        f1 = 1.0F;
        break label154;
        f1 = this.e - 360.0F;
        break label348;
        label726: f2 = 720.0F - this.e;
      }
      label737: f2 = 0.0F;
      f3 = 1.0F;
      f4 = 1.0F;
      f1 = 1.0F;
    }
  }

  public int getIntrinsicHeight()
  {
    return a.a(24.0F);
  }

  public int getIntrinsicWidth()
  {
    return a.a(24.0F);
  }

  public int getOpacity()
  {
    return -2;
  }

  public void setAlpha(int paramInt)
  {
  }

  public void setColorFilter(ColorFilter paramColorFilter)
  {
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.Components.m
 * JD-Core Version:    0.6.0
 */