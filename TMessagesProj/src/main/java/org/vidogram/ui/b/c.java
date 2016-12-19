package org.vidogram.ui.b;

import java.util.ArrayList;
import org.vidogram.tgnet.ConnectionsManager;
import org.vidogram.tgnet.f;
import org.vidogram.tgnet.g.gg;

public class c extends a
{
  protected ArrayList<f> a = new ArrayList();
  protected String b = null;
  protected boolean c = false;
  private int d = 0;
  private int e;

  public void a(String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (this.d != 0)
    {
      ConnectionsManager.a().a(this.d, true);
      this.d = 0;
    }
    if ((paramString == null) || (paramString.length() < 5))
    {
      this.a.clear();
      this.e = 0;
      notifyDataSetChanged();
      return;
    }
    g.gg localgg = new g.gg();
    localgg.c = paramString;
    localgg.d = 50;
    int i = this.e + 1;
    this.e = i;
    this.d = ConnectionsManager.a().a(localgg, new org.vidogram.tgnet.c(i, paramBoolean1, paramBoolean2, paramString)
    {
    }
    , 2);
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.b.c
 * JD-Core Version:    0.6.0
 */