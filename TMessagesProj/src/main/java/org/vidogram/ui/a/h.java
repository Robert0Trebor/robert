package org.vidogram.ui.a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.view.x;
import android.support.v4.view.y;
import android.text.TextUtils.TruncateAt;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager.LayoutParams;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.TextView;
import java.util.ArrayList;
import org.vidogram.messenger.a;
import org.vidogram.messenger.b;
import org.vidogram.messenger.n;
import org.vidogram.messenger.r;
import org.vidogram.ui.Components.v;

public class h extends Dialog
{
  protected static int f;
  protected static int g;
  private ArrayList<a> A = new ArrayList();
  private c B;
  protected ViewGroup a;
  protected e b;
  protected boolean c;
  protected ColorDrawable d = new ColorDrawable(-16777216);
  protected Paint e = new Paint(1);
  protected AnimatorSet h;
  private WindowInsets i;
  private Runnable j;
  private int k;
  private boolean l;
  private DialogInterface.OnClickListener m;
  private CharSequence[] n;
  private int[] o;
  private View p;
  private CharSequence q;
  private boolean r = true;
  private int s;
  private boolean t;
  private boolean u;
  private Drawable v;
  private boolean w = true;
  private boolean x = true;
  private DecelerateInterpolator y = new DecelerateInterpolator();
  private AccelerateInterpolator z = new AccelerateInterpolator();

