package org.vidogram.ui.c;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextUtils.TruncateAt;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.vidogram.messenger.a;
import org.vidogram.messenger.r;
import org.vidogram.ui.Components.at;
import org.vidogram.ui.Components.v;

public class am extends FrameLayout
{
  private static Paint c;
  private TextView a;
  private at b;
  private boolean d;

  public am(Context paramContext)
  {
    super(paramContext);
    if (c == null)
    {
      c = new Paint();
      c.setColor(-2500135);
      c.setStrokeWidth(1.0F);
    }
    this.a = new TextView(paramContext);
    this.a.setTextColor(-14606047);
    this.a.setTextSize(1, 16.0F);
    this.a.setLines(1);
    this.a.setMaxLines(1);
    this.a.setSingleLine(true);
    this.a.setEllipsize(TextUtils.TruncateAt.END);
    TextView localTextView = this.a;
    int i;
    label141: label212: label222: float f;
    if (r.a)
    {
      i = 5;
      localTextView.setGravity(i | 0x10);
      localTextView = this.a;
      if (!r.a)
        break label264;
      i = 5;
      addView(localTextView, v.a(-1, -1.0F, i | 0x30, 17.0F, 0.0F, 17.0F, 0.0F));
      this.b = new at(paramContext);
      this.b.setSize(a.a(20.0F));
      this.b.a(-5000269, -13129232);
      paramContext = this.b;
      if (!r.a)
        break label269;
      i = j;
      if (!r.a)
        break label274;
      j = 18;
      f = j;
      if (!r.a)
        break label280;
    }
    label264: label269: label274: int k;
    label280: for (j = 0; ; k = 18)
    {
      addView(paramContext, v.a(22, 22.0F, i | 0x30, f, 13.0F, j, 0.0F));
      return;
      i = 3;
      break;
      i = 3;
      break label141;
      i = 5;
      break label212;
      k = 0;
      break label222;
    }
  }

  public void a(String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    boolean bool = false;
    this.a.setText(paramString);
    this.b.a(paramBoolean1, false);
    this.d = paramBoolean2;
    paramBoolean1 = bool;
    if (!paramBoolean2)
      paramBoolean1 = true;
    setWillNotDraw(paramBoolean1);
  }

  public void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    this.b.a(paramBoolean1, paramBoolean2);
  }

  protected void onDraw(Canvas paramCanvas)
  {
    if (this.d)
      paramCanvas.drawLine(getPaddingLeft(), getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, c);
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    paramInt2 = View.MeasureSpec.getSize(paramInt1);
    int i = a.a(48.0F);
    if (this.d);
    for (paramInt1 = 1; ; paramInt1 = 0)
    {
      setMeasuredDimension(paramInt2, paramInt1 + i);
      paramInt1 = getMeasuredWidth();
      paramInt2 = getPaddingLeft();
      i = getPaddingRight();
      int j = a.a(34.0F);
      this.b.measure(View.MeasureSpec.makeMeasureSpec(a.a(22.0F), -2147483648), View.MeasureSpec.makeMeasureSpec(a.a(22.0F), 1073741824));
      this.a.measure(View.MeasureSpec.makeMeasureSpec(paramInt1 - paramInt2 - i - j, 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
      return;
    }
  }

  public void setTextColor(int paramInt)
  {
    this.a.setTextColor(paramInt);
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.c.am
 * JD-Core Version:    0.6.0
 */