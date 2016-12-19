package org.vidogram.ui.Components;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.os.Build.VERSION;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import org.vidogram.messenger.a;
import org.vidogram.tgnet.g.az;
import org.vidogram.tgnet.g.q;

public class ax extends HorizontalScrollView
{
  private LinearLayout.LayoutParams a;
  private LinearLayout b;
  private a c;
  private int d;
  private int e;
  private Paint f;
  private int g = -10066330;
  private int h = 436207616;
  private int i;
  private int j = a.a(52.0F);
  private int k = a.a(2.0F);
  private int l = a.a(12.0F);
  private int m = a.a(24.0F);
  private int n = 0;

  public ax(Context paramContext)
  {
    super(paramContext);
    setFillViewport(true);
    setWillNotDraw(false);
    setHorizontalScrollBarEnabled(false);
    this.b = new LinearLayout(paramContext);
    this.b.setOrientation(0);
    this.b.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
    addView(this.b);
    this.f = new Paint();
    this.f.setAntiAlias(true);
    this.f.setStyle(Paint.Style.FILL);
    this.a = new LinearLayout.LayoutParams(a.a(52.0F), -1);
  }

  private void d(int paramInt)
  {
    if ((this.d == 0) || (this.b.getChildAt(paramInt) == null));
    int i1;
    do
    {
      do
      {
        return;
        int i2 = this.b.getChildAt(paramInt).getLeft();
        i1 = i2;
        if (paramInt > 0)
          i1 = i2 - this.j;
        paramInt = getScrollX();
      }
      while (i1 == this.n);
      if (i1 >= paramInt)
        continue;
      this.n = i1;
      smoothScrollTo(this.n, 0);
      return;
    }
    while (this.j + i1 <= paramInt + getWidth() - this.j * 2);
    this.n = (i1 - getWidth() + this.j * 3);
    smoothScrollTo(this.n, 0);
  }

  public void a()
  {
    this.b.removeAllViews();
    this.d = 0;
    this.e = 0;
  }

  public void a(int paramInt)
  {
    if ((paramInt < 0) || (paramInt >= this.d))
      return;
    View localView = this.b.getChildAt(paramInt);
    if (Build.VERSION.SDK_INT >= 15)
    {
      localView.callOnClick();
      return;
    }
    localView.performClick();
  }

  public void a(int paramInt1, int paramInt2)
  {
    if (this.e == paramInt1);
    do
    {
      return;
      this.e = paramInt1;
    }
    while (paramInt1 >= this.b.getChildCount());
    int i1 = 0;
    if (i1 < this.b.getChildCount())
    {
      View localView = this.b.getChildAt(i1);
      if (i1 == paramInt1);
      for (boolean bool = true; ; bool = false)
      {
        localView.setSelected(bool);
        i1 += 1;
        break;
      }
    }
    if ((paramInt2 == paramInt1) && (paramInt1 > 1))
      d(paramInt1 - 1);
    while (true)
    {
      invalidate();
      return;
      d(paramInt1);
    }
  }

  public void a(g.q paramq)
  {
    int i1 = this.d;
    this.d = (i1 + 1);
    FrameLayout localFrameLayout = new FrameLayout(getContext());
    localFrameLayout.setFocusable(true);
    localFrameLayout.setOnClickListener(new View.OnClickListener(i1)
    {
      public void onClick(View paramView)
      {
        ax.a(ax.this).a(this.a);
      }
    });
    this.b.addView(localFrameLayout);
    if (i1 == this.e);
    for (boolean bool = true; ; bool = false)
    {
      localFrameLayout.setSelected(bool);
      BackupImageView localBackupImageView = new BackupImageView(getContext());
      if ((paramq != null) && (paramq.i != null))
        localBackupImageView.a(paramq.i.c, null, "webp", null);
      localBackupImageView.setAspectFit(true);
      localFrameLayout.addView(localBackupImageView, v.b(30, 30, 17));
      return;
    }
  }

