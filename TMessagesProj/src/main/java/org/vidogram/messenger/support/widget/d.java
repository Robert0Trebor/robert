package org.vidogram.messenger.support.widget;

import android.content.Context;
import android.graphics.Rect;
import android.support.v4.view.a.c;
import android.support.v4.view.a.c.m;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import java.util.Arrays;

public class d extends LinearLayoutManager
{
  boolean a = false;
  int b = -1;
  int[] c;
  View[] d;
  final SparseIntArray e = new SparseIntArray();
  final SparseIntArray f = new SparseIntArray();
  c g = new a();
  final Rect h = new Rect();

  public d(Context paramContext, int paramInt)
  {
    super(paramContext);
    a(paramInt);
  }

  private void J()
  {
    this.e.clear();
    this.f.clear();
  }

  private void K()
  {
    int j = t();
    int i = 0;
    while (i < j)
    {
      b localb = (b)h(i).getLayoutParams();
      int k = localb.e();
      this.e.put(k, localb.b());
      this.f.put(k, localb.a());
      i += 1;
    }
  }

  private void L()
  {
    if (g() == 1);
    for (int i = w() - A() - y(); ; i = x() - B() - z())
    {
      l(i);
      return;
    }
  }

  private void M()
  {
    if ((this.d == null) || (this.d.length != this.b))
      this.d = new View[this.b];
  }

