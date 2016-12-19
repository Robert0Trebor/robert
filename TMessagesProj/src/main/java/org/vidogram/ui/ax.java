package org.vidogram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.os.Build.VERSION;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.widget.AbsListView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import org.vidogram.messenger.a;
import org.vidogram.messenger.n;
import org.vidogram.messenger.q;
import org.vidogram.tgnet.g.az;
import org.vidogram.tgnet.g.q;
import org.vidogram.ui.Components.aw.b;
import org.vidogram.ui.Components.v;
import org.vidogram.ui.c.av;
import org.vidogram.ui.c.m;

public class ax
{
  private static volatile ax p = null;
  private int a;
  private int b;
  private View c;
  private Runnable d;
  private ColorDrawable e = new ColorDrawable(1895825408);
  private Activity f;
  private WindowManager.LayoutParams g;
  private FrameLayout h;
  private a i;
  private q j = new q();
  private boolean k = false;
  private float l;
  private long m;
  private int n = a.a(200.0F);
  private g.q o = null;

  public static ax a()
  {
    Object localObject1 = p;
    if (localObject1 == null)
    {
      monitorenter;
      try
      {
        ax localax = p;
        localObject1 = localax;
        if (localax == null)
        {
          localObject1 = new ax();
          p = (ax)localObject1;
        }
        return localObject1;
      }
      finally
      {
        monitorexit;
      }
    }
    return (ax)localObject2;
  }

  private void a(Canvas paramCanvas)
  {
    if ((this.i == null) || (this.e == null));
    do
    {
      do
      {
        return;
        this.e.setAlpha((int)(180.0F * this.l));
        this.e.setBounds(0, 0, this.i.getWidth(), this.i.getHeight());
        this.e.draw(paramCanvas);
        paramCanvas.save();
        int i1 = (int)(Math.min(this.i.getWidth(), this.i.getHeight()) / 1.8F);
        paramCanvas.translate(this.i.getWidth() / 2, Math.max(i1 / 2 + a.a, (this.i.getHeight() - this.n) / 2));
        if (this.j.h() != null)
        {
          float f1 = this.l * 0.8F / 0.8F;
          i1 = (int)(i1 * f1);
          this.j.a(this.l);
          this.j.a(-i1 / 2, -i1 / 2, i1, i1);
          this.j.a(paramCanvas);
        }
        paramCanvas.restore();
      }
      while (this.l == 1.0F);
      long l1 = System.currentTimeMillis();
      long l2 = this.m;
      this.m = l1;
      this.l += (float)(l1 - l2) / 150.0F;
      this.i.invalidate();
    }
    while (this.l <= 1.0F);
    this.l = 1.0F;
  }

  public void a(int paramInt)
  {
    this.n = paramInt;
  }

  public void a(Activity paramActivity)
  {
    if (this.f == paramActivity)
      return;
    this.f = paramActivity;
    this.h = new FrameLayout(paramActivity);
    this.h.setFocusable(true);
    this.h.setFocusableInTouchMode(true);
    if (Build.VERSION.SDK_INT >= 23)
      this.h.setFitsSystemWindows(true);
    this.i = new a(paramActivity);
    this.i.setFocusable(false);
    this.h.addView(this.i, v.b(-1, -1, 51));
    this.i.setOnTouchListener(new View.OnTouchListener()
    {
      public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
      {
        if ((paramMotionEvent.getAction() == 1) || (paramMotionEvent.getAction() == 6) || (paramMotionEvent.getAction() == 3))
          ax.this.d();
        return true;
      }
    });
    this.g = new WindowManager.LayoutParams();
    this.g.height = -1;
    this.g.format = -3;
    this.g.width = -1;
    this.g.gravity = 48;
    this.g.type = 99;
    if (Build.VERSION.SDK_INT >= 21);
    for (this.g.flags = -2147483640; ; this.g.flags = 8)
    {
      this.j.c(true);
      this.j.b(true);
      this.j.a(this.i);
      return;
    }
  }

  public void a(g.q paramq)
  {
    if ((this.f == null) || (paramq == null));
    do
    {
      return;
      this.j.a(paramq, null, paramq.i.c, null, "webp", true);
      this.o = paramq;
      this.i.invalidate();
    }
    while (this.k);
    a.a(this.f);
    try
    {
      if (this.h.getParent() != null)
        ((WindowManager)this.f.getSystemService("window")).removeView(this.h);
      ((WindowManager)this.f.getSystemService("window")).addView(this.h, this.g);
      this.k = true;
      this.l = 0.0F;
      this.m = System.currentTimeMillis();
      return;
    }
    catch (Exception paramq)
    {
      while (true)
        n.a("tmessages", paramq);
    }
  }

