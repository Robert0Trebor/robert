package org.vidogram.ui.Components;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextPaint;
import org.vidogram.messenger.a;
import org.vidogram.messenger.n;

public class bn extends Drawable
{
  private static Drawable a;
  private static Drawable b;
  private static TextPaint c;
  private StaticLayout d;
  private float e = 0.0F;
  private int f = 0;
  private int g = 0;

  public bn(Context paramContext)
  {
    if (a == null)
    {
      a = paramContext.getResources().getDrawable(2130837789);
      b = paramContext.getResources().getDrawable(2130837790);
      c = new TextPaint(1);
      c.setColor(-1);
      c.setTypeface(a.a("fonts/rmedium.ttf"));
    }
    c.setTextSize(a.a(11.0F));
  }

  public void a(int paramInt)
  {
    this.g = paramInt;
    String str2;
    String str1;
    if ((this.g >= 1) && (this.g < 60))
    {
      str2 = "" + paramInt;
      str1 = str2;
      if (str2.length() < 2)
        str1 = str2 + "s";
    }
    while (true)
    {
      this.e = c.measureText(str1);
      try
      {
        this.d = new StaticLayout(str1, c, (int)Math.ceil(this.e), Layout.Alignment.ALIGN_NORMAL, 1.0F, 0.0F, false);
        this.f = this.d.getHeight();
        invalidateSelf();
        return;
        if ((this.g >= 60) && (this.g < 3600))
        {
          str2 = "" + paramInt / 60;
          str1 = str2;
          if (str2.length() >= 2)
            continue;
          str1 = str2 + "m";
          continue;
        }
        if ((this.g >= 3600) && (this.g < 86400))
        {
          str2 = "" + paramInt / 60 / 60;
          str1 = str2;
          if (str2.length() >= 2)
            continue;
          str1 = str2 + "h";
          continue;
        }
        if ((this.g >= 86400) && (this.g < 604800))
        {
          str2 = "" + paramInt / 60 / 60 / 24;
          str1 = str2;
          if (str2.length() >= 2)
            continue;
          str1 = str2 + "d";
          continue;
        }
        str2 = "" + paramInt / 60 / 60 / 24 / 7;
        if (str2.length() < 2)
        {
          str1 = str2 + "w";
          continue;
        }
        str1 = str2;
        if (str2.length() <= 2)
          continue;
        str1 = "c";
      }
      catch (Exception localException)
      {
        while (true)
        {
          this.d = null;
          n.a("tmessages", localException);
        }
      }
    }
  }

  public void draw(Canvas paramCanvas)
  {
    int j = b.getIntrinsicWidth();
    int k = b.getIntrinsicHeight();
    if (this.g == 0);
    for (Drawable localDrawable = b; ; localDrawable = a)
    {
      int i = (j - localDrawable.getIntrinsicWidth()) / 2;
      int m = (k - localDrawable.getIntrinsicHeight()) / 2;
      localDrawable.setBounds(i, m, localDrawable.getIntrinsicWidth() + i, localDrawable.getIntrinsicHeight() + m);
      localDrawable.draw(paramCanvas);
      if ((this.g != 0) && (this.d != null))
      {
        i = 0;
        if (a.b == 3.0F)
          i = -1;
        paramCanvas.translate(i + (int)(j / 2 - Math.ceil(this.e / 2.0F)), (k - this.f) / 2);
        this.d.draw(paramCanvas);
      }
      return;
    }
  }

  public int getIntrinsicHeight()
  {
    return b.getIntrinsicHeight();
  }

  public int getIntrinsicWidth()
  {
    return b.getIntrinsicWidth();
  }

  public int getOpacity()
  {
    return 0;
  }

  public void setAlpha(int paramInt)
  {
  }

  public void setColorFilter(ColorFilter paramColorFilter)
  {
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.Components.bn
 * JD-Core Version:    0.6.0
 */