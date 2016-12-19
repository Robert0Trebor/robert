package org.vidogram.messenger.d;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Locale;
import org.vidogram.SQLite.SQLiteCursor;
import org.vidogram.SQLite.SQLiteDatabase;
import org.vidogram.SQLite.SQLitePreparedStatement;
import org.vidogram.messenger.a;
import org.vidogram.messenger.ad;
import org.vidogram.messenger.h;
import org.vidogram.messenger.n;
import org.vidogram.messenger.v;
import org.vidogram.messenger.w;
import org.vidogram.messenger.y;
import org.vidogram.tgnet.ConnectionsManager;
import org.vidogram.tgnet.c;
import org.vidogram.tgnet.g.aw;
import org.vidogram.tgnet.g.gc;
import org.vidogram.tgnet.g.ge;
import org.vidogram.tgnet.g.rk;
import org.vidogram.tgnet.g.ro;
import org.vidogram.tgnet.g.to;
import org.vidogram.tgnet.g.tp;
import org.vidogram.tgnet.g.tq;
import org.vidogram.tgnet.g.vw;

public class e
{
  public static ArrayList<g.to> a = new ArrayList();
  public static ArrayList<g.to> b = new ArrayList();
  private static HashMap<Integer, Integer> c = new HashMap();
  private static boolean d;
  private static boolean e;

  public static void a()
  {
    e = false;
    d = false;
    a.clear();
    b.clear();
    c.clear();
    y.a().a(y.ae, new Object[0]);
    y.a().a(y.af, new Object[0]);
  }

  public static void a(int paramInt)
  {
    Object localObject1 = (Integer)c.get(Integer.valueOf(paramInt));
    int i;
    int j;
    if (localObject1 != null)
    {
      i = Math.max(1, (int)(System.currentTimeMillis() / 1000L) - ((Integer)localObject1).intValue());
      j = 0;
      label38: if (j >= b.size())
        break label215;
      localObject1 = (g.to)b.get(j);
      if (((g.to)localObject1).c.c != paramInt)
        break label208;
    }
    while (true)
    {
      Object localObject2 = localObject1;
      if (localObject1 == null)
      {
        localObject2 = new g.to();
        ((g.to)localObject2).c = new g.ro();
        ((g.to)localObject2).c.c = paramInt;
        b.add(localObject2);
      }
      ((g.to)localObject2).d += Math.exp(i / v.a().I);
      Collections.sort(b, new Comparator()
      {
        public int a(g.to paramto1, g.to paramto2)
        {
          if (paramto1.d > paramto2.d)
            return -1;
          if (paramto1.d < paramto2.d)
            return 1;
          return 0;
        }
      });
      if (b.size() > 20)
        b.remove(b.size() - 1);
      b(paramInt, 1, ((g.to)localObject2).d);
      y.a().a(y.af, new Object[0]);
      return;
      i = 60;
      break;
      label208: j += 1;
      break label38;
      label215: localObject1 = null;
    }
  }

  private static void a(int paramInt1, int paramInt2)
  {
    w.a().c().b(new Runnable(paramInt1, paramInt2)
    {
      public void run()
      {
        try
        {
          w.a().b().a(String.format(Locale.US, "DELETE FROM chat_hints WHERE did = %d AND type = %d", new Object[] { Integer.valueOf(this.a), Integer.valueOf(this.b) })).c().e();
          return;
        }
        catch (Exception localException)
        {
          n.a("tmessages", localException);
        }
      }
    });
  }

