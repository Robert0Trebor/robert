package org.vidogram.messenger.support.widget.a;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.support.v4.a.d;
import android.support.v4.a.g;
import android.support.v4.view.ad;
import android.support.v4.view.af;
import android.support.v4.view.e;
import android.support.v4.view.t;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;
import org.vidogram.messenger.support.widget.RecyclerView;
import org.vidogram.messenger.support.widget.RecyclerView.d;
import org.vidogram.messenger.support.widget.RecyclerView.e;
import org.vidogram.messenger.support.widget.RecyclerView.g;
import org.vidogram.messenger.support.widget.RecyclerView.h;
import org.vidogram.messenger.support.widget.RecyclerView.j;
import org.vidogram.messenger.support.widget.RecyclerView.k;
import org.vidogram.messenger.support.widget.RecyclerView.r;
import org.vidogram.messenger.support.widget.RecyclerView.u;

public class a extends RecyclerView.g
  implements RecyclerView.j
{
  private final RecyclerView.k A = new RecyclerView.k()
  {
    public void a(boolean paramBoolean)
    {
      if (!paramBoolean)
        return;
      a.a(a.this, null, 0);
    }

    public boolean a(RecyclerView paramRecyclerView, MotionEvent paramMotionEvent)
    {
      a.d(a.this).a(paramMotionEvent);
      int i = t.a(paramMotionEvent);
      if (i == 0)
      {
        a.this.k = t.b(paramMotionEvent, 0);
        a.this.c = paramMotionEvent.getX();
        a.this.d = paramMotionEvent.getY();
        a.e(a.this);
        if (a.this.b == null)
        {
          paramRecyclerView = a.a(a.this, paramMotionEvent);
          if (paramRecyclerView != null)
          {
            a locala = a.this;
            locala.c -= paramRecyclerView.k;
            locala = a.this;
            locala.d -= paramRecyclerView.l;
            a.a(a.this, paramRecyclerView.h, true);
            if (a.this.a.remove(paramRecyclerView.h.a))
              a.this.l.c(a.c(a.this), paramRecyclerView.h);
            a.a(a.this, paramRecyclerView.h, paramRecyclerView.i);
            a.a(a.this, paramMotionEvent, a.this.n, 0);
          }
        }
      }
      while (true)
      {
        if (a.f(a.this) != null)
          a.f(a.this).addMovement(paramMotionEvent);
        if (a.this.b == null)
          break;
        return true;
        if ((i == 3) || (i == 1))
        {
          a.this.k = -1;
          a.a(a.this, null, 0);
          continue;
        }
        if (a.this.k == -1)
          continue;
        int j = t.a(paramMotionEvent, a.this.k);
        if (j < 0)
          continue;
        a.a(a.this, i, paramMotionEvent, j);
      }
      return false;
    }

    public void b(RecyclerView paramRecyclerView, MotionEvent paramMotionEvent)
    {
      int i = 0;
      a.d(a.this).a(paramMotionEvent);
      if (a.f(a.this) != null)
        a.f(a.this).addMovement(paramMotionEvent);
      if (a.this.k == -1);
      int j;
      do
      {
        int k;
        do
        {
          return;
          j = t.a(paramMotionEvent);
          k = t.a(paramMotionEvent, a.this.k);
          if (k >= 0)
            a.a(a.this, j, paramMotionEvent, k);
          paramRecyclerView = a.this.b;
        }
        while (paramRecyclerView == null);
        switch (j)
        {
        case 4:
        case 5:
        default:
          return;
        case 1:
        case 2:
        case 3:
          while (true)
          {
            a.a(a.this, null, 0);
            a.this.k = -1;
            return;
            if (k < 0)
              break;
            a.a(a.this, paramMotionEvent, a.this.n, k);
            a.a(a.this, paramRecyclerView);
            a.c(a.this).removeCallbacks(a.b(a.this));
            a.b(a.this).run();
            a.c(a.this).invalidate();
            return;
            if (a.f(a.this) == null)
              continue;
            a.f(a.this).clear();
          }
        case 6:
        }
        j = t.b(paramMotionEvent);
      }
      while (t.b(paramMotionEvent, j) != a.this.k);
      if (j == 0)
        i = 1;
      a.this.k = t.b(paramMotionEvent, i);
      a.a(a.this, paramMotionEvent, a.this.n, j);
    }
  };
  private Rect B;
  private long C;
  final List<View> a = new ArrayList();
  RecyclerView.u b = null;
  float c;
  float d;
  float e;
  float f;
  float g;
  float h;
  float i;
  float j;
  int k = -1;
  a l;
  int m = 0;
  int n;
  List<c> o = new ArrayList();
  private final float[] p = new float[2];
  private int q;
  private RecyclerView r;
  private final Runnable s = new Runnable()
  {
    public void run()
    {
      if ((a.this.b != null) && (a.a(a.this)))
      {
        if (a.this.b != null)
          a.a(a.this, a.this.b);
        a.c(a.this).removeCallbacks(a.b(a.this));
        af.a(a.c(a.this), this);
      }
    }
  };
  private VelocityTracker t;
  private List<RecyclerView.u> u;
  private List<Integer> v;
  private RecyclerView.d w = null;
  private View x = null;
  private int y = -1;
  private e z;

  public a(a parama)
  {
    this.l = parama;
  }

  private int a(RecyclerView.u paramu, boolean paramBoolean)
  {
    int i1 = this.o.size() - 1;
    while (i1 >= 0)
    {
      c localc = (c)this.o.get(i1);
      if (localc.h == paramu)
      {
        localc.m |= paramBoolean;
        if (!c.a(localc))
          localc.b();
        this.o.remove(i1);
        return c.b(localc);
      }
      i1 -= 1;
    }
    return 0;
  }

  private List<RecyclerView.u> a(RecyclerView.u paramu)
  {
    int i1;
    int i4;
    int i5;
    int i6;
    int i7;
    int i8;
    int i9;
    label137: View localView;
    if (this.u == null)
    {
      this.u = new ArrayList();
      this.v = new ArrayList();
      i1 = this.l.c();
      i4 = Math.round(this.i + this.g) - i1;
      i5 = Math.round(this.j + this.h) - i1;
      i6 = paramu.a.getWidth() + i4 + i1 * 2;
      i7 = paramu.a.getHeight() + i5 + i1 * 2;
      i8 = (i4 + i6) / 2;
      i9 = (i5 + i7) / 2;
      RecyclerView.h localh = this.r.getLayoutManager();
      int i10 = localh.t();
      i1 = 0;
      if (i1 >= i10)
        break label403;
      localView = localh.h(i1);
      if (localView != paramu.a)
        break label188;
    }
    while (true)
    {
      i1 += 1;
      break label137;
      this.u.clear();
      this.v.clear();
      break;
      label188: if ((localView.getBottom() < i5) || (localView.getTop() > i7) || (localView.getRight() < i4) || (localView.getLeft() > i6))
        continue;
      RecyclerView.u localu = this.r.a(localView);
      if (!this.l.a(this.r, this.b, localu))
        continue;
      int i2 = Math.abs(i8 - (localView.getLeft() + localView.getRight()) / 2);
      int i3 = localView.getTop();
      i3 = Math.abs(i9 - (localView.getBottom() + i3) / 2);
      int i11 = i2 * i2 + i3 * i3;
      int i12 = this.u.size();
      i3 = 0;
      i2 = 0;
      while ((i2 < i12) && (i11 > ((Integer)this.v.get(i2)).intValue()))
      {
        i3 += 1;
        i2 += 1;
      }
      this.u.add(i3, localu);
      this.v.add(i3, Integer.valueOf(i11));
    }
    label403: return this.u;
  }

  private RecyclerView.u a(MotionEvent paramMotionEvent)
  {
    RecyclerView.h localh = this.r.getLayoutManager();
    if (this.k == -1);
    do
    {
      float f3;
      float f1;
      do
      {
        return null;
        int i1 = t.a(paramMotionEvent, this.k);
        f3 = t.c(paramMotionEvent, i1);
        float f4 = this.c;
        f1 = t.d(paramMotionEvent, i1);
        float f2 = this.d;
        f3 = Math.abs(f3 - f4);
        f1 = Math.abs(f1 - f2);
      }
      while (((f3 < this.q) && (f1 < this.q)) || ((f3 > f1) && (localh.e())) || ((f1 > f3) && (localh.f())));
      paramMotionEvent = b(paramMotionEvent);
    }
    while (paramMotionEvent == null);
    return this.r.a(paramMotionEvent);
  }

  private void a()
  {
    this.q = ViewConfiguration.get(this.r.getContext()).getScaledTouchSlop();
    this.r.a(this);
    this.r.a(this.A);
    this.r.a(this);
    c();
  }

  private void a(MotionEvent paramMotionEvent, int paramInt1, int paramInt2)
  {
    float f1 = t.c(paramMotionEvent, paramInt2);
    float f2 = t.d(paramMotionEvent, paramInt2);
    this.g = (f1 - this.c);
    this.h = (f2 - this.d);
    if ((paramInt1 & 0x4) == 0)
      this.g = Math.max(0.0F, this.g);
    if ((paramInt1 & 0x8) == 0)
      this.g = Math.min(0.0F, this.g);
    if ((paramInt1 & 0x1) == 0)
      this.h = Math.max(0.0F, this.h);
    if ((paramInt1 & 0x2) == 0)
      this.h = Math.min(0.0F, this.h);
  }

  private void a(RecyclerView.u paramu, int paramInt)
  {
    if ((paramu == this.b) && (paramInt == this.m))
      return;
    this.C = -9223372036854775808L;
    int i3 = this.m;
    a(paramu, true);
    this.m = paramInt;
    if (paramInt == 2)
    {
      this.x = paramu.a;
      h();
    }
    int i1 = 0;
    int i2 = 0;
    Object localObject;
    float f1;
    float f2;
    if (this.b != null)
    {
      localObject = this.b;
      if (((RecyclerView.u)localObject).a.getParent() == null)
        break label510;
      if (i3 == 2)
      {
        i2 = 0;
        g();
      }
    }
    else
    {
      label277: switch (i2)
      {
      default:
        f1 = 0.0F;
        f2 = 0.0F;
        label169: if (i3 == 2)
        {
          i1 = 8;
          label179: a(this.p);
          float f3 = this.p[0];
          float f4 = this.p[1];
          localObject = new c((RecyclerView.u)localObject, i1, i3, f3, f4, f1, f2, i2, (RecyclerView.u)localObject)
          {
            public void b(g paramg)
            {
              super.b(paramg);
              if (this.m);
              while (true)
              {
                return;
                if (this.a <= 0)
                  a.this.l.c(a.c(a.this), this.b);
                while (a.g(a.this) == this.b.a)
                {
                  a.a(a.this, this.b.a);
                  return;
                  a.this.a.add(this.b.a);
                  this.j = true;
                  if (this.a <= 0)
                    continue;
                  a.a(a.this, this, this.a);
                }
              }
            }
          };
          ((c)localObject).a(this.l.a(this.r, i1, f1 - f3, f2 - f4));
          this.o.add(localObject);
          ((c)localObject).a();
          i1 = 1;
          this.b = null;
          if (paramu != null)
          {
            this.n = ((this.l.b(this.r, paramu) & (1 << paramInt * 8 + 8) - 1) >> this.m * 8);
            this.i = paramu.a.getLeft();
            this.j = paramu.a.getTop();
            this.b = paramu;
            if (paramInt == 2)
              this.b.a.performHapticFeedback(0);
          }
          paramu = this.r.getParent();
          if (paramu == null)
            break;
          if (this.b == null)
            break label539;
        }
      case 4:
      case 8:
      case 16:
      case 32:
      case 1:
      case 2:
      }
    }
    label539: for (boolean bool = true; ; bool = false)
    {
      paramu.requestDisallowInterceptTouchEvent(bool);
      if (i1 == 0)
        this.r.getLayoutManager().H();
      this.l.b(this.b, this.m);
      this.r.invalidate();
      return;
      i2 = c((RecyclerView.u)localObject);
      break;
      f2 = 0.0F;
      f1 = Math.signum(this.g) * this.r.getWidth();
      break label169;
      f1 = 0.0F;
      f2 = Math.signum(this.h) * this.r.getHeight();
      break label169;
      if (i2 > 0)
      {
        i1 = 2;
        break label179;
      }
      i1 = 4;
      break label179;
      label510: c(((RecyclerView.u)localObject).a);
      this.l.c(this.r, (RecyclerView.u)localObject);
      i1 = i2;
      break label277;
    }
  }

  private void a(c paramc, int paramInt)
  {
    this.r.post(new Runnable(paramc, paramInt)
    {
      public void run()
      {
        if ((a.c(a.this) != null) && (a.c(a.this).isAttachedToWindow()) && (!this.a.m) && (this.a.h.e() != -1))
        {
          RecyclerView.e locale = a.c(a.this).getItemAnimator();
          if (((locale == null) || (!locale.a(null))) && (!a.h(a.this)))
            a.this.l.a(this.a.h, this.b);
        }
        else
        {
          return;
        }
        a.c(a.this).post(this);
      }
    });
  }

  private void a(float[] paramArrayOfFloat)
  {
    if ((this.n & 0xC) != 0)
      paramArrayOfFloat[0] = (this.i + this.g - this.b.a.getLeft());
    while ((this.n & 0x3) != 0)
    {
      paramArrayOfFloat[1] = (this.j + this.h - this.b.a.getTop());
      return;
      paramArrayOfFloat[0] = af.k(this.b.a);
    }
    paramArrayOfFloat[1] = af.l(this.b.a);
  }

  private boolean a(int paramInt1, MotionEvent paramMotionEvent, int paramInt2)
  {
    if ((this.b != null) || (paramInt1 != 2) || (this.m == 2) || (!this.l.b()));
    RecyclerView.u localu;
    float f1;
    float f2;
    do
    {
      float f3;
      float f4;
      do
      {
        do
        {
          do
          {
            do
              return false;
            while (this.r.getScrollState() == 1);
            localu = a(paramMotionEvent);
          }
          while (localu == null);
          paramInt1 = (this.l.b(this.r, localu) & 0xFF00) >> 8;
        }
        while (paramInt1 == 0);
        f1 = t.c(paramMotionEvent, paramInt2);
        f2 = t.d(paramMotionEvent, paramInt2);
        f1 -= this.c;
        f2 -= this.d;
        f3 = Math.abs(f1);
        f4 = Math.abs(f2);
      }
      while ((f3 < this.q) && (f4 < this.q));
      if (f3 <= f4)
        break;
    }
    while (((f1 < 0.0F) && ((paramInt1 & 0x4) == 0)) || ((f1 > 0.0F) && ((paramInt1 & 0x8) == 0)));
    do
    {
      this.h = 0.0F;
      this.g = 0.0F;
      this.k = t.b(paramMotionEvent, 0);
      a(localu, 1);
      return true;
      if ((f2 < 0.0F) && ((paramInt1 & 0x1) == 0))
        break;
    }
    while ((f2 <= 0.0F) || ((paramInt1 & 0x2) != 0));
    return false;
  }

  private static boolean a(View paramView, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    return (paramFloat1 >= paramFloat3) && (paramFloat1 <= paramView.getWidth() + paramFloat3) && (paramFloat2 >= paramFloat4) && (paramFloat2 <= paramView.getHeight() + paramFloat4);
  }

  private int b(RecyclerView.u paramu, int paramInt)
  {
    int i2 = 8;
    if ((paramInt & 0xC) != 0)
    {
      int i1;
      if (this.g > 0.0F)
      {
        i1 = 8;
        if ((this.t == null) || (this.k <= -1))
          break label155;
        this.t.computeCurrentVelocity(1000, this.l.b(this.f));
        f2 = ad.a(this.t, this.k);
        f1 = ad.b(this.t, this.k);
        if (f2 <= 0.0F)
          break label149;
      }
      while (true)
      {
        f2 = Math.abs(f2);
        if (((i2 & paramInt) == 0) || (i1 != i2) || (f2 < this.l.a(this.e)) || (f2 <= Math.abs(f1)))
          break label155;
        return i2;
        i1 = 4;
        break;
        label149: i2 = 4;
      }
      label155: float f1 = this.r.getWidth();
      float f2 = this.l.a(paramu);
      if (((paramInt & i1) != 0) && (Math.abs(this.g) > f1 * f2))
        return i1;
    }
    return 0;
  }

  private View b(MotionEvent paramMotionEvent)
  {
    float f1 = paramMotionEvent.getX();
    float f2 = paramMotionEvent.getY();
    if (this.b != null)
    {
      paramMotionEvent = this.b.a;
      if (a(paramMotionEvent, f1, f2, this.i + this.g, this.j + this.h))
        return paramMotionEvent;
    }
    int i1 = this.o.size() - 1;
    while (i1 >= 0)
    {
      paramMotionEvent = (c)this.o.get(i1);
      View localView = paramMotionEvent.h.a;
      if (a(localView, f1, f2, paramMotionEvent.k, paramMotionEvent.l))
        return localView;
      i1 -= 1;
    }
    return this.r.a(f1, f2);
  }

  private void b()
  {
    this.r.b(this);
    this.r.b(this.A);
    this.r.b(this);
    int i1 = this.o.size() - 1;
    while (i1 >= 0)
    {
      c localc = (c)this.o.get(0);
      this.l.c(this.r, localc.h);
      i1 -= 1;
    }
    this.o.clear();
    this.x = null;
    this.y = -1;
    g();
  }

  private void b(RecyclerView.u paramu)
  {
    if (this.r.isLayoutRequested());
    label10: int i1;
    int i2;
    Object localObject;
    int i3;
    int i4;
    do
    {
      do
      {
        float f1;
        do
        {
          break label10;
          do
            return;
          while (this.m != 2);
          f1 = this.l.b(paramu);
          i1 = (int)(this.i + this.g);
          i2 = (int)(this.j + this.h);
        }
        while ((Math.abs(i2 - paramu.a.getTop()) < paramu.a.getHeight() * f1) && (Math.abs(i1 - paramu.a.getLeft()) < f1 * paramu.a.getWidth()));
        localObject = a(paramu);
      }
      while (((List)localObject).size() == 0);
      localObject = this.l.a(paramu, (List)localObject, i1, i2);
      if (localObject == null)
      {
        this.u.clear();
        this.v.clear();
        return;
      }
      i3 = ((RecyclerView.u)localObject).e();
      i4 = paramu.e();
    }
    while (!this.l.b(this.r, paramu, (RecyclerView.u)localObject));
    this.l.a(this.r, paramu, i4, (RecyclerView.u)localObject, i3, i1, i2);
  }

  private int c(RecyclerView.u paramu)
  {
    if (this.m == 2);
    int i2;
    int i1;
    do
    {
      while (true)
      {
        return 0;
        i2 = this.l.a(this.r, paramu);
        i1 = (this.l.d(i2, af.h(this.r)) & 0xFF00) >> 8;
        if (i1 == 0)
          continue;
        i2 = (i2 & 0xFF00) >> 8;
        if (Math.abs(this.g) <= Math.abs(this.h))
          break;
        i3 = b(paramu, i1);
        if (i3 > 0)
        {
          if ((i2 & i3) == 0)
            return a.a(i3, af.h(this.r));
          return i3;
        }
        i1 = c(paramu, i1);
        if (i1 > 0)
          return i1;
      }
      int i3 = c(paramu, i1);
      if (i3 > 0)
        return i3;
      i1 = b(paramu, i1);
    }
    while (i1 <= 0);
    if ((i2 & i1) == 0)
      return a.a(i1, af.h(this.r));
    return i1;
  }

  private int c(RecyclerView.u paramu, int paramInt)
  {
    int i2 = 2;
    if ((paramInt & 0x3) != 0)
    {
      int i1;
      if (this.h > 0.0F)
      {
        i1 = 2;
        if ((this.t == null) || (this.k <= -1))
          break label152;
        this.t.computeCurrentVelocity(1000, this.l.b(this.f));
        f1 = ad.a(this.t, this.k);
        f2 = ad.b(this.t, this.k);
        if (f2 <= 0.0F)
          break label146;
      }
      while (true)
      {
        f2 = Math.abs(f2);
        if (((i2 & paramInt) == 0) || (i2 != i1) || (f2 < this.l.a(this.e)) || (f2 <= Math.abs(f1)))
          break label152;
        return i2;
        i1 = 1;
        break;
        label146: i2 = 1;
      }
      label152: float f1 = this.r.getHeight();
      float f2 = this.l.a(paramu);
      if (((paramInt & i1) != 0) && (Math.abs(this.h) > f1 * f2))
        return i1;
    }
    return 0;
  }

  private c c(MotionEvent paramMotionEvent)
  {
    if (this.o.isEmpty())
    {
      paramMotionEvent = null;
      return paramMotionEvent;
    }
    View localView = b(paramMotionEvent);
    int i1 = this.o.size() - 1;
    while (true)
    {
      if (i1 < 0)
        break label74;
      c localc = (c)this.o.get(i1);
      paramMotionEvent = localc;
      if (localc.h.a == localView)
        break;
      i1 -= 1;
    }
    label74: return null;
  }

  private void c()
  {
    if (this.z != null)
      return;
    this.z = new e(this.r.getContext(), new b(null));
  }

  private void c(View paramView)
  {
    if (paramView == this.x)
    {
      this.x = null;
      if (this.w != null)
        this.r.setChildDrawingOrderCallback(null);
    }
  }

  private boolean d()
  {
    int i2 = this.o.size();
    int i1 = 0;
    while (i1 < i2)
    {
      if (!c.a((c)this.o.get(i1)))
        return true;
      i1 += 1;
    }
    return false;
  }

  private boolean e()
  {
    if (this.b == null)
    {
      this.C = -9223372036854775808L;
      return false;
    }
    long l2 = System.currentTimeMillis();
    long l1;
    int i2;
    int i1;
    label128: int i3;
    if (this.C == -9223372036854775808L)
    {
      l1 = 0L;
      RecyclerView.h localh = this.r.getLayoutManager();
      if (this.B == null)
        this.B = new Rect();
      localh.a(this.b.a, this.B);
      if (!localh.e())
        break label350;
      i2 = (int)(this.i + this.g);
      i1 = i2 - this.B.left - this.r.getPaddingLeft();
      if ((this.g >= 0.0F) || (i1 >= 0))
        break label298;
      if (!localh.f())
        break label407;
      i3 = (int)(this.j + this.h);
      i2 = i3 - this.B.top - this.r.getPaddingTop();
      if ((this.h >= 0.0F) || (i2 >= 0))
        break label355;
      label178: if (i1 == 0)
        break label424;
      i1 = this.l.a(this.r, this.b.a.getWidth(), i1, this.r.getWidth(), l1);
    }
    label407: label424: 
    while (true)
    {
      if (i2 != 0)
        i2 = this.l.a(this.r, this.b.a.getHeight(), i2, this.r.getHeight(), l1);
      while (true)
      {
        if ((i1 != 0) || (i2 != 0))
        {
          if (this.C == -9223372036854775808L)
            this.C = l2;
          this.r.scrollBy(i1, i2);
          return true;
          l1 = l2 - this.C;
          break;
          label298: if (this.g > 0.0F)
          {
            i2 = i2 + this.b.a.getWidth() + this.B.right - (this.r.getWidth() - this.r.getPaddingRight());
            i1 = i2;
            if (i2 > 0)
              break label128;
          }
          label350: i1 = 0;
          break label128;
          label355: if (this.h > 0.0F)
          {
            i3 = i3 + this.b.a.getHeight() + this.B.bottom - (this.r.getHeight() - this.r.getPaddingBottom());
            i2 = i3;
            if (i3 > 0)
              break label178;
          }
          i2 = 0;
          break label178;
        }
        this.C = -9223372036854775808L;
        return false;
      }
    }
  }

  private void f()
  {
    if (this.t != null)
      this.t.recycle();
    this.t = VelocityTracker.obtain();
  }

  private void g()
  {
    if (this.t != null)
    {
      this.t.recycle();
      this.t = null;
    }
  }

  private void h()
  {
    if (Build.VERSION.SDK_INT >= 21)
      return;
    if (this.w == null)
      this.w = new RecyclerView.d()
      {
        public int a(int paramInt1, int paramInt2)
        {
          if (a.g(a.this) == null);
          int i;
          do
          {
            return paramInt2;
            int j = a.i(a.this);
            i = j;
            if (j == -1)
            {
              i = a.c(a.this).indexOfChild(a.g(a.this));
              a.a(a.this, i);
            }
            if (paramInt2 == paramInt1 - 1)
              return i;
          }
          while (paramInt2 < i);
          return paramInt2 + 1;
        }
      };
    this.r.setChildDrawingOrderCallback(this.w);
  }

  public void a(Canvas paramCanvas, RecyclerView paramRecyclerView, RecyclerView.r paramr)
  {
    float f2 = 0.0F;
    this.y = -1;
    float f1;
    if (this.b != null)
    {
      a(this.p);
      f1 = this.p[0];
      f2 = this.p[1];
    }
    while (true)
    {
      a.b(this.l, paramCanvas, paramRecyclerView, this.b, this.o, this.m, f1, f2);
      return;
      f1 = 0.0F;
    }
  }

  public void a(Rect paramRect, View paramView, RecyclerView paramRecyclerView, RecyclerView.r paramr)
  {
    paramRect.setEmpty();
  }

  public void a(View paramView)
  {
  }

  public void a(RecyclerView paramRecyclerView)
  {
    if (this.r == paramRecyclerView);
    do
    {
      return;
      if (this.r != null)
        b();
      this.r = paramRecyclerView;
    }
    while (this.r == null);
    paramRecyclerView.getResources();
    this.e = org.vidogram.messenger.a.a(120.0F);
    this.f = org.vidogram.messenger.a.a(800.0F);
    a();
  }

  public void b(Canvas paramCanvas, RecyclerView paramRecyclerView, RecyclerView.r paramr)
  {
    float f2 = 0.0F;
    float f1;
    if (this.b != null)
    {
      a(this.p);
      f1 = this.p[0];
      f2 = this.p[1];
    }
    while (true)
    {
      a.a(this.l, paramCanvas, paramRecyclerView, this.b, this.o, this.m, f1, f2);
      return;
      f1 = 0.0F;
    }
  }

  public void b(View paramView)
  {
    c(paramView);
    paramView = this.r.a(paramView);
    if (paramView == null);
    do
    {
      return;
      if ((this.b != null) && (paramView == this.b))
      {
        a(null, 0);
        return;
      }
      a(paramView, false);
    }
    while (!this.a.remove(paramView.a));
    this.l.c(this.r, paramView);
  }

  public static abstract class a
  {
    private static final b a;
    private static final Interpolator b = new Interpolator()
    {
      public float getInterpolation(float paramFloat)
      {
        return paramFloat * paramFloat * paramFloat * paramFloat * paramFloat;
      }
    };
    private static final Interpolator c = new Interpolator()
    {
      public float getInterpolation(float paramFloat)
      {
        paramFloat -= 1.0F;
        return paramFloat * (paramFloat * paramFloat * paramFloat * paramFloat) + 1.0F;
      }
    };
    private int d = -1;

    static
    {
      if (Build.VERSION.SDK_INT >= 21)
      {
        a = new c.c();
        return;
      }
      if (Build.VERSION.SDK_INT >= 11)
      {
        a = new c.b();
        return;
      }
      a = new c.a();
    }

    public static int a(int paramInt1, int paramInt2)
    {
      int i = paramInt1 & 0xC0C0C;
      if (i == 0)
        return paramInt1;
      paramInt1 = (i ^ 0xFFFFFFFF) & paramInt1;
      if (paramInt2 == 0)
        return paramInt1 | i << 2;
      return paramInt1 | i << 1 & 0xFFF3F3F3 | (i << 1 & 0xC0C0C) << 2;
    }

    private int a(RecyclerView paramRecyclerView)
    {
      if (this.d == -1)
        this.d = org.vidogram.messenger.a.a(20.0F);
      return this.d;
    }

    private void a(Canvas paramCanvas, RecyclerView paramRecyclerView, RecyclerView.u paramu, List<a.c> paramList, int paramInt, float paramFloat1, float paramFloat2)
    {
      int j = paramList.size();
      int i = 0;
      while (i < j)
      {
        a.c localc = (a.c)paramList.get(i);
        localc.c();
        int k = paramCanvas.save();
        a(paramCanvas, paramRecyclerView, localc.h, localc.k, localc.l, localc.i, false);
        paramCanvas.restoreToCount(k);
        i += 1;
      }
      if (paramu != null)
      {
        i = paramCanvas.save();
        a(paramCanvas, paramRecyclerView, paramu, paramFloat1, paramFloat2, paramInt, true);
        paramCanvas.restoreToCount(i);
      }
    }

    public static int b(int paramInt1, int paramInt2)
    {
      return c(0, paramInt2 | paramInt1) | c(1, paramInt2) | c(2, paramInt1);
    }

    private void b(Canvas paramCanvas, RecyclerView paramRecyclerView, RecyclerView.u paramu, List<a.c> paramList, int paramInt, float paramFloat1, float paramFloat2)
    {
      int j = paramList.size();
      int i = 0;
      while (i < j)
      {
        a.c localc = (a.c)paramList.get(i);
        int k = paramCanvas.save();
        b(paramCanvas, paramRecyclerView, localc.h, localc.k, localc.l, localc.i, false);
        paramCanvas.restoreToCount(k);
        i += 1;
      }
      if (paramu != null)
      {
        i = paramCanvas.save();
        b(paramCanvas, paramRecyclerView, paramu, paramFloat1, paramFloat2, paramInt, true);
        paramCanvas.restoreToCount(i);
      }
      paramInt = 0;
      i = j - 1;
      if (i >= 0)
      {
        paramCanvas = (a.c)paramList.get(i);
        if ((a.c.a(paramCanvas)) && (!paramCanvas.j))
          paramList.remove(i);
      }
      while (true)
      {
        i -= 1;
        break;
        if (!a.c.a(paramCanvas))
        {
          paramInt = 1;
          continue;
          if (paramInt != 0)
            paramRecyclerView.invalidate();
          return;
        }
      }
    }

    public static int c(int paramInt1, int paramInt2)
    {
      return paramInt2 << paramInt1 * 8;
    }

    private boolean d(RecyclerView paramRecyclerView, RecyclerView.u paramu)
    {
      return (b(paramRecyclerView, paramu) & 0xFF0000) != 0;
    }

    public float a(float paramFloat)
    {
      return paramFloat;
    }

    public float a(RecyclerView.u paramu)
    {
      return 0.5F;
    }

    public int a(RecyclerView paramRecyclerView, int paramInt1, int paramInt2, int paramInt3, long paramLong)
    {
      float f1 = 1.0F;
      paramInt3 = a(paramRecyclerView);
      int i = Math.abs(paramInt2);
      int j = (int)Math.signum(paramInt2);
      float f2 = Math.min(1.0F, i * 1.0F / paramInt1);
      paramInt1 = (int)(paramInt3 * j * c.getInterpolation(f2));
      if (paramLong > 500L);
      while (true)
      {
        f2 = paramInt1;
        paramInt3 = (int)(b.getInterpolation(f1) * f2);
        paramInt1 = paramInt3;
        if (paramInt3 == 0)
        {
          if (paramInt2 <= 0)
            break;
          paramInt1 = 1;
        }
        return paramInt1;
        f1 = (float)paramLong / 500.0F;
      }
      return -1;
    }

    public abstract int a(RecyclerView paramRecyclerView, RecyclerView.u paramu);

    public long a(RecyclerView paramRecyclerView, int paramInt, float paramFloat1, float paramFloat2)
    {
      paramRecyclerView = paramRecyclerView.getItemAnimator();
      if (paramRecyclerView == null)
      {
        if (paramInt == 8)
          return 200L;
        return 250L;
      }
      if (paramInt == 8)
        return paramRecyclerView.d();
      return paramRecyclerView.f();
    }

    public RecyclerView.u a(RecyclerView.u paramu, List<RecyclerView.u> paramList, int paramInt1, int paramInt2)
    {
      int m = paramu.a.getWidth();
      int n = paramu.a.getHeight();
      Object localObject2 = null;
      int i = -1;
      int i1 = paramInt1 - paramu.a.getLeft();
      int i2 = paramInt2 - paramu.a.getTop();
      int i3 = paramList.size();
      int j = 0;
      Object localObject1;
      int k;
      if (j < i3)
      {
        localObject1 = (RecyclerView.u)paramList.get(j);
        if (i1 <= 0)
          break label346;
        k = ((RecyclerView.u)localObject1).a.getRight() - (paramInt1 + m);
        if ((k >= 0) || (((RecyclerView.u)localObject1).a.getRight() <= paramu.a.getRight()))
          break label346;
        k = Math.abs(k);
        if (k <= i)
          break label346;
        i = k;
        localObject2 = localObject1;
        label143: if (i1 >= 0)
          break label359;
        k = ((RecyclerView.u)localObject1).a.getLeft() - paramInt1;
        if ((k <= 0) || (((RecyclerView.u)localObject1).a.getLeft() >= paramu.a.getLeft()))
          break label359;
        k = Math.abs(k);
        if (k <= i)
          break label359;
        localObject2 = localObject1;
        i = k;
      }
      label346: label359: 
      while (true)
      {
        if (i2 < 0)
        {
          k = ((RecyclerView.u)localObject1).a.getTop() - paramInt2;
          if ((k > 0) && (((RecyclerView.u)localObject1).a.getTop() < paramu.a.getTop()))
          {
            k = Math.abs(k);
            if (k > i)
            {
              localObject2 = localObject1;
              i = k;
            }
          }
        }
        while (true)
        {
          if (i2 > 0)
          {
            k = ((RecyclerView.u)localObject1).a.getBottom() - (paramInt2 + n);
            if ((k < 0) && (((RecyclerView.u)localObject1).a.getBottom() > paramu.a.getBottom()))
            {
              k = Math.abs(k);
              if (k > i)
                i = k;
            }
          }
          while (true)
          {
            j += 1;
            localObject2 = localObject1;
            break;
            return localObject2;
            break label143;
            localObject1 = localObject2;
          }
        }
      }
    }

    public void a(Canvas paramCanvas, RecyclerView paramRecyclerView, RecyclerView.u paramu, float paramFloat1, float paramFloat2, int paramInt, boolean paramBoolean)
    {
      a.a(paramCanvas, paramRecyclerView, paramu.a, paramFloat1, paramFloat2, paramInt, paramBoolean);
    }

    public abstract void a(RecyclerView.u paramu, int paramInt);

    public void a(RecyclerView paramRecyclerView, RecyclerView.u paramu1, int paramInt1, RecyclerView.u paramu2, int paramInt2, int paramInt3, int paramInt4)
    {
      RecyclerView.h localh = paramRecyclerView.getLayoutManager();
      if ((localh instanceof a.d))
        ((a.d)localh).a(paramu1.a, paramu2.a, paramInt3, paramInt4);
      do
      {
        do
        {
          return;
          if (!localh.e())
            continue;
          if (localh.h(paramu2.a) <= paramRecyclerView.getPaddingLeft())
            paramRecyclerView.a(paramInt2);
          if (localh.j(paramu2.a) < paramRecyclerView.getWidth() - paramRecyclerView.getPaddingRight())
            continue;
          paramRecyclerView.a(paramInt2);
        }
        while (!localh.f());
        if (localh.i(paramu2.a) > paramRecyclerView.getPaddingTop())
          continue;
        paramRecyclerView.a(paramInt2);
      }
      while (localh.k(paramu2.a) < paramRecyclerView.getHeight() - paramRecyclerView.getPaddingBottom());
      paramRecyclerView.a(paramInt2);
    }

    public boolean a()
    {
      return true;
    }

    public boolean a(RecyclerView paramRecyclerView, RecyclerView.u paramu1, RecyclerView.u paramu2)
    {
      return true;
    }

    public float b(float paramFloat)
    {
      return paramFloat;
    }

    public float b(RecyclerView.u paramu)
    {
      return 0.5F;
    }

    final int b(RecyclerView paramRecyclerView, RecyclerView.u paramu)
    {
      return d(a(paramRecyclerView, paramu), af.h(paramRecyclerView));
    }

    public void b(Canvas paramCanvas, RecyclerView paramRecyclerView, RecyclerView.u paramu, float paramFloat1, float paramFloat2, int paramInt, boolean paramBoolean)
    {
      a.b(paramCanvas, paramRecyclerView, paramu.a, paramFloat1, paramFloat2, paramInt, paramBoolean);
    }

    public void b(RecyclerView.u paramu, int paramInt)
    {
      if (paramu != null)
        a.b(paramu.a);
    }

    public boolean b()
    {
      return true;
    }

    public abstract boolean b(RecyclerView paramRecyclerView, RecyclerView.u paramu1, RecyclerView.u paramu2);

    public int c()
    {
      return 0;
    }

    public void c(RecyclerView paramRecyclerView, RecyclerView.u paramu)
    {
      a.a(paramu.a);
    }

    public int d(int paramInt1, int paramInt2)
    {
      int i = paramInt1 & 0x303030;
      if (i == 0)
        return paramInt1;
      paramInt1 = (i ^ 0xFFFFFFFF) & paramInt1;
      if (paramInt2 == 0)
        return paramInt1 | i >> 2;
      return paramInt1 | i >> 1 & 0xFFCFCFCF | (i >> 1 & 0x303030) >> 2;
    }
  }

  private class b extends GestureDetector.SimpleOnGestureListener
  {
    private b()
    {
    }

    public boolean onDown(MotionEvent paramMotionEvent)
    {
      return true;
    }

    public void onLongPress(MotionEvent paramMotionEvent)
    {
      Object localObject = a.b(a.this, paramMotionEvent);
      if (localObject != null)
      {
        localObject = a.c(a.this).a((View)localObject);
        if ((localObject != null) && (a.a.a(a.this.l, a.c(a.this), (RecyclerView.u)localObject)))
          break label57;
      }
      label57: 
      do
      {
        do
          return;
        while (t.b(paramMotionEvent, 0) != a.this.k);
        int i = t.a(paramMotionEvent, a.this.k);
        float f1 = t.c(paramMotionEvent, i);
        float f2 = t.d(paramMotionEvent, i);
        a.this.c = f1;
        a.this.d = f2;
        paramMotionEvent = a.this;
        a.this.h = 0.0F;
        paramMotionEvent.g = 0.0F;
      }
      while (!a.this.l.a());
      a.a(a.this, (RecyclerView.u)localObject, 2);
    }
  }

  private class c
    implements android.support.v4.a.b
  {
    private final g a;
    private final int b;
    private boolean c = false;
    final float d;
    final float e;
    final float f;
    final float g;
    final RecyclerView.u h;
    final int i;
    public boolean j;
    float k;
    float l;
    boolean m = false;
    private float o;

    public c(RecyclerView.u paramInt1, int paramInt2, int paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float arg8)
    {
      this.i = paramFloat1;
      this.b = paramInt2;
      this.h = paramInt1;
      this.d = paramFloat2;
      this.e = paramFloat3;
      this.f = paramFloat4;
      Object localObject;
      this.g = localObject;
      this.a = android.support.v4.a.a.a();
      this.a.a(new d(a.this)
      {
        public void a(g paramg)
        {
          a.c.this.a(paramg.c());
        }
      });
      this.a.a(paramInt1.a);
      this.a.a(this);
      a(0.0F);
    }

    public void a()
    {
      this.h.a(false);
      this.a.a();
    }

    public void a(float paramFloat)
    {
      this.o = paramFloat;
    }

    public void a(long paramLong)
    {
      this.a.a(paramLong);
    }

    public void a(g paramg)
    {
    }

    public void b()
    {
      this.a.b();
    }

    public void b(g paramg)
    {
      if (!this.c)
        this.h.a(true);
      this.c = true;
    }

    public void c()
    {
      if (this.d == this.f);
      for (this.k = af.k(this.h.a); this.e == this.g; this.k = (this.d + this.o * (this.f - this.d)))
      {
        this.l = af.l(this.h.a);
        return;
      }
      this.l = (this.e + this.o * (this.g - this.e));
    }

    public void c(g paramg)
    {
      a(1.0F);
    }

    public void d(g paramg)
    {
    }
  }

  public static abstract interface d
  {
    public abstract void a(View paramView1, View paramView2, int paramInt1, int paramInt2);
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.support.widget.a.a
 * JD-Core Version:    0.6.0
 */