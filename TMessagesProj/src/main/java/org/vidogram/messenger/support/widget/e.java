package org.vidogram.messenger.support.widget;

import java.util.List;

class e
{
  final a a;

  public e(a parama)
  {
    this.a = parama;
  }

  private void a(List<a.b> paramList, int paramInt1, int paramInt2)
  {
    a.b localb1 = (a.b)paramList.get(paramInt1);
    a.b localb2 = (a.b)paramList.get(paramInt2);
    switch (localb2.a)
    {
    case 3:
    default:
      return;
    case 2:
      a(paramList, paramInt1, localb1, paramInt2, localb2);
      return;
    case 1:
      c(paramList, paramInt1, localb1, paramInt2, localb2);
      return;
    case 4:
    }
    b(paramList, paramInt1, localb1, paramInt2, localb2);
  }

  private int b(List<a.b> paramList)
  {
    int i = 0;
    int j = paramList.size() - 1;
    if (j >= 0)
    {
      if (((a.b)paramList.get(j)).a == 8)
      {
        if (i == 0)
          break label50;
        return j;
      }
      i = 1;
    }
    label50: 
    while (true)
    {
      j -= 1;
      break;
      return -1;
    }
  }

  private void c(List<a.b> paramList, int paramInt1, a.b paramb1, int paramInt2, a.b paramb2)
  {
    int i = 0;
    if (paramb1.d < paramb2.b)
      i = -1;
    int j = i;
    if (paramb1.b < paramb2.b)
      j = i + 1;
    if (paramb2.b <= paramb1.b)
      paramb1.b += paramb2.d;
    if (paramb2.b <= paramb1.d)
      paramb1.d += paramb2.d;
    paramb2.b = (j + paramb2.b);
    paramList.set(paramInt1, paramb2);
    paramList.set(paramInt2, paramb1);
  }

  void a(List<a.b> paramList)
  {
    while (true)
    {
      int i = b(paramList);
      if (i == -1)
        break;
      a(paramList, i, i + 1);
    }
  }

  void a(List<a.b> paramList, int paramInt1, a.b paramb1, int paramInt2, a.b paramb2)
  {
    int j = 0;
    int i;
    if (paramb1.b < paramb1.d)
    {
      if ((paramb2.b != paramb1.b) || (paramb2.d != paramb1.d - paramb1.b))
        break label623;
      i = 1;
    }
    while (true)
    {
      label70: a.b localb;
      if (paramb1.d < paramb2.b)
      {
        paramb2.b -= 1;
        if (paramb1.b > paramb2.b)
          break label241;
        paramb2.b += 1;
        localb = null;
      }
      while (true)
      {
        label97: if (i != 0)
        {
          paramList.set(paramInt1, paramb2);
          paramList.remove(paramInt2);
          this.a.a(paramb1);
        }
        label596: label606: 
        while (true)
        {
          return;
          if ((paramb2.b != paramb1.d + 1) || (paramb2.d != paramb1.b - paramb1.d))
            break label614;
          j = 1;
          i = 1;
          break;
          if (paramb1.d >= paramb2.b + paramb2.d)
            break label70;
          paramb2.d -= 1;
          paramb1.a = 2;
          paramb1.d = 1;
          if (paramb2.d != 0)
            continue;
          paramList.remove(paramInt2);
          this.a.a(paramb2);
          return;
          label241: if (paramb1.b >= paramb2.b + paramb2.d)
            break label608;
          int k = paramb2.b;
          int m = paramb2.d;
          int n = paramb1.b;
          localb = this.a.a(2, paramb1.b + 1, k + m - n, null);
          paramb2.d = (paramb1.b - paramb2.b);
          break label97;
          if (j != 0)
          {
            if (localb != null)
            {
              if (paramb1.b > localb.b)
                paramb1.b -= localb.d;
              if (paramb1.d > localb.b)
                paramb1.d -= localb.d;
            }
            if (paramb1.b > paramb2.b)
              paramb1.b -= paramb2.d;
            if (paramb1.d > paramb2.b)
              paramb1.d -= paramb2.d;
            paramList.set(paramInt1, paramb2);
            if (paramb1.b == paramb1.d)
              break label596;
            paramList.set(paramInt2, paramb1);
          }
          while (true)
          {
            if (localb == null)
              break label606;
            paramList.add(paramInt1, localb);
            return;
            if (localb != null)
            {
              if (paramb1.b >= localb.b)
                paramb1.b -= localb.d;
              if (paramb1.d >= localb.b)
                paramb1.d -= localb.d;
            }
            if (paramb1.b >= paramb2.b)
              paramb1.b -= paramb2.d;
            if (paramb1.d < paramb2.b)
              break;
            paramb1.d -= paramb2.d;
            break;
            paramList.remove(paramInt2);
          }
        }
        label608: localb = null;
      }
      label614: i = 0;
      j = 1;
      continue;
      label623: i = 0;
    }
  }

  void b(List<a.b> paramList, int paramInt1, a.b paramb1, int paramInt2, a.b paramb2)
  {
    Object localObject2 = null;
    Object localObject1;
    if (paramb1.d < paramb2.b)
    {
      paramb2.b -= 1;
      localObject1 = null;
    }
    while (true)
    {
      if (paramb1.b <= paramb2.b)
      {
        paramb2.b += 1;
        label54: paramList.set(paramInt2, paramb1);
        if (paramb2.d <= 0)
          break label243;
        paramList.set(paramInt1, paramb2);
      }
      while (true)
      {
        if (localObject1 != null)
          paramList.add(paramInt1, localObject1);
        if (localObject2 != null)
          paramList.add(paramInt1, localObject2);
        return;
        if (paramb1.d >= paramb2.b + paramb2.d)
          break label265;
        paramb2.d -= 1;
        localObject1 = this.a.a(4, paramb1.b, 1, paramb2.c);
        break;
        if (paramb1.b >= paramb2.b + paramb2.d)
          break label54;
        int i = paramb2.b + paramb2.d - paramb1.b;
        localObject2 = this.a.a(4, paramb1.b + 1, i, paramb2.c);
        paramb2.d -= i;
        break label54;
        label243: paramList.remove(paramInt1);
        this.a.a(paramb2);
      }
      label265: localObject1 = null;
    }
  }

  static abstract interface a
  {
    public abstract a.b a(int paramInt1, int paramInt2, int paramInt3, Object paramObject);

    public abstract void a(a.b paramb);
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.support.widget.e
 * JD-Core Version:    0.6.0
 */