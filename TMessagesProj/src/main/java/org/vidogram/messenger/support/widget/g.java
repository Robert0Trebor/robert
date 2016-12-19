package org.vidogram.messenger.support.widget;

import android.os.Bundle;
import android.support.v4.view.a;
import android.support.v4.view.a.c;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

public class g extends a
{
  final RecyclerView b;
  final a c = new a()
  {
    public void a(View paramView, c paramc)
    {
      super.a(paramView, paramc);
      if ((!g.a(g.this)) && (g.this.b.getLayoutManager() != null))
        g.this.b.getLayoutManager().a(paramView, paramc);
    }

    public boolean a(View paramView, int paramInt, Bundle paramBundle)
    {
      if (super.a(paramView, paramInt, paramBundle))
        return true;
      if ((!g.a(g.this)) && (g.this.b.getLayoutManager() != null))
        return g.this.b.getLayoutManager().a(paramView, paramInt, paramBundle);
      return false;
    }
  };

  public g(RecyclerView paramRecyclerView)
  {
    this.b = paramRecyclerView;
  }

  private boolean c()
  {
    return this.b.p();
  }

  public void a(View paramView, c paramc)
  {
    super.a(paramView, paramc);
    paramc.a(RecyclerView.class.getName());
    if ((!c()) && (this.b.getLayoutManager() != null))
      this.b.getLayoutManager().a(paramc);
  }

  public boolean a(View paramView, int paramInt, Bundle paramBundle)
  {
    if (super.a(paramView, paramInt, paramBundle))
      return true;
    if ((!c()) && (this.b.getLayoutManager() != null))
      return this.b.getLayoutManager().a(paramInt, paramBundle);
    return false;
  }

  a b()
  {
    return this.c;
  }

  public void d(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    super.d(paramView, paramAccessibilityEvent);
    paramAccessibilityEvent.setClassName(RecyclerView.class.getName());
    if (((paramView instanceof RecyclerView)) && (!c()))
    {
      paramView = (RecyclerView)paramView;
      if (paramView.getLayoutManager() != null)
        paramView.getLayoutManager().a(paramAccessibilityEvent);
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.support.widget.g
 * JD-Core Version:    0.6.0
 */