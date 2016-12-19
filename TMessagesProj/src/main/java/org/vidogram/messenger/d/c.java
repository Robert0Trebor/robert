package org.vidogram.messenger.d;

import android.text.Spannable;
import android.text.TextUtils;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.Set;
import org.vidogram.SQLite.SQLiteCursor;
import org.vidogram.SQLite.SQLiteDatabase;
import org.vidogram.messenger.Utilities;
import org.vidogram.messenger.h;
import org.vidogram.messenger.n;
import org.vidogram.messenger.u;
import org.vidogram.messenger.v;
import org.vidogram.messenger.w;
import org.vidogram.messenger.y;
import org.vidogram.tgnet.ConnectionsManager;
import org.vidogram.tgnet.NativeByteBuffer;
import org.vidogram.tgnet.f;
import org.vidogram.tgnet.g.ar;
import org.vidogram.tgnet.g.at;
import org.vidogram.tgnet.g.aw;
import org.vidogram.tgnet.g.eq;
import org.vidogram.tgnet.g.i;
import org.vidogram.tgnet.g.kn;
import org.vidogram.tgnet.g.mu;
import org.vidogram.tgnet.g.mz;
import org.vidogram.tgnet.g.nh;
import org.vidogram.tgnet.g.nn;
import org.vidogram.tgnet.g.py;
import org.vidogram.tgnet.g.vw;
import org.vidogram.ui.Components.URLSpanUserMention;

public class c
{
  private static Comparator<g.at> a = new Comparator()
  {
    public int a(g.at paramat1, g.at paramat2)
    {
      if (paramat1.b > paramat2.b)
        return 1;
      if (paramat1.b < paramat2.b)
        return -1;
      return 0;
    }
  };

