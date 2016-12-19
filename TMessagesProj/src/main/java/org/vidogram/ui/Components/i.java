package org.vidogram.ui.Components;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.vidogram.messenger.a;

public class i extends View
{
  private static Paint b;
  private static Paint c;
  private static Paint d;
  private static Paint e;
  private Drawable a;
  private Bitmap f;
  private Bitmap g;
  private Canvas h;
  private Canvas i;
  private boolean j;
  private float k;
  private ObjectAnimator l;
  private boolean m = true;
  private boolean n;
  private boolean o;
  private int p = 22;
  private int q;
  private int r = -10567099;

  public i(Context paramContext, int paramInt)
  {
    super(paramContext);
    if (b == null)
    {
      b = new Paint(1);
      c = new Paint(1);
      c.setColor(0);
      c.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
      d = new Paint(1);
      d.setColor(0);
      d.setStyle(Paint.Style.STROKE);
      d.setStrokeWidth(a.a(28.0F));
      d.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
      e = new Paint(1);
      e.setColor(-1);
      e.setStyle(Paint.Style.STROKE);
      e.setStrokeWidth(a.a(2.0F));
    }
    this.a = paramContext.getResources().getDrawable(paramInt);
  }

  private void a()
  {
    if (this.l != null)
      this.l.cancel();
  }

  private void a(boolean paramBoolean)
  {
    this.m = paramBoolean;
    float f1;
    if (paramBoolean)
      f1 = 1.0F;
    while (true)
    {
      this.l = ObjectAnimator.ofFloat(this, "progress", new float[] { f1 });
      this.l.setDuration(300L);
      this.l.start();
      return;
      f1 = 0.0F;
    }
  }

  public void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (paramBoolean1 == this.o)
      return;
    this.o = paramBoolean1;
    if ((this.n) && (paramBoolean2))
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
    return this.k;
  }

  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    this.n = true;
  }

  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    this.n = false;
  }

  protected void onDraw(Canvas paramCanvas)
  {
    if (getVisibility() != 0);
    do
      return;
    while ((!this.j) && (this.k == 0.0F));
    d.setStrokeWidth(a.a(this.p + 6));
    this.f.eraseColor(0);
    float f5 = getMeasuredWidth() / 2;
    float f2;
    float f3;
    label84: float f4;
    label97: float f1;
    if (this.k >= 0.5F)
    {
      f2 = 1.0F;
      if (this.k >= 0.5F)
        break label433;
      f3 = 0.0F;
      if (!this.m)
        break label448;
      f4 = this.k;
      if (f4 >= 0.2F)
        break label459;
      f1 = f5 - f4 * a.a(2.0F) / 0.2F;
    }
    while (true)
    {
      if (this.j)
      {
        b.setColor(1140850688);
        paramCanvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, f1 - a.a(1.0F), b);
        paramCanvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, f1 - a.a(1.0F), e);
      }
      b.setColor(this.r);
      this.h.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, f1, b);
      this.h.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, (1.0F - f2) * f1, c);
      paramCanvas.drawBitmap(this.f, 0.0F, 0.0F, null);
      this.g.eraseColor(0);
      int i1 = this.a.getIntrinsicWidth();
      int i2 = this.a.getIntrinsicHeight();
      int i3 = (getMeasuredWidth() - i1) / 2;
      int i4 = (getMeasuredHeight() - i2) / 2;
      this.a.setBounds(i3, this.q + i4, i1 + i3, i2 + i4 + this.q);
      this.a.draw(this.i);
      this.i.drawCircle(getMeasuredWidth() / 2 - a.a(2.5F), getMeasuredHeight() / 2 + a.a(4.0F), (1.0F - f3) * ((getMeasuredWidth() + a.a(6.0F)) / 2), d);
      paramCanvas.drawBitmap(this.g, 0.0F, 0.0F, null);
      return;
      f2 = this.k / 0.5F;
      break;
      label433: f3 = (this.k - 0.5F) / 0.5F;
      break label84;
      label448: f4 = 1.0F - this.k;
      break label97;
      label459: f1 = f5;
      if (f4 >= 0.4F)
        continue;
      f1 = f5 - (a.a(2.0F) - (f4 - 0.2F) * a.a(2.0F) / 0.2F);
    }
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
  }

  public void setCheckOffset(int paramInt)
  {
    this.q = paramInt;
  }

  public void setColor(int paramInt)
  {
    this.r = paramInt;
  }

  public void setDrawBackground(boolean paramBoolean)
  {
    this.j = paramBoolean;
  }

  public void setProgress(float paramFloat)
  {
    if (this.k == paramFloat)
      return;
    this.k = paramFloat;
    invalidate();
  }

  public void setSize(int paramInt)
  {
    this.p = paramInt;
  }

  public void setVisibility(int paramInt)
  {
    super.setVisibility(paramInt);
    if ((paramInt == 0) && (this.f == null))
    {
      this.f = Bitmap.createBitmap(a.a(this.p), a.a(this.p), Bitmap.Config.ARGB_4444);
      this.h = new Canvas(this.f);
      this.g = Bitmap.createBitmap(a.a(this.p), a.a(this.p), Bitmap.Config.ARGB_4444);
      this.i = new Canvas(this.g);
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.Components.i
 * JD-Core Version:    0.6.0
 */