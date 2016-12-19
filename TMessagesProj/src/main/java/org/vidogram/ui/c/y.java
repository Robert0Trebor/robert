package org.vidogram.ui.c;

import android.content.Context;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.vidogram.messenger.a;
import org.vidogram.ui.Components.v;

public class y extends FrameLayout
{
  private TextView a;

  public y(Context paramContext)
  {
    super(paramContext);
    setLayoutParams(new ViewGroup.LayoutParams(a.a(54.0F), a.a(64.0F)));
    this.a = new TextView(getContext());
    this.a.setTextSize(1, 22.0F);
    this.a.setTypeface(a.a("fonts/rmedium.ttf"));
    this.a.setTextColor(-8355712);
    this.a.setGravity(17);
    addView(this.a, v.a(-1, -1.0F));
  }

  public void setCellHeight(int paramInt)
  {
    setLayoutParams(new ViewGroup.LayoutParams(a.a(54.0F), paramInt));
  }

  public void setLetter(String paramString)
  {
    this.a.setText(paramString.toUpperCase());
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.c.y
 * JD-Core Version:    0.6.0
 */