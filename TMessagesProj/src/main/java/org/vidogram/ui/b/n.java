package org.vidogram.ui.b;

import android.content.Context;
import android.location.Location;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import org.vidogram.messenger.a;
import org.vidogram.messenger.ac.b;
import org.vidogram.messenger.ac.b.b;
import org.vidogram.messenger.ae;
import org.vidogram.messenger.d.e;
import org.vidogram.messenger.support.widget.RecyclerView.u;
import org.vidogram.messenger.u;
import org.vidogram.messenger.v;
import org.vidogram.tgnet.ConnectionsManager;
import org.vidogram.tgnet.c;
import org.vidogram.tgnet.g.ar;
import org.vidogram.tgnet.g.aw;
import org.vidogram.tgnet.g.b;
import org.vidogram.tgnet.g.cy;
import org.vidogram.tgnet.g.d;
import org.vidogram.tgnet.g.dl;
import org.vidogram.tgnet.g.gf;
import org.vidogram.tgnet.g.j;
import org.vidogram.tgnet.g.ji;
import org.vidogram.tgnet.g.jy;
import org.vidogram.tgnet.g.k;
import org.vidogram.tgnet.g.ky;
import org.vidogram.tgnet.g.l;
import org.vidogram.tgnet.g.pv;
import org.vidogram.tgnet.g.to;
import org.vidogram.tgnet.g.vw;
import org.vidogram.ui.c.ad;
import org.vidogram.ui.c.m;
import org.vidogram.ui.c.m.a;

public class n extends d
{
  private boolean A;
  private int B;
  private String C;
  private String D;
  private String E;
  private int F;
  private int G;
  private boolean H;
  private g.vw I;
  private boolean J;
  private Runnable K;
  private Location L;
  private org.vidogram.ui.a.g M;
  private ac.b N = new ac.b(new ac.b.b()
  {
    public void a()
    {
      n.c(n.this);
    }

    public void a(Location paramLocation)
    {
      if ((n.a(n.this) != null) && (n.a(n.this).z))
      {
        n.a(n.this, paramLocation);
        n.a(n.this, n.a(n.this), n.b(n.this), "");
      }
    }
  })
  {
    public void b()
    {
      super.b();
      n.a(n.this, null);
    }
  };
  private Context f;
  private long g;
  private g.j h;
  private ArrayList<g.vw> i;
  private ArrayList<String> j;
  private ArrayList<String> k;
  private ArrayList<String> l;
  private ArrayList<g.vw> m;
  private ArrayList<g.d> n;
  private g.ji o;
  private HashMap<String, g.d> p;
  private b q;
  private HashMap<Integer, g.b> r;
  private int s;
  private boolean t = true;
  private int u;
  private String v;
  private int w;
  private ArrayList<u> x;
  private boolean y = true;
  private boolean z = true;

  public n(Context paramContext, boolean paramBoolean, long paramLong, b paramb)
  {
    this.f = paramContext;
    this.q = paramb;
    this.A = paramBoolean;
    this.g = paramLong;
  }

  private void a(String paramString1, String paramString2)
  {
    if ((this.I != null) && (this.I.g != null) && (this.I.g.equals(paramString1)) && (this.D != null) && (this.D.equals(paramString2)));
    while (true)
    {
      return;
      this.n = null;
      this.p = null;
      this.o = null;
      c();
      if (this.I != null)
        this.q.a(false);
      if (this.K != null)
      {
        a.b(this.K);
        this.K = null;
      }
      if ((TextUtils.isEmpty(paramString1)) || ((this.C != null) && (!this.C.equals(paramString1))))
      {
        if (this.F != 0)
        {
          ConnectionsManager.a().a(this.F, true);
          this.F = 0;
        }
        if (this.G != 0)
        {
          ConnectionsManager.a().a(this.G, true);
          this.G = 0;
        }
        this.I = null;
        this.C = null;
        this.D = null;
        this.N.b();
        this.H = false;
        if (this.q != null)
          this.q.b(false);
        if ((paramString1 == null) || (paramString1.length() == 0))
          continue;
      }
      if (paramString2 != null)
        break;
      if (this.G != 0)
      {
        ConnectionsManager.a().a(this.G, true);
        this.G = 0;
      }
      this.D = null;
      if (this.q == null)
        continue;
      this.q.b(false);
      return;
    }
    if (this.q != null)
    {
      if (this.I == null)
        break label335;
      this.q.b(true);
    }
    while (true)
    {
      this.D = paramString2;
      this.K = new Runnable(paramString2, paramString1)
      {
        public void run()
        {
          if (n.d(n.this) != this);
          while (true)
          {
            return;
            n.a(n.this, null);
            if ((n.a(n.this) == null) && (!n.e(n.this)))
              break;
            if (n.e(n.this))
              continue;
            n.a(n.this, n.a(n.this), this.a, "");
            return;
          }
          g.gf localgf = new g.gf();
          localgf.c = n.a(n.this, this.b);
          n.a(n.this, ConnectionsManager.a().a(localgf, new c()
          {
          }));
        }
      };
      a.a(this.K, 400L);
      return;
      label335: if (!paramString1.equals("gif"))
        continue;
      this.C = "gif";
      this.q.b(false);
    }
  }

