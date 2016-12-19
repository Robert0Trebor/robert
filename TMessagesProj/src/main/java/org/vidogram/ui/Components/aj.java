package org.vidogram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.os.Build.VERSION;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.TextureView.SurfaceTextureListener;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.concurrent.Semaphore;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL;
import org.vidogram.messenger.Utilities;
import org.vidogram.messenger.a;
import org.vidogram.messenger.b;
import org.vidogram.messenger.h;
import org.vidogram.messenger.n;
import org.vidogram.messenger.r;
import org.vidogram.messenger.support.widget.LinearLayoutManager;
import org.vidogram.messenger.support.widget.RecyclerView.a;
import org.vidogram.messenger.support.widget.RecyclerView.u;
import org.vidogram.ui.a.l;

@SuppressLint({"NewApi"})
public class aj extends FrameLayout
{
  private float A = 0.0F;
  private float B = 0.0F;
  private int C = 0;
  private int D = 0;
  private float E = 0.0F;
  private float F = 0.0F;
  private float G = 0.0F;
  private float H = 0.0F;
  private int I = 0;
  private float J = 0.0F;
  private a K = new a();
  private float L = 0.35F;
  private ap M = new ap(0.5F, 0.5F);
  private float N = 0.15F;
  private float O = 1.570796F;
  private d P;
  private ag Q;
  private FrameLayout R;
  private FrameLayout S;
  private TextView T;
  private TextView U;
  private TextView V;
  private TextView W;
  private final int[] a = { 0, -45747, -753630, -13056, -8269183, -9321002, -16747844, -10080879 };
  private TextView aa;
  private TextureView ab;
  private c ac;
  private aw ad;
  private FrameLayout ae;
  private ah af;
  private ai ag;
  private TextView ah;
  private TextView ai;
  private TextView aj;
  private FrameLayout ak;
  private TextView al;
  private TextView am;
  private LinearLayout an;
  private FrameLayout ao;
  private TextView[] ap = new TextView[4];
  private Bitmap aq;
  private int ar;
  private final int[] b = { 0, -1076602, -1388894, -859780, -5968466, -7742235, -13726776, -3303195 };
  private boolean c;
  private float d;
  private int e;
  private int f;
  private int g;
  private int h = -1;
  private int i = 0;
  private int j = 1;
  private int k = 2;
  private int l = 3;
  private int m = 4;
  private int n = 5;
  private int o = 6;
  private int p = 7;
  private int q = 8;
  private int r = 9;
  private int s = 10;
  private int t = 11;
  private int u = 12;
  private int v = 13;
  private float w = 0.0F;
  private float x = 0.0F;
  private float y = 0.0F;
  private float z = 0.0F;

