package org.vidogram.ui.c;

import android.content.Context;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.vidogram.messenger.a;
import org.vidogram.ui.Components.v;

public class be extends FrameLayout
{
  private TextView a;

  public be(Context paramContext)
  {
    super(paramContext);
    this.a = new TextView(paramContext);
    this.a.setTextColor(-6052957);
    this.a.setTextSize(1, 13.0F);
    this.a.setGravity(17);
    this.a.setPadding(0, a.a(19.0F), 0, a.a(19.0F));
    addView(this.a, v.a(-2, -2.0F, 17, 17.0F, 0.0F, 17.0F, 0.0F));
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, View.MeasureSpec.makeMeasureSpec(0, 0));
  }

  public void setText(String paramString)
  {
    this.a.setText(paramString);
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.c.be
 * JD-Core Version:    0.6.0
 */