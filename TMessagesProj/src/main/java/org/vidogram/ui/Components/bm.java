package org.vidogram.ui.Components;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region.Op;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.CompoundButton;
import org.vidogram.messenger.a;
import org.vidogram.messenger.r;

public class bm extends CompoundButton
{
  private Drawable a;
  private Drawable b;
  private int c;
  private int d;
  private int e;
  private boolean f;
  private boolean g;
  private boolean h;
  private int i;
  private int j;
  private float k;
  private float l;
  private VelocityTracker m = VelocityTracker.obtain();
  private int n;
  private float o;
  private int p;
  private int q;
  private int r;
  private int s;
  private int t;
  private int u;
  private int v;
  private ObjectAnimator w;
  private final Rect x = new Rect();

  public bm(Context paramContext)
  {
    super(paramContext);
    this.a = paramContext.getResources().getDrawable(2130838159);
    if (this.a != null)
      this.a.setCallback(this);
    this.b = paramContext.getResources().getDrawable(2130838162);
    if (this.b != null)
      this.b.setCallback(this);
    if (a.b < 1.0F);
    for (this.d = a.a(30.0F); ; this.d = 0)
    {
      this.e = 0;
      this.f = false;
      paramContext = ViewConfiguration.get(paramContext);
      this.j = paramContext.getScaledTouchSlop();
      this.n = paramContext.getScaledMinimumFlingVelocity();
      refreshDrawableState();
      setChecked(isChecked());
      return;
    }
  }

  public static float a(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    if (paramFloat1 < paramFloat2)
      return paramFloat2;
    if (paramFloat1 > paramFloat3)
      return paramFloat3;
    return paramFloat1;
  }

  private void a()
  {
    if (this.w != null)
      this.w.cancel();
  }

  private void a(MotionEvent paramMotionEvent)
  {
    paramMotionEvent = MotionEvent.obtain(paramMotionEvent);
    paramMotionEvent.setAction(3);
    super.onTouchEvent(paramMotionEvent);
    paramMotionEvent.recycle();
  }

  private void a(boolean paramBoolean)
  {
    float f1;
    if (paramBoolean)
      f1 = 1.0F;
    while (true)
    {
      this.w = ObjectAnimator.ofFloat(this, "thumbPosition", new float[] { f1 });
      this.w.setDuration(250L);
      this.w.start();
      return;
      f1 = 0.0F;
    }
  }

  private boolean a(float paramFloat1, float paramFloat2)
  {
    int i3 = getThumbOffset();
    this.a.getPadding(this.x);
    int i1 = this.t;
    int i2 = this.j;
    i3 = i3 + this.s - this.j;
    int i4 = this.r;
    int i5 = this.x.left;
    int i6 = this.x.right;
    int i7 = this.j;
    int i8 = this.v;
    int i9 = this.j;
    return (paramFloat1 > i3) && (paramFloat1 < i4 + i3 + i5 + i6 + i7) && (paramFloat2 > i1 - i2) && (paramFloat2 < i8 + i9);
  }

  private void b(MotionEvent paramMotionEvent)
  {
    boolean bool = true;
    this.i = 0;
    int i1;
    float f1;
    if ((paramMotionEvent.getAction() == 1) && (isEnabled()))
    {
      i1 = 1;
      if (i1 == 0)
        break label116;
      this.m.computeCurrentVelocity(1000);
      f1 = this.m.getXVelocity();
      if (Math.abs(f1) <= this.n)
        break label107;
      if (!r.a)
        break label95;
      if (f1 >= 0.0F)
        break label89;
    }
    while (true)
    {
      setChecked(bool);
      a(paramMotionEvent);
      return;
      i1 = 0;
      break;
      label89: bool = false;
      continue;
      label95: if (f1 > 0.0F)
        continue;
      bool = false;
      continue;
      label107: bool = getTargetCheckedState();
      continue;
      label116: bool = isChecked();
    }
  }

  private boolean getTargetCheckedState()
  {
    return this.o > 0.5F;
  }

  private int getThumbOffset()
  {
    float f1;
    if (r.a)
      f1 = 1.0F - this.o;
    while (true)
    {
      return (int)(f1 * getThumbScrollRange() + 0.5F);
      f1 = this.o;
    }
  }

