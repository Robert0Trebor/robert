package org.vidogram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import org.vidogram.messenger.a;

public class y extends View
{
  private static DecelerateInterpolator i = null;
  private static Paint j = null;
  private long a = 0L;
  private float b = 0.0F;
  private float c = 0.0F;
  private long d = 0L;
  private float e = 0.0F;
  private float f = 1.0F;
  private int g;
  private int h = -13196562;

  public y(Context paramContext)
  {
    super(paramContext);
    if (i == null)
    {
      i = new DecelerateInterpolator();
      j = new Paint(1);
      j.setStyle(Paint.Style.STROKE);
      j.setStrokeCap(Paint.Cap.ROUND);
      j.setStrokeWidth(a.a(2.0F));
    }
  }

  private void a()
  {
    long l1 = System.currentTimeMillis();
    long l2 = l1 - this.a;
    this.a = l1;
    float f1;
    if ((this.e != 1.0F) && (this.e != this.b))
    {
      f1 = this.b - this.c;
      if (f1 > 0.0F)
      {
        this.d += l2;
        if (this.d < 300L)
          break label162;
        this.e = this.b;
        this.c = this.b;
        this.d = 0L;
      }
    }
    while (true)
    {
      invalidate();
      if ((this.e >= 1.0F) && (this.e == 1.0F) && (this.f != 0.0F))
      {
        this.f -= (float)l2 / 200.0F;
        if (this.f <= 0.0F)
          this.f = 0.0F;
        invalidate();
      }
      return;
      label162: float f2 = this.c;
      this.e = (f1 * i.getInterpolation((float)this.d / 300.0F) + f2);
    }
  }

  public void a(float paramFloat, boolean paramBoolean)
  {
    if (!paramBoolean)
      this.e = paramFloat;
    for (this.c = paramFloat; ; this.c = this.e)
    {
      if (paramFloat != 1.0F)
        this.f = 1.0F;
      this.b = paramFloat;
      this.d = 0L;
      this.a = System.currentTimeMillis();
      invalidate();
      return;
    }
  }

  public void onDraw(Canvas paramCanvas)
  {
    if ((this.g != 0) && (this.e != 1.0F))
    {
      j.setColor(this.g);
      j.setAlpha((int)(this.f * 255.0F));
      paramCanvas.drawRect((int)(getWidth() * this.e), 0.0F, getWidth(), getHeight(), j);
    }
    j.setColor(this.h);
    j.setAlpha((int)(this.f * 255.0F));
    paramCanvas.drawRect(0.0F, 0.0F, getWidth() * this.e, getHeight(), j);
    a();
  }

  public void setBackColor(int paramInt)
  {
    this.g = paramInt;
  }

  public void setProgressColor(int paramInt)
  {
    this.h = paramInt;
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.Components.y
 * JD-Core Version:    0.6.0
 */