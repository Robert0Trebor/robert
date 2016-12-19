package org.vidogram.messenger.e;

import java.io.Serializable;
import java.text.DateFormatSymbols;
import java.text.FieldPosition;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class c
  implements Serializable
{
  private static final ConcurrentMap<g, String> f = new ConcurrentHashMap(7);
  private final String a;
  private final TimeZone b;
  private final Locale c;
  private transient d[] d;
  private transient int e;

  protected c(String paramString, TimeZone paramTimeZone, Locale paramLocale)
  {
    this.a = paramString;
    this.b = paramTimeZone;
    this.c = paramLocale;
    e();
  }

  private String a(Calendar paramCalendar)
  {
    return b(paramCalendar, new StringBuffer(this.e)).toString();
  }

  static String a(TimeZone paramTimeZone, boolean paramBoolean, int paramInt, Locale paramLocale)
  {
    g localg = new g(paramTimeZone, paramBoolean, paramInt, paramLocale);
    String str2 = (String)f.get(localg);
    String str1 = str2;
    if (str2 == null)
    {
      paramTimeZone = paramTimeZone.getDisplayName(paramBoolean, paramInt, paramLocale);
      str1 = (String)f.putIfAbsent(localg, paramTimeZone);
      if (str1 == null);
    }
    else
    {
      return str1;
    }
    return paramTimeZone;
  }

  private void e()
  {
    List localList = a();
    this.d = ((d[])localList.toArray(new d[localList.size()]));
    int i = 0;
    int j = this.d.length;
    while (true)
    {
      j -= 1;
      if (j < 0)
        break;
      i += this.d[j].a();
    }
    this.e = i;
  }

  private GregorianCalendar f()
  {
    return new GregorianCalendar(this.b, this.c);
  }

  public String a(long paramLong)
  {
    GregorianCalendar localGregorianCalendar = f();
    localGregorianCalendar.setTimeInMillis(paramLong);
    return a(localGregorianCalendar);
  }

  protected String a(String paramString, int[] paramArrayOfInt)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    int i = paramArrayOfInt[0];
    int m = paramString.length();
    char c1 = paramString.charAt(i);
    if (((c1 >= 'A') && (c1 <= 'Z')) || ((c1 >= 'a') && (c1 <= 'z')))
      localStringBuilder.append(c1);
    int j;
    int k;
    while (true)
    {
      j = i;
      if (i + 1 < m)
      {
        j = i;
        if (paramString.charAt(i + 1) == c1)
        {
          localStringBuilder.append(c1);
          i += 1;
          continue;
          localStringBuilder.append('\'');
          k = 0;
          j = i;
          if (i < m)
          {
            c1 = paramString.charAt(i);
            if (c1 == '\'')
            {
              if ((i + 1 >= m) || (paramString.charAt(i + 1) != '\''))
                break;
              i += 1;
              localStringBuilder.append(c1);
              j = k;
            }
          }
        }
      }
    }
    while (true)
    {
      i += 1;
      k = j;
      break;
      if (k == 0)
      {
        j = 1;
        continue;
      }
      j = 0;
      continue;
      if ((k == 0) && (((c1 >= 'A') && (c1 <= 'Z')) || ((c1 >= 'a') && (c1 <= 'z'))))
      {
        j = i - 1;
        paramArrayOfInt[0] = j;
        return localStringBuilder.toString();
      }
      localStringBuilder.append(c1);
      j = k;
    }
  }

  public String a(Date paramDate)
  {
    GregorianCalendar localGregorianCalendar = f();
    localGregorianCalendar.setTime(paramDate);
    return a(localGregorianCalendar);
  }

  public StringBuffer a(long paramLong, StringBuffer paramStringBuffer)
  {
    return a(new Date(paramLong), paramStringBuffer);
  }

  public StringBuffer a(Object paramObject, StringBuffer paramStringBuffer, FieldPosition paramFieldPosition)
  {
    if ((paramObject instanceof Date))
      return a((Date)paramObject, paramStringBuffer);
    if ((paramObject instanceof Calendar))
      return a((Calendar)paramObject, paramStringBuffer);
    if ((paramObject instanceof Long))
      return a(((Long)paramObject).longValue(), paramStringBuffer);
    paramStringBuffer = new StringBuilder().append("Unknown class: ");
    if (paramObject == null);
    for (paramObject = "<null>"; ; paramObject = paramObject.getClass().getName())
      throw new IllegalArgumentException(paramObject);
  }

  public StringBuffer a(Calendar paramCalendar, StringBuffer paramStringBuffer)
  {
    return b(paramCalendar, paramStringBuffer);
  }

  public StringBuffer a(Date paramDate, StringBuffer paramStringBuffer)
  {
    GregorianCalendar localGregorianCalendar = f();
    localGregorianCalendar.setTime(paramDate);
    return b(localGregorianCalendar, paramStringBuffer);
  }

  protected List<d> a()
  {
    Object localObject = new DateFormatSymbols(this.c);
    ArrayList localArrayList = new ArrayList();
    String[] arrayOfString3 = ((DateFormatSymbols)localObject).getEras();
    String[] arrayOfString4 = ((DateFormatSymbols)localObject).getMonths();
    String[] arrayOfString5 = ((DateFormatSymbols)localObject).getShortMonths();
    String[] arrayOfString1 = ((DateFormatSymbols)localObject).getWeekdays();
    String[] arrayOfString2 = ((DateFormatSymbols)localObject).getShortWeekdays();
    String[] arrayOfString6 = ((DateFormatSymbols)localObject).getAmPmStrings();
    int k = this.a.length();
    int[] arrayOfInt = new int[1];
    int i = 0;
    int m;
    int j;
    if (i < k)
    {
      arrayOfInt[0] = i;
      localObject = a(this.a, arrayOfInt);
      m = arrayOfInt[0];
      j = ((String)localObject).length();
      if (j != 0);
    }
    else
    {
      return localArrayList;
    }
    switch (((String)localObject).charAt(0))
    {
    default:
      throw new IllegalArgumentException("Illegal pattern component: " + (String)localObject);
    case 'G':
      localObject = new f(0, arrayOfString3);
    case 'y':
    case 'M':
    case 'd':
    case 'h':
    case 'H':
    case 'm':
    case 's':
    case 'S':
    case 'E':
    case 'D':
    case 'F':
    case 'w':
    case 'W':
    case 'a':
    case 'k':
    case 'K':
    case 'z':
    case 'Z':
    case '\'':
    }
    while (true)
    {
      localArrayList.add(localObject);
      i = m + 1;
      break;
      if (j == 2)
      {
        localObject = n.a;
        continue;
      }
      i = j;
      if (j < 4)
        i = 4;
      localObject = a(1, i);
      continue;
      if (j >= 4)
      {
        localObject = new f(2, arrayOfString4);
        continue;
      }
      if (j == 3)
      {
        localObject = new f(2, arrayOfString5);
        continue;
      }
      if (j == 2)
      {
        localObject = l.a;
        continue;
      }
      localObject = o.a;
      continue;
      localObject = a(5, j);
      continue;
      localObject = new j(a(10, j));
      continue;
      localObject = a(11, j);
      continue;
      localObject = a(12, j);
      continue;
      localObject = a(13, j);
      continue;
      localObject = a(14, j);
      continue;
      if (j < 4);
      for (localObject = arrayOfString2; ; localObject = arrayOfString1)
      {
        localObject = new f(7, localObject);
        break;
      }
      localObject = a(6, j);
      continue;
      localObject = a(8, j);
      continue;
      localObject = a(3, j);
      continue;
      localObject = a(4, j);
      continue;
      localObject = new f(9, arrayOfString6);
      continue;
      localObject = new k(a(11, j));
      continue;
      localObject = a(10, j);
      continue;
      if (j >= 4)
      {
        localObject = new h(this.b, this.c, 1);
        continue;
      }
      localObject = new h(this.b, this.c, 0);
      continue;
      if (j == 1)
      {
        localObject = i.b;
        continue;
      }
      localObject = i.a;
      continue;
      localObject = ((String)localObject).substring(1);
      if (((String)localObject).length() == 1)
      {
        localObject = new a(((String)localObject).charAt(0));
        continue;
      }
      localObject = new e((String)localObject);
    }
  }

  protected b a(int paramInt1, int paramInt2)
  {
    switch (paramInt2)
    {
    default:
      return new c(paramInt1, paramInt2);
    case 1:
      return new p(paramInt1);
    case 2:
    }
    return new m(paramInt1);
  }

  public String b()
  {
    return this.a;
  }

  protected StringBuffer b(Calendar paramCalendar, StringBuffer paramStringBuffer)
  {
    d[] arrayOfd = this.d;
    int j = arrayOfd.length;
    int i = 0;
    while (i < j)
    {
      arrayOfd[i].a(paramStringBuffer, paramCalendar);
      i += 1;
    }
    return paramStringBuffer;
  }

  public TimeZone c()
  {
    return this.b;
  }

  public Locale d()
  {
    return this.c;
  }

  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof c));
    do
    {
      return false;
      paramObject = (c)paramObject;
    }
    while ((!this.a.equals(paramObject.a)) || (!this.b.equals(paramObject.b)) || (!this.c.equals(paramObject.c)));
    return true;
  }

  public int hashCode()
  {
    return this.a.hashCode() + (this.b.hashCode() + this.c.hashCode() * 13) * 13;
  }

  public String toString()
  {
    return "FastDatePrinter[" + this.a + "," + this.c + "," + this.b.getID() + "]";
  }

  private static class a
    implements c.d
  {
    private final char a;

    a(char paramChar)
    {
      this.a = paramChar;
    }

    public int a()
    {
      return 1;
    }

    public void a(StringBuffer paramStringBuffer, Calendar paramCalendar)
    {
      paramStringBuffer.append(this.a);
    }
  }

  private static abstract interface b extends c.d
  {
    public abstract void a(StringBuffer paramStringBuffer, int paramInt);
  }

  private static class c
    implements c.b
  {
    private final int a;
    private final int b;

    c(int paramInt1, int paramInt2)
    {
      if (paramInt2 < 3)
        throw new IllegalArgumentException();
      this.a = paramInt1;
      this.b = paramInt2;
    }

    public int a()
    {
      return 4;
    }

    public final void a(StringBuffer paramStringBuffer, int paramInt)
    {
      if (paramInt < 100)
      {
        i = this.b;
        while (true)
        {
          i -= 1;
          if (i < 2)
            break;
          paramStringBuffer.append('0');
        }
        paramStringBuffer.append((char)(paramInt / 10 + 48));
        paramStringBuffer.append((char)(paramInt % 10 + 48));
        return;
      }
      if (paramInt < 1000);
      for (int i = 3; ; i = Integer.toString(paramInt).length())
      {
        int j = this.b;
        while (true)
        {
          j -= 1;
          if (j < i)
            break;
          paramStringBuffer.append('0');
        }
      }
      paramStringBuffer.append(Integer.toString(paramInt));
    }

    public void a(StringBuffer paramStringBuffer, Calendar paramCalendar)
    {
      a(paramStringBuffer, paramCalendar.get(this.a));
    }
  }

  private static abstract interface d
  {
    public abstract int a();

    public abstract void a(StringBuffer paramStringBuffer, Calendar paramCalendar);
  }

  private static class e
    implements c.d
  {
    private final String a;

    e(String paramString)
    {
      this.a = paramString;
    }

    public int a()
    {
      return this.a.length();
    }

    public void a(StringBuffer paramStringBuffer, Calendar paramCalendar)
    {
      paramStringBuffer.append(this.a);
    }
  }

  private static class f
    implements c.d
  {
    private final int a;
    private final String[] b;

    f(int paramInt, String[] paramArrayOfString)
    {
      this.a = paramInt;
      this.b = paramArrayOfString;
    }

    public int a()
    {
      int i = 0;
      int j = this.b.length;
      j -= 1;
      if (j >= 0)
      {
        int k = this.b[j].length();
        if (k <= i)
          break label38;
        i = k;
      }
      label38: 
      while (true)
      {
        break;
        return i;
      }
    }

    public void a(StringBuffer paramStringBuffer, Calendar paramCalendar)
    {
      paramStringBuffer.append(this.b[paramCalendar.get(this.a)]);
    }
  }

  private static class g
  {
    private final TimeZone a;
    private final int b;
    private final Locale c;

    g(TimeZone paramTimeZone, boolean paramBoolean, int paramInt, Locale paramLocale)
    {
      this.a = paramTimeZone;
      if (paramBoolean);
      for (this.b = (0x80000000 | paramInt); ; this.b = paramInt)
      {
        this.c = paramLocale;
        return;
      }
    }

    public boolean equals(Object paramObject)
    {
      if (this == paramObject);
      while (true)
      {
        return true;
        if (!(paramObject instanceof g))
          break;
        paramObject = (g)paramObject;
        if ((!this.a.equals(paramObject.a)) || (this.b != paramObject.b) || (!this.c.equals(paramObject.c)))
          return false;
      }
      return false;
    }

    public int hashCode()
    {
      return (this.b * 31 + this.c.hashCode()) * 31 + this.a.hashCode();
    }
  }

  private static class h
    implements c.d
  {
    private final Locale a;
    private final int b;
    private final String c;
    private final String d;

    h(TimeZone paramTimeZone, Locale paramLocale, int paramInt)
    {
      this.a = paramLocale;
      this.b = paramInt;
      this.c = c.a(paramTimeZone, false, paramInt, paramLocale);
      this.d = c.a(paramTimeZone, true, paramInt, paramLocale);
    }

    public int a()
    {
      return Math.max(this.c.length(), this.d.length());
    }

    public void a(StringBuffer paramStringBuffer, Calendar paramCalendar)
    {
      TimeZone localTimeZone = paramCalendar.getTimeZone();
      if ((localTimeZone.useDaylightTime()) && (paramCalendar.get(16) != 0))
      {
        paramStringBuffer.append(c.a(localTimeZone, true, this.b, this.a));
        return;
      }
      paramStringBuffer.append(c.a(localTimeZone, false, this.b, this.a));
    }
  }

  private static class i
    implements c.d
  {
    static final i a = new i(true);
    static final i b = new i(false);
    final boolean c;

    i(boolean paramBoolean)
    {
      this.c = paramBoolean;
    }

    public int a()
    {
      return 5;
    }

    public void a(StringBuffer paramStringBuffer, Calendar paramCalendar)
    {
      int i = paramCalendar.get(15) + paramCalendar.get(16);
      if (i < 0)
      {
        paramStringBuffer.append('-');
        i = -i;
      }
      while (true)
      {
        int j = i / 3600000;
        paramStringBuffer.append((char)(j / 10 + 48));
        paramStringBuffer.append((char)(j % 10 + 48));
        if (this.c)
          paramStringBuffer.append(':');
        i = i / 60000 - j * 60;
        paramStringBuffer.append((char)(i / 10 + 48));
        paramStringBuffer.append((char)(i % 10 + 48));
        return;
        paramStringBuffer.append('+');
      }
    }
  }

  private static class j
    implements c.b
  {
    private final c.b a;

    j(c.b paramb)
    {
      this.a = paramb;
    }

    public int a()
    {
      return this.a.a();
    }

    public void a(StringBuffer paramStringBuffer, int paramInt)
    {
      this.a.a(paramStringBuffer, paramInt);
    }

    public void a(StringBuffer paramStringBuffer, Calendar paramCalendar)
    {
      int j = paramCalendar.get(10);
      int i = j;
      if (j == 0)
        i = paramCalendar.getLeastMaximum(10) + 1;
      this.a.a(paramStringBuffer, i);
    }
  }

  private static class k
    implements c.b
  {
    private final c.b a;

    k(c.b paramb)
    {
      this.a = paramb;
    }

    public int a()
    {
      return this.a.a();
    }

    public void a(StringBuffer paramStringBuffer, int paramInt)
    {
      this.a.a(paramStringBuffer, paramInt);
    }

    public void a(StringBuffer paramStringBuffer, Calendar paramCalendar)
    {
      int j = paramCalendar.get(11);
      int i = j;
      if (j == 0)
        i = paramCalendar.getMaximum(11) + 1;
      this.a.a(paramStringBuffer, i);
    }
  }

  private static class l
    implements c.b
  {
    static final l a = new l();

    public int a()
    {
      return 2;
    }

    public final void a(StringBuffer paramStringBuffer, int paramInt)
    {
      paramStringBuffer.append((char)(paramInt / 10 + 48));
      paramStringBuffer.append((char)(paramInt % 10 + 48));
    }

    public void a(StringBuffer paramStringBuffer, Calendar paramCalendar)
    {
      a(paramStringBuffer, paramCalendar.get(2) + 1);
    }
  }

  private static class m
    implements c.b
  {
    private final int a;

    m(int paramInt)
    {
      this.a = paramInt;
    }

    public int a()
    {
      return 2;
    }

    public final void a(StringBuffer paramStringBuffer, int paramInt)
    {
      if (paramInt < 100)
      {
        paramStringBuffer.append((char)(paramInt / 10 + 48));
        paramStringBuffer.append((char)(paramInt % 10 + 48));
        return;
      }
      paramStringBuffer.append(Integer.toString(paramInt));
    }

    public void a(StringBuffer paramStringBuffer, Calendar paramCalendar)
    {
      a(paramStringBuffer, paramCalendar.get(this.a));
    }
  }

  private static class n
    implements c.b
  {
    static final n a = new n();

    public int a()
    {
      return 2;
    }

    public final void a(StringBuffer paramStringBuffer, int paramInt)
    {
      paramStringBuffer.append((char)(paramInt / 10 + 48));
      paramStringBuffer.append((char)(paramInt % 10 + 48));
    }

    public void a(StringBuffer paramStringBuffer, Calendar paramCalendar)
    {
      a(paramStringBuffer, paramCalendar.get(1) % 100);
    }
  }

  private static class o
    implements c.b
  {
    static final o a = new o();

    public int a()
    {
      return 2;
    }

    public final void a(StringBuffer paramStringBuffer, int paramInt)
    {
      if (paramInt < 10)
      {
        paramStringBuffer.append((char)(paramInt + 48));
        return;
      }
      paramStringBuffer.append((char)(paramInt / 10 + 48));
      paramStringBuffer.append((char)(paramInt % 10 + 48));
    }

    public void a(StringBuffer paramStringBuffer, Calendar paramCalendar)
    {
      a(paramStringBuffer, paramCalendar.get(2) + 1);
    }
  }

  private static class p
    implements c.b
  {
    private final int a;

    p(int paramInt)
    {
      this.a = paramInt;
    }

    public int a()
    {
      return 4;
    }

    public final void a(StringBuffer paramStringBuffer, int paramInt)
    {
      if (paramInt < 10)
      {
        paramStringBuffer.append((char)(paramInt + 48));
        return;
      }
      if (paramInt < 100)
      {
        paramStringBuffer.append((char)(paramInt / 10 + 48));
        paramStringBuffer.append((char)(paramInt % 10 + 48));
        return;
      }
      paramStringBuffer.append(Integer.toString(paramInt));
    }

    public void a(StringBuffer paramStringBuffer, Calendar paramCalendar)
    {
      a(paramStringBuffer, paramCalendar.get(this.a));
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.e.c
 * JD-Core Version:    0.6.0
 */