package org.vidogram.messenger.support.widget;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.view.a.a;
import android.support.v4.view.a.k;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;
import org.vidogram.messenger.support.widget.a.a.d;

public class LinearLayoutManager extends RecyclerView.h
  implements a.d
{
  private c a;
  private boolean b;
  private boolean c = false;
  private boolean d = false;
  private boolean e = true;
  private boolean f;
  int i;
  f j;
  boolean k = false;
  int l = -1;
  int m = -2147483648;
  SavedState n = null;
  final a o = new a();

  public LinearLayoutManager(Context paramContext)
  {
    this(paramContext, 1, false);
  }

  public LinearLayoutManager(Context paramContext, int paramInt, boolean paramBoolean)
  {
    b(paramInt);
    b(paramBoolean);
    c(true);
  }

  private View J()
  {
    if (this.k);
    for (int i1 = t() - 1; ; i1 = 0)
      return h(i1);
  }

  private View K()
  {
    if (this.k);
    for (int i1 = 0; ; i1 = t() - 1)
      return h(i1);
  }

  private int a(int paramInt, RecyclerView.n paramn, RecyclerView.r paramr, boolean paramBoolean)
  {
    int i1 = this.j.d() - paramInt;
    if (i1 > 0)
    {
      int i2 = -c(-i1, paramn, paramr);
      i1 = i2;
      if (paramBoolean)
      {
        paramInt = this.j.d() - (paramInt + i2);
        i1 = i2;
        if (paramInt > 0)
        {
          this.j.a(paramInt);
          i1 = i2 + paramInt;
        }
      }
      return i1;
    }
    return 0;
  }

  private View a(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (this.k)
      return a(t() - 1, -1, paramBoolean1, paramBoolean2);
    return a(0, t(), paramBoolean1, paramBoolean2);
  }

  private void a(int paramInt1, int paramInt2, boolean paramBoolean, RecyclerView.r paramr)
  {
    int i1 = -1;
    int i2 = 1;
    this.a.l = k();
    this.a.h = a(paramr);
    this.a.f = paramInt1;
    if (paramInt1 == 1)
    {
      paramr = this.a;
      paramr.h += this.j.g();
      paramr = K();
      localc = this.a;
      if (this.k);
      for (paramInt1 = i1; ; paramInt1 = 1)
      {
        localc.e = paramInt1;
        this.a.d = (d(paramr) + this.a.e);
        this.a.b = this.j.b(paramr);
        paramInt1 = this.j.b(paramr) - this.j.d();
        this.a.c = paramInt2;
        if (paramBoolean)
        {
          paramr = this.a;
          paramr.c -= paramInt1;
        }
        this.a.g = paramInt1;
        return;
      }
    }
    paramr = J();
    c localc = this.a;
    localc.h += this.j.c();
    localc = this.a;
    if (this.k);
    for (paramInt1 = i2; ; paramInt1 = -1)
    {
      localc.e = paramInt1;
      this.a.d = (d(paramr) + this.a.e);
      this.a.b = this.j.a(paramr);
      paramInt1 = -this.j.a(paramr) + this.j.c();
      break;
    }
  }

  private void a(a parama)
  {
    f(parama.a, parama.b);
  }

  private void a(RecyclerView.n paramn, int paramInt)
  {
    if (paramInt < 0);
    while (true)
    {
      return;
      int i2 = t();
      View localView;
      if (this.k)
      {
        i1 = i2 - 1;
        while (i1 >= 0)
        {
          localView = h(i1);
          if (this.j.b(localView) > paramInt)
          {
            a(paramn, i2 - 1, i1);
            return;
          }
          i1 -= 1;
        }
        continue;
      }
      int i1 = 0;
      while (i1 < i2)
      {
        localView = h(i1);
        if (this.j.b(localView) > paramInt)
        {
          a(paramn, 0, i1);
          return;
        }
        i1 += 1;
      }
    }
  }

  private void a(RecyclerView.n paramn, int paramInt1, int paramInt2)
  {
    if (paramInt1 == paramInt2);
    while (true)
    {
      return;
      int i1 = paramInt1;
      if (paramInt2 > paramInt1)
      {
        paramInt2 -= 1;
        while (paramInt2 >= paramInt1)
        {
          a(paramInt2, paramn);
          paramInt2 -= 1;
        }
        continue;
      }
      while (i1 > paramInt2)
      {
        a(i1, paramn);
        i1 -= 1;
      }
    }
  }

  private void a(RecyclerView.n paramn, c paramc)
  {
    if ((!paramc.a) || (paramc.l))
      return;
    if (paramc.f == -1)
    {
      b(paramn, paramc.g);
      return;
    }
    a(paramn, paramc.g);
  }

  private void a(RecyclerView.n paramn, RecyclerView.r paramr, a parama)
  {
    if (a(paramr, parama));
    do
      return;
    while (b(paramn, paramr, parama));
    parama.b();
    if (this.d);
    for (int i1 = paramr.d() - 1; ; i1 = 0)
    {
      parama.a = i1;
      return;
    }
  }

  private boolean a(RecyclerView.r paramr, a parama)
  {
    boolean bool = false;
    if ((paramr.a()) || (this.l == -1))
      return false;
    if ((this.l < 0) || (this.l >= paramr.d()))
    {
      this.l = -1;
      this.m = -2147483648;
      return false;
    }
    parama.a = this.l;
    if ((this.n != null) && (this.n.a()))
    {
      parama.c = this.n.c;
      if (parama.c)
      {
        parama.b = (this.j.d() - this.n.b);
        return true;
      }
      parama.b = (this.j.c() + this.n.b);
      return true;
    }
    if (this.m == -2147483648)
    {
      paramr = c(this.l);
      int i1;
      if (paramr != null)
      {
        if (this.j.c(paramr) > this.j.f())
        {
          parama.b();
          return true;
        }
        if (this.j.a(paramr) - this.j.c() < 0)
        {
          parama.b = this.j.c();
          parama.c = false;
          return true;
        }
        if (this.j.d() - this.j.b(paramr) < 0)
        {
          parama.b = this.j.d();
          parama.c = true;
          return true;
        }
        if (parama.c);
        for (i1 = this.j.b(paramr) + this.j.b(); ; i1 = this.j.a(paramr))
        {
          parama.b = i1;
          return true;
        }
      }
      if (t() > 0)
      {
        i1 = d(h(0));
        if (this.l >= i1)
          break label351;
      }
      label351: for (int i2 = 1; ; i2 = 0)
      {
        if (i2 == this.k)
          bool = true;
        parama.c = bool;
        parama.b();
        return true;
      }
    }
    parama.c = this.k;
    if (this.k)
    {
      parama.b = (this.j.d() - this.m);
      return true;
    }
    parama.b = (this.j.c() + this.m);
    return true;
  }

  private int b(int paramInt, RecyclerView.n paramn, RecyclerView.r paramr, boolean paramBoolean)
  {
    int i1 = paramInt - this.j.c();
    if (i1 > 0)
    {
      int i2 = -c(i1, paramn, paramr);
      i1 = i2;
      if (paramBoolean)
      {
        paramInt = paramInt + i2 - this.j.c();
        i1 = i2;
        if (paramInt > 0)
        {
          this.j.a(-paramInt);
          i1 = i2 - paramInt;
        }
      }
      return i1;
    }
    return 0;
  }

  private View b(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (this.k)
      return a(0, t(), paramBoolean1, paramBoolean2);
    return a(t() - 1, -1, paramBoolean1, paramBoolean2);
  }

  private void b()
  {
    boolean bool = true;
    if ((this.i == 1) || (!h()))
    {
      this.k = this.c;
      return;
    }
    if (!this.c);
    while (true)
    {
      this.k = bool;
      return;
      bool = false;
    }
  }

  private void b(a parama)
  {
    g(parama.a, parama.b);
  }

  private void b(RecyclerView.n paramn, int paramInt)
  {
    int i1 = t();
    if (paramInt < 0);
    while (true)
    {
      return;
      int i2 = this.j.e() - paramInt;
      View localView;
      if (this.k)
      {
        paramInt = 0;
        while (paramInt < i1)
        {
          localView = h(paramInt);
          if (this.j.a(localView) < i2)
          {
            a(paramn, 0, paramInt);
            return;
          }
          paramInt += 1;
        }
        continue;
      }
      paramInt = i1 - 1;
      while (paramInt >= 0)
      {
        localView = h(paramInt);
        if (this.j.a(localView) < i2)
        {
          a(paramn, i1 - 1, paramInt);
          return;
        }
        paramInt -= 1;
      }
    }
  }

  private void b(RecyclerView.n paramn, RecyclerView.r paramr, int paramInt1, int paramInt2)
  {
    if ((!paramr.b()) || (t() == 0) || (paramr.a()) || (!c()))
      return;
    int i1 = 0;
    int i2 = 0;
    List localList = paramn.b();
    int i5 = localList.size();
    int i6 = d(h(0));
    int i3 = 0;
    if (i3 < i5)
    {
      RecyclerView.u localu = (RecyclerView.u)localList.get(i3);
      int i4;
      if (localu.q())
      {
        i4 = i2;
        i2 = i1;
        i1 = i4;
      }
      while (true)
      {
        i4 = i3 + 1;
        i3 = i2;
        i2 = i1;
        i1 = i3;
        i3 = i4;
        break;
        int i7;
        if (localu.d() < i6)
        {
          i7 = 1;
          label143: if (i7 == this.k)
            break label195;
        }
        label195: for (i4 = -1; ; i4 = 1)
        {
          if (i4 != -1)
            break label201;
          i4 = this.j.c(localu.a) + i1;
          i1 = i2;
          i2 = i4;
          break;
          i7 = 0;
          break label143;
        }
        label201: i4 = this.j.c(localu.a) + i2;
        i2 = i1;
        i1 = i4;
      }
    }
    this.a.k = localList;
    if (i1 > 0)
    {
      g(d(J()), paramInt1);
      this.a.h = i1;
      this.a.c = 0;
      this.a.a();
      a(paramn, this.a, paramr, false);
    }
    if (i2 > 0)
    {
      f(d(K()), paramInt2);
      this.a.h = i2;
      this.a.c = 0;
      this.a.a();
      a(paramn, this.a, paramr, false);
    }
    this.a.k = null;
  }

  private boolean b(RecyclerView.n paramn, RecyclerView.r paramr, a parama)
  {
    int i1 = 0;
    if (t() == 0);
    do
    {
      return false;
      View localView = C();
      if ((localView == null) || (!a.a(parama, localView, paramr)))
        continue;
      parama.a(localView);
      return true;
    }
    while (this.b != this.d);
    if (parama.c)
    {
      paramn = f(paramn, paramr);
      label66: if (paramn == null)
        break label165;
      parama.b(paramn);
      if ((!paramr.a()) && (c()))
      {
        if ((this.j.a(paramn) >= this.j.d()) || (this.j.b(paramn) < this.j.c()))
          i1 = 1;
        if (i1 != 0)
          if (!parama.c)
            break label167;
      }
    }
    label165: label167: for (i1 = this.j.d(); ; i1 = this.j.c())
    {
      parama.b = i1;
      return true;
      paramn = g(paramn, paramr);
      break label66;
      break;
    }
  }

  private View f(RecyclerView.n paramn, RecyclerView.r paramr)
  {
    if (this.k)
      return h(paramn, paramr);
    return i(paramn, paramr);
  }

  private void f(int paramInt1, int paramInt2)
  {
    this.a.c = (this.j.d() - paramInt2);
    c localc = this.a;
    if (this.k);
    for (int i1 = -1; ; i1 = 1)
    {
      localc.e = i1;
      this.a.d = paramInt1;
      this.a.f = 1;
      this.a.b = paramInt2;
      this.a.g = -2147483648;
      return;
    }
  }

  private View g(RecyclerView.n paramn, RecyclerView.r paramr)
  {
    if (this.k)
      return i(paramn, paramr);
    return h(paramn, paramr);
  }

  private void g(int paramInt1, int paramInt2)
  {
    this.a.c = (paramInt2 - this.j.c());
    this.a.d = paramInt1;
    c localc = this.a;
    if (this.k);
    for (paramInt1 = 1; ; paramInt1 = -1)
    {
      localc.e = paramInt1;
      this.a.f = -1;
      this.a.b = paramInt2;
      this.a.g = -2147483648;
      return;
    }
  }

  private int h(RecyclerView.r paramr)
  {
    boolean bool2 = false;
    if (t() == 0)
      return 0;
    i();
    f localf = this.j;
    if (!this.e);
    for (boolean bool1 = true; ; bool1 = false)
    {
      View localView = a(bool1, true);
      bool1 = bool2;
      if (!this.e)
        bool1 = true;
      return h.a(paramr, localf, localView, b(bool1, true), this, this.e, this.k);
    }
  }

  private View h(RecyclerView.n paramn, RecyclerView.r paramr)
  {
    return a(paramn, paramr, 0, t(), paramr.d());
  }

  private int i(RecyclerView.r paramr)
  {
    boolean bool2 = false;
    if (t() == 0)
      return 0;
    i();
    f localf = this.j;
    if (!this.e);
    for (boolean bool1 = true; ; bool1 = false)
    {
      View localView = a(bool1, true);
      bool1 = bool2;
      if (!this.e)
        bool1 = true;
      return h.a(paramr, localf, localView, b(bool1, true), this, this.e);
    }
  }

  private View i(RecyclerView.n paramn, RecyclerView.r paramr)
  {
    return a(paramn, paramr, t() - 1, -1, paramr.d());
  }

  private int j(RecyclerView.r paramr)
  {
    boolean bool2 = false;
    if (t() == 0)
      return 0;
    i();
    f localf = this.j;
    if (!this.e);
    for (boolean bool1 = true; ; bool1 = false)
    {
      View localView = a(bool1, true);
      bool1 = bool2;
      if (!this.e)
        bool1 = true;
      return h.b(paramr, localf, localView, b(bool1, true), this, this.e);
    }
  }

  public int a(int paramInt, RecyclerView.n paramn, RecyclerView.r paramr)
  {
    if (this.i == 1)
      return 0;
    return c(paramInt, paramn, paramr);
  }

  int a(RecyclerView.n paramn, c paramc, RecyclerView.r paramr, boolean paramBoolean)
  {
    int i3 = paramc.c;
    if (paramc.g != -2147483648)
    {
      if (paramc.c < 0)
        paramc.g += paramc.c;
      a(paramn, paramc);
    }
    int i1 = paramc.c + paramc.h;
    b localb = new b();
    if (((paramc.l) || (i1 > 0)) && (paramc.a(paramr)))
    {
      localb.a();
      a(paramn, paramr, paramc, localb);
      if (!localb.b)
        break label111;
    }
    while (true)
    {
      return i3 - paramc.c;
      label111: paramc.b += localb.a * paramc.f;
      int i2;
      if ((localb.c) && (this.a.k == null))
      {
        i2 = i1;
        if (paramr.a());
      }
      else
      {
        paramc.c -= localb.a;
        i2 = i1 - localb.a;
      }
      if (paramc.g != -2147483648)
      {
        paramc.g += localb.a;
        if (paramc.c < 0)
          paramc.g += paramc.c;
        a(paramn, paramc);
      }
      i1 = i2;
      if (!paramBoolean)
        break;
      i1 = i2;
      if (!localb.d)
        break;
    }
  }

  protected int a(RecyclerView.r paramr)
  {
    if (paramr.c())
      return this.j.f();
    return 0;
  }

  View a(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2)
  {
    i();
    int i2 = this.j.c();
    int i3 = this.j.d();
    int i1;
    if (paramInt2 > paramInt1)
      i1 = 1;
    Object localObject;
    while (true)
    {
      localObject = null;
      if (paramInt1 == paramInt2)
        break;
      View localView = h(paramInt1);
      int i4 = this.j.a(localView);
      int i5 = this.j.b(localView);
      if ((i4 >= i3) || (i5 <= i2))
        break label133;
      if ((!paramBoolean1) || ((i4 >= i2) && (i5 <= i3)))
      {
        return localView;
        i1 = -1;
        continue;
      }
      if ((!paramBoolean2) || (localObject != null))
        break label133;
      localObject = localView;
    }
    label133: 
    while (true)
    {
      paramInt1 += i1;
      break;
      return localObject;
    }
  }

  public View a(View paramView, int paramInt, RecyclerView.n paramn, RecyclerView.r paramr)
  {
    b();
    if (t() == 0);
    label134: label136: label142: 
    while (true)
    {
      return null;
      paramInt = e(paramInt);
      if (paramInt == -2147483648)
        continue;
      i();
      if (paramInt == -1)
      {
        paramView = g(paramn, paramr);
        label42: if (paramView == null)
          break label134;
        i();
        a(paramInt, (int)(0.3333333F * this.j.f()), false, paramr);
        this.a.g = -2147483648;
        this.a.a = false;
        a(paramn, this.a, paramr, true);
        if (paramInt != -1)
          break label136;
      }
      for (paramn = J(); ; paramn = K())
      {
        if ((paramn == paramView) || (!paramn.isFocusable()))
          break label142;
        return paramn;
        paramView = f(paramn, paramr);
        break label42;
        break;
      }
    }
  }

  View a(RecyclerView.n paramn, RecyclerView.r paramr, int paramInt1, int paramInt2, int paramInt3)
  {
    paramr = null;
    i();
    int i2 = this.j.c();
    int i3 = this.j.d();
    int i1;
    label35: Object localObject1;
    if (paramInt2 > paramInt1)
    {
      i1 = 1;
      paramn = null;
      if (paramInt1 == paramInt2)
        break label157;
      localObject1 = h(paramInt1);
      int i4 = d((View)localObject1);
      if ((i4 < 0) || (i4 >= paramInt3))
        break label172;
      if (!((RecyclerView.i)((View)localObject1).getLayoutParams()).c())
        break label113;
      if (paramn != null)
        break label172;
      paramn = paramr;
      paramr = (RecyclerView.r)localObject1;
    }
    while (true)
    {
      paramInt1 += i1;
      localObject1 = paramr;
      paramr = paramn;
      paramn = (RecyclerView.n)localObject1;
      break label35;
      i1 = -1;
      break;
      label113: Object localObject2;
      if (this.j.a((View)localObject1) < i3)
      {
        localObject2 = localObject1;
        if (this.j.b((View)localObject1) >= i2);
      }
      else
      {
        if (paramr != null)
          break label172;
        paramr = paramn;
        paramn = (RecyclerView.n)localObject1;
        continue;
        label157: if (paramr == null)
          break label167;
      }
      while (true)
      {
        localObject2 = paramr;
        return localObject2;
        label167: paramr = paramn;
      }
      label172: localObject1 = paramn;
      paramn = paramr;
      paramr = (RecyclerView.r)localObject1;
    }
  }

  public RecyclerView.i a()
  {
    return new RecyclerView.i(-2, -2);
  }

  public void a(int paramInt1, int paramInt2)
  {
    this.l = paramInt1;
    this.m = paramInt2;
    if (this.n != null)
      this.n.b();
    p();
  }

  public void a(Parcelable paramParcelable)
  {
    if ((paramParcelable instanceof SavedState))
    {
      this.n = ((SavedState)paramParcelable);
      p();
    }
  }

  public void a(View paramView1, View paramView2, int paramInt1, int paramInt2)
  {
    a("Cannot drop a view during a scroll or layout calculation");
    i();
    b();
    paramInt1 = d(paramView1);
    paramInt2 = d(paramView2);
    if (paramInt1 < paramInt2)
      paramInt1 = 1;
    while (this.k)
    {
      if (paramInt1 == 1)
      {
        a(paramInt2, this.j.d() - (this.j.a(paramView2) + this.j.c(paramView1)));
        return;
        paramInt1 = -1;
        continue;
      }
      a(paramInt2, this.j.d() - this.j.b(paramView2));
      return;
    }
    if (paramInt1 == -1)
    {
      a(paramInt2, this.j.a(paramView2));
      return;
    }
    a(paramInt2, this.j.b(paramView2) - this.j.c(paramView1));
  }

  public void a(AccessibilityEvent paramAccessibilityEvent)
  {
    super.a(paramAccessibilityEvent);
    if (t() > 0)
    {
      paramAccessibilityEvent = a.a(paramAccessibilityEvent);
      paramAccessibilityEvent.b(m());
      paramAccessibilityEvent.c(n());
    }
  }

  public void a(String paramString)
  {
    if (this.n == null)
      super.a(paramString);
  }

  void a(RecyclerView.n paramn, RecyclerView.r paramr, a parama, int paramInt)
  {
  }

  void a(RecyclerView.n paramn, RecyclerView.r paramr, c paramc, b paramb)
  {
    paramn = paramc.a(paramn);
    if (paramn == null)
    {
      paramb.b = true;
      return;
    }
    paramr = (RecyclerView.i)paramn.getLayoutParams();
    boolean bool2;
    boolean bool1;
    label61: int i1;
    int i2;
    label120: int i3;
    int i4;
    if (paramc.k == null)
    {
      bool2 = this.k;
      if (paramc.f == -1)
      {
        bool1 = true;
        if (bool2 != bool1)
          break label215;
        b(paramn);
        a(paramn, 0, 0);
        paramb.a = this.j.c(paramn);
        if (this.i != 1)
          break label322;
        if (!h())
          break label271;
        i1 = w() - A();
        i2 = i1 - this.j.d(paramn);
        if (paramc.f != -1)
          break label293;
        i3 = paramc.b;
        i4 = paramc.b - paramb.a;
      }
    }
    while (true)
    {
      a(paramn, i2 + paramr.leftMargin, i4 + paramr.topMargin, i1 - paramr.rightMargin, i3 - paramr.bottomMargin);
      if ((paramr.c()) || (paramr.d()))
        paramb.c = true;
      paramb.d = paramn.isFocusable();
      return;
      bool1 = false;
      break;
      label215: b(paramn, 0);
      break label61;
      bool2 = this.k;
      if (paramc.f == -1);
      for (bool1 = true; ; bool1 = false)
      {
        if (bool2 != bool1)
          break label262;
        a(paramn);
        break;
      }
      label262: a(paramn, 0);
      break label61;
      label271: i2 = y();
      i1 = this.j.d(paramn) + i2;
      break label120;
      label293: i4 = paramc.b;
      i3 = paramc.b;
      int i5 = paramb.a;
      i3 += i5;
      continue;
      label322: i4 = z();
      i3 = this.j.d(paramn) + i4;
      if (paramc.f == -1)
      {
        i1 = paramc.b;
        i2 = paramc.b - paramb.a;
        continue;
      }
      i2 = paramc.b;
      i1 = paramc.b;
      i5 = paramb.a;
      i1 += i5;
    }
  }

  public void a(RecyclerView paramRecyclerView, RecyclerView.n paramn)
  {
    super.a(paramRecyclerView, paramn);
    if (this.f)
    {
      c(paramn);
      paramn.a();
    }
  }

  public void a(boolean paramBoolean)
  {
    a(null);
    if (this.d == paramBoolean)
      return;
    this.d = paramBoolean;
    p();
  }

  public int b(int paramInt, RecyclerView.n paramn, RecyclerView.r paramr)
  {
    if (this.i == 0)
      return 0;
    return c(paramInt, paramn, paramr);
  }

  public int b(RecyclerView.r paramr)
  {
    return h(paramr);
  }

  public void b(int paramInt)
  {
    if ((paramInt != 0) && (paramInt != 1))
      throw new IllegalArgumentException("invalid orientation:" + paramInt);
    a(null);
    if (paramInt == this.i)
      return;
    this.i = paramInt;
    this.j = null;
    p();
  }

  public void b(boolean paramBoolean)
  {
    a(null);
    if (paramBoolean == this.c)
      return;
    this.c = paramBoolean;
    p();
  }

  int c(int paramInt, RecyclerView.n paramn, RecyclerView.r paramr)
  {
    if ((t() == 0) || (paramInt == 0))
      return 0;
    this.a.a = true;
    i();
    if (paramInt > 0);
    int i2;
    int i3;
    for (int i1 = 1; ; i1 = -1)
    {
      i2 = Math.abs(paramInt);
      a(i1, i2, true, paramr);
      i3 = this.a.g + a(paramn, this.a, paramr, false);
      if (i3 >= 0)
        break;
      return 0;
    }
    if (i2 > i3)
      paramInt = i1 * i3;
    this.j.a(-paramInt);
    this.a.j = paramInt;
    return paramInt;
  }

  public int c(RecyclerView.r paramr)
  {
    return h(paramr);
  }

  public View c(int paramInt)
  {
    int i1 = t();
    Object localObject;
    if (i1 == 0)
      localObject = null;
    View localView;
    do
    {
      return localObject;
      int i2 = paramInt - d(h(0));
      if ((i2 < 0) || (i2 >= i1))
        break;
      localView = h(i2);
      localObject = localView;
    }
    while (d(localView) == paramInt);
    return super.c(paramInt);
  }

  public void c(RecyclerView.n paramn, RecyclerView.r paramr)
  {
    if (((this.n != null) || (this.l != -1)) && (paramr.d() == 0))
    {
      c(paramn);
      return;
    }
    if ((this.n != null) && (this.n.a()))
      this.l = this.n.a;
    i();
    this.a.a = false;
    b();
    this.o.a();
    this.o.c = (this.k ^ this.d);
    a(paramn, paramr, this.o);
    int i1 = a(paramr);
    int i2;
    int i4;
    int i5;
    int i3;
    Object localObject;
    if (this.a.j >= 0)
    {
      i2 = 0;
      i4 = i2 + this.j.c();
      i5 = i1 + this.j.g();
      i2 = i5;
      i3 = i4;
      if (paramr.a())
      {
        i2 = i5;
        i3 = i4;
        if (this.l != -1)
        {
          i2 = i5;
          i3 = i4;
          if (this.m != -2147483648)
          {
            localObject = c(this.l);
            i2 = i5;
            i3 = i4;
            if (localObject != null)
            {
              if (!this.k)
                break label648;
              i1 = this.j.d() - this.j.b((View)localObject) - this.m;
              label248: if (i1 <= 0)
                break label680;
              i3 = i4 + i1;
              i2 = i5;
            }
          }
        }
      }
      label262: if (!this.o.c)
        break label698;
      if (!this.k)
        break label693;
      i1 = 1;
      label281: a(paramn, paramr, this.o, i1);
      a(paramn);
      this.a.l = k();
      this.a.i = paramr.a();
      if (!this.o.c)
        break label715;
      b(this.o);
      this.a.h = i3;
      a(paramn, this.a, paramr, false);
      i4 = this.a.b;
      i5 = this.a.d;
      i1 = i2;
      if (this.a.c > 0)
        i1 = i2 + this.a.c;
      a(this.o);
      this.a.h = i1;
      localObject = this.a;
      ((c)localObject).d += this.a.e;
      a(paramn, this.a, paramr, false);
      i3 = this.a.b;
      if (this.a.c <= 0)
        break label960;
      i1 = this.a.c;
      g(i5, i4);
      this.a.h = i1;
      a(paramn, this.a, paramr, false);
    }
    label521: label680: label693: label698: label960: for (i1 = this.a.b; ; i1 = i4)
    {
      i2 = i1;
      i1 = i3;
      i3 = i1;
      i4 = i2;
      if (t() > 0)
      {
        if (!(this.k ^ this.d))
          break label915;
        i3 = a(i1, paramn, paramr, true);
        i4 = i2 + i3;
        i2 = b(i4, paramn, paramr, false);
        i4 += i2;
      }
      for (i3 = i1 + i3 + i2; ; i3 = i1 + i5)
      {
        b(paramn, paramr, i4, i3);
        if (!paramr.a())
        {
          this.l = -1;
          this.m = -2147483648;
          this.j.a();
        }
        this.b = this.d;
        this.n = null;
        return;
        i2 = i1;
        i1 = 0;
        break;
        i1 = this.j.a((View)localObject);
        i2 = this.j.c();
        i1 = this.m - (i1 - i2);
        break label248;
        i2 = i5 - i1;
        i3 = i4;
        break label262;
        i1 = -1;
        break label281;
        if (this.k)
        {
          i1 = -1;
          break label281;
        }
        i1 = 1;
        break label281;
        label715: a(this.o);
        this.a.h = i2;
        a(paramn, this.a, paramr, false);
        i4 = this.a.b;
        i5 = this.a.d;
        i1 = i3;
        if (this.a.c > 0)
          i1 = i3 + this.a.c;
        b(this.o);
        this.a.h = i1;
        localObject = this.a;
        ((c)localObject).d += this.a.e;
        a(paramn, this.a, paramr, false);
        i3 = this.a.b;
        i1 = i4;
        i2 = i3;
        if (this.a.c <= 0)
          break label521;
        i1 = this.a.c;
        f(i5, i4);
        this.a.h = i1;
        a(paramn, this.a, paramr, false);
        i1 = this.a.b;
        i2 = i3;
        break label521;
        i3 = b(i2, paramn, paramr, true);
        i1 += i3;
        i5 = a(i1, paramn, paramr, false);
        i4 = i2 + i3 + i5;
      }
    }
  }

  public boolean c()
  {
    return (this.n == null) && (this.b == this.d);
  }

  public int d(RecyclerView.r paramr)
  {
    return i(paramr);
  }

  public Parcelable d()
  {
    if (this.n != null)
      return new SavedState(this.n);
    SavedState localSavedState = new SavedState();
    if (t() > 0)
    {
      i();
      boolean bool = this.b ^ this.k;
      localSavedState.c = bool;
      if (bool)
      {
        localView = K();
        localSavedState.b = (this.j.d() - this.j.b(localView));
        localSavedState.a = d(localView);
        return localSavedState;
      }
      View localView = J();
      localSavedState.a = d(localView);
      localSavedState.b = (this.j.a(localView) - this.j.c());
      return localSavedState;
    }
    localSavedState.b();
    return localSavedState;
  }

  public void d(int paramInt)
  {
    this.l = paramInt;
    this.m = -2147483648;
    if (this.n != null)
      this.n.b();
    p();
  }

  int e(int paramInt)
  {
    int i2 = -1;
    int i3 = 1;
    int i4 = -2147483648;
    int i1 = i2;
    switch (paramInt)
    {
    default:
      i1 = -2147483648;
    case 1:
    case 2:
    case 33:
    case 130:
    case 17:
      do
      {
        do
        {
          return i1;
          return 1;
          i1 = i2;
        }
        while (this.i == 1);
        return -2147483648;
        paramInt = i4;
        if (this.i == 1)
          paramInt = 1;
        return paramInt;
        i1 = i2;
      }
      while (this.i == 0);
      return -2147483648;
    case 66:
    }
    if (this.i == 0);
    for (paramInt = i3; ; paramInt = -2147483648)
      return paramInt;
  }

  public int e(RecyclerView.r paramr)
  {
    return i(paramr);
  }

  public boolean e()
  {
    return this.i == 0;
  }

  public int f(RecyclerView.r paramr)
  {
    return j(paramr);
  }

  public boolean f()
  {
    return this.i == 1;
  }

  public int g()
  {
    return this.i;
  }

  public int g(RecyclerView.r paramr)
  {
    return j(paramr);
  }

  protected boolean h()
  {
    return r() == 1;
  }

  void i()
  {
    if (this.a == null)
      this.a = j();
    if (this.j == null)
      this.j = f.a(this, this.i);
  }

  c j()
  {
    return new c();
  }

  boolean k()
  {
    return (this.j.h() == 0) && (this.j.e() == 0);
  }

  boolean l()
  {
    return (v() != 1073741824) && (u() != 1073741824) && (I());
  }

  public int m()
  {
    View localView = a(0, t(), false, true);
    if (localView == null)
      return -1;
    return d(localView);
  }

  public int n()
  {
    View localView = a(t() - 1, -1, false, true);
    if (localView == null)
      return -1;
    return d(localView);
  }

  public int o()
  {
    View localView = a(t() - 1, -1, true, false);
    if (localView == null)
      return -1;
    return d(localView);
  }

  public static class SavedState
    implements Parcelable
  {
    public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator()
    {
      public LinearLayoutManager.SavedState a(Parcel paramParcel)
      {
        return new LinearLayoutManager.SavedState(paramParcel);
      }

      public LinearLayoutManager.SavedState[] a(int paramInt)
      {
        return new LinearLayoutManager.SavedState[paramInt];
      }
    };
    int a;
    int b;
    boolean c;

    public SavedState()
    {
    }

    SavedState(Parcel paramParcel)
    {
      this.a = paramParcel.readInt();
      this.b = paramParcel.readInt();
      if (paramParcel.readInt() == 1);
      while (true)
      {
        this.c = bool;
        return;
        bool = false;
      }
    }

    public SavedState(SavedState paramSavedState)
    {
      this.a = paramSavedState.a;
      this.b = paramSavedState.b;
      this.c = paramSavedState.c;
    }

    boolean a()
    {
      return this.a >= 0;
    }

    void b()
    {
      this.a = -1;
    }

    public int describeContents()
    {
      return 0;
    }

    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      paramParcel.writeInt(this.a);
      paramParcel.writeInt(this.b);
      if (this.c);
      for (paramInt = 1; ; paramInt = 0)
      {
        paramParcel.writeInt(paramInt);
        return;
      }
    }
  }

  class a
  {
    int a;
    int b;
    boolean c;

    a()
    {
    }

    private boolean a(View paramView, RecyclerView.r paramr)
    {
      paramView = (RecyclerView.i)paramView.getLayoutParams();
      return (!paramView.c()) && (paramView.e() >= 0) && (paramView.e() < paramr.d());
    }

    void a()
    {
      this.a = -1;
      this.b = -2147483648;
      this.c = false;
    }

    public void a(View paramView)
    {
      int j = LinearLayoutManager.this.j.b();
      if (j >= 0)
        b(paramView);
      int i;
      do
      {
        int k;
        do
        {
          while (true)
          {
            return;
            this.a = LinearLayoutManager.this.d(paramView);
            if (!this.c)
              break;
            i = LinearLayoutManager.this.j.d() - j - LinearLayoutManager.this.j.b(paramView);
            this.b = (LinearLayoutManager.this.j.d() - i);
            if (i <= 0)
              continue;
            j = LinearLayoutManager.this.j.c(paramView);
            k = this.b;
            m = LinearLayoutManager.this.j.c();
            j = k - j - (m + Math.min(LinearLayoutManager.this.j.a(paramView) - m, 0));
            if (j >= 0)
              continue;
            k = this.b;
            this.b = (Math.min(i, -j) + k);
            return;
          }
          k = LinearLayoutManager.this.j.a(paramView);
          i = k - LinearLayoutManager.this.j.c();
          this.b = k;
        }
        while (i <= 0);
        int m = LinearLayoutManager.this.j.c(paramView);
        int n = LinearLayoutManager.this.j.d();
        int i1 = LinearLayoutManager.this.j.b(paramView);
        j = LinearLayoutManager.this.j.d() - Math.min(0, n - j - i1) - (k + m);
      }
      while (j >= 0);
      this.b -= Math.min(i, -j);
    }

    void b()
    {
      if (this.c);
      for (int i = LinearLayoutManager.this.j.d(); ; i = LinearLayoutManager.this.j.c())
      {
        this.b = i;
        return;
      }
    }

    public void b(View paramView)
    {
      if (this.c);
      for (this.b = (LinearLayoutManager.this.j.b(paramView) + LinearLayoutManager.this.j.b()); ; this.b = LinearLayoutManager.this.j.a(paramView))
      {
        this.a = LinearLayoutManager.this.d(paramView);
        return;
      }
    }

    public String toString()
    {
      return "AnchorInfo{mPosition=" + this.a + ", mCoordinate=" + this.b + ", mLayoutFromEnd=" + this.c + '}';
    }
  }

  protected static class b
  {
    public int a;
    public boolean b;
    public boolean c;
    public boolean d;

    void a()
    {
      this.a = 0;
      this.b = false;
      this.c = false;
      this.d = false;
    }
  }

  static class c
  {
    boolean a = true;
    int b;
    int c;
    int d;
    int e;
    int f;
    int g;
    int h = 0;
    boolean i = false;
    int j;
    List<RecyclerView.u> k = null;
    boolean l;

    private View b()
    {
      int n = this.k.size();
      int m = 0;
      if (m < n)
      {
        View localView = ((RecyclerView.u)this.k.get(m)).a;
        RecyclerView.i locali = (RecyclerView.i)localView.getLayoutParams();
        if (locali.c());
        do
        {
          m += 1;
          break;
        }
        while (this.d != locali.e());
        a(localView);
        return localView;
      }
      return null;
    }

    View a(RecyclerView.n paramn)
    {
      if (this.k != null)
        return b();
      paramn = paramn.c(this.d);
      this.d += this.e;
      return paramn;
    }

    public void a()
    {
      a(null);
    }

    public void a(View paramView)
    {
      paramView = b(paramView);
      if (paramView == null)
      {
        this.d = -1;
        return;
      }
      this.d = ((RecyclerView.i)paramView.getLayoutParams()).e();
    }

    boolean a(RecyclerView.r paramr)
    {
      return (this.d >= 0) && (this.d < paramr.d());
    }

    public View b(View paramView)
    {
      int i2 = this.k.size();
      Object localObject = null;
      int m = 2147483647;
      int n = 0;
      if (n < i2)
      {
        View localView = ((RecyclerView.u)this.k.get(n)).a;
        RecyclerView.i locali = (RecyclerView.i)localView.getLayoutParams();
        if (localView != paramView)
          if (!locali.c());
        while (true)
        {
          n += 1;
          break;
          int i1 = (locali.e() - this.d) * this.e;
          if (i1 < 0)
            continue;
          if (i1 < m)
          {
            if (i1 == 0)
              return localView;
            localObject = localView;
            m = i1;
            continue;
          }
        }
      }
      return localObject;
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.support.widget.LinearLayoutManager
 * JD-Core Version:    0.6.0
 */