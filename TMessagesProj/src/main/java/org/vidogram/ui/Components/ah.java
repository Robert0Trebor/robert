package org.vidogram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.vidogram.messenger.a;

public class ah extends FrameLayout
{
  private static final float a = a.a(20.0F);
  private static final float b = a.a(30.0F);
  private static final float c = a.a(30.0F);
  private int A;
  private Paint B = new Paint(1);
  private Paint C = new Paint(1);
  private b D;
  private final int d = 1;
  private final int e = 2;
  private final int f = 3;
  private final int g = 4;
  private final int h = 5;
  private a i;
  private ap j = new ap();
  private float k;
  private float l;
  private bf m = new bf();
  private ap n = new ap(0.5F, 0.5F);
  private float o = 0.15F;
  private float p = 0.35F;
  private float q;
  private RectF r = new RectF();
  private float s;
  private float t;
  private float u;
  private float v = 1.0F;
  private boolean w;
  private boolean x;
  private boolean y = true;
  private boolean z;

  public ah(Context paramContext)
  {
    super(paramContext);
    setWillNotDraw(false);
    this.B.setColor(-1);
    this.C.setColor(-1);
    this.C.setStrokeWidth(a.a(2.0F));
    this.C.setStyle(Paint.Style.STROKE);
  }

  private float a(float paramFloat)
  {
    return 3.141593F * paramFloat / 180.0F;
  }

  private float a(MotionEvent paramMotionEvent)
  {
    if (paramMotionEvent.getPointerCount() != 2)
      return 0.0F;
    float f1 = paramMotionEvent.getX(0);
    float f2 = paramMotionEvent.getY(0);
    float f3 = paramMotionEvent.getX(1);
    float f4 = paramMotionEvent.getY(1);
    return (float)Math.sqrt((f1 - f3) * (f1 - f3) + (f2 - f4) * (f2 - f4));
  }

