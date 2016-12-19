package org.vidogram.messenger.support.widget.a;

import android.graphics.Canvas;
import android.support.v4.view.af;
import android.view.View;
import org.vidogram.messenger.support.widget.RecyclerView;

class c
{
  static class a
    implements b
  {
    private void a(Canvas paramCanvas, RecyclerView paramRecyclerView, View paramView, float paramFloat1, float paramFloat2)
    {
      paramCanvas.save();
      paramCanvas.translate(paramFloat1, paramFloat2);
      paramRecyclerView.drawChild(paramCanvas, paramView, 0L);
      paramCanvas.restore();
    }

    public void a(Canvas paramCanvas, RecyclerView paramRecyclerView, View paramView, float paramFloat1, float paramFloat2, int paramInt, boolean paramBoolean)
    {
      if (paramInt != 2)
        a(paramCanvas, paramRecyclerView, paramView, paramFloat1, paramFloat2);
    }

    public void a(View paramView)
    {
      paramView.setVisibility(0);
    }

    public void b(Canvas paramCanvas, RecyclerView paramRecyclerView, View paramView, float paramFloat1, float paramFloat2, int paramInt, boolean paramBoolean)
    {
      if (paramInt == 2)
        a(paramCanvas, paramRecyclerView, paramView, paramFloat1, paramFloat2);
    }

    public void b(View paramView)
    {
      paramView.setVisibility(4);
    }
  }

  static class b
    implements b
  {
    public void a(Canvas paramCanvas, RecyclerView paramRecyclerView, View paramView, float paramFloat1, float paramFloat2, int paramInt, boolean paramBoolean)
    {
      af.a(paramView, paramFloat1);
      af.b(paramView, paramFloat2);
    }

    public void a(View paramView)
    {
      af.a(paramView, 0.0F);
      af.b(paramView, 0.0F);
    }

    public void b(Canvas paramCanvas, RecyclerView paramRecyclerView, View paramView, float paramFloat1, float paramFloat2, int paramInt, boolean paramBoolean)
    {
    }

    public void b(View paramView)
    {
    }
  }

  static class c extends c.b
  {
    private float a(RecyclerView paramRecyclerView, View paramView)
    {
      int j = paramRecyclerView.getChildCount();
      int i = 0;
      float f1 = 0.0F;
      if (i < j)
      {
        View localView = paramRecyclerView.getChildAt(i);
        float f2;
        if (localView == paramView)
          f2 = f1;
        while (true)
        {
          i += 1;
          f1 = f2;
          break;
          float f3 = af.q(localView);
          f2 = f1;
          if (f3 <= f1)
            continue;
          f2 = f3;
        }
      }
      return f1;
    }

    public void a(Canvas paramCanvas, RecyclerView paramRecyclerView, View paramView, float paramFloat1, float paramFloat2, int paramInt, boolean paramBoolean)
    {
      if ((paramBoolean) && (paramView.getTag() == null))
      {
        float f = af.q(paramView);
        af.d(paramView, 1.0F + a(paramRecyclerView, paramView));
        paramView.setTag(Float.valueOf(f));
      }
      super.a(paramCanvas, paramRecyclerView, paramView, paramFloat1, paramFloat2, paramInt, paramBoolean);
    }

    public void a(View paramView)
    {
      Object localObject = paramView.getTag();
      if ((localObject != null) && ((localObject instanceof Float)))
        af.d(paramView, ((Float)localObject).floatValue());
      paramView.setTag(null);
      super.a(paramView);
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.support.widget.a.c
 * JD-Core Version:    0.6.0
 */