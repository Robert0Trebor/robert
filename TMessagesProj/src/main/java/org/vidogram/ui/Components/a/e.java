package org.vidogram.ui.Components.a;

import java.util.Arrays;
import java.util.Vector;

public class e
{
  public double a;
  private Vector<g> b = new Vector();
  private int c;
  private float d;
  private a e;

  public e(g paramg)
  {
    this.b.add(paramg);
  }

  public e(g[] paramArrayOfg)
  {
    this.b.addAll(Arrays.asList(paramArrayOfg));
  }

  public int a()
  {
    if (this.b == null)
      return 0;
    return this.b.size();
  }

  public void a(int paramInt, float paramFloat, a parama)
  {
    this.c = paramInt;
    this.d = paramFloat;
    this.e = parama;
  }

  public g[] b()
  {
    g[] arrayOfg = new g[this.b.size()];
    this.b.toArray(arrayOfg);
    return arrayOfg;
  }

  public int c()
  {
    return this.c;
  }

  public float d()
  {
    return this.d;
  }

  public a e()
  {
    return this.e;
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.Components.a.e
 * JD-Core Version:    0.6.0
 */