  private void a(g.vw paramvw, String paramString1, String paramString2)
  {
    if (this.G != 0)
    {
      ConnectionsManager.a().a(this.G, true);
      this.G = 0;
    }
    if ((paramString1 == null) || (paramvw == null))
      this.D = null;
    do
      return;
    while ((paramvw.z) && (this.L == null));
    g.pv localpv = new g.pv();
    localpv.d = v.a(paramvw);
    localpv.g = paramString1;
    localpv.h = paramString2;
    if ((paramvw.z) && (this.L != null) && (this.L.getLatitude() != -1000.0D))
    {
      localpv.c |= 1;
      localpv.f = new g.jy();
      localpv.f.b = this.L.getLatitude();
      localpv.f.c = this.L.getLongitude();
    }
    int i1 = (int)this.g;
    int i2 = (int)(this.g >> 32);
    if (i1 != 0);
    for (localpv.e = v.c(i1); ; localpv.e = new g.ky())
    {
      this.G = ConnectionsManager.a().a(localpv, new c(paramString1, paramString2)
      {
      }
      , 2);
      return;
    }
  }

  private void t()
  {
    if ((this.I != null) && (this.I.z))
    {
      this.L = new Location("network");
      this.L.setLatitude(-1000.0D);
      this.L.setLongitude(-1000.0D);
      a(this.I, this.D, "");
    }
  }

  public int a()
  {
    int i2 = 0;
    int i1 = 0;
    if (this.n != null)
    {
      i2 = this.n.size();
      if (this.o != null)
        i1 = 1;
      i1 += i2;
    }
    do
    {
      return i1;
      if (this.i != null)
        return this.i.size();
      if (this.j != null)
        return this.j.size();
      i1 = i2;
    }
    while (this.k == null);
    return this.k.size();
  }

  public int a(int paramInt)
  {
    if (this.n != null)
    {
      if ((paramInt == 0) && (this.o != null))
        return 2;
      return 1;
    }
    return 0;
  }

  public RecyclerView.u a(ViewGroup paramViewGroup, int paramInt)
  {
    if (paramInt == 1)
    {
      paramViewGroup = new m(this.f);
      ((m)paramViewGroup).setDelegate(new m.a()
      {
        public void a(m paramm)
        {
          n.f(n.this).a(paramm.getResult());
        }
      });
    }
    while (true)
    {
      return new a(paramViewGroup);
      if (paramInt == 2)
      {
        paramViewGroup = new org.vidogram.ui.c.g(this.f);
        continue;
      }
      paramViewGroup = new ad(this.f);
      ((ad)paramViewGroup).setIsDarkTheme(this.A);
    }
  }

  public void a(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    if ((paramInt == 2) && (this.I != null) && (this.I.z))
    {
      if ((paramArrayOfInt.length > 0) && (paramArrayOfInt[0] == 0))
        this.N.a();
    }
    else
      return;
    t();
  }

