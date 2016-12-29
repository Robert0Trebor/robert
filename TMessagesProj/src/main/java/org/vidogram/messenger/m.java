package org.vidogram.messenger;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Semaphore;
import org.vidogram.tgnet.f;
import org.vidogram.tgnet.g.ar;
import org.vidogram.tgnet.g.as;
import org.vidogram.tgnet.g.au;
import org.vidogram.tgnet.g.ay;
import org.vidogram.tgnet.g.az;
import org.vidogram.tgnet.g.hx;
import org.vidogram.tgnet.g.ja;
import org.vidogram.tgnet.g.nw;
import org.vidogram.tgnet.g.ob;
import org.vidogram.tgnet.g.oi;
import org.vidogram.tgnet.g.oj;
import org.vidogram.tgnet.g.q;
import org.vidogram.tgnet.g.r;
import org.vidogram.tgnet.g.rq;
import org.vidogram.tgnet.g.wb;
import org.vidogram.tgnet.g.x;

public class m
{
  private static volatile m r = null;
  private HashMap<Integer, File> a = null;
  private volatile h b = new h("fileUploadQueue");
  private LinkedList<o> c = new LinkedList();
  private LinkedList<o> d = new LinkedList();
  private LinkedList<l> e = new LinkedList();
  private LinkedList<l> f = new LinkedList();
  private LinkedList<l> g = new LinkedList();
  private ConcurrentHashMap<String, o> h = new ConcurrentHashMap();
  private ConcurrentHashMap<String, o> i = new ConcurrentHashMap();
  private ConcurrentHashMap<String, l> j = new ConcurrentHashMap();
  private HashMap<String, Long> k = new HashMap();
  private a l = null;
  private int m = 0;
  private int n = 0;
  private int o = 0;
  private int p = 0;
  private int q = 0;

  public static File a(f paramf)
  {
    return a(paramf, null, false);
  }

  public static File a(f paramf, String paramString, boolean paramBoolean)
  {
    Object localObject;
    if (paramBoolean)
      localObject = a().b(4);
    while (true)
    {
      if (localObject == null)
      {
        return new File("");
        if ((paramf instanceof g.q))
        {
          localObject = (g.q)paramf;
          if (((g.q)localObject).l != null)
            localObject = a().b(4);
          while (true)
          {
            break;
            if (u.e((g.q)localObject))
            {
              localObject = a().b(1);
              continue;
            }
            if (u.e((g.q)localObject))
            {
              localObject = a().b(4);
              continue;
            }
            if (u.g((g.q)localObject))
            {
              localObject = a().b(2);
              continue;
            }
            localObject = a().b(3);
          }
        }
        if ((paramf instanceof g.az))
        {
          localObject = (g.az)paramf;
          if ((((g.az)localObject).c == null) || (((g.az)localObject).c.f != null) || ((((g.az)localObject).c.c == -2147483648L) && (((g.az)localObject).c.d < 0)) || (((g.az)localObject).f < 0));
          for (localObject = a().b(4); ; localObject = a().b(0))
            break;
        }
        if ((paramf instanceof g.x))
        {
          localObject = (g.x)paramf;
          if ((((g.x)localObject).f != null) || ((((g.x)localObject).c == -2147483648L) && (((g.x)localObject).d < 0)))
          {
            localObject = a().b(4);
            continue;
          }
          localObject = a().b(0);
          continue;
        }
      }
      else
      {
        return new File((File)localObject, a(paramf, paramString));
      }
      localObject = null;
    }
  }

  public static File a(f paramf, boolean paramBoolean)
  {
    return a(paramf, null, paramBoolean);
  }

  public static String a(File paramFile)
  {
    paramFile = paramFile.getName();
    try
    {
      paramFile = paramFile.substring(paramFile.lastIndexOf('.') + 1);
      return paramFile;
    }
    catch (Exception paramFile)
    {
    }
    return "";
  }

