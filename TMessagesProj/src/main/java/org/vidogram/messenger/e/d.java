package org.vidogram.messenger.e;

import java.text.Format;
import java.util.Arrays;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

abstract class d<F extends Format>
{
  private static final ConcurrentMap<a, String> b = new ConcurrentHashMap(7);
  private final ConcurrentMap<a, F> a = new ConcurrentHashMap(7);

  protected abstract F b(String paramString, TimeZone paramTimeZone, Locale paramLocale);

  public F c(String paramString, TimeZone paramTimeZone, Locale paramLocale)
  {
    if (paramString == null)
      throw new NullPointerException("pattern must not be null");
    TimeZone localTimeZone = paramTimeZone;
    if (paramTimeZone == null)
      localTimeZone = TimeZone.getDefault();
    paramTimeZone = paramLocale;
    if (paramLocale == null)
      paramTimeZone = Locale.getDefault();
    a locala = new a(new Object[] { paramString, localTimeZone, paramTimeZone });
    Format localFormat = (Format)this.a.get(locala);
    paramLocale = localFormat;
    if (localFormat == null)
    {
      paramString = b(paramString, localTimeZone, paramTimeZone);
      paramLocale = (Format)this.a.putIfAbsent(locala, paramString);
      if (paramLocale == null);
    }
    else
    {
      return paramLocale;
    }
    return paramString;
  }

  private static class a
  {
    private final Object[] a;
    private int b;

    public a(Object[] paramArrayOfObject)
    {
      this.a = paramArrayOfObject;
    }

    public boolean equals(Object paramObject)
    {
      return Arrays.equals(this.a, ((a)paramObject).a);
    }

    public int hashCode()
    {
      int j = 0;
      if (this.b == 0)
      {
        Object[] arrayOfObject = this.a;
        int m = arrayOfObject.length;
        int i = 0;
        while (i < m)
        {
          Object localObject = arrayOfObject[i];
          int k = j;
          if (localObject != null)
            k = j * 7 + localObject.hashCode();
          i += 1;
          j = k;
        }
        this.b = j;
      }
      return this.b;
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.e.d
 * JD-Core Version:    0.6.0
 */