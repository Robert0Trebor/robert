package org.vidogram.ui.c;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.vidogram.messenger.r;
import org.vidogram.ui.Components.v;

public class ay extends FrameLayout
{
  private static Paint b;
  private TextView a;
  private boolean c;

  public ay(Context paramContext)
  {
    super(paramContext);
    if (b == null)
    {
      b = new Paint();
      b.setColor(-2500135);
      b.setStrokeWidth(1.0F);
    }
    this.a = new TextView(paramContext);
    this.a.setTextColor(-14606047);
    this.a.setTextSize(1, 16.0F);
    paramContext = this.a;
    if (r.a)
    {
      i = 5;
      paramContext.setGravity(i | 0x10);
      paramContext = this.a;
      if (!r.a)
        break label132;
    }
    label132: for (int i = j; ; i = 3)
    {
      addView(paramContext, v.a(-1, -2.0F, i | 0x30, 17.0F, 10.0F, 17.0F, 10.0F));
      return;
      i = 3;
      break;
    }
  }

  public void a(String paramString, boolean paramBoolean)
  {
    this.a.setText(paramString);
    this.c = paramBoolean;
    if (!paramBoolean);
    for (paramBoolean = true; ; paramBoolean = false)
    {
      setWillNotDraw(paramBoolean);
      return;
    }
  }

  protected void onDraw(Canvas paramCanvas)
  {
    if (this.c)
      paramCanvas.drawLine(getPaddingLeft(), getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, b);
  }

  public void setTextColor(int paramInt)
  {
    this.a.setTextColor(paramInt);
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.c.ay
 * JD-Core Version:    0.6.0
 */