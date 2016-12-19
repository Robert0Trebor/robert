package org.vidogram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.graphics.SweepGradient;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewParent;
import org.vidogram.messenger.a;

public class n extends View
{
  private static final int[] a = { -65536, -65281, -16776961, -16711681, -16711936, -1, -256, -65536 };
  private float[] A = new float[3];
  private a B;
  private b C;
  private int D;
  private int E;
  private Paint b;
  private Paint c;
  private Paint d;
  private int e;
  private int f;
  private int g;
  private int h;
  private int i;
  private int j;
  private int k;
  private int l;
  private int m;
  private RectF n = new RectF();
  private RectF o = new RectF();
  private boolean p = false;
  private int q;
  private boolean r;
  private int s;
  private float t;
  private float u;
  private float v;
  private float w;
  private Paint x;
  private Paint y;
  private Paint z;

  public n(Context paramContext)
  {
    super(paramContext);
    a(null, 0);
  }

  private float a(int paramInt)
  {
    float[] arrayOfFloat = new float[3];
    Color.colorToHSV(paramInt, arrayOfFloat);
    return (float)Math.toRadians(-arrayOfFloat[0]);
  }

  private int a(float paramFloat)
  {
    float f1 = (float)(paramFloat / 6.283185307179586D);
    paramFloat = f1;
    if (f1 < 0.0F)
      paramFloat = f1 + 1.0F;
    if (paramFloat <= 0.0F)
      return a[0];
    if (paramFloat >= 1.0F)
      return a[(a.length - 1)];
    paramFloat *= (a.length - 1);
    int i2 = (int)paramFloat;
    paramFloat -= i2;
    int i1 = a[i2];
    i2 = a[(i2 + 1)];
    return Color.argb(a(Color.alpha(i1), Color.alpha(i2), paramFloat), a(Color.red(i1), Color.red(i2), paramFloat), a(Color.green(i1), Color.green(i2), paramFloat), a(Color.blue(i1), Color.blue(i2), paramFloat));
  }

  private int a(int paramInt1, int paramInt2, float paramFloat)
  {
    return Math.round((paramInt2 - paramInt1) * paramFloat) + paramInt1;
  }

  private void a(AttributeSet paramAttributeSet, int paramInt)
  {
    this.e = a.a(8.0F);
    this.f = a.a(124.0F);
    this.g = this.f;
    this.h = a.a(54.0F);
    this.i = this.h;
    this.j = a.a(60.0F);
    this.k = this.j;
    this.l = a.a(14.0F);
    this.m = a.a(18.0F);
    this.w = -1.570796F;
    paramAttributeSet = new SweepGradient(0.0F, 0.0F, a, null);
    this.b = new Paint(1);
    this.b.setShader(paramAttributeSet);
    this.b.setStyle(Paint.Style.STROKE);
    this.b.setStrokeWidth(this.e);
    this.c = new Paint(1);
    this.c.setColor(-16777216);
    this.c.setAlpha(80);
    this.d = new Paint(1);
    this.d.setColor(a(this.w));
    this.y = new Paint(1);
    this.y.setColor(a(this.w));
    this.y.setStyle(Paint.Style.FILL);
    this.x = new Paint(1);
    this.x.setColor(a(this.w));
    this.x.setStyle(Paint.Style.FILL);
    this.z = new Paint(1);
    this.z.setColor(-16777216);
    this.z.setAlpha(0);
    this.s = a(this.w);
    this.q = a(this.w);
    this.r = true;
  }

  private float[] b(float paramFloat)
  {
    return new float[] { (float)(this.f * Math.cos(paramFloat)), (float)(this.f * Math.sin(paramFloat)) };
  }

  public int getColor()
  {
    return this.s;
  }

  public int getOldCenterColor()
  {
    return this.q;
  }

  public boolean getShowOldCenterColor()
  {
    return this.r;
  }

  protected void onDraw(Canvas paramCanvas)
  {
    paramCanvas.translate(this.t, this.t);
    paramCanvas.drawOval(this.n, this.b);
    float[] arrayOfFloat = b(this.w);
    paramCanvas.drawCircle(arrayOfFloat[0], arrayOfFloat[1], this.m, this.c);
    paramCanvas.drawCircle(arrayOfFloat[0], arrayOfFloat[1], this.l, this.d);
    paramCanvas.drawCircle(0.0F, 0.0F, this.j, this.z);
    if (this.r)
    {
      paramCanvas.drawArc(this.o, 90.0F, 180.0F, true, this.x);
      paramCanvas.drawArc(this.o, 270.0F, 180.0F, true, this.y);
      return;
    }
    paramCanvas.drawArc(this.o, 0.0F, 360.0F, true, this.y);
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i1 = (this.g + this.m) * 2;
    int i3 = View.MeasureSpec.getMode(paramInt1);
    paramInt1 = View.MeasureSpec.getSize(paramInt1);
    int i2 = View.MeasureSpec.getMode(paramInt2);
    paramInt2 = View.MeasureSpec.getSize(paramInt2);
    if (i3 == 1073741824)
      if (i2 != 1073741824)
        break label212;
    while (true)
    {
      paramInt1 = Math.min(paramInt1, paramInt2);
      setMeasuredDimension(paramInt1, paramInt1);
      this.t = (paramInt1 * 0.5F);
      this.f = (paramInt1 / 2 - this.e - this.m);
      this.n.set(-this.f, -this.f, this.f, this.f);
      this.h = (int)(this.i * (this.f / this.g));
      this.j = (int)(this.k * (this.f / this.g));
      this.o.set(-this.h, -this.h, this.h, this.h);
      return;
      if (i3 == -2147483648)
      {
        paramInt1 = Math.min(i1, paramInt1);
        break;
      }
      paramInt1 = i1;
      break;
      label212: if (i2 == -2147483648)
      {
        paramInt2 = Math.min(i1, paramInt2);
        continue;
      }
      paramInt2 = i1;
    }
  }

