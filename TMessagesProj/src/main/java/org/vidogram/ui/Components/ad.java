package org.vidogram.ui.Components;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.os.Build.VERSION;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.f;
import android.support.v4.view.aa;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.FrameLayout.LayoutParams;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import org.vidogram.messenger.a;

public class ad extends HorizontalScrollView
{
  public ViewPager.f a;
  private LinearLayout.LayoutParams b;
  private final b c = new b(null);
  private LinearLayout d;
  private ViewPager e;
  private int f;
  private int g = 0;
  private float h = 0.0F;
  private Paint i;
  private int j = -10066330;
  private int k = 436207616;
  private boolean l = false;
  private int m = a.a(52.0F);
  private int n = a.a(8.0F);
  private int o = a.a(2.0F);
  private int p = a.a(12.0F);
  private int q = a.a(24.0F);
  private int r = 0;

  public ad(Context paramContext)
  {
    super(paramContext);
    setFillViewport(true);
    setWillNotDraw(false);
    this.d = new LinearLayout(paramContext);
    this.d.setOrientation(0);
    this.d.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
    addView(this.d);
    this.i = new Paint();
    this.i.setAntiAlias(true);
    this.i.setStyle(Paint.Style.FILL);
    this.b = new LinearLayout.LayoutParams(-2, -1);
  }

  private void a(int paramInt1, int paramInt2)
  {
    boolean bool = true;
    2 local2 = new ImageView(getContext(), paramInt1)
    {
      protected void onDraw(Canvas paramCanvas)
      {
        super.onDraw(paramCanvas);
        if ((ad.a(ad.this).getAdapter() instanceof ad.a))
          ((ad.a)ad.a(ad.this).getAdapter()).a(paramCanvas, this.a);
      }
    };
    local2.setFocusable(true);
    local2.setImageResource(paramInt2);
    local2.setScaleType(ImageView.ScaleType.CENTER);
    local2.setOnClickListener(new View.OnClickListener(paramInt1)
    {
      public void onClick(View paramView)
      {
        ad.a(ad.this).setCurrentItem(this.a);
      }
    });
    this.d.addView(local2);
    if (paramInt1 == this.g);
    while (true)
    {
      local2.setSelected(bool);
      return;
      bool = false;
    }
  }

