package org.vidogram.ui.Components;

import android.graphics.Path;
import android.graphics.Path.Direction;
import android.text.StaticLayout;

public class z extends Path
{
  private StaticLayout a;
  private int b;
  private float c = -1.0F;
  private float d;

  public void a(StaticLayout paramStaticLayout, int paramInt, float paramFloat)
  {
    this.a = paramStaticLayout;
    this.b = paramStaticLayout.getLineForOffset(paramInt);
    this.c = -1.0F;
    this.d = paramFloat;
  }

  public void addRect(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, Path.Direction paramDirection)
  {
    float f2 = paramFloat2 + this.d;
    float f3 = this.d;
    if (this.c == -1.0F)
      this.c = f2;
    float f1;
    while (true)
    {
      paramFloat2 = this.a.getLineRight(this.b);
      f1 = this.a.getLineLeft(this.b);
      if (paramFloat1 < paramFloat2)
        break;
      return;
      if (this.c == f2)
        continue;
      this.c = f2;
      this.b += 1;
    }
    if (paramFloat3 > paramFloat2);
    while (true)
    {
      if (paramFloat1 < f1)
        paramFloat1 = f1;
      while (true)
      {
        super.addRect(paramFloat1, f2, paramFloat2, paramFloat4 + f3, paramDirection);
        return;
      }
      paramFloat2 = paramFloat3;
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.Components.z
 * JD-Core Version:    0.6.0
 */