package org.vidogram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.media.ExifInterface;
import android.os.Build.VERSION;
import android.text.TextUtils.TruncateAt;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewAnimationUtils;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import org.vidogram.messenger.ApplicationLoader;
import org.vidogram.messenger.MediaController;
import org.vidogram.messenger.MediaController.a;
import org.vidogram.messenger.MediaController.i;
import org.vidogram.messenger.c.a.b;
import org.vidogram.messenger.c.c;
import org.vidogram.messenger.c.d;
import org.vidogram.messenger.c.d.a;
import org.vidogram.messenger.d.e;
import org.vidogram.messenger.n;
import org.vidogram.messenger.r;
import org.vidogram.messenger.support.widget.LinearLayoutManager;
import org.vidogram.messenger.support.widget.RecyclerView;
import org.vidogram.messenger.support.widget.RecyclerView.a;
import org.vidogram.messenger.support.widget.RecyclerView.g;
import org.vidogram.messenger.support.widget.RecyclerView.h;
import org.vidogram.messenger.support.widget.RecyclerView.i;
import org.vidogram.messenger.support.widget.RecyclerView.l;
import org.vidogram.messenger.support.widget.RecyclerView.r;
import org.vidogram.messenger.support.widget.RecyclerView.u;
import org.vidogram.messenger.u;
import org.vidogram.messenger.y;
import org.vidogram.messenger.y.b;
import org.vidogram.tgnet.g.aw;
import org.vidogram.tgnet.g.to;
import org.vidogram.tgnet.g.vw;
import org.vidogram.tgnet.g.vx;
import org.vidogram.tgnet.g.x;
import org.vidogram.ui.a.h;
import org.vidogram.ui.a.h.c;
import org.vidogram.ui.a.h.e;
import org.vidogram.ui.am;
import org.vidogram.ui.am.b;
import org.vidogram.ui.am.d;
import org.vidogram.ui.am.e;
import org.vidogram.ui.c.ae;
import org.vidogram.ui.c.af;
import org.vidogram.ui.c.af.a;
import org.vidogram.ui.c.ap;

