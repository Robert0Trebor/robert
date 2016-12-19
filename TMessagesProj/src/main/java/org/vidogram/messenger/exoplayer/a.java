package org.vidogram.messenger.exoplayer;

import android.content.Context;
import android.graphics.Matrix;
import android.view.TextureView;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;

public final class a extends FrameLayout
{
  private float a;
  private int b;
  private Matrix c = new Matrix();

  public a(Context paramContext)
  {
    super(paramContext);
  }

  public void a(float paramFloat, int paramInt)
  {
    if ((this.a != paramFloat) || (this.b != paramInt))
    {
      this.a = paramFloat;
      this.b = paramInt;
      requestLayout();
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    if (this.a == 0.0F);
    label224: 
    while (true)
    {
      return;
      paramInt2 = getMeasuredWidth();
      paramInt1 = getMeasuredHeight();
      float f = paramInt2 / paramInt1;
      f = this.a / f - 1.0F;
      if (Math.abs(f) <= 0.01F)
        continue;
      if (f > 0.0F)
      {
        paramInt1 = (int)(paramInt2 / this.a);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(paramInt2, 1073741824), View.MeasureSpec.makeMeasureSpec(paramInt1, 1073741824));
        paramInt2 = getChildCount();
        paramInt1 = 0;
      }
      while (true)
      {
        if (paramInt1 >= paramInt2)
          break label224;
        View localView = getChildAt(paramInt1);
        if ((localView instanceof TextureView))
        {
          this.c.reset();
          paramInt1 = getWidth() / 2;
          paramInt2 = getHeight() / 2;
          this.c.postRotate(this.b, paramInt1, paramInt2);
          if ((this.b == 90) || (this.b == 270))
          {
            f = getHeight() / getWidth();
            this.c.postScale(1.0F / f, f, paramInt1, paramInt2);
          }
          ((TextureView)localView).setTransform(this.c);
          return;
          paramInt2 = (int)(paramInt1 * this.a);
          break;
        }
        paramInt1 += 1;
      }
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.exoplayer.a
 * JD-Core Version:    0.6.0
 */