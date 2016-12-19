package org.vidogram.ui.Components;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

public class bo extends MetricAffectingSpan
{
  private Typeface a;
  private int b;
  private int c;

  public bo(Typeface paramTypeface)
  {
    this.a = paramTypeface;
  }

  public bo(Typeface paramTypeface, int paramInt)
  {
    this.a = paramTypeface;
    this.b = paramInt;
  }

  public bo(Typeface paramTypeface, int paramInt1, int paramInt2)
  {
    this.a = paramTypeface;
    this.b = paramInt1;
    this.c = paramInt2;
  }

  public void updateDrawState(TextPaint paramTextPaint)
  {
    if (this.a != null)
      paramTextPaint.setTypeface(this.a);
    if (this.b != 0)
      paramTextPaint.setTextSize(this.b);
    if (this.c != 0)
      paramTextPaint.setColor(this.c);
    paramTextPaint.setFlags(paramTextPaint.getFlags() | 0x80);
  }

  public void updateMeasureState(TextPaint paramTextPaint)
  {
    if (this.a != null)
      paramTextPaint.setTypeface(this.a);
    if (this.b != 0)
      paramTextPaint.setTextSize(this.b);
    paramTextPaint.setFlags(paramTextPaint.getFlags() | 0x80);
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.Components.bo
 * JD-Core Version:    0.6.0
 */