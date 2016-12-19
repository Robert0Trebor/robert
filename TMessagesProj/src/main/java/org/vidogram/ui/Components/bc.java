package org.vidogram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.graphics.drawable.Drawable;
import org.vidogram.messenger.a;

public class bc extends Drawable
{
  private boolean a = false;
  private Paint b = new Paint(1);
  private long c = 0L;
  private boolean d = false;
  private float e;

  public bc()
  {
    this.b.setColor(-2758409);
    this.b.setStyle(Paint.Style.STROKE);
    this.b.setStrokeWidth(a.a(2.0F));
    this.b.setStrokeCap(Paint.Cap.ROUND);
  }

  private void c()
  {
    long l1 = 50L;
    long l3 = System.currentTimeMillis();
    long l2 = l3 - this.c;
    this.c = l3;
    if (l2 > 50L);
    while (true)
    {
      float f = this.e;
      this.e = ((float)l1 / 500.0F + f);
      while (this.e > 1.0F)
        this.e -= 1.0F;
      invalidateSelf();
      return;
      l1 = l2;
    }
  }

  public void a()
  {
    this.c = System.currentTimeMillis();
    this.d = true;
    invalidateSelf();
  }

  public void a(boolean paramBoolean)
  {
    this.a = paramBoolean;
  }

  public void b()
  {
    this.d = false;
  }

  public void draw(Canvas paramCanvas)
  {
    int i = 0;
    if (i < 3)
    {
      label29: float f1;
      float f2;
      label63: float f3;
      float f4;
      if (i == 0)
      {
        this.b.setAlpha((int)(this.e * 255.0F));
        f1 = a.a(5.0F) * i;
        f2 = a.a(5.0F) * this.e + f1;
        if (!this.a)
          break label211;
        f1 = 3.0F;
        f3 = a.a(f1);
        f4 = a.a(4.0F);
        if (!this.a)
          break label217;
        f1 = 7.0F;
        label88: paramCanvas.drawLine(f2, f3, f2 + f4, a.a(f1), this.b);
        if (!this.a)
          break label223;
        f1 = 11.0F;
        label118: f3 = a.a(f1);
        f4 = a.a(4.0F);
        if (!this.a)
          break label229;
        f1 = 7.0F;
      }
      while (true)
      {
        paramCanvas.drawLine(f2, f3, f2 + f4, a.a(f1), this.b);
        i += 1;
        break;
        if (i == 2)
        {
          this.b.setAlpha((int)((1.0F - this.e) * 255.0F));
          break label29;
        }
        this.b.setAlpha(255);
        break label29;
        label211: f1 = 4.0F;
        break label63;
        label217: f1 = 8.0F;
        break label88;
        label223: f1 = 12.0F;
        break label118;
        label229: f1 = 8.0F;
      }
    }
    if (this.d)
      c();
  }

  public int getIntrinsicHeight()
  {
    return a.a(14.0F);
  }

  public int getIntrinsicWidth()
  {
    return a.a(18.0F);
  }

  public int getOpacity()
  {
    return 0;
  }

  public void setAlpha(int paramInt)
  {
  }

  public void setColorFilter(ColorFilter paramColorFilter)
  {
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.Components.bc
 * JD-Core Version:    0.6.0
 */