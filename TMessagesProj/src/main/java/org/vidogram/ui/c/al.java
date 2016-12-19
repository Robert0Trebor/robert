package org.vidogram.ui.c;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.vidogram.messenger.a;
import org.vidogram.messenger.r;
import org.vidogram.ui.Components.at;
import org.vidogram.ui.Components.v;

public class al extends FrameLayout
{
  private static Paint d;
  private TextView a;
  private TextView b;
  private at c;
  private boolean e;

  public al(Context paramContext)
  {
    super(paramContext);
    if (d == null)
    {
      d = new Paint();
      d.setColor(-2500135);
      d.setStrokeWidth(1.0F);
    }
    this.c = new at(paramContext);
    this.c.setSize(a.a(20.0F));
    this.c.a(-5000269, -13129232);
    Object localObject = this.c;
    int i;
    label101: float f;
    if (r.a)
    {
      i = 5;
      if (!r.a)
        break label438;
      int j = 0;
      f = j;
      if (!r.a)
        break label445;
      j = 18;
      label115: addView((View)localObject, v.a(22, 22.0F, i | 0x30, f, 10.0F, j, 0.0F));
      this.a = new TextView(paramContext);
      this.a.setTextColor(-14606047);
      this.a.setTextSize(1, 16.0F);
      this.a.setLines(1);
      this.a.setMaxLines(1);
      this.a.setSingleLine(true);
      localObject = this.a;
      if (!r.a)
        break label451;
      i = 5;
      label208: ((TextView)localObject).setGravity(i | 0x10);
      localObject = this.a;
      if (!r.a)
        break label456;
      i = 5;
      label231: if (!r.a)
        break label461;
      int k = 17;
      label241: f = k;
      if (!r.a)
        break label468;
      k = 51;
      label255: addView((View)localObject, v.a(-2, -2.0F, i | 0x30, f, 10.0F, k, 0.0F));
      this.b = new TextView(paramContext);
      this.b.setTextColor(-7697782);
      this.b.setTextSize(1, 13.0F);
      paramContext = this.b;
      if (!r.a)
        break label475;
      i = 5;
      label323: paramContext.setGravity(i);
      this.b.setLines(0);
      this.b.setMaxLines(0);
      this.b.setSingleLine(false);
      this.b.setPadding(0, 0, 0, a.a(12.0F));
      paramContext = this.b;
      if (!r.a)
        break label480;
      i = i2;
      label381: if (!r.a)
        break label485;
    }
    label438: int n;
    label445: label451: label456: label461: label468: label475: label480: label485: for (int m = 17; ; n = 51)
    {
      f = m;
      m = i1;
      if (r.a)
        m = 51;
      addView(paramContext, v.a(-2, -2.0F, i | 0x30, f, 35.0F, m, 0.0F));
      return;
      i = 3;
      break;
      n = 18;
      break label101;
      n = 0;
      break label115;
      i = 3;
      break label208;
      i = 3;
      break label231;
      n = 51;
      break label241;
      n = 17;
      break label255;
      i = 3;
      break label323;
      i = 3;
      break label381;
    }
  }

  public void a(String paramString1, String paramString2, boolean paramBoolean1, boolean paramBoolean2)
  {
    boolean bool = false;
    this.a.setText(paramString1);
    this.b.setText(paramString2);
    this.e = paramBoolean2;
    this.c.a(paramBoolean1, false);
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
    super.onMeasure(paramInt1, View.MeasureSpec.makeMeasureSpec(0, 0));
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.c.al
 * JD-Core Version:    0.6.0
 */