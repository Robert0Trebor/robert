package org.vidogram.ui.Components.a.a;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import org.vidogram.ui.Components.a.n;
import org.vidogram.ui.Components.v;

public class a extends FrameLayout
{
  private static final int[] f = { -1431751, -2409774, -13610525, -11942419, -8337308, -205211, -223667, -16777216, -1 };
  private static final float[] g = { 0.0F, 0.14F, 0.24F, 0.39F, 0.49F, 0.62F, 0.73F, 0.85F, 1.0F };
  private a a;
  private boolean b;
  private boolean c;
  private boolean d;
  private OvershootInterpolator e = new OvershootInterpolator(1.02F);
  private ImageView h;
  private Drawable i;
  private Paint j = new Paint(1);
  private Paint k = new Paint(1);
  private Paint l = new Paint(1);
  private Paint m = new Paint(1);
  private RectF n = new RectF();
  private float o = 1.0F;
  private float p = 0.27F;
  private float q;
  private boolean r;

  public a(Context paramContext)
  {
    super(paramContext);
    setWillNotDraw(false);
    this.i = getResources().getDrawable(2130837935);
    this.k.setColor(-1);
    this.m.setStyle(Paint.Style.STROKE);
    this.m.setStrokeWidth(org.vidogram.messenger.a.a(1.0F));
    this.h = new ImageView(paramContext);
    this.h.setScaleType(ImageView.ScaleType.CENTER);
    this.h.setImageResource(2130838037);
    addView(this.h, v.a(60, 52.0F));
    this.h.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramView)
      {
        if (a.a(a.this) != null)
          a.a(a.this).d();
      }
    });
    this.o = paramContext.getSharedPreferences("paint", 0).getFloat("last_color_location", 1.0F);
    setLocation(this.o);
  }

  private int a(int paramInt1, int paramInt2, float paramFloat)
  {
    paramFloat = Math.min(Math.max(paramFloat, 0.0F), 1.0F);
    int i3 = Color.red(paramInt1);
    int i4 = Color.red(paramInt2);
    int i1 = Color.green(paramInt1);
    int i2 = Color.green(paramInt2);
    paramInt1 = Color.blue(paramInt1);
    paramInt2 = Color.blue(paramInt2);
    float f1 = i3;
    i3 = Math.min(255, (int)((i4 - i3) * paramFloat + f1));
    i1 = Math.min(255, (int)(i1 + (i2 - i1) * paramFloat));
    f1 = paramInt1;
    return Color.argb(255, i3, i1, Math.min(255, (int)(paramFloat * (paramInt2 - paramInt1) + f1)));
  }

  private void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (this.r == paramBoolean1)
      return;
    this.r = paramBoolean1;
    float f1;
    if (this.r)
      f1 = 1.0F;
    while (paramBoolean2)
    {
      ObjectAnimator localObjectAnimator = ObjectAnimator.ofFloat(this, "draggingFactor", new float[] { this.q, f1 });
      localObjectAnimator.setInterpolator(this.e);
      int i1 = 300;
      if (this.d)
        i1 = (int)(300 + this.p * 75.0F);
      localObjectAnimator.setDuration(i1);
      localObjectAnimator.start();
      return;
      f1 = 0.0F;
    }
    setDraggingFactor(f1);
  }

  private void setDraggingFactor(float paramFloat)
  {
    this.q = paramFloat;
    invalidate();
  }

  public int a(float paramFloat)
  {
    int i2 = -1;
    if (paramFloat <= 0.0F)
      return f[0];
    if (paramFloat >= 1.0F)
      return f[(f.length - 1)];
    int i1 = 1;
    if (i1 < g.length)
      if (g[i1] > paramFloat)
        i2 = i1 - 1;
    while (true)
    {
      float f1 = g[i2];
      i2 = f[i2];
      float f2 = g[i1];
      return a(i2, f[i1], (paramFloat - f1) / (f2 - f1));
      i1 += 1;
      break;
      i1 = -1;
    }
  }

  public float getDraggingFactor()
  {
    return this.q;
  }

  public View getSettingsButton()
  {
    return this.h;
  }

  public n getSwatch()
  {
    return new n(a(this.o), this.o, this.p);
  }

  protected void onDraw(Canvas paramCanvas)
  {
    paramCanvas.drawRoundRect(this.n, org.vidogram.messenger.a.a(6.0F), org.vidogram.messenger.a.a(6.0F), this.j);
    float f2 = this.n.centerX();
    float f3 = this.q;
    float f4 = -org.vidogram.messenger.a.a(70.0F);
    float f1;
    if (this.c)
      f1 = this.p * org.vidogram.messenger.a.a(190.0F);
    while (true)
    {
      int i1 = (int)(f3 * f4 + f2 - f1);
      int i2 = (int)(this.n.top - org.vidogram.messenger.a.a(22.0F) + this.n.height() * this.o) + org.vidogram.messenger.a.a(22.0F);
      int i3 = (int)(org.vidogram.messenger.a.a(24.0F) * ((this.q + 1.0F) * 0.5F));
      this.i.setBounds(i1 - i3, i2 - i3, i1 + i3, i3 + i2);
      this.i.draw(paramCanvas);
      f1 = (int)Math.floor(org.vidogram.messenger.a.a(4.0F) + (org.vidogram.messenger.a.a(19.0F) - org.vidogram.messenger.a.a(4.0F)) * this.p) * (this.q + 1.0F) / 2.0F;
      paramCanvas.drawCircle(i1, i2, org.vidogram.messenger.a.a(22.0F) / 2 * (this.q + 1.0F), this.k);
      paramCanvas.drawCircle(i1, i2, f1, this.l);
      paramCanvas.drawCircle(i1, i2, f1 - org.vidogram.messenger.a.a(0.5F), this.m);
      return;
      f1 = 0.0F;
    }
  }

  @SuppressLint({"DrawAllocation"})
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramInt1 = paramInt3 - paramInt1;
    paramInt2 = paramInt4 - paramInt2;
    paramInt3 = getMeasuredHeight() - org.vidogram.messenger.a.a(26.0F) - org.vidogram.messenger.a.a(64.0F);
    this.j.setShader(new LinearGradient(0.0F, org.vidogram.messenger.a.a(26.0F), 0.0F, org.vidogram.messenger.a.a(26.0F) + paramInt3, f, g, Shader.TileMode.REPEAT));
    paramInt4 = paramInt1 - org.vidogram.messenger.a.a(26.0F) - org.vidogram.messenger.a.a(8.0F);
    int i1 = org.vidogram.messenger.a.a(26.0F);
    this.n.set(paramInt4, i1, paramInt4 + org.vidogram.messenger.a.a(8.0F), i1 + paramInt3);
    this.h.layout(paramInt1 - this.h.getMeasuredWidth(), paramInt2 - org.vidogram.messenger.a.a(52.0F), paramInt1, paramInt2);
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (paramMotionEvent.getPointerCount() > 1);
    float f1;
    float f2;
    float f3;
    int i1;
    do
    {
      do
      {
        return false;
        f1 = paramMotionEvent.getX() - this.n.left;
        f2 = paramMotionEvent.getY();
        f3 = this.n.top;
      }
      while ((!this.b) && (f1 < -org.vidogram.messenger.a.a(10.0F)));
      i1 = paramMotionEvent.getActionMasked();
      if ((i1 != 3) && (i1 != 1) && (i1 != 6))
        continue;
      if ((this.b) && (this.a != null))
      {
        this.a.c();
        getContext().getSharedPreferences("paint", 0).edit().putFloat("last_color_location", this.o).commit();
      }
      this.b = false;
      this.d = this.c;
      this.c = false;
      a(false, true);
      return false;
    }
    while ((i1 != 0) && (i1 != 2));
    if (!this.b)
    {
      this.b = true;
      if (this.a != null)
        this.a.a();
    }
    setLocation(Math.max(0.0F, Math.min(1.0F, (f2 - f3) / this.n.height())));
    a(true, true);
    if (f1 < -org.vidogram.messenger.a.a(10.0F))
    {
      this.c = true;
      setWeight(Math.max(0.0F, Math.min(1.0F, (-f1 - org.vidogram.messenger.a.a(10.0F)) / org.vidogram.messenger.a.a(190.0F))));
    }
    if (this.a != null)
      this.a.b();
    return true;
  }

  public void setDelegate(a parama)
  {
    this.a = parama;
  }

  public void setLocation(float paramFloat)
  {
    this.o = paramFloat;
    int i1 = a(paramFloat);
    this.l.setColor(i1);
    float[] arrayOfFloat = new float[3];
    Color.colorToHSV(i1, arrayOfFloat);
    if ((arrayOfFloat[0] < 0.001D) && (arrayOfFloat[1] < 0.001D) && (arrayOfFloat[2] > 0.92F))
    {
      i1 = (int)((1.0F - (arrayOfFloat[2] - 0.92F) / 0.08F * 0.22F) * 255.0F);
      this.m.setColor(Color.rgb(i1, i1, i1));
    }
    while (true)
    {
      invalidate();
      return;
      this.m.setColor(i1);
    }
  }

  public void setSettingsButtonImage(int paramInt)
  {
    this.h.setImageResource(paramInt);
  }

  public void setSwatch(n paramn)
  {
    setLocation(paramn.b);
    setWeight(paramn.c);
  }

  public void setWeight(float paramFloat)
  {
    this.p = paramFloat;
    invalidate();
  }

  public static abstract interface a
  {
    public abstract void a();

    public abstract void b();

    public abstract void c();

    public abstract void d();
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.Components.a.a.a
 * JD-Core Version:    0.6.0
 */