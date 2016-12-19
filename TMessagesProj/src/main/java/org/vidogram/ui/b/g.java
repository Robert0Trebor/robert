package org.vidogram.ui.b;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import org.vidogram.messenger.ApplicationLoader;
import org.vidogram.messenger.a;
import org.vidogram.messenger.n;
import org.vidogram.messenger.r;
import org.vidogram.ui.c.bg;
import org.vidogram.ui.c.o;
import org.vidogram.ui.c.y;

public class g extends e
{
  private Context a;
  private HashMap<String, ArrayList<a>> b = new HashMap();
  private ArrayList<String> c = new ArrayList();

  public g(Context paramContext)
  {
    this.a = paramContext;
    try
    {
      localInputStream = ApplicationLoader.a.getResources().getAssets().open("countries.txt");
      localBufferedReader = new BufferedReader(new InputStreamReader(localInputStream));
      while (true)
      {
        paramContext = localBufferedReader.readLine();
        if (paramContext == null)
          break;
        paramContext = paramContext.split(";");
        a locala = new a();
        locala.a = paramContext[2];
        locala.b = paramContext[0];
        locala.c = paramContext[1];
        String str = locala.a.substring(0, 1).toUpperCase();
        ArrayList localArrayList = (ArrayList)this.b.get(str);
        paramContext = localArrayList;
        if (localArrayList == null)
        {
          paramContext = new ArrayList();
          this.b.put(str, paramContext);
          this.c.add(str);
        }
        paramContext.add(locala);
      }
    }
    catch (java.lang.Exception paramContext)
    {
      InputStream localInputStream;
      BufferedReader localBufferedReader;
      n.a("tmessages", paramContext);
      while (true)
      {
        Collections.sort(this.c, new Comparator()
        {
          public int a(String paramString1, String paramString2)
          {
            return paramString1.compareTo(paramString2);
          }
        });
        paramContext = this.b.values().iterator();
        while (paramContext.hasNext())
          Collections.sort((ArrayList)paramContext.next(), new Comparator()
          {
            public int a(g.a parama1, g.a parama2)
            {
              return parama1.a.compareTo(parama2.a);
            }
          });
        localBufferedReader.close();
        localInputStream.close();
      }
    }
  }

  public int a()
  {
    return this.c.size();
  }

  public View a(int paramInt1, int paramInt2, View paramView, ViewGroup paramViewGroup)
  {
    float f2 = 72.0F;
    float f3 = 54.0F;
    int i = b(paramInt1, paramInt2);
    float f1;
    if (i == 1)
    {
      paramViewGroup = paramView;
      if (paramView == null)
      {
        paramViewGroup = new o(this.a);
        if (!r.a)
          break label84;
        f1 = 24.0F;
        paramInt1 = a.a(f1);
        if (!r.a)
          break label91;
        f1 = f2;
        label68: paramViewGroup.setPadding(paramInt1, 0, a.a(f1), 0);
      }
    }
    label84: label91: 
    do
    {
      return paramViewGroup;
      f1 = 72.0F;
      break;
      f1 = 24.0F;
      break label68;
      paramViewGroup = paramView;
    }
    while (i != 0);
    if (paramView == null)
    {
      paramView = new bg(this.a);
      if (r.a)
      {
        f1 = 16.0F;
        i = a.a(f1);
        if (!r.a)
          break label234;
        f1 = f3;
        label149: paramView.setPadding(i, 0, a.a(f1), 0);
      }
    }
    while (true)
    {
      paramViewGroup = (a)((ArrayList)this.b.get(this.c.get(paramInt1))).get(paramInt2);
      ((bg)paramView).a(paramViewGroup.a, "+" + paramViewGroup.b, false);
      return paramView;
      f1 = 54.0F;
      break;
      label234: f1 = 16.0F;
      break label149;
    }
  }

  public View a(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (paramView == null)
    {
      paramView = new y(this.a);
      ((y)paramView).setCellHeight(a.a(48.0F));
    }
    while (true)
    {
      ((y)paramView).setLetter(((String)this.c.get(paramInt)).toUpperCase());
      return paramView;
    }
  }

  public boolean a(int paramInt1, int paramInt2)
  {
    return paramInt2 < ((ArrayList)this.b.get(this.c.get(paramInt1))).size();
  }

  public int b(int paramInt1, int paramInt2)
  {
    if (paramInt2 < ((ArrayList)this.b.get(this.c.get(paramInt1))).size())
      return 0;
    return 1;
  }

  public HashMap<String, ArrayList<a>> b()
  {
    return this.b;
  }

  public int c(int paramInt)
  {
    int j = ((ArrayList)this.b.get(this.c.get(paramInt))).size();
    int i = j;
    if (paramInt != this.c.size() - 1)
      i = j + 1;
    return i;
  }

  public a d(int paramInt1, int paramInt2)
  {
    if ((paramInt1 < 0) || (paramInt1 >= this.c.size()))
      return null;
    ArrayList localArrayList = (ArrayList)this.b.get(this.c.get(paramInt1));
    if ((paramInt2 < 0) || (paramInt2 >= localArrayList.size()))
      return null;
    return (a)localArrayList.get(paramInt2);
  }

  public int getViewTypeCount()
  {
    return 2;
  }

  public static class a
  {
    public String a;
    public String b;
    public String c;
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.b.g
 * JD-Core Version:    0.6.0
 */