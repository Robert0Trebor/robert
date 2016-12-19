package org.vidogram.ui.Components;

import android.annotation.TargetApi;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.f;
import android.support.v4.view.aa;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnKeyListener;
import android.view.View.OnLongClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import org.vidogram.messenger.Utilities;
import org.vidogram.messenger.a;
import org.vidogram.messenger.d.g;
import org.vidogram.messenger.j;
import org.vidogram.messenger.k;
import org.vidogram.messenger.n;
import org.vidogram.messenger.support.widget.RecyclerView;
import org.vidogram.messenger.support.widget.RecyclerView.a;
import org.vidogram.messenger.support.widget.RecyclerView.g;
import org.vidogram.messenger.support.widget.RecyclerView.h;
import org.vidogram.messenger.support.widget.RecyclerView.l;
import org.vidogram.messenger.support.widget.RecyclerView.r;
import org.vidogram.messenger.support.widget.RecyclerView.u;
import org.vidogram.messenger.support.widget.d;
import org.vidogram.messenger.support.widget.d.c;
import org.vidogram.messenger.y;
import org.vidogram.messenger.y.b;
import org.vidogram.tgnet.g.az;
import org.vidogram.tgnet.g.be;
import org.vidogram.tgnet.g.bf;
import org.vidogram.tgnet.g.hz;
import org.vidogram.tgnet.g.ie;
import org.vidogram.tgnet.g.q;
import org.vidogram.tgnet.g.r;
import org.vidogram.tgnet.g.rg;
import org.vidogram.ui.c.m;
import org.vidogram.ui.c.t;