  protected void onRestoreInstanceState(Parcelable paramParcelable)
  {
    paramParcelable = (Bundle)paramParcelable;
    super.onRestoreInstanceState(paramParcelable.getParcelable("parent"));
    this.w = paramParcelable.getFloat("angle");
    setOldCenterColor(paramParcelable.getInt("color"));
    this.r = paramParcelable.getBoolean("showColor");
    int i1 = a(this.w);
    this.d.setColor(i1);
    setNewCenterColor(i1);
  }

  protected Parcelable onSaveInstanceState()
  {
    Parcelable localParcelable = super.onSaveInstanceState();
    Bundle localBundle = new Bundle();
    localBundle.putParcelable("parent", localParcelable);
    localBundle.putFloat("angle", this.w);
    localBundle.putInt("color", this.q);
    localBundle.putBoolean("showColor", this.r);
    return localBundle;
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    getParent().requestDisallowInterceptTouchEvent(true);
    float f1 = paramMotionEvent.getX() - this.t;
    float f2 = paramMotionEvent.getY() - this.t;
    switch (paramMotionEvent.getAction())
    {
    default:
    case 0:
    case 2:
    case 1:
    case 3:
    }
    while (true)
    {
      return true;
      paramMotionEvent = b(this.w);
      if ((f1 >= paramMotionEvent[0] - this.m) && (f1 <= paramMotionEvent[0] + this.m) && (f2 >= paramMotionEvent[1] - this.m) && (f2 <= paramMotionEvent[1] + this.m))
      {
        this.u = (f1 - paramMotionEvent[0]);
        this.v = (f2 - paramMotionEvent[1]);
        this.p = true;
        invalidate();
        continue;
      }
      if ((f1 >= -this.h) && (f1 <= this.h) && (f2 >= -this.h) && (f2 <= this.h) && (this.r))
      {
        this.z.setAlpha(80);
        setColor(getOldCenterColor());
        invalidate();
        continue;
      }
      getParent().requestDisallowInterceptTouchEvent(false);
      return false;
      if (this.p)
      {
        this.w = (float)Math.atan2(f2 - this.v, f1 - this.u);
        this.d.setColor(a(this.w));
        int i1 = a(this.w);
        this.s = i1;
        setNewCenterColor(i1);
        invalidate();
        continue;
      }
      getParent().requestDisallowInterceptTouchEvent(false);
      return false;
      this.p = false;
      this.z.setAlpha(0);
      if ((this.C != null) && (this.s != this.E))
      {
        this.C.a(this.s);
        this.E = this.s;
      }
      invalidate();
      continue;
      if ((this.C == null) || (this.s == this.E))
        continue;
      this.C.a(this.s);
      this.E = this.s;
    }
  }

  public void setColor(int paramInt)
  {
    this.w = a(paramInt);
    this.d.setColor(a(this.w));
    this.y.setColor(a(this.w));
    invalidate();
  }

  public void setNewCenterColor(int paramInt)
  {
    this.s = paramInt;
    this.y.setColor(paramInt);
    if (this.q == 0)
    {
      this.q = paramInt;
      this.x.setColor(paramInt);
    }
    if ((this.B != null) && (paramInt != this.D))
    {
      this.B.a(paramInt);
      this.D = paramInt;
    }
    invalidate();
  }

  public void setOldCenterColor(int paramInt)
  {
    this.q = paramInt;
    this.x.setColor(paramInt);
    invalidate();
  }

  public void setOnColorChangedListener(a parama)
  {
    this.B = parama;
  }

  public void setOnColorSelectedListener(b paramb)
  {
    this.C = paramb;
  }

  public void setShowOldCenterColor(boolean paramBoolean)
  {
    this.r = paramBoolean;
    invalidate();
  }

  public static abstract interface a
  {
    public abstract void a(int paramInt);
  }

  public static abstract interface b
  {
    public abstract void a(int paramInt);
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.Components.n
 * JD-Core Version:    0.6.0
 */