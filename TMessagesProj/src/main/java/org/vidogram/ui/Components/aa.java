package org.vidogram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.vidogram.messenger.a;

public class aa extends Drawable
{
  private Paint a = new Paint();
  private Paint b;

  public aa()
  {
    this.a.setColor(-2172970);
    this.b = new Paint();
    this.b.setColor(-3752002);
    this.b.setStrokeWidth(a.a(1.0F));
  }

  public void draw(Canvas paramCanvas)
  {
    int k = 0;
    paramCanvas.drawRect(getBounds(), this.a);
    int m = a.a(9.0F);
    int i3 = getBounds().width() / m;
    int n = getBounds().height() / m;
    int i1 = getBounds().left;
    int i2 = getBounds().top;
    int i = 0;
    int j;
    while (true)
    {
      j = k;
      if (i >= i3)
        break;
      paramCanvas.drawLine((i + 1) * m + i1, i2, (i + 1) * m + i1, getBounds().height() + i2, this.b);
      i += 1;
    }
    while (j < n)
    {
      paramCanvas.drawLine(i1, (j + 1) * m + i2, getBounds().width() + i1, (j + 1) * m + i2, this.b);
      j += 1;
    }
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
 * Qualified Name:     org.vidogram.ui.Components.aa
 * JD-Core Version:    0.6.0
 */