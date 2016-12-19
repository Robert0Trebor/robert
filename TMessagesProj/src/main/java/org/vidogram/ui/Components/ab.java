package org.vidogram.ui.Components;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.animation.DecelerateInterpolator;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import java.util.Locale;

public class ab extends LinearLayout
{
  private int A;
  private a B;
  private float C;
  private long D;
  private float E;
  private VelocityTracker F;
  private int G;
  private int H;
  private int I;
  private boolean J;
  private int K;
  private Drawable L;
  private int M;
  private int N = 0;
  private boolean O;
  private int P;
  private int Q;
  private boolean R;
  private boolean S;
  private e T;
  private int U = -1;
  private TextView a;
  private int b;
  private int c;
  private int d;
  private int e;
  private int f;
  private boolean g;
  private int h;
  private int i;
  private String[] j;
  private int k;
  private int l;
  private int m;
  private d n;
  private c o;
  private b p;
  private long q = 300L;
  private final SparseArray<String> r = new SparseArray();
  private final int[] s = new int[3];
  private Paint t;
  private Drawable u;
  private int v;
  private int w = -2147483648;
  private int x;
  private ay y;
  private ay z;

  public ab(Context paramContext)
  {
    super(paramContext);
    a();
  }

  private int a(int paramInt1, int paramInt2)
  {
    if (paramInt2 == -1)
      return paramInt1;
    int i1 = View.MeasureSpec.getSize(paramInt1);
    int i2 = View.MeasureSpec.getMode(paramInt1);
    switch (i2)
    {
    case 1073741824:
    default:
      throw new IllegalArgumentException("Unknown measure mode: " + i2);
    case -2147483648:
      return View.MeasureSpec.makeMeasureSpec(Math.min(i1, paramInt2), 1073741824);
    case 0:
    }
    return View.MeasureSpec.makeMeasureSpec(paramInt2, 1073741824);
  }

  public static int a(int paramInt1, int paramInt2, int paramInt3)
  {
    int i2 = View.MeasureSpec.getMode(paramInt2);
    int i1 = View.MeasureSpec.getSize(paramInt2);
    paramInt2 = paramInt1;
    switch (i2)
    {
    default:
      paramInt2 = paramInt1;
    case 0:
    case -2147483648:
    case 1073741824:
    }
    while (true)
    {
      return 0xFF000000 & paramInt3 | paramInt2;
      paramInt2 = paramInt1;
      if (i1 >= paramInt1)
        continue;
      paramInt2 = i1 | 0x1000000;
      continue;
      paramInt2 = i1;
    }
  }

  private void a()
  {
    this.K = 0;
    this.L = getResources().getDrawable(2130838012);
    this.M = (int)TypedValue.applyDimension(1, 2.0F, getResources().getDisplayMetrics());
    this.b = (int)TypedValue.applyDimension(1, 48.0F, getResources().getDisplayMetrics());
    this.c = -1;
    this.d = (int)TypedValue.applyDimension(1, 180.0F, getResources().getDisplayMetrics());
    if ((this.c != -1) && (this.d != -1) && (this.c > this.d))
      throw new IllegalArgumentException("minHeight > maxHeight");
    this.e = (int)TypedValue.applyDimension(1, 64.0F, getResources().getDisplayMetrics());
    this.f = -1;
    if ((this.e != -1) && (this.f != -1) && (this.e > this.f))
      throw new IllegalArgumentException("minWidth > maxWidth");
    if (this.f == -1);
    for (boolean bool = true; ; bool = false)
    {
      this.g = bool;
      this.u = getResources().getDrawable(2130837934);
      this.T = new e();
      setWillNotDraw(false);
      this.a = new TextView(getContext());
      addView(this.a);
      this.a.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
      this.a.setGravity(17);
      this.a.setSingleLine(true);
      this.a.setBackgroundResource(0);
      this.a.setTextSize(2, 18.0F);
      Object localObject = ViewConfiguration.get(getContext());
      this.G = ((ViewConfiguration)localObject).getScaledTouchSlop();
      this.H = ((ViewConfiguration)localObject).getScaledMinimumFlingVelocity();
      this.I = (((ViewConfiguration)localObject).getScaledMaximumFlingVelocity() / 8);
      this.h = (int)this.a.getTextSize();
      localObject = new Paint();
      ((Paint)localObject).setAntiAlias(true);
      ((Paint)localObject).setTextAlign(Paint.Align.CENTER);
      ((Paint)localObject).setTextSize(this.h);
      ((Paint)localObject).setTypeface(this.a.getTypeface());
      ((Paint)localObject).setColor(this.a.getTextColors().getColorForState(ENABLED_STATE_SET, -1));
      this.t = ((Paint)localObject);
      this.y = new ay(getContext(), null, true);
      this.z = new ay(getContext(), new DecelerateInterpolator(2.5F));
      f();
      return;
    }
  }

