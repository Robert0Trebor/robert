package org.vidogram.ui.b;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;
import org.vidogram.SQLite.SQLiteCursor;
import org.vidogram.SQLite.SQLiteDatabase;
import org.vidogram.SQLite.SQLitePreparedStatement;
import org.vidogram.messenger.h;
import org.vidogram.messenger.r;
import org.vidogram.messenger.support.widget.LinearLayoutManager;
import org.vidogram.messenger.support.widget.RecyclerView.a;
import org.vidogram.messenger.support.widget.RecyclerView.i;
import org.vidogram.messenger.support.widget.RecyclerView.u;
import org.vidogram.messenger.w;
import org.vidogram.tgnet.ConnectionsManager;
import org.vidogram.tgnet.NativeByteBuffer;
import org.vidogram.tgnet.c;
import org.vidogram.tgnet.g.ar;
import org.vidogram.tgnet.g.aw;
import org.vidogram.tgnet.g.hq;
import org.vidogram.tgnet.g.i;
import org.vidogram.tgnet.g.ky;
import org.vidogram.tgnet.g.qv;
import org.vidogram.tgnet.g.t;
import org.vidogram.tgnet.g.to;
import org.vidogram.tgnet.g.vw;
import org.vidogram.ui.Components.aw;
import org.vidogram.ui.Components.aw.b;
import org.vidogram.ui.Components.aw.c;
import org.vidogram.ui.c.ak;
import org.vidogram.ui.c.x;
import org.vidogram.ui.c.z;

public class j extends d
{
  private Context f;
  private Timer g;
  private ArrayList<org.vidogram.tgnet.f> h = new ArrayList();
  private ArrayList<CharSequence> i = new ArrayList();
  private ArrayList<org.vidogram.messenger.u> j = new ArrayList();
  private ArrayList<String> k = new ArrayList();
  private String l;
  private int m = 0;
  private int n;
  private c o;
  private int p;
  private boolean q;
  private String r;
  private int s = 0;
  private int t;
  private ArrayList<e> u = new ArrayList();
  private HashMap<Long, e> v = new HashMap();

  public j(Context paramContext, int paramInt1, int paramInt2)
  {
    this.f = paramContext;
    this.p = paramInt1;
    this.t = paramInt2;
    k();
    org.vidogram.messenger.d.e.a(true);
  }

