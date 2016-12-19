package org.vidogram.ui.Components;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.ViewConfiguration;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

public class ay
{
  private static float A;
  private static float B;
  private static float u = (float)(Math.log(0.75D) / Math.log(0.9D));
  private static float v = 0.4F;
  private static float w = 1.0F - v;
  private static final float[] x = new float[101];
  private int a;
  private int b;
  private int c;
  private int d;
  private int e;
  private int f;
  private int g;
  private int h;
  private int i;
  private int j;
  private int k;
  private long l;
  private int m;
  private float n;
  private float o;
  private float p;
  private boolean q = true;
  private Interpolator r;
  private boolean s;
  private float t;
  private float y;
  private final float z;

  static
  {
    float f1 = 0.0F;
    int i1 = 0;
    if (i1 <= 100)
    {
      float f4 = i1 / 100.0F;
      float f2 = 1.0F;
      while (true)
      {
        float f3 = (f2 - f1) / 2.0F + f1;
        float f5 = 3.0F * f3 * (1.0F - f3);
        float f6 = ((1.0F - f3) * v + w * f3) * f5 + f3 * f3 * f3;
        if (Math.abs(f6 - f4) < 1.E-005D)
        {
          x[i1] = (f3 * f3 * f3 + f5);
          i1 += 1;
          break;
        }
        if (f6 > f4)
        {
          f2 = f3;
          continue;
        }
        f1 = f3;
      }
    }
    x[100] = 1.0F;
    A = 8.0F;
    B = 1.0F;
    B = 1.0F / a(1.0F);
  }

  public ay(Context paramContext, Interpolator paramInterpolator)
  {
    this(paramContext, paramInterpolator, true);
  }

  public ay(Context paramContext, Interpolator paramInterpolator, boolean paramBoolean)
  {
    this.r = paramInterpolator;
    this.z = (paramContext.getResources().getDisplayMetrics().density * 160.0F);
    this.y = b(ViewConfiguration.getScrollFriction());
    this.s = paramBoolean;
  }

  static float a(float paramFloat)
  {
    paramFloat = A * paramFloat;
    if (paramFloat < 1.0F)
      paramFloat -= 1.0F - (float)Math.exp(-paramFloat);
    while (true)
    {
      return paramFloat * B;
      paramFloat = (1.0F - (float)Math.exp(1.0F - paramFloat)) * (1.0F - 0.3678795F) + 0.3678795F;
    }
  }

  private float b(float paramFloat)
  {
    return 386.0878F * this.z * paramFloat;
  }

  public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    this.a = 0;
    this.q = false;
    this.m = paramInt5;
    this.l = AnimationUtils.currentAnimationTimeMillis();
    this.b = paramInt1;
    this.c = paramInt2;
    this.d = (paramInt1 + paramInt3);
    this.e = (paramInt2 + paramInt4);
    this.o = paramInt3;
    this.p = paramInt4;
    this.n = (1.0F / this.m);
  }

  public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
  {
    int i2 = paramInt3;
    int i1 = paramInt4;
    float f1;
    if (this.s)
    {
      i2 = paramInt3;
      i1 = paramInt4;
      if (!this.q)
      {
        f1 = c();
        float f4 = this.d - this.b;
        f2 = this.e - this.c;
        float f3 = (float)Math.sqrt(f4 * f4 + f2 * f2);
        f4 /= f3;
        f2 /= f3;
        f3 = f4 * f1;
        f1 *= f2;
        i2 = paramInt3;
        i1 = paramInt4;
        if (Math.signum(paramInt3) == Math.signum(f3))
        {
          i2 = paramInt3;
          i1 = paramInt4;
          if (Math.signum(paramInt4) == Math.signum(f1))
          {
            i2 = (int)(f3 + paramInt3);
            i1 = (int)(f1 + paramInt4);
          }
        }
      }
    }
    this.a = 1;
    this.q = false;
    float f2 = (float)Math.sqrt(i2 * i2 + i1 * i1);
    this.t = f2;
    double d1 = Math.log(v * f2 / 800.0F);
    this.m = (int)(1000.0D * Math.exp(d1 / (u - 1.0D)));
    this.l = AnimationUtils.currentAnimationTimeMillis();
    this.b = paramInt1;
    this.c = paramInt2;
    if (f2 == 0.0F)
    {
      f1 = 1.0F;
      if (f2 != 0.0F)
        break label418;
      f2 = 1.0F;
    }
    while (true)
    {
      paramInt3 = (int)(800.0F * Math.exp(d1 * (u / (u - 1.0D))));
      this.f = paramInt5;
      this.g = paramInt6;
      this.h = paramInt7;
      this.i = paramInt8;
      this.d = (Math.round(f1 * paramInt3) + paramInt1);
      this.d = Math.min(this.d, this.g);
      this.d = Math.max(this.d, this.f);
      this.e = (Math.round(f2 * paramInt3) + paramInt2);
      this.e = Math.min(this.e, this.i);
      this.e = Math.max(this.e, this.h);
      return;
      f1 = i2 / f2;
      break;
      label418: f2 = i1 / f2;
    }
  }

  public final void a(boolean paramBoolean)
  {
    this.q = paramBoolean;
  }

  public final boolean a()
  {
    return this.q;
  }

  public final int b()
  {
    return this.k;
  }

  public float c()
  {
    return this.t - this.y * g() / 2000.0F;
  }

  public final int d()
  {
    return this.c;
  }

  public final int e()
  {
    return this.e;
  }

  public boolean f()
  {
    if (this.q)
      return false;
    int i1 = (int)(AnimationUtils.currentAnimationTimeMillis() - this.l);
    if (i1 < this.m)
      switch (this.a)
      {
      default:
      case 0:
      case 1:
      }
    while (true)
    {
      return true;
      float f1 = i1 * this.n;
      if (this.r == null)
        f1 = a(f1);
      while (true)
      {
        this.j = (this.b + Math.round(this.o * f1));
        i1 = this.c;
        this.k = (Math.round(f1 * this.p) + i1);
        break;
        f1 = this.r.getInterpolation(f1);
      }
      f1 = i1 / this.m;
      i1 = (int)(100.0F * f1);
      float f2 = i1 / 100.0F;
      float f3 = (i1 + 1) / 100.0F;
      float f4 = x[i1];
      float f5 = x[(i1 + 1)];
      f1 = (f1 - f2) / (f3 - f2) * (f5 - f4) + f4;
      this.j = (this.b + Math.round((this.d - this.b) * f1));
      this.j = Math.min(this.j, this.g);
      this.j = Math.max(this.j, this.f);
      i1 = this.c;
      this.k = (Math.round(f1 * (this.e - this.c)) + i1);
      this.k = Math.min(this.k, this.i);
      this.k = Math.max(this.k, this.h);
      if ((this.j != this.d) || (this.k != this.e))
        continue;
      this.q = true;
      continue;
      this.j = this.d;
      this.k = this.e;
      this.q = true;
    }
  }

  public int g()
  {
    return (int)(AnimationUtils.currentAnimationTimeMillis() - this.l);
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.Components.ay
 * JD-Core Version:    0.6.0
 */