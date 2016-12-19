package org.vidogram.ui.b;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import org.vidogram.messenger.a;
import org.vidogram.messenger.f.a;
import org.vidogram.messenger.r;
import org.vidogram.messenger.v;
import org.vidogram.tgnet.g.fw;
import org.vidogram.tgnet.g.vw;
import org.vidogram.ui.c.az;
import org.vidogram.ui.c.bh;
import org.vidogram.ui.c.o;
import org.vidogram.ui.c.u;
import org.vidogram.ui.c.y;

public class f extends e
{
  private Context a;
  private int b;
  private boolean c;
  private HashMap<Integer, g.vw> d;
  private HashMap<Integer, ?> e;
  private boolean f;
  private boolean g;

  public f(Context paramContext, int paramInt, boolean paramBoolean1, HashMap<Integer, g.vw> paramHashMap, boolean paramBoolean2)
  {
    this.a = paramContext;
    this.b = paramInt;
    this.c = paramBoolean1;
    this.d = paramHashMap;
    this.g = paramBoolean2;
  }

  public int a()
  {
    if (this.b == 2);
    for (ArrayList localArrayList = org.vidogram.messenger.f.a().j; ; localArrayList = org.vidogram.messenger.f.a().h)
    {
      int j = localArrayList.size();
      int i = j;
      if (this.b == 0)
        i = j + 1;
      j = i;
      if (this.g)
        j = i + 1;
      i = j;
      if (this.c)
        i = j + 1;
      return i;
    }
  }

  public View a(int paramInt1, int paramInt2, View paramView, ViewGroup paramViewGroup)
  {
    float f2 = 72.0F;
    boolean bool1 = true;
    int i = b(paramInt1, paramInt2);
    if (i == 4)
    {
      if (paramView == null)
      {
        paramViewGroup = new o(this.a);
        float f1;
        if (r.a)
        {
          f1 = 28.0F;
          paramInt1 = a.a(f1);
          if (!r.a)
            break label87;
          f1 = f2;
        }
        while (true)
        {
          paramViewGroup.setPadding(paramInt1, 0, a.a(f1), 0);
          return paramViewGroup;
          f1 = 72.0F;
          break;
          label87: f1 = 28.0F;
        }
      }
    }
    else if (i == 3)
    {
      if (paramView == null)
      {
        paramView = new u(this.a);
        ((u)paramView).setText(r.a("Contacts", 2131231079).toUpperCase());
        return paramView;
      }
    }
    else if (i == 2)
    {
      if (paramView != null)
        break label683;
      paramView = new az(this.a);
    }
    label645: label656: label662: label668: label680: label683: 
    while (true)
    {
      Object localObject = (az)paramView;
      if (this.c)
      {
        ((az)localObject).a(r.a("InviteFriends", 2131231321), 2130837971);
        return paramView;
      }
      if (this.g)
      {
        ((az)localObject).a(r.a("InviteToGroupByLink", 2131231325), 2130837971);
        return paramView;
      }
      if (paramInt2 == 0)
      {
        ((az)localObject).a(r.a("NewGroup", 2131231477), 2130837972);
        return paramView;
      }
      if (paramInt2 == 1)
      {
        ((az)localObject).a(r.a("NewSecretChat", 2131231485), 2130837973);
        return paramView;
      }
      paramViewGroup = paramView;
      if (paramInt2 != 2)
        break;
      ((az)localObject).a(r.a("NewChannel", 2131231476), 2130837968);
      return paramView;
      if (i == 1)
      {
        if (paramView != null)
          break label680;
        paramView = new az(this.a);
      }
      while (true)
      {
        paramViewGroup = (f.a)org.vidogram.messenger.f.a().d.get(paramInt2);
        localObject = (az)paramView;
        if ((paramViewGroup.f != null) && (paramViewGroup.g != null))
          ((az)localObject).setText(paramViewGroup.f + " " + paramViewGroup.g);
        while (true)
        {
          return paramView;
          if ((paramViewGroup.f != null) && (paramViewGroup.g == null))
          {
            ((az)localObject).setText(paramViewGroup.f);
            continue;
          }
          ((az)localObject).setText(paramViewGroup.g);
        }
        if (i == 0)
        {
          if (paramView == null)
          {
            paramView = new bh(this.a, 58, 1, false);
            ((bh)paramView).a(-5723992, -12876608);
          }
          while (true)
          {
            label465: label481: label498: boolean bool2;
            if (this.b == 2)
            {
              paramViewGroup = org.vidogram.messenger.f.a().i;
              if (this.b != 2)
                break label645;
              localObject = org.vidogram.messenger.f.a().j;
              if ((this.b == 0) || (this.g))
                break label656;
              i = 0;
              paramViewGroup = (ArrayList)paramViewGroup.get(((ArrayList)localObject).get(paramInt1 - i));
              localObject = v.a().a(Integer.valueOf(((g.fw)paramViewGroup.get(paramInt2)).c));
              ((bh)paramView).a((org.vidogram.tgnet.f)localObject, null, null, 0);
              if (this.e != null)
              {
                paramViewGroup = (bh)paramView;
                bool2 = this.e.containsKey(Integer.valueOf(((g.vw)localObject).d));
                if (this.f)
                  break label662;
              }
            }
            while (true)
            {
              paramViewGroup.a(bool2, bool1);
              paramViewGroup = paramView;
              if (this.d == null)
                break;
              if (!this.d.containsKey(Integer.valueOf(((g.vw)localObject).d)))
                break label668;
              paramView.setAlpha(0.5F);
              return paramView;
              paramViewGroup = org.vidogram.messenger.f.a().g;
              break label465;
              localObject = org.vidogram.messenger.f.a().h;
              break label481;
              i = 1;
              break label498;
              bool1 = false;
            }
            paramView.setAlpha(1.0F);
            return paramView;
          }
        }
        return paramView;
      }
    }
  }

