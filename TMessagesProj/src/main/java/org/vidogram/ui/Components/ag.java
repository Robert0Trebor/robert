package org.vidogram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import org.vidogram.messenger.a;

public class ag extends View
{
  private Paint a = new Paint();
  private Paint b = new Paint(1);
  private int c = a.a(16.0F);
  private int d = 0;
  private float e = 0.0F;
  private boolean f = false;
  private int g;
  private int h;
  private a i;

  public ag(Context paramContext)
  {
    super(paramContext);
    this.a.setColor(-1724368840);
    this.b.setColor(-11292945);
  }

  public void a(int paramInt1, int paramInt2)
  {
    this.g = paramInt1;
    this.h = paramInt2;
  }

  public void a(int paramInt, boolean paramBoolean)
  {
    int j;
    if (paramInt < this.g)
      j = this.g;
    while (true)
    {
      this.e = ((j - this.g) / (this.h - this.g));
      invalidate();
      if ((paramBoolean) && (this.i != null))
        this.i.a();
      return;
      j = paramInt;
      if (paramInt <= this.h)
        continue;
      j = this.h;
    }
  }

  public int getProgress()
  {
    return (int)(this.g + this.e * (this.h - this.g));
  }

  protected void onDraw(Canvas paramCanvas)
  {
    int j = (getMeasuredHeight() - this.c) / 2;
    int k = (int)((getMeasuredWidth() - this.c) * this.e);
    paramCanvas.drawRect(this.c / 2, getMeasuredHeight() / 2 - a.a(1.0F), getMeasuredWidth() - this.c / 2, getMeasuredHeight() / 2 + a.a(1.0F), this.a);
    if (this.g == 0)
      paramCanvas.drawRect(this.c / 2, getMeasuredHeight() / 2 - a.a(1.0F), k, getMeasuredHeight() / 2 + a.a(1.0F), this.b);
    while (true)
    {
      paramCanvas.drawCircle(this.c / 2 + k, this.c / 2 + j, this.c / 2, this.b);
      return;
      if (this.e > 0.5F)
      {
        paramCanvas.drawRect(getMeasuredWidth() / 2 - a.a(1.0F), (getMeasuredHeight() - this.c) / 2, getMeasuredWidth() / 2, (getMeasuredHeight() + this.c) / 2, this.b);
        paramCanvas.drawRect(getMeasuredWidth() / 2, getMeasuredHeight() / 2 - a.a(1.0F), k, getMeasuredHeight() / 2 + a.a(1.0F), this.b);
        continue;
      }
      paramCanvas.drawRect(getMeasuredWidth() / 2, (getMeasuredHeight() - this.c) / 2, getMeasuredWidth() / 2 + a.a(1.0F), (getMeasuredHeight() + this.c) / 2, this.b);
      paramCanvas.drawRect(k, getMeasuredHeight() / 2 - a.a(1.0F), getMeasuredWidth() / 2, getMeasuredHeight() / 2 + a.a(1.0F), this.b);
    }
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    float f1 = 0.0F;
    if (paramMotionEvent == null)
      return false;
    float f2 = paramMotionEvent.getX();
    float f3 = paramMotionEvent.getY();
    float f4 = (int)((getMeasuredWidth() - this.c) * this.e);
    if (paramMotionEvent.getAction() == 0)
    {
      int j = (getMeasuredHeight() - this.c) / 2;
      if (f4 - j <= f2)
      {
        f1 = this.c;
        if ((f2 <= j + (f1 + f4)) && (f3 >= 0.0F) && (f3 <= getMeasuredHeight()))
        {
          this.f = true;
          this.d = (int)(f2 - f4);
          getParent().requestDisallowInterceptTouchEvent(true);
          invalidate();
          return true;
        }
      }
    }
    else if ((paramMotionEvent.getAction() == 1) || (paramMotionEvent.getAction() == 3))
    {
      if (this.f)
      {
        this.f = false;
        invalidate();
        return true;
      }
    }
    else if ((paramMotionEvent.getAction() == 2) && (this.f))
    {
      f2 = (int)(f2 - this.d);
      if (f2 >= 0.0F);
    }
    while (true)
    {
      this.e = (f1 / (getMeasuredWidth() - this.c));
      if (this.i != null)
        this.i.a();
      invalidate();
      return true;
      if (f2 > getMeasuredWidth() - this.c)
      {
        f1 = getMeasuredWidth() - this.c;
        continue;
        return false;
      }
      f1 = f2;
    }
  }

  public void setDelegate(a parama)
  {
    this.i = parama;
  }

  public void setProgress(int paramInt)
  {
    a(paramInt, true);
  }

  public static abstract interface a
  {
    public abstract void a();
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.Components.ag
 * JD-Core Version:    0.6.0
 */