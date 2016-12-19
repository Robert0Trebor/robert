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
import org.vidogram.ui.Components.j;
import org.vidogram.ui.Components.v;

public class l extends FrameLayout
{
  private static Paint d;
  private TextView a;
  private TextView b;
  private j c;
  private boolean e;

  public l(Context paramContext)
  {
    super(paramContext);
    if (d == null)
    {
      d = new Paint();
      d.setColor(-2500135);
      d.setStrokeWidth(1.0F);
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
    label145: label155: float f;
    if (r.a)
    {
      i = 5;
      localTextView.setGravity(i | 0x10);
      localTextView = this.a;
      if (!r.a)
        break label394;
      i = 5;
      if (!r.a)
        break label399;
      int j = 17;
      f = j;
      if (!r.a)
        break label406;
      j = 46;
      label169: addView(localTextView, v.a(-1, -1.0F, i | 0x30, f, 0.0F, j, 0.0F));
      this.b = new TextView(paramContext);
      this.b.setTextColor(-13660983);
      this.b.setTextSize(1, 16.0F);
      this.b.setLines(1);
      this.b.setMaxLines(1);
      this.b.setSingleLine(true);
      this.b.setEllipsize(TextUtils.TruncateAt.END);
      localTextView = this.b;
      if (!r.a)
        break label413;
      i = 3;
      label270: localTextView.setGravity(i | 0x10);
      localTextView = this.b;
      if (!r.a)
        break label418;
      i = 3;
      label293: addView(localTextView, v.a(-2, -1.0F, i | 0x30, 17.0F, 0.0F, 17.0F, 0.0F));
      this.c = new j(paramContext);
      paramContext = this.c;
      if (!r.a)
        break label423;
      i = i1;
      label342: if (!r.a)
        break label428;
      k = 0;
      label351: f = k;
      if (!r.a)
        break label435;
    }
    label394: label399: int m;
    label406: label413: label418: label423: label428: label435: for (int k = n; ; m = 0)
    {
      addView(paramContext, v.a(18, 18.0F, i | 0x30, f, 15.0F, k, 0.0F));
      return;
      i = 3;
      break;
      i = 3;
      break label145;
      m = 46;
      break label155;
      m = 17;
      break label169;
      i = 5;
      break label270;
      i = 5;
      break label293;
      i = 3;
      break label342;
      m = 17;
      break label351;
    }
  }

  public void a(String paramString1, String paramString2, boolean paramBoolean1, boolean paramBoolean2)
  {
    boolean bool = false;
    this.a.setText(paramString1);
    this.c.a(paramBoolean1, false);
    this.b.setText(paramString2);
    this.e = paramBoolean2;
    paramBoolean1 = bool;
    if (!paramBoolean2)
      paramBoolean1 = true;
    setWillNotDraw(paramBoolean1);
  }

  public void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    this.c.a(paramBoolean1, paramBoolean2);
  }

  protected void onDraw(Canvas paramCanvas)
  {
    if (this.e)
      paramCanvas.drawLine(getPaddingLeft(), getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, d);
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    paramInt2 = View.MeasureSpec.getSize(paramInt1);
    int i = a.a(48.0F);
    if (this.e);
    for (paramInt1 = 1; ; paramInt1 = 0)
    {
      setMeasuredDimension(paramInt2, paramInt1 + i);
      paramInt1 = getMeasuredWidth() - getPaddingLeft() - getPaddingRight() - a.a(34.0F);
      this.b.measure(View.MeasureSpec.makeMeasureSpec(paramInt1 / 2, -2147483648), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
      this.a.measure(View.MeasureSpec.makeMeasureSpec(paramInt1 - this.b.getMeasuredWidth() - a.a(8.0F), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
      this.c.measure(View.MeasureSpec.makeMeasureSpec(a.a(18.0F), -2147483648), View.MeasureSpec.makeMeasureSpec(a.a(18.0F), 1073741824));
      return;
    }
  }

  public void setTextColor(int paramInt)
  {
    this.a.setTextColor(paramInt);
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.c.l
 * JD-Core Version:    0.6.0
 */