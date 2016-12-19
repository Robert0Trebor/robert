package org.vidogram.ui.Components.a.a;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import java.util.UUID;
import org.vidogram.messenger.a;
import org.vidogram.ui.Components.ap;
import org.vidogram.ui.Components.av;

public class d extends FrameLayout
{
  protected ap a = new ap();
  protected b b;
  private float c;
  private float d;
  private boolean e = false;
  private boolean f = false;
  private boolean g = false;
  private boolean h = false;
  private boolean i = false;
  private boolean j = false;
  private a k;
  private int l;
  private int m;
  private GestureDetector n;
  private UUID o = UUID.randomUUID();

  public d(Context paramContext, ap paramap)
  {
    super(paramContext);
    this.a = paramap;
    this.n = new GestureDetector(paramContext, new GestureDetector.SimpleOnGestureListener()
    {
      public void onLongPress(MotionEvent paramMotionEvent)
      {
        if ((d.a(d.this)) || (d.b(d.this)) || (d.c(d.this)));
        do
        {
          return;
          d.a(d.this, true);
        }
        while (d.d(d.this) == null);
        d.this.performHapticFeedback(0);
        d.d(d.this).b(d.this);
      }
    });
  }

  private boolean a(float paramFloat1, float paramFloat2)
  {
    float f1 = ((View)getParent()).getScaleX();
    ap localap = new ap((paramFloat1 - this.c) / f1, (paramFloat2 - this.d) / f1);
    float f2 = (float)Math.hypot(localap.a, localap.b);
    if (this.e)
      f1 = 6.0F;
    while (f2 > f1)
    {
      a(localap);
      this.c = paramFloat1;
      this.d = paramFloat2;
      if (!this.i)
      {
        this.i = true;
        if (this.k != null)
          this.k.d(this);
      }
      this.e = true;
      return true;
      f1 = 16.0F;
    }
    return false;
  }

  private void e()
  {
    if ((!this.j) && (!this.e) && (!this.g) && (!this.h) && (this.k != null))
      this.k.a(this);
    if ((this.i) && (this.k != null))
      this.k.e(this);
    this.j = false;
    this.e = false;
    this.g = false;
    this.f = true;
    this.h = false;
    this.i = false;
  }

  protected void a()
  {
    float f1 = getWidth() / 2.0F;
    float f2 = getHeight() / 2.0F;
    setX(this.a.a - f1);
    setY(this.a.b - f2);
    c();
  }

  public void a(float paramFloat)
  {
    setScale(Math.max(getScale() * paramFloat, 0.1F));
    c();
  }

  public void a(int paramInt1, int paramInt2)
  {
    this.l = paramInt1;
    this.m = paramInt2;
  }

  public void a(ViewGroup paramViewGroup)
  {
    b localb = b();
    this.b = localb;
    paramViewGroup.addView(localb);
    localb.a();
  }

  public void a(ap paramap)
  {
    ap localap = this.a;
    localap.a += paramap.a;
    localap = this.a;
    localap.b += paramap.b;
    a();
  }

  protected b b()
  {
    return null;
  }

  public void b(float paramFloat)
  {
    setRotation(paramFloat);
    c();
  }

  public void c()
  {
    if (this.b != null)
      this.b.a();
  }

  public void d()
  {
    if (this.b == null)
      return;
    if (this.b.getParent() != null)
      ((ViewGroup)this.b.getParent()).removeView(this.b);
    this.b = null;
  }

  public ap getPosition()
  {
    return this.a;
  }

  public float getScale()
  {
    return getScaleX();
  }

  protected av getSelectionBounds()
  {
    return new av(0.0F, 0.0F, 0.0F, 0.0F);
  }

  public UUID getUUID()
  {
    return this.o;
  }