  private int getThumbScrollRange()
  {
    if (this.b != null)
    {
      Rect localRect = this.x;
      this.b.getPadding(localRect);
      if (this.a != null);
      for (a locala = a.a; ; locala = a.a)
        return this.p - this.r - localRect.left - localRect.right - locala.b - locala.d;
    }
    return 0;
  }

  private void setThumbPosition(float paramFloat)
  {
    this.o = paramFloat;
    invalidate();
  }

  public void draw(Canvas paramCanvas)
  {
    Rect localRect = this.x;
    int i2 = this.s;
    int i5 = this.t;
    int i7 = this.u;
    int i6 = this.v;
    int i8 = i2 + getThumbOffset();
    Object localObject;
    int i9;
    label138: int i4;
    int i3;
    if (this.a != null)
    {
      localObject = a.a;
      if (this.b == null)
        break label377;
      this.b.getPadding(localRect);
      i9 = localRect.left;
      if (localObject == a.a)
        break label357;
      i1 = i2;
      if (((a)localObject).b > localRect.left)
        i1 = i2 + (((a)localObject).b - localRect.left);
      if (((a)localObject).c <= localRect.top)
        break label351;
      i2 = ((a)localObject).c - localRect.top + i5;
      i4 = i7;
      if (((a)localObject).d > localRect.right)
        i4 = i7 - (((a)localObject).d - localRect.right);
      if (((a)localObject).e <= localRect.bottom)
        break label344;
      i3 = i6 - (((a)localObject).e - localRect.bottom);
      label200: this.b.setBounds(i1, i2, i4, i3);
    }
    label339: label344: label351: label357: label377: for (int i1 = i9 + i8; ; i1 = i8)
    {
      if (this.a != null)
      {
        this.a.getPadding(localRect);
        i2 = i1 - localRect.left;
        i3 = this.r;
        i3 = localRect.right + (i1 + i3);
        if (a.b != 1.5F)
          break label339;
      }
      for (i1 = a.a(1.0F); ; i1 = 0)
      {
        this.a.setBounds(i2, i5 + i1, i3, i1 + i6);
        localObject = getBackground();
        if ((localObject != null) && (Build.VERSION.SDK_INT >= 21))
          ((Drawable)localObject).setHotspotBounds(i2, i5, i3, i6);
        super.draw(paramCanvas);
        return;
        localObject = a.a;
        break;
      }
      i3 = i6;
      break label200;
      i2 = i5;
      break label138;
      i3 = i6;
      i4 = i5;
      i1 = i2;
      i2 = i4;
      i4 = i7;
      break label200;
    }
  }

  @SuppressLint({"NewApi"})
  public void drawableHotspotChanged(float paramFloat1, float paramFloat2)
  {
    super.drawableHotspotChanged(paramFloat1, paramFloat2);
    if (this.a != null)
      this.a.setHotspot(paramFloat1, paramFloat2);
    if (this.b != null)
      this.b.setHotspot(paramFloat1, paramFloat2);
  }

  protected void drawableStateChanged()
  {
    super.drawableStateChanged();
    int[] arrayOfInt = getDrawableState();
    if (this.a != null)
      this.a.setState(arrayOfInt);
    if (this.b != null)
      this.b.setState(arrayOfInt);
    invalidate();
  }

  public int getCompoundPaddingLeft()
  {
    if (!r.a)
      return super.getCompoundPaddingLeft();
    return super.getCompoundPaddingLeft() + this.p;
  }

  public int getCompoundPaddingRight()
  {
    if (r.a)
      return super.getCompoundPaddingRight();
    return super.getCompoundPaddingRight() + this.p;
  }

  public boolean getSplitTrack()
  {
    return this.f;
  }

  public int getSwitchMinWidth()
  {
    return this.d;
  }

  public int getSwitchPadding()
  {
    return this.e;
  }

  public Drawable getThumbDrawable()
  {
    return this.a;
  }

  public float getThumbPosition()
  {
    return this.o;
  }

  public int getThumbTextPadding()
  {
    return this.c;
  }

  public Drawable getTrackDrawable()
  {
    return this.b;
  }