  public static ArrayList<g.at> a(CharSequence[] paramArrayOfCharSequence)
  {
    if ((paramArrayOfCharSequence == null) || (paramArrayOfCharSequence[0] == null))
    {
      localObject1 = null;
      return localObject1;
    }
    Object localObject1 = null;
    int i = -1;
    int j = 0;
    int k = 0;
    Object localObject3 = paramArrayOfCharSequence[0];
    Object localObject2;
    if (j == 0)
    {
      localObject2 = "`";
      label38: k = TextUtils.indexOf((CharSequence)localObject3, (CharSequence)localObject2, k);
      if (k == -1)
        break label669;
      if (i != -1)
        break label143;
      if ((paramArrayOfCharSequence[0].length() - k <= 2) || (paramArrayOfCharSequence[0].charAt(k + 1) != '`') || (paramArrayOfCharSequence[0].charAt(k + 2) != '`'))
        break label133;
      i = 1;
      label105: if (i == 0)
        break label138;
    }
    int m;
    label133: label138: for (j = 3; ; j = 1)
    {
      m = k;
      k = j + k;
      j = i;
      i = m;
      break;
      localObject2 = "```";
      break label38;
      i = 0;
      break label105;
    }
    label143: label157: label224: int n;
    label250: Object localObject4;
    if (localObject1 == null)
    {
      localObject1 = new ArrayList();
      if (j != 0);
      for (m = 3; ; m = 1)
      {
        m += k;
        while ((m < paramArrayOfCharSequence[0].length()) && (paramArrayOfCharSequence[0].charAt(m) == '`'))
        {
          k += 1;
          m += 1;
        }
      }
      if (j != 0)
      {
        m = 3;
        n = k + m;
        if (j == 0)
          break label574;
        if (i <= 0)
          break label530;
        j = paramArrayOfCharSequence[0].charAt(i - 1);
        if ((j != 32) && (j != 10))
          break label535;
        j = 1;
        label264: localObject2 = paramArrayOfCharSequence[0];
        if (j == 0)
          break label540;
        m = 1;
        label276: localObject2 = TextUtils.substring((CharSequence)localObject2, 0, i - m);
        localObject4 = TextUtils.substring(paramArrayOfCharSequence[0], i + 3, k);
        if (k + 3 >= paramArrayOfCharSequence[0].length())
          break label546;
        m = paramArrayOfCharSequence[0].charAt(k + 3);
        label327: localObject3 = paramArrayOfCharSequence[0];
        if ((m != 32) && (m != 10))
          break label552;
        m = 1;
        label349: localObject3 = TextUtils.substring((CharSequence)localObject3, m + (k + 3), paramArrayOfCharSequence[0].length());
        if (((CharSequence)localObject2).length() == 0)
          break label558;
        localObject2 = TextUtils.concat(new CharSequence[] { localObject2, "\n" });
        label399: if (((CharSequence)localObject3).length() == 0)
          break label1002;
        localObject3 = TextUtils.concat(new CharSequence[] { "\n", localObject3 });
      }
    }
    label469: label484: label1002: 
    while (true)
    {
      paramArrayOfCharSequence[0] = TextUtils.concat(new CharSequence[] { localObject2, localObject4, localObject3 });
      localObject2 = new g.nn();
      if (j != 0)
      {
        m = 0;
        ((g.nn)localObject2).b = (m + i);
        if (j == 0)
          break label569;
        j = 0;
        ((g.nn)localObject2).c = (j + (k - i - 3));
        ((g.nn)localObject2).e = "";
        ((ArrayList)localObject1).add(localObject2);
      }
      for (k = n - 6; ; k = n - 2)
      {
        i = -1;
        j = 0;
        break;
        m = 1;
        break label224;
        j = 0;
        break label250;
        j = 0;
        break label264;
        m = 0;
        break label276;
        m = 0;
        break label327;
        m = 0;
        break label349;
        j = 1;
        break label399;
        m = 1;
        break label469;
        j = 1;
        break label484;
        paramArrayOfCharSequence[0] = TextUtils.concat(new CharSequence[] { TextUtils.substring(paramArrayOfCharSequence[0], 0, i), TextUtils.substring(paramArrayOfCharSequence[0], i + 1, k), TextUtils.substring(paramArrayOfCharSequence[0], k + 1, paramArrayOfCharSequence[0].length()) });
        localObject2 = new g.nh();
        ((g.nh)localObject2).b = i;
        ((g.nh)localObject2).c = (k - i - 1);
        ((ArrayList)localObject1).add(localObject2);
      }
      localObject2 = localObject1;
      if (i != -1)
      {
        localObject2 = localObject1;
        if (j != 0)
        {
          paramArrayOfCharSequence[0] = TextUtils.concat(new CharSequence[] { TextUtils.substring(paramArrayOfCharSequence[0], 0, i), TextUtils.substring(paramArrayOfCharSequence[0], i + 2, paramArrayOfCharSequence[0].length()) });
          localObject2 = localObject1;
          if (localObject1 == null)
            localObject2 = new ArrayList();
          localObject1 = new g.nh();
          ((g.nh)localObject1).b = i;
          ((g.nh)localObject1).c = 1;
          ((ArrayList)localObject2).add(localObject1);
        }
      }
      localObject1 = localObject2;
      if (!(paramArrayOfCharSequence[0] instanceof Spannable))
        break;
      localObject3 = (Spannable)paramArrayOfCharSequence[0];
      localObject4 = (URLSpanUserMention[])((Spannable)localObject3).getSpans(0, paramArrayOfCharSequence[0].length(), URLSpanUserMention.class);
      localObject1 = localObject2;
      if (localObject4 == null)
        break;
      localObject1 = localObject2;
      if (localObject4.length <= 0)
        break;
      localObject2 = new ArrayList();
      i = 0;
      while (true)
      {
        localObject1 = localObject2;
        if (i >= localObject4.length)
          break;
        localObject1 = new g.kn();
        ((g.kn)localObject1).g = v.a(Utilities.a(localObject4[i].getURL()).intValue());
        if (((g.kn)localObject1).g != null)
        {
          ((g.kn)localObject1).b = ((Spannable)localObject3).getSpanStart(localObject4[i]);
          ((g.kn)localObject1).c = (Math.min(((Spannable)localObject3).getSpanEnd(localObject4[i]), paramArrayOfCharSequence[0].length()) - ((g.kn)localObject1).b);
          if (paramArrayOfCharSequence[0].charAt(((g.kn)localObject1).b + ((g.kn)localObject1).c - 1) == ' ')
            ((g.kn)localObject1).c -= 1;
          ((ArrayList)localObject2).add(localObject1);
        }
        i += 1;
      }
      break label157;
    }
  }

