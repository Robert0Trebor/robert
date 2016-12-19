package org.vidogram.ui.Components.a.a;

import android.view.MotionEvent;

public class e
{
  private float a;
  private float b;
  private float c;
  private float d;
  private float e;
  private float f;
  private a g;

  public e(a parama)
  {
    this.g = parama;
  }

  private float a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7, float paramFloat8)
  {
    paramFloat2 = (float)Math.toDegrees((float)Math.atan2(paramFloat2 - paramFloat4, paramFloat1 - paramFloat3) - (float)Math.atan2(paramFloat6 - paramFloat8, paramFloat5 - paramFloat7)) % 360.0F;
    paramFloat1 = paramFloat2;
    if (paramFloat2 < -180.0F)
      paramFloat1 = paramFloat2 + 360.0F;
    paramFloat2 = paramFloat1;
    if (paramFloat1 > 180.0F)
      paramFloat2 = paramFloat1 - 360.0F;
    return paramFloat2;
  }

  public float a()
  {
    return this.e;
  }

  public boolean a(MotionEvent paramMotionEvent)
  {
    if (paramMotionEvent.getPointerCount() != 2)
      return false;
    switch (paramMotionEvent.getActionMasked())
    {
    case 4:
    default:
    case 0:
    case 5:
    case 2:
    case 1:
    case 3:
    case 6:
    }
    while (true)
    {
      return true;
      this.c = paramMotionEvent.getX(0);
      this.d = paramMotionEvent.getY(0);
      this.a = paramMotionEvent.getX(1);
      this.b = paramMotionEvent.getY(1);
      continue;
      float f1 = paramMotionEvent.getX(0);
      float f2 = paramMotionEvent.getY(0);
      float f3 = paramMotionEvent.getX(1);
      float f4 = paramMotionEvent.getY(1);
      this.e = a(this.a, this.b, this.c, this.d, f3, f4, f1, f2);
      if (this.g == null)
        continue;
      if (Float.isNaN(this.f))
      {
        this.f = this.e;
        this.g.a(this);
        continue;
      }
      this.g.b(this);
      continue;
      this.f = (0.0F / 0.0F);
      continue;
      this.f = (0.0F / 0.0F);
      if (this.g == null)
        continue;
      this.g.c(this);
    }
  }

  public float b()
  {
    return this.f;
  }

  public static abstract interface a
  {
    public abstract void a(e parame);

    public abstract void b(e parame);

    public abstract void c(e parame);
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.Components.a.a.e
 * JD-Core Version:    0.6.0
 */