  public static String a(f paramf, String paramString)
  {
    if ((paramf instanceof g.q))
    {
      g.q localq = (g.q)paramf;
      paramString = null;
      int i1;
      if (0 == 0)
      {
        paramf = b(localq);
        if (paramf != null)
        {
          i1 = paramf.lastIndexOf('.');
          if (i1 != -1);
        }
        else
        {
          paramString = "";
        }
      }
      else
      {
        paramf = paramString;
        if (paramString.length() <= 1)
        {
          if (localq.g == null)
            break label221;
          paramf = localq.g;
          switch (paramf.hashCode())
          {
          default:
            label96: i1 = -1;
            switch (i1)
            {
            default:
              label98: paramf = "";
            case 0:
            case 1:
            }
          case 1331848029:
          case 187091926:
          }
        }
      }
      while (true)
      {
        if (localq.j != 0)
          break label257;
        if (paramf.length() <= 1)
          break label227;
        return localq.k + "_" + localq.b + paramf;
        paramString = paramf.substring(i1);
        break;
        if (!paramf.equals("video/mp4"))
          break label96;
        i1 = 0;
        break label98;
        if (!paramf.equals("audio/ogg"))
          break label96;
        i1 = 1;
        break label98;
        paramf = ".mp4";
        continue;
        paramf = ".ogg";
        continue;
        label221: paramf = "";
      }
      label227: return localq.k + "_" + localq.b;
      label257: if (paramf.length() > 1)
        return localq.k + "_" + localq.b + "_" + localq.j + paramf;
      return localq.k + "_" + localq.b + "_" + localq.j;
    }
    if ((paramf instanceof g.az))
    {
      paramf = (g.az)paramf;
      if ((paramf.c == null) || ((paramf.c instanceof g.ja)))
        return "";
      paramf = new StringBuilder().append(paramf.c.c).append("_").append(paramf.c.d).append(".");
      if (paramString != null);
      while (true)
      {
        return paramString;
        paramString = "jpg";
      }
    }
    if ((paramf instanceof g.x))
    {
      if ((paramf instanceof g.ja))
        return "";
      paramf = (g.x)paramf;
      paramf = new StringBuilder().append(paramf.c).append("_").append(paramf.d).append(".");
      if (paramString != null);
      while (true)
      {
        return paramString;
        paramString = "jpg";
      }
    }
    return "";
  }

  public static String a(g.ar paramar)
  {
    if (paramar == null)
      return "";
    if ((paramar instanceof g.oj))
    {
      if (paramar.f.g != null)
      {
        paramar = paramar.f.g.h;
        if (paramar.size() > 0)
        {
          paramar = a(paramar, a.f());
          if (paramar != null)
            return b(paramar);
        }
      }
    }
    else
    {
      if ((paramar.j instanceof g.nw))
        return b(paramar.j.k);
      if ((paramar.j instanceof g.ob))
      {
        paramar = paramar.j.d.h;
        if (paramar.size() > 0)
        {
          paramar = a(paramar, a.f());
          if (paramar != null)
            return b(paramar);
        }
      }
      else if ((paramar.j instanceof g.oi))
      {
        if (paramar.j.r.k != null)
        {
          paramar = paramar.j.r.k.h;
          if (paramar.size() > 0)
          {
            paramar = a(paramar, a.f());
            if (paramar != null)
              return b(paramar);
          }
        }
        else if (paramar.j.r.s != null)
        {
          return b(paramar.j.r.s);
        }
      }
    }
    return "";
  }

  public static m a()
  {
    Object localObject1 = r;
    if (localObject1 == null)
    {
      monitorenter;
      try
      {
        m localm = r;
        localObject1 = localm;
        if (localm == null)
        {
          localObject1 = new m();
          r = (m)localObject1;
        }
        return localObject1;
      }
      finally
      {
        monitorexit;
      }
    }
    return (m)localObject2;
  }

  public static g.az a(ArrayList<g.az> paramArrayList, int paramInt)
  {
    return a(paramArrayList, paramInt, false);
  }

