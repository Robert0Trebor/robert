package org.vidogram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import org.vidogram.messenger.a;

public class as
{
  private static DecelerateInterpolator q;
  private static Paint r;
  private long a = 0L;
  private float b = 0.0F;
  private float c = 0.0F;
  private float d = 0.0F;
  private long e = 0L;
  private float f = 0.0F;
  private RectF g = new RectF();
  private RectF h = new RectF();
  private View i;
  private float j = 1.0F;
  private boolean k;
  private boolean l;
  private Drawable m;
  private Drawable n;
  private boolean o;
  private int p = -1;
  private boolean s = true;

  public as(View paramView)
  {
    if (q == null)
    {
      q = new DecelerateInterpolator();
      r = new Paint(1);
      r.setStyle(Paint.Style.STROKE);
      r.setStrokeCap(Paint.Cap.ROUND);
      r.setStrokeWidth(a.a(3.0F));
    }
    this.i = paramView;
  }

  private void b()
  {
    int i1 = a.a(2.0F);
    this.i.invalidate((int)this.g.left - i1, (int)this.g.top - i1, (int)this.g.right + i1 * 2, i1 * 2 + (int)this.g.bottom);
  }

  private void c(boolean paramBoolean)
  {
    long l1 = System.currentTimeMillis();
    long l2 = l1 - this.a;
    this.a = l1;
    float f1;
    if (paramBoolean)
      if (this.f != 1.0F)
      {
        this.b += (float)(360L * l2) / 3000.0F;
        f1 = this.c - this.d;
        if (f1 > 0.0F)
        {
          this.e += l2;
          if (this.e >= 300L)
          {
            this.f = this.c;
            this.d = this.c;
            this.e = 0L;
          }
        }
        else
        {
          b();
        }
      }
      else if ((this.f >= 1.0F) && (this.n != null))
      {
        this.j -= (float)l2 / 200.0F;
        if (this.j <= 0.0F)
        {
          this.j = 0.0F;
          this.n = null;
        }
        b();
      }
    do
    {
      return;
      float f2 = this.d;
      this.f = (f1 * q.getInterpolation((float)this.e / 300.0F) + f2);
      break;
    }
    while (this.n == null);
    this.j -= (float)l2 / 200.0F;
    if (this.j <= 0.0F)
    {
      this.j = 0.0F;
      this.n = null;
    }
    b();
  }

  public float a()
  {
    if ((this.n != null) || (this.m != null))
      return this.j;
    return 0.0F;
  }

  public void a(float paramFloat, boolean paramBoolean)
  {
    if ((paramFloat != 1.0F) && (this.j != 0.0F) && (this.n != null))
    {
      this.j = 0.0F;
      this.n = null;
    }
    if (!paramBoolean)
      this.f = paramFloat;
    for (this.d = paramFloat; ; this.d = this.f)
    {
      this.c = paramFloat;
      this.e = 0L;
      b();
      return;
      if (this.f <= paramFloat)
        continue;
      this.f = paramFloat;
    }
  }

  public void a(int paramInt)
  {
    this.p = paramInt;
  }

  public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.g.set(paramInt1, paramInt2, paramInt3, paramInt4);
  }

  public void a(Canvas paramCanvas)
  {
    label114: int i1;
    if (this.n != null)
    {
      if (this.s)
      {
        this.n.setAlpha((int)(this.j * 255.0F));
        this.n.setBounds((int)this.g.left, (int)this.g.top, (int)this.g.right, (int)this.g.bottom);
        this.n.draw(paramCanvas);
      }
    }
    else
    {
      if ((!this.o) && (this.m != null))
      {
        if (this.n == null)
          break label309;
        this.m.setAlpha((int)((1.0F - this.j) * 255.0F));
        this.m.setBounds((int)this.g.left, (int)this.g.top, (int)this.g.right, (int)this.g.bottom);
        this.m.draw(paramCanvas);
      }
      if ((!this.k) && (!this.l))
        break label334;
      i1 = a.a(4.0F);
      r.setColor(this.p);
      if (!this.l)
        break label322;
      r.setAlpha((int)(this.j * 255.0F));
    }
    while (true)
    {
      this.h.set(this.g.left + i1, this.g.top + i1, this.g.right - i1, this.g.bottom - i1);
      paramCanvas.drawArc(this.h, this.b - 90.0F, Math.max(4.0F, 360.0F * this.f), false, r);
      c(true);
      return;
      this.n.setAlpha(255);
      break;
      label309: this.m.setAlpha(255);
      break label114;
      label322: r.setAlpha(255);
    }
    label334: c(false);
  }

  public void a(Drawable paramDrawable, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.a = System.currentTimeMillis();
    if ((paramBoolean2) && (this.m != paramDrawable))
    {
      this.n = this.m;
      this.l = this.k;
      this.j = 1.0F;
      a(1.0F, paramBoolean2);
    }
    while (true)
    {
      this.k = paramBoolean1;
      this.m = paramDrawable;
      if (paramBoolean2)
        break;
      this.i.invalidate();
      return;
      this.n = null;
      this.l = false;
    }
    b();
  }

  public void a(boolean paramBoolean)
  {
    this.s = paramBoolean;
  }

  public boolean a(Drawable paramDrawable)
  {
    if (this.m != paramDrawable)
    {
      this.m = paramDrawable;
      return true;
    }
    return false;
  }

  public void b(boolean paramBoolean)
  {
    this.o = paramBoolean;
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.Components.as
 * JD-Core Version:    0.6.0
 */