  public void a(String paramString, int paramInt, ArrayList<u> paramArrayList)
  {
    if ((paramString == null) || (paramString.length() == 0))
    {
      a(null, null);
      this.q.a(false);
      this.v = null;
      return;
    }
    if (paramString.length() > 0);
    for (int i1 = paramInt - 1; ; i1 = paramInt)
    {
      this.v = null;
      Object localObject3 = new StringBuilder();
      int i2;
      int i3;
      Object localObject1;
      Object localObject2;
      if ((this.z) && (paramString.charAt(0) == '@'))
      {
        i2 = paramString.indexOf(' ');
        i3 = paramString.length();
        localObject1 = null;
        if (i2 > 0)
        {
          localObject1 = paramString.substring(1, i2);
          localObject2 = paramString.substring(i2 + 1);
          if ((localObject1 == null) || (((String)localObject1).length() < 1))
            break label326;
          i2 = 1;
          label134: if (i2 >= ((String)localObject1).length())
            break label1806;
          i3 = ((String)localObject1).charAt(i2);
          if (((i3 >= 48) && (i3 <= 57)) || ((i3 >= 97) && (i3 <= 122)) || ((i3 >= 65) && (i3 <= 90)) || (i3 == 95))
            break label317;
          localObject1 = "";
        }
      }
      label1797: label1806: 
      while (true)
      {
        label207: a((String)localObject1, (String)localObject2);
        int i4;
        while (true)
        {
          if (this.I != null)
            break label341;
          i4 = -1;
          i2 = 0;
          while (true)
          {
            if (i1 < 0)
              break label1797;
            if (i1 < paramString.length())
              break;
            label242: i1 -= 1;
          }
          if ((paramString.charAt(i3 - 1) == 't') && (paramString.charAt(i3 - 2) == 'o') && (paramString.charAt(i3 - 3) == 'b'))
          {
            localObject1 = paramString.substring(1);
            localObject2 = "";
            break;
          }
          a(null, null);
          localObject2 = null;
          break;
          label317: i2 += 1;
          break label134;
          label326: localObject1 = "";
          break label207;
          a(null, null);
        }
        label341: break;
        char c = paramString.charAt(i1);
        if ((i1 == 0) || (paramString.charAt(i1 - 1) == ' ') || (paramString.charAt(i1 - 1) == '\n'))
          if (c == '@')
          {
            if ((!this.y) && ((!this.z) || (i1 != 0)))
              break label621;
            if (i2 != 0)
            {
              this.q.a(false);
              return;
            }
            if ((this.h == null) && (i1 != 0))
            {
              this.v = paramString;
              this.w = paramInt;
              this.x = paramArrayList;
              this.q.a(false);
              return;
            }
            paramInt = 0;
            this.s = i1;
            this.u = (((StringBuilder)localObject3).length() + 1);
          }
        while (true)
        {
          if (paramInt == -1)
          {
            this.q.a(false);
            return;
            if (c == '#')
            {
              if (!this.e)
              {
                d();
                this.v = paramString;
                this.w = paramInt;
                this.x = paramArrayList;
                this.q.a(false);
                return;
              }
              paramInt = 1;
              this.s = i1;
              this.u = (((StringBuilder)localObject3).length() + 1);
              ((StringBuilder)localObject3).insert(0, c);
              i1 = i4;
              continue;
            }
            if ((i1 == 0) && (this.r != null) && (c == '/'))
            {
              paramInt = 2;
              this.s = i1;
              this.u = (((StringBuilder)localObject3).length() + 1);
              i1 = i4;
              continue;
            }
            label621: if (c >= '0')
            {
              i3 = i2;
              if (c <= '9');
            }
            else if (c >= 'a')
            {
              i3 = i2;
              if (c <= 'z');
            }
            else if (c >= 'A')
            {
              i3 = i2;
              if (c <= 'Z');
            }
            else
            {
              i3 = i2;
              if (c != '_')
                i3 = 1;
            }
            ((StringBuilder)localObject3).insert(0, c);
            i2 = i3;
            break label242;
          }
          if (paramInt == 0)
          {
            paramString = new ArrayList();
            paramInt = 0;
            while (paramInt < Math.min(100, paramArrayList.size()))
            {
              i2 = ((u)paramArrayList.get(paramInt)).a.c;
              if (!paramString.contains(Integer.valueOf(i2)))
                paramString.add(Integer.valueOf(i2));
              paramInt += 1;
            }
            localObject1 = ((StringBuilder)localObject3).toString().toLowerCase();
            paramArrayList = new ArrayList();
            localObject2 = new HashMap();
            if ((this.z) && (i1 == 0) && (!e.b.isEmpty()))
            {
              paramInt = 0;
              i2 = 0;
              if (i2 < e.b.size())
              {
                localObject3 = v.a().a(Integer.valueOf(((g.to)e.b.get(i2)).c.c));
                if (localObject3 == null);
                do
                {
                  i2 += 1;
                  break;
                  i1 = paramInt;
                  if (((g.vw)localObject3).g != null)
                  {
                    i1 = paramInt;
                    if (((g.vw)localObject3).g.length() > 0)
                      if ((((String)localObject1).length() <= 0) || (!((g.vw)localObject3).g.toLowerCase().startsWith((String)localObject1)))
                      {
                        i1 = paramInt;
                        if (((String)localObject1).length() != 0);
                      }
                      else
                      {
                        paramArrayList.add(localObject3);
                        ((HashMap)localObject2).put(Integer.valueOf(((g.vw)localObject3).d), localObject3);
                        i1 = paramInt + 1;
                      }
                  }
                  paramInt = i1;
                }
                while (i1 != 5);
              }
            }
            if ((this.h != null) && (this.h.t != null))
            {
              paramInt = 0;
              if (paramInt < this.h.t.e.size())
              {
                localObject3 = (g.k)this.h.t.e.get(paramInt);
                localObject3 = v.a().a(Integer.valueOf(((g.k)localObject3).b));
                if ((localObject3 == null) || (ae.b((g.vw)localObject3)) || (((HashMap)localObject2).containsKey(Integer.valueOf(((g.vw)localObject3).d))));
                while (true)
                {
                  paramInt += 1;
                  break;
                  if (((String)localObject1).length() == 0)
                  {
                    if ((((g.vw)localObject3).q) || ((!this.t) && ((this.t) || (((g.vw)localObject3).g == null) || (((g.vw)localObject3).g.length() == 0))))
                      continue;
                    paramArrayList.add(localObject3);
                    continue;
                  }
                  if ((((g.vw)localObject3).g != null) && (((g.vw)localObject3).g.length() > 0) && (((g.vw)localObject3).g.toLowerCase().startsWith((String)localObject1)))
                  {
                    paramArrayList.add(localObject3);
                    continue;
                  }
                  if ((!this.t) && ((((g.vw)localObject3).g == null) || (((g.vw)localObject3).g.length() == 0)))
                    continue;
                  if ((((g.vw)localObject3).e != null) && (((g.vw)localObject3).e.length() > 0) && (((g.vw)localObject3).e.toLowerCase().startsWith((String)localObject1)))
                  {
                    paramArrayList.add(localObject3);
                    continue;
                  }
                  if ((((g.vw)localObject3).f == null) || (((g.vw)localObject3).f.length() <= 0) || (!((g.vw)localObject3).f.toLowerCase().startsWith((String)localObject1)))
                    continue;
                  paramArrayList.add(localObject3);
                }
              }
            }
            this.j = null;
            this.k = null;
            this.l = null;
            this.m = null;
            this.i = paramArrayList;
            Collections.sort(this.i, new Comparator((HashMap)localObject2, paramString)
            {
              public int a(g.vw paramvw1, g.vw paramvw2)
              {
                int j = -1;
                int i;
                if ((this.a.containsKey(Integer.valueOf(paramvw1.d))) && (this.a.containsKey(Integer.valueOf(paramvw2.d))))
                  i = 0;
                int k;
                int m;
                do
                {
                  while (true)
                  {
                    return i;
                    i = j;
                    if (this.a.containsKey(Integer.valueOf(paramvw1.d)))
                      continue;
                    if (this.a.containsKey(Integer.valueOf(paramvw2.d)))
                      return 1;
                    k = this.b.indexOf(Integer.valueOf(paramvw1.d));
                    m = this.b.indexOf(Integer.valueOf(paramvw2.d));
                    if ((k == -1) || (m == -1))
                      break;
                    i = j;
                    if (k < m)
                      continue;
                    if (k == m)
                      return 0;
                    return 1;
                  }
                  if (k == -1)
                    break;
                  i = j;
                }
                while (m == -1);
                if ((k == -1) && (m != -1))
                  return 1;
                return 0;
              }
            });
            c();
            paramString = this.q;
            if (!paramArrayList.isEmpty());
            for (bool = true; ; bool = false)
            {
              paramString.a(bool);
              return;
            }
          }
          if (paramInt == 1)
          {
            paramString = new ArrayList();
            paramArrayList = ((StringBuilder)localObject3).toString().toLowerCase();
            paramInt = 0;
            while (paramInt < this.c.size())
            {
              localObject1 = (d.a)this.c.get(paramInt);
              if ((localObject1 != null) && (((d.a)localObject1).a != null) && (((d.a)localObject1).a.startsWith(paramArrayList)))
                paramString.add(((d.a)localObject1).a);
              paramInt += 1;
            }
            this.j = paramString;
            this.i = null;
            this.k = null;
            this.l = null;
            this.m = null;
            c();
            paramArrayList = this.q;
            if (!paramString.isEmpty());
            for (bool = true; ; bool = false)
            {
              paramArrayList.a(bool);
              return;
            }
          }
          if (paramInt != 2)
            break;
          paramString = new ArrayList();
          paramArrayList = new ArrayList();
          localObject1 = new ArrayList();
          localObject2 = ((StringBuilder)localObject3).toString().toLowerCase();
          localObject3 = this.r.entrySet().iterator();
          while (((Iterator)localObject3).hasNext())
          {
            g.b localb = (g.b)((Map.Entry)((Iterator)localObject3).next()).getValue();
            paramInt = 0;
            while (paramInt < localb.d.size())
            {
              g.cy localcy = (g.cy)localb.d.get(paramInt);
              if ((localcy != null) && (localcy.c != null) && (localcy.c.startsWith((String)localObject2)))
              {
                paramString.add("/" + localcy.c);
                paramArrayList.add(localcy.d);
                ((ArrayList)localObject1).add(v.a().a(Integer.valueOf(localb.b)));
              }
              paramInt += 1;
            }
          }
          this.j = null;
          this.i = null;
          this.k = paramString;
          this.l = paramArrayList;
          this.m = ((ArrayList)localObject1);
          c();
          paramArrayList = this.q;
          if (!paramString.isEmpty());
          for (boolean bool = true; ; bool = false)
          {
            paramArrayList.a(bool);
            return;
          }
          paramInt = -1;
          i1 = i4;
        }
      }
    }
  }