  public boolean a(MotionEvent paramMotionEvent, View paramView, int paramInt)
  {
    int i3;
    int i4;
    int i1;
    if (paramMotionEvent.getAction() == 0)
    {
      i3 = (int)paramMotionEvent.getX();
      i4 = (int)paramMotionEvent.getY();
      if (!(paramView instanceof AbsListView))
        break label72;
      i1 = ((AbsListView)paramView).getChildCount();
    }
    while (true)
    {
      int i2 = 0;
      label40: if (i2 < i1)
      {
        paramMotionEvent = null;
        if (!(paramView instanceof AbsListView))
          break label91;
        paramMotionEvent = ((AbsListView)paramView).getChildAt(i2);
        label66: if (paramMotionEvent != null)
          break label111;
      }
      while (true)
      {
        return false;
        label72: if (!(paramView instanceof org.vidogram.ui.Components.aw))
          break label302;
        i1 = ((org.vidogram.ui.Components.aw)paramView).getChildCount();
        break;
        label91: if (!(paramView instanceof org.vidogram.ui.Components.aw))
          break label66;
        paramMotionEvent = ((org.vidogram.ui.Components.aw)paramView).getChildAt(i2);
        break label66;
        label111: int i5 = paramMotionEvent.getTop();
        int i6 = paramMotionEvent.getBottom();
        int i7 = paramMotionEvent.getLeft();
        int i8 = paramMotionEvent.getRight();
        if ((i5 > i4) || (i6 < i4) || (i7 > i3) || (i8 < i3))
        {
          i2 += 1;
          break label40;
        }
        boolean bool;
        if ((paramMotionEvent instanceof org.vidogram.ui.c.aw))
          bool = ((org.vidogram.ui.c.aw)paramMotionEvent).c();
        while (bool)
        {
          this.a = i3;
          this.b = i4;
          this.c = paramMotionEvent;
          this.d = new Runnable(paramView, paramInt)
          {
            public void run()
            {
              if (ax.a(ax.this) == null);
              do
              {
                return;
                if ((this.a instanceof AbsListView))
                {
                  ((AbsListView)this.a).setOnItemClickListener(null);
                  ((AbsListView)this.a).requestDisallowInterceptTouchEvent(true);
                }
                while (true)
                {
                  ax.a(ax.this, null);
                  ax.this.a((Activity)this.a.getContext());
                  ax.this.a(this.b);
                  if (!(ax.b(ax.this) instanceof org.vidogram.ui.c.aw))
                    break;
                  ax.this.a(((org.vidogram.ui.c.aw)ax.b(ax.this)).getSticker());
                  ((org.vidogram.ui.c.aw)ax.b(ax.this)).setScaled(true);
                  return;
                  if (!(this.a instanceof org.vidogram.ui.Components.aw))
                    continue;
                  ((org.vidogram.ui.Components.aw)this.a).setOnItemClickListener(null);
                  ((org.vidogram.ui.Components.aw)this.a).requestDisallowInterceptTouchEvent(true);
                }
                if (!(ax.b(ax.this) instanceof av))
                  continue;
                ax.this.a(((av)ax.b(ax.this)).getSticker());
                ((av)ax.b(ax.this)).setScaled(true);
                return;
              }
              while (!(ax.b(ax.this) instanceof m));
              ax.this.a(((m)ax.b(ax.this)).getDocument());
              ((m)ax.b(ax.this)).setScaled(true);
            }
          };
          a.a(this.d, 200L);
          return true;
          if ((paramMotionEvent instanceof av))
          {
            bool = ((av)paramMotionEvent).a();
            continue;
          }
          if ((paramMotionEvent instanceof m))
          {
            m localm = (m)paramMotionEvent;
            if ((localm.a()) && (localm.b()))
            {
              bool = true;
              continue;
            }
            bool = false;
            continue;
          }
          bool = false;
        }
      }
      label302: i1 = 0;
    }
  }