  private void a(int paramInt)
  {
    if (this.N == paramInt);
    do
    {
      return;
      this.N = paramInt;
    }
    while (this.o == null);
    this.o.a(this, paramInt);
  }

  private void a(int paramInt, boolean paramBoolean)
  {
    if (this.m == paramInt)
      return;
    if (this.J);
    for (paramInt = c(paramInt); ; paramInt = Math.min(Math.max(paramInt, this.k), this.l))
    {
      int i1 = this.m;
      this.m = paramInt;
      f();
      if (paramBoolean)
        b(i1, paramInt);
      c();
      invalidate();
      return;
    }
  }

  private void a(boolean paramBoolean)
  {
    this.a.setVisibility(4);
    if (!a(this.y))
      a(this.z);
    this.A = 0;
    if (paramBoolean)
      this.y.a(0, 0, 0, -this.v, 300);
    while (true)
    {
      invalidate();
      return;
      this.y.a(0, 0, 0, this.v, 300);
    }
  }

  private void a(boolean paramBoolean, long paramLong)
  {
    if (this.B == null)
      this.B = new a();
    while (true)
    {
      a.a(this.B, paramBoolean);
      postDelayed(this.B, paramLong);
      return;
      removeCallbacks(this.B);
    }
  }

  private void a(int[] paramArrayOfInt)
  {
    System.arraycopy(paramArrayOfInt, 1, paramArrayOfInt, 0, paramArrayOfInt.length - 1);
    int i2 = paramArrayOfInt[(paramArrayOfInt.length - 2)] + 1;
    int i1 = i2;
    if (this.J)
    {
      i1 = i2;
      if (i2 > this.l)
        i1 = this.k;
    }
    paramArrayOfInt[(paramArrayOfInt.length - 1)] = i1;
    d(i1);
  }

  private boolean a(ay paramay)
  {
    paramay.a(true);
    int i3 = paramay.e() - paramay.b();
    int i1 = this.x;
    int i2 = this.v;
    i2 = this.w - (i1 + i3) % i2;
    if (i2 != 0)
    {
      i1 = i2;
      if (Math.abs(i2) > this.v / 2)
        if (i2 <= 0)
          break label79;
      label79: for (i1 = i2 - this.v; ; i1 = i2 + this.v)
      {
        scrollBy(0, i1 + i3);
        return true;
      }
    }
    return false;
  }

  private int b(int paramInt1, int paramInt2, int paramInt3)
  {
    int i1 = paramInt2;
    if (paramInt1 != -1)
      i1 = a(Math.max(paramInt1, paramInt2), paramInt3, 0);
    return i1;
  }

  private void b()
  {
    int i2 = 0;
    if (!this.g)
      return;
    float f1;
    int i1;
    if (this.j == null)
    {
      f1 = 0.0F;
      i1 = 0;
      label22: if (i1 <= 9)
      {
        float f2 = this.t.measureText(f(i1));
        if (f2 <= f1)
          break label211;
        f1 = f2;
      }
    }
    label211: 
    while (true)
    {
      i1 += 1;
      break label22;
      i1 = this.l;
      while (i1 > 0)
      {
        i2 += 1;
        i1 /= 10;
      }
      int i3 = (int)(i2 * f1);
      i1 = i3 + (this.a.getPaddingLeft() + this.a.getPaddingRight());
      if (this.f == i1)
        break;
      if (i1 > this.e);
      for (this.f = i1; ; this.f = this.e)
      {
        invalidate();
        return;
        String[] arrayOfString = this.j;
        int i4 = arrayOfString.length;
        i2 = 0;
        for (i1 = 0; ; i1 = i3)
        {
          i3 = i1;
          if (i2 >= i4)
            break;
          String str = arrayOfString[i2];
          f1 = this.t.measureText(str);
          i3 = i1;
          if (f1 > i1)
            i3 = (int)f1;
          i2 += 1;
        }
      }
    }
  }

