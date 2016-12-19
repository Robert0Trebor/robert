package org.vidogram.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import java.io.File;
import org.vidogram.messenger.n;
import org.vidogram.messenger.p;
import org.vidogram.messenger.r;
import org.vidogram.ui.a.a.a;
import org.vidogram.ui.a.g;

public class ak extends g
{
  private Bitmap i;
  private BitmapDrawable j;
  private b k = null;
  private a l;
  private boolean m = false;
  private boolean n = false;
  private String o;

  public ak(Bundle paramBundle)
  {
    super(paramBundle);
  }

  public View a(Context paramContext)
  {
    this.d.setBackgroundColor(-13421773);
    this.d.setItemsBackgroundColor(-12763843);
    this.d.setBackButtonImage(2130837794);
    this.d.setAllowOverlayTitle(true);
    this.d.setTitle(r.a("CropImage", 2131231094));
    this.d.setActionBarMenuOnItemClick(new a.a()
    {
      public void a(int paramInt)
      {
        if (paramInt == -1)
          ak.this.d();
        do
          return;
        while (paramInt != 1);
        if ((ak.c(ak.this) != null) && (!ak.d(ak.this)))
        {
          Bitmap localBitmap = ak.e(ak.this).a();
          if (localBitmap == ak.a(ak.this))
            ak.a(ak.this, true);
          ak.c(ak.this).a(localBitmap);
          ak.b(ak.this, true);
        }
        ak.this.d();
      }
    });
    this.d.a().b(1, 2130837825, org.vidogram.messenger.a.a(56.0F));
    paramContext = new a(paramContext);
    this.l = paramContext;
    this.b = paramContext;
    ((a)this.b).q = b().getBoolean("freeform", false);
    this.b.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
    return this.b;
  }

  public void a(b paramb)
  {
    this.k = paramb;
  }

  public boolean f()
  {
    this.g = false;
    if (this.i == null)
    {
      String str = b().getString("photoPath");
      Uri localUri = (Uri)b().getParcelable("photoUri");
      if ((str == null) && (localUri == null))
        return false;
      if ((str != null) && (!new File(str).exists()))
        return false;
      if (org.vidogram.messenger.a.c());
      int i2;
      for (int i1 = org.vidogram.messenger.a.a(520.0F); ; i2 = Math.max(org.vidogram.messenger.a.c.x, org.vidogram.messenger.a.c.y))
      {
        this.i = p.a(str, localUri, i1, i1, true);
        if (this.i != null)
          break;
        return false;
      }
    }
    this.j = new BitmapDrawable(this.i);
    super.f();
    return true;
  }

  public void g()
  {
    super.g();
    if ((this.o != null) && (p.a().c(this.o)) && (!p.a().e(this.o)))
      this.o = null;
    if ((this.o == null) && (this.i != null) && (!this.m))
    {
      this.i.recycle();
      this.i = null;
    }
    this.j = null;
  }

  private class a extends FrameLayout
  {
    Paint a = null;
    Paint b = null;
    Paint c = null;
    float d = 600.0F;
    float e = 600.0F;
    float f = -1.0F;
    float g = -1.0F;
    int h = 0;
    float i = 0.0F;
    float j = 0.0F;
    int k;
    int l;
    int m;
    int n;
    int o;
    int p;
    boolean q;

    public a(Context arg2)
    {
      super();
      b();
    }

