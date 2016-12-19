package org.vidogram.ui.c;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.vidogram.messenger.a;
import org.vidogram.messenger.r;
import org.vidogram.ui.Components.v;

public class bf extends FrameLayout
{
  private TextView a;

  public bf(Context paramContext)
  {
    super(paramContext);
    this.a = new TextView(paramContext);
    this.a.setTextColor(-8355712);
    this.a.setLinkTextColor(-14255946);
    this.a.setTextSize(1, 14.0F);
    paramContext = this.a;
    if (r.a)
    {
      i = 5;
      paramContext.setGravity(i);
      this.a.setPadding(0, a.a(10.0F), 0, a.a(17.0F));
      this.a.setMovementMethod(LinkMovementMethod.getInstance());
      paramContext = this.a;
      if (!r.a)
        break label135;
    }
    label135: for (int i = j; ; i = 3)
    {
      addView(paramContext, v.a(-2, -2.0F, i | 0x30, 17.0F, 0.0F, 17.0F, 0.0F));
      return;
      i = 3;
      break;
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(paramInt1), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
  }

  public void setText(CharSequence paramCharSequence)
  {
    this.a.setText(paramCharSequence);
  }

  public void setTextColor(int paramInt)
  {
    this.a.setTextColor(paramInt);
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.c.bf
 * JD-Core Version:    0.6.0
 */