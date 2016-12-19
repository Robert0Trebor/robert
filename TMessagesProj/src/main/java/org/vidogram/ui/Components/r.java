package org.vidogram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.ArrayList<Ljava.util.ArrayList<Ljava.lang.Integer;>;>;
import org.vidogram.messenger.a;
import org.vidogram.messenger.support.widget.d;

public class r extends d
{
  private SparseArray<Integer> t = new SparseArray();
  private ArrayList<ArrayList<Integer>> u;
  private SparseArray<Integer> v = new SparseArray();
  private int w;

  public r(Context paramContext, int paramInt)
  {
    super(paramContext, paramInt);
  }

  private void K()
  {
    if ((this.t.size() != J()) || (this.w != w()))
    {
      this.w = w();
      a(w());
    }
  }

  private void a(float paramFloat)
  {
    this.t.clear();
    this.v.clear();
    int j = a.a(100.0F);
    float f1 = 0.0F;
    int i2 = J();
    Object localObject = new int[i2];
    int i = 0;
    bf localbf;
    while (i < i2)
    {
      localbf = q(i);
      f1 += localbf.a / localbf.b * j;
      localObject[i] = Math.round(localbf.a / localbf.b * 100.0F);
      i += 1;
    }
    this.u = b(localObject, Math.max(Math.round(f1 / paramFloat), 1));
    i = 0;
    int k = 0;
    int m;
    float f2;
    if (k < this.u.size())
    {
      localObject = (ArrayList)this.u.get(k);
      m = ((ArrayList)localObject).size();
      f2 = 0.0F;
      j = i;
      while (j < i + m)
      {
        localbf = q(j);
        f1 = localbf.a / localbf.b;
        j += 1;
        f2 = f1 + f2;
      }
      if ((this.u.size() != 1) || (k != this.u.size() - 1))
        break label445;
      if (((ArrayList)localObject).size() < 2)
        f1 = (float)Math.floor(paramFloat / 3.0F);
    }
    while (true)
    {
      j = b();
      int i3 = i + ((ArrayList)localObject).size();
      m = i;
      label274: if (m < i3)
      {
        localbf = q(m);
        float f3 = f1 / f2;
        int n = Math.round(localbf.a / localbf.b * f3);
        if ((i2 < 3) || (m != i3 - 1))
        {
          n = (int)(n / paramFloat * b());
          j -= n;
        }
        while (true)
        {
          this.t.put(m, Integer.valueOf(n));
          m += 1;
          break label274;
          if (((ArrayList)localObject).size() >= 3)
            break label445;
          f1 = (float)Math.floor(2.0F * paramFloat / 3.0F);
          break;
          this.v.put(m, Integer.valueOf(k));
          int i1 = j;
          n = j;
          j = i1;
        }
      }
      i += ((ArrayList)localObject).size();
      k += 1;
      break;
      return;
      label445: f1 = paramFloat;
    }
  }

  private int[] a(int[] paramArrayOfInt, int paramInt)
  {
    int i3 = paramArrayOfInt.length;
    int[] arrayOfInt1 = new int[i3 * paramInt];
    int[] arrayOfInt2 = new int[(i3 - 1) * (paramInt - 1)];
    int i = 0;
    int k;
    if (i < i3)
    {
      k = paramArrayOfInt[i];
      if (i != 0);
      for (j = arrayOfInt1[((i - 1) * paramInt)]; ; j = 0)
      {
        arrayOfInt1[(i * paramInt)] = (j + k);
        i += 1;
        break;
      }
    }
    i = 0;
    while (i < paramInt)
    {
      arrayOfInt1[i] = paramArrayOfInt[0];
      i += 1;
    }
    int j = 1;
    while (j < i3)
    {
      k = 1;
      while (k < paramInt)
      {
        int i1 = 2147483647;
        int m = 0;
        i = 0;
        while (i < j)
        {
          int i2 = Math.max(arrayOfInt1[(i * paramInt + (k - 1))], arrayOfInt1[(j * paramInt)] - arrayOfInt1[(i * paramInt)]);
          int n;
          if (i != 0)
          {
            n = m;
            if (i2 >= m);
          }
          else
          {
            i1 = i;
            n = i2;
          }
          i += 1;
          m = n;
        }
        arrayOfInt1[(j * paramInt + k)] = m;
        arrayOfInt2[((j - 1) * (paramInt - 1) + (k - 1))] = i1;
        k += 1;
      }
      j += 1;
    }
    return arrayOfInt2;
  }

  private ArrayList<ArrayList<Integer>> b(int[] paramArrayOfInt, int paramInt)
  {
    int i = 0;
    int j = paramArrayOfInt.length;
    if (paramInt <= 0)
      return new ArrayList();
    if ((paramInt >= j) || (j == 1))
    {
      localArrayList1 = new ArrayList(paramArrayOfInt.length);
      paramInt = i;
      while (paramInt < paramArrayOfInt.length)
      {
        localObject = new ArrayList(1);
        ((ArrayList)localObject).add(Integer.valueOf(paramArrayOfInt[paramInt]));
        localArrayList1.add(localObject);
        paramInt += 1;
      }
      return localArrayList1;
    }
    Object localObject = a(paramArrayOfInt, paramInt);
    int k = paramInt - 1;
    ArrayList localArrayList1 = new ArrayList();
    i = paramInt - 2;
    paramInt = j - 1;
    if (i >= 0)
    {
      if (paramInt < 1)
        localArrayList1.add(0, new ArrayList());
      while (true)
      {
        i -= 1;
        break;
        ArrayList localArrayList2 = new ArrayList();
        j = localObject[((paramInt - 1) * k + i)] + 1;
        while (j < paramInt + 1)
        {
          localArrayList2.add(Integer.valueOf(paramArrayOfInt[j]));
          j += 1;
        }
        localArrayList1.add(0, localArrayList2);
        paramInt = localObject[((paramInt - 1) * k + i)];
      }
    }
    localObject = new ArrayList();
    i = 0;
    while (i < paramInt + 1)
    {
      ((ArrayList)localObject).add(Integer.valueOf(paramArrayOfInt[i]));
      i += 1;
    }
    localArrayList1.add(0, localObject);
    return (ArrayList<ArrayList<Integer>>)localArrayList1;
  }

  private bf q(int paramInt)
  {
    bf localbf = l(paramInt);
    if (localbf.a == 0.0F)
      localbf.a = 100.0F;
    if (localbf.b == 0.0F)
      localbf.b = 100.0F;
    float f = localbf.a / localbf.b;
    if ((f > 4.0F) || (f < 0.2F))
    {
      f = Math.max(localbf.a, localbf.b);
      localbf.a = f;
      localbf.b = f;
    }
    return localbf;
  }

  protected int J()
  {
    return D();
  }

  public boolean c()
  {
    return false;
  }

  protected bf l(int paramInt)
  {
    return new bf(100.0F, 100.0F);
  }

  public int m(int paramInt)
  {
    K();
    return ((Integer)this.t.get(paramInt)).intValue();
  }

  public int n(int paramInt)
  {
    if (this.u == null)
      a(paramInt);
    if (this.u != null)
      return this.u.size();
    return 0;
  }

  public boolean o(int paramInt)
  {
    K();
    return this.v.get(paramInt) != null;
  }

  public boolean p(int paramInt)
  {
    K();
    return (this.u != null) && (!this.u.isEmpty()) && (paramInt < ((ArrayList)this.u.get(0)).size());
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.Components.r
 * JD-Core Version:    0.6.0
 */