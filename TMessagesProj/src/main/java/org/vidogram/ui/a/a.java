package org.vidogram.ui.a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import java.util.ArrayList;
import java.util.Collection;
import org.vidogram.messenger.b;
import org.vidogram.ui.Components.v;

public class a extends FrameLayout
{
  protected boolean a;
  protected int b;
  protected g c;
  public a d;
  private ImageView e;
  private k f;
  private k g;
  private View h;
  private c i;
  private c j;
  private boolean k;
  private boolean l;
  private boolean m;
  private boolean n;
  private int o;
  private AnimatorSet p;
  private boolean q;
  private CharSequence r;
  private boolean s;

  public a(Context paramContext)
  {
    super(paramContext);
    if (Build.VERSION.SDK_INT >= 21);
    for (boolean bool = true; ; bool = false)
    {
      this.k = bool;
      this.m = true;
      this.n = true;
      this.s = true;
      return;
    }
  }

  public static int getCurrentActionBarHeight()
  {
    if (org.vidogram.messenger.a.c())
      return org.vidogram.messenger.a.a(64.0F);
    if (org.vidogram.messenger.a.c.x > org.vidogram.messenger.a.c.y)
      return org.vidogram.messenger.a.a(48.0F);
    return org.vidogram.messenger.a.a(56.0F);
  }