    private void b()
    {
      this.a = new Paint();
      this.a.setColor(1073412858);
      this.a.setStrokeWidth(org.vidogram.messenger.a.a(2.0F));
      this.a.setStyle(Paint.Style.STROKE);
      this.b = new Paint();
      this.b.setColor(-1);
      this.c = new Paint();
      this.c.setColor(-939524096);
      setBackgroundColor(-13421773);
      setOnTouchListener(new View.OnTouchListener()
      {
        public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
        {
          float f4 = paramMotionEvent.getX();
          float f5 = paramMotionEvent.getY();
          int i = org.vidogram.messenger.a.a(14.0F);
          if (paramMotionEvent.getAction() == 0)
            if ((ak.a.this.f - i < f4) && (ak.a.this.f + i > f4) && (ak.a.this.g - i < f5) && (ak.a.this.g + i > f5))
            {
              ak.a.this.h = 1;
              if (ak.a.this.h != 0)
                ak.a.this.requestDisallowInterceptTouchEvent(true);
              ak.a.this.i = f4;
              ak.a.this.j = f5;
            }
          do
          {
            return true;
            if ((ak.a.this.f - i + ak.a.this.d < f4) && (ak.a.this.f + i + ak.a.this.d > f4) && (ak.a.this.g - i < f5) && (ak.a.this.g + i > f5))
            {
              ak.a.this.h = 2;
              break;
            }
            if ((ak.a.this.f - i < f4) && (ak.a.this.f + i > f4) && (ak.a.this.g - i + ak.a.this.e < f5) && (ak.a.this.g + i + ak.a.this.e > f5))
            {
              ak.a.this.h = 3;
              break;
            }
            if ((ak.a.this.f - i + ak.a.this.d < f4) && (ak.a.this.f + i + ak.a.this.d > f4) && (ak.a.this.g - i + ak.a.this.e < f5))
            {
              f1 = ak.a.this.g;
              if (i + f1 + ak.a.this.e > f5)
              {
                ak.a.this.h = 4;
                break;
              }
            }
            if ((ak.a.this.f < f4) && (ak.a.this.f + ak.a.this.d > f4) && (ak.a.this.g < f5) && (ak.a.this.g + ak.a.this.e > f5))
            {
              ak.a.this.h = 5;
              break;
            }
            ak.a.this.h = 0;
            break;
            if (paramMotionEvent.getAction() != 1)
              continue;
            ak.a.this.h = 0;
            return true;
          }
          while ((paramMotionEvent.getAction() != 2) || (ak.a.this.h == 0));
          float f2 = f4 - ak.a.this.i;
          float f1 = f5 - ak.a.this.j;
          if (ak.a.this.h == 5)
          {
            paramView = ak.a.this;
            paramView.f = (f2 + paramView.f);
            paramView = ak.a.this;
            paramView.g = (f1 + paramView.g);
            if (ak.a.this.f < ak.a.this.m)
            {
              ak.a.this.f = ak.a.this.m;
              if (ak.a.this.g >= ak.a.this.n)
                break label798;
              ak.a.this.g = ak.a.this.n;
            }
          }
          label798: label1914: 
          do
            while (true)
            {
              ak.a.this.i = f4;
              ak.a.this.j = f5;
              ak.a.this.invalidate();
              return true;
              if (ak.a.this.f + ak.a.this.d <= ak.a.this.m + ak.a.this.k)
                break;
              ak.a.this.f = (ak.a.this.m + ak.a.this.k - ak.a.this.d);
              break;
              if (ak.a.this.g + ak.a.this.e <= ak.a.this.n + ak.a.this.l)
                continue;
              ak.a.this.g = (ak.a.this.n + ak.a.this.l - ak.a.this.e);
              continue;
              if (ak.a.this.h == 1)
              {
                f3 = f2;
                if (ak.a.this.d - f2 < 160.0F)
                  f3 = ak.a.this.d - 160.0F;
                f2 = f3;
                if (ak.a.this.f + f3 < ak.a.this.m)
                  f2 = ak.a.this.m - ak.a.this.f;
                if (!ak.a.this.q)
                {
                  f1 = f2;
                  if (ak.a.this.g + f2 < ak.a.this.n)
                    f1 = ak.a.this.n - ak.a.this.g;
                  paramView = ak.a.this;
                  paramView.f += f1;
                  paramView = ak.a.this;
                  paramView.g += f1;
                  paramView = ak.a.this;
                  paramView.d -= f1;
                  paramView = ak.a.this;
                  paramView.e -= f1;
                  continue;
                }
                f3 = f1;
                if (ak.a.this.e - f1 < 160.0F)
                  f3 = ak.a.this.e - 160.0F;
                f1 = f3;
                if (ak.a.this.g + f3 < ak.a.this.n)
                  f1 = ak.a.this.n - ak.a.this.g;
                paramView = ak.a.this;
                paramView.f += f2;
                paramView = ak.a.this;
                paramView.g += f1;
                paramView = ak.a.this;
                paramView.d -= f2;
                paramView = ak.a.this;
                paramView.e -= f1;
                continue;
              }
              if (ak.a.this.h == 2)
              {
                f3 = f2;
                if (ak.a.this.d + f2 < 160.0F)
                  f3 = -(ak.a.this.d - 160.0F);
                f2 = f3;
                if (ak.a.this.f + ak.a.this.d + f3 > ak.a.this.m + ak.a.this.k)
                  f2 = ak.a.this.m + ak.a.this.k - ak.a.this.f - ak.a.this.d;
                if (!ak.a.this.q)
                {
                  f1 = f2;
                  if (ak.a.this.g - f2 < ak.a.this.n)
                    f1 = ak.a.this.g - ak.a.this.n;
                  paramView = ak.a.this;
                  paramView.g -= f1;
                  paramView = ak.a.this;
                  paramView.d += f1;
                  paramView = ak.a.this;
                  paramView.e = (f1 + paramView.e);
                  continue;
                }
                f3 = f1;
                if (ak.a.this.e - f1 < 160.0F)
                  f3 = ak.a.this.e - 160.0F;
                f1 = f3;
                if (ak.a.this.g + f3 < ak.a.this.n)
                  f1 = ak.a.this.n - ak.a.this.g;
                paramView = ak.a.this;
                paramView.g += f1;
                paramView = ak.a.this;
                paramView.d = (f2 + paramView.d);
                paramView = ak.a.this;
                paramView.e -= f1;
                continue;
              }
              if (ak.a.this.h != 3)
                break label1914;
              f3 = f2;
              if (ak.a.this.d - f2 < 160.0F)
                f3 = ak.a.this.d - 160.0F;
              f2 = f3;
              if (ak.a.this.f + f3 < ak.a.this.m)
                f2 = ak.a.this.m - ak.a.this.f;
              if (!ak.a.this.q)
              {
                f1 = f2;
                if (ak.a.this.g + ak.a.this.d - f2 > ak.a.this.n + ak.a.this.l)
                  f1 = ak.a.this.g + ak.a.this.d - ak.a.this.n - ak.a.this.l;
                paramView = ak.a.this;
                paramView.f += f1;
                paramView = ak.a.this;
                paramView.d -= f1;
                paramView = ak.a.this;
                paramView.e -= f1;
                continue;
              }
              f3 = f1;
              if (ak.a.this.g + ak.a.this.e + f1 > ak.a.this.n + ak.a.this.l)
                f3 = ak.a.this.n + ak.a.this.l - ak.a.this.g - ak.a.this.e;
              paramView = ak.a.this;
              paramView.f += f2;
              paramView = ak.a.this;
              paramView.d -= f2;
              paramView = ak.a.this;
              paramView.e = (f3 + paramView.e);
              if (ak.a.this.e >= 160.0F)
                continue;
              ak.a.this.e = 160.0F;
            }
          while (ak.a.this.h != 4);
          float f3 = f2;
          if (ak.a.this.f + ak.a.this.d + f2 > ak.a.this.m + ak.a.this.k)
            f3 = ak.a.this.m + ak.a.this.k - ak.a.this.f - ak.a.this.d;
          if (!ak.a.this.q)
          {
            f1 = f3;
            if (ak.a.this.g + ak.a.this.d + f3 > ak.a.this.n + ak.a.this.l)
              f1 = ak.a.this.n + ak.a.this.l - ak.a.this.g - ak.a.this.d;
            paramView = ak.a.this;
            paramView.d += f1;
            paramView = ak.a.this;
          }
          for (paramView.e = (f1 + paramView.e); ; paramView.e = (f2 + paramView.e))
          {
            if (ak.a.this.d < 160.0F)
              ak.a.this.d = 160.0F;
            if (ak.a.this.e >= 160.0F)
              break;
            ak.a.this.e = 160.0F;
            break;
            f2 = f1;
            if (ak.a.this.g + ak.a.this.e + f1 > ak.a.this.n + ak.a.this.l)
              f2 = ak.a.this.n + ak.a.this.l - ak.a.this.g - ak.a.this.e;
            paramView = ak.a.this;
            paramView.d = (f3 + paramView.d);
            paramView = ak.a.this;
          }
        }
      });
    }

