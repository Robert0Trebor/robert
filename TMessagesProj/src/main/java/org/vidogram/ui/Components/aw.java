package org.vidogram.ui.Components;

import android.content.Context;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import org.vidogram.messenger.a;
import org.vidogram.messenger.n;
import org.vidogram.messenger.support.widget.RecyclerView;
import org.vidogram.messenger.support.widget.RecyclerView.a;
import org.vidogram.messenger.support.widget.RecyclerView.c;
import org.vidogram.messenger.support.widget.RecyclerView.k;
import org.vidogram.messenger.support.widget.RecyclerView.l;

public class aw extends RecyclerView
{
  private static int[] x;
  private static boolean y;
  private b k;
  private c l;
  private RecyclerView.l m;
  private a n;
  private View o;
  private Runnable p;
  private GestureDetector q;
  private View r;
  private int s;
  private boolean t;
  private boolean u;
  private boolean v;
  private Runnable w;
  private RecyclerView.c z = new RecyclerView.c()
  {
    public void a()
    {
      aw.j(aw.this);
    }

    public void b(int paramInt1, int paramInt2)
    {
      aw.j(aw.this);
    }

    public void c(int paramInt1, int paramInt2)
    {
      aw.j(aw.this);
    }
  };

  public aw(Context paramContext)
  {
    super(paramContext);
    try
    {
      if (!y)
      {
        x = a("com.android.internal", "View");
        y = true;
      }
      TypedArray localTypedArray = paramContext.getTheme().obtainStyledAttributes(x);
      View.class.getDeclaredMethod("initializeScrollbars", new Class[] { TypedArray.class }).invoke(this, new Object[] { localTypedArray });
      localTypedArray.recycle();
      super.setOnScrollListener(new RecyclerView.l()
      {
        public void a(RecyclerView paramRecyclerView, int paramInt)
        {
          MotionEvent localMotionEvent;
          if ((paramInt != 0) && (aw.a(aw.this) != null))
          {
            if (aw.f(aw.this) != null)
            {
              a.b(aw.f(aw.this));
              aw.b(aw.this, null);
            }
            localMotionEvent = MotionEvent.obtain(0L, 0L, 3, 0.0F, 0.0F, 0);
          }
          try
          {
            aw.i(aw.this).onTouchEvent(localMotionEvent);
            aw.a(aw.this).onTouchEvent(localMotionEvent);
            localMotionEvent.recycle();
            aw.a(aw.this).setPressed(false);
            aw.a(aw.this, null);
            aw.a(aw.this, false);
            if (aw.k(aw.this) != null)
              aw.k(aw.this).a(paramRecyclerView, paramInt);
            return;
          }
          catch (Exception localException)
          {
            while (true)
              n.a("tmessages", localException);
          }
        }

        public void a(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
        {
          if (aw.k(aw.this) != null)
            aw.k(aw.this).a(paramRecyclerView, paramInt1, paramInt2);
        }
      });
      a(new d(paramContext));
      return;
    }
    catch (Throwable localThrowable)
    {
      while (true)
        n.a("tmessages", localThrowable);
    }
  }

  private void t()
  {
    int i1 = 0;
    if ((this.o == null) || (getAdapter() == null))
      return;
    int i;
    View localView;
    if (getAdapter().a() == 0)
    {
      i = 1;
      localView = this.o;
      if (i == 0)
        break label66;
    }
    label66: for (int j = 0; ; j = 8)
    {
      localView.setVisibility(j);
      j = i1;
      if (i != 0)
        j = 4;
      setVisibility(j);
      return;
      i = 0;
      break;
    }
  }

  public int[] a(String paramString1, String paramString2)
  {
    try
    {
      paramString1 = Class.forName(paramString1 + ".R$styleable").getField(paramString2);
      if (paramString1 != null)
      {
        paramString1 = (int[])(int[])paramString1.get(null);
        return paramString1;
      }
    }
    catch (Throwable paramString1)
    {
    }
    return null;
  }

  public void b(boolean paramBoolean)
  {
    if (this.p != null)
    {
      a.b(this.p);
      this.p = null;
    }
    if (this.r != null)
    {
      if (paramBoolean)
        this.r.setPressed(false);
      this.r = null;
    }
    if (this.w != null)
    {
      a.b(this.w);
      this.w = null;
    }
    this.t = false;
  }

  public void c()
  {
    try
    {
      super.c();
      return;
    }
    catch (NullPointerException localNullPointerException)
    {
    }
  }

  public View getEmptyView()
  {
    return this.o;
  }

  public boolean hasOverlappingRendering()
  {
    return false;
  }

  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    if (this.u)
      requestDisallowInterceptTouchEvent(true);
    return ((this.n != null) && (this.n.a(paramMotionEvent))) || (super.onInterceptTouchEvent(paramMotionEvent));
  }