  private void a(String paramString, int paramInt)
  {
    if (this.p == 2)
      return;
    w.a().c().b(new Runnable(paramString, paramInt)
    {
      public void run()
      {
        Object localObject3;
        int i;
        String[] arrayOfString;
        Object localObject5;
        Object localObject4;
        ArrayList localArrayList;
        int j;
        HashMap localHashMap;
        long l;
        Object localObject6;
        int k;
        int m;
        while (true)
        {
          try
          {
            localObject3 = this.a.trim().toLowerCase();
            if (((String)localObject3).length() != 0)
              continue;
            j.a(j.this, -1);
            j.a(j.this, new ArrayList(), new ArrayList(), new ArrayList(), j.d(j.this));
            return;
            Object localObject1 = r.a().a((String)localObject3);
            if (((String)localObject3).equals(localObject1))
              break label2447;
            if (((String)localObject1).length() != 0)
              break label2444;
            break label2447;
            arrayOfString = new String[i + 1];
            arrayOfString[0] = localObject3;
            if (localObject1 == null)
              continue;
            arrayOfString[1] = localObject1;
            localObject1 = new ArrayList();
            localObject5 = new ArrayList();
            localObject4 = new ArrayList();
            localArrayList = new ArrayList();
            i = 0;
            j = 0;
            localHashMap = new HashMap();
            localObject3 = w.a().b().b("SELECT did, date FROM dialogs ORDER BY date DESC LIMIT 400", new Object[0]);
            if (!((SQLiteCursor)localObject3).a())
              break;
            l = ((SQLiteCursor)localObject3).d(0);
            localObject6 = new j.b(j.this, null);
            ((j.b)localObject6).b = ((SQLiteCursor)localObject3).b(1);
            localHashMap.put(Long.valueOf(l), localObject6);
            k = (int)l;
            m = (int)(l >> 32);
            if (k == 0)
              break label380;
            if (m != 1)
              break label313;
            if ((j.c(j.this) != 0) || (((ArrayList)localObject5).contains(Integer.valueOf(k))))
              continue;
            ((ArrayList)localObject5).add(Integer.valueOf(k));
            continue;
          }
          catch (Exception localException)
          {
            org.vidogram.messenger.n.a("tmessages", localException);
            return;
          }
          label308: i = 0;
          continue;
          label313: if (k > 0)
          {
            if ((j.c(j.this) == 2) || (localException.contains(Integer.valueOf(k))))
              continue;
            localException.add(Integer.valueOf(k));
            continue;
          }
          if (((ArrayList)localObject5).contains(Integer.valueOf(-k)))
            continue;
          ((ArrayList)localObject5).add(Integer.valueOf(-k));
          continue;
          label380: if ((j.c(j.this) != 0) || (((ArrayList)localObject4).contains(Integer.valueOf(m))))
            continue;
          ((ArrayList)localObject4).add(Integer.valueOf(m));
        }
        ((SQLiteCursor)localObject3).b();
        label469: String str1;
        Object localObject2;
        label508: String str2;
        if (!localException.isEmpty())
        {
          localObject6 = w.a().b().b(String.format(Locale.US, "SELECT data, status, name FROM users WHERE uid IN(%s)", new Object[] { TextUtils.join(",", localException) }), new Object[0]);
          i = j;
          if (((SQLiteCursor)localObject6).a())
          {
            str1 = ((SQLiteCursor)localObject6).e(2);
            localObject2 = r.a().a(str1);
            if (!str1.equals(localObject2))
              break label2441;
            localObject2 = null;
            j = str1.lastIndexOf(";;;");
            if (j == -1)
              break label2435;
            localObject3 = str1.substring(j + 3);
            label531: m = arrayOfString.length;
            k = 0;
            j = 0;
            label540: if (k < m)
            {
              str2 = arrayOfString[k];
              if ((str1.startsWith(str2)) || (str1.contains(" " + str2)))
                break label2460;
              if (localObject2 != null)
              {
                if (((String)localObject2).startsWith(str2))
                  break label2460;
                if (((String)localObject2).contains(" " + str2))
                {
                  break label2460;
                  label636: if (j == 0)
                    break label2468;
                  localObject3 = ((SQLiteCursor)localObject6).g(0);
                  if (localObject3 == null)
                    break label2429;
                  localObject2 = g.vw.a((org.vidogram.tgnet.a)localObject3, ((NativeByteBuffer)localObject3).b(false), false);
                  ((NativeByteBuffer)localObject3).e();
                  localObject3 = (j.b)localHashMap.get(Long.valueOf(((g.vw)localObject2).d));
                  if (((g.vw)localObject2).k != null)
                    ((g.vw)localObject2).k.c = ((SQLiteCursor)localObject6).b(1);
                  if (j != 1)
                    break label772;
                }
              }
              for (((j.b)localObject3).c = org.vidogram.messenger.a.a(((g.vw)localObject2).e, ((g.vw)localObject2).f, str2); ; ((j.b)localObject3).c = org.vidogram.messenger.a.a("@" + ((g.vw)localObject2).g, null, "@" + str2))
              {
                ((j.b)localObject3).a = ((org.vidogram.tgnet.f)localObject2);
                i += 1;
                break label2465;
                if ((localObject3 == null) || (!((String)localObject3).startsWith(str2)))
                  break label2432;
                j = 2;
                break;
              }
            }
          }
          else
          {
            label772: ((SQLiteCursor)localObject6).b();
          }
        }
        else
        {
          j = i;
          if (!((ArrayList)localObject5).isEmpty())
          {
            localObject3 = w.a().b().b(String.format(Locale.US, "SELECT data, name FROM chats WHERE uid IN(%s)", new Object[] { TextUtils.join(",", (Iterable)localObject5) }), new Object[0]);
            label879: 
            while (((SQLiteCursor)localObject3).a())
            {
              localObject5 = ((SQLiteCursor)localObject3).e(1);
              localObject2 = r.a().a((String)localObject5);
              if (!((String)localObject5).equals(localObject2))
                break label2426;
              localObject2 = null;
              k = arrayOfString.length;
              j = 0;
              if (j >= k)
                break label2483;
              localObject6 = arrayOfString[j];
              if ((!((String)localObject5).startsWith((String)localObject6)) && (!((String)localObject5).contains(" " + (String)localObject6)) && ((localObject2 == null) || ((!((String)localObject2).startsWith((String)localObject6)) && (!((String)localObject2).contains(" " + (String)localObject6)))))
                break label2478;
              localObject5 = ((SQLiteCursor)localObject3).g(0);
              if (localObject5 == null)
                continue;
              localObject2 = g.i.a((org.vidogram.tgnet.a)localObject5, ((NativeByteBuffer)localObject5).b(false), false);
              ((NativeByteBuffer)localObject5).e();
              if ((localObject2 == null) || (((g.i)localObject2).g) || ((org.vidogram.messenger.e.d((g.i)localObject2)) && (org.vidogram.messenger.e.c((g.i)localObject2))))
                break label2423;
              if (((g.i)localObject2).h > 0)
                l = -((g.i)localObject2).h;
              while (true)
              {
                localObject5 = (j.b)localHashMap.get(Long.valueOf(l));
                ((j.b)localObject5).c = org.vidogram.messenger.a.a(((g.i)localObject2).i, null, (String)localObject6);
                ((j.b)localObject5).a = ((org.vidogram.tgnet.f)localObject2);
                i += 1;
                break;
                l = org.vidogram.messenger.a.a(((g.i)localObject2).h);
              }
            }
            label918: label924: ((SQLiteCursor)localObject3).b();
            j = i;
          }
          i = j;
          if (!((ArrayList)localObject4).isEmpty())
          {
            localObject4 = w.a().b().b(String.format(Locale.US, "SELECT q.data, u.name, q.user, q.g, q.authkey, q.ttl, u.data, u.status, q.layer, q.seq_in, q.seq_out, q.use_count, q.exchange_id, q.key_date, q.fprint, q.fauthkey, q.khash, q.in_seq_no FROM enc_chats as q INNER JOIN users as u ON q.user = u.uid WHERE q.uid IN(%s)", new Object[] { TextUtils.join(",", (Iterable)localObject4) }), new Object[0]);
            i = j;
            label1209: if (((SQLiteCursor)localObject4).a())
            {
              localObject6 = ((SQLiteCursor)localObject4).e(1);
              localObject2 = r.a().a((String)localObject6);
              if (!((String)localObject6).equals(localObject2))
                break label2420;
              localObject2 = null;
              label1248: localObject3 = null;
              j = ((String)localObject6).lastIndexOf(";;;");
              if (j == -1)
                break label2485;
              localObject3 = ((String)localObject6).substring(j + 2);
              break label2485;
              label1277: if (k < arrayOfString.length)
              {
                localObject5 = arrayOfString[k];
                if ((((String)localObject6).startsWith((String)localObject5)) || (((String)localObject6).contains(" " + (String)localObject5)))
                  break label2492;
                if (localObject2 != null)
                {
                  if (((String)localObject2).startsWith((String)localObject5))
                    break label2492;
                  if (((String)localObject2).contains(" " + (String)localObject5))
                  {
                    break label2492;
                    if (j == 0)
                      break label2500;
                    localObject3 = ((SQLiteCursor)localObject4).g(0);
                    if (localObject3 == null)
                      break label2411;
                    localObject2 = g.t.a((org.vidogram.tgnet.a)localObject3, ((NativeByteBuffer)localObject3).b(false), false);
                    ((NativeByteBuffer)localObject3).e();
                    localObject6 = ((SQLiteCursor)localObject4).g(6);
                    if (localObject6 == null)
                      break label2405;
                    localObject3 = g.vw.a((org.vidogram.tgnet.a)localObject6, ((NativeByteBuffer)localObject6).b(false), false);
                    ((NativeByteBuffer)localObject6).e();
                    if ((localObject2 == null) || (localObject3 == null))
                      break label2402;
                    localObject6 = (j.b)localHashMap.get(Long.valueOf(((g.t)localObject2).b << 32));
                    ((g.t)localObject2).m = ((SQLiteCursor)localObject4).b(2);
                    ((g.t)localObject2).k = ((SQLiteCursor)localObject4).f(3);
                    ((g.t)localObject2).l = ((SQLiteCursor)localObject4).f(4);
                    ((g.t)localObject2).n = ((SQLiteCursor)localObject4).b(5);
                    ((g.t)localObject2).o = ((SQLiteCursor)localObject4).b(8);
                    ((g.t)localObject2).p = ((SQLiteCursor)localObject4).b(9);
                    ((g.t)localObject2).q = ((SQLiteCursor)localObject4).b(10);
                    k = ((SQLiteCursor)localObject4).b(11);
                    ((g.t)localObject2).t = (short)(k >> 16);
                    ((g.t)localObject2).u = (short)k;
                    ((g.t)localObject2).v = ((SQLiteCursor)localObject4).d(12);
                    ((g.t)localObject2).w = ((SQLiteCursor)localObject4).b(13);
                    ((g.t)localObject2).x = ((SQLiteCursor)localObject4).d(14);
                    ((g.t)localObject2).y = ((SQLiteCursor)localObject4).f(15);
                    ((g.t)localObject2).s = ((SQLiteCursor)localObject4).f(16);
                    ((g.t)localObject2).r = ((SQLiteCursor)localObject4).b(17);
                    if (((g.vw)localObject3).k != null)
                      ((g.vw)localObject3).k.c = ((SQLiteCursor)localObject4).b(7);
                    if (j != 1)
                      break label1768;
                  }
                }
                for (((j.b)localObject6).c = org.vidogram.messenger.a.b("<c#ff00a60e>" + org.vidogram.messenger.f.a(((g.vw)localObject3).e, ((g.vw)localObject3).f) + "</c>"); ; ((j.b)localObject6).c = org.vidogram.messenger.a.a("@" + ((g.vw)localObject3).g, null, "@" + (String)localObject5))
                {
                  ((j.b)localObject6).a = ((org.vidogram.tgnet.f)localObject2);
                  localArrayList.add(localObject3);
                  i += 1;
                  break label2497;
                  if ((localObject3 == null) || (!((String)localObject3).startsWith((String)localObject5)))
                    break label2417;
                  j = 2;
                  break;
                }
              }
            }
            else
            {
              label1374: label1768: ((SQLiteCursor)localObject4).b();
            }
          }
          else
          {
            label1410: label1443: localObject2 = new ArrayList(i);
            localObject3 = localHashMap.values().iterator();
            while (((Iterator)localObject3).hasNext())
            {
              localObject4 = (j.b)((Iterator)localObject3).next();
              if ((((j.b)localObject4).a == null) || (((j.b)localObject4).c == null))
                continue;
              ((ArrayList)localObject2).add(localObject4);
            }
            Collections.sort((List)localObject2, new Comparator()
            {
              public int a(j.b paramb1, j.b paramb2)
              {
                if (paramb1.b < paramb2.b)
                  return 1;
                if (paramb1.b > paramb2.b)
                  return -1;
                return 0;
              }
            });
            localObject4 = new ArrayList();
            localObject5 = new ArrayList();
            i = 0;
            while (i < ((ArrayList)localObject2).size())
            {
              localObject3 = (j.b)((ArrayList)localObject2).get(i);
              ((ArrayList)localObject4).add(((j.b)localObject3).a);
              ((ArrayList)localObject5).add(((j.b)localObject3).c);
              i += 1;
            }
            if (j.c(j.this) != 2)
              localObject6 = w.a().b().b("SELECT u.data, u.status, u.name, u.uid FROM users as u INNER JOIN contacts as c ON u.uid = c.uid", new Object[0]);
          }
        }
        label2067: label2090: label2475: label2478: label2483: label2485: label2492: label2497: label2500: label2507: label2512: label2519: 
        while (true)
        {
          label2010: if (((SQLiteCursor)localObject6).a())
          {
            if (localHashMap.containsKey(Long.valueOf(((SQLiteCursor)localObject6).b(3))))
              continue;
            str1 = ((SQLiteCursor)localObject6).e(2);
            localObject2 = r.a().a(str1);
            if (!str1.equals(localObject2))
              break label2399;
            localObject2 = null;
            i = str1.lastIndexOf(";;;");
            if (i == -1)
              break label2393;
            localObject3 = str1.substring(i + 3);
            m = arrayOfString.length;
            k = 0;
            j = 0;
          }
          while (true)
          {
            if (j >= m)
              break label2519;
            str2 = arrayOfString[j];
            if ((!str1.startsWith(str2)) && (!str1.contains(" " + str2)))
              if (localObject2 != null)
              {
                if (((String)localObject2).startsWith(str2))
                  break label2507;
                if (((String)localObject2).contains(" " + str2))
                  break label2507;
              }
            while (true)
            {
              if (i == 0)
                break label2512;
              localObject2 = ((SQLiteCursor)localObject6).g(0);
              if (localObject2 == null)
                break label2010;
              localObject3 = g.vw.a((org.vidogram.tgnet.a)localObject2, ((NativeByteBuffer)localObject2).b(false), false);
              ((NativeByteBuffer)localObject2).e();
              if (((g.vw)localObject3).k != null)
                ((g.vw)localObject3).k.c = ((SQLiteCursor)localObject6).b(1);
              if (i == 1)
                ((ArrayList)localObject5).add(org.vidogram.messenger.a.a(((g.vw)localObject3).e, ((g.vw)localObject3).f, str2));
              while (true)
              {
                ((ArrayList)localObject4).add(localObject3);
                break;
                i = k;
                if (localObject3 == null)
                  break label2195;
                i = k;
                if (!((String)localObject3).startsWith(str2))
                  break label2195;
                i = 2;
                break label2195;
                ((ArrayList)localObject5).add(org.vidogram.messenger.a.a("@" + ((g.vw)localObject3).g, null, "@" + str2));
              }
              ((SQLiteCursor)localObject6).b();
              j.a(j.this, (ArrayList)localObject4, (ArrayList)localObject5, localArrayList, this.b);
              return;
              label2393: localObject3 = null;
              break label2090;
              label2399: break label2067;
              label2402: break label2497;
              label2405: localObject3 = null;
              break label1443;
              label2411: localObject2 = null;
              break label1410;
              label2417: break label1374;
              label2420: break label1248;
              label2423: break label2475;
              label2426: break label918;
              label2429: break label2465;
              break label636;
              localObject3 = null;
              break label531;
              break label508;
              break label2450;
              localObject2 = null;
              if (localObject2 == null)
                break label308;
              i = 1;
              break;
              j = 1;
              break label636;
              break label469;
              k += 1;
              break label540;
              break label879;
              j += 1;
              break label924;
              break label879;
              k = 0;
              j = 0;
              break label1277;
              j = 1;
              break label1374;
              break label1209;
              k += 1;
              break label1277;
              i = 1;
            }
            j += 1;
            k = i;
          }
        }
      }
    });
  }

