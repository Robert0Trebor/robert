package org.vidogram.ui.Components;

import android.text.Layout.Alignment;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import org.vidogram.messenger.n;

public class bj
{
  public static StaticLayout a(CharSequence paramCharSequence, int paramInt1, int paramInt2, TextPaint paramTextPaint, int paramInt3, Layout.Alignment paramAlignment, float paramFloat1, float paramFloat2, boolean paramBoolean, TextUtils.TruncateAt paramTruncateAt, int paramInt4, int paramInt5)
  {
    float f;
    if (paramInt5 == 1)
      f = paramInt4;
    while (true)
    {
      try
      {
        paramCharSequence = TextUtils.ellipsize(paramCharSequence, paramTextPaint, f, TextUtils.TruncateAt.END);
        return new StaticLayout(paramCharSequence, 0, paramCharSequence.length(), paramTextPaint, paramInt3, paramAlignment, paramFloat1, paramFloat2, paramBoolean);
        paramTruncateAt = new StaticLayout(paramCharSequence, paramTextPaint, paramInt3, paramAlignment, paramFloat1, paramFloat2, paramBoolean);
        if (paramTruncateAt.getLineCount() <= paramInt5)
          break;
        f = paramTruncateAt.getLineLeft(paramInt5 - 1);
        if (f != 0.0F)
        {
          paramInt1 = paramTruncateAt.getOffsetForHorizontal(paramInt5 - 1, f);
          paramCharSequence = new SpannableStringBuilder(paramCharSequence.subSequence(0, Math.max(0, paramInt1 - 1)));
          paramCharSequence.append("…");
          paramCharSequence = new StaticLayout(paramCharSequence, paramTextPaint, paramInt3, paramAlignment, paramFloat1, paramFloat2, paramBoolean);
          return paramCharSequence;
        }
      }
      catch (java.lang.Exception paramCharSequence)
      {
        n.a("tmessages", paramCharSequence);
        return null;
      }
      paramInt1 = paramTruncateAt.getOffsetForHorizontal(paramInt5 - 1, paramTruncateAt.getLineWidth(paramInt5 - 1));
    }
    return paramTruncateAt;
  }

  public static StaticLayout a(CharSequence paramCharSequence, TextPaint paramTextPaint, int paramInt1, Layout.Alignment paramAlignment, float paramFloat1, float paramFloat2, boolean paramBoolean, TextUtils.TruncateAt paramTruncateAt, int paramInt2, int paramInt3)
  {
    return a(paramCharSequence, 0, paramCharSequence.length(), paramTextPaint, paramInt1, paramAlignment, paramFloat1, paramFloat2, paramBoolean, paramTruncateAt, paramInt2, paramInt3);
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.Components.bj
 * JD-Core Version:    0.6.0
 */