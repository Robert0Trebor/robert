package org.vidogram.messenger;

import android.graphics.drawable.BitmapDrawable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class s
{
  private final LinkedHashMap<String, BitmapDrawable> a;
  private final LinkedHashMap<String, ArrayList<String>> b;
  private int c;
  private int d;

  public s(int paramInt)
  {
    if (paramInt <= 0)
      throw new IllegalArgumentException("maxSize <= 0");
    this.d = paramInt;
    this.a = new LinkedHashMap(0, 0.75F, true);
    this.b = new LinkedHashMap();
  }

  private void a(int paramInt, String paramString)
  {
    monitorenter;
    try
    {
      Iterator localIterator = this.a.entrySet().iterator();
      while (true)
      {
        if ((!localIterator.hasNext()) || (this.c <= paramInt) || (this.a.isEmpty()))
          return;
        Object localObject = (Map.Entry)localIterator.next();
        String str = (String)((Map.Entry)localObject).getKey();
        if ((paramString != null) && (paramString.equals(str)))
          continue;
        localObject = (BitmapDrawable)((Map.Entry)localObject).getValue();
        this.c -= c(str, (BitmapDrawable)localObject);
        localIterator.remove();
        String[] arrayOfString = str.split("@");
        if (arrayOfString.length > 1)
        {
          ArrayList localArrayList = (ArrayList)this.b.get(arrayOfString[0]);
          if (localArrayList != null)
          {
            localArrayList.remove(arrayOfString[1]);
            if (localArrayList.isEmpty())
              this.b.remove(arrayOfString[0]);
          }
        }
        a(true, str, (BitmapDrawable)localObject, null);
      }
    }
    finally
    {
      monitorexit;
    }
    throw paramString;
  }

  private int c(String paramString, BitmapDrawable paramBitmapDrawable)
  {
    int i = a(paramString, paramBitmapDrawable);
    if (i < 0)
      throw new IllegalStateException("Negative size: " + paramString + "=" + paramBitmapDrawable);
    return i;
  }

  protected int a(String paramString, BitmapDrawable paramBitmapDrawable)
  {
    return 1;
  }

  public final BitmapDrawable a(String paramString)
  {
    if (paramString == null)
      throw new NullPointerException("key == null");
    monitorenter;
    try
    {
      paramString = (BitmapDrawable)this.a.get(paramString);
      if (paramString != null)
        return paramString;
      return null;
    }
    finally
    {
      monitorexit;
    }
    throw paramString;
  }

  public final void a()
  {
    a(-1, null);
  }

  protected void a(boolean paramBoolean, String paramString, BitmapDrawable paramBitmapDrawable1, BitmapDrawable paramBitmapDrawable2)
  {
  }

  public final BitmapDrawable b(String paramString)
  {
    if (paramString == null)
      throw new NullPointerException("key == null");
    monitorenter;
    try
    {
      BitmapDrawable localBitmapDrawable = (BitmapDrawable)this.a.remove(paramString);
      if (localBitmapDrawable != null)
        this.c -= c(paramString, localBitmapDrawable);
      monitorexit;
      if (localBitmapDrawable != null)
      {
        String[] arrayOfString = paramString.split("@");
        if (arrayOfString.length > 1)
        {
          ArrayList localArrayList = (ArrayList)this.b.get(arrayOfString[0]);
          if (localArrayList != null)
          {
            localArrayList.remove(arrayOfString[1]);
            if (localArrayList.isEmpty())
              this.b.remove(arrayOfString[0]);
          }
        }
        a(false, paramString, localBitmapDrawable, null);
      }
      return localBitmapDrawable;
    }
    finally
    {
      monitorexit;
    }
    throw paramString;
  }

  public BitmapDrawable b(String paramString, BitmapDrawable paramBitmapDrawable)
  {
    if ((paramString == null) || (paramBitmapDrawable == null))
      throw new NullPointerException("key == null || value == null");
    monitorenter;
    try
    {
      this.c += c(paramString, paramBitmapDrawable);
      BitmapDrawable localBitmapDrawable = (BitmapDrawable)this.a.put(paramString, paramBitmapDrawable);
      if (localBitmapDrawable != null)
        this.c -= c(paramString, localBitmapDrawable);
      monitorexit;
      String[] arrayOfString = paramString.split("@");
      if (arrayOfString.length > 1)
      {
        ArrayList localArrayList2 = (ArrayList)this.b.get(arrayOfString[0]);
        ArrayList localArrayList1 = localArrayList2;
        if (localArrayList2 == null)
        {
          localArrayList1 = new ArrayList();
          this.b.put(arrayOfString[0], localArrayList1);
        }
        if (!localArrayList1.contains(arrayOfString[1]))
          localArrayList1.add(arrayOfString[1]);
      }
      if (localBitmapDrawable != null)
        a(false, paramString, localBitmapDrawable, paramBitmapDrawable);
      a(this.d, paramString);
      return localBitmapDrawable;
    }
    finally
    {
      monitorexit;
    }
    throw paramString;
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.s
 * JD-Core Version:    0.6.0
 */