public class f extends h
  implements y.b, h.c, am.d
{
  private TextView A;
  private ImageView[] B = new ImageView[2];
  private boolean C;
  private int[] D = new int[2];
  private int E;
  private int F;
  private boolean G;
  private boolean H;
  private boolean I;
  private float J;
  private int[] K = new int[5];
  private int L;
  private Runnable M;
  private DecelerateInterpolator N = new DecelerateInterpolator(1.5F);
  private FrameLayout O;
  private be P;
  private ImageView Q;
  private File R;
  private boolean S;
  private ArrayList<Object> T;
  private float U;
  private boolean V;
  private boolean W;
  private AnimatorSet X;
  private boolean Y;
  private Runnable Z;
  private boolean aa;
  private DecelerateInterpolator ab = new DecelerateInterpolator();
  private boolean ac = true;
  private c ad;
  private int ae;
  private boolean af;
  private boolean ag;
  private float ah;
  private int ai;
  private int aj;
  private boolean ak;
  private LinearLayoutManager i;
  private g j;
  private org.vidogram.ui.q k;
  private b l;
  private View[] m = new View[20];
  private aw n;
  private View o;
  private q p;
  private ArrayList<d> q = new ArrayList(8);
  private aw r;
  private LinearLayoutManager s;
  private Drawable t;
  private ViewGroup u;
  private f v;
  private TextView w;
  private ArrayList<e> x = new ArrayList();
  private d y;
  private FrameLayout z;

  public f(Context paramContext, org.vidogram.ui.q paramq)
  {
    super(paramContext, false);
    this.k = paramq;
    a(this);
    g(true);
    e(false);
    if (this.aa)
      org.vidogram.messenger.c.a.a().b();
    y.a().a(this, y.aM);
    y.a().a(this, y.af);
    y.a().a(this, y.ai);
    this.t = paramContext.getResources().getDrawable(2130838147);
    Object localObject1 = new aw(paramContext)
    {
      private int l;
      private int m;

      public void onDraw(Canvas paramCanvas)
      {
        if ((f.k(f.this)) && (Build.VERSION.SDK_INT <= 19))
        {
          paramCanvas.save();
          paramCanvas.clipRect(f.t(), f.f(f.this), getMeasuredWidth() - f.u(), getMeasuredHeight());
          if (f.l(f.this))
            paramCanvas.drawCircle(f.m(f.this), f.n(f.this), f.o(f.this), f.p(f.this));
          while (true)
          {
            paramCanvas.restore();
            return;
            paramCanvas.drawRect(f.v(), f.f(f.this), getMeasuredWidth() - f.B(), getMeasuredHeight(), f.q(f.this));
          }
        }
        f.r(f.this).setBounds(0, f.f(f.this) - f.C(), getMeasuredWidth(), getMeasuredHeight());
        f.r(f.this).draw(paramCanvas);
      }

      public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
      {
        if (f.d(f.this))
          return true;
        if (f.e(f.this))
          return f.a(f.this, paramMotionEvent);
        if ((paramMotionEvent.getAction() == 0) && (f.f(f.this) != 0) && (paramMotionEvent.getY() < f.f(f.this)))
        {
          f.this.dismiss();
          return true;
        }
        return super.onInterceptTouchEvent(paramMotionEvent);
      }

      protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
      {
        int i1 = paramInt4 - paramInt2;
        int i;
        int j;
        if (f.g(f.this).getChildCount() > 0)
        {
          View localView = f.g(f.this).getChildAt(f.g(f.this).getChildCount() - 1);
          f.d locald = (f.d)f.g(f.this).c(localView);
          if (locald != null)
          {
            i = locald.e();
            j = localView.getTop();
          }
        }
        while (true)
        {
          if ((i >= 0) && (i1 - this.m != 0))
          {
            int n = j + i1 - this.m - getPaddingTop();
            j = i;
            i = n;
          }
          while (true)
          {
            super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
            if (j != -1)
            {
              f.b(f.this, true);
              f.h(f.this).a(j, i);
              super.onLayout(false, paramInt1, paramInt2, paramInt3, paramInt4);
              f.b(f.this, false);
            }
            this.m = i1;
            this.l = (paramInt3 - paramInt1);
            f.i(f.this);
            f.j(f.this);
            return;
            i = 0;
            j = -1;
          }
          j = 0;
          i = -1;
        }
      }

      protected void onMeasure(int paramInt1, int paramInt2)
      {
        paramInt2 = View.MeasureSpec.getSize(paramInt2);
        int j = paramInt2;
        if (Build.VERSION.SDK_INT >= 21)
          j = paramInt2 - org.vidogram.messenger.a.a;
        int i = f.p();
        int n = org.vidogram.messenger.a.a(294.0F);
        if (e.b.isEmpty())
        {
          paramInt2 = 0;
          n = n + i + paramInt2;
          if (n != org.vidogram.messenger.a.a(294.0F))
            break label185;
        }
        label185: for (i = 0; ; i = Math.max(0, j - org.vidogram.messenger.a.a(294.0F)))
        {
          paramInt2 = i;
          if (i != 0)
          {
            paramInt2 = i;
            if (n < j)
              paramInt2 = i - (j - n);
          }
          i = paramInt2;
          if (paramInt2 == 0)
            i = f.q();
          if (getPaddingTop() != i)
          {
            f.b(f.this, true);
            setPadding(f.r(), i, f.s(), 0);
            f.b(f.this, false);
          }
          super.onMeasure(paramInt1, View.MeasureSpec.makeMeasureSpec(Math.min(n, j), 1073741824));
          return;
          paramInt2 = (int)Math.ceil(e.b.size() / 4.0F) * org.vidogram.messenger.a.a(100.0F) + org.vidogram.messenger.a.a(12.0F);
          break;
        }
      }

      public boolean onTouchEvent(MotionEvent paramMotionEvent)
      {
        if (f.d(f.this));
        do
        {
          return true;
          if (f.e(f.this))
            return f.a(f.this, paramMotionEvent);
        }
        while ((!f.this.e()) && (super.onTouchEvent(paramMotionEvent)));
        return false;
      }

      public void requestLayout()
      {
        if (f.c(f.this))
          return;
        super.requestLayout();
      }

      public void setTranslationY(float paramFloat)
      {
        super.setTranslationY(paramFloat);
        f.j(f.this);
      }
    };
    this.r = ((aw)localObject1);
    this.a = ((ViewGroup)localObject1);
    this.r.setWillNotDraw(false);
    this.r.setClipToPadding(false);
    localObject1 = this.r;
    Object localObject2 = new LinearLayoutManager(getContext());
    this.s = ((LinearLayoutManager)localObject2);
    ((aw)localObject1).setLayoutManager((RecyclerView.h)localObject2);
    this.s.b(1);
    localObject1 = this.r;
    localObject2 = new f(paramContext);
    this.v = ((f)localObject2);
    ((aw)localObject1).setAdapter((RecyclerView.a)localObject2);
    this.r.setVerticalScrollBarEnabled(false);
    this.r.setEnabled(true);
    this.r.setGlowColor(-657673);
    this.r.a(new RecyclerView.g()
    {
      public void a(Rect paramRect, View paramView, RecyclerView paramRecyclerView, RecyclerView.r paramr)
      {
        paramRect.left = 0;
        paramRect.right = 0;
        paramRect.top = 0;
        paramRect.bottom = 0;
      }
    });
    this.r.setOnScrollListener(new RecyclerView.l()
    {
      public void a(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
      {
        if (f.g(f.this).getChildCount() <= 0)
          return;
        if ((f.s(f.this)) && (f.h(f.this).n() > 1))
        {
          f.t(f.this);
          f.c(f.this, false);
          ApplicationLoader.a.getSharedPreferences("mainconfig", 0).edit().putBoolean("bothint", true).commit();
        }
        f.i(f.this);
        f.j(f.this);
      }
    });
    this.a.setPadding(g, 0, g, 0);
    this.u = new FrameLayout(paramContext)
    {
      protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
      {
        int i = 0;
        paramInt1 = paramInt3 - paramInt1;
        paramInt2 = paramInt4 - paramInt2;
        paramInt3 = org.vidogram.messenger.a.a(8.0F);
        f.u(f.this).layout(0, paramInt3, paramInt1, f.u(f.this).getMeasuredHeight() + paramInt3);
        f.v(f.this).layout(0, paramInt3, paramInt1, f.v(f.this).getMeasuredHeight() + paramInt3);
        f.w(f.this).layout(0, org.vidogram.messenger.a.a(96.0F), paramInt1, org.vidogram.messenger.a.a(96.0F) + f.w(f.this).getMeasuredHeight());
        f.x(f.this).layout(paramInt1 - f.x(f.this).getMeasuredWidth() - org.vidogram.messenger.a.a(5.0F), paramInt2 - f.x(f.this).getMeasuredHeight() - org.vidogram.messenger.a.a(5.0F), paramInt1 - org.vidogram.messenger.a.a(5.0F), paramInt2 - org.vidogram.messenger.a.a(5.0F));
        paramInt2 = (paramInt1 - org.vidogram.messenger.a.a(360.0F)) / 3;
        paramInt1 = i;
        while (paramInt1 < 8)
        {
          paramInt3 = org.vidogram.messenger.a.a(paramInt1 / 4 * 95 + 105);
          paramInt4 = org.vidogram.messenger.a.a(10.0F) + paramInt1 % 4 * (org.vidogram.messenger.a.a(85.0F) + paramInt2);
          f.y(f.this)[paramInt1].layout(paramInt4, paramInt3, f.y(f.this)[paramInt1].getMeasuredWidth() + paramInt4, f.y(f.this)[paramInt1].getMeasuredHeight() + paramInt3);
          paramInt1 += 1;
        }
      }

      protected void onMeasure(int paramInt1, int paramInt2)
      {
        super.onMeasure(paramInt1, View.MeasureSpec.makeMeasureSpec(org.vidogram.messenger.a.a(294.0F), 1073741824));
      }
    };
    localObject1 = this.m;
    localObject2 = new aw(paramContext);
    this.n = ((aw)localObject2);
    localObject1[8] = localObject2;
    this.n.setVerticalScrollBarEnabled(true);
    localObject1 = this.n;
    localObject2 = new g(paramContext);
    this.j = ((g)localObject2);
    ((aw)localObject1).setAdapter((RecyclerView.a)localObject2);
    this.n.setClipToPadding(false);
    this.n.setPadding(org.vidogram.messenger.a.a(8.0F), 0, org.vidogram.messenger.a.a(8.0F), 0);
    this.n.setItemAnimator(null);
    this.n.setLayoutAnimation(null);
    this.n.setOverScrollMode(2);
    this.u.addView(this.n, v.a(-1, 80.0F));
    this.i = new LinearLayoutManager(paramContext)
    {
      public boolean c()
      {
        return false;
      }
    };
    this.i.b(0);
    this.n.setLayoutManager(this.i);
    this.n.setOnItemClickListener(new aw.b()
    {
      public void a(View paramView, int paramInt)
      {
        if ((f.a(f.this) == null) || (f.a(f.this).l() == null));
        label139: label140: 
        while (true)
        {
          return;
          if ((!f.z(f.this)) || (paramInt != 0))
          {
            if (!f.z(f.this))
              break label139;
            paramInt -= 1;
          }
          while (true)
          {
            if (MediaController.e == null)
              break label140;
            paramView = MediaController.e.d;
            if ((paramInt < 0) || (paramInt >= paramView.size()))
              break;
            am.a().a(f.a(f.this).l());
            am.a().a(paramView, paramInt, 0, f.this, f.a(f.this));
            org.vidogram.messenger.a.b(f.a(f.this).a().findFocus());
            return;
            f.A(f.this);
            return;
          }
        }
      }
    });
    this.n.setOnScrollListener(new RecyclerView.l()
    {
      public void a(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
      {
        f.j(f.this);
      }
    });
    localObject1 = this.m;
    localObject2 = new q(paramContext);
    this.p = ((q)localObject2);
    localObject1[9] = localObject2;
    if ((Build.VERSION.SDK_INT >= 23) && (getContext().checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0))
    {
      this.p.setText(r.a("PermissionStorage", 2131231662));
      this.p.setTextSize(16);
    }
    while (true)
    {
      this.u.addView(this.p, v.a(-1, 80.0F));
      this.n.setEmptyView(this.p);
      localObject1 = this.m;
      localObject2 = new View(getContext())
      {
        public boolean hasOverlappingRendering()
        {
          return false;
        }
      };
      this.o = ((View)localObject2);
      localObject1[10] = localObject2;
      this.o.setBackgroundColor(-2960686);
      this.u.addView(this.o, new FrameLayout.LayoutParams(-1, 1, 51));
      localObject1 = r.a("ChatCamera", 2131231047);
      localObject2 = r.a("ChatGallery", 2131231049);
      String str1 = r.a("ChatVideo", 2131231054);
      String str2 = r.a("AttachMusic", 2131230899);
      String str3 = r.a("ChatDocument", 2131231048);
      String str4 = r.a("AttachContact", 2131230894);
      String str5 = r.a("ChatLocation", 2131231052);
      i1 = 0;
      while (i1 < 8)
      {
        b localb = new b(paramContext);
        localb.a(new CharSequence[] { localObject1, localObject2, str1, str2, str3, str4, str5, "" }[i1], org.vidogram.ui.a.l.R[i1]);
        this.u.addView(localb, v.b(85, 90, 51));
        localb.setTag(Integer.valueOf(i1));
        this.m[i1] = localb;
        if (i1 == 7)
        {
          this.l = localb;
          b.a(this.l).setPadding(0, org.vidogram.messenger.a.a(4.0F), 0, 0);
        }
        localb.setOnClickListener(new View.OnClickListener()
        {
          public void onClick(View paramView)
          {
            f.b(f.this).a(((Integer)paramView.getTag()).intValue());
          }
        });
        i1 += 1;
      }
      this.p.setText(r.a("NoPhotos", 2131231503));
      this.p.setTextSize(20);
    }
    this.w = new TextView(paramContext);
    this.w.setBackgroundResource(2130838190);
    this.w.setTextColor(-1);
    this.w.setTextSize(1, 14.0F);
    this.w.setPadding(org.vidogram.messenger.a.a(10.0F), 0, org.vidogram.messenger.a.a(10.0F), 0);
    this.w.setText(r.a("AttachBotsHelp", 2131230893));
    this.w.setGravity(16);
    this.w.setVisibility(4);
    this.w.setCompoundDrawablesWithIntrinsicBounds(2130838120, 0, 0, 0);
    this.w.setCompoundDrawablePadding(org.vidogram.messenger.a.a(8.0F));
    this.u.addView(this.w, v.a(-2, 32.0F, 85, 5.0F, 0.0F, 5.0F, 5.0F));
    int i1 = 0;
    while (i1 < 8)
    {
      this.q.add(this.j.e());
      i1 += 1;
    }
    if (this.ac)
      this.p.a();
    while (Build.VERSION.SDK_INT >= 16)
    {
      this.A = new TextView(paramContext);
      this.A.setBackgroundResource(2130838163);
      this.A.getBackground().setColorFilter(new PorterDuffColorFilter(1711276032, PorterDuff.Mode.MULTIPLY));
      this.A.setText("00:00");
      this.A.setTextSize(1, 15.0F);
      this.A.setTypeface(org.vidogram.messenger.a.a("fonts/rmedium.ttf"));
      this.A.setAlpha(0.0F);
      this.A.setTextColor(-1);
      this.A.setPadding(org.vidogram.messenger.a.a(10.0F), org.vidogram.messenger.a.a(5.0F), org.vidogram.messenger.a.a(10.0F), org.vidogram.messenger.a.a(5.0F));
      this.b.addView(this.A, v.a(-2, -2.0F, 49, 0.0F, 16.0F, 0.0F, 0.0F));
      this.O = new FrameLayout(paramContext)
      {
        protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
        {
          paramInt2 = getMeasuredWidth() / 2;
          paramInt1 = getMeasuredHeight() / 2;
          f.B(f.this).layout(paramInt2 - f.B(f.this).getMeasuredWidth() / 2, paramInt1 - f.B(f.this).getMeasuredHeight() / 2, f.B(f.this).getMeasuredWidth() / 2 + paramInt2, f.B(f.this).getMeasuredHeight() / 2 + paramInt1);
          if (getMeasuredWidth() == org.vidogram.messenger.a.a(100.0F))
          {
            paramInt3 = getMeasuredWidth() / 2;
            int i = paramInt1 / 2 + paramInt1 + org.vidogram.messenger.a.a(17.0F);
            paramInt1 = paramInt1 / 2 - org.vidogram.messenger.a.a(17.0F);
            paramInt2 = paramInt3;
            paramInt4 = paramInt3;
            paramInt3 = i;
          }
          while (true)
          {
            f.C(f.this).layout(paramInt4 - f.C(f.this).getMeasuredWidth() / 2, paramInt3 - f.C(f.this).getMeasuredHeight() / 2, paramInt4 + f.C(f.this).getMeasuredWidth() / 2, paramInt3 + f.C(f.this).getMeasuredHeight() / 2);
            paramInt3 = 0;
            while (paramInt3 < 2)
            {
              f.D(f.this)[paramInt3].layout(paramInt2 - f.D(f.this)[paramInt3].getMeasuredWidth() / 2, paramInt1 - f.D(f.this)[paramInt3].getMeasuredHeight() / 2, f.D(f.this)[paramInt3].getMeasuredWidth() / 2 + paramInt2, f.D(f.this)[paramInt3].getMeasuredHeight() / 2 + paramInt1);
              paramInt3 += 1;
            }
            paramInt4 = paramInt2 / 2 + paramInt2 + org.vidogram.messenger.a.a(17.0F);
            paramInt1 = paramInt2 / 2;
            paramInt2 = org.vidogram.messenger.a.a(17.0F);
            paramInt3 = getMeasuredHeight() / 2;
            paramInt2 = paramInt1 - paramInt2;
            paramInt1 = paramInt3;
          }
        }
      };
      this.O.setVisibility(8);
      this.O.setAlpha(0.0F);
      this.b.addView(this.O, v.b(-1, 100, 83));
      this.P = new be(paramContext);
      this.O.addView(this.P, v.b(84, 84, 17));
      this.P.setDelegate(new be.a(paramq)
      {
        public void a()
        {
          if ((f.E(f.this)) || (f.a(f.this) == null) || (f.a(f.this).l() == null))
            return;
          if ((Build.VERSION.SDK_INT >= 23) && (f.a(f.this).l().checkSelfPermission("android.permission.RECORD_AUDIO") != 0))
          {
            f.a(f.this).l().requestPermissions(new String[] { "android.permission.RECORD_AUDIO" }, 21);
            return;
          }
          int i = 0;
          while (i < 2)
          {
            f.D(f.this)[i].setAlpha(0.0F);
            i += 1;
          }
          f.C(f.this).setAlpha(0.0F);
          f.a(f.this, org.vidogram.messenger.a.j());
          f.F(f.this).setAlpha(1.0F);
          f.F(f.this).setText("00:00");
          f.a(f.this, 0);
          f.a(f.this, new Runnable()
          {
            public void run()
            {
              if (f.G(f.this) == null)
                return;
              f.H(f.this);
              f.F(f.this).setText(String.format("%02d:%02d", new Object[] { Integer.valueOf(f.I(f.this) / 60), Integer.valueOf(f.I(f.this) % 60) }));
              org.vidogram.messenger.a.a(f.G(f.this), 1000L);
            }
          });
          org.vidogram.messenger.a.a(this.a.l());
          org.vidogram.messenger.c.a.a().a(f.J(f.this).getCameraSession(), f.K(f.this), new a.b()
          {
            public void a(Bitmap paramBitmap)
            {
              if ((f.K(f.this) == null) || (f.a(f.this) == null))
                return;
              am.a().a(f.a(f.this).l());
              f.a(f.this, new ArrayList());
              f.L(f.this).add(new MediaController.i(0, 0, 0L, f.K(f.this).getAbsolutePath(), 0, true));
              am.a().a(f.L(f.this), 0, 2, new am.b(paramBitmap)
              {
                public Bitmap b(u paramu, g.x paramx, int paramInt)
                {
                  return this.a;
                }

                public void d(int paramInt)
                {
                  if (f.K(f.this) == null)
                    return;
                  org.vidogram.messenger.a.c(f.K(f.this).getAbsolutePath());
                  f.a(f.this).a((MediaController.i)f.L(f.this).get(0), am.a().b());
                  f.this.c(false);
                  f.this.dismiss();
                  f.a(f.this, null);
                }

                @TargetApi(16)
                public boolean z()
                {
                  if ((f.e(f.this)) && (f.J(f.this) != null) && (f.K(f.this) != null))
                  {
                    f.K(f.this).delete();
                    org.vidogram.messenger.a.a(new Runnable()
                    {
                      public void run()
                      {
                        if ((f.J(f.this) != null) && (!f.this.e()) && (Build.VERSION.SDK_INT >= 21))
                          f.J(f.this).setSystemUiVisibility(1028);
                      }
                    }
                    , 1000L);
                    org.vidogram.messenger.c.a.a().a(f.J(f.this).getCameraSession());
                    f.a(f.this, null);
                  }
                  return true;
                }
              }
              , f.a(f.this));
            }
          });
          org.vidogram.messenger.a.a(f.G(f.this), 1000L);
          f.B(f.this).a(be.b.b, true);
        }

        public void b()
        {
          f.K(f.this).delete();
          f.M(f.this);
          org.vidogram.messenger.c.a.a().a(f.J(f.this).getCameraSession(), true);
        }

        public void c()
        {
          if (f.E(f.this))
            return;
          if (f.B(f.this).getState() == be.b.b)
          {
            f.M(f.this);
            org.vidogram.messenger.c.a.a().a(f.J(f.this).getCameraSession(), false);
            f.B(f.this).a(be.b.a, true);
            return;
          }
          f.a(f.this, org.vidogram.messenger.a.i());
          f.d(f.this, org.vidogram.messenger.c.a.a().a(f.K(f.this), f.J(f.this).getCameraSession(), new Runnable()
          {
            public void run()
            {
              f.d(f.this, false);
              if ((f.K(f.this) == null) || (f.a(f.this) == null))
                return;
              am.a().a(f.a(f.this).l());
              f.a(f.this, new ArrayList());
              try
              {
                i = new ExifInterface(f.K(f.this).getAbsolutePath()).getAttributeInt("Orientation", 1);
                switch (i)
                {
                case 4:
                case 5:
                case 7:
                default:
                  i = 0;
                case 6:
                case 3:
                case 8:
                }
                while (true)
                {
                  f.L(f.this).add(new MediaController.i(0, 0, 0L, f.K(f.this).getAbsolutePath(), i, false));
                  am.a().a(f.L(f.this), 0, 2, new am.b()
                  {
                    public void d(int paramInt)
                    {
                      if (f.K(f.this) == null)
                        return;
                      org.vidogram.messenger.a.c(f.K(f.this).getAbsolutePath());
                      f.a(f.this).a((MediaController.i)f.L(f.this).get(0), false);
                      f.this.c(false);
                      f.this.dismiss();
                      f.a(f.this, null);
                    }

                    public boolean x()
                    {
                      return true;
                    }

                    @TargetApi(16)
                    public boolean z()
                    {
                      if ((f.e(f.this)) && (f.J(f.this) != null) && (f.K(f.this) != null))
                      {
                        f.K(f.this).delete();
                        org.vidogram.messenger.a.a(new Runnable()
                        {
                          public void run()
                          {
                            if ((f.J(f.this) != null) && (!f.this.e()) && (Build.VERSION.SDK_INT >= 21))
                              f.J(f.this).setSystemUiVisibility(1028);
                          }
                        }
                        , 1000L);
                        org.vidogram.messenger.c.a.a().a(f.J(f.this).getCameraSession());
                        f.a(f.this, null);
                      }
                      return true;
                    }
                  }
                  , f.a(f.this));
                  return;
                  i = 90;
                  continue;
                  i = 180;
                  continue;
                  i = 270;
                }
              }
              catch (Exception localException)
              {
                while (true)
                {
                  n.a("tmessages", localException);
                  int i = 0;
                }
              }
            }
          }));
        }
      });
      this.Q = new ImageView(paramContext);
      this.Q.setScaleType(ImageView.ScaleType.CENTER);
      this.O.addView(this.Q, v.b(48, 48, 21));
      this.Q.setOnClickListener(new View.OnClickListener()
      {
        public void onClick(View paramView)
        {
          if ((f.E(f.this)) || (f.J(f.this) == null) || (!f.J(f.this).d()))
            return;
          f.e(f.this, false);
          f.J(f.this).c();
          paramView = ObjectAnimator.ofFloat(f.C(f.this), "scaleX", new float[] { 0.0F }).setDuration(100L);
          paramView.addListener(new org.vidogram.messenger.b()
          {
            public void onAnimationEnd(Animator paramAnimator)
            {
              paramAnimator = f.C(f.this);
              if (f.J(f.this).a());
              for (int i = 2130837676; ; i = 2130837677)
              {
                paramAnimator.setImageResource(i);
                ObjectAnimator.ofFloat(f.C(f.this), "scaleX", new float[] { 1.0F }).setDuration(100L).start();
                return;
              }
            }
          });
          paramView.start();
        }
      });
      i1 = 0;
      while (i1 < 2)
      {
        this.B[i1] = new ImageView(paramContext);
        this.B[i1].setScaleType(ImageView.ScaleType.CENTER);
        this.B[i1].setVisibility(4);
        this.O.addView(this.B[i1], v.b(48, 48, 51));
        this.B[i1].setOnClickListener(new View.OnClickListener()
        {
          public void onClick(View paramView)
          {
            if ((f.N(f.this)) || (f.J(f.this) == null) || (!f.J(f.this).d()) || (!f.e(f.this)));
            Object localObject2;
            do
            {
              return;
              localObject1 = f.J(f.this).getCameraSession().a();
              localObject2 = f.J(f.this).getCameraSession().b();
            }
            while (((String)localObject1).equals(localObject2));
            f.J(f.this).getCameraSession().b((String)localObject2);
            f.f(f.this, true);
            if (f.D(f.this)[0] == paramView);
            for (Object localObject1 = f.D(f.this)[1]; ; localObject1 = f.D(f.this)[0])
            {
              ((ImageView)localObject1).setVisibility(0);
              f.a(f.this, (ImageView)localObject1, (String)localObject2);
              localObject2 = new AnimatorSet();
              ((AnimatorSet)localObject2).playTogether(new Animator[] { ObjectAnimator.ofFloat(paramView, "translationY", new float[] { 0.0F, org.vidogram.messenger.a.a(48.0F) }), ObjectAnimator.ofFloat(localObject1, "translationY", new float[] { -org.vidogram.messenger.a.a(48.0F), 0.0F }), ObjectAnimator.ofFloat(paramView, "alpha", new float[] { 1.0F, 0.0F }), ObjectAnimator.ofFloat(localObject1, "alpha", new float[] { 0.0F, 1.0F }) });
              ((AnimatorSet)localObject2).setDuration(200L);
              ((AnimatorSet)localObject2).addListener(new org.vidogram.messenger.b(paramView)
              {
                public void onAnimationEnd(Animator paramAnimator)
                {
                  f.f(f.this, false);
                  this.a.setVisibility(4);
                }
              });
              ((AnimatorSet)localObject2).start();
              return;
            }
          }
        });
        i1 += 1;
      }
      this.p.b();
    }
  }

  private void D()
  {
    if (this.k == null)
      return;
    int i1 = 0;
    while (i1 < 2)
    {
      this.B[i1].setAlpha(1.0F);
      i1 += 1;
    }
    this.Q.setAlpha(1.0F);
    this.A.setAlpha(0.0F);
    org.vidogram.messenger.a.b(this.M);
    this.M = null;
    org.vidogram.messenger.a.b(this.k.l());
  }

  private void E()
  {
    if (this.Z != null)
    {
      org.vidogram.messenger.a.b(this.Z);
      this.Z = null;
    }
    if (this.w == null)
      return;
    this.X = new AnimatorSet();
    this.X.playTogether(new Animator[] { ObjectAnimator.ofFloat(this.w, "alpha", new float[] { 0.0F }) });
    this.X.setInterpolator(this.ab);
    this.X.addListener(new org.vidogram.messenger.b()
    {
      public void onAnimationCancel(Animator paramAnimator)
      {
        if ((f.O(f.this) != null) && (f.O(f.this).equals(paramAnimator)))
          f.a(f.this, null);
      }

      public void onAnimationEnd(Animator paramAnimator)
      {
        if ((f.O(f.this) == null) || (!f.O(f.this).equals(paramAnimator)));
        do
        {
          return;
          f.a(f.this, null);
        }
        while (f.x(f.this) == null);
        f.x(f.this).setVisibility(4);
      }
    });
    this.X.setDuration(300L);
    this.X.start();
  }

  @TargetApi(16)
  private void F()
  {
    if (this.y == null)
      return;
    this.K[0] = 0;
    this.K[1] = (org.vidogram.messenger.a.a(80.0F) - this.E);
    this.K[2] = (org.vidogram.messenger.a.a(80.0F) - this.F);
    this.I = true;
    this.O.setVisibility(0);
    this.O.setTag(null);
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(ObjectAnimator.ofFloat(this, "cameraOpenProgress", new float[] { 0.0F, 1.0F }));
    localArrayList.add(ObjectAnimator.ofFloat(this.O, "alpha", new float[] { 1.0F }));
    int i1 = 0;
    while (true)
    {
      if (i1 < 2)
      {
        if (this.B[i1].getVisibility() == 0)
          localArrayList.add(ObjectAnimator.ofFloat(this.B[i1], "alpha", new float[] { 1.0F }));
      }
      else
      {
        AnimatorSet localAnimatorSet = new AnimatorSet();
        localAnimatorSet.playTogether(localArrayList);
        localAnimatorSet.setDuration(200L);
        localAnimatorSet.addListener(new org.vidogram.messenger.b()
        {
          public void onAnimationEnd(Animator paramAnimator)
          {
            f.g(f.this, false);
          }
        });
        localAnimatorSet.start();
        if (Build.VERSION.SDK_INT >= 21)
          this.y.setSystemUiVisibility(1028);
        this.G = true;
        return;
      }
      i1 += 1;
    }
  }

  private void G()
  {
    if (!this.aa)
      return;
    int i2 = this.n.getChildCount();
    int i1 = 0;
    while (true)
    {
      Object localObject;
      if (i1 < i2)
      {
        localObject = this.n.getChildAt(i1);
        if (!(localObject instanceof ae))
          break label312;
        if ((Build.VERSION.SDK_INT < 19) || (((View)localObject).isAttachedToWindow()));
      }
      else
      {
        this.E = 0;
        this.F = 0;
        this.D[0] = org.vidogram.messenger.a.a(-100.0F);
        this.D[1] = 0;
        H();
        return;
      }
      ((View)localObject).getLocationInWindow(this.D);
      float f = this.r.getX() + g;
      if (this.D[0] < f)
      {
        this.E = (int)(f - this.D[0]);
        if (this.E >= org.vidogram.messenger.a.a(80.0F))
        {
          this.E = 0;
          this.D[0] = org.vidogram.messenger.a.a(-100.0F);
          this.D[1] = 0;
          if ((Build.VERSION.SDK_INT < 21) || (this.D[1] >= org.vidogram.messenger.a.a))
            break label304;
          this.F = (org.vidogram.messenger.a.a - this.D[1]);
          if (this.F < org.vidogram.messenger.a.a(80.0F))
            break label282;
          this.F = 0;
          this.D[0] = org.vidogram.messenger.a.a(-100.0F);
          this.D[1] = 0;
        }
      }
      while (true)
      {
        H();
        return;
        localObject = this.D;
        localObject[0] += this.E;
        break;
        this.E = 0;
        break;
        label282: localObject = this.D;
        localObject[1] += this.F;
        continue;
        label304: this.F = 0;
      }
      label312: i1 += 1;
    }
  }

  private void H()
  {
    if (this.y != null)
    {
      if (!this.G)
      {
        this.y.setTranslationX(this.D[0]);
        this.y.setTranslationY(this.D[1]);
      }
      this.z.setTranslationX(this.D[0]);
      this.z.setTranslationY(this.D[1]);
      int i1 = org.vidogram.messenger.a.a(80.0F) - this.E;
      int i2 = org.vidogram.messenger.a.a(80.0F) - this.F;
      if (!this.G)
      {
        this.y.setClipLeft(this.E);
        this.y.setClipTop(this.F);
        localLayoutParams = (FrameLayout.LayoutParams)this.y.getLayoutParams();
        if ((localLayoutParams.height != i2) || (localLayoutParams.width != i1))
        {
          localLayoutParams.width = i1;
          localLayoutParams.height = i2;
          this.y.setLayoutParams(localLayoutParams);
          org.vidogram.messenger.a.a(new Runnable(localLayoutParams)
          {
            public void run()
            {
              if (f.J(f.this) != null)
                f.J(f.this).setLayoutParams(this.a);
            }
          });
        }
      }
      FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)this.z.getLayoutParams();
      if ((localLayoutParams.height != i2) || (localLayoutParams.width != i1))
      {
        localLayoutParams.width = i1;
        localLayoutParams.height = i2;
        this.z.setLayoutParams(localLayoutParams);
        org.vidogram.messenger.a.a(new Runnable(localLayoutParams)
        {
          public void run()
          {
            if (f.Q(f.this) != null)
              f.Q(f.this).setLayoutParams(this.a);
          }
        });
      }
    }
  }

  private void I()
  {
    if (e.b.isEmpty());
    do
      return;
    while (ApplicationLoader.a.getSharedPreferences("mainconfig", 0).getBoolean("bothint", false));
    this.Y = true;
    this.w.setVisibility(0);
    this.X = new AnimatorSet();
    this.X.playTogether(new Animator[] { ObjectAnimator.ofFloat(this.w, "alpha", new float[] { 0.0F, 1.0F }) });
    this.X.setInterpolator(this.ab);
    this.X.addListener(new org.vidogram.messenger.b()
    {
      public void onAnimationCancel(Animator paramAnimator)
      {
        if ((f.O(f.this) != null) && (f.O(f.this).equals(paramAnimator)))
          f.a(f.this, null);
      }

      public void onAnimationEnd(Animator paramAnimator)
      {
        if ((f.O(f.this) == null) || (!f.O(f.this).equals(paramAnimator)))
          return;
        f.a(f.this, null);
        org.vidogram.messenger.a.a(f.b(f.this, new Runnable()
        {
          public void run()
          {
            if (f.R(f.this) != this)
              return;
            f.b(f.this, null);
            f.t(f.this);
          }
        }), 2000L);
      }
    });
    this.X.setDuration(300L);
    this.X.start();
  }

  @SuppressLint({"NewApi"})
  private void J()
  {
    Object localObject;
    int i1;
    if (this.r.getChildCount() <= 0)
    {
      localObject = this.r;
      i1 = this.r.getPaddingTop();
      this.ae = i1;
      ((aw)localObject).setTopGlowOffset(i1);
      this.r.invalidate();
    }
    while (true)
    {
      return;
      localObject = this.r.getChildAt(0);
      d locald = (d)this.r.c((View)localObject);
      i1 = ((View)localObject).getTop();
      if ((i1 >= 0) && (locald != null) && (locald.e() == 0));
      while (this.ae != i1)
      {
        localObject = this.r;
        this.ae = i1;
        ((aw)localObject).setTopGlowOffset(i1);
        this.r.invalidate();
        return;
        i1 = 0;
      }
    }
  }

  private void a(ImageView paramImageView, String paramString)
  {
    int i1 = -1;
    switch (paramString.hashCode())
    {
    default:
    case 109935:
    case 3551:
    case 3005871:
    }
    while (true)
      switch (i1)
      {
      default:
        return;
        if (!paramString.equals("off"))
          continue;
        i1 = 0;
        continue;
        if (!paramString.equals("on"))
          continue;
        i1 = 1;
        continue;
        if (!paramString.equals("auto"))
          continue;
        i1 = 2;
      case 0:
      case 1:
      case 2:
      }
    paramImageView.setImageResource(2130837767);
    return;
    paramImageView.setImageResource(2130837768);
    return;
    paramImageView.setImageResource(2130837766);
  }

  private boolean b(MotionEvent paramMotionEvent)
  {
    if (((!this.V) && (paramMotionEvent.getActionMasked() == 0)) || (paramMotionEvent.getActionMasked() == 5))
      if (!this.S)
      {
        this.V = true;
        this.W = true;
        this.U = paramMotionEvent.getY();
      }
    do
      while (true)
      {
        return true;
        if (!this.V)
          continue;
        if (paramMotionEvent.getActionMasked() != 2)
          break;
        float f1 = paramMotionEvent.getY();
        float f2 = f1 - this.U;
        if (this.W)
        {
          if (Math.abs(f2) <= org.vidogram.messenger.a.a(0.4F, false))
            continue;
          this.W = false;
          return true;
        }
        this.y.setTranslationY(f2 + this.y.getTranslationY());
        this.U = f1;
        if (this.O.getTag() != null)
          continue;
        this.O.setTag(Integer.valueOf(1));
        paramMotionEvent = new AnimatorSet();
        paramMotionEvent.playTogether(new Animator[] { ObjectAnimator.ofFloat(this.O, "alpha", new float[] { 0.0F }), ObjectAnimator.ofFloat(this.B[0], "alpha", new float[] { 0.0F }), ObjectAnimator.ofFloat(this.B[1], "alpha", new float[] { 0.0F }) });
        paramMotionEvent.setDuration(200L);
        paramMotionEvent.start();
        return true;
      }
    while ((paramMotionEvent.getActionMasked() != 3) && (paramMotionEvent.getActionMasked() != 1) && (paramMotionEvent.getActionMasked() != 6));
    this.V = false;
    if (Math.abs(this.y.getTranslationY()) > this.y.getMeasuredHeight() / 6.0F)
    {
      c(true);
      return true;
    }
    paramMotionEvent = new AnimatorSet();
    paramMotionEvent.playTogether(new Animator[] { ObjectAnimator.ofFloat(this.y, "translationY", new float[] { 0.0F }), ObjectAnimator.ofFloat(this.O, "alpha", new float[] { 1.0F }), ObjectAnimator.ofFloat(this.B[0], "alpha", new float[] { 1.0F }), ObjectAnimator.ofFloat(this.B[1], "alpha", new float[] { 1.0F }) });
    paramMotionEvent.setDuration(250L);
    paramMotionEvent.setInterpolator(this.N);
    paramMotionEvent.start();
    this.O.setTag(null);
    return true;
  }

  private af e(int paramInt)
  {
    if (MediaController.e == null)
      return null;
    int i2 = this.n.getChildCount();
    int i1 = 0;
    if (i1 < i2)
    {
      Object localObject = this.n.getChildAt(i1);
      int i3;
      if ((localObject instanceof af))
      {
        localObject = (af)localObject;
        i3 = ((Integer)((af)localObject).getImageView().getTag()).intValue();
        if ((i3 >= 0) && (i3 < MediaController.e.d.size()))
          break label90;
      }
      label90: 
      do
      {
        i1 += 1;
        break;
      }
      while (i3 != paramInt);
      return localObject;
    }
    return (af)null;
  }

  private void f(boolean paramBoolean)
  {
    y.a().a(false);
    this.ak = false;
    if ((paramBoolean) && (Build.VERSION.SDK_INT <= 19) && (MediaController.e == null))
      MediaController.e(0);
    if (paramBoolean)
    {
      e(true);
      I();
    }
  }

  private void g(boolean paramBoolean)
  {
    if ((!paramBoolean) || ((paramBoolean) && (Build.VERSION.SDK_INT >= 18) && (!org.vidogram.messenger.a.c())))
      this.ag = paramBoolean;
  }

  @SuppressLint({"NewApi"})
  private void h(boolean paramBoolean)
  {
    this.a.setTranslationY(0.0F);
    AnimatorSet localAnimatorSet = new AnimatorSet();
    Object localObject1 = this.ad.a();
    Object localObject2;
    float f1;
    int i1;
    if ((((View)localObject1).getVisibility() == 0) && (((ViewGroup)((View)localObject1).getParent()).getVisibility() == 0))
    {
      localObject2 = new int[2];
      ((View)localObject1).getLocationInWindow(localObject2);
      if (Build.VERSION.SDK_INT <= 19)
      {
        f1 = org.vidogram.messenger.a.c.y - this.a.getMeasuredHeight() - org.vidogram.messenger.a.a;
        this.ai = (localObject2[0] + ((View)localObject1).getMeasuredWidth() / 2);
        i1 = localObject2[1];
        this.aj = (int)(((View)localObject1).getMeasuredHeight() / 2 + i1 - f1);
        if (Build.VERSION.SDK_INT <= 19)
          this.aj -= org.vidogram.messenger.a.a;
      }
    }
    int i3;
    int i2;
    while (true)
    {
      localObject1 = new int[4][];
      localObject1[0] = { 0, 0 };
      localObject1[1] = { 0, org.vidogram.messenger.a.a(304.0F) };
      localObject1[2] = { this.a.getMeasuredWidth(), 0 };
      localObject1[3] = { this.a.getMeasuredWidth(), org.vidogram.messenger.a.a(304.0F) };
      i3 = this.aj - this.ae + f;
      i2 = 0;
      i1 = 0;
      while (i2 < 4)
      {
        i1 = Math.max(i1, (int)Math.ceil(Math.sqrt((this.ai - localObject1[i2][0]) * (this.ai - localObject1[i2][0]) + (i3 - localObject1[i2][1]) * (i3 - localObject1[i2][1]))));
        i2 += 1;
      }
      f1 = this.a.getY();
      break;
      this.ai = (org.vidogram.messenger.a.c.x / 2 + g);
      this.aj = (int)(org.vidogram.messenger.a.c.y - this.a.getY());
    }
    label422: float f2;
    if (this.ai <= this.a.getMeasuredWidth())
    {
      i2 = this.ai;
      localObject1 = new ArrayList(3);
      if (!paramBoolean)
        break label1220;
      f1 = 0.0F;
      if (!paramBoolean)
        break label1227;
      f2 = i1;
      label430: ((ArrayList)localObject1).add(ObjectAnimator.ofFloat(this, "revealRadius", new float[] { f1, f2 }));
      localObject2 = this.d;
      if (!paramBoolean)
        break label1232;
      i3 = 51;
      label468: ((ArrayList)localObject1).add(ObjectAnimator.ofInt(localObject2, "alpha", new int[] { i3 }));
      if (Build.VERSION.SDK_INT < 21)
        break label1263;
    }
    while (true)
    {
      try
      {
        localObject2 = this.a;
        i3 = this.aj;
        if (!paramBoolean)
          continue;
        f1 = 0.0F;
        break label1510;
        ((ArrayList)localObject1).add(ViewAnimationUtils.createCircularReveal((View)localObject2, i2, i3, f1, f2));
        localAnimatorSet.setDuration(320L);
        localAnimatorSet.playTogether((Collection)localObject1);
        localAnimatorSet.addListener(new AnimatorListenerAdapter(paramBoolean, localAnimatorSet)
        {
          public void onAnimationCancel(Animator paramAnimator)
          {
            if ((f.Y(f.this) != null) && (this.b.equals(paramAnimator)))
              f.c(f.this, null);
          }

          public void onAnimationEnd(Animator paramAnimator)
          {
            if ((f.U(f.this) != null) && (f.V(f.this).equals(paramAnimator)))
            {
              f.b(f.this, null);
              f.i(f.this, this.a);
              f.W(f.this).invalidate();
              f.X(f.this).setLayerType(0, null);
              if (this.a);
            }
            try
            {
              f.this.f();
              return;
            }
            catch (Exception paramAnimator)
            {
              n.a("tmessages", paramAnimator);
            }
          }
        });
        if (!paramBoolean)
          break label1498;
        this.x.clear();
        y.a().a(new int[] { y.c });
        y.a().a(true);
        this.ak = true;
        if (Build.VERSION.SDK_INT > 19)
          break label1456;
        i1 = 11;
        i2 = 0;
        if (i2 >= i1)
          break label1498;
        if (Build.VERSION.SDK_INT > 19)
          break label1463;
        if (i2 >= 8)
          continue;
        this.m[i2].setScaleX(0.1F);
        this.m[i2].setScaleY(0.1F);
        this.m[i2].setAlpha(0.0F);
        localObject2 = new e(null);
        i3 = this.m[i2].getLeft() + this.m[i2].getMeasuredWidth() / 2;
        int i4 = this.m[i2].getTop() + this.u.getTop() + this.m[i2].getMeasuredHeight() / 2;
        f1 = (float)Math.sqrt((this.ai - i3) * (this.ai - i3) + (this.aj - i4) * (this.aj - i4));
        float f3 = (this.ai - i3) / f1;
        f2 = (this.aj - i4) / f1;
        localObject1 = this.m[i2];
        float f4 = this.m[i2].getMeasuredWidth() / 2;
        ((View)localObject1).setPivotX(f3 * org.vidogram.messenger.a.a(20.0F) + f4);
        localObject1 = this.m[i2];
        f3 = this.m[i2].getMeasuredHeight() / 2;
        ((View)localObject1).setPivotY(f2 * org.vidogram.messenger.a.a(20.0F) + f3);
        e.a((e)localObject2, f1 - org.vidogram.messenger.a.a(81.0F));
        this.m[i2].setTag(2131230856, Integer.valueOf(1));
        ArrayList localArrayList = new ArrayList();
        if (i2 >= 8)
          break label1492;
        localArrayList.add(ObjectAnimator.ofFloat(this.m[i2], "scaleX", new float[] { 0.7F, 1.05F }));
        localArrayList.add(ObjectAnimator.ofFloat(this.m[i2], "scaleY", new float[] { 0.7F, 1.05F }));
        localObject1 = new AnimatorSet();
        ((AnimatorSet)localObject1).playTogether(new Animator[] { ObjectAnimator.ofFloat(this.m[i2], "scaleX", new float[] { 1.0F }), ObjectAnimator.ofFloat(this.m[i2], "scaleY", new float[] { 1.0F }) });
        ((AnimatorSet)localObject1).setDuration(100L);
        ((AnimatorSet)localObject1).setInterpolator(this.ab);
        if (Build.VERSION.SDK_INT > 19)
          continue;
        localArrayList.add(ObjectAnimator.ofFloat(this.m[i2], "alpha", new float[] { 1.0F }));
        e.a((e)localObject2, new AnimatorSet());
        e.a((e)localObject2).playTogether(localArrayList);
        e.a((e)localObject2).setDuration(150L);
        e.a((e)localObject2).setInterpolator(this.ab);
        e.a((e)localObject2).addListener(new AnimatorListenerAdapter((AnimatorSet)localObject1)
        {
          public void onAnimationEnd(Animator paramAnimator)
          {
            if (this.a != null)
              this.a.start();
          }
        });
        this.x.add(localObject2);
        i2 += 1;
        continue;
        i2 = this.a.getMeasuredWidth();
        break;
        label1220: f1 = i1;
        break label422;
        label1227: f2 = 0.0F;
        break label430;
        label1232: i3 = 0;
        break label468;
        f1 = i1;
        break label1510;
        f2 = 0.0F;
        continue;
      }
      catch (Exception localException)
      {
        n.a("tmessages", localException);
        continue;
      }
      label1263: if (!paramBoolean)
      {
        localAnimatorSet.setDuration(200L);
        ViewGroup localViewGroup = this.a;
        if (this.ai <= this.a.getMeasuredWidth())
          f1 = this.ai;
        while (true)
        {
          localViewGroup.setPivotX(f1);
          this.a.setPivotY(this.aj);
          ((ArrayList)localObject1).add(ObjectAnimator.ofFloat(this.a, "scaleX", new float[] { 0.0F }));
          ((ArrayList)localObject1).add(ObjectAnimator.ofFloat(this.a, "scaleY", new float[] { 0.0F }));
          ((ArrayList)localObject1).add(ObjectAnimator.ofFloat(this.a, "alpha", new float[] { 0.0F }));
          break;
          f1 = this.a.getMeasuredWidth();
        }
      }
      localAnimatorSet.setDuration(250L);
      this.a.setScaleX(1.0F);
      this.a.setScaleY(1.0F);
      this.a.setAlpha(1.0F);
      if (Build.VERSION.SDK_INT > 19)
        continue;
      localAnimatorSet.setStartDelay(20L);
      continue;
      label1456: i1 = 8;
      continue;
      label1463: this.m[i2].setScaleX(0.7F);
      this.m[i2].setScaleY(0.7F);
      continue;
      label1492: localObject1 = null;
      continue;
      label1498: this.h = localAnimatorSet;
      localAnimatorSet.start();
      return;
      label1510: if (!paramBoolean)
        continue;
      f2 = i1;
    }
  }

  public int A()
  {
    return this.j.f().size();
  }

  public am.e a(u paramu, g.x paramx, int paramInt)
  {
    paramu = e(paramInt);
    if (paramu != null)
    {
      paramx = new int[2];
      paramu.getImageView().getLocationInWindow(paramx);
      am.e locale = new am.e();
      locale.b = paramx[0];
      locale.c = paramx[1];
      locale.d = this.n;
      locale.a = paramu.getImageView().getImageReceiver();
      locale.e = locale.a.h();
      locale.k = paramu.getImageView().getScaleX();
      paramu.getCheckBox().setVisibility(8);
      return locale;
    }
    return null;
  }

  public void a(float paramFloat)
  {
    if (this.y == null)
      return;
    this.J = paramFloat;
    float f3 = this.K[1];
    float f4 = this.K[2];
    int i1;
    float f1;
    float f2;
    label72: FrameLayout.LayoutParams localLayoutParams;
    if (org.vidogram.messenger.a.c.x < org.vidogram.messenger.a.c.y)
    {
      i1 = 1;
      if (i1 == 0)
        break label325;
      f1 = this.b.getWidth();
      f2 = this.b.getHeight();
      if (paramFloat != 0.0F)
        break label346;
      this.y.setClipLeft(this.E);
      this.y.setClipTop(this.F);
      this.y.setTranslationX(this.D[0]);
      this.y.setTranslationY(this.D[1]);
      this.z.setTranslationX(this.D[0]);
      this.z.setTranslationY(this.D[1]);
      label156: localLayoutParams = (FrameLayout.LayoutParams)this.y.getLayoutParams();
      localLayoutParams.width = (int)((f1 - f3) * paramFloat + f3);
      localLayoutParams.height = (int)((f2 - f4) * paramFloat + f4);
      if (paramFloat == 0.0F)
        break label389;
      this.y.setClipLeft((int)(this.E * (1.0F - paramFloat)));
      this.y.setClipTop((int)(this.F * (1.0F - paramFloat)));
      localLayoutParams.leftMargin = (int)(this.D[0] * (1.0F - paramFloat));
    }
    for (localLayoutParams.topMargin = (int)(this.K[0] + (this.D[1] - this.K[0]) * (1.0F - paramFloat)); ; localLayoutParams.topMargin = 0)
    {
      this.y.setLayoutParams(localLayoutParams);
      if (paramFloat > 0.5F)
        break label404;
      this.z.setAlpha(1.0F - paramFloat / 0.5F);
      return;
      i1 = 0;
      break;
      label325: f1 = this.b.getWidth();
      f2 = this.b.getHeight();
      break label72;
      label346: if ((this.y.getTranslationX() == 0.0F) && (this.y.getTranslationY() == 0.0F))
        break label156;
      this.y.setTranslationX(0.0F);
      this.y.setTranslationY(0.0F);
      break label156;
      label389: localLayoutParams.leftMargin = 0;
    }
    label404: this.z.setAlpha(0.0F);
  }

  public void a(int paramInt)
  {
    super.a(paramInt);
    if ((paramInt != 0) && (paramInt != 2));
    for (boolean bool = true; ; bool = false)
    {
      d(bool);
      return;
    }
  }

  public void a(int paramInt, Object[] paramArrayOfObject)
  {
    if (paramInt == y.aM)
      if (this.j != null)
      {
        this.ac = false;
        this.p.b();
        this.j.c();
      }
    do
      while (true)
      {
        return;
        if (paramInt != y.af)
          break;
        if (this.v == null)
          continue;
        this.v.c();
        return;
      }
    while (paramInt != y.ai);
    e(false);
  }

  public void a(c paramc)
  {
    this.ad = paramc;
  }

  protected boolean a()
  {
    return false;
  }

  protected boolean a(MotionEvent paramMotionEvent)
  {
    return (this.G) && (b(paramMotionEvent));
  }

  protected boolean a(View paramView, int paramInt1, int paramInt2)
  {
    int i1;
    if (paramInt1 < paramInt2)
      i1 = 1;
    while (true)
      if (paramView == this.y)
      {
        if ((!this.G) || (this.I))
          break;
        this.y.measure(View.MeasureSpec.makeMeasureSpec(paramInt1, 1073741824), View.MeasureSpec.makeMeasureSpec(paramInt2, 1073741824));
        return true;
        i1 = 0;
        continue;
      }
      else
      {
        if (paramView != this.O)
          break;
        if (i1 != 0)
        {
          this.O.measure(View.MeasureSpec.makeMeasureSpec(paramInt1, 1073741824), View.MeasureSpec.makeMeasureSpec(org.vidogram.messenger.a.a(100.0F), 1073741824));
          return true;
        }
        this.O.measure(View.MeasureSpec.makeMeasureSpec(org.vidogram.messenger.a.a(100.0F), 1073741824), View.MeasureSpec.makeMeasureSpec(paramInt2, 1073741824));
        return true;
      }
    return false;
  }

  protected boolean a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i1 = 0;
    int i2 = paramInt3 - paramInt1;
    paramInt2 = paramInt4 - paramInt2;
    if (i2 < paramInt2)
      paramInt1 = 1;
    while (paramView == this.O)
    {
      if (paramInt1 != 0)
      {
        this.O.layout(0, paramInt4 - org.vidogram.messenger.a.a(100.0F), i2, paramInt4);
        return true;
        paramInt1 = 0;
        continue;
      }
      this.O.layout(paramInt3 - org.vidogram.messenger.a.a(100.0F), 0, paramInt3, paramInt2);
      return true;
    }
    if ((paramView == this.B[0]) || (paramView == this.B[1]))
    {
      if (Build.VERSION.SDK_INT >= 21);
      for (paramInt2 = org.vidogram.messenger.a.a(10.0F); ; paramInt2 = 0)
      {
        paramInt4 = i1;
        if (Build.VERSION.SDK_INT >= 21)
          paramInt4 = org.vidogram.messenger.a.a(8.0F);
        if (paramInt1 == 0)
          break;
        paramView.layout(paramInt3 - paramView.getMeasuredWidth() - paramInt4, paramInt2, paramInt3 - paramInt4, paramView.getMeasuredHeight() + paramInt2);
        return true;
      }
      paramView.layout(paramInt4, paramInt2, paramView.getMeasuredWidth() + paramInt4, paramView.getMeasuredHeight() + paramInt2);
      return true;
    }
    return false;
  }

  public void a_(int paramInt)
  {
    af localaf = e(paramInt);
    MediaController.i locali;
    if (localaf != null)
    {
      localaf.getImageView().a(0, true);
      locali = (MediaController.i)MediaController.e.d.get(paramInt);
      if (locali.f != null)
        localaf.getImageView().a(locali.f, null, localaf.getContext().getResources().getDrawable(2130838008));
    }
    else
    {
      return;
    }
    if (locali.d != null)
    {
      localaf.getImageView().a(locali.e, true);
      localaf.getImageView().a("thumb://" + locali.b + ":" + locali.d, null, localaf.getContext().getResources().getDrawable(2130838008));
      return;
    }
    localaf.getImageView().setImageResource(2130838008);
  }

  public Bitmap b(u paramu, g.x paramx, int paramInt)
  {
    paramu = e(paramInt);
    if (paramu != null)
      return paramu.getImageView().getImageReceiver().h();
    return null;
  }

  protected boolean b()
  {
    return !this.G;
  }

  public boolean b(int paramInt)
  {
    return (paramInt >= 0) && (paramInt < MediaController.e.d.size()) && (this.j.f().containsKey(Integer.valueOf(((MediaController.i)MediaController.e.d.get(paramInt)).b)));
  }

  public void c(int paramInt)
  {
    if ((paramInt < 0) || (paramInt >= MediaController.e.d.size()))
      return;
    Object localObject = (MediaController.i)MediaController.e.d.get(paramInt);
    boolean bool;
    int i2;
    int i1;
    if (this.j.f().containsKey(Integer.valueOf(((MediaController.i)localObject).b)))
    {
      this.j.f().remove(Integer.valueOf(((MediaController.i)localObject).b));
      bool = false;
      i2 = this.n.getChildCount();
      i1 = 0;
    }
    while (true)
    {
      if (i1 < i2)
      {
        localObject = this.n.getChildAt(i1);
        if (((localObject instanceof af)) && (((Integer)((View)localObject).getTag()).intValue() == paramInt))
          ((af)localObject).a(bool, false);
      }
      else
      {
        k();
        return;
        this.j.f().put(Integer.valueOf(((MediaController.i)localObject).b), localObject);
        bool = true;
        break;
      }
      i1 += 1;
    }
  }

  public void c(u paramu, g.x paramx, int paramInt)
  {
    paramu = e(paramInt);
    if (paramu != null)
      paramu.getCheckBox().setVisibility(0);
  }

  @TargetApi(16)
  public void c(boolean paramBoolean)
  {
    if ((this.S) || (this.y == null))
      return;
    this.K[1] = (org.vidogram.messenger.a.a(80.0F) - this.E);
    this.K[2] = (org.vidogram.messenger.a.a(80.0F) - this.F);
    if (paramBoolean)
    {
      Object localObject1 = (FrameLayout.LayoutParams)this.y.getLayoutParams();
      Object localObject2 = this.K;
      i1 = (int)this.y.getTranslationY();
      ((FrameLayout.LayoutParams)localObject1).topMargin = i1;
      localObject2[0] = i1;
      this.y.setLayoutParams((ViewGroup.LayoutParams)localObject1);
      this.y.setTranslationY(0.0F);
      this.I = true;
      localObject1 = new ArrayList();
      ((ArrayList)localObject1).add(ObjectAnimator.ofFloat(this, "cameraOpenProgress", new float[] { 0.0F }));
      ((ArrayList)localObject1).add(ObjectAnimator.ofFloat(this.O, "alpha", new float[] { 0.0F }));
      i1 = 0;
      while (true)
      {
        if (i1 < 2)
        {
          if (this.B[i1].getVisibility() == 0)
            ((ArrayList)localObject1).add(ObjectAnimator.ofFloat(this.B[i1], "alpha", new float[] { 0.0F }));
        }
        else
        {
          localObject2 = new AnimatorSet();
          ((AnimatorSet)localObject2).playTogether((Collection)localObject1);
          ((AnimatorSet)localObject2).setDuration(200L);
          ((AnimatorSet)localObject2).addListener(new org.vidogram.messenger.b()
          {
            public void onAnimationEnd(Animator paramAnimator)
            {
              f.g(f.this, false);
              f.P(f.this).setVisibility(8);
              f.h(f.this, false);
              if (Build.VERSION.SDK_INT >= 21)
                f.J(f.this).setSystemUiVisibility(1024);
            }
          });
          ((AnimatorSet)localObject2).start();
          return;
        }
        i1 += 1;
      }
    }
    this.K[0] = 0;
    a(0.0F);
    this.O.setAlpha(0.0F);
    this.O.setVisibility(8);
    int i1 = 0;
    while (true)
    {
      if (i1 < 2)
      {
        if (this.B[i1].getVisibility() == 0)
          this.B[i1].setAlpha(0.0F);
      }
      else
      {
        this.G = false;
        if (Build.VERSION.SDK_INT < 21)
          break;
        this.y.setSystemUiVisibility(1024);
        return;
      }
      i1 += 1;
    }
  }

  public void d(int paramInt)
  {
    if (this.j.f().isEmpty())
    {
      if ((paramInt < 0) || (paramInt >= MediaController.e.d.size()))
        return;
      MediaController.i locali = (MediaController.i)MediaController.e.d.get(paramInt);
      this.j.f().put(Integer.valueOf(locali.b), locali);
    }
    this.ad.a(7);
  }

  public void d(boolean paramBoolean)
  {
    if ((!this.aa) || (this.y == null));
    while (true)
    {
      return;
      this.y.a(paramBoolean);
      this.b.removeView(this.y);
      this.b.removeView(this.z);
      this.y = null;
      this.z = null;
      int i2 = this.n.getChildCount();
      int i1 = 0;
      while (i1 < i2)
      {
        View localView = this.n.getChildAt(i1);
        if ((localView instanceof ae))
        {
          localView.setVisibility(0);
          return;
        }
        i1 += 1;
      }
    }
  }

  public void d_()
  {
    f(true);
  }

  public void dismiss()
  {
    if (this.I)
      return;
    if (this.G)
    {
      c(true);
      return;
    }
    d(true);
    super.dismiss();
  }

  public void e(boolean paramBoolean)
  {
    if (this.k == null)
      return;
    boolean bool = this.aa;
    if (Build.VERSION.SDK_INT >= 23)
      if (this.k.l().checkSelfPermission("android.permission.CAMERA") != 0)
      {
        if (paramBoolean)
          this.k.l().requestPermissions(new String[] { "android.permission.CAMERA" }, 17);
        this.aa = false;
      }
    while (true)
    {
      if ((bool != this.aa) && (this.j != null))
        this.j.c();
      if ((!isShowing()) || (!this.aa) || (this.k == null) || (this.ak))
        break;
      j();
      return;
      org.vidogram.messenger.c.a.a().b();
      this.aa = org.vidogram.messenger.c.a.a().c();
      continue;
      if (Build.VERSION.SDK_INT < 16)
        continue;
      org.vidogram.messenger.c.a.a().b();
      this.aa = org.vidogram.messenger.c.a.a().c();
    }
  }

  public void f()
  {
    if (this.a != null)
      this.a.setVisibility(4);
    super.f();
  }

  protected boolean g()
  {
    int i1 = 0;
    if (this.ag)
    {
      this.d.setAlpha(51);
      h(false);
      i1 = 1;
    }
    return i1;
  }

  protected boolean h()
  {
    if (this.ag)
    {
      h(true);
      return true;
    }
    return false;
  }

  public void i()
  {
    if ((!this.G) || (this.P.getState() != be.b.b))
      return;
    D();
    org.vidogram.messenger.c.a.a().a(this.y.getCameraSession(), false);
    this.P.a(be.b.a, true);
  }

  @TargetApi(16)
  public void j()
  {
    if (this.y == null)
    {
      this.y = new d(this.k.l());
      this.b.addView(this.y, 1, v.a(80, 80.0F));
      this.y.setDelegate(new d.a()
      {
        public void a()
        {
          int k = 0;
          int j = f.u(f.this).getChildCount();
          int i = 0;
          while (true)
          {
            if (i < j)
            {
              localObject = f.u(f.this).getChildAt(i);
              if ((localObject instanceof ae))
                ((View)localObject).setVisibility(4);
            }
            else
            {
              if (!f.J(f.this).getCameraSession().a().equals(f.J(f.this).getCameraSession().b()))
                break label140;
              i = 0;
              while (i < 2)
              {
                f.D(f.this)[i].setVisibility(4);
                f.D(f.this)[i].setAlpha(0.0F);
                f.D(f.this)[i].setTranslationY(0.0F);
                i += 1;
              }
            }
            i += 1;
            continue;
            label140: f.a(f.this, f.D(f.this)[0], f.J(f.this).getCameraSession().a());
            i = 0;
            if (i >= 2)
              break;
            localObject = f.D(f.this)[i];
            label193: float f;
            if (i == 0)
            {
              j = 0;
              ((ImageView)localObject).setVisibility(j);
              localObject = f.D(f.this)[i];
              if ((i != 0) || (!f.e(f.this)))
                break label257;
              f = 1.0F;
            }
            while (true)
            {
              ((ImageView)localObject).setAlpha(f);
              f.D(f.this)[i].setTranslationY(0.0F);
              i += 1;
              break;
              j = 4;
              break label193;
              label257: f = 0.0F;
            }
          }
          Object localObject = f.C(f.this);
          if (f.J(f.this).a())
          {
            i = 2130837676;
            ((ImageView)localObject).setImageResource(i);
            localObject = f.C(f.this);
            if (!f.J(f.this).b())
              break label331;
          }
          label331: for (i = k; ; i = 4)
          {
            ((ImageView)localObject).setVisibility(i);
            return;
            i = 2130837677;
            break;
          }
        }
      });
      this.z = new FrameLayout(this.k.l());
      this.b.addView(this.z, 2, v.a(80, 80.0F));
      ImageView localImageView = new ImageView(this.k.l());
      localImageView.setScaleType(ImageView.ScaleType.CENTER);
      localImageView.setImageResource(2130837925);
      this.z.addView(localImageView, v.b(80, 80, 85));
    }
    this.y.setTranslationX(this.D[0]);
    this.y.setTranslationY(this.D[1]);
    this.z.setTranslationX(this.D[0]);
    this.z.setTranslationY(this.D[1]);
  }

  public void k()
  {
    int i1 = this.j.f().size();
    if (i1 == 0)
    {
      b.a(this.l).setPadding(0, org.vidogram.messenger.a.a(4.0F), 0, 0);
      b.a(this.l).setBackgroundResource(2130837616);
      b.a(this.l).setImageResource(2130837615);
      b.b(this.l).setText("");
    }
    while ((Build.VERSION.SDK_INT >= 23) && (getContext().checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0))
    {
      this.p.setText(r.a("PermissionStorage", 2131231662));
      this.p.setTextSize(16);
      return;
      b.a(this.l).setPadding(org.vidogram.messenger.a.a(2.0F), 0, 0, 0);
      b.a(this.l).setBackgroundResource(2130837623);
      b.a(this.l).setImageResource(2130837622);
      b.b(this.l).setText(r.a("SendItems", 2131231799, new Object[] { String.format("(%d)", new Object[] { Integer.valueOf(i1) }) }));
    }
    this.p.setText(r.a("NoPhotos", 2131231503));
    this.p.setTextSize(20);
  }

  public void l()
  {
    if ((MediaController.e == null) && (Build.VERSION.SDK_INT >= 21))
      MediaController.e(0);
  }

  public void m()
  {
    if (MediaController.e != null)
    {
      int i1 = 0;
      while (i1 < Math.min(100, MediaController.e.d.size()))
      {
        MediaController.i locali = (MediaController.i)MediaController.e.d.get(i1);
        locali.i = null;
        locali.g = null;
        locali.f = null;
        locali.j.clear();
        i1 += 1;
      }
    }
    if (this.X != null)
    {
      this.X.cancel();
      this.X = null;
    }
    this.w.setAlpha(0.0F);
    this.w.setVisibility(4);
    this.i.a(0, 1000000);
    this.j.d();
    this.s.a(0, 1000000);
    k();
  }

  public HashMap<Integer, MediaController.i> n()
  {
    return this.j.f();
  }

  public void o()
  {
    y.a().b(this, y.aM);
    y.a().b(this, y.af);
    y.a().b(this, y.ai);
    this.k = null;
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((this.G) && ((paramInt == 24) || (paramInt == 25)))
    {
      this.P.getDelegate().c();
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }

  public boolean w()
  {
    return true;
  }

  public boolean x()
  {
    return false;
  }

  public void y()
  {
    int i2 = this.n.getChildCount();
    int i1 = 0;
    while (i1 < i2)
    {
      Object localObject = this.n.getChildAt(i1);
      if ((localObject instanceof af))
      {
        localObject = (af)localObject;
        if (((af)localObject).getCheckBox().getVisibility() != 0)
          ((af)localObject).getCheckBox().setVisibility(0);
      }
      i1 += 1;
    }
  }

  public boolean z()
  {
    return false;
  }

  private class a extends FrameLayout
  {
    private BackupImageView b;
    private TextView c;
    private b d = new b();
    private boolean e;
    private boolean f = false;
    private a g = null;
    private int h = 0;
    private b i = null;
    private g.vw j;

    public a(Context arg2)
    {
      super();
      this.b = new BackupImageView(localContext);
      this.b.setRoundRadius(org.vidogram.messenger.a.a(27.0F));
      addView(this.b, v.a(54, 54.0F, 49, 0.0F, 7.0F, 0.0F, 0.0F));
      this.c = new TextView(localContext);
      this.c.setTextColor(-9079435);
      this.c.setTextSize(1, 12.0F);
      this.c.setMaxLines(2);
      this.c.setGravity(49);
      this.c.setLines(2);
      this.c.setEllipsize(TextUtils.TruncateAt.END);
      addView(this.c, v.a(-1, -2.0F, 51, 6.0F, 65.0F, 6.0F, 0.0F));
    }

    private void c()
    {
      if ((f.a(f.this) == null) || (this.j == null))
        return;
      AlertDialog.Builder localBuilder = new AlertDialog.Builder(getContext());
      localBuilder.setTitle(r.a("AppName", 2131230856));
      localBuilder.setMessage(r.a("ChatHintsDelete", 2131231051, new Object[] { org.vidogram.messenger.f.a(this.j.e, this.j.f) }));
      localBuilder.setPositiveButton(r.a("OK", 2131231604), new DialogInterface.OnClickListener()
      {
        public void onClick(DialogInterface paramDialogInterface, int paramInt)
        {
          e.b(f.a.f(f.a.this).d);
        }
      });
      localBuilder.setNegativeButton(r.a("Cancel", 2131230943), null);
      localBuilder.show();
    }

    protected void a()
    {
      if (this.f)
        return;
      this.f = true;
      if (this.i == null)
        this.i = new b(null);
      postDelayed(this.i, ViewConfiguration.getTapTimeout());
    }

    public void a(g.vw paramvw)
    {
      if (paramvw == null)
        return;
      this.j = paramvw;
      Object localObject2 = null;
      this.c.setText(org.vidogram.messenger.f.a(paramvw.e, paramvw.f));
      this.d.a(paramvw);
      Object localObject1 = localObject2;
      if (paramvw != null)
      {
        localObject1 = localObject2;
        if (paramvw.j != null)
          localObject1 = paramvw.j.e;
      }
      this.b.a((org.vidogram.tgnet.f)localObject1, "50_50", this.d);
      requestLayout();
    }

    protected void b()
    {
      this.f = false;
      if (this.g != null)
        removeCallbacks(this.g);
      if (this.i != null)
        removeCallbacks(this.i);
    }

    protected void onMeasure(int paramInt1, int paramInt2)
    {
      super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.vidogram.messenger.a.a(85.0F), 1073741824), View.MeasureSpec.makeMeasureSpec(org.vidogram.messenger.a.a(100.0F), 1073741824));
    }

    public boolean onTouchEvent(MotionEvent paramMotionEvent)
    {
      boolean bool1;
      boolean bool2;
      if (paramMotionEvent.getAction() == 0)
      {
        this.e = true;
        invalidate();
        bool1 = true;
        if (bool1)
          break label184;
        bool2 = super.onTouchEvent(paramMotionEvent);
      }
      while (true)
      {
        if ((paramMotionEvent.getAction() != 0) && (paramMotionEvent.getAction() != 2))
          b();
        return bool2;
        if (this.e)
        {
          if (paramMotionEvent.getAction() == 1)
          {
            getParent().requestDisallowInterceptTouchEvent(true);
            this.e = false;
            playSoundEffect(0);
            f.b(f.this).a(org.vidogram.messenger.v.a().a(Integer.valueOf(((g.to)e.b.get(((Integer)getTag()).intValue())).c.c)));
            f.a(f.this, false);
            f.this.dismiss();
            f.a(f.this, true);
            invalidate();
            bool1 = false;
            break;
          }
          if (paramMotionEvent.getAction() == 3)
          {
            this.e = false;
            invalidate();
          }
        }
        bool1 = false;
        break;
        label184: bool2 = bool1;
        if (paramMotionEvent.getAction() != 0)
          continue;
        a();
        bool2 = bool1;
      }
    }

    class a
      implements Runnable
    {
      public int a;

      a()
      {
      }

      public void run()
      {
        if ((f.a.c(f.a.this)) && (f.a.this.getParent() != null) && (this.a == f.a.d(f.a.this)))
        {
          f.a.a(f.a.this, false);
          f.a.this.performHapticFeedback(0);
          f.a.e(f.a.this);
          MotionEvent localMotionEvent = MotionEvent.obtain(0L, 0L, 3, 0.0F, 0.0F, 0);
          f.a.this.onTouchEvent(localMotionEvent);
          localMotionEvent.recycle();
        }
      }
    }

    private final class b
      implements Runnable
    {
      private b()
      {
      }

      public void run()
      {
        if (f.a.a(f.a.this) == null)
          f.a.a(f.a.this, new f.a.a(f.a.this));
        f.a.a(f.a.this).a = f.a.b(f.a.this);
        f.a.this.postDelayed(f.a.a(f.a.this), ViewConfiguration.getLongPressTimeout() - ViewConfiguration.getTapTimeout());
      }
    }
  }

  private class b extends FrameLayout
  {
    private TextView b;
    private ImageView c;

    public b(Context arg2)
    {
      super();
      this.c = new ImageView(localContext);
      this.c.setScaleType(ImageView.ScaleType.CENTER);
      addView(this.c, v.b(64, 64, 49));
      this.b = new TextView(localContext);
      this.b.setLines(1);
      this.b.setSingleLine(true);
      this.b.setGravity(1);
      this.b.setEllipsize(TextUtils.TruncateAt.END);
      this.b.setTextColor(-9079435);
      this.b.setTextSize(1, 12.0F);
      addView(this.b, v.a(-1, -2.0F, 51, 0.0F, 64.0F, 0.0F, 0.0F));
    }

    public void a(CharSequence paramCharSequence, Drawable paramDrawable)
    {
      this.b.setText(paramCharSequence);
      this.c.setBackgroundDrawable(paramDrawable);
    }

    public boolean hasOverlappingRendering()
    {
      return false;
    }

    protected void onMeasure(int paramInt1, int paramInt2)
    {
      super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.vidogram.messenger.a.a(85.0F), 1073741824), View.MeasureSpec.makeMeasureSpec(org.vidogram.messenger.a.a(90.0F), 1073741824));
    }
  }

  public static abstract interface c
  {
    public abstract View a();

    public abstract void a(int paramInt);

    public abstract void a(g.vw paramvw);
  }

  private class d extends RecyclerView.u
  {
    public d(View arg2)
    {
      super();
    }
  }

  private class e
  {
    private AnimatorSet b;
    private float c;

    private e()
    {
    }
  }

  private class f extends RecyclerView.a
  {
    private Context b;

    public f(Context arg2)
    {
      Object localObject;
      this.b = localObject;
    }

    public int a()
    {
      if (!e.b.isEmpty());
      for (int i = (int)Math.ceil(e.b.size() / 4.0F) + 1; ; i = 0)
        return i + 1;
    }

    public int a(int paramInt)
    {
      switch (paramInt)
      {
      default:
        return 2;
      case 0:
        return 0;
      case 1:
      }
      return 1;
    }

    public RecyclerView.u a(ViewGroup paramViewGroup, int paramInt)
    {
      switch (paramInt)
      {
      default:
        paramViewGroup = new FrameLayout(this.b)
        {
          protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
          {
            paramInt2 = (paramInt3 - paramInt1 - org.vidogram.messenger.a.a(360.0F)) / 3;
            paramInt1 = 0;
            while (paramInt1 < 4)
            {
              paramInt3 = org.vidogram.messenger.a.a(10.0F) + paramInt1 % 4 * (org.vidogram.messenger.a.a(85.0F) + paramInt2);
              View localView = getChildAt(paramInt1);
              localView.layout(paramInt3, 0, localView.getMeasuredWidth() + paramInt3, localView.getMeasuredHeight());
              paramInt1 += 1;
            }
          }
        };
        paramInt = 0;
      case 0:
        while (paramInt < 4)
        {
          paramViewGroup.addView(new f.a(f.this, this.b));
          paramInt += 1;
          continue;
          paramViewGroup = f.S(f.this);
        }
      case 1:
      }
      while (true)
      {
        return new f.d(f.this, paramViewGroup);
        paramViewGroup = new ap(this.b);
        continue;
        paramViewGroup.setLayoutParams(new RecyclerView.i(-1, org.vidogram.messenger.a.a(100.0F)));
      }
    }

    public void a(RecyclerView.u paramu, int paramInt)
    {
      if (paramInt > 1)
      {
        int i = (paramInt - 2) * 4;
        paramu = (FrameLayout)paramu.a;
        paramInt = 0;
        if (paramInt < 4)
        {
          f.a locala = (f.a)paramu.getChildAt(paramInt);
          if (i + paramInt >= e.b.size())
            locala.setVisibility(4);
          while (true)
          {
            paramInt += 1;
            break;
            locala.setVisibility(0);
            locala.setTag(Integer.valueOf(i + paramInt));
            locala.a(org.vidogram.messenger.v.a().a(Integer.valueOf(((g.to)e.b.get(i + paramInt)).c.c)));
          }
        }
      }
    }
  }

  private class g extends RecyclerView.a
  {
    private Context b;
    private HashMap<Integer, MediaController.i> c = new HashMap();

    public g(Context arg2)
    {
      Object localObject;
      this.b = localObject;
    }

    public int a()
    {
      int i = 0;
      if (f.z(f.this))
        i = 1;
      int j = i;
      if (MediaController.e != null)
        j = i + MediaController.e.d.size();
      return j;
    }

    public int a(int paramInt)
    {
      if ((f.z(f.this)) && (paramInt == 0))
        return 1;
      return 0;
    }

    public RecyclerView.u a(ViewGroup paramViewGroup, int paramInt)
    {
      switch (paramInt)
      {
      default:
        if (f.T(f.this).isEmpty())
          break;
        paramViewGroup = (f.d)f.T(f.this).get(0);
        f.T(f.this).remove(0);
        return paramViewGroup;
      case 1:
        return new f.d(f.this, new ae(this.b));
      }
      return e();
    }

    public void a(RecyclerView.u paramu, int paramInt)
    {
      boolean bool;
      if ((!f.z(f.this)) || (paramInt != 0))
      {
        int i = paramInt;
        if (f.z(f.this))
          i = paramInt - 1;
        paramu = (af)paramu.a;
        MediaController.i locali = (MediaController.i)MediaController.e.d.get(i);
        if (i == MediaController.e.d.size() - 1)
        {
          bool = true;
          paramu.a(locali, bool);
          paramu.a(this.c.containsKey(Integer.valueOf(locali.b)), false);
          paramu.getImageView().setTag(Integer.valueOf(i));
          paramu.setTag(Integer.valueOf(i));
        }
      }
      do
      {
        return;
        bool = false;
        break;
      }
      while ((!f.z(f.this)) || (paramInt != 0));
      if ((f.J(f.this) != null) && (f.J(f.this).d()))
      {
        paramu.a.setVisibility(4);
        return;
      }
      paramu.a.setVisibility(0);
    }

    public void d()
    {
      if (!this.c.isEmpty())
      {
        Iterator localIterator = this.c.entrySet().iterator();
        while (localIterator.hasNext())
        {
          MediaController.i locali = (MediaController.i)((Map.Entry)localIterator.next()).getValue();
          locali.g = null;
          locali.f = null;
          locali.i = null;
          locali.j.clear();
        }
        this.c.clear();
        f.this.k();
        c();
      }
    }

    public f.d e()
    {
      af localaf = new af(this.b);
      localaf.setDelegate(new af.a()
      {
        public void a(af paramaf)
        {
          MediaController.i locali = paramaf.getPhotoEntry();
          boolean bool;
          if (f.g.a(f.g.this).containsKey(Integer.valueOf(locali.b)))
          {
            f.g.a(f.g.this).remove(Integer.valueOf(locali.b));
            paramaf.a(false, true);
            locali.g = null;
            locali.f = null;
            locali.j.clear();
            if (((Integer)paramaf.getTag()).intValue() == MediaController.e.d.size() - 1)
            {
              bool = true;
              paramaf.a(locali, bool);
            }
          }
          while (true)
          {
            f.this.k();
            return;
            bool = false;
            break;
            f.g.a(f.g.this).put(Integer.valueOf(locali.b), locali);
            paramaf.a(true, true);
          }
        }
      });
      return new f.d(f.this, localaf);
    }

    public HashMap<Integer, MediaController.i> f()
    {
      return this.c;
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.Components.f
 * JD-Core Version:    0.6.0
 */