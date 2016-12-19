package org.vidogram.ui.a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.WindowInsets;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ListView;
import java.util.ArrayList;
import org.vidogram.messenger.a;
import org.vidogram.messenger.n;

public class i extends FrameLayout
{
  private ViewGroup a;
  private b b;
  private boolean c;
  private boolean d;
  private int e;
  private int f;
  private int g;
  private VelocityTracker h;
  private boolean i;
  private AnimatorSet j;
  private Paint k = new Paint();
  private Object l;
  private boolean m;
  private int n = (int)(64.0F * a.b + 0.5F);
  private float o;
  private Drawable p;
  private boolean q;
  private float r;
  private boolean s;
  private boolean t = true;

  public i(Context paramContext)
  {
    super(paramContext);
    setDescendantFocusability(262144);
    setFocusableInTouchMode(true);
    if (Build.VERSION.SDK_INT >= 21)
    {
      setFitsSystemWindows(true);
      setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener()
      {
        @SuppressLint({"NewApi"})
        public WindowInsets onApplyWindowInsets(View paramView, WindowInsets paramWindowInsets)
        {
          paramView = (i)paramView;
          a.a = paramWindowInsets.getSystemWindowInsetTop();
          i.a(i.this, paramWindowInsets);
          if ((paramWindowInsets.getSystemWindowInsetTop() <= 0) && (i.this.getBackground() == null));
          for (boolean bool = true; ; bool = false)
          {
            paramView.setWillNotDraw(bool);
            paramView.requestLayout();
            return paramWindowInsets.consumeSystemWindowInsets();
          }
        }
      });
      setSystemUiVisibility(1280);
    }
    this.p = getResources().getDrawable(2130837975);
  }

  private void a(MotionEvent paramMotionEvent)
  {
    this.c = false;
    this.d = true;
    if (paramMotionEvent != null)
      this.e = (int)paramMotionEvent.getX();
    this.i = false;
  }

  @SuppressLint({"NewApi"})
  private void a(View paramView, Object paramObject, int paramInt)
  {
    WindowInsets localWindowInsets = (WindowInsets)paramObject;
    if (paramInt == 3)
      paramObject = localWindowInsets.replaceSystemWindowInsets(localWindowInsets.getSystemWindowInsetLeft(), localWindowInsets.getSystemWindowInsetTop(), 0, localWindowInsets.getSystemWindowInsetBottom());
    while (true)
    {
      paramView.dispatchApplyWindowInsets(paramObject);
      return;
      paramObject = localWindowInsets;
      if (paramInt != 5)
        continue;
      paramObject = localWindowInsets.replaceSystemWindowInsets(0, localWindowInsets.getSystemWindowInsetTop(), localWindowInsets.getSystemWindowInsetRight(), localWindowInsets.getSystemWindowInsetBottom());
    }
  }

  @SuppressLint({"NewApi"})
  private void a(ViewGroup.MarginLayoutParams paramMarginLayoutParams, Object paramObject, int paramInt, boolean paramBoolean)
  {
    int i1 = 0;
    WindowInsets localWindowInsets = (WindowInsets)paramObject;
    if (paramInt == 3)
    {
      paramObject = localWindowInsets.replaceSystemWindowInsets(localWindowInsets.getSystemWindowInsetLeft(), localWindowInsets.getSystemWindowInsetTop(), 0, localWindowInsets.getSystemWindowInsetBottom());
      paramMarginLayoutParams.leftMargin = paramObject.getSystemWindowInsetLeft();
      if (!paramBoolean)
        break label107;
    }
    label107: for (paramInt = i1; ; paramInt = paramObject.getSystemWindowInsetTop())
    {
      paramMarginLayoutParams.topMargin = paramInt;
      paramMarginLayoutParams.rightMargin = paramObject.getSystemWindowInsetRight();
      paramMarginLayoutParams.bottomMargin = paramObject.getSystemWindowInsetBottom();
      return;
      paramObject = localWindowInsets;
      if (paramInt != 5)
        break;
      paramObject = localWindowInsets.replaceSystemWindowInsets(0, localWindowInsets.getSystemWindowInsetTop(), localWindowInsets.getSystemWindowInsetRight(), localWindowInsets.getSystemWindowInsetBottom());
      break;
    }
  }

  private void c(boolean paramBoolean)
  {
    this.d = false;
    this.j = null;
    this.s = paramBoolean;
    if ((!paramBoolean) && ((this.a instanceof ListView)))
      ((ListView)this.a).setSelectionFromTop(0, 0);
  }

  private float getScrimOpacity()
  {
    return this.o;
  }

  private void setScrimOpacity(float paramFloat)
  {
    this.o = paramFloat;
    invalidate();
  }

  public void a()
  {
    if (this.j != null)
    {
      this.j.cancel();
      this.j = null;
    }
  }

  public void a(float paramFloat)
  {
    setDrawerPosition(this.r + paramFloat);
  }

  public void a(boolean paramBoolean)
  {
    if (!this.q)
      return;
    if ((a.c()) && (this.b != null) && (this.b.d != null))
      a.b(this.b.d.getCurrentFocus());
    a();
    AnimatorSet localAnimatorSet = new AnimatorSet();
    localAnimatorSet.playTogether(new Animator[] { ObjectAnimator.ofFloat(this, "drawerPosition", new float[] { this.a.getMeasuredWidth() }) });
    localAnimatorSet.setInterpolator(new DecelerateInterpolator());
    if (paramBoolean)
      localAnimatorSet.setDuration(Math.max((int)(200.0F / this.a.getMeasuredWidth() * (this.a.getMeasuredWidth() - this.r)), 50));
    while (true)
    {
      localAnimatorSet.addListener(new org.vidogram.messenger.b()
      {
        public void onAnimationEnd(Animator paramAnimator)
        {
          i.a(i.this, true);
        }
      });
      localAnimatorSet.start();
      this.j = localAnimatorSet;
      return;
      localAnimatorSet.setDuration(300L);
    }
  }

  public void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    this.q = paramBoolean1;
    if ((!this.q) && (this.r != 0.0F))
    {
      if (!paramBoolean2)
      {
        setDrawerPosition(0.0F);
        c(false);
      }
    }
    else
      return;
    b(true);
  }

  public void b(boolean paramBoolean)
  {
    a();
    AnimatorSet localAnimatorSet = new AnimatorSet();
    localAnimatorSet.playTogether(new Animator[] { ObjectAnimator.ofFloat(this, "drawerPosition", new float[] { 0.0F }) });
    localAnimatorSet.setInterpolator(new DecelerateInterpolator());
    if (paramBoolean)
      localAnimatorSet.setDuration(Math.max((int)(200.0F / this.a.getMeasuredWidth() * this.r), 50));
    while (true)
    {
      localAnimatorSet.addListener(new org.vidogram.messenger.b()
      {
        public void onAnimationEnd(Animator paramAnimator)
        {
          i.a(i.this, false);
        }
      });
      localAnimatorSet.start();
      return;
      localAnimatorSet.setDuration(300L);
    }
  }

  public boolean b()
  {
    return this.s;
  }

  protected boolean drawChild(Canvas paramCanvas, View paramView, long paramLong)
  {
    if (!this.t)
      return false;
    int i7 = getHeight();
    int i4;
    int i5;
    int i1;
    int i3;
    int i2;
    int i8;
    int i9;
    label64: View localView;
    if (paramView != this.a)
    {
      i4 = 1;
      i5 = 0;
      i1 = 0;
      i3 = 0;
      i2 = 0;
      i8 = getWidth();
      i9 = paramCanvas.save();
      if (i4 == 0)
        break label228;
      int i10 = getChildCount();
      i3 = 0;
      if (i3 >= i10)
        break label193;
      localView = getChildAt(i3);
      if ((localView.getVisibility() != 0) || (localView == this.a))
        break label403;
      i1 = i3;
    }
    label403: 
    while (true)
    {
      i5 = i2;
      if (localView != paramView)
      {
        i5 = i2;
        if (localView.getVisibility() == 0)
        {
          i5 = i2;
          if (localView == this.a)
          {
            if (localView.getHeight() >= i7)
              break label168;
            i5 = i2;
          }
        }
      }
      while (true)
      {
        i3 += 1;
        i2 = i5;
        break label64;
        i4 = 0;
        break;
        label168: int i6 = localView.getRight();
        i5 = i2;
        if (i6 <= i2)
          continue;
        i5 = i6;
      }
      label193: i3 = i2;
      i5 = i1;
      if (i2 != 0)
      {
        paramCanvas.clipRect(i2, 0, i8, getHeight());
        i5 = i1;
        i3 = i2;
      }
      label228: boolean bool = super.drawChild(paramCanvas, paramView, paramLong);
      paramCanvas.restoreToCount(i9);
      if ((this.o > 0.0F) && (i4 != 0))
        if (indexOfChild(paramView) == i5)
        {
          this.k.setColor((int)(153.0F * this.o) << 24);
          paramCanvas.drawRect(i3, 0.0F, i8, getHeight(), this.k);
        }
      while (true)
      {
        return bool;
        if (this.p == null)
          continue;
        float f1 = Math.max(0.0F, Math.min(this.r / a.a(20.0F), 1.0F));
        if (f1 == 0.0F)
          continue;
        this.p.setBounds((int)this.r, paramView.getTop(), (int)this.r + this.p.getIntrinsicWidth(), paramView.getBottom());
        this.p.setAlpha((int)(f1 * 255.0F));
        this.p.draw(paramCanvas);
      }
    }
  }

  public View getDrawerLayout()
  {
    return this.a;
  }

  public float getDrawerPosition()
  {
    return this.r;
  }

  public boolean hasOverlappingRendering()
  {
    return false;
  }

  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    return (this.b.f()) || (onTouchEvent(paramMotionEvent));
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.m = true;
    paramInt2 = getChildCount();
    paramInt1 = 0;
    if (paramInt1 < paramInt2)
    {
      View localView = getChildAt(paramInt1);
      if (localView.getVisibility() == 8);
      while (true)
      {
        paramInt1 += 1;
        break;
        FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)localView.getLayoutParams();
        try
        {
          if (this.a == localView)
            break label113;
          localView.layout(localLayoutParams.leftMargin, localLayoutParams.topMargin, localLayoutParams.leftMargin + localView.getMeasuredWidth(), localLayoutParams.topMargin + localView.getMeasuredHeight());
        }
        catch (Exception localException)
        {
          n.a("tmessages", localException);
        }
        continue;
        label113: localException.layout(-localException.getMeasuredWidth(), localLayoutParams.topMargin, 0, localLayoutParams.topMargin + localException.getMeasuredHeight());
      }
    }
    this.m = false;
  }

  @SuppressLint({"NewApi"})
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i3 = View.MeasureSpec.getSize(paramInt1);
    int i4 = View.MeasureSpec.getSize(paramInt2);
    setMeasuredDimension(i3, i4);
    int i1;
    int i2;
    label46: View localView;
    if ((this.l != null) && (Build.VERSION.SDK_INT >= 21))
    {
      i1 = 1;
      int i5 = getChildCount();
      i2 = 0;
      if (i2 >= i5)
        return;
      localView = getChildAt(i2);
      if (localView.getVisibility() != 8)
        break label85;
    }
    while (true)
    {
      i2 += 1;
      break label46;
      i1 = 0;
      break;
      label85: FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)localView.getLayoutParams();
      if (i1 != 0)
      {
        if (!localView.getFitsSystemWindows())
          break label179;
        a(localView, this.l, localLayoutParams.gravity);
      }
      label179: 
      do
      {
        if (this.a == localView)
          break label232;
        localView.measure(View.MeasureSpec.makeMeasureSpec(i3 - localLayoutParams.leftMargin - localLayoutParams.rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec(i4 - localLayoutParams.topMargin - localLayoutParams.bottomMargin, 1073741824));
        break;
      }
      while (localView.getTag() != null);
      Object localObject = this.l;
      int i6 = localLayoutParams.gravity;
      if (Build.VERSION.SDK_INT >= 21);
      for (boolean bool = true; ; bool = false)
      {
        a(localLayoutParams, localObject, i6, bool);
        break;
      }
      label232: localView.setPadding(0, 0, 0, 0);
      localView.measure(getChildMeasureSpec(paramInt1, this.n + localLayoutParams.leftMargin + localLayoutParams.rightMargin, localLayoutParams.width), getChildMeasureSpec(paramInt2, localLayoutParams.topMargin + localLayoutParams.bottomMargin, localLayoutParams.height));
    }
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool = true;
    label646: label652: if (!this.b.f())
    {
      if ((this.s) && (paramMotionEvent != null) && (paramMotionEvent.getX() > this.r) && (!this.d))
      {
        if (paramMotionEvent.getAction() == 1)
          b(false);
        return true;
      }
      if ((this.q) && (this.b.e.size() == 1))
      {
        if ((paramMotionEvent == null) || ((paramMotionEvent.getAction() != 0) && (paramMotionEvent.getAction() != 2)) || (this.d) || (this.c))
          break label167;
        this.g = paramMotionEvent.getPointerId(0);
        this.c = true;
        this.e = (int)paramMotionEvent.getX();
        this.f = (int)paramMotionEvent.getY();
        a();
        if (this.h != null)
          this.h.clear();
      }
      label167: label696: 
      while (true)
      {
        return this.d;
        float f1;
        float f2;
        if ((paramMotionEvent != null) && (paramMotionEvent.getAction() == 2) && (paramMotionEvent.getPointerId(0) == this.g))
        {
          if (this.h == null)
            this.h = VelocityTracker.obtain();
          f1 = (int)(paramMotionEvent.getX() - this.e);
          f2 = Math.abs((int)paramMotionEvent.getY() - this.f);
          this.h.addMovement(paramMotionEvent);
          if ((this.c) && (!this.d) && (((f1 > 0.0F) && (f1 / 3.0F > Math.abs(f2)) && (Math.abs(f1) >= a.a(0.2F, true))) || ((f1 < 0.0F) && (Math.abs(f1) >= Math.abs(f2)) && (Math.abs(f1) >= a.a(0.4F, true)))))
          {
            a(paramMotionEvent);
            this.e = (int)paramMotionEvent.getX();
            requestDisallowInterceptTouchEvent(true);
            continue;
          }
          if (!this.d)
            continue;
          if (!this.i)
          {
            if (((Activity)getContext()).getCurrentFocus() != null)
              a.b(((Activity)getContext()).getCurrentFocus());
            this.i = true;
          }
          a(f1);
          this.e = (int)paramMotionEvent.getX();
          continue;
        }
        if ((paramMotionEvent != null) && ((paramMotionEvent == null) || (paramMotionEvent.getPointerId(0) != this.g) || ((paramMotionEvent.getAction() != 3) && (paramMotionEvent.getAction() != 1) && (paramMotionEvent.getAction() != 6))))
          continue;
        if (this.h == null)
          this.h = VelocityTracker.obtain();
        this.h.computeCurrentVelocity(1000);
        int i1;
        if ((this.d) || ((this.r != 0.0F) && (this.r != this.a.getMeasuredWidth())))
        {
          f1 = this.h.getXVelocity();
          f2 = this.h.getYVelocity();
          if (((this.r < this.a.getMeasuredWidth() / 2.0F) && ((f1 < 3500.0F) || (Math.abs(f1) < Math.abs(f2)))) || ((f1 < 0.0F) && (Math.abs(f1) >= 3500.0F)))
          {
            i1 = 1;
            label581: if (i1 != 0)
              break label652;
            if ((this.s) || (Math.abs(f1) < 3500.0F))
              break label646;
            bool = true;
            label607: a(bool);
          }
        }
        for (this.d = false; ; this.d = false)
        {
          if (this.h == null)
            break label696;
          this.h.recycle();
          this.h = null;
          break;
          i1 = 0;
          break label581;
          bool = false;
          break label607;
          if ((this.s) && (Math.abs(f1) >= 3500.0F));
          while (true)
          {
            b(bool);
            break;
            bool = false;
          }
          this.c = false;
        }
      }
    }
    return false;
  }

  public void requestDisallowInterceptTouchEvent(boolean paramBoolean)
  {
    if ((this.c) && (!this.d))
      onTouchEvent(null);
    super.requestDisallowInterceptTouchEvent(paramBoolean);
  }

  public void requestLayout()
  {
    if (!this.m)
      super.requestLayout();
  }

  public void setAllowDrawContent(boolean paramBoolean)
  {
    if (this.t != paramBoolean)
    {
      this.t = paramBoolean;
      invalidate();
    }
  }

  public void setDrawerLayout(ViewGroup paramViewGroup)
  {
    this.a = paramViewGroup;
    addView(this.a);
    if (Build.VERSION.SDK_INT >= 21)
      this.a.setFitsSystemWindows(true);
  }

  public void setDrawerPosition(float paramFloat)
  {
    this.r = paramFloat;
    if (this.r > this.a.getMeasuredWidth())
    {
      this.r = this.a.getMeasuredWidth();
      this.a.setTranslationX(this.r);
      if (this.r <= 0.0F)
        break label109;
    }
    label109: for (int i1 = 0; ; i1 = 8)
    {
      if (this.a.getVisibility() != i1)
        this.a.setVisibility(i1);
      setScrimOpacity(this.r / this.a.getMeasuredWidth());
      return;
      if (this.r >= 0.0F)
        break;
      this.r = 0.0F;
      break;
    }
  }

  public void setParentActionBarLayout(b paramb)
  {
    this.b = paramb;
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.a.i
 * JD-Core Version:    0.6.0
 */