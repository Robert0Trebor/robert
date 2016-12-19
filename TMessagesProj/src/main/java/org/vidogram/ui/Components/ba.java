package org.vidogram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.vidogram.messenger.a;

public class ba
{
  private static Paint a;
  private static Paint b;
  private static int c;
  private int d = 0;
  private int e = 0;
  private boolean f = false;
  private int g;
  private int h;
  private a i;
  private int j;
  private int k;
  private int l;
  private boolean m;

  public ba(Context paramContext)
  {
    if (a == null)
    {
      a = new Paint(1);
      b = new Paint(1);
      c = a.a(24.0F);
    }
  }

  public void a(float paramFloat)
  {
    this.d = (int)Math.ceil((this.g - c) * paramFloat);
    if (this.d < 0)
      this.d = 0;
    do
      return;
    while (this.d <= this.g - c);
    this.d = (this.g - c);
  }

  public void a(int paramInt1, int paramInt2)
  {
    this.g = paramInt1;
    this.h = paramInt2;
  }

  public void a(int paramInt1, int paramInt2, int paramInt3)
  {
    this.j = paramInt1;
    this.k = paramInt2;
    this.l = paramInt3;
  }

  public void a(Canvas paramCanvas)
  {
    Paint localPaint = a;
    int n;
    float f2;
    float f3;
    float f1;
    if (this.m)
    {
      n = this.l;
      localPaint.setColor(n);
      b.setColor(this.k);
      paramCanvas.drawRect(c / 2, this.h / 2 - a.a(1.0F), this.g - c / 2, this.h / 2 + a.a(1.0F), a);
      paramCanvas.drawRect(c / 2, this.h / 2 - a.a(1.0F), c / 2 + this.d, this.h / 2 + a.a(1.0F), b);
      f2 = this.d + c / 2;
      f3 = this.h / 2;
      if (!this.f)
        break label187;
      f1 = 8.0F;
    }
    while (true)
    {
      paramCanvas.drawCircle(f2, f3, a.a(f1), b);
      return;
      n = this.j;
      break;
      label187: f1 = 6.0F;
    }
  }

  public void a(a parama)
  {
    this.i = parama;
  }

  public void a(boolean paramBoolean)
  {
    this.m = paramBoolean;
  }

  public boolean a()
  {
    return this.f;
  }

  public boolean a(int paramInt, float paramFloat1, float paramFloat2)
  {
    if (paramInt == 0)
    {
      paramInt = (this.h - c) / 2;
      if ((this.d - paramInt <= paramFloat1) && (paramFloat1 <= paramInt + (this.d + c)) && (paramFloat2 >= 0.0F) && (paramFloat2 <= this.h))
      {
        this.f = true;
        this.e = (int)(paramFloat1 - this.d);
      }
    }
    else
    {
      while (true)
      {
        return true;
        if ((paramInt == 1) || (paramInt == 3))
        {
          if (!this.f)
            break;
          if ((paramInt == 1) && (this.i != null))
            this.i.a(this.d / (this.g - c));
          this.f = false;
          return true;
        }
        else
        {
          if ((paramInt != 2) || (!this.f))
            break;
          this.d = (int)(paramFloat1 - this.e);
          if (this.d < 0)
          {
            this.d = 0;
            return true;
          }
          if (this.d <= this.g - c)
            continue;
          this.d = (this.g - c);
          return true;
        }
      }
    }
    return false;
  }

  public static abstract interface a
  {
    public abstract void a(float paramFloat);
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.Components.ba
 * JD-Core Version:    0.6.0
 */