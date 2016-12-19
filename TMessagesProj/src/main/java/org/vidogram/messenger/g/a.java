package org.vidogram.messenger.g;

import android.content.Intent;

public class a extends s
{
  private Intent b;

  public a()
  {
  }

  public a(i parami)
  {
    super(parami);
  }

  public String getMessage()
  {
    if (this.b != null)
      return "User needs to (re)enter credentials.";
    return super.getMessage();
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.g.a
 * JD-Core Version:    0.6.0
 */