  private void a(int paramInt, MotionEvent paramMotionEvent)
  {
    float f2 = paramMotionEvent.getX();
    float f3 = paramMotionEvent.getY();
    ap localap1 = getActualCenterPoint();
    ap localap2 = new ap(f2 - localap1.a, f3 - localap1.b);
    float f4 = (float)Math.sqrt(localap2.a * localap2.a + localap2.b * localap2.b);
    float f1;
    if (this.m.a > this.m.b)
      f1 = this.m.b;
    float f6;
    float f7;
    float f5;
    while (true)
    {
      f6 = f1 * this.o;
      f7 = f1 * this.p;
      f5 = (float)Math.abs(localap2.a * Math.cos(a(this.q) + 1.570796326794897D) + localap2.b * Math.sin(a(this.q) + 1.570796326794897D));
      switch (paramInt)
      {
      default:
        return;
        f1 = this.m.a;
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      }
    }
    this.s = paramMotionEvent.getX();
    this.t = paramMotionEvent.getY();
    if (Math.abs(f7 - f6) < a)
    {
      paramInt = 1;
      if (paramInt == 0)
        break label303;
      f1 = 0.0F;
      label255: if (paramInt == 0)
        break label310;
      f2 = 0.0F;
      label262: if (this.A != 0)
        break label441;
      if (f4 >= b)
        break label318;
      this.i = a.b;
      this.j = localap1;
    }
    while (true)
    {
      a(true, true);
      return;
      paramInt = 0;
      break;
      label303: f1 = c;
      break label255;
      label310: f2 = c;
      break label262;
      label318: if ((f5 > f6 - c) && (f5 < f1 + f6))
      {
        this.i = a.c;
        this.k = f5;
        this.l = f6;
        continue;
      }
      if ((f5 > f7 - f2) && (f5 < c + f7))
      {
        this.i = a.d;
        this.k = f5;
        this.l = f7;
        continue;
      }
      if ((f5 > f6 - c) && (f5 < c + f7))
        continue;
      this.i = a.f;
      continue;
      label441: if (this.A != 1)
        continue;
      if (f4 < b)
      {
        this.i = a.b;
        this.j = localap1;
        continue;
      }
      if ((f4 > f6 - c) && (f4 < f1 + f6))
      {
        this.i = a.c;
        this.k = f4;
        this.l = f6;
        continue;
      }
      if ((f4 <= f7 - f2) || (f4 >= c + f7))
        continue;
      this.i = a.d;
      this.k = f4;
      this.l = f7;
    }
    label963: int i1;
    if (this.A == 0)
    {
      switch (1.a[this.i.ordinal()])
      {
      default:
      case 1:
      case 2:
      case 3:
        while (true)
        {
          invalidate();
          if (this.D == null)
            break;
          this.D.a(this.n, this.o, this.p, a(this.q) + 1.570796F);
          return;
          f1 = this.s;
          f4 = this.t;
          paramMotionEvent = new av((getWidth() - this.m.a) / 2.0F, (getHeight() - this.m.b) / 2.0F, this.m.a, this.m.b);
          localap1 = new ap(Math.max(paramMotionEvent.a, Math.min(paramMotionEvent.a + paramMotionEvent.c, f2 - f1 + this.j.a)), Math.max(paramMotionEvent.b, Math.min(paramMotionEvent.b + paramMotionEvent.d, f3 - f4 + this.j.b)));
          this.n = new ap((localap1.a - paramMotionEvent.a) / this.m.a, (localap1.b - paramMotionEvent.b + (this.m.a - this.m.b) / 2.0F) / this.m.a);
          continue;
          this.o = Math.min(Math.max(0.1F, (f5 - this.k + this.l) / f1), this.p - 0.02F);
          continue;
          f2 = this.k;
          this.p = Math.max(this.o + 0.02F, (f5 - f2 + this.l) / f1);
        }
      case 4:
      }
      f1 = f2 - this.s;
      f4 = f3 - this.t;
      if (f2 > localap1.a)
      {
        paramInt = 1;
        if (f3 <= localap1.b)
          break label1077;
        i1 = 1;
        label977: if ((paramInt != 0) || (i1 != 0))
          break label1094;
        if (Math.abs(f4) <= Math.abs(f1))
          break label1083;
        if (f4 >= 0.0F)
          break label1566;
        paramInt = 1;
      }
    }
    while (true)
    {
      label1008: f1 = (float)Math.sqrt(f1 * f1 + f4 * f4);
      f4 = this.q;
      if (paramInt != 0);
      for (paramInt = 1; ; paramInt = 0)
      {
        this.q = ((paramInt * 2 - 1) * f1 / 3.141593F / 1.15F + f4);
        this.s = f2;
        this.t = f3;
        break;
        paramInt = 0;
        break label963;
        label1077: i1 = 0;
        break label977;
        label1083: if (f1 <= 0.0F)
          break label1566;
        paramInt = 1;
        break label1008;
        label1094: if ((paramInt != 0) && (i1 == 0))
        {
          if (Math.abs(f4) > Math.abs(f1))
          {
            if (f4 <= 0.0F)
              break label1566;
            paramInt = 1;
            break label1008;
          }
          if (f1 <= 0.0F)
            break label1566;
          paramInt = 1;
          break label1008;
        }
        if ((paramInt != 0) && (i1 != 0))
        {
          if (Math.abs(f4) > Math.abs(f1))
          {
            if (f4 <= 0.0F)
              break label1566;
            paramInt = 1;
            break label1008;
          }
          if (f1 >= 0.0F)
            break label1566;
          paramInt = 1;
          break label1008;
        }
        if (Math.abs(f4) > Math.abs(f1))
        {
          if (f4 >= 0.0F)
            break label1566;
          paramInt = 1;
          break label1008;
        }
        if (f1 >= 0.0F)
          break label1566;
        paramInt = 1;
        break label1008;
      }
      if (this.A != 1)
        break;
      switch (1.a[this.i.ordinal()])
      {
      default:
        break;
      case 1:
        f1 = this.s;
        f4 = this.t;
        paramMotionEvent = new av((getWidth() - this.m.a) / 2.0F, (getHeight() - this.m.b) / 2.0F, this.m.a, this.m.b);
        localap1 = new ap(Math.max(paramMotionEvent.a, Math.min(paramMotionEvent.a + paramMotionEvent.c, f2 - f1 + this.j.a)), Math.max(paramMotionEvent.b, Math.min(paramMotionEvent.b + paramMotionEvent.d, f3 - f4 + this.j.b)));
        this.n = new ap((localap1.a - paramMotionEvent.a) / this.m.a, (localap1.b - paramMotionEvent.b + (this.m.a - this.m.b) / 2.0F) / this.m.a);
        break;
      case 2:
        this.o = Math.min(Math.max(0.1F, (f4 - this.k + this.l) / f1), this.p - 0.02F);
        break;
      case 3:
        f2 = this.k;
        this.p = Math.max(this.o + 0.02F, (f4 - f2 + this.l) / f1);
        break;
        this.i = a.a;
        a(false, true);
        return;
        label1566: paramInt = 0;
      }
    }
  }

