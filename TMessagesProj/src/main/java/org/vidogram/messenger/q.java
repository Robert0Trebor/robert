package org.vidogram.messenger;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Matrix.ScaleToFit;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.vidogram.tgnet.f;
import org.vidogram.tgnet.g.hs;
import org.vidogram.tgnet.g.ig;
import org.vidogram.tgnet.g.iy;
import org.vidogram.tgnet.g.iz;
import org.vidogram.tgnet.g.q;
import org.vidogram.tgnet.g.x;
import org.vidogram.ui.Components.AnimatedFileDrawable;

public class q
  implements y.b
{
  private static Paint J;
  private static PorterDuffColorFilter f = new PorterDuffColorFilter(-2236963, PorterDuff.Mode.MULTIPLY);
  private int A;
  private int B;
  private Rect C = new Rect();
  private boolean D = true;
  private boolean E;
  private boolean F;
  private int G;
  private BitmapShader H;
  private BitmapShader I;
  private RectF K = new RectF();
  private RectF L = new RectF();
  private Matrix M = new Matrix();
  private float N = 1.0F;
  private boolean O;
  private int P;
  private boolean Q;
  private a R;
  private float S;
  private long T;
  private byte U = 1;
  private boolean V;
  private ColorFilter W;
  private View a;
  private Integer b;
  private Integer c;
  private u d;
  private boolean e;
  private b g;
  private f h;
  private String i;
  private String j;
  private String k;
  private String l;
  private String m;
  private String n;
  private g.x o;
  private int p;
  private boolean q;
  private Drawable r;
  private Drawable s;
  private Drawable t;
  private boolean u = true;
  private boolean v;
  private boolean w;
  private boolean x;
  private int y;
  private int z;

  public q()
  {
    this(null);
  }

  public q(View paramView)
  {
    this.a = paramView;
    if (J == null)
      J = new Paint(1);
  }

  private void a(Canvas paramCanvas, Drawable paramDrawable, int paramInt, BitmapShader paramBitmapShader)
  {
    BitmapDrawable localBitmapDrawable;
    int i1;
    label36: label61: label84: int i3;
    label133: float f1;
    float f2;
    if ((paramDrawable instanceof BitmapDrawable))
    {
      localBitmapDrawable = (BitmapDrawable)paramDrawable;
      label418: if (paramBitmapShader != null)
      {
        paramDrawable = J;
        if ((paramDrawable == null) || (paramDrawable.getColorFilter() == null))
          break label465;
        i1 = 1;
        if ((i1 == 0) || (this.O))
          break label480;
        if (paramBitmapShader == null)
          break label471;
        J.setColorFilter(null);
        if (this.W != null)
        {
          if (paramBitmapShader == null)
            break label521;
          J.setColorFilter(this.W);
        }
        if (!(localBitmapDrawable instanceof AnimatedFileDrawable))
          break label550;
        if ((this.P % 360 != 90) && (this.P % 360 != 270))
          break label533;
        i3 = localBitmapDrawable.getIntrinsicHeight();
        i1 = localBitmapDrawable.getIntrinsicWidth();
        f1 = i3 / this.A;
        f2 = i1 / this.B;
        if (paramBitmapShader == null)
          break label757;
        J.setShader(paramBitmapShader);
        float f3 = Math.min(f1, f2);
        this.K.set(this.y, this.z, this.y + this.A, this.z + this.B);
        this.M.reset();
        if (Math.abs(f1 - f2) <= 1.0E-005F)
          break label684;
        if (i3 / f2 <= this.A)
          break label623;
        this.C.set(this.y - ((int)(i3 / f2) - this.A) / 2, this.z, this.y + ((int)(i3 / f2) + this.A) / 2, this.z + this.B);
        label309: if (this.D)
        {
          if (Math.abs(f1 - f2) <= 1.0E-005F)
            break label720;
          int i5 = (int)Math.floor(this.A * f3);
          int i7 = (int)Math.floor(this.B * f3);
          this.L.set((i3 - i5) / 2, (i1 - i7) / 2, (i3 + i5) / 2, (i1 + i7) / 2);
          this.M.setRectToRect(this.L, this.K, Matrix.ScaleToFit.START);
          paramBitmapShader.setLocalMatrix(this.M);
          J.setAlpha(paramInt);
          paramCanvas.drawRoundRect(this.K, this.G, this.G, J);
        }
      }
    }
    label465: label471: label480: label623: label757: 
    do
    {
      return;
      paramDrawable = localBitmapDrawable.getPaint();
      break;
      i1 = 0;
      break label36;
      localBitmapDrawable.setColorFilter(null);
      break label61;
      if ((i1 != 0) || (!this.O))
        break label61;
      if (paramBitmapShader != null)
      {
        J.setColorFilter(f);
        break label61;
      }
      localBitmapDrawable.setColorFilter(f);
      break label61;
      localBitmapDrawable.setColorFilter(this.W);
      break label84;
      i3 = localBitmapDrawable.getIntrinsicWidth();
      i1 = localBitmapDrawable.getIntrinsicHeight();
      break label133;
      if ((this.P % 360 == 90) || (this.P % 360 == 270))
      {
        i3 = localBitmapDrawable.getBitmap().getHeight();
        i1 = localBitmapDrawable.getBitmap().getWidth();
        break label133;
      }
      i3 = localBitmapDrawable.getBitmap().getWidth();
      i1 = localBitmapDrawable.getBitmap().getHeight();
      break label133;
      this.C.set(this.y, this.z - ((int)(i1 / f1) - this.B) / 2, this.y + this.A, this.z + ((int)(i1 / f1) + this.B) / 2);
      break label309;
      this.C.set(this.y, this.z, this.y + this.A, this.z + this.B);
      break label309;
      this.L.set(0.0F, 0.0F, i3, i1);
      this.M.setRectToRect(this.L, this.K, Matrix.ScaleToFit.FILL);
      break label418;
      int i11;
      int i2;
      int i4;
      int i6;
      int i8;
      int i9;
      int i10;
      if (this.E)
      {
        f1 = Math.max(f1, f2);
        paramCanvas.save();
        i11 = (int)(i3 / f1);
        i2 = (int)(i1 / f1);
        paramDrawable = this.C;
        i4 = this.y;
        i6 = (this.A - i11) / 2;
        i8 = this.z;
        i9 = (this.B - i2) / 2;
        i10 = this.y;
        i11 = (i11 + this.A) / 2;
        int i12 = this.z;
        paramDrawable.set(i4 + i6, i8 + i9, i11 + i10, (i2 + this.B) / 2 + i12);
        localBitmapDrawable.setBounds(this.C);
        try
        {
          localBitmapDrawable.setAlpha(paramInt);
          localBitmapDrawable.draw(paramCanvas);
          paramCanvas.restore();
          return;
        }
        catch (java.lang.Exception paramDrawable)
        {
          if (localBitmapDrawable != this.r)
            break label997;
        }
        if (this.i != null)
        {
          p.a().d(this.i);
          this.i = null;
        }
        while (true)
        {
          a(this.h, this.k, this.l, this.s, this.o, this.m, this.p, this.n, this.q);
          n.a("tmessages", paramDrawable);
          break;
          if ((localBitmapDrawable != this.s) || (this.j == null))
            continue;
          p.a().d(this.j);
          this.j = null;
        }
      }
      if (Math.abs(f1 - f2) > 1.0E-005F)
      {
        paramCanvas.save();
        paramCanvas.clipRect(this.y, this.z, this.y + this.A, this.z + this.B);
        if (this.P % 360 != 0)
        {
          if (!this.Q)
            break label1364;
          paramCanvas.rotate(this.P, this.A / 2, this.B / 2);
        }
        while (true)
        {
          if (i4 / f2 > this.A)
          {
            i2 = (int)(i4 / f2);
            paramDrawable = this.C;
            i4 = this.y;
            i6 = (i2 - this.A) / 2;
            i8 = this.z;
            i9 = this.y;
            paramDrawable.set(i4 - i6, i8, (i2 + this.A) / 2 + i9, this.z + this.B);
            if ((this.P % 360 != 90) && (this.P % 360 != 270))
              break label1464;
            i2 = (this.C.right - this.C.left) / 2;
            i4 = (this.C.bottom - this.C.top) / 2;
            i6 = (this.C.right + this.C.left) / 2;
            i8 = (this.C.top + this.C.bottom) / 2;
            localBitmapDrawable.setBounds(i6 - i4, i8 - i2, i4 + i6, i2 + i8);
            if (!this.D);
          }
          try
          {
            localBitmapDrawable.setAlpha(paramInt);
            localBitmapDrawable.draw(paramCanvas);
            paramCanvas.restore();
            return;
            paramCanvas.rotate(this.P, 0.0F, 0.0F);
            continue;
            i2 = (int)(i2 / f1);
            paramDrawable = this.C;
            i4 = this.y;
            i6 = this.z;
            i8 = (i2 - this.B) / 2;
            i9 = this.y;
            i10 = this.A;
            i11 = this.z;
            paramDrawable.set(i4, i6 - i8, i9 + i10, (i2 + this.B) / 2 + i11);
            break label1212;
            localBitmapDrawable.setBounds(this.C);
          }
          catch (java.lang.Exception paramDrawable)
          {
            if (localBitmapDrawable != this.r)
              break label1558;
          }
        }
        if (this.i != null)
        {
          p.a().d(this.i);
          this.i = null;
        }
        while (true)
        {
          a(this.h, this.k, this.l, this.s, this.o, this.m, this.p, this.n, this.q);
          n.a("tmessages", paramDrawable);
          break;
          if ((localBitmapDrawable != this.s) || (this.j == null))
            continue;
          p.a().d(this.j);
          this.j = null;
        }
      }
      paramCanvas.save();
      if (this.P % 360 != 0)
      {
        if (!this.Q)
          break label1823;
        paramCanvas.rotate(this.P, this.A / 2, this.B / 2);
      }
      while (true)
      {
        this.C.set(this.y, this.z, this.y + this.A, this.z + this.B);
        if ((this.P % 360 == 90) || (this.P % 360 == 270))
        {
          i2 = (this.C.right - this.C.left) / 2;
          i4 = (this.C.bottom - this.C.top) / 2;
          i6 = (this.C.right + this.C.left) / 2;
          i8 = (this.C.top + this.C.bottom) / 2;
          localBitmapDrawable.setBounds(i6 - i4, i8 - i2, i4 + i6, i2 + i8);
          if (!this.D);
        }
        try
        {
          localBitmapDrawable.setAlpha(paramInt);
          localBitmapDrawable.draw(paramCanvas);
          paramCanvas.restore();
          return;
          paramCanvas.rotate(this.P, 0.0F, 0.0F);
          continue;
          localBitmapDrawable.setBounds(this.C);
        }
        catch (java.lang.Exception paramDrawable)
        {
          if (localBitmapDrawable != this.r)
            break label1931;
        }
      }
      if (this.i != null)
      {
        p.a().d(this.i);
        this.i = null;
      }
      while (true)
      {
        a(this.h, this.k, this.l, this.s, this.o, this.m, this.p, this.n, this.q);
        n.a("tmessages", paramDrawable);
        break;
        if ((localBitmapDrawable != this.s) || (this.j == null))
          continue;
        p.a().d(this.j);
        this.j = null;
      }
      this.C.set(this.y, this.z, this.y + this.A, this.z + this.B);
      paramDrawable.setBounds(this.C);
    }
    while (!this.D);
    label521: label1931: 
    try
    {
      label533: label550: label684: label720: label997: paramDrawable.setAlpha(paramInt);
      label1212: label1364: paramDrawable.draw(paramCanvas);
      label1464: return;
    }
    catch (java.lang.Exception paramCanvas)
    {
      label1558: label1823: n.a("tmessages", paramCanvas);
    }
  }

  private void a(String paramString, boolean paramBoolean)
  {
    String str;
    Drawable localDrawable;
    if (paramBoolean)
    {
      str = this.j;
      localDrawable = this.s;
      if ((str != null) && ((paramString == null) || (!paramString.equals(str))) && (localDrawable != null))
      {
        if (!(localDrawable instanceof AnimatedFileDrawable))
          break label85;
        ((AnimatedFileDrawable)localDrawable).a();
      }
    }
    while (true)
    {
      if (!paramBoolean)
        break label133;
      this.s = null;
      this.j = null;
      return;
      str = this.i;
      localDrawable = this.r;
      break;
      label85: if (!(localDrawable instanceof BitmapDrawable))
        continue;
      paramString = ((BitmapDrawable)localDrawable).getBitmap();
      boolean bool = p.a().c(str);
      if ((p.a().e(str)) || (!bool))
        continue;
      paramString.recycle();
    }
    label133: this.r = null;
    this.i = null;
  }

  private void i(boolean paramBoolean)
  {
    long l1 = 18L;
    long l2;
    if (this.S != 1.0F)
      if (!paramBoolean)
      {
        l2 = System.currentTimeMillis() - this.T;
        if (l2 <= 18L)
          break label130;
      }
    while (true)
    {
      float f1 = this.S;
      this.S = ((float)l1 / 150.0F + f1);
      if (this.S > 1.0F)
        this.S = 1.0F;
      this.T = System.currentTimeMillis();
      if (this.a != null)
      {
        if (this.x)
          this.a.invalidate();
      }
      else
        return;
      this.a.invalidate(this.y, this.z, this.y + this.A, this.z + this.B);
      return;
      label130: l1 = l2;
    }
  }

  public String A()
  {
    return this.k;
  }

  public boolean B()
  {
    return this.q;
  }

  public boolean C()
  {
    return this.F;
  }

  public int D()
  {
    return this.G;
  }

  public u E()
  {
    return this.d;
  }

  public boolean F()
  {
    return this.v;
  }

  public boolean G()
  {
    return this.w;
  }

  public boolean H()
  {
    return this.u;
  }

  public void I()
  {
    if ((this.r instanceof AnimatedFileDrawable))
      ((AnimatedFileDrawable)this.r).start();
  }

  public void J()
  {
    if ((this.r instanceof AnimatedFileDrawable))
      ((AnimatedFileDrawable)this.r).stop();
  }

  public AnimatedFileDrawable K()
  {
    if ((this.r instanceof AnimatedFileDrawable))
      return (AnimatedFileDrawable)this.r;
    return null;
  }

  public void a()
  {
    p.a().a(this, 0);
    this.e = true;
  }

  public void a(byte paramByte)
  {
    this.U = paramByte;
  }

  public void a(float paramFloat)
  {
    this.N = paramFloat;
  }

  public void a(int paramInt)
  {
    this.G = paramInt;
  }

  public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.y = paramInt1;
    this.z = paramInt2;
    this.A = paramInt3;
    this.B = paramInt4;
  }

  public void a(int paramInt, boolean paramBoolean)
  {
    int i1;
    while (true)
    {
      i1 = paramInt;
      if (paramInt >= 0)
        break;
      paramInt += 360;
    }
    while (i1 > 360)
      i1 -= 360;
    this.P = i1;
    this.Q = paramBoolean;
  }

  public void a(int paramInt, Object[] paramArrayOfObject)
  {
    String str;
    if (paramInt == y.an)
    {
      str = (String)paramArrayOfObject[1];
      if ((this.j != null) && (this.j.equals(str)))
      {
        if (this.s == null)
          p.a().b(this.j);
        this.s = ((BitmapDrawable)paramArrayOfObject[0]);
        if ((this.G == 0) || (this.r != null) || (!(this.s instanceof BitmapDrawable)) || ((this.s instanceof AnimatedFileDrawable)))
          break label157;
        this.I = new BitmapShader(((BitmapDrawable)this.s).getBitmap(), Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
        if ((this.t instanceof BitmapDrawable))
          this.t = null;
        if (this.a != null)
        {
          if (!this.x)
            break label165;
          this.a.invalidate();
        }
      }
    }
    label157: label165: 
    do
    {
      do
      {
        do
        {
          return;
          this.I = null;
          break;
          this.a.invalidate(this.y, this.z, this.y + this.A, this.z + this.B);
          return;
        }
        while (paramInt != y.R);
        str = (String)paramArrayOfObject[0];
        if ((this.i != null) && (this.i.equals(str)))
        {
          this.i = ((String)paramArrayOfObject[1]);
          this.h = ((g.x)paramArrayOfObject[2]);
        }
        if ((this.j == null) || (!this.j.equals(str)))
          continue;
        this.j = ((String)paramArrayOfObject[1]);
        this.o = ((g.x)paramArrayOfObject[2]);
      }
      while (this.g == null);
      if ((this.i == null) || (!this.i.equals(str)))
        continue;
      this.i = ((String)paramArrayOfObject[1]);
      this.h = ((g.x)paramArrayOfObject[2]);
    }
    while ((this.j == null) || (!this.j.equals(str)));
    this.j = ((String)paramArrayOfObject[1]);
    this.o = ((g.x)paramArrayOfObject[2]);
  }

  public void a(Bitmap paramBitmap)
  {
    if (paramBitmap != null);
    for (paramBitmap = new BitmapDrawable(null, paramBitmap); ; paramBitmap = null)
    {
      a(paramBitmap);
      return;
    }
  }

  public void a(ColorFilter paramColorFilter)
  {
    this.W = paramColorFilter;
  }

  public void a(Drawable paramDrawable)
  {
    boolean bool = false;
    p.a().a(this, 0);
    a(null, false);
    a(null, true);
    this.t = paramDrawable;
    this.o = null;
    this.i = null;
    this.n = null;
    this.j = null;
    this.r = null;
    this.m = null;
    this.h = null;
    this.k = null;
    this.l = null;
    this.p = 0;
    this.q = false;
    this.H = null;
    this.I = null;
    if (this.g != null)
    {
      this.g.a = null;
      this.g.b = null;
      this.g.e = null;
      this.g.d = null;
    }
    this.S = 1.0F;
    if (this.R != null)
    {
      paramDrawable = this.R;
      if ((this.s != null) || (this.t != null))
        bool = true;
      paramDrawable.a(this, bool, true);
    }
    if (this.a != null)
    {
      if (this.x)
        this.a.invalidate();
    }
    else
      return;
    this.a.invalidate(this.y, this.z, this.y + this.A, this.z + this.B);
  }

  public void a(View paramView)
  {
    this.a = paramView;
    if ((this.r instanceof AnimatedFileDrawable))
      ((AnimatedFileDrawable)this.r).a(this.a);
  }

  protected void a(Integer paramInteger, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.c = paramInteger;
      return;
    }
    this.b = paramInteger;
  }

  public void a(String paramString1, String paramString2, Drawable paramDrawable, String paramString3, int paramInt)
  {
    a(null, paramString1, paramString2, paramDrawable, null, null, paramInt, paramString3, true);
  }

  public void a(a parama)
  {
    this.R = parama;
  }

  public void a(u paramu)
  {
    this.d = paramu;
  }

  public void a(f paramf, String paramString1, Drawable paramDrawable, int paramInt, String paramString2, boolean paramBoolean)
  {
    a(paramf, null, paramString1, paramDrawable, null, null, paramInt, paramString2, paramBoolean);
  }

  public void a(f paramf, String paramString1, Drawable paramDrawable, String paramString2, boolean paramBoolean)
  {
    a(paramf, null, paramString1, paramDrawable, null, null, 0, paramString2, paramBoolean);
  }

  public void a(f paramf, String paramString1, String paramString2, Drawable paramDrawable, g.x paramx, String paramString3, int paramInt, String paramString4, boolean paramBoolean)
  {
    if (this.g != null)
    {
      this.g.a = null;
      this.g.b = null;
      this.g.e = null;
      this.g.d = null;
    }
    label238: boolean bool1;
    if (((paramf == null) && (paramString1 == null) && (paramx == null)) || ((paramf != null) && (!(paramf instanceof g.iz)) && (!(paramf instanceof g.iy)) && (!(paramf instanceof g.hs)) && (!(paramf instanceof g.ig))))
    {
      a(null, false);
      a(null, true);
      this.i = null;
      this.n = paramString4;
      this.j = null;
      this.m = null;
      this.h = null;
      this.k = null;
      this.l = null;
      this.q = false;
      this.t = paramDrawable;
      this.S = 1.0F;
      this.o = null;
      this.p = 0;
      this.r = null;
      this.H = null;
      this.I = null;
      p.a().a(this, 0);
      if (this.a != null)
      {
        if (this.x)
          this.a.invalidate();
      }
      else if (this.R != null)
      {
        paramf = this.R;
        if ((this.r == null) && (this.s == null) && (this.t == null))
          break label296;
        paramBoolean = true;
        if (this.r != null)
          break label302;
      }
      label296: label302: for (bool1 = true; ; bool1 = false)
      {
        paramf.a(this, paramBoolean, bool1);
        return;
        this.a.invalidate(this.y, this.z, this.y + this.A, this.z + this.B);
        break;
        paramBoolean = false;
        break label238;
      }
    }
    g.x localx = paramx;
    if (!(paramx instanceof g.iz))
      localx = null;
    f localf;
    if (paramf != null)
      if ((paramf instanceof g.x))
      {
        paramx = (g.x)paramf;
        paramx = paramx.c + "_" + paramx.d;
        localf = paramf;
      }
    while (true)
    {
      label377: Object localObject = paramx;
      if (paramx != null)
      {
        localObject = paramx;
        if (paramString2 != null)
          localObject = paramx + "@" + paramString2;
      }
      label481: boolean bool2;
      if ((this.i != null) && (localObject != null) && (this.i.equals(localObject)))
      {
        if (this.R != null)
        {
          paramf = this.R;
          if ((this.r != null) || (this.s != null) || (this.t != null))
          {
            bool1 = true;
            if (this.r != null)
              break label916;
            bool2 = true;
            label491: paramf.a(this, bool1, bool2);
          }
        }
        else
        {
          if ((!this.e) && (!this.F))
            break;
        }
      }
      else
      {
        paramf = null;
        if (localx != null)
        {
          paramx = localx.c + "_" + localx.d;
          paramf = paramx;
          if (paramString3 != null)
            paramf = paramx + "@" + paramString3;
        }
        a((String)localObject, false);
        a(paramf, true);
        this.j = paramf;
        this.i = ((String)localObject);
        this.n = paramString4;
        this.h = localf;
        this.k = paramString1;
        this.l = paramString2;
        this.m = paramString3;
        this.p = paramInt;
        this.q = paramBoolean;
        this.o = localx;
        this.t = paramDrawable;
        this.H = null;
        this.I = null;
        this.S = 1.0F;
        if (this.R != null)
        {
          paramf = this.R;
          if ((this.r == null) && (this.s == null) && (this.t == null))
            break label922;
          paramBoolean = true;
          label719: if (this.r != null)
            break label928;
        }
      }
      label916: label922: label928: for (bool1 = true; ; bool1 = false)
      {
        paramf.a(this, paramBoolean, bool1);
        p.a().a(this);
        if (this.a == null)
          break;
        if (!this.x)
          break label934;
        this.a.invalidate();
        return;
        paramx = (g.q)paramf;
        if (paramx.k != 0)
        {
          if (paramx.j == 0)
          {
            paramx = paramx.k + "_" + paramx.b;
            localf = paramf;
            break label377;
          }
          paramx = paramx.k + "_" + paramx.b + "_" + paramx.j;
          localf = paramf;
          break label377;
        }
        localf = null;
        paramx = null;
        break label377;
        if (paramString1 == null)
          break label968;
        paramx = Utilities.e(paramString1);
        localf = paramf;
        break label377;
        bool1 = false;
        break label481;
        bool2 = false;
        break label491;
        paramBoolean = false;
        break label719;
      }
      label934: this.a.invalidate(this.y, this.z, this.y + this.A, this.z + this.B);
      return;
      label968: paramx = null;
      localf = paramf;
    }
  }

  public void a(f paramf, String paramString1, g.x paramx, String paramString2, int paramInt, String paramString3, boolean paramBoolean)
  {
    a(paramf, null, paramString1, null, paramx, paramString2, paramInt, paramString3, paramBoolean);
  }

  public void a(f paramf, String paramString1, g.x paramx, String paramString2, String paramString3, boolean paramBoolean)
  {
    a(paramf, null, paramString1, null, paramx, paramString2, 0, paramString3, paramBoolean);
  }

  public void a(boolean paramBoolean)
  {
    this.O = paramBoolean;
  }

  public void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (this.D == paramBoolean1);
    do
    {
      return;
      this.D = paramBoolean1;
    }
    while ((!paramBoolean2) || (this.a == null));
    if (this.x)
    {
      this.a.invalidate();
      return;
    }
    this.a.invalidate(this.y, this.z, this.y + this.A, this.z + this.B);
  }

  public boolean a(float paramFloat1, float paramFloat2)
  {
    return (paramFloat1 >= this.y) && (paramFloat1 <= this.y + this.A) && (paramFloat2 >= this.z) && (paramFloat2 <= this.z + this.B);
  }

  public boolean a(Canvas paramCanvas)
  {
    while (true)
    {
      int i2;
      try
      {
        if ((!(this.r instanceof AnimatedFileDrawable)) || (((AnimatedFileDrawable)this.r).c()))
          break label413;
        bool = true;
        if ((this.F) || (this.r == null) || (bool))
          continue;
        localDrawable = this.r;
        i1 = 0;
        if (localDrawable == null)
          break label362;
        if (this.U == 0)
          break label320;
        if ((!this.V) || (!bool))
          continue;
        a(paramCanvas, localDrawable, (int)(this.N * 255.0F), this.I);
        if ((!bool) || (!this.V))
          break label419;
        bool = true;
        i(bool);
        return true;
        if (!(this.t instanceof BitmapDrawable))
          continue;
        localDrawable = this.t;
        i1 = 1;
        continue;
        if (this.s == null)
          break label405;
        localDrawable = this.s;
        i1 = 1;
        continue;
        if ((!this.V) || (this.S == 1.0F))
          continue;
        if (localDrawable != this.r)
          break label286;
        if (this.t != null)
        {
          localObject = this.t;
          if (localObject == null)
            continue;
          a(paramCanvas, (Drawable)localObject, (int)(this.N * 255.0F), this.I);
          i2 = (int)(this.N * this.S * 255.0F);
          if (i1 == 0)
            break label311;
          localObject = this.I;
          a(paramCanvas, localDrawable, i2, (BitmapShader)localObject);
          continue;
        }
      }
      catch (java.lang.Exception paramCanvas)
      {
        n.a("tmessages", paramCanvas);
        return false;
      }
      if (this.s != null)
      {
        localObject = this.s;
        continue;
        if ((localDrawable == this.s) && (this.t != null))
        {
          localObject = this.t;
          continue;
          localObject = this.H;
          continue;
          i2 = (int)(this.N * 255.0F);
          if (i1 != 0);
          for (localObject = this.I; ; localObject = this.H)
          {
            a(paramCanvas, localDrawable, i2, (BitmapShader)localObject);
            break;
          }
          if (this.t != null)
          {
            a(paramCanvas, this.t, 255, null);
            i(bool);
            return true;
          }
          i(bool);
          continue;
        }
      }
      label286: label311: label320: label362: Object localObject = null;
      continue;
      label405: int i1 = 0;
      Drawable localDrawable = null;
      continue;
      label413: boolean bool = false;
      continue;
      label419: bool = false;
    }
  }

  protected boolean a(BitmapDrawable paramBitmapDrawable, String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    boolean bool = false;
    if ((paramBitmapDrawable == null) || (paramString == null));
    while (true)
    {
      return false;
      if (!paramBoolean1)
      {
        if ((this.i == null) || (!paramString.equals(this.i)))
          continue;
        if (!(paramBitmapDrawable instanceof AnimatedFileDrawable))
          p.a().b(this.i);
        this.r = paramBitmapDrawable;
        if ((this.G != 0) && ((paramBitmapDrawable instanceof BitmapDrawable)))
          if ((paramBitmapDrawable instanceof AnimatedFileDrawable))
          {
            ((AnimatedFileDrawable)paramBitmapDrawable).a(this.G);
            label89: if ((paramBoolean2) || (this.F))
              break label307;
            if (((this.s == null) && (this.t == null)) || (this.S == 1.0F))
            {
              this.S = 0.0F;
              this.T = System.currentTimeMillis();
              if ((this.s == null) && (this.t == null))
                break label302;
              paramBoolean1 = true;
              label152: this.V = paramBoolean1;
            }
            label157: if ((paramBitmapDrawable instanceof AnimatedFileDrawable))
            {
              paramBitmapDrawable = (AnimatedFileDrawable)paramBitmapDrawable;
              paramBitmapDrawable.a(this.a);
              if (this.u)
                paramBitmapDrawable.start();
            }
            if (this.a != null)
            {
              if (!this.x)
                break label315;
              this.a.invalidate();
            }
            label209: if (this.R == null)
              break;
            paramBitmapDrawable = this.R;
            if ((this.r == null) && (this.s == null) && (this.t == null))
              break label628;
          }
      }
    }
    label302: label307: label315: label467: label628: for (paramBoolean1 = true; ; paramBoolean1 = false)
    {
      paramBoolean2 = bool;
      if (this.r == null)
        paramBoolean2 = true;
      paramBitmapDrawable.a(this, paramBoolean1, paramBoolean2);
      return true;
      this.H = new BitmapShader(paramBitmapDrawable.getBitmap(), Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
      break label89;
      this.H = null;
      break label89;
      paramBoolean1 = false;
      break label152;
      this.S = 1.0F;
      break label157;
      this.a.invalidate(this.y, this.z, this.y + this.A, this.z + this.B);
      break label209;
      if ((this.s != null) || ((this.r != null) && ((!(this.r instanceof AnimatedFileDrawable)) || (((AnimatedFileDrawable)this.r).c())) && (!this.F)))
        break label209;
      if ((this.j == null) || (!paramString.equals(this.j)))
        break;
      p.a().b(this.j);
      this.s = paramBitmapDrawable;
      if ((this.G != 0) && (this.r == null) && ((paramBitmapDrawable instanceof BitmapDrawable)))
        if ((paramBitmapDrawable instanceof AnimatedFileDrawable))
        {
          ((AnimatedFileDrawable)paramBitmapDrawable).a(this.G);
          if ((paramBoolean2) || (this.U == 2))
            break label584;
          this.S = 0.0F;
          this.T = System.currentTimeMillis();
          if ((this.t == null) || (this.i != null))
            break label579;
          paramBoolean1 = true;
          label508: this.V = paramBoolean1;
        }
      while (true)
      {
        if (((this.t instanceof BitmapDrawable)) || (this.a == null))
          break label590;
        if (!this.x)
          break label592;
        this.a.invalidate();
        break;
        this.I = new BitmapShader(paramBitmapDrawable.getBitmap(), Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
        break label467;
        this.I = null;
        break label467;
        paramBoolean1 = false;
        break label508;
        this.S = 1.0F;
      }
      break label209;
      this.a.invalidate(this.y, this.z, this.y + this.A, this.z + this.B);
      break label209;
    }
  }

  public void b(boolean paramBoolean)
  {
    this.x = paramBoolean;
  }

  public boolean b()
  {
    return this.O;
  }

  public int c()
  {
    if ((this.r instanceof AnimatedFileDrawable))
      return ((AnimatedFileDrawable)this.r).d();
    if ((this.t instanceof AnimatedFileDrawable))
      return ((AnimatedFileDrawable)this.t).d();
    return 0;
  }

  public void c(boolean paramBoolean)
  {
    this.E = paramBoolean;
  }

  public int d()
  {
    return this.P;
  }

  public void d(boolean paramBoolean)
  {
    this.F = paramBoolean;
  }

  public void e()
  {
    a(null, false);
    a(null, true);
    if (this.v)
    {
      y.a().b(this, y.an);
      p.a().a(this, 0);
    }
  }

  public void e(boolean paramBoolean)
  {
    this.v = paramBoolean;
    if (this.v)
    {
      y.a().a(this, y.an);
      return;
    }
    y.a().b(this, y.an);
  }

  public void f()
  {
    if ((this.h != null) || (this.k != null) || (this.o != null) || (this.t != null))
    {
      if (this.g == null)
        this.g = new b(null);
      this.g.a = this.h;
      this.g.b = this.k;
      this.g.c = this.l;
      this.g.d = this.t;
      this.g.e = this.o;
      this.g.f = this.m;
      this.g.g = this.p;
      this.g.i = this.n;
      this.g.h = this.q;
    }
    y.a().b(this, y.R);
    e();
  }

  public void f(boolean paramBoolean)
  {
    this.w = paramBoolean;
  }

  public void g(boolean paramBoolean)
  {
    this.u = paramBoolean;
  }

  public boolean g()
  {
    y.a().a(this, y.R);
    if ((this.g != null) && ((this.g.a != null) || (this.g.b != null) || (this.g.e != null) || (this.g.d != null)))
    {
      a(this.g.a, this.g.b, this.g.c, this.g.d, this.g.e, this.g.f, this.g.g, this.g.i, this.g.h);
      return true;
    }
    return false;
  }

  public Bitmap h()
  {
    if ((this.r instanceof AnimatedFileDrawable))
      return ((AnimatedFileDrawable)this.r).b();
    if ((this.t instanceof AnimatedFileDrawable))
      return ((AnimatedFileDrawable)this.t).b();
    if ((this.r instanceof BitmapDrawable))
      return ((BitmapDrawable)this.r).getBitmap();
    if ((this.s instanceof BitmapDrawable))
      return ((BitmapDrawable)this.s).getBitmap();
    if ((this.t instanceof BitmapDrawable))
      return ((BitmapDrawable)this.t).getBitmap();
    return null;
  }

  protected Integer h(boolean paramBoolean)
  {
    if (paramBoolean)
      return this.c;
    return this.b;
  }

  public int i()
  {
    if ((this.r instanceof AnimatedFileDrawable))
    {
      if ((this.P % 360 == 0) || (this.P % 360 == 180))
        return this.r.getIntrinsicWidth();
      return this.r.getIntrinsicHeight();
    }
    if ((this.t instanceof AnimatedFileDrawable))
    {
      if ((this.P % 360 == 0) || (this.P % 360 == 180))
        return this.t.getIntrinsicWidth();
      return this.t.getIntrinsicHeight();
    }
    Bitmap localBitmap = h();
    if ((this.P % 360 == 0) || (this.P % 360 == 180))
      return localBitmap.getWidth();
    return localBitmap.getHeight();
  }

  public int j()
  {
    if ((this.r instanceof AnimatedFileDrawable))
    {
      if ((this.P % 360 == 0) || (this.P % 360 == 180))
        return this.r.getIntrinsicHeight();
      return this.r.getIntrinsicWidth();
    }
    if ((this.t instanceof AnimatedFileDrawable))
    {
      if ((this.P % 360 == 0) || (this.P % 360 == 180))
        return this.t.getIntrinsicHeight();
      return this.t.getIntrinsicWidth();
    }
    Bitmap localBitmap = h();
    if ((this.P % 360 == 0) || (this.P % 360 == 180))
      return localBitmap.getHeight();
    return localBitmap.getWidth();
  }

  public boolean k()
  {
    return this.D;
  }

  public boolean l()
  {
    return (this.r != null) || (this.s != null) || (this.i != null) || (this.k != null) || (this.t != null);
  }

  public boolean m()
  {
    return (this.r != null) || (this.s != null) || (this.t != null);
  }

  public int n()
  {
    return this.y;
  }

  public int o()
  {
    return this.z;
  }

  public int p()
  {
    return this.A;
  }

  public int q()
  {
    return this.B;
  }

  public String r()
  {
    return this.n;
  }

  public Rect s()
  {
    return this.C;
  }

  public String t()
  {
    return this.l;
  }

  public String u()
  {
    return this.m;
  }

  public String v()
  {
    return this.i;
  }

  public String w()
  {
    return this.j;
  }

  public int x()
  {
    return this.p;
  }

  public f y()
  {
    return this.h;
  }

  public g.x z()
  {
    return this.o;
  }

  public static abstract interface a
  {
    public abstract void a(q paramq, boolean paramBoolean1, boolean paramBoolean2);
  }

  private class b
  {
    public f a;
    public String b;
    public String c;
    public Drawable d;
    public g.x e;
    public String f;
    public int g;
    public boolean h;
    public String i;

    private b()
    {
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.q
 * JD-Core Version:    0.6.0
 */