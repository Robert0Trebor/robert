package org.vidogram.messenger.support.widget;

import android.view.View;

class h
{
  static int a(RecyclerView.r paramr, f paramf, View paramView1, View paramView2, RecyclerView.h paramh, boolean paramBoolean)
  {
    if ((paramh.t() == 0) || (paramr.d() == 0) || (paramView1 == null) || (paramView2 == null))
      return 0;
    if (!paramBoolean)
      return Math.abs(paramh.d(paramView1) - paramh.d(paramView2)) + 1;
    int i = paramf.b(paramView2);
    int j = paramf.a(paramView1);
    return Math.min(paramf.f(), i - j);
  }

  static int a(RecyclerView.r paramr, f paramf, View paramView1, View paramView2, RecyclerView.h paramh, boolean paramBoolean1, boolean paramBoolean2)
  {
    int i = 0;
    int j = i;
    if (paramh.t() != 0)
    {
      j = i;
      if (paramr.d() != 0)
      {
        j = i;
        if (paramView1 != null)
        {
          if (paramView2 != null)
            break label45;
          j = i;
        }
      }
    }
    return j;
    label45: i = Math.min(paramh.d(paramView1), paramh.d(paramView2));
    j = Math.max(paramh.d(paramView1), paramh.d(paramView2));
    if (paramBoolean2);
    for (i = Math.max(0, paramr.d() - j - 1); ; i = Math.max(0, i))
    {
      j = i;
      if (!paramBoolean1)
        break;
      j = Math.abs(paramf.b(paramView2) - paramf.a(paramView1));
      int k = Math.abs(paramh.d(paramView1) - paramh.d(paramView2));
      float f = j / (k + 1);
      return Math.round(i * f + (paramf.c() - paramf.a(paramView1)));
    }
  }

  static int b(RecyclerView.r paramr, f paramf, View paramView1, View paramView2, RecyclerView.h paramh, boolean paramBoolean)
  {
    if ((paramh.t() == 0) || (paramr.d() == 0) || (paramView1 == null) || (paramView2 == null))
      return 0;
    if (!paramBoolean)
      return paramr.d();
    int i = paramf.b(paramView2);
    int j = paramf.a(paramView1);
    int k = Math.abs(paramh.d(paramView1) - paramh.d(paramView2));
    return (int)((i - j) / (k + 1) * paramr.d());
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.support.widget.h
 * JD-Core Version:    0.6.0
 */