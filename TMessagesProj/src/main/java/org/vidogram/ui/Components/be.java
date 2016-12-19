package org.vidogram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import org.vidogram.messenger.a;

public class be extends View
{
  private Drawable a = getResources().getDrawable(2130837675);
  private DecelerateInterpolator b = new DecelerateInterpolator();
  private Paint c = new Paint(1);
  private Paint d;
  private a e;
  private b f;
  private boolean g;
  private float h;
  private long i;
  private long j;
  private Runnable k = new Runnable()
  {
    public void run()
    {
      if (be.a(be.this) != null)
        be.a(be.this).a();
    }
  };

  public be(Context paramContext)
  {
    super(paramContext);
    this.c.setStyle(Paint.Style.FILL);
    this.c.setColor(-1);
    this.d = new Paint(1);
    this.d.setStyle(Paint.Style.FILL);
    this.d.setColor(-3324089);
    this.f = b.a;
  }

  private void setHighlighted(boolean paramBoolean)
  {
    AnimatorSet localAnimatorSet = new AnimatorSet();
    if (paramBoolean)
      localAnimatorSet.playTogether(new Animator[] { ObjectAnimator.ofFloat(this, "scaleX", new float[] { 1.06F }), ObjectAnimator.ofFloat(this, "scaleY", new float[] { 1.06F }) });
    while (true)
    {
      localAnimatorSet.setDuration(120L);
      localAnimatorSet.setInterpolator(this.b);
      localAnimatorSet.start();
      return;
      localAnimatorSet.playTogether(new Animator[] { ObjectAnimator.ofFloat(this, "scaleX", new float[] { 1.0F }), ObjectAnimator.ofFloat(this, "scaleY", new float[] { 1.0F }) });
      localAnimatorSet.setStartDelay(40L);
    }
  }

  public void a(b paramb, boolean paramBoolean)
  {
    if (this.f != paramb)
    {
      this.f = paramb;
      if (!paramBoolean)
        break label49;
      this.i = System.currentTimeMillis();
      this.j = 0L;
      if (this.f != b.b)
        this.h = 0.0F;
    }
    while (true)
    {
      invalidate();
      return;
      label49: if (this.f == b.b)
      {
        this.h = 1.0F;
        continue;
      }
      this.h = 0.0F;
    }
  }

  public a getDelegate()
  {
    return this.e;
  }

  public b getState()
  {
    return this.f;
  }

  protected void onDraw(Canvas paramCanvas)
  {
    long l1 = 17L;
    int m = getMeasuredWidth() / 2;
    int n = getMeasuredHeight() / 2;
    this.a.setBounds(m - a.a(36.0F), n - a.a(36.0F), a.a(36.0F) + m, a.a(36.0F) + n);
    this.a.draw(paramCanvas);
    float f1;
    long l2;
    if ((this.g) || (getScaleX() != 1.0F))
    {
      f1 = (getScaleX() - 1.0F) / 0.06F;
      this.c.setAlpha((int)(255.0F * f1));
      paramCanvas.drawCircle(m, n, a.a(26.0F), this.c);
      if (this.f == b.b)
        if (this.h != 1.0F)
        {
          l2 = Math.abs(System.currentTimeMillis() - this.i);
          if (l2 <= 17L)
            break label288;
        }
    }
    while (true)
    {
      this.j = (l1 + this.j);
      if (this.j > 120L)
        this.j = 120L;
      this.h = this.b.getInterpolation((float)this.j / 120.0F);
      invalidate();
      paramCanvas.drawCircle(m, n, a.a(26.0F) * f1 * this.h, this.d);
      do
      {
        do
          return;
        while (this.h == 0.0F);
        paramCanvas.drawCircle(m, n, a.a(26.0F) * f1, this.d);
        return;
      }
      while (this.h == 0.0F);
      this.h = 0.0F;
      return;
      label288: l1 = l2;
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    setMeasuredDimension(a.a(84.0F), a.a(84.0F));
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    float f1 = paramMotionEvent.getX();
    float f2 = paramMotionEvent.getX();
    switch (paramMotionEvent.getAction())
    {
    default:
    case 0:
    case 1:
    case 2:
      do
      {
        do
        {
          do
          {
            return true;
            a.a(this.k, 220L);
            this.g = true;
            setHighlighted(true);
            return true;
            setHighlighted(false);
            a.b(this.k);
          }
          while ((f1 < 0.0F) || (f2 < 0.0F) || (f1 > getMeasuredWidth()) || (f2 > getMeasuredHeight()));
          this.e.c();
          return true;
        }
        while ((f1 >= 0.0F) && (f2 >= 0.0F) && (f1 <= getMeasuredWidth()) && (f2 <= getMeasuredHeight()));
        a.b(this.k);
      }
      while (this.f != b.b);
      setHighlighted(false);
      this.e.b();
      a(b.a, true);
      return true;
    case 3:
    }
    setHighlighted(false);
    this.g = false;
    return true;
  }

  public void setDelegate(a parama)
  {
    this.e = parama;
  }

  public void setScaleX(float paramFloat)
  {
    super.setScaleX(paramFloat);
    invalidate();
  }

  public static abstract interface a
  {
    public abstract void a();

    public abstract void b();

    public abstract void c();
  }

  public static enum b
  {
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.Components.be
 * JD-Core Version:    0.6.0
 */