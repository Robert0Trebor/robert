package org.vidogram.ui.Components.a.a;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ScaleGestureDetector.OnScaleGestureListener;
import android.widget.FrameLayout;

public class c extends FrameLayout
  implements ScaleGestureDetector.OnScaleGestureListener, e.a
{
  private a a;
  private ScaleGestureDetector b = new ScaleGestureDetector(paramContext, this);
  private e c = new e(this);
  private float d = 1.0F;
  private float e;
  private boolean f;

  public c(Context paramContext, a parama)
  {
    super(paramContext);
    this.a = parama;
  }

  public int a()
  {
    int i = 0;
    int j = 0;
    if (i < getChildCount())
    {
      if (!(getChildAt(i) instanceof d));
      while (true)
      {
        i += 1;
        break;
        j += 1;
      }
    }
    return j;
  }

  public void a(d paramd)
  {
    if (indexOfChild(paramd) != getChildCount() - 1)
    {
      removeView(paramd);
      addView(paramd, getChildCount());
    }
  }

  public void a(e parame)
  {
    this.e = parame.b();
    this.f = true;
  }

  public void b(e parame)
  {
    d locald = this.a.c();
    float f1 = parame.a();
    locald.b(this.e - f1 + locald.getRotation());
    this.e = f1;
  }

  public void c(e parame)
  {
  }

  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    return (paramMotionEvent.getPointerCount() == 2) && (this.a.a());
  }

  public boolean onScale(ScaleGestureDetector paramScaleGestureDetector)
  {
    float f1 = paramScaleGestureDetector.getScaleFactor();
    float f2 = f1 / this.d;
    this.a.c().a(f2);
    this.d = f1;
    return false;
  }

  public boolean onScaleBegin(ScaleGestureDetector paramScaleGestureDetector)
  {
    this.d = 1.0F;
    this.f = true;
    return true;
  }

  public void onScaleEnd(ScaleGestureDetector paramScaleGestureDetector)
  {
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (this.a.c() == null);
    label56: 
    do
    {
      return false;
      int i;
      if (paramMotionEvent.getPointerCount() == 1)
      {
        i = paramMotionEvent.getActionMasked();
        if (i != 0)
          break label56;
        this.f = false;
      }
      do
      {
        this.b.onTouchEvent(paramMotionEvent);
        this.c.a(paramMotionEvent);
        return true;
      }
      while ((i != 1) && (i != 2));
    }
    while ((this.f) || (this.a == null));
    this.a.b();
    return false;
  }

  public static abstract interface a
  {
    public abstract boolean a();

    public abstract void b();

    public abstract d c();
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.Components.a.a.c
 * JD-Core Version:    0.6.0
 */