  public static g.az a(ArrayList<g.az> paramArrayList, int paramInt, boolean paramBoolean)
  {
    g.az localaz = null;
    Object localObject1 = null;
    Object localObject2 = localObject1;
    if (paramArrayList != null)
    {
      if (paramArrayList.isEmpty())
        localObject2 = localObject1;
    }
    else
      return localObject2;
    int i4 = 0;
    int i1 = 0;
    localObject1 = localaz;
    int i2;
    while (true)
    {
      localObject2 = localObject1;
      if (i4 >= paramArrayList.size())
        break;
      localaz = (g.az)paramArrayList.get(i4);
      if (localaz != null)
        break label89;
      i2 = i1;
      localObject2 = localObject1;
      i4 += 1;
      localObject1 = localObject2;
      i1 = i2;
    }
    label89: if (paramBoolean)
      if (localaz.e >= localaz.d)
      {
        i2 = localaz.d;
        label113: if ((localObject1 != null) && ((paramInt <= 100) || (((g.az)localObject1).c == null) || (((g.az)localObject1).c.b != -2147483648)) && (!(localaz instanceof g.rq)) && ((paramInt <= i1) || (i1 >= i2)))
          break label300;
        i1 = i2;
        localObject1 = localaz;
      }
    label300: 
    while (true)
    {
      localObject2 = localObject1;
      i2 = i1;
      break;
      i2 = localaz.e;
      break label113;
      if (localaz.d >= localaz.e);
      for (int i3 = localaz.d; ; i3 = localaz.e)
      {
        if ((localObject1 != null) && ((paramInt <= 100) || (((g.az)localObject1).c == null) || (((g.az)localObject1).c.b != -2147483648)) && (!(localaz instanceof g.rq)))
        {
          localObject2 = localObject1;
          i2 = i1;
          if (i3 > paramInt)
            break;
          localObject2 = localObject1;
          i2 = i1;
          if (i1 >= i3)
            break;
        }
        localObject2 = localaz;
        i2 = i3;
        break;
      }
    }
  }

  private void a(g.q paramq, g.x paramx, String paramString)
  {
    if ((paramx == null) && (paramq == null))
      return;
    this.b.b(new Runnable(paramx, paramString, paramq)
    {
      public void run()
      {
        Object localObject = null;
        if (this.a != null);
        do
        {
          localObject = m.a(this.a, this.b);
          while (localObject == null)
          {
            return;
            if (this.c == null)
              continue;
            localObject = m.b(this.c);
          }
          localObject = (l)m.n(m.this).remove(localObject);
        }
        while (localObject == null);
        if (u.e(this.c))
          if (!m.o(m.this).remove(localObject))
            m.p(m.this);
        while (true)
        {
          ((l)localObject).d();
          return;
          if (this.a != null)
          {
            if (m.q(m.this).remove(localObject))
              continue;
            m.r(m.this);
            continue;
          }
          if (m.s(m.this).remove(localObject))
            continue;
          m.t(m.this);
        }
      }
    });
  }

  private void a(g.q paramq, g.x paramx, String paramString, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.b.b(new Runnable(paramx, paramString, paramq, paramBoolean1, paramInt, paramBoolean2)
    {
      public void run()
      {
        int j = 3;
        Object localObject;
        if (this.a != null)
          localObject = m.a(this.a, this.b);
        while (true)
        {
          if ((localObject == null) || (((String)localObject).contains("-2147483648")));
          l locall;
          int i;
          label161: 
          while (true)
          {
            return;
            if (this.c == null)
              break label538;
            localObject = m.b(this.c);
            break;
            locall = (l)m.n(m.this).get(localObject);
            if (locall == null)
              break label163;
            if (!this.d)
              continue;
            locall.a(true);
            if (u.e(this.c))
              localObject = m.o(m.this);
            while (true)
            {
              if (localObject == null)
                break label161;
              i = ((LinkedList)localObject).indexOf(locall);
              if (i <= 0)
                break;
              ((LinkedList)localObject).remove(i);
              ((LinkedList)localObject).add(0, locall);
              return;
              if (this.a != null)
              {
                localObject = m.q(m.this);
                continue;
              }
              localObject = m.s(m.this);
            }
          }
          label163: File localFile2 = m.this.b(4);
          if (this.a != null)
          {
            locall = new l(this.a, this.b, this.e);
            i = 0;
          }
          while (true)
          {
            label203: if (!this.f);
            for (File localFile1 = m.this.b(i); ; localFile1 = localFile2)
            {
              locall.a(localFile1, localFile2);
              locall.a(new l.a((String)localObject, i)
              {
                public void a(l paraml, int paramInt)
                {
                  m.a(m.this, m.6.this.c, m.6.this.a, this.a);
                  if (m.l(m.this) != null)
                    m.l(m.this).a(this.a, paramInt);
                }

                public void a(l paraml, File paramFile)
                {
                  if (m.l(m.this) != null)
                    m.l(m.this).a(this.a, paramFile, this.b);
                  m.a(m.this, m.6.this.c, m.6.this.a, this.a);
                }
              });
              m.n(m.this).put(localObject, locall);
              if (this.d);
              while (true)
              {
                if (i != 1)
                  break label393;
                if (m.u(m.this) >= j)
                  break label358;
                if (!locall.c())
                  break;
                m.v(m.this);
                return;
                if (this.c == null)
                  break label533;
                locall = new l(this.c);
                if (u.e(this.c))
                {
                  i = 1;
                  break label203;
                }
                if (u.g(this.c))
                {
                  i = 2;
                  break label203;
                }
                i = 3;
                break label203;
                j = 1;
              }
              label358: if (this.d)
              {
                m.o(m.this).add(0, locall);
                return;
              }
              m.o(m.this).add(locall);
              return;
              label393: if (this.a != null)
              {
                if (m.w(m.this) < j)
                {
                  if (!locall.c())
                    break;
                  m.x(m.this);
                  return;
                }
                if (this.d)
                {
                  m.q(m.this).add(0, locall);
                  return;
                }
                m.q(m.this).add(locall);
                return;
              }
              if (m.y(m.this) < j)
              {
                if (!locall.c())
                  break;
                m.z(m.this);
                return;
              }
              if (this.d)
              {
                m.s(m.this).add(0, locall);
                return;
              }
              m.s(m.this).add(locall);
              return;
            }
            label533: i = 4;
          }
          label538: localObject = null;
        }
      }
    });
  }

