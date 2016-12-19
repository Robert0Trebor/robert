package org.vidogram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListAdapter;
import android.widget.ListView;
import org.vidogram.messenger.a;
import org.vidogram.messenger.n;
import org.vidogram.messenger.r;
import org.vidogram.ui.b.e;

public class az extends ListView
  implements AbsListView.OnScrollListener
{
  private View a;
  private AbsListView.OnScrollListener b;
  private e c;
  private int d = -1;

  public az(Context paramContext)
  {
    super(paramContext);
    super.setOnScrollListener(this);
  }

  private View a(int paramInt, View paramView)
  {
    if (paramView == null);
    for (int i = 1; ; i = 0)
    {
      paramView = this.c.a(paramInt, paramView, this);
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
      i = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
      j = View.MeasureSpec.makeMeasureSpec(0, 0);
    }
    try
    {
      paramView.measure(i, j);
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
    if ((this.c == null) || (this.a == null))
      return;
    int i = paramCanvas.save();
    int j = ((Integer)this.a.getTag()).intValue();
    float f;
    if (r.a)
      f = getWidth() - this.a.getWidth();
    while (true)
    {
      paramCanvas.translate(f, j);
      paramCanvas.clipRect(0, 0, getWidth(), this.a.getMeasuredHeight());
      this.a.draw(paramCanvas);
      paramCanvas.restoreToCount(i);
      return;
      f = 0.0F;
    }
  }

  public void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
    if (this.b != null)
      this.b.onScroll(paramAbsListView, paramInt1, paramInt2, paramInt3);
    if (this.c == null);
    do
      return;
    while (this.c.getCount() == 0);
    paramInt2 = this.c.a(paramInt1);
    if ((this.d != paramInt2) || (this.a == null))
    {
      this.a = a(paramInt2, this.a);
      this.d = paramInt2;
    }
    paramInt2 = this.c.c(paramInt2);
    if (this.c.b(paramInt1) == paramInt2 - 1)
    {
      paramAbsListView = getChildAt(0);
      paramInt1 = this.a.getHeight();
      if (paramAbsListView != null)
      {
        paramInt2 = paramAbsListView.getTop();
        paramInt2 = paramAbsListView.getHeight() + paramInt2;
        if (paramInt2 >= paramInt1)
          break label201;
        paramInt1 = paramInt2 - paramInt1;
      }
    }
    while (true)
    {
      if (paramInt1 < 0)
        this.a.setTag(Integer.valueOf(paramInt1));
      while (true)
      {
        invalidate();
        return;
        paramInt1 = -a.a(100.0F);
        break;
        this.a.setTag(Integer.valueOf(0));
        continue;
        this.a.setTag(Integer.valueOf(0));
      }
      label201: paramInt1 = 0;
    }
  }

  public void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    if (this.b != null)
      this.b.onScrollStateChanged(paramAbsListView, paramInt);
  }

  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if ((this.c == null) || (this.a == null))
      return;
    a(this.a, true);
  }

  public void setAdapter(ListAdapter paramListAdapter)
  {
    if (this.c == paramListAdapter)
      return;
    this.a = null;
    if ((paramListAdapter instanceof e));
    for (this.c = ((e)paramListAdapter); ; this.c = null)
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
    this.b = paramOnScrollListener;
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.Components.az
 * JD-Core Version:    0.6.0
 */