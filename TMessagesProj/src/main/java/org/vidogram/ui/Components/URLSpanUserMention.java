package org.vidogram.ui.Components;

import android.text.TextPaint;

public class URLSpanUserMention extends URLSpanNoUnderline
{
  public URLSpanUserMention(String paramString)
  {
    super(paramString);
  }

  public void updateDrawState(TextPaint paramTextPaint)
  {
    super.updateDrawState(paramTextPaint);
    paramTextPaint.setColor(-14255946);
    paramTextPaint.setUnderlineText(false);
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.Components.URLSpanUserMention
 * JD-Core Version:    0.6.0
 */