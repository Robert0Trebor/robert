package org.vidogram.messenger.support.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import android.support.v4.view.a.c.l;
import android.support.v4.view.a.c.m;
import android.support.v4.view.a.k;
import android.support.v4.view.ab;
import android.support.v4.view.ad;
import android.support.v4.view.af;
import android.support.v4.view.ap;
import android.support.v4.view.v;
import android.support.v4.view.w;
import android.support.v4.widget.h;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.vidogram.messenger.n;

public class RecyclerView extends ViewGroup
  implements ab, v
{
  static final boolean a;
  private static final Interpolator ar;
  private static final boolean k;
  private static final Class<?>[] l;
  private boolean A;
  private boolean B;
  private boolean C;
  private int D;
  private boolean E;
  private final boolean F;
  private final AccessibilityManager G;
  private List<j> H;
  private boolean I = false;
  private int J = 0;
  private int K = 0;
  private int L = 0;
  private h M;
  private h N;
  private h O;
  private h P;
  private int Q = 0;
  private int R = -1;
  private VelocityTracker S;
  private int T;
  private int U;
  private int V;
  private int W;
  private int aa;
  private final int ab;
  private final int ac;
  private float ad = 1.4E-45F;
  private final t ae = new t();
  private l af;
  private List<l> ag;
  private RecyclerView.e.b ah = new f(null);
  private boolean ai = false;
  private g aj;
  private d ak;
  private final int[] al = new int[2];
  private w am;
  private final int[] an = new int[2];
  private final int[] ao = new int[2];
  private final int[] ap = new int[2];
  private Runnable aq = new Runnable()
  {
    public void run()
    {
      if (RecyclerView.this.g != null)
        RecyclerView.this.g.a();
      RecyclerView.b(RecyclerView.this, false);
    }
  };
  private final j.b as = new j.b()
  {
    public void a(RecyclerView.u paramu)
    {
      RecyclerView.this.f.a(paramu.a, RecyclerView.this.b);
    }

    public void a(RecyclerView.u paramu, RecyclerView.e.c paramc1, RecyclerView.e.c paramc2)
    {
      RecyclerView.this.b.d(paramu);
      RecyclerView.a(RecyclerView.this, paramu, paramc1, paramc2);
    }

    public void b(RecyclerView.u paramu, RecyclerView.e.c paramc1, RecyclerView.e.c paramc2)
    {
      RecyclerView.b(RecyclerView.this, paramu, paramc1, paramc2);
    }

    public void c(RecyclerView.u paramu, RecyclerView.e.c paramc1, RecyclerView.e.c paramc2)
    {
      paramu.a(false);
      if (RecyclerView.d(RecyclerView.this))
        if (RecyclerView.this.g.a(paramu, paramu, paramc1, paramc2))
          RecyclerView.e(RecyclerView.this);
      do
        return;
      while (!RecyclerView.this.g.c(paramu, paramc1, paramc2));
      RecyclerView.e(RecyclerView.this);
    }
  };
  final n b = new n();
  a c;
  b d;
  final j e = new j();
  h f;
  e g = new c();
  final r h = new r();
  boolean i = false;
  boolean j = false;
  private final p m = new p(null);
  private SavedState n;
  private boolean o;
  private final Runnable p = new Runnable()
  {
    public void run()
    {
      if ((!RecyclerView.a(RecyclerView.this)) || (RecyclerView.this.isLayoutRequested()))
        return;
      if (RecyclerView.b(RecyclerView.this))
      {
        RecyclerView.a(RecyclerView.this, true);
        return;
      }
      RecyclerView.c(RecyclerView.this);
    }
  };
  private final Rect q = new Rect();
  private a r;
  private o s;
  private final ArrayList<g> t = new ArrayList();
  private final ArrayList<k> u = new ArrayList();
  private k v;
  private boolean w;
  private boolean x;
  private boolean y;
  private int z = 0;

  static
  {
    if ((Build.VERSION.SDK_INT == 18) || (Build.VERSION.SDK_INT == 19) || (Build.VERSION.SDK_INT == 20))
    {
      bool = true;
      k = bool;
      if (Build.VERSION.SDK_INT < 23)
        break label89;
    }
    label89: for (boolean bool = true; ; bool = false)
    {
      a = bool;
      l = new Class[] { Context.class, AttributeSet.class, Integer.TYPE, Integer.TYPE };
      ar = new Interpolator()
      {
        public float getInterpolation(float paramFloat)
        {
          paramFloat -= 1.0F;
          return paramFloat * (paramFloat * paramFloat * paramFloat * paramFloat) + 1.0F;
        }
      };
      return;
      bool = false;
      break;
    }
  }

  public RecyclerView(Context paramContext)
  {
    this(paramContext, null);
  }

  public RecyclerView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public RecyclerView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setScrollContainer(true);
    setFocusableInTouchMode(true);
    if (Build.VERSION.SDK_INT >= 16);
    for (boolean bool1 = true; ; bool1 = false)
    {
      this.F = bool1;
      paramContext = ViewConfiguration.get(paramContext);
      this.aa = paramContext.getScaledTouchSlop();
      this.ab = paramContext.getScaledMinimumFlingVelocity();
      this.ac = paramContext.getScaledMaximumFlingVelocity();
      bool1 = bool2;
      if (af.a(this) == 2)
        bool1 = true;
      setWillNotDraw(bool1);
      this.g.a(this.ah);
      a();
      s();
      if (af.e(this) == 0)
        af.c(this, 1);
      this.G = ((AccessibilityManager)getContext().getSystemService("accessibility"));
      setAccessibilityDelegateCompat(new g(this));
      setNestedScrollingEnabled(true);
      return;
    }
  }

  private void A()
  {
    this.J -= 1;
    if (this.J < 1)
    {
      this.J = 0;
      B();
    }
  }

  private void B()
  {
    int i1 = this.D;
    this.D = 0;
    if ((i1 != 0) && (i()))
    {
      AccessibilityEvent localAccessibilityEvent = AccessibilityEvent.obtain();
      localAccessibilityEvent.setEventType(2048);
      android.support.v4.view.a.a.a(localAccessibilityEvent, i1);
      sendAccessibilityEventUnchecked(localAccessibilityEvent);
    }
  }

  private void C()
  {
    if ((!this.ai) && (this.w))
    {
      af.a(this, this.aq);
      this.ai = true;
    }
  }

  private boolean D()
  {
    return (this.g != null) && (this.f.c());
  }

  private void E()
  {
    boolean bool2 = true;
    if (this.I)
    {
      this.c.a();
      o();
      this.f.a(this);
    }
    int i1;
    label58: r localr;
    if (D())
    {
      this.c.b();
      if ((!this.i) && (!this.j))
        break label179;
      i1 = 1;
      localr = this.h;
      if ((!this.y) || (this.g == null) || ((!this.I) && (i1 == 0) && (!h.b(this.f))) || ((this.I) && (!this.r.b())))
        break label184;
      bool1 = true;
      label118: r.d(localr, bool1);
      localr = this.h;
      if ((!r.d(this.h)) || (i1 == 0) || (this.I) || (!D()))
        break label189;
    }
    label179: label184: label189: for (boolean bool1 = bool2; ; bool1 = false)
    {
      r.e(localr, bool1);
      return;
      this.c.e();
      break;
      i1 = 0;
      break label58;
      bool1 = false;
      break label118;
    }
  }

  private void F()
  {
    boolean bool = true;
    this.h.a(1);
    r.b(this.h, false);
    b();
    this.e.a();
    z();
    E();
    Object localObject = this.h;
    int i2;
    int i1;
    if ((r.d(this.h)) && (this.j))
    {
      r.f((r)localObject, bool);
      this.j = false;
      this.i = false;
      r.c(this.h, r.c(this.h));
      this.h.a = this.r.a();
      a(this.al);
      if (!r.d(this.h))
        break label294;
      i2 = this.d.b();
      i1 = 0;
      label137: if (i1 >= i2)
        break label294;
      localObject = d(this.d.b(i1));
      if ((!((u)localObject).c()) && ((!((u)localObject).n()) || (this.r.b())))
        break label194;
    }
    label194: RecyclerView.e.c localc;
    while (true)
    {
      i1 += 1;
      break label137;
      bool = false;
      break;
      localc = this.g.a(this.h, (u)localObject, e.d((u)localObject), ((u)localObject).u());
      this.e.a((u)localObject, localc);
      if ((!r.e(this.h)) || (!((u)localObject).x()) || (((u)localObject).q()) || (((u)localObject).c()) || (((u)localObject).n()))
        continue;
      long l1 = a((u)localObject);
      this.e.a(l1, (u)localObject);
    }
    label294: if (r.c(this.h))
    {
      m();
      bool = r.f(this.h);
      r.a(this.h, false);
      this.f.c(this.b, this.h);
      r.a(this.h, bool);
      i1 = 0;
      if (i1 < this.d.b())
      {
        localObject = d(this.d.b(i1));
        if (((u)localObject).c());
        while (true)
        {
          i1 += 1;
          break;
          if (this.e.d((u)localObject))
            continue;
          int i3 = e.d((u)localObject);
          bool = ((u)localObject).a(8192);
          i2 = i3;
          if (!bool)
            i2 = i3 | 0x1000;
          localc = this.g.a(this.h, (u)localObject, i2, ((u)localObject).u());
          if (bool)
          {
            a((u)localObject, localc);
            continue;
          }
          this.e.b((u)localObject, localc);
        }
      }
      n();
    }
    while (true)
    {
      A();
      a(false);
      r.b(this.h, 2);
      return;
      n();
    }
  }

  private void G()
  {
    b();
    z();
    this.h.a(6);
    this.c.e();
    this.h.a = this.r.a();
    r.a(this.h, 0);
    r.c(this.h, false);
    this.f.c(this.b, this.h);
    r.a(this.h, false);
    this.n = null;
    r localr = this.h;
    if ((r.d(this.h)) && (this.g != null));
    for (boolean bool = true; ; bool = false)
    {
      r.d(localr, bool);
      r.b(this.h, 4);
      A();
      a(false);
      return;
    }
  }

  private void H()
  {
    this.h.a(4);
    b();
    z();
    r.b(this.h, 1);
    if (r.d(this.h))
    {
      int i1 = this.d.b() - 1;
      if (i1 >= 0)
      {
        u localu1 = d(this.d.b(i1));
        if (localu1.c());
        while (true)
        {
          i1 -= 1;
          break;
          long l1 = a(localu1);
          RecyclerView.e.c localc2 = this.g.a(this.h, localu1);
          u localu2 = this.e.a(l1);
          if ((localu2 != null) && (!localu2.c()))
          {
            boolean bool1 = this.e.a(localu2);
            boolean bool2 = this.e.a(localu1);
            if ((bool1) && (localu2 == localu1))
            {
              this.e.c(localu1, localc2);
              continue;
            }
            RecyclerView.e.c localc1 = this.e.b(localu2);
            this.e.c(localu1, localc2);
            localc2 = this.e.c(localu1);
            if (localc1 == null)
            {
              a(l1, localu1, localu2);
              continue;
            }
            a(localu2, localu1, localc1, localc2, bool1, bool2);
            continue;
          }
          this.e.c(localu1, localc2);
        }
      }
      this.e.a(this.as);
    }
    this.f.b(this.b);
    r.c(this.h, this.h.a);
    this.I = false;
    r.d(this.h, false);
    r.e(this.h, false);
    h.a(this.f, false);
    if (n.a(this.b) != null)
      n.a(this.b).clear();
    A();
    a(false);
    this.e.a();
    if (j(this.al[0], this.al[1]))
      h(0, 0);
  }

  private void I()
  {
    if (this.I)
      return;
    this.I = true;
    int i2 = this.d.c();
    int i1 = 0;
    while (i1 < i2)
    {
      u localu = d(this.d.c(i1));
      if ((localu != null) && (!localu.c()))
        localu.b(512);
      i1 += 1;
    }
    this.b.g();
  }

  private void J()
  {
    int i2 = this.d.b();
    int i1 = 0;
    while (i1 < i2)
    {
      View localView = this.d.b(i1);
      Object localObject = a(localView);
      if ((localObject != null) && (((u)localObject).h != null))
      {
        localObject = ((u)localObject).h.a;
        int i3 = localView.getLeft();
        int i4 = localView.getTop();
        if ((i3 != ((View)localObject).getLeft()) || (i4 != ((View)localObject).getTop()))
          ((View)localObject).layout(i3, i4, ((View)localObject).getWidth() + i3, ((View)localObject).getHeight() + i4);
      }
      i1 += 1;
    }
  }

  private void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    int i2 = 1;
    int i3 = 0;
    int i1;
    if (paramFloat2 < 0.0F)
    {
      d();
      i1 = i3;
      if (this.M.a(-paramFloat2 / getWidth(), 1.0F - paramFloat3 / getHeight()))
        i1 = 1;
      if (paramFloat4 >= 0.0F)
        break label158;
      f();
      if (!this.N.a(-paramFloat4 / getHeight(), paramFloat1 / getWidth()))
        break label196;
    }
    while (true)
    {
      if ((i2 != 0) || (paramFloat2 != 0.0F) || (paramFloat4 != 0.0F))
        af.d(this);
      return;
      i1 = i3;
      if (paramFloat2 <= 0.0F)
        break;
      e();
      i1 = i3;
      if (!this.O.a(paramFloat2 / getWidth(), paramFloat3 / getHeight()))
        break;
      i1 = 1;
      break;
      label158: if (paramFloat4 > 0.0F)
      {
        g();
        if (this.P.a(paramFloat4 / getHeight(), 1.0F - paramFloat1 / getWidth()))
          continue;
      }
      label196: i2 = i1;
    }
  }

  private void a(long paramLong, u paramu1, u paramu2)
  {
    int i2 = this.d.b();
    int i1 = 0;
    if (i1 < i2)
    {
      u localu = d(this.d.b(i1));
      if (localu == paramu1);
      do
      {
        i1 += 1;
        break;
      }
      while (a(localu) != paramLong);
      if ((this.r != null) && (this.r.b()))
        throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + localu + " \n View Holder 2:" + paramu1);
      throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + localu + " \n View Holder 2:" + paramu1);
    }
    Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + paramu2 + " cannot be found but it is necessary for " + paramu1);
  }

  private void a(a parama, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (this.r != null)
    {
      this.r.b(this.m);
      this.r.b(this);
    }
    if ((!paramBoolean1) || (paramBoolean2))
    {
      if (this.g != null)
        this.g.c();
      if (this.f != null)
      {
        this.f.c(this.b);
        this.f.b(this.b);
      }
      this.b.a();
    }
    this.c.a();
    a locala = this.r;
    this.r = parama;
    if (parama != null)
    {
      parama.a(this.m);
      parama.a(this);
    }
    if (this.f != null)
      this.f.a(locala, this.r);
    this.b.a(locala, this.r, paramBoolean1);
    r.a(this.h, true);
    o();
  }

  private void a(u paramu, RecyclerView.e.c paramc)
  {
    paramu.a(0, 8192);
    if ((r.e(this.h)) && (paramu.x()) && (!paramu.q()) && (!paramu.c()))
    {
      long l1 = a(paramu);
      this.e.a(l1, paramu);
    }
    this.e.a(paramu, paramc);
  }

  private void a(u paramu, RecyclerView.e.c paramc1, RecyclerView.e.c paramc2)
  {
    paramu.a(false);
    if (this.g.b(paramu, paramc1, paramc2))
      C();
  }

  private void a(u paramu1, u paramu2, RecyclerView.e.c paramc1, RecyclerView.e.c paramc2, boolean paramBoolean1, boolean paramBoolean2)
  {
    paramu1.a(false);
    if (paramBoolean1)
      b(paramu1);
    if (paramu1 != paramu2)
    {
      if (paramBoolean2)
        b(paramu2);
      paramu1.g = paramu2;
      b(paramu1);
      this.b.d(paramu1);
      paramu2.a(false);
      paramu2.h = paramu1;
    }
    if (this.g.a(paramu1, paramu2, paramc1, paramc2))
      C();
  }

  private void a(int[] paramArrayOfInt)
  {
    int i6 = this.d.b();
    if (i6 == 0)
    {
      paramArrayOfInt[0] = 0;
      paramArrayOfInt[1] = 0;
      return;
    }
    int i1 = 2147483647;
    int i4 = -2147483648;
    int i3 = 0;
    u localu;
    if (i3 < i6)
    {
      localu = d(this.d.b(i3));
      if (!localu.c());
    }
    while (true)
    {
      i3 += 1;
      break;
      int i5 = localu.d();
      int i2 = i1;
      if (i5 < i1)
        i2 = i5;
      if (i5 > i4)
      {
        i4 = i5;
        i1 = i2;
        continue;
        paramArrayOfInt[0] = i1;
        paramArrayOfInt[1] = i4;
        return;
      }
      i1 = i2;
    }
  }

  private boolean a(MotionEvent paramMotionEvent)
  {
    int i2 = paramMotionEvent.getAction();
    if ((i2 == 3) || (i2 == 0))
      this.v = null;
    int i3 = this.u.size();
    int i1 = 0;
    while (i1 < i3)
    {
      k localk = (k)this.u.get(i1);
      if ((localk.a(this, paramMotionEvent)) && (i2 != 3))
      {
        this.v = localk;
        return true;
      }
      i1 += 1;
    }
    return false;
  }

  private void b(u paramu)
  {
    View localView = paramu.a;
    if (localView.getParent() == this);
    for (int i1 = 1; ; i1 = 0)
    {
      this.b.d(a(localView));
      if (!paramu.r())
        break;
      this.d.a(localView, -1, localView.getLayoutParams(), true);
      return;
    }
    if (i1 == 0)
    {
      this.d.a(localView, true);
      return;
    }
    this.d.d(localView);
  }

  private void b(u paramu, RecyclerView.e.c paramc1, RecyclerView.e.c paramc2)
  {
    b(paramu);
    paramu.a(false);
    if (this.g.a(paramu, paramc1, paramc2))
      C();
  }

  private boolean b(MotionEvent paramMotionEvent)
  {
    int i1 = paramMotionEvent.getAction();
    int i2;
    if (this.v != null)
    {
      if (i1 == 0)
        this.v = null;
    }
    else
    {
      if (i1 == 0)
        break label108;
      i2 = this.u.size();
      i1 = 0;
    }
    while (i1 < i2)
    {
      k localk = (k)this.u.get(i1);
      if (localk.a(this, paramMotionEvent))
      {
        this.v = localk;
        return true;
        this.v.b(this, paramMotionEvent);
        if ((i1 == 3) || (i1 == 1))
          this.v = null;
        return true;
      }
      i1 += 1;
    }
    label108: return false;
  }

  private void c(MotionEvent paramMotionEvent)
  {
    int i1 = android.support.v4.view.t.b(paramMotionEvent);
    if (android.support.v4.view.t.b(paramMotionEvent, i1) == this.R)
      if (i1 != 0)
        break label75;
    label75: for (i1 = 1; ; i1 = 0)
    {
      this.R = android.support.v4.view.t.b(paramMotionEvent, i1);
      int i2 = (int)(android.support.v4.view.t.c(paramMotionEvent, i1) + 0.5F);
      this.V = i2;
      this.T = i2;
      i1 = (int)(android.support.v4.view.t.d(paramMotionEvent, i1) + 0.5F);
      this.W = i1;
      this.U = i1;
      return;
    }
  }

  private boolean c(u paramu)
  {
    return (this.g == null) || (this.g.a(paramu, paramu.u()));
  }

  private int d(u paramu)
  {
    if ((paramu.a(524)) || (!paramu.p()))
      return -1;
    return this.c.c(paramu.b);
  }

  static u d(View paramView)
  {
    if (paramView == null)
      return null;
    return ((i)paramView.getLayoutParams()).a;
  }

  private void g(int paramInt)
  {
    if (this.f == null)
      return;
    this.f.d(paramInt);
    awakenScrollBars();
  }

  private float getScrollFactor()
  {
    if (this.ad == 1.4E-45F)
    {
      TypedValue localTypedValue = new TypedValue();
      if (getContext().getTheme().resolveAttribute(16842829, localTypedValue, true))
        this.ad = localTypedValue.getDimension(getContext().getResources().getDisplayMetrics());
    }
    else
    {
      return this.ad;
    }
    return 0.0F;
  }

  private w getScrollingChildHelper()
  {
    if (this.am == null)
      this.am = new w(this);
    return this.am;
  }

  private void i(int paramInt1, int paramInt2)
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (this.M != null)
    {
      bool1 = bool2;
      if (!this.M.a())
      {
        bool1 = bool2;
        if (paramInt1 > 0)
          bool1 = this.M.c();
      }
    }
    bool2 = bool1;
    if (this.O != null)
    {
      bool2 = bool1;
      if (!this.O.a())
      {
        bool2 = bool1;
        if (paramInt1 < 0)
          bool2 = bool1 | this.O.c();
      }
    }
    bool1 = bool2;
    if (this.N != null)
    {
      bool1 = bool2;
      if (!this.N.a())
      {
        bool1 = bool2;
        if (paramInt2 > 0)
          bool1 = bool2 | this.N.c();
      }
    }
    bool2 = bool1;
    if (this.P != null)
    {
      bool2 = bool1;
      if (!this.P.a())
      {
        bool2 = bool1;
        if (paramInt2 < 0)
          bool2 = bool1 | this.P.c();
      }
    }
    if (bool2)
      af.d(this);
  }

  private boolean j(int paramInt1, int paramInt2)
  {
    int i1 = 0;
    if (this.d.b() == 0)
      if ((paramInt1 != 0) || (paramInt2 != 0))
        i1 = 1;
    do
    {
      return i1;
      a(this.al);
    }
    while ((this.al[0] == paramInt1) && (this.al[1] == paramInt2));
    return true;
  }

  private boolean k(View paramView)
  {
    b();
    boolean bool2 = this.d.f(paramView);
    if (bool2)
    {
      paramView = d(paramView);
      this.b.d(paramView);
      this.b.b(paramView);
    }
    if (!bool2);
    for (boolean bool1 = true; ; bool1 = false)
    {
      a(bool1);
      return bool2;
    }
  }

  private void l(View paramView)
  {
    u localu = d(paramView);
    i(paramView);
    if ((this.r != null) && (localu != null))
      this.r.d(localu);
    if (this.H != null)
    {
      int i1 = this.H.size() - 1;
      while (i1 >= 0)
      {
        ((j)this.H.get(i1)).b(paramView);
        i1 -= 1;
      }
    }
  }

  private void m(View paramView)
  {
    u localu = d(paramView);
    h(paramView);
    if ((this.r != null) && (localu != null))
      this.r.c(localu);
    if (this.H != null)
    {
      int i1 = this.H.size() - 1;
      while (i1 >= 0)
      {
        ((j)this.H.get(i1)).a(paramView);
        i1 -= 1;
      }
    }
  }

  private void s()
  {
    this.d = new b(new b.b()
    {
      public int a()
      {
        return RecyclerView.this.getChildCount();
      }

      public int a(View paramView)
      {
        return RecyclerView.this.indexOfChild(paramView);
      }

      public void a(int paramInt)
      {
        View localView = RecyclerView.this.getChildAt(paramInt);
        if (localView != null)
          RecyclerView.b(RecyclerView.this, localView);
        RecyclerView.this.removeViewAt(paramInt);
      }

      public void a(View paramView, int paramInt)
      {
        RecyclerView.this.addView(paramView, paramInt);
        RecyclerView.a(RecyclerView.this, paramView);
      }

      public void a(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
      {
        RecyclerView.u localu = RecyclerView.d(paramView);
        if (localu != null)
        {
          if ((!localu.r()) && (!localu.c()))
            throw new IllegalArgumentException("Called attach on a child which is not detached: " + localu);
          localu.m();
        }
        RecyclerView.a(RecyclerView.this, paramView, paramInt, paramLayoutParams);
      }

      public View b(int paramInt)
      {
        return RecyclerView.this.getChildAt(paramInt);
      }

      public RecyclerView.u b(View paramView)
      {
        return RecyclerView.d(paramView);
      }

      public void b()
      {
        int j = a();
        int i = 0;
        while (i < j)
        {
          RecyclerView.b(RecyclerView.this, b(i));
          i += 1;
        }
        RecyclerView.this.removeAllViews();
      }

      public void c(int paramInt)
      {
        Object localObject = b(paramInt);
        if (localObject != null)
        {
          localObject = RecyclerView.d((View)localObject);
          if (localObject != null)
          {
            if ((((RecyclerView.u)localObject).r()) && (!((RecyclerView.u)localObject).c()))
              throw new IllegalArgumentException("called detach on an already detached child " + localObject);
            ((RecyclerView.u)localObject).b(256);
          }
        }
        RecyclerView.a(RecyclerView.this, paramInt);
      }

      public void c(View paramView)
      {
        paramView = RecyclerView.d(paramView);
        if (paramView != null)
          RecyclerView.u.a(paramView);
      }

      public void d(View paramView)
      {
        paramView = RecyclerView.d(paramView);
        if (paramView != null)
          RecyclerView.u.b(paramView);
      }
    });
  }

  private void setScrollState(int paramInt)
  {
    if (paramInt == this.Q)
      return;
    this.Q = paramInt;
    if (paramInt != 2)
      v();
    f(paramInt);
  }

  private void t()
  {
    if (!this.y);
    label106: 
    do
    {
      do
      {
        return;
        if (!this.I)
          continue;
        android.support.v4.e.j.a("RV FullInvalidate");
        k();
        android.support.v4.e.j.a();
        return;
      }
      while (!this.c.d());
      if ((!this.c.a(4)) || (this.c.a(11)))
        continue;
      android.support.v4.e.j.a("RV PartialInvalidate");
      b();
      this.c.b();
      if (!this.A)
      {
        if (!u())
          break label106;
        k();
      }
      while (true)
      {
        a(true);
        android.support.v4.e.j.a();
        return;
        this.c.c();
      }
    }
    while (!this.c.d());
    android.support.v4.e.j.a("RV FullInvalidate");
    k();
    android.support.v4.e.j.a();
  }

  private boolean u()
  {
    int i4 = 0;
    int i2 = this.d.b();
    int i1 = 0;
    int i3 = i4;
    if (i1 < i2)
    {
      u localu = d(this.d.b(i1));
      if ((localu == null) || (localu.c()));
      do
      {
        i1 += 1;
        break;
      }
      while (!localu.x());
      i3 = 1;
    }
    return i3;
  }

  private void v()
  {
    this.ae.b();
    if (this.f != null)
      this.f.G();
  }

  private void w()
  {
    boolean bool2 = false;
    if (this.M != null)
      bool2 = this.M.c();
    boolean bool1 = bool2;
    if (this.N != null)
      bool1 = bool2 | this.N.c();
    bool2 = bool1;
    if (this.O != null)
      bool2 = bool1 | this.O.c();
    bool1 = bool2;
    if (this.P != null)
      bool1 = bool2 | this.P.c();
    if (bool1)
      af.d(this);
  }

  private void x()
  {
    if (this.S != null)
      this.S.clear();
    stopNestedScroll();
    w();
  }

  private void y()
  {
    x();
    setScrollState(0);
  }

  private void z()
  {
    this.J += 1;
  }

  long a(u paramu)
  {
    if (this.r.b())
      return paramu.g();
    return paramu.b;
  }

  public View a(float paramFloat1, float paramFloat2)
  {
    int i1 = this.d.b() - 1;
    while (i1 >= 0)
    {
      View localView = this.d.b(i1);
      float f1 = af.k(localView);
      float f2 = af.l(localView);
      if ((paramFloat1 >= localView.getLeft() + f1) && (paramFloat1 <= f1 + localView.getRight()) && (paramFloat2 >= localView.getTop() + f2) && (paramFloat2 <= localView.getBottom() + f2))
        return localView;
      i1 -= 1;
    }
    return null;
  }

  u a(int paramInt, boolean paramBoolean)
  {
    int i2 = this.d.c();
    int i1 = 0;
    while (i1 < i2)
    {
      u localu = d(this.d.c(i1));
      if ((localu != null) && (!localu.q()))
        if (paramBoolean)
        {
          if (localu.b != paramInt);
        }
        else
          do
            return localu;
          while (localu.d() == paramInt);
      i1 += 1;
    }
    return null;
  }

  public u a(View paramView)
  {
    ViewParent localViewParent = paramView.getParent();
    if ((localViewParent != null) && (localViewParent != this))
      throw new IllegalArgumentException("View " + paramView + " is not a direct child of " + this);
    return d(paramView);
  }

  void a()
  {
    this.c = new a(new a.a()
    {
      public RecyclerView.u a(int paramInt)
      {
        RecyclerView.u localu = RecyclerView.this.a(paramInt, true);
        if (localu == null);
        do
          return null;
        while (RecyclerView.this.d.c(localu.a));
        return localu;
      }

      public void a(int paramInt1, int paramInt2)
      {
        RecyclerView.this.a(paramInt1, paramInt2, true);
        RecyclerView.this.i = true;
        RecyclerView.r localr = RecyclerView.this.h;
        RecyclerView.r.a(localr, RecyclerView.r.a(localr) + paramInt2);
      }

      public void a(int paramInt1, int paramInt2, Object paramObject)
      {
        RecyclerView.this.a(paramInt1, paramInt2, paramObject);
        RecyclerView.this.j = true;
      }

      public void a(a.b paramb)
      {
        c(paramb);
      }

      public void b(int paramInt1, int paramInt2)
      {
        RecyclerView.this.a(paramInt1, paramInt2, false);
        RecyclerView.this.i = true;
      }

      public void b(a.b paramb)
      {
        c(paramb);
      }

      public void c(int paramInt1, int paramInt2)
      {
        RecyclerView.this.f(paramInt1, paramInt2);
        RecyclerView.this.i = true;
      }

      void c(a.b paramb)
      {
        switch (paramb.a)
        {
        case 3:
        case 5:
        case 6:
        case 7:
        default:
          return;
        case 1:
          RecyclerView.this.f.a(RecyclerView.this, paramb.b, paramb.d);
          return;
        case 2:
          RecyclerView.this.f.b(RecyclerView.this, paramb.b, paramb.d);
          return;
        case 4:
          RecyclerView.this.f.a(RecyclerView.this, paramb.b, paramb.d, paramb.c);
          return;
        case 8:
        }
        RecyclerView.this.f.a(RecyclerView.this, paramb.b, paramb.d, 1);
      }

      public void d(int paramInt1, int paramInt2)
      {
        RecyclerView.this.e(paramInt1, paramInt2);
        RecyclerView.this.i = true;
      }
    });
  }

  public void a(int paramInt)
  {
    if (this.B)
      return;
    c();
    if (this.f == null)
    {
      Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
      return;
    }
    this.f.d(paramInt);
    awakenScrollBars();
  }

  public void a(int paramInt1, int paramInt2)
  {
    int i1 = 0;
    if (this.f == null)
      Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
    while (true)
    {
      return;
      if (this.B)
        continue;
      if (!this.f.e())
        paramInt1 = 0;
      if (!this.f.f())
        paramInt2 = i1;
      while ((paramInt1 != 0) || (paramInt2 != 0))
      {
        this.ae.b(paramInt1, paramInt2);
        return;
      }
    }
  }

  void a(int paramInt1, int paramInt2, Object paramObject)
  {
    int i2 = this.d.c();
    int i1 = 0;
    if (i1 < i2)
    {
      View localView = this.d.c(i1);
      u localu = d(localView);
      if ((localu == null) || (localu.c()));
      while (true)
      {
        i1 += 1;
        break;
        if ((localu.b < paramInt1) || (localu.b >= paramInt1 + paramInt2))
          continue;
        localu.b(2);
        localu.a(paramObject);
        ((i)localView.getLayoutParams()).c = true;
      }
    }
    this.b.c(paramInt1, paramInt2);
  }

  void a(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    int i2 = this.d.c();
    int i1 = 0;
    if (i1 < i2)
    {
      u localu = d(this.d.c(i1));
      if ((localu != null) && (!localu.c()))
      {
        if (localu.b < paramInt1 + paramInt2)
          break label83;
        localu.a(-paramInt2, paramBoolean);
        r.a(this.h, true);
      }
      while (true)
      {
        i1 += 1;
        break;
        label83: if (localu.b < paramInt1)
          continue;
        localu.a(paramInt1 - 1, -paramInt2, paramBoolean);
        r.a(this.h, true);
      }
    }
    this.b.b(paramInt1, paramInt2, paramBoolean);
    requestLayout();
  }

  void a(h paramh)
  {
    if ((Build.VERSION.SDK_INT >= 21) && (this.L != 0));
    try
    {
      Field localField = h.class.getDeclaredField("a");
      localField.setAccessible(true);
      paramh = (EdgeEffect)localField.get(paramh);
      if (paramh != null)
        paramh.setColor(this.L);
      return;
    }
    catch (java.lang.Exception paramh)
    {
      n.a("tmessages", paramh);
    }
  }

  void a(String paramString)
  {
    if (j())
    {
      if (paramString == null)
        throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling");
      throw new IllegalStateException(paramString);
    }
  }

  public void a(g paramg)
  {
    a(paramg, -1);
  }

  public void a(g paramg, int paramInt)
  {
    if (this.f != null)
      this.f.a("Cannot add item decoration during a scroll  or layout");
    if (this.t.isEmpty())
      setWillNotDraw(false);
    if (paramInt < 0)
      this.t.add(paramg);
    while (true)
    {
      l();
      requestLayout();
      return;
      this.t.add(paramInt, paramg);
    }
  }

  public void a(j paramj)
  {
    if (this.H == null)
      this.H = new ArrayList();
    this.H.add(paramj);
  }

  public void a(k paramk)
  {
    this.u.add(paramk);
  }

  void a(boolean paramBoolean)
  {
    if (this.z < 1)
      this.z = 1;
    if (!paramBoolean)
      this.A = false;
    if (this.z == 1)
    {
      if ((paramBoolean) && (this.A) && (!this.B) && (this.f != null) && (this.r != null))
        k();
      if (!this.B)
        this.A = false;
    }
    this.z -= 1;
  }

  boolean a(int paramInt1, int paramInt2, MotionEvent paramMotionEvent)
  {
    int i7 = 0;
    t();
    int i2;
    int i1;
    int i3;
    int i4;
    if (this.r != null)
    {
      b();
      z();
      android.support.v4.e.j.a("RV Scroll");
      if (paramInt1 != 0)
      {
        i2 = this.f.a(paramInt1, this.b, this.h);
        i1 = paramInt1 - i2;
        if (paramInt2 != 0)
        {
          i3 = this.f.b(paramInt2, this.b, this.h);
          i4 = paramInt2 - i3;
          label84: android.support.v4.e.j.a();
          J();
          A();
          a(false);
          int i6 = i3;
          i3 = i1;
          i1 = i6;
        }
      }
    }
    while (true)
    {
      if (!this.t.isEmpty())
        invalidate();
      if (dispatchNestedScroll(i2, i1, i3, i4, this.an))
      {
        this.V -= this.an[0];
        this.W -= this.an[1];
        if (paramMotionEvent != null)
          paramMotionEvent.offsetLocation(this.an[0], this.an[1]);
        paramMotionEvent = this.ap;
        paramMotionEvent[0] += this.an[0];
        paramMotionEvent = this.ap;
        paramMotionEvent[1] += this.an[1];
      }
      while (true)
      {
        if ((i2 != 0) || (i1 != 0))
          h(i2, i1);
        if (!awakenScrollBars())
          invalidate();
        if ((i2 != 0) || (i1 != 0))
          i7 = 1;
        return i7;
        if (af.a(this) == 2)
          continue;
        if (paramMotionEvent != null)
          a(paramMotionEvent.getX(), i3, paramMotionEvent.getY(), i4);
        i(paramInt1, paramInt2);
      }
      i3 = 0;
      int i5 = 0;
      break label84;
      i2 = 0;
      i1 = 0;
      break;
      i1 = 0;
      i2 = 0;
      i5 = 0;
      i3 = 0;
    }
  }

  boolean a(AccessibilityEvent paramAccessibilityEvent)
  {
    int i3 = 0;
    int i2 = 0;
    if (j())
      if (paramAccessibilityEvent == null)
        break label46;
    label46: for (int i1 = android.support.v4.view.a.a.b(paramAccessibilityEvent); ; i1 = 0)
    {
      if (i1 == 0)
        i1 = i2;
      while (true)
      {
        this.D = (i1 | this.D);
        i3 = 1;
        return i3;
      }
    }
  }

  public void addFocusables(ArrayList<View> paramArrayList, int paramInt1, int paramInt2)
  {
    if ((this.f == null) || (!this.f.a(this, paramArrayList, paramInt1, paramInt2)))
      super.addFocusables(paramArrayList, paramInt1, paramInt2);
  }

  public View b(View paramView)
  {
    for (ViewParent localViewParent = paramView.getParent(); (localViewParent != null) && (localViewParent != this) && ((localViewParent instanceof View)); localViewParent = paramView.getParent())
      paramView = (View)localViewParent;
    if (localViewParent == this)
      return paramView;
    return null;
  }

  @Deprecated
  public u b(int paramInt)
  {
    return a(paramInt, false);
  }

  void b()
  {
    this.z += 1;
    if ((this.z == 1) && (!this.B))
      this.A = false;
  }

  public void b(g paramg)
  {
    if (this.f != null)
      this.f.a("Cannot remove item decoration during a scroll  or layout");
    this.t.remove(paramg);
    if (this.t.isEmpty())
      if (af.a(this) != 2)
        break label60;
    label60: for (boolean bool = true; ; bool = false)
    {
      setWillNotDraw(bool);
      l();
      requestLayout();
      return;
    }
  }

  public void b(j paramj)
  {
    if (this.H == null)
      return;
    this.H.remove(paramj);
  }

  public void b(k paramk)
  {
    this.u.remove(paramk);
    if (this.v == paramk)
      this.v = null;
  }

  public boolean b(int paramInt1, int paramInt2)
  {
    if (this.f == null)
      Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
    boolean bool2;
    int i1;
    do
    {
      do
        return false;
      while (this.B);
      bool1 = this.f.e();
      bool2 = this.f.f();
      if (bool1)
      {
        i1 = paramInt1;
        if (Math.abs(paramInt1) >= this.ab);
      }
      else
      {
        i1 = 0;
      }
      if (bool2)
      {
        paramInt1 = paramInt2;
        if (Math.abs(paramInt2) >= this.ab)
          continue;
      }
      paramInt1 = 0;
    }
    while (((i1 == 0) && (paramInt1 == 0)) || (dispatchNestedPreFling(i1, paramInt1)));
    if ((bool1) || (bool2));
    for (boolean bool1 = true; ; bool1 = false)
    {
      dispatchNestedFling(i1, paramInt1, bool1);
      if (!bool1)
        break;
      paramInt2 = Math.max(-this.ac, Math.min(i1, this.ac));
      paramInt1 = Math.max(-this.ac, Math.min(paramInt1, this.ac));
      this.ae.a(paramInt2, paramInt1);
      return true;
    }
  }

  public u c(View paramView)
  {
    paramView = b(paramView);
    if (paramView == null)
      return null;
    return a(paramView);
  }

  public void c()
  {
    setScrollState(0);
    v();
  }

  public void c(int paramInt)
  {
    int i2 = this.d.b();
    int i1 = 0;
    while (i1 < i2)
    {
      this.d.b(i1).offsetTopAndBottom(paramInt);
      i1 += 1;
    }
  }

  void c(int paramInt1, int paramInt2)
  {
    if (paramInt1 < 0)
    {
      d();
      this.M.a(-paramInt1);
      if (paramInt2 >= 0)
        break label69;
      f();
      this.N.a(-paramInt2);
    }
    while (true)
    {
      if ((paramInt1 != 0) || (paramInt2 != 0))
        af.d(this);
      return;
      if (paramInt1 <= 0)
        break;
      e();
      this.O.a(paramInt1);
      break;
      label69: if (paramInt2 <= 0)
        continue;
      g();
      this.P.a(paramInt2);
    }
  }

  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return ((paramLayoutParams instanceof i)) && (this.f.a((i)paramLayoutParams));
  }

  public int computeHorizontalScrollExtent()
  {
    if (this.f == null);
    do
      return 0;
    while (!this.f.e());
    return this.f.d(this.h);
  }

  public int computeHorizontalScrollOffset()
  {
    if (this.f == null);
    do
      return 0;
    while (!this.f.e());
    return this.f.b(this.h);
  }

  public int computeHorizontalScrollRange()
  {
    if (this.f == null);
    do
      return 0;
    while (!this.f.e());
    return this.f.f(this.h);
  }

  public int computeVerticalScrollExtent()
  {
    if (this.f == null);
    do
      return 0;
    while (!this.f.f());
    return this.f.e(this.h);
  }

  public int computeVerticalScrollOffset()
  {
    if (this.f == null);
    do
      return 0;
    while (!this.f.f());
    return this.f.c(this.h);
  }

  public int computeVerticalScrollRange()
  {
    if (this.f == null);
    do
      return 0;
    while (!this.f.f());
    return this.f.g(this.h);
  }

  void d()
  {
    if (this.M != null)
      return;
    this.M = new h(getContext());
    if (this.o)
      this.M.a(getMeasuredHeight() - getPaddingTop() - getPaddingBottom(), getMeasuredWidth() - getPaddingLeft() - getPaddingRight());
    while (true)
    {
      a(this.M);
      return;
      this.M.a(getMeasuredHeight(), getMeasuredWidth());
    }
  }

  public void d(int paramInt)
  {
    int i2 = this.d.b();
    int i1 = 0;
    while (i1 < i2)
    {
      this.d.b(i1).offsetLeftAndRight(paramInt);
      i1 += 1;
    }
  }

  void d(int paramInt1, int paramInt2)
  {
    setMeasuredDimension(h.a(paramInt1, getPaddingLeft() + getPaddingRight(), af.n(this)), h.a(paramInt2, getPaddingTop() + getPaddingBottom(), af.o(this)));
  }

  public boolean dispatchNestedFling(float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    return getScrollingChildHelper().a(paramFloat1, paramFloat2, paramBoolean);
  }

  public boolean dispatchNestedPreFling(float paramFloat1, float paramFloat2)
  {
    return getScrollingChildHelper().a(paramFloat1, paramFloat2);
  }

  public boolean dispatchNestedPreScroll(int paramInt1, int paramInt2, int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    return getScrollingChildHelper().a(paramInt1, paramInt2, paramArrayOfInt1, paramArrayOfInt2);
  }

  public boolean dispatchNestedScroll(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfInt)
  {
    return getScrollingChildHelper().a(paramInt1, paramInt2, paramInt3, paramInt4, paramArrayOfInt);
  }

  protected void dispatchRestoreInstanceState(SparseArray<Parcelable> paramSparseArray)
  {
    dispatchThawSelfOnly(paramSparseArray);
  }

  protected void dispatchSaveInstanceState(SparseArray<Parcelable> paramSparseArray)
  {
    dispatchFreezeSelfOnly(paramSparseArray);
  }

  public void draw(Canvas paramCanvas)
  {
    int i3 = 1;
    int i4 = 0;
    super.draw(paramCanvas);
    int i2 = this.t.size();
    int i1 = 0;
    while (i1 < i2)
    {
      ((g)this.t.get(i1)).b(paramCanvas, this, this.h);
      i1 += 1;
    }
    int i5;
    if ((this.M != null) && (!this.M.a()))
    {
      i5 = paramCanvas.save();
      if (this.o)
      {
        i1 = getPaddingBottom();
        paramCanvas.rotate(270.0F);
        paramCanvas.translate(i1 + -getHeight(), 0.0F);
        if ((this.M == null) || (!this.M.a(paramCanvas)))
          break label466;
        i2 = 1;
        label128: paramCanvas.restoreToCount(i5);
      }
    }
    while (true)
    {
      i1 = i2;
      if (this.N != null)
      {
        i1 = i2;
        if (!this.N.a())
        {
          i5 = paramCanvas.save();
          if (this.o)
            paramCanvas.translate(getPaddingLeft(), getPaddingTop());
          paramCanvas.translate(0.0F, this.K);
          if ((this.N == null) || (!this.N.a(paramCanvas)))
            break label471;
          i1 = 1;
          label212: i1 = i2 | i1;
          paramCanvas.restoreToCount(i5);
        }
      }
      i2 = i1;
      if (this.O != null)
      {
        i2 = i1;
        if (!this.O.a())
        {
          i5 = paramCanvas.save();
          int i6 = getWidth();
          if (!this.o)
            break label476;
          i2 = getPaddingTop();
          label267: paramCanvas.rotate(90.0F);
          paramCanvas.translate(-i2, -i6);
          if ((this.O == null) || (!this.O.a(paramCanvas)))
            break label481;
          i2 = 1;
          label305: i2 = i1 | i2;
          paramCanvas.restoreToCount(i5);
        }
      }
      i1 = i2;
      if (this.P != null)
      {
        i1 = i2;
        if (!this.P.a())
        {
          i5 = paramCanvas.save();
          paramCanvas.rotate(180.0F);
          if (!this.o)
            break label486;
          paramCanvas.translate(-getWidth() + getPaddingRight(), -getHeight() + getPaddingBottom());
          label382: i1 = i4;
          if (this.P != null)
          {
            i1 = i4;
            if (this.P.a(paramCanvas))
              i1 = 1;
          }
          i1 = i2 | i1;
          paramCanvas.restoreToCount(i5);
        }
      }
      if ((i1 == 0) && (this.g != null) && (this.t.size() > 0) && (this.g.b()))
        i1 = i3;
      while (true)
      {
        if (i1 != 0)
          af.d(this);
        return;
        i1 = 0;
        break;
        label466: i2 = 0;
        break label128;
        label471: i1 = 0;
        break label212;
        label476: i2 = 0;
        break label267;
        label481: i2 = 0;
        break label305;
        label486: paramCanvas.translate(-getWidth(), -getHeight());
        break label382;
      }
      i2 = 0;
    }
  }

  public boolean drawChild(Canvas paramCanvas, View paramView, long paramLong)
  {
    return super.drawChild(paramCanvas, paramView, paramLong);
  }

  @Deprecated
  public int e(View paramView)
  {
    return f(paramView);
  }

  void e()
  {
    if (this.O != null)
      return;
    this.O = new h(getContext());
    if (this.o)
      this.O.a(getMeasuredHeight() - getPaddingTop() - getPaddingBottom(), getMeasuredWidth() - getPaddingLeft() - getPaddingRight());
    while (true)
    {
      a(this.O);
      return;
      this.O.a(getMeasuredHeight(), getMeasuredWidth());
    }
  }

  public void e(int paramInt)
  {
  }

  void e(int paramInt1, int paramInt2)
  {
    int i5 = this.d.c();
    int i1;
    int i2;
    int i3;
    if (paramInt1 < paramInt2)
    {
      i1 = -1;
      i2 = paramInt2;
      i3 = paramInt1;
    }
    while (true)
    {
      int i4 = 0;
      u localu;
      while (true)
      {
        if (i4 >= i5)
          break label131;
        localu = d(this.d.c(i4));
        if ((localu == null) || (localu.b < i3) || (localu.b > i2))
        {
          i4 += 1;
          continue;
          i1 = 1;
          i2 = paramInt1;
          i3 = paramInt2;
          break;
        }
      }
      if (localu.b == paramInt1)
        localu.a(paramInt2 - paramInt1, false);
      while (true)
      {
        r.a(this.h, true);
        break;
        localu.a(i1, false);
      }
    }
    label131: this.b.a(paramInt1, paramInt2);
    requestLayout();
  }

  public int f(View paramView)
  {
    paramView = d(paramView);
    if (paramView != null)
      return paramView.e();
    return -1;
  }

  void f()
  {
    if (this.N != null)
      return;
    this.N = new h(getContext());
    if (this.o)
      this.N.a(getMeasuredWidth() - getPaddingLeft() - getPaddingRight(), getMeasuredHeight() - getPaddingTop() - getPaddingBottom());
    while (true)
    {
      a(this.N);
      return;
      this.N.a(getMeasuredWidth(), getMeasuredHeight());
    }
  }

  void f(int paramInt)
  {
    if (this.f != null)
      this.f.k(paramInt);
    e(paramInt);
    if (this.af != null)
      this.af.a(this, paramInt);
    if (this.ag != null)
    {
      int i1 = this.ag.size() - 1;
      while (i1 >= 0)
      {
        ((l)this.ag.get(i1)).a(this, paramInt);
        i1 -= 1;
      }
    }
  }

  void f(int paramInt1, int paramInt2)
  {
    int i2 = this.d.c();
    int i1 = 0;
    while (i1 < i2)
    {
      u localu = d(this.d.c(i1));
      if ((localu != null) && (!localu.c()) && (localu.b >= paramInt1))
      {
        localu.a(paramInt2, false);
        r.a(this.h, true);
      }
      i1 += 1;
    }
    this.b.b(paramInt1, paramInt2);
    requestLayout();
  }

  public View focusSearch(View paramView, int paramInt)
  {
    Object localObject2 = this.f.d(paramView, paramInt);
    if (localObject2 != null);
    Object localObject1;
    do
    {
      return localObject2;
      localObject2 = FocusFinder.getInstance().findNextFocus(this, paramView, paramInt);
      localObject1 = localObject2;
      if (localObject2 == null)
      {
        localObject1 = localObject2;
        if (this.r != null)
        {
          localObject1 = localObject2;
          if (this.f != null)
          {
            localObject1 = localObject2;
            if (!j())
            {
              localObject1 = localObject2;
              if (!this.B)
              {
                b();
                localObject1 = this.f.a(paramView, paramInt, this.b, this.h);
                a(false);
              }
            }
          }
        }
      }
      localObject2 = localObject1;
    }
    while (localObject1 != null);
    return (View)(View)super.focusSearch(paramView, paramInt);
  }

  public int g(View paramView)
  {
    paramView = d(paramView);
    if (paramView != null)
      return paramView.d();
    return -1;
  }

  void g()
  {
    if (this.P != null)
      return;
    this.P = new h(getContext());
    if (this.o)
      this.P.a(getMeasuredWidth() - getPaddingLeft() - getPaddingRight(), getMeasuredHeight() - getPaddingTop() - getPaddingBottom());
    while (true)
    {
      a(this.P);
      return;
      this.P.a(getMeasuredWidth(), getMeasuredHeight());
    }
  }

  public void g(int paramInt1, int paramInt2)
  {
  }

  protected ViewGroup.LayoutParams generateDefaultLayoutParams()
  {
    if (this.f == null)
      throw new IllegalStateException("RecyclerView has no LayoutManager");
    return this.f.a();
  }

  public ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    if (this.f == null)
      throw new IllegalStateException("RecyclerView has no LayoutManager");
    return this.f.a(getContext(), paramAttributeSet);
  }

  protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    if (this.f == null)
      throw new IllegalStateException("RecyclerView has no LayoutManager");
    return this.f.a(paramLayoutParams);
  }

  public a getAdapter()
  {
    return this.r;
  }

  public int getBaseline()
  {
    if (this.f != null)
      return this.f.s();
    return super.getBaseline();
  }

  protected int getChildDrawingOrder(int paramInt1, int paramInt2)
  {
    if (this.ak == null)
      return super.getChildDrawingOrder(paramInt1, paramInt2);
    return this.ak.a(paramInt1, paramInt2);
  }

  public g getCompatAccessibilityDelegate()
  {
    return this.aj;
  }

  public e getItemAnimator()
  {
    return this.g;
  }

  public h getLayoutManager()
  {
    return this.f;
  }

  public int getMaxFlingVelocity()
  {
    return this.ac;
  }

  public int getMinFlingVelocity()
  {
    return this.ab;
  }

  public m getRecycledViewPool()
  {
    return this.b.f();
  }

  public int getScrollState()
  {
    return this.Q;
  }

  void h()
  {
    this.P = null;
    this.N = null;
    this.O = null;
    this.M = null;
  }

  void h(int paramInt1, int paramInt2)
  {
    int i1 = getScrollX();
    int i2 = getScrollY();
    onScrollChanged(i1, i2, i1, i2);
    g(paramInt1, paramInt2);
    if (this.af != null)
      this.af.a(this, paramInt1, paramInt2);
    if (this.ag != null)
    {
      i1 = this.ag.size() - 1;
      while (i1 >= 0)
      {
        ((l)this.ag.get(i1)).a(this, paramInt1, paramInt2);
        i1 -= 1;
      }
    }
  }

  public void h(View paramView)
  {
  }

  public boolean hasNestedScrollingParent()
  {
    return getScrollingChildHelper().b();
  }

  public void i(View paramView)
  {
  }

  boolean i()
  {
    return (this.G != null) && (this.G.isEnabled());
  }

  public boolean isAttachedToWindow()
  {
    return this.w;
  }

  public boolean isNestedScrollingEnabled()
  {
    return getScrollingChildHelper().a();
  }

  Rect j(View paramView)
  {
    i locali = (i)paramView.getLayoutParams();
    if (!locali.c)
      return locali.b;
    Rect localRect = locali.b;
    localRect.set(0, 0, 0, 0);
    int i2 = this.t.size();
    int i1 = 0;
    while (i1 < i2)
    {
      this.q.set(0, 0, 0, 0);
      ((g)this.t.get(i1)).a(this.q, paramView, this, this.h);
      localRect.left += this.q.left;
      localRect.top += this.q.top;
      localRect.right += this.q.right;
      localRect.bottom += this.q.bottom;
      i1 += 1;
    }
    locali.c = false;
    return localRect;
  }

  public boolean j()
  {
    return this.J > 0;
  }

  void k()
  {
    if (this.r == null)
    {
      Log.e("RecyclerView", "No adapter attached; skipping layout");
      return;
    }
    if (this.f == null)
    {
      Log.e("RecyclerView", "No layout manager attached; skipping layout");
      return;
    }
    r.b(this.h, false);
    if (r.b(this.h) == 1)
    {
      F();
      this.f.f(this);
      G();
    }
    while (true)
    {
      H();
      return;
      if ((this.c.f()) || (this.f.w() != getWidth()) || (this.f.x() != getHeight()))
      {
        this.f.f(this);
        G();
        continue;
      }
      this.f.f(this);
    }
  }

  void l()
  {
    int i2 = this.d.c();
    int i1 = 0;
    while (i1 < i2)
    {
      ((i)this.d.c(i1).getLayoutParams()).c = true;
      i1 += 1;
    }
    this.b.j();
  }

  void m()
  {
    int i2 = this.d.c();
    int i1 = 0;
    while (i1 < i2)
    {
      u localu = d(this.d.c(i1));
      if (!localu.c())
        localu.b();
      i1 += 1;
    }
  }

  void n()
  {
    int i2 = this.d.c();
    int i1 = 0;
    while (i1 < i2)
    {
      u localu = d(this.d.c(i1));
      if (!localu.c())
        localu.a();
      i1 += 1;
    }
    this.b.i();
  }

  void o()
  {
    int i2 = this.d.c();
    int i1 = 0;
    while (i1 < i2)
    {
      u localu = d(this.d.c(i1));
      if ((localu != null) && (!localu.c()))
        localu.b(6);
      i1 += 1;
    }
    l();
    this.b.h();
  }

  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    this.J = 0;
    this.w = true;
    this.y = false;
    if (this.f != null)
      this.f.c(this);
    this.ai = false;
  }

  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    if (this.g != null)
      this.g.c();
    this.y = false;
    c();
    this.w = false;
    if (this.f != null)
      this.f.b(this, this.b);
    removeCallbacks(this.aq);
    this.e.b();
  }

  public void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    int i2 = this.t.size();
    int i1 = 0;
    while (i1 < i2)
    {
      ((g)this.t.get(i1)).a(paramCanvas, this, this.h);
      i1 += 1;
    }
  }

  public boolean onGenericMotionEvent(MotionEvent paramMotionEvent)
  {
    if (this.f == null);
    label110: label113: 
    while (true)
    {
      return false;
      if ((this.B) || ((android.support.v4.view.t.c(paramMotionEvent) & 0x2) == 0) || (paramMotionEvent.getAction() != 8))
        continue;
      float f1;
      float f2;
      if (this.f.f())
      {
        f1 = -android.support.v4.view.t.e(paramMotionEvent, 9);
        if (!this.f.e())
          break label110;
        f2 = android.support.v4.view.t.e(paramMotionEvent, 10);
      }
      while (true)
      {
        if ((f1 == 0.0F) && (f2 == 0.0F))
          break label113;
        float f3 = getScrollFactor();
        a((int)(f2 * f3), (int)(f1 * f3), paramMotionEvent);
        return false;
        f1 = 0.0F;
        break;
        f2 = 0.0F;
      }
    }
  }

  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    int i3 = -1;
    int i6 = 1;
    if (this.B);
    do
    {
      return false;
      if (!a(paramMotionEvent))
        continue;
      y();
      return true;
    }
    while (this.f == null);
    boolean bool1 = this.f.e();
    boolean bool2 = this.f.f();
    if (this.S == null)
      this.S = VelocityTracker.obtain();
    this.S.addMovement(paramMotionEvent);
    int i2 = android.support.v4.view.t.a(paramMotionEvent);
    int i1 = android.support.v4.view.t.b(paramMotionEvent);
    switch (i2)
    {
    case 4:
    default:
      if (this.Q != 1)
        break;
      return i6;
    case 0:
      label136: if (this.C)
        this.C = false;
      this.R = android.support.v4.view.t.b(paramMotionEvent, 0);
      i1 = (int)(paramMotionEvent.getX() + 0.5F);
      this.V = i1;
      this.T = i1;
      i1 = (int)(paramMotionEvent.getY() + 0.5F);
      this.W = i1;
      this.U = i1;
      if (this.Q == 2)
      {
        getParent().requestDisallowInterceptTouchEvent(true);
        setScrollState(1);
      }
      paramMotionEvent = this.ap;
      this.ap[1] = 0;
      paramMotionEvent[0] = 0;
      if (!bool1);
    case 5:
    case 2:
    case 6:
    case 1:
    case 3:
    }
    for (i1 = 1; ; i1 = 0)
    {
      i2 = i1;
      if (bool2)
        i2 = i1 | 0x2;
      startNestedScroll(i2);
      break;
      this.R = android.support.v4.view.t.b(paramMotionEvent, i1);
      i2 = (int)(android.support.v4.view.t.c(paramMotionEvent, i1) + 0.5F);
      this.V = i2;
      this.T = i2;
      i1 = (int)(android.support.v4.view.t.d(paramMotionEvent, i1) + 0.5F);
      this.W = i1;
      this.U = i1;
      break;
      i2 = android.support.v4.view.t.a(paramMotionEvent, this.R);
      if (i2 < 0)
      {
        Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.R + " not found. Did any MotionEvents get skipped?");
        return false;
      }
      i1 = (int)(android.support.v4.view.t.c(paramMotionEvent, i2) + 0.5F);
      i2 = (int)(android.support.v4.view.t.d(paramMotionEvent, i2) + 0.5F);
      if (this.Q == 1)
        break;
      i1 -= this.T;
      int i4 = i2 - this.U;
      int i5;
      if ((bool1) && (Math.abs(i1) > this.aa))
      {
        i2 = this.T;
        i5 = this.aa;
        if (i1 < 0)
        {
          i1 = -1;
          label449: this.V = (i1 * i5 + i2);
        }
      }
      for (i1 = 1; ; i1 = 0)
      {
        i2 = i1;
        if (bool2)
        {
          i2 = i1;
          if (Math.abs(i4) > this.aa)
          {
            i2 = this.U;
            i5 = this.aa;
            if (i4 >= 0)
              break label530;
          }
        }
        label530: for (i1 = i3; ; i1 = 1)
        {
          this.W = (i2 + i1 * i5);
          i2 = 1;
          if (i2 == 0)
            break;
          setScrollState(1);
          break;
          i1 = 1;
          break label449;
        }
        c(paramMotionEvent);
        break;
        this.S.clear();
        stopNestedScroll();
        break;
        y();
        break;
        i6 = 0;
        break label136;
      }
    }
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    android.support.v4.e.j.a("RV OnLayout");
    k();
    android.support.v4.e.j.a();
    this.y = true;
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i2 = 0;
    if (this.f == null)
      d(paramInt1, paramInt2);
    while (true)
    {
      return;
      if (!h.a(this.f))
        break;
      int i3 = View.MeasureSpec.getMode(paramInt1);
      int i4 = View.MeasureSpec.getMode(paramInt2);
      int i1 = i2;
      if (i3 == 1073741824)
      {
        i1 = i2;
        if (i4 == 1073741824)
          i1 = 1;
      }
      this.f.a(this.b, this.h, paramInt1, paramInt2);
      if ((i1 != 0) || (this.r == null))
        continue;
      if (r.b(this.h) == 1)
        F();
      this.f.b(paramInt1, paramInt2);
      r.b(this.h, true);
      G();
      this.f.c(paramInt1, paramInt2);
      if (!this.f.l())
        continue;
      this.f.b(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
      r.b(this.h, true);
      G();
      this.f.c(paramInt1, paramInt2);
      return;
    }
    if (this.x)
    {
      this.f.a(this.b, this.h, paramInt1, paramInt2);
      return;
    }
    if (this.E)
    {
      b();
      E();
      if (r.c(this.h))
      {
        r.c(this.h, true);
        this.E = false;
        a(false);
      }
    }
    else
    {
      if (this.r == null)
        break label342;
    }
    label342: for (this.h.a = this.r.a(); ; this.h.a = 0)
    {
      b();
      this.f.a(this.b, this.h, paramInt1, paramInt2);
      a(false);
      r.c(this.h, false);
      return;
      this.c.e();
      r.c(this.h, false);
      break;
    }
  }

  protected void onRestoreInstanceState(Parcelable paramParcelable)
  {
    if (!(paramParcelable instanceof SavedState))
      super.onRestoreInstanceState(paramParcelable);
    do
    {
      return;
      this.n = ((SavedState)paramParcelable);
      super.onRestoreInstanceState(this.n.getSuperState());
    }
    while ((this.f == null) || (this.n.a == null));
    this.f.a(this.n.a);
  }

  protected Parcelable onSaveInstanceState()
  {
    SavedState localSavedState = new SavedState(super.onSaveInstanceState());
    if (this.n != null)
    {
      SavedState.a(localSavedState, this.n);
      return localSavedState;
    }
    if (this.f != null)
    {
      localSavedState.a = this.f.d();
      return localSavedState;
    }
    localSavedState.a = null;
    return localSavedState;
  }

  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if ((paramInt1 != paramInt3) || (paramInt2 != paramInt4))
      h();
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int i7 = 0;
    if ((this.B) || (this.C));
    do
    {
      return false;
      if (!b(paramMotionEvent))
        continue;
      y();
      return true;
    }
    while (this.f == null);
    boolean bool1 = this.f.e();
    boolean bool2 = this.f.f();
    if (this.S == null)
      this.S = VelocityTracker.obtain();
    MotionEvent localMotionEvent = MotionEvent.obtain(paramMotionEvent);
    int i3 = android.support.v4.view.t.a(paramMotionEvent);
    int i2 = android.support.v4.view.t.b(paramMotionEvent);
    if (i3 == 0)
    {
      int[] arrayOfInt = this.ap;
      this.ap[1] = 0;
      arrayOfInt[0] = 0;
    }
    localMotionEvent.offsetLocation(this.ap[0], this.ap[1]);
    int i1 = i7;
    switch (i3)
    {
    default:
      i1 = i7;
    case 4:
      if (i1 == 0)
        this.S.addMovement(localMotionEvent);
      localMotionEvent.recycle();
      return true;
    case 0:
      this.R = android.support.v4.view.t.b(paramMotionEvent, 0);
      i1 = (int)(paramMotionEvent.getX() + 0.5F);
      this.V = i1;
      this.T = i1;
      i1 = (int)(paramMotionEvent.getY() + 0.5F);
      this.W = i1;
      this.U = i1;
      if (!bool1)
        break;
    case 5:
    case 2:
    case 6:
    case 1:
    case 3:
    }
    label662: label734: label863: for (i1 = 1; ; i1 = 0)
    {
      i2 = i1;
      if (bool2)
        i2 = i1 | 0x2;
      startNestedScroll(i2);
      i1 = i7;
      break;
      this.R = android.support.v4.view.t.b(paramMotionEvent, i2);
      i1 = (int)(android.support.v4.view.t.c(paramMotionEvent, i2) + 0.5F);
      this.V = i1;
      this.T = i1;
      i1 = (int)(android.support.v4.view.t.d(paramMotionEvent, i2) + 0.5F);
      this.W = i1;
      this.U = i1;
      i1 = i7;
      break;
      i1 = android.support.v4.view.t.a(paramMotionEvent, this.R);
      if (i1 < 0)
      {
        Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.R + " not found. Did any MotionEvents get skipped?");
        return false;
      }
      int i8 = (int)(android.support.v4.view.t.c(paramMotionEvent, i1) + 0.5F);
      int i9 = (int)(android.support.v4.view.t.d(paramMotionEvent, i1) + 0.5F);
      int i4 = this.V - i8;
      i3 = this.W - i9;
      i1 = i3;
      i2 = i4;
      if (dispatchNestedPreScroll(i4, i3, this.ao, this.an))
      {
        i2 = i4 - this.ao[0];
        i1 = i3 - this.ao[1];
        localMotionEvent.offsetLocation(this.an[0], this.an[1]);
        paramMotionEvent = this.ap;
        paramMotionEvent[0] += this.an[0];
        paramMotionEvent = this.ap;
        paramMotionEvent[1] += this.an[1];
      }
      i3 = i1;
      i4 = i2;
      if (this.Q != 1)
      {
        if ((!bool1) || (Math.abs(i2) <= this.aa))
          break label940;
        if (i2 <= 0)
          break label773;
        i2 -= this.aa;
      }
      label612: for (i3 = 1; ; i3 = 0)
      {
        int i5 = i1;
        int i6 = i3;
        if (bool2)
        {
          i5 = i1;
          i6 = i3;
          if (Math.abs(i1) > this.aa)
          {
            if (i1 <= 0)
              break label785;
            i5 = i1 - this.aa;
            i6 = 1;
          }
        }
        i3 = i5;
        i4 = i2;
        if (i6 != 0)
        {
          setScrollState(1);
          i4 = i2;
          i3 = i5;
        }
        i1 = i7;
        if (this.Q != 1)
          break;
        this.V = (i8 - this.an[0]);
        this.W = (i9 - this.an[1]);
        if (bool1)
          if (!bool2)
            break label803;
        while (true)
        {
          i1 = i7;
          if (!a(i4, i3, localMotionEvent))
            break;
          getParent().requestDisallowInterceptTouchEvent(true);
          i1 = i7;
          break;
          i2 += this.aa;
          break label612;
          i5 = i1 + this.aa;
          break label662;
          i4 = 0;
          break label734;
          i3 = 0;
        }
        c(paramMotionEvent);
        i1 = i7;
        break;
        this.S.addMovement(localMotionEvent);
        this.S.computeCurrentVelocity(1000, this.ac);
        float f1;
        float f2;
        if (bool1)
        {
          f1 = -ad.a(this.S, this.R);
          if (!bool2)
            break label924;
          f2 = -ad.b(this.S, this.R);
        }
        while (true)
        {
          if (((f1 == 0.0F) && (f2 == 0.0F)) || (!b((int)f1, (int)f2)))
            setScrollState(0);
          x();
          i1 = 1;
          break;
          f1 = 0.0F;
          break label863;
          f2 = 0.0F;
        }
        y();
        i1 = i7;
        break;
      }
    }
  }

  public boolean p()
  {
    return (!this.y) || (this.I) || (this.c.d());
  }

  protected void removeDetachedView(View paramView, boolean paramBoolean)
  {
    u localu = d(paramView);
    if (localu != null)
    {
      if (!localu.r())
        break label32;
      localu.m();
    }
    label32: 
    do
    {
      l(paramView);
      super.removeDetachedView(paramView, paramBoolean);
      return;
    }
    while (localu.c());
    throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + localu);
  }

  public void requestChildFocus(View paramView1, View paramView2)
  {
    Object localObject;
    if ((!this.f.a(this, this.h, paramView1, paramView2)) && (paramView2 != null))
    {
      this.q.set(0, 0, paramView2.getWidth(), paramView2.getHeight());
      localObject = paramView2.getLayoutParams();
      if ((localObject instanceof i))
      {
        localObject = (i)localObject;
        if (!((i)localObject).c)
        {
          localObject = ((i)localObject).b;
          Rect localRect = this.q;
          localRect.left -= ((Rect)localObject).left;
          localRect = this.q;
          localRect.right += ((Rect)localObject).right;
          localRect = this.q;
          localRect.top -= ((Rect)localObject).top;
          localRect = this.q;
          int i1 = localRect.bottom;
          localRect.bottom = (((Rect)localObject).bottom + i1);
        }
      }
      offsetDescendantRectToMyCoords(paramView2, this.q);
      offsetRectIntoDescendantCoords(paramView1, this.q);
      localObject = this.q;
      if (this.y)
        break label215;
    }
    label215: for (boolean bool = true; ; bool = false)
    {
      requestChildRectangleOnScreen(paramView1, (Rect)localObject, bool);
      super.requestChildFocus(paramView1, paramView2);
      return;
    }
  }

  public boolean requestChildRectangleOnScreen(View paramView, Rect paramRect, boolean paramBoolean)
  {
    return this.f.a(this, paramView, paramRect, paramBoolean);
  }

  public void requestDisallowInterceptTouchEvent(boolean paramBoolean)
  {
    int i2 = this.u.size();
    int i1 = 0;
    while (i1 < i2)
    {
      ((k)this.u.get(i1)).a(paramBoolean);
      i1 += 1;
    }
    super.requestDisallowInterceptTouchEvent(paramBoolean);
  }

  public void requestLayout()
  {
    if ((this.z == 0) && (!this.B))
    {
      super.requestLayout();
      return;
    }
    this.A = true;
  }

  public void scrollBy(int paramInt1, int paramInt2)
  {
    if (this.f == null);
    boolean bool1;
    boolean bool2;
    do
    {
      Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
      do
        return;
      while (this.B);
      bool1 = this.f.e();
      bool2 = this.f.f();
    }
    while ((!bool1) && (!bool2));
    if (bool1)
      if (!bool2)
        break label74;
    while (true)
    {
      a(paramInt1, paramInt2, null);
      return;
      paramInt1 = 0;
      break;
      label74: paramInt2 = 0;
    }
  }

  public void scrollTo(int paramInt1, int paramInt2)
  {
    Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
  }

  public void sendAccessibilityEventUnchecked(AccessibilityEvent paramAccessibilityEvent)
  {
    if (a(paramAccessibilityEvent))
      return;
    super.sendAccessibilityEventUnchecked(paramAccessibilityEvent);
  }

  public void setAccessibilityDelegateCompat(g paramg)
  {
    this.aj = paramg;
    af.a(this, this.aj);
  }

  public void setAdapter(a parama)
  {
    c();
    setLayoutFrozen(false);
    a(parama, false, true);
    requestLayout();
  }

  public void setChildDrawingOrderCallback(d paramd)
  {
    if (paramd == this.ak)
      return;
    this.ak = paramd;
    if (this.ak != null);
    for (boolean bool = true; ; bool = false)
    {
      setChildrenDrawingOrderEnabled(bool);
      return;
    }
  }

  public void setClipToPadding(boolean paramBoolean)
  {
    if (paramBoolean != this.o)
      h();
    this.o = paramBoolean;
    super.setClipToPadding(paramBoolean);
    if (this.y)
      requestLayout();
  }

  public void setGlowColor(int paramInt)
  {
    this.L = paramInt;
  }

  public void setHasFixedSize(boolean paramBoolean)
  {
    this.x = paramBoolean;
  }

  public void setItemAnimator(e parame)
  {
    if (this.g != null)
    {
      this.g.c();
      this.g.a(null);
    }
    this.g = parame;
    if (this.g != null)
      this.g.a(this.ah);
  }

  public void setItemViewCacheSize(int paramInt)
  {
    this.b.a(paramInt);
  }

  public void setLayoutFrozen(boolean paramBoolean)
  {
    if (paramBoolean != this.B)
    {
      a("Do not setLayoutFrozen in layout or scroll");
      if (!paramBoolean)
      {
        this.B = false;
        if ((this.A) && (this.f != null) && (this.r != null))
          requestLayout();
        this.A = false;
      }
    }
    else
    {
      return;
    }
    long l1 = SystemClock.uptimeMillis();
    onTouchEvent(MotionEvent.obtain(l1, l1, 3, 0.0F, 0.0F, 0));
    this.B = true;
    this.C = true;
    c();
  }

  public void setLayoutManager(h paramh)
  {
    if (paramh == this.f)
      return;
    c();
    if (this.f != null)
    {
      if (this.w)
        this.f.b(this, this.b);
      this.f.b(null);
    }
    this.b.a();
    this.d.a();
    this.f = paramh;
    if (paramh != null)
    {
      if (paramh.q != null)
        throw new IllegalArgumentException("LayoutManager " + paramh + " is already attached to a RecyclerView: " + paramh.q);
      this.f.b(this);
      if (this.w)
        this.f.c(this);
    }
    requestLayout();
  }

  public void setNestedScrollingEnabled(boolean paramBoolean)
  {
    getScrollingChildHelper().a(paramBoolean);
  }

  @Deprecated
  public void setOnScrollListener(l paraml)
  {
    this.af = paraml;
  }

  public void setRecycledViewPool(m paramm)
  {
    this.b.a(paramm);
  }

  public void setRecyclerListener(o paramo)
  {
    this.s = paramo;
  }

  public void setScrollingTouchSlop(int paramInt)
  {
    ViewConfiguration localViewConfiguration = ViewConfiguration.get(getContext());
    switch (paramInt)
    {
    default:
      Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + paramInt + "; using default value");
    case 0:
      this.aa = localViewConfiguration.getScaledTouchSlop();
      return;
    case 1:
    }
    this.aa = ap.a(localViewConfiguration);
  }

  public void setTopGlowOffset(int paramInt)
  {
    this.K = paramInt;
  }

  public void setViewCacheExtension(s params)
  {
    this.b.a(params);
  }

  public boolean startNestedScroll(int paramInt)
  {
    return getScrollingChildHelper().a(paramInt);
  }

  public void stopNestedScroll()
  {
    getScrollingChildHelper().c();
  }

  public static class SavedState extends View.BaseSavedState
  {
    public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator()
    {
      public RecyclerView.SavedState a(Parcel paramParcel)
      {
        return new RecyclerView.SavedState(paramParcel);
      }

      public RecyclerView.SavedState[] a(int paramInt)
      {
        return new RecyclerView.SavedState[paramInt];
      }
    };
    Parcelable a;

    SavedState(Parcel paramParcel)
    {
      super();
      this.a = paramParcel.readParcelable(RecyclerView.h.class.getClassLoader());
    }

    SavedState(Parcelable paramParcelable)
    {
      super();
    }

    private void a(SavedState paramSavedState)
    {
      this.a = paramSavedState.a;
    }

    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      super.writeToParcel(paramParcel, paramInt);
      paramParcel.writeParcelable(this.a, 0);
    }
  }

  public static abstract class a<VH extends RecyclerView.u>
  {
    private final RecyclerView.b a = new RecyclerView.b();
    private boolean b = false;

    public abstract int a();

    public int a(int paramInt)
    {
      return 0;
    }

    public abstract VH a(ViewGroup paramViewGroup, int paramInt);

    public void a(int paramInt1, int paramInt2)
    {
      this.a.a(paramInt1, paramInt2);
    }

    public void a(RecyclerView.c paramc)
    {
      this.a.registerObserver(paramc);
    }

    public void a(VH paramVH)
    {
    }

    public abstract void a(VH paramVH, int paramInt);

    public void a(VH paramVH, int paramInt, List<Object> paramList)
    {
      a(paramVH, paramInt);
    }

    public void a(RecyclerView paramRecyclerView)
    {
    }

    public long b(int paramInt)
    {
      return -1L;
    }

    public final VH b(ViewGroup paramViewGroup, int paramInt)
    {
      android.support.v4.e.j.a("RV CreateView");
      paramViewGroup = a(paramViewGroup, paramInt);
      paramViewGroup.e = paramInt;
      android.support.v4.e.j.a();
      return paramViewGroup;
    }

    public void b(int paramInt1, int paramInt2)
    {
      this.a.d(paramInt1, paramInt2);
    }

    public void b(RecyclerView.c paramc)
    {
      this.a.unregisterObserver(paramc);
    }

    public final void b(VH paramVH, int paramInt)
    {
      paramVH.b = paramInt;
      if (b())
        paramVH.d = b(paramInt);
      paramVH.a(1, 519);
      android.support.v4.e.j.a("RV OnBindView");
      a(paramVH, paramInt, paramVH.u());
      paramVH.t();
      android.support.v4.e.j.a();
    }

    public void b(RecyclerView paramRecyclerView)
    {
    }

    public final boolean b()
    {
      return this.b;
    }

    public boolean b(VH paramVH)
    {
      return false;
    }

    public void c()
    {
      this.a.a();
    }

    public void c(int paramInt)
    {
      this.a.a(paramInt, 1);
    }

    public void c(int paramInt1, int paramInt2)
    {
      this.a.b(paramInt1, paramInt2);
    }

    public void c(VH paramVH)
    {
    }

    public void d(int paramInt)
    {
      this.a.c(paramInt, 1);
    }

    public void d(VH paramVH)
    {
    }
  }

  static class b extends Observable<RecyclerView.c>
  {
    public void a()
    {
      int i = this.mObservers.size() - 1;
      while (i >= 0)
      {
        ((RecyclerView.c)this.mObservers.get(i)).a();
        i -= 1;
      }
    }

    public void a(int paramInt1, int paramInt2)
    {
      a(paramInt1, paramInt2, null);
    }

    public void a(int paramInt1, int paramInt2, Object paramObject)
    {
      int i = this.mObservers.size() - 1;
      while (i >= 0)
      {
        ((RecyclerView.c)this.mObservers.get(i)).a(paramInt1, paramInt2, paramObject);
        i -= 1;
      }
    }

    public void b(int paramInt1, int paramInt2)
    {
      int i = this.mObservers.size() - 1;
      while (i >= 0)
      {
        ((RecyclerView.c)this.mObservers.get(i)).b(paramInt1, paramInt2);
        i -= 1;
      }
    }

    public void c(int paramInt1, int paramInt2)
    {
      int i = this.mObservers.size() - 1;
      while (i >= 0)
      {
        ((RecyclerView.c)this.mObservers.get(i)).c(paramInt1, paramInt2);
        i -= 1;
      }
    }

    public void d(int paramInt1, int paramInt2)
    {
      int i = this.mObservers.size() - 1;
      while (i >= 0)
      {
        ((RecyclerView.c)this.mObservers.get(i)).a(paramInt1, paramInt2, 1);
        i -= 1;
      }
    }
  }

  public static abstract class c
  {
    public void a()
    {
    }

    public void a(int paramInt1, int paramInt2)
    {
    }

    public void a(int paramInt1, int paramInt2, int paramInt3)
    {
    }

    public void a(int paramInt1, int paramInt2, Object paramObject)
    {
      a(paramInt1, paramInt2);
    }

    public void b(int paramInt1, int paramInt2)
    {
    }

    public void c(int paramInt1, int paramInt2)
    {
    }
  }

  public static abstract interface d
  {
    public abstract int a(int paramInt1, int paramInt2);
  }

  public static abstract class e
  {
    private b a = null;
    private ArrayList<a> b = new ArrayList();
    private long c = 120L;
    private long d = 120L;
    private long e = 250L;
    private long f = 250L;

    static int d(RecyclerView.u paramu)
    {
      int j = RecyclerView.u.f(paramu) & 0xE;
      int i;
      if (paramu.n())
        i = 4;
      int k;
      int m;
      do
      {
        do
        {
          do
          {
            do
            {
              return i;
              i = j;
            }
            while ((j & 0x4) != 0);
            k = paramu.f();
            m = paramu.e();
            i = j;
          }
          while (k == -1);
          i = j;
        }
        while (m == -1);
        i = j;
      }
      while (k == m);
      return j | 0x800;
    }

    public c a(RecyclerView.r paramr, RecyclerView.u paramu)
    {
      return i().a(paramu);
    }

    public c a(RecyclerView.r paramr, RecyclerView.u paramu, int paramInt, List<Object> paramList)
    {
      return i().a(paramu);
    }

    public abstract void a();

    void a(b paramb)
    {
      this.a = paramb;
    }

    public final boolean a(a parama)
    {
      boolean bool = b();
      if (parama != null)
      {
        if (!bool)
          parama.a();
      }
      else
        return bool;
      this.b.add(parama);
      return bool;
    }

    public boolean a(RecyclerView.u paramu, List<Object> paramList)
    {
      return g(paramu);
    }

    public abstract boolean a(RecyclerView.u paramu, c paramc1, c paramc2);

    public abstract boolean a(RecyclerView.u paramu1, RecyclerView.u paramu2, c paramc1, c paramc2);

    public abstract boolean b();

    public abstract boolean b(RecyclerView.u paramu, c paramc1, c paramc2);

    public abstract void c();

    public abstract void c(RecyclerView.u paramu);

    public abstract boolean c(RecyclerView.u paramu, c paramc1, c paramc2);

    public long d()
    {
      return this.e;
    }

    public long e()
    {
      return this.c;
    }

    public final void e(RecyclerView.u paramu)
    {
      f(paramu);
      if (this.a != null)
        this.a.a(paramu);
    }

    public long f()
    {
      return this.d;
    }

    public void f(RecyclerView.u paramu)
    {
    }

    public long g()
    {
      return this.f;
    }

    public boolean g(RecyclerView.u paramu)
    {
      return true;
    }

    public final void h()
    {
      int j = this.b.size();
      int i = 0;
      while (i < j)
      {
        ((a)this.b.get(i)).a();
        i += 1;
      }
      this.b.clear();
    }

    public c i()
    {
      return new c();
    }

    public static abstract interface a
    {
      public abstract void a();
    }

    static abstract interface b
    {
      public abstract void a(RecyclerView.u paramu);
    }

    public static class c
    {
      public int a;
      public int b;
      public int c;
      public int d;

      public c a(RecyclerView.u paramu)
      {
        return a(paramu, 0);
      }

      public c a(RecyclerView.u paramu, int paramInt)
      {
        paramu = paramu.a;
        this.a = paramu.getLeft();
        this.b = paramu.getTop();
        this.c = paramu.getRight();
        this.d = paramu.getBottom();
        return this;
      }
    }
  }

  private class f
    implements RecyclerView.e.b
  {
    private f()
    {
    }

    public void a(RecyclerView.u paramu)
    {
      paramu.a(true);
      if ((paramu.g != null) && (paramu.h == null))
        paramu.g = null;
      paramu.h = null;
      if ((!RecyclerView.u.e(paramu)) && (!RecyclerView.c(RecyclerView.this, paramu.a)) && (paramu.r()))
        RecyclerView.this.removeDetachedView(paramu.a, false);
    }
  }

  public static abstract class g
  {
    @Deprecated
    public void a(Canvas paramCanvas, RecyclerView paramRecyclerView)
    {
    }

    public void a(Canvas paramCanvas, RecyclerView paramRecyclerView, RecyclerView.r paramr)
    {
      a(paramCanvas, paramRecyclerView);
    }

    @Deprecated
    public void a(Rect paramRect, int paramInt, RecyclerView paramRecyclerView)
    {
      paramRect.set(0, 0, 0, 0);
    }

    public void a(Rect paramRect, View paramView, RecyclerView paramRecyclerView, RecyclerView.r paramr)
    {
      a(paramRect, ((RecyclerView.i)paramView.getLayoutParams()).e(), paramRecyclerView);
    }

    @Deprecated
    public void b(Canvas paramCanvas, RecyclerView paramRecyclerView)
    {
    }

    public void b(Canvas paramCanvas, RecyclerView paramRecyclerView, RecyclerView.r paramr)
    {
      b(paramCanvas, paramRecyclerView);
    }
  }

  public static abstract class h
  {
    private boolean a = false;
    private boolean b = false;
    private boolean c = true;
    private int d;
    private int e;
    private int f;
    private int g;
    b p;
    RecyclerView q;
    RecyclerView.q r;
    boolean s = false;

    public static int a(int paramInt1, int paramInt2, int paramInt3)
    {
      int j = View.MeasureSpec.getMode(paramInt1);
      int i = View.MeasureSpec.getSize(paramInt1);
      paramInt1 = i;
      switch (j)
      {
      default:
        paramInt1 = Math.max(paramInt2, paramInt3);
      case 1073741824:
        return paramInt1;
      case -2147483648:
      }
      return Math.min(i, Math.max(paramInt2, paramInt3));
    }

    public static int a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean)
    {
      int j = 0;
      int k = 0;
      int i = Math.max(0, paramInt1 - paramInt3);
      if (paramBoolean)
        if (paramInt4 >= 0)
        {
          paramInt1 = 1073741824;
          paramInt3 = paramInt4;
        }
      while (true)
      {
        return View.MeasureSpec.makeMeasureSpec(paramInt3, paramInt1);
        if (paramInt4 == -1)
        {
          switch (paramInt2)
          {
          default:
            paramInt2 = 0;
            paramInt1 = j;
          case 1073741824:
          case -2147483648:
          case 0:
          }
          while (true)
          {
            paramInt3 = paramInt1;
            paramInt1 = paramInt2;
            break;
            paramInt1 = i;
            continue;
            paramInt2 = 0;
            paramInt1 = j;
          }
        }
        if (paramInt4 == -2)
        {
          paramInt3 = 0;
          paramInt1 = k;
          continue;
          if (paramInt4 >= 0)
          {
            paramInt1 = 1073741824;
            paramInt3 = paramInt4;
            continue;
          }
          if (paramInt4 == -1)
          {
            paramInt1 = paramInt2;
            paramInt3 = i;
            continue;
          }
          if (paramInt4 == -2)
          {
            if (paramInt2 != -2147483648)
            {
              paramInt1 = k;
              paramInt3 = i;
              if (paramInt2 != 1073741824)
                continue;
            }
            paramInt1 = -2147483648;
            paramInt3 = i;
            continue;
          }
        }
        paramInt3 = 0;
        paramInt1 = k;
      }
    }

    private void a(int paramInt, View paramView)
    {
      this.p.d(paramInt);
    }

    private void a(View paramView, int paramInt, boolean paramBoolean)
    {
      RecyclerView.u localu = RecyclerView.d(paramView);
      RecyclerView.i locali;
      if ((paramBoolean) || (localu.q()))
      {
        this.q.e.e(localu);
        locali = (RecyclerView.i)paramView.getLayoutParams();
        if ((!localu.k()) && (!localu.i()))
          break label128;
        if (!localu.i())
          break label120;
        localu.j();
        label68: this.p.a(paramView, paramInt, paramView.getLayoutParams(), false);
      }
      while (true)
      {
        if (locali.d)
        {
          localu.a.invalidate();
          locali.d = false;
        }
        return;
        this.q.e.f(localu);
        break;
        label120: localu.l();
        break label68;
        label128: if (paramView.getParent() == this.q)
        {
          int j = this.p.b(paramView);
          int i = paramInt;
          if (paramInt == -1)
            i = this.p.b();
          if (j == -1)
            throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.q.indexOfChild(paramView));
          if (j == i)
            continue;
          this.q.f.d(j, i);
          continue;
        }
        this.p.a(paramView, paramInt, false);
        locali.c = true;
        if ((this.r == null) || (!this.r.c()))
          continue;
        this.r.b(paramView);
      }
    }

    private void a(RecyclerView.n paramn, int paramInt, View paramView)
    {
      RecyclerView.u localu = RecyclerView.d(paramView);
      if (localu.c())
        return;
      if ((localu.n()) && (!localu.q()) && (!RecyclerView.f(this.q).b()))
      {
        f(paramInt);
        paramn.b(localu);
        return;
      }
      g(paramInt);
      paramn.c(paramView);
      this.q.e.h(localu);
    }

    private void a(RecyclerView.q paramq)
    {
      if (this.r == paramq)
        this.r = null;
    }

    private static boolean b(int paramInt1, int paramInt2, int paramInt3)
    {
      int k = 1;
      int i = View.MeasureSpec.getMode(paramInt2);
      paramInt2 = View.MeasureSpec.getSize(paramInt2);
      int j;
      if ((paramInt3 > 0) && (paramInt1 != paramInt3))
        j = 0;
      do
      {
        do
        {
          return j;
          j = k;
          switch (i)
          {
          case 0:
          default:
            return false;
          case -2147483648:
            j = k;
          case 1073741824:
          }
        }
        while (paramInt2 >= paramInt1);
        return false;
        j = k;
      }
      while (paramInt2 == paramInt1);
      return false;
    }

    public int A()
    {
      if (this.q != null)
        return this.q.getPaddingRight();
      return 0;
    }

    public int B()
    {
      if (this.q != null)
        return this.q.getPaddingBottom();
      return 0;
    }

    public View C()
    {
      if (this.q == null);
      View localView;
      do
      {
        return null;
        localView = this.q.getFocusedChild();
      }
      while ((localView == null) || (this.p.c(localView)));
      return localView;
    }

    public int D()
    {
      if (this.q != null);
      for (RecyclerView.a locala = this.q.getAdapter(); locala != null; locala = null)
        return locala.a();
      return 0;
    }

    public int E()
    {
      return af.n(this.q);
    }

    public int F()
    {
      return af.o(this.q);
    }

    void G()
    {
      if (this.r != null)
        this.r.a();
    }

    public void H()
    {
      this.a = true;
    }

    boolean I()
    {
      int m = 0;
      int j = t();
      int i = 0;
      while (true)
      {
        int k = m;
        if (i < j)
        {
          ViewGroup.LayoutParams localLayoutParams = h(i).getLayoutParams();
          if ((localLayoutParams.width < 0) && (localLayoutParams.height < 0))
            k = 1;
        }
        else
        {
          return k;
        }
        i += 1;
      }
    }

    public int a(int paramInt, RecyclerView.n paramn, RecyclerView.r paramr)
    {
      return 0;
    }

    public int a(RecyclerView.n paramn, RecyclerView.r paramr)
    {
      if ((this.q == null) || (RecyclerView.f(this.q) == null));
      do
        return 1;
      while (!f());
      return RecyclerView.f(this.q).a();
    }

    public View a(View paramView, int paramInt, RecyclerView.n paramn, RecyclerView.r paramr)
    {
      return null;
    }

    public abstract RecyclerView.i a();

    public RecyclerView.i a(Context paramContext, AttributeSet paramAttributeSet)
    {
      return new RecyclerView.i(paramContext, paramAttributeSet);
    }

    public RecyclerView.i a(ViewGroup.LayoutParams paramLayoutParams)
    {
      if ((paramLayoutParams instanceof RecyclerView.i))
        return new RecyclerView.i((RecyclerView.i)paramLayoutParams);
      if ((paramLayoutParams instanceof ViewGroup.MarginLayoutParams))
        return new RecyclerView.i((ViewGroup.MarginLayoutParams)paramLayoutParams);
      return new RecyclerView.i(paramLayoutParams);
    }

    public void a(int paramInt, RecyclerView.n paramn)
    {
      View localView = h(paramInt);
      f(paramInt);
      paramn.a(localView);
    }

    public void a(Rect paramRect, int paramInt1, int paramInt2)
    {
      int i = paramRect.width();
      int j = y();
      int k = A();
      int m = paramRect.height();
      int n = z();
      int i1 = B();
      e(a(paramInt1, i + j + k, E()), a(paramInt2, m + n + i1, F()));
    }

    public void a(Parcelable paramParcelable)
    {
    }

    void a(android.support.v4.view.a.c paramc)
    {
      a(this.q.b, this.q.h, paramc);
    }

    public void a(View paramView)
    {
      a(paramView, -1);
    }

    public void a(View paramView, int paramInt)
    {
      a(paramView, paramInt, true);
    }

    public void a(View paramView, int paramInt1, int paramInt2)
    {
      RecyclerView.i locali = (RecyclerView.i)paramView.getLayoutParams();
      Rect localRect = this.q.j(paramView);
      int k = localRect.left;
      int m = localRect.right;
      int i = localRect.top;
      int j = localRect.bottom;
      paramInt1 = a(w(), u(), k + m + paramInt1 + (y() + A() + locali.leftMargin + locali.rightMargin), locali.width, e());
      paramInt2 = a(x(), v(), j + i + paramInt2 + (z() + B() + locali.topMargin + locali.bottomMargin), locali.height, f());
      if (b(paramView, paramInt1, paramInt2, locali))
        paramView.measure(paramInt1, paramInt2);
    }

    public void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      Rect localRect = ((RecyclerView.i)paramView.getLayoutParams()).b;
      paramView.layout(localRect.left + paramInt1, localRect.top + paramInt2, paramInt3 - localRect.right, paramInt4 - localRect.bottom);
    }

    public void a(View paramView, int paramInt, RecyclerView.i parami)
    {
      RecyclerView.u localu = RecyclerView.d(paramView);
      if (localu.q())
        this.q.e.e(localu);
      while (true)
      {
        this.p.a(paramView, paramInt, parami, localu.q());
        return;
        this.q.e.f(localu);
      }
    }

    public void a(View paramView, Rect paramRect)
    {
      if (this.q == null)
      {
        paramRect.set(0, 0, 0, 0);
        return;
      }
      paramRect.set(this.q.j(paramView));
    }

    void a(View paramView, android.support.v4.view.a.c paramc)
    {
      RecyclerView.u localu = RecyclerView.d(paramView);
      if ((localu != null) && (!localu.q()) && (!this.p.c(localu.a)))
        a(this.q.b, this.q.h, paramView, paramc);
    }

    public void a(View paramView, RecyclerView.n paramn)
    {
      c(paramView);
      paramn.a(paramView);
    }

    public void a(AccessibilityEvent paramAccessibilityEvent)
    {
      a(this.q.b, this.q.h, paramAccessibilityEvent);
    }

    public void a(String paramString)
    {
      if (this.q != null)
        this.q.a(paramString);
    }

    public void a(RecyclerView.a parama1, RecyclerView.a parama2)
    {
    }

    public void a(RecyclerView.n paramn)
    {
      int i = t() - 1;
      while (i >= 0)
      {
        a(paramn, i, h(i));
        i -= 1;
      }
    }

    public void a(RecyclerView.n paramn, RecyclerView.r paramr, int paramInt1, int paramInt2)
    {
      this.q.d(paramInt1, paramInt2);
    }

    public void a(RecyclerView.n paramn, RecyclerView.r paramr, android.support.v4.view.a.c paramc)
    {
      if ((af.b(this.q, -1)) || (af.a(this.q, -1)))
      {
        paramc.a(8192);
        paramc.a(true);
      }
      if ((af.b(this.q, 1)) || (af.a(this.q, 1)))
      {
        paramc.a(4096);
        paramc.a(true);
      }
      paramc.a(c.l.a(a(paramn, paramr), b(paramn, paramr), e(paramn, paramr), d(paramn, paramr)));
    }

    public void a(RecyclerView.n paramn, RecyclerView.r paramr, View paramView, android.support.v4.view.a.c paramc)
    {
      int i;
      if (f())
      {
        i = d(paramView);
        if (!e())
          break label51;
      }
      label51: for (int j = d(paramView); ; j = 0)
      {
        paramc.b(c.m.a(i, 1, j, 1, false, false));
        return;
        i = 0;
        break;
      }
    }

    public void a(RecyclerView.n paramn, RecyclerView.r paramr, AccessibilityEvent paramAccessibilityEvent)
    {
      boolean bool2 = true;
      paramn = android.support.v4.view.a.a.a(paramAccessibilityEvent);
      if ((this.q == null) || (paramn == null))
        return;
      boolean bool1 = bool2;
      if (!af.b(this.q, 1))
      {
        bool1 = bool2;
        if (!af.b(this.q, -1))
        {
          bool1 = bool2;
          if (!af.a(this.q, -1))
            if (!af.a(this.q, 1))
              break label111;
        }
      }
      label111: for (bool1 = bool2; ; bool1 = false)
      {
        paramn.a(bool1);
        if (RecyclerView.f(this.q) == null)
          break;
        paramn.a(RecyclerView.f(this.q).a());
        return;
      }
    }

    public void a(RecyclerView paramRecyclerView)
    {
    }

    public void a(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
    {
    }

    public void a(RecyclerView paramRecyclerView, int paramInt1, int paramInt2, int paramInt3)
    {
    }

    public void a(RecyclerView paramRecyclerView, int paramInt1, int paramInt2, Object paramObject)
    {
      c(paramRecyclerView, paramInt1, paramInt2);
    }

    public void a(RecyclerView paramRecyclerView, RecyclerView.n paramn)
    {
      e(paramRecyclerView);
    }

    boolean a(int paramInt, Bundle paramBundle)
    {
      return a(this.q.b, this.q.h, paramInt, paramBundle);
    }

    boolean a(View paramView, int paramInt1, int paramInt2, RecyclerView.i parami)
    {
      return (!this.c) || (!b(paramView.getMeasuredWidth(), paramInt1, parami.width)) || (!b(paramView.getMeasuredHeight(), paramInt2, parami.height));
    }

    boolean a(View paramView, int paramInt, Bundle paramBundle)
    {
      return a(this.q.b, this.q.h, paramView, paramInt, paramBundle);
    }

    public boolean a(RecyclerView.i parami)
    {
      return parami != null;
    }

    public boolean a(RecyclerView.n paramn, RecyclerView.r paramr, int paramInt, Bundle paramBundle)
    {
      if (this.q == null);
      int i;
      do
      {
        return false;
        switch (paramInt)
        {
        default:
          paramInt = 0;
          i = 0;
        case 8192:
        case 4096:
        }
      }
      while ((i == 0) && (paramInt == 0));
      this.q.scrollBy(paramInt, i);
      return true;
      if (af.b(this.q, -1));
      for (paramInt = -(x() - z() - B()); ; paramInt = 0)
      {
        i = paramInt;
        int j;
        if (af.a(this.q, -1))
        {
          j = -(w() - y() - A());
          i = paramInt;
          paramInt = j;
          break;
          if (!af.b(this.q, 1))
            break label207;
        }
        label207: for (paramInt = x() - z() - B(); ; paramInt = 0)
        {
          i = paramInt;
          if (af.a(this.q, 1))
          {
            j = w();
            int k = y();
            int m = A();
            i = paramInt;
            paramInt = j - k - m;
            break;
          }
          paramInt = 0;
          break;
        }
      }
    }

    public boolean a(RecyclerView.n paramn, RecyclerView.r paramr, View paramView, int paramInt, Bundle paramBundle)
    {
      return false;
    }

    public boolean a(RecyclerView paramRecyclerView, View paramView, Rect paramRect, boolean paramBoolean)
    {
      int i2 = y();
      int m = z();
      int i3 = w() - A();
      int i1 = x();
      int i6 = B();
      int i4 = paramView.getLeft() + paramRect.left - paramView.getScrollX();
      int n = paramView.getTop() + paramRect.top - paramView.getScrollY();
      int i5 = i4 + paramRect.width();
      int i7 = paramRect.height();
      int i = Math.min(0, i4 - i2);
      int j = Math.min(0, n - m);
      int k = Math.max(0, i5 - i3);
      i1 = Math.max(0, n + i7 - (i1 - i6));
      if (r() == 1)
        if (k != 0)
        {
          i = k;
          if (j == 0)
            break label217;
          label154: if ((i == 0) && (j == 0))
            break label243;
          if (!paramBoolean)
            break label232;
          paramRecyclerView.scrollBy(i, j);
        }
      while (true)
      {
        return true;
        i = Math.max(i, i5 - i3);
        break;
        if (i != 0)
          break;
        while (true)
          i = Math.min(i4 - i2, k);
        label217: j = Math.min(n - m, i1);
        break label154;
        label232: paramRecyclerView.a(i, j);
      }
      label243: return false;
    }

    @Deprecated
    public boolean a(RecyclerView paramRecyclerView, View paramView1, View paramView2)
    {
      return (q()) || (paramRecyclerView.j());
    }

    public boolean a(RecyclerView paramRecyclerView, ArrayList<View> paramArrayList, int paramInt1, int paramInt2)
    {
      return false;
    }

    public boolean a(RecyclerView paramRecyclerView, RecyclerView.r paramr, View paramView1, View paramView2)
    {
      return a(paramRecyclerView, paramView1, paramView2);
    }

    public int b(int paramInt, RecyclerView.n paramn, RecyclerView.r paramr)
    {
      return 0;
    }

    public int b(RecyclerView.n paramn, RecyclerView.r paramr)
    {
      if ((this.q == null) || (RecyclerView.f(this.q) == null));
      do
        return 1;
      while (!e());
      return RecyclerView.f(this.q).a();
    }

    public int b(RecyclerView.r paramr)
    {
      return 0;
    }

    void b(int paramInt1, int paramInt2)
    {
      this.f = View.MeasureSpec.getSize(paramInt1);
      this.d = View.MeasureSpec.getMode(paramInt1);
      if ((this.d == 0) && (!RecyclerView.a))
        this.f = 0;
      this.g = View.MeasureSpec.getSize(paramInt2);
      this.e = View.MeasureSpec.getMode(paramInt2);
      if ((this.e == 0) && (!RecyclerView.a))
        this.g = 0;
    }

    public void b(View paramView)
    {
      b(paramView, -1);
    }

    public void b(View paramView, int paramInt)
    {
      a(paramView, paramInt, false);
    }

    void b(RecyclerView.n paramn)
    {
      int j = paramn.d();
      int i = j - 1;
      if (i >= 0)
      {
        View localView = paramn.e(i);
        RecyclerView.u localu = RecyclerView.d(localView);
        if (localu.c());
        while (true)
        {
          i -= 1;
          break;
          localu.a(false);
          if (localu.r())
            this.q.removeDetachedView(localView, false);
          if (this.q.g != null)
            this.q.g.c(localu);
          localu.a(true);
          paramn.b(localView);
        }
      }
      paramn.e();
      if (j > 0)
        this.q.invalidate();
    }

    void b(RecyclerView paramRecyclerView)
    {
      if (paramRecyclerView == null)
      {
        this.q = null;
        this.p = null;
        this.f = 0;
      }
      for (this.g = 0; ; this.g = paramRecyclerView.getHeight())
      {
        this.d = 1073741824;
        this.e = 1073741824;
        return;
        this.q = paramRecyclerView;
        this.p = paramRecyclerView.d;
        this.f = paramRecyclerView.getWidth();
      }
    }

    public void b(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
    {
    }

    void b(RecyclerView paramRecyclerView, RecyclerView.n paramn)
    {
      this.s = false;
      a(paramRecyclerView, paramn);
    }

    boolean b(View paramView, int paramInt1, int paramInt2, RecyclerView.i parami)
    {
      return (paramView.isLayoutRequested()) || (!this.c) || (!b(paramView.getWidth(), paramInt1, parami.width)) || (!b(paramView.getHeight(), paramInt2, parami.height));
    }

    public int c(RecyclerView.r paramr)
    {
      return 0;
    }

    public View c(int paramInt)
    {
      int j = t();
      int i = 0;
      if (i < j)
      {
        View localView = h(i);
        RecyclerView.u localu = RecyclerView.d(localView);
        if (localu == null);
        do
        {
          i += 1;
          break;
        }
        while ((localu.d() != paramInt) || (localu.c()) || ((!this.q.h.a()) && (localu.q())));
        return localView;
      }
      return null;
    }

    void c(int paramInt1, int paramInt2)
    {
      int j = 2147483647;
      int i = -2147483648;
      int i5 = t();
      if (i5 == 0)
      {
        this.q.d(paramInt1, paramInt2);
        return;
      }
      int n = 0;
      int k = -2147483648;
      int m = 2147483647;
      int i1;
      int i3;
      int i2;
      if (n < i5)
      {
        View localView = h(n);
        RecyclerView.i locali = (RecyclerView.i)localView.getLayoutParams();
        int i4 = h(localView) - locali.leftMargin;
        i1 = j(localView);
        i3 = locali.rightMargin + i1;
        i2 = i(localView) - locali.topMargin;
        i1 = k(localView);
        i1 = locali.bottomMargin + i1;
        if (i4 >= m)
          break label221;
        m = i4;
      }
      label221: 
      while (true)
      {
        if (i3 > k)
          k = i3;
        while (true)
        {
          if (i2 < j)
            j = i2;
          while (true)
          {
            if (i1 > i)
              i = i1;
            while (true)
            {
              n += 1;
              break;
              RecyclerView.s(this.q).set(m, j, k, i);
              a(RecyclerView.s(this.q), paramInt1, paramInt2);
              return;
            }
          }
        }
      }
    }

    public void c(View paramView)
    {
      this.p.a(paramView);
    }

    public void c(View paramView, int paramInt)
    {
      a(paramView, paramInt, (RecyclerView.i)paramView.getLayoutParams());
    }

    public void c(RecyclerView.n paramn)
    {
      int i = t() - 1;
      while (i >= 0)
      {
        if (!RecyclerView.d(h(i)).c())
          a(i, paramn);
        i -= 1;
      }
    }

    public void c(RecyclerView.n paramn, RecyclerView.r paramr)
    {
      Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
    }

    void c(RecyclerView paramRecyclerView)
    {
      this.s = true;
      d(paramRecyclerView);
    }

    public void c(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
    {
    }

    public void c(boolean paramBoolean)
    {
      this.b = paramBoolean;
    }

    public boolean c()
    {
      return false;
    }

    public int d(View paramView)
    {
      return ((RecyclerView.i)paramView.getLayoutParams()).e();
    }

    public int d(RecyclerView.n paramn, RecyclerView.r paramr)
    {
      return 0;
    }

    public int d(RecyclerView.r paramr)
    {
      return 0;
    }

    public Parcelable d()
    {
      return null;
    }

    public View d(View paramView, int paramInt)
    {
      return null;
    }

    public void d(int paramInt)
    {
    }

    public void d(int paramInt1, int paramInt2)
    {
      View localView = h(paramInt1);
      if (localView == null)
        throw new IllegalArgumentException("Cannot move a child from non-existing index:" + paramInt1);
      g(paramInt1);
      c(localView, paramInt2);
    }

    public void d(RecyclerView paramRecyclerView)
    {
    }

    public int e(RecyclerView.r paramr)
    {
      return 0;
    }

    public View e(View paramView)
    {
      if (this.q == null);
      do
      {
        return null;
        paramView = this.q.b(paramView);
      }
      while ((paramView == null) || (this.p.c(paramView)));
      return paramView;
    }

    public void e(int paramInt1, int paramInt2)
    {
      RecyclerView.b(this.q, paramInt1, paramInt2);
    }

    @Deprecated
    public void e(RecyclerView paramRecyclerView)
    {
    }

    public boolean e()
    {
      return false;
    }

    public boolean e(RecyclerView.n paramn, RecyclerView.r paramr)
    {
      return false;
    }

    public int f(View paramView)
    {
      Rect localRect = ((RecyclerView.i)paramView.getLayoutParams()).b;
      int i = paramView.getMeasuredWidth();
      int j = localRect.left;
      return localRect.right + (i + j);
    }

    public int f(RecyclerView.r paramr)
    {
      return 0;
    }

    public void f(int paramInt)
    {
      if (h(paramInt) != null)
        this.p.a(paramInt);
    }

    void f(RecyclerView paramRecyclerView)
    {
      b(View.MeasureSpec.makeMeasureSpec(paramRecyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(paramRecyclerView.getHeight(), 1073741824));
    }

    public boolean f()
    {
      return false;
    }

    public int g(View paramView)
    {
      Rect localRect = ((RecyclerView.i)paramView.getLayoutParams()).b;
      int i = paramView.getMeasuredHeight();
      int j = localRect.top;
      return localRect.bottom + (i + j);
    }

    public int g(RecyclerView.r paramr)
    {
      return 0;
    }

    public void g(int paramInt)
    {
      a(paramInt, h(paramInt));
    }

    public int h(View paramView)
    {
      return paramView.getLeft() - n(paramView);
    }

    public View h(int paramInt)
    {
      if (this.p != null)
        return this.p.b(paramInt);
      return null;
    }

    public int i(View paramView)
    {
      return paramView.getTop() - l(paramView);
    }

    public void i(int paramInt)
    {
      if (this.q != null)
        this.q.d(paramInt);
    }

    public int j(View paramView)
    {
      return paramView.getRight() + o(paramView);
    }

    public void j(int paramInt)
    {
      if (this.q != null)
        this.q.c(paramInt);
    }

    public int k(View paramView)
    {
      return paramView.getBottom() + m(paramView);
    }

    public void k(int paramInt)
    {
    }

    public int l(View paramView)
    {
      return ((RecyclerView.i)paramView.getLayoutParams()).b.top;
    }

    boolean l()
    {
      return false;
    }

    public int m(View paramView)
    {
      return ((RecyclerView.i)paramView.getLayoutParams()).b.bottom;
    }

    public int n(View paramView)
    {
      return ((RecyclerView.i)paramView.getLayoutParams()).b.left;
    }

    public int o(View paramView)
    {
      return ((RecyclerView.i)paramView.getLayoutParams()).b.right;
    }

    public void p()
    {
      if (this.q != null)
        this.q.requestLayout();
    }

    public boolean q()
    {
      return (this.r != null) && (this.r.c());
    }

    public int r()
    {
      return af.h(this.q);
    }

    public int s()
    {
      return -1;
    }

    public int t()
    {
      if (this.p != null)
        return this.p.b();
      return 0;
    }

    public int u()
    {
      return this.d;
    }

    public int v()
    {
      return this.e;
    }

    public int w()
    {
      return this.f;
    }

    public int x()
    {
      return this.g;
    }

    public int y()
    {
      if (this.q != null)
        return this.q.getPaddingLeft();
      return 0;
    }

    public int z()
    {
      if (this.q != null)
        return this.q.getPaddingTop();
      return 0;
    }
  }

  public static class i extends ViewGroup.MarginLayoutParams
  {
    RecyclerView.u a;
    final Rect b = new Rect();
    boolean c = true;
    boolean d = false;

    public i(int paramInt1, int paramInt2)
    {
      super(paramInt2);
    }

    public i(Context paramContext, AttributeSet paramAttributeSet)
    {
      super(paramAttributeSet);
    }

    public i(ViewGroup.LayoutParams paramLayoutParams)
    {
      super();
    }

    public i(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
    {
      super();
    }

    public i(i parami)
    {
      super();
    }

    public boolean c()
    {
      return this.a.q();
    }

    public boolean d()
    {
      return this.a.x();
    }

    public int e()
    {
      return this.a.d();
    }
  }

  public static abstract interface j
  {
    public abstract void a(View paramView);

    public abstract void b(View paramView);
  }

  public static abstract interface k
  {
    public abstract void a(boolean paramBoolean);

    public abstract boolean a(RecyclerView paramRecyclerView, MotionEvent paramMotionEvent);

    public abstract void b(RecyclerView paramRecyclerView, MotionEvent paramMotionEvent);
  }

  public static abstract class l
  {
    public void a(RecyclerView paramRecyclerView, int paramInt)
    {
    }

    public void a(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
    {
    }
  }

  public static class m
  {
    private SparseArray<ArrayList<RecyclerView.u>> a = new SparseArray();
    private SparseIntArray b = new SparseIntArray();
    private int c = 0;

    private ArrayList<RecyclerView.u> b(int paramInt)
    {
      ArrayList localArrayList2 = (ArrayList)this.a.get(paramInt);
      ArrayList localArrayList1 = localArrayList2;
      if (localArrayList2 == null)
      {
        localArrayList2 = new ArrayList();
        this.a.put(paramInt, localArrayList2);
        localArrayList1 = localArrayList2;
        if (this.b.indexOfKey(paramInt) < 0)
        {
          this.b.put(paramInt, 5);
          localArrayList1 = localArrayList2;
        }
      }
      return localArrayList1;
    }

    public RecyclerView.u a(int paramInt)
    {
      ArrayList localArrayList = (ArrayList)this.a.get(paramInt);
      if ((localArrayList != null) && (!localArrayList.isEmpty()))
      {
        paramInt = localArrayList.size() - 1;
        RecyclerView.u localu = (RecyclerView.u)localArrayList.get(paramInt);
        localArrayList.remove(paramInt);
        return localu;
      }
      return null;
    }

    public void a()
    {
      this.a.clear();
    }

    void a(RecyclerView.a parama)
    {
      this.c += 1;
    }

    void a(RecyclerView.a parama1, RecyclerView.a parama2, boolean paramBoolean)
    {
      if (parama1 != null)
        b();
      if ((!paramBoolean) && (this.c == 0))
        a();
      if (parama2 != null)
        a(parama2);
    }

    public void a(RecyclerView.u paramu)
    {
      int i = paramu.h();
      ArrayList localArrayList = b(i);
      if (this.b.get(i) <= localArrayList.size())
        return;
      paramu.v();
      localArrayList.add(paramu);
    }

    void b()
    {
      this.c -= 1;
    }
  }

  public final class n
  {
    final ArrayList<RecyclerView.u> a = new ArrayList();
    final ArrayList<RecyclerView.u> b = new ArrayList();
    private ArrayList<RecyclerView.u> d = null;
    private final List<RecyclerView.u> e = Collections.unmodifiableList(this.a);
    private int f = 2;
    private RecyclerView.m g;
    private RecyclerView.s h;

    public n()
    {
    }

    private void a(ViewGroup paramViewGroup, boolean paramBoolean)
    {
      int i = paramViewGroup.getChildCount() - 1;
      while (i >= 0)
      {
        View localView = paramViewGroup.getChildAt(i);
        if ((localView instanceof ViewGroup))
          a((ViewGroup)localView, true);
        i -= 1;
      }
      if (!paramBoolean)
        return;
      if (paramViewGroup.getVisibility() == 4)
      {
        paramViewGroup.setVisibility(0);
        paramViewGroup.setVisibility(4);
        return;
      }
      i = paramViewGroup.getVisibility();
      paramViewGroup.setVisibility(4);
      paramViewGroup.setVisibility(i);
    }

    private void d(View paramView)
    {
      if (RecyclerView.this.i())
      {
        if (af.e(paramView) == 0)
          af.c(paramView, 1);
        if (!af.b(paramView))
          af.a(paramView, RecyclerView.q(RecyclerView.this).b());
      }
    }

    private void f(RecyclerView.u paramu)
    {
      if ((paramu.a instanceof ViewGroup))
        a((ViewGroup)paramu.a, false);
    }

    View a(int paramInt, boolean paramBoolean)
    {
      boolean bool = true;
      if ((paramInt < 0) || (paramInt >= RecyclerView.this.h.d()))
        throw new IndexOutOfBoundsException("Invalid item position " + paramInt + "(" + paramInt + "). Item count:" + RecyclerView.this.h.d());
      Object localObject2;
      int i;
      if (RecyclerView.this.h.a())
      {
        localObject2 = f(paramInt);
        if (localObject2 != null)
          i = 1;
      }
      while (true)
      {
        Object localObject1 = localObject2;
        if (localObject2 == null)
        {
          localObject2 = a(paramInt, -1, paramBoolean);
          localObject1 = localObject2;
          if (localObject2 != null)
            if (!a((RecyclerView.u)localObject2))
              if (!paramBoolean)
              {
                ((RecyclerView.u)localObject2).b(4);
                if (((RecyclerView.u)localObject2).i())
                {
                  RecyclerView.this.removeDetachedView(((RecyclerView.u)localObject2).a, false);
                  ((RecyclerView.u)localObject2).j();
                  label174: b((RecyclerView.u)localObject2);
                }
              }
              else
              {
                localObject1 = null;
              }
        }
        while (true)
        {
          Object localObject3 = localObject1;
          int k = i;
          int j;
          if (localObject1 == null)
          {
            k = RecyclerView.this.c.b(paramInt);
            if ((k < 0) || (k >= RecyclerView.f(RecyclerView.this).a()))
            {
              throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + paramInt + "(offset:" + k + ")." + "state:" + RecyclerView.this.h.d() + " tag " + RecyclerView.this.getTag() + " adapter " + RecyclerView.this.getAdapter());
              i = 0;
              break;
              if (!((RecyclerView.u)localObject2).k())
                break label174;
              ((RecyclerView.u)localObject2).l();
              break label174;
              i = 1;
              localObject1 = localObject2;
              continue;
            }
            int m = RecyclerView.f(RecyclerView.this).a(k);
            localObject2 = localObject1;
            j = i;
            if (RecyclerView.f(RecyclerView.this).b())
            {
              localObject1 = a(RecyclerView.f(RecyclerView.this).b(k), m, paramBoolean);
              localObject2 = localObject1;
              j = i;
              if (localObject1 != null)
              {
                ((RecyclerView.u)localObject1).b = k;
                j = 1;
                localObject2 = localObject1;
              }
            }
            localObject1 = localObject2;
            if (localObject2 == null)
            {
              localObject1 = localObject2;
              if (this.h != null)
              {
                localObject3 = this.h.a(this, paramInt, m);
                localObject1 = localObject2;
                if (localObject3 != null)
                {
                  localObject2 = RecyclerView.this.a((View)localObject3);
                  if (localObject2 == null)
                    throw new IllegalArgumentException("getViewForPositionAndType returned a view which does not have a ViewHolder");
                  localObject1 = localObject2;
                  if (((RecyclerView.u)localObject2).c())
                    throw new IllegalArgumentException("getViewForPositionAndType returned a view that is ignored. You must call stopIgnoring before returning this view.");
                }
              }
            }
            localObject2 = localObject1;
            if (localObject1 == null)
            {
              localObject1 = f().a(m);
              localObject2 = localObject1;
              if (localObject1 != null)
              {
                ((RecyclerView.u)localObject1).v();
                localObject2 = localObject1;
                if (RecyclerView.r())
                {
                  f((RecyclerView.u)localObject1);
                  localObject2 = localObject1;
                }
              }
            }
            localObject3 = localObject2;
            k = j;
            if (localObject2 == null)
              localObject2 = RecyclerView.f(RecyclerView.this).b(RecyclerView.this, m);
          }
          for (i = j; ; i = k)
          {
            if ((i != 0) && (!RecyclerView.this.h.a()) && (((RecyclerView.u)localObject2).a(8192)))
            {
              ((RecyclerView.u)localObject2).a(0, 8192);
              if (RecyclerView.r.d(RecyclerView.this.h))
              {
                j = RecyclerView.e.d((RecyclerView.u)localObject2);
                localObject1 = RecyclerView.this.g.a(RecyclerView.this.h, (RecyclerView.u)localObject2, j | 0x1000, ((RecyclerView.u)localObject2).u());
                RecyclerView.a(RecyclerView.this, (RecyclerView.u)localObject2, (RecyclerView.e.c)localObject1);
              }
            }
            if ((RecyclerView.this.h.a()) && (((RecyclerView.u)localObject2).p()))
            {
              ((RecyclerView.u)localObject2).f = paramInt;
              paramInt = 0;
            }
            while (true)
            {
              localObject1 = ((RecyclerView.u)localObject2).a.getLayoutParams();
              if (localObject1 == null)
              {
                localObject1 = (RecyclerView.i)RecyclerView.this.generateDefaultLayoutParams();
                ((RecyclerView.u)localObject2).a.setLayoutParams((ViewGroup.LayoutParams)localObject1);
                label773: ((RecyclerView.i)localObject1).a = ((RecyclerView.u)localObject2);
                if ((i == 0) || (paramInt == 0))
                  break label945;
              }
              label945: for (paramBoolean = bool; ; paramBoolean = false)
              {
                ((RecyclerView.i)localObject1).d = paramBoolean;
                return ((RecyclerView.u)localObject2).a;
                if ((((RecyclerView.u)localObject2).p()) && (!((RecyclerView.u)localObject2).o()) && (!((RecyclerView.u)localObject2).n()))
                  break label950;
                j = RecyclerView.this.c.b(paramInt);
                ((RecyclerView.u)localObject2).k = RecyclerView.this;
                RecyclerView.f(RecyclerView.this).b((RecyclerView.u)localObject2, j);
                d(((RecyclerView.u)localObject2).a);
                if (RecyclerView.this.h.a())
                  ((RecyclerView.u)localObject2).f = paramInt;
                paramInt = 1;
                break;
                if (!RecyclerView.this.checkLayoutParams((ViewGroup.LayoutParams)localObject1))
                {
                  localObject1 = (RecyclerView.i)RecyclerView.this.generateLayoutParams((ViewGroup.LayoutParams)localObject1);
                  ((RecyclerView.u)localObject2).a.setLayoutParams((ViewGroup.LayoutParams)localObject1);
                  break label773;
                }
                localObject1 = (RecyclerView.i)localObject1;
                break label773;
              }
              label950: paramInt = 0;
            }
            localObject2 = localObject3;
          }
        }
        localObject2 = null;
        i = 0;
      }
    }

    RecyclerView.u a(int paramInt1, int paramInt2, boolean paramBoolean)
    {
      int j = 0;
      int k = this.a.size();
      int i = 0;
      Object localObject;
      RecyclerView.u localu;
      while (true)
      {
        if (i < k)
        {
          localObject = (RecyclerView.u)this.a.get(i);
          if ((((RecyclerView.u)localObject).k()) || (((RecyclerView.u)localObject).d() != paramInt1) || (((RecyclerView.u)localObject).n()) || ((!RecyclerView.r.g(RecyclerView.this.h)) && (((RecyclerView.u)localObject).q())))
            break label258;
          if ((paramInt2 != -1) && (((RecyclerView.u)localObject).h() != paramInt2))
            Log.e("RecyclerView", "Scrap view for position " + paramInt1 + " isn't dirty but has" + " wrong view type! (found " + ((RecyclerView.u)localObject).h() + " but expected " + paramInt2 + ")");
        }
        else
        {
          if (paramBoolean)
            break;
          localObject = RecyclerView.this.d.a(paramInt1, paramInt2);
          if (localObject == null)
            break;
          localu = RecyclerView.d((View)localObject);
          RecyclerView.this.d.e((View)localObject);
          paramInt1 = RecyclerView.this.d.b((View)localObject);
          if (paramInt1 != -1)
            break label267;
          throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + localu);
        }
        ((RecyclerView.u)localObject).b(32);
        return localObject;
        label258: i += 1;
        continue;
        label267: RecyclerView.this.d.d(paramInt1);
        c((View)localObject);
        localu.b(8224);
        return localu;
      }
      i = this.b.size();
      paramInt2 = j;
      while (true)
      {
        if (paramInt2 >= i)
          break label370;
        localu = (RecyclerView.u)this.b.get(paramInt2);
        if ((!localu.n()) && (localu.d() == paramInt1))
        {
          localObject = localu;
          if (paramBoolean)
            break;
          this.b.remove(paramInt2);
          return localu;
        }
        paramInt2 += 1;
      }
      label370: return (RecyclerView.u)null;
    }

    RecyclerView.u a(long paramLong, int paramInt, boolean paramBoolean)
    {
      int i = this.a.size() - 1;
      RecyclerView.u localu2;
      RecyclerView.u localu1;
      while (i >= 0)
      {
        localu2 = (RecyclerView.u)this.a.get(i);
        if ((localu2.g() == paramLong) && (!localu2.k()))
        {
          if (paramInt == localu2.h())
          {
            localu2.b(32);
            localu1 = localu2;
            if (localu2.q())
            {
              localu1 = localu2;
              if (!RecyclerView.this.h.a())
              {
                localu2.a(2, 14);
                localu1 = localu2;
              }
            }
            return localu1;
          }
          if (!paramBoolean)
          {
            this.a.remove(i);
            RecyclerView.this.removeDetachedView(localu2.a, false);
            b(localu2.a);
          }
        }
        i -= 1;
      }
      i = this.b.size() - 1;
      while (true)
      {
        if (i < 0)
          break label245;
        localu2 = (RecyclerView.u)this.b.get(i);
        if (localu2.g() == paramLong)
        {
          if (paramInt == localu2.h())
          {
            localu1 = localu2;
            if (paramBoolean)
              break;
            this.b.remove(i);
            return localu2;
          }
          if (!paramBoolean)
            d(i);
        }
        i -= 1;
      }
      label245: return null;
    }

    public void a()
    {
      this.a.clear();
      c();
    }

    public void a(int paramInt)
    {
      this.f = paramInt;
      int i = this.b.size() - 1;
      while ((i >= 0) && (this.b.size() > paramInt))
      {
        d(i);
        i -= 1;
      }
    }

    void a(int paramInt1, int paramInt2)
    {
      int i;
      int j;
      int k;
      int m;
      label25: RecyclerView.u localu;
      if (paramInt1 < paramInt2)
      {
        i = -1;
        j = paramInt2;
        k = paramInt1;
        int n = this.b.size();
        m = 0;
        if (m >= n)
          return;
        localu = (RecyclerView.u)this.b.get(m);
        if ((localu != null) && (localu.b >= k) && (localu.b <= j))
          break label91;
      }
      while (true)
      {
        m += 1;
        break label25;
        i = 1;
        j = paramInt1;
        k = paramInt2;
        break;
        label91: if (localu.b == paramInt1)
        {
          localu.a(paramInt2 - paramInt1, false);
          continue;
        }
        localu.a(i, false);
      }
    }

    public void a(View paramView)
    {
      RecyclerView.u localu = RecyclerView.d(paramView);
      if (localu.r())
        RecyclerView.this.removeDetachedView(paramView, false);
      if (localu.i())
        localu.j();
      while (true)
      {
        b(localu);
        return;
        if (!localu.k())
          continue;
        localu.l();
      }
    }

    void a(RecyclerView.a parama1, RecyclerView.a parama2, boolean paramBoolean)
    {
      a();
      f().a(parama1, parama2, paramBoolean);
    }

    void a(RecyclerView.m paramm)
    {
      if (this.g != null)
        this.g.b();
      this.g = paramm;
      if (paramm != null)
        this.g.a(RecyclerView.this.getAdapter());
    }

    void a(RecyclerView.s params)
    {
      this.h = params;
    }

    boolean a(RecyclerView.u paramu)
    {
      boolean bool2 = true;
      boolean bool1;
      if (paramu.q())
        bool1 = RecyclerView.this.h.a();
      do
      {
        do
        {
          return bool1;
          if ((paramu.b < 0) || (paramu.b >= RecyclerView.f(RecyclerView.this).a()))
            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + paramu);
          if ((!RecyclerView.this.h.a()) && (RecyclerView.f(RecyclerView.this).a(paramu.b) != paramu.h()))
            return false;
          bool1 = bool2;
        }
        while (!RecyclerView.f(RecyclerView.this).b());
        bool1 = bool2;
      }
      while (paramu.g() == RecyclerView.f(RecyclerView.this).b(paramu.b));
      return false;
    }

    public int b(int paramInt)
    {
      if ((paramInt < 0) || (paramInt >= RecyclerView.this.h.d()))
        throw new IndexOutOfBoundsException("invalid position " + paramInt + ". State " + "item count is " + RecyclerView.this.h.d());
      if (!RecyclerView.this.h.a())
        return paramInt;
      return RecyclerView.this.c.b(paramInt);
    }

    public List<RecyclerView.u> b()
    {
      return this.e;
    }

    void b(int paramInt1, int paramInt2)
    {
      int j = this.b.size();
      int i = 0;
      while (i < j)
      {
        RecyclerView.u localu = (RecyclerView.u)this.b.get(i);
        if ((localu != null) && (localu.b >= paramInt1))
          localu.a(paramInt2, true);
        i += 1;
      }
    }

    void b(int paramInt1, int paramInt2, boolean paramBoolean)
    {
      int i = this.b.size() - 1;
      if (i >= 0)
      {
        RecyclerView.u localu = (RecyclerView.u)this.b.get(i);
        if (localu != null)
        {
          if (localu.b < paramInt1 + paramInt2)
            break label63;
          localu.a(-paramInt2, paramBoolean);
        }
        while (true)
        {
          i -= 1;
          break;
          label63: if (localu.b < paramInt1)
            continue;
          localu.b(8);
          d(i);
        }
      }
    }

    void b(View paramView)
    {
      paramView = RecyclerView.d(paramView);
      RecyclerView.u.a(paramView, null);
      RecyclerView.u.a(paramView, false);
      paramView.l();
      b(paramView);
    }

    void b(RecyclerView.u paramu)
    {
      boolean bool = true;
      int j = 0;
      if ((paramu.i()) || (paramu.a.getParent() != null))
      {
        StringBuilder localStringBuilder = new StringBuilder().append("Scrapped or attached views may not be recycled. isScrap:").append(paramu.i()).append(" isAttached:");
        if (paramu.a.getParent() != null);
        while (true)
        {
          throw new IllegalArgumentException(bool);
          bool = false;
        }
      }
      if (paramu.r())
        throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + paramu);
      if (paramu.c())
        throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.");
      bool = RecyclerView.u.c(paramu);
      int i;
      if ((RecyclerView.f(RecyclerView.this) != null) && (bool) && (RecyclerView.f(RecyclerView.this).b(paramu)))
      {
        i = 1;
        if ((i == 0) && (!paramu.w()))
          break label292;
        if (paramu.a(14))
          break label287;
        i = this.b.size();
        if ((i == this.f) && (i > 0))
          d(0);
        if (i >= this.f)
          break label287;
        this.b.add(paramu);
        i = 1;
        label238: if (i != 0)
          break label284;
        c(paramu);
        j = 1;
      }
      while (true)
      {
        RecyclerView.this.e.g(paramu);
        if ((i == 0) && (j == 0) && (bool))
          paramu.k = null;
        return;
        i = 0;
        break;
        label284: continue;
        label287: i = 0;
        break label238;
        label292: i = 0;
      }
    }

    public View c(int paramInt)
    {
      return a(paramInt, false);
    }

    void c()
    {
      int i = this.b.size() - 1;
      while (i >= 0)
      {
        d(i);
        i -= 1;
      }
      this.b.clear();
    }

    void c(int paramInt1, int paramInt2)
    {
      int i = this.b.size() - 1;
      if (i >= 0)
      {
        RecyclerView.u localu = (RecyclerView.u)this.b.get(i);
        if (localu == null);
        while (true)
        {
          i -= 1;
          break;
          int j = localu.d();
          if ((j < paramInt1) || (j >= paramInt1 + paramInt2))
            continue;
          localu.b(2);
          d(i);
        }
      }
    }

    void c(View paramView)
    {
      paramView = RecyclerView.d(paramView);
      if ((paramView.a(12)) || (!paramView.x()) || (RecyclerView.a(RecyclerView.this, paramView)))
      {
        if ((paramView.n()) && (!paramView.q()) && (!RecyclerView.f(RecyclerView.this).b()))
          throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.");
        paramView.a(this, false);
        this.a.add(paramView);
        return;
      }
      if (this.d == null)
        this.d = new ArrayList();
      paramView.a(this, true);
      this.d.add(paramView);
    }

    void c(RecyclerView.u paramu)
    {
      af.a(paramu.a, null);
      e(paramu);
      paramu.k = null;
      f().a(paramu);
    }

    int d()
    {
      return this.a.size();
    }

    void d(int paramInt)
    {
      c((RecyclerView.u)this.b.get(paramInt));
      this.b.remove(paramInt);
    }

    void d(RecyclerView.u paramu)
    {
      if (RecyclerView.u.d(paramu))
        this.d.remove(paramu);
      while (true)
      {
        RecyclerView.u.a(paramu, null);
        RecyclerView.u.a(paramu, false);
        paramu.l();
        return;
        this.a.remove(paramu);
      }
    }

    View e(int paramInt)
    {
      return ((RecyclerView.u)this.a.get(paramInt)).a;
    }

    void e()
    {
      this.a.clear();
      if (this.d != null)
        this.d.clear();
    }

    void e(RecyclerView.u paramu)
    {
      if (RecyclerView.r(RecyclerView.this) != null)
        RecyclerView.r(RecyclerView.this).a(paramu);
      if (RecyclerView.f(RecyclerView.this) != null)
        RecyclerView.f(RecyclerView.this).a(paramu);
      if (RecyclerView.this.h != null)
        RecyclerView.this.e.g(paramu);
    }

    RecyclerView.m f()
    {
      if (this.g == null)
        this.g = new RecyclerView.m();
      return this.g;
    }

    RecyclerView.u f(int paramInt)
    {
      int j = 0;
      int k;
      if (this.d != null)
      {
        k = this.d.size();
        if (k != 0);
      }
      else
      {
        return null;
      }
      int i = 0;
      RecyclerView.u localu;
      while (i < k)
      {
        localu = (RecyclerView.u)this.d.get(i);
        if ((!localu.k()) && (localu.d() == paramInt))
        {
          localu.b(32);
          return localu;
        }
        i += 1;
      }
      if (RecyclerView.f(RecyclerView.this).b())
      {
        paramInt = RecyclerView.this.c.b(paramInt);
        if ((paramInt > 0) && (paramInt < RecyclerView.f(RecyclerView.this).a()))
        {
          long l = RecyclerView.f(RecyclerView.this).b(paramInt);
          paramInt = j;
          while (paramInt < k)
          {
            localu = (RecyclerView.u)this.d.get(paramInt);
            if ((!localu.k()) && (localu.g() == l))
            {
              localu.b(32);
              return localu;
            }
            paramInt += 1;
          }
        }
      }
      return null;
    }

    void g()
    {
      int j = this.b.size();
      int i = 0;
      while (i < j)
      {
        RecyclerView.u localu = (RecyclerView.u)this.b.get(i);
        if (localu != null)
          localu.b(512);
        i += 1;
      }
    }

    void h()
    {
      int j;
      int i;
      if ((RecyclerView.f(RecyclerView.this) != null) && (RecyclerView.f(RecyclerView.this).b()))
      {
        j = this.b.size();
        i = 0;
      }
      while (i < j)
      {
        RecyclerView.u localu = (RecyclerView.u)this.b.get(i);
        if (localu != null)
        {
          localu.b(6);
          localu.a(null);
        }
        i += 1;
        continue;
        c();
      }
    }

    void i()
    {
      int j = 0;
      int k = this.b.size();
      int i = 0;
      while (i < k)
      {
        ((RecyclerView.u)this.b.get(i)).a();
        i += 1;
      }
      k = this.a.size();
      i = 0;
      while (i < k)
      {
        ((RecyclerView.u)this.a.get(i)).a();
        i += 1;
      }
      if (this.d != null)
      {
        k = this.d.size();
        i = j;
        while (i < k)
        {
          ((RecyclerView.u)this.d.get(i)).a();
          i += 1;
        }
      }
    }

    void j()
    {
      int j = this.b.size();
      int i = 0;
      while (i < j)
      {
        RecyclerView.i locali = (RecyclerView.i)((RecyclerView.u)this.b.get(i)).a.getLayoutParams();
        if (locali != null)
          locali.c = true;
        i += 1;
      }
    }
  }

  public static abstract interface o
  {
    public abstract void a(RecyclerView.u paramu);
  }

  private class p extends RecyclerView.c
  {
    private p()
    {
    }

    public void a()
    {
      RecyclerView.this.a(null);
      if (RecyclerView.f(RecyclerView.this).b())
      {
        RecyclerView.r.a(RecyclerView.this.h, true);
        RecyclerView.l(RecyclerView.this);
      }
      while (true)
      {
        if (!RecyclerView.this.c.d())
          RecyclerView.this.requestLayout();
        return;
        RecyclerView.r.a(RecyclerView.this.h, true);
        RecyclerView.l(RecyclerView.this);
      }
    }

    public void a(int paramInt1, int paramInt2, int paramInt3)
    {
      RecyclerView.this.a(null);
      if (RecyclerView.this.c.a(paramInt1, paramInt2, paramInt3))
        b();
    }

    public void a(int paramInt1, int paramInt2, Object paramObject)
    {
      RecyclerView.this.a(null);
      if (RecyclerView.this.c.a(paramInt1, paramInt2, paramObject))
        b();
    }

    void b()
    {
      if ((RecyclerView.m(RecyclerView.this)) && (RecyclerView.n(RecyclerView.this)) && (RecyclerView.o(RecyclerView.this)))
      {
        af.a(RecyclerView.this, RecyclerView.p(RecyclerView.this));
        return;
      }
      RecyclerView.c(RecyclerView.this, true);
      RecyclerView.this.requestLayout();
    }

    public void b(int paramInt1, int paramInt2)
    {
      RecyclerView.this.a(null);
      if (RecyclerView.this.c.b(paramInt1, paramInt2))
        b();
    }

    public void c(int paramInt1, int paramInt2)
    {
      RecyclerView.this.a(null);
      if (RecyclerView.this.c.c(paramInt1, paramInt2))
        b();
    }
  }

  public static abstract class q
  {
    private int a;
    private RecyclerView b;
    private RecyclerView.h c;
    private boolean d;
    private boolean e;
    private View f;
    private final a g;

    private void a(int paramInt1, int paramInt2)
    {
      RecyclerView localRecyclerView = this.b;
      if ((!this.e) || (this.a == -1) || (localRecyclerView == null))
        a();
      this.d = false;
      if (this.f != null)
      {
        if (a(this.f) != this.a)
          break label151;
        a(this.f, localRecyclerView.h, this.g);
        a.a(this.g, localRecyclerView);
        a();
      }
      while (true)
      {
        if (this.e)
        {
          a(paramInt1, paramInt2, localRecyclerView.h, this.g);
          boolean bool = this.g.a();
          a.a(this.g, localRecyclerView);
          if (bool)
          {
            if (!this.e)
              break;
            this.d = true;
            RecyclerView.t(localRecyclerView).a();
          }
        }
        return;
        label151: Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
        this.f = null;
      }
      a();
    }

    public int a(View paramView)
    {
      return this.b.g(paramView);
    }

    protected final void a()
    {
      if (!this.e)
        return;
      e();
      RecyclerView.r.d(this.b.h, -1);
      this.f = null;
      this.a = -1;
      this.d = false;
      this.e = false;
      RecyclerView.h.a(this.c, this);
      this.c = null;
      this.b = null;
    }

    public void a(int paramInt)
    {
      this.a = paramInt;
    }

    protected abstract void a(int paramInt1, int paramInt2, RecyclerView.r paramr, a parama);

    protected abstract void a(View paramView, RecyclerView.r paramr, a parama);

    protected void b(View paramView)
    {
      if (a(paramView) == d())
        this.f = paramView;
    }

    public boolean b()
    {
      return this.d;
    }

    public boolean c()
    {
      return this.e;
    }

    public int d()
    {
      return this.a;
    }

    protected abstract void e();

    public static class a
    {
      private int a;
      private int b;
      private int c;
      private int d;
      private Interpolator e;
      private boolean f;
      private int g;

      private void a(RecyclerView paramRecyclerView)
      {
        if (this.d >= 0)
        {
          int i = this.d;
          this.d = -1;
          RecyclerView.c(paramRecyclerView, i);
          this.f = false;
          return;
        }
        if (this.f)
        {
          b();
          if (this.e == null)
            if (this.c == -2147483648)
              RecyclerView.t(paramRecyclerView).b(this.a, this.b);
          while (true)
          {
            this.g += 1;
            if (this.g > 10)
              Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
            this.f = false;
            return;
            RecyclerView.t(paramRecyclerView).a(this.a, this.b, this.c);
            continue;
            RecyclerView.t(paramRecyclerView).a(this.a, this.b, this.c, this.e);
          }
        }
        this.g = 0;
      }

      private void b()
      {
        if ((this.e != null) && (this.c < 1))
          throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
        if (this.c < 1)
          throw new IllegalStateException("Scroll duration must be a positive number");
      }

      boolean a()
      {
        return this.d >= 0;
      }
    }
  }

  public static class r
  {
    int a = 0;
    private int b = -1;
    private int c = 1;
    private SparseArray<Object> d;
    private int e = 0;
    private int f = 0;
    private boolean g = false;
    private boolean h = false;
    private boolean i = false;
    private boolean j = false;
    private boolean k = false;
    private boolean l = false;

    void a(int paramInt)
    {
      if ((this.c & paramInt) == 0)
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(paramInt) + " but it is " + Integer.toBinaryString(this.c));
    }

    public boolean a()
    {
      return this.h;
    }

    public boolean b()
    {
      return this.j;
    }

    public boolean c()
    {
      return this.b != -1;
    }

    public int d()
    {
      if (this.h)
        return this.e - this.f;
      return this.a;
    }

    public String toString()
    {
      return "State{mTargetPosition=" + this.b + ", mData=" + this.d + ", mItemCount=" + this.a + ", mPreviousLayoutItemCount=" + this.e + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f + ", mStructureChanged=" + this.g + ", mInPreLayout=" + this.h + ", mRunSimpleAnimations=" + this.i + ", mRunPredictiveAnimations=" + this.j + '}';
    }
  }

  public static abstract class s
  {
    public abstract View a(RecyclerView.n paramn, int paramInt1, int paramInt2);
  }

  private class t
    implements Runnable
  {
    private int b;
    private int c;
    private android.support.v4.widget.t d = android.support.v4.widget.t.a(RecyclerView.this.getContext(), RecyclerView.q());
    private Interpolator e = RecyclerView.q();
    private boolean f = false;
    private boolean g = false;

    public t()
    {
    }

    private float a(float paramFloat)
    {
      return (float)Math.sin((float)((paramFloat - 0.5F) * 0.47123891676382D));
    }

    private int b(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      int j = Math.abs(paramInt1);
      int k = Math.abs(paramInt2);
      int i;
      if (j > k)
      {
        i = 1;
        paramInt3 = (int)Math.sqrt(paramInt3 * paramInt3 + paramInt4 * paramInt4);
        paramInt2 = (int)Math.sqrt(paramInt1 * paramInt1 + paramInt2 * paramInt2);
        if (i == 0)
          break label140;
      }
      label140: for (paramInt1 = RecyclerView.this.getWidth(); ; paramInt1 = RecyclerView.this.getHeight())
      {
        paramInt4 = paramInt1 / 2;
        float f3 = Math.min(1.0F, paramInt2 * 1.0F / paramInt1);
        float f1 = paramInt4;
        float f2 = paramInt4;
        f3 = a(f3);
        if (paramInt3 <= 0)
          break label151;
        paramInt1 = Math.round(1000.0F * Math.abs((f3 * f2 + f1) / paramInt3)) * 4;
        return Math.min(paramInt1, 2000);
        i = 0;
        break;
      }
      label151: if (i != 0);
      for (paramInt2 = j; ; paramInt2 = k)
      {
        paramInt1 = (int)((paramInt2 / paramInt1 + 1.0F) * 300.0F);
        break;
      }
    }

    private void c()
    {
      this.g = false;
      this.f = true;
    }

    private void d()
    {
      this.f = false;
      if (this.g)
        a();
    }

    void a()
    {
      if (this.f)
      {
        this.g = true;
        return;
      }
      RecyclerView.this.removeCallbacks(this);
      af.a(RecyclerView.this, this);
    }

    public void a(int paramInt1, int paramInt2)
    {
      RecyclerView.b(RecyclerView.this, 2);
      this.c = 0;
      this.b = 0;
      this.d.a(0, 0, paramInt1, paramInt2, -2147483648, 2147483647, -2147483648, 2147483647);
      a();
    }

    public void a(int paramInt1, int paramInt2, int paramInt3)
    {
      a(paramInt1, paramInt2, paramInt3, RecyclerView.q());
    }

    public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      a(paramInt1, paramInt2, b(paramInt1, paramInt2, paramInt3, paramInt4));
    }

    public void a(int paramInt1, int paramInt2, int paramInt3, Interpolator paramInterpolator)
    {
      if (this.e != paramInterpolator)
      {
        this.e = paramInterpolator;
        this.d = android.support.v4.widget.t.a(RecyclerView.this.getContext(), paramInterpolator);
      }
      RecyclerView.b(RecyclerView.this, 2);
      this.c = 0;
      this.b = 0;
      this.d.a(0, 0, paramInt1, paramInt2, paramInt3);
      a();
    }

    public void b()
    {
      RecyclerView.this.removeCallbacks(this);
      this.d.h();
    }

    public void b(int paramInt1, int paramInt2)
    {
      a(paramInt1, paramInt2, 0, 0);
    }

    public void run()
    {
      if (RecyclerView.this.f == null)
      {
        b();
        return;
      }
      c();
      RecyclerView.c(RecyclerView.this);
      android.support.v4.widget.t localt = this.d;
      RecyclerView.q localq = RecyclerView.this.f.r;
      int i6;
      int i7;
      int i4;
      int i5;
      int i1;
      int k;
      int j;
      int i3;
      int i;
      int n;
      int m;
      if (localt.g())
      {
        i6 = localt.b();
        i7 = localt.c();
        i4 = i6 - this.b;
        i5 = i7 - this.c;
        i1 = 0;
        k = 0;
        i2 = 0;
        j = 0;
        this.b = i6;
        this.c = i7;
        i3 = 0;
        i = 0;
        n = 0;
        m = 0;
        if (RecyclerView.f(RecyclerView.this) == null)
          break label723;
        RecyclerView.this.b();
        RecyclerView.g(RecyclerView.this);
        android.support.v4.e.j.a("RV Scroll");
        if (i4 != 0)
        {
          k = RecyclerView.this.f.a(i4, RecyclerView.this.b, RecyclerView.this.h);
          i = i4 - k;
        }
        if (i5 != 0)
        {
          j = RecyclerView.this.f.b(i5, RecyclerView.this.b, RecyclerView.this.h);
          m = i5 - j;
        }
        android.support.v4.e.j.a();
        RecyclerView.h(RecyclerView.this);
        RecyclerView.i(RecyclerView.this);
        RecyclerView.this.a(false);
        n = m;
        i2 = j;
        i3 = i;
        i1 = k;
        if (localq == null)
          break label723;
        n = m;
        i2 = j;
        i3 = i;
        i1 = k;
        if (localq.b())
          break label723;
        n = m;
        i2 = j;
        i3 = i;
        i1 = k;
        if (!localq.c())
          break label723;
        n = RecyclerView.this.h.d();
        if (n != 0)
          break label655;
        localq.a();
        n = j;
        j = i;
        if (!RecyclerView.j(RecyclerView.this).isEmpty())
          RecyclerView.this.invalidate();
        if (af.a(RecyclerView.this) != 2)
          RecyclerView.a(RecyclerView.this, i4, i5);
        if ((j != 0) || (m != 0))
        {
          i1 = (int)localt.f();
          if (j == i6)
            break label795;
          if (j >= 0)
            break label740;
          i = -i1;
        }
      }
      label406: label795: for (int i2 = i; ; i2 = 0)
      {
        if (m != i7)
          if (m < 0)
            i = -i1;
        while (true)
        {
          label425: if (af.a(RecyclerView.this) != 2)
            RecyclerView.this.c(i2, i);
          if (((i2 != 0) || (j == i6) || (localt.d() == 0)) && ((i != 0) || (m == i7) || (localt.e() == 0)))
            localt.h();
          if ((k != 0) || (n != 0))
            RecyclerView.this.h(k, n);
          if (!RecyclerView.k(RecyclerView.this))
            RecyclerView.this.invalidate();
          if ((i5 != 0) && (RecyclerView.this.f.f()) && (n == i5))
          {
            i = 1;
            label552: if ((i4 == 0) || (!RecyclerView.this.f.e()) || (k != i4))
              break label773;
            j = 1;
            label578: if (((i4 != 0) || (i5 != 0)) && (j == 0) && (i == 0))
              break label778;
            i = 1;
            label598: if ((!localt.a()) && (i != 0))
              break label783;
            RecyclerView.b(RecyclerView.this, 0);
          }
          while (true)
          {
            if (localq != null)
            {
              if (localq.b())
                RecyclerView.q.a(localq, 0, 0);
              if (!this.g)
                localq.a();
            }
            d();
            return;
            if (localq.d() >= n)
            {
              localq.a(n - 1);
              RecyclerView.q.a(localq, i4 - i, i5 - m);
              n = j;
              j = i;
              break;
            }
            RecyclerView.q.a(localq, i4 - i, i5 - m);
            i1 = k;
            i3 = i;
            i2 = j;
            n = m;
            label723: j = i3;
            m = n;
            n = i2;
            k = i1;
            break;
            label740: if (j > 0)
            {
              i = i1;
              break label406;
            }
            i = 0;
            break label406;
            i = i1;
            if (m > 0)
              break label425;
            i = 0;
            break label425;
            i = 0;
            break label552;
            j = 0;
            break label578;
            i = 0;
            break label598;
            a();
          }
          i = 0;
        }
      }
    }
  }

  public static abstract class u
  {
    private static final List<Object> m = Collections.EMPTY_LIST;
    public final View a;
    int b = -1;
    int c = -1;
    long d = -1L;
    int e = -1;
    int f = -1;
    u g = null;
    u h = null;
    List<Object> i = null;
    List<Object> j = null;
    RecyclerView k;
    private int l;
    private int n = 0;
    private RecyclerView.n o = null;
    private boolean p = false;
    private int q = 0;

    public u(View paramView)
    {
      if (paramView == null)
        throw new IllegalArgumentException("itemView may not be null");
      this.a = paramView;
    }

    private void A()
    {
      af.c(this.a, this.q);
      this.q = 0;
    }

    private boolean B()
    {
      return (this.l & 0x10) != 0;
    }

    private boolean C()
    {
      return ((this.l & 0x10) == 0) && (af.c(this.a));
    }

    private void y()
    {
      if (this.i == null)
      {
        this.i = new ArrayList();
        this.j = Collections.unmodifiableList(this.i);
      }
    }

    private void z()
    {
      this.q = af.e(this.a);
      af.c(this.a, 4);
    }

    void a()
    {
      this.c = -1;
      this.f = -1;
    }

    void a(int paramInt1, int paramInt2)
    {
      this.l = (this.l & (paramInt2 ^ 0xFFFFFFFF) | paramInt1 & paramInt2);
    }

    void a(int paramInt1, int paramInt2, boolean paramBoolean)
    {
      b(8);
      a(paramInt2, paramBoolean);
      this.b = paramInt1;
    }

    void a(int paramInt, boolean paramBoolean)
    {
      if (this.c == -1)
        this.c = this.b;
      if (this.f == -1)
        this.f = this.b;
      if (paramBoolean)
        this.f += paramInt;
      this.b += paramInt;
      if (this.a.getLayoutParams() != null)
        ((RecyclerView.i)this.a.getLayoutParams()).c = true;
    }

    void a(Object paramObject)
    {
      if (paramObject == null)
        b(1024);
      do
        return;
      while ((this.l & 0x400) != 0);
      y();
      this.i.add(paramObject);
    }

    void a(RecyclerView.n paramn, boolean paramBoolean)
    {
      this.o = paramn;
      this.p = paramBoolean;
    }

    public final void a(boolean paramBoolean)
    {
      int i1;
      if (paramBoolean)
      {
        i1 = this.n - 1;
        this.n = i1;
        if (this.n >= 0)
          break label64;
        this.n = 0;
        Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
      }
      label64: 
      do
      {
        return;
        i1 = this.n + 1;
        break;
        if ((paramBoolean) || (this.n != 1))
          continue;
        this.l |= 16;
        return;
      }
      while ((!paramBoolean) || (this.n != 0));
      this.l &= -17;
    }

    boolean a(int paramInt)
    {
      return (this.l & paramInt) != 0;
    }

    void b()
    {
      if (this.c == -1)
        this.c = this.b;
    }

    void b(int paramInt)
    {
      this.l |= paramInt;
    }

    boolean c()
    {
      return (this.l & 0x80) != 0;
    }

    public final int d()
    {
      if (this.f == -1)
        return this.b;
      return this.f;
    }

    public final int e()
    {
      if (this.k == null)
        return -1;
      return RecyclerView.b(this.k, this);
    }

    public final int f()
    {
      return this.c;
    }

    public final long g()
    {
      return this.d;
    }

    public final int h()
    {
      return this.e;
    }

    boolean i()
    {
      return this.o != null;
    }

    void j()
    {
      this.o.d(this);
    }

    boolean k()
    {
      return (this.l & 0x20) != 0;
    }

    void l()
    {
      this.l &= -33;
    }

    void m()
    {
      this.l &= -257;
    }

    boolean n()
    {
      return (this.l & 0x4) != 0;
    }

    boolean o()
    {
      return (this.l & 0x2) != 0;
    }

    boolean p()
    {
      return (this.l & 0x1) != 0;
    }

    boolean q()
    {
      return (this.l & 0x8) != 0;
    }

    boolean r()
    {
      return (this.l & 0x100) != 0;
    }

    boolean s()
    {
      return ((this.l & 0x200) != 0) || (n());
    }

    void t()
    {
      if (this.i != null)
        this.i.clear();
      this.l &= -1025;
    }

    public String toString()
    {
      StringBuilder localStringBuilder1 = new StringBuilder("ViewHolder{" + Integer.toHexString(hashCode()) + " position=" + this.b + " id=" + this.d + ", oldPos=" + this.c + ", pLpos:" + this.f);
      StringBuilder localStringBuilder2;
      if (i())
      {
        localStringBuilder2 = localStringBuilder1.append(" scrap ");
        if (!this.p)
          break label281;
      }
      label281: for (String str = "[changeScrap]"; ; str = "[attachedScrap]")
      {
        localStringBuilder2.append(str);
        if (n())
          localStringBuilder1.append(" invalid");
        if (!p())
          localStringBuilder1.append(" unbound");
        if (o())
          localStringBuilder1.append(" update");
        if (q())
          localStringBuilder1.append(" removed");
        if (c())
          localStringBuilder1.append(" ignored");
        if (r())
          localStringBuilder1.append(" tmpDetached");
        if (!w())
          localStringBuilder1.append(" not recyclable(" + this.n + ")");
        if (s())
          localStringBuilder1.append(" undefined adapter position");
        if (this.a.getParent() == null)
          localStringBuilder1.append(" no parent");
        localStringBuilder1.append("}");
        return localStringBuilder1.toString();
      }
    }

    List<Object> u()
    {
      if ((this.l & 0x400) == 0)
      {
        if ((this.i == null) || (this.i.size() == 0))
          return m;
        return this.j;
      }
      return m;
    }

    void v()
    {
      this.l = 0;
      this.b = -1;
      this.c = -1;
      this.d = -1L;
      this.f = -1;
      this.n = 0;
      this.g = null;
      this.h = null;
      t();
      this.q = 0;
    }

    public final boolean w()
    {
      return ((this.l & 0x10) == 0) && (!af.c(this.a));
    }

    boolean x()
    {
      return (this.l & 0x2) != 0;
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.support.widget.RecyclerView
 * JD-Core Version:    0.6.0
 */