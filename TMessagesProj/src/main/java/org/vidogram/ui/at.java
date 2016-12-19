package org.vidogram.ui;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import org.vidogram.messenger.a;
import org.vidogram.messenger.m;
import org.vidogram.messenger.n;
import org.vidogram.messenger.p;
import org.vidogram.messenger.q;
import org.vidogram.messenger.u;
import org.vidogram.messenger.y;
import org.vidogram.messenger.y.b;
import org.vidogram.tgnet.ConnectionsManager;
import org.vidogram.tgnet.g.ar;
import org.vidogram.tgnet.g.au;
import org.vidogram.tgnet.g.az;
import org.vidogram.tgnet.g.x;

public class at
  implements y.b
{
  private static volatile at i = null;
  private Activity a;
  private WindowManager.LayoutParams b;
  private FrameLayout c;
  private a d;
  private q e = new q();
  private b f;
  private boolean g = false;
  private u h = null;

  public static at a()
  {
    Object localObject1 = i;
    if (localObject1 == null)
    {
      monitorenter;
      try
      {
        at localat = i;
        localObject1 = localat;
        if (localat == null)
        {
          localObject1 = new at();
          i = (at)localObject1;
        }
        return localObject1;
      }
      finally
      {
        monitorexit;
      }
    }
    return (at)localObject2;
  }

  private void a(Canvas paramCanvas)
  {
    paramCanvas.save();
    paramCanvas.translate(this.d.getWidth() / 2, this.d.getHeight() / 2);
    Bitmap localBitmap = this.e.h();
    int k;
    int j;
    float f1;
    if (localBitmap != null)
    {
      k = localBitmap.getWidth();
      j = localBitmap.getHeight();
      f1 = this.d.getWidth() / k;
      float f2 = this.d.getHeight() / j;
      if (f1 <= f2)
        break label142;
      f1 = f2;
    }
    label142: 
    while (true)
    {
      k = (int)(k * f1);
      j = (int)(f1 * j);
      this.e.a(-k / 2, -j / 2, k, j);
      this.e.a(paramCanvas);
      paramCanvas.restore();
      return;
    }
  }

  public void a(int paramInt, Object[] paramArrayOfObject)
  {
    if (paramInt == y.e)
      if (this.h == null)
        break label14;
    while (true)
    {
      label14: return;
      if ((((Integer)paramArrayOfObject[1]).intValue() != 0) || (!((ArrayList)paramArrayOfObject[0]).contains(Integer.valueOf(this.h.q()))))
        continue;
      c();
      return;
      if ((paramInt != y.B) || (this.h == null) || (this.f == null))
        break;
      paramArrayOfObject = (SparseArray)paramArrayOfObject[0];
      paramInt = 0;
      while (paramInt < paramArrayOfObject.size())
      {
        int j = paramArrayOfObject.keyAt(paramInt);
        Iterator localIterator = ((ArrayList)paramArrayOfObject.get(j)).iterator();
        while (localIterator.hasNext())
        {
          Integer localInteger = (Integer)localIterator.next();
          if (this.h.q() != localInteger.intValue())
            continue;
          this.h.a.G = j;
          this.f.invalidate();
          return;
        }
        paramInt += 1;
      }
    }
  }

  public void a(Activity paramActivity)
  {
    if (this.a == paramActivity)
      return;
    this.a = paramActivity;
    this.c = new FrameLayout(paramActivity);
    this.c.setBackgroundColor(-16777216);
    this.c.setFocusable(true);
    this.c.setFocusableInTouchMode(true);
    if (Build.VERSION.SDK_INT >= 23)
      this.c.setFitsSystemWindows(true);
    this.d = new a(paramActivity);
    this.d.setFocusable(false);
    this.c.addView(this.d);
    FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)this.d.getLayoutParams();
    localLayoutParams.width = -1;
    localLayoutParams.height = -1;
    localLayoutParams.gravity = 51;
    this.d.setLayoutParams(localLayoutParams);
    this.d.setOnTouchListener(new View.OnTouchListener()
    {
      public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
      {
        if ((paramMotionEvent.getAction() == 1) || (paramMotionEvent.getAction() == 6) || (paramMotionEvent.getAction() == 3))
          at.this.c();
        return true;
      }
    });
    this.f = new b(paramActivity);
    this.d.addView(this.f);
    paramActivity = (FrameLayout.LayoutParams)this.f.getLayoutParams();
    paramActivity.gravity = 53;
    paramActivity.width = a.a(100.0F);
    paramActivity.height = a.a(32.0F);
    paramActivity.rightMargin = a.a(19.0F);
    paramActivity.topMargin = a.a(19.0F);
    this.f.setLayoutParams(paramActivity);
    this.b = new WindowManager.LayoutParams();
    this.b.height = -1;
    this.b.format = -3;
    this.b.width = -1;
    this.b.gravity = 48;
    this.b.type = 99;
    this.b.flags = 8;
    this.e.a(this.d);
  }

  public void a(u paramu)
  {
    if ((this.a == null) || (paramu == null) || (paramu.a.j == null) || (paramu.a.j.d == null))
      return;
    y.a().a(this, y.e);
    y.a().a(this, y.B);
    g.az localaz = m.a(paramu.m, a.f());
    int k = localaz.f;
    int j = k;
    if (k == 0)
      j = -1;
    BitmapDrawable localBitmapDrawable2 = p.a().a(localaz.c, null, null);
    File localFile;
    Object localObject;
    if (localBitmapDrawable2 == null)
    {
      localFile = m.a(localaz);
      if (Build.VERSION.SDK_INT >= 21)
        break label382;
      localObject = new BitmapFactory.Options();
      ((BitmapFactory.Options)localObject).inDither = true;
      ((BitmapFactory.Options)localObject).inPreferredConfig = Bitmap.Config.ARGB_8888;
      ((BitmapFactory.Options)localObject).inPurgeable = true;
      ((BitmapFactory.Options)localObject).inSampleSize = 1;
      ((BitmapFactory.Options)localObject).inMutable = true;
    }
    while (true)
    {
      try
      {
        localObject = BitmapFactory.decodeFile(localFile.getAbsolutePath(), (BitmapFactory.Options)localObject);
        if (localObject != null)
        {
          localObject = new BitmapDrawable((Bitmap)localObject);
          p.a().a((BitmapDrawable)localObject, localaz.c.c + "_" + localaz.c.d);
          if (localObject == null)
            continue;
          this.e.a((Drawable)localObject);
          this.h = paramu;
          a.a(this.a);
        }
      }
      catch (Throwable localBitmapDrawable1)
      {
        try
        {
          if (this.c.getParent() == null)
            continue;
          ((WindowManager)this.a.getSystemService("window")).removeView(this.c);
          ((WindowManager)this.a.getSystemService("window")).addView(this.c, this.b);
          this.f.invalidate();
          this.g = true;
          return;
          localThrowable = localThrowable;
          n.a("tmessages", localThrowable);
          localBitmapDrawable1 = null;
          continue;
          this.e.a(localaz.c, null, null, j, null, false);
        }
        catch (Exception paramu)
        {
          n.a("tmessages", paramu);
          continue;
        }
      }
      BitmapDrawable localBitmapDrawable1 = localBitmapDrawable2;
      continue;
      label382: localBitmapDrawable1 = null;
    }
  }

  public boolean b()
  {
    return this.g;
  }

  public void c()
  {
    y.a().b(this, y.e);
    y.a().b(this, y.B);
    if (this.a == null);
    while (true)
    {
      return;
      this.h = null;
      this.g = false;
      a.b(this.a);
      a.a(new Runnable()
      {
        public void run()
        {
          at.b(at.this).a((Bitmap)null);
        }
      });
      try
      {
        if (this.c.getParent() == null)
          continue;
        ((WindowManager)this.a.getSystemService("window")).removeView(this.c);
        return;
      }
      catch (Exception localException)
      {
        n.a("tmessages", localException);
      }
    }
  }

  public void d()
  {
    y.a().b(this, y.e);
    y.a().b(this, y.B);
    this.g = false;
    this.h = null;
    if ((this.a == null) || (this.c == null))
      return;
    try
    {
      if (this.c.getParent() != null)
        ((WindowManager)this.a.getSystemService("window")).removeViewImmediate(this.c);
      this.c = null;
      i = null;
      return;
    }
    catch (Exception localException)
    {
      while (true)
        n.a("tmessages", localException);
    }
  }

  private class a extends FrameLayout
  {
    public a(Context arg2)
    {
      super();
      setWillNotDraw(false);
    }

    protected void onDraw(Canvas paramCanvas)
    {
      at.a(at.a(), paramCanvas);
    }
  }

  private class b extends FrameLayout
  {
    private String b;
    private int c;
    private TextPaint d = null;
    private StaticLayout e = null;
    private Paint f;
    private RectF g = new RectF();
    private Drawable h = null;

    public b(Context arg2)
    {
      super();
      setWillNotDraw(false);
      this.d = new TextPaint(1);
      this.d.setTextSize(a.a(15.0F));
      this.d.setColor(-1);
      this.f = new Paint(1);
      this.f.setColor(-1644826);
      this.h = getResources().getDrawable(2130837688);
    }

    private void a()
    {
      if (at.a(at.this) == null);
      String str;
      do
      {
        return;
        str = at.a(at.this).y();
      }
      while ((str == null) || ((this.b != null) && (this.b.equals(str))));
      this.b = str;
      this.c = (int)Math.ceil(this.d.measureText(this.b));
      this.e = new StaticLayout(TextUtils.ellipsize(this.b, this.d, this.c, TextUtils.TruncateAt.END), this.d, this.c, Layout.Alignment.ALIGN_NORMAL, 1.0F, 0.0F, false);
      invalidate();
    }

    protected void onDraw(Canvas paramCanvas)
    {
      if ((at.a(at.this) == null) || (at.a(at.this).a.G == 0));
      do
      {
        return;
        if (this.h != null)
        {
          this.h.setBounds(getMeasuredWidth() - a.a(32.0F), 0, getMeasuredWidth(), a.a(32.0F));
          this.h.draw(paramCanvas);
        }
        long l1 = System.currentTimeMillis();
        long l2 = ConnectionsManager.a().c() * 1000;
        float f1 = (float)Math.max(0L, at.a(at.this).a.G * 1000L - (l1 + l2)) / (at.a(at.this).a.F * 1000.0F);
        paramCanvas.drawArc(this.g, -90.0F, -360.0F * f1, true, this.f);
        if (f1 != 0.0F)
        {
          int i = a.a(2.0F);
          invalidate((int)this.g.left - i, (int)this.g.top - i, (int)this.g.right + i * 2, i * 2 + (int)this.g.bottom);
        }
        a();
      }
      while (this.e == null);
      paramCanvas.save();
      paramCanvas.translate(getMeasuredWidth() - a.a(38.0F) - this.c, a.a(7.0F));
      this.e.draw(paramCanvas);
      paramCanvas.restore();
    }

    protected void onMeasure(int paramInt1, int paramInt2)
    {
      super.onMeasure(paramInt1, paramInt2);
      this.g.set(getMeasuredWidth() - a.a(30.0F), a.a(2.0F), getMeasuredWidth() - a.a(2.0F), a.a(30.0F));
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.at
 * JD-Core Version:    0.6.0
 */