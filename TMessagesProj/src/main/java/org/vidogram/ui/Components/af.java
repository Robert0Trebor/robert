package org.vidogram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.vidogram.messenger.a;
import org.vidogram.messenger.n;

public class af extends FrameLayout
{
  private boolean a = true;
  private Paint b = new Paint();
  private Paint c;
  private Paint d;
  private Paint e;
  private float f = 600.0F;
  private float g = 600.0F;
  private int h = 0;
  private int i;
  private float j = 0.0F;
  private float k = 0.0F;
  private int l = 1;
  private int m = 1;
  private int n;
  private int o;
  private float p = -1.0F;
  private float q = -1.0F;
  private float r = 1.0F;
  private float s = 0.0F;
  private float t = 0.0F;
  private a u;
  private Bitmap v;
  private RectF w;
  private RectF x;
  private Runnable y;

  public af(Context paramContext)
  {
    super(paramContext);
    this.b.setColor(-1291845633);
    this.b.setStrokeWidth(a.a(2.0F));
    this.b.setStyle(Paint.Style.STROKE);
    this.c = new Paint();
    this.c.setColor(-1);
    this.d = new Paint();
    this.d.setColor(2130706432);
    this.e = new Paint();
    this.e.setColor(436207616);
    setWillNotDraw(false);
  }