  private void a(boolean paramBoolean1, boolean paramBoolean2)
  {
  }

  private void b(int paramInt, MotionEvent paramMotionEvent)
  {
    switch (paramInt)
    {
    default:
    case 1:
    case 2:
      do
      {
        return;
        this.u = a(paramMotionEvent);
        this.v = 1.0F;
        this.i = a.e;
        a(true, true);
        float f1 = a(paramMotionEvent);
        this.v += (f1 - this.u) / a.b * 0.01F;
        this.o = Math.max(0.1F, this.o * this.v);
        this.p = Math.max(this.o + 0.02F, this.p * this.v);
        this.v = 1.0F;
        this.u = f1;
        invalidate();
      }
      while (this.D == null);
      this.D.a(this.n, this.o, this.p, a(this.q) + 1.570796F);
      return;
    case 3:
    case 4:
    case 5:
    }
    this.i = a.a;
    a(false, true);
  }

  private ap getActualCenterPoint()
  {
    return new ap((getWidth() - this.m.a) / 2.0F + this.n.a * this.m.a, (getHeight() - this.m.b) / 2.0F - (this.m.a - this.m.b) / 2.0F + this.n.b * this.m.a);
  }

  private float getActualInnerRadius()
  {
    float f1;
    if (this.m.a > this.m.b)
      f1 = this.m.b;
    while (true)
    {
      return f1 * this.o;
      f1 = this.m.a;
    }
  }

  private float getActualOuterRadius()
  {
    float f1;
    if (this.m.a > this.m.b)
      f1 = this.m.b;
    while (true)
    {
      return f1 * this.p;
      f1 = this.m.a;
    }
  }

