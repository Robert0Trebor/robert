package org.vidogram.ui.a;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.animation.DecelerateInterpolator;
import org.vidogram.messenger.a;

public class f extends Drawable
{
  private Paint a = new Paint(1);
  private boolean b = false;
  private long c;
  private float d;
  private float e;
  private int f;
  private boolean g;
  private DecelerateInterpolator h = new DecelerateInterpolator();

  public f(boolean paramBoolean)
  {
    this.a.setColor(-1);
    this.a.setStrokeWidth(a.a(2.0F));
    this.g = paramBoolean;
  }

  public void a(float paramFloat, boolean paramBoolean)
  {
    this.c = 0L;
    if (this.e == 1.0F)
    {
      this.b = true;
      this.c = 0L;
      if (!paramBoolean)
        break label100;
      if (this.e >= paramFloat)
        break label83;
      this.f = (int)(this.e * 300.0F);
      label49: this.c = System.currentTimeMillis();
    }
    for (this.d = paramFloat; ; this.d = paramFloat)
    {
      invalidateSelf();
      return;
      if (this.e != 0.0F)
        break;
      this.b = false;
      break;
      label83: this.f = (int)((1.0F - this.e) * 300.0F);
      break label49;
      label100: this.e = paramFloat;
    }
  }

  public void draw(Canvas paramCanvas)
  {
    float f2;
    if (this.e != this.d)
    {
      if (this.c != 0L)
      {
        this.f = (int)(System.currentTimeMillis() - this.c + this.f);
        if (this.f >= 300)
          this.e = this.d;
      }
      else
      {
        this.c = System.currentTimeMillis();
        invalidateSelf();
      }
    }
    else
    {
      i = (int)(-138.0F * this.e);
      i = Color.rgb(i + 255, i + 255, i + 255);
      this.a.setColor(i);
      paramCanvas.save();
      paramCanvas.translate(getIntrinsicWidth() / 2, getIntrinsicHeight() / 2);
      f1 = this.e;
      if (this.g)
        break label371;
      f2 = this.e;
      if (!this.b)
        break label363;
    }
    label363: for (int i = -225; ; i = 135)
    {
      paramCanvas.rotate(i * f2);
      paramCanvas.drawLine(-a.a(7.0F) - a.a(1.0F) * f1, 0.0F, a.a(8.0F), 0.0F, this.a);
      f2 = -a.a(0.5F);
      float f3 = a.a(7.0F) + a.a(1.0F) * f1;
      float f4 = -a.a(7.0F);
      f4 = a.a(7.0F) * f1 + f4;
      f1 = a.a(0.5F) - a.a(0.5F) * f1;
      paramCanvas.drawLine(f4, -f2, f1, -f3, this.a);
      paramCanvas.drawLine(f4, f2, f1, f3, this.a);
      paramCanvas.restore();
      return;
      if (this.e < this.d)
      {
        this.e = (this.h.getInterpolation(this.f / 300.0F) * this.d);
        break;
      }
      this.e = (1.0F - this.h.getInterpolation(this.f / 300.0F));
      break;
    }
    label371: float f1 = this.e;
    if (this.b);
    for (i = -180; ; i = 180)
    {
      paramCanvas.rotate(i * f1 + 135.0F);
      f1 = 1.0F;
      break;
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
 * Qualified Name:     org.vidogram.ui.a.f
 * JD-Core Version:    0.6.0
 */