  private Bitmap a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    Bitmap localBitmap = this.u.a();
    if (localBitmap != null)
      this.v = localBitmap;
    localBitmap = Bitmap.createBitmap(paramInt3, paramInt4, Bitmap.Config.ARGB_8888);
    Canvas localCanvas = new Canvas(localBitmap);
    Paint localPaint = new Paint(6);
    Matrix localMatrix = new Matrix();
    localMatrix.setTranslate(-this.v.getWidth() / 2, -this.v.getHeight() / 2);
    localMatrix.postRotate(this.i);
    if ((this.i % 360 == 90) || (this.i % 360 == 270))
      localMatrix.postTranslate(this.v.getHeight() / 2 - paramInt1, this.v.getWidth() / 2 - paramInt2);
    while (true)
    {
      localCanvas.drawBitmap(this.v, localMatrix, localPaint);
      try
      {
        localCanvas.setBitmap(null);
        return localBitmap;
        localMatrix.postTranslate(this.v.getWidth() / 2 - paramInt1, this.v.getHeight() / 2 - paramInt2);
      }
      catch (Exception localException)
      {
      }
    }
    return localBitmap;
  }

  public void a()
  {
    if (this.y != null)
      return;
    this.y = new Runnable()
    {
      public void run()
      {
        if (af.a(af.this) == this)
        {
          af.a(af.this, null);
          af.this.a(true);
        }
      }
    };
    a.a(this.y, 1500L);
  }

  public void a(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    this.r = paramFloat1;
    this.s = paramFloat2;
    this.t = paramFloat3;
  }

  public void a(Bitmap paramBitmap, int paramInt, boolean paramBoolean)
  {
    this.v = paramBitmap;
    this.f = 600.0F;
    this.g = 600.0F;
    this.h = 0;
    this.j = 0.0F;
    this.k = 0.0F;
    this.l = 1;
    this.m = 1;
    this.p = -1.0F;
    this.q = -1.0F;
    this.a = paramBoolean;
    this.i = paramInt;
    requestLayout();
  }

  public void a(boolean paramBoolean)
  {
    float f2 = this.l / this.f;
    float f1 = this.m / this.g;
    label56: float f4;
    float f5;
    if (f2 > f1)
    {
      f2 = f1;
      if ((f2 <= 1.0F) || (this.r * f2 <= 3.0F))
        break label259;
      f1 = 3.0F / this.r;
      f4 = this.f * f1;
      f5 = this.g * f1;
      if (Build.VERSION.SDK_INT < 21)
        break label290;
    }
    label259: label290: for (int i1 = a.a; ; i1 = 0)
    {
      float f7 = i1;
      f2 = (getWidth() - f4) / 2.0F;
      float f3 = (getHeight() - f5 + f7) / 2.0F;
      this.w = new RectF(this.p, this.q, this.f, this.g);
      this.x = new RectF(f2, f3, f4, f5);
      f4 = getWidth() / 2;
      f5 = this.s;
      float f6 = this.p;
      f7 = (f7 + getHeight()) / 2.0F;
      float f8 = this.t;
      float f9 = this.q;
      this.u.a(f4 * (f1 - 1.0F) + f2 + (f5 - f6) * f1, f7 * (f1 - 1.0F) + f3 + (f8 - f9) * f1, f1 * this.r, paramBoolean);
      return;
      break;
      f1 = f2;
      if (f2 >= 1.0F)
        break label56;
      f1 = f2;
      if (this.r * f2 >= 1.0F)
        break label56;
      f1 = 1.0F / this.r;
      break label56;
    }
  }

  public boolean a(MotionEvent paramMotionEvent)
  {
    if (paramMotionEvent == null)
    {
      this.h = 0;
      return false;
    }
    float f5 = paramMotionEvent.getX();
    float f6 = paramMotionEvent.getY();
    int i1 = a.a(20.0F);
    if (paramMotionEvent.getAction() == 0)
      if ((this.p - i1 < f5) && (this.p + i1 > f5) && (this.q - i1 < f6) && (this.q + i1 > f6))
      {
        this.h = 1;
        if (this.h != 0)
        {
          b();
          requestDisallowInterceptTouchEvent(true);
        }
        this.j = f5;
        this.k = f6;
      }
    label709: 
    do
    {
      do
      {
        if (this.h == 0)
          break label2633;
        return true;
        if ((this.p - i1 + this.f < f5) && (this.p + i1 + this.f > f5) && (this.q - i1 < f6) && (this.q + i1 > f6))
        {
          this.h = 2;
          break;
        }
        if ((this.p - i1 < f5) && (this.p + i1 > f5) && (this.q - i1 + this.g < f6) && (this.q + i1 + this.g > f6))
        {
          this.h = 3;
          break;
        }
        if ((this.p - i1 + this.f < f5) && (this.p + i1 + this.f > f5) && (this.q - i1 + this.g < f6) && (this.q + i1 + this.g > f6))
        {
          this.h = 4;
          break;
        }
        if (this.a)
        {
          if ((this.p + i1 < f5) && (this.p - i1 + this.f > f5) && (this.q - i1 < f6) && (this.q + i1 > f6))
          {
            this.h = 5;
            break;
          }
          if ((this.q + i1 < f6) && (this.q - i1 + this.g > f6) && (this.p - i1 + this.f < f5) && (this.p + i1 + this.f > f5))
          {
            this.h = 6;
            break;
          }
          if ((this.q + i1 < f6) && (this.q - i1 + this.g > f6) && (this.p - i1 < f5) && (this.p + i1 > f5))
          {
            this.h = 7;
            break;
          }
          if ((this.p + i1 >= f5) || (this.p - i1 + this.f <= f5) || (this.q - i1 + this.g >= f6))
            break;
          f1 = this.q;
          if (i1 + f1 + this.g <= f6)
            break;
          this.h = 8;
          break;
        }
        this.h = 0;
        break;
        if (paramMotionEvent.getAction() != 1)
          break label709;
      }
      while (this.h == 0);
      this.h = 0;
      a();
      return true;
    }
    while ((paramMotionEvent.getAction() != 2) || (this.h == 0));
    float f1 = f5 - this.j;
    float f2 = f6 - this.k;
    float f3 = this.l;
    f3 = this.r * f3;
    float f4 = this.m;
    float f7 = this.r * f4;
    label785: float f9;
    float f10;
    float f8;
    if (Build.VERSION.SDK_INT >= 21)
    {
      i1 = a.a;
      f4 = i1;
      f9 = (getWidth() - f3) / 2.0F + this.s;
      f4 = (f4 + (getHeight() - f7)) / 2.0F;
      f4 = this.t + f4;
      f10 = f9 + f3;
      f8 = f4 + f7;
      f7 = a.a(0.9F, true);
      if ((this.h != 1) && (this.h != 5))
        break label1296;
      if (this.h == 5)
        break label2641;
      if (this.f - f1 >= f7)
        break label2638;
      f1 = this.f - f7;
      label897: f3 = f1;
      if (this.p + f1 < this.n)
        f3 = this.n - this.p;
      f1 = f3;
      if (this.p + f3 < f9)
      {
        this.s -= f9 - this.p - f3;
        this.u.a(this.s, this.t, this.r, false);
        f1 = f3;
      }
    }
    label1296: label2633: label2638: label2641: 
    while (true)
    {
      if (!this.a)
      {
        f2 = f1;
        if (this.q + f1 < this.o)
          f2 = this.o - this.q;
        if (this.q + f2 < f4)
        {
          this.t -= f4 - this.q - f2;
          this.u.a(this.s, this.t, this.r, false);
        }
        this.p += f2;
        this.q += f2;
        this.f -= f2;
        this.g -= f2;
        this.j = f5;
        this.k = f6;
        invalidate();
        break;
        i1 = 0;
        break label785;
      }
      if (this.g - f2 < f7)
        f2 = this.g - f7;
      while (true)
      {
        f3 = f2;
        if (this.q + f2 < this.o)
          f3 = this.o - this.q;
        if (this.q + f3 < f4)
        {
          this.t -= f4 - this.q - f3;
          this.u.a(this.s, this.t, this.r, false);
        }
        if (this.h != 5)
        {
          this.p += f1;
          this.f -= f1;
        }
        this.q += f3;
        this.g -= f3;
        break;
        if ((this.h == 2) || (this.h == 6))
        {
          f3 = f1;
          if (this.f + f1 < f7)
            f3 = -(this.f - f7);
          f1 = f3;
          if (this.p + this.f + f3 > this.n + this.l)
            f1 = this.n + this.l - this.p - this.f;
          if (this.p + this.f + f1 > f10)
          {
            this.s -= f10 - this.p - this.f - f1;
            this.u.a(this.s, this.t, this.r, false);
          }
          if (!this.a)
          {
            f2 = f1;
            if (this.q - f1 < this.o)
              f2 = this.q - this.o;
            if (this.q - f2 < f4)
            {
              this.t -= f4 - this.q + f2;
              this.u.a(this.s, this.t, this.r, false);
            }
            this.q -= f2;
            this.f += f2;
            this.g += f2;
            break;
          }
          if (this.h != 6)
          {
            f3 = f2;
            if (this.g - f2 < f7)
              f3 = this.g - f7;
            f2 = f3;
            if (this.q + f3 < this.o)
              f2 = this.o - this.q;
            if (this.q + f2 < f4)
            {
              this.t -= f4 - this.q - f2;
              this.u.a(this.s, this.t, this.r, false);
            }
            this.q += f2;
            this.g -= f2;
          }
          this.f += f1;
          break;
        }
        if ((this.h == 3) || (this.h == 7))
        {
          f3 = f1;
          if (this.f - f1 < f7)
            f3 = this.f - f7;
          f1 = f3;
          if (this.p + f3 < this.n)
            f1 = this.n - this.p;
          if (this.p + f1 < f9)
          {
            this.s -= f9 - this.p - f1;
            this.u.a(this.s, this.t, this.r, false);
          }
          if (!this.a)
          {
            f2 = f1;
            if (this.q + this.f - f1 > this.o + this.m)
              f2 = this.q + this.f - this.o - this.m;
            if (this.q + this.f - f2 > f8)
            {
              this.t -= f8 - this.q - this.f + f2;
              this.u.a(this.s, this.t, this.r, false);
            }
            this.p += f2;
            this.f -= f2;
            this.g -= f2;
            break;
          }
          if (this.h != 7)
          {
            f3 = f2;
            if (this.q + this.g + f2 > this.o + this.m)
              f3 = this.o + this.m - this.q - this.g;
            if (this.q + this.g + f3 > f8)
            {
              this.t -= f8 - this.q - this.g - f3;
              this.u.a(this.s, this.t, this.r, false);
            }
            this.g += f3;
            if (this.g < f7)
              this.g = f7;
          }
          this.p += f1;
          this.f -= f1;
          break;
        }
        if ((this.h != 4) && (this.h != 8))
          break;
        f3 = f1;
        if (this.h != 8)
        {
          f4 = f1;
          if (this.p + this.f + f1 > this.n + this.l)
            f4 = this.n + this.l - this.p - this.f;
          f3 = f4;
          if (this.p + this.f + f4 > f10)
          {
            this.s -= f10 - this.p - this.f - f4;
            this.u.a(this.s, this.t, this.r, false);
            f3 = f4;
          }
        }
        if (!this.a)
        {
          f1 = f3;
          if (this.q + this.f + f3 > this.o + this.m)
            f1 = this.o + this.m - this.q - this.f;
          if (this.q + this.f + f1 > f8)
          {
            this.t -= f8 - this.q - this.f - f1;
            this.u.a(this.s, this.t, this.r, false);
          }
          this.f += f1;
          this.g += f1;
        }
        while (true)
        {
          if (this.f < f7)
            this.f = f7;
          if (this.g >= f7)
            break;
          this.g = f7;
          break;
          f1 = f2;
          if (this.q + this.g + f2 > this.o + this.m)
            f1 = this.o + this.m - this.q - this.g;
          if (this.q + this.g + f1 > f8)
          {
            this.t -= f8 - this.q - this.g - f1;
            this.u.a(this.s, this.t, this.r, false);
          }
          if (this.h != 8)
            this.f += f3;
          this.g += f1;
        }
        return false;
      }
      break label897;
    }
  }

  public void b()
  {
    if (this.y != null)
    {
      a.b(this.y);
      this.y = null;
      this.w = null;
      this.x = null;
    }
  }

  public Bitmap getBitmap()
  {
    Bitmap localBitmap1 = this.u.a();
    if (localBitmap1 != null)
      this.v = localBitmap1;
    float f1 = this.l;
    f1 = this.r * f1;
    float f2 = this.m;
    f2 = this.r * f2;
    int i1;
    int i4;
    int i3;
    int i5;
    int i6;
    int i2;
    if (Build.VERSION.SDK_INT >= 21)
    {
      i1 = a.a;
      float f5 = i1;
      float f3 = (getWidth() - f1) / 2.0F;
      float f4 = this.s;
      f5 = (f5 + (getHeight() - f2)) / 2.0F;
      float f6 = this.t;
      f3 = (this.p - (f3 + f4)) / f1;
      f4 = (this.q - (f5 + f6)) / f2;
      f1 = this.f / f1;
      f2 = this.g / f2;
      if ((this.i % 360 != 90) && (this.i % 360 != 270))
        break label305;
      i4 = this.v.getHeight();
      i1 = this.v.getWidth();
      i3 = (int)(i4 * f3);
      int i7 = (int)(i1 * f4);
      i5 = (int)(i4 * f1);
      i6 = (int)(i1 * f2);
      i2 = i3;
      if (i3 < 0)
        i2 = 0;
      i3 = i7;
      if (i7 < 0)
        i3 = 0;
      if (i2 + i5 <= i4)
        break label368;
      i4 -= i2;
    }
    while (true)
    {
      while (true)
      {
        i5 = i6;
        if (i3 + i6 > i1)
          i5 = i1 - i3;
        try
        {
          localBitmap1 = a(i2, i3, i4, i5);
          return localBitmap1;
          i1 = 0;
          break;
          label305: i4 = this.v.getWidth();
          i1 = this.v.getHeight();
        }
        catch (Throwable localThrowable2)
        {
          n.a("tmessags", localThrowable1);
          System.gc();
          try
          {
            Bitmap localBitmap2 = a(i2, i3, i4, i5);
            return localBitmap2;
          }
          catch (Throwable localThrowable2)
          {
            n.a("tmessages", localThrowable2);
            return null;
          }
        }
      }
      label368: i4 = i5;
    }
  }

  public float getBitmapX()
  {
    return this.n - a.a(14.0F);
  }

  public float getBitmapY()
  {
    if (Build.VERSION.SDK_INT >= 21);
    for (int i1 = a.a; ; i1 = 0)
    {
      float f1 = i1;
      return this.o - a.a(14.0F) - f1;
    }
  }

  public float getLimitHeight()
  {
    if (Build.VERSION.SDK_INT >= 21);
    for (int i1 = a.a; ; i1 = 0)
    {
      float f1 = i1;
      return getHeight() - a.a(14.0F) - f1 - this.q - (int)Math.max(0.0D, Math.ceil((getHeight() - a.a(28.0F) - this.m * this.r - f1) / 2.0F)) - this.g;
    }
  }

  public float getLimitWidth()
  {
    return getWidth() - a.a(14.0F) - this.p - (int)Math.max(0.0D, Math.ceil((getWidth() - a.a(28.0F) - this.l * this.r) / 2.0F)) - this.f;
  }

  public float getLimitX()
  {
    return this.p - Math.max(0.0F, (float)Math.ceil((getWidth() - this.l * this.r) / 2.0F));
  }

  public float getLimitY()
  {
    if (Build.VERSION.SDK_INT >= 21);
    for (int i1 = a.a; ; i1 = 0)
    {
      float f1 = i1;
      return this.q - Math.max(0.0F, (float)Math.ceil((f1 + (getHeight() - this.m * this.r)) / 2.0F));
    }
  }

  public float getRectSizeX()
  {
    return this.f;
  }

  public float getRectSizeY()
  {
    return this.g;
  }

  public float getRectX()
  {
    return this.p - a.a(14.0F);
  }

  public float getRectY()
  {
    if (Build.VERSION.SDK_INT >= 21);
    for (int i1 = a.a; ; i1 = 0)
    {
      float f1 = i1;
      return this.q - a.a(14.0F) - f1;
    }
  }

  protected void onDraw(Canvas paramCanvas)
  {
    paramCanvas.drawRect(0.0F, 0.0F, getWidth(), this.q, this.d);
    float f1 = this.q;
    float f2 = this.p;
    float f3 = this.q;
    paramCanvas.drawRect(0.0F, f1, f2, this.g + f3, this.d);
    paramCanvas.drawRect(this.p + this.f, this.q, getWidth(), this.q + this.g, this.d);
    f1 = this.q;
    paramCanvas.drawRect(0.0F, this.g + f1, getWidth(), getHeight(), this.d);
    int i2 = a.a(1.0F);
    f1 = this.p;
    f2 = i2 * 2;
    f3 = this.q;
    float f4 = i2 * 2;
    float f5 = this.p;
    float f6 = i2 * 2;
    paramCanvas.drawRect(f1 - f2, f3 - f4, a.a(20.0F) + (f5 - f6), this.q, this.c);
    f1 = this.p;
    f2 = i2 * 2;
    f3 = this.q;
    f4 = i2 * 2;
    f5 = this.p;
    f6 = this.q;
    float f7 = i2 * 2;
    paramCanvas.drawRect(f1 - f2, f3 - f4, f5, a.a(20.0F) + (f6 - f7), this.c);
    f1 = this.p;
    f2 = this.f;
    f3 = i2 * 2;
    f4 = a.a(20.0F);
    f5 = this.q;
    f6 = i2 * 2;
    f7 = this.p;
    float f8 = this.f;
    paramCanvas.drawRect(f1 + f2 + f3 - f4, f5 - f6, i2 * 2 + (f7 + f8), this.q, this.c);
    f1 = this.p;
    f2 = this.f;
    f3 = this.q;
    f4 = i2 * 2;
    f5 = this.p;
    f6 = this.f;
    f7 = i2 * 2;
    f8 = this.q;
    float f9 = i2 * 2;
    paramCanvas.drawRect(f2 + f1, f3 - f4, f7 + (f5 + f6), a.a(20.0F) + (f8 - f9), this.c);
    f1 = this.p;
    f2 = i2 * 2;
    f3 = this.q;
    f4 = this.g;
    f5 = i2 * 2;
    f6 = a.a(20.0F);
    f7 = this.p;
    f8 = this.q;
    f9 = this.g;
    paramCanvas.drawRect(f1 - f2, f3 + f4 + f5 - f6, f7, i2 * 2 + (f8 + f9), this.c);
    f1 = this.p;
    f2 = i2 * 2;
    f3 = this.q;
    f4 = this.g;
    f5 = this.p;
    f6 = i2 * 2;
    f7 = a.a(20.0F);
    f8 = this.q;
    f9 = this.g;
    paramCanvas.drawRect(f1 - f2, f4 + f3, f7 + (f5 - f6), i2 * 2 + (f8 + f9), this.c);
    f1 = this.p;
    f2 = this.f;
    f3 = i2 * 2;
    f4 = a.a(20.0F);
    f5 = this.q;
    f6 = this.g;
    f7 = this.p;
    f8 = this.f;
    f9 = i2 * 2;
    float f10 = this.q;
    float f11 = this.g;
    paramCanvas.drawRect(f1 + f2 + f3 - f4, f6 + f5, f9 + (f7 + f8), i2 * 2 + (f10 + f11), this.c);
    f1 = this.p;
    f2 = this.f;
    f3 = this.q;
    f4 = this.g;
    f5 = i2 * 2;
    f6 = a.a(20.0F);
    f7 = this.p;
    f8 = this.f;
    f9 = i2 * 2;
    f10 = this.q;
    f11 = this.g;
    paramCanvas.drawRect(f2 + f1, f3 + f4 + f5 - f6, f9 + (f7 + f8), i2 * 2 + (f10 + f11), this.c);
    int i1 = 1;
    while (i1 < 3)
    {
      f1 = this.p;
      f2 = this.f / 3.0F;
      f3 = i1;
      f4 = i2;
      f5 = this.q;
      f6 = this.p;
      f7 = i2 * 2;
      f8 = this.f / 3.0F;
      f9 = i1;
      f10 = this.q;
      paramCanvas.drawRect(f1 + f2 * f3 - f4, f5, f8 * f9 + (f6 + f7), this.g + f10, this.e);
      f1 = this.p;
      f2 = this.q;
      f3 = this.g / 3.0F;
      f4 = i1;
      f5 = i2;
      f6 = this.p;
      f7 = this.f;
      f8 = this.q;
      f9 = this.g / 3.0F;
      f10 = i1;
      paramCanvas.drawRect(f1, f2 + f3 * f4 - f5, f7 + f6, i2 * 2 + (f8 + f9 * f10), this.e);
      i1 += 1;
    }
    i1 = 1;
    while (i1 < 3)
    {
      f1 = this.p;
      f2 = this.f / 3.0F;
      f3 = i1;
      f4 = this.q;
      f5 = this.p;
      f6 = i2;
      f7 = this.f / 3.0F;
      f8 = i1;
      f9 = this.q;
      paramCanvas.drawRect(f2 * f3 + f1, f4, f7 * f8 + (f5 + f6), this.g + f9, this.c);
      f1 = this.p;
      f2 = this.q;
      f3 = this.g / 3.0F;
      f4 = i1;
      f5 = this.p;
      f6 = this.f;
      f7 = this.q;
      f8 = this.g / 3.0F;
      f9 = i1;
      paramCanvas.drawRect(f1, f3 * f4 + f2, f6 + f5, i2 + (f7 + f8 * f9), this.c);
      i1 += 1;
    }
    f1 = this.p;
    f2 = this.q;
    f3 = this.p;
    f4 = this.f;
    f5 = this.q;
    paramCanvas.drawRect(f1, f2, f4 + f3, this.g + f5, this.b);
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    Bitmap localBitmap = this.u.a();
    if (localBitmap != null)
      this.v = localBitmap;
    if (this.v == null)
      return;
    paramInt2 = getWidth() - a.a(28.0F);
    paramInt3 = getHeight();
    paramInt4 = a.a(28.0F);
    float f2;
    float f1;
    label135: float f3;
    float f4;
    label176: float f5;
    float f6;
    int i1;
    if (Build.VERSION.SDK_INT >= 21)
    {
      paramInt1 = a.a;
      paramInt3 = paramInt3 - paramInt4 - paramInt1;
      if ((this.i % 360 != 90) && (this.i % 360 != 270))
        break label390;
      f2 = this.v.getHeight();
      f1 = this.v.getWidth();
      f3 = paramInt2 / f2;
      f4 = paramInt3 / f1;
      if (f3 <= f4)
        break label413;
      f1 = paramInt3;
      f2 = (int)Math.ceil(f2 * f4);
      f3 = (this.p - this.n) / this.l;
      f4 = (this.q - this.o) / this.m;
      f5 = this.f / this.l;
      f6 = this.g / this.m;
      this.l = (int)f2;
      this.m = (int)f1;
      this.n = (int)Math.ceil((paramInt2 - this.l) / 2 + a.a(14.0F));
      paramInt4 = (paramInt3 - this.m) / 2;
      i1 = a.a(14.0F);
      if (Build.VERSION.SDK_INT < 21)
        break label433;
    }
    label390: label413: label433: for (paramInt1 = a.a; ; paramInt1 = 0)
    {
      this.o = (int)Math.ceil(paramInt1 + (i1 + paramInt4));
      if ((this.p != -1.0F) || (this.q != -1.0F))
        break label571;
      if (!this.a)
        break label438;
      this.q = this.o;
      this.p = this.n;
      this.f = this.l;
      this.g = this.m;
      return;
      paramInt1 = 0;
      break;
      f2 = this.v.getWidth();
      f1 = this.v.getHeight();
      break label135;
      f2 = paramInt2;
      f1 = (int)Math.ceil(f1 * f3);
      break label176;
    }
    label438: if (this.l > this.m)
    {
      this.q = this.o;
      this.p = ((paramInt2 - this.m) / 2 + a.a(14.0F));
      this.f = this.m;
      this.g = this.m;
      return;
    }
    this.p = this.n;
    paramInt2 = (paramInt3 - this.l) / 2;
    paramInt3 = a.a(14.0F);
    if (Build.VERSION.SDK_INT >= 21);
    for (paramInt1 = a.a; ; paramInt1 = 0)
    {
      this.q = (paramInt1 + (paramInt3 + paramInt2));
      this.f = this.l;
      this.g = this.l;
      return;
    }
    label571: this.p = (this.l * f3 + this.n);
    this.q = (this.m * f4 + this.o);
    this.f = (this.l * f5);
    this.g = (this.m * f6);
  }

  public void setAnimationProgress(float paramFloat)
  {
    if (this.w != null)
    {
      if (paramFloat != 1.0F)
        break label72;
      this.p = this.x.left;
      this.q = this.x.top;
      this.f = this.x.right;
      this.g = this.x.bottom;
      this.w = null;
      this.x = null;
    }
    while (true)
    {
      invalidate();
      return;
      label72: this.p = (this.w.left + (this.x.left - this.w.left) * paramFloat);
      this.q = (this.w.top + (this.x.top - this.w.top) * paramFloat);
      this.f = (this.w.right + (this.x.right - this.w.right) * paramFloat);
      this.g = (this.w.bottom + (this.x.bottom - this.w.bottom) * paramFloat);
    }
  }

  public void setDelegate(a parama)
  {
    this.u = parama;
  }

  public void setOrientation(int paramInt)
  {
    this.i = paramInt;
    this.p = -1.0F;
    this.q = -1.0F;
    this.f = 600.0F;
    this.g = 600.0F;
    this.u.a(0.0F, 0.0F, 1.0F, false);
    requestLayout();
  }

  public static abstract interface a
  {
    public abstract Bitmap a();

    public abstract void a(float paramFloat1, float paramFloat2, float paramFloat3, boolean paramBoolean);
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.Components.af
 * JD-Core Version:    0.6.0
 */