  private void b(int paramInt)
  {
    this.A = 0;
    if (paramInt > 0)
      this.y.a(0, 0, 0, paramInt, 0, 0, 0, 2147483647);
    while (true)
    {
      invalidate();
      return;
      this.y.a(0, 2147483647, 0, paramInt, 0, 0, 0, 2147483647);
    }
  }

  private void b(int paramInt1, int paramInt2)
  {
    if (this.n != null)
      this.n.a(this, paramInt1, this.m);
  }

  private void b(ay paramay)
  {
    if (paramay == this.y)
    {
      if (!i())
        f();
      a(0);
    }
    do
      return;
    while (this.N == 1);
    f();
  }

  private void b(int[] paramArrayOfInt)
  {
    System.arraycopy(paramArrayOfInt, 0, paramArrayOfInt, 1, paramArrayOfInt.length - 1);
    int i2 = paramArrayOfInt[1] - 1;
    int i1 = i2;
    if (this.J)
    {
      i1 = i2;
      if (i2 < this.k)
        i1 = this.l;
    }
    paramArrayOfInt[0] = i1;
    d(i1);
  }

  private int c(int paramInt)
  {
    int i1;
    if (paramInt > this.l)
      i1 = this.k + (paramInt - this.l) % (this.l - this.k) - 1;
    do
    {
      return i1;
      i1 = paramInt;
    }
    while (paramInt >= this.k);
    return this.l - (this.k - paramInt) % (this.l - this.k) + 1;
  }

  private void c()
  {
    this.r.clear();
    int[] arrayOfInt = this.s;
    int i4 = getValue();
    int i1 = 0;
    while (i1 < this.s.length)
    {
      int i3 = i1 - 1 + i4;
      int i2 = i3;
      if (this.J)
        i2 = c(i3);
      arrayOfInt[i1] = i2;
      d(arrayOfInt[i1]);
      i1 += 1;
    }
  }

  private void d()
  {
    c();
    int[] arrayOfInt = this.s;
    int i1 = arrayOfInt.length;
    int i2 = this.h;
    this.i = (int)((getBottom() - getTop() - i1 * i2) / arrayOfInt.length + 0.5F);
    this.v = (this.h + this.i);
    this.w = (this.a.getBaseline() + this.a.getTop() - this.v * 1);
    this.x = this.w;
    f();
  }

  private void d(int paramInt)
  {
    SparseArray localSparseArray = this.r;
    if ((String)localSparseArray.get(paramInt) != null)
      return;
    String str;
    if ((paramInt < this.k) || (paramInt > this.l))
      str = "";
    while (true)
    {
      localSparseArray.put(paramInt, str);
      return;
      if (this.j != null)
      {
        int i1 = this.k;
        str = this.j[(paramInt - i1)];
        continue;
      }
      str = e(paramInt);
    }
  }

  private String e(int paramInt)
  {
    if (this.p != null)
      return this.p.a(paramInt);
    return f(paramInt);
  }

  private void e()
  {
    setVerticalFadingEdgeEnabled(true);
    setFadingEdgeLength((getBottom() - getTop() - this.h) / 2);
  }

  private static String f(int paramInt)
  {
    return String.format(Locale.getDefault(), "%d", new Object[] { Integer.valueOf(paramInt) });
  }

  private boolean f()
  {
    if (this.j == null);
    for (String str = e(this.m); (!TextUtils.isEmpty(str)) && (!str.equals(this.a.getText().toString())); str = this.j[(this.m - this.k)])
    {
      this.a.setText(str);
      return true;
    }
    return false;
  }

  private void g()
  {
    if (this.B != null)
      removeCallbacks(this.B);
  }

  private void h()
  {
    if (this.B != null)
      removeCallbacks(this.B);
    this.T.a();
  }

  private boolean i()
  {
    int i3 = 0;
    int i2 = this.w - this.x;
    if (i2 != 0)
    {
      this.A = 0;
      i1 = i2;
      if (Math.abs(i2) > this.v / 2)
        if (i2 <= 0)
          break label72;
    }
    label72: for (int i1 = -this.v; ; i1 = this.v)
    {
      i1 = i2 + i1;
      this.z.a(0, 0, 0, i1, 800);
      invalidate();
      i3 = 1;
      return i3;
    }
  }

  public void computeScroll()
  {
    ay localay2 = this.y;
    ay localay1 = localay2;
    if (localay2.a())
    {
      localay2 = this.z;
      localay1 = localay2;
      if (localay2.a())
        return;
    }
    localay1.f();
    int i1 = localay1.b();
    if (this.A == 0)
      this.A = localay1.d();
    scrollBy(0, i1 - this.A);
    this.A = i1;
    if (localay1.a())
    {
      b(localay1);
      return;
    }
    invalidate();
  }

