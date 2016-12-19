package org.vidogram.ui;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.content.FileProvider;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.ContextThemeWrapper;
import android.view.Display;
import android.view.GestureDetector;
import android.view.GestureDetector.OnDoubleTapListener;
import android.view.GestureDetector.OnGestureListener;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.TextureView;
import android.view.TextureView.SurfaceTextureListener;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.Scroller;
import android.widget.TextView;
import java.io.File;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import org.vidogram.messenger.ApplicationLoader;
import org.vidogram.messenger.MediaController;
import org.vidogram.messenger.MediaController.i;
import org.vidogram.messenger.MediaController.j;
import org.vidogram.messenger.Utilities;
import org.vidogram.messenger.ad;
import org.vidogram.messenger.ae;
import org.vidogram.messenger.b;
import org.vidogram.messenger.j;
import org.vidogram.messenger.m;
import org.vidogram.messenger.p;
import org.vidogram.messenger.q.a;
import org.vidogram.messenger.r;
import org.vidogram.messenger.support.widget.LinearLayoutManager;
import org.vidogram.messenger.support.widget.RecyclerView.a;
import org.vidogram.messenger.u;
import org.vidogram.messenger.w;
import org.vidogram.messenger.y;
import org.vidogram.messenger.y.b;
import org.vidogram.tgnet.ConnectionsManager;
import org.vidogram.tgnet.g.ak;
import org.vidogram.tgnet.g.ar;
import org.vidogram.tgnet.g.as;
import org.vidogram.tgnet.g.au;
import org.vidogram.tgnet.g.aw;
import org.vidogram.tgnet.g.ay;
import org.vidogram.tgnet.g.az;
import org.vidogram.tgnet.g.d;
import org.vidogram.tgnet.g.i;
import org.vidogram.tgnet.g.ld;
import org.vidogram.tgnet.g.mt;
import org.vidogram.tgnet.g.nc;
import org.vidogram.tgnet.g.ob;
import org.vidogram.tgnet.g.oi;
import org.vidogram.tgnet.g.oj;
import org.vidogram.tgnet.g.q;
import org.vidogram.tgnet.g.rr;
import org.vidogram.tgnet.g.t;
import org.vidogram.tgnet.g.vw;
import org.vidogram.tgnet.g.vx;
import org.vidogram.tgnet.g.x;
import org.vidogram.ui.Components.AnimatedFileDrawable;
import org.vidogram.ui.Components.af.a;
import org.vidogram.ui.Components.aj;
import org.vidogram.ui.Components.ak;
import org.vidogram.ui.Components.al;
import org.vidogram.ui.Components.al.a;
import org.vidogram.ui.Components.an;
import org.vidogram.ui.Components.aw;
import org.vidogram.ui.Components.aw.b;
import org.vidogram.ui.Components.aw.c;
import org.vidogram.ui.Components.ba;
import org.vidogram.ui.Components.ba.a;
import org.vidogram.ui.Components.bh;
import org.vidogram.ui.Components.bl;
import org.vidogram.ui.Components.bq;
import org.vidogram.ui.Components.bq.a;
import org.vidogram.ui.Components.bq.b;
import org.vidogram.ui.a.a.a;
import org.vidogram.ui.a.c;
import org.vidogram.ui.a.d;
import org.vidogram.ui.a.g;
import org.vidogram.ui.b.n.b;