  public TextView b(int paramInt)
  {
    int i1 = this.d;
    this.d = (i1 + 1);
    FrameLayout localFrameLayout = new FrameLayout(getContext());
    localFrameLayout.setFocusable(true);
    this.b.addView(localFrameLayout);
    Object localObject = new ImageView(getContext());
    ((ImageView)localObject).setImageResource(paramInt);
    ((ImageView)localObject).setScaleType(ImageView.ScaleType.CENTER);
    localFrameLayout.setOnClickListener(new View.OnClickListener(i1)
    {
      public void onClick(View paramView)
      {
        ax.a(ax.this).a(this.a);
      }
    });
    localFrameLayout.addView((View)localObject, v.a(-1, -1.0F));
    if (i1 == this.e);
    for (boolean bool = true; ; bool = false)
    {
      localFrameLayout.setSelected(bool);
      localObject = new TextView(getContext());
      ((TextView)localObject).setTypeface(a.a("fonts/rmedium.ttf"));
      ((TextView)localObject).setTextSize(1, 12.0F);
      ((TextView)localObject).setTextColor(-1);
      ((TextView)localObject).setGravity(17);
      ((TextView)localObject).setBackgroundResource(2130838152);
      ((TextView)localObject).setMinWidth(a.a(18.0F));
      ((TextView)localObject).setPadding(a.a(5.0F), 0, a.a(5.0F), a.a(1.0F));
      localFrameLayout.addView((View)localObject, v.a(-2, 18.0F, 51, 26.0F, 6.0F, 0.0F, 0.0F));
      return localObject;
    }
  }

  public void b()
  {
    int i1 = 0;
    while (i1 < this.d)
    {
      this.b.getChildAt(i1).setLayoutParams(this.a);
      i1 += 1;
    }
  }

  public void c(int paramInt)
  {
    boolean bool = true;
    int i1 = this.d;
    this.d = (i1 + 1);
    ImageView localImageView = new ImageView(getContext());
    localImageView.setFocusable(true);
    localImageView.setImageResource(paramInt);
    localImageView.setScaleType(ImageView.ScaleType.CENTER);
    localImageView.setOnClickListener(new View.OnClickListener(i1)
    {
      public void onClick(View paramView)
      {
        ax.a(ax.this).a(this.a);
      }
    });
    this.b.addView(localImageView);
    if (i1 == this.e);
    while (true)
    {
      localImageView.setSelected(bool);
      return;
      bool = false;
    }
  }

  public int getCurrentPosition()
  {
    return this.e;
  }

  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    if ((isInEditMode()) || (this.d == 0))
      return;
    int i1 = getHeight();
    this.f.setColor(this.h);
    paramCanvas.drawRect(0.0F, i1 - this.k, this.b.getWidth(), i1, this.f);
    View localView = this.b.getChildAt(this.e);
    float f1;
    float f2;
    if (localView != null)
    {
      f1 = localView.getLeft();
      f2 = localView.getRight();
    }
    while (true)
    {
      this.f.setColor(this.g);
      if (this.i == 0)
      {
        paramCanvas.drawRect(f1, 0.0F, f2, i1, this.f);
        return;
      }
      paramCanvas.drawRect(f1, i1 - this.i, f2, i1, this.f);
      return;
      f2 = 0.0F;
      f1 = 0.0F;
    }
  }

  protected void onScrollChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onScrollChanged(paramInt1, paramInt2, paramInt3, paramInt4);
  }

  public void setDelegate(a parama)
  {
    this.c = parama;
  }

  public void setIndicatorColor(int paramInt)
  {
    this.g = paramInt;
    invalidate();
  }

  public void setIndicatorHeight(int paramInt)
  {
    this.i = paramInt;
    invalidate();
  }

  public void setUnderlineColor(int paramInt)
  {
    this.h = paramInt;
    invalidate();
  }

  public void setUnderlineColorResource(int paramInt)
  {
    this.h = getResources().getColor(paramInt);
    invalidate();
  }

  public void setUnderlineHeight(int paramInt)
  {
    this.k = paramInt;
    invalidate();
  }

  public static abstract interface a
  {
    public abstract void a(int paramInt);
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.Components.ax
 * JD-Core Version:    0.6.0
 */