package org.vidogram.ui.c;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import org.vidogram.messenger.a;
import org.vidogram.ui.Components.v;
import org.vidogram.ui.a.l;

public class i extends FrameLayout
{
  private FrameLayout a;

  public i(Context paramContext)
  {
    super(paramContext);
    this.a = new FrameLayout(paramContext);
    this.a.setBackgroundResource(2130838164);
    this.a.getBackground().setColorFilter(l.P);
    addView(this.a, v.b(36, 36, 17));
    paramContext = new ProgressBar(paramContext);
    try
    {
      paramContext.setIndeterminateDrawable(getResources().getDrawable(2130837951));
      label78: paramContext.setIndeterminate(true);
      a.a(paramContext, 1500);
      this.a.addView(paramContext, v.b(32, 32, 17));
      return;
    }
    catch (Exception localException)
    {
      break label78;
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(paramInt1), 1073741824), View.MeasureSpec.makeMeasureSpec(a.a(44.0F), 1073741824));
  }

  public void setProgressVisible(boolean paramBoolean)
  {
    FrameLayout localFrameLayout = this.a;
    if (paramBoolean);
    for (int i = 0; ; i = 4)
    {
      localFrameLayout.setVisibility(i);
      return;
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.c.i
 * JD-Core Version:    0.6.0
 */