  public void jumpDrawablesToCurrentState()
  {
    super.jumpDrawablesToCurrentState();
    if (this.a != null)
      this.a.jumpToCurrentState();
    if (this.b != null)
      this.b.jumpToCurrentState();
    if ((this.w != null) && (this.w.isRunning()))
    {
      this.w.end();
      this.w = null;
    }
  }

  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    this.g = true;
    requestLayout();
  }

  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    this.g = false;
    this.h = false;
  }

  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    Rect localRect = this.x;
    Drawable localDrawable1 = this.b;
    int i1;
    Drawable localDrawable2;
    if (localDrawable1 != null)
    {
      localDrawable1.getPadding(localRect);
      i1 = this.t;
      i1 = this.v;
      localDrawable2 = this.a;
      if (localDrawable1 != null)
      {
        if ((!this.f) || (localDrawable2 == null))
          break label154;
        a locala = a.a;
        localDrawable2.copyBounds(localRect);
        localRect.left += locala.b;
        localRect.right -= locala.d;
        i1 = paramCanvas.save();
        paramCanvas.clipRect(localRect, Region.Op.DIFFERENCE);
        localDrawable1.draw(paramCanvas);
        paramCanvas.restoreToCount(i1);
      }
    }
    while (true)
    {
      i1 = paramCanvas.save();
      if (localDrawable2 != null)
        localDrawable2.draw(paramCanvas);
      paramCanvas.restoreToCount(i1);
      return;
      localRect.setEmpty();
      break;
      label154: localDrawable1.draw(paramCanvas);
    }
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i1 = 0;
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    this.h = true;
    Rect localRect;
    a locala;
    if (this.a != null)
    {
      localRect = this.x;
      if (this.b != null)
      {
        this.b.getPadding(localRect);
        locala = a.a;
        paramInt2 = Math.max(0, locala.b - localRect.left);
      }
    }
    for (paramInt1 = Math.max(0, locala.d - localRect.right); ; paramInt1 = i1)
    {
      if (r.a)
      {
        paramInt3 = getPaddingLeft() + paramInt2;
        paramInt4 = this.p + paramInt3 - paramInt2 - paramInt1;
        label113: switch (getGravity() & 0x70)
        {
        default:
          paramInt2 = getPaddingTop();
          paramInt1 = this.q + paramInt2;
        case 16:
        case 80:
        }
      }
      while (true)
      {
        this.s = paramInt3;
        this.t = paramInt2;
        this.v = paramInt1;
        this.u = paramInt4;
        return;
        localRect.setEmpty();
        break;
        paramInt4 = getWidth() - getPaddingRight() - paramInt1;
        paramInt3 = paramInt1 + (paramInt2 + (paramInt4 - this.p));
        break label113;
        paramInt2 = (getPaddingTop() + getHeight() - getPaddingBottom()) / 2 - this.q / 2;
        paramInt1 = this.q + paramInt2;
        continue;
        paramInt1 = getHeight() - getPaddingBottom();
        paramInt2 = paramInt1 - this.q;
      }
      paramInt2 = 0;
    }
  }

  public void onMeasure(int paramInt1, int paramInt2)
  {
    int i3 = 0;
    Object localObject = this.x;
    int i1;
    if (this.a != null)
    {
      this.a.getPadding((Rect)localObject);
      i2 = this.a.getIntrinsicWidth() - ((Rect)localObject).left - ((Rect)localObject).right;
      i1 = this.a.getIntrinsicHeight();
      this.r = i2;
      if (this.b == null)
        break label214;
      this.b.getPadding((Rect)localObject);
    }
    for (int i2 = this.b.getIntrinsicHeight(); ; i2 = i3)
    {
      int i6 = ((Rect)localObject).left;
      int i5 = ((Rect)localObject).right;
      int i4 = i5;
      i3 = i6;
      if (this.a != null)
      {
        localObject = a.a;
        i3 = Math.max(i6, ((a)localObject).b);
        i4 = Math.max(i5, ((a)localObject).d);
      }
      i3 = Math.max(this.d, i4 + (i3 + this.r * 2));
      i1 = Math.max(i2, i1);
      this.p = i3;
      this.q = i1;
      super.onMeasure(paramInt1, paramInt2);
      if (getMeasuredHeight() < i1)
        setMeasuredDimension(i3, i1);
      return;
      i1 = 0;
      i2 = 0;
      break;
      label214: ((Rect)localObject).setEmpty();
    }
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    this.m.addMovement(paramMotionEvent);
    switch (paramMotionEvent.getActionMasked())
    {
    default:
    case 0:
    case 2:
    case 1:
    case 3:
    }
    while (true)
    {
      return super.onTouchEvent(paramMotionEvent);
      float f1 = paramMotionEvent.getX();
      float f2 = paramMotionEvent.getY();
      if ((!isEnabled()) || (!a(f1, f2)))
        continue;
      this.i = 1;
      this.k = f1;
      this.l = f2;
      continue;
      switch (this.i)
      {
      case 0:
      default:
        break;
      case 1:
        f1 = paramMotionEvent.getX();
        f2 = paramMotionEvent.getY();
        if ((Math.abs(f1 - this.k) <= this.j) && (Math.abs(f2 - this.l) <= this.j))
          continue;
        this.i = 2;
        getParent().requestDisallowInterceptTouchEvent(true);
        this.k = f1;
        this.l = f2;
        return true;
      case 2:
        float f3 = paramMotionEvent.getX();
        int i1 = getThumbScrollRange();
        f1 = f3 - this.k;
        if (i1 != 0)
          f1 /= i1;
        while (true)
        {
          f2 = f1;
          if (r.a)
            f2 = -f1;
          f1 = a(f2 + this.o, 0.0F, 1.0F);
          if (f1 != this.o)
          {
            this.k = f3;
            setThumbPosition(f1);
          }
          return true;
          if (f1 > 0.0F)
          {
            f1 = 1.0F;
            continue;
          }
          f1 = -1.0F;
        }
        if (this.i == 2)
        {
          b(paramMotionEvent);
          super.onTouchEvent(paramMotionEvent);
          return true;
        }
        this.i = 0;
        this.m.clear();
      }
    }
  }

  public void setChecked(boolean paramBoolean)
  {
    super.setChecked(paramBoolean);
    paramBoolean = isChecked();
    Drawable localDrawable;
    if ((this.g) && (this.h))
    {
      a(paramBoolean);
      if (this.b != null)
      {
        localDrawable = this.b;
        if (!paramBoolean)
          break label127;
        i1 = -6236422;
        label50: localDrawable.setColorFilter(new PorterDuffColorFilter(i1, PorterDuff.Mode.MULTIPLY));
      }
      if (this.a != null)
      {
        localDrawable = this.a;
        if (!paramBoolean)
          break label134;
      }
    }
    label134: for (int i1 = -12211217; ; i1 = -1184275)
    {
      localDrawable.setColorFilter(new PorterDuffColorFilter(i1, PorterDuff.Mode.MULTIPLY));
      return;
      a();
      float f1;
      if (paramBoolean)
        f1 = 1.0F;
      while (true)
      {
        setThumbPosition(f1);
        break;
        f1 = 0.0F;
      }
      label127: i1 = -3684409;
      break label50;
    }
  }

  public void setSplitTrack(boolean paramBoolean)
  {
    this.f = paramBoolean;
    invalidate();
  }

  public void setSwitchMinWidth(int paramInt)
  {
    this.d = paramInt;
    requestLayout();
  }

  public void setSwitchPadding(int paramInt)
  {
    this.e = paramInt;
    requestLayout();
  }

  public void setThumbDrawable(Drawable paramDrawable)
  {
    if (this.a != null)
      this.a.setCallback(null);
    this.a = paramDrawable;
    if (paramDrawable != null)
      paramDrawable.setCallback(this);
    requestLayout();
  }

  public void setThumbTextPadding(int paramInt)
  {
    this.c = paramInt;
    requestLayout();
  }

  public void setTrackDrawable(Drawable paramDrawable)
  {
    if (this.b != null)
      this.b.setCallback(null);
    this.b = paramDrawable;
    if (paramDrawable != null)
      paramDrawable.setCallback(this);
    requestLayout();
  }

  public void toggle()
  {
    if (!isChecked());
    for (boolean bool = true; ; bool = false)
    {
      setChecked(bool);
      return;
    }
  }

  protected boolean verifyDrawable(Drawable paramDrawable)
  {
    return (super.verifyDrawable(paramDrawable)) || (paramDrawable == this.a) || (paramDrawable == this.b);
  }

  public static class a
  {
    public static final a a = new a(a.a(4.0F), 0, a.a(4.0F), 0);
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    private a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      this.b = paramInt1;
      this.c = paramInt2;
      this.d = paramInt3;
      this.e = paramInt4;
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.Components.bm
 * JD-Core Version:    0.6.0
 */