  public View a(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (this.b == 2)
    {
      paramViewGroup = org.vidogram.messenger.f.a().i;
      if (this.b != 2)
        break label95;
      paramViewGroup = org.vidogram.messenger.f.a().j;
      label30: if (paramView != null)
        break label171;
      paramView = new y(this.a);
    }
    label171: 
    while (true)
    {
      if ((this.b != 0) && (!this.g))
      {
        if (paramInt < paramViewGroup.size())
        {
          ((y)paramView).setLetter((String)paramViewGroup.get(paramInt));
          return paramView;
          paramViewGroup = org.vidogram.messenger.f.a().g;
          break;
          label95: paramViewGroup = org.vidogram.messenger.f.a().h;
          break label30;
        }
        ((y)paramView).setLetter("");
        return paramView;
      }
      if (paramInt == 0)
      {
        ((y)paramView).setLetter("");
        return paramView;
      }
      if (paramInt - 1 < paramViewGroup.size())
      {
        ((y)paramView).setLetter((String)paramViewGroup.get(paramInt - 1));
        return paramView;
      }
      ((y)paramView).setLetter("");
      return paramView;
    }
  }

  public void a(HashMap<Integer, ?> paramHashMap)
  {
    this.e = paramHashMap;
  }

  public void a(boolean paramBoolean)
  {
    this.f = paramBoolean;
  }

  public boolean a(int paramInt1, int paramInt2)
  {
    int j = 1;
    HashMap localHashMap;
    ArrayList localArrayList;
    label35: int i;
    if (this.b == 2)
    {
      localHashMap = org.vidogram.messenger.f.a().i;
      if (this.b != 2)
        break label85;
      localArrayList = org.vidogram.messenger.f.a().j;
      if ((this.b == 0) || (this.g))
        break label101;
      if (paramInt2 >= ((ArrayList)localHashMap.get(localArrayList.get(paramInt1))).size())
        break label96;
      i = 1;
    }
    label85: label96: label101: 
    do
    {
      do
      {
        do
        {
          do
          {
            while (true)
            {
              return i;
              localHashMap = org.vidogram.messenger.f.a().g;
              break;
              localArrayList = org.vidogram.messenger.f.a().h;
              break label35;
              i = 0;
            }
            if (paramInt1 != 0)
              break label139;
            if ((!this.c) && (!this.g))
              break label129;
            i = j;
          }
          while (paramInt2 != 1);
          return false;
          i = j;
        }
        while (paramInt2 != 3);
        return false;
        i = j;
      }
      while (paramInt1 - 1 >= localArrayList.size());
      i = j;
    }
    while (paramInt2 < ((ArrayList)localHashMap.get(localArrayList.get(paramInt1 - 1))).size());
    label129: label139: return false;
  }

