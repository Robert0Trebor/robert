package org.vidogram.messenger;

import org.vidogram.a.b;
import org.vidogram.tgnet.g.un;
import org.vidogram.tgnet.g.uo;
import org.vidogram.tgnet.g.uy;
import org.vidogram.tgnet.g.vw;

public class ae
{
  public static boolean a(g.vw paramvw)
  {
    return (paramvw == null) || ((paramvw instanceof g.un)) || ((paramvw instanceof g.uo)) || (paramvw.q);
  }

  public static boolean b(g.vw paramvw)
  {
    return ((paramvw instanceof g.uy)) || (paramvw.n);
  }

  public static String c(g.vw paramvw)
  {
    Object localObject;
    if ((paramvw == null) || (a(paramvw)))
      localObject = r.a("HiddenName", 2131231289);
    do
    {
      String str;
      do
      {
        do
        {
          return localObject;
          str = f.a(paramvw.e, paramvw.f);
          localObject = str;
        }
        while (str.length() != 0);
        localObject = str;
      }
      while (paramvw.i == null);
      localObject = str;
    }
    while (paramvw.i.length() == 0);
    return (String)b.a().e("+" + paramvw.i);
  }

  public static String d(g.vw paramvw)
  {
    if ((paramvw == null) || (a(paramvw)))
      paramvw = "DELETED";
    String str1;
    do
    {
      return paramvw;
      String str2 = paramvw.e;
      if (str2 != null)
      {
        str1 = str2;
        if (str2.length() != 0);
      }
      else
      {
        str1 = paramvw.f;
      }
      if (str1 == null)
        break;
      paramvw = str1;
    }
    while (str1.length() > 0);
    return r.a("HiddenName", 2131231289);
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.ae
 * JD-Core Version:    0.6.0
 */