  private void a(ArrayList<org.vidogram.tgnet.f> paramArrayList, ArrayList<CharSequence> paramArrayList1, ArrayList<g.vw> paramArrayList2, int paramInt)
  {
    org.vidogram.messenger.a.a(new Runnable(paramInt, paramArrayList, paramArrayList2, paramArrayList1)
    {
      public void run()
      {
        if (this.a != j.d(j.this))
          return;
        int i = 0;
        if (i < this.b.size())
        {
          Object localObject = (org.vidogram.tgnet.f)this.b.get(i);
          if ((localObject instanceof g.vw))
          {
            localObject = (g.vw)localObject;
            org.vidogram.messenger.v.a().a((g.vw)localObject, true);
          }
          while (true)
          {
            i += 1;
            break;
            if ((localObject instanceof g.i))
            {
              localObject = (g.i)localObject;
              org.vidogram.messenger.v.a().a((g.i)localObject, true);
              continue;
            }
            if (!(localObject instanceof g.t))
              continue;
            localObject = (g.t)localObject;
            org.vidogram.messenger.v.a().a((g.t)localObject, true);
          }
        }
        org.vidogram.messenger.v.a().a(this.c, true);
        j.a(j.this, this.b);
        j.b(j.this, this.d);
        j.this.c();
      }
    });
  }

