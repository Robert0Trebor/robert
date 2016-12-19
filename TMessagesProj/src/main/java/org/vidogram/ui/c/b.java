package org.vidogram.ui.c;

import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import org.vidogram.messenger.a;
import org.vidogram.tgnet.g.i;

public class b extends FrameLayout
{
  private g.i a;
  private boolean b;

  public g.i getCurrentChannel()
  {
    return this.a;
  }

  public boolean hasOverlappingRendering()
  {
    return false;
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    paramInt2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(paramInt1), 1073741824);
    if (this.b);
    for (paramInt1 = 12; ; paramInt1 = 0)
    {
      super.onMeasure(paramInt2, View.MeasureSpec.makeMeasureSpec(a.a(paramInt1 + 60), 1073741824));
      return;
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.c.b
 * JD-Core Version:    0.6.0
 */