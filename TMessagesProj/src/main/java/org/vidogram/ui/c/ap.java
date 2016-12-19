package org.vidogram.ui.c;

import android.content.Context;
import android.view.View;
import android.view.View.MeasureSpec;
import org.vidogram.messenger.a;

public class ap extends View
{
  private int a = 12;

  public ap(Context paramContext)
  {
    super(paramContext);
    setBackgroundResource(2130837782);
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(paramInt1), 1073741824), View.MeasureSpec.makeMeasureSpec(a.a(this.a), 1073741824));
  }

  public void setSize(int paramInt)
  {
    this.a = paramInt;
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.c.ap
 * JD-Core Version:    0.6.0
 */