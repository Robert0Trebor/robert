package org.vidogram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextPaint;
import org.vidogram.messenger.a;
import org.vidogram.messenger.n;

public class w extends Drawable
{
  public static Paint a = new Paint();
  private static TextPaint b;
  private StaticLayout c;
  private float d;
  private float e;
  private float f;
  private StringBuilder g = new StringBuilder(5);

  public w()
  {
    if (b == null)
    {
      a.setColor(-986896);
      b = new TextPaint(1);
      b.setColor(-1);
    }
    b.setTextSize(a.a(28.0F));
  }

  public void a(String paramString)
  {
    this.g.setLength(0);
    if ((paramString != null) && (paramString.length() > 0))
      this.g.append(paramString.substring(0, 1));
    if (this.g.length() > 0)
    {
      paramString = this.g.toString().toUpperCase();
      try
      {
        this.c = new StaticLayout(paramString, b, a.a(100.0F), Layout.Alignment.ALIGN_NORMAL, 1.0F, 0.0F, false);
        if (this.c.getLineCount() > 0)
        {
          this.f = this.c.getLineLeft(0);
          this.d = this.c.getLineWidth(0);
          this.e = this.c.getLineBottom(0);
        }
        return;
      }
      catch (java.lang.Exception paramString)
      {
        n.a("tmessages", paramString);
        return;
      }
    }
    this.c = null;
  }

  public void draw(Canvas paramCanvas)
  {
    Rect localRect = getBounds();
    if (localRect == null)
      return;
    int i = localRect.width();
    paramCanvas.save();
    paramCanvas.drawRect(localRect.left, localRect.top, localRect.right, localRect.bottom, a);
    if (this.c != null)
    {
      paramCanvas.translate(localRect.left + (i - this.d) / 2.0F - this.f, localRect.top + (i - this.e) / 2.0F);
      this.c.draw(paramCanvas);
    }
    paramCanvas.restore();
  }

  public int getIntrinsicHeight()
  {
    return 0;
  }

  public int getIntrinsicWidth()
  {
    return 0;
  }

  public int getOpacity()
  {
    return -2;
  }

  public void setAlpha(int paramInt)
  {
  }

  public void setColorFilter(ColorFilter paramColorFilter)
  {
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.Components.w
 * JD-Core Version:    0.6.0
 */