  public aj(Context paramContext, Bitmap paramBitmap, int paramInt)
  {
    super(paramContext);
    this.aq = paramBitmap;
    this.ar = paramInt;
    this.ab = new TextureView(paramContext);
    addView(this.ab, v.b(-1, -1, 51));
    this.ab.setVisibility(4);
    this.ab.setSurfaceTextureListener(new TextureView.SurfaceTextureListener()
    {
      public void onSurfaceTextureAvailable(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
      {
        if ((aj.x(aj.this) == null) && (paramSurfaceTexture != null))
        {
          aj.a(aj.this, new aj.c(aj.this, paramSurfaceTexture, aj.y(aj.this)));
          aj.x(aj.this).a(paramInt1, paramInt2);
          aj.x(aj.this).a(true, true);
        }
      }

      public boolean onSurfaceTextureDestroyed(SurfaceTexture paramSurfaceTexture)
      {
        if (aj.x(aj.this) != null)
        {
          aj.x(aj.this).d();
          aj.a(aj.this, null);
        }
        return true;
      }

      public void onSurfaceTextureSizeChanged(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
      {
        if (aj.x(aj.this) != null)
        {
          aj.x(aj.this).a(paramInt1, paramInt2);
          aj.x(aj.this).a(false, true);
          aj.x(aj.this).b(new Runnable()
          {
            public void run()
            {
              if (aj.x(aj.this) != null)
                aj.x(aj.this).a(false, true);
            }
          });
        }
      }

      public void onSurfaceTextureUpdated(SurfaceTexture paramSurfaceTexture)
      {
      }
    });
    this.af = new ah(paramContext);
    this.af.setVisibility(4);
    addView(this.af, v.b(-1, -1, 51));
    this.af.setDelegate(new ah.b()
    {
      public void a(ap paramap, float paramFloat1, float paramFloat2, float paramFloat3)
      {
        aj.a(aj.this, paramFloat2);
        aj.a(aj.this, paramap);
        aj.b(aj.this, paramFloat1);
        aj.c(aj.this, paramFloat3);
        if (aj.x(aj.this) != null)
          aj.x(aj.this).a(false);
      }
    });
    this.ag = new ai(paramContext, this.K);
    this.ag.setDelegate(new ai.a()
    {
      public void a()
      {
        if (aj.x(aj.this) != null)
          aj.x(aj.this).a(false);
      }
    });
    this.ag.setVisibility(4);
    addView(this.ag, v.b(-1, -1, 51));
    this.R = new FrameLayout(paramContext);
    addView(this.R, v.b(-1, 126, 83));
    paramBitmap = new FrameLayout(paramContext);
    paramBitmap.setBackgroundColor(-16777216);
    this.R.addView(paramBitmap, v.b(-1, 48, 83));
    this.aa = new TextView(paramContext);
    this.aa.setTextSize(1, 14.0F);
    this.aa.setTextColor(-1);
    this.aa.setGravity(17);
    this.aa.setBackgroundDrawable(l.a(-12763843, false));
    this.aa.setPadding(a.a(20.0F), 0, a.a(20.0F), 0);
    this.aa.setText(r.a("Cancel", 2131230943).toUpperCase());
    this.aa.setTypeface(a.a("fonts/rmedium.ttf"));
    paramBitmap.addView(this.aa, v.b(-2, -1, 51));
    this.W = new TextView(paramContext);
    this.W.setTextSize(1, 14.0F);
    this.W.setTextColor(-11420173);
    this.W.setGravity(17);
    this.W.setBackgroundDrawable(l.a(-12763843, false));
    this.W.setPadding(a.a(20.0F), 0, a.a(20.0F), 0);
    this.W.setText(r.a("Done", 2131231147).toUpperCase());
    this.W.setTypeface(a.a("fonts/rmedium.ttf"));
    paramBitmap.addView(this.W, v.b(-2, -1, 53));
    this.ad = new aw(paramContext);
    paramBitmap = new LinearLayoutManager(paramContext);
    paramBitmap.b(0);
    this.ad.setLayoutManager(paramBitmap);
    this.ad.setClipToPadding(false);
    this.ad.setTag(Integer.valueOf(12));
    this.ad.setOverScrollMode(2);
    paramBitmap = this.ad;
    Object localObject = new d(paramContext);
    this.P = ((d)localObject);
    paramBitmap.setAdapter((RecyclerView.a)localObject);
    this.R.addView(this.ad, v.b(-1, 60, 51));
    this.ad.setOnItemClickListener(new aw.b()
    {
      public void a(View paramView, int paramInt)
      {
        aj.a(aj.this, paramInt);
        if (paramInt == aj.z(aj.this))
        {
          aj.d(aj.this, aj.A(aj.this));
          aj.B(aj.this).a(0, 100);
          aj.C(aj.this).setText(r.a("Enhance", 2131231178));
        }
        while (true)
        {
          aj.B(aj.this).a((int)aj.aa(aj.this), false);
          aj.ab(aj.this);
          aj.this.b();
          return;
          if (paramInt == aj.D(aj.this))
          {
            aj.d(aj.this, aj.E(aj.this));
            aj.B(aj.this).a(-100, 100);
            aj.C(aj.this).setText(r.a("Highlights", 2131231290));
            continue;
          }
          if (paramInt == aj.F(aj.this))
          {
            aj.d(aj.this, aj.G(aj.this));
            aj.B(aj.this).a(-100, 100);
            aj.C(aj.this).setText(r.a("Contrast", 2131231080));
            continue;
          }
          if (paramInt == aj.H(aj.this))
          {
            aj.d(aj.this, aj.I(aj.this));
            aj.B(aj.this).a(-100, 100);
            aj.C(aj.this).setText(r.a("Exposure", 2131231188));
            continue;
          }
          if (paramInt == aj.J(aj.this))
          {
            aj.d(aj.this, aj.K(aj.this));
            aj.B(aj.this).a(-100, 100);
            aj.C(aj.this).setText(r.a("Warmth", 2131231948));
            continue;
          }
          if (paramInt == aj.L(aj.this))
          {
            aj.d(aj.this, aj.M(aj.this));
            aj.B(aj.this).a(-100, 100);
            aj.C(aj.this).setText(r.a("Saturation", 2131231758));
            continue;
          }
          if (paramInt == aj.N(aj.this))
          {
            aj.d(aj.this, aj.O(aj.this));
            aj.B(aj.this).a(0, 100);
            aj.C(aj.this).setText(r.a("Vignette", 2131231946));
            continue;
          }
          if (paramInt == aj.P(aj.this))
          {
            aj.d(aj.this, aj.Q(aj.this));
            aj.B(aj.this).a(-100, 100);
            aj.C(aj.this).setText(r.a("Shadows", 2131231832));
            continue;
          }
          if (paramInt == aj.R(aj.this))
          {
            aj.d(aj.this, aj.S(aj.this));
            aj.B(aj.this).a(0, 100);
            aj.C(aj.this).setText(r.a("Grain", 2131231277));
            continue;
          }
          if (paramInt == aj.T(aj.this))
          {
            aj.d(aj.this, aj.U(aj.this));
            aj.B(aj.this).a(0, 100);
            aj.C(aj.this).setText(r.a("Fade", 2131231190));
            continue;
          }
          if (paramInt == aj.V(aj.this))
          {
            aj.d(aj.this, aj.W(aj.this));
            aj.B(aj.this).a(0, 100);
            aj.C(aj.this).setText(r.a("Sharpen", 2131231847));
            continue;
          }
          if (paramInt == aj.X(aj.this))
          {
            aj.b(aj.this, aj.r(aj.this));
            continue;
          }
          if (paramInt == aj.Y(aj.this))
          {
            aj.b(aj.this, aj.o(aj.this));
            aj.c(aj.this, aj.m(aj.this));
            continue;
          }
          if (paramInt != aj.Z(aj.this))
            continue;
          aj.q(aj.this).a.b();
          aj.q(aj.this).b.b();
          aj.q(aj.this).c.b();
          aj.q(aj.this).d.b();
        }
      }
    });
    this.S = new FrameLayout(paramContext);
    this.S.setVisibility(8);
    addView(this.S, v.b(-1, 126, 83));
    paramBitmap = new FrameLayout(paramContext);
    paramBitmap.setBackgroundColor(-15066598);
    this.S.addView(paramBitmap, v.b(-1, 48, 83));
    localObject = new ImageView(paramContext);
    ((ImageView)localObject).setImageResource(2130837750);
    ((ImageView)localObject).setBackgroundDrawable(l.a(-12763843, false));
    ((ImageView)localObject).setPadding(a.a(22.0F), 0, a.a(22.0F), 0);
    paramBitmap.addView((View)localObject, v.b(-2, -1, 51));
    ((ImageView)localObject).setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramView)
      {
        if (aj.ac(aj.this) == aj.z(aj.this))
        {
          aj.e(aj.this, aj.aa(aj.this));
          if (aj.x(aj.this) != null)
          {
            paramView = aj.x(aj.this);
            if (aj.ac(aj.this) == aj.X(aj.this))
              break label589;
          }
        }
        label589: for (boolean bool = true; ; bool = false)
        {
          paramView.a(bool);
          aj.this.b();
          return;
          if (aj.ac(aj.this) == aj.D(aj.this))
          {
            aj.f(aj.this, aj.aa(aj.this));
            break;
          }
          if (aj.ac(aj.this) == aj.F(aj.this))
          {
            aj.g(aj.this, aj.aa(aj.this));
            break;
          }
          if (aj.ac(aj.this) == aj.H(aj.this))
          {
            aj.h(aj.this, aj.aa(aj.this));
            break;
          }
          if (aj.ac(aj.this) == aj.J(aj.this))
          {
            aj.i(aj.this, aj.aa(aj.this));
            break;
          }
          if (aj.ac(aj.this) == aj.L(aj.this))
          {
            aj.j(aj.this, aj.aa(aj.this));
            break;
          }
          if (aj.ac(aj.this) == aj.N(aj.this))
          {
            aj.k(aj.this, aj.aa(aj.this));
            break;
          }
          if (aj.ac(aj.this) == aj.P(aj.this))
          {
            aj.l(aj.this, aj.aa(aj.this));
            break;
          }
          if (aj.ac(aj.this) == aj.R(aj.this))
          {
            aj.m(aj.this, aj.aa(aj.this));
            break;
          }
          if (aj.ac(aj.this) == aj.V(aj.this))
          {
            aj.n(aj.this, aj.aa(aj.this));
            break;
          }
          if (aj.ac(aj.this) == aj.T(aj.this))
          {
            aj.o(aj.this, aj.aa(aj.this));
            break;
          }
          if (aj.ac(aj.this) == aj.X(aj.this))
          {
            aj.d(aj.this, aj.ad(aj.this));
            break;
          }
          if (aj.ac(aj.this) == aj.Y(aj.this))
          {
            aj.e(aj.this, aj.ad(aj.this));
            aj.f(aj.this, aj.ae(aj.this));
            break;
          }
          if (aj.ac(aj.this) != aj.Z(aj.this))
            break;
          aj.q(aj.this).a.c();
          aj.q(aj.this).b.c();
          aj.q(aj.this).c.c();
          aj.q(aj.this).d.c();
          break;
        }
      }
    });
    localObject = new ImageView(paramContext);
    ((ImageView)localObject).setImageResource(2130837751);
    ((ImageView)localObject).setBackgroundDrawable(l.a(-12763843, false));
    ((ImageView)localObject).setPadding(a.a(22.0F), a.a(1.0F), a.a(22.0F), 0);
    paramBitmap.addView((View)localObject, v.b(-2, -1, 53));
    ((ImageView)localObject).setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramView)
      {
        aj.af(aj.this).c();
        aj.this.b();
      }
    });
    this.U = new TextView(paramContext);
    this.U.setTextSize(1, 20.0F);
    this.U.setTextColor(-1);
    paramBitmap.addView(this.U, v.a(-2, -2.0F, 1, 0.0F, 9.0F, 0.0F, 0.0F));
    this.T = new TextView(paramContext);
    this.T.setTextSize(1, 12.0F);
    this.T.setTextColor(-8355712);
    paramBitmap.addView(this.T, v.a(-2, -2.0F, 1, 0.0F, 26.0F, 0.0F, 0.0F));
    this.V = new TextView(paramContext);
    this.V.setTextSize(1, 20.0F);
    this.V.setTextColor(-1);
    paramBitmap.addView(this.V, v.a(-2, -2.0F, 1, 0.0F, 3.0F, 0.0F, 0.0F));
    this.Q = new ag(paramContext);
    this.Q.setDelegate(new ag.a()
    {
      public void a()
      {
        int i = aj.B(aj.this).getProgress();
        if (aj.ac(aj.this) == aj.z(aj.this))
          aj.e(aj.this, i);
        while (true)
        {
          aj.ab(aj.this);
          if (aj.x(aj.this) != null)
            aj.x(aj.this).a(true);
          return;
          if (aj.ac(aj.this) == aj.D(aj.this))
          {
            aj.f(aj.this, i);
            continue;
          }
          if (aj.ac(aj.this) == aj.F(aj.this))
          {
            aj.g(aj.this, i);
            continue;
          }
          if (aj.ac(aj.this) == aj.H(aj.this))
          {
            aj.h(aj.this, i);
            continue;
          }
          if (aj.ac(aj.this) == aj.J(aj.this))
          {
            aj.i(aj.this, i);
            continue;
          }
          if (aj.ac(aj.this) == aj.L(aj.this))
          {
            aj.j(aj.this, i);
            continue;
          }
          if (aj.ac(aj.this) == aj.N(aj.this))
          {
            aj.k(aj.this, i);
            continue;
          }
          if (aj.ac(aj.this) == aj.P(aj.this))
          {
            aj.l(aj.this, i);
            continue;
          }
          if (aj.ac(aj.this) == aj.R(aj.this))
          {
            aj.m(aj.this, i);
            continue;
          }
          if (aj.ac(aj.this) == aj.V(aj.this))
          {
            aj.n(aj.this, i);
            continue;
          }
          if (aj.ac(aj.this) != aj.T(aj.this))
            continue;
          aj.o(aj.this, i);
        }
      }
    });
    paramBitmap = this.S;
    localObject = this.Q;
    int i1;
    label1351: label1519: float f1;
    if (a.c())
    {
      paramInt = 498;
      if (!a.c())
        break label1596;
      i1 = 49;
      paramBitmap.addView((View)localObject, v.a(paramInt, 60.0F, i1, 14.0F, 10.0F, 14.0F, 0.0F));
      this.ao = new FrameLayout(paramContext);
      this.S.addView(this.ao, v.b(-1, 78, 1));
      paramBitmap = new LinearLayout(paramContext);
      paramBitmap.setOrientation(0);
      this.ao.addView(paramBitmap, v.b(-2, 28, 1));
      paramInt = 0;
      label1438: if (paramInt >= 4)
        break label1698;
      this.ap[paramInt] = new TextView(paramContext);
      this.ap[paramInt].setTextSize(1, 14.0F);
      this.ap[paramInt].setGravity(16);
      this.ap[paramInt].setTag(Integer.valueOf(paramInt));
      if (paramInt != 0)
        break label1603;
      this.ap[paramInt].setText(r.a("CurvesAll", 2131231097).toUpperCase());
      this.ap[paramInt].setTypeface(a.a("fonts/rmedium.ttf"));
      localObject = this.ap[paramInt];
      if (paramInt != 0)
        break label1690;
      f1 = 0.0F;
    }
    while (true)
    {
      paramBitmap.addView((View)localObject, v.a(-2, 28, f1, 0.0F, 0.0F, 0.0F));
      this.ap[paramInt].setOnClickListener(new View.OnClickListener()
      {
        public void onClick(View paramView)
        {
          int k = ((Integer)paramView.getTag()).intValue();
          int i = 0;
          if (i < 4)
          {
            paramView = aj.ag(aj.this)[i];
            if (i == k);
            for (int j = -1; ; j = -8355712)
            {
              paramView.setTextColor(j);
              i += 1;
              break;
            }
          }
          aj.q(aj.this).f = k;
          aj.ah(aj.this).invalidate();
        }
      });
      paramInt += 1;
      break label1438;
      paramInt = -1;
      break;
      label1596: i1 = 51;
      break label1351;
      label1603: if (paramInt == 1)
      {
        this.ap[paramInt].setText(r.a("CurvesRed", 2131231100).toUpperCase());
        break label1519;
      }
      if (paramInt == 2)
      {
        this.ap[paramInt].setText(r.a("CurvesGreen", 2131231099).toUpperCase());
        break label1519;
      }
      if (paramInt != 3)
        break label1519;
      this.ap[paramInt].setText(r.a("CurvesBlue", 2131231098).toUpperCase());
      break label1519;
      label1690: f1 = 30.0F;
    }
    label1698: this.ak = new FrameLayout(paramContext);
    this.S.addView(this.ak, v.b(-1, 78, 1));
    paramBitmap = new LinearLayout(paramContext);
    paramBitmap.setOrientation(0);
    this.ak.addView(paramBitmap, v.b(-2, 28, 1));
    this.al = new TextView(paramContext);
    this.al.setTextSize(1, 14.0F);
    this.al.setGravity(16);
    this.al.setText(r.a("TintShadows", 2131231902).toUpperCase());
    this.al.setTypeface(a.a("fonts/rmedium.ttf"));
    paramBitmap.addView(this.al, v.b(-2, 28));
    this.al.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramView)
      {
        aj.g(aj.this, 0);
        aj.a(aj.this, true);
      }
    });
    this.am = new TextView(paramContext);
    this.am.setTextSize(1, 14.0F);
    this.am.setGravity(16);
    this.am.setText(r.a("TintHighlights", 2131231901).toUpperCase());
    this.am.setTypeface(a.a("fonts/rmedium.ttf"));
    paramBitmap.addView(this.am, v.a(-2, 28, 100.0F, 0.0F, 0.0F, 0.0F));
    this.am.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramView)
      {
        aj.g(aj.this, 1);
        aj.a(aj.this, true);
      }
    });
    this.an = new LinearLayout(paramContext);
    this.an.setOrientation(0);
    this.an.setPadding(a.a(10.0F), 0, a.a(10.0F), 0);
    this.ak.addView(this.an, v.a(-1, 50.0F, 51, 0.0F, 24.0F, 0.0F, 0.0F));
    paramInt = 0;
    while (paramInt < this.a.length)
    {
      paramBitmap = new at(paramContext);
      paramBitmap.setSize(a.a(20.0F));
      paramBitmap.setTag(Integer.valueOf(paramInt));
      this.an.addView(paramBitmap, v.a(0, -1, 1.0F / this.a.length));
      paramBitmap.setOnClickListener(new View.OnClickListener()
      {
        public void onClick(View paramView)
        {
          paramView = (at)paramView;
          if (aj.ai(aj.this) == 0)
            aj.e(aj.this, aj.aj(aj.this)[((Integer)paramView.getTag()).intValue()]);
          while (true)
          {
            aj.a(aj.this, true);
            if (aj.x(aj.this) != null)
              aj.x(aj.this).a(false);
            return;
            aj.f(aj.this, aj.ak(aj.this)[((Integer)paramView.getTag()).intValue()]);
          }
        }
      });
      paramInt += 1;
    }
    this.ae = new FrameLayout(paramContext);
    this.S.addView(this.ae, v.a(280, 60.0F, 1, 0.0F, 10.0F, 0.0F, 0.0F));
    this.ah = new TextView(paramContext);
    this.ah.setCompoundDrawablesWithIntrinsicBounds(0, 2130837640, 0, 0);
    this.ah.setCompoundDrawablePadding(a.a(2.0F));
    this.ah.setTextSize(1, 13.0F);
    this.ah.setTextColor(-11420173);
    this.ah.setGravity(1);
    this.ah.setText(r.a("BlurOff", 2131230920));
    this.ae.addView(this.ah, v.a(80, 60.0F));
    this.ah.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramView)
      {
        aj.d(aj.this, 0);
        aj.al(aj.this);
        aj.am(aj.this).setVisibility(4);
        if (aj.x(aj.this) != null)
          aj.x(aj.this).a(false);
      }
    });
    this.ai = new TextView(paramContext);
    this.ai.setCompoundDrawablesWithIntrinsicBounds(0, 2130837641, 0, 0);
    this.ai.setCompoundDrawablePadding(a.a(2.0F));
    this.ai.setTextSize(1, 13.0F);
    this.ai.setTextColor(-1);
    this.ai.setGravity(1);
    this.ai.setText(r.a("BlurRadial", 2131230921));
    this.ae.addView(this.ai, v.a(80, 80.0F, 51, 100.0F, 0.0F, 0.0F, 0.0F));
    this.ai.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramView)
      {
        aj.d(aj.this, 1);
        aj.al(aj.this);
        aj.am(aj.this).setVisibility(0);
        aj.am(aj.this).setType(1);
        if (aj.x(aj.this) != null)
          aj.x(aj.this).a(false);
      }
    });
    this.aj = new TextView(paramContext);
    this.aj.setCompoundDrawablesWithIntrinsicBounds(0, 2130837637, 0, 0);
    this.aj.setCompoundDrawablePadding(a.a(2.0F));
    this.aj.setTextSize(1, 13.0F);
    this.aj.setTextColor(-1);
    this.aj.setGravity(1);
    this.aj.setText(r.a("BlurLinear", 2131230919));
    this.ae.addView(this.aj, v.a(80, 80.0F, 51, 200.0F, 0.0F, 0.0F, 0.0F));
    this.aj.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramView)
      {
        aj.d(aj.this, 2);
        aj.al(aj.this);
        aj.am(aj.this).setVisibility(0);
        aj.am(aj.this).setType(0);
        if (aj.x(aj.this) != null)
          aj.x(aj.this).a(false);
      }
    });
    if (Build.VERSION.SDK_INT >= 21)
    {
      ((FrameLayout.LayoutParams)this.ab.getLayoutParams()).topMargin = a.a;
      ((FrameLayout.LayoutParams)this.ag.getLayoutParams()).topMargin = a.a;
    }
  }

  private void a(int paramInt1, int paramInt2)
  {
    if (this.aq == null)
      return;
    paramInt1 -= a.a(28.0F);
    paramInt2 -= a.a(154.0F) + a.a;
    float f2;
    float f1;
    label76: float f3;
    if ((this.ar % 360 == 90) || (this.ar % 360 == 270))
    {
      f2 = this.aq.getHeight();
      f1 = this.aq.getWidth();
      f3 = paramInt1 / f2;
      float f4 = paramInt2 / f1;
      if (f3 <= f4)
        break label365;
      f1 = paramInt2;
      f3 = (int)Math.ceil(f2 * f4);
      f2 = f1;
    }
    FrameLayout.LayoutParams localLayoutParams;
    while (true)
    {
      int i1 = (int)Math.ceil((paramInt1 - f3) / 2.0F + a.a(14.0F));
      int i2 = (int)Math.ceil((paramInt2 - f2) / 2.0F + a.a(14.0F) + a.a);
      localLayoutParams = (FrameLayout.LayoutParams)this.ab.getLayoutParams();
      localLayoutParams.leftMargin = i1;
      localLayoutParams.topMargin = i2;
      localLayoutParams.width = (int)f3;
      localLayoutParams.height = (int)f2;
      this.ag.a(i1, i2, localLayoutParams.width, localLayoutParams.height);
      this.af.a(localLayoutParams.width, localLayoutParams.height);
      ((FrameLayout.LayoutParams)this.af.getLayoutParams()).height = (a.a(28.0F) + paramInt2);
      ((FrameLayout.LayoutParams)this.ag.getLayoutParams()).height = (a.a(28.0F) + paramInt2);
      if (!a.c())
        break;
      paramInt2 = a.a(86.0F) * 10;
      localLayoutParams = (FrameLayout.LayoutParams)this.ad.getLayoutParams();
      if (paramInt2 >= paramInt1)
        break label394;
      localLayoutParams.width = paramInt2;
      localLayoutParams.leftMargin = ((paramInt1 - paramInt2) / 2);
      return;
      f2 = this.aq.getWidth();
      f1 = this.aq.getHeight();
      break label76;
      label365: f2 = paramInt1;
      f3 = (int)Math.ceil(f1 * f3);
      f1 = f2;
      f2 = f3;
      f3 = f1;
    }
    label394: localLayoutParams.width = -1;
    localLayoutParams.leftMargin = 0;
  }

  private void a(boolean paramBoolean)
  {
    int i2 = -8355712;
    Object localObject = this.am;
    int i1;
    label42: int i3;
    label60: int i5;
    label118: boolean bool;
    if (this.g == 1)
    {
      i1 = -1;
      ((TextView)localObject).setTextColor(i1);
      localObject = this.al;
      if (this.g != 1)
        break label186;
      i1 = i2;
      ((TextView)localObject).setTextColor(i1);
      int i4 = this.an.getChildCount();
      i3 = 0;
      if (i3 >= i4)
        return;
      localObject = this.an.getChildAt(i3);
      if ((localObject instanceof at))
      {
        localObject = (at)localObject;
        i5 = ((Integer)((at)localObject).getTag()).intValue();
        if (this.g != 0)
          break label191;
        i1 = this.C;
        if (this.g != 0)
          break label199;
        i2 = this.a[i5];
        label133: if (i1 != i2)
          break label210;
        bool = true;
        label141: ((at)localObject).a(bool, paramBoolean);
        if (i5 != 0)
          break label216;
        i1 = -1;
        label156: if (i5 != 0)
          break label245;
        i2 = -1;
      }
    }
    while (true)
    {
      ((at)localObject).a(i1, i2);
      i3 += 1;
      break label60;
      i1 = -8355712;
      break;
      label186: i1 = -1;
      break label42;
      label191: i1 = this.D;
      break label118;
      label199: i2 = this.b[i5];
      break label133;
      label210: bool = false;
      break label141;
      label216: if (this.g == 0)
      {
        i1 = this.a[i5];
        break label156;
      }
      i1 = this.b[i5];
      break label156;
      label245: if (this.g == 0)
      {
        i2 = this.a[i5];
        continue;
      }
      i2 = this.b[i5];
    }
  }

  private void e()
  {
    if (this.I == 0)
    {
      this.ah.setCompoundDrawablesWithIntrinsicBounds(0, 2130837640, 0, 0);
      this.ah.setTextColor(-11420173);
      this.ai.setCompoundDrawablesWithIntrinsicBounds(0, 2130837641, 0, 0);
      this.ai.setTextColor(-1);
      this.aj.setCompoundDrawablesWithIntrinsicBounds(0, 2130837637, 0, 0);
      this.aj.setTextColor(-1);
    }
    do
    {
      return;
      if (this.I != 1)
        continue;
      this.ah.setCompoundDrawablesWithIntrinsicBounds(0, 2130837639, 0, 0);
      this.ah.setTextColor(-1);
      this.ai.setCompoundDrawablesWithIntrinsicBounds(0, 2130837642, 0, 0);
      this.ai.setTextColor(-11420173);
      this.aj.setCompoundDrawablesWithIntrinsicBounds(0, 2130837637, 0, 0);
      this.aj.setTextColor(-1);
      return;
    }
    while (this.I != 2);
    this.ah.setCompoundDrawablesWithIntrinsicBounds(0, 2130837639, 0, 0);
    this.ah.setTextColor(-1);
    this.ai.setCompoundDrawablesWithIntrinsicBounds(0, 2130837641, 0, 0);
    this.ai.setTextColor(-1);
    this.aj.setCompoundDrawablesWithIntrinsicBounds(0, 2130837638, 0, 0);
    this.aj.setTextColor(-11420173);
  }

  private void f()
  {
    int i1 = 0;
    if (this.h == this.i)
      i1 = (int)this.w;
    while (i1 > 0)
    {
      this.V.setText("+" + i1);
      return;
      if (this.h == this.p)
      {
        i1 = (int)this.E;
        continue;
      }
      if (this.h == this.k)
      {
        i1 = (int)this.y;
        continue;
      }
      if (this.h == this.j)
      {
        i1 = (int)this.x;
        continue;
      }
      if (this.h == this.l)
      {
        i1 = (int)this.z;
        continue;
      }
      if (this.h == this.m)
      {
        i1 = (int)this.A;
        continue;
      }
      if (this.h == this.r)
      {
        i1 = (int)this.G;
        continue;
      }
      if (this.h == this.q)
      {
        i1 = (int)this.F;
        continue;
      }
      if (this.h == this.s)
      {
        i1 = (int)this.H;
        continue;
      }
      if (this.h == this.u)
      {
        i1 = (int)this.J;
        continue;
      }
      if (this.h != this.o)
        continue;
      i1 = (int)this.B;
    }
    this.V.setText("" + i1);
  }

  private void g()
  {
    if (this.w == 0.0F)
    {
      AnimatorSet localAnimatorSet = new AnimatorSet();
      localAnimatorSet.setDuration(200L);
      localAnimatorSet.playTogether(new Animator[] { ObjectAnimator.ofInt(this.Q, "progress", new int[] { 50 }) });
      localAnimatorSet.start();
    }
  }

  private float getContrastValue()
  {
    return this.y / 100.0F * 0.3F + 1.0F;
  }

  private float getEnhanceValue()
  {
    return this.w / 100.0F;
  }

  private float getExposureValue()
  {
    return this.x / 100.0F;
  }

  private float getFadeValue()
  {
    return this.B / 100.0F;
  }

  private float getGrainValue()
  {
    return this.H / 100.0F * 0.04F;
  }

  private float getHighlightsValue()
  {
    return (this.E * 0.75F + 100.0F) / 100.0F;
  }

  private float getSaturationValue()
  {
    float f2 = this.A / 100.0F;
    float f1 = f2;
    if (f2 > 0.0F)
      f1 = f2 * 1.05F;
    return f1 + 1.0F;
  }

  private float getShadowsValue()
  {
    return (this.F * 0.55F + 100.0F) / 100.0F;
  }

  private float getSharpenValue()
  {
    return 0.11F + this.J / 100.0F * 0.6F;
  }

  private float getTintHighlightsIntensityValue()
  {
    if (this.D == 0)
      return 0.0F;
    return 50.0F / 100.0F;
  }

  private float getTintShadowsIntensityValue()
  {
    if (this.C == 0)
      return 0.0F;
    return 50.0F / 100.0F;
  }

  private float getVignetteValue()
  {
    return this.G / 100.0F;
  }

  private float getWarmthValue()
  {
    return this.z / 100.0F;
  }

  private void setShowOriginal(boolean paramBoolean)
  {
    if (this.c == paramBoolean);
    do
    {
      return;
      this.c = paramBoolean;
    }
    while (this.ac == null);
    this.ac.a(false);
  }

  public void a(MotionEvent paramMotionEvent)
  {
    if ((paramMotionEvent.getActionMasked() == 0) || (paramMotionEvent.getActionMasked() == 5))
    {
      FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)this.ab.getLayoutParams();
      if ((localLayoutParams != null) && (paramMotionEvent.getX() >= localLayoutParams.leftMargin) && (paramMotionEvent.getY() >= localLayoutParams.topMargin) && (paramMotionEvent.getX() <= localLayoutParams.leftMargin + localLayoutParams.width))
      {
        float f1 = paramMotionEvent.getY();
        int i1 = localLayoutParams.topMargin;
        if (f1 <= localLayoutParams.height + i1)
          setShowOriginal(true);
      }
    }
    do
      return;
    while ((paramMotionEvent.getActionMasked() != 1) && (paramMotionEvent.getActionMasked() != 6));
    setShowOriginal(false);
  }

  public boolean a()
  {
    return (this.w != 0.0F) || (this.y != 0.0F) || (this.E != 0.0F) || (this.x != 0.0F) || (this.z != 0.0F) || (this.A != 0.0F) || (this.G != 0.0F) || (this.F != 0.0F) || (this.H != 0.0F) || (this.J != 0.0F) || (this.B != 0.0F) || (this.D != 0) || (this.C != 0) || (!this.K.b());
  }

  public void b()
  {
    Object localObject1;
    Object localObject2;
    Object localObject3;
    int i1;
    if (this.S.getVisibility() == 8)
    {
      localObject1 = this.R;
      localObject2 = this.S;
      if ((this.h == this.t) || (this.h == this.n) || (this.h == this.v))
      {
        localObject3 = this.ae;
        if (this.h == this.t)
        {
          i1 = 0;
          ((FrameLayout)localObject3).setVisibility(i1);
          localObject3 = this.ak;
          if (this.h != this.n)
            break label301;
          i1 = 0;
          label100: ((FrameLayout)localObject3).setVisibility(i1);
          localObject3 = this.ao;
          if (this.h != this.v)
            break label306;
          i1 = 0;
          label125: ((FrameLayout)localObject3).setVisibility(i1);
          if (this.h != this.t)
            break label311;
          this.U.setText(r.a("Blur", 2131230918));
          if (this.I != 0)
            this.af.setVisibility(0);
          label173: this.U.setVisibility(0);
          this.Q.setVisibility(4);
          this.T.setVisibility(4);
          this.V.setVisibility(4);
          e();
          localObject3 = localObject2;
          localObject2 = localObject1;
          localObject1 = localObject3;
        }
      }
    }
    while (true)
    {
      localObject3 = new AnimatorSet();
      ((AnimatorSet)localObject3).playTogether(new Animator[] { ObjectAnimator.ofFloat(localObject2, "translationY", new float[] { 0.0F, a.a(126.0F) }) });
      ((AnimatorSet)localObject3).addListener(new b((View)localObject2, (View)localObject1)
      {
        public void onAnimationEnd(Animator paramAnimator)
        {
          this.a.setVisibility(8);
          this.b.setVisibility(0);
          this.b.setTranslationY(a.a(126.0F));
          paramAnimator = new AnimatorSet();
          paramAnimator.playTogether(new Animator[] { ObjectAnimator.ofFloat(this.b, "translationY", new float[] { 0.0F }) });
          paramAnimator.addListener(new b()
          {
            public void onAnimationEnd(Animator paramAnimator)
            {
              if (aj.ac(aj.this) == aj.z(aj.this))
                aj.an(aj.this);
            }
          });
          paramAnimator.setDuration(200L);
          paramAnimator.start();
        }
      });
      ((AnimatorSet)localObject3).setDuration(200L);
      ((AnimatorSet)localObject3).start();
      return;
      i1 = 4;
      break;
      label301: i1 = 4;
      break label100;
      label306: i1 = 4;
      break label125;
      label311: if (this.h == this.v)
      {
        this.U.setText(r.a("Curves", 2131231096));
        this.ag.setVisibility(0);
        this.K.f = 0;
        i1 = 0;
        label356: if (i1 < 4)
        {
          localObject3 = this.ap[i1];
          if (i1 != 0)
            break label388;
        }
        for (int i2 = -1; ; i2 = -8355712)
        {
          ((TextView)localObject3).setTextColor(i2);
          i1 += 1;
          break label356;
          break;
        }
      }
      label388: this.g = 0;
      a(false);
      this.U.setText(r.a("Tint", 2131231900));
      break label173;
      this.ak.setVisibility(4);
      this.ao.setVisibility(4);
      this.ae.setVisibility(4);
      this.Q.setVisibility(0);
      this.U.setVisibility(4);
      this.T.setVisibility(0);
      this.V.setVisibility(0);
      this.af.setVisibility(4);
      this.ag.setVisibility(4);
      localObject3 = localObject1;
      localObject1 = localObject2;
      localObject2 = localObject3;
      continue;
      this.h = -1;
      localObject2 = this.S;
      localObject1 = this.R;
      this.af.setVisibility(4);
      this.ag.setVisibility(4);
    }
  }

  public void c()
  {
    if (this.ac != null)
    {
      this.ac.d();
      this.ac = null;
    }
    this.ab.setVisibility(8);
  }

  public void d()
  {
    this.ab.setVisibility(0);
  }

  public Bitmap getBitmap()
  {
    if (this.ac != null)
      return this.ac.c();
    return null;
  }

  public TextView getCancelTextView()
  {
    return this.aa;
  }

  public TextView getDoneTextView()
  {
    return this.W;
  }

  public FrameLayout getEditView()
  {
    return this.S;
  }

  public FrameLayout getToolsView()
  {
    return this.R;
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    a(View.MeasureSpec.getSize(paramInt1), View.MeasureSpec.getSize(paramInt2));
    super.onMeasure(paramInt1, paramInt2);
  }

  public static class a
  {
    public aj.b a = new aj.b();
    public aj.b b = new aj.b();
    public aj.b c = new aj.b();
    public aj.b d = new aj.b();
    public ByteBuffer e = null;
    public int f;

    public a()
    {
      this.e.order(ByteOrder.LITTLE_ENDIAN);
    }

    public void a()
    {
      this.e.position(0);
      float[] arrayOfFloat1 = this.a.a();
      float[] arrayOfFloat2 = this.b.a();
      float[] arrayOfFloat3 = this.c.a();
      float[] arrayOfFloat4 = this.d.a();
      int i = 0;
      while (i < 200)
      {
        this.e.put((byte)(int)(arrayOfFloat2[i] * 255.0F));
        this.e.put((byte)(int)(arrayOfFloat3[i] * 255.0F));
        this.e.put((byte)(int)(arrayOfFloat4[i] * 255.0F));
        this.e.put((byte)(int)(arrayOfFloat1[i] * 255.0F));
        i += 1;
      }
      this.e.position(0);
    }

    public boolean b()
    {
      return (this.a.e()) && (this.b.e()) && (this.c.e()) && (this.d.e());
    }
  }

  public static class b
  {
    public float a = 0.0F;
    public float b = 25.0F;
    public float c = 50.0F;
    public float d = 75.0F;
    public float e = 100.0F;
    public float f = 0.0F;
    public float g = 25.0F;
    public float h = 50.0F;
    public float i = 75.0F;
    public float j = 100.0F;
    public float[] k;

    public float[] a()
    {
      if (this.k == null)
        d();
      return this.k;
    }

    public void b()
    {
      this.f = this.a;
      this.g = this.b;
      this.h = this.c;
      this.i = this.d;
      this.j = this.e;
    }

    public void c()
    {
      this.a = this.f;
      this.b = this.g;
      this.c = this.h;
      this.d = this.i;
      this.e = this.j;
      d();
    }

    public float[] d()
    {
      float[] arrayOfFloat = new float[14];
      arrayOfFloat[0] = -0.001F;
      arrayOfFloat[1] = (this.a / 100.0F);
      arrayOfFloat[2] = 0.0F;
      arrayOfFloat[3] = (this.a / 100.0F);
      arrayOfFloat[4] = 0.25F;
      arrayOfFloat[5] = (this.b / 100.0F);
      arrayOfFloat[6] = 0.5F;
      arrayOfFloat[7] = (this.c / 100.0F);
      arrayOfFloat[8] = 0.75F;
      arrayOfFloat[9] = (this.d / 100.0F);
      arrayOfFloat[10] = 1.0F;
      arrayOfFloat[11] = (this.e / 100.0F);
      arrayOfFloat[12] = 1.001F;
      arrayOfFloat[13] = (this.e / 100.0F);
      ArrayList localArrayList2 = new ArrayList(100);
      ArrayList localArrayList1 = new ArrayList(100);
      localArrayList1.add(Float.valueOf(arrayOfFloat[0]));
      localArrayList1.add(Float.valueOf(arrayOfFloat[1]));
      int m = 1;
      while (m < arrayOfFloat.length / 2 - 2)
      {
        float f1 = arrayOfFloat[((m - 1) * 2)];
        float f2 = arrayOfFloat[((m - 1) * 2 + 1)];
        float f3 = arrayOfFloat[(m * 2)];
        float f4 = arrayOfFloat[(m * 2 + 1)];
        float f5 = arrayOfFloat[((m + 1) * 2)];
        float f6 = arrayOfFloat[((m + 1) * 2 + 1)];
        float f7 = arrayOfFloat[((m + 2) * 2)];
        float f8 = arrayOfFloat[((m + 2) * 2 + 1)];
        int n = 1;
        while (n < 100)
        {
          float f10 = n * 0.01F;
          float f11 = f10 * f10;
          float f12 = f11 * f10;
          float f9 = 0.5F * (2.0F * f3 + (f5 - f1) * f10 + (2.0F * f1 - 5.0F * f3 + 4.0F * f5 - f7) * f11 + (3.0F * f3 - f1 - 3.0F * f5 + f7) * f12);
          f10 = Math.max(0.0F, Math.min(1.0F, (f10 * (f6 - f2) + 2.0F * f4 + f11 * (2.0F * f2 - 5.0F * f4 + 4.0F * f6 - f8) + (3.0F * f4 - f2 - 3.0F * f6 + f8) * f12) * 0.5F));
          if (f9 > f1)
          {
            localArrayList1.add(Float.valueOf(f9));
            localArrayList1.add(Float.valueOf(f10));
          }
          if ((n - 1) % 2 == 0)
            localArrayList2.add(Float.valueOf(f10));
          n += 1;
        }
        localArrayList1.add(Float.valueOf(f5));
        localArrayList1.add(Float.valueOf(f6));
        m += 1;
      }
      localArrayList1.add(Float.valueOf(arrayOfFloat[12]));
      localArrayList1.add(Float.valueOf(arrayOfFloat[13]));
      this.k = new float[localArrayList2.size()];
      m = 0;
      while (m < this.k.length)
      {
        this.k[m] = ((Float)localArrayList2.get(m)).floatValue();
        m += 1;
      }
      arrayOfFloat = new float[localArrayList1.size()];
      m = 0;
      while (m < arrayOfFloat.length)
      {
        arrayOfFloat[m] = ((Float)localArrayList1.get(m)).floatValue();
        m += 1;
      }
      return arrayOfFloat;
    }

    public boolean e()
    {
      return (Math.abs(this.a - 0.0F) < 1.E-005D) && (Math.abs(this.b - 25.0F) < 1.E-005D) && (Math.abs(this.c - 50.0F) < 1.E-005D) && (Math.abs(this.d - 75.0F) < 1.E-005D) && (Math.abs(this.e - 100.0F) < 1.E-005D);
    }
  }

  public class c extends h
  {
    private int A;
    private int B;
    private int C;
    private int D;
    private int E;
    private int F;
    private int G;
    private int H;
    private int I;
    private int J;
    private int K;
    private int L;
    private int M;
    private int N;
    private int O;
    private int P;
    private int Q;
    private int R;
    private int S;
    private int T;
    private int U;
    private int V;
    private int W;
    private int X;
    private int Y;
    private int Z;
    private int aA;
    private int aB;
    private int[] aC = new int[2];
    private int[] aD = new int[3];
    private int[] aE = new int[3];
    private int[] aF = new int[1];
    private boolean aG;
    private int aH;
    private int aI;
    private volatile int aJ;
    private volatile int aK;
    private FloatBuffer aL;
    private FloatBuffer aM;
    private FloatBuffer aN;
    private boolean aO;
    private long aP;
    private Runnable aQ = new Runnable()
    {
      public void run()
      {
        if (!aj.c.a(aj.c.this))
          return;
        if (((!aj.c.c(aj.c.this).equals(aj.c.b(aj.c.this).eglGetCurrentContext())) || (!aj.c.d(aj.c.this).equals(aj.c.b(aj.c.this).eglGetCurrentSurface(12377)))) && (!aj.c.b(aj.c.this).eglMakeCurrent(aj.c.e(aj.c.this), aj.c.d(aj.c.this), aj.c.d(aj.c.this), aj.c.c(aj.c.this))))
        {
          n.a("tmessages", "eglMakeCurrent failed " + GLUtils.getEGLErrorString(aj.c.b(aj.c.this).eglGetError()));
          return;
        }
        GLES20.glViewport(0, 0, aj.c.f(aj.c.this), aj.c.g(aj.c.this));
        aj.c.h(aj.c.this);
        aj.c.i(aj.c.this);
        aj.c.j(aj.c.this);
        aj.c.a(aj.c.this, aj.c.k(aj.c.this));
        GLES20.glViewport(0, 0, aj.c.l(aj.c.this), aj.c.m(aj.c.this));
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glClear(0);
        GLES20.glUseProgram(aj.c.n(aj.c.this));
        GLES20.glActiveTexture(33984);
        int[] arrayOfInt = aj.c.o(aj.c.this);
        if (aj.c.p(aj.c.this));
        for (int i = 0; ; i = 1)
        {
          GLES20.glBindTexture(3553, arrayOfInt[i]);
          GLES20.glUniform1i(aj.c.q(aj.c.this), 0);
          GLES20.glEnableVertexAttribArray(aj.c.r(aj.c.this));
          GLES20.glVertexAttribPointer(aj.c.r(aj.c.this), 2, 5126, false, 8, aj.c.s(aj.c.this));
          GLES20.glEnableVertexAttribArray(aj.c.t(aj.c.this));
          GLES20.glVertexAttribPointer(aj.c.t(aj.c.this), 2, 5126, false, 8, aj.c.u(aj.c.this));
          GLES20.glDrawArrays(5, 0, 4);
          aj.c.b(aj.c.this).eglSwapBuffers(aj.c.e(aj.c.this), aj.c.d(aj.c.this));
          return;
        }
      }
    };
    private int aa;
    private int ab;
    private int ac;
    private int ad;
    private int ae;
    private int af;
    private int ag;
    private int ah;
    private int ai;
    private int aj;
    private int ak;
    private int al;
    private int am;
    private int an;
    private int ao;
    private int ap;
    private int aq;
    private int ar;
    private int as;
    private int at;
    private int au;
    private int av;
    private int aw;
    private int ax;
    private int ay;
    private int az;
    private final int b = 12440;
    private final int c = 4;
    private SurfaceTexture d;
    private EGL10 e;
    private EGLDisplay f;
    private EGLConfig g;
    private EGLContext h;
    private EGLSurface i;
    private GL j;
    private boolean k;
    private boolean l = true;
    private Bitmap m;
    private int n;
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t;
    private int u;
    private int v;
    private int w;
    private int x;
    private int y;
    private int z;

    public c(SurfaceTexture paramBitmap, Bitmap arg3)
    {
      super();
      this.d = paramBitmap;
      Object localObject;
      this.m = localObject;
    }

    private int a(int paramInt, String paramString)
    {
      paramInt = GLES20.glCreateShader(paramInt);
      GLES20.glShaderSource(paramInt, paramString);
      GLES20.glCompileShader(paramInt);
      paramString = new int[1];
      GLES20.glGetShaderiv(paramInt, 35713, paramString, 0);
      if (paramString[0] == 0)
      {
        n.a("tmessages", GLES20.glGetShaderInfoLog(paramInt));
        GLES20.glDeleteShader(paramInt);
        return 0;
      }
      return paramInt;
    }

    private Bitmap a(Bitmap paramBitmap, int paramInt1, int paramInt2, float paramFloat)
    {
      Matrix localMatrix = new Matrix();
      localMatrix.setScale(paramFloat, paramFloat);
      localMatrix.postRotate(aj.w(aj.this));
      return Bitmap.createBitmap(paramBitmap, 0, 0, paramBitmap.getWidth(), paramBitmap.getHeight(), localMatrix, true);
    }

    private void a(Bitmap paramBitmap)
    {
      this.aH = paramBitmap.getWidth();
      this.aI = paramBitmap.getHeight();
      float f3 = a.f();
      float f1;
      float f2;
      if ((this.aH > f3) || (this.aI > f3) || (aj.w(aj.this) % 360 != 0))
      {
        f1 = 1.0F;
        if ((this.aH > f3) || (this.aI > f3))
        {
          f1 = f3 / paramBitmap.getWidth();
          f2 = f3 / paramBitmap.getHeight();
          if (f1 >= f2)
            break label453;
          this.aH = (int)f3;
          this.aI = (int)(paramBitmap.getHeight() * f1);
        }
      }
      while (true)
      {
        if ((aj.w(aj.this) % 360 == 90) || (aj.w(aj.this) % 360 == 270))
        {
          int i1 = this.aH;
          this.aH = this.aI;
          this.aI = i1;
        }
        this.m = a(paramBitmap, this.aH, this.aI, f1);
        GLES20.glGenFramebuffers(3, this.aE, 0);
        GLES20.glGenTextures(3, this.aD, 0);
        GLES20.glBindTexture(3553, this.aD[0]);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLES20.glTexImage2D(3553, 0, 6408, this.aH, this.aI, 0, 6408, 5121, null);
        GLES20.glBindTexture(3553, this.aD[1]);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLUtils.texImage2D(3553, 0, this.m, 0);
        GLES20.glBindTexture(3553, this.aD[2]);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLES20.glTexImage2D(3553, 0, 6408, this.aH, this.aI, 0, 6408, 5121, null);
        return;
        label453: this.aI = (int)f3;
        this.aH = (int)(paramBitmap.getWidth() * f2);
        f1 = f2;
      }
    }

    private boolean e()
    {
      int i3 = 1;
      this.e = ((EGL10)EGLContext.getEGL());
      this.f = this.e.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
      if (this.f == EGL10.EGL_NO_DISPLAY)
      {
        n.a("tmessages", "eglGetDisplay failed " + GLUtils.getEGLErrorString(this.e.eglGetError()));
        b();
        i3 = 0;
      }
      label1159: label1754: label2652: label2780: 
      while (true)
      {
        return i3;
        Object localObject1 = new int[2];
        if (!this.e.eglInitialize(this.f, localObject1))
        {
          n.a("tmessages", "eglInitialize failed " + GLUtils.getEGLErrorString(this.e.eglGetError()));
          b();
          return false;
        }
        localObject1 = new int[1];
        Object localObject2 = new EGLConfig[1];
        if (!this.e.eglChooseConfig(this.f, new int[] { 12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344 }, localObject2, 1, localObject1))
        {
          n.a("tmessages", "eglChooseConfig failed " + GLUtils.getEGLErrorString(this.e.eglGetError()));
          b();
          return false;
        }
        if (localObject1[0] > 0)
        {
          this.g = localObject2[0];
          this.h = this.e.eglCreateContext(this.f, this.g, EGL10.EGL_NO_CONTEXT, new int[] { 12440, 2, 12344 });
          if (this.h == null)
          {
            n.a("tmessages", "eglCreateContext failed " + GLUtils.getEGLErrorString(this.e.eglGetError()));
            b();
            return false;
          }
        }
        else
        {
          n.a("tmessages", "eglConfig not initialized");
          b();
          return false;
        }
        if ((this.d instanceof SurfaceTexture))
        {
          this.i = this.e.eglCreateWindowSurface(this.f, this.g, this.d, null);
          if ((this.i == null) || (this.i == EGL10.EGL_NO_SURFACE))
          {
            n.a("tmessages", "createWindowSurface failed " + GLUtils.getEGLErrorString(this.e.eglGetError()));
            b();
            return false;
          }
        }
        else
        {
          b();
          return false;
        }
        if (!this.e.eglMakeCurrent(this.f, this.i, this.i, this.h))
        {
          n.a("tmessages", "eglMakeCurrent failed " + GLUtils.getEGLErrorString(this.e.eglGetError()));
          b();
          return false;
        }
        this.j = this.h.getGL();
        localObject1 = new float[8];
        tmp625_623 = localObject1;
        tmp625_623[0] = -1.0F;
        tmp631_625 = tmp625_623;
        tmp631_625[1] = 1.0F;
        tmp635_631 = tmp631_625;
        tmp635_631[2] = 1.0F;
        tmp639_635 = tmp635_631;
        tmp639_635[3] = 1.0F;
        tmp643_639 = tmp639_635;
        tmp643_639[4] = -1.0F;
        tmp649_643 = tmp643_639;
        tmp649_643[5] = -1.0F;
        tmp655_649 = tmp649_643;
        tmp655_649[6] = 1.0F;
        tmp660_655 = tmp655_649;
        tmp660_655[7] = -1.0F;
        tmp660_655;
        localObject2 = ByteBuffer.allocateDirect(localObject1.length * 4);
        ((ByteBuffer)localObject2).order(ByteOrder.nativeOrder());
        this.aL = ((ByteBuffer)localObject2).asFloatBuffer();
        this.aL.put(localObject1);
        this.aL.position(0);
        localObject1 = new float[8];
        tmp723_721 = localObject1;
        tmp723_721[0] = -1.0F;
        tmp729_723 = tmp723_721;
        tmp729_723[1] = -1.0F;
        tmp735_729 = tmp729_723;
        tmp735_729[2] = 1.0F;
        tmp739_735 = tmp735_729;
        tmp739_735[3] = -1.0F;
        tmp745_739 = tmp739_735;
        tmp745_739[4] = -1.0F;
        tmp751_745 = tmp745_739;
        tmp751_745[5] = 1.0F;
        tmp755_751 = tmp751_745;
        tmp755_751[6] = 1.0F;
        tmp760_755 = tmp755_751;
        tmp760_755[7] = 1.0F;
        tmp760_755;
        localObject2 = ByteBuffer.allocateDirect(localObject1.length * 4);
        ((ByteBuffer)localObject2).order(ByteOrder.nativeOrder());
        this.aN = ((ByteBuffer)localObject2).asFloatBuffer();
        this.aN.put(localObject1);
        this.aN.position(0);
        localObject1 = new float[8];
        tmp821_819 = localObject1;
        tmp821_819[0] = 0.0F;
        tmp825_821 = tmp821_819;
        tmp825_821[1] = 0.0F;
        tmp829_825 = tmp825_821;
        tmp829_825[2] = 1.0F;
        tmp833_829 = tmp829_825;
        tmp833_829[3] = 0.0F;
        tmp837_833 = tmp833_829;
        tmp837_833[4] = 0.0F;
        tmp841_837 = tmp837_833;
        tmp841_837[5] = 1.0F;
        tmp845_841 = tmp841_837;
        tmp845_841[6] = 1.0F;
        tmp850_845 = tmp845_841;
        tmp850_845[7] = 1.0F;
        tmp850_845;
        localObject2 = ByteBuffer.allocateDirect(localObject1.length * 4);
        ((ByteBuffer)localObject2).order(ByteOrder.nativeOrder());
        this.aM = ((ByteBuffer)localObject2).asFloatBuffer();
        this.aM.put(localObject1);
        this.aM.position(0);
        GLES20.glGenTextures(1, this.aF, 0);
        GLES20.glGenTextures(2, this.aC, 0);
        int i1 = a(35633, "attribute vec4 position;attribute vec2 inputTexCoord;varying vec2 texCoord;void main() {gl_Position = position;texCoord = inputTexCoord;}");
        int i2 = a(35632, "varying highp vec2 texCoord;uniform sampler2D sourceImage;uniform highp float width;uniform highp float height;uniform sampler2D curvesImage;uniform lowp float skipTone;uniform lowp float shadows;const mediump vec3 hsLuminanceWeighting = vec3(0.3, 0.3, 0.3);uniform lowp float highlights;uniform lowp float contrast;uniform lowp float fadeAmount;const mediump vec3 satLuminanceWeighting = vec3(0.2126, 0.7152, 0.0722);uniform lowp float saturation;uniform lowp float shadowsTintIntensity;uniform lowp float highlightsTintIntensity;uniform lowp vec3 shadowsTintColor;uniform lowp vec3 highlightsTintColor;uniform lowp float exposure;uniform lowp float warmth;uniform lowp float grain;const lowp float permTexUnit = 1.0 / 256.0;const lowp float permTexUnitHalf = 0.5 / 256.0;const lowp float grainsize = 2.3;uniform lowp float vignette;highp float getLuma(highp vec3 rgbP) {return (0.299 * rgbP.r) + (0.587 * rgbP.g) + (0.114 * rgbP.b);}lowp vec3 rgbToHsv(lowp vec3 c) {highp vec4 K = vec4(0.0, -1.0 / 3.0, 2.0 / 3.0, -1.0);highp vec4 p = c.g < c.b ? vec4(c.bg, K.wz) : vec4(c.gb, K.xy);highp vec4 q = c.r < p.x ? vec4(p.xyw, c.r) : vec4(c.r, p.yzx);highp float d = q.x - min(q.w, q.y);highp float e = 1.0e-10;return vec3(abs(q.z + (q.w - q.y) / (6.0 * d + e)), d / (q.x + e), q.x);}lowp vec3 hsvToRgb(lowp vec3 c) {highp vec4 K = vec4(1.0, 2.0 / 3.0, 1.0 / 3.0, 3.0);highp vec3 p = abs(fract(c.xxx + K.xyz) * 6.0 - K.www);return c.z * mix(K.xxx, clamp(p - K.xxx, 0.0, 1.0), c.y);}highp vec3 rgbToHsl(highp vec3 color) {highp vec3 hsl;highp float fmin = min(min(color.r, color.g), color.b);highp float fmax = max(max(color.r, color.g), color.b);highp float delta = fmax - fmin;hsl.z = (fmax + fmin) / 2.0;if (delta == 0.0) {hsl.x = 0.0;hsl.y = 0.0;} else {if (hsl.z < 0.5) {hsl.y = delta / (fmax + fmin);} else {hsl.y = delta / (2.0 - fmax - fmin);}highp float deltaR = (((fmax - color.r) / 6.0) + (delta / 2.0)) / delta;highp float deltaG = (((fmax - color.g) / 6.0) + (delta / 2.0)) / delta;highp float deltaB = (((fmax - color.b) / 6.0) + (delta / 2.0)) / delta;if (color.r == fmax) {hsl.x = deltaB - deltaG;} else if (color.g == fmax) {hsl.x = (1.0 / 3.0) + deltaR - deltaB;} else if (color.b == fmax) {hsl.x = (2.0 / 3.0) + deltaG - deltaR;}if (hsl.x < 0.0) {hsl.x += 1.0;} else if (hsl.x > 1.0) {hsl.x -= 1.0;}}return hsl;}highp float hueToRgb(highp float f1, highp float f2, highp float hue) {if (hue < 0.0) {hue += 1.0;} else if (hue > 1.0) {hue -= 1.0;}highp float res;if ((6.0 * hue) < 1.0) {res = f1 + (f2 - f1) * 6.0 * hue;} else if ((2.0 * hue) < 1.0) {res = f2;} else if ((3.0 * hue) < 2.0) {res = f1 + (f2 - f1) * ((2.0 / 3.0) - hue) * 6.0;} else {res = f1;} return res;}highp vec3 hslToRgb(highp vec3 hsl) {if (hsl.y == 0.0) {return vec3(hsl.z);} else {highp float f2;if (hsl.z < 0.5) {f2 = hsl.z * (1.0 + hsl.y);} else {f2 = (hsl.z + hsl.y) - (hsl.y * hsl.z);}highp float f1 = 2.0 * hsl.z - f2;return vec3(hueToRgb(f1, f2, hsl.x + (1.0/3.0)), hueToRgb(f1, f2, hsl.x), hueToRgb(f1, f2, hsl.x - (1.0/3.0)));}}highp vec3 rgbToYuv(highp vec3 inP) {highp float luma = getLuma(inP);return vec3(luma, (1.0 / 1.772) * (inP.b - luma), (1.0 / 1.402) * (inP.r - luma));}lowp vec3 yuvToRgb(highp vec3 inP) {return vec3(1.402 * inP.b + inP.r, (inP.r - (0.299 * 1.402 / 0.587) * inP.b - (0.114 * 1.772 / 0.587) * inP.g), 1.772 * inP.g + inP.r);}lowp float easeInOutSigmoid(lowp float value, lowp float strength) {if (value > 0.5) {return 1.0 - pow(2.0 - 2.0 * value, 1.0 / (1.0 - strength)) * 0.5;} else {return pow(2.0 * value, 1.0 / (1.0 - strength)) * 0.5;}}lowp vec3 applyLuminanceCurve(lowp vec3 pixel) {highp float index = floor(clamp(pixel.z / (1.0 / 200.0), 0.0, 199.0));pixel.y = mix(0.0, pixel.y, smoothstep(0.0, 0.1, pixel.z) * (1.0 - smoothstep(0.8, 1.0, pixel.z)));pixel.z = texture2D(curvesImage, vec2(1.0 / 200.0 * index, 0)).a;return pixel;}lowp vec3 applyRGBCurve(lowp vec3 pixel) {highp float index = floor(clamp(pixel.r / (1.0 / 200.0), 0.0, 199.0));pixel.r = texture2D(curvesImage, vec2(1.0 / 200.0 * index, 0)).r;index = floor(clamp(pixel.g / (1.0 / 200.0), 0.0, 199.0));pixel.g = clamp(texture2D(curvesImage, vec2(1.0 / 200.0 * index, 0)).g, 0.0, 1.0);index = floor(clamp(pixel.b / (1.0 / 200.0), 0.0, 199.0));pixel.b = clamp(texture2D(curvesImage, vec2(1.0 / 200.0 * index, 0)).b, 0.0, 1.0);return pixel;}highp vec3 fadeAdjust(highp vec3 color, highp float fadeVal) {return (color * (1.0 - fadeVal)) + ((color + (vec3(-0.9772) * pow(vec3(color), vec3(3.0)) + vec3(1.708) * pow(vec3(color), vec3(2.0)) + vec3(-0.1603) * vec3(color) + vec3(0.2878) - color * vec3(0.9))) * fadeVal);}lowp vec3 tintRaiseShadowsCurve(lowp vec3 color) {return vec3(-0.003671) * pow(color, vec3(3.0)) + vec3(0.3842) * pow(color, vec3(2.0)) + vec3(0.3764) * color + vec3(0.2515);}lowp vec3 tintShadows(lowp vec3 texel, lowp vec3 tintColor, lowp float tintAmount) {return clamp(mix(texel, mix(texel, tintRaiseShadowsCurve(texel), tintColor), tintAmount), 0.0, 1.0);} lowp vec3 tintHighlights(lowp vec3 texel, lowp vec3 tintColor, lowp float tintAmount) {return clamp(mix(texel, mix(texel, vec3(1.0) - tintRaiseShadowsCurve(vec3(1.0) - texel), (vec3(1.0) - tintColor)), tintAmount), 0.0, 1.0);}highp vec4 rnm(in highp vec2 tc) {highp float noise = sin(dot(tc, vec2(12.9898, 78.233))) * 43758.5453;return vec4(fract(noise), fract(noise * 1.2154), fract(noise * 1.3453), fract(noise * 1.3647)) * 2.0 - 1.0;}highp float fade(in highp float t) {return t * t * t * (t * (t * 6.0 - 15.0) + 10.0);}highp float pnoise3D(in highp vec3 p) {highp vec3 pi = permTexUnit * floor(p) + permTexUnitHalf;highp vec3 pf = fract(p);highp float perm = rnm(pi.xy).a;highp float n000 = dot(rnm(vec2(perm, pi.z)).rgb * 4.0 - 1.0, pf);highp float n001 = dot(rnm(vec2(perm, pi.z + permTexUnit)).rgb * 4.0 - 1.0, pf - vec3(0.0, 0.0, 1.0));perm = rnm(pi.xy + vec2(0.0, permTexUnit)).a;highp float n010 = dot(rnm(vec2(perm, pi.z)).rgb * 4.0 - 1.0, pf - vec3(0.0, 1.0, 0.0));highp float n011 = dot(rnm(vec2(perm, pi.z + permTexUnit)).rgb * 4.0 - 1.0, pf - vec3(0.0, 1.0, 1.0));perm = rnm(pi.xy + vec2(permTexUnit, 0.0)).a;highp float n100 = dot(rnm(vec2(perm, pi.z)).rgb * 4.0 - 1.0, pf - vec3(1.0, 0.0, 0.0));highp float n101 = dot(rnm(vec2(perm, pi.z + permTexUnit)).rgb * 4.0 - 1.0, pf - vec3(1.0, 0.0, 1.0));perm = rnm(pi.xy + vec2(permTexUnit, permTexUnit)).a;highp float n110 = dot(rnm(vec2(perm, pi.z)).rgb * 4.0 - 1.0, pf - vec3(1.0, 1.0, 0.0));highp float n111 = dot(rnm(vec2(perm, pi.z + permTexUnit)).rgb * 4.0 - 1.0, pf - vec3(1.0, 1.0, 1.0));highp vec4 n_x = mix(vec4(n000, n001, n010, n011), vec4(n100, n101, n110, n111), fade(pf.x));highp vec2 n_xy = mix(n_x.xy, n_x.zw, fade(pf.y));return mix(n_xy.x, n_xy.y, fade(pf.z));}lowp vec2 coordRot(in lowp vec2 tc, in lowp float angle) {return vec2(((tc.x * 2.0 - 1.0) * cos(angle) - (tc.y * 2.0 - 1.0) * sin(angle)) * 0.5 + 0.5, ((tc.y * 2.0 - 1.0) * cos(angle) + (tc.x * 2.0 - 1.0) * sin(angle)) * 0.5 + 0.5);}void main() {lowp vec4 source = texture2D(sourceImage, texCoord);lowp vec4 result = source;const lowp float toolEpsilon = 0.005;if (skipTone < toolEpsilon) {result = vec4(applyRGBCurve(hslToRgb(applyLuminanceCurve(rgbToHsl(result.rgb)))), result.a);}mediump float hsLuminance = dot(result.rgb, hsLuminanceWeighting);mediump float shadow = clamp((pow(hsLuminance, 1.0 / shadows) + (-0.76) * pow(hsLuminance, 2.0 / shadows)) - hsLuminance, 0.0, 1.0);mediump float highlight = clamp((1.0 - (pow(1.0 - hsLuminance, 1.0 / (2.0 - highlights)) + (-0.8) * pow(1.0 - hsLuminance, 2.0 / (2.0 - highlights)))) - hsLuminance, -1.0, 0.0);lowp vec3 hsresult = vec3(0.0, 0.0, 0.0) + ((hsLuminance + shadow + highlight) - 0.0) * ((result.rgb - vec3(0.0, 0.0, 0.0)) / (hsLuminance - 0.0));mediump float contrastedLuminance = ((hsLuminance - 0.5) * 1.5) + 0.5;mediump float whiteInterp = contrastedLuminance * contrastedLuminance * contrastedLuminance;mediump float whiteTarget = clamp(highlights, 1.0, 2.0) - 1.0;hsresult = mix(hsresult, vec3(1.0), whiteInterp * whiteTarget);mediump float invContrastedLuminance = 1.0 - contrastedLuminance;mediump float blackInterp = invContrastedLuminance * invContrastedLuminance * invContrastedLuminance;mediump float blackTarget = 1.0 - clamp(shadows, 0.0, 1.0);hsresult = mix(hsresult, vec3(0.0), blackInterp * blackTarget);result = vec4(hsresult.rgb, result.a);result = vec4(clamp(((result.rgb - vec3(0.5)) * contrast + vec3(0.5)), 0.0, 1.0), result.a);if (abs(fadeAmount) > toolEpsilon) {result.rgb = fadeAdjust(result.rgb, fadeAmount);}lowp float satLuminance = dot(result.rgb, satLuminanceWeighting);lowp vec3 greyScaleColor = vec3(satLuminance);result = vec4(clamp(mix(greyScaleColor, result.rgb, saturation), 0.0, 1.0), result.a);if (abs(shadowsTintIntensity) > toolEpsilon) {result.rgb = tintShadows(result.rgb, shadowsTintColor, shadowsTintIntensity * 2.0);}if (abs(highlightsTintIntensity) > toolEpsilon) {result.rgb = tintHighlights(result.rgb, highlightsTintColor, highlightsTintIntensity * 2.0);}if (abs(exposure) > toolEpsilon) {mediump float mag = exposure * 1.045;mediump float exppower = 1.0 + abs(mag);if (mag < 0.0) {exppower = 1.0 / exppower;}result.r = 1.0 - pow((1.0 - result.r), exppower);result.g = 1.0 - pow((1.0 - result.g), exppower);result.b = 1.0 - pow((1.0 - result.b), exppower);}if (abs(warmth) > toolEpsilon) {highp vec3 yuvVec;if (warmth > 0.0 ) {yuvVec = vec3(0.1765, -0.1255, 0.0902);} else {yuvVec = -vec3(0.0588, 0.1569, -0.1255);}highp vec3 yuvColor = rgbToYuv(result.rgb);highp float luma = yuvColor.r;highp float curveScale = sin(luma * 3.14159);yuvColor += 0.375 * warmth * curveScale * yuvVec;result.rgb = yuvToRgb(yuvColor);}if (abs(grain) > toolEpsilon) {highp vec3 rotOffset = vec3(1.425, 3.892, 5.835);highp vec2 rotCoordsR = coordRot(texCoord, rotOffset.x);highp vec3 noise = vec3(pnoise3D(vec3(rotCoordsR * vec2(width / grainsize, height / grainsize),0.0)));lowp vec3 lumcoeff = vec3(0.299,0.587,0.114);lowp float luminance = dot(result.rgb, lumcoeff);lowp float lum = smoothstep(0.2, 0.0, luminance);lum += luminance;noise = mix(noise,vec3(0.0),pow(lum,4.0));result.rgb = result.rgb + noise * grain;}if (abs(vignette) > toolEpsilon) {const lowp float midpoint = 0.7;const lowp float fuzziness = 0.62;lowp float radDist = length(texCoord - 0.5) / sqrt(0.5);lowp float mag = easeInOutSigmoid(radDist * midpoint, fuzziness) * vignette * 0.645;result.rgb = mix(pow(result.rgb, vec3(1.0 / (1.0 - mag))), vec3(0.0), mag * mag);}gl_FragColor = result;}");
        if ((i1 != 0) && (i2 != 0))
        {
          this.x = GLES20.glCreateProgram();
          GLES20.glAttachShader(this.x, i1);
          GLES20.glAttachShader(this.x, i2);
          GLES20.glBindAttribLocation(this.x, 0, "position");
          GLES20.glBindAttribLocation(this.x, 1, "inputTexCoord");
          GLES20.glLinkProgram(this.x);
          localObject1 = new int[1];
          GLES20.glGetProgramiv(this.x, 35714, localObject1, 0);
          if (localObject1[0] == 0)
          {
            GLES20.glDeleteProgram(this.x);
            this.x = 0;
            i1 = a(35633, "attribute vec4 position;attribute vec2 inputTexCoord;varying vec2 texCoord;uniform highp float inputWidth;uniform highp float inputHeight;varying vec2 leftTexCoord;varying vec2 rightTexCoord;varying vec2 topTexCoord;varying vec2 bottomTexCoord;void main() {gl_Position = position;texCoord = inputTexCoord;highp vec2 widthStep = vec2(1.0 / inputWidth, 0.0);highp vec2 heightStep = vec2(0.0, 1.0 / inputHeight);leftTexCoord = inputTexCoord - widthStep;rightTexCoord = inputTexCoord + widthStep;topTexCoord = inputTexCoord + heightStep;bottomTexCoord = inputTexCoord - heightStep;}");
            i2 = a(35632, "precision highp float;varying vec2 texCoord;varying vec2 leftTexCoord;varying vec2 rightTexCoord;varying vec2 topTexCoord;varying vec2 bottomTexCoord;uniform sampler2D sourceImage;uniform float sharpen;void main() {vec4 result = texture2D(sourceImage, texCoord);vec3 leftTextureColor = texture2D(sourceImage, leftTexCoord).rgb;vec3 rightTextureColor = texture2D(sourceImage, rightTexCoord).rgb;vec3 topTextureColor = texture2D(sourceImage, topTexCoord).rgb;vec3 bottomTextureColor = texture2D(sourceImage, bottomTexCoord).rgb;result.rgb = result.rgb * (1.0 + 4.0 * sharpen) - (leftTextureColor + rightTextureColor + topTextureColor + bottomTextureColor) * sharpen;gl_FragColor = result;}");
            if ((i1 == 0) || (i2 == 0))
              break label2266;
            this.ar = GLES20.glCreateProgram();
            GLES20.glAttachShader(this.ar, i1);
            GLES20.glAttachShader(this.ar, i2);
            GLES20.glBindAttribLocation(this.ar, 0, "position");
            GLES20.glBindAttribLocation(this.ar, 1, "inputTexCoord");
            GLES20.glLinkProgram(this.ar);
            localObject1 = new int[1];
            GLES20.glGetProgramiv(this.ar, 35714, localObject1, 0);
            if (localObject1[0] != 0)
              break label2179;
            GLES20.glDeleteProgram(this.ar);
            this.ar = 0;
            i1 = a(35633, "attribute vec4 position;attribute vec4 inputTexCoord;uniform highp float texelWidthOffset;uniform highp float texelHeightOffset;varying vec2 blurCoordinates[9];void main() {gl_Position = position;vec2 singleStepOffset = vec2(texelWidthOffset, texelHeightOffset);blurCoordinates[0] = inputTexCoord.xy;blurCoordinates[1] = inputTexCoord.xy + singleStepOffset * 1.458430;blurCoordinates[2] = inputTexCoord.xy - singleStepOffset * 1.458430;blurCoordinates[3] = inputTexCoord.xy + singleStepOffset * 3.403985;blurCoordinates[4] = inputTexCoord.xy - singleStepOffset * 3.403985;blurCoordinates[5] = inputTexCoord.xy + singleStepOffset * 5.351806;blurCoordinates[6] = inputTexCoord.xy - singleStepOffset * 5.351806;blurCoordinates[7] = inputTexCoord.xy + singleStepOffset * 7.302940;blurCoordinates[8] = inputTexCoord.xy - singleStepOffset * 7.302940;}");
            i2 = a(35632, "uniform sampler2D sourceImage;varying highp vec2 blurCoordinates[9];void main() {lowp vec4 sum = vec4(0.0);sum += texture2D(sourceImage, blurCoordinates[0]) * 0.133571;sum += texture2D(sourceImage, blurCoordinates[1]) * 0.233308;sum += texture2D(sourceImage, blurCoordinates[2]) * 0.233308;sum += texture2D(sourceImage, blurCoordinates[3]) * 0.135928;sum += texture2D(sourceImage, blurCoordinates[4]) * 0.135928;sum += texture2D(sourceImage, blurCoordinates[5]) * 0.051383;sum += texture2D(sourceImage, blurCoordinates[6]) * 0.051383;sum += texture2D(sourceImage, blurCoordinates[7]) * 0.012595;sum += texture2D(sourceImage, blurCoordinates[8]) * 0.012595;gl_FragColor = sum;}");
            if ((i1 == 0) || (i2 == 0))
              break label2345;
            this.S = GLES20.glCreateProgram();
            GLES20.glAttachShader(this.S, i1);
            GLES20.glAttachShader(this.S, i2);
            GLES20.glBindAttribLocation(this.S, 0, "position");
            GLES20.glBindAttribLocation(this.S, 1, "inputTexCoord");
            GLES20.glLinkProgram(this.S);
            localObject1 = new int[1];
            GLES20.glGetProgramiv(this.S, 35714, localObject1, 0);
            if (localObject1[0] != 0)
              break label2272;
            GLES20.glDeleteProgram(this.S);
            this.S = 0;
            label1278: i1 = a(35633, "attribute vec4 position;attribute vec2 inputTexCoord;varying vec2 texCoord;void main() {gl_Position = position;texCoord = inputTexCoord;}");
            i2 = a(35632, "varying highp vec2 texCoord;uniform sampler2D sourceImage;uniform sampler2D inputImageTexture2;uniform lowp float excludeSize;uniform lowp vec2 excludePoint;uniform lowp float excludeBlurSize;uniform highp float angle;uniform highp float aspectRatio;void main() {lowp vec4 sharpImageColor = texture2D(sourceImage, texCoord);lowp vec4 blurredImageColor = texture2D(inputImageTexture2, texCoord);highp vec2 texCoordToUse = vec2(texCoord.x, (texCoord.y * aspectRatio + 0.5 - 0.5 * aspectRatio));highp float distanceFromCenter = abs((texCoordToUse.x - excludePoint.x) * aspectRatio * cos(angle) + (texCoordToUse.y - excludePoint.y) * sin(angle));gl_FragColor = mix(sharpImageColor, blurredImageColor, smoothstep(excludeSize - excludeBlurSize, excludeSize, distanceFromCenter));}");
            if ((i1 == 0) || (i2 == 0))
              break label2480;
            this.Y = GLES20.glCreateProgram();
            GLES20.glAttachShader(this.Y, i1);
            GLES20.glAttachShader(this.Y, i2);
            GLES20.glBindAttribLocation(this.Y, 0, "position");
            GLES20.glBindAttribLocation(this.Y, 1, "inputTexCoord");
            GLES20.glLinkProgram(this.Y);
            localObject1 = new int[1];
            GLES20.glGetProgramiv(this.Y, 35714, localObject1, 0);
            if (localObject1[0] != 0)
              break label2351;
            GLES20.glDeleteProgram(this.Y);
            this.Y = 0;
            label1397: i1 = a(35633, "attribute vec4 position;attribute vec2 inputTexCoord;varying vec2 texCoord;void main() {gl_Position = position;texCoord = inputTexCoord;}");
            i2 = a(35632, "varying highp vec2 texCoord;uniform sampler2D sourceImage;uniform sampler2D inputImageTexture2;uniform lowp float excludeSize;uniform lowp vec2 excludePoint;uniform lowp float excludeBlurSize;uniform highp float aspectRatio;void main() {lowp vec4 sharpImageColor = texture2D(sourceImage, texCoord);lowp vec4 blurredImageColor = texture2D(inputImageTexture2, texCoord);highp vec2 texCoordToUse = vec2(texCoord.x, (texCoord.y * aspectRatio + 0.5 - 0.5 * aspectRatio));highp float distanceFromCenter = distance(excludePoint, texCoordToUse);gl_FragColor = mix(sharpImageColor, blurredImageColor, smoothstep(excludeSize - excludeBlurSize, excludeSize, distanceFromCenter));}");
            if ((i1 == 0) || (i2 == 0))
              break label2601;
            this.ai = GLES20.glCreateProgram();
            GLES20.glAttachShader(this.ai, i1);
            GLES20.glAttachShader(this.ai, i2);
            GLES20.glBindAttribLocation(this.ai, 0, "position");
            GLES20.glBindAttribLocation(this.ai, 1, "inputTexCoord");
            GLES20.glLinkProgram(this.ai);
            localObject1 = new int[1];
            GLES20.glGetProgramiv(this.ai, 35714, localObject1, 0);
            if (localObject1[0] != 0)
              break label2486;
            GLES20.glDeleteProgram(this.ai);
            this.ai = 0;
            label1516: i1 = a(35633, "attribute vec4 position;attribute vec2 inputTexCoord;varying vec2 texCoord;void main() {gl_Position = position;texCoord = inputTexCoord;}");
            i2 = a(35632, "precision highp float;varying vec2 texCoord;uniform sampler2D sourceImage;vec3 rgb_to_hsv(vec3 c) {vec4 K = vec4(0.0, -1.0 / 3.0, 2.0 / 3.0, -1.0);vec4 p = c.g < c.b ? vec4(c.bg, K.wz) : vec4(c.gb, K.xy);vec4 q = c.r < p.x ? vec4(p.xyw, c.r) : vec4(c.r, p.yzx);float d = q.x - min(q.w, q.y);float e = 1.0e-10;return vec3(abs(q.z + (q.w - q.y) / (6.0 * d + e)), d / (q.x + e), q.x);}void main() {vec4 texel = texture2D(sourceImage, texCoord);gl_FragColor = vec4(rgb_to_hsv(texel.rgb), texel.a);}");
            if ((i1 == 0) || (i2 == 0))
              break label2652;
            this.n = GLES20.glCreateProgram();
            GLES20.glAttachShader(this.n, i1);
            GLES20.glAttachShader(this.n, i2);
            GLES20.glBindAttribLocation(this.n, 0, "position");
            GLES20.glBindAttribLocation(this.n, 1, "inputTexCoord");
            GLES20.glLinkProgram(this.n);
            localObject1 = new int[1];
            GLES20.glGetProgramiv(this.n, 35714, localObject1, 0);
            if (localObject1[0] != 0)
              break label2607;
            GLES20.glDeleteProgram(this.n);
            this.n = 0;
            label1635: i1 = a(35633, "attribute vec4 position;attribute vec2 inputTexCoord;varying vec2 texCoord;void main() {gl_Position = position;texCoord = inputTexCoord;}");
            i2 = a(35632, "precision highp float;varying vec2 texCoord;uniform sampler2D sourceImage;uniform sampler2D inputImageTexture2;uniform float intensity;float enhance(float value) {const vec2 offset = vec2(0.001953125, 0.03125);value = value + offset.x;vec2 coord = (clamp(texCoord, 0.125, 1.0 - 0.125001) - 0.125) * 4.0;vec2 frac = fract(coord);coord = floor(coord);float p00 = float(coord.y * 4.0 + coord.x) * 0.0625 + offset.y;float p01 = float(coord.y * 4.0 + coord.x + 1.0) * 0.0625 + offset.y;float p10 = float((coord.y + 1.0) * 4.0 + coord.x) * 0.0625 + offset.y;float p11 = float((coord.y + 1.0) * 4.0 + coord.x + 1.0) * 0.0625 + offset.y;vec3 c00 = texture2D(inputImageTexture2, vec2(value, p00)).rgb;vec3 c01 = texture2D(inputImageTexture2, vec2(value, p01)).rgb;vec3 c10 = texture2D(inputImageTexture2, vec2(value, p10)).rgb;vec3 c11 = texture2D(inputImageTexture2, vec2(value, p11)).rgb;float c1 = ((c00.r - c00.g) / (c00.b - c00.g));float c2 = ((c01.r - c01.g) / (c01.b - c01.g));float c3 = ((c10.r - c10.g) / (c10.b - c10.g));float c4 = ((c11.r - c11.g) / (c11.b - c11.g));float c1_2 = mix(c1, c2, frac.x);float c3_4 = mix(c3, c4, frac.x);return mix(c1_2, c3_4, frac.y);}vec3 hsv_to_rgb(vec3 c) {vec4 K = vec4(1.0, 2.0 / 3.0, 1.0 / 3.0, 3.0);vec3 p = abs(fract(c.xxx + K.xyz) * 6.0 - K.www);return c.z * mix(K.xxx, clamp(p - K.xxx, 0.0, 1.0), c.y);}void main() {vec4 texel = texture2D(sourceImage, texCoord);vec4 hsv = texel;hsv.y = min(1.0, hsv.y * 1.2);hsv.z = min(1.0, enhance(hsv.z) * 1.1);gl_FragColor = vec4(hsv_to_rgb(mix(texel.xyz, hsv.xyz, intensity)), texel.w);}");
            if ((i1 == 0) || (i2 == 0))
              break label2731;
            this.r = GLES20.glCreateProgram();
            GLES20.glAttachShader(this.r, i1);
            GLES20.glAttachShader(this.r, i2);
            GLES20.glBindAttribLocation(this.r, 0, "position");
            GLES20.glBindAttribLocation(this.r, 1, "inputTexCoord");
            GLES20.glLinkProgram(this.r);
            localObject1 = new int[1];
            GLES20.glGetProgramiv(this.r, 35714, localObject1, 0);
            if (localObject1[0] != 0)
              break label2658;
            GLES20.glDeleteProgram(this.r);
            this.r = 0;
            i1 = a(35633, "attribute vec4 position;attribute vec2 inputTexCoord;varying vec2 texCoord;void main() {gl_Position = position;texCoord = inputTexCoord;}");
            i2 = a(35632, "varying highp vec2 texCoord;uniform sampler2D sourceImage;void main() {gl_FragColor = texture2D(sourceImage, texCoord);}");
            if ((i1 == 0) || (i2 == 0))
              break;
            this.ay = GLES20.glCreateProgram();
            GLES20.glAttachShader(this.ay, i1);
            GLES20.glAttachShader(this.ay, i2);
            GLES20.glBindAttribLocation(this.ay, 0, "position");
            GLES20.glBindAttribLocation(this.ay, 1, "inputTexCoord");
            GLES20.glLinkProgram(this.ay);
            localObject1 = new int[1];
            GLES20.glGetProgramiv(this.ay, 35714, localObject1, 0);
            if (localObject1[0] != 0)
              break label2737;
            GLES20.glDeleteProgram(this.ay);
            this.ay = 0;
          }
        }
        while (true)
        {
          if (this.m == null)
            break label2780;
          a(this.m);
          return true;
          this.y = GLES20.glGetAttribLocation(this.x, "position");
          this.z = GLES20.glGetAttribLocation(this.x, "inputTexCoord");
          this.A = GLES20.glGetUniformLocation(this.x, "sourceImage");
          this.B = GLES20.glGetUniformLocation(this.x, "shadows");
          this.C = GLES20.glGetUniformLocation(this.x, "highlights");
          this.D = GLES20.glGetUniformLocation(this.x, "exposure");
          this.E = GLES20.glGetUniformLocation(this.x, "contrast");
          this.F = GLES20.glGetUniformLocation(this.x, "saturation");
          this.G = GLES20.glGetUniformLocation(this.x, "warmth");
          this.H = GLES20.glGetUniformLocation(this.x, "vignette");
          this.I = GLES20.glGetUniformLocation(this.x, "grain");
          this.J = GLES20.glGetUniformLocation(this.x, "width");
          this.K = GLES20.glGetUniformLocation(this.x, "height");
          this.L = GLES20.glGetUniformLocation(this.x, "curvesImage");
          this.M = GLES20.glGetUniformLocation(this.x, "skipTone");
          this.N = GLES20.glGetUniformLocation(this.x, "fadeAmount");
          this.O = GLES20.glGetUniformLocation(this.x, "shadowsTintIntensity");
          this.P = GLES20.glGetUniformLocation(this.x, "highlightsTintIntensity");
          this.Q = GLES20.glGetUniformLocation(this.x, "shadowsTintColor");
          this.R = GLES20.glGetUniformLocation(this.x, "highlightsTintColor");
          break;
          b();
          return false;
          this.av = GLES20.glGetAttribLocation(this.ar, "position");
          this.aw = GLES20.glGetAttribLocation(this.ar, "inputTexCoord");
          this.ax = GLES20.glGetUniformLocation(this.ar, "sourceImage");
          this.at = GLES20.glGetUniformLocation(this.ar, "inputWidth");
          this.au = GLES20.glGetUniformLocation(this.ar, "inputHeight");
          this.as = GLES20.glGetUniformLocation(this.ar, "sharpen");
          break label1159;
          b();
          return false;
          label2272: this.T = GLES20.glGetAttribLocation(this.S, "position");
          this.U = GLES20.glGetAttribLocation(this.S, "inputTexCoord");
          this.V = GLES20.glGetUniformLocation(this.S, "sourceImage");
          this.W = GLES20.glGetUniformLocation(this.S, "texelWidthOffset");
          this.X = GLES20.glGetUniformLocation(this.S, "texelHeightOffset");
          break label1278;
          b();
          return false;
          this.Z = GLES20.glGetAttribLocation(this.Y, "position");
          this.aa = GLES20.glGetAttribLocation(this.Y, "inputTexCoord");
          this.ab = GLES20.glGetUniformLocation(this.Y, "sourceImage");
          this.ac = GLES20.glGetUniformLocation(this.Y, "inputImageTexture2");
          this.ad = GLES20.glGetUniformLocation(this.Y, "excludeSize");
          this.ae = GLES20.glGetUniformLocation(this.Y, "excludePoint");
          this.af = GLES20.glGetUniformLocation(this.Y, "excludeBlurSize");
          this.ag = GLES20.glGetUniformLocation(this.Y, "angle");
          this.ah = GLES20.glGetUniformLocation(this.Y, "aspectRatio");
          break label1397;
          b();
          return false;
          this.aj = GLES20.glGetAttribLocation(this.ai, "position");
          this.ak = GLES20.glGetAttribLocation(this.ai, "inputTexCoord");
          this.al = GLES20.glGetUniformLocation(this.ai, "sourceImage");
          this.am = GLES20.glGetUniformLocation(this.ai, "inputImageTexture2");
          this.an = GLES20.glGetUniformLocation(this.ai, "excludeSize");
          this.ao = GLES20.glGetUniformLocation(this.ai, "excludePoint");
          this.ap = GLES20.glGetUniformLocation(this.ai, "excludeBlurSize");
          this.aq = GLES20.glGetUniformLocation(this.ai, "aspectRatio");
          break label1516;
          b();
          return false;
          this.o = GLES20.glGetAttribLocation(this.n, "position");
          this.p = GLES20.glGetAttribLocation(this.n, "inputTexCoord");
          this.q = GLES20.glGetUniformLocation(this.n, "sourceImage");
          break label1635;
          b();
          return false;
          label2658: this.s = GLES20.glGetAttribLocation(this.r, "position");
          this.t = GLES20.glGetAttribLocation(this.r, "inputTexCoord");
          this.u = GLES20.glGetUniformLocation(this.r, "sourceImage");
          this.v = GLES20.glGetUniformLocation(this.r, "intensity");
          this.w = GLES20.glGetUniformLocation(this.r, "inputImageTexture2");
          break label1754;
          b();
          return false;
          this.az = GLES20.glGetAttribLocation(this.ay, "position");
          this.aA = GLES20.glGetAttribLocation(this.ay, "inputTexCoord");
          this.aB = GLES20.glGetUniformLocation(this.ay, "sourceImage");
        }
      }
      label2179: label2266: b();
      label2345: label2351: label2480: label2486: return false;
    }

    private void f()
    {
      ByteBuffer localByteBuffer2;
      Object localObject;
      if (!this.aG)
      {
        GLES20.glBindFramebuffer(36160, this.aE[0]);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.aD[0], 0);
        GLES20.glClear(0);
        GLES20.glUseProgram(this.n);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.aD[1]);
        GLES20.glUniform1i(this.q, 0);
        GLES20.glEnableVertexAttribArray(this.p);
        GLES20.glVertexAttribPointer(this.p, 2, 5126, false, 8, this.aM);
        GLES20.glEnableVertexAttribArray(this.o);
        GLES20.glVertexAttribPointer(this.o, 2, 5126, false, 8, this.aL);
        GLES20.glDrawArrays(5, 0, 4);
        localByteBuffer2 = ByteBuffer.allocateDirect(this.aH * this.aI * 4);
        GLES20.glReadPixels(0, 0, this.aH, this.aI, 6408, 5121, localByteBuffer2);
        GLES20.glBindTexture(3553, this.aC[0]);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLES20.glTexImage2D(3553, 0, 6408, this.aH, this.aI, 0, 6408, 5121, localByteBuffer2);
        localObject = null;
      }
      try
      {
        ByteBuffer localByteBuffer1 = ByteBuffer.allocateDirect(16384);
        localObject = localByteBuffer1;
        Utilities.calcCDT(localByteBuffer2, this.aH, this.aI, localByteBuffer1);
        localObject = localByteBuffer1;
        GLES20.glBindTexture(3553, this.aC[1]);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLES20.glTexImage2D(3553, 0, 6408, 256, 16, 0, 6408, 5121, localObject);
        this.aG = true;
        GLES20.glBindFramebuffer(36160, this.aE[1]);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.aD[1], 0);
        GLES20.glClear(0);
        GLES20.glUseProgram(this.r);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.aC[0]);
        GLES20.glUniform1i(this.u, 0);
        GLES20.glActiveTexture(33985);
        GLES20.glBindTexture(3553, this.aC[1]);
        GLES20.glUniform1i(this.w, 1);
        if (aj.a(aj.this))
        {
          GLES20.glUniform1f(this.v, 0.0F);
          GLES20.glEnableVertexAttribArray(this.t);
          GLES20.glVertexAttribPointer(this.t, 2, 5126, false, 8, this.aM);
          GLES20.glEnableVertexAttribArray(this.s);
          GLES20.glVertexAttribPointer(this.s, 2, 5126, false, 8, this.aL);
          GLES20.glDrawArrays(5, 0, 4);
          return;
        }
      }
      catch (Exception localException)
      {
        while (true)
        {
          n.a("tmessages", localException);
          continue;
          GLES20.glUniform1f(this.v, aj.b(aj.this));
        }
      }
    }

    private void g()
    {
      GLES20.glBindFramebuffer(36160, this.aE[0]);
      GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.aD[0], 0);
      GLES20.glClear(0);
      GLES20.glUseProgram(this.ar);
      GLES20.glActiveTexture(33984);
      GLES20.glBindTexture(3553, this.aD[1]);
      GLES20.glUniform1i(this.ax, 0);
      if (aj.a(aj.this))
        GLES20.glUniform1f(this.as, 0.0F);
      while (true)
      {
        GLES20.glUniform1f(this.at, this.aH);
        GLES20.glUniform1f(this.au, this.aI);
        GLES20.glEnableVertexAttribArray(this.aw);
        GLES20.glVertexAttribPointer(this.aw, 2, 5126, false, 8, this.aM);
        GLES20.glEnableVertexAttribArray(this.av);
        GLES20.glVertexAttribPointer(this.av, 2, 5126, false, 8, this.aN);
        GLES20.glDrawArrays(5, 0, 4);
        return;
        GLES20.glUniform1f(this.as, aj.c(aj.this));
      }
    }

    private void h()
    {
      float f1 = 1.0F;
      GLES20.glBindFramebuffer(36160, this.aE[1]);
      GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.aD[1], 0);
      GLES20.glClear(0);
      GLES20.glUseProgram(this.x);
      GLES20.glActiveTexture(33984);
      GLES20.glBindTexture(3553, this.aD[0]);
      GLES20.glUniform1i(this.A, 0);
      if (aj.a(aj.this))
      {
        GLES20.glUniform1f(this.B, 1.0F);
        GLES20.glUniform1f(this.C, 1.0F);
        GLES20.glUniform1f(this.D, 0.0F);
        GLES20.glUniform1f(this.E, 1.0F);
        GLES20.glUniform1f(this.F, 1.0F);
        GLES20.glUniform1f(this.G, 0.0F);
        GLES20.glUniform1f(this.H, 0.0F);
        GLES20.glUniform1f(this.I, 0.0F);
        GLES20.glUniform1f(this.N, 0.0F);
        GLES20.glUniform3f(this.R, 0.0F, 0.0F, 0.0F);
        GLES20.glUniform1f(this.P, 0.0F);
        GLES20.glUniform3f(this.Q, 0.0F, 0.0F, 0.0F);
        GLES20.glUniform1f(this.O, 0.0F);
        GLES20.glUniform1f(this.M, 1.0F);
        GLES20.glUniform1f(this.J, this.aH);
        GLES20.glUniform1f(this.K, this.aI);
        GLES20.glEnableVertexAttribArray(this.z);
        GLES20.glVertexAttribPointer(this.z, 2, 5126, false, 8, this.aM);
        GLES20.glEnableVertexAttribArray(this.y);
        GLES20.glVertexAttribPointer(this.y, 2, 5126, false, 8, this.aN);
        GLES20.glDrawArrays(5, 0, 4);
        return;
      }
      GLES20.glUniform1f(this.B, aj.d(aj.this));
      GLES20.glUniform1f(this.C, aj.e(aj.this));
      GLES20.glUniform1f(this.D, aj.f(aj.this));
      GLES20.glUniform1f(this.E, aj.g(aj.this));
      GLES20.glUniform1f(this.F, aj.h(aj.this));
      GLES20.glUniform1f(this.G, aj.i(aj.this));
      GLES20.glUniform1f(this.H, aj.j(aj.this));
      GLES20.glUniform1f(this.I, aj.k(aj.this));
      GLES20.glUniform1f(this.N, aj.l(aj.this));
      GLES20.glUniform3f(this.R, (aj.m(aj.this) >> 16 & 0xFF) / 255.0F, (aj.m(aj.this) >> 8 & 0xFF) / 255.0F, (aj.m(aj.this) & 0xFF) / 255.0F);
      GLES20.glUniform1f(this.P, aj.n(aj.this));
      GLES20.glUniform3f(this.Q, (aj.o(aj.this) >> 16 & 0xFF) / 255.0F, (aj.o(aj.this) >> 8 & 0xFF) / 255.0F, (aj.o(aj.this) & 0xFF) / 255.0F);
      GLES20.glUniform1f(this.O, aj.p(aj.this));
      boolean bool = aj.q(aj.this).b();
      int i1 = this.M;
      if (bool);
      while (true)
      {
        GLES20.glUniform1f(i1, f1);
        if (bool)
          break;
        aj.q(aj.this).a();
        GLES20.glActiveTexture(33985);
        GLES20.glBindTexture(3553, this.aF[0]);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLES20.glTexImage2D(3553, 0, 6408, 200, 1, 0, 6408, 5121, aj.q(aj.this).e);
        GLES20.glUniform1i(this.L, 1);
        break;
        f1 = 0.0F;
      }
    }

    private boolean i()
    {
      if ((aj.a(aj.this)) || (aj.r(aj.this) == 0))
        return false;
      if (this.l)
      {
        GLES20.glUseProgram(this.S);
        GLES20.glUniform1i(this.V, 0);
        GLES20.glEnableVertexAttribArray(this.U);
        GLES20.glVertexAttribPointer(this.U, 2, 5126, false, 8, this.aM);
        GLES20.glEnableVertexAttribArray(this.T);
        GLES20.glVertexAttribPointer(this.T, 2, 5126, false, 8, this.aN);
        GLES20.glBindFramebuffer(36160, this.aE[0]);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.aD[0], 0);
        GLES20.glClear(0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.aD[1]);
        GLES20.glUniform1f(this.W, 0.0F);
        GLES20.glUniform1f(this.X, 1.0F / this.aI);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glBindFramebuffer(36160, this.aE[2]);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.aD[2], 0);
        GLES20.glClear(0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.aD[0]);
        GLES20.glUniform1f(this.W, 1.0F / this.aH);
        GLES20.glUniform1f(this.X, 0.0F);
        GLES20.glDrawArrays(5, 0, 4);
        this.l = false;
      }
      GLES20.glBindFramebuffer(36160, this.aE[0]);
      GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.aD[0], 0);
      GLES20.glClear(0);
      if (aj.r(aj.this) == 1)
      {
        GLES20.glUseProgram(this.ai);
        GLES20.glUniform1i(this.al, 0);
        GLES20.glUniform1i(this.am, 1);
        GLES20.glUniform1f(this.an, aj.s(aj.this));
        GLES20.glUniform1f(this.ap, aj.t(aj.this));
        GLES20.glUniform2f(this.ao, aj.u(aj.this).a, aj.u(aj.this).b);
        GLES20.glUniform1f(this.aq, this.aI / this.aH);
        GLES20.glEnableVertexAttribArray(this.ak);
        GLES20.glVertexAttribPointer(this.ak, 2, 5126, false, 8, this.aM);
        GLES20.glEnableVertexAttribArray(this.aj);
        GLES20.glVertexAttribPointer(this.aj, 2, 5126, false, 8, this.aN);
      }
      while (true)
      {
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.aD[1]);
        GLES20.glActiveTexture(33985);
        GLES20.glBindTexture(3553, this.aD[2]);
        GLES20.glDrawArrays(5, 0, 4);
        return true;
        if (aj.r(aj.this) != 2)
          continue;
        GLES20.glUseProgram(this.Y);
        GLES20.glUniform1i(this.ab, 0);
        GLES20.glUniform1i(this.ac, 1);
        GLES20.glUniform1f(this.ad, aj.s(aj.this));
        GLES20.glUniform1f(this.af, aj.t(aj.this));
        GLES20.glUniform1f(this.ag, aj.v(aj.this));
        GLES20.glUniform2f(this.ae, aj.u(aj.this).a, aj.u(aj.this).b);
        GLES20.glUniform1f(this.ah, this.aI / this.aH);
        GLES20.glEnableVertexAttribArray(this.aa);
        GLES20.glVertexAttribPointer(this.aa, 2, 5126, false, 8, this.aM);
        GLES20.glEnableVertexAttribArray(this.Z);
        GLES20.glVertexAttribPointer(this.Z, 2, 5126, false, 8, this.aN);
      }
    }

    private Bitmap j()
    {
      ByteBuffer localByteBuffer = ByteBuffer.allocateDirect(this.aH * this.aI * 4);
      GLES20.glReadPixels(0, 0, this.aH, this.aI, 6408, 5121, localByteBuffer);
      Bitmap localBitmap = Bitmap.createBitmap(this.aH, this.aI, Bitmap.Config.ARGB_8888);
      localBitmap.copyPixelsFromBuffer(localByteBuffer);
      return localBitmap;
    }

    public void a(int paramInt1, int paramInt2)
    {
      this.aJ = paramInt1;
      this.aK = paramInt2;
    }

    public void a(boolean paramBoolean)
    {
      a(paramBoolean, false);
    }

    public void a(boolean paramBoolean1, boolean paramBoolean2)
    {
      b(new Runnable(paramBoolean1, paramBoolean2)
      {
        public void run()
        {
          if (!aj.c.x(aj.c.this))
            aj.c.b(aj.c.this, this.a);
          long l = System.currentTimeMillis();
          if ((this.b) || (Math.abs(aj.c.y(aj.c.this) - l) > 30L))
          {
            aj.c.a(aj.c.this, l);
            aj.c.z(aj.c.this).run();
          }
        }
      });
    }

    public void b()
    {
      if (this.i != null)
      {
        this.e.eglMakeCurrent(this.f, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT);
        this.e.eglDestroySurface(this.f, this.i);
        this.i = null;
      }
      if (this.h != null)
      {
        this.e.eglDestroyContext(this.f, this.h);
        this.h = null;
      }
      if (this.f != null)
      {
        this.e.eglTerminate(this.f);
        this.f = null;
      }
    }

    public Bitmap c()
    {
      if (!this.k)
        return null;
      Semaphore localSemaphore = new Semaphore(0);
      Bitmap[] arrayOfBitmap = new Bitmap[1];
      try
      {
        b(new Runnable(arrayOfBitmap, localSemaphore)
        {
          public void run()
          {
            int i = 1;
            GLES20.glBindFramebuffer(36160, aj.c.v(aj.c.this)[1]);
            int[] arrayOfInt = aj.c.o(aj.c.this);
            if (aj.c.p(aj.c.this))
              i = 0;
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, arrayOfInt[i], 0);
            GLES20.glClear(0);
            this.a[0] = aj.c.w(aj.c.this);
            this.b.release();
            GLES20.glBindFramebuffer(36160, 0);
            GLES20.glClear(0);
          }
        });
        localSemaphore.acquire();
        return arrayOfBitmap[0];
      }
      catch (Exception localException)
      {
        while (true)
          n.a("tmessages", localException);
      }
    }

    public void d()
    {
      b(new Runnable()
      {
        public void run()
        {
          aj.c.this.b();
          aj.c.a(aj.c.this, null);
          Looper localLooper = Looper.myLooper();
          if (localLooper != null)
            localLooper.quit();
        }
      });
    }

    public void run()
    {
      this.k = e();
      super.run();
    }
  }

  public class d extends RecyclerView.a
  {
    private Context b;

    public d(Context arg2)
    {
      Object localObject;
      this.b = localObject;
    }

    public int a()
    {
      return 14;
    }

    public RecyclerView.u a(ViewGroup paramViewGroup, int paramInt)
    {
      return new a(new org.vidogram.ui.c.ag(this.b));
    }

    public void a(RecyclerView.u paramu, int paramInt)
    {
      Object localObject = (a)paramu;
      if (paramInt == aj.z(aj.this))
        ((org.vidogram.ui.c.ag)((a)localObject).a).a(2130838179, r.a("Enhance", 2131231178), aj.A(aj.this));
      do
      {
        return;
        if (paramInt == aj.D(aj.this))
        {
          ((org.vidogram.ui.c.ag)((a)localObject).a).a(2130838182, r.a("Highlights", 2131231290), aj.E(aj.this));
          return;
        }
        if (paramInt == aj.F(aj.this))
        {
          ((org.vidogram.ui.c.ag)((a)localObject).a).a(2130838175, r.a("Contrast", 2131231080), aj.G(aj.this));
          return;
        }
        if (paramInt == aj.H(aj.this))
        {
          ((org.vidogram.ui.c.ag)((a)localObject).a).a(2130838174, r.a("Exposure", 2131231188), aj.I(aj.this));
          return;
        }
        if (paramInt == aj.J(aj.this))
        {
          ((org.vidogram.ui.c.ag)((a)localObject).a).a(2130838188, r.a("Warmth", 2131231948), aj.K(aj.this));
          return;
        }
        if (paramInt == aj.L(aj.this))
        {
          ((org.vidogram.ui.c.ag)((a)localObject).a).a(2130838184, r.a("Saturation", 2131231758), aj.M(aj.this));
          return;
        }
        if (paramInt == aj.N(aj.this))
        {
          ((org.vidogram.ui.c.ag)((a)localObject).a).a(2130838187, r.a("Vignette", 2131231946), aj.O(aj.this));
          return;
        }
        if (paramInt == aj.P(aj.this))
        {
          ((org.vidogram.ui.c.ag)((a)localObject).a).a(2130838185, r.a("Shadows", 2131231832), aj.Q(aj.this));
          return;
        }
        if (paramInt == aj.R(aj.this))
        {
          ((org.vidogram.ui.c.ag)((a)localObject).a).a(2130838181, r.a("Grain", 2131231277), aj.S(aj.this));
          return;
        }
        if (paramInt == aj.V(aj.this))
        {
          ((org.vidogram.ui.c.ag)((a)localObject).a).a(2130838178, r.a("Sharpen", 2131231847), aj.W(aj.this));
          return;
        }
        if (paramInt == aj.Y(aj.this))
        {
          localObject = (org.vidogram.ui.c.ag)((a)localObject).a;
          str = r.a("Tint", 2131231900);
          if ((aj.m(aj.this) != 0) || (aj.o(aj.this) != 0));
          for (paramu = "◆"; ; paramu = "")
          {
            ((org.vidogram.ui.c.ag)localObject).a(2130838186, str, paramu);
            return;
          }
        }
        if (paramInt == aj.T(aj.this))
        {
          ((org.vidogram.ui.c.ag)((a)localObject).a).a(2130838180, r.a("Fade", 2131231190), aj.U(aj.this));
          return;
        }
        if (paramInt != aj.Z(aj.this))
          continue;
        localObject = (org.vidogram.ui.c.ag)((a)localObject).a;
        String str = r.a("Curves", 2131231096);
        if (aj.q(aj.this).b());
        for (paramu = ""; ; paramu = "◆")
        {
          ((org.vidogram.ui.c.ag)localObject).a(2130838177, str, paramu);
          return;
        }
      }
      while (paramInt != aj.X(aj.this));
      if (aj.r(aj.this) == 1)
        paramu = "R";
      while (true)
      {
        ((org.vidogram.ui.c.ag)((a)localObject).a).a(2130838173, r.a("Blur", 2131230918), paramu);
        return;
        if (aj.r(aj.this) == 2)
        {
          paramu = "L";
          continue;
        }
        paramu = "";
      }
    }

    public long b(int paramInt)
    {
      return paramInt;
    }

    private class a extends RecyclerView.u
    {
      public a(View arg2)
      {
        super();
      }
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.Components.aj
 * JD-Core Version:    0.6.0
 */