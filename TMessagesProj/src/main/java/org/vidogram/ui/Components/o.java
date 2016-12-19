package org.vidogram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.view.View;
import org.vidogram.messenger.a;

public class o extends View
{
  private Paint a = new Paint(1);
  private Paint b = new Paint(1);
  private RectF c = new RectF();
  private int d = 0;
  private long e;

  public o(Context paramContext, int paramInt)
  {
    super(paramContext);
    this.a.setStyle(Paint.Style.STROKE);
    this.a.setStrokeWidth(a.a(2.0F));
    this.b.setStyle(Paint.Style.STROKE);
    this.b.setStrokeWidth(a.a(2.0F));
    this.b.setStrokeCap(Paint.Cap.ROUND);
    if (paramInt == 0)
    {
      this.a.setColor(-4202506);
      this.b.setColor(-13920542);
      return;
    }
    this.a.setColor(-4202506);
    this.b.setColor(-1);
  }

  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    this.e = System.currentTimeMillis();
    invalidate();
  }

  protected void onDraw(Canvas paramCanvas)
  {
    if (getVisibility() != 0)
      return;
    long l1 = System.currentTimeMillis();
    long l2 = this.e;
    this.e = l1;
    this.d = (int)(this.d + (float)((l1 - l2) * 360L) / 1000.0F);
    int i = getMeasuredWidth() / 2 - a.a(9.0F);
    int j = getMeasuredHeight() / 2 - a.a(9.0F);
    this.c.set(i, j, i + a.a(18.0F), j + a.a(18.0F));
    paramCanvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, a.a(9.0F), this.a);
    paramCanvas.drawArc(this.c, this.d - 90, 90.0F, false, this.b);
    invalidate();
  }

  public void setVisibility(int paramInt)
  {
    super.setVisibility(paramInt);
    this.e = System.currentTimeMillis();
    invalidate();
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.Components.o
 * JD-Core Version:    0.6.0
 */