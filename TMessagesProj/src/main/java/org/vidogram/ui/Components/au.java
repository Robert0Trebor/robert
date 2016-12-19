package org.vidogram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.vidogram.messenger.a;

public class au extends Drawable
{
  private boolean a = false;
  private Paint b = new Paint(1);
  private long c = 0L;
  private boolean d = false;
  private RectF e = new RectF();
  private float f;

  public au()
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
      float f1 = this.f;
      this.f = ((float)l1 / 300.0F + f1);
      while (this.f > 1.0F)
        this.f -= 1.0F;
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
    paramCanvas.save();
    int i = getIntrinsicHeight() / 2;
    float f1;
    if (this.a)
    {
      f1 = 1.0F;
      paramCanvas.translate(0.0F, a.a(f1) + i);
      i = 0;
      label35: if (i >= 4)
        break label160;
      if (i != 0)
        break label122;
      this.b.setAlpha((int)(this.f * 255.0F));
    }
    while (true)
    {
      f1 = a.a(4.0F) * i + a.a(4.0F) * this.f;
      this.e.set(-f1, -f1, f1, f1);
      paramCanvas.drawArc(this.e, -15.0F, 30.0F, false, this.b);
      i += 1;
      break label35;
      f1 = 2.0F;
      break;
      label122: if (i == 3)
      {
        this.b.setAlpha((int)((1.0F - this.f) * 255.0F));
        continue;
      }
      this.b.setAlpha(255);
    }
    label160: paramCanvas.restore();
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
 * Qualified Name:     org.vidogram.ui.Components.au
 * JD-Core Version:    0.6.0
 */