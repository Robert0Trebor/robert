package org.vidogram.ui.Components;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.media.MediaMetadataRetriever;
import android.os.AsyncTask;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.Iterator;
import org.vidogram.messenger.a;
import org.vidogram.messenger.n;

@TargetApi(10)
public class bs extends View
{
  private static final Object m = new Object();
  private long a;
  private float b;
  private float c = 1.0F;
  private Paint d = new Paint(1);
  private Paint e;
  private boolean f;
  private boolean g;
  private float h;
  private MediaMetadataRetriever i;
  private a j;
  private ArrayList<Bitmap> k = new ArrayList();
  private AsyncTask<Integer, Integer, Bitmap> l;
  private long n;
  private int o;
  private int p;
  private int q;

  public bs(Context paramContext)
  {
    super(paramContext);
    this.d.setColor(-1);
    this.e = new Paint();
    this.e.setColor(2130706432);
  }

  private void a(int paramInt)
  {
    if (this.i == null)
      return;
    if (paramInt == 0)
    {
      this.p = a.a(40.0F);
      this.q = ((getMeasuredWidth() - a.a(16.0F)) / this.p);
      this.o = (int)Math.ceil((getMeasuredWidth() - a.a(16.0F)) / this.q);
      this.n = (this.a / this.q);
    }
    this.l = new AsyncTask()
    {
      private int b = 0;

      protected Bitmap a(Integer[] paramArrayOfInteger)
      {
        Bitmap localBitmap = null;
        this.b = paramArrayOfInteger[0].intValue();
        if (isCancelled());
        while (true)
        {
          return null;
          try
          {
            paramArrayOfInteger = bs.b(bs.this).getFrameAtTime(bs.a(bs.this) * this.b * 1000L);
            while (true)
            {
              float f2;
              try
              {
                if (isCancelled())
                  break;
                if (paramArrayOfInteger == null)
                  break label245;
                localBitmap = Bitmap.createBitmap(bs.c(bs.this), bs.d(bs.this), paramArrayOfInteger.getConfig());
                Canvas localCanvas = new Canvas(localBitmap);
                f1 = bs.c(bs.this) / paramArrayOfInteger.getWidth();
                f2 = bs.d(bs.this) / paramArrayOfInteger.getHeight();
                if (f1 > f2)
                {
                  int i = (int)(paramArrayOfInteger.getWidth() * f1);
                  int j = (int)(f1 * paramArrayOfInteger.getHeight());
                  localCanvas.drawBitmap(paramArrayOfInteger, new Rect(0, 0, paramArrayOfInteger.getWidth(), paramArrayOfInteger.getHeight()), new Rect((bs.c(bs.this) - i) / 2, (bs.d(bs.this) - j) / 2, i, j), null);
                  paramArrayOfInteger.recycle();
                  return localBitmap;
                }
              }
              catch (Exception localException1)
              {
                n.a("tmessages", localException1);
                return paramArrayOfInteger;
              }
              float f1 = f2;
            }
          }
          catch (Exception localException2)
          {
            while (true)
            {
              paramArrayOfInteger = localException1;
              Object localObject = localException2;
            }
          }
        }
        label245: return paramArrayOfInteger;
      }

      protected void a(Bitmap paramBitmap)
      {
        if (!isCancelled())
        {
          bs.e(bs.this).add(paramBitmap);
          bs.this.invalidate();
          if (this.b < bs.f(bs.this))
            bs.a(bs.this, this.b + 1);
        }
      }
    };
    this.l.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Integer[] { Integer.valueOf(paramInt), null, null });
  }

  public void a()
  {
    synchronized (m)
    {
      try
      {
        if (this.i != null)
        {
          this.i.release();
          this.i = null;
        }
        ??? = this.k.iterator();
        while (((Iterator)???).hasNext())
        {
          Bitmap localBitmap = (Bitmap)((Iterator)???).next();
          if (localBitmap == null)
            continue;
          localBitmap.recycle();
        }
      }
      catch (Exception localException)
      {
        while (true)
          n.a("tmessages", localException);
      }
    }
    this.k.clear();
    if (this.l != null)
    {
      this.l.cancel(true);
      this.l = null;
    }
  }

  public void b()
  {
    Iterator localIterator = this.k.iterator();
    while (localIterator.hasNext())
    {
      Bitmap localBitmap = (Bitmap)localIterator.next();
      if (localBitmap == null)
        continue;
      localBitmap.recycle();
    }
    this.k.clear();
    if (this.l != null)
    {
      this.l.cancel(true);
      this.l = null;
    }
    invalidate();
  }

  public float getLeftProgress()
  {
    return this.b;
  }

  public float getRightProgress()
  {
    return this.c;
  }

  protected void onDraw(Canvas paramCanvas)
  {
    int i3 = getMeasuredWidth() - a.a(36.0F);
    int i4 = (int)(i3 * this.b) + a.a(16.0F);
    int i5 = (int)(i3 * this.c) + a.a(16.0F);
    paramCanvas.save();
    paramCanvas.clipRect(a.a(16.0F), 0, a.a(20.0F) + i3, a.a(44.0F));
    if ((this.k.isEmpty()) && (this.l == null))
      a(0);
    while (true)
    {
      paramCanvas.drawRect(a.a(16.0F), a.a(2.0F), i4, a.a(42.0F), this.e);
      paramCanvas.drawRect(a.a(4.0F) + i5, a.a(2.0F), a.a(16.0F) + i3 + a.a(4.0F), a.a(42.0F), this.e);
      paramCanvas.drawRect(i4, 0.0F, a.a(2.0F) + i4, a.a(44.0F), this.d);
      paramCanvas.drawRect(a.a(2.0F) + i5, 0.0F, a.a(4.0F) + i5, a.a(44.0F), this.d);
      paramCanvas.drawRect(a.a(2.0F) + i4, 0.0F, a.a(4.0F) + i5, a.a(2.0F), this.d);
      paramCanvas.drawRect(a.a(2.0F) + i4, a.a(42.0F), a.a(4.0F) + i5, a.a(44.0F), this.d);
      paramCanvas.restore();
      paramCanvas.drawCircle(i4, getMeasuredHeight() / 2, a.a(7.0F), this.d);
      paramCanvas.drawCircle(a.a(4.0F) + i5, getMeasuredHeight() / 2, a.a(7.0F), this.d);
      return;
      int i1 = 0;
      int i2 = 0;
      while (i1 < this.k.size())
      {
        Bitmap localBitmap = (Bitmap)this.k.get(i1);
        if (localBitmap != null)
          paramCanvas.drawBitmap(localBitmap, a.a(16.0F) + this.o * i2, a.a(2.0F), null);
        i2 += 1;
        i1 += 1;
      }
    }
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (paramMotionEvent == null)
      return false;
    float f1 = paramMotionEvent.getX();
    float f2 = paramMotionEvent.getY();
    int i4 = getMeasuredWidth() - a.a(32.0F);
    int i1 = (int)(i4 * this.b);
    i1 = a.a(16.0F) + i1;
    int i2 = (int)(i4 * this.c) + a.a(16.0F);
    int i3;
    if (paramMotionEvent.getAction() == 0)
    {
      i3 = a.a(12.0F);
      if ((i1 - i3 <= f1) && (f1 <= i1 + i3) && (f2 >= 0.0F) && (f2 <= getMeasuredHeight()))
      {
        this.f = true;
        this.h = (int)(f1 - i1);
        getParent().requestDisallowInterceptTouchEvent(true);
        invalidate();
        return true;
      }
      if ((i2 - i3 <= f1) && (f1 <= i2 + i3) && (f2 >= 0.0F) && (f2 <= getMeasuredHeight()))
      {
        this.g = true;
        this.h = (int)(f1 - i2);
        getParent().requestDisallowInterceptTouchEvent(true);
        invalidate();
        return true;
      }
    }
    else if ((paramMotionEvent.getAction() == 1) || (paramMotionEvent.getAction() == 3))
    {
      if (this.f)
      {
        this.f = false;
        return true;
      }
      if (this.g)
      {
        this.g = false;
        return true;
      }
    }
    else if (paramMotionEvent.getAction() == 2)
    {
      if (this.f)
      {
        i3 = (int)(f1 - this.h);
        if (i3 < a.a(16.0F))
          i1 = a.a(16.0F);
        while (true)
        {
          this.b = ((i1 - a.a(16.0F)) / i4);
          if (this.j != null)
            this.j.a(this.b);
          invalidate();
          return true;
          i1 = i2;
          if (i3 > i2)
            continue;
          i1 = i3;
        }
      }
      if (this.g)
      {
        i2 = (int)(f1 - this.h);
        if (i2 < i1);
        while (true)
        {
          this.c = ((i1 - a.a(16.0F)) / i4);
          if (this.j != null)
            this.j.b(this.c);
          invalidate();
          return true;
          i1 = i2;
          if (i2 <= a.a(16.0F) + i4)
            continue;
          i1 = a.a(16.0F) + i4;
        }
      }
    }
    return false;
  }

  public void setDelegate(a parama)
  {
    this.j = parama;
  }

  public void setVideoPath(String paramString)
  {
    this.i = new MediaMetadataRetriever();
    try
    {
      this.i.setDataSource(paramString);
      this.a = Long.parseLong(this.i.extractMetadata(9));
      return;
    }
    catch (Exception paramString)
    {
      n.a("tmessages", paramString);
    }
  }

  public static abstract interface a
  {
    public abstract void a(float paramFloat);

    public abstract void b(float paramFloat);
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.Components.bs
 * JD-Core Version:    0.6.0
 */