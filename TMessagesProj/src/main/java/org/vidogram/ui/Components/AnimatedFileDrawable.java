package org.vidogram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Matrix.ScaleToFit;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.io.File;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor.DiscardPolicy;
import org.vidogram.messenger.a;
import org.vidogram.messenger.n;

public class AnimatedFileDrawable extends BitmapDrawable
  implements Animatable
{
  private static ScheduledThreadPoolExecutor C;
  private static final Handler y = new Handler(Looper.getMainLooper());
  private volatile boolean A;
  private volatile int B;
  private View D = null;
  private View E = null;
  private Runnable F = new Runnable()
  {
    public void run()
    {
      if ((AnimatedFileDrawable.c(AnimatedFileDrawable.this)) && (AnimatedFileDrawable.d(AnimatedFileDrawable.this) != 0))
      {
        AnimatedFileDrawable.b(AnimatedFileDrawable.d(AnimatedFileDrawable.this));
        AnimatedFileDrawable.a(AnimatedFileDrawable.this, 0);
      }
      if (AnimatedFileDrawable.d(AnimatedFileDrawable.this) == 0)
        if (AnimatedFileDrawable.e(AnimatedFileDrawable.this) != null)
        {
          AnimatedFileDrawable.e(AnimatedFileDrawable.this).recycle();
          AnimatedFileDrawable.a(AnimatedFileDrawable.this, null);
        }
      do
      {
        return;
        AnimatedFileDrawable.a(AnimatedFileDrawable.this, null);
        AnimatedFileDrawable.b(AnimatedFileDrawable.this, AnimatedFileDrawable.e(AnimatedFileDrawable.this));
        AnimatedFileDrawable.a(AnimatedFileDrawable.this, AnimatedFileDrawable.f(AnimatedFileDrawable.this));
        if (AnimatedFileDrawable.g(AnimatedFileDrawable.this)[3] < AnimatedFileDrawable.h(AnimatedFileDrawable.this))
          AnimatedFileDrawable.b(AnimatedFileDrawable.this, 0);
        if (AnimatedFileDrawable.g(AnimatedFileDrawable.this)[3] - AnimatedFileDrawable.h(AnimatedFileDrawable.this) != 0)
          AnimatedFileDrawable.c(AnimatedFileDrawable.this, AnimatedFileDrawable.g(AnimatedFileDrawable.this)[3] - AnimatedFileDrawable.h(AnimatedFileDrawable.this));
        AnimatedFileDrawable.b(AnimatedFileDrawable.this, AnimatedFileDrawable.g(AnimatedFileDrawable.this)[3]);
        if (AnimatedFileDrawable.a(AnimatedFileDrawable.this) == null)
          continue;
        AnimatedFileDrawable.a(AnimatedFileDrawable.this).invalidate();
        return;
      }
      while (AnimatedFileDrawable.b(AnimatedFileDrawable.this) == null);
      AnimatedFileDrawable.b(AnimatedFileDrawable.this).invalidate();
    }
  };
  private Runnable G = new Runnable()
  {
    public void run()
    {
      if (!AnimatedFileDrawable.i(AnimatedFileDrawable.this))
        if ((!AnimatedFileDrawable.j(AnimatedFileDrawable.this)) && (AnimatedFileDrawable.d(AnimatedFileDrawable.this) == 0))
        {
          AnimatedFileDrawable.a(AnimatedFileDrawable.this, AnimatedFileDrawable.a(AnimatedFileDrawable.k(AnimatedFileDrawable.this).getAbsolutePath(), AnimatedFileDrawable.g(AnimatedFileDrawable.this)));
          AnimatedFileDrawable.a(AnimatedFileDrawable.this, true);
        }
      try
      {
        Bitmap localBitmap = AnimatedFileDrawable.e(AnimatedFileDrawable.this);
        if (localBitmap == null);
        try
        {
          AnimatedFileDrawable.a(AnimatedFileDrawable.this, Bitmap.createBitmap(AnimatedFileDrawable.g(AnimatedFileDrawable.this)[0], AnimatedFileDrawable.g(AnimatedFileDrawable.this)[1], Bitmap.Config.ARGB_8888));
          if ((AnimatedFileDrawable.f(AnimatedFileDrawable.this) == null) && (AnimatedFileDrawable.e(AnimatedFileDrawable.this) != null) && (AnimatedFileDrawable.l(AnimatedFileDrawable.this) != 0))
            AnimatedFileDrawable.b(AnimatedFileDrawable.this, new BitmapShader(AnimatedFileDrawable.e(AnimatedFileDrawable.this), Shader.TileMode.CLAMP, Shader.TileMode.CLAMP));
          if (AnimatedFileDrawable.e(AnimatedFileDrawable.this) != null)
            AnimatedFileDrawable.a(AnimatedFileDrawable.d(AnimatedFileDrawable.this), AnimatedFileDrawable.e(AnimatedFileDrawable.this), AnimatedFileDrawable.g(AnimatedFileDrawable.this));
          a.a(AnimatedFileDrawable.m(AnimatedFileDrawable.this));
          return;
        }
        catch (Throwable localThrowable1)
        {
          while (true)
            n.a("tmessages", localThrowable1);
        }
      }
      catch (Throwable localThrowable2)
      {
        while (true)
          n.a("tmessages", localThrowable2);
      }
    }
  };
  private final Runnable H = new Runnable()
  {
    public void run()
    {
      if (AnimatedFileDrawable.a(AnimatedFileDrawable.this) != null)
        AnimatedFileDrawable.a(AnimatedFileDrawable.this).invalidate();
      do
        return;
      while (AnimatedFileDrawable.b(AnimatedFileDrawable.this) == null);
      AnimatedFileDrawable.b(AnimatedFileDrawable.this).invalidate();
    }
  };
  protected final Runnable a = new Runnable()
  {
    public void run()
    {
      if (AnimatedFileDrawable.a(AnimatedFileDrawable.this) != null)
        AnimatedFileDrawable.a(AnimatedFileDrawable.this).invalidate();
      do
        return;
      while (AnimatedFileDrawable.b(AnimatedFileDrawable.this) == null);
      AnimatedFileDrawable.b(AnimatedFileDrawable.this).invalidate();
    }
  };
  private long b;
  private int c;
  private int d = 50;
  private final int[] e = new int[4];
  private Runnable f;
  private Bitmap g;
  private Bitmap h;
  private Bitmap i;
  private boolean j;
  private boolean k;
  private File l;
  private boolean m;
  private BitmapShader n;
  private BitmapShader o;
  private BitmapShader p;
  private int q;
  private RectF r = new RectF();
  private RectF s = new RectF();
  private Matrix t = new Matrix();
  private float u = 1.0F;
  private float v = 1.0F;
  private boolean w;
  private final Rect x = new Rect();
  private volatile boolean z;

  static
  {
    C = new ScheduledThreadPoolExecutor(2, new ThreadPoolExecutor.DiscardPolicy());
  }

  public AnimatedFileDrawable(File paramFile, boolean paramBoolean)
  {
    this.l = paramFile;
    if (paramBoolean)
    {
      this.B = createDecoder(paramFile.getAbsolutePath(), this.e);
      this.k = true;
    }
  }

  protected static void b(Runnable paramRunnable)
  {
    if (Looper.myLooper() == y.getLooper())
    {
      paramRunnable.run();
      return;
    }
    y.post(paramRunnable);
  }

  private static native int createDecoder(String paramString, int[] paramArrayOfInt);

  private static native void destroyDecoder(int paramInt);

  private void f()
  {
    if ((this.f != null) || ((this.B == 0) && (this.k)) || (this.j))
      return;
    Runnable localRunnable = this.G;
    this.f = localRunnable;
    a(localRunnable);
  }

  private static native int getVideoFrame(int paramInt, Bitmap paramBitmap, int[] paramArrayOfInt);

  public void a()
  {
    if (this.E != null)
      this.m = true;
    while (true)
    {
      return;
      this.z = false;
      this.A = true;
      if (this.f == null)
      {
        if (this.B != 0)
        {
          destroyDecoder(this.B);
          this.B = 0;
        }
        if (this.h != null)
        {
          this.h.recycle();
          this.h = null;
        }
      }
      while (this.g != null)
      {
        this.g.recycle();
        this.g = null;
        return;
        this.j = true;
      }
    }
  }

  public void a(int paramInt)
  {
    this.q = paramInt;
    getPaint().setFlags(1);
  }

  public void a(View paramView)
  {
    this.D = paramView;
  }

  protected void a(Runnable paramRunnable)
  {
    C.execute(paramRunnable);
  }

  public Bitmap b()
  {
    if (this.g != null)
      return this.g;
    if (this.h != null)
      return this.h;
    return null;
  }

  public void b(View paramView)
  {
    this.E = paramView;
    if ((paramView == null) && (this.m))
      a();
  }

  public boolean c()
  {
    return (this.B != 0) && ((this.g != null) || (this.h != null));
  }

  public int d()
  {
    return this.e[2];
  }

  public void draw(Canvas paramCanvas)
  {
    if (((this.B == 0) && (this.k)) || (this.j))
      return;
    label47: float f1;
    if (this.z)
    {
      if ((this.g == null) && (this.h == null))
        f();
    }
    else
    {
      if (this.g == null)
        break label498;
      if (this.w)
      {
        i1 = this.g.getWidth();
        int i6 = this.g.getHeight();
        int i7;
        int i3;
        if (this.e[2] != 90)
        {
          i7 = i6;
          i3 = i1;
          if (this.e[2] != 270);
        }
        else
        {
          i3 = i6;
          i7 = i1;
        }
        this.x.set(getBounds());
        this.u = (this.x.width() / i3);
        this.v = (this.x.height() / i7);
        this.w = false;
      }
      if (this.q == 0)
        break label588;
      f1 = Math.max(this.u, this.v);
      if (this.n == null)
        this.n = new BitmapShader(this.i, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
      getPaint().setShader(this.n);
      this.r.set(this.x);
      this.t.reset();
      if (Math.abs(this.u - this.v) <= 1.0E-005F)
        break label536;
      if ((this.e[2] != 90) && (this.e[2] != 270))
        break label500;
      int i4 = (int)Math.floor(this.x.height() / f1);
      int i1 = (int)Math.floor(this.x.width() / f1);
      label315: this.s.set((this.g.getWidth() - i4) / 2, (this.g.getHeight() - i1) / 2, i4, i1);
      a.a(this.t, this.s, this.r, this.e[2], Matrix.ScaleToFit.START);
    }
    while (true)
    {
      this.n.setLocalMatrix(this.t);
      paramCanvas.drawRoundRect(this.r, this.q, this.q, getPaint());
      label409: if (!this.z)
        break label667;
      y.postDelayed(this.a, this.d);
      return;
      if ((Math.abs(System.currentTimeMillis() - this.b) < this.d) || (this.h == null))
        break label47;
      f();
      this.g = this.h;
      this.n = this.o;
      this.h = null;
      this.o = null;
      this.b = System.currentTimeMillis();
      break label47;
      label498: break;
      label500: int i5 = (int)Math.floor(this.x.width() / f1);
      int i2 = (int)Math.floor(this.x.height() / f1);
      break label315;
      label536: this.s.set(0.0F, 0.0F, this.g.getWidth(), this.g.getHeight());
      a.a(this.t, this.s, this.r, this.e[2], Matrix.ScaleToFit.FILL);
    }
    label588: paramCanvas.translate(this.x.left, this.x.top);
    if (this.e[2] == 90)
    {
      paramCanvas.rotate(90.0F);
      paramCanvas.translate(0.0F, -this.x.width());
    }
    while (true)
    {
      paramCanvas.scale(this.u, this.v);
      paramCanvas.drawBitmap(this.g, 0.0F, 0.0F, getPaint());
      break label409;
      label667: break;
      if (this.e[2] == 180)
      {
        paramCanvas.rotate(180.0F);
        paramCanvas.translate(-this.x.width(), -this.x.height());
        continue;
      }
      if (this.e[2] != 270)
        continue;
      paramCanvas.rotate(270.0F);
      paramCanvas.translate(-this.x.height(), 0.0F);
    }
  }

  public AnimatedFileDrawable e()
  {
    AnimatedFileDrawable localAnimatedFileDrawable = new AnimatedFileDrawable(this.l, false);
    localAnimatedFileDrawable.e[0] = this.e[0];
    localAnimatedFileDrawable.e[1] = this.e[1];
    return localAnimatedFileDrawable;
  }

  protected void finalize()
  {
    try
    {
      a();
      return;
    }
    finally
    {
      super.finalize();
    }
    throw localObject;
  }

  public int getIntrinsicHeight()
  {
    if (this.k)
    {
      if ((this.e[2] == 90) || (this.e[2] == 270))
        return this.e[0];
      return this.e[1];
    }
    return a.a(100.0F);
  }

  public int getIntrinsicWidth()
  {
    if (this.k)
    {
      if ((this.e[2] == 90) || (this.e[2] == 270))
        return this.e[1];
      return this.e[0];
    }
    return a.a(100.0F);
  }

  public int getMinimumHeight()
  {
    if (this.k)
    {
      if ((this.e[2] == 90) || (this.e[2] == 270))
        return this.e[0];
      return this.e[1];
    }
    return a.a(100.0F);
  }

  public int getMinimumWidth()
  {
    if (this.k)
    {
      if ((this.e[2] == 90) || (this.e[2] == 270))
        return this.e[1];
      return this.e[0];
    }
    return a.a(100.0F);
  }

  public int getOpacity()
  {
    return -2;
  }

  public boolean isRunning()
  {
    return this.z;
  }

  protected void onBoundsChange(Rect paramRect)
  {
    super.onBoundsChange(paramRect);
    this.w = true;
  }

  public void start()
  {
    if (this.z)
      return;
    this.z = true;
    if (this.g == null)
      f();
    b(this.H);
  }

  public void stop()
  {
    this.z = false;
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.Components.AnimatedFileDrawable
 * JD-Core Version:    0.6.0
 */