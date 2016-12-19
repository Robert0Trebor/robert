package org.vidogram.ui.c;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.vidogram.messenger.a;
import org.vidogram.messenger.r;
import org.vidogram.ui.Components.v;

public class bd extends FrameLayout
{
  private static Paint c;
  private TextView a;
  private TextView b;
  private boolean d;
  private boolean e;

  public bd(Context paramContext)
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
    TextView localTextView = this.a;
    if (r.a)
    {
      i = 5;
      localTextView.setGravity(i | 0x10);
      localTextView = this.a;
      if (!r.a)
        break label280;
      i = 5;
      label130: addView(localTextView, v.a(-2, -2.0F, i | 0x30, 17.0F, 10.0F, 17.0F, 0.0F));
      this.b = new TextView(paramContext);
      this.b.setTextColor(-7697782);
      this.b.setTextSize(1, 13.0F);
      paramContext = this.b;
      if (!r.a)
        break label285;
      i = 5;
      label198: paramContext.setGravity(i);
      this.b.setLines(1);
      this.b.setMaxLines(1);
      this.b.setSingleLine(true);
      this.b.setPadding(0, 0, 0, 0);
      paramContext = this.b;
      if (!r.a)
        break label290;
    }
    label280: label285: label290: for (int i = j; ; i = 3)
    {
      addView(paramContext, v.a(-2, -2.0F, i | 0x30, 17.0F, 35.0F, 17.0F, 0.0F));
      return;
      i = 3;
      break;
      i = 3;
      break label130;
      i = 3;
      break label198;
    }
  }

  public void a(String paramString1, String paramString2, boolean paramBoolean)
  {
    this.a.setText(paramString1);
    this.b.setText(paramString2);
    this.d = paramBoolean;
    if (!paramBoolean);
    for (paramBoolean = true; ; paramBoolean = false)
    {
      setWillNotDraw(paramBoolean);
      return;
    }
  }

  protected void onDraw(Canvas paramCanvas)
  {
    if (this.d)
      paramCanvas.drawLine(getPaddingLeft(), getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, c);
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    paramInt2 = 0;
    if (!this.e)
    {
      int i = a.a(64.0F);
      if (this.d)
        paramInt2 = 1;
      super.onMeasure(paramInt1, View.MeasureSpec.makeMeasureSpec(paramInt2 + i, 1073741824));
      return;
    }
    super.onMeasure(paramInt1, View.MeasureSpec.makeMeasureSpec(0, 0));
  }

  public void setMultilineDetail(boolean paramBoolean)
  {
    this.e = paramBoolean;
    if (paramBoolean)
    {
      this.b.setLines(0);
      this.b.setMaxLines(0);
      this.b.setSingleLine(false);
      this.b.setPadding(0, 0, 0, a.a(12.0F));
      return;
    }
    this.b.setLines(1);
    this.b.setMaxLines(1);
    this.b.setSingleLine(true);
    this.b.setPadding(0, 0, 0, 0);
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.c.bd
 * JD-Core Version:    0.6.0
 */