  private void b()
  {
    int i1 = 0;
    if (i1 < this.f)
    {
      View localView = this.d.getChildAt(i1);
      localView.setLayoutParams(this.b);
      if (this.l)
      {
        localView.setPadding(0, 0, 0, 0);
        localView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1, 1.0F));
      }
      while (true)
      {
        i1 += 1;
        break;
        localView.setPadding(this.q, 0, this.q, 0);
      }
    }
  }

  private void b(int paramInt1, int paramInt2)
  {
    if (this.f == 0);
    do
    {
      return;
      int i1 = this.d.getChildAt(paramInt1).getLeft() + paramInt2;
      if (paramInt1 <= 0)
      {
        paramInt1 = i1;
        if (paramInt2 <= 0)
          continue;
      }
      paramInt1 = i1 - this.m;
    }
    while (paramInt1 == this.r);
    this.r = paramInt1;
    scrollTo(paramInt1, 0);
  }

  public void a()
  {
    this.d.removeAllViews();
    this.f = this.e.getAdapter().a();
    int i1 = 0;
    while (i1 < this.f)
    {
      if ((this.e.getAdapter() instanceof a))
        a(i1, ((a)this.e.getAdapter()).b(i1));
      i1 += 1;
    }
    b();
    getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener()
    {
      public void onGlobalLayout()
      {
        if (Build.VERSION.SDK_INT < 16)
          ad.this.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        while (true)
        {
          ad.a(ad.this, ad.a(ad.this).getCurrentItem());
          ad.a(ad.this, ad.b(ad.this), 0);
          return;
          ad.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
      }
    });
  }

  public int getDividerPadding()
  {
    return this.p;
  }

  public int getIndicatorColor()
  {
    return this.j;
  }

  public int getIndicatorHeight()
  {
    return this.n;
  }

  public int getScrollOffset()
  {
    return this.m;
  }

  public boolean getShouldExpand()
  {
    return this.l;
  }

  public int getTabPaddingLeftRight()
  {
    return this.q;
  }

  public int getUnderlineColor()
  {
    return this.k;
  }

  public int getUnderlineHeight()
  {
    return this.o;
  }

  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    if ((isInEditMode()) || (this.f == 0))
      return;
    int i1 = getHeight();
    this.i.setColor(this.k);
    paramCanvas.drawRect(0.0F, i1 - this.o, this.d.getWidth(), i1, this.i);
    View localView = this.d.getChildAt(this.g);
    float f1 = localView.getLeft();
    float f2 = localView.getRight();
    if ((this.h > 0.0F) && (this.g < this.f - 1))
    {
      localView = this.d.getChildAt(this.g + 1);
      float f4 = localView.getLeft();
      float f3 = localView.getRight();
      f1 = this.h * f4 + f1 * (1.0F - this.h);
      f2 = this.h * f3 + (1.0F - this.h) * f2;
    }
    while (true)
    {
      this.i.setColor(this.j);
      paramCanvas.drawRect(f1, i1 - this.n, f2, i1, this.i);
      return;
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    if ((!this.l) || (View.MeasureSpec.getMode(paramInt1) == 0))
      return;
    paramInt1 = getMeasuredWidth();
    this.d.measure(paramInt1 | 0x40000000, paramInt2);
  }

  public void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (!this.l)
      post(new Runnable()
      {
        public void run()
        {
          ad.this.a();
        }
      });
  }

  public void setDividerPadding(int paramInt)
  {
    this.p = paramInt;
    invalidate();
  }

  public void setIndicatorColor(int paramInt)
  {
    this.j = paramInt;
    invalidate();
  }

  public void setIndicatorColorResource(int paramInt)
  {
    this.j = getResources().getColor(paramInt);
    invalidate();
  }

  public void setIndicatorHeight(int paramInt)
  {
    this.n = paramInt;
    invalidate();
  }

  public void setOnPageChangeListener(ViewPager.f paramf)
  {
    this.a = paramf;
  }

  public void setScrollOffset(int paramInt)
  {
    this.m = paramInt;
    invalidate();
  }

  public void setShouldExpand(boolean paramBoolean)
  {
    this.l = paramBoolean;
    this.d.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
    b();
    requestLayout();
  }

  public void setTabPaddingLeftRight(int paramInt)
  {
    this.q = paramInt;
    b();
  }

  public void setUnderlineColor(int paramInt)
  {
    this.k = paramInt;
    invalidate();
  }

  public void setUnderlineColorResource(int paramInt)
  {
    this.k = getResources().getColor(paramInt);
    invalidate();
  }

  public void setUnderlineHeight(int paramInt)
  {
    this.o = paramInt;
    invalidate();
  }

  public void setViewPager(ViewPager paramViewPager)
  {
    this.e = paramViewPager;
    if (paramViewPager.getAdapter() == null)
      throw new IllegalStateException("ViewPager does not have adapter instance.");
    paramViewPager.setOnPageChangeListener(this.c);
    a();
  }

  public static abstract interface a
  {
    public abstract void a(Canvas paramCanvas, int paramInt);

    public abstract int b(int paramInt);
  }

  private class b
    implements ViewPager.f
  {
    private b()
    {
    }

    public void a(int paramInt)
    {
      if (ad.this.a != null)
        ad.this.a.a(paramInt);
      int i = 0;
      if (i < ad.c(ad.this).getChildCount())
      {
        View localView = ad.c(ad.this).getChildAt(i);
        if (i == paramInt);
        for (boolean bool = true; ; bool = false)
        {
          localView.setSelected(bool);
          i += 1;
          break;
        }
      }
    }

    public void a(int paramInt1, float paramFloat, int paramInt2)
    {
      ad.a(ad.this, paramInt1);
      ad.a(ad.this, paramFloat);
      ad.a(ad.this, paramInt1, (int)(ad.c(ad.this).getChildAt(paramInt1).getWidth() * paramFloat));
      ad.this.invalidate();
      if (ad.this.a != null)
        ad.this.a.a(paramInt1, paramFloat, paramInt2);
    }

    public void b(int paramInt)
    {
      if (paramInt == 0)
        ad.a(ad.this, ad.a(ad.this).getCurrentItem(), 0);
      if (ad.this.a != null)
        ad.this.a.b(paramInt);
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.Components.ad
 * JD-Core Version:    0.6.0
 */