  public int b(int paramInt1, int paramInt2)
  {
    int i = 0;
    HashMap localHashMap;
    if (this.b == 2)
    {
      localHashMap = org.vidogram.messenger.f.a().i;
      if (this.b != 2)
        break label82;
    }
    label82: for (ArrayList localArrayList = org.vidogram.messenger.f.a().j; ; localArrayList = org.vidogram.messenger.f.a().h)
    {
      if ((this.b == 0) || (this.g))
        break label95;
      if (paramInt2 >= ((ArrayList)localHashMap.get(localArrayList.get(paramInt1))).size())
        break label93;
      return 0;
      localHashMap = org.vidogram.messenger.f.a().g;
      break;
    }
    label93: return 4;
    label95: if (paramInt1 == 0)
    {
      if ((this.c) || (this.g))
      {
        if (paramInt2 == 1)
          return 3;
      }
      else if (paramInt2 == 3)
        return 3;
      return 2;
    }
    if (paramInt1 - 1 < localArrayList.size())
    {
      if (paramInt2 < ((ArrayList)localHashMap.get(localArrayList.get(paramInt1 - 1))).size());
      for (paramInt1 = i; ; paramInt1 = 4)
        return paramInt1;
    }
    return 1;
  }

  public int c(int paramInt)
  {
    HashMap localHashMap;
    ArrayList localArrayList;
    label31: int i;
    if (this.b == 2)
    {
      localHashMap = org.vidogram.messenger.f.a().i;
      if (this.b != 2)
        break label107;
      localArrayList = org.vidogram.messenger.f.a().j;
      if ((this.b == 0) || (this.g))
        break label118;
      if (paramInt >= localArrayList.size())
        break label196;
      i = ((ArrayList)localHashMap.get(localArrayList.get(paramInt))).size();
      if (paramInt == localArrayList.size() - 1)
      {
        paramInt = i;
        if (!this.c);
      }
      else
      {
        paramInt = i + 1;
      }
    }
    label107: label118: 
    do
    {
      return paramInt;
      localHashMap = org.vidogram.messenger.f.a().g;
      break;
      localArrayList = org.vidogram.messenger.f.a().h;
      break label31;
      if (paramInt == 0)
      {
        if ((this.c) || (this.g))
          return 2;
        return 4;
      }
      if (paramInt - 1 >= localArrayList.size())
        break label196;
      i = ((ArrayList)localHashMap.get(localArrayList.get(paramInt - 1))).size();
      if (paramInt - 1 != localArrayList.size() - 1)
        break label192;
      paramInt = i;
    }
    while (!this.c);
    label192: return i + 1;
    label196: if (this.c)
      return org.vidogram.messenger.f.a().d.size();
    return 0;
  }

  public Object c(int paramInt1, int paramInt2)
  {
    Object localObject;
    if (this.b == 2)
    {
      localObject = org.vidogram.messenger.f.a().i;
      if (this.b != 2)
        break label107;
    }
    label107: for (ArrayList localArrayList = org.vidogram.messenger.f.a().j; ; localArrayList = org.vidogram.messenger.f.a().h)
    {
      if ((this.b == 0) || (this.g))
        break label120;
      if (paramInt1 >= localArrayList.size())
        break label118;
      localObject = (ArrayList)((HashMap)localObject).get(localArrayList.get(paramInt1));
      if (paramInt2 >= ((ArrayList)localObject).size())
        break label118;
      return v.a().a(Integer.valueOf(((g.fw)((ArrayList)localObject).get(paramInt2)).c));
      localObject = org.vidogram.messenger.f.a().g;
      break;
    }
    label118: return null;
    label120: if (paramInt1 == 0)
      return null;
    if (paramInt1 - 1 < localArrayList.size())
    {
      localObject = (ArrayList)((HashMap)localObject).get(localArrayList.get(paramInt1 - 1));
      if (paramInt2 < ((ArrayList)localObject).size())
        return v.a().a(Integer.valueOf(((g.fw)((ArrayList)localObject).get(paramInt2)).c));
      return null;
    }
    if (this.c)
      return org.vidogram.messenger.f.a().d.get(paramInt2);
    return null;
  }

  public int getViewTypeCount()
  {
    return 5;
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.b.f
 * JD-Core Version:    0.6.0
 */