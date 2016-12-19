package org.vidogram.messenger.exoplayer.f;

public final class i
{
  public static boolean a(String paramString)
  {
    return c(paramString).equals("audio");
  }

  public static boolean b(String paramString)
  {
    return c(paramString).equals("video");
  }

  private static String c(String paramString)
  {
    int i = paramString.indexOf('/');
    if (i == -1)
      throw new IllegalArgumentException("Invalid mime type: " + paramString);
    return paramString.substring(0, i);
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.exoplayer.f.i
 * JD-Core Version:    0.6.0
 */