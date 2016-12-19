package org.vidogram.ui;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewOutlineProvider;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.concurrent.Semaphore;
import org.vidogram.messenger.ApplicationLoader;
import org.vidogram.messenger.Utilities;
import org.vidogram.messenger.ac;
import org.vidogram.messenger.ad;
import org.vidogram.messenger.ae;
import org.vidogram.messenger.h;
import org.vidogram.messenger.n;
import org.vidogram.messenger.support.widget.LinearLayoutManager;
import org.vidogram.messenger.support.widget.RecyclerView;
import org.vidogram.messenger.support.widget.RecyclerView.a;
import org.vidogram.messenger.support.widget.RecyclerView.i;
import org.vidogram.messenger.support.widget.RecyclerView.l;
import org.vidogram.messenger.support.widget.RecyclerView.u;
import org.vidogram.messenger.w;
import org.vidogram.messenger.y;
import org.vidogram.messenger.y.b;
import org.vidogram.tgnet.ConnectionsManager;
import org.vidogram.tgnet.g.ad;
import org.vidogram.tgnet.g.ar;
import org.vidogram.tgnet.g.as;
import org.vidogram.tgnet.g.az;
import org.vidogram.tgnet.g.b;
import org.vidogram.tgnet.g.dl;
import org.vidogram.tgnet.g.dq;
import org.vidogram.tgnet.g.dr;
import org.vidogram.tgnet.g.ds;
import org.vidogram.tgnet.g.du;
import org.vidogram.tgnet.g.dy;
import org.vidogram.tgnet.g.dz;
import org.vidogram.tgnet.g.ej;
import org.vidogram.tgnet.g.es;
import org.vidogram.tgnet.g.f;
import org.vidogram.tgnet.g.fe;
import org.vidogram.tgnet.g.fi;
import org.vidogram.tgnet.g.fl;
import org.vidogram.tgnet.g.fm;
import org.vidogram.tgnet.g.fn;
import org.vidogram.tgnet.g.fp;
import org.vidogram.tgnet.g.ft;
import org.vidogram.tgnet.g.gu;
import org.vidogram.tgnet.g.i;
import org.vidogram.tgnet.g.im;
import org.vidogram.tgnet.g.j;
import org.vidogram.tgnet.g.k;
import org.vidogram.tgnet.g.l;
import org.vidogram.tgnet.g.m;
import org.vidogram.tgnet.g.ne;
import org.vidogram.tgnet.g.t;
import org.vidogram.tgnet.g.uo;
import org.vidogram.tgnet.g.vw;
import org.vidogram.tgnet.g.vx;
import org.vidogram.tgnet.g.vy;
import org.vidogram.tgnet.g.x;
import org.vidogram.ui.Components.BackupImageView;
import org.vidogram.ui.Components.aw;
import org.vidogram.ui.Components.aw.b;
import org.vidogram.ui.Components.aw.c;
import org.vidogram.ui.Components.c.a;
import org.vidogram.ui.a.d;
import org.vidogram.ui.a.k;
import org.vidogram.ui.a.l;
import org.vidogram.ui.c.ap;
import org.vidogram.ui.c.az;
import org.vidogram.ui.c.bc;
import org.vidogram.ui.c.bf;
import org.vidogram.ui.c.bh;
import org.vidogram.ui.c.o;
import org.vidogram.ui.c.z;

