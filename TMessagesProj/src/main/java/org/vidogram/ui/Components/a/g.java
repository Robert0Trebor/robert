package org.vidogram.ui.Components.a;

import android.graphics.PointF;

public class g
{
  public double a;
  public double b;
  public double c;
  public boolean d;

  public g(double paramDouble1, double paramDouble2, double paramDouble3)
  {
    this.a = paramDouble1;
    this.b = paramDouble2;
    this.c = paramDouble3;
  }

  PointF a()
  {
    return new PointF((float)this.a, (float)this.b);
  }

  g a(double paramDouble)
  {
    return new g(this.a * paramDouble, this.b * paramDouble, this.c * paramDouble);
  }

  g a(g paramg)
  {
    return new g(this.a + paramg.a, this.b + paramg.b, this.c + paramg.c);
  }

  g a(g paramg, double paramDouble)
  {
    return new g((this.a + paramg.a) * paramDouble, (this.b + paramg.b) * paramDouble, (this.c + paramg.c) * paramDouble);
  }

  g b(g paramg)
  {
    return new g(this.a - paramg.a, this.b - paramg.b, this.c - paramg.c);
  }

  float c(g paramg)
  {
    return (float)Math.sqrt(Math.pow(this.a - paramg.a, 2.0D) + Math.pow(this.b - paramg.b, 2.0D) + Math.pow(this.c - paramg.c, 2.0D));
  }

  public boolean equals(Object paramObject)
  {
    int i = 1;
    if (paramObject == null);
    do
    {
      return false;
      if (paramObject == this)
        return true;
    }
    while (!(paramObject instanceof g));
    paramObject = (g)paramObject;
    if ((this.a == paramObject.a) && (this.b == paramObject.b) && (this.c == paramObject.c));
    while (true)
    {
      return i;
      i = 0;
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.Components.a.g
 * JD-Core Version:    0.6.0
 */