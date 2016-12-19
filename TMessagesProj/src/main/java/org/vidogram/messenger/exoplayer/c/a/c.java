package org.vidogram.messenger.exoplayer.c.a;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.vidogram.messenger.exoplayer.r;

final class c extends d
{
  public c(org.vidogram.messenger.exoplayer.c.m paramm)
  {
    super(paramm);
  }

  private static Object a(org.vidogram.messenger.exoplayer.f.m paramm, int paramInt)
  {
    switch (paramInt)
    {
    case 4:
    case 5:
    case 6:
    case 7:
    case 9:
    default:
      return null;
    case 0:
      return d(paramm);
    case 1:
      return c(paramm);
    case 2:
      return e(paramm);
    case 3:
      return g(paramm);
    case 8:
      return h(paramm);
    case 10:
      return f(paramm);
    case 11:
    }
    return i(paramm);
  }

  private static int b(org.vidogram.messenger.exoplayer.f.m paramm)
  {
    return paramm.f();
  }

  private static Boolean c(org.vidogram.messenger.exoplayer.f.m paramm)
  {
    boolean bool = true;
    if (paramm.f() == 1);
    while (true)
    {
      return Boolean.valueOf(bool);
      bool = false;
    }
  }

  private static Double d(org.vidogram.messenger.exoplayer.f.m paramm)
  {
    return Double.valueOf(Double.longBitsToDouble(paramm.o()));
  }

  private static String e(org.vidogram.messenger.exoplayer.f.m paramm)
  {
    int i = paramm.g();
    int j = paramm.d();
    paramm.c(i);
    return new String(paramm.a, j, i);
  }

  private static ArrayList<Object> f(org.vidogram.messenger.exoplayer.f.m paramm)
  {
    int j = paramm.s();
    ArrayList localArrayList = new ArrayList(j);
    int i = 0;
    while (i < j)
    {
      localArrayList.add(a(paramm, b(paramm)));
      i += 1;
    }
    return localArrayList;
  }

  private static HashMap<String, Object> g(org.vidogram.messenger.exoplayer.f.m paramm)
  {
    HashMap localHashMap = new HashMap();
    while (true)
    {
      String str = e(paramm);
      int i = b(paramm);
      if (i == 9)
        return localHashMap;
      localHashMap.put(str, a(paramm, i));
    }
  }

  private static HashMap<String, Object> h(org.vidogram.messenger.exoplayer.f.m paramm)
  {
    int j = paramm.s();
    HashMap localHashMap = new HashMap(j);
    int i = 0;
    while (i < j)
    {
      localHashMap.put(e(paramm), a(paramm, b(paramm)));
      i += 1;
    }
    return localHashMap;
  }

  private static Date i(org.vidogram.messenger.exoplayer.f.m paramm)
  {
    Date localDate = new Date(()d(paramm).doubleValue());
    paramm.c(2);
    return localDate;
  }

  protected void a(org.vidogram.messenger.exoplayer.f.m paramm, long paramLong)
  {
    if (b(paramm) != 2)
      throw new r();
    if (!"onMetaData".equals(e(paramm)));
    double d;
    do
    {
      do
      {
        return;
        if (b(paramm) != 8)
          throw new r();
        paramm = h(paramm);
      }
      while (!paramm.containsKey("duration"));
      d = ((Double)paramm.get("duration")).doubleValue();
    }
    while (d <= 0.0D);
    a(()(d * 1000000.0D));
  }

  protected boolean a(org.vidogram.messenger.exoplayer.f.m paramm)
  {
    return true;
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.exoplayer.c.a.c
 * JD-Core Version:    0.6.0
 */