  public static File b(g.ar paramar)
  {
    if (paramar == null)
      return new File("");
    if ((paramar instanceof g.oj))
    {
      if (paramar.f.g != null)
      {
        paramar = paramar.f.g.h;
        if (paramar.size() > 0)
        {
          paramar = a(paramar, a.f());
          if (paramar != null)
            return a(paramar);
        }
      }
    }
    else
    {
      if ((paramar.j instanceof g.nw))
        return a(paramar.j.k);
      if ((paramar.j instanceof g.ob))
      {
        paramar = paramar.j.d.h;
        if (paramar.size() > 0)
        {
          paramar = a(paramar, a.f());
          if (paramar != null)
            return a(paramar);
        }
      }
      else if ((paramar.j instanceof g.oi))
      {
        if (paramar.j.r.s != null)
          return a(paramar.j.r.s);
        if (paramar.j.r.k != null)
        {
          paramar = paramar.j.r.k.h;
          if (paramar.size() > 0)
          {
            paramar = a(paramar, a.f());
            if (paramar != null)
              return a(paramar);
          }
        }
      }
    }
    return new File("");
  }

  public static String b(f paramf)
  {
    return a(paramf, null);
  }

  public static String b(g.q paramq)
  {
    if (paramq != null)
    {
      if (paramq.f != null)
        return paramq.f;
      int i1 = 0;
      while (i1 < paramq.o.size())
      {
        g.r localr = (g.r)paramq.o.get(i1);
        if ((localr instanceof g.hx))
          return localr.g;
        i1 += 1;
      }
    }
    return "";
  }

  private void b(g.q paramq, g.x paramx, String paramString)
  {
    this.b.b(new Runnable(paramString, paramq, paramx)
    {
      public void run()
      {
        l locall = (l)m.n(m.this).remove(this.a);
        int i;
        if (u.e(this.b))
        {
          if (locall != null)
          {
            if (locall.b())
              m.p(m.this);
          }
          else
          {
            if (m.o(m.this).isEmpty())
              return;
            if (!((l)m.o(m.this).get(0)).a())
              break label144;
          }
          label144: for (i = 3; ; i = 1)
          {
            if (m.u(m.this) >= i)
              return;
            locall = (l)m.o(m.this).poll();
            if ((locall == null) || (!locall.c()))
              break;
            m.v(m.this);
            break;
            m.o(m.this).remove(locall);
            break;
          }
        }
        else if (this.c != null)
        {
          if (locall != null)
          {
            if (locall.b())
              m.r(m.this);
          }
          else
          {
            if (m.q(m.this).isEmpty())
              return;
            if (!((l)m.q(m.this).get(0)).a())
              break label272;
          }
          label272: for (i = 3; ; i = 1)
          {
            if (m.w(m.this) >= i)
              return;
            locall = (l)m.q(m.this).poll();
            if ((locall == null) || (!locall.c()))
              break;
            m.x(m.this);
            break;
            m.q(m.this).remove(locall);
            break;
          }
        }
        else
        {
          if (locall != null)
          {
            if (locall.b())
              m.t(m.this);
          }
          else
          {
            if (m.s(m.this).isEmpty())
              return;
            if (!((l)m.s(m.this).get(0)).a())
              break label393;
          }
          label393: for (i = 3; ; i = 1)
          {
            if (m.y(m.this) >= i)
              return;
            locall = (l)m.s(m.this).poll();
            if ((locall == null) || (!locall.c()))
              break;
            m.z(m.this);
            break;
            m.s(m.this).remove(locall);
            break;
          }
        }
      }
    });
  }