  private void k()
  {
    if (this.e != null)
      return;
    this.e = new ImageView(getContext());
    this.e.setScaleType(ImageView.ScaleType.CENTER);
    this.e.setBackgroundDrawable(l.a(this.b));
    this.e.setPadding(org.vidogram.messenger.a.a(1.0F), 0, 0, 0);
    addView(this.e, v.b(54, 54, 51));
    this.e.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramView)
      {
        if (a.this.a)
          a.this.g();
        do
          return;
        while (a.this.d == null);
        a.this.d.a(-1);
      }
    });
  }

  private void l()
  {
    if (this.g != null)
      return;
    this.g = new k(getContext());
    this.g.setGravity(3);
    this.g.setTextColor(-2758409);
    addView(this.g, 0, v.b(-2, -2, 51));
  }

  private void m()
  {
    if (this.f != null)
      return;
    this.f = new k(getContext());
    this.f.setGravity(3);
    this.f.setTextColor(-1);
    this.f.setTypeface(org.vidogram.messenger.a.a("fonts/rmedium.ttf"));
    addView(this.f, 0, v.b(-2, -2, 51));
  }

  public c a()
  {
    if (this.i != null)
      return this.i;
    this.i = new c(getContext(), this);
    addView(this.i, 0, v.b(-2, -1, 5));
    return this.i;
  }

  public void a(String paramString)
  {
    if ((this.i == null) || (paramString == null))
      return;
    c localc = this.i;
    if (!this.a);
    for (boolean bool = true; ; bool = false)
    {
      localc.a(bool, paramString);
      return;
    }
  }

  protected void a(boolean paramBoolean)
  {
    int i2 = 4;
    this.a = paramBoolean;
    Object localObject;
    int i1;
    label53: float f1;
    if (this.f != null)
    {
      localObject = this.f;
      if (paramBoolean)
      {
        i1 = 4;
        ((k)localObject).setVisibility(i1);
      }
    }
    else
    {
      if (this.g != null)
      {
        localObject = this.g;
        if (!paramBoolean)
          break label107;
        i1 = i2;
        ((k)localObject).setVisibility(i1);
      }
      localObject = this.e.getDrawable();
      if ((localObject != null) && ((localObject instanceof j)))
      {
        localObject = (j)localObject;
        if (!paramBoolean)
          break label112;
        f1 = 1.0F;
      }
    }
    while (true)
    {
      ((j)localObject).a(f1, true);
      return;
      i1 = 0;
      break;
      label107: i1 = 0;
      break label53;
      label112: f1 = 0.0F;
    }
  }

  public c b()
  {
    if (this.j != null)
      return this.j;
    this.j = new c(getContext(), this);
    this.j.setBackgroundColor(-1);
    addView(this.j, indexOfChild(this.e));
    Object localObject = this.j;
    if (this.k);
    for (int i1 = org.vidogram.messenger.a.a; ; i1 = 0)
    {
      ((c)localObject).setPadding(0, i1, 0, 0);
      localObject = (FrameLayout.LayoutParams)this.j.getLayoutParams();
      ((FrameLayout.LayoutParams)localObject).height = -1;
      ((FrameLayout.LayoutParams)localObject).width = -1;
      ((FrameLayout.LayoutParams)localObject).gravity = 5;
      this.j.setLayoutParams((ViewGroup.LayoutParams)localObject);
      this.j.setVisibility(4);
      if ((this.k) && (this.h == null))
      {
        this.h = new View(getContext());
        this.h.setBackgroundColor(-1728053248);
        addView(this.h);
        localObject = (FrameLayout.LayoutParams)this.h.getLayoutParams();
        ((FrameLayout.LayoutParams)localObject).height = org.vidogram.messenger.a.a;
        ((FrameLayout.LayoutParams)localObject).width = -1;
        ((FrameLayout.LayoutParams)localObject).gravity = 51;
        this.h.setLayoutParams((ViewGroup.LayoutParams)localObject);
        this.h.setVisibility(4);
      }
      return this.j;
    }
  }

  public void c()
  {
    if ((this.j == null) || (this.l));
    do
    {
      return;
      this.l = true;
      localObject = new ArrayList();
      ((ArrayList)localObject).add(ObjectAnimator.ofFloat(this.j, "alpha", new float[] { 0.0F, 1.0F }));
      if ((this.k) && (this.h != null))
        ((ArrayList)localObject).add(ObjectAnimator.ofFloat(this.h, "alpha", new float[] { 0.0F, 1.0F }));
      if (this.p != null)
        this.p.cancel();
      this.p = new AnimatorSet();
      this.p.playTogether((Collection)localObject);
      this.p.setDuration(200L);
      this.p.addListener(new b()
      {
        public void onAnimationCancel(Animator paramAnimator)
        {
          if ((a.d(a.this) != null) && (a.d(a.this).equals(paramAnimator)))
            a.a(a.this, null);
        }

        public void onAnimationEnd(Animator paramAnimator)
        {
          if ((a.d(a.this) != null) && (a.d(a.this).equals(paramAnimator)))
          {
            a.a(a.this, null);
            if (a.e(a.this) != null)
              a.e(a.this).setVisibility(4);
            if (a.f(a.this) != null)
              a.f(a.this).setVisibility(4);
            if (a.g(a.this) != null)
              a.g(a.this).setVisibility(4);
          }
        }

        public void onAnimationStart(Animator paramAnimator)
        {
          a.a(a.this).setVisibility(0);
          if ((a.b(a.this)) && (a.c(a.this) != null))
            a.c(a.this).setVisibility(0);
        }
      });
      this.p.start();
    }
    while (this.e == null);
    Object localObject = this.e.getDrawable();
    if ((localObject instanceof f))
      ((f)localObject).a(1.0F, true);
    this.e.setBackgroundDrawable(l.a(-986896));
  }

  public void d()
  {
    if ((this.j == null) || (!this.l));
    do
    {
      return;
      this.l = false;
      localObject = new ArrayList();
      ((ArrayList)localObject).add(ObjectAnimator.ofFloat(this.j, "alpha", new float[] { 0.0F }));
      if ((this.k) && (this.h != null))
        ((ArrayList)localObject).add(ObjectAnimator.ofFloat(this.h, "alpha", new float[] { 0.0F }));
      if (this.p != null)
        this.p.cancel();
      this.p = new AnimatorSet();
      this.p.playTogether((Collection)localObject);
      this.p.setDuration(200L);
      this.p.addListener(new b()
      {
        public void onAnimationCancel(Animator paramAnimator)
        {
          if ((a.d(a.this) != null) && (a.d(a.this).equals(paramAnimator)))
            a.a(a.this, null);
        }

        public void onAnimationEnd(Animator paramAnimator)
        {
          if ((a.d(a.this) != null) && (a.d(a.this).equals(paramAnimator)))
          {
            a.a(a.this, null);
            a.a(a.this).setVisibility(4);
            if ((a.b(a.this)) && (a.c(a.this) != null))
              a.c(a.this).setVisibility(4);
          }
        }
      });
      this.p.start();
      if (this.f != null)
        this.f.setVisibility(0);
      if (this.g != null)
        this.g.setVisibility(0);
      if (this.i == null)
        continue;
      this.i.setVisibility(0);
    }
    while (this.e == null);
    Object localObject = this.e.getDrawable();
    if ((localObject instanceof f))
      ((f)localObject).a(0.0F, true);
    this.e.setBackgroundDrawable(l.a(this.b));
  }

  public void e()
  {
    if ((this.k) && (this.h == null))
    {
      this.h = new View(getContext());
      this.h.setBackgroundColor(-1728053248);
      addView(this.h);
      FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)this.h.getLayoutParams();
      localLayoutParams.height = org.vidogram.messenger.a.a;
      localLayoutParams.width = -1;
      localLayoutParams.gravity = 51;
      this.h.setLayoutParams(localLayoutParams);
    }
  }

  public boolean f()
  {
    return (this.j != null) && (this.l);
  }

  public void g()
  {
    if ((!this.a) || (this.i == null))
      return;
    this.i.d();
  }

  public boolean getAddToContainer()
  {
    return this.m;
  }

  public boolean getCastShadows()
  {
    return this.s;
  }

  public boolean getOccupyStatusBar()
  {
    return this.k;
  }

  public String getSubtitle()
  {
    if (this.g == null)
      return null;
    return this.g.getText().toString();
  }

  public k getSubtitleTextView()
  {
    return this.g;
  }

  public String getTitle()
  {
    if (this.f == null)
      return null;
    return this.f.getText().toString();
  }

  public k getTitleTextView()
  {
    return this.f;
  }

  public void h()
  {
    if (this.i != null)
      this.i.c();
  }

  public boolean hasOverlappingRendering()
  {
    return false;
  }

  protected void i()
  {
    if (this.i != null)
      this.i.a();
  }

  public boolean j()
  {
    return this.a;
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    float f1;
    label69: label113: int i3;
    label120: int i4;
    if (this.k)
    {
      i1 = org.vidogram.messenger.a.a;
      if ((this.e == null) || (this.e.getVisibility() == 8))
        break label481;
      this.e.layout(0, i1, this.e.getMeasuredWidth(), this.e.getMeasuredHeight() + i1);
      if (!org.vidogram.messenger.a.c())
        break label473;
      f1 = 80.0F;
      i2 = org.vidogram.messenger.a.a(f1);
      if ((this.i != null) && (this.i.getVisibility() != 8))
      {
        if (!this.a)
          break label518;
        if (!org.vidogram.messenger.a.c())
          break label510;
        f1 = 74.0F;
        i3 = org.vidogram.messenger.a.a(f1);
        this.i.layout(i3, i1, this.i.getMeasuredWidth() + i3, this.i.getMeasuredHeight() + i1);
      }
      if ((this.f != null) && (this.f.getVisibility() != 8))
      {
        if ((this.g == null) || (this.g.getVisibility() == 8))
          break label543;
        i3 = (getCurrentActionBarHeight() / 2 - this.f.getTextHeight()) / 2;
        if ((org.vidogram.messenger.a.c()) || (getResources().getConfiguration().orientation != 2))
          break label535;
        f1 = 2.0F;
        label229: i3 = org.vidogram.messenger.a.a(f1) + i3;
        label239: this.f.layout(i2, i1 + i3, this.f.getMeasuredWidth() + i2, i3 + i1 + this.f.getTextHeight());
      }
      if ((this.g != null) && (this.g.getVisibility() != 8))
      {
        i3 = getCurrentActionBarHeight() / 2;
        i4 = (getCurrentActionBarHeight() / 2 - this.g.getTextHeight()) / 2;
        if ((org.vidogram.messenger.a.c()) || (getResources().getConfiguration().orientation != 2))
          break label561;
      }
    }
    View localView;
    label518: label535: label543: label561: 
    while (true)
    {
      i3 = i4 + i3 - org.vidogram.messenger.a.a(1.0F);
      this.g.layout(i2, i1 + i3, this.g.getMeasuredWidth() + i2, i1 + i3 + this.g.getTextHeight());
      i4 = getChildCount();
      i3 = 0;
      while (true)
      {
        if (i3 >= i4)
          return;
        localView = getChildAt(i3);
        if ((localView.getVisibility() != 8) && (localView != this.f) && (localView != this.g) && (localView != this.i) && (localView != this.e))
          break;
        i3 += 1;
      }
      i1 = 0;
      break;
      label473: f1 = 72.0F;
      break label69;
      label481: if (org.vidogram.messenger.a.c())
        f1 = 26.0F;
      while (true)
      {
        i2 = org.vidogram.messenger.a.a(f1);
        break;
        f1 = 18.0F;
      }
      label510: f1 = 66.0F;
      break label113;
      i3 = paramInt3 - paramInt1 - this.i.getMeasuredWidth();
      break label120;
      f1 = 3.0F;
      break label229;
      i3 = (getCurrentActionBarHeight() - this.f.getTextHeight()) / 2;
      break label239;
    }
    FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)localView.getLayoutParams();
    int i5 = localView.getMeasuredWidth();
    int i6 = localView.getMeasuredHeight();
    int i2 = localLayoutParams.gravity;
    int i1 = i2;
    if (i2 == -1)
      i1 = 51;
    switch (i1 & 0x7 & 0x7)
    {
    default:
      i2 = localLayoutParams.leftMargin;
      label651: switch (i1 & 0x70)
      {
      default:
        i1 = localLayoutParams.topMargin;
      case 48:
      case 16:
      case 80:
      }
    case 1:
    case 5:
    }
    while (true)
    {
      localView.layout(i2, i1, i5 + i2, i6 + i1);
      break;
      i2 = (paramInt3 - paramInt1 - i5) / 2 + localLayoutParams.leftMargin - localLayoutParams.rightMargin;
      break label651;
      i2 = paramInt3 - i5 - localLayoutParams.rightMargin;
      break label651;
      i1 = localLayoutParams.topMargin;
      continue;
      i1 = (paramInt4 - paramInt2 - i6) / 2 + localLayoutParams.topMargin - localLayoutParams.bottomMargin;
      continue;
      i1 = paramInt4 - paramInt2 - i6 - localLayoutParams.bottomMargin;
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i2 = View.MeasureSpec.getSize(paramInt1);
    View.MeasureSpec.getSize(paramInt2);
    int i1 = getCurrentActionBarHeight();
    int i3 = View.MeasureSpec.makeMeasureSpec(i1, 1073741824);
    float f1;
    label102: Object localObject;
    if (this.k)
    {
      paramInt2 = org.vidogram.messenger.a.a;
      setMeasuredDimension(i2, paramInt2 + i1 + this.o);
      if ((this.e == null) || (this.e.getVisibility() == 8))
        break label487;
      this.e.measure(View.MeasureSpec.makeMeasureSpec(org.vidogram.messenger.a.a(54.0F), 1073741824), i3);
      if (!org.vidogram.messenger.a.c())
        break label480;
      f1 = 80.0F;
      paramInt2 = org.vidogram.messenger.a.a(f1);
      if ((this.i != null) && (this.i.getVisibility() != 8))
      {
        if (!this.a)
          break label519;
        if (!org.vidogram.messenger.a.c())
          break label512;
        f1 = 74.0F;
        label143: i1 = View.MeasureSpec.makeMeasureSpec(i2 - org.vidogram.messenger.a.a(f1), 1073741824);
        label158: this.i.measure(i1, i3);
      }
      if (((this.f != null) && (this.f.getVisibility() != 8)) || ((this.g != null) && (this.g.getVisibility() != 8)))
      {
        if (this.i == null)
          break label532;
        i1 = this.i.getMeasuredWidth();
        label223: i1 = i2 - i1 - org.vidogram.messenger.a.a(16.0F) - paramInt2;
        if ((this.f != null) && (this.f.getVisibility() != 8))
        {
          localObject = this.f;
          if ((org.vidogram.messenger.a.c()) || (getResources().getConfiguration().orientation != 2))
            break label538;
          paramInt2 = 18;
          label287: ((k)localObject).setTextSize(paramInt2);
          this.f.measure(View.MeasureSpec.makeMeasureSpec(i1, -2147483648), View.MeasureSpec.makeMeasureSpec(org.vidogram.messenger.a.a(24.0F), -2147483648));
        }
        if ((this.g != null) && (this.g.getVisibility() != 8))
        {
          localObject = this.g;
          if ((org.vidogram.messenger.a.c()) || (getResources().getConfiguration().orientation != 2))
            break label544;
          paramInt2 = 14;
          label368: ((k)localObject).setTextSize(paramInt2);
          this.g.measure(View.MeasureSpec.makeMeasureSpec(i1, -2147483648), View.MeasureSpec.makeMeasureSpec(org.vidogram.messenger.a.a(20.0F), -2147483648));
        }
      }
      i1 = getChildCount();
      paramInt2 = 0;
      label409: if (paramInt2 >= i1)
        return;
      localObject = getChildAt(paramInt2);
      if ((((View)localObject).getVisibility() != 8) && (localObject != this.f) && (localObject != this.g) && (localObject != this.i) && (localObject != this.e))
        break label550;
    }
    while (true)
    {
      paramInt2 += 1;
      break label409;
      paramInt2 = 0;
      break;
      label480: f1 = 72.0F;
      break label102;
      label487: if (org.vidogram.messenger.a.c())
        f1 = 26.0F;
      while (true)
      {
        paramInt2 = org.vidogram.messenger.a.a(f1);
        break;
        f1 = 18.0F;
      }
      label512: f1 = 66.0F;
      break label143;
      label519: i1 = View.MeasureSpec.makeMeasureSpec(i2, -2147483648);
      break label158;
      label532: i1 = 0;
      break label223;
      label538: paramInt2 = 20;
      break label287;
      label544: paramInt2 = 16;
      break label368;
      label550: measureChildWithMargins((View)localObject, paramInt1, 0, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824), 0);
    }
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    return (super.onTouchEvent(paramMotionEvent)) || (this.n);
  }

  public void setActionBarMenuOnItemClick(a parama)
  {
    this.d = parama;
  }

  public void setAddToContainer(boolean paramBoolean)
  {
    this.m = paramBoolean;
  }

  public void setAllowOverlayTitle(boolean paramBoolean)
  {
    this.q = paramBoolean;
  }

  public void setBackButtonDrawable(Drawable paramDrawable)
  {
    if (this.e == null)
      k();
    ImageView localImageView = this.e;
    int i1;
    float f1;
    if (paramDrawable == null)
    {
      i1 = 8;
      localImageView.setVisibility(i1);
      this.e.setImageDrawable(paramDrawable);
      if ((paramDrawable instanceof f))
      {
        paramDrawable = (f)paramDrawable;
        if (!f())
          break label71;
        f1 = 1.0F;
      }
    }
    while (true)
    {
      paramDrawable.a(f1, false);
      return;
      i1 = 0;
      break;
      label71: f1 = 0.0F;
    }
  }

  public void setBackButtonImage(int paramInt)
  {
    if (this.e == null)
      k();
    ImageView localImageView = this.e;
    if (paramInt == 0);
    for (int i1 = 8; ; i1 = 0)
    {
      localImageView.setVisibility(i1);
      this.e.setImageResource(paramInt);
      return;
    }
  }

  public void setCastShadows(boolean paramBoolean)
  {
    this.s = paramBoolean;
  }

  public void setExtraHeight(int paramInt)
  {
    this.o = paramInt;
  }

  public void setInterceptTouches(boolean paramBoolean)
  {
    this.n = paramBoolean;
  }

  public void setItemsBackgroundColor(int paramInt)
  {
    this.b = paramInt;
    if (this.e != null)
      this.e.setBackgroundDrawable(l.a(this.b));
  }

  public void setOccupyStatusBar(boolean paramBoolean)
  {
    this.k = paramBoolean;
    c localc;
    if (this.j != null)
    {
      localc = this.j;
      if (!this.k)
        break label37;
    }
    label37: for (int i1 = org.vidogram.messenger.a.a; ; i1 = 0)
    {
      localc.setPadding(0, i1, 0, 0);
      return;
    }
  }

  public void setSubtitle(CharSequence paramCharSequence)
  {
    if ((paramCharSequence != null) && (this.g == null))
      l();
    k localk;
    if (this.g != null)
    {
      localk = this.g;
      if ((paramCharSequence == null) || (this.a))
        break label54;
    }
    label54: for (int i1 = 0; ; i1 = 8)
    {
      localk.setVisibility(i1);
      this.g.setText(paramCharSequence);
      return;
    }
  }

  public void setSubtitleColor(int paramInt)
  {
    if (this.g == null)
      l();
    this.g.setTextColor(paramInt);
  }

  public void setTitle(CharSequence paramCharSequence)
  {
    if ((paramCharSequence != null) && (this.f == null))
      m();
    k localk;
    if (this.f != null)
    {
      this.r = paramCharSequence;
      localk = this.f;
      if ((paramCharSequence == null) || (this.a))
        break label59;
    }
    label59: for (int i1 = 0; ; i1 = 4)
    {
      localk.setVisibility(i1);
      this.f.setText(paramCharSequence);
      return;
    }
  }

  public void setTitleOverlayText(String paramString)
  {
    if ((!this.q) || (this.c.c == null));
    k localk;
    while (true)
    {
      return;
      if (paramString == null)
        break;
      if ((paramString != null) && (this.f == null))
        m();
      if (this.f == null)
        continue;
      localk = this.f;
      if ((paramString == null) || (this.a))
        break label84;
    }
    label84: for (int i1 = 0; ; i1 = 4)
    {
      localk.setVisibility(i1);
      this.f.setText(paramString);
      return;
      paramString = this.r;
      break;
    }
  }

  public static class a
  {
    public void a(int paramInt)
    {
    }

    public boolean a()
    {
      return true;
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.a.a
 * JD-Core Version:    0.6.0
 */