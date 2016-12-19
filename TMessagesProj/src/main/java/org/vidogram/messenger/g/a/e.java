package org.vidogram.messenger.g.a;

import java.util.Date;
import java.util.Map;
import org.apache.http.impl.cookie.DateUtils;
import org.vidogram.messenger.g.b.a;
import org.vidogram.messenger.g.i;

public class e
{
  public static long a(String paramString)
  {
    try
    {
      long l = DateUtils.parseDate(paramString).getTime();
      return l;
    }
    catch (org.apache.http.impl.cookie.DateParseException paramString)
    {
    }
    return 0L;
  }

  public static String a(Map<String, String> paramMap, String paramString)
  {
    Object localObject = (String)paramMap.get("Content-Type");
    paramMap = paramString;
    int i;
    if (localObject != null)
    {
      localObject = ((String)localObject).split(";");
      i = 1;
    }
    while (true)
    {
      paramMap = paramString;
      if (i < localObject.length)
      {
        paramMap = localObject[i].trim().split("=");
        if ((paramMap.length == 2) && (paramMap[0].equals("charset")))
          paramMap = paramMap[1];
      }
      else
      {
        return paramMap;
      }
      i += 1;
    }
  }

  public static b.a a(i parami)
  {
    long l6 = System.currentTimeMillis();
    Map localMap = parami.c;
    long l3 = 0L;
    long l2 = 0L;
    long l1 = 0L;
    Object localObject1 = (String)localMap.get("Date");
    if (localObject1 != null)
      l3 = a((String)localObject1);
    localObject1 = (String)localMap.get("Cache-Control");
    int j;
    int i;
    Object localObject2;
    if (localObject1 != null)
    {
      localObject1 = ((String)localObject1).split(",");
      j = 0;
      i = 0;
      l1 = 0L;
      l2 = 0L;
      if (j < localObject1.length)
      {
        localObject2 = localObject1[j].trim();
        if ((((String)localObject2).equals("no-cache")) || (((String)localObject2).equals("no-store")))
          return null;
        if (!((String)localObject2).startsWith("max-age="));
      }
    }
    while (true)
    {
      try
      {
        l5 = Long.parseLong(((String)localObject2).substring(8));
        l4 = l1;
        j += 1;
        l1 = l4;
        l2 = l5;
        break;
        if (!((String)localObject2).startsWith("stale-while-revalidate="))
          continue;
        try
        {
          l4 = Long.parseLong(((String)localObject2).substring(23));
          l5 = l2;
          continue;
          if (((String)localObject2).equals("must-revalidate"))
            continue;
          l4 = l1;
          l5 = l2;
          if (!((String)localObject2).equals("proxy-revalidate"))
            continue;
          i = 1;
          l4 = l1;
          l5 = l2;
          continue;
          j = 1;
          localObject1 = (String)localMap.get("Expires");
          if (localObject1 == null)
            continue;
          l5 = a((String)localObject1);
          localObject1 = (String)localMap.get("Last-Modified");
          if (localObject1 == null)
            continue;
          l4 = a((String)localObject1);
          localObject1 = (String)localMap.get("ETag");
          if (j == 0)
            continue;
          l2 = l6 + 1000L * l2;
          if (i == 0)
            continue;
          l1 = l2;
          localObject2 = new b.a();
          ((b.a)localObject2).a = parami.b;
          ((b.a)localObject2).b = ((String)localObject1);
          ((b.a)localObject2).f = l2;
          ((b.a)localObject2).e = l1;
          ((b.a)localObject2).c = l3;
          ((b.a)localObject2).d = l4;
          ((b.a)localObject2).g = localMap;
          return localObject2;
          l1 = 1000L * l1 + l2;
          continue;
          if ((l3 <= 0L) || (l5 < l3))
            continue;
          l1 = l5 - l3 + l6;
          l2 = l1;
          continue;
        }
        catch (Exception localException1)
        {
          l4 = l1;
          l5 = l2;
        }
        continue;
      }
      catch (Exception localException2)
      {
        long l4 = l1;
        long l5 = l2;
        continue;
        l1 = 0L;
        l2 = 0L;
        continue;
        l4 = 0L;
        continue;
        l5 = 0L;
        continue;
      }
      i = 0;
      j = 0;
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.g.a.e
 * JD-Core Version:    0.6.0
 */