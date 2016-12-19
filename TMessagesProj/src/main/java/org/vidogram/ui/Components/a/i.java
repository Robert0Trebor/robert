package org.vidogram.ui.Components.a;

import android.graphics.PointF;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class i
{
  public float a;
  public float b;
  public float c;
  public float d;
  public float e;
  public double f;
  private int g;
  private int h;
  private ByteBuffer i;

  public int a()
  {
    return this.g;
  }

  public void a(int paramInt)
  {
    if ((this.i == null) || (paramInt < 0) || (paramInt >= this.h))
      return;
    this.i.position(paramInt * 5 * 4);
  }

  public boolean a(PointF paramPointF, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt)
  {
    if (((paramInt != -1) && (paramInt >= this.h)) || (this.i.position() == this.i.limit()))
    {
      d();
      return false;
    }
    if (paramInt != -1)
      this.i.position(paramInt * 5 * 4);
    this.i.putFloat(paramPointF.x);
    this.i.putFloat(paramPointF.y);
    this.i.putFloat(paramFloat1);
    this.i.putFloat(paramFloat2);
    this.i.putFloat(paramFloat3);
    return true;
  }

  public void b()
  {
    this.g = 0;
    if (this.i != null)
      return;
    this.h = 256;
    this.i = ByteBuffer.allocateDirect(this.h * 5 * 4);
    this.i.order(ByteOrder.nativeOrder());
    this.i.position(0);
  }

  public void b(int paramInt)
  {
    paramInt = this.g + paramInt;
    if ((paramInt > this.h) || (this.i == null))
      d();
    this.g = paramInt;
  }

  public float c()
  {
    return this.i.getFloat();
  }

  public void d()
  {
    if (this.i != null)
      this.i = null;
    this.h = Math.max(this.h * 2, 256);
    this.i = ByteBuffer.allocateDirect(this.h * 5 * 4);
    this.i.order(ByteOrder.nativeOrder());
    this.i.position(0);
  }

  public void e()
  {
    this.g = 0;
    this.f = 0.0D;
    if (this.i != null)
      this.i.position(0);
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.Components.a.i
 * JD-Core Version:    0.6.0
 */