  public void s()
  {
    int j = getChildCount();
    int i = 0;
    while (i < j)
    {
      getChildAt(i).invalidate();
      i += 1;
    }
  }

  public void setAdapter(RecyclerView.a parama)
  {
    RecyclerView.a locala = getAdapter();
    if (locala != null)
      locala.b(this.z);
    super.setAdapter(parama);
    if (parama != null)
      parama.a(this.z);
    t();
  }

  public void setDisallowInterceptTouchEvents(boolean paramBoolean)
  {
    this.u = paramBoolean;
  }

  public void setEmptyView(View paramView)
  {
    if (this.o == paramView)
      return;
    this.o = paramView;
    t();
  }

  public void setInstantClick(boolean paramBoolean)
  {
    this.v = paramBoolean;
  }

  public void setOnInterceptTouchListener(a parama)
  {
    this.n = parama;
  }

  public void setOnItemClickListener(b paramb)
  {
    this.k = paramb;
  }

  public void setOnItemLongClickListener(c paramc)
  {
    this.l = paramc;
  }

  public void setOnScrollListener(RecyclerView.l paraml)
  {
    this.m = paraml;
  }

  public void setVerticalScrollBarEnabled(boolean paramBoolean)
  {
    if (x != null)
      super.setVerticalScrollBarEnabled(paramBoolean);
  }

  public static abstract interface a
  {
    public abstract boolean a(MotionEvent paramMotionEvent);
  }

  public static abstract interface b
  {
    public abstract void a(View paramView, int paramInt);
  }

  public static abstract interface c
  {
    public abstract boolean a(View paramView, int paramInt);
  }

