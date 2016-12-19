package org.vidogram.messenger;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.util.Base64;
import android.util.SparseArray;
import android.util.SparseIntArray;
import java.security.SecureRandom;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Semaphore;
import org.vidogram.messenger.d.b;
import org.vidogram.tgnet.ConnectionsManager;
import org.vidogram.tgnet.g.ad;
import org.vidogram.tgnet.g.aj;
import org.vidogram.tgnet.g.ak;
import org.vidogram.tgnet.g.ap;
import org.vidogram.tgnet.g.ar;
import org.vidogram.tgnet.g.as;
import org.vidogram.tgnet.g.au;
import org.vidogram.tgnet.g.aw;
import org.vidogram.tgnet.g.ax;
import org.vidogram.tgnet.g.bu;
import org.vidogram.tgnet.g.cc;
import org.vidogram.tgnet.g.cg;
import org.vidogram.tgnet.g.cp;
import org.vidogram.tgnet.g.di;
import org.vidogram.tgnet.g.dj;
import org.vidogram.tgnet.g.dy;
import org.vidogram.tgnet.g.dz;
import org.vidogram.tgnet.g.ee;
import org.vidogram.tgnet.g.ef;
import org.vidogram.tgnet.g.eg;
import org.vidogram.tgnet.g.eh;
import org.vidogram.tgnet.g.ei;
import org.vidogram.tgnet.g.ej;
import org.vidogram.tgnet.g.ek;
import org.vidogram.tgnet.g.el;
import org.vidogram.tgnet.g.ep;
import org.vidogram.tgnet.g.eq;
import org.vidogram.tgnet.g.er;
import org.vidogram.tgnet.g.es;
import org.vidogram.tgnet.g.et;
import org.vidogram.tgnet.g.eu;
import org.vidogram.tgnet.g.ev;
import org.vidogram.tgnet.g.ew;
import org.vidogram.tgnet.g.ex;
import org.vidogram.tgnet.g.ez;
import org.vidogram.tgnet.g.fa;
import org.vidogram.tgnet.g.fb;
import org.vidogram.tgnet.g.fc;
import org.vidogram.tgnet.g.fd;
import org.vidogram.tgnet.g.fi;
import org.vidogram.tgnet.g.fj;
import org.vidogram.tgnet.g.fl;
import org.vidogram.tgnet.g.fo;
import org.vidogram.tgnet.g.ft;
import org.vidogram.tgnet.g.fx;
import org.vidogram.tgnet.g.fz;
import org.vidogram.tgnet.g.gf;
import org.vidogram.tgnet.g.gh;
import org.vidogram.tgnet.g.hq;
import org.vidogram.tgnet.g.hr;
import org.vidogram.tgnet.g.i;
import org.vidogram.tgnet.g.ik;
import org.vidogram.tgnet.g.im;
import org.vidogram.tgnet.g.j;
import org.vidogram.tgnet.g.jf;
import org.vidogram.tgnet.g.jj;
import org.vidogram.tgnet.g.jk;
import org.vidogram.tgnet.g.jl;
import org.vidogram.tgnet.g.jm;
import org.vidogram.tgnet.g.jn;
import org.vidogram.tgnet.g.jq;
import org.vidogram.tgnet.g.k;
import org.vidogram.tgnet.g.ko;
import org.vidogram.tgnet.g.kw;
import org.vidogram.tgnet.g.kx;
import org.vidogram.tgnet.g.ky;
import org.vidogram.tgnet.g.l;
import org.vidogram.tgnet.g.lb;
import org.vidogram.tgnet.g.le;
import org.vidogram.tgnet.g.lu;
import org.vidogram.tgnet.g.lv;
import org.vidogram.tgnet.g.lw;
import org.vidogram.tgnet.g.mh;
import org.vidogram.tgnet.g.mn;
import org.vidogram.tgnet.g.mr;
import org.vidogram.tgnet.g.ms;
import org.vidogram.tgnet.g.mx;
import org.vidogram.tgnet.g.od;
import org.vidogram.tgnet.g.oi;
import org.vidogram.tgnet.g.oj;
import org.vidogram.tgnet.g.ox;
import org.vidogram.tgnet.g.oy;
import org.vidogram.tgnet.g.pa;
import org.vidogram.tgnet.g.pb;
import org.vidogram.tgnet.g.pc;
import org.vidogram.tgnet.g.pd;
import org.vidogram.tgnet.g.pf;
import org.vidogram.tgnet.g.pg;
import org.vidogram.tgnet.g.ph;
import org.vidogram.tgnet.g.pr;
import org.vidogram.tgnet.g.pt;
import org.vidogram.tgnet.g.pu;
import org.vidogram.tgnet.g.py;
import org.vidogram.tgnet.g.pz;
import org.vidogram.tgnet.g.q;
import org.vidogram.tgnet.g.qa;
import org.vidogram.tgnet.g.qe;
import org.vidogram.tgnet.g.qf;
import org.vidogram.tgnet.g.qj;
import org.vidogram.tgnet.g.qk;
import org.vidogram.tgnet.g.qm;
import org.vidogram.tgnet.g.qn;
import org.vidogram.tgnet.g.qp;
import org.vidogram.tgnet.g.qr;
import org.vidogram.tgnet.g.qs;
import org.vidogram.tgnet.g.qt;
import org.vidogram.tgnet.g.rd;
import org.vidogram.tgnet.g.re;
import org.vidogram.tgnet.g.rf;
import org.vidogram.tgnet.g.rh;
import org.vidogram.tgnet.g.rj;
import org.vidogram.tgnet.g.rk;
import org.vidogram.tgnet.g.rl;
import org.vidogram.tgnet.g.rm;
import org.vidogram.tgnet.g.ro;
import org.vidogram.tgnet.g.rr;
import org.vidogram.tgnet.g.rx;
import org.vidogram.tgnet.g.ry;
import org.vidogram.tgnet.g.rz;
import org.vidogram.tgnet.g.s;
import org.vidogram.tgnet.g.sa;
import org.vidogram.tgnet.g.sh;
import org.vidogram.tgnet.g.sj;
import org.vidogram.tgnet.g.so;
import org.vidogram.tgnet.g.sq;
import org.vidogram.tgnet.g.st;
import org.vidogram.tgnet.g.sv;
import org.vidogram.tgnet.g.sx;
import org.vidogram.tgnet.g.t;
import org.vidogram.tgnet.g.tr;
import org.vidogram.tgnet.g.ts;
import org.vidogram.tgnet.g.tt;
import org.vidogram.tgnet.g.tu;
import org.vidogram.tgnet.g.tv;
import org.vidogram.tgnet.g.tw;
import org.vidogram.tgnet.g.tx;
import org.vidogram.tgnet.g.ty;
import org.vidogram.tgnet.g.tz;
import org.vidogram.tgnet.g.ua;
import org.vidogram.tgnet.g.ub;
import org.vidogram.tgnet.g.ud;
import org.vidogram.tgnet.g.ue;
import org.vidogram.tgnet.g.uq;
import org.vidogram.tgnet.g.us;
import org.vidogram.tgnet.g.vg;
import org.vidogram.tgnet.g.vr;
import org.vidogram.tgnet.g.vs;
import org.vidogram.tgnet.g.vv;
import org.vidogram.tgnet.g.vw;
import org.vidogram.tgnet.g.vy;
import org.vidogram.tgnet.g.w;
import org.vidogram.tgnet.g.wb;
import org.vidogram.tgnet.g.wd;
import org.vidogram.tgnet.g.we;
import org.vidogram.tgnet.g.wf;
import org.vidogram.tgnet.g.z;
import org.vidogram.ui.aq;
import org.vidogram.ui.q;

