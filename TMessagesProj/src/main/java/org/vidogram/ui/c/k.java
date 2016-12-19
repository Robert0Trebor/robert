package org.vidogram.ui.c;

import android.content.Context;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.vidogram.messenger.a;
import org.vidogram.ui.Components.v;

public class k extends FrameLayout
{
  private TextView a;

  public k(Context paramContext)
  {
    super(paramContext);
    FrameLayout localFrameLayout = new FrameLayout(paramContext);
    localFrameLayout.setBackgroundResource(2130838004);
    addView(localFrameLayout, v.a(-1, 27.0F, 51, 0.0F, 7.0F, 0.0F, 0.0F));
    ImageView localImageView = new ImageView(paramContext);
    localImageView.setImageResource(2130837802);
    localImageView.setPadding(0, a.a(2.0F), 0, 0);
    localFrameLayout.addView(localImageView, v.a(-2, -2.0F, 21, 0.0F, 0.0F, 10.0F, 0.0F));
    this.a = new TextView(paramContext);
    this.a.setPadding(0, 0, 0, a.a(1.0F));
    this.a.setTextSize(1, 14.0F);
    this.a.setTextColor(-11102772);
    this.a.setTypeface(a.a("fonts/rmedium.ttf"));
    addView(this.a, v.b(-2, -2, 17));
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(paramInt1), 1073741824), View.MeasureSpec.makeMeasureSpec(a.a(40.0F), 1073741824));
  }

  public void setText(String paramString)
  {
    this.a.setText(paramString);
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.c.k
 * JD-Core Version:    0.6.0
 */