public class p extends FrameLayout
  implements y.b
{
  private static final Field a;
  private static final ViewTreeObserver.OnScrollChangedListener b;
  private static HashMap<String, String> e;
  private aw A;
  private d B;
  private j C;
  private aw.b D;
  private ad E;
  private HashMap<Long, g.bf> F = new HashMap();
  private HashMap<Long, g.bf> G = new HashMap();
  private boolean H;
  private int I;
  private a J;
  private d K;
  private int L;
  private int M;
  private int N;
  private int[] O = new int[2];
  private int P;
  private int Q = -2;
  private int R = -2;
  private int S = -2;
  private boolean T;
  private boolean U;
  private int V = -1;
  private Object W;
  private int aa;
  private int ab;
  private boolean ac;
  private boolean ad;
  private boolean ae;
  private int af;
  private ArrayList<b> c = new ArrayList();
  private HashMap<String, Integer> d = new HashMap();
  private ArrayList<String> f = new ArrayList();
  private ArrayList<g.rg> g = new ArrayList();
  private ArrayList<g.q> h = new ArrayList();
  private ArrayList<g.q> i = new ArrayList();
  private Drawable j;
  private int[] k = { 2130837831, 2130837832, 2130837830, 2130837828, 2130837829, 2130837833, 2130837888 };
  private h l;
  private ViewPager m;
  private FrameLayout n;
  private ArrayList<View> o = new ArrayList();
  private ArrayList<GridView> p = new ArrayList();
  private ImageView q;
  private i r;
  private LinearLayout s;
  private ax t;
  private aw u;
  private d v;
  private TextView w;
  private aw x;
  private r y;
  private e z;

  static
  {
    Object localObject = null;
    try
    {
      Field localField = PopupWindow.class.getDeclaredField("mOnScrollChangedListener");
      localObject = localField;
      localField.setAccessible(true);
      localObject = localField;
      label19: a = localObject;
      b = new ViewTreeObserver.OnScrollChangedListener()
      {
        public void onScrollChanged()
        {
        }
      };
      e = new HashMap();
      return;
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      break label19;
    }
  }

  public p(boolean paramBoolean1, boolean paramBoolean2, Context paramContext)
  {
    super(paramContext);
    this.ae = paramBoolean2;
    this.j = paramContext.getResources().getDrawable(2130837635);
    if (Build.VERSION.SDK_INT >= 21)
      this.W = new ViewOutlineProvider()
      {
        @TargetApi(21)
        public void getOutline(View paramView, Outline paramOutline)
        {
          paramOutline.setRoundRect(paramView.getPaddingLeft(), paramView.getPaddingTop(), paramView.getMeasuredWidth() - paramView.getPaddingRight(), paramView.getMeasuredHeight() - paramView.getPaddingBottom(), a.a(6.0F));
        }
      };
    int i1 = 0;
    if (i1 < k.d.length + 1)
    {
      localObject1 = new GridView(paramContext);
      if (a.c())
        ((GridView)localObject1).setColumnWidth(a.a(60.0F));
      while (true)
      {
        ((GridView)localObject1).setNumColumns(-1);
        localObject2 = new b(i1 - 1);
        a.a((AbsListView)localObject1, -657673);
        ((GridView)localObject1).setAdapter((ListAdapter)localObject2);
        this.c.add(localObject2);
        this.p.add(localObject1);
        localObject2 = new FrameLayout(paramContext);
        ((FrameLayout)localObject2).addView((View)localObject1, v.a(-1, -1.0F, 51, 0.0F, 48.0F, 0.0F, 0.0F));
        this.o.add(localObject2);
        i1 += 1;
        break;
        ((GridView)localObject1).setColumnWidth(a.a(45.0F));
      }
    }
    if (paramBoolean1)
    {
      this.n = new FrameLayout(paramContext);
      g.a(0);
      g.b();
      this.u = new aw(paramContext)
      {
        public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
        {
          boolean bool = org.vidogram.ui.ax.a().a(paramMotionEvent, p.o(p.this), p.this.getMeasuredHeight());
          return (super.onInterceptTouchEvent(paramMotionEvent)) || (bool);
        }

        public void setVisibility(int paramInt)
        {
          if (((p.p(p.this) != null) && (p.p(p.this).getVisibility() == 0)) || ((p.q(p.this) != null) && (p.q(p.this).getVisibility() == 0)))
          {
            super.setVisibility(8);
            return;
          }
          super.setVisibility(paramInt);
        }
      };
      localObject1 = this.u;
      localObject2 = new d(paramContext, 5);
      this.v = ((d)localObject2);
      ((aw)localObject1).setLayoutManager((RecyclerView.h)localObject2);
      this.v.a(new d.c()
      {
        public int a(int paramInt)
        {
          if (paramInt == p.i.a(p.r(p.this)))
            return p.i.b(p.r(p.this));
          return 1;
        }
      });
      this.u.setPadding(0, a.a(52.0F), 0, 0);
      this.u.setClipToPadding(false);
      this.o.add(this.n);
      localObject1 = this.u;
      localObject2 = new i(paramContext);
      this.r = ((i)localObject2);
      ((aw)localObject1).setAdapter((RecyclerView.a)localObject2);
      this.u.setOnTouchListener(new View.OnTouchListener()
      {
        public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
        {
          return org.vidogram.ui.ax.a().a(paramMotionEvent, p.o(p.this), p.this.getMeasuredHeight(), p.s(p.this));
        }
      });
      this.D = new aw.b()
      {
        public void a(View paramView, int paramInt)
        {
          if (!(paramView instanceof org.vidogram.ui.c.aw));
          do
          {
            return;
            org.vidogram.ui.ax.a().b();
            paramView = (org.vidogram.ui.c.aw)paramView;
          }
          while (paramView.b());
          paramView.a();
          p.h(p.this).a(paramView.getSticker());
        }
      };
      this.u.setOnItemClickListener(this.D);
      this.u.setGlowColor(-657673);
      this.n.addView(this.u);
      this.A = new aw(paramContext);
      this.A.setItemAnimator(null);
      this.A.setLayoutAnimation(null);
      localObject1 = this.A;
      localObject2 = new d(paramContext, 5)
      {
        public boolean c()
        {
          return false;
        }
      };
      this.B = ((d)localObject2);
      ((aw)localObject1).setLayoutManager((RecyclerView.h)localObject2);
      this.B.a(new d.c()
      {
        public int a(int paramInt)
        {
          if (((p.j.a(p.t(p.this)).get(Integer.valueOf(paramInt)) instanceof Integer)) || (paramInt == p.j.b(p.t(p.this))))
            return p.j.c(p.t(p.this));
          return 1;
        }
      });
      this.A.setOnScrollListener(new RecyclerView.l()
      {
        public void a(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
        {
          p.a(p.this, paramRecyclerView, paramInt2);
        }
      });
      this.A.setClipToPadding(false);
      this.A.setPadding(0, a.a(48.0F), 0, 0);
      localObject1 = this.A;
      localObject2 = new j(paramContext);
      this.C = ((j)localObject2);
      ((aw)localObject1).setAdapter((RecyclerView.a)localObject2);
      this.A.setOnItemClickListener(new aw.b()
      {
        public void a(View paramView, int paramInt)
        {
          paramView = (g.bf)p.j.d(p.t(p.this)).get(Integer.valueOf(paramInt));
          if (paramView != null)
            p.h(p.this).a(paramView);
        }
      });
      this.C.c();
      this.A.setGlowColor(-657673);
      this.A.setVisibility(8);
      this.n.addView(this.A);
      if (paramBoolean2)
      {
        this.x = new aw(paramContext);
        this.x.setClipToPadding(false);
        this.x.setPadding(0, a.a(48.0F), 0, 0);
        localObject1 = this.x;
        localObject2 = new r(paramContext, 100)
        {
          private bf u = new bf();

          protected bf l(int paramInt)
          {
            float f2 = 100.0F;
            g.q localq = (g.q)p.u(p.this).get(paramInt);
            Object localObject = this.u;
            float f1;
            if ((localq.i != null) && (localq.i.d != 0))
            {
              f1 = localq.i.d;
              ((bf)localObject).a = f1;
              localObject = this.u;
              f1 = f2;
              if (localq.i != null)
              {
                f1 = f2;
                if (localq.i.e != 0)
                  f1 = localq.i.e;
              }
              ((bf)localObject).b = f1;
              paramInt = 0;
            }
            while (true)
            {
              if (paramInt < localq.o.size())
              {
                localObject = (g.r)localq.o.get(paramInt);
                if (((localObject instanceof g.hz)) || ((localObject instanceof g.ie)))
                {
                  this.u.a = ((g.r)localObject).h;
                  this.u.b = ((g.r)localObject).i;
                }
              }
              else
              {
                return this.u;
                f1 = 100.0F;
                break;
              }
              paramInt += 1;
            }
          }
        };
        this.y = ((r)localObject2);
        ((aw)localObject1).setLayoutManager((RecyclerView.h)localObject2);
        this.y.a(new d.c()
        {
          public int a(int paramInt)
          {
            return p.v(p.this).m(paramInt);
          }
        });
        this.x.a(new RecyclerView.g()
        {
          public void a(Rect paramRect, View paramView, RecyclerView paramRecyclerView, RecyclerView.r paramr)
          {
            int i = 0;
            paramRect.left = 0;
            paramRect.top = 0;
            paramRect.bottom = 0;
            int j = paramRecyclerView.f(paramView);
            if (!p.v(p.this).p(j))
              paramRect.top = a.a(2.0F);
            if (p.v(p.this).o(j));
            while (true)
            {
              paramRect.right = i;
              return;
              i = a.a(2.0F);
            }
          }
        });
        this.x.setOverScrollMode(2);
        localObject1 = this.x;
        localObject2 = new e(paramContext);
        this.z = ((e)localObject2);
        ((aw)localObject1).setAdapter((RecyclerView.a)localObject2);
        this.x.setOnScrollListener(new RecyclerView.l()
        {
          public void a(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
          {
            p.a(p.this, paramRecyclerView, paramInt2);
          }
        });
        this.x.setOnItemClickListener(new aw.b()
        {
          public void a(View paramView, int paramInt)
          {
            if ((paramInt < 0) || (paramInt >= p.u(p.this).size()) || (p.h(p.this) == null))
              return;
            p.h(p.this).b((g.q)p.u(p.this).get(paramInt));
          }
        });
        this.x.setOnItemLongClickListener(new aw.c()
        {
          public boolean a(View paramView, int paramInt)
          {
            if ((paramInt < 0) || (paramInt >= p.u(p.this).size()))
              return false;
            g.q localq = (g.q)p.u(p.this).get(paramInt);
            paramView = new AlertDialog.Builder(paramView.getContext());
            paramView.setTitle(org.vidogram.messenger.r.a("AppName", 2131230856));
            paramView.setMessage(org.vidogram.messenger.r.a("DeleteGif", 2131231129));
            paramView.setPositiveButton(org.vidogram.messenger.r.a("OK", 2131231604).toUpperCase(), new DialogInterface.OnClickListener(localq)
            {
              public void onClick(DialogInterface paramDialogInterface, int paramInt)
              {
                g.a(this.a);
                p.a(p.this, g.c());
                if (p.w(p.this) != null)
                  p.w(p.this).c();
                if (p.u(p.this).isEmpty())
                  p.x(p.this);
              }
            });
            paramView.setNegativeButton(org.vidogram.messenger.r.a("Cancel", 2131230943), null);
            paramView.show().setCanceledOnTouchOutside(true);
            return true;
          }
        });
        this.x.setVisibility(8);
        this.n.addView(this.x);
      }
      this.w = new TextView(paramContext);
      this.w.setText(org.vidogram.messenger.r.a("NoStickers", 2131231517));
      this.w.setTextSize(1, 18.0F);
      this.w.setTextColor(-7829368);
      this.n.addView(this.w, v.a(-2, -2.0F, 17, 0.0F, 48.0F, 0.0F, 0.0F));
      this.u.setEmptyView(this.w);
      this.t = new ax(paramContext)
      {
        boolean a;
        float b;
        float c;
        boolean d = true;

        public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
        {
          if (getParent() != null)
            getParent().requestDisallowInterceptTouchEvent(true);
          return super.onInterceptTouchEvent(paramMotionEvent);
        }

        public boolean onTouchEvent(MotionEvent paramMotionEvent)
        {
          int j = 0;
          if (this.d)
          {
            this.d = false;
            this.b = paramMotionEvent.getX();
          }
          float f = p.y(p.this).getTranslationX();
          if ((p.y(p.this).getScrollX() == 0) && (f == 0.0F))
          {
            if ((this.a) || (this.b - paramMotionEvent.getX() >= 0.0F))
              break label220;
            if (p.g(p.this).d())
            {
              this.a = true;
              this.c = p.y(p.this).getTranslationX();
            }
          }
          int i;
          if (this.a)
            i = (int)(paramMotionEvent.getX() - this.b + f - this.c);
          while (true)
          {
            try
            {
              p.g(p.this).b(i);
              this.c = f;
              this.b = paramMotionEvent.getX();
              if ((paramMotionEvent.getAction() != 3) && (paramMotionEvent.getAction() != 1))
                continue;
              this.d = true;
              if (!this.a)
                continue;
              p.g(p.this).e();
              this.a = false;
              if ((!this.a) && (!super.onTouchEvent(paramMotionEvent)))
                continue;
              j = 1;
              return j;
              label220: if ((!this.a) || (this.b - paramMotionEvent.getX() <= 0.0F) || (!p.g(p.this).f()))
                break;
              p.g(p.this).e();
              this.a = false;
            }
            catch (Exception localException1)
            {
            }
            try
            {
              p.g(p.this).e();
              label284: this.a = false;
              n.a("tmessages", localException1);
            }
            catch (Exception localException2)
            {
              break label284;
            }
          }
        }
      };
      this.t.setUnderlineHeight(a.a(1.0F));
      this.t.setIndicatorColor(-1907225);
      this.t.setUnderlineColor(-1907225);
      this.t.setBackgroundColor(-657673);
      this.t.setVisibility(4);
      addView(this.t, v.b(-1, 48, 51));
      this.t.setTranslationX(a.c.x);
      p();
      this.t.setDelegate(new ax.a()
      {
        public void a(int paramInt)
        {
          int i = 8;
          if (p.p(p.this) != null)
          {
            if (paramInt != p.z(p.this) + 1)
              break label75;
            if (p.p(p.this).getVisibility() != 0)
            {
              p.h(p.this).a(true);
              p.A(p.this);
            }
          }
          if (paramInt == 0)
            p.g(p.this).setCurrentItem(0);
          label75: 
          do
          {
            Object localObject;
            do
            {
              return;
              if (paramInt == p.B(p.this) + 1)
              {
                if (p.q(p.this).getVisibility() == 0)
                  break;
                p.C(p.this);
                break;
              }
              if (p.p(p.this).getVisibility() == 0)
              {
                p.h(p.this).a(false);
                p.p(p.this).setVisibility(8);
                p.o(p.this).setVisibility(0);
                localObject = p.D(p.this);
                if (p.r(p.this).a() != 0);
                while (true)
                {
                  ((TextView)localObject).setVisibility(i);
                  p.E(p.this);
                  break;
                  i = 0;
                }
              }
              if (p.q(p.this).getVisibility() != 0)
                break;
              p.q(p.this).setVisibility(8);
              p.o(p.this).setVisibility(0);
              localObject = p.D(p.this);
              if (p.r(p.this).a() != 0);
              while (true)
              {
                ((TextView)localObject).setVisibility(i);
                p.E(p.this);
                break;
                i = 0;
              }
            }
            while ((paramInt == p.z(p.this) + 1) || (paramInt == p.B(p.this) + 1));
            if (paramInt == p.F(p.this) + 1)
            {
              p.G(p.this).a(0, 0);
              p.a(p.this, null, 0);
              localObject = p.y(p.this);
              i = p.F(p.this);
              if (p.F(p.this) > 0);
              for (paramInt = p.F(p.this); ; paramInt = p.H(p.this))
              {
                ((ax)localObject).a(i + 1, paramInt + 1);
                return;
              }
            }
            i = paramInt - 1 - p.H(p.this);
            if (i < p.I(p.this).size())
              break label443;
          }
          while (p.h(p.this) == null);
          p.h(p.this).b();
          return;
          label443: paramInt = i;
          if (i >= p.I(p.this).size())
            paramInt = p.I(p.this).size() - 1;
          p.G(p.this).a(p.r(p.this).a((g.rg)p.I(p.this).get(paramInt)), 0);
          p.a(p.this, null, 0);
          p.J(p.this);
        }
      });
      this.u.setOnScrollListener(new RecyclerView.l()
      {
        public void a(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
        {
          p.J(p.this);
          p.a(p.this, paramRecyclerView, paramInt2);
        }
      });
    }
    this.m = new ViewPager(paramContext)
    {
      public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
      {
        if (getParent() != null)
          getParent().requestDisallowInterceptTouchEvent(true);
        return super.onInterceptTouchEvent(paramMotionEvent);
      }
    };
    this.m.setAdapter(new c(null));
    this.s = new LinearLayout(paramContext)
    {
      public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
      {
        if (getParent() != null)
          getParent().requestDisallowInterceptTouchEvent(true);
        return super.onInterceptTouchEvent(paramMotionEvent);
      }
    };
    this.s.setOrientation(0);
    addView(this.s, v.a(-1, 48.0F));
    this.E = new ad(paramContext);
    this.E.setViewPager(this.m);
    this.E.setShouldExpand(true);
    this.E.setIndicatorHeight(a.a(2.0F));
    this.E.setUnderlineHeight(a.a(1.0F));
    this.E.setIndicatorColor(-13920542);
    this.E.setUnderlineColor(-1907225);
    this.s.addView(this.E, v.a(0, 48, 1.0F));
    this.E.setOnPageChangeListener(new ViewPager.f()
    {
      public void a(int paramInt)
      {
        p.E(p.this);
      }

      public void a(int paramInt1, float paramFloat, int paramInt2)
      {
        p.a(p.this, paramInt1, p.this.getMeasuredWidth() - p.this.getPaddingLeft() - p.this.getPaddingRight(), paramInt2);
      }

      public void b(int paramInt)
      {
      }
    });
    Object localObject1 = new FrameLayout(paramContext);
    this.s.addView((View)localObject1, v.b(52, 48));
    this.q = new ImageView(paramContext)
    {
      public boolean onTouchEvent(MotionEvent paramMotionEvent)
      {
        if (paramMotionEvent.getAction() == 0)
        {
          p.a(p.this, true);
          p.b(p.this, false);
          p.a(p.this, 350);
        }
        while (true)
        {
          super.onTouchEvent(paramMotionEvent);
          return true;
          if ((paramMotionEvent.getAction() != 3) && (paramMotionEvent.getAction() != 1))
            continue;
          p.a(p.this, false);
          if ((p.K(p.this)) || (p.h(p.this) == null) || (!p.h(p.this).a()))
            continue;
          p.L(p.this).performHapticFeedback(3);
        }
      }
    };
    this.q.setImageResource(2130837890);
    this.q.setBackgroundResource(2130837827);
    this.q.setScaleType(ImageView.ScaleType.CENTER);
    ((FrameLayout)localObject1).addView(this.q, v.a(52, 48.0F));
    Object localObject2 = new View(paramContext);
    ((View)localObject2).setBackgroundColor(-1907225);
    ((FrameLayout)localObject1).addView((View)localObject2, v.b(52, 1, 83));
    localObject1 = new TextView(paramContext);
    ((TextView)localObject1).setText(org.vidogram.messenger.r.a("NoRecent", 2131231506));
    ((TextView)localObject1).setTextSize(18.0F);
    ((TextView)localObject1).setTextColor(-7829368);
    ((TextView)localObject1).setGravity(17);
    ((TextView)localObject1).setClickable(false);
    ((TextView)localObject1).setFocusable(false);
    ((FrameLayout)this.o.get(0)).addView((View)localObject1, v.a(-2, -2.0F, 17, 0.0F, 48.0F, 0.0F, 0.0F));
    ((GridView)this.p.get(0)).setEmptyView((View)localObject1);
    addView(this.m, 0, v.b(-1, -1, 51));
    float f1;
    if (a.c())
    {
      f1 = 40.0F;
      this.N = a.a(f1);
      this.J = new a(paramContext);
      paramContext = this.J;
      if (!a.c())
        break label1831;
      i1 = 40;
      label1669: i1 = a.a(i1 * 6 + 10 + 20);
      this.L = i1;
      if (!a.c())
        break label1838;
      f1 = 64.0F;
    }
    while (true)
    {
      int i2 = a.a(f1);
      this.M = i2;
      this.K = new d(paramContext, i1, i2);
      this.K.setOutsideTouchable(true);
      this.K.setClippingEnabled(true);
      this.K.setInputMethodMode(2);
      this.K.setSoftInputMode(0);
      this.K.getContentView().setFocusableInTouchMode(true);
      this.K.getContentView().setOnKeyListener(new View.OnKeyListener()
      {
        public boolean onKey(View paramView, int paramInt, KeyEvent paramKeyEvent)
        {
          if ((paramInt == 82) && (paramKeyEvent.getRepeatCount() == 0) && (paramKeyEvent.getAction() == 1) && (p.e(p.this) != null) && (p.e(p.this).isShowing()))
          {
            p.e(p.this).dismiss();
            return true;
          }
          return false;
        }
      });
      this.I = getContext().getSharedPreferences("emoji", 0).getInt("selected_page", 0);
      c();
      return;
      f1 = 32.0F;
      break;
      label1831: i1 = 32;
      break label1669;
      label1838: f1 = 56.0F;
    }
  }

  private void a(int paramInt)
  {
    if (this.u == null)
      return;
    if (this.u.getVisibility() != 0)
    {
      if ((this.x != null) && (this.x.getVisibility() != 0))
        this.x.setVisibility(0);
      if ((this.w != null) && (this.w.getVisibility() == 0))
        this.w.setVisibility(8);
      localax = this.t;
      i1 = this.R;
      if (this.Q > 0);
      for (paramInt = this.Q; ; paramInt = this.P)
      {
        localax.a(i1 + 1, paramInt + 1);
        return;
      }
    }
    ax localax = this.t;
    int i1 = this.r.e(paramInt);
    if (this.Q > 0);
    for (paramInt = this.Q; ; paramInt = this.P)
    {
      localax.a(i1 + 1, paramInt + 1);
      return;
    }
  }

  private void a(int paramInt1, int paramInt2, int paramInt3)
  {
    boolean bool = true;
    int i2 = 0;
    if (this.t == null);
    label188: label189: 
    while (true)
    {
      return;
      int i1 = paramInt2;
      if (paramInt2 == 0)
        i1 = a.c.x;
      Object localObject;
      if (paramInt1 == 5)
      {
        paramInt2 = -paramInt3;
        paramInt1 = paramInt2;
        if (this.l == null)
          break label188;
        localObject = this.l;
        if (paramInt3 != 0)
        {
          ((h)localObject).b(bool);
          paramInt1 = paramInt2;
        }
      }
      while (true)
      {
        label67: if (this.s.getTranslationX() == paramInt1)
          break label189;
        this.s.setTranslationX(paramInt1);
        this.t.setTranslationX(i1 + paramInt1);
        localObject = this.t;
        if (paramInt1 < 0);
        for (paramInt1 = i2; ; paramInt1 = 4)
        {
          ((ax)localObject).setVisibility(paramInt1);
          return;
          bool = false;
          break;
          if (paramInt1 == 6)
          {
            paramInt2 = -i1;
            paramInt1 = paramInt2;
            if (this.l == null)
              break label188;
            this.l.b(true);
            paramInt1 = paramInt2;
            break label67;
          }
          if (this.l != null)
            this.l.b(false);
          paramInt1 = 0;
          break label67;
        }
      }
    }
  }

  private void a(View paramView, int paramInt)
  {
    if (paramView == null)
    {
      paramView = this.t;
      this.af = 0;
      paramView.setTranslationY(0);
    }
    do
      return;
    while (paramView.getVisibility() != 0);
    this.af -= paramInt;
    if (this.af > 0)
      this.af = 0;
    while (true)
    {
      this.t.setTranslationY(Math.max(-a.a(47.0F), this.af));
      return;
      if (this.af >= -a.a(288.0F))
        continue;
      this.af = (-a.a(288.0F));
    }
  }

  private static String b(String paramString1, String paramString2)
  {
    String str1 = null;
    String str2;
    if (!paramString1.endsWith("‍♀"))
    {
      str2 = paramString1;
      if (!paramString1.endsWith("‍♂"));
    }
    else
    {
      str1 = paramString1.substring(paramString1.length() - 2);
      str2 = paramString1.substring(0, paramString1.length() - 2);
    }
    paramString1 = str2 + paramString2;
    if (str1 != null)
      return paramString1 + str1;
    return paramString1;
  }

  private void b(int paramInt)
  {
    a.a(new Runnable(paramInt)
    {
      public void run()
      {
        if (!p.M(p.this))
          return;
        if ((p.h(p.this) != null) && (p.h(p.this).a()))
          p.L(p.this).performHapticFeedback(3);
        p.b(p.this, true);
        p.a(p.this, Math.max(50, this.a - 100));
      }
    }
    , paramInt);
  }

  private void b(boolean paramBoolean)
  {
    int i1;
    if (paramBoolean)
    {
      i1 = this.h.size();
      this.h = g.c();
      if (this.z != null)
        this.z.c();
      if (i1 != this.h.size())
        p();
    }
    do
    {
      return;
      i1 = this.i.size();
      this.i = g.b(0);
      if (this.r == null)
        continue;
      this.r.c();
    }
    while (i1 == this.i.size());
    p();
  }

  private void i()
  {
    int i1 = this.v.m();
    if (i1 == -1)
      return;
    a(i1);
  }

  private void j()
  {
    int i1;
    if (this.m.getCurrentItem() == 6)
      if ((this.x != null) && (this.x.getVisibility() == 0))
        i1 = 2;
    while (true)
    {
      if (this.I != i1)
      {
        this.I = i1;
        getContext().getSharedPreferences("emoji", 0).edit().putInt("selected_page", i1).commit();
      }
      return;
      i1 = 1;
      continue;
      i1 = 0;
    }
  }

  private void k()
  {
    this.A.setVisibility(0);
    this.u.setVisibility(8);
    this.w.setVisibility(8);
    this.x.setVisibility(8);
    ax localax = this.t;
    int i2 = this.S;
    if (this.Q > 0);
    for (int i1 = this.Q; ; i1 = this.P)
    {
      localax.a(i2 + 1, i1 + 1);
      j();
      return;
    }
  }

  private void l()
  {
    this.x.setVisibility(0);
    this.u.setVisibility(8);
    this.w.setVisibility(8);
    this.A.setVisibility(8);
    ax localax = this.t;
    int i2 = this.R;
    if (this.Q > 0);
    for (int i1 = this.Q; ; i1 = this.P)
    {
      localax.a(i2 + 1, i1 + 1);
      j();
      return;
    }
  }

  private void m()
  {
    SharedPreferences localSharedPreferences = getContext().getSharedPreferences("emoji", 0);
    StringBuilder localStringBuilder = new StringBuilder();
    Iterator localIterator = this.d.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      if (localStringBuilder.length() != 0)
        localStringBuilder.append(",");
      localStringBuilder.append((String)localEntry.getKey());
      localStringBuilder.append("=");
      localStringBuilder.append(localEntry.getValue());
    }
    localSharedPreferences.edit().putString("emojis2", localStringBuilder.toString()).commit();
  }

  private void n()
  {
    SharedPreferences localSharedPreferences = getContext().getSharedPreferences("emoji", 0);
    StringBuilder localStringBuilder = new StringBuilder();
    Iterator localIterator = e.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      if (localStringBuilder.length() != 0)
        localStringBuilder.append(",");
      localStringBuilder.append((String)localEntry.getKey());
      localStringBuilder.append("=");
      localStringBuilder.append((String)localEntry.getValue());
    }
    localSharedPreferences.edit().putString("color", localStringBuilder.toString()).commit();
  }

  private void o()
  {
    this.f.clear();
    Iterator localIterator = this.d.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      this.f.add(localEntry.getKey());
    }
    Collections.sort(this.f, new Comparator()
    {
      public int a(String paramString1, String paramString2)
      {
        Integer localInteger2 = (Integer)p.i(p.this).get(paramString1);
        Integer localInteger1 = (Integer)p.i(p.this).get(paramString2);
        paramString1 = localInteger2;
        if (localInteger2 == null)
          paramString1 = Integer.valueOf(0);
        paramString2 = localInteger1;
        if (localInteger1 == null)
          paramString2 = Integer.valueOf(0);
        if (paramString1.intValue() > paramString2.intValue())
          return -1;
        if (paramString1.intValue() < paramString2.intValue())
          return 1;
        return 0;
      }
    });
    while (this.f.size() > 50)
      this.f.remove(this.f.size() - 1);
  }

  private void p()
  {
    if (this.t == null)
      return;
    this.Q = -2;
    this.R = -2;
    this.S = -2;
    this.P = 0;
    int i2 = this.t.getCurrentPosition();
    this.t.a();
    this.t.c(2130837886);
    if ((this.ae) && (!this.h.isEmpty()))
    {
      this.t.c(2130837892);
      this.R = this.P;
      this.P += 1;
    }
    ArrayList localArrayList = g.f();
    if ((this.C != null) && (this.C.a() != 0) && (!localArrayList.isEmpty()))
    {
      localObject = this.t.b(2130837894);
      this.S = this.P;
      this.P += 1;
      ((TextView)localObject).setText(String.format("%d", new Object[] { Integer.valueOf(localArrayList.size()) }));
    }
    if (!this.i.isEmpty())
    {
      this.Q = this.P;
      this.P += 1;
      this.t.c(2130837884);
    }
    this.g.clear();
    Object localObject = g.d(0);
    int i1 = 0;
    if (i1 < ((ArrayList)localObject).size())
    {
      g.rg localrg = (g.rg)((ArrayList)localObject).get(i1);
      if ((localrg.c.h) || (localrg.e == null) || (localrg.e.isEmpty()));
      while (true)
      {
        i1 += 1;
        break;
        this.g.add(localrg);
      }
    }
    i1 = 0;
    while (i1 < this.g.size())
    {
      this.t.a((g.q)((g.rg)this.g.get(i1)).e.get(0));
      i1 += 1;
    }
    if ((this.C != null) && (this.C.a() != 0) && (localArrayList.isEmpty()))
    {
      this.S = (this.P + this.g.size());
      this.t.c(2130837894);
    }
    this.t.c(2130837893);
    this.t.b();
    if (i2 != 0)
      this.t.a(i2, i2);
    if ((this.T) && (this.R >= 0) && (this.x.getVisibility() != 0))
    {
      l();
      this.T = false;
    }
    q();
  }

  private void q()
  {
    int i2 = 8;
    if (this.t == null);
    label176: 
    do
    {
      do
      {
        return;
        if ((this.S == -2) && (this.A != null) && (this.A.getVisibility() == 0))
        {
          this.x.setVisibility(8);
          this.A.setVisibility(8);
          this.u.setVisibility(0);
          localObject = this.w;
          if (this.r.a() != 0)
          {
            i1 = 8;
            ((TextView)localObject).setVisibility(i1);
          }
        }
        else
        {
          if ((this.R != -2) || (this.x == null) || (this.x.getVisibility() != 0))
            continue;
          this.l.a(false);
          this.x.setVisibility(8);
          this.A.setVisibility(8);
          this.u.setVisibility(0);
          localObject = this.w;
          if (this.r.a() == 0)
            break label176;
        }
        for (i1 = i2; ; i1 = 0)
        {
          ((TextView)localObject).setVisibility(i1);
          return;
          i1 = 0;
          break;
        }
      }
      while (this.R == -2);
      if ((this.x != null) && (this.x.getVisibility() == 0))
      {
        localObject = this.t;
        i2 = this.R;
        if (this.Q > 0);
        for (i1 = this.Q; ; i1 = this.P)
        {
          ((ax)localObject).a(i2 + 1, i1 + 1);
          return;
        }
      }
      if ((this.A != null) && (this.A.getVisibility() == 0))
      {
        localObject = this.t;
        i2 = this.S;
        if (this.Q > 0);
        for (i1 = this.Q; ; i1 = this.P)
        {
          ((ax)localObject).a(i2 + 1, i1 + 1);
          return;
        }
      }
      i1 = this.v.m();
    }
    while (i1 == -1);
    Object localObject = this.t;
    i2 = this.r.e(i1);
    if (this.Q > 0);
    for (int i1 = this.Q; ; i1 = this.P)
    {
      ((ax)localObject).a(i2 + 1, i1 + 1);
      return;
    }
  }

  private void r()
  {
    if (this.r != null)
      this.r.c();
    if (this.C != null)
      this.C.c();
    if (org.vidogram.ui.ax.a().c())
      org.vidogram.ui.ax.a().d();
    org.vidogram.ui.ax.a().b();
  }

  private void s()
  {
    int i1 = this.B.m();
    if (i1 == -1);
    int i2;
    do
    {
      return;
      i2 = this.B.n();
    }
    while (i2 == -1);
    this.C.a(i1, i2 - i1 + 1);
  }

  public void a()
  {
    getContext().getSharedPreferences("emoji", 0).edit().putBoolean("filled_default", true).commit();
    this.d.clear();
    this.f.clear();
    m();
    ((b)this.c.get(0)).notifyDataSetChanged();
  }

  public void a(int paramInt, Object[] paramArrayOfObject)
  {
    int i1 = 0;
    if (paramInt == y.P)
      if (((Integer)paramArrayOfObject[0]).intValue() == 0)
      {
        if (this.C != null)
        {
          if (!this.H)
            break label52;
          s();
        }
        p();
        r();
        q();
      }
    label52: label104: 
    do
    {
      boolean bool;
      do
      {
        return;
        this.C.c();
        break;
        if (paramInt != y.ah)
          break label104;
        bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
      }
      while ((!bool) && (((Integer)paramArrayOfObject[1]).intValue() != 0));
      b(bool);
      return;
    }
    while (paramInt != y.Q);
    if (this.C != null)
    {
      if (!this.H)
        break label171;
      s();
    }
    while (this.E != null)
    {
      int i2 = this.E.getChildCount();
      paramInt = i1;
      while (paramInt < i2)
      {
        this.E.getChildAt(paramInt).invalidate();
        paramInt += 1;
      }
      label171: this.C.c();
    }
    p();
  }

  public void a(g.q paramq)
  {
    if (paramq == null);
    boolean bool;
    do
    {
      return;
      g.a(0, paramq, (int)(System.currentTimeMillis() / 1000L));
      bool = this.i.isEmpty();
      this.i = g.b(0);
      if (this.r == null)
        continue;
      this.r.c();
    }
    while (!bool);
    p();
  }

  public void a(boolean paramBoolean)
  {
    boolean bool = true;
    if (this.t != null)
    {
      if ((this.I != 0) && (!paramBoolean))
        break label55;
      if (this.m.getCurrentItem() == 6)
      {
        ViewPager localViewPager = this.m;
        if (paramBoolean)
          break label50;
        paramBoolean = bool;
        localViewPager.a(0, paramBoolean);
      }
    }
    label50: label55: 
    do
    {
      do
      {
        do
        {
          return;
          paramBoolean = false;
          break;
          if (this.I != 1)
            break label151;
          if (this.m.getCurrentItem() == 6)
            continue;
          this.m.setCurrentItem(6);
        }
        while (this.t.getCurrentPosition() != this.R + 1);
        if (this.Q >= 0)
        {
          this.t.a(this.Q + 1);
          return;
        }
        if (this.R >= 0)
        {
          this.t.a(this.R + 2);
          return;
        }
        this.t.a(1);
        return;
      }
      while (this.I != 2);
      if (this.m.getCurrentItem() == 6)
        continue;
      this.m.setCurrentItem(6);
    }
    while (this.t.getCurrentPosition() == this.R + 1);
    label151: if ((this.R >= 0) && (!this.h.isEmpty()))
    {
      this.t.a(this.R + 1);
      return;
    }
    this.T = true;
  }

  public void b()
  {
    if ((this.R >= 0) && (!this.h.isEmpty()))
      this.t.a(this.R + 1);
    while (true)
    {
      this.m.setCurrentItem(6);
      return;
      this.T = true;
    }
  }

  public void b(g.q paramq)
  {
    if (paramq == null);
    boolean bool;
    do
    {
      return;
      g.a(paramq, (int)(System.currentTimeMillis() / 1000L));
      bool = this.h.isEmpty();
      this.h = g.c();
      if (this.z == null)
        continue;
      this.z.c();
    }
    while (!bool);
    p();
  }

  public void c()
  {
    SharedPreferences localSharedPreferences = getContext().getSharedPreferences("emoji", 0);
    while (true)
    {
      int i1;
      int i2;
      try
      {
        this.d.clear();
        if (!localSharedPreferences.contains("emojis"))
          continue;
        localObject1 = localSharedPreferences.getString("emojis", "");
        if ((localObject1 == null) || (((String)localObject1).length() <= 0))
          continue;
        String[] arrayOfString1 = ((String)localObject1).split(",");
        int i3 = arrayOfString1.length;
        i1 = 0;
        if (i1 >= i3)
          continue;
        String[] arrayOfString2 = arrayOfString1[i1].split("=");
        long l1 = Utilities.b(arrayOfString2[0]).longValue();
        localObject1 = "";
        i2 = 0;
        localObject2 = localObject1;
        if (i2 >= 4)
          continue;
        char c1 = (char)(int)l1;
        localObject1 = String.valueOf(c1) + (String)localObject1;
        l1 >>= 16;
        if (l1 != 0L)
          break label800;
        localObject2 = localObject1;
        if (((String)localObject2).length() <= 0)
          break label793;
        this.d.put(localObject2, Utilities.a(arrayOfString2[1]));
        break label793;
        localSharedPreferences.edit().remove("emojis").commit();
        m();
        if ((!this.d.isEmpty()) || (localSharedPreferences.getBoolean("filled_default", false)))
          continue;
        localObject1 = new String[34];
        localObject1[0] = "😂";
        localObject1[1] = "😘";
        localObject1[2] = "❤";
        localObject1[3] = "😍";
        localObject1[4] = "😊";
        localObject1[5] = "😁";
        localObject1[6] = "👍";
        localObject1[7] = "☺";
        localObject1[8] = "😔";
        localObject1[9] = "😄";
        localObject1[10] = "😭";
        localObject1[11] = "💋";
        localObject1[12] = "😒";
        localObject1[13] = "😳";
        localObject1[14] = "😜";
        localObject1[15] = "🙈";
        localObject1[16] = "😉";
        localObject1[17] = "😃";
        localObject1[18] = "😢";
        localObject1[19] = "😝";
        localObject1[20] = "😱";
        localObject1[21] = "😡";
        localObject1[22] = "😏";
        localObject1[23] = "😞";
        localObject1[24] = "😅";
        localObject1[25] = "😚";
        localObject1[26] = "🙊";
        localObject1[27] = "😌";
        localObject1[28] = "😀";
        localObject1[29] = "😋";
        localObject1[30] = "😆";
        localObject1[31] = "👌";
        localObject1[32] = "😐";
        localObject1[33] = "😕";
        i1 = 0;
        if (i1 >= localObject1.length)
          continue;
        this.d.put(localObject1[i1], Integer.valueOf(localObject1.length - i1));
        i1 += 1;
        continue;
        localObject1 = localSharedPreferences.getString("emojis2", "");
        if ((localObject1 == null) || (((String)localObject1).length() <= 0))
          continue;
        localObject1 = ((String)localObject1).split(",");
        i2 = localObject1.length;
        i1 = 0;
        if (i1 >= i2)
          continue;
        localObject2 = localObject1[i1].split("=");
        this.d.put(localObject2[0], Utilities.a(localObject2[1]));
        i1 += 1;
        continue;
        continue;
        localSharedPreferences.edit().putBoolean("filled_default", true).commit();
        m();
        o();
        ((b)this.c.get(0)).notifyDataSetChanged();
      }
      catch (Exception localException2)
      {
        try
        {
          Object localObject2;
          Object localObject1 = localSharedPreferences.getString("color", "");
          if ((localObject1 != null) && (((String)localObject1).length() > 0))
          {
            localObject1 = ((String)localObject1).split(",");
            i1 = 0;
            if (i1 < localObject1.length)
            {
              localObject2 = localObject1[i1].split("=");
              e.put(localObject2[0], localObject2[1]);
              i1 += 1;
              continue;
              localException1 = localException1;
              n.a("tmessages", localException1);
              continue;
            }
          }
        }
        catch (Exception localException2)
        {
          n.a("tmessages", localException2);
        }
      }
      return;
      label793: i1 += 1;
      continue;
      label800: i2 += 1;
    }
  }

  public void d()
  {
    int i1 = 0;
    while (i1 < this.p.size())
    {
      ((GridView)this.p.get(i1)).invalidateViews();
      i1 += 1;
    }
  }

  public void e()
  {
    if (this.r != null)
    {
      y.a().b(this, y.P);
      y.a().b(this, y.ah);
      y.a().b(this, y.Q);
    }
  }

  public int getCurrentPage()
  {
    return this.I;
  }

  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    if (this.r != null)
    {
      y.a().a(this, y.P);
      y.a().a(this, y.F);
      y.a().a(this, y.Q);
      a.a(new Runnable()
      {
        public void run()
        {
          p.x(p.this);
          p.N(p.this);
        }
      });
    }
  }

  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    if ((this.K != null) && (this.K.isShowing()))
      this.K.dismiss();
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (this.ab != paramInt3 - paramInt1)
    {
      this.ab = (paramInt3 - paramInt1);
      r();
    }
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
  }

  public void onMeasure(int paramInt1, int paramInt2)
  {
    Object localObject = null;
    this.U = true;
    if (a.i)
      if (this.V != 1)
      {
        if (Build.VERSION.SDK_INT >= 21)
        {
          setOutlineProvider((ViewOutlineProvider)this.W);
          setClipToOutline(true);
          setElevation(a.a(2.0F));
        }
        setBackgroundResource(2130838149);
        this.s.setBackgroundDrawable(null);
        this.V = 1;
      }
    while (true)
    {
      FrameLayout.LayoutParams localLayoutParams2 = (FrameLayout.LayoutParams)this.s.getLayoutParams();
      localLayoutParams2.width = View.MeasureSpec.getSize(paramInt1);
      if (this.t != null)
      {
        FrameLayout.LayoutParams localLayoutParams1 = (FrameLayout.LayoutParams)this.t.getLayoutParams();
        localObject = localLayoutParams1;
        if (localLayoutParams1 != null)
        {
          localLayoutParams1.width = localLayoutParams2.width;
          localObject = localLayoutParams1;
        }
      }
      if (localLayoutParams2.width != this.aa)
      {
        if ((this.t != null) && (localObject != null))
        {
          a(this.m.getCurrentItem(), localLayoutParams2.width - getPaddingLeft() - getPaddingRight(), 0);
          this.t.setLayoutParams(localObject);
        }
        this.s.setLayoutParams(localLayoutParams2);
        this.aa = localLayoutParams2.width;
      }
      super.onMeasure(View.MeasureSpec.makeMeasureSpec(localLayoutParams2.width, 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(paramInt2), 1073741824));
      this.U = false;
      return;
      if (this.V == 0)
        continue;
      if (Build.VERSION.SDK_INT >= 21)
      {
        setOutlineProvider(null);
        setClipToOutline(false);
        setElevation(0.0F);
      }
      setBackgroundColor(-657673);
      this.s.setBackgroundColor(-657673);
      this.V = 0;
    }
  }

  public void requestLayout()
  {
    if (this.U)
      return;
    super.requestLayout();
  }

  public void setListener(h paramh)
  {
    this.l = paramh;
  }

  public void setVisibility(int paramInt)
  {
    super.setVisibility(paramInt);
    h localh;
    if (paramInt != 8)
    {
      o();
      ((b)this.c.get(0)).notifyDataSetChanged();
      if (this.r != null)
      {
        y.a().a(this, y.P);
        y.a().a(this, y.ah);
        p();
        r();
        if ((this.x != null) && (this.x.getVisibility() == 0) && (this.l != null))
        {
          localh = this.l;
          if ((this.m == null) || (this.m.getCurrentItem() < 6))
            break label163;
        }
      }
    }
    label163: for (boolean bool = true; ; bool = false)
    {
      localh.a(bool);
      if (this.C != null)
      {
        this.H = false;
        this.C.c();
      }
      b(true);
      b(false);
      g.a(0, true, true);
      g.a(0, false, true);
      return;
    }
  }

  private class a extends View
  {
    private Drawable b = getResources().getDrawable(2130838154);
    private Drawable c = getResources().getDrawable(2130838155);
    private String d;
    private int e;
    private int f;
    private Paint g = new Paint(1);
    private RectF h = new RectF();

    public a(Context arg2)
    {
      super();
    }

    public int a()
    {
      return this.f;
    }

    public void a(int paramInt)
    {
      if (this.f == paramInt)
        return;
      this.f = paramInt;
      invalidate();
    }

    public void a(String paramString, int paramInt)
    {
      this.d = paramString;
      this.e = paramInt;
      this.g.setColor(788529152);
      invalidate();
    }

    protected void onDraw(Canvas paramCanvas)
    {
      float f2 = 55.5F;
      Object localObject = this.b;
      int i = getMeasuredWidth();
      float f1;
      int j;
      label73: int k;
      label100: String str;
      if (a.c())
      {
        f1 = 60.0F;
        ((Drawable)localObject).setBounds(0, 0, i, a.a(f1));
        this.b.draw(paramCanvas);
        localObject = this.c;
        i = this.e;
        j = a.a(9.0F);
        if (!a.c())
          break label383;
        f1 = 55.5F;
        k = a.a(f1);
        int m = this.e;
        int n = a.a(9.0F);
        if (!a.c())
          break label389;
        f1 = f2;
        ((Drawable)localObject).setBounds(i - j, k, m + n, a.a(f1 + 8.0F));
        this.c.draw(paramCanvas);
        if (this.d == null)
          break label430;
        i = 0;
        label142: if (i >= 6)
          break label430;
        j = p.c(p.this) * i + a.a(i * 4 + 5);
        k = a.a(9.0F);
        if (this.f == i)
        {
          this.h.set(j, k - (int)a.b(3.5F), p.c(p.this) + j, p.c(p.this) + k + a.a(3.0F));
          paramCanvas.drawRoundRect(this.h, a.a(4.0F), a.a(4.0F), this.g);
        }
        str = this.d;
        if (i == 0)
          break label431;
        switch (i)
        {
        default:
          localObject = "";
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
        }
      }
      label312: for (localObject = p.a(str, (String)localObject); ; localObject = str)
      {
        localObject = j.b((String)localObject);
        if (localObject != null)
        {
          ((Drawable)localObject).setBounds(j, k, p.c(p.this) + j, p.c(p.this) + k);
          ((Drawable)localObject).draw(paramCanvas);
        }
        i += 1;
        break label142;
        f1 = 52.0F;
        break;
        label383: f1 = 47.5F;
        break label73;
        f1 = 47.5F;
        break label100;
        localObject = "🏻";
        break label312;
        localObject = "🏼";
        break label312;
        localObject = "🏽";
        break label312;
        localObject = "🏾";
        break label312;
        localObject = "🏿";
        break label312;
        return;
      }
    }
  }

  private class b extends BaseAdapter
  {
    private int b;

    public b(int arg2)
    {
      int i;
      this.b = i;
    }

    public int getCount()
    {
      if (this.b == -1)
        return p.j(p.this).size();
      return k.d[this.b].length;
    }

    public Object getItem(int paramInt)
    {
      return null;
    }

    public long getItemId(int paramInt)
    {
      return paramInt;
    }

    public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      paramView = (p.g)paramView;
      paramViewGroup = paramView;
      if (paramView == null)
        paramViewGroup = new p.g(p.this, p.this.getContext());
      Object localObject;
      if (this.b == -1)
      {
        paramView = (String)p.j(p.this).get(paramInt);
        localObject = paramView;
      }
      while (true)
      {
        paramViewGroup.setImageDrawable(j.b(paramView));
        paramViewGroup.setTag(localObject);
        return paramViewGroup;
        localObject = k.d[this.b][paramInt];
        paramView = (String)p.f().get(localObject);
        if (paramView != null)
        {
          paramView = p.a((String)localObject, paramView);
          continue;
        }
        paramView = (View)localObject;
      }
    }

    public void unregisterDataSetObserver(DataSetObserver paramDataSetObserver)
    {
      if (paramDataSetObserver != null)
        super.unregisterDataSetObserver(paramDataSetObserver);
    }
  }

  private class c extends aa
    implements ad.a
  {
    private c()
    {
    }

    public int a()
    {
      return p.U(p.this).size();
    }

    public Object a(ViewGroup paramViewGroup, int paramInt)
    {
      if (paramInt == 6);
      for (Object localObject = p.T(p.this); ; localObject = (View)p.U(p.this).get(paramInt))
      {
        paramViewGroup.addView((View)localObject);
        return localObject;
      }
    }

    public void a(Canvas paramCanvas, int paramInt)
    {
      if ((paramInt == 6) && (!g.f().isEmpty()) && (p.W(p.this) != null))
      {
        paramInt = paramCanvas.getWidth() / 2 + a.a(4.0F);
        int i = paramCanvas.getHeight() / 2 - a.a(13.0F);
        p.W(p.this).setBounds(paramInt, i, p.W(p.this).getIntrinsicWidth() + paramInt, p.W(p.this).getIntrinsicHeight() + i);
        p.W(p.this).draw(paramCanvas);
      }
    }

    public void a(ViewGroup paramViewGroup, int paramInt, Object paramObject)
    {
      if (paramInt == 6);
      for (paramObject = p.T(p.this); ; paramObject = (View)p.U(p.this).get(paramInt))
      {
        paramViewGroup.removeView(paramObject);
        return;
      }
    }

    public boolean a(View paramView, Object paramObject)
    {
      return paramView == paramObject;
    }

    public int b(int paramInt)
    {
      return p.V(p.this)[paramInt];
    }
  }

  private class d extends PopupWindow
  {
    private ViewTreeObserver.OnScrollChangedListener b;
    private ViewTreeObserver c;

    public d(View paramInt1, int paramInt2, int arg4)
    {
      super(paramInt2, i);
      a();
    }

    private void a()
    {
      if (p.g() != null);
      try
      {
        this.b = ((ViewTreeObserver.OnScrollChangedListener)p.g().get(this));
        p.g().set(this, p.h());
        return;
      }
      catch (Exception localException)
      {
        this.b = null;
      }
    }

    private void a(View paramView)
    {
      if (this.b != null)
        if (paramView.getWindowToken() == null)
          break label73;
      label73: for (paramView = paramView.getViewTreeObserver(); ; paramView = null)
      {
        if (paramView != this.c)
        {
          if ((this.c != null) && (this.c.isAlive()))
            this.c.removeOnScrollChangedListener(this.b);
          this.c = paramView;
          if (paramView != null)
            paramView.addOnScrollChangedListener(this.b);
        }
        return;
      }
    }

    private void b()
    {
      if ((this.b != null) && (this.c != null))
      {
        if (this.c.isAlive())
          this.c.removeOnScrollChangedListener(this.b);
        this.c = null;
      }
    }

    public void dismiss()
    {
      setFocusable(false);
      try
      {
        super.dismiss();
        label9: b();
        return;
      }
      catch (Exception localException)
      {
        break label9;
      }
    }

    public void showAsDropDown(View paramView, int paramInt1, int paramInt2)
    {
      try
      {
        super.showAsDropDown(paramView, paramInt1, paramInt2);
        a(paramView);
        return;
      }
      catch (Exception paramView)
      {
        n.a("tmessages", paramView);
      }
    }

    public void showAtLocation(View paramView, int paramInt1, int paramInt2, int paramInt3)
    {
      super.showAtLocation(paramView, paramInt1, paramInt2, paramInt3);
      b();
    }

    public void update(View paramView, int paramInt1, int paramInt2)
    {
      super.update(paramView, paramInt1, paramInt2);
      a(paramView);
    }

    public void update(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      super.update(paramView, paramInt1, paramInt2, paramInt3, paramInt4);
      a(paramView);
    }
  }

  private class e extends RecyclerView.a
  {
    private Context b;

    public e(Context arg2)
    {
      Object localObject;
      this.b = localObject;
    }

    public int a()
    {
      return p.u(p.this).size();
    }

    public RecyclerView.u a(ViewGroup paramViewGroup, int paramInt)
    {
      paramViewGroup = new m(this.b);
      return new p.f(p.this, paramViewGroup);
    }

    public void a(RecyclerView.u paramu, int paramInt)
    {
      g.q localq = (g.q)p.u(p.this).get(paramInt);
      if (localq != null)
        ((m)paramu.a).a(localq, false);
    }

    public long b(int paramInt)
    {
      return paramInt;
    }
  }

  private class f extends RecyclerView.u
  {
    public f(View arg2)
    {
      super();
    }
  }

  private class g extends ImageView
  {
    private boolean b;
    private float c;
    private float d;
    private float e;
    private float f;

    public g(Context arg2)
    {
      super();
      setOnClickListener(new View.OnClickListener(p.this)
      {
        public void onClick(View paramView)
        {
          p.g.a(p.g.this, null);
        }
      });
      setOnLongClickListener(new View.OnLongClickListener(p.this)
      {
        public boolean onLongClick(View paramView)
        {
          String str = (String)paramView.getTag();
          if (k.h.containsKey(str))
          {
            p.g.a(p.g.this, true);
            p.g.a(p.g.this, p.g.a(p.g.this));
            p.g.b(p.g.this, p.g.b(p.g.this));
            Object localObject = (String)p.f().get(str);
            int i;
            label118: int j;
            label152: label216: float f;
            if (localObject != null)
              switch (((String)localObject).hashCode())
              {
              default:
                i = -1;
                switch (i)
                {
                default:
                  paramView.getLocationOnScreen(p.b(p.this));
                  j = p.c(p.this);
                  int k = p.a(p.this).a();
                  int m = p.a(p.this).a();
                  if (a.c())
                  {
                    i = 5;
                    j = a.a(m * 4 - i) + k * j;
                    if (p.b(p.this)[0] - j >= a.a(5.0F))
                      break label600;
                    i = j + (p.b(p.this)[0] - j - a.a(5.0F));
                    label282: j = -i;
                    if (paramView.getTop() >= 0)
                      break label690;
                    i = paramView.getTop();
                    label298: localObject = p.a(p.this);
                    if (!a.c())
                      break label695;
                    f = 30.0F;
                  }
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                }
              case 1773375:
              case 1773376:
              case 1773377:
              case 1773378:
              case 1773379:
              }
            while (true)
            {
              ((p.a)localObject).a(str, a.a(f) - j + (int)a.b(0.5F));
              p.e(p.this).setFocusable(true);
              p.e(p.this).showAsDropDown(paramView, j, -paramView.getMeasuredHeight() - p.f(p.this) + (paramView.getMeasuredHeight() - p.c(p.this)) / 2 - i);
              paramView.getParent().requestDisallowInterceptTouchEvent(true);
              return true;
              if (!((String)localObject).equals("🏻"))
                break;
              i = 0;
              break label118;
              if (!((String)localObject).equals("🏼"))
                break;
              i = 1;
              break label118;
              if (!((String)localObject).equals("🏽"))
                break;
              i = 2;
              break label118;
              if (!((String)localObject).equals("🏾"))
                break;
              i = 3;
              break label118;
              if (!((String)localObject).equals("🏿"))
                break;
              i = 4;
              break label118;
              p.a(p.this).a(1);
              break label152;
              p.a(p.this).a(2);
              break label152;
              p.a(p.this).a(3);
              break label152;
              p.a(p.this).a(4);
              break label152;
              p.a(p.this).a(5);
              break label152;
              p.a(p.this).a(0);
              break label152;
              i = 1;
              break label216;
              label600: i = j;
              if (p.b(p.this)[0] - j + p.d(p.this) <= a.c.x - a.a(5.0F))
                break label282;
              i = j + (p.b(p.this)[0] - j + p.d(p.this) - (a.c.x - a.a(5.0F)));
              break label282;
              label690: i = 0;
              break label298;
              label695: f = 22.0F;
            }
          }
          if (p.g(p.this).getCurrentItem() == 0)
            p.h(p.this).c();
          return false;
        }
      });
      setBackgroundResource(2130837946);
      setScaleType(ImageView.ScaleType.CENTER);
    }

    private void a(String paramString)
    {
      Object localObject;
      String str;
      if (paramString != null)
      {
        localObject = paramString;
        if (paramString != null)
          break label280;
        paramString = (String)localObject;
        if (p.g(p.this).getCurrentItem() != 0)
        {
          str = (String)p.f().get(localObject);
          paramString = (String)localObject;
          if (str != null)
            paramString = p.a((String)localObject, str);
        }
        localObject = (Integer)p.i(p.this).get(paramString);
        if (localObject != null)
          break label307;
        localObject = Integer.valueOf(0);
      }
      label273: label280: label307: 
      while (true)
      {
        int i;
        if ((((Integer)localObject).intValue() == 0) && (p.i(p.this).size() > 50))
        {
          i = p.j(p.this).size() - 1;
          label110: if (i >= 0)
          {
            str = (String)p.j(p.this).get(i);
            p.i(p.this).remove(str);
            p.j(p.this).remove(i);
            if (p.i(p.this).size() > 50)
              break label273;
          }
        }
        p.i(p.this).put(paramString, Integer.valueOf(((Integer)localObject).intValue() + 1));
        if (p.g(p.this).getCurrentItem() != 0)
          p.k(p.this);
        p.l(p.this);
        ((p.b)p.m(p.this).get(0)).notifyDataSetChanged();
        if (p.h(p.this) != null)
          p.h(p.this).a(j.a(paramString));
        do
        {
          return;
          localObject = (String)getTag();
          break;
          i -= 1;
          break label110;
        }
        while (p.h(p.this) == null);
        p.h(p.this).a(j.a(paramString));
        return;
      }
    }

    public void onMeasure(int paramInt1, int paramInt2)
    {
      setMeasuredDimension(View.MeasureSpec.getSize(paramInt1), View.MeasureSpec.getSize(paramInt1));
    }

    public boolean onTouchEvent(MotionEvent paramMotionEvent)
    {
      int j = 5;
      int i = 1;
      Object localObject1;
      Object localObject2;
      if (this.b)
      {
        if ((paramMotionEvent.getAction() != 1) && (paramMotionEvent.getAction() != 3))
          break label312;
        if ((p.e(p.this) != null) && (p.e(p.this).isShowing()))
          p.e(p.this).dismiss();
        switch (p.a(p.this).a())
        {
        default:
          localObject1 = null;
          localObject2 = (String)getTag();
          if (p.g(p.this).getCurrentItem() != 0)
          {
            if (localObject1 == null)
              break;
            p.f().put(localObject2, localObject1);
            localObject1 = p.a((String)localObject2, (String)localObject1);
            label158: setImageDrawable(j.b((String)localObject1));
            a(null);
            p.n(p.this);
            this.b = false;
            this.e = -10000.0F;
            this.f = -10000.0F;
          }
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
        }
      }
      label522: 
      while (true)
      {
        this.c = paramMotionEvent.getX();
        this.d = paramMotionEvent.getY();
        return super.onTouchEvent(paramMotionEvent);
        localObject1 = "🏻";
        break;
        localObject1 = "🏼";
        break;
        localObject1 = "🏽";
        break;
        localObject1 = "🏾";
        break;
        localObject1 = "🏿";
        break;
        p.f().remove(localObject2);
        localObject1 = localObject2;
        break label158;
        localObject2 = new StringBuilder().append((String)localObject2);
        if (localObject1 != null);
        while (true)
        {
          a((String)localObject1);
          break;
          localObject1 = "";
        }
        label312: if (paramMotionEvent.getAction() != 2)
          continue;
        if (this.e != -10000.0F)
          if ((Math.abs(this.e - paramMotionEvent.getX()) > a.a(0.2F, true)) || (Math.abs(this.f - paramMotionEvent.getY()) > a.a(0.2F, false)))
          {
            this.e = -10000.0F;
            this.f = -10000.0F;
          }
        for (i = 0; ; i = 0)
        {
          if (i != 0)
            break label522;
          getLocationOnScreen(p.b(p.this));
          float f1 = p.b(p.this)[0];
          float f2 = paramMotionEvent.getX();
          p.a(p.this).getLocationOnScreen(p.b(p.this));
          int k = (int)((f1 + f2 - (p.b(p.this)[0] + a.a(3.0F))) / (p.c(p.this) + a.a(4.0F)));
          if (k < 0)
            i = 0;
          while (true)
          {
            p.a(p.this).a(i);
            break;
            i = j;
            if (k > 5)
              continue;
            i = k;
          }
        }
      }
    }
  }

  public static abstract interface h
  {
    public abstract void a(String paramString);

    public abstract void a(g.bf parambf);

    public abstract void a(g.q paramq);

    public abstract void a(boolean paramBoolean);

    public abstract boolean a();

    public abstract void b();

    public abstract void b(g.bf parambf);

    public abstract void b(g.q paramq);

    public abstract void b(boolean paramBoolean);

    public abstract void c();

    public abstract void c(g.bf parambf);
  }

  private class i extends RecyclerView.a
  {
    private Context b;
    private int c;
    private HashMap<Integer, g.rg> d = new HashMap();
    private HashMap<g.rg, Integer> e = new HashMap();
    private HashMap<Integer, g.q> f = new HashMap();
    private int g;

    public i(Context arg2)
    {
      Object localObject;
      this.b = localObject;
    }

    public int a()
    {
      if (this.g != 0)
        return this.g + 1;
      return 0;
    }

    public int a(int paramInt)
    {
      if (this.f.get(Integer.valueOf(paramInt)) != null)
        return 0;
      return 1;
    }

    public int a(g.rg paramrg)
    {
      return ((Integer)this.e.get(paramrg)).intValue() * this.c;
    }

    public RecyclerView.u a(ViewGroup paramViewGroup, int paramInt)
    {
      paramViewGroup = null;
      switch (paramInt)
      {
      default:
      case 0:
      case 1:
      }
      while (true)
      {
        return new p.f(p.this, paramViewGroup);
        paramViewGroup = new org.vidogram.ui.c.aw(this.b)
        {
          public void onMeasure(int paramInt1, int paramInt2)
          {
            super.onMeasure(paramInt1, View.MeasureSpec.makeMeasureSpec(a.a(82.0F), 1073741824));
          }
        };
        continue;
        paramViewGroup = new org.vidogram.ui.c.r(this.b);
      }
    }

    public void a(RecyclerView.u paramu, int paramInt)
    {
      Object localObject;
      switch (paramu.h())
      {
      default:
        return;
      case 0:
        localObject = (g.q)this.f.get(Integer.valueOf(paramInt));
        ((org.vidogram.ui.c.aw)paramu.a).a((g.q)localObject, false);
        return;
      case 1:
      }
      if (paramInt == this.g)
      {
        paramInt = (paramInt - 1) / this.c;
        localObject = (g.rg)this.d.get(Integer.valueOf(paramInt));
        if (localObject == null)
        {
          ((org.vidogram.ui.c.r)paramu.a).setHeight(1);
          return;
        }
        paramInt = p.g(p.this).getHeight() - (int)Math.ceil(((g.rg)localObject).e.size() / this.c) * a.a(82.0F);
        paramu = (org.vidogram.ui.c.r)paramu.a;
        if (paramInt > 0);
        while (true)
        {
          paramu.setHeight(paramInt);
          return;
          paramInt = 1;
        }
      }
      ((org.vidogram.ui.c.r)paramu.a).setHeight(a.a(82.0F));
    }

    public void c()
    {
      int j = p.this.getMeasuredWidth();
      int i = j;
      if (j == 0)
        i = a.c.x;
      this.c = (i / a.a(72.0F));
      p.G(p.this).a(this.c);
      this.d.clear();
      this.e.clear();
      this.f.clear();
      this.g = 0;
      ArrayList localArrayList2 = p.I(p.this);
      i = -1;
      if (i < localArrayList2.size())
      {
        g.rg localrg = null;
        int k = this.g / this.c;
        ArrayList localArrayList1;
        if (i == -1)
        {
          localArrayList1 = p.S(p.this);
          label119: if (!localArrayList1.isEmpty())
            break label169;
        }
        while (true)
        {
          i += 1;
          break;
          localrg = (g.rg)localArrayList2.get(i);
          localArrayList1 = localrg.e;
          this.e.put(localrg, Integer.valueOf(k));
          break label119;
          label169: int m = (int)Math.ceil(localArrayList1.size() / this.c);
          j = 0;
          while (j < localArrayList1.size())
          {
            this.f.put(Integer.valueOf(this.g + j), localArrayList1.get(j));
            j += 1;
          }
          this.g += this.c * m;
          j = 0;
          while (j < m)
          {
            this.d.put(Integer.valueOf(k + j), localrg);
            j += 1;
          }
        }
      }
      super.c();
    }

    public int e(int paramInt)
    {
      if (this.c == 0)
      {
        int j = p.this.getMeasuredWidth();
        int i = j;
        if (j == 0)
          i = a.c.x;
        this.c = (i / a.a(72.0F));
      }
      paramInt /= this.c;
      g.rg localrg = (g.rg)this.d.get(Integer.valueOf(paramInt));
      if (localrg == null)
        return p.F(p.this);
      return p.I(p.this).indexOf(localrg) + p.H(p.this);
    }
  }

  private class j extends RecyclerView.a
  {
    private Context b;
    private int c;
    private HashMap<Integer, Object> d = new HashMap();
    private ArrayList<g.bf> e = new ArrayList();
    private HashMap<Integer, g.bf> f = new HashMap();
    private int g;

    public j(Context arg2)
    {
      Object localObject;
      this.b = localObject;
    }

    public int a()
    {
      return this.g;
    }

    public int a(int paramInt)
    {
      Object localObject = this.d.get(Integer.valueOf(paramInt));
      if (localObject != null)
      {
        if ((localObject instanceof g.q))
          return 0;
        return 2;
      }
      return 1;
    }

    public RecyclerView.u a(ViewGroup paramViewGroup, int paramInt)
    {
      paramViewGroup = null;
      switch (paramInt)
      {
      default:
      case 0:
      case 1:
      case 2:
      }
      while (true)
      {
        return new p.f(p.this, paramViewGroup);
        paramViewGroup = new org.vidogram.ui.c.aw(this.b)
        {
          public void onMeasure(int paramInt1, int paramInt2)
          {
            super.onMeasure(paramInt1, View.MeasureSpec.makeMeasureSpec(a.a(82.0F), 1073741824));
          }
        };
        continue;
        paramViewGroup = new org.vidogram.ui.c.r(this.b);
        continue;
        paramViewGroup = new t(this.b, 17);
        ((t)paramViewGroup).setAddOnClickListener(new View.OnClickListener()
        {
          public void onClick(View paramView)
          {
            paramView = (t)paramView.getParent();
            g.bf localbf = paramView.getStickerSet();
            if ((p.O(p.this).containsKey(Long.valueOf(localbf.b.b))) || (p.P(p.this).containsKey(Long.valueOf(localbf.b.b))))
              return;
            if (paramView.a())
            {
              p.P(p.this).put(Long.valueOf(localbf.b.b), localbf);
              p.h(p.this).c(paramView.getStickerSet());
            }
            while (true)
            {
              paramView.setDrawProgress(true);
              return;
              p.O(p.this).put(Long.valueOf(localbf.b.b), localbf);
              p.h(p.this).b(paramView.getStickerSet());
            }
          }
        });
      }
    }

    public void a(RecyclerView.u paramu, int paramInt)
    {
      boolean bool4 = false;
      switch (paramu.h())
      {
      default:
        return;
      case 0:
        localObject = (g.q)this.d.get(Integer.valueOf(paramInt));
        ((org.vidogram.ui.c.aw)paramu.a).a((g.q)localObject, false);
        return;
      case 1:
        ((org.vidogram.ui.c.r)paramu.a).setHeight(a.a(82.0F));
        return;
      case 2:
      }
      ArrayList localArrayList = g.f();
      Object localObject = (g.bf)this.e.get(((Integer)this.d.get(Integer.valueOf(paramInt))).intValue());
      boolean bool1;
      boolean bool2;
      if ((localArrayList != null) && (localArrayList.contains(Long.valueOf(((g.bf)localObject).b.b))))
      {
        bool1 = true;
        paramu = (t)paramu.a;
        paramu.a((g.bf)localObject, bool1);
        if (bool1)
          g.c(((g.bf)localObject).b.b);
        bool1 = p.O(p.this).containsKey(Long.valueOf(((g.bf)localObject).b.b));
        bool2 = p.P(p.this).containsKey(Long.valueOf(((g.bf)localObject).b.b));
        if ((!bool1) && (!bool2))
          break label336;
        if ((!bool1) || (!paramu.a()))
          break label290;
        p.O(p.this).remove(Long.valueOf(((g.bf)localObject).b.b));
        bool1 = bool2;
        bool2 = false;
      }
      while (true)
      {
        if (!bool2)
        {
          bool2 = bool4;
          if (!bool1);
        }
        else
        {
          bool2 = true;
        }
        paramu.setDrawProgress(bool2);
        return;
        bool1 = false;
        break;
        label290: if ((bool2) && (!paramu.a()))
        {
          p.P(p.this).remove(Long.valueOf(((g.bf)localObject).b.b));
          bool3 = false;
          bool2 = bool1;
          bool1 = bool3;
          continue;
        }
        label336: boolean bool3 = bool1;
        bool1 = bool2;
        bool2 = bool3;
      }
    }

    public void c()
    {
      if (p.Q(p.this))
        return;
      int j = p.this.getMeasuredWidth();
      int i = j;
      if (j == 0)
        i = a.c.x;
      this.c = (i / a.a(72.0F));
      p.R(p.this).a(this.c);
      this.d.clear();
      this.f.clear();
      this.e.clear();
      this.g = 0;
      ArrayList localArrayList = g.e();
      i = 0;
      j = 0;
      if (i < localArrayList.size())
      {
        g.bf localbf = (g.bf)localArrayList.get(i);
        int k = j;
        if (!g.a(localbf.b.b))
          if ((!localbf.c.isEmpty()) || (localbf.d != null))
            break label158;
        for (k = j; ; k = j + 1)
        {
          i += 1;
          j = k;
          break;
          label158: this.e.add(localbf);
          this.f.put(Integer.valueOf(this.g), localbf);
          HashMap localHashMap = this.d;
          k = this.g;
          this.g = (k + 1);
          localHashMap.put(Integer.valueOf(k), Integer.valueOf(j));
          k = this.g / this.c;
          int m;
          if (!localbf.c.isEmpty())
          {
            m = (int)Math.ceil(localbf.c.size() / this.c);
            k = 0;
            while (k < localbf.c.size())
            {
              this.d.put(Integer.valueOf(this.g + k), localbf.c.get(k));
              k += 1;
            }
          }
          for (k = m; ; k = 1)
          {
            m = 0;
            while (m < this.c * k)
            {
              this.f.put(Integer.valueOf(this.g + m), localbf);
              m += 1;
            }
            this.d.put(Integer.valueOf(this.g), localbf.d);
          }
          this.g += k * this.c;
        }
      }
      if (this.g != 0)
        p.c(p.this, true);
      super.c();
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.Components.p
 * JD-Core Version:    0.6.0
 */