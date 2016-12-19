package org.vidogram.messenger.exoplayer.e;

import java.util.Arrays;
import org.vidogram.messenger.exoplayer.f.r;

public final class g
  implements b
{
  private final int a;
  private final byte[] b;
  private int c;
  private int d;
  private a[] e;

  public g(int paramInt)
  {
    this(paramInt, 0);
  }

  public g(int paramInt1, int paramInt2)
  {
    if (paramInt1 > 0)
    {
      bool1 = true;
      org.vidogram.messenger.exoplayer.f.b.a(bool1);
      if (paramInt2 < 0)
        break label106;
    }
    label106: for (boolean bool1 = bool2; ; bool1 = false)
    {
      org.vidogram.messenger.exoplayer.f.b.a(bool1);
      this.a = paramInt1;
      this.d = paramInt2;
      this.e = new a[paramInt2 + 100];
      if (paramInt2 <= 0)
        break label112;
      this.b = new byte[paramInt2 * paramInt1];
      while (i < paramInt2)
      {
        this.e[i] = new a(this.b, i * paramInt1);
        i += 1;
      }
      bool1 = false;
      break;
    }
    label112: this.b = null;
  }

  public a a()
  {
    monitorenter;
    try
    {
      this.c += 1;
      Object localObject1;
      if (this.d > 0)
      {
        localObject1 = this.e;
        int i = this.d - 1;
        this.d = i;
        localObject1 = localObject1[i];
        this.e[this.d] = null;
      }
      while (true)
      {
        return localObject1;
        localObject1 = new a(new byte[this.a], 0);
      }
    }
    finally
    {
      monitorexit;
    }
    throw localObject2;
  }

  public void a(int paramInt)
  {
    int i = 0;
    monitorenter;
    while (true)
    {
      int j;
      try
      {
        j = Math.max(0, r.a(paramInt, this.a) - this.c);
        paramInt = this.d;
        if (j >= paramInt)
          return;
        if (this.b != null)
        {
          int k = this.d - 1;
          paramInt = i;
          i = k;
          if (paramInt > i)
            continue;
          a locala1 = this.e[paramInt];
          if (locala1.a != this.b)
            continue;
          paramInt += 1;
          continue;
          a locala2 = this.e[paramInt];
          if (locala2.a == this.b)
            continue;
          i -= 1;
          continue;
          this.e[paramInt] = locala2;
          this.e[i] = locala1;
          i -= 1;
          paramInt += 1;
          continue;
          paramInt = Math.max(j, paramInt);
          if (paramInt >= this.d)
            continue;
          Arrays.fill(this.e, paramInt, this.d, null);
          this.d = paramInt;
          continue;
        }
      }
      finally
      {
        monitorexit;
      }
      paramInt = j;
    }
  }

  public void a(a parama)
  {
    monitorenter;
    while (true)
    {
      try
      {
        if (parama.a != this.b)
        {
          if (parama.a.length != this.a)
            continue;
          break label115;
          org.vidogram.messenger.exoplayer.f.b.a(bool);
          this.c -= 1;
          if (this.d != this.e.length)
            continue;
          this.e = ((a[])Arrays.copyOf(this.e, this.e.length * 2));
          a[] arrayOfa = this.e;
          int i = this.d;
          this.d = (i + 1);
          arrayOfa[i] = parama;
          notifyAll();
          return;
          bool = false;
          continue;
        }
      }
      finally
      {
        monitorexit;
      }
      label115: boolean bool = true;
    }
  }

  public void a(a[] paramArrayOfa)
  {
    monitorenter;
    while (true)
    {
      try
      {
        if (this.d + paramArrayOfa.length < this.e.length)
          continue;
        this.e = ((a[])Arrays.copyOf(this.e, Math.max(this.e.length * 2, this.d + paramArrayOfa.length)));
        int j = paramArrayOfa.length;
        int i = 0;
        if (i >= j)
          continue;
        a locala = paramArrayOfa[i];
        if (locala.a != this.b)
        {
          if (locala.a.length != this.a)
            break label159;
          break label153;
          org.vidogram.messenger.exoplayer.f.b.a(bool);
          a[] arrayOfa = this.e;
          int k = this.d;
          this.d = (k + 1);
          arrayOfa[k] = locala;
          i += 1;
          continue;
          this.c -= paramArrayOfa.length;
          notifyAll();
          return;
        }
      }
      finally
      {
        monitorexit;
      }
      label153: boolean bool = true;
      continue;
      label159: bool = false;
    }
  }

  public int b()
  {
    return this.a;
  }

  public void b(int paramInt)
  {
    monitorenter;
    try
    {
      if (c() > paramInt)
        wait();
    }
    finally
    {
      monitorexit;
    }
  }

  public int c()
  {
    monitorenter;
    try
    {
      int i = this.c;
      int j = this.a;
      monitorexit;
      return i * j;
    }
    finally
    {
      localObject = finally;
      monitorexit;
    }
    throw localObject;
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.exoplayer.e.g
 * JD-Core Version:    0.6.0
 */