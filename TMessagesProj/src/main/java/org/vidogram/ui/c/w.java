package org.vidogram.ui.c;

import android.content.Context;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.vidogram.messenger.a;
import org.vidogram.messenger.r;
import org.vidogram.ui.Components.v;

public class w extends FrameLayout
{
  private TextView a = new TextView(getContext());

  public w(Context paramContext)
  {
    super(paramContext);
    this.a.setTextSize(1, 15.0F);
    this.a.setTypeface(a.a("fonts/rmedium.ttf"));
    this.a.setTextColor(-12676913);
    paramContext = this.a;
    if (r.a)
    {
      i = 5;
      paramContext.setGravity(i | 0x10);
      paramContext = this.a;
      if (!r.a)
        break label115;
    }
    label115: for (int i = j; ; i = 3)
    {
      addView(paramContext, v.a(-1, -1.0F, i | 0x30, 17.0F, 15.0F, 17.0F, 0.0F));
      return;
      i = 3;
      break;
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, View.MeasureSpec.makeMeasureSpec(a.a(38.0F), 1073741824));
  }

  public void setText(String paramString)
  {
    this.a.setText(paramString);
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.c.w
 * JD-Core Version:    0.6.0
 */