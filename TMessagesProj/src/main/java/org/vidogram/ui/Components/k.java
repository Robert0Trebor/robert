package org.vidogram.ui.Components;

import android.graphics.Paint;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import org.vidogram.messenger.a;

public class k extends ImageSpan
{
  public int a;

  public k(Drawable paramDrawable, int paramInt)
  {
    super(paramDrawable, paramInt);
  }

  public int getSize(Paint paramPaint, CharSequence paramCharSequence, int paramInt1, int paramInt2, Paint.FontMetricsInt paramFontMetricsInt)
  {
    if (paramFontMetricsInt == null)
      paramFontMetricsInt = new Paint.FontMetricsInt();
    while (true)
    {
      paramInt1 = super.getSize(paramPaint, paramCharSequence, paramInt1, paramInt2, paramFontMetricsInt);
      paramInt2 = a.a(6.0F);
      int i = (paramFontMetricsInt.bottom - paramFontMetricsInt.top) / 2;
      paramFontMetricsInt.top = (-i - paramInt2);
      paramFontMetricsInt.bottom = (i - paramInt2);
      paramFontMetricsInt.ascent = (-i - paramInt2);
      paramFontMetricsInt.leading = 0;
      paramFontMetricsInt.descent = (i - paramInt2);
      return paramInt1;
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.Components.k
 * JD-Core Version:    0.6.0
 */