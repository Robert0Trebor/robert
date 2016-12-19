package org.vidogram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.TextPaint;
import android.text.TextUtils.TruncateAt;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import org.vidogram.messenger.a;
import org.vidogram.messenger.b;
import org.vidogram.messenger.j;
import org.vidogram.messenger.q;
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
import org.vidogram.tgnet.ConnectionsManager;
import org.vidogram.tgnet.c;
import org.vidogram.tgnet.g.an;
import org.vidogram.tgnet.g.ay;
import org.vidogram.tgnet.g.az;
import org.vidogram.tgnet.g.be;
import org.vidogram.tgnet.g.bf;
import org.vidogram.tgnet.g.ia;
import org.vidogram.tgnet.g.ld;
import org.vidogram.tgnet.g.lr;
import org.vidogram.tgnet.g.lt;
import org.vidogram.tgnet.g.po;
import org.vidogram.tgnet.g.q;
import org.vidogram.tgnet.g.qd;
import org.vidogram.tgnet.g.qh;
import org.vidogram.tgnet.g.r;
import org.vidogram.tgnet.g.rg;
import org.vidogram.ui.a.h;
import org.vidogram.ui.a.l;
import org.vidogram.ui.ax;
import org.vidogram.ui.c.t;

public class bl extends h
  implements y.b
{
  private g.q A;
  private g.an B;
  private ArrayList<g.bf> C;
  private b D;
  private c E;
  private int F;
  private int G;
  private boolean H;
  private boolean I;
  private aw i;
  private a j;
  private TextView k;
  private am l;
  private FrameLayout m;
  private TextView n;
  private View o;
  private BackupImageView p;
  private TextView q;
  private aw.b r;
  private Drawable s;
  private AnimatorSet[] t = new AnimatorSet[2];
  private View[] u = new View[2];
  private FrameLayout v;
  private org.vidogram.ui.a.g w;
  private d x;
  private Activity y;
  private g.rg z;

  public bl(Context paramContext, g.ay paramay)
  {
    super(paramContext, false);
    this.y = ((Activity)paramContext);
    g.po localpo = new g.po();
    g.lt locallt = new g.lt();
    locallt.c = new g.ld();
    locallt.c.b = paramay.b;
    locallt.c.c = paramay.c;
    localpo.c = locallt;
    this.G = ConnectionsManager.a().a(localpo, new c()
    {
    });
    a(paramContext);
  }

  public bl(Context paramContext, org.vidogram.ui.a.g paramg, g.an paraman, g.rg paramrg, b paramb)
  {
    super(paramContext, false);
    this.D = paramb;
    this.B = paraman;
    this.z = paramrg;
    this.w = paramg;
    l();
    a(paramContext);
  }

  private void a(int paramInt, boolean paramBoolean)
  {
    if (this.C != null);
    do
      return;
    while (((!paramBoolean) || (this.u[paramInt].getTag() == null)) && ((paramBoolean) || (this.u[paramInt].getTag() != null)));
    View localView = this.u[paramInt];
    Object localObject;
    float f;
    if (paramBoolean)
    {
      localObject = null;
      localView.setTag(localObject);
      if (paramBoolean)
        this.u[paramInt].setVisibility(0);
      if (this.t[paramInt] != null)
        this.t[paramInt].cancel();
      this.t[paramInt] = new AnimatorSet();
      localObject = this.t[paramInt];
      localView = this.u[paramInt];
      if (!paramBoolean)
        break label206;
      f = 1.0F;
    }
    while (true)
    {
      ((AnimatorSet)localObject).playTogether(new Animator[] { ObjectAnimator.ofFloat(localView, "alpha", new float[] { f }) });
      this.t[paramInt].setDuration(150L);
      this.t[paramInt].addListener(new b(paramInt, paramBoolean)
      {
        public void onAnimationCancel(Animator paramAnimator)
        {
          if ((bl.v(bl.this)[this.a] != null) && (bl.v(bl.this)[this.a].equals(paramAnimator)))
            bl.v(bl.this)[this.a] = null;
        }

        public void onAnimationEnd(Animator paramAnimator)
        {
          if ((bl.v(bl.this)[this.a] != null) && (bl.v(bl.this)[this.a].equals(paramAnimator)))
          {
            if (!this.b)
              bl.d(bl.this)[this.a].setVisibility(4);
            bl.v(bl.this)[this.a] = null;
          }
        }
      });
      this.t[paramInt].start();
      return;
      localObject = Integer.valueOf(1);
      break;
      label206: f = 0.0F;
    }
  }

  private void a(Context paramContext)
  {
    this.s = paramContext.getResources().getDrawable(2130838147);
    this.a = new FrameLayout(paramContext)
    {
      private int b;

      protected void onDraw(Canvas paramCanvas)
      {
        bl.k(bl.this).setBounds(0, bl.g(bl.this) - bl.k(), getMeasuredWidth(), getMeasuredHeight());
        bl.k(bl.this).draw(paramCanvas);
      }

      public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
      {
        if ((paramMotionEvent.getAction() == 0) && (bl.g(bl.this) != 0) && (paramMotionEvent.getY() < bl.g(bl.this)))
        {
          bl.this.dismiss();
          return true;
        }
        return super.onInterceptTouchEvent(paramMotionEvent);
      }

      protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
      {
        if (this.b != paramInt3 - paramInt1)
        {
          this.b = (paramInt3 - paramInt1);
          if ((bl.e(bl.this) != null) && (bl.b(bl.this) != null))
            bl.e(bl.this).c();
        }
        super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
        bl.i(bl.this);
      }

      protected void onMeasure(int paramInt1, int paramInt2)
      {
        paramInt2 = View.MeasureSpec.getSize(paramInt2);
        int j = paramInt2;
        if (Build.VERSION.SDK_INT >= 21)
          j = paramInt2 - a.a;
        int k;
        if (bl.b(bl.this) != null)
        {
          k = a.a(56.0F) + a.a(60.0F) * bl.b(bl.this).size() + bl.a.a(bl.e(bl.this)) * a.a(82.0F);
          if (k >= j / 5 * 3.2D)
            break label297;
        }
        label297: for (int i = 0; ; i = j / 5 * 2)
        {
          paramInt2 = i;
          if (i != 0)
          {
            paramInt2 = i;
            if (k < j)
              paramInt2 = i - (j - k);
          }
          i = paramInt2;
          if (paramInt2 == 0)
            i = bl.j();
          paramInt2 = i;
          if (bl.b(bl.this) != null)
            paramInt2 = i + a.a(8.0F);
          if (bl.c(bl.this).getPaddingTop() != paramInt2)
          {
            bl.a(bl.this, true);
            bl.c(bl.this).setPadding(a.a(10.0F), paramInt2, a.a(10.0F), 0);
            bl.h(bl.this).setPadding(0, paramInt2, 0, 0);
            bl.a(bl.this, false);
          }
          super.onMeasure(paramInt1, View.MeasureSpec.makeMeasureSpec(Math.min(k, j), 1073741824));
          return;
          i = a.a(96.0F);
          if (bl.f(bl.this) != null);
          for (paramInt2 = (int)Math.ceil(bl.f(bl.this).e.size() / 5.0F); ; paramInt2 = 0)
          {
            k = Math.max(3, paramInt2) * a.a(82.0F) + i + bl.i();
            break;
          }
        }
      }

      public boolean onTouchEvent(MotionEvent paramMotionEvent)
      {
        return (!bl.this.e()) && (super.onTouchEvent(paramMotionEvent));
      }

      public void requestLayout()
      {
        if (bl.j(bl.this))
          return;
        super.requestLayout();
      }
    };
    this.a.setWillNotDraw(false);
    this.a.setPadding(g, 0, g, 0);
    this.k = new TextView(paramContext);
    this.k.setLines(1);
    this.k.setSingleLine(true);
    this.k.setTextColor(-14606047);
    this.k.setTextSize(1, 20.0F);
    this.k.setEllipsize(TextUtils.TruncateAt.MIDDLE);
    this.k.setPadding(a.a(18.0F), 0, a.a(18.0F), 0);
    this.k.setGravity(16);
    this.k.setTypeface(a.a("fonts/rmedium.ttf"));
    this.a.addView(this.k, v.b(-1, 48));
    this.k.setOnTouchListener(new View.OnTouchListener()
    {
      public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
      {
        return true;
      }
    });
    this.u[0] = new View(paramContext);
    this.u[0].setBackgroundResource(2130837787);
    this.u[0].setAlpha(0.0F);
    this.u[0].setVisibility(4);
    this.u[0].setTag(Integer.valueOf(1));
    this.a.addView(this.u[0], v.a(-1, 3.0F, 51, 0.0F, 48.0F, 0.0F, 0.0F));
    this.i = new aw(paramContext)
    {
      public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
      {
        int i = 0;
        boolean bool = ax.a().a(paramMotionEvent, bl.c(bl.this), 0);
        if ((super.onInterceptTouchEvent(paramMotionEvent)) || (bool))
          i = 1;
        return i;
      }

      public void requestLayout()
      {
        if (bl.j(bl.this))
          return;
        super.requestLayout();
      }
    };
    this.i.setTag(Integer.valueOf(14));
    Object localObject1 = this.i;
    Object localObject2 = new d(getContext(), 5);
    this.x = ((d)localObject2);
    ((aw)localObject1).setLayoutManager((RecyclerView.h)localObject2);
    this.x.a(new d.c()
    {
      public int a(int paramInt)
      {
        if (((bl.b(bl.this) != null) && ((bl.a.b(bl.e(bl.this)).get(Integer.valueOf(paramInt)) instanceof Integer))) || (paramInt == bl.a.c(bl.e(bl.this))))
          return bl.a.d(bl.e(bl.this));
        return 1;
      }
    });
    localObject1 = this.i;
    localObject2 = new a(paramContext);
    this.j = ((a)localObject2);
    ((aw)localObject1).setAdapter((RecyclerView.a)localObject2);
    this.i.setVerticalScrollBarEnabled(false);
    this.i.a(new RecyclerView.g()
    {
      public void a(Rect paramRect, View paramView, RecyclerView paramRecyclerView, RecyclerView.r paramr)
      {
        paramRect.left = 0;
        paramRect.right = 0;
        paramRect.bottom = 0;
        paramRect.top = 0;
      }
    });
    this.i.setPadding(a.a(10.0F), 0, a.a(10.0F), 0);
    this.i.setClipToPadding(false);
    this.i.setEnabled(true);
    this.i.setGlowColor(-657673);
    this.i.setOnTouchListener(new View.OnTouchListener()
    {
      public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
      {
        return ax.a().a(paramMotionEvent, bl.c(bl.this), 0, bl.l(bl.this));
      }
    });
    this.i.setOnScrollListener(new RecyclerView.l()
    {
      public void a(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
      {
        bl.i(bl.this);
      }
    });
    this.r = new aw.b()
    {
      public void a(View paramView, int paramInt)
      {
        if (bl.b(bl.this) != null)
        {
          paramView = (g.bf)bl.a.e(bl.e(bl.this)).get(Integer.valueOf(paramInt));
          if (paramView != null)
          {
            bl.this.dismiss();
            g.lr locallr = new g.lr();
            locallr.c = paramView.b.c;
            locallr.b = paramView.b.b;
            new bl(bl.m(bl.this), bl.n(bl.this), locallr, null, null).show();
          }
        }
        do
          return;
        while ((bl.f(bl.this) == null) || (paramInt < 0) || (paramInt >= bl.f(bl.this).e.size()));
        bl.a(bl.this, (g.q)bl.f(bl.this).e.get(paramInt));
        paramInt = 0;
        if (paramInt < bl.o(bl.this).o.size())
        {
          paramView = (g.r)bl.o(bl.this).o.get(paramInt);
          if ((paramView instanceof g.ia))
          {
            if ((paramView.b == null) || (paramView.b.length() <= 0))
              break label451;
            bl.p(bl.this).setText(j.a(paramView.b, bl.p(bl.this).getPaint().getFontMetricsInt(), a.a(30.0F), false));
          }
        }
        label451: for (paramInt = 1; ; paramInt = 0)
        {
          if (paramInt == 0)
            bl.p(bl.this).setText(j.a(org.vidogram.messenger.d.g.b(bl.o(bl.this).b), bl.p(bl.this).getPaint().getFontMetricsInt(), a.a(30.0F), false));
          bl.q(bl.this).getImageReceiver().a(bl.o(bl.this), null, bl.o(bl.this).i.c, null, "webp", true);
          paramView = (FrameLayout.LayoutParams)bl.r(bl.this).getLayoutParams();
          paramView.topMargin = bl.g(bl.this);
          bl.r(bl.this).setLayoutParams(paramView);
          bl.r(bl.this).setVisibility(0);
          paramView = new AnimatorSet();
          paramView.playTogether(new Animator[] { ObjectAnimator.ofFloat(bl.r(bl.this), "alpha", new float[] { 0.0F, 1.0F }) });
          paramView.setDuration(200L);
          paramView.start();
          return;
          paramInt += 1;
          break;
        }
      }
    };
    this.i.setOnItemClickListener(this.r);
    this.a.addView(this.i, v.a(-1, -1.0F, 51, 0.0F, 48.0F, 0.0F, 48.0F));
    this.v = new FrameLayout(paramContext)
    {
      public void requestLayout()
      {
        if (bl.j(bl.this))
          return;
        super.requestLayout();
      }
    };
    this.a.addView(this.v, v.a(-1, -1.0F, 51, 0.0F, 0.0F, 0.0F, 48.0F));
    this.i.setEmptyView(this.v);
    this.v.setOnTouchListener(new View.OnTouchListener()
    {
      public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
      {
        return true;
      }
    });
    localObject1 = new ProgressBar(paramContext);
    this.v.addView((View)localObject1, v.b(-2, -2, 17));
    this.u[1] = new View(paramContext);
    this.u[1].setBackgroundResource(2130837788);
    this.a.addView(this.u[1], v.a(-1, 3.0F, 83, 0.0F, 0.0F, 0.0F, 48.0F));
    this.l = new am(paramContext, false);
    this.a.addView(this.l, v.b(-1, 48, 83));
    this.l.b.setPadding(a.a(18.0F), 0, a.a(18.0F), 0);
    this.l.b.setTextColor(-12940081);
    this.l.b.setText(org.vidogram.messenger.r.a("Close", 2131231072).toUpperCase());
    this.l.b.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramView)
      {
        bl.this.dismiss();
      }
    });
    this.l.a.setPadding(a.a(18.0F), 0, a.a(18.0F), 0);
    this.l.d.setBackgroundResource(2130838153);
    this.m = new FrameLayout(paramContext);
    this.m.setBackgroundColor(-536870913);
    this.m.setVisibility(8);
    this.m.setSoundEffectsEnabled(false);
    this.a.addView(this.m, v.a(-1, -1.0F));
    this.m.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramView)
      {
        bl.s(bl.this);
      }
    });
    localObject1 = new ImageView(paramContext);
    ((ImageView)localObject1).setImageResource(2130837728);
    ((ImageView)localObject1).setScaleType(ImageView.ScaleType.CENTER);
    if (Build.VERSION.SDK_INT >= 21)
      ((ImageView)localObject1).setBackgroundDrawable(l.a(-2697514));
    this.m.addView((View)localObject1, v.b(48, 48, 53));
    ((ImageView)localObject1).setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramView)
      {
        bl.s(bl.this);
      }
    });
    this.p = new BackupImageView(paramContext);
    this.p.setAspectFit(true);
    this.m.addView(this.p);
    this.q = new TextView(paramContext);
    this.q.setTextSize(1, 30.0F);
    this.q.setGravity(85);
    this.m.addView(this.q);
    this.n = new TextView(paramContext);
    this.n.setTextSize(1, 14.0F);
    this.n.setTextColor(-12940081);
    this.n.setGravity(17);
    this.n.setBackgroundColor(-1);
    this.n.setPadding(a.a(29.0F), 0, a.a(29.0F), 0);
    this.n.setTypeface(a.a("fonts/rmedium.ttf"));
    this.m.addView(this.n, v.b(-1, 48, 83));
    this.n.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramView)
      {
        bl.t(bl.this).a(bl.o(bl.this));
        bl.this.dismiss();
      }
    });
    this.o = new View(paramContext);
    this.o.setBackgroundResource(2130837788);
    this.m.addView(this.o, v.a(-1, 3.0F, 83, 0.0F, 0.0F, 0.0F, 48.0F));
    y.a().a(this, y.at);
    n();
    m();
    this.j.c();
  }

  private void a(View.OnClickListener paramOnClickListener, String paramString, int paramInt, boolean paramBoolean)
  {
    if (paramString == null)
    {
      this.l.a.setVisibility(8);
      return;
    }
    this.l.a.setVisibility(0);
    if (paramBoolean)
    {
      this.l.d.setVisibility(0);
      this.l.d.setText(String.format("%d", new Object[] { Integer.valueOf(this.z.e.size()) }));
    }
    while (true)
    {
      this.l.c.setTextColor(paramInt);
      this.l.c.setText(paramString.toUpperCase());
      this.l.a.setOnClickListener(paramOnClickListener);
      return;
      this.l.d.setVisibility(8);
    }
  }

  private void l()
  {
    if (this.B != null)
    {
      if ((this.z == null) && (this.B.d != null))
        this.z = org.vidogram.messenger.d.g.a(this.B.d);
      if (this.z == null)
        this.z = org.vidogram.messenger.d.g.a(Long.valueOf(this.B.b));
      if (this.z == null)
      {
        g.qd localqd = new g.qd();
        localqd.c = this.B;
        ConnectionsManager.a().a(localqd, new c()
        {
        });
      }
    }
    else if (this.z != null)
    {
      if (this.z.c.j)
        break label154;
    }
    label154: for (boolean bool = true; ; bool = false)
    {
      this.I = bool;
      return;
      if (this.j == null)
        break;
      m();
      n();
      this.j.c();
      break;
    }
  }

  private void m()
  {
    int i1 = (int)(Math.min(a.c.x, a.c.y) / 2 / a.b);
    if ((this.D != null) && ((this.z == null) || (!this.z.c.j)))
    {
      this.n.setText(org.vidogram.messenger.r.a("SendSticker", 2131231805).toUpperCase());
      this.p.setLayoutParams(v.a(i1, i1, 17, 0.0F, 0.0F, 0.0F, 30.0F));
      this.q.setLayoutParams(v.a(i1, i1, 17, 0.0F, 0.0F, 0.0F, 30.0F));
      this.n.setVisibility(0);
      this.o.setVisibility(0);
      return;
    }
    this.n.setText(org.vidogram.messenger.r.a("Close", 2131231072).toUpperCase());
    this.p.setLayoutParams(v.b(i1, i1, 17));
    this.q.setLayoutParams(v.b(i1, i1, 17));
    this.n.setVisibility(8);
    this.o.setVisibility(8);
  }

  private void n()
  {
    if (this.k == null)
      return;
    if (this.z != null)
    {
      this.k.setText(this.z.c.d);
      String str;
      if ((this.z.c == null) || (!org.vidogram.messenger.d.g.a(this.z.c.b)))
      {
        9 local9 = new View.OnClickListener()
        {
          public void onClick(View paramView)
          {
            bl.this.dismiss();
            if (bl.u(bl.this) != null)
              bl.u(bl.this).a();
            paramView = new g.qh();
            paramView.c = bl.a(bl.this);
            ConnectionsManager.a().a(paramView, new c()
            {
            });
          }
        };
        if ((this.z != null) && (this.z.c.j))
        {
          str = org.vidogram.messenger.r.a("AddMasks", 2131230817);
          a(local9, str, -12940081, true);
        }
      }
      while (true)
      {
        this.j.c();
        return;
        str = org.vidogram.messenger.r.a("AddStickers", 2131230823);
        break;
        if (this.z.c.i)
        {
          a(new View.OnClickListener()
          {
            public void onClick(View paramView)
            {
              if (bl.u(bl.this) != null)
                bl.u(bl.this).b();
              bl.this.dismiss();
              org.vidogram.messenger.d.g.a(bl.this.getContext(), bl.f(bl.this).c, 1, bl.n(bl.this), true);
            }
          }
          , org.vidogram.messenger.r.a("StickersRemove", 2131231872), -3319206, false);
          continue;
        }
        a(new View.OnClickListener()
        {
          public void onClick(View paramView)
          {
            if (bl.u(bl.this) != null)
              bl.u(bl.this).b();
            bl.this.dismiss();
            org.vidogram.messenger.d.g.a(bl.this.getContext(), bl.f(bl.this).c, 0, bl.n(bl.this), true);
          }
        }
        , org.vidogram.messenger.r.a("StickersRemove", 2131231873), -3319206, false);
      }
    }
    a(null, null, -3319206, false);
  }

  @SuppressLint({"NewApi"})
  private void o()
  {
    Object localObject;
    int i1;
    if (this.i.getChildCount() <= 0)
    {
      localObject = this.i;
      i1 = this.i.getPaddingTop();
      this.F = i1;
      ((aw)localObject).setTopGlowOffset(i1);
      if (this.C == null)
      {
        this.k.setTranslationY(this.F);
        this.u[0].setTranslationY(this.F);
      }
      this.a.invalidate();
    }
    while (true)
    {
      return;
      localObject = this.i.getChildAt(0);
      bl.a.a locala = (bl.a.a)this.i.c((View)localObject);
      i1 = ((View)localObject).getTop();
      if ((i1 >= 0) && (locala != null) && (locala.e() == 0))
        a(0, false);
      while (this.F != i1)
      {
        localObject = this.i;
        this.F = i1;
        ((aw)localObject).setTopGlowOffset(i1);
        if (this.C == null)
        {
          this.k.setTranslationY(this.F);
          this.u[0].setTranslationY(this.F);
        }
        this.a.invalidate();
        return;
        a(0, true);
        i1 = 0;
      }
    }
  }

  private void p()
  {
    AnimatorSet localAnimatorSet = new AnimatorSet();
    localAnimatorSet.playTogether(new Animator[] { ObjectAnimator.ofFloat(this.m, "alpha", new float[] { 0.0F }) });
    localAnimatorSet.setDuration(200L);
    localAnimatorSet.addListener(new b()
    {
      public void onAnimationEnd(Animator paramAnimator)
      {
        bl.r(bl.this).setVisibility(8);
      }
    });
    localAnimatorSet.start();
  }

  public void a(int paramInt, Object[] paramArrayOfObject)
  {
    if (paramInt == y.at)
    {
      if (this.i != null)
      {
        int i1 = this.i.getChildCount();
        paramInt = 0;
        while (paramInt < i1)
        {
          this.i.getChildAt(paramInt).invalidate();
          paramInt += 1;
        }
      }
      if (ax.a().c())
        ax.a().d();
      ax.a().b();
    }
  }

  public void a(c paramc)
  {
    this.E = paramc;
  }

  protected boolean a()
  {
    return false;
  }

  public void dismiss()
  {
    super.dismiss();
    if (this.G != 0)
    {
      ConnectionsManager.a().a(this.G, true);
      this.G = 0;
    }
    y.a().b(this, y.at);
  }

  private class a extends RecyclerView.a
  {
    private Context b;
    private int c;
    private HashMap<Integer, Object> d = new HashMap();
    private HashMap<Integer, g.bf> e = new HashMap();
    private int f;
    private int g;

    public a(Context arg2)
    {
      Object localObject;
      this.b = localObject;
    }

    public int a()
    {
      return this.f;
    }

    public int a(int paramInt)
    {
      if (bl.b(bl.this) != null)
      {
        Object localObject = this.d.get(Integer.valueOf(paramInt));
        if (localObject == null)
          break label37;
        if (!(localObject instanceof g.q));
      }
      else
      {
        return 0;
      }
      return 2;
      label37: return 1;
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
        return new a(paramViewGroup);
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
        paramViewGroup = new t(this.b, 8);
      }
    }

    public void a(RecyclerView.u paramu, int paramInt)
    {
      if (bl.b(bl.this) != null)
      {
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
        Object localObject = (g.bf)bl.b(bl.this).get(((Integer)this.d.get(Integer.valueOf(paramInt))).intValue());
        ((t)paramu.a).a((g.bf)localObject, false);
        return;
      }
      ((org.vidogram.ui.c.aw)paramu.a).a((g.q)bl.f(bl.this).e.get(paramInt), bl.w(bl.this));
    }

    public void c()
    {
      int i = 0;
      if (bl.b(bl.this) != null)
      {
        int j = bl.c(bl.this).getMeasuredWidth();
        i = j;
        if (j == 0)
          i = a.c.x;
        this.c = (i / a.a(72.0F));
        bl.x(bl.this).a(this.c);
        this.d.clear();
        this.e.clear();
        this.f = 0;
        this.g = 0;
        i = 0;
        if (i < bl.b(bl.this).size())
        {
          g.bf localbf = (g.bf)bl.b(bl.this).get(i);
          if ((localbf.c.isEmpty()) && (localbf.d == null));
          while (true)
          {
            i += 1;
            break;
            this.g = (int)(this.g + Math.ceil(bl.b(bl.this).size() / this.c));
            this.e.put(Integer.valueOf(this.f), localbf);
            HashMap localHashMap = this.d;
            j = this.f;
            this.f = (j + 1);
            localHashMap.put(Integer.valueOf(j), Integer.valueOf(i));
            j = this.f / this.c;
            int k;
            if (!localbf.c.isEmpty())
            {
              k = (int)Math.ceil(localbf.c.size() / this.c);
              j = 0;
              while (j < localbf.c.size())
              {
                this.d.put(Integer.valueOf(this.f + j), localbf.c.get(j));
                j += 1;
              }
              j = k;
            }
            while (true)
            {
              k = 0;
              while (k < this.c * j)
              {
                this.e.put(Integer.valueOf(this.f + k), localbf);
                k += 1;
              }
              j = 1;
              this.d.put(Integer.valueOf(this.f), localbf.d);
            }
            this.f += j * this.c;
          }
        }
      }
      else
      {
        if (bl.f(bl.this) != null)
          i = bl.f(bl.this).e.size();
        this.f = i;
      }
      super.c();
    }

    private class a extends RecyclerView.u
    {
      public a(View arg2)
      {
        super();
      }
    }
  }

  public static abstract interface b
  {
    public abstract void a(g.q paramq);
  }

  public static abstract interface c
  {
    public abstract void a();

    public abstract void b();
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.Components.bl
 * JD-Core Version:    0.6.0
 */