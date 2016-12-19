package org.vidogram.ui.c;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

public class e extends View
{
  private boolean a = false;
  private a b = null;
  private int c = 0;
  private b d = null;

  public e(Context paramContext)
  {
    super(paramContext);
  }

  protected void a()
  {
    if (this.a)
      return;
    this.a = true;
    if (this.d == null)
      this.d = new b(null);
    postDelayed(this.d, ViewConfiguration.getTapTimeout());
  }

  protected void a(Drawable paramDrawable, int paramInt1, int paramInt2)
  {
    a(paramDrawable, paramInt1, paramInt2, paramDrawable.getIntrinsicWidth(), paramDrawable.getIntrinsicHeight());
  }

  protected void a(Drawable paramDrawable, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (paramDrawable != null)
      paramDrawable.setBounds(paramInt1, paramInt2, paramInt1 + paramInt3, paramInt2 + paramInt4);
  }

  protected void b()
  {
    this.a = false;
    if (this.b != null)
      removeCallbacks(this.b);
    if (this.d != null)
      removeCallbacks(this.d);
  }

  protected void c()
  {
  }

  public boolean hasOverlappingRendering()
  {
    return false;
  }

  class a
    implements Runnable
  {
    public int a;

    a()
    {
    }

    public void run()
    {
      if ((e.c(e.this)) && (e.this.getParent() != null) && (this.a == e.d(e.this)))
      {
        e.a(e.this, false);
        e.this.performHapticFeedback(0);
        e.this.c();
        MotionEvent localMotionEvent = MotionEvent.obtain(0L, 0L, 3, 0.0F, 0.0F, 0);
        e.this.onTouchEvent(localMotionEvent);
        localMotionEvent.recycle();
      }
    }
  }

  private final class b
    implements Runnable
  {
    private b()
    {
    }

    public void run()
    {
      if (e.a(e.this) == null)
        e.a(e.this, new e.a(e.this));
      e.a(e.this).a = e.b(e.this);
      e.this.postDelayed(e.a(e.this), ViewConfiguration.getLongPressTimeout() - ViewConfiguration.getTapTimeout());
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.c.e
 * JD-Core Version:    0.6.0
 */