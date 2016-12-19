package org.vidogram.messenger.support.widget;

import android.view.View;

public abstract class f
{
  protected final RecyclerView.h a;
  private int b = -2147483648;

  private f(RecyclerView.h paramh)
  {
    this.a = paramh;
  }

  public static f a(RecyclerView.h paramh)
  {
    return new f(paramh)
    {
      public int a(View paramView)
      {
        RecyclerView.i locali = (RecyclerView.i)paramView.getLayoutParams();
        return this.a.h(paramView) - locali.leftMargin;
      }

      public void a(int paramInt)
      {
        this.a.i(paramInt);
      }

      public int b(View paramView)
      {
        RecyclerView.i locali = (RecyclerView.i)paramView.getLayoutParams();
        int i = this.a.j(paramView);
        return locali.rightMargin + i;
      }

      public int c()
      {
        return this.a.y();
      }

      public int c(View paramView)
      {
        RecyclerView.i locali = (RecyclerView.i)paramView.getLayoutParams();
        int i = this.a.f(paramView);
        int j = locali.leftMargin;
        return locali.rightMargin + (i + j);
      }

      public int d()
      {
        return this.a.w() - this.a.A();
      }

      public int d(View paramView)
      {
        RecyclerView.i locali = (RecyclerView.i)paramView.getLayoutParams();
        int i = this.a.g(paramView);
        int j = locali.topMargin;
        return locali.bottomMargin + (i + j);
      }

      public int e()
      {
        return this.a.w();
      }

      public int f()
      {
        return this.a.w() - this.a.y() - this.a.A();
      }

      public int g()
      {
        return this.a.A();
      }

      public int h()
      {
        return this.a.u();
      }

      public int i()
      {
        return this.a.v();
      }
    };
  }

  public static f a(RecyclerView.h paramh, int paramInt)
  {
    switch (paramInt)
    {
    default:
      throw new IllegalArgumentException("invalid orientation");
    case 0:
      return a(paramh);
    case 1:
    }
    return b(paramh);
  }

  public static f b(RecyclerView.h paramh)
  {
    return new f(paramh)
    {
      public int a(View paramView)
      {
        RecyclerView.i locali = (RecyclerView.i)paramView.getLayoutParams();
        return this.a.i(paramView) - locali.topMargin;
      }

      public void a(int paramInt)
      {
        this.a.j(paramInt);
      }

      public int b(View paramView)
      {
        RecyclerView.i locali = (RecyclerView.i)paramView.getLayoutParams();
        int i = this.a.k(paramView);
        return locali.bottomMargin + i;
      }

      public int c()
      {
        return this.a.z();
      }

      public int c(View paramView)
      {
        RecyclerView.i locali = (RecyclerView.i)paramView.getLayoutParams();
        int i = this.a.g(paramView);
        int j = locali.topMargin;
        return locali.bottomMargin + (i + j);
      }

      public int d()
      {
        return this.a.x() - this.a.B();
      }

      public int d(View paramView)
      {
        RecyclerView.i locali = (RecyclerView.i)paramView.getLayoutParams();
        int i = this.a.f(paramView);
        int j = locali.leftMargin;
        return locali.rightMargin + (i + j);
      }

      public int e()
      {
        return this.a.x();
      }

      public int f()
      {
        return this.a.x() - this.a.z() - this.a.B();
      }

      public int g()
      {
        return this.a.B();
      }

      public int h()
      {
        return this.a.v();
      }

      public int i()
      {
        return this.a.u();
      }
    };
  }

  public abstract int a(View paramView);

  public void a()
  {
    this.b = f();
  }

  public abstract void a(int paramInt);

  public int b()
  {
    if (-2147483648 == this.b)
      return 0;
    return f() - this.b;
  }

  public abstract int b(View paramView);

  public abstract int c();

  public abstract int c(View paramView);

  public abstract int d();

  public abstract int d(View paramView);

  public abstract int e();

  public abstract int f();

  public abstract int g();

  public abstract int h();

  public abstract int i();
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.support.widget.f
 * JD-Core Version:    0.6.0
 */