public class v
  implements y.b
{
  public static org.vidogram.tgnet.f W;
  private static volatile v aW = null;
  public boolean A = false;
  public int B = a.a(16.0F);
  public int C = 200;
  public int D = 100;
  public int E = 5000;
  public int F = 200;
  public int G = 172800;
  public int H;
  public int I;
  public int J = 30;
  public int K = 200;
  public ConcurrentHashMap<String, String> L = new ConcurrentHashMap();
  public ArrayList<g.hq> M = new ArrayList();
  public ArrayList<g.hq> N = new ArrayList();
  public ArrayList<g.hq> O = new ArrayList();
  public ArrayList<g.hq> P = new ArrayList();
  public ArrayList<g.hq> Q = new ArrayList();
  public int R = 0;
  public int S = 0;
  public int T = 0;
  public int U = 0;
  public int V = 0;
  public boolean X;
  public boolean Y;
  public boolean Z;
  public ArrayList<g.hq> a = new ArrayList();
  private long aA = 0L;
  private HashMap<Integer, String> aB = new HashMap();
  private ArrayList<Integer> aC = new ArrayList();
  private ArrayList<Integer> aD = new ArrayList();
  private ArrayList<Integer> aE = new ArrayList();
  private ArrayList<Integer> aF = new ArrayList();
  private ArrayList<Integer> aG = new ArrayList();
  private ArrayList<Integer> aH = new ArrayList();
  private HashMap<String, ArrayList<u>> aI = new HashMap();
  private HashMap<Long, ArrayList<u>> aJ = new HashMap();
  private HashMap<Long, ArrayList<Integer>> aK = new HashMap();
  private boolean aL = false;
  private int aM = 0;
  private ArrayList<Integer> aN = null;
  private Runnable aO = null;
  private boolean aP = false;
  private long aQ = 0L;
  private int aR = 0;
  private int aS = 0;
  private boolean aT = false;
  private String aU = null;
  private ArrayList<g.hr> aV = new ArrayList();
  private final Comparator<g.hq> aX = new Comparator()
  {
    public int a(g.hq paramhq1, g.hq paramhq2)
    {
      g.s locals = b.a(paramhq1.m);
      int i;
      if ((locals != null) && (locals.g >= paramhq1.l))
      {
        i = locals.g;
        paramhq1 = b.a(paramhq2.m);
        if ((paramhq1 == null) || (paramhq1.g < paramhq2.l))
          break label77;
      }
      label77: for (int j = paramhq1.g; ; j = paramhq2.l)
      {
        if (i >= j)
          break label86;
        return 1;
        i = paramhq1.l;
        break;
      }
      label86: if (i > j)
        return -1;
      return 0;
    }
  };
  private final Comparator<g.vv> aY = new Comparator()
  {
    public int a(g.vv paramvv1, g.vv paramvv2)
    {
      int i = v.a(v.this, paramvv1);
      int j = v.a(v.this, paramvv2);
      if (i != j)
        return a.a(i, j);
      if (i == 0)
        return a.a(paramvv1.d, paramvv2.d);
      if (i == 1)
        return a.a(paramvv1.h, paramvv2.h);
      if (i == 2)
      {
        i = v.b(v.this, paramvv1);
        j = v.b(v.this, paramvv2);
        if (i == j)
          return a.a(paramvv1.d, paramvv2.d);
        return a.a(i, j);
      }
      return 0;
    }
  };
  public boolean aa;
  public boolean ab;
  private ConcurrentHashMap<Integer, g.i> ac = new ConcurrentHashMap(100, 1.0F, 2);
  private ConcurrentHashMap<Integer, g.t> ad = new ConcurrentHashMap(10, 1.0F, 2);
  private ConcurrentHashMap<Integer, g.vw> ae = new ConcurrentHashMap(100, 1.0F, 2);
  private ConcurrentHashMap<String, g.vw> af = new ConcurrentHashMap(100, 1.0F, 2);
  private ArrayList<Integer> ag = new ArrayList();
  private HashMap<Integer, g.w> ah = new HashMap();
  private int ai = 0;
  private HashMap<Long, Boolean> aj = new HashMap();
  private ArrayList<Long> ak = new ArrayList();
  private SparseIntArray al = new SparseIntArray();
  private SparseIntArray am = new SparseIntArray();
  private SparseArray<ArrayList<Integer>> an = new SparseArray();
  private SparseArray<ArrayList<Integer>> ao = new SparseArray();
  private HashMap<Integer, ArrayList<Object>> ap = new HashMap();
  private HashMap<Integer, Long> aq = new HashMap();
  private HashMap<Integer, Integer> ar = new HashMap();
  private HashMap<Integer, Boolean> as = new HashMap();
  private HashMap<Integer, Boolean> at = new HashMap();
  private HashMap<Integer, Boolean> au = new HashMap();
  private ArrayList<Object> av = new ArrayList();
  private ArrayList<Object> aw = new ArrayList();
  private ArrayList<Object> ax = new ArrayList();
  private long ay = 0L;
  private long az = 0L;
  public ArrayList<g.hq> b = new ArrayList();
  public ArrayList<g.hq> c = new ArrayList();
  public int d;
  public ConcurrentHashMap<Long, Integer> e = new ConcurrentHashMap(100, 1.0F, 2);
  public ConcurrentHashMap<Long, Integer> f = new ConcurrentHashMap(100, 1.0F, 2);
  public ConcurrentHashMap<Long, g.hq> g = new ConcurrentHashMap(100, 1.0F, 2);
  public HashMap<Long, u> h = new HashMap();
  public HashMap<Long, u> i = new HashMap();
  public HashMap<Integer, u> j = new HashMap();
  public ConcurrentHashMap<Long, ArrayList<Object>> k = new ConcurrentHashMap(20, 1.0F, 2);
  public HashMap<Long, CharSequence> l = new HashMap();
  public HashMap<Long, Integer> m = new HashMap();
  public HashMap<Integer, HashMap<Long, Boolean>> n = new HashMap();
  public ConcurrentHashMap<Integer, Integer> o = new ConcurrentHashMap(20, 1.0F, 2);
  public boolean p = false;
  public ArrayList<Integer> q = new ArrayList();
  public boolean r = false;
  public boolean s = false;
  public boolean t = false;
  public boolean u = false;
  public boolean v = false;
  public boolean w = false;
  public int x = 2;
  public boolean y = true;
  public boolean z = false;

  public v()
  {
    p.a();
    w.a();
    y.a().a(this, y.av);
    y.a().a(this, y.aw);
    y.a().a(this, y.az);
    y.a().a(this, y.aA);
    y.a().a(this, y.i);
    b();
    this.y = ApplicationLoader.a.getSharedPreferences("Notifications", 0).getBoolean("EnableContactJoined", true);
    Object localObject = ApplicationLoader.a.getSharedPreferences("mainconfig", 0);
    this.x = ((SharedPreferences)localObject).getInt("secretWebpage2", 2);
    this.C = ((SharedPreferences)localObject).getInt("maxGroupCount", 200);
    this.E = ((SharedPreferences)localObject).getInt("maxMegagroupCount", 1000);
    this.K = ((SharedPreferences)localObject).getInt("maxRecentGifsCount", 200);
    this.J = ((SharedPreferences)localObject).getInt("maxRecentStickersCount", 30);
    this.G = ((SharedPreferences)localObject).getInt("maxEditTime", 3600);
    this.H = ((SharedPreferences)localObject).getInt("groupBigSize", 10);
    this.I = ((SharedPreferences)localObject).getInt("ratingDecay", 2419200);
    int i1;
    if (a.c())
      i1 = 18;
    while (true)
    {
      this.B = ((SharedPreferences)localObject).getInt("fons_size", i1);
      this.z = ((SharedPreferences)localObject).getBoolean("allowBigEmoji", false);
      this.A = ((SharedPreferences)localObject).getBoolean("useSystemEmoji", false);
      localObject = ((SharedPreferences)localObject).getString("disabledFeatures", null);
      if ((localObject != null) && (((String)localObject).length() != 0))
        try
        {
          localObject = Base64.decode((String)localObject, 0);
          if (localObject != null)
          {
            localObject = new org.vidogram.tgnet.e(localObject);
            int i2 = ((org.vidogram.tgnet.e)localObject).b(false);
            i1 = 0;
            while (i1 < i2)
            {
              g.hr localhr = g.hr.a((org.vidogram.tgnet.a)localObject, ((org.vidogram.tgnet.e)localObject).b(false), false);
              if ((localhr != null) && (localhr.c != null) && (localhr.d != null))
                this.aV.add(localhr);
              i1 += 1;
              continue;
              i1 = 16;
            }
          }
        }
        catch (Exception localException)
        {
          n.a("tmessages", localException);
        }
    }
  }

  private int a(g.vv paramvv)
  {
    if (((paramvv instanceof g.tx)) || ((paramvv instanceof g.ua)) || ((paramvv instanceof g.ty)) || ((paramvv instanceof g.tz)) || ((paramvv instanceof g.ts)) || ((paramvv instanceof g.ub)) || ((paramvv instanceof g.tu)))
      return 0;
    if ((paramvv instanceof g.tw))
      return 1;
    if (((paramvv instanceof g.tv)) || ((paramvv instanceof g.tr)) || ((paramvv instanceof g.tt)))
      return 2;
    return 3;
  }

  public static v a()
  {
    Object localObject1 = aW;
    if (localObject1 == null)
    {
      monitorenter;
      try
      {
        v localv = aW;
        localObject1 = localv;
        if (localv == null)
        {
          localObject1 = new v();
          aW = (v)localObject1;
        }
        return localObject1;
      }
      finally
      {
        monitorexit;
      }
    }
    return (v)localObject2;
  }

  public static g.ap a(int paramInt)
  {
    return a(a().a(Integer.valueOf(paramInt)));
  }

  public static g.ap a(g.vw paramvw)
  {
    if (paramvw == null)
      return new g.lv();
    if (paramvw.d == ad.c())
      return new g.lw();
    g.lu locallu = new g.lu();
    locallu.b = paramvw.d;
    locallu.c = paramvw.h;
    return locallu;
  }

  public static g.z a(g.i parami)
  {
    if (((parami instanceof g.di)) || ((parami instanceof g.dj)))
    {
      g.jj localjj = new g.jj();
      localjj.b = parami.h;
      localjj.c = parami.u;
      return localjj;
    }
    return new g.jk();
  }

  private void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong)
  {
    if ((this.aP) || (paramInt1 == -1))
      return;
    this.aP = true;
    g.pr localpr = new g.pr();
    localpr.f = 100;
    localpr.d = paramInt1;
    localpr.c = paramInt2;
    if (paramInt1 == 0)
    {
      localpr.e = new g.ky();
      ConnectionsManager.a().a(localpr, new org.vidogram.tgnet.c()
      {
      });
      return;
    }
    if (paramInt5 != 0)
    {
      localpr.e = new g.kw();
      localpr.e.e = paramInt5;
    }
    while (true)
    {
      localpr.e.c = paramLong;
      break;
      if (paramInt3 != 0)
      {
        localpr.e = new g.lb();
        localpr.e.b = paramInt3;
        continue;
      }
      localpr.e = new g.kx();
      localpr.e.d = paramInt4;
    }
  }

  private void a(long paramLong, boolean paramBoolean, int paramInt1, int paramInt2)
  {
    int i2 = (int)paramLong;
    int i3 = (int)(paramLong >> 32);
    if (paramInt1 == 2)
      w.a().a(paramLong, paramInt1);
    int i1;
    Object localObject2;
    Object localObject1;
    while (true)
    {
      return;
      if ((paramInt1 == 0) || (paramInt1 == 3))
        a.b(paramLong);
      i1 = paramInt2;
      if (paramBoolean)
      {
        w.a().a(paramLong, paramInt1);
        localObject2 = (g.hq)this.g.get(Long.valueOf(paramLong));
        i1 = paramInt2;
        if (localObject2 != null)
        {
          i1 = paramInt2;
          if (paramInt2 == 0)
            i1 = Math.max(0, ((g.hq)localObject2).e);
          if ((paramInt1 != 0) && (paramInt1 != 3))
            break;
          this.a.remove(localObject2);
          if ((this.b.remove(localObject2)) && (g.a((g.hq)localObject2)))
            Utilities.c.b(new Runnable(paramLong)
            {
              public void run()
              {
                v.i(v.this).remove(Integer.valueOf(-(int)this.a));
                v.j(v.this).delete(-(int)this.a);
                v.k(v.this).delete(-(int)this.a);
              }
            });
          this.c.remove(localObject2);
          this.O.remove(localObject2);
          this.P.remove(localObject2);
          this.N.remove(localObject2);
          this.M.remove(localObject2);
          this.g.remove(Long.valueOf(paramLong));
          this.e.remove(Long.valueOf(paramLong));
          this.f.remove(Long.valueOf(paramLong));
          this.d -= 1;
          localObject1 = (u)this.h.remove(Long.valueOf(((g.hq)localObject2).m));
          if (localObject1 == null)
            break label708;
          paramInt2 = ((u)localObject1).q();
          this.j.remove(Integer.valueOf(((u)localObject1).q()));
          label304: if ((localObject1 != null) && (((u)localObject1).a.C != 0L))
            this.i.remove(Long.valueOf(((u)localObject1).a.C));
          if ((paramInt1 != 1) || (i2 == 0) || (paramInt2 <= 0))
            break label806;
          localObject1 = new g.oj();
          ((g.oj)localObject1).b = ((g.hq)localObject2).e;
          ((g.oj)localObject1).n = false;
          ((g.oj)localObject1).c = ad.c();
          ((g.oj)localObject1).k |= 256;
          ((g.oj)localObject1).f = new g.mx();
          ((g.oj)localObject1).e = ((g.hq)localObject2).l;
          if (i2 <= 0)
            break label738;
          ((g.oj)localObject1).d = new g.ro();
          ((g.oj)localObject1).d.c = i2;
          label453: Object localObject3 = new u((g.ar)localObject1, null, this.ak.contains(Long.valueOf(((g.oj)localObject1).E)));
          localObject2 = new ArrayList();
          ((ArrayList)localObject2).add(localObject3);
          localObject3 = new ArrayList();
          ((ArrayList)localObject3).add(localObject1);
          a(paramLong, (ArrayList)localObject2);
          w.a().a((ArrayList)localObject3, false, true, false, 0);
        }
        else
        {
          label533: y.a().a(y.c, new Object[0]);
          y.a().a(y.v, new Object[] { Long.valueOf(paramLong), Boolean.valueOf(false) });
          w.a().c().b(new Runnable(paramLong)
          {
            public void run()
            {
              a.a(new Runnable()
              {
                public void run()
                {
                  z.a().b(v.33.this.a);
                }
              });
            }
          });
        }
      }
      else
      {
        if ((i3 == 1) || (paramInt1 == 3))
          continue;
        if (i2 == 0)
          break label827;
        localObject1 = c(i2);
        if ((localObject1 == null) || ((localObject1 instanceof g.kw)))
          continue;
        localObject2 = new g.pc();
        ((g.pc)localObject2).e = ((g.aj)localObject1);
        if (paramInt1 != 0)
          break label815;
        paramInt2 = 2147483647;
        label654: ((g.pc)localObject2).f = paramInt2;
        if (paramInt1 == 0)
          break label822;
      }
    }
    label806: label815: label822: for (paramBoolean = true; ; paramBoolean = false)
    {
      ((g.pc)localObject2).d = paramBoolean;
      ConnectionsManager.a().a((org.vidogram.tgnet.f)localObject2, new org.vidogram.tgnet.c(paramLong, paramInt1, i1)
      {
      }
      , 64);
      return;
      ((g.hq)localObject2).h = 0;
      break;
      label708: paramInt2 = ((g.hq)localObject2).e;
      localObject1 = (u)this.j.remove(Integer.valueOf(((g.hq)localObject2).e));
      break label304;
      label738: if (e.d(b(Integer.valueOf(-i2))))
      {
        ((g.oj)localObject1).d = new g.rj();
        ((g.oj)localObject1).d.b = (-i2);
        break label453;
      }
      ((g.oj)localObject1).d = new g.rk();
      ((g.oj)localObject1).d.d = (-i2);
      break label453;
      ((g.hq)localObject2).e = 0;
      break label533;
      paramInt2 = i1;
      break label654;
    }
    label827: if (paramInt1 == 1)
    {
      ab.a().a(c(Integer.valueOf(i3)), null);
      return;
    }
    ab.a().a(i3);
  }

  public static void a(String paramString, org.vidogram.ui.a.g paramg, int paramInt)
  {
    if ((paramString == null) || (paramg == null));
    do
    {
      return;
      localObject = a().a(paramString);
      if (localObject == null)
        continue;
      a((g.vw)localObject, null, paramg, paramInt, false);
      return;
    }
    while (paramg.l() == null);
    Object localObject = new ProgressDialog(paramg.l());
    ((ProgressDialog)localObject).setMessage(r.a("Loading", 2131231394));
    ((ProgressDialog)localObject).setCanceledOnTouchOutside(false);
    ((ProgressDialog)localObject).setCancelable(false);
    g.gf localgf = new g.gf();
    localgf.c = paramString;
    paramInt = ConnectionsManager.a().a(localgf, new org.vidogram.tgnet.c((ProgressDialog)localObject, paramg, paramInt)
    {
    });
    ((ProgressDialog)localObject).setButton(-2, r.a("Cancel", 2131230943), new DialogInterface.OnClickListener(paramInt, paramg)
    {
      public void onClick(DialogInterface paramDialogInterface, int paramInt)
      {
        ConnectionsManager.a().a(this.a, true);
        try
        {
          paramDialogInterface.dismiss();
          if (this.b != null)
            this.b.d(null);
          return;
        }
        catch (Exception paramDialogInterface)
        {
          while (true)
            n.a("tmessages", paramDialogInterface);
        }
      }
    });
    paramg.d((Dialog)localObject);
    ((ProgressDialog)localObject).show();
  }

  private void a(ArrayList<g.hq> paramArrayList, long paramLong)
  {
    if (paramArrayList.isEmpty())
      return;
    g.pz localpz = new g.pz();
    if (paramArrayList != null)
    {
      int i1 = 0;
      while (i1 < paramArrayList.size())
      {
        localpz.c.add(c((int)((g.hq)paramArrayList.get(i1)).m));
        i1 += 1;
      }
    }
    localpz.c.add(c((int)paramLong));
    ConnectionsManager.a().a(localpz, new org.vidogram.tgnet.c()
    {
    });
  }

  public static void a(g.vw paramvw, g.i parami, org.vidogram.ui.a.g paramg, int paramInt, boolean paramBoolean)
  {
    if (((paramvw == null) && (parami == null)) || (paramg == null))
      return;
    Object localObject = null;
    boolean bool;
    int i1;
    if (parami != null)
    {
      localObject = c(parami.z);
      bool = paramBoolean;
      i1 = paramInt;
    }
    while (localObject != null)
    {
      a(paramg, (String)localObject);
      return;
      i1 = paramInt;
      bool = paramBoolean;
      if (paramvw == null)
        continue;
      String str = c(paramvw.A);
      localObject = str;
      i1 = paramInt;
      bool = paramBoolean;
      if (!paramvw.r)
        continue;
      bool = true;
      i1 = 1;
      localObject = str;
    }
    localObject = new Bundle();
    if (parami != null)
      ((Bundle)localObject).putInt("chat_id", parami.h);
    while (i1 == 0)
    {
      paramg.a(new aq((Bundle)localObject));
      return;
      ((Bundle)localObject).putInt("user_id", paramvw.d);
    }
    paramg.a(new q((Bundle)localObject), bool);
  }

  private static void a(org.vidogram.ui.a.g paramg, String paramString)
  {
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(paramg.l());
    localBuilder.setTitle(r.a("AppName", 2131230856));
    localBuilder.setPositiveButton(r.a("OK", 2131231604), null);
    localBuilder.setMessage(paramString);
    paramg.b(localBuilder.create());
  }

  public static boolean a(Bundle paramBundle, org.vidogram.ui.a.g paramg)
  {
    Object localObject = null;
    if ((paramBundle == null) || (paramg == null));
    label128: 
    while (true)
    {
      return true;
      int i1 = paramBundle.getInt("user_id", 0);
      int i2 = paramBundle.getInt("chat_id", 0);
      g.vw localvw;
      if (i1 != 0)
      {
        localvw = a().a(Integer.valueOf(i1));
        paramBundle = null;
      }
      while (true)
      {
        if ((localvw == null) && (paramBundle == null))
          break label128;
        if (paramBundle != null)
          paramBundle = c(paramBundle.z);
        while (true)
        {
          if (paramBundle == null)
            break label120;
          a(paramg, paramBundle);
          return false;
          if (i2 == 0)
            break label122;
          paramBundle = a().b(Integer.valueOf(i2));
          localvw = null;
          break;
          paramBundle = localObject;
          if (localvw == null)
            continue;
          paramBundle = c(localvw.A);
        }
        label120: break;
        label122: paramBundle = null;
        localvw = null;
      }
    }
  }

  public static boolean a(String paramString, org.vidogram.ui.a.g paramg)
  {
    if ((paramString == null) || (paramString.length() == 0) || (a().aV.isEmpty()) || (paramg == null))
      return true;
    Iterator localIterator = a().aV.iterator();
    while (localIterator.hasNext())
    {
      g.hr localhr = (g.hr)localIterator.next();
      if (!localhr.c.equals(paramString))
        continue;
      if (paramg.l() != null)
      {
        paramString = new AlertDialog.Builder(paramg.l());
        paramString.setTitle("Oops!");
        paramString.setPositiveButton(r.a("OK", 2131231604), null);
        paramString.setMessage(localhr.d);
        paramg.b(paramString.create());
      }
      return false;
    }
    return true;
  }

  private int b(g.vv paramvv)
  {
    if ((paramvv instanceof g.tv))
      return ((g.tv)paramvv).c.d.b;
    if ((paramvv instanceof g.tt))
      return ((g.tt)paramvv).c.d.b;
    return paramvv.f;
  }

  public static g.z b(int paramInt)
  {
    return a(a().b(Integer.valueOf(paramInt)));
  }

  private void b(ArrayList<g.hq> paramArrayList)
  {
    Object localObject1 = null;
    int i2 = 0;
    if (i2 < paramArrayList.size())
    {
      g.hq localhq = (g.hq)paramArrayList.get(i2);
      Object localObject2 = localObject1;
      int i1;
      if (localhq.d != null)
      {
        localObject2 = localObject1;
        if ((localhq.i instanceof g.rl))
        {
          localObject2 = localObject1;
          if (localObject1 == null)
            localObject2 = ApplicationLoader.a.getSharedPreferences("Notifications", 0).edit();
          if (localhq.d.c == 0)
            break label215;
          i1 = localhq.d.c;
          label96: ((SharedPreferences.Editor)localObject2).putBoolean("silent_" + i1, localhq.i.c);
          if (localhq.i.d == 0)
            break label320;
          if (localhq.i.d <= ConnectionsManager.a().b() + 31536000)
            break label252;
          ((SharedPreferences.Editor)localObject2).putInt("notify2_" + i1, 2);
          localhq.i.d = 2147483647;
        }
      }
      while (true)
      {
        i2 += 1;
        localObject1 = localObject2;
        break;
        label215: if (localhq.d.d != 0)
        {
          i1 = -localhq.d.d;
          break label96;
        }
        i1 = -localhq.d.b;
        break label96;
        label252: ((SharedPreferences.Editor)localObject2).putInt("notify2_" + i1, 3);
        ((SharedPreferences.Editor)localObject2).putInt("notifyuntil_" + i1, localhq.i.d);
        continue;
        label320: ((SharedPreferences.Editor)localObject2).remove("notify2_" + i1);
      }
    }
    if (localObject1 != null)
      localObject1.commit();
  }

  private void b(ArrayList<Integer> paramArrayList, long paramLong)
  {
    if (paramArrayList.isEmpty());
    ArrayList localArrayList2;
    g.i locali;
    Object localObject;
    ArrayList localArrayList1;
    label76: 
    do
    {
      return;
      localArrayList2 = new ArrayList();
      locali = e.a(paramLong);
      int i1;
      Integer localInteger;
      if (e.d(locali))
      {
        localObject = new g.eq();
        ((g.eq)localObject).c = a(locali);
        ((g.eq)localObject).d = localArrayList2;
        localArrayList1 = (ArrayList)this.aK.get(Long.valueOf(paramLong));
        i1 = 0;
        if (i1 >= paramArrayList.size())
          continue;
        localInteger = (Integer)paramArrayList.get(i1);
        if ((localArrayList1 == null) || (!localArrayList1.contains(localInteger)))
          break label139;
      }
      while (true)
      {
        i1 += 1;
        break label76;
        localObject = new g.py();
        ((g.py)localObject).c = localArrayList2;
        break;
        localArrayList2.add(localInteger);
      }
    }
    while (localArrayList2.isEmpty());
    label139: paramArrayList = localArrayList1;
    if (localArrayList1 == null)
    {
      paramArrayList = new ArrayList();
      this.aK.put(Long.valueOf(paramLong), paramArrayList);
    }
    paramArrayList.addAll(localArrayList2);
    ConnectionsManager.a().a((org.vidogram.tgnet.f)localObject, new org.vidogram.tgnet.c(paramLong, locali, localArrayList2)
    {
    });
  }

  private static String c(String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0));
    int i1;
    String str;
    do
    {
      do
      {
        return null;
        i1 = paramString.indexOf(": ");
      }
      while (i1 <= 0);
      str = paramString.substring(0, i1);
    }
    while ((!str.contains("-all")) && (!str.contains("-android")));
    return paramString.substring(i1 + 2);
  }

  public static g.aj c(int paramInt)
  {
    Object localObject2;
    Object localObject1;
    if (paramInt < 0)
    {
      localObject2 = a().b(Integer.valueOf(-paramInt));
      if (e.d((g.i)localObject2))
      {
        localObject1 = new g.kw();
        ((g.aj)localObject1).e = (-paramInt);
        ((g.aj)localObject1).c = ((g.i)localObject2).u;
      }
    }
    g.vw localvw;
    do
    {
      return localObject1;
      localObject1 = new g.kx();
      ((g.aj)localObject1).d = (-paramInt);
      return localObject1;
      localvw = a().a(Integer.valueOf(paramInt));
      localObject2 = new g.lb();
      ((g.aj)localObject2).b = paramInt;
      localObject1 = localObject2;
    }
    while (localvw == null);
    ((g.aj)localObject2).c = localvw.h;
    return (g.aj)(g.aj)localObject2;
  }

  private boolean c(boolean paramBoolean)
  {
    int i3 = 0;
    int i1 = ConnectionsManager.a().b();
    int i2 = i3;
    if (this.aN != null)
      if (!paramBoolean)
      {
        i2 = i3;
        if (this.aM != 0)
        {
          i2 = i3;
          if (this.aM > i1);
        }
      }
      else
      {
        this.aM = 0;
        if ((this.aO != null) && (!paramBoolean))
          Utilities.c.a(this.aO);
        this.aO = null;
        a.a(new Runnable()
        {
          public void run()
          {
            v.this.a(v.l(v.this), null, null, 0);
            Utilities.c.b(new Runnable()
            {
              public void run()
              {
                v.this.a(v.l(v.this));
                v.a(v.this, 0);
                v.a(v.this, null);
              }
            });
          }
        });
        i2 = 1;
      }
    return i2;
  }

  public static g.aw d(int paramInt)
  {
    if (paramInt < 0)
    {
      localObject = a().b(Integer.valueOf(-paramInt));
      if (((localObject instanceof g.di)) || ((localObject instanceof g.dj)))
      {
        localObject = new g.rj();
        ((g.aw)localObject).b = (-paramInt);
        return localObject;
      }
      localObject = new g.rk();
      ((g.aw)localObject).d = (-paramInt);
      return localObject;
    }
    a().a(Integer.valueOf(paramInt));
    Object localObject = new g.ro();
    ((g.aw)localObject).c = paramInt;
    return (g.aw)localObject;
  }

  private void k(int paramInt)
  {
    a(paramInt, 0, 0L);
  }

  public int a(String paramString1, ArrayList<Integer> paramArrayList, String paramString2, int paramInt, org.vidogram.ui.a.g paramg)
  {
    if (paramInt == 1)
    {
      paramString2 = new g.fd();
      paramString2.h = ad.e;
      paramString2.i = paramString1;
      paramString2.j = new g.ft();
      paramString2.k = paramArrayList.size();
      paramString2.l = (int)(System.currentTimeMillis() / 1000L);
      paramString2.m = 1;
      ad.e -= 1;
      a(paramString2, false);
      paramString1 = new ArrayList();
      paramString1.add(paramString2);
      w.a().a(null, paramString1, true, true);
      paramString1 = new g.fi();
      paramString1.e = paramString2.h;
      paramString1.m = new g.rr();
      paramString1.n = new g.rm();
      paramString1.o = new g.fj();
      paramString1.t = new g.fo();
      paramString1.t.c = paramString2.h;
      paramString1.t.g = ad.c();
      paramString1.t.f = 1;
      paramInt = 0;
      while (paramInt < paramArrayList.size())
      {
        paramg = new g.fl();
        paramg.b = ((Integer)paramArrayList.get(paramInt)).intValue();
        paramg.c = ad.c();
        paramg.d = (int)(System.currentTimeMillis() / 1000L);
        paramString1.t.e.add(paramg);
        paramInt += 1;
      }
      w.a().a(paramString1, false);
      paramString1 = new g.oj();
      paramString1.f = new g.ms();
      paramInt = ad.a();
      paramString1.b = paramInt;
      paramString1.D = paramInt;
      paramString1.c = ad.c();
      paramString1.E = a.a(paramString2.h);
      paramString1.d = new g.rk();
      paramString1.d.d = paramString2.h;
      paramString1.e = ConnectionsManager.a().b();
      paramString1.C = 0L;
      paramString1.k |= 256;
      ad.a(false);
      paramg = new u(paramString1, this.ae, true);
      paramg.a.y = 0;
      paramArrayList = new ArrayList();
      paramArrayList.add(paramg);
      paramg = new ArrayList();
      paramg.add(paramString1);
      w.a().a(paramg, false, true, false, 0);
      a(paramString1.E, paramArrayList);
      y.a().a(y.c, new Object[0]);
      y.a().a(y.l, new Object[] { Integer.valueOf(paramString2.h) });
      return 0;
    }
    if (paramInt == 0)
    {
      paramString2 = new g.pa();
      paramString2.d = paramString1;
      paramInt = 0;
      if (paramInt < paramArrayList.size())
      {
        paramString1 = a((Integer)paramArrayList.get(paramInt));
        if (paramString1 == null);
        while (true)
        {
          paramInt += 1;
          break;
          paramString2.c.add(a(paramString1));
        }
      }
      return ConnectionsManager.a().a(paramString2, new org.vidogram.tgnet.c(paramg)
      {
      }
      , 2);
    }
    if ((paramInt == 2) || (paramInt == 4))
    {
      paramArrayList = new g.ee();
      paramArrayList.f = paramString1;
      paramArrayList.g = paramString2;
      if (paramInt == 4)
        paramArrayList.e = true;
      while (true)
      {
        return ConnectionsManager.a().a(paramArrayList, new org.vidogram.tgnet.c(paramg)
        {
        }
        , 2);
        paramArrayList.d = true;
      }
    }
    return 0;
  }

  public g.vw a(Integer paramInteger)
  {
    return (g.vw)this.ae.get(paramInteger);
  }

  public g.vw a(String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0))
      return null;
    return (g.vw)this.af.get(paramString.toLowerCase());
  }

  public void a(int paramInt1, int paramInt2, int paramInt3, long paramLong, boolean paramBoolean, int paramInt4)
  {
    if (paramBoolean)
      w.a().a(paramInt1, paramInt2, paramInt3, paramLong, paramInt4);
    do
      while (true)
      {
        return;
        if (paramInt1 <= 0)
          break;
        localObject = a(Integer.valueOf(paramInt1));
        if (localObject == null)
          continue;
        g.ry localry = new g.ry();
        localry.f = paramInt3;
        localry.d = paramInt2;
        localry.e = (int)paramLong;
        localry.c = a((g.vw)localObject);
        paramInt1 = ConnectionsManager.a().a(localry, new org.vidogram.tgnet.c(paramInt1, paramInt2, paramInt3, paramLong, paramInt4)
        {
        });
        ConnectionsManager.a().a(paramInt1, paramInt4);
        return;
      }
    while (paramInt1 >= 0);
    Object localObject = new g.qt();
    ((g.qt)localObject).f = new g.ko();
    ((g.qt)localObject).k = paramInt3;
    ((g.qt)localObject).i = paramInt2;
    ((g.qt)localObject).j = (int)paramLong;
    ((g.qt)localObject).e = "";
    ((g.qt)localObject).d = c(paramInt1);
    paramInt1 = ConnectionsManager.a().a((org.vidogram.tgnet.f)localObject, new org.vidogram.tgnet.c(paramInt1, paramInt2, paramInt3, paramLong, paramInt4)
    {
    });
    ConnectionsManager.a().a(paramInt1, paramInt4);
  }

  public void a(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    b(ad.b);
    if (w.b == 0)
      h();
    do
      return;
    while ((!paramBoolean) && (this.t));
    if (!this.v)
    {
      a(null);
      this.v = true;
    }
    this.t = true;
    g.ud localud = new g.ud();
    localud.c = paramInt1;
    localud.d = paramInt2;
    localud.e = paramInt3;
    if (localud.d == 0)
      localud.d = ConnectionsManager.a().b();
    n.a("tmessages", "start getDifference with date = " + w.a + " pts = " + w.b + " seq = " + w.d);
    ConnectionsManager.a().b(true);
    ConnectionsManager.a().a(localud, new org.vidogram.tgnet.c()
    {
    });
  }

  // ERROR //
  protected void a(int paramInt1, int paramInt2, long paramLong)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 440	org/vidogram/messenger/v:as	Ljava/util/HashMap;
    //   4: iload_1
    //   5: invokestatic 747	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   8: invokevirtual 1251	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   11: checkcast 951	java/lang/Boolean
    //   14: astore 7
    //   16: aload 7
    //   18: astore 6
    //   20: aload 7
    //   22: ifnonnull +9 -> 31
    //   25: iconst_0
    //   26: invokestatic 954	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   29: astore 6
    //   31: aload 6
    //   33: invokevirtual 1504	java/lang/Boolean:booleanValue	()Z
    //   36: ifeq +4 -> 40
    //   39: return
    //   40: iload_2
    //   41: iconst_1
    //   42: if_icmpne +194 -> 236
    //   45: aload_0
    //   46: getfield 438	org/vidogram/messenger/v:ar	Ljava/util/HashMap;
    //   49: iload_1
    //   50: invokestatic 747	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   53: invokevirtual 1251	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   56: checkcast 743	java/lang/Integer
    //   59: ifnonnull -20 -> 39
    //   62: iconst_1
    //   63: invokestatic 747	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   66: astore 7
    //   68: iconst_1
    //   69: istore 5
    //   71: lload_3
    //   72: lconst_0
    //   73: lcmp
    //   74: ifne +277 -> 351
    //   77: new 1506	org/vidogram/tgnet/NativeByteBuffer
    //   80: dup
    //   81: bipush 12
    //   83: invokespecial 1508	org/vidogram/tgnet/NativeByteBuffer:<init>	(I)V
    //   86: astore 6
    //   88: aload 6
    //   90: iconst_1
    //   91: invokevirtual 1509	org/vidogram/tgnet/NativeByteBuffer:a	(I)V
    //   94: aload 6
    //   96: iload_1
    //   97: invokevirtual 1509	org/vidogram/tgnet/NativeByteBuffer:a	(I)V
    //   100: aload 6
    //   102: iload_2
    //   103: invokevirtual 1509	org/vidogram/tgnet/NativeByteBuffer:a	(I)V
    //   106: invokestatic 582	org/vidogram/messenger/w:a	()Lorg/vidogram/messenger/w;
    //   109: aload 6
    //   111: invokevirtual 1512	org/vidogram/messenger/w:a	(Lorg/vidogram/tgnet/NativeByteBuffer;)J
    //   114: lstore_3
    //   115: aload_0
    //   116: getfield 440	org/vidogram/messenger/v:as	Ljava/util/HashMap;
    //   119: iload_1
    //   120: invokestatic 747	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   123: iconst_1
    //   124: invokestatic 954	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   127: invokevirtual 1259	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   130: pop
    //   131: new 1514	org/vidogram/tgnet/g$uc
    //   134: dup
    //   135: invokespecial 1515	org/vidogram/tgnet/g$uc:<init>	()V
    //   138: astore 6
    //   140: aload 6
    //   142: iload_1
    //   143: invokestatic 1517	org/vidogram/messenger/v:b	(I)Lorg/vidogram/tgnet/g$z;
    //   146: putfield 1518	org/vidogram/tgnet/g$uc:c	Lorg/vidogram/tgnet/g$z;
    //   149: aload 6
    //   151: new 1520	org/vidogram/tgnet/g$dp
    //   154: dup
    //   155: invokespecial 1521	org/vidogram/tgnet/g$dp:<init>	()V
    //   158: putfield 1524	org/vidogram/tgnet/g$uc:d	Lorg/vidogram/tgnet/g$e;
    //   161: aload 6
    //   163: aload 7
    //   165: invokevirtual 1383	java/lang/Integer:intValue	()I
    //   168: putfield 1525	org/vidogram/tgnet/g$uc:e	I
    //   171: aload 6
    //   173: iload 5
    //   175: putfield 1526	org/vidogram/tgnet/g$uc:f	I
    //   178: ldc_w 700
    //   181: new 1197	java/lang/StringBuilder
    //   184: dup
    //   185: invokespecial 1198	java/lang/StringBuilder:<init>	()V
    //   188: ldc_w 1528
    //   191: invokevirtual 1204	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   194: aload 7
    //   196: invokevirtual 1531	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   199: ldc_w 1533
    //   202: invokevirtual 1204	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   205: iload_1
    //   206: invokevirtual 1207	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   209: invokevirtual 1211	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   212: invokestatic 1498	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   215: invokestatic 819	org/vidogram/tgnet/ConnectionsManager:a	()Lorg/vidogram/tgnet/ConnectionsManager;
    //   218: aload 6
    //   220: new 194	org/vidogram/messenger/v$85
    //   223: dup
    //   224: aload_0
    //   225: iload_1
    //   226: iload_2
    //   227: lload_3
    //   228: invokespecial 1536	org/vidogram/messenger/v$85:<init>	(Lorg/vidogram/messenger/v;IIJ)V
    //   231: invokevirtual 823	org/vidogram/tgnet/ConnectionsManager:a	(Lorg/vidogram/tgnet/f;Lorg/vidogram/tgnet/c;)I
    //   234: pop
    //   235: return
    //   236: aload_0
    //   237: getfield 438	org/vidogram/messenger/v:ar	Ljava/util/HashMap;
    //   240: iload_1
    //   241: invokestatic 747	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   244: invokevirtual 1251	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   247: checkcast 743	java/lang/Integer
    //   250: astore 7
    //   252: aload 7
    //   254: astore 6
    //   256: aload 7
    //   258: ifnonnull +58 -> 316
    //   261: invokestatic 582	org/vidogram/messenger/w:a	()Lorg/vidogram/messenger/w;
    //   264: iload_1
    //   265: invokevirtual 1539	org/vidogram/messenger/w:g	(I)I
    //   268: invokestatic 747	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   271: astore 7
    //   273: aload 7
    //   275: invokevirtual 1383	java/lang/Integer:intValue	()I
    //   278: ifeq +17 -> 295
    //   281: aload_0
    //   282: getfield 438	org/vidogram/messenger/v:ar	Ljava/util/HashMap;
    //   285: iload_1
    //   286: invokestatic 747	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   289: aload 7
    //   291: invokevirtual 1259	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   294: pop
    //   295: aload 7
    //   297: astore 6
    //   299: aload 7
    //   301: invokevirtual 1383	java/lang/Integer:intValue	()I
    //   304: ifne +12 -> 316
    //   307: iload_2
    //   308: iconst_2
    //   309: if_icmpeq -270 -> 39
    //   312: aload 7
    //   314: astore 6
    //   316: aload 6
    //   318: invokevirtual 1383	java/lang/Integer:intValue	()I
    //   321: ifeq -282 -> 39
    //   324: bipush 100
    //   326: istore 5
    //   328: aload 6
    //   330: astore 7
    //   332: goto -261 -> 71
    //   335: astore 8
    //   337: aconst_null
    //   338: astore 6
    //   340: ldc_w 700
    //   343: aload 8
    //   345: invokestatic 705	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   348: goto -242 -> 106
    //   351: goto -236 -> 115
    //   354: astore 8
    //   356: goto -16 -> 340
    //
    // Exception table:
    //   from	to	target	type
    //   77	88	335	java/lang/Exception
    //   88	106	354	java/lang/Exception
  }

  public void a(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    if ((this.aE.contains(Integer.valueOf(paramInt1))) || ((!paramBoolean) && (this.aH.contains(Integer.valueOf(paramInt1)))))
      return;
    this.aE.add(Integer.valueOf(paramInt1));
    g.i locali = b(Integer.valueOf(paramInt1));
    Object localObject;
    if (e.a(paramInt1))
    {
      localObject = new g.ep();
      ((g.ep)localObject).c = b(paramInt1);
    }
    while (true)
    {
      paramInt1 = ConnectionsManager.a().a((org.vidogram.tgnet.f)localObject, new org.vidogram.tgnet.c(locali, paramInt1, paramInt2)
      {
      });
      if (paramInt2 == 0)
        break;
      ConnectionsManager.a().a(paramInt1, paramInt2);
      return;
      localObject = new g.pt();
      ((g.pt)localObject).c = paramInt1;
    }
  }

  public void a(int paramInt, long paramLong)
  {
    HashMap localHashMap = (HashMap)this.n.get(Integer.valueOf(paramInt));
    if (localHashMap != null)
      localHashMap.remove(Long.valueOf(paramLong));
  }

  public void a(int paramInt, SparseArray<ArrayList<Integer>> paramSparseArray)
  {
    Utilities.c.b(new Runnable(paramInt)
    {
      public void run()
      {
        if (((v.l(v.this) == null) && (!v.m(v.this))) || ((v.n(v.this) != 0) && (this.a < v.n(v.this))))
          v.this.a(null);
      }
    });
    a.a(new Runnable(paramSparseArray)
    {
      public void run()
      {
        y.a().a(y.B, new Object[] { this.a });
      }
    });
  }

  public void a(int paramInt, String paramString)
  {
    g.fc localfc = new g.fc();
    localfc.c = b(paramInt);
    localfc.d = paramString;
    ConnectionsManager.a().a(localfc, new org.vidogram.tgnet.c(paramInt, paramString)
    {
    }
    , 64);
  }

  public void a(int paramInt, String paramString, g.j paramj)
  {
    if (paramj == null)
      return;
    g.ei localei = new g.ei();
    localei.c = b(paramInt);
    localei.d = paramString;
    ConnectionsManager.a().a(localei, new org.vidogram.tgnet.c(paramj, paramString)
    {
    }
    , 64);
  }

  public void a(int paramInt, ArrayList<Integer> paramArrayList)
  {
    Utilities.c.b(new Runnable(paramArrayList, paramInt)
    {
      public void run()
      {
        v.a(v.this, false);
        if (this.a != null)
        {
          v.a(v.this, this.b);
          v.a(v.this, this.a);
          if (v.o(v.this) != null)
          {
            Utilities.c.a(v.o(v.this));
            v.a(v.this, null);
          }
          if (!v.b(v.this, false))
          {
            v.a(v.this, new Runnable()
            {
              public void run()
              {
                v.b(v.this, true);
              }
            });
            int i = ConnectionsManager.a().b();
            Utilities.c.a(v.o(v.this), Math.abs(i - v.n(v.this)) * 1000L);
          }
          return;
        }
        v.a(v.this, 0);
        v.a(v.this, null);
      }
    });
  }

  public void a(int paramInt, ArrayList<g.ap> paramArrayList, org.vidogram.ui.a.g paramg)
  {
    if ((paramArrayList == null) || (paramArrayList.isEmpty()))
      return;
    g.et localet = new g.et();
    localet.c = b(paramInt);
    localet.d = paramArrayList;
    ConnectionsManager.a().a(localet, new org.vidogram.tgnet.c(paramg)
    {
    });
  }

  public void a(int paramInt, Semaphore paramSemaphore, boolean paramBoolean)
  {
    w.a().a(paramInt, paramSemaphore, paramBoolean, false);
  }

  public void a(int paramInt, g.ad paramad)
  {
    Object localObject;
    if (e.a(paramInt))
    {
      localObject = new g.ek();
      ((g.ek)localObject).c = b(paramInt);
      if (paramad != null)
      {
        ((g.ek)localObject).d = new g.jm();
        ((g.ek)localObject).d.b = paramad;
        paramad = (g.ad)localObject;
      }
    }
    while (true)
    {
      ConnectionsManager.a().a(paramad, new org.vidogram.tgnet.c()
      {
      }
      , 64);
      return;
      ((g.ek)localObject).d = new g.jl();
      paramad = (g.ad)localObject;
      continue;
      localObject = new g.pg();
      ((g.pg)localObject).c = paramInt;
      if (paramad != null)
      {
        ((g.pg)localObject).d = new g.jm();
        ((g.pg)localObject).d.b = paramad;
        paramad = (g.ad)localObject;
        continue;
      }
      ((g.pg)localObject).d = new g.jl();
      paramad = (g.ad)localObject;
    }
  }

  public void a(int paramInt, g.j paramj, ArrayList<g.vw> paramArrayList, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, u paramu)
  {
    if ((paramBoolean1) && (paramInt > 0) && (!paramBoolean3))
      a(paramInt, 0, paramBoolean2);
    if (paramj != null)
      a.a(new Runnable(paramArrayList, paramBoolean1, paramj, paramBoolean3, paramu)
      {
        public void run()
        {
          v.this.a(this.a, this.b);
          y.a().a(y.n, new Object[] { this.c, Integer.valueOf(0), Boolean.valueOf(this.d), this.e });
        }
      });
  }

  public void a(int paramInt, g.vw paramvw, g.j paramj)
  {
    if (paramvw == null);
    do
    {
      return;
      if (paramInt <= 0)
        continue;
      localObject1 = a(paramvw);
      localObject2 = b(Integer.valueOf(paramInt));
      boolean bool = e.d((g.i)localObject2);
      if (bool)
        if ((localObject1 instanceof g.lw))
          if (((g.i)localObject2).c)
          {
            paramj = new g.ef();
            paramj.c = a((g.i)localObject2);
          }
      while (true)
      {
        ConnectionsManager.a().a(paramj, new org.vidogram.tgnet.c(paramvw, paramInt, bool, (g.ap)localObject1)
        {
        }
        , 64);
        return;
        paramj = new g.ew();
        paramj.c = a((g.i)localObject2);
        continue;
        paramj = new g.ev();
        paramj.c = a((g.i)localObject2);
        paramj.d = ((g.ap)localObject1);
        paramj.e = true;
        continue;
        paramj = new g.pb();
        paramj.c = paramInt;
        paramj.d = a(paramvw);
      }
    }
    while (!(paramj instanceof g.fi));
    Object localObject1 = b(Integer.valueOf(paramInt));
    ((g.i)localObject1).k -= 1;
    Object localObject2 = new ArrayList();
    ((ArrayList)localObject2).add(localObject1);
    w.a().a(null, (ArrayList)localObject2, true, true);
    paramInt = 0;
    if (paramInt < paramj.t.e.size())
      if (((g.k)paramj.t.e.get(paramInt)).b == paramvw.d)
        paramj.t.e.remove(paramInt);
    for (paramInt = 1; ; paramInt = 0)
    {
      if (paramInt != 0)
      {
        w.a().a(paramj, true);
        y.a().a(y.n, new Object[] { paramj, Integer.valueOf(0), Boolean.valueOf(false), null });
      }
      y.a().a(y.b, new Object[] { Integer.valueOf(32) });
      return;
      paramInt += 1;
      break;
    }
  }

  public void a(int paramInt1, g.vw paramvw, g.j paramj, int paramInt2, String paramString, org.vidogram.ui.a.g paramg)
  {
    boolean bool1 = true;
    if (paramvw == null);
    label145: label226: label254: 
    do
    {
      boolean bool2;
      g.ap localap;
      while (true)
      {
        return;
        if (paramInt1 <= 0)
          break label323;
        bool2 = e.a(paramInt1);
        if ((!bool2) || (!b(Integer.valueOf(paramInt1)).r))
          break;
        localap = a(paramvw);
        if ((paramString != null) && ((!bool2) || (bool1)))
          break label254;
        if (!bool2)
          break label226;
        if (!(localap instanceof g.lw))
          break label145;
        if (this.ag.contains(Integer.valueOf(paramInt1)))
          continue;
        paramvw = new g.eu();
        paramvw.c = b(paramInt1);
        this.ag.add(Integer.valueOf(paramInt1));
      }
      while (true)
      {
        ConnectionsManager.a().a(paramvw, new org.vidogram.tgnet.c(bool2, localap, paramInt1, paramg, bool1)
        {
        });
        return;
        bool1 = false;
        break;
        if ((paramvw.r) && (!bool1))
        {
          paramj = new g.ej();
          paramj.c = b(paramInt1);
          paramj.d = a(paramvw);
          paramj.e = new g.dz();
          paramvw = paramj;
          continue;
        }
        paramvw = new g.et();
        paramvw.c = b(paramInt1);
        paramvw.d.add(localap);
        continue;
        paramvw = new g.ox();
        paramvw.c = paramInt1;
        paramvw.e = paramInt2;
        paramvw.d = localap;
      }
      paramvw = new g.rf();
      paramvw.c = localap;
      if (bool2)
        paramvw.d = c(-paramInt1);
      while (true)
      {
        paramvw.f = paramString;
        paramvw.e = Utilities.b.nextLong();
        break;
        paramvw.d = new g.kx();
        paramvw.d.d = paramInt1;
      }
    }
    while (!(paramj instanceof g.fi));
    label323: paramInt2 = 0;
    while (true)
    {
      if (paramInt2 >= paramj.t.e.size())
        break label382;
      if (((g.k)paramj.t.e.get(paramInt2)).b == paramvw.d)
        break;
      paramInt2 += 1;
    }
    label382: paramString = b(Integer.valueOf(paramInt1));
    paramString.k += 1;
    paramg = new ArrayList();
    paramg.add(paramString);
    w.a().a(null, paramg, true, true);
    paramString = new g.fl();
    paramString.b = paramvw.d;
    paramString.c = ad.c();
    paramString.d = ConnectionsManager.a().b();
    paramj.t.e.add(0, paramString);
    w.a().a(paramj, true);
    y.a().a(y.n, new Object[] { paramj, Integer.valueOf(0), Boolean.valueOf(false), null });
    y.a().a(y.b, new Object[] { Integer.valueOf(32) });
  }

  public void a(int paramInt, boolean paramBoolean)
  {
    g.ez localez = new g.ez();
    localez.c = b(paramInt);
    localez.d = paramBoolean;
    ConnectionsManager.a().a(localez, new org.vidogram.tgnet.c()
    {
    }
    , 64);
  }

  public void a(int paramInt, Object[] paramArrayOfObject)
  {
    Object localObject;
    if (paramInt == y.av)
    {
      localObject = (String)paramArrayOfObject[0];
      paramArrayOfObject = (g.ad)paramArrayOfObject[1];
      if ((this.aU != null) && (this.aU.equals(localObject)))
      {
        localObject = new g.sa();
        ((g.sa)localObject).c = paramArrayOfObject;
        ConnectionsManager.a().a((org.vidogram.tgnet.f)localObject, new org.vidogram.tgnet.c()
        {
        });
      }
    }
    do
    {
      do
        while (true)
        {
          return;
          if (paramInt != y.aw)
            break;
          paramArrayOfObject = (String)paramArrayOfObject[0];
          if ((this.aU == null) || (!this.aU.equals(paramArrayOfObject)))
            continue;
          this.aU = null;
          return;
        }
      while (paramInt != y.i);
      Integer localInteger = (Integer)paramArrayOfObject[0];
      localObject = (Integer)paramArrayOfObject[1];
      paramArrayOfObject = (Long)paramArrayOfObject[3];
      u localu = (u)this.h.get(paramArrayOfObject);
      if ((localu != null) && (localu.q() == localInteger.intValue()))
      {
        localu.a.b = ((Integer)localObject).intValue();
        localu.a.y = 0;
        paramArrayOfObject = (g.hq)this.g.get(paramArrayOfObject);
        if ((paramArrayOfObject != null) && (paramArrayOfObject.e == localInteger.intValue()))
          paramArrayOfObject.e = ((Integer)localObject).intValue();
        y.a().a(y.c, new Object[0]);
      }
      paramArrayOfObject = (u)this.j.remove(localInteger);
    }
    while (paramArrayOfObject == null);
    this.j.put(localObject, paramArrayOfObject);
  }

  public void a(long paramLong, int paramInt)
  {
    a(paramLong, true, paramInt, 0);
  }

  public void a(long paramLong, int paramInt1, int paramInt2)
  {
    if (new itman.robert.a().a(ApplicationLoader.a));
    label16: 
    do
    {
      Object localObject2;
      Object localObject1;
      do
      {
        int i2;
        do
          while (true)
          {
            break label16;
            break label16;
            break label16;
            break label16;
            break label16;
            break label16;
            do
              return;
            while (paramLong == 0L);
            localObject2 = (HashMap)this.n.get(Integer.valueOf(paramInt1));
            if ((localObject2 != null) && (((HashMap)localObject2).get(Long.valueOf(paramLong)) != null))
              continue;
            localObject1 = localObject2;
            if (localObject2 == null)
            {
              localObject1 = new HashMap();
              this.n.put(Integer.valueOf(paramInt1), localObject1);
            }
            int i1 = (int)paramLong;
            i2 = (int)(paramLong >> 32);
            if (i1 == 0)
              break;
            if (i2 == 1)
              continue;
            localObject2 = new g.re();
            ((g.re)localObject2).c = c(i1);
            if ((((g.re)localObject2).c instanceof g.kw))
            {
              localObject3 = b(Integer.valueOf(((g.re)localObject2).c.e));
              if ((localObject3 == null) || (!((g.i)localObject3).r))
                continue;
            }
            if (((g.re)localObject2).c == null)
              continue;
            if (paramInt1 == 0)
              ((g.re)localObject2).d = new g.sq();
            while (true)
            {
              ((HashMap)localObject1).put(Long.valueOf(paramLong), Boolean.valueOf(true));
              paramInt1 = ConnectionsManager.a().a((org.vidogram.tgnet.f)localObject2, new org.vidogram.tgnet.c(paramInt1, paramLong)
              {
              }
              , 2);
              if (paramInt2 == 0)
                break;
              ConnectionsManager.a().a(paramInt1, paramInt2);
              return;
              if (paramInt1 == 1)
              {
                ((g.re)localObject2).d = new g.so();
                continue;
              }
              if (paramInt1 == 2)
              {
                ((g.re)localObject2).d = new g.sj();
                continue;
              }
              if (paramInt1 == 3)
              {
                ((g.re)localObject2).d = new g.st();
                continue;
              }
              if (paramInt1 == 4)
              {
                ((g.re)localObject2).d = new g.sv();
                continue;
              }
              if (paramInt1 != 5)
                continue;
              ((g.re)localObject2).d = new g.sx();
            }
          }
        while (paramInt1 != 0);
        localObject2 = c(Integer.valueOf(i2));
      }
      while ((((g.t)localObject2).l == null) || (((g.t)localObject2).l.length <= 1) || (!(localObject2 instanceof g.im)));
      Object localObject3 = new g.rd();
      ((g.rd)localObject3).c = new g.jq();
      ((g.rd)localObject3).c.c = ((g.t)localObject2).b;
      ((g.rd)localObject3).c.d = ((g.t)localObject2).c;
      ((g.rd)localObject3).d = true;
      ((HashMap)localObject1).put(Long.valueOf(paramLong), Boolean.valueOf(true));
      paramInt1 = ConnectionsManager.a().a((org.vidogram.tgnet.f)localObject3, new org.vidogram.tgnet.c(paramInt1, paramLong)
      {
      }
      , 2);
    }
    while (paramInt2 == 0);
    ConnectionsManager.a().a(paramInt1, paramInt2);
  }

  public void a(long paramLong, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean1, boolean paramBoolean2)
  {
    int i1 = (int)paramLong;
    int i2 = (int)(paramLong >> 32);
    if (i1 != 0)
      if ((paramInt2 != 0) && (i2 != 1));
    Object localObject1;
    do
    {
      Object localObject2;
      do
      {
        return;
        localObject1 = c(i1);
        long l1 = paramInt2;
        if ((localObject1 instanceof g.kw))
        {
          localObject1 = new g.ex();
          ((g.ex)localObject1).c = b(-i1);
          ((g.ex)localObject1).d = paramInt2;
          W = (org.vidogram.tgnet.f)localObject1;
          l1 |= -i1 << 32;
        }
        while (true)
        {
          localObject2 = (Integer)this.e.get(Long.valueOf(paramLong));
          localObject1 = localObject2;
          if (localObject2 == null)
            localObject1 = Integer.valueOf(0);
          this.e.put(Long.valueOf(paramLong), Integer.valueOf(Math.max(((Integer)localObject1).intValue(), paramInt2)));
          w.a().a(paramLong, l1, paramInt3);
          w.a().c().b(new Runnable(paramLong, paramBoolean2, paramInt2)
          {
            public void run()
            {
              a.a(new Runnable()
              {
                public void run()
                {
                  Object localObject = (g.hq)v.this.g.get(Long.valueOf(v.55.this.a));
                  if (localObject != null)
                  {
                    ((g.hq)localObject).h = 0;
                    y.a().a(y.b, new Object[] { Integer.valueOf(256) });
                  }
                  if (!v.55.this.b)
                  {
                    z.a().a(null, v.55.this.a, 0, v.55.this.c, false);
                    localObject = new HashMap();
                    ((HashMap)localObject).put(Long.valueOf(v.55.this.a), Integer.valueOf(0));
                    z.a().a((HashMap)localObject);
                    return;
                  }
                  z.a().a(null, v.55.this.a, 0, v.55.this.c, true);
                  localObject = new HashMap();
                  ((HashMap)localObject).put(Long.valueOf(v.55.this.a), Integer.valueOf(-1));
                  z.a().a((HashMap)localObject);
                }
              });
            }
          });
          localObject1 = new itman.robert.a();
          if ((paramInt2 == 2147483647) || (((itman.robert.a)localObject1).a(ApplicationLoader.a)))
            break;
          ConnectionsManager.a().a(W, new org.vidogram.tgnet.c()
          {
          });
          return;
          localObject2 = new g.qm();
          ((g.qm)localObject2).c = ((g.aj)localObject1);
          ((g.qm)localObject2).d = paramInt2;
          W = (org.vidogram.tgnet.f)localObject2;
        }
      }
      while (paramInt3 == 0);
      localObject1 = c(Integer.valueOf(i2));
      if ((((g.t)localObject1).l != null) && (((g.t)localObject1).l.length > 1) && ((localObject1 instanceof g.im)))
      {
        localObject2 = new g.qk();
        ((g.qk)localObject2).c = new g.jq();
        ((g.qk)localObject2).c.c = ((g.t)localObject1).b;
        ((g.qk)localObject2).c.d = ((g.t)localObject1).c;
        ((g.qk)localObject2).d = paramInt3;
        ConnectionsManager.a().a((org.vidogram.tgnet.f)localObject2, new org.vidogram.tgnet.c()
        {
        });
      }
      w.a().a(paramLong, paramInt1, paramInt3);
      w.a().c().b(new Runnable(paramLong, paramInt3, paramBoolean2)
      {
        public void run()
        {
          a.a(new Runnable()
          {
            public void run()
            {
              z.a().a(null, v.58.this.a, v.58.this.b, 0, v.58.this.c);
              Object localObject = (g.hq)v.this.g.get(Long.valueOf(v.58.this.a));
              if (localObject != null)
              {
                ((g.hq)localObject).h = 0;
                y.a().a(y.b, new Object[] { Integer.valueOf(256) });
              }
              localObject = new HashMap();
              ((HashMap)localObject).put(Long.valueOf(v.58.this.a), Integer.valueOf(0));
              z.a().a((HashMap)localObject);
            }
          });
        }
      });
    }
    while ((((g.t)localObject1).n <= 0) || (!paramBoolean1));
    paramInt1 = Math.max(ConnectionsManager.a().b(), paramInt3);
    w.a().a(((g.t)localObject1).b, paramInt1, paramInt1, 0, null);
  }

  public void a(long paramLong, int paramInt1, int paramInt2, boolean paramBoolean1, int paramInt3, int paramInt4, int paramInt5, int paramInt6, boolean paramBoolean2, int paramInt7)
  {
    a(paramLong, paramInt1, paramInt2, paramBoolean1, paramInt3, paramInt4, paramInt5, paramInt6, paramBoolean2, paramInt7, 0, 0, 0, false);
  }

  public void a(long paramLong, int paramInt1, int paramInt2, boolean paramBoolean1, int paramInt3, int paramInt4, int paramInt5, int paramInt6, boolean paramBoolean2, int paramInt7, int paramInt8, int paramInt9, int paramInt10, boolean paramBoolean3)
  {
    n.a("tmessages", "load messages in chat " + paramLong + " count " + paramInt1 + " max_id " + paramInt2 + " cache " + paramBoolean1 + " mindate = " + paramInt3 + " guid " + paramInt4 + " load_type " + paramInt5 + " last_message_id " + paramInt6 + " index " + paramInt7 + " firstUnread " + paramInt8 + " underad count " + paramInt9 + " last_date " + paramInt10 + " queryFromServer " + paramBoolean3);
    int i1 = (int)paramLong;
    if ((paramBoolean1) || (i1 == 0))
    {
      w.a().a(paramLong, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramBoolean2, paramInt7);
      return;
    }
    g.pu localpu = new g.pu();
    localpu.c = c(i1);
    if (paramInt5 == 3)
      localpu.f = (-paramInt1 / 2);
    while (true)
    {
      localpu.g = paramInt1;
      localpu.d = paramInt2;
      paramInt1 = ConnectionsManager.a().a(localpu, new org.vidogram.tgnet.c(paramInt1, paramLong, paramInt2, paramInt4, paramInt8, paramInt6, paramInt9, paramInt10, paramInt5, paramBoolean2, paramInt7, paramBoolean3)
      {
      });
      ConnectionsManager.a().a(paramInt1, paramInt4);
      return;
      if (paramInt5 == 1)
      {
        localpu.f = (-paramInt1 - 1);
        continue;
      }
      if ((paramInt5 == 2) && (paramInt2 != 0))
      {
        localpu.f = (-paramInt1 + 6);
        continue;
      }
      if ((i1 >= 0) || (paramInt2 == 0) || (!e.d(b(Integer.valueOf(-i1)))))
        continue;
      localpu.f = -1;
      localpu.g += 1;
    }
  }

  public void a(long paramLong1, long paramLong2, int paramInt)
  {
    if ((paramLong2 == 0L) || (paramLong1 == 0L) || ((paramInt <= 0) && (paramInt != -2147483648)));
    g.t localt;
    ArrayList localArrayList;
    do
    {
      do
      {
        int i1;
        int i2;
        do
        {
          return;
          i1 = (int)paramLong1;
          i2 = (int)(paramLong1 >> 32);
        }
        while (i1 != 0);
        localt = c(Integer.valueOf(i2));
      }
      while (localt == null);
      localArrayList = new ArrayList();
      localArrayList.add(Long.valueOf(paramLong2));
      ab.a().a(localt, localArrayList, null);
    }
    while (paramInt <= 0);
    paramInt = ConnectionsManager.a().b();
    w.a().a(localt.b, paramInt, paramInt, 0, localArrayList);
  }

  protected void a(long paramLong, ArrayList<u> paramArrayList)
  {
    a(paramLong, paramArrayList, false);
  }

  protected void a(long paramLong, ArrayList<u> paramArrayList, boolean paramBoolean)
  {
    if ((paramArrayList == null) || (paramArrayList.isEmpty()))
      return;
    int i2;
    label20: Object localObject2;
    int i5;
    int i1;
    int i3;
    label32: u localu;
    int i4;
    Object localObject1;
    if ((int)paramLong == 0)
    {
      i2 = 1;
      localObject2 = null;
      i5 = 0;
      i1 = 0;
      i3 = 0;
      if (i3 >= paramArrayList.size())
        break label297;
      localu = (u)paramArrayList.get(i3);
      if ((localObject2 != null) && ((i2 != 0) || (localu.q() <= localObject2.q())) && (((i2 == 0) && ((localu.q() >= 0) || (localObject2.q() >= 0))) || (localu.q() >= localObject2.q())))
      {
        i4 = i5;
        localObject1 = localObject2;
        if (localu.a.e <= localObject2.a.e);
      }
      else
      {
        if (localu.a.d.b == 0)
          break label1110;
        i4 = localu.a.d.b;
        localObject1 = localu;
      }
    }
    while (true)
    {
      if ((localu.j()) && (!localu.v()) && (!localu.S()))
      {
        if (localu.N())
          org.vidogram.messenger.d.g.a(localu.a.j.k, localu.a.e);
      }
      else
      {
        label221: if ((!localu.j()) || (!localu.x()))
          break label1107;
        i1 = 1;
      }
      label297: label1101: label1107: 
      while (true)
      {
        i3 += 1;
        i5 = i4;
        localObject2 = localObject1;
        break label32;
        i2 = 0;
        break label20;
        if (!localu.E())
          break label221;
        org.vidogram.messenger.d.g.a(0, localu.a.j.k, localu.a.e);
        break label221;
        org.vidogram.messenger.d.c.a(paramArrayList, paramLong);
        y.a().a(y.a, new Object[] { Long.valueOf(paramLong), paramArrayList });
        if (localObject2 == null)
          break;
        paramArrayList = (g.hq)this.g.get(Long.valueOf(paramLong));
        if ((localObject2.a.f instanceof g.mr))
        {
          if (paramArrayList == null)
            break;
          this.a.remove(paramArrayList);
          this.b.remove(paramArrayList);
          this.c.remove(paramArrayList);
          this.O.remove(paramArrayList);
          this.P.remove(paramArrayList);
          this.N.remove(paramArrayList);
          this.M.remove(paramArrayList);
          this.g.remove(Long.valueOf(paramArrayList.m));
          this.e.remove(Long.valueOf(paramArrayList.m));
          this.f.remove(Long.valueOf(paramArrayList.m));
          this.d -= 1;
          this.h.remove(Long.valueOf(paramArrayList.m));
          localObject1 = (u)this.j.remove(Integer.valueOf(paramArrayList.e));
          if ((localObject1 != null) && (((u)localObject1).a.C != 0L))
            this.i.remove(Long.valueOf(((u)localObject1).a.C));
          paramArrayList.e = 0;
          z.a().b(paramArrayList.m);
          y.a().a(y.aa, new Object[0]);
          return;
        }
        if (paramArrayList == null)
        {
          if (paramBoolean)
            break label1101;
          paramArrayList = b(Integer.valueOf(i5));
          if (((i5 != 0) && (paramArrayList == null)) || ((paramArrayList != null) && (paramArrayList.t)))
            break;
          localObject1 = new g.hq();
          ((g.hq)localObject1).m = paramLong;
          ((g.hq)localObject1).h = 0;
          ((g.hq)localObject1).e = localObject2.q();
          ((g.hq)localObject1).l = localObject2.a.e;
          if (e.d(paramArrayList))
          {
            i2 = 1;
            ((g.hq)localObject1).c = i2;
            this.g.put(Long.valueOf(paramLong), localObject1);
            this.a.add(localObject1);
            this.h.put(Long.valueOf(paramLong), localObject2);
            if (localObject2.a.d.b == 0)
            {
              this.j.put(Integer.valueOf(localObject2.q()), localObject2);
              if (localObject2.a.C != 0L)
                this.i.put(Long.valueOf(localObject2.a.C), localObject2);
            }
            this.d += 1;
            i2 = 1;
          }
        }
        while (true)
        {
          if (i2 != 0)
            b(null);
          if (i1 == 0)
            break;
          org.vidogram.messenger.d.e.a(paramLong);
          return;
          i2 = 0;
          break label675;
          if (((paramArrayList.e > 0) && (localObject2.q() > 0) && (localObject2.q() > paramArrayList.e)) || ((paramArrayList.e < 0) && (localObject2.q() < 0) && (localObject2.q() < paramArrayList.e)) || (!this.h.containsKey(Long.valueOf(paramLong))) || (paramArrayList.e < 0) || (paramArrayList.l <= localObject2.a.e))
          {
            localObject1 = (u)this.j.remove(Integer.valueOf(paramArrayList.e));
            if ((localObject1 != null) && (((u)localObject1).a.C != 0L))
              this.i.remove(Long.valueOf(((u)localObject1).a.C));
            paramArrayList.e = localObject2.q();
            if (!paramBoolean)
              paramArrayList.l = localObject2.a.e;
            for (i3 = 1; ; i3 = 0)
            {
              this.h.put(Long.valueOf(paramLong), localObject2);
              i2 = i3;
              if (localObject2.a.d.b != 0)
                break;
              this.j.put(Integer.valueOf(localObject2.q()), localObject2);
              i2 = i3;
              if (localObject2.a.C == 0L)
                break;
              this.i.put(Long.valueOf(localObject2.a.C), localObject2);
              i2 = i3;
              break;
            }
          }
          i2 = 0;
        }
      }
      label675: label1110: localObject1 = localu;
      i4 = i5;
    }
  }

  public void a(long paramLong, HashMap<String, ArrayList<u>> paramHashMap)
  {
    Iterator localIterator = paramHashMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      paramHashMap = (Map.Entry)localIterator.next();
      String str = (String)paramHashMap.getKey();
      ArrayList localArrayList2 = (ArrayList)paramHashMap.getValue();
      ArrayList localArrayList1 = (ArrayList)this.aI.get(str);
      paramHashMap = localArrayList1;
      if (localArrayList1 == null)
      {
        paramHashMap = new ArrayList();
        this.aI.put(str, paramHashMap);
      }
      paramHashMap.addAll(localArrayList2);
      paramHashMap = new g.qe();
      paramHashMap.c = str;
      ConnectionsManager.a().a(paramHashMap, new org.vidogram.tgnet.c(str, paramLong)
      {
      });
    }
  }

  public void a(long paramLong, g.vw paramvw, g.i parami)
  {
    if ((paramvw == null) && (parami == null))
      return;
    Object localObject = ApplicationLoader.a.getSharedPreferences("Notifications", 0).edit();
    ((SharedPreferences.Editor)localObject).putInt("spam3_" + paramLong, 1);
    ((SharedPreferences.Editor)localObject).commit();
    localObject = new g.qf();
    if (paramvw != null)
      ((g.qf)localObject).c = c(paramvw.d);
    while (true)
    {
      ConnectionsManager.a().a((org.vidogram.tgnet.f)localObject, new org.vidogram.tgnet.c()
      {
      });
      return;
      if (parami == null)
        continue;
      ((g.qf)localObject).c = c(-parami.h);
    }
  }

  public void a(long paramLong, boolean paramBoolean)
  {
    Utilities.c.b(new Runnable(paramBoolean, paramLong)
    {
      public void run()
      {
        if (this.a)
        {
          v.e(v.this).add(Long.valueOf(this.b));
          return;
        }
        v.e(v.this).remove(Long.valueOf(this.b));
      }
    });
  }

  public void a(Context paramContext, int paramInt)
  {
    g.qj localqj = new g.qj();
    localqj.c = paramInt;
    ProgressDialog localProgressDialog = new ProgressDialog(paramContext);
    localProgressDialog.setMessage(r.a("Loading", 2131231394));
    localProgressDialog.setCanceledOnTouchOutside(false);
    localProgressDialog.setCancelable(false);
    paramInt = ConnectionsManager.a().a(localqj, new org.vidogram.tgnet.c(paramContext, localProgressDialog)
    {
    });
    localProgressDialog.setButton(-2, r.a("Cancel", 2131230943), new DialogInterface.OnClickListener(paramInt)
    {
      public void onClick(DialogInterface paramDialogInterface, int paramInt)
      {
        ConnectionsManager.a().a(this.a, true);
        try
        {
          paramDialogInterface.dismiss();
          return;
        }
        catch (Exception paramDialogInterface)
        {
          n.a("tmessages", paramDialogInterface);
        }
      }
    });
    try
    {
      localProgressDialog.show();
      return;
    }
    catch (Exception paramContext)
    {
    }
  }

  public void a(ArrayList<Integer> paramArrayList)
  {
    Utilities.c.b(new Runnable(paramArrayList)
    {
      public void run()
      {
        v.a(v.this, true);
        w.a().b(this.a);
      }
    });
  }

  public void a(ArrayList<Integer> paramArrayList, int paramInt)
  {
    u localu = (u)this.h.get(Long.valueOf(-paramInt));
    if (localu != null)
      paramInt = 0;
    while (true)
    {
      if (paramInt < paramArrayList.size())
      {
        Integer localInteger = (Integer)paramArrayList.get(paramInt);
        if (localu.q() == localInteger.intValue())
          localu.j = true;
      }
      else
      {
        return;
      }
      paramInt += 1;
    }
  }

  public void a(ArrayList<Integer> paramArrayList, ArrayList<Long> paramArrayList1, g.t paramt, int paramInt)
  {
    if ((paramArrayList == null) || (paramArrayList.isEmpty()))
      return;
    if (paramInt == 0)
    {
      i1 = 0;
      while (i1 < paramArrayList.size())
      {
        localObject = (Integer)paramArrayList.get(i1);
        localObject = (u)this.j.get(localObject);
        if (localObject != null)
          ((u)localObject).j = true;
        i1 += 1;
      }
    }
    a(paramArrayList, paramInt);
    Object localObject = new ArrayList();
    int i1 = 0;
    while (i1 < paramArrayList.size())
    {
      Integer localInteger = (Integer)paramArrayList.get(i1);
      if (localInteger.intValue() > 0)
        ((ArrayList)localObject).add(localInteger);
      i1 += 1;
    }
    w.a().b(paramArrayList, true, paramInt);
    w.a().a(paramArrayList, true, paramInt);
    y.a().a(y.e, new Object[] { paramArrayList, Integer.valueOf(paramInt) });
    if (paramInt != 0)
    {
      paramArrayList = new g.eg();
      paramArrayList.d = ((ArrayList)localObject);
      paramArrayList.c = b(paramInt);
      ConnectionsManager.a().a(paramArrayList, new org.vidogram.tgnet.c(paramInt)
      {
      });
      return;
    }
    if ((paramArrayList1 != null) && (paramt != null) && (!paramArrayList1.isEmpty()))
      ab.a().b(paramt, paramArrayList1, null);
    paramArrayList = new g.pd();
    paramArrayList.c = ((ArrayList)localObject);
    ConnectionsManager.a().a(paramArrayList, new org.vidogram.tgnet.c()
    {
    });
  }

  public void a(ArrayList<Integer> paramArrayList, ArrayList<g.vw> paramArrayList1, boolean paramBoolean)
  {
    a.a(new Runnable(paramArrayList1, paramBoolean, paramArrayList)
    {
      public void run()
      {
        if (this.a != null)
          v.this.a(this.a, this.b);
        v.this.p = false;
        if ((this.c.isEmpty()) && (this.b) && (!ad.g))
        {
          v.this.a(false);
          return;
        }
        if (!this.b)
        {
          ad.g = true;
          ad.a(false);
        }
        v.this.q = this.c;
        y.a().a(y.y, new Object[0]);
      }
    });
  }

  public void a(ArrayList<g.vw> paramArrayList, boolean paramBoolean)
  {
    if ((paramArrayList == null) || (paramArrayList.isEmpty()))
      return;
    int i3 = paramArrayList.size();
    int i2 = 0;
    int i1 = 0;
    label23: if (i2 < i3)
    {
      if (!a((g.vw)paramArrayList.get(i2), paramBoolean))
        break label74;
      i1 = 1;
    }
    label74: 
    while (true)
    {
      i2 += 1;
      break label23;
      if (i1 == 0)
        break;
      a.a(new Runnable()
      {
        public void run()
        {
          y.a().a(y.b, new Object[] { Integer.valueOf(4) });
        }
      });
      return;
    }
  }

  public void a(HashMap<Long, Integer> paramHashMap)
  {
    a.a(new Runnable(paramHashMap)
    {
      public void run()
      {
        Iterator localIterator = this.a.entrySet().iterator();
        while (localIterator.hasNext())
        {
          Map.Entry localEntry = (Map.Entry)localIterator.next();
          g.hq localhq = (g.hq)v.this.g.get(localEntry.getKey());
          if (localhq == null)
            continue;
          localhq.h = ((Integer)localEntry.getValue()).intValue();
        }
        y.a().a(y.b, new Object[] { Integer.valueOf(256) });
        z.a().a(this.a);
      }
    });
  }

  public void a(u paramu)
  {
    Object localObject = new ArrayList();
    long l2 = paramu.q();
    long l1 = l2;
    if (paramu.a.d.b != 0)
      l1 = l2 | paramu.a.d.b << 32;
    ((ArrayList)localObject).add(Long.valueOf(l1));
    w.a().c((ArrayList)localObject);
    y.a().a(y.S, new Object[] { localObject });
    if (paramu.q() < 0)
    {
      a(paramu.u(), paramu.a.C, -2147483648);
      return;
    }
    localObject = new g.qn();
    ((g.qn)localObject).c.add(Integer.valueOf(paramu.q()));
    ConnectionsManager.a().a((org.vidogram.tgnet.f)localObject, new org.vidogram.tgnet.c()
    {
    });
  }

  public void a(g.ak paramak)
  {
    if (paramak == null)
    {
      g.rz localrz = new g.rz();
      localrz.c = new g.le();
      ad.d().j = new g.us();
      localObject = a(Integer.valueOf(ad.c()));
      paramak = (g.ak)localObject;
      if (localObject == null)
        paramak = ad.d();
      if (paramak == null)
        return;
      paramak.j = ad.d().j;
      y.a().a(y.C, new Object[0]);
      y.a().a(y.b, new Object[] { Integer.valueOf(1535) });
      ConnectionsManager.a().a(localrz, new org.vidogram.tgnet.c()
      {
      });
      return;
    }
    Object localObject = new g.rx();
    ((g.rx)localObject).c.add(paramak);
    ConnectionsManager.a().a((org.vidogram.tgnet.f)localObject, new org.vidogram.tgnet.c()
    {
    });
  }

  public void a(g.ar paramar, boolean paramBoolean)
  {
    ArrayList localArrayList = new ArrayList();
    long l2 = paramar.b;
    long l1 = l2;
    if (paramar.d.b != 0)
      l1 = l2 | paramar.d.b << 32;
    localArrayList.add(Long.valueOf(l1));
    w.a().c(localArrayList);
    Utilities.c.b(new Runnable(paramar)
    {
      public void run()
      {
        SparseArray localSparseArray = v.p(v.this);
        int i;
        if (this.a.d.b != 0)
          i = -this.a.d.b;
        while (true)
        {
          ArrayList localArrayList2 = (ArrayList)localSparseArray.get(i);
          ArrayList localArrayList1 = localArrayList2;
          if (localArrayList2 == null)
          {
            localArrayList1 = new ArrayList();
            localSparseArray.put(i, localArrayList1);
          }
          if (!localArrayList1.contains(Integer.valueOf(this.a.b)))
            localArrayList1.add(Integer.valueOf(this.a.b));
          return;
          if (this.a.d.d != 0)
          {
            i = -this.a.d.d;
            continue;
          }
          i = this.a.d.c;
        }
      }
    });
  }

  // ERROR //
  protected void a(g.hq paramhq, g.aj paramaj, long paramLong)
  {
    // Byte code:
    //   0: aload_1
    //   1: getfield 890	org/vidogram/tgnet/g$hq:m	J
    //   4: l2i
    //   5: istore 5
    //   7: iload 5
    //   9: ifeq +18 -> 27
    //   12: aload_0
    //   13: getfield 444	org/vidogram/messenger/v:au	Ljava/util/HashMap;
    //   16: iload 5
    //   18: invokestatic 747	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   21: invokevirtual 1935	java/util/HashMap:containsKey	(Ljava/lang/Object;)Z
    //   24: ifeq +4 -> 28
    //   27: return
    //   28: new 1862	org/vidogram/tgnet/g$pu
    //   31: dup
    //   32: invokespecial 1863	org/vidogram/tgnet/g$pu:<init>	()V
    //   35: astore 8
    //   37: aload_2
    //   38: ifnonnull +187 -> 225
    //   41: iload 5
    //   43: invokestatic 961	org/vidogram/messenger/v:c	(I)Lorg/vidogram/tgnet/g$aj;
    //   46: astore 6
    //   48: aload 8
    //   50: aload 6
    //   52: putfield 1864	org/vidogram/tgnet/g$pu:c	Lorg/vidogram/tgnet/g$aj;
    //   55: aload 8
    //   57: getfield 1864	org/vidogram/tgnet/g$pu:c	Lorg/vidogram/tgnet/g$aj;
    //   60: ifnull -33 -> 27
    //   63: aload 8
    //   65: iconst_1
    //   66: putfield 1866	org/vidogram/tgnet/g$pu:g	I
    //   69: aload_0
    //   70: getfield 444	org/vidogram/messenger/v:au	Ljava/util/HashMap;
    //   73: iload 5
    //   75: invokestatic 747	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   78: iconst_1
    //   79: invokestatic 954	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   82: invokevirtual 1259	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   85: pop
    //   86: lload_3
    //   87: lconst_0
    //   88: lcmp
    //   89: ifne +157 -> 246
    //   92: new 1506	org/vidogram/tgnet/NativeByteBuffer
    //   95: dup
    //   96: aload_2
    //   97: invokevirtual 2070	org/vidogram/tgnet/g$aj:b	()I
    //   100: bipush 40
    //   102: iadd
    //   103: invokespecial 1508	org/vidogram/tgnet/NativeByteBuffer:<init>	(I)V
    //   106: astore 6
    //   108: aload 6
    //   110: iconst_2
    //   111: invokevirtual 1509	org/vidogram/tgnet/NativeByteBuffer:a	(I)V
    //   114: aload 6
    //   116: aload_1
    //   117: getfield 890	org/vidogram/tgnet/g$hq:m	J
    //   120: invokevirtual 2071	org/vidogram/tgnet/NativeByteBuffer:a	(J)V
    //   123: aload 6
    //   125: aload_1
    //   126: getfield 858	org/vidogram/tgnet/g$hq:e	I
    //   129: invokevirtual 1509	org/vidogram/tgnet/NativeByteBuffer:a	(I)V
    //   132: aload 6
    //   134: aload_1
    //   135: getfield 2072	org/vidogram/tgnet/g$hq:f	I
    //   138: invokevirtual 1509	org/vidogram/tgnet/NativeByteBuffer:a	(I)V
    //   141: aload 6
    //   143: aload_1
    //   144: getfield 2073	org/vidogram/tgnet/g$hq:g	I
    //   147: invokevirtual 1509	org/vidogram/tgnet/NativeByteBuffer:a	(I)V
    //   150: aload 6
    //   152: aload_1
    //   153: getfield 976	org/vidogram/tgnet/g$hq:h	I
    //   156: invokevirtual 1509	org/vidogram/tgnet/NativeByteBuffer:a	(I)V
    //   159: aload 6
    //   161: aload_1
    //   162: getfield 919	org/vidogram/tgnet/g$hq:l	I
    //   165: invokevirtual 1509	org/vidogram/tgnet/NativeByteBuffer:a	(I)V
    //   168: aload 6
    //   170: aload_1
    //   171: getfield 2074	org/vidogram/tgnet/g$hq:j	I
    //   174: invokevirtual 1509	org/vidogram/tgnet/NativeByteBuffer:a	(I)V
    //   177: aload 6
    //   179: aload_1
    //   180: getfield 1925	org/vidogram/tgnet/g$hq:c	I
    //   183: invokevirtual 1509	org/vidogram/tgnet/NativeByteBuffer:a	(I)V
    //   186: aload_2
    //   187: aload 6
    //   189: invokevirtual 2077	org/vidogram/tgnet/g$aj:a	(Lorg/vidogram/tgnet/a;)V
    //   192: aload 6
    //   194: astore_2
    //   195: invokestatic 582	org/vidogram/messenger/w:a	()Lorg/vidogram/messenger/w;
    //   198: aload_2
    //   199: invokevirtual 1512	org/vidogram/messenger/w:a	(Lorg/vidogram/tgnet/NativeByteBuffer;)J
    //   202: lstore_3
    //   203: invokestatic 819	org/vidogram/tgnet/ConnectionsManager:a	()Lorg/vidogram/tgnet/ConnectionsManager;
    //   206: aload 8
    //   208: new 112	org/vidogram/messenger/v$50
    //   211: dup
    //   212: aload_0
    //   213: aload_1
    //   214: lload_3
    //   215: iload 5
    //   217: invokespecial 2080	org/vidogram/messenger/v$50:<init>	(Lorg/vidogram/messenger/v;Lorg/vidogram/tgnet/g$hq;JI)V
    //   220: invokevirtual 823	org/vidogram/tgnet/ConnectionsManager:a	(Lorg/vidogram/tgnet/f;Lorg/vidogram/tgnet/c;)I
    //   223: pop
    //   224: return
    //   225: aload_2
    //   226: astore 6
    //   228: goto -180 -> 48
    //   231: astore 6
    //   233: aconst_null
    //   234: astore_2
    //   235: ldc_w 700
    //   238: aload 6
    //   240: invokestatic 705	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   243: goto -48 -> 195
    //   246: goto -43 -> 203
    //   249: astore 7
    //   251: aload 6
    //   253: astore_2
    //   254: aload 7
    //   256: astore 6
    //   258: goto -23 -> 235
    //
    // Exception table:
    //   from	to	target	type
    //   92	108	231	java/lang/Exception
    //   108	192	249	java/lang/Exception
  }

  public void a(g.i parami, int paramInt, boolean paramBoolean)
  {
    g.fb localfb = new g.fb();
    localfb.e = a(parami);
    localfb.f = paramInt;
    if (!paramBoolean);
    for (paramBoolean = true; ; paramBoolean = false)
    {
      localfb.d = paramBoolean;
      ConnectionsManager.a().a(localfb, new org.vidogram.tgnet.c()
      {
      });
      return;
    }
  }

  // ERROR //
  protected void a(g.i parami, long paramLong)
  {
    // Byte code:
    //   0: aload_1
    //   1: instanceof 781
    //   4: ifeq +20 -> 24
    //   7: aload_0
    //   8: getfield 442	org/vidogram/messenger/v:at	Ljava/util/HashMap;
    //   11: aload_1
    //   12: getfield 790	org/vidogram/tgnet/g$i:h	I
    //   15: invokestatic 747	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   18: invokevirtual 1935	java/util/HashMap:containsKey	(Ljava/lang/Object;)Z
    //   21: ifeq +4 -> 25
    //   24: return
    //   25: aload_0
    //   26: getfield 442	org/vidogram/messenger/v:at	Ljava/util/HashMap;
    //   29: aload_1
    //   30: getfield 790	org/vidogram/tgnet/g$i:h	I
    //   33: invokestatic 747	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   36: iconst_1
    //   37: invokestatic 954	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   40: invokevirtual 1259	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   43: pop
    //   44: new 825	org/vidogram/tgnet/g$kw
    //   47: dup
    //   48: invokespecial 826	org/vidogram/tgnet/g$kw:<init>	()V
    //   51: astore 6
    //   53: aload 6
    //   55: aload_1
    //   56: getfield 790	org/vidogram/tgnet/g$i:h	I
    //   59: putfield 2091	org/vidogram/tgnet/g$kw:e	I
    //   62: aload 6
    //   64: aload_1
    //   65: getfield 795	org/vidogram/tgnet/g$i:u	J
    //   68: putfield 2092	org/vidogram/tgnet/g$kw:c	J
    //   71: new 1071	org/vidogram/tgnet/g$pz
    //   74: dup
    //   75: invokespecial 1072	org/vidogram/tgnet/g$pz:<init>	()V
    //   78: astore 8
    //   80: aload 8
    //   82: getfield 1076	org/vidogram/tgnet/g$pz:c	Ljava/util/ArrayList;
    //   85: aload 6
    //   87: invokevirtual 698	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   90: pop
    //   91: lload_2
    //   92: lstore 4
    //   94: lload_2
    //   95: lconst_0
    //   96: lcmp
    //   97: ifne +40 -> 137
    //   100: new 1506	org/vidogram/tgnet/NativeByteBuffer
    //   103: dup
    //   104: aload_1
    //   105: invokevirtual 2093	org/vidogram/tgnet/g$i:b	()I
    //   108: iconst_4
    //   109: iadd
    //   110: invokespecial 1508	org/vidogram/tgnet/NativeByteBuffer:<init>	(I)V
    //   113: astore 6
    //   115: aload 6
    //   117: iconst_0
    //   118: invokevirtual 1509	org/vidogram/tgnet/NativeByteBuffer:a	(I)V
    //   121: aload_1
    //   122: aload 6
    //   124: invokevirtual 2094	org/vidogram/tgnet/g$i:a	(Lorg/vidogram/tgnet/a;)V
    //   127: invokestatic 582	org/vidogram/messenger/w:a	()Lorg/vidogram/messenger/w;
    //   130: aload 6
    //   132: invokevirtual 1512	org/vidogram/messenger/w:a	(Lorg/vidogram/tgnet/NativeByteBuffer;)J
    //   135: lstore 4
    //   137: invokestatic 819	org/vidogram/tgnet/ConnectionsManager:a	()Lorg/vidogram/tgnet/ConnectionsManager;
    //   140: aload 8
    //   142: new 190	org/vidogram/messenger/v$83
    //   145: dup
    //   146: aload_0
    //   147: lload 4
    //   149: aload_1
    //   150: invokespecial 2097	org/vidogram/messenger/v$83:<init>	(Lorg/vidogram/messenger/v;JLorg/vidogram/tgnet/g$i;)V
    //   153: invokevirtual 823	org/vidogram/tgnet/ConnectionsManager:a	(Lorg/vidogram/tgnet/f;Lorg/vidogram/tgnet/c;)I
    //   156: pop
    //   157: return
    //   158: astore 7
    //   160: aconst_null
    //   161: astore 6
    //   163: ldc_w 700
    //   166: aload 7
    //   168: invokestatic 705	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   171: goto -44 -> 127
    //   174: astore 7
    //   176: goto -13 -> 163
    //
    // Exception table:
    //   from	to	target	type
    //   100	115	158	java/lang/Exception
    //   115	127	174	java/lang/Exception
  }

  public void a(g.i parami, g.vw paramvw, int paramInt)
  {
    if (paramInt == 0)
      w.a().a(parami.h, paramvw.d);
    g.eh localeh = new g.eh();
    localeh.c = a(parami);
    localeh.d = a(paramvw);
    ConnectionsManager.a().a(localeh, new org.vidogram.tgnet.c(parami, paramvw)
    {
    });
  }

  public void a(g.i parami, boolean paramBoolean)
  {
    if (parami == null);
    g.i locali;
    label147: 
    do
    {
      while (true)
      {
        return;
        locali = (g.i)this.ac.get(Integer.valueOf(parami.h));
        if (!parami.A)
          break label147;
        if (locali == null)
          break;
        if (paramBoolean)
          continue;
        locali.i = parami.i;
        locali.j = parami.j;
        locali.p = parami.p;
        locali.q = parami.q;
        locali.r = parami.r;
        locali.x = parami.x;
        if (parami.v != null)
        {
          locali.v = parami.v;
          locali.b |= 64;
          return;
        }
        locali.v = null;
        locali.b &= -65;
        return;
      }
      this.ac.put(Integer.valueOf(parami.h), parami);
      return;
      if (!paramBoolean)
      {
        if ((locali != null) && (parami.m != locali.m))
          this.aH.remove(Integer.valueOf(parami.h));
        this.ac.put(Integer.valueOf(parami.h), parami);
        return;
      }
      if (locali != null)
        continue;
      this.ac.put(Integer.valueOf(parami.h), parami);
      return;
    }
    while (!locali.A);
    parami.A = false;
    parami.i = locali.i;
    parami.j = locali.j;
    parami.p = locali.p;
    parami.q = locali.q;
    parami.r = locali.r;
    parami.x = locali.x;
    if (locali.v != null)
    {
      parami.v = locali.v;
      parami.b |= 64;
    }
    while (true)
    {
      this.ac.put(Integer.valueOf(parami.h), parami);
      return;
      parami.v = null;
      parami.b &= -65;
    }
  }

  public void a(g.q paramq)
  {
    g.qr localqr = new g.qr();
    localqr.c = new g.jn();
    localqr.c.b = paramq.b;
    localqr.c.c = paramq.c;
    localqr.d = false;
    ConnectionsManager.a().a(localqr, new org.vidogram.tgnet.c()
    {
    });
  }

  public void a(g.q paramq, boolean paramBoolean)
  {
    g.qs localqs = new g.qs();
    localqs.e = new g.jn();
    localqs.e.b = paramq.b;
    localqs.e.c = paramq.c;
    localqs.f = false;
    localqs.d = paramBoolean;
    ConnectionsManager.a().a(localqs, new org.vidogram.tgnet.c()
    {
    });
  }

  public void a(g.t paramt, boolean paramBoolean)
  {
    if (paramt == null)
      return;
    if (paramBoolean)
    {
      this.ad.putIfAbsent(Integer.valueOf(paramt.b), paramt);
      return;
    }
    this.ad.put(Integer.valueOf(paramt.b), paramt);
  }

  public void a(g.vw paramvw, int paramInt, boolean paramBoolean)
  {
    if ((paramvw == null) || (this.aC.contains(Integer.valueOf(paramvw.d))) || ((!paramBoolean) && (this.aD.contains(Integer.valueOf(paramvw.d)))))
      return;
    this.aC.add(Integer.valueOf(paramvw.d));
    g.vg localvg = new g.vg();
    localvg.c = a(paramvw);
    int i1 = ConnectionsManager.a().a(localvg, new org.vidogram.tgnet.c(paramvw, paramInt)
    {
    });
    ConnectionsManager.a().a(i1, paramInt);
  }

  public void a(g.vw paramvw, String paramString)
  {
    if (paramvw == null)
      return;
    g.rf localrf = new g.rf();
    localrf.c = a(paramvw);
    localrf.d = c(paramvw.d);
    localrf.f = paramString;
    localrf.e = Utilities.b.nextLong();
    ConnectionsManager.a().a(localrf, new org.vidogram.tgnet.c()
    {
    });
  }

  public void a(g.wd paramwd, ArrayList<g.t> paramArrayList)
  {
    Utilities.c.b(new Runnable(paramwd)
    {
      public void run()
      {
        HashMap localHashMap1 = new HashMap();
        HashMap localHashMap2 = new HashMap();
        Object localObject1 = new HashMap();
        HashMap localHashMap3 = new HashMap();
        HashMap localHashMap4 = new HashMap();
        int i = 0;
        Object localObject2;
        while (i < this.a.e.size())
        {
          localObject2 = (g.vw)this.a.e.get(i);
          ((HashMap)localObject1).put(Integer.valueOf(((g.vw)localObject2).d), localObject2);
          i += 1;
        }
        i = 0;
        while (i < this.a.d.size())
        {
          localObject2 = (g.i)this.a.d.get(i);
          localHashMap3.put(Integer.valueOf(((g.i)localObject2).h), localObject2);
          i += 1;
        }
        i = 0;
        Object localObject3;
        if (i < this.a.c.size())
        {
          localObject2 = (g.ar)this.a.c.get(i);
          if (((g.ar)localObject2).d.b != 0)
          {
            localObject3 = (g.i)localHashMap3.get(Integer.valueOf(((g.ar)localObject2).d.b));
            if ((localObject3 == null) || (!((g.i)localObject3).t))
              break label271;
          }
          while (true)
          {
            i += 1;
            break;
            if (((g.ar)localObject2).d.d != 0)
            {
              localObject3 = (g.i)localHashMap3.get(Integer.valueOf(((g.ar)localObject2).d.d));
              if ((localObject3 != null) && (((g.i)localObject3).B != null))
                continue;
            }
            label271: localObject2 = new u((g.ar)localObject2, (AbstractMap)localObject1, localHashMap3, false);
            localHashMap2.put(Long.valueOf(((u)localObject2).u()), localObject2);
          }
        }
        i = 0;
        if (i < this.a.b.size())
        {
          localObject3 = (g.hq)this.a.b.get(i);
          if (((g.hq)localObject3).m == 0L)
          {
            if (((g.hq)localObject3).d.c != 0)
              ((g.hq)localObject3).m = ((g.hq)localObject3).d.c;
          }
          else
          {
            label368: if (!g.a((g.hq)localObject3))
              break label471;
            localObject1 = (g.i)localHashMap3.get(Integer.valueOf(-(int)((g.hq)localObject3).m));
            if ((localObject1 == null) || (!((g.i)localObject1).t))
              break label510;
          }
          while (true)
          {
            i += 1;
            break;
            if (((g.hq)localObject3).d.d != 0)
            {
              ((g.hq)localObject3).m = (-((g.hq)localObject3).d.d);
              break label368;
            }
            if (((g.hq)localObject3).d.b == 0)
              break label368;
            ((g.hq)localObject3).m = (-((g.hq)localObject3).d.b);
            break label368;
            label471: if ((int)((g.hq)localObject3).m < 0)
            {
              localObject1 = (g.i)localHashMap3.get(Integer.valueOf(-(int)((g.hq)localObject3).m));
              if ((localObject1 != null) && (((g.i)localObject1).B != null))
                continue;
            }
            label510: if (((g.hq)localObject3).l == 0)
            {
              localObject1 = (u)localHashMap2.get(Long.valueOf(((g.hq)localObject3).m));
              if (localObject1 != null)
                ((g.hq)localObject3).l = ((u)localObject1).a.e;
            }
            localHashMap1.put(Long.valueOf(((g.hq)localObject3).m), localObject3);
            localHashMap4.put(Long.valueOf(((g.hq)localObject3).m), Integer.valueOf(((g.hq)localObject3).h));
            localObject2 = (Integer)v.this.e.get(Long.valueOf(((g.hq)localObject3).m));
            localObject1 = localObject2;
            if (localObject2 == null)
              localObject1 = Integer.valueOf(0);
            v.this.e.put(Long.valueOf(((g.hq)localObject3).m), Integer.valueOf(Math.max(((Integer)localObject1).intValue(), ((g.hq)localObject3).f)));
            localObject2 = (Integer)v.this.f.get(Long.valueOf(((g.hq)localObject3).m));
            localObject1 = localObject2;
            if (localObject2 == null)
              localObject1 = Integer.valueOf(0);
            v.this.f.put(Long.valueOf(((g.hq)localObject3).m), Integer.valueOf(Math.max(((Integer)localObject1).intValue(), ((g.hq)localObject3).g)));
          }
        }
        a.a(new Runnable(localHashMap1, localHashMap2, localHashMap4)
        {
          public void run()
          {
            v.this.a(v.51.this.a.e, true);
            v.this.b(v.51.this.a.d, true);
            Iterator localIterator = this.a.entrySet().iterator();
            while (localIterator.hasNext())
            {
              Object localObject1 = (Map.Entry)localIterator.next();
              Long localLong = (Long)((Map.Entry)localObject1).getKey();
              localObject1 = (g.hq)((Map.Entry)localObject1).getValue();
              Object localObject3 = (g.hq)v.this.g.get(localLong);
              if (localObject3 == null)
              {
                localObject2 = v.this;
                ((v)localObject2).d += 1;
                v.this.g.put(localLong, localObject1);
                localObject1 = (u)this.b.get(Long.valueOf(((g.hq)localObject1).m));
                v.this.h.put(localLong, localObject1);
                if ((localObject1 == null) || (((u)localObject1).a.d.b != 0))
                  continue;
                v.this.j.put(Integer.valueOf(((u)localObject1).q()), localObject1);
                if (((u)localObject1).a.C == 0L)
                  continue;
                v.this.i.put(Long.valueOf(((u)localObject1).a.C), localObject1);
                continue;
              }
              ((g.hq)localObject3).h = ((g.hq)localObject1).h;
              Object localObject2 = (u)v.this.h.get(localLong);
              if ((localObject2 == null) || (((g.hq)localObject3).e > 0))
              {
                if (((localObject2 == null) || (!((u)localObject2).j)) && (((g.hq)localObject1).e <= ((g.hq)localObject3).e))
                  continue;
                v.this.g.put(localLong, localObject1);
                localObject3 = (u)this.b.get(Long.valueOf(((g.hq)localObject1).m));
                v.this.h.put(localLong, localObject3);
                if ((localObject3 != null) && (((u)localObject3).a.d.b == 0))
                {
                  v.this.j.put(Integer.valueOf(((u)localObject3).q()), localObject3);
                  if (((u)localObject3).a.C != 0L)
                    v.this.i.put(Long.valueOf(((u)localObject3).a.C), localObject3);
                }
                if (localObject2 != null)
                {
                  v.this.j.remove(Integer.valueOf(((u)localObject2).q()));
                  if (((u)localObject2).a.C != 0L)
                    v.this.i.remove(Long.valueOf(((u)localObject2).a.C));
                }
                if (localObject3 != null)
                  continue;
                v.this.a((g.hq)localObject1, null, 0L);
                continue;
              }
              localObject3 = (u)this.b.get(Long.valueOf(((g.hq)localObject1).m));
              if ((!((u)localObject2).j) && (localObject3 != null) && (((u)localObject3).a.e <= ((u)localObject2).a.e))
                continue;
              v.this.g.put(localLong, localObject1);
              v.this.h.put(localLong, localObject3);
              if ((localObject3 != null) && (((u)localObject3).a.d.b == 0))
              {
                v.this.j.put(Integer.valueOf(((u)localObject3).q()), localObject3);
                if (((u)localObject3).a.C != 0L)
                  v.this.i.put(Long.valueOf(((u)localObject3).a.C), localObject3);
              }
              v.this.j.remove(Integer.valueOf(((u)localObject2).q()));
              if (((u)localObject2).a.C == 0L)
                continue;
              v.this.i.remove(Long.valueOf(((u)localObject2).a.C));
            }
            v.this.a.clear();
            v.this.a.addAll(v.this.g.values());
            v.this.b(null);
            y.a().a(y.c, new Object[0]);
            z.a().a(this.c);
          }
        });
      }
    });
  }

  public void a(g.wd paramwd, ArrayList<g.t> paramArrayList, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean1, boolean paramBoolean2)
  {
    Utilities.c.b(new Runnable(paramInt3, paramwd, paramBoolean1, paramInt2, paramInt1, paramArrayList, paramBoolean2)
    {
      public void run()
      {
        n.a("tmessages", "loaded loadType " + this.a + " count " + this.b.b.size());
        if ((this.a == 1) && (this.b.b.size() == 0))
        {
          a.a(new Runnable()
          {
            public void run()
            {
              v.this.a(v.48.this.b.e, true);
              v.this.r = false;
              if (v.48.this.c)
                v.this.s = false;
              y.a().a(y.c, new Object[0]);
              v.this.b(0, v.48.this.d, false);
            }
          });
          return;
        }
        HashMap localHashMap1 = new HashMap();
        HashMap localHashMap2 = new HashMap();
        HashMap localHashMap4 = new HashMap();
        HashMap localHashMap3 = new HashMap();
        int i = 0;
        Object localObject1;
        while (i < this.b.e.size())
        {
          localObject1 = (g.vw)this.b.e.get(i);
          localHashMap4.put(Integer.valueOf(((g.vw)localObject1).d), localObject1);
          i += 1;
        }
        i = 0;
        while (i < this.b.d.size())
        {
          localObject1 = (g.i)this.b.d.get(i);
          localHashMap3.put(Integer.valueOf(((g.i)localObject1).h), localObject1);
          i += 1;
        }
        if (this.a == 1)
          v.this.d = (this.e + this.d);
        i = 0;
        Object localObject2;
        if (i < this.b.c.size())
        {
          localObject1 = (g.ar)this.b.c.get(i);
          if (((g.ar)localObject1).d.b != 0)
          {
            localObject2 = (g.i)localHashMap3.get(Integer.valueOf(((g.ar)localObject1).d.b));
            if ((localObject2 == null) || (!((g.i)localObject2).t));
          }
          while (true)
          {
            i += 1;
            break;
            if ((localObject2 != null) && (((g.i)localObject2).r))
              ((g.ar)localObject1).k |= -2147483648;
            do
            {
              do
              {
                if ((this.a != 1) && (((g.ar)localObject1).v) && (!((g.ar)localObject1).n))
                  ((g.ar)localObject1).m = true;
                localObject1 = new u((g.ar)localObject1, localHashMap4, localHashMap3, false);
                localHashMap2.put(Long.valueOf(((u)localObject1).u()), localObject1);
                break;
              }
              while (((g.ar)localObject1).d.d == 0);
              localObject2 = (g.i)localHashMap3.get(Integer.valueOf(((g.ar)localObject1).d.d));
            }
            while ((localObject2 == null) || (((g.i)localObject2).B == null));
          }
        }
        ArrayList localArrayList = new ArrayList();
        int j = 0;
        Object localObject3;
        if (j < this.b.b.size())
        {
          localObject3 = (g.hq)this.b.b.get(j);
          if ((((g.hq)localObject3).m == 0L) && (((g.hq)localObject3).d != null))
          {
            if (((g.hq)localObject3).d.c != 0)
              ((g.hq)localObject3).m = ((g.hq)localObject3).d.c;
          }
          else
            label555: if (((g.hq)localObject3).m != 0L)
              break label630;
          while (true)
          {
            j += 1;
            break;
            if (((g.hq)localObject3).d.d != 0)
            {
              ((g.hq)localObject3).m = (-((g.hq)localObject3).d.d);
              break label555;
            }
            if (((g.hq)localObject3).d.b == 0)
              break label555;
            ((g.hq)localObject3).m = (-((g.hq)localObject3).d.b);
            break label555;
            label630: if (((g.hq)localObject3).l == 0)
            {
              localObject1 = (u)localHashMap2.get(Long.valueOf(((g.hq)localObject3).m));
              if (localObject1 != null)
                ((g.hq)localObject3).l = ((u)localObject1).a.e;
            }
            i = 1;
            int m = 1;
            int k = 1;
            if (g.a((g.hq)localObject3))
            {
              localObject1 = (g.i)localHashMap3.get(Integer.valueOf(-(int)((g.hq)localObject3).m));
              if (localObject1 != null)
              {
                i = k;
                if (!((g.i)localObject1).r)
                  i = 0;
                if (((g.i)localObject1).t)
                  continue;
              }
              v.i(v.this).put(Integer.valueOf(-(int)((g.hq)localObject3).m), Integer.valueOf(((g.hq)localObject3).j));
            }
            do
            {
              do
              {
                do
                {
                  localHashMap1.put(Long.valueOf(((g.hq)localObject3).m), localObject3);
                  if ((i != 0) && (this.a == 1) && ((((g.hq)localObject3).g == 0) || (((g.hq)localObject3).f == 0)) && (((g.hq)localObject3).e != 0))
                    localArrayList.add(localObject3);
                  localObject2 = (Integer)v.this.e.get(Long.valueOf(((g.hq)localObject3).m));
                  localObject1 = localObject2;
                  if (localObject2 == null)
                    localObject1 = Integer.valueOf(0);
                  v.this.e.put(Long.valueOf(((g.hq)localObject3).m), Integer.valueOf(Math.max(((Integer)localObject1).intValue(), ((g.hq)localObject3).f)));
                  localObject2 = (Integer)v.this.f.get(Long.valueOf(((g.hq)localObject3).m));
                  localObject1 = localObject2;
                  if (localObject2 == null)
                    localObject1 = Integer.valueOf(0);
                  v.this.f.put(Long.valueOf(((g.hq)localObject3).m), Integer.valueOf(Math.max(((Integer)localObject1).intValue(), ((g.hq)localObject3).g)));
                  break;
                  i = m;
                }
                while ((int)((g.hq)localObject3).m >= 0);
                localObject1 = (g.i)localHashMap3.get(Integer.valueOf(-(int)((g.hq)localObject3).m));
                i = m;
              }
              while (localObject1 == null);
              i = m;
            }
            while (((g.i)localObject1).B == null);
          }
        }
        if (this.a != 1)
        {
          p.a(this.b.c);
          i = 0;
          while (i < this.b.c.size())
          {
            g.ar localar = (g.ar)this.b.c.get(i);
            if ((localar.f instanceof g.mn))
            {
              localObject1 = (g.vw)localHashMap4.get(Integer.valueOf(localar.f.i));
              if ((localObject1 != null) && (((g.vw)localObject1).r))
                localar.r = new g.sh();
            }
            if (((localar.f instanceof g.mr)) || ((localar.f instanceof g.mh)))
            {
              localar.o = false;
              localar.m = false;
              i += 1;
              continue;
            }
            if (localar.n)
            {
              localObject1 = v.this.f;
              label1191: localObject3 = (Integer)((ConcurrentHashMap)localObject1).get(Long.valueOf(localar.E));
              localObject2 = localObject3;
              if (localObject3 == null)
              {
                localObject2 = Integer.valueOf(w.a().a(localar.n, localar.E));
                ((ConcurrentHashMap)localObject1).put(Long.valueOf(localar.E), localObject2);
              }
              if (((Integer)localObject2).intValue() >= localar.b)
                break label1293;
            }
            label1293: for (boolean bool = true; ; bool = false)
            {
              localar.o = bool;
              break;
              localObject1 = v.this.e;
              break label1191;
            }
          }
          w.a().a(this.b);
        }
        if (this.a == 2)
        {
          localObject1 = (g.i)this.b.d.get(0);
          v.b(v.this, ((g.i)localObject1).h);
          v.this.j(((g.i)localObject1).h);
        }
        a.a(new Runnable(localHashMap1, localHashMap2, localHashMap3, localArrayList)
        {
          public void run()
          {
            if (v.48.this.a != 1)
            {
              v.b(v.this, v.48.this.b.b);
              if (!ad.t)
                b.a();
            }
            Object localObject1 = v.this;
            Object localObject2 = v.48.this.b.e;
            if (v.48.this.a == 1)
            {
              bool = true;
              ((v)localObject1).a((ArrayList)localObject2, bool);
              localObject1 = v.this;
              localObject2 = v.48.this.b.d;
              if (v.48.this.a != 1)
                break label221;
            }
            int i;
            label221: for (boolean bool = true; ; bool = false)
            {
              ((v)localObject1).b((ArrayList)localObject2, bool);
              if (v.48.this.f == null)
                break label226;
              i = 0;
              while (i < v.48.this.f.size())
              {
                localObject1 = (g.t)v.48.this.f.get(i);
                if (((localObject1 instanceof g.im)) && (a.b(((g.t)localObject1).o) < 46))
                  ab.a().b((g.t)localObject1, null);
                v.this.a((g.t)localObject1, true);
                i += 1;
              }
              bool = false;
              break;
            }
            label226: if (!v.48.this.g)
              v.this.r = false;
            int j;
            if ((v.48.this.g) && (!v.this.a.isEmpty()))
            {
              j = ((g.hq)v.this.a.get(v.this.a.size() - 1)).l;
              localObject1 = this.a.entrySet().iterator();
              i = 0;
            }
            label324: 
            while (((Iterator)localObject1).hasNext())
            {
              Object localObject3 = (Map.Entry)((Iterator)localObject1).next();
              localObject2 = (Long)((Map.Entry)localObject3).getKey();
              Object localObject4 = (g.hq)((Map.Entry)localObject3).getValue();
              if ((v.48.this.g) && (j != 0) && (((g.hq)localObject4).l < j))
                continue;
              Object localObject5 = (g.hq)v.this.g.get(localObject2);
              if ((v.48.this.a != 1) && ((((g.hq)localObject4).k instanceof g.ik)))
                b.a(((g.hq)localObject4).m, ((g.hq)localObject4).k, null, false);
              if (localObject5 == null)
              {
                v.this.g.put(localObject2, localObject4);
                localObject3 = (u)this.b.get(Long.valueOf(((g.hq)localObject4).m));
                v.this.h.put(localObject2, localObject3);
                if ((localObject3 != null) && (((u)localObject3).a.d.b == 0))
                {
                  v.this.j.put(Integer.valueOf(((u)localObject3).q()), localObject3);
                  if (((u)localObject3).a.C != 0L)
                    v.this.i.put(Long.valueOf(((u)localObject3).a.C), localObject3);
                }
                i = 1;
              }
              while (true)
              {
                break label324;
                j = 0;
                break;
                if (v.48.this.a != 1)
                  ((g.hq)localObject5).i = ((g.hq)localObject4).i;
                localObject3 = (u)v.this.h.get(localObject2);
                if (((localObject3 != null) && (((u)localObject3).j)) || (localObject3 == null) || (((g.hq)localObject5).e > 0))
                {
                  if (((g.hq)localObject4).e >= ((g.hq)localObject5).e)
                  {
                    v.this.g.put(localObject2, localObject4);
                    localObject4 = (u)this.b.get(Long.valueOf(((g.hq)localObject4).m));
                    v.this.h.put(localObject2, localObject4);
                    if ((localObject4 != null) && (((u)localObject4).a.d.b == 0))
                    {
                      v.this.j.put(Integer.valueOf(((u)localObject4).q()), localObject4);
                      if ((localObject4 != null) && (((u)localObject4).a.C != 0L))
                        v.this.i.put(Long.valueOf(((u)localObject4).a.C), localObject4);
                    }
                    if (localObject3 != null)
                    {
                      v.this.j.remove(Integer.valueOf(((u)localObject3).q()));
                      if (((u)localObject3).a.C != 0L)
                        v.this.i.remove(Long.valueOf(((u)localObject3).a.C));
                    }
                    continue;
                  }
                }
                else
                {
                  localObject5 = (u)this.b.get(Long.valueOf(((g.hq)localObject4).m));
                  if ((((u)localObject3).j) || (localObject5 == null) || (((u)localObject5).a.e > ((u)localObject3).a.e))
                  {
                    v.this.g.put(localObject2, localObject4);
                    v.this.h.put(localObject2, localObject5);
                    if ((localObject5 != null) && (((u)localObject5).a.d.b == 0))
                    {
                      v.this.j.put(Integer.valueOf(((u)localObject5).q()), localObject5);
                      if ((localObject5 != null) && (((u)localObject5).a.C != 0L))
                        v.this.i.put(Long.valueOf(((u)localObject5).a.C), localObject5);
                    }
                    v.this.j.remove(Integer.valueOf(((u)localObject3).q()));
                    if (((u)localObject3).a.C != 0L)
                      v.this.i.remove(Long.valueOf(((u)localObject3).a.C));
                  }
                }
              }
            }
            v.this.a.clear();
            v.this.a.addAll(v.this.g.values());
            localObject2 = v.this;
            if (v.48.this.g)
            {
              localObject1 = this.c;
              ((v)localObject2).b((HashMap)localObject1);
              if ((v.48.this.a != 2) && (!v.48.this.g))
              {
                localObject1 = v.this;
                if (((v.48.this.b.b.size() != 0) && (v.48.this.b.b.size() == v.48.this.d)) || (v.48.this.a != 0))
                  break label1416;
                bool = true;
                label1288: ((v)localObject1).s = bool;
              }
              y.a().a(y.c, new Object[0]);
              if (!v.48.this.g)
                break label1421;
              ad.u = v.48.this.e;
              ad.a(false);
              v.c(v.this, false);
              y.a().a(y.aa, new Object[0]);
            }
            while (true)
            {
              v.a(v.this, ad.u, ad.v, ad.w, ad.x, ad.y, ad.z);
              if (!this.d.isEmpty())
                v.b(v.this, this.d, 0L);
              return;
              localObject1 = null;
              break;
              label1416: bool = false;
              break label1288;
              label1421: v.this.g();
              if ((i != 0) || (v.48.this.a != 1))
                continue;
              v.this.b(0, v.48.this.d, false);
            }
          }
        });
      }
    });
  }

  public void a(g.we paramwe, long paramLong, int paramInt1, int paramInt2, boolean paramBoolean1, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, boolean paramBoolean2, boolean paramBoolean3, int paramInt9, boolean paramBoolean4)
  {
    n.a("tmessages", "processLoadedMessages size " + paramwe.c.size() + " in chat " + paramLong + " count " + paramInt1 + " max_id " + paramInt2 + " cache " + paramBoolean1 + " guid " + paramInt3 + " load_type " + paramInt8 + " last_message_id " + paramInt5 + " isChannel " + paramBoolean2 + " index " + paramInt9 + " firstUnread " + paramInt4 + " underad count " + paramInt6 + " last_date " + paramInt7 + " queryFromServer " + paramBoolean4);
    Utilities.c.b(new Runnable(paramwe, paramLong, paramBoolean1, paramInt1, paramInt8, paramBoolean4, paramInt4, paramInt2, paramInt3, paramInt5, paramBoolean2, paramInt9, paramInt6, paramInt7, paramBoolean3)
    {
      public void run()
      {
        int i2;
        boolean bool1;
        int i1;
        label120: Object localObject1;
        boolean bool3;
        boolean bool2;
        if ((this.a instanceof g.oy))
        {
          i2 = -(int)this.b;
          if (((Integer)v.i(v.this).get(Integer.valueOf(i2)) == null) && (Integer.valueOf(w.a().g(i2)).intValue() == 0))
          {
            v.i(v.this).put(Integer.valueOf(i2), Integer.valueOf(this.a.g));
            if ((v.k(v.this).indexOfKey(i2) >= 0) && (v.j(v.this).indexOfKey(i2) < 0))
            {
              v.this.a(i2, 2, 0L);
              bool1 = true;
              i1 = 0;
              if (i1 >= this.a.d.size())
                break label1123;
              localObject1 = (g.i)this.a.d.get(i1);
              if (((g.i)localObject1).h != i2)
                break label258;
              bool3 = ((g.i)localObject1).r;
              bool2 = bool1;
              bool1 = bool3;
            }
          }
        }
        while (true)
        {
          i1 = (int)this.b;
          i2 = (int)(this.b >> 32);
          if (!this.c)
            p.a(this.a.c);
          if ((i2 != 1) && (i1 != 0) && (this.c) && (this.a.c.size() == 0))
          {
            a.a(new Runnable()
            {
              public void run()
              {
                v localv = v.this;
                long l = v.45.this.b;
                int j = v.45.this.d;
                if ((v.45.this.e == 2) && (v.45.this.f));
                for (int i = v.45.this.g; ; i = v.45.this.h)
                {
                  localv.a(l, j, i, false, 0, v.45.this.i, v.45.this.e, v.45.this.j, v.45.this.k, v.45.this.l, v.45.this.g, v.45.this.m, v.45.this.n, v.45.this.f);
                  return;
                }
              }
            });
            return;
            v.b(v.this, i2);
            bool1 = true;
            break;
            label258: i1 += 1;
            break label120;
          }
          HashMap localHashMap1 = new HashMap();
          HashMap localHashMap2 = new HashMap();
          i1 = 0;
          while (i1 < this.a.e.size())
          {
            localObject1 = (g.vw)this.a.e.get(i1);
            localHashMap1.put(Integer.valueOf(((g.vw)localObject1).d), localObject1);
            i1 += 1;
          }
          i1 = 0;
          while (i1 < this.a.d.size())
          {
            localObject1 = (g.i)this.a.d.get(i1);
            localHashMap2.put(Integer.valueOf(((g.i)localObject1).h), localObject1);
            i1 += 1;
          }
          i2 = this.a.c.size();
          Object localObject2;
          if (!this.c)
          {
            localObject2 = (Integer)v.this.e.get(Long.valueOf(this.b));
            localObject1 = localObject2;
            if (localObject2 == null)
            {
              localObject1 = Integer.valueOf(w.a().a(true, this.b));
              v.this.e.put(Long.valueOf(this.b), localObject1);
            }
            localObject3 = (Integer)v.this.f.get(Long.valueOf(this.b));
            localObject2 = localObject3;
            if (localObject3 == null)
            {
              localObject2 = Integer.valueOf(w.a().a(true, this.b));
              v.this.f.put(Long.valueOf(this.b), localObject2);
            }
            i1 = 0;
            while (i1 < i2)
            {
              localObject4 = (g.ar)this.a.c.get(i1);
              if ((!this.c) && (((g.ar)localObject4).v) && (!((g.ar)localObject4).n))
                ((g.ar)localObject4).m = true;
              if (bool1)
                ((g.ar)localObject4).k |= -2147483648;
              if ((((g.ar)localObject4).f instanceof g.mn))
              {
                localObject3 = (g.vw)localHashMap1.get(Integer.valueOf(((g.ar)localObject4).f.i));
                if ((localObject3 != null) && (((g.vw)localObject3).r))
                  ((g.ar)localObject4).r = new g.sh();
              }
              if (((((g.ar)localObject4).f instanceof g.mr)) || ((((g.ar)localObject4).f instanceof g.mh)))
              {
                ((g.ar)localObject4).o = false;
                ((g.ar)localObject4).m = false;
                i1 += 1;
                continue;
              }
              if (((g.ar)localObject4).n)
              {
                localObject3 = localObject2;
                label724: if (((Integer)localObject3).intValue() >= ((g.ar)localObject4).b)
                  break label757;
              }
              label757: for (bool3 = true; ; bool3 = false)
              {
                ((g.ar)localObject4).o = bool3;
                break;
                localObject3 = localObject1;
                break label724;
              }
            }
            w.a().a(this.a, this.b, this.e, this.h, bool2);
          }
          Object localObject3 = new ArrayList();
          Object localObject4 = new ArrayList();
          HashMap localHashMap3 = new HashMap();
          i1 = 0;
          if (i1 < i2)
          {
            g.ar localar = (g.ar)this.a.c.get(i1);
            localar.E = this.b;
            u localu = new u(localar, localHashMap1, localHashMap2, true);
            ((ArrayList)localObject3).add(localu);
            if (this.c)
            {
              if (!(localar.j instanceof g.od))
                break label960;
              if ((localar.j.b != null) && ((localar.j.b.length == 0) || ((localar.j.b.length == 1) && (localar.j.b[0] < 57))))
                ((ArrayList)localObject4).add(Integer.valueOf(localar.b));
            }
            while (true)
            {
              i1 += 1;
              break;
              label960: if (!(localar.j instanceof g.oi))
                continue;
              if (((localar.j.r instanceof g.vr)) && (localar.j.r.r <= ConnectionsManager.a().b()))
              {
                ((ArrayList)localObject4).add(Integer.valueOf(localar.b));
                continue;
              }
              if (!(localar.j.r instanceof g.vs))
                continue;
              localObject2 = (ArrayList)localHashMap3.get(localar.j.r.e);
              localObject1 = localObject2;
              if (localObject2 == null)
              {
                localObject1 = new ArrayList();
                localHashMap3.put(localar.j.r.e, localObject1);
              }
              ((ArrayList)localObject1).add(localu);
            }
          }
          a.a(new Runnable((ArrayList)localObject3, (ArrayList)localObject4, localHashMap3)
          {
            public void run()
            {
              v.this.a(v.45.this.a.e, v.45.this.c);
              v.this.b(v.45.this.a.d, v.45.this.c);
              int j;
              int i;
              if ((v.45.this.f) && (v.45.this.e == 2))
              {
                j = 0;
                int k;
                for (i = 2147483647; j < v.45.this.a.c.size(); i = k)
                {
                  g.ar localar = (g.ar)v.45.this.a.c.get(j);
                  k = i;
                  if (!localar.n)
                  {
                    k = i;
                    if (localar.b > v.45.this.g)
                    {
                      k = i;
                      if (localar.b < i)
                        k = localar.b;
                    }
                  }
                  j += 1;
                }
              }
              while (true)
              {
                j = i;
                if (i == 2147483647)
                  j = v.45.this.g;
                y.a().a(y.g, new Object[] { Long.valueOf(v.45.this.b), Integer.valueOf(v.45.this.d), this.a, Boolean.valueOf(v.45.this.c), Integer.valueOf(j), Integer.valueOf(v.45.this.j), Integer.valueOf(v.45.this.m), Integer.valueOf(v.45.this.n), Integer.valueOf(v.45.this.e), Boolean.valueOf(v.45.this.o), Integer.valueOf(v.45.this.i), Integer.valueOf(v.45.this.l) });
                if (!this.b.isEmpty())
                  v.a(v.this, this.b, v.45.this.b);
                if (!this.c.isEmpty())
                  v.this.a(v.45.this.b, this.c);
                return;
                i = 2147483647;
              }
            }
          });
          return;
          label1123: bool3 = false;
          bool2 = bool1;
          bool1 = bool3;
          continue;
          bool1 = false;
          break;
          bool1 = false;
          bool2 = false;
        }
      }
    });
  }

  public void a(g.wf paramwf, int paramInt1, int paramInt2, int paramInt3, long paramLong, boolean paramBoolean, int paramInt4)
  {
    if (!paramBoolean)
    {
      w.a().a(paramwf.c, null, true, true);
      w.a().a(paramInt1, paramwf);
    }
    do
    {
      a.a(new Runnable(paramwf, paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4)
      {
        public void run()
        {
          v.this.a(this.a.c, this.b);
          y.a().a(y.u, new Object[] { Integer.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.e), Boolean.valueOf(this.b), Integer.valueOf(this.f), this.a.b });
        }
      });
      return;
    }
    while ((paramwf != null) && (!paramwf.b.isEmpty()));
    a(paramInt1, paramInt2, paramInt3, paramLong, false, paramInt4);
  }

  public void a(boolean paramBoolean)
  {
    if ((!ad.b()) || (this.p))
      return;
    this.p = true;
    if (paramBoolean)
    {
      w.a().g();
      return;
    }
    g.fz localfz = new g.fz();
    localfz.c = 0;
    localfz.d = 200;
    ConnectionsManager.a().a(localfz, new org.vidogram.tgnet.c()
    {
    });
  }

  public boolean a(long paramLong)
  {
    SharedPreferences localSharedPreferences = ApplicationLoader.a.getSharedPreferences("Notifications", 0);
    int i1 = localSharedPreferences.getInt("notify2_" + paramLong, 0);
    if (i1 == 2);
    do
      return true;
    while ((i1 == 3) && (localSharedPreferences.getInt("notifyuntil_" + paramLong, 0) >= ConnectionsManager.a().b()));
    return false;
  }

  public boolean a(g.vw paramvw, boolean paramBoolean)
  {
    if (paramvw == null);
    g.vw localvw;
    label206: label228: label249: 
    do
    {
      while (true)
      {
        return false;
        int i1;
        if ((paramBoolean) && (paramvw.d / 1000 != 333) && (paramvw.d != 777000))
        {
          i1 = 1;
          localvw = (g.vw)this.ae.get(Integer.valueOf(paramvw.d));
          if ((localvw != null) && (localvw.g != null) && (localvw.g.length() > 0))
            this.af.remove(localvw.g);
          if ((paramvw.g != null) && (paramvw.g.length() > 0))
            this.af.put(paramvw.g.toLowerCase(), paramvw);
          if (!paramvw.y)
            break label303;
          if (localvw == null)
            break label249;
          if (i1 != 0)
            continue;
          if (paramvw.g == null)
            break label206;
          localvw.g = paramvw.g;
          localvw.m |= 8;
        }
        while (true)
        {
          if (paramvw.j == null)
            break label228;
          localvw.j = paramvw.j;
          localvw.m |= 32;
          return false;
          i1 = 0;
          break;
          localvw.g = null;
          localvw.m &= -9;
        }
        localvw.j = null;
        localvw.m &= -33;
        return false;
        this.ae.put(Integer.valueOf(paramvw.d), paramvw);
        this.L.put(paramvw.d + "", b(paramvw));
        return false;
        if (i1 != 0)
          break;
        this.ae.put(Integer.valueOf(paramvw.d), paramvw);
        this.L.put(paramvw.d + "", b(paramvw));
        if (paramvw.d == ad.c())
        {
          ad.a(paramvw);
          ad.a(true);
        }
        if ((localvw != null) && (paramvw.k != null) && (localvw.k != null) && (paramvw.k.c != localvw.k.c))
          return true;
      }
      if (localvw != null)
        continue;
      this.ae.put(Integer.valueOf(paramvw.d), paramvw);
      this.L.put(paramvw.d + "", b(paramvw));
      return false;
    }
    while (!localvw.y);
    label303: paramvw.y = false;
    if (localvw.g != null)
    {
      paramvw.g = localvw.g;
      paramvw.m |= 8;
      if (localvw.j == null)
        break label618;
      paramvw.j = localvw.j;
      paramvw.m |= 32;
    }
    while (true)
    {
      this.ae.put(Integer.valueOf(paramvw.d), paramvw);
      this.L.put(paramvw.d + "", b(paramvw));
      return false;
      paramvw.g = null;
      paramvw.m &= -9;
      break;
      label618: paramvw.j = null;
      paramvw.m &= -33;
    }
  }

  public String b(g.vw paramvw)
  {
    String str1 = "";
    if (paramvw.e != null)
      str1 = "" + paramvw.e + " ";
    String str2 = str1;
    if (paramvw.f != null)
      str2 = str1 + paramvw.f;
    return str2;
  }

  public g.i b(Integer paramInteger)
  {
    return (g.i)this.ac.get(paramInteger);
  }

  public void b()
  {
    g.uq localuq = new g.uq();
    localuq.i = "333";
    localuq.d = 333000;
    localuq.e = "Telegram";
    localuq.f = "";
    localuq.k = null;
    localuq.j = new g.us();
    a(localuq, true);
    localuq = new g.uq();
    localuq.i = "42777";
    localuq.d = 777000;
    localuq.e = "Telegram";
    localuq.f = "Notifications";
    localuq.k = null;
    localuq.j = new g.us();
    a(localuq, true);
  }

  public void b(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    int i2 = 0;
    if (this.r)
      return;
    this.r = true;
    y.a().a(y.c, new Object[0]);
    n.a("tmessages", "load cacheOffset = " + paramInt1 + " count = " + paramInt2 + " cache = " + paramBoolean);
    if (paramBoolean)
    {
      localObject1 = w.a();
      if (paramInt1 == 0);
      for (paramInt1 = 0; ; paramInt1 = this.d)
      {
        ((w)localObject1).c(paramInt1, paramInt2);
        return;
      }
    }
    Object localObject1 = new g.pr();
    ((g.pr)localObject1).f = paramInt2;
    paramInt1 = this.a.size() - 1;
    while (true)
    {
      int i1 = i2;
      Object localObject2;
      if (paramInt1 >= 0)
      {
        localObject2 = (g.hq)this.a.get(paramInt1);
        i1 = (int)((g.hq)localObject2).m;
        int i3 = (int)(((g.hq)localObject2).m >> 32);
        if ((i1 == 0) || (i3 == 1) || (((g.hq)localObject2).e <= 0))
          break label369;
        localObject2 = (u)this.h.get(Long.valueOf(((g.hq)localObject2).m));
        if ((localObject2 == null) || (((u)localObject2).q() <= 0))
          break label369;
        ((g.pr)localObject1).c = ((u)localObject2).a.e;
        ((g.pr)localObject1).d = ((u)localObject2).a.b;
        if (((u)localObject2).a.d.b == 0)
          break label324;
        paramInt1 = -((u)localObject2).a.d.b;
      }
      while (true)
      {
        ((g.pr)localObject1).e = c(paramInt1);
        i1 = 1;
        if (i1 == 0)
          ((g.pr)localObject1).e = new g.ky();
        ConnectionsManager.a().a((org.vidogram.tgnet.f)localObject1, new org.vidogram.tgnet.c(paramInt2)
        {
        });
        return;
        label324: if (((u)localObject2).a.d.d != 0)
        {
          paramInt1 = -((u)localObject2).a.d.d;
          continue;
        }
        paramInt1 = ((u)localObject2).a.d.c;
      }
      label369: paramInt1 -= 1;
    }
  }

  public void b(int paramInt, String paramString)
  {
    if (paramInt > 0)
    {
      if (e.a(paramInt))
      {
        localObject = new g.el();
        ((g.el)localObject).c = b(paramInt);
        ((g.el)localObject).d = paramString;
      }
      for (paramString = (String)localObject; ; paramString = (String)localObject)
      {
        ConnectionsManager.a().a(paramString, new org.vidogram.tgnet.c()
        {
        }
        , 64);
        return;
        localObject = new g.ph();
        ((g.ph)localObject).c = paramInt;
        ((g.ph)localObject).d = paramString;
      }
    }
    Object localObject = b(Integer.valueOf(paramInt));
    ((g.i)localObject).i = paramString;
    paramString = new ArrayList();
    paramString.add(localObject);
    w.a().a(null, paramString, true, true);
    y.a().a(y.c, new Object[0]);
    y.a().a(y.b, new Object[] { Integer.valueOf(16) });
  }

  public void b(int paramInt, boolean paramBoolean)
  {
    g.fa localfa = new g.fa();
    localfa.c = b(paramInt);
    localfa.d = paramBoolean;
    ConnectionsManager.a().a(localfa, new org.vidogram.tgnet.c()
    {
    }
    , 64);
  }

  public void b(long paramLong, g.vw paramvw, g.i parami)
  {
    if ((paramvw == null) && (parami == null))
      return;
    Object localObject = ApplicationLoader.a.getSharedPreferences("Notifications", 0).edit();
    ((SharedPreferences.Editor)localObject).putInt("spam3_" + paramLong, 1);
    ((SharedPreferences.Editor)localObject).commit();
    localObject = new g.qp();
    if (parami != null)
      ((g.qp)localObject).c = c(-parami.h);
    while (true)
    {
      ConnectionsManager.a().a((org.vidogram.tgnet.f)localObject, new org.vidogram.tgnet.c()
      {
      }
      , 2);
      return;
      if (paramvw == null)
        continue;
      ((g.qp)localObject).c = c(paramvw.d);
    }
  }

  public void b(String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0) || (this.w) || (ad.c() == 0));
    do
      return;
    while ((ad.a) && (paramString.equals(ad.b)));
    this.w = true;
    g.bu localbu = new g.bu();
    localbu.c = 2;
    localbu.d = paramString;
    ConnectionsManager.a().a(localbu, new org.vidogram.tgnet.c(paramString)
    {
    });
  }

  public void b(ArrayList<g.i> paramArrayList, boolean paramBoolean)
  {
    if ((paramArrayList == null) || (paramArrayList.isEmpty()));
    while (true)
    {
      return;
      int i2 = paramArrayList.size();
      int i1 = 0;
      while (i1 < i2)
      {
        a((g.i)paramArrayList.get(i1), paramBoolean);
        i1 += 1;
      }
    }
  }

  public void b(HashMap<Integer, g.i> paramHashMap)
  {
    this.b.clear();
    this.c.clear();
    this.M.clear();
    this.O.clear();
    this.P.clear();
    this.N.clear();
    this.R = 0;
    this.T = 0;
    this.S = 0;
    this.V = 0;
    this.U = 0;
    this.X = true;
    this.Z = true;
    this.ab = true;
    this.aa = true;
    this.Y = true;
    Collections.sort(this.a, this.aX);
    int i1 = 0;
    if (i1 < this.a.size())
    {
      g.hq localhq = (g.hq)this.a.get(i1);
      this.U += localhq.h;
      if ((!a(localhq.m)) && (localhq.h > 0))
        this.ab = false;
      int i3 = (int)(localhq.m >> 32);
      int i4 = (int)localhq.m;
      int i2;
      if (i4 == 0)
      {
        this.O.add(localhq);
        this.S += localhq.h;
        i2 = i1;
        if (!a(localhq.m))
        {
          i2 = i1;
          if (localhq.h > 0)
          {
            this.Y = false;
            i2 = i1;
          }
        }
      }
      while (true)
      {
        i1 = i2 + 1;
        break;
        i2 = i1;
        if (i4 == 0)
          continue;
        i2 = i1;
        if (i3 == 1)
          continue;
        this.b.add(localhq);
        g.i locali;
        if (g.a(localhq))
        {
          locali = b(Integer.valueOf(-i4));
          if ((locali != null) && ((locali.h < 0) || ((e.d(locali)) && (!locali.r))))
          {
            this.M.add(localhq);
            this.T += localhq.h;
            i2 = i1;
            if (a(localhq.m))
              continue;
            i2 = i1;
            if (localhq.h <= 0)
              continue;
            this.Z = false;
            i2 = i1;
            continue;
          }
          this.c.add(localhq);
          this.R += localhq.h;
          i2 = i1;
          if (a(localhq.m))
            continue;
          i2 = i1;
          if (localhq.h <= 0)
            continue;
          this.X = false;
          i2 = i1;
          continue;
        }
        if (i4 < 0)
        {
          if (paramHashMap != null)
          {
            locali = (g.i)paramHashMap.get(Integer.valueOf(-i4));
            if ((locali != null) && (locali.B != null))
            {
              this.a.remove(i1);
              i2 = i1 - 1;
              continue;
            }
          }
          this.c.add(localhq);
          this.R += localhq.h;
          i2 = i1;
          if (a(localhq.m))
            continue;
          i2 = i1;
          if (localhq.h <= 0)
            continue;
          this.X = false;
          i2 = i1;
          continue;
        }
        if (a().a(Integer.valueOf(i4)).r)
        {
          this.N.add(localhq);
          this.V += localhq.h;
          i2 = i1;
          if (a(localhq.m))
            continue;
          i2 = i1;
          if (localhq.h <= 0)
            continue;
          this.aa = false;
          i2 = i1;
          continue;
        }
        this.O.add(localhq);
        this.S += localhq.h;
        i2 = i1;
        if (a(localhq.m))
          continue;
        i2 = i1;
        if (localhq.h <= 0)
          continue;
        this.Y = false;
        i2 = i1;
      }
    }
  }

  public void b(boolean paramBoolean)
  {
    ApplicationLoader.a.getSharedPreferences("Notifications", 0).edit().clear().commit();
    ApplicationLoader.a.getSharedPreferences("emoji", 0).edit().putLong("lastGifLoadTime", 0L).putLong("lastStickersLoadTime", 0L).commit();
    ApplicationLoader.a.getSharedPreferences("mainconfig", 0).edit().remove("gifhint").commit();
    if (paramBoolean)
    {
      f();
      g.cp localcp = new g.cp();
      ConnectionsManager.a().a(localcp, new org.vidogram.tgnet.c()
      {
      });
    }
    while (true)
    {
      ad.f();
      y.a().a(y.au, new Object[0]);
      w.a().a(false);
      c();
      f.a().f();
      return;
      ConnectionsManager.a().d();
    }
  }

  public g.t c(Integer paramInteger)
  {
    return (g.t)this.ad.get(paramInteger);
  }

  public void c()
  {
    f.a().b();
    MediaController.a().b();
    z.a().b();
    ac.a().b();
    ab.a().b();
    org.vidogram.messenger.d.g.a();
    org.vidogram.messenger.d.e.a();
    b.b();
    this.aI.clear();
    this.aJ.clear();
    this.g.clear();
    this.e.clear();
    this.f.clear();
    this.ah.clear();
    this.aB.clear();
    this.a.clear();
    this.ag.clear();
    this.an.clear();
    this.ao.clear();
    this.b.clear();
    this.c.clear();
    this.L.clear();
    this.M.clear();
    this.O.clear();
    this.N.clear();
    this.P.clear();
    this.j.clear();
    this.i.clear();
    this.ae.clear();
    this.af.clear();
    this.ac.clear();
    this.h.clear();
    this.k.clear();
    this.l.clear();
    this.m.clear();
    this.o.clear();
    this.aj.clear();
    this.ai = 0;
    this.d = 0;
    Utilities.c.b(new Runnable()
    {
      public void run()
      {
        v.a(v.this).clear();
        v.b(v.this).clear();
        v.c(v.this).clear();
        v.d(v.this).clear();
        v.a(v.this, 0L);
        v.b(v.this, 0L);
        v.c(v.this, 0L);
        v.e(v.this).clear();
        v.this.t = false;
      }
    });
    this.q.clear();
    this.n.clear();
    this.aC.clear();
    this.aD.clear();
    this.aK.clear();
    this.aE.clear();
    this.aF.clear();
    this.aG.clear();
    this.aH.clear();
    this.aM = 0;
    this.aN = null;
    this.aL = false;
    this.r = false;
    this.s = false;
    this.p = false;
    this.v = false;
    this.u = false;
    this.aQ = 0L;
    this.aT = false;
    this.w = false;
    this.aU = null;
    this.aR = 0;
    this.aS = 0;
    Utilities.c.b(new Runnable()
    {
      public void run()
      {
        ConnectionsManager.a().b(false);
        v.f(v.this).clear();
        v.g(v.this).clear();
        v.h(v.this).clear();
        v.i(v.this).clear();
        v.j(v.this).clear();
        v.k(v.this).clear();
      }
    });
    if (this.aO != null)
    {
      Utilities.c.a(this.aO);
      this.aO = null;
    }
    b();
    y.a().a(y.c, new Object[0]);
  }

  public void c(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    g.pf localpf = new g.pf();
    localpf.c = paramInt1;
    localpf.d = a(paramInt2);
    localpf.e = paramBoolean;
    ConnectionsManager.a().a(localpf, new org.vidogram.tgnet.c()
    {
    });
  }

  public void c(int paramInt, boolean paramBoolean)
  {
    g.rh localrh = new g.rh();
    localrh.c = paramInt;
    localrh.d = paramBoolean;
    ConnectionsManager.a().a(localrh, new org.vidogram.tgnet.c(paramInt)
    {
    });
  }

  public void c(long paramLong, g.vw paramvw, g.i parami)
  {
    if ((this.aj.containsKey(Long.valueOf(paramLong))) || ((paramvw == null) && (parami == null)));
    do
    {
      return;
      this.aj.put(Long.valueOf(paramLong), Boolean.valueOf(true));
      localObject = ApplicationLoader.a.getSharedPreferences("Notifications", 0);
    }
    while (((SharedPreferences)localObject).getInt("spam3_" + paramLong, 0) == 1);
    if (((SharedPreferences)localObject).getBoolean("spam_" + paramLong, false))
    {
      localObject = new g.qf();
      if (paramvw != null)
        ((g.qf)localObject).c = c(paramvw.d);
      while (true)
      {
        ConnectionsManager.a().a((org.vidogram.tgnet.f)localObject, new org.vidogram.tgnet.c(paramLong)
        {
        });
        return;
        if (parami == null)
          continue;
        ((g.qf)localObject).c = c(-parami.h);
      }
    }
    Object localObject = new g.qa();
    if (paramvw != null)
      ((g.qa)localObject).c = c(paramvw.d);
    while (true)
    {
      ConnectionsManager.a().a((org.vidogram.tgnet.f)localObject, new org.vidogram.tgnet.c(paramLong)
      {
      });
      return;
      if (parami == null)
        continue;
      ((g.qa)localObject).c = c(-parami.h);
    }
  }

  public void c(ArrayList<g.t> paramArrayList, boolean paramBoolean)
  {
    if ((paramArrayList == null) || (paramArrayList.isEmpty()));
    while (true)
    {
      return;
      int i2 = paramArrayList.size();
      int i1 = 0;
      while (i1 < i2)
      {
        a((g.t)paramArrayList.get(i1), paramBoolean);
        i1 += 1;
      }
    }
  }

  public ConcurrentHashMap<Integer, g.vw> d()
  {
    return this.ae;
  }

  public void d(int paramInt, boolean paramBoolean)
  {
    Utilities.c.b(new Runnable(paramBoolean, paramInt)
    {
      public void run()
      {
        if (this.a)
          v.k(v.this).delete(this.b);
        do
        {
          return;
          v.k(v.this).put(this.b, 0);
        }
        while (v.j(v.this).indexOfKey(this.b) >= 0);
        v.this.a(this.b, 2, 0L);
      }
    });
  }

  public void d(Integer paramInteger)
  {
    if ((this.aF.contains(paramInteger)) || (this.aG.contains(paramInteger)))
      return;
    this.aF.add(paramInteger);
    g.es locales = new g.es();
    locales.c = b(paramInteger.intValue());
    locales.d = new g.dy();
    locales.e = 0;
    locales.f = 32;
    ConnectionsManager.a().a(locales, new org.vidogram.tgnet.c(paramInteger)
    {
    });
  }

  public g.w e(int paramInt)
  {
    return (g.w)this.ah.get(Integer.valueOf(paramInt));
  }

  protected void e()
  {
    this.aD.clear();
    this.aH.clear();
  }

  public String f(int paramInt)
  {
    return (String)this.aB.get(Integer.valueOf(paramInt));
  }

  public void f()
  {
    if ((ad.a) && (ad.b.length() == 0))
    {
      g.cc localcc = new g.cc();
      localcc.d = ad.b;
      localcc.c = 2;
      ConnectionsManager.a().a(localcc, new org.vidogram.tgnet.c()
      {
      });
    }
  }

  public void g()
  {
    if ((d.a) || (ad.q == null) || (ad.q.equals(d.c)))
      return;
    g.jf localjf = new g.jf();
    ConnectionsManager.a().a(localjf, new org.vidogram.tgnet.c()
    {
    });
  }

  public void g(int paramInt)
  {
    this.aC.remove(Integer.valueOf(paramInt));
  }

  public void h()
  {
    if (this.u)
      return;
    this.u = true;
    g.ue localue = new g.ue();
    ConnectionsManager.a().a(localue, new org.vidogram.tgnet.c()
    {
    });
  }

  public void h(int paramInt)
  {
    g.vw localvw = a(Integer.valueOf(paramInt));
    if ((localvw == null) || (this.q.contains(Integer.valueOf(paramInt))))
      return;
    this.q.add(Integer.valueOf(paramInt));
    if (localvw.r)
      org.vidogram.messenger.d.e.b(paramInt);
    while (true)
    {
      y.a().a(y.y, new Object[0]);
      g.fx localfx = new g.fx();
      localfx.c = a(localvw);
      ConnectionsManager.a().a(localfx, new org.vidogram.tgnet.c(localvw)
      {
      });
      return;
      org.vidogram.messenger.d.e.c(paramInt);
    }
  }

  public void i()
  {
    a(w.b, w.a, w.c, false);
  }

  public void i(int paramInt)
  {
    g.gh localgh = new g.gh();
    g.vw localvw = a(Integer.valueOf(paramInt));
    if (localvw == null)
      return;
    this.q.remove(Integer.valueOf(localvw.d));
    localgh.c = a(localvw);
    y.a().a(y.y, new Object[0]);
    ConnectionsManager.a().a(localgh, new org.vidogram.tgnet.c(localvw)
    {
    });
  }

  public void j()
  {
    if (W != null)
      ConnectionsManager.a().a(W, new org.vidogram.tgnet.c()
      {
      });
  }

  public void j(int paramInt)
  {
    a.a(new Runnable(paramInt)
    {
      public void run()
      {
        g.i locali = v.this.b(Integer.valueOf(this.a));
        if ((locali == null) || (!e.a(this.a)) || (locali.c))
          return;
        g.er localer = new g.er();
        localer.c = v.b(this.a);
        localer.d = new g.lw();
        ConnectionsManager.a().a(localer, new org.vidogram.tgnet.c(locali)
        {
        });
      }
    });
  }

  public void k()
  {
    System.currentTimeMillis();
    c(false);
    if (ad.b())
    {
      this.aS = 1;
      if (this.aR != 0)
        ConnectionsManager.a().a(this.aR, true);
      g.cg localcg = new g.cg();
      localcg.c = false;
      this.aR = ConnectionsManager.a().a(localcg, new org.vidogram.tgnet.c()
      {
      });
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.v
 * JD-Core Version:    0.6.0
 */