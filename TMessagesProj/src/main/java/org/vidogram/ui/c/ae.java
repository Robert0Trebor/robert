package org.vidogram.ui.c;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import org.vidogram.messenger.a;
import org.vidogram.ui.Components.v;

@SuppressLint({"NewApi"})
public class ae extends FrameLayout
{
  public ae(Context paramContext)
  {
    super(paramContext);
    paramContext = new ImageView(paramContext);
    paramContext.setScaleType(ImageView.ScaleType.CENTER);
    paramContext.setImageResource(2130837925);
    paramContext.setBackgroundColor(-16777216);
    addView(paramContext, v.a(80, 80.0F));
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(View.MeasureSpec.makeMeasureSpec(a.a(86.0F), 1073741824), View.MeasureSpec.makeMeasureSpec(a.a(80.0F), 1073741824));
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.c.ae
 * JD-Core Version:    0.6.0
 */