package org.vidogram.ui.c;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.vidogram.messenger.ApplicationLoader;
import org.vidogram.messenger.a;
import org.vidogram.messenger.n;
import org.vidogram.ui.Components.v;
import org.vidogram.ui.a.l;

public class p extends FrameLayout
{
  private TextView a;

  public p(Context paramContext)
  {
    super(paramContext);
    this.a = new TextView(paramContext);
    this.a.setTextColor(l.a);
    this.a.setTextSize(1, 15.0F);
    this.a.setTypeface(a.a("fonts/rmedium.ttf"));
    this.a.setLines(1);
    this.a.setMaxLines(1);
    this.a.setSingleLine(true);
    this.a.setGravity(19);
    this.a.setCompoundDrawablePadding(a.a(34.0F));
    addView(this.a, v.a(-1, -1.0F, 51, 14.0F, 0.0F, 16.0F, 0.0F));
  }

  public void a(String paramString, int paramInt)
  {
    try
    {
      this.a.setText(paramString);
      paramString = ApplicationLoader.a.getResources().getDrawable(paramInt);
      paramString.mutate();
      paramString.setColorFilter(l.a, PorterDuff.Mode.SRC_ATOP);
      this.a.setCompoundDrawablesWithIntrinsicBounds(paramString, null, null, null);
      return;
    }
    catch (java.lang.Throwable paramString)
    {
      n.a("tmessages", paramString);
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, View.MeasureSpec.makeMeasureSpec(a.a(48.0F), 1073741824));
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.c.p
 * JD-Core Version:    0.6.0
 */