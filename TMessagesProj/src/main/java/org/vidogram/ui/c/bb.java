package org.vidogram.ui.c;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.vidogram.messenger.a;
import org.vidogram.messenger.r;
import org.vidogram.ui.Components.v;

public class bb extends FrameLayout
{
  private static Paint e;
  private TextView a;
  private boolean b;
  private int c;
  private Drawable d;

  public bb(Context paramContext)
  {
    super(paramContext);
    if (e == null)
    {
      e = new Paint();
      e.setColor(-2500135);
      e.setStrokeWidth(1.0F);
    }
    this.d = getResources().getDrawable(2130838161);
    this.a = new TextView(paramContext);
    this.a.setTextColor(-14606047);
    this.a.setTextSize(1, 16.0F);
    this.a.setLines(1);
    this.a.setMaxLines(1);
    this.a.setSingleLine(true);
    paramContext = this.a;
    if (r.a)
    {
      i = 5;
      paramContext.setGravity(i | 0x10);
      paramContext = this.a;
      if (!r.a)
        break label167;
    }
    label167: for (int i = j; ; i = 3)
    {
      addView(paramContext, v.a(-1, -1.0F, i | 0x30, 17.0F, 0.0F, 17.0F, 0.0F));
      return;
      i = 3;
      break;
    }
  }

  public void a(String paramString, int paramInt, boolean paramBoolean)
  {
    this.a.setText(paramString);
    this.b = paramBoolean;
    this.c = paramInt;
    this.d.setColorFilter(new PorterDuffColorFilter(paramInt, PorterDuff.Mode.MULTIPLY));
    if ((!this.b) && (this.c == 0));
    for (paramBoolean = true; ; paramBoolean = false)
    {
      setWillNotDraw(paramBoolean);
      invalidate();
      return;
    }
  }

  protected void onDraw(Canvas paramCanvas)
  {
    if (this.b)
      paramCanvas.drawLine(getPaddingLeft(), getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, e);
    int j;
    if ((this.c != 0) && (this.d != null))
    {
      j = (getMeasuredHeight() - this.d.getMinimumHeight()) / 2;
      if (r.a)
        break label133;
    }
    label133: for (int i = getMeasuredWidth() - this.d.getIntrinsicWidth() - a.a(14.5F); ; i = a.a(14.5F))
    {
      this.d.setBounds(i, j, this.d.getIntrinsicWidth() + i, this.d.getIntrinsicHeight() + j);
      this.d.draw(paramCanvas);
      return;
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i = a.a(48.0F);
    if (this.b);
    for (paramInt2 = 1; ; paramInt2 = 0)
    {
      super.onMeasure(paramInt1, View.MeasureSpec.makeMeasureSpec(paramInt2 + i, 1073741824));
      return;
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.c.bb
 * JD-Core Version:    0.6.0
 */