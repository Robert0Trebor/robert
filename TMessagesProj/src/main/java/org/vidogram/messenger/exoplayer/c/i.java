package org.vidogram.messenger.exoplayer.c;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class i
{
  private static final Pattern c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
  public final int a;
  public final int b;

  private i(int paramInt1, int paramInt2)
  {
    this.a = paramInt1;
    this.b = paramInt2;
  }

  public static i a(int paramInt)
  {
    int i = paramInt >> 12;
    paramInt &= 4095;
    if ((i == 0) && (paramInt == 0))
      return null;
    return new i(i, paramInt);
  }

  public static i a(String paramString1, String paramString2)
  {
    if (!"iTunSMPB".equals(paramString1));
    while (true)
    {
      return null;
      paramString1 = c.matcher(paramString2);
      if (!paramString1.find())
        continue;
      try
      {
        int i = Integer.parseInt(paramString1.group(1), 16);
        int j = Integer.parseInt(paramString1.group(2), 16);
        if ((i == 0) && (j == 0))
          continue;
        paramString1 = new i(i, j);
        return paramString1;
      }
      catch (java.lang.NumberFormatException paramString1)
      {
      }
    }
    return null;
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.exoplayer.c.i
 * JD-Core Version:    0.6.0
 */