public class aq extends org.vidogram.ui.a.g
  implements y.b, am.d, v.a
{
  private HashMap<Integer, g.k> A = new HashMap();
  private boolean B;
  private boolean C;
  private boolean D;
  private boolean E = true;
  private int F;
  private int G;
  private float H;
  private org.vidogram.ui.Components.c I;
  private g.j J;
  private int K;
  private int L = -1;
  private ArrayList<Integer> M;
  private g.t N;
  private g.i O;
  private g.b P;
  private int Q = -1;
  private int R = -1;
  private int S;
  private int T;
  private int U;
  private int V;
  private int W;
  private int X;
  private int Y;
  private int Z;
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
  private int ar = 0;
  private aw i;
  private LinearLayoutManager j;
  private a k;
  private BackupImageView l;
  private k[] m = new k[2];
  private k[] n = new k[2];
  private ImageView o;
  private AnimatorSet p;
  private org.vidogram.ui.Components.b q;
  private d r;
  private b s;
  private int t;
  private int u;
  private long v;
  private boolean w;
  private boolean x;
  private long y;
  private boolean z;

  public aq(Bundle paramBundle)
  {
    super(paramBundle);
  }

  private void B()
  {
    this.L = 0;
    int i2 = ConnectionsManager.a().b();
    this.M.clear();
    if (((this.J instanceof g.fi)) || (((this.J instanceof g.dl)) && (this.J.g <= 200) && (this.J.t != null)))
    {
      int i1 = 0;
      while (i1 < this.J.t.e.size())
      {
        Object localObject = (g.k)this.J.t.e.get(i1);
        localObject = org.vidogram.messenger.v.a().a(Integer.valueOf(((g.k)localObject).b));
        if ((localObject != null) && (((g.vw)localObject).k != null) && ((((g.vw)localObject).k.c > i2) || (((g.vw)localObject).d == ad.c())) && (((g.vw)localObject).k.c > 10000))
          this.L += 1;
        this.M.add(Integer.valueOf(i1));
        i1 += 1;
      }
    }
    try
    {
      Collections.sort(this.M, new Comparator()
      {
        public int a(Integer paramInteger1, Integer paramInteger2)
        {
          paramInteger2 = org.vidogram.messenger.v.a().a(Integer.valueOf(((g.k)aq.i(aq.this).t.e.get(paramInteger2.intValue())).b));
          paramInteger1 = org.vidogram.messenger.v.a().a(Integer.valueOf(((g.k)aq.i(aq.this).t.e.get(paramInteger1.intValue())).b));
          int i;
          if ((paramInteger2 != null) && (paramInteger2.k != null))
            if (paramInteger2.d == ad.c())
              i = ConnectionsManager.a().b() + 50000;
          while (true)
          {
            int j;
            if ((paramInteger1 != null) && (paramInteger1.k != null))
              if (paramInteger1.d == ad.c())
                j = ConnectionsManager.a().b() + 50000;
            while (true)
            {
              if ((i > 0) && (j > 0))
              {
                if (i > j)
                {
                  return 1;
                  i = paramInteger2.k.c;
                  break;
                  j = paramInteger1.k.c;
                  continue;
                }
                if (i < j)
                  return -1;
                return 0;
              }
              if ((i < 0) && (j < 0))
              {
                if (i > j)
                  return 1;
                if (i < j)
                  return -1;
                return 0;
              }
              if (((i < 0) && (j > 0)) || ((i == 0) && (j != 0)))
                return -1;
              if (((j < 0) && (i > 0)) || ((j == 0) && (i != 0)))
                return 1;
              return 0;
              j = 0;
            }
            i = 0;
          }
        }
      });
      if (this.k != null)
        this.k.a(this.U + 1, this.M.size());
      return;
    }
    catch (Exception localException)
    {
      while (true)
        n.a("tmessages", localException);
    }
  }

  private void C()
  {
    if (((this.J instanceof g.dl)) && (this.J.t != null))
    {
      int i1 = 0;
      while (i1 < this.J.t.e.size())
      {
        g.k localk = (g.k)this.J.t.e.get(i1);
        this.A.put(Integer.valueOf(localk.b), localk);
        i1 += 1;
      }
    }
  }

  private void D()
  {
    this.S = -1;
    this.V = -1;
    this.am = -1;
    this.al = -1;
    this.ak = -1;
    this.ae = -1;
    this.ad = -1;
    this.W = -1;
    this.Z = -1;
    this.aa = -1;
    this.aj = -1;
    this.ao = -1;
    this.U = -1;
    this.aq = -1;
    this.X = -1;
    this.Y = -1;
    this.ab = -1;
    this.ac = -1;
    this.T = -1;
    this.an = -1;
    this.af = -1;
    this.ag = -1;
    this.ai = -1;
    this.ap = -1;
    this.ah = -1;
    this.ar = 0;
    if (this.t != 0)
    {
      g.vw localvw = org.vidogram.messenger.v.a().a(Integer.valueOf(this.t));
      i1 = this.ar;
      this.ar = (i1 + 1);
      this.S = i1;
      if ((localvw == null) || (!localvw.r))
      {
        i1 = this.ar;
        this.ar = (i1 + 1);
        this.V = i1;
      }
      if ((localvw != null) && (localvw.g != null) && (localvw.g.length() > 0))
      {
        i1 = this.ar;
        this.ar = (i1 + 1);
        this.W = i1;
      }
      if (org.vidogram.messenger.v.a().f(localvw.d) != null)
      {
        i1 = this.ar;
        this.ar = (i1 + 1);
        this.al = i1;
        i1 = this.ar;
        this.ar = (i1 + 1);
        this.am = i1;
        i1 = this.ar;
        this.ar = (i1 + 1);
        this.ak = i1;
        if (this.t != ad.c())
        {
          i1 = this.ar;
          this.ar = (i1 + 1);
          this.ad = i1;
        }
        i1 = this.ar;
        this.ar = (i1 + 1);
        this.ae = i1;
        if ((this.N instanceof g.im))
        {
          i1 = this.ar;
          this.ar = (i1 + 1);
          this.Z = i1;
          i1 = this.ar;
          this.ar = (i1 + 1);
          this.aa = i1;
        }
        if ((localvw != null) && (!localvw.r) && (this.N == null) && (localvw.d != ad.c()))
        {
          i1 = this.ar;
          this.ar = (i1 + 1);
          this.aj = i1;
        }
      }
    }
    label1409: 
    do
      while (true)
      {
        return;
        this.al = -1;
        this.am = -1;
        break;
        if (this.u == 0)
          continue;
        if (this.u <= 0)
          break label1409;
        i1 = this.ar;
        this.ar = (i1 + 1);
        this.S = i1;
        if ((org.vidogram.messenger.e.d(this.O)) && (((this.J != null) && (this.J.f != null) && (this.J.f.length() > 0)) || ((this.O.v != null) && (this.O.v.length() > 0))))
        {
          if ((this.J != null) && (this.J.f != null) && (this.J.f.length() > 0))
          {
            i1 = this.ar;
            this.ar = (i1 + 1);
            this.X = i1;
          }
          if ((this.O.v != null) && (this.O.v.length() > 0))
          {
            i1 = this.ar;
            this.ar = (i1 + 1);
            this.Y = i1;
          }
          i1 = this.ar;
          this.ar = (i1 + 1);
          this.ak = i1;
        }
        i1 = this.ar;
        this.ar = (i1 + 1);
        this.ad = i1;
        i1 = this.ar;
        this.ar = (i1 + 1);
        this.ae = i1;
        if (org.vidogram.messenger.e.d(this.O))
        {
          if ((!this.O.r) && (this.J != null) && ((this.O.c) || (this.J.c)))
          {
            i1 = this.ar;
            this.ar = (i1 + 1);
            this.af = i1;
          }
          if ((!org.vidogram.messenger.e.c(this.O)) && (!this.O.r) && ((this.O.c) || (this.O.n) || (this.O.o)))
          {
            i1 = this.ar;
            this.ar = (i1 + 1);
            this.ag = i1;
          }
          if ((!org.vidogram.messenger.e.c(this.O)) && (this.O.r) && ((this.O.n) || (this.O.c)))
          {
            i1 = this.ar;
            this.ar = (i1 + 1);
            this.ah = i1;
          }
          if ((!this.O.c) && (!this.O.t) && (!this.O.d) && (!this.O.r))
          {
            i1 = this.ar;
            this.ar = (i1 + 1);
            this.ai = i1;
          }
          if ((this.O.r) && ((this.O.n) || (this.O.c) || (this.O.x)) && ((this.J == null) || (this.J.g < org.vidogram.messenger.v.a().E)))
          {
            i1 = this.ar;
            this.ar = (i1 + 1);
            this.aq = i1;
          }
          if ((this.J == null) || (this.J.t == null) || (this.J.t.e.isEmpty()))
            continue;
          i1 = this.ar;
          this.ar = (i1 + 1);
          this.T = i1;
          i1 = this.ar;
          this.ar = (i1 + 1);
          this.an = i1;
          i1 = this.ar;
          this.ar = (i1 + 1);
          this.U = i1;
          this.ar += this.J.t.e.size();
          this.ao = this.ar;
          if (this.B)
            continue;
          i1 = this.ar;
          this.ar = (i1 + 1);
          this.ap = i1;
          return;
        }
        if (this.J != null)
        {
          if ((!(this.J.t instanceof g.fp)) && (this.J.t.e.size() < org.vidogram.messenger.v.a().C) && ((this.O.f) || (this.O.c) || (!this.O.e)))
          {
            i1 = this.ar;
            this.ar = (i1 + 1);
            this.aq = i1;
          }
          if ((this.O.c) && (this.J.t.e.size() >= org.vidogram.messenger.v.a().F))
          {
            i1 = this.ar;
            this.ar = (i1 + 1);
            this.ab = i1;
          }
        }
        i1 = this.ar;
        this.ar = (i1 + 1);
        this.T = i1;
        if (this.ab != -1)
        {
          i1 = this.ar;
          this.ar = (i1 + 1);
          this.ac = i1;
        }
        while ((this.J != null) && (!(this.J.t instanceof g.fp)))
        {
          i1 = this.ar;
          this.ar = (i1 + 1);
          this.U = i1;
          this.ar += this.J.t.e.size();
          this.ao = this.ar;
          return;
          i1 = this.ar;
          this.ar = (i1 + 1);
          this.an = i1;
        }
      }
    while ((org.vidogram.messenger.e.d(this.O)) || (this.J == null) || ((this.J.t instanceof g.fp)));
    int i1 = this.ar;
    this.ar = (i1 + 1);
    this.aq = i1;
    i1 = this.ar;
    this.ar = (i1 + 1);
    this.U = i1;
    this.ar += this.J.t.e.size();
    this.ao = this.ar;
  }

  private void E()
  {
    Object localObject3 = null;
    Object localObject2 = null;
    boolean bool = true;
    if ((this.l == null) || (this.m == null))
      return;
    Object localObject4;
    Object localObject1;
    if (this.t != 0)
    {
      localObject4 = org.vidogram.messenger.v.a().a(Integer.valueOf(this.t));
      if (((g.vw)localObject4).j == null)
        break label1489;
      localObject1 = ((g.vw)localObject4).j.e;
      localObject2 = ((g.vw)localObject4).j.f;
    }
    while (true)
    {
      this.q.a((g.vw)localObject4);
      this.l.a((org.vidogram.tgnet.f)localObject1, "50_50", this.q);
      localObject3 = ae.c((g.vw)localObject4);
      if (((g.vw)localObject4).d == ad.c())
      {
        localObject1 = org.vidogram.messenger.r.a("ChatYourSelf", 2131231055);
        localObject3 = org.vidogram.messenger.r.a("ChatYourSelfName", 2131231060);
      }
      int i2;
      label155: Object localObject5;
      label392: int i3;
      label431: long l1;
      label455: int i1;
      while (true)
      {
        i2 = 0;
        while (true)
        {
          if (i2 >= 2)
            break label558;
          if (this.m[i2] == null)
          {
            i2 += 1;
            continue;
            if ((((g.vw)localObject4).d == 333000) || (((g.vw)localObject4).d == 777000))
            {
              localObject1 = org.vidogram.messenger.r.a("ServiceNotifications", 2131231816);
              break;
            }
            if (((g.vw)localObject4).r)
            {
              localObject1 = org.vidogram.messenger.r.a("Bot", 2131230922);
              break;
            }
            localObject1 = org.vidogram.messenger.r.a((g.vw)localObject4);
            break;
          }
        }
        if ((i2 != 0) || (((g.vw)localObject4).d == ad.c()) || (((g.vw)localObject4).d / 1000 == 777) || (((g.vw)localObject4).d / 1000 == 333) || (((g.vw)localObject4).i == null) || (((g.vw)localObject4).i.length() == 0) || (org.vidogram.messenger.f.a().f.get(((g.vw)localObject4).d) != null) || ((org.vidogram.messenger.f.a().f.size() == 0) && (org.vidogram.messenger.f.a().j())))
          break;
        localObject5 = org.vidogram.a.b.a().e("+" + ((g.vw)localObject4).i);
        if (!this.m[i2].getText().equals(localObject5))
          this.m[i2].setText((CharSequence)localObject5);
        if (!this.n[i2].getText().equals(localObject1))
          this.n[i2].setText((CharSequence)localObject1);
        if (this.N != null)
        {
          i3 = 2130837847;
          if (i2 != 0)
            break label543;
          localObject5 = org.vidogram.messenger.v.a();
          if (this.v == 0L)
            break label528;
          l1 = this.v;
          if (!((org.vidogram.messenger.v)localObject5).a(l1))
            break label538;
          i1 = 2130838000;
        }
      }
      label1036: 
      while (true)
      {
        this.m[i2].setLeftDrawable(i3);
        this.m[i2].setRightDrawable(i1);
        break label155;
        if (this.m[i2].getText().equals(localObject3))
          break label392;
        this.m[i2].setText((CharSequence)localObject3);
        break label392;
        i3 = 0;
        break label431;
        label528: l1 = this.t;
        break label455;
        label538: i1 = 0;
        continue;
        label543: if (((g.vw)localObject4).u)
        {
          i1 = 2130837685;
          continue;
          label558: localObject1 = this.l.getImageReceiver();
          if (!am.a().a((g.x)localObject2));
          for (bool = true; ; bool = false)
          {
            ((org.vidogram.messenger.q)localObject1).a(bool, false);
            return;
          }
          if (this.u == 0)
            break;
          localObject2 = org.vidogram.messenger.v.a().b(Integer.valueOf(this.u));
          if (localObject2 != null)
          {
            this.O = ((g.i)localObject2);
            if (!org.vidogram.messenger.e.d((g.i)localObject2))
              break label947;
            if ((this.J != null) && ((this.O.r) || ((this.J.g != 0) && (!this.O.f) && (!this.J.c))))
              break label785;
            if (!this.O.r)
              break label740;
            localObject1 = org.vidogram.messenger.r.a("Loading", 2131231394).toLowerCase();
            label708: i1 = 0;
            label710: if (i1 >= 2)
              break label1382;
            if (this.m[i1] != null)
              break label1036;
          }
          while (true)
          {
            i1 += 1;
            break label710;
            localObject2 = this.O;
            break;
            label740: if ((((g.i)localObject2).b & 0x40) != 0)
            {
              localObject1 = org.vidogram.messenger.r.a("ChannelPublic", 2131231025).toLowerCase();
              break label708;
            }
            localObject1 = org.vidogram.messenger.r.a("ChannelPrivate", 2131231022).toLowerCase();
            break label708;
            if ((this.O.r) && (this.J.g <= 200))
            {
              if ((this.L > 1) && (this.J.g != 0))
              {
                localObject1 = String.format("%s, %s", new Object[] { org.vidogram.messenger.r.b("Members", this.J.g), org.vidogram.messenger.r.b("Online", this.L) });
                break label708;
              }
              localObject1 = org.vidogram.messenger.r.b("Members", this.J.g);
              break label708;
            }
            localObject1 = new int[1];
            localObject4 = org.vidogram.messenger.r.a(this.J.g, localObject1);
            localObject1 = org.vidogram.messenger.r.b("Members", localObject1[0]).replace(String.format("%d", new Object[] { Integer.valueOf(localObject1[0]) }), (CharSequence)localObject4);
            break label708;
            label947: i1 = ((g.i)localObject2).k;
            if (this.J != null)
              i1 = this.J.t.e.size();
            if ((i1 != 0) && (this.L > 1))
            {
              localObject1 = String.format("%s, %s", new Object[] { org.vidogram.messenger.r.b("Members", i1), org.vidogram.messenger.r.b("Online", this.L) });
              break label708;
            }
            localObject1 = org.vidogram.messenger.r.b("Members", i1);
            break label708;
            if ((((g.i)localObject2).i != null) && (!this.m[i1].getText().equals(((g.i)localObject2).i)))
              this.m[i1].setText(((g.i)localObject2).i);
            this.m[i1].setLeftDrawable(null);
            if (i1 != 0)
            {
              if (((g.i)localObject2).q)
                this.m[i1].setRightDrawable(2130837685);
              while (true)
              {
                if ((!this.O.r) || (this.J == null) || (this.J.g > 200) || (this.L <= 0))
                  break label1234;
                if (this.n[i1].getText().equals(localObject1))
                  break;
                this.n[i1].setText((CharSequence)localObject1);
                break;
                this.m[i1].setRightDrawable(null);
              }
            }
            localObject4 = this.m[i1];
            if (org.vidogram.messenger.v.a().a(-this.u));
            for (i2 = 2130838000; ; i2 = 0)
            {
              ((k)localObject4).setRightDrawable(i2);
              break;
            }
            label1234: if ((i1 == 0) && (org.vidogram.messenger.e.d(this.O)) && (this.J != null) && (this.J.g != 0) && ((this.O.r) || (this.O.p)))
            {
              localObject4 = new int[1];
              localObject5 = org.vidogram.messenger.r.a(this.J.g, localObject4);
              this.n[i1].setText(org.vidogram.messenger.r.b("Members", localObject4[0]).replace(String.format("%d", new Object[] { Integer.valueOf(localObject4[0]) }), (CharSequence)localObject5));
              continue;
            }
            if (this.n[i1].getText().equals(localObject1))
              continue;
            this.n[i1].setText((CharSequence)localObject1);
          }
          label1382: if (((g.i)localObject2).j != null)
          {
            localObject3 = ((g.i)localObject2).j.b;
            localObject1 = ((g.i)localObject2).j.c;
          }
          while (true)
          {
            this.q.a((g.i)localObject2);
            this.l.a((org.vidogram.tgnet.f)localObject3, "50_50", this.q);
            localObject2 = this.l.getImageReceiver();
            if (!am.a().a((g.x)localObject1));
            while (true)
            {
              ((org.vidogram.messenger.q)localObject2).a(bool, false);
              return;
              bool = false;
            }
            localObject4 = null;
            localObject1 = localObject3;
            localObject3 = localObject4;
          }
        }
        label785: i1 = 0;
      }
      label1489: localObject1 = null;
    }
  }

  private void F()
  {
    org.vidogram.ui.a.c localc = this.d.a();
    localc.b();
    this.r = null;
    Object localObject3 = null;
    Object localObject1 = null;
    Object localObject2;
    if (this.t != 0)
      if (ad.c() != this.t)
        if (org.vidogram.messenger.f.a().f.get(this.t) == null)
        {
          localObject1 = org.vidogram.messenger.v.a().a(Integer.valueOf(this.t));
          if (localObject1 == null)
            return;
          localObject2 = localc.b(10, 2130837803);
          if (((g.vw)localObject1).r)
          {
            if (!((g.vw)localObject1).t)
              ((d)localObject2).a(9, org.vidogram.messenger.r.a("BotInvite", 2131230926), 0);
            ((d)localObject2).a(10, org.vidogram.messenger.r.a("BotShare", 2131230930), 0);
          }
          if ((((g.vw)localObject1).i != null) && (((g.vw)localObject1).i.length() != 0))
          {
            ((d)localObject2).a(1, org.vidogram.messenger.r.a("AddContact", 2131230813), 0);
            ((d)localObject2).a(3, org.vidogram.messenger.r.a("ShareContact", 2131231833), 0);
            if (!this.x)
            {
              localObject1 = org.vidogram.messenger.r.a("BlockContact", 2131230916);
              ((d)localObject2).a(2, (String)localObject1, 0);
              localObject1 = localObject2;
            }
          }
        }
    while (true)
    {
      localObject2 = localObject1;
      if (localObject1 == null)
        localObject2 = localc.b(10, 2130837803);
      ((d)localObject2).a(14, org.vidogram.messenger.r.a("AddShortcut", 2131230822), 0);
      return;
      localObject1 = org.vidogram.messenger.r.a("Unblock", 2131231909);
      break;
      if (((g.vw)localObject1).r)
      {
        if (!this.x);
        for (localObject1 = org.vidogram.messenger.r.a("BotStop", 2131230934); ; localObject1 = org.vidogram.messenger.r.a("BotRestart", 2131230928))
        {
          ((d)localObject2).a(2, (String)localObject1, 0);
          break;
        }
      }
      if (!this.x);
      for (localObject1 = org.vidogram.messenger.r.a("BlockContact", 2131230916); ; localObject1 = org.vidogram.messenger.r.a("Unblock", 2131231909))
      {
        ((d)localObject2).a(2, (String)localObject1, 0);
        break;
      }
      localObject2 = localc.b(10, 2130837803);
      ((d)localObject2).a(3, org.vidogram.messenger.r.a("ShareContact", 2131231833), 0);
      if (!this.x);
      for (localObject1 = org.vidogram.messenger.r.a("BlockContact", 2131230916); ; localObject1 = org.vidogram.messenger.r.a("Unblock", 2131231909))
      {
        ((d)localObject2).a(2, (String)localObject1, 0);
        ((d)localObject2).a(4, org.vidogram.messenger.r.a("EditContact", 2131231150), 0);
        ((d)localObject2).a(5, org.vidogram.messenger.r.a("DeleteContact", 2131231128), 0);
        localObject1 = localObject2;
        break;
      }
      localObject1 = localc.b(10, 2130837803);
      ((d)localObject1).a(3, org.vidogram.messenger.r.a("ShareContact", 2131231833), 0);
      continue;
      if (this.u == 0)
        continue;
      if (this.u > 0)
      {
        g.i locali = org.vidogram.messenger.v.a().b(Integer.valueOf(this.u));
        if (this.o != null)
        {
          boolean bool = org.vidogram.messenger.e.d(this.O);
          if (((!bool) || (this.O.c) || ((this.O.r) && (this.O.n))) && ((bool) || (this.O.f) || (this.O.c) || (!this.O.e)))
            break label761;
          this.o.setImageResource(2130837775);
          this.o.setPadding(0, org.vidogram.messenger.a.a(3.0F), 0, 0);
        }
        while (true)
        {
          if (!org.vidogram.messenger.e.d(locali))
            break label785;
          if (!locali.c)
          {
            localObject2 = localObject3;
            if (locali.r)
            {
              localObject2 = localObject3;
              if (!locali.n);
            }
          }
          else
          {
            localObject2 = localc.b(10, 2130837803);
            ((d)localObject2).a(12, org.vidogram.messenger.r.a("ChannelEdit", 2131230982), 0);
          }
          localObject1 = localObject2;
          if (locali.c)
            break;
          localObject1 = localObject2;
          if (locali.t)
            break;
          localObject1 = localObject2;
          if (locali.d)
            break;
          localObject1 = localObject2;
          if (!locali.r)
            break;
          localObject1 = localObject2;
          if (localObject2 == null)
            localObject1 = localc.b(10, 2130837803);
          ((d)localObject1).a(7, org.vidogram.messenger.r.a("LeaveMegaMenu", 2131231378), 0);
          break;
          label761: this.o.setImageResource(2130837773);
          this.o.setPadding(0, 0, 0, 0);
        }
        label785: localObject1 = localc.b(10, 2130837803);
        if ((locali.c) && (this.u > 0))
          ((d)localObject1).a(11, org.vidogram.messenger.r.a("SetAdmins", 2131231822), 0);
        if ((!locali.e) || (locali.c) || (locali.f))
          ((d)localObject1).a(8, org.vidogram.messenger.r.a("EditName", 2131231153), 0);
        if ((locali.c) && ((this.J == null) || (this.J.t.e.size() > 1)))
          ((d)localObject1).a(13, org.vidogram.messenger.r.a("ConvertGroupMenu", 2131231087), 0);
        ((d)localObject1).a(7, org.vidogram.messenger.r.a("DeleteAndExit", 2131231123), 0);
        continue;
      }
      localObject1 = localc.b(10, 2130837803);
      ((d)localObject1).a(8, org.vidogram.messenger.r.a("EditName", 2131231153), 0);
    }
  }

  private void c(boolean paramBoolean)
  {
    int i2 = 0;
    if ((this.z) || (this.A == null) || (this.J == null))
      return;
    this.z = true;
    int i1;
    g.es locales;
    if ((!this.A.isEmpty()) && (paramBoolean))
    {
      i1 = 300;
      locales = new g.es();
      locales.c = org.vidogram.messenger.v.b(this.u);
      locales.d = new g.dy();
      if (!paramBoolean)
        break label135;
    }
    while (true)
    {
      locales.e = i2;
      locales.f = 200;
      i1 = ConnectionsManager.a().a(locales, new org.vidogram.tgnet.c(locales, i1)
      {
      });
      ConnectionsManager.a().a(i1, this.e);
      return;
      i1 = 0;
      break;
      label135: i2 = this.A.size();
    }
  }

  private boolean e(int paramInt)
  {
    Object localObject1;
    AlertDialog.Builder localBuilder;
    String str;
    if (paramInt == this.W)
    {
      localObject1 = org.vidogram.messenger.v.a().a(Integer.valueOf(this.t));
      if ((localObject1 == null) || (((g.vw)localObject1).g == null))
        return false;
      localBuilder = new AlertDialog.Builder(l());
      str = org.vidogram.messenger.r.a("Copy", 2131231088);
      localObject1 = new DialogInterface.OnClickListener((g.vw)localObject1)
      {
        public void onClick(DialogInterface paramDialogInterface, int paramInt)
        {
          if (paramInt == 0);
          try
          {
            ((ClipboardManager)ApplicationLoader.a.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", "@" + this.a.g));
            return;
          }
          catch (Exception paramDialogInterface)
          {
            n.a("tmessages", paramDialogInterface);
          }
        }
      };
      localBuilder.setItems(new CharSequence[] { str }, (DialogInterface.OnClickListener)localObject1);
      b(localBuilder.create());
      return true;
    }
    if (paramInt == this.V)
    {
      Object localObject2 = org.vidogram.messenger.v.a().a(Integer.valueOf(this.t));
      if ((localObject2 == null) || (((g.vw)localObject2).i == null) || (((g.vw)localObject2).i.length() == 0) || (l() == null))
        return false;
      localBuilder = new AlertDialog.Builder(l());
      str = org.vidogram.messenger.r.a("Call", 2131230940);
      localObject1 = org.vidogram.messenger.r.a("Copy", 2131231088);
      localObject2 = new DialogInterface.OnClickListener((g.vw)localObject2)
      {
        public void onClick(DialogInterface paramDialogInterface, int paramInt)
        {
          if (paramInt == 0);
          do
            try
            {
              paramDialogInterface = new Intent("android.intent.action.DIAL", Uri.parse("tel:+" + this.a.i));
              paramDialogInterface.addFlags(268435456);
              aq.this.l().startActivityForResult(paramDialogInterface, 500);
              return;
            }
            catch (Exception paramDialogInterface)
            {
              n.a("tmessages", paramDialogInterface);
              return;
            }
          while (paramInt != 1);
          try
          {
            ((ClipboardManager)ApplicationLoader.a.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", "+" + this.a.i));
            return;
          }
          catch (Exception paramDialogInterface)
          {
            n.a("tmessages", paramDialogInterface);
          }
        }
      };
      localBuilder.setItems(new CharSequence[] { str, localObject1 }, (DialogInterface.OnClickListener)localObject2);
      b(localBuilder.create());
      return true;
    }
    if ((paramInt == this.X) || (paramInt == this.am))
    {
      localBuilder = new AlertDialog.Builder(l());
      str = org.vidogram.messenger.r.a("Copy", 2131231088);
      localObject1 = new DialogInterface.OnClickListener(paramInt)
      {
        public void onClick(DialogInterface paramDialogInterface, int paramInt)
        {
          do
            try
            {
              if (this.a == aq.O(aq.this))
              {
                paramDialogInterface = aq.i(aq.this).f;
              }
              else
              {
                paramDialogInterface = org.vidogram.messenger.v.a().f(aq.j(aq.this).b);
                continue;
                ((ClipboardManager)ApplicationLoader.a.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", paramDialogInterface));
                return;
              }
            }
            catch (Exception paramDialogInterface)
            {
              n.a("tmessages", paramDialogInterface);
              return;
            }
          while (paramDialogInterface != null);
        }
      };
      localBuilder.setItems(new CharSequence[] { str }, (DialogInterface.OnClickListener)localObject1);
      b(localBuilder.create());
      return true;
    }
    return false;
  }

  private void f(int paramInt)
  {
    int i3 = 0;
    if (paramInt != 0)
    {
      org.vidogram.messenger.v.a().a(this.u, org.vidogram.messenger.v.a().a(Integer.valueOf(paramInt)), this.J);
      if ((this.O.r) && (this.J != null) && (this.J.t != null))
      {
        i1 = 0;
        if (i1 >= this.J.t.e.size())
          break label359;
        if (((g.fe)this.J.t.e.get(i1)).f.b != paramInt)
          break label250;
        if (this.J != null)
        {
          g.j localj = this.J;
          localj.g -= 1;
        }
        this.J.t.e.remove(i1);
      }
    }
    label359: for (int i1 = 1; ; i1 = 0)
    {
      int i2 = i1;
      if (this.J != null)
      {
        i2 = i1;
        if (this.J.t == null);
      }
      while (true)
      {
        i2 = i1;
        if (i3 < this.J.t.e.size())
        {
          if (((g.k)this.J.t.e.get(i3)).b == paramInt)
          {
            this.J.t.e.remove(i3);
            i2 = 1;
          }
        }
        else
        {
          if (i2 != 0)
          {
            B();
            D();
            this.k.c();
          }
          return;
          label250: i1 += 1;
          break;
        }
        i3 += 1;
      }
      y.a().b(this, y.d);
      if (org.vidogram.messenger.a.c())
        y.a().a(y.d, new Object[] { Long.valueOf(-this.u) });
      while (true)
      {
        org.vidogram.messenger.v.a().a(this.u, org.vidogram.messenger.v.a().a(Integer.valueOf(ad.c())), this.J);
        this.D = false;
        d();
        return;
        y.a().a(y.d, new Object[0]);
      }
    }
  }

  private void r()
  {
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(l());
    String str;
    if ((org.vidogram.messenger.e.a(this.u)) && (!this.O.r))
      if (org.vidogram.messenger.e.a(this.u))
      {
        str = org.vidogram.messenger.r.a("ChannelLeaveAlert", 2131230989);
        localBuilder.setMessage(str);
      }
    while (true)
    {
      localBuilder.setTitle(org.vidogram.messenger.r.a("AppName", 2131230856));
      localBuilder.setPositiveButton(org.vidogram.messenger.r.a("OK", 2131231604), new DialogInterface.OnClickListener()
      {
        public void onClick(DialogInterface paramDialogInterface, int paramInt)
        {
          aq.c(aq.this, 0);
        }
      });
      localBuilder.setNegativeButton(org.vidogram.messenger.r.a("Cancel", 2131230943), null);
      b(localBuilder.create());
      return;
      str = org.vidogram.messenger.r.a("AreYouSureDeleteAndExit", 2131230875);
      break;
      localBuilder.setMessage(org.vidogram.messenger.r.a("AreYouSureDeleteAndExit", 2131230875));
    }
  }

  private void s()
  {
    int i1 = 0;
    boolean bool = true;
    Object localObject = new Bundle();
    ((Bundle)localObject).putBoolean("onlyUsers", true);
    ((Bundle)localObject).putBoolean("destroyAfterSelect", true);
    ((Bundle)localObject).putBoolean("returnAsResult", true);
    if (!org.vidogram.messenger.e.d(this.O));
    while (true)
    {
      ((Bundle)localObject).putBoolean("needForwardCount", bool);
      if (this.u > 0)
      {
        if (this.O.c)
          ((Bundle)localObject).putInt("chat_id", this.O.h);
        ((Bundle)localObject).putString("selectAlertString", org.vidogram.messenger.r.a("AddToTheGroup", 2131230829));
      }
      localObject = new s((Bundle)localObject);
      ((s)localObject).a(new s.a()
      {
        public void a(g.vw paramvw, String paramString)
        {
          org.vidogram.messenger.v localv = org.vidogram.messenger.v.a();
          int j = aq.e(aq.this);
          g.j localj = aq.i(aq.this);
          if (paramString != null);
          for (int i = Utilities.a(paramString).intValue(); ; i = 0)
          {
            localv.a(j, paramvw, localj, i, null, aq.this);
            return;
          }
        }
      });
      if ((this.J == null) || (this.J.t == null))
        break;
      HashMap localHashMap = new HashMap();
      while (true)
        if (i1 < this.J.t.e.size())
        {
          localHashMap.put(Integer.valueOf(((g.k)this.J.t.e.get(i1)).b), null);
          i1 += 1;
          continue;
          bool = false;
          break;
        }
      ((s)localObject).a(localHashMap);
    }
    a((org.vidogram.ui.a.g)localObject);
  }

  private void t()
  {
    boolean bool = false;
    if ((this.i.getChildCount() <= 0) || (this.C));
    while (true)
    {
      return;
      View localView = this.i.getChildAt(0);
      aq.a.a locala = (aq.a.a)this.i.c(localView);
      int i1 = localView.getTop();
      if ((i1 >= 0) && (locala != null) && (locala.e() == 0));
      while (this.F != i1)
      {
        this.F = i1;
        this.s.invalidate();
        if (this.D)
        {
          if (this.F != 0)
            bool = true;
          this.E = bool;
        }
        u();
        return;
        i1 = 0;
      }
    }
  }

  private void u()
  {
    int i3 = 0;
    int i1;
    Object localObject;
    float f1;
    label138: label180: int i2;
    label193: label213: float f2;
    label337: float f3;
    label385: float f4;
    if (this.d.getOccupyStatusBar())
    {
      i1 = org.vidogram.messenger.a.a;
      i1 = org.vidogram.ui.a.a.getCurrentActionBarHeight() + i1;
      if ((this.i != null) && (!this.C))
      {
        localObject = (FrameLayout.LayoutParams)this.i.getLayoutParams();
        if (((FrameLayout.LayoutParams)localObject).topMargin != i1)
        {
          ((FrameLayout.LayoutParams)localObject).topMargin = i1;
          this.i.setLayoutParams((ViewGroup.LayoutParams)localObject);
        }
      }
      if (this.l == null)
        return;
      f1 = this.F / org.vidogram.messenger.a.a(88.0F);
      this.i.setTopGlowOffset(this.F);
      if (this.o != null)
      {
        localObject = this.o;
        if (!this.d.getOccupyStatusBar())
          break label531;
        i1 = org.vidogram.messenger.a.a;
        ((ImageView)localObject).setTranslationY(i1 + org.vidogram.ui.a.a.getCurrentActionBarHeight() + this.F - org.vidogram.messenger.a.a(29.5F));
        if (!this.C)
        {
          if (f1 <= 0.2F)
            break label537;
          i1 = 1;
          if (this.o.getTag() != null)
            break label543;
          i2 = 1;
          if (i1 != i2)
          {
            if (i1 == 0)
              break label549;
            this.o.setTag(null);
            if (this.p != null)
            {
              localObject = this.p;
              this.p = null;
              ((AnimatorSet)localObject).cancel();
            }
            this.p = new AnimatorSet();
            if (i1 == 0)
              break label563;
            this.p.setInterpolator(new DecelerateInterpolator());
            this.p.playTogether(new Animator[] { ObjectAnimator.ofFloat(this.o, "scaleX", new float[] { 1.0F }), ObjectAnimator.ofFloat(this.o, "scaleY", new float[] { 1.0F }), ObjectAnimator.ofFloat(this.o, "alpha", new float[] { 1.0F }) });
            this.p.setDuration(150L);
            this.p.addListener(new org.vidogram.messenger.b()
            {
              public void onAnimationEnd(Animator paramAnimator)
              {
                if ((aq.P(aq.this) != null) && (aq.P(aq.this).equals(paramAnimator)))
                  aq.a(aq.this, null);
              }
            });
            this.p.start();
          }
        }
      }
      if (!this.d.getOccupyStatusBar())
        break label655;
      i1 = org.vidogram.messenger.a.a;
      f2 = i1;
      f3 = org.vidogram.ui.a.a.getCurrentActionBarHeight() / 2.0F;
      f4 = org.vidogram.messenger.a.b;
      f2 = 27.0F * org.vidogram.messenger.a.b * f1 + (f2 + f3 * (1.0F + f1) - 21.0F * f4);
      this.l.setScaleX((18.0F * f1 + 42.0F) / 42.0F);
      this.l.setScaleY((18.0F * f1 + 42.0F) / 42.0F);
      this.l.setTranslationX(-org.vidogram.messenger.a.a(47.0F) * f1);
      this.l.setTranslationY((float)Math.ceil(f2));
      i1 = i3;
      label500: if (i1 >= 2)
        return;
      if (this.m[i1] != null)
        break label661;
    }
    label531: label537: label543: label549: label563: 
    do
    {
      i1 += 1;
      break label500;
      i1 = 0;
      break;
      i1 = 0;
      break label138;
      i1 = 0;
      break label180;
      i2 = 0;
      break label193;
      this.o.setTag(Integer.valueOf(0));
      break label213;
      this.p.setInterpolator(new AccelerateInterpolator());
      this.p.playTogether(new Animator[] { ObjectAnimator.ofFloat(this.o, "scaleX", new float[] { 0.2F }), ObjectAnimator.ofFloat(this.o, "scaleY", new float[] { 0.2F }), ObjectAnimator.ofFloat(this.o, "alpha", new float[] { 0.0F }) });
      break label337;
      i1 = 0;
      break label385;
      this.m[i1].setTranslationX(-21.0F * org.vidogram.messenger.a.b * f1);
      this.m[i1].setTranslationY((float)Math.floor(f2) + org.vidogram.messenger.a.a(1.3F) + org.vidogram.messenger.a.a(7.0F) * f1);
      this.n[i1].setTranslationX(-21.0F * org.vidogram.messenger.a.b * f1);
      this.n[i1].setTranslationY((float)Math.floor(f2) + org.vidogram.messenger.a.a(24.0F) + (float)Math.floor(11.0F * org.vidogram.messenger.a.b) * f1);
      this.m[i1].setScaleX(0.12F * f1 + 1.0F);
      this.m[i1].setScaleY(0.12F * f1 + 1.0F);
    }
    while ((i1 != 1) || (this.C));
    label655: label661: if (org.vidogram.messenger.a.c())
    {
      i2 = org.vidogram.messenger.a.a(490.0F);
      label833: i2 = (int)(i2 - org.vidogram.messenger.a.a(126.0F + 40.0F * (1.0F - f1)) - this.m[i1].getTranslationX());
      f3 = this.m[i1].getPaint().measureText(this.m[i1].getText().toString());
      f4 = this.m[i1].getScaleX();
      float f5 = this.m[i1].getSideDrawablesSize();
      localObject = (FrameLayout.LayoutParams)this.m[i1].getLayoutParams();
      if (i2 >= f5 + f3 * f4)
        break label1065;
    }
    label1065: for (((FrameLayout.LayoutParams)localObject).width = (int)Math.ceil(i2 / this.m[i1].getScaleX()); ; ((FrameLayout.LayoutParams)localObject).width = -2)
    {
      this.m[i1].setLayoutParams((ViewGroup.LayoutParams)localObject);
      localObject = (FrameLayout.LayoutParams)this.n[i1].getLayoutParams();
      ((FrameLayout.LayoutParams)localObject).rightMargin = (int)Math.ceil(this.n[i1].getTranslationX() + org.vidogram.messenger.a.a(8.0F) + org.vidogram.messenger.a.a(40.0F) * (1.0F - f1));
      this.n[i1].setLayoutParams((ViewGroup.LayoutParams)localObject);
      break;
      i2 = org.vidogram.messenger.a.c.x;
      break label833;
    }
  }

  private void v()
  {
    if (this.b == null)
      return;
    this.b.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener()
    {
      public boolean onPreDraw()
      {
        if (aq.Q(aq.this) != null)
        {
          aq.l(aq.this);
          aq.R(aq.this);
          aq.S(aq.this).getViewTreeObserver().removeOnPreDrawListener(this);
        }
        return true;
      }
    });
  }

  public int A()
  {
    return 0;
  }

  protected AnimatorSet a(boolean paramBoolean, Runnable paramRunnable)
  {
    if ((this.D) && (this.E))
    {
      AnimatorSet localAnimatorSet = new AnimatorSet();
      localAnimatorSet.setDuration(180L);
      if (Build.VERSION.SDK_INT > 15)
        this.i.setLayerType(2, null);
      Object localObject = this.d.a();
      if ((((org.vidogram.ui.a.c)localObject).b(10) == null) && (this.r == null))
        this.r = ((org.vidogram.ui.a.c)localObject).b(10, 2130837803);
      int i1;
      float f1;
      label427: k localk;
      if (paramBoolean)
      {
        localObject = (FrameLayout.LayoutParams)this.n[1].getLayoutParams();
        ((FrameLayout.LayoutParams)localObject).rightMargin = (int)(-21.0F * org.vidogram.messenger.a.b + org.vidogram.messenger.a.a(8.0F));
        this.n[1].setLayoutParams((ViewGroup.LayoutParams)localObject);
        i1 = (int)Math.ceil(org.vidogram.messenger.a.c.x - org.vidogram.messenger.a.a(126.0F) + 21.0F * org.vidogram.messenger.a.b);
        f1 = this.m[1].getPaint().measureText(this.m[1].getText().toString());
        float f2 = this.m[1].getSideDrawablesSize();
        localObject = (FrameLayout.LayoutParams)this.m[1].getLayoutParams();
        if (i1 < f2 + f1 * 1.12F)
        {
          ((FrameLayout.LayoutParams)localObject).width = (int)Math.ceil(i1 / 1.12F);
          this.m[1].setLayoutParams((ViewGroup.LayoutParams)localObject);
          this.G = org.vidogram.messenger.a.a(88.0F);
          this.b.setBackgroundColor(0);
          a(0.0F);
          localObject = new ArrayList();
          ((ArrayList)localObject).add(ObjectAnimator.ofFloat(this, "animationProgress", new float[] { 0.0F, 1.0F }));
          if (this.o != null)
          {
            this.o.setScaleX(0.2F);
            this.o.setScaleY(0.2F);
            this.o.setAlpha(0.0F);
            ((ArrayList)localObject).add(ObjectAnimator.ofFloat(this.o, "scaleX", new float[] { 1.0F }));
            ((ArrayList)localObject).add(ObjectAnimator.ofFloat(this.o, "scaleY", new float[] { 1.0F }));
            ((ArrayList)localObject).add(ObjectAnimator.ofFloat(this.o, "alpha", new float[] { 1.0F }));
          }
          i1 = 0;
          if (i1 >= 2)
            break label590;
          localk = this.n[i1];
          if (i1 != 0)
            break label570;
          f1 = 1.0F;
          label449: localk.setAlpha(f1);
          localk = this.m[i1];
          if (i1 != 0)
            break label575;
          f1 = 1.0F;
          label471: localk.setAlpha(f1);
          localk = this.n[i1];
          if (i1 != 0)
            break label580;
          f1 = 0.0F;
          label493: ((ArrayList)localObject).add(ObjectAnimator.ofFloat(localk, "alpha", new float[] { f1 }));
          localk = this.m[i1];
          if (i1 != 0)
            break label585;
          f1 = 0.0F;
        }
        while (true)
        {
          ((ArrayList)localObject).add(ObjectAnimator.ofFloat(localk, "alpha", new float[] { f1 }));
          i1 += 1;
          break label427;
          ((FrameLayout.LayoutParams)localObject).width = -2;
          break;
          label570: f1 = 0.0F;
          break label449;
          label575: f1 = 0.0F;
          break label471;
          label580: f1 = 1.0F;
          break label493;
          label585: f1 = 1.0F;
        }
        label590: if (this.r != null)
        {
          this.r.setAlpha(1.0F);
          ((ArrayList)localObject).add(ObjectAnimator.ofFloat(this.r, "alpha", new float[] { 0.0F }));
        }
        localAnimatorSet.playTogether((Collection)localObject);
      }
      while (true)
      {
        localAnimatorSet.addListener(new org.vidogram.messenger.b(paramRunnable)
        {
          public void onAnimationEnd(Animator paramAnimator)
          {
            if (Build.VERSION.SDK_INT > 15)
              aq.T(aq.this).setLayerType(0, null);
            if (aq.U(aq.this) != null)
            {
              aq.V(aq.this).a().b();
              aq.a(aq.this, null);
            }
            this.a.run();
          }
        });
        localAnimatorSet.setInterpolator(new DecelerateInterpolator());
        org.vidogram.messenger.a.a(new Runnable(localAnimatorSet)
        {
          public void run()
          {
            this.a.start();
          }
        }
        , 50L);
        return localAnimatorSet;
        this.G = this.F;
        localObject = new ArrayList();
        ((ArrayList)localObject).add(ObjectAnimator.ofFloat(this, "animationProgress", new float[] { 1.0F, 0.0F }));
        if (this.o != null)
        {
          ((ArrayList)localObject).add(ObjectAnimator.ofFloat(this.o, "scaleX", new float[] { 0.2F }));
          ((ArrayList)localObject).add(ObjectAnimator.ofFloat(this.o, "scaleY", new float[] { 0.2F }));
          ((ArrayList)localObject).add(ObjectAnimator.ofFloat(this.o, "alpha", new float[] { 0.0F }));
        }
        i1 = 0;
        if (i1 < 2)
        {
          localk = this.n[i1];
          if (i1 == 0)
          {
            f1 = 1.0F;
            label826: ((ArrayList)localObject).add(ObjectAnimator.ofFloat(localk, "alpha", new float[] { f1 }));
            localk = this.m[i1];
            if (i1 != 0)
              break label898;
            f1 = 1.0F;
          }
          while (true)
          {
            ((ArrayList)localObject).add(ObjectAnimator.ofFloat(localk, "alpha", new float[] { f1 }));
            i1 += 1;
            break;
            f1 = 0.0F;
            break label826;
            label898: f1 = 0.0F;
          }
        }
        if (this.r != null)
        {
          this.r.setAlpha(0.0F);
          ((ArrayList)localObject).add(ObjectAnimator.ofFloat(this.r, "alpha", new float[] { 1.0F }));
        }
        localAnimatorSet.playTogether((Collection)localObject);
      }
    }
    return (AnimatorSet)null;
  }

  public View a(Context paramContext)
  {
    this.h = true;
    this.F = org.vidogram.messenger.a.a(88.0F);
    this.d.setActionBarMenuOnItemClick(new org.vidogram.ui.a.a.a()
    {
      public void a(int paramInt)
      {
        if (aq.this.l() == null);
        do
        {
          Object localObject1;
          Object localObject3;
          while (true)
          {
            return;
            if (paramInt == -1)
            {
              aq.this.d();
              return;
            }
            if (paramInt == 2)
            {
              localObject1 = org.vidogram.messenger.v.a().a(Integer.valueOf(aq.f(aq.this)));
              if (localObject1 == null)
                continue;
              if (!((g.vw)localObject1).r)
              {
                localObject1 = new AlertDialog.Builder(aq.this.l());
                if (!aq.g(aq.this))
                  ((AlertDialog.Builder)localObject1).setMessage(org.vidogram.messenger.r.a("AreYouSureBlockContact", 2131230871));
                while (true)
                {
                  ((AlertDialog.Builder)localObject1).setTitle(org.vidogram.messenger.r.a("AppName", 2131230856));
                  ((AlertDialog.Builder)localObject1).setPositiveButton(org.vidogram.messenger.r.a("OK", 2131231604), new DialogInterface.OnClickListener()
                  {
                    public void onClick(DialogInterface paramDialogInterface, int paramInt)
                    {
                      if (!aq.g(aq.this))
                      {
                        org.vidogram.messenger.v.a().h(aq.f(aq.this));
                        return;
                      }
                      org.vidogram.messenger.v.a().i(aq.f(aq.this));
                    }
                  });
                  ((AlertDialog.Builder)localObject1).setNegativeButton(org.vidogram.messenger.r.a("Cancel", 2131230943), null);
                  aq.this.b(((AlertDialog.Builder)localObject1).create());
                  return;
                  ((AlertDialog.Builder)localObject1).setMessage(org.vidogram.messenger.r.a("AreYouSureUnblockContact", 2131230888));
                }
              }
              if (!aq.g(aq.this))
              {
                org.vidogram.messenger.v.a().h(aq.f(aq.this));
                return;
              }
              org.vidogram.messenger.v.a().i(aq.f(aq.this));
              ac.a().a("/start", aq.f(aq.this), null, null, false, null, null, null);
              aq.this.d();
              return;
            }
            if (paramInt == 1)
            {
              localObject1 = org.vidogram.messenger.v.a().a(Integer.valueOf(aq.f(aq.this)));
              localObject3 = new Bundle();
              ((Bundle)localObject3).putInt("user_id", ((g.vw)localObject1).d);
              ((Bundle)localObject3).putBoolean("addContact", true);
              aq.this.a(new r((Bundle)localObject3));
              return;
            }
            if (paramInt == 3)
            {
              localObject1 = new Bundle();
              ((Bundle)localObject1).putBoolean("onlySelect", true);
              ((Bundle)localObject1).putInt("dialogsType", 1);
              ((Bundle)localObject1).putString("selectAlertString", org.vidogram.messenger.r.a("SendContactTo", 2131231795));
              ((Bundle)localObject1).putString("selectAlertStringGroup", org.vidogram.messenger.r.a("SendContactToGroup", 2131231796));
              localObject1 = new v((Bundle)localObject1);
              ((v)localObject1).a(aq.this);
              aq.this.a((org.vidogram.ui.a.g)localObject1);
              return;
            }
            if (paramInt == 4)
            {
              localObject1 = new Bundle();
              ((Bundle)localObject1).putInt("user_id", aq.f(aq.this));
              aq.this.a(new r((Bundle)localObject1));
              return;
            }
            if (paramInt == 5)
            {
              localObject1 = org.vidogram.messenger.v.a().a(Integer.valueOf(aq.f(aq.this)));
              if ((localObject1 == null) || (aq.this.l() == null))
                continue;
              localObject3 = new AlertDialog.Builder(aq.this.l());
              ((AlertDialog.Builder)localObject3).setMessage(org.vidogram.messenger.r.a("AreYouSureDeleteContact", 2131230876));
              ((AlertDialog.Builder)localObject3).setTitle(org.vidogram.messenger.r.a("AppName", 2131230856));
              ((AlertDialog.Builder)localObject3).setPositiveButton(org.vidogram.messenger.r.a("OK", 2131231604), new DialogInterface.OnClickListener((g.vw)localObject1)
              {
                public void onClick(DialogInterface paramDialogInterface, int paramInt)
                {
                  paramDialogInterface = new ArrayList();
                  paramDialogInterface.add(this.a);
                  org.vidogram.messenger.f.a().a(paramDialogInterface);
                }
              });
              ((AlertDialog.Builder)localObject3).setNegativeButton(org.vidogram.messenger.r.a("Cancel", 2131230943), null);
              aq.this.b(((AlertDialog.Builder)localObject3).create());
              return;
            }
            if (paramInt == 7)
            {
              aq.h(aq.this);
              return;
            }
            if (paramInt == 8)
            {
              localObject1 = new Bundle();
              ((Bundle)localObject1).putInt("chat_id", aq.e(aq.this));
              aq.this.a(new g((Bundle)localObject1));
              return;
            }
            if (paramInt == 12)
            {
              localObject1 = new Bundle();
              ((Bundle)localObject1).putInt("chat_id", aq.e(aq.this));
              localObject1 = new m((Bundle)localObject1);
              ((m)localObject1).a(aq.i(aq.this));
              aq.this.a((org.vidogram.ui.a.g)localObject1);
              return;
            }
            if (paramInt != 9)
              break;
            localObject1 = org.vidogram.messenger.v.a().a(Integer.valueOf(aq.f(aq.this)));
            if (localObject1 == null)
              continue;
            localObject3 = new Bundle();
            ((Bundle)localObject3).putBoolean("onlySelect", true);
            ((Bundle)localObject3).putInt("dialogsType", 2);
            ((Bundle)localObject3).putString("addToGroupAlertString", org.vidogram.messenger.r.a("AddToTheGroupTitle", 2131230831, new Object[] { ae.c((g.vw)localObject1), "%1$s" }));
            localObject3 = new v((Bundle)localObject3);
            ((v)localObject3).a(new v.a((g.vw)localObject1)
            {
              public void a(v paramv, long paramLong, boolean paramBoolean)
              {
                Bundle localBundle = new Bundle();
                localBundle.putBoolean("scrollToTopOnResume", true);
                localBundle.putInt("chat_id", -(int)paramLong);
                if (!org.vidogram.messenger.v.a(localBundle, paramv))
                  return;
                y.a().b(aq.this, y.d);
                y.a().a(y.d, new Object[0]);
                org.vidogram.messenger.v.a().a(-(int)paramLong, this.a, null, 0, null, aq.this);
                aq.this.a(new q(localBundle), true);
                aq.this.e();
              }
            });
            aq.this.a((org.vidogram.ui.a.g)localObject3);
            return;
          }
          if (paramInt == 10)
            while (true)
            {
              try
              {
                localObject1 = org.vidogram.messenger.v.a().a(Integer.valueOf(aq.f(aq.this)));
                if (localObject1 == null)
                  break;
                localObject3 = new Intent("android.intent.action.SEND");
                ((Intent)localObject3).setType("text/plain");
                String str = org.vidogram.messenger.v.a().f(aq.j(aq.this).b);
                if ((aq.j(aq.this) != null) && (str != null))
                {
                  ((Intent)localObject3).putExtra("android.intent.extra.TEXT", String.format("%s https://telegram.me/%s", new Object[] { str, ((g.vw)localObject1).g }));
                  aq.this.a(Intent.createChooser((Intent)localObject3, org.vidogram.messenger.r.a("BotShare", 2131230930)), 500);
                  return;
                }
              }
              catch (Exception localException1)
              {
                n.a("tmessages", localException1);
                return;
              }
              ((Intent)localObject3).putExtra("android.intent.extra.TEXT", String.format("https://telegram.me/%s", new Object[] { localException1.g }));
            }
          if (paramInt == 11)
          {
            localObject2 = new Bundle();
            ((Bundle)localObject2).putInt("chat_id", aq.e(aq.this));
            localObject2 = new av((Bundle)localObject2);
            ((av)localObject2).a(aq.i(aq.this));
            aq.this.a((org.vidogram.ui.a.g)localObject2);
            return;
          }
          if (paramInt != 13)
            continue;
          Object localObject2 = new Bundle();
          ((Bundle)localObject2).putInt("chat_id", aq.e(aq.this));
          aq.this.a(new t((Bundle)localObject2));
          return;
        }
        while (paramInt != 14);
        while (true)
        {
          try
          {
            if (aq.k(aq.this) != null)
            {
              l = aq.k(aq.this).b << 32;
              org.vidogram.messenger.a.a(l);
              return;
            }
          }
          catch (Exception localException2)
          {
            n.a("tmessages", localException2);
            return;
          }
          if (aq.f(aq.this) != 0)
          {
            l = aq.f(aq.this);
            continue;
          }
          if (aq.e(aq.this) == 0)
            break;
          paramInt = aq.e(aq.this);
          long l = -paramInt;
        }
      }
    });
    F();
    this.k = new a(paramContext);
    this.q = new org.vidogram.ui.Components.b();
    this.q.a(true);
    this.b = new FrameLayout(paramContext)
    {
      public boolean hasOverlappingRendering()
      {
        return false;
      }

      protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
      {
        super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
        aq.l(aq.this);
      }
    };
    Object localObject1 = (FrameLayout)this.b;
    this.i = new aw(paramContext)
    {
      public boolean hasOverlappingRendering()
      {
        return false;
      }
    };
    this.i.setTag(Integer.valueOf(6));
    this.i.setPadding(0, org.vidogram.messenger.a.a(88.0F), 0, 0);
    this.i.setBackgroundColor(-1);
    this.i.setVerticalScrollBarEnabled(false);
    this.i.setItemAnimator(null);
    this.i.setLayoutAnimation(null);
    this.i.setClipToPadding(false);
    this.j = new LinearLayoutManager(paramContext)
    {
      public boolean c()
      {
        return false;
      }
    };
    this.j.b(1);
    this.i.setLayoutManager(this.j);
    Object localObject2 = this.i;
    if ((this.t != 0) || ((org.vidogram.messenger.e.a(this.u)) && (!this.O.r)))
    {
      i1 = 5;
      ((aw)localObject2).setGlowColor(org.vidogram.ui.Components.b.f(i1));
      ((FrameLayout)localObject1).addView(this.i, org.vidogram.ui.Components.v.b(-1, -1, 51));
      this.i.setAdapter(this.k);
      this.i.setOnItemClickListener(new aw.b()
      {
        public void a(View paramView, int paramInt)
        {
          if (aq.this.l() == null);
          while (true)
          {
            return;
            long l;
            if (paramInt == aq.m(aq.this))
            {
              paramView = new Bundle();
              if (aq.f(aq.this) != 0)
                if (aq.n(aq.this) != 0L)
                {
                  l = aq.n(aq.this);
                  paramView.putLong("dialog_id", l);
                }
              while (true)
              {
                paramView = new af(paramView);
                paramView.a(aq.i(aq.this));
                aq.this.a(paramView);
                return;
                l = aq.f(aq.this);
                break;
                paramView.putLong("dialog_id", -aq.e(aq.this));
              }
            }
            if (paramInt == aq.o(aq.this))
            {
              paramView = new Bundle();
              paramView.putInt("chat_id", (int)(aq.n(aq.this) >> 32));
              aq.this.a(new ab(paramView));
              return;
            }
            if (paramInt == aq.p(aq.this))
            {
              aq.this.b(org.vidogram.messenger.a.a(aq.this.l(), aq.k(aq.this)).create());
              return;
            }
            if (paramInt == aq.q(aq.this))
            {
              paramView = new Bundle();
              if (aq.f(aq.this) != 0)
                if (aq.n(aq.this) == 0L)
                {
                  l = aq.f(aq.this);
                  paramView.putLong("dialog_id", l);
                }
              while (true)
              {
                aq.this.a(new ar(paramView));
                return;
                l = aq.n(aq.this);
                break;
                if (aq.e(aq.this) == 0)
                  continue;
                paramView.putLong("dialog_id", -aq.e(aq.this));
              }
            }
            if (paramInt == aq.r(aq.this))
            {
              paramView = new AlertDialog.Builder(aq.this.l());
              paramView.setMessage(org.vidogram.messenger.r.a("AreYouSureSecretChat", 2131230883));
              paramView.setTitle(org.vidogram.messenger.r.a("AppName", 2131230856));
              paramView.setPositiveButton(org.vidogram.messenger.r.a("OK", 2131231604), new DialogInterface.OnClickListener()
              {
                public void onClick(DialogInterface paramDialogInterface, int paramInt)
                {
                  aq.a(aq.this, true);
                  org.vidogram.messenger.ab.a().a(aq.this.l(), org.vidogram.messenger.v.a().a(Integer.valueOf(aq.f(aq.this))));
                }
              });
              paramView.setNegativeButton(org.vidogram.messenger.r.a("Cancel", 2131230943), null);
              aq.this.b(paramView.create());
              return;
            }
            if ((paramInt <= aq.s(aq.this)) || (paramInt >= aq.t(aq.this)))
              break;
            if (!aq.u(aq.this).isEmpty());
            for (paramInt = ((g.k)aq.i(aq.this).t.e.get(((Integer)aq.u(aq.this).get(paramInt - aq.s(aq.this) - 1)).intValue())).b; paramInt != ad.c(); paramInt = ((g.k)aq.i(aq.this).t.e.get(paramInt - aq.s(aq.this) - 1)).b)
            {
              paramView = new Bundle();
              paramView.putInt("user_id", paramInt);
              aq.this.a(new aq(paramView));
              return;
            }
          }
          if (paramInt == aq.v(aq.this))
          {
            aq.w(aq.this);
            return;
          }
          if (paramInt == aq.x(aq.this))
            while (true)
            {
              try
              {
                paramView = new Intent("android.intent.action.SEND");
                paramView.setType("text/plain");
                if ((aq.i(aq.this).f != null) && (aq.i(aq.this).f.length() > 0))
                {
                  paramView.putExtra("android.intent.extra.TEXT", aq.y(aq.this).i + "\n" + aq.i(aq.this).f + "\nhttps://telegram.me/" + aq.y(aq.this).v);
                  aq.this.l().startActivityForResult(Intent.createChooser(paramView, org.vidogram.messenger.r.a("BotShare", 2131230930)), 500);
                  return;
                }
              }
              catch (Exception paramView)
              {
                n.a("tmessages", paramView);
                return;
              }
              paramView.putExtra("android.intent.extra.TEXT", aq.y(aq.this).i + "\nhttps://telegram.me/" + aq.y(aq.this).v);
            }
          if (paramInt == aq.z(aq.this))
          {
            aq.h(aq.this);
            return;
          }
          if ((paramInt == aq.A(aq.this)) || (paramInt == aq.B(aq.this)) || (paramInt == aq.C(aq.this)))
          {
            paramView = new Bundle();
            paramView.putInt("chat_id", aq.e(aq.this));
            if (paramInt == aq.B(aq.this))
              paramView.putInt("type", 0);
            while (true)
            {
              aq.this.a(new p(paramView));
              return;
              if (paramInt == aq.C(aq.this))
              {
                paramView.putInt("type", 1);
                continue;
              }
              if (paramInt != aq.A(aq.this))
                continue;
              paramView.putInt("type", 2);
            }
          }
          if (paramInt == aq.D(aq.this))
          {
            paramView = new AlertDialog.Builder(aq.this.l());
            paramView.setMessage(org.vidogram.messenger.r.a("ConvertGroupAlert", 2131231082));
            paramView.setTitle(org.vidogram.messenger.r.a("ConvertGroupAlertWarning", 2131231083));
            paramView.setPositiveButton(org.vidogram.messenger.r.a("OK", 2131231604), new DialogInterface.OnClickListener()
            {
              public void onClick(DialogInterface paramDialogInterface, int paramInt)
              {
                org.vidogram.messenger.v.a().a(aq.this.l(), aq.e(aq.this));
              }
            });
            paramView.setNegativeButton(org.vidogram.messenger.r.a("Cancel", 2131230943), null);
            aq.this.b(paramView.create());
            return;
          }
          aq.a(aq.this, paramInt);
        }
      });
      this.i.setOnItemLongClickListener(new aw.c()
      {
        public boolean a(View paramView, int paramInt)
        {
          Object localObject1;
          int i;
          if ((paramInt > aq.s(aq.this)) && (paramInt < aq.t(aq.this)))
          {
            if (aq.this.l() == null)
              return false;
            if (!aq.u(aq.this).isEmpty())
            {
              paramView = (g.k)aq.i(aq.this).t.e.get(((Integer)aq.u(aq.this).get(paramInt - aq.s(aq.this) - 1)).intValue());
              aq.b(aq.this, paramView.b);
              if (!org.vidogram.messenger.e.d(aq.y(aq.this)))
                break label376;
              localObject1 = ((g.fe)paramView).f;
              if (paramView.b == ad.c())
                break label530;
              if (!aq.y(aq.this).c)
                break label334;
              i = 1;
            }
          }
          while (true)
          {
            label153: Object localObject2 = org.vidogram.messenger.v.a().a(Integer.valueOf(paramView.b));
            if (((localObject1 instanceof g.dq)) && (!((g.vw)localObject2).r))
              paramInt = 1;
            while (true)
            {
              if (i == 0)
                break label528;
              localObject1 = new AlertDialog.Builder(aq.this.l());
              if ((aq.y(aq.this).r) && (aq.y(aq.this).c) && (paramInt != 0))
              {
                localObject2 = org.vidogram.messenger.r.a("SetAsAdmin", 2131231827);
                String str = org.vidogram.messenger.r.a("KickFromGroup", 2131231343);
                paramView = new DialogInterface.OnClickListener(paramView)
                {
                  public void onClick(DialogInterface paramDialogInterface, int paramInt)
                  {
                    if (paramInt == 0)
                    {
                      paramDialogInterface = (g.fe)this.a;
                      paramDialogInterface.f = new g.ds();
                      paramDialogInterface.f.d = ad.c();
                      paramDialogInterface.f.b = this.a.b;
                      paramDialogInterface.f.c = this.a.d;
                      paramDialogInterface = new g.ej();
                      paramDialogInterface.c = org.vidogram.messenger.v.b(aq.e(aq.this));
                      paramDialogInterface.d = org.vidogram.messenger.v.a(aq.E(aq.this));
                      paramDialogInterface.e = new g.dz();
                      ConnectionsManager.a().a(paramDialogInterface, new org.vidogram.tgnet.c()
                      {
                      });
                    }
                    do
                      return;
                    while (paramInt != 1);
                    aq.c(aq.this, aq.E(aq.this));
                  }
                };
                ((AlertDialog.Builder)localObject1).setItems(new CharSequence[] { localObject2, str }, paramView);
                aq.this.b(((AlertDialog.Builder)localObject1).create());
                return true;
                paramView = (g.k)aq.i(aq.this).t.e.get(paramInt - aq.s(aq.this) - 1);
                break;
                label334: if ((!(localObject1 instanceof g.dq)) || ((!aq.y(aq.this).n) && (((g.f)localObject1).d != ad.c())))
                  break label530;
                i = 1;
                break label153;
                paramInt = 0;
                continue;
                label376: if (paramView.b != ad.c())
                {
                  if (aq.y(aq.this).c)
                  {
                    paramInt = 0;
                    i = 1;
                    continue;
                  }
                  if (((paramView instanceof g.fl)) && (((aq.y(aq.this).f) && (aq.y(aq.this).e)) || (paramView.c == ad.c())))
                  {
                    paramInt = 0;
                    i = 1;
                    continue;
                  }
                }
              }
              else
              {
                if (aq.e(aq.this) > 0);
                for (paramView = org.vidogram.messenger.r.a("KickFromGroup", 2131231343); ; paramView = org.vidogram.messenger.r.a("KickFromBroadcast", 2131231342))
                {
                  localObject2 = new DialogInterface.OnClickListener()
                  {
                    public void onClick(DialogInterface paramDialogInterface, int paramInt)
                    {
                      if (paramInt == 0)
                        aq.c(aq.this, aq.E(aq.this));
                    }
                  };
                  ((AlertDialog.Builder)localObject1).setItems(new CharSequence[] { paramView }, (DialogInterface.OnClickListener)localObject2);
                  break;
                }
                return aq.a(aq.this, paramInt);
              }
              paramInt = 0;
              i = 0;
            }
            label528: break;
            label530: i = 0;
          }
        }
      });
      this.s = new b(paramContext);
      localObject2 = this.s;
      if ((this.t == 0) && ((!org.vidogram.messenger.e.a(this.u)) || (this.O.r)))
        break label491;
    }
    label491: for (int i1 = 5; ; i1 = this.u)
    {
      ((b)localObject2).setBackgroundColor(org.vidogram.ui.Components.b.f(i1));
      ((FrameLayout)localObject1).addView(this.s);
      ((FrameLayout)localObject1).addView(this.d);
      this.l = new BackupImageView(paramContext);
      this.l.setRoundRadius(org.vidogram.messenger.a.a(21.0F));
      this.l.setPivotX(0.0F);
      this.l.setPivotY(0.0F);
      ((FrameLayout)localObject1).addView(this.l, org.vidogram.ui.Components.v.a(42, 42.0F, 51, 64.0F, 0.0F, 0.0F, 0.0F));
      this.l.setOnClickListener(new View.OnClickListener()
      {
        public void onClick(View paramView)
        {
          if (aq.f(aq.this) != 0)
          {
            paramView = org.vidogram.messenger.v.a().a(Integer.valueOf(aq.f(aq.this)));
            if ((paramView.j != null) && (paramView.j.f != null))
              am.a().a(aq.this.l());
          }
          do
          {
            am.a().a(paramView.j.f, aq.this);
            do
              return;
            while (aq.e(aq.this) == 0);
            paramView = org.vidogram.messenger.v.a().b(Integer.valueOf(aq.e(aq.this)));
          }
          while ((paramView.j == null) || (paramView.j.c == null));
          am.a().a(aq.this.l());
          am.a().a(paramView.j.c, aq.this);
        }
      });
      i1 = 0;
      while (true)
      {
        if (i1 >= 2)
          break label796;
        if ((this.D) || (i1 != 0))
          break;
        i1 += 1;
      }
      i1 = this.u;
      break;
    }
    this.m[i1] = new k(paramContext);
    this.m[i1].setTextColor(-1);
    this.m[i1].setTextSize(18);
    this.m[i1].setGravity(3);
    this.m[i1].setTypeface(org.vidogram.messenger.a.a("fonts/rmedium.ttf"));
    this.m[i1].setLeftDrawableTopPadding(-org.vidogram.messenger.a.a(1.3F));
    this.m[i1].setRightDrawableTopPadding(-org.vidogram.messenger.a.a(1.3F));
    this.m[i1].setPivotX(0.0F);
    this.m[i1].setPivotY(0.0F);
    localObject2 = this.m[i1];
    float f;
    label627: int i2;
    if (i1 == 0)
    {
      f = 48.0F;
      ((FrameLayout)localObject1).addView((View)localObject2, org.vidogram.ui.Components.v.a(-2, -2.0F, 51, 118.0F, 0.0F, f, 0.0F));
      this.n[i1] = new k(paramContext);
      localObject2 = this.n[i1];
      if ((this.t == 0) && ((!org.vidogram.messenger.e.a(this.u)) || (this.O.r)))
        break label780;
      i2 = 5;
      label702: ((k)localObject2).setTextColor(org.vidogram.ui.Components.b.e(i2));
      this.n[i1].setTextSize(14);
      this.n[i1].setGravity(3);
      localObject2 = this.n[i1];
      if (i1 != 0)
        break label789;
      f = 48.0F;
    }
    while (true)
    {
      ((FrameLayout)localObject1).addView((View)localObject2, org.vidogram.ui.Components.v.a(-2, -2.0F, 51, 118.0F, 0.0F, f, 0.0F));
      break;
      f = 0.0F;
      break label627;
      label780: i2 = this.u;
      break label702;
      label789: f = 8.0F;
    }
    label796: if ((this.t != 0) || ((this.u >= 0) && (!org.vidogram.messenger.e.a(this.O))))
      this.o = new ImageView(paramContext);
    try
    {
      this.o.setBackgroundResource(2130837779);
      this.o.setScaleType(ImageView.ScaleType.CENTER);
      if (this.t != 0)
      {
        this.o.setImageResource(2130837775);
        this.o.setPadding(0, org.vidogram.messenger.a.a(3.0F), 0, 0);
        ((FrameLayout)localObject1).addView(this.o, org.vidogram.ui.Components.v.a(-2, -2.0F, 53, 0.0F, 0.0F, 16.0F, 0.0F));
        if (Build.VERSION.SDK_INT >= 21)
        {
          paramContext = new StateListAnimator();
          localObject1 = ObjectAnimator.ofFloat(this.o, "translationZ", new float[] { org.vidogram.messenger.a.a(2.0F), org.vidogram.messenger.a.a(4.0F) }).setDuration(200L);
          paramContext.addState(new int[] { 16842919 }, (Animator)localObject1);
          localObject1 = ObjectAnimator.ofFloat(this.o, "translationZ", new float[] { org.vidogram.messenger.a.a(4.0F), org.vidogram.messenger.a.a(2.0F) }).setDuration(200L);
          paramContext.addState(new int[0], (Animator)localObject1);
          this.o.setStateListAnimator(paramContext);
          this.o.setOutlineProvider(new ViewOutlineProvider()
          {
            @SuppressLint({"NewApi"})
            public void getOutline(View paramView, Outline paramOutline)
            {
              paramOutline.setOval(0, 0, org.vidogram.messenger.a.a(56.0F), org.vidogram.messenger.a.a(56.0F));
            }
          });
        }
        this.o.setOnClickListener(new View.OnClickListener()
        {
          public void onClick(View paramView)
          {
            if (aq.this.l() == null);
            while (true)
            {
              return;
              if (aq.f(aq.this) != 0)
              {
                if ((aq.F(aq.this)) && ((aq.H(aq.this).e.get(aq.G(aq.this).e.size() - 2) instanceof q)))
                {
                  aq.this.d();
                  return;
                }
                paramView = org.vidogram.messenger.v.a().a(Integer.valueOf(aq.f(aq.this)));
                if ((paramView == null) || ((paramView instanceof g.uo)))
                  continue;
                paramView = new Bundle();
                paramView.putInt("user_id", aq.f(aq.this));
                if (!org.vidogram.messenger.v.a(paramView, aq.this))
                  continue;
                y.a().b(aq.this, y.d);
                y.a().a(y.d, new Object[0]);
                aq.this.a(new q(paramView), true);
                return;
              }
              if (aq.e(aq.this) == 0)
                continue;
              boolean bool = org.vidogram.messenger.e.d(aq.y(aq.this));
              if (((!bool) || (aq.y(aq.this).c) || ((aq.y(aq.this).r) && (aq.y(aq.this).n))) && ((bool) || (aq.y(aq.this).f) || (aq.y(aq.this).c) || (!aq.y(aq.this).e)))
                break;
              if ((aq.F(aq.this)) && ((aq.J(aq.this).e.get(aq.I(aq.this).e.size() - 2) instanceof q)))
              {
                aq.this.d();
                return;
              }
              paramView = new Bundle();
              paramView.putInt("chat_id", aq.y(aq.this).h);
              if (!org.vidogram.messenger.v.a(paramView, aq.this))
                continue;
              y.a().b(aq.this, y.d);
              y.a().a(y.d, new Object[0]);
              aq.this.a(new q(paramView), true);
              return;
            }
            AlertDialog.Builder localBuilder = new AlertDialog.Builder(aq.this.l());
            paramView = org.vidogram.messenger.v.a().b(Integer.valueOf(aq.e(aq.this)));
            if ((paramView.j == null) || (paramView.j.c == null) || ((paramView.j instanceof g.ft)))
            {
              paramView = new CharSequence[2];
              paramView[0] = org.vidogram.messenger.r.a("FromCamera", 2131231263);
              paramView[1] = org.vidogram.messenger.r.a("FromGalley", 2131231270);
            }
            while (true)
            {
              localBuilder.setItems(paramView, new DialogInterface.OnClickListener()
              {
                public void onClick(DialogInterface paramDialogInterface, int paramInt)
                {
                  if (paramInt == 0)
                    aq.K(aq.this).b();
                  do
                  {
                    return;
                    if (paramInt != 1)
                      continue;
                    aq.K(aq.this).c();
                    return;
                  }
                  while (paramInt != 2);
                  org.vidogram.messenger.v.a().a(aq.e(aq.this), null);
                }
              });
              aq.this.b(localBuilder.create());
              return;
              paramView = new CharSequence[3];
              paramView[0] = org.vidogram.messenger.r.a("FromCamera", 2131231263);
              paramView[1] = org.vidogram.messenger.r.a("FromGalley", 2131231270);
              paramView[2] = org.vidogram.messenger.r.a("DeletePhoto", 2131231133);
            }
          }
        });
        u();
        this.i.setOnScrollListener(new RecyclerView.l()
        {
          public void a(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
          {
            aq.l(aq.this);
            if ((aq.L(aq.this) != null) && (aq.M(aq.this) != -1) && (aq.N(aq.this).n() > aq.M(aq.this) - 8))
              aq.b(aq.this, false);
          }
        });
        return this.b;
      }
    }
    catch (java.lang.Throwable paramContext)
    {
      while (true)
      {
        n.a("tmessages", paramContext);
        continue;
        if (this.u == 0)
          continue;
        boolean bool = org.vidogram.messenger.e.d(this.O);
        if (((bool) && (!this.O.c) && ((!this.O.r) || (!this.O.n))) || ((!bool) && (!this.O.f) && (!this.O.c) && (this.O.e)))
        {
          this.o.setImageResource(2130837775);
          this.o.setPadding(0, org.vidogram.messenger.a.a(3.0F), 0, 0);
          continue;
        }
        this.o.setImageResource(2130837773);
      }
    }
  }

  public am.e a(org.vidogram.messenger.u paramu, g.x paramx, int paramInt)
  {
    if (paramx == null);
    while (true)
    {
      return null;
      if (this.t != 0)
      {
        paramu = org.vidogram.messenger.v.a().a(Integer.valueOf(this.t));
        if ((paramu == null) || (paramu.j == null) || (paramu.j.f == null))
          break label300;
        paramu = paramu.j.f;
      }
      while ((paramu != null) && (paramu.d == paramx.d) && (paramu.c == paramx.c) && (paramu.b == paramx.b))
      {
        paramu = new int[2];
        this.l.getLocationInWindow(paramu);
        paramx = new am.e();
        paramx.b = paramu[0];
        int i1 = paramu[1];
        if (Build.VERSION.SDK_INT >= 21)
        {
          paramInt = 0;
          label136: paramx.c = (i1 - paramInt);
          paramx.d = this.l;
          paramx.a = this.l.getImageReceiver();
          if (this.t == 0)
            break label281;
          paramx.f = this.t;
        }
        while (true)
        {
          paramx.e = paramx.a.h();
          paramx.g = -1;
          paramx.h = this.l.getImageReceiver().D();
          paramx.k = this.l.getScaleX();
          return paramx;
          if (this.u == 0)
            break label300;
          paramu = org.vidogram.messenger.v.a().b(Integer.valueOf(this.u));
          if ((paramu == null) || (paramu.j == null) || (paramu.j.c == null))
            break label300;
          paramu = paramu.j.c;
          break;
          paramInt = org.vidogram.messenger.a.a;
          break label136;
          label281: if (this.u == 0)
            continue;
          paramx.f = (-this.u);
        }
        label300: paramu = null;
      }
    }
  }

  public void a(float paramFloat)
  {
    int i2 = 5;
    this.H = paramFloat;
    this.i.setAlpha(paramFloat);
    this.i.setTranslationX(org.vidogram.messenger.a.a(48.0F) - org.vidogram.messenger.a.a(48.0F) * paramFloat);
    int i7;
    int i3;
    int i4;
    int i5;
    int i6;
    if ((this.t != 0) || ((org.vidogram.messenger.e.a(this.u)) && (!this.O.r)))
    {
      i1 = 5;
      i7 = org.vidogram.ui.Components.b.f(i1);
      i1 = Color.red(l.a);
      i3 = Color.green(l.a);
      i4 = Color.blue(l.a);
      i5 = (int)((Color.red(i7) - i1) * paramFloat);
      i6 = (int)((Color.green(i7) - i3) * paramFloat);
      i7 = (int)((Color.blue(i7) - i4) * paramFloat);
      this.s.setBackgroundColor(Color.rgb(i1 + i5, i3 + i6, i7 + i4));
      i1 = i2;
      if (this.t == 0)
      {
        if ((!org.vidogram.messenger.e.a(this.u)) || (this.O.r))
          break label290;
        i1 = i2;
      }
      label193: i1 = org.vidogram.ui.Components.b.e(i1);
      i2 = Color.red(-2758409);
      i3 = Color.green(-2758409);
      i4 = Color.blue(-2758409);
      i5 = (int)((Color.red(i1) - i2) * paramFloat);
      i6 = (int)((Color.green(i1) - i3) * paramFloat);
      i7 = (int)((Color.blue(i1) - i4) * paramFloat);
      i1 = 0;
      label261: if (i1 >= 2)
        break label327;
      if (this.n[i1] != null)
        break label298;
    }
    while (true)
    {
      i1 += 1;
      break label261;
      i1 = this.u;
      break;
      label290: i1 = this.u;
      break label193;
      label298: this.n[i1].setTextColor(Color.rgb(i2 + i5, i3 + i6, i4 + i7));
    }
    label327: this.F = (int)(this.G * paramFloat);
    if (this.t != 0)
    {
      i1 = this.t;
      i2 = org.vidogram.ui.Components.b.d(i1);
      if (this.t == 0)
        break label472;
    }
    label472: for (int i1 = this.t; ; i1 = this.u)
    {
      i1 = org.vidogram.ui.Components.b.b(i1);
      if (i2 != i1)
      {
        i3 = (int)((Color.red(i2) - Color.red(i1)) * paramFloat);
        i4 = (int)((Color.green(i2) - Color.green(i1)) * paramFloat);
        i2 = (int)((Color.blue(i2) - Color.blue(i1)) * paramFloat);
        this.q.h(Color.rgb(i3 + Color.red(i1), i4 + Color.green(i1), Color.blue(i1) + i2));
        this.l.invalidate();
      }
      u();
      return;
      i1 = this.u;
      break;
    }
  }

  public void a(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (this.u != 0)
      this.I.a(paramInt1, paramInt2, paramIntent);
  }

  public void a(int paramInt, Object[] paramArrayOfObject)
  {
    int i2 = 0;
    int i3 = 0;
    int i1 = 0;
    if (paramInt == y.b)
    {
      i2 = ((Integer)paramArrayOfObject[0]).intValue();
      if (this.t != 0)
      {
        if (((i2 & 0x2) != 0) || ((i2 & 0x1) != 0) || ((i2 & 0x4) != 0))
          E();
        if (((i2 & 0x400) != 0) && (this.i != null))
        {
          paramArrayOfObject = (aq.a.a)this.i.b(this.V);
          label105: if (paramArrayOfObject != null)
          {
            this.k.a(paramArrayOfObject, this.V);
            break label105;
            break label105;
            break label105;
            break label105;
            break label105;
            break label105;
            break label105;
            break label105;
            break label105;
            break label105;
            break label105;
          }
        }
      }
    }
    while (true)
    {
      return;
      if (this.u == 0)
        continue;
      if ((i2 & 0x4000) != 0)
      {
        paramArrayOfObject = org.vidogram.messenger.v.a().b(Integer.valueOf(this.u));
        if (paramArrayOfObject != null)
        {
          this.O = paramArrayOfObject;
          F();
          D();
          if (this.k != null)
            this.k.c();
        }
      }
      if (((i2 & 0x2000) != 0) || ((i2 & 0x8) != 0) || ((i2 & 0x10) != 0) || ((i2 & 0x20) != 0) || ((i2 & 0x4) != 0))
      {
        B();
        E();
      }
      if ((i2 & 0x2000) != 0)
      {
        D();
        if (this.k != null)
          this.k.c();
      }
      if ((((i2 & 0x2) == 0) && ((i2 & 0x1) == 0) && ((i2 & 0x4) == 0)) || (this.i == null))
        break;
      i3 = this.i.getChildCount();
      paramInt = i1;
      while (paramInt < i3)
      {
        paramArrayOfObject = this.i.getChildAt(paramInt);
        if ((paramArrayOfObject instanceof bh))
          ((bh)paramArrayOfObject).a(i2);
        paramInt += 1;
      }
      continue;
      if (paramInt == y.k)
      {
        F();
        return;
      }
      if (paramInt == y.q)
      {
        long l3 = ((Long)paramArrayOfObject[0]).longValue();
        long l2 = this.v;
        long l1 = l2;
        if (l2 == 0L)
        {
          if (this.t != 0)
            l1 = this.t;
        }
        else
        {
          label380: if ((l3 != l1) && (l3 != this.y))
            break label507;
          if (l3 != l1)
            break label509;
          this.Q = ((Integer)paramArrayOfObject[1]).intValue();
          label419: if (this.i == null)
            break label523;
          i1 = this.i.getChildCount();
          paramInt = i2;
        }
        while (true)
        {
          if (paramInt >= i1)
            break label530;
          paramArrayOfObject = this.i.getChildAt(paramInt);
          paramArrayOfObject = (aq.a.a)this.i.a(paramArrayOfObject);
          if (paramArrayOfObject.e() == this.ae)
          {
            this.k.a(paramArrayOfObject, this.ae);
            return;
            l1 = l2;
            if (this.u == 0)
              break label380;
            l1 = -this.u;
            break label380;
            label507: break;
            label509: this.R = ((Integer)paramArrayOfObject[1]).intValue();
            break label419;
            label523: break;
          }
          paramInt += 1;
        }
        label530: continue;
      }
      if (paramInt == y.t)
      {
        if (!this.w)
          break;
        org.vidogram.messenger.a.a(new Runnable(paramArrayOfObject)
        {
          public void run()
          {
            y.a().b(aq.this, y.d);
            y.a().a(y.d, new Object[0]);
            g.t localt = (g.t)this.a[0];
            Bundle localBundle = new Bundle();
            localBundle.putInt("enc_id", localt.b);
            aq.this.a(new q(localBundle), true);
          }
        });
        return;
      }
      if (paramInt == y.r)
      {
        paramArrayOfObject = (g.t)paramArrayOfObject[0];
        if ((this.N == null) || (paramArrayOfObject.b != this.N.b))
          break;
        this.N = paramArrayOfObject;
        D();
        if (this.k == null)
          break;
        this.k.c();
        return;
      }
      boolean bool;
      if (paramInt == y.y)
      {
        bool = this.x;
        this.x = org.vidogram.messenger.v.a().q.contains(Integer.valueOf(this.t));
        if (bool == this.x)
          break;
        F();
        return;
      }
      Object localObject;
      if (paramInt == y.n)
      {
        localObject = (g.j)paramArrayOfObject[0];
        if (((g.j)localObject).e != this.u)
          break;
        bool = ((Boolean)paramArrayOfObject[2]).booleanValue();
        if (((this.J instanceof g.dl)) && (((g.j)localObject).t == null) && (this.J != null))
          ((g.j)localObject).t = this.J.t;
        if ((this.J == null) && ((localObject instanceof g.dl)));
        for (paramInt = 1; ; paramInt = 0)
        {
          this.J = ((g.j)localObject);
          if ((this.y == 0L) && (this.J.q != 0))
          {
            this.y = (-this.J.q);
            org.vidogram.messenger.d.f.a(this.y, 0, this.e, true);
          }
          C();
          B();
          D();
          if (this.k != null)
            this.k.c();
          paramArrayOfObject = org.vidogram.messenger.v.a().b(Integer.valueOf(this.u));
          if (paramArrayOfObject != null)
          {
            this.O = paramArrayOfObject;
            F();
          }
          if ((!this.O.r) || ((paramInt == 0) && (bool)))
            break;
          c(true);
          return;
        }
      }
      if (paramInt == y.d)
      {
        e();
        return;
      }
      if (paramInt == y.T)
      {
        paramArrayOfObject = (g.b)paramArrayOfObject[0];
        if (paramArrayOfObject.b != this.t)
          break;
        this.P = paramArrayOfObject;
        D();
        if (this.k == null)
          break;
        this.k.c();
        return;
      }
      if (paramInt == y.U)
      {
        if (((Integer)paramArrayOfObject[0]).intValue() != this.t)
          break;
        D();
        if (this.k == null)
          break;
        this.k.c();
        return;
      }
      if ((paramInt != y.a) || (((Long)paramArrayOfObject[0]).longValue() != this.v))
        break;
      paramArrayOfObject = (ArrayList)paramArrayOfObject[1];
      paramInt = i3;
      while (paramInt < paramArrayOfObject.size())
      {
        localObject = (org.vidogram.messenger.u)paramArrayOfObject.get(paramInt);
        if ((this.N != null) && (((org.vidogram.messenger.u)localObject).a.f != null) && ((((org.vidogram.messenger.u)localObject).a.f instanceof g.ne)) && ((((org.vidogram.messenger.u)localObject).a.f.d instanceof g.gu)))
        {
          localObject = (g.gu)((org.vidogram.messenger.u)localObject).a.f.d;
          if (this.k != null)
            this.k.c();
        }
        paramInt += 1;
      }
    }
  }

  public void a(Configuration paramConfiguration)
  {
    super.a(paramConfiguration);
    v();
  }

  public void a(Bundle paramBundle)
  {
    if ((this.u != 0) && (this.I != null) && (this.I.a != null))
      paramBundle.putString("path", this.I.a);
  }

  public void a(g.j paramj)
  {
    this.J = paramj;
    if ((this.J != null) && (this.J.q != 0))
      this.y = (-this.J.q);
    C();
  }

  public void a(v paramv, long paramLong, boolean paramBoolean)
  {
    Bundle localBundle;
    int i1;
    if (paramLong != 0L)
    {
      localBundle = new Bundle();
      localBundle.putBoolean("scrollToTopOnResume", true);
      i1 = (int)paramLong;
      if (i1 == 0)
        break label77;
      if (i1 <= 0)
        break label58;
      localBundle.putInt("user_id", i1);
    }
    while (!org.vidogram.messenger.v.a(localBundle, paramv))
    {
      return;
      label58: if (i1 >= 0)
        continue;
      localBundle.putInt("chat_id", -i1);
      continue;
      label77: localBundle.putInt("enc_id", (int)(paramLong >> 32));
    }
    y.a().b(this, y.d);
    y.a().a(y.d, new Object[0]);
    a(new q(localBundle), true);
    e();
    paramv = org.vidogram.messenger.v.a().a(Integer.valueOf(this.t));
    ac.a().a(paramv, paramLong, null, null, null);
  }

  protected void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    if ((!paramBoolean2) && (this.D) && (this.E))
      this.C = true;
    y.a().a(new int[] { y.c, y.d, y.q });
    y.a().a(true);
  }

  public void a_(int paramInt)
  {
  }

  public Bitmap b(org.vidogram.messenger.u paramu, g.x paramx, int paramInt)
  {
    return null;
  }

  protected org.vidogram.ui.a.a b(Context paramContext)
  {
    paramContext = new org.vidogram.ui.a.a(paramContext)
    {
      public boolean onTouchEvent(MotionEvent paramMotionEvent)
      {
        return super.onTouchEvent(paramMotionEvent);
      }
    };
    int i1;
    if ((this.t != 0) || ((org.vidogram.messenger.e.a(this.u)) && (!this.O.r)))
    {
      i1 = 5;
      paramContext.setItemsBackgroundColor(org.vidogram.ui.Components.b.c(i1));
      paramContext.setBackButtonDrawable(new org.vidogram.ui.a.f(false));
      paramContext.setCastShadows(false);
      paramContext.setAddToContainer(false);
      if ((Build.VERSION.SDK_INT < 21) || (org.vidogram.messenger.a.c()))
        break label100;
    }
    label100: for (boolean bool = true; ; bool = false)
    {
      paramContext.setOccupyStatusBar(bool);
      return paramContext;
      i1 = this.u;
      break;
    }
  }

  public void b(Bundle paramBundle)
  {
    if (this.u != 0)
    {
      org.vidogram.messenger.v.a().a(this.u, null, false);
      if (this.I != null)
        this.I.a = paramBundle.getString("path");
    }
  }

  public void b(boolean paramBoolean)
  {
    SharedPreferences localSharedPreferences = ApplicationLoader.a.getSharedPreferences("mainconfig", 0);
    if ((!org.vidogram.messenger.a.c()) && (localSharedPreferences.getBoolean("view_animations", true)))
      this.D = paramBoolean;
  }

  protected void b(boolean paramBoolean1, boolean paramBoolean2)
  {
    if ((!paramBoolean2) && (this.D) && (this.E))
      this.C = false;
    y.a().a(false);
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
    if (this.i != null)
      this.i.s();
  }

  public void c(org.vidogram.messenger.u paramu, g.x paramx, int paramInt)
  {
  }

  public void d(int paramInt)
  {
  }

  public boolean f()
  {
    this.t = this.f.getInt("user_id", 0);
    this.u = b().getInt("chat_id", 0);
    Object localObject;
    if (this.t != 0)
    {
      this.v = this.f.getLong("dialog_id", 0L);
      if (this.v != 0L)
        this.N = org.vidogram.messenger.v.a().c(Integer.valueOf((int)(this.v >> 32)));
      localObject = org.vidogram.messenger.v.a().a(Integer.valueOf(this.t));
      if (localObject == null)
        return false;
      y.a().a(this, y.b);
      y.a().a(this, y.k);
      y.a().a(this, y.t);
      y.a().a(this, y.r);
      y.a().a(this, y.y);
      y.a().a(this, y.T);
      y.a().a(this, y.U);
      if (this.N != null)
        y.a().a(this, y.a);
      this.x = org.vidogram.messenger.v.a().q.contains(Integer.valueOf(this.t));
      if (((g.vw)localObject).r)
        org.vidogram.messenger.d.a.a(((g.vw)localObject).d, true, this.e);
      org.vidogram.messenger.v.a().a(org.vidogram.messenger.v.a().a(Integer.valueOf(this.t)), this.e, true);
      this.A = null;
      label257: if (this.v == 0L)
        break label516;
      org.vidogram.messenger.d.f.a(this.v, 0, this.e, true);
    }
    while (true)
    {
      while (true)
      {
        y.a().a(this, y.q);
        y.a().a(this, y.b);
        y.a().a(this, y.d);
        D();
        return true;
        if (this.u == 0)
          break;
        this.O = org.vidogram.messenger.v.a().b(Integer.valueOf(this.u));
        if (this.O == null)
        {
          localObject = new Semaphore(0);
          w.a().c().b(new Runnable((Semaphore)localObject)
          {
            public void run()
            {
              aq.a(aq.this, w.a().i(aq.e(aq.this)));
              this.a.release();
            }
          });
        }
        try
        {
          ((Semaphore)localObject).acquire();
          if (this.O == null)
            break;
          org.vidogram.messenger.v.a().a(this.O, true);
          if (this.O.r)
          {
            c(true);
            y.a().a(this, y.n);
            this.M = new ArrayList();
            B();
            this.I = new org.vidogram.ui.Components.c();
            this.I.e = new c.a()
            {
              public void a(g.ad paramad, g.az paramaz1, g.az paramaz2)
              {
                if (aq.e(aq.this) != 0)
                  org.vidogram.messenger.v.a().a(aq.e(aq.this), paramad);
              }
            };
            this.I.d = this;
            if (!org.vidogram.messenger.e.d(this.O))
              break label257;
            org.vidogram.messenger.v.a().a(this.u, this.e, true);
          }
        }
        catch (Exception localException)
        {
          while (true)
          {
            n.a("tmessages", localException);
            continue;
            this.A = null;
          }
        }
      }
      label516: if (this.t != 0)
      {
        org.vidogram.messenger.d.f.a(this.t, 0, this.e, true);
        continue;
      }
      if (this.u <= 0)
        continue;
      org.vidogram.messenger.d.f.a(-this.u, 0, this.e, true);
      if (this.y == 0L)
        continue;
      org.vidogram.messenger.d.f.a(this.y, 0, this.e, true);
    }
  }

  public void g()
  {
    super.g();
    y.a().b(this, y.q);
    y.a().b(this, y.b);
    y.a().b(this, y.d);
    if (this.t != 0)
    {
      y.a().b(this, y.k);
      y.a().b(this, y.t);
      y.a().b(this, y.r);
      y.a().b(this, y.y);
      y.a().b(this, y.T);
      y.a().b(this, y.U);
      org.vidogram.messenger.v.a().g(this.t);
      if (this.N != null)
        y.a().b(this, y.a);
    }
    do
      return;
    while (this.u == 0);
    y.a().b(this, y.n);
    this.I.a();
  }

  public void i()
  {
    super.i();
    if (this.k != null)
      this.k.c();
    E();
    v();
  }

  public boolean q()
  {
    return this.u != 0;
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
    this.l.getImageReceiver().a(true, true);
  }

  public boolean z()
  {
    return true;
  }

  private class a extends RecyclerView.a
  {
    private Context b;

    public a(Context arg2)
    {
      Object localObject;
      this.b = localObject;
    }

    public int a()
    {
      return aq.af(aq.this);
    }

    public int a(int paramInt)
    {
      if ((paramInt == aq.ag(aq.this)) || (paramInt == aq.Z(aq.this)) || (paramInt == aq.s(aq.this)));
      do
      {
        return 0;
        if ((paramInt == aq.ah(aq.this)) || (paramInt == aq.ai(aq.this)))
          return 1;
        if ((paramInt == aq.aa(aq.this)) || (paramInt == aq.ab(aq.this)) || (paramInt == aq.x(aq.this)))
          return 2;
        if ((paramInt == aq.z(aq.this)) || (paramInt == aq.m(aq.this)) || (paramInt == aq.p(aq.this)) || (paramInt == aq.q(aq.this)) || (paramInt == aq.r(aq.this)) || (paramInt == aq.o(aq.this)) || (paramInt == aq.A(aq.this)) || (paramInt == aq.C(aq.this)) || (paramInt == aq.B(aq.this)) || (paramInt == aq.D(aq.this)) || (paramInt == aq.v(aq.this)))
          return 3;
        if ((paramInt > aq.s(aq.this)) && (paramInt < aq.t(aq.this)))
          return 4;
        if (paramInt == aq.aj(aq.this))
          return 5;
        if (paramInt == aq.ak(aq.this))
          return 6;
        if (paramInt == aq.M(aq.this))
          return 7;
      }
      while ((paramInt != aq.ae(aq.this)) && (paramInt != aq.O(aq.this)));
      return 8;
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
      case 3:
      case 4:
      case 5:
      case 6:
      case 7:
      case 8:
      }
      while (true)
      {
        paramViewGroup.setLayoutParams(new RecyclerView.i(-1, -2));
        return new a(paramViewGroup);
        paramViewGroup = new org.vidogram.ui.c.r(this.b);
        continue;
        paramViewGroup = new o(this.b);
        paramViewGroup.setPadding(org.vidogram.messenger.a.a(72.0F), 0, 0, 0);
        continue;
        paramViewGroup = new bc(this.b)
        {
          public boolean onTouchEvent(MotionEvent paramMotionEvent)
          {
            if ((Build.VERSION.SDK_INT >= 21) && (getBackground() != null) && ((paramMotionEvent.getAction() == 0) || (paramMotionEvent.getAction() == 2)))
              getBackground().setHotspot(paramMotionEvent.getX(), paramMotionEvent.getY());
            return super.onTouchEvent(paramMotionEvent);
          }
        };
        continue;
        paramViewGroup = new az(this.b)
        {
          public boolean onTouchEvent(MotionEvent paramMotionEvent)
          {
            if ((Build.VERSION.SDK_INT >= 21) && (getBackground() != null) && ((paramMotionEvent.getAction() == 0) || (paramMotionEvent.getAction() == 2)))
              getBackground().setHotspot(paramMotionEvent.getX(), paramMotionEvent.getY());
            return super.onTouchEvent(paramMotionEvent);
          }
        };
        continue;
        paramViewGroup = new bh(this.b, 61, 0, true)
        {
          public boolean onTouchEvent(MotionEvent paramMotionEvent)
          {
            if ((Build.VERSION.SDK_INT >= 21) && (getBackground() != null) && ((paramMotionEvent.getAction() == 0) || (paramMotionEvent.getAction() == 2)))
              getBackground().setHotspot(paramMotionEvent.getX(), paramMotionEvent.getY());
            return super.onTouchEvent(paramMotionEvent);
          }
        };
        continue;
        paramViewGroup = new ap(this.b);
        continue;
        paramViewGroup = new bf(this.b);
        bf localbf = (bf)paramViewGroup;
        localbf.setBackgroundResource(2130837782);
        localbf.setText(org.vidogram.messenger.a.b(org.vidogram.messenger.r.a("ConvertGroupInfo", 2131231084, new Object[] { org.vidogram.messenger.r.b("Members", org.vidogram.messenger.v.a().E) })));
        continue;
        paramViewGroup = new z(this.b);
        continue;
        paramViewGroup = new org.vidogram.ui.c.a(this.b);
        ((org.vidogram.ui.c.a)paramViewGroup).setDelegate(new org.vidogram.ui.c.a.a()
        {
          public void a(String paramString)
          {
            if (paramString.startsWith("@"))
              org.vidogram.messenger.v.a(paramString.substring(1), aq.this, 0);
            Object localObject;
            do
            {
              do
              {
                return;
                if (!paramString.startsWith("#"))
                  continue;
                localObject = new v(null);
                ((v)localObject).a(paramString);
                aq.this.a((org.vidogram.ui.a.g)localObject);
                return;
              }
              while ((!paramString.startsWith("/")) || (aq.W(aq.this).e.size() <= 1));
              localObject = (org.vidogram.ui.a.g)aq.Y(aq.this).e.get(aq.X(aq.this).e.size() - 2);
            }
            while (!(localObject instanceof q));
            aq.this.d();
            ((q)localObject).l.a(null, paramString, false, false);
          }
        });
      }
    }

    public void a(RecyclerView.u paramu, int paramInt)
    {
      int j = 0;
      int i;
      switch (paramu.h())
      {
      case 1:
      case 5:
      case 6:
      case 7:
      default:
        i = 0;
      case 0:
      case 2:
      case 3:
      case 4:
      case 8:
      }
      while (true)
      {
        if (i != 0)
        {
          if (aq.f(aq.this) == 0)
            break label1799;
          if ((paramInt != aq.aa(aq.this)) && (paramInt != aq.p(aq.this)) && (paramInt != aq.o(aq.this)) && (paramInt != aq.q(aq.this)) && (paramInt != aq.m(aq.this)) && (paramInt != aq.r(aq.this)) && (paramInt != aq.ab(aq.this)))
          {
            i = j;
            if (paramInt != aq.ae(aq.this));
          }
          else
          {
            i = 1;
          }
          label165: if (i == 0)
            break label1952;
          if (paramu.a.getBackground() == null)
            paramu.a.setBackgroundResource(2130837946);
        }
        label771: label1473: label1510: 
        do
        {
          return;
          if ((paramInt == aq.Z(aq.this)) || (paramInt == aq.s(aq.this)))
          {
            ((org.vidogram.ui.c.r)paramu.a).setHeight(org.vidogram.messenger.a.a(8.0F));
            i = 1;
            break;
          }
          ((org.vidogram.ui.c.r)paramu.a).setHeight(org.vidogram.messenger.a.a(36.0F));
          i = 1;
          break;
          Object localObject2 = (bc)paramu.a;
          if (paramInt == aq.aa(aq.this))
          {
            localObject1 = org.vidogram.messenger.v.a().a(Integer.valueOf(aq.f(aq.this)));
            if ((((g.vw)localObject1).i != null) && (((g.vw)localObject1).i.length() != 0));
            for (localObject1 = org.vidogram.a.b.a().e("+" + ((g.vw)localObject1).i); ; localObject1 = org.vidogram.messenger.r.a("NumberUnknown", 2131231603))
            {
              ((bc)localObject2).a((String)localObject1, org.vidogram.messenger.r.a("PhoneMobile", 2131231666), 2130838031);
              i = 1;
              break;
            }
          }
          if (paramInt == aq.ab(aq.this))
          {
            localObject1 = org.vidogram.messenger.v.a().a(Integer.valueOf(aq.f(aq.this)));
            if ((localObject1 != null) && (((g.vw)localObject1).g != null) && (((g.vw)localObject1).g.length() != 0));
            for (localObject1 = "@" + ((g.vw)localObject1).g; ; localObject1 = "-")
            {
              ((bc)localObject2).a((String)localObject1, org.vidogram.messenger.r.a("Username", 2131231925));
              i = 1;
              break;
            }
          }
          if (paramInt != aq.x(aq.this))
            break label1971;
          if ((aq.y(aq.this) != null) && (aq.y(aq.this).v != null) && (aq.y(aq.this).v.length() != 0));
          for (Object localObject1 = "@" + aq.y(aq.this).v; ; localObject1 = "-")
          {
            ((bc)localObject2).a((String)localObject1, "telegram.me/" + aq.y(aq.this).v);
            i = 1;
            break;
          }
          localObject2 = (az)paramu.a;
          ((az)localObject2).setTextColor(-14606047);
          if (paramInt == aq.m(aq.this))
          {
            if (aq.ac(aq.this) == -1)
            {
              localObject1 = org.vidogram.messenger.r.a("Loading", 2131231394);
              if ((aq.f(aq.this) == 0) || (ad.c() != aq.f(aq.this)))
                break label771;
              ((az)localObject2).a(org.vidogram.messenger.r.a("SharedMedia", 2131231845), (String)localObject1, 2130838101);
            }
            while (true)
            {
              i = 1;
              break;
              int k = aq.ac(aq.this);
              if (aq.ad(aq.this) != -1);
              for (i = aq.ad(aq.this); ; i = 0)
              {
                localObject1 = String.format("%d", new Object[] { Integer.valueOf(i + k) });
                break;
              }
              ((az)localObject2).a(org.vidogram.messenger.r.a("SharedMedia", 2131231845), (String)localObject1);
            }
          }
          if (paramInt == aq.p(aq.this))
          {
            localObject1 = org.vidogram.messenger.v.a().c(Integer.valueOf((int)(aq.n(aq.this) >> 32)));
            if (((g.t)localObject1).n == 0);
            for (localObject1 = org.vidogram.messenger.r.a("ShortMessageLifetimeForever", 2131231849); ; localObject1 = org.vidogram.messenger.a.d(((g.t)localObject1).n))
            {
              ((az)localObject2).a(org.vidogram.messenger.r.a("MessageLifetime", 2131231432), (String)localObject1);
              i = 1;
              break;
            }
          }
          if (paramInt == aq.q(aq.this))
          {
            ((az)localObject2).a(org.vidogram.messenger.r.a("NotificationsAndSounds", 2131231591), 2130838101);
            i = 1;
            break;
          }
          if (paramInt == aq.r(aq.this))
          {
            ((az)localObject2).setText(org.vidogram.messenger.r.a("StartEncryptedChat", 2131231867));
            ((az)localObject2).setTextColor(-13129447);
            i = 1;
            break;
          }
          if (paramInt == aq.o(aq.this))
          {
            localObject1 = new org.vidogram.ui.Components.u();
            ((org.vidogram.ui.Components.u)localObject1).a(org.vidogram.messenger.v.a().c(Integer.valueOf((int)(aq.n(aq.this) >> 32))));
            ((az)localObject2).a(org.vidogram.messenger.r.a("EncryptionKey", 2131231173), (Drawable)localObject1);
            i = 1;
            break;
          }
          if (paramInt == aq.z(aq.this))
          {
            ((az)localObject2).setTextColor(-1229511);
            ((az)localObject2).setText(org.vidogram.messenger.r.a("LeaveChannel", 2131231375));
            i = 1;
            break;
          }
          if (paramInt == aq.D(aq.this))
          {
            ((az)localObject2).setText(org.vidogram.messenger.r.a("UpgradeGroup", 2131231921));
            ((az)localObject2).setTextColor(-13129447);
            i = 1;
            break;
          }
          if (paramInt == aq.A(aq.this))
          {
            if (aq.i(aq.this) != null)
            {
              ((az)localObject2).a(org.vidogram.messenger.r.a("ChannelMembers", 2131230993), String.format("%d", new Object[] { Integer.valueOf(aq.i(aq.this).g) }));
              i = 1;
              break;
            }
            ((az)localObject2).setText(org.vidogram.messenger.r.a("ChannelMembers", 2131230993));
            i = 1;
            break;
          }
          if (paramInt == aq.C(aq.this))
          {
            if (aq.i(aq.this) != null)
            {
              ((az)localObject2).a(org.vidogram.messenger.r.a("ChannelAdministrators", 2131230966), String.format("%d", new Object[] { Integer.valueOf(aq.i(aq.this).h) }));
              i = 1;
              break;
            }
            ((az)localObject2).setText(org.vidogram.messenger.r.a("ChannelAdministrators", 2131230966));
            i = 1;
            break;
          }
          if (paramInt == aq.B(aq.this))
          {
            if (aq.i(aq.this) != null)
            {
              ((az)localObject2).a(org.vidogram.messenger.r.a("ChannelBlockedUsers", 2131230971), String.format("%d", new Object[] { Integer.valueOf(aq.i(aq.this).i) }));
              i = 1;
              break;
            }
            ((az)localObject2).setText(org.vidogram.messenger.r.a("ChannelBlockedUsers", 2131230971));
            i = 1;
            break;
          }
          if (paramInt != aq.v(aq.this))
            break label1971;
          if (aq.e(aq.this) > 0)
          {
            ((az)localObject2).setText(org.vidogram.messenger.r.a("AddMember", 2131230819));
            i = 1;
            break;
          }
          ((az)localObject2).setText(org.vidogram.messenger.r.a("AddRecipient", 2131230821));
          i = 1;
          break;
          localObject2 = (bh)paramu.a;
          g.f localf;
          if (!aq.u(aq.this).isEmpty())
          {
            localObject1 = (g.k)aq.i(aq.this).t.e.get(((Integer)aq.u(aq.this).get(paramInt - aq.s(aq.this) - 1)).intValue());
            if (localObject1 == null)
              break label1971;
            if (!(localObject1 instanceof g.fe))
              break label1627;
            localf = ((g.fe)localObject1).f;
            if (!(localf instanceof g.dr))
              break label1593;
            ((bh)localObject2).setIsAdmin(1);
            localObject1 = org.vidogram.messenger.v.a().a(Integer.valueOf(((g.k)localObject1).b));
            if (paramInt != aq.s(aq.this) + 1)
              break label1683;
          }
          for (i = 2130837972; ; i = 0)
          {
            ((bh)localObject2).a((org.vidogram.tgnet.f)localObject1, null, null, i);
            i = 1;
            break;
            localObject1 = (g.k)aq.i(aq.this).t.e.get(paramInt - aq.s(aq.this) - 1);
            break label1473;
            if (((localf instanceof g.ds)) || ((localf instanceof g.du)))
            {
              ((bh)localObject2).setIsAdmin(2);
              break label1510;
            }
            ((bh)localObject2).setIsAdmin(0);
            break label1510;
            if ((localObject1 instanceof g.fn))
            {
              ((bh)localObject2).setIsAdmin(1);
              break label1510;
            }
            if ((aq.y(aq.this).e) && ((localObject1 instanceof g.fm)))
            {
              ((bh)localObject2).setIsAdmin(2);
              break label1510;
            }
            ((bh)localObject2).setIsAdmin(0);
            break label1510;
          }
          localObject2 = (org.vidogram.ui.c.a)paramu.a;
          if (paramInt == aq.ae(aq.this))
          {
            ((org.vidogram.ui.c.a)localObject2).a(org.vidogram.messenger.v.a().f(aq.f(aq.this)), 2130837650);
            i = 1;
            break;
          }
          if (paramInt != aq.O(aq.this))
            break label1971;
          for (localObject1 = aq.i(aq.this).f; ((String)localObject1).contains("\n\n\n"); localObject1 = ((String)localObject1).replace("\n\n\n", "\n\n"));
          ((org.vidogram.ui.c.a)localObject2).a((String)localObject1, 2130837650);
          i = 1;
          break;
          i = j;
          if (aq.e(aq.this) == 0)
            break label165;
          if ((paramInt != aq.D(aq.this)) && (paramInt != aq.q(aq.this)) && (paramInt != aq.m(aq.this)) && ((paramInt <= aq.s(aq.this)) || (paramInt >= aq.t(aq.this))) && (paramInt != aq.v(aq.this)) && (paramInt != aq.x(aq.this)) && (paramInt != aq.z(aq.this)) && (paramInt != aq.A(aq.this)) && (paramInt != aq.C(aq.this)) && (paramInt != aq.B(aq.this)))
          {
            i = j;
            if (paramInt != aq.O(aq.this))
              break label165;
          }
          i = 1;
          break label165;
        }
        while (paramu.a.getBackground() == null);
        label1593: label1627: paramu.a.setBackgroundDrawable(null);
        label1683: label1952: return;
        label1799: label1971: i = 1;
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

  private class b extends View
  {
    private int b;
    private Paint c = new Paint();

    public b(Context arg2)
    {
      super();
    }

    protected void onDraw(Canvas paramCanvas)
    {
      int i = getMeasuredHeight() - org.vidogram.messenger.a.a(91.0F);
      paramCanvas.drawRect(0.0F, 0.0F, getMeasuredWidth(), aq.b(aq.this) + i, this.c);
      if (aq.c(aq.this) != null)
        aq.d(aq.this).a(paramCanvas, aq.b(aq.this) + i);
    }

    protected void onMeasure(int paramInt1, int paramInt2)
    {
      paramInt2 = View.MeasureSpec.getSize(paramInt1);
      int i = org.vidogram.ui.a.a.getCurrentActionBarHeight();
      if (aq.a(aq.this).getOccupyStatusBar());
      for (paramInt1 = org.vidogram.messenger.a.a; ; paramInt1 = 0)
      {
        setMeasuredDimension(paramInt2, paramInt1 + i + org.vidogram.messenger.a.a(91.0F));
        return;
      }
    }

    public void setBackgroundColor(int paramInt)
    {
      if (paramInt != this.b)
      {
        this.c.setColor(paramInt);
        invalidate();
      }
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.aq
 * JD-Core Version:    0.6.0
 */