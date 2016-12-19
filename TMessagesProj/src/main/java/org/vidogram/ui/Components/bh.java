package org.vidogram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import org.vidogram.messenger.a;

public class bh extends FrameLayout
{
  private Rect a = new Rect();
  private int b;
  private a c;
  private boolean d;

  public bh(Context paramContext)
  {
    super(paramContext);
  }

  public void a()
  {
    if (this.c != null)
    {
      this.b = getKeyboardHeight();
      if (a.c.x <= a.c.y)
        break label47;
    }
    label47: for (boolean bool = true; ; bool = false)
    {
      post(new Runnable(bool)
      {
        public void run()
        {
          if (bh.a(bh.this) != null)
            bh.a(bh.this).a(bh.b(bh.this), this.a);
        }
      });
      return;
    }
  }

  public int getKeyboardHeight()
  {
    int i = 0;
    int j = 0;
    View localView = getRootView();
    getWindowVisibleDisplayFrame(this.a);
    int k;
    if (this.d)
    {
      k = localView.getHeight();
      i = j;
      if (this.a.top != 0)
        i = a.a;
      i = k - i - a.c(localView) - (this.a.bottom - this.a.top);
    }
    do
    {
      return i;
      j = localView.getHeight();
      k = a.c(localView);
      int m = this.a.top;
      j = a.c.y - m - (j - k);
    }
    while (j <= a.a(10.0F));
    return j;
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    a();
  }

  public void setDelegate(a parama)
  {
    this.c = parama;
  }

  public void setWithoutWindow(boolean paramBoolean)
  {
    this.d = paramBoolean;
  }

  public static abstract interface a
  {
    public abstract void a(int paramInt, boolean paramBoolean);
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.Components.bh
 * JD-Core Version:    0.6.0
 */