  private int a(RecyclerView.n paramn, RecyclerView.r paramr, int paramInt)
  {
    if (!paramr.a())
      return this.g.c(paramInt, this.b);
    int i = paramn.b(paramInt);
    if (i == -1)
    {
      Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + paramInt);
      return 0;
    }
    return this.g.c(i, this.b);
  }

  private void a(float paramFloat, int paramInt)
  {
    l(Math.max(Math.round(this.b * paramFloat), paramInt));
  }

  private void a(View paramView, int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2)
  {
    a(paramView, this.h);
    RecyclerView.i locali = (RecyclerView.i)paramView.getLayoutParams();
    int i;
    if (!paramBoolean1)
    {
      i = paramInt1;
      if (this.i != 1);
    }
    else
    {
      i = b(paramInt1, locali.leftMargin + this.h.left, locali.rightMargin + this.h.right);
    }
    if (!paramBoolean1)
    {
      paramInt1 = paramInt2;
      if (this.i != 0);
    }
    else
    {
      paramInt1 = b(paramInt2, locali.topMargin + this.h.top, locali.bottomMargin + this.h.bottom);
    }
    if (paramBoolean2);
    for (paramBoolean1 = a(paramView, i, paramInt1, locali); ; paramBoolean1 = b(paramView, i, paramInt1, locali))
    {
      if (paramBoolean1)
        paramView.measure(i, paramInt1);
      return;
    }
  }

  private void a(RecyclerView.n paramn, RecyclerView.r paramr, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    int i;
    int j;
    int k;
    label43: b localb;
    if (paramBoolean)
    {
      i = 1;
      paramInt2 = 0;
      j = paramInt1;
      paramInt1 = paramInt2;
      if ((this.i != 1) || (!h()))
        break label150;
      paramInt2 = this.b - 1;
      k = -1;
      if (paramInt1 == j)
        return;
      View localView = this.d[paramInt1];
      localb = (b)localView.getLayoutParams();
      b.a(localb, c(paramn, paramr, d(localView)));
      if ((k != -1) || (b.b(localb) <= 1))
        break label159;
      b.b(localb, paramInt2 - (b.b(localb) - 1));
    }
    while (true)
    {
      paramInt2 += b.b(localb) * k;
      paramInt1 += i;
      break label43;
      paramInt1 -= 1;
      i = -1;
      j = -1;
      break;
      label150: paramInt2 = 0;
      k = 1;
      break label43;
      label159: b.b(localb, paramInt2);
    }
  }

  static int[] a(int[] paramArrayOfInt, int paramInt1, int paramInt2)
  {
    int k = 0;
    int[] arrayOfInt;
    if ((paramArrayOfInt != null) && (paramArrayOfInt.length == paramInt1 + 1))
    {
      arrayOfInt = paramArrayOfInt;
      if (paramArrayOfInt[(paramArrayOfInt.length - 1)] == paramInt2);
    }
    else
    {
      arrayOfInt = new int[paramInt1 + 1];
    }
    arrayOfInt[0] = 0;
    int m = paramInt2 / paramInt1;
    int n = paramInt2 % paramInt1;
    int i = 1;
    int j = 0;
    paramInt2 = k;
    if (i <= paramInt1)
    {
      paramInt2 += n;
      if ((paramInt2 <= 0) || (paramInt1 - paramInt2 >= n))
        break label113;
      k = m + 1;
      paramInt2 -= paramInt1;
    }
    while (true)
    {
      j += k;
      arrayOfInt[i] = j;
      i += 1;
      break;
      return arrayOfInt;
      label113: k = m;
    }
  }

  private int b(int paramInt1, int paramInt2, int paramInt3)
  {
    if ((paramInt2 == 0) && (paramInt3 == 0));
    int i;
    do
    {
      return paramInt1;
      i = View.MeasureSpec.getMode(paramInt1);
    }
    while ((i != -2147483648) && (i != 1073741824));
    return View.MeasureSpec.makeMeasureSpec(Math.max(0, View.MeasureSpec.getSize(paramInt1) - paramInt2 - paramInt3), i);
  }

  private int b(RecyclerView.n paramn, RecyclerView.r paramr, int paramInt)
  {
    if (!paramr.a())
      i = this.g.b(paramInt, this.b);
    int j;
    do
    {
      return i;
      j = this.f.get(paramInt, -1);
      i = j;
    }
    while (j != -1);
    int i = paramn.b(paramInt);
    if (i == -1)
    {
      Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + paramInt);
      return 0;
    }
    return this.g.b(i, this.b);
  }

  private void b(RecyclerView.n paramn, RecyclerView.r paramr, LinearLayoutManager.a parama, int paramInt)
  {
    int i = 1;
    if (paramInt == 1);
    while (true)
    {
      paramInt = b(paramn, paramr, parama.a);
      if (i != 0)
      {
        while ((paramInt > 0) && (parama.a > 0))
        {
          parama.a -= 1;
          paramInt = b(paramn, paramr, parama.a);
        }
        i = 0;
        continue;
      }
      int k = paramr.d();
      i = parama.a;
      while (i < k - 1)
      {
        int j = b(paramn, paramr, i + 1);
        if (j <= paramInt)
          break;
        i += 1;
        paramInt = j;
      }
      parama.a = i;
    }
  }

  private int c(RecyclerView.n paramn, RecyclerView.r paramr, int paramInt)
  {
    if (!paramr.a())
      i = this.g.a(paramInt);
    int j;
    do
    {
      return i;
      j = this.e.get(paramInt, -1);
      i = j;
    }
    while (j != -1);
    int i = paramn.b(paramInt);
    if (i == -1)
    {
      Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + paramInt);
      return 1;
    }
    return this.g.a(i);
  }

  private void l(int paramInt)
  {
    this.c = a(this.c, this.b, paramInt);
  }

  public int a(int paramInt, RecyclerView.n paramn, RecyclerView.r paramr)
  {
    L();
    M();
    return super.a(paramInt, paramn, paramr);
  }

  public int a(RecyclerView.n paramn, RecyclerView.r paramr)
  {
    if (this.i == 0)
      return this.b;
    if (paramr.d() < 1)
      return 0;
    return a(paramn, paramr, paramr.d() - 1) + 1;
  }

  public View a(View paramView, int paramInt, RecyclerView.n paramn, RecyclerView.r paramr)
  {
    View localView = e(paramView);
    if (localView == null)
    {
      paramn = null;
      return paramn;
    }
    b localb = (b)localView.getLayoutParams();
    int i4 = b.a(localb);
    int i5 = b.a(localb) + b.b(localb);
    if (super.a(paramView, paramInt, paramn, paramr) == null)
      return null;
    int i8;
    label83: int m;
    int k;
    if (e(paramInt) == 1)
    {
      i8 = 1;
      if (i8 == this.k)
        break label162;
      paramInt = 1;
      if (paramInt == 0)
        break label167;
      paramInt = t() - 1;
      m = -1;
      k = -1;
      label100: if ((this.i != 1) || (!h()))
        break label181;
    }
    int j;
    int i;
    int i1;
    label132: label162: label167: label181: for (int n = 1; ; n = 0)
    {
      paramView = null;
      j = -1;
      i = 0;
      i1 = paramInt;
      paramInt = j;
      if (i1 != k)
      {
        paramr = h(i1);
        if (paramr != localView)
          break label187;
      }
      return paramView;
      i8 = 0;
      break;
      paramInt = 0;
      break label83;
      k = t();
      paramInt = 0;
      m = 1;
      break label100;
    }
    label187: if (!paramr.isFocusable())
    {
      j = i;
      i = paramInt;
      paramInt = j;
    }
    while (true)
    {
      i1 += m;
      j = i;
      i = paramInt;
      paramInt = j;
      break label132;
      localb = (b)paramr.getLayoutParams();
      int i6 = b.a(localb);
      int i7 = b.a(localb) + b.b(localb);
      if (i6 == i4)
      {
        paramn = paramr;
        if (i7 == i5)
          break;
      }
      int i3 = 0;
      if (paramView == null)
        j = 1;
      label350: 
      do
      {
        while (true)
        {
          if (j == 0)
            break label393;
          i = b.a(localb);
          paramInt = Math.min(i7, i5) - Math.max(i6, i4);
          paramView = paramr;
          break;
          j = Math.max(i6, i4);
          i2 = Math.min(i7, i5) - j;
          if (i2 <= i)
            break label350;
          j = 1;
        }
        j = i3;
      }
      while (i2 != i);
      if (i6 > paramInt);
      for (int i2 = 1; ; i2 = 0)
      {
        j = i3;
        if (n != i2)
          break;
        j = 1;
        break;
      }
      label393: j = paramInt;
      paramInt = i;
      i = j;
    }
  }

  View a(RecyclerView.n paramn, RecyclerView.r paramr, int paramInt1, int paramInt2, int paramInt3)
  {
    Object localObject2 = null;
    i();
    int j = this.j.c();
    int k = this.j.d();
    int i;
    Object localObject1;
    label37: Object localObject3;
    if (paramInt2 > paramInt1)
    {
      i = 1;
      localObject1 = null;
      if (paramInt1 == paramInt2)
        break label197;
      localObject3 = h(paramInt1);
      int m = d((View)localObject3);
      if ((m < 0) || (m >= paramInt3))
        break label216;
      if (b(paramn, paramr, m) == 0)
        break label119;
      localObject3 = localObject2;
      localObject2 = localObject1;
      localObject1 = localObject3;
    }
    while (true)
    {
      paramInt1 += i;
      localObject3 = localObject2;
      localObject2 = localObject1;
      localObject1 = localObject3;
      break label37;
      i = -1;
      break;
      label119: Object localObject4;
      if (((RecyclerView.i)((View)localObject3).getLayoutParams()).c())
      {
        if (localObject1 == null)
        {
          localObject1 = localObject2;
          localObject2 = localObject3;
          continue;
        }
      }
      else
      {
        if (this.j.a((View)localObject3) < k)
        {
          localObject4 = localObject3;
          if (this.j.b((View)localObject3) >= j);
        }
        else
        {
          if (localObject2 != null)
            break label216;
          localObject2 = localObject1;
          localObject1 = localObject3;
          continue;
          label197: if (localObject2 == null)
            break label209;
        }
        while (true)
        {
          localObject4 = localObject2;
          return localObject4;
          label209: localObject2 = localObject1;
        }
      }
      label216: localObject3 = localObject1;
      localObject1 = localObject2;
      localObject2 = localObject3;
    }
  }

  public RecyclerView.i a()
  {
    if (this.i == 0)
      return new b(-2, -1);
    return new b(-1, -2);
  }

  public RecyclerView.i a(Context paramContext, AttributeSet paramAttributeSet)
  {
    return new b(paramContext, paramAttributeSet);
  }

  public RecyclerView.i a(ViewGroup.LayoutParams paramLayoutParams)
  {
    if ((paramLayoutParams instanceof ViewGroup.MarginLayoutParams))
      return new b((ViewGroup.MarginLayoutParams)paramLayoutParams);
    return new b(paramLayoutParams);
  }

  public void a(int paramInt)
  {
    if (paramInt == this.b)
      return;
    this.a = true;
    if (paramInt < 1)
      throw new IllegalArgumentException("Span count should be at least 1. Provided " + paramInt);
    this.b = paramInt;
    this.g.a();
  }

  public void a(Rect paramRect, int paramInt1, int paramInt2)
  {
    if (this.c == null)
      super.a(paramRect, paramInt1, paramInt2);
    int i = y();
    int j = A() + i;
    int k = z() + B();
    if (this.i == 1)
    {
      i = a(paramInt2, k + paramRect.height(), F());
      paramInt2 = a(paramInt1, j + this.c[(this.c.length - 1)], E());
      paramInt1 = i;
    }
    while (true)
    {
      e(paramInt2, paramInt1);
      return;
      i = a(paramInt1, j + paramRect.width(), E());
      paramInt1 = a(paramInt2, k + this.c[(this.c.length - 1)], F());
      paramInt2 = i;
    }
  }

  public void a(RecyclerView.n paramn, RecyclerView.r paramr, View paramView, c paramc)
  {
    ViewGroup.LayoutParams localLayoutParams = paramView.getLayoutParams();
    if (!(localLayoutParams instanceof b))
    {
      super.a(paramView, paramc);
      return;
    }
    paramView = (b)localLayoutParams;
    int i = a(paramn, paramr, paramView.e());
    if (this.i == 0)
    {
      j = paramView.a();
      k = paramView.b();
      if ((this.b > 1) && (paramView.b() == this.b));
      for (bool = true; ; bool = false)
      {
        paramc.b(c.m.a(j, k, i, 1, bool, false));
        return;
      }
    }
    int j = paramView.a();
    int k = paramView.b();
    if ((this.b > 1) && (paramView.b() == this.b));
    for (boolean bool = true; ; bool = false)
    {
      paramc.b(c.m.a(i, 1, j, k, bool, false));
      return;
    }
  }

  void a(RecyclerView.n paramn, RecyclerView.r paramr, LinearLayoutManager.a parama, int paramInt)
  {
    super.a(paramn, paramr, parama, paramInt);
    L();
    if ((paramr.d() > 0) && (!paramr.a()))
      b(paramn, paramr, parama, paramInt);
    M();
  }

  void a(RecyclerView.n paramn, RecyclerView.r paramr, LinearLayoutManager.c paramc, LinearLayoutManager.b paramb)
  {
    int i3 = this.j.i();
    int j;
    int k;
    label37: boolean bool1;
    label57: int i1;
    int i2;
    int n;
    if (i3 != 1073741824)
    {
      j = 1;
      if (t() <= 0)
        break label225;
      k = this.c[this.b];
      if (j != 0)
        L();
      if (paramc.e != 1)
        break label231;
      bool1 = true;
      i1 = 0;
      i2 = 0;
      i = this.b;
      n = i1;
      m = i2;
      if (!bool1)
      {
        i = b(paramn, paramr, paramc.d) + c(paramn, paramr, paramc.d);
        m = i2;
        n = i1;
      }
    }
    while (true)
    {
      if ((n < this.b) && (paramc.a(paramr)) && (i > 0))
      {
        i2 = paramc.d;
        i1 = c(paramn, paramr, i2);
        if (i1 > this.b)
        {
          throw new IllegalArgumentException("Item at position " + i2 + " requires " + i1 + " spans but GridLayoutManager has only " + this.b + " spans.");
          j = 0;
          break;
          label225: k = 0;
          break label37;
          label231: bool1 = false;
          break label57;
        }
        i -= i1;
        if (i >= 0)
          break label261;
      }
      label261: View localView;
      do
      {
        if (n != 0)
          break;
        paramb.b = true;
        return;
        localView = paramc.a(paramn);
      }
      while (localView == null);
      m += i1;
      this.d[n] = localView;
      n += 1;
    }
    a(paramn, paramr, n, m, bool1);
    int m = 0;
    float f1 = 0.0F;
    int i = 0;
    label351: boolean bool2;
    if (m < n)
    {
      paramn = this.d[m];
      if (paramc.k == null)
        if (bool1)
        {
          b(paramn);
          paramr = (b)paramn.getLayoutParams();
          i2 = this.c[(b.a(paramr) + b.b(paramr))];
          int i4 = this.c[b.a(paramr)];
          if (this.i != 0)
            break label583;
          i1 = paramr.height;
          label399: i2 = a(i2 - i4, i3, 0, i1, false);
          i4 = this.j.f();
          int i5 = this.j.h();
          if (this.i != 1)
            break label592;
          i1 = paramr.height;
          label447: i1 = a(i4, i5, 0, i1, true);
          if (this.i != 1)
            break label607;
          if (paramr.height != -1)
            break label601;
          bool2 = true;
          label479: a(paramn, i2, i1, bool2, false);
          i1 = this.j.c(paramn);
          if (i1 <= i)
            break label1459;
          i = i1;
        }
    }
    label777: label809: label1453: label1459: 
    while (true)
    {
      float f2 = 1.0F * this.j.d(paramn) / b.b(paramr);
      if (f2 > f1)
        f1 = f2;
      while (true)
      {
        m += 1;
        break;
        b(paramn, 0);
        break label351;
        if (bool1)
        {
          a(paramn);
          break label351;
        }
        a(paramn, 0);
        break label351;
        label583: i1 = paramr.width;
        break label399;
        label592: i1 = paramr.width;
        break label447;
        label601: bool2 = false;
        break label479;
        label607: if (paramr.width == -1);
        for (bool2 = true; ; bool2 = false)
        {
          a(paramn, i1, i2, bool2, false);
          break;
        }
        m = i;
        if (j != 0)
        {
          a(f1, k);
          i = 0;
          j = 0;
          m = i;
          if (j < n)
          {
            paramn = this.d[j];
            paramr = (b)paramn.getLayoutParams();
            m = this.c[(b.a(paramr) + b.b(paramr))];
            i1 = this.c[b.a(paramr)];
            if (this.i == 0)
            {
              k = paramr.height;
              label729: m = a(m - i1, 1073741824, 0, k, false);
              i1 = this.j.f();
              i2 = this.j.h();
              if (this.i != 1)
                break label848;
              k = paramr.height;
              k = a(i1, i2, 0, k, true);
              if (this.i != 1)
                break label857;
              a(paramn, m, k, false, true);
              k = this.j.c(paramn);
              if (k <= i)
                break label1453;
              i = k;
            }
          }
        }
        while (true)
        {
          j += 1;
          break;
          k = paramr.width;
          break label729;
          label848: k = paramr.width;
          break label777;
          label857: a(paramn, k, m, false, true);
          break label809;
          k = View.MeasureSpec.makeMeasureSpec(m, 1073741824);
          i = 0;
          if (i < n)
          {
            paramn = this.d[i];
            if (this.j.c(paramn) != m)
            {
              paramr = (b)paramn.getLayoutParams();
              i1 = this.c[(b.a(paramr) + b.b(paramr))];
              i2 = this.c[b.a(paramr)];
              if (this.i != 0)
                break label1003;
              j = paramr.height;
              label959: j = a(i1 - i2, 1073741824, 0, j, false);
              if (this.i != 1)
                break label1012;
              a(paramn, j, k, true, true);
            }
            while (true)
            {
              i += 1;
              break;
              label1003: j = paramr.width;
              break label959;
              label1012: a(paramn, k, j, true, true);
            }
          }
          paramb.a = m;
          j = 0;
          k = 0;
          if (this.i == 1)
            if (paramc.f == -1)
            {
              k = paramc.b;
              m = k - m;
              i = 0;
              j = 0;
              i3 = 0;
              i1 = i;
              i2 = k;
              k = i3;
              i = j;
              j = i1;
              i1 = i2;
              label1101: if (k >= n)
                break label1444;
              paramn = this.d[k];
              paramr = (b)paramn.getLayoutParams();
              if (this.i != 1)
                break label1396;
              if (!h())
                break label1360;
              j = y() + this.c[(b.a(paramr) + b.b(paramr))];
              i2 = this.j.d(paramn);
              i = j;
              j -= i2;
            }
          while (true)
          {
            a(paramn, j + paramr.leftMargin, m + paramr.topMargin, i - paramr.rightMargin, i1 - paramr.bottomMargin);
            if ((paramr.c()) || (paramr.d()))
              paramb.c = true;
            paramb.d |= paramn.isFocusable();
            i2 = k + 1;
            k = j;
            j = i;
            i = k;
            k = i2;
            break label1101;
            i = paramc.b;
            k = i + m;
            i1 = 0;
            j = 0;
            m = i;
            i = i1;
            break;
            if (paramc.f == -1)
            {
              i = paramc.b;
              i1 = i - m;
              m = j;
              j = i1;
              break;
            }
            i1 = paramc.b;
            i = m + i1;
            m = j;
            j = i1;
            break;
            label1360: i = y();
            j = this.c[b.a(paramr)] + i;
            i = this.j.d(paramn) + j;
            continue;
            label1396: m = z();
            m = this.c[b.a(paramr)] + m;
            i1 = this.j.d(paramn) + m;
            i2 = i;
            i = j;
            j = i2;
          }
          Arrays.fill(this.d, null);
          return;
        }
      }
    }
  }

  public void a(RecyclerView paramRecyclerView)
  {
    this.g.a();
  }

  public void a(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
  {
    this.g.a();
  }

  public void a(RecyclerView paramRecyclerView, int paramInt1, int paramInt2, int paramInt3)
  {
    this.g.a();
  }

  public void a(RecyclerView paramRecyclerView, int paramInt1, int paramInt2, Object paramObject)
  {
    this.g.a();
  }

  public void a(c paramc)
  {
    this.g = paramc;
  }

  public void a(boolean paramBoolean)
  {
    if (paramBoolean)
      throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    super.a(false);
  }

  public boolean a(RecyclerView.i parami)
  {
    return parami instanceof b;
  }

  public int b()
  {
    return this.b;
  }

  public int b(int paramInt, RecyclerView.n paramn, RecyclerView.r paramr)
  {
    L();
    M();
    return super.b(paramInt, paramn, paramr);
  }

  public int b(RecyclerView.n paramn, RecyclerView.r paramr)
  {
    if (this.i == 1)
      return this.b;
    if (paramr.d() < 1)
      return 0;
    return a(paramn, paramr, paramr.d() - 1) + 1;
  }

  public void b(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
  {
    this.g.a();
  }

  public void c(RecyclerView.n paramn, RecyclerView.r paramr)
  {
    if (paramr.a())
      K();
    super.c(paramn, paramr);
    J();
    if (!paramr.a())
      this.a = false;
  }

  public boolean c()
  {
    return (this.n == null) && (!this.a);
  }

  public static final class a extends d.c
  {
    public int a(int paramInt)
    {
      return 1;
    }

    public int a(int paramInt1, int paramInt2)
    {
      return paramInt1 % paramInt2;
    }
  }

  public static class b extends RecyclerView.i
  {
    private int e = -1;
    private int f = 0;

    public b(int paramInt1, int paramInt2)
    {
      super(paramInt2);
    }

    public b(Context paramContext, AttributeSet paramAttributeSet)
    {
      super(paramAttributeSet);
    }

    public b(ViewGroup.LayoutParams paramLayoutParams)
    {
      super();
    }

    public b(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
    {
      super();
    }

    public int a()
    {
      return this.e;
    }

    public int b()
    {
      return this.f;
    }
  }

  public static abstract class c
  {
    final SparseIntArray a = new SparseIntArray();
    private boolean b = false;

    public abstract int a(int paramInt);

    public int a(int paramInt1, int paramInt2)
    {
      int n = a(paramInt1);
      if (n == paramInt2)
        return 0;
      int j;
      int i;
      if ((this.b) && (this.a.size() > 0))
      {
        j = b(paramInt1);
        if (j >= 0)
        {
          i = this.a.get(j) + a(j);
          j += 1;
        }
      }
      while (true)
      {
        if (j < paramInt1)
        {
          int k = a(j);
          int m = i + k;
          if (m == paramInt2)
            i = 0;
          while (true)
          {
            j += 1;
            break;
            i = k;
            if (m > paramInt2)
              continue;
            i = m;
          }
        }
        if (i + n > paramInt2)
          break;
        return i;
        j = 0;
        i = 0;
      }
    }

    public void a()
    {
      this.a.clear();
    }

    int b(int paramInt)
    {
      int i = 0;
      int j = this.a.size() - 1;
      while (i <= j)
      {
        int k = i + j >>> 1;
        if (this.a.keyAt(k) < paramInt)
        {
          i = k + 1;
          continue;
        }
        j = k - 1;
      }
      paramInt = i - 1;
      if ((paramInt >= 0) && (paramInt < this.a.size()))
        return this.a.keyAt(paramInt);
      return -1;
    }

    int b(int paramInt1, int paramInt2)
    {
      int i;
      if (!this.b)
        i = a(paramInt1, paramInt2);
      int j;
      do
      {
        return i;
        j = this.a.get(paramInt1, -1);
        i = j;
      }
      while (j != -1);
      paramInt2 = a(paramInt1, paramInt2);
      this.a.put(paramInt1, paramInt2);
      return paramInt2;
    }

    public int c(int paramInt1, int paramInt2)
    {
      int n = a(paramInt1);
      int k = 0;
      int i = 0;
      int j = 0;
      int m;
      if (k < paramInt1)
      {
        m = a(k);
        j += m;
        if (j == paramInt2)
        {
          j = i + 1;
          i = 0;
        }
      }
      while (true)
      {
        m = k + 1;
        k = i;
        i = j;
        j = k;
        k = m;
        break;
        if (j > paramInt2)
        {
          j = i + 1;
          i = m;
          continue;
          paramInt1 = i;
          if (j + n > paramInt2)
            paramInt1 = i + 1;
          return paramInt1;
        }
        m = j;
        j = i;
        i = m;
      }
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.support.widget.d
 * JD-Core Version:    0.6.0
 */