    private void c()
    {
      if ((this.o == 0) || (this.p == 0) || (ak.a(ak.this) == null))
        return;
      float f1 = (this.f - this.m) / this.k;
      float f2 = (this.g - this.n) / this.l;
      float f3 = this.d / this.k;
      float f4 = this.e / this.l;
      float f5 = ak.a(ak.this).getWidth();
      float f6 = ak.a(ak.this).getHeight();
      float f7 = this.o / f5;
      float f8 = this.p / f6;
      if (f7 > f8)
      {
        this.l = this.p;
        this.k = (int)Math.ceil(f5 * f8);
        this.m = ((this.o - this.k) / 2 + org.vidogram.messenger.a.a(14.0F));
        this.n = ((this.p - this.l) / 2 + org.vidogram.messenger.a.a(14.0F));
        if ((this.f != -1.0F) || (this.g != -1.0F))
          break label408;
        if (!this.q)
          break label293;
        this.g = this.n;
        this.f = this.m;
        this.d = this.k;
        this.e = this.l;
      }
      while (true)
      {
        invalidate();
        return;
        this.k = this.o;
        this.l = (int)Math.ceil(f6 * f7);
        break;
        label293: if (this.k > this.l)
        {
          this.g = this.n;
          this.f = ((this.o - this.l) / 2 + org.vidogram.messenger.a.a(14.0F));
          this.d = this.l;
          this.e = this.l;
          continue;
        }
        this.f = this.m;
        this.g = ((this.p - this.k) / 2 + org.vidogram.messenger.a.a(14.0F));
        this.d = this.k;
        this.e = this.k;
        continue;
        label408: this.f = (f1 * this.k + this.m);
        this.g = (this.l * f2 + this.n);
        this.d = (this.k * f3);
        this.e = (this.l * f4);
      }
    }