  private void b(String paramString)
  {
    if ((this.p == 0) || (((this.r == null) || (this.r.length() == 0)) && ((paramString == null) || (paramString.length() == 0))));
    while (true)
    {
      return;
      if (this.m != 0)
      {
        ConnectionsManager.a().a(this.m, true);
        this.m = 0;
      }
      if ((paramString != null) && (paramString.length() != 0))
        break;
      this.j.clear();
      this.n = 0;
      this.r = null;
      c();
      if (this.o == null)
        continue;
      this.o.a(false);
      return;
    }
    g.qv localqv = new g.qv();
    localqv.g = 20;
    localqv.c = paramString;
    org.vidogram.messenger.u localu;
    int i1;
    if ((this.r != null) && (paramString.equals(this.r)) && (!this.j.isEmpty()))
    {
      localu = (org.vidogram.messenger.u)this.j.get(this.j.size() - 1);
      localqv.f = localu.q();
      localqv.d = localu.a.e;
      if (localu.a.d.b != 0)
        i1 = -localu.a.d.b;
    }
    for (localqv.e = org.vidogram.messenger.v.c(i1); ; localqv.e = new g.ky())
    {
      this.r = paramString;
      i1 = this.n + 1;
      this.n = i1;
      if (this.o != null)
        this.o.a(true);
      this.m = ConnectionsManager.a().a(localqv, new c(i1, localqv)
      {
      }
      , 2);
      return;
      if (localu.a.d.d != 0)
      {
        i1 = -localu.a.d.d;
        break;
      }
      i1 = localu.a.d.c;
      break;
      localqv.d = 0;
      localqv.f = 0;
    }
  }

  private void b(ArrayList<e> paramArrayList, HashMap<Long, e> paramHashMap)
  {
    this.u = paramArrayList;
    this.v = paramHashMap;
    int i1 = 0;
    if (i1 < this.u.size())
    {
      paramArrayList = (e)this.u.get(i1);
      if ((paramArrayList.a instanceof g.vw))
        org.vidogram.messenger.v.a().a((g.vw)paramArrayList.a, true);
      while (true)
      {
        i1 += 1;
        break;
        if ((paramArrayList.a instanceof g.i))
        {
          org.vidogram.messenger.v.a().a((g.i)paramArrayList.a, true);
          continue;
        }
        if (!(paramArrayList.a instanceof g.t))
          continue;
        org.vidogram.messenger.v.a().a((g.t)paramArrayList.a, true);
      }
    }
    c();
  }

