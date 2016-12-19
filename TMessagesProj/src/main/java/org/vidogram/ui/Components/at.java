package org.vidogram.ui.Components;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.view.View;
import org.vidogram.messenger.a;
import org.vidogram.messenger.n;

public class at extends View
{
  private static Paint c;
  private static Paint d;
  private static Paint e;
  private Bitmap a;
  private Canvas b;
  private int f = -2758409;
  private int g = -2758409;
  private float h;
  private ObjectAnimator i;
  private boolean j;
  private boolean k;
  private int l = a.a(16.0F);

  public at(Context paramContext)
  {
    super(paramContext);
    if (c == null)
    {
      c = new Paint(1);
      c.setStrokeWidth(a.a(2.0F));
      c.setStyle(Paint.Style.STROKE);
      e = new Paint(1);
      d = new Paint(1);
      d.setColor(0);
      d.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }
    try
    {
      this.a = Bitmap.createBitmap(a.a(this.l), a.a(this.l), Bitmap.Config.ARGB_4444);
      this.b = new Canvas(this.a);
      return;
    }
    catch (Throwable paramContext)
    {
      n.a("tmessages", paramContext);
    }
  }

  private void a()
  {
    if (this.i != null)
      this.i.cancel();
  }

  private void a(boolean paramBoolean)
  {
    float f1;
    if (paramBoolean)
      f1 = 1.0F;
    while (true)
    {
      this.i = ObjectAnimator.ofFloat(this, "progress", new float[] { f1 });
      this.i.setDuration(200L);
      this.i.start();
      return;
      f1 = 0.0F;
    }
  }

  public void a(int paramInt1, int paramInt2)
  {
    this.g = paramInt1;
    this.f = paramInt2;
    invalidate();
  }

  public void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (paramBoolean1 == this.k)
      return;
    this.k = paramBoolean1;
    if ((this.j) && (paramBoolean2))
    {
      a(paramBoolean1);
      return;
    }
    a();
    float f1;
    if (paramBoolean1)
      f1 = 1.0F;
    while (true)
    {
      setProgress(f1);
      return;
      f1 = 0.0F;
    }
  }

  public float getProgress()
  {
    return this.h;
  }

  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    this.j = true;
  }

  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    this.j = false;
  }

  protected void onDraw(Canvas paramCanvas)
  {
    if ((this.a == null) || (this.a.getWidth() != getMeasuredWidth()))
      if (this.a != null)
        this.a.recycle();
    try
    {
      this.a = Bitmap.createBitmap(getMeasuredWidth(), getMeasuredHeight(), Bitmap.Config.ARGB_8888);
      this.b = new Canvas(this.a);
      if (this.h <= 0.5F)
      {
        c.setColor(this.g);
        e.setColor(this.g);
        f1 = this.h / 0.5F;
        if (this.a != null)
        {
          this.a.eraseColor(0);
          f2 = this.l / 2 - (1.0F + f1) * a.b;
          this.b.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, f2, c);
          if (this.h > 0.5F)
            break label388;
          this.b.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, f2 - a.a(1.0F), e);
          this.b.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, (1.0F - f1) * (f2 - a.a(1.0F)), d);
          paramCanvas.drawBitmap(this.a, 0.0F, 0.0F, null);
        }
        return;
      }
    }
    catch (Throwable localCanvas)
    {
      while (true)
      {
        float f2;
        n.a("tmessages", localThrowable);
        continue;
        float f1 = 2.0F - this.h / 0.5F;
        int m = Color.red(this.g);
        int n = (int)((Color.red(this.f) - m) * (1.0F - f1));
        int i1 = Color.green(this.g);
        int i2 = (int)((Color.green(this.f) - i1) * (1.0F - f1));
        int i3 = Color.blue(this.g);
        m = Color.rgb(m + n, i1 + i2, i3 + (int)((Color.blue(this.f) - i3) * (1.0F - f1)));
        c.setColor(m);
        e.setColor(m);
        continue;
        label388: Canvas localCanvas = this.b;
        float f3 = getMeasuredWidth() / 2;
        float f4 = getMeasuredHeight() / 2;
        float f5 = this.l / 4;
        localCanvas.drawCircle(f3, f4, f1 * (f2 - a.a(1.0F) - this.l / 4) + f5, e);
      }
    }
  }

  public void setProgress(float paramFloat)
  {
    if (this.h == paramFloat)
      return;
    this.h = paramFloat;
    invalidate();
  }

  public void setSize(int paramInt)
  {
    if (this.l == paramInt)
      return;
    this.l = paramInt;
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.Components.at
 * JD-Core Version:    0.6.0
 */