  protected void a(ArrayList<d.a> paramArrayList, HashMap<String, d.a> paramHashMap)
  {
    super.a(paramArrayList, paramHashMap);
    if (this.v != null)
      a(this.v, this.w, this.x);
  }

  public void a(HashMap<Integer, g.b> paramHashMap)
  {
    this.r = paramHashMap;
  }

  public void a(RecyclerView.u paramu, int paramInt)
  {
    boolean bool2 = true;
    int i1;
    if (this.n != null)
      if (this.o != null)
      {
        i1 = 1;
        if (paramu.h() != 2)
          break label54;
        if (i1 != 0)
          ((org.vidogram.ui.c.g)paramu.a).setText(this.o.c);
      }
    label54: 
    do
    {
      return;
      i1 = 0;
      break;
      int i2 = paramInt;
      if (i1 != 0)
        i2 = paramInt - 1;
      paramu = (m)paramu.a;
      localObject = (g.d)this.n.get(i2);
      boolean bool3 = this.J;
      boolean bool1;
      if (i2 != this.n.size() - 1)
      {
        bool1 = true;
        if ((i1 == 0) || (i2 != 0))
          break label139;
      }
      while (true)
      {
        paramu.a((g.d)localObject, bool3, bool1, bool2);
        return;
        bool1 = false;
        break;
        bool2 = false;
      }
      if (this.i != null)
      {
        ((ad)paramu.a).setUser((g.vw)this.i.get(paramInt));
        return;
      }
      if (this.j == null)
        continue;
      ((ad)paramu.a).setText((String)this.j.get(paramInt));
      return;
    }
    while (this.k == null);
    label139: Object localObject = (ad)paramu.a;
    String str1 = (String)this.k.get(paramInt);
    String str2 = (String)this.l.get(paramInt);
    if (this.m != null);
    for (paramu = (g.vw)this.m.get(paramInt); ; paramu = null)
    {
      ((ad)localObject).a(str1, str2, paramu);
      return;
    }
  }