  public int a()
  {
    int i3 = 0;
    int i2 = 0;
    int i1;
    if (j())
      if (!this.u.isEmpty())
      {
        i1 = this.u.size() + 1;
        if (!org.vidogram.messenger.d.e.a.isEmpty())
          i2 = 2;
        i2 = i1 + i2;
      }
    int i4;
    do
    {
      return i2;
      i1 = 0;
      break;
      if (!this.k.isEmpty())
        return this.k.size() + 1;
      i2 = this.h.size();
      int i5 = this.a.size();
      i4 = this.j.size();
      i1 = i2;
      if (i5 != 0)
        i1 = i2 + (i5 + 1);
      i2 = i1;
    }
    while (i4 == 0);
    if (this.q);
    for (i2 = i3; ; i2 = 1)
      return i1 + (i2 + (i4 + 1));
  }

  public int a(int paramInt)
  {
    int i1 = 2;
    if (j())
      if (!org.vidogram.messenger.d.e.a.isEmpty())
      {
        if (paramInt > i1)
          break label43;
        if ((paramInt != i1) && (paramInt % 2 != 0))
          break label41;
      }
    label41: label43: label61: int i3;
    int i2;
    label133: label146: 
    do
    {
      do
      {
        return 1;
        i1 = 0;
        break;
        return 5;
        return 0;
        if (this.k.isEmpty())
          break label61;
      }
      while (paramInt == 0);
      return 4;
      i3 = this.h.size();
      if (this.a.isEmpty())
      {
        i1 = 0;
        if (!this.j.isEmpty())
          break label133;
      }
      for (i2 = 0; ; i2 = this.j.size() + 1)
      {
        if (((paramInt < 0) || (paramInt >= i3)) && ((paramInt <= i3) || (paramInt >= i1 + i3)))
          break label146;
        return 0;
        i1 = this.a.size() + 1;
        break;
      }
      if ((paramInt > i1 + i3) && (paramInt < i1 + i3 + i2))
        return 2;
    }
    while ((i2 == 0) || (paramInt != i1 + i3 + i2));
    return 3;
  }

  public RecyclerView.u a(ViewGroup paramViewGroup, int paramInt)
  {
    switch (paramInt)
    {
    default:
      paramViewGroup = null;
      if (paramInt != 5)
        break;
      paramViewGroup.setLayoutParams(new RecyclerView.i(-1, org.vidogram.messenger.a.a(100.0F)));
    case 0:
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    }
    while (true)
    {
      return new d(paramViewGroup);
      paramViewGroup = new ak(this.f);
      paramViewGroup.setBackgroundResource(2130837946);
      break;
      paramViewGroup = new org.vidogram.ui.c.u(this.f);
      break;
      paramViewGroup = new org.vidogram.ui.c.n(this.f);
      break;
      paramViewGroup = new z(this.f);
      break;
      paramViewGroup = new org.vidogram.ui.c.v(this.f);
      break;
      paramViewGroup = new aw(this.f)
      {
        public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
        {
          if ((getParent() != null) && (getParent().getParent() != null))
            getParent().getParent().requestDisallowInterceptTouchEvent(true);
          return super.onInterceptTouchEvent(paramMotionEvent);
        }
      };
      paramViewGroup.setTag(Integer.valueOf(9));
      paramViewGroup.setItemAnimator(null);
      paramViewGroup.setLayoutAnimation(null);
      11 local11 = new LinearLayoutManager(this.f)
      {
        public boolean c()
        {
          return false;
        }
      };
      local11.b(0);
      paramViewGroup.setLayoutManager(local11);
      paramViewGroup.setAdapter(new a(null));
      paramViewGroup.setOnItemClickListener(new aw.b()
      {
        public void a(View paramView, int paramInt)
        {
          if (j.b(j.this) != null)
            j.b(j.this).a(((Integer)paramView.getTag()).intValue());
        }
      });
      paramViewGroup.setOnItemLongClickListener(new aw.c()
      {
        public boolean a(View paramView, int paramInt)
        {
          if (j.b(j.this) != null)
            j.b(j.this).b(((Integer)paramView.getTag()).intValue());
          return true;
        }
      });
      break;
      paramViewGroup.setLayoutParams(new RecyclerView.i(-1, -2));
    }
  }

  public void a(long paramLong, org.vidogram.tgnet.f paramf)
  {
    e locale = (e)this.v.get(Long.valueOf(paramLong));
    if (locale == null)
    {
      locale = new e();
      this.v.put(Long.valueOf(paramLong), locale);
    }
    while (true)
    {
      this.u.add(0, locale);
      locale.c = paramLong;
      locale.a = paramf;
      locale.b = (int)(System.currentTimeMillis() / 1000L);
      c();
      w.a().c().b(new Runnable(paramLong)
      {
        public void run()
        {
          try
          {
            SQLitePreparedStatement localSQLitePreparedStatement = w.a().b().a("REPLACE INTO search_recent VALUES(?, ?)");
            localSQLitePreparedStatement.d();
            localSQLitePreparedStatement.a(1, this.a);
            localSQLitePreparedStatement.a(2, (int)(System.currentTimeMillis() / 1000L));
            localSQLitePreparedStatement.b();
            localSQLitePreparedStatement.e();
            return;
          }
          catch (Exception localException)
          {
            org.vidogram.messenger.n.a("tmessages", localException);
          }
        }
      });
      return;
      this.u.remove(locale);
    }
  }

