package org.vidogram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import org.vidogram.messenger.a;

public class ar
{
  public float a = 0.0F;
  public int b;
  public int c;
  public float d = a.a(2.0F);
  private Paint e = new Paint();
  private Paint f = new Paint();

  public void a(float paramFloat)
  {
    this.a = paramFloat;
    if (this.a < 0.0F)
      this.a = 0.0F;
    do
      return;
    while (this.a <= 1.0F);
    this.a = 1.0F;
  }

  public void a(int paramInt1, int paramInt2)
  {
    this.e.setColor(paramInt1);
    this.f.setColor(paramInt2);
  }

  public void a(Canvas paramCanvas)
  {
    float f1 = this.c / 2;
    float f2 = this.d / 2.0F;
    float f3 = this.b;
    float f4 = this.c / 2;
    paramCanvas.drawRect(0.0F, f1 - f2, f3, this.d / 2.0F + f4, this.e);
    f1 = this.c / 2;
    f2 = this.d / 2.0F;
    f3 = this.b;
    f4 = this.a;
    float f5 = this.c / 2;
    paramCanvas.drawRect(0.0F, f1 - f2, f4 * f3, this.d / 2.0F + f5, this.f);
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.Components.ar
 * JD-Core Version:    0.6.0
 */