  public h(Context paramContext, boolean paramBoolean)
  {
    super(paramContext, 2131427471);
    if (Build.VERSION.SDK_INT >= 21)
      getWindow().addFlags(-2147417856);
    this.s = ViewConfiguration.get(paramContext).getScaledTouchSlop();
    Rect localRect = new Rect();
    this.v = paramContext.getResources().getDrawable(2130838147);
    this.v.getPadding(localRect);
    g = localRect.left;
    f = localRect.top;
    this.b = new e(getContext());
    this.b.setBackgroundDrawable(this.d);
    this.u = paramBoolean;
    if (Build.VERSION.SDK_INT >= 21)
    {
      this.b.setFitsSystemWindows(true);
      this.b.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener()
      {
        @SuppressLint({"NewApi"})
        public WindowInsets onApplyWindowInsets(View paramView, WindowInsets paramWindowInsets)
        {
          h.a(h.this, paramWindowInsets);
          paramView.requestLayout();
          return paramWindowInsets.consumeSystemWindowInsets();
        }
      });
      this.b.setSystemUiVisibility(1280);
    }
    this.e.setColor(-1);
    this.d.setAlpha(0);
  }

  private void i()
  {
    if (this.h != null)
    {
      this.h.cancel();
      this.h = null;
    }
  }

  private void j()
  {
    if (this.l);
    do
    {
      return;
      this.a.setVisibility(0);
    }
    while (h());
    if (Build.VERSION.SDK_INT >= 20)
      this.b.setLayerType(2, null);
    this.a.setTranslationY(this.a.getMeasuredHeight());
    AnimatorSet localAnimatorSet = new AnimatorSet();
    localAnimatorSet.playTogether(new Animator[] { ObjectAnimator.ofFloat(this.a, "translationY", new float[] { 0.0F }), ObjectAnimator.ofInt(this.d, "alpha", new int[] { 51 }) });
    localAnimatorSet.setDuration(200L);
    localAnimatorSet.setStartDelay(20L);
    localAnimatorSet.setInterpolator(new DecelerateInterpolator());
    localAnimatorSet.addListener(new b()
    {
      public void onAnimationCancel(Animator paramAnimator)
      {
        if ((h.this.h != null) && (h.this.h.equals(paramAnimator)))
          h.this.h = null;
      }

      public void onAnimationEnd(Animator paramAnimator)
      {
        if ((h.this.h != null) && (h.this.h.equals(paramAnimator)))
        {
          h.this.h = null;
          if (h.i(h.this) != null)
            h.i(h.this).d_();
          h.this.b.setLayerType(0, null);
        }
      }
    });
    localAnimatorSet.start();
    this.h = localAnimatorSet;
  }

  public void a(int paramInt)
  {
    if (this.l)
      return;
    this.l = true;
    i();
    AnimatorSet localAnimatorSet = new AnimatorSet();
    localAnimatorSet.playTogether(new Animator[] { ObjectAnimator.ofFloat(this.a, "translationY", new float[] { this.a.getMeasuredHeight() + a.a(10.0F) }), ObjectAnimator.ofInt(this.d, "alpha", new int[] { 0 }) });
    localAnimatorSet.setDuration(180L);
    localAnimatorSet.setInterpolator(new AccelerateInterpolator());
    localAnimatorSet.addListener(new b(paramInt)
    {
      public void onAnimationCancel(Animator paramAnimator)
      {
        if ((h.this.h != null) && (h.this.h.equals(paramAnimator)))
          h.this.h = null;
      }

      public void onAnimationEnd(Animator paramAnimator)
      {
        if ((h.this.h != null) && (h.this.h.equals(paramAnimator)))
        {
          h.this.h = null;
          if (h.j(h.this) != null)
            h.j(h.this).onClick(h.this, this.a);
          a.a(new Runnable()
          {
            public void run()
            {
              try
              {
                h.k(h.this);
                return;
              }
              catch (Exception localException)
              {
                n.a("tmessages", localException);
              }
            }
          });
        }
      }
    });
    localAnimatorSet.start();
    this.h = localAnimatorSet;
  }

  public void a(c paramc)
  {
    this.B = paramc;
  }

  public void a(boolean paramBoolean)
  {
    this.w = paramBoolean;
  }

  protected boolean a()
  {
    return true;
  }

  protected boolean a(MotionEvent paramMotionEvent)
  {
    return false;
  }

  protected boolean a(View paramView, int paramInt1, int paramInt2)
  {
    return false;
  }

  protected boolean a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    return false;
  }

  public void b(boolean paramBoolean)
  {
    this.x = paramBoolean;
  }

  protected boolean b()
  {
    return true;
  }

  public FrameLayout c()
  {
    return this.b;
  }

  public ViewGroup d()
  {
    return this.a;
  }

  public void dismiss()
  {
    if (this.l);
    do
    {
      return;
      this.l = true;
      i();
    }
    while ((this.r) && (g()));
    AnimatorSet localAnimatorSet = new AnimatorSet();
    localAnimatorSet.playTogether(new Animator[] { ObjectAnimator.ofFloat(this.a, "translationY", new float[] { this.a.getMeasuredHeight() + a.a(10.0F) }), ObjectAnimator.ofInt(this.d, "alpha", new int[] { 0 }) });
    if (this.t)
    {
      int i1 = this.a.getMeasuredHeight();
      localAnimatorSet.setDuration(Math.max(60, (int)(180.0F * (i1 - this.a.getTranslationY()) / i1)));
      this.t = false;
    }
    while (true)
    {
      localAnimatorSet.setInterpolator(new AccelerateInterpolator());
      localAnimatorSet.addListener(new b()
      {
        public void onAnimationCancel(Animator paramAnimator)
        {
          if ((h.this.h != null) && (h.this.h.equals(paramAnimator)))
            h.this.h = null;
        }

        public void onAnimationEnd(Animator paramAnimator)
        {
          if ((h.this.h != null) && (h.this.h.equals(paramAnimator)))
          {
            h.this.h = null;
            a.a(new Runnable()
            {
              public void run()
              {
                try
                {
                  h.this.f();
                  return;
                }
                catch (Exception localException)
                {
                  n.a("tmessages", localException);
                }
              }
            });
          }
        }
      });
      localAnimatorSet.start();
      this.h = localAnimatorSet;
      return;
      localAnimatorSet.setDuration(180L);
    }
  }

  public boolean e()
  {
    return this.l;
  }

  public void f()
  {
    try
    {
      super.dismiss();
      return;
    }
    catch (Exception localException)
    {
      n.a("tmessages", localException);
    }
  }

  protected boolean g()
  {
    return false;
  }

  protected boolean h()
  {
    return false;
  }

  public void onAttachedToWindow()
  {
    super.onAttachedToWindow();
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    paramBundle = getWindow();
    paramBundle.setWindowAnimations(2131427459);
    setContentView(this.b, new ViewGroup.LayoutParams(-1, -1));
    Object localObject;
    int i4;
    int i1;
    int i3;
    if (this.a == null)
    {
      this.a = new FrameLayout(getContext())
      {
        public boolean hasOverlappingRendering()
        {
          return false;
        }
      };
      this.a.setBackgroundDrawable(this.v);
      localObject = this.a;
      i4 = g;
      if (this.w)
      {
        i1 = a.a(8.0F);
        int i5 = f;
        int i6 = g;
        if (!this.x)
          break label305;
        i3 = a.a(8.0F);
        label117: ((ViewGroup)localObject).setPadding(i4, i5 + i1, i6, i3);
      }
    }
    else
    {
      if (Build.VERSION.SDK_INT >= 21)
        this.a.setFitsSystemWindows(true);
      this.a.setVisibility(4);
      this.b.addView(this.a, 0, v.b(-1, -2, 80));
      if (this.p == null)
        break label310;
      if (this.p.getParent() != null)
        ((ViewGroup)this.p.getParent()).removeView(this.p);
      this.a.addView(this.p, v.b(-1, -2, 51));
    }
    label305: label310: label448: label579: 
    while (true)
    {
      localObject = paramBundle.getAttributes();
      ((WindowManager.LayoutParams)localObject).width = -1;
      ((WindowManager.LayoutParams)localObject).gravity = 51;
      ((WindowManager.LayoutParams)localObject).dimAmount = 0.0F;
      ((WindowManager.LayoutParams)localObject).flags &= -3;
      if (!this.u)
        ((WindowManager.LayoutParams)localObject).flags |= 131072;
      ((WindowManager.LayoutParams)localObject).height = -1;
      paramBundle.setAttributes((WindowManager.LayoutParams)localObject);
      return;
      i1 = 0;
      break;
      i3 = 0;
      break label117;
      if (this.q != null)
      {
        localObject = new TextView(getContext());
        ((TextView)localObject).setLines(1);
        ((TextView)localObject).setSingleLine(true);
        ((TextView)localObject).setText(this.q);
        ((TextView)localObject).setTextColor(-9079435);
        ((TextView)localObject).setTextSize(1, 16.0F);
        ((TextView)localObject).setEllipsize(TextUtils.TruncateAt.MIDDLE);
        ((TextView)localObject).setPadding(a.a(16.0F), 0, a.a(16.0F), a.a(8.0F));
        ((TextView)localObject).setGravity(16);
        this.a.addView((View)localObject, v.a(-1, 48.0F));
        ((TextView)localObject).setOnTouchListener(new View.OnTouchListener()
        {
          public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
          {
            return true;
          }
        });
      }
      int i2;
      for (i1 = 48; ; i2 = 0)
      {
        if (this.n == null)
          break label579;
        i3 = 0;
        CharSequence localCharSequence;
        if (i3 < this.n.length)
        {
          localObject = new a(getContext(), 0);
          localCharSequence = this.n[i3];
          if (this.o == null)
            break label570;
        }
        for (i4 = this.o[i3]; ; i4 = 0)
        {
          ((a)localObject).a(localCharSequence, i4);
          this.a.addView((View)localObject, v.a(-1, 48.0F, 51, 0.0F, i1, 0.0F, 0.0F));
          ((a)localObject).setTag(Integer.valueOf(i3));
          ((a)localObject).setOnClickListener(new View.OnClickListener()
          {
            public void onClick(View paramView)
            {
              h.this.a(((Integer)paramView.getTag()).intValue());
            }
          });
          this.A.add(localObject);
          i3 += 1;
          i1 += 48;
          break label448;
          break;
        }
      }
    }
  }

  public void setTitle(CharSequence paramCharSequence)
  {
    this.q = paramCharSequence;
  }

  public void show()
  {
    super.show();
    if (this.u)
      getWindow().setSoftInputMode(16);
    this.l = false;
    i();
    if (this.a.getMeasuredHeight() == 0)
      this.a.measure(View.MeasureSpec.makeMeasureSpec(a.c.x, -2147483648), View.MeasureSpec.makeMeasureSpec(a.c.y, -2147483648));
    this.d.setAlpha(0);
    if (Build.VERSION.SDK_INT >= 18)
    {
      this.k = 2;
      5 local5 = new Runnable()
      {
        public void run()
        {
          if ((h.g(h.this) != this) || (h.a(h.this)))
            return;
          h.a(h.this, null);
          h.h(h.this);
        }
      };
      this.j = local5;
      a.a(local5, 150L);
      return;
    }
    j();
  }

  public static class a extends FrameLayout
  {
    private TextView a;
    private ImageView b;

    public a(Context paramContext, int paramInt)
    {
      super();
      setBackgroundResource(2130837946);
      setPadding(a.a(16.0F), 0, a.a(16.0F), 0);
      this.b = new ImageView(paramContext);
      this.b.setScaleType(ImageView.ScaleType.CENTER);
      ImageView localImageView = this.b;
      int i;
      if (r.a)
      {
        i = 5;
        addView(localImageView, v.b(24, 24, i | 0x10));
        this.a = new TextView(paramContext);
        this.a.setLines(1);
        this.a.setSingleLine(true);
        this.a.setGravity(1);
        this.a.setEllipsize(TextUtils.TruncateAt.END);
        if (paramInt != 0)
          break label189;
        this.a.setTextColor(-14606047);
        this.a.setTextSize(1, 16.0F);
        paramContext = this.a;
        if (!r.a)
          break label184;
        paramInt = 5;
        label162: addView(paramContext, v.b(-2, -2, paramInt | 0x10));
      }
      label184: label189: 
      do
      {
        return;
        i = 3;
        break;
        paramInt = 3;
        break label162;
      }
      while (paramInt != 1);
      this.a.setGravity(17);
      this.a.setTextColor(-14606047);
      this.a.setTextSize(1, 14.0F);
      this.a.setTypeface(a.a("fonts/rmedium.ttf"));
      addView(this.a, v.a(-1, -1.0F));
    }

    public void a(CharSequence paramCharSequence, int paramInt)
    {
      this.a.setText(paramCharSequence);
      if (paramInt != 0)
      {
        this.b.setImageResource(paramInt);
        this.b.setVisibility(0);
        paramCharSequence = this.a;
        if (r.a)
        {
          paramInt = 0;
          if (!r.a)
            break label71;
        }
        label71: for (int i = a.a(56.0F); ; i = 0)
        {
          paramCharSequence.setPadding(paramInt, 0, i, 0);
          return;
          paramInt = a.a(56.0F);
          break;
        }
      }
      this.b.setVisibility(4);
      this.a.setPadding(0, 0, 0, 0);
    }

    protected void onMeasure(int paramInt1, int paramInt2)
    {
      super.onMeasure(paramInt1, View.MeasureSpec.makeMeasureSpec(a.a(48.0F), 1073741824));
    }

    public void setGravity(int paramInt)
    {
      this.a.setGravity(paramInt);
    }

    public void setTextColor(int paramInt)
    {
      this.a.setTextColor(paramInt);
    }
  }

  public static class b
    implements h.c
  {
    public void d_()
    {
    }
  }

  public static abstract interface c
  {
    public abstract void d_();
  }

  public static class d
  {
    private h a;

    public d(Context paramContext)
    {
      this.a = new h(paramContext, false);
    }

    public d a(View paramView)
    {
      h.a(this.a, paramView);
      return this;
    }

    public d a(CharSequence paramCharSequence)
    {
      h.a(this.a, paramCharSequence);
      return this;
    }

    public d a(boolean paramBoolean)
    {
      h.c(this.a, paramBoolean);
      return this;
    }

    public d a(CharSequence[] paramArrayOfCharSequence, DialogInterface.OnClickListener paramOnClickListener)
    {
      h.a(this.a, paramArrayOfCharSequence);
      h.a(this.a, paramOnClickListener);
      return this;
    }

    public h a()
    {
      return this.a;
    }

    public d b(boolean paramBoolean)
    {
      h.d(this.a, paramBoolean);
      return this;
    }

    public h c(boolean paramBoolean)
    {
      this.a.c = paramBoolean;
      return this.a;
    }
  }

  protected class e extends FrameLayout
    implements x
  {
    private VelocityTracker b = null;
    private int c;
    private int d;
    private int e = -1;
    private boolean f = false;
    private boolean g = false;
    private AnimatorSet h = null;
    private y i = new y(this);

    public e(Context arg2)
    {
      super();
    }

    private void a()
    {
      if (this.h != null)
      {
        this.h.cancel();
        this.h = null;
      }
    }

    private void a(float paramFloat1, float paramFloat2)
    {
      float f1 = h.this.a.getTranslationY();
      if (((f1 < a.a(0.8F, false)) && ((paramFloat2 < 3500.0F) || (Math.abs(paramFloat2) < Math.abs(paramFloat1)))) || ((paramFloat2 < 0.0F) && (Math.abs(paramFloat2) >= 3500.0F)));
      for (int j = 1; j == 0; j = 0)
      {
        boolean bool = h.b(h.this);
        h.a(h.this, false);
        h.b(h.this, true);
        h.this.dismiss();
        h.a(h.this, bool);
        return;
      }
      this.h = new AnimatorSet();
      this.h.playTogether(new Animator[] { ObjectAnimator.ofFloat(h.this.a, "translationY", new float[] { 0.0F }) });
      this.h.setDuration((int)(150.0F * (f1 / a.a(0.8F, false))));
      this.h.setInterpolator(new DecelerateInterpolator());
      this.h.addListener(new b()
      {
        public void onAnimationEnd(Animator paramAnimator)
        {
          if ((h.e.a(h.e.this) != null) && (h.e.a(h.e.this).equals(paramAnimator)))
            h.e.a(h.e.this, null);
        }
      });
      this.h.start();
    }

    public int getNestedScrollAxes()
    {
      return this.i.a();
    }

    public boolean hasOverlappingRendering()
    {
      return false;
    }

    public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
    {
      if (h.this.a())
        return onTouchEvent(paramMotionEvent);
      return super.onInterceptTouchEvent(paramMotionEvent);
    }

    protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      h.e(h.this);
      int j = paramInt1;
      int k = paramInt3;
      if (h.this.a != null)
      {
        m = paramInt4 - paramInt2 - h.this.a.getMeasuredHeight();
        j = paramInt1;
        k = paramInt3;
        if (h.d(h.this) != null)
        {
          j = paramInt1;
          k = paramInt3;
          if (Build.VERSION.SDK_INT >= 21)
          {
            j = paramInt1 + h.d(h.this).getSystemWindowInsetLeft();
            k = paramInt3 + h.d(h.this).getSystemWindowInsetLeft();
          }
        }
        paramInt1 = (k - j - h.this.a.getMeasuredWidth()) / 2;
        h.this.a.layout(paramInt1, m, h.this.a.getMeasuredWidth() + paramInt1, h.this.a.getMeasuredHeight() + m);
      }
      int n = getChildCount();
      int m = 0;
      if (m < n)
      {
        View localView = getChildAt(m);
        if ((localView.getVisibility() == 8) || (localView == h.this.a));
        do
        {
          m += 1;
          break;
        }
        while (h.this.a(localView, j, paramInt2, k, paramInt4));
        FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)localView.getLayoutParams();
        int i1 = localView.getMeasuredWidth();
        int i2 = localView.getMeasuredHeight();
        paramInt3 = localLayoutParams.gravity;
        paramInt1 = paramInt3;
        if (paramInt3 == -1)
          paramInt1 = 51;
        switch (paramInt1 & 0x7 & 0x7)
        {
        default:
          paramInt3 = localLayoutParams.leftMargin;
          label319: switch (paramInt1 & 0x70)
          {
          default:
            paramInt1 = localLayoutParams.topMargin;
          case 48:
          case 16:
          case 80:
          }
        case 1:
        case 5:
        }
        while (true)
        {
          localView.layout(paramInt3, paramInt1, i1 + paramInt3, i2 + paramInt1);
          break;
          paramInt3 = (k - j - i1) / 2 + localLayoutParams.leftMargin - localLayoutParams.rightMargin;
          break label319;
          paramInt3 = k - i1 - localLayoutParams.rightMargin;
          break label319;
          paramInt1 = localLayoutParams.topMargin;
          continue;
          paramInt1 = (paramInt4 - paramInt2 - i2) / 2 + localLayoutParams.topMargin - localLayoutParams.bottomMargin;
          continue;
          paramInt1 = paramInt4 - paramInt2 - i2 - localLayoutParams.bottomMargin;
        }
      }
      if ((h.f(h.this) == 0) && (h.g(h.this) != null))
      {
        a.b(h.g(h.this));
        h.g(h.this).run();
        h.a(h.this, null);
      }
    }

    protected void onMeasure(int paramInt1, int paramInt2)
    {
      int j = View.MeasureSpec.getSize(paramInt1);
      paramInt1 = View.MeasureSpec.getSize(paramInt2);
      int k;
      if ((h.d(h.this) != null) && (Build.VERSION.SDK_INT >= 21))
      {
        paramInt2 = h.d(h.this).getSystemWindowInsetRight();
        k = h.d(h.this).getSystemWindowInsetLeft();
        paramInt1 -= h.d(h.this).getSystemWindowInsetBottom();
      }
      for (paramInt2 = j - (paramInt2 + k); ; paramInt2 = j)
      {
        setMeasuredDimension(paramInt2, paramInt1);
        label161: label169: View localView;
        if (paramInt2 < paramInt1)
        {
          j = 1;
          if (h.this.a != null)
          {
            if (h.this.c)
              break label269;
            if (!a.c())
              break label216;
            j = View.MeasureSpec.makeMeasureSpec((int)(Math.min(a.c.x, a.c.y) * 0.8F) + h.g * 2, 1073741824);
            h.this.a.measure(j, View.MeasureSpec.makeMeasureSpec(paramInt1, -2147483648));
          }
          k = getChildCount();
          j = 0;
          if (j >= k)
            break label341;
          localView = getChildAt(j);
          if ((localView.getVisibility() != 8) && (localView != h.this.a))
            break label302;
        }
        while (true)
        {
          j += 1;
          break label169;
          j = 0;
          break;
          label216: if (j != 0);
          for (j = h.g * 2 + paramInt2; ; j = (int)Math.max(paramInt2 * 0.8F, Math.min(a.a(480.0F), paramInt2)) + h.g * 2)
          {
            j = View.MeasureSpec.makeMeasureSpec(j, 1073741824);
            break;
          }
          label269: h.this.a.measure(View.MeasureSpec.makeMeasureSpec(h.g * 2 + paramInt2, 1073741824), View.MeasureSpec.makeMeasureSpec(paramInt1, -2147483648));
          break label161;
          label302: if (h.this.a(localView, paramInt2, paramInt1))
            continue;
          measureChildWithMargins(localView, View.MeasureSpec.makeMeasureSpec(paramInt2, 1073741824), 0, View.MeasureSpec.makeMeasureSpec(paramInt1, 1073741824), 0);
        }
        label341: return;
      }
    }

    public boolean onNestedFling(View paramView, float paramFloat1, float paramFloat2, boolean paramBoolean)
    {
      return false;
    }

    public boolean onNestedPreFling(View paramView, float paramFloat1, float paramFloat2)
    {
      return false;
    }

    public void onNestedPreScroll(View paramView, int paramInt1, int paramInt2, int[] paramArrayOfInt)
    {
      float f1 = 0.0F;
      if (h.a(h.this));
      float f2;
      do
      {
        return;
        a();
        f2 = h.this.a.getTranslationY();
      }
      while ((f2 <= 0.0F) || (paramInt2 <= 0));
      f2 -= paramInt2;
      paramArrayOfInt[1] = paramInt2;
      if (f2 < 0.0F)
        paramArrayOfInt[1] = (int)(paramArrayOfInt[1] + 0.0F);
      while (true)
      {
        h.this.a.setTranslationY(f1);
        return;
        f1 = f2;
      }
    }

    public void onNestedScroll(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      float f1 = 0.0F;
      if (h.a(h.this));
      do
      {
        return;
        a();
      }
      while (paramInt4 == 0);
      float f2 = h.this.a.getTranslationY() - paramInt4;
      if (f2 < 0.0F);
      while (true)
      {
        h.this.a.setTranslationY(f1);
        return;
        f1 = f2;
      }
    }

    public void onNestedScrollAccepted(View paramView1, View paramView2, int paramInt)
    {
      this.i.a(paramView1, paramView2, paramInt);
      if (h.a(h.this))
        return;
      a();
    }

    public boolean onStartNestedScroll(View paramView1, View paramView2, int paramInt)
    {
      return (!h.a(h.this)) && (paramInt == 2) && (!h.this.a());
    }

    public void onStopNestedScroll(View paramView)
    {
      this.i.a(paramView);
      if (h.a(h.this))
        return;
      h.this.a.getTranslationY();
      a(0.0F, 0.0F);
    }

    public boolean onTouchEvent(MotionEvent paramMotionEvent)
    {
      float f1 = 0.0F;
      int j = 1;
      if (h.a(h.this))
        j = 0;
      do
        return j;
      while (h.this.a(paramMotionEvent));
      if ((h.this.b()) && (paramMotionEvent != null) && ((paramMotionEvent.getAction() == 0) || (paramMotionEvent.getAction() == 2)) && (!this.g) && (!this.f))
      {
        this.c = (int)paramMotionEvent.getX();
        this.d = (int)paramMotionEvent.getY();
        if ((this.d < h.this.a.getTop()) || (this.c < h.this.a.getLeft()) || (this.c > h.this.a.getRight()))
        {
          h.this.dismiss();
          return true;
        }
        this.e = paramMotionEvent.getPointerId(0);
        this.f = true;
        a();
        if (this.b != null)
          this.b.clear();
      }
      label205: float f2;
      while (true)
      {
        if ((!this.g) && (h.this.a()))
          break label568;
        j = 1;
        return j;
        if ((paramMotionEvent == null) || (paramMotionEvent.getAction() != 2) || (paramMotionEvent.getPointerId(0) != this.e))
          break;
        if (this.b == null)
          this.b = VelocityTracker.obtain();
        f2 = Math.abs((int)(paramMotionEvent.getX() - this.c));
        float f3 = (int)paramMotionEvent.getY() - this.d;
        this.b.addMovement(paramMotionEvent);
        if ((this.f) && (!this.g) && (f3 > 0.0F) && (f3 / 3.0F > Math.abs(f2)) && (Math.abs(f3) >= h.c(h.this)))
        {
          this.d = (int)paramMotionEvent.getY();
          this.f = false;
          this.g = true;
          requestDisallowInterceptTouchEvent(true);
          continue;
        }
        if (!this.g)
          continue;
        f2 = h.this.a.getTranslationY() + f3;
        if (f2 >= 0.0F)
          break label574;
      }
      while (true)
      {
        h.this.a.setTranslationY(f1);
        this.d = (int)paramMotionEvent.getY();
        break;
        if ((paramMotionEvent != null) && ((paramMotionEvent == null) || (paramMotionEvent.getPointerId(0) != this.e) || ((paramMotionEvent.getAction() != 3) && (paramMotionEvent.getAction() != 1) && (paramMotionEvent.getAction() != 6))))
          break;
        if (this.b == null)
          this.b = VelocityTracker.obtain();
        this.b.computeCurrentVelocity(1000);
        f1 = h.this.a.getTranslationY();
        if ((this.g) || (f1 != 0.0F))
          a(this.b.getXVelocity(), this.b.getYVelocity());
        for (this.g = false; ; this.g = false)
        {
          if (this.b != null)
          {
            this.b.recycle();
            this.b = null;
          }
          this.e = -1;
          break;
          this.f = false;
        }
        label568: j = 0;
        break label205;
        label574: f1 = f2;
      }
    }

    public void requestDisallowInterceptTouchEvent(boolean paramBoolean)
    {
      if ((this.f) && (!this.g))
        onTouchEvent(null);
      super.requestDisallowInterceptTouchEvent(paramBoolean);
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.a.h
 * JD-Core Version:    0.6.0
 */