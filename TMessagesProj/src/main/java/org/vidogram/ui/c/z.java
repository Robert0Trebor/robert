package org.vidogram.ui.c;

import android.content.Context;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import org.vidogram.messenger.a;
import org.vidogram.ui.Components.v;

public class z extends FrameLayout
{
  public z(Context paramContext)
  {
    super(paramContext);
    addView(new ProgressBar(paramContext), v.b(-2, -2, 17));
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(paramInt1), 1073741824), View.MeasureSpec.makeMeasureSpec(a.a(54.0F), 1073741824));
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.c.z
 * JD-Core Version:    0.6.0
 */