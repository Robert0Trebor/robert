package org.vidogram.ui.c;

import android.content.Context;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import org.vidogram.messenger.a;
import org.vidogram.messenger.r;
import org.vidogram.ui.Components.v;

public class ab extends FrameLayout
{
  private ProgressBar a;
  private TextView b;

  public ab(Context paramContext)
  {
    super(paramContext);
    this.a = new ProgressBar(paramContext);
    addView(this.a, v.b(-2, -2, 17));
    this.b = new TextView(paramContext);
    this.b.setTextColor(-6710887);
    this.b.setTextSize(1, 16.0F);
    this.b.setText(r.a("NoResult", 2131231509));
    addView(this.b, v.b(-2, -2, 17));
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, View.MeasureSpec.makeMeasureSpec((int)(a.a(56.0F) * 2.5F), 1073741824));
  }

  public void setLoading(boolean paramBoolean)
  {
    int j = 4;
    Object localObject = this.a;
    if (paramBoolean)
    {
      i = 0;
      ((ProgressBar)localObject).setVisibility(i);
      localObject = this.b;
      if (!paramBoolean)
        break label44;
    }
    label44: for (int i = j; ; i = 0)
    {
      ((TextView)localObject).setVisibility(i);
      return;
      i = 4;
      break;
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.c.ab
 * JD-Core Version:    0.6.0
 */