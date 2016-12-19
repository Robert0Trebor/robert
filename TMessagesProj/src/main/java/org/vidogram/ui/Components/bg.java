package org.vidogram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import org.vidogram.messenger.a;

public class bg extends FrameLayout
{
  private Rect a = new Rect();
  private Drawable b;
  private int c;
  private int d;
  private a e;

  public bg(Context paramContext)
  {
    super(paramContext);
    setWillNotDraw(false);
  }

  public void a()
  {
    if (this.e != null)
    {
      this.c = getKeyboardHeight();
      if (a.c.x <= a.c.y)
        break label47;
    }
    label47: for (boolean bool = true; ; bool = false)
    {
      post(new Runnable(bool)
      {
        public void run()
        {
          if (bg.a(bg.this) != null)
            bg.a(bg.this).b(bg.b(bg.this), this.a);
        }
      });
      return;
    }
  }

  public Drawable getBackgroundImage()
  {
    return this.b;
  }

  public int getKeyboardHeight()
  {
    View localView = getRootView();
    getWindowVisibleDisplayFrame(this.a);
    int j = localView.getHeight();
    if (this.a.top != 0);
    for (int i = a.a; ; i = 0)
      return j - i - a.c(localView) - (this.a.bottom - this.a.top);
  }

  protected void onDraw(Canvas paramCanvas)
  {
    if (this.b != null)
    {
      if ((this.b instanceof ColorDrawable))
      {
        if (this.d != 0)
        {
          paramCanvas.save();
          paramCanvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight() - this.d);
        }
        this.b.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
        this.b.draw(paramCanvas);
        if (this.d != 0)
          paramCanvas.restore();
      }
      do
        return;
      while (!(this.b instanceof BitmapDrawable));
      if (((BitmapDrawable)this.b).getTileModeX() == Shader.TileMode.REPEAT)
      {
        paramCanvas.save();
        f1 = 2.0F / a.b;
        paramCanvas.scale(f1, f1);
        this.b.setBounds(0, 0, (int)Math.ceil(getMeasuredWidth() / f1), (int)Math.ceil(getMeasuredHeight() / f1));
        this.b.draw(paramCanvas);
        paramCanvas.restore();
        return;
      }
      float f1 = getMeasuredWidth() / this.b.getIntrinsicWidth();
      float f2 = (getMeasuredHeight() + this.c) / this.b.getIntrinsicHeight();
      if (f1 < f2)
        f1 = f2;
      while (true)
      {
        int i = (int)Math.ceil(this.b.getIntrinsicWidth() * f1);
        int j = (int)Math.ceil(f1 * this.b.getIntrinsicHeight());
        int k = (getMeasuredWidth() - i) / 2;
        int m = (getMeasuredHeight() - j + this.c) / 2;
        if (this.d != 0)
        {
          paramCanvas.save();
          paramCanvas.clipRect(0, 0, i, getMeasuredHeight() - this.d);
        }
        this.b.setBounds(k, m, i + k, j + m);
        this.b.draw(paramCanvas);
        if (this.d == 0)
          break;
        paramCanvas.restore();
        return;
      }
    }
    super.onDraw(paramCanvas);
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    a();
  }

  public void setBackgroundImage(Drawable paramDrawable)
  {
    this.b = paramDrawable;
  }

  public void setBottomClip(int paramInt)
  {
    this.d = paramInt;
  }

  public void setDelegate(a parama)
  {
    this.e = parama;
  }

  public static abstract interface a
  {
    public abstract void b(int paramInt, boolean paramBoolean);
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.Components.bg
 * JD-Core Version:    0.6.0
 */