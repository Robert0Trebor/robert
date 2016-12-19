package org.vidogram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.vidogram.messenger.a;
import org.vidogram.tgnet.g.t;

public class u extends Drawable
{
  private byte[] a;
  private Paint b = new Paint();
  private int[] c = { -1, -2758925, -13805707, -13657655 };

  private int a(int paramInt)
  {
    return this.a[(paramInt / 8)] >> paramInt % 8 & 0x3;
  }

  public void a(g.t paramt)
  {
    this.a = paramt.s;
    if (this.a == null)
    {
      byte[] arrayOfByte = a.b(paramt.l);
      this.a = arrayOfByte;
      paramt.s = arrayOfByte;
    }
    invalidateSelf();
  }

  public void draw(Canvas paramCanvas)
  {
    if (this.a == null);
    while (true)
    {
      return;
      int k;
      int m;
      if (this.a.length == 16)
      {
        f1 = (float)Math.floor(Math.min(getBounds().width(), getBounds().height()) / 8.0F);
        f2 = Math.max(0.0F, (getBounds().width() - f1 * 8.0F) / 2.0F);
        f3 = Math.max(0.0F, (getBounds().height() - f1 * 8.0F) / 2.0F);
        i = 0;
        j = 0;
        while (i < 8)
        {
          k = 0;
          while (k < 8)
          {
            m = Math.abs(a(j));
            this.b.setColor(this.c[(m % 4)]);
            paramCanvas.drawRect(f2 + k * f1, i * f1 + f3, k * f1 + f2 + f1, i * f1 + f1 + f3, this.b);
            k += 1;
            j += 2;
          }
          i += 1;
        }
        continue;
      }
      float f1 = (float)Math.floor(Math.min(getBounds().width(), getBounds().height()) / 12.0F);
      float f2 = Math.max(0.0F, (getBounds().width() - f1 * 12.0F) / 2.0F);
      float f3 = Math.max(0.0F, (getBounds().height() - f1 * 12.0F) / 2.0F);
      int j = 0;
      int i = 0;
      while (j < 12)
      {
        k = 0;
        while (k < 12)
        {
          m = Math.abs(a(i));
          this.b.setColor(this.c[(m % 4)]);
          paramCanvas.drawRect(f2 + k * f1, j * f1 + f3, k * f1 + f2 + f1, j * f1 + f1 + f3, this.b);
          k += 1;
          i += 2;
        }
        j += 1;
      }
    }
  }

  public int getIntrinsicHeight()
  {
    return a.a(32.0F);
  }

  public int getIntrinsicWidth()
  {
    return a.a(32.0F);
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
 * Qualified Name:     org.vidogram.ui.Components.u
 * JD-Core Version:    0.6.0
 */