package org.vidogram.ui.c;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.TextUtils.TruncateAt;
import android.view.MotionEvent;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.vidogram.messenger.a;
import org.vidogram.messenger.r;
import org.vidogram.ui.Components.v;

public class g extends FrameLayout
{
  private TextView a;

  public g(Context paramContext)
  {
    super(paramContext);
    setBackgroundResource(2130837946);
    this.a = new TextView(paramContext);
    this.a.setTextSize(1, 15.0F);
    this.a.setTextColor(-12348980);
    this.a.setTypeface(a.a("fonts/rmedium.ttf"));
    this.a.setSingleLine(true);
    this.a.setEllipsize(TextUtils.TruncateAt.END);
    this.a.setMaxLines(1);
    paramContext = this.a;
    if (r.a)
    {
      i = 5;
      paramContext.setGravity(i);
      paramContext = this.a;
      if (!r.a)
        break label141;
    }
    label141: for (int i = j; ; i = 3)
    {
      addView(paramContext, v.a(-2, -2.0F, i | 0x10, 14.0F, 0.0F, 14.0F, 0.0F));
      return;
      i = 3;
      break;
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(paramInt1), 1073741824), View.MeasureSpec.makeMeasureSpec(a.a(36.0F), 1073741824));
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if ((Build.VERSION.SDK_INT >= 21) && (getBackground() != null) && ((paramMotionEvent.getAction() == 0) || (paramMotionEvent.getAction() == 2)))
      getBackground().setHotspot(paramMotionEvent.getX(), paramMotionEvent.getY());
    return super.onTouchEvent(paramMotionEvent);
  }

  public void setText(String paramString)
  {
    this.a.setText(paramString);
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.c.g
 * JD-Core Version:    0.6.0
 */