package org.vidogram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import org.vidogram.messenger.a;
import org.vidogram.messenger.r;

public class q extends FrameLayout
{
  private TextView a;
  private ProgressBar b;
  private boolean c;
  private boolean d;

  public q(Context paramContext)
  {
    super(paramContext);
    this.b = new ProgressBar(paramContext);
    this.b.setVisibility(4);
    addView(this.b, v.a(-2, -2.0F));
    this.a = new TextView(paramContext);
    this.a.setTextSize(1, 20.0F);
    this.a.setTextColor(-8355712);
    this.a.setGravity(17);
    this.a.setVisibility(4);
    this.a.setPadding(a.a(20.0F), 0, a.a(20.0F), 0);
    this.a.setText(r.a("NoResult", 2131231509));
    addView(this.a, v.a(-2, -2.0F));
    setOnTouchListener(new View.OnTouchListener()
    {
      public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
      {
        return true;
      }
    });
  }

  public void a()
  {
    this.a.setVisibility(4);
    this.b.setVisibility(0);
  }

  public void b()
  {
    this.a.setVisibility(0);
    this.b.setVisibility(4);
  }

  public boolean hasOverlappingRendering()
  {
    return false;
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.c = true;
    int i = paramInt4 - paramInt2;
    int j = getChildCount();
    paramInt2 = 0;
    while (paramInt2 < j)
    {
      View localView = getChildAt(paramInt2);
      if (localView.getVisibility() == 8)
      {
        paramInt2 += 1;
        continue;
      }
      int k = (paramInt3 - paramInt1 - localView.getMeasuredWidth()) / 2;
      if (this.d);
      for (paramInt4 = (i / 2 - localView.getMeasuredHeight()) / 2; ; paramInt4 = (i - localView.getMeasuredHeight()) / 2)
      {
        localView.layout(k, paramInt4, localView.getMeasuredWidth() + k, localView.getMeasuredHeight() + paramInt4);
        break;
      }
    }
    this.c = false;
  }

  public void requestLayout()
  {
    if (!this.c)
      super.requestLayout();
  }

  public void setShowAtCenter(boolean paramBoolean)
  {
    this.d = paramBoolean;
  }

  public void setText(String paramString)
  {
    this.a.setText(paramString);
  }

  public void setTextSize(int paramInt)
  {
    this.a.setTextSize(1, paramInt);
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.Components.q
 * JD-Core Version:    0.6.0
 */