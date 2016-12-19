package org.vidogram.messenger.exoplayer.e;

import android.content.Context;
import android.net.Uri;
import org.vidogram.messenger.exoplayer.f.b;
import org.vidogram.messenger.exoplayer.f.r;

public final class i
  implements n
{
  private final n a;
  private final n b;
  private final n c;
  private final n d;
  private n e;

  public i(Context paramContext, String paramString)
  {
    this(paramContext, null, paramString, false);
  }

  public i(Context paramContext, m paramm, String paramString, boolean paramBoolean)
  {
    this(paramContext, paramm, new h(paramString, null, paramm, 8000, 8000, paramBoolean));
  }

  public i(Context paramContext, m paramm, n paramn)
  {
    this.a = ((n)b.a(paramn));
    this.b = new j(paramm);
    this.c = new c(paramContext, paramm);
    this.d = new d(paramContext, paramm);
  }

  public int a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    return this.e.a(paramArrayOfByte, paramInt1, paramInt2);
  }

  public long a(f paramf)
  {
    boolean bool;
    String str;
    if (this.e == null)
    {
      bool = true;
      b.b(bool);
      str = paramf.a.getScheme();
      if (!r.a(paramf.a))
        break label81;
      if (!paramf.a.getPath().startsWith("/android_asset/"))
        break label70;
      this.e = this.c;
    }
    while (true)
    {
      return this.e.a(paramf);
      bool = false;
      break;
      label70: this.e = this.b;
      continue;
      label81: if ("asset".equals(str))
      {
        this.e = this.c;
        continue;
      }
      if ("content".equals(str))
      {
        this.e = this.d;
        continue;
      }
      this.e = this.a;
    }
  }

  public void a()
  {
    if (this.e != null);
    try
    {
      this.e.a();
      return;
    }
    finally
    {
      this.e = null;
    }
    throw localObject;
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.exoplayer.e.i
 * JD-Core Version:    0.6.0
 */