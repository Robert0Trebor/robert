package org.vidogram.ui.Components;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Looper;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;
import java.security.SecureRandom;
import java.util.ArrayList;
import org.vidogram.messenger.ApplicationLoader;
import org.vidogram.messenger.Utilities;
import org.vidogram.messenger.h;
import org.vidogram.messenger.r;
import org.vidogram.tgnet.g.ab;
import org.vidogram.tgnet.g.ia;
import org.vidogram.tgnet.g.jn;
import org.vidogram.tgnet.g.mf;
import org.vidogram.tgnet.g.q;
import org.vidogram.tgnet.g.r;
import org.vidogram.ui.Components.a.a.b;
import org.vidogram.ui.Components.a.a.c;
import org.vidogram.ui.Components.a.a.c.a;
import org.vidogram.ui.Components.a.a.d.a;
import org.vidogram.ui.Components.a.a.g;
import org.vidogram.ui.Components.a.j;
import org.vidogram.ui.Components.a.j.b;
import org.vidogram.ui.Components.a.p;
import org.vidogram.ui.Components.a.p.a;
import org.vidogram.ui.a.e;
import org.vidogram.ui.a.e.a;
import org.vidogram.ui.a.e.b;
import org.vidogram.ui.a.l;
import org.vidogram.ui.am;