  public void a(String paramString)
  {
    if ((paramString != null) && (this.l != null) && (paramString.equals(this.l)))
      return;
    this.l = paramString;
    try
    {
      if (this.g != null)
      {
        this.g.cancel();
        this.g = null;
      }
      if ((paramString == null) || (paramString.length() == 0))
      {
        this.e = false;
        this.h.clear();
        this.i.clear();
        this.k.clear();
        if (this.p != 2)
          a(null, true);
        b(null);
        c();
        return;
      }
    }
    catch (Exception localException)
    {
      while (true)
        org.vidogram.messenger.n.a("tmessages", localException);
      if ((this.p != 2) && (paramString.startsWith("#")) && (paramString.length() == 1))
      {
        this.q = true;
        if (!this.e)
        {
          d();
          if (this.o != null)
            this.o.a(true);
          c();
          return;
        }
        this.j.clear();
        this.k.clear();
        i1 = 0;
        while (i1 < this.c.size())
        {
          this.k.add(((d.a)this.c.get(i1)).a);
          i1 += 1;
        }
        if (this.o != null)
          this.o.a(false);
        c();
        return;
      }
      this.k.clear();
      c();
      int i1 = this.s + 1;
      this.s = i1;
      this.g = new Timer();
      this.g.schedule(new TimerTask(paramString, i1)
      {
        public void run()
        {
          try
          {
            cancel();
            j.e(j.this).cancel();
            j.a(j.this, null);
            j.a(j.this, this.a, this.b);
            org.vidogram.messenger.a.a(new Runnable()
            {
              public void run()
              {
                if (j.f(j.this) != 2)
                  j.this.a(j.9.this.a, true);
                j.a(j.this, j.9.this.a);
              }
            });
            return;
          }
          catch (Exception localException)
          {
            while (true)
              org.vidogram.messenger.n.a("tmessages", localException);
          }
        }
      }
      , 200L, 300L);
    }
  }

  protected void a(ArrayList<d.a> paramArrayList, HashMap<String, d.a> paramHashMap)
  {
    super.a(paramArrayList, paramHashMap);
    int i1 = 0;
    while (i1 < paramArrayList.size())
    {
      this.k.add(((d.a)paramArrayList.get(i1)).a);
      i1 += 1;
    }
    if (this.o != null)
      this.o.a(false);
    c();
  }

  public void a(RecyclerView.u paramu, int paramInt)
  {
    Object localObject6 = null;
    boolean bool3 = true;
    boolean bool1 = true;
    int i1 = 0;
    boolean bool2 = false;
    ak localak;
    Object localObject1;
    Object localObject2;
    Object localObject3;
    label120: Object localObject4;
    switch (paramu.h())
    {
    case 3:
    default:
      return;
    case 0:
      localak = (ak)paramu.a;
      localObject1 = f(paramInt);
      if ((localObject1 instanceof g.vw))
      {
        localObject2 = (g.vw)localObject1;
        paramu = ((g.vw)localObject2).g;
        localObject1 = null;
        localObject3 = null;
        if (!j())
          break label270;
        if (paramInt != a() - 1)
        {
          bool1 = true;
          localak.a = bool1;
          bool1 = true;
          paramu = null;
          localObject4 = localObject6;
          label136: if (localObject2 == null)
            break label561;
          label141: localak.a((org.vidogram.tgnet.f)localObject2, (g.t)localObject3, (CharSequence)localObject4, paramu, bool1);
          return;
        }
      }
      else
      {
        if (!(localObject1 instanceof g.i))
          break;
        paramu = org.vidogram.messenger.v.a().b(Integer.valueOf(((g.i)localObject1).h));
        if (paramu != null)
          break label888;
        paramu = (g.i)localObject1;
      }
    case 1:
    case 2:
    case 4:
    case 5:
    }
    label270: label291: label440: label446: label858: label888: 
    while (true)
    {
      localObject3 = paramu.v;
      localObject1 = paramu;
      localObject2 = null;
      paramu = (RecyclerView.u)localObject3;
      localObject3 = null;
      break;
      if ((localObject1 instanceof g.t))
      {
        localObject3 = org.vidogram.messenger.v.a().c(Integer.valueOf(((g.t)localObject1).b));
        localObject2 = org.vidogram.messenger.v.a().a(Integer.valueOf(((g.t)localObject3).m));
        localObject1 = null;
        paramu = null;
        break;
        bool1 = false;
        break label120;
        int i2 = this.h.size();
        if (this.a.isEmpty())
        {
          i1 = 0;
          if ((paramInt == a() - 1) || (paramInt == i2 - 1) || (paramInt == i1 + i2 - 1))
            break label440;
        }
        for (bool1 = true; ; bool1 = false)
        {
          localak.a = bool1;
          if (paramInt >= this.h.size())
            break label446;
          paramu = (CharSequence)this.i.get(paramInt);
          if ((paramu == null) || (localObject2 == null) || (((g.vw)localObject2).g == null) || (((g.vw)localObject2).g.length() <= 0) || (!paramu.toString().startsWith("@" + ((g.vw)localObject2).g)))
            break label858;
          localObject4 = localObject6;
          bool1 = bool2;
          break;
          i1 = this.a.size() + 1;
          break label291;
        }
        if ((paramInt > this.h.size()) && (paramu != null))
        {
          localObject4 = this.b;
          if (((String)localObject4).startsWith("@"))
            localObject4 = ((String)localObject4).substring(1);
          while (true)
          {
            try
            {
              localObject4 = org.vidogram.messenger.a.b(String.format("<c#ff4d83b3>@%s</c>%s", new Object[] { paramu.substring(0, ((String)localObject4).length()), paramu.substring(((String)localObject4).length()) }));
              paramu = (RecyclerView.u)localObject4;
              localObject4 = localObject6;
              bool1 = bool2;
            }
            catch (Exception localObject5)
            {
              org.vidogram.messenger.n.a("tmessages", localException);
              localObject5 = localObject6;
              bool1 = bool2;
            }
            break;
            localObject2 = localObject1;
            break label141;
            paramu = (org.vidogram.ui.c.u)paramu.a;
            if (j())
            {
              if (!org.vidogram.messenger.d.e.a.isEmpty())
                i1 = 2;
              if (paramInt < i1)
              {
                paramu.setText(r.a("ChatHints", 2131231050).toUpperCase());
                return;
              }
              paramu.setText(r.a("Recent", 2131231708).toUpperCase());
              return;
            }
            if (!this.k.isEmpty())
            {
              paramu.setText(r.a("Hashtags", 2131231288).toUpperCase());
              return;
            }
            if ((!this.a.isEmpty()) && (paramInt == this.h.size()))
            {
              paramu.setText(r.a("GlobalSearch", 2131231275));
              return;
            }
            paramu.setText(r.a("SearchMessages", 2131231772));
            return;
            paramu = (org.vidogram.ui.c.n)paramu.a;
            if (paramInt != a() - 1);
            while (true)
            {
              paramu.a = bool1;
              localObject1 = (org.vidogram.messenger.u)f(paramInt);
              paramu.a(((org.vidogram.messenger.u)localObject1).u(), (org.vidogram.messenger.u)localObject1, ((org.vidogram.messenger.u)localObject1).a.e);
              return;
              bool1 = false;
            }
            paramu = (org.vidogram.ui.c.v)paramu.a;
            paramu.setText((CharSequence)this.k.get(paramInt - 1));
            if (paramInt != this.k.size());
            for (bool1 = bool3; ; bool1 = false)
            {
              paramu.setNeedDivider(bool1);
              return;
            }
            ((a)((aw)paramu.a).getAdapter()).e(paramInt / 2);
            return;
          }
        }
        paramu = null;
        Object localObject5 = localObject6;
        bool1 = bool2;
        break label136;
        localObject6 = null;
        localObject5 = paramu;
        paramu = localObject6;
        bool1 = bool2;
        break label136;
      }
      paramu = null;
      localObject3 = null;
      localObject1 = null;
      localObject2 = null;
      break;
    }
  }