  public static void a(long paramLong)
  {
    int i = (int)paramLong;
    if (i <= 0);
    while (true)
    {
      return;
      if (i > 0);
      for (g.vw localvw = v.a().a(Integer.valueOf(i)); (localvw != null) && (!localvw.r); localvw = null)
      {
        w.a().c().b(new Runnable(paramLong, i)
        {
          public void run()
          {
            int i = 0;
            double d2 = 0.0D;
            double d3 = d2;
            try
            {
              SQLiteCursor localSQLiteCursor = w.a().b().b(String.format(Locale.US, "SELECT MAX(mid), MAX(date) FROM messages WHERE uid = %d AND out = 1", new Object[] { Long.valueOf(this.a) }), new Object[0]);
              d3 = d2;
              if (localSQLiteCursor.a())
              {
                d3 = d2;
                i = localSQLiteCursor.b(0);
                d3 = d2;
                j = localSQLiteCursor.b(1);
                d3 = d2;
                localSQLiteCursor.b();
                d1 = d2;
                if (i > 0)
                {
                  d3 = d2;
                  localSQLiteCursor = w.a().b().b(String.format(Locale.US, "SELECT date FROM messages WHERE uid = %d AND mid < %d AND out = 1 ORDER BY date DESC", new Object[] { Long.valueOf(this.a), Integer.valueOf(i) }), new Object[0]);
                  d1 = d2;
                  d3 = d2;
                  if (localSQLiteCursor.a())
                  {
                    d3 = d2;
                    d1 = j - localSQLiteCursor.b(0);
                  }
                  d3 = d1;
                  localSQLiteCursor.b();
                }
                a.a(new Runnable(d1)
                {
                  public void run()
                  {
                    int i = 0;
                    Object localObject2;
                    if (i < e.a.size())
                    {
                      localObject2 = (g.to)e.a.get(i);
                      if (e.6.this.b < 0)
                      {
                        localObject1 = localObject2;
                        if (((g.to)localObject2).c.d != -e.6.this.b)
                        {
                          localObject1 = localObject2;
                          if (((g.to)localObject2).c.b == -e.6.this.b);
                        }
                      }
                      else
                      {
                        if ((e.6.this.b <= 0) || (((g.to)localObject2).c.c != e.6.this.b))
                          break label227;
                      }
                    }
                    for (Object localObject1 = localObject2; ; localObject1 = null)
                    {
                      localObject2 = localObject1;
                      if (localObject1 == null)
                      {
                        localObject2 = new g.to();
                        if (e.6.this.b <= 0)
                          break label234;
                        ((g.to)localObject2).c = new g.ro();
                        ((g.to)localObject2).c.c = e.6.this.b;
                      }
                      while (true)
                      {
                        e.a.add(localObject2);
                        ((g.to)localObject2).d += Math.exp(this.a / v.a().I);
                        Collections.sort(e.a, new Comparator()
                        {
                          public int a(g.to paramto1, g.to paramto2)
                          {
                            if (paramto1.d > paramto2.d)
                              return -1;
                            if (paramto1.d < paramto2.d)
                              return 1;
                            return 0;
                          }
                        });
                        e.a((int)e.6.this.a, 0, ((g.to)localObject2).d);
                        y.a().a(y.ae, new Object[0]);
                        return;
                        label227: i += 1;
                        break;
                        label234: ((g.to)localObject2).c = new g.rk();
                        ((g.to)localObject2).c.d = (-e.6.this.b);
                      }
                    }
                  }
                });
                return;
              }
            }
            catch (Exception localException)
            {
              while (true)
              {
                n.a("tmessages", localException);
                double d1 = d3;
                continue;
                int j = 0;
              }
            }
          }
        });
        return;
      }
    }
  }

