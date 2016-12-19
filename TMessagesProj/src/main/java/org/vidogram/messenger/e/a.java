package org.vidogram.messenger.e;

import java.text.FieldPosition;
import java.text.Format;
import java.text.ParsePosition;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class a extends Format
{
  private static final d<a> a = new d()
  {
    protected a a(String paramString, TimeZone paramTimeZone, Locale paramLocale)
    {
      return new a(paramString, paramTimeZone, paramLocale);
    }
  };
  private final c b;
  private final b c;

  protected a(String paramString, TimeZone paramTimeZone, Locale paramLocale)
  {
    this(paramString, paramTimeZone, paramLocale, null);
  }

  protected a(String paramString, TimeZone paramTimeZone, Locale paramLocale, Date paramDate)
  {
    this.b = new c(paramString, paramTimeZone, paramLocale);
    this.c = new b(paramString, paramTimeZone, paramLocale, paramDate);
  }

  public static a a(String paramString, Locale paramLocale)
  {
    return (a)a.c(paramString, null, paramLocale);
  }

  public String a(long paramLong)
  {
    return this.b.a(paramLong);
  }

  public String a(Date paramDate)
  {
    return this.b.a(paramDate);
  }

  public TimeZone a()
  {
    return this.b.c();
  }

  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof a))
      return false;
    paramObject = (a)paramObject;
    return this.b.equals(paramObject.b);
  }

  public StringBuffer format(Object paramObject, StringBuffer paramStringBuffer, FieldPosition paramFieldPosition)
  {
    return this.b.a(paramObject, paramStringBuffer, paramFieldPosition);
  }

  public int hashCode()
  {
    return this.b.hashCode();
  }

  public Object parseObject(String paramString, ParsePosition paramParsePosition)
  {
    return this.c.a(paramString, paramParsePosition);
  }

  public String toString()
  {
    return "FastDateFormat[" + this.b.b() + "," + this.b.d() + "," + this.b.c().getID() + "]";
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.e.a
 * JD-Core Version:    0.6.0
 */