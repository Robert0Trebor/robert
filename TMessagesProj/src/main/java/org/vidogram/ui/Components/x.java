package org.vidogram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import org.vidogram.messenger.a;
import org.vidogram.messenger.n;
import org.vidogram.messenger.r;
import org.vidogram.ui.b.e;

public class x extends ListView
  implements AbsListView.OnScrollListener
{
  private ArrayList<View> a = new ArrayList();
  private ArrayList<View> b = new ArrayList();
  private AbsListView.OnScrollListener c;
  private e d;
  private int e = -1;
  private int f = -1;
  private int g;
  private int h;

  public x(Context paramContext)
  {
    super(paramContext);
    super.setOnScrollListener(this);
  }

  private View a(int paramInt, View paramView)
  {
    if (paramView == null);
    for (int i = 1; ; i = 0)
    {
      paramView = this.d.a(paramInt, paramView, this);
      if (i != 0)
        a(paramView, false);
      return paramView;
    }
  }

  private void a(View paramView, boolean paramBoolean)
  {
    int i;
    int j;
    if ((paramView.isLayoutRequested()) || (paramBoolean))
    {
      ViewGroup.LayoutParams localLayoutParams = paramView.getLayoutParams();
      i = View.MeasureSpec.makeMeasureSpec(localLayoutParams.height, 1073741824);
      j = View.MeasureSpec.makeMeasureSpec(localLayoutParams.width, 1073741824);
    }
    try
    {
      paramView.measure(j, i);
      paramView.layout(0, 0, paramView.getMeasuredWidth(), paramView.getMeasuredHeight());
      return;
    }
    catch (Exception localException)
    {
      while (true)
        n.a("tmessages", localException);
    }
  }

  protected void dispatchDraw(Canvas paramCanvas)
  {
    super.dispatchDraw(paramCanvas);
    if ((this.d == null) || (this.a.isEmpty()))
      return;
    Iterator localIterator = this.a.iterator();
    label32: View localView;
    int i;
    int j;
    float f1;
    if (localIterator.hasNext())
    {
      localView = (View)localIterator.next();
      i = paramCanvas.save();
      j = ((Integer)localView.getTag()).intValue();
      if (!r.a)
        break label173;
      f1 = getWidth() - localView.getWidth();
    }
    while (true)
    {
      paramCanvas.translate(f1, j);
      paramCanvas.clipRect(0, 0, getWidth(), localView.getMeasuredHeight());
      if (j < 0)
        paramCanvas.saveLayerAlpha(0.0F, j, localView.getWidth(), paramCanvas.getHeight() + j, (int)(255.0F * (j / localView.getMeasuredHeight() + 1.0F)), 4);
      localView.draw(paramCanvas);
      paramCanvas.restoreToCount(i);
      break label32;
      break;
      label173: f1 = 0.0F;
    }
  }

  public void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
    if (this.c != null)
      this.c.onScroll(paramAbsListView, paramInt1, paramInt2, paramInt3);
    if (this.d == null);
    do
    {
      return;
      this.b.addAll(this.a);
      this.a.clear();
    }
    while (this.d.getCount() == 0);
    label125: int j;
    label141: int i;
    if ((this.e != paramInt1) || (this.f != paramInt2))
    {
      this.e = paramInt1;
      this.f = paramInt2;
      this.h = 1;
      this.g = this.d.a(paramInt1);
      paramInt3 = this.d.c(this.g) + paramInt1 - this.d.b(paramInt1);
      if (paramInt3 < paramInt1 + paramInt2);
    }
    else
    {
      paramInt3 = this.g;
      paramInt2 = paramInt1;
      if (paramInt3 < this.g + this.h)
      {
        paramAbsListView = null;
        if (!this.b.isEmpty())
        {
          paramAbsListView = (View)this.b.get(0);
          this.b.remove(0);
        }
        paramAbsListView = a(paramInt3, paramAbsListView);
        this.a.add(paramAbsListView);
        j = this.d.c(paramInt3);
        if (paramInt3 != this.g)
          break label393;
        i = this.d.b(paramInt2);
        if (i != j - 1)
          break label313;
        paramAbsListView.setTag(Integer.valueOf(-paramAbsListView.getHeight()));
      }
    }
    while (true)
    {
      paramInt2 += j - this.d.b(paramInt1);
      paramInt3 += 1;
      break label141;
      break;
      paramInt3 += this.d.c(this.g + this.h);
      this.h += 1;
      break label125;
      label313: if (i == j - 2)
      {
        localView = getChildAt(paramInt2 - paramInt1);
        if (localView != null);
        for (i = localView.getTop(); ; i = -a.a(100.0F))
        {
          if (i >= 0)
            break label371;
          paramAbsListView.setTag(Integer.valueOf(i));
          break;
        }
        label371: paramAbsListView.setTag(Integer.valueOf(0));
        continue;
      }
      paramAbsListView.setTag(Integer.valueOf(0));
    }
    label393: View localView = getChildAt(paramInt2 - paramInt1);
    if (localView != null)
      paramAbsListView.setTag(Integer.valueOf(localView.getTop()));
    while (true)
    {
      paramInt2 += j;
      break;
      paramAbsListView.setTag(Integer.valueOf(-a.a(100.0F)));
    }
  }

  public void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    if (this.c != null)
      this.c.onScrollStateChanged(paramAbsListView, paramInt);
  }

  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if ((this.d == null) || (this.a.isEmpty()));
    while (true)
    {
      return;
      Iterator localIterator = this.a.iterator();
      while (localIterator.hasNext())
        a((View)localIterator.next(), true);
    }
  }

  public void setAdapter(ListAdapter paramListAdapter)
  {
    if (this.d == paramListAdapter)
      return;
    this.a.clear();
    this.b.clear();
    if ((paramListAdapter instanceof e));
    for (this.d = ((e)paramListAdapter); ; this.d = null)
    {
      super.setAdapter(paramListAdapter);
      return;
    }
  }

  public void setOnItemClickListener(AdapterView.OnItemClickListener paramOnItemClickListener)
  {
    super.setOnItemClickListener(paramOnItemClickListener);
  }

  public void setOnScrollListener(AbsListView.OnScrollListener paramOnScrollListener)
  {
    this.c = paramOnScrollListener;
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.Components.x
 * JD-Core Version:    0.6.0
 */