  protected int computeVerticalScrollExtent()
  {
    return getHeight();
  }

  protected int computeVerticalScrollOffset()
  {
    return this.x;
  }

  protected int computeVerticalScrollRange()
  {
    return (this.l - this.k + 1) * this.v;
  }

  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    boolean bool = true;
    int i1 = paramKeyEvent.getKeyCode();
    switch (i1)
    {
    default:
    case 23:
    case 66:
    case 19:
    case 20:
    }
    label119: 
    do
    {
      bool = super.dispatchKeyEvent(paramKeyEvent);
      do
      {
        return bool;
        h();
        break;
        switch (paramKeyEvent.getAction())
        {
        default:
          break;
        case 0:
          if ((!this.J) && (i1 != 20))
            break label158;
          if (getValue() >= getMaxValue())
            break;
          requestFocus();
          this.U = i1;
          h();
        case 1:
        }
      }
      while (!this.y.a());
      if (i1 == 20);
      for (bool = true; ; bool = false)
      {
        a(bool);
        return true;
        if (getValue() <= getMinValue())
          break;
        break label119;
      }
    }
    while (this.U != i1);
    label158: this.U = -1;
    return true;
  }

  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    switch (paramMotionEvent.getActionMasked())
    {
    case 2:
    default:
    case 1:
    case 3:
    }
    while (true)
    {
      return super.dispatchTouchEvent(paramMotionEvent);
      h();
    }
  }

  public boolean dispatchTrackballEvent(MotionEvent paramMotionEvent)
  {
    switch (paramMotionEvent.getActionMasked())
    {
    case 2:
    default:
    case 1:
    case 3:
    }
    while (true)
    {
      return super.dispatchTrackballEvent(paramMotionEvent);
      h();
    }
  }

  protected float getBottomFadingEdgeStrength()
  {
    return 0.9F;
  }

  public String[] getDisplayedValues()
  {
    return this.j;
  }

  public int getMaxValue()
  {
    return this.l;
  }

  public int getMinValue()
  {
    return this.k;
  }

  public int getSolidColor()
  {
    return this.K;
  }

  protected float getTopFadingEdgeStrength()
  {
    return 0.9F;
  }

  public int getValue()
  {
    return this.m;
  }

  public boolean getWrapSelectorWheel()
  {
    return this.J;
  }

  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    h();
  }

  protected void onDraw(Canvas paramCanvas)
  {
    float f2 = (getRight() - getLeft()) / 2;
    float f1 = this.x;
    if ((this.u != null) && (this.N == 0))
    {
      if (this.S)
      {
        this.u.setState(PRESSED_STATE_SET);
        this.u.setBounds(0, 0, getRight(), this.P);
        this.u.draw(paramCanvas);
      }
      if (this.R)
      {
        this.u.setState(PRESSED_STATE_SET);
        this.u.setBounds(0, this.Q, getRight(), getBottom());
        this.u.draw(paramCanvas);
      }
    }
    int[] arrayOfInt = this.s;
    int i1 = 0;
    int i2;
    while (i1 < arrayOfInt.length)
    {
      i2 = arrayOfInt[i1];
      String str = (String)this.r.get(i2);
      if ((i1 != 1) || (this.a.getVisibility() != 0))
        paramCanvas.drawText(str, f2, f1, this.t);
      f1 += this.v;
      i1 += 1;
    }
    if (this.L != null)
    {
      i1 = this.P;
      i2 = this.M;
      this.L.setBounds(0, i1, getRight(), i2 + i1);
      this.L.draw(paramCanvas);
      i1 = this.Q;
      i2 = this.M;
      this.L.setBounds(0, i1 - i2, getRight(), i1);
      this.L.draw(paramCanvas);
    }
  }

  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    if (!isEnabled())
      return false;
    switch (paramMotionEvent.getActionMasked())
    {
    default:
      return false;
    case 0:
    }
    h();
    this.a.setVisibility(4);
    float f1 = paramMotionEvent.getY();
    this.C = f1;
    this.E = f1;
    this.D = paramMotionEvent.getEventTime();
    this.O = false;
    if (this.C < this.P)
    {
      if (this.N == 0)
        this.T.a(2);
      getParent().requestDisallowInterceptTouchEvent(true);
      if (this.y.a())
        break label176;
      this.y.a(true);
      this.z.a(true);
      a(0);
    }
    while (true)
    {
      return true;
      if ((this.C <= this.Q) || (this.N != 0))
        break;
      this.T.a(1);
      break;
      label176: if (!this.z.a())
      {
        this.y.a(true);
        this.z.a(true);
        continue;
      }
      if (this.C < this.P)
      {
        a(false, ViewConfiguration.getLongPressTimeout());
        continue;
      }
      if (this.C <= this.Q)
        continue;
      a(true, ViewConfiguration.getLongPressTimeout());
    }
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramInt4 = getMeasuredWidth();
    paramInt3 = getMeasuredHeight();
    paramInt1 = this.a.getMeasuredWidth();
    paramInt2 = this.a.getMeasuredHeight();
    paramInt4 = (paramInt4 - paramInt1) / 2;
    paramInt3 = (paramInt3 - paramInt2) / 2;
    this.a.layout(paramInt4, paramInt3, paramInt1 + paramInt4, paramInt2 + paramInt3);
    if (paramBoolean)
    {
      d();
      e();
      this.P = ((getHeight() - this.b) / 2 - this.M);
      this.Q = (this.P + this.M * 2 + this.b);
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(a(paramInt1, this.f), a(paramInt2, this.d));
    setMeasuredDimension(b(this.e, getMeasuredWidth(), paramInt1), b(this.c, getMeasuredHeight(), paramInt2));
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (!isEnabled())
      return false;
    if (this.F == null)
      this.F = VelocityTracker.obtain();
    this.F.addMovement(paramMotionEvent);
    switch (paramMotionEvent.getActionMasked())
    {
    default:
    case 2:
    case 1:
    }
    while (true)
    {
      return true;
      if (this.O)
        continue;
      float f1 = paramMotionEvent.getY();
      if (this.N != 1)
        if ((int)Math.abs(f1 - this.C) > this.G)
        {
          h();
          a(1);
        }
      while (true)
      {
        this.E = f1;
        break;
        scrollBy(0, (int)(f1 - this.E));
        invalidate();
      }
      g();
      this.T.a();
      VelocityTracker localVelocityTracker = this.F;
      localVelocityTracker.computeCurrentVelocity(1000, this.I);
      i1 = (int)localVelocityTracker.getYVelocity();
      if (Math.abs(i1) <= this.H)
        break;
      b(i1);
      a(2);
      this.F.recycle();
      this.F = null;
    }
    int i1 = (int)paramMotionEvent.getY();
    int i2 = (int)Math.abs(i1 - this.C);
    long l1 = paramMotionEvent.getEventTime();
    long l2 = this.D;
    if ((i2 <= this.G) && (l1 - l2 < ViewConfiguration.getTapTimeout()))
    {
      i1 = i1 / this.v - 1;
      if (i1 > 0)
      {
        a(true);
        this.T.b(1);
      }
    }
    while (true)
    {
      a(0);
      break;
      if (i1 >= 0)
        continue;
      a(false);
      this.T.b(2);
      continue;
      i();
    }
  }

  public void scrollBy(int paramInt1, int paramInt2)
  {
    int[] arrayOfInt = this.s;
    if ((!this.J) && (paramInt2 > 0) && (arrayOfInt[1] <= this.k))
      this.x = this.w;
    while (true)
    {
      return;
      if ((!this.J) && (paramInt2 < 0) && (arrayOfInt[1] >= this.l))
      {
        this.x = this.w;
        return;
      }
      this.x += paramInt2;
      while (this.x - this.w > this.i)
      {
        this.x -= this.v;
        b(arrayOfInt);
        a(arrayOfInt[1], true);
        if ((this.J) || (arrayOfInt[1] > this.k))
          continue;
        this.x = this.w;
      }
      while (this.x - this.w < -this.i)
      {
        this.x += this.v;
        a(arrayOfInt);
        a(arrayOfInt[1], true);
        if ((this.J) || (arrayOfInt[1] < this.l))
          continue;
        this.x = this.w;
      }
    }
  }

  public void setDisplayedValues(String[] paramArrayOfString)
  {
    if (this.j == paramArrayOfString)
      return;
    this.j = paramArrayOfString;
    f();
    c();
    b();
  }

  public void setEnabled(boolean paramBoolean)
  {
    super.setEnabled(paramBoolean);
    this.a.setEnabled(paramBoolean);
  }

  public void setFormatter(b paramb)
  {
    if (paramb == this.p)
      return;
    this.p = paramb;
    c();
    f();
  }

  public void setMaxValue(int paramInt)
  {
    if (this.l == paramInt)
      return;
    if (paramInt < 0)
      throw new IllegalArgumentException("maxValue must be >= 0");
    this.l = paramInt;
    if (this.l < this.m)
      this.m = this.l;
    if (this.l - this.k > this.s.length);
    for (boolean bool = true; ; bool = false)
    {
      setWrapSelectorWheel(bool);
      c();
      f();
      b();
      invalidate();
      return;
    }
  }

  public void setMinValue(int paramInt)
  {
    if (this.k == paramInt)
      return;
    if (paramInt < 0)
      throw new IllegalArgumentException("minValue must be >= 0");
    this.k = paramInt;
    if (this.k > this.m)
      this.m = this.k;
    if (this.l - this.k > this.s.length);
    for (boolean bool = true; ; bool = false)
    {
      setWrapSelectorWheel(bool);
      c();
      f();
      b();
      invalidate();
      return;
    }
  }

  public void setOnLongPressUpdateInterval(long paramLong)
  {
    this.q = paramLong;
  }

  public void setOnScrollListener(c paramc)
  {
    this.o = paramc;
  }

  public void setOnValueChangedListener(d paramd)
  {
    this.n = paramd;
  }

  public void setValue(int paramInt)
  {
    a(paramInt, false);
  }

  public void setWrapSelectorWheel(boolean paramBoolean)
  {
    if (this.l - this.k >= this.s.length);
    for (int i1 = 1; ; i1 = 0)
    {
      if (((!paramBoolean) || (i1 != 0)) && (paramBoolean != this.J))
        this.J = paramBoolean;
      return;
    }
  }

  class a
    implements Runnable
  {
    private boolean b;

    a()
    {
    }

    private void a(boolean paramBoolean)
    {
      this.b = paramBoolean;
    }

    public void run()
    {
      ab.c(ab.this, this.b);
      ab.this.postDelayed(this, ab.e(ab.this));
    }
  }

  public static abstract interface b
  {
    public abstract String a(int paramInt);
  }

  public static abstract interface c
  {
    public abstract void a(ab paramab, int paramInt);
  }

  public static abstract interface d
  {
    public abstract void a(ab paramab, int paramInt1, int paramInt2);
  }

  class e
    implements Runnable
  {
    private final int b = 1;
    private final int c = 2;
    private int d;
    private int e;

    e()
    {
    }

    public void a()
    {
      this.e = 0;
      this.d = 0;
      ab.this.removeCallbacks(this);
      if (ab.a(ab.this))
      {
        ab.a(ab.this, false);
        ab.this.invalidate(0, ab.b(ab.this), ab.this.getRight(), ab.this.getBottom());
      }
      ab.b(ab.this, false);
      if (ab.c(ab.this))
        ab.this.invalidate(0, 0, ab.this.getRight(), ab.d(ab.this));
    }

    public void a(int paramInt)
    {
      a();
      this.e = 1;
      this.d = paramInt;
      ab.this.postDelayed(this, ViewConfiguration.getTapTimeout());
    }

    public void b(int paramInt)
    {
      a();
      this.e = 2;
      this.d = paramInt;
      ab.this.post(this);
    }

    public void run()
    {
      switch (this.e)
      {
      default:
        return;
      case 1:
        switch (this.d)
        {
        default:
          return;
        case 1:
          ab.a(ab.this, true);
          ab.this.invalidate(0, ab.b(ab.this), ab.this.getRight(), ab.this.getBottom());
          return;
        case 2:
        }
        ab.b(ab.this, true);
        ab.this.invalidate(0, 0, ab.this.getRight(), ab.d(ab.this));
        return;
      case 2:
      }
      switch (this.d)
      {
      default:
        return;
      case 1:
        if (!ab.a(ab.this))
          ab.this.postDelayed(this, ViewConfiguration.getPressedStateDuration());
        ab.a(ab.this, ab.a(ab.this) ^ true);
        ab.this.invalidate(0, ab.b(ab.this), ab.this.getRight(), ab.this.getBottom());
        return;
      case 2:
      }
      if (!ab.c(ab.this))
        ab.this.postDelayed(this, ViewConfiguration.getPressedStateDuration());
      ab.b(ab.this, ab.c(ab.this) ^ true);
      ab.this.invalidate(0, 0, ab.this.getRight(), ab.d(ab.this));
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.Components.ab
 * JD-Core Version:    0.6.0
 */