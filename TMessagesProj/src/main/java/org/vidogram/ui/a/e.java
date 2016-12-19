package org.vidogram.ui.a;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.ScrollView;
import java.lang.reflect.Field;
import java.util.HashMap;
import org.vidogram.messenger.a;
import org.vidogram.messenger.n;
import org.vidogram.ui.Components.v;

public class e extends PopupWindow
{
  private static final Field a;
  private static final boolean b;
  private static DecelerateInterpolator c;
  private static final ViewTreeObserver.OnScrollChangedListener f;
  private AnimatorSet d;
  private boolean e = b;
  private ViewTreeObserver.OnScrollChangedListener g;
  private ViewTreeObserver h;

  static
  {
    boolean bool = true;
    if (Build.VERSION.SDK_INT >= 18);
    while (true)
    {
      b = bool;
      c = new DecelerateInterpolator();
      Object localObject = null;
      try
      {
        Field localField = PopupWindow.class.getDeclaredField("mOnScrollChangedListener");
        localObject = localField;
        localField.setAccessible(true);
        localObject = localField;
        label43: a = localObject;
        f = new ViewTreeObserver.OnScrollChangedListener()
        {
          public void onScrollChanged()
          {
          }
        };
        return;
        bool = false;
      }
      catch (NoSuchFieldException localNoSuchFieldException)
      {
        break label43;
      }
    }
  }

  public e()
  {
    d();
  }

  public e(View paramView, int paramInt1, int paramInt2)
  {
    super(paramView, paramInt1, paramInt2);
    d();
  }

  private void a(View paramView)
  {
    if (this.g != null)
      if (paramView.getWindowToken() == null)
        break label73;
    label73: for (paramView = paramView.getViewTreeObserver(); ; paramView = null)
    {
      if (paramView != this.h)
      {
        if ((this.h != null) && (this.h.isAlive()))
          this.h.removeOnScrollChangedListener(this.g);
        this.h = paramView;
        if (paramView != null)
          paramView.addOnScrollChangedListener(this.g);
      }
      return;
    }
  }

  private void d()
  {
    if (a != null);
    try
    {
      this.g = ((ViewTreeObserver.OnScrollChangedListener)a.get(this));
      a.set(this, f);
      return;
    }
    catch (Exception localException)
    {
      this.g = null;
    }
  }

  private void e()
  {
    if ((this.g != null) && (this.h != null))
    {
      if (this.h.isAlive())
        this.h.removeOnScrollChangedListener(this.g);
      this.h = null;
    }
  }

  public void a()
  {
    if ((!this.e) || (this.d != null))
      return;
    a locala = (a)getContentView();
    locala.setTranslationY(0.0F);
    locala.setAlpha(1.0F);
    locala.setPivotX(locala.getMeasuredWidth());
    locala.setPivotY(0.0F);
    int k = locala.getItemsCount();
    a.a(locala).clear();
    int i = 0;
    int j = 0;
    if (i < k)
    {
      View localView = locala.a(i);
      if (localView.getVisibility() != 0);
      while (true)
      {
        i += 1;
        break;
        a.a(locala).put(localView, Integer.valueOf(j));
        localView.setAlpha(0.0F);
        j += 1;
      }
    }
    if (a.b(locala))
      a.a(locala, k - 1);
    while (true)
    {
      this.d = new AnimatorSet();
      this.d.playTogether(new Animator[] { ObjectAnimator.ofFloat(locala, "backScaleY", new float[] { 0.0F, 1.0F }), ObjectAnimator.ofInt(locala, "backAlpha", new int[] { 0, 255 }) });
      this.d.setDuration(j * 16 + 150);
      this.d.addListener(new Animator.AnimatorListener()
      {
        public void onAnimationCancel(Animator paramAnimator)
        {
          onAnimationEnd(paramAnimator);
        }

        public void onAnimationEnd(Animator paramAnimator)
        {
          e.a(e.this, null);
        }

        public void onAnimationRepeat(Animator paramAnimator)
        {
        }

        public void onAnimationStart(Animator paramAnimator)
        {
        }
      });
      this.d.start();
      return;
      a.a(locala, 0);
    }
  }