  public void a(float paramFloat1, float paramFloat2)
  {
    this.m.a = paramFloat1;
    this.m.b = paramFloat2;
  }

  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    ap localap = getActualCenterPoint();
    float f4 = getActualInnerRadius();
    float f1 = getActualOuterRadius();
    paramCanvas.translate(localap.a, localap.b);
    int i1;
    if (this.A == 0)
    {
      paramCanvas.rotate(this.q);
      float f2 = a.a(6.0F);
      float f5 = a.a(12.0F);
      float f3 = a.a(1.5F);
      i1 = 0;
      while (i1 < 30)
      {
        paramCanvas.drawRect((f5 + f2) * i1, -f4, i1 * (f5 + f2) + f5, f3 - f4, this.B);
        paramCanvas.drawRect(-i1 * (f5 + f2) - f2 - f5, -f4, -i1 * (f5 + f2) - f2, f3 - f4, this.B);
        paramCanvas.drawRect((f5 + f2) * i1, f4, f5 + i1 * (f5 + f2), f3 + f4, this.B);
        paramCanvas.drawRect(-i1 * (f5 + f2) - f2 - f5, f4, -i1 * (f5 + f2) - f2, f3 + f4, this.B);
        i1 += 1;
      }
      f4 = a.a(6.0F);
      i1 = 0;
      while (i1 < 64)
      {
        paramCanvas.drawRect((f4 + f2) * i1, -f1, f4 + i1 * (f4 + f2), f3 - f1, this.B);
        paramCanvas.drawRect(-i1 * (f4 + f2) - f2 - f4, -f1, -i1 * (f4 + f2) - f2, f3 - f1, this.B);
        paramCanvas.drawRect((f4 + f2) * i1, f1, f4 + i1 * (f4 + f2), f3 + f1, this.B);
        paramCanvas.drawRect(-i1 * (f4 + f2) - f2 - f4, f1, -i1 * (f4 + f2) - f2, f3 + f1, this.B);
        i1 += 1;
      }
    }
    if (this.A == 1)
    {
      this.r.set(-f4, -f4, f4, f4);
      i1 = 0;
      while (i1 < 22)
      {
        paramCanvas.drawArc(this.r, (6.15F + 10.2F) * i1, 10.2F, false, this.C);
        i1 += 1;
      }
      this.r.set(-f1, -f1, f1, f1);
      i1 = 0;
      while (i1 < 64)
      {
        paramCanvas.drawArc(this.r, (2.02F + 3.6F) * i1, 3.6F, false, this.C);
        i1 += 1;
      }
    }
    paramCanvas.drawCircle(0.0F, 0.0F, a.a(8.0F), this.B);
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    switch (paramMotionEvent.getActionMasked())
    {
    case 4:
    default:
    case 0:
    case 5:
    case 1:
    case 3:
    case 6:
    case 2:
    }
    while (true)
    {
      return true;
      if (paramMotionEvent.getPointerCount() == 1)
      {
        if ((!this.y) || (this.w))
          continue;
        float f1 = paramMotionEvent.getX();
        float f2 = paramMotionEvent.getY();
        ap localap = getActualCenterPoint();
        localap = new ap(f1 - localap.a, f2 - localap.b);
        float f3 = (float)Math.sqrt(localap.a * localap.a + localap.b * localap.b);
        float f4 = getActualInnerRadius();
        float f5 = getActualOuterRadius();
        int i1;
        label175: label183: label191: float f6;
        if (Math.abs(f5 - f4) < a)
        {
          i1 = 1;
          if (i1 == 0)
            break label298;
          f1 = 0.0F;
          if (i1 == 0)
            break label306;
          f2 = 0.0F;
          if (this.A != 0)
            break label408;
          double d1 = localap.a;
          double d2 = Math.cos(a(this.q) + 1.570796326794897D);
          f6 = (float)Math.abs(localap.b * Math.sin(a(this.q) + 1.570796326794897D) + d1 * d2);
          if (f3 >= b)
            break label314;
          this.w = true;
        }
        while (true)
        {
          this.y = false;
          if (!this.w)
            break;
          a(1, paramMotionEvent);
          break;
          i1 = 0;
          break label175;
          label298: f1 = c;
          break label183;
          label306: f2 = c;
          break label191;
          label314: if ((f6 > f4 - c) && (f6 < f1 + f4))
          {
            this.w = true;
            continue;
          }
          if ((f6 > f5 - f2) && (f6 < c + f5))
          {
            this.w = true;
            continue;
          }
          if ((f6 > f4 - c) && (f6 < c + f5))
            continue;
          this.w = true;
          continue;
          label408: if (this.A != 1)
            continue;
          if (f3 < b)
          {
            this.w = true;
            continue;
          }
          if ((f3 > f4 - c) && (f3 < f1 + f4))
          {
            this.w = true;
            continue;
          }
          if ((f3 <= f5 - f2) || (f3 >= c + f5))
            continue;
          this.w = true;
        }
      }
      if (this.w)
      {
        a(3, paramMotionEvent);
        this.y = true;
        this.w = false;
      }
      if (paramMotionEvent.getPointerCount() == 2)
      {
        if ((!this.z) || (this.x))
          continue;
        b(1, paramMotionEvent);
        this.x = true;
        continue;
      }
      b(3, paramMotionEvent);
      this.z = true;
      this.x = false;
      continue;
      if (this.w)
      {
        a(3, paramMotionEvent);
        this.w = false;
      }
      while (true)
      {
        this.y = true;
        this.z = true;
        break;
        if (!this.x)
          continue;
        b(3, paramMotionEvent);
        this.x = false;
      }
      if (this.w)
      {
        a(2, paramMotionEvent);
        continue;
      }
      if (!this.x)
        continue;
      b(2, paramMotionEvent);
    }
  }

  public void setDelegate(b paramb)
  {
    this.D = paramb;
  }

  public void setType(int paramInt)
  {
    this.A = paramInt;
  }

  private static enum a
  {
  }

  public static abstract interface b
  {
    public abstract void a(ap paramap, float paramFloat1, float paramFloat2, float paramFloat3);
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.Components.ah
 * JD-Core Version:    0.6.0
 */