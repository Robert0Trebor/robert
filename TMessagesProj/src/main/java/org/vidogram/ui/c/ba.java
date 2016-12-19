package org.vidogram.ui.c;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextUtils.TruncateAt;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import org.vidogram.messenger.a;
import org.vidogram.messenger.r;
import org.vidogram.ui.Components.bm;
import org.vidogram.ui.Components.v;

public class ba extends FrameLayout
{
  private static Paint d;
  private TextView a;
  private TextView b;
  private bm c;
  private boolean e;
  private boolean f;

  public ba(Context paramContext)
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
    TextView localTextView = this.a;
    label141: float f1;
    label150: float f2;
    if (r.a)
    {
      i = 5;
      localTextView.setGravity(i | 0x10);
      this.a.setEllipsize(TextUtils.TruncateAt.END);
      localTextView = this.a;
      if (!r.a)
        break label422;
      i = 5;
      if (!r.a)
        break label428;
      f1 = 64.0F;
      if (!r.a)
        break label434;
      f2 = 17.0F;
      label159: addView(localTextView, v.a(-1, -1.0F, i | 0x30, f1, 0.0F, f2, 0.0F));
      this.b = new TextView(paramContext);
      this.b.setTextColor(-7697782);
      this.b.setTextSize(1, 13.0F);
      localTextView = this.b;
      if (!r.a)
        break label440;
      i = 5;
      label226: localTextView.setGravity(i);
      this.b.setLines(1);
      this.b.setMaxLines(1);
      this.b.setSingleLine(true);
      this.b.setPadding(0, 0, 0, 0);
      this.b.setEllipsize(TextUtils.TruncateAt.END);
      localTextView = this.b;
      if (!r.a)
        break label446;
      i = 5;
      label293: if (!r.a)
        break label452;
      f1 = 64.0F;
      label302: if (!r.a)
        break label458;
      f2 = 17.0F;
      label311: addView(localTextView, v.a(-2, -2.0F, i | 0x30, f1, 35.0F, f2, 0.0F));
      this.c = new bm(paramContext);
      this.c.setDuplicateParentStateEnabled(false);
      this.c.setFocusable(false);
      this.c.setFocusableInTouchMode(false);
      this.c.setClickable(false);
      paramContext = this.c;
      if (!r.a)
        break label464;
    }
    label422: label428: label434: label440: label446: label452: label458: label464: for (int i = 3; ; i = 5)
    {
      addView(paramContext, v.a(-2, -2.0F, i | 0x10, 14.0F, 0.0F, 14.0F, 0.0F));
      return;
      i = 3;
      break;
      i = 3;
      break label141;
      f1 = 17.0F;
      break label150;
      f2 = 64.0F;
      break label159;
      i = 3;
      break label226;
      i = 3;
      break label293;
      f1 = 17.0F;
      break label302;
      f2 = 64.0F;
      break label311;
    }
  }

  public void a(String paramString1, String paramString2, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    this.a.setText(paramString1);
    this.b.setText(paramString2);
    this.c.setChecked(paramBoolean1);
    this.e = paramBoolean3;
    this.b.setVisibility(0);
    this.f = paramBoolean2;
    if (paramBoolean2)
    {
      this.b.setLines(0);
      this.b.setMaxLines(0);
      this.b.setSingleLine(false);
      this.b.setEllipsize(null);
      this.b.setPadding(0, 0, 0, a.a(11.0F));
      paramString1 = (FrameLayout.LayoutParams)this.a.getLayoutParams();
      paramString1.height = -2;
      paramString1.topMargin = a.a(10.0F);
      this.a.setLayoutParams(paramString1);
      if (paramBoolean3)
        break label191;
    }
    label191: for (paramBoolean1 = true; ; paramBoolean1 = false)
    {
      setWillNotDraw(paramBoolean1);
      return;
      this.b.setLines(1);
      this.b.setMaxLines(1);
      this.b.setSingleLine(true);
      this.b.setEllipsize(TextUtils.TruncateAt.END);
      this.b.setPadding(0, 0, 0, 0);
      break;
    }
  }

  public void a(String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.a.setText(paramString);
    this.f = false;
    this.c.setChecked(paramBoolean1);
    this.e = paramBoolean2;
    this.b.setVisibility(8);
    paramString = (FrameLayout.LayoutParams)this.a.getLayoutParams();
    paramString.height = -1;
    paramString.topMargin = 0;
    this.a.setLayoutParams(paramString);
    if (!paramBoolean2);
    for (paramBoolean1 = true; ; paramBoolean1 = false)
    {
      setWillNotDraw(paramBoolean1);
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
    if (this.f)
    {
      super.onMeasure(paramInt1, View.MeasureSpec.makeMeasureSpec(0, 0));
      return;
    }
    float f1;
    int i;
    if (this.b.getVisibility() == 0)
    {
      f1 = 64.0F;
      i = a.a(f1);
      if (!this.e)
        break label67;
    }
    label67: for (paramInt2 = 1; ; paramInt2 = 0)
    {
      super.onMeasure(paramInt1, View.MeasureSpec.makeMeasureSpec(paramInt2 + i, 1073741824));
      return;
      f1 = 48.0F;
      break;
    }
  }

  public void setChecked(boolean paramBoolean)
  {
    this.c.setChecked(paramBoolean);
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.c.ba
 * JD-Core Version:    0.6.0
 */