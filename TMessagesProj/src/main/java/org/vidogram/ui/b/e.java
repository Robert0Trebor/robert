package org.vidogram.ui.b;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;

public abstract class e extends a
{
  private SparseArray<Integer> a;
  private SparseArray<Integer> b;
  private SparseArray<Integer> c;
  private int d;
  private int e;

  public e()
  {
    b();
  }

  private void b()
  {
    this.b = new SparseArray();
    this.a = new SparseArray();
    this.c = new SparseArray();
    this.e = -1;
    this.d = -1;
  }

  private int c()
  {
    if (this.d >= 0)
      return this.d;
    this.d = a();
    return this.d;
  }

  private int d(int paramInt)
  {
    Integer localInteger = (Integer)this.c.get(paramInt);
    if (localInteger != null)
      return localInteger.intValue();
    int i = c(paramInt);
    this.c.put(paramInt, Integer.valueOf(i));
    return i;
  }

  public abstract int a();

  public final int a(int paramInt)
  {
    int j = 0;
    Integer localInteger = (Integer)this.b.get(paramInt);
    if (localInteger != null)
      return localInteger.intValue();
    int i = 0;
    while (i < c())
    {
      int k = d(i) + j;
      if ((paramInt >= j) && (paramInt < k))
      {
        this.b.put(paramInt, Integer.valueOf(i));
        return i;
      }
      i += 1;
      j = k;
    }
    return -1;
  }

  public abstract View a(int paramInt1, int paramInt2, View paramView, ViewGroup paramViewGroup);

  public abstract View a(int paramInt, View paramView, ViewGroup paramViewGroup);

  public abstract boolean a(int paramInt1, int paramInt2);

  public boolean areAllItemsEnabled()
  {
    return false;
  }

  public int b(int paramInt)
  {
    int j = 0;
    Integer localInteger = (Integer)this.a.get(paramInt);
    if (localInteger != null)
      return localInteger.intValue();
    int i = 0;
    while (i < c())
    {
      int k = d(i) + j;
      if ((paramInt >= j) && (paramInt < k))
      {
        i = paramInt - j;
        this.a.put(paramInt, Integer.valueOf(i));
        return i;
      }
      i += 1;
      j = k;
    }
    return -1;
  }

  public abstract int b(int paramInt1, int paramInt2);

  public abstract int c(int paramInt);

  public abstract Object c(int paramInt1, int paramInt2);

  public final int getCount()
  {
    int i = 0;
    if (this.e >= 0)
      return this.e;
    this.e = 0;
    while (i < c())
    {
      this.e += d(i);
      i += 1;
    }
    return this.e;
  }

  public final Object getItem(int paramInt)
  {
    return c(a(paramInt), b(paramInt));
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final int getItemViewType(int paramInt)
  {
    return b(a(paramInt), b(paramInt));
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    return a(a(paramInt), b(paramInt), paramView, paramViewGroup);
  }

  public boolean isEnabled(int paramInt)
  {
    return a(a(paramInt), b(paramInt));
  }

  public void notifyDataSetChanged()
  {
    b();
    super.notifyDataSetChanged();
  }

  public void notifyDataSetInvalidated()
  {
    b();
    super.notifyDataSetInvalidated();
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.b.e
 * JD-Core Version:    0.6.0
 */