public class am
  implements GestureDetector.OnDoubleTapListener, GestureDetector.OnGestureListener, y.b
{
  private static DecelerateInterpolator bQ = null;
  private static Paint bR = null;
  private static volatile am bS = null;
  private static Drawable[] i;
  private f[] A = new f[3];
  private ImageView B;
  private ImageView C;
  private ImageView D;
  private d E;
  private AnimatorSet F;
  private org.vidogram.ui.Components.af G;
  private aj H;
  private ak I;
  private AlertDialog J;
  private TextView K;
  private TextView L;
  private TextView M;
  private al N;
  private boolean O = true;
  private int P;
  private boolean Q;
  private AnimatedFileDrawable R;
  private boolean S;
  private Object T;
  private org.vidogram.messenger.exoplayer.a U;
  private TextureView V;
  private bq W;
  private FrameLayout X;
  private ImageView Y;
  private TextView Z;
  private int a;
  private int aA;
  private u aB;
  private g.d aC;
  private g.x aD;
  private String[] aE = new String[3];
  private e aF;
  private String aG;
  private Bitmap aH = null;
  private int aI;
  private long aJ;
  private long aK;
  private int aL;
  private int aM;
  private boolean aN;
  private boolean aO;
  private boolean aP;
  private boolean[] aQ = { 0, 1 };
  private boolean aR;
  private boolean aS;
  private boolean aT;
  private boolean aU;
  private boolean aV = false;
  private float aW;
  private float aX;
  private float aY;
  private float aZ = 1.0F;
  private ba aa;
  private boolean ab;
  private boolean ac;
  private boolean ad;
  private float ae;
  private long af;
  private boolean ag;
  private Runnable ah = new Runnable()
  {
    public void run()
    {
      if ((am.a(am.this) != null) && (am.b(am.this) != null) && (!am.b(am.this).a()))
      {
        org.vidogram.messenger.exoplayer.f.n localn = am.a(am.this).b();
        float f = localn.getCurrentPosition() / localn.getDuration();
        am.b(am.this).a(f);
        am.c(am.this).invalidate();
        am.d(am.this);
      }
      if (am.e(am.this))
        org.vidogram.messenger.a.a(am.f(am.this), 100L);
    }
  };
  private float[][] ai = (float[][])Array.newInstance(Float.TYPE, new int[] { 2, 8 });
  private q aj;
  private org.vidogram.ui.b.n ak;
  private aw al;
  private LinearLayoutManager am;
  private AnimatorSet an;
  private boolean ao;
  private int ap = 0;
  private long aq = 0L;
  private Runnable ar = null;
  private e as;
  private e at;
  private boolean au = false;
  private String av;
  private int aw;
  private org.vidogram.messenger.q ax = new org.vidogram.messenger.q();
  private org.vidogram.messenger.q ay = new org.vidogram.messenger.q();
  private org.vidogram.messenger.q az = new org.vidogram.messenger.q();
  private d b;
  private boolean bA = false;
  private boolean bB = true;
  private boolean bC = false;
  private boolean bD = false;
  private int bE = 0;
  private VelocityTracker bF = null;
  private Scroller bG = null;
  private ArrayList<u> bH = new ArrayList();
  private HashMap<Integer, u>[] bI = { new HashMap(), new HashMap() };
  private ArrayList<u> bJ = new ArrayList();
  private HashMap<Integer, u>[] bK = { new HashMap(), new HashMap() };
  private ArrayList<g.x> bL = new ArrayList();
  private ArrayList<g.ay> bM = new ArrayList();
  private ArrayList<Integer> bN = new ArrayList();
  private ArrayList<Object> bO = new ArrayList();
  private g.x bP = null;
  private float ba;
  private float bb;
  private float bc;
  private float bd;
  private long be;
  private AnimatorSet bf;
  private AnimatorSet bg;
  private GestureDetector bh;
  private DecelerateInterpolator bi = new DecelerateInterpolator(1.5F);
  private float bj;
  private float bk = 1.0F;
  private float bl;
  private float bm;
  private float bn;
  private float bo;
  private float bp;
  private float bq;
  private float br;
  private float bs;
  private float bt;
  private float bu;
  private boolean bv = true;
  private boolean bw = false;
  private boolean bx = false;
  private boolean by = false;
  private boolean bz = false;
  private boolean c;
  private boolean d;
  private Activity e;
  private Context f;
  private org.vidogram.ui.a.a g;
  private boolean h = true;
  private WindowManager.LayoutParams j;
  private c k;
  private FrameLayout l;
  private org.vidogram.ui.Components.l m;
  private FrameLayout n;
  private TextView o;
  private TextView p;
  private d q;
  private d r;
  private d s;
  private boolean t;
  private ImageView u;
  private a v = new a(-16777216);
  private Paint w = new Paint();
  private org.vidogram.ui.Components.i x;
  private an y;
  private an z;

  public am()
  {
    this.w.setColor(-16777216);
  }

  private g.x a(int paramInt, int[] paramArrayOfInt)
  {
    if (paramInt < 0)
      return null;
    if (!this.bL.isEmpty())
    {
      if (paramInt >= this.bL.size())
        return null;
      paramArrayOfInt[0] = ((Integer)this.bN.get(paramInt)).intValue();
      return (g.x)this.bL.get(paramInt);
    }
    Object localObject;
    if (!this.bJ.isEmpty())
    {
      if (paramInt >= this.bJ.size())
        return null;
      localObject = (u)this.bJ.get(paramInt);
      if (!(((u)localObject).a instanceof g.oj))
        break label173;
      if ((((u)localObject).a.f instanceof g.nc))
        return ((u)localObject).a.f.j.f;
      localObject = m.a(((u)localObject).m, org.vidogram.messenger.a.f());
      if (localObject != null)
      {
        paramArrayOfInt[0] = ((g.az)localObject).f;
        if (paramArrayOfInt[0] == 0)
          paramArrayOfInt[0] = -1;
        return ((g.az)localObject).c;
      }
      paramArrayOfInt[0] = -1;
    }
    label173: 
    do
      while (true)
      {
        return null;
        if (((!(((u)localObject).a.j instanceof g.ob)) || (((u)localObject).a.j.d == null)) && ((!(((u)localObject).a.j instanceof g.oi)) || (((u)localObject).a.j.r == null)))
          break;
        localObject = m.a(((u)localObject).m, org.vidogram.messenger.a.f());
        if (localObject != null)
        {
          paramArrayOfInt[0] = ((g.az)localObject).f;
          if (paramArrayOfInt[0] == 0)
            paramArrayOfInt[0] = -1;
          return ((g.az)localObject).c;
        }
        paramArrayOfInt[0] = -1;
      }
    while ((((u)localObject).A() == null) || (((u)localObject).A().i == null));
    paramArrayOfInt[0] = ((u)localObject).A().i.f;
    if (paramArrayOfInt[0] == 0)
      paramArrayOfInt[0] = -1;
    return (g.x)((u)localObject).A().i.c;
  }

  public static am a()
  {
    Object localObject1 = bS;
    if (localObject1 == null)
    {
      monitorenter;
      try
      {
        am localam = bS;
        localObject1 = localam;
        if (localam == null)
        {
          localObject1 = new am();
          bS = (am)localObject1;
        }
        return localObject1;
      }
      finally
      {
        monitorexit;
      }
    }
    return (am)localObject2;
  }

  private void a(float paramFloat)
  {
    int i1 = (int)(this.ay.p() * paramFloat - u()) / 2;
    int i2 = (int)(this.ay.q() * paramFloat - v()) / 2;
    if (i1 > 0)
    {
      this.br = (-i1);
      this.bs = i1;
      if (i2 <= 0)
        break label160;
      this.bt = (-i2);
      this.bu = i2;
    }
    while (true)
    {
      if (this.aw == 1)
      {
        this.bs += this.G.getLimitX();
        this.bu += this.G.getLimitY();
        this.br -= this.G.getLimitWidth();
        this.bt -= this.G.getLimitHeight();
      }
      return;
      this.bs = 0.0F;
      this.br = 0.0F;
      break;
      label160: this.bu = 0.0F;
      this.bt = 0.0F;
    }
  }

  private void a(float paramFloat1, float paramFloat2, float paramFloat3, boolean paramBoolean)
  {
    a(paramFloat1, paramFloat2, paramFloat3, paramBoolean, 250);
  }

  private void a(float paramFloat1, float paramFloat2, float paramFloat3, boolean paramBoolean, int paramInt)
  {
    if ((this.aZ == paramFloat1) && (this.aX == paramFloat2) && (this.aY == paramFloat3))
      return;
    this.bC = paramBoolean;
    this.bc = paramFloat1;
    this.ba = paramFloat2;
    this.bb = paramFloat3;
    this.be = System.currentTimeMillis();
    this.bf = new AnimatorSet();
    this.bf.playTogether(new Animator[] { ObjectAnimator.ofFloat(this, "animationValue", new float[] { 0.0F, 1.0F }) });
    this.bf.setInterpolator(this.bi);
    this.bf.setDuration(paramInt);
    this.bf.addListener(new b()
    {
      public void onAnimationEnd(Animator paramAnimator)
      {
        am.b(am.this, null);
        am.t(am.this).invalidate();
      }
    });
    this.bf.start();
  }

  private void a(int paramInt)
  {
    if ((this.aw == paramInt) || (this.ay.h() == null) || (this.bg != null) || (this.bf != null) || (f.a(this.A[0]) != -1));
    int i2;
    label171: label202: label372: label375: label504: Object localObject;
    label425: 
    do
    {
      return;
      if (paramInt == 0)
      {
        if ((this.aw == 2) && (this.H.getToolsView().getVisibility() != 0))
        {
          this.H.b();
          return;
        }
        if (this.ay.h() != null)
        {
          i1 = this.ay.i();
          i2 = this.ay.j();
          float f1 = u() / i1;
          float f4 = v() / i2;
          float f2 = d(0) / i1;
          float f3 = e(0) / i2;
          if (f1 > f4)
          {
            f1 = f4;
            if (f2 <= f3)
              break label372;
            f2 = f3;
            this.bc = (f2 / f1);
            this.ba = 0.0F;
            if (this.aw != 1)
              break label375;
            this.bb = org.vidogram.messenger.a.a(24.0F);
            if (Build.VERSION.SDK_INT >= 21)
              this.bb -= org.vidogram.messenger.a.a / 2;
            this.be = System.currentTimeMillis();
            this.bC = true;
          }
        }
        else
        {
          this.bf = new AnimatorSet();
          if (this.aw != 1)
            break label425;
          this.bf.playTogether(new Animator[] { ObjectAnimator.ofFloat(this.z, "translationY", new float[] { org.vidogram.messenger.a.a(48.0F) }), ObjectAnimator.ofFloat(this, "animationValue", new float[] { 0.0F, 1.0F }), ObjectAnimator.ofFloat(this.G, "alpha", new float[] { 0.0F }) });
        }
        do
          while (true)
          {
            this.bf.setDuration(200L);
            this.bf.addListener(new b(paramInt)
            {
              public void onAnimationEnd(Animator paramAnimator)
              {
                if (am.U(am.this) == 1)
                {
                  am.ai(am.this).setVisibility(8);
                  am.V(am.this).setVisibility(8);
                }
                while (true)
                {
                  am.b(am.this, null);
                  am.c(am.this, this.a);
                  am.e(am.this, 1.0F);
                  am.f(am.this, 0.0F);
                  am.g(am.this, 0.0F);
                  am.a(am.this, 1.0F);
                  am.d(am.this, am.v(am.this));
                  am.t(am.this).invalidate();
                  paramAnimator = new AnimatorSet();
                  ArrayList localArrayList = new ArrayList();
                  localArrayList.add(ObjectAnimator.ofFloat(am.m(am.this), "translationY", new float[] { 0.0F }));
                  localArrayList.add(ObjectAnimator.ofFloat(am.O(am.this), "translationY", new float[] { 0.0F }));
                  if (am.z(am.this))
                    localArrayList.add(ObjectAnimator.ofFloat(am.al(am.this), "translationY", new float[] { 0.0F }));
                  if (am.am(am.this) == 0)
                    localArrayList.add(ObjectAnimator.ofFloat(am.w(am.this), "alpha", new float[] { 1.0F }));
                  paramAnimator.playTogether(localArrayList);
                  paramAnimator.setDuration(200L);
                  paramAnimator.addListener(new b()
                  {
                    public void onAnimationStart(Animator paramAnimator)
                    {
                      am.m(am.this).setVisibility(0);
                      am.O(am.this).setVisibility(0);
                      if (am.z(am.this))
                      {
                        paramAnimator = am.al(am.this);
                        if (am.al(am.this).getTag() == null)
                          break label103;
                      }
                      label103: for (int i = 0; ; i = 4)
                      {
                        paramAnimator.setVisibility(i);
                        if (am.am(am.this) == 0)
                          am.w(am.this).setVisibility(0);
                        return;
                      }
                    }
                  });
                  paramAnimator.start();
                  return;
                  if (am.U(am.this) == 2)
                  {
                    am.t(am.this).removeView(am.aj(am.this));
                    am.a(am.this, null);
                    continue;
                  }
                  if (am.U(am.this) != 3)
                    continue;
                  am.t(am.this).removeView(am.ak(am.this));
                  am.a(am.this, null);
                }
              }
            });
            this.bf.start();
            return;
            break;
            break label171;
            if (this.aw == 2)
            {
              this.bb = org.vidogram.messenger.a.a(62.0F);
              break label202;
            }
            if (this.aw != 3)
              break label202;
            this.bb = ((org.vidogram.messenger.a.a(48.0F) - org.vidogram.ui.a.a.getCurrentActionBarHeight()) / 2);
            break label202;
            if (this.aw != 2)
              break label504;
            this.H.c();
            this.bf.playTogether(new Animator[] { ObjectAnimator.ofFloat(this.H.getToolsView(), "translationY", new float[] { org.vidogram.messenger.a.a(126.0F) }), ObjectAnimator.ofFloat(this, "animationValue", new float[] { 0.0F, 1.0F }) });
          }
        while (this.aw != 3);
        this.I.b();
        localObject = this.bf;
        ObjectAnimator localObjectAnimator1 = ObjectAnimator.ofFloat(this.I.getToolsView(), "translationY", new float[] { org.vidogram.messenger.a.a(126.0F) });
        ObjectAnimator localObjectAnimator2 = ObjectAnimator.ofFloat(this.I.getColorPicker(), "translationX", new float[] { org.vidogram.messenger.a.a(60.0F) });
        org.vidogram.ui.a.a locala = this.I.getActionBar();
        i2 = -org.vidogram.ui.a.a.getCurrentActionBarHeight();
        if (Build.VERSION.SDK_INT >= 21);
        for (i1 = org.vidogram.messenger.a.a; ; i1 = 0)
        {
          ((AnimatorSet)localObject).playTogether(new Animator[] { localObjectAnimator1, localObjectAnimator2, ObjectAnimator.ofFloat(locala, "translationY", new float[] { i2 - i1 }), ObjectAnimator.ofFloat(this, "animationValue", new float[] { 0.0F, 1.0F }) });
          break;
        }
      }
      if (paramInt == 1)
      {
        if (this.G == null)
        {
          this.G = new org.vidogram.ui.Components.af(this.f);
          this.G.setVisibility(8);
          this.k.addView(this.G, org.vidogram.ui.Components.v.a(-1, -1.0F, 51, 0.0F, 0.0F, 0.0F, 48.0F));
          this.G.setDelegate(new af.a()
          {
            public Bitmap a()
            {
              return am.Y(am.this).h();
            }

            public void a(float paramFloat1, float paramFloat2, float paramFloat3, boolean paramBoolean)
            {
              if (paramBoolean)
              {
                am.a(am.this, paramFloat3, paramFloat1, paramFloat2, true);
                return;
              }
              am.b(am.this, paramFloat1);
              am.c(am.this, paramFloat2);
              am.a(am.this, paramFloat3);
              am.t(am.this).invalidate();
            }
          });
        }
        this.z.b.setText(r.a("Crop", 2131231093));
        this.bg = new AnimatorSet();
        localObject = new ArrayList();
        ((ArrayList)localObject).add(ObjectAnimator.ofFloat(this.y, "translationY", new float[] { 0.0F, org.vidogram.messenger.a.a(96.0F) }));
        ((ArrayList)localObject).add(ObjectAnimator.ofFloat(this.g, "translationY", new float[] { 0.0F, -this.g.getHeight() }));
        if (this.Q)
          ((ArrayList)localObject).add(ObjectAnimator.ofFloat(this.K, "translationY", new float[] { 0.0F, org.vidogram.messenger.a.a(96.0F) }));
        if (this.P == 0)
          ((ArrayList)localObject).add(ObjectAnimator.ofFloat(this.x, "alpha", new float[] { 1.0F, 0.0F }));
        this.bg.playTogether((Collection)localObject);
        this.bg.setDuration(200L);
        this.bg.addListener(new b(paramInt)
        {
          public void onAnimationEnd(Animator paramAnimator)
          {
            am.c(am.this, null);
            am.m(am.this).setVisibility(8);
            if (am.z(am.this))
              am.al(am.this).setVisibility(4);
            if (am.am(am.this) == 0)
              am.w(am.this).setVisibility(8);
            paramAnimator = am.Y(am.this).h();
            boolean bool;
            int j;
            if (paramAnimator != null)
            {
              org.vidogram.ui.Components.af localaf = am.V(am.this);
              i = am.Y(am.this).d();
              if (am.am(am.this) == 1)
                break label455;
              bool = true;
              localaf.a(paramAnimator, i, bool);
              i = am.Y(am.this).i();
              j = am.Y(am.this).j();
              float f1 = am.i(am.this) / i;
              float f4 = am.j(am.this) / j;
              float f2 = am.d(am.this, 1) / i;
              float f3 = am.e(am.this, 1) / j;
              if (f1 <= f4)
                break label461;
              f1 = f4;
              label214: if (f2 <= f3)
                break label464;
              f2 = f3;
              label224: am.e(am.this, f2 / f1);
              am.f(am.this, 0.0F);
              paramAnimator = am.this;
              j = -org.vidogram.messenger.a.a(24.0F);
              if (Build.VERSION.SDK_INT < 21)
                break label467;
            }
            label455: label461: label464: label467: for (int i = org.vidogram.messenger.a.a / 2; ; i = 0)
            {
              am.g(paramAnimator, i + j);
              am.a(am.this, System.currentTimeMillis());
              am.j(am.this, true);
              am.b(am.this, new AnimatorSet());
              am.W(am.this).playTogether(new Animator[] { ObjectAnimator.ofFloat(am.ai(am.this), "translationY", new float[] { org.vidogram.messenger.a.a(48.0F), 0.0F }), ObjectAnimator.ofFloat(am.this, "animationValue", new float[] { 0.0F, 1.0F }), ObjectAnimator.ofFloat(am.V(am.this), "alpha", new float[] { 0.0F, 1.0F }) });
              am.W(am.this).setDuration(200L);
              am.W(am.this).addListener(new b()
              {
                public void onAnimationEnd(Animator paramAnimator)
                {
                  am.b(am.this, null);
                  am.c(am.this, am.25.this.a);
                  am.e(am.this, 1.0F);
                  am.f(am.this, 0.0F);
                  am.g(am.this, 0.0F);
                  am.a(am.this, 1.0F);
                  am.d(am.this, am.v(am.this));
                  am.t(am.this).invalidate();
                }

                public void onAnimationStart(Animator paramAnimator)
                {
                  am.ai(am.this).setVisibility(0);
                  am.V(am.this).setVisibility(0);
                }
              });
              am.W(am.this).start();
              return;
              bool = false;
              break;
              break label214;
              break label224;
            }
          }
        });
        this.bg.start();
        return;
      }
      if (paramInt != 2)
        continue;
      if (this.H == null)
      {
        this.H = new aj(this.e, this.ay.h(), this.ay.d());
        this.k.addView(this.H, org.vidogram.ui.Components.v.a(-1, -1.0F));
        this.H.getDoneTextView().setOnClickListener(new View.OnClickListener()
        {
          public void onClick(View paramView)
          {
            am.X(am.this);
            am.b(am.this, 0);
          }
        });
        this.H.getCancelTextView().setOnClickListener(new View.OnClickListener()
        {
          public void onClick(View paramView)
          {
            if (am.aj(am.this).a())
            {
              if (am.g(am.this) == null)
                return;
              paramView = new AlertDialog.Builder(am.g(am.this));
              paramView.setMessage(r.a("DiscardChanges", 2131231145));
              paramView.setTitle(r.a("AppName", 2131230856));
              paramView.setPositiveButton(r.a("OK", 2131231604), new DialogInterface.OnClickListener()
              {
                public void onClick(DialogInterface paramDialogInterface, int paramInt)
                {
                  am.b(am.this, 0);
                }
              });
              paramView.setNegativeButton(r.a("Cancel", 2131230943), null);
              am.this.a(paramView);
              return;
            }
            am.b(am.this, 0);
          }
        });
        this.H.getToolsView().setTranslationY(org.vidogram.messenger.a.a(126.0F));
      }
      this.bg = new AnimatorSet();
      localObject = new ArrayList();
      ((ArrayList)localObject).add(ObjectAnimator.ofFloat(this.y, "translationY", new float[] { 0.0F, org.vidogram.messenger.a.a(96.0F) }));
      ((ArrayList)localObject).add(ObjectAnimator.ofFloat(this.g, "translationY", new float[] { 0.0F, -this.g.getHeight() }));
      if (this.Q)
        ((ArrayList)localObject).add(ObjectAnimator.ofFloat(this.K, "translationY", new float[] { 0.0F, org.vidogram.messenger.a.a(96.0F) }));
      if (this.P == 0)
        ((ArrayList)localObject).add(ObjectAnimator.ofFloat(this.x, "alpha", new float[] { 1.0F, 0.0F }));
      this.bg.playTogether((Collection)localObject);
      this.bg.setDuration(200L);
      this.bg.addListener(new b(paramInt)
      {
        public void onAnimationEnd(Animator paramAnimator)
        {
          am.c(am.this, null);
          am.m(am.this).setVisibility(8);
          am.O(am.this).setVisibility(8);
          if (am.z(am.this))
            am.al(am.this).setVisibility(4);
          if (am.am(am.this) == 0)
            am.w(am.this).setVisibility(8);
          int j;
          if (am.Y(am.this).h() != null)
          {
            i = am.Y(am.this).i();
            j = am.Y(am.this).j();
            float f1 = am.i(am.this) / i;
            float f4 = am.j(am.this) / j;
            float f2 = am.d(am.this, 2) / i;
            float f3 = am.e(am.this, 2) / j;
            if (f1 <= f4)
              break label397;
            f1 = f4;
            if (f2 <= f3)
              break label400;
            f2 = f3;
            label189: am.e(am.this, f2 / f1);
            am.f(am.this, 0.0F);
            paramAnimator = am.this;
            j = -org.vidogram.messenger.a.a(62.0F);
            if (Build.VERSION.SDK_INT < 21)
              break label403;
          }
          label397: label400: label403: for (int i = org.vidogram.messenger.a.a / 2; ; i = 0)
          {
            am.g(paramAnimator, i + j);
            am.a(am.this, System.currentTimeMillis());
            am.j(am.this, true);
            am.b(am.this, new AnimatorSet());
            am.W(am.this).playTogether(new Animator[] { ObjectAnimator.ofFloat(am.this, "animationValue", new float[] { 0.0F, 1.0F }), ObjectAnimator.ofFloat(am.aj(am.this).getToolsView(), "translationY", new float[] { org.vidogram.messenger.a.a(126.0F), 0.0F }) });
            am.W(am.this).setDuration(200L);
            am.W(am.this).addListener(new b()
            {
              public void onAnimationEnd(Animator paramAnimator)
              {
                am.aj(am.this).d();
                am.b(am.this, null);
                am.c(am.this, am.28.this.a);
                am.e(am.this, 1.0F);
                am.f(am.this, 0.0F);
                am.g(am.this, 0.0F);
                am.a(am.this, 1.0F);
                am.d(am.this, am.v(am.this));
                am.t(am.this).invalidate();
              }

              public void onAnimationStart(Animator paramAnimator)
              {
              }
            });
            am.W(am.this).start();
            return;
            break;
            break label189;
          }
        }
      });
      this.bg.start();
      return;
    }
    while (paramInt != 3);
    if (this.I == null)
    {
      this.I = new ak(this.e, this.ay.h(), this.ay.d());
      this.k.addView(this.I, org.vidogram.ui.Components.v.a(-1, -1.0F));
      this.I.getDoneTextView().setOnClickListener(new View.OnClickListener()
      {
        public void onClick(View paramView)
        {
          am.X(am.this);
          am.b(am.this, 0);
        }
      });
      this.I.getCancelTextView().setOnClickListener(new View.OnClickListener()
      {
        public void onClick(View paramView)
        {
          am.ak(am.this).a(am.this, am.g(am.this), new Runnable()
          {
            public void run()
            {
              am.b(am.this, 0);
            }
          });
        }
      });
      this.I.getColorPicker().setTranslationX(org.vidogram.messenger.a.a(60.0F));
      this.I.getToolsView().setTranslationY(org.vidogram.messenger.a.a(126.0F));
      localObject = this.I.getActionBar();
      i2 = -org.vidogram.ui.a.a.getCurrentActionBarHeight();
      if (Build.VERSION.SDK_INT < 21)
        break label1675;
    }
    label1675: for (int i1 = org.vidogram.messenger.a.a; ; i1 = 0)
    {
      ((org.vidogram.ui.a.a)localObject).setTranslationY(i2 - i1);
      this.bg = new AnimatorSet();
      localObject = new ArrayList();
      ((ArrayList)localObject).add(ObjectAnimator.ofFloat(this.y, "translationY", new float[] { 0.0F, org.vidogram.messenger.a.a(96.0F) }));
      ((ArrayList)localObject).add(ObjectAnimator.ofFloat(this.g, "translationY", new float[] { 0.0F, -this.g.getHeight() }));
      if (this.Q)
        ((ArrayList)localObject).add(ObjectAnimator.ofFloat(this.K, "translationY", new float[] { 0.0F, org.vidogram.messenger.a.a(96.0F) }));
      if (this.P == 0)
        ((ArrayList)localObject).add(ObjectAnimator.ofFloat(this.x, "alpha", new float[] { 1.0F, 0.0F }));
      this.bg.playTogether((Collection)localObject);
      this.bg.setDuration(200L);
      this.bg.addListener(new b(paramInt)
      {
        public void onAnimationEnd(Animator paramAnimator)
        {
          am.c(am.this, null);
          am.m(am.this).setVisibility(8);
          if (am.z(am.this))
            am.al(am.this).setVisibility(4);
          if (am.am(am.this) == 0)
            am.w(am.this).setVisibility(8);
          int j;
          label177: label227: ObjectAnimator localObjectAnimator1;
          ObjectAnimator localObjectAnimator2;
          ObjectAnimator localObjectAnimator3;
          org.vidogram.ui.a.a locala;
          if (am.Y(am.this).h() != null)
          {
            i = am.Y(am.this).i();
            j = am.Y(am.this).j();
            float f1 = am.i(am.this) / i;
            float f4 = am.j(am.this) / j;
            float f2 = am.d(am.this, 3) / i;
            float f3 = am.e(am.this, 3) / j;
            if (f1 > f4)
            {
              f1 = f4;
              if (f2 <= f3)
                break label500;
              f2 = f3;
              am.e(am.this, f2 / f1);
              am.f(am.this, 0.0F);
              paramAnimator = am.this;
              j = org.vidogram.ui.a.a.getCurrentActionBarHeight();
              int k = org.vidogram.messenger.a.a(48.0F);
              if (Build.VERSION.SDK_INT < 21)
                break label503;
              i = org.vidogram.messenger.a.a;
              am.g(paramAnimator, (i + (j - k)) / 2);
              am.a(am.this, System.currentTimeMillis());
              am.j(am.this, true);
            }
          }
          else
          {
            am.b(am.this, new AnimatorSet());
            paramAnimator = am.W(am.this);
            localObjectAnimator1 = ObjectAnimator.ofFloat(am.this, "animationValue", new float[] { 0.0F, 1.0F });
            localObjectAnimator2 = ObjectAnimator.ofFloat(am.ak(am.this).getColorPicker(), "translationX", new float[] { org.vidogram.messenger.a.a(60.0F), 0.0F });
            localObjectAnimator3 = ObjectAnimator.ofFloat(am.ak(am.this).getToolsView(), "translationY", new float[] { org.vidogram.messenger.a.a(126.0F), 0.0F });
            locala = am.ak(am.this).getActionBar();
            j = -org.vidogram.ui.a.a.getCurrentActionBarHeight();
            if (Build.VERSION.SDK_INT < 21)
              break label509;
          }
          label500: label503: label509: for (int i = org.vidogram.messenger.a.a; ; i = 0)
          {
            paramAnimator.playTogether(new Animator[] { localObjectAnimator1, localObjectAnimator2, localObjectAnimator3, ObjectAnimator.ofFloat(locala, "translationY", new float[] { j - i, 0.0F }) });
            am.W(am.this).setDuration(200L);
            am.W(am.this).addListener(new b()
            {
              public void onAnimationEnd(Animator paramAnimator)
              {
                am.ak(am.this).a();
                am.b(am.this, null);
                am.c(am.this, am.31.this.a);
                am.e(am.this, 1.0F);
                am.f(am.this, 0.0F);
                am.g(am.this, 0.0F);
                am.a(am.this, 1.0F);
                am.d(am.this, am.v(am.this));
                am.t(am.this).invalidate();
              }

              public void onAnimationStart(Animator paramAnimator)
              {
              }
            });
            am.W(am.this).start();
            return;
            break;
            break label177;
            i = 0;
            break label227;
          }
        }
      });
      this.bg.start();
      return;
    }
  }

  private void a(int paramInt, boolean paramBoolean)
  {
    if ((this.aA == paramInt) || (this.b == null))
      return;
    if (!paramBoolean)
      this.aH = null;
    this.aE[0] = b(paramInt);
    this.aE[1] = b(paramInt + 1);
    this.aE[2] = b(paramInt - 1);
    this.b.c(this.aB, this.aD, this.aA);
    int i4 = this.aA;
    this.aA = paramInt;
    boolean bool = false;
    paramBoolean = false;
    int i2 = 0;
    Object localObject1;
    int i1;
    label180: label223: label249: long l1;
    label270: label318: label605: label867: label880: int i3;
    label1029: if (!this.bJ.isEmpty())
    {
      if ((this.aA < 0) || (this.aA >= this.bJ.size()))
      {
        a(false, false);
        return;
      }
      localObject1 = (u)this.bJ.get(this.aA);
      if ((this.aB != null) && (this.aB.q() == ((u)localObject1).q()))
      {
        i1 = 1;
        this.aB = ((u)localObject1);
        paramBoolean = this.aB.I();
        localObject1 = this.s;
        if ((!this.aB.K()) || ((int)this.aB.u() == 0))
          break label838;
        paramInt = 0;
        ((d)localObject1).setVisibility(paramInt);
        if (!this.aB.b(null))
          break label843;
        this.q.b(6);
        if ((!paramBoolean) || (Build.VERSION.SDK_INT < 16))
          break label855;
        this.q.b(11);
        if (!this.aB.l())
          break label880;
        localObject1 = org.vidogram.messenger.v.a().a(Integer.valueOf(this.aB.a.c));
        if (localObject1 == null)
          break label867;
        this.o.setText(ae.c((g.vw)localObject1));
        l1 = this.aB.a.e * 1000L;
        localObject1 = r.a("formatDateAtTime", 2131231995, new Object[] { r.a().f.a(new Date(l1)), r.a().c.a(new Date(l1)) });
        if ((this.aE[0] == null) || (!paramBoolean))
          break label937;
        this.p.setText(String.format("%s (%s)", new Object[] { localObject1, org.vidogram.messenger.a.c(this.aB.A().h) }));
      }
      while (true)
      {
        a(this.aB.d);
        if (this.R == null)
          break label949;
        this.q.a(1);
        this.q.a(10);
        if (!this.aB.b(null))
          this.q.setVisibility(8);
        this.S = true;
        this.u.setVisibility(0);
        this.g.setTitle(r.a("AttachGif", 2131230897));
        label528: if (this.aF != null)
        {
          if (this.ap != 0)
            break label2379;
          this.aF.a.a(true, true);
        }
        label554: this.aF = this.b.a(this.aB, this.aD, this.aA);
        if (this.aF != null)
        {
          if (this.ap != 0)
            break label2390;
          this.aF.a.a(false, true);
        }
        if (i1 == 0)
        {
          this.aV = false;
          this.aX = 0.0F;
          this.aY = 0.0F;
          this.aZ = 1.0F;
          this.ba = 0.0F;
          this.bb = 0.0F;
          this.bc = 1.0F;
          this.be = 0L;
          this.bf = null;
          this.bg = null;
          if (this.U != null)
            this.U.setVisibility(4);
          n();
          this.bj = 0.0F;
          this.bk = 1.0F;
          this.bl = 0.0F;
          this.bm = 0.0F;
          this.bn = 0.0F;
          this.bo = 0.0F;
          this.bp = 0.0F;
          this.bq = 0.0F;
          this.bx = false;
          this.by = false;
          this.bz = false;
          this.bA = false;
          this.bB = true;
          this.bw = false;
          this.bE = 0;
          if ((this.bO.isEmpty()) && ((this.aE[0] == null) || (paramBoolean) || (f.a(this.A[0]) == 0)))
            break label2401;
          paramBoolean = true;
          label790: this.bv = paramBoolean;
          a(this.aZ);
        }
        if (i4 != -1)
          break label2406;
        q();
        paramInt = 0;
        while (paramInt < 3)
        {
          b(paramInt, false);
          paramInt += 1;
        }
        break;
        i1 = 0;
        break label180;
        label838: paramInt = 4;
        break label223;
        label843: this.q.a(6);
        break label249;
        label855: this.q.a(11);
        break label270;
        this.o.setText("");
        break label318;
        localObject1 = org.vidogram.messenger.v.a().b(Integer.valueOf(this.aB.a.d.b));
        if (localObject1 != null)
        {
          this.o.setText(((g.i)localObject1).i);
          break label318;
        }
        this.o.setText("");
        break label318;
        label937: this.p.setText((CharSequence)localObject1);
      }
      label949: if ((this.aL + this.aM != 0) && (!this.aO))
        if (this.aR)
          if ((this.bJ.size() < this.aL + this.aM) && (!this.aP) && (this.aA > this.bJ.size() - 5))
          {
            if (!this.bJ.isEmpty())
              break label1220;
            paramInt = 0;
            i3 = 0;
            if ((this.aQ[0] == 0) || (this.aK == 0L))
              break label2650;
            if ((this.bJ.isEmpty()) || (((u)this.bJ.get(this.bJ.size() - 1)).u() == this.aK))
              break label2638;
            paramInt = 1;
            i2 = 0;
          }
    }
    while (true)
    {
      if (paramInt == 0)
        l1 = this.aJ;
      while (true)
      {
        org.vidogram.messenger.d.f.a(l1, 0, 80, i2, 0, true, this.a);
        this.aP = true;
        this.g.setTitle(r.a("Of", 2131231605, new Object[] { Integer.valueOf(this.aA + 1), Integer.valueOf(this.aL + this.aM) }));
        label1173: if (this.aB.a.F == 0)
          break label1549;
        this.S = false;
        this.q.a(1);
        this.u.setVisibility(8);
        this.q.a(10);
        break;
        label1220: paramInt = ((u)this.bJ.get(this.bJ.size() - 1)).q();
        break label1029;
        l1 = this.aK;
      }
      if ((this.bJ.size() < this.aL + this.aM) && (!this.aP) && (this.aA < 5))
      {
        if (!this.bJ.isEmpty())
          break label1458;
        paramInt = 0;
        label1301: i3 = 0;
        if ((this.aQ[0] == 0) || (this.aK == 0L))
          break label2629;
        if ((this.bJ.isEmpty()) || (((u)this.bJ.get(0)).u() == this.aK))
          break label2617;
        paramInt = 1;
        i2 = 0;
      }
      while (true)
      {
        if (paramInt == 0)
          l1 = this.aJ;
        while (true)
        {
          org.vidogram.messenger.d.f.a(l1, 0, 80, i2, 0, true, this.a);
          this.aP = true;
          this.g.setTitle(r.a("Of", 2131231605, new Object[] { Integer.valueOf(this.aL + this.aM - this.bJ.size() + this.aA + 1), Integer.valueOf(this.aL + this.aM) }));
          break;
          label1458: paramInt = ((u)this.bJ.get(0)).q();
          break label1301;
          l1 = this.aK;
        }
        if (!(this.aB.a.j instanceof g.oi))
          break label1173;
        if (this.aB.I())
        {
          this.g.setTitle(r.a("AttachVideo", 2131230902));
          break label1173;
        }
        this.g.setTitle(r.a("AttachPhoto", 2131230900));
        break label1173;
        label1549: this.S = true;
        this.q.b(1);
        localObject1 = this.u;
        if ((this.X == null) || (this.X.getVisibility() != 0));
        for (paramInt = 0; ; paramInt = 8)
        {
          ((ImageView)localObject1).setVisibility(paramInt);
          if (this.u.getVisibility() != 0)
            break label1621;
          this.q.a(10);
          break;
        }
        label1621: this.q.b(10);
        break label528;
        if (!this.bL.isEmpty())
        {
          this.o.setText("");
          this.p.setText("");
          if ((this.aI == ad.c()) && (!this.bM.isEmpty()))
            this.q.b(6);
          while (true)
          {
            localObject1 = this.aD;
            if ((paramInt >= 0) && (paramInt < this.bL.size()))
              break;
            a(false, false);
            return;
            this.q.a(6);
          }
          this.aD = ((g.x)this.bL.get(paramInt));
          if ((localObject1 == null) || (this.aD == null) || (((g.x)localObject1).d != this.aD.d) || (((g.x)localObject1).c != this.aD.c))
            break label2612;
        }
        label2065: label2331: label2612: for (paramInt = 1; ; paramInt = 0)
        {
          this.g.setTitle(r.a("Of", 2131231605, new Object[] { Integer.valueOf(this.aA + 1), Integer.valueOf(this.bL.size()) }));
          this.q.b(1);
          this.S = true;
          localObject1 = this.u;
          if ((this.X == null) || (this.X.getVisibility() != 0))
          {
            i1 = 0;
            label1875: ((ImageView)localObject1).setVisibility(i1);
            if (this.u.getVisibility() != 0)
              break label1911;
            this.q.a(10);
          }
          while (true)
          {
            i1 = paramInt;
            break;
            i1 = 8;
            break label1875;
            label1911: this.q.b(10);
          }
          i1 = i2;
          if (this.bO.isEmpty())
            break label528;
          if ((paramInt < 0) || (paramInt >= this.bO.size()))
          {
            a(false, false);
            return;
          }
          Object localObject2 = this.bO.get(paramInt);
          if ((localObject2 instanceof MediaController.i))
          {
            MediaController.i locali = (MediaController.i)localObject2;
            this.aG = locali.d;
            if ((locali.a == 0) && (locali.c == 0L) && (this.bO.size() == 1));
            for (paramInt = 1; ; paramInt = 0)
            {
              localObject1 = locali.i;
              paramBoolean = locali.h;
              label2036: if (paramInt == 0)
                break label2331;
              if (!paramBoolean)
                break label2312;
              this.t = true;
              this.g.setTitle(r.a("AttachVideo", 2131230902));
              if (this.P == 0)
                this.x.a(this.b.b(this.aA), false);
              a((CharSequence)localObject1);
              a(localObject2);
              i1 = i2;
              break;
            }
          }
          if ((localObject2 instanceof g.d))
          {
            localObject1 = (g.d)localObject2;
            this.aC = ((g.d)localObject1);
            if (((g.d)localObject1).p != null)
            {
              paramBoolean = u.g(((g.d)localObject1).p);
              this.aG = m.a(((g.d)localObject1).p).getAbsolutePath();
            }
          }
          while (true)
          {
            localObject1 = null;
            paramInt = 0;
            break label2036;
            if (((g.d)localObject1).o != null)
            {
              this.aG = m.a(m.a(((g.d)localObject1).o.h, org.vidogram.messenger.a.f())).getAbsolutePath();
              paramBoolean = false;
              continue;
            }
            if (((g.d)localObject1).i != null)
            {
              this.aG = ((g.d)localObject1).i;
              paramBoolean = ((g.d)localObject1).d.equals("video");
              continue;
              if ((localObject2 instanceof MediaController.j))
              {
                localObject1 = (MediaController.j)localObject2;
                if (((MediaController.j)localObject1).m != null);
                for (this.aG = m.a(((MediaController.j)localObject1).m, true).getAbsolutePath(); ; this.aG = ((MediaController.j)localObject1).b)
                {
                  localObject1 = ((MediaController.j)localObject1).l;
                  paramInt = 0;
                  paramBoolean = bool;
                  break;
                }
                this.g.setTitle(r.a("AttachPhoto", 2131230900));
                break label2065;
                this.g.setTitle(r.a("Of", 2131231605, new Object[] { Integer.valueOf(this.aA + 1), Integer.valueOf(this.bO.size()) }));
                break label2065;
                label2379: this.as = this.aF;
                break label554;
                label2390: this.at = this.aF;
                break label605;
                label2401: paramBoolean = false;
                break label790;
                label2406: b(0, false);
                if (i4 > this.aA)
                {
                  localObject1 = this.az;
                  this.az = this.ay;
                  this.ay = this.ax;
                  this.ax = ((org.vidogram.messenger.q)localObject1);
                  localObject1 = this.A[0];
                  this.A[0] = this.A[2];
                  this.A[2] = localObject1;
                  a(this.ax, this.aA - 1);
                  b(1, false);
                  b(2, false);
                  return;
                }
                if (i4 >= this.aA)
                  break;
                localObject1 = this.ax;
                this.ax = this.ay;
                this.ay = this.az;
                this.az = ((org.vidogram.messenger.q)localObject1);
                localObject1 = this.A[0];
                this.A[0] = this.A[1];
                this.A[1] = localObject1;
                a(this.az, this.aA + 1);
                b(1, false);
                b(2, false);
                return;
              }
              localObject1 = null;
              paramInt = 0;
              paramBoolean = bool;
              break label2036;
            }
            paramBoolean = false;
          }
        }
        label2312: label2617: i3 = 1;
        i2 = paramInt;
        paramInt = i3;
        continue;
        label2629: i2 = paramInt;
        paramInt = i3;
      }
      label2638: i3 = 1;
      i2 = paramInt;
      paramInt = i3;
      continue;
      label2650: i2 = paramInt;
      paramInt = i3;
    }
  }

  @SuppressLint({"NewApi"})
  private void a(Canvas paramCanvas)
  {
    if ((this.ap == 1) || ((!this.c) && (this.ap != 2)))
      return;
    float f1 = -1.0F;
    float f4;
    float f5;
    float f6;
    float f7;
    float f8;
    float f3;
    float f2;
    label282: org.vidogram.messenger.q localq;
    if (this.bf != null)
    {
      if (!this.bG.isFinished())
        this.bG.abortAnimation();
      f4 = this.aZ;
      f5 = this.bc;
      f6 = this.aZ;
      f7 = this.bd;
      f8 = this.aX;
      float f9 = this.ba;
      float f10 = this.aX;
      float f11 = this.bd;
      f3 = this.aY + (this.bb - this.aY) * this.bd;
      if (this.aw == 1)
        this.G.setAnimationProgress(this.bd);
      f2 = f1;
      if (this.bc == 1.0F)
      {
        f2 = f1;
        if (this.aZ == 1.0F)
        {
          f2 = f1;
          if (this.aX == 0.0F)
            f2 = f3;
        }
      }
      this.k.invalidate();
      f1 = (f9 - f10) * f11 + f8;
      f4 = (f5 - f6) * f7 + f4;
      if ((this.aw != 0) || (this.aZ != 1.0F) || (f2 == -1.0F) || (this.bC))
        break label1845;
      f5 = v() / 4.0F;
      this.v.setAlpha((int)Math.max(127.0F, (1.0F - Math.min(Math.abs(f2), f5) / f5) * 255.0F));
      localq = null;
      if (this.aw == 0)
      {
        if ((this.aZ < 1.0F) || (this.bC) || (this.bx))
          break label1917;
        if (f1 <= this.bs + org.vidogram.messenger.a.a(5.0F))
          break label1858;
        localq = this.ax;
      }
    }
    while (true)
    {
      label338: boolean bool;
      if (localq != null)
      {
        bool = true;
        label346: this.bw = bool;
        if (localq == this.az)
        {
          f5 = 0.0F;
          f2 = 1.0F;
          if ((this.bC) || (f1 >= this.br))
            break label1911;
          f2 = Math.min(1.0F, (this.br - f1) / paramCanvas.getWidth());
          f5 = (1.0F - f2) * 0.3F;
          f6 = -paramCanvas.getWidth() - org.vidogram.messenger.a.a(30.0F) / 2;
        }
      }
      while (true)
      {
        int i2;
        int i1;
        if (localq.m())
        {
          paramCanvas.save();
          paramCanvas.translate(u() / 2, v() / 2);
          paramCanvas.translate(paramCanvas.getWidth() + org.vidogram.messenger.a.a(30.0F) / 2 + f6, 0.0F);
          paramCanvas.scale(1.0F - f5, 1.0F - f5);
          i2 = localq.i();
          i1 = localq.j();
          f7 = u() / i2;
          f8 = v() / i1;
          if (f7 > f8)
          {
            f7 = f8;
            label538: i2 = (int)(i2 * f7);
            i1 = (int)(f7 * i1);
            localq.a(f2);
            localq.a(-i2 / 2, -i1 / 2, i2, i1);
            localq.a(paramCanvas);
            paramCanvas.restore();
          }
        }
        else
        {
          paramCanvas.save();
          paramCanvas.translate(f6, f3 / f4);
          paramCanvas.translate((paramCanvas.getWidth() * (this.aZ + 1.0F) + org.vidogram.messenger.a.a(30.0F)) / 2.0F, -f3 / f4);
          this.A[1].b(1.0F - f5);
          this.A[1].a(f2);
          this.A[1].a(paramCanvas);
          paramCanvas.restore();
          f5 = 0.0F;
          f2 = 1.0F;
          if ((this.bC) || (f1 <= this.bs) || (this.aw != 0))
            break label1905;
          f2 = Math.min(1.0F, (f1 - this.bs) / paramCanvas.getWidth());
          f5 = 0.3F * f2;
          f2 = 1.0F - f2;
          f6 = this.bs;
        }
        while (true)
        {
          if ((Build.VERSION.SDK_INT >= 16) && (this.U != null) && (this.U.getVisibility() == 0))
          {
            i1 = 1;
            label767: if (this.ay.m())
            {
              paramCanvas.save();
              paramCanvas.translate(u() / 2 + s(), v() / 2 + t());
              paramCanvas.translate(f6, f3);
              paramCanvas.scale(f4 - f5, f4 - f5);
              if (this.aw == 1)
                this.G.a(f4, f6, f3);
              int i4 = this.ay.i();
              int i5 = this.ay.j();
              i2 = i5;
              int i3 = i4;
              if (i1 != 0)
              {
                i2 = i5;
                i3 = i4;
                if (this.ac)
                {
                  i2 = i5;
                  i3 = i4;
                  if (Math.abs(i4 / i5 - this.V.getMeasuredWidth() / this.V.getMeasuredHeight()) > 0.01F)
                  {
                    i3 = this.V.getMeasuredWidth();
                    i2 = this.V.getMeasuredHeight();
                  }
                }
              }
              f7 = u() / i3;
              f8 = v() / i2;
              if (f7 <= f8)
                break label1899;
              f7 = f8;
              i3 = (int)(i3 * f7);
              i2 = (int)(i2 * f7);
              if ((i1 == 0) || (!this.ac) || (!this.ad) || (this.ae != 1.0F))
              {
                this.ay.a(f2);
                this.ay.a(-i3 / 2, -i2 / 2, i3, i2);
                this.ay.a(paramCanvas);
              }
              if (i1 != 0)
              {
                if ((!this.ad) && (this.ac))
                {
                  this.ad = true;
                  this.ae = 0.0F;
                  this.af = System.currentTimeMillis();
                }
                paramCanvas.translate(-i3 / 2, -i2 / 2);
                this.V.setAlpha(this.ae * f2);
                this.U.draw(paramCanvas);
                if ((this.ad) && (this.ae < 1.0F))
                {
                  long l1 = System.currentTimeMillis();
                  long l2 = this.af;
                  this.af = l1;
                  this.ae += (float)(l1 - l2) / 300.0F;
                  this.k.invalidate();
                  if (this.ae > 1.0F)
                    this.ae = 1.0F;
                }
              }
              paramCanvas.restore();
            }
            label994: if ((i1 == 0) && ((this.X == null) || (this.X.getVisibility() != 0)))
            {
              paramCanvas.save();
              paramCanvas.translate(f6, f3 / f4);
              this.A[0].b(1.0F - f5);
              this.A[0].a(f2);
              this.A[0].a(paramCanvas);
              paramCanvas.restore();
            }
            if (localq != this.ax)
              break;
            if (localq.m())
            {
              paramCanvas.save();
              paramCanvas.translate(u() / 2, v() / 2);
              paramCanvas.translate(-(paramCanvas.getWidth() * (this.aZ + 1.0F) + org.vidogram.messenger.a.a(30.0F)) / 2.0F + f1, 0.0F);
              i2 = localq.i();
              i1 = localq.j();
              f2 = u() / i2;
              f5 = v() / i1;
              if (f2 <= f5)
                break label1902;
              f2 = f5;
            }
          }
          label1823: label1845: label1858: label1899: label1902: 
          while (true)
          {
            i2 = (int)(i2 * f2);
            i1 = (int)(f2 * i1);
            localq.a(1.0F);
            localq.a(-i2 / 2, -i1 / 2, i2, i1);
            localq.a(paramCanvas);
            paramCanvas.restore();
            paramCanvas.save();
            paramCanvas.translate(f1, f3 / f4);
            paramCanvas.translate(-(paramCanvas.getWidth() * (this.aZ + 1.0F) + org.vidogram.messenger.a.a(30.0F)) / 2.0F, -f3 / f4);
            this.A[2].b(1.0F);
            this.A[2].a(1.0F);
            this.A[2].a(paramCanvas);
            paramCanvas.restore();
            return;
            if (this.be != 0L)
            {
              this.aX = this.ba;
              this.aY = this.bb;
              this.aZ = this.bc;
              this.be = 0L;
              if (this.aw == 1)
                this.G.setAnimationProgress(1.0F);
              a(this.aZ);
              this.bC = false;
            }
            if ((!this.bG.isFinished()) && (this.bG.computeScrollOffset()))
            {
              if ((this.bG.getStartX() < this.bs) && (this.bG.getStartX() > this.br))
                this.aX = this.bG.getCurrX();
              if ((this.bG.getStartY() < this.bu) && (this.bG.getStartY() > this.bt))
                this.aY = this.bG.getCurrY();
              this.k.invalidate();
            }
            if (this.bE != 0)
            {
              if (this.bE != 1)
                break label1823;
              a(this.aA + 1, false);
            }
            while (true)
            {
              this.bE = 0;
              f5 = this.aZ;
              f6 = this.aY;
              f7 = this.aX;
              f2 = f1;
              f4 = f5;
              f1 = f7;
              f3 = f6;
              if (this.by)
                break;
              f2 = this.aY;
              f4 = f5;
              f1 = f7;
              f3 = f6;
              break;
              if (this.bE != 2)
                continue;
              a(this.aA - 1, false);
            }
            this.v.setAlpha(255);
            break label282;
            if (f1 >= this.br - org.vidogram.messenger.a.a(5.0F))
              break label1917;
            localq = this.az;
            break label338;
            bool = false;
            break label346;
            break label538;
            i1 = 0;
            break label767;
            break label994;
          }
          label1905: f6 = f1;
        }
        label1911: f6 = f1;
      }
      label1917: localq = null;
    }
  }

  @SuppressLint({"NewApi"})
  private void a(File paramFile, boolean paramBoolean)
  {
    if (this.e == null)
      return;
    n();
    if (this.V == null)
    {
      this.U = new org.vidogram.messenger.exoplayer.a(this.e);
      this.U.setVisibility(4);
      this.k.addView(this.U, 0, org.vidogram.ui.Components.v.b(-1, -1, 17));
      this.V = new TextureView(this.e);
      this.V.setOpaque(false);
      this.V.setSurfaceTextureListener(new TextureView.SurfaceTextureListener()
      {
        public void onSurfaceTextureAvailable(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
        {
          if (am.a(am.this) != null)
            am.a(am.this).b(new Surface(am.af(am.this).getSurfaceTexture()));
        }

        public boolean onSurfaceTextureDestroyed(SurfaceTexture paramSurfaceTexture)
        {
          if (am.a(am.this) != null)
            am.a(am.this).c();
          return true;
        }

        public void onSurfaceTextureSizeChanged(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
        {
        }

        public void onSurfaceTextureUpdated(SurfaceTexture paramSurfaceTexture)
        {
          if (!am.ag(am.this))
          {
            am.h(am.this, true);
            am.t(am.this).invalidate();
          }
        }
      });
      this.U.addView(this.V, org.vidogram.ui.Components.v.b(-1, -1, 17));
    }
    this.ac = false;
    this.ad = false;
    TextureView localTextureView = this.V;
    this.ae = 0.0F;
    localTextureView.setAlpha(0.0F);
    this.Y.setImageResource(2130837924);
    long l1;
    if (this.W == null)
    {
      this.W = new bq(new bq.a(this.e, "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/50.0.2661.102 Safari/537.36", Uri.fromFile(paramFile)));
      this.W.a(new bq.b()
      {
        public void a(int paramInt1, int paramInt2, int paramInt3, float paramFloat)
        {
          int j;
          int i;
          org.vidogram.messenger.exoplayer.a locala;
          if (am.p(am.this) != null)
          {
            if (paramInt3 != 90)
            {
              j = paramInt1;
              i = paramInt2;
              if (paramInt3 != 270);
            }
            else
            {
              i = paramInt1;
              j = paramInt2;
            }
            locala = am.p(am.this);
            if (i != 0)
              break label61;
            paramFloat = 1.0F;
          }
          while (true)
          {
            locala.a(paramFloat, paramInt3);
            return;
            label61: paramFloat = j * paramFloat / i;
          }
        }

        public void a(Exception paramException)
        {
          org.vidogram.messenger.n.a("tmessages", paramException);
        }

        public void a(boolean paramBoolean, int paramInt)
        {
          if (am.a(am.this) == null)
            return;
          if ((paramInt != 5) && (paramInt != 1));
          while (true)
          {
            try
            {
              am.g(am.this).getWindow().addFlags(128);
              if ((paramInt != 4) || (am.p(am.this).getVisibility() == 0))
                continue;
              am.p(am.this).setVisibility(0);
              if ((!am.a(am.this).b().isPlaying()) || (paramInt == 5))
                break label175;
              if (am.e(am.this))
                continue;
              am.i(am.this, true);
              am.ah(am.this).setImageResource(2130837923);
              org.vidogram.messenger.a.a(am.f(am.this));
              am.d(am.this);
              return;
            }
            catch (Exception localException1)
            {
              org.vidogram.messenger.n.a("tmessages", localException1);
              continue;
            }
            try
            {
              am.g(am.this).getWindow().clearFlags(128);
            }
            catch (Exception localException2)
            {
              org.vidogram.messenger.n.a("tmessages", localException2);
            }
            continue;
            label175: if (!am.e(am.this))
              continue;
            am.i(am.this, false);
            am.ah(am.this).setImageResource(2130837924);
            org.vidogram.messenger.a.b(am.f(am.this));
            if ((paramInt != 5) || (am.b(am.this).a()))
              continue;
            am.b(am.this).a(0.0F);
            am.c(am.this).invalidate();
            am.a(am.this).a(0L);
            am.a(am.this).b().pause();
          }
        }
      });
      if (this.W == null)
        break label500;
      long l2 = this.W.h();
      l1 = l2;
      if (l2 == -1L)
        l1 = 0L;
    }
    while (true)
    {
      l1 /= 1000L;
      int i1 = (int)Math.ceil(this.Z.getPaint().measureText(String.format("%02d:%02d / %02d:%02d", new Object[] { Long.valueOf(l1 / 60L), Long.valueOf(l1 % 60L), Long.valueOf(l1 / 60L), Long.valueOf(l1 % 60L) })));
      this.ab = true;
      if (this.ab)
      {
        this.W.d();
        this.ab = false;
      }
      if (this.X != null)
      {
        if ((this.aC != null) && ((this.aC.d.equals("video")) || (u.g(this.aC.p))))
        {
          this.n.setVisibility(0);
          this.n.setTranslationY(-org.vidogram.messenger.a.a(48.0F));
        }
        this.X.setVisibility(0);
        this.p.setVisibility(8);
        this.o.setVisibility(8);
        if (this.S)
        {
          this.u.setVisibility(8);
          this.q.b(10);
        }
      }
      if (this.V.getSurfaceTexture() != null)
        this.W.b(new Surface(this.V.getSurfaceTexture()));
      this.W.a(paramBoolean);
      return;
      label500: l1 = 0L;
    }
  }

  private void a(CharSequence paramCharSequence)
  {
    if ((paramCharSequence != null) && (paramCharSequence.length() > 0))
    {
      this.K = this.L;
      this.L = this.M;
      this.M = this.K;
      paramCharSequence = j.a(new SpannableStringBuilder(paramCharSequence.toString()), u.b().getFontMetricsInt(), org.vidogram.messenger.a.a(20.0F), false);
      this.K.setTag(paramCharSequence);
      this.K.setText(paramCharSequence);
      this.K.setTextColor(-1);
      paramCharSequence = this.K;
      float f1;
      if ((this.n.getVisibility() == 0) || (this.y.getVisibility() == 0))
        f1 = 1.0F;
      while (true)
      {
        paramCharSequence.setAlpha(f1);
        org.vidogram.messenger.a.a(new Runnable()
        {
          public void run()
          {
            int i = 4;
            am.o(am.this).setTag(null);
            am.o(am.this).setVisibility(4);
            TextView localTextView = am.n(am.this);
            if ((am.ap(am.this).getVisibility() == 0) || (am.m(am.this).getVisibility() == 0))
              i = 0;
            localTextView.setVisibility(i);
          }
        });
        return;
        f1 = 0.0F;
      }
    }
    if (this.Q)
    {
      this.K.setText(r.a("AddCaption", 2131230812));
      this.K.setTag("empty");
      this.K.setVisibility(0);
      this.K.setTextColor(-1291845633);
      return;
    }
    this.K.setTextColor(-1);
    this.K.setTag(null);
    this.K.setVisibility(4);
  }

  private void a(Object paramObject)
  {
    Object localObject2 = null;
    Object localObject1;
    if ((paramObject instanceof MediaController.i))
      localObject1 = ((MediaController.i)paramObject).i;
    while ((localObject1 == null) || (((CharSequence)localObject1).length() == 0))
    {
      this.N.setFieldText("");
      return;
      localObject1 = localObject2;
      if ((paramObject instanceof g.d))
        continue;
      localObject1 = localObject2;
      if (!(paramObject instanceof MediaController.j))
        continue;
      localObject1 = ((MediaController.j)paramObject).l;
    }
    this.N.setFieldText((CharSequence)localObject1);
  }

  private void a(org.vidogram.messenger.q paramq, int paramInt)
  {
    paramq.a(0, false);
    Object localObject6;
    int i1;
    Object localObject2;
    Object localObject1;
    if (!this.bO.isEmpty())
    {
      paramq.a(null);
      if ((paramInt >= 0) && (paramInt < this.bO.size()))
      {
        localObject6 = this.bO.get(paramInt);
        i1 = (int)(org.vidogram.messenger.a.f() / org.vidogram.messenger.a.b);
        localObject2 = null;
        localObject1 = localObject2;
        if (this.aH != null)
        {
          localObject1 = localObject2;
          if (paramq == this.ay)
            localObject1 = this.aH;
        }
        if (localObject1 != null)
          break label1305;
      }
    }
    label1153: label1296: label1305: for (Object localObject5 = this.b.b(null, null, paramInt); ; localObject5 = localObject1)
    {
      localObject2 = null;
      Object localObject3 = null;
      localObject1 = null;
      paramInt = 0;
      Object localObject4 = null;
      if ((localObject6 instanceof MediaController.i))
      {
        localObject1 = (MediaController.i)localObject6;
        if (((MediaController.i)localObject1).h)
          break label1296;
        if (((MediaController.i)localObject1).g != null)
        {
          localObject1 = ((MediaController.i)localObject1).g;
          localObject3 = String.format(Locale.US, "%d_%d", new Object[] { Integer.valueOf(i1), Integer.valueOf(i1) });
          localObject2 = localObject1;
          localObject1 = localObject3;
        }
      }
      while (true)
      {
        paramInt = 0;
        localObject4 = null;
        localObject3 = localObject2;
        localObject6 = null;
        localObject2 = localObject1;
        localObject1 = localObject6;
        if (localObject1 != null)
          if (localObject5 != null)
          {
            localObject2 = new BitmapDrawable(null, (Bitmap)localObject5);
            label238: if (localObject5 != null)
              break label722;
            localObject3 = ((g.q)localObject1).i.c;
            label253: paramq.a((org.vidogram.tgnet.f)localObject1, null, "d", (Drawable)localObject2, (g.x)localObject3, String.format(Locale.US, "%d_%d", new Object[] { Integer.valueOf(i1), Integer.valueOf(i1) }), paramInt, null, false);
            return;
            paramq.a(((MediaController.i)localObject1).e, false);
            localObject1 = ((MediaController.i)localObject1).d;
            break;
            if ((localObject6 instanceof g.d))
            {
              localObject1 = (g.d)localObject6;
              if ((((g.d)localObject1).d.equals("video")) || (u.g(((g.d)localObject1).p)))
                if (((g.d)localObject1).p != null)
                {
                  localObject1 = ((g.d)localObject1).p.i.c;
                  localObject3 = null;
                  paramInt = 0;
                  localObject2 = null;
                }
            }
          }
        while (true)
        {
          localObject6 = localObject1;
          localObject1 = localObject2;
          localObject2 = localObject4;
          localObject4 = localObject6;
          break;
          localObject3 = ((g.d)localObject1).h;
          paramInt = 0;
          localObject2 = null;
          localObject1 = null;
          continue;
          if ((((g.d)localObject1).d.equals("gif")) && (((g.d)localObject1).p != null))
          {
            localObject2 = ((g.d)localObject1).p;
            paramInt = ((g.d)localObject1).p.h;
            localObject4 = "d";
            localObject3 = null;
            localObject1 = null;
            continue;
          }
          if (((g.d)localObject1).o != null)
          {
            localObject2 = m.a(((g.d)localObject1).o.h, org.vidogram.messenger.a.f());
            localObject1 = ((g.az)localObject2).c;
            paramInt = ((g.az)localObject2).f;
            localObject4 = String.format(Locale.US, "%d_%d", new Object[] { Integer.valueOf(i1), Integer.valueOf(i1) });
            localObject3 = null;
            localObject2 = null;
            continue;
          }
          if (((g.d)localObject1).i != null)
          {
            if (((g.d)localObject1).d.equals("gif"));
            for (localObject4 = "d"; ; localObject4 = String.format(Locale.US, "%d_%d", new Object[] { Integer.valueOf(i1), Integer.valueOf(i1) }))
            {
              localObject3 = ((g.d)localObject1).i;
              paramInt = 0;
              localObject2 = null;
              localObject1 = null;
              break;
            }
            if ((localObject6 instanceof MediaController.j))
            {
              localObject4 = (MediaController.j)localObject6;
              if (((MediaController.j)localObject4).k != null)
                localObject3 = ((MediaController.j)localObject4).k;
              while (true)
              {
                localObject4 = null;
                localObject2 = "d";
                break;
                if (((MediaController.j)localObject4).m != null)
                {
                  localObject1 = ((MediaController.j)localObject4).m;
                  paramInt = ((MediaController.j)localObject4).m.h;
                  localObject3 = localObject2;
                  continue;
                }
                localObject3 = ((MediaController.j)localObject4).b;
                paramInt = ((MediaController.j)localObject4).g;
              }
              localObject2 = null;
              break label238;
              label722: localObject3 = null;
              break label253;
              if (localObject4 != null)
              {
                if (localObject5 != null);
                for (localObject1 = new BitmapDrawable(null, (Bitmap)localObject5); ; localObject1 = null)
                {
                  paramq.a((org.vidogram.tgnet.f)localObject4, null, (String)localObject2, (Drawable)localObject1, null, String.format(Locale.US, "%d_%d", new Object[] { Integer.valueOf(i1), Integer.valueOf(i1) }), paramInt, null, false);
                  return;
                }
              }
              if (localObject5 != null);
              for (localObject1 = new BitmapDrawable(null, (Bitmap)localObject5); ; localObject1 = null)
              {
                paramq.a((String)localObject3, (String)localObject2, (Drawable)localObject1, null, paramInt);
                return;
              }
              paramq.a((Bitmap)null);
              return;
              localObject3 = new int[1];
              localObject4 = a(paramInt, localObject3);
              if (localObject4 != null)
              {
                localObject1 = null;
                if (!this.bJ.isEmpty())
                  localObject1 = (u)this.bJ.get(paramInt);
                paramq.a((u)localObject1);
                if (localObject1 != null)
                  paramq.f(true);
                if ((localObject1 != null) && (((u)localObject1).I()))
                {
                  paramq.e(true);
                  if ((((u)localObject1).m != null) && (!((u)localObject1).m.isEmpty()))
                    if ((this.aH == null) || (paramq != this.ay))
                      break label1262;
                }
              }
              label1194: label1200: label1206: label1262: for (localObject2 = this.aH; ; localObject2 = null)
              {
                localObject3 = m.a(((u)localObject1).m, 100);
                if (localObject2 != null);
                for (localObject1 = new BitmapDrawable(null, (Bitmap)localObject2); ; localObject1 = null)
                {
                  paramq.a(null, null, null, (Drawable)localObject1, ((g.az)localObject3).c, "b", 0, null, true);
                  return;
                }
                paramq.a(this.e.getResources().getDrawable(2130838066));
                return;
                if ((localObject1 != null) && (this.R != null))
                {
                  paramq.a(this.R);
                  this.R.b(this.k);
                  return;
                }
                paramq.e(false);
                if ((this.aH != null) && (paramq == this.ay));
                for (localObject2 = this.aH; ; localObject2 = null)
                {
                  if (localObject3[0] == 0)
                    localObject3[0] = -1;
                  if (localObject1 != null)
                  {
                    localObject1 = m.a(((u)localObject1).m, 100);
                    if (localObject2 == null)
                      break label1194;
                    localObject2 = new BitmapDrawable(null, (Bitmap)localObject2);
                    label1141: if (localObject1 == null)
                      break label1200;
                    localObject1 = ((g.az)localObject1).c;
                    paramInt = localObject3[0];
                    if (this.aI == 0)
                      break label1206;
                  }
                  for (boolean bool = true; ; bool = false)
                  {
                    paramq.a((org.vidogram.tgnet.f)localObject4, null, null, (Drawable)localObject2, (g.x)localObject1, "b", paramInt, null, bool);
                    return;
                    localObject1 = null;
                    break;
                    localObject2 = null;
                    break label1141;
                    localObject1 = null;
                    break label1153;
                  }
                  paramq.e(false);
                  paramq.a(null);
                  if (localObject3[0] == 0)
                  {
                    paramq.a((Bitmap)null);
                    return;
                  }
                  paramq.a(this.e.getResources().getDrawable(2130838066));
                  return;
                }
              }
            }
            paramInt = 0;
            localObject4 = null;
            localObject2 = null;
            localObject1 = null;
            break;
          }
          paramInt = 0;
          localObject2 = null;
          localObject3 = null;
          localObject1 = null;
        }
        localObject1 = null;
        localObject2 = null;
      }
    }
  }

  private void a(u paramu, g.x paramx, ArrayList<u> paramArrayList, ArrayList<Object> paramArrayList1, int paramInt, e parame)
  {
    this.a = ConnectionsManager.a().i();
    this.aB = null;
    this.aD = null;
    this.aG = null;
    this.aC = null;
    this.aA = -1;
    this.aE[0] = null;
    this.aE[1] = null;
    this.aE[2] = null;
    this.aI = 0;
    this.aL = 0;
    this.aM = 0;
    this.aw = 0;
    this.aN = true;
    this.aO = false;
    this.aP = false;
    this.aQ[0] = false;
    Object localObject = this.aQ;
    if (this.aK == 0L);
    int i1;
    for (boolean bool = true; ; bool = false)
    {
      localObject[1] = bool;
      this.aR = false;
      this.Q = false;
      this.O = true;
      this.bJ.clear();
      this.bL.clear();
      this.bN.clear();
      this.bM.clear();
      this.bO.clear();
      i1 = 0;
      while (i1 < 2)
      {
        this.bK[i1].clear();
        this.bI[i1].clear();
        i1 += 1;
      }
    }
    this.bH.clear();
    this.bP = null;
    this.k.setPadding(0, 0, 0, 0);
    if (parame != null);
    for (localObject = parame.e; ; localObject = null)
    {
      this.aH = ((Bitmap)localObject);
      this.q.setVisibility(0);
      this.n.setVisibility(0);
      this.n.setTranslationY(0.0F);
      this.u.setVisibility(8);
      this.S = false;
      this.q.a(2);
      this.q.a(10);
      this.q.a(11);
      this.g.setTranslationY(0.0F);
      this.y.setTranslationY(0.0F);
      this.x.setAlpha(1.0F);
      this.y.setAlpha(1.0F);
      this.x.setVisibility(8);
      this.y.setVisibility(8);
      this.B.setVisibility(8);
      this.C.setVisibility(8);
      this.D.setVisibility(8);
      this.E.setVisibility(8);
      this.N.setVisibility(8);
      this.al.setVisibility(8);
      this.r.setVisibility(8);
      this.s.setVisibility(8);
      this.t = false;
      this.d = false;
      this.r.setIcon(2130838198);
      this.z.setVisibility(8);
      this.K.setTag(null);
      this.K.setVisibility(4);
      if (this.G != null)
        this.G.setVisibility(8);
      if (this.H != null)
        this.H.setVisibility(8);
      i1 = 0;
      while (i1 < 3)
      {
        if (this.A[i1] != null)
          this.A[i1].a(-1, false);
        i1 += 1;
      }
    }
    if ((paramu != null) && (paramArrayList == null))
    {
      this.bJ.add(paramu);
      if (this.R != null)
        this.aO = false;
    }
    label605: label870: 
    do
    {
      do
      {
        do
        {
          break label721;
          break label721;
          break label721;
          a(0, true);
          i1 = paramInt;
          if (this.R == null)
          {
            if ((this.aJ == 0L) || (this.aL != 0))
              break label1593;
            org.vidogram.messenger.d.f.a(this.aJ, 0, this.a, true);
            if (this.aK != 0L)
              org.vidogram.messenger.d.f.a(this.aK, 0, this.a, true);
          }
          while (true)
          {
            if (((this.aB == null) || (!this.aB.I())) && ((this.aC == null) || ((!this.aC.d.equals("video")) && (!u.g(this.aC.p)))))
              break label1622;
            d(false);
            return;
            if (((paramu.a.j instanceof g.oi)) || ((paramu.a.f != null) && (!(paramu.a.f instanceof g.mt))))
              break;
            this.aO = true;
            this.bK[0].put(Integer.valueOf(paramu.q()), paramu);
            this.q.b(2);
            break;
            if (paramx != null)
            {
              this.aI = parame.f;
              this.bL.add(paramx);
              this.bN.add(Integer.valueOf(parame.g));
              this.bM.add(new g.rr());
              paramu = this.u;
              if ((this.X == null) || (this.X.getVisibility() != 0))
              {
                i1 = 0;
                paramu.setVisibility(i1);
                this.S = true;
                this.q.a(2);
                if (this.u.getVisibility() != 0)
                  break label933;
                this.q.a(10);
              }
              while (true)
              {
                a(0, true);
                this.bP = paramx;
                i1 = paramInt;
                break;
                i1 = 8;
                break label870;
                this.q.b(10);
              }
            }
            if (paramArrayList != null)
            {
              this.q.b(2);
              this.aR = true;
              this.bJ.addAll(paramArrayList);
              i1 = paramInt;
              if (!this.aR)
              {
                Collections.reverse(this.bJ);
                i1 = this.bJ.size() - paramInt - 1;
              }
              paramInt = 0;
              if (paramInt < this.bJ.size())
              {
                paramu = (u)this.bJ.get(paramInt);
                paramx = this.bK;
                if (paramu.u() == this.aJ);
                for (int i2 = 0; ; i2 = 1)
                {
                  paramx[i2].put(Integer.valueOf(paramu.q()), paramu);
                  paramInt += 1;
                  break;
                }
              }
              a(i1, true);
              break label605;
            }
            i1 = paramInt;
            if (paramArrayList1 == null)
              break label605;
            if (this.P == 0)
              this.x.setVisibility(0);
            this.q.setVisibility(8);
            this.bO.addAll(paramArrayList1);
            a(paramInt, true);
            this.y.setVisibility(0);
            this.n.setVisibility(8);
            this.O = false;
            paramu = this.bO.get(paramInt);
            if ((paramu instanceof MediaController.i))
              if (((MediaController.i)paramu).h)
              {
                this.C.setVisibility(8);
                this.n.setVisibility(0);
                this.n.setTranslationY(-org.vidogram.messenger.a.a(48.0F));
                if ((this.aj != null) && ((this.aj.k == null) || (org.vidogram.messenger.a.c(this.aj.k.o) >= 46)))
                {
                  this.ak.a(this.aj.n);
                  paramu = this.ak;
                  if (this.aj.i == null)
                    break label1563;
                  bool = true;
                  paramu.b(bool);
                  this.ak.c(false);
                  if ((this.C.getVisibility() != 0) || ((this.b != null) && ((this.b == null) || (!this.b.w()))))
                    break label1569;
                  bool = true;
                  this.Q = bool;
                  paramu = this.N;
                  if (!this.Q)
                    break label1575;
                  i1 = 0;
                  paramu.setVisibility(i1);
                  if ((this.K.getTag() != null) || (!this.Q))
                    break label1582;
                  this.K.setText(r.a("AddCaption", 2131230812));
                  this.K.setTag("empty");
                  this.K.setTextColor(-1291845633);
                  this.K.setVisibility(0);
                }
              }
            while (true)
            {
              if (this.Q)
                this.N.b();
              if (Build.VERSION.SDK_INT >= 16)
              {
                this.B.setVisibility(this.C.getVisibility());
                this.D.setVisibility(this.C.getVisibility());
              }
              p();
              i1 = paramInt;
              break;
              this.C.setVisibility(0);
              break label1223;
              if ((paramu instanceof g.d))
              {
                this.C.setVisibility(8);
                break label1223;
              }
              paramx = this.C;
              if (((paramu instanceof MediaController.j)) && (((MediaController.j)paramu).h == 0));
              for (i1 = 0; ; i1 = 8)
              {
                paramx.setVisibility(i1);
                break;
              }
              bool = false;
              break label1290;
              bool = false;
              break label1343;
              i1 = 8;
              break label1364;
              this.K.setTextColor(-1);
            }
            if (this.aI == 0)
              continue;
            org.vidogram.messenger.v.a().a(this.aI, 0, 80, 0L, true, this.a);
          }
        }
        while (this.bO.isEmpty());
        paramu = this.bO.get(i1);
      }
      while (!(paramu instanceof MediaController.i));
      paramu = (MediaController.i)paramu;
    }
    while (!paramu.h);
    label721: label1364: label1622: a(new File(paramu.d), false);
    label933: label1223: return;
  }

  private void a(e parame)
  {
    this.c = false;
    this.au = true;
    this.aB = null;
    this.aC = null;
    this.aD = null;
    this.aG = null;
    this.aH = null;
    if (this.R != null)
    {
      this.R.b(null);
      this.R = null;
    }
    int i1 = 0;
    while (i1 < 3)
    {
      if (this.A[i1] != null)
        this.A[i1].a(-1, false);
      i1 += 1;
    }
    this.ay.a((Bitmap)null);
    this.ax.a((Bitmap)null);
    this.az.a((Bitmap)null);
    this.k.post(new Runnable()
    {
      public void run()
      {
        am.q(am.this).setImageBitmap(null);
        try
        {
          if (am.y(am.this).getParent() != null)
            ((WindowManager)am.g(am.this).getSystemService("window")).removeView(am.y(am.this));
          return;
        }
        catch (Exception localException)
        {
          org.vidogram.messenger.n.a("tmessages", localException);
        }
      }
    });
    if (this.b != null)
      this.b.y();
    this.b = null;
    this.au = false;
    if (parame != null)
      parame.a.a(true, true);
  }

  private void a(boolean paramBoolean)
  {
    if ((this.aA < 0) || (this.aA >= this.bO.size()))
      return;
    Object localObject = this.bO.get(this.aA);
    if (paramBoolean)
    {
      if (!(localObject instanceof MediaController.i))
        break label309;
      ((MediaController.i)localObject).i = this.N.getFieldCharSequence();
    }
    while (true)
    {
      if ((this.N.getFieldCharSequence().length() != 0) && (!this.b.b(this.aA)))
      {
        this.b.c(this.aA);
        this.x.a(this.b.b(this.aA), true);
        p();
      }
      this.C.setVisibility(0);
      if (Build.VERSION.SDK_INT >= 16)
      {
        this.B.setVisibility(0);
        this.D.setVisibility(0);
      }
      if (this.P == 0)
        this.x.setVisibility(0);
      this.E.setVisibility(8);
      this.y.setVisibility(0);
      FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)this.N.getLayoutParams();
      localLayoutParams.bottomMargin = (-org.vidogram.messenger.a.a(400.0F));
      this.N.setLayoutParams(localLayoutParams);
      localLayoutParams = (FrameLayout.LayoutParams)this.al.getLayoutParams();
      localLayoutParams.bottomMargin = (-org.vidogram.messenger.a.a(400.0F));
      this.al.setLayoutParams(localLayoutParams);
      if (this.av != null)
      {
        this.g.setTitle(this.av);
        this.av = null;
      }
      a(localObject);
      a(this.N.getFieldCharSequence());
      if (!this.N.f())
        break;
      this.N.d();
      return;
      label309: if (!(localObject instanceof MediaController.j))
        continue;
      ((MediaController.j)localObject).l = this.N.getFieldCharSequence();
    }
    this.N.g();
  }

  private boolean a(MotionEvent paramMotionEvent)
  {
    float f5 = 0.0F;
    float f4 = 0.0F;
    if ((this.ap != 0) || (this.be != 0L))
      return false;
    if (this.aw == 2)
    {
      this.H.a(paramMotionEvent);
      return true;
    }
    if (this.aw == 1)
      if (paramMotionEvent.getPointerCount() == 1)
      {
        if (this.G.a(paramMotionEvent))
        {
          a(this.aZ);
          return true;
        }
      }
      else
        this.G.a(null);
    if ((this.N.f()) || (this.N.h()))
    {
      if (paramMotionEvent.getAction() == 1)
        a(true);
      return true;
    }
    if ((this.aw == 0) && (paramMotionEvent.getPointerCount() == 1) && (this.bh.onTouchEvent(paramMotionEvent)) && (this.bz))
    {
      this.bz = false;
      this.by = false;
      this.bx = false;
      c(false);
      return true;
    }
    if ((paramMotionEvent.getActionMasked() == 0) || (paramMotionEvent.getActionMasked() == 5))
    {
      if (this.aw == 1)
        this.G.b();
      this.bD = false;
      if (!this.bG.isFinished())
        this.bG.abortAnimation();
      if ((!this.aV) && (!this.bw))
      {
        if ((!this.bv) || (paramMotionEvent.getPointerCount() != 2))
          break label375;
        this.bj = (float)Math.hypot(paramMotionEvent.getX(1) - paramMotionEvent.getX(0), paramMotionEvent.getY(1) - paramMotionEvent.getY(0));
        this.bk = this.aZ;
        this.bl = ((paramMotionEvent.getX(0) + paramMotionEvent.getX(1)) / 2.0F);
        this.bm = ((paramMotionEvent.getY(0) + paramMotionEvent.getY(1)) / 2.0F);
        this.bn = this.aX;
        this.bo = this.aY;
        this.bx = true;
        this.by = false;
        if (this.bF != null)
          this.bF.clear();
      }
    }
    label375: float f1;
    float f2;
    float f3;
    while (true)
    {
      return false;
      if (paramMotionEvent.getPointerCount() != 1)
        continue;
      this.bp = paramMotionEvent.getX();
      f1 = paramMotionEvent.getY();
      this.bq = f1;
      this.aW = f1;
      this.aV = false;
      this.bB = true;
      if (this.bF == null)
        continue;
      this.bF.clear();
      continue;
      if (paramMotionEvent.getActionMasked() != 2)
        break label1263;
      if (this.aw == 1)
        this.G.b();
      if ((this.bv) && (paramMotionEvent.getPointerCount() == 2) && (!this.aV) && (this.bx) && (!this.bw))
      {
        this.bD = true;
        this.aZ = ((float)Math.hypot(paramMotionEvent.getX(1) - paramMotionEvent.getX(0), paramMotionEvent.getY(1) - paramMotionEvent.getY(0)) / this.bj * this.bk);
        this.aX = (this.bl - u() / 2 - (this.bl - u() / 2 - this.bn) * (this.aZ / this.bk));
        this.aY = (this.bm - v() / 2 - (this.bm - v() / 2 - this.bo) * (this.aZ / this.bk));
        a(this.aZ);
        this.k.invalidate();
        continue;
      }
      if (paramMotionEvent.getPointerCount() != 1)
        continue;
      if (this.bF != null)
        this.bF.addMovement(paramMotionEvent);
      f1 = Math.abs(paramMotionEvent.getX() - this.bp);
      f2 = Math.abs(paramMotionEvent.getY() - this.aW);
      if ((f1 > org.vidogram.messenger.a.a(3.0F)) || (f2 > org.vidogram.messenger.a.a(3.0F)))
        this.bD = true;
      if ((!(this.b instanceof b)) && (this.aw == 0) && (this.bB) && (!this.aV) && (this.aZ == 1.0F) && (f2 >= org.vidogram.messenger.a.a(30.0F)) && (f2 / 2.0F > f1))
      {
        this.aV = true;
        this.by = false;
        this.aW = paramMotionEvent.getY();
        if ((this.h) && (this.O))
          b(false, true);
        while (true)
        {
          return true;
          if (this.y.getVisibility() != 0)
            continue;
          b(false, true);
          b(false);
        }
      }
      if (this.aV)
      {
        this.aY = (paramMotionEvent.getY() - this.aW);
        this.k.invalidate();
        continue;
      }
      if ((!this.bA) && (this.be == 0L))
      {
        f2 = this.bp - paramMotionEvent.getX();
        f1 = this.bq - paramMotionEvent.getY();
        if ((!this.by) && (this.aw == 0) && ((this.aZ != 1.0F) || (Math.abs(f1) + org.vidogram.messenger.a.a(12.0F) >= Math.abs(f2))) && (this.aZ == 1.0F))
          continue;
        if (!this.by)
        {
          this.by = true;
          this.bB = false;
          f1 = 0.0F;
          f2 = 0.0F;
        }
        this.bp = paramMotionEvent.getX();
        this.bq = paramMotionEvent.getY();
        a(this.aZ);
        if ((this.aX >= this.br) || ((this.aw == 0) && (this.az.l())))
        {
          f3 = f2;
          if (this.aX <= this.bs)
            break label1081;
          if (this.aw == 0)
          {
            f3 = f2;
            if (this.ax.l())
              break label1081;
          }
        }
        f3 = f2 / 3.0F;
        label1081: if ((this.bu == 0.0F) && (this.bt == 0.0F) && (this.aw == 0))
        {
          if (this.aY - f1 >= this.bt)
            break;
          this.aY = this.bt;
          f1 = f4;
        }
      }
    }
    while (true)
    {
      this.aX -= f3;
      if ((this.aZ != 1.0F) || (this.aw != 0))
        this.aY -= f1;
      this.k.invalidate();
      break;
      if (this.aY - f1 > this.bu)
      {
        this.aY = this.bu;
        f1 = f4;
        continue;
        if ((this.aY < this.bt) || (this.aY > this.bu))
        {
          f1 /= 3.0F;
          continue;
          this.bA = false;
          this.bp = paramMotionEvent.getX();
          this.bq = paramMotionEvent.getY();
          break;
          label1263: if ((paramMotionEvent.getActionMasked() != 3) && (paramMotionEvent.getActionMasked() != 1) && (paramMotionEvent.getActionMasked() != 6))
            break;
          if (this.aw == 1)
            this.G.a();
          if (this.bx)
          {
            this.bA = true;
            if (this.aZ < 1.0F)
            {
              a(1.0F);
              a(1.0F, 0.0F, 0.0F, true);
            }
            while (true)
            {
              this.bx = false;
              break;
              if (this.aZ > 3.0F)
              {
                f2 = this.bl - u() / 2 - (this.bl - u() / 2 - this.bn) * (3.0F / this.bk);
                f3 = this.bm - v() / 2 - (this.bm - v() / 2 - this.bo) * (3.0F / this.bk);
                a(3.0F);
                if (f2 < this.br)
                {
                  f1 = this.br;
                  label1458: if (f3 >= this.bt)
                    break label1505;
                  f2 = this.bt;
                }
                while (true)
                {
                  a(3.0F, f1, f2, true);
                  break;
                  f1 = f2;
                  if (f2 <= this.bs)
                    break label1458;
                  f1 = this.bs;
                  break label1458;
                  label1505: f2 = f3;
                  if (f3 <= this.bu)
                    continue;
                  f2 = this.bu;
                }
              }
              c(true);
            }
          }
          if (this.aV)
          {
            if (Math.abs(this.aW - paramMotionEvent.getY()) > v() / 6.0F)
              a(true, false);
            while (true)
            {
              this.aV = false;
              break;
              if (this.y.getVisibility() == 0)
              {
                b(true, true);
                b(true);
              }
              a(1.0F, 0.0F, 0.0F, false);
            }
          }
          if (!this.by)
            break;
          f3 = this.aX;
          f2 = this.aY;
          a(this.aZ);
          this.by = false;
          this.bB = true;
          f1 = f5;
          if (this.bF != null)
          {
            f1 = f5;
            if (this.aZ == 1.0F)
            {
              this.bF.computeCurrentVelocity(1000);
              f1 = this.bF.getXVelocity();
            }
          }
          if (this.aw == 0)
          {
            if (((this.aX < this.br - u() / 3) || (f1 < -org.vidogram.messenger.a.a(650.0F))) && (this.az.l()))
            {
              w();
              return true;
            }
            if (((this.aX > this.bs + u() / 3) || (f1 > org.vidogram.messenger.a.a(650.0F))) && (this.ax.l()))
            {
              x();
              return true;
            }
          }
          if (this.aX < this.br)
          {
            f1 = this.br;
            label1809: if (this.aY >= this.bt)
              break label1863;
            f2 = this.bt;
          }
          while (true)
          {
            a(this.aZ, f1, f2, false);
            break;
            f1 = f3;
            if (this.aX <= this.bs)
              break label1809;
            f1 = this.bs;
            break label1809;
            label1863: if (this.aY > this.bu)
            {
              f2 = this.bu;
              continue;
            }
          }
        }
      }
    }
  }

  private String b(int paramInt)
  {
    if (paramInt < 0)
      return null;
    Object localObject;
    if ((!this.bL.isEmpty()) || (!this.bJ.isEmpty()))
    {
      if (!this.bL.isEmpty())
      {
        if (paramInt >= this.bL.size())
          return null;
        localObject = (g.x)this.bL.get(paramInt);
        return ((g.x)localObject).c + "_" + ((g.x)localObject).d + ".jpg";
      }
      if (!this.bJ.isEmpty())
      {
        if (paramInt >= this.bJ.size())
          return null;
        return m.a(((u)this.bJ.get(paramInt)).a);
      }
    }
    else if (!this.bO.isEmpty())
    {
      if (paramInt >= this.bO.size())
        return null;
      localObject = this.bO.get(paramInt);
      if ((localObject instanceof MediaController.j))
      {
        localObject = (MediaController.j)localObject;
        if (((MediaController.j)localObject).m != null)
          return m.b(((MediaController.j)localObject).m);
        if ((((MediaController.j)localObject).h != 1) && (((MediaController.j)localObject).d != null) && (((MediaController.j)localObject).d.length() > 0))
        {
          File localFile = new File(((MediaController.j)localObject).d);
          if (localFile.exists())
            return localFile.getName();
          ((MediaController.j)localObject).d = "";
        }
        return Utilities.e(((MediaController.j)localObject).b) + "." + p.b(((MediaController.j)localObject).b, "jpg");
      }
      if ((localObject instanceof g.d))
      {
        localObject = (g.d)localObject;
        if (((g.d)localObject).p != null)
          return m.b(((g.d)localObject).p);
        if (((g.d)localObject).o != null)
          return m.b(m.a(((g.d)localObject).o.h, org.vidogram.messenger.a.f()));
        if (((g.d)localObject).i != null)
          return Utilities.e(((g.d)localObject).i) + "." + p.b(((g.d)localObject).i, "jpg");
      }
    }
    return (String)null;
  }

  private void b(int paramInt, boolean paramBoolean)
  {
    boolean bool3 = false;
    int i1;
    Object localObject1;
    Object localObject2;
    boolean bool1;
    if (this.aE[paramInt] != null)
    {
      int i2 = this.aA;
      if (paramInt == 1)
        i1 = i2 + 1;
      while (true)
      {
        localObject1 = null;
        if (this.aB != null)
        {
          u localu = (u)this.bJ.get(i1);
          if (!TextUtils.isEmpty(localu.a.A))
          {
            localObject2 = new File(localu.a.A);
            localObject1 = localObject2;
            if (!((File)localObject2).exists())
              localObject1 = null;
          }
          localObject2 = localObject1;
          if (localObject1 == null)
            localObject2 = m.b(localu.a);
          bool1 = localu.I();
          localObject1 = localObject2;
          if ((localObject1 == null) || (!((File)localObject1).exists()))
            break label615;
          if (bool1)
          {
            this.A[paramInt].a(3, paramBoolean);
            label156: if (paramInt == 0)
            {
              if (this.bO.isEmpty())
              {
                paramBoolean = bool3;
                if (this.aE[0] != null)
                {
                  paramBoolean = bool3;
                  if (!bool1)
                  {
                    paramBoolean = bool3;
                    if (f.a(this.A[0]) == 0);
                  }
                }
              }
              else
              {
                paramBoolean = true;
              }
              this.bv = paramBoolean;
            }
            return;
            i1 = i2;
            if (paramInt != 2)
              continue;
            i1 = i2 - 1;
            continue;
          }
        }
        else if (this.aC != null)
        {
          localObject1 = (g.d)this.bO.get(i1);
          if ((((g.d)localObject1).d.equals("video")) || (u.g(((g.d)localObject1).p)))
          {
            if (((g.d)localObject1).p == null)
              break;
            localObject2 = m.a(((g.d)localObject1).p);
          }
        }
      }
    }
    while (true)
    {
      label292: boolean bool2 = true;
      while (true)
      {
        if (localObject2 != null)
        {
          localObject1 = localObject2;
          bool1 = bool2;
          if (((File)localObject2).exists())
            break;
        }
        localObject1 = new File(m.a().b(4), this.aE[paramInt]);
        bool1 = bool2;
        break;
        if (((g.d)localObject1).i == null)
          break label757;
        localObject2 = new File(m.a().b(4), Utilities.e(((g.d)localObject1).i) + "." + p.b(((g.d)localObject1).i, "mp4"));
        break label292;
        if (((g.d)localObject1).p != null)
        {
          localObject2 = new File(m.a().b(3), this.aE[paramInt]);
          bool2 = false;
          continue;
        }
        if (((g.d)localObject1).o != null)
        {
          localObject2 = new File(m.a().b(0), this.aE[paramInt]);
          bool2 = false;
          continue;
          if (this.aD != null)
          {
            localObject1 = (g.x)this.bL.get(i1);
            if (this.aI != 0);
            for (bool1 = true; ; bool1 = false)
            {
              localObject1 = m.a((org.vidogram.tgnet.f)localObject1, bool1);
              bool1 = false;
              break;
            }
          }
          if (this.aG != null)
          {
            localObject1 = new File(m.a().b(3), this.aE[paramInt]);
            if (!((File)localObject1).exists())
            {
              localObject1 = new File(m.a().b(4), this.aE[paramInt]);
              bool1 = false;
              break;
              this.A[paramInt].a(-1, paramBoolean);
              break label156;
              label615: if (bool1)
                if (!m.a().a(this.aE[paramInt]))
                  this.A[paramInt].a(2, false);
              while (true)
              {
                localObject2 = p.a().a(this.aE[paramInt]);
                localObject1 = localObject2;
                if (localObject2 == null)
                  localObject1 = Float.valueOf(0.0F);
                this.A[paramInt].a(((Float)localObject1).floatValue(), false);
                break;
                this.A[paramInt].a(1, false);
                continue;
                this.A[paramInt].a(0, paramBoolean);
              }
              this.A[paramInt].a(-1, paramBoolean);
              return;
            }
            bool1 = false;
            break;
          }
          localObject1 = null;
          bool1 = false;
          break;
        }
        localObject2 = null;
        bool2 = false;
      }
      label757: localObject2 = null;
    }
  }

  private void b(boolean paramBoolean)
  {
    float f2 = 1.0F;
    AnimatorSet localAnimatorSet = new AnimatorSet();
    ArrayList localArrayList = new ArrayList();
    Object localObject = this.y;
    float f1;
    if (paramBoolean)
    {
      f1 = 1.0F;
      localArrayList.add(ObjectAnimator.ofFloat(localObject, "alpha", new float[] { f1 }));
      if (this.Q)
      {
        localObject = this.K;
        if (!paramBoolean)
          break label160;
        f1 = 1.0F;
        label72: localArrayList.add(ObjectAnimator.ofFloat(localObject, "alpha", new float[] { f1 }));
      }
      if (this.P == 0)
      {
        localObject = this.x;
        if (!paramBoolean)
          break label165;
        f1 = f2;
      }
    }
    while (true)
    {
      localArrayList.add(ObjectAnimator.ofFloat(localObject, "alpha", new float[] { f1 }));
      localAnimatorSet.playTogether(localArrayList);
      localAnimatorSet.setDuration(200L);
      localAnimatorSet.start();
      return;
      f1 = 0.0F;
      break;
      label160: f1 = 0.0F;
      break label72;
      label165: f1 = 0.0F;
    }
  }

  private void b(boolean paramBoolean1, boolean paramBoolean2)
  {
    float f1 = 1.0F;
    if (paramBoolean1)
    {
      this.g.setVisibility(0);
      if (this.O)
      {
        this.n.setVisibility(0);
        if (this.K.getTag() != null)
          this.K.setVisibility(0);
      }
    }
    this.h = paramBoolean1;
    this.g.setEnabled(paramBoolean1);
    this.n.setEnabled(paramBoolean1);
    float f2;
    if (paramBoolean2)
    {
      localObject1 = new ArrayList();
      Object localObject2 = this.g;
      if (paramBoolean1)
      {
        f2 = 1.0F;
        ((ArrayList)localObject1).add(ObjectAnimator.ofFloat(localObject2, "alpha", new float[] { f2 }));
        localObject2 = this.n;
        if (!paramBoolean1)
          break label256;
        f2 = 1.0F;
        label129: ((ArrayList)localObject1).add(ObjectAnimator.ofFloat(localObject2, "alpha", new float[] { f2 }));
        if (this.K.getTag() != null)
        {
          localObject2 = this.K;
          if (!paramBoolean1)
            break label262;
        }
      }
      while (true)
      {
        ((ArrayList)localObject1).add(ObjectAnimator.ofFloat(localObject2, "alpha", new float[] { f1 }));
        this.F = new AnimatorSet();
        this.F.playTogether((Collection)localObject1);
        if (!paramBoolean1)
          this.F.addListener(new b()
          {
            public void onAnimationEnd(Animator paramAnimator)
            {
              if ((am.an(am.this) != null) && (am.an(am.this).equals(paramAnimator)))
              {
                am.O(am.this).setVisibility(8);
                if (am.ao(am.this))
                {
                  am.ap(am.this).setVisibility(8);
                  if (am.al(am.this).getTag() != null)
                    am.al(am.this).setVisibility(4);
                }
                am.d(am.this, null);
              }
            }
          });
        this.F.setDuration(200L);
        this.F.start();
        return;
        f2 = 0.0F;
        break;
        label256: f2 = 0.0F;
        break label129;
        label262: f1 = 0.0F;
      }
    }
    Object localObject1 = this.g;
    if (paramBoolean1)
    {
      f2 = 1.0F;
      label280: ((org.vidogram.ui.a.a)localObject1).setAlpha(f2);
      localObject1 = this.n;
      if (!paramBoolean1)
        break label387;
      f2 = 1.0F;
      label300: ((FrameLayout)localObject1).setAlpha(f2);
      if (this.K.getTag() != null)
      {
        localObject1 = this.K;
        if (!paramBoolean1)
          break label393;
      }
    }
    while (true)
    {
      ((TextView)localObject1).setAlpha(f1);
      if (paramBoolean1)
        break;
      this.g.setVisibility(8);
      if (!this.O)
        break;
      this.n.setVisibility(8);
      if (this.K.getTag() == null)
        break;
      this.K.setVisibility(4);
      return;
      f2 = 0.0F;
      break label280;
      label387: f2 = 0.0F;
      break label300;
      label393: f1 = 0.0F;
    }
  }

  private void c(int paramInt)
  {
    if ((paramInt < 6) && (this.k != null))
    {
      this.k.invalidate();
      org.vidogram.messenger.a.a(new Runnable(paramInt)
      {
        public void run()
        {
          am.g(am.this, this.a + 1);
        }
      }
      , 100L);
    }
  }

  private void c(boolean paramBoolean)
  {
    float f1 = this.aX;
    float f2 = this.aY;
    a(this.aZ);
    if (this.aX < this.br)
    {
      f1 = this.br;
      if (this.aY >= this.bt)
        break label84;
      f2 = this.bt;
    }
    while (true)
    {
      a(this.aZ, f1, f2, paramBoolean);
      return;
      if (this.aX <= this.bs)
        break;
      f1 = this.bs;
      break;
      label84: if (this.aY <= this.bu)
        continue;
      f2 = this.bu;
    }
  }

  private int d(int paramInt)
  {
    int i2 = this.k.getWidth();
    int i1 = i2;
    if (paramInt != 0)
    {
      i1 = i2;
      if (paramInt != 3)
        i1 = i2 - org.vidogram.messenger.a.a(28.0F);
    }
    return i1;
  }

  private void d(boolean paramBoolean)
  {
    Intent localIntent = null;
    if (((this.aB == null) && (this.aC == null)) || (this.aE[0] == null))
      return;
    File localFile;
    if (this.aB != null)
    {
      if ((this.aB.a.A == null) || (this.aB.a.A.length() == 0))
        break label505;
      localFile = new File(this.aB.a.A);
      localObject = localFile;
      if (localFile.exists());
    }
    label505: for (Object localObject = null; ; localObject = null)
    {
      if (localObject == null)
      {
        localFile = m.b(this.aB.a);
        localObject = localFile;
        if (!localFile.exists())
          localObject = localIntent;
      }
      while (true)
      {
        if (localObject == null)
        {
          if (!paramBoolean)
            break;
          if (this.aB != null)
          {
            if (!m.a().a(this.aE[0]))
            {
              m.a().a(this.aB.A(), true, false);
              return;
              localObject = localIntent;
              if (this.aC == null)
                continue;
              if (this.aC.p != null)
              {
                localFile = m.a(this.aC.p);
                localObject = localIntent;
                if (!localFile.exists())
                  continue;
                localObject = localFile;
                continue;
              }
              localFile = new File(m.a().b(4), Utilities.e(this.aC.i) + "." + p.b(this.aC.i, "mp4"));
              localObject = localIntent;
              if (!localFile.exists())
                continue;
              localObject = localFile;
              continue;
            }
            m.a().a(this.aB.A());
            return;
          }
          if (this.aC == null)
            break;
          if (this.aC.p != null)
          {
            if (!m.a().a(this.aE[0]))
            {
              m.a().a(this.aC.p, true, false);
              return;
            }
            m.a().a(this.aC.p);
            return;
          }
          if (!p.a().f(this.aC.i))
          {
            p.a().a(this.aC.i, "mp4");
            return;
          }
          p.a().g(this.aC.i);
          return;
        }
        if (Build.VERSION.SDK_INT >= 16)
        {
          a((File)localObject, true);
          return;
        }
        localIntent = new Intent("android.intent.action.VIEW");
        if (Build.VERSION.SDK_INT >= 24)
        {
          localIntent.setFlags(1);
          localIntent.setDataAndType(FileProvider.a(this.e, "org.vidogram.messenger.beta.provider", (File)localObject), "video/mp4");
        }
        while (true)
        {
          this.e.startActivityForResult(localIntent, 500);
          return;
          localIntent.setDataAndType(Uri.fromFile((File)localObject), "video/mp4");
        }
      }
    }
  }

  private int e(int paramInt)
  {
    int i2 = org.vidogram.messenger.a.c.y;
    int i1 = i2;
    if (paramInt == 0)
    {
      i1 = i2;
      if (Build.VERSION.SDK_INT >= 21)
        i1 = i2 + org.vidogram.messenger.a.a;
    }
    if (paramInt == 1)
      i2 = i1 - org.vidogram.messenger.a.a(76.0F);
    do
    {
      return i2;
      if (paramInt == 2)
        return i1 - org.vidogram.messenger.a.a(154.0F);
      i2 = i1;
    }
    while (paramInt != 3);
    return i1 - (org.vidogram.messenger.a.a(48.0F) + org.vidogram.ui.a.a.getCurrentActionBarHeight());
  }

  private void j()
  {
    File localFile = null;
    boolean bool2 = false;
    if ((this.e == null) || (!this.S))
      return;
    Intent localIntent;
    label77: Object localObject;
    while (true)
    {
      try
      {
        if (this.aB != null)
        {
          bool1 = this.aB.I();
          localFile = m.b(this.aB.a);
          if (!localFile.exists())
            break label170;
          localIntent = new Intent("android.intent.action.SEND");
          if (!bool1)
            break;
          localIntent.setType("video/mp4");
          localIntent.putExtra("android.intent.extra.STREAM", Uri.fromFile(localFile));
          this.e.startActivityForResult(Intent.createChooser(localIntent, r.a("ShareFile", 2131231834)), 500);
          return;
        }
      }
      catch (Exception localException)
      {
        org.vidogram.messenger.n.a("tmessages", localException);
        return;
      }
      bool1 = bool2;
      if (this.aD == null)
        continue;
      localObject = this.aD;
      if (this.aI == 0)
        break label231;
    }
    label170: label231: for (boolean bool1 = true; ; bool1 = false)
    {
      localObject = m.a((org.vidogram.tgnet.f)localObject, bool1);
      bool1 = bool2;
      break;
      localIntent.setType("image/jpeg");
      break label77;
      localObject = new AlertDialog.Builder(this.e);
      ((AlertDialog.Builder)localObject).setTitle(r.a("AppName", 2131230856));
      ((AlertDialog.Builder)localObject).setPositiveButton(r.a("OK", 2131231604), null);
      ((AlertDialog.Builder)localObject).setMessage(r.a("PleaseDownload", 2131231687));
      a((AlertDialog.Builder)localObject);
      return;
    }
  }

  private void k()
  {
    float f5 = this.ay.i();
    float f1 = u();
    float f3 = this.ay.j();
    float f2 = v();
    float f4 = Math.min(f2 / f3, f1 / f5);
    f5 = (int)(f5 * f4);
    f3 = (int)(f3 * f4);
    this.aZ = Math.max(f1 / f5, f2 / f3);
    a(this.aZ);
  }

  private void l()
  {
    if ((this.bf != null) || (this.bg != null))
      return;
    this.B.setVisibility(8);
    this.C.setVisibility(8);
    this.D.setVisibility(8);
    this.x.setVisibility(8);
    this.E.setVisibility(0);
    this.y.setVisibility(8);
    FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)this.N.getLayoutParams();
    localLayoutParams.bottomMargin = 0;
    this.N.setLayoutParams(localLayoutParams);
    localLayoutParams = (FrameLayout.LayoutParams)this.al.getLayoutParams();
    localLayoutParams.bottomMargin = 0;
    this.al.setLayoutParams(localLayoutParams);
    this.K.setVisibility(4);
    this.N.e();
    this.av = this.g.getTitle();
    this.g.setTitle(r.a("PhotoCaption", 2131231672));
  }

  private void m()
  {
    String str;
    if (this.W == null)
      str = "00:00 / 00:00";
    while (true)
    {
      if (!TextUtils.equals(this.Z.getText(), str))
        this.Z.setText(str);
      return;
      long l1 = this.W.g() / 1000L;
      long l2 = this.W.h();
      if (this.t)
      {
        if (l2 < 30000L)
          break label172;
        if (this.r.getVisibility() == 0)
          this.r.setVisibility(8);
      }
      while (true)
      {
        l2 /= 1000L;
        if ((l2 == -1L) || (l1 == -1L))
          break label193;
        str = String.format("%02d:%02d / %02d:%02d", new Object[] { Long.valueOf(l1 / 60L), Long.valueOf(l1 % 60L), Long.valueOf(l2 / 60L), Long.valueOf(l2 % 60L) });
        break;
        label172: if (this.r.getVisibility() == 0)
          continue;
        this.r.setVisibility(0);
      }
      label193: str = "00:00 / 00:00";
    }
  }

  private void n()
  {
    if (this.W != null)
    {
      this.W.e();
      this.W = null;
    }
    try
    {
      this.e.getWindow().clearFlags(128);
      if (this.U != null)
      {
        this.k.removeView(this.U);
        this.U = null;
      }
      if (this.V != null)
        this.V = null;
      if (this.ag)
      {
        this.ag = false;
        this.Y.setImageResource(2130837924);
        org.vidogram.messenger.a.b(this.ah);
      }
      if (this.X != null)
      {
        this.X.setVisibility(8);
        this.p.setVisibility(0);
        this.o.setVisibility(0);
        if (this.S)
        {
          this.u.setVisibility(0);
          this.q.a(10);
        }
      }
      return;
    }
    catch (Exception localException)
    {
      while (true)
        org.vidogram.messenger.n.a("tmessages", localException);
    }
  }

  private void o()
  {
    Bitmap localBitmap;
    Object localObject1;
    if (this.aw == 1)
    {
      localBitmap = this.G.getBitmap();
      localObject1 = null;
    }
    while (true)
    {
      g.az localaz;
      Object localObject2;
      label153: float f1;
      float f2;
      if (localBitmap != null)
      {
        localaz = p.a(localBitmap, org.vidogram.messenger.a.f(), org.vidogram.messenger.a.f(), 80, false, 101, 101);
        if (localaz != null)
        {
          localObject2 = this.bO.get(this.aA);
          if (!(localObject2 instanceof MediaController.i))
            break label431;
          localObject2 = (MediaController.i)localObject2;
          ((MediaController.i)localObject2).g = m.a(localaz, true).toString();
          localaz = p.a(localBitmap, org.vidogram.messenger.a.a(120.0F), org.vidogram.messenger.a.a(120.0F), 70, false, 101, 101);
          if (localaz != null)
            ((MediaController.i)localObject2).f = m.a(localaz, true).toString();
          if (localObject1 != null)
            ((MediaController.i)localObject2).j.addAll((Collection)localObject1);
          if ((this.P == 0) && (this.b != null))
          {
            this.b.a_(this.aA);
            if (!this.b.b(this.aA))
            {
              this.b.c(this.aA);
              this.x.a(this.b.b(this.aA), true);
              p();
            }
          }
          if (this.aw == 1)
          {
            f1 = this.G.getRectSizeX() / u();
            f2 = this.G.getRectSizeY() / v();
            if (f1 <= f2)
              break label525;
          }
        }
      }
      while (true)
      {
        this.aZ = f1;
        this.aX = (this.G.getRectX() + this.G.getRectSizeX() / 2.0F - u() / 2);
        this.aY = (this.G.getRectY() + this.G.getRectSizeY() / 2.0F - v() / 2);
        this.bC = true;
        this.ay.a(null);
        this.ay.a(0, true);
        this.ay.a(localBitmap);
        this.ay.a(this.k);
        return;
        if (this.aw == 2)
        {
          localBitmap = this.H.getBitmap();
          localObject1 = null;
          break;
        }
        if (this.aw != 3)
          break label530;
        localBitmap = this.I.getBitmap();
        localObject1 = this.I.getMasks();
        break;
        label431: if (!(localObject2 instanceof MediaController.j))
          break label153;
        localObject2 = (MediaController.j)localObject2;
        ((MediaController.j)localObject2).k = m.a(localaz, true).toString();
        localaz = p.a(localBitmap, org.vidogram.messenger.a.a(120.0F), org.vidogram.messenger.a.a(120.0F), 70, false, 101, 101);
        if (localaz != null)
          ((MediaController.j)localObject2).j = m.a(localaz, true).toString();
        if (localObject1 == null)
          break label153;
        ((MediaController.j)localObject2).n.addAll((Collection)localObject1);
        break label153;
        label525: f1 = f2;
      }
      label530: localObject1 = null;
      localBitmap = null;
    }
  }

  private void p()
  {
    if (this.b == null)
      return;
    this.y.a(this.b.A(), false);
  }

  private void q()
  {
    if (this.ap == 0)
    {
      a(this.ay, this.aA);
      a(this.az, this.aA + 1);
      a(this.ax, this.aA - 1);
    }
  }

  private boolean r()
  {
    int i1 = 0;
    if ((this.ap != 0) && (Math.abs(this.aq - System.currentTimeMillis()) >= 500L))
    {
      if (this.ar != null)
      {
        this.ar.run();
        this.ar = null;
      }
      this.ap = 0;
    }
    if (this.ap != 0)
      i1 = 1;
    return i1;
  }

  private int s()
  {
    if ((this.aw != 0) && (this.aw != 3))
      return org.vidogram.messenger.a.a(14.0F);
    return 0;
  }

  private int t()
  {
    int i3 = 0;
    int i2 = 0;
    int i1 = 0;
    if (this.aw == 3)
    {
      i2 = org.vidogram.ui.a.a.getCurrentActionBarHeight();
      if (Build.VERSION.SDK_INT >= 21)
        i1 = org.vidogram.messenger.a.a;
      i1 += i2;
    }
    do
    {
      return i1;
      i1 = i3;
    }
    while (this.aw == 0);
    i3 = org.vidogram.messenger.a.a(14.0F);
    i1 = i2;
    if (Build.VERSION.SDK_INT >= 21)
      i1 = org.vidogram.messenger.a.a;
    return i1 + i3;
  }

  private int u()
  {
    return d(this.aw);
  }

  private int v()
  {
    return e(this.aw);
  }

  private void w()
  {
    float f1 = 0.0F;
    if (this.aZ != 1.0F)
      f1 = (u() - this.ay.p()) / 2 * this.aZ;
    this.bE = 1;
    a(this.aZ, this.br - u() - f1 - org.vidogram.messenger.a.a(30.0F) / 2, this.aY, false);
  }

  private void x()
  {
    float f1 = 0.0F;
    if (this.aZ != 1.0F)
      f1 = (u() - this.ay.p()) / 2 * this.aZ;
    this.bE = 2;
    a(this.aZ, f1 + (this.bs + u()) + org.vidogram.messenger.a.a(30.0F) / 2, this.aY, false);
  }

  public void a(int paramInt, Object[] paramArrayOfObject)
  {
    if (paramInt == y.aA)
    {
      paramArrayOfObject = (String)paramArrayOfObject[0];
      paramInt = 0;
      if (paramInt < 3)
      {
        if ((this.aE[paramInt] == null) || (!this.aE[paramInt].equals(paramArrayOfObject)))
          break label61;
        this.A[paramInt].a(1.0F, true);
        b(paramInt, true);
      }
    }
    label61: label204: label596: label981: label1265: label1790: 
    do
    {
      int i1;
      do
      {
        Object localObject1;
        Object localObject2;
        int i2;
        int i3;
        long l1;
        do
        {
          do
          {
            do
            {
              while (true)
              {
                return;
                paramInt += 1;
                break;
                if (paramInt == y.az)
                {
                  paramArrayOfObject = (String)paramArrayOfObject[0];
                  paramInt = 0;
                  while (true)
                  {
                    if (paramInt >= 3)
                      break label204;
                    if ((this.aE[paramInt] != null) && (this.aE[paramInt].equals(paramArrayOfObject)))
                    {
                      this.A[paramInt].a(1.0F, true);
                      b(paramInt, true);
                      if ((Build.VERSION.SDK_INT < 16) || (paramInt != 0) || (((this.aB == null) || (!this.aB.I())) && ((this.aC == null) || ((!this.aC.d.equals("video")) && (!u.g(this.aC.p))))))
                        break;
                      d(false);
                      return;
                    }
                    paramInt += 1;
                  }
                  continue;
                }
                if (paramInt == y.ay)
                {
                  localObject1 = (String)paramArrayOfObject[0];
                  paramInt = 0;
                  while (paramInt < 3)
                  {
                    if ((this.aE[paramInt] != null) && (this.aE[paramInt].equals(localObject1)))
                    {
                      localObject2 = (Float)paramArrayOfObject[1];
                      this.A[paramInt].a(((Float)localObject2).floatValue(), true);
                    }
                    paramInt += 1;
                  }
                  continue;
                }
                if (paramInt != y.u)
                  break label721;
                paramInt = ((Integer)paramArrayOfObject[4]).intValue();
                i1 = ((Integer)paramArrayOfObject[0]).intValue();
                if ((this.aI != i1) || (this.a != paramInt))
                  continue;
                boolean bool = ((Boolean)paramArrayOfObject[3]).booleanValue();
                paramArrayOfObject = (ArrayList)paramArrayOfObject[5];
                if (paramArrayOfObject.isEmpty())
                  continue;
                this.bL.clear();
                this.bN.clear();
                this.bM.clear();
                i2 = 0;
                paramInt = -1;
                while (true)
                {
                  if (i2 >= paramArrayOfObject.size())
                    break label596;
                  localObject1 = (g.ay)paramArrayOfObject.get(i2);
                  i1 = paramInt;
                  if (localObject1 != null)
                  {
                    i1 = paramInt;
                    if (!(localObject1 instanceof g.rr))
                    {
                      if (((g.ay)localObject1).h == null)
                      {
                        i2 += 1;
                        continue;
                      }
                      localObject2 = m.a(((g.ay)localObject1).h, 640);
                      i1 = paramInt;
                      if (localObject2 != null)
                      {
                        i1 = paramInt;
                        if (paramInt != -1)
                          break;
                        i1 = paramInt;
                        if (this.aD == null)
                          break;
                        i3 = 0;
                      }
                    }
                  }
                }
                while (true)
                {
                  i1 = paramInt;
                  if (i3 < ((g.ay)localObject1).h.size())
                  {
                    g.az localaz = (g.az)((g.ay)localObject1).h.get(i3);
                    if ((localaz.c.d == this.aD.d) && (localaz.c.c == this.aD.c))
                      i1 = this.bL.size();
                  }
                  else
                  {
                    this.bL.add(((g.az)localObject2).c);
                    this.bN.add(Integer.valueOf(((g.az)localObject2).f));
                    this.bM.add(localObject1);
                    paramInt = i1;
                    break;
                  }
                  i3 += 1;
                }
                if (!this.bM.isEmpty())
                {
                  this.q.b(6);
                  this.aO = false;
                  this.aA = -1;
                  if (paramInt == -1)
                    break label673;
                  a(paramInt, true);
                }
                while (true)
                {
                  if (!bool)
                    break label719;
                  org.vidogram.messenger.v.a().a(this.aI, 0, 80, 0L, false, this.a);
                  return;
                  this.q.a(6);
                  break;
                  this.bM.add(0, new g.rr());
                  this.bL.add(0, this.aD);
                  this.bN.add(0, Integer.valueOf(0));
                  a(0, true);
                }
              }
              if (paramInt != y.q)
                break label981;
              l1 = ((Long)paramArrayOfObject[0]).longValue();
            }
            while ((l1 != this.aJ) && (l1 != this.aK));
            if (l1 == this.aJ)
              this.aL = ((Integer)paramArrayOfObject[1]).intValue();
            while ((this.aO) && (this.aN))
            {
              this.aN = false;
              this.aP = true;
              org.vidogram.messenger.d.f.a(this.aJ, 0, 80, 0, 0, true, this.a);
              return;
              if (l1 != this.aK)
                continue;
              this.aM = ((Integer)paramArrayOfObject[1]).intValue();
            }
          }
          while (this.bJ.isEmpty());
          if (this.aR)
          {
            this.g.setTitle(r.a("Of", 2131231605, new Object[] { Integer.valueOf(this.aA + 1), Integer.valueOf(this.aL + this.aM) }));
            return;
          }
          this.g.setTitle(r.a("Of", 2131231605, new Object[] { Integer.valueOf(this.aL + this.aM - this.bJ.size() + this.aA + 1), Integer.valueOf(this.aL + this.aM) }));
          return;
          if (paramInt != y.p)
            break label2015;
          l1 = ((Long)paramArrayOfObject[0]).longValue();
          paramInt = ((Integer)paramArrayOfObject[3]).intValue();
        }
        while (((l1 != this.aJ) && (l1 != this.aK)) || (paramInt != this.a));
        this.aP = false;
        if (l1 == this.aJ)
          i1 = 0;
        while (true)
        {
          localObject1 = (ArrayList)paramArrayOfObject[2];
          this.aQ[i1] = ((Boolean)paramArrayOfObject[5]).booleanValue();
          if (!this.aO)
            break;
          if ((((ArrayList)localObject1).isEmpty()) && ((i1 != 0) || (this.aK == 0L)))
          {
            this.aO = false;
            return;
            i1 = 1;
            continue;
          }
          paramArrayOfObject = (u)this.bJ.get(this.aA);
          paramInt = -1;
          i2 = 0;
          int i5 = 0;
          if (i5 < ((ArrayList)localObject1).size())
          {
            localObject2 = (u)((ArrayList)localObject1).get(i5);
            i3 = i2;
            int i4 = paramInt;
            if (!this.bI[i1].containsKey(Integer.valueOf(((u)localObject2).q())))
            {
              this.bI[i1].put(Integer.valueOf(((u)localObject2).q()), localObject2);
              if (!this.aR)
                break label1265;
              this.bH.add(localObject2);
              if (((u)localObject2).q() == paramArrayOfObject.q())
                paramInt = i2;
              i3 = i2 + 1;
              i4 = paramInt;
            }
            while (true)
            {
              i5 += 1;
              i2 = i3;
              paramInt = i4;
              break;
              i2 += 1;
              this.bH.add(0, localObject2);
              i3 = i2;
              i4 = paramInt;
              if (((u)localObject2).q() != paramArrayOfObject.q())
                continue;
              i4 = ((ArrayList)localObject1).size() - i2;
              i3 = i2;
            }
          }
          if ((i2 == 0) && ((i1 != 0) || (this.aK == 0L)))
          {
            this.aL = this.bJ.size();
            this.aM = 0;
          }
          if (paramInt != -1)
          {
            this.bJ.clear();
            this.bJ.addAll(this.bH);
            i1 = 0;
            while (i1 < 2)
            {
              this.bK[i1].clear();
              this.bK[i1].putAll(this.bI[i1]);
              this.bI[i1].clear();
              i1 += 1;
            }
            this.bH.clear();
            this.aO = false;
            this.aA = -1;
            i1 = paramInt;
            if (paramInt >= this.bJ.size())
              i1 = this.bJ.size() - 1;
            a(i1, true);
            return;
          }
          if (this.aR)
            if (this.bH.isEmpty())
            {
              i3 = 0;
              i2 = i1;
              paramInt = i3;
              if (i1 == 0)
              {
                i2 = i1;
                paramInt = i3;
                if (this.aQ[i1] != 0)
                {
                  i2 = i1;
                  paramInt = i3;
                  if (this.aK != 0L)
                  {
                    i1 = 1;
                    i2 = i1;
                    paramInt = i3;
                    if (!this.bH.isEmpty())
                    {
                      i2 = i1;
                      paramInt = i3;
                      if (((u)this.bH.get(this.bH.size() - 1)).u() != this.aK)
                      {
                        paramInt = 0;
                        i2 = i1;
                      }
                    }
                  }
                }
              }
              if (this.aQ[i2] != 0)
                break label1769;
              this.aP = true;
              if (!this.aR)
                break label1799;
              if (i2 != 0)
                break label1790;
              l1 = this.aJ;
            }
          while (true)
          {
            org.vidogram.messenger.d.f.a(l1, 0, 80, paramInt, 0, true, this.a);
            return;
            i3 = ((u)this.bH.get(this.bH.size() - 1)).q();
            break label1489;
            if (this.bH.isEmpty());
            for (i3 = 0; ; i3 = ((u)this.bH.get(0)).q())
            {
              i2 = i1;
              paramInt = i3;
              if (i1 != 0)
                break label1588;
              i2 = i1;
              paramInt = i3;
              if (this.aQ[i1] == 0)
                break label1588;
              i2 = i1;
              paramInt = i3;
              if (this.aK == 0L)
                break label1588;
              i1 = 1;
              i2 = i1;
              paramInt = i3;
              if (this.bH.isEmpty())
                break label1588;
              i2 = i1;
              paramInt = i3;
              if (((u)this.bH.get(0)).u() == this.aK)
                break label1588;
              paramInt = 0;
              i2 = i1;
              break label1588;
              break;
            }
            l1 = this.aK;
          }
          if (i2 == 0)
            l1 = this.aJ;
          while (true)
          {
            org.vidogram.messenger.d.f.a(l1, 0, 80, paramInt, 0, true, this.a);
            return;
            l1 = this.aK;
          }
        }
        paramInt = 0;
        paramArrayOfObject = ((ArrayList)localObject1).iterator();
        if (paramArrayOfObject.hasNext())
        {
          localObject1 = (u)paramArrayOfObject.next();
          i2 = paramInt;
          if (!this.bK[i1].containsKey(Integer.valueOf(((u)localObject1).q())))
          {
            i2 = paramInt + 1;
            if (!this.aR)
              break label1934;
            this.bJ.add(localObject1);
          }
          while (true)
          {
            this.bK[i1].put(Integer.valueOf(((u)localObject1).q()), localObject1);
            paramInt = i2;
            break;
            this.bJ.add(0, localObject1);
          }
        }
        if (!this.aR)
          break label1975;
      }
      while (paramInt != 0);
      this.aL = this.bJ.size();
      this.aM = 0;
      return;
      if (paramInt != 0)
      {
        i1 = this.aA;
        this.aA = -1;
        a(i1 + paramInt, true);
        return;
      }
      this.aL = this.bJ.size();
      this.aM = 0;
      return;
    }
    while ((paramInt != y.at) || (this.K == null));
    label673: label719: label721: label1489: label1769: this.K.invalidate();
    label1588: label1975: label2015: return;
  }

  public void a(Activity paramActivity)
  {
    if (this.e == paramActivity)
      return;
    this.e = paramActivity;
    this.f = new ContextThemeWrapper(this.e, 2131427463);
    if (i == null)
    {
      i = new Drawable[4];
      i[0] = this.e.getResources().getDrawable(2130837689);
      i[1] = this.e.getResources().getDrawable(2130837678);
      i[2] = this.e.getResources().getDrawable(2130837950);
      i[3] = this.e.getResources().getDrawable(2130838085);
    }
    this.bG = new Scroller(paramActivity);
    this.l = new FrameLayout(paramActivity)
    {
      public boolean dispatchKeyEventPreIme(KeyEvent paramKeyEvent)
      {
        if ((paramKeyEvent != null) && (paramKeyEvent.getKeyCode() == 4) && (paramKeyEvent.getAction() == 1))
        {
          if ((am.k(am.this).f()) || (am.k(am.this).h()))
          {
            am.d(am.this, false);
            return false;
          }
          am.a().a(true, false);
          return true;
        }
        return super.dispatchKeyEventPreIme(paramKeyEvent);
      }

      protected boolean drawChild(Canvas paramCanvas, View paramView, long paramLong)
      {
        boolean bool = super.drawChild(paramCanvas, paramView, paramLong);
        if ((Build.VERSION.SDK_INT >= 21) && (paramView == am.q(am.this)) && (am.r(am.this) != null))
        {
          paramView = (WindowInsets)am.r(am.this);
          float f1 = getMeasuredHeight();
          float f2 = getMeasuredWidth();
          int i = getMeasuredHeight();
          paramCanvas.drawRect(0.0F, f1, f2, paramView.getSystemWindowInsetBottom() + i, am.s(am.this));
        }
        return bool;
      }

      protected void onAttachedToWindow()
      {
        super.onAttachedToWindow();
        am.c(am.this, true);
      }

      protected void onDetachedFromWindow()
      {
        super.onDetachedFromWindow();
        am.c(am.this, false);
        am.a(am.this, false);
      }

      public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
      {
        return (am.h(am.this)) && (super.onInterceptTouchEvent(paramMotionEvent));
      }

      protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
      {
        am.q(am.this).layout(0, 0, am.q(am.this).getMeasuredWidth(), am.q(am.this).getMeasuredHeight());
        am.t(am.this).layout(0, 0, am.t(am.this).getMeasuredWidth(), am.t(am.this).getMeasuredHeight());
        am.a(am.this, true);
        if (paramBoolean)
        {
          if (!am.u(am.this))
          {
            am.a(am.this, 1.0F);
            am.b(am.this, 0.0F);
            am.c(am.this, 0.0F);
            am.d(am.this, am.v(am.this));
          }
          if (am.w(am.this) != null)
            am.w(am.this).post(new Runnable()
            {
              public void run()
              {
                FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)am.w(am.this).getLayoutParams();
                int i = ((WindowManager)ApplicationLoader.a.getSystemService("window")).getDefaultDisplay().getRotation();
                float f;
                int j;
                if ((i == 3) || (i == 1))
                {
                  f = 58.0F;
                  j = org.vidogram.messenger.a.a(f);
                  if (Build.VERSION.SDK_INT < 21)
                    break label98;
                }
                label98: for (i = org.vidogram.messenger.a.a; ; i = 0)
                {
                  localLayoutParams.topMargin = (i + j);
                  am.w(am.this).setLayoutParams(localLayoutParams);
                  return;
                  f = 68.0F;
                  break;
                }
              }
            });
        }
        if (am.u(am.this))
        {
          am.x(am.this);
          am.b(am.this, false);
        }
      }

      protected void onMeasure(int paramInt1, int paramInt2)
      {
        int i = View.MeasureSpec.getSize(paramInt1);
        paramInt1 = View.MeasureSpec.getSize(paramInt2);
        Object localObject;
        if ((Build.VERSION.SDK_INT >= 21) && (am.r(am.this) != null))
        {
          localObject = (WindowInsets)am.r(am.this);
          paramInt2 = paramInt1;
          if (org.vidogram.messenger.a.d)
          {
            paramInt2 = paramInt1;
            if (paramInt1 > org.vidogram.messenger.a.c.y)
              paramInt2 = org.vidogram.messenger.a.c.y;
            paramInt2 += org.vidogram.messenger.a.a;
          }
          paramInt1 = paramInt2 - ((WindowInsets)localObject).getSystemWindowInsetBottom();
          paramInt2 = i - ((WindowInsets)localObject).getSystemWindowInsetRight();
        }
        while (true)
        {
          setMeasuredDimension(paramInt2, paramInt1);
          localObject = am.q(am.this).getLayoutParams();
          am.q(am.this).measure(View.MeasureSpec.makeMeasureSpec(((ViewGroup.LayoutParams)localObject).width, -2147483648), View.MeasureSpec.makeMeasureSpec(((ViewGroup.LayoutParams)localObject).height, -2147483648));
          am.t(am.this).measure(View.MeasureSpec.makeMeasureSpec(paramInt2, 1073741824), View.MeasureSpec.makeMeasureSpec(paramInt1, 1073741824));
          return;
          if (paramInt1 > org.vidogram.messenger.a.c.y)
          {
            paramInt1 = org.vidogram.messenger.a.c.y;
            paramInt2 = i;
            continue;
          }
          paramInt2 = i;
        }
      }

      public boolean onTouchEvent(MotionEvent paramMotionEvent)
      {
        return (am.h(am.this)) && (am.a(am.this, paramMotionEvent));
      }

      public ActionMode startActionModeForChild(View paramView, ActionMode.Callback paramCallback, int paramInt)
      {
        if (Build.VERSION.SDK_INT >= 23)
        {
          Object localObject = am.g(am.this).findViewById(16908290);
          if ((localObject instanceof ViewGroup))
            try
            {
              localObject = ((ViewGroup)localObject).startActionModeForChild(paramView, paramCallback, paramInt);
              return localObject;
            }
            catch (Throwable localThrowable)
            {
              org.vidogram.messenger.n.a("tmessages", localThrowable);
            }
        }
        return (ActionMode)super.startActionModeForChild(paramView, paramCallback, paramInt);
      }
    };
    this.l.setBackgroundDrawable(this.v);
    this.l.setClipChildren(true);
    this.l.setFocusable(false);
    this.m = new org.vidogram.ui.Components.l(paramActivity);
    this.m.setAnimationValues(this.ai);
    this.l.addView(this.m, org.vidogram.ui.Components.v.a(40, 40.0F));
    this.k = new c(paramActivity);
    this.k.setFocusable(false);
    this.l.addView(this.k, org.vidogram.ui.Components.v.b(-1, -1, 51));
    if (Build.VERSION.SDK_INT >= 21)
      this.k.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener()
      {
        @SuppressLint({"NewApi"})
        public WindowInsets onApplyWindowInsets(View paramView, WindowInsets paramWindowInsets)
        {
          am.a(am.this, paramWindowInsets);
          am.y(am.this).requestLayout();
          return paramWindowInsets.consumeSystemWindowInsets();
        }
      });
    this.j = new WindowManager.LayoutParams();
    this.j.height = -1;
    this.j.format = -3;
    this.j.width = -1;
    this.j.gravity = 51;
    this.j.type = 99;
    boolean bool;
    label383: Object localObject;
    float f1;
    if (Build.VERSION.SDK_INT >= 21)
    {
      this.j.flags = -2147417848;
      this.g = new org.vidogram.ui.a.a(paramActivity);
      this.g.setBackgroundColor(2130706432);
      paramActivity = this.g;
      if (Build.VERSION.SDK_INT < 21)
        break label2749;
      bool = true;
      paramActivity.setOccupyStatusBar(bool);
      this.g.setItemsBackgroundColor(1090519039);
      this.g.setBackButtonImage(2130837794);
      this.g.setTitle(r.a("Of", 2131231605, new Object[] { Integer.valueOf(1), Integer.valueOf(1) }));
      this.k.addView(this.g, org.vidogram.ui.Components.v.a(-1, -2.0F));
      this.g.setActionBarMenuOnItemClick(new a.a()
      {
        public void a(int paramInt)
        {
          boolean bool = true;
          int i = 1;
          if (paramInt == -1)
          {
            if ((am.z(am.this)) && ((am.k(am.this).f()) || (am.k(am.this).h())))
            {
              am.d(am.this, false);
              return;
            }
            am.this.a(true, false);
            return;
          }
          Object localObject;
          if (paramInt == 1)
          {
            if ((Build.VERSION.SDK_INT >= 23) && (am.g(am.this).checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0))
            {
              am.g(am.this).requestPermissions(new String[] { "android.permission.WRITE_EXTERNAL_STORAGE" }, 4);
              return;
            }
            if (am.A(am.this) != null)
              localObject = m.b(am.A(am.this).a);
          }
          while (true)
          {
            if ((localObject != null) && (((File)localObject).exists()))
            {
              localObject = ((File)localObject).toString();
              Activity localActivity = am.g(am.this);
              if ((am.A(am.this) != null) && (am.A(am.this).I()));
              for (paramInt = i; ; paramInt = 0)
              {
                MediaController.a((String)localObject, localActivity, paramInt, null, null);
                return;
                if (am.B(am.this) == null)
                  break label954;
                localObject = am.B(am.this);
                if (am.C(am.this) != 0);
                for (bool = true; ; bool = false)
                {
                  localObject = m.a((org.vidogram.tgnet.f)localObject, bool);
                  break;
                }
              }
            }
            localObject = new AlertDialog.Builder(am.g(am.this));
            ((AlertDialog.Builder)localObject).setTitle(r.a("AppName", 2131230856));
            ((AlertDialog.Builder)localObject).setPositiveButton(r.a("OK", 2131231604), null);
            ((AlertDialog.Builder)localObject).setMessage(r.a("PleaseDownload", 2131231687));
            am.this.a((AlertDialog.Builder)localObject);
            return;
            if (paramInt == 2)
            {
              if (am.D(am.this))
              {
                am.this.a(true, false);
                return;
              }
              if (am.E(am.this) == 0L)
                break;
              am.e(am.this, true);
              localObject = new Bundle();
              ((Bundle)localObject).putLong("dialog_id", am.E(am.this));
              localObject = new af((Bundle)localObject);
              if (am.F(am.this) != null)
                ((af)localObject).a(am.F(am.this).v());
              am.this.a(false, false);
              ((LaunchActivity)am.g(am.this)).a((g)localObject, false, true);
              return;
            }
            if (paramInt == 3)
              break;
            if (paramInt == 6)
            {
              if (am.g(am.this) == null)
                break;
              localObject = new AlertDialog.Builder(am.g(am.this));
              if ((am.A(am.this) != null) && (am.A(am.this).I()))
                ((AlertDialog.Builder)localObject).setMessage(r.a("AreYouSureDeleteVideo", 2131230880, new Object[0]));
              while (true)
              {
                ((AlertDialog.Builder)localObject).setTitle(r.a("AppName", 2131230856));
                ((AlertDialog.Builder)localObject).setPositiveButton(r.a("OK", 2131231604), new DialogInterface.OnClickListener()
                {
                  public void onClick(DialogInterface paramDialogInterface, int paramInt)
                  {
                    Object localObject1 = null;
                    Object localObject2;
                    ArrayList localArrayList;
                    if (!am.G(am.this).isEmpty())
                    {
                      if ((am.H(am.this) < 0) || (am.H(am.this) >= am.G(am.this).size()));
                      do
                      {
                        return;
                        localObject2 = (u)am.G(am.this).get(am.H(am.this));
                      }
                      while (!((u)localObject2).x());
                      am.this.a(false, false);
                      localArrayList = new ArrayList();
                      localArrayList.add(Integer.valueOf(((u)localObject2).q()));
                      if (((int)((u)localObject2).u() != 0) || (((u)localObject2).a.C == 0L))
                        break label749;
                      localObject1 = new ArrayList();
                      ((ArrayList)localObject1).add(Long.valueOf(((u)localObject2).a.C));
                    }
                    label749: for (paramDialogInterface = org.vidogram.messenger.v.a().c(Integer.valueOf((int)(((u)localObject2).u() >> 32))); ; paramDialogInterface = null)
                    {
                      org.vidogram.messenger.v.a().a(localArrayList, (ArrayList)localObject1, paramDialogInterface, ((u)localObject2).a.d.b);
                      return;
                      if ((am.I(am.this).isEmpty()) || (am.H(am.this) < 0) || (am.H(am.this) >= am.I(am.this).size()))
                        break;
                      paramDialogInterface = (g.ay)am.I(am.this).get(am.H(am.this));
                      localObject1 = (g.x)am.J(am.this).get(am.H(am.this));
                      if ((paramDialogInterface instanceof g.rr))
                        paramDialogInterface = null;
                      while (true)
                      {
                        if (am.K(am.this) != null)
                          if (paramDialogInterface != null)
                          {
                            localObject1 = paramDialogInterface.h.iterator();
                            while (((Iterator)localObject1).hasNext())
                            {
                              localObject2 = (g.az)((Iterator)localObject1).next();
                              if ((((g.az)localObject2).c.d != am.K(am.this).d) || (((g.az)localObject2).c.c != am.K(am.this).c))
                                continue;
                              paramInt = 1;
                            }
                          }
                        while (true)
                        {
                          if (paramInt != 0)
                          {
                            org.vidogram.messenger.v.a().a(null);
                            am.this.a(false, false);
                            return;
                            if ((((g.x)localObject1).d == am.K(am.this).d) && (((g.x)localObject1).c == am.K(am.this).c))
                            {
                              paramInt = 1;
                              continue;
                            }
                          }
                          else
                          {
                            if (paramDialogInterface == null)
                              break;
                            localObject1 = new g.ld();
                            ((g.ld)localObject1).b = paramDialogInterface.b;
                            ((g.ld)localObject1).c = paramDialogInterface.c;
                            org.vidogram.messenger.v.a().a((g.ak)localObject1);
                            w.a().a(am.C(am.this), paramDialogInterface.b);
                            am.J(am.this).remove(am.H(am.this));
                            am.L(am.this).remove(am.H(am.this));
                            am.I(am.this).remove(am.H(am.this));
                            if (am.J(am.this).isEmpty())
                            {
                              am.this.a(false, false);
                              return;
                            }
                            int i = am.H(am.this);
                            paramInt = i;
                            if (i >= am.I(am.this).size())
                              paramInt = am.I(am.this).size() - 1;
                            am.a(am.this, -1);
                            am.a(am.this, paramInt, true);
                            return;
                          }
                          paramInt = 0;
                        }
                      }
                    }
                  }
                });
                ((AlertDialog.Builder)localObject).setNegativeButton(r.a("Cancel", 2131230943), null);
                am.this.a((AlertDialog.Builder)localObject);
                return;
                if ((am.A(am.this) != null) && (am.A(am.this).L()))
                {
                  ((AlertDialog.Builder)localObject).setMessage(r.a("AreYouSure", 2131230870, new Object[0]));
                  continue;
                }
                ((AlertDialog.Builder)localObject).setMessage(r.a("AreYouSureDeletePhoto", 2131230878, new Object[0]));
              }
            }
            if (paramInt == 9)
            {
              am.d(am.this, true);
              return;
            }
            if (paramInt == 10)
            {
              am.M(am.this);
              return;
            }
            if (paramInt == 11)
              try
              {
                org.vidogram.messenger.a.a(am.A(am.this), am.g(am.this));
                am.this.a(false, false);
                return;
              }
              catch (Exception localException)
              {
                org.vidogram.messenger.n.a("tmessages", localException);
                return;
              }
            if (paramInt == 12)
            {
              localam = am.this;
              if (!am.N(am.this));
              while (true)
              {
                am.f(localam, bool);
                if (am.a(am.this) != null)
                  am.a(am.this).b(am.N(am.this));
                if (!am.N(am.this))
                  break;
                am.O(am.this).setTitle(r.a("AttachGif", 2131230897));
                am.P(am.this).setIcon(2130838197);
                return;
                bool = false;
              }
              am.O(am.this).setTitle(r.a("AttachVideo", 2131230902));
              am.P(am.this).setIcon(2130838198);
              return;
            }
            if ((paramInt != 13) || (am.g(am.this) == null) || (am.A(am.this) == null) || (am.A(am.this).a.j == null) || (am.A(am.this).a.j.d == null))
              break;
            new bl(am.g(am.this), am.A(am.this).a.j.d).show();
            return;
            label954: am localam = null;
          }
        }

        public boolean a()
        {
          if (am.A(am.this) != null)
            if (!m.b(am.A(am.this).a).exists())
              break label72;
          while (true)
          {
            return true;
            g.x localx;
            if (am.B(am.this) != null)
            {
              localx = am.B(am.this);
              if (am.C(am.this) == 0)
                break label74;
            }
            label72: label74: for (boolean bool = true; !m.a(localx, bool).exists(); bool = false)
              return false;
          }
        }
      });
      paramActivity = this.g.a();
      this.s = paramActivity.b(13, 2130837849);
      this.r = paramActivity.b(12, 2130838198);
      this.q = paramActivity.b(0, 2130837803);
      this.q.a(11, r.a("OpenInExternalApp", 2131231618), 0);
      this.q.a(2, r.a("ShowAllMedia", 2131231851), 0);
      this.q.a(10, r.a("ShareFile", 2131231834), 0);
      this.q.a(1, r.a("SaveToGallery", 2131231762), 0);
      this.q.a(6, r.a("Delete", 2131231117), 0);
      this.E = paramActivity.b(9, 2130837825, org.vidogram.messenger.a.a(56.0F));
      this.n = new FrameLayout(this.f);
      this.n.setBackgroundColor(2130706432);
      this.k.addView(this.n, org.vidogram.ui.Components.v.b(-1, 48, 83));
      this.L = new TextView(this.f);
      this.L.setMaxLines(10);
      this.L.setBackgroundColor(2130706432);
      this.L.setPadding(org.vidogram.messenger.a.a(20.0F), org.vidogram.messenger.a.a(8.0F), org.vidogram.messenger.a.a(20.0F), org.vidogram.messenger.a.a(8.0F));
      this.L.setLinkTextColor(-1);
      this.L.setTextColor(-1);
      this.L.setGravity(19);
      this.L.setTextSize(1, 16.0F);
      this.L.setVisibility(4);
      this.k.addView(this.L, org.vidogram.ui.Components.v.a(-1, -2.0F, 83, 0.0F, 0.0F, 0.0F, 48.0F));
      this.L.setOnClickListener(new View.OnClickListener()
      {
        public void onClick(View paramView)
        {
          if (am.Q(am.this).getVisibility() == 0)
            am.R(am.this);
        }
      });
      paramActivity = new TextView(this.f);
      this.M = paramActivity;
      this.K = paramActivity;
      this.M.setMaxLines(10);
      this.M.setBackgroundColor(2130706432);
      this.M.setPadding(org.vidogram.messenger.a.a(20.0F), org.vidogram.messenger.a.a(8.0F), org.vidogram.messenger.a.a(20.0F), org.vidogram.messenger.a.a(8.0F));
      this.M.setLinkTextColor(-1);
      this.M.setTextColor(-1);
      this.M.setGravity(19);
      this.M.setTextSize(1, 16.0F);
      this.M.setVisibility(4);
      this.k.addView(this.M, org.vidogram.ui.Components.v.a(-1, -2.0F, 83, 0.0F, 0.0F, 0.0F, 48.0F));
      this.M.setOnClickListener(new View.OnClickListener()
      {
        public void onClick(View paramView)
        {
          if (am.Q(am.this).getVisibility() == 0)
            am.R(am.this);
        }
      });
      this.A[0] = new f(this.k.getContext(), this.k);
      this.A[0].a(0, false);
      this.A[1] = new f(this.k.getContext(), this.k);
      this.A[1].a(0, false);
      this.A[2] = new f(this.k.getContext(), this.k);
      this.A[2].a(0, false);
      this.u = new ImageView(this.k.getContext());
      this.u.setImageResource(2130838143);
      this.u.setScaleType(ImageView.ScaleType.CENTER);
      this.u.setBackgroundDrawable(org.vidogram.ui.a.l.a(1090519039));
      this.n.addView(this.u, org.vidogram.ui.Components.v.b(50, -1, 53));
      this.u.setOnClickListener(new View.OnClickListener()
      {
        public void onClick(View paramView)
        {
          am.M(am.this);
        }
      });
      this.o = new TextView(this.k.getContext());
      this.o.setTextSize(1, 14.0F);
      this.o.setTypeface(org.vidogram.messenger.a.a("fonts/rmedium.ttf"));
      this.o.setSingleLine(true);
      this.o.setMaxLines(1);
      this.o.setEllipsize(TextUtils.TruncateAt.END);
      this.o.setTextColor(-1);
      this.o.setGravity(3);
      this.n.addView(this.o, org.vidogram.ui.Components.v.a(-1, -2.0F, 51, 16.0F, 5.0F, 60.0F, 0.0F));
      this.p = new TextView(this.k.getContext());
      this.p.setTextSize(1, 13.0F);
      this.p.setSingleLine(true);
      this.p.setMaxLines(1);
      this.p.setEllipsize(TextUtils.TruncateAt.END);
      this.p.setTextColor(-1);
      this.p.setTypeface(org.vidogram.messenger.a.a("fonts/rmedium.ttf"));
      this.p.setGravity(3);
      this.n.addView(this.p, org.vidogram.ui.Components.v.a(-1, -2.0F, 51, 16.0F, 25.0F, 50.0F, 0.0F));
      if (Build.VERSION.SDK_INT >= 16)
      {
        this.aa = new ba(this.k.getContext());
        this.aa.a(1728053247, -1, -1);
        this.aa.a(new ba.a()
        {
          public void a(float paramFloat)
          {
            if (am.a(am.this) != null)
              am.a(am.this).b().seekTo((int)((float)am.a(am.this).h() * paramFloat));
          }
        });
        this.X = new FrameLayout(this.k.getContext())
        {
          protected void onDraw(Canvas paramCanvas)
          {
            paramCanvas.save();
            paramCanvas.translate(org.vidogram.messenger.a.a(48.0F), 0.0F);
            am.b(am.this).a(paramCanvas);
            paramCanvas.restore();
          }

          protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
          {
            super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
            float f = 0.0F;
            if (am.a(am.this) != null)
            {
              org.vidogram.messenger.exoplayer.f.n localn = am.a(am.this).b();
              f = localn.getCurrentPosition() / localn.getDuration();
            }
            am.b(am.this).a(f);
          }

          protected void onMeasure(int paramInt1, int paramInt2)
          {
            long l2 = 0L;
            super.onMeasure(paramInt1, paramInt2);
            long l1 = l2;
            if (am.a(am.this) != null)
            {
              l1 = am.a(am.this).h();
              if (l1 != -1L)
                break label149;
              l1 = l2;
            }
            label149: 
            while (true)
            {
              l1 /= 1000L;
              paramInt1 = (int)Math.ceil(am.S(am.this).getPaint().measureText(String.format("%02d:%02d / %02d:%02d", new Object[] { Long.valueOf(l1 / 60L), Long.valueOf(l1 % 60L), Long.valueOf(l1 / 60L), Long.valueOf(l1 % 60L) })));
              am.b(am.this).a(getMeasuredWidth() - org.vidogram.messenger.a.a(64.0F) - paramInt1, getMeasuredHeight());
              return;
            }
          }

          public boolean onTouchEvent(MotionEvent paramMotionEvent)
          {
            int i = (int)paramMotionEvent.getX();
            i = (int)paramMotionEvent.getY();
            if (am.b(am.this).a(paramMotionEvent.getAction(), paramMotionEvent.getX() - org.vidogram.messenger.a.a(48.0F), paramMotionEvent.getY()))
            {
              getParent().requestDisallowInterceptTouchEvent(true);
              invalidate();
              return true;
            }
            return super.onTouchEvent(paramMotionEvent);
          }
        };
        this.X.setWillNotDraw(false);
        this.n.addView(this.X, org.vidogram.ui.Components.v.b(-1, -1, 51));
        this.Y = new ImageView(this.k.getContext());
        this.Y.setScaleType(ImageView.ScaleType.CENTER);
        this.X.addView(this.Y, org.vidogram.ui.Components.v.b(48, 48, 51));
        this.Y.setOnClickListener(new View.OnClickListener()
        {
          public void onClick(View paramView)
          {
            if (am.a(am.this) != null)
            {
              if (am.e(am.this))
                am.a(am.this).b().pause();
            }
            else
              return;
            am.a(am.this).b().start();
          }
        });
        this.Z = new TextView(this.k.getContext());
        this.Z.setTextColor(-1);
        this.Z.setGravity(16);
        this.Z.setTextSize(1, 13.0F);
        this.X.addView(this.Z, org.vidogram.ui.Components.v.a(-2, -1.0F, 53, 0.0F, 0.0F, 8.0F, 0.0F));
      }
      this.y = new an(this.f);
      this.y.setBackgroundColor(2130706432);
      this.k.addView(this.y, org.vidogram.ui.Components.v.b(-1, 48, 83));
      this.y.a.setOnClickListener(new View.OnClickListener()
      {
        public void onClick(View paramView)
        {
          if ((am.T(am.this) instanceof am.b))
            am.this.a(false, false);
          do
            return;
          while (am.T(am.this) == null);
          paramView = am.this;
          if (!am.T(am.this).z());
          for (boolean bool = true; ; bool = false)
          {
            paramView.a(bool, false);
            return;
          }
        }
      });
      this.y.b.setOnClickListener(new View.OnClickListener()
      {
        public void onClick(View paramView)
        {
          if (am.T(am.this) != null)
          {
            am.T(am.this).d(am.H(am.this));
            am.this.a(false, false);
          }
        }
      });
      paramActivity = new LinearLayout(this.e);
      paramActivity.setOrientation(0);
      this.y.addView(paramActivity, org.vidogram.ui.Components.v.b(-2, 48, 49));
      this.D = new ImageView(this.e);
      this.D.setScaleType(ImageView.ScaleType.CENTER);
      this.D.setImageResource(2130838043);
      this.D.setBackgroundDrawable(org.vidogram.ui.a.l.a(1090519039));
      paramActivity.addView(this.D, org.vidogram.ui.Components.v.b(56, 48));
      this.D.setOnClickListener(new View.OnClickListener()
      {
        public void onClick(View paramView)
        {
          am.b(am.this, 2);
        }
      });
      this.B = new ImageView(this.e);
      this.B.setScaleType(ImageView.ScaleType.CENTER);
      this.B.setImageResource(2130838035);
      this.B.setBackgroundDrawable(org.vidogram.ui.a.l.a(1090519039));
      paramActivity.addView(this.B, org.vidogram.ui.Components.v.b(56, 48));
      this.B.setOnClickListener(new View.OnClickListener()
      {
        public void onClick(View paramView)
        {
          am.b(am.this, 3);
        }
      });
      this.C = new ImageView(this.e);
      this.C.setScaleType(ImageView.ScaleType.CENTER);
      this.C.setImageResource(2130838032);
      this.C.setBackgroundDrawable(org.vidogram.ui.a.l.a(1090519039));
      paramActivity.addView(this.C, org.vidogram.ui.Components.v.b(56, 48));
      this.C.setOnClickListener(new View.OnClickListener()
      {
        public void onClick(View paramView)
        {
          am.b(am.this, 1);
        }
      });
      this.z = new an(this.f);
      this.z.setBackgroundColor(2130706432);
      this.z.a(0, false);
      this.z.setVisibility(8);
      this.k.addView(this.z, org.vidogram.ui.Components.v.b(-1, 48, 83));
      this.z.a.setOnClickListener(new View.OnClickListener()
      {
        public void onClick(View paramView)
        {
          if (am.U(am.this) == 1)
            am.V(am.this).b();
          am.b(am.this, 0);
        }
      });
      this.z.b.setOnClickListener(new View.OnClickListener()
      {
        public void onClick(View paramView)
        {
          if (am.U(am.this) == 1)
          {
            am.V(am.this).b();
            if (am.W(am.this) != null)
              return;
          }
          am.X(am.this);
          am.b(am.this, 0);
        }
      });
      paramActivity = new ImageView(this.f);
      paramActivity.setScaleType(ImageView.ScaleType.CENTER);
      paramActivity.setImageResource(2130838183);
      paramActivity.setBackgroundDrawable(org.vidogram.ui.a.l.a(1090519039));
      this.z.addView(paramActivity, org.vidogram.ui.Components.v.b(48, 48, 17));
      paramActivity.setOnClickListener(new View.OnClickListener()
      {
        public void onClick(View paramView)
        {
          am.Y(am.this).a(am.Y(am.this).d() - 90, false);
          am.V(am.this).setOrientation(am.Y(am.this).d());
          am.t(am.this).invalidate();
        }
      });
      this.bh = new GestureDetector(this.k.getContext(), this);
      this.bh.setOnDoubleTapListener(this);
      paramActivity = new q.a()
      {
        public void a(org.vidogram.messenger.q paramq, boolean paramBoolean1, boolean paramBoolean2)
        {
          if ((paramq == am.Y(am.this)) && (paramBoolean1) && (am.T(am.this) != null) && (am.T(am.this).x()))
          {
            if (!am.Z(am.this))
              am.b(am.this, true);
          }
          else
            return;
          am.x(am.this);
        }
      };
      this.ay.a(this.k);
      this.ay.a(2);
      this.ay.b(true);
      this.ay.a(paramActivity);
      this.ax.a(this.k);
      this.ax.a(2);
      this.ax.b(true);
      this.ax.a(paramActivity);
      this.az.a(this.k);
      this.az.a(2);
      this.az.b(true);
      this.az.a(paramActivity);
      int i1 = ((WindowManager)ApplicationLoader.a.getSystemService("window")).getDefaultDisplay().getRotation();
      this.x = new org.vidogram.ui.Components.i(this.k.getContext(), 2130838136);
      this.x.setDrawBackground(true);
      this.x.setSize(45);
      this.x.setCheckOffset(org.vidogram.messenger.a.a(1.0F));
      this.x.setColor(-12793105);
      this.x.setVisibility(8);
      paramActivity = this.k;
      localObject = this.x;
      if ((i1 != 3) && (i1 != 1))
        break label2755;
      f1 = 58.0F;
    }
    while (true)
    {
      paramActivity.addView((View)localObject, org.vidogram.ui.Components.v.a(45, 45.0F, 53, 0.0F, f1, 10.0F, 0.0F));
      if (Build.VERSION.SDK_INT >= 21)
      {
        paramActivity = (FrameLayout.LayoutParams)this.x.getLayoutParams();
        paramActivity.topMargin += org.vidogram.messenger.a.a;
      }
      this.x.setOnClickListener(new View.OnClickListener()
      {
        public void onClick(View paramView)
        {
          if (am.T(am.this) != null)
          {
            am.T(am.this).c(am.H(am.this));
            am.w(am.this).a(am.T(am.this).b(am.H(am.this)), true);
            am.aa(am.this);
          }
        }
      });
      this.N = new al(this.f, this.k, this.l);
      this.N.setDelegate(new al.a()
      {
        public void a(int paramInt)
        {
          int j = Math.min(3, am.ab(am.this).a());
          int i;
          if (am.ab(am.this).a() > 3)
          {
            i = 18;
            i = org.vidogram.messenger.a.a(i + j * 36);
            if (paramInt - org.vidogram.ui.a.a.getCurrentActionBarHeight() * 2 >= i)
              break label103;
            am.g(am.this, false);
            if ((am.l(am.this) != null) && (am.l(am.this).getVisibility() == 0))
              am.l(am.this).setVisibility(4);
          }
          label103: 
          do
          {
            return;
            i = 0;
            break;
            am.g(am.this, true);
          }
          while ((am.l(am.this) == null) || (am.l(am.this).getVisibility() != 4));
          am.l(am.this).setVisibility(0);
        }

        public void a(CharSequence paramCharSequence)
        {
          if ((am.ab(am.this) != null) && (am.k(am.this) != null) && (am.F(am.this) != null) && (paramCharSequence != null))
            am.ab(am.this).a(paramCharSequence.toString(), am.k(am.this).getCursorPosition(), am.F(am.this).m);
        }
      });
      this.k.addView(this.N, org.vidogram.ui.Components.v.a(-1, -2.0F, 83, 0.0F, 0.0F, 0.0F, -400.0F));
      this.al = new aw(this.f);
      this.al.setTag(Integer.valueOf(5));
      this.am = new LinearLayoutManager(this.f)
      {
        public boolean c()
        {
          return false;
        }
      };
      this.am.b(1);
      this.al.setLayoutManager(this.am);
      this.al.setBackgroundColor(2130706432);
      this.al.setVisibility(8);
      this.al.setClipToPadding(true);
      this.al.setOverScrollMode(2);
      this.k.addView(this.al, org.vidogram.ui.Components.v.b(-1, 110, 83));
      paramActivity = this.al;
      localObject = new org.vidogram.ui.b.n(this.f, true, 0L, new n.b()
      {
        public void a(g.d paramd)
        {
        }

        public void a(boolean paramBoolean)
        {
          if (paramBoolean)
          {
            FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)am.l(am.this).getLayoutParams();
            int k = Math.min(3, am.ab(am.this).a());
            if (am.ab(am.this).a() > 3)
            {
              int i = 18;
              i += k * 36;
              localLayoutParams.height = org.vidogram.messenger.a.a(i);
              localLayoutParams.topMargin = (-org.vidogram.messenger.a.a(i));
              am.l(am.this).setLayoutParams(localLayoutParams);
              if (am.ac(am.this) != null)
              {
                am.ac(am.this).cancel();
                am.a(am.this, null);
              }
              if (am.l(am.this).getVisibility() != 0)
                break label150;
              am.l(am.this).setAlpha(1.0F);
            }
          }
          label150: 
          do
          {
            return;
            int j = 0;
            break;
            am.ad(am.this).a(0, 10000);
            if (am.ae(am.this))
            {
              am.l(am.this).setVisibility(0);
              am.a(am.this, new AnimatorSet());
              am.ac(am.this).playTogether(new Animator[] { ObjectAnimator.ofFloat(am.l(am.this), "alpha", new float[] { 0.0F, 1.0F }) });
              am.ac(am.this).addListener(new b()
              {
                public void onAnimationEnd(Animator paramAnimator)
                {
                  if ((am.ac(am.this) != null) && (am.ac(am.this).equals(paramAnimator)))
                    am.a(am.this, null);
                }
              });
              am.ac(am.this).setDuration(200L);
              am.ac(am.this).start();
              return;
            }
            am.l(am.this).setAlpha(1.0F);
            am.l(am.this).setVisibility(4);
            return;
            if (am.ac(am.this) == null)
              continue;
            am.ac(am.this).cancel();
            am.a(am.this, null);
          }
          while (am.l(am.this).getVisibility() == 8);
          if (am.ae(am.this))
          {
            am.a(am.this, new AnimatorSet());
            am.ac(am.this).playTogether(new Animator[] { ObjectAnimator.ofFloat(am.l(am.this), "alpha", new float[] { 0.0F }) });
            am.ac(am.this).addListener(new b()
            {
              public void onAnimationEnd(Animator paramAnimator)
              {
                if ((am.ac(am.this) != null) && (am.ac(am.this).equals(paramAnimator)))
                {
                  am.l(am.this).setVisibility(8);
                  am.a(am.this, null);
                }
              }
            });
            am.ac(am.this).setDuration(200L);
            am.ac(am.this).start();
            return;
          }
          am.l(am.this).setVisibility(8);
        }

        public void b(boolean paramBoolean)
        {
        }
      });
      this.ak = ((org.vidogram.ui.b.n)localObject);
      paramActivity.setAdapter((RecyclerView.a)localObject);
      this.ak.a(false);
      this.al.setOnItemClickListener(new aw.b()
      {
        public void a(View paramView, int paramInt)
        {
          paramView = am.ab(am.this).g(paramInt);
          paramInt = am.ab(am.this).m();
          int i = am.ab(am.this).n();
          if ((paramView instanceof g.vw))
          {
            paramView = (g.vw)paramView;
            if (paramView != null)
              am.k(am.this).a(paramInt, i, "@" + paramView.g + " ");
          }
          do
            return;
          while (!(paramView instanceof String));
          am.k(am.this).a(paramInt, i, paramView + " ");
        }
      });
      this.al.setOnItemLongClickListener(new aw.c()
      {
        public boolean a(View paramView, int paramInt)
        {
          if ((am.ab(am.this).g(paramInt) instanceof String))
          {
            paramView = new AlertDialog.Builder(am.g(am.this));
            paramView.setTitle(r.a("AppName", 2131230856));
            paramView.setMessage(r.a("ClearSearch", 2131231071));
            paramView.setPositiveButton(r.a("ClearButton", 2131231065).toUpperCase(), new DialogInterface.OnClickListener()
            {
              public void onClick(DialogInterface paramDialogInterface, int paramInt)
              {
                am.ab(am.this).e();
              }
            });
            paramView.setNegativeButton(r.a("Cancel", 2131230943), null);
            am.this.a(paramView);
            return true;
          }
          return false;
        }
      });
      return;
      this.j.flags = 8;
      break;
      label2749: bool = false;
      break label383;
      label2755: f1 = 68.0F;
    }
  }

  public void a(AlertDialog.Builder paramBuilder)
  {
    if (this.e == null)
      return;
    try
    {
      if (this.J != null)
      {
        this.J.dismiss();
        this.J = null;
      }
      try
      {
        this.J = paramBuilder.show();
        this.J.setCanceledOnTouchOutside(true);
        this.J.setOnDismissListener(new DialogInterface.OnDismissListener()
        {
          public void onDismiss(DialogInterface paramDialogInterface)
          {
            am.a(am.this, null);
          }
        });
        return;
      }
      catch (Exception paramBuilder)
      {
        org.vidogram.messenger.n.a("tmessages", paramBuilder);
        return;
      }
    }
    catch (Exception localException)
    {
      while (true)
        org.vidogram.messenger.n.a("tmessages", localException);
    }
  }

  public void a(q paramq)
  {
    this.aj = paramq;
  }

  public void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    if ((!paramBoolean2) && (this.aw != 0))
      if ((this.aw == 3) && (this.I != null))
        this.I.a(this, this.e, new Runnable()
        {
          public void run()
          {
            am.b(am.this, 0);
          }
        });
    while (true)
    {
      return;
      if (this.aw == 1)
        this.G.b();
      a(0);
      return;
      try
      {
        if (this.J != null)
        {
          this.J.dismiss();
          this.J = null;
        }
        if (this.aw != 0)
        {
          if (this.aw == 2)
          {
            this.H.c();
            this.k.removeView(this.H);
            this.H = null;
            this.aw = 0;
          }
        }
        else
        {
          if ((this.e == null) || (!this.c) || (r()) || (this.b == null) || ((this.N.a()) && (!paramBoolean2)))
            continue;
          n();
          this.N.c();
          this.aj = null;
          y.a().b(this, y.aA);
          y.a().b(this, y.az);
          y.a().b(this, y.ay);
          y.a().b(this, y.q);
          y.a().b(this, y.p);
          y.a().b(this, y.u);
          y.a().b(this, y.at);
          ConnectionsManager.a().a(this.a);
          this.h = false;
          if (this.bF != null)
          {
            this.bF.recycle();
            this.bF = null;
          }
          ConnectionsManager.a().a(this.a);
          locale = this.b.a(this.aB, this.aD, this.aA);
          if (!paramBoolean1)
            break label1680;
          this.ap = 1;
          this.m.setVisibility(0);
          this.k.invalidate();
          localAnimatorSet = new AnimatorSet();
          localObject3 = this.m.getLayoutParams();
          i2 = this.ay.d();
          int i3 = 0;
          i1 = i3;
          if (locale != null)
          {
            i1 = i3;
            if (locale.a != null)
              i1 = locale.a.c();
          }
          if (i1 == 0)
            break label1855;
          this.m.setOrientation(i1);
          if (locale == null)
            break label1438;
          Object localObject1 = this.m;
          if (locale.h == 0)
            break label1433;
          paramBoolean1 = true;
          ((org.vidogram.ui.Components.l)localObject1).setNeedRadius(paramBoolean1);
          localObject1 = locale.a.s();
          ((ViewGroup.LayoutParams)localObject3).width = (((Rect)localObject1).right - ((Rect)localObject1).left);
          ((ViewGroup.LayoutParams)localObject3).height = (((Rect)localObject1).bottom - ((Rect)localObject1).top);
          this.m.setImageBitmap(locale.e);
          this.m.setLayoutParams((ViewGroup.LayoutParams)localObject3);
          f1 = org.vidogram.messenger.a.c.x / ((ViewGroup.LayoutParams)localObject3).width;
          i2 = org.vidogram.messenger.a.c.y;
          if (Build.VERSION.SDK_INT < 21)
            break label1490;
          i1 = org.vidogram.messenger.a.a;
          float f2 = (i1 + i2) / ((ViewGroup.LayoutParams)localObject3).height;
          if (f1 <= f2)
            break label1496;
          f1 = f2;
          float f4 = ((ViewGroup.LayoutParams)localObject3).width;
          float f5 = this.aZ;
          f2 = ((ViewGroup.LayoutParams)localObject3).height;
          float f3 = this.aZ;
          f4 = (org.vidogram.messenger.a.c.x - f4 * f5 * f1) / 2.0F;
          i2 = org.vidogram.messenger.a.c.y;
          if (Build.VERSION.SDK_INT < 21)
            break label1499;
          i1 = org.vidogram.messenger.a.a;
          f2 = (i1 + i2 - f2 * f3 * f1) / 2.0F;
          this.m.setTranslationX(f4 + this.aX);
          this.m.setTranslationY(f2 + this.aY);
          this.m.setScaleX(this.aZ * f1);
          this.m.setScaleY(f1 * this.aZ);
          if (locale == null)
            break label1521;
          locale.a.a(false, true);
          int i4 = Math.abs(((Rect)localObject1).left - locale.a.n());
          int i5 = Math.abs(((Rect)localObject1).top - locale.a.o());
          localObject3 = new int[2];
          locale.d.getLocationInWindow(localObject3);
          i2 = localObject3[1];
          if (Build.VERSION.SDK_INT < 21)
            break label1505;
          i1 = 0;
          i2 = i2 - i1 - (locale.c + ((Rect)localObject1).top) + locale.j;
          i1 = i2;
          if (i2 < 0)
            i1 = 0;
          i3 = locale.c;
          int i6 = ((Rect)localObject1).top;
          int i7 = ((Rect)localObject1).bottom;
          int i8 = ((Rect)localObject1).top;
          int i9 = localObject3[1];
          int i10 = locale.d.getHeight();
          if (Build.VERSION.SDK_INT < 21)
            break label1513;
          i2 = 0;
          i3 = i3 + i6 + (i7 - i8) - (i10 + i9 - i2) + locale.i;
          i2 = i3;
          if (i3 < 0)
            i2 = 0;
          i1 = Math.max(i1, i5);
          i2 = Math.max(i2, i5);
          this.ai[0][0] = this.m.getScaleX();
          this.ai[0][1] = this.m.getScaleY();
          this.ai[0][2] = this.m.getTranslationX();
          this.ai[0][3] = this.m.getTranslationY();
          this.ai[0][4] = 0;
          this.ai[0][5] = 0;
          this.ai[0][6] = 0;
          this.ai[0][7] = 0;
          this.ai[1][0] = locale.k;
          this.ai[1][1] = locale.k;
          this.ai[1][2] = (locale.b + ((Rect)localObject1).left * locale.k);
          localObject3 = this.ai[1];
          f1 = locale.c;
          localObject3[3] = (((Rect)localObject1).top * locale.k + f1);
          this.ai[1][4] = (i4 * locale.k);
          this.ai[1][5] = (i1 * locale.k);
          this.ai[1][6] = (i2 * locale.k);
          this.ai[1][7] = locale.h;
          localAnimatorSet.playTogether(new Animator[] { ObjectAnimator.ofFloat(this.m, "animationProgress", new float[] { 0.0F, 1.0F }), ObjectAnimator.ofInt(this.v, "alpha", new int[] { 0 }), ObjectAnimator.ofFloat(this.k, "alpha", new float[] { 0.0F }) });
          this.ar = new Runnable(locale)
          {
            public void run()
            {
              if (Build.VERSION.SDK_INT >= 18)
                am.t(am.this).setLayerType(0, null);
              am.f(am.this, 0);
              am.a(am.this, this.a);
            }
          };
          localAnimatorSet.setDuration(200L);
          localAnimatorSet.addListener(new b()
          {
            public void onAnimationEnd(Animator paramAnimator)
            {
              org.vidogram.messenger.a.a(new Runnable()
              {
                public void run()
                {
                  if (am.au(am.this) != null)
                  {
                    am.au(am.this).run();
                    am.a(am.this, null);
                  }
                }
              });
            }
          });
          this.aq = System.currentTimeMillis();
          if (Build.VERSION.SDK_INT >= 18)
            this.k.setLayerType(2, null);
          localAnimatorSet.start();
          if (this.R != null)
          {
            this.R.b(null);
            this.R = null;
            this.ay.a((Drawable)null);
          }
          if (!(this.b instanceof b))
            continue;
          this.b.z();
          return;
        }
      }
      catch (Exception localObject2)
      {
        while (true)
        {
          e locale;
          AnimatorSet localAnimatorSet;
          Object localObject3;
          float f1;
          org.vidogram.messenger.n.a("tmessages", localException);
          continue;
          if (this.aw != 1)
            continue;
          this.z.setVisibility(8);
          this.G.setVisibility(8);
          continue;
          label1433: paramBoolean1 = false;
          continue;
          label1438: this.m.setNeedRadius(false);
          ((ViewGroup.LayoutParams)localObject3).width = this.ay.p();
          ((ViewGroup.LayoutParams)localObject3).height = this.ay.q();
          this.m.setImageBitmap(this.ay.h());
          Object localObject2 = null;
          continue;
          label1490: int i1 = 0;
          continue;
          label1496: continue;
          label1499: i1 = 0;
          continue;
          label1505: i1 = org.vidogram.messenger.a.a;
          continue;
          label1513: int i2 = org.vidogram.messenger.a.a;
          continue;
          label1521: i2 = org.vidogram.messenger.a.c.y;
          label1542: org.vidogram.ui.Components.l locall;
          if (Build.VERSION.SDK_INT >= 21)
          {
            i1 = org.vidogram.messenger.a.a;
            i1 += i2;
            localObject2 = ObjectAnimator.ofInt(this.v, "alpha", new int[] { 0 });
            localObject3 = ObjectAnimator.ofFloat(this.m, "alpha", new float[] { 0.0F });
            locall = this.m;
            if (this.aY < 0.0F)
              break label1672;
            f1 = i1;
          }
          while (true)
          {
            localAnimatorSet.playTogether(new Animator[] { localObject2, localObject3, ObjectAnimator.ofFloat(locall, "translationY", new float[] { f1 }), ObjectAnimator.ofFloat(this.k, "alpha", new float[] { 0.0F }) });
            break;
            i1 = 0;
            break label1542;
            label1672: f1 = -i1;
          }
          label1680: localObject2 = new AnimatorSet();
          ((AnimatorSet)localObject2).playTogether(new Animator[] { ObjectAnimator.ofFloat(this.k, "scaleX", new float[] { 0.9F }), ObjectAnimator.ofFloat(this.k, "scaleY", new float[] { 0.9F }), ObjectAnimator.ofInt(this.v, "alpha", new int[] { 0 }), ObjectAnimator.ofFloat(this.k, "alpha", new float[] { 0.0F }) });
          this.ap = 2;
          this.ar = new Runnable(locale)
          {
            public void run()
            {
              if (am.t(am.this) == null)
                return;
              if (Build.VERSION.SDK_INT >= 18)
                am.t(am.this).setLayerType(0, null);
              am.f(am.this, 0);
              am.a(am.this, this.a);
              am.t(am.this).setScaleX(1.0F);
              am.t(am.this).setScaleY(1.0F);
            }
          };
          ((AnimatorSet)localObject2).setDuration(200L);
          ((AnimatorSet)localObject2).addListener(new b()
          {
            public void onAnimationEnd(Animator paramAnimator)
            {
              if (am.au(am.this) != null)
              {
                am.au(am.this).run();
                am.a(am.this, null);
              }
            }
          });
          this.aq = System.currentTimeMillis();
          if (Build.VERSION.SDK_INT >= 18)
            this.k.setLayerType(2, null);
          ((AnimatorSet)localObject2).start();
          continue;
          label1855: i1 = i2;
        }
      }
    }
  }

  public boolean a(String paramString)
  {
    return (this.c) && (!this.au) && (paramString != null) && (this.aG != null) && (paramString.equals(this.aG));
  }

  public boolean a(ArrayList<Object> paramArrayList, int paramInt1, int paramInt2, d paramd, q paramq)
  {
    this.P = paramInt2;
    TextView localTextView;
    if (this.y != null)
    {
      localTextView = this.y.b;
      if (this.P != 1)
        break label66;
    }
    label66: for (String str = r.a("Set", 2131231819).toUpperCase(); ; str = r.a("Send", 2131231793).toUpperCase())
    {
      localTextView.setText(str);
      return a(null, null, null, paramArrayList, paramInt1, paramd, paramq, 0L, 0L);
    }
  }

  public boolean a(ArrayList<u> paramArrayList, int paramInt, long paramLong1, long paramLong2, d paramd)
  {
    return a((u)paramArrayList.get(paramInt), null, paramArrayList, null, paramInt, paramd, null, paramLong1, paramLong2);
  }

  public boolean a(u paramu)
  {
    return (this.c) && (!this.au) && (paramu != null) && (this.aB != null) && (this.aB.q() == paramu.q());
  }

  public boolean a(u paramu, long paramLong1, long paramLong2, d paramd)
  {
    return a(paramu, null, null, null, 0, paramd, null, paramLong1, paramLong2);
  }

  public boolean a(u paramu, g.x paramx, ArrayList<u> paramArrayList, ArrayList<Object> paramArrayList1, int paramInt, d paramd, q paramq, long paramLong1, long paramLong2)
  {
    if ((this.e == null) || (this.c) || ((paramd == null) && (r())) || ((paramu == null) && (paramx == null) && (paramArrayList == null) && (paramArrayList1 == null)))
      return false;
    e locale = paramd.a(paramu, paramx, paramInt);
    if ((locale == null) && (paramArrayList1 == null))
      return false;
    WindowManager localWindowManager = (WindowManager)this.e.getSystemService("window");
    if (this.aS);
    try
    {
      localWindowManager.removeView(this.l);
      while (true)
      {
        try
        {
          this.j.type = 99;
          if (Build.VERSION.SDK_INT < 21)
            continue;
          this.j.flags = -2147417848;
          this.j.softInputMode = 272;
          this.l.setFocusable(false);
          this.k.setFocusable(false);
          localWindowManager.addView(this.l, this.j);
          this.aj = paramq;
          this.g.setTitle(r.a("Of", 2131231605, new Object[] { Integer.valueOf(1), Integer.valueOf(1) }));
          y.a().a(this, y.aA);
          y.a().a(this, y.az);
          y.a().a(this, y.ay);
          y.a().a(this, y.q);
          y.a().a(this, y.p);
          y.a().a(this, y.u);
          y.a().a(this, y.at);
          this.b = paramd;
          this.aK = paramLong2;
          this.aJ = paramLong1;
          if (this.bF != null)
            continue;
          this.bF = VelocityTracker.obtain();
          this.c = true;
          b(true, false);
          if (locale == null)
            break;
          this.au = true;
          this.ap = 1;
          if (paramu == null)
            continue;
          this.R = locale.a.K();
          a(paramu, paramx, paramArrayList, paramArrayList1, paramInt, locale);
          paramu = locale.a.s();
          paramInt = locale.a.d();
          i1 = locale.a.c();
          if (i1 == 0)
            break label1532;
          paramInt = i1;
          this.m.setVisibility(0);
          this.m.setRadius(locale.h);
          this.m.setOrientation(paramInt);
          paramx = this.m;
          if (locale.h != 0)
          {
            bool = true;
            paramx.setNeedRadius(bool);
            this.m.setImageBitmap(locale.e);
            this.m.setAlpha(1.0F);
            this.m.setPivotX(0.0F);
            this.m.setPivotY(0.0F);
            this.m.setScaleX(locale.k);
            this.m.setScaleY(locale.k);
            this.m.setTranslationX(locale.b + paramu.left * locale.k);
            this.m.setTranslationY(locale.c + paramu.top * locale.k);
            paramx = this.m.getLayoutParams();
            paramx.width = (paramu.right - paramu.left);
            paramx.height = (paramu.bottom - paramu.top);
            this.m.setLayoutParams(paramx);
            float f1 = org.vidogram.messenger.a.c.x / paramx.width;
            i1 = org.vidogram.messenger.a.c.y;
            if (Build.VERSION.SDK_INT < 21)
              break label1379;
            paramInt = org.vidogram.messenger.a.a;
            float f2 = (paramInt + i1) / paramx.height;
            if (f1 <= f2)
              break label1385;
            f1 = f2;
            float f3 = paramx.width;
            f2 = paramx.height;
            f3 = (org.vidogram.messenger.a.c.x - f3 * f1) / 2.0F;
            i1 = org.vidogram.messenger.a.c.y;
            if (Build.VERSION.SDK_INT < 21)
              break label1388;
            paramInt = org.vidogram.messenger.a.a;
            f2 = (paramInt + i1 - f2 * f1) / 2.0F;
            int i3 = Math.abs(paramu.left - locale.a.n());
            int i4 = Math.abs(paramu.top - locale.a.o());
            paramArrayList = new int[2];
            locale.d.getLocationInWindow(paramArrayList);
            i1 = paramArrayList[1];
            if (Build.VERSION.SDK_INT < 21)
              break label1394;
            paramInt = 0;
            i1 = i1 - paramInt - (locale.c + paramu.top) + locale.j;
            paramInt = i1;
            if (i1 >= 0)
              continue;
            paramInt = 0;
            int i2 = locale.c;
            int i5 = paramu.top;
            int i6 = paramx.height;
            int i7 = paramArrayList[1];
            int i8 = locale.d.getHeight();
            if (Build.VERSION.SDK_INT < 21)
              break label1402;
            i1 = 0;
            i2 = i6 + (i5 + i2) - (i8 + i7 - i1) + locale.i;
            i1 = i2;
            if (i2 >= 0)
              continue;
            i1 = 0;
            paramInt = Math.max(paramInt, i4);
            i1 = Math.max(i1, i4);
            this.ai[0][0] = this.m.getScaleX();
            this.ai[0][1] = this.m.getScaleY();
            this.ai[0][2] = this.m.getTranslationX();
            this.ai[0][3] = this.m.getTranslationY();
            this.ai[0][4] = (i3 * locale.k);
            this.ai[0][5] = (paramInt * locale.k);
            this.ai[0][6] = (i1 * locale.k);
            this.ai[0][7] = this.m.getRadius();
            this.ai[1][0] = f1;
            this.ai[1][1] = f1;
            this.ai[1][2] = f3;
            this.ai[1][3] = f2;
            this.ai[1][4] = 0;
            this.ai[1][5] = 0;
            this.ai[1][6] = 0;
            this.ai[1][7] = 0;
            this.m.setAnimationProgress(0.0F);
            this.v.setAlpha(0);
            this.k.setAlpha(0.0F);
            paramu = new AnimatorSet();
            paramu.playTogether(new Animator[] { ObjectAnimator.ofFloat(this.m, "animationProgress", new float[] { 0.0F, 1.0F }), ObjectAnimator.ofInt(this.v, "alpha", new int[] { 0, 255 }), ObjectAnimator.ofFloat(this.k, "alpha", new float[] { 0.0F, 1.0F }) });
            this.ar = new Runnable(paramArrayList1)
            {
              public void run()
              {
                if ((am.t(am.this) == null) || (am.y(am.this) == null));
                do
                {
                  return;
                  if (Build.VERSION.SDK_INT >= 18)
                    am.t(am.this).setLayerType(0, null);
                  am.f(am.this, 0);
                  am.b(am.this, 0L);
                  am.aq(am.this);
                  am.t(am.this).invalidate();
                  am.q(am.this).setVisibility(8);
                  if (am.ar(am.this) != null)
                    am.ar(am.this).a.a(true, true);
                  if (am.as(am.this) == null)
                    continue;
                  am.as(am.this).a.a(false, true);
                }
                while ((this.a == null) || (am.am(am.this) == 3));
                if (Build.VERSION.SDK_INT >= 21);
                for (am.at(am.this).flags = -2147417856; ; am.at(am.this).flags = 0)
                {
                  am.at(am.this).softInputMode = 272;
                  ((WindowManager)am.g(am.this).getSystemService("window")).updateViewLayout(am.y(am.this), am.at(am.this));
                  am.y(am.this).setFocusable(true);
                  am.t(am.this).setFocusable(true);
                  return;
                }
              }
            };
            paramu.setDuration(200L);
            paramu.addListener(new b()
            {
              public void onAnimationEnd(Animator paramAnimator)
              {
                org.vidogram.messenger.a.a(new Runnable()
                {
                  public void run()
                  {
                    y.a().a(false);
                    if (am.au(am.this) != null)
                    {
                      am.au(am.this).run();
                      am.a(am.this, null);
                    }
                  }
                });
              }
            });
            this.aq = System.currentTimeMillis();
            org.vidogram.messenger.a.a(new Runnable(paramu)
            {
              public void run()
              {
                y.a().a(new int[] { y.c, y.d, y.q, y.p, y.u });
                y.a().a(true);
                this.a.start();
              }
            });
            if (Build.VERSION.SDK_INT < 18)
              continue;
            this.k.setLayerType(2, null);
            a.a(this.v, new Runnable(locale)
            {
              public void run()
              {
                am.e(am.this, false);
                this.a.a.a(false, true);
              }
            });
            return true;
            this.j.flags = 8;
            continue;
          }
        }
        catch (Exception paramu)
        {
          org.vidogram.messenger.n.a("tmessages", paramu);
          return false;
        }
        boolean bool = false;
        continue;
        label1379: paramInt = 0;
        continue;
        label1385: continue;
        label1388: paramInt = 0;
        continue;
        label1394: paramInt = org.vidogram.messenger.a.a;
        continue;
        label1402: int i1 = org.vidogram.messenger.a.a;
      }
      if ((paramArrayList1 != null) && (this.P != 3))
        if (Build.VERSION.SDK_INT < 21)
          break label1516;
      label1516: for (this.j.flags = -2147417856; ; this.j.flags = 0)
      {
        this.j.softInputMode = 272;
        localWindowManager.updateViewLayout(this.l, this.j);
        this.l.setFocusable(true);
        this.k.setFocusable(true);
        this.v.setAlpha(255);
        this.k.setAlpha(1.0F);
        a(paramu, paramx, paramArrayList, paramArrayList1, paramInt, locale);
        break;
      }
    }
    catch (Exception localException)
    {
      label1532: 
      while (true)
        continue;
    }
  }

  public boolean a(g.x paramx)
  {
    return (this.c) && (!this.au) && (paramx != null) && (this.aD != null) && (paramx.d == this.aD.d) && (paramx.c == this.aD.c) && (paramx.b == this.aD.b);
  }

  public boolean a(g.x paramx, d paramd)
  {
    return a(null, paramx, null, null, 0, paramd, null, 0L, 0L);
  }

  public boolean b()
  {
    return this.d;
  }

  public void c()
  {
    if ((this.e == null) || (this.l == null))
      return;
    n();
    try
    {
      if (this.l.getParent() != null)
        ((WindowManager)this.e.getSystemService("window")).removeViewImmediate(this.l);
      this.l = null;
      if (this.N != null)
        this.N.c();
      bS = null;
      return;
    }
    catch (Exception localException)
    {
      while (true)
        org.vidogram.messenger.n.a("tmessages", localException);
    }
  }

  public void d()
  {
    c(0);
  }

  public void e()
  {
    if (this.R != null)
      a(false, false);
    do
      return;
    while (this.E.getVisibility() == 8);
    a(true);
  }

  public boolean f()
  {
    return (this.c) && (this.b != null);
  }

  public boolean onDoubleTap(MotionEvent paramMotionEvent)
  {
    if ((!this.bv) || ((this.aZ == 1.0F) && ((this.aY != 0.0F) || (this.aX != 0.0F))));
    do
      return false;
    while ((this.be != 0L) || (this.ap != 0));
    float f2;
    float f3;
    float f1;
    if (this.aZ == 1.0F)
    {
      f2 = paramMotionEvent.getX() - u() / 2 - (paramMotionEvent.getX() - u() / 2 - this.aX) * (3.0F / this.aZ);
      f3 = paramMotionEvent.getY() - v() / 2 - (paramMotionEvent.getY() - v() / 2 - this.aY) * (3.0F / this.aZ);
      a(3.0F);
      if (f2 < this.br)
      {
        f1 = this.br;
        if (f3 >= this.bt)
          break label214;
        f2 = this.bt;
        label178: a(3.0F, f1, f2, true);
      }
    }
    while (true)
    {
      this.bz = true;
      return true;
      f1 = f2;
      if (f2 <= this.bs)
        break;
      f1 = this.bs;
      break;
      label214: f2 = f3;
      if (f3 <= this.bu)
        break label178;
      f2 = this.bu;
      break label178;
      a(1.0F, 0.0F, 0.0F, true);
    }
  }

  public boolean onDoubleTapEvent(MotionEvent paramMotionEvent)
  {
    return false;
  }

  public boolean onDown(MotionEvent paramMotionEvent)
  {
    return false;
  }

  public boolean onFling(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    if (this.aZ != 1.0F)
    {
      this.bG.abortAnimation();
      this.bG.fling(Math.round(this.aX), Math.round(this.aY), Math.round(paramFloat1), Math.round(paramFloat2), (int)this.br, (int)this.bs, (int)this.bt, (int)this.bu);
      this.k.postInvalidate();
    }
    return false;
  }

  public void onLongPress(MotionEvent paramMotionEvent)
  {
  }

  public boolean onScroll(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    return false;
  }

  public void onShowPress(MotionEvent paramMotionEvent)
  {
  }

  public boolean onSingleTapConfirmed(MotionEvent paramMotionEvent)
  {
    boolean bool1 = false;
    boolean bool2 = true;
    if (this.bD)
      bool1 = false;
    float f2;
    do
    {
      do
      {
        float f1;
        do
        {
          do
          {
            int i1;
            do
            {
              do
              {
                do
                {
                  do
                  {
                    return bool1;
                    if (this.O)
                    {
                      if ((Build.VERSION.SDK_INT >= 16) && (this.U != null) && (this.U.getVisibility() == 0));
                      for (i1 = 1; (this.A[0] != null) && (this.k != null) && (i1 == 0); i1 = 0)
                      {
                        i1 = f.a(this.A[0]);
                        if ((i1 <= 0) || (i1 > 3))
                          break;
                        f1 = paramMotionEvent.getX();
                        f2 = paramMotionEvent.getY();
                        if ((f1 < (u() - org.vidogram.messenger.a.a(100.0F)) / 2.0F) || (f1 > (u() + org.vidogram.messenger.a.a(100.0F)) / 2.0F) || (f2 < (v() - org.vidogram.messenger.a.a(100.0F)) / 2.0F) || (f2 > (v() + org.vidogram.messenger.a.a(100.0F)) / 2.0F))
                          break;
                        d(true);
                        b(0, true);
                        return true;
                      }
                      if (!this.h)
                        bool1 = true;
                      b(bool1, true);
                      return true;
                    }
                    if (this.P == 0)
                    {
                      this.x.performClick();
                      return true;
                    }
                    bool1 = bool2;
                  }
                  while (this.aC == null);
                  if (this.aC.d.equals("video"))
                    break;
                  bool1 = bool2;
                }
                while (!u.g(this.aC.p));
                i1 = f.a(this.A[0]);
                bool1 = bool2;
              }
              while (i1 <= 0);
              bool1 = bool2;
            }
            while (i1 > 3);
            f1 = paramMotionEvent.getX();
            f2 = paramMotionEvent.getY();
            bool1 = bool2;
          }
          while (f1 < (u() - org.vidogram.messenger.a.a(100.0F)) / 2.0F);
          bool1 = bool2;
        }
        while (f1 > (u() + org.vidogram.messenger.a.a(100.0F)) / 2.0F);
        bool1 = bool2;
      }
      while (f2 < (v() - org.vidogram.messenger.a.a(100.0F)) / 2.0F);
      bool1 = bool2;
    }
    while (f2 > (v() + org.vidogram.messenger.a.a(100.0F)) / 2.0F);
    d(true);
    b(0, true);
    return true;
  }

  public boolean onSingleTapUp(MotionEvent paramMotionEvent)
  {
    return false;
  }

  private class a extends ColorDrawable
  {
    private Runnable b;

    public a(int arg2)
    {
      super();
    }

    public void draw(Canvas paramCanvas)
    {
      super.draw(paramCanvas);
      if ((getAlpha() != 0) && (this.b != null))
      {
        this.b.run();
        this.b = null;
      }
    }

    public void setAlpha(int paramInt)
    {
      org.vidogram.ui.a.i locali;
      if ((am.g(am.this) instanceof LaunchActivity))
      {
        locali = ((LaunchActivity)am.g(am.this)).a;
        if ((am.h(am.this)) && (paramInt == 255))
          break label57;
      }
      label57: for (boolean bool = true; ; bool = false)
      {
        locali.setAllowDrawContent(bool);
        super.setAlpha(paramInt);
        return;
      }
    }
  }

  public static class b
    implements am.d
  {
    public int A()
    {
      return 0;
    }

    public am.e a(u paramu, g.x paramx, int paramInt)
    {
      return null;
    }

    public void a_(int paramInt)
    {
    }

    public Bitmap b(u paramu, g.x paramx, int paramInt)
    {
      return null;
    }

    public boolean b(int paramInt)
    {
      return false;
    }

    public void c(int paramInt)
    {
    }

    public void c(u paramu, g.x paramx, int paramInt)
    {
    }

    public void d(int paramInt)
    {
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
    }

    public boolean z()
    {
      return true;
    }
  }

  private class c extends bh
  {
    private Paint b = new Paint();

    public c(Context arg2)
    {
      super();
      setWillNotDraw(false);
      this.b.setColor(855638016);
    }

    protected boolean drawChild(Canvas paramCanvas, View paramView, long paramLong)
    {
      return (paramView != am.p(am.this)) && (super.drawChild(paramCanvas, paramView, paramLong));
    }

    protected void onDraw(Canvas paramCanvas)
    {
      am.a(am.a(), paramCanvas);
      if ((Build.VERSION.SDK_INT >= 21) && (org.vidogram.messenger.a.a != 0))
        paramCanvas.drawRect(0.0F, 0.0F, getMeasuredWidth(), org.vidogram.messenger.a.a, this.b);
    }

    protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      int i1 = getChildCount();
      int m;
      if ((getKeyboardHeight() <= org.vidogram.messenger.a.a(20.0F)) && (!org.vidogram.messenger.a.i))
        m = am.k(am.this).getEmojiPadding();
      while (true)
      {
        int n = 0;
        View localView;
        while (true)
        {
          if (n >= i1)
            break label639;
          localView = getChildAt(n);
          if (localView.getVisibility() == 8)
          {
            n += 1;
            continue;
            m = 0;
            break;
          }
        }
        FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)localView.getLayoutParams();
        int i2 = localView.getMeasuredWidth();
        int i3 = localView.getMeasuredHeight();
        int j = localLayoutParams.gravity;
        int i = j;
        if (j == -1)
          i = 51;
        int k;
        switch (i & 0x7 & 0x7)
        {
        default:
          k = localLayoutParams.leftMargin;
          label167: switch (i & 0x70)
          {
          default:
            j = localLayoutParams.topMargin;
            label215: if (localView == am.l(am.this))
              if ((!am.k(am.this).f()) && (!am.k(am.this).h()) && (am.k(am.this).getEmojiPadding() == 0))
                i = j + org.vidogram.messenger.a.a(400.0F);
          case 48:
          case 16:
          case 80:
          }
        case 1:
        case 5:
        }
        while (true)
        {
          localView.layout(k, i, i2 + k, i3 + i);
          break;
          k = (paramInt3 - paramInt1 - i2) / 2 + localLayoutParams.leftMargin - localLayoutParams.rightMargin;
          break label167;
          k = paramInt3 - i2 - localLayoutParams.rightMargin;
          break label167;
          j = localLayoutParams.topMargin;
          break label215;
          j = (paramInt4 - m - paramInt2 - i3) / 2 + localLayoutParams.topMargin - localLayoutParams.bottomMargin;
          break label215;
          j = paramInt4 - m - paramInt2 - i3 - localLayoutParams.bottomMargin;
          break label215;
          i = j - am.k(am.this).getMeasuredHeight();
          continue;
          if (localView == am.k(am.this))
          {
            i = j;
            if (am.k(am.this).f())
              continue;
            i = j;
            if (am.k(am.this).h())
              continue;
            i = j;
            if (am.k(am.this).getEmojiPadding() != 0)
              continue;
            i = j + org.vidogram.messenger.a.a(400.0F);
            continue;
          }
          if ((localView == am.m(am.this)) || (localView == am.n(am.this)) || (localView == am.o(am.this)))
          {
            if (!am.k(am.this).f())
            {
              i = j;
              if (!am.k(am.this).h())
                continue;
            }
            i = j + org.vidogram.messenger.a.a(400.0F);
            continue;
          }
          i = j;
          if (!am.k(am.this).a(localView))
            continue;
          if (org.vidogram.messenger.a.i)
          {
            i = am.k(am.this).getTop() - localView.getMeasuredHeight() + org.vidogram.messenger.a.a(1.0F);
            continue;
          }
          i = am.k(am.this).getBottom();
        }
      }
      label639: a();
    }

    protected void onMeasure(int paramInt1, int paramInt2)
    {
      int j = View.MeasureSpec.getSize(paramInt1);
      int k = View.MeasureSpec.getSize(paramInt2);
      setMeasuredDimension(j, k);
      measureChildWithMargins(am.k(am.this), paramInt1, 0, paramInt2, 0);
      int m = am.k(am.this).getMeasuredHeight();
      int n = getChildCount();
      int i = 0;
      if (i < n)
      {
        View localView = getChildAt(i);
        if ((localView.getVisibility() == 8) || (localView == am.k(am.this)));
        while (true)
        {
          i += 1;
          break;
          if (am.k(am.this).a(localView))
          {
            if (org.vidogram.messenger.a.i)
            {
              if (org.vidogram.messenger.a.c())
              {
                localView.measure(View.MeasureSpec.makeMeasureSpec(j, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(org.vidogram.messenger.a.a(320.0F), k - m - org.vidogram.messenger.a.a), 1073741824));
                continue;
              }
              localView.measure(View.MeasureSpec.makeMeasureSpec(j, 1073741824), View.MeasureSpec.makeMeasureSpec(k - m - org.vidogram.messenger.a.a, 1073741824));
              continue;
            }
            localView.measure(View.MeasureSpec.makeMeasureSpec(j, 1073741824), View.MeasureSpec.makeMeasureSpec(localView.getLayoutParams().height, 1073741824));
            continue;
          }
          measureChildWithMargins(localView, paramInt1, 0, paramInt2, 0);
        }
      }
    }
  }

  public static abstract interface d
  {
    public abstract int A();

    public abstract am.e a(u paramu, g.x paramx, int paramInt);

    public abstract void a_(int paramInt);

    public abstract Bitmap b(u paramu, g.x paramx, int paramInt);

    public abstract boolean b(int paramInt);

    public abstract void c(int paramInt);

    public abstract void c(u paramu, g.x paramx, int paramInt);

    public abstract void d(int paramInt);

    public abstract boolean w();

    public abstract boolean x();

    public abstract void y();

    public abstract boolean z();
  }

  public static class e
  {
    public org.vidogram.messenger.q a;
    public int b;
    public int c;
    public View d;
    public Bitmap e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public float k = 1.0F;
  }

  private class f
  {
    private long b = 0L;
    private float c = 0.0F;
    private float d = 0.0F;
    private float e = 0.0F;
    private long f = 0L;
    private float g = 0.0F;
    private RectF h = new RectF();
    private int i = -1;
    private View j = null;
    private int k = org.vidogram.messenger.a.a(64.0F);
    private int l = -2;
    private float m = 1.0F;
    private float n = 1.0F;
    private float o = 1.0F;

    public f(Context paramView, View arg3)
    {
      if (am.g() == null)
      {
        am.a(new DecelerateInterpolator(1.5F));
        am.a(new Paint(1));
        am.h().setStyle(Paint.Style.STROKE);
        am.h().setStrokeCap(Paint.Cap.ROUND);
        am.h().setStrokeWidth(org.vidogram.messenger.a.a(3.0F));
        am.h().setColor(-1);
      }
      Object localObject;
      this.j = localObject;
    }

    private void a()
    {
      long l1 = System.currentTimeMillis();
      long l2 = l1 - this.b;
      this.b = l1;
      float f1;
      if (this.g != 1.0F)
      {
        this.c += (float)(360L * l2) / 3000.0F;
        f1 = this.d - this.e;
        if (f1 > 0.0F)
        {
          this.f += l2;
          if (this.f < 300L)
            break label172;
          this.g = this.d;
          this.e = this.d;
          this.f = 0L;
        }
      }
      while (true)
      {
        this.j.invalidate();
        if ((this.g >= 1.0F) && (this.l != -2))
        {
          this.m -= (float)l2 / 200.0F;
          if (this.m <= 0.0F)
          {
            this.m = 0.0F;
            this.l = -2;
          }
          this.j.invalidate();
        }
        return;
        label172: float f2 = this.e;
        this.g = (f1 * am.g().getInterpolation((float)this.f / 300.0F) + f2);
      }
    }

    public void a(float paramFloat)
    {
      this.n = paramFloat;
    }

    public void a(float paramFloat, boolean paramBoolean)
    {
      if (!paramBoolean)
        this.g = paramFloat;
      for (this.e = paramFloat; ; this.e = this.g)
      {
        this.d = paramFloat;
        this.f = 0L;
        return;
      }
    }

    public void a(int paramInt, boolean paramBoolean)
    {
      this.b = System.currentTimeMillis();
      if ((paramBoolean) && (this.i != paramInt))
      {
        this.l = this.i;
        this.m = 1.0F;
      }
      while (true)
      {
        this.i = paramInt;
        this.j.invalidate();
        return;
        this.l = -2;
      }
    }

    public void a(Canvas paramCanvas)
    {
      int i1 = (int)(this.k * this.o);
      int i2 = (am.i(am.this) - i1) / 2;
      int i3 = (am.j(am.this) - i1) / 2;
      Drawable localDrawable;
      if ((this.l >= 0) && (this.l < 4))
      {
        localDrawable = am.i()[this.l];
        if (localDrawable != null)
        {
          localDrawable.setAlpha((int)(this.m * 255.0F * this.n));
          localDrawable.setBounds(i2, i3, i2 + i1, i3 + i1);
          localDrawable.draw(paramCanvas);
        }
      }
      if ((this.i >= 0) && (this.i < 4))
      {
        localDrawable = am.i()[this.i];
        if (localDrawable != null)
        {
          if (this.l == -2)
            break label320;
          localDrawable.setAlpha((int)((1.0F - this.m) * 255.0F * this.n));
          localDrawable.setBounds(i2, i3, i2 + i1, i3 + i1);
          localDrawable.draw(paramCanvas);
        }
      }
      int i4;
      if ((this.i == 0) || (this.i == 1) || (this.l == 0) || (this.l == 1))
      {
        i4 = org.vidogram.messenger.a.a(4.0F);
        if (this.l == -2)
          break label336;
        am.h().setAlpha((int)(this.m * 255.0F * this.n));
      }
      while (true)
      {
        this.h.set(i2 + i4, i3 + i4, i2 + i1 - i4, i1 + i3 - i4);
        paramCanvas.drawArc(this.h, this.c - 90.0F, Math.max(4.0F, 360.0F * this.g), false, am.h());
        a();
        return;
        label320: localDrawable.setAlpha((int)(this.n * 255.0F));
        break;
        label336: am.h().setAlpha((int)(this.n * 255.0F));
      }
    }

    public void b(float paramFloat)
    {
      this.o = paramFloat;
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.am
 * JD-Core Version:    0.6.0
 */