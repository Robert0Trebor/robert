package org.vidogram.ui;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.provider.ContactsContract.Contacts;
import android.support.v4.content.FileProvider;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.view.Window;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Semaphore;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.vidogram.messenger.ApplicationLoader;
import org.vidogram.messenger.MediaController;
import org.vidogram.messenger.MediaController.i;
import org.vidogram.messenger.MediaController.j;
import org.vidogram.messenger.Utilities;
import org.vidogram.messenger.ae;
import org.vidogram.messenger.af;
import org.vidogram.messenger.support.widget.LinearLayoutManager;
import org.vidogram.messenger.support.widget.RecyclerView;
import org.vidogram.messenger.support.widget.RecyclerView.a;
import org.vidogram.messenger.support.widget.RecyclerView.g;
import org.vidogram.messenger.support.widget.RecyclerView.h;
import org.vidogram.messenger.support.widget.RecyclerView.i;
import org.vidogram.messenger.support.widget.RecyclerView.l;
import org.vidogram.messenger.support.widget.RecyclerView.r;
import org.vidogram.messenger.support.widget.RecyclerView.u;
import org.vidogram.messenger.support.widget.d.c;
import org.vidogram.messenger.u;
import org.vidogram.messenger.y;
import org.vidogram.messenger.y.b;
import org.vidogram.messenger.z;
import org.vidogram.tgnet.ConnectionsManager;
import org.vidogram.tgnet.g.ab;
import org.vidogram.tgnet.g.an;
import org.vidogram.tgnet.g.ap;
import org.vidogram.tgnet.g.aq;
import org.vidogram.tgnet.g.ar;
import org.vidogram.tgnet.g.as;
import org.vidogram.tgnet.g.at;
import org.vidogram.tgnet.g.au;
import org.vidogram.tgnet.g.aw;
import org.vidogram.tgnet.g.az;
import org.vidogram.tgnet.g.b;
import org.vidogram.tgnet.g.bb;
import org.vidogram.tgnet.g.cy;
import org.vidogram.tgnet.g.d;
import org.vidogram.tgnet.g.dj;
import org.vidogram.tgnet.g.dl;
import org.vidogram.tgnet.g.ey;
import org.vidogram.tgnet.g.fg;
import org.vidogram.tgnet.g.fi;
import org.vidogram.tgnet.g.fp;
import org.vidogram.tgnet.g.gu;
import org.vidogram.tgnet.g.hq;
import org.vidogram.tgnet.g.hs;
import org.vidogram.tgnet.g.hz;
import org.vidogram.tgnet.g.i;
import org.vidogram.tgnet.g.ie;
import org.vidogram.tgnet.g.im;
import org.vidogram.tgnet.g.in;
import org.vidogram.tgnet.g.ip;
import org.vidogram.tgnet.g.ir;
import org.vidogram.tgnet.g.j;
import org.vidogram.tgnet.g.ja;
import org.vidogram.tgnet.g.jb;
import org.vidogram.tgnet.g.ji;
import org.vidogram.tgnet.g.k;
import org.vidogram.tgnet.g.kn;
import org.vidogram.tgnet.g.l;
import org.vidogram.tgnet.g.lr;
import org.vidogram.tgnet.g.ls;
import org.vidogram.tgnet.g.ly;
import org.vidogram.tgnet.g.lz;
import org.vidogram.tgnet.g.mc;
import org.vidogram.tgnet.g.md;
import org.vidogram.tgnet.g.me;
import org.vidogram.tgnet.g.mj;
import org.vidogram.tgnet.g.mn;
import org.vidogram.tgnet.g.mr;
import org.vidogram.tgnet.g.mt;
import org.vidogram.tgnet.g.mu;
import org.vidogram.tgnet.g.mz;
import org.vidogram.tgnet.g.ne;
import org.vidogram.tgnet.g.nh;
import org.vidogram.tgnet.g.nm;
import org.vidogram.tgnet.g.nn;
import org.vidogram.tgnet.g.nz;
import org.vidogram.tgnet.g.ob;
import org.vidogram.tgnet.g.oi;
import org.vidogram.tgnet.g.px;
import org.vidogram.tgnet.g.q;
import org.vidogram.tgnet.g.qe;
import org.vidogram.tgnet.g.r;
import org.vidogram.tgnet.g.rl;
import org.vidogram.tgnet.g.rt;
import org.vidogram.tgnet.g.s;
import org.vidogram.tgnet.g.sg;
import org.vidogram.tgnet.g.t;
import org.vidogram.tgnet.g.vq;
import org.vidogram.tgnet.g.vr;
import org.vidogram.tgnet.g.vs;
import org.vidogram.tgnet.g.vw;
import org.vidogram.tgnet.g.wb;
import org.vidogram.tgnet.g.x;
import org.vidogram.ui.Components.BackupImageView;
import org.vidogram.ui.Components.URLSpanBotCommand;
import org.vidogram.ui.Components.URLSpanNoUnderline;
import org.vidogram.ui.Components.URLSpanReplacement;
import org.vidogram.ui.Components.URLSpanUserMention;
import org.vidogram.ui.Components.ao;
import org.vidogram.ui.Components.aw;
import org.vidogram.ui.Components.aw.a;
import org.vidogram.ui.Components.aw.b;
import org.vidogram.ui.Components.aw.c;
import org.vidogram.ui.Components.bd;
import org.vidogram.ui.Components.bf;
import org.vidogram.ui.Components.bg;
import org.vidogram.ui.Components.bl;
import org.vidogram.ui.Components.bl.b;
import org.vidogram.ui.Components.bt;
import org.vidogram.ui.Components.e.a;
import org.vidogram.ui.Components.f.c;
import org.vidogram.ui.Components.o;
import org.vidogram.ui.a.a.a;
import org.vidogram.ui.a.d.b;
import org.vidogram.ui.a.h.d;
import org.vidogram.ui.b.n.a;
import org.vidogram.ui.b.n.b;
import org.vidogram.ui.b.p;
import org.vidogram.ui.b.p.b;
import org.vidogram.ui.c.f.a;
import org.vidogram.ui.c.h.a;
import org.vidogram.ui.c.i;
import org.vidogram.ui.c.j.b;

public class q extends org.vidogram.ui.a.g
  implements y.b, am.d, v.a
{
  private static boolean cn;
  private static boolean co;
  private org.vidogram.ui.a.d A;
  private o B;
  private AnimatorSet C;
  private TextView D;
  private aw E;
  private LinearLayoutManager F;
  private a G;
  private TextView H;
  private FrameLayout I;
  private FrameLayout J;
  private org.vidogram.ui.Components.h K;
  private ArrayList<View> L = new ArrayList();
  private org.vidogram.ui.Components.g M;
  private TextView N;
  private org.vidogram.ui.Components.ac O;
  private FrameLayout P;
  private org.vidogram.ui.a.k Q;
  private org.vidogram.ui.a.k R;
  private aw S;
  private aw.b T;
  private aw.b U;
  private p V;
  private FrameLayout W;
  private TextView X;
  private FrameLayout Y;
  private boolean Z;
  private TextView aA;
  private TextView aB;
  private FrameLayout aC;
  private ImageView aD;
  private ImageView aE;
  private org.vidogram.ui.a.k aF;
  private boolean aG;
  private int aH;
  private int aI;
  private int aJ;
  private boolean aK;
  private u aL;
  private int aM;
  private ObjectAnimator aN;
  private AnimatorSet aO;
  private boolean aP;
  private boolean aQ;
  private boolean aR;
  private boolean aS;
  private boolean aT = true;
  private AnimatorSet aU;
  private u aV;
  private ArrayList<u> aW;
  private u aX;
  private u aY;
  private int aZ;
  private TextView aa;
  private BackupImageView ab;
  private org.vidogram.ui.a.k ac;
  private org.vidogram.ui.a.k ad;
  private ImageView ae;
  private org.vidogram.ui.b.n af;
  private FrameLayout ag;
  private aw ah;
  private LinearLayoutManager ai;
  private org.vidogram.ui.Components.r aj;
  private AnimatorSet ak;
  private org.vidogram.ui.Components.f al;
  private LinearLayout am;
  private AnimatorSet an;
  private TextView ao;
  private TextView ap;
  private FrameLayout aq;
  private ao ar;
  private TextView as;
  private View at;
  private FrameLayout au;
  private AnimatorSet av;
  private BackupImageView aw;
  private org.vidogram.ui.a.k ax;
  private org.vidogram.ui.a.k ay;
  private FrameLayout az;
  private int[] bA = { 2147483647, 2147483647 };
  private int[] bB = { -2147483648, -2147483648 };
  private int[] bC = { -2147483648, -2147483648 };
  private int[] bD = new int[2];
  private boolean[] bE = new boolean[2];
  private boolean[] bF = new boolean[2];
  private boolean[] bG = { 1, 1 };
  private boolean bH;
  private boolean bI = true;
  private int bJ;
  private int bK = 0;
  private long bL;
  private int bM;
  private boolean bN;
  private int bO;
  private int bP;
  private boolean bQ = true;
  private int bR;
  private int bS;
  private boolean bT;
  private u bU;
  private u bV;
  private int bW = 2147483647;
  private int bX = -10000;
  private String bY;
  private HashMap<Integer, g.b> bZ = new HashMap();
  private boolean ba = true;
  private boolean bb = false;
  private boolean bc = false;
  private g.x bd;
  private g.x be;
  private int bf;
  private g.wb bg;
  private ArrayList<CharSequence> bh;
  private String bi;
  private Runnable bj;
  private boolean bk;
  private int bl;
  private int bm;
  private boolean bn;
  private boolean bo;
  private boolean bp;
  private long bq;
  private int br;
  private boolean bs;
  private HashMap<Integer, u>[] bt = { new HashMap(), new HashMap() };
  private HashMap<Integer, u>[] bu = { new HashMap(), new HashMap() };
  private int bv;
  private ArrayList<Integer> bw = new ArrayList();
  private int bx;
  private HashMap<Integer, u>[] by = { new HashMap(), new HashMap() };
  private HashMap<String, ArrayList<u>> bz = new HashMap();
  private String ca;
  private long cb;
  private u cc;
  private u cd;
  private int ce;
  private boolean cf;
  private long cg = 0L;
  private long ch = 0L;
  private String ci = null;
  private Runnable cj = null;
  private float ck = 0.0F;
  private float cl = 0.0F;
  private Boolean cm = Boolean.valueOf(false);
  private ImageView cp;
  private boolean cq;
  private ArrayList<Object> cr;
  private am.d cs = new am.d()
  {
    public int A()
    {
      return 0;
    }

    public am.e a(u paramu, g.x paramx, int paramInt)
    {
      if ((paramInt < 0) || (paramInt >= q.a(q.this).size()))
        return null;
      int i = q.b(q.this).getChildCount();
      Object localObject = q.a(q.this).get(paramInt);
      paramInt = 0;
      if (paramInt < i)
      {
        paramx = q.b(q.this).getChildAt(paramInt);
        if (!(paramx instanceof org.vidogram.ui.c.m))
          break label196;
        paramu = (org.vidogram.ui.c.m)paramx;
        if (paramu.getResult() != localObject)
          break label196;
      }
      label196: for (paramu = paramu.getPhotoImage(); ; paramu = null)
      {
        if (paramu != null)
        {
          localObject = new int[2];
          paramx.getLocationInWindow(localObject);
          paramx = new am.e();
          paramx.b = localObject[0];
          i = localObject[1];
          if (Build.VERSION.SDK_INT >= 21);
          for (paramInt = 0; ; paramInt = org.vidogram.messenger.a.a)
          {
            paramx.c = (i - paramInt);
            paramx.d = q.b(q.this);
            paramx.a = paramu;
            paramx.e = paramu.h();
            paramx.h = paramu.D();
            return paramx;
          }
        }
        paramInt += 1;
        break;
        return null;
      }
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
      if ((paramInt < 0) || (paramInt >= q.a(q.this).size()))
        return;
      q.a(q.this, (g.d)q.a(q.this).get(paramInt));
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
      return false;
    }
  };
  protected g.i i;
  protected g.vw j;
  protected g.t k;
  protected org.vidogram.ui.Components.e l;
  protected ArrayList<u> m = new ArrayList();
  protected g.j n = null;
  aw.c o = new aw.c()
  {
    public boolean a(View paramView, int paramInt)
    {
      int i = 0;
      if (!q.c(q.this).f())
      {
        q.a(q.this, paramView, false);
        i = 1;
      }
      return i;
    }
  };
  aw.b p = new aw.b()
  {
    public void a(View paramView, int paramInt)
    {
      if (q.d(q.this).f())
      {
        q.a(q.this, paramView);
        return;
      }
      q.a(q.this, paramView, true);
    }
  };
  private boolean q = false;
  private ArrayList<org.vidogram.ui.c.j> r = new ArrayList();
  private Dialog s;
  private FrameLayout t;
  private FrameLayout u;
  private View v;
  private org.vidogram.ui.a.d w;
  private org.vidogram.ui.a.d x;
  private org.vidogram.ui.a.d y;
  private org.vidogram.ui.a.d z;

  public q(Bundle paramBundle)
  {
    super(paramBundle);
  }

  private void C()
  {
    if (this.ah.getChildCount() <= 0)
    {
      this.aH = 0;
      this.aJ = -1;
    }
    label160: label163: 
    while (true)
    {
      return;
      Object localObject = this.ah.getChildAt(this.ah.getChildCount() - 1);
      n.a locala = (n.a)this.ah.c((View)localObject);
      if (locala != null)
      {
        this.aJ = locala.e();
        this.aI = ((View)localObject).getTop();
        localObject = this.ah.getChildAt(0);
        locala = (n.a)this.ah.c((View)localObject);
        if ((((View)localObject).getTop() <= 0) || (locala == null) || (locala.e() != 0))
          break label160;
      }
      for (int i1 = ((View)localObject).getTop(); ; i1 = 0)
      {
        if (this.aH == i1)
          break label163;
        localObject = this.ah;
        this.aH = i1;
        ((aw)localObject).setTopGlowOffset(i1);
        this.ah.invalidate();
        this.ag.invalidate();
        return;
        this.aJ = -1;
        break;
      }
    }
  }

  private void D()
  {
    boolean bool = false;
    URLSpanBotCommand.a = false;
    if ((this.j != null) && (this.j.r))
      URLSpanBotCommand.a = true;
    do
      while (true)
      {
        return;
        if (!(this.n instanceof g.fi))
          break;
        int i1 = 0;
        while (i1 < this.n.t.e.size())
        {
          Object localObject = (g.k)this.n.t.e.get(i1);
          localObject = org.vidogram.messenger.v.a().a(Integer.valueOf(((g.k)localObject).b));
          if ((localObject != null) && (((g.vw)localObject).r))
          {
            URLSpanBotCommand.a = true;
            return;
          }
          i1 += 1;
        }
      }
    while (!(this.n instanceof g.dl));
    if (!this.n.p.isEmpty())
      bool = true;
    URLSpanBotCommand.a = bool;
  }

  private void E()
  {
    if (l() == null);
    do
      return;
    while (this.al != null);
    this.al = new org.vidogram.ui.Components.f(l(), this);
    this.al.a(new f.c()
    {
      public View a()
      {
        return q.aT(q.this);
      }

      public void a(int paramInt)
      {
        if (q.this.l() == null);
        while (true)
        {
          return;
          if (paramInt != 7)
            break;
          q.u(q.this).dismiss();
          Object localObject = q.u(q.this).n();
          if (((HashMap)localObject).isEmpty())
            continue;
          ArrayList localArrayList1 = new ArrayList();
          ArrayList localArrayList2 = new ArrayList();
          ArrayList localArrayList3 = new ArrayList();
          Iterator localIterator = ((HashMap)localObject).entrySet().iterator();
          if (localIterator.hasNext())
          {
            MediaController.i locali = (MediaController.i)((Map.Entry)localIterator.next()).getValue();
            if (locali.g != null)
            {
              localArrayList1.add(locali.g);
              if (locali.i != null)
              {
                localObject = locali.i.toString();
                label149: localArrayList2.add(localObject);
                if (locali.j.isEmpty())
                  break label221;
                localObject = new ArrayList(locali.j);
                label180: localArrayList3.add(localObject);
              }
            }
            label221: 
            do
            {
              locali.g = null;
              locali.f = null;
              locali.i = null;
              locali.j.clear();
              break;
              localObject = null;
              break label149;
              localObject = null;
              break label180;
            }
            while (locali.d == null);
            localArrayList1.add(locali.d);
            if (locali.i != null)
            {
              localObject = locali.i.toString();
              label263: localArrayList2.add(localObject);
              if (locali.j.isEmpty())
                break label309;
            }
            label309: for (localObject = new ArrayList(locali.j); ; localObject = null)
            {
              localArrayList3.add(localObject);
              break;
              localObject = null;
              break label263;
            }
          }
          org.vidogram.messenger.ac.a(localArrayList1, null, q.o(q.this), q.q(q.this), localArrayList2, localArrayList3);
          q.this.a(false, null, null, null, false, true);
          org.vidogram.messenger.d.b.a(q.o(q.this), true);
          return;
        }
        if (q.u(q.this) != null)
          q.u(q.this).a(paramInt);
        q.e(q.this, paramInt);
      }

      public void a(g.vw paramvw)
      {
        if ((q.this.l == null) || (paramvw.g == null) || (paramvw.g.length() == 0))
          return;
        q.this.l.setFieldText("@" + paramvw.g + " ");
        q.this.l.m();
      }
    });
  }

  private void F()
  {
    if ((this.l == null) || (l() == null) || (this.V != null) || ((this.k != null) && (org.vidogram.messenger.a.c(this.k.o) < 23)))
      return;
    if (this.V != null)
      this.V.d();
    this.S.setPadding(org.vidogram.messenger.a.a(18.0F), 0, org.vidogram.messenger.a.a(18.0F), 0);
    aw localaw = this.S;
    Object localObject = new p(l(), new p.b()
    {
      public void a(boolean paramBoolean)
      {
        float f2 = 1.0F;
        if (((paramBoolean) && (q.aH(q.this).getVisibility() == 0)) || ((!paramBoolean) && (q.aH(q.this).getVisibility() == 8)));
        label165: label249: label254: 
        do
        {
          return;
          Object localObject;
          int i;
          FrameLayout localFrameLayout;
          float f1;
          if (paramBoolean)
          {
            q.aN(q.this).a(0);
            localObject = q.aH(q.this);
            if (q.ar(q.this))
            {
              i = 0;
              ((FrameLayout)localObject).setVisibility(i);
            }
          }
          else
          {
            if (q.aU(q.this) != null)
            {
              q.aU(q.this).cancel();
              q.b(q.this, null);
            }
            if (q.aH(q.this).getVisibility() == 4)
              continue;
            q.b(q.this, new AnimatorSet());
            localObject = q.aU(q.this);
            localFrameLayout = q.aH(q.this);
            if (!paramBoolean)
              break label249;
            f1 = 0.0F;
            if (!paramBoolean)
              break label254;
          }
          while (true)
          {
            ((AnimatorSet)localObject).playTogether(new Animator[] { ObjectAnimator.ofFloat(localFrameLayout, "alpha", new float[] { f1, f2 }) });
            q.aU(q.this).setDuration(150L);
            q.aU(q.this).addListener(new org.vidogram.messenger.b(paramBoolean)
            {
              public void onAnimationCancel(Animator paramAnimator)
              {
                if ((q.aU(q.this) != null) && (q.aU(q.this).equals(paramAnimator)))
                  q.b(q.this, null);
              }

              public void onAnimationEnd(Animator paramAnimator)
              {
                if ((q.aU(q.this) != null) && (q.aU(q.this).equals(paramAnimator)))
                {
                  if (!this.a)
                  {
                    q.ay(q.this).e();
                    q.aH(q.this).setVisibility(8);
                    if (ax.a().c())
                      ax.a().d();
                    ax.a().b();
                  }
                  q.b(q.this, null);
                }
              }
            });
            q.aU(q.this).start();
            return;
            i = 4;
            break;
            f1 = 1.0F;
            break label165;
            f2 = 0.0F;
          }
        }
        while (paramBoolean);
        q.aH(q.this).setVisibility(8);
      }
    });
    this.V = ((p)localObject);
    localaw.setAdapter((RecyclerView.a)localObject);
    localaw = this.S;
    localObject = new aw.b()
    {
      public void a(View paramView, int paramInt)
      {
        paramView = q.ay(q.this).e(paramInt);
        if ((paramView instanceof g.hs))
        {
          org.vidogram.messenger.ac.a().a(paramView, q.o(q.this), q.q(q.this));
          q.this.a(false, null, null, null, false, true);
          q.this.l.b(paramView);
        }
        q.this.l.setFieldText("");
      }
    };
    this.T = ((aw.b)localObject);
    localaw.setOnItemClickListener((aw.b)localObject);
  }

  private void G()
  {
    Object localObject = ApplicationLoader.a.getSharedPreferences("mainconfig", 0);
    if (((SharedPreferences)localObject).getBoolean("gifhint", false));
    int i1;
    do
    {
      while (true)
      {
        return;
        ((SharedPreferences)localObject).edit().putBoolean("gifhint", true).commit();
        if ((l() == null) || (this.b == null) || (this.as != null))
          continue;
        if (this.aT)
          break;
        if (this.l == null)
          continue;
        this.l.a();
        return;
      }
      localObject = (bg)this.b;
      i1 = ((bg)localObject).indexOfChild(this.l);
    }
    while (i1 == -1);
    this.l.a();
    this.at = new View(l());
    this.at.setBackgroundResource(2130838107);
    ((bg)localObject).addView(this.at, i1 + 1, org.vidogram.ui.Components.v.a(10, 10.0F, 83, 30.0F, 0.0F, 0.0F, 27.0F));
    this.as = new TextView(l());
    this.as.setBackgroundResource(2130838190);
    this.as.setTextColor(-1);
    this.as.setTextSize(1, 14.0F);
    this.as.setPadding(org.vidogram.messenger.a.a(10.0F), 0, org.vidogram.messenger.a.a(10.0F), 0);
    this.as.setText(org.vidogram.messenger.r.a("TapHereGifs", 2131231885));
    this.as.setGravity(16);
    ((bg)localObject).addView(this.as, i1 + 1, org.vidogram.ui.Components.v.a(-2, 32.0F, 83, 5.0F, 0.0F, 0.0F, 3.0F));
    localObject = new AnimatorSet();
    ((AnimatorSet)localObject).playTogether(new Animator[] { ObjectAnimator.ofFloat(this.as, "alpha", new float[] { 0.0F, 1.0F }), ObjectAnimator.ofFloat(this.at, "alpha", new float[] { 0.0F, 1.0F }) });
    ((AnimatorSet)localObject).addListener(new org.vidogram.messenger.b()
    {
      public void onAnimationEnd(Animator paramAnimator)
      {
        org.vidogram.messenger.a.a(new Runnable()
        {
          public void run()
          {
            if (q.V(q.this) == null)
              return;
            AnimatorSet localAnimatorSet = new AnimatorSet();
            localAnimatorSet.playTogether(new Animator[] { ObjectAnimator.ofFloat(q.V(q.this), "alpha", new float[] { 0.0F }) });
            localAnimatorSet.addListener(new org.vidogram.messenger.b()
            {
              public void onAnimationEnd(Animator paramAnimator)
              {
                if (q.V(q.this) != null)
                  q.V(q.this).setVisibility(8);
              }
            });
            localAnimatorSet.setDuration(300L);
            localAnimatorSet.start();
          }
        }
        , 2000L);
      }
    });
    ((AnimatorSet)localObject).setDuration(300L);
    ((AnimatorSet)localObject).start();
  }

  private void H()
  {
    if ((this.aR) && (this.af != null) && (this.af.r()))
    {
      if ((this.aS) || (this.aT))
        break label159;
      if ((this.ag.getVisibility() == 0) && (this.ag.getTag() == null))
      {
        if (this.ak != null)
          this.ak.cancel();
        this.ag.setTag(Integer.valueOf(1));
        this.ak = new AnimatorSet();
        this.ak.playTogether(new Animator[] { ObjectAnimator.ofFloat(this.ag, "alpha", new float[] { 0.0F }) });
        this.ak.addListener(new org.vidogram.messenger.b()
        {
          public void onAnimationCancel(Animator paramAnimator)
          {
            if ((q.aq(q.this) != null) && (q.aq(q.this).equals(paramAnimator)))
              q.a(q.this, null);
          }

          public void onAnimationEnd(Animator paramAnimator)
          {
            if ((q.aq(q.this) != null) && (q.aq(q.this).equals(paramAnimator)))
            {
              q.O(q.this).setVisibility(4);
              q.a(q.this, null);
            }
          }
        });
        this.ak.setDuration(200L);
        this.ak.start();
      }
    }
    label159: 
    do
      return;
    while ((this.ag.getVisibility() != 4) && (this.ag.getTag() == null));
    if (this.ak != null)
      this.ak.cancel();
    this.ag.setTag(null);
    this.ag.setVisibility(0);
    this.ak = new AnimatorSet();
    this.ak.playTogether(new Animator[] { ObjectAnimator.ofFloat(this.ag, "alpha", new float[] { 0.0F, 1.0F }) });
    this.ak.addListener(new org.vidogram.messenger.b()
    {
      public void onAnimationCancel(Animator paramAnimator)
      {
        if ((q.aq(q.this) != null) && (q.aq(q.this).equals(paramAnimator)))
          q.a(q.this, null);
      }

      public void onAnimationEnd(Animator paramAnimator)
      {
        if ((q.aq(q.this) != null) && (q.aq(q.this).equals(paramAnimator)))
          q.a(q.this, null);
      }
    });
    this.ak.setDuration(200L);
    this.ak.start();
  }

  private void I()
  {
    if ((this.E != null) && (!this.m.isEmpty()))
      this.F.a(this.m.size() - 1, -100000 - this.E.getPaddingTop());
  }

  private void J()
  {
    this.m.clear();
    this.bz.clear();
    this.bw.clear();
    FrameLayout localFrameLayout = this.t;
    int i1;
    if (a.b(this.G) == -1)
    {
      i1 = 0;
      localFrameLayout.setVisibility(i1);
      this.E.setEmptyView(null);
      i1 = 0;
      label54: if (i1 >= 2)
        break label163;
      this.by[i1].clear();
      if (this.k != null)
        break label142;
      this.bA[i1] = 2147483647;
      this.bB[i1] = -2147483648;
    }
    while (true)
    {
      this.bC[i1] = -2147483648;
      this.bD[i1] = 0;
      this.bE[i1] = false;
      this.bF[i1] = false;
      this.bG[i1] = true;
      i1 += 1;
      break label54;
      i1 = 4;
      break;
      label142: this.bA[i1] = -2147483648;
      this.bB[i1] = 2147483647;
    }
    label163: this.bQ = true;
    this.bI = true;
    this.bH = true;
    this.bT = false;
    this.aQ = false;
    this.bM = 0;
    this.bK = 0;
    this.bN = false;
    this.G.c();
  }

  private void K()
  {
    if (this.E == null)
      return;
    int i5 = this.E.getChildCount();
    if (this.l.b())
      org.vidogram.messenger.a.a(48.0F);
    int i6 = this.E.getMeasuredHeight();
    int i1 = 0;
    label45: Object localObject;
    if (i1 < i5)
    {
      localObject = this.E.getChildAt(i1);
      if ((localObject instanceof org.vidogram.ui.c.j))
      {
        localObject = (org.vidogram.ui.c.j)localObject;
        i2 = ((org.vidogram.ui.c.j)localObject).getTop();
        ((org.vidogram.ui.c.j)localObject).getBottom();
        if (i2 < 0)
          break label132;
      }
    }
    label132: for (int i2 = 0; ; i2 = -i2)
    {
      int i4 = ((org.vidogram.ui.c.j)localObject).getMeasuredHeight();
      int i3 = i4;
      if (i4 > i6)
        i3 = i2 + i6;
      ((org.vidogram.ui.c.j)localObject).a(i2, i3 - i2);
      i1 += 1;
      break label45;
      break;
    }
  }

  private void L()
  {
    int i1 = 1;
    if (this.u == null)
      return;
    if ((this.k == null) || (this.K == null))
    {
      this.u.setVisibility(4);
      return;
    }
    if ((this.k instanceof g.ip))
    {
      this.N.setText(org.vidogram.messenger.r.a("EncryptionProcessing", 2131231176));
      this.u.setVisibility(0);
    }
    while (true)
    {
      Y();
      if (i1 != 0)
      {
        this.l.c(false);
        if (l() != null)
          org.vidogram.messenger.a.b(l().getCurrentFocus());
      }
      M();
      return;
      if ((this.k instanceof g.ir))
      {
        this.N.setText(org.vidogram.messenger.a.b(org.vidogram.messenger.r.a("AwaitingEncryption", 2131230912, new Object[] { "<b>" + this.j.e + "</b>" })));
        this.u.setVisibility(0);
        continue;
      }
      if ((this.k instanceof g.in))
      {
        this.N.setText(org.vidogram.messenger.r.a("EncryptionRejected", 2131231177));
        this.u.setVisibility(0);
        this.l.setFieldText("");
        org.vidogram.messenger.d.b.a(this.bq, false);
        continue;
      }
      if ((this.k instanceof g.im))
        this.u.setVisibility(4);
      i1 = 0;
    }
  }

  private void M()
  {
    if (((this.k != null) && (!(this.k instanceof g.im))) || ((this.i != null) && (org.vidogram.messenger.e.c(this.i))) || ((this.j != null) && (ae.a(this.j))))
    {
      if (this.w != null)
        this.w.setVisibility(8);
      if (this.v != null)
        this.v.setVisibility(8);
      if (this.M != null)
        this.M.b();
    }
    while (true)
    {
      if ((this.M != null) && (this.k != null))
        this.M.setTime(this.k.n);
      R();
      return;
      if (this.w != null)
        this.w.setVisibility(0);
      if (this.v != null)
        this.v.setVisibility(0);
      if (this.M == null)
        continue;
      this.M.a();
    }
  }

  private void N()
  {
    if (!this.d.f());
    do
      return;
    while ((this.bt[0].isEmpty()) && (this.bt[1].isEmpty()));
    this.O.a(this.bt[0].size() + this.bt[1].size(), true);
  }

  private void O()
  {
    if (this.M == null);
    do
    {
      return;
      if (this.i == null)
        continue;
      this.M.setTitle(this.i.i);
      return;
    }
    while (this.j == null);
    if (this.j.n)
    {
      this.M.setTitle(org.vidogram.messenger.r.a("ChatYourSelfName", 2131231060));
      return;
    }
    if ((this.j.d / 1000 != 777) && (this.j.d / 1000 != 333) && (org.vidogram.messenger.f.a().f.get(this.j.d) == null) && ((org.vidogram.messenger.f.a().f.size() != 0) || (!org.vidogram.messenger.f.a().j())))
    {
      if ((this.j.i != null) && (this.j.i.length() != 0))
      {
        this.M.setTitle(org.vidogram.a.b.a().e("+" + this.j.i));
        return;
      }
      this.M.setTitle(ae.c(this.j));
      return;
    }
    this.M.setTitle(ae.c(this.j));
  }

  private void P()
  {
    if ((this.y == null) || (this.j == null) || (this.k != null) || (!this.j.r))
      return;
    int i2;
    int i4;
    int i3;
    label100: g.cy localcy;
    if (!this.bZ.isEmpty())
    {
      Iterator localIterator = this.bZ.entrySet().iterator();
      i2 = 0;
      i1 = 0;
      i4 = i2;
      i3 = i1;
      if (!localIterator.hasNext())
        break label208;
      g.b localb = (g.b)((Map.Entry)localIterator.next()).getValue();
      i4 = 0;
      i3 = i2;
      if (i4 >= localb.d.size())
        break label258;
      localcy = (g.cy)localb.d.get(i4);
      if (localcy.c.toLowerCase().equals("help"))
      {
        i2 = 1;
        label147: if ((i3 == 0) || (i2 == 0))
          break label192;
      }
    }
    for (int i1 = i3; ; i1 = i3)
    {
      i3 = i2;
      i2 = i1;
      i1 = i3;
      break;
      i2 = i1;
      if (!localcy.c.toLowerCase().equals("settings"))
        break label147;
      i3 = 1;
      i2 = i1;
      break label147;
      label192: i4 += 1;
      i1 = i2;
      break label100;
      i4 = 0;
      i3 = 0;
      label208: if (i3 != 0)
        this.y.b(30);
      while (i4 != 0)
      {
        this.y.b(31);
        return;
        this.y.a(30);
      }
      this.y.a(31);
      return;
      label258: i2 = i1;
    }
  }

  private void Q()
  {
    int i2 = 0;
    if (this.M == null)
      return;
    if (org.vidogram.messenger.v.a().a(this.bq));
    for (int i1 = 2130838000; ; i1 = 0)
    {
      org.vidogram.ui.Components.g localg = this.M;
      if (this.k != null)
        i2 = 2130837847;
      localg.a(i2, i1);
      if (this.X == null)
        break;
      if (i1 == 0)
        break label82;
      this.X.setText(org.vidogram.messenger.r.a("UnmuteNotifications", 2131231914));
      return;
    }
    label82: this.X.setText(org.vidogram.messenger.r.a("MuteNotifications", 2131231468));
  }

  private void R()
  {
    Object localObject;
    if (this.j != null)
    {
      localObject = org.vidogram.messenger.v.a().a(Integer.valueOf(this.j.d));
      if (localObject != null);
    }
    label83: 
    while (true)
    {
      return;
      this.j = ((g.vw)localObject);
      while (true)
      {
        if (this.M == null)
          break label83;
        this.M.d();
        return;
        if (this.i == null)
          continue;
        localObject = org.vidogram.messenger.v.a().b(Integer.valueOf(this.i.h));
        if (localObject == null)
          break;
        this.i = ((g.i)localObject);
      }
    }
  }

  private void S()
  {
    if (l() == null)
      return;
    Toast.makeText(l(), org.vidogram.messenger.r.a("UnsupportedAttachment", 2131231918), 0).show();
  }

  private void T()
  {
    if (this.bU != null)
    {
      boolean[] arrayOfBoolean = this.bG;
      this.bG[1] = true;
      arrayOfBoolean[0] = true;
      this.bS = 0;
      this.bK = 0;
      this.bR = 0;
      g(this.bU);
      this.bU = null;
    }
  }

  private void U()
  {
    if (this.H == null)
      return;
    if (this.i != null)
      if ((org.vidogram.messenger.e.d(this.i)) && (!(this.i instanceof g.dj)))
        if (org.vidogram.messenger.e.c(this.i))
        {
          this.H.setText(org.vidogram.messenger.r.a("ChannelJoin", 2131230986));
          if ((this.z == null) || (this.z.getVisibility() != 0))
            break label384;
          this.aC.setVisibility(0);
          this.I.setVisibility(4);
          this.l.setFieldFocused(false);
          this.l.setVisibility(4);
        }
    label302: label571: 
    while (true)
    {
      Y();
      return;
      if (!org.vidogram.messenger.v.a().a(this.bq))
      {
        this.H.setText(org.vidogram.messenger.r.a("ChannelMute", 2131231018));
        break;
      }
      this.H.setText(org.vidogram.messenger.r.a("ChannelUnmute", 2131231037));
      break;
      this.H.setText(org.vidogram.messenger.r.a("DeleteThisGroup", 2131231136));
      break;
      if (this.q)
      {
        if (this.j.r)
          this.H.setText(org.vidogram.messenger.r.a("BotUnblock", 2131230935));
        while (true)
        {
          if (this.cc == null)
            break label302;
          this.cc = null;
          if (this.l == null)
            break;
          if ((this.aY != null) && (this.cd == this.aY))
          {
            this.cd = null;
            a(false, null, null, null, false, true);
          }
          this.l.b(this.cc, false);
          break;
          this.H.setText(org.vidogram.messenger.r.a("Unblock", 2131231909));
        }
        break;
      }
      if ((this.ca != null) && (this.j.r))
      {
        this.H.setText(org.vidogram.messenger.r.a("BotStart", 2131230931));
        this.l.c(false);
        if (l() == null)
          break;
        org.vidogram.messenger.a.b(l().getCurrentFocus());
        break;
      }
      this.H.setText(org.vidogram.messenger.r.a("DeleteThisChat", 2131231135));
      break;
      this.aC.setVisibility(4);
      if (((this.i != null) && ((org.vidogram.messenger.e.c(this.i)) || (!org.vidogram.messenger.e.e(this.i)))) || ((this.j != null) && ((ae.a(this.j)) || (this.q))))
      {
        this.I.setVisibility(0);
        if (this.X != null)
          this.X.setVisibility(8);
        this.l.setFieldFocused(false);
        this.l.setVisibility(4);
        this.x.setVisibility(8);
        this.y.setVisibility(0);
        continue;
      }
      if ((this.ca != null) && (this.j.r))
      {
        this.I.setVisibility(0);
        this.l.setVisibility(4);
      }
      while (true)
      {
        if (this.X == null)
          break label571;
        this.X.setVisibility(0);
        break;
        this.l.setVisibility(0);
        this.I.setVisibility(4);
      }
    }
  }

  private void V()
  {
    if (this.am == null)
      return;
    int i1;
    if (ApplicationLoader.a.getSharedPreferences("Notifications", 0).getInt("spam3_" + this.bq, 0) == 2)
    {
      i1 = 1;
      if (i1 == 0)
        break label371;
      if (!this.m.isEmpty())
        break label200;
      i1 = 0;
    }
    label200: label371: 
    while (true)
    {
      if (i1 == 0)
        if (this.am.getTag() == null)
        {
          this.am.setTag(Integer.valueOf(1));
          if (this.an != null)
            this.an.cancel();
          this.an = new AnimatorSet();
          this.an.playTogether(new Animator[] { ObjectAnimator.ofFloat(this.am, "translationY", new float[] { -org.vidogram.messenger.a.a(50.0F) }) });
          this.an.setDuration(200L);
          this.an.addListener(new org.vidogram.messenger.b()
          {
            public void onAnimationCancel(Animator paramAnimator)
            {
              if ((q.bk(q.this) != null) && (q.bk(q.this).equals(paramAnimator)))
                q.e(q.this, null);
            }

            public void onAnimationEnd(Animator paramAnimator)
            {
              if ((q.bk(q.this) != null) && (q.bk(q.this).equals(paramAnimator)))
              {
                q.bl(q.this).setVisibility(8);
                q.e(q.this, null);
              }
            }
          });
          this.an.start();
        }
      while (true)
      {
        X();
        return;
        i1 = 0;
        break;
        int i3 = this.m.size() - 1;
        int i2 = i3;
        while (true)
        {
          if (i2 < Math.max(i3 - 50, 0))
            break label371;
          if (((u)this.m.get(i2)).j())
          {
            i1 = 0;
            break;
          }
          i2 -= 1;
        }
        if (this.am.getTag() == null)
          continue;
        this.am.setTag(null);
        this.am.setVisibility(0);
        if (this.an != null)
          this.an.cancel();
        this.an = new AnimatorSet();
        this.an.playTogether(new Animator[] { ObjectAnimator.ofFloat(this.am, "translationY", new float[] { 0.0F }) });
        this.an.setDuration(200L);
        this.an.addListener(new org.vidogram.messenger.b()
        {
          public void onAnimationCancel(Animator paramAnimator)
          {
            if ((q.bk(q.this) != null) && (q.bk(q.this).equals(paramAnimator)))
              q.e(q.this, null);
          }

          public void onAnimationEnd(Animator paramAnimator)
          {
            if ((q.bk(q.this) != null) && (q.bk(q.this).equals(paramAnimator)))
              q.e(q.this, null);
          }
        });
        this.an.start();
      }
    }
  }

  private void W()
  {
    if (this.D == null)
      return;
    if (this.j == null)
      this.D.setVisibility(8);
    while (true)
    {
      X();
      return;
      g.vw localvw = org.vidogram.messenger.v.a().a(Integer.valueOf(this.j.d));
      if (localvw != null)
        this.j = localvw;
      if (((this.k != null) && (!(this.k instanceof g.im))) || (this.j.d / 1000 == 333) || (this.j.d / 1000 == 777) || (ae.a(this.j)) || (org.vidogram.messenger.f.a().j()) || ((this.j.i != null) && (this.j.i.length() != 0) && (org.vidogram.messenger.f.a().f.get(this.j.d) != null) && ((org.vidogram.messenger.f.a().f.size() != 0) || (!org.vidogram.messenger.f.a().j()))))
      {
        this.D.setVisibility(8);
        continue;
      }
      this.D.setVisibility(0);
      if ((this.j.i != null) && (this.j.i.length() != 0))
      {
        this.D.setText(org.vidogram.messenger.r.a("AddToContacts", 2131230826));
        this.ap.setPadding(org.vidogram.messenger.a.a(4.0F), 0, org.vidogram.messenger.a.a(50.0F), 0);
        this.ao.setVisibility(0);
        this.aq.setLayoutParams(org.vidogram.ui.Components.v.a(-1, -1, 0.5F, 51, 0, 0, 0, org.vidogram.messenger.a.a(1.0F)));
        continue;
      }
      this.D.setText(org.vidogram.messenger.r.a("ShareMyContactInfo", 2131231837));
      this.ao.setVisibility(8);
      this.ap.setPadding(org.vidogram.messenger.a.a(50.0F), 0, org.vidogram.messenger.a.a(50.0F), 0);
      this.aq.setLayoutParams(org.vidogram.ui.Components.v.a(-1, -1, 1.0F, 51, 0, 0, 0, org.vidogram.messenger.a.a(1.0F)));
    }
  }

  private void X()
  {
    org.vidogram.messenger.a.a(new Runnable()
    {
      public void run()
      {
        int i = 0;
        int k = 0;
        try
        {
          int j = q.aa(q.this).n();
          View localView;
          if (j != -1)
          {
            localView = q.aa(q.this).c(j);
            if (localView == null)
            {
              i = k;
              i -= q.L(q.this).getPaddingTop();
            }
          }
          else
          {
            if ((q.L(q.this).getPaddingTop() == org.vidogram.messenger.a.a(52.0F)) || (((q.bj(q.this) == null) || (q.bj(q.this).getTag() != null)) && ((q.bl(q.this) == null) || (q.bl(q.this).getTag() != null))))
              break label189;
            q.L(q.this).setPadding(0, org.vidogram.messenger.a.a(52.0F), 0, org.vidogram.messenger.a.a(3.0F));
            q.L(q.this).setTopGlowOffset(org.vidogram.messenger.a.a(48.0F));
            i -= org.vidogram.messenger.a.a(48.0F);
          }
          while (true)
          {
            if (j == -1)
              return;
            q.aa(q.this).a(j, i);
            return;
            i = localView.getTop();
            break;
            label189: if ((q.L(q.this).getPaddingTop() != org.vidogram.messenger.a.a(4.0F)) && ((q.bj(q.this) == null) || (q.bj(q.this).getTag() != null)) && ((q.bl(q.this) == null) || (q.bl(q.this).getTag() != null)))
            {
              q.L(q.this).setPadding(0, org.vidogram.messenger.a.a(4.0F), 0, org.vidogram.messenger.a.a(3.0F));
              q.L(q.this).setTopGlowOffset(0);
              k = org.vidogram.messenger.a.a(48.0F);
              i += k;
              continue;
            }
            j = -1;
          }
        }
        catch (Exception localException)
        {
          org.vidogram.messenger.n.a("tmessages", localException);
        }
      }
    });
  }

  private void Y()
  {
    if ((!ApplicationLoader.d) && ((this.I == null) || (this.I.getVisibility() != 0)) && ((this.u == null) || (this.u.getVisibility() != 0)) && ((this.aC == null) || (this.aC.getVisibility() != 0)))
    {
      MediaController.a().b(true);
      return;
    }
    MediaController.a().b(false);
  }

  private void Z()
  {
    if (this.k == null)
      return;
    ArrayList localArrayList = new ArrayList();
    int i1;
    if (this.E != null)
    {
      int i2 = this.E.getChildCount();
      i1 = 0;
      if (i1 < i2)
      {
        localObject = this.E.getChildAt(i1);
        if (!(localObject instanceof org.vidogram.ui.c.j))
          break label130;
      }
    }
    label130: for (Object localObject = ((org.vidogram.ui.c.j)localObject).getMessageObject(); ; localObject = null)
    {
      if ((localObject != null) && (((u)localObject).q() < 0) && (((u)localObject).a.C != 0L))
        localArrayList.add(Long.valueOf(((u)localObject).a.C));
      i1 += 1;
      break;
      MediaController.a().a(this.cg, this.ch, this.k, localArrayList);
      return;
    }
  }

  private String a(u paramu, int paramInt, boolean paramBoolean)
  {
    String str2 = "";
    String str1 = str2;
    Object localObject;
    if (paramBoolean)
    {
      str1 = str2;
      if (paramInt != paramu.a.c)
      {
        if (paramu.a.c <= 0)
          break label142;
        localObject = org.vidogram.messenger.v.a().a(Integer.valueOf(paramu.a.c));
        str1 = str2;
        if (localObject != null)
          str1 = org.vidogram.messenger.f.a(((g.vw)localObject).e, ((g.vw)localObject).f) + ":\n";
      }
    }
    while ((paramu.f == 0) && (paramu.a.i != null))
    {
      return str1 + paramu.a.i;
      label142: str1 = str2;
      if (paramu.a.c >= 0)
        continue;
      localObject = org.vidogram.messenger.v.a().b(Integer.valueOf(-paramu.a.c));
      str1 = str2;
      if (localObject == null)
        continue;
      str1 = ((g.i)localObject).i + ":\n";
    }
    if ((paramu.a.j != null) && (paramu.a.j.l != null))
      return str1 + paramu.a.j.l;
    return (String)(str1 + paramu.b);
  }

  private ArrayList<u> a(u paramu, boolean paramBoolean)
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(paramu);
    int i2 = paramu.q();
    if (i2 != 0)
    {
      int i1 = this.m.size() - 1;
      while (i1 >= 0)
      {
        paramu = (u)this.m.get(i1);
        if (((this.k == null) && (paramu.q() > i2)) || ((this.k != null) && (paramu.q() < i2) && (paramu.H()) && ((!paramBoolean) || ((paramu.n()) && (!paramu.j())))))
          localArrayList.add(paramu);
        i1 -= 1;
      }
    }
    return localArrayList;
  }

  private void a(int paramInt1, int paramInt2, int paramInt3)
  {
    float f2 = 1.0F;
    ImageView localImageView;
    boolean bool;
    label47: float f1;
    if (this.aD != null)
    {
      localImageView = this.aD;
      if ((paramInt1 & 0x1) == 0)
        break label122;
      bool = true;
      localImageView.setEnabled(bool);
      localImageView = this.aE;
      if ((paramInt1 & 0x2) == 0)
        break label128;
      bool = true;
      localImageView.setEnabled(bool);
      localImageView = this.aD;
      if (!this.aD.isEnabled())
        break label134;
      f1 = 1.0F;
      label73: localImageView.setAlpha(f1);
      localImageView = this.aE;
      if (!this.aE.isEnabled())
        break label142;
      f1 = f2;
    }
    while (true)
    {
      localImageView.setAlpha(f1);
      if (paramInt3 != 0)
        break label150;
      this.aF.setText("");
      return;
      label122: bool = false;
      break;
      label128: bool = false;
      break label47;
      label134: f1 = 0.5F;
      break label73;
      label142: f1 = 0.5F;
    }
    label150: this.aF.setText(org.vidogram.messenger.r.a("Of", 2131231605, new Object[] { Integer.valueOf(paramInt2 + 1), Integer.valueOf(paramInt3) }));
  }

  private void a(int paramInt1, int paramInt2, boolean paramBoolean, int paramInt3)
  {
    Object localObject1 = (u)this.by[paramInt3].get(Integer.valueOf(paramInt1));
    int i1;
    label114: int i2;
    label130: Object localObject2;
    if (localObject1 != null)
      if (this.m.indexOf(localObject1) != -1)
        if (paramBoolean)
        {
          this.bW = paramInt1;
          i1 = Math.max(0, (this.E.getHeight() - ((u)localObject1).C()) / 2);
          if (this.m.get(this.m.size() - 1) != localObject1)
            break label241;
          this.F.a(0, i1 + (-this.E.getPaddingTop() - org.vidogram.messenger.a.a(7.0F)));
          ac();
          i2 = this.E.getChildCount();
          i1 = 0;
          if (i1 >= i2)
            break label517;
          localObject2 = this.E.getChildAt(i1);
          if (!(localObject2 instanceof org.vidogram.ui.c.j))
            break label296;
          localObject2 = ((org.vidogram.ui.c.j)localObject2).getMessageObject();
          if ((localObject2 == null) || (((u)localObject2).q() != ((u)localObject1).q()))
            break label338;
          i1 = 1;
        }
    while (true)
    {
      label187: if (i1 == 0)
        c(true, true);
      i1 = 0;
      while (true)
      {
        if (i1 == 0)
          break label485;
        if ((this.k == null) || (org.vidogram.messenger.w.a().b(this.bq, this.bM)))
          break label359;
        return;
        this.bW = 2147483647;
        break;
        label241: this.F.a(a.c(this.G) + this.m.size() - this.m.indexOf(localObject1) - 1, i1 + (-this.E.getPaddingTop() - org.vidogram.messenger.a.a(7.0F)));
        break label114;
        label296: if ((localObject2 instanceof org.vidogram.ui.c.h))
        {
          localObject2 = ((org.vidogram.ui.c.h)localObject2).getMessageObject();
          if ((localObject2 != null) && (((u)localObject2).q() == ((u)localObject1).q()))
          {
            i1 = 1;
            break label187;
          }
        }
        label338: i1 += 1;
        break label130;
        i1 = 1;
        continue;
        i1 = 1;
      }
      label359: this.bw.clear();
      this.aQ = true;
      this.bW = 2147483647;
      this.bX = -10000;
      this.bM = paramInt1;
      this.bw.add(Integer.valueOf(this.br));
      localObject1 = org.vidogram.messenger.v.a();
      long l1;
      if (paramInt3 == 0)
      {
        l1 = this.bq;
        if (!org.vidogram.messenger.a.c())
          break label511;
      }
      label485: label511: for (paramInt1 = 30; ; paramInt1 = 20)
      {
        i1 = this.bM;
        i2 = this.e;
        boolean bool = org.vidogram.messenger.e.d(this.i);
        int i3 = this.br;
        this.br = (i3 + 1);
        ((org.vidogram.messenger.v)localObject1).a(l1, paramInt1, i1, true, 0, i2, 3, 0, bool, i3);
        this.bO = paramInt2;
        this.bP = paramInt3;
        this.bN = paramBoolean;
        return;
        l1 = this.bL;
        break;
      }
      label517: i1 = 0;
    }
  }

  private void a(View paramView)
  {
    u localu = null;
    if ((paramView instanceof org.vidogram.ui.c.j))
      localu = ((org.vidogram.ui.c.j)paramView).getMessageObject();
    while (true)
    {
      int i1 = c(localu);
      if ((i1 >= 2) && (i1 != 20))
        break;
      return;
      if (!(paramView instanceof org.vidogram.ui.c.h))
        continue;
      localu = ((org.vidogram.ui.c.h)paramView).getMessageObject();
    }
    d(localu);
    N();
    ac();
  }

  private void a(View paramView, boolean paramBoolean)
  {
    if (this.d.f());
    label288: label324: label465: label2652: 
    while (true)
    {
      return;
      if ((paramView instanceof org.vidogram.ui.c.j))
        paramView = ((org.vidogram.ui.c.j)paramView).getMessageObject();
      while (true)
      {
        if (paramView == null)
          break label2652;
        int i6 = c(paramView);
        if ((paramBoolean) && ((paramView.a.f instanceof g.mz)))
        {
          a(paramView.a.g, 0, true, 0);
          return;
          if ((paramView instanceof org.vidogram.ui.c.h))
          {
            paramView = ((org.vidogram.ui.c.h)paramView).getMessageObject();
            continue;
          }
        }
        else
        {
          this.aV = null;
          this.aX = null;
          int i1 = 1;
          while (i1 >= 0)
          {
            this.bu[i1].clear();
            this.bt[i1].clear();
            i1 -= 1;
          }
          this.bv = 0;
          this.d.d();
          h(true);
          int i5 = 1;
          int i2;
          int i3;
          int i4;
          Object localObject3;
          if ((paramView.u() != this.bL) && (paramView.q() > 0) && (org.vidogram.messenger.e.d(this.i)) && (this.i.r) && ((this.i.c) || (this.i.n)) && ((paramView.a.f == null) || ((paramView.a.f instanceof g.mt))))
          {
            i1 = 1;
            if ((paramView.u() == this.bL) || (this.n == null) || (this.n.s != paramView.q()) || ((!this.i.c) && (!this.i.n)))
              break label656;
            i2 = 1;
            if ((!paramView.a(this.i)) || (this.l.l()) || (paramView.u() == this.bL))
              break label662;
            i3 = 1;
            if (((this.k == null) || (org.vidogram.messenger.a.c(this.k.o) >= 46)) && ((i6 != 1) || (paramView.u() != this.bL)) && ((this.k != null) || (paramView.q() >= 0)) && (!this.bs))
            {
              i4 = i5;
              if (this.i == null)
                break label465;
              if (!org.vidogram.messenger.e.c(this.i))
              {
                i4 = i5;
                if (!org.vidogram.messenger.e.d(this.i))
                  break label465;
                i4 = i5;
                if (this.i.c)
                  break label465;
                i4 = i5;
                if (this.i.n)
                  break label465;
                i4 = i5;
                if (this.i.r)
                  break label465;
              }
            }
            i4 = 0;
            if ((!paramBoolean) && (i6 >= 2) && (i6 != 20))
              break label2429;
            if (i6 < 0)
              break;
            this.aV = paramView;
            if (l() == null)
              break;
            localObject1 = new AlertDialog.Builder(l());
            localObject2 = new ArrayList();
            localObject3 = new ArrayList();
            if (i6 != 0)
              break label668;
            ((ArrayList)localObject2).add(org.vidogram.messenger.r.a("Retry", 2131231749));
            ((ArrayList)localObject3).add(Integer.valueOf(0));
            ((ArrayList)localObject2).add(org.vidogram.messenger.r.a("Delete", 2131231117));
            ((ArrayList)localObject3).add(Integer.valueOf(1));
          }
          while (true)
          {
            if (((ArrayList)localObject3).isEmpty())
              break label2189;
            ((AlertDialog.Builder)localObject1).setItems((CharSequence[])((ArrayList)localObject2).toArray(new CharSequence[((ArrayList)localObject2).size()]), new DialogInterface.OnClickListener((ArrayList)localObject3)
            {
              public void onClick(DialogInterface paramDialogInterface, int paramInt)
              {
                if ((q.bp(q.this) == null) || (paramInt < 0) || (paramInt >= this.a.size()))
                  return;
                q.g(q.this, ((Integer)this.a.get(paramInt)).intValue());
              }
            });
            ((AlertDialog.Builder)localObject1).setTitle(org.vidogram.messenger.r.a("Message", 2131231431));
            b(((AlertDialog.Builder)localObject1).create());
            return;
            i1 = 0;
            break;
            i2 = 0;
            break label288;
            i3 = 0;
            break label324;
            if (i6 == 1)
            {
              if ((this.i != null) && (!this.bs))
              {
                if (i4 != 0)
                {
                  ((ArrayList)localObject2).add(org.vidogram.messenger.r.a("Reply", 2131231716));
                  ((ArrayList)localObject3).add(Integer.valueOf(8));
                }
                if (i2 != 0)
                {
                  ((ArrayList)localObject2).add(org.vidogram.messenger.r.a("UnpinMessage", 2131231916));
                  ((ArrayList)localObject3).add(Integer.valueOf(14));
                }
                while (true)
                {
                  if (i3 != 0)
                  {
                    ((ArrayList)localObject2).add(org.vidogram.messenger.r.a("Edit", 2131231149));
                    ((ArrayList)localObject3).add(Integer.valueOf(12));
                  }
                  if (!paramView.b(this.i))
                    break;
                  ((ArrayList)localObject2).add(org.vidogram.messenger.r.a("Delete", 2131231117));
                  ((ArrayList)localObject3).add(Integer.valueOf(1));
                  break;
                  if (i1 == 0)
                    continue;
                  ((ArrayList)localObject2).add(org.vidogram.messenger.r.a("PinMessage", 2131231682));
                  ((ArrayList)localObject3).add(Integer.valueOf(13));
                }
              }
              if ((paramBoolean) && (this.aV.q() > 0) && (i4 != 0))
              {
                ((ArrayList)localObject2).add(org.vidogram.messenger.r.a("Reply", 2131231716));
                ((ArrayList)localObject3).add(Integer.valueOf(8));
              }
              if (!paramView.b(this.i))
                continue;
              ((ArrayList)localObject2).add(org.vidogram.messenger.r.a("Delete", 2131231117));
              ((ArrayList)localObject3).add(Integer.valueOf(1));
              continue;
            }
            if (i6 != 20)
              break label1022;
            ((ArrayList)localObject2).add(org.vidogram.messenger.r.a("Retry", 2131231749));
            ((ArrayList)localObject3).add(Integer.valueOf(0));
            ((ArrayList)localObject2).add(org.vidogram.messenger.r.a("Copy", 2131231088));
            ((ArrayList)localObject3).add(Integer.valueOf(3));
            ((ArrayList)localObject2).add(org.vidogram.messenger.r.a("Delete", 2131231117));
            ((ArrayList)localObject3).add(Integer.valueOf(1));
          }
          label1022: if (this.k == null)
          {
            if (i4 != 0)
            {
              ((ArrayList)localObject2).add(org.vidogram.messenger.r.a("Reply", 2131231716));
              ((ArrayList)localObject3).add(Integer.valueOf(8));
            }
            if ((this.aV.f == 0) || (this.aV.d != null))
            {
              ((ArrayList)localObject2).add(org.vidogram.messenger.r.a("Copy", 2131231088));
              ((ArrayList)localObject3).add(Integer.valueOf(3));
            }
            if (i6 == 3)
            {
              if (((this.aV.a.j instanceof g.oi)) && (u.b(this.aV.a.j.r.s)))
              {
                ((ArrayList)localObject2).add(org.vidogram.messenger.r.a("SaveToGIFs", 2131231761));
                ((ArrayList)localObject3).add(Integer.valueOf(11));
              }
              ((ArrayList)localObject2).add(org.vidogram.messenger.r.a("Forward", 2131231203));
              ((ArrayList)localObject3).add(Integer.valueOf(2));
              ((ArrayList)localObject2).add(org.vidogram.messenger.r.a("Forward_Without_Quoting", 2131232252));
              ((ArrayList)localObject3).add(Integer.valueOf(9707));
              if (i2 == 0)
                break label1987;
              ((ArrayList)localObject2).add(org.vidogram.messenger.r.a("UnpinMessage", 2131231916));
              ((ArrayList)localObject3).add(Integer.valueOf(14));
            }
            while (true)
            {
              if (i3 != 0)
              {
                ((ArrayList)localObject2).add(org.vidogram.messenger.r.a("Edit", 2131231149));
                ((ArrayList)localObject3).add(Integer.valueOf(12));
              }
              if (!paramView.b(this.i))
                break;
              ((ArrayList)localObject2).add(org.vidogram.messenger.r.a("Delete", 2131231117));
              ((ArrayList)localObject3).add(Integer.valueOf(1));
              break;
              if (i6 == 4)
              {
                if (this.aV.I())
                {
                  ((ArrayList)localObject2).add(org.vidogram.messenger.r.a("SaveToGallery", 2131231762));
                  ((ArrayList)localObject3).add(Integer.valueOf(4));
                  ((ArrayList)localObject2).add(org.vidogram.messenger.r.a("ShareFile", 2131231834));
                  ((ArrayList)localObject3).add(Integer.valueOf(6));
                  break label1175;
                }
                if (this.aV.G())
                {
                  ((ArrayList)localObject2).add(org.vidogram.messenger.r.a("SaveToMusic", 2131231764));
                  ((ArrayList)localObject3).add(Integer.valueOf(10));
                  ((ArrayList)localObject2).add(org.vidogram.messenger.r.a("ShareFile", 2131231834));
                  ((ArrayList)localObject3).add(Integer.valueOf(6));
                  break label1175;
                }
                if (this.aV.A() != null)
                {
                  if (u.b(this.aV.A()))
                  {
                    ((ArrayList)localObject2).add(org.vidogram.messenger.r.a("SaveToGIFs", 2131231761));
                    ((ArrayList)localObject3).add(Integer.valueOf(11));
                  }
                  ((ArrayList)localObject2).add(org.vidogram.messenger.r.a("SaveToDownloads", 2131231760));
                  ((ArrayList)localObject3).add(Integer.valueOf(10));
                  ((ArrayList)localObject2).add(org.vidogram.messenger.r.a("ShareFile", 2131231834));
                  ((ArrayList)localObject3).add(Integer.valueOf(6));
                  break label1175;
                }
                ((ArrayList)localObject2).add(org.vidogram.messenger.r.a("SaveToGallery", 2131231762));
                ((ArrayList)localObject3).add(Integer.valueOf(4));
                break label1175;
              }
              if (i6 == 5)
              {
                ((ArrayList)localObject2).add(org.vidogram.messenger.r.a("ApplyLocalizationFile", 2131230858));
                ((ArrayList)localObject3).add(Integer.valueOf(5));
                ((ArrayList)localObject2).add(org.vidogram.messenger.r.a("ShareFile", 2131231834));
                ((ArrayList)localObject3).add(Integer.valueOf(6));
                break label1175;
              }
              if (i6 == 6)
              {
                ((ArrayList)localObject2).add(org.vidogram.messenger.r.a("SaveToGallery", 2131231762));
                ((ArrayList)localObject3).add(Integer.valueOf(7));
                ((ArrayList)localObject2).add(org.vidogram.messenger.r.a("SaveToDownloads", 2131231760));
                ((ArrayList)localObject3).add(Integer.valueOf(10));
                ((ArrayList)localObject2).add(org.vidogram.messenger.r.a("ShareFile", 2131231834));
                ((ArrayList)localObject3).add(Integer.valueOf(6));
                break label1175;
              }
              if (i6 == 7)
              {
                if (this.aV.F())
                  ((ArrayList)localObject2).add(org.vidogram.messenger.r.a("AddToMasks", 2131230827));
                while (true)
                {
                  ((ArrayList)localObject3).add(Integer.valueOf(9));
                  break;
                  ((ArrayList)localObject2).add(org.vidogram.messenger.r.a("AddToStickers", 2131230828));
                }
              }
              if (i6 != 8)
                break label1175;
              g.vw localvw = org.vidogram.messenger.v.a().a(Integer.valueOf(this.aV.a.j.q));
              if ((localvw != null) && (localvw.d != org.vidogram.messenger.ad.c()) && (org.vidogram.messenger.f.a().f.get(localvw.d) == null))
              {
                ((ArrayList)localObject2).add(org.vidogram.messenger.r.a("AddContactTitle", 2131230815));
                ((ArrayList)localObject3).add(Integer.valueOf(15));
              }
              if ((this.aV.a.j.n == null) && (this.aV.a.j.n.length() == 0))
                break label1175;
              ((ArrayList)localObject2).add(org.vidogram.messenger.r.a("Copy", 2131231088));
              ((ArrayList)localObject3).add(Integer.valueOf(16));
              ((ArrayList)localObject2).add(org.vidogram.messenger.r.a("Call", 2131230940));
              ((ArrayList)localObject3).add(Integer.valueOf(17));
              break label1175;
              if (i1 == 0)
                continue;
              ((ArrayList)localObject2).add(org.vidogram.messenger.r.a("PinMessage", 2131231682));
              ((ArrayList)localObject3).add(Integer.valueOf(13));
            }
          }
          if (i4 != 0)
          {
            ((ArrayList)localObject2).add(org.vidogram.messenger.r.a("Reply", 2131231716));
            ((ArrayList)localObject3).add(Integer.valueOf(8));
          }
          if ((this.aV.f == 0) || (this.aV.d != null))
          {
            ((ArrayList)localObject2).add(org.vidogram.messenger.r.a("Copy", 2131231088));
            ((ArrayList)localObject3).add(Integer.valueOf(3));
          }
          if (i6 == 4)
            if (this.aV.I())
            {
              ((ArrayList)localObject2).add(org.vidogram.messenger.r.a("SaveToGallery", 2131231762));
              ((ArrayList)localObject3).add(Integer.valueOf(4));
              ((ArrayList)localObject2).add(org.vidogram.messenger.r.a("ShareFile", 2131231834));
              ((ArrayList)localObject3).add(Integer.valueOf(6));
            }
          while (true)
          {
            ((ArrayList)localObject2).add(org.vidogram.messenger.r.a("Delete", 2131231117));
            ((ArrayList)localObject3).add(Integer.valueOf(1));
            break label585;
            break;
            if (this.aV.G())
            {
              ((ArrayList)localObject2).add(org.vidogram.messenger.r.a("SaveToMusic", 2131231764));
              ((ArrayList)localObject3).add(Integer.valueOf(10));
              ((ArrayList)localObject2).add(org.vidogram.messenger.r.a("ShareFile", 2131231834));
              ((ArrayList)localObject3).add(Integer.valueOf(6));
              continue;
            }
            if ((!this.aV.I()) && (this.aV.A() != null))
            {
              ((ArrayList)localObject2).add(org.vidogram.messenger.r.a("SaveToDownloads", 2131231760));
              ((ArrayList)localObject3).add(Integer.valueOf(10));
              ((ArrayList)localObject2).add(org.vidogram.messenger.r.a("ShareFile", 2131231834));
              ((ArrayList)localObject3).add(Integer.valueOf(6));
              continue;
            }
            ((ArrayList)localObject2).add(org.vidogram.messenger.r.a("SaveToGallery", 2131231762));
            ((ArrayList)localObject3).add(Integer.valueOf(4));
            continue;
            if (i6 == 5)
            {
              ((ArrayList)localObject2).add(org.vidogram.messenger.r.a("ApplyLocalizationFile", 2131230858));
              ((ArrayList)localObject3).add(Integer.valueOf(5));
              continue;
            }
            if (i6 != 7)
              continue;
            ((ArrayList)localObject2).add(org.vidogram.messenger.r.a("AddToStickers", 2131230828));
            ((ArrayList)localObject3).add(Integer.valueOf(9));
          }
          label2429: Object localObject1 = this.d.b();
          Object localObject2 = ((org.vidogram.ui.a.c)localObject1).b(11);
          if (localObject2 != null)
            ((View)localObject2).setVisibility(0);
          localObject2 = ((org.vidogram.ui.a.c)localObject1).b(11);
          if (localObject2 != null)
            ((View)localObject2).setVisibility(0);
          localObject1 = ((org.vidogram.ui.a.c)localObject1).b(12);
          if (localObject1 != null)
            ((View)localObject1).setVisibility(0);
          if (this.A != null)
            this.A.setVisibility(8);
          this.d.c();
          h(true);
          localObject1 = new AnimatorSet();
          localObject2 = new ArrayList();
          i1 = 0;
          while (i1 < this.L.size())
          {
            localObject3 = (View)this.L.get(i1);
            org.vidogram.messenger.a.d((View)localObject3);
            ((ArrayList)localObject2).add(ObjectAnimator.ofFloat(localObject3, "scaleY", new float[] { 0.1F, 1.0F }));
            i1 += 1;
          }
          ((AnimatorSet)localObject1).playTogether((Collection)localObject2);
          ((AnimatorSet)localObject1).setDuration(250L);
          ((AnimatorSet)localObject1).start();
          d(paramView);
          this.O.a(1, false);
          ac();
          return;
        }
        paramView = null;
      }
    }
  }

  private void a(CharSequence paramCharSequence, boolean paramBoolean)
  {
    if ((this.k != null) && ((org.vidogram.messenger.v.a().x == 0) || (org.vidogram.messenger.a.c(this.k.o) < 46)));
    label271: label304: label310: label316: 
    while (true)
    {
      return;
      int i3;
      int i1;
      int i2;
      if ((paramBoolean) && (this.bg != null))
        if (this.bg.e != null)
        {
          i3 = TextUtils.indexOf(paramCharSequence, this.bg.e);
          if (i3 != -1)
            break label247;
          if (this.bg.f == null)
            break label310;
          i3 = TextUtils.indexOf(paramCharSequence, this.bg.f);
          if ((i3 == -1) || (this.bg.f.length() + i3 != paramCharSequence.length()))
            break label236;
          i1 = 1;
          if ((i3 == -1) || (i1 != 0))
            break label241;
          i2 = paramCharSequence.charAt(this.bg.f.length() + i3);
        }
      while (true)
      {
        if ((i3 != -1) && ((i1 != 0) || (i2 == 32) || (i2 == 44) || (i2 == 46) || (i2 == 33) || (i2 == 47)))
          break label316;
        this.bi = null;
        a(false, null, null, this.bg, false, true);
        Utilities.e.b(new Runnable(paramCharSequence, paramBoolean)
        {
          public void run()
          {
            int i = 1;
            if (q.aW(q.this) != 0)
            {
              ConnectionsManager.a().a(q.aW(q.this), true);
              q.f(q.this, 0);
            }
            try
            {
              localObject2 = org.vidogram.messenger.a.j.matcher(this.a);
              ArrayList localArrayList = null;
              while (true)
                if (((Matcher)localObject2).find())
                {
                  if ((((Matcher)localObject2).start() > 0) && (this.a.charAt(((Matcher)localObject2).start() - 1) == '@'))
                    continue;
                  if (localArrayList == null)
                  {
                    localArrayList = new ArrayList();
                    localArrayList.add(this.a.subSequence(((Matcher)localObject2).start(), ((Matcher)localObject2).end()));
                    continue;
                  }
                }
                else if ((localArrayList != null) && (q.aX(q.this) != null) && (localArrayList.size() == q.aX(q.this).size()))
                {
                  j = 0;
                  if (j >= localArrayList.size())
                    break label434;
                  if (!TextUtils.equals((CharSequence)localArrayList.get(j), (CharSequence)q.aX(q.this).get(j)))
                  {
                    i = 0;
                    break label427;
                  }
                }
                else
                {
                  q.b(q.this, localArrayList);
                  if (localArrayList != null)
                    break;
                  org.vidogram.messenger.a.a(new Runnable()
                  {
                    public void run()
                    {
                      if (q.aK(q.this) != null)
                      {
                        q.this.a(false, null, null, q.aK(q.this), false, true);
                        q.a(q.this, null);
                      }
                    }
                  });
                  return;
                }
            }
            catch (Exception localObject1)
            {
              label427: label434: 
              do
                while (true)
                {
                  int j;
                  org.vidogram.messenger.n.a("tmessages", localException);
                  Object localObject1 = this.a.toString().toLowerCase();
                  if ((this.a.length() < 13) || ((!((String)localObject1).contains("http://")) && (!((String)localObject1).contains("https://"))))
                  {
                    org.vidogram.messenger.a.a(new Runnable()
                    {
                      public void run()
                      {
                        if (q.aK(q.this) != null)
                        {
                          q.this.a(false, null, null, q.aK(q.this), false, true);
                          q.a(q.this, null);
                        }
                      }
                    });
                    return;
                  }
                  for (localObject1 = TextUtils.join(" ", (Iterable)localObject1); (q.this.k != null) && (org.vidogram.messenger.v.a().x == 2); localObject1 = this.a)
                  {
                    org.vidogram.messenger.a.a(new Runnable()
                    {
                      public void run()
                      {
                        AlertDialog.Builder localBuilder = new AlertDialog.Builder(q.this.l());
                        localBuilder.setTitle(org.vidogram.messenger.r.a("AppName", 2131230856));
                        localBuilder.setPositiveButton(org.vidogram.messenger.r.a("OK", 2131231604), new DialogInterface.OnClickListener()
                        {
                          public void onClick(DialogInterface paramDialogInterface, int paramInt)
                          {
                            org.vidogram.messenger.v.a().x = 1;
                            ApplicationLoader.a.getSharedPreferences("mainconfig", 0).edit().putInt("secretWebpage2", org.vidogram.messenger.v.a().x).commit();
                            q.b(q.this, null);
                            q.a(q.this, q.52.this.a, q.52.this.b);
                          }
                        });
                        localBuilder.setNegativeButton(org.vidogram.messenger.r.a("Cancel", 2131230943), null);
                        localBuilder.setMessage(org.vidogram.messenger.r.a("SecretLinkPreviewAlert", 2131231787));
                        q.this.b(localBuilder.create());
                        org.vidogram.messenger.v.a().x = 0;
                        ApplicationLoader.a.getSharedPreferences("mainconfig", 0).edit().putInt("secretWebpage2", org.vidogram.messenger.v.a().x).commit();
                      }
                    });
                    return;
                  }
                  Object localObject2 = new g.qe();
                  if ((localObject1 instanceof String));
                  for (((g.qe)localObject2).c = ((String)localObject1); ; ((g.qe)localObject2).c = ((CharSequence)localObject1).toString())
                  {
                    q.f(q.this, ConnectionsManager.a().a((org.vidogram.tgnet.f)localObject2, new org.vidogram.tgnet.c((g.qe)localObject2)
                    {
                    }));
                    ConnectionsManager.a().a(q.aW(q.this), q.aY(q.this));
                    return;
                  }
                  break label427;
                  continue;
                  j += 1;
                }
              while (i == 0);
            }
          }
        });
        return;
        label236: i1 = 0;
        break;
        label241: i2 = 0;
        continue;
        label247: if (this.bg.e.length() + i3 == paramCharSequence.length())
        {
          i1 = 1;
          if (i1 != 0)
            break label304;
        }
        for (i2 = paramCharSequence.charAt(this.bg.e.length() + i3); ; i2 = 0)
        {
          break;
          i1 = 0;
          break label271;
        }
        i1 = 0;
        i2 = 0;
      }
    }
  }

  private void a(ArrayList<u> paramArrayList)
  {
    if ((paramArrayList == null) || (paramArrayList.isEmpty()));
    while (true)
    {
      return;
      if (!cn)
      {
        org.vidogram.messenger.ac.a().a(paramArrayList, this.bq);
        return;
      }
      paramArrayList = paramArrayList.iterator();
      while (paramArrayList.hasNext())
      {
        u localu = (u)paramArrayList.next();
        org.vidogram.messenger.ac.a().a(localu, this.bq);
      }
    }
  }

  private void a(g.d paramd)
  {
    int i1 = this.af.h();
    HashMap localHashMap = new HashMap();
    localHashMap.put("id", paramd.c);
    localHashMap.put("query_id", "" + paramd.q);
    localHashMap.put("bot", "" + i1);
    localHashMap.put("bot_name", this.af.j());
    org.vidogram.messenger.ac.a(paramd, localHashMap, this.bq, this.aY);
    this.l.setFieldText("");
    a(false, null, null, null, false, true);
    org.vidogram.messenger.d.e.a(i1);
  }

  private boolean aa()
  {
    boolean bool2 = true;
    if ((!org.vidogram.messenger.a.c()) && (ApplicationLoader.a.getResources().getConfiguration().orientation == 2))
      this.O.setTextSize(18);
    while (org.vidogram.messenger.a.c())
    {
      if ((org.vidogram.messenger.a.d()) && (ApplicationLoader.a.getResources().getConfiguration().orientation == 1))
      {
        this.d.setBackButtonDrawable(new org.vidogram.ui.a.f(false));
        if ((this.ar != null) && (this.ar.getParent() == null))
          ((ViewGroup)this.b).addView(this.ar, org.vidogram.ui.Components.v.a(-1, 39.0F, 51, 0.0F, -36.0F, 0.0F, 0.0F));
        return false;
        this.O.setTextSize(20);
        continue;
      }
      org.vidogram.ui.a.a locala = this.d;
      boolean bool1 = bool2;
      if (this.c != null)
      {
        bool1 = bool2;
        if (!this.c.e.isEmpty())
        {
          bool1 = bool2;
          if (this.c.e.get(0) != this)
            if (this.c.e.size() != 1)
              break label254;
        }
      }
      label254: for (bool1 = bool2; ; bool1 = false)
      {
        locala.setBackButtonDrawable(new org.vidogram.ui.a.f(bool1));
        if ((this.ar == null) || (this.ar.getParent() == null))
          break;
        this.b.setPadding(0, 0, 0, 0);
        ((ViewGroup)this.b).removeView(this.ar);
        return false;
      }
    }
    return true;
  }

  private void ab()
  {
    if (this.M != null)
      this.M.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener()
      {
        public boolean onPreDraw()
        {
          if (q.v(q.this) != null)
            q.v(q.this).getViewTreeObserver().removeOnPreDrawListener(this);
          return q.bn(q.this);
        }
      });
  }

  private void ac()
  {
    if (this.E == null)
      return;
    int i4 = this.E.getChildCount();
    u localu1;
    label33: int i2;
    label35: Object localObject;
    org.vidogram.ui.c.j localj;
    int i1;
    label113: boolean bool1;
    label141: label143: label160: boolean bool2;
    if (this.l != null)
    {
      localu1 = this.l.getEditingMessageObject();
      i2 = 0;
      if (i2 < i4)
      {
        localObject = this.E.getChildAt(i2);
        if (!(localObject instanceof org.vidogram.ui.c.j))
          break label321;
        localj = (org.vidogram.ui.c.j)localObject;
        int i3 = 0;
        if (!this.d.f())
          break label283;
        u localu2 = localj.getMessageObject();
        if (localu2 != localu1)
        {
          HashMap[] arrayOfHashMap = this.bt;
          if (localu2.u() != this.bq)
            break label267;
          i1 = 0;
          if (!arrayOfHashMap[i1].containsKey(Integer.valueOf(localu2.q())))
            break label272;
        }
        ((View)localObject).setBackgroundColor(1714664933);
        i1 = 1;
        i3 = 1;
        localj.setMessageObject(localj.getMessageObject());
        if (i3 != 0)
          break label294;
        bool1 = true;
        if ((i3 == 0) || (i1 == 0))
          break label300;
        bool2 = true;
        label171: localj.a(bool1, bool2);
        if ((this.bW == 2147483647) || (localj.getMessageObject() == null) || (localj.getMessageObject().q() != this.bW))
          break label306;
        bool1 = true;
        label216: localj.setHighlighted(bool1);
        if ((this.aC == null) || (this.aC.getVisibility() != 0) || (org.vidogram.messenger.d.d.a() == null))
          break label312;
        localj.setHighlightedText(org.vidogram.messenger.d.d.a());
      }
    }
    while (true)
    {
      i2 += 1;
      break label35;
      break;
      localu1 = null;
      break label33;
      label267: i1 = 1;
      break label113;
      label272: ((View)localObject).setBackgroundColor(0);
      i1 = 0;
      break label141;
      label283: ((View)localObject).setBackgroundColor(0);
      i1 = 0;
      break label143;
      label294: bool1 = false;
      break label160;
      label300: bool2 = false;
      break label171;
      label306: bool1 = false;
      break label216;
      label312: localj.setHighlightedText(null);
      continue;
      label321: if (!(localObject instanceof org.vidogram.ui.c.h))
        continue;
      localObject = (org.vidogram.ui.c.h)localObject;
      ((org.vidogram.ui.c.h)localObject).setMessageObject(((org.vidogram.ui.c.h)localObject).getMessageObject());
    }
  }

  private void ad()
  {
    if (this.l == null);
    u localu;
    while (true)
    {
      return;
      localu = this.l.getEditingMessageObject();
      if (localu == null)
        continue;
      if ((this.j == null) || (!this.j.n))
        break;
      if (this.R.getVisibility() == 8)
        continue;
      this.R.setVisibility(8);
      return;
    }
    int i1 = org.vidogram.messenger.v.a().G + 300 - Math.abs(ConnectionsManager.a().b() - localu.a.e);
    if (i1 > 0)
    {
      if (i1 > 300)
        if (this.R.getVisibility() != 8)
          this.R.setVisibility(8);
      while (true)
      {
        org.vidogram.messenger.a.a(new Runnable()
        {
          public void run()
          {
            q.bt(q.this);
          }
        }
        , 1000L);
        return;
        if (this.R.getVisibility() != 0)
          this.R.setVisibility(0);
        this.R.setText(org.vidogram.messenger.r.a("TimeToEdit", 2131231892, new Object[] { String.format("%d:%02d", new Object[] { Integer.valueOf(i1 / 60), Integer.valueOf(i1 % 60) }) }));
      }
    }
    this.A.setVisibility(8);
    this.R.setText(org.vidogram.messenger.r.a("TimeToEditExpired", 2131231893, new Object[0]));
  }

  private void ae()
  {
    if (new itman.robert.a().a(ApplicationLoader.a))
    {
      org.vidogram.messenger.v.a().k();
      org.vidogram.messenger.v.a().j();
    }
  }

  private void af()
  {
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(l());
    localBuilder.setTitle(org.vidogram.messenger.r.a("AppName", 2131230856));
    localBuilder.setMessage(org.vidogram.messenger.r.a("CallFailure", 2131232134, new Object[0]));
    localBuilder.setNegativeButton(org.vidogram.messenger.r.a("Cancel", 2131230943), null);
    localBuilder.setPositiveButton(org.vidogram.messenger.r.a("SendInvitation", 2131232423), new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramDialogInterface, int paramInt)
      {
        q.this.a(org.vidogram.messenger.r.a("CallFailureMessage", 2131232135));
      }
    });
    a(localBuilder.create(), true);
  }

  private void b(String paramString)
  {
    this.M.setVisibility(8);
    this.y.setVisibility(8);
    this.x.setVisibility(8);
    this.z.setVisibility(0);
    a(0, 0, 0);
    U();
    if (paramString == null);
    for (boolean bool = true; ; bool = false)
    {
      this.aP = bool;
      this.z.a(this.aP);
      if (paramString != null)
      {
        this.z.getSearchField().setText(paramString);
        this.z.getSearchField().setSelection(this.z.getSearchField().length());
        org.vidogram.messenger.d.d.a(paramString, this.bq, this.bL, this.e, 0);
      }
      return;
    }
  }

  private boolean b(u paramu)
  {
    if ((paramu == null) || (paramu.j()) || (!paramu.s()) || (paramu.a.G != 0) || (paramu.a.F <= 0))
      return false;
    org.vidogram.messenger.v.a().a(this.bq, paramu.a.C, paramu.a.F);
    paramu.a.G = (paramu.a.F + ConnectionsManager.a().b());
    return true;
  }

  private int c(u paramu)
  {
    int i3 = 0;
    int i4 = 1;
    int i2 = 1;
    if (paramu == null)
    {
      i1 = -1;
      return i1;
    }
    if (this.k == null)
    {
      if ((this.bs) && (paramu.q() <= 0) && (paramu.w()));
      for (i1 = 1; ; i1 = 0)
      {
        if (((this.bs) || (paramu.q() > 0) || (!paramu.j())) && (i1 == 0))
          break label98;
        if (!paramu.w())
          break label96;
        i1 = i3;
        if (!paramu.U())
          break;
        return 20;
      }
      label96: return -1;
      label98: if (paramu.f == 6)
        return -1;
      if ((paramu.f == 10) || (paramu.f == 11))
      {
        if (paramu.q() == 0)
          return -1;
        return 1;
      }
      if (paramu.H())
        return 2;
      if (paramu.E())
      {
        paramu = paramu.R();
        if ((paramu instanceof g.lr))
        {
          if (!org.vidogram.messenger.d.g.a(paramu.b))
            return 7;
        }
        else if (((paramu instanceof g.ls)) && (!org.vidogram.messenger.d.g.b(paramu.d)))
          return 7;
      }
      else if (((paramu.a.j instanceof g.ob)) || (paramu.A() != null) || (paramu.G()) || (paramu.I()))
      {
        if ((paramu.a.A == null) || (paramu.a.A.length() == 0) || (!new File(paramu.a.A).exists()))
          break label690;
      }
    }
    label682: label690: for (int i1 = 1; ; i1 = 0)
    {
      if ((i1 == 0) && (org.vidogram.messenger.m.b(paramu.a).exists()))
        i1 = i2;
      while (true)
      {
        if (i1 != 0)
        {
          if (paramu.A() != null)
          {
            paramu = paramu.A().g;
            if (paramu != null)
            {
              if (paramu.endsWith("/xml"))
                return 5;
              if ((paramu.endsWith("/png")) || (paramu.endsWith("/jpg")) || (paramu.endsWith("/jpeg")))
                return 6;
            }
          }
          return 4;
          if (paramu.f == 12)
            return 8;
          if (paramu.U())
            return 3;
        }
        return 2;
        if (paramu.v())
          return -1;
        if (paramu.f == 6)
          return -1;
        if (paramu.w())
        {
          i1 = i3;
          if (!paramu.U())
            break;
          return 20;
        }
        if ((paramu.f == 10) || (paramu.f == 11))
        {
          if ((paramu.q() == 0) || (paramu.v()))
            return -1;
          return 1;
        }
        if (paramu.H())
          return 2;
        if (paramu.E())
        {
          paramu = paramu.R();
          if (((paramu instanceof g.ls)) && (!org.vidogram.messenger.d.g.b(paramu.d)))
            return 7;
        }
        else if (((paramu.a.j instanceof g.ob)) || (paramu.A() != null) || (paramu.G()) || (paramu.I()))
        {
          if ((paramu.a.A == null) || (paramu.a.A.length() == 0) || (!new File(paramu.a.A).exists()))
            break label682;
        }
        for (i1 = 1; ; i1 = 0)
        {
          if ((i1 == 0) && (org.vidogram.messenger.m.b(paramu.a).exists()))
            i1 = i4;
          while (true)
          {
            if (i1 != 0)
            {
              if (paramu.A() != null)
              {
                String str = paramu.A().g;
                if ((str != null) && (str.endsWith("text/xml")))
                  return 5;
              }
              if (paramu.a.F <= 0)
              {
                return 4;
                if (paramu.f == 12)
                  return 8;
                if (paramu.U())
                  return 3;
              }
            }
            return 2;
          }
        }
      }
    }
  }

  private void c(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (this.Y == null);
    do
    {
      while (true)
      {
        return;
        if (!paramBoolean1)
          break;
        this.Z = false;
        if (this.Y.getTag() != null)
          continue;
        if (this.aN != null)
        {
          this.aN.cancel();
          this.aN = null;
        }
        if (paramBoolean2)
        {
          if (this.Y.getTranslationY() == 0.0F)
            this.Y.setTranslationY(org.vidogram.messenger.a.a(100.0F));
          this.Y.setVisibility(0);
          this.Y.setTag(Integer.valueOf(1));
          this.aN = ObjectAnimator.ofFloat(this.Y, "translationY", new float[] { 0.0F }).setDuration(200L);
          this.aN.start();
          return;
        }
        this.Y.setVisibility(0);
        return;
      }
      this.bO = 0;
      this.bx = 0;
    }
    while (this.Y.getTag() == null);
    this.Y.setTag(null);
    if (this.aN != null)
    {
      this.aN.cancel();
      this.aN = null;
    }
    if (paramBoolean2)
    {
      this.aN = ObjectAnimator.ofFloat(this.Y, "translationY", new float[] { org.vidogram.messenger.a.a(100.0F) }).setDuration(200L);
      this.aN.addListener(new org.vidogram.messenger.b()
      {
        public void onAnimationEnd(Animator paramAnimator)
        {
          q.aZ(q.this).setVisibility(4);
          q.T(q.this).setVisibility(4);
        }
      });
      this.aN.start();
      return;
    }
    this.Y.setVisibility(4);
  }

  private void d(u paramu)
  {
    int i3 = 8;
    if (paramu.u() == this.bq)
    {
      i1 = 0;
      if (!this.bt[i1].containsKey(Integer.valueOf(paramu.q())))
        break label158;
      this.bt[i1].remove(Integer.valueOf(paramu.q()));
      if ((paramu.f == 0) || (paramu.d != null))
        this.bu[i1].remove(Integer.valueOf(paramu.q()));
      if (!paramu.b(this.i))
        this.bv -= 1;
      label106: if (this.d.f())
      {
        if ((!this.bt[0].isEmpty()) || (!this.bt[1].isEmpty()))
          break label232;
        this.d.d();
        h(true);
      }
    }
    label158: label232: int i4;
    int i5;
    label330: 
    do
    {
      return;
      i1 = 1;
      break;
      this.bt[i1].put(Integer.valueOf(paramu.q()), paramu);
      if ((paramu.f == 0) || (paramu.d != null))
        this.bu[i1].put(Integer.valueOf(paramu.q()), paramu);
      if (paramu.b(this.i))
        break label106;
      this.bv += 1;
      break label106;
      i4 = this.d.b().b(10).getVisibility();
      paramu = this.d.b().b(10);
      if (this.bu[0].size() + this.bu[1].size() == 0)
        break label524;
      i1 = 0;
      paramu.setVisibility(i1);
      i5 = this.d.b().b(10).getVisibility();
      paramu = this.d.b().b(12);
      if (this.bv != 0)
        break label530;
      i1 = 0;
      paramu.setVisibility(i1);
      paramu = this.d.b().b(19);
    }
    while (paramu == null);
    if (((this.k != null) && (org.vidogram.messenger.a.c(this.k.o) < 46)) || (this.bs) || ((this.i != null) && ((org.vidogram.messenger.e.c(this.i)) || ((org.vidogram.messenger.e.d(this.i)) && (!this.i.c) && (!this.i.n) && (!this.i.r)))));
    for (int i1 = 0; ; i1 = 1)
    {
      int i2 = i3;
      if (i1 != 0)
      {
        i2 = i3;
        if (this.bt[0].size() + this.bt[1].size() == 1)
          i2 = 0;
      }
      if (paramu.getVisibility() == i2)
        break;
      if (this.aO != null)
        this.aO.cancel();
      if (i4 != i5)
      {
        if (i2 == 0)
        {
          paramu.setAlpha(1.0F);
          paramu.setScaleX(1.0F);
        }
        while (true)
        {
          paramu.setVisibility(i2);
          return;
          label524: i1 = 8;
          break;
          label530: i1 = 8;
          break label330;
          paramu.setAlpha(0.0F);
          paramu.setScaleX(0.0F);
        }
      }
      this.aO = new AnimatorSet();
      paramu.setPivotX(org.vidogram.messenger.a.a(54.0F));
      if (i2 == 0)
      {
        paramu.setVisibility(i2);
        this.aO.playTogether(new Animator[] { ObjectAnimator.ofFloat(paramu, "alpha", new float[] { 1.0F }), ObjectAnimator.ofFloat(paramu, "scaleX", new float[] { 1.0F }) });
      }
      while (true)
      {
        this.aO.setDuration(100L);
        this.aO.addListener(new org.vidogram.messenger.b(i2, paramu)
        {
          public void onAnimationCancel(Animator paramAnimator)
          {
            if ((q.ba(q.this) != null) && (q.ba(q.this).equals(paramAnimator)))
              q.c(q.this, null);
          }

          public void onAnimationEnd(Animator paramAnimator)
          {
            if ((q.ba(q.this) != null) && (q.ba(q.this).equals(paramAnimator)) && (this.a == 8))
              this.b.setVisibility(8);
          }
        });
        this.aO.start();
        return;
        this.aO.playTogether(new Animator[] { ObjectAnimator.ofFloat(paramu, "alpha", new float[] { 0.0F }), ObjectAnimator.ofFloat(paramu, "scaleX", new float[] { 0.0F }) });
      }
    }
  }

  private void d(boolean paramBoolean)
  {
    if ((this.F == null) || (this.ba));
    label32: label52: label191: label338: label340: label345: label350: 
    do
    {
      return;
      i3 = this.F.m();
      int i5;
      int i6;
      boolean bool;
      int i7;
      if (i3 == -1)
      {
        i1 = 0;
        if (i1 <= 0)
          break label338;
        i4 = this.G.a();
        if (!paramBoolean)
          break label340;
        i2 = 25;
        if ((i3 <= i2) && (!this.bH))
        {
          if (this.bE[0] != 0)
            break label436;
          this.bH = true;
          this.bw.add(Integer.valueOf(this.br));
          if (this.bz.size() == 0)
            break label350;
          localv = org.vidogram.messenger.v.a();
          l1 = this.bq;
          i2 = this.bA[0];
          if (this.bF[0] != 0)
            break label345;
          paramBoolean = true;
          i5 = this.bD[0];
          i6 = this.e;
          bool = org.vidogram.messenger.e.d(this.i);
          i7 = this.br;
          this.br = (i7 + 1);
          localv.a(l1, 50, i2, paramBoolean, i5, i6, 0, 0, bool, i7);
        }
      }
      do
      {
        if ((this.bT) || (i3 + i1 < i4 - 10))
          break label562;
        if ((this.bL == 0L) || (this.bG[1] != 0))
          break label569;
        this.bw.add(Integer.valueOf(this.br));
        localv = org.vidogram.messenger.v.a();
        l1 = this.bL;
        i1 = this.bB[1];
        i2 = this.bC[1];
        i3 = this.e;
        paramBoolean = org.vidogram.messenger.e.d(this.i);
        i4 = this.br;
        this.br = (i4 + 1);
        localv.a(l1, 50, i1, true, i2, i3, 1, 0, paramBoolean, i4);
        this.bT = true;
        return;
        i1 = Math.abs(this.F.n() - i3) + 1;
        break label32;
        break;
        i2 = 5;
        break label52;
        paramBoolean = false;
        break label133;
        localv = org.vidogram.messenger.v.a();
        l1 = this.bq;
        if (this.bF[0] == 0);
        for (paramBoolean = true; ; paramBoolean = false)
        {
          i2 = this.bD[0];
          i5 = this.e;
          bool = org.vidogram.messenger.e.d(this.i);
          i6 = this.br;
          this.br = (i6 + 1);
          localv.a(l1, 50, 0, paramBoolean, i2, i5, 0, 0, bool, i6);
          break;
        }
      }
      while ((this.bL == 0L) || (this.bE[1] != 0));
      this.bH = true;
      this.bw.add(Integer.valueOf(this.br));
      localv = org.vidogram.messenger.v.a();
      l1 = this.bL;
      i2 = this.bA[1];
      if (this.bF[1] == 0);
      for (paramBoolean = true; ; paramBoolean = false)
      {
        i5 = this.bD[1];
        i6 = this.e;
        bool = org.vidogram.messenger.e.d(this.i);
        i7 = this.br;
        this.br = (i7 + 1);
        localv.a(l1, 50, i2, paramBoolean, i5, i6, 0, 0, bool, i7);
        break label191;
        break;
      }
    }
    while (this.bG[0] != 0);
    label133: label436: label569: this.bw.add(Integer.valueOf(this.br));
    label562: org.vidogram.messenger.v localv = org.vidogram.messenger.v.a();
    long l1 = this.bq;
    int i1 = this.bB[0];
    int i2 = this.bC[0];
    int i3 = this.e;
    paramBoolean = org.vidogram.messenger.e.d(this.i);
    int i4 = this.br;
    this.br = (i4 + 1);
    localv.a(l1, 50, i1, true, i2, i3, 1, 0, paramBoolean, i4);
    this.bT = true;
  }

  private void d(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (this.C != null)
      this.C.cancel();
    if (!paramBoolean2)
    {
      if (paramBoolean1)
      {
        this.A.getImageView().setScaleX(0.1F);
        this.A.getImageView().setScaleY(0.1F);
        this.A.getImageView().setAlpha(0.0F);
        this.B.setScaleX(1.0F);
        this.B.setScaleY(1.0F);
        this.B.setAlpha(1.0F);
        this.A.getImageView().setVisibility(4);
        this.B.setVisibility(0);
        this.A.setEnabled(false);
        return;
      }
      this.B.setScaleX(0.1F);
      this.B.setScaleY(0.1F);
      this.B.setAlpha(0.0F);
      this.A.getImageView().setScaleX(1.0F);
      this.A.getImageView().setScaleY(1.0F);
      this.A.getImageView().setAlpha(1.0F);
      this.A.getImageView().setVisibility(0);
      this.B.setVisibility(4);
      this.A.setEnabled(true);
      return;
    }
    this.C = new AnimatorSet();
    if (paramBoolean1)
    {
      this.B.setVisibility(0);
      this.A.setEnabled(false);
      this.C.playTogether(new Animator[] { ObjectAnimator.ofFloat(this.A.getImageView(), "scaleX", new float[] { 0.1F }), ObjectAnimator.ofFloat(this.A.getImageView(), "scaleY", new float[] { 0.1F }), ObjectAnimator.ofFloat(this.A.getImageView(), "alpha", new float[] { 0.0F }), ObjectAnimator.ofFloat(this.B, "scaleX", new float[] { 1.0F }), ObjectAnimator.ofFloat(this.B, "scaleY", new float[] { 1.0F }), ObjectAnimator.ofFloat(this.B, "alpha", new float[] { 1.0F }) });
    }
    while (true)
    {
      this.C.addListener(new org.vidogram.messenger.b(paramBoolean1)
      {
        public void onAnimationCancel(Animator paramAnimator)
        {
          if ((q.bq(q.this) != null) && (q.bq(q.this).equals(paramAnimator)))
            q.f(q.this, null);
        }

        public void onAnimationEnd(Animator paramAnimator)
        {
          if ((q.bq(q.this) != null) && (q.bq(q.this).equals(paramAnimator)))
          {
            if (!this.a)
              q.br(q.this).setVisibility(4);
          }
          else
            return;
          q.bs(q.this).getImageView().setVisibility(4);
        }
      });
      this.C.setDuration(150L);
      this.C.start();
      return;
      this.A.getImageView().setVisibility(0);
      this.A.setEnabled(true);
      this.C.playTogether(new Animator[] { ObjectAnimator.ofFloat(this.B, "scaleX", new float[] { 0.1F }), ObjectAnimator.ofFloat(this.B, "scaleY", new float[] { 0.1F }), ObjectAnimator.ofFloat(this.B, "alpha", new float[] { 0.0F }), ObjectAnimator.ofFloat(this.A.getImageView(), "scaleX", new float[] { 1.0F }), ObjectAnimator.ofFloat(this.A.getImageView(), "scaleY", new float[] { 1.0F }), ObjectAnimator.ofFloat(this.A.getImageView(), "alpha", new float[] { 1.0F }) });
    }
  }

  private void e(int paramInt)
  {
    Object localObject1;
    if ((paramInt == 0) || (paramInt == 1) || (paramInt == 4) || (paramInt == 2))
      if (this.i != null)
        if (this.i.k > org.vidogram.messenger.v.a().H)
          if ((paramInt == 0) || (paramInt == 1))
          {
            localObject1 = "bigchat_upload_photo";
            if (org.vidogram.messenger.v.a((String)localObject1, this))
              break label117;
          }
    label117: Object localObject3;
    label576: 
    do
    {
      do
      {
        return;
        localObject1 = "bigchat_upload_document";
        break;
        if ((paramInt == 0) || (paramInt == 1))
        {
          localObject1 = "chat_upload_photo";
          break;
        }
        localObject1 = "chat_upload_document";
        break;
        if ((paramInt == 0) || (paramInt == 1))
        {
          localObject1 = "pm_upload_photo";
          break;
        }
        localObject1 = "pm_upload_document";
        break;
        File localFile;
        if (paramInt == 0)
        {
          if ((Build.VERSION.SDK_INT >= 23) && (l().checkSelfPermission("android.permission.CAMERA") != 0))
          {
            l().requestPermissions(new String[] { "android.permission.CAMERA" }, 19);
            return;
          }
          while (true)
          {
            try
            {
              localObject1 = new Intent("android.media.action.IMAGE_CAPTURE");
              localFile = org.vidogram.messenger.a.i();
              if (localFile == null)
                continue;
              if (Build.VERSION.SDK_INT >= 24)
              {
                ((Intent)localObject1).putExtra("output", FileProvider.a(l(), "org.vidogram.messenger.beta.provider", localFile));
                ((Intent)localObject1).addFlags(2);
                ((Intent)localObject1).addFlags(1);
                this.bY = localFile.getAbsolutePath();
                a((Intent)localObject1, 0);
                return;
              }
            }
            catch (Exception localException1)
            {
              org.vidogram.messenger.n.a("tmessages", localException1);
              return;
            }
            localException1.putExtra("output", Uri.fromFile(localFile));
          }
        }
        Object localObject2;
        if (paramInt == 1)
        {
          if ((Build.VERSION.SDK_INT >= 23) && (l().checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0))
          {
            l().requestPermissions(new String[] { "android.permission.READ_EXTERNAL_STORAGE" }, 4);
            return;
          }
          if ((this.k == null) || (org.vidogram.messenger.a.c(this.k.o) >= 46));
          for (boolean bool = true; ; bool = false)
          {
            localObject2 = new aj(false, bool, true, this);
            ((aj)localObject2).a(new aj.b()
            {
              public void a()
              {
                try
                {
                  Intent localIntent1 = new Intent();
                  localIntent1.setType("video/*");
                  localIntent1.setAction("android.intent.action.GET_CONTENT");
                  localIntent1.putExtra("android.intent.extra.sizeLimit", 1610612736L);
                  Intent localIntent2 = new Intent("android.intent.action.PICK");
                  localIntent2.setType("image/*");
                  localIntent2 = Intent.createChooser(localIntent2, null);
                  localIntent2.putExtra("android.intent.extra.INITIAL_INTENTS", new Intent[] { localIntent1 });
                  q.this.a(localIntent2, 1);
                  return;
                }
                catch (Exception localException)
                {
                  org.vidogram.messenger.n.a("tmessages", localException);
                }
              }

              public void a(ArrayList<String> paramArrayList1, ArrayList<String> paramArrayList2, ArrayList<ArrayList<g.ab>> paramArrayList, ArrayList<MediaController.j> paramArrayList3)
              {
                org.vidogram.messenger.ac.a(paramArrayList1, null, q.o(q.this), q.q(q.this), paramArrayList2, paramArrayList);
                org.vidogram.messenger.ac.b(paramArrayList3, q.o(q.this), q.q(q.this));
                q.this.a(false, null, null, null, false, true);
                org.vidogram.messenger.d.b.a(q.o(q.this), true);
              }

              public boolean a(String paramString)
              {
                int i = 0;
                if (Build.VERSION.SDK_INT >= 16)
                {
                  if (!q.this.a(paramString, true, true))
                    i = 1;
                  return i;
                }
                org.vidogram.messenger.ac.a(paramString, 0L, 0L, 0, 0, null, q.o(q.this), q.q(q.this), null);
                q.this.a(false, null, null, null, false, true);
                org.vidogram.messenger.d.b.a(q.o(q.this), true);
                return true;
              }
            });
            a((org.vidogram.ui.a.g)localObject2);
            return;
          }
        }
        if (paramInt == 2)
        {
          if ((Build.VERSION.SDK_INT >= 23) && (l().checkSelfPermission("android.permission.CAMERA") != 0))
          {
            l().requestPermissions(new String[] { "android.permission.CAMERA" }, 20);
            return;
          }
          while (true)
          {
            try
            {
              localObject2 = new Intent("android.media.action.VIDEO_CAPTURE");
              localFile = org.vidogram.messenger.a.j();
              if (localFile == null)
                continue;
              if (Build.VERSION.SDK_INT >= 24)
              {
                ((Intent)localObject2).putExtra("output", FileProvider.a(l(), "org.vidogram.messenger.beta.provider", localFile));
                ((Intent)localObject2).addFlags(2);
                ((Intent)localObject2).addFlags(1);
                ((Intent)localObject2).putExtra("android.intent.extra.sizeLimit", 1610612736L);
                this.bY = localFile.getAbsolutePath();
                a((Intent)localObject2, 2);
                return;
              }
            }
            catch (Exception localException2)
            {
              org.vidogram.messenger.n.a("tmessages", localException2);
              return;
            }
            if (Build.VERSION.SDK_INT < 18)
              continue;
            localException2.putExtra("output", Uri.fromFile(localFile));
          }
        }
        if (paramInt != 6)
          break label576;
      }
      while (!org.vidogram.messenger.a.a(this));
      localObject3 = new ad();
      ((ad)localObject3).a(new ad.a()
      {
        public void a(g.au paramau)
        {
          org.vidogram.messenger.ac.a().a(paramau, q.o(q.this), q.q(q.this), null, null);
          q.ax(q.this);
          q.this.a(false, null, null, null, false, true);
          org.vidogram.messenger.d.b.a(q.o(q.this), true);
          if (q.aV(q.this))
            q.l(q.this, true);
        }
      });
      a((org.vidogram.ui.a.g)localObject3);
      return;
      if (paramInt == 4)
      {
        if ((Build.VERSION.SDK_INT >= 23) && (l().checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0))
        {
          l().requestPermissions(new String[] { "android.permission.READ_EXTERNAL_STORAGE" }, 4);
          return;
        }
        localObject3 = new w();
        ((w)localObject3).a(new w.a()
        {
          public void a()
          {
            try
            {
              Intent localIntent = new Intent("android.intent.action.PICK");
              localIntent.setType("*/*");
              q.this.a(localIntent, 21);
              return;
            }
            catch (Exception localException)
            {
              org.vidogram.messenger.n.a("tmessages", localException);
            }
          }

          public void a(w paramw, ArrayList<String> paramArrayList)
          {
            paramw.d();
            org.vidogram.messenger.ac.a(paramArrayList, paramArrayList, null, null, q.o(q.this), q.q(q.this));
            q.this.a(false, null, null, null, false, true);
            org.vidogram.messenger.d.b.a(q.o(q.this), true);
          }
        });
        a((org.vidogram.ui.a.g)localObject3);
        return;
      }
      if (paramInt != 3)
        continue;
      if ((Build.VERSION.SDK_INT >= 23) && (l().checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0))
      {
        l().requestPermissions(new String[] { "android.permission.READ_EXTERNAL_STORAGE" }, 4);
        return;
      }
      localObject3 = new c();
      ((c)localObject3).a(new c.a()
      {
        public void a(ArrayList<u> paramArrayList)
        {
          org.vidogram.messenger.ac.a(paramArrayList, q.o(q.this), q.q(q.this));
          q.this.a(false, null, null, null, false, true);
          org.vidogram.messenger.d.b.a(q.o(q.this), true);
        }
      });
      a((org.vidogram.ui.a.g)localObject3);
      return;
    }
    while (paramInt != 5);
    if ((Build.VERSION.SDK_INT >= 23) && (l().checkSelfPermission("android.permission.READ_CONTACTS") != 0))
    {
      l().requestPermissions(new String[] { "android.permission.READ_CONTACTS" }, 5);
      return;
    }
    try
    {
      localObject3 = new Intent("android.intent.action.PICK", ContactsContract.Contacts.CONTENT_URI);
      ((Intent)localObject3).setType("vnd.android.cursor.dir/phone_v2");
      a((Intent)localObject3, 31);
      return;
    }
    catch (Exception localException3)
    {
      org.vidogram.messenger.n.a("tmessages", localException3);
    }
  }

  private void e(u paramu)
  {
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(l());
    int i1;
    boolean[] arrayOfBoolean;
    Object localObject1;
    Object localObject2;
    label183: org.vidogram.ui.c.l locall;
    label241: int i2;
    if (paramu != null)
    {
      i1 = 1;
      localBuilder.setMessage(org.vidogram.messenger.r.a("AreYouSureDeleteMessages", 2131230877, new Object[] { org.vidogram.messenger.r.b("messages", i1) }));
      localBuilder.setTitle(org.vidogram.messenger.r.a("Message", 2131231431));
      arrayOfBoolean = new boolean[3];
      if ((this.i == null) || (!this.i.r))
        break label651;
      if (paramu == null)
        break label346;
      if ((paramu.a.f != null) && (!(paramu.a.f instanceof g.mt)))
        break label642;
      localObject1 = org.vidogram.messenger.v.a().a(Integer.valueOf(paramu.a.c));
      if ((localObject1 == null) || (((g.vw)localObject1).d == org.vidogram.messenger.ad.c()))
        break label636;
      localObject2 = new FrameLayout(l());
      if (Build.VERSION.SDK_INT >= 21)
        ((FrameLayout)localObject2).setPadding(0, org.vidogram.messenger.a.a(8.0F), 0, 0);
      i1 = 0;
      if (i1 >= 3)
        break label573;
      locall = new org.vidogram.ui.c.l(l());
      locall.setBackgroundResource(2130837946);
      locall.setTag(Integer.valueOf(i1));
      if (i1 != 0)
        break label483;
      locall.a(org.vidogram.messenger.r.a("DeleteBanUser", 2131231125), "", false, false);
      if (!org.vidogram.messenger.r.a)
        break label557;
      i2 = org.vidogram.messenger.a.a(8.0F);
      label254: if (!org.vidogram.messenger.r.a)
        break label562;
    }
    label557: label562: for (int i3 = 0; ; i3 = org.vidogram.messenger.a.a(8.0F))
    {
      locall.setPadding(i2, 0, i3, 0);
      ((FrameLayout)localObject2).addView(locall, org.vidogram.ui.Components.v.a(-1, 48.0F, 51, 8.0F, i1 * 48, 8.0F, 0.0F));
      locall.setOnClickListener(new View.OnClickListener(arrayOfBoolean)
      {
        public void onClick(View paramView)
        {
          paramView = (org.vidogram.ui.c.l)paramView;
          Integer localInteger = (Integer)paramView.getTag();
          boolean[] arrayOfBoolean = this.a;
          int i = localInteger.intValue();
          if (this.a[localInteger.intValue()] == 0);
          for (int j = 1; ; j = 0)
          {
            arrayOfBoolean[i] = j;
            paramView.a(this.a[localInteger.intValue()], true);
            return;
          }
        }
      });
      i1 += 1;
      break label183;
      i1 = this.bt[0].size() + this.bt[1].size();
      break;
      label346: i2 = 1;
      i1 = -1;
      while (true)
      {
        i3 = i1;
        if (i2 >= 0)
        {
          localObject1 = this.bt[i2].entrySet().iterator();
          do
          {
            if (!((Iterator)localObject1).hasNext())
              break label648;
            localObject2 = (u)((Map.Entry)((Iterator)localObject1).next()).getValue();
            i3 = i1;
            if (i1 == -1)
              i3 = ((u)localObject2).a.c;
            if (i3 < 0)
              break;
            i1 = i3;
          }
          while (i3 == ((u)localObject2).a.c);
          i1 = -2;
          label445: if (i1 == -2)
            i3 = i1;
        }
        else
        {
          if (i3 == -1)
            break label642;
          localObject1 = org.vidogram.messenger.v.a().a(Integer.valueOf(i3));
          break;
        }
        i2 -= 1;
      }
      label483: if (i1 == 1)
      {
        locall.a(org.vidogram.messenger.r.a("DeleteReportSpam", 2131231134), "", false, false);
        break label241;
      }
      if (i1 != 2)
        break label241;
      locall.a(org.vidogram.messenger.r.a("DeleteAllFrom", 2131231122, new Object[] { org.vidogram.messenger.f.a(((g.vw)localObject1).e, ((g.vw)localObject1).f) }), "", false, false);
      break label241;
      i2 = 0;
      break label254;
    }
    label573: localBuilder.setView((View)localObject2);
    while (true)
    {
      localBuilder.setPositiveButton(org.vidogram.messenger.r.a("OK", 2131231604), new DialogInterface.OnClickListener(paramu, (g.vw)localObject1, arrayOfBoolean)
      {
        public void onClick(DialogInterface paramDialogInterface, int paramInt)
        {
          Object localObject;
          Iterator localIterator;
          if (this.a != null)
          {
            localObject = new ArrayList();
            ((ArrayList)localObject).add(Integer.valueOf(this.a.q()));
            localIterator = null;
            paramDialogInterface = localIterator;
            if (q.this.k != null)
            {
              paramDialogInterface = localIterator;
              if (this.a.a.C != 0L)
              {
                paramDialogInterface = localIterator;
                if (this.a.f != 10)
                {
                  paramDialogInterface = new ArrayList();
                  paramDialogInterface.add(Long.valueOf(this.a.a.C));
                }
              }
            }
            org.vidogram.messenger.v.a().a((ArrayList)localObject, paramDialogInterface, q.this.k, this.a.a.d.b);
            paramDialogInterface = (DialogInterface)localObject;
            if (this.b != null)
            {
              if (this.c[0] != 0)
                org.vidogram.messenger.v.a().a(q.this.i.h, this.b, q.this.n);
              if (this.c[1] != 0)
              {
                localObject = new g.ey();
                ((g.ey)localObject).c = org.vidogram.messenger.v.a(q.this.i);
                ((g.ey)localObject).d = org.vidogram.messenger.v.a(this.b);
                ((g.ey)localObject).e = paramDialogInterface;
                ConnectionsManager.a().a((org.vidogram.tgnet.f)localObject, new org.vidogram.tgnet.c()
                {
                });
              }
              if (this.c[2] != 0)
                org.vidogram.messenger.v.a().a(q.this.i, this.b, 0);
            }
            return;
          }
          paramInt = 1;
          paramDialogInterface = null;
          label282: int i;
          if (paramInt >= 0)
          {
            localObject = new ArrayList(q.f(q.this)[paramInt].keySet());
            int j = 0;
            i = j;
            if (!((ArrayList)localObject).isEmpty())
            {
              paramDialogInterface = (u)q.f(q.this)[paramInt].get(((ArrayList)localObject).get(0));
              i = j;
              if (paramDialogInterface.a.d.b != 0)
                i = paramDialogInterface.a.d.b;
            }
            if (q.this.k == null)
              break label527;
            paramDialogInterface = new ArrayList();
            localIterator = q.f(q.this)[paramInt].entrySet().iterator();
            while (localIterator.hasNext())
            {
              u localu = (u)((Map.Entry)localIterator.next()).getValue();
              if ((localu.a.C == 0L) || (localu.f == 10))
                continue;
              paramDialogInterface.add(Long.valueOf(localu.a.C));
            }
          }
          while (true)
          {
            org.vidogram.messenger.v.a().a((ArrayList)localObject, paramDialogInterface, q.this.k, i);
            paramInt -= 1;
            paramDialogInterface = (DialogInterface)localObject;
            break label282;
            q.bo(q.this).d();
            q.a(q.this, true);
            break;
            label527: paramDialogInterface = null;
          }
        }
      });
      localBuilder.setNegativeButton(org.vidogram.messenger.r.a("Cancel", 2131230943), null);
      b(localBuilder.create());
      return;
      label636: localObject1 = null;
      continue;
      label642: localObject1 = null;
      break;
      label648: break label445;
      label651: localObject1 = null;
    }
  }

  private void e(boolean paramBoolean)
  {
    if ((this.bG[0] != 0) && (this.bS == 0) && (this.bM == 0))
    {
      if ((paramBoolean) && (this.F.o() == this.G.a() - 1))
      {
        c(false, true);
        this.bW = 2147483647;
        ac();
        return;
      }
      this.F.a(this.m.size() - 1, -100000 - this.E.getPaddingTop());
      return;
    }
    J();
    this.bw.add(Integer.valueOf(this.br));
    org.vidogram.messenger.v localv = org.vidogram.messenger.v.a();
    long l1 = this.bq;
    int i1 = this.e;
    paramBoolean = org.vidogram.messenger.e.d(this.i);
    int i2 = this.br;
    this.br = (i2 + 1);
    localv.a(l1, 30, 0, true, 0, i1, 0, 0, paramBoolean, i2);
  }

  private void f(int paramInt)
  {
    if (this.aV == null)
      return;
    Object localObject1;
    Object localObject3;
    switch (paramInt)
    {
    default:
    case 0:
    case 1:
    case 2:
    case 9707:
    case 3:
    case 4:
      do
      {
        while (true)
        {
          this.aV = null;
          return;
          if (!org.vidogram.messenger.ac.a().a(this.aV, false))
            continue;
          I();
          continue;
          if (l() == null)
          {
            this.aV = null;
            return;
          }
          e(this.aV);
          continue;
          this.aX = this.aV;
          localObject1 = new Bundle();
          ((Bundle)localObject1).putBoolean("onlySelect", true);
          ((Bundle)localObject1).putBoolean("invisibleTab", false);
          ((Bundle)localObject1).putInt("dialogsType", 1);
          localObject1 = new v((Bundle)localObject1);
          ((v)localObject1).a(this);
          a((org.vidogram.ui.a.g)localObject1);
          continue;
          this.aX = this.aV;
          localObject1 = new Bundle();
          ((Bundle)localObject1).putBoolean("onlySelect", true);
          ((Bundle)localObject1).putInt("dialogsType", 1);
          ((Bundle)localObject1).putBoolean("invisibleTab", false);
          localObject1 = new v((Bundle)localObject1);
          ((v)localObject1).a(this);
          a((org.vidogram.ui.a.g)localObject1);
          cn = true;
          continue;
          org.vidogram.messenger.a.b(a(this.aV, 0, false));
        }
        localObject3 = this.aV.a.A;
        localObject1 = localObject3;
        if (localObject3 != null)
        {
          localObject1 = localObject3;
          if (((String)localObject3).length() > 0)
          {
            localObject1 = localObject3;
            if (!new File((String)localObject3).exists())
              localObject1 = null;
          }
        }
        if (localObject1 != null)
        {
          localObject3 = localObject1;
          if (((String)localObject1).length() != 0)
            continue;
        }
        localObject3 = org.vidogram.messenger.m.b(this.aV.a).toString();
      }
      while ((this.aV.f != 3) && (this.aV.f != 1));
      if ((Build.VERSION.SDK_INT >= 23) && (l().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0))
      {
        l().requestPermissions(new String[] { "android.permission.WRITE_EXTERNAL_STORAGE" }, 4);
        this.aV = null;
        return;
      }
      localObject1 = l();
      if (this.aV.f == 3);
      for (paramInt = 1; ; paramInt = 0)
      {
        MediaController.a((String)localObject3, (Context)localObject1, paramInt, null, null);
        break;
      }
    case 5:
      if ((this.aV.a.A == null) || (this.aV.a.A.length() == 0))
        break;
      localObject1 = new File(this.aV.a.A);
      if (!((File)localObject1).exists())
        break;
    case 6:
    case 7:
    case 8:
    case 9:
    case 10:
    case 11:
    case 12:
    case 13:
    case 14:
    case 15:
    case 16:
    case 17:
    }
    while (true)
    {
      if (localObject1 == null)
      {
        localObject3 = org.vidogram.messenger.m.b(this.aV.a);
        if (((File)localObject3).exists())
          localObject1 = localObject3;
      }
      while (localObject1 != null)
      {
        while (true)
        {
          if (org.vidogram.messenger.r.a().a((File)localObject1))
          {
            a(new ac());
            break;
          }
          if (l() == null)
          {
            this.aV = null;
            return;
          }
          localObject1 = new AlertDialog.Builder(l());
          ((AlertDialog.Builder)localObject1).setTitle(org.vidogram.messenger.r.a("AppName", 2131230856));
          ((AlertDialog.Builder)localObject1).setMessage(org.vidogram.messenger.r.a("IncorrectLocalization", 2131231311));
          ((AlertDialog.Builder)localObject1).setPositiveButton(org.vidogram.messenger.r.a("OK", 2131231604), null);
          b(((AlertDialog.Builder)localObject1).create());
          break;
          localObject3 = this.aV.a.A;
          localObject1 = localObject3;
          if (localObject3 != null)
          {
            localObject1 = localObject3;
            if (((String)localObject3).length() > 0)
            {
              localObject1 = localObject3;
              if (!new File((String)localObject3).exists())
                localObject1 = null;
            }
          }
          if (localObject1 != null)
          {
            localObject3 = localObject1;
            if (((String)localObject1).length() != 0);
          }
          else
          {
            localObject3 = org.vidogram.messenger.m.b(this.aV.a).toString();
          }
          localObject1 = new Intent("android.intent.action.SEND");
          ((Intent)localObject1).setType(this.aV.A().g);
          ((Intent)localObject1).putExtra("android.intent.extra.STREAM", Uri.fromFile(new File((String)localObject3)));
          l().startActivityForResult(Intent.createChooser((Intent)localObject1, org.vidogram.messenger.r.a("ShareFile", 2131231834)), 500);
          break;
          localObject3 = this.aV.a.A;
          localObject1 = localObject3;
          if (localObject3 != null)
          {
            localObject1 = localObject3;
            if (((String)localObject3).length() > 0)
            {
              localObject1 = localObject3;
              if (!new File((String)localObject3).exists())
                localObject1 = null;
            }
          }
          if (localObject1 != null)
          {
            localObject3 = localObject1;
            if (((String)localObject1).length() != 0);
          }
          else
          {
            localObject3 = org.vidogram.messenger.m.b(this.aV.a).toString();
          }
          if ((Build.VERSION.SDK_INT >= 23) && (l().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0))
          {
            l().requestPermissions(new String[] { "android.permission.WRITE_EXTERNAL_STORAGE" }, 4);
            this.aV = null;
            return;
          }
          MediaController.a((String)localObject3, l(), 0, null, null);
          break;
          a(true, this.aV, null, null, false, true);
          break;
          localObject3 = l();
          Object localObject4 = this.aV.R();
          if (this.I.getVisibility() != 0);
          for (localObject1 = this.l; ; localObject1 = null)
          {
            b(new bl((Context)localObject3, this, (g.an)localObject4, null, (bl.b)localObject1));
            break;
          }
          if ((Build.VERSION.SDK_INT >= 23) && (l().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0))
          {
            l().requestPermissions(new String[] { "android.permission.WRITE_EXTERNAL_STORAGE" }, 4);
            this.aV = null;
            return;
          }
          localObject1 = org.vidogram.messenger.m.b(this.aV.A());
          if (localObject1 != null)
          {
            localObject3 = localObject1;
            if (((String)localObject1).length() != 0);
          }
          else
          {
            localObject3 = this.aV.f();
          }
          localObject4 = this.aV.a.A;
          localObject1 = localObject4;
          if (localObject4 != null)
          {
            localObject1 = localObject4;
            if (((String)localObject4).length() > 0)
            {
              localObject1 = localObject4;
              if (!new File((String)localObject4).exists())
                localObject1 = null;
            }
          }
          if (localObject1 != null)
          {
            localObject4 = localObject1;
            if (((String)localObject1).length() != 0);
          }
          else
          {
            localObject4 = org.vidogram.messenger.m.b(this.aV.a).toString();
          }
          Object localObject5 = l();
          if (this.aV.G())
          {
            paramInt = 3;
            label1351: if (this.aV.A() == null)
              break label1393;
          }
          label1393: for (localObject1 = this.aV.A().g; ; localObject1 = "")
          {
            MediaController.a((String)localObject4, (Context)localObject5, paramInt, (String)localObject3, (String)localObject1);
            break;
            paramInt = 2;
            break label1351;
          }
          localObject1 = this.aV.A();
          org.vidogram.messenger.v.a().a((g.q)localObject1);
          G();
          this.l.c((g.q)localObject1);
          break;
          if (l() == null)
          {
            this.aV = null;
            return;
          }
          if ((this.z != null) && (this.d.j()))
          {
            this.d.g();
            this.l.h();
          }
          this.af.c(false);
          this.E.setOnItemLongClickListener(null);
          this.E.setOnItemClickListener(null);
          this.E.setClickable(false);
          this.E.setLongClickable(false);
          localObject1 = this.l;
          localObject3 = this.aV;
          if (!this.aV.U());
          for (boolean bool = true; ; bool = false)
          {
            ((org.vidogram.ui.Components.e)localObject1).a((u)localObject3, bool);
            if (this.l.k())
              this.af.a(false);
            this.P.setVisibility(0);
            this.O.setVisibility(8);
            ad();
            this.l.b(false, false);
            localObject1 = this.d.b();
            ((org.vidogram.ui.a.c)localObject1).b(19).setVisibility(8);
            ((org.vidogram.ui.a.c)localObject1).b(10).setVisibility(8);
            ((org.vidogram.ui.a.c)localObject1).b(11).setVisibility(8);
            ((org.vidogram.ui.a.c)localObject1).b(9707).setVisibility(8);
            ((org.vidogram.ui.a.c)localObject1).b(12).setVisibility(8);
            if (this.C != null)
            {
              this.C.cancel();
              this.C = null;
            }
            this.A.setVisibility(0);
            d(true, false);
            this.d.c();
            h(true);
            ac();
            localObject1 = new g.px();
            ((g.px)localObject1).c = org.vidogram.messenger.v.c((int)this.bq);
            ((g.px)localObject1).d = this.aV.q();
            this.aZ = ConnectionsManager.a().a((org.vidogram.tgnet.f)localObject1, new org.vidogram.tgnet.c()
            {
            });
            break;
          }
          int i2 = this.aV.q();
          localObject1 = new AlertDialog.Builder(l());
          ((AlertDialog.Builder)localObject1).setMessage(org.vidogram.messenger.r.a("PinMessageAlert", 2131231683));
          localObject3 = new boolean[1];
          localObject3[0] = 1;
          localObject4 = new FrameLayout(l());
          if (Build.VERSION.SDK_INT >= 21)
            ((FrameLayout)localObject4).setPadding(0, org.vidogram.messenger.a.a(8.0F), 0, 0);
          localObject5 = new org.vidogram.ui.c.l(l());
          ((org.vidogram.ui.c.l)localObject5).setBackgroundResource(2130837946);
          ((org.vidogram.ui.c.l)localObject5).a(org.vidogram.messenger.r.a("PinNotify", 2131231684), "", true, false);
          if (org.vidogram.messenger.r.a)
          {
            paramInt = org.vidogram.messenger.a.a(8.0F);
            label1916: if (!org.vidogram.messenger.r.a)
              break label2055;
          }
          label2055: for (int i1 = 0; ; i1 = org.vidogram.messenger.a.a(8.0F))
          {
            ((org.vidogram.ui.c.l)localObject5).setPadding(paramInt, 0, i1, 0);
            ((FrameLayout)localObject4).addView((View)localObject5, org.vidogram.ui.Components.v.a(-1, 48.0F, 51, 8.0F, 0.0F, 8.0F, 0.0F));
            ((org.vidogram.ui.c.l)localObject5).setOnClickListener(new View.OnClickListener(localObject3)
            {
              public void onClick(View paramView)
              {
                paramView = (org.vidogram.ui.c.l)paramView;
                boolean[] arrayOfBoolean = this.a;
                if (this.a[0] == 0);
                for (int i = 1; ; i = 0)
                {
                  arrayOfBoolean[0] = i;
                  paramView.a(this.a[0], true);
                  return;
                }
              }
            });
            ((AlertDialog.Builder)localObject1).setView((View)localObject4);
            ((AlertDialog.Builder)localObject1).setPositiveButton(org.vidogram.messenger.r.a("OK", 2131231604), new DialogInterface.OnClickListener(i2, localObject3)
            {
              public void onClick(DialogInterface paramDialogInterface, int paramInt)
              {
                org.vidogram.messenger.v.a().a(q.this.i, this.a, this.b[0]);
              }
            });
            ((AlertDialog.Builder)localObject1).setTitle(org.vidogram.messenger.r.a("AppName", 2131230856));
            ((AlertDialog.Builder)localObject1).setNegativeButton(org.vidogram.messenger.r.a("Cancel", 2131230943), null);
            b(((AlertDialog.Builder)localObject1).create());
            break;
            paramInt = 0;
            break label1916;
          }
          localObject1 = new AlertDialog.Builder(l());
          ((AlertDialog.Builder)localObject1).setMessage(org.vidogram.messenger.r.a("UnpinMessageAlert", 2131231917));
          ((AlertDialog.Builder)localObject1).setPositiveButton(org.vidogram.messenger.r.a("OK", 2131231604), new DialogInterface.OnClickListener()
          {
            public void onClick(DialogInterface paramDialogInterface, int paramInt)
            {
              org.vidogram.messenger.v.a().a(q.this.i, 0, false);
            }
          });
          ((AlertDialog.Builder)localObject1).setTitle(org.vidogram.messenger.r.a("AppName", 2131230856));
          ((AlertDialog.Builder)localObject1).setNegativeButton(org.vidogram.messenger.r.a("Cancel", 2131230943), null);
          b(((AlertDialog.Builder)localObject1).create());
          break;
          localObject1 = new Bundle();
          ((Bundle)localObject1).putInt("user_id", this.aV.a.j.q);
          ((Bundle)localObject1).putString("phone", this.aV.a.j.n);
          ((Bundle)localObject1).putBoolean("addContact", true);
          a(new r((Bundle)localObject1));
          break;
          org.vidogram.messenger.a.b(this.aV.a.j.n);
          break;
          try
          {
            localObject1 = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + this.aV.a.j.n));
            ((Intent)localObject1).addFlags(268435456);
            l().startActivityForResult((Intent)localObject1, 500);
          }
          catch (Exception localException)
          {
            org.vidogram.messenger.n.a("tmessages", localException);
          }
        }
        break;
      }
      Object localObject2 = null;
    }
  }

  private void f(u paramu)
  {
    if (l() == null)
      return;
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(l());
    localBuilder.setTitle(org.vidogram.messenger.r.a("AppName", 2131230856));
    localBuilder.setPositiveButton(org.vidogram.messenger.r.a("OK", 2131231604), null);
    if (paramu.f == 3)
      localBuilder.setMessage(org.vidogram.messenger.r.a("NoPlayerInstalled", 2131231504));
    while (true)
    {
      b(localBuilder.create());
      return;
      localBuilder.setMessage(org.vidogram.messenger.r.a("NoHandleAppInstalled", 2131231494, new Object[] { paramu.A().g }));
    }
  }

  private void f(boolean paramBoolean)
  {
    if (!org.vidogram.messenger.v.a().a(this.bq))
    {
      if (paramBoolean)
      {
        localObject = ApplicationLoader.a.getSharedPreferences("Notifications", 0).edit();
        ((SharedPreferences.Editor)localObject).putInt("notify2_" + this.bq, 2);
        org.vidogram.messenger.w.a().a(this.bq, 1L);
        ((SharedPreferences.Editor)localObject).commit();
        localObject = (g.hq)org.vidogram.messenger.v.a().g.get(Long.valueOf(this.bq));
        if (localObject != null)
        {
          ((g.hq)localObject).i = new g.rl();
          ((g.hq)localObject).i.d = 2147483647;
        }
        z.c(this.bq);
        z.a().b(this.bq);
        return;
      }
      b(org.vidogram.ui.Components.a.a(l(), this.bq));
      return;
    }
    Object localObject = ApplicationLoader.a.getSharedPreferences("Notifications", 0).edit();
    ((SharedPreferences.Editor)localObject).putInt("notify2_" + this.bq, 0);
    org.vidogram.messenger.w.a().a(this.bq, 0L);
    ((SharedPreferences.Editor)localObject).commit();
    localObject = (g.hq)org.vidogram.messenger.v.a().g.get(Long.valueOf(this.bq));
    if (localObject != null)
      ((g.hq)localObject).i = new g.rl();
    z.c(this.bq);
  }

  private void g(int paramInt)
  {
    int i1 = ConnectionsManager.a().e();
    if ((i1 != 2) && (i1 != 1))
    {
      if (paramInt == 9708)
        a(org.vidogram.messenger.r.a("VideoRequest", 2131232616));
      if (paramInt == 9709)
        a(org.vidogram.messenger.r.a("AudioRequest", 2131232615));
    }
  }

  private void g(u paramu)
  {
    int i1 = this.m.indexOf(paramu);
    if (i1 == -1);
    do
    {
      return;
      this.m.remove(i1);
    }
    while (this.G == null);
    this.G.d(a.c(this.G) + this.m.size() - i1 - 1);
  }

  private void g(boolean paramBoolean)
  {
    if (this.au.getTag() == null)
    {
      this.au.setTag(Integer.valueOf(1));
      if (this.av != null)
      {
        this.av.cancel();
        this.av = null;
      }
      if (paramBoolean)
      {
        this.av = new AnimatorSet();
        this.av.playTogether(new Animator[] { ObjectAnimator.ofFloat(this.au, "translationY", new float[] { -org.vidogram.messenger.a.a(50.0F) }) });
        this.av.setDuration(200L);
        this.av.addListener(new org.vidogram.messenger.b()
        {
          public void onAnimationCancel(Animator paramAnimator)
          {
            if ((q.bi(q.this) != null) && (q.bi(q.this).equals(paramAnimator)))
              q.d(q.this, null);
          }

          public void onAnimationEnd(Animator paramAnimator)
          {
            if ((q.bi(q.this) != null) && (q.bi(q.this).equals(paramAnimator)))
            {
              q.bj(q.this).setVisibility(8);
              q.d(q.this, null);
            }
          }
        });
        this.av.start();
      }
    }
    else
    {
      return;
    }
    this.au.setTranslationY(-org.vidogram.messenger.a.a(50.0F));
    this.au.setVisibility(8);
  }

  private void h(u paramu)
  {
    if (l() == null)
      return;
    if ((this.z != null) && (this.d.j()))
    {
      this.d.g();
      this.l.h();
    }
    co = true;
    this.af.c(false);
    this.E.setOnItemLongClickListener(null);
    this.E.setOnItemClickListener(null);
    this.E.setClickable(false);
    this.E.setLongClickable(false);
    org.vidogram.ui.Components.e locale = this.l;
    if (!paramu.U());
    for (boolean bool = true; ; bool = false)
    {
      locale.a(paramu, bool);
      if (this.l.k())
        this.af.a(false);
      this.P.setVisibility(0);
      this.O.setVisibility(8);
      this.R.setVisibility(8);
      this.l.b(false, false);
      paramu = this.d.b();
      paramu.b(19).setVisibility(8);
      paramu.b(10).setVisibility(8);
      paramu.b(11).setVisibility(8);
      paramu.b(9707).setVisibility(8);
      paramu.b(12).setVisibility(8);
      if (this.C != null)
      {
        this.C.cancel();
        this.C = null;
      }
      this.A.setVisibility(0);
      d(false, true);
      this.d.c();
      h(true);
      ac();
      return;
    }
  }

  private void h(boolean paramBoolean)
  {
    if (this.au == null)
      return;
    if (this.n != null)
    {
      if ((this.aL != null) && (this.n.s != this.aL.q()))
        this.aL = null;
      if ((this.n.s != 0) && (this.aL == null))
        this.aL = ((u)this.by[0].get(Integer.valueOf(this.n.s)));
    }
    Object localObject1 = ApplicationLoader.a.getSharedPreferences("Notifications", 0);
    if ((this.n == null) || (this.n.s == 0) || (this.n.s == ((SharedPreferences)localObject1).getInt("pin_" + this.bq, 0)) || ((this.d != null) && (this.d.f())))
      g(paramBoolean);
    while (true)
    {
      X();
      return;
      if (this.aL != null)
      {
        label313: FrameLayout.LayoutParams localLayoutParams1;
        FrameLayout.LayoutParams localLayoutParams2;
        int i1;
        if (this.au.getTag() != null)
        {
          this.au.setTag(null);
          if (this.av != null)
          {
            this.av.cancel();
            this.av = null;
          }
          if (paramBoolean)
          {
            this.au.setVisibility(0);
            this.av = new AnimatorSet();
            this.av.playTogether(new Animator[] { ObjectAnimator.ofFloat(this.au, "translationY", new float[] { 0.0F }) });
            this.av.setDuration(200L);
            this.av.addListener(new org.vidogram.messenger.b()
            {
              public void onAnimationCancel(Animator paramAnimator)
              {
                if ((q.bi(q.this) != null) && (q.bi(q.this).equals(paramAnimator)))
                  q.d(q.this, null);
              }

              public void onAnimationEnd(Animator paramAnimator)
              {
                if ((q.bi(q.this) != null) && (q.bi(q.this).equals(paramAnimator)))
                  q.d(q.this, null);
              }
            });
            this.av.start();
          }
        }
        else
        {
          localLayoutParams1 = (FrameLayout.LayoutParams)this.ax.getLayoutParams();
          localLayoutParams2 = (FrameLayout.LayoutParams)this.ay.getLayoutParams();
          localObject2 = org.vidogram.messenger.m.a(this.aL.n, org.vidogram.messenger.a.a(50.0F));
          localObject1 = localObject2;
          if (localObject2 == null)
            localObject1 = org.vidogram.messenger.m.a(this.aL.m, org.vidogram.messenger.a.a(50.0F));
          if ((localObject1 != null) && (!(localObject1 instanceof g.rt)) && (!(((g.az)localObject1).c instanceof g.ja)) && (this.aL.f != 13))
            break label558;
          this.aw.setImageBitmap(null);
          this.be = null;
          this.aw.setVisibility(4);
          i1 = org.vidogram.messenger.a.a(18.0F);
          localLayoutParams2.leftMargin = i1;
        }
        for (localLayoutParams1.leftMargin = i1; ; localLayoutParams1.leftMargin = i1)
        {
          this.ax.setLayoutParams(localLayoutParams1);
          this.ay.setLayoutParams(localLayoutParams2);
          this.ax.setText(org.vidogram.messenger.r.a("PinnedMessage", 2131231685));
          if (this.aL.f != 14)
            break label614;
          this.ay.setText(String.format("%s - %s", new Object[] { this.aL.Q(), this.aL.O() }));
          break;
          this.au.setTranslationY(0.0F);
          this.au.setVisibility(0);
          break label313;
          label558: this.be = ((g.az)localObject1).c;
          this.aw.a(this.be, "50_50", (Drawable)null);
          this.aw.setVisibility(0);
          i1 = org.vidogram.messenger.a.a(55.0F);
          localLayoutParams2.leftMargin = i1;
        }
        label614: if ((this.aL.a.j instanceof g.nz))
        {
          this.ay.setText(org.vidogram.messenger.j.a(this.aL.a.j.m.g, this.ay.getPaint().getFontMetricsInt(), org.vidogram.messenger.a.a(14.0F), false));
          continue;
        }
        if (this.aL.b == null)
          continue;
        Object localObject2 = this.aL.b.toString();
        localObject1 = localObject2;
        if (((String)localObject2).length() > 150)
          localObject1 = ((String)localObject2).substring(0, 150);
        localObject1 = ((String)localObject1).replace('\n', ' ');
        this.ay.setText(org.vidogram.messenger.j.a((CharSequence)localObject1, this.ay.getPaint().getFontMetricsInt(), org.vidogram.messenger.a.a(14.0F), false));
        continue;
      }
      this.be = null;
      g(paramBoolean);
      if (this.aM == this.n.s)
        continue;
      this.aM = this.n.s;
      org.vidogram.messenger.d.c.a(this.i.h, this.n.s, true);
    }
  }

  private void i(boolean paramBoolean)
  {
    if (this.l == null)
      return;
    g.s locals = org.vidogram.messenger.d.b.a(this.bq);
    g.ar localar;
    label39: Object localObject;
    label70: int i2;
    int i1;
    label110: g.at localat;
    int i3;
    if ((locals != null) && (locals.d != 0))
    {
      localar = org.vidogram.messenger.d.b.b(this.bq);
      if (this.l.getFieldText() != null)
        break label546;
      if (locals == null)
        break label490;
      localObject = this.l;
      if (locals.c)
        break label309;
      paramBoolean = true;
      ((org.vidogram.ui.Components.e)localObject).a(null, paramBoolean);
      if (locals.f.isEmpty())
        break label536;
      localObject = SpannableStringBuilder.valueOf(locals.e);
      org.vidogram.messenger.d.c.a(locals.f);
      i2 = 0;
      i1 = 0;
      if (i2 >= locals.f.size())
        break label434;
      localat = (g.at)locals.f.get(i2);
      if ((!(localat instanceof g.kn)) && (!(localat instanceof g.nm)))
        break label327;
      if (!(localat instanceof g.kn))
        break label314;
      i3 = ((g.kn)localat).g.b;
      label173: if ((localat.b + i1 + localat.c < ((SpannableStringBuilder)localObject).length()) && (((SpannableStringBuilder)localObject).charAt(localat.b + i1 + localat.c) == ' '))
        localat.c += 1;
      URLSpanUserMention localURLSpanUserMention = new URLSpanUserMention("" + i3);
      i3 = localat.b;
      int i4 = localat.b;
      ((SpannableStringBuilder)localObject).setSpan(localURLSpanUserMention, i3 + i1, localat.c + (i4 + i1), 33);
    }
    while (true)
    {
      i2 += 1;
      break label110;
      localar = null;
      break label39;
      label309: paramBoolean = false;
      break label70;
      label314: i3 = ((g.nm)localat).g;
      break label173;
      label327: if ((localat instanceof g.nh))
      {
        ((SpannableStringBuilder)localObject).insert(localat.b + localat.c + i1, "`");
        ((SpannableStringBuilder)localObject).insert(localat.b + i1, "`");
        i1 += 2;
        continue;
      }
      if ((localat instanceof g.nn))
      {
        ((SpannableStringBuilder)localObject).insert(localat.b + localat.c + i1, "```");
        ((SpannableStringBuilder)localObject).insert(localat.b + i1, "```");
        i1 += 6;
        continue;
        label434: this.l.setFieldText((CharSequence)localObject);
        if (b().getBoolean("hasUrl", false))
        {
          this.l.setSelection(locals.e.indexOf('\n') + 1);
          org.vidogram.messenger.a.a(new Runnable()
          {
            public void run()
            {
              if (q.this.l != null)
              {
                q.this.l.setFieldFocused(true);
                q.this.l.m();
              }
            }
          }
          , 700L);
        }
        while (true)
        {
          label490: if ((this.aY != null) || (localar == null))
            break label576;
          this.aY = new u(localar, org.vidogram.messenger.v.a().d(), false);
          a(true, this.aY, null, null, false, false);
          return;
          label536: localObject = locals.e;
          break;
          label546: if ((!paramBoolean) || (locals != null))
            continue;
          this.l.setFieldText("");
          a(false, null, null, null, false, true);
        }
        label576: break;
      }
    }
  }

  public int A()
  {
    return 0;
  }

  public View a(Context paramContext)
  {
    if (this.r.isEmpty())
    {
      i1 = 0;
      while (i1 < 8)
      {
        this.r.add(new org.vidogram.ui.c.j(paramContext));
        i1 += 1;
      }
    }
    int i1 = 1;
    while (i1 >= 0)
    {
      this.bt[i1].clear();
      this.bu[i1].clear();
      i1 -= 1;
    }
    this.bv = 0;
    this.h = true;
    if (this.al != null)
    {
      this.al.o();
      this.al = null;
    }
    org.vidogram.ui.a.l.a(paramContext);
    org.vidogram.ui.a.l.b(paramContext);
    this.d.setAddToContainer(false);
    this.d.setBackButtonDrawable(new org.vidogram.ui.a.f(false));
    this.d.setActionBarMenuOnItemClick(new a.a()
    {
      public void a(int paramInt)
      {
        if (paramInt == -1)
          if (q.e(q.this).f())
          {
            paramInt = 1;
            while (paramInt >= 0)
            {
              q.f(q.this)[paramInt].clear();
              q.g(q.this)[paramInt].clear();
              paramInt -= 1;
            }
            q.a(q.this, 0);
            if (q.this.l.j())
            {
              q.this.l.a(null, false);
              q.i(q.this);
            }
          }
        label783: label808: label1471: label1512: 
        do
        {
          do
          {
            Object localObject1;
            Object localObject2;
            do
            {
              do
              {
                do
                {
                  do
                  {
                    do
                    {
                      return;
                      q.h(q.this).d();
                      q.a(q.this, true);
                      break;
                      q.this.d();
                      return;
                      if (paramInt == 10)
                      {
                        localObject1 = "";
                        paramInt = 0;
                        int i = 1;
                        while (i >= 0)
                        {
                          ArrayList localArrayList = new ArrayList(q.g(q.this)[i].keySet());
                          if (q.this.k == null)
                            Collections.sort(localArrayList);
                          while (true)
                          {
                            int j = 0;
                            while (j < localArrayList.size())
                            {
                              localObject2 = (Integer)localArrayList.get(j);
                              u localu = (u)q.g(q.this)[i].get(localObject2);
                              localObject2 = localObject1;
                              if (((String)localObject1).length() != 0)
                                localObject2 = (String)localObject1 + "\n\n";
                              localObject1 = (String)localObject2 + q.a(q.this, localu, paramInt, true);
                              paramInt = localu.a.c;
                              j += 1;
                            }
                            Collections.sort(localArrayList, Collections.reverseOrder());
                          }
                          i -= 1;
                        }
                        if (((String)localObject1).length() != 0)
                          org.vidogram.messenger.a.b((CharSequence)localObject1);
                        paramInt = 1;
                        while (paramInt >= 0)
                        {
                          q.f(q.this)[paramInt].clear();
                          q.g(q.this)[paramInt].clear();
                          paramInt -= 1;
                        }
                        q.a(q.this, 0);
                        q.j(q.this).d();
                        q.a(q.this, true);
                        q.i(q.this);
                        return;
                      }
                      if (paramInt != 20)
                        break label783;
                      if ((q.this.l == null) || (!q.B()))
                        continue;
                      if (((u)q.k(q.this).get(0)).a.j.l != null)
                      {
                        ((u)q.k(q.this).get(0)).a.j.l = q.this.l.getFieldText().toString();
                        ((u)q.k(q.this).get(0)).d = q.this.l.getFieldText().toString();
                      }
                      while (true)
                      {
                        q.b(false);
                        if (!q.l(q.this).f())
                          break;
                        paramInt = 1;
                        while (true)
                          if (paramInt >= 0)
                          {
                            q.f(q.this)[paramInt].clear();
                            q.g(q.this)[paramInt].clear();
                            paramInt -= 1;
                            continue;
                            if ((((u)q.k(q.this).get(0)).a.i == null) || (((u)q.k(q.this).get(0)).a.i.length() <= 0))
                              break;
                            ((u)q.k(q.this).get(0)).a.i = q.this.l.getFieldText().toString();
                            break;
                          }
                        q.a(q.this, 0);
                        if (q.this.l.j())
                          q.this.l.a(null, false);
                        while (true)
                        {
                          q.i(q.this);
                          return;
                          q.m(q.this).d();
                          q.a(q.this, true);
                        }
                      }
                      q.this.d();
                      return;
                    }
                    while ((q.this.l == null) || ((!q.this.l.k()) && (!q.this.l.i())));
                    q.this.l.g();
                    return;
                    if (paramInt != 12)
                      break label808;
                  }
                  while (q.this.l() == null);
                  q.a(q.this, null);
                  return;
                  if (paramInt == 11)
                  {
                    localObject1 = new Bundle();
                    ((Bundle)localObject1).putBoolean("onlySelect", true);
                    ((Bundle)localObject1).putInt("dialogsType", 1);
                    ((Bundle)localObject1).putBoolean("invisibleTab", false);
                    localObject1 = new v((Bundle)localObject1);
                    ((v)localObject1).a(q.this);
                    q.this.a((org.vidogram.ui.a.g)localObject1);
                    q.c(true);
                    return;
                  }
                  if (paramInt == 9707)
                  {
                    localObject1 = new Bundle();
                    ((Bundle)localObject1).putBoolean("onlySelect", true);
                    ((Bundle)localObject1).putInt("dialogsType", 1);
                    ((Bundle)localObject1).putBoolean("invisibleTab", false);
                    localObject1 = new v((Bundle)localObject1);
                    ((v)localObject1).a(q.this);
                    q.this.a((org.vidogram.ui.a.g)localObject1);
                    q.c(false);
                    return;
                  }
                  if (paramInt == 9708)
                  {
                    if (q.n(q.this).booleanValue())
                    {
                      localObject1 = new itman.robert.groupchatwebrtc.a(q.this.l(), org.vidogram.messenger.ad.d().e + "_" + org.vidogram.messenger.ad.d().f, org.vidogram.messenger.ad.c() + "", "Vidogram", ApplicationLoader.l().m());
                      ((itman.robert.groupchatwebrtc.a)localObject1).a(((itman.robert.groupchatwebrtc.a)localObject1).a(q.o(q.this) + ""));
                      q.b(q.this, paramInt);
                      return;
                    }
                    q.p(q.this);
                    return;
                  }
                  if (paramInt == 9709)
                  {
                    if (q.n(q.this).booleanValue())
                    {
                      localObject1 = new itman.robert.groupchatwebrtc.a(q.this.l(), org.vidogram.messenger.ad.d().e + "_" + org.vidogram.messenger.ad.d().f, org.vidogram.messenger.ad.c() + "", "Vidogram", ApplicationLoader.l().m());
                      ((itman.robert.groupchatwebrtc.a)localObject1).b(((itman.robert.groupchatwebrtc.a)localObject1).a(q.o(q.this) + ""));
                      q.b(q.this, paramInt);
                      return;
                    }
                    q.p(q.this);
                    return;
                  }
                  if (paramInt != 13)
                    break label1306;
                }
                while (q.this.l() == null);
                q.this.b(org.vidogram.messenger.a.a(q.this.l(), q.this.k).create());
                return;
                if ((paramInt != 15) && (paramInt != 16))
                  break label1512;
              }
              while (q.this.l() == null);
              boolean bool;
              if (((int)q.o(q.this) < 0) && ((int)(q.o(q.this) >> 32) != 1))
              {
                bool = true;
                localObject1 = new AlertDialog.Builder(q.this.l());
                ((AlertDialog.Builder)localObject1).setTitle(org.vidogram.messenger.r.a("AppName", 2131230856));
                if (paramInt != 15)
                  break label1471;
                ((AlertDialog.Builder)localObject1).setMessage(org.vidogram.messenger.r.a("AreYouSureClearHistory", 2131230872));
              }
              while (true)
              {
                ((AlertDialog.Builder)localObject1).setPositiveButton(org.vidogram.messenger.r.a("OK", 2131231604), new DialogInterface.OnClickListener(paramInt, bool)
                {
                  public void onClick(DialogInterface paramDialogInterface, int paramInt)
                  {
                    if (this.a != 15)
                    {
                      if (this.b)
                        if (org.vidogram.messenger.e.c(q.this.i))
                          org.vidogram.messenger.v.a().a(q.o(q.this), 0);
                      while (true)
                      {
                        q.this.d();
                        return;
                        org.vidogram.messenger.v.a().a((int)(-q.o(q.this)), org.vidogram.messenger.v.a().a(Integer.valueOf(org.vidogram.messenger.ad.c())), null);
                        continue;
                        org.vidogram.messenger.v.a().a(q.o(q.this), 0);
                      }
                    }
                    org.vidogram.messenger.v.a().a(q.o(q.this), 1);
                  }
                });
                ((AlertDialog.Builder)localObject1).setNegativeButton(org.vidogram.messenger.r.a("Cancel", 2131230943), null);
                q.this.b(((AlertDialog.Builder)localObject1).create());
                return;
                bool = false;
                break;
                if (bool)
                {
                  ((AlertDialog.Builder)localObject1).setMessage(org.vidogram.messenger.r.a("AreYouSureDeleteAndExit", 2131230875));
                  continue;
                }
                ((AlertDialog.Builder)localObject1).setMessage(org.vidogram.messenger.r.a("AreYouSureDeleteThisChat", 2131230879));
              }
              if (paramInt != 17)
                break label1636;
            }
            while ((q.this.j == null) || (q.this.l() == null));
            if ((q.this.j.i != null) && (q.this.j.i.length() != 0))
            {
              localObject1 = new Bundle();
              ((Bundle)localObject1).putInt("user_id", q.this.j.d);
              ((Bundle)localObject1).putBoolean("addContact", true);
              q.this.a(new r((Bundle)localObject1));
              return;
            }
            q.this.a(q.q(q.this));
            return;
            if (paramInt == 18)
            {
              q.b(q.this, false);
              return;
            }
            if (paramInt == 21)
            {
              q.this.b(org.vidogram.ui.Components.a.a(q.this.l(), q.o(q.this), q.this));
              return;
            }
            if (paramInt == 19)
            {
              localObject1 = null;
              paramInt = 1;
              while (paramInt >= 0)
              {
                localObject2 = localObject1;
                if (localObject1 == null)
                {
                  localObject2 = localObject1;
                  if (q.f(q.this)[paramInt].size() == 1)
                  {
                    localObject1 = new ArrayList(q.f(q.this)[paramInt].keySet());
                    localObject2 = (u)q.r(q.this)[paramInt].get(((ArrayList)localObject1).get(0));
                  }
                }
                q.f(q.this)[paramInt].clear();
                q.g(q.this)[paramInt].clear();
                paramInt -= 1;
                localObject1 = localObject2;
              }
              if ((localObject1 != null) && ((((u)localObject1).a.b > 0) || ((((u)localObject1).a.b < 0) && (q.this.k != null))))
                q.this.a(true, (u)localObject1, null, null, false, true);
              q.a(q.this, 0);
              q.s(q.this).d();
              q.a(q.this, true);
              q.i(q.this);
              return;
            }
            if (paramInt != 14)
              break label1981;
          }
          while (q.this.l() == null);
          q.t(q.this);
          q.u(q.this).l();
          if ((Build.VERSION.SDK_INT == 21) || (Build.VERSION.SDK_INT == 22))
            q.this.l.n();
          q.u(q.this).m();
          q.this.b(q.u(q.this));
          return;
          if (paramInt == 30)
          {
            org.vidogram.messenger.ac.a().a("/help", q.o(q.this), null, null, false, null, null, null);
            return;
          }
          if (paramInt != 31)
            continue;
          org.vidogram.messenger.ac.a().a("/settings", q.o(q.this), null, null, false, null, null, null);
          return;
        }
        while (paramInt != 40);
        label1306: label1636: q.a(q.this, null);
        label1981:
      }
    });
    boolean bool1;
    if (this.k != null)
      bool1 = true;
    while (true)
    {
      this.M = new org.vidogram.ui.Components.g(paramContext, this, bool1);
      label207: Object localObject1;
      label569: Object localObject2;
      label787: Object localObject3;
      if (this.cq)
      {
        this.d.addView(this.M, 0, org.vidogram.ui.Components.v.a(-2, -1.0F, 51, 56.0F, 0.0F, 120.0F, 0.0F));
        if ((this.i != null) && (!org.vidogram.messenger.e.d(this.i)))
        {
          i1 = this.i.k;
          if (this.n != null)
            i1 = this.n.t.e.size();
          if ((i1 == 0) || (this.i.g) || (this.i.t) || ((this.i instanceof g.fg)) || ((this.n != null) && ((this.n.t instanceof g.fp))))
            this.M.setEnabled(false);
        }
        localObject1 = this.d.a();
        if ((this.k == null) && (!this.bs))
        {
          this.z = ((org.vidogram.ui.a.c)localObject1).b(0, 2130837806).d(true).a(new d.b()
          {
            public void a()
            {
              if (!q.A(q.this))
                return;
              org.vidogram.messenger.a.a(new Runnable()
              {
                public void run()
                {
                  q.y(q.this).getSearchField().requestFocus();
                  org.vidogram.messenger.a.a(q.y(q.this).getSearchField());
                }
              }
              , 300L);
            }

            public void b(EditText paramEditText)
            {
              q.a(q.this, 0, 0, 0);
              org.vidogram.messenger.d.d.a(paramEditText.getText().toString(), q.o(q.this), q.B(q.this), q.C(q.this), 0);
            }

            public void c()
            {
              q.v(q.this).setVisibility(0);
              if (q.this.l.i())
              {
                if (q.w(q.this) != null)
                  q.w(q.this).setVisibility(8);
                if (q.x(q.this) != null)
                  q.x(q.this).setVisibility(0);
              }
              while (true)
              {
                q.y(q.this).setVisibility(8);
                q.c(q.this, 2147483647);
                q.i(q.this);
                q.c(q.this, false);
                q.z(q.this);
                return;
                if (q.w(q.this) != null)
                  q.w(q.this).setVisibility(0);
                if (q.x(q.this) == null)
                  continue;
                q.x(q.this).setVisibility(8);
              }
            }
          });
          this.z.getSearchField().setHint(org.vidogram.messenger.r.a("Search", 2131231766));
          this.z.setVisibility(8);
        }
        if (!this.cq)
          break label5519;
        if (new itman.robert.groupchatwebrtc.a(l(), org.vidogram.messenger.ad.d().e + " " + org.vidogram.messenger.ad.d().f, org.vidogram.messenger.ad.c() + "", "Vidogram", ApplicationLoader.l().m()).a(this.bq + "") != null)
          this.cm = Boolean.valueOf(true);
        ((org.vidogram.ui.a.c)localObject1).b(9708, 2130837914, org.vidogram.messenger.a.a(40.0F));
        ((org.vidogram.ui.a.c)localObject1).b(9709, 2130837818, org.vidogram.messenger.a.a(40.0F));
        this.y = ((org.vidogram.ui.a.c)localObject1).b(0, 2130837803, org.vidogram.messenger.a.a(40.0F));
        if (this.z != null)
          this.y.a(40, org.vidogram.messenger.r.a("Search", 2131231766), 0);
        if ((org.vidogram.messenger.e.d(this.i)) && (!this.i.c) && ((!this.i.r) || ((this.i.v != null) && (this.i.v.length() > 0))))
          this.y.a(21, org.vidogram.messenger.r.a("ReportChat", 2131231719), 0);
        if (this.j != null)
          this.D = this.y.a(17, "", 0);
        if (this.k != null)
          this.v = this.y.a(13, org.vidogram.messenger.r.a("SetTimer", 2131231829), 0);
        if (!org.vidogram.messenger.e.d(this.i))
        {
          this.y.a(15, org.vidogram.messenger.r.a("ClearHistory", 2131231066), 0);
          if ((this.i == null) || (this.bs))
            break label5535;
          this.y.a(16, org.vidogram.messenger.r.a("DeleteAndExit", 2131231123), 0);
        }
        if ((this.j == null) || (!this.j.n))
          this.X = this.y.a(18, null, 0);
        if ((this.j != null) && (this.k == null) && (this.j.r))
        {
          this.y.a(31, org.vidogram.messenger.r.a("BotSettings", 2131230929), 0);
          this.y.a(30, org.vidogram.messenger.r.a("BotHelp", 2131230924), 0);
          P();
        }
        O();
        this.M.e();
        this.M.c();
        Q();
        this.x = ((org.vidogram.ui.a.c)localObject1).b(14, 2130837803).c(true).e(false);
        this.x.setVisibility(8);
        this.w = ((org.vidogram.ui.a.c)localObject1).b(14, 2130837792).e(false);
        this.w.setBackgroundDrawable(null);
        this.L.clear();
        localObject1 = this.d.b();
        this.O = new org.vidogram.ui.Components.ac(((org.vidogram.ui.a.c)localObject1).getContext());
        this.O.setTextSize(18);
        this.O.setTypeface(org.vidogram.messenger.a.a("fonts/rmedium.ttf"));
        this.O.setTextColor(-9211021);
        ((org.vidogram.ui.a.c)localObject1).addView(this.O, org.vidogram.ui.Components.v.a(0, -1, 1.0F, 65, 0, 0, 0));
        this.O.setOnTouchListener(new View.OnTouchListener()
        {
          public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
          {
            return true;
          }
        });
        this.P = new FrameLayout(paramContext)
        {
          protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
          {
            paramInt2 = paramInt4 - paramInt2;
            float f;
            if (q.E(q.this).getVisibility() != 8)
            {
              paramInt1 = (paramInt2 / 2 - q.D(q.this).getTextHeight()) / 2;
              if ((!org.vidogram.messenger.a.c()) && (getResources().getConfiguration().orientation == 2))
                f = 2.0F;
            }
            for (paramInt1 = org.vidogram.messenger.a.a(f) + paramInt1; ; paramInt1 = (paramInt2 - q.D(q.this).getTextHeight()) / 2)
            {
              q.D(q.this).layout(0, paramInt1, q.D(q.this).getMeasuredWidth(), q.D(q.this).getTextHeight() + paramInt1);
              if (q.E(q.this).getVisibility() != 8)
              {
                paramInt1 = paramInt2 / 2;
                paramInt2 = (paramInt2 / 2 - q.E(q.this).getTextHeight()) / 2;
                if ((!org.vidogram.messenger.a.c()) && (getResources().getConfiguration().orientation == 2));
                paramInt1 = paramInt1 + paramInt2 - org.vidogram.messenger.a.a(1.0F);
                q.E(q.this).layout(0, paramInt1, q.E(q.this).getMeasuredWidth(), q.E(q.this).getTextHeight() + paramInt1);
              }
              return;
              f = 3.0F;
              break;
            }
          }

          protected void onMeasure(int paramInt1, int paramInt2)
          {
            int i = View.MeasureSpec.getSize(paramInt1);
            setMeasuredDimension(i, View.MeasureSpec.getSize(paramInt2));
            org.vidogram.ui.a.k localk = q.D(q.this);
            if ((!org.vidogram.messenger.a.c()) && (getResources().getConfiguration().orientation == 2))
            {
              paramInt1 = 18;
              localk.setTextSize(paramInt1);
              q.D(q.this).measure(View.MeasureSpec.makeMeasureSpec(i, -2147483648), View.MeasureSpec.makeMeasureSpec(org.vidogram.messenger.a.a(24.0F), -2147483648));
              if (q.E(q.this).getVisibility() != 8)
              {
                localk = q.E(q.this);
                if ((org.vidogram.messenger.a.c()) || (getResources().getConfiguration().orientation != 2))
                  break label164;
              }
            }
            label164: for (paramInt1 = 14; ; paramInt1 = 16)
            {
              localk.setTextSize(paramInt1);
              q.E(q.this).measure(View.MeasureSpec.makeMeasureSpec(i, -2147483648), View.MeasureSpec.makeMeasureSpec(org.vidogram.messenger.a.a(20.0F), -2147483648));
              return;
              paramInt1 = 20;
              break;
            }
          }
        };
        ((org.vidogram.ui.a.c)localObject1).addView(this.P, org.vidogram.ui.Components.v.a(0, -1, 1.0F, 65, 0, 0, 0));
        this.P.setOnTouchListener(new View.OnTouchListener()
        {
          public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
          {
            return true;
          }
        });
        this.P.setVisibility(8);
        this.Q = new org.vidogram.ui.a.k(paramContext);
        this.Q.setTextSize(18);
        this.Q.setTypeface(org.vidogram.messenger.a.a("fonts/rmedium.ttf"));
        this.Q.setTextColor(-9211021);
        this.Q.setText(org.vidogram.messenger.r.a("Edit", 2131231149));
        this.P.addView(this.Q, org.vidogram.ui.Components.v.a(-1, -1.0F));
        this.R = new org.vidogram.ui.a.k(paramContext);
        this.R.setGravity(3);
        this.R.setTextColor(-9211021);
        this.P.addView(this.R, org.vidogram.ui.Components.v.a(-1, -1.0F));
        if (this.k != null)
          break label5558;
        if (!this.bs)
          this.L.add(((org.vidogram.ui.a.c)localObject1).a(19, 2130837804, -986896, null, org.vidogram.messenger.a.a(54.0F)));
        this.L.add(((org.vidogram.ui.a.c)localObject1).a(10, 2130837798, -986896, null, org.vidogram.messenger.a.a(54.0F)));
        this.L.add(((org.vidogram.ui.a.c)localObject1).a(11, 2130837800, -986896, null, org.vidogram.messenger.a.a(54.0F)));
        this.L.add(((org.vidogram.ui.a.c)localObject1).a(9707, 2130837801, -986896, null, org.vidogram.messenger.a.a(54.0F)));
        this.L.add(((org.vidogram.ui.a.c)localObject1).a(12, 2130837799, -986896, null, org.vidogram.messenger.a.a(54.0F)));
        localObject2 = this.L;
        localObject3 = ((org.vidogram.ui.a.c)localObject1).a(20, 2130837682, -986896, null, org.vidogram.messenger.a.a(54.0F));
        this.A = ((org.vidogram.ui.a.d)localObject3);
        ((ArrayList)localObject2).add(localObject3);
        this.A.setVisibility(8);
        this.B = new o(paramContext, 0);
        this.A.addView(this.B, org.vidogram.ui.Components.v.a(-1, -1.0F));
        this.B.setVisibility(4);
        label1493: localObject2 = ((org.vidogram.ui.a.c)localObject1).b(10);
        if (this.bu[0].size() + this.bu[1].size() == 0)
          break label5645;
        i1 = 0;
        label1526: ((org.vidogram.ui.a.d)localObject2).setVisibility(i1);
        localObject1 = ((org.vidogram.ui.a.c)localObject1).b(12);
        if (this.bv != 0)
          break label5651;
        i1 = 0;
        label1550: ((org.vidogram.ui.a.d)localObject1).setVisibility(i1);
        M();
        this.b = new bg(paramContext)
        {
          int a = 0;

          protected boolean drawChild(Canvas paramCanvas, View paramView, long paramLong)
          {
            boolean bool = super.drawChild(paramCanvas, paramView, paramLong);
            if (paramView == q.F(q.this))
              q.H(q.this).a(paramCanvas, q.G(q.this).getMeasuredHeight());
            return bool;
          }

          protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
          {
            int i1 = getChildCount();
            int m;
            if ((getKeyboardHeight() <= org.vidogram.messenger.a.a(20.0F)) && (!org.vidogram.messenger.a.i))
              m = q.this.l.getEmojiPadding();
            while (true)
            {
              setBottomClip(m);
              int n = 0;
              View localView;
              while (true)
              {
                if (n >= i1)
                  break label648;
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
                label171: switch (i & 0x70)
                {
                default:
                  j = localLayoutParams.topMargin;
                  label219: if (localView == q.O(q.this))
                    i = j - (q.this.l.getMeasuredHeight() - org.vidogram.messenger.a.a(2.0F));
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
                break label171;
                k = paramInt3 - i2 - localLayoutParams.rightMargin;
                break label171;
                i = localLayoutParams.topMargin + getPaddingTop();
                j = i;
                if (localView == q.R(q.this))
                  break label219;
                j = i + q.S(q.this).getMeasuredHeight();
                break label219;
                j = (paramInt4 - m - paramInt2 - i3) / 2 + localLayoutParams.topMargin - localLayoutParams.bottomMargin;
                break label219;
                j = paramInt4 - m - paramInt2 - i3 - localLayoutParams.bottomMargin;
                break label219;
                if (localView == q.T(q.this))
                {
                  i = j - q.this.l.getMeasuredHeight();
                  continue;
                }
                if (localView == q.N(q.this))
                {
                  i = j - (this.a / 2 - q.U(q.this).getMeasuredHeight() / 2);
                  continue;
                }
                if (q.this.l.b(localView))
                {
                  if (org.vidogram.messenger.a.i)
                  {
                    i = q.this.l.getTop() - localView.getMeasuredHeight() + org.vidogram.messenger.a.a(1.0F);
                    continue;
                  }
                  i = q.this.l.getBottom();
                  continue;
                }
                if (localView == q.V(q.this))
                {
                  i = j - this.a;
                  continue;
                }
                if ((localView == q.L(q.this)) || (localView == q.M(q.this)))
                {
                  i = j;
                  if (!q.this.l.b())
                    continue;
                  i = j - org.vidogram.messenger.a.a(48.0F);
                  continue;
                }
                i = j;
                if (localView != q.W(q.this))
                  continue;
                i = j - getPaddingTop();
              }
            }
            label648: q.X(q.this);
            a();
          }

          protected void onMeasure(int paramInt1, int paramInt2)
          {
            int i3 = View.MeasureSpec.getSize(paramInt1);
            int i = View.MeasureSpec.getSize(paramInt2);
            setMeasuredDimension(i3, i);
            int j = getPaddingTop();
            measureChildWithMargins(q.I(q.this), paramInt1, 0, paramInt2, 0);
            int i4 = q.J(q.this).getMeasuredHeight();
            i = i - j - i4;
            if ((getKeyboardHeight() <= org.vidogram.messenger.a.a(20.0F)) && (!org.vidogram.messenger.a.i))
              i -= q.this.l.getEmojiPadding();
            while (true)
            {
              int i5 = getChildCount();
              measureChildWithMargins(q.this.l, paramInt1, 0, paramInt2, 0);
              this.a = q.this.l.getMeasuredHeight();
              j = 0;
              if (j < i5)
              {
                View localView = getChildAt(j);
                if ((localView == null) || (localView.getVisibility() == 8) || (localView == q.this.l) || (localView == q.K(q.this)));
                while (true)
                {
                  j += 1;
                  break;
                  int i1;
                  int i2;
                  int k;
                  if ((localView == q.L(q.this)) || (localView == q.M(q.this)))
                  {
                    i1 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
                    i2 = org.vidogram.messenger.a.a(10.0F);
                    int i6 = this.a;
                    if (q.this.l.b());
                    for (k = 48; ; k = 0)
                    {
                      localView.measure(i1, View.MeasureSpec.makeMeasureSpec(Math.max(i2, org.vidogram.messenger.a.a(k + 2) + (i - i6)), 1073741824));
                      break;
                    }
                  }
                  if (localView == q.N(q.this))
                  {
                    localView.measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(i, 1073741824));
                    continue;
                  }
                  if (q.this.l.b(localView))
                  {
                    if (org.vidogram.messenger.a.i)
                    {
                      if (org.vidogram.messenger.a.c())
                      {
                        localView.measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(org.vidogram.messenger.a.a(320.0F), i - this.a + i4 - org.vidogram.messenger.a.a + getPaddingTop()), 1073741824));
                        continue;
                      }
                      localView.measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(i - this.a + i4 - org.vidogram.messenger.a.a + getPaddingTop(), 1073741824));
                      continue;
                    }
                    localView.measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(localView.getLayoutParams().height, 1073741824));
                    continue;
                  }
                  if (localView == q.O(q.this))
                  {
                    FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)q.O(q.this).getLayoutParams();
                    q.d(q.this, true);
                    if ((q.P(q.this).r()) && (q.P(q.this).s()))
                    {
                      i1 = q.Q(q.this).n(i3) * 102;
                      k = i1;
                      if (q.P(q.this).r())
                      {
                        k = i1;
                        if (q.P(q.this).g() != null)
                          k = i1 + 34;
                      }
                      i2 = q.this.l.getMeasuredHeight();
                      if (k != 0);
                      for (i1 = org.vidogram.messenger.a.a(2.0F); ; i1 = 0)
                      {
                        i1 += i - i2;
                        q.b(q.this).setPadding(0, Math.max(0, i1 - org.vidogram.messenger.a.a(Math.min(k, 122.39999F))), 0, 0);
                        k = i1;
                        localLayoutParams.height = k;
                        localLayoutParams.topMargin = 0;
                        q.d(q.this, false);
                        localView.measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(localLayoutParams.height, 1073741824));
                        break;
                      }
                    }
                    i2 = q.P(q.this).a();
                    i1 = 0;
                    int m;
                    if (q.P(q.this).r())
                    {
                      k = i2;
                      if (q.P(q.this).g() != null)
                      {
                        i1 = 36;
                        m = i2 - 1;
                      }
                      m = i1 + m * 68;
                      label771: i2 = q.this.l.getMeasuredHeight();
                      if (m == 0)
                        break label854;
                    }
                    label854: for (i1 = org.vidogram.messenger.a.a(2.0F); ; i1 = 0)
                    {
                      i1 += i - i2;
                      q.b(q.this).setPadding(0, Math.max(0, i1 - org.vidogram.messenger.a.a(Math.min(m, 122.39999F))), 0, 0);
                      m = i1;
                      break;
                      int n = 0 + i2 * 36;
                      break label771;
                    }
                  }
                  measureChildWithMargins(localView, paramInt1, 0, paramInt2, 0);
                }
              }
              return;
            }
          }
        };
        localObject2 = (bg)this.b;
        ((bg)localObject2).setBackgroundImage(ApplicationLoader.g());
        this.J = new FrameLayout(paramContext);
        this.J.setVisibility(4);
        ((bg)localObject2).addView(this.J, org.vidogram.ui.Components.v.b(-1, -2, 17));
        this.J.setOnTouchListener(new View.OnTouchListener()
        {
          public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
          {
            return true;
          }
        });
        if (this.k != null)
          break label5866;
        if ((this.j == null) || (!this.j.n))
          break label5657;
        this.K = new org.vidogram.ui.Components.h(paramContext, false);
        this.J.addView(this.K, new FrameLayout.LayoutParams(-2, -2, 17));
        if (this.l != null)
          this.l.c();
        if (this.af != null)
          this.af.f();
        this.E = new aw(paramContext)
        {
          protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
          {
            super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
            q.e(q.this, false);
            int j;
            int i;
            if (q.a.a(q.Y(q.this)))
            {
              j = getChildCount();
              i = 0;
            }
            while (true)
            {
              if (i < j)
              {
                View localView = getChildAt(i);
                if (!(localView instanceof org.vidogram.ui.c.f))
                  break label108;
                paramInt2 = (paramInt4 - paramInt2) / 2 - localView.getMeasuredHeight() / 2;
                if (localView.getTop() > paramInt2)
                  localView.layout(0, paramInt2, paramInt3 - paramInt1, localView.getMeasuredHeight() + paramInt2);
              }
              return;
              label108: i += 1;
            }
          }
        };
        this.E.setTag(Integer.valueOf(1));
        this.E.setVerticalScrollBarEnabled(true);
        localObject1 = this.E;
        localObject3 = new a(paramContext);
        this.G = ((a)localObject3);
        ((aw)localObject1).setAdapter((RecyclerView.a)localObject3);
        this.E.setClipToPadding(false);
        this.E.setPadding(0, org.vidogram.messenger.a.a(4.0F), 0, org.vidogram.messenger.a.a(3.0F));
        this.E.setItemAnimator(null);
        this.E.setLayoutAnimation(null);
        this.F = new LinearLayoutManager(paramContext)
        {
          public boolean c()
          {
            return false;
          }
        };
        this.F.b(1);
        this.F.a(true);
        this.E.setLayoutManager(this.F);
        ((bg)localObject2).addView(this.E, org.vidogram.ui.Components.v.a(-1, -1.0F));
        this.E.setOnItemLongClickListener(this.o);
        this.E.setOnItemClickListener(this.p);
        this.E.setOnScrollListener(new RecyclerView.l()
        {
          private float b = 0.0F;
          private final int c = org.vidogram.messenger.a.a(100.0F);

          public void a(RecyclerView paramRecyclerView, int paramInt)
          {
            if ((paramInt == 1) && (q.Z(q.this) != 2147483647))
            {
              q.c(q.this, 2147483647);
              q.i(q.this);
            }
          }

          public void a(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
          {
            q.f(q.this, true);
            int i = q.aa(q.this).m();
            if (i == -1)
            {
              paramInt1 = 0;
              if (paramInt1 > 0)
              {
                if ((paramInt1 + i != q.Y(q.this).a()) || (q.ab(q.this)[0] == 0))
                  break label100;
                q.a(q.this, false, true);
              }
            }
            while (true)
            {
              q.X(q.this);
              return;
              paramInt1 = Math.abs(q.aa(q.this).n() - i) + 1;
              break;
              label100: if (paramInt2 > 0)
              {
                if (q.T(q.this).getTag() != null)
                  continue;
                this.b += paramInt2;
                if (this.b <= this.c)
                  continue;
                this.b = 0.0F;
                q.a(q.this, true, true);
                q.g(q.this, true);
                continue;
              }
              if ((!q.ac(q.this)) || (q.T(q.this).getTag() == null))
                continue;
              this.b += paramInt2;
              if (this.b >= -this.c)
                continue;
              q.a(q.this, false, true);
              this.b = 0.0F;
            }
          }
        });
        this.E.setOnTouchListener(new View.OnTouchListener()
        {
          public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
          {
            int i = 1;
            if ((q.ad(q.this) != null) || (at.a().b()))
            {
              if ((paramMotionEvent.getAction() != 1) && (paramMotionEvent.getAction() != 3) && (paramMotionEvent.getAction() != 6))
                break label150;
              org.vidogram.messenger.a.a(new Runnable()
              {
                public void run()
                {
                  q.L(q.this).setOnItemClickListener(q.this.p);
                }
              }
              , 150L);
              if (q.ad(q.this) == null)
                break label121;
              org.vidogram.messenger.a.b(q.ad(q.this));
              q.a(q.this, null);
            }
            label121: 
            do
              do
                do
                  while (true)
                  {
                    try
                    {
                      Toast.makeText(paramView.getContext(), org.vidogram.messenger.r.a("PhotoTip", 2131231673), 0).show();
                      i = 0;
                      return i;
                    }
                    catch (Exception paramView)
                    {
                      org.vidogram.messenger.n.a("tmessages", paramView);
                      continue;
                    }
                    if (!at.a().b())
                      continue;
                    org.vidogram.messenger.a.a(new Runnable()
                    {
                      public void run()
                      {
                        q.L(q.this).setOnItemLongClickListener(q.this.o);
                        q.L(q.this).setLongClickable(true);
                      }
                    });
                    at.a().c();
                  }
                while (paramMotionEvent.getAction() == 0);
              while (at.a().b());
            while (q.ad(q.this) == null);
            label150: if (paramMotionEvent.getAction() == 2)
              if (Math.hypot(q.ae(q.this) - paramMotionEvent.getX(), q.af(q.this) - paramMotionEvent.getY()) > org.vidogram.messenger.a.a(5.0F))
              {
                org.vidogram.messenger.a.b(q.ad(q.this));
                q.a(q.this, null);
              }
            while (true)
            {
              q.L(q.this).setOnItemClickListener(q.this.p);
              q.L(q.this).setOnItemLongClickListener(q.this.o);
              q.L(q.this).setLongClickable(true);
              break;
              org.vidogram.messenger.a.b(q.ad(q.this));
              q.a(q.this, null);
            }
          }
        });
        this.E.setOnInterceptTouchListener(new aw.a()
        {
          public boolean a(MotionEvent paramMotionEvent)
          {
            if ((q.this.l != null) && (q.this.l.j()))
              return true;
            if (q.ag(q.this).f())
              return false;
            int j;
            int k;
            int n;
            if (paramMotionEvent.getAction() == 0)
            {
              j = (int)paramMotionEvent.getX();
              k = (int)paramMotionEvent.getY();
              int m = q.L(q.this).getChildCount();
              int i = 0;
              while (i < m)
              {
                paramMotionEvent = q.L(q.this).getChildAt(i);
                n = paramMotionEvent.getTop();
                int i1 = paramMotionEvent.getBottom();
                if ((n > k) || (i1 < k))
                {
                  i += 1;
                  continue;
                }
                if ((paramMotionEvent instanceof org.vidogram.ui.c.j))
                  break label134;
              }
            }
            label134: u localu;
            do
            {
              return false;
              paramMotionEvent = (org.vidogram.ui.c.j)paramMotionEvent;
              localu = paramMotionEvent.getMessageObject();
            }
            while ((localu == null) || (localu.v()) || (!localu.r()) || (!paramMotionEvent.getPhotoImage().a(j, k - n)) || (!org.vidogram.messenger.m.b(localu.a).exists()));
            q.a(q.this, j);
            q.b(q.this, k);
            q.L(q.this).setOnItemClickListener(null);
            q.a(q.this, new Runnable(localu, paramMotionEvent)
            {
              public void run()
              {
                if (q.ad(q.this) == null)
                  return;
                q.L(q.this).requestDisallowInterceptTouchEvent(true);
                q.L(q.this).setOnItemLongClickListener(null);
                q.L(q.this).setLongClickable(false);
                q.a(q.this, null);
                if (q.b(q.this, this.a))
                  this.b.invalidate();
                at.a().a(q.this.l());
                at.a().a(this.a);
              }
            });
            org.vidogram.messenger.a.a(q.ad(q.this), 100L);
            return true;
          }
        });
        this.t = new FrameLayout(paramContext);
        this.t.setVisibility(4);
        ((bg)localObject2).addView(this.t, org.vidogram.ui.Components.v.b(-1, -1, 51));
        localObject1 = new View(paramContext);
        ((View)localObject1).setBackgroundResource(2130838164);
        ((View)localObject1).getBackground().setColorFilter(org.vidogram.ui.a.l.P);
        this.t.addView((View)localObject1, org.vidogram.ui.Components.v.b(36, 36, 17));
        localObject1 = new ProgressBar(paramContext);
      }
      try
      {
        ((ProgressBar)localObject1).setIndeterminateDrawable(paramContext.getResources().getDrawable(2130837951));
        label2069: ((ProgressBar)localObject1).setIndeterminate(true);
        org.vidogram.messenger.a.a((ProgressBar)localObject1, 1500);
        this.t.addView((View)localObject1, org.vidogram.ui.Components.v.b(32, 32, 17));
        if (org.vidogram.messenger.e.d(this.i))
        {
          this.au = new FrameLayout(paramContext);
          this.au.setTag(Integer.valueOf(1));
          this.au.setTranslationY(-org.vidogram.messenger.a.a(50.0F));
          this.au.setVisibility(8);
          this.au.setBackgroundResource(2130837634);
          ((bg)localObject2).addView(this.au, org.vidogram.ui.Components.v.b(-1, 50, 51));
          this.au.setOnClickListener(new View.OnClickListener()
          {
            public void onClick(View paramView)
            {
              q.a(q.this, q.this.n.s, 0, true, 0);
            }
          });
          localObject1 = new View(paramContext);
          ((View)localObject1).setBackgroundColor(-9658414);
          this.au.addView((View)localObject1, org.vidogram.ui.Components.v.a(2, 32.0F, 51, 8.0F, 8.0F, 0.0F, 0.0F));
          this.aw = new BackupImageView(paramContext);
          this.au.addView(this.aw, org.vidogram.ui.Components.v.a(32, 32.0F, 51, 17.0F, 8.0F, 0.0F, 0.0F));
          this.ax = new org.vidogram.ui.a.k(paramContext);
          this.ax.setTextSize(14);
          this.ax.setTextColor(-12940081);
          this.ax.setTypeface(org.vidogram.messenger.a.a("fonts/rmedium.ttf"));
          this.au.addView(this.ax, org.vidogram.ui.Components.v.a(-1, org.vidogram.messenger.a.a(18.0F), 51, 18.0F, 7.3F, 52.0F, 0.0F));
          this.ay = new org.vidogram.ui.a.k(paramContext);
          this.ay.setTextSize(14);
          this.ay.setTextColor(-6710887);
          this.au.addView(this.ay, org.vidogram.ui.Components.v.a(-1, org.vidogram.messenger.a.a(18.0F), 51, 18.0F, 25.299999F, 52.0F, 0.0F));
          localObject1 = new ImageView(paramContext);
          ((ImageView)localObject1).setImageResource(2130837979);
          ((ImageView)localObject1).setScaleType(ImageView.ScaleType.CENTER);
          this.au.addView((View)localObject1, org.vidogram.ui.Components.v.b(48, 48, 53));
          ((ImageView)localObject1).setOnClickListener(new View.OnClickListener()
          {
            public void onClick(View paramView)
            {
              if (q.this.l() == null)
                return;
              if ((q.this.i.c) || (q.this.i.n))
              {
                paramView = new AlertDialog.Builder(q.this.l());
                paramView.setMessage(org.vidogram.messenger.r.a("UnpinMessageAlert", 2131231917));
                paramView.setPositiveButton(org.vidogram.messenger.r.a("OK", 2131231604), new DialogInterface.OnClickListener()
                {
                  public void onClick(DialogInterface paramDialogInterface, int paramInt)
                  {
                    org.vidogram.messenger.v.a().a(q.this.i, 0, false);
                  }
                });
                paramView.setTitle(org.vidogram.messenger.r.a("AppName", 2131230856));
                paramView.setNegativeButton(org.vidogram.messenger.r.a("Cancel", 2131230943), null);
                q.this.b(paramView.create());
                return;
              }
              ApplicationLoader.a.getSharedPreferences("Notifications", 0).edit().putInt("pin_" + q.o(q.this), q.this.n.s).commit();
              q.a(q.this, true);
            }
          });
        }
        this.am = new LinearLayout(paramContext);
        this.am.setTag(Integer.valueOf(1));
        this.am.setTranslationY(-org.vidogram.messenger.a.a(50.0F));
        this.am.setVisibility(8);
        this.am.setBackgroundResource(2130837634);
        ((bg)localObject2).addView(this.am, org.vidogram.ui.Components.v.b(-1, 50, 51));
        this.ao = new TextView(paramContext);
        this.ao.setTextColor(-11894091);
        this.ao.setVisibility(8);
        this.ao.setTextSize(1, 14.0F);
        this.ao.setTypeface(org.vidogram.messenger.a.a("fonts/rmedium.ttf"));
        this.ao.setSingleLine(true);
        this.ao.setMaxLines(1);
        this.ao.setPadding(org.vidogram.messenger.a.a(4.0F), 0, org.vidogram.messenger.a.a(4.0F), 0);
        this.ao.setGravity(17);
        this.ao.setText(org.vidogram.messenger.r.a("AddContactChat", 2131230814));
        this.am.addView(this.ao, org.vidogram.ui.Components.v.a(-1, -1, 0.5F, 51, 0, 0, 0, org.vidogram.messenger.a.a(1.0F)));
        this.ao.setOnClickListener(new View.OnClickListener()
        {
          public void onClick(View paramView)
          {
            paramView = new Bundle();
            paramView.putInt("user_id", q.this.j.d);
            paramView.putBoolean("addContact", true);
            q.this.a(new r(paramView));
          }
        });
        this.aq = new FrameLayout(paramContext);
        this.am.addView(this.aq, org.vidogram.ui.Components.v.a(-1, -1, 1.0F, 51, 0, 0, 0, org.vidogram.messenger.a.a(1.0F)));
        this.ap = new TextView(paramContext);
        this.ap.setTextColor(-3188393);
        this.ap.setTextSize(1, 14.0F);
        this.ap.setTypeface(org.vidogram.messenger.a.a("fonts/rmedium.ttf"));
        this.ap.setSingleLine(true);
        this.ap.setMaxLines(1);
        label2842: label3573: boolean bool2;
        if (this.i != null)
        {
          this.ap.setText(org.vidogram.messenger.r.a("ReportSpamAndLeave", 2131231729));
          this.ap.setGravity(17);
          this.ap.setPadding(org.vidogram.messenger.a.a(50.0F), 0, org.vidogram.messenger.a.a(50.0F), 0);
          this.aq.addView(this.ap, org.vidogram.ui.Components.v.b(-1, -1, 51));
          this.ap.setOnClickListener(new View.OnClickListener()
          {
            public void onClick(View paramView)
            {
              if (q.this.l() == null)
                return;
              paramView = new AlertDialog.Builder(q.this.l());
              if ((org.vidogram.messenger.e.d(q.this.i)) && (!q.this.i.r))
                paramView.setMessage(org.vidogram.messenger.r.a("ReportSpamAlertChannel", 2131231727));
              while (true)
              {
                paramView.setTitle(org.vidogram.messenger.r.a("AppName", 2131230856));
                paramView.setPositiveButton(org.vidogram.messenger.r.a("OK", 2131231604), new DialogInterface.OnClickListener()
                {
                  public void onClick(DialogInterface paramDialogInterface, int paramInt)
                  {
                    if (q.this.j != null)
                      org.vidogram.messenger.v.a().h(q.this.j.d);
                    org.vidogram.messenger.v.a().b(q.o(q.this), q.this.j, q.this.i);
                    q.ah(q.this);
                    if (q.this.i != null)
                      if (org.vidogram.messenger.e.c(q.this.i))
                        org.vidogram.messenger.v.a().a(q.o(q.this), 0);
                    while (true)
                    {
                      q.this.d();
                      return;
                      org.vidogram.messenger.v.a().a((int)(-q.o(q.this)), org.vidogram.messenger.v.a().a(Integer.valueOf(org.vidogram.messenger.ad.c())), null);
                      continue;
                      org.vidogram.messenger.v.a().a(q.o(q.this), 0);
                    }
                  }
                });
                paramView.setNegativeButton(org.vidogram.messenger.r.a("Cancel", 2131230943), null);
                q.this.b(paramView.create());
                return;
                if (q.this.i != null)
                {
                  paramView.setMessage(org.vidogram.messenger.r.a("ReportSpamAlertGroup", 2131231728));
                  continue;
                }
                paramView.setMessage(org.vidogram.messenger.r.a("ReportSpamAlert", 2131231726));
              }
            }
          });
          localObject1 = new ImageView(paramContext);
          ((ImageView)localObject1).setImageResource(2130837979);
          ((ImageView)localObject1).setScaleType(ImageView.ScaleType.CENTER);
          this.aq.addView((View)localObject1, org.vidogram.ui.Components.v.b(48, 48, 53));
          ((ImageView)localObject1).setOnClickListener(new View.OnClickListener()
          {
            public void onClick(View paramView)
            {
              org.vidogram.messenger.v.a().a(q.o(q.this), q.this.j, q.this.i);
              q.ah(q.this);
            }
          });
          this.az = new FrameLayout(paramContext);
          this.az.setTag(Integer.valueOf(1));
          this.az.setTranslationY(-org.vidogram.messenger.a.a(50.0F));
          this.az.setVisibility(8);
          this.az.setBackgroundResource(2130837634);
          ((bg)localObject2).addView(this.az, org.vidogram.ui.Components.v.b(-1, 50, 51));
          this.aA = new TextView(paramContext);
          this.aA.setTextSize(1, 14.0F);
          this.aA.setTextColor(-12940081);
          this.aA.setTypeface(org.vidogram.messenger.a.a("fonts/rmedium.ttf"));
          this.aA.setSingleLine(true);
          this.aA.setEllipsize(TextUtils.TruncateAt.END);
          this.aA.setMaxLines(1);
          this.az.addView(this.aA, org.vidogram.ui.Components.v.a(-2, -2.0F, 51, 8.0F, 5.0F, 8.0F, 0.0F));
          this.aB = new TextView(paramContext);
          this.aB.setTextSize(1, 14.0F);
          this.aB.setTextColor(-6710887);
          this.aB.setSingleLine(true);
          this.aB.setEllipsize(TextUtils.TruncateAt.END);
          this.aB.setMaxLines(1);
          this.az.addView(this.aB, org.vidogram.ui.Components.v.a(-2, -2.0F, 51, 8.0F, 23.0F, 8.0F, 0.0F));
          if (!this.bs)
          {
            this.ag = new FrameLayout(paramContext)
            {
              private Drawable b;

              public void onDraw(Canvas paramCanvas)
              {
                if (q.b(q.this).getChildCount() <= 0)
                  return;
                if ((q.P(q.this).r()) && (q.P(q.this).s()) && (q.P(q.this).g() == null))
                  this.b.setBounds(0, q.ai(q.this) - org.vidogram.messenger.a.a(4.0F), getMeasuredWidth(), getMeasuredHeight());
                while (true)
                {
                  this.b.draw(paramCanvas);
                  return;
                  this.b.setBounds(0, q.ai(q.this) - org.vidogram.messenger.a.a(2.0F), getMeasuredWidth(), getMeasuredHeight());
                }
              }

              public void requestLayout()
              {
                if (q.aj(q.this))
                  return;
                super.requestLayout();
              }

              public void setBackgroundResource(int paramInt)
              {
                this.b = getContext().getResources().getDrawable(paramInt);
              }
            };
            this.ag.setBackgroundResource(2130837714);
            this.ag.setVisibility(8);
            this.ag.setWillNotDraw(false);
            ((bg)localObject2).addView(this.ag, org.vidogram.ui.Components.v.b(-1, 110, 83));
            this.ah = new aw(paramContext)
            {
              private int l;
              private int m;

              public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
              {
                if ((!q.ak(q.this)) && (q.ai(q.this) != 0) && (paramMotionEvent.getY() < q.ai(q.this)));
                boolean bool;
                do
                {
                  return false;
                  bool = ax.a().a(paramMotionEvent, q.b(q.this), 0);
                }
                while ((!super.onInterceptTouchEvent(paramMotionEvent)) && (!bool));
                return true;
              }

              protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
              {
                int n = paramInt3 - paramInt1;
                int i1 = paramInt4 - paramInt2;
                int j;
                int i;
                if ((q.b(q.this) != null) && (q.al(q.this) >= 0) && (n == this.l) && (i1 - this.m != 0))
                {
                  j = q.al(q.this);
                  i = q.am(q.this) + i1 - this.m - getPaddingTop();
                }
                while (true)
                {
                  super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
                  if (j != -1)
                  {
                    q.d(q.this, true);
                    if ((!q.P(q.this).r()) || (!q.P(q.this).s()))
                      break label188;
                    q.Q(q.this).a(j, i);
                  }
                  while (true)
                  {
                    super.onLayout(false, paramInt1, paramInt2, paramInt3, paramInt4);
                    q.d(q.this, false);
                    this.m = i1;
                    this.l = n;
                    q.ao(q.this);
                    return;
                    label188: q.an(q.this).a(j, i);
                  }
                  i = 0;
                  j = -1;
                }
              }

              public boolean onTouchEvent(MotionEvent paramMotionEvent)
              {
                if ((!q.ak(q.this)) && (q.ai(q.this) != 0) && (paramMotionEvent.getY() < q.ai(q.this)))
                  return false;
                return super.onTouchEvent(paramMotionEvent);
              }

              public void requestLayout()
              {
                if (q.aj(q.this))
                  return;
                super.requestLayout();
              }
            };
            this.ah.setOnTouchListener(new View.OnTouchListener()
            {
              public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
              {
                return ax.a().a(paramMotionEvent, q.b(q.this), 0, q.ap(q.this));
              }
            });
            this.ah.setTag(Integer.valueOf(2));
            this.ai = new LinearLayoutManager(paramContext)
            {
              public boolean c()
              {
                return false;
              }
            };
            this.ai.b(1);
            this.aj = new org.vidogram.ui.Components.r(paramContext, 100)
            {
              private bf u = new bf();

              protected int J()
              {
                if (q.P(q.this).g() != null)
                  return D() - 1;
                return super.J();
              }

              protected bf l(int paramInt)
              {
                float f2 = 100.0F;
                int i = paramInt;
                if (q.P(q.this).g() != null)
                  i = paramInt + 1;
                Object localObject1 = q.P(q.this).g(i);
                Object localObject2;
                float f1;
                if ((localObject1 instanceof g.d))
                {
                  localObject1 = (g.d)localObject1;
                  if (((g.d)localObject1).p == null)
                    break label229;
                  localObject2 = this.u;
                  if (((g.d)localObject1).p.i == null)
                    break label216;
                  f1 = ((g.d)localObject1).p.i.d;
                  ((bf)localObject2).a = f1;
                  localObject2 = this.u;
                  f1 = f2;
                  if (((g.d)localObject1).p.i != null)
                    f1 = ((g.d)localObject1).p.i.e;
                  ((bf)localObject2).b = f1;
                  paramInt = 0;
                  label137: if (paramInt < ((g.d)localObject1).p.o.size())
                  {
                    localObject2 = (g.r)((g.d)localObject1).p.o.get(paramInt);
                    if ((!(localObject2 instanceof g.hz)) && (!(localObject2 instanceof g.ie)))
                      break label222;
                    this.u.a = ((g.r)localObject2).h;
                  }
                }
                for (this.u.b = ((g.r)localObject2).i; ; this.u.b = ((g.d)localObject1).l)
                {
                  return this.u;
                  label216: f1 = 100.0F;
                  break;
                  label222: paramInt += 1;
                  break label137;
                  label229: this.u.a = ((g.d)localObject1).k;
                }
              }
            };
            this.aj.a(new d.c()
            {
              public int a(int paramInt)
              {
                if ((q.P(q.this).g(paramInt) instanceof g.ji))
                  return 100;
                int i = paramInt;
                if (q.P(q.this).g() != null)
                  i = paramInt - 1;
                return q.Q(q.this).m(i);
              }
            });
            this.ah.a(new RecyclerView.g()
            {
              public void a(Rect paramRect, View paramView, RecyclerView paramRecyclerView, RecyclerView.r paramr)
              {
                paramRect.left = 0;
                paramRect.right = 0;
                paramRect.top = 0;
                paramRect.bottom = 0;
                if (paramRecyclerView.getLayoutManager() == q.Q(q.this))
                {
                  i = paramRecyclerView.f(paramView);
                  if (q.P(q.this).g() == null)
                    break label122;
                  if (i != 0);
                }
                else
                {
                  return;
                }
                int j = i - 1;
                int i = j;
                if (!q.Q(q.this).p(j))
                {
                  paramRect.top = org.vidogram.messenger.a.a(2.0F);
                  i = j;
                }
                if (q.Q(q.this).o(i));
                for (i = 0; ; i = org.vidogram.messenger.a.a(2.0F))
                {
                  paramRect.right = i;
                  return;
                  label122: paramRect.top = org.vidogram.messenger.a.a(2.0F);
                  break;
                }
              }
            });
            this.ah.setItemAnimator(null);
            this.ah.setLayoutAnimation(null);
            this.ah.setClipToPadding(false);
            this.ah.setLayoutManager(this.ai);
            this.ah.setOverScrollMode(2);
            this.ag.addView(this.ah, org.vidogram.ui.Components.v.a(-1, -1.0F));
            localObject1 = this.ah;
            localObject3 = new org.vidogram.ui.b.n(paramContext, false, this.bq, new n.b()
            {
              public void a(g.d paramd)
              {
                if ((q.this.l() == null) || (paramd.i == null))
                  return;
                if ((paramd.d.equals("video")) || (paramd.d.equals("web_player_video")))
                {
                  h.d locald = new h.d(q.this.l());
                  Activity localActivity = q.this.l();
                  org.vidogram.ui.a.h localh = locald.a();
                  if (paramd.e != null);
                  for (String str = paramd.e; ; str = "")
                  {
                    locald.a(new bt(localActivity, localh, str, paramd.f, paramd.i, paramd.i, paramd.k, paramd.l));
                    locald.c(true);
                    q.this.b(locald.a());
                    return;
                  }
                }
                org.vidogram.messenger.b.a.a(q.this.l(), paramd.i);
              }

              public void a(boolean paramBoolean)
              {
                if ((q.P(q.this).r()) && (q.P(q.this).s()))
                {
                  q.b(q.this).setLayoutManager(q.Q(q.this));
                  if (!paramBoolean)
                    break label493;
                  if (q.aq(q.this) != null)
                  {
                    q.aq(q.this).cancel();
                    q.a(q.this, null);
                  }
                  if (q.O(q.this).getVisibility() != 0)
                    break label121;
                  q.O(q.this).setAlpha(1.0F);
                }
                label121: 
                do
                {
                  return;
                  q.b(q.this).setLayoutManager(q.an(q.this));
                  break;
                  if ((q.P(q.this).r()) && (q.P(q.this).s()))
                    q.Q(q.this).a(0, 10000);
                  while ((q.ar(q.this)) && ((!q.P(q.this).r()) || (q.as(q.this)) || (q.at(q.this))))
                  {
                    if ((q.this.k != null) && (q.P(q.this).r()))
                    {
                      SharedPreferences localSharedPreferences = ApplicationLoader.a.getSharedPreferences("mainconfig", 0);
                      if (!localSharedPreferences.getBoolean("secretbot", false))
                      {
                        AlertDialog.Builder localBuilder = new AlertDialog.Builder(q.this.l());
                        localBuilder.setTitle(org.vidogram.messenger.r.a("AppName", 2131230856));
                        localBuilder.setMessage(org.vidogram.messenger.r.a("SecretChatContextBotAlert", 2131231786));
                        localBuilder.setPositiveButton(org.vidogram.messenger.r.a("OK", 2131231604), null);
                        q.this.b(localBuilder.create());
                        localSharedPreferences.edit().putBoolean("secretbot", true).commit();
                      }
                    }
                    q.O(q.this).setVisibility(0);
                    q.O(q.this).setTag(null);
                    q.a(q.this, new AnimatorSet());
                    q.aq(q.this).playTogether(new Animator[] { ObjectAnimator.ofFloat(q.O(q.this), "alpha", new float[] { 0.0F, 1.0F }) });
                    q.aq(q.this).addListener(new org.vidogram.messenger.b()
                    {
                      public void onAnimationCancel(Animator paramAnimator)
                      {
                        if ((q.aq(q.this) != null) && (q.aq(q.this).equals(paramAnimator)))
                          q.a(q.this, null);
                      }

                      public void onAnimationEnd(Animator paramAnimator)
                      {
                        if ((q.aq(q.this) != null) && (q.aq(q.this).equals(paramAnimator)))
                          q.a(q.this, null);
                      }
                    });
                    q.aq(q.this).setDuration(200L);
                    q.aq(q.this).start();
                    return;
                    q.an(q.this).a(0, 10000);
                  }
                  q.O(q.this).setAlpha(1.0F);
                  q.O(q.this).setVisibility(4);
                  return;
                  if (q.aq(q.this) == null)
                    continue;
                  q.aq(q.this).cancel();
                  q.a(q.this, null);
                }
                while (q.O(q.this).getVisibility() == 8);
                label493: if (q.ar(q.this))
                {
                  q.a(q.this, new AnimatorSet());
                  q.aq(q.this).playTogether(new Animator[] { ObjectAnimator.ofFloat(q.O(q.this), "alpha", new float[] { 0.0F }) });
                  q.aq(q.this).addListener(new org.vidogram.messenger.b()
                  {
                    public void onAnimationCancel(Animator paramAnimator)
                    {
                      if ((q.aq(q.this) != null) && (q.aq(q.this).equals(paramAnimator)))
                        q.a(q.this, null);
                    }

                    public void onAnimationEnd(Animator paramAnimator)
                    {
                      if ((q.aq(q.this) != null) && (q.aq(q.this).equals(paramAnimator)))
                      {
                        q.O(q.this).setVisibility(8);
                        q.O(q.this).setTag(null);
                        q.a(q.this, null);
                      }
                    }
                  });
                  q.aq(q.this).setDuration(200L);
                  q.aq(q.this).start();
                  return;
                }
                q.O(q.this).setTag(null);
                q.O(q.this).setVisibility(8);
              }

              public void b(boolean paramBoolean)
              {
                if (q.this.l != null)
                {
                  q.this.l.setCaption(q.P(q.this).k());
                  q.this.l.a(paramBoolean);
                }
              }
            });
            this.af = ((org.vidogram.ui.b.n)localObject3);
            ((aw)localObject1).setAdapter((RecyclerView.a)localObject3);
            if ((!org.vidogram.messenger.e.d(this.i)) || ((this.i != null) && (this.i.r)))
              this.af.a(this.bZ);
            this.af.a(this);
            this.af.a(this.n);
            localObject1 = this.af;
            if (this.i == null)
              break label6001;
            bool1 = true;
            ((org.vidogram.ui.b.n)localObject1).b(bool1);
            localObject1 = this.af;
            if ((this.k != null) && (org.vidogram.messenger.a.c(this.k.o) < 46))
              break label6006;
            bool1 = true;
            label3609: ((org.vidogram.ui.b.n)localObject1).c(bool1);
            localObject1 = this.af;
            if (this.i == null)
              break label6011;
            i1 = this.ce;
            label3633: ((org.vidogram.ui.b.n)localObject1).e(i1);
            localObject1 = this.ah;
            localObject3 = new aw.b()
            {
              public void a(View paramView, int paramInt)
              {
                paramView = q.P(q.this).g(paramInt);
                int i = q.P(q.this).m();
                int j = q.P(q.this).n();
                g.vw localvw;
                if ((paramView instanceof g.vw))
                {
                  localvw = (g.vw)paramView;
                  if (localvw != null)
                  {
                    if (localvw.g == null)
                      break label103;
                    q.this.l.a(i, j, "@" + localvw.g + " ");
                  }
                }
                label103: 
                do
                  while (true)
                  {
                    return;
                    String str = localvw.e;
                    if (str != null)
                    {
                      paramView = str;
                      if (str.length() != 0);
                    }
                    else
                    {
                      paramView = localvw.f;
                    }
                    paramView = new SpannableString(paramView + " ");
                    paramView.setSpan(new URLSpanUserMention("" + localvw.d), 0, paramView.length(), 33);
                    q.this.l.a(i, j, paramView);
                    return;
                    if ((paramView instanceof String))
                    {
                      if (q.P(q.this).q())
                      {
                        org.vidogram.messenger.ac.a().a((String)paramView, q.o(q.this), null, null, false, null, null, null);
                        q.this.l.setFieldText("");
                        return;
                      }
                      q.this.l.a(i, j, paramView + " ");
                      return;
                    }
                    if (!(paramView instanceof g.d))
                      break;
                    if (q.this.l.getFieldText() == null)
                      continue;
                    paramView = (g.d)paramView;
                    if ((Build.VERSION.SDK_INT >= 16) && (((paramView.d.equals("photo")) && ((paramView.o != null) || (paramView.i != null))) || ((paramView.d.equals("gif")) && ((paramView.p != null) || (paramView.i != null))) || ((paramView.d.equals("video")) && (paramView.p != null))))
                    {
                      paramView = q.a(q.this, new ArrayList(q.P(q.this).o()));
                      am.a().a(q.this.l());
                      am.a().a(paramView, q.P(q.this).f(paramInt), 3, q.au(q.this), null);
                      return;
                    }
                    q.a(q.this, paramView);
                    return;
                  }
                while (!(paramView instanceof g.ji));
                q.this.a((g.ji)paramView);
              }
            };
            this.U = ((aw.b)localObject3);
            ((aw)localObject1).setOnItemClickListener((aw.b)localObject3);
            this.ah.setOnItemLongClickListener(new aw.c()
            {
              public boolean a(View paramView, int paramInt)
              {
                boolean bool2 = false;
                if ((q.this.l() == null) || (!q.P(q.this).p()));
                while (true)
                {
                  return false;
                  Object localObject = q.P(q.this).g(paramInt);
                  if (!(localObject instanceof String))
                    continue;
                  if (!q.P(q.this).q())
                    break;
                  if (!URLSpanBotCommand.a)
                    continue;
                  q.this.l.setFieldText("");
                  paramView = q.this.l;
                  localObject = (String)localObject;
                  boolean bool1 = bool2;
                  if (q.this.i != null)
                  {
                    bool1 = bool2;
                    if (q.this.i.r)
                      bool1 = true;
                  }
                  paramView.a(null, (String)localObject, true, bool1);
                  return true;
                }
                paramView = new AlertDialog.Builder(q.this.l());
                paramView.setTitle(org.vidogram.messenger.r.a("AppName", 2131230856));
                paramView.setMessage(org.vidogram.messenger.r.a("ClearSearch", 2131231071));
                paramView.setPositiveButton(org.vidogram.messenger.r.a("ClearButton", 2131231065).toUpperCase(), new DialogInterface.OnClickListener()
                {
                  public void onClick(DialogInterface paramDialogInterface, int paramInt)
                  {
                    q.P(q.this).e();
                  }
                });
                paramView.setNegativeButton(org.vidogram.messenger.r.a("Cancel", 2131230943), null);
                q.this.b(paramView.create());
                return true;
              }
            });
            this.ah.setOnScrollListener(new RecyclerView.l()
            {
              public void a(RecyclerView paramRecyclerView, int paramInt)
              {
                boolean bool = true;
                paramRecyclerView = q.this;
                if (paramInt == 1);
                while (true)
                {
                  q.h(paramRecyclerView, bool);
                  return;
                  bool = false;
                }
              }

              public void a(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
              {
                if ((q.P(q.this).r()) && (q.P(q.this).s()))
                {
                  paramInt1 = q.Q(q.this).n();
                  if (paramInt1 != -1)
                    break label96;
                }
                label96: for (paramInt2 = 0; ; paramInt2 = paramInt1)
                {
                  if ((paramInt2 > 0) && (paramInt1 > q.P(q.this).a() - 5))
                    q.P(q.this).l();
                  q.ao(q.this);
                  return;
                  paramInt1 = q.an(q.this).n();
                  break;
                }
              }
            });
          }
          this.Y = new FrameLayout(paramContext);
          this.Y.setVisibility(4);
          ((bg)localObject2).addView(this.Y, org.vidogram.ui.Components.v.a(46, 59.0F, 85, 0.0F, 0.0F, 7.0F, 5.0F));
          this.Y.setOnClickListener(new View.OnClickListener()
          {
            public void onClick(View paramView)
            {
              if (q.av(q.this) > 0)
              {
                q.a(q.this, q.av(q.this), 0, true, q.aw(q.this));
                return;
              }
              q.c(q.this, true);
            }
          });
          localObject1 = new ImageView(paramContext);
          ((ImageView)localObject1).setImageResource(2130838015);
          this.Y.addView((View)localObject1, org.vidogram.ui.Components.v.b(46, 46, 83));
          this.aa = new TextView(paramContext);
          this.aa.setVisibility(4);
          this.aa.setTypeface(org.vidogram.messenger.a.a("fonts/rmedium.ttf"));
          this.aa.setTextSize(1, 13.0F);
          this.aa.setTextColor(-1);
          this.aa.setGravity(17);
          this.aa.setBackgroundResource(2130837681);
          this.aa.setMinWidth(org.vidogram.messenger.a.a(23.0F));
          this.aa.setPadding(org.vidogram.messenger.a.a(8.0F), 0, org.vidogram.messenger.a.a(8.0F), org.vidogram.messenger.a.a(1.0F));
          this.Y.addView(this.aa, org.vidogram.ui.Components.v.b(-2, 23, 49));
          this.l = new org.vidogram.ui.Components.e(l(), (bg)localObject2, this, true);
          this.l.setDialogId(this.bq);
          this.l.a(this.w);
          this.l.setId(1000);
          this.l.a(this.ce, this.cf);
          localObject1 = this.l;
          if ((this.k != null) && (org.vidogram.messenger.a.c(this.k.o) < 23))
            break label6016;
          bool1 = true;
          label4020: if ((this.k != null) && (org.vidogram.messenger.a.c(this.k.o) < 46))
            break label6021;
          bool2 = true;
          label4045: ((org.vidogram.ui.Components.e)localObject1).b(bool1, bool2);
          ((bg)localObject2).addView(this.l, ((bg)localObject2).getChildCount() - 1, org.vidogram.ui.Components.v.b(-1, -2, 83));
          this.l.setDelegate(new e.a()
          {
            public void a()
            {
              org.vidogram.messenger.v.a().a(q.o(q.this), 0, q.aA(q.this));
            }

            public void a(int paramInt)
            {
              boolean bool = true;
              q localq;
              if (paramInt < org.vidogram.messenger.a.a(72.0F) + org.vidogram.ui.a.a.getCurrentActionBarHeight())
              {
                q.i(q.this, false);
                if (q.aH(q.this).getVisibility() == 0)
                  q.aH(q.this).setVisibility(4);
                if ((q.O(q.this) != null) && (q.O(q.this).getVisibility() == 0))
                  q.O(q.this).setVisibility(4);
                localq = q.this;
                if (q.this.l.o())
                  break label230;
              }
              while (true)
              {
                q.j(localq, bool);
                q.aI(q.this);
                return;
                q.i(q.this, true);
                if (q.aH(q.this).getVisibility() == 4)
                  q.aH(q.this).setVisibility(0);
                if ((q.O(q.this) == null) || (q.O(q.this).getVisibility() != 4) || ((q.P(q.this).r()) && (!q.as(q.this)) && (!q.at(q.this))))
                  break;
                q.O(q.this).setVisibility(0);
                q.O(q.this).setTag(null);
                break;
                label230: bool = false;
              }
            }

            public void a(CharSequence paramCharSequence)
            {
              q.ax(q.this);
              q.this.a(false, null, null, null, false, true);
              if (q.P(q.this) != null)
                q.P(q.this).a(paramCharSequence);
            }

            public void a(CharSequence paramCharSequence, boolean paramBoolean)
            {
              MediaController localMediaController = MediaController.a();
              if (((paramCharSequence != null) && (paramCharSequence.length() != 0)) || (q.this.l.j()));
              for (boolean bool = true; ; bool = false)
              {
                localMediaController.a(bool);
                if ((q.ay(q.this) != null) && (!q.this.l.j()))
                  q.ay(q.this).a(paramCharSequence);
                if (q.P(q.this) != null)
                  q.P(q.this).a(paramCharSequence.toString(), q.this.l.getCursorPosition(), q.this.m);
                if (q.az(q.this) != null)
                {
                  org.vidogram.messenger.a.b(q.az(q.this));
                  q.b(q.this, null);
                }
                if ((q.this.l.f()) && ((!q.this.l.j()) || (!q.this.l.k())))
                {
                  if (!paramBoolean)
                    break;
                  q.a(q.this, paramCharSequence, true);
                }
                return;
              }
              q.b(q.this, new Runnable(paramCharSequence)
              {
                public void run()
                {
                  if (this == q.az(q.this))
                  {
                    q.a(q.this, this.a, false);
                    q.b(q.this, null);
                  }
                }
              });
              paramCharSequence = q.az(q.this);
              long l;
              if (org.vidogram.messenger.a.j == null)
                l = 3000L;
              while (true)
              {
                org.vidogram.messenger.a.a(paramCharSequence, l);
                return;
                l = 1000L;
              }
            }

            public void a(boolean paramBoolean)
            {
              if (paramBoolean)
              {
                q.b(q.this, true, true);
                return;
              }
              Object localObject = q.P(q.this);
              if ((q.this.k == null) || (org.vidogram.messenger.a.c(q.this.k.o) >= 46))
              {
                paramBoolean = true;
                ((org.vidogram.ui.b.n)localObject).c(paramBoolean);
                q.L(q.this).setOnItemLongClickListener(q.this.o);
                q.L(q.this).setOnItemClickListener(q.this.p);
                q.L(q.this).setClickable(true);
                q.L(q.this).setLongClickable(true);
                q.P(q.this).a(true);
                q.aD(q.this).setVisibility(8);
                q.aE(q.this).setVisibility(0);
                localObject = q.this.l;
                if ((q.this.k != null) && (org.vidogram.messenger.a.c(q.this.k.o) < 23))
                  break label285;
                paramBoolean = true;
                label185: if ((q.this.k != null) && (org.vidogram.messenger.a.c(q.this.k.o) < 46))
                  break label290;
              }
              label285: label290: for (boolean bool = true; ; bool = false)
              {
                ((org.vidogram.ui.Components.e)localObject).b(paramBoolean, bool);
                if (q.aF(q.this) != 0)
                {
                  ConnectionsManager.a().a(q.aF(q.this), true);
                  q.d(q.this, 0);
                }
                q.aG(q.this).d();
                q.a(q.this, true);
                q.i(q.this);
                return;
                paramBoolean = false;
                break;
                paramBoolean = false;
                break label185;
              }
            }

            public void b()
            {
              if (q.aB(q.this).j());
              do
              {
                return;
                if (q.x(q.this) == null)
                  continue;
                q.x(q.this).setVisibility(0);
              }
              while (q.w(q.this) == null);
              q.w(q.this).setVisibility(8);
            }

            public void b(boolean paramBoolean)
            {
              if (q.aJ(q.this) != null)
                q.aJ(q.this).setVisibility(8);
              q localq = q.this;
              if (!paramBoolean);
              for (paramBoolean = true; ; paramBoolean = false)
              {
                q.k(localq, paramBoolean);
                q.aI(q.this);
                return;
              }
            }

            public void c()
            {
              if (q.aC(q.this).j());
              do
              {
                return;
                if (q.x(q.this) == null)
                  continue;
                q.x(q.this).setVisibility(8);
              }
              while (q.w(q.this) == null);
              q.w(q.this).setVisibility(0);
            }
          });
          localObject1 = new FrameLayout(paramContext)
          {
            public boolean hasOverlappingRendering()
            {
              return false;
            }

            public void setTranslationY(float paramFloat)
            {
              super.setTranslationY(paramFloat);
              if (q.this.l != null)
                q.this.l.invalidate();
              if (getVisibility() != 8)
              {
                int i = getLayoutParams().height;
                if (q.L(q.this) != null)
                  q.L(q.this).setTranslationY(paramFloat);
                if (q.M(q.this) != null)
                  q.M(q.this).setTranslationY(paramFloat);
                if (q.O(q.this) != null)
                  q.O(q.this).setTranslationY(paramFloat);
                if (q.T(q.this) != null)
                  q.T(q.this).setTranslationY(paramFloat);
              }
            }

            public void setVisibility(int paramInt)
            {
              float f = 0.0F;
              super.setVisibility(paramInt);
              if (paramInt == 8)
              {
                if (q.L(q.this) != null)
                  q.L(q.this).setTranslationY(0.0F);
                if (q.M(q.this) != null)
                  q.M(q.this).setTranslationY(0.0F);
                if (q.O(q.this) != null)
                  q.O(q.this).setTranslationY(0.0F);
                if (q.T(q.this) != null)
                {
                  FrameLayout localFrameLayout = q.T(q.this);
                  if (q.T(q.this).getTag() == null)
                    f = org.vidogram.messenger.a.a(100.0F);
                  localFrameLayout.setTranslationY(f);
                }
              }
            }
          };
          ((FrameLayout)localObject1).setClickable(true);
          this.l.a((View)localObject1, 48);
          localObject3 = new View(paramContext);
          ((View)localObject3).setBackgroundColor(-1513240);
          ((FrameLayout)localObject1).addView((View)localObject3, org.vidogram.ui.Components.v.b(-1, 1, 83));
          this.ae = new ImageView(paramContext);
          this.ae.setScaleType(ImageView.ScaleType.CENTER);
          ((FrameLayout)localObject1).addView(this.ae, org.vidogram.ui.Components.v.b(52, 46, 51));
          localObject3 = new ImageView(paramContext);
          ((ImageView)localObject3).setImageResource(2130837728);
          ((ImageView)localObject3).setScaleType(ImageView.ScaleType.CENTER);
          ((FrameLayout)localObject1).addView((View)localObject3, org.vidogram.ui.Components.v.a(52, 46.0F, 53, 0.0F, 0.5F, 0.0F, 0.0F));
          ((ImageView)localObject3).setOnClickListener(new View.OnClickListener()
          {
            public void onClick(View paramView)
            {
              if (q.k(q.this) != null)
                q.k(q.this).clear();
              q.this.a(false, null, null, q.aK(q.this), true, true);
              if (q.aL(q.this).f())
              {
                int i = 1;
                while (i >= 0)
                {
                  q.f(q.this)[i].clear();
                  q.g(q.this)[i].clear();
                  i -= 1;
                }
                q.a(q.this, 0);
                if (!q.this.l.j())
                  break label131;
                q.this.l.a(null, false);
              }
              while (true)
              {
                q.i(q.this);
                return;
                label131: q.aM(q.this).d();
                q.a(q.this, true);
              }
            }
          });
          this.cp = new ImageView(paramContext);
          this.cp.setImageResource(2130837826);
          this.cp.setScaleType(ImageView.ScaleType.CENTER);
          ((FrameLayout)localObject1).addView(this.cp, org.vidogram.ui.Components.v.a(52, 46.0F, 53, 0.0F, 0.5F, 52.0F, 0.0F));
          this.cp.setVisibility(8);
          this.ac = new org.vidogram.ui.a.k(paramContext);
          this.ac.setTextSize(14);
          this.ac.setTextColor(-12940081);
          this.ac.setTypeface(org.vidogram.messenger.a.a("fonts/rmedium.ttf"));
          ((FrameLayout)localObject1).addView(this.ac, org.vidogram.ui.Components.v.a(-1, 18.0F, 51, 52.0F, 6.0F, 104.0F, 0.0F));
          this.ad = new org.vidogram.ui.a.k(paramContext);
          this.ad.setTextSize(14);
          this.ad.setTextColor(-14540254);
          ((FrameLayout)localObject1).addView(this.ad, org.vidogram.ui.Components.v.a(-1, 18.0F, 51, 52.0F, 24.0F, 104.0F, 0.0F));
          this.ab = new BackupImageView(paramContext);
          ((FrameLayout)localObject1).addView(this.ab, org.vidogram.ui.Components.v.a(34, 34.0F, 51, 52.0F, 6.0F, 0.0F, 0.0F));
          this.W = new FrameLayout(paramContext);
          this.W.setVisibility(8);
          ((bg)localObject2).addView(this.W, org.vidogram.ui.Components.v.a(-2, 81.5F, 83, 0.0F, 0.0F, 0.0F, 38.0F));
          this.S = new aw(paramContext)
          {
            public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
            {
              int i = 0;
              boolean bool = ax.a().a(paramMotionEvent, q.aN(q.this), 0);
              if ((super.onInterceptTouchEvent(paramMotionEvent)) || (bool))
                i = 1;
              return i;
            }
          };
          this.S.setTag(Integer.valueOf(3));
          this.S.setOnTouchListener(new View.OnTouchListener()
          {
            public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
            {
              return ax.a().a(paramMotionEvent, q.aN(q.this), 0, q.aO(q.this));
            }
          });
          this.S.setDisallowInterceptTouchEvents(true);
          localObject1 = new LinearLayoutManager(paramContext);
          ((LinearLayoutManager)localObject1).b(0);
          this.S.setLayoutManager((RecyclerView.h)localObject1);
          this.S.setClipToPadding(false);
          this.S.setOverScrollMode(2);
          this.W.addView(this.S, org.vidogram.ui.Components.v.a(-1, 78.0F));
          F();
          localObject1 = new ImageView(paramContext);
          ((ImageView)localObject1).setImageResource(2130838155);
          this.W.addView((View)localObject1, org.vidogram.ui.Components.v.a(-2, -2.0F, 83, 53.0F, 0.0F, 0.0F, 0.0F));
          this.aC = new FrameLayout(paramContext);
          this.aC.setBackgroundResource(2130837714);
          this.aC.setVisibility(4);
          this.aC.setFocusable(true);
          this.aC.setFocusableInTouchMode(true);
          this.aC.setClickable(true);
          this.aC.setBackgroundResource(2130837714);
          this.aC.setPadding(0, org.vidogram.messenger.a.a(3.0F), 0, 0);
          ((bg)localObject2).addView(this.aC, org.vidogram.ui.Components.v.b(-1, 51, 80));
          this.aD = new ImageView(paramContext);
          this.aD.setScaleType(ImageView.ScaleType.CENTER);
          this.aD.setImageResource(2130838129);
          this.aC.addView(this.aD, org.vidogram.ui.Components.v.a(48, 48.0F));
          this.aD.setOnClickListener(new View.OnClickListener()
          {
            public void onClick(View paramView)
            {
              org.vidogram.messenger.d.d.a(null, q.o(q.this), q.B(q.this), q.aP(q.this), 1);
            }
          });
          this.aE = new ImageView(paramContext);
          this.aE.setScaleType(ImageView.ScaleType.CENTER);
          this.aE.setImageResource(2130838124);
          this.aC.addView(this.aE, org.vidogram.ui.Components.v.a(48, 48.0F, 51, 48.0F, 0.0F, 0.0F, 0.0F));
          this.aE.setOnClickListener(new View.OnClickListener()
          {
            public void onClick(View paramView)
            {
              org.vidogram.messenger.d.d.a(null, q.o(q.this), q.B(q.this), q.aQ(q.this), 2);
            }
          });
          this.aF = new org.vidogram.ui.a.k(paramContext);
          this.aF.setTextColor(-11625772);
          this.aF.setTextSize(15);
          this.aF.setTypeface(org.vidogram.messenger.a.a("fonts/rmedium.ttf"));
          this.aC.addView(this.aF, org.vidogram.ui.Components.v.a(-1, -2.0F, 19, 108.0F, 0.0F, 0.0F, 0.0F));
          this.u = new FrameLayout(paramContext);
          this.u.setVisibility(4);
          this.u.setFocusable(true);
          this.u.setFocusableInTouchMode(true);
          this.u.setClickable(true);
          this.u.setBackgroundResource(2130837714);
          this.u.setPadding(0, org.vidogram.messenger.a.a(3.0F), 0, 0);
          ((bg)localObject2).addView(this.u, org.vidogram.ui.Components.v.b(-1, 51, 80));
          this.N = new TextView(paramContext);
          this.N.setTextSize(1, 16.0F);
          this.N.setTextColor(-8421505);
          this.u.addView(this.N, org.vidogram.ui.Components.v.b(-2, -2, 17));
          this.I = new FrameLayout(paramContext);
          this.I.setBackgroundResource(2130837714);
          this.I.setPadding(0, org.vidogram.messenger.a.a(3.0F), 0, 0);
          this.I.setVisibility(4);
          ((bg)localObject2).addView(this.I, org.vidogram.ui.Components.v.b(-1, 51, 80));
          this.I.setOnClickListener(new View.OnClickListener()
          {
            public void onClick(View paramView)
            {
              if (q.this.l() == null);
              label459: 
              while (true)
              {
                return;
                if ((q.this.j != null) && (q.aR(q.this)))
                  if (q.this.j.r)
                  {
                    paramView = q.aS(q.this);
                    q.b(q.this, null);
                    org.vidogram.messenger.v.a().i(q.this.j.d);
                    if ((paramView != null) && (paramView.length() != 0))
                    {
                      org.vidogram.messenger.v.a().a(q.this.j, paramView);
                      paramView = null;
                    }
                  }
                while (true)
                {
                  if (paramView == null)
                    break label459;
                  paramView.setTitle(org.vidogram.messenger.r.a("AppName", 2131230856));
                  paramView.setNegativeButton(org.vidogram.messenger.r.a("Cancel", 2131230943), null);
                  q.this.b(paramView.create());
                  return;
                  org.vidogram.messenger.ac.a().a("/start", q.o(q.this), null, null, false, null, null, null);
                  break;
                  paramView = new AlertDialog.Builder(q.this.l());
                  paramView.setMessage(org.vidogram.messenger.r.a("AreYouSureUnblockContact", 2131230888));
                  paramView.setPositiveButton(org.vidogram.messenger.r.a("OK", 2131231604), new DialogInterface.OnClickListener()
                  {
                    public void onClick(DialogInterface paramDialogInterface, int paramInt)
                    {
                      org.vidogram.messenger.v.a().i(q.this.j.d);
                    }
                  });
                  continue;
                  if ((q.this.j != null) && (q.this.j.r) && (q.aS(q.this) != null))
                  {
                    if (q.aS(q.this).length() != 0)
                      org.vidogram.messenger.v.a().a(q.this.j, q.aS(q.this));
                    while (true)
                    {
                      q.b(q.this, null);
                      q.z(q.this);
                      paramView = null;
                      break;
                      org.vidogram.messenger.ac.a().a("/start", q.o(q.this), null, null, false, null, null, null);
                    }
                  }
                  if ((org.vidogram.messenger.e.d(q.this.i)) && (!(q.this.i instanceof g.dj)))
                  {
                    if (org.vidogram.messenger.e.c(q.this.i))
                    {
                      org.vidogram.messenger.v.a().a(q.this.i.h, org.vidogram.messenger.ad.d(), null, 0, null, null);
                      paramView = null;
                      continue;
                    }
                    q.b(q.this, true);
                    paramView = null;
                    continue;
                  }
                  paramView = new AlertDialog.Builder(q.this.l());
                  paramView.setMessage(org.vidogram.messenger.r.a("AreYouSureDeleteThisChat", 2131230879));
                  paramView.setPositiveButton(org.vidogram.messenger.r.a("OK", 2131231604), new DialogInterface.OnClickListener()
                  {
                    public void onClick(DialogInterface paramDialogInterface, int paramInt)
                    {
                      org.vidogram.messenger.v.a().a(q.o(q.this), 0);
                      q.this.d();
                    }
                  });
                }
              }
            }
          });
          this.H = new TextView(paramContext);
          this.H.setTextSize(1, 15.0F);
          this.H.setTypeface(org.vidogram.messenger.a.a("fonts/rmedium.ttf"));
          this.H.setTextColor(-12940081);
          this.I.addView(this.H, org.vidogram.ui.Components.v.b(-2, -2, 17));
          this.G.d();
          if ((!this.bH) || (!this.m.isEmpty()))
            break label6032;
          localObject1 = this.t;
          if (a.b(this.G) != -1)
            break label6027;
          i1 = 0;
          label5325: ((FrameLayout)localObject1).setVisibility(i1);
          this.E.setEmptyView(null);
          label5339: localObject3 = this.l;
          if (!this.q)
            break label6054;
          localObject1 = null;
          ((org.vidogram.ui.Components.e)localObject3).setButtons((u)localObject1);
          if ((!org.vidogram.messenger.a.c()) || (org.vidogram.messenger.a.d()))
          {
            paramContext = new ao(paramContext, this);
            this.ar = paramContext;
            ((bg)localObject2).addView(paramContext, org.vidogram.ui.Components.v.a(-1, 39.0F, 51, 0.0F, -36.0F, 0.0F, 0.0F));
          }
          W();
          U();
          L();
          V();
          h(true);
        }
        try
        {
          if ((this.k != null) && (Build.VERSION.SDK_INT >= 23))
            l().getWindow().setFlags(8192, 8192);
          aa();
          ((bg)localObject2).addView(this.d);
          return this.b;
          bool1 = false;
          continue;
          this.d.addView(this.M, 0, org.vidogram.ui.Components.v.a(-2, -1.0F, 51, 56.0F, 0.0F, 40.0F, 0.0F));
          break label207;
          label5519: this.y = ((org.vidogram.ui.a.c)localObject1).b(0, 2130837803);
          break label569;
          label5535: this.y.a(16, org.vidogram.messenger.r.a("DeleteChatUser", 2131231127), 0);
          break label787;
          label5558: this.L.add(((org.vidogram.ui.a.c)localObject1).a(19, 2130837804, -986896, null, org.vidogram.messenger.a.a(54.0F)));
          this.L.add(((org.vidogram.ui.a.c)localObject1).a(10, 2130837798, -986896, null, org.vidogram.messenger.a.a(54.0F)));
          this.L.add(((org.vidogram.ui.a.c)localObject1).a(12, 2130837799, -986896, null, org.vidogram.messenger.a.a(54.0F)));
          break label1493;
          label5645: i1 = 8;
          break label1526;
          label5651: i1 = 8;
          break label1550;
          label5657: localObject1 = new TextView(paramContext);
          if ((this.j != null) && (this.j.d != 777000) && (this.j.d != 429000) && ((this.j.d / 1000 == 333) || (this.j.d % 1000 == 0)))
            ((TextView)localObject1).setText(org.vidogram.messenger.r.a("GotAQuestion", 2131231276));
          while (true)
          {
            ((TextView)localObject1).setTextSize(1, 14.0F);
            ((TextView)localObject1).setGravity(17);
            ((TextView)localObject1).setTextColor(-1);
            ((TextView)localObject1).setBackgroundResource(2130838163);
            ((TextView)localObject1).getBackground().setColorFilter(org.vidogram.ui.a.l.P);
            ((TextView)localObject1).setTypeface(org.vidogram.messenger.a.a("fonts/rmedium.ttf"));
            ((TextView)localObject1).setPadding(org.vidogram.messenger.a.a(10.0F), org.vidogram.messenger.a.a(2.0F), org.vidogram.messenger.a.a(10.0F), org.vidogram.messenger.a.a(3.0F));
            this.J.addView((View)localObject1, new FrameLayout.LayoutParams(-2, -2, 17));
            break;
            ((TextView)localObject1).setText(org.vidogram.messenger.r.a("NoMessages", 2131231500));
          }
          label5866: this.K = new org.vidogram.ui.Components.h(paramContext, true);
          if (this.k.e == org.vidogram.messenger.ad.c())
            this.K.setSecretText(org.vidogram.messenger.r.a("EncryptedPlaceholderTitleOutgoing", 2131231172, new Object[] { ae.d(this.j) }));
          while (true)
          {
            this.J.addView(this.K, new FrameLayout.LayoutParams(-2, -2, 17));
            break;
            this.K.setSecretText(org.vidogram.messenger.r.a("EncryptedPlaceholderTitleIncoming", 2131231171, new Object[] { ae.d(this.j) }));
          }
          this.ap.setText(org.vidogram.messenger.r.a("ReportSpam", 2131231725));
          break label2842;
          label6001: bool1 = false;
          break label3573;
          label6006: bool1 = false;
          break label3609;
          label6011: i1 = 1;
          break label3633;
          label6016: bool1 = false;
          break label4020;
          label6021: bool2 = false;
          break label4045;
          label6027: i1 = 4;
          break label5325;
          label6032: this.t.setVisibility(4);
          this.E.setEmptyView(this.J);
          break label5339;
          label6054: localObject1 = this.cc;
        }
        catch (Throwable paramContext)
        {
          while (true)
            org.vidogram.messenger.n.a("tmessages", paramContext);
        }
      }
      catch (Exception localException)
      {
        break label2069;
      }
    }
  }

  public am.e a(u paramu, g.x paramx, int paramInt)
  {
    int i2 = this.E.getChildCount();
    paramInt = 0;
    u localu1;
    View localView;
    Object localObject;
    if (paramInt < i2)
    {
      localu1 = null;
      localView = this.E.getChildAt(paramInt);
      if ((localView instanceof org.vidogram.ui.c.j))
      {
        localObject = localu1;
        if (paramu != null)
        {
          localObject = (org.vidogram.ui.c.j)localView;
          localu1 = ((org.vidogram.ui.c.j)localObject).getMessageObject();
          if ((localu1 == null) || (localu1.q() != paramu.q()))
            break label428;
          localObject = ((org.vidogram.ui.c.j)localObject).getPhotoImage();
        }
      }
    }
    while (true)
    {
      if (localObject != null)
      {
        paramu = new int[2];
        localView.getLocationInWindow(paramu);
        paramx = new am.e();
        paramx.b = paramu[0];
        int i1 = paramu[1];
        if (Build.VERSION.SDK_INT >= 21);
        for (paramInt = 0; ; paramInt = org.vidogram.messenger.a.a)
        {
          paramx.c = (i1 - paramInt);
          paramx.d = this.E;
          paramx.a = ((org.vidogram.messenger.q)localObject);
          paramx.e = ((org.vidogram.messenger.q)localObject).h();
          paramx.h = ((org.vidogram.messenger.q)localObject).D();
          if (((localView instanceof org.vidogram.ui.c.h)) && (this.i != null))
            paramx.f = (-this.i.h);
          if (((this.au != null) && (this.au.getTag() == null)) || ((this.am != null) && (this.am.getTag() == null)))
            paramx.j = org.vidogram.messenger.a.a(48.0F);
          return paramx;
          localObject = localu1;
          if (!(localView instanceof org.vidogram.ui.c.h))
            break;
          org.vidogram.ui.c.h localh = (org.vidogram.ui.c.h)localView;
          u localu2 = localh.getMessageObject();
          localObject = localu1;
          if (localu2 == null)
            break;
          if (paramu != null)
          {
            localObject = localu1;
            if (localu2.q() != paramu.q())
              break;
            localObject = localh.getPhotoImage();
            break;
          }
          localObject = localu1;
          if (paramx == null)
            break;
          localObject = localu1;
          if (localu2.m == null)
            break;
          i1 = 0;
          while (true)
          {
            localObject = localu1;
            if (i1 >= localu2.m.size())
              break;
            localObject = (g.az)localu2.m.get(i1);
            if ((((g.az)localObject).c.c == paramx.c) && (((g.az)localObject).c.d == paramx.d))
            {
              localObject = localh.getPhotoImage();
              break;
            }
            i1 += 1;
          }
        }
      }
      paramInt += 1;
      break;
      return null;
      label428: localObject = null;
    }
  }

  // ERROR //
  public void a(int paramInt1, int paramInt2, Intent paramIntent)
  {
    // Byte code:
    //   0: iload_2
    //   1: iconst_m1
    //   2: if_icmpne +145 -> 147
    //   5: iload_1
    //   6: ifne +177 -> 183
    //   9: invokestatic 3356	org/vidogram/ui/am:a	()Lorg/vidogram/ui/am;
    //   12: aload_0
    //   13: invokevirtual 677	org/vidogram/ui/q:l	()Landroid/app/Activity;
    //   16: invokevirtual 3359	org/vidogram/ui/am:a	(Landroid/app/Activity;)V
    //   19: new 467	java/util/ArrayList
    //   22: dup
    //   23: invokespecial 470	java/util/ArrayList:<init>	()V
    //   26: astore_3
    //   27: iconst_0
    //   28: istore_2
    //   29: new 3361	android/media/ExifInterface
    //   32: dup
    //   33: aload_0
    //   34: getfield 2255	org/vidogram/ui/q:bY	Ljava/lang/String;
    //   37: invokespecial 3362	android/media/ExifInterface:<init>	(Ljava/lang/String;)V
    //   40: ldc_w 3364
    //   43: iconst_1
    //   44: invokevirtual 3367	android/media/ExifInterface:getAttributeInt	(Ljava/lang/String;I)I
    //   47: istore 4
    //   49: iload_2
    //   50: istore_1
    //   51: iload 4
    //   53: tableswitch	default:+39 -> 92, 3:+101->154, 4:+41->94, 5:+41->94, 6:+95->148, 7:+41->94, 8:+108->161
    //   93: istore_1
    //   94: aload_3
    //   95: new 3369	org/vidogram/messenger/MediaController$i
    //   98: dup
    //   99: iconst_0
    //   100: iconst_0
    //   101: lconst_0
    //   102: aload_0
    //   103: getfield 2255	org/vidogram/ui/q:bY	Ljava/lang/String;
    //   106: iload_1
    //   107: iconst_0
    //   108: invokespecial 3372	org/vidogram/messenger/MediaController$i:<init>	(IIJLjava/lang/String;IZ)V
    //   111: invokevirtual 1388	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   114: pop
    //   115: invokestatic 3356	org/vidogram/ui/am:a	()Lorg/vidogram/ui/am;
    //   118: aload_3
    //   119: iconst_0
    //   120: iconst_2
    //   121: new 156	org/vidogram/ui/q$58
    //   124: dup
    //   125: aload_0
    //   126: aload_3
    //   127: invokespecial 3373	org/vidogram/ui/q$58:<init>	(Lorg/vidogram/ui/q;Ljava/util/ArrayList;)V
    //   130: aload_0
    //   131: invokevirtual 3376	org/vidogram/ui/am:a	(Ljava/util/ArrayList;IILorg/vidogram/ui/am$d;Lorg/vidogram/ui/q;)Z
    //   134: pop
    //   135: aload_0
    //   136: getfield 2255	org/vidogram/ui/q:bY	Ljava/lang/String;
    //   139: invokestatic 3378	org/vidogram/messenger/a:c	(Ljava/lang/String;)V
    //   142: aload_0
    //   143: aconst_null
    //   144: putfield 2255	org/vidogram/ui/q:bY	Ljava/lang/String;
    //   147: return
    //   148: bipush 90
    //   150: istore_1
    //   151: goto -57 -> 94
    //   154: sipush 180
    //   157: istore_1
    //   158: goto -64 -> 94
    //   161: sipush 270
    //   164: istore_1
    //   165: goto -71 -> 94
    //   168: astore 5
    //   170: ldc_w 2260
    //   173: aload 5
    //   175: invokestatic 2265	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   178: iconst_0
    //   179: istore_1
    //   180: goto -86 -> 94
    //   183: iload_1
    //   184: iconst_1
    //   185: if_icmpne +152 -> 337
    //   188: aload_3
    //   189: ifnull +10 -> 199
    //   192: aload_3
    //   193: invokevirtual 3382	android/content/Intent:getData	()Landroid/net/Uri;
    //   196: ifnonnull +8 -> 204
    //   199: aload_0
    //   200: invokespecial 3384	org/vidogram/ui/q:S	()V
    //   203: return
    //   204: aload_3
    //   205: invokevirtual 3382	android/content/Intent:getData	()Landroid/net/Uri;
    //   208: astore_3
    //   209: aload_3
    //   210: invokevirtual 3385	android/net/Uri:toString	()Ljava/lang/String;
    //   213: ldc_w 3387
    //   216: invokevirtual 3391	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   219: ifeq +100 -> 319
    //   222: aload_3
    //   223: invokestatic 3394	org/vidogram/messenger/a:c	(Landroid/net/Uri;)Ljava/lang/String;
    //   226: astore_3
    //   227: aload_3
    //   228: ifnonnull +7 -> 235
    //   231: aload_0
    //   232: invokespecial 3384	org/vidogram/ui/q:S	()V
    //   235: getstatic 2215	android/os/Build$VERSION:SDK_INT	I
    //   238: bipush 16
    //   240: if_icmplt +58 -> 298
    //   243: aload_0
    //   244: getfield 478	org/vidogram/ui/q:ba	Z
    //   247: ifeq +40 -> 287
    //   250: aload_0
    //   251: aload_3
    //   252: putfield 534	org/vidogram/ui/q:ci	Ljava/lang/String;
    //   255: aload_0
    //   256: iconst_0
    //   257: aconst_null
    //   258: aconst_null
    //   259: aconst_null
    //   260: iconst_0
    //   261: iconst_1
    //   262: invokevirtual 1272	org/vidogram/ui/q:a	(ZLorg/vidogram/messenger/u;Ljava/util/ArrayList;Lorg/vidogram/tgnet/g$wb;ZZ)V
    //   265: aload_0
    //   266: getfield 1029	org/vidogram/ui/q:bq	J
    //   269: iconst_1
    //   270: invokestatic 1034	org/vidogram/messenger/d/b:a	(JZ)V
    //   273: return
    //   274: astore_3
    //   275: ldc_w 2260
    //   278: aload_3
    //   279: invokestatic 2265	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   282: aconst_null
    //   283: astore_3
    //   284: goto -57 -> 227
    //   287: aload_0
    //   288: aload_3
    //   289: iconst_0
    //   290: iconst_0
    //   291: invokevirtual 3397	org/vidogram/ui/q:a	(Ljava/lang/String;ZZ)Z
    //   294: pop
    //   295: goto -40 -> 255
    //   298: aload_3
    //   299: lconst_0
    //   300: lconst_0
    //   301: iconst_0
    //   302: iconst_0
    //   303: aconst_null
    //   304: aload_0
    //   305: getfield 1029	org/vidogram/ui/q:bq	J
    //   308: aload_0
    //   309: getfield 1267	org/vidogram/ui/q:aY	Lorg/vidogram/messenger/u;
    //   312: aconst_null
    //   313: invokestatic 3400	org/vidogram/messenger/ac:a	(Ljava/lang/String;JJIILorg/vidogram/messenger/af;JLorg/vidogram/messenger/u;Ljava/lang/String;)V
    //   316: goto -61 -> 255
    //   319: aconst_null
    //   320: aload_3
    //   321: aload_0
    //   322: getfield 1029	org/vidogram/ui/q:bq	J
    //   325: aload_0
    //   326: getfield 1267	org/vidogram/ui/q:aY	Lorg/vidogram/messenger/u;
    //   329: aconst_null
    //   330: aconst_null
    //   331: invokestatic 3403	org/vidogram/messenger/ac:a	(Ljava/lang/String;Landroid/net/Uri;JLorg/vidogram/messenger/u;Ljava/lang/CharSequence;Ljava/util/ArrayList;)V
    //   334: goto -79 -> 255
    //   337: iload_1
    //   338: iconst_2
    //   339: if_icmpne +315 -> 654
    //   342: aconst_null
    //   343: astore 6
    //   345: ldc_w 2260
    //   348: new 996	java/lang/StringBuilder
    //   351: dup
    //   352: invokespecial 997	java/lang/StringBuilder:<init>	()V
    //   355: ldc_w 3405
    //   358: invokevirtual 1003	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   361: aload_0
    //   362: getfield 2255	org/vidogram/ui/q:bY	Ljava/lang/String;
    //   365: invokevirtual 1003	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   368: invokevirtual 1011	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   371: invokestatic 3407	org/vidogram/messenger/n:b	(Ljava/lang/String;Ljava/lang/String;)V
    //   374: aload_3
    //   375: astore 5
    //   377: aload_3
    //   378: ifnull +36 -> 414
    //   381: aload_3
    //   382: astore 5
    //   384: aload_0
    //   385: getfield 2255	org/vidogram/ui/q:bY	Ljava/lang/String;
    //   388: ifnull +26 -> 414
    //   391: aload_3
    //   392: astore 5
    //   394: new 2090	java/io/File
    //   397: dup
    //   398: aload_0
    //   399: getfield 2255	org/vidogram/ui/q:bY	Ljava/lang/String;
    //   402: invokespecial 2092	java/io/File:<init>	(Ljava/lang/String;)V
    //   405: invokevirtual 2095	java/io/File:exists	()Z
    //   408: ifeq +6 -> 414
    //   411: aconst_null
    //   412: astore 5
    //   414: aload 6
    //   416: astore_3
    //   417: aload 5
    //   419: ifnull +110 -> 529
    //   422: aload 5
    //   424: invokevirtual 3382	android/content/Intent:getData	()Landroid/net/Uri;
    //   427: astore_3
    //   428: aload_3
    //   429: ifnull +169 -> 598
    //   432: ldc_w 2260
    //   435: new 996	java/lang/StringBuilder
    //   438: dup
    //   439: invokespecial 997	java/lang/StringBuilder:<init>	()V
    //   442: ldc_w 3409
    //   445: invokevirtual 1003	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   448: aload_3
    //   449: invokevirtual 3385	android/net/Uri:toString	()Ljava/lang/String;
    //   452: invokevirtual 1003	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   455: invokevirtual 1011	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   458: invokestatic 3407	org/vidogram/messenger/n:b	(Ljava/lang/String;Ljava/lang/String;)V
    //   461: aload_3
    //   462: invokestatic 3394	org/vidogram/messenger/a:c	(Landroid/net/Uri;)Ljava/lang/String;
    //   465: astore 5
    //   467: ldc_w 2260
    //   470: new 996	java/lang/StringBuilder
    //   473: dup
    //   474: invokespecial 997	java/lang/StringBuilder:<init>	()V
    //   477: ldc_w 3411
    //   480: invokevirtual 1003	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   483: aload 5
    //   485: invokevirtual 1003	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   488: invokevirtual 1011	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   491: invokestatic 3407	org/vidogram/messenger/n:b	(Ljava/lang/String;Ljava/lang/String;)V
    //   494: aload 5
    //   496: astore_3
    //   497: new 2090	java/io/File
    //   500: dup
    //   501: aload 5
    //   503: invokespecial 2092	java/io/File:<init>	(Ljava/lang/String;)V
    //   506: invokevirtual 2095	java/io/File:exists	()Z
    //   509: ifne +8 -> 517
    //   512: aload_0
    //   513: getfield 2255	org/vidogram/ui/q:bY	Ljava/lang/String;
    //   516: astore_3
    //   517: aload_0
    //   518: getfield 2255	org/vidogram/ui/q:bY	Ljava/lang/String;
    //   521: invokestatic 3378	org/vidogram/messenger/a:c	(Ljava/lang/String;)V
    //   524: aload_0
    //   525: aconst_null
    //   526: putfield 2255	org/vidogram/ui/q:bY	Ljava/lang/String;
    //   529: aload_3
    //   530: astore 5
    //   532: aload_3
    //   533: ifnonnull +43 -> 576
    //   536: aload_3
    //   537: astore 5
    //   539: aload_0
    //   540: getfield 2255	org/vidogram/ui/q:bY	Ljava/lang/String;
    //   543: ifnull +33 -> 576
    //   546: new 2090	java/io/File
    //   549: dup
    //   550: aload_0
    //   551: getfield 2255	org/vidogram/ui/q:bY	Ljava/lang/String;
    //   554: invokespecial 2092	java/io/File:<init>	(Ljava/lang/String;)V
    //   557: invokevirtual 2095	java/io/File:exists	()Z
    //   560: ifeq +8 -> 568
    //   563: aload_0
    //   564: getfield 2255	org/vidogram/ui/q:bY	Ljava/lang/String;
    //   567: astore_3
    //   568: aload_0
    //   569: aconst_null
    //   570: putfield 2255	org/vidogram/ui/q:bY	Ljava/lang/String;
    //   573: aload_3
    //   574: astore 5
    //   576: getstatic 2215	android/os/Build$VERSION:SDK_INT	I
    //   579: bipush 16
    //   581: if_icmplt +35 -> 616
    //   584: aload_0
    //   585: getfield 478	org/vidogram/ui/q:ba	Z
    //   588: ifeq +18 -> 606
    //   591: aload_0
    //   592: aload 5
    //   594: putfield 534	org/vidogram/ui/q:ci	Ljava/lang/String;
    //   597: return
    //   598: aload_0
    //   599: getfield 2255	org/vidogram/ui/q:bY	Ljava/lang/String;
    //   602: astore_3
    //   603: goto -86 -> 517
    //   606: aload_0
    //   607: aload 5
    //   609: iconst_0
    //   610: iconst_0
    //   611: invokevirtual 3397	org/vidogram/ui/q:a	(Ljava/lang/String;ZZ)Z
    //   614: pop
    //   615: return
    //   616: aload 5
    //   618: lconst_0
    //   619: lconst_0
    //   620: iconst_0
    //   621: iconst_0
    //   622: aconst_null
    //   623: aload_0
    //   624: getfield 1029	org/vidogram/ui/q:bq	J
    //   627: aload_0
    //   628: getfield 1267	org/vidogram/ui/q:aY	Lorg/vidogram/messenger/u;
    //   631: aconst_null
    //   632: invokestatic 3400	org/vidogram/messenger/ac:a	(Ljava/lang/String;JJIILorg/vidogram/messenger/af;JLorg/vidogram/messenger/u;Ljava/lang/String;)V
    //   635: aload_0
    //   636: iconst_0
    //   637: aconst_null
    //   638: aconst_null
    //   639: aconst_null
    //   640: iconst_0
    //   641: iconst_1
    //   642: invokevirtual 1272	org/vidogram/ui/q:a	(ZLorg/vidogram/messenger/u;Ljava/util/ArrayList;Lorg/vidogram/tgnet/g$wb;ZZ)V
    //   645: aload_0
    //   646: getfield 1029	org/vidogram/ui/q:bq	J
    //   649: iconst_1
    //   650: invokestatic 1034	org/vidogram/messenger/d/b:a	(JZ)V
    //   653: return
    //   654: iload_1
    //   655: bipush 21
    //   657: if_icmpne +185 -> 842
    //   660: aload_3
    //   661: ifnull +10 -> 671
    //   664: aload_3
    //   665: invokevirtual 3382	android/content/Intent:getData	()Landroid/net/Uri;
    //   668: ifnonnull +8 -> 676
    //   671: aload_0
    //   672: invokespecial 3384	org/vidogram/ui/q:S	()V
    //   675: return
    //   676: aload_3
    //   677: invokevirtual 3382	android/content/Intent:getData	()Landroid/net/Uri;
    //   680: astore 6
    //   682: aload 6
    //   684: invokevirtual 3385	android/net/Uri:toString	()Ljava/lang/String;
    //   687: astore 7
    //   689: aload 6
    //   691: astore 5
    //   693: aload 7
    //   695: ldc_w 3413
    //   698: invokevirtual 3391	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   701: ifeq +51 -> 752
    //   704: aload 7
    //   706: ldc_w 3415
    //   709: invokevirtual 3419	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   712: iconst_1
    //   713: aaload
    //   714: astore 7
    //   716: aload 7
    //   718: ldc_w 3421
    //   721: invokevirtual 3423	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   724: istore_1
    //   725: aload 6
    //   727: astore 5
    //   729: iload_1
    //   730: iconst_m1
    //   731: if_icmpeq +21 -> 752
    //   734: aload 7
    //   736: iconst_0
    //   737: iload_1
    //   738: invokevirtual 2696	java/lang/String:substring	(II)Ljava/lang/String;
    //   741: ldc_w 3425
    //   744: invokestatic 3430	java/net/URLDecoder:decode	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   747: invokestatic 2539	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   750: astore 5
    //   752: aload 5
    //   754: invokestatic 3394	org/vidogram/messenger/a:c	(Landroid/net/Uri;)Ljava/lang/String;
    //   757: astore 5
    //   759: aload 5
    //   761: ifnonnull +328 -> 1089
    //   764: aload_3
    //   765: invokevirtual 3431	android/content/Intent:toString	()Ljava/lang/String;
    //   768: astore 5
    //   770: aload_3
    //   771: invokevirtual 3382	android/content/Intent:getData	()Landroid/net/Uri;
    //   774: ldc_w 3433
    //   777: invokestatic 3436	org/vidogram/messenger/MediaController:a	(Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;
    //   780: astore_3
    //   781: aload_3
    //   782: ifnonnull +25 -> 807
    //   785: aload_0
    //   786: invokespecial 3384	org/vidogram/ui/q:S	()V
    //   789: return
    //   790: astore 5
    //   792: ldc_w 2260
    //   795: aload 5
    //   797: invokestatic 2265	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   800: aload 6
    //   802: astore 5
    //   804: goto -52 -> 752
    //   807: aload_3
    //   808: aload 5
    //   810: aconst_null
    //   811: aconst_null
    //   812: aload_0
    //   813: getfield 1029	org/vidogram/ui/q:bq	J
    //   816: aload_0
    //   817: getfield 1267	org/vidogram/ui/q:aY	Lorg/vidogram/messenger/u;
    //   820: invokestatic 3439	org/vidogram/messenger/ac:a	(Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;JLorg/vidogram/messenger/u;)V
    //   823: aload_0
    //   824: iconst_0
    //   825: aconst_null
    //   826: aconst_null
    //   827: aconst_null
    //   828: iconst_0
    //   829: iconst_1
    //   830: invokevirtual 1272	org/vidogram/ui/q:a	(ZLorg/vidogram/messenger/u;Ljava/util/ArrayList;Lorg/vidogram/tgnet/g$wb;ZZ)V
    //   833: aload_0
    //   834: getfield 1029	org/vidogram/ui/q:bq	J
    //   837: iconst_1
    //   838: invokestatic 1034	org/vidogram/messenger/d/b:a	(JZ)V
    //   841: return
    //   842: iload_1
    //   843: bipush 31
    //   845: if_icmpne -698 -> 147
    //   848: aload_3
    //   849: ifnull +10 -> 859
    //   852: aload_3
    //   853: invokevirtual 3382	android/content/Intent:getData	()Landroid/net/Uri;
    //   856: ifnonnull +8 -> 864
    //   859: aload_0
    //   860: invokespecial 3384	org/vidogram/ui/q:S	()V
    //   863: return
    //   864: aload_3
    //   865: invokevirtual 3382	android/content/Intent:getData	()Landroid/net/Uri;
    //   868: astore_3
    //   869: aload_0
    //   870: invokevirtual 677	org/vidogram/ui/q:l	()Landroid/app/Activity;
    //   873: invokevirtual 3443	android/app/Activity:getContentResolver	()Landroid/content/ContentResolver;
    //   876: aload_3
    //   877: iconst_2
    //   878: anewarray 1118	java/lang/String
    //   881: dup
    //   882: iconst_0
    //   883: ldc_w 3445
    //   886: aastore
    //   887: dup
    //   888: iconst_1
    //   889: ldc_w 3447
    //   892: aastore
    //   893: aconst_null
    //   894: aconst_null
    //   895: aconst_null
    //   896: invokevirtual 3453	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   899: astore 5
    //   901: aload 5
    //   903: ifnull +109 -> 1012
    //   906: iconst_0
    //   907: istore_1
    //   908: aload 5
    //   910: invokeinterface 3458 1 0
    //   915: ifeq +75 -> 990
    //   918: aload 5
    //   920: iconst_0
    //   921: invokeinterface 3462 2 0
    //   926: astore_3
    //   927: aload 5
    //   929: iconst_1
    //   930: invokeinterface 3462 2 0
    //   935: astore 6
    //   937: new 627	org/vidogram/tgnet/g$vw
    //   940: dup
    //   941: invokespecial 3463	org/vidogram/tgnet/g$vw:<init>	()V
    //   944: astore 7
    //   946: aload 7
    //   948: aload_3
    //   949: putfield 1005	org/vidogram/tgnet/g$vw:e	Ljava/lang/String;
    //   952: aload 7
    //   954: ldc_w 1024
    //   957: putfield 1402	org/vidogram/tgnet/g$vw:f	Ljava/lang/String;
    //   960: aload 7
    //   962: aload 6
    //   964: putfield 1116	org/vidogram/tgnet/g$vw:i	Ljava/lang/String;
    //   967: invokestatic 1731	org/vidogram/messenger/ac:a	()Lorg/vidogram/messenger/ac;
    //   970: aload 7
    //   972: aload_0
    //   973: getfield 1029	org/vidogram/ui/q:bq	J
    //   976: aload_0
    //   977: getfield 1267	org/vidogram/ui/q:aY	Lorg/vidogram/messenger/u;
    //   980: aconst_null
    //   981: aconst_null
    //   982: invokevirtual 3466	org/vidogram/messenger/ac:a	(Lorg/vidogram/tgnet/g$vw;JLorg/vidogram/messenger/u;Lorg/vidogram/tgnet/g$bb;Ljava/util/HashMap;)V
    //   985: iconst_1
    //   986: istore_1
    //   987: goto -79 -> 908
    //   990: iload_1
    //   991: ifeq +21 -> 1012
    //   994: aload_0
    //   995: iconst_0
    //   996: aconst_null
    //   997: aconst_null
    //   998: aconst_null
    //   999: iconst_0
    //   1000: iconst_1
    //   1001: invokevirtual 1272	org/vidogram/ui/q:a	(ZLorg/vidogram/messenger/u;Ljava/util/ArrayList;Lorg/vidogram/tgnet/g$wb;ZZ)V
    //   1004: aload_0
    //   1005: getfield 1029	org/vidogram/ui/q:bq	J
    //   1008: iconst_1
    //   1009: invokestatic 1034	org/vidogram/messenger/d/b:a	(JZ)V
    //   1012: aload 5
    //   1014: ifnull -867 -> 147
    //   1017: aload 5
    //   1019: invokeinterface 3469 1 0
    //   1024: ifne -877 -> 147
    //   1027: aload 5
    //   1029: invokeinterface 3472 1 0
    //   1034: return
    //   1035: astore_3
    //   1036: ldc_w 2260
    //   1039: aload_3
    //   1040: invokestatic 2265	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   1043: return
    //   1044: astore_3
    //   1045: aconst_null
    //   1046: astore 5
    //   1048: aload 5
    //   1050: ifnull +20 -> 1070
    //   1053: aload 5
    //   1055: invokeinterface 3469 1 0
    //   1060: ifne +10 -> 1070
    //   1063: aload 5
    //   1065: invokeinterface 3472 1 0
    //   1070: aload_3
    //   1071: athrow
    //   1072: astore 5
    //   1074: ldc_w 2260
    //   1077: aload 5
    //   1079: invokestatic 2265	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   1082: goto -12 -> 1070
    //   1085: astore_3
    //   1086: goto -38 -> 1048
    //   1089: aload 5
    //   1091: astore_3
    //   1092: goto -311 -> 781
    //
    // Exception table:
    //   from	to	target	type
    //   29	49	168	java/lang/Exception
    //   222	227	274	java/lang/Exception
    //   704	725	790	java/lang/Exception
    //   734	752	790	java/lang/Exception
    //   1017	1034	1035	java/lang/Exception
    //   869	901	1044	finally
    //   1053	1070	1072	java/lang/Exception
    //   908	985	1085	finally
    //   994	1012	1085	finally
  }

  public void a(int paramInt, Object[] paramArrayOfObject)
  {
    if (paramInt == y.g)
      if (((Integer)paramArrayOfObject[10]).intValue() == this.e)
      {
        if (!this.bk)
          y.a().a(new int[] { y.n, y.c, y.d, y.V });
        paramInt = ((Integer)paramArrayOfObject[11]).intValue();
        paramInt = this.bw.indexOf(Integer.valueOf(paramInt));
        if (paramInt != -1);
      }
      else
      {
        return;
        break label11487;
      }
    label92: Object localObject2;
    label149: boolean bool1;
    int i2;
    int i5;
    int i7;
    int i6;
    label314: label336: int i1;
    label451: label591: int i3;
    label519: label548: label554: label575: Object localObject3;
    int i4;
    label1014: boolean bool2;
    Object localObject1;
    label1416: label1429: label1515: label1524: label1914: int i8;
    label1742: label2008: label2166: int i9;
    label2092: label2292: label2550: int i13;
    label2189: label2332: label2338: label2495: label2511: label2536: label2543: int i10;
    label2461: label2598: label2603: label2612: label2618: label2624: label2630: label2641: label4064: label4707: label5741: label6126: label6138: long l1;
    while (true)
    {
      this.bw.remove(paramInt);
      localObject2 = (ArrayList)paramArrayOfObject[2];
      if (this.aQ)
      {
        paramInt = 0;
        while (true)
        {
          if (paramInt >= ((ArrayList)localObject2).size())
            break label12501;
          if (((u)((ArrayList)localObject2).get(paramInt)).q() == this.bM)
          {
            paramInt = 1;
            if (paramInt != 0)
              break;
            this.bM = 0;
            return;
          }
          paramInt += 1;
        }
        paramInt = this.bM;
        bool1 = this.bN;
        J();
        this.bM = paramInt;
        this.bN = bool1;
      }
      this.bJ += 1;
      boolean bool4;
      if (((Long)paramArrayOfObject[0]).longValue() == this.bq)
      {
        i2 = 0;
        i5 = ((Integer)paramArrayOfObject[1]).intValue();
        bool4 = ((Boolean)paramArrayOfObject[3]).booleanValue();
        paramInt = ((Integer)paramArrayOfObject[4]).intValue();
        i7 = ((Integer)paramArrayOfObject[7]).intValue();
        i6 = ((Integer)paramArrayOfObject[8]).intValue();
        if (paramInt == 0)
          break label519;
        this.bS = paramInt;
        this.bK = ((Integer)paramArrayOfObject[5]).intValue();
        this.bR = ((Integer)paramArrayOfObject[6]).intValue();
        paramArrayOfObject = this.bG;
        if ((this.bM != 0) || (this.bK != 0))
          break label548;
        bool1 = true;
        paramArrayOfObject[i2] = bool1;
        if (((i6 == 1) || (i6 == 3)) && (i2 == 1))
        {
          paramArrayOfObject = this.bE;
          this.bF[0] = true;
          paramArrayOfObject[0] = 1;
          this.bG[0] = false;
          this.bB[0] = 0;
        }
        if ((this.bJ == 1) && (((ArrayList)localObject2).size() > 20))
          this.bJ += 1;
        if (!this.bI)
          break label591;
        if (this.bG[i2] != 0)
          break label575;
        this.m.clear();
        this.bz.clear();
        paramInt = 0;
        if (paramInt >= 2)
          break label575;
        this.by[paramInt].clear();
        if (this.k != null)
          break label554;
        this.bA[paramInt] = 2147483647;
        this.bB[paramInt] = -2147483648;
      }
      while (true)
      {
        this.bC[paramInt] = -2147483648;
        this.bD[paramInt] = 0;
        paramInt += 1;
        break label451;
        i2 = 1;
        break;
        if ((this.bM == 0) || (i6 != 3))
          break label314;
        this.bK = ((Integer)paramArrayOfObject[5]).intValue();
        break label314;
        bool1 = false;
        break label336;
        this.bA[paramInt] = -2147483648;
        this.bB[paramInt] = 2147483647;
      }
      this.bI = false;
      org.vidogram.messenger.a.a(new Runnable()
      {
        public void run()
        {
          if (q.bb(q.this) != null)
            q.bc(q.this).g();
        }
      });
      if (i6 == 1)
        Collections.reverse((List)localObject2);
      if (this.k == null)
        org.vidogram.messenger.d.c.a((ArrayList)localObject2, this.bq);
      i1 = 0;
      paramInt = 0;
      bool1 = false;
      i3 = 0;
      while (i3 < ((ArrayList)localObject2).size())
      {
        localObject3 = (u)((ArrayList)localObject2).get(i3);
        i4 = ((u)localObject3).C() + i1;
        if (this.j != null)
        {
          if (this.j.n)
            ((u)localObject3).a.n = true;
          if ((this.j.r) && (((u)localObject3).j()))
            ((u)localObject3).o();
        }
        if (this.by[i2].containsKey(Integer.valueOf(((u)localObject3).q())))
        {
          i3 += 1;
          i1 = i4;
          continue;
        }
        if (i2 == 1)
          ((u)localObject3).o();
        if ((i2 == 0) && (org.vidogram.messenger.e.d(this.i)) && (((u)localObject3).q() == 1))
        {
          this.bE[i2] = true;
          this.bF[i2] = true;
        }
        if (((u)localObject3).q() > 0)
        {
          this.bA[i2] = Math.min(((u)localObject3).q(), this.bA[i2]);
          this.bB[i2] = Math.max(((u)localObject3).q(), this.bB[i2]);
        }
        while (true)
        {
          if (((u)localObject3).a.e != 0)
          {
            this.bC[i2] = Math.max(this.bC[i2], ((u)localObject3).a.e);
            if ((this.bD[i2] == 0) || (((u)localObject3).a.e < this.bD[i2]))
              this.bD[i2] = ((u)localObject3).a.e;
          }
          i1 = paramInt;
          bool3 = bool1;
          if (((u)localObject3).f < 0)
            break label1515;
          if ((i2 != 1) || (!(((u)localObject3).a.f instanceof g.mr)))
            break label1014;
          break;
          if (this.k == null)
            continue;
          this.bA[i2] = Math.max(((u)localObject3).q(), this.bA[i2]);
          this.bB[i2] = Math.min(((u)localObject3).q(), this.bB[i2]);
        }
        bool2 = bool1;
        if (!((u)localObject3).j())
        {
          bool2 = bool1;
          if (((u)localObject3).m())
            bool2 = true;
        }
        this.by[i2].put(Integer.valueOf(((u)localObject3).q()), localObject3);
        localObject1 = (ArrayList)this.bz.get(((u)localObject3).h);
        paramArrayOfObject = localObject1;
        i1 = paramInt;
        if (localObject1 == null)
        {
          paramArrayOfObject = new ArrayList();
          this.bz.put(((u)localObject3).h, paramArrayOfObject);
          localObject1 = new g.ar();
          ((g.ar)localObject1).i = org.vidogram.messenger.r.a(((u)localObject3).a.e);
          ((g.ar)localObject1).b = 0;
          ((g.ar)localObject1).e = ((u)localObject3).a.e;
          localObject1 = new u((g.ar)localObject1, null, false);
          ((u)localObject1).f = 10;
          ((u)localObject1).g = 1;
          if (i6 != 1)
            break label1416;
          this.m.add(0, localObject1);
        }
        while (true)
        {
          i1 = paramInt + 1;
          paramInt = i1 + 1;
          if (i6 == 1)
          {
            paramArrayOfObject.add(localObject3);
            this.m.add(0, localObject3);
          }
          if (i6 != 1)
          {
            paramArrayOfObject.add(localObject3);
            this.m.add(this.m.size() - 1, localObject3);
          }
          if (((u)localObject3).q() == this.bK)
            this.bG[i2] = true;
          if ((i6 != 2) || (((u)localObject3).q() != this.bS))
            break label1429;
          if (i4 <= org.vidogram.messenger.a.c.y / 2)
          {
            i1 = paramInt;
            bool3 = bool2;
            if (this.bG[0] != 0)
              break label1515;
          }
          paramArrayOfObject = new g.ar();
          paramArrayOfObject.i = "";
          paramArrayOfObject.b = 0;
          paramArrayOfObject = new u(paramArrayOfObject, null, false);
          paramArrayOfObject.f = 6;
          paramArrayOfObject.g = 2;
          this.m.add(this.m.size() - 1, paramArrayOfObject);
          this.bU = paramArrayOfObject;
          this.bV = this.bU;
          this.bX = -10000;
          paramInt += 1;
          bool1 = bool2;
          break;
          this.m.add(localObject1);
        }
        i1 = paramInt;
        boolean bool3 = bool2;
        if (i6 == 3)
        {
          i1 = paramInt;
          bool3 = bool2;
          if (((u)localObject3).q() == this.bM)
            if (!this.bN)
              break label1524;
        }
        for (this.bW = ((u)localObject3).q(); ; this.bW = 2147483647)
        {
          this.bV = ((u)localObject3);
          this.bM = 0;
          i1 = paramInt;
          bool3 = bool2;
          if (this.bX == -10000)
          {
            this.bX = -9000;
            bool3 = bool2;
            i1 = paramInt;
          }
          paramInt = i1;
          bool1 = bool3;
          break;
        }
      }
      if ((i6 == 0) && (paramInt == 0))
        this.bJ -= 1;
      if ((this.bG[i2] != 0) && (i2 != 1))
      {
        this.bS = 0;
        this.bK = 0;
      }
      if ((this.bJ <= 2) && (!bool4))
        V();
      if (i6 == 1)
      {
        i1 = paramInt;
        if (((ArrayList)localObject2).size() != i5)
        {
          i1 = paramInt;
          if (!bool4)
          {
            this.bG[i2] = true;
            i1 = paramInt;
            if (i2 != 1)
            {
              this.bS = 0;
              this.bK = 0;
              this.G.d(this.G.a() - 1);
              i1 = paramInt - 1;
            }
            this.bM = 0;
          }
        }
        if (i1 > 0)
        {
          i3 = this.F.n();
          paramInt = 0;
          if (i3 == this.F.D() - 1)
            break label1914;
          i3 = -1;
          this.G.c(this.G.a() - 1, i1);
          if (i3 != -1)
            this.F.a(i3, paramInt);
        }
        this.bT = false;
        if ((this.bQ) && (this.m.size() > 0))
        {
          if (i2 == 0)
            org.vidogram.messenger.a.a(new Runnable(((u)this.m.get(0)).q(), i7, bool1)
            {
              public void run()
              {
                if (q.bd(q.this) != 0)
                {
                  org.vidogram.messenger.v.a().a(q.o(q.this), this.a, q.bd(q.this), this.b, this.c, false);
                  return;
                }
                org.vidogram.messenger.v.a().a(q.o(q.this), this.a, q.be(q.this)[0], q.bf(q.this)[0], this.c, false);
              }
            }
            , 700L);
          this.bQ = false;
        }
        if ((this.m.isEmpty()) && (this.k == null) && (this.j != null) && (this.j.r) && (this.ca == null))
        {
          this.ca = "";
          U();
        }
        if ((i1 != 0) || (this.k == null) || (this.bE[0] != 0))
          break label2725;
        this.bQ = true;
        if (this.E != null)
          this.E.setEmptyView(null);
        if (this.J != null)
          this.J.setVisibility(4);
      }
      while (true)
      {
        d(false);
        return;
        paramArrayOfObject = this.F.c(i3);
        if (paramArrayOfObject == null);
        for (paramInt = 0; ; paramInt = paramArrayOfObject.getTop())
        {
          paramInt -= this.E.getPaddingTop();
          break;
        }
        if ((((ArrayList)localObject2).size() < i5) && (i6 != 3))
        {
          if (!bool4)
            break label2292;
          if ((this.k != null) || (this.bs))
            this.bE[i2] = true;
          if (i6 != 2)
            this.bF[i2] = true;
        }
        this.bH = false;
        if (this.E != null)
        {
          if ((this.bQ) || (this.bn) || (this.bo))
          {
            this.bo = false;
            this.G.c();
            if (this.bV != null)
              if (this.bX == -9000)
              {
                i1 = Math.max(0, (this.E.getHeight() - this.bV.C()) / 2);
                if (!this.m.isEmpty())
                {
                  if ((this.m.get(this.m.size() - 1) != this.bV) && (this.m.get(this.m.size() - 2) != this.bV))
                    break label2338;
                  paramArrayOfObject = this.F;
                  if (!a.a(this.G))
                    break label2332;
                  i3 = 1;
                  paramArrayOfObject.a(i3, i1 + (-this.E.getPaddingTop() - org.vidogram.messenger.a.a(7.0F)));
                }
                this.E.invalidate();
                if ((this.bX == -10000) || (this.bX == -9000))
                  c(true, true);
                this.bX = -10000;
                this.bV = null;
              }
          }
          do
          {
            do
            {
              while (true)
              {
                if (this.ba)
                {
                  this.bn = true;
                  if (this.bV != null)
                    this.bp = true;
                }
                i1 = paramInt;
                if (!this.bQ)
                  break;
                i1 = paramInt;
                if (this.E == null)
                  break;
                this.E.setEmptyView(this.J);
                i1 = paramInt;
                break;
                if (i6 == 2)
                  break label2008;
                this.bE[i2] = true;
                break label2008;
                if (this.bX == -10000)
                {
                  i1 = 0;
                  break label2092;
                }
                i1 = this.bX;
                break label2092;
                i3 = 0;
                break label2166;
                this.F.a(a.c(this.G) + this.m.size() - this.m.indexOf(this.bV) - 1, i1 + (-this.E.getPaddingTop() - org.vidogram.messenger.a.a(7.0F)));
                break label2189;
                I();
              }
              if (paramInt == 0)
                break label2641;
              i3 = 0;
              i1 = i3;
              if (this.bE[i2] != 0)
                if ((i2 != 0) || (this.bL != 0L))
                {
                  i1 = i3;
                  if (i2 != 1);
                }
                else
                {
                  paramArrayOfObject = this.G;
                  if (!a.a(this.G))
                    break label2598;
                  i1 = 1;
                  paramArrayOfObject.a(i1, 2);
                  i1 = 1;
                }
              i8 = this.F.n();
              paramArrayOfObject = this.F.c(i8);
              if (paramArrayOfObject != null)
                break label2603;
              i3 = 0;
              i9 = this.E.getPaddingTop();
              if (i1 == 0)
                break label2612;
              i4 = 1;
              if (paramInt - i4 <= 0)
                continue;
              paramArrayOfObject = this.G;
              if (!a.a(this.G))
                break label2618;
              i4 = 2;
              if (i1 == 0)
                break label2624;
              i5 = 0;
              if (i1 == 0)
                break label2630;
              i6 = 1;
              paramArrayOfObject.c(i4 + i5, paramInt - i6);
            }
            while (i8 == -1);
            paramArrayOfObject = this.F;
            if (i1 != 0);
            for (i1 = 1; ; i1 = 0)
            {
              paramArrayOfObject.a(i8 + paramInt - i1, i3 - i9);
              break;
              i1 = 0;
              break label2461;
              i3 = paramArrayOfObject.getTop();
              break label2495;
              i4 = 0;
              break label2511;
              i4 = 1;
              break label2536;
              i5 = 1;
              break label2543;
              i6 = 0;
              break label2550;
            }
          }
          while ((this.bE[i2] == 0) || (((i2 != 0) || (this.bL != 0L)) && (i2 != 1)));
          paramArrayOfObject = this.G;
          if (a.a(this.G));
          for (i1 = 1; ; i1 = 0)
          {
            paramArrayOfObject.d(i1);
            break;
          }
        }
        this.bn = true;
        i1 = paramInt;
        if (this.bV == null)
          break label1742;
        this.bp = true;
        i1 = paramInt;
        break label1742;
        label2725: if (this.t == null)
          continue;
        this.t.setVisibility(4);
      }
      if (paramInt == y.at)
      {
        if (this.E != null)
          this.E.s();
        if (this.ad != null)
          this.ad.invalidate();
        if (this.aB != null)
          this.aB.invalidate();
        if (this.ay != null)
          this.ay.invalidate();
        if (this.ah == null)
          continue;
        this.ah.s();
        return;
      }
      if (paramInt == y.b)
      {
        i2 = ((Integer)paramArrayOfObject[0]).intValue();
        if (((i2 & 0x1) != 0) || ((i2 & 0x10) != 0))
        {
          if (this.i == null)
            break label3080;
          paramArrayOfObject = org.vidogram.messenger.v.a().b(Integer.valueOf(this.i.h));
          if (paramArrayOfObject != null)
            this.i = paramArrayOfObject;
        }
        while (true)
        {
          O();
          paramInt = 0;
          if (((i2 & 0x20) != 0) || ((i2 & 0x4) != 0))
          {
            if ((this.i != null) && (this.M != null))
              this.M.e();
            paramInt = 1;
          }
          if (((i2 & 0x2) != 0) || ((i2 & 0x8) != 0) || ((i2 & 0x1) != 0))
          {
            R();
            ac();
          }
          if ((i2 & 0x40) != 0)
            paramInt = 1;
          i1 = paramInt;
          if ((i2 & 0x2000) != 0)
          {
            i1 = paramInt;
            if (org.vidogram.messenger.e.d(this.i))
            {
              paramArrayOfObject = org.vidogram.messenger.v.a().b(Integer.valueOf(this.i.h));
              if (paramArrayOfObject == null)
                break;
              this.i = paramArrayOfObject;
              paramInt = 1;
              U();
              i1 = paramInt;
              if (this.l != null)
              {
                this.l.setDialogId(this.bq);
                i1 = paramInt;
              }
            }
          }
          if ((this.M != null) && (i1 != 0))
            this.M.c();
          if ((i2 & 0x80) == 0)
            break;
          W();
          return;
          label3080: if (this.j == null)
            continue;
          paramArrayOfObject = org.vidogram.messenger.v.a().a(Integer.valueOf(this.j.d));
          if (paramArrayOfObject == null)
            continue;
          this.j = paramArrayOfObject;
        }
      }
      if (paramInt == y.a)
      {
        if (((Long)paramArrayOfObject[0]).longValue() != this.bq)
          continue;
        localObject3 = (ArrayList)paramArrayOfObject[1];
        if ((this.k != null) && (((ArrayList)localObject3).size() == 1))
        {
          paramArrayOfObject = (u)((ArrayList)localObject3).get(0);
          if ((this.k != null) && (paramArrayOfObject.j()) && (paramArrayOfObject.a.f != null) && ((paramArrayOfObject.a.f instanceof g.ne)) && ((paramArrayOfObject.a.f.d instanceof g.gu)) && (l() != null) && (org.vidogram.messenger.a.c(this.k.o) < 17) && (this.k.n > 0) && (this.k.n <= 60))
          {
            paramArrayOfObject = new AlertDialog.Builder(l());
            paramArrayOfObject.setTitle(org.vidogram.messenger.r.a("AppName", 2131230856));
            paramArrayOfObject.setPositiveButton(org.vidogram.messenger.r.a("OK", 2131231604), null);
            paramArrayOfObject.setMessage(org.vidogram.messenger.r.a("CompatibilityChat", 2131231075, new Object[] { this.j.e, this.j.e }));
            b(paramArrayOfObject.create());
          }
        }
        if ((this.i != null) || (this.cb != 0L))
        {
          paramInt = 0;
          if (paramInt < ((ArrayList)localObject3).size())
          {
            paramArrayOfObject = (u)((ArrayList)localObject3).get(paramInt);
            if (this.i != null)
              if ((((paramArrayOfObject.a.f instanceof g.mn)) && (paramArrayOfObject.a.f.i == org.vidogram.messenger.ad.c())) || (((paramArrayOfObject.a.f instanceof g.mj)) && (paramArrayOfObject.a.f.e.contains(Integer.valueOf(org.vidogram.messenger.ad.c())))))
              {
                paramArrayOfObject = org.vidogram.messenger.v.a().b(Integer.valueOf(this.i.h));
                if (paramArrayOfObject != null)
                {
                  this.i = paramArrayOfObject;
                  M();
                  U();
                  if (this.M != null)
                    this.M.c();
                }
              }
            do
              while (true)
              {
                paramInt += 1;
                break;
                if ((paramArrayOfObject.a.g == 0) || (paramArrayOfObject.e != null))
                  continue;
                paramArrayOfObject.e = ((u)this.by[0].get(Integer.valueOf(paramArrayOfObject.a.g)));
                if ((paramArrayOfObject.a.f instanceof g.mz))
                {
                  paramArrayOfObject.a(null, null);
                  continue;
                }
                if (!(paramArrayOfObject.a.f instanceof g.mu))
                  continue;
                paramArrayOfObject.a(null);
              }
            while ((this.cb == 0L) || (paramArrayOfObject.a.r == null));
            i1 = 0;
            label3629: if (i1 < paramArrayOfObject.a.r.b.size())
            {
              localObject1 = (g.mc)paramArrayOfObject.a.r.b.get(i1);
              i2 = 0;
            }
            while (true)
            {
              if (i2 < ((g.mc)localObject1).c.size())
              {
                localObject2 = (g.aq)((g.mc)localObject1).c.get(i2);
                if ((localObject2 instanceof g.md))
                  a((g.md)localObject2);
              }
              else
              {
                i1 += 1;
                break label3629;
                break;
              }
              i2 += 1;
            }
          }
        }
        if (this.bG[0] == 0)
        {
          i5 = -2147483648;
          paramInt = -2147483648;
          if (this.k != null)
            paramInt = 2147483647;
          i3 = paramInt;
          i2 = 0;
          paramInt = 0;
          i1 = 0;
          i9 = 0;
          while (i9 < ((ArrayList)localObject3).size())
          {
            localObject1 = (u)((ArrayList)localObject3).get(i9);
            if ((this.j != null) && (this.j.r) && (((u)localObject1).j()))
              ((u)localObject1).o();
            if ((this.M != null) && (this.k != null) && (((u)localObject1).a.f != null) && ((((u)localObject1).a.f instanceof g.ne)) && ((((u)localObject1).a.f.d instanceof g.gu)))
              this.M.setTime(((g.gu)((u)localObject1).a.f.d).b);
            if ((((u)localObject1).a.f instanceof g.mr))
            {
              localObject2 = new Bundle();
              ((Bundle)localObject2).putInt("chat_id", ((u)localObject1).a.f.f);
              if (this.c.e.size() > 0);
              for (paramArrayOfObject = (org.vidogram.ui.a.g)this.c.e.get(this.c.e.size() - 1); ; paramArrayOfObject = null)
              {
                org.vidogram.messenger.a.a(new Runnable(paramArrayOfObject, (Bundle)localObject2, ((u)localObject1).a.f.f)
                {
                  public void run()
                  {
                    org.vidogram.ui.a.b localb = q.bg(q.this);
                    if (this.a != null)
                      y.a().b(this.a, y.d);
                    y.a().a(y.d, new Object[0]);
                    localb.a(new q(this.b), true);
                    org.vidogram.messenger.a.a(new Runnable()
                    {
                      public void run()
                      {
                        org.vidogram.messenger.v.a().a(q.61.this.c, 0, true);
                      }
                    }
                    , 1000L);
                  }
                });
                return;
              }
            }
            if ((this.i == null) || (!this.i.r) || ((!(((u)localObject1).a.f instanceof g.mj)) && (!(((u)localObject1).a.f instanceof g.mn))))
              break label12494;
            i4 = 1;
            if ((((u)localObject1).j()) && (((u)localObject1).v()))
            {
              e(false);
              return;
            }
            i8 = i1;
            i7 = i3;
            i6 = i5;
            if (((u)localObject1).f < 0)
              break label12478;
            if (this.by[0].containsKey(Integer.valueOf(((u)localObject1).q())))
            {
              i6 = i1;
              i2 = i3;
              i1 = paramInt;
              paramInt = i6;
              label4137: i9 += 1;
              i6 = i1;
              i1 = paramInt;
              i3 = i2;
              i2 = i4;
              paramInt = i6;
              continue;
            }
            ((u)localObject1).e();
            i5 = Math.max(i5, ((u)localObject1).a.e);
            if (((u)localObject1).q() > 0)
            {
              i2 = Math.max(((u)localObject1).q(), i3);
              this.bK = Math.max(this.bK, ((u)localObject1).q());
            }
            while (true)
            {
              i3 = i1;
              if (!((u)localObject1).j())
              {
                i3 = i1;
                if (((u)localObject1).m())
                {
                  this.bR += 1;
                  i3 = 1;
                }
              }
              if (((u)localObject1).f != 10)
              {
                i8 = i3;
                i7 = i2;
                i6 = i5;
                if (((u)localObject1).f != 11)
                  break label12478;
              }
              paramInt = i3;
              i1 = 1;
              break;
              i2 = i3;
              if (this.k == null)
                continue;
              i2 = Math.min(((u)localObject1).q(), i3);
              this.bK = Math.min(this.bK, ((u)localObject1).q());
            }
          }
          if (i1 != 0)
          {
            if (this.ba)
            {
              this.bc = true;
              this.bl = i5;
              this.bm = i3;
            }
          }
          else
            label4364: ac();
        }
        while (true)
        {
          if ((!this.m.isEmpty()) && (this.ca != null) && (this.ca.length() == 0))
          {
            this.ca = null;
            U();
          }
          if (paramInt != 0)
          {
            O();
            R();
          }
          if (i2 == 0)
            break;
          org.vidogram.messenger.v.a().a(this.i.h, 0, true);
          return;
          if (this.m.size() <= 0)
            break label4364;
          org.vidogram.messenger.v.a().a(this.bq, ((u)this.m.get(0)).q(), i3, i5, true, false);
          break label4364;
          i7 = 0;
          i2 = 1;
          i13 = this.m.size();
          i8 = 0;
          paramArrayOfObject = null;
          int i12 = 0;
          i5 = 0;
          i1 = 0;
          i4 = -1;
          i3 = 0;
          if (i12 < ((ArrayList)localObject3).size())
          {
            u localu = (u)((ArrayList)localObject3).get(i12);
            paramInt = i4;
            if (i12 == 0)
            {
              if (localu.a.b >= 0)
                break label4707;
              paramInt = 0;
            }
            while (true)
            {
              if ((this.j != null) && (this.j.r) && (localu.j()))
                localu.o();
              if ((this.M != null) && (this.k != null) && (localu.a.f != null) && ((localu.a.f instanceof g.ne)) && ((localu.a.f.d instanceof g.gu)))
                this.M.setTime(((g.gu)localu.a.f.d).b);
              if (localu.f < 0)
                break label12436;
              if (!this.by[0].containsKey(Integer.valueOf(localu.q())))
                break label4875;
              label4695: i12 += 1;
              i4 = paramInt;
              break;
              if (!this.m.isEmpty())
              {
                i6 = this.m.size();
                paramInt = 0;
                while (true)
                {
                  if (paramInt >= i6)
                    break label12439;
                  localObject1 = (u)this.m.get(paramInt);
                  if ((((u)localObject1).f >= 0) && (((u)localObject1).a.e > 0))
                    if ((((u)localObject1).a.b > 0) && (localu.a.b > 0))
                    {
                      if (((u)localObject1).a.b >= localu.a.b);
                    }
                    else
                      label4807: 
                      do
                      {
                        if (paramInt != -1)
                        {
                          i4 = paramInt;
                          if (paramInt <= this.m.size());
                        }
                        else
                        {
                          i4 = this.m.size();
                        }
                        paramInt = i4;
                        break;
                      }
                      while (((u)localObject1).a.e < localu.a.e);
                  paramInt += 1;
                }
              }
              paramInt = 0;
            }
            label4875: localObject1 = paramArrayOfObject;
            if (this.k != null)
            {
              localObject1 = paramArrayOfObject;
              if ((localu.a.j instanceof g.oi))
              {
                localObject1 = paramArrayOfObject;
                if ((localu.a.j.r instanceof g.vs))
                {
                  localObject1 = paramArrayOfObject;
                  if (paramArrayOfObject == null)
                    localObject1 = new HashMap();
                  localObject2 = (ArrayList)((HashMap)localObject1).get(localu.a.j.r.e);
                  paramArrayOfObject = localObject2;
                  if (localObject2 == null)
                  {
                    paramArrayOfObject = new ArrayList();
                    ((HashMap)localObject1).put(localu.a.j.r.e, paramArrayOfObject);
                  }
                  paramArrayOfObject.add(localu);
                }
              }
            }
            localu.e();
            if ((localu.a.f instanceof g.mr))
            {
              localObject1 = new Bundle();
              ((Bundle)localObject1).putInt("chat_id", localu.a.f.f);
              if (this.c.e.size() > 0);
              for (paramArrayOfObject = (org.vidogram.ui.a.g)this.c.e.get(this.c.e.size() - 1); ; paramArrayOfObject = null)
              {
                org.vidogram.messenger.a.a(new Runnable(paramArrayOfObject, (Bundle)localObject1, localu.a.f.f)
                {
                  public void run()
                  {
                    org.vidogram.ui.a.b localb = q.bh(q.this);
                    if (this.a != null)
                      y.a().b(this.a, y.d);
                    y.a().a(y.d, new Object[0]);
                    localb.a(new q(this.b), true);
                    org.vidogram.messenger.a.a(new Runnable()
                    {
                      public void run()
                      {
                        org.vidogram.messenger.v.a().a(q.62.this.c, 0, true);
                      }
                    }
                    , 1000L);
                  }
                });
                return;
              }
            }
            if ((this.i == null) || (!this.i.r) || ((!(localu.a.f instanceof g.mj)) && (!(localu.a.f instanceof g.mn))))
              break label12475;
            i3 = 1;
            label5172: if ((this.bD[0] == 0) || (localu.a.e < this.bD[0]))
              this.bD[0] = localu.a.e;
            i9 = i5;
            if (localu.j())
            {
              T();
              i9 = 1;
            }
            if (localu.q() > 0)
            {
              this.bA[0] = Math.min(localu.q(), this.bA[0]);
              this.bB[0] = Math.max(localu.q(), this.bB[0]);
            }
            while (true)
            {
              this.bC[0] = Math.max(this.bC[0], localu.a.e);
              this.by[0].put(Integer.valueOf(localu.q()), localu);
              localObject2 = (ArrayList)this.bz.get(localu.h);
              paramArrayOfObject = localObject2;
              i6 = i8;
              if (localObject2 == null)
              {
                paramArrayOfObject = new ArrayList();
                this.bz.put(localu.h, paramArrayOfObject);
                localObject2 = new g.ar();
                ((g.ar)localObject2).i = org.vidogram.messenger.r.a(localu.a.e);
                ((g.ar)localObject2).b = 0;
                ((g.ar)localObject2).e = localu.a.e;
                localObject2 = new u((g.ar)localObject2, null, false);
                ((u)localObject2).f = 10;
                ((u)localObject2).g = 1;
                this.m.add(paramInt, localObject2);
                i6 = i8 + 1;
              }
              int i11 = i6;
              i10 = paramInt;
              i8 = i2;
              if (localu.j())
                break label12461;
              i4 = i6;
              i5 = paramInt;
              i10 = i2;
              if (this.ba)
              {
                i4 = i6;
                i5 = paramInt;
                i10 = i2;
                if (paramInt == 0)
                {
                  i8 = paramInt;
                  if (!this.bp)
                  {
                    i8 = paramInt;
                    if (this.bU != null)
                    {
                      g(this.bU);
                      i8 = paramInt;
                      if (paramInt > 0)
                        i8 = paramInt - 1;
                      this.bU = null;
                    }
                  }
                  i4 = i6;
                  i5 = i8;
                  i10 = i2;
                  if (this.bU == null)
                  {
                    localObject2 = new g.ar();
                    ((g.ar)localObject2).i = "";
                    ((g.ar)localObject2).b = 0;
                    localObject2 = new u((g.ar)localObject2, null, false);
                    ((u)localObject2).f = 6;
                    ((u)localObject2).g = 2;
                    this.m.add(0, localObject2);
                    this.bU = ((u)localObject2);
                    this.bV = this.bU;
                    this.bX = -10000;
                    i10 = 0;
                    this.bR = 0;
                    this.bp = true;
                    i4 = i6 + 1;
                    i5 = i8;
                  }
                }
              }
              i2 = i10;
              if (this.bU != null)
              {
                this.bR += 1;
                i2 = 1;
              }
              i11 = i4;
              i10 = i5;
              i8 = i2;
              if (!localu.m())
                break label12461;
              if (!this.ba)
                localu.o();
              paramInt = 1;
              i11 = i4;
              paramArrayOfObject.add(0, localu);
              i4 = i5;
              if (i5 > this.m.size())
                i4 = this.m.size();
              this.m.add(i4, localu);
              i8 = i11 + 1;
              this.bx += 1;
              if ((localu.f != 10) && (localu.f != 11))
                break label12445;
              i1 = 1;
              i7 = paramInt;
              paramArrayOfObject = localObject1;
              i5 = i9;
              paramInt = i4;
              break;
              if (this.k == null)
                continue;
              this.bA[0] = Math.max(localu.q(), this.bA[0]);
              this.bB[0] = Math.min(localu.q(), this.bB[0]);
            }
          }
          if (paramArrayOfObject != null)
            org.vidogram.messenger.v.a().a(this.bq, paramArrayOfObject);
          if (this.t != null)
            this.t.setVisibility(4);
          if (this.G != null)
          {
            if (i2 != 0)
              this.G.a(this.bU);
            if (i8 != 0)
              this.G.c(this.G.a() - i4, i8);
            label5965: if ((this.E == null) || (this.G == null))
              break label6196;
            i2 = this.F.n();
            paramInt = i2;
            if (i2 == -1)
              paramInt = 0;
            i2 = paramInt;
            if (this.bE[0] != 0)
              i2 = paramInt + 1;
            if (!a.a(this.G))
              break label12430;
            paramInt = i13 + 1;
            label6031: if ((i2 < paramInt) && (i5 == 0))
              break label6138;
            this.bx = 0;
            if (!this.bI)
            {
              if (!this.ba)
                break label6126;
              this.bn = true;
            }
          }
          while (true)
          {
            i2 = i3;
            paramInt = i1;
            if (i7 == 0)
              break;
            if (!this.ba)
              break label6204;
            this.bc = true;
            this.bl = this.bC[0];
            this.bm = this.bB[0];
            i2 = i3;
            paramInt = i1;
            break;
            this.bn = true;
            break label5965;
            this.bo = true;
            I();
            continue;
            if ((this.bx != 0) && (this.aa != null))
            {
              this.aa.setVisibility(0);
              this.aa.setText(String.format("%d", new Object[] { Integer.valueOf(this.bx) }));
            }
            c(true, true);
            continue;
            label6196: this.bn = true;
          }
          label6204: org.vidogram.messenger.v.a().a(this.bq, ((u)this.m.get(0)).q(), this.bB[0], this.bC[0], true, false);
          i2 = i3;
          paramInt = i1;
        }
      }
      if (paramInt == y.d)
      {
        if ((paramArrayOfObject != null) && (paramArrayOfObject.length > 0))
        {
          if (((Long)paramArrayOfObject[0]).longValue() != this.bq)
            continue;
          d();
          return;
        }
        e();
        return;
      }
      if (paramInt == y.f)
      {
        localObject1 = (SparseArray)paramArrayOfObject[0];
        paramArrayOfObject = (SparseArray)paramArrayOfObject[1];
        paramInt = 0;
        while (true)
        {
          if (paramInt >= ((SparseArray)localObject1).size())
            break label12425;
          i1 = ((SparseArray)localObject1).keyAt(paramInt);
          l1 = ((Long)((SparseArray)localObject1).get(i1)).longValue();
          if (i1 == this.bq)
            break;
          paramInt += 1;
        }
        i2 = 0;
        i1 = 0;
        while (true)
        {
          paramInt = i1;
          if (i2 < this.m.size())
          {
            localObject1 = (u)this.m.get(i2);
            paramInt = i1;
            if (((u)localObject1).j())
              break label6501;
            paramInt = i1;
            if (((u)localObject1).q() <= 0)
              break label6501;
            paramInt = i1;
            if (((u)localObject1).q() > (int)l1)
              break label6501;
            if (!((u)localObject1).m())
              paramInt = i1;
          }
          else
          {
            label6441: i1 = 0;
            while (true)
            {
              i2 = paramInt;
              if (i1 >= paramArrayOfObject.size())
                break label6582;
              i2 = paramArrayOfObject.keyAt(i1);
              i3 = (int)((Long)paramArrayOfObject.get(i2)).longValue();
              if (i2 == this.bq)
                break;
              i1 += 1;
            }
          }
          ((u)localObject1).o();
          paramInt = 1;
          label6501: i2 += 1;
          i1 = paramInt;
          continue;
          i1 = 0;
        }
        while (true)
        {
          i2 = paramInt;
          if (i1 < this.m.size())
          {
            paramArrayOfObject = (u)this.m.get(i1);
            i2 = paramInt;
            if (!paramArrayOfObject.j())
              break label6599;
            i2 = paramInt;
            if (paramArrayOfObject.q() <= 0)
              break label6599;
            i2 = paramInt;
            if (paramArrayOfObject.q() > i3)
              break label6599;
            if (!paramArrayOfObject.m())
              i2 = paramInt;
          }
          else
          {
            label6582: if (i2 == 0)
              break;
            ac();
            return;
          }
          paramArrayOfObject.o();
          i2 = 1;
          label6599: i1 += 1;
          paramInt = i2;
        }
      }
      if (paramInt == y.e)
      {
        localObject1 = (ArrayList)paramArrayOfObject[0];
        i3 = ((Integer)paramArrayOfObject[1]).intValue();
        if (org.vidogram.messenger.e.d(this.i))
          if ((i3 == 0) && (this.bL != 0L))
            paramInt = 1;
        while (true)
        {
          i2 = 0;
          i1 = 0;
          while (i2 < ((ArrayList)localObject1).size())
          {
            localObject2 = (Integer)((ArrayList)localObject1).get(i2);
            paramArrayOfObject = (u)this.by[paramInt].get(localObject2);
            if ((paramInt == 0) && (this.n != null) && (this.n.s == ((Integer)localObject2).intValue()))
            {
              this.aL = null;
              this.n.s = 0;
              org.vidogram.messenger.w.a().b(i3, 0);
              h(true);
            }
            if (paramArrayOfObject == null)
              break label12422;
            i4 = this.m.indexOf(paramArrayOfObject);
            if (i4 == -1)
              break label12422;
            this.m.remove(i4);
            this.by[paramInt].remove(localObject2);
            localObject2 = (ArrayList)this.bz.get(paramArrayOfObject.h);
            if (localObject2 != null)
            {
              ((ArrayList)localObject2).remove(paramArrayOfObject);
              if (((ArrayList)localObject2).isEmpty())
              {
                this.bz.remove(paramArrayOfObject.h);
                if ((i4 >= 0) && (i4 < this.m.size()))
                  this.m.remove(i4);
              }
            }
            i1 = 1;
            label6875: i2 += 1;
          }
          if (i3 != this.i.h)
            break;
          paramInt = 0;
          continue;
          if (i3 != 0)
            break;
          paramInt = 0;
        }
        if (this.m.isEmpty())
        {
          if ((this.bE[0] != 0) || (this.bH))
            break label7220;
          if (this.t != null)
            this.t.setVisibility(4);
          if (this.E != null)
            this.E.setEmptyView(null);
          if (this.k != null)
            break label7171;
          paramArrayOfObject = this.bA;
          this.bA[1] = 2147483647;
          paramArrayOfObject[0] = 2147483647;
          paramArrayOfObject = this.bB;
          this.bB[1] = -2147483648;
          paramArrayOfObject[0] = -2147483648;
          paramArrayOfObject = this.bC;
          this.bC[1] = -2147483648;
          paramArrayOfObject[0] = -2147483648;
          paramArrayOfObject = this.bD;
          this.bD[1] = 0;
          paramArrayOfObject[0] = 0;
          this.bw.add(Integer.valueOf(this.br));
          paramArrayOfObject = org.vidogram.messenger.v.a();
          l1 = this.bq;
          if (this.bF[0] != 0)
            break label7214;
          bool1 = true;
          label7087: paramInt = this.bD[0];
          i2 = this.e;
          bool2 = org.vidogram.messenger.e.d(this.i);
          i3 = this.br;
          this.br = (i3 + 1);
          paramArrayOfObject.a(l1, 30, 0, bool1, paramInt, i2, 0, 0, bool2, i3);
          this.bH = true;
        }
        while (true)
        {
          if ((i1 == 0) || (this.G == null))
            break label7291;
          T();
          this.G.c();
          return;
          label7171: paramArrayOfObject = this.bA;
          this.bA[1] = -2147483648;
          paramArrayOfObject[0] = -2147483648;
          paramArrayOfObject = this.bB;
          this.bB[1] = 2147483647;
          paramArrayOfObject[0] = 2147483647;
          break;
          label7214: bool1 = false;
          break label7087;
          label7220: if (this.cc != null)
          {
            this.cc = null;
            if (this.l != null)
              this.l.b(null, false);
          }
          if ((this.k != null) || (this.j == null) || (!this.j.r) || (this.ca != null))
            continue;
          this.ca = "";
          U();
        }
        label7291: continue;
      }
      if (paramInt != y.i)
        break label7867;
      ae();
      localObject2 = (Integer)paramArrayOfObject[0];
      localObject1 = (u)this.by[0].get(localObject2);
      if (localObject1 == null)
        continue;
      localObject3 = (Integer)paramArrayOfObject[1];
      if ((((Integer)localObject3).equals(localObject2)) || (!this.by[0].containsKey(localObject3)))
        break;
      paramArrayOfObject = (u)this.by[0].remove(localObject2);
      if (paramArrayOfObject == null)
        continue;
      paramInt = this.m.indexOf(paramArrayOfObject);
      this.m.remove(paramInt);
      paramArrayOfObject = (ArrayList)this.bz.get(paramArrayOfObject.h);
      paramArrayOfObject.remove(localObject1);
      if (paramArrayOfObject.isEmpty())
      {
        this.bz.remove(((u)localObject1).h);
        if ((paramInt >= 0) && (paramInt < this.m.size()))
          this.m.remove(paramInt);
      }
      if (this.G == null)
        continue;
      this.G.c();
      return;
    }
    paramArrayOfObject = (g.ar)paramArrayOfObject[2];
    paramInt = 0;
    if (paramArrayOfObject != null)
      i1 = paramInt;
    while (true)
    {
      try
      {
        if (!((u)localObject1).S())
          continue;
        i1 = paramInt;
        if (((u)localObject1).a.r != null)
          continue;
        i1 = paramInt;
        if (paramArrayOfObject.r != null)
          break label12506;
        i1 = paramInt;
        if (((u)localObject1).a.i.equals(paramArrayOfObject.i))
          continue;
        break label12506;
        if (paramInt != 0)
          continue;
        i1 = paramInt;
        if (((u)localObject1).a.B == null)
          continue;
        i1 = paramInt;
        if (((u)localObject1).a.B.containsKey("query_id"))
          continue;
        i1 = paramInt;
        if (paramArrayOfObject.j == null)
          continue;
        i1 = paramInt;
        if (((u)localObject1).a.j == null)
          continue;
        i1 = paramInt;
        bool1 = paramArrayOfObject.j.getClass().equals(((u)localObject1).a.j.getClass());
        if (bool1)
          continue;
        bool1 = true;
        ((u)localObject1).a = paramArrayOfObject;
        ((u)localObject1).a(true);
        ((u)localObject1).d();
        i1 = paramInt;
        bool2 = bool1;
        if (!(paramArrayOfObject.j instanceof g.nz))
          continue;
        ((u)localObject1).a();
        bool2 = bool1;
        i1 = paramInt;
        if (i1 == 0)
          continue;
        ((u)localObject1).c();
        this.by[0].remove(localObject2);
        this.by[0].put(localObject3, localObject1);
        ((u)localObject1).a.b = ((Integer)localObject3).intValue();
        ((u)localObject1).a.y = 0;
        ((u)localObject1).u = bool2;
        paramArrayOfObject = new ArrayList();
        paramArrayOfObject.add(localObject1);
        if (this.k != null)
          continue;
        org.vidogram.messenger.d.c.a(paramArrayOfObject, this.bq);
        if (this.G == null)
          continue;
        this.G.a((u)localObject1);
        if ((this.F == null) || (!bool2) || (this.F.n() < this.m.size() - 1))
          continue;
        I();
        z.a().f();
        return;
        paramInt = 0;
        continue;
        bool1 = false;
        continue;
      }
      catch (Exception localException)
      {
        paramInt = i1;
        org.vidogram.messenger.n.a("tmessages", localException);
        bool1 = false;
        continue;
      }
      label7867: if (paramInt == y.h)
      {
        paramArrayOfObject = (Integer)paramArrayOfObject[0];
        paramArrayOfObject = (u)this.by[0].get(paramArrayOfObject);
        if (paramArrayOfObject == null)
          break label92;
        paramArrayOfObject.a.y = 0;
        if (this.G == null)
          break label92;
        this.G.a(paramArrayOfObject);
        return;
      }
      if (paramInt == y.j)
      {
        paramArrayOfObject = (Integer)paramArrayOfObject[0];
        paramArrayOfObject = (u)this.by[0].get(paramArrayOfObject);
        if (paramArrayOfObject == null)
          break label92;
        paramArrayOfObject.a.y = 2;
        ac();
        return;
      }
      if (paramInt == y.n)
      {
        localObject1 = (g.j)paramArrayOfObject[0];
        if ((this.i == null) || (((g.j)localObject1).e != this.i.h))
          break label92;
        if ((localObject1 instanceof g.dl))
        {
          if (this.i.r)
          {
            if (((g.j)localObject1).t != null)
            {
              paramInt = 0;
              i1 = 0;
              while (true)
              {
                i2 = paramInt;
                if (i1 >= ((g.j)localObject1).t.e.size())
                  break;
                paramInt = Math.max(((g.k)((g.j)localObject1).t.e.get(i1)).d, paramInt);
                i1 += 1;
              }
            }
            i2 = 0;
            if ((i2 == 0) || (Math.abs(System.currentTimeMillis() / 1000L - i2) > 3600L))
              org.vidogram.messenger.v.a().d(Integer.valueOf(this.i.h));
          }
          if ((((g.j)localObject1).t == null) && (this.n != null))
            ((g.j)localObject1).t = this.n.t;
        }
        this.n = ((g.j)localObject1);
        if (this.af != null)
          this.af.a(this.n);
        if ((paramArrayOfObject[3] instanceof u))
        {
          this.aL = ((u)paramArrayOfObject[3]);
          h(false);
        }
        while (true)
        {
          if (this.M != null)
          {
            this.M.e();
            this.M.c();
          }
          if (this.bs)
            org.vidogram.messenger.ac.a().a(this.n);
          if ((this.n instanceof g.fi))
          {
            this.cf = false;
            this.bZ.clear();
            this.ce = 0;
            URLSpanBotCommand.a = false;
            paramInt = 0;
            while (true)
              if (paramInt < this.n.t.e.size())
              {
                paramArrayOfObject = (g.k)this.n.t.e.get(paramInt);
                paramArrayOfObject = org.vidogram.messenger.v.a().a(Integer.valueOf(paramArrayOfObject.b));
                if ((paramArrayOfObject != null) && (paramArrayOfObject.r))
                {
                  URLSpanBotCommand.a = true;
                  this.ce += 1;
                  org.vidogram.messenger.d.a.a(paramArrayOfObject.d, true, this.e);
                }
                paramInt += 1;
                continue;
                h(true);
                break;
              }
            if (this.E == null)
              break;
            this.E.s();
          }
        }
        while (true)
        {
          if (this.l != null)
            this.l.a(this.ce, this.cf);
          if (this.af != null)
            this.af.e(this.ce);
          if ((!org.vidogram.messenger.e.d(this.i)) || (this.bL != 0L) || (this.n.q == 0))
            break;
          this.bL = (-this.n.q);
          this.bA[1] = this.n.r;
          if (this.G == null)
            break;
          this.G.c();
          return;
          if (!(this.n instanceof g.dl))
            continue;
          this.cf = false;
          this.bZ.clear();
          this.ce = 0;
          if (!this.n.p.isEmpty());
          for (bool1 = true; ; bool1 = false)
          {
            URLSpanBotCommand.a = bool1;
            this.ce = this.n.p.size();
            paramInt = 0;
            while (paramInt < this.n.p.size())
            {
              paramArrayOfObject = (g.b)this.n.p.get(paramInt);
              if ((!paramArrayOfObject.d.isEmpty()) && ((!org.vidogram.messenger.e.d(this.i)) || ((this.i != null) && (this.i.r))))
                this.cf = true;
              this.bZ.put(Integer.valueOf(paramArrayOfObject.b), paramArrayOfObject);
              paramInt += 1;
            }
          }
          if (this.E != null)
            this.E.s();
          if ((this.af == null) || ((org.vidogram.messenger.e.d(this.i)) && ((this.i == null) || (!this.i.r))))
            continue;
          this.af.a(this.bZ);
        }
      }
      if (paramInt == y.o)
      {
        paramInt = ((Integer)paramArrayOfObject[0]).intValue();
        if ((this.i == null) || (this.i.h != paramInt))
          break label92;
        paramInt = ((Integer)paramArrayOfObject[1]).intValue();
        if ((l() == null) || (this.s != null))
          break label92;
        paramArrayOfObject = new AlertDialog.Builder(l());
        paramArrayOfObject.setTitle(org.vidogram.messenger.r.a("AppName", 2131230856));
        if (paramInt == 0)
          paramArrayOfObject.setMessage(org.vidogram.messenger.r.a("ChannelCantOpenPrivate", 2131230975));
        while (true)
        {
          paramArrayOfObject.setPositiveButton(org.vidogram.messenger.r.a("OK", 2131231604), null);
          paramArrayOfObject = paramArrayOfObject.create();
          this.s = paramArrayOfObject;
          b(paramArrayOfObject);
          this.bH = false;
          if (this.t != null)
            this.t.setVisibility(4);
          if (this.G == null)
            break;
          this.G.c();
          return;
          if (paramInt == 1)
          {
            paramArrayOfObject.setMessage(org.vidogram.messenger.r.a("ChannelCantOpenNa", 2131230974));
            continue;
          }
          if (paramInt != 2)
            continue;
          paramArrayOfObject.setMessage(org.vidogram.messenger.r.a("ChannelCantOpenBanned", 2131230973));
        }
      }
      if (paramInt == y.k)
      {
        W();
        if (this.M == null)
          break label92;
        this.M.c();
        return;
      }
      if (paramInt == y.r)
      {
        paramArrayOfObject = (g.t)paramArrayOfObject[0];
        if ((this.k == null) || (paramArrayOfObject.b != this.k.b))
          break label92;
        this.k = paramArrayOfObject;
        W();
        L();
        F();
        if (this.l != null)
        {
          paramArrayOfObject = this.l;
          if ((this.k == null) || (org.vidogram.messenger.a.c(this.k.o) >= 23))
          {
            bool1 = true;
            if ((this.k != null) && (org.vidogram.messenger.a.c(this.k.o) < 46))
              break label9146;
            bool2 = true;
            label9078: paramArrayOfObject.b(bool1, bool2);
          }
        }
        else
        {
          if (this.af == null)
            break label92;
          paramArrayOfObject = this.af;
          if ((this.l.j()) || ((this.k != null) && (org.vidogram.messenger.a.c(this.k.o) < 46)))
            break label9152;
        }
        label9146: label9152: for (bool1 = true; ; bool1 = false)
        {
          paramArrayOfObject.c(bool1);
          return;
          bool1 = false;
          break;
          bool2 = false;
          break label9078;
        }
      }
      if (paramInt == y.s)
      {
        paramInt = ((Integer)paramArrayOfObject[0]).intValue();
        if ((this.k == null) || (this.k.b != paramInt))
          break label92;
        paramInt = ((Integer)paramArrayOfObject[1]).intValue();
        paramArrayOfObject = this.m.iterator();
        while (true)
        {
          if (paramArrayOfObject.hasNext())
          {
            localObject1 = (u)paramArrayOfObject.next();
            if (!((u)localObject1).j())
              continue;
            if ((!((u)localObject1).j()) || (((u)localObject1).m()));
          }
          else
          {
            ac();
            return;
          }
          if (((u)localObject1).a.e - 1 > paramInt)
            continue;
          ((u)localObject1).o();
        }
      }
      if ((paramInt == y.aF) || (paramInt == y.aG))
      {
        if (this.E == null)
          break label92;
        i1 = this.E.getChildCount();
        paramInt = 0;
        while (paramInt < i1)
        {
          paramArrayOfObject = this.E.getChildAt(paramInt);
          if ((paramArrayOfObject instanceof org.vidogram.ui.c.j))
          {
            paramArrayOfObject = (org.vidogram.ui.c.j)paramArrayOfObject;
            localObject1 = paramArrayOfObject.getMessageObject();
            if ((localObject1 != null) && ((((u)localObject1).H()) || (((u)localObject1).G())))
              paramArrayOfObject.a(false);
          }
          paramInt += 1;
        }
        i1 = this.ah.getChildCount();
        paramInt = 0;
        while (paramInt < i1)
        {
          paramArrayOfObject = this.ah.getChildAt(paramInt);
          if ((paramArrayOfObject instanceof org.vidogram.ui.c.m))
          {
            paramArrayOfObject = (org.vidogram.ui.c.m)paramArrayOfObject;
            localObject1 = paramArrayOfObject.getMessageObject();
            if ((localObject1 != null) && ((((u)localObject1).H()) || (((u)localObject1).G())))
              paramArrayOfObject.a(false);
          }
          paramInt += 1;
        }
        break label92;
      }
      if (paramInt == y.aE)
      {
        localObject1 = (Integer)paramArrayOfObject[0];
        if (this.E == null)
          break label92;
        i1 = this.E.getChildCount();
        paramInt = 0;
        while (true)
        {
          if (paramInt >= i1)
            break label9582;
          paramArrayOfObject = this.E.getChildAt(paramInt);
          if ((paramArrayOfObject instanceof org.vidogram.ui.c.j))
          {
            paramArrayOfObject = (org.vidogram.ui.c.j)paramArrayOfObject;
            if ((paramArrayOfObject.getMessageObject() != null) && (paramArrayOfObject.getMessageObject().q() == ((Integer)localObject1).intValue()))
            {
              localObject1 = paramArrayOfObject.getMessageObject();
              localObject2 = MediaController.a().j();
              if (localObject2 == null)
                break;
              ((u)localObject1).k = ((u)localObject2).k;
              ((u)localObject1).l = ((u)localObject2).l;
              paramArrayOfObject.d();
              return;
            }
          }
          paramInt += 1;
        }
        label9582: break label92;
      }
      if (paramInt == y.v)
      {
        l1 = ((Long)paramArrayOfObject[0]).longValue();
        if (this.bq != l1)
          break label92;
        this.m.clear();
        this.bw.clear();
        this.bz.clear();
        paramInt = 1;
        if (paramInt >= 0)
        {
          this.by[paramInt].clear();
          if (this.k == null)
          {
            this.bA[paramInt] = 2147483647;
            this.bB[paramInt] = -2147483648;
          }
          while (true)
          {
            this.bC[paramInt] = -2147483648;
            this.bD[paramInt] = 0;
            this.bt[paramInt].clear();
            this.bu[paramInt].clear();
            paramInt -= 1;
            break;
            this.bA[paramInt] = -2147483648;
            this.bB[paramInt] = 2147483647;
          }
        }
        this.bv = 0;
        this.d.d();
        h(true);
        if (this.cc != null)
        {
          this.cc = null;
          if (this.l != null)
            this.l.b(null, false);
        }
        if ((this.k == null) && (this.j != null) && (this.j.r) && (this.ca == null))
        {
          this.ca = "";
          U();
        }
        if (((Boolean)paramArrayOfObject[1]).booleanValue())
        {
          if (this.G != null)
          {
            paramArrayOfObject = this.t;
            if (a.b(this.G) != -1)
              break label9907;
          }
          label9907: for (paramInt = 0; ; paramInt = 4)
          {
            paramArrayOfObject.setVisibility(paramInt);
            this.E.setEmptyView(null);
            paramInt = 0;
            while (paramInt < 2)
            {
              this.bE[paramInt] = false;
              this.bF[paramInt] = false;
              this.bG[paramInt] = true;
              paramInt += 1;
            }
          }
          this.bQ = true;
          this.bI = true;
          this.bH = true;
          this.bM = 0;
          this.bN = false;
          this.bw.add(Integer.valueOf(this.br));
          paramArrayOfObject = org.vidogram.messenger.v.a();
          l1 = this.bq;
          if (org.vidogram.messenger.a.c())
          {
            paramInt = 30;
            i1 = this.e;
            bool1 = org.vidogram.messenger.e.d(this.i);
            i2 = this.br;
            this.br = (i2 + 1);
            paramArrayOfObject.a(l1, paramInt, 0, true, 0, i1, 2, 0, bool1, i2);
          }
        }
        while (true)
        {
          if (this.G == null)
            break label10064;
          this.G.c();
          return;
          paramInt = 20;
          break;
          if (this.t == null)
            continue;
          this.t.setVisibility(4);
          this.E.setEmptyView(this.J);
        }
        label10064: break label92;
      }
      if (paramInt == y.aL)
      {
        Z();
        return;
      }
      if (paramInt == y.y)
      {
        if (this.j == null)
          break label92;
        bool1 = this.q;
        this.q = org.vidogram.messenger.v.a().q.contains(Integer.valueOf(this.j.d));
        if (bool1 == this.q)
          break label92;
        U();
        return;
      }
      if (paramInt == y.aC)
      {
        localObject1 = (u)paramArrayOfObject[0];
        l1 = ((Long)paramArrayOfObject[2]).longValue();
        if ((l1 == 0L) || (this.bq != ((u)localObject1).u()))
          break label92;
        paramArrayOfObject = (u)this.by[0].get(Integer.valueOf(((u)localObject1).q()));
        if (paramArrayOfObject == null)
          break label92;
        paramArrayOfObject.a.j.k.h = (int)l1;
        ac();
        return;
      }
      if (paramInt == y.B)
      {
        paramArrayOfObject = (SparseArray)paramArrayOfObject[0];
        i1 = 0;
        paramInt = 0;
        while (paramInt < paramArrayOfObject.size())
        {
          i2 = paramArrayOfObject.keyAt(paramInt);
          localObject1 = ((ArrayList)paramArrayOfObject.get(i2)).iterator();
          while (((Iterator)localObject1).hasNext())
          {
            localObject2 = (Integer)((Iterator)localObject1).next();
            localObject2 = (u)this.by[0].get(localObject2);
            if (localObject2 == null)
              continue;
            ((u)localObject2).a.G = i2;
            i1 = 1;
          }
          paramInt += 1;
        }
        if (i1 == 0)
          break label92;
        ac();
        return;
      }
      if (paramInt == y.aO)
      {
        b((u)paramArrayOfObject[0]);
        if (this.E == null)
          break label92;
        i1 = this.E.getChildCount();
        paramInt = 0;
        while (paramInt < i1)
        {
          paramArrayOfObject = this.E.getChildAt(paramInt);
          if ((paramArrayOfObject instanceof org.vidogram.ui.c.j))
          {
            paramArrayOfObject = (org.vidogram.ui.c.j)paramArrayOfObject;
            localObject1 = paramArrayOfObject.getMessageObject();
            if ((localObject1 != null) && ((((u)localObject1).H()) || (((u)localObject1).G())))
              paramArrayOfObject.a(false);
          }
          paramInt += 1;
        }
        break label92;
      }
      if (paramInt == y.E)
      {
        paramArrayOfObject = (u)paramArrayOfObject[0];
        localObject1 = (u)this.by[0].get(Integer.valueOf(paramArrayOfObject.q()));
        if (localObject1 != null)
        {
          ((u)localObject1).a.j = paramArrayOfObject.a.j;
          ((u)localObject1).a.A = paramArrayOfObject.a.A;
          ((u)localObject1).a(false);
        }
        ac();
        return;
      }
      if (paramInt == y.G)
      {
        l1 = ((Long)paramArrayOfObject[0]).longValue();
        if ((l1 != this.bq) && (l1 != this.bL))
          break label92;
        if (l1 == this.bq)
        {
          i3 = 0;
          label10580: paramArrayOfObject = (ArrayList)paramArrayOfObject[1];
          i4 = 0;
          i1 = 0;
          paramInt = 0;
          label10594: if (i4 >= paramArrayOfObject.size())
            break label11073;
          localObject1 = (u)paramArrayOfObject.get(i4);
          localObject2 = (u)this.by[i3].get(Integer.valueOf(((u)localObject1).q()));
          if ((this.aL != null) && (this.aL.q() == ((u)localObject1).q()))
          {
            this.aL = ((u)localObject1);
            h(true);
          }
          if (localObject2 == null)
            break label12411;
          if (((u)localObject1).f < 0)
            break label10940;
          i2 = paramInt;
          if (paramInt == 0)
          {
            i2 = paramInt;
            if ((((u)localObject1).a.j instanceof g.oi))
              i2 = 1;
          }
          if (((u)localObject2).e != null)
          {
            ((u)localObject1).e = ((u)localObject2).e;
            if ((((u)localObject1).a.f instanceof g.mu))
              ((u)localObject1).a(null);
          }
          ((u)localObject1).a.A = ((u)localObject2).a.A;
          ((u)localObject1).r = ((u)localObject2).r;
          ((u)localObject1).s = ((u)localObject2).s;
          this.by[i3].put(Integer.valueOf(((u)localObject2).q()), localObject1);
          paramInt = i2;
          label10808: i2 = this.m.indexOf(localObject2);
          if (i2 < 0)
            break label12408;
          localObject3 = (ArrayList)this.bz.get(((u)localObject2).h);
          i1 = -1;
          if (localObject3 != null)
            i1 = ((ArrayList)localObject3).indexOf(localObject2);
          if (((u)localObject1).f < 0)
            break label10962;
          this.m.set(i2, localObject1);
          if (this.G != null)
            this.G.c(a.c(this.G) + this.m.size() - i2 - 1);
          if (i1 >= 0)
            ((ArrayList)localObject3).set(i1, localObject1);
          label10923: i1 = 1;
        }
      }
      label10940: label10962: label11487: label12405: label12408: label12411: 
      while (true)
      {
        i4 += 1;
        break label10594;
        i3 = 1;
        break label10580;
        this.by[i3].remove(Integer.valueOf(((u)localObject2).q()));
        break label10808;
        this.m.remove(i2);
        if (this.G != null)
          this.G.d(a.c(this.G) + this.m.size() - i2 - 1);
        if (i1 < 0)
          break label10923;
        ((ArrayList)localObject3).remove(i1);
        if (!((ArrayList)localObject3).isEmpty())
          break label10923;
        this.bz.remove(((u)localObject2).h);
        this.m.remove(i2);
        this.G.d(a.c(this.G) + this.m.size());
        break label10923;
        if ((i1 == 0) || (this.F == null) || (paramInt == 0))
          break label92;
        i1 = this.F.n();
        i2 = this.m.size();
        if (a.a(this.G));
        for (paramInt = 2; i1 >= i2 - paramInt; paramInt = 1)
        {
          I();
          return;
        }
        break label92;
        if (paramInt == y.w)
        {
          Q();
          if (!org.vidogram.messenger.e.d(this.i))
            break label92;
          U();
          return;
        }
        if (paramInt == y.K)
        {
          if (((Long)paramArrayOfObject[0]).longValue() != this.bq)
            break label92;
          ac();
          return;
        }
        if (paramInt == y.L)
        {
          paramArrayOfObject = (u)paramArrayOfObject[0];
          if ((paramArrayOfObject.u() != this.bq) || (this.n == null) || (this.n.s != paramArrayOfObject.q()))
            break label92;
          this.aL = paramArrayOfObject;
          this.aM = 0;
          h(true);
          return;
        }
        if (paramInt == y.N)
        {
          paramArrayOfObject = (ArrayList)paramArrayOfObject[0];
          i1 = 0;
          paramInt = 0;
          if (i1 < paramArrayOfObject.size())
          {
            localObject1 = (g.ar)paramArrayOfObject.get(i1);
            l1 = u.e((g.ar)localObject1);
            if ((l1 == this.bq) || (l1 == this.bL));
          }
        }
        while (true)
        {
          i1 += 1;
          break label11271;
          localObject2 = this.by;
          if (l1 == this.bq);
          for (i2 = 0; ; i2 = 1)
          {
            localObject2 = (u)localObject2[i2].get(Integer.valueOf(((g.ar)localObject1).b));
            if (localObject2 == null)
              break label12405;
            ((u)localObject2).a.j = new g.oi();
            ((u)localObject2).a.j.r = ((g.ar)localObject1).j.r;
            ((u)localObject2).a(true);
            paramInt = 1;
            break;
          }
          if (paramInt == 0)
            break label92;
          ac();
          if ((this.F == null) || (this.F.n() < this.m.size() - 1))
            break label92;
          I();
          return;
          if (paramInt == y.O)
          {
            if (this.bg == null)
              break label92;
            paramArrayOfObject = ((HashMap)paramArrayOfObject[0]).values().iterator();
            if (!paramArrayOfObject.hasNext())
              break label92;
            localObject1 = (g.wb)paramArrayOfObject.next();
            if (((g.wb)localObject1).d != this.bg.d)
              break;
            if (!(localObject1 instanceof g.vq));
            for (bool1 = true; ; bool1 = false)
            {
              a(bool1, null, null, (g.wb)localObject1, false, true);
              return;
            }
          }
          if (paramInt == y.S)
          {
            paramArrayOfObject = (ArrayList)paramArrayOfObject[0];
            i1 = 0;
            paramInt = 0;
            if (paramInt < paramArrayOfObject.size())
            {
              l1 = ((Long)paramArrayOfObject.get(paramInt)).longValue();
              localObject1 = this.by;
              if (this.bL == 0L);
              for (i2 = 0; ; i2 = 1)
              {
                localObject1 = (u)localObject1[i2].get(Integer.valueOf((int)l1));
                if (localObject1 != null)
                {
                  ((u)localObject1).p();
                  i1 = 1;
                }
                paramInt += 1;
                break;
              }
            }
            if (i1 == 0)
              break label92;
            ac();
            return;
          }
          if (paramInt == y.T)
          {
            paramInt = ((Integer)paramArrayOfObject[1]).intValue();
            if (this.e != paramInt)
              break label92;
            paramArrayOfObject = (g.b)paramArrayOfObject[0];
            if (this.k == null)
            {
              if ((!paramArrayOfObject.d.isEmpty()) && (!org.vidogram.messenger.e.d(this.i)))
                this.cf = true;
              this.bZ.put(Integer.valueOf(paramArrayOfObject.b), paramArrayOfObject);
              if (this.G != null)
                this.G.c(0);
              if ((this.af != null) && ((!org.vidogram.messenger.e.d(this.i)) || ((this.i != null) && (this.i.r))))
                this.af.a(this.bZ);
              if (this.l != null)
                this.l.a(this.ce, this.cf);
            }
            P();
            return;
          }
          if (paramInt == y.V)
          {
            if (this.bq != ((Long)paramArrayOfObject[1]).longValue())
              break label92;
            paramArrayOfObject = (g.ar)paramArrayOfObject[0];
            if ((paramArrayOfObject != null) && (!this.q))
            {
              this.cc = new u(paramArrayOfObject, null, false);
              if (this.l == null)
                break label92;
              if ((this.cc.a.r instanceof g.sg))
              {
                if ((ApplicationLoader.a.getSharedPreferences("mainconfig", 0).getInt("answered_" + this.bq, 0) == this.cc.q()) || ((this.aY != null) && (this.l.getFieldText() != null)))
                  break label92;
                this.cd = this.cc;
                this.l.setButtons(this.cc);
                a(true, this.cc, null, null, false, true);
                return;
              }
              if ((this.aY != null) && (this.cd == this.aY))
              {
                this.cd = null;
                a(false, null, null, null, false, true);
              }
              this.l.setButtons(this.cc);
              return;
            }
            this.cc = null;
            if (this.l == null)
              break label92;
            if ((this.aY != null) && (this.cd == this.aY))
            {
              this.cd = null;
              a(false, null, null, null, false, true);
            }
            this.l.setButtons(this.cc);
            return;
          }
          if (paramInt == y.W)
          {
            if (this.e != ((Integer)paramArrayOfObject[0]).intValue())
              break label92;
            i1 = ((Integer)paramArrayOfObject[1]).intValue();
            l1 = ((Long)paramArrayOfObject[3]).longValue();
            if (i1 != 0)
              if (l1 != this.bq)
                break label12210;
            for (paramInt = 0; ; paramInt = 1)
            {
              a(i1, 0, true, paramInt);
              a(((Integer)paramArrayOfObject[2]).intValue(), ((Integer)paramArrayOfObject[4]).intValue(), ((Integer)paramArrayOfObject[5]).intValue());
              return;
            }
          }
          if (paramInt == y.Z)
          {
            paramArrayOfObject = (SparseIntArray)((SparseArray)paramArrayOfObject[0]).get((int)this.bq);
            if (paramArrayOfObject == null)
              break label92;
            i1 = 0;
            paramInt = 0;
            while (paramInt < paramArrayOfObject.size())
            {
              i3 = paramArrayOfObject.keyAt(paramInt);
              localObject1 = (u)this.by[0].get(Integer.valueOf(i3));
              i2 = i1;
              if (localObject1 != null)
              {
                i3 = paramArrayOfObject.get(i3);
                i2 = i1;
                if (i3 > ((u)localObject1).a.s)
                {
                  ((u)localObject1).a.s = i3;
                  i2 = 1;
                }
              }
              paramInt += 1;
              i1 = i2;
            }
            if (i1 == 0)
              break label92;
            ac();
            return;
          }
          if (paramInt == y.ac)
          {
            if (((Long)paramArrayOfObject[0]).longValue() != this.bq)
              break label92;
            V();
            return;
          }
          if ((paramInt != y.ag) || (((Long)paramArrayOfObject[0]).longValue() != this.bq))
            break label92;
          i(true);
          return;
        }
        continue;
      }
      label11073: i1 = 0;
      label11271: label12210: bool2 = false;
      continue;
      label12422: break label6875;
      label12425: paramInt = 0;
      break label6441;
      label12430: paramInt = i13;
      break label6031;
      label12436: break label4695;
      label12439: paramInt = i4;
      break label4807;
      label12445: i7 = paramInt;
      paramArrayOfObject = localObject1;
      i5 = i9;
      paramInt = i4;
      break label4695;
      label12461: paramInt = i7;
      i5 = i10;
      i2 = i8;
      break label5741;
      label12475: break label5172;
      label12478: i1 = paramInt;
      paramInt = i8;
      i2 = i7;
      i5 = i6;
      break label4137;
      label12494: i4 = i2;
      break label4064;
      label12501: paramInt = 0;
      break label149;
      label12506: paramInt = 1;
    }
  }

  public void a(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    if (this.l != null)
      this.l.a(paramInt, paramArrayOfString, paramArrayOfInt);
    if (this.af != null)
      this.af.a(paramInt, paramArrayOfString, paramArrayOfInt);
    if ((paramInt == 17) && (this.al != null))
      this.al.e(false);
    do
    {
      return;
      if ((paramInt != 19) || (paramArrayOfInt == null) || (paramArrayOfInt.length <= 0) || (paramArrayOfInt[0] != 0))
        continue;
      e(0);
      return;
    }
    while ((paramInt != 20) || (paramArrayOfInt == null) || (paramArrayOfInt.length <= 0) || (paramArrayOfInt[0] != 0));
    e(2);
  }

  public void a(Configuration paramConfiguration)
  {
    ab();
  }

  public void a(Bundle paramBundle)
  {
    if (this.bY != null)
      paramBundle.putString("path", this.bY);
  }

  public void a(String paramString, boolean paramBoolean)
  {
    boolean bool = true;
    if ((org.vidogram.messenger.b.a.a(paramString)) || (!paramBoolean))
    {
      localObject = l();
      if (this.cb == 0L);
      for (paramBoolean = bool; ; paramBoolean = false)
      {
        org.vidogram.messenger.b.a.a((Context)localObject, paramString, paramBoolean);
        return;
      }
    }
    Object localObject = new AlertDialog.Builder(l());
    ((AlertDialog.Builder)localObject).setTitle(org.vidogram.messenger.r.a("AppName", 2131230856));
    ((AlertDialog.Builder)localObject).setMessage(org.vidogram.messenger.r.a("OpenUrlAlert", 2131231619, new Object[] { paramString }));
    ((AlertDialog.Builder)localObject).setPositiveButton(org.vidogram.messenger.r.a("Open", 2131231616), new DialogInterface.OnClickListener(paramString)
    {
      public void onClick(DialogInterface paramDialogInterface, int paramInt)
      {
        paramDialogInterface = q.this.l();
        String str = this.a;
        if (q.bu(q.this) == 0L);
        for (boolean bool = true; ; bool = false)
        {
          org.vidogram.messenger.b.a.a(paramDialogInterface, str, bool);
          return;
        }
      }
    });
    ((AlertDialog.Builder)localObject).setNegativeButton(org.vidogram.messenger.r.a("Cancel", 2131230943), null);
    b(((AlertDialog.Builder)localObject).create());
  }

  public void a(MediaController.i parami, boolean paramBoolean)
  {
    if (parami.h)
    {
      af localaf = null;
      long l1 = 0L;
      if (paramBoolean)
      {
        localaf = new af();
        localaf.h = -1;
        localaf.i = parami.d;
        localaf.b = -1L;
        localaf.a = -1L;
        l1 = new File(parami.d).length();
      }
      String str = parami.d;
      long l2 = this.bq;
      u localu = this.aY;
      if (parami.i != null)
      {
        parami = parami.i.toString();
        org.vidogram.messenger.ac.a(str, l1, 0L, 0, 0, localaf, l2, localu, parami);
      }
    }
    do
    {
      return;
      parami = null;
      break;
      if (parami.g == null)
        continue;
      org.vidogram.messenger.ac.a(parami.g, null, this.bq, this.aY, parami.i, parami.j);
      a(false, null, null, null, false, true);
      org.vidogram.messenger.d.b.a(this.bq, true);
      return;
    }
    while (parami.d == null);
    org.vidogram.messenger.ac.a(parami.d, null, this.bq, this.aY, parami.i, parami.j);
    a(false, null, null, null, false, true);
    org.vidogram.messenger.d.b.a(this.bq, true);
  }

  public void a(u paramu)
  {
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(l());
    localBuilder.setTitle(org.vidogram.messenger.r.a("ShareYouPhoneNumberTitle", 2131231844));
    if (this.j != null)
      if (this.j.r)
        localBuilder.setMessage(org.vidogram.messenger.r.a("AreYouSureShareMyContactInfoBot", 2131230886));
    while (true)
    {
      localBuilder.setPositiveButton(org.vidogram.messenger.r.a("OK", 2131231604), new DialogInterface.OnClickListener(paramu)
      {
        public void onClick(DialogInterface paramDialogInterface, int paramInt)
        {
          org.vidogram.messenger.ac.a().a(org.vidogram.messenger.ad.d(), q.o(q.this), this.a, null, null);
          q.ax(q.this);
          q.this.a(false, null, null, null, false, true);
        }
      });
      localBuilder.setNegativeButton(org.vidogram.messenger.r.a("Cancel", 2131230943), null);
      b(localBuilder.create());
      return;
      localBuilder.setMessage(org.vidogram.messenger.a.b(org.vidogram.messenger.r.a("AreYouSureShareMyContactInfoUser", 2131230887, new Object[] { org.vidogram.a.b.a().e("+" + org.vidogram.messenger.ad.d().i), org.vidogram.messenger.f.a(this.j.e, this.j.f) })));
      continue;
      localBuilder.setMessage(org.vidogram.messenger.r.a("AreYouSureShareMyContactInfo", 2131230885));
    }
  }

  public void a(g.ji paramji)
  {
    if (paramji == null);
    Bundle localBundle;
    do
    {
      g.vw localvw;
      do
      {
        return;
        localvw = this.af.i();
      }
      while (localvw == null);
      this.l.setFieldText("");
      if (this.bq == localvw.d)
      {
        this.cb = this.bq;
        org.vidogram.messenger.v.a().a(this.j, paramji.d);
        return;
      }
      localBundle = new Bundle();
      localBundle.putInt("user_id", localvw.d);
      localBundle.putString("inline_query", paramji.d);
      localBundle.putLong("inline_return", this.bq);
    }
    while (!org.vidogram.messenger.v.a(localBundle, this));
    a(new q(localBundle));
  }

  public void a(v paramv, long paramLong, boolean paramBoolean)
  {
    ArrayList localArrayList;
    int i1;
    Object localObject;
    if ((this.bq != 0L) && ((this.aX != null) || (!this.bt[0].isEmpty()) || (!this.bt[1].isEmpty())))
    {
      localArrayList = new ArrayList();
      if (this.aX == null)
        break label135;
      localArrayList.add(this.aX);
      this.aX = null;
      if (paramLong == this.bq)
        break label361;
      i1 = (int)paramLong;
      if (i1 == 0)
        break label356;
      localObject = new Bundle();
      ((Bundle)localObject).putBoolean("scrollToTopOnResume", this.bn);
      if (i1 <= 0)
        break label288;
      ((Bundle)localObject).putInt("user_id", i1);
      label125: if (org.vidogram.messenger.v.a((Bundle)localObject, paramv))
        break label307;
    }
    label135: label288: label307: 
    do
    {
      return;
      i1 = 1;
      while (i1 >= 0)
      {
        localObject = new ArrayList(this.bt[i1].keySet());
        Collections.sort((List)localObject);
        int i2 = 0;
        while (i2 < ((ArrayList)localObject).size())
        {
          Integer localInteger = (Integer)((ArrayList)localObject).get(i2);
          u localu = (u)this.bt[i1].get(localInteger);
          if ((localu != null) && (localInteger.intValue() > 0))
            localArrayList.add(localu);
          i2 += 1;
        }
        this.bu[i1].clear();
        this.bt[i1].clear();
        i1 -= 1;
      }
      this.bv = 0;
      this.d.d();
      h(true);
      break;
      if (i1 >= 0)
        break label125;
      ((Bundle)localObject).putInt("chat_id", -i1);
      break label125;
      localObject = new q((Bundle)localObject);
      if (!a((org.vidogram.ui.a.g)localObject, true))
        break label351;
      ((q)localObject).a(true, null, localArrayList, null, false, false);
    }
    while (org.vidogram.messenger.a.c());
    e();
    return;
    label351: paramv.d();
    return;
    label356: paramv.d();
    return;
    label361: paramv.d();
    I();
    a(true, null, localArrayList, null, false, org.vidogram.messenger.a.c());
    if (org.vidogram.messenger.a.c())
    {
      this.d.d();
      h(true);
    }
    ac();
  }

  public void a(boolean paramBoolean1, u paramu, ArrayList<u> paramArrayList, g.wb paramwb, boolean paramBoolean2, boolean paramBoolean3)
  {
    if (this.l == null);
    while (true)
    {
      return;
      if (!paramBoolean1)
        break;
      if ((paramu == null) && (paramArrayList == null) && (paramwb == null))
        continue;
      if ((this.z != null) && (this.d.j()))
      {
        this.d.g();
        this.l.h();
      }
      if ((paramu == null) || (paramu.u() == this.bq))
        break label2152;
      paramArrayList = new ArrayList();
      paramArrayList.add(paramu);
      paramBoolean1 = true;
      paramu = null;
    }
    while (true)
    {
      label152: label234: Object localObject1;
      Object localObject2;
      int i1;
      if (paramu != null)
      {
        this.aW = null;
        this.aY = paramu;
        this.l.setReplyingMessageObject(paramu);
        if (this.bg != null)
          break;
        if (paramu.l())
        {
          paramArrayList = org.vidogram.messenger.v.a().a(Integer.valueOf(paramu.a.c));
          if (paramArrayList == null)
            break;
          paramArrayList = ae.c(paramArrayList);
          this.ae.setImageResource(2130838111);
          this.ac.setText(paramArrayList);
          this.cp.setVisibility(8);
          if (!(paramu.a.j instanceof g.nz))
            break label438;
          this.ad.setText(org.vidogram.messenger.j.a(paramu.a.j.m.g, this.ad.getPaint().getFontMetricsInt(), org.vidogram.messenger.a.a(14.0F), false));
          paramArrayList = paramu;
          localObject1 = (FrameLayout.LayoutParams)this.ac.getLayoutParams();
          localObject2 = (FrameLayout.LayoutParams)this.ad.getLayoutParams();
          paramu = null;
          if (paramArrayList != null)
          {
            paramwb = org.vidogram.messenger.m.a(paramArrayList.n, 80);
            paramu = paramwb;
            if (paramwb == null)
              paramu = org.vidogram.messenger.m.a(paramArrayList.m, 80);
          }
          if ((paramu != null) && (!(paramu instanceof g.rt)) && (!(paramu.c instanceof g.ja)) && (paramArrayList.f != 13) && ((paramArrayList == null) || (!paramArrayList.s())))
            break label1864;
          this.ab.setImageBitmap(null);
          this.bd = null;
          this.ab.setVisibility(4);
          i1 = org.vidogram.messenger.a.a(52.0F);
          ((FrameLayout.LayoutParams)localObject2).leftMargin = i1;
        }
      }
      for (((FrameLayout.LayoutParams)localObject1).leftMargin = i1; ; ((FrameLayout.LayoutParams)localObject1).leftMargin = i1)
      {
        this.ac.setLayoutParams((ViewGroup.LayoutParams)localObject1);
        this.ad.setLayoutParams((ViewGroup.LayoutParams)localObject2);
        this.l.c(paramBoolean3, paramBoolean1);
        return;
        paramArrayList = org.vidogram.messenger.v.a().b(Integer.valueOf(paramu.a.d.b));
        if (paramArrayList == null)
          break;
        paramArrayList = paramArrayList.i;
        break label152;
        label438: paramArrayList = paramu;
        if (paramu.b == null)
          break label234;
        paramwb = paramu.b.toString();
        paramArrayList = paramwb;
        if (paramwb.length() > 150)
          paramArrayList = paramwb.substring(0, 150);
        paramArrayList = paramArrayList.replace('\n', ' ');
        this.ad.setText(org.vidogram.messenger.j.a(paramArrayList, this.ad.getPaint().getFontMetricsInt(), org.vidogram.messenger.a.a(14.0F), false));
        paramArrayList = paramu;
        break label234;
        if (paramArrayList != null)
        {
          if (paramArrayList.isEmpty())
            break;
          this.aY = null;
          this.l.setReplyingMessageObject(null);
          this.aW = paramArrayList;
          if (this.bg != null)
            break;
          this.l.a(true, paramBoolean3);
          localObject2 = new ArrayList();
          this.ae.setImageResource(2130837780);
          this.cp.setVisibility(0);
          this.cp.setOnClickListener(new View.OnClickListener()
          {
            public void onClick(View paramView)
            {
              q.c(q.this, (u)q.k(q.this).get(0));
            }
          });
          paramwb = (u)paramArrayList.get(0);
          if (paramwb.l())
          {
            ((ArrayList)localObject2).add(Integer.valueOf(paramwb.a.c));
            i1 = ((u)paramArrayList.get(0)).f;
            i2 = 1;
            label663: if (i2 >= paramArrayList.size())
              break label803;
            paramwb = (u)paramArrayList.get(i2);
            if (!paramwb.l())
              break label783;
          }
          label783: for (paramwb = Integer.valueOf(paramwb.a.c); ; paramwb = Integer.valueOf(-paramwb.a.d.b))
          {
            if (!((ArrayList)localObject2).contains(paramwb))
              ((ArrayList)localObject2).add(paramwb);
            int i3 = i1;
            if (((u)paramArrayList.get(i2)).f != i1)
              i3 = -1;
            i2 += 1;
            i1 = i3;
            break label663;
            ((ArrayList)localObject2).add(Integer.valueOf(-paramwb.a.d.b));
            break;
          }
          label803: StringBuilder localStringBuilder = new StringBuilder();
          int i2 = 0;
          if (i2 < ((ArrayList)localObject2).size())
          {
            paramwb = (Integer)((ArrayList)localObject2).get(i2);
            if (paramwb.intValue() > 0)
            {
              paramwb = org.vidogram.messenger.v.a().a(paramwb);
              localObject1 = null;
              label858: if ((paramwb != null) || (localObject1 != null))
                break label900;
            }
            while (true)
            {
              i2 += 1;
              break;
              localObject1 = org.vidogram.messenger.v.a().b(Integer.valueOf(-paramwb.intValue()));
              paramwb = null;
              break label858;
              label900: if (((ArrayList)localObject2).size() == 1)
              {
                if (paramwb != null)
                {
                  localStringBuilder.append(ae.c(paramwb));
                  continue;
                }
                localStringBuilder.append(((g.i)localObject1).i);
                continue;
              }
              if ((((ArrayList)localObject2).size() != 2) && (localStringBuilder.length() != 0))
                break label1073;
              if (localStringBuilder.length() > 0)
                localStringBuilder.append(", ");
              if (paramwb != null)
              {
                if ((paramwb.e != null) && (paramwb.e.length() > 0))
                {
                  localStringBuilder.append(paramwb.e);
                  continue;
                }
                if ((paramwb.f != null) && (paramwb.f.length() > 0))
                {
                  localStringBuilder.append(paramwb.f);
                  continue;
                }
                localStringBuilder.append(" ");
                continue;
              }
              localStringBuilder.append(((g.i)localObject1).i);
            }
            label1073: localStringBuilder.append(" ");
            localStringBuilder.append(org.vidogram.messenger.r.b("AndOther", ((ArrayList)localObject2).size() - 1));
          }
          this.ac.setText(localStringBuilder);
          if ((i1 == -1) || (i1 == 0) || (i1 == 10) || (i1 == 11))
            if ((paramArrayList.size() == 1) && (((u)paramArrayList.get(0)).b != null))
            {
              paramArrayList = (u)paramArrayList.get(0);
              if ((paramArrayList.a.j instanceof g.nz))
                this.ad.setText(org.vidogram.messenger.j.a(paramArrayList.a.j.m.g, this.ad.getPaint().getFontMetricsInt(), org.vidogram.messenger.a.a(14.0F), false));
            }
          while (true)
          {
            paramArrayList = paramu;
            break;
            paramwb = paramArrayList.b.toString();
            paramArrayList = paramwb;
            if (paramwb.length() > 150)
              paramArrayList = paramwb.substring(0, 150);
            paramArrayList = paramArrayList.replace('\n', ' ');
            this.ad.setText(org.vidogram.messenger.j.a(paramArrayList, this.ad.getPaint().getFontMetricsInt(), org.vidogram.messenger.a.a(14.0F), false));
            continue;
            this.ad.setText(org.vidogram.messenger.r.b("ForwardedMessage", paramArrayList.size()));
            continue;
            if (i1 == 1)
            {
              this.ad.setText(org.vidogram.messenger.r.b("ForwardedPhoto", paramArrayList.size()));
              if (paramArrayList.size() == 1)
              {
                paramu = (u)paramArrayList.get(0);
                continue;
              }
            }
            else
            {
              if (i1 == 4)
              {
                this.ad.setText(org.vidogram.messenger.r.b("ForwardedLocation", paramArrayList.size()));
                continue;
              }
              if (i1 == 3)
              {
                this.ad.setText(org.vidogram.messenger.r.b("ForwardedVideo", paramArrayList.size()));
                if (paramArrayList.size() == 1)
                {
                  paramu = (u)paramArrayList.get(0);
                  continue;
                }
              }
              else
              {
                if (i1 == 12)
                {
                  this.ad.setText(org.vidogram.messenger.r.b("ForwardedContact", paramArrayList.size()));
                  continue;
                }
                if (i1 == 2)
                {
                  this.ad.setText(org.vidogram.messenger.r.b("ForwardedAudio", paramArrayList.size()));
                  continue;
                }
                if (i1 == 14)
                {
                  this.ad.setText(org.vidogram.messenger.r.b("ForwardedMusic", paramArrayList.size()));
                  continue;
                }
                if (i1 == 13)
                {
                  this.ad.setText(org.vidogram.messenger.r.b("ForwardedSticker", paramArrayList.size()));
                  continue;
                }
                if ((i1 == 8) || (i1 == 9))
                {
                  if (paramArrayList.size() == 1)
                  {
                    if (i1 == 8)
                    {
                      this.ad.setText(org.vidogram.messenger.r.a("AttachGif", 2131230897));
                      continue;
                    }
                    paramu = org.vidogram.messenger.m.b(((u)paramArrayList.get(0)).A());
                    if (paramu.length() != 0)
                      this.ad.setText(paramu);
                    paramu = (u)paramArrayList.get(0);
                    continue;
                  }
                  this.ad.setText(org.vidogram.messenger.r.b("ForwardedFile", paramArrayList.size()));
                }
              }
            }
          }
        }
        this.ae.setImageResource(2130837938);
        if ((paramwb instanceof g.vr))
        {
          this.ac.setText(org.vidogram.messenger.r.a("GettingLinkInfo", 2131231274));
          this.ad.setText(this.bi);
          paramArrayList = paramu;
          break label234;
        }
        if (paramwb.h != null)
        {
          this.ac.setText(paramwb.h);
          label1718: if (paramwb.j == null)
            break label1795;
          this.ad.setText(paramwb.j);
        }
        while (true)
        {
          this.l.a(paramwb, true);
          paramArrayList = paramu;
          break;
          if (paramwb.i != null)
          {
            this.ac.setText(paramwb.i);
            break label1718;
          }
          this.ac.setText(org.vidogram.messenger.r.a("LinkPreview", 2131231392));
          break label1718;
          label1795: if ((paramwb.i != null) && (paramwb.h != null))
          {
            this.ad.setText(paramwb.i);
            continue;
          }
          if (paramwb.q != null)
          {
            this.ad.setText(paramwb.q);
            continue;
          }
          this.ad.setText(paramwb.f);
        }
        label1864: this.bd = paramu.c;
        this.ab.a(this.bd, "50_50", (Drawable)null);
        this.ab.setVisibility(0);
        i1 = org.vidogram.messenger.a.a(96.0F);
        ((FrameLayout.LayoutParams)localObject2).leftMargin = i1;
      }
      if ((this.aY == null) && (this.aW == null) && (this.bg == null))
        break;
      if ((this.aY != null) && ((this.aY.a.r instanceof g.sg)))
        ApplicationLoader.a.getSharedPreferences("mainconfig", 0).edit().putInt("answered_" + this.bq, this.aY.q()).commit();
      if (this.bg != null)
      {
        this.bg = null;
        paramu = this.l;
        if (!paramBoolean2);
        for (paramBoolean1 = true; ; paramBoolean1 = false)
        {
          paramu.a(null, paramBoolean1);
          if ((paramwb == null) || ((this.aY == null) && (this.aW == null)))
            break;
          a(true, this.aY, this.aW, null, false, true);
          return;
        }
      }
      if (this.aW != null)
        a(this.aW);
      this.l.a(false, paramBoolean3);
      this.l.b(paramBoolean3);
      this.l.setReplyingMessageObject(null);
      this.aY = null;
      this.aW = null;
      this.bd = null;
      return;
      label2152: paramBoolean1 = false;
    }
  }

  public void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    y.a().a(new int[] { y.n, y.c, y.d, y.g, y.V });
    y.a().a(true);
    if (paramBoolean1)
      this.bk = false;
  }

  public boolean a(Dialog paramDialog)
  {
    return (paramDialog != this.al) && (super.a(paramDialog));
  }

  public boolean a(String paramString)
  {
    return this.l.a(paramString);
  }

  public boolean a(String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    Object localObject = new Bundle();
    ((Bundle)localObject).putString("videoPath", paramString);
    localObject = new ba((Bundle)localObject);
    ((ba)localObject).a(new ba.a()
    {
      public void a(String paramString1, long paramLong1, long paramLong2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, long paramLong3, long paramLong4, String paramString2)
      {
        af localaf = new af();
        localaf.a = paramLong1;
        localaf.b = paramLong2;
        localaf.c = paramInt3;
        localaf.d = paramInt4;
        localaf.e = paramInt5;
        localaf.h = paramInt6;
        localaf.f = paramInt1;
        localaf.g = paramInt2;
        localaf.i = paramString1;
        org.vidogram.messenger.ac.a(paramString1, paramLong3, paramLong4, paramInt1, paramInt2, localaf, q.o(q.this), q.q(q.this), paramString2);
        q.this.a(false, null, null, null, false, true);
        org.vidogram.messenger.d.b.a(q.o(q.this), true);
      }
    });
    if ((this.c == null) || (!((ba)localObject).f()))
    {
      org.vidogram.messenger.ac.a(paramString, 0L, 0L, 0, 0, null, this.bq, this.aY, null);
      a(false, null, null, null, false, true);
      org.vidogram.messenger.d.b.a(this.bq, true);
      return false;
    }
    paramString = this.c;
    if (!paramBoolean2);
    for (paramBoolean2 = true; ; paramBoolean2 = false)
    {
      if (paramString.a((org.vidogram.ui.a.g)localObject, paramBoolean1, paramBoolean2, true))
        ((ba)localObject).a(this);
      return true;
    }
  }

  public boolean a(g.md parammd)
  {
    if ((this.cb == 0L) || (parammd.d))
      return false;
    parammd = "@" + this.j.g + " " + parammd.e;
    if (this.cb == this.bq)
    {
      this.cb = 0L;
      this.l.setFieldText(parammd);
    }
    while (true)
    {
      return true;
      org.vidogram.messenger.d.b.a(this.cb, parammd, null, null, false);
      if (this.c.e.size() <= 1)
        continue;
      parammd = (org.vidogram.ui.a.g)this.c.e.get(this.c.e.size() - 2);
      if ((!(parammd instanceof q)) || (((q)parammd).bq != this.cb))
        break;
      d();
    }
    parammd = new Bundle();
    int i1 = (int)this.cb;
    int i2 = (int)(this.cb >> 32);
    if (i1 != 0)
      if (i1 > 0)
        parammd.putInt("user_id", i1);
    while (true)
    {
      a(new q(parammd), true);
      break;
      if (i1 >= 0)
        continue;
      parammd.putInt("chat_id", -i1);
      continue;
      parammd.putInt("enc_id", i2);
    }
  }

  public void a_(int paramInt)
  {
  }

  public Bitmap b(u paramu, g.x paramx, int paramInt)
  {
    return null;
  }

  public void b(Bundle paramBundle)
  {
    this.bY = paramBundle.getString("path");
  }

  public void b(boolean paramBoolean1, boolean paramBoolean2)
  {
    y.a().a(false);
    if (paramBoolean1)
    {
      this.bk = true;
      if (this.j != null)
        org.vidogram.messenger.v.a().a(this.j, this.e, false);
      if (Build.VERSION.SDK_INT >= 21)
        E();
    }
  }

  public boolean b(int paramInt)
  {
    return false;
  }

  public void c(int paramInt)
  {
  }

  protected void c(Dialog paramDialog)
  {
    if ((this.s != null) && (paramDialog == this.s))
    {
      org.vidogram.messenger.v.a().a(this.bq, 0);
      if ((this.c != null) && (!this.c.e.isEmpty()) && (this.c.e.get(this.c.e.size() - 1) != this))
      {
        paramDialog = (org.vidogram.ui.a.g)this.c.e.get(this.c.e.size() - 1);
        e();
        paramDialog.d();
      }
    }
    else
    {
      return;
    }
    d();
  }

  public void c(u paramu, g.x paramx, int paramInt)
  {
  }

  public void d(int paramInt)
  {
  }

  // ERROR //
  public boolean f()
  {
    // Byte code:
    //   0: bipush 30
    //   2: istore_1
    //   3: iconst_0
    //   4: istore 7
    //   6: aload_0
    //   7: getfield 4016	org/vidogram/ui/q:f	Landroid/os/Bundle;
    //   10: ldc_w 3608
    //   13: iconst_0
    //   14: invokevirtual 4017	android/os/Bundle:getInt	(Ljava/lang/String;I)I
    //   17: istore_3
    //   18: aload_0
    //   19: getfield 4016	org/vidogram/ui/q:f	Landroid/os/Bundle;
    //   22: ldc_w 2520
    //   25: iconst_0
    //   26: invokevirtual 4017	android/os/Bundle:getInt	(Ljava/lang/String;I)I
    //   29: istore_2
    //   30: aload_0
    //   31: getfield 4016	org/vidogram/ui/q:f	Landroid/os/Bundle;
    //   34: ldc_w 3999
    //   37: iconst_0
    //   38: invokevirtual 4017	android/os/Bundle:getInt	(Ljava/lang/String;I)I
    //   41: istore 4
    //   43: aload_0
    //   44: aload_0
    //   45: getfield 4016	org/vidogram/ui/q:f	Landroid/os/Bundle;
    //   48: ldc_w 3883
    //   51: lconst_0
    //   52: invokevirtual 4021	android/os/Bundle:getLong	(Ljava/lang/String;J)J
    //   55: putfield 2059	org/vidogram/ui/q:cb	J
    //   58: aload_0
    //   59: getfield 4016	org/vidogram/ui/q:f	Landroid/os/Bundle;
    //   62: ldc_w 3881
    //   65: invokevirtual 4003	android/os/Bundle:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   68: astore 10
    //   70: aload_0
    //   71: aload_0
    //   72: getfield 4016	org/vidogram/ui/q:f	Landroid/os/Bundle;
    //   75: ldc_w 4023
    //   78: iconst_0
    //   79: invokevirtual 4017	android/os/Bundle:getInt	(Ljava/lang/String;I)I
    //   82: putfield 942	org/vidogram/ui/q:bM	I
    //   85: aload_0
    //   86: getfield 4016	org/vidogram/ui/q:f	Landroid/os/Bundle;
    //   89: ldc_w 4025
    //   92: iconst_0
    //   93: invokevirtual 4017	android/os/Bundle:getInt	(Ljava/lang/String;I)I
    //   96: istore 5
    //   98: aload_0
    //   99: aload_0
    //   100: getfield 4016	org/vidogram/ui/q:f	Landroid/os/Bundle;
    //   103: ldc_w 3894
    //   106: iconst_0
    //   107: invokevirtual 2776	android/os/Bundle:getBoolean	(Ljava/lang/String;Z)Z
    //   110: putfield 2792	org/vidogram/ui/q:bn	Z
    //   113: iload_3
    //   114: ifeq +901 -> 1015
    //   117: aload_0
    //   118: invokestatic 654	org/vidogram/messenger/v:a	()Lorg/vidogram/messenger/v;
    //   121: iload_3
    //   122: invokestatic 662	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   125: invokevirtual 1207	org/vidogram/messenger/v:b	(Ljava/lang/Integer;)Lorg/vidogram/tgnet/g$i;
    //   128: putfield 1039	org/vidogram/ui/q:i	Lorg/vidogram/tgnet/g$i;
    //   131: aload_0
    //   132: getfield 1039	org/vidogram/ui/q:i	Lorg/vidogram/tgnet/g$i;
    //   135: ifnonnull +60 -> 195
    //   138: new 4027	java/util/concurrent/Semaphore
    //   141: dup
    //   142: iconst_0
    //   143: invokespecial 4029	java/util/concurrent/Semaphore:<init>	(I)V
    //   146: astore 10
    //   148: invokestatic 1492	org/vidogram/messenger/w:a	()Lorg/vidogram/messenger/w;
    //   151: invokevirtual 4032	org/vidogram/messenger/w:c	()Lorg/vidogram/messenger/h;
    //   154: new 84	org/vidogram/ui/q$34
    //   157: dup
    //   158: aload_0
    //   159: iload_3
    //   160: aload 10
    //   162: invokespecial 4035	org/vidogram/ui/q$34:<init>	(Lorg/vidogram/ui/q;ILjava/util/concurrent/Semaphore;)V
    //   165: invokevirtual 1723	org/vidogram/messenger/h:b	(Ljava/lang/Runnable;)V
    //   168: aload 10
    //   170: invokevirtual 4038	java/util/concurrent/Semaphore:acquire	()V
    //   173: iload 7
    //   175: istore 6
    //   177: aload_0
    //   178: getfield 1039	org/vidogram/ui/q:i	Lorg/vidogram/tgnet/g$i;
    //   181: ifnull +802 -> 983
    //   184: invokestatic 654	org/vidogram/messenger/v:a	()Lorg/vidogram/messenger/v;
    //   187: aload_0
    //   188: getfield 1039	org/vidogram/ui/q:i	Lorg/vidogram/tgnet/g$i;
    //   191: iconst_1
    //   192: invokevirtual 4041	org/vidogram/messenger/v:a	(Lorg/vidogram/tgnet/g$i;Z)V
    //   195: iload_3
    //   196: ifle +803 -> 999
    //   199: aload_0
    //   200: iload_3
    //   201: ineg
    //   202: i2l
    //   203: putfield 1029	org/vidogram/ui/q:bq	J
    //   206: aload_0
    //   207: getfield 1039	org/vidogram/ui/q:i	Lorg/vidogram/tgnet/g$i;
    //   210: invokestatic 1235	org/vidogram/messenger/e:d	(Lorg/vidogram/tgnet/g$i;)Z
    //   213: ifeq +11 -> 224
    //   216: invokestatic 654	org/vidogram/messenger/v:a	()Lorg/vidogram/messenger/v;
    //   219: iload_3
    //   220: iconst_0
    //   221: invokevirtual 4043	org/vidogram/messenger/v:d	(IZ)V
    //   224: iload_2
    //   225: ifeq +18 -> 243
    //   228: aload_0
    //   229: getfield 625	org/vidogram/ui/q:j	Lorg/vidogram/tgnet/g$vw;
    //   232: getfield 629	org/vidogram/tgnet/g$vw:r	Z
    //   235: ifne +8 -> 243
    //   238: aload_0
    //   239: iconst_1
    //   240: putfield 2826	org/vidogram/ui/q:cq	Z
    //   243: invokestatic 3484	org/vidogram/messenger/y:a	()Lorg/vidogram/messenger/y;
    //   246: aload_0
    //   247: getstatic 3476	org/vidogram/messenger/y:g	I
    //   250: invokevirtual 4046	org/vidogram/messenger/y:a	(Ljava/lang/Object;I)V
    //   253: invokestatic 3484	org/vidogram/messenger/y:a	()Lorg/vidogram/messenger/y;
    //   256: aload_0
    //   257: getstatic 3550	org/vidogram/messenger/y:at	I
    //   260: invokevirtual 4046	org/vidogram/messenger/y:a	(Ljava/lang/Object;I)V
    //   263: invokestatic 3484	org/vidogram/messenger/y:a	()Lorg/vidogram/messenger/y;
    //   266: aload_0
    //   267: getstatic 3555	org/vidogram/messenger/y:b	I
    //   270: invokevirtual 4046	org/vidogram/messenger/y:a	(Ljava/lang/Object;I)V
    //   273: invokestatic 3484	org/vidogram/messenger/y:a	()Lorg/vidogram/messenger/y;
    //   276: aload_0
    //   277: getstatic 3556	org/vidogram/messenger/y:a	I
    //   280: invokevirtual 4046	org/vidogram/messenger/y:a	(Ljava/lang/Object;I)V
    //   283: invokestatic 3484	org/vidogram/messenger/y:a	()Lorg/vidogram/messenger/y;
    //   286: aload_0
    //   287: getstatic 3487	org/vidogram/messenger/y:d	I
    //   290: invokevirtual 4046	org/vidogram/messenger/y:a	(Ljava/lang/Object;I)V
    //   293: invokestatic 3484	org/vidogram/messenger/y:a	()Lorg/vidogram/messenger/y;
    //   296: aload_0
    //   297: getstatic 3639	org/vidogram/messenger/y:f	I
    //   300: invokevirtual 4046	org/vidogram/messenger/y:a	(Ljava/lang/Object;I)V
    //   303: invokestatic 3484	org/vidogram/messenger/y:a	()Lorg/vidogram/messenger/y;
    //   306: aload_0
    //   307: getstatic 3643	org/vidogram/messenger/y:e	I
    //   310: invokevirtual 4046	org/vidogram/messenger/y:a	(Ljava/lang/Object;I)V
    //   313: invokestatic 3484	org/vidogram/messenger/y:a	()Lorg/vidogram/messenger/y;
    //   316: aload_0
    //   317: getstatic 3648	org/vidogram/messenger/y:i	I
    //   320: invokevirtual 4046	org/vidogram/messenger/y:a	(Ljava/lang/Object;I)V
    //   323: invokestatic 3484	org/vidogram/messenger/y:a	()Lorg/vidogram/messenger/y;
    //   326: aload_0
    //   327: getstatic 3669	org/vidogram/messenger/y:h	I
    //   330: invokevirtual 4046	org/vidogram/messenger/y:a	(Ljava/lang/Object;I)V
    //   333: invokestatic 3484	org/vidogram/messenger/y:a	()Lorg/vidogram/messenger/y;
    //   336: aload_0
    //   337: getstatic 3670	org/vidogram/messenger/y:j	I
    //   340: invokevirtual 4046	org/vidogram/messenger/y:a	(Ljava/lang/Object;I)V
    //   343: invokestatic 3484	org/vidogram/messenger/y:a	()Lorg/vidogram/messenger/y;
    //   346: aload_0
    //   347: getstatic 3485	org/vidogram/messenger/y:n	I
    //   350: invokevirtual 4046	org/vidogram/messenger/y:a	(Ljava/lang/Object;I)V
    //   353: invokestatic 3484	org/vidogram/messenger/y:a	()Lorg/vidogram/messenger/y;
    //   356: aload_0
    //   357: getstatic 3708	org/vidogram/messenger/y:k	I
    //   360: invokevirtual 4046	org/vidogram/messenger/y:a	(Ljava/lang/Object;I)V
    //   363: invokestatic 3484	org/vidogram/messenger/y:a	()Lorg/vidogram/messenger/y;
    //   366: aload_0
    //   367: getstatic 3709	org/vidogram/messenger/y:r	I
    //   370: invokevirtual 4046	org/vidogram/messenger/y:a	(Ljava/lang/Object;I)V
    //   373: invokestatic 3484	org/vidogram/messenger/y:a	()Lorg/vidogram/messenger/y;
    //   376: aload_0
    //   377: getstatic 3712	org/vidogram/messenger/y:s	I
    //   380: invokevirtual 4046	org/vidogram/messenger/y:a	(Ljava/lang/Object;I)V
    //   383: invokestatic 3484	org/vidogram/messenger/y:a	()Lorg/vidogram/messenger/y;
    //   386: aload_0
    //   387: getstatic 3732	org/vidogram/messenger/y:v	I
    //   390: invokevirtual 4046	org/vidogram/messenger/y:a	(Ljava/lang/Object;I)V
    //   393: invokestatic 3484	org/vidogram/messenger/y:a	()Lorg/vidogram/messenger/y;
    //   396: aload_0
    //   397: getstatic 3723	org/vidogram/messenger/y:aE	I
    //   400: invokevirtual 4046	org/vidogram/messenger/y:a	(Ljava/lang/Object;I)V
    //   403: invokestatic 3484	org/vidogram/messenger/y:a	()Lorg/vidogram/messenger/y;
    //   406: aload_0
    //   407: getstatic 3714	org/vidogram/messenger/y:aF	I
    //   410: invokevirtual 4046	org/vidogram/messenger/y:a	(Ljava/lang/Object;I)V
    //   413: invokestatic 3484	org/vidogram/messenger/y:a	()Lorg/vidogram/messenger/y;
    //   416: aload_0
    //   417: getstatic 3716	org/vidogram/messenger/y:aG	I
    //   420: invokevirtual 4046	org/vidogram/messenger/y:a	(Ljava/lang/Object;I)V
    //   423: invokestatic 3484	org/vidogram/messenger/y:a	()Lorg/vidogram/messenger/y;
    //   426: aload_0
    //   427: getstatic 3734	org/vidogram/messenger/y:aL	I
    //   430: invokevirtual 4046	org/vidogram/messenger/y:a	(Ljava/lang/Object;I)V
    //   433: invokestatic 3484	org/vidogram/messenger/y:a	()Lorg/vidogram/messenger/y;
    //   436: aload_0
    //   437: getstatic 3737	org/vidogram/messenger/y:y	I
    //   440: invokevirtual 4046	org/vidogram/messenger/y:a	(Ljava/lang/Object;I)V
    //   443: invokestatic 3484	org/vidogram/messenger/y:a	()Lorg/vidogram/messenger/y;
    //   446: aload_0
    //   447: getstatic 3741	org/vidogram/messenger/y:aC	I
    //   450: invokevirtual 4046	org/vidogram/messenger/y:a	(Ljava/lang/Object;I)V
    //   453: invokestatic 3484	org/vidogram/messenger/y:a	()Lorg/vidogram/messenger/y;
    //   456: aload_0
    //   457: getstatic 3746	org/vidogram/messenger/y:B	I
    //   460: invokevirtual 4046	org/vidogram/messenger/y:a	(Ljava/lang/Object;I)V
    //   463: invokestatic 3484	org/vidogram/messenger/y:a	()Lorg/vidogram/messenger/y;
    //   466: aload_0
    //   467: getstatic 3748	org/vidogram/messenger/y:aO	I
    //   470: invokevirtual 4046	org/vidogram/messenger/y:a	(Ljava/lang/Object;I)V
    //   473: invokestatic 3484	org/vidogram/messenger/y:a	()Lorg/vidogram/messenger/y;
    //   476: aload_0
    //   477: getstatic 3750	org/vidogram/messenger/y:E	I
    //   480: invokevirtual 4046	org/vidogram/messenger/y:a	(Ljava/lang/Object;I)V
    //   483: invokestatic 3484	org/vidogram/messenger/y:a	()Lorg/vidogram/messenger/y;
    //   486: aload_0
    //   487: getstatic 3751	org/vidogram/messenger/y:G	I
    //   490: invokevirtual 4046	org/vidogram/messenger/y:a	(Ljava/lang/Object;I)V
    //   493: invokestatic 3484	org/vidogram/messenger/y:a	()Lorg/vidogram/messenger/y;
    //   496: aload_0
    //   497: getstatic 3762	org/vidogram/messenger/y:w	I
    //   500: invokevirtual 4046	org/vidogram/messenger/y:a	(Ljava/lang/Object;I)V
    //   503: invokestatic 3484	org/vidogram/messenger/y:a	()Lorg/vidogram/messenger/y;
    //   506: aload_0
    //   507: getstatic 3764	org/vidogram/messenger/y:K	I
    //   510: invokevirtual 4046	org/vidogram/messenger/y:a	(Ljava/lang/Object;I)V
    //   513: invokestatic 3484	org/vidogram/messenger/y:a	()Lorg/vidogram/messenger/y;
    //   516: aload_0
    //   517: getstatic 3768	org/vidogram/messenger/y:N	I
    //   520: invokevirtual 4046	org/vidogram/messenger/y:a	(Ljava/lang/Object;I)V
    //   523: invokestatic 3484	org/vidogram/messenger/y:a	()Lorg/vidogram/messenger/y;
    //   526: aload_0
    //   527: getstatic 3774	org/vidogram/messenger/y:O	I
    //   530: invokevirtual 4046	org/vidogram/messenger/y:a	(Ljava/lang/Object;I)V
    //   533: invokestatic 3484	org/vidogram/messenger/y:a	()Lorg/vidogram/messenger/y;
    //   536: aload_0
    //   537: getstatic 3787	org/vidogram/messenger/y:S	I
    //   540: invokevirtual 4046	org/vidogram/messenger/y:a	(Ljava/lang/Object;I)V
    //   543: invokestatic 3484	org/vidogram/messenger/y:a	()Lorg/vidogram/messenger/y;
    //   546: aload_0
    //   547: getstatic 3791	org/vidogram/messenger/y:T	I
    //   550: invokevirtual 4046	org/vidogram/messenger/y:a	(Ljava/lang/Object;I)V
    //   553: invokestatic 3484	org/vidogram/messenger/y:a	()Lorg/vidogram/messenger/y;
    //   556: aload_0
    //   557: getstatic 3489	org/vidogram/messenger/y:V	I
    //   560: invokevirtual 4046	org/vidogram/messenger/y:a	(Ljava/lang/Object;I)V
    //   563: invokestatic 3484	org/vidogram/messenger/y:a	()Lorg/vidogram/messenger/y;
    //   566: aload_0
    //   567: getstatic 3797	org/vidogram/messenger/y:W	I
    //   570: invokevirtual 4046	org/vidogram/messenger/y:a	(Ljava/lang/Object;I)V
    //   573: invokestatic 3484	org/vidogram/messenger/y:a	()Lorg/vidogram/messenger/y;
    //   576: aload_0
    //   577: getstatic 3799	org/vidogram/messenger/y:Z	I
    //   580: invokevirtual 4046	org/vidogram/messenger/y:a	(Ljava/lang/Object;I)V
    //   583: invokestatic 3484	org/vidogram/messenger/y:a	()Lorg/vidogram/messenger/y;
    //   586: aload_0
    //   587: getstatic 3696	org/vidogram/messenger/y:o	I
    //   590: invokevirtual 4046	org/vidogram/messenger/y:a	(Ljava/lang/Object;I)V
    //   593: invokestatic 3484	org/vidogram/messenger/y:a	()Lorg/vidogram/messenger/y;
    //   596: aload_0
    //   597: getstatic 3766	org/vidogram/messenger/y:L	I
    //   600: invokevirtual 4046	org/vidogram/messenger/y:a	(Ljava/lang/Object;I)V
    //   603: invokestatic 3484	org/vidogram/messenger/y:a	()Lorg/vidogram/messenger/y;
    //   606: aload_0
    //   607: getstatic 3808	org/vidogram/messenger/y:ac	I
    //   610: invokevirtual 4046	org/vidogram/messenger/y:a	(Ljava/lang/Object;I)V
    //   613: invokestatic 3484	org/vidogram/messenger/y:a	()Lorg/vidogram/messenger/y;
    //   616: aload_0
    //   617: getstatic 3810	org/vidogram/messenger/y:ag	I
    //   620: invokevirtual 4046	org/vidogram/messenger/y:a	(Ljava/lang/Object;I)V
    //   623: aload_0
    //   624: invokespecial 4047	org/vidogram/ui/a/g:f	()Z
    //   627: pop
    //   628: aload_0
    //   629: getfield 699	org/vidogram/ui/q:k	Lorg/vidogram/tgnet/g$t;
    //   632: ifnonnull +17 -> 649
    //   635: aload_0
    //   636: getfield 1552	org/vidogram/ui/q:bs	Z
    //   639: ifne +10 -> 649
    //   642: aload_0
    //   643: getfield 1029	org/vidogram/ui/q:bq	J
    //   646: invokestatic 4049	org/vidogram/messenger/d/a:a	(J)V
    //   649: aload_0
    //   650: iconst_1
    //   651: putfield 936	org/vidogram/ui/q:bH	Z
    //   654: invokestatic 654	org/vidogram/messenger/v:a	()Lorg/vidogram/messenger/v;
    //   657: aload_0
    //   658: getfield 1029	org/vidogram/ui/q:bq	J
    //   661: aload_0
    //   662: getfield 625	org/vidogram/ui/q:j	Lorg/vidogram/tgnet/g$vw;
    //   665: aload_0
    //   666: getfield 1039	org/vidogram/ui/q:i	Lorg/vidogram/tgnet/g$i;
    //   669: invokevirtual 4052	org/vidogram/messenger/v:c	(JLorg/vidogram/tgnet/g$vw;Lorg/vidogram/tgnet/g$i;)V
    //   672: invokestatic 654	org/vidogram/messenger/v:a	()Lorg/vidogram/messenger/v;
    //   675: aload_0
    //   676: getfield 1029	org/vidogram/ui/q:bq	J
    //   679: iconst_1
    //   680: invokevirtual 4053	org/vidogram/messenger/v:a	(JZ)V
    //   683: aload_0
    //   684: getfield 942	org/vidogram/ui/q:bM	I
    //   687: ifeq +811 -> 1498
    //   690: aload_0
    //   691: iconst_1
    //   692: putfield 944	org/vidogram/ui/q:bN	Z
    //   695: aload_0
    //   696: getfield 491	org/vidogram/ui/q:bw	Ljava/util/ArrayList;
    //   699: aload_0
    //   700: getfield 1502	org/vidogram/ui/q:br	I
    //   703: invokestatic 662	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   706: invokevirtual 1388	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   709: pop
    //   710: iload 5
    //   712: ifeq +707 -> 1419
    //   715: aload_0
    //   716: iload 5
    //   718: i2l
    //   719: putfield 566	org/vidogram/ui/q:bL	J
    //   722: invokestatic 654	org/vidogram/messenger/v:a	()Lorg/vidogram/messenger/v;
    //   725: astore 10
    //   727: aload_0
    //   728: getfield 566	org/vidogram/ui/q:bL	J
    //   731: lstore 8
    //   733: invokestatic 1504	org/vidogram/messenger/a:c	()Z
    //   736: ifeq +677 -> 1413
    //   739: aload_0
    //   740: getfield 942	org/vidogram/ui/q:bM	I
    //   743: istore_3
    //   744: aload_0
    //   745: getfield 573	org/vidogram/ui/q:e	I
    //   748: istore 4
    //   750: aload_0
    //   751: getfield 1039	org/vidogram/ui/q:i	Lorg/vidogram/tgnet/g$i;
    //   754: invokestatic 1235	org/vidogram/messenger/e:d	(Lorg/vidogram/tgnet/g$i;)Z
    //   757: istore 6
    //   759: aload_0
    //   760: getfield 1502	org/vidogram/ui/q:br	I
    //   763: istore 5
    //   765: aload_0
    //   766: iload 5
    //   768: iconst_1
    //   769: iadd
    //   770: putfield 1502	org/vidogram/ui/q:br	I
    //   773: aload 10
    //   775: lload 8
    //   777: iload_1
    //   778: iload_3
    //   779: iconst_1
    //   780: iconst_0
    //   781: iload 4
    //   783: iconst_3
    //   784: iconst_0
    //   785: iload 6
    //   787: iload 5
    //   789: invokevirtual 1507	org/vidogram/messenger/v:a	(JIIZIIIIZI)V
    //   792: aload_0
    //   793: getfield 1039	org/vidogram/ui/q:i	Lorg/vidogram/tgnet/g$i;
    //   796: ifnull +62 -> 858
    //   799: aconst_null
    //   800: astore 10
    //   802: aload_0
    //   803: getfield 1552	org/vidogram/ui/q:bs	Z
    //   806: ifeq +13 -> 819
    //   809: new 4027	java/util/concurrent/Semaphore
    //   812: dup
    //   813: iconst_0
    //   814: invokespecial 4029	java/util/concurrent/Semaphore:<init>	(I)V
    //   817: astore 10
    //   819: invokestatic 654	org/vidogram/messenger/v:a	()Lorg/vidogram/messenger/v;
    //   822: aload_0
    //   823: getfield 1039	org/vidogram/ui/q:i	Lorg/vidogram/tgnet/g$i;
    //   826: getfield 1204	org/vidogram/tgnet/g$i:h	I
    //   829: aload 10
    //   831: aload_0
    //   832: getfield 1039	org/vidogram/ui/q:i	Lorg/vidogram/tgnet/g$i;
    //   835: invokestatic 1235	org/vidogram/messenger/e:d	(Lorg/vidogram/tgnet/g$i;)Z
    //   838: invokevirtual 4056	org/vidogram/messenger/v:a	(ILjava/util/concurrent/Semaphore;Z)V
    //   841: aload_0
    //   842: getfield 1552	org/vidogram/ui/q:bs	Z
    //   845: ifeq +13 -> 858
    //   848: aload 10
    //   850: ifnull +8 -> 858
    //   853: aload 10
    //   855: invokevirtual 4038	java/util/concurrent/Semaphore:acquire	()V
    //   858: iload_2
    //   859: ifeq +739 -> 1598
    //   862: aload_0
    //   863: getfield 625	org/vidogram/ui/q:j	Lorg/vidogram/tgnet/g$vw;
    //   866: getfield 629	org/vidogram/tgnet/g$vw:r	Z
    //   869: ifeq +729 -> 1598
    //   872: iload_2
    //   873: iconst_1
    //   874: aload_0
    //   875: getfield 573	org/vidogram/ui/q:e	I
    //   878: invokestatic 3691	org/vidogram/messenger/d/a:a	(IZI)V
    //   881: aload_0
    //   882: getfield 625	org/vidogram/ui/q:j	Lorg/vidogram/tgnet/g$vw;
    //   885: ifnull +26 -> 911
    //   888: aload_0
    //   889: invokestatic 654	org/vidogram/messenger/v:a	()Lorg/vidogram/messenger/v;
    //   892: getfield 3739	org/vidogram/messenger/v:q	Ljava/util/ArrayList;
    //   895: aload_0
    //   896: getfield 625	org/vidogram/ui/q:j	Lorg/vidogram/tgnet/g$vw;
    //   899: getfield 1101	org/vidogram/tgnet/g$vw:d	I
    //   902: invokestatic 662	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   905: invokevirtual 3577	java/util/ArrayList:contains	(Ljava/lang/Object;)Z
    //   908: putfield 465	org/vidogram/ui/q:q	Z
    //   911: invokestatic 1504	org/vidogram/messenger/a:c	()Z
    //   914: ifeq +33 -> 947
    //   917: invokestatic 3484	org/vidogram/messenger/y:a	()Lorg/vidogram/messenger/y;
    //   920: getstatic 4058	org/vidogram/messenger/y:z	I
    //   923: iconst_2
    //   924: anewarray 994	java/lang/Object
    //   927: dup
    //   928: iconst_0
    //   929: aload_0
    //   930: getfield 1029	org/vidogram/ui/q:bq	J
    //   933: invokestatic 1385	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   936: aastore
    //   937: dup
    //   938: iconst_1
    //   939: iconst_0
    //   940: invokestatic 546	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   943: aastore
    //   944: invokevirtual 4060	org/vidogram/messenger/y:a	(I[Ljava/lang/Object;)V
    //   947: aload_0
    //   948: getfield 699	org/vidogram/ui/q:k	Lorg/vidogram/tgnet/g$t;
    //   951: ifnull +29 -> 980
    //   954: aload_0
    //   955: getfield 699	org/vidogram/ui/q:k	Lorg/vidogram/tgnet/g$t;
    //   958: getfield 703	org/vidogram/tgnet/g$t:o	I
    //   961: invokestatic 4062	org/vidogram/messenger/a:b	(I)I
    //   964: bipush 46
    //   966: if_icmpeq +14 -> 980
    //   969: invokestatic 4067	org/vidogram/messenger/ab:a	()Lorg/vidogram/messenger/ab;
    //   972: aload_0
    //   973: getfield 699	org/vidogram/ui/q:k	Lorg/vidogram/tgnet/g$t;
    //   976: aconst_null
    //   977: invokevirtual 4070	org/vidogram/messenger/ab:b	(Lorg/vidogram/tgnet/g$t;Lorg/vidogram/tgnet/g$ar;)V
    //   980: iconst_1
    //   981: istore 6
    //   983: iload 6
    //   985: ireturn
    //   986: astore 10
    //   988: ldc_w 2260
    //   991: aload 10
    //   993: invokestatic 2265	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   996: goto -823 -> 173
    //   999: aload_0
    //   1000: iconst_1
    //   1001: putfield 1552	org/vidogram/ui/q:bs	Z
    //   1004: aload_0
    //   1005: iload_3
    //   1006: invokestatic 4073	org/vidogram/messenger/a:a	(I)J
    //   1009: putfield 1029	org/vidogram/ui/q:bq	J
    //   1012: goto -806 -> 206
    //   1015: iload_2
    //   1016: ifeq +135 -> 1151
    //   1019: aload_0
    //   1020: invokestatic 654	org/vidogram/messenger/v:a	()Lorg/vidogram/messenger/v;
    //   1023: iload_2
    //   1024: invokestatic 662	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1027: invokevirtual 665	org/vidogram/messenger/v:a	(Ljava/lang/Integer;)Lorg/vidogram/tgnet/g$vw;
    //   1030: putfield 625	org/vidogram/ui/q:j	Lorg/vidogram/tgnet/g$vw;
    //   1033: aload_0
    //   1034: getfield 625	org/vidogram/ui/q:j	Lorg/vidogram/tgnet/g$vw;
    //   1037: ifnonnull +61 -> 1098
    //   1040: new 4027	java/util/concurrent/Semaphore
    //   1043: dup
    //   1044: iconst_0
    //   1045: invokespecial 4029	java/util/concurrent/Semaphore:<init>	(I)V
    //   1048: astore 11
    //   1050: invokestatic 1492	org/vidogram/messenger/w:a	()Lorg/vidogram/messenger/w;
    //   1053: invokevirtual 4032	org/vidogram/messenger/w:c	()Lorg/vidogram/messenger/h;
    //   1056: new 118	org/vidogram/ui/q$45
    //   1059: dup
    //   1060: aload_0
    //   1061: iload_2
    //   1062: aload 11
    //   1064: invokespecial 4074	org/vidogram/ui/q$45:<init>	(Lorg/vidogram/ui/q;ILjava/util/concurrent/Semaphore;)V
    //   1067: invokevirtual 1723	org/vidogram/messenger/h:b	(Ljava/lang/Runnable;)V
    //   1070: aload 11
    //   1072: invokevirtual 4038	java/util/concurrent/Semaphore:acquire	()V
    //   1075: iload 7
    //   1077: istore 6
    //   1079: aload_0
    //   1080: getfield 625	org/vidogram/ui/q:j	Lorg/vidogram/tgnet/g$vw;
    //   1083: ifnull -100 -> 983
    //   1086: invokestatic 654	org/vidogram/messenger/v:a	()Lorg/vidogram/messenger/v;
    //   1089: aload_0
    //   1090: getfield 625	org/vidogram/ui/q:j	Lorg/vidogram/tgnet/g$vw;
    //   1093: iconst_1
    //   1094: invokevirtual 4077	org/vidogram/messenger/v:a	(Lorg/vidogram/tgnet/g$vw;Z)Z
    //   1097: pop
    //   1098: aload_0
    //   1099: iload_2
    //   1100: i2l
    //   1101: putfield 1029	org/vidogram/ui/q:bq	J
    //   1104: aload_0
    //   1105: aload_0
    //   1106: getfield 4016	org/vidogram/ui/q:f	Landroid/os/Bundle;
    //   1109: ldc_w 4079
    //   1112: invokevirtual 4003	android/os/Bundle:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   1115: putfield 1280	org/vidogram/ui/q:ca	Ljava/lang/String;
    //   1118: aload 10
    //   1120: ifnull -896 -> 224
    //   1123: invokestatic 654	org/vidogram/messenger/v:a	()Lorg/vidogram/messenger/v;
    //   1126: aload_0
    //   1127: getfield 625	org/vidogram/ui/q:j	Lorg/vidogram/tgnet/g$vw;
    //   1130: aload 10
    //   1132: invokevirtual 3879	org/vidogram/messenger/v:a	(Lorg/vidogram/tgnet/g$vw;Ljava/lang/String;)V
    //   1135: goto -911 -> 224
    //   1138: astore 11
    //   1140: ldc_w 2260
    //   1143: aload 11
    //   1145: invokestatic 2265	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   1148: goto -73 -> 1075
    //   1151: iload 7
    //   1153: istore 6
    //   1155: iload 4
    //   1157: ifeq -174 -> 983
    //   1160: aload_0
    //   1161: invokestatic 654	org/vidogram/messenger/v:a	()Lorg/vidogram/messenger/v;
    //   1164: iload 4
    //   1166: invokestatic 662	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1169: invokevirtual 4082	org/vidogram/messenger/v:c	(Ljava/lang/Integer;)Lorg/vidogram/tgnet/g$t;
    //   1172: putfield 699	org/vidogram/ui/q:k	Lorg/vidogram/tgnet/g$t;
    //   1175: aload_0
    //   1176: getfield 699	org/vidogram/ui/q:k	Lorg/vidogram/tgnet/g$t;
    //   1179: ifnonnull +61 -> 1240
    //   1182: new 4027	java/util/concurrent/Semaphore
    //   1185: dup
    //   1186: iconst_0
    //   1187: invokespecial 4029	java/util/concurrent/Semaphore:<init>	(I)V
    //   1190: astore 10
    //   1192: invokestatic 1492	org/vidogram/messenger/w:a	()Lorg/vidogram/messenger/w;
    //   1195: invokevirtual 4032	org/vidogram/messenger/w:c	()Lorg/vidogram/messenger/h;
    //   1198: new 152	org/vidogram/ui/q$56
    //   1201: dup
    //   1202: aload_0
    //   1203: iload 4
    //   1205: aload 10
    //   1207: invokespecial 4083	org/vidogram/ui/q$56:<init>	(Lorg/vidogram/ui/q;ILjava/util/concurrent/Semaphore;)V
    //   1210: invokevirtual 1723	org/vidogram/messenger/h:b	(Ljava/lang/Runnable;)V
    //   1213: aload 10
    //   1215: invokevirtual 4038	java/util/concurrent/Semaphore:acquire	()V
    //   1218: iload 7
    //   1220: istore 6
    //   1222: aload_0
    //   1223: getfield 699	org/vidogram/ui/q:k	Lorg/vidogram/tgnet/g$t;
    //   1226: ifnull -243 -> 983
    //   1229: invokestatic 654	org/vidogram/messenger/v:a	()Lorg/vidogram/messenger/v;
    //   1232: aload_0
    //   1233: getfield 699	org/vidogram/ui/q:k	Lorg/vidogram/tgnet/g$t;
    //   1236: iconst_1
    //   1237: invokevirtual 4086	org/vidogram/messenger/v:a	(Lorg/vidogram/tgnet/g$t;Z)V
    //   1240: aload_0
    //   1241: invokestatic 654	org/vidogram/messenger/v:a	()Lorg/vidogram/messenger/v;
    //   1244: aload_0
    //   1245: getfield 699	org/vidogram/ui/q:k	Lorg/vidogram/tgnet/g$t;
    //   1248: getfield 4088	org/vidogram/tgnet/g$t:m	I
    //   1251: invokestatic 662	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1254: invokevirtual 665	org/vidogram/messenger/v:a	(Ljava/lang/Integer;)Lorg/vidogram/tgnet/g$vw;
    //   1257: putfield 625	org/vidogram/ui/q:j	Lorg/vidogram/tgnet/g$vw;
    //   1260: aload_0
    //   1261: getfield 625	org/vidogram/ui/q:j	Lorg/vidogram/tgnet/g$vw;
    //   1264: ifnonnull +60 -> 1324
    //   1267: new 4027	java/util/concurrent/Semaphore
    //   1270: dup
    //   1271: iconst_0
    //   1272: invokespecial 4029	java/util/concurrent/Semaphore:<init>	(I)V
    //   1275: astore 10
    //   1277: invokestatic 1492	org/vidogram/messenger/w:a	()Lorg/vidogram/messenger/w;
    //   1280: invokevirtual 4032	org/vidogram/messenger/w:c	()Lorg/vidogram/messenger/h;
    //   1283: new 176	org/vidogram/ui/q$65
    //   1286: dup
    //   1287: aload_0
    //   1288: aload 10
    //   1290: invokespecial 4091	org/vidogram/ui/q$65:<init>	(Lorg/vidogram/ui/q;Ljava/util/concurrent/Semaphore;)V
    //   1293: invokevirtual 1723	org/vidogram/messenger/h:b	(Ljava/lang/Runnable;)V
    //   1296: aload 10
    //   1298: invokevirtual 4038	java/util/concurrent/Semaphore:acquire	()V
    //   1301: iload 7
    //   1303: istore 6
    //   1305: aload_0
    //   1306: getfield 625	org/vidogram/ui/q:j	Lorg/vidogram/tgnet/g$vw;
    //   1309: ifnull -326 -> 983
    //   1312: invokestatic 654	org/vidogram/messenger/v:a	()Lorg/vidogram/messenger/v;
    //   1315: aload_0
    //   1316: getfield 625	org/vidogram/ui/q:j	Lorg/vidogram/tgnet/g$vw;
    //   1319: iconst_1
    //   1320: invokevirtual 4077	org/vidogram/messenger/v:a	(Lorg/vidogram/tgnet/g$vw;Z)Z
    //   1323: pop
    //   1324: aload_0
    //   1325: iload 4
    //   1327: i2l
    //   1328: bipush 32
    //   1330: lshl
    //   1331: putfield 1029	org/vidogram/ui/q:bq	J
    //   1334: aload_0
    //   1335: getfield 500	org/vidogram/ui/q:bA	[I
    //   1338: astore 10
    //   1340: aload_0
    //   1341: getfield 500	org/vidogram/ui/q:bA	[I
    //   1344: iconst_1
    //   1345: ldc_w 501
    //   1348: iastore
    //   1349: aload 10
    //   1351: iconst_0
    //   1352: ldc_w 501
    //   1355: iastore
    //   1356: aload_0
    //   1357: getfield 503	org/vidogram/ui/q:bB	[I
    //   1360: astore 10
    //   1362: aload_0
    //   1363: getfield 503	org/vidogram/ui/q:bB	[I
    //   1366: iconst_1
    //   1367: ldc_w 498
    //   1370: iastore
    //   1371: aload 10
    //   1373: iconst_0
    //   1374: ldc_w 498
    //   1377: iastore
    //   1378: invokestatic 1365	org/vidogram/messenger/MediaController:a	()Lorg/vidogram/messenger/MediaController;
    //   1381: invokevirtual 4092	org/vidogram/messenger/MediaController:e	()V
    //   1384: goto -1160 -> 224
    //   1387: astore 10
    //   1389: ldc_w 2260
    //   1392: aload 10
    //   1394: invokestatic 2265	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   1397: goto -179 -> 1218
    //   1400: astore 10
    //   1402: ldc_w 2260
    //   1405: aload 10
    //   1407: invokestatic 2265	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   1410: goto -109 -> 1301
    //   1413: bipush 20
    //   1415: istore_1
    //   1416: goto -677 -> 739
    //   1419: invokestatic 654	org/vidogram/messenger/v:a	()Lorg/vidogram/messenger/v;
    //   1422: astore 10
    //   1424: aload_0
    //   1425: getfield 1029	org/vidogram/ui/q:bq	J
    //   1428: lstore 8
    //   1430: invokestatic 1504	org/vidogram/messenger/a:c	()Z
    //   1433: ifeq +59 -> 1492
    //   1436: aload_0
    //   1437: getfield 942	org/vidogram/ui/q:bM	I
    //   1440: istore_3
    //   1441: aload_0
    //   1442: getfield 573	org/vidogram/ui/q:e	I
    //   1445: istore 4
    //   1447: aload_0
    //   1448: getfield 1039	org/vidogram/ui/q:i	Lorg/vidogram/tgnet/g$i;
    //   1451: invokestatic 1235	org/vidogram/messenger/e:d	(Lorg/vidogram/tgnet/g$i;)Z
    //   1454: istore 6
    //   1456: aload_0
    //   1457: getfield 1502	org/vidogram/ui/q:br	I
    //   1460: istore 5
    //   1462: aload_0
    //   1463: iload 5
    //   1465: iconst_1
    //   1466: iadd
    //   1467: putfield 1502	org/vidogram/ui/q:br	I
    //   1470: aload 10
    //   1472: lload 8
    //   1474: iload_1
    //   1475: iload_3
    //   1476: iconst_1
    //   1477: iconst_0
    //   1478: iload 4
    //   1480: iconst_3
    //   1481: iconst_0
    //   1482: iload 6
    //   1484: iload 5
    //   1486: invokevirtual 1507	org/vidogram/messenger/v:a	(JIIZIIIIZI)V
    //   1489: goto -697 -> 792
    //   1492: bipush 20
    //   1494: istore_1
    //   1495: goto -59 -> 1436
    //   1498: aload_0
    //   1499: getfield 491	org/vidogram/ui/q:bw	Ljava/util/ArrayList;
    //   1502: aload_0
    //   1503: getfield 1502	org/vidogram/ui/q:br	I
    //   1506: invokestatic 662	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1509: invokevirtual 1388	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   1512: pop
    //   1513: invokestatic 654	org/vidogram/messenger/v:a	()Lorg/vidogram/messenger/v;
    //   1516: astore 10
    //   1518: aload_0
    //   1519: getfield 1029	org/vidogram/ui/q:bq	J
    //   1522: lstore 8
    //   1524: invokestatic 1504	org/vidogram/messenger/a:c	()Z
    //   1527: ifeq +52 -> 1579
    //   1530: aload_0
    //   1531: getfield 573	org/vidogram/ui/q:e	I
    //   1534: istore_3
    //   1535: aload_0
    //   1536: getfield 1039	org/vidogram/ui/q:i	Lorg/vidogram/tgnet/g$i;
    //   1539: invokestatic 1235	org/vidogram/messenger/e:d	(Lorg/vidogram/tgnet/g$i;)Z
    //   1542: istore 6
    //   1544: aload_0
    //   1545: getfield 1502	org/vidogram/ui/q:br	I
    //   1548: istore 4
    //   1550: aload_0
    //   1551: iload 4
    //   1553: iconst_1
    //   1554: iadd
    //   1555: putfield 1502	org/vidogram/ui/q:br	I
    //   1558: aload 10
    //   1560: lload 8
    //   1562: iload_1
    //   1563: iconst_0
    //   1564: iconst_1
    //   1565: iconst_0
    //   1566: iload_3
    //   1567: iconst_2
    //   1568: iconst_0
    //   1569: iload 6
    //   1571: iload 4
    //   1573: invokevirtual 1507	org/vidogram/messenger/v:a	(JIIZIIIIZI)V
    //   1576: goto -784 -> 792
    //   1579: bipush 20
    //   1581: istore_1
    //   1582: goto -52 -> 1530
    //   1585: astore 10
    //   1587: ldc_w 2260
    //   1590: aload 10
    //   1592: invokestatic 2265	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   1595: goto -737 -> 858
    //   1598: aload_0
    //   1599: getfield 526	org/vidogram/ui/q:n	Lorg/vidogram/tgnet/g$j;
    //   1602: instanceof 631
    //   1605: ifeq -724 -> 881
    //   1608: iconst_0
    //   1609: istore_1
    //   1610: iload_1
    //   1611: aload_0
    //   1612: getfield 526	org/vidogram/ui/q:n	Lorg/vidogram/tgnet/g$j;
    //   1615: getfield 636	org/vidogram/tgnet/g$j:t	Lorg/vidogram/tgnet/g$l;
    //   1618: getfield 640	org/vidogram/tgnet/g$l:e	Ljava/util/ArrayList;
    //   1621: invokevirtual 643	java/util/ArrayList:size	()I
    //   1624: if_icmpge -743 -> 881
    //   1627: aload_0
    //   1628: getfield 526	org/vidogram/ui/q:n	Lorg/vidogram/tgnet/g$j;
    //   1631: getfield 636	org/vidogram/tgnet/g$j:t	Lorg/vidogram/tgnet/g$l;
    //   1634: getfield 640	org/vidogram/tgnet/g$l:e	Ljava/util/ArrayList;
    //   1637: iload_1
    //   1638: invokevirtual 647	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   1641: checkcast 649	org/vidogram/tgnet/g$k
    //   1644: astore 10
    //   1646: invokestatic 654	org/vidogram/messenger/v:a	()Lorg/vidogram/messenger/v;
    //   1649: aload 10
    //   1651: getfield 657	org/vidogram/tgnet/g$k:b	I
    //   1654: invokestatic 662	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1657: invokevirtual 665	org/vidogram/messenger/v:a	(Ljava/lang/Integer;)Lorg/vidogram/tgnet/g$vw;
    //   1660: astore 10
    //   1662: aload 10
    //   1664: ifnull +24 -> 1688
    //   1667: aload 10
    //   1669: getfield 629	org/vidogram/tgnet/g$vw:r	Z
    //   1672: ifeq +16 -> 1688
    //   1675: aload 10
    //   1677: getfield 1101	org/vidogram/tgnet/g$vw:d	I
    //   1680: iconst_1
    //   1681: aload_0
    //   1682: getfield 573	org/vidogram/ui/q:e	I
    //   1685: invokestatic 3691	org/vidogram/messenger/d/a:a	(IZI)V
    //   1688: iload_1
    //   1689: iconst_1
    //   1690: iadd
    //   1691: istore_1
    //   1692: goto -82 -> 1610
    //
    // Exception table:
    //   from	to	target	type
    //   168	173	986	java/lang/Exception
    //   1070	1075	1138	java/lang/Exception
    //   1213	1218	1387	java/lang/Exception
    //   1296	1301	1400	java/lang/Exception
    //   853	858	1585	java/lang/Exception
  }

  public void g()
  {
    super.g();
    if (this.l != null)
      this.l.c();
    if (this.af != null)
      this.af.f();
    org.vidogram.messenger.v.a().a(this.bq, false);
    y.a().b(this, y.g);
    y.a().b(this, y.at);
    y.a().b(this, y.b);
    y.a().b(this, y.a);
    y.a().b(this, y.d);
    y.a().b(this, y.f);
    y.a().b(this, y.e);
    y.a().b(this, y.i);
    y.a().b(this, y.h);
    y.a().b(this, y.j);
    y.a().b(this, y.n);
    y.a().b(this, y.r);
    y.a().b(this, y.s);
    y.a().b(this, y.v);
    y.a().b(this, y.k);
    y.a().b(this, y.aE);
    y.a().b(this, y.aF);
    y.a().b(this, y.aL);
    y.a().b(this, y.y);
    y.a().b(this, y.aC);
    y.a().b(this, y.B);
    y.a().b(this, y.aO);
    y.a().b(this, y.E);
    y.a().b(this, y.G);
    y.a().b(this, y.w);
    y.a().b(this, y.K);
    y.a().b(this, y.N);
    y.a().b(this, y.O);
    y.a().b(this, y.S);
    y.a().b(this, y.T);
    y.a().b(this, y.V);
    y.a().b(this, y.W);
    y.a().b(this, y.aG);
    y.a().b(this, y.Z);
    y.a().b(this, y.o);
    y.a().b(this, y.L);
    y.a().b(this, y.ac);
    y.a().b(this, y.ag);
    if (org.vidogram.messenger.a.c())
      y.a().a(y.z, new Object[] { Long.valueOf(this.bq), Boolean.valueOf(true) });
    if (this.k != null)
      MediaController.a().f();
    try
    {
      if (Build.VERSION.SDK_INT >= 23)
        l().getWindow().clearFlags(8192);
      if (this.j != null)
        org.vidogram.messenger.v.a().g(this.j.d);
      org.vidogram.messenger.a.b(l(), this.e);
      if (this.V != null)
        this.V.d();
      if (this.al != null)
        this.al.o();
      org.vidogram.messenger.a.b(l());
      if (org.vidogram.messenger.e.d(this.i))
        org.vidogram.messenger.v.a().d(this.i.h, true);
      return;
    }
    catch (Throwable localThrowable)
    {
      while (true)
        org.vidogram.messenger.n.a("tmessages", localThrowable);
    }
  }

  public boolean h()
  {
    return this.bI;
  }

  public void i()
  {
    super.i();
    org.vidogram.messenger.a.a(l(), this.e);
    MediaController.a().a(this);
    Y();
    M();
    if ((this.bd != null) && (this.ab != null))
      this.ab.a(this.bd, "50_50", (Drawable)null);
    if ((this.be != null) && (this.aw != null))
      this.aw.a(this.be, "50_50", (Drawable)null);
    z.a().a(this.bq);
    int i1;
    label207: Iterator localIterator;
    if (this.bn)
    {
      if ((!this.bp) || (this.bV == null))
        break label522;
      if (this.E != null)
      {
        if (this.bX == -9000)
        {
          i1 = Math.max(0, (this.E.getHeight() - this.bV.C()) / 2);
          this.F.a(this.m.size() - this.m.indexOf(this.bV), i1 + (-this.E.getPaddingTop() - org.vidogram.messenger.a.a(7.0F)));
        }
      }
      else
      {
        this.bp = false;
        this.bn = false;
        this.bV = null;
      }
    }
    else
    {
      this.ba = false;
      if ((this.bc) && (!this.m.isEmpty()))
        localIterator = this.m.iterator();
    }
    while (true)
    {
      u localu;
      if (localIterator.hasNext())
      {
        localu = (u)localIterator.next();
        if ((localu.m()) || (localu.j()));
      }
      else
      {
        this.bc = false;
        org.vidogram.messenger.v.a().a(this.bq, ((u)this.m.get(0)).q(), this.bm, this.bl, true, false);
        d(false);
        if (this.bb)
        {
          this.bb = false;
          if (this.G != null)
            this.G.c();
        }
        ab();
        i(false);
        if ((this.I != null) && (this.I.getVisibility() != 0))
          this.l.setFieldFocused(true);
        if (this.l != null)
          this.l.e();
        if (this.k != null)
        {
          this.cg = System.currentTimeMillis();
          this.ch = 0L;
        }
        if (this.ci != null)
          org.vidogram.messenger.a.a(new Runnable()
          {
            public void run()
            {
              q.this.a(q.bm(q.this), false, false);
              q.c(q.this, null);
            }
          });
        if ((this.E != null) && ((this.l == null) || (!this.l.j())))
        {
          this.E.setOnItemLongClickListener(this.o);
          this.E.setOnItemClickListener(this.p);
          this.E.setLongClickable(true);
        }
        D();
        return;
        if (this.bX == -10000)
        {
          i1 = 0;
          break;
        }
        i1 = this.bX;
        break;
        label522: I();
        break label207;
      }
      if (localu.j())
        continue;
      localu.o();
    }
  }

  public void j()
  {
    Object localObject2 = null;
    super.j();
    MediaController.a().b(this);
    if (this.w != null)
      this.w.c();
    if (this.al != null)
      this.al.i();
    this.ba = true;
    this.bb = true;
    z.a().a(0L);
    Object localObject1;
    boolean bool;
    if (this.l != null)
    {
      this.l.d();
      if (!this.l.j())
      {
        localObject1 = org.vidogram.messenger.a.a(this.l.getFieldText());
        if ((!TextUtils.isEmpty((CharSequence)localObject1)) && (!TextUtils.equals((CharSequence)localObject1, "@gif")))
        {
          bool = this.l.f();
          this.l.setFieldFocused(false);
        }
      }
    }
    while (true)
    {
      Object localObject3 = new CharSequence[1];
      localObject3[0] = localObject1;
      ArrayList localArrayList = org.vidogram.messenger.d.c.a(localObject3);
      long l1 = this.bq;
      localObject3 = localObject3[0];
      localObject1 = localObject2;
      if (this.aY != null)
        localObject1 = this.aY.a;
      if (!bool);
      for (bool = true; ; bool = false)
      {
        org.vidogram.messenger.d.b.a(l1, (CharSequence)localObject3, localArrayList, (g.ar)localObject1, bool);
        org.vidogram.messenger.v.a().a(0, this.bq);
        if (this.k != null)
        {
          this.ch = System.currentTimeMillis();
          Z();
        }
        return;
      }
      localObject1 = null;
      break;
      bool = true;
      localObject1 = null;
    }
  }

  public boolean k()
  {
    if ((this.d != null) && (this.d.f()))
    {
      int i1 = 1;
      while (i1 >= 0)
      {
        this.bt[i1].clear();
        this.bu[i1].clear();
        i1 -= 1;
      }
      this.l.a(null, false);
      this.d.d();
      h(true);
      this.bv = 0;
      ac();
      return false;
    }
    if ((this.l != null) && (this.l.o()))
    {
      this.l.c(true);
      return false;
    }
    return true;
  }

  public void m()
  {
    if ((this.al != null) && (this.a == this.al))
    {
      this.al.c(false);
      this.al.f();
      this.al.d(true);
      return;
    }
    super.m();
  }

  public long q()
  {
    return this.bq;
  }

  public boolean r()
  {
    int i1 = this.m.size() - 1;
    while (i1 >= 0)
    {
      Object localObject = (u)this.m.get(i1);
      if ((((u)localObject).H()) && (((u)localObject).n()) && (!((u)localObject).j()) && (((u)localObject).a.d.b == 0))
      {
        MediaController localMediaController = MediaController.a();
        if (MediaController.a().a((u)localObject));
        for (localObject = a((u)localObject, true); ; localObject = null)
        {
          localMediaController.a((ArrayList)localObject, true);
          return true;
        }
      }
      i1 -= 1;
    }
    if ((Build.VERSION.SDK_INT >= 23) && (l() != null) && (l().checkSelfPermission("android.permission.RECORD_AUDIO") != 0))
    {
      l().requestPermissions(new String[] { "android.permission.RECORD_AUDIO" }, 3);
      return true;
    }
    return false;
  }

  public g.vw s()
  {
    return this.j;
  }

  public g.i t()
  {
    return this.i;
  }

  public g.t u()
  {
    return this.k;
  }

  public g.j v()
  {
    return this.n;
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

  public class a extends RecyclerView.a
  {
    private Context b;
    private boolean c;
    private int d;
    private int e = -1;
    private int f;
    private int g;
    private int h;
    private int i;

    public a(Context arg2)
    {
      Object localObject;
      this.b = localObject;
      if ((q.this.j != null) && (q.this.j.r));
      for (boolean bool = true; ; bool = false)
      {
        this.c = bool;
        return;
      }
    }

    public int a()
    {
      return this.d;
    }

    public int a(int paramInt)
    {
      if ((paramInt >= this.h) && (paramInt < this.i))
        return ((u)q.this.m.get(q.this.m.size() - (paramInt - this.h) - 1)).g;
      if (paramInt == this.e)
        return 3;
      return 4;
    }

    public RecyclerView.u a(ViewGroup paramViewGroup, int paramInt)
    {
      paramViewGroup = null;
      Object localObject;
      if (paramInt == 0)
        if (!q.bw(q.this).isEmpty())
        {
          localObject = (View)q.bw(q.this).get(0);
          q.bw(q.this).remove(0);
          org.vidogram.ui.c.j localj = (org.vidogram.ui.c.j)localObject;
          localj.setDelegate(new j.b()
          {
            public void a(String paramString1, String paramString2, String paramString3, String paramString4, int paramInt1, int paramInt2)
            {
              h.d locald = new h.d(q.a.d(q.a.this));
              locald.a(new bt(q.a.d(q.a.this), locald.a(), paramString2, paramString3, paramString4, paramString1, paramInt1, paramInt2));
              locald.c(true);
              q.this.b(locald.a());
            }

            public void a(u paramu, ClickableSpan paramClickableSpan, boolean paramBoolean)
            {
              boolean bool = true;
              if (paramClickableSpan == null);
              do
              {
                while (true)
                {
                  return;
                  if ((paramClickableSpan instanceof URLSpanUserMention))
                  {
                    paramu = org.vidogram.messenger.v.a().a(Utilities.a(((URLSpanUserMention)paramClickableSpan).getURL()));
                    if (paramu == null)
                      continue;
                    org.vidogram.messenger.v.a(paramu, null, q.this, 0, false);
                    return;
                  }
                  if (!(paramClickableSpan instanceof URLSpanNoUnderline))
                    break;
                  paramClickableSpan = ((URLSpanNoUnderline)paramClickableSpan).getURL();
                  if (paramClickableSpan.startsWith("@"))
                  {
                    org.vidogram.messenger.v.a(paramClickableSpan.substring(1), q.this, 0);
                    return;
                  }
                  if (paramClickableSpan.startsWith("#"))
                  {
                    if (org.vidogram.messenger.e.d(q.this.i))
                    {
                      q.a(q.this, paramClickableSpan);
                      return;
                    }
                    paramu = new v(null);
                    paramu.a(paramClickableSpan);
                    q.this.a(paramu);
                    return;
                  }
                  if ((!paramClickableSpan.startsWith("/")) || (!URLSpanBotCommand.a))
                    continue;
                  localObject = q.this.l;
                  if ((q.this.i != null) && (q.this.i.r));
                  for (bool = true; ; bool = false)
                  {
                    ((org.vidogram.ui.Components.e)localObject).a(paramu, paramClickableSpan, paramBoolean, bool);
                    return;
                  }
                }
                paramu = ((URLSpan)paramClickableSpan).getURL();
                if (!paramBoolean)
                  continue;
                paramClickableSpan = new h.d(q.this.l());
                paramClickableSpan.a(paramu);
                Object localObject = org.vidogram.messenger.r.a("Open", 2131231616);
                String str = org.vidogram.messenger.r.a("Copy", 2131231088);
                paramu = new DialogInterface.OnClickListener(paramu)
                {
                  public void onClick(DialogInterface paramDialogInterface, int paramInt)
                  {
                    boolean bool = true;
                    if (paramInt == 0)
                    {
                      paramDialogInterface = q.this.l();
                      str = this.a;
                      if (q.bu(q.this) == 0L)
                        org.vidogram.messenger.b.a.a(paramDialogInterface, str, bool);
                    }
                    do
                    {
                      return;
                      bool = false;
                      break;
                    }
                    while (paramInt != 1);
                    String str = this.a;
                    if (str.startsWith("mailto:"))
                      paramDialogInterface = str.substring(7);
                    while (true)
                    {
                      org.vidogram.messenger.a.b(paramDialogInterface);
                      return;
                      paramDialogInterface = str;
                      if (!str.startsWith("tel:"))
                        continue;
                      paramDialogInterface = str.substring(4);
                    }
                  }
                };
                paramClickableSpan.a(new CharSequence[] { localObject, str }, paramu);
                q.this.b(paramClickableSpan.a());
                return;
              }
              while (!((URLSpan)paramClickableSpan).getURL().contains(""));
              if ((paramClickableSpan instanceof URLSpanReplacement))
              {
                q.this.a(((URLSpanReplacement)paramClickableSpan).getURL(), true);
                return;
              }
              if ((paramClickableSpan instanceof URLSpan))
              {
                paramClickableSpan = q.this.l();
                if (q.bu(q.this) == 0L);
                for (paramBoolean = bool; ; paramBoolean = false)
                {
                  org.vidogram.messenger.b.a.a(paramClickableSpan, paramu, paramBoolean);
                  return;
                }
              }
              paramClickableSpan.onClick(q.bC(q.this));
            }

            public void a(org.vidogram.ui.c.j paramj)
            {
              paramj = paramj.getMessageObject();
              if (paramj.a.y != 0)
                org.vidogram.messenger.ac.a().a(paramj);
            }

            public void a(org.vidogram.ui.c.j paramj, int paramInt)
            {
              paramj = paramj.getMessageObject();
              q localq = q.this;
              int j = paramj.q();
              if (paramj.u() == q.B(q.this));
              for (int i = 1; ; i = 0)
              {
                q.a(localq, paramInt, j, true, i);
                return;
              }
            }

            public void a(org.vidogram.ui.c.j paramj, String paramString)
            {
              if (((q.bz(q.this) != null) && (q.bz(q.this).getVisibility() == 0)) || ((q.bD(q.this) != null) && (q.bD(q.this).getVisibility() == 0)));
              do
                return;
              while ((q.this.l == null) || (paramString == null) || (paramString.length() <= 0));
              q.this.l.setFieldText("@" + paramString + " ");
              q.this.l.m();
            }

            public void a(org.vidogram.ui.c.j paramj, g.aq paramaq)
            {
              if ((q.this.l() == null) || ((q.bz(q.this).getVisibility() == 0) && (!(paramaq instanceof g.md)) && (!(paramaq instanceof g.ly)) && (!(paramaq instanceof g.lz)) && (!(paramaq instanceof g.me))))
                return;
              q.this.l.a(paramaq, paramj.getMessageObject(), paramj.getMessageObject());
            }

            public void a(org.vidogram.ui.c.j paramj, g.i parami, int paramInt)
            {
              if (q.bx(q.this).f())
                q.a(q.this, paramj);
              do
              {
                do
                  return;
                while ((parami == null) || (parami == q.this.i));
                paramj = new Bundle();
                paramj.putInt("chat_id", parami.h);
                if (paramInt == 0)
                  continue;
                paramj.putInt("message_id", paramInt);
              }
              while (!org.vidogram.messenger.v.a(paramj, q.this));
              q.this.a(new q(paramj), true);
            }

            public void a(org.vidogram.ui.c.j paramj, g.vw paramvw)
            {
              if (q.by(q.this).f())
                q.a(q.this, paramj);
              do
                return;
              while ((paramvw == null) || (paramvw.d == org.vidogram.messenger.ad.c()));
              paramj = new Bundle();
              paramj.putInt("user_id", paramvw.d);
              paramj = new aq(paramj);
              if ((q.this.j != null) && (q.this.j.d == paramvw.d));
              for (boolean bool = true; ; bool = false)
              {
                paramj.b(bool);
                q.this.a(paramj);
                return;
              }
            }

            public boolean a()
            {
              return (q.bA(q.this) != null) && (!q.bB(q.this).f());
            }

            public boolean a(u paramu)
            {
              if (paramu.H())
              {
                boolean bool = MediaController.a().a(paramu);
                MediaController localMediaController = MediaController.a();
                if (bool);
                for (paramu = q.a(q.this, paramu, false); ; paramu = null)
                {
                  localMediaController.a(paramu, false);
                  return bool;
                }
              }
              if (paramu.G())
                return MediaController.a().a(q.this.m, paramu);
              return false;
            }

            public void b(org.vidogram.ui.c.j paramj)
            {
              q.a(q.this, paramj, false);
            }

            public void c(org.vidogram.ui.c.j paramj)
            {
              Object localObject2 = paramj.getMessageObject();
              label26: if (((u)localObject2).w())
              {
                q.a(q.this, paramj, false);
                break label26;
              }
              Object localObject1;
              label282: label286: 
              while (true)
              {
                return;
                if (((u)localObject2).v())
                  continue;
                if (((u)localObject2).f == 13)
                {
                  localObject1 = q.this;
                  Activity localActivity = q.this.l();
                  q localq = q.this;
                  localObject2 = ((u)localObject2).R();
                  if (q.bz(q.this).getVisibility() != 0);
                  for (paramj = q.this.l; ; paramj = null)
                  {
                    ((q)localObject1).b(new bl(localActivity, localq, (g.an)localObject2, null, paramj));
                    return;
                  }
                }
                if (((Build.VERSION.SDK_INT < 16) || (!((u)localObject2).I())) && (((u)localObject2).f != 1) && ((((u)localObject2).f != 0) || (((u)localObject2).M())) && (!((u)localObject2).L()))
                  break;
                am.a().a(q.this.l());
                paramj = am.a();
                long l1;
                long l2;
                if (((u)localObject2).f != 0)
                {
                  l1 = q.o(q.this);
                  if (((u)localObject2).f == 0)
                    break label282;
                  l2 = q.B(q.this);
                }
                while (true)
                {
                  if (!paramj.a((u)localObject2, l1, l2, q.this))
                    break label286;
                  am.a().a(q.this);
                  return;
                  l1 = 0L;
                  break;
                  l2 = 0L;
                }
              }
              if (((u)localObject2).f == 3)
                q.b(q.this, (u)localObject2);
              while (true)
              {
                try
                {
                  if ((((u)localObject2).a.A == null) || (((u)localObject2).a.A.length() == 0))
                    break label571;
                  paramj = new File(((u)localObject2).a.A);
                  if (paramj == null)
                    continue;
                  localObject1 = paramj;
                  if (paramj.exists())
                    continue;
                  localObject1 = org.vidogram.messenger.m.b(((u)localObject2).a);
                  paramj = new Intent("android.intent.action.VIEW");
                  if (Build.VERSION.SDK_INT >= 24)
                  {
                    paramj.setFlags(1);
                    paramj.setDataAndType(FileProvider.a(q.this.l(), "org.vidogram.messenger.beta.provider", (File)localObject1), "video/mp4");
                    q.this.l().startActivityForResult(paramj, 500);
                    return;
                  }
                }
                catch (Exception paramj)
                {
                  q.d(q.this, (u)localObject2);
                  return;
                }
                paramj.setDataAndType(Uri.fromFile((File)localObject1), "video/mp4");
                continue;
                if (((u)localObject2).f == 4)
                {
                  if (!org.vidogram.messenger.a.a(q.this))
                    break;
                  paramj = new ad();
                  paramj.a((u)localObject2);
                  q.this.a(paramj);
                  return;
                }
                if ((((u)localObject2).f != 9) && (((u)localObject2).f != 0))
                  break;
                try
                {
                  org.vidogram.messenger.a.a((u)localObject2, q.this.l());
                  return;
                }
                catch (Exception paramj)
                {
                  q.d(q.this, (u)localObject2);
                  return;
                }
                label571: paramj = null;
              }
            }

            public void d(org.vidogram.ui.c.j paramj)
            {
              if (q.this.l() == null)
                return;
              if (q.this.l != null)
                q.this.l.n();
              q localq = q.this;
              Context localContext = q.a.d(q.a.this);
              paramj = paramj.getMessageObject();
              if ((org.vidogram.messenger.e.d(q.this.i)) && (!q.this.i.r) && (q.this.i.v != null) && (q.this.i.v.length() > 0));
              for (boolean bool = true; ; bool = false)
              {
                localq.b(new bd(localContext, paramj, null, bool, null));
                return;
              }
            }

            public void e(org.vidogram.ui.c.j paramj)
            {
              q.a(q.this, paramj, true);
            }
          });
          paramViewGroup = (ViewGroup)localObject;
          if (q.this.k == null)
          {
            localj.setAllowAssistant(true);
            paramViewGroup = (ViewGroup)localObject;
          }
        }
      while (true)
      {
        paramViewGroup.setLayoutParams(new RecyclerView.i(-1, -2));
        return new a(paramViewGroup);
        localObject = new org.vidogram.ui.c.j(this.b);
        break;
        if (paramInt == 1)
        {
          paramViewGroup = new org.vidogram.ui.c.h(this.b);
          ((org.vidogram.ui.c.h)paramViewGroup).setDelegate(new h.a()
          {
            public void a(int paramInt)
            {
              boolean bool = true;
              if (paramInt < 0)
              {
                localObject = new Bundle();
                ((Bundle)localObject).putInt("chat_id", -paramInt);
                if (org.vidogram.messenger.v.a((Bundle)localObject, q.this))
                  q.this.a(new q((Bundle)localObject), true);
              }
              do
                return;
              while (paramInt == org.vidogram.messenger.ad.c());
              Object localObject = new Bundle();
              ((Bundle)localObject).putInt("user_id", paramInt);
              if ((q.this.k != null) && (paramInt == q.this.j.d))
                ((Bundle)localObject).putLong("dialog_id", q.o(q.this));
              localObject = new aq((Bundle)localObject);
              if ((q.this.j != null) && (q.this.j.d == paramInt));
              while (true)
              {
                ((aq)localObject).b(bool);
                q.this.a((org.vidogram.ui.a.g)localObject);
                return;
                bool = false;
              }
            }

            public void a(org.vidogram.ui.c.h paramh)
            {
              paramh = paramh.getMessageObject();
              am.a().a(q.this.l());
              g.az localaz = org.vidogram.messenger.m.a(paramh.m, 640);
              if (localaz != null)
              {
                am.a().a(localaz.c, q.this);
                return;
              }
              am.a().a(paramh, 0L, 0L, q.this);
            }

            public void a(org.vidogram.ui.c.h paramh, int paramInt)
            {
              paramh = paramh.getMessageObject();
              q localq = q.this;
              int j = paramh.q();
              if (paramh.u() == q.B(q.this));
              for (int i = 1; ; i = 0)
              {
                q.a(localq, paramInt, j, true, i);
                return;
              }
            }

            public void b(org.vidogram.ui.c.h paramh)
            {
              q.a(q.this, paramh, false);
            }
          });
          continue;
        }
        if (paramInt == 2)
        {
          paramViewGroup = new org.vidogram.ui.c.k(this.b);
          continue;
        }
        if (paramInt == 3)
        {
          paramViewGroup = new org.vidogram.ui.c.f(this.b);
          ((org.vidogram.ui.c.f)paramViewGroup).setDelegate(new f.a()
          {
            public void a(String paramString)
            {
              if (paramString.startsWith("@"))
                org.vidogram.messenger.v.a(paramString.substring(1), q.this, 0);
              do
              {
                return;
                if (!paramString.startsWith("#"))
                  continue;
                v localv = new v(null);
                localv.a(paramString);
                q.this.a(localv);
                return;
              }
              while (!paramString.startsWith("/"));
              q.this.l.a(null, paramString, false, false);
            }
          });
          continue;
        }
        if (paramInt != 4)
          continue;
        paramViewGroup = new i(this.b);
      }
    }

    public void a(int paramInt1, int paramInt2)
    {
      d();
      try
      {
        super.a(paramInt1, paramInt2);
        return;
      }
      catch (Exception localException)
      {
        org.vidogram.messenger.n.a("tmessages", localException);
      }
    }

    public void a(RecyclerView.u paramu, int paramInt)
    {
      boolean bool3 = true;
      Object localObject;
      if (paramInt == this.e)
      {
        localObject = (org.vidogram.ui.c.f)paramu.a;
        if (!q.bE(q.this).isEmpty())
        {
          paramu = ((g.b)q.bE(q.this).get(Integer.valueOf(q.this.j.d))).c;
          ((org.vidogram.ui.c.f)localObject).setText(paramu);
        }
      }
      View localView;
      label248: label506: 
      do
      {
        do
        {
          return;
          paramu = null;
          break;
          if ((paramInt != this.g) && (paramInt != this.f))
            continue;
          paramu = (i)paramu.a;
          if (q.bF(q.this) > 1);
          for (bool1 = true; ; bool1 = false)
          {
            paramu.setProgressVisible(bool1);
            return;
          }
        }
        while ((paramInt < this.h) || (paramInt >= this.i));
        localObject = (u)q.this.m.get(q.this.m.size() - (paramInt - this.h) - 1);
        localView = paramu.a;
        int j;
        boolean bool2;
        if (q.bG(q.this).f())
          if (q.this.l != null)
          {
            paramu = q.this.l.getEditingMessageObject();
            if (paramu != localObject)
            {
              paramu = q.f(q.this);
              if (((u)localObject).u() != q.o(q.this))
                break label453;
              paramInt = 0;
              if (!paramu[paramInt].containsKey(Integer.valueOf(((u)localObject).q())))
                break label458;
            }
            localView.setBackgroundColor(1714664933);
            paramInt = 1;
            int k = 1;
            j = paramInt;
            paramInt = k;
            if (!(localView instanceof org.vidogram.ui.c.j))
              break label512;
            paramu = (org.vidogram.ui.c.j)localView;
            if (q.this.i == null)
              break label482;
            bool1 = true;
            paramu.a = bool1;
            paramu.setMessageObject((u)localObject);
            if (paramInt != 0)
              break label488;
            bool1 = true;
            if ((paramInt == 0) || (j == 0))
              break label494;
            bool2 = true;
            paramu.a(bool1, bool2);
            if (((localView instanceof org.vidogram.ui.c.j)) && (MediaController.a().a(2)))
              ((org.vidogram.ui.c.j)localView).e();
            if ((q.Z(q.this) == 2147483647) || (((u)localObject).q() != q.Z(q.this)))
              break label500;
          }
        for (boolean bool1 = bool3; ; bool1 = false)
        {
          paramu.setHighlighted(bool1);
          if ((q.bH(q.this) == null) || (q.bH(q.this).getVisibility() != 0) || (org.vidogram.messenger.d.d.a() == null))
            break label506;
          paramu.setHighlightedText(org.vidogram.messenger.d.d.a());
          return;
          paramu = null;
          break;
          paramInt = 1;
          break label248;
          localView.setBackgroundColor(0);
          paramInt = 0;
          break label274;
          localView.setBackgroundColor(0);
          paramInt = 0;
          j = 0;
          break label282;
          bool1 = false;
          break label309;
          bool1 = false;
          break label328;
          bool2 = false;
          break label339;
        }
        paramu.setHighlightedText(null);
        return;
        if (!(localView instanceof org.vidogram.ui.c.h))
          continue;
        ((org.vidogram.ui.c.h)localView).setMessageObject((u)localObject);
        return;
      }
      while (!(localView instanceof org.vidogram.ui.c.k));
      label274: label282: label309: label328: label339: label482: label488: label494: label500: ((org.vidogram.ui.c.k)localView).setText(org.vidogram.messenger.r.b("NewMessages", q.bI(q.this)));
      label453: label458: return;
    }

    public void a(u paramu)
    {
      int j = q.this.m.indexOf(paramu);
      if (j == -1)
        return;
      c(this.h + q.this.m.size() - j - 1);
    }

    public long b(int paramInt)
    {
      return -1L;
    }

    public void b(int paramInt1, int paramInt2)
    {
      d();
      try
      {
        super.b(paramInt1, paramInt2);
        return;
      }
      catch (Exception localException)
      {
        org.vidogram.messenger.n.a("tmessages", localException);
      }
    }

    public void c()
    {
      d();
      try
      {
        super.c();
        return;
      }
      catch (Exception localException)
      {
        org.vidogram.messenger.n.a("tmessages", localException);
      }
    }

    public void c(int paramInt)
    {
      d();
      try
      {
        super.c(paramInt);
        return;
      }
      catch (Exception localException)
      {
        org.vidogram.messenger.n.a("tmessages", localException);
      }
    }

    public void c(int paramInt1, int paramInt2)
    {
      d();
      try
      {
        super.c(paramInt1, paramInt2);
        return;
      }
      catch (Exception localException)
      {
        org.vidogram.messenger.n.a("tmessages", localException);
      }
    }

    public void c(RecyclerView.u paramu)
    {
      if ((paramu.a instanceof org.vidogram.ui.c.j))
      {
        paramu = (org.vidogram.ui.c.j)paramu.a;
        paramu.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener(paramu)
        {
          public boolean onPreDraw()
          {
            this.a.getViewTreeObserver().removeOnPreDrawListener(this);
            int m = q.L(q.this).getMeasuredHeight();
            int i = this.a.getTop();
            this.a.getBottom();
            if (i >= 0);
            for (i = 0; ; i = -i)
            {
              int k = this.a.getMeasuredHeight();
              int j = k;
              if (k > m)
                j = i + m;
              this.a.a(i, j - i);
              return true;
            }
          }
        });
        if ((q.Z(q.this) == 2147483647) || (paramu.getMessageObject().q() != q.Z(q.this)))
          break label72;
      }
      label72: for (boolean bool = true; ; bool = false)
      {
        paramu.setHighlighted(bool);
        return;
      }
    }

    public void d()
    {
      this.d = 0;
      int j;
      if ((q.this.j != null) && (q.this.j.r))
      {
        j = this.d;
        this.d = (j + 1);
        this.e = j;
        if (q.this.m.isEmpty())
          break label222;
        if ((q.bv(q.this)[0] != 0) && ((q.B(q.this) == 0L) || (q.bv(q.this)[1] != 0)))
          break label208;
        j = this.d;
        this.d = (j + 1);
      }
      label208: for (this.f = j; ; this.f = -1)
      {
        this.h = this.d;
        this.d += q.this.m.size();
        this.i = this.d;
        if ((q.ab(q.this)[0] != 0) && ((q.B(q.this) == 0L) || (q.ab(q.this)[1] != 0)))
          break label216;
        j = this.d;
        this.d = (j + 1);
        this.g = j;
        return;
        this.e = -1;
        break;
      }
      label216: this.g = -1;
      return;
      label222: this.f = -1;
      this.g = -1;
      this.h = -1;
      this.i = -1;
    }

    public void d(int paramInt)
    {
      d();
      try
      {
        super.d(paramInt);
        return;
      }
      catch (Exception localException)
      {
        org.vidogram.messenger.n.a("tmessages", localException);
      }
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
 * Qualified Name:     org.vidogram.ui.q
 * JD-Core Version:    0.6.0
 */