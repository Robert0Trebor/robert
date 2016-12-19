package org.vidogram.ui.c;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View.MeasureSpec;
import org.vidogram.messenger.a;

public class o extends e
{
  private static Paint a;

  public o(Context paramContext)
  {
    super(paramContext);
    if (a == null)
    {
      a = new Paint();
      a.setColor(-2500135);
      a.setStrokeWidth(1.0F);
    }
  }

  protected void onDraw(Canvas paramCanvas)
  {
    paramCanvas.drawLine(getPaddingLeft(), a.a(8.0F), getWidth() - getPaddingRight(), a.a(8.0F), a);
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    setMeasuredDimension(View.MeasureSpec.getSize(paramInt1), a.a(16.0F) + 1);
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.c.o
 * JD-Core Version:    0.6.0
 */