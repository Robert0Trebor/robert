package org.vidogram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.animation.DecelerateInterpolator;
import org.vidogram.messenger.a;
import org.vidogram.messenger.y;

public class bp extends Drawable
{
  private boolean a = false;
  private Paint b = new Paint(1);
  private float[] c = new float[3];
  private float[] d = { 0.0F, 150.0F, 300.0F };
  private float[] e = { 0.0F, 0.0F, 0.0F };
  private long f = 0L;
  private boolean g = false;
  private DecelerateInterpolator h = new DecelerateInterpolator();

  public bp()
  {
    this.b.setColor(-2758409);
  }

  private void c()
  {
    long l1 = 50L;
    long l3 = System.currentTimeMillis();
    long l2 = l3 - this.f;
    this.f = l3;
    if (l2 > 50L);
    while (true)
    {
      int i = 0;
      if (i < 3)
      {
        float[] arrayOfFloat = this.e;
        arrayOfFloat[i] += (float)l1;
        float f1 = this.e[i] - this.d[i];
        if (f1 > 0.0F)
          if (f1 <= 320.0F)
          {
            f1 = this.h.getInterpolation(f1 / 320.0F);
            this.c[i] = (f1 + 1.33F);
          }
        while (true)
        {
          i += 1;
          break;
          if (f1 <= 640.0F)
          {
            f1 = this.h.getInterpolation((f1 - 320.0F) / 320.0F);
            this.c[i] = (1.0F - f1 + 1.33F);
            continue;
          }
          if (f1 >= 800.0F)
          {
            this.e[i] = 0.0F;
            this.d[i] = 0.0F;
            this.c[i] = 1.33F;
            continue;
          }
          this.c[i] = 1.33F;
          continue;
          this.c[i] = 1.33F;
        }
      }
      invalidateSelf();
      return;
      l1 = l2;
    }
  }

  private void d()
  {
    if (this.g)
    {
      if (!y.a().b())
        c();
    }
    else
      return;
    a.a(new Runnable()
    {
      public void run()
      {
        bp.a(bp.this);
      }
    }
    , 100L);
  }

  public void a()
  {
    this.f = System.currentTimeMillis();
    this.g = true;
    invalidateSelf();
  }

  public void a(boolean paramBoolean)
  {
    this.a = paramBoolean;
  }

  public void b()
  {
    int i = 0;
    while (i < 3)
    {
      this.e[i] = 0.0F;
      this.c[i] = 1.33F;
      i += 1;
    }
    this.d[0] = 0.0F;
    this.d[1] = 150.0F;
    this.d[2] = 300.0F;
    this.g = false;
  }

  public void draw(Canvas paramCanvas)
  {
    if (this.a);
    int j;
    for (int i = a.a(8.5F) + getBounds().top; ; j = a.a(9.3F) + getBounds().top)
    {
      paramCanvas.drawCircle(a.a(3.0F), i, this.c[0] * a.b, this.b);
      paramCanvas.drawCircle(a.a(9.0F), i, this.c[1] * a.b, this.b);
      paramCanvas.drawCircle(a.a(15.0F), i, this.c[2] * a.b, this.b);
      d();
      return;
    }
  }

  public int getIntrinsicHeight()
  {
    return a.a(18.0F);
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
 * Qualified Name:     org.vidogram.ui.Components.bp
 * JD-Core Version:    0.6.0
 */