package org.vidogram.ui.b;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.vidogram.tgnet.g.of;
import org.vidogram.ui.c.aa;

public class m extends b
{
  private Context d;

  public m(Context paramContext)
  {
    this.d = paramContext;
  }

  public g.of a(int paramInt)
  {
    if ((paramInt >= 0) && (paramInt < this.b.size()))
      return (g.of)this.b.get(paramInt);
    return null;
  }

  public boolean areAllItemsEnabled()
  {
    return false;
  }

  public int getCount()
  {
    return this.b.size();
  }

  public long getItemId(int paramInt)
  {
    return paramInt;
  }

  public int getItemViewType(int paramInt)
  {
    return 0;
  }

  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (paramView == null)
      paramView = new aa(this.d);
    while (true)
    {
      paramViewGroup = (aa)paramView;
      g.of localof = (g.of)this.b.get(paramInt);
      String str = (String)this.c.get(paramInt);
      if (paramInt != this.b.size() - 1);
      for (boolean bool = true; ; bool = false)
      {
        paramViewGroup.a(localof, str, bool);
        return paramView;
      }
    }
  }

  public int getViewTypeCount()
  {
    return 4;
  }

  public boolean hasStableIds()
  {
    return true;
  }

  public boolean isEmpty()
  {
    return this.b.isEmpty();
  }

  public boolean isEnabled(int paramInt)
  {
    return true;
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.b.m
 * JD-Core Version:    0.6.0
 */