  public static String c(g.q paramq)
  {
    Object localObject = b(paramq);
    int i1 = ((String)localObject).lastIndexOf('.');
    String str = null;
    if (i1 != -1)
      str = ((String)localObject).substring(i1 + 1);
    if (str != null)
    {
      localObject = str;
      if (str.length() != 0);
    }
    else
    {
      localObject = paramq.g;
    }
    paramq = (g.q)localObject;
    if (localObject == null)
      paramq = "";
    return (String)paramq.toUpperCase();
  }

  public File a(int paramInt)
  {
    return (File)this.a.get(Integer.valueOf(paramInt));
  }

  public void a(String paramString, boolean paramBoolean)
  {
    this.b.b(new Runnable(paramBoolean, paramString)
    {
      public void run()
      {
        if (!this.a);
        for (o localo = (o)m.a(m.this).get(this.b); ; localo = (o)m.b(m.this).get(this.b))
        {
          m.c(m.this).remove(this.b);
          if (localo != null)
          {
            m.b(m.this).remove(this.b);
            m.d(m.this).remove(localo);
            m.e(m.this).remove(localo);
            localo.b();
          }
          return;
        }
      }
    });
  }

  public void a(String paramString, boolean paramBoolean, long paramLong)
  {
    this.b.b(new Runnable(paramBoolean, paramString, paramLong)
    {
      public void run()
      {
        o localo;
        if (this.a)
        {
          localo = (o)m.b(m.this).get(this.b);
          if (localo == null)
            break label59;
          localo.a(this.c);
        }
        label59: 
        do
        {
          return;
          localo = (o)m.a(m.this).get(this.b);
          break;
        }
        while (this.c == 0L);
        m.c(m.this).put(this.b, Long.valueOf(this.c));
      }
    });
  }

  public void a(String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    a(paramString, paramBoolean1, paramBoolean2, 0);
  }

  public void a(String paramString, boolean paramBoolean1, boolean paramBoolean2, int paramInt)
  {
    if (paramString == null)
      return;
    this.b.b(new Runnable(paramBoolean1, paramString, paramInt, paramBoolean2)
    {
      public void run()
      {
        if (this.a)
        {
          if (!m.b(m.this).containsKey(this.b));
        }
        else
          do
            return;
          while (m.a(m.this).containsKey(this.b));
        int i = this.c;
        if ((i != 0) && ((Long)m.c(m.this).get(this.b) != null))
        {
          i = 0;
          m.c(m.this).remove(this.b);
        }
        while (true)
        {
          o localo = new o(this.b, this.a, i);
          if (this.a)
            m.b(m.this).put(this.b, localo);
          while (true)
          {
            localo.b = new o.a()
            {
              public void a(o paramo)
              {
                m.m(m.this).b(new Runnable()
                {
                  public void run()
                  {
                    o localo;
                    if (m.3.this.a)
                    {
                      m.b(m.this).remove(m.3.this.b);
                      if (m.l(m.this) != null)
                        m.l(m.this).a(m.3.this.b, m.3.this.a);
                      if (!m.3.this.d)
                        break label211;
                      m.f(m.this);
                      if (m.g(m.this) < 1)
                      {
                        localo = (o)m.e(m.this).poll();
                        if (localo != null)
                        {
                          m.h(m.this);
                          localo.a();
                        }
                      }
                    }
                    label211: 
                    do
                    {
                      do
                      {
                        return;
                        m.a(m.this).remove(m.3.this.b);
                        break;
                        m.i(m.this);
                      }
                      while (m.j(m.this) >= 1);
                      localo = (o)m.d(m.this).poll();
                    }
                    while (localo == null);
                    m.k(m.this);
                    localo.a();
                  }
                });
              }
            };
            if (!this.d)
              break;
            if (m.g(m.this) < 1)
            {
              m.h(m.this);
              localo.a();
              return;
              m.a(m.this).put(this.b, localo);
              continue;
            }
            m.e(m.this).add(localo);
            return;
          }
          if (m.j(m.this) < 1)
          {
            m.k(m.this);
            localo.a();
            return;
          }
          m.d(m.this).add(localo);
          return;
        }
      }
    });
  }

