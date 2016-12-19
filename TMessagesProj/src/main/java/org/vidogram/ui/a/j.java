package org.vidogram.ui.a;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.animation.DecelerateInterpolator;
import org.vidogram.messenger.a;

public class j extends Drawable
{
  private Paint a = new Paint(1);
  private boolean b = false;
  private long c;
  private float d;
  private float e;
  private int f;
  private DecelerateInterpolator g = new DecelerateInterpolator();

  public j()
  {
    this.a.setColor(-1);
    this.a.setStrokeWidth(a.a(2.0F));
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
    float f1;
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
      paramCanvas.save();
      paramCanvas.translate(getIntrinsicWidth() / 2, getIntrinsicHeight() / 2);
      f1 = this.e;
      if (!this.b)
        break label355;
    }
    label355: for (int i = -180; ; i = 180)
    {
      paramCanvas.rotate(i * f1);
      paramCanvas.drawLine(-a.a(9.0F), 0.0F, a.a(9.0F) - a.a(3.0F) * this.e, 0.0F, this.a);
      f1 = a.a(5.0F) * (1.0F - Math.abs(this.e)) - a.a(0.5F) * Math.abs(this.e);
      float f2 = a.a(9.0F) - a.a(2.5F) * Math.abs(this.e);
      float f3 = a.a(5.0F) + a.a(2.0F) * Math.abs(this.e);
      float f4 = -a.a(9.0F);
      f4 = a.a(7.5F) * Math.abs(this.e) + f4;
      paramCanvas.drawLine(f4, -f3, f2, -f1, this.a);
      paramCanvas.drawLine(f4, f3, f2, f1, this.a);
      paramCanvas.restore();
      return;
      if (this.e < this.d)
      {
        this.e = (this.g.getInterpolation(this.f / 300.0F) * this.d);
        break;
      }
      this.e = (1.0F - this.g.getInterpolation(this.f / 300.0F));
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
 * Qualified Name:     org.vidogram.ui.a.j
 * JD-Core Version:    0.6.0
 */