  public void a(g.j paramj)
  {
    this.h = paramj;
    if (this.v != null)
      a(this.v, this.w, this.x);
  }

  public void a(org.vidogram.ui.a.g paramg)
  {
    this.M = paramg;
  }

  public void a(boolean paramBoolean)
  {
    this.t = paramBoolean;
  }

  public void b(boolean paramBoolean)
  {
    this.y = paramBoolean;
  }

  public void c(boolean paramBoolean)
  {
    this.z = paramBoolean;
  }

  public void e()
  {
    super.e();
    this.j.clear();
    c();
    if (this.q != null)
      this.q.a(false);
  }

  public void e(int paramInt)
  {
    this.B = paramInt;
  }

  public int f(int paramInt)
  {
    int i1 = paramInt;
    if (this.n != null)
    {
      i1 = paramInt;
      if (this.o != null)
        i1 = paramInt - 1;
    }
    return i1;
  }

  public void f()
  {
    if (this.N != null)
      this.N.b();
    if (this.K != null)
    {
      a.b(this.K);
      this.K = null;
    }
    if (this.F != 0)
    {
      ConnectionsManager.a().a(this.F, true);
      this.F = 0;
    }
    if (this.G != 0)
    {
      ConnectionsManager.a().a(this.G, true);
      this.G = 0;
    }
    this.I = null;
    this.C = null;
    this.D = null;
    this.H = false;
  }

