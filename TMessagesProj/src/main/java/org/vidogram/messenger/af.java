package org.vidogram.messenger;

import java.util.Locale;

public class af
{
  public long a;
  public long b;
  public int c;
  public int d;
  public int e;
  public int f;
  public int g;
  public int h;
  public String i;

  public String a()
  {
    return String.format(Locale.US, "-1_%d_%d_%d_%d_%d_%d_%d_%d_%s", new Object[] { Long.valueOf(this.a), Long.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.h), Integer.valueOf(this.f), Integer.valueOf(this.g), this.i });
  }

  public boolean a(String paramString)
  {
    if (paramString.length() < 6)
      return false;
    while (true)
    {
      int j;
      try
      {
        paramString = paramString.split("_");
        if (paramString.length >= 10)
        {
          this.a = Long.parseLong(paramString[1]);
          this.b = Long.parseLong(paramString[2]);
          this.c = Integer.parseInt(paramString[3]);
          this.d = Integer.parseInt(paramString[4]);
          this.e = Integer.parseInt(paramString[5]);
          this.h = Integer.parseInt(paramString[6]);
          this.f = Integer.parseInt(paramString[7]);
          this.g = Integer.parseInt(paramString[8]);
          j = 9;
          if (j < paramString.length)
          {
            if (this.i != null)
              continue;
            this.i = paramString[j];
            break label180;
            this.i = (this.i + "_" + paramString[j]);
          }
        }
      }
      catch (java.lang.Exception paramString)
      {
        n.a("tmessages", paramString);
        return false;
      }
      return true;
      label180: j += 1;
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.af
 * JD-Core Version:    0.6.0
 */