    public Bitmap a()
    {
      int i2 = 0;
      float f1 = (this.f - this.m) / this.k;
      float f2 = (this.g - this.n) / this.l;
      float f3 = this.d / this.k;
      float f4 = this.e / this.k;
      int i6 = (int)(f1 * ak.a(ak.this).getWidth());
      int i4 = (int)(ak.a(ak.this).getHeight() * f2);
      int i3 = (int)(ak.a(ak.this).getWidth() * f3);
      int i5 = (int)(ak.a(ak.this).getWidth() * f4);
      int i1 = i6;
      if (i6 < 0)
        i1 = 0;
      if (i4 < 0);
      while (true)
      {
        if (i1 + i3 > ak.a(ak.this).getWidth())
          i3 = ak.a(ak.this).getWidth() - i1;
        while (true)
        {
          i4 = i5;
          if (i2 + i5 > ak.a(ak.this).getHeight())
            i4 = ak.a(ak.this).getHeight() - i2;
          try
          {
            Bitmap localBitmap1 = org.vidogram.messenger.c.a(ak.a(ak.this), i1, i2, i3, i4);
            return localBitmap1;
          }
          catch (Throwable localThrowable2)
          {
            n.a("tmessags", localThrowable1);
            System.gc();
            try
            {
              Bitmap localBitmap2 = org.vidogram.messenger.c.a(ak.a(ak.this), i1, i2, i3, i4);
              return localBitmap2;
            }
            catch (Throwable localThrowable2)
            {
              n.a("tmessages", localThrowable2);
              return null;
            }
          }
        }
        i2 = i4;
      }
    }

