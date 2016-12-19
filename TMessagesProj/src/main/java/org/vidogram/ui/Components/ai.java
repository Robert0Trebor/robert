package org.vidogram.ui.Components;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import java.util.Locale;
import org.vidogram.messenger.a;

public class ai extends View
{
  private int a = 0;
  private boolean b;
  private boolean c = true;
  private float d;
  private float e;
  private av f = new av();
  private Paint g = new Paint(1);
  private Paint h = new Paint(1);
  private Paint i = new Paint(1);
  private TextPaint j = new TextPaint(1);
  private Path k = new Path();
  private a l;
  private aj.a m;

  public ai(Context paramContext, aj.a parama)
  {
    super(paramContext);
    setWillNotDraw(false);
    this.m = parama;
    this.g.setColor(-1711276033);
    this.g.setStrokeWidth(a.a(1.0F));
    this.g.setStyle(Paint.Style.STROKE);
    this.h.setColor(-1711276033);
    this.h.setStrokeWidth(a.a(2.0F));
    this.h.setStyle(Paint.Style.STROKE);
    this.i.setColor(-1);
    this.i.setStrokeWidth(a.a(2.0F));
    this.i.setStyle(Paint.Style.STROKE);
    this.j.setColor(-4210753);
    this.j.setTextSize(a.a(13.0F));
  }

  private void a()
  {
    if (this.a == 0)
      return;
    this.a = 0;
  }

  private void a(float paramFloat)
  {
    if (this.a != 0)
      return;
    float f1 = this.f.c / 5.0F;
    this.a = (int)Math.floor((paramFloat - this.f.a) / f1 + 1.0F);
  }

  private void a(int paramInt, MotionEvent paramMotionEvent)
  {
    float f1 = paramMotionEvent.getX();
    float f2 = paramMotionEvent.getY();
    switch (paramInt)
    {
    default:
      return;
    case 1:
      a(f1);
      return;
    case 2:
      float f3 = Math.min(2.0F, (this.e - f2) / 8.0F);
      paramMotionEvent = null;
      switch (this.m.f)
      {
      default:
        switch (this.a)
        {
        default:
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
        }
      case 0:
      case 1:
      case 2:
      case 3:
      }
      while (true)
      {
        invalidate();
        if (this.l != null)
          this.l.a();
        this.d = f1;
        this.e = f2;
        return;
        paramMotionEvent = this.m.a;
        break;
        paramMotionEvent = this.m.b;
        break;
        paramMotionEvent = this.m.c;
        break;
        paramMotionEvent = this.m.d;
        break;
        paramMotionEvent.a = Math.max(0.0F, Math.min(100.0F, f3 + paramMotionEvent.a));
        continue;
        paramMotionEvent.b = Math.max(0.0F, Math.min(100.0F, f3 + paramMotionEvent.b));
        continue;
        paramMotionEvent.c = Math.max(0.0F, Math.min(100.0F, f3 + paramMotionEvent.c));
        continue;
        paramMotionEvent.d = Math.max(0.0F, Math.min(100.0F, f3 + paramMotionEvent.d));
        continue;
        paramMotionEvent.e = Math.max(0.0F, Math.min(100.0F, f3 + paramMotionEvent.e));
      }
    case 3:
    case 4:
    case 5:
    }
    a();
  }

  public void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    this.f.a = paramFloat1;
    this.f.b = paramFloat2;
    this.f.c = paramFloat3;
    this.f.d = paramFloat4;
  }

  @SuppressLint({"DrawAllocation"})
  protected void onDraw(Canvas paramCanvas)
  {
    float f1 = this.f.c / 5.0F;
    int n = 0;
    while (n < 4)
    {
      f2 = this.f.a;
      f3 = n;
      f4 = this.f.b;
      f5 = this.f.a;
      float f6 = n;
      float f7 = this.f.b;
      paramCanvas.drawLine(f3 * f1 + (f2 + f1), f4, f6 * f1 + (f5 + f1), this.f.d + f7, this.g);
      n += 1;
    }
    float f2 = this.f.a;
    float f3 = this.f.b;
    float f4 = this.f.d;
    float f5 = this.f.a;
    paramCanvas.drawLine(f2, f4 + f3, this.f.c + f5, this.f.b, this.h);
    aj.b localb = null;
    switch (this.m.f)
    {
    default:
      n = 0;
      if (n >= 5)
        break;
      switch (n)
      {
      default:
        localObject = "";
      case 0:
      case 1:
      case 2:
      case 3:
      case 4:
      }
    case 0:
    case 1:
    case 2:
    case 3:
      while (true)
      {
        label219: f2 = this.j.measureText((String)localObject);
        f3 = this.f.a;
        paramCanvas.drawText((String)localObject, (f1 - f2) / 2.0F + f3 + n * f1, this.f.b + this.f.d - a.a(4.0F), this.j);
        n += 1;
        break label219;
        this.i.setColor(-1);
        localb = this.m.a;
        break;
        this.i.setColor(-1229492);
        localb = this.m.b;
        break;
        this.i.setColor(-15667555);
        localb = this.m.c;
        break;
        this.i.setColor(-13404165);
        localb = this.m.d;
        break;
        localObject = String.format(Locale.US, "%.2f", new Object[] { Float.valueOf(localb.a / 100.0F) });
        continue;
        localObject = String.format(Locale.US, "%.2f", new Object[] { Float.valueOf(localb.b / 100.0F) });
        continue;
        localObject = String.format(Locale.US, "%.2f", new Object[] { Float.valueOf(localb.c / 100.0F) });
        continue;
        localObject = String.format(Locale.US, "%.2f", new Object[] { Float.valueOf(localb.d / 100.0F) });
        continue;
        localObject = String.format(Locale.US, "%.2f", new Object[] { Float.valueOf(localb.e / 100.0F) });
      }
    }
    Object localObject = localb.d();
    invalidate();
    this.k.reset();
    n = 0;
    if (n < localObject.length / 2)
    {
      if (n == 0)
        this.k.moveTo(this.f.a + localObject[(n * 2)] * this.f.c, this.f.b + (1.0F - localObject[(n * 2 + 1)]) * this.f.d);
      while (true)
      {
        n += 1;
        break;
        this.k.lineTo(this.f.a + localObject[(n * 2)] * this.f.c, this.f.b + (1.0F - localObject[(n * 2 + 1)]) * this.f.d);
      }
    }
    paramCanvas.drawPath(this.k, this.i);
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
    do
    {
      do
        while (true)
        {
          return true;
          if (paramMotionEvent.getPointerCount() != 1)
            break;
          if ((!this.c) || (this.b))
            continue;
          float f1 = paramMotionEvent.getX();
          float f2 = paramMotionEvent.getY();
          this.d = f1;
          this.e = f2;
          if ((f1 >= this.f.a) && (f1 <= this.f.a + this.f.c) && (f2 >= this.f.b) && (f2 <= this.f.b + this.f.d))
            this.b = true;
          this.c = false;
          if (!this.b)
            continue;
          a(1, paramMotionEvent);
          return true;
        }
      while (!this.b);
      a(3, paramMotionEvent);
      this.c = true;
      this.b = false;
      return true;
      if (this.b)
      {
        a(3, paramMotionEvent);
        this.b = false;
      }
      this.c = true;
      return true;
    }
    while (!this.b);
    a(2, paramMotionEvent);
    return true;
  }

  public void setDelegate(a parama)
  {
    this.l = parama;
  }

  public static abstract interface a
  {
    public abstract void a();
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.Components.ai
 * JD-Core Version:    0.6.0
 */