@SuppressLint({"NewApi"})
public class ak extends FrameLayout
  implements d.a
{
  private bk A;
  private e B;
  private e.a C;
  private Rect D;
  private bf E;
  private boolean F = true;
  private Animator G;
  private h H = new h("Paint");
  private ArrayList<org.vidogram.ui.Components.a.f> I;
  int a;
  private Bitmap b;
  private int c;
  private p d;
  private org.vidogram.ui.Components.a.a[] e = { new a.c(), new org.vidogram.ui.Components.a.a.a(), new a.b() };
  private FrameLayout f;
  private TextView g;
  private TextView h;
  private FrameLayout i;
  private j j;
  private org.vidogram.ui.Components.a.a.c k;
  private FrameLayout l;
  private FrameLayout m;
  private FrameLayout n;
  private org.vidogram.ui.Components.a.a.a o;
  private ImageView p;
  private org.vidogram.ui.a.a q;
  private org.vidogram.ui.a.d r;
  private org.vidogram.ui.a.d s;
  private org.vidogram.ui.Components.a.a.d t;
  private boolean u;
  private ap v;
  private float w;
  private float x;
  private String y;
  private boolean z;

  public ak(Context paramContext, Bitmap paramBitmap, int paramInt)
  {
    super(paramContext);
    this.b = paramBitmap;
    this.c = paramInt;
    this.d = new p();
    this.d.a(new p.a()
    {
      public void a()
      {
        ak.a(ak.this, ak.a(ak.this).a());
      }
    });
    this.i = new FrameLayout(paramContext);
    this.i.setBackgroundColor(-16777216);
    this.i.setVisibility(4);
    addView(this.i);
    this.j = new j(paramContext, new org.vidogram.ui.Components.a.d(getPaintingSize()), paramBitmap, this.c);
    this.j.setDelegate(new j.b()
    {
      public void a()
      {
        ak.b(ak.this, false);
        if (ak.b(ak.this) != null)
          ak.a(ak.this, null);
      }

      public void a(boolean paramBoolean)
      {
        if (paramBoolean)
          ak.b(ak.this, true);
        ak.a(ak.this, ak.a(ak.this).a());
      }

      public boolean b()
      {
        if (ak.b(ak.this) == null);
        for (int i = 1; ; i = 0)
        {
          if (i == 0)
            ak.a(ak.this, null);
          return i;
        }
      }
    });
    this.j.setUndoStore(this.d);
    this.j.setQueue(this.H);
    this.j.setVisibility(4);
    this.j.setBrush(this.e[0]);
    addView(this.j, v.b(-1, -1, 51));
    this.k = new org.vidogram.ui.Components.a.a.c(paramContext, new c.a()
    {
      public boolean a()
      {
        return ak.c(ak.this).getVisibility() != 0;
      }

      public void b()
      {
        ak.a(ak.this, null);
      }

      public org.vidogram.ui.Components.a.a.d c()
      {
        return ak.b(ak.this);
      }
    });
    this.k.setPivotX(0.0F);
    this.k.setPivotY(0.0F);
    addView(this.k);
    this.l = new FrameLayout(paramContext);
    this.l.setAlpha(0.0F);
    this.l.setBackgroundColor(1711276032);
    this.l.setVisibility(8);
    addView(this.l);
    this.m = new FrameLayout(paramContext);
    this.m.setAlpha(0.0F);
    this.m.setBackgroundColor(1711276032);
    this.m.setVisibility(8);
    this.m.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramView)
      {
        ak.this.a(true);
      }
    });
    this.n = new FrameLayout(paramContext)
    {
      public boolean onTouchEvent(MotionEvent paramMotionEvent)
      {
        return false;
      }
    };
    addView(this.n);
    this.o = new org.vidogram.ui.Components.a.a.a(paramContext);
    addView(this.o);
    this.o.setDelegate(new org.vidogram.ui.Components.a.a.a.a()
    {
      public void a()
      {
        if (!(ak.b(ak.this) instanceof g))
          ak.c(ak.this, true);
      }

      public void b()
      {
        ak.a(ak.this, ak.d(ak.this).getSwatch(), false);
      }

      public void c()
      {
        ak.a(ak.this, ak.d(ak.this).getSwatch(), false);
        if (!(ak.b(ak.this) instanceof g))
          ak.c(ak.this, false);
      }

      public void d()
      {
        if (ak.b(ak.this) != null)
        {
          if ((ak.b(ak.this) instanceof org.vidogram.ui.Components.a.a.f))
            ak.e(ak.this);
          do
            return;
          while (!(ak.b(ak.this) instanceof g));
          ak.f(ak.this);
          return;
        }
        ak.g(ak.this);
      }
    });
    this.f = new FrameLayout(paramContext);
    this.f.setBackgroundColor(-16777216);
    addView(this.f, v.b(-1, 48, 83));
    this.g = new TextView(paramContext);
    this.g.setTextSize(1, 14.0F);
    this.g.setTextColor(-1);
    this.g.setGravity(17);
    this.g.setBackgroundDrawable(l.a(-12763843, false));
    this.g.setPadding(org.vidogram.messenger.a.a(20.0F), 0, org.vidogram.messenger.a.a(20.0F), 0);
    this.g.setText(r.a("Cancel", 2131230943).toUpperCase());
    this.g.setTypeface(org.vidogram.messenger.a.a("fonts/rmedium.ttf"));
    this.f.addView(this.g, v.b(-2, -1, 51));
    this.h = new TextView(paramContext);
    this.h.setTextSize(1, 14.0F);
    this.h.setTextColor(-11420173);
    this.h.setGravity(17);
    this.h.setBackgroundDrawable(l.a(-12763843, false));
    this.h.setPadding(org.vidogram.messenger.a.a(20.0F), 0, org.vidogram.messenger.a.a(20.0F), 0);
    this.h.setText(r.a("Done", 2131231147).toUpperCase());
    this.h.setTypeface(org.vidogram.messenger.a.a("fonts/rmedium.ttf"));
    this.f.addView(this.h, v.b(-2, -1, 53));
    paramBitmap = new ImageView(paramContext);
    paramBitmap.setScaleType(ImageView.ScaleType.CENTER);
    paramBitmap.setImageResource(2130838040);
    paramBitmap.setBackgroundDrawable(l.a(1090519039));
    this.f.addView(paramBitmap, v.a(54, -1.0F, 17, 0.0F, 0.0F, 56.0F, 0.0F));
    paramBitmap.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramView)
      {
        ak.h(ak.this);
      }
    });
    this.p = new ImageView(paramContext);
    this.p.setScaleType(ImageView.ScaleType.CENTER);
    this.p.setImageResource(2130838035);
    this.p.setBackgroundDrawable(l.a(1090519039));
    this.f.addView(this.p, v.b(54, -1, 17));
    this.p.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramView)
      {
        ak.a(ak.this, null);
      }
    });
    paramBitmap = new ImageView(paramContext);
    paramBitmap.setScaleType(ImageView.ScaleType.CENTER);
    paramBitmap.setImageResource(2130838038);
    paramBitmap.setBackgroundDrawable(l.a(1090519039));
    this.f.addView(paramBitmap, v.a(54, -1.0F, 17, 56.0F, 0.0F, 0.0F, 0.0F));
    paramBitmap.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramView)
      {
        ak.i(ak.this);
      }
    });
    this.q = new org.vidogram.ui.a.a(paramContext);
    this.q.setBackgroundColor(2130706432);
    paramContext = this.q;
    if (Build.VERSION.SDK_INT >= 21);
    for (boolean bool = true; ; bool = false)
    {
      paramContext.setOccupyStatusBar(bool);
      this.q.setItemsBackgroundColor(1090519039);
      this.q.setBackButtonImage(2130837794);
      this.q.setTitle(r.a("PaintDraw", 2131231636));
      addView(this.q, v.a(-1, -2.0F));
      this.q.setActionBarMenuOnItemClick(new org.vidogram.ui.a.a.a()
      {
        public void a(int paramInt)
        {
          if (paramInt == -1)
            ak.j(ak.this).callOnClick();
          do
          {
            return;
            if (paramInt != 1)
              continue;
            ak.this.a(true);
            return;
          }
          while (paramInt != 2);
          ak.a(ak.this).b();
        }

        public boolean a()
        {
          return false;
        }
      });
      paramContext = this.q.a();
      this.r = paramContext.a(2, 2130838044, org.vidogram.messenger.a.a(56.0F));
      setMenuItemEnabled(false);
      this.s = paramContext.b(1, 2130837825, org.vidogram.messenger.a.a(56.0F));
      this.s.setVisibility(8);
      a(this.o.getSwatch(), false);
      d();
      return;
    }
  }

  private FrameLayout a(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    FrameLayout localFrameLayout = new FrameLayout(getContext());
    localFrameLayout.setBackgroundResource(2130837946);
    localFrameLayout.setOnClickListener(new View.OnClickListener(paramInt1)
    {
      public void onClick(View paramView)
      {
        ak.a(ak.this, this.a);
        if ((ak.p(ak.this) != null) && (ak.p(ak.this).isShowing()))
          ak.p(ak.this).b(true);
      }
    });
    ImageView localImageView = new ImageView(getContext());
    localImageView.setImageResource(paramInt2);
    localFrameLayout.addView(localImageView, v.a(165, 44.0F, 19, 46.0F, 0.0F, 8.0F, 0.0F));
    if (paramBoolean)
    {
      localImageView = new ImageView(getContext());
      localImageView.setImageResource(2130837797);
      localImageView.setScaleType(ImageView.ScaleType.CENTER);
      localFrameLayout.addView(localImageView, v.a(50, -1.0F));
    }
    return localFrameLayout;
  }

  private FrameLayout a(boolean paramBoolean1, String paramString, boolean paramBoolean2)
  {
    int i2 = -16777216;
    15 local15 = new FrameLayout(getContext())
    {
      public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
      {
        return true;
      }
    };
    local15.setBackgroundResource(2130837946);
    local15.setOnClickListener(new View.OnClickListener(paramBoolean1)
    {
      public void onClick(View paramView)
      {
        ak.d(ak.this, this.a);
        if ((ak.p(ak.this) != null) && (ak.p(ak.this).isShowing()))
          ak.p(ak.this).b(true);
      }
    });
    org.vidogram.ui.Components.a.a.b localb = new org.vidogram.ui.Components.a.a.b(getContext());
    localb.setBackgroundColor(0);
    localb.setEnabled(false);
    localb.setStrokeWidth(org.vidogram.messenger.a.a(3.0F));
    if (paramBoolean1)
    {
      i1 = -1;
      localb.setTextColor(i1);
      if (!paramBoolean1)
        break label231;
    }
    label231: for (int i1 = i2; ; i1 = 0)
    {
      localb.setStrokeColor(i1);
      localb.setPadding(org.vidogram.messenger.a.a(2.0F), 0, org.vidogram.messenger.a.a(2.0F), 0);
      localb.setTextSize(1, 18.0F);
      localb.setTypeface(null, 1);
      localb.setTag(Boolean.valueOf(paramBoolean1));
      localb.setText(paramString);
      local15.addView(localb, v.a(-2, -2.0F, 19, 46.0F, 0.0F, 16.0F, 0.0F));
      if (paramBoolean2)
      {
        paramString = new ImageView(getContext());
        paramString.setImageResource(2130837797);
        paramString.setScaleType(ImageView.ScaleType.CENTER);
        local15.addView(paramString, v.a(50, -1.0F));
      }
      return local15;
      i1 = -16777216;
      break;
    }
  }

  private org.vidogram.ui.Components.a.f a(int paramInt, long paramLong, g.mf parammf)
  {
    Object localObject;
    if ((paramInt < 0) || (paramInt > 3) || (this.I.isEmpty()))
    {
      localObject = null;
      return localObject;
    }
    int i3 = this.I.size();
    int i2 = Utilities.b.nextInt(i3);
    int i1 = i3;
    while (true)
    {
      if (i1 <= 0)
        break label102;
      org.vidogram.ui.Components.a.f localf = (org.vidogram.ui.Components.a.f)this.I.get(i2);
      localObject = localf;
      if (!a(localf, paramInt, paramLong, parammf))
        break;
      i2 = (i2 + 1) % i3;
      i1 -= 1;
    }
    label102: return null;
  }

  private void a(Runnable paramRunnable, View paramView, int paramInt1, int paramInt2, int paramInt3)
  {
    if ((this.B != null) && (this.B.isShowing()))
    {
      this.B.dismiss();
      return;
    }
    if (this.C == null)
    {
      this.D = new Rect();
      this.C = new e.a(getContext());
      this.C.setAnimationEnabled(false);
      this.C.setOnTouchListener(new View.OnTouchListener()
      {
        public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
        {
          if ((paramMotionEvent.getActionMasked() == 0) && (ak.p(ak.this) != null) && (ak.p(ak.this).isShowing()))
          {
            paramView.getHitRect(ak.u(ak.this));
            if (!ak.u(ak.this).contains((int)paramMotionEvent.getX(), (int)paramMotionEvent.getY()))
              ak.p(ak.this).dismiss();
          }
          return false;
        }
      });
      this.C.setDispatchKeyEventListener(new e.b()
      {
        public void a(KeyEvent paramKeyEvent)
        {
          if ((paramKeyEvent.getKeyCode() == 4) && (paramKeyEvent.getRepeatCount() == 0) && (ak.p(ak.this) != null) && (ak.p(ak.this).isShowing()))
            ak.p(ak.this).dismiss();
        }
      });
      this.C.setShowedFromBotton(true);
    }
    this.C.a();
    paramRunnable.run();
    if (this.B == null)
    {
      this.B = new e(this.C, -2, -2);
      this.B.a(false);
      this.B.setAnimationStyle(2131427549);
      this.B.setOutsideTouchable(true);
      this.B.setClippingEnabled(true);
      this.B.setInputMethodMode(2);
      this.B.setSoftInputMode(0);
      this.B.getContentView().setFocusableInTouchMode(true);
      this.B.setOnDismissListener(new PopupWindow.OnDismissListener()
      {
        public void onDismiss()
        {
          ak.s(ak.this).a();
        }
      });
    }
    this.C.measure(View.MeasureSpec.makeMeasureSpec(org.vidogram.messenger.a.a(1000.0F), -2147483648), View.MeasureSpec.makeMeasureSpec(org.vidogram.messenger.a.a(1000.0F), -2147483648));
    this.B.setFocusable(true);
    this.B.showAtLocation(paramView, paramInt1, paramInt2, paramInt3);
    this.B.a();
  }

  private void a(g.q paramq)
  {
    a locala = b(paramq);
    paramq = new org.vidogram.ui.Components.a.a.f(getContext(), a.a(locala), a.b(locala), a.c(locala), k(), paramq);
    paramq.setDelegate(this);
    this.k.addView(paramq);
    i(paramq);
    g(paramq);
  }

  private void a(org.vidogram.ui.Components.a.n paramn, boolean paramBoolean)
  {
    this.j.setColor(paramn.a);
    this.j.setBrushSize(paramn.c);
    if (paramBoolean)
      this.o.setSwatch(paramn);
    if ((this.t instanceof g))
      ((g)this.t).setSwatch(paramn);
  }

  private void a(boolean paramBoolean, org.vidogram.ui.Components.a.a.d paramd)
  {
    if ((paramBoolean) && (paramd != null))
    {
      ViewGroup localViewGroup = (ViewGroup)paramd.getParent();
      if (this.m.getParent() != null)
        ((org.vidogram.ui.Components.a.a.c)this.m.getParent()).removeView(this.m);
      localViewGroup.addView(this.m, localViewGroup.indexOfChild(paramd));
    }
    boolean bool;
    if (!paramBoolean)
    {
      bool = true;
      paramd.setSelectionVisibility(bool);
      if (!paramBoolean)
        break label135;
      this.m.setVisibility(0);
    }
    label135: for (paramd = ObjectAnimator.ofFloat(this.m, "alpha", new float[] { 0.0F, 1.0F }); ; paramd = ObjectAnimator.ofFloat(this.m, "alpha", new float[] { 1.0F, 0.0F }))
    {
      paramd.addListener(new org.vidogram.messenger.b(paramBoolean)
      {
        public void onAnimationEnd(Animator paramAnimator)
        {
          if (!this.a)
          {
            ak.c(ak.this).setVisibility(8);
            if (ak.c(ak.this).getParent() != null)
              ((org.vidogram.ui.Components.a.a.c)ak.c(ak.this).getParent()).removeView(ak.c(ak.this));
          }
        }
      });
      paramd.setDuration(200L);
      paramd.start();
      return;
      bool = false;
      break;
    }
  }

  private boolean a(org.vidogram.ui.Components.a.f paramf, int paramInt, long paramLong, g.mf parammf)
  {
    int i3 = 0;
    parammf = paramf.a(paramInt);
    int i2;
    if (parammf == null)
      i2 = 1;
    float f1;
    int i1;
    do
    {
      return i2;
      f1 = paramf.b(0);
      i1 = 0;
      i2 = i3;
    }
    while (i1 >= this.k.getChildCount());
    paramf = this.k.getChildAt(i1);
    if (!(paramf instanceof org.vidogram.ui.Components.a.a.f));
    float f2;
    do
    {
      do
      {
        i1 += 1;
        break;
        paramf = (org.vidogram.ui.Components.a.a.f)paramf;
      }
      while (paramf.getAnchor() != paramInt);
      ap localap = paramf.getPosition();
      f2 = (float)Math.hypot(localap.a - parammf.a, localap.b - parammf.b);
    }
    while (((paramLong != paramf.getSticker().b) && (this.I.size() <= 1)) || (f2 >= f1 * 1.1F));
    return true;
  }

  private a b(g.q paramq)
  {
    int i1 = 0;
    if (i1 < paramq.o.size())
    {
      localObject1 = (g.r)paramq.o.get(i1);
      if (!(localObject1 instanceof g.ia));
    }
    for (Object localObject1 = ((g.r)localObject1).f; ; localObject1 = null)
    {
      Object localObject2 = new a(f(), 0.75F, 0.0F);
      if ((localObject1 == null) || (this.I == null) || (this.I.size() == 0))
      {
        return localObject2;
        i1 += 1;
        break;
      }
      i1 = ((g.mf)localObject1).c;
      paramq = a(i1, paramq.b, (g.mf)localObject1);
      if (paramq == null)
        return localObject2;
      localObject2 = paramq.a(i1);
      float f6 = paramq.b(i1);
      float f1 = paramq.b();
      float f2 = (float)(f6 / k().a * ((g.mf)localObject1).f);
      float f7 = (float)Math.toRadians(f1);
      float f3 = (float)(Math.sin(1.570796326794897D - f7) * f6 * ((g.mf)localObject1).d);
      float f4 = (float)(Math.cos(1.570796326794897D - f7) * f6 * ((g.mf)localObject1).d);
      float f5 = (float)(Math.cos(f7 + 1.570796326794897D) * f6 * ((g.mf)localObject1).e);
      f6 = (float)(Math.sin(f7 + 1.570796326794897D) * f6 * ((g.mf)localObject1).e);
      return new a(new ap(((ap)localObject2).a + f3 + f5, ((ap)localObject2).b + f4 + f6), f2, f1);
    }
  }

  private boolean c()
  {
    return (this.c % 360 == 90) || (this.c % 360 == 270);
  }

  private void d()
  {
    int i1 = 2130838037;
    if (this.t != null)
      if ((this.t instanceof org.vidogram.ui.Components.a.a.f))
      {
        i1 = 2130838033;
        this.p.setImageResource(2130838035);
      }
    while (true)
    {
      this.o.setSettingsButtonImage(i1);
      return;
      if (!(this.t instanceof g))
        break;
      i1 = 2130838034;
      break;
      this.p.setImageResource(2130838036);
    }
  }

  private boolean e()
  {
    return (this.d.a()) || (this.k.a() > 0);
  }

  private ap f()
  {
    bf localbf = getPaintingSize();
    return new ap(localbf.a / 2.0F, localbf.b / 2.0F);
  }

  private ap f(org.vidogram.ui.Components.a.a.d paramd)
  {
    Object localObject;
    if (paramd != null)
    {
      paramd = paramd.getPosition();
      localObject = new ap(paramd.a + 200.0F, paramd.b + 200.0F);
      return localObject;
    }
    for (paramd = f(); ; paramd = new ap(paramd.a + 200.0F, paramd.b + 200.0F))
    {
      int i1 = 0;
      int i2 = 0;
      if (i1 < this.k.getChildCount())
      {
        localObject = this.k.getChildAt(i1);
        if (!(localObject instanceof org.vidogram.ui.Components.a.a.d));
        while (true)
        {
          i1 += 1;
          break;
          localObject = ((org.vidogram.ui.Components.a.a.d)localObject).getPosition();
          if ((float)Math.sqrt(Math.pow(((ap)localObject).a - paramd.a, 2.0D) + Math.pow(((ap)localObject).b - paramd.b, 2.0D)) >= 100.0F)
            continue;
          i2 = 1;
        }
      }
      localObject = paramd;
      if (i2 == 0)
        break;
    }
  }

  private void g()
  {
    if (this.t == null)
      return;
    Object localObject = null;
    ap localap = f(this.t);
    if ((this.t instanceof org.vidogram.ui.Components.a.a.f))
    {
      localObject = new org.vidogram.ui.Components.a.a.f(getContext(), (org.vidogram.ui.Components.a.a.f)this.t, localap);
      ((org.vidogram.ui.Components.a.a.f)localObject).setDelegate(this);
      this.k.addView((View)localObject);
    }
    while (true)
    {
      i((org.vidogram.ui.Components.a.a.d)localObject);
      g((org.vidogram.ui.Components.a.a.d)localObject);
      d();
      return;
      if (!(this.t instanceof g))
        continue;
      localObject = new g(getContext(), (g)this.t, localap);
      ((g)localObject).setDelegate(this);
      ((g)localObject).setMaxWidth((int)(getPaintingSize().a - 20.0F));
      this.k.addView((View)localObject, v.a(-2, -2.0F));
    }
  }

  private boolean g(org.vidogram.ui.Components.a.a.d paramd)
  {
    int i2 = 1;
    int i1 = 0;
    if (this.t != null)
    {
      if (this.t == paramd)
      {
        if (!this.u)
          j(this.t);
        return true;
      }
      this.t.d();
      i1 = 1;
    }
    this.t = paramd;
    if (this.t != null)
    {
      this.t.a(this.n);
      this.k.a(this.t);
      i1 = i2;
      if ((this.t instanceof g))
      {
        a(((g)this.t).getSwatch(), true);
        i1 = i2;
      }
    }
    while (true)
    {
      d();
      return i1;
    }
  }

  private int getFrameRotation()
  {
    switch (this.c)
    {
    default:
      return 0;
    case 90:
      return 1;
    case 180:
      return 2;
    case 270:
    }
    return 3;
  }

  private bf getPaintingSize()
  {
    if (this.E != null)
      return this.E;
    float f1;
    float f2;
    if (c())
    {
      f1 = this.b.getHeight();
      if (!c())
        break label132;
      f2 = this.b.getWidth();
    }
    while (true)
    {
      bf localbf = new bf(f1, f2);
      localbf.a = 1280.0F;
      localbf.b = (float)Math.floor(localbf.a * f2 / f1);
      if (localbf.b > 1280.0F)
      {
        localbf.b = 1280.0F;
        localbf.a = (float)Math.floor(f1 * localbf.b / f2);
      }
      this.E = localbf;
      return localbf;
      f1 = this.b.getWidth();
      break;
      label132: f2 = this.b.getHeight();
    }
  }

  private void h()
  {
    if ((this.A != null) && (this.A.getVisibility() == 0))
      return;
    this.z = true;
    if (this.A == null)
    {
      this.A = new bk(getContext());
      this.A.setListener(new bk.b()
      {
        public void a()
        {
          ak.n(ak.this);
        }

        public void a(g.q paramq)
        {
          ak.m(ak.this);
          ak.a(ak.this, paramq);
        }
      });
      addView(this.A, v.b(-1, -1, 51));
    }
    this.A.setVisibility(0);
    ObjectAnimator localObjectAnimator = ObjectAnimator.ofFloat(this.A, "alpha", new float[] { 0.0F, 1.0F });
    localObjectAnimator.setDuration(200L);
    localObjectAnimator.start();
    this.r.setVisibility(8);
    i();
  }

  private void h(org.vidogram.ui.Components.a.a.d paramd)
  {
    if (paramd == this.t)
    {
      this.t.d();
      this.t = null;
      d();
    }
    this.k.removeView(paramd);
    this.d.a(paramd.getUUID());
  }

  private void i()
  {
    if ((this.A == null) || (this.A.getVisibility() != 0))
      return;
    switch (this.A.getCurrentType())
    {
    default:
      return;
    case 0:
      this.q.setTitle(r.a("PaintStickers", 2131231641));
      return;
    case 1:
    }
    this.q.setTitle(r.a("Masks", 2131231409));
  }

  private void i(org.vidogram.ui.Components.a.a.d paramd)
  {
    this.d.a(paramd.getUUID(), new Runnable(paramd)
    {
      public void run()
      {
        ak.b(ak.this, this.a);
      }
    });
  }

  private void j()
  {
    if ((this.A == null) || (this.A.getVisibility() != 0))
      return;
    this.z = false;
    ObjectAnimator localObjectAnimator = ObjectAnimator.ofFloat(this.A, "alpha", new float[] { 1.0F, 0.0F });
    localObjectAnimator.setDuration(200L);
    localObjectAnimator.addListener(new org.vidogram.messenger.b()
    {
      public void onAnimationEnd(Animator paramAnimator)
      {
        ak.o(ak.this).setVisibility(8);
      }
    });
    localObjectAnimator.start();
    this.r.setVisibility(0);
    this.q.setTitle(r.a("PaintDraw", 2131231636));
  }

  private void j(org.vidogram.ui.Components.a.a.d paramd)
  {
    int i1 = (int)((paramd.getPosition().a - this.k.getWidth() / 2) * this.k.getScaleX());
    int i2 = (int)((paramd.getPosition().b - paramd.getHeight() * paramd.getScale() / 2.0F - this.k.getHeight() / 2) * this.k.getScaleY());
    int i3 = org.vidogram.messenger.a.a(32.0F);
    a(new Runnable(paramd)
    {
      public void run()
      {
        LinearLayout localLinearLayout = new LinearLayout(ak.this.getContext());
        localLinearLayout.setOrientation(0);
        Object localObject = new TextView(ak.this.getContext());
        ((TextView)localObject).setTextColor(-14606047);
        ((TextView)localObject).setBackgroundResource(2130837946);
        ((TextView)localObject).setGravity(16);
        ((TextView)localObject).setPadding(org.vidogram.messenger.a.a(16.0F), 0, org.vidogram.messenger.a.a(14.0F), 0);
        ((TextView)localObject).setTextSize(1, 18.0F);
        ((TextView)localObject).setTag(Integer.valueOf(0));
        ((TextView)localObject).setText(r.a("PaintDelete", 2131231635));
        ((TextView)localObject).setOnClickListener(new View.OnClickListener()
        {
          public void onClick(View paramView)
          {
            ak.b(ak.this, ak.11.this.a);
            if ((ak.p(ak.this) != null) && (ak.p(ak.this).isShowing()))
              ak.p(ak.this).b(true);
          }
        });
        localLinearLayout.addView((View)localObject, v.b(-2, 48));
        if ((this.a instanceof g))
        {
          localObject = new TextView(ak.this.getContext());
          ((TextView)localObject).setTextColor(-14606047);
          ((TextView)localObject).setBackgroundResource(2130837946);
          ((TextView)localObject).setGravity(16);
          ((TextView)localObject).setPadding(org.vidogram.messenger.a.a(16.0F), 0, org.vidogram.messenger.a.a(16.0F), 0);
          ((TextView)localObject).setTextSize(1, 18.0F);
          ((TextView)localObject).setTag(Integer.valueOf(1));
          ((TextView)localObject).setText(r.a("PaintEdit", 2131231638));
          ((TextView)localObject).setOnClickListener(new View.OnClickListener()
          {
            public void onClick(View paramView)
            {
              ak.q(ak.this);
              if ((ak.p(ak.this) != null) && (ak.p(ak.this).isShowing()))
                ak.p(ak.this).b(true);
            }
          });
          localLinearLayout.addView((View)localObject, v.b(-2, 48));
        }
        localObject = new TextView(ak.this.getContext());
        ((TextView)localObject).setTextColor(-14606047);
        ((TextView)localObject).setBackgroundResource(2130837946);
        ((TextView)localObject).setGravity(16);
        ((TextView)localObject).setPadding(org.vidogram.messenger.a.a(14.0F), 0, org.vidogram.messenger.a.a(16.0F), 0);
        ((TextView)localObject).setTextSize(1, 18.0F);
        ((TextView)localObject).setTag(Integer.valueOf(2));
        ((TextView)localObject).setText(r.a("PaintDuplicate", 2131231637));
        ((TextView)localObject).setOnClickListener(new View.OnClickListener()
        {
          public void onClick(View paramView)
          {
            ak.r(ak.this);
            if ((ak.p(ak.this) != null) && (ak.p(ak.this).isShowing()))
              ak.p(ak.this).b(true);
          }
        });
        localLinearLayout.addView((View)localObject, v.b(-2, 48));
        ak.s(ak.this).addView(localLinearLayout);
        localObject = (LinearLayout.LayoutParams)localLinearLayout.getLayoutParams();
        ((LinearLayout.LayoutParams)localObject).width = -2;
        ((LinearLayout.LayoutParams)localObject).height = -2;
        localLinearLayout.setLayoutParams((ViewGroup.LayoutParams)localObject);
      }
    }
    , paramd, 17, i1, i2 - i3);
  }

  private bf k()
  {
    float f1 = (float)Math.floor(getPaintingSize().a * 0.5D);
    return new bf(f1, f1);
  }

  private void l()
  {
    if ((this.t instanceof org.vidogram.ui.Components.a.a.f))
      ((org.vidogram.ui.Components.a.a.f)this.t).e();
  }

  private int m()
  {
    return (int)(getPaintingSize().a / 9.0F);
  }

  private void n()
  {
    org.vidogram.ui.Components.a.n localn = this.o.getSwatch();
    Object localObject = new org.vidogram.ui.Components.a.n(-1, 1.0F, localn.c);
    localn = new org.vidogram.ui.Components.a.n(-16777216, 0.85F, localn.c);
    if (this.F)
      localObject = localn;
    while (true)
    {
      a((org.vidogram.ui.Components.a.n)localObject, true);
      localObject = new g(getContext(), f(null), m(), "", this.o.getSwatch(), this.F);
      ((g)localObject).setDelegate(this);
      ((g)localObject).setMaxWidth((int)(getPaintingSize().a - 20.0F));
      this.k.addView((View)localObject, v.a(-2, -2.0F));
      i((org.vidogram.ui.Components.a.a.d)localObject);
      g((org.vidogram.ui.Components.a.a.d)localObject);
      o();
      return;
    }
  }

  private void o()
  {
    if ((!(this.t instanceof g)) || (this.u))
      return;
    this.i.setVisibility(0);
    g localg = (g)this.t;
    this.y = localg.getText();
    this.u = true;
    this.v = localg.getPosition();
    this.w = localg.getRotation();
    this.x = localg.getScale();
    localg.setPosition(f());
    localg.setRotation(0.0F);
    localg.setScale(1.0F);
    this.r.setVisibility(8);
    this.s.setVisibility(0);
    this.q.setTitle(r.a("PaintText", 2131231642));
    this.f.setVisibility(8);
    setColorPickerVisibilitySlide(false);
    a(true, localg);
    localg.e();
    ((InputMethodManager)ApplicationLoader.a.getSystemService("input_method")).toggleSoftInputFromWindow(localg.getFocusedView().getWindowToken(), 2, 0);
  }

  private void p()
  {
    a(new Runnable()
    {
      public void run()
      {
        boolean bool2 = true;
        Object localObject = ak.this;
        LinearLayout.LayoutParams localLayoutParams;
        if (ak.this.a == 0)
        {
          bool1 = true;
          localObject = ak.a((ak)localObject, 0, 2130838021, bool1);
          ak.s(ak.this).addView((View)localObject);
          localLayoutParams = (LinearLayout.LayoutParams)((View)localObject).getLayoutParams();
          localLayoutParams.width = -1;
          localLayoutParams.height = org.vidogram.messenger.a.a(52.0F);
          ((View)localObject).setLayoutParams(localLayoutParams);
          localObject = ak.this;
          if (ak.this.a != 1)
            break label214;
          bool1 = true;
          label88: localObject = ak.a((ak)localObject, 1, 2130838017, bool1);
          ak.s(ak.this).addView((View)localObject);
          localLayoutParams = (LinearLayout.LayoutParams)((View)localObject).getLayoutParams();
          localLayoutParams.width = -1;
          localLayoutParams.height = org.vidogram.messenger.a.a(52.0F);
          ((View)localObject).setLayoutParams(localLayoutParams);
          localObject = ak.this;
          if (ak.this.a != 2)
            break label219;
        }
        label214: label219: for (boolean bool1 = bool2; ; bool1 = false)
        {
          localObject = ak.a((ak)localObject, 2, 2130838019, bool1);
          ak.s(ak.this).addView((View)localObject);
          localLayoutParams = (LinearLayout.LayoutParams)((View)localObject).getLayoutParams();
          localLayoutParams.width = -1;
          localLayoutParams.height = org.vidogram.messenger.a.a(52.0F);
          ((View)localObject).setLayoutParams(localLayoutParams);
          return;
          bool1 = false;
          break;
          bool1 = false;
          break label88;
        }
      }
    }
    , this, 85, 0, org.vidogram.messenger.a.a(48.0F));
  }

  private void q()
  {
    a(new Runnable()
    {
      public void run()
      {
        Object localObject1 = ak.a(ak.this, true, r.a("PaintOutlined", 2131231639), ak.t(ak.this));
        ak.s(ak.this).addView((View)localObject1);
        Object localObject2 = (LinearLayout.LayoutParams)((View)localObject1).getLayoutParams();
        ((LinearLayout.LayoutParams)localObject2).width = -1;
        ((LinearLayout.LayoutParams)localObject2).height = org.vidogram.messenger.a.a(48.0F);
        ((View)localObject1).setLayoutParams((ViewGroup.LayoutParams)localObject2);
        localObject1 = ak.this;
        localObject2 = r.a("PaintRegular", 2131231640);
        if (!ak.t(ak.this));
        for (boolean bool = true; ; bool = false)
        {
          localObject1 = ak.a((ak)localObject1, false, (String)localObject2, bool);
          ak.s(ak.this).addView((View)localObject1);
          localObject2 = (LinearLayout.LayoutParams)((View)localObject1).getLayoutParams();
          ((LinearLayout.LayoutParams)localObject2).width = -1;
          ((LinearLayout.LayoutParams)localObject2).height = org.vidogram.messenger.a.a(48.0F);
          ((View)localObject1).setLayoutParams((ViewGroup.LayoutParams)localObject2);
          return;
        }
      }
    }
    , this, 85, 0, org.vidogram.messenger.a.a(48.0F));
  }

  private void r()
  {
    this.H.b(new Runnable()
    {
      public void run()
      {
        while (true)
        {
          ArrayList localArrayList;
          int i;
          try
          {
            com.google.android.gms.vision.face.b localb = new com.google.android.gms.vision.face.b.a(ak.this.getContext()).b(1).a(1).a(false).a();
            if (localb.b())
              continue;
            org.vidogram.messenger.n.a("tmessages", "face detection is not operational");
            return;
            Object localObject = new com.google.android.gms.vision.b.a().a(ak.w(ak.this)).a(ak.v(ak.this)).a();
            try
            {
              localObject = localb.a((com.google.android.gms.vision.b)localObject);
              localArrayList = new ArrayList();
              bf localbf = ak.x(ak.this);
              i = 0;
              if (i < ((SparseArray)localObject).size())
              {
                org.vidogram.ui.Components.a.f localf = new org.vidogram.ui.Components.a.f((com.google.android.gms.vision.face.a)((SparseArray)localObject).get(((SparseArray)localObject).keyAt(i)), ak.w(ak.this), localbf, ak.y(ak.this));
                if (!localf.a())
                  break label197;
                localArrayList.add(localf);
              }
            }
            catch (Throwable localThrowable)
            {
              org.vidogram.messenger.n.a("tmessages", localThrowable);
              return;
            }
          }
          catch (Exception localException)
          {
            org.vidogram.messenger.n.a("tmessages", localException);
            return;
          }
          ak.a(ak.this, localArrayList);
          localException.a();
          return;
          label197: i += 1;
        }
      }
    });
  }

  private void setBrush(int paramInt)
  {
    j localj = this.j;
    org.vidogram.ui.Components.a.a[] arrayOfa = this.e;
    this.a = paramInt;
    localj.setBrush(arrayOfa[paramInt]);
  }

  private void setColorPickerVisibilityFade(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.G = ObjectAnimator.ofFloat(this.o, "alpha", new float[] { this.o.getAlpha(), 1.0F });
      this.G.setStartDelay(200L);
      this.G.setDuration(200L);
      this.G.addListener(new org.vidogram.messenger.b()
      {
        public void onAnimationEnd(Animator paramAnimator)
        {
          if (ak.k(ak.this) != null)
            ak.a(ak.this, null);
        }
      });
      this.G.start();
      return;
    }
    if (this.G != null)
    {
      this.G.cancel();
      this.G = null;
    }
    this.o.setAlpha(0.0F);
  }

  private void setColorPickerVisibilitySlide(boolean paramBoolean)
  {
    float f2 = 0.0F;
    Object localObject = this.o;
    float f1;
    if (paramBoolean)
    {
      f1 = org.vidogram.messenger.a.a(60.0F);
      if (!paramBoolean)
        break label65;
    }
    while (true)
    {
      localObject = ObjectAnimator.ofFloat(localObject, "translationX", new float[] { f1, f2 });
      ((Animator)localObject).setDuration(200L);
      ((Animator)localObject).start();
      return;
      f1 = 0.0F;
      break;
      label65: f2 = org.vidogram.messenger.a.a(60.0F);
    }
  }

  private void setDimVisibility(boolean paramBoolean)
  {
    if (paramBoolean)
      this.l.setVisibility(0);
    for (ObjectAnimator localObjectAnimator = ObjectAnimator.ofFloat(this.l, "alpha", new float[] { 0.0F, 1.0F }); ; localObjectAnimator = ObjectAnimator.ofFloat(this.l, "alpha", new float[] { 1.0F, 0.0F }))
    {
      localObjectAnimator.addListener(new org.vidogram.messenger.b(paramBoolean)
      {
        public void onAnimationEnd(Animator paramAnimator)
        {
          if (!this.a)
            ak.l(ak.this).setVisibility(8);
        }
      });
      localObjectAnimator.setDuration(200L);
      localObjectAnimator.start();
      return;
    }
  }

  private void setMenuItemEnabled(boolean paramBoolean)
  {
    org.vidogram.ui.a.d locald = this.r;
    float f1;
    if (paramBoolean)
      f1 = 1.0F;
    while (true)
    {
      locald.setAlpha(f1);
      this.r.setEnabled(paramBoolean);
      return;
      f1 = 0.3F;
    }
  }

  private void setStroke(boolean paramBoolean)
  {
    this.F = paramBoolean;
    org.vidogram.ui.Components.a.n localn;
    if ((this.t instanceof g))
    {
      localn = this.o.getSwatch();
      if ((!paramBoolean) || (localn.a != -1))
        break label68;
      a(new org.vidogram.ui.Components.a.n(-16777216, 0.85F, localn.c), true);
    }
    while (true)
    {
      ((g)this.t).setStroke(paramBoolean);
      return;
      label68: if ((paramBoolean) || (localn.a != -16777216))
        continue;
      a(new org.vidogram.ui.Components.a.n(-1, 1.0F, localn.c), true);
    }
  }

  public void a()
  {
    this.j.setVisibility(0);
    r();
  }

  public void a(am paramam, Activity paramActivity, Runnable paramRunnable)
  {
    if (this.u)
      a(false);
    while (true)
    {
      return;
      if (this.z)
      {
        j();
        return;
      }
      if (!e())
        break;
      if (paramActivity == null)
        continue;
      paramActivity = new AlertDialog.Builder(paramActivity);
      paramActivity.setMessage(r.a("DiscardChanges", 2131231145));
      paramActivity.setTitle(r.a("AppName", 2131230856));
      paramActivity.setPositiveButton(r.a("OK", 2131231604), new DialogInterface.OnClickListener(paramRunnable)
      {
        public void onClick(DialogInterface paramDialogInterface, int paramInt)
        {
          this.a.run();
        }
      });
      paramActivity.setNegativeButton(r.a("Cancel", 2131230943), null);
      paramam.a(paramActivity);
      return;
    }
    paramRunnable.run();
  }

  public void a(boolean paramBoolean)
  {
    if ((!this.u) || (!(this.t instanceof g)))
      return;
    g localg = (g)this.t;
    this.r.setVisibility(0);
    this.s.setVisibility(8);
    this.q.setTitle(r.a("PaintDraw", 2131231636));
    this.f.setVisibility(0);
    setColorPickerVisibilitySlide(true);
    org.vidogram.messenger.a.b(localg.getFocusedView());
    localg.getFocusedView().clearFocus();
    localg.f();
    if (!paramBoolean)
      localg.setText(this.y);
    if (localg.getText().trim().length() == 0)
    {
      this.k.removeView(localg);
      g(null);
    }
    while (true)
    {
      a(false, localg);
      this.u = false;
      this.y = null;
      this.i.setVisibility(8);
      return;
      localg.setPosition(this.v);
      localg.setRotation(this.w);
      localg.setScale(this.x);
      this.v = null;
      this.w = 0.0F;
      this.x = 0.0F;
    }
  }

  public boolean a(org.vidogram.ui.Components.a.a.d paramd)
  {
    return g(paramd);
  }

  public void b()
  {
    this.j.c();
    this.k.setVisibility(8);
    this.n.setVisibility(8);
    this.H.b(new Runnable()
    {
      public void run()
      {
        Looper localLooper = Looper.myLooper();
        if (localLooper != null)
          localLooper.quit();
      }
    });
  }

  public boolean b(org.vidogram.ui.Components.a.a.d paramd)
  {
    j(paramd);
    return true;
  }

  public boolean c(org.vidogram.ui.Components.a.a.d paramd)
  {
    return !this.u;
  }

  public void d(org.vidogram.ui.Components.a.a.d paramd)
  {
    setColorPickerVisibilityFade(false);
  }

  public void e(org.vidogram.ui.Components.a.a.d paramd)
  {
    setColorPickerVisibilityFade(true);
  }

  public org.vidogram.ui.a.a getActionBar()
  {
    return this.q;
  }

  public Bitmap getBitmap()
  {
    Bitmap localBitmap = this.j.getResultBitmap();
    if ((localBitmap != null) && (this.k.a() > 0))
    {
      Canvas localCanvas1 = new Canvas(localBitmap);
      int i1 = 0;
      if (i1 < this.k.getChildCount())
      {
        View localView = this.k.getChildAt(i1);
        localCanvas1.save();
        Object localObject;
        Canvas localCanvas2;
        if ((localView instanceof org.vidogram.ui.Components.a.a.d))
        {
          localObject = (org.vidogram.ui.Components.a.a.d)localView;
          localCanvas1.translate(((org.vidogram.ui.Components.a.a.d)localObject).getPosition().a, ((org.vidogram.ui.Components.a.a.d)localObject).getPosition().b);
          localCanvas1.scale(localView.getScaleX(), localView.getScaleY());
          localCanvas1.rotate(localView.getRotation());
          localCanvas1.translate(-((org.vidogram.ui.Components.a.a.d)localObject).getWidth() / 2, -((org.vidogram.ui.Components.a.a.d)localObject).getHeight() / 2);
          if (!(localView instanceof g))
            break label245;
          localObject = org.vidogram.messenger.c.a(localView.getWidth(), localView.getHeight(), Bitmap.Config.ARGB_8888);
          localCanvas2 = new Canvas((Bitmap)localObject);
          localView.draw(localCanvas2);
          localCanvas1.drawBitmap((Bitmap)localObject, null, new Rect(0, 0, ((Bitmap)localObject).getWidth(), ((Bitmap)localObject).getHeight()), null);
        }
        while (true)
        {
          try
          {
            localCanvas2.setBitmap(null);
            ((Bitmap)localObject).recycle();
            localCanvas1.restore();
            i1 += 1;
          }
          catch (Exception localException)
          {
            org.vidogram.messenger.n.a("tmessages", localException);
            continue;
          }
          label245: localException.draw(localCanvas1);
        }
      }
    }
    return (Bitmap)localBitmap;
  }

  public TextView getCancelTextView()
  {
    return this.g;
  }

  public org.vidogram.ui.Components.a.a.a getColorPicker()
  {
    return this.o;
  }

  public TextView getDoneTextView()
  {
    return this.h;
  }

  public ArrayList<g.ab> getMasks()
  {
    ArrayList localArrayList = null;
    int i2 = this.k.getChildCount();
    int i1 = 0;
    if (i1 < i2)
    {
      Object localObject = this.k.getChildAt(i1);
      if (!(localObject instanceof org.vidogram.ui.Components.a.a.f))
        break label105;
      localObject = ((org.vidogram.ui.Components.a.a.f)localObject).getSticker();
      if (localArrayList != null)
        break label102;
      localArrayList = new ArrayList();
      label57: g.jn localjn = new g.jn();
      localjn.b = ((g.q)localObject).b;
      localjn.c = ((g.q)localObject).c;
      localArrayList.add(localjn);
    }
    label102: label105: 
    while (true)
    {
      i1 += 1;
      break;
      return localArrayList;
      break label57;
    }
  }

  public FrameLayout getToolsView()
  {
    return this.f;
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramInt1 = paramInt3 - paramInt1;
    paramInt2 = paramInt4 - paramInt2;
    int i1 = org.vidogram.ui.a.a.getCurrentActionBarHeight();
    paramInt3 = this.q.getMeasuredHeight();
    this.q.layout(0, 0, this.q.getMeasuredWidth(), paramInt3);
    paramInt4 = org.vidogram.messenger.a.c.y - i1 - org.vidogram.messenger.a.a(48.0F);
    float f1;
    float f2;
    label101: float f3;
    if (this.b != null)
      if (c())
      {
        f1 = this.b.getHeight();
        if (!c())
          break label494;
        f2 = this.b.getWidth();
        f3 = paramInt1;
        if ((float)Math.floor(f3 * f2 / f1) <= paramInt4)
          break label528;
        f1 = (float)Math.floor(f1 * paramInt4 / f2);
      }
    while (true)
    {
      i1 = (int)Math.ceil((paramInt1 - this.j.getMeasuredWidth()) / 2);
      int i2 = (paramInt2 - paramInt3 - org.vidogram.messenger.a.a(48.0F) - this.j.getMeasuredHeight()) / 2 + paramInt3;
      this.j.layout(i1, i2, this.j.getMeasuredWidth() + i1, this.j.getMeasuredHeight() + i2);
      f1 /= this.E.a;
      this.k.setScaleX(f1);
      this.k.setScaleY(f1);
      this.k.layout(i1, i2, this.k.getMeasuredWidth() + i1, this.k.getMeasuredHeight() + i2);
      this.l.layout(0, paramInt3, this.l.getMeasuredWidth(), this.l.getMeasuredHeight() + paramInt3);
      this.n.layout(0, paramInt3, this.n.getMeasuredWidth(), this.n.getMeasuredHeight() + paramInt3);
      this.o.layout(0, paramInt3, this.o.getMeasuredWidth(), this.o.getMeasuredHeight() + paramInt3);
      this.f.layout(0, paramInt2 - this.f.getMeasuredHeight(), this.f.getMeasuredWidth(), paramInt2);
      this.i.layout(0, 0, paramInt1, paramInt4);
      if (this.A != null)
        this.A.layout(0, paramInt3, this.A.getMeasuredWidth(), this.A.getMeasuredHeight() + paramInt3);
      if (this.t != null)
      {
        this.t.c();
        this.t.a(this.k.getLeft() - this.n.getLeft(), this.k.getTop() - this.n.getTop());
      }
      return;
      f1 = this.b.getWidth();
      break;
      label494: f2 = this.b.getHeight();
      break label101;
      f1 = paramInt1;
      f2 = paramInt2 - i1 - org.vidogram.messenger.a.a(48.0F);
      break label101;
      label528: f1 = f3;
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i1 = View.MeasureSpec.getSize(paramInt1);
    paramInt2 = View.MeasureSpec.getSize(paramInt2);
    setMeasuredDimension(i1, paramInt2);
    this.q.measure(paramInt1, View.MeasureSpec.makeMeasureSpec(paramInt2, -2147483648));
    int i2 = org.vidogram.messenger.a.c.y - org.vidogram.ui.a.a.getCurrentActionBarHeight();
    int i3 = i2 - org.vidogram.messenger.a.a(48.0F);
    float f2;
    float f1;
    label96: float f3;
    float f4;
    if (this.b != null)
      if (c())
      {
        f2 = this.b.getHeight();
        if (!c())
          break label317;
        f1 = this.b.getWidth();
        f3 = i1;
        f4 = (float)Math.floor(f3 * f1 / f2);
        if (f4 <= i3)
          break label351;
        f3 = i3;
        f2 = (float)Math.floor(f2 * f3 / f1);
        f1 = f3;
      }
    while (true)
    {
      this.j.measure(View.MeasureSpec.makeMeasureSpec((int)f2, 1073741824), View.MeasureSpec.makeMeasureSpec((int)f1, 1073741824));
      this.k.measure(View.MeasureSpec.makeMeasureSpec((int)this.E.a, 1073741824), View.MeasureSpec.makeMeasureSpec((int)this.E.b, 1073741824));
      this.l.measure(paramInt1, View.MeasureSpec.makeMeasureSpec(i3, -2147483648));
      this.n.measure(paramInt1, View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
      this.o.measure(View.MeasureSpec.makeMeasureSpec(i1, 1073741824), View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
      this.f.measure(paramInt1, View.MeasureSpec.makeMeasureSpec(org.vidogram.messenger.a.a(48.0F), 1073741824));
      if (this.A != null)
        this.A.measure(paramInt1, View.MeasureSpec.makeMeasureSpec(i2, 1073741824));
      return;
      f2 = this.b.getWidth();
      break;
      label317: f1 = this.b.getHeight();
      break label96;
      f2 = i1;
      f1 = paramInt2 - org.vidogram.ui.a.a.getCurrentActionBarHeight() - org.vidogram.messenger.a.a(48.0F);
      break label96;
      label351: f1 = f4;
      f2 = f3;
    }
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (paramMotionEvent.getY() > this.q.getHeight())
    {
      if (this.t != null)
      {
        if (this.u)
          a(true);
      }
      else
        return true;
      g(null);
      return true;
    }
    return false;
  }

  private class a
  {
    private ap b;
    private float c;
    private float d;

    a(ap paramFloat1, float paramFloat2, float arg4)
    {
      this.b = paramFloat1;
      this.c = paramFloat2;
      Object localObject;
      this.d = localObject;
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.Components.ak
 * JD-Core Version:    0.6.0
 */