    protected void onDraw(Canvas paramCanvas)
    {
      if (ak.b(ak.this) != null);
      try
      {
        ak.b(ak.this).setBounds(this.m, this.n, this.m + this.k, this.n + this.l);
        ak.b(ak.this).draw(paramCanvas);
        paramCanvas.drawRect(this.m, this.n, this.m + this.k, this.g, this.c);
        float f1 = this.m;
        float f2 = this.g;
        float f3 = this.f;
        float f4 = this.g;
        paramCanvas.drawRect(f1, f2, f3, this.e + f4, this.c);
        f1 = this.f;
        f2 = this.d;
        f3 = this.g;
        f4 = this.m + this.k;
        float f5 = this.g;
        paramCanvas.drawRect(f2 + f1, f3, f4, this.e + f5, this.c);
        f1 = this.m;
        f2 = this.g;
        paramCanvas.drawRect(f1, this.e + f2, this.m + this.k, this.n + this.l, this.c);
        f1 = this.f;
        f2 = this.g;
        f3 = this.f;
        f4 = this.d;
        f5 = this.g;
        paramCanvas.drawRect(f1, f2, f4 + f3, this.e + f5, this.a);
        int i2 = org.vidogram.messenger.a.a(1.0F);
        f1 = this.f;
        f2 = i2;
        f3 = this.g;
        f4 = i2;
        f5 = this.f;
        float f6 = i2;
        float f7 = org.vidogram.messenger.a.a(20.0F);
        float f8 = this.g;
        paramCanvas.drawRect(f2 + f1, f4 + f3, f7 + (f5 + f6), i2 * 3 + f8, this.b);
        f1 = this.f;
        f2 = i2;
        f3 = this.g;
        f4 = i2;
        f5 = this.f;
        f6 = i2 * 3;
        f7 = this.g;
        f8 = i2;
        paramCanvas.drawRect(f2 + f1, f4 + f3, f6 + f5, org.vidogram.messenger.a.a(20.0F) + (f7 + f8), this.b);
        f1 = this.f;
        f2 = this.d;
        f3 = i2;
        f4 = org.vidogram.messenger.a.a(20.0F);
        f5 = this.g;
        f6 = i2;
        f7 = this.f;
        f8 = this.d;
        float f9 = i2;
        float f10 = this.g;
        paramCanvas.drawRect(f1 + f2 - f3 - f4, f6 + f5, f7 + f8 - f9, i2 * 3 + f10, this.b);
        f1 = this.f;
        f2 = this.d;
        f3 = i2 * 3;
        f4 = this.g;
        f5 = i2;
        f6 = this.f;
        f7 = this.d;
        f8 = i2;
        f9 = this.g;
        f10 = i2;
        paramCanvas.drawRect(f1 + f2 - f3, f5 + f4, f6 + f7 - f8, org.vidogram.messenger.a.a(20.0F) + (f9 + f10), this.b);
        f1 = this.f;
        f2 = i2;
        f3 = this.g;
        f4 = this.e;
        f5 = i2;
        f6 = org.vidogram.messenger.a.a(20.0F);
        f7 = this.f;
        paramCanvas.drawRect(f2 + f1, f3 + f4 - f5 - f6, i2 * 3 + f7, this.g + this.e - i2, this.b);
        f1 = this.f;
        f2 = i2;
        f3 = this.g;
        f4 = this.e;
        f5 = i2 * 3;
        f6 = this.f;
        f7 = i2;
        paramCanvas.drawRect(f2 + f1, f3 + f4 - f5, org.vidogram.messenger.a.a(20.0F) + (f6 + f7), this.g + this.e - i2, this.b);
        paramCanvas.drawRect(this.f + this.d - i2 - org.vidogram.messenger.a.a(20.0F), this.g + this.e - i2 * 3, this.f + this.d - i2, this.g + this.e - i2, this.b);
        paramCanvas.drawRect(this.f + this.d - i2 * 3, this.g + this.e - i2 - org.vidogram.messenger.a.a(20.0F), this.f + this.d - i2, this.g + this.e - i2, this.b);
        int i1 = 1;
        while (i1 < 3)
        {
          f1 = this.f;
          f2 = this.d / 3.0F;
          f3 = i1;
          f4 = this.g;
          f5 = i2;
          f6 = this.f;
          f7 = i2;
          paramCanvas.drawRect(f2 * f3 + f1, f5 + f4, this.d / 3.0F * i1 + (f6 + f7), this.g + this.e - i2, this.b);
          f1 = this.f;
          f2 = i2;
          f3 = this.g;
          f4 = this.e / 3.0F;
          f5 = i1;
          f6 = this.f;
          f7 = i2;
          f8 = this.d;
          f9 = this.g;
          f10 = this.e / 3.0F;
          float f11 = i1;
          paramCanvas.drawRect(f2 + f1, f4 * f5 + f3, f8 + (f6 - f7), i2 + (f9 + f10 * f11), this.b);
          i1 += 1;
        }
      }
      catch (Throwable localThrowable)
      {
        while (true)
          n.a("tmessages", localThrowable);
      }
    }

    protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
      this.o = (paramInt3 - paramInt1 - org.vidogram.messenger.a.a(28.0F));
      this.p = (paramInt4 - paramInt2 - org.vidogram.messenger.a.a(28.0F));
      c();
    }
  }

  public static abstract interface b
  {
    public abstract void a(Bitmap paramBitmap);
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.ak
 * JD-Core Version:    0.6.0
 */