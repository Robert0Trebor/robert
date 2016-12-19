package org.vidogram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewParent;
import org.vidogram.messenger.a;
import org.vidogram.messenger.u;
import org.vidogram.tgnet.g.ar;
import org.vidogram.tgnet.g.aw;

public class bb
{
  private static Paint a;
  private static Paint b;
  private int c = 0;
  private int d = 0;
  private float e;
  private boolean f = false;
  private boolean g = false;
  private int h;
  private int i;
  private ba.a j;
  private byte[] k;
  private u l;
  private View m;
  private boolean n;
  private int o;
  private int p;
  private int q;

  public bb(Context paramContext)
  {
    if (a == null)
    {
      a = new Paint();
      b = new Paint();
    }
  }

  public void a(float paramFloat)
  {
    this.c = (int)Math.ceil(this.h * paramFloat);
    if (this.c < 0)
      this.c = 0;
    do
      return;
    while (this.c <= this.h);
    this.c = this.h;
  }

  public void a(int paramInt1, int paramInt2)
  {
    this.h = paramInt1;
    this.i = paramInt2;
  }

  public void a(int paramInt1, int paramInt2, int paramInt3)
  {
    this.o = paramInt1;
    this.p = paramInt2;
    this.q = paramInt3;
  }

  public void a(Canvas paramCanvas)
  {
    if ((this.k == null) || (this.h == 0));
    float f1;
    do
    {
      return;
      f1 = this.h / a.a(3.0F);
    }
    while (f1 <= 0.1F);
    int i7 = this.k.length * 8 / 5;
    float f2 = i7 / f1;
    Paint localPaint = a;
    int i1;
    if ((this.l != null) && (!this.l.k()) && (this.l.n()) && (this.l.a.d.b == 0))
      i1 = this.p;
    int i8;
    int i4;
    while (true)
    {
      localPaint.setColor(i1);
      b.setColor(this.p);
      i8 = (this.i - a.a(14.0F)) / 2;
      i1 = 0;
      i4 = 0;
      i2 = 0;
      f1 = 0.0F;
      while (i4 < i7)
      {
        if (i4 == i2)
          break label196;
        i4 += 1;
      }
      break;
      if (this.n)
      {
        i1 = this.q;
        continue;
      }
      i1 = this.o;
    }
    label196: int i5 = 0;
    int i3 = i2;
    while (i2 == i3)
    {
      f1 += f2;
      i3 = (int)f1;
      i5 += 1;
    }
    int i2 = i4 * 5;
    int i6 = i2 / 8;
    i2 -= i6 * 8;
    int i10 = 8 - i2;
    int i9 = 5 - i10;
    i2 = (byte)(this.k[i6] >> i2 & (2 << Math.min(5, i10) - 1) - 1);
    if (i9 > 0)
      i2 = (byte)((byte)(i2 << i9) | this.k[(i6 + 1)] & (2 << i9 - 1) - 1);
    while (true)
    {
      i6 = 0;
      if (i6 < i5)
      {
        i9 = i1 * a.a(3.0F);
        if ((i9 < this.c) && (a.a(2.0F) + i9 < this.c))
          paramCanvas.drawRect(i9, a.a(14.0F - Math.max(1.0F, 14.0F * i2 / 31.0F)) + i8, a.a(2.0F) + i9, a.a(14.0F) + i8, b);
        while (true)
        {
          i1 += 1;
          i6 += 1;
          break;
          paramCanvas.drawRect(i9, a.a(14.0F - Math.max(1.0F, 14.0F * i2 / 31.0F)) + i8, a.a(2.0F) + i9, a.a(14.0F) + i8, a);
          if (i9 >= this.c)
            continue;
          paramCanvas.drawRect(i9, a.a(14.0F - Math.max(1.0F, 14.0F * i2 / 31.0F)) + i8, this.c, a.a(14.0F) + i8, b);
        }
      }
      i2 = i3;
      break;
    }
  }

  public void a(View paramView)
  {
    this.m = paramView;
  }

  public void a(u paramu)
  {
    this.l = paramu;
  }

  public void a(ba.a parama)
  {
    this.j = parama;
  }

  public void a(boolean paramBoolean)
  {
    this.n = paramBoolean;
  }

  public void a(byte[] paramArrayOfByte)
  {
    this.k = paramArrayOfByte;
  }

  public boolean a()
  {
    return this.f;
  }

  public boolean a(int paramInt, float paramFloat1, float paramFloat2)
  {
    if (paramInt == 0)
    {
      if ((0.0F <= paramFloat1) && (paramFloat1 <= this.h) && (paramFloat2 >= 0.0F) && (paramFloat2 <= this.i))
      {
        this.e = paramFloat1;
        this.g = true;
        this.d = (int)(paramFloat1 - this.c);
        this.f = false;
      }
    }
    else
      while (true)
      {
        return true;
        if ((paramInt == 1) || (paramInt == 3))
        {
          if (!this.g)
            break;
          if ((paramInt == 1) && (this.j != null))
            this.j.a(this.c / this.h);
          this.g = false;
          return true;
        }
        if ((paramInt != 2) || (!this.g))
          break;
        if (this.f)
        {
          this.c = (int)(paramFloat1 - this.d);
          if (this.c >= 0)
            break label236;
          this.c = 0;
        }
        while ((this.e != -1.0F) && (Math.abs(paramFloat1 - this.e) > a.a(0.2F, true)))
        {
          if ((this.m != null) && (this.m.getParent() != null))
            this.m.getParent().requestDisallowInterceptTouchEvent(true);
          this.f = true;
          this.e = -1.0F;
          return true;
          label236: if (this.c <= this.h)
            continue;
          this.c = this.h;
        }
      }
    return false;
  }

  public boolean b()
  {
    return this.g;
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.Components.bb
 * JD-Core Version:    0.6.0
 */