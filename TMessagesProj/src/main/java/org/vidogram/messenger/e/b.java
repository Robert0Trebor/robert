package org.vidogram.messenger.e;

import java.io.Serializable;
import java.text.DateFormatSymbols;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TimeZone;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class b
  implements Serializable
{
  private static final c A;
  static final Locale a = new Locale("ja", "JP", "JP");
  private static final Pattern k = Pattern.compile("D+|E+|F+|G+|H+|K+|M+|S+|W+|Z+|a+|d+|h+|k+|m+|s+|w+|y+|z+|''|'[^']++(''[^']*+)*+'|[^'A-Za-z]++");
  private static final ConcurrentMap<Locale, c>[] l = new ConcurrentMap[17];
  private static final c m = new b()
  {
    void a(b paramb, Calendar paramCalendar, String paramString)
    {
      int j = Integer.parseInt(paramString);
      int i = j;
      if (j < 100)
        i = b.a(paramb, j);
      paramCalendar.set(1, i);
    }
  };
  private static final c n = new b()
  {
    int a(int paramInt)
    {
      return paramInt - 1;
    }
  };
  private static final c o = new b(1);
  private static final c p = new b(3);
  private static final c q = new b(4);
  private static final c r = new b(6);
  private static final c s = new b(5);
  private static final c t = new b(8);
  private static final c u = new b(11);
  private static final c v = new b()
  {
    int a(int paramInt)
    {
      return paramInt % 24;
    }
  };
  private static final c w = new b()
  {
    int a(int paramInt)
    {
      return paramInt % 12;
    }
  };
  private static final c x = new b(10);
  private static final c y = new b(12);
  private static final c z = new b(13);
  private final String b;
  private final TimeZone c;
  private final Locale d;
  private final int e;
  private final int f;
  private transient Pattern g;
  private transient c[] h;
  private transient String i;
  private transient c j;

  static
  {
    A = new b(14);
  }

  protected b(String paramString, TimeZone paramTimeZone, Locale paramLocale, Date paramDate)
  {
    this.b = paramString;
    this.c = paramTimeZone;
    this.d = paramLocale;
    paramString = Calendar.getInstance(paramTimeZone, paramLocale);
    int i1;
    if (paramDate != null)
    {
      paramString.setTime(paramDate);
      i1 = paramString.get(1);
    }
    while (true)
    {
      this.e = (i1 / 100 * 100);
      this.f = (i1 - this.e);
      a(paramString);
      return;
      if (paramLocale.equals(a))
      {
        i1 = 0;
        continue;
      }
      paramString.setTime(new Date());
      i1 = paramString.get(1) - 80;
    }
  }

  private int a(int paramInt)
  {
    int i1 = this.e + paramInt;
    if (paramInt >= this.f)
      return i1;
    return i1 + 100;
  }

  private static Map<String, Integer> a(int paramInt, Locale paramLocale)
  {
    HashMap localHashMap = new HashMap();
    a(localHashMap, a(paramInt, false, paramLocale));
    a(localHashMap, a(paramInt, true, paramLocale));
    paramLocale = localHashMap;
    if (localHashMap.isEmpty())
      paramLocale = null;
    return paramLocale;
  }

  private c a(int paramInt, Calendar paramCalendar)
  {
    ConcurrentMap localConcurrentMap = b(paramInt);
    c localc = (c)localConcurrentMap.get(this.d);
    if (localc == null)
    {
      if (paramInt == 15);
      for (paramCalendar = new e(this.d); ; paramCalendar = new d(paramInt, paramCalendar, this.d))
      {
        localc = (c)localConcurrentMap.putIfAbsent(this.d, paramCalendar);
        if (localc == null)
          break;
        return localc;
      }
    }
    paramCalendar = localc;
    return paramCalendar;
  }

  private c a(String paramString, Calendar paramCalendar)
  {
    switch (paramString.charAt(0))
    {
    default:
    case '\'':
      do
        return new a(paramString);
      while (paramString.length() <= 2);
      return new a(paramString.substring(1, paramString.length() - 1));
    case 'D':
      return r;
    case 'E':
      return a(7, paramCalendar);
    case 'F':
      return t;
    case 'G':
      return a(0, paramCalendar);
    case 'H':
      return v;
    case 'K':
      return x;
    case 'M':
      if (paramString.length() >= 3)
        return a(2, paramCalendar);
      return n;
    case 'S':
      return A;
    case 'W':
      return q;
    case 'a':
      return a(9, paramCalendar);
    case 'd':
      return s;
    case 'h':
      return w;
    case 'k':
      return u;
    case 'm':
      return y;
    case 's':
      return z;
    case 'w':
      return p;
    case 'y':
      if (paramString.length() > 2)
        return o;
      return m;
    case 'Z':
    case 'z':
    }
    return a(15, paramCalendar);
  }

  private void a(Calendar paramCalendar)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    ArrayList localArrayList = new ArrayList();
    Matcher localMatcher = k.matcher(this.b);
    if (!localMatcher.lookingAt())
      throw new IllegalArgumentException("Illegal pattern character '" + this.b.charAt(localMatcher.regionStart()) + "'");
    this.i = localMatcher.group();
    for (c localc = a(this.i, paramCalendar); ; localc = this.j)
    {
      localMatcher.region(localMatcher.end(), localMatcher.regionEnd());
      if (!localMatcher.lookingAt())
      {
        this.j = null;
        if (localMatcher.regionStart() == localMatcher.regionEnd())
          break;
        throw new IllegalArgumentException("Failed to parse \"" + this.b + "\" ; gave up at index " + localMatcher.regionStart());
      }
      String str = localMatcher.group();
      this.j = a(str, paramCalendar);
      if (localc.a(this, localStringBuilder))
        localArrayList.add(localc);
      this.i = str;
    }
    if (localc.a(this, localStringBuilder))
      localArrayList.add(localc);
    this.i = null;
    this.h = ((c[])localArrayList.toArray(new c[localArrayList.size()]));
    this.g = Pattern.compile(localStringBuilder.toString());
  }

  private static void a(Map<String, Integer> paramMap, String[] paramArrayOfString)
  {
    if (paramArrayOfString == null);
    while (true)
    {
      return;
      int i1 = 0;
      while (i1 < paramArrayOfString.length)
      {
        if ((paramArrayOfString[i1] != null) && (paramArrayOfString[i1].length() > 0))
          paramMap.put(paramArrayOfString[i1], Integer.valueOf(i1));
        i1 += 1;
      }
    }
  }

  private static String[] a(int paramInt, boolean paramBoolean, Locale paramLocale)
  {
    paramLocale = new DateFormatSymbols(paramLocale);
    switch (paramInt)
    {
    default:
      return null;
    case 9:
      return paramLocale.getAmPmStrings();
    case 7:
      if (paramBoolean)
        return paramLocale.getWeekdays();
      return paramLocale.getShortWeekdays();
    case 0:
      return paramLocale.getEras();
    case 2:
    }
    if (paramBoolean)
      return paramLocale.getMonths();
    return paramLocale.getShortMonths();
  }

  private static StringBuilder b(StringBuilder paramStringBuilder, String paramString, boolean paramBoolean)
  {
    paramStringBuilder.append("\\Q");
    int i1 = 0;
    char c1;
    if (i1 < paramString.length())
    {
      c1 = paramString.charAt(i1);
      switch (c1)
      {
      default:
      case '\'':
      case '\\':
      }
    }
    while (true)
    {
      paramStringBuilder.append(c1);
      i1 += 1;
      break;
      if (!paramBoolean)
        continue;
      i1 += 1;
      if (i1 == paramString.length())
        return paramStringBuilder;
      c1 = paramString.charAt(i1);
      continue;
      i1 += 1;
      if (i1 == paramString.length())
        continue;
      paramStringBuilder.append(c1);
      c1 = paramString.charAt(i1);
      if (c1 == 'E')
      {
        paramStringBuilder.append("E\\\\E\\");
        c1 = 'Q';
        continue;
        paramStringBuilder.append("\\E");
        return paramStringBuilder;
      }
    }
  }

  private static Map<String, Integer> b(int paramInt, Calendar paramCalendar, Locale paramLocale)
  {
    return a(paramInt, paramLocale);
  }

  private static ConcurrentMap<Locale, c> b(int paramInt)
  {
    synchronized (l)
    {
      if (l[paramInt] == null)
        l[paramInt] = new ConcurrentHashMap(3);
      ConcurrentMap localConcurrentMap = l[paramInt];
      return localConcurrentMap;
    }
  }

  public Object a(String paramString, ParsePosition paramParsePosition)
  {
    return b(paramString, paramParsePosition);
  }

  boolean a()
  {
    return (this.j != null) && (this.j.a());
  }

  int b()
  {
    return this.i.length();
  }

  public Date b(String paramString, ParsePosition paramParsePosition)
  {
    int i3 = paramParsePosition.getIndex();
    paramString = this.g.matcher(paramString.substring(i3));
    if (!paramString.lookingAt())
      return null;
    Calendar localCalendar = Calendar.getInstance(this.c, this.d);
    localCalendar.clear();
    int i2;
    for (int i1 = 0; i1 < this.h.length; i1 = i2)
    {
      c[] arrayOfc = this.h;
      i2 = i1 + 1;
      arrayOfc[i1].a(this, localCalendar, paramString.group(i2));
    }
    paramParsePosition.setIndex(paramString.end() + i3);
    return localCalendar.getTime();
  }

  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof b));
    do
    {
      return false;
      paramObject = (b)paramObject;
    }
    while ((!this.b.equals(paramObject.b)) || (!this.c.equals(paramObject.c)) || (!this.d.equals(paramObject.d)));
    return true;
  }

  public int hashCode()
  {
    return this.b.hashCode() + (this.c.hashCode() + this.d.hashCode() * 13) * 13;
  }

  public String toString()
  {
    return "FastDateParser[" + this.b + "," + this.d + "," + this.c.getID() + "]";
  }

  private static class a extends b.c
  {
    private final String a;

    a(String paramString)
    {
      super();
      this.a = paramString;
    }

    boolean a()
    {
      char c2 = this.a.charAt(0);
      char c1 = c2;
      if (c2 == '\'')
        c1 = this.a.charAt(1);
      return Character.isDigit(c1);
    }

    boolean a(b paramb, StringBuilder paramStringBuilder)
    {
      b.a(paramStringBuilder, this.a, true);
      return false;
    }
  }

  private static class b extends b.c
  {
    private final int a;

    b(int paramInt)
    {
      super();
      this.a = paramInt;
    }

    int a(int paramInt)
    {
      return paramInt;
    }

    void a(b paramb, Calendar paramCalendar, String paramString)
    {
      paramCalendar.set(this.a, a(Integer.parseInt(paramString)));
    }

    boolean a()
    {
      return true;
    }

    boolean a(b paramb, StringBuilder paramStringBuilder)
    {
      if (paramb.a())
        paramStringBuilder.append("(\\p{Nd}{").append(paramb.b()).append("}+)");
      while (true)
      {
        return true;
        paramStringBuilder.append("(\\p{Nd}++)");
      }
    }
  }

  private static abstract class c
  {
    void a(b paramb, Calendar paramCalendar, String paramString)
    {
    }

    boolean a()
    {
      return false;
    }

    abstract boolean a(b paramb, StringBuilder paramStringBuilder);
  }

  private static class d extends b.c
  {
    private final int a;
    private final Map<String, Integer> b;

    d(int paramInt, Calendar paramCalendar, Locale paramLocale)
    {
      super();
      this.a = paramInt;
      this.b = b.a(paramInt, paramCalendar, paramLocale);
    }

    void a(b paramb, Calendar paramCalendar, String paramString)
    {
      paramb = (Integer)this.b.get(paramString);
      if (paramb == null)
      {
        paramb = new StringBuilder(paramString);
        paramb.append(" not in (");
        paramCalendar = this.b.keySet().iterator();
        while (paramCalendar.hasNext())
          paramb.append((String)paramCalendar.next()).append(' ');
        paramb.setCharAt(paramb.length() - 1, ')');
        throw new IllegalArgumentException(paramb.toString());
      }
      paramCalendar.set(this.a, paramb.intValue());
    }

    boolean a(b paramb, StringBuilder paramStringBuilder)
    {
      paramStringBuilder.append('(');
      paramb = this.b.keySet().iterator();
      while (paramb.hasNext())
        b.a(paramStringBuilder, (String)paramb.next(), false).append('|');
      paramStringBuilder.setCharAt(paramStringBuilder.length() - 1, ')');
      return true;
    }
  }

  private static class e extends b.c
  {
    private final String a;
    private final SortedMap<String, TimeZone> b = new TreeMap(String.CASE_INSENSITIVE_ORDER);

    e(Locale paramLocale)
    {
      super();
      paramLocale = DateFormatSymbols.getInstance(paramLocale).getZoneStrings();
      int j = paramLocale.length;
      int i = 0;
      if (i < j)
      {
        localIterator = paramLocale[i];
        if (localIterator[0].startsWith("GMT"));
        while (true)
        {
          i += 1;
          break;
          TimeZone localTimeZone = TimeZone.getTimeZone(localIterator[0]);
          if (!this.b.containsKey(localIterator[1]))
            this.b.put(localIterator[1], localTimeZone);
          if (!this.b.containsKey(localIterator[2]))
            this.b.put(localIterator[2], localTimeZone);
          if (!localTimeZone.useDaylightTime())
            continue;
          if (!this.b.containsKey(localIterator[3]))
            this.b.put(localIterator[3], localTimeZone);
          if (this.b.containsKey(localIterator[4]))
            continue;
          this.b.put(localIterator[4], localTimeZone);
        }
      }
      paramLocale = new StringBuilder();
      paramLocale.append("(GMT[+\\-]\\d{0,1}\\d{2}|[+\\-]\\d{2}:?\\d{2}|");
      Iterator localIterator = this.b.keySet().iterator();
      while (localIterator.hasNext())
        b.a(paramLocale, (String)localIterator.next(), false).append('|');
      paramLocale.setCharAt(paramLocale.length() - 1, ')');
      this.a = paramLocale.toString();
    }

    void a(b paramb, Calendar paramCalendar, String paramString)
    {
      if ((paramString.charAt(0) == '+') || (paramString.charAt(0) == '-'))
        paramb = TimeZone.getTimeZone("GMT" + paramString);
      TimeZone localTimeZone;
      do
      {
        while (true)
        {
          paramCalendar.setTimeZone(paramb);
          return;
          if (!paramString.startsWith("GMT"))
            break;
          paramb = TimeZone.getTimeZone(paramString);
        }
        localTimeZone = (TimeZone)this.b.get(paramString);
        paramb = localTimeZone;
      }
      while (localTimeZone != null);
      throw new IllegalArgumentException(paramString + " is not a supported timezone name");
    }

    boolean a(b paramb, StringBuilder paramStringBuilder)
    {
      paramStringBuilder.append(this.a);
      return true;
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.e.b
 * JD-Core Version:    0.6.0
 */