  public void a(c paramc)
  {
    this.o = paramc;
  }

  public long b(int paramInt)
  {
    return paramInt;
  }

  public void e()
  {
    super.e();
    this.k.clear();
    c();
  }

  public boolean e(int paramInt)
  {
    return (paramInt > this.h.size()) && (paramInt <= this.a.size() + this.h.size());
  }

  public Object f(int paramInt)
  {
    int i2 = 0;
    int i1 = 0;
    if (j())
    {
      if (!org.vidogram.messenger.d.e.a.isEmpty())
        i1 = 2;
      if ((paramInt > i1) && (paramInt - 1 - i1 < this.u.size()))
      {
        org.vidogram.tgnet.f localf = ((e)this.u.get(paramInt - 1 - i1)).a;
        Object localObject2;
        Object localObject1;
        if ((localf instanceof g.vw))
        {
          localObject2 = org.vidogram.messenger.v.a().a(Integer.valueOf(((g.vw)localf).d));
          localObject1 = localf;
          if (localObject2 != null)
            localObject1 = localObject2;
        }
        do
        {
          do
          {
            return localObject1;
            localObject1 = localf;
          }
          while (!(localf instanceof g.i));
          localObject2 = org.vidogram.messenger.v.a().b(Integer.valueOf(((g.i)localf).h));
          localObject1 = localf;
        }
        while (localObject2 == null);
        return localObject2;
      }
      return null;
    }
    if (!this.k.isEmpty())
    {
      if (paramInt > 0)
        return this.k.get(paramInt - 1);
      return null;
    }
    int i3 = this.h.size();
    if (this.a.isEmpty())
    {
      i1 = 0;
      if (!this.j.isEmpty())
        break label240;
    }
    while (true)
    {
      if ((paramInt < 0) || (paramInt >= i3))
        break label253;
      return this.h.get(paramInt);
      i1 = this.a.size() + 1;
      break;
      label240: i2 = this.j.size() + 1;
    }
    label253: if ((paramInt > i3) && (paramInt < i1 + i3))
      return this.a.get(paramInt - i3 - 1);
    if ((paramInt > i1 + i3) && (paramInt < i2 + (i1 + i3)))
      return this.j.get(paramInt - i3 - i1 - 1);
    return null;
  }

  public boolean f()
  {
    return this.q;
  }

  public void g()
  {
    b(this.r);
  }

  public String h()
  {
    return this.r;
  }

  public boolean i()
  {
    return (!this.u.isEmpty()) || (!org.vidogram.messenger.d.e.a.isEmpty());
  }

  public boolean j()
  {
    return (this.p != 2) && ((this.l == null) || (this.l.length() == 0)) && ((!this.u.isEmpty()) || (!org.vidogram.messenger.d.e.a.isEmpty()));
  }