  public void a(boolean paramBoolean)
  {
    this.e = paramBoolean;
  }

  public void b(boolean paramBoolean)
  {
    setFocusable(false);
    if ((this.e) && (paramBoolean))
    {
      if (this.d != null)
        this.d.cancel();
      a locala = (a)getContentView();
      this.d = new AnimatorSet();
      AnimatorSet localAnimatorSet = this.d;
      float f1;
      if (a.b(locala))
        f1 = 5.0F;
      while (true)
      {
        localAnimatorSet.playTogether(new Animator[] { ObjectAnimator.ofFloat(locala, "translationY", new float[] { a.a(f1) }), ObjectAnimator.ofFloat(locala, "alpha", new float[] { 0.0F }) });
        this.d.setDuration(150L);
        this.d.addListener(new Animator.AnimatorListener()
        {
          public void onAnimationCancel(Animator paramAnimator)
          {
            onAnimationEnd(paramAnimator);
          }

          public void onAnimationEnd(Animator paramAnimator)
          {
            e.a(e.this, null);
            e.this.setFocusable(false);
            try
            {
              e.a(e.this);
              label24: e.b(e.this);
              return;
            }
            catch (Exception paramAnimator)
            {
              break label24;
            }
          }

          public void onAnimationRepeat(Animator paramAnimator)
          {
          }

          public void onAnimationStart(Animator paramAnimator)
          {
          }
        });
        this.d.start();
        return;
        f1 = -5.0F;
      }
    }
    try
    {
      super.dismiss();
      label154: e();
      return;
    }
    catch (Exception localException)
    {
      break label154;
    }
  }

  public void dismiss()
  {
    b(true);
  }

  public void showAsDropDown(View paramView, int paramInt1, int paramInt2)
  {
    try
    {
      super.showAsDropDown(paramView, paramInt1, paramInt2);
      a(paramView);
      return;
    }
    catch (Exception paramView)
    {
      n.a("tmessages", paramView);
    }
  }

  public void showAtLocation(View paramView, int paramInt1, int paramInt2, int paramInt3)
  {
    super.showAtLocation(paramView, paramInt1, paramInt2, paramInt3);
    e();
  }

  public void update(View paramView, int paramInt1, int paramInt2)
  {
    super.update(paramView, paramInt1, paramInt2);
    a(paramView);
  }

  public void update(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.update(paramView, paramInt1, paramInt2, paramInt3, paramInt4);
    a(paramView);
  }

  public static class a extends FrameLayout
  {
    protected static Drawable a;
    private e.b b;
    private float c = 1.0F;
    private float d = 1.0F;
    private int e = 255;
    private int f = 0;
    private boolean g;
    private boolean h = e.b();
    private HashMap<View, Integer> i = new HashMap();
    private ScrollView j;
    private LinearLayout k;

    public a(Context paramContext)
    {
      super();
      if (a == null)
        a = getResources().getDrawable(2130838096);
      setPadding(a.a(8.0F), a.a(8.0F), a.a(8.0F), a.a(8.0F));
      setWillNotDraw(false);
      try
      {
        this.j = new ScrollView(paramContext);
        this.j.setVerticalScrollBarEnabled(false);
        addView(this.j, v.a(-2, -2.0F));
        this.k = new LinearLayout(paramContext);
        this.k.setOrientation(1);
        if (this.j != null)
        {
          this.j.addView(this.k, new FrameLayout.LayoutParams(-2, -2));
          return;
        }
      }
      catch (Throwable localThrowable)
      {
        while (true)
          n.a("tmessages", localThrowable);
        addView(this.k, v.a(-2, -2.0F));
      }
    }

