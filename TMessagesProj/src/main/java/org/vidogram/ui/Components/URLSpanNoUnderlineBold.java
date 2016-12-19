package org.vidogram.ui.Components;

import android.text.TextPaint;
import org.vidogram.messenger.a;

public class URLSpanNoUnderlineBold extends URLSpanNoUnderline
{
  public URLSpanNoUnderlineBold(String paramString)
  {
    super(paramString);
  }

  public void updateDrawState(TextPaint paramTextPaint)
  {
    super.updateDrawState(paramTextPaint);
    paramTextPaint.setTypeface(a.a("fonts/rmedium.ttf"));
    paramTextPaint.setUnderlineText(false);
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.Components.URLSpanNoUnderlineBold
 * JD-Core Version:    0.6.0
 */