  public void k()
  {
    w.a().c().b(new Runnable()
    {
      public void run()
      {
        int j = 0;
        Object localObject1;
        Object localObject3;
        ArrayList localArrayList2;
        HashMap localHashMap;
        long l;
        int i;
        Object localObject4;
        while (true)
        {
          int k;
          try
          {
            localObject2 = w.a().b().b("SELECT did, date FROM search_recent WHERE 1", new Object[0]);
            localObject1 = new ArrayList();
            localObject3 = new ArrayList();
            localArrayList2 = new ArrayList();
            new ArrayList();
            ArrayList localArrayList1 = new ArrayList();
            localHashMap = new HashMap();
            if (!((SQLiteCursor)localObject2).a())
              break;
            l = ((SQLiteCursor)localObject2).d(0);
            i = (int)l;
            k = (int)(l >> 32);
            if (i == 0)
              break label281;
            if (k == 1)
            {
              if ((j.c(j.this) != 0) || (((ArrayList)localObject3).contains(Integer.valueOf(i))))
                break label675;
              ((ArrayList)localObject3).add(Integer.valueOf(i));
              i = 1;
              if (i == 0)
                continue;
              localObject4 = new j.e();
              ((j.e)localObject4).c = l;
              ((j.e)localObject4).b = ((SQLiteCursor)localObject2).b(1);
              localArrayList1.add(localObject4);
              localHashMap.put(Long.valueOf(((j.e)localObject4).c), localObject4);
              continue;
            }
          }
          catch (Exception localException)
          {
            org.vidogram.messenger.n.a("tmessages", localException);
            return;
          }
          if (i > 0)
          {
            if ((j.c(j.this) == 2) || (((ArrayList)localObject1).contains(Integer.valueOf(i))))
              break label675;
            ((ArrayList)localObject1).add(Integer.valueOf(i));
            i = 1;
            continue;
          }
          if (((ArrayList)localObject3).contains(Integer.valueOf(-i)))
            break label675;
          ((ArrayList)localObject3).add(Integer.valueOf(-i));
          i = 1;
          continue;
          label281: if ((j.c(j.this) != 0) || (localArrayList2.contains(Integer.valueOf(k))))
            break label675;
          localArrayList2.add(Integer.valueOf(k));
          i = 1;
        }
        ((SQLiteCursor)localObject2).b();
        Object localObject2 = new ArrayList();
        if (!localArrayList2.isEmpty())
        {
          localObject4 = new ArrayList();
          w.a().a(TextUtils.join(",", localArrayList2), (ArrayList)localObject4, (ArrayList)localObject1);
          i = 0;
          while (i < ((ArrayList)localObject4).size())
          {
            ((j.e)localHashMap.get(Long.valueOf(((g.t)((ArrayList)localObject4).get(i)).b << 32))).a = ((org.vidogram.tgnet.f)((ArrayList)localObject4).get(i));
            i += 1;
          }
        }
        if (!((ArrayList)localObject3).isEmpty())
        {
          localArrayList2 = new ArrayList();
          w.a().b(TextUtils.join(",", (Iterable)localObject3), localArrayList2);
          i = 0;
          label457: if (i < localArrayList2.size())
          {
            localObject3 = (g.i)localArrayList2.get(i);
            if (((g.i)localObject3).h > 0)
              l = -((g.i)localObject3).h;
            while (((g.i)localObject3).B != null)
            {
              localObject3 = (j.e)localHashMap.remove(Long.valueOf(l));
              if (localObject3 == null)
                break label680;
              localException.remove(localObject3);
              break label680;
              l = org.vidogram.messenger.a.a(((g.i)localObject3).h);
            }
            ((j.e)localHashMap.get(Long.valueOf(l))).a = ((org.vidogram.tgnet.f)localObject3);
            break label680;
          }
        }
        if (!((ArrayList)localObject1).isEmpty())
        {
          w.a().a(TextUtils.join(",", (Iterable)localObject1), (ArrayList)localObject2);
          i = j;
        }
        while (true)
        {
          if (i < ((ArrayList)localObject2).size())
          {
            localObject1 = (g.vw)((ArrayList)localObject2).get(i);
            localObject3 = (j.e)localHashMap.get(Long.valueOf(((g.vw)localObject1).d));
            if (localObject3 != null)
              ((j.e)localObject3).a = ((org.vidogram.tgnet.f)localObject1);
          }
          else
          {
            Collections.sort(localException, new Comparator()
            {
              public int a(j.e parame1, j.e parame2)
              {
                if (parame1.b < parame2.b)
                  return 1;
                if (parame1.b > parame2.b)
                  return -1;
                return 0;
              }
            });
            org.vidogram.messenger.a.a(new Runnable(localException, localHashMap)
            {
              public void run()
              {
                j.a(j.this, this.a, this.b);
              }
            });
            return;
            label675: i = 0;
            break;
            label680: i += 1;
            break label457;
          }
          i += 1;
        }
      }
    });
  }

  public void l()
  {
    this.v = new HashMap();
    this.u = new ArrayList();
    c();
    w.a().c().b(new Runnable()
    {
      public void run()
      {
        try
        {
          w.a().b().a("DELETE FROM search_recent WHERE 1").c().e();
          return;
        }
        catch (Exception localException)
        {
          org.vidogram.messenger.n.a("tmessages", localException);
        }
      }
    });
  }

  private class a extends RecyclerView.a
  {
    private a()
    {
    }

    public int a()
    {
      return org.vidogram.messenger.d.e.a.size();
    }

    public RecyclerView.u a(ViewGroup paramViewGroup, int paramInt)
    {
      paramViewGroup = new x(j.a(j.this));
      paramViewGroup.setLayoutParams(new RecyclerView.i(org.vidogram.messenger.a.a(80.0F), org.vidogram.messenger.a.a(100.0F)));
      return new j.d(j.this, paramViewGroup);
    }

    public void a(RecyclerView.u paramu, int paramInt)
    {
      g.i locali = null;
      x localx = (x)paramu.a;
      paramu = (g.to)org.vidogram.messenger.d.e.a.get(paramInt);
      new g.hq();
      if (paramu.c.c != 0)
      {
        paramInt = paramu.c.c;
        paramu = org.vidogram.messenger.v.a().a(Integer.valueOf(paramu.c.c));
      }
      while (true)
      {
        localx.setTag(Integer.valueOf(paramInt));
        if (paramu != null)
          paramu = org.vidogram.messenger.f.a(paramu.e, paramu.f);
        while (true)
        {
          localx.a(paramInt, true, paramu);
          return;
          if (paramu.c.b != 0)
          {
            paramInt = -paramu.c.b;
            locali = org.vidogram.messenger.v.a().b(Integer.valueOf(paramu.c.b));
            paramu = null;
            break;
          }
          if (paramu.c.d == 0)
            break label199;
          paramInt = -paramu.c.d;
          locali = org.vidogram.messenger.v.a().b(Integer.valueOf(paramu.c.d));
          paramu = null;
          break;
          if (locali != null)
          {
            paramu = locali.i;
            continue;
          }
          paramu = "";
        }
        label199: paramInt = 0;
        paramu = null;
      }
    }

    public void e(int paramInt)
    {
      c();
    }
  }

  private class b
  {
    public org.vidogram.tgnet.f a;
    public int b;
    public CharSequence c;

    private b()
    {
    }
  }

  public static abstract interface c
  {
    public abstract void a(int paramInt);

    public abstract void a(boolean paramBoolean);

    public abstract void b(int paramInt);
  }

  private class d extends RecyclerView.u
  {
    public d(View arg2)
    {
      super();
    }
  }

  protected static class e
  {
    org.vidogram.tgnet.f a;
    int b;
    long c;
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.b.j
 * JD-Core Version:    0.6.0
 */