    private void a(View paramView)
    {
      AnimatorSet localAnimatorSet;
      ObjectAnimator localObjectAnimator;
      float f1;
      if (this.h)
      {
        localAnimatorSet = new AnimatorSet();
        localObjectAnimator = ObjectAnimator.ofFloat(paramView, "alpha", new float[] { 0.0F, 1.0F });
        if (!this.g)
          break label101;
        f1 = 6.0F;
      }
      while (true)
      {
        localAnimatorSet.playTogether(new Animator[] { localObjectAnimator, ObjectAnimator.ofFloat(paramView, "translationY", new float[] { a.a(f1), 0.0F }) });
        localAnimatorSet.setDuration(180L);
        localAnimatorSet.setInterpolator(e.c());
        localAnimatorSet.start();
        return;
        label101: f1 = -6.0F;
      }
    }

    public View a(int paramInt)
    {
      return this.k.getChildAt(paramInt);
    }

    public void a()
    {
      this.k.removeAllViews();
    }

    public void addView(View paramView)
    {
      this.k.addView(paramView);
    }

    public void b()
    {
      if (this.j != null)
        this.j.scrollTo(0, 0);
    }

    public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
    {
      if (this.b != null)
        this.b.a(paramKeyEvent);
      return super.dispatchKeyEvent(paramKeyEvent);
    }

    public int getBackAlpha()
    {
      return this.e;
    }

    public float getBackScaleX()
    {
      return this.c;
    }

    public float getBackScaleY()
    {
      return this.d;
    }

    public int getItemsCount()
    {
      return this.k.getChildCount();
    }

    protected void onDraw(Canvas paramCanvas)
    {
      if (a != null)
      {
        a.setAlpha(this.e);
        if (!this.g)
          break label66;
        a.setBounds(0, (int)(getMeasuredHeight() * (1.0F - this.d)), (int)(getMeasuredWidth() * this.c), getMeasuredHeight());
      }
      while (true)
      {
        a.draw(paramCanvas);
        return;
        label66: a.setBounds(0, 0, (int)(getMeasuredWidth() * this.c), (int)(getMeasuredHeight() * this.d));
      }
    }

    public void setAnimationEnabled(boolean paramBoolean)
    {
      this.h = paramBoolean;
    }

    public void setBackAlpha(int paramInt)
    {
      this.e = paramInt;
    }

    public void setBackScaleX(float paramFloat)
    {
      this.c = paramFloat;
      invalidate();
    }

    public void setBackScaleY(float paramFloat)
    {
      this.d = paramFloat;
      int i2;
      int n;
      View localView;
      if (this.h)
      {
        i2 = getItemsCount();
        m = 0;
        n = 0;
        if (m < i2)
        {
          if (a(m).getVisibility() == 0);
          for (int i1 = 1; ; i1 = 0)
          {
            n += i1;
            m += 1;
            break;
          }
        }
        n = getMeasuredHeight() - a.a(16.0F);
        if (!this.g)
          break label177;
        m = this.f;
        if (m >= 0)
        {
          localView = a(m);
          if (localView.getVisibility() == 0);
        }
      }
      Integer localInteger;
      while (true)
      {
        m -= 1;
        break;
        localInteger = (Integer)this.i.get(localView);
        if ((localInteger != null) && (n - (localInteger.intValue() * a.a(48.0F) + a.a(32.0F)) > n * paramFloat))
        {
          invalidate();
          return;
        }
        this.f = (m - 1);
        a(localView);
      }
      label177: int m = this.f;
      label182: if (m < i2)
      {
        localView = a(m);
        if (localView.getVisibility() == 0)
          break label210;
      }
      while (true)
      {
        m += 1;
        break label182;
        break;
        label210: localInteger = (Integer)this.i.get(localView);
        if ((localInteger != null) && ((localInteger.intValue() + 1) * a.a(48.0F) - a.a(24.0F) > n * paramFloat))
          break;
        this.f = (m + 1);
        a(localView);
      }
    }

    public void setDispatchKeyEventListener(e.b paramb)
    {
      this.b = paramb;
    }

    public void setShowedFromBotton(boolean paramBoolean)
    {
      this.g = paramBoolean;
    }
  }

  public static abstract interface b
  {
    public abstract void a(KeyEvent paramKeyEvent);
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.a.e
 * JD-Core Version:    0.6.0
 */