  public boolean isSelected()
  {
    return this.b != null;
  }

  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    return this.k.c(this);
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool = true;
    if ((paramMotionEvent.getPointerCount() > 1) || (!this.k.c(this)))
      return false;
    float f1 = paramMotionEvent.getRawX();
    float f2 = paramMotionEvent.getRawY();
    switch (paramMotionEvent.getActionMasked())
    {
    case 4:
    default:
      bool = false;
    case 0:
    case 5:
    case 2:
    case 1:
    case 3:
    case 6:
    }
    while (true)
    {
      this.n.onTouchEvent(paramMotionEvent);
      return bool;
      if ((!isSelected()) && (this.k != null))
      {
        this.k.a(this);
        this.h = true;
      }
      this.c = f1;
      this.d = f2;
      this.f = false;
      continue;
      bool = a(f1, f2);
      continue;
      e();
    }
  }

  public void setDelegate(a parama)
  {
    this.k = parama;
  }

  public void setPosition(ap paramap)
  {
    this.a = paramap;
    a();
  }

  public void setScale(float paramFloat)
  {
    setScaleX(paramFloat);
    setScaleY(paramFloat);
  }

  public void setSelectionVisibility(boolean paramBoolean)
  {
    if (this.b == null)
      return;
    b localb = this.b;
    if (paramBoolean);
    for (int i1 = 0; ; i1 = 8)
    {
      localb.setVisibility(i1);
      return;
    }
  }

  public static abstract interface a
  {
    public abstract boolean a(d paramd);

    public abstract boolean b(d paramd);

    public abstract boolean c(d paramd);

    public abstract void d(d paramd);

    public abstract void e(d paramd);
  }

  public class b extends FrameLayout
  {
    protected Paint a = new Paint(1);
    protected Paint b = new Paint(1);
    protected Paint c = new Paint(1);
    private int e;

    public b(Context arg2)
    {
      super();
      setWillNotDraw(false);
      this.a.setColor(-1);
      this.b.setColor(-12793105);
      this.c.setColor(-1);
      this.c.setStyle(Paint.Style.STROKE);
      this.c.setStrokeWidth(a.a(1.0F));
    }

    protected int a(float paramFloat1, float paramFloat2)
    {
      return 0;
    }

    protected void a()
    {
      av localav = d.this.getSelectionBounds();
      FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)getLayoutParams();
      localLayoutParams.leftMargin = ((int)localav.a + d.e(d.this));
      localLayoutParams.topMargin = ((int)localav.b + d.f(d.this));
      localLayoutParams.width = (int)localav.c;
      localLayoutParams.height = (int)localav.d;
      setLayoutParams(localLayoutParams);
      setRotation(d.this.getRotation());
    }

    public boolean onTouchEvent(MotionEvent paramMotionEvent)
    {
      boolean bool2 = false;
      boolean bool1 = bool2;
      switch (paramMotionEvent.getActionMasked())
      {
      default:
        bool1 = bool2;
      case 4:
      case 0:
      case 5:
      case 2:
      case 1:
      case 3:
      case 6:
      }
      while (true)
      {
        if (this.e == 3)
          d.k(d.this).onTouchEvent(paramMotionEvent);
        return bool1;
        int i = a(paramMotionEvent.getX(), paramMotionEvent.getY());
        bool1 = bool2;
        if (i == 0)
          continue;
        this.e = i;
        d.a(d.this, paramMotionEvent.getRawX());
        d.b(d.this, paramMotionEvent.getRawY());
        d.b(d.this, false);
        bool1 = true;
        continue;
        if (this.e == 3)
        {
          f1 = paramMotionEvent.getRawX();
          f2 = paramMotionEvent.getRawY();
          bool1 = d.a(d.this, f1, f2);
          continue;
        }
        bool1 = bool2;
        if (this.e == 0)
          continue;
        d.c(d.this, true);
        ap localap = new ap(paramMotionEvent.getRawX() - d.g(d.this), paramMotionEvent.getRawY() - d.h(d.this));
        float f1 = (float)Math.toRadians(getRotation());
        double d1 = localap.a;
        double d2 = Math.cos(f1);
        double d3 = localap.b;
        float f2 = (float)(Math.sin(f1) * d3 + d1 * d2);
        f1 = f2;
        if (this.e == 1)
          f1 = f2 * -1.0F;
        f1 = f1 * 2.0F / getWidth();
        d.this.a(f1 + 1.0F);
        f2 = getLeft() + getWidth() / 2;
        float f3 = getTop() + getHeight() / 2;
        float f4 = paramMotionEvent.getRawX() - ((View)getParent()).getLeft();
        float f5 = paramMotionEvent.getRawY() - ((View)getParent()).getTop() - a.a;
        f1 = 0.0F;
        if (this.e == 1)
          f1 = (float)Math.atan2(f3 - f5, f2 - f4);
        while (true)
        {
          d.this.b((float)Math.toDegrees(f1));
          d.a(d.this, paramMotionEvent.getRawX());
          d.b(d.this, paramMotionEvent.getRawY());
          if (!d.i(d.this))
          {
            d.d(d.this, true);
            if (d.d(d.this) != null)
              d.d(d.this).d(d.this);
          }
          bool1 = true;
          break;
          if (this.e != 2)
            continue;
          f1 = (float)Math.atan2(f5 - f3, f4 - f2);
        }
        d.j(d.this);
        this.e = 0;
        bool1 = true;
      }
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.Components.a.a.d
 * JD-Core Version:    0.6.0
 */