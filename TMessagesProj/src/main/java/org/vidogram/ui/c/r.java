package org.vidogram.ui.c;

import android.content.Context;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;

public class r extends FrameLayout
{
  int a;

  public r(Context paramContext)
  {
    this(paramContext, 8);
  }

  public r(Context paramContext, int paramInt)
  {
    super(paramContext);
    this.a = paramInt;
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, View.MeasureSpec.makeMeasureSpec(this.a, 1073741824));
  }

  public void setHeight(int paramInt)
  {
    this.a = paramInt;
    requestLayout();
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.c.r
 * JD-Core Version:    0.6.0
 */