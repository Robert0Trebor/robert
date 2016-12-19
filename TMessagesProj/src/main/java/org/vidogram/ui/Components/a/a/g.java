package org.vidogram.ui.Components.a.a;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build.VERSION;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import org.vidogram.messenger.a;
import org.vidogram.ui.Components.a.n;
import org.vidogram.ui.Components.ap;
import org.vidogram.ui.Components.av;
import org.vidogram.ui.Components.v;

public class g extends d
{
  private b c;
  private n d;
  private boolean e;
  private int f;

  public g(Context paramContext, g paramg, ap paramap)
  {
    this(paramContext, paramap, paramg.f, paramg.getText(), paramg.getSwatch(), paramg.e);
    setRotation(paramg.getRotation());
    setScale(paramg.getScale());
  }

  public g(Context paramContext, ap paramap, int paramInt, String paramString, n paramn, boolean paramBoolean)
  {
    super(paramContext, paramap);
    this.f = paramInt;
    this.c = new b(paramContext);
    this.c.setBackgroundColor(0);
    this.c.setPadding(a.a(7.0F), a.a(7.0F), a.a(7.0F), a.a(7.0F));
    this.c.setClickable(false);
    this.c.setEnabled(false);
    this.c.setTextSize(0, this.f);
    this.c.setText(paramString);
    this.c.setTextColor(paramn.a);
    this.c.setTypeface(null, 1);
    this.c.setGravity(17);
    this.c.setHorizontallyScrolling(false);
    this.c.setImeOptions(268435456);
    this.c.setFocusableInTouchMode(true);
    this.c.setInputType(this.c.getInputType() | 0x4000);
    addView(this.c, v.b(-2, -2, 51));
    if (Build.VERSION.SDK_INT >= 23)
      this.c.setBreakStrategy(0);
    setSwatch(paramn);
    setStroke(paramBoolean);
    a();
    this.c.addTextChangedListener(new TextWatcher()
    {
      private String b;
      private int c = 0;

      public void afterTextChanged(Editable paramEditable)
      {
        g.a(g.this).removeTextChangedListener(this);
        if (g.a(g.this).getLineCount() > 9)
        {
          g.a(g.this).setText(this.b);
          g.a(g.this).setSelection(this.c);
        }
        g.a(g.this).addTextChangedListener(this);
      }

      public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
      {
        this.b = paramCharSequence.toString();
        this.c = paramInt1;
      }

      public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
      {
      }
    });
  }

  private void h()
  {
    if (this.e)
    {
      this.c.setTextColor(-1);
      this.c.setStrokeColor(this.d.a);
      this.c.setShadowLayer(0.0F, 0.0F, 0.0F, 0);
      return;
    }
    this.c.setTextColor(this.d.a);
    this.c.setStrokeColor(0);
    this.c.setShadowLayer(8.0F, 0.0F, 2.0F, -1442840576);
  }

  public void e()
  {
    this.c.setEnabled(true);
    this.c.setClickable(true);
    this.c.requestFocus();
    this.c.setSelection(this.c.getText().length());
  }

  public void f()
  {
    this.c.clearFocus();
    this.c.setEnabled(false);
    this.c.setClickable(false);
    c();
  }

  protected a g()
  {
    return new a(getContext());
  }

  public View getFocusedView()
  {
    return this.c;
  }

  protected av getSelectionBounds()
  {
    float f1 = ((ViewGroup)getParent()).getScaleX();
    float f2 = getWidth() * getScale() + a.a(46.0F) / f1;
    float f3 = getHeight() * getScale() + a.a(20.0F) / f1;
    return new av((this.a.a - f2 / 2.0F) * f1, (this.a.b - f3 / 2.0F) * f1, f2 * f1, f1 * f3);
  }

  public n getSwatch()
  {
    return this.d;
  }

  public String getText()
  {
    return this.c.getText().toString();
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    a();
  }

  public void setMaxWidth(int paramInt)
  {
    this.c.setMaxWidth(paramInt);
  }

  public void setStroke(boolean paramBoolean)
  {
    this.e = paramBoolean;
    h();
  }

  public void setSwatch(n paramn)
  {
    this.d = paramn;
    h();
  }

  public void setText(String paramString)
  {
    this.c.setText(paramString);
  }

  public class a extends d.b
  {
    public a(Context arg2)
    {
      super(localContext);
    }

    protected int a(float paramFloat1, float paramFloat2)
    {
      float f2 = a.a(1.0F);
      float f1 = a.a(19.5F);
      f2 += f1;
      float f3 = getWidth() - f2 * 2.0F;
      float f4 = getHeight() - f2 * 2.0F;
      float f5 = f4 / 2.0F + f2;
      if ((paramFloat1 > f2 - f1) && (paramFloat2 > f5 - f1) && (paramFloat1 < f2 + f1) && (paramFloat2 < f5 + f1))
        return 1;
      if ((paramFloat1 > f2 + f3 - f1) && (paramFloat2 > f5 - f1) && (paramFloat1 < f2 + f3 + f1) && (paramFloat2 < f1 + f5))
        return 2;
      if ((paramFloat1 > f2) && (paramFloat1 < f3) && (paramFloat2 > f2) && (paramFloat2 < f4))
        return 3;
      return 0;
    }

    protected void onDraw(Canvas paramCanvas)
    {
      super.onDraw(paramCanvas);
      float f1 = a.a(3.0F);
      float f2 = a.a(3.0F);
      float f3 = a.a(1.0F);
      float f4 = a.a(4.5F);
      float f5 = f4 + f3 + a.a(15.0F);
      float f6 = getWidth() - 2.0F * f5;
      float f7 = getHeight() - 2.0F * f5;
      int j = (int)Math.floor(f6 / (f1 + f2));
      float f8 = (float)Math.ceil((f6 - j * (f1 + f2) + f1) / 2.0F);
      int i = 0;
      float f9;
      while (i < j)
      {
        f9 = i * (f2 + f1) + (f8 + f5);
        paramCanvas.drawRect(f9, f5 - f3 / 2.0F, f9 + f2, f5 + f3 / 2.0F, this.a);
        paramCanvas.drawRect(f9, f5 + f7 - f3 / 2.0F, f9 + f2, f3 / 2.0F + (f5 + f7), this.a);
        i += 1;
      }
      j = (int)Math.floor(f7 / (f1 + f2));
      f8 = (float)Math.ceil((f7 - j * (f1 + f2) + f1) / 2.0F);
      i = 0;
      while (i < j)
      {
        f9 = f8 + f5 + i * (f2 + f1);
        paramCanvas.drawRect(f5 - f3 / 2.0F, f9, f5 + f3 / 2.0F, f9 + f2, this.a);
        paramCanvas.drawRect(f5 + f6 - f3 / 2.0F, f9, f3 / 2.0F + (f5 + f6), f9 + f2, this.a);
        i += 1;
      }
      paramCanvas.drawCircle(f5, f7 / 2.0F + f5, f4, this.b);
      paramCanvas.drawCircle(f5, f7 / 2.0F + f5, f4, this.c);
      paramCanvas.drawCircle(f5 + f6, f7 / 2.0F + f5, f4, this.b);
      paramCanvas.drawCircle(f5 + f6, f7 / 2.0F + f5, f4, this.c);
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.Components.a.a.g
 * JD-Core Version:    0.6.0
 */