package org.vidogram.ui.b;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import org.vidogram.messenger.d.g;
import org.vidogram.messenger.m;
import org.vidogram.messenger.support.widget.RecyclerView.a;
import org.vidogram.messenger.support.widget.RecyclerView.u;
import org.vidogram.messenger.y;
import org.vidogram.messenger.y.b;
import org.vidogram.tgnet.g.az;
import org.vidogram.tgnet.g.q;
import org.vidogram.ui.c.av;

public class p extends RecyclerView.a
  implements y.b
{
  private Context a;
  private ArrayList<g.q> b;
  private ArrayList<String> c = new ArrayList();
  private b d;
  private String e;
  private boolean f;

  public p(Context paramContext, b paramb)
  {
    this.a = paramContext;
    this.d = paramb;
    g.a(0);
    g.a(1);
    y.a().a(this, y.az);
    y.a().a(this, y.aA);
  }

  private boolean f()
  {
    if (this.b == null)
      return false;
    this.c.clear();
    int j = Math.min(10, this.b.size());
    int i = 0;
    while (i < j)
    {
      g.q localq = (g.q)this.b.get(i);
      if (!m.a(localq.i, "webp", true).exists())
      {
        this.c.add(m.a(localq.i, "webp"));
        m.a().a(localq.i.c, "webp", 0, true);
      }
      i += 1;
    }
    return this.c.isEmpty();
  }

  public int a()
  {
    if (this.b != null)
      return this.b.size();
    return 0;
  }

  public RecyclerView.u a(ViewGroup paramViewGroup, int paramInt)
  {
    return new a(new av(this.a));
  }

  public void a(int paramInt, Object[] paramArrayOfObject)
  {
    if (((paramInt == y.az) || (paramInt == y.aA)) && (this.b != null) && (!this.b.isEmpty()) && (!this.c.isEmpty()) && (this.f))
    {
      paramArrayOfObject = (String)paramArrayOfObject[0];
      this.c.remove(paramArrayOfObject);
      if (this.c.isEmpty())
      {
        paramArrayOfObject = this.d;
        if ((this.b == null) || (this.b.isEmpty()) || (!this.c.isEmpty()))
          break label116;
      }
    }
    label116: for (boolean bool = true; ; bool = false)
    {
      paramArrayOfObject.a(bool);
      return;
    }
  }

  public void a(CharSequence paramCharSequence)
  {
    int m;
    int n;
    int i;
    CharSequence localCharSequence;
    label45: int j;
    int k;
    if ((paramCharSequence != null) && (paramCharSequence.length() > 0) && (paramCharSequence.length() <= 14))
    {
      m = 1;
      if (m == 0)
        break label357;
      n = paramCharSequence.length();
      i = 0;
      localCharSequence = paramCharSequence;
      if (i >= n)
        break label293;
      if ((i >= n - 1) || (((localCharSequence.charAt(i) != 55356) || (localCharSequence.charAt(i + 1) < 57339) || (localCharSequence.charAt(i + 1) > 57343)) && ((localCharSequence.charAt(i) != '‍') || ((localCharSequence.charAt(i + 1) != '♀') && (localCharSequence.charAt(i + 1) != '♂')))))
        break label218;
      paramCharSequence = TextUtils.concat(new CharSequence[] { localCharSequence.subSequence(0, i), localCharSequence.subSequence(i + 2, localCharSequence.length()) });
      j = n - 2;
      k = i - 1;
    }
    while (true)
    {
      i = k + 1;
      n = j;
      localCharSequence = paramCharSequence;
      break label45;
      m = 0;
      break;
      label218: k = i;
      j = n;
      paramCharSequence = localCharSequence;
      if (localCharSequence.charAt(i) != 65039)
        continue;
      paramCharSequence = TextUtils.concat(new CharSequence[] { localCharSequence.subSequence(0, i), localCharSequence.subSequence(i + 1, localCharSequence.length()) });
      j = n - 1;
      k = i - 1;
    }
    label293: this.e = localCharSequence.toString();
    paramCharSequence = g.d();
    if (paramCharSequence != null)
    {
      paramCharSequence = (ArrayList)paramCharSequence.get(this.e);
      if ((this.b == null) || (paramCharSequence != null))
        break label392;
      if (this.f)
      {
        this.d.a(false);
        this.f = false;
      }
    }
    label357: if ((m == 0) && (this.f) && (this.b != null))
    {
      this.f = false;
      this.d.a(false);
    }
    return;
    label392: if ((paramCharSequence != null) && (!paramCharSequence.isEmpty()))
    {
      paramCharSequence = new ArrayList(paramCharSequence);
      label412: this.b = paramCharSequence;
      if (this.b != null)
      {
        paramCharSequence = g.c(0);
        if (!paramCharSequence.isEmpty())
          Collections.sort(this.b, new Comparator(paramCharSequence)
          {
            private int a(long paramLong)
            {
              int i = 0;
              while (i < this.a.size())
              {
                if (((g.q)this.a.get(i)).b == paramLong)
                  return i;
                i += 1;
              }
              return -1;
            }

            public int a(g.q paramq1, g.q paramq2)
            {
              int i = a(paramq1.b);
              int j = a(paramq2.b);
              if (i > j)
                return -1;
              if (i < j)
                return 1;
              return 0;
            }
          });
      }
      f();
      paramCharSequence = this.d;
      if ((this.b == null) || (this.b.isEmpty()) || (!this.c.isEmpty()))
        break label517;
    }
    label517: for (boolean bool = true; ; bool = false)
    {
      paramCharSequence.a(bool);
      c();
      this.f = true;
      break;
      paramCharSequence = null;
      break label412;
    }
  }

  public void a(RecyclerView.u paramu, int paramInt)
  {
    int i;
    if (paramInt == 0)
      if (this.b.size() == 1)
        i = 2;
    while (true)
    {
      ((av)paramu.a).a((g.q)this.b.get(paramInt), i);
      return;
      i = -1;
      continue;
      if (paramInt == this.b.size() - 1)
      {
        i = 1;
        continue;
      }
      i = 0;
    }
  }

  public long b(int paramInt)
  {
    return paramInt;
  }

  public void d()
  {
    y.a().b(this, y.az);
    y.a().b(this, y.aA);
  }

  public g.q e(int paramInt)
  {
    if ((this.b != null) && (paramInt >= 0) && (paramInt < this.b.size()))
      return (g.q)this.b.get(paramInt);
    return null;
  }

  public void e()
  {
    this.e = null;
    this.b = null;
    this.c.clear();
    c();
  }

  private class a extends RecyclerView.u
  {
    public a(View arg2)
    {
      super();
    }
  }

  public static abstract interface b
  {
    public abstract void a(boolean paramBoolean);
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.b.p
 * JD-Core Version:    0.6.0
 */