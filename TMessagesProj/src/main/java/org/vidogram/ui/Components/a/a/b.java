package org.vidogram.ui.Components.a.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint.Style;
import android.graphics.PorterDuff.Mode;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.widget.EditText;

public class b extends EditText
{
  private final Canvas a = new Canvas();
  private final TextPaint b = new TextPaint();
  private Bitmap c;
  private boolean d = true;
  private int e = 0;
  private float f;

  public b(Context paramContext)
  {
    super(paramContext);
    this.b.setAntiAlias(true);
    this.b.setStyle(Paint.Style.FILL_AND_STROKE);
  }

  protected void onDraw(Canvas paramCanvas)
  {
    int i;
    int j;
    int k;
    int m;
    Object localObject;
    float f1;
    if ((this.c != null) && (this.e != 0))
      if (this.d)
      {
        i = getMeasuredWidth();
        j = getPaddingLeft();
        k = getPaddingRight();
        m = getMeasuredHeight();
        localObject = getText().toString();
        this.a.setBitmap(this.c);
        this.a.drawColor(0, PorterDuff.Mode.CLEAR);
        if (this.f <= 0.0F)
          break label259;
        f1 = this.f;
      }
    while (true)
    {
      this.b.setStrokeWidth(f1);
      this.b.setColor(this.e);
      this.b.setTextSize(getTextSize());
      this.b.setTypeface(getTypeface());
      this.b.setStyle(Paint.Style.FILL_AND_STROKE);
      localObject = new StaticLayout((CharSequence)localObject, this.b, i - j - k, Layout.Alignment.ALIGN_CENTER, 1.0F, 0.0F, true);
      this.a.save();
      f1 = (m - getPaddingTop() - getPaddingBottom() - ((StaticLayout)localObject).getHeight()) / 2.0F;
      this.a.translate(getPaddingLeft(), f1 + getPaddingTop());
      ((StaticLayout)localObject).draw(this.a);
      this.a.restore();
      this.d = false;
      paramCanvas.drawBitmap(this.c, 0.0F, 0.0F, this.b);
      super.onDraw(paramCanvas);
      return;
      label259: f1 = (float)Math.ceil(getTextSize() / 11.5F);
    }
  }

  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if ((paramInt1 > 0) && (paramInt2 > 0))
    {
      this.d = true;
      this.c = Bitmap.createBitmap(paramInt1, paramInt2, Bitmap.Config.ARGB_8888);
      return;
    }
    this.c = null;
  }

  protected void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    super.onTextChanged(paramCharSequence, paramInt1, paramInt2, paramInt3);
    this.d = true;
  }

  public void setStrokeColor(int paramInt)
  {
    this.e = paramInt;
    this.d = true;
    invalidate();
  }

  public void setStrokeWidth(float paramFloat)
  {
    this.f = paramFloat;
    this.d = true;
    invalidate();
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.Components.a.a.b
 * JD-Core Version:    0.6.0
 */