  public void a(HashMap<Integer, File> paramHashMap)
  {
    this.a = paramHashMap;
  }

  public void a(a parama)
  {
    this.l = parama;
  }

  public void a(g.az paramaz)
  {
    a(null, paramaz.c, null);
  }

  public void a(g.az paramaz, String paramString, boolean paramBoolean)
  {
    g.x localx = paramaz.c;
    int i1 = paramaz.f;
    if ((paramBoolean) || ((paramaz != null) && (paramaz.f == 0)) || (paramaz.c.f != null));
    for (paramBoolean = true; ; paramBoolean = false)
    {
      a(null, localx, paramString, i1, false, paramBoolean);
      return;
    }
  }

  public void a(g.q paramq)
  {
    a(paramq, null, null);
  }

  public void a(g.q paramq, boolean paramBoolean1, boolean paramBoolean2)
  {
    if ((paramBoolean2) || ((paramq != null) && (paramq.l != null)));
    for (paramBoolean2 = true; ; paramBoolean2 = false)
    {
      a(paramq, null, null, 0, paramBoolean1, paramBoolean2);
      return;
    }
  }

  public void a(g.x paramx, String paramString)
  {
    a(null, paramx, paramString);
  }

  public void a(g.x paramx, String paramString, int paramInt, boolean paramBoolean)
  {
    if ((paramBoolean) || (paramInt == 0) || ((paramx != null) && (paramx.f != null)));
    for (paramBoolean = true; ; paramBoolean = false)
    {
      a(null, paramx, paramString, paramInt, true, paramBoolean);
      return;
    }
  }

  public boolean a(String paramString)
  {
    Semaphore localSemaphore = new Semaphore(0);
    Boolean[] arrayOfBoolean = new Boolean[1];
    this.b.b(new Runnable(arrayOfBoolean, paramString, localSemaphore)
    {
      public void run()
      {
        this.a[0] = Boolean.valueOf(m.n(m.this).containsKey(this.b));
        this.c.release();
      }
    });
    try
    {
      localSemaphore.acquire();
      return arrayOfBoolean[0].booleanValue();
    }
    catch (Exception paramString)
    {
      while (true)
        n.a("tmessages", paramString);
    }
  }

  public File b(int paramInt)
  {
    File localFile2 = (File)this.a.get(Integer.valueOf(paramInt));
    File localFile1 = localFile2;
    if (localFile2 == null)
    {
      localFile1 = localFile2;
      if (paramInt != 4)
        localFile1 = (File)this.a.get(Integer.valueOf(4));
    }
    try
    {
      if (!localFile1.isDirectory())
        localFile1.mkdirs();
      return localFile1;
    }
    catch (Exception localException)
    {
    }
    return localFile1;
  }

  public void b(ArrayList<File> paramArrayList, int paramInt)
  {
    if ((paramArrayList == null) || (paramArrayList.isEmpty()))
      return;
    this.b.b(new Runnable(paramArrayList, paramInt)
    {
      public void run()
      {
        int i = 0;
        while (true)
          if (i < this.a.size())
          {
            File localFile = (File)this.a.get(i);
            if (localFile.exists());
            try
            {
              if (!localFile.delete())
                localFile.deleteOnExit();
            }
            catch (Exception localException2)
            {
              try
              {
                while (true)
                {
                  localFile = new File(localFile.getParentFile(), "q_" + localFile.getName());
                  if ((localFile.exists()) && (!localFile.delete()))
                    localFile.deleteOnExit();
                  i += 1;
                  break;
                  localException2 = localException2;
                  n.a("tmessages", localException2);
                }
              }
              catch (Exception localException1)
              {
                while (true)
                  n.a("tmessages", localException1);
              }
            }
          }
        if (this.b == 2)
          p.a().d();
      }
    });
  }

  public static abstract interface a
  {
    public abstract void a(String paramString, int paramInt);

    public abstract void a(String paramString, File paramFile, int paramInt);

    public abstract void a(String paramString, boolean paramBoolean);
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.m
 * JD-Core Version:    0.6.0
 */