  public static u a(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      w.a().c().b(new Runnable(paramInt1, paramInt2)
      {
        public void run()
        {
          c.b(this.a, this.b, false);
        }
      });
      return null;
    }
    return c(paramInt1, paramInt2, true);
  }

  private static u a(g.ar paramar, ArrayList<g.vw> paramArrayList, ArrayList<g.i> paramArrayList1, boolean paramBoolean1, boolean paramBoolean2)
  {
    HashMap localHashMap = new HashMap();
    int i = 0;
    while (i < paramArrayList.size())
    {
      localObject = (g.vw)paramArrayList.get(i);
      localHashMap.put(Integer.valueOf(((g.vw)localObject).d), localObject);
      i += 1;
    }
    Object localObject = new HashMap();
    i = 0;
    while (i < paramArrayList1.size())
    {
      g.i locali = (g.i)paramArrayList1.get(i);
      ((HashMap)localObject).put(Integer.valueOf(locali.h), locali);
      i += 1;
    }
    if (paramBoolean2)
      return new u(paramar, localHashMap, (AbstractMap)localObject, false);
    org.vidogram.messenger.a.a(new Runnable(paramArrayList, paramBoolean1, paramArrayList1, paramar, localHashMap, (HashMap)localObject)
    {
      public void run()
      {
        v.a().a(this.a, this.b);
        v.a().b(this.c, this.b);
        y.a().a(y.L, new Object[] { new u(this.d, this.e, this.f, false) });
      }
    });
    return (u)null;
  }

  public static void a(ArrayList<g.at> paramArrayList)
  {
    Collections.sort(paramArrayList, a);
  }

  public static void a(ArrayList<u> paramArrayList, long paramLong)
  {
    u localu;
    Object localObject;
    ArrayList localArrayList2;
    ArrayList localArrayList1;
    if ((int)paramLong == 0)
    {
      localArrayList3 = new ArrayList();
      localHashMap = new HashMap();
      localStringBuilder = new StringBuilder();
      i = 0;
      while (i < paramArrayList.size())
      {
        localu = (u)paramArrayList.get(i);
        if ((localu.T()) && (localu.e == null))
        {
          localObject = Long.valueOf(localu.a.h);
          if (localStringBuilder.length() > 0)
            localStringBuilder.append(',');
          localStringBuilder.append(localObject);
          localArrayList2 = (ArrayList)localHashMap.get(localObject);
          localArrayList1 = localArrayList2;
          if (localArrayList2 == null)
          {
            localArrayList1 = new ArrayList();
            localHashMap.put(localObject, localArrayList1);
          }
          localArrayList1.add(localu);
          if (!localArrayList3.contains(localObject))
            localArrayList3.add(localObject);
        }
        i += 1;
      }
      if (localArrayList3.isEmpty())
        return;
      w.a().c().b(new Runnable(localArrayList3, paramLong, localHashMap)
      {
        public void run()
        {
          try
          {
            Object localObject1 = w.a().b().b(String.format(Locale.US, "SELECT m.data, m.mid, m.date, r.random_id FROM randoms as r INNER JOIN messages as m ON r.mid = m.mid WHERE r.random_id IN(%s)", new Object[] { TextUtils.join(",", this.a) }), new Object[0]);
            Object localObject2;
            int i;
            while (((SQLiteCursor)localObject1).a())
            {
              localObject2 = ((SQLiteCursor)localObject1).g(0);
              if (localObject2 == null)
                continue;
              Object localObject3 = g.ar.a((org.vidogram.tgnet.a)localObject2, ((NativeByteBuffer)localObject2).b(false), false);
              ((NativeByteBuffer)localObject2).e();
              ((g.ar)localObject3).b = ((SQLiteCursor)localObject1).b(1);
              ((g.ar)localObject3).e = ((SQLiteCursor)localObject1).b(2);
              ((g.ar)localObject3).E = this.b;
              localObject2 = (ArrayList)this.c.remove(Long.valueOf(((SQLiteCursor)localObject1).d(3)));
              if (localObject2 == null)
                continue;
              localObject3 = new u((g.ar)localObject3, null, null, false);
              i = 0;
              while (i < ((ArrayList)localObject2).size())
              {
                u localu = (u)((ArrayList)localObject2).get(i);
                localu.e = ((u)localObject3);
                localu.a.g = ((u)localObject3).q();
                i += 1;
              }
            }
            ((SQLiteCursor)localObject1).b();
            if (!this.c.isEmpty())
            {
              localObject1 = this.c.entrySet().iterator();
              while (((Iterator)localObject1).hasNext())
              {
                localObject2 = (ArrayList)((Map.Entry)((Iterator)localObject1).next()).getValue();
                i = 0;
                while (i < ((ArrayList)localObject2).size())
                {
                  ((u)((ArrayList)localObject2).get(i)).a.h = 0L;
                  i += 1;
                }
              }
            }
            org.vidogram.messenger.a.a(new Runnable()
            {
              public void run()
              {
                y.a().a(y.K, new Object[] { Long.valueOf(c.5.this.b) });
              }
            });
            return;
          }
          catch (Exception localException)
          {
            n.a("tmessages", localException);
          }
        }
      });
      return;
    }
    ArrayList localArrayList3 = new ArrayList();
    HashMap localHashMap = new HashMap();
    StringBuilder localStringBuilder = new StringBuilder();
    int i = 0;
    int j = 0;
    label241: int k;
    long l;
    if (j < paramArrayList.size())
    {
      localu = (u)paramArrayList.get(j);
      k = i;
      if (localu.q() > 0)
      {
        k = i;
        if (localu.T())
        {
          k = i;
          if (localu.e == null)
          {
            localObject = Integer.valueOf(localu.a.g);
            l = ((Integer)localObject).intValue();
            if (localu.a.d.b == 0)
              break label499;
            l = localu.a.d.b << 32 | l;
            i = localu.a.d.b;
          }
        }
      }
    }
    label499: 
    while (true)
    {
      if (localStringBuilder.length() > 0)
        localStringBuilder.append(',');
      localStringBuilder.append(l);
      localArrayList2 = (ArrayList)localHashMap.get(localObject);
      localArrayList1 = localArrayList2;
      if (localArrayList2 == null)
      {
        localArrayList1 = new ArrayList();
        localHashMap.put(localObject, localArrayList1);
      }
      localArrayList1.add(localu);
      if (!localArrayList3.contains(localObject))
        localArrayList3.add(localObject);
      k = i;
      j += 1;
      i = k;
      break label241;
      if (localArrayList3.isEmpty())
        break;
      w.a().c().b(new Runnable(localStringBuilder, paramLong, localArrayList3, localHashMap, i)
      {
        public void run()
        {
          do
          {
            ArrayList localArrayList2;
            ArrayList localArrayList3;
            ArrayList localArrayList4;
            ArrayList localArrayList5;
            SQLiteCursor localSQLiteCursor;
            try
            {
              ArrayList localArrayList1 = new ArrayList();
              localArrayList2 = new ArrayList();
              localArrayList3 = new ArrayList();
              localArrayList4 = new ArrayList();
              localArrayList5 = new ArrayList();
              localSQLiteCursor = w.a().b().b(String.format(Locale.US, "SELECT data, mid, date FROM messages WHERE mid IN(%s)", new Object[] { this.a.toString() }), new Object[0]);
              while (localSQLiteCursor.a())
              {
                NativeByteBuffer localNativeByteBuffer = localSQLiteCursor.g(0);
                if (localNativeByteBuffer == null)
                  continue;
                g.ar localar = g.ar.a(localNativeByteBuffer, localNativeByteBuffer.b(false), false);
                localNativeByteBuffer.e();
                localar.b = localSQLiteCursor.b(1);
                localar.e = localSQLiteCursor.b(2);
                localar.E = this.b;
                w.a(localar, localArrayList4, localArrayList5);
                localArrayList1.add(localar);
                this.c.remove(Integer.valueOf(localar.b));
              }
            }
            catch (Exception localException)
            {
              n.a("tmessages", localException);
              return;
            }
            localSQLiteCursor.b();
            if (!localArrayList4.isEmpty())
              w.a().a(TextUtils.join(",", localArrayList4), localArrayList2);
            if (!localArrayList5.isEmpty())
              w.a().b(TextUtils.join(",", localArrayList5), localArrayList3);
            c.a(localException, this.d, localArrayList2, localArrayList3, this.b, true);
          }
          while (this.c.isEmpty());
          if (this.e != 0)
          {
            localObject = new g.eq();
            ((g.eq)localObject).c = v.b(this.e);
            ((g.eq)localObject).d = this.c;
            ConnectionsManager.a().a((f)localObject, new org.vidogram.tgnet.c()
            {
            });
            return;
          }
          Object localObject = new g.py();
          ((g.py)localObject).c = this.c;
          ConnectionsManager.a().a((f)localObject, new org.vidogram.tgnet.c()
          {
          });
        }
      });
      return;
    }
  }

  private static void b(ArrayList<g.ar> paramArrayList, HashMap<Integer, ArrayList<u>> paramHashMap, ArrayList<g.vw> paramArrayList1, ArrayList<g.i> paramArrayList2, long paramLong, boolean paramBoolean)
  {
    HashMap localHashMap = new HashMap();
    int i = 0;
    while (i < paramArrayList1.size())
    {
      localObject = (g.vw)paramArrayList1.get(i);
      localHashMap.put(Integer.valueOf(((g.vw)localObject).d), localObject);
      i += 1;
    }
    Object localObject = new HashMap();
    i = 0;
    while (i < paramArrayList2.size())
    {
      g.i locali = (g.i)paramArrayList2.get(i);
      ((HashMap)localObject).put(Integer.valueOf(locali.h), locali);
      i += 1;
    }
    org.vidogram.messenger.a.a(new Runnable(paramArrayList1, paramBoolean, paramArrayList2, paramArrayList, paramHashMap, localHashMap, (HashMap)localObject, paramLong)
    {
      public void run()
      {
        v.a().a(this.a, this.b);
        v.a().b(this.c, this.b);
        int j = 0;
        int i = 0;
        if (j < this.d.size())
        {
          Object localObject = (g.ar)this.d.get(j);
          ArrayList localArrayList = (ArrayList)this.e.get(Integer.valueOf(((g.ar)localObject).b));
          if (localArrayList == null)
            break label214;
          localObject = new u((g.ar)localObject, this.f, this.g, false);
          i = 0;
          if (i < localArrayList.size())
          {
            u localu = (u)localArrayList.get(i);
            localu.e = ((u)localObject);
            if ((localu.a.f instanceof g.mz))
              localu.a(null, null);
            while (true)
            {
              i += 1;
              break;
              if (!(localu.a.f instanceof g.mu))
                continue;
              localu.a(null);
            }
          }
          i = 1;
        }
        label214: 
        while (true)
        {
          j += 1;
          break;
          if (i != 0)
            y.a().a(y.K, new Object[] { Long.valueOf(this.h) });
          return;
        }
      }
    });
  }

  private static u c(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    long l1 = paramInt2;
    long l2 = paramInt1;
    while (true)
    {
      ArrayList localArrayList1;
      ArrayList localArrayList2;
      ArrayList localArrayList3;
      ArrayList localArrayList4;
      Object localObject3;
      try
      {
        localArrayList1 = new ArrayList();
        localArrayList2 = new ArrayList();
        localArrayList3 = new ArrayList();
        localArrayList4 = new ArrayList();
        localObject3 = w.a().b().b(String.format(Locale.US, "SELECT data, mid, date FROM messages WHERE mid = %d", new Object[] { Long.valueOf(l1 | l2 << 32) }), new Object[0]);
        if (!((SQLiteCursor)localObject3).a())
          break label442;
        Object localObject4 = ((SQLiteCursor)localObject3).g(0);
        if (localObject4 == null)
          break label442;
        Object localObject1 = g.ar.a((org.vidogram.tgnet.a)localObject4, ((NativeByteBuffer)localObject4).b(false), false);
        ((NativeByteBuffer)localObject4).e();
        ((g.ar)localObject1).b = ((SQLiteCursor)localObject3).b(1);
        ((g.ar)localObject1).e = ((SQLiteCursor)localObject3).b(2);
        ((g.ar)localObject1).E = (-paramInt1);
        w.a((g.ar)localObject1, localArrayList3, localArrayList4);
        ((SQLiteCursor)localObject3).b();
        localObject3 = localObject1;
        if (localObject1 != null)
          continue;
        localObject4 = w.a().b().b(String.format(Locale.US, "SELECT data FROM chat_pinned WHERE uid = %d", new Object[] { Integer.valueOf(paramInt1) }), new Object[0]);
        localObject3 = localObject1;
        if (!((SQLiteCursor)localObject4).a())
          continue;
        NativeByteBuffer localNativeByteBuffer = ((SQLiteCursor)localObject4).g(0);
        localObject3 = localObject1;
        if (localNativeByteBuffer == null)
          continue;
        localObject3 = g.ar.a(localNativeByteBuffer, localNativeByteBuffer.b(false), false);
        localNativeByteBuffer.e();
        if (((g.ar)localObject3).b == paramInt2)
          continue;
        localObject3 = null;
        ((SQLiteCursor)localObject4).b();
        if (localObject3 == null)
        {
          localObject1 = new g.eq();
          ((g.eq)localObject1).c = v.b(paramInt1);
          ((g.eq)localObject1).d.add(Integer.valueOf(paramInt2));
          ConnectionsManager.a().a((f)localObject1, new org.vidogram.tgnet.c(paramInt1)
          {
          });
          return null;
          ((g.ar)localObject3).E = (-paramInt1);
          w.a((g.ar)localObject3, localArrayList3, localArrayList4);
          continue;
        }
      }
      catch (Exception localException)
      {
        n.a("tmessages", localException);
        return null;
      }
      if (paramBoolean)
        return a((g.ar)localObject3, localArrayList1, localArrayList2, true, paramBoolean);
      if (!localArrayList3.isEmpty())
        w.a().a(TextUtils.join(",", localArrayList3), localArrayList1);
      if (!localArrayList4.isEmpty())
        w.a().b(TextUtils.join(",", localArrayList4), localArrayList2);
      a((g.ar)localObject3, localArrayList1, localArrayList2, true, false);
      return null;
      label442: Object localObject2 = null;
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.d.c
 * JD-Core Version:    0.6.0
 */