package org.vidogram.ui.c;

import android.content.Context;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.vidogram.messenger.a;
import org.vidogram.messenger.r;
import org.vidogram.ui.Components.v;

public class u extends FrameLayout
{
  private TextView a;

  public u(Context paramContext)
  {
    super(paramContext);
    setBackgroundColor(-855310);
    this.a = new TextView(getContext());
    this.a.setTextSize(1, 13.0F);
    this.a.setTypeface(a.a("fonts/rmedium.ttf"));
    this.a.setTextColor(-7697782);
    paramContext = this.a;
    if (r.a)
    {
      i = 5;
      paramContext.setGravity(i | 0x10);
      paramContext = this.a;
      if (!r.a)
        break label120;
    }
    label120: for (int i = j; ; i = 3)
    {
      addView(paramContext, v.a(-1, -1.0F, i | 0x30, 16.0F, 0.0F, 16.0F, 0.0F));
      return;
      i = 3;
      break;
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(paramInt1), 1073741824), View.MeasureSpec.makeMeasureSpec(a.a(32.0F), 1073741824));
  }

  public void setText(String paramString)
  {
    this.a.setText(paramString);
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.c.u
 * JD-Core Version:    0.6.0
 */