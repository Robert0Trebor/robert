package org.vidogram.ui.Components.a;

import android.graphics.Matrix;
import android.view.MotionEvent;
import java.util.Vector;
import org.vidogram.messenger.a;

public class c
{
  private j a;
  private boolean b;
  private boolean c;
  private boolean d;
  private boolean e;
  private g f;
  private double g;
  private g[] h = new g[3];
  private int i;
  private Matrix j;
  private float[] k = new float[2];

  public c(j paramj)
  {
    this.a = paramj;
  }

  private g a(g paramg1, g paramg2, g paramg3, float paramFloat)
  {
    double d1 = Math.pow(1.0F - paramFloat, 2.0D);
    double d2 = 2.0F * (1.0F - paramFloat) * paramFloat;
    double d3 = paramFloat * paramFloat;
    return new g(paramg1.a * d1 + paramg3.a * d2 + paramg2.a * d3, d1 * paramg1.b + d2 * paramg3.b + paramg2.b * d3, 1.0D);
  }

  private void a()
  {
    this.i = 0;
  }

  private void a(e parame)
  {
    parame.a(this.a.getCurrentColor(), this.a.getCurrentWeight(), this.a.getCurrentBrush());
    if (this.e)
      this.g = 0.0D;
    parame.a = this.g;
    this.a.getPainting().a(parame, this.e, new Runnable(parame)
    {
      public void run()
      {
        a.a(new Runnable()
        {
          public void run()
          {
            c.a(c.this, c.1.this.a.a);
            c.a(c.this, false);
          }
        });
      }
    });
  }

  private void a(boolean paramBoolean)
  {
    if (this.i > 2)
    {
      localObject1 = new Vector();
      g localg1 = this.h[0];
      Object localObject2 = this.h[1];
      g localg2 = this.h[2];
      if ((localg2 == null) || (localObject2 == null) || (localg1 == null))
        return;
      localg1 = ((g)localObject2).a(localg1, 0.5D);
      localg2 = localg2.a((g)localObject2, 0.5D);
      int n = (int)Math.min(48.0D, Math.max(Math.floor(localg1.c(localg2) / 1), 24.0D));
      float f1 = 0.0F;
      float f2 = 1.0F / n;
      int m = 0;
      while (m < n)
      {
        g localg3 = a(localg1, localg2, (g)localObject2, f1);
        if (this.c)
        {
          localg3.d = true;
          this.c = false;
        }
        ((Vector)localObject1).add(localg3);
        f1 += f2;
        m += 1;
      }
      if (paramBoolean)
        localg2.d = true;
      ((Vector)localObject1).add(localg2);
      localObject2 = new g[((Vector)localObject1).size()];
      ((Vector)localObject1).toArray(localObject2);
      a(new e(localObject2));
      System.arraycopy(this.h, 1, this.h, 0, 2);
      if (paramBoolean)
      {
        this.i = 0;
        return;
      }
      this.i = 2;
      return;
    }
    Object localObject1 = new g[this.i];
    System.arraycopy(this.h, 0, localObject1, 0, this.i);
    a(new e(localObject1));
  }

  public void a(Matrix paramMatrix)
  {
    this.j = new Matrix();
    paramMatrix.invert(this.j);
  }

  public void a(MotionEvent paramMotionEvent)
  {
    int m = paramMotionEvent.getActionMasked();
    float f1 = paramMotionEvent.getX();
    float f2 = this.a.getHeight();
    float f3 = paramMotionEvent.getY();
    this.k[0] = f1;
    this.k[1] = (f2 - f3);
    this.j.mapPoints(this.k);
    paramMotionEvent = new g(this.k[0], this.k[1], 1.0D);
    switch (m)
    {
    default:
    case 0:
    case 2:
      do
      {
        return;
        if (this.b)
          continue;
        this.b = true;
        this.d = false;
        this.c = true;
        this.f = paramMotionEvent;
        this.h[0] = paramMotionEvent;
        this.i = 1;
        this.e = true;
        return;
      }
      while (paramMotionEvent.c(this.f) < a.a(5.0F));
      if (!this.d)
      {
        this.a.b();
        this.d = true;
      }
      this.h[this.i] = paramMotionEvent;
      this.i += 1;
      if (this.i == 3)
        a(false);
      this.f = paramMotionEvent;
      return;
    case 1:
    }
    if (!this.d)
    {
      if (this.a.a())
      {
        paramMotionEvent.d = true;
        a(new e(paramMotionEvent));
      }
      a();
    }
    while (true)
    {
      this.i = 0;
      this.a.getPainting().a(this.a.getCurrentColor());
      this.b = false;
      this.a.a(this.d);
      return;
      if (this.i <= 0)
        continue;
      a(true);
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.Components.a.c
 * JD-Core Version:    0.6.0
 */