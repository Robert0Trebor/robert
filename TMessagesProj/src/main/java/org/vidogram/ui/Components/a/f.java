package org.vidogram.ui.Components.a;

import android.graphics.Bitmap;
import android.graphics.PointF;
import com.google.android.gms.vision.face.a;
import com.google.android.gms.vision.face.c;
import java.util.Iterator;
import java.util.List;
import org.vidogram.ui.Components.ap;
import org.vidogram.ui.Components.bf;

public class f
{
  private float a;
  private float b;
  private ap c;
  private ap d;
  private float e;
  private ap f;
  private ap g;

  public f(a parama, Bitmap paramBitmap, bf parambf, boolean paramBoolean)
  {
    Object localObject4 = parama.a();
    Object localObject1 = null;
    Object localObject3 = null;
    Object localObject2 = null;
    parama = null;
    Iterator localIterator = ((List)localObject4).iterator();
    if (localIterator.hasNext())
    {
      localObject4 = (c)localIterator.next();
      PointF localPointF = ((c)localObject4).a();
      switch (((c)localObject4).b())
      {
      case 6:
      case 7:
      case 8:
      case 9:
      default:
        localObject4 = localObject2;
        localObject2 = localObject3;
        localObject3 = localObject1;
        localObject1 = localObject4;
      case 4:
      case 10:
      case 5:
      case 11:
      }
      while (true)
      {
        localObject4 = localObject3;
        localObject3 = localObject2;
        localObject2 = localObject1;
        localObject1 = localObject4;
        break;
        localObject4 = a(localPointF, paramBitmap, parambf, paramBoolean);
        localObject1 = localObject2;
        localObject2 = localObject3;
        localObject3 = localObject4;
        continue;
        localObject4 = a(localPointF, paramBitmap, parambf, paramBoolean);
        localObject3 = localObject1;
        localObject1 = localObject2;
        localObject2 = localObject4;
        continue;
        localObject4 = a(localPointF, paramBitmap, parambf, paramBoolean);
        localObject2 = localObject3;
        localObject3 = localObject1;
        localObject1 = localObject4;
        continue;
        parama = a(localPointF, paramBitmap, parambf, paramBoolean);
        localObject4 = localObject1;
        localObject1 = localObject2;
        localObject2 = localObject3;
        localObject3 = localObject4;
      }
    }
    float f1;
    float f2;
    float f3;
    float f4;
    float f5;
    if ((localObject1 != null) && (localObject3 != null))
    {
      this.d = new ap(0.5F * localObject1.a + 0.5F * localObject3.a, 0.5F * localObject1.b + 0.5F * localObject3.b);
      this.e = (float)Math.hypot(localObject3.a - localObject1.a, localObject3.b - localObject1.b);
      this.b = (float)Math.toDegrees(Math.atan2(localObject3.b - localObject1.b, localObject3.a - localObject1.a) + 3.141592653589793D);
      this.a = (this.e * 2.35F);
      f1 = 0.8F * this.e;
      f2 = (float)Math.toRadians(this.b - 90.0F);
      f3 = this.d.a;
      f4 = (float)Math.cos(f2);
      f5 = this.d.b;
      this.c = new ap(f3 + f4 * f1, f1 * (float)Math.sin(f2) + f5);
    }
    if ((localObject2 != null) && (parama != null))
    {
      f1 = localObject2.a;
      f2 = parama.a;
      f3 = localObject2.b;
      this.f = new ap(0.5F * f1 + 0.5F * f2, parama.b * 0.5F + f3 * 0.5F);
      f1 = 0.7F * this.e;
      f2 = (float)Math.toRadians(this.b + 90.0F);
      f3 = this.f.a;
      f4 = (float)Math.cos(f2);
      f5 = this.f.b;
      this.g = new ap(f3 + f4 * f1, f1 * (float)Math.sin(f2) + f5);
    }
  }

  private ap a(PointF paramPointF, Bitmap paramBitmap, bf parambf, boolean paramBoolean)
  {
    float f1;
    float f2;
    if (paramBoolean)
    {
      f1 = paramBitmap.getHeight();
      if (!paramBoolean)
        break label66;
      f2 = paramBitmap.getWidth();
    }
    while (true)
    {
      return new ap(parambf.a * paramPointF.x / f1, parambf.b * paramPointF.y / f2);
      f1 = paramBitmap.getWidth();
      break;
      label66: f2 = paramBitmap.getHeight();
    }
  }

  public ap a(int paramInt)
  {
    switch (paramInt)
    {
    default:
      return null;
    case 0:
      return this.c;
    case 1:
      return this.d;
    case 2:
      return this.f;
    case 3:
    }
    return this.g;
  }

  public boolean a()
  {
    return this.d != null;
  }

  public float b()
  {
    return this.b;
  }

  public float b(int paramInt)
  {
    if (paramInt == 1)
      return this.e;
    return this.a;
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.Components.a.f
 * JD-Core Version:    0.6.0
 */