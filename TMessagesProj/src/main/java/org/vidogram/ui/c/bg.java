package org.vidogram.ui.c;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextUtils.TruncateAt;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.TextView;
import org.vidogram.messenger.a;
import org.vidogram.messenger.r;
import org.vidogram.ui.Components.v;

public class bg extends FrameLayout
{
  private static Paint d;
  private TextView a;
  private TextView b;
  private ImageView c;
  private boolean e;

  public bg(Context paramContext)
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
    if (r.a)
    {
      i = 5;
      localTextView.setGravity(i | 0x10);
      localTextView = this.a;
      if (!r.a)
        break label358;
      i = 5;
      label140: addView(localTextView, v.a(-1, -1.0F, i | 0x30, 17.0F, 0.0F, 17.0F, 0.0F));
      this.b = new TextView(paramContext);
      this.b.setTextColor(-13660983);
      this.b.setTextSize(1, 16.0F);
      this.b.setLines(1);
      this.b.setMaxLines(1);
      this.b.setSingleLine(true);
      this.b.setEllipsize(TextUtils.TruncateAt.END);
      localTextView = this.b;
      if (!r.a)
        break label363;
      i = 3;
      label241: localTextView.setGravity(i | 0x10);
      localTextView = this.b;
      if (!r.a)
        break label368;
      i = 3;
      label264: addView(localTextView, v.a(-2, -1.0F, i | 0x30, 17.0F, 0.0F, 17.0F, 0.0F));
      this.c = new ImageView(paramContext);
      this.c.setScaleType(ImageView.ScaleType.CENTER);
      this.c.setVisibility(4);
      paramContext = this.c;
      if (!r.a)
        break label373;
    }
    label358: label363: label368: label373: for (int i = j; ; i = 5)
    {
      addView(paramContext, v.a(-2, -2.0F, i | 0x10, 17.0F, 0.0F, 17.0F, 0.0F));
      return;
      i = 3;
      break;
      i = 3;
      break label140;
      i = 5;
      break label241;
      i = 5;
      break label264;
    }
  }

  public void a(String paramString, int paramInt, boolean paramBoolean)
  {
    boolean bool = false;
    this.a.setText(paramString);
    this.b.setVisibility(4);
    if (paramInt != 0)
    {
      this.c.setVisibility(0);
      this.c.setImageResource(paramInt);
    }
    while (true)
    {
      this.e = paramBoolean;
      if (!paramBoolean)
        bool = true;
      setWillNotDraw(bool);
      return;
      this.c.setVisibility(4);
    }
  }

  public void a(String paramString1, String paramString2, boolean paramBoolean)
  {
    boolean bool = false;
    this.a.setText(paramString1);
    this.c.setVisibility(4);
    if (paramString2 != null)
    {
      this.b.setText(paramString2);
      this.b.setVisibility(0);
    }
    while (true)
    {
      this.e = paramBoolean;
      if (!paramBoolean)
        bool = true;
      setWillNotDraw(bool);
      requestLayout();
      return;
      this.b.setVisibility(4);
    }
  }

  public void a(String paramString, boolean paramBoolean)
  {
    this.a.setText(paramString);
    this.b.setVisibility(4);
    this.c.setVisibility(4);
    this.e = paramBoolean;
    if (!paramBoolean);
    for (paramBoolean = true; ; paramBoolean = false)
    {
      setWillNotDraw(paramBoolean);
      return;
    }
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
      paramInt2 = getMeasuredWidth() - getPaddingLeft() - getPaddingRight() - a.a(34.0F);
      i = paramInt2 / 2;
      if (this.c.getVisibility() == 0)
        this.c.measure(View.MeasureSpec.makeMeasureSpec(i, -2147483648), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
      paramInt1 = paramInt2;
      if (this.b.getVisibility() == 0)
      {
        this.b.measure(View.MeasureSpec.makeMeasureSpec(i, -2147483648), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
        paramInt1 = paramInt2 - this.b.getMeasuredWidth() - a.a(8.0F);
      }
      this.a.measure(View.MeasureSpec.makeMeasureSpec(paramInt1, 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
      return;
    }
  }

  public void setTextColor(int paramInt)
  {
    this.a.setTextColor(paramInt);
  }

  public void setTextValueColor(int paramInt)
  {
    this.b.setTextColor(paramInt);
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.c.bg
 * JD-Core Version:    0.6.0
 */