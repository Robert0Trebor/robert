package org.vidogram.ui.a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class b extends FrameLayout
{
  private static Drawable f;
  private static Drawable g;
  private static Paint h;
  private Runnable A;
  private Runnable B;
  private boolean C;
  private View D;
  private boolean E;
  private Runnable F;
  private float G = 0.0F;
  private long H;
  private String I;
  private a J = null;
  public float a;
  protected boolean b;
  protected boolean c;
  protected Activity d = null;
  public ArrayList<g> e = null;
  private Runnable i;
  private Runnable j;
  private b k;
  private b l;
  private i m;
  private a n;
  private AnimatorSet o;
  private DecelerateInterpolator p = new DecelerateInterpolator(1.5F);
  private AccelerateDecelerateInterpolator q = new AccelerateDecelerateInterpolator();
  private boolean r;
  private int s;
  private int t;
  private VelocityTracker u;
  private boolean v;
  private boolean w;
  private long x;
  private boolean y;
  private int z;

  public b(Context paramContext)
  {
    super(paramContext);
    this.d = ((Activity)paramContext);
    if (g == null)
    {
      g = getResources().getDrawable(2130837937);
      f = getResources().getDrawable(2130837787);
      h = new Paint();
    }
  }

  private void a(MotionEvent paramMotionEvent)
  {
    this.r = false;
    this.b = true;
    this.s = (int)paramMotionEvent.getX();
    this.l.setVisibility(0);
    this.v = false;
    g localg = (g)this.e.get(this.e.size() - 2);
    Object localObject = localg.b;
    if (localObject == null)
      paramMotionEvent = localg.a(this.d);
    while (true)
    {
      localObject = (ViewGroup)paramMotionEvent.getParent();
      if (localObject != null)
        ((ViewGroup)localObject).removeView(paramMotionEvent);
      if ((localg.d != null) && (localg.d.getAddToContainer()))
      {
        localObject = (ViewGroup)localg.d.getParent();
        if (localObject != null)
          ((ViewGroup)localObject).removeView(localg.d);
        if (this.E)
          localg.d.setOccupyStatusBar(false);
        this.l.addView(localg.d);
        localg.d.setTitleOverlayText(this.I);
      }
      this.l.addView(paramMotionEvent);
      localObject = paramMotionEvent.getLayoutParams();
      ((ViewGroup.LayoutParams)localObject).width = -1;
      ((ViewGroup.LayoutParams)localObject).height = -1;
      paramMotionEvent.setLayoutParams((ViewGroup.LayoutParams)localObject);
      if ((!localg.h) && (paramMotionEvent.getBackground() == null))
        paramMotionEvent.setBackgroundColor(-1);
      localg.i();
      return;
      ViewGroup localViewGroup = (ViewGroup)((View)localObject).getParent();
      paramMotionEvent = (MotionEvent)localObject;
      if (localViewGroup == null)
        continue;
      localViewGroup.removeView((View)localObject);
      paramMotionEvent = (MotionEvent)localObject;
    }
  }

  private void a(boolean paramBoolean, g paramg)
  {
    if (paramg == null)
      return;
    paramg.j();
    if (paramBoolean)
    {
      paramg.g();
      paramg.a(null);
      this.e.remove(paramg);
    }
    while (true)
    {
      this.l.setVisibility(8);
      return;
      if (paramg.b != null)
      {
        localViewGroup = (ViewGroup)paramg.b.getParent();
        if (localViewGroup != null)
          localViewGroup.removeView(paramg.b);
      }
      if ((paramg.d == null) || (!paramg.d.getAddToContainer()))
        continue;
      ViewGroup localViewGroup = (ViewGroup)paramg.d.getParent();
      if (localViewGroup == null)
        continue;
      localViewGroup.removeView(paramg.d);
    }
  }

  private void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (paramBoolean2)
    {
      this.G = 0.0F;
      this.H = (System.nanoTime() / 1000000L);
      if (Build.VERSION.SDK_INT > 15)
      {
        this.k.setLayerType(2, null);
        this.l.setLayerType(2, null);
      }
    }
    8 local8 = new Runnable(paramBoolean2, paramBoolean1)
    {
      public void run()
      {
        long l1 = 18L;
        if (b.d(b.this) != this)
          return;
        b.b(b.this, null);
        if (this.a)
          b.a(b.this, System.currentTimeMillis());
        long l3 = System.nanoTime() / 1000000L;
        long l2 = l3 - b.e(b.this);
        if (l2 > 18L);
        while (true)
        {
          b.b(b.this, l3);
          b localb = b.this;
          float f = b.f(b.this);
          b.a(localb, (float)l1 / 150.0F + f);
          if (b.f(b.this) > 1.0F)
            b.a(b.this, 1.0F);
          f = b.g(b.this).getInterpolation(b.f(b.this));
          if (this.b)
          {
            b.b(b.this).setAlpha(f);
            b.b(b.this).setTranslationX((1.0F - f) * org.vidogram.messenger.a.a(48.0F));
          }
          while (b.f(b.this) < 1.0F)
          {
            b.a(b.this, this.b, false);
            return;
            b.c(b.this).setAlpha(1.0F - f);
            b.c(b.this).setTranslationX(f * org.vidogram.messenger.a.a(48.0F));
          }
          b.b(b.this, false);
          return;
          l1 = l2;
        }
      }
    };
    this.F = local8;
    org.vidogram.messenger.a.a(local8);
  }

  private void c(boolean paramBoolean)
  {
    Object localObject;
    if (!paramBoolean)
    {
      localObject = (g)this.e.get(this.e.size() - 1);
      ((g)localObject).j();
      ((g)localObject).g();
      ((g)localObject).a(null);
      this.e.remove(this.e.size() - 1);
      localObject = this.k;
      this.k = this.l;
      this.l = ((b)localObject);
      bringChildToFront(this.k);
      localObject = (g)this.e.get(this.e.size() - 1);
      this.n = ((g)localObject).d;
      ((g)localObject).i();
      ((g)localObject).o();
    }
    while (true)
    {
      this.l.setVisibility(8);
      this.b = false;
      this.c = false;
      this.k.setTranslationX(0.0F);
      this.l.setTranslationX(0.0F);
      setInnerTranslationX(0.0F);
      return;
      localObject = (g)this.e.get(this.e.size() - 2);
      ((g)localObject).j();
      if (((g)localObject).b != null)
      {
        localViewGroup = (ViewGroup)((g)localObject).b.getParent();
        if (localViewGroup != null)
          localViewGroup.removeView(((g)localObject).b);
      }
      if ((((g)localObject).d == null) || (!((g)localObject).d.getAddToContainer()))
        continue;
      ViewGroup localViewGroup = (ViewGroup)((g)localObject).d.getParent();
      if (localViewGroup == null)
        continue;
      localViewGroup.removeView(((g)localObject).d);
    }
  }

  private void d(g paramg)
  {
    paramg.j();
    paramg.g();
    paramg.a(null);
    this.e.remove(paramg);
    this.l.setVisibility(8);
    bringChildToFront(this.k);
  }

  private void d(boolean paramBoolean)
  {
    e(false);
    f(false);
    if (this.i != null)
    {
      org.vidogram.messenger.a.b(this.i);
      this.i = null;
    }
    if (this.o != null)
    {
      if (paramBoolean)
        this.o.cancel();
      this.o = null;
    }
    if (this.F != null)
    {
      org.vidogram.messenger.a.b(this.F);
      this.F = null;
    }
    setAlpha(1.0F);
    this.k.setAlpha(1.0F);
    this.k.setScaleX(1.0F);
    this.k.setScaleY(1.0F);
    this.l.setAlpha(1.0F);
    this.l.setScaleX(1.0F);
    this.l.setScaleY(1.0F);
  }

  private void e(g paramg)
  {
    paramg.j();
    paramg.g();
    paramg.a(null);
    this.e.remove(paramg);
  }

  private void e(boolean paramBoolean)
  {
    if ((this.w) && (this.A != null))
    {
      this.w = false;
      this.x = 0L;
      if (paramBoolean)
        new Handler().post(new Runnable()
        {
          public void run()
          {
            b.k(b.this).run();
            b.d(b.this, null);
          }
        });
    }
    else
    {
      return;
    }
    this.A.run();
    this.A = null;
  }

  private void f(boolean paramBoolean)
  {
    if ((this.w) && (this.B != null))
    {
      this.w = false;
      this.x = 0L;
      if (paramBoolean)
        new Handler().post(new Runnable()
        {
          public void run()
          {
            b.l(b.this).run();
            b.e(b.this, null);
          }
        });
    }
    else
    {
      return;
    }
    this.B.run();
    this.B = null;
  }

  public void a()
  {
    if (!this.e.isEmpty())
      ((g)this.e.get(this.e.size() - 1)).m();
  }

  public void a(Intent paramIntent, int paramInt)
  {
    if (this.d == null);
    do
    {
      return;
      if (!this.w)
        continue;
      if (this.o != null)
      {
        this.o.cancel();
        this.o = null;
      }
      if (this.A != null)
        e(false);
      while (true)
      {
        this.k.invalidate();
        if (paramIntent == null)
          break;
        this.d.startActivityForResult(paramIntent, paramInt);
        return;
        if (this.B == null)
          continue;
        f(false);
      }
    }
    while (paramIntent == null);
    this.d.startActivityForResult(paramIntent, paramInt);
  }

  public void a(Canvas paramCanvas, int paramInt)
  {
    if (f != null)
    {
      f.setBounds(0, paramInt, getMeasuredWidth(), f.getIntrinsicHeight() + paramInt);
      f.draw(paramCanvas);
    }
  }

  public void a(Object paramObject)
  {
    if (this.n != null)
      this.n.setVisibility(8);
    this.y = true;
  }

  public void a(ArrayList<g> paramArrayList)
  {
    this.e = paramArrayList;
    this.l = new b(this.d);
    addView(this.l);
    paramArrayList = (FrameLayout.LayoutParams)this.l.getLayoutParams();
    paramArrayList.width = -1;
    paramArrayList.height = -1;
    paramArrayList.gravity = 51;
    this.l.setLayoutParams(paramArrayList);
    this.k = new b(this.d);
    addView(this.k);
    paramArrayList = (FrameLayout.LayoutParams)this.k.getLayoutParams();
    paramArrayList.width = -1;
    paramArrayList.height = -1;
    paramArrayList.gravity = 51;
    this.k.setLayoutParams(paramArrayList);
    paramArrayList = this.e.iterator();
    while (paramArrayList.hasNext())
      ((g)paramArrayList.next()).a(this);
  }

  public void a(boolean paramBoolean)
  {
    if (((this.J != null) && (!this.J.a(this))) || (f()) || (this.e.isEmpty()))
      return;
    if (this.d.getCurrentFocus() != null)
      org.vidogram.messenger.a.b(this.d.getCurrentFocus());
    setInnerTranslationX(0.0F);
    int i1;
    g localg;
    if ((paramBoolean) && (this.d.getSharedPreferences("mainconfig", 0).getBoolean("view_animations", true)))
    {
      i1 = 1;
      localg = (g)this.e.get(this.e.size() - 1);
      if (this.e.size() <= 1)
        break label733;
    }
    label525: label733: for (Object localObject1 = (g)this.e.get(this.e.size() - 2); ; localObject1 = null)
    {
      if (localObject1 != null)
      {
        Object localObject2 = this.k;
        this.k = this.l;
        this.l = ((b)localObject2);
        this.k.setVisibility(0);
        ((g)localObject1).a(this);
        Object localObject3 = ((g)localObject1).b;
        if (localObject3 == null)
          localObject2 = ((g)localObject1).a(this.d);
        while (true)
        {
          if ((((g)localObject1).d != null) && (((g)localObject1).d.getAddToContainer()))
          {
            if (this.E)
              ((g)localObject1).d.setOccupyStatusBar(false);
            localObject3 = (ViewGroup)((g)localObject1).d.getParent();
            if (localObject3 != null)
              ((ViewGroup)localObject3).removeView(((g)localObject1).d);
            this.k.addView(((g)localObject1).d);
            ((g)localObject1).d.setTitleOverlayText(this.I);
          }
          this.k.addView((View)localObject2);
          localObject3 = ((View)localObject2).getLayoutParams();
          ((ViewGroup.LayoutParams)localObject3).width = -1;
          ((ViewGroup.LayoutParams)localObject3).height = -1;
          ((View)localObject2).setLayoutParams((ViewGroup.LayoutParams)localObject3);
          ((g)localObject1).a(true, true);
          localg.a(false, false);
          ((g)localObject1).i();
          this.n = ((g)localObject1).d;
          if ((!((g)localObject1).h) && (((View)localObject2).getBackground() == null))
            ((View)localObject2).setBackgroundColor(-1);
          if (i1 == 0)
            d(localg);
          if (i1 == 0)
            break label525;
          this.x = System.currentTimeMillis();
          this.w = true;
          this.A = new Runnable(localg, (g)localObject1)
          {
            public void run()
            {
              if (Build.VERSION.SDK_INT > 15)
              {
                b.b(b.this).setLayerType(0, null);
                b.c(b.this).setLayerType(0, null);
              }
              b.a(b.this, this.a);
              b.c(b.this).setTranslationX(0.0F);
              this.a.b(false, false);
              this.b.b(true, true);
              this.b.o();
            }
          };
          localObject1 = localg.a(false, new Runnable()
          {
            public void run()
            {
              b.b(b.this, false);
            }
          });
          if (localObject1 != null)
            break label511;
          if ((!b.a(this.k)) && (!b.a(this.l)))
            break label504;
          this.i = new Runnable()
          {
            public void run()
            {
              if (b.a(b.this) != this)
                return;
              b.a(b.this, false, true);
            }
          };
          org.vidogram.messenger.a.a(this.i, 200L);
          return;
          i1 = 0;
          break;
          ViewGroup localViewGroup = (ViewGroup)((View)localObject3).getParent();
          localObject2 = localObject3;
          if (localViewGroup == null)
            continue;
          localViewGroup.removeView((View)localObject3);
          localObject2 = localObject3;
        }
        label504: a(false, true);
        return;
        label511: if (Build.VERSION.SDK_INT > 15);
        this.o = ((AnimatorSet)localObject1);
        return;
        localg.b(false, false);
        ((g)localObject1).b(true, true);
        ((g)localObject1).o();
        return;
      }
      if (this.C)
      {
        this.x = System.currentTimeMillis();
        this.w = true;
        this.A = new Runnable(localg)
        {
          public void run()
          {
            b.b(b.this, this.a);
            b.this.setVisibility(8);
            if (b.i(b.this) != null)
              b.i(b.this).setVisibility(8);
            if (b.j(b.this) != null)
              b.j(b.this).a(true, false);
          }
        };
        localObject1 = new ArrayList();
        ((ArrayList)localObject1).add(ObjectAnimator.ofFloat(this, "alpha", new float[] { 1.0F, 0.0F }));
        if (this.D != null)
          ((ArrayList)localObject1).add(ObjectAnimator.ofFloat(this.D, "alpha", new float[] { 1.0F, 0.0F }));
        this.o = new AnimatorSet();
        this.o.playTogether((Collection)localObject1);
        this.o.setInterpolator(this.q);
        this.o.setDuration(200L);
        this.o.addListener(new org.vidogram.messenger.b()
        {
          public void onAnimationEnd(Animator paramAnimator)
          {
            b.b(b.this, false);
          }

          public void onAnimationStart(Animator paramAnimator)
          {
            b.a(b.this, System.currentTimeMillis());
          }
        });
        this.o.start();
        return;
      }
      e(localg);
      setVisibility(8);
      if (this.D == null)
        break;
      this.D.setVisibility(8);
      return;
    }
  }

  public boolean a(g paramg)
  {
    return a(paramg, false, false, true);
  }

  public boolean a(g paramg, int paramInt)
  {
    if (((this.J != null) && (!this.J.a(paramg, this))) || (!paramg.f()))
      return false;
    paramg.a(this);
    if (paramInt == -1)
    {
      if (!this.e.isEmpty())
      {
        g localg = (g)this.e.get(this.e.size() - 1);
        localg.j();
        ViewGroup localViewGroup;
        if ((localg.d != null) && (localg.d.getAddToContainer()))
        {
          localViewGroup = (ViewGroup)localg.d.getParent();
          if (localViewGroup != null)
            localViewGroup.removeView(localg.d);
        }
        if (localg.b != null)
        {
          localViewGroup = (ViewGroup)localg.b.getParent();
          if (localViewGroup != null)
            localViewGroup.removeView(localg.b);
        }
      }
      this.e.add(paramg);
    }
    while (true)
    {
      return true;
      this.e.add(paramInt, paramg);
    }
  }

  public boolean a(g paramg, boolean paramBoolean)
  {
    return a(paramg, paramBoolean, false, true);
  }

  public boolean a(g paramg, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    if ((f()) || ((this.J != null) && (paramBoolean3) && (!this.J.a(paramg, paramBoolean1, paramBoolean2, this))) || (!paramg.f()))
      return false;
    if (this.d.getCurrentFocus() != null)
      org.vidogram.messenger.a.b(this.d.getCurrentFocus());
    int i1;
    Object localObject1;
    label125: Object localObject3;
    Object localObject2;
    if ((!paramBoolean2) && (this.d.getSharedPreferences("mainconfig", 0).getBoolean("view_animations", true)))
    {
      i1 = 1;
      if (this.e.isEmpty())
        break label584;
      localObject1 = (g)this.e.get(this.e.size() - 1);
      paramg.a(this);
      localObject3 = paramg.b;
      if (localObject3 != null)
        break label590;
      localObject2 = paramg.a(this.d);
      label151: if ((paramg.d != null) && (paramg.d.getAddToContainer()))
      {
        if (this.E)
          paramg.d.setOccupyStatusBar(false);
        localObject3 = (ViewGroup)paramg.d.getParent();
        if (localObject3 != null)
          ((ViewGroup)localObject3).removeView(paramg.d);
        this.l.addView(paramg.d);
        paramg.d.setTitleOverlayText(this.I);
      }
      this.l.addView((View)localObject2);
      localObject3 = ((View)localObject2).getLayoutParams();
      ((ViewGroup.LayoutParams)localObject3).width = -1;
      ((ViewGroup.LayoutParams)localObject3).height = -1;
      ((View)localObject2).setLayoutParams((ViewGroup.LayoutParams)localObject3);
      this.e.add(paramg);
      paramg.i();
      this.n = paramg.d;
      if ((!paramg.h) && (((View)localObject2).getBackground() == null))
        ((View)localObject2).setBackgroundColor(-1);
      localObject2 = this.k;
      this.k = this.l;
      this.l = ((b)localObject2);
      this.k.setVisibility(0);
      setInnerTranslationX(0.0F);
      bringChildToFront(this.k);
      if (i1 == 0)
      {
        a(paramBoolean1, (g)localObject1);
        if (this.D != null)
          this.D.setVisibility(0);
      }
      if (i1 == 0)
        break label814;
      if ((!this.C) || (this.e.size() != 1))
        break label623;
      a(paramBoolean1, (g)localObject1);
      this.x = System.currentTimeMillis();
      this.w = true;
      this.B = new Runnable(paramg)
      {
        public void run()
        {
          this.a.b(true, false);
          this.a.o();
        }
      };
      localObject1 = new ArrayList();
      ((ArrayList)localObject1).add(ObjectAnimator.ofFloat(this, "alpha", new float[] { 0.0F, 1.0F }));
      if (this.D != null)
      {
        this.D.setVisibility(0);
        ((ArrayList)localObject1).add(ObjectAnimator.ofFloat(this.D, "alpha", new float[] { 0.0F, 1.0F }));
      }
      paramg.a(true, false);
      this.o = new AnimatorSet();
      this.o.playTogether((Collection)localObject1);
      this.o.setInterpolator(this.q);
      this.o.setDuration(200L);
      this.o.addListener(new org.vidogram.messenger.b()
      {
        public void onAnimationEnd(Animator paramAnimator)
        {
          b.b(b.this, false);
        }
      });
      this.o.start();
    }
    while (true)
    {
      return true;
      i1 = 0;
      break;
      label584: localObject1 = null;
      break label125;
      label590: ViewGroup localViewGroup = (ViewGroup)((View)localObject3).getParent();
      localObject2 = localObject3;
      if (localViewGroup == null)
        break label151;
      localViewGroup.removeView((View)localObject3);
      localObject2 = localObject3;
      break label151;
      label623: this.x = System.currentTimeMillis();
      this.w = true;
      this.B = new Runnable(paramBoolean1, (g)localObject1, paramg)
      {
        public void run()
        {
          if (Build.VERSION.SDK_INT > 15)
          {
            b.b(b.this).setLayerType(0, null);
            b.c(b.this).setLayerType(0, null);
          }
          b.a(b.this, this.a, this.b);
          this.c.b(true, false);
          this.c.o();
          b.b(b.this).setTranslationX(0.0F);
        }
      };
      paramg.a(true, false);
      localObject1 = paramg.a(true, new Runnable()
      {
        public void run()
        {
          b.b(b.this, false);
        }
      });
      if (localObject1 == null)
      {
        this.k.setAlpha(0.0F);
        this.k.setTranslationX(48.0F);
        if ((b.a(this.k)) || (b.a(this.l)))
        {
          this.i = new Runnable()
          {
            public void run()
            {
              if (b.a(b.this) != this)
                return;
              b.a(b.this, true, true);
            }
          };
          org.vidogram.messenger.a.a(this.i, 200L);
          continue;
        }
        if (paramg.h())
        {
          this.j = new Runnable()
          {
            public void run()
            {
              if (b.h(b.this) != this)
                return;
              b.c(b.this, null);
              b.a(b.this, true, true);
            }
          };
          org.vidogram.messenger.a.a(this.j, 200L);
          continue;
        }
        a(true, true);
        continue;
      }
      if (Build.VERSION.SDK_INT > 15);
      this.k.setAlpha(1.0F);
      this.k.setTranslationX(0.0F);
      this.o = ((AnimatorSet)localObject1);
      continue;
      label814: if (this.D != null)
      {
        this.D.setAlpha(1.0F);
        this.D.setVisibility(0);
      }
      paramg.a(true, false);
      paramg.b(true, false);
      paramg.o();
    }
  }

  public void b()
  {
    if (this.w)
    {
      if (this.o != null)
      {
        this.o.cancel();
        this.o = null;
      }
      if (this.A == null)
        break label71;
      e(false);
    }
    while (true)
    {
      if (!this.e.isEmpty())
        ((g)this.e.get(this.e.size() - 1)).i();
      return;
      label71: if (this.B == null)
        continue;
      f(false);
    }
  }

  public void b(Object paramObject)
  {
    if (this.n != null)
      this.n.setVisibility(0);
    this.y = false;
  }

  public void b(boolean paramBoolean)
  {
    int i1 = 0;
    int i3 = this.e.size();
    if (paramBoolean);
    for (int i2 = 0; ; i2 = 1)
    {
      if (i1 >= i3 - i2)
        break label66;
      ((g)this.e.get(i1)).c();
      ((g)this.e.get(i1)).a(this);
      i1 += 1;
      break;
    }
    label66: if (this.J != null)
      this.J.b(this);
  }

  public boolean b(g paramg)
  {
    return a(paramg, -1);
  }

  public void c()
  {
    if (!this.e.isEmpty())
      ((g)this.e.get(this.e.size() - 1)).j();
  }

  public void c(g paramg)
  {
    if ((this.C) && (this.e.size() == 1) && (org.vidogram.messenger.a.c()))
    {
      a(true);
      return;
    }
    e(paramg);
  }

  public void d()
  {
    if ((this.b) || (f()) || (this.e.isEmpty()));
    do
    {
      return;
      if ((this.n == null) || (!this.n.a))
        continue;
      this.n.g();
      return;
    }
    while ((!((g)this.e.get(this.e.size() - 1)).k()) || (this.e.isEmpty()));
    a(true);
  }

  public boolean dispatchKeyEventPreIme(KeyEvent paramKeyEvent)
  {
    if ((paramKeyEvent != null) && (paramKeyEvent.getKeyCode() == 4) && (paramKeyEvent.getAction() == 1))
      return ((this.J != null) && (this.J.a())) || (super.dispatchKeyEventPreIme(paramKeyEvent));
    return super.dispatchKeyEventPreIme(paramKeyEvent);
  }

  protected boolean drawChild(Canvas paramCanvas, View paramView, long paramLong)
  {
    int i5 = getWidth() - getPaddingLeft() - getPaddingRight();
    int i1 = (int)this.a;
    i1 = getPaddingRight() + i1;
    int i3 = getPaddingLeft();
    int i4 = getPaddingLeft() + i5;
    int i2;
    boolean bool;
    if (paramView == this.l)
    {
      i2 = i1;
      i4 = paramCanvas.save();
      if (!this.w)
        paramCanvas.clipRect(i3, 0, i2, getHeight());
      bool = super.drawChild(paramCanvas, paramView, paramLong);
      paramCanvas.restoreToCount(i4);
      if (i1 != 0)
      {
        if (paramView != this.k)
          break label209;
        f1 = Math.max(0.0F, Math.min((i5 - i1) / org.vidogram.messenger.a.a(20.0F), 1.0F));
        g.setBounds(i1 - g.getIntrinsicWidth(), paramView.getTop(), i1, paramView.getBottom());
        g.setAlpha((int)(f1 * 255.0F));
        g.draw(paramCanvas);
      }
    }
    label209: 
    do
    {
      return bool;
      i2 = i4;
      if (paramView != this.k)
        break;
      i3 = i1;
      i2 = i4;
      break;
    }
    while (paramView != this.l);
    float f2 = Math.min(0.8F, (i5 - i1) / i5);
    float f1 = f2;
    if (f2 < 0.0F)
      f1 = 0.0F;
    h.setColor((int)(f1 * 153.0F) << 24);
    paramCanvas.drawRect(i3, 0.0F, i2, getHeight(), h);
    return bool;
  }

  public void e()
  {
    Iterator localIterator = this.e.iterator();
    while (localIterator.hasNext())
      ((g)localIterator.next()).p();
  }

  public boolean f()
  {
    if ((this.w) && (this.x < System.currentTimeMillis() - 1500L))
      d(true);
    return this.w;
  }

  public void g()
  {
    if (this.j == null)
      return;
    org.vidogram.messenger.a.b(this.j);
    this.j.run();
    this.j = null;
  }

  public i getDrawerLayoutContainer()
  {
    return this.m;
  }

  public float getInnerTranslationX()
  {
    return this.a;
  }

  public void h()
  {
    if (this.e.isEmpty())
      return;
    int i1 = 0;
    Object localObject1;
    while (i1 < this.e.size() - 1)
    {
      localObject1 = (g)this.e.get(i1);
      if ((((g)localObject1).d != null) && (((g)localObject1).d.getAddToContainer()))
      {
        localObject2 = (ViewGroup)((g)localObject1).d.getParent();
        if (localObject2 != null)
          ((ViewGroup)localObject2).removeView(((g)localObject1).d);
      }
      if (((g)localObject1).b != null)
      {
        localObject2 = (ViewGroup)((g)localObject1).b.getParent();
        if (localObject2 != null)
        {
          ((g)localObject1).j();
          ((ViewGroup)localObject2).removeView(((g)localObject1).b);
        }
      }
      i1 += 1;
    }
    g localg = (g)this.e.get(this.e.size() - 1);
    localg.a(this);
    Object localObject2 = localg.b;
    if (localObject2 == null)
      localObject1 = localg.a(this.d);
    while (true)
    {
      if ((localg.d != null) && (localg.d.getAddToContainer()))
      {
        if (this.E)
          localg.d.setOccupyStatusBar(false);
        localObject2 = (ViewGroup)localg.d.getParent();
        if (localObject2 != null)
          ((ViewGroup)localObject2).removeView(localg.d);
        this.k.addView(localg.d);
        localg.d.setTitleOverlayText(this.I);
      }
      this.k.addView((View)localObject1);
      localObject2 = ((View)localObject1).getLayoutParams();
      ((ViewGroup.LayoutParams)localObject2).width = -1;
      ((ViewGroup.LayoutParams)localObject2).height = -1;
      ((View)localObject1).setLayoutParams((ViewGroup.LayoutParams)localObject2);
      localg.i();
      this.n = localg.d;
      if ((localg.h) || (((View)localObject1).getBackground() != null))
        break;
      ((View)localObject1).setBackgroundColor(-1);
      return;
      ViewGroup localViewGroup = (ViewGroup)((View)localObject2).getParent();
      localObject1 = localObject2;
      if (localViewGroup == null)
        continue;
      localViewGroup.removeView((View)localObject2);
      localObject1 = localObject2;
    }
  }

  public boolean hasOverlappingRendering()
  {
    return false;
  }

  public void i()
  {
    while (this.e.size() > 0)
      e((g)this.e.get(0));
  }

  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    if (!this.e.isEmpty())
      ((g)this.e.get(this.e.size() - 1)).a(paramConfiguration);
  }

  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    return (this.c) || (f()) || (onTouchEvent(paramMotionEvent));
  }

  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramInt == 82) && (!f()) && (!this.b) && (this.n != null))
      this.n.h();
    return super.onKeyUp(paramInt, paramKeyEvent);
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if ((!f()) && (!this.y) && (!this.c))
    {
      if (this.e.size() > 1)
      {
        if ((paramMotionEvent == null) || (paramMotionEvent.getAction() != 0) || (this.b) || (this.r))
          break label135;
        if (!((g)this.e.get(this.e.size() - 1)).g)
          return false;
        this.z = paramMotionEvent.getPointerId(0);
        this.r = true;
        this.s = (int)paramMotionEvent.getX();
        this.t = (int)paramMotionEvent.getY();
        if (this.u != null)
          this.u.clear();
      }
      while (true)
      {
        return this.b;
        label135: if ((paramMotionEvent != null) && (paramMotionEvent.getAction() == 2) && (paramMotionEvent.getPointerId(0) == this.z))
        {
          if (this.u == null)
            this.u = VelocityTracker.obtain();
          int i1 = Math.max(0, (int)(paramMotionEvent.getX() - this.s));
          int i2 = Math.abs((int)paramMotionEvent.getY() - this.t);
          this.u.addMovement(paramMotionEvent);
          if ((this.r) && (!this.b) && (i1 >= org.vidogram.messenger.a.a(0.4F, true)) && (Math.abs(i1) / 3 > i2))
          {
            a(paramMotionEvent);
            continue;
          }
          if (!this.b)
            continue;
          if (!this.v)
          {
            if (this.d.getCurrentFocus() != null)
              org.vidogram.messenger.a.b(this.d.getCurrentFocus());
            ((g)this.e.get(this.e.size() - 1)).n();
            this.v = true;
          }
          this.k.setTranslationX(i1);
          setInnerTranslationX(i1);
          continue;
        }
        if ((paramMotionEvent != null) && (paramMotionEvent.getPointerId(0) == this.z) && ((paramMotionEvent.getAction() == 3) || (paramMotionEvent.getAction() == 1) || (paramMotionEvent.getAction() == 6)))
        {
          if (this.u == null)
            this.u = VelocityTracker.obtain();
          this.u.computeCurrentVelocity(1000);
          float f1;
          float f2;
          if ((!this.b) && (((g)this.e.get(this.e.size() - 1)).g))
          {
            f1 = this.u.getXVelocity();
            f2 = this.u.getYVelocity();
            if ((f1 >= 3500.0F) && (f1 > Math.abs(f2)))
            {
              a(paramMotionEvent);
              if (!this.v)
              {
                if (((Activity)getContext()).getCurrentFocus() != null)
                  org.vidogram.messenger.a.b(((Activity)getContext()).getCurrentFocus());
                this.v = true;
              }
            }
          }
          boolean bool;
          if (this.b)
          {
            f1 = this.k.getX();
            paramMotionEvent = new AnimatorSet();
            f2 = this.u.getXVelocity();
            float f3 = this.u.getYVelocity();
            if ((f1 < this.k.getMeasuredWidth() / 3.0F) && ((f2 < 3500.0F) || (f2 < f3)))
            {
              bool = true;
              label590: if (bool)
                break label742;
              f1 = this.k.getMeasuredWidth() - f1;
              paramMotionEvent.playTogether(new Animator[] { ObjectAnimator.ofFloat(this.k, "translationX", new float[] { this.k.getMeasuredWidth() }), ObjectAnimator.ofFloat(this, "innerTranslationX", new float[] { this.k.getMeasuredWidth() }) });
              label665: paramMotionEvent.setDuration(Math.max((int)(f1 * (200.0F / this.k.getMeasuredWidth())), 50));
              paramMotionEvent.addListener(new org.vidogram.messenger.b(bool)
              {
                public void onAnimationEnd(Animator paramAnimator)
                {
                  b.a(b.this, this.a);
                }
              });
              paramMotionEvent.start();
              this.c = true;
            }
          }
          while (true)
          {
            if (this.u == null)
              break label801;
            this.u.recycle();
            this.u = null;
            break;
            bool = false;
            break label590;
            label742: paramMotionEvent.playTogether(new Animator[] { ObjectAnimator.ofFloat(this.k, "translationX", new float[] { 0.0F }), ObjectAnimator.ofFloat(this, "innerTranslationX", new float[] { 0.0F }) });
            break label665;
            this.r = false;
            this.b = false;
          }
          label801: continue;
        }
        if (paramMotionEvent != null)
          continue;
        this.r = false;
        this.b = false;
        if (this.u == null)
          continue;
        this.u.recycle();
        this.u = null;
      }
    }
    return false;
  }

  public void requestDisallowInterceptTouchEvent(boolean paramBoolean)
  {
    onTouchEvent(null);
    super.requestDisallowInterceptTouchEvent(paramBoolean);
  }

  public void setBackgroundView(View paramView)
  {
    this.D = paramView;
  }

  public void setDelegate(a parama)
  {
    this.J = parama;
  }

  public void setDrawerLayoutContainer(i parami)
  {
    this.m = parami;
  }

  public void setInnerTranslationX(float paramFloat)
  {
    this.a = paramFloat;
    invalidate();
  }

  public void setRemoveActionBarExtraHeight(boolean paramBoolean)
  {
    this.E = paramBoolean;
  }

  public void setTitleOverlayText(String paramString)
  {
    this.I = paramString;
    paramString = this.e.iterator();
    while (paramString.hasNext())
    {
      g localg = (g)paramString.next();
      if (localg.d == null)
        continue;
      localg.d.setTitleOverlayText(this.I);
    }
  }

  public void setUseAlphaAnimations(boolean paramBoolean)
  {
    this.C = paramBoolean;
  }

  public static abstract interface a
  {
    public abstract boolean a();

    public abstract boolean a(b paramb);

    public abstract boolean a(g paramg, b paramb);

    public abstract boolean a(g paramg, boolean paramBoolean1, boolean paramBoolean2, b paramb);

    public abstract void b(b paramb);
  }

  public class b extends LinearLayout
  {
    private Rect b = new Rect();
    private boolean c;

    public b(Context arg2)
    {
      super();
      setOrientation(1);
    }

    protected boolean drawChild(Canvas paramCanvas, View paramView, long paramLong)
    {
      if ((paramView instanceof a))
        return super.drawChild(paramCanvas, paramView, paramLong);
      int j = getChildCount();
      int i = 0;
      View localView;
      if (i < j)
      {
        localView = getChildAt(i);
        if (localView == paramView);
        do
        {
          i += 1;
          break;
        }
        while ((!(localView instanceof a)) || (localView.getVisibility() != 0));
        if (!((a)localView).getCastShadows());
      }
      for (i = localView.getMeasuredHeight(); ; i = 0)
      {
        boolean bool = super.drawChild(paramCanvas, paramView, paramLong);
        if ((i != 0) && (b.j() != null))
        {
          b.j().setBounds(0, i, getMeasuredWidth(), b.j().getIntrinsicHeight() + i);
          b.j().draw(paramCanvas);
        }
        return bool;
      }
    }

    public boolean hasOverlappingRendering()
    {
      return false;
    }

    protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      boolean bool = false;
      super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
      View localView = getRootView();
      getWindowVisibleDisplayFrame(this.b);
      paramInt2 = localView.getHeight();
      if (this.b.top != 0);
      for (paramInt1 = org.vidogram.messenger.a.a; ; paramInt1 = 0)
      {
        paramBoolean = bool;
        if (paramInt2 - paramInt1 - org.vidogram.messenger.a.c(localView) - (this.b.bottom - this.b.top) > 0)
          paramBoolean = true;
        this.c = paramBoolean;
        if ((b.a(b.this) != null) && (!b.b(b.this).c) && (!b.c(b.this).c))
        {
          org.vidogram.messenger.a.b(b.a(b.this));
          b.a(b.this).run();
          b.a(b.this, null);
        }
        return;
      }
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.a.b
 * JD-Core Version:    0.6.0
 */