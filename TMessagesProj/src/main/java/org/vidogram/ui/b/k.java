package org.vidogram.ui.b;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import org.vidogram.messenger.a;
import org.vidogram.messenger.ad;
import org.vidogram.messenger.v;
import org.vidogram.ui.c.o;
import org.vidogram.ui.c.p;
import org.vidogram.ui.c.q;

public class k extends BaseAdapter
{
  private Context a;

  public k(Context paramContext)
  {
    this.a = paramContext;
  }

  public boolean areAllItemsEnabled()
  {
    return false;
  }

  public int getCount()
  {
    if (ad.b())
      return 11;
    return 0;
  }

  public Object getItem(int paramInt)
  {
    return null;
  }

  public long getItemId(int paramInt)
  {
    return paramInt;
  }

  public int getItemViewType(int paramInt)
  {
    int i = 1;
    if (paramInt == 0)
      i = 0;
    do
      return i;
    while (paramInt == 1);
    if (paramInt == 5)
      return 2;
    return 3;
  }

  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    int i = getItemViewType(paramInt);
    if (i == 0)
    {
      if (paramView == null)
      {
        paramViewGroup = new q(this.a);
        paramView = paramViewGroup;
      }
      while (true)
      {
        paramViewGroup.setUser(v.a().a(Integer.valueOf(ad.c())));
        paramViewGroup = paramView;
        return paramViewGroup;
        paramViewGroup = (q)paramView;
      }
    }
    if (i == 1)
    {
      if (paramView == null)
        return new org.vidogram.ui.c.r(this.a, a.a(8.0F));
    }
    else if (i == 2)
    {
      if (paramView == null)
        return new o(this.a);
    }
    else if (i == 3)
    {
      if (paramView == null)
        paramView = new p(this.a);
      while (true)
      {
        p localp = (p)paramView;
        if (paramInt == 2)
        {
          localp.a(org.vidogram.messenger.r.a("NewGroup", 2131231477), 2130837972);
          return paramView;
        }
        if (paramInt == 3)
        {
          localp.a(org.vidogram.messenger.r.a("NewSecretChat", 2131231485), 2130837973);
          return paramView;
        }
        if (paramInt == 4)
        {
          localp.a(org.vidogram.messenger.r.a("NewChannel", 2131231476), 2130837968);
          return paramView;
        }
        if (paramInt == 6)
        {
          localp.a(org.vidogram.messenger.r.a("Contacts", 2131231079), 2130837969);
          return paramView;
        }
        if (paramInt == 7)
        {
          localp.a(org.vidogram.messenger.r.a("InviteFriends", 2131231321), 2130837971);
          return paramView;
        }
        if (paramInt == 8)
        {
          localp.a(org.vidogram.messenger.r.a("Settings", 2131231830), 2130837974);
          return paramView;
        }
        if (paramInt == 10)
        {
          localp.a(org.vidogram.messenger.r.a("TelegramFaq", 2131231886), 2130837970);
          return paramView;
        }
        paramViewGroup = paramView;
        if (paramInt != 9)
          break;
        localp.a(org.vidogram.messenger.r.a("Themes", 2131232520), 2130837976);
        return paramView;
      }
    }
    return paramView;
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
    return !ad.b();
  }

  public boolean isEnabled(int paramInt)
  {
    return (paramInt != 1) && (paramInt != 5);
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.b.k
 * JD-Core Version:    0.6.0
 */