package org.vidogram.ui.c;

import android.content.Context;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.vidogram.messenger.a;
import org.vidogram.ui.Components.v;

public class ac extends FrameLayout
{
  public ac(Context paramContext)
  {
    super(paramContext);
    LinearLayout localLinearLayout = new LinearLayout(paramContext);
    addView(localLinearLayout, v.b(-2, -2, 17));
    Object localObject = new TextView(paramContext);
    ((TextView)localObject).setTextSize(1, 16.0F);
    ((TextView)localObject).setTextColor(-6710887);
    ((TextView)localObject).setText("Powered by");
    localLinearLayout.addView((View)localObject, v.b(-2, -2));
    localObject = new ImageView(paramContext);
    ((ImageView)localObject).setImageResource(2130837781);
    ((ImageView)localObject).setPadding(0, a.a(2.0F), 0, 0);
    localLinearLayout.addView((View)localObject, v.b(35, -2));
    paramContext = new TextView(paramContext);
    paramContext.setTextSize(1, 16.0F);
    paramContext.setTextColor(-6710887);
    paramContext.setText("Foursquare");
    localLinearLayout.addView(paramContext, v.b(-2, -2));
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, View.MeasureSpec.makeMeasureSpec(a.a(56.0F), 1073741824));
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.c.ac
 * JD-Core Version:    0.6.0
 */