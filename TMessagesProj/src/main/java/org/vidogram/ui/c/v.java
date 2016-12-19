package org.vidogram.ui.c;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.view.MotionEvent;
import android.view.View.MeasureSpec;
import android.widget.TextView;
import org.vidogram.messenger.a;

public class v extends TextView
{
  private static Paint b;
  private boolean a;

  public v(Context paramContext)
  {
    super(paramContext);
    setGravity(16);
    setPadding(a.a(16.0F), 0, a.a(16.0F), 0);
    setTextSize(1, 17.0F);
    setTextColor(-16777216);
    if (b == null)
    {
      b = new Paint();
      b.setColor(-2302756);
    }
    setBackgroundResource(2130837946);
  }

  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    if (this.a)
      paramCanvas.drawLine(0.0F, getHeight() - 1, getWidth(), getHeight() - 1, b);
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    setMeasuredDimension(View.MeasureSpec.getSize(paramInt1), a.a(48.0F) + 1);
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if ((Build.VERSION.SDK_INT >= 21) && (getBackground() != null) && ((paramMotionEvent.getAction() == 0) || (paramMotionEvent.getAction() == 2)))
      getBackground().setHotspot(paramMotionEvent.getX(), paramMotionEvent.getY());
    return super.onTouchEvent(paramMotionEvent);
  }

  public void setNeedDivider(boolean paramBoolean)
  {
    this.a = paramBoolean;
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.c.v
 * JD-Core Version:    0.6.0
 */