  public boolean a(MotionEvent paramMotionEvent, View paramView, int paramInt, Object paramObject)
  {
    if ((this.d != null) || (c()))
    {
      if ((paramMotionEvent.getAction() != 1) && (paramMotionEvent.getAction() != 3) && (paramMotionEvent.getAction() != 6))
        break label172;
      a.a(new Runnable(paramView, paramObject)
      {
        public void run()
        {
          if ((this.a instanceof AbsListView))
            ((AbsListView)this.a).setOnItemClickListener((AdapterView.OnItemClickListener)this.b);
          do
            return;
          while (!(this.a instanceof org.vidogram.ui.Components.aw));
          ((org.vidogram.ui.Components.aw)this.a).setOnItemClickListener((aw.b)this.b);
        }
      }
      , 150L);
      if (this.d == null)
        break label77;
      a.b(this.d);
      this.d = null;
    }
    label77: 
    do
    {
      do
      {
        do
          return false;
        while (!c());
        d();
      }
      while (this.c == null);
      if ((this.c instanceof org.vidogram.ui.c.aw))
        ((org.vidogram.ui.c.aw)this.c).setScaled(false);
      while (true)
      {
        this.c = null;
        break;
        if ((this.c instanceof av))
        {
          ((av)this.c).setScaled(false);
          continue;
        }
        if (!(this.c instanceof m))
          continue;
        ((m)this.c).setScaled(false);
      }
    }
    while (paramMotionEvent.getAction() == 0);
    label172: int i3;
    int i4;
    int i1;
    if (c())
      if (paramMotionEvent.getAction() == 2)
      {
        i3 = (int)paramMotionEvent.getX();
        i4 = (int)paramMotionEvent.getY();
        if ((paramView instanceof AbsListView))
          i1 = ((AbsListView)paramView).getChildCount();
      }
    while (true)
    {
      int i2 = 0;
      while (true)
      {
        if (i2 >= i1)
          break label385;
        paramMotionEvent = null;
        if ((paramView instanceof AbsListView))
          paramMotionEvent = ((AbsListView)paramView).getChildAt(i2);
        while (true)
        {
          if (paramMotionEvent != null)
            break label298;
          return false;
          if (!(paramView instanceof org.vidogram.ui.Components.aw))
            break label692;
          i1 = ((org.vidogram.ui.Components.aw)paramView).getChildCount();
          break;
          if (!(paramView instanceof org.vidogram.ui.Components.aw))
            continue;
          paramMotionEvent = ((org.vidogram.ui.Components.aw)paramView).getChildAt(i2);
        }
        label298: int i5 = paramMotionEvent.getTop();
        int i6 = paramMotionEvent.getBottom();
        int i7 = paramMotionEvent.getLeft();
        int i8 = paramMotionEvent.getRight();
        if ((i5 <= i4) && (i6 >= i4) && (i7 <= i3) && (i8 >= i3))
          break label359;
        i2 += 1;
      }
      label359: boolean bool = false;
      if ((paramMotionEvent instanceof org.vidogram.ui.c.aw))
        bool = true;
      while ((!bool) || (paramMotionEvent == this.c))
      {
        label385: return true;
        if ((paramMotionEvent instanceof av))
        {
          bool = true;
          continue;
        }
        if (!(paramMotionEvent instanceof m))
          continue;
        bool = ((m)paramMotionEvent).a();
      }
      if ((this.c instanceof org.vidogram.ui.c.aw))
      {
        ((org.vidogram.ui.c.aw)this.c).setScaled(false);
        this.c = paramMotionEvent;
        a(paramInt);
        if (!(this.c instanceof org.vidogram.ui.c.aw))
          break label535;
        a(((org.vidogram.ui.c.aw)this.c).getSticker());
        ((org.vidogram.ui.c.aw)this.c).setScaled(true);
      }
      while (true)
      {
        return true;
        if ((this.c instanceof av))
        {
          ((av)this.c).setScaled(false);
          break;
        }
        if (!(this.c instanceof m))
          break;
        ((m)this.c).setScaled(false);
        break;
        label535: if ((this.c instanceof av))
        {
          a(((av)this.c).getSticker());
          ((av)this.c).setScaled(true);
          continue;
        }
        if (!(this.c instanceof m))
          continue;
        a(((m)this.c).getDocument());
        ((m)this.c).setScaled(true);
      }
      if (this.d == null)
        break;
      if (paramMotionEvent.getAction() == 2)
      {
        if (Math.hypot(this.a - paramMotionEvent.getX(), this.b - paramMotionEvent.getY()) <= a.a(10.0F))
          break;
        a.b(this.d);
        this.d = null;
        break;
      }
      a.b(this.d);
      this.d = null;
      break;
      label692: i1 = 0;
    }
  }

  public void b()
  {
    if (this.d != null)
    {
      a.b(this.d);
      this.d = null;
    }
    if (this.c != null)
    {
      if (!(this.c instanceof org.vidogram.ui.c.aw))
        break label53;
      ((org.vidogram.ui.c.aw)this.c).setScaled(false);
    }
    while (true)
    {
      this.c = null;
      return;
      label53: if ((this.c instanceof av))
      {
        ((av)this.c).setScaled(false);
        continue;
      }
      if (!(this.c instanceof m))
        continue;
      ((m)this.c).setScaled(false);
    }
  }

  public boolean c()
  {
    return this.k;
  }

  public void d()
  {
    if (this.f == null);
    while (true)
    {
      return;
      this.l = 1.0F;
      this.o = null;
      this.k = false;
      a.b(this.f);
      a.a(new Runnable()
      {
        public void run()
        {
          ax.c(ax.this).a((Bitmap)null);
        }
      });
      try
      {
        if (this.h.getParent() == null)
          continue;
        ((WindowManager)this.f.getSystemService("window")).removeView(this.h);
        return;
      }
      catch (Exception localException)
      {
        n.a("tmessages", localException);
      }
    }
  }

  public void e()
  {
    this.k = false;
    this.o = null;
    if ((this.f == null) || (this.h == null))
      return;
    try
    {
      if (this.h.getParent() != null)
        ((WindowManager)this.f.getSystemService("window")).removeViewImmediate(this.h);
      this.h = null;
      p = null;
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
      ax.a(ax.a(), paramCanvas);
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.ax
 * JD-Core Version:    0.6.0
 */