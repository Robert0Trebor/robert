package org.vidogram.ui.b;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.vidogram.messenger.a;
import org.vidogram.messenger.support.widget.RecyclerView.a;
import org.vidogram.messenger.support.widget.RecyclerView.i;
import org.vidogram.messenger.support.widget.RecyclerView.u;
import org.vidogram.messenger.v;
import org.vidogram.tgnet.g.hq;
import org.vidogram.ui.c.n;
import org.vidogram.ui.c.z;

public class i extends RecyclerView.a
{
  public int a;
  private Context b;
  private long c;
  private int d;

  public i(Context paramContext, int paramInt)
  {
    this.b = paramContext;
    this.a = paramInt;
  }

  private ArrayList<g.hq> e()
  {
    if (this.a == 0)
      return v.a().a;
    if (this.a == 1)
      return v.a().b;
    if (this.a == 2)
      return v.a().c;
    if (this.a == 3)
      return v.a().M;
    if (this.a == 4)
      return v.a().O;
    if (this.a == 5)
      return v.a().N;
    if (this.a == 6)
      return v.a().Q;
    return null;
  }

  public int a()
  {
    int j = e().size();
    if ((j == 0) && (v.a().r))
      return 0;
    int i = j;
    if (!v.a().s)
      i = j + 1;
    this.d = i;
    return i;
  }

  public int a(int paramInt)
  {
    if (paramInt == e().size())
      return 1;
    return 0;
  }

  public RecyclerView.u a(ViewGroup paramViewGroup, int paramInt)
  {
    paramViewGroup = null;
    if (paramInt == 0)
      paramViewGroup = new n(this.b);
    while (true)
    {
      paramViewGroup.setLayoutParams(new RecyclerView.i(-1, -2));
      return new a(paramViewGroup);
      if (paramInt != 1)
        continue;
      paramViewGroup = new z(this.b);
    }
  }

  public void a(long paramLong)
  {
    this.c = paramLong;
  }

  public void a(RecyclerView.u paramu, int paramInt)
  {
    boolean bool2 = true;
    g.hq localhq;
    if (paramu.h() == 0)
    {
      paramu = (n)paramu.a;
      if (paramInt == a() - 1)
        break label88;
      bool1 = true;
      paramu.a = bool1;
      localhq = e(paramInt);
      if ((this.a == 0) && (a.c()))
        if (localhq.m != this.c)
          break label93;
    }
    label88: label93: for (boolean bool1 = bool2; ; bool1 = false)
    {
      paramu.setDialogSelected(bool1);
      paramu.a(localhq, paramInt, this.a);
      return;
      bool1 = false;
      break;
    }
  }

  public long b(int paramInt)
  {
    return paramInt;
  }

  public void c(RecyclerView.u paramu)
  {
    if ((paramu.a instanceof n))
      ((n)paramu.a).e();
  }

  public boolean d()
  {
    int i = this.d;
    return (i != a()) || (i == 1);
  }

  public g.hq e(int paramInt)
  {
    ArrayList localArrayList = e();
    if ((paramInt < 0) || (paramInt >= localArrayList.size()))
      return null;
    return (g.hq)localArrayList.get(paramInt);
  }

  private class a extends RecyclerView.u
  {
    public a(View arg2)
    {
      super();
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.b.i
 * JD-Core Version:    0.6.0
 */