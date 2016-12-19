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
import android.graphics.RectF;
import android.view.View;
import org.vidogram.messenger.a;

public class j extends View
{
  private static Paint a;
  private static Paint b;
  private static Paint c;
  private static RectF d;
  private Bitmap e;
  private Canvas f;
  private float g;
  private ObjectAnimator h;
  private boolean i;
  private boolean j;
  private boolean k;
  private int l = -12345121;

  public j(Context paramContext)
  {
    super(paramContext);
    if (b == null)
    {
      b = new Paint(1);
      b.setColor(-1);
      b.setStyle(Paint.Style.STROKE);
      b.setStrokeWidth(a.a(2.0F));
      a = new Paint(1);
      a.setColor(0);
      a.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
      c = new Paint(1);
      d = new RectF();
    }
    this.e = Bitmap.createBitmap(a.a(18.0F), a.a(18.0F), Bitmap.Config.ARGB_4444);
    this.f = new Canvas(this.e);
  }

  private void a()
  {
    if (this.h != null)
      this.h.cancel();
  }

  private void a(boolean paramBoolean)
  {
    float f1;
    if (paramBoolean)
      f1 = 1.0F;
    while (true)
    {
      this.h = ObjectAnimator.ofFloat(this, "progress", new float[] { f1 });
      this.h.setDuration(300L);
      this.h.start();
      return;
      f1 = 0.0F;
    }
  }

  public void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (paramBoolean1 == this.j)
      return;
    this.j = paramBoolean1;
    if ((this.i) && (paramBoolean2))
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
    return this.g;
  }

  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    this.i = true;
  }

  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    this.i = false;
  }

  protected void onDraw(Canvas paramCanvas)
  {
    if (getVisibility() != 0)
      return;
    float f2;
    int m;
    float f1;
    if (this.g <= 0.5F)
    {
      f2 = this.g / 0.5F;
      m = Color.rgb((int)((Color.red(this.l) - 115) * f2) + 115, (int)((Color.green(this.l) - 115) * f2) + 115, (int)((Color.blue(this.l) - 115) * f2) + 115);
      c.setColor(m);
      f1 = f2;
    }
    while (true)
    {
      if (this.k)
        c.setColor(-5197648);
      float f3 = a.a(1.0F) * f1;
      d.set(f3, f3, a.a(18.0F) - f3, a.a(18.0F) - f3);
      this.e.eraseColor(0);
      this.f.drawRoundRect(d, a.a(2.0F), a.a(2.0F), c);
      if (f2 != 1.0F)
      {
        f2 = Math.min(a.a(7.0F), f2 * a.a(7.0F) + f3);
        d.set(a.a(2.0F) + f2, a.a(2.0F) + f2, a.a(16.0F) - f2, a.a(16.0F) - f2);
        this.f.drawRect(d, a);
      }
      if (this.g > 0.5F)
      {
        m = (int)(a.a(7.5F) - a.a(5.0F) * (1.0F - f1));
        int i1 = (int)(a.b(13.5F) - a.a(5.0F) * (1.0F - f1));
        this.f.drawLine(a.a(7.5F), (int)a.b(13.5F), m, i1, b);
        int n = (int)(a.b(6.5F) + a.a(9.0F) * (1.0F - f1));
        int i2 = (int)(a.b(13.5F) - a.a(9.0F) * (1.0F - f1));
        this.f.drawLine((int)a.b(6.5F), (int)a.b(13.5F), n, i2, b);
      }
      paramCanvas.drawBitmap(this.e, 0.0F, 0.0F, null);
      return;
      f1 = this.g / 0.5F;
      c.setColor(this.l);
      f1 = 2.0F - f1;
      f2 = 1.0F;
    }
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
  }

  public void setColor(int paramInt)
  {
    this.l = paramInt;
  }

  public void setDisabled(boolean paramBoolean)
  {
    this.k = paramBoolean;
    invalidate();
  }

  public void setProgress(float paramFloat)
  {
    if (this.g == paramFloat)
      return;
    this.g = paramFloat;
    invalidate();
  }

  public void setVisibility(int paramInt)
  {
    super.setVisibility(paramInt);
    if ((paramInt == 0) && (this.e == null));
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.Components.j
 * JD-Core Version:    0.6.0
 */