  public static void a(boolean paramBoolean)
  {
    if (e);
    while (true)
    {
      return;
      if (!paramBoolean)
        break;
      if (d)
        continue;
      e = true;
      w.a().c().b(new Runnable()
      {
        public void run()
        {
          ArrayList localArrayList1 = new ArrayList();
          ArrayList localArrayList2 = new ArrayList();
          HashMap localHashMap = new HashMap();
          ArrayList localArrayList3 = new ArrayList();
          ArrayList localArrayList4 = new ArrayList();
          ArrayList localArrayList5;
          ArrayList localArrayList6;
          SQLiteCursor localSQLiteCursor;
          while (true)
          {
            int i;
            int j;
            g.to localto;
            try
            {
              localArrayList5 = new ArrayList();
              localArrayList6 = new ArrayList();
              localSQLiteCursor = w.a().b().b("SELECT did, type, rating, date FROM chat_hints WHERE 1 ORDER BY rating DESC", new Object[0]);
              if (!localSQLiteCursor.a())
                break;
              i = localSQLiteCursor.b(0);
              j = localSQLiteCursor.b(1);
              localto = new g.to();
              localto.d = localSQLiteCursor.c(2);
              if (i > 0)
              {
                localto.c = new g.ro();
                localto.c.c = i;
                localArrayList5.add(Integer.valueOf(i));
                if (j != 0)
                  break label214;
                localArrayList1.add(localto);
                continue;
              }
            }
            catch (Exception localException)
            {
              n.a("tmessages", localException);
              return;
            }
            localto.c = new g.rk();
            localto.c.d = (-i);
            localArrayList6.add(Integer.valueOf(-i));
            continue;
            label214: if (j != 1)
              continue;
            localArrayList2.add(localto);
            localHashMap.put(Integer.valueOf(i), Integer.valueOf(localSQLiteCursor.b(3)));
          }
          localSQLiteCursor.b();
          if (!localArrayList5.isEmpty())
            w.a().a(TextUtils.join(",", localArrayList5), localArrayList3);
          if (!localArrayList6.isEmpty())
            w.a().b(TextUtils.join(",", localArrayList6), localArrayList4);
          a.a(new Runnable(localArrayList3, localArrayList4, localException, localArrayList2, localHashMap)
          {
            public void run()
            {
              v.a().a(this.a, true);
              v.a().b(this.b, true);
              e.b(false);
              e.c(true);
              e.a = this.c;
              e.b = this.d;
              e.a(this.e);
              y.a().a(y.ae, new Object[0]);
              y.a().a(y.af, new Object[0]);
              if (Math.abs(ad.s - (int)(System.currentTimeMillis() / 1000L)) >= 86400)
                e.a(false);
            }
          });
        }
      });
      d = true;
      return;
    }
    e = true;
    g.gc localgc = new g.gc();
    localgc.k = 0;
    localgc.e = false;
    localgc.d = true;
    localgc.g = false;
    localgc.h = false;
    localgc.f = true;
    localgc.i = 0;
    localgc.j = 20;
    ConnectionsManager.a().a(localgc, new c()
    {
    });
  }

  public static void b(int paramInt)
  {
    int i = 0;
    while (true)
    {
      if (i < b.size())
      {
        if (((g.to)b.get(i)).c.c == paramInt)
        {
          b.remove(i);
          g.ge localge = new g.ge();
          localge.c = new g.tp();
          localge.d = v.c(paramInt);
          ConnectionsManager.a().a(localge, new c()
          {
          });
          a(paramInt, 1);
          y.a().a(y.af, new Object[0]);
        }
      }
      else
        return;
      i += 1;
    }
  }

  private static void b(int paramInt1, int paramInt2, double paramDouble)
  {
    w.a().c().b(new Runnable(paramInt1, paramInt2, paramDouble)
    {
      public void run()
      {
        try
        {
          SQLitePreparedStatement localSQLitePreparedStatement = w.a().b().a("REPLACE INTO chat_hints VALUES(?, ?, ?, ?)");
          localSQLitePreparedStatement.d();
          localSQLitePreparedStatement.a(1, this.a);
          localSQLitePreparedStatement.a(2, this.b);
          localSQLitePreparedStatement.a(3, this.c);
          localSQLitePreparedStatement.a(4, (int)System.currentTimeMillis() / 1000);
          localSQLitePreparedStatement.b();
          localSQLitePreparedStatement.e();
          return;
        }
        catch (Exception localException)
        {
          n.a("tmessages", localException);
        }
      }
    });
  }

  public static void c(int paramInt)
  {
    int i = 0;
    while (true)
    {
      if (i < a.size())
      {
        if (((g.to)a.get(i)).c.c == paramInt)
        {
          a.remove(i);
          y.a().a(y.ae, new Object[0]);
          g.ge localge = new g.ge();
          localge.c = new g.tq();
          localge.d = v.c(paramInt);
          a(paramInt, 0);
          ConnectionsManager.a().a(localge, new c()
          {
          });
        }
      }
      else
        return;
      i += 1;
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.d.e
 * JD-Core Version:    0.6.0
 */