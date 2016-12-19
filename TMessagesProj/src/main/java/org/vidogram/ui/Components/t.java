package org.vidogram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;
import android.widget.EditText;
import org.vidogram.messenger.a;

public class t extends EditText
{
  private String a;
  private float b;
  private float c;
  private float d;
  private Paint e = new Paint();
  private Rect f = new Rect();

  public t(Context paramContext)
  {
    super(paramContext);
    this.e.setColor(-6842473);
  }

  public void a()
  {
    float f1;
    if (length() > 0)
      f1 = getPaint().measureText(getText(), 0, length());
    while (true)
    {
      this.b = f1;
      this.c = getPaint().measureText(" ");
      this.d = getPaint().measureText("1");
      invalidate();
      return;
      f1 = 0.0F;
    }
  }

  public String getHintText()
  {
    return this.a;
  }

  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    if ((this.a != null) && (length() < this.a.length()))
    {
      int j = getMeasuredHeight() / 2;
      float f1 = this.b;
      int i = length();
      if (i < this.a.length())
      {
        if (this.a.charAt(i) == ' ')
          f1 += this.c;
        while (true)
        {
          i += 1;
          break;
          this.f.set((int)f1 + a.a(1.0F), j, (int)(this.d + f1) - a.a(1.0F), a.a(2.0F) + j);
          paramCanvas.drawRect(this.f, this.e);
          f1 += this.d;
        }
      }
    }
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    a();
  }

  public void setHintText(String paramString)
  {
    this.a = paramString;
    a();
    setText(getText());
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.Components.t
 * JD-Core Version:    0.6.0
 */