  private class d
    implements RecyclerView.k
  {
    public d(Context arg2)
    {
      Context localContext;
      aw.a(aw.this, new GestureDetector(localContext, new GestureDetector.SimpleOnGestureListener(aw.this)
      {
        public void onLongPress(MotionEvent paramMotionEvent)
        {
          if (aw.a(aw.this) != null)
          {
            paramMotionEvent = aw.a(aw.this);
            if ((aw.g(aw.this) != null) && (aw.g(aw.this).a(aw.a(aw.this), aw.d(aw.this))))
              paramMotionEvent.performHapticFeedback(0);
          }
        }

        public boolean onSingleTapUp(MotionEvent paramMotionEvent)
        {
          if ((aw.a(aw.this) != null) && (aw.b(aw.this) != null))
          {
            aw.a(aw.this).setPressed(true);
            paramMotionEvent = aw.a(aw.this);
            if (aw.c(aw.this))
            {
              paramMotionEvent.playSoundEffect(0);
              aw.b(aw.this).a(paramMotionEvent, aw.d(aw.this));
            }
            a.a(aw.a(aw.this, new Runnable(paramMotionEvent)
            {
              public void run()
              {
                if (this == aw.e(aw.this))
                  aw.a(aw.this, null);
                if (this.a != null)
                {
                  this.a.setPressed(false);
                  if (!aw.c(aw.this))
                  {
                    this.a.playSoundEffect(0);
                    if (aw.b(aw.this) != null)
                      aw.b(aw.this).a(this.a, aw.d(aw.this));
                  }
                }
              }
            }), ViewConfiguration.getPressedStateDuration());
            if (aw.f(aw.this) != null)
            {
              a.b(aw.f(aw.this));
              aw.b(aw.this, null);
              aw.a(aw.this, null);
              aw.a(aw.this, false);
            }
          }
          return true;
        }
      }));
    }

    public void a(boolean paramBoolean)
    {
      aw.this.b(true);
    }

    public boolean a(RecyclerView paramRecyclerView, MotionEvent paramMotionEvent)
    {
      int k = paramMotionEvent.getActionMasked();
      int i;
      if (aw.this.getScrollState() == 0)
        i = 1;
      while (true)
      {
        int j;
        if (((k == 0) || (k == 5)) && (aw.a(aw.this) == null) && (i != 0))
        {
          aw.a(aw.this, paramRecyclerView.a(paramMotionEvent.getX(), paramMotionEvent.getY()));
          if ((aw.a(aw.this) instanceof ViewGroup))
          {
            ViewGroup localViewGroup = (ViewGroup)aw.a(aw.this);
            float f1 = paramMotionEvent.getX() - aw.a(aw.this).getLeft();
            float f2 = paramMotionEvent.getY() - aw.a(aw.this).getTop();
            j = localViewGroup.getChildCount() - 1;
            if (j >= 0)
            {
              View localView = localViewGroup.getChildAt(j);
              if ((f1 < localView.getLeft()) || (f1 > localView.getRight()) || (f2 < localView.getTop()) || (f2 > localView.getBottom()) || (!localView.isClickable()))
                break label424;
              aw.a(aw.this, null);
            }
          }
          aw.a(aw.this, -1);
          if (aw.a(aw.this) != null)
          {
            aw.a(aw.this, paramRecyclerView.e(aw.a(aw.this)));
            paramRecyclerView = MotionEvent.obtain(0L, 0L, paramMotionEvent.getActionMasked(), paramMotionEvent.getX() - aw.a(aw.this).getLeft(), paramMotionEvent.getY() - aw.a(aw.this).getTop(), 0);
            if (aw.a(aw.this).onTouchEvent(paramRecyclerView))
              aw.a(aw.this, true);
            paramRecyclerView.recycle();
          }
        }
        if ((aw.a(aw.this) != null) && (!aw.h(aw.this)) && (paramMotionEvent != null));
        try
        {
          aw.i(aw.this).onTouchEvent(paramMotionEvent);
          if ((k == 0) || (k == 5))
          {
            if ((!aw.h(aw.this)) && (aw.a(aw.this) != null))
            {
              aw.b(aw.this, new Runnable()
              {
                public void run()
                {
                  if ((aw.f(aw.this) != null) && (aw.a(aw.this) != null))
                  {
                    aw.a(aw.this).setPressed(true);
                    aw.b(aw.this, null);
                  }
                }
              });
              a.a(aw.f(aw.this), ViewConfiguration.getTapTimeout());
            }
            return false;
            i = 0;
            continue;
            label424: j -= 1;
          }
        }
        catch (Exception paramRecyclerView)
        {
          while (true)
          {
            n.a("tmessages", paramRecyclerView);
            continue;
            if ((aw.a(aw.this) == null) || ((k != 1) && (k != 6) && (k != 3) && (i != 0)))
              continue;
            if (aw.f(aw.this) != null)
            {
              a.b(aw.f(aw.this));
              aw.b(aw.this, null);
            }
            aw.a(aw.this).setPressed(false);
            aw.a(aw.this, null);
            aw.a(aw.this, false);
          }
        }
      }
    }

    public void b(RecyclerView paramRecyclerView, MotionEvent paramMotionEvent)
    {
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.Components.aw
 * JD-Core Version:    0.6.0
 */