  public Object g(int paramInt)
  {
    Object localObject2 = null;
    int i1;
    Object localObject1;
    if (this.n != null)
    {
      i1 = paramInt;
      if (this.o != null)
        if (paramInt == 0)
          localObject1 = this.o;
    }
    do
    {
      do
      {
        do
        {
          while (true)
          {
            return localObject1;
            i1 = paramInt - 1;
            localObject1 = localObject2;
            if (i1 < 0)
              continue;
            localObject1 = localObject2;
            if (i1 < this.n.size())
            {
              return this.n.get(i1);
              if (this.i != null)
              {
                localObject1 = localObject2;
                if (paramInt < 0)
                  continue;
                localObject1 = localObject2;
                if (paramInt < this.i.size())
                  return this.i.get(paramInt);
              }
              if (this.j == null)
                break;
              localObject1 = localObject2;
              if (paramInt < 0)
                continue;
              localObject1 = localObject2;
              if (paramInt < this.j.size())
                return this.j.get(paramInt);
            }
          }
          localObject1 = localObject2;
        }
        while (this.k == null);
        localObject1 = localObject2;
      }
      while (paramInt < 0);
      localObject1 = localObject2;
    }
    while (paramInt >= this.k.size());
    if ((this.m != null) && ((this.B != 1) || ((this.h instanceof g.dl))))
    {
      if (this.m.get(paramInt) != null)
      {
        localObject2 = this.k.get(paramInt);
        if (this.m.get(paramInt) != null);
        for (localObject1 = ((g.vw)this.m.get(paramInt)).g; ; localObject1 = "")
          return String.format("%s@%s", new Object[] { localObject2, localObject1 });
      }
      return String.format("%s", new Object[] { this.k.get(paramInt) });
    }
    return this.k.get(paramInt);
  }

  public g.ji g()
  {
    return this.o;
  }

  public int h()
  {
    if (this.I != null)
      return this.I.d;
    return 0;
  }

  public g.vw i()
  {
    if (this.I != null)
      return this.I;
    return null;
  }

  public String j()
  {
    if (this.I != null)
      return this.I.g;
    return "";
  }

  public String k()
  {
    if (this.I != null)
      return this.I.B;
    if ((this.C != null) && (this.C.equals("gif")))
      return "Search GIFs";
    return null;
  }

  public void l()
  {
    if ((this.G != 0) || (this.E == null) || (this.E.length() == 0) || (this.I == null) || (this.D == null))
      return;
    a(this.I, this.D, this.E);
  }

  public int m()
  {
    return this.s;
  }

  public int n()
  {
    return this.u;
  }

  public ArrayList<g.d> o()
  {
    return this.n;
  }

  public boolean p()
  {
    return (this.j != null) || (this.k != null);
  }

  public boolean q()
  {
    return this.k != null;
  }

  public boolean r()
  {
    return this.n != null;
  }

  public boolean s()
  {
    return this.J;
  }

  public class a extends RecyclerView.u
  {
    public a(View arg2)
    {
      super();
    }
  }

  public static abstract interface b
  {
    public abstract void a(g.d paramd);

    public abstract void a(boolean paramBoolean);

    public abstract void b(boolean paramBoolean);
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.b.n
 * JD-Core Version:    0.6.0
 */