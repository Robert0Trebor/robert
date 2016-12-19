package org.vidogram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import org.vidogram.messenger.a;

public class br extends View
{
  private Paint a = new Paint();
  private Paint b = new Paint(1);
  private int c = a.a(12.0F);
  private int d = a.a(12.0F);
  private int e = 0;
  private float f = 0.0F;
  private boolean g = false;
  private a h;

  public br(Context paramContext)
  {
    super(paramContext);
    this.a.setColor(-10724260);
    this.b.setColor(-1);
  }

  public float getProgress()
  {
    return this.f;
  }

  protected void onDraw(Canvas paramCanvas)
  {
    int i = (getMeasuredHeight() - this.d) / 2;
    int j = (int)((getMeasuredWidth() - this.c) * this.f);
    paramCanvas.drawRect(this.c / 2, getMeasuredHeight() / 2 - a.a(1.0F), getMeasuredWidth() - this.c / 2, getMeasuredHeight() / 2 + a.a(1.0F), this.a);
    paramCanvas.drawCircle(this.c / 2 + j, this.d / 2 + i, this.c / 2, this.b);
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    float f1 = 0.0F;
    if (paramMotionEvent == null)
      return false;
    float f2 = paramMotionEvent.getX();
    float f3 = paramMotionEvent.getY();
    float f4 = (int)((getMeasuredWidth() - this.c) * this.f);
    if (paramMotionEvent.getAction() == 0)
    {
      int i = (getMeasuredHeight() - this.c) / 2;
      if (f4 - i <= f2)
      {
        f1 = this.c;
        if ((f2 <= i + (f1 + f4)) && (f3 >= 0.0F) && (f3 <= getMeasuredHeight()))
        {
          this.g = true;
          this.e = (int)(f2 - f4);
          getParent().requestDisallowInterceptTouchEvent(true);
          invalidate();
          return true;
        }
      }
    }
    else if ((paramMotionEvent.getAction() == 1) || (paramMotionEvent.getAction() == 3))
    {
      if (this.g)
      {
        if ((paramMotionEvent.getAction() == 1) && (this.h != null))
          this.h.a(f4 / (getMeasuredWidth() - this.c));
        this.g = false;
        invalidate();
        return true;
      }
    }
    else if ((paramMotionEvent.getAction() == 2) && (this.g))
    {
      f2 = (int)(f2 - this.e);
      if (f2 >= 0.0F);
    }
    while (true)
    {
      this.f = (f1 / (getMeasuredWidth() - this.c));
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
    this.h = parama;
  }

  public void setProgress(float paramFloat)
  {
    float f1;
    if (paramFloat < 0.0F)
      f1 = 0.0F;
    while (true)
    {
      this.f = f1;
      invalidate();
      return;
      f1 = paramFloat;
      if (paramFloat <= 1.0F)
        continue;
      f1 = 1.0F;
    }
  }

  public static abstract interface a
  {
    public abstract void a(float paramFloat);
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.Components.br
 * JD-Core Version:    0.6.0
 */