package org.vidogram.ui.a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.text.Layout;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.view.View;
import android.view.View.MeasureSpec;
import org.vidogram.messenger.a;

public class k extends View
  implements Drawable.Callback
{
  private Layout a;
  private TextPaint b = new TextPaint(1);
  private int c = 51;
  private CharSequence d;
  private Drawable e;
  private Drawable f;
  private int g = a.a(4.0F);
  private int h;
  private int i;
  private int j;
  private int k;
  private int l;
  private boolean m;

  public k(Context paramContext)
  {
    super(paramContext);
  }

  private void a(int paramInt)
  {
    if (this.a.getLineCount() > 0)
    {
      this.k = (int)Math.ceil(this.a.getLineWidth(0));
      this.l = this.a.getLineBottom(0);
      if ((this.c & 0x7) == 3)
        this.j = (-(int)this.a.getLineLeft(0));
    }
    else
    {
      return;
    }
    if (this.a.getLineLeft(0) == 0.0F)
    {
      this.j = (paramInt - this.k);
      return;
    }
    this.j = (-a.a(8.0F));
  }

  private boolean a()
  {
    if (this.m)
      return b(getMeasuredWidth());
    requestLayout();
    return true;
  }

  private boolean b(int paramInt)
  {
    if (this.d != null);
    try
    {
      if (this.e != null)
      {
        paramInt = paramInt - this.e.getIntrinsicWidth() - this.g;
        int n = paramInt;
        if (this.f != null)
          n = paramInt - this.f.getIntrinsicWidth() - this.g;
        paramInt = n - (getPaddingLeft() + getPaddingRight());
        CharSequence localCharSequence = TextUtils.ellipsize(this.d, this.b, paramInt, TextUtils.TruncateAt.END);
        if ((this.a != null) && (TextUtils.equals(this.a.getText(), localCharSequence)))
        {
          a(paramInt);
          return false;
        }
        this.a = new StaticLayout(localCharSequence, 0, localCharSequence.length(), this.b, a.a(8.0F) + paramInt, Layout.Alignment.ALIGN_NORMAL, 1.0F, 0.0F, false);
        a(paramInt);
        while (true)
        {
          invalidate();
          return true;
          this.a = null;
          this.k = 0;
          this.l = 0;
        }
      }
    }
    catch (Exception localException)
    {
      while (true)
        continue;
    }
  }

  public Paint getPaint()
  {
    return this.b;
  }

  public int getSideDrawablesSize()
  {
    int n = 0;
    if (this.e != null)
      n = 0 + (this.e.getIntrinsicWidth() + this.g);
    int i1 = n;
    if (this.f != null)
      i1 = n + (this.f.getIntrinsicWidth() + this.g);
    return i1;
  }

  public CharSequence getText()
  {
    if (this.d == null)
      return "";
    return this.d;
  }

  public int getTextHeight()
  {
    return this.l;
  }

  public int getTextWidth()
  {
    return this.k;
  }

  public boolean hasOverlappingRendering()
  {
    return false;
  }

  public void invalidateDrawable(Drawable paramDrawable)
  {
    if (paramDrawable == this.e)
      invalidate(this.e.getBounds());
    do
      return;
    while (paramDrawable != this.f);
    invalidate(this.f.getBounds());
  }

  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    this.m = false;
  }

  protected void onDraw(Canvas paramCanvas)
  {
    int i1 = 0;
    int n = i1;
    if (this.e != null)
    {
      n = (this.l - this.e.getIntrinsicHeight()) / 2 + this.h;
      this.e.setBounds(0, n, this.e.getIntrinsicWidth(), this.e.getIntrinsicHeight() + n);
      this.e.draw(paramCanvas);
      n = i1;
      if ((this.c & 0x7) == 3)
        n = 0 + (this.g + this.e.getIntrinsicWidth());
    }
    if (this.f != null)
    {
      int i2 = this.k + n + this.g;
      i1 = i2;
      if (this.e != null)
        i1 = i2 + (this.g + this.e.getIntrinsicWidth());
      i2 = (this.l - this.f.getIntrinsicHeight()) / 2 + this.i;
      this.f.setBounds(i1, i2, this.f.getIntrinsicWidth() + i1, this.f.getIntrinsicHeight() + i2);
      this.f.draw(paramCanvas);
    }
    if (this.a != null)
    {
      if (this.j + n != 0)
      {
        paramCanvas.save();
        paramCanvas.translate(this.j + n, 0.0F);
      }
      this.a.draw(paramCanvas);
      if (n + this.j != 0)
        paramCanvas.restore();
    }
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.m = true;
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int n = View.MeasureSpec.getSize(paramInt1);
    paramInt1 = View.MeasureSpec.getSize(paramInt2);
    b(n - getPaddingLeft() - getPaddingRight());
    if (View.MeasureSpec.getMode(paramInt2) == 1073741824);
    while (true)
    {
      setMeasuredDimension(n, paramInt1);
      return;
      paramInt1 = this.l;
    }
  }

  public void setDrawablePadding(int paramInt)
  {
    if (this.g == paramInt);
    do
    {
      return;
      this.g = paramInt;
    }
    while (a());
    invalidate();
  }

  public void setGravity(int paramInt)
  {
    this.c = paramInt;
  }

  public void setLeftDrawable(int paramInt)
  {
    if (paramInt == 0);
    for (Drawable localDrawable = null; ; localDrawable = getContext().getResources().getDrawable(paramInt))
    {
      setLeftDrawable(localDrawable);
      return;
    }
  }

  public void setLeftDrawable(Drawable paramDrawable)
  {
    if (this.e == paramDrawable);
    do
    {
      return;
      if (this.e != null)
        this.e.setCallback(null);
      this.e = paramDrawable;
      if (paramDrawable == null)
        continue;
      paramDrawable.setCallback(this);
    }
    while (a());
    invalidate();
  }

  public void setLeftDrawableTopPadding(int paramInt)
  {
    this.h = paramInt;
  }

  public void setRightDrawable(int paramInt)
  {
    if (paramInt == 0);
    for (Drawable localDrawable = null; ; localDrawable = getContext().getResources().getDrawable(paramInt))
    {
      setRightDrawable(localDrawable);
      return;
    }
  }

  public void setRightDrawable(Drawable paramDrawable)
  {
    if (this.f == paramDrawable);
    do
    {
      return;
      if (this.f != null)
        this.f.setCallback(null);
      this.f = paramDrawable;
      if (paramDrawable == null)
        continue;
      paramDrawable.setCallback(this);
    }
    while (a());
    invalidate();
  }

  public void setRightDrawableTopPadding(int paramInt)
  {
    this.i = paramInt;
  }

  public void setText(CharSequence paramCharSequence)
  {
    if (((this.d == null) && (paramCharSequence == null)) || ((this.d != null) && (paramCharSequence != null) && (this.d.equals(paramCharSequence))))
      return;
    this.d = paramCharSequence;
    a();
  }

  public void setTextColor(int paramInt)
  {
    this.b.setColor(paramInt);
    invalidate();
  }

  public void setTextSize(int paramInt)
  {
    paramInt = a.a(paramInt);
    if (paramInt == this.b.getTextSize());
    do
    {
      return;
      this.b.setTextSize(paramInt);
    }
    while (a());
    invalidate();
  }

  public void setTypeface(Typeface paramTypeface)
  {
    this.b.setTypeface(paramTypeface);
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.a.k
 * JD-Core Version:    0.6.0
 */