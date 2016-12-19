package org.vidogram.messenger;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.SparseArray;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import org.vidogram.SQLite.SQLiteCursor;
import org.vidogram.SQLite.SQLiteDatabase;
import org.vidogram.SQLite.SQLitePreparedStatement;
import org.vidogram.a.b;
import org.vidogram.tgnet.ConnectionsManager;
import org.vidogram.tgnet.NativeByteBuffer;
import org.vidogram.tgnet.g.ah;
import org.vidogram.tgnet.g.aj;
import org.vidogram.tgnet.g.ap;
import org.vidogram.tgnet.g.ar;
import org.vidogram.tgnet.g.as;
import org.vidogram.tgnet.g.at;
import org.vidogram.tgnet.g.au;
import org.vidogram.tgnet.g.aw;
import org.vidogram.tgnet.g.ax;
import org.vidogram.tgnet.g.ay;
import org.vidogram.tgnet.g.az;
import org.vidogram.tgnet.g.bb;
import org.vidogram.tgnet.g.dl;
import org.vidogram.tgnet.g.fi;
import org.vidogram.tgnet.g.fj;
import org.vidogram.tgnet.g.fw;
import org.vidogram.tgnet.g.gt;
import org.vidogram.tgnet.g.gu;
import org.vidogram.tgnet.g.hq;
import org.vidogram.tgnet.g.i;
import org.vidogram.tgnet.g.j;
import org.vidogram.tgnet.g.ke;
import org.vidogram.tgnet.g.kn;
import org.vidogram.tgnet.g.l;
import org.vidogram.tgnet.g.mu;
import org.vidogram.tgnet.g.mz;
import org.vidogram.tgnet.g.ne;
import org.vidogram.tgnet.g.nm;
import org.vidogram.tgnet.g.nt;
import org.vidogram.tgnet.g.nw;
import org.vidogram.tgnet.g.ob;
import org.vidogram.tgnet.g.od;
import org.vidogram.tgnet.g.oe;
import org.vidogram.tgnet.g.oi;
import org.vidogram.tgnet.g.ov;
import org.vidogram.tgnet.g.q;
import org.vidogram.tgnet.g.rm;
import org.vidogram.tgnet.g.rr;
import org.vidogram.tgnet.g.sf;
import org.vidogram.tgnet.g.t;
import org.vidogram.tgnet.g.va;
import org.vidogram.tgnet.g.vb;
import org.vidogram.tgnet.g.ve;
import org.vidogram.tgnet.g.vr;
import org.vidogram.tgnet.g.vw;
import org.vidogram.tgnet.g.vy;
import org.vidogram.tgnet.g.wa;
import org.vidogram.tgnet.g.wb;
import org.vidogram.tgnet.g.wd;
import org.vidogram.tgnet.g.we;
import org.vidogram.tgnet.g.wf;

public class w
{
  public static int a = 0;
  public static int b = 0;
  public static int c = 0;
  public static int d = 0;
  public static int e = 0;
  public static byte[] f = null;
  public static int g = 0;
  private static volatile w p = null;
  private h h = new h("storageQueue");
  private SQLiteDatabase i;
  private File j;
  private AtomicLong k = new AtomicLong(System.currentTimeMillis());
  private int l = 0;
  private int m = 0;
  private int n = 0;
  private int o = 0;

  public w()
  {
    this.h.setPriority(10);
    d();
  }

  private String a(g.vw paramvw)
  {
    StringBuilder localStringBuilder = new StringBuilder("");
    if ((paramvw.e != null) && (paramvw.e.length() > 0))
      localStringBuilder.append(paramvw.e);
    if ((paramvw.f != null) && (paramvw.f.length() > 0))
    {
      if (localStringBuilder.length() > 0)
        localStringBuilder.append(" ");
      localStringBuilder.append(paramvw.f);
    }
    localStringBuilder.append(";;;");
    if ((paramvw.g != null) && (paramvw.g.length() > 0))
      localStringBuilder.append(paramvw.g);
    return localStringBuilder.toString().toLowerCase();
  }

  public static w a()
  {
    Object localObject1 = p;
    if (localObject1 == null)
    {
      monitorenter;
      try
      {
        w localw = p;
        localObject1 = localw;
        if (localw == null)
        {
          localObject1 = new w();
          p = (w)localObject1;
        }
        return localObject1;
      }
      finally
      {
        monitorexit;
      }
    }
    return (w)localObject2;
  }

  public static void a(long paramLong, SQLitePreparedStatement paramSQLitePreparedStatement1, SQLitePreparedStatement paramSQLitePreparedStatement2, int paramInt)
  {
    paramSQLitePreparedStatement1.d();
    paramSQLitePreparedStatement1.a(1, paramLong);
    int i1;
    if (paramInt == 1)
    {
      i1 = 1;
      paramSQLitePreparedStatement1.a(2, i1);
      paramSQLitePreparedStatement1.a(3, paramInt);
      paramSQLitePreparedStatement1.b();
      i1 = 0;
      label41: if (i1 >= 5)
        return;
      paramSQLitePreparedStatement2.d();
      paramSQLitePreparedStatement2.a(1, paramLong);
      paramSQLitePreparedStatement2.a(2, i1);
      if (paramInt != 1)
        break label107;
    }
    label107: for (int i2 = 1; ; i2 = 0)
    {
      paramSQLitePreparedStatement2.a(3, i2);
      paramSQLitePreparedStatement2.a(4, paramInt);
      paramSQLitePreparedStatement2.b();
      i1 += 1;
      break label41;
      i1 = 0;
      break;
    }
  }

  private void a(String paramString, long paramLong, int paramInt)
  {
    if (paramInt == 0)
      this.i.a(String.format(Locale.US, "DELETE FROM " + paramString + " WHERE uid = %d", new Object[] { Long.valueOf(paramLong) })).c().e();
    while (true)
    {
      paramString = this.i.a("REPLACE INTO " + paramString + " VALUES(?, ?, ?)");
      paramString.d();
      paramString.a(1, paramLong);
      paramString.a(2, 1);
      paramString.a(3, 1);
      paramString.b();
      paramString.e();
      return;
      this.i.a(String.format(Locale.US, "DELETE FROM " + paramString + " WHERE uid = %d AND start = 0", new Object[] { Long.valueOf(paramLong) })).c().e();
    }
  }

  private void a(String paramString, long paramLong, int paramInt1, int paramInt2)
  {
    while (true)
    {
      int i1;
      int i2;
      try
      {
        Object localObject = this.i.b(String.format(Locale.US, "SELECT start, end FROM " + paramString + " WHERE uid = %d AND ((end >= %d AND end <= %d) OR (start >= %d AND start <= %d) OR (start >= %d AND end <= %d) OR (start <= %d AND end >= %d))", new Object[] { Long.valueOf(paramLong), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), new Object[0]);
        ArrayList localArrayList = null;
        if (!((SQLiteCursor)localObject).a())
          continue;
        if (localArrayList != null)
          break label802;
        localArrayList = new ArrayList();
        i1 = ((SQLiteCursor)localObject).b(0);
        i2 = ((SQLiteCursor)localObject).b(1);
        if ((i1 == i2) && (i1 == 1))
          continue;
        localArrayList.add(new a(i1, i2));
        continue;
        ((SQLiteCursor)localObject).b();
        if (localArrayList != null)
        {
          i1 = 0;
          if (i1 < localArrayList.size())
          {
            localObject = (a)localArrayList.get(i1);
            if ((paramInt2 < ((a)localObject).b - 1) || (paramInt1 > ((a)localObject).a + 1))
              continue;
            this.i.a(String.format(Locale.US, "DELETE FROM " + paramString + " WHERE uid = %d AND start = %d AND end = %d", new Object[] { Long.valueOf(paramLong), Integer.valueOf(((a)localObject).a), Integer.valueOf(((a)localObject).b) })).c().e();
            break label805;
            if (paramInt2 < ((a)localObject).b - 1)
              break label479;
            i2 = ((a)localObject).b;
            if (i2 == paramInt1)
              break label805;
            try
            {
              this.i.a(String.format(Locale.US, "UPDATE " + paramString + " SET end = %d WHERE uid = %d AND start = %d AND end = %d", new Object[] { Integer.valueOf(paramInt1), Long.valueOf(paramLong), Integer.valueOf(((a)localObject).a), Integer.valueOf(((a)localObject).b) })).c().e();
            }
            catch (Exception localException1)
            {
              n.a("tmessages", localException1);
            }
          }
        }
      }
      catch (Exception paramString)
      {
        n.a("tmessages", paramString);
      }
      return;
      label479: if (paramInt1 <= localException1.a + 1)
      {
        i2 = localException1.a;
        if (i2 != paramInt2)
          try
          {
            this.i.a(String.format(Locale.US, "UPDATE " + paramString + " SET start = %d WHERE uid = %d AND start = %d AND end = %d", new Object[] { Integer.valueOf(paramInt2), Long.valueOf(paramLong), Integer.valueOf(localException1.a), Integer.valueOf(localException1.b) })).c().e();
          }
          catch (Exception localException2)
          {
            n.a("tmessages", localException2);
          }
      }
      else
      {
        this.i.a(String.format(Locale.US, "DELETE FROM " + paramString + " WHERE uid = %d AND start = %d AND end = %d", new Object[] { Long.valueOf(paramLong), Integer.valueOf(localException2.a), Integer.valueOf(localException2.b) })).c().e();
        SQLitePreparedStatement localSQLitePreparedStatement = this.i.a("REPLACE INTO " + paramString + " VALUES(?, ?, ?)");
        localSQLitePreparedStatement.d();
        localSQLitePreparedStatement.a(1, paramLong);
        localSQLitePreparedStatement.a(2, localException2.a);
        localSQLitePreparedStatement.a(3, paramInt1);
        localSQLitePreparedStatement.b();
        localSQLitePreparedStatement.d();
        localSQLitePreparedStatement.a(1, paramLong);
        localSQLitePreparedStatement.a(2, paramInt2);
        localSQLitePreparedStatement.a(3, localException2.b);
        localSQLitePreparedStatement.b();
        localSQLitePreparedStatement.e();
        break label805;
        continue;
      }
      label802: label805: i1 += 1;
    }
  }

  private void a(ArrayList<Integer> paramArrayList, int paramInt)
  {
    int i2 = 0;
    if (paramInt != 0);
    try
    {
      Object localObject1 = new StringBuilder(paramArrayList.size());
      int i1 = 0;
      long l1;
      while (i1 < paramArrayList.size())
      {
        l1 = ((Integer)paramArrayList.get(i1)).intValue();
        long l2 = paramInt;
        if (((StringBuilder)localObject1).length() > 0)
          ((StringBuilder)localObject1).append(',');
        ((StringBuilder)localObject1).append(l1 | l2 << 32);
        i1 += 1;
      }
      localObject1 = ((StringBuilder)localObject1).toString();
      Object localObject2 = this.i.b(String.format(Locale.US, "SELECT uid, data, read_state FROM messages WHERE mid IN(%s)", new Object[] { localObject1 }), new Object[0]);
      ArrayList localArrayList = new ArrayList();
      i1 = i2;
      while (true)
      {
        i2 = i1;
        int i3 = i1;
        try
        {
          if (((SQLiteCursor)localObject2).a())
          {
            i2 = i1;
            l1 = ((SQLiteCursor)localObject2).d(0);
            i3 = i1;
            if (paramInt != 0)
            {
              i3 = i1;
              i2 = i1;
              if (((SQLiteCursor)localObject2).b(2) == 0)
                i3 = i1 + 1;
            }
            i1 = i3;
            if ((int)l1 != 0)
              continue;
            i2 = i3;
            localObject4 = ((SQLiteCursor)localObject2).g(1);
            i1 = i3;
            if (localObject4 == null)
              continue;
            i2 = i3;
            Object localObject3 = g.ar.a((org.vidogram.tgnet.a)localObject4, ((NativeByteBuffer)localObject4).b(false), false);
            i2 = i3;
            ((NativeByteBuffer)localObject4).e();
            i1 = i3;
            if (localObject3 == null)
              continue;
            i2 = i3;
            if (!(((g.ar)localObject3).j instanceof g.ob))
              break label609;
            i2 = i3;
            localObject3 = ((g.ar)localObject3).j.d.h.iterator();
            while (true)
            {
              i1 = i3;
              i2 = i3;
              if (!((Iterator)localObject3).hasNext())
                break;
              i2 = i3;
              localObject4 = m.a((g.az)((Iterator)localObject3).next());
              if (localObject4 == null)
                continue;
              i2 = i3;
              if (((File)localObject4).toString().length() <= 0)
                continue;
              i2 = i3;
              localArrayList.add(localObject4);
            }
          }
        }
        catch (Exception localException)
        {
          n.a("tmessages", localException);
          i3 = i2;
          ((SQLiteCursor)localObject2).b();
          m.a().b(localArrayList, 0);
          if ((paramInt != 0) && (i3 != 0))
          {
            l1 = -paramInt;
            localObject2 = this.i.a("UPDATE dialogs SET unread_count = ((SELECT unread_count FROM dialogs WHERE did = ?) - ?) WHERE did = ?");
            ((SQLitePreparedStatement)localObject2).d();
            ((SQLitePreparedStatement)localObject2).a(1, l1);
            ((SQLitePreparedStatement)localObject2).a(2, i3);
            ((SQLitePreparedStatement)localObject2).a(3, l1);
            ((SQLitePreparedStatement)localObject2).b();
            ((SQLitePreparedStatement)localObject2).e();
          }
          this.i.a(String.format(Locale.US, "DELETE FROM messages WHERE mid IN(%s)", new Object[] { localObject1 })).c().e();
          this.i.a(String.format(Locale.US, "DELETE FROM bot_keyboard WHERE mid IN(%s)", new Object[] { localObject1 })).c().e();
          this.i.a(String.format(Locale.US, "DELETE FROM messages_seq WHERE mid IN(%s)", new Object[] { localObject1 })).c().e();
          this.i.a(String.format(Locale.US, "DELETE FROM media_v2 WHERE mid IN(%s)", new Object[] { localObject1 })).c().e();
          this.i.a("DELETE FROM media_counts_v2 WHERE 1").c().e();
          org.vidogram.messenger.d.a.a(0L, paramArrayList);
          return;
        }
        localObject1 = TextUtils.join(",", paramArrayList);
        break;
        label609: i1 = i3;
        i2 = i3;
        if (!(localException.j instanceof g.nw))
          continue;
        i2 = i3;
        Object localObject4 = m.a(localException.j.k);
        if (localObject4 != null)
        {
          i2 = i3;
          if (((File)localObject4).toString().length() > 0)
          {
            i2 = i3;
            localArrayList.add(localObject4);
          }
        }
        i2 = i3;
        File localFile = m.a(localException.j.k.i);
        i1 = i3;
        if (localFile == null)
          continue;
        i1 = i3;
        i2 = i3;
        if (localFile.toString().length() <= 0)
          continue;
        i2 = i3;
        localArrayList.add(localFile);
        i1 = i3;
      }
    }
    catch (Exception paramArrayList)
    {
      n.a("tmessages", paramArrayList);
    }
  }

  private void a(ArrayList<g.vw> paramArrayList, ArrayList<g.i> paramArrayList1, boolean paramBoolean)
  {
    if (paramBoolean);
    try
    {
      this.i.d();
      e(paramArrayList);
      f(paramArrayList1);
      if (paramBoolean)
        this.i.e();
      return;
    }
    catch (Exception paramArrayList)
    {
      n.a("tmessages", paramArrayList);
    }
  }

  private void a(ArrayList<g.ar> paramArrayList, boolean paramBoolean1, boolean paramBoolean2, int paramInt, boolean paramBoolean3)
  {
    if (paramBoolean3)
      while (true)
      {
        try
        {
          localObject1 = (g.ar)paramArrayList.get(0);
          if (((g.ar)localObject1).E != 0L)
            continue;
          if (((g.ar)localObject1).d.c == 0)
            continue;
          ((g.ar)localObject1).E = ((g.ar)localObject1).d.c;
          localObject1 = this.i.b("SELECT last_mid FROM dialogs WHERE did = " + ((g.ar)localObject1).E, new Object[0]);
          if (!((SQLiteCursor)localObject1).a())
            break label3214;
          i1 = ((SQLiteCursor)localObject1).b(0);
          ((SQLiteCursor)localObject1).b();
          if (i1 == 0)
            break;
          return;
          if (((g.ar)localObject1).d.d != 0)
          {
            ((g.ar)localObject1).E = (-((g.ar)localObject1).d.d);
            continue;
          }
        }
        catch (Exception paramArrayList)
        {
          n.a("tmessages", paramArrayList);
          return;
        }
        ((g.ar)localObject1).E = (-((g.ar)localObject1).d.b);
      }
    if (paramBoolean1)
      this.i.d();
    HashMap localHashMap2 = new HashMap();
    HashMap localHashMap1 = new HashMap();
    Object localObject7 = new HashMap();
    StringBuilder localStringBuilder = new StringBuilder();
    HashMap localHashMap4 = new HashMap();
    HashMap localHashMap3 = new HashMap();
    SQLitePreparedStatement localSQLitePreparedStatement1 = this.i.a("REPLACE INTO messages VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, NULL, ?)");
    SQLitePreparedStatement localSQLitePreparedStatement2 = this.i.a("REPLACE INTO randoms VALUES(?, ?)");
    SQLitePreparedStatement localSQLitePreparedStatement3 = this.i.a("REPLACE INTO download_queue VALUES(?, ?, ?, ?)");
    SQLitePreparedStatement localSQLitePreparedStatement4 = this.i.a("REPLACE INTO webpage_pending VALUES(?, ?)");
    int i1 = 0;
    Object localObject1 = null;
    Object localObject3 = null;
    Object localObject2 = null;
    label295: long l2;
    long l1;
    Object localObject5;
    Object localObject6;
    if (i1 < paramArrayList.size())
    {
      g.ar localar = (g.ar)paramArrayList.get(i1);
      l2 = localar.b;
      if (localar.E == 0L)
      {
        if (localar.d.c != 0)
          localar.E = localar.d.c;
      }
      else
      {
        l1 = l2;
        if (localar.d.b != 0)
          l1 = l2 | localar.d.b << 32;
        if ((u.b(localar)) && (!u.d(localar)))
        {
          localObject5 = (Integer)localHashMap4.get(Long.valueOf(localar.E));
          localObject4 = localObject5;
          if (localObject5 == null)
          {
            localObject5 = this.i.b("SELECT inbox_max FROM dialogs WHERE did = " + localar.E, new Object[0]);
            if (!((SQLiteCursor)localObject5).a())
              break label813;
          }
        }
      }
      label813: for (localObject4 = Integer.valueOf(((SQLiteCursor)localObject5).b(0)); ; localObject4 = Integer.valueOf(0))
      {
        ((SQLiteCursor)localObject5).b();
        localHashMap4.put(Long.valueOf(localar.E), localObject4);
        if ((localar.b < 0) || (((Integer)localObject4).intValue() < localar.b))
        {
          if (localStringBuilder.length() > 0)
            localStringBuilder.append(",");
          localStringBuilder.append(l1);
          localHashMap3.put(Long.valueOf(l1), Long.valueOf(localar.E));
        }
        localObject5 = localObject1;
        localObject6 = localObject3;
        localObject4 = localObject2;
        if (org.vidogram.messenger.d.f.b(localar))
        {
          localObject6 = localObject3;
          if (localObject3 == null)
          {
            localObject6 = new StringBuilder();
            localObject2 = new HashMap();
            localObject1 = new HashMap();
          }
          if (((StringBuilder)localObject6).length() > 0)
            ((StringBuilder)localObject6).append(",");
          ((StringBuilder)localObject6).append(l1);
          ((HashMap)localObject2).put(Long.valueOf(l1), Long.valueOf(localar.E));
          ((HashMap)localObject1).put(Long.valueOf(l1), Integer.valueOf(org.vidogram.messenger.d.f.a(localar)));
          localObject4 = localObject2;
          localObject5 = localObject1;
        }
        if (!c(localar))
          break label3221;
        localObject1 = (g.ar)((HashMap)localObject7).get(Long.valueOf(localar.E));
        if ((localObject1 != null) && (((g.ar)localObject1).b >= localar.b))
          break label3221;
        ((HashMap)localObject7).put(Long.valueOf(localar.E), localar);
        break label3221;
        if (localar.d.d != 0)
        {
          localar.E = (-localar.d.d);
          break;
        }
        localar.E = (-localar.d.b);
        break;
      }
    }
    Object localObject4 = ((HashMap)localObject7).entrySet().iterator();
    while (((Iterator)localObject4).hasNext())
    {
      localObject5 = (Map.Entry)((Iterator)localObject4).next();
      org.vidogram.messenger.d.a.a(((Long)((Map.Entry)localObject5).getKey()).longValue(), (g.ar)((Map.Entry)localObject5).getValue());
    }
    label1131: int i3;
    label1295: int i4;
    label1659: int i2;
    label1783: int i7;
    label1843: label2165: int i5;
    label2062: label2542: int i6;
    if (localObject3 != null)
    {
      localObject3 = this.i.b("SELECT mid FROM media_v2 WHERE mid IN(" + ((StringBuilder)localObject3).toString() + ")", new Object[0]);
      while (((SQLiteCursor)localObject3).a())
        ((HashMap)localObject2).remove(Long.valueOf(((SQLiteCursor)localObject3).d(0)));
      ((SQLiteCursor)localObject3).b();
      localObject5 = new HashMap();
      localObject6 = ((HashMap)localObject2).entrySet().iterator();
      if (!((Iterator)localObject6).hasNext())
        break label3242;
      localObject7 = (Map.Entry)((Iterator)localObject6).next();
      localObject2 = (Integer)((HashMap)localObject1).get(((Map.Entry)localObject7).getKey());
      localObject3 = (HashMap)((HashMap)localObject5).get(localObject2);
      if (localObject3 == null)
      {
        localObject3 = new HashMap();
        ((HashMap)localObject5).put(localObject2, localObject3);
      }
      for (localObject2 = Integer.valueOf(0); ; localObject2 = (Integer)((HashMap)localObject3).get(((Map.Entry)localObject7).getValue()))
      {
        localObject4 = localObject2;
        if (localObject2 == null)
          localObject4 = Integer.valueOf(0);
        i1 = ((Integer)localObject4).intValue();
        ((HashMap)localObject3).put(((Map.Entry)localObject7).getValue(), Integer.valueOf(i1 + 1));
        break;
      }
      if (localStringBuilder.length() <= 0)
        break label3249;
      localObject1 = this.i.b("SELECT mid FROM messages WHERE mid IN(" + localStringBuilder.toString() + ")", new Object[0]);
      while (((SQLiteCursor)localObject1).a())
        localHashMap3.remove(Long.valueOf(((SQLiteCursor)localObject1).d(0)));
      ((SQLiteCursor)localObject1).b();
      localObject4 = localHashMap3.values().iterator();
      while (true)
        if (((Iterator)localObject4).hasNext())
        {
          localObject5 = (Long)((Iterator)localObject4).next();
          localObject2 = (Integer)localHashMap1.get(localObject5);
          localObject1 = localObject2;
          if (localObject2 == null)
            localObject1 = Integer.valueOf(0);
          localHashMap1.put(localObject5, Integer.valueOf(((Integer)localObject1).intValue() + 1));
          continue;
          if (i3 < paramArrayList.size())
          {
            localObject4 = (g.ar)paramArrayList.get(i3);
            d((g.ar)localObject4);
            localSQLitePreparedStatement1.d();
            l1 = ((g.ar)localObject4).b;
            if (((g.ar)localObject4).D != 0)
              l1 = ((g.ar)localObject4).D;
            l2 = l1;
            if (((g.ar)localObject4).d.b != 0)
              l2 = l1 | ((g.ar)localObject4).d.b << 32;
            localObject5 = new NativeByteBuffer(((g.ar)localObject4).b());
            ((g.ar)localObject4).a((org.vidogram.tgnet.a)localObject5);
            i4 = 1;
            i1 = i4;
            if (((g.ar)localObject4).f != null)
            {
              i1 = i4;
              if ((((g.ar)localObject4).f instanceof g.ne))
              {
                i1 = i4;
                if (!(((g.ar)localObject4).f.d instanceof g.gu))
                {
                  i1 = i4;
                  if (!(((g.ar)localObject4).f.d instanceof g.gt))
                    i1 = 0;
                }
              }
            }
            if (i1 != 0)
            {
              localObject2 = (g.ar)localHashMap2.get(Long.valueOf(((g.ar)localObject4).E));
              if ((localObject2 == null) || (((g.ar)localObject4).e > ((g.ar)localObject2).e) || ((((g.ar)localObject4).b > 0) && (((g.ar)localObject2).b > 0) && (((g.ar)localObject4).b > ((g.ar)localObject2).b)) || ((((g.ar)localObject4).b < 0) && (((g.ar)localObject2).b < 0) && (((g.ar)localObject4).b < ((g.ar)localObject2).b)))
                localHashMap2.put(Long.valueOf(((g.ar)localObject4).E), localObject4);
            }
            localSQLitePreparedStatement1.a(1, l2);
            localSQLitePreparedStatement1.a(2, ((g.ar)localObject4).E);
            localSQLitePreparedStatement1.a(3, u.a((g.ar)localObject4));
            localSQLitePreparedStatement1.a(4, ((g.ar)localObject4).y);
            localSQLitePreparedStatement1.a(5, ((g.ar)localObject4).e);
            localSQLitePreparedStatement1.a(6, (NativeByteBuffer)localObject5);
            if (!u.d((g.ar)localObject4))
              break label3278;
            i1 = 1;
            localSQLitePreparedStatement1.a(7, i1);
            localSQLitePreparedStatement1.a(8, ((g.ar)localObject4).F);
            if ((((g.ar)localObject4).k & 0x400) != 0)
            {
              localSQLitePreparedStatement1.a(9, ((g.ar)localObject4).s);
              localSQLitePreparedStatement1.a(10, 0);
              localSQLitePreparedStatement1.b();
              if (((g.ar)localObject4).C != 0L)
              {
                localSQLitePreparedStatement2.d();
                localSQLitePreparedStatement2.a(1, ((g.ar)localObject4).C);
                localSQLitePreparedStatement2.a(2, l2);
                localSQLitePreparedStatement2.b();
              }
              if (!org.vidogram.messenger.d.f.b((g.ar)localObject4))
                break label3185;
              if (localObject1 != null)
                break;
              localObject2 = this.i.a("REPLACE INTO media_v2 VALUES(?, ?, ?, ?, ?)");
              ((SQLitePreparedStatement)localObject2).d();
              ((SQLitePreparedStatement)localObject2).a(1, l2);
              ((SQLitePreparedStatement)localObject2).a(2, ((g.ar)localObject4).E);
              ((SQLitePreparedStatement)localObject2).a(3, ((g.ar)localObject4).e);
              ((SQLitePreparedStatement)localObject2).a(4, org.vidogram.messenger.d.f.a((g.ar)localObject4));
              ((SQLitePreparedStatement)localObject2).a(5, (NativeByteBuffer)localObject5);
              ((SQLitePreparedStatement)localObject2).b();
              if (((((g.ar)localObject4).j instanceof g.oi)) && ((((g.ar)localObject4).j.r instanceof g.vr)))
              {
                localSQLitePreparedStatement4.d();
                localSQLitePreparedStatement4.a(1, ((g.ar)localObject4).j.r.d);
                localSQLitePreparedStatement4.a(2, l2);
                localSQLitePreparedStatement4.b();
              }
              ((NativeByteBuffer)localObject5).e();
              if (((((g.ar)localObject4).d.b != 0) && (!((g.ar)localObject4).v)) || (((g.ar)localObject4).e < ConnectionsManager.a().b() - 3600) || (paramInt == 0) || ((!(((g.ar)localObject4).j instanceof g.ob)) && (!(((g.ar)localObject4).j instanceof g.nw))))
                break label3192;
              i4 = 0;
              i1 = 0;
              l1 = 0L;
              localObject1 = null;
              if (!u.i((g.ar)localObject4))
                break label2165;
              if (((paramInt & 0x2) == 0) || (((g.ar)localObject4).j.k.h >= 5242880))
                break label3199;
              l1 = ((g.ar)localObject4).j.k.b;
              i1 = 2;
              localObject1 = new g.nw();
              ((g.au)localObject1).l = "";
              ((g.au)localObject1).k = ((g.ar)localObject4).j.k;
            }
            while (true)
            {
              if (localObject1 == null)
                break label3192;
              localSQLitePreparedStatement3.d();
              localObject5 = new NativeByteBuffer(((g.au)localObject1).b());
              ((g.au)localObject1).a((org.vidogram.tgnet.a)localObject5);
              localSQLitePreparedStatement3.a(1, l1);
              localSQLitePreparedStatement3.a(2, i1);
              localSQLitePreparedStatement3.a(3, ((g.ar)localObject4).e);
              localSQLitePreparedStatement3.a(4, (NativeByteBuffer)localObject5);
              localSQLitePreparedStatement3.b();
              ((NativeByteBuffer)localObject5).e();
              i1 = i2 | i1;
              break label3261;
              localSQLitePreparedStatement1.a(9, b((g.ar)localObject4));
              break;
              if ((((g.ar)localObject4).j instanceof g.ob))
              {
                if ((paramInt & 0x1) == 0)
                  break label3199;
                i1 = i4;
                if (m.a(((g.ar)localObject4).j.d.h, a.f()) == null)
                  break label3284;
                l1 = ((g.ar)localObject4).j.d.b;
                i1 = 1;
                localObject1 = new g.ob();
                ((g.au)localObject1).l = "";
                ((g.au)localObject1).d = ((g.ar)localObject4).j.d;
                break label3284;
              }
              if (u.j((g.ar)localObject4))
              {
                if ((paramInt & 0x4) == 0)
                  break label3199;
                l1 = ((g.ar)localObject4).j.k.b;
                i1 = 4;
                localObject1 = new g.nw();
                ((g.au)localObject1).l = "";
                ((g.au)localObject1).k = ((g.ar)localObject4).j.k;
                continue;
              }
              if ((!(((g.ar)localObject4).j instanceof g.nw)) || (u.h((g.ar)localObject4)) || (u.a(((g.ar)localObject4).j.k)) || ((paramInt & 0x8) == 0))
                break label3199;
              l1 = ((g.ar)localObject4).j.k.b;
              i1 = 8;
              localObject1 = new g.nw();
              ((g.au)localObject1).l = "";
              ((g.au)localObject1).k = ((g.ar)localObject4).j.k;
            }
          }
          else
          {
            localSQLitePreparedStatement1.e();
            if (localObject1 != null)
              ((SQLitePreparedStatement)localObject1).e();
            localSQLitePreparedStatement2.e();
            localSQLitePreparedStatement3.e();
            localSQLitePreparedStatement4.e();
            localObject1 = this.i.a("REPLACE INTO dialogs VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            paramArrayList = new HashMap();
            paramArrayList.putAll(localHashMap2);
            localObject2 = paramArrayList.entrySet().iterator();
            while (true)
              if (((Iterator)localObject2).hasNext())
              {
                localObject4 = (Long)((Map.Entry)((Iterator)localObject2).next()).getKey();
                if (((Long)localObject4).longValue() == 0L)
                  continue;
                localObject5 = (g.ar)localHashMap2.get(localObject4);
                if (localObject5 == null)
                  break label3172;
                i1 = ((g.ar)localObject5).d.b;
                paramArrayList = this.i.b("SELECT date, unread_count, pts, last_mid, inbox_max, outbox_max FROM dialogs WHERE did = " + localObject4, new Object[0]);
                if (i1 == 0)
                  break label3310;
                paramInt = 1;
                label2583: if (!paramArrayList.a())
                  break;
                i7 = paramArrayList.b(0);
                paramInt = paramArrayList.b(1);
                i4 = paramArrayList.b(2);
                i5 = paramArrayList.b(3);
                int i8 = paramArrayList.b(4);
                i3 = paramArrayList.b(5);
                i6 = paramInt;
                paramInt = i8;
                label2640: paramArrayList.b();
                paramArrayList = (Integer)localHashMap1.get(localObject4);
                if (paramArrayList == null)
                {
                  paramArrayList = Integer.valueOf(0);
                  label2664: if (localObject5 == null)
                    break label3338;
                  l2 = ((g.ar)localObject5).b;
                }
              }
          }
        }
    }
    while (true)
    {
      l1 = l2;
      if (localObject5 != null)
      {
        l1 = l2;
        if (((g.ar)localObject5).D != 0)
          l1 = ((g.ar)localObject5).D;
      }
      while (true)
      {
        ((SQLitePreparedStatement)localObject1).d();
        ((SQLitePreparedStatement)localObject1).a(1, ((Long)localObject4).longValue());
        if ((localObject5 != null) && ((!paramBoolean2) || (i7 == 0)))
          ((SQLitePreparedStatement)localObject1).a(2, ((g.ar)localObject5).e);
        while (true)
        {
          ((SQLitePreparedStatement)localObject1).a(3, paramArrayList.intValue() + i6);
          ((SQLitePreparedStatement)localObject1).a(4, l2);
          ((SQLitePreparedStatement)localObject1).a(5, paramInt);
          ((SQLitePreparedStatement)localObject1).a(6, i3);
          ((SQLitePreparedStatement)localObject1).a(7, 0L);
          ((SQLitePreparedStatement)localObject1).a(8, 0);
          ((SQLitePreparedStatement)localObject1).a(9, i4);
          ((SQLitePreparedStatement)localObject1).a(10, 0);
          ((SQLitePreparedStatement)localObject1).b();
          break;
          if (i1 == 0)
            break label3316;
          v.a().j(i1);
          break label3316;
          localHashMap1.put(localObject4, Integer.valueOf(paramArrayList.intValue() + i6));
          break label2664;
          ((SQLitePreparedStatement)localObject1).a(2, i7);
        }
        ((SQLitePreparedStatement)localObject1).e();
        if (localObject3 != null)
        {
          paramArrayList = this.i.a("REPLACE INTO media_counts_v2 VALUES(?, ?, ?)");
          localObject1 = ((HashMap)localObject3).entrySet().iterator();
          while (((Iterator)localObject1).hasNext())
          {
            localObject3 = (Map.Entry)((Iterator)localObject1).next();
            localObject2 = (Integer)((Map.Entry)localObject3).getKey();
            localObject3 = ((HashMap)((Map.Entry)localObject3).getValue()).entrySet().iterator();
            while (((Iterator)localObject3).hasNext())
            {
              localObject4 = (Map.Entry)((Iterator)localObject3).next();
              l1 = ((Long)((Map.Entry)localObject4).getKey()).longValue();
              paramInt = (int)l1;
              paramInt = -1;
              localObject5 = this.i.b(String.format(Locale.US, "SELECT count FROM media_counts_v2 WHERE uid = %d AND type = %d LIMIT 1", new Object[] { Long.valueOf(l1), localObject2 }), new Object[0]);
              if (((SQLiteCursor)localObject5).a())
                paramInt = ((SQLiteCursor)localObject5).b(0);
              ((SQLiteCursor)localObject5).b();
              if (paramInt == -1)
                continue;
              paramArrayList.d();
              i1 = ((Integer)((Map.Entry)localObject4).getValue()).intValue();
              paramArrayList.a(1, l1);
              paramArrayList.a(2, ((Integer)localObject2).intValue());
              paramArrayList.a(3, i1 + paramInt);
              paramArrayList.b();
            }
          }
          paramArrayList.e();
        }
        if (paramBoolean1)
          this.i.e();
        v.a().a(localHashMap1);
        if (i2 != 0)
        {
          a.a(new Runnable(i2)
          {
            public void run()
            {
              MediaController.a().b(this.a);
            }
          });
          return;
          label3172: i1 = 0;
          break label2542;
          localObject2 = localObject1;
          break label1783;
          label3185: localObject2 = localObject1;
          break label1843;
          label3192: i1 = i2;
          break label3261;
          label3199: l1 = 0L;
          localObject1 = null;
          break label2062;
          localObject3 = null;
          break label1131;
          label3214: i1 = -1;
          break;
        }
        else
        {
          return;
          label3221: i1 += 1;
          localObject3 = localObject6;
          localObject2 = localObject4;
          localObject1 = localObject5;
          break label295;
          label3242: localObject3 = localObject5;
          break label1131;
          label3249: i2 = 0;
          i3 = 0;
          localObject1 = null;
          break label1295;
        }
        label3261: i3 += 1;
        localObject1 = localObject2;
        i2 = i1;
        break label1295;
        label3278: i1 = 0;
        break label1659;
        label3284: break label2062;
        l2 = l1;
        if (i1 == 0)
          continue;
        l2 = l1 | i1 << 32;
      }
      label3310: paramInt = 0;
      break label2583;
      label3316: i6 = 0;
      i7 = 0;
      i4 = paramInt;
      i3 = 0;
      paramInt = 0;
      i5 = 0;
      break label2640;
      label3338: l2 = i5;
    }
  }

  public static void a(g.ar paramar, ArrayList<Integer> paramArrayList1, ArrayList<Integer> paramArrayList2)
  {
    int i2 = 0;
    if (paramar.c != 0)
    {
      if (paramar.c <= 0)
        break label277;
      if (!paramArrayList1.contains(Integer.valueOf(paramar.c)))
        paramArrayList1.add(Integer.valueOf(paramar.c));
    }
    int i1;
    Object localObject;
    while (true)
    {
      if ((paramar.x != 0) && (!paramArrayList1.contains(Integer.valueOf(paramar.x))))
        paramArrayList1.add(Integer.valueOf(paramar.x));
      if (paramar.f == null)
        break;
      if ((paramar.f.i != 0) && (!paramArrayList1.contains(Integer.valueOf(paramar.f.i))))
        paramArrayList1.add(Integer.valueOf(paramar.f.i));
      if ((paramar.f.f != 0) && (!paramArrayList2.contains(Integer.valueOf(paramar.f.f))))
        paramArrayList2.add(Integer.valueOf(paramar.f.f));
      if ((paramar.f.h != 0) && (!paramArrayList2.contains(Integer.valueOf(paramar.f.h))))
        paramArrayList2.add(Integer.valueOf(paramar.f.h));
      if (paramar.f.e.isEmpty())
        break;
      i1 = 0;
      while (i1 < paramar.f.e.size())
      {
        localObject = (Integer)paramar.f.e.get(i1);
        if (!paramArrayList1.contains(localObject))
          paramArrayList1.add(localObject);
        i1 += 1;
      }
      label277: if (paramArrayList2.contains(Integer.valueOf(-paramar.c)))
        continue;
      paramArrayList2.add(Integer.valueOf(-paramar.c));
    }
    if (!paramar.p.isEmpty())
    {
      i1 = i2;
      if (i1 < paramar.p.size())
      {
        localObject = (g.at)paramar.p.get(i1);
        if ((localObject instanceof g.nm))
          paramArrayList1.add(Integer.valueOf(((g.nm)localObject).g));
        while (true)
        {
          i1 += 1;
          break;
          if (!(localObject instanceof g.kn))
            continue;
          paramArrayList1.add(Integer.valueOf(((g.kn)localObject).g.b));
        }
      }
    }
    if ((paramar.j != null) && (paramar.j.q != 0) && (!paramArrayList1.contains(Integer.valueOf(paramar.j.q))))
      paramArrayList1.add(Integer.valueOf(paramar.j.q));
    if (paramar.w != null)
    {
      if ((paramar.w.d != 0) && (!paramArrayList1.contains(Integer.valueOf(paramar.w.d))))
        paramArrayList1.add(Integer.valueOf(paramar.w.d));
      if ((paramar.w.f != 0) && (!paramArrayList2.contains(Integer.valueOf(paramar.w.f))))
        paramArrayList2.add(Integer.valueOf(paramar.w.f));
    }
    if ((paramar.F < 0) && (!paramArrayList2.contains(Integer.valueOf(-paramar.F))))
      paramArrayList2.add(Integer.valueOf(-paramar.F));
  }

  private int b(g.ar paramar)
  {
    if (((paramar instanceof g.ov)) && ((((paramar.j instanceof g.ob)) && (paramar.F > 0) && (paramar.F <= 60)) || (u.i(paramar)) || (u.j(paramar))))
      return 1;
    if (((paramar.j instanceof g.ob)) || (u.j(paramar)))
      return 0;
    return -1;
  }

  private void b(ArrayList<Integer> paramArrayList, int paramInt)
  {
    if (Thread.currentThread().getId() != this.h.getId())
      throw new RuntimeException("wrong db thread");
    Object localObject;
    label210: label228: label248: ArrayList localArrayList1;
    ArrayList localArrayList2;
    ArrayList localArrayList3;
    ArrayList localArrayList4;
    label322: g.hq localhq;
    while (true)
    {
      try
      {
        if (paramArrayList.isEmpty())
          break;
        localObject = new ArrayList();
        if (paramInt == 0)
          continue;
        ((ArrayList)localObject).add(Long.valueOf(-paramInt));
        paramArrayList = this.i.a("UPDATE dialogs SET last_mid = (SELECT mid FROM messages WHERE uid = ? AND date = (SELECT MAX(date) FROM messages WHERE uid = ? )) WHERE did = ?");
        this.i.d();
        i1 = 0;
        if (i1 >= ((ArrayList)localObject).size())
          break label228;
        long l1 = ((Long)((ArrayList)localObject).get(i1)).longValue();
        paramArrayList.d();
        paramArrayList.a(1, l1);
        paramArrayList.a(2, l1);
        paramArrayList.a(3, l1);
        paramArrayList.b();
        i1 += 1;
        continue;
        paramArrayList = TextUtils.join(",", paramArrayList);
        paramArrayList = this.i.b(String.format(Locale.US, "SELECT did FROM dialogs WHERE last_mid IN(%s)", new Object[] { paramArrayList }), new Object[0]);
        if (!paramArrayList.a())
          break label210;
        ((ArrayList)localObject).add(Long.valueOf(paramArrayList.d(0)));
        continue;
      }
      catch (Exception paramArrayList)
      {
        n.a("tmessages", paramArrayList);
      }
      return;
      paramArrayList.b();
      paramArrayList = this.i.a("UPDATE dialogs SET unread_count = 0, unread_count_i = 0, last_mid = (SELECT mid FROM messages WHERE uid = ? AND date = (SELECT MAX(date) FROM messages WHERE uid = ? AND date != 0)) WHERE did = ?");
      continue;
      paramArrayList.e();
      this.i.e();
      paramArrayList = TextUtils.join(",", (Iterable)localObject);
      localObject = new g.wd();
      localArrayList1 = new ArrayList();
      localArrayList2 = new ArrayList();
      localArrayList3 = new ArrayList();
      localArrayList4 = new ArrayList();
      paramArrayList = this.i.b(String.format(Locale.US, "SELECT d.did, d.last_mid, d.unread_count, d.date, m.data, m.read_state, m.mid, m.send_state, m.date, d.pts, d.inbox_max, d.outbox_max FROM dialogs as d LEFT JOIN messages as m ON d.last_mid = m.mid WHERE d.did IN(%s)", new Object[] { paramArrayList }), new Object[0]);
      if (!paramArrayList.a())
        break label704;
      localhq = new g.hq();
      localhq.m = paramArrayList.d(0);
      localhq.e = paramArrayList.b(1);
      localhq.f = paramArrayList.b(10);
      localhq.g = paramArrayList.b(11);
      localhq.h = paramArrayList.b(2);
      localhq.l = paramArrayList.b(3);
      localhq.j = paramArrayList.b(9);
      if (paramInt != 0)
        break label812;
    }
    label812: for (int i1 = 0; ; i1 = 1)
    {
      localhq.c = i1;
      ((g.wd)localObject).b.add(localhq);
      NativeByteBuffer localNativeByteBuffer = paramArrayList.g(4);
      if (localNativeByteBuffer != null)
      {
        g.ar localar = g.ar.a(localNativeByteBuffer, localNativeByteBuffer.b(false), false);
        localNativeByteBuffer.e();
        u.a(localar, paramArrayList.b(5));
        localar.b = paramArrayList.b(6);
        localar.y = paramArrayList.b(7);
        i1 = paramArrayList.b(8);
        if (i1 != 0)
          localhq.l = i1;
        localar.E = localhq.m;
        ((g.wd)localObject).c.add(localar);
        a(localar, localArrayList2, localArrayList3);
      }
      i1 = (int)localhq.m;
      int i2 = (int)(localhq.m >> 32);
      if (i1 != 0)
      {
        if (i2 == 1)
        {
          if (localArrayList3.contains(Integer.valueOf(i1)))
            break label322;
          localArrayList3.add(Integer.valueOf(i1));
          break label322;
          paramArrayList = "" + -paramInt;
          break label248;
        }
        if (i1 > 0)
        {
          if (localArrayList2.contains(Integer.valueOf(i1)))
            break label322;
          localArrayList2.add(Integer.valueOf(i1));
          break label322;
        }
        if (localArrayList3.contains(Integer.valueOf(-i1)))
          break label322;
        localArrayList3.add(Integer.valueOf(-i1));
        break label322;
      }
      if (localArrayList4.contains(Integer.valueOf(i2)))
        break label322;
      localArrayList4.add(Integer.valueOf(i2));
      break label322;
      label704: paramArrayList.b();
      if (!localArrayList4.isEmpty())
        a(TextUtils.join(",", localArrayList4), localArrayList1, localArrayList2);
      if (!localArrayList3.isEmpty())
        b(TextUtils.join(",", localArrayList3), ((g.wd)localObject).d);
      if (!localArrayList2.isEmpty())
        a(TextUtils.join(",", localArrayList2), ((g.wd)localObject).e);
      if ((((g.wd)localObject).b.isEmpty()) && (localArrayList1.isEmpty()))
        break;
      v.a().a((g.wd)localObject, localArrayList1);
      return;
    }
  }

  private void b(g.wd paramwd)
  {
    while (true)
    {
      int i1;
      Object localObject;
      SQLitePreparedStatement localSQLitePreparedStatement1;
      SQLitePreparedStatement localSQLitePreparedStatement2;
      SQLitePreparedStatement localSQLitePreparedStatement3;
      SQLitePreparedStatement localSQLitePreparedStatement4;
      SQLitePreparedStatement localSQLitePreparedStatement5;
      g.hq localhq;
      try
      {
        this.i.d();
        HashMap localHashMap = new HashMap();
        i1 = 0;
        if (i1 >= paramwd.c.size())
          continue;
        localObject = (g.ar)paramwd.c.get(i1);
        localHashMap.put(Long.valueOf(((g.ar)localObject).E), localObject);
        i1 += 1;
        continue;
        if (paramwd.b.isEmpty())
          break label841;
        localObject = this.i.a("REPLACE INTO messages VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, NULL, ?)");
        localSQLitePreparedStatement1 = this.i.a("REPLACE INTO dialogs VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
        localSQLitePreparedStatement2 = this.i.a("REPLACE INTO media_v2 VALUES(?, ?, ?, ?, ?)");
        localSQLitePreparedStatement3 = this.i.a("REPLACE INTO dialog_settings VALUES(?, ?)");
        localSQLitePreparedStatement4 = this.i.a("REPLACE INTO messages_holes VALUES(?, ?, ?)");
        localSQLitePreparedStatement5 = this.i.a("REPLACE INTO media_holes_v2 VALUES(?, ?, ?, ?)");
        i1 = 0;
        if (i1 >= paramwd.b.size())
          break label811;
        localhq = (g.hq)paramwd.b.get(i1);
        if (localhq.m != 0L)
          continue;
        if (localhq.d.c == 0)
          continue;
        localhq.m = localhq.d.c;
        i2 = 0;
        g.ar localar = (g.ar)localHashMap.get(Long.valueOf(localhq.m));
        if (localar == null)
          continue;
        int i3 = Math.max(localar.e, 0);
        if (!c(localar))
          continue;
        org.vidogram.messenger.d.a.a(localhq.m, localar);
        d(localar);
        NativeByteBuffer localNativeByteBuffer = new NativeByteBuffer(localar.b());
        localar.a(localNativeByteBuffer);
        long l2 = localar.b;
        long l1 = l2;
        if (localar.d.b == 0)
          continue;
        l1 = l2 | localar.d.b << 32;
        ((SQLitePreparedStatement)localObject).d();
        ((SQLitePreparedStatement)localObject).a(1, l1);
        ((SQLitePreparedStatement)localObject).a(2, localhq.m);
        ((SQLitePreparedStatement)localObject).a(3, u.a(localar));
        ((SQLitePreparedStatement)localObject).a(4, localar.y);
        ((SQLitePreparedStatement)localObject).a(5, localar.e);
        ((SQLitePreparedStatement)localObject).a(6, localNativeByteBuffer);
        if (!u.d(localar))
          break label872;
        i2 = 1;
        ((SQLitePreparedStatement)localObject).a(7, i2);
        ((SQLitePreparedStatement)localObject).a(8, 0);
        if ((localar.k & 0x400) == 0)
          break label877;
        i2 = localar.s;
        ((SQLitePreparedStatement)localObject).a(9, i2);
        ((SQLitePreparedStatement)localObject).a(10, 0);
        ((SQLitePreparedStatement)localObject).b();
        if (!org.vidogram.messenger.d.f.b(localar))
          continue;
        localSQLitePreparedStatement2.d();
        localSQLitePreparedStatement2.a(1, l1);
        localSQLitePreparedStatement2.a(2, localhq.m);
        localSQLitePreparedStatement2.a(3, localar.e);
        localSQLitePreparedStatement2.a(4, org.vidogram.messenger.d.f.a(localar));
        localSQLitePreparedStatement2.a(5, localNativeByteBuffer);
        localSQLitePreparedStatement2.b();
        localNativeByteBuffer.e();
        a(localhq.m, localSQLitePreparedStatement4, localSQLitePreparedStatement5, localar.b);
        i2 = i3;
        l2 = localhq.e;
        l1 = l2;
        if (localhq.d.b == 0)
          continue;
        l1 = l2 | localhq.d.b << 32;
        localSQLitePreparedStatement1.d();
        localSQLitePreparedStatement1.a(1, localhq.m);
        localSQLitePreparedStatement1.a(2, i2);
        localSQLitePreparedStatement1.a(3, localhq.h);
        localSQLitePreparedStatement1.a(4, l1);
        localSQLitePreparedStatement1.a(5, localhq.f);
        localSQLitePreparedStatement1.a(6, localhq.g);
        localSQLitePreparedStatement1.a(7, 0L);
        localSQLitePreparedStatement1.a(8, 0);
        localSQLitePreparedStatement1.a(9, localhq.j);
        localSQLitePreparedStatement1.a(10, 0);
        localSQLitePreparedStatement1.b();
        if (localhq.i == null)
          break label865;
        localSQLitePreparedStatement3.d();
        localSQLitePreparedStatement3.a(1, localhq.m);
        if (localhq.i.d == 0)
          break label882;
        i2 = 1;
        localSQLitePreparedStatement3.a(2, i2);
        localSQLitePreparedStatement3.b();
        break label865;
        if (localhq.d.d != 0)
        {
          localhq.m = (-localhq.d.d);
          continue;
        }
      }
      catch (Exception paramwd)
      {
        n.a("tmessages", paramwd);
        return;
      }
      localhq.m = (-localhq.d.b);
      continue;
      label811: ((SQLitePreparedStatement)localObject).e();
      localSQLitePreparedStatement1.e();
      localSQLitePreparedStatement2.e();
      localSQLitePreparedStatement3.e();
      localSQLitePreparedStatement4.e();
      localSQLitePreparedStatement5.e();
      label841: e(paramwd.e);
      f(paramwd.d);
      this.i.e();
      return;
      label865: i1 += 1;
      continue;
      label872: int i2 = 0;
      continue;
      label877: i2 = 0;
      continue;
      label882: i2 = 0;
    }
  }

  private boolean c(g.ar paramar)
  {
    return (paramar.r != null) && (!(paramar.r instanceof g.sf)) && ((!paramar.r.d) || (paramar.l));
  }

  private void d(g.ar paramar)
  {
    if (paramar == null);
    do
      while (true)
      {
        return;
        if (!(paramar.j instanceof g.oe))
          break;
        if (paramar.j.b.length != 0)
          continue;
        paramar.j.b = new byte[1];
        paramar.j.b[0] = 57;
        return;
      }
    while (!(paramar.j instanceof g.od));
    paramar.j = new g.oe();
    paramar.j.b = new byte[1];
    paramar.j.b[0] = 57;
    paramar.k |= 512;
  }

  private void e(ArrayList<g.vw> paramArrayList)
  {
    if ((paramArrayList == null) || (paramArrayList.isEmpty()))
      return;
    SQLitePreparedStatement localSQLitePreparedStatement = this.i.a("REPLACE INTO users VALUES(?, ?, ?, ?)");
    int i1 = 0;
    while (true)
      if (i1 < paramArrayList.size())
      {
        Object localObject3 = (g.vw)paramArrayList.get(i1);
        Object localObject1 = localObject3;
        SQLiteCursor localSQLiteCursor;
        if (((g.vw)localObject3).y)
        {
          localSQLiteCursor = this.i.b(String.format(Locale.US, "SELECT data FROM users WHERE uid = %d", new Object[] { Integer.valueOf(((g.vw)localObject3).d) }), new Object[0]);
          localObject1 = localObject3;
          if (!localSQLiteCursor.a());
        }
        try
        {
          NativeByteBuffer localNativeByteBuffer = localSQLiteCursor.g(0);
          localObject1 = localObject3;
          if (localNativeByteBuffer != null)
          {
            localvw = g.vw.a(localNativeByteBuffer, localNativeByteBuffer.b(false), false);
            localNativeByteBuffer.e();
            localObject1 = localObject3;
            if (localvw != null)
            {
              if (((g.vw)localObject3).g == null)
                break label326;
              localvw.g = ((g.vw)localObject3).g;
              localvw.m |= 8;
            }
          }
          while (true)
          {
            if (((g.vw)localObject3).j == null)
              break label362;
            localvw.j = ((g.vw)localObject3).j;
            localvw.m |= 32;
            localObject1 = localvw;
            localSQLiteCursor.b();
            localSQLitePreparedStatement.d();
            localObject3 = new NativeByteBuffer(localObject1.b());
            localObject1.a((org.vidogram.tgnet.a)localObject3);
            localSQLitePreparedStatement.a(1, localObject1.d);
            localSQLitePreparedStatement.a(2, a(localObject1));
            if (localObject1.k == null)
              break label428;
            if (!(localObject1.k instanceof g.ve))
              break label384;
            localObject1.k.c = -100;
            localSQLitePreparedStatement.a(3, localObject1.k.c);
            localSQLitePreparedStatement.a(4, (NativeByteBuffer)localObject3);
            localSQLitePreparedStatement.b();
            ((NativeByteBuffer)localObject3).e();
            i1 += 1;
            break;
            label326: localvw.g = null;
            localvw.m &= -9;
          }
        }
        catch (Exception localObject2)
        {
          while (true)
          {
            g.vw localvw;
            n.a("tmessages", localException);
            Object localObject2 = localObject3;
            continue;
            label362: localvw.j = null;
            localvw.m &= -33;
            continue;
            label384: if ((localObject2.k instanceof g.vb))
            {
              localObject2.k.c = -101;
              continue;
            }
            if (!(localObject2.k instanceof g.va))
              continue;
            localObject2.k.c = -102;
            continue;
            label428: localSQLitePreparedStatement.a(3, 0);
          }
        }
      }
    localSQLitePreparedStatement.e();
  }

  private void f(ArrayList<g.i> paramArrayList)
  {
    if ((paramArrayList == null) || (paramArrayList.isEmpty()))
      return;
    SQLitePreparedStatement localSQLitePreparedStatement = this.i.a("REPLACE INTO chats VALUES(?, ?, ?)");
    int i1 = 0;
    while (true)
      if (i1 < paramArrayList.size())
      {
        Object localObject3 = (g.i)paramArrayList.get(i1);
        Object localObject1 = localObject3;
        SQLiteCursor localSQLiteCursor;
        if (((g.i)localObject3).A)
        {
          localSQLiteCursor = this.i.b(String.format(Locale.US, "SELECT data FROM chats WHERE uid = %d", new Object[] { Integer.valueOf(((g.i)localObject3).h) }), new Object[0]);
          localObject1 = localObject3;
          if (!localSQLiteCursor.a());
        }
        try
        {
          NativeByteBuffer localNativeByteBuffer = localSQLiteCursor.g(0);
          localObject1 = localObject3;
          g.i locali;
          if (localNativeByteBuffer != null)
          {
            locali = g.i.a(localNativeByteBuffer, localNativeByteBuffer.b(false), false);
            localNativeByteBuffer.e();
            localObject1 = localObject3;
            if (locali != null)
            {
              locali.i = ((g.i)localObject3).i;
              locali.j = ((g.i)localObject3).j;
              locali.p = ((g.i)localObject3).p;
              locali.q = ((g.i)localObject3).q;
              locali.r = ((g.i)localObject3).r;
              locali.x = ((g.i)localObject3).x;
              if (((g.i)localObject3).v == null)
                break label325;
              locali.v = ((g.i)localObject3).v;
              locali.b |= 64;
            }
          }
          while (true)
          {
            localObject1 = locali;
            localSQLiteCursor.b();
            localSQLitePreparedStatement.d();
            localObject3 = new NativeByteBuffer(localObject1.b());
            localObject1.a((org.vidogram.tgnet.a)localObject3);
            localSQLitePreparedStatement.a(1, localObject1.h);
            if (localObject1.i == null)
              break label361;
            localSQLitePreparedStatement.a(2, localObject1.i.toLowerCase());
            localSQLitePreparedStatement.a(3, (NativeByteBuffer)localObject3);
            localSQLitePreparedStatement.b();
            ((NativeByteBuffer)localObject3).e();
            i1 += 1;
            break;
            label325: locali.v = null;
            locali.b &= -65;
          }
        }
        catch (Exception localObject2)
        {
          while (true)
          {
            n.a("tmessages", localException);
            Object localObject2 = localObject3;
            continue;
            label361: localSQLitePreparedStatement.a(2, "");
          }
        }
      }
    localSQLitePreparedStatement.e();
  }

  private void j()
  {
    this.h.b(new Runnable()
    {
      public void run()
      {
        while (true)
        {
          long l1;
          NativeByteBuffer localNativeByteBuffer;
          try
          {
            SQLiteCursor localSQLiteCursor = w.a(w.this).b("SELECT id, data FROM pending_tasks WHERE 1", new Object[0]);
            if (!localSQLiteCursor.a())
              break label356;
            l1 = localSQLiteCursor.d(0);
            localNativeByteBuffer = localSQLiteCursor.g(1);
            if (localNativeByteBuffer == null)
              continue;
            switch (localNativeByteBuffer.b(false))
            {
            case 0:
              localNativeByteBuffer.e();
              continue;
            case 1:
            case 2:
            case 3:
            }
          }
          catch (Exception localException)
          {
            n.a("tmessages", localException);
            return;
          }
          Object localObject = g.i.a(localNativeByteBuffer, localNativeByteBuffer.b(false), false);
          if (localObject == null)
            continue;
          Utilities.c.b(new Runnable((g.i)localObject, l1)
          {
            public void run()
            {
              v.a().a(this.a, this.b);
            }
          });
          continue;
          int i = localNativeByteBuffer.b(false);
          int j = localNativeByteBuffer.b(false);
          Utilities.c.b(new Runnable(i, j, l1)
          {
            public void run()
            {
              v.a().a(this.a, this.b, this.c);
            }
          });
          continue;
          localObject = new g.hq();
          ((g.hq)localObject).m = localNativeByteBuffer.d(false);
          ((g.hq)localObject).e = localNativeByteBuffer.b(false);
          ((g.hq)localObject).f = localNativeByteBuffer.b(false);
          ((g.hq)localObject).g = localNativeByteBuffer.b(false);
          ((g.hq)localObject).h = localNativeByteBuffer.b(false);
          ((g.hq)localObject).l = localNativeByteBuffer.b(false);
          ((g.hq)localObject).j = localNativeByteBuffer.b(false);
          ((g.hq)localObject).c = localNativeByteBuffer.b(false);
          a.a(new Runnable((g.hq)localObject, g.aj.a(localNativeByteBuffer, localNativeByteBuffer.b(false), false), l1)
          {
            public void run()
            {
              v.a().a(this.a, this.b, this.c);
            }
          });
          continue;
          long l2 = localNativeByteBuffer.d(false);
          localObject = g.aj.a(localNativeByteBuffer, localNativeByteBuffer.b(false), false);
          g.ke localke = (g.ke)g.ah.a(localNativeByteBuffer, localNativeByteBuffer.b(false), false);
          ac.a().a((g.aj)localObject, localke, l2, l1);
          continue;
          label356: localException.b();
          return;
        }
      }
    });
  }

  public int a(boolean paramBoolean, long paramLong)
  {
    Semaphore localSemaphore = new Semaphore(0);
    Integer[] arrayOfInteger = new Integer[1];
    arrayOfInteger[0] = Integer.valueOf(0);
    a().c().b(new Runnable(paramBoolean, paramLong, arrayOfInteger, localSemaphore)
    {
      public void run()
      {
        Object localObject3 = null;
        SQLiteCursor localSQLiteCursor1 = null;
        SQLiteCursor localSQLiteCursor2 = localSQLiteCursor1;
        Object localObject2 = localObject3;
        try
        {
          if (this.a)
          {
            localSQLiteCursor2 = localSQLiteCursor1;
            localObject2 = localObject3;
          }
          for (localSQLiteCursor1 = w.a(w.this).b("SELECT outbox_max FROM dialogs WHERE did = " + this.b, new Object[0]); ; localSQLiteCursor1 = w.a(w.this).b("SELECT inbox_max FROM dialogs WHERE did = " + this.b, new Object[0]))
          {
            localSQLiteCursor2 = localSQLiteCursor1;
            localObject2 = localSQLiteCursor1;
            if (localSQLiteCursor1.a())
            {
              localSQLiteCursor2 = localSQLiteCursor1;
              localObject2 = localSQLiteCursor1;
              this.c[0] = Integer.valueOf(localSQLiteCursor1.b(0));
            }
            if (localSQLiteCursor1 != null)
              localSQLiteCursor1.b();
            this.d.release();
            return;
            localSQLiteCursor2 = localSQLiteCursor1;
            localObject2 = localObject3;
          }
        }
        catch (Exception localException)
        {
          while (true)
          {
            localObject2 = localSQLiteCursor2;
            n.a("tmessages", localException);
            if (localSQLiteCursor2 == null)
              continue;
            localSQLiteCursor2.b();
          }
        }
        finally
        {
          if (localObject2 != null)
            ((SQLiteCursor)localObject2).b();
        }
        throw localObject1;
      }
    });
    try
    {
      localSemaphore.acquire();
      return arrayOfInteger[0].intValue();
    }
    catch (Exception localException)
    {
      while (true)
        n.a("tmessages", localException);
    }
  }

  public long a(NativeByteBuffer paramNativeByteBuffer)
  {
    if (paramNativeByteBuffer == null)
      return 0L;
    long l1 = this.k.getAndAdd(1L);
    this.h.b(new Runnable(l1, paramNativeByteBuffer)
    {
      public void run()
      {
        try
        {
          SQLitePreparedStatement localSQLitePreparedStatement = w.a(w.this).a("REPLACE INTO pending_tasks VALUES(?, ?)");
          localSQLitePreparedStatement.a(1, this.a);
          localSQLitePreparedStatement.a(2, this.b);
          localSQLitePreparedStatement.b();
          localSQLitePreparedStatement.e();
          return;
        }
        catch (Exception localException)
        {
          n.a("tmessages", localException);
          return;
        }
        finally
        {
          this.b.e();
        }
        throw localObject;
      }
    });
    return l1;
  }

  public org.vidogram.tgnet.f a(String paramString, int paramInt)
  {
    if (paramString == null)
      return null;
    Semaphore localSemaphore = new Semaphore(0);
    ArrayList localArrayList = new ArrayList();
    this.h.b(new Runnable(paramString, paramInt, localArrayList, localSemaphore)
    {
      public void run()
      {
        try
        {
          Object localObject1 = Utilities.e(this.a);
          g.au localau;
          if (localObject1 != null)
          {
            localObject1 = w.a(w.this).b(String.format(Locale.US, "SELECT data FROM sent_files_v2 WHERE uid = '%s' AND type = %d", new Object[] { localObject1, Integer.valueOf(this.b) }), new Object[0]);
            if (((SQLiteCursor)localObject1).a())
            {
              NativeByteBuffer localNativeByteBuffer = ((SQLiteCursor)localObject1).g(0);
              if (localNativeByteBuffer != null)
              {
                localau = g.au.a(localNativeByteBuffer, localNativeByteBuffer.b(false), false);
                localNativeByteBuffer.e();
                if (!(localau instanceof g.nw))
                  break label119;
                this.c.add(((g.nw)localau).k);
              }
            }
          }
          while (true)
          {
            ((SQLiteCursor)localObject1).b();
            return;
            label119: if (!(localau instanceof g.ob))
              continue;
            this.c.add(((g.ob)localau).d);
          }
        }
        catch (Exception localException)
        {
          n.a("tmessages", localException);
          return;
        }
        finally
        {
          this.d.release();
        }
        throw localObject2;
      }
    });
    try
    {
      localSemaphore.acquire();
      if (!localArrayList.isEmpty())
      {
        paramString = (org.vidogram.tgnet.f)localArrayList.get(0);
        return paramString;
      }
    }
    catch (Exception paramString)
    {
      while (true)
      {
        n.a("tmessages", paramString);
        continue;
        paramString = null;
      }
    }
  }

  public void a(int paramInt)
  {
    this.h.b(new Runnable(paramInt)
    {
      public void run()
      {
        SQLitePreparedStatement localSQLitePreparedStatement;
        try
        {
          j = this.a;
          i = j;
          if (j < 4)
          {
            w.a(w.this).a("CREATE TABLE IF NOT EXISTS user_photos(uid INTEGER, id INTEGER, data BLOB, PRIMARY KEY (uid, id))").c().e();
            w.a(w.this).a("DROP INDEX IF EXISTS read_state_out_idx_messages;").c().e();
            w.a(w.this).a("DROP INDEX IF EXISTS ttl_idx_messages;").c().e();
            w.a(w.this).a("DROP INDEX IF EXISTS date_idx_messages;").c().e();
            w.a(w.this).a("CREATE INDEX IF NOT EXISTS mid_out_idx_messages ON messages(mid, out);").c().e();
            w.a(w.this).a("CREATE INDEX IF NOT EXISTS task_idx_messages ON messages(uid, out, read_state, ttl, date, send_state);").c().e();
            w.a(w.this).a("CREATE INDEX IF NOT EXISTS uid_date_mid_idx_messages ON messages(uid, date, mid);").c().e();
            w.a(w.this).a("CREATE TABLE IF NOT EXISTS user_contacts_v6(uid INTEGER PRIMARY KEY, fname TEXT, sname TEXT)").c().e();
            w.a(w.this).a("CREATE TABLE IF NOT EXISTS user_phones_v6(uid INTEGER, phone TEXT, sphone TEXT, deleted INTEGER, PRIMARY KEY (uid, phone))").c().e();
            w.a(w.this).a("CREATE INDEX IF NOT EXISTS sphone_deleted_idx_user_phones ON user_phones_v6(sphone, deleted);").c().e();
            w.a(w.this).a("CREATE INDEX IF NOT EXISTS mid_idx_randoms ON randoms(mid);").c().e();
            w.a(w.this).a("CREATE TABLE IF NOT EXISTS sent_files_v2(uid TEXT, type INTEGER, data BLOB, PRIMARY KEY (uid, type))").c().e();
            w.a(w.this).a("CREATE TABLE IF NOT EXISTS blocked_users(uid INTEGER PRIMARY KEY)").c().e();
            w.a(w.this).a("CREATE TABLE IF NOT EXISTS download_queue(uid INTEGER, type INTEGER, date INTEGER, data BLOB, PRIMARY KEY (uid, type));").c().e();
            w.a(w.this).a("CREATE INDEX IF NOT EXISTS type_date_idx_download_queue ON download_queue(type, date);").c().e();
            w.a(w.this).a("CREATE TABLE IF NOT EXISTS dialog_settings(did INTEGER PRIMARY KEY, flags INTEGER);").c().e();
            w.a(w.this).a("CREATE INDEX IF NOT EXISTS send_state_idx_messages ON messages(mid, send_state, date) WHERE mid < 0 AND send_state = 1;").c().e();
            w.a(w.this).a("CREATE INDEX IF NOT EXISTS unread_count_idx_dialogs ON dialogs(unread_count);").c().e();
            w.a(w.this).a("UPDATE messages SET send_state = 2 WHERE mid < 0 AND send_state = 1").c().e();
            w.b(w.this).b(new Runnable()
            {
              public void run()
              {
                Object localObject1 = new ArrayList();
                Object localObject2 = ApplicationLoader.a.getSharedPreferences("Notifications", 0).getAll().entrySet().iterator();
                while (((Iterator)localObject2).hasNext())
                {
                  Object localObject3 = (Map.Entry)((Iterator)localObject2).next();
                  String str = (String)((Map.Entry)localObject3).getKey();
                  if ((!str.startsWith("notify2_")) || (((Integer)((Map.Entry)localObject3).getValue()).intValue() != 2))
                    continue;
                  localObject3 = str.replace("notify2_", "");
                  try
                  {
                    ((ArrayList)localObject1).add(Integer.valueOf(Integer.parseInt((String)localObject3)));
                  }
                  catch (Exception localException2)
                  {
                    localException2.printStackTrace();
                  }
                }
                try
                {
                  w.a(w.this).d();
                  localObject2 = w.a(w.this).a("REPLACE INTO dialog_settings VALUES(?, ?)");
                  localObject1 = ((ArrayList)localObject1).iterator();
                  while (((Iterator)localObject1).hasNext())
                  {
                    Integer localInteger = (Integer)((Iterator)localObject1).next();
                    ((SQLitePreparedStatement)localObject2).d();
                    ((SQLitePreparedStatement)localObject2).a(1, localInteger.intValue());
                    ((SQLitePreparedStatement)localObject2).a(2, 1);
                    ((SQLitePreparedStatement)localObject2).b();
                  }
                }
                catch (Exception localException1)
                {
                  n.a("tmessages", localException1);
                  return;
                }
                ((SQLitePreparedStatement)localObject2).e();
                w.a(w.this).e();
              }
            });
            w.a(w.this).a("PRAGMA user_version = 4").c().e();
            i = 4;
          }
          j = i;
          Object localObject1;
          if (i == 4)
          {
            w.a(w.this).a("CREATE TABLE IF NOT EXISTS enc_tasks_v2(mid INTEGER PRIMARY KEY, date INTEGER)").c().e();
            w.a(w.this).a("CREATE INDEX IF NOT EXISTS date_idx_enc_tasks_v2 ON enc_tasks_v2(date);").c().e();
            w.a(w.this).d();
            localSQLiteCursor = w.a(w.this).b("SELECT date, data FROM enc_tasks WHERE 1", new Object[0]);
            localSQLitePreparedStatement = w.a(w.this).a("REPLACE INTO enc_tasks_v2 VALUES(?, ?)");
            if (localSQLiteCursor.a())
            {
              j = localSQLiteCursor.b(0);
              localObject1 = localSQLiteCursor.g(1);
              if (localObject1 != null)
              {
                k = ((NativeByteBuffer)localObject1).b();
                i = 0;
                while (i < k / 4)
                {
                  localSQLitePreparedStatement.d();
                  localSQLitePreparedStatement.a(1, ((NativeByteBuffer)localObject1).b(false));
                  localSQLitePreparedStatement.a(2, j);
                  localSQLitePreparedStatement.b();
                  i += 1;
                }
                ((NativeByteBuffer)localObject1).e();
              }
            }
            localSQLitePreparedStatement.e();
            localSQLiteCursor.b();
            w.a(w.this).e();
            w.a(w.this).a("DROP INDEX IF EXISTS date_idx_enc_tasks;").c().e();
            w.a(w.this).a("DROP TABLE IF EXISTS enc_tasks;").c().e();
            w.a(w.this).a("ALTER TABLE messages ADD COLUMN media INTEGER default 0").c().e();
            w.a(w.this).a("PRAGMA user_version = 6").c().e();
            j = 6;
          }
          k = j;
          if (j != 6)
            break label2815;
          w.a(w.this).a("CREATE TABLE IF NOT EXISTS messages_seq(mid INTEGER PRIMARY KEY, seq_in INTEGER, seq_out INTEGER);").c().e();
          w.a(w.this).a("CREATE INDEX IF NOT EXISTS seq_idx_messages_seq ON messages_seq(seq_in, seq_out);").c().e();
          w.a(w.this).a("ALTER TABLE enc_chats ADD COLUMN layer INTEGER default 0").c().e();
          w.a(w.this).a("ALTER TABLE enc_chats ADD COLUMN seq_in INTEGER default 0").c().e();
          w.a(w.this).a("ALTER TABLE enc_chats ADD COLUMN seq_out INTEGER default 0").c().e();
          w.a(w.this).a("PRAGMA user_version = 7").c().e();
          k = 7;
          break label2815;
          w.a(w.this).a("ALTER TABLE enc_chats ADD COLUMN use_count INTEGER default 0").c().e();
          w.a(w.this).a("ALTER TABLE enc_chats ADD COLUMN exchange_id INTEGER default 0").c().e();
          w.a(w.this).a("ALTER TABLE enc_chats ADD COLUMN key_date INTEGER default 0").c().e();
          w.a(w.this).a("ALTER TABLE enc_chats ADD COLUMN fprint INTEGER default 0").c().e();
          w.a(w.this).a("ALTER TABLE enc_chats ADD COLUMN fauthkey BLOB default NULL").c().e();
          w.a(w.this).a("ALTER TABLE enc_chats ADD COLUMN khash BLOB default NULL").c().e();
          w.a(w.this).a("PRAGMA user_version = 10").c().e();
          i = 10;
          label908: j = i;
          if (i != 10)
            break label2838;
          w.a(w.this).a("CREATE TABLE IF NOT EXISTS web_recent_v3(id TEXT, type INTEGER, image_url TEXT, thumb_url TEXT, local_url TEXT, width INTEGER, height INTEGER, size INTEGER, date INTEGER, PRIMARY KEY (id, type));").c().e();
          w.a(w.this).a("PRAGMA user_version = 11").c().e();
          j = 11;
          break label2838;
          label958: j = i;
          if (i == 12)
          {
            w.a(w.this).a("DROP INDEX IF EXISTS uid_mid_idx_media;").c().e();
            w.a(w.this).a("DROP INDEX IF EXISTS mid_idx_media;").c().e();
            w.a(w.this).a("DROP INDEX IF EXISTS uid_date_mid_idx_media;").c().e();
            w.a(w.this).a("DROP TABLE IF EXISTS media;").c().e();
            w.a(w.this).a("DROP TABLE IF EXISTS media_counts;").c().e();
            w.a(w.this).a("CREATE TABLE IF NOT EXISTS media_v2(mid INTEGER PRIMARY KEY, uid INTEGER, date INTEGER, type INTEGER, data BLOB)").c().e();
            w.a(w.this).a("CREATE TABLE IF NOT EXISTS media_counts_v2(uid INTEGER, type INTEGER, count INTEGER, PRIMARY KEY(uid, type))").c().e();
            w.a(w.this).a("CREATE INDEX IF NOT EXISTS uid_mid_type_date_idx_media ON media_v2(uid, mid, type, date);").c().e();
            w.a(w.this).a("CREATE TABLE IF NOT EXISTS keyvalue(id TEXT PRIMARY KEY, value TEXT)").c().e();
            w.a(w.this).a("PRAGMA user_version = 13").c().e();
            j = 13;
          }
          i = j;
          if (j == 13)
          {
            w.a(w.this).a("ALTER TABLE messages ADD COLUMN replydata BLOB default NULL").c().e();
            w.a(w.this).a("PRAGMA user_version = 14").c().e();
            i = 14;
          }
          j = i;
          if (i == 14)
          {
            w.a(w.this).a("CREATE TABLE IF NOT EXISTS hashtag_recent_v2(id TEXT PRIMARY KEY, date INTEGER);").c().e();
            w.a(w.this).a("PRAGMA user_version = 15").c().e();
            j = 15;
          }
          i = j;
          if (j == 15)
          {
            w.a(w.this).a("CREATE TABLE IF NOT EXISTS webpage_pending(id INTEGER, mid INTEGER, PRIMARY KEY (id, mid));").c().e();
            w.a(w.this).a("PRAGMA user_version = 16").c().e();
            i = 16;
          }
          j = i;
          if (i == 16)
          {
            w.a(w.this).a("ALTER TABLE dialogs ADD COLUMN inbox_max INTEGER default 0").c().e();
            w.a(w.this).a("ALTER TABLE dialogs ADD COLUMN outbox_max INTEGER default 0").c().e();
            w.a(w.this).a("PRAGMA user_version = 17").c().e();
            j = 17;
          }
          i = j;
          if (j == 17)
          {
            w.a(w.this).a("CREATE TABLE bot_info(uid INTEGER PRIMARY KEY, info BLOB)").c().e();
            w.a(w.this).a("PRAGMA user_version = 18").c().e();
            i = 18;
          }
          j = i;
          if (i == 18)
          {
            w.a(w.this).a("DROP TABLE IF EXISTS stickers;").c().e();
            w.a(w.this).a("CREATE TABLE IF NOT EXISTS stickers_v2(id INTEGER PRIMARY KEY, data BLOB, date INTEGER, hash TEXT);").c().e();
            w.a(w.this).a("PRAGMA user_version = 19").c().e();
            j = 19;
          }
          i = j;
          if (j == 19)
          {
            w.a(w.this).a("CREATE TABLE IF NOT EXISTS bot_keyboard(uid INTEGER PRIMARY KEY, mid INTEGER, info BLOB)").c().e();
            w.a(w.this).a("CREATE INDEX IF NOT EXISTS bot_keyboard_idx_mid ON bot_keyboard(mid);").c().e();
            w.a(w.this).a("PRAGMA user_version = 20").c().e();
            i = 20;
          }
          j = i;
          if (i == 20)
          {
            w.a(w.this).a("CREATE TABLE search_recent(did INTEGER PRIMARY KEY, date INTEGER);").c().e();
            w.a(w.this).a("PRAGMA user_version = 21").c().e();
            j = 21;
          }
          i = j;
          if (j != 21)
            break label2035;
          w.a(w.this).a("CREATE TABLE IF NOT EXISTS chat_settings_v2(uid INTEGER PRIMARY KEY, info BLOB)").c().e();
          SQLiteCursor localSQLiteCursor = w.a(w.this).b("SELECT uid, participants FROM chat_settings WHERE uid < 0", new Object[0]);
          localSQLitePreparedStatement = w.a(w.this).a("REPLACE INTO chat_settings_v2 VALUES(?, ?)");
          while (localSQLiteCursor.a())
          {
            i = localSQLiteCursor.b(0);
            Object localObject2 = localSQLiteCursor.g(1);
            if (localObject2 == null)
              continue;
            localObject1 = g.l.a((org.vidogram.tgnet.a)localObject2, ((NativeByteBuffer)localObject2).b(false), false);
            ((NativeByteBuffer)localObject2).e();
            if (localObject1 == null)
              continue;
            localObject2 = new g.fi();
            ((g.fi)localObject2).e = i;
            ((g.fi)localObject2).m = new g.rr();
            ((g.fi)localObject2).n = new g.rm();
            ((g.fi)localObject2).o = new g.fj();
            ((g.fi)localObject2).t = ((g.l)localObject1);
            localObject1 = new NativeByteBuffer(((g.fi)localObject2).b());
            ((g.fi)localObject2).a((org.vidogram.tgnet.a)localObject1);
            localSQLitePreparedStatement.d();
            localSQLitePreparedStatement.a(1, i);
            localSQLitePreparedStatement.a(2, (NativeByteBuffer)localObject1);
            localSQLitePreparedStatement.b();
            ((NativeByteBuffer)localObject1).e();
          }
        }
        catch (Exception localException)
        {
          n.a("tmessages", localException);
        }
        label1812: return;
        localSQLitePreparedStatement.e();
        localException.b();
        w.a(w.this).a("DROP TABLE IF EXISTS chat_settings;").c().e();
        w.a(w.this).a("ALTER TABLE dialogs ADD COLUMN last_mid_i INTEGER default 0").c().e();
        w.a(w.this).a("ALTER TABLE dialogs ADD COLUMN unread_count_i INTEGER default 0").c().e();
        w.a(w.this).a("ALTER TABLE dialogs ADD COLUMN pts INTEGER default 0").c().e();
        w.a(w.this).a("ALTER TABLE dialogs ADD COLUMN date_i INTEGER default 0").c().e();
        w.a(w.this).a("CREATE INDEX IF NOT EXISTS last_mid_i_idx_dialogs ON dialogs(last_mid_i);").c().e();
        w.a(w.this).a("CREATE INDEX IF NOT EXISTS unread_count_i_idx_dialogs ON dialogs(unread_count_i);").c().e();
        w.a(w.this).a("ALTER TABLE messages ADD COLUMN imp INTEGER default 0").c().e();
        w.a(w.this).a("CREATE TABLE IF NOT EXISTS messages_holes(uid INTEGER, start INTEGER, end INTEGER, PRIMARY KEY(uid, start));").c().e();
        w.a(w.this).a("CREATE INDEX IF NOT EXISTS uid_end_messages_holes ON messages_holes(uid, end);").c().e();
        w.a(w.this).a("PRAGMA user_version = 22").c().e();
        int i = 22;
        label2035: int j = i;
        if (i == 22)
        {
          w.a(w.this).a("CREATE TABLE IF NOT EXISTS media_holes_v2(uid INTEGER, type INTEGER, start INTEGER, end INTEGER, PRIMARY KEY(uid, type, start));").c().e();
          w.a(w.this).a("CREATE INDEX IF NOT EXISTS uid_end_media_holes_v2 ON media_holes_v2(uid, type, end);").c().e();
          w.a(w.this).a("PRAGMA user_version = 23").c().e();
          j = 23;
        }
        int k = j;
        if (j == 24)
        {
          w.a(w.this).a("DELETE FROM media_holes_v2 WHERE uid != 0 AND type >= 0 AND start IN (0, 1)").c().e();
          w.a(w.this).a("PRAGMA user_version = 25").c().e();
          k = 25;
        }
        label2838: 
        while (true)
        {
          label2155: w.a(w.this).a("CREATE TABLE IF NOT EXISTS channel_users_v2(did INTEGER, uid INTEGER, date INTEGER, data BLOB, PRIMARY KEY(did, uid))").c().e();
          w.a(w.this).a("PRAGMA user_version = 27").c().e();
          i = 27;
          label2815: 
          do
          {
            j = i;
            if (i == 27)
            {
              w.a(w.this).a("ALTER TABLE web_recent_v3 ADD COLUMN document BLOB default NULL").c().e();
              w.a(w.this).a("PRAGMA user_version = 28").c().e();
              j = 28;
            }
            i = j;
            if (j == 28)
            {
              w.a(w.this).a("PRAGMA user_version = 29").c().e();
              i = 29;
            }
            j = i;
            if (i == 29)
            {
              w.a(w.this).a("DELETE FROM sent_files_v2 WHERE 1").c().e();
              w.a(w.this).a("DELETE FROM download_queue WHERE 1").c().e();
              w.a(w.this).a("PRAGMA user_version = 30").c().e();
              j = 30;
            }
            i = j;
            if (j == 30)
            {
              w.a(w.this).a("ALTER TABLE chat_settings_v2 ADD COLUMN pinned INTEGER default 0").c().e();
              w.a(w.this).a("CREATE INDEX IF NOT EXISTS chat_settings_pinned_idx ON chat_settings_v2(uid, pinned) WHERE pinned != 0;").c().e();
              w.a(w.this).a("CREATE TABLE IF NOT EXISTS chat_pinned(uid INTEGER PRIMARY KEY, pinned INTEGER, data BLOB)").c().e();
              w.a(w.this).a("CREATE INDEX IF NOT EXISTS chat_pinned_mid_idx ON chat_pinned(uid, pinned) WHERE pinned != 0;").c().e();
              w.a(w.this).a("CREATE TABLE IF NOT EXISTS users_data(uid INTEGER PRIMARY KEY, about TEXT)").c().e();
              w.a(w.this).a("PRAGMA user_version = 31").c().e();
              i = 31;
            }
            j = i;
            if (i == 31)
            {
              w.a(w.this).a("DROP TABLE IF EXISTS bot_recent;").c().e();
              w.a(w.this).a("CREATE TABLE IF NOT EXISTS chat_hints(did INTEGER, type INTEGER, rating REAL, date INTEGER, PRIMARY KEY(did, type))").c().e();
              w.a(w.this).a("CREATE INDEX IF NOT EXISTS chat_hints_rating_idx ON chat_hints(rating);").c().e();
              w.a(w.this).a("PRAGMA user_version = 32").c().e();
              j = 32;
            }
            i = j;
            if (j == 32)
            {
              w.a(w.this).a("DROP INDEX IF EXISTS uid_mid_idx_imp_messages;").c().e();
              w.a(w.this).a("DROP INDEX IF EXISTS uid_date_mid_imp_idx_messages;").c().e();
              w.a(w.this).a("PRAGMA user_version = 33").c().e();
              i = 33;
            }
            j = i;
            if (i == 33)
            {
              w.a(w.this).a("CREATE TABLE IF NOT EXISTS pending_tasks(id INTEGER PRIMARY KEY, data BLOB);").c().e();
              w.a(w.this).a("PRAGMA user_version = 34").c().e();
              j = 34;
            }
            i = j;
            if (j == 34)
            {
              w.a(w.this).a("CREATE TABLE IF NOT EXISTS stickers_featured(id INTEGER PRIMARY KEY, data BLOB, unread BLOB, date INTEGER, hash TEXT);").c().e();
              w.a(w.this).a("PRAGMA user_version = 35").c().e();
              i = 35;
            }
            j = i;
            if (i == 35)
            {
              w.a(w.this).a("CREATE TABLE IF NOT EXISTS requested_holes(uid INTEGER, seq_out_start INTEGER, seq_out_end INTEGER, PRIMARY KEY (uid, seq_out_start, seq_out_end));").c().e();
              w.a(w.this).a("PRAGMA user_version = 36").c().e();
              j = 36;
            }
            if (j != 36)
              break label1812;
            w.a(w.this).a("ALTER TABLE enc_chats ADD COLUMN in_seq_no INTEGER default 0").c().e();
            w.a(w.this).a("PRAGMA user_version = 37").c().e();
            return;
            if ((k == 7) || (k == 8))
              break;
            i = k;
            if (k != 9)
              break label908;
            break;
            i = j;
            if (j != 11)
              break label958;
            i = 12;
            break label958;
            if (k == 25)
              break label2155;
            i = k;
          }
          while (k != 26);
        }
      }
    });
  }

  public void a(int paramInt1, int paramInt2)
  {
    this.h.b(new Runnable(paramInt1, paramInt2)
    {
      public void run()
      {
        try
        {
          long l = -this.a;
          ArrayList localArrayList1 = new ArrayList();
          SQLiteCursor localSQLiteCursor = w.a(w.this).b("SELECT data FROM messages WHERE uid = " + l, new Object[0]);
          ArrayList localArrayList2 = new ArrayList();
          while (true)
          {
            try
            {
              if (!localSQLiteCursor.a())
                continue;
              localObject2 = localSQLiteCursor.g(0);
              if (localObject2 == null)
                continue;
              Object localObject1 = g.ar.a((org.vidogram.tgnet.a)localObject2, ((NativeByteBuffer)localObject2).b(false), false);
              ((NativeByteBuffer)localObject2).e();
              if ((localObject1 == null) || (((g.ar)localObject1).c != this.b) || (((g.ar)localObject1).b == 1))
                continue;
              localArrayList1.add(Integer.valueOf(((g.ar)localObject1).b));
              if ((((g.ar)localObject1).j instanceof g.ob))
              {
                localObject1 = ((g.ar)localObject1).j.d.h.iterator();
                if (!((Iterator)localObject1).hasNext())
                  continue;
                localObject2 = m.a((g.az)((Iterator)localObject1).next());
                if ((localObject2 == null) || (((File)localObject2).toString().length() <= 0))
                  continue;
                localArrayList2.add(localObject2);
                continue;
              }
            }
            catch (Exception localException2)
            {
              n.a("tmessages", localException2);
              localSQLiteCursor.b();
              a.a(new Runnable(localArrayList1)
              {
                public void run()
                {
                  v.a().a(this.a, w.9.this.a);
                }
              });
              w.a(w.this, localArrayList1, this.a);
              w.b(w.this, localArrayList1, this.a);
              m.a().b(localArrayList2, 0);
              if (localArrayList1.isEmpty())
                continue;
              a.a(new Runnable(localArrayList1)
              {
                public void run()
                {
                  y.a().a(y.e, new Object[] { this.a, Integer.valueOf(w.9.this.a) });
                }
              });
              return;
            }
            if (!(localException2.j instanceof g.nw))
              continue;
            Object localObject2 = m.a(localException2.j.k);
            if ((localObject2 != null) && (((File)localObject2).toString().length() > 0))
              localArrayList2.add(localObject2);
            File localFile = m.a(localException2.j.k.i);
            if ((localFile == null) || (localFile.toString().length() <= 0))
              continue;
            localArrayList2.add(localFile);
          }
        }
        catch (Exception localException1)
        {
          n.a("tmessages", localException1);
        }
      }
    });
  }

  public void a(int paramInt1, int paramInt2, int paramInt3)
  {
    this.h.b(new Runnable(paramInt1, paramInt2, paramInt3)
    {
      public void run()
      {
        try
        {
          SQLitePreparedStatement localSQLitePreparedStatement = w.a(w.this).a("REPLACE INTO messages_seq VALUES(?, ?, ?)");
          localSQLitePreparedStatement.d();
          localSQLitePreparedStatement.a(1, this.a);
          localSQLitePreparedStatement.a(2, this.b);
          localSQLitePreparedStatement.a(3, this.c);
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

  public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, ArrayList<Long> paramArrayList)
  {
    this.h.b(new Runnable(paramArrayList, paramInt1, paramInt4, paramInt2, paramInt3)
    {
      public void run()
      {
        while (true)
        {
          int j;
          try
          {
            SparseArray localSparseArray = new SparseArray();
            ArrayList localArrayList3 = new ArrayList();
            StringBuilder localStringBuilder = new StringBuilder();
            if (this.a != null)
              continue;
            Object localObject = w.a(w.this).b(String.format(Locale.US, "SELECT mid, ttl FROM messages WHERE uid = %d AND out = %d AND read_state != 0 AND ttl > 0 AND date <= %d AND send_state = 0 AND media != 1", new Object[] { Long.valueOf(this.b << 32), Integer.valueOf(this.c), Integer.valueOf(this.d) }), new Object[0]);
            int i = 2147483647;
            if (!((SQLiteCursor)localObject).a())
              continue;
            int n = ((SQLiteCursor)localObject).b(1);
            int k = ((SQLiteCursor)localObject).b(0);
            if (this.a == null)
              continue;
            localArrayList3.add(Long.valueOf(k));
            if (n <= 0)
              continue;
            if (this.d <= this.e)
              continue;
            j = this.d;
            j += n;
            i = Math.min(i, j);
            ArrayList localArrayList2 = (ArrayList)localSparseArray.get(j);
            ArrayList localArrayList1 = localArrayList2;
            if (localArrayList2 != null)
              continue;
            localArrayList1 = new ArrayList();
            localSparseArray.put(j, localArrayList1);
            if (localStringBuilder.length() == 0)
              continue;
            localStringBuilder.append(",");
            localStringBuilder.append(k);
            localArrayList1.add(Integer.valueOf(k));
            continue;
            localObject = TextUtils.join(",", this.a);
            localObject = w.a(w.this).b(String.format(Locale.US, "SELECT m.mid, m.ttl FROM messages as m INNER JOIN randoms as r ON m.mid = r.mid WHERE r.random_id IN (%s)", new Object[] { localObject }), new Object[0]);
            i = 2147483647;
            continue;
            j = this.e;
            continue;
            ((SQLiteCursor)localObject).b();
            if (this.a == null)
              continue;
            a.a(new Runnable(localArrayList3)
            {
              public void run()
              {
                w.a().c(this.a);
                y.a().a(y.S, new Object[] { this.a });
              }
            });
            if (localSparseArray.size() == 0)
              continue;
            w.a(w.this).d();
            localObject = w.a(w.this).a("REPLACE INTO enc_tasks_v2 VALUES(?, ?)");
            j = 0;
            if (j >= localSparseArray.size())
              continue;
            n = localSparseArray.keyAt(j);
            localArrayList1 = (ArrayList)localSparseArray.get(n);
            int m = 0;
            if (m < localArrayList1.size())
            {
              ((SQLitePreparedStatement)localObject).d();
              ((SQLitePreparedStatement)localObject).a(1, ((Integer)localArrayList1.get(m)).intValue());
              ((SQLitePreparedStatement)localObject).a(2, n);
              ((SQLitePreparedStatement)localObject).b();
              m += 1;
              continue;
              ((SQLitePreparedStatement)localObject).e();
              w.a(w.this).e();
              w.a(w.this).a(String.format(Locale.US, "UPDATE messages SET ttl = 0 WHERE mid IN(%s)", new Object[] { localStringBuilder.toString() })).c().e();
              v.a().a(i, localSparseArray);
              return;
            }
          }
          catch (Exception localException)
          {
            n.a("tmessages", localException);
            return;
          }
          j += 1;
        }
      }
    });
  }

  public void a(int paramInt1, int paramInt2, int paramInt3, long paramLong, int paramInt4)
  {
    this.h.b(new Runnable(paramLong, paramInt1, paramInt3, paramInt2, paramInt4)
    {
      public void run()
      {
        g.wf localwf;
        SQLiteCursor localSQLiteCursor2;
        while (true)
        {
          try
          {
            if (this.a != 0L)
            {
              SQLiteCursor localSQLiteCursor1 = w.a(w.this).b(String.format(Locale.US, "SELECT data FROM user_photos WHERE uid = %d AND id < %d ORDER BY id DESC LIMIT %d", new Object[] { Integer.valueOf(this.b), Long.valueOf(this.a), Integer.valueOf(this.c) }), new Object[0]);
              localwf = new g.wf();
              if (!localSQLiteCursor1.a())
                break;
              NativeByteBuffer localNativeByteBuffer = localSQLiteCursor1.g(0);
              if (localNativeByteBuffer == null)
                continue;
              g.ay localay = g.ay.a(localNativeByteBuffer, localNativeByteBuffer.b(false), false);
              localNativeByteBuffer.e();
              localwf.b.add(localay);
              continue;
            }
          }
          catch (Exception localException)
          {
            n.a("tmessages", localException);
            return;
          }
          localSQLiteCursor2 = w.a(w.this).b(String.format(Locale.US, "SELECT data FROM user_photos WHERE uid = %d ORDER BY id DESC LIMIT %d,%d", new Object[] { Integer.valueOf(this.b), Integer.valueOf(this.d), Integer.valueOf(this.c) }), new Object[0]);
        }
        localSQLiteCursor2.b();
        Utilities.c.b(new Runnable(localwf)
        {
          public void run()
          {
            v.a().a(this.a, w.11.this.b, w.11.this.d, w.11.this.c, w.11.this.a, true, w.11.this.e);
          }
        });
      }
    });
  }

  public void a(int paramInt, long paramLong)
  {
    this.h.b(new Runnable(paramInt, paramLong)
    {
      public void run()
      {
        try
        {
          w.a(w.this).a("DELETE FROM user_photos WHERE uid = " + this.a + " AND id = " + this.b).c().e();
          return;
        }
        catch (Exception localException)
        {
          n.a("tmessages", localException);
        }
      }
    });
  }

  public void a(int paramInt, Semaphore paramSemaphore, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.h.b(new Runnable(paramInt, paramSemaphore, paramBoolean1, paramBoolean2)
    {
      // ERROR //
      public void run()
      {
        // Byte code:
        //   0: aconst_null
        //   1: astore 8
        //   3: iconst_0
        //   4: istore_2
        //   5: iconst_0
        //   6: istore_1
        //   7: new 40	java/util/ArrayList
        //   10: dup
        //   11: invokespecial 41	java/util/ArrayList:<init>	()V
        //   14: astore 9
        //   16: aload_0
        //   17: getfield 23	org/vidogram/messenger/w$18:e	Lorg/vidogram/messenger/w;
        //   20: invokestatic 44	org/vidogram/messenger/w:a	(Lorg/vidogram/messenger/w;)Lorg/vidogram/SQLite/SQLiteDatabase;
        //   23: new 46	java/lang/StringBuilder
        //   26: dup
        //   27: invokespecial 47	java/lang/StringBuilder:<init>	()V
        //   30: ldc 49
        //   32: invokevirtual 53	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   35: aload_0
        //   36: getfield 25	org/vidogram/messenger/w$18:a	I
        //   39: invokevirtual 56	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
        //   42: invokevirtual 60	java/lang/StringBuilder:toString	()Ljava/lang/String;
        //   45: iconst_0
        //   46: anewarray 4	java/lang/Object
        //   49: invokevirtual 65	org/vidogram/SQLite/SQLiteDatabase:b	(Ljava/lang/String;[Ljava/lang/Object;)Lorg/vidogram/SQLite/SQLiteCursor;
        //   52: astore 7
        //   54: aload 7
        //   56: invokevirtual 70	org/vidogram/SQLite/SQLiteCursor:a	()Z
        //   59: ifeq +1049 -> 1108
        //   62: aload 7
        //   64: iconst_0
        //   65: invokevirtual 74	org/vidogram/SQLite/SQLiteCursor:g	(I)Lorg/vidogram/tgnet/NativeByteBuffer;
        //   68: astore 10
        //   70: aload 10
        //   72: ifnull +1036 -> 1108
        //   75: aload 10
        //   77: aload 10
        //   79: iconst_0
        //   80: invokevirtual 79	org/vidogram/tgnet/NativeByteBuffer:b	(Z)I
        //   83: iconst_0
        //   84: invokestatic 84	org/vidogram/tgnet/g$j:a	(Lorg/vidogram/tgnet/a;IZ)Lorg/vidogram/tgnet/g$j;
        //   87: astore 5
        //   89: aload 5
        //   91: astore 6
        //   93: aload 5
        //   95: astore 4
        //   97: aload 10
        //   99: invokevirtual 86	org/vidogram/tgnet/NativeByteBuffer:e	()V
        //   102: aload 5
        //   104: astore 6
        //   106: aload 5
        //   108: astore 4
        //   110: aload 5
        //   112: aload 7
        //   114: iconst_1
        //   115: invokevirtual 89	org/vidogram/SQLite/SQLiteCursor:b	(I)I
        //   118: putfield 92	org/vidogram/tgnet/g$j:s	I
        //   121: aload 5
        //   123: astore 6
        //   125: aload 5
        //   127: astore 4
        //   129: aload 7
        //   131: invokevirtual 94	org/vidogram/SQLite/SQLiteCursor:b	()V
        //   134: aload 5
        //   136: astore 6
        //   138: aload 5
        //   140: astore 4
        //   142: aload 5
        //   144: instanceof 96
        //   147: ifeq +297 -> 444
        //   150: aload 5
        //   152: astore 6
        //   154: aload 5
        //   156: astore 4
        //   158: new 46	java/lang/StringBuilder
        //   161: dup
        //   162: invokespecial 47	java/lang/StringBuilder:<init>	()V
        //   165: astore 7
        //   167: aload 5
        //   169: astore 6
        //   171: aload 5
        //   173: astore 4
        //   175: iload_1
        //   176: aload 5
        //   178: getfield 100	org/vidogram/tgnet/g$j:t	Lorg/vidogram/tgnet/g$l;
        //   181: getfield 105	org/vidogram/tgnet/g$l:e	Ljava/util/ArrayList;
        //   184: invokevirtual 109	java/util/ArrayList:size	()I
        //   187: if_icmpge +86 -> 273
        //   190: aload 5
        //   192: astore 6
        //   194: aload 5
        //   196: astore 4
        //   198: aload 5
        //   200: getfield 100	org/vidogram/tgnet/g$j:t	Lorg/vidogram/tgnet/g$l;
        //   203: getfield 105	org/vidogram/tgnet/g$l:e	Ljava/util/ArrayList;
        //   206: iload_1
        //   207: invokevirtual 113	java/util/ArrayList:get	(I)Ljava/lang/Object;
        //   210: checkcast 115	org/vidogram/tgnet/g$k
        //   213: astore 10
        //   215: aload 5
        //   217: astore 6
        //   219: aload 5
        //   221: astore 4
        //   223: aload 7
        //   225: invokevirtual 118	java/lang/StringBuilder:length	()I
        //   228: ifeq +19 -> 247
        //   231: aload 5
        //   233: astore 6
        //   235: aload 5
        //   237: astore 4
        //   239: aload 7
        //   241: ldc 120
        //   243: invokevirtual 53	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   246: pop
        //   247: aload 5
        //   249: astore 6
        //   251: aload 5
        //   253: astore 4
        //   255: aload 7
        //   257: aload 10
        //   259: getfield 122	org/vidogram/tgnet/g$k:b	I
        //   262: invokevirtual 56	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
        //   265: pop
        //   266: iload_1
        //   267: iconst_1
        //   268: iadd
        //   269: istore_1
        //   270: goto -103 -> 167
        //   273: aload 5
        //   275: astore 6
        //   277: aload 5
        //   279: astore 4
        //   281: aload 7
        //   283: invokevirtual 118	java/lang/StringBuilder:length	()I
        //   286: ifeq +25 -> 311
        //   289: aload 5
        //   291: astore 6
        //   293: aload 5
        //   295: astore 4
        //   297: aload_0
        //   298: getfield 23	org/vidogram/messenger/w$18:e	Lorg/vidogram/messenger/w;
        //   301: aload 7
        //   303: invokevirtual 60	java/lang/StringBuilder:toString	()Ljava/lang/String;
        //   306: aload 9
        //   308: invokevirtual 125	org/vidogram/messenger/w:a	(Ljava/lang/String;Ljava/util/ArrayList;)V
        //   311: aload 5
        //   313: astore 6
        //   315: aload 5
        //   317: astore 4
        //   319: aload_0
        //   320: getfield 27	org/vidogram/messenger/w$18:b	Ljava/util/concurrent/Semaphore;
        //   323: ifnull +18 -> 341
        //   326: aload 5
        //   328: astore 6
        //   330: aload 5
        //   332: astore 4
        //   334: aload_0
        //   335: getfield 27	org/vidogram/messenger/w$18:b	Ljava/util/concurrent/Semaphore;
        //   338: invokevirtual 130	java/util/concurrent/Semaphore:release	()V
        //   341: aload 8
        //   343: astore 7
        //   345: aload 5
        //   347: astore 6
        //   349: aload 5
        //   351: astore 4
        //   353: aload 5
        //   355: instanceof 132
        //   358: ifeq +46 -> 404
        //   361: aload 8
        //   363: astore 7
        //   365: aload 5
        //   367: astore 6
        //   369: aload 5
        //   371: astore 4
        //   373: aload 5
        //   375: getfield 92	org/vidogram/tgnet/g$j:s	I
        //   378: ifeq +26 -> 404
        //   381: aload 5
        //   383: astore 6
        //   385: aload 5
        //   387: astore 4
        //   389: aload_0
        //   390: getfield 25	org/vidogram/messenger/w$18:a	I
        //   393: aload 5
        //   395: getfield 92	org/vidogram/tgnet/g$j:s	I
        //   398: iconst_0
        //   399: invokestatic 137	org/vidogram/messenger/d/c:a	(IIZ)Lorg/vidogram/messenger/u;
        //   402: astore 7
        //   404: invokestatic 142	org/vidogram/messenger/v:a	()Lorg/vidogram/messenger/v;
        //   407: aload_0
        //   408: getfield 25	org/vidogram/messenger/w$18:a	I
        //   411: aload 5
        //   413: aload 9
        //   415: iconst_1
        //   416: aload_0
        //   417: getfield 29	org/vidogram/messenger/w$18:c	Z
        //   420: aload_0
        //   421: getfield 31	org/vidogram/messenger/w$18:d	Z
        //   424: aload 7
        //   426: invokevirtual 145	org/vidogram/messenger/v:a	(ILorg/vidogram/tgnet/g$j;Ljava/util/ArrayList;ZZZLorg/vidogram/messenger/u;)V
        //   429: aload_0
        //   430: getfield 27	org/vidogram/messenger/w$18:b	Ljava/util/concurrent/Semaphore;
        //   433: ifnull +10 -> 443
        //   436: aload_0
        //   437: getfield 27	org/vidogram/messenger/w$18:b	Ljava/util/concurrent/Semaphore;
        //   440: invokevirtual 130	java/util/concurrent/Semaphore:release	()V
        //   443: return
        //   444: aload 5
        //   446: astore 6
        //   448: aload 5
        //   450: astore 4
        //   452: aload 5
        //   454: instanceof 132
        //   457: ifeq -146 -> 311
        //   460: aload 5
        //   462: astore 6
        //   464: aload 5
        //   466: astore 4
        //   468: aload_0
        //   469: getfield 23	org/vidogram/messenger/w$18:e	Lorg/vidogram/messenger/w;
        //   472: invokestatic 44	org/vidogram/messenger/w:a	(Lorg/vidogram/messenger/w;)Lorg/vidogram/SQLite/SQLiteDatabase;
        //   475: new 46	java/lang/StringBuilder
        //   478: dup
        //   479: invokespecial 47	java/lang/StringBuilder:<init>	()V
        //   482: ldc 147
        //   484: invokevirtual 53	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   487: aload_0
        //   488: getfield 25	org/vidogram/messenger/w$18:a	I
        //   491: ineg
        //   492: invokevirtual 56	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
        //   495: ldc 149
        //   497: invokevirtual 53	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   500: invokevirtual 60	java/lang/StringBuilder:toString	()Ljava/lang/String;
        //   503: iconst_0
        //   504: anewarray 4	java/lang/Object
        //   507: invokevirtual 65	org/vidogram/SQLite/SQLiteDatabase:b	(Ljava/lang/String;[Ljava/lang/Object;)Lorg/vidogram/SQLite/SQLiteCursor;
        //   510: astore 10
        //   512: aload 5
        //   514: astore 6
        //   516: aload 5
        //   518: astore 4
        //   520: aload 5
        //   522: new 151	org/vidogram/tgnet/g$fo
        //   525: dup
        //   526: invokespecial 152	org/vidogram/tgnet/g$fo:<init>	()V
        //   529: putfield 100	org/vidogram/tgnet/g$j:t	Lorg/vidogram/tgnet/g$l;
        //   532: aload 5
        //   534: astore 6
        //   536: aload 5
        //   538: astore 4
        //   540: aload 10
        //   542: invokevirtual 70	org/vidogram/SQLite/SQLiteCursor:a	()Z
        //   545: istore_3
        //   546: iload_3
        //   547: ifeq +317 -> 864
        //   550: aload 5
        //   552: astore 4
        //   554: aload 10
        //   556: iconst_0
        //   557: invokevirtual 74	org/vidogram/SQLite/SQLiteCursor:g	(I)Lorg/vidogram/tgnet/NativeByteBuffer;
        //   560: astore 7
        //   562: aload 7
        //   564: ifnull +538 -> 1102
        //   567: aload 5
        //   569: astore 4
        //   571: aload 7
        //   573: aload 7
        //   575: iconst_0
        //   576: invokevirtual 79	org/vidogram/tgnet/NativeByteBuffer:b	(Z)I
        //   579: iconst_0
        //   580: invokestatic 157	org/vidogram/tgnet/g$vw:a	(Lorg/vidogram/tgnet/a;IZ)Lorg/vidogram/tgnet/g$vw;
        //   583: astore 6
        //   585: aload 5
        //   587: astore 4
        //   589: aload 7
        //   591: invokevirtual 86	org/vidogram/tgnet/NativeByteBuffer:e	()V
        //   594: aload 5
        //   596: astore 4
        //   598: aload 10
        //   600: iconst_2
        //   601: invokevirtual 74	org/vidogram/SQLite/SQLiteCursor:g	(I)Lorg/vidogram/tgnet/NativeByteBuffer;
        //   604: astore 11
        //   606: aload 11
        //   608: ifnull +488 -> 1096
        //   611: aload 5
        //   613: astore 4
        //   615: aload 11
        //   617: aload 11
        //   619: iconst_0
        //   620: invokevirtual 79	org/vidogram/tgnet/NativeByteBuffer:b	(Z)I
        //   623: iconst_0
        //   624: invokestatic 162	org/vidogram/tgnet/g$f:a	(Lorg/vidogram/tgnet/a;IZ)Lorg/vidogram/tgnet/g$f;
        //   627: astore 7
        //   629: aload 5
        //   631: astore 4
        //   633: aload 11
        //   635: invokevirtual 86	org/vidogram/tgnet/NativeByteBuffer:e	()V
        //   638: aload 6
        //   640: ifnull -108 -> 532
        //   643: aload 7
        //   645: ifnull -113 -> 532
        //   648: aload 5
        //   650: astore 4
        //   652: aload 6
        //   654: getfield 166	org/vidogram/tgnet/g$vw:k	Lorg/vidogram/tgnet/g$vy;
        //   657: ifnull +21 -> 678
        //   660: aload 5
        //   662: astore 4
        //   664: aload 6
        //   666: getfield 166	org/vidogram/tgnet/g$vw:k	Lorg/vidogram/tgnet/g$vy;
        //   669: aload 10
        //   671: iconst_1
        //   672: invokevirtual 89	org/vidogram/SQLite/SQLiteCursor:b	(I)I
        //   675: putfield 170	org/vidogram/tgnet/g$vy:c	I
        //   678: aload 5
        //   680: astore 4
        //   682: aload 9
        //   684: aload 6
        //   686: invokevirtual 174	java/util/ArrayList:add	(Ljava/lang/Object;)Z
        //   689: pop
        //   690: aload 5
        //   692: astore 4
        //   694: aload 7
        //   696: aload 10
        //   698: iconst_3
        //   699: invokevirtual 89	org/vidogram/SQLite/SQLiteCursor:b	(I)I
        //   702: putfield 175	org/vidogram/tgnet/g$f:c	I
        //   705: aload 5
        //   707: astore 4
        //   709: new 177	org/vidogram/tgnet/g$fe
        //   712: dup
        //   713: invokespecial 178	org/vidogram/tgnet/g$fe:<init>	()V
        //   716: astore 6
        //   718: aload 5
        //   720: astore 4
        //   722: aload 6
        //   724: aload 7
        //   726: getfield 179	org/vidogram/tgnet/g$f:b	I
        //   729: putfield 180	org/vidogram/tgnet/g$fe:b	I
        //   732: aload 5
        //   734: astore 4
        //   736: aload 6
        //   738: aload 7
        //   740: getfield 175	org/vidogram/tgnet/g$f:c	I
        //   743: putfield 182	org/vidogram/tgnet/g$fe:d	I
        //   746: aload 5
        //   748: astore 4
        //   750: aload 6
        //   752: aload 7
        //   754: getfield 183	org/vidogram/tgnet/g$f:d	I
        //   757: putfield 184	org/vidogram/tgnet/g$fe:c	I
        //   760: aload 5
        //   762: astore 4
        //   764: aload 6
        //   766: aload 7
        //   768: putfield 188	org/vidogram/tgnet/g$fe:f	Lorg/vidogram/tgnet/g$f;
        //   771: aload 5
        //   773: astore 4
        //   775: aload 5
        //   777: getfield 100	org/vidogram/tgnet/g$j:t	Lorg/vidogram/tgnet/g$l;
        //   780: getfield 105	org/vidogram/tgnet/g$l:e	Ljava/util/ArrayList;
        //   783: aload 6
        //   785: invokevirtual 174	java/util/ArrayList:add	(Ljava/lang/Object;)Z
        //   788: pop
        //   789: goto -257 -> 532
        //   792: astore 7
        //   794: aload 5
        //   796: astore 6
        //   798: aload 5
        //   800: astore 4
        //   802: ldc 190
        //   804: aload 7
        //   806: invokestatic 195	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   809: goto -277 -> 532
        //   812: astore 5
        //   814: aload 6
        //   816: astore 4
        //   818: ldc 190
        //   820: aload 5
        //   822: invokestatic 195	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   825: invokestatic 142	org/vidogram/messenger/v:a	()Lorg/vidogram/messenger/v;
        //   828: aload_0
        //   829: getfield 25	org/vidogram/messenger/w$18:a	I
        //   832: aload 6
        //   834: aload 9
        //   836: iconst_1
        //   837: aload_0
        //   838: getfield 29	org/vidogram/messenger/w$18:c	Z
        //   841: aload_0
        //   842: getfield 31	org/vidogram/messenger/w$18:d	Z
        //   845: aconst_null
        //   846: invokevirtual 145	org/vidogram/messenger/v:a	(ILorg/vidogram/tgnet/g$j;Ljava/util/ArrayList;ZZZLorg/vidogram/messenger/u;)V
        //   849: aload_0
        //   850: getfield 27	org/vidogram/messenger/w$18:b	Ljava/util/concurrent/Semaphore;
        //   853: ifnull -410 -> 443
        //   856: aload_0
        //   857: getfield 27	org/vidogram/messenger/w$18:b	Ljava/util/concurrent/Semaphore;
        //   860: invokevirtual 130	java/util/concurrent/Semaphore:release	()V
        //   863: return
        //   864: aload 5
        //   866: astore 6
        //   868: aload 5
        //   870: astore 4
        //   872: aload 10
        //   874: invokevirtual 94	org/vidogram/SQLite/SQLiteCursor:b	()V
        //   877: aload 5
        //   879: astore 6
        //   881: aload 5
        //   883: astore 4
        //   885: new 46	java/lang/StringBuilder
        //   888: dup
        //   889: invokespecial 47	java/lang/StringBuilder:<init>	()V
        //   892: astore 7
        //   894: iload_2
        //   895: istore_1
        //   896: aload 5
        //   898: astore 6
        //   900: aload 5
        //   902: astore 4
        //   904: iload_1
        //   905: aload 5
        //   907: getfield 198	org/vidogram/tgnet/g$j:p	Ljava/util/ArrayList;
        //   910: invokevirtual 109	java/util/ArrayList:size	()I
        //   913: if_icmpge +83 -> 996
        //   916: aload 5
        //   918: astore 6
        //   920: aload 5
        //   922: astore 4
        //   924: aload 5
        //   926: getfield 198	org/vidogram/tgnet/g$j:p	Ljava/util/ArrayList;
        //   929: iload_1
        //   930: invokevirtual 113	java/util/ArrayList:get	(I)Ljava/lang/Object;
        //   933: checkcast 200	org/vidogram/tgnet/g$b
        //   936: astore 10
        //   938: aload 5
        //   940: astore 6
        //   942: aload 5
        //   944: astore 4
        //   946: aload 7
        //   948: invokevirtual 118	java/lang/StringBuilder:length	()I
        //   951: ifeq +19 -> 970
        //   954: aload 5
        //   956: astore 6
        //   958: aload 5
        //   960: astore 4
        //   962: aload 7
        //   964: ldc 120
        //   966: invokevirtual 53	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   969: pop
        //   970: aload 5
        //   972: astore 6
        //   974: aload 5
        //   976: astore 4
        //   978: aload 7
        //   980: aload 10
        //   982: getfield 201	org/vidogram/tgnet/g$b:b	I
        //   985: invokevirtual 56	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
        //   988: pop
        //   989: iload_1
        //   990: iconst_1
        //   991: iadd
        //   992: istore_1
        //   993: goto -97 -> 896
        //   996: aload 5
        //   998: astore 6
        //   1000: aload 5
        //   1002: astore 4
        //   1004: aload 7
        //   1006: invokevirtual 118	java/lang/StringBuilder:length	()I
        //   1009: ifeq -698 -> 311
        //   1012: aload 5
        //   1014: astore 6
        //   1016: aload 5
        //   1018: astore 4
        //   1020: aload_0
        //   1021: getfield 23	org/vidogram/messenger/w$18:e	Lorg/vidogram/messenger/w;
        //   1024: aload 7
        //   1026: invokevirtual 60	java/lang/StringBuilder:toString	()Ljava/lang/String;
        //   1029: aload 9
        //   1031: invokevirtual 125	org/vidogram/messenger/w:a	(Ljava/lang/String;Ljava/util/ArrayList;)V
        //   1034: goto -723 -> 311
        //   1037: astore 5
        //   1039: invokestatic 142	org/vidogram/messenger/v:a	()Lorg/vidogram/messenger/v;
        //   1042: aload_0
        //   1043: getfield 25	org/vidogram/messenger/w$18:a	I
        //   1046: aload 4
        //   1048: aload 9
        //   1050: iconst_1
        //   1051: aload_0
        //   1052: getfield 29	org/vidogram/messenger/w$18:c	Z
        //   1055: aload_0
        //   1056: getfield 31	org/vidogram/messenger/w$18:d	Z
        //   1059: aconst_null
        //   1060: invokevirtual 145	org/vidogram/messenger/v:a	(ILorg/vidogram/tgnet/g$j;Ljava/util/ArrayList;ZZZLorg/vidogram/messenger/u;)V
        //   1063: aload_0
        //   1064: getfield 27	org/vidogram/messenger/w$18:b	Ljava/util/concurrent/Semaphore;
        //   1067: ifnull +10 -> 1077
        //   1070: aload_0
        //   1071: getfield 27	org/vidogram/messenger/w$18:b	Ljava/util/concurrent/Semaphore;
        //   1074: invokevirtual 130	java/util/concurrent/Semaphore:release	()V
        //   1077: aload 5
        //   1079: athrow
        //   1080: astore 5
        //   1082: aconst_null
        //   1083: astore 4
        //   1085: goto -46 -> 1039
        //   1088: astore 5
        //   1090: aconst_null
        //   1091: astore 6
        //   1093: goto -279 -> 814
        //   1096: aconst_null
        //   1097: astore 7
        //   1099: goto -461 -> 638
        //   1102: aconst_null
        //   1103: astore 6
        //   1105: goto -511 -> 594
        //   1108: aconst_null
        //   1109: astore 5
        //   1111: goto -990 -> 121
        //
        // Exception table:
        //   from	to	target	type
        //   554	562	792	java/lang/Exception
        //   571	585	792	java/lang/Exception
        //   589	594	792	java/lang/Exception
        //   598	606	792	java/lang/Exception
        //   615	629	792	java/lang/Exception
        //   633	638	792	java/lang/Exception
        //   652	660	792	java/lang/Exception
        //   664	678	792	java/lang/Exception
        //   682	690	792	java/lang/Exception
        //   694	705	792	java/lang/Exception
        //   709	718	792	java/lang/Exception
        //   722	732	792	java/lang/Exception
        //   736	746	792	java/lang/Exception
        //   750	760	792	java/lang/Exception
        //   764	771	792	java/lang/Exception
        //   775	789	792	java/lang/Exception
        //   97	102	812	java/lang/Exception
        //   110	121	812	java/lang/Exception
        //   129	134	812	java/lang/Exception
        //   142	150	812	java/lang/Exception
        //   158	167	812	java/lang/Exception
        //   175	190	812	java/lang/Exception
        //   198	215	812	java/lang/Exception
        //   223	231	812	java/lang/Exception
        //   239	247	812	java/lang/Exception
        //   255	266	812	java/lang/Exception
        //   281	289	812	java/lang/Exception
        //   297	311	812	java/lang/Exception
        //   319	326	812	java/lang/Exception
        //   334	341	812	java/lang/Exception
        //   353	361	812	java/lang/Exception
        //   373	381	812	java/lang/Exception
        //   389	404	812	java/lang/Exception
        //   452	460	812	java/lang/Exception
        //   468	512	812	java/lang/Exception
        //   520	532	812	java/lang/Exception
        //   540	546	812	java/lang/Exception
        //   802	809	812	java/lang/Exception
        //   872	877	812	java/lang/Exception
        //   885	894	812	java/lang/Exception
        //   904	916	812	java/lang/Exception
        //   924	938	812	java/lang/Exception
        //   946	954	812	java/lang/Exception
        //   962	970	812	java/lang/Exception
        //   978	989	812	java/lang/Exception
        //   1004	1012	812	java/lang/Exception
        //   1020	1034	812	java/lang/Exception
        //   97	102	1037	finally
        //   110	121	1037	finally
        //   129	134	1037	finally
        //   142	150	1037	finally
        //   158	167	1037	finally
        //   175	190	1037	finally
        //   198	215	1037	finally
        //   223	231	1037	finally
        //   239	247	1037	finally
        //   255	266	1037	finally
        //   281	289	1037	finally
        //   297	311	1037	finally
        //   319	326	1037	finally
        //   334	341	1037	finally
        //   353	361	1037	finally
        //   373	381	1037	finally
        //   389	404	1037	finally
        //   452	460	1037	finally
        //   468	512	1037	finally
        //   520	532	1037	finally
        //   540	546	1037	finally
        //   554	562	1037	finally
        //   571	585	1037	finally
        //   589	594	1037	finally
        //   598	606	1037	finally
        //   615	629	1037	finally
        //   633	638	1037	finally
        //   652	660	1037	finally
        //   664	678	1037	finally
        //   682	690	1037	finally
        //   694	705	1037	finally
        //   709	718	1037	finally
        //   722	732	1037	finally
        //   736	746	1037	finally
        //   750	760	1037	finally
        //   764	771	1037	finally
        //   775	789	1037	finally
        //   802	809	1037	finally
        //   818	825	1037	finally
        //   872	877	1037	finally
        //   885	894	1037	finally
        //   904	916	1037	finally
        //   924	938	1037	finally
        //   946	954	1037	finally
        //   962	970	1037	finally
        //   978	989	1037	finally
        //   1004	1012	1037	finally
        //   1020	1034	1037	finally
        //   16	70	1080	finally
        //   75	89	1080	finally
        //   16	70	1088	java/lang/Exception
        //   75	89	1088	java/lang/Exception
      }
    });
  }

  public void a(int paramInt, g.wf paramwf)
  {
    if ((paramwf == null) || (paramwf.b.isEmpty()))
      return;
    this.h.b(new Runnable(paramwf, paramInt)
    {
      public void run()
      {
        try
        {
          SQLitePreparedStatement localSQLitePreparedStatement = w.a(w.this).a("REPLACE INTO user_photos VALUES(?, ?, ?)");
          Iterator localIterator = this.a.b.iterator();
          while (localIterator.hasNext())
          {
            g.ay localay = (g.ay)localIterator.next();
            if ((localay instanceof g.rr))
              continue;
            localSQLitePreparedStatement.d();
            NativeByteBuffer localNativeByteBuffer = new NativeByteBuffer(localay.b());
            localay.a(localNativeByteBuffer);
            localSQLitePreparedStatement.a(1, this.b);
            localSQLitePreparedStatement.a(2, localay.b);
            localSQLitePreparedStatement.a(3, localNativeByteBuffer);
            localSQLitePreparedStatement.b();
            localNativeByteBuffer.e();
          }
        }
        catch (Exception localException)
        {
          n.a("tmessages", localException);
          return;
        }
        localException.e();
      }
    });
  }

  public void a(long paramLong, int paramInt)
  {
    this.h.b(new Runnable(paramInt, paramLong)
    {
      public void run()
      {
        while (true)
        {
          Object localObject1;
          int j;
          try
          {
            if (this.a != 3)
              continue;
            SQLiteCursor localSQLiteCursor1 = w.a(w.this).b("SELECT last_mid FROM dialogs WHERE did = " + this.b, new Object[0]);
            if (!localSQLiteCursor1.a())
              break label1511;
            i = localSQLiteCursor1.b(0);
            localSQLiteCursor1.b();
            if (i != 0)
              return;
            if (((int)this.b != 0) && (this.a != 2))
              continue;
            localSQLiteCursor1 = w.a(w.this).b("SELECT data FROM messages WHERE uid = " + this.b, new Object[0]);
            localObject1 = new ArrayList();
            try
            {
              if (!localSQLiteCursor1.a())
                continue;
              localObject4 = localSQLiteCursor1.g(0);
              if (localObject4 == null)
                continue;
              Object localObject2 = g.ar.a((org.vidogram.tgnet.a)localObject4, ((NativeByteBuffer)localObject4).b(false), false);
              ((NativeByteBuffer)localObject4).e();
              if ((localObject2 == null) || (((g.ar)localObject2).j == null))
                continue;
              if (!(((g.ar)localObject2).j instanceof g.ob))
                break label852;
              localObject2 = ((g.ar)localObject2).j.d.h.iterator();
              if (!((Iterator)localObject2).hasNext())
                continue;
              localObject4 = m.a((g.az)((Iterator)localObject2).next());
              if ((localObject4 == null) || (((File)localObject4).toString().length() <= 0))
                continue;
              ((ArrayList)localObject1).add(localObject4);
              continue;
            }
            catch (Exception localException2)
            {
              n.a("tmessages", localException2);
              localSQLiteCursor1.b();
              m.a().b((ArrayList)localObject1, this.a);
            }
            if ((this.a != 0) && (this.a != 3))
              break label988;
            w.a(w.this).a("DELETE FROM dialogs WHERE did = " + this.b).c().e();
            w.a(w.this).a("DELETE FROM chat_settings_v2 WHERE uid = " + this.b).c().e();
            w.a(w.this).a("DELETE FROM chat_pinned WHERE uid = " + this.b).c().e();
            w.a(w.this).a("DELETE FROM channel_users_v2 WHERE did = " + this.b).c().e();
            w.a(w.this).a("DELETE FROM search_recent WHERE did = " + this.b).c().e();
            i = (int)this.b;
            j = (int)(this.b >> 32);
            if (i == 0)
              break label950;
            if (j != 1)
              break label943;
            w.a(w.this).a("DELETE FROM chats WHERE uid = " + i).c().e();
            w.a(w.this).a("UPDATE dialogs SET unread_count = 0, unread_count_i = 0 WHERE did = " + this.b).c().e();
            w.a(w.this).a("DELETE FROM messages WHERE uid = " + this.b).c().e();
            w.a(w.this).a("DELETE FROM bot_keyboard WHERE uid = " + this.b).c().e();
            w.a(w.this).a("DELETE FROM media_counts_v2 WHERE uid = " + this.b).c().e();
            w.a(w.this).a("DELETE FROM media_v2 WHERE uid = " + this.b).c().e();
            w.a(w.this).a("DELETE FROM messages_holes WHERE uid = " + this.b).c().e();
            w.a(w.this).a("DELETE FROM media_holes_v2 WHERE uid = " + this.b).c().e();
            org.vidogram.messenger.d.a.a(this.b, null);
            a.a(new Runnable()
            {
              public void run()
              {
                y.a().a(y.aa, new Object[0]);
              }
            });
            return;
          }
          catch (Exception localException1)
          {
            n.a("tmessages", localException1);
            return;
          }
          label852: if (!(localException2.j instanceof g.nw))
            continue;
          Object localObject4 = m.a(localException2.j.k);
          if ((localObject4 != null) && (((File)localObject4).toString().length() > 0))
            ((ArrayList)localObject1).add(localObject4);
          Object localObject3 = m.a(localException2.j.k.i);
          if ((localObject3 == null) || (((File)localObject3).toString().length() <= 0))
            continue;
          ((ArrayList)localObject1).add(localObject3);
          continue;
          label943: if (i >= 0)
            continue;
          continue;
          label950: w.a(w.this).a("DELETE FROM enc_chats WHERE uid = " + j).c().e();
          continue;
          label988: if (this.a != 2)
            continue;
          SQLiteCursor localSQLiteCursor2 = w.a(w.this).b("SELECT last_mid_i, last_mid FROM dialogs WHERE did = " + this.b, new Object[0]);
          if (localSQLiteCursor2.a())
          {
            long l1 = localSQLiteCursor2.d(0);
            long l2 = localSQLiteCursor2.d(1);
            localObject1 = w.a(w.this).b("SELECT data FROM messages WHERE uid = " + this.b + " AND mid IN (" + l1 + "," + l2 + ")", new Object[0]);
            i = -1;
            while (true)
            {
              j = i;
              try
              {
                if (((SQLiteCursor)localObject1).a())
                {
                  localObject3 = ((SQLiteCursor)localObject1).g(0);
                  i = j;
                  if (localObject3 == null)
                    continue;
                  localObject4 = g.ar.a((org.vidogram.tgnet.a)localObject3, ((NativeByteBuffer)localObject3).b(false), false);
                  ((NativeByteBuffer)localObject3).e();
                  i = j;
                  if (localObject4 == null)
                    continue;
                  i = ((g.ar)localObject4).b;
                }
              }
              catch (Exception localSQLitePreparedStatement)
              {
                n.a("tmessages", localException3);
                ((SQLiteCursor)localObject1).b();
                w.a(w.this).a("DELETE FROM messages WHERE uid = " + this.b + " AND mid != " + l1 + " AND mid != " + l2).c().e();
                w.a(w.this).a("DELETE FROM messages_holes WHERE uid = " + this.b).c().e();
                w.a(w.this).a("DELETE FROM bot_keyboard WHERE uid = " + this.b).c().e();
                w.a(w.this).a("DELETE FROM media_counts_v2 WHERE uid = " + this.b).c().e();
                w.a(w.this).a("DELETE FROM media_v2 WHERE uid = " + this.b).c().e();
                w.a(w.this).a("DELETE FROM media_holes_v2 WHERE uid = " + this.b).c().e();
                org.vidogram.messenger.d.a.a(this.b, null);
                localObject1 = w.a(w.this).a("REPLACE INTO messages_holes VALUES(?, ?, ?)");
                SQLitePreparedStatement localSQLitePreparedStatement = w.a(w.this).a("REPLACE INTO media_holes_v2 VALUES(?, ?, ?, ?)");
                if (j != -1)
                  w.a(this.b, (SQLitePreparedStatement)localObject1, localSQLitePreparedStatement, j);
                ((SQLitePreparedStatement)localObject1).e();
                localSQLitePreparedStatement.e();
              }
            }
          }
          localSQLiteCursor2.b();
          return;
          label1511: int i = -1;
        }
      }
    });
  }

  public void a(long paramLong, int paramInt1, int paramInt2)
  {
    int i1 = 0;
    SQLitePreparedStatement localSQLitePreparedStatement;
    if (paramInt2 == -1)
    {
      if (paramInt1 == 0)
        this.i.a(String.format(Locale.US, "DELETE FROM media_holes_v2 WHERE uid = %d", new Object[] { Long.valueOf(paramLong) })).c().e();
      while (true)
      {
        localSQLitePreparedStatement = this.i.a("REPLACE INTO media_holes_v2 VALUES(?, ?, ?, ?)");
        paramInt1 = i1;
        while (paramInt1 < 5)
        {
          localSQLitePreparedStatement.d();
          localSQLitePreparedStatement.a(1, paramLong);
          localSQLitePreparedStatement.a(2, paramInt1);
          localSQLitePreparedStatement.a(3, 1);
          localSQLitePreparedStatement.a(4, 1);
          localSQLitePreparedStatement.b();
          paramInt1 += 1;
        }
        this.i.a(String.format(Locale.US, "DELETE FROM media_holes_v2 WHERE uid = %d AND start = 0", new Object[] { Long.valueOf(paramLong) })).c().e();
      }
      localSQLitePreparedStatement.e();
      return;
    }
    if (paramInt1 == 0)
      this.i.a(String.format(Locale.US, "DELETE FROM media_holes_v2 WHERE uid = %d AND type = %d", new Object[] { Long.valueOf(paramLong), Integer.valueOf(paramInt2) })).c().e();
    while (true)
    {
      localSQLitePreparedStatement = this.i.a("REPLACE INTO media_holes_v2 VALUES(?, ?, ?, ?)");
      localSQLitePreparedStatement.d();
      localSQLitePreparedStatement.a(1, paramLong);
      localSQLitePreparedStatement.a(2, paramInt2);
      localSQLitePreparedStatement.a(3, 1);
      localSQLitePreparedStatement.a(4, 1);
      localSQLitePreparedStatement.b();
      localSQLitePreparedStatement.e();
      return;
      this.i.a(String.format(Locale.US, "DELETE FROM media_holes_v2 WHERE uid = %d AND type = %d AND start = 0", new Object[] { Long.valueOf(paramLong), Integer.valueOf(paramInt2) })).c().e();
    }
  }

  public void a(long paramLong, int paramInt1, int paramInt2, int paramInt3)
  {
    int i1 = 0;
    Object localObject3;
    Object localObject4;
    if (paramInt3 < 0)
      try
      {
        localObject3 = this.i.b(String.format(Locale.US, "SELECT type, start, end FROM media_holes_v2 WHERE uid = %d AND type >= 0 AND ((end >= %d AND end <= %d) OR (start >= %d AND start <= %d) OR (start >= %d AND end <= %d) OR (start <= %d AND end >= %d))", new Object[] { Long.valueOf(paramLong), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), new Object[0]);
        break label860;
        while (((SQLiteCursor)localObject3).a())
        {
          localObject4 = localObject1;
          if (localObject1 == null)
            localObject4 = new ArrayList();
          paramInt3 = ((SQLiteCursor)localObject3).b(0);
          int i2 = ((SQLiteCursor)localObject3).b(1);
          int i3 = ((SQLiteCursor)localObject3).b(2);
          if (i2 == i3)
          {
            localObject1 = localObject4;
            if (i2 == 1)
              continue;
          }
          ((ArrayList)localObject4).add(new a(paramInt3, i2, i3));
          Object localObject1 = localObject4;
        }
      }
      catch (Exception localException1)
      {
        n.a("tmessages", localException1);
      }
    label860: label866: label873: 
    while (true)
    {
      return;
      localObject3 = this.i.b(String.format(Locale.US, "SELECT type, start, end FROM media_holes_v2 WHERE uid = %d AND type = %d AND ((end >= %d AND end <= %d) OR (start >= %d AND start <= %d) OR (start >= %d AND end <= %d) OR (start <= %d AND end >= %d))", new Object[] { Long.valueOf(paramLong), Integer.valueOf(paramInt3), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), new Object[0]);
      break label860;
      ((SQLiteCursor)localObject3).b();
      if (localException1 == null)
        continue;
      paramInt3 = i1;
      while (true)
      {
        if (paramInt3 >= localException1.size())
          break label873;
        localObject3 = (a)localException1.get(paramInt3);
        if ((paramInt2 >= ((a)localObject3).b - 1) && (paramInt1 <= ((a)localObject3).a + 1))
        {
          this.i.a(String.format(Locale.US, "DELETE FROM media_holes_v2 WHERE uid = %d AND type = %d AND start = %d AND end = %d", new Object[] { Long.valueOf(paramLong), Integer.valueOf(((a)localObject3).c), Integer.valueOf(((a)localObject3).a), Integer.valueOf(((a)localObject3).b) })).c().e();
        }
        else if (paramInt2 >= ((a)localObject3).b - 1)
        {
          i1 = ((a)localObject3).b;
          if (i1 != paramInt1)
            try
            {
              this.i.a(String.format(Locale.US, "UPDATE media_holes_v2 SET end = %d WHERE uid = %d AND type = %d AND start = %d AND end = %d", new Object[] { Integer.valueOf(paramInt1), Long.valueOf(paramLong), Integer.valueOf(((a)localObject3).c), Integer.valueOf(((a)localObject3).a), Integer.valueOf(((a)localObject3).b) })).c().e();
            }
            catch (Exception localException2)
            {
              n.a("tmessages", localException2);
            }
        }
        else if (paramInt1 <= localException2.a + 1)
        {
          i1 = localException2.a;
          if (i1 != paramInt2)
            try
            {
              this.i.a(String.format(Locale.US, "UPDATE media_holes_v2 SET start = %d WHERE uid = %d AND type = %d AND start = %d AND end = %d", new Object[] { Integer.valueOf(paramInt2), Long.valueOf(paramLong), Integer.valueOf(localException2.c), Integer.valueOf(localException2.a), Integer.valueOf(localException2.b) })).c().e();
            }
            catch (Exception localException3)
            {
              n.a("tmessages", localException3);
            }
        }
        else
        {
          this.i.a(String.format(Locale.US, "DELETE FROM media_holes_v2 WHERE uid = %d AND type = %d AND start = %d AND end = %d", new Object[] { Long.valueOf(paramLong), Integer.valueOf(localException3.c), Integer.valueOf(localException3.a), Integer.valueOf(localException3.b) })).c().e();
          localObject4 = this.i.a("REPLACE INTO media_holes_v2 VALUES(?, ?, ?, ?)");
          ((SQLitePreparedStatement)localObject4).d();
          ((SQLitePreparedStatement)localObject4).a(1, paramLong);
          ((SQLitePreparedStatement)localObject4).a(2, localException3.c);
          ((SQLitePreparedStatement)localObject4).a(3, localException3.a);
          ((SQLitePreparedStatement)localObject4).a(4, paramInt1);
          ((SQLitePreparedStatement)localObject4).b();
          ((SQLitePreparedStatement)localObject4).d();
          ((SQLitePreparedStatement)localObject4).a(1, paramLong);
          ((SQLitePreparedStatement)localObject4).a(2, localException3.c);
          ((SQLitePreparedStatement)localObject4).a(3, paramInt2);
          ((SQLitePreparedStatement)localObject4).a(4, localException3.b);
          ((SQLitePreparedStatement)localObject4).b();
          ((SQLitePreparedStatement)localObject4).e();
          break label866;
          Object localObject2 = null;
          break;
        }
        paramInt3 += 1;
      }
    }
  }

  public void a(long paramLong, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, boolean paramBoolean, int paramInt6)
  {
    this.h.b(new Runnable(paramInt1, paramInt2, paramBoolean, paramLong, paramInt5, paramInt3, paramInt4, paramInt6)
    {
      // ERROR //
      public void run()
      {
        // Byte code:
        //   0: new 54	org/vidogram/tgnet/g$qi
        //   3: dup
        //   4: invokespecial 55	org/vidogram/tgnet/g$qi:<init>	()V
        //   7: astore 74
        //   9: iconst_0
        //   10: istore 18
        //   12: iconst_0
        //   13: istore 25
        //   15: iconst_0
        //   16: istore 26
        //   18: iconst_0
        //   19: istore 37
        //   21: iconst_0
        //   22: istore 35
        //   24: iconst_0
        //   25: istore 12
        //   27: iconst_0
        //   28: istore 33
        //   30: iconst_0
        //   31: istore 32
        //   33: aload_0
        //   34: getfield 31	org/vidogram/messenger/w$28:a	I
        //   37: istore 4
        //   39: iconst_0
        //   40: istore 29
        //   42: iconst_0
        //   43: istore 30
        //   45: iconst_0
        //   46: istore 38
        //   48: iconst_0
        //   49: istore 36
        //   51: iconst_0
        //   52: istore 9
        //   54: iconst_0
        //   55: istore 42
        //   57: iconst_0
        //   58: istore 14
        //   60: iconst_0
        //   61: istore 24
        //   63: iconst_0
        //   64: istore 13
        //   66: iconst_0
        //   67: istore 21
        //   69: iconst_0
        //   70: istore 22
        //   72: iconst_0
        //   73: istore 11
        //   75: iconst_0
        //   76: istore 41
        //   78: iconst_0
        //   79: istore 23
        //   81: iconst_0
        //   82: istore 44
        //   84: iconst_0
        //   85: istore 54
        //   87: iconst_0
        //   88: istore 49
        //   90: iconst_0
        //   91: istore 55
        //   93: iconst_0
        //   94: istore 61
        //   96: iconst_0
        //   97: istore 62
        //   99: iconst_0
        //   100: istore 51
        //   102: iconst_0
        //   103: istore 60
        //   105: iconst_0
        //   106: istore 15
        //   108: iconst_0
        //   109: istore 27
        //   111: iconst_0
        //   112: istore 28
        //   114: iconst_0
        //   115: istore 39
        //   117: iconst_0
        //   118: istore 34
        //   120: iconst_0
        //   121: istore_3
        //   122: iconst_0
        //   123: istore 40
        //   125: iconst_0
        //   126: istore 31
        //   128: aload_0
        //   129: getfield 33	org/vidogram/messenger/w$28:b	I
        //   132: i2l
        //   133: lstore 63
        //   135: aload_0
        //   136: getfield 33	org/vidogram/messenger/w$28:b	I
        //   139: istore 7
        //   141: aload_0
        //   142: getfield 35	org/vidogram/messenger/w$28:c	Z
        //   145: ifeq +15461 -> 15606
        //   148: aload_0
        //   149: getfield 37	org/vidogram/messenger/w$28:d	J
        //   152: l2i
        //   153: ineg
        //   154: istore 19
        //   156: lload 63
        //   158: lstore 65
        //   160: lload 63
        //   162: lconst_0
        //   163: lcmp
        //   164: ifeq +23 -> 187
        //   167: lload 63
        //   169: lstore 65
        //   171: iload 19
        //   173: ifeq +14 -> 187
        //   176: lload 63
        //   178: iload 19
        //   180: i2l
        //   181: bipush 32
        //   183: lshl
        //   184: lor
        //   185: lstore 65
        //   187: iconst_0
        //   188: istore 52
        //   190: iconst_0
        //   191: istore 56
        //   193: iconst_0
        //   194: istore 53
        //   196: iconst_0
        //   197: istore 57
        //   199: iconst_0
        //   200: istore 58
        //   202: iconst_0
        //   203: istore 59
        //   205: iconst_0
        //   206: istore 50
        //   208: aload_0
        //   209: getfield 37	org/vidogram/messenger/w$28:d	J
        //   212: ldc2_w 56
        //   215: lcmp
        //   216: ifne +6340 -> 6556
        //   219: iconst_4
        //   220: istore 20
        //   222: iload 29
        //   224: istore_1
        //   225: iload 21
        //   227: istore 16
        //   229: iload 25
        //   231: istore 5
        //   233: iload 27
        //   235: istore 10
        //   237: iload 58
        //   239: istore 47
        //   241: iload 49
        //   243: istore 45
        //   245: iload 30
        //   247: istore_2
        //   248: iload 22
        //   250: istore 17
        //   252: iload 26
        //   254: istore 6
        //   256: iload 28
        //   258: istore 8
        //   260: iload 59
        //   262: istore 48
        //   264: iload 55
        //   266: istore 46
        //   268: new 59	java/util/ArrayList
        //   271: dup
        //   272: invokespecial 60	java/util/ArrayList:<init>	()V
        //   275: astore 75
        //   277: iload 29
        //   279: istore_1
        //   280: iload 21
        //   282: istore 16
        //   284: iload 25
        //   286: istore 5
        //   288: iload 27
        //   290: istore 10
        //   292: iload 58
        //   294: istore 47
        //   296: iload 49
        //   298: istore 45
        //   300: iload 30
        //   302: istore_2
        //   303: iload 22
        //   305: istore 17
        //   307: iload 26
        //   309: istore 6
        //   311: iload 28
        //   313: istore 8
        //   315: iload 59
        //   317: istore 48
        //   319: iload 55
        //   321: istore 46
        //   323: new 59	java/util/ArrayList
        //   326: dup
        //   327: invokespecial 60	java/util/ArrayList:<init>	()V
        //   330: astore 76
        //   332: iload 29
        //   334: istore_1
        //   335: iload 21
        //   337: istore 16
        //   339: iload 25
        //   341: istore 5
        //   343: iload 27
        //   345: istore 10
        //   347: iload 58
        //   349: istore 47
        //   351: iload 49
        //   353: istore 45
        //   355: iload 30
        //   357: istore_2
        //   358: iload 22
        //   360: istore 17
        //   362: iload 26
        //   364: istore 6
        //   366: iload 28
        //   368: istore 8
        //   370: iload 59
        //   372: istore 48
        //   374: iload 55
        //   376: istore 46
        //   378: new 59	java/util/ArrayList
        //   381: dup
        //   382: invokespecial 60	java/util/ArrayList:<init>	()V
        //   385: astore 79
        //   387: iload 29
        //   389: istore_1
        //   390: iload 21
        //   392: istore 16
        //   394: iload 25
        //   396: istore 5
        //   398: iload 27
        //   400: istore 10
        //   402: iload 58
        //   404: istore 47
        //   406: iload 49
        //   408: istore 45
        //   410: iload 30
        //   412: istore_2
        //   413: iload 22
        //   415: istore 17
        //   417: iload 26
        //   419: istore 6
        //   421: iload 28
        //   423: istore 8
        //   425: iload 59
        //   427: istore 48
        //   429: iload 55
        //   431: istore 46
        //   433: new 62	java/util/HashMap
        //   436: dup
        //   437: invokespecial 63	java/util/HashMap:<init>	()V
        //   440: astore 77
        //   442: iload 29
        //   444: istore_1
        //   445: iload 21
        //   447: istore 16
        //   449: iload 25
        //   451: istore 5
        //   453: iload 27
        //   455: istore 10
        //   457: iload 58
        //   459: istore 47
        //   461: iload 49
        //   463: istore 45
        //   465: iload 30
        //   467: istore_2
        //   468: iload 22
        //   470: istore 17
        //   472: iload 26
        //   474: istore 6
        //   476: iload 28
        //   478: istore 8
        //   480: iload 59
        //   482: istore 48
        //   484: iload 55
        //   486: istore 46
        //   488: new 62	java/util/HashMap
        //   491: dup
        //   492: invokespecial 63	java/util/HashMap:<init>	()V
        //   495: astore 78
        //   497: iload 29
        //   499: istore_1
        //   500: iload 21
        //   502: istore 16
        //   504: iload 25
        //   506: istore 5
        //   508: iload 27
        //   510: istore 10
        //   512: iload 58
        //   514: istore 47
        //   516: iload 49
        //   518: istore 45
        //   520: iload 30
        //   522: istore_2
        //   523: iload 22
        //   525: istore 17
        //   527: iload 26
        //   529: istore 6
        //   531: iload 28
        //   533: istore 8
        //   535: iload 59
        //   537: istore 48
        //   539: iload 55
        //   541: istore 46
        //   543: aload_0
        //   544: getfield 37	org/vidogram/messenger/w$28:d	J
        //   547: l2i
        //   548: istore 43
        //   550: iload 43
        //   552: ifeq +9710 -> 10262
        //   555: iload 29
        //   557: istore_1
        //   558: iload 21
        //   560: istore 16
        //   562: iload 25
        //   564: istore 5
        //   566: iload 27
        //   568: istore 10
        //   570: iload 58
        //   572: istore 47
        //   574: iload 49
        //   576: istore 45
        //   578: iload 30
        //   580: istore_2
        //   581: iload 22
        //   583: istore 17
        //   585: iload 26
        //   587: istore 6
        //   589: iload 28
        //   591: istore 8
        //   593: iload 59
        //   595: istore 48
        //   597: iload 55
        //   599: istore 46
        //   601: lload 65
        //   603: lstore 63
        //   605: iload 7
        //   607: istore 15
        //   609: iload 4
        //   611: istore 18
        //   613: iload 38
        //   615: istore 9
        //   617: iload 37
        //   619: istore 14
        //   621: iload 39
        //   623: istore 13
        //   625: iload 61
        //   627: istore 44
        //   629: aload_0
        //   630: getfield 39	org/vidogram/messenger/w$28:e	I
        //   633: iconst_1
        //   634: if_icmpeq +14885 -> 15519
        //   637: iload 29
        //   639: istore_1
        //   640: iload 21
        //   642: istore 16
        //   644: iload 25
        //   646: istore 5
        //   648: iload 27
        //   650: istore 10
        //   652: iload 58
        //   654: istore 47
        //   656: iload 49
        //   658: istore 45
        //   660: iload 30
        //   662: istore_2
        //   663: iload 22
        //   665: istore 17
        //   667: iload 26
        //   669: istore 6
        //   671: iload 28
        //   673: istore 8
        //   675: iload 59
        //   677: istore 48
        //   679: iload 55
        //   681: istore 46
        //   683: lload 65
        //   685: lstore 63
        //   687: iload 7
        //   689: istore 15
        //   691: iload 4
        //   693: istore 18
        //   695: iload 38
        //   697: istore 9
        //   699: iload 37
        //   701: istore 14
        //   703: iload 39
        //   705: istore 13
        //   707: iload 61
        //   709: istore 44
        //   711: aload_0
        //   712: getfield 39	org/vidogram/messenger/w$28:e	I
        //   715: iconst_3
        //   716: if_icmpeq +14803 -> 15519
        //   719: iload 29
        //   721: istore_1
        //   722: iload 21
        //   724: istore 16
        //   726: iload 25
        //   728: istore 5
        //   730: iload 27
        //   732: istore 10
        //   734: iload 58
        //   736: istore 47
        //   738: iload 49
        //   740: istore 45
        //   742: iload 30
        //   744: istore_2
        //   745: iload 22
        //   747: istore 17
        //   749: iload 26
        //   751: istore 6
        //   753: iload 28
        //   755: istore 8
        //   757: iload 59
        //   759: istore 48
        //   761: iload 55
        //   763: istore 46
        //   765: lload 65
        //   767: lstore 63
        //   769: iload 7
        //   771: istore 15
        //   773: iload 4
        //   775: istore 18
        //   777: iload 38
        //   779: istore 9
        //   781: iload 37
        //   783: istore 14
        //   785: iload 39
        //   787: istore 13
        //   789: iload 61
        //   791: istore 44
        //   793: aload_0
        //   794: getfield 41	org/vidogram/messenger/w$28:f	I
        //   797: ifne +14722 -> 15519
        //   800: iload 29
        //   802: istore_1
        //   803: iload 21
        //   805: istore 16
        //   807: iload 25
        //   809: istore 5
        //   811: iload 27
        //   813: istore 10
        //   815: iload 58
        //   817: istore 47
        //   819: iload 49
        //   821: istore 45
        //   823: iload 30
        //   825: istore_2
        //   826: iload 22
        //   828: istore 17
        //   830: iload 26
        //   832: istore 6
        //   834: iload 28
        //   836: istore 8
        //   838: iload 59
        //   840: istore 48
        //   842: iload 55
        //   844: istore 46
        //   846: lload 65
        //   848: lstore 63
        //   850: iload 7
        //   852: istore_3
        //   853: iload 36
        //   855: istore 9
        //   857: iload 35
        //   859: istore 12
        //   861: iload 34
        //   863: istore 11
        //   865: iload 62
        //   867: istore 44
        //   869: aload_0
        //   870: getfield 39	org/vidogram/messenger/w$28:e	I
        //   873: iconst_2
        //   874: if_icmpne +14738 -> 15612
        //   877: iload 29
        //   879: istore_1
        //   880: iload 21
        //   882: istore 16
        //   884: iload 25
        //   886: istore 5
        //   888: iload 27
        //   890: istore 10
        //   892: iload 58
        //   894: istore 47
        //   896: iload 49
        //   898: istore 45
        //   900: iload 30
        //   902: istore_2
        //   903: iload 22
        //   905: istore 17
        //   907: iload 26
        //   909: istore 6
        //   911: iload 28
        //   913: istore 8
        //   915: iload 59
        //   917: istore 48
        //   919: iload 55
        //   921: istore 46
        //   923: aload_0
        //   924: getfield 29	org/vidogram/messenger/w$28:i	Lorg/vidogram/messenger/w;
        //   927: invokestatic 66	org/vidogram/messenger/w:a	(Lorg/vidogram/messenger/w;)Lorg/vidogram/SQLite/SQLiteDatabase;
        //   930: new 68	java/lang/StringBuilder
        //   933: dup
        //   934: invokespecial 69	java/lang/StringBuilder:<init>	()V
        //   937: ldc 71
        //   939: invokevirtual 75	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   942: aload_0
        //   943: getfield 37	org/vidogram/messenger/w$28:d	J
        //   946: invokevirtual 78	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
        //   949: invokevirtual 82	java/lang/StringBuilder:toString	()Ljava/lang/String;
        //   952: iconst_0
        //   953: anewarray 4	java/lang/Object
        //   956: invokevirtual 87	org/vidogram/SQLite/SQLiteDatabase:b	(Ljava/lang/String;[Ljava/lang/Object;)Lorg/vidogram/SQLite/SQLiteCursor;
        //   959: astore 71
        //   961: iload 29
        //   963: istore_1
        //   964: iload 21
        //   966: istore 16
        //   968: iload 25
        //   970: istore 5
        //   972: iload 27
        //   974: istore 10
        //   976: iload 58
        //   978: istore 47
        //   980: iload 49
        //   982: istore 45
        //   984: iload 30
        //   986: istore_2
        //   987: iload 22
        //   989: istore 17
        //   991: iload 26
        //   993: istore 6
        //   995: iload 28
        //   997: istore 8
        //   999: iload 59
        //   1001: istore 48
        //   1003: iload 55
        //   1005: istore 46
        //   1007: aload 71
        //   1009: invokevirtual 92	org/vidogram/SQLite/SQLiteCursor:a	()Z
        //   1012: ifeq +14570 -> 15582
        //   1015: iload 29
        //   1017: istore_1
        //   1018: iload 21
        //   1020: istore 16
        //   1022: iload 25
        //   1024: istore 5
        //   1026: iload 27
        //   1028: istore 10
        //   1030: iload 58
        //   1032: istore 47
        //   1034: iload 49
        //   1036: istore 45
        //   1038: iload 30
        //   1040: istore_2
        //   1041: iload 22
        //   1043: istore 17
        //   1045: iload 26
        //   1047: istore 6
        //   1049: iload 28
        //   1051: istore 8
        //   1053: iload 59
        //   1055: istore 48
        //   1057: iload 55
        //   1059: istore 46
        //   1061: aload 71
        //   1063: iconst_0
        //   1064: invokevirtual 95	org/vidogram/SQLite/SQLiteCursor:b	(I)I
        //   1067: istore_3
        //   1068: iload_3
        //   1069: i2l
        //   1070: lstore 63
        //   1072: iload_3
        //   1073: istore_1
        //   1074: iload 21
        //   1076: istore 16
        //   1078: iload 25
        //   1080: istore 5
        //   1082: iload 27
        //   1084: istore 10
        //   1086: iload 58
        //   1088: istore 47
        //   1090: iload 49
        //   1092: istore 45
        //   1094: iload_3
        //   1095: istore_2
        //   1096: iload 22
        //   1098: istore 17
        //   1100: iload 26
        //   1102: istore 6
        //   1104: iload 28
        //   1106: istore 8
        //   1108: iload 59
        //   1110: istore 48
        //   1112: iload 55
        //   1114: istore 46
        //   1116: aload 71
        //   1118: iconst_1
        //   1119: invokevirtual 95	org/vidogram/SQLite/SQLiteCursor:b	(I)I
        //   1122: istore 7
        //   1124: iload_3
        //   1125: istore_1
        //   1126: iload 21
        //   1128: istore 16
        //   1130: iload 7
        //   1132: istore 5
        //   1134: iload 27
        //   1136: istore 10
        //   1138: iload 58
        //   1140: istore 47
        //   1142: iload 49
        //   1144: istore 45
        //   1146: iload_3
        //   1147: istore_2
        //   1148: iload 22
        //   1150: istore 17
        //   1152: iload 7
        //   1154: istore 6
        //   1156: iload 28
        //   1158: istore 8
        //   1160: iload 59
        //   1162: istore 48
        //   1164: iload 55
        //   1166: istore 46
        //   1168: aload 71
        //   1170: iconst_2
        //   1171: invokevirtual 95	org/vidogram/SQLite/SQLiteCursor:b	(I)I
        //   1174: istore 9
        //   1176: iload 9
        //   1178: istore 8
        //   1180: iconst_1
        //   1181: istore 44
        //   1183: lload 63
        //   1185: lconst_0
        //   1186: lcmp
        //   1187: ifeq +14384 -> 15571
        //   1190: iload 19
        //   1192: ifeq +14379 -> 15571
        //   1195: lload 63
        //   1197: iload 19
        //   1199: i2l
        //   1200: bipush 32
        //   1202: lshl
        //   1203: lor
        //   1204: lstore 63
        //   1206: iload_3
        //   1207: istore_2
        //   1208: iload_3
        //   1209: istore_1
        //   1210: iload_2
        //   1211: istore_3
        //   1212: iload_1
        //   1213: istore 5
        //   1215: iload_1
        //   1216: istore 6
        //   1218: aload 71
        //   1220: invokevirtual 97	org/vidogram/SQLite/SQLiteCursor:b	()V
        //   1223: iload 44
        //   1225: ifne +5337 -> 6562
        //   1228: iload_1
        //   1229: istore 5
        //   1231: iload_1
        //   1232: istore 6
        //   1234: aload_0
        //   1235: getfield 29	org/vidogram/messenger/w$28:i	Lorg/vidogram/messenger/w;
        //   1238: invokestatic 66	org/vidogram/messenger/w:a	(Lorg/vidogram/messenger/w;)Lorg/vidogram/SQLite/SQLiteDatabase;
        //   1241: getstatic 103	java/util/Locale:US	Ljava/util/Locale;
        //   1244: ldc 105
        //   1246: iconst_1
        //   1247: anewarray 4	java/lang/Object
        //   1250: dup
        //   1251: iconst_0
        //   1252: aload_0
        //   1253: getfield 37	org/vidogram/messenger/w$28:d	J
        //   1256: invokestatic 111	java/lang/Long:valueOf	(J)Ljava/lang/Long;
        //   1259: aastore
        //   1260: invokestatic 117	java/lang/String:format	(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   1263: iconst_0
        //   1264: anewarray 4	java/lang/Object
        //   1267: invokevirtual 87	org/vidogram/SQLite/SQLiteDatabase:b	(Ljava/lang/String;[Ljava/lang/Object;)Lorg/vidogram/SQLite/SQLiteCursor;
        //   1270: astore 71
        //   1272: iload_1
        //   1273: istore 5
        //   1275: iload_1
        //   1276: istore 6
        //   1278: aload 71
        //   1280: invokevirtual 92	org/vidogram/SQLite/SQLiteCursor:a	()Z
        //   1283: ifeq +14278 -> 15561
        //   1286: iload_1
        //   1287: istore 5
        //   1289: iload_1
        //   1290: istore 6
        //   1292: aload 71
        //   1294: iconst_0
        //   1295: invokevirtual 95	org/vidogram/SQLite/SQLiteCursor:b	(I)I
        //   1298: istore 9
        //   1300: iload 9
        //   1302: istore_1
        //   1303: iload 21
        //   1305: istore 16
        //   1307: iload 7
        //   1309: istore 5
        //   1311: iload 8
        //   1313: istore 10
        //   1315: iload 58
        //   1317: istore 47
        //   1319: iload 44
        //   1321: istore 45
        //   1323: iload 9
        //   1325: istore_2
        //   1326: iload 22
        //   1328: istore 17
        //   1330: iload 7
        //   1332: istore 6
        //   1334: iload 59
        //   1336: istore 48
        //   1338: iload 44
        //   1340: istore 46
        //   1342: aload 71
        //   1344: iconst_1
        //   1345: invokevirtual 95	org/vidogram/SQLite/SQLiteCursor:b	(I)I
        //   1348: istore 11
        //   1350: iload 9
        //   1352: istore_1
        //   1353: iload 21
        //   1355: istore 16
        //   1357: iload 7
        //   1359: istore 5
        //   1361: iload 11
        //   1363: istore 10
        //   1365: iload 58
        //   1367: istore 47
        //   1369: iload 44
        //   1371: istore 45
        //   1373: iload 9
        //   1375: istore_2
        //   1376: iload 22
        //   1378: istore 17
        //   1380: iload 7
        //   1382: istore 6
        //   1384: iload 11
        //   1386: istore 8
        //   1388: iload 59
        //   1390: istore 48
        //   1392: iload 44
        //   1394: istore 46
        //   1396: aload 71
        //   1398: invokevirtual 97	org/vidogram/SQLite/SQLiteCursor:b	()V
        //   1401: iload 9
        //   1403: ifeq +14151 -> 15554
        //   1406: iload 9
        //   1408: istore_1
        //   1409: iload 21
        //   1411: istore 16
        //   1413: iload 7
        //   1415: istore 5
        //   1417: iload 11
        //   1419: istore 10
        //   1421: iload 58
        //   1423: istore 47
        //   1425: iload 44
        //   1427: istore 45
        //   1429: iload 9
        //   1431: istore_2
        //   1432: iload 22
        //   1434: istore 17
        //   1436: iload 7
        //   1438: istore 6
        //   1440: iload 11
        //   1442: istore 8
        //   1444: iload 59
        //   1446: istore 48
        //   1448: iload 44
        //   1450: istore 46
        //   1452: aload_0
        //   1453: getfield 29	org/vidogram/messenger/w$28:i	Lorg/vidogram/messenger/w;
        //   1456: invokestatic 66	org/vidogram/messenger/w:a	(Lorg/vidogram/messenger/w;)Lorg/vidogram/SQLite/SQLiteDatabase;
        //   1459: getstatic 103	java/util/Locale:US	Ljava/util/Locale;
        //   1462: ldc 119
        //   1464: iconst_2
        //   1465: anewarray 4	java/lang/Object
        //   1468: dup
        //   1469: iconst_0
        //   1470: aload_0
        //   1471: getfield 37	org/vidogram/messenger/w$28:d	J
        //   1474: invokestatic 111	java/lang/Long:valueOf	(J)Ljava/lang/Long;
        //   1477: aastore
        //   1478: dup
        //   1479: iconst_1
        //   1480: iload 9
        //   1482: invokestatic 124	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   1485: aastore
        //   1486: invokestatic 117	java/lang/String:format	(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   1489: iconst_0
        //   1490: anewarray 4	java/lang/Object
        //   1493: invokevirtual 87	org/vidogram/SQLite/SQLiteDatabase:b	(Ljava/lang/String;[Ljava/lang/Object;)Lorg/vidogram/SQLite/SQLiteCursor;
        //   1496: astore 71
        //   1498: iload 7
        //   1500: istore 12
        //   1502: iload 9
        //   1504: istore_1
        //   1505: iload 21
        //   1507: istore 16
        //   1509: iload 7
        //   1511: istore 5
        //   1513: iload 11
        //   1515: istore 10
        //   1517: iload 58
        //   1519: istore 47
        //   1521: iload 44
        //   1523: istore 45
        //   1525: iload 9
        //   1527: istore_2
        //   1528: iload 22
        //   1530: istore 17
        //   1532: iload 7
        //   1534: istore 6
        //   1536: iload 11
        //   1538: istore 8
        //   1540: iload 59
        //   1542: istore 48
        //   1544: iload 44
        //   1546: istore 46
        //   1548: aload 71
        //   1550: invokevirtual 92	org/vidogram/SQLite/SQLiteCursor:a	()Z
        //   1553: ifeq +57 -> 1610
        //   1556: iload 9
        //   1558: istore_1
        //   1559: iload 21
        //   1561: istore 16
        //   1563: iload 7
        //   1565: istore 5
        //   1567: iload 11
        //   1569: istore 10
        //   1571: iload 58
        //   1573: istore 47
        //   1575: iload 44
        //   1577: istore 45
        //   1579: iload 9
        //   1581: istore_2
        //   1582: iload 22
        //   1584: istore 17
        //   1586: iload 7
        //   1588: istore 6
        //   1590: iload 11
        //   1592: istore 8
        //   1594: iload 59
        //   1596: istore 48
        //   1598: iload 44
        //   1600: istore 46
        //   1602: aload 71
        //   1604: iconst_0
        //   1605: invokevirtual 95	org/vidogram/SQLite/SQLiteCursor:b	(I)I
        //   1608: istore 12
        //   1610: iload 9
        //   1612: istore_1
        //   1613: iload 21
        //   1615: istore 16
        //   1617: iload 12
        //   1619: istore 5
        //   1621: iload 11
        //   1623: istore 10
        //   1625: iload 58
        //   1627: istore 47
        //   1629: iload 44
        //   1631: istore 45
        //   1633: iload 9
        //   1635: istore_2
        //   1636: iload 22
        //   1638: istore 17
        //   1640: iload 12
        //   1642: istore 6
        //   1644: iload 11
        //   1646: istore 8
        //   1648: iload 59
        //   1650: istore 48
        //   1652: iload 44
        //   1654: istore 46
        //   1656: aload 71
        //   1658: invokevirtual 97	org/vidogram/SQLite/SQLiteCursor:b	()V
        //   1661: goto +13951 -> 15612
        //   1664: iload 9
        //   1666: istore_1
        //   1667: iload 21
        //   1669: istore 16
        //   1671: iload 12
        //   1673: istore 5
        //   1675: iload 11
        //   1677: istore 10
        //   1679: iload 58
        //   1681: istore 47
        //   1683: iload 44
        //   1685: istore 45
        //   1687: iload 9
        //   1689: istore_2
        //   1690: iload 22
        //   1692: istore 17
        //   1694: iload 12
        //   1696: istore 6
        //   1698: iload 11
        //   1700: istore 8
        //   1702: iload 59
        //   1704: istore 48
        //   1706: iload 44
        //   1708: istore 46
        //   1710: iload 4
        //   1712: iload 12
        //   1714: bipush 10
        //   1716: iadd
        //   1717: invokestatic 130	java/lang/Math:max	(II)I
        //   1720: istore 7
        //   1722: iload 7
        //   1724: istore_1
        //   1725: iload_3
        //   1726: istore 15
        //   1728: iload_1
        //   1729: istore 18
        //   1731: iload 12
        //   1733: istore 14
        //   1735: iload 11
        //   1737: istore 13
        //   1739: iload 12
        //   1741: iload 20
        //   1743: if_icmpge +13776 -> 15519
        //   1746: iconst_0
        //   1747: istore 12
        //   1749: iconst_0
        //   1750: istore 9
        //   1752: iconst_0
        //   1753: istore 46
        //   1755: lconst_0
        //   1756: lstore 65
        //   1758: iconst_0
        //   1759: istore 7
        //   1761: iload_3
        //   1762: istore_2
        //   1763: iload 11
        //   1765: istore_3
        //   1766: iload_1
        //   1767: istore 4
        //   1769: iload_2
        //   1770: istore_1
        //   1771: iconst_0
        //   1772: istore 18
        //   1774: iconst_0
        //   1775: istore 20
        //   1777: iconst_0
        //   1778: istore 22
        //   1780: iconst_0
        //   1781: istore 5
        //   1783: iconst_0
        //   1784: istore 21
        //   1786: iload 4
        //   1788: istore 14
        //   1790: iload 9
        //   1792: istore 15
        //   1794: iload 18
        //   1796: istore 6
        //   1798: iload 12
        //   1800: istore 16
        //   1802: iload_3
        //   1803: istore 17
        //   1805: iload 52
        //   1807: istore 45
        //   1809: iload 46
        //   1811: istore 49
        //   1813: iload 4
        //   1815: istore 8
        //   1817: iload 9
        //   1819: istore 10
        //   1821: iload 20
        //   1823: istore_2
        //   1824: iload 12
        //   1826: istore 11
        //   1828: iload_3
        //   1829: istore 13
        //   1831: iload 53
        //   1833: istore 44
        //   1835: iload 46
        //   1837: istore 47
        //   1839: aload_0
        //   1840: getfield 29	org/vidogram/messenger/w$28:i	Lorg/vidogram/messenger/w;
        //   1843: invokestatic 66	org/vidogram/messenger/w:a	(Lorg/vidogram/messenger/w;)Lorg/vidogram/SQLite/SQLiteDatabase;
        //   1846: getstatic 103	java/util/Locale:US	Ljava/util/Locale;
        //   1849: ldc 132
        //   1851: iconst_1
        //   1852: anewarray 4	java/lang/Object
        //   1855: dup
        //   1856: iconst_0
        //   1857: aload_0
        //   1858: getfield 37	org/vidogram/messenger/w$28:d	J
        //   1861: invokestatic 111	java/lang/Long:valueOf	(J)Ljava/lang/Long;
        //   1864: aastore
        //   1865: invokestatic 117	java/lang/String:format	(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   1868: iconst_0
        //   1869: anewarray 4	java/lang/Object
        //   1872: invokevirtual 87	org/vidogram/SQLite/SQLiteDatabase:b	(Ljava/lang/String;[Ljava/lang/Object;)Lorg/vidogram/SQLite/SQLiteCursor;
        //   1875: astore 71
        //   1877: iload 4
        //   1879: istore 14
        //   1881: iload 9
        //   1883: istore 15
        //   1885: iload 18
        //   1887: istore 6
        //   1889: iload 12
        //   1891: istore 16
        //   1893: iload_3
        //   1894: istore 17
        //   1896: iload 52
        //   1898: istore 45
        //   1900: iload 46
        //   1902: istore 49
        //   1904: iload 4
        //   1906: istore 8
        //   1908: iload 9
        //   1910: istore 10
        //   1912: iload 20
        //   1914: istore_2
        //   1915: iload 12
        //   1917: istore 11
        //   1919: iload_3
        //   1920: istore 13
        //   1922: iload 53
        //   1924: istore 44
        //   1926: iload 46
        //   1928: istore 47
        //   1930: aload 71
        //   1932: invokevirtual 92	org/vidogram/SQLite/SQLiteCursor:a	()Z
        //   1935: ifeq +5157 -> 7092
        //   1938: iload 4
        //   1940: istore 14
        //   1942: iload 9
        //   1944: istore 15
        //   1946: iload 18
        //   1948: istore 6
        //   1950: iload 12
        //   1952: istore 16
        //   1954: iload_3
        //   1955: istore 17
        //   1957: iload 52
        //   1959: istore 45
        //   1961: iload 46
        //   1963: istore 49
        //   1965: iload 4
        //   1967: istore 8
        //   1969: iload 9
        //   1971: istore 10
        //   1973: iload 20
        //   1975: istore_2
        //   1976: iload 12
        //   1978: istore 11
        //   1980: iload_3
        //   1981: istore 13
        //   1983: iload 53
        //   1985: istore 44
        //   1987: iload 46
        //   1989: istore 47
        //   1991: aload 71
        //   1993: iconst_0
        //   1994: invokevirtual 95	org/vidogram/SQLite/SQLiteCursor:b	(I)I
        //   1997: iconst_1
        //   1998: if_icmpne +5088 -> 7086
        //   2001: iconst_1
        //   2002: istore 48
        //   2004: iload 4
        //   2006: istore 14
        //   2008: iload 9
        //   2010: istore 15
        //   2012: iload 18
        //   2014: istore 6
        //   2016: iload 12
        //   2018: istore 16
        //   2020: iload_3
        //   2021: istore 17
        //   2023: iload 48
        //   2025: istore 45
        //   2027: iload 46
        //   2029: istore 49
        //   2031: iload 4
        //   2033: istore 8
        //   2035: iload 9
        //   2037: istore 10
        //   2039: iload 20
        //   2041: istore_2
        //   2042: iload 12
        //   2044: istore 11
        //   2046: iload_3
        //   2047: istore 13
        //   2049: iload 48
        //   2051: istore 44
        //   2053: iload 46
        //   2055: istore 47
        //   2057: aload 71
        //   2059: invokevirtual 97	org/vidogram/SQLite/SQLiteCursor:b	()V
        //   2062: iload 4
        //   2064: istore 14
        //   2066: iload 9
        //   2068: istore 15
        //   2070: iload 18
        //   2072: istore 6
        //   2074: iload 12
        //   2076: istore 16
        //   2078: iload_3
        //   2079: istore 17
        //   2081: iload 48
        //   2083: istore 45
        //   2085: iload 46
        //   2087: istore 49
        //   2089: iload 4
        //   2091: istore 8
        //   2093: iload 9
        //   2095: istore 10
        //   2097: iload 20
        //   2099: istore_2
        //   2100: iload 12
        //   2102: istore 11
        //   2104: iload_3
        //   2105: istore 13
        //   2107: iload 48
        //   2109: istore 44
        //   2111: iload 46
        //   2113: istore 47
        //   2115: aload_0
        //   2116: getfield 39	org/vidogram/messenger/w$28:e	I
        //   2119: iconst_3
        //   2120: if_icmpeq +69 -> 2189
        //   2123: iload 46
        //   2125: ifeq +5955 -> 8080
        //   2128: iload 4
        //   2130: istore 14
        //   2132: iload 9
        //   2134: istore 15
        //   2136: iload 18
        //   2138: istore 6
        //   2140: iload 12
        //   2142: istore 16
        //   2144: iload_3
        //   2145: istore 17
        //   2147: iload 48
        //   2149: istore 45
        //   2151: iload 46
        //   2153: istore 49
        //   2155: iload 4
        //   2157: istore 8
        //   2159: iload 9
        //   2161: istore 10
        //   2163: iload 20
        //   2165: istore_2
        //   2166: iload 12
        //   2168: istore 11
        //   2170: iload_3
        //   2171: istore 13
        //   2173: iload 48
        //   2175: istore 44
        //   2177: iload 46
        //   2179: istore 47
        //   2181: aload_0
        //   2182: getfield 39	org/vidogram/messenger/w$28:e	I
        //   2185: iconst_2
        //   2186: if_icmpne +5894 -> 8080
        //   2189: iload 4
        //   2191: istore 14
        //   2193: iload 9
        //   2195: istore 15
        //   2197: iload 18
        //   2199: istore 6
        //   2201: iload 12
        //   2203: istore 16
        //   2205: iload_3
        //   2206: istore 17
        //   2208: iload 48
        //   2210: istore 45
        //   2212: iload 46
        //   2214: istore 49
        //   2216: iload 4
        //   2218: istore 8
        //   2220: iload 9
        //   2222: istore 10
        //   2224: iload 20
        //   2226: istore_2
        //   2227: iload 12
        //   2229: istore 11
        //   2231: iload_3
        //   2232: istore 13
        //   2234: iload 48
        //   2236: istore 44
        //   2238: iload 46
        //   2240: istore 47
        //   2242: aload_0
        //   2243: getfield 29	org/vidogram/messenger/w$28:i	Lorg/vidogram/messenger/w;
        //   2246: invokestatic 66	org/vidogram/messenger/w:a	(Lorg/vidogram/messenger/w;)Lorg/vidogram/SQLite/SQLiteDatabase;
        //   2249: getstatic 103	java/util/Locale:US	Ljava/util/Locale;
        //   2252: ldc 134
        //   2254: iconst_1
        //   2255: anewarray 4	java/lang/Object
        //   2258: dup
        //   2259: iconst_0
        //   2260: aload_0
        //   2261: getfield 37	org/vidogram/messenger/w$28:d	J
        //   2264: invokestatic 111	java/lang/Long:valueOf	(J)Ljava/lang/Long;
        //   2267: aastore
        //   2268: invokestatic 117	java/lang/String:format	(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   2271: iconst_0
        //   2272: anewarray 4	java/lang/Object
        //   2275: invokevirtual 87	org/vidogram/SQLite/SQLiteDatabase:b	(Ljava/lang/String;[Ljava/lang/Object;)Lorg/vidogram/SQLite/SQLiteCursor;
        //   2278: astore 71
        //   2280: iload 21
        //   2282: istore 5
        //   2284: iload 4
        //   2286: istore 14
        //   2288: iload 9
        //   2290: istore 15
        //   2292: iload 18
        //   2294: istore 6
        //   2296: iload 12
        //   2298: istore 16
        //   2300: iload_3
        //   2301: istore 17
        //   2303: iload 48
        //   2305: istore 45
        //   2307: iload 46
        //   2309: istore 49
        //   2311: iload 4
        //   2313: istore 8
        //   2315: iload 9
        //   2317: istore 10
        //   2319: iload 20
        //   2321: istore_2
        //   2322: iload 12
        //   2324: istore 11
        //   2326: iload_3
        //   2327: istore 13
        //   2329: iload 48
        //   2331: istore 44
        //   2333: iload 46
        //   2335: istore 47
        //   2337: aload 71
        //   2339: invokevirtual 92	org/vidogram/SQLite/SQLiteCursor:a	()Z
        //   2342: ifeq +64 -> 2406
        //   2345: iload 4
        //   2347: istore 14
        //   2349: iload 9
        //   2351: istore 15
        //   2353: iload 18
        //   2355: istore 6
        //   2357: iload 12
        //   2359: istore 16
        //   2361: iload_3
        //   2362: istore 17
        //   2364: iload 48
        //   2366: istore 45
        //   2368: iload 46
        //   2370: istore 49
        //   2372: iload 4
        //   2374: istore 8
        //   2376: iload 9
        //   2378: istore 10
        //   2380: iload 20
        //   2382: istore_2
        //   2383: iload 12
        //   2385: istore 11
        //   2387: iload_3
        //   2388: istore 13
        //   2390: iload 48
        //   2392: istore 44
        //   2394: iload 46
        //   2396: istore 47
        //   2398: aload 71
        //   2400: iconst_0
        //   2401: invokevirtual 95	org/vidogram/SQLite/SQLiteCursor:b	(I)I
        //   2404: istore 5
        //   2406: iload 4
        //   2408: istore 14
        //   2410: iload 9
        //   2412: istore 15
        //   2414: iload 5
        //   2416: istore 6
        //   2418: iload 12
        //   2420: istore 16
        //   2422: iload_3
        //   2423: istore 17
        //   2425: iload 48
        //   2427: istore 45
        //   2429: iload 46
        //   2431: istore 49
        //   2433: iload 4
        //   2435: istore 8
        //   2437: iload 9
        //   2439: istore 10
        //   2441: iload 5
        //   2443: istore_2
        //   2444: iload 12
        //   2446: istore 11
        //   2448: iload_3
        //   2449: istore 13
        //   2451: iload 48
        //   2453: istore 44
        //   2455: iload 46
        //   2457: istore 47
        //   2459: aload 71
        //   2461: invokevirtual 97	org/vidogram/SQLite/SQLiteCursor:b	()V
        //   2464: iload_1
        //   2465: ifeq +5467 -> 7932
        //   2468: iconst_1
        //   2469: istore 7
        //   2471: iload 7
        //   2473: istore_2
        //   2474: iload 7
        //   2476: ifeq +233 -> 2709
        //   2479: iload 4
        //   2481: istore 14
        //   2483: iload 9
        //   2485: istore 15
        //   2487: iload 5
        //   2489: istore 6
        //   2491: iload 12
        //   2493: istore 16
        //   2495: iload_3
        //   2496: istore 17
        //   2498: iload 48
        //   2500: istore 45
        //   2502: iload 46
        //   2504: istore 49
        //   2506: iload 4
        //   2508: istore 8
        //   2510: iload 9
        //   2512: istore 10
        //   2514: iload 5
        //   2516: istore_2
        //   2517: iload 12
        //   2519: istore 11
        //   2521: iload_3
        //   2522: istore 13
        //   2524: iload 48
        //   2526: istore 44
        //   2528: iload 46
        //   2530: istore 47
        //   2532: aload_0
        //   2533: getfield 29	org/vidogram/messenger/w$28:i	Lorg/vidogram/messenger/w;
        //   2536: invokestatic 66	org/vidogram/messenger/w:a	(Lorg/vidogram/messenger/w;)Lorg/vidogram/SQLite/SQLiteDatabase;
        //   2539: getstatic 103	java/util/Locale:US	Ljava/util/Locale;
        //   2542: ldc 136
        //   2544: iconst_3
        //   2545: anewarray 4	java/lang/Object
        //   2548: dup
        //   2549: iconst_0
        //   2550: aload_0
        //   2551: getfield 37	org/vidogram/messenger/w$28:d	J
        //   2554: invokestatic 111	java/lang/Long:valueOf	(J)Ljava/lang/Long;
        //   2557: aastore
        //   2558: dup
        //   2559: iconst_1
        //   2560: iload_1
        //   2561: invokestatic 124	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   2564: aastore
        //   2565: dup
        //   2566: iconst_2
        //   2567: iload_1
        //   2568: invokestatic 124	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   2571: aastore
        //   2572: invokestatic 117	java/lang/String:format	(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   2575: iconst_0
        //   2576: anewarray 4	java/lang/Object
        //   2579: invokevirtual 87	org/vidogram/SQLite/SQLiteDatabase:b	(Ljava/lang/String;[Ljava/lang/Object;)Lorg/vidogram/SQLite/SQLiteCursor;
        //   2582: astore 71
        //   2584: iload 4
        //   2586: istore 14
        //   2588: iload 9
        //   2590: istore 15
        //   2592: iload 5
        //   2594: istore 6
        //   2596: iload 12
        //   2598: istore 16
        //   2600: iload_3
        //   2601: istore 17
        //   2603: iload 48
        //   2605: istore 45
        //   2607: iload 46
        //   2609: istore 49
        //   2611: iload 4
        //   2613: istore 8
        //   2615: iload 9
        //   2617: istore 10
        //   2619: iload 5
        //   2621: istore_2
        //   2622: iload 12
        //   2624: istore 11
        //   2626: iload_3
        //   2627: istore 13
        //   2629: iload 48
        //   2631: istore 44
        //   2633: iload 46
        //   2635: istore 47
        //   2637: aload 71
        //   2639: invokevirtual 92	org/vidogram/SQLite/SQLiteCursor:a	()Z
        //   2642: ifeq +6 -> 2648
        //   2645: iconst_0
        //   2646: istore 7
        //   2648: iload 4
        //   2650: istore 14
        //   2652: iload 9
        //   2654: istore 15
        //   2656: iload 5
        //   2658: istore 6
        //   2660: iload 12
        //   2662: istore 16
        //   2664: iload_3
        //   2665: istore 17
        //   2667: iload 48
        //   2669: istore 45
        //   2671: iload 46
        //   2673: istore 49
        //   2675: iload 4
        //   2677: istore 8
        //   2679: iload 9
        //   2681: istore 10
        //   2683: iload 5
        //   2685: istore_2
        //   2686: iload 12
        //   2688: istore 11
        //   2690: iload_3
        //   2691: istore 13
        //   2693: iload 48
        //   2695: istore 44
        //   2697: iload 46
        //   2699: istore 47
        //   2701: aload 71
        //   2703: invokevirtual 97	org/vidogram/SQLite/SQLiteCursor:b	()V
        //   2706: iload 7
        //   2708: istore_2
        //   2709: iload_2
        //   2710: ifeq +12984 -> 15694
        //   2713: lconst_0
        //   2714: lstore 63
        //   2716: lconst_1
        //   2717: lstore 67
        //   2719: iload 4
        //   2721: istore 14
        //   2723: iload 9
        //   2725: istore 15
        //   2727: iload 5
        //   2729: istore 6
        //   2731: iload 12
        //   2733: istore 16
        //   2735: iload_3
        //   2736: istore 17
        //   2738: iload 48
        //   2740: istore 45
        //   2742: iload 46
        //   2744: istore 49
        //   2746: iload 4
        //   2748: istore 8
        //   2750: iload 9
        //   2752: istore 10
        //   2754: iload 5
        //   2756: istore_2
        //   2757: iload 12
        //   2759: istore 11
        //   2761: iload_3
        //   2762: istore 13
        //   2764: iload 48
        //   2766: istore 44
        //   2768: iload 46
        //   2770: istore 47
        //   2772: aload_0
        //   2773: getfield 29	org/vidogram/messenger/w$28:i	Lorg/vidogram/messenger/w;
        //   2776: invokestatic 66	org/vidogram/messenger/w:a	(Lorg/vidogram/messenger/w;)Lorg/vidogram/SQLite/SQLiteDatabase;
        //   2779: getstatic 103	java/util/Locale:US	Ljava/util/Locale;
        //   2782: ldc 138
        //   2784: iconst_2
        //   2785: anewarray 4	java/lang/Object
        //   2788: dup
        //   2789: iconst_0
        //   2790: aload_0
        //   2791: getfield 37	org/vidogram/messenger/w$28:d	J
        //   2794: invokestatic 111	java/lang/Long:valueOf	(J)Ljava/lang/Long;
        //   2797: aastore
        //   2798: dup
        //   2799: iconst_1
        //   2800: iload_1
        //   2801: invokestatic 124	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   2804: aastore
        //   2805: invokestatic 117	java/lang/String:format	(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   2808: iconst_0
        //   2809: anewarray 4	java/lang/Object
        //   2812: invokevirtual 87	org/vidogram/SQLite/SQLiteDatabase:b	(Ljava/lang/String;[Ljava/lang/Object;)Lorg/vidogram/SQLite/SQLiteCursor;
        //   2815: astore 71
        //   2817: iload 4
        //   2819: istore 14
        //   2821: iload 9
        //   2823: istore 15
        //   2825: iload 5
        //   2827: istore 6
        //   2829: iload 12
        //   2831: istore 16
        //   2833: iload_3
        //   2834: istore 17
        //   2836: iload 48
        //   2838: istore 45
        //   2840: iload 46
        //   2842: istore 49
        //   2844: iload 4
        //   2846: istore 8
        //   2848: iload 9
        //   2850: istore 10
        //   2852: iload 5
        //   2854: istore_2
        //   2855: iload 12
        //   2857: istore 11
        //   2859: iload_3
        //   2860: istore 13
        //   2862: iload 48
        //   2864: istore 44
        //   2866: iload 46
        //   2868: istore 47
        //   2870: aload 71
        //   2872: invokevirtual 92	org/vidogram/SQLite/SQLiteCursor:a	()Z
        //   2875: ifeq +85 -> 2960
        //   2878: iload 4
        //   2880: istore 14
        //   2882: iload 9
        //   2884: istore 15
        //   2886: iload 5
        //   2888: istore 6
        //   2890: iload 12
        //   2892: istore 16
        //   2894: iload_3
        //   2895: istore 17
        //   2897: iload 48
        //   2899: istore 45
        //   2901: iload 46
        //   2903: istore 49
        //   2905: iload 4
        //   2907: istore 8
        //   2909: iload 9
        //   2911: istore 10
        //   2913: iload 5
        //   2915: istore_2
        //   2916: iload 12
        //   2918: istore 11
        //   2920: iload_3
        //   2921: istore 13
        //   2923: iload 48
        //   2925: istore 44
        //   2927: iload 46
        //   2929: istore 47
        //   2931: aload 71
        //   2933: iconst_0
        //   2934: invokevirtual 95	org/vidogram/SQLite/SQLiteCursor:b	(I)I
        //   2937: i2l
        //   2938: lstore 69
        //   2940: lload 69
        //   2942: lstore 63
        //   2944: iload 19
        //   2946: ifeq +14 -> 2960
        //   2949: lload 69
        //   2951: iload 19
        //   2953: i2l
        //   2954: bipush 32
        //   2956: lshl
        //   2957: lor
        //   2958: lstore 63
        //   2960: iload 4
        //   2962: istore 14
        //   2964: iload 9
        //   2966: istore 15
        //   2968: iload 5
        //   2970: istore 6
        //   2972: iload 12
        //   2974: istore 16
        //   2976: iload_3
        //   2977: istore 17
        //   2979: iload 48
        //   2981: istore 45
        //   2983: iload 46
        //   2985: istore 49
        //   2987: iload 4
        //   2989: istore 8
        //   2991: iload 9
        //   2993: istore 10
        //   2995: iload 5
        //   2997: istore_2
        //   2998: iload 12
        //   3000: istore 11
        //   3002: iload_3
        //   3003: istore 13
        //   3005: iload 48
        //   3007: istore 44
        //   3009: iload 46
        //   3011: istore 47
        //   3013: aload 71
        //   3015: invokevirtual 97	org/vidogram/SQLite/SQLiteCursor:b	()V
        //   3018: iload 4
        //   3020: istore 14
        //   3022: iload 9
        //   3024: istore 15
        //   3026: iload 5
        //   3028: istore 6
        //   3030: iload 12
        //   3032: istore 16
        //   3034: iload_3
        //   3035: istore 17
        //   3037: iload 48
        //   3039: istore 45
        //   3041: iload 46
        //   3043: istore 49
        //   3045: iload 4
        //   3047: istore 8
        //   3049: iload 9
        //   3051: istore 10
        //   3053: iload 5
        //   3055: istore_2
        //   3056: iload 12
        //   3058: istore 11
        //   3060: iload_3
        //   3061: istore 13
        //   3063: iload 48
        //   3065: istore 44
        //   3067: iload 46
        //   3069: istore 47
        //   3071: aload_0
        //   3072: getfield 29	org/vidogram/messenger/w$28:i	Lorg/vidogram/messenger/w;
        //   3075: invokestatic 66	org/vidogram/messenger/w:a	(Lorg/vidogram/messenger/w;)Lorg/vidogram/SQLite/SQLiteDatabase;
        //   3078: getstatic 103	java/util/Locale:US	Ljava/util/Locale;
        //   3081: ldc 140
        //   3083: iconst_2
        //   3084: anewarray 4	java/lang/Object
        //   3087: dup
        //   3088: iconst_0
        //   3089: aload_0
        //   3090: getfield 37	org/vidogram/messenger/w$28:d	J
        //   3093: invokestatic 111	java/lang/Long:valueOf	(J)Ljava/lang/Long;
        //   3096: aastore
        //   3097: dup
        //   3098: iconst_1
        //   3099: iload_1
        //   3100: invokestatic 124	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   3103: aastore
        //   3104: invokestatic 117	java/lang/String:format	(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   3107: iconst_0
        //   3108: anewarray 4	java/lang/Object
        //   3111: invokevirtual 87	org/vidogram/SQLite/SQLiteDatabase:b	(Ljava/lang/String;[Ljava/lang/Object;)Lorg/vidogram/SQLite/SQLiteCursor;
        //   3114: astore 71
        //   3116: iload 4
        //   3118: istore 14
        //   3120: iload 9
        //   3122: istore 15
        //   3124: iload 5
        //   3126: istore 6
        //   3128: iload 12
        //   3130: istore 16
        //   3132: iload_3
        //   3133: istore 17
        //   3135: iload 48
        //   3137: istore 45
        //   3139: iload 46
        //   3141: istore 49
        //   3143: iload 4
        //   3145: istore 8
        //   3147: iload 9
        //   3149: istore 10
        //   3151: iload 5
        //   3153: istore_2
        //   3154: iload 12
        //   3156: istore 11
        //   3158: iload_3
        //   3159: istore 13
        //   3161: iload 48
        //   3163: istore 44
        //   3165: iload 46
        //   3167: istore 47
        //   3169: aload 71
        //   3171: invokevirtual 92	org/vidogram/SQLite/SQLiteCursor:a	()Z
        //   3174: ifeq +85 -> 3259
        //   3177: iload 4
        //   3179: istore 14
        //   3181: iload 9
        //   3183: istore 15
        //   3185: iload 5
        //   3187: istore 6
        //   3189: iload 12
        //   3191: istore 16
        //   3193: iload_3
        //   3194: istore 17
        //   3196: iload 48
        //   3198: istore 45
        //   3200: iload 46
        //   3202: istore 49
        //   3204: iload 4
        //   3206: istore 8
        //   3208: iload 9
        //   3210: istore 10
        //   3212: iload 5
        //   3214: istore_2
        //   3215: iload 12
        //   3217: istore 11
        //   3219: iload_3
        //   3220: istore 13
        //   3222: iload 48
        //   3224: istore 44
        //   3226: iload 46
        //   3228: istore 47
        //   3230: aload 71
        //   3232: iconst_0
        //   3233: invokevirtual 95	org/vidogram/SQLite/SQLiteCursor:b	(I)I
        //   3236: i2l
        //   3237: lstore 69
        //   3239: lload 69
        //   3241: lstore 67
        //   3243: iload 19
        //   3245: ifeq +14 -> 3259
        //   3248: lload 69
        //   3250: iload 19
        //   3252: i2l
        //   3253: bipush 32
        //   3255: lshl
        //   3256: lor
        //   3257: lstore 67
        //   3259: iload 4
        //   3261: istore 14
        //   3263: iload 9
        //   3265: istore 15
        //   3267: iload 5
        //   3269: istore 6
        //   3271: iload 12
        //   3273: istore 16
        //   3275: iload_3
        //   3276: istore 17
        //   3278: iload 48
        //   3280: istore 45
        //   3282: iload 46
        //   3284: istore 49
        //   3286: iload 4
        //   3288: istore 8
        //   3290: iload 9
        //   3292: istore 10
        //   3294: iload 5
        //   3296: istore_2
        //   3297: iload 12
        //   3299: istore 11
        //   3301: iload_3
        //   3302: istore 13
        //   3304: iload 48
        //   3306: istore 44
        //   3308: iload 46
        //   3310: istore 47
        //   3312: aload 71
        //   3314: invokevirtual 97	org/vidogram/SQLite/SQLiteCursor:b	()V
        //   3317: lload 63
        //   3319: lconst_0
        //   3320: lcmp
        //   3321: ifne +12308 -> 15629
        //   3324: lload 67
        //   3326: lconst_1
        //   3327: lcmp
        //   3328: ifeq +4610 -> 7938
        //   3331: goto +12298 -> 15629
        //   3334: iload 4
        //   3336: istore 14
        //   3338: iload 9
        //   3340: istore 15
        //   3342: iload 5
        //   3344: istore 6
        //   3346: iload 12
        //   3348: istore 16
        //   3350: iload_3
        //   3351: istore 17
        //   3353: iload 48
        //   3355: istore 45
        //   3357: iload 46
        //   3359: istore 49
        //   3361: iload 4
        //   3363: istore 8
        //   3365: iload 9
        //   3367: istore 10
        //   3369: iload 5
        //   3371: istore_2
        //   3372: iload 12
        //   3374: istore 11
        //   3376: iload_3
        //   3377: istore 13
        //   3379: iload 48
        //   3381: istore 44
        //   3383: iload 46
        //   3385: istore 47
        //   3387: aload_0
        //   3388: getfield 29	org/vidogram/messenger/w$28:i	Lorg/vidogram/messenger/w;
        //   3391: invokestatic 66	org/vidogram/messenger/w:a	(Lorg/vidogram/messenger/w;)Lorg/vidogram/SQLite/SQLiteDatabase;
        //   3394: getstatic 103	java/util/Locale:US	Ljava/util/Locale;
        //   3397: ldc 142
        //   3399: bipush 8
        //   3401: anewarray 4	java/lang/Object
        //   3404: dup
        //   3405: iconst_0
        //   3406: aload_0
        //   3407: getfield 37	org/vidogram/messenger/w$28:d	J
        //   3410: invokestatic 111	java/lang/Long:valueOf	(J)Ljava/lang/Long;
        //   3413: aastore
        //   3414: dup
        //   3415: iconst_1
        //   3416: lload 65
        //   3418: invokestatic 111	java/lang/Long:valueOf	(J)Ljava/lang/Long;
        //   3421: aastore
        //   3422: dup
        //   3423: iconst_2
        //   3424: lload 67
        //   3426: invokestatic 111	java/lang/Long:valueOf	(J)Ljava/lang/Long;
        //   3429: aastore
        //   3430: dup
        //   3431: iconst_3
        //   3432: iload 4
        //   3434: iconst_2
        //   3435: idiv
        //   3436: invokestatic 124	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   3439: aastore
        //   3440: dup
        //   3441: iconst_4
        //   3442: aload_0
        //   3443: getfield 37	org/vidogram/messenger/w$28:d	J
        //   3446: invokestatic 111	java/lang/Long:valueOf	(J)Ljava/lang/Long;
        //   3449: aastore
        //   3450: dup
        //   3451: iconst_5
        //   3452: lload 65
        //   3454: invokestatic 111	java/lang/Long:valueOf	(J)Ljava/lang/Long;
        //   3457: aastore
        //   3458: dup
        //   3459: bipush 6
        //   3461: lload 69
        //   3463: invokestatic 111	java/lang/Long:valueOf	(J)Ljava/lang/Long;
        //   3466: aastore
        //   3467: dup
        //   3468: bipush 7
        //   3470: iload 4
        //   3472: iconst_2
        //   3473: idiv
        //   3474: invokestatic 124	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   3477: aastore
        //   3478: invokestatic 117	java/lang/String:format	(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   3481: iconst_0
        //   3482: anewarray 4	java/lang/Object
        //   3485: invokevirtual 87	org/vidogram/SQLite/SQLiteDatabase:b	(Ljava/lang/String;[Ljava/lang/Object;)Lorg/vidogram/SQLite/SQLiteCursor;
        //   3488: astore 71
        //   3490: goto +12175 -> 15665
        //   3493: iload 4
        //   3495: istore 14
        //   3497: iload 9
        //   3499: istore 15
        //   3501: iload 5
        //   3503: istore 6
        //   3505: iload 12
        //   3507: istore 16
        //   3509: iload_3
        //   3510: istore 17
        //   3512: iload 48
        //   3514: istore 45
        //   3516: iload 46
        //   3518: istore 49
        //   3520: iload 4
        //   3522: istore 8
        //   3524: iload 9
        //   3526: istore 10
        //   3528: iload 5
        //   3530: istore_2
        //   3531: iload 12
        //   3533: istore 11
        //   3535: iload_3
        //   3536: istore 13
        //   3538: iload 48
        //   3540: istore 44
        //   3542: iload 46
        //   3544: istore 47
        //   3546: aload 71
        //   3548: invokevirtual 92	org/vidogram/SQLite/SQLiteCursor:a	()Z
        //   3551: ifeq +8767 -> 12318
        //   3554: iload 4
        //   3556: istore 14
        //   3558: iload 9
        //   3560: istore 15
        //   3562: iload 5
        //   3564: istore 6
        //   3566: iload 12
        //   3568: istore 16
        //   3570: iload_3
        //   3571: istore 17
        //   3573: iload 48
        //   3575: istore 45
        //   3577: iload 46
        //   3579: istore 49
        //   3581: iload 4
        //   3583: istore 8
        //   3585: iload 9
        //   3587: istore 10
        //   3589: iload 5
        //   3591: istore_2
        //   3592: iload 12
        //   3594: istore 11
        //   3596: iload_3
        //   3597: istore 13
        //   3599: iload 48
        //   3601: istore 44
        //   3603: iload 46
        //   3605: istore 47
        //   3607: aload 71
        //   3609: iconst_1
        //   3610: invokevirtual 145	org/vidogram/SQLite/SQLiteCursor:g	(I)Lorg/vidogram/tgnet/NativeByteBuffer;
        //   3613: astore 72
        //   3615: aload 72
        //   3617: ifnull -124 -> 3493
        //   3620: iload 4
        //   3622: istore 14
        //   3624: iload 9
        //   3626: istore 15
        //   3628: iload 5
        //   3630: istore 6
        //   3632: iload 12
        //   3634: istore 16
        //   3636: iload_3
        //   3637: istore 17
        //   3639: iload 48
        //   3641: istore 45
        //   3643: iload 46
        //   3645: istore 49
        //   3647: iload 4
        //   3649: istore 8
        //   3651: iload 9
        //   3653: istore 10
        //   3655: iload 5
        //   3657: istore_2
        //   3658: iload 12
        //   3660: istore 11
        //   3662: iload_3
        //   3663: istore 13
        //   3665: iload 48
        //   3667: istore 44
        //   3669: iload 46
        //   3671: istore 47
        //   3673: aload 72
        //   3675: aload 72
        //   3677: iconst_0
        //   3678: invokevirtual 150	org/vidogram/tgnet/NativeByteBuffer:b	(Z)I
        //   3681: iconst_0
        //   3682: invokestatic 155	org/vidogram/tgnet/g$ar:a	(Lorg/vidogram/tgnet/a;IZ)Lorg/vidogram/tgnet/g$ar;
        //   3685: astore 80
        //   3687: iload 4
        //   3689: istore 14
        //   3691: iload 9
        //   3693: istore 15
        //   3695: iload 5
        //   3697: istore 6
        //   3699: iload 12
        //   3701: istore 16
        //   3703: iload_3
        //   3704: istore 17
        //   3706: iload 48
        //   3708: istore 45
        //   3710: iload 46
        //   3712: istore 49
        //   3714: iload 4
        //   3716: istore 8
        //   3718: iload 9
        //   3720: istore 10
        //   3722: iload 5
        //   3724: istore_2
        //   3725: iload 12
        //   3727: istore 11
        //   3729: iload_3
        //   3730: istore 13
        //   3732: iload 48
        //   3734: istore 44
        //   3736: iload 46
        //   3738: istore 47
        //   3740: aload 72
        //   3742: invokevirtual 157	org/vidogram/tgnet/NativeByteBuffer:e	()V
        //   3745: iload 4
        //   3747: istore 14
        //   3749: iload 9
        //   3751: istore 15
        //   3753: iload 5
        //   3755: istore 6
        //   3757: iload 12
        //   3759: istore 16
        //   3761: iload_3
        //   3762: istore 17
        //   3764: iload 48
        //   3766: istore 45
        //   3768: iload 46
        //   3770: istore 49
        //   3772: iload 4
        //   3774: istore 8
        //   3776: iload 9
        //   3778: istore 10
        //   3780: iload 5
        //   3782: istore_2
        //   3783: iload 12
        //   3785: istore 11
        //   3787: iload_3
        //   3788: istore 13
        //   3790: iload 48
        //   3792: istore 44
        //   3794: iload 46
        //   3796: istore 47
        //   3798: aload 80
        //   3800: aload 71
        //   3802: iconst_0
        //   3803: invokevirtual 95	org/vidogram/SQLite/SQLiteCursor:b	(I)I
        //   3806: invokestatic 162	org/vidogram/messenger/u:a	(Lorg/vidogram/tgnet/g$ar;I)V
        //   3809: iload 4
        //   3811: istore 14
        //   3813: iload 9
        //   3815: istore 15
        //   3817: iload 5
        //   3819: istore 6
        //   3821: iload 12
        //   3823: istore 16
        //   3825: iload_3
        //   3826: istore 17
        //   3828: iload 48
        //   3830: istore 45
        //   3832: iload 46
        //   3834: istore 49
        //   3836: iload 4
        //   3838: istore 8
        //   3840: iload 9
        //   3842: istore 10
        //   3844: iload 5
        //   3846: istore_2
        //   3847: iload 12
        //   3849: istore 11
        //   3851: iload_3
        //   3852: istore 13
        //   3854: iload 48
        //   3856: istore 44
        //   3858: iload 46
        //   3860: istore 47
        //   3862: aload 80
        //   3864: aload 71
        //   3866: iconst_3
        //   3867: invokevirtual 95	org/vidogram/SQLite/SQLiteCursor:b	(I)I
        //   3870: putfield 163	org/vidogram/tgnet/g$ar:b	I
        //   3873: iload 4
        //   3875: istore 14
        //   3877: iload 9
        //   3879: istore 15
        //   3881: iload 5
        //   3883: istore 6
        //   3885: iload 12
        //   3887: istore 16
        //   3889: iload_3
        //   3890: istore 17
        //   3892: iload 48
        //   3894: istore 45
        //   3896: iload 46
        //   3898: istore 49
        //   3900: iload 4
        //   3902: istore 8
        //   3904: iload 9
        //   3906: istore 10
        //   3908: iload 5
        //   3910: istore_2
        //   3911: iload 12
        //   3913: istore 11
        //   3915: iload_3
        //   3916: istore 13
        //   3918: iload 48
        //   3920: istore 44
        //   3922: iload 46
        //   3924: istore 47
        //   3926: aload 80
        //   3928: aload 71
        //   3930: iconst_4
        //   3931: invokevirtual 95	org/vidogram/SQLite/SQLiteCursor:b	(I)I
        //   3934: putfield 164	org/vidogram/tgnet/g$ar:e	I
        //   3937: iload 4
        //   3939: istore 14
        //   3941: iload 9
        //   3943: istore 15
        //   3945: iload 5
        //   3947: istore 6
        //   3949: iload 12
        //   3951: istore 16
        //   3953: iload_3
        //   3954: istore 17
        //   3956: iload 48
        //   3958: istore 45
        //   3960: iload 46
        //   3962: istore 49
        //   3964: iload 4
        //   3966: istore 8
        //   3968: iload 9
        //   3970: istore 10
        //   3972: iload 5
        //   3974: istore_2
        //   3975: iload 12
        //   3977: istore 11
        //   3979: iload_3
        //   3980: istore 13
        //   3982: iload 48
        //   3984: istore 44
        //   3986: iload 46
        //   3988: istore 47
        //   3990: aload 80
        //   3992: aload_0
        //   3993: getfield 37	org/vidogram/messenger/w$28:d	J
        //   3996: putfield 167	org/vidogram/tgnet/g$ar:E	J
        //   3999: iload 4
        //   4001: istore 14
        //   4003: iload 9
        //   4005: istore 15
        //   4007: iload 5
        //   4009: istore 6
        //   4011: iload 12
        //   4013: istore 16
        //   4015: iload_3
        //   4016: istore 17
        //   4018: iload 48
        //   4020: istore 45
        //   4022: iload 46
        //   4024: istore 49
        //   4026: iload 4
        //   4028: istore 8
        //   4030: iload 9
        //   4032: istore 10
        //   4034: iload 5
        //   4036: istore_2
        //   4037: iload 12
        //   4039: istore 11
        //   4041: iload_3
        //   4042: istore 13
        //   4044: iload 48
        //   4046: istore 44
        //   4048: iload 46
        //   4050: istore 47
        //   4052: aload 80
        //   4054: getfield 170	org/vidogram/tgnet/g$ar:k	I
        //   4057: sipush 1024
        //   4060: iand
        //   4061: ifeq +68 -> 4129
        //   4064: iload 4
        //   4066: istore 14
        //   4068: iload 9
        //   4070: istore 15
        //   4072: iload 5
        //   4074: istore 6
        //   4076: iload 12
        //   4078: istore 16
        //   4080: iload_3
        //   4081: istore 17
        //   4083: iload 48
        //   4085: istore 45
        //   4087: iload 46
        //   4089: istore 49
        //   4091: iload 4
        //   4093: istore 8
        //   4095: iload 9
        //   4097: istore 10
        //   4099: iload 5
        //   4101: istore_2
        //   4102: iload 12
        //   4104: istore 11
        //   4106: iload_3
        //   4107: istore 13
        //   4109: iload 48
        //   4111: istore 44
        //   4113: iload 46
        //   4115: istore 47
        //   4117: aload 80
        //   4119: aload 71
        //   4121: bipush 7
        //   4123: invokevirtual 95	org/vidogram/SQLite/SQLiteCursor:b	(I)I
        //   4126: putfield 173	org/vidogram/tgnet/g$ar:s	I
        //   4129: iload 43
        //   4131: ifeq +68 -> 4199
        //   4134: iload 4
        //   4136: istore 14
        //   4138: iload 9
        //   4140: istore 15
        //   4142: iload 5
        //   4144: istore 6
        //   4146: iload 12
        //   4148: istore 16
        //   4150: iload_3
        //   4151: istore 17
        //   4153: iload 48
        //   4155: istore 45
        //   4157: iload 46
        //   4159: istore 49
        //   4161: iload 4
        //   4163: istore 8
        //   4165: iload 9
        //   4167: istore 10
        //   4169: iload 5
        //   4171: istore_2
        //   4172: iload 12
        //   4174: istore 11
        //   4176: iload_3
        //   4177: istore 13
        //   4179: iload 48
        //   4181: istore 44
        //   4183: iload 46
        //   4185: istore 47
        //   4187: aload 80
        //   4189: aload 71
        //   4191: bipush 8
        //   4193: invokevirtual 95	org/vidogram/SQLite/SQLiteCursor:b	(I)I
        //   4196: putfield 176	org/vidogram/tgnet/g$ar:F	I
        //   4199: iload 4
        //   4201: istore 14
        //   4203: iload 9
        //   4205: istore 15
        //   4207: iload 5
        //   4209: istore 6
        //   4211: iload 12
        //   4213: istore 16
        //   4215: iload_3
        //   4216: istore 17
        //   4218: iload 48
        //   4220: istore 45
        //   4222: iload 46
        //   4224: istore 49
        //   4226: iload 4
        //   4228: istore 8
        //   4230: iload 9
        //   4232: istore 10
        //   4234: iload 5
        //   4236: istore_2
        //   4237: iload 12
        //   4239: istore 11
        //   4241: iload_3
        //   4242: istore 13
        //   4244: iload 48
        //   4246: istore 44
        //   4248: iload 46
        //   4250: istore 47
        //   4252: aload 74
        //   4254: getfield 179	org/vidogram/tgnet/g$qi:c	Ljava/util/ArrayList;
        //   4257: aload 80
        //   4259: invokevirtual 183	java/util/ArrayList:add	(Ljava/lang/Object;)Z
        //   4262: pop
        //   4263: iload 4
        //   4265: istore 14
        //   4267: iload 9
        //   4269: istore 15
        //   4271: iload 5
        //   4273: istore 6
        //   4275: iload 12
        //   4277: istore 16
        //   4279: iload_3
        //   4280: istore 17
        //   4282: iload 48
        //   4284: istore 45
        //   4286: iload 46
        //   4288: istore 49
        //   4290: iload 4
        //   4292: istore 8
        //   4294: iload 9
        //   4296: istore 10
        //   4298: iload 5
        //   4300: istore_2
        //   4301: iload 12
        //   4303: istore 11
        //   4305: iload_3
        //   4306: istore 13
        //   4308: iload 48
        //   4310: istore 44
        //   4312: iload 46
        //   4314: istore 47
        //   4316: aload 80
        //   4318: aload 75
        //   4320: aload 76
        //   4322: invokestatic 186	org/vidogram/messenger/w:a	(Lorg/vidogram/tgnet/g$ar;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
        //   4325: iload 4
        //   4327: istore 14
        //   4329: iload 9
        //   4331: istore 15
        //   4333: iload 5
        //   4335: istore 6
        //   4337: iload 12
        //   4339: istore 16
        //   4341: iload_3
        //   4342: istore 17
        //   4344: iload 48
        //   4346: istore 45
        //   4348: iload 46
        //   4350: istore 49
        //   4352: iload 4
        //   4354: istore 8
        //   4356: iload 9
        //   4358: istore 10
        //   4360: iload 5
        //   4362: istore_2
        //   4363: iload 12
        //   4365: istore 11
        //   4367: iload_3
        //   4368: istore 13
        //   4370: iload 48
        //   4372: istore 44
        //   4374: iload 46
        //   4376: istore 47
        //   4378: aload 80
        //   4380: getfield 187	org/vidogram/tgnet/g$ar:g	I
        //   4383: ifne +66 -> 4449
        //   4386: iload 4
        //   4388: istore 14
        //   4390: iload 9
        //   4392: istore 15
        //   4394: iload 5
        //   4396: istore 6
        //   4398: iload 12
        //   4400: istore 16
        //   4402: iload_3
        //   4403: istore 17
        //   4405: iload 48
        //   4407: istore 45
        //   4409: iload 46
        //   4411: istore 49
        //   4413: iload 4
        //   4415: istore 8
        //   4417: iload 9
        //   4419: istore 10
        //   4421: iload 5
        //   4423: istore_2
        //   4424: iload 12
        //   4426: istore 11
        //   4428: iload_3
        //   4429: istore 13
        //   4431: iload 48
        //   4433: istore 44
        //   4435: iload 46
        //   4437: istore 47
        //   4439: aload 80
        //   4441: getfield 189	org/vidogram/tgnet/g$ar:h	J
        //   4444: lconst_0
        //   4445: lcmp
        //   4446: ifeq +1110 -> 5556
        //   4449: iload 4
        //   4451: istore 14
        //   4453: iload 9
        //   4455: istore 15
        //   4457: iload 5
        //   4459: istore 6
        //   4461: iload 12
        //   4463: istore 16
        //   4465: iload_3
        //   4466: istore 17
        //   4468: iload 48
        //   4470: istore 45
        //   4472: iload 46
        //   4474: istore 49
        //   4476: iload 4
        //   4478: istore 8
        //   4480: iload 9
        //   4482: istore 10
        //   4484: iload 5
        //   4486: istore_2
        //   4487: iload 12
        //   4489: istore 11
        //   4491: iload_3
        //   4492: istore 13
        //   4494: iload 48
        //   4496: istore 44
        //   4498: iload 46
        //   4500: istore 47
        //   4502: aload 71
        //   4504: bipush 6
        //   4506: invokevirtual 192	org/vidogram/SQLite/SQLiteCursor:a	(I)Z
        //   4509: ifne +324 -> 4833
        //   4512: iload 4
        //   4514: istore 14
        //   4516: iload 9
        //   4518: istore 15
        //   4520: iload 5
        //   4522: istore 6
        //   4524: iload 12
        //   4526: istore 16
        //   4528: iload_3
        //   4529: istore 17
        //   4531: iload 48
        //   4533: istore 45
        //   4535: iload 46
        //   4537: istore 49
        //   4539: iload 4
        //   4541: istore 8
        //   4543: iload 9
        //   4545: istore 10
        //   4547: iload 5
        //   4549: istore_2
        //   4550: iload 12
        //   4552: istore 11
        //   4554: iload_3
        //   4555: istore 13
        //   4557: iload 48
        //   4559: istore 44
        //   4561: iload 46
        //   4563: istore 47
        //   4565: aload 71
        //   4567: bipush 6
        //   4569: invokevirtual 145	org/vidogram/SQLite/SQLiteCursor:g	(I)Lorg/vidogram/tgnet/NativeByteBuffer;
        //   4572: astore 72
        //   4574: aload 72
        //   4576: ifnull +257 -> 4833
        //   4579: iload 4
        //   4581: istore 14
        //   4583: iload 9
        //   4585: istore 15
        //   4587: iload 5
        //   4589: istore 6
        //   4591: iload 12
        //   4593: istore 16
        //   4595: iload_3
        //   4596: istore 17
        //   4598: iload 48
        //   4600: istore 45
        //   4602: iload 46
        //   4604: istore 49
        //   4606: iload 4
        //   4608: istore 8
        //   4610: iload 9
        //   4612: istore 10
        //   4614: iload 5
        //   4616: istore_2
        //   4617: iload 12
        //   4619: istore 11
        //   4621: iload_3
        //   4622: istore 13
        //   4624: iload 48
        //   4626: istore 44
        //   4628: iload 46
        //   4630: istore 47
        //   4632: aload 80
        //   4634: aload 72
        //   4636: aload 72
        //   4638: iconst_0
        //   4639: invokevirtual 150	org/vidogram/tgnet/NativeByteBuffer:b	(Z)I
        //   4642: iconst_0
        //   4643: invokestatic 155	org/vidogram/tgnet/g$ar:a	(Lorg/vidogram/tgnet/a;IZ)Lorg/vidogram/tgnet/g$ar;
        //   4646: putfield 196	org/vidogram/tgnet/g$ar:K	Lorg/vidogram/tgnet/g$ar;
        //   4649: iload 4
        //   4651: istore 14
        //   4653: iload 9
        //   4655: istore 15
        //   4657: iload 5
        //   4659: istore 6
        //   4661: iload 12
        //   4663: istore 16
        //   4665: iload_3
        //   4666: istore 17
        //   4668: iload 48
        //   4670: istore 45
        //   4672: iload 46
        //   4674: istore 49
        //   4676: iload 4
        //   4678: istore 8
        //   4680: iload 9
        //   4682: istore 10
        //   4684: iload 5
        //   4686: istore_2
        //   4687: iload 12
        //   4689: istore 11
        //   4691: iload_3
        //   4692: istore 13
        //   4694: iload 48
        //   4696: istore 44
        //   4698: iload 46
        //   4700: istore 47
        //   4702: aload 72
        //   4704: invokevirtual 157	org/vidogram/tgnet/NativeByteBuffer:e	()V
        //   4707: iload 4
        //   4709: istore 14
        //   4711: iload 9
        //   4713: istore 15
        //   4715: iload 5
        //   4717: istore 6
        //   4719: iload 12
        //   4721: istore 16
        //   4723: iload_3
        //   4724: istore 17
        //   4726: iload 48
        //   4728: istore 45
        //   4730: iload 46
        //   4732: istore 49
        //   4734: iload 4
        //   4736: istore 8
        //   4738: iload 9
        //   4740: istore 10
        //   4742: iload 5
        //   4744: istore_2
        //   4745: iload 12
        //   4747: istore 11
        //   4749: iload_3
        //   4750: istore 13
        //   4752: iload 48
        //   4754: istore 44
        //   4756: iload 46
        //   4758: istore 47
        //   4760: aload 80
        //   4762: getfield 196	org/vidogram/tgnet/g$ar:K	Lorg/vidogram/tgnet/g$ar;
        //   4765: ifnull +68 -> 4833
        //   4768: iload 4
        //   4770: istore 14
        //   4772: iload 9
        //   4774: istore 15
        //   4776: iload 5
        //   4778: istore 6
        //   4780: iload 12
        //   4782: istore 16
        //   4784: iload_3
        //   4785: istore 17
        //   4787: iload 48
        //   4789: istore 45
        //   4791: iload 46
        //   4793: istore 49
        //   4795: iload 4
        //   4797: istore 8
        //   4799: iload 9
        //   4801: istore 10
        //   4803: iload 5
        //   4805: istore_2
        //   4806: iload 12
        //   4808: istore 11
        //   4810: iload_3
        //   4811: istore 13
        //   4813: iload 48
        //   4815: istore 44
        //   4817: iload 46
        //   4819: istore 47
        //   4821: aload 80
        //   4823: getfield 196	org/vidogram/tgnet/g$ar:K	Lorg/vidogram/tgnet/g$ar;
        //   4826: aload 75
        //   4828: aload 76
        //   4830: invokestatic 186	org/vidogram/messenger/w:a	(Lorg/vidogram/tgnet/g$ar;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
        //   4833: iload 4
        //   4835: istore 14
        //   4837: iload 9
        //   4839: istore 15
        //   4841: iload 5
        //   4843: istore 6
        //   4845: iload 12
        //   4847: istore 16
        //   4849: iload_3
        //   4850: istore 17
        //   4852: iload 48
        //   4854: istore 45
        //   4856: iload 46
        //   4858: istore 49
        //   4860: iload 4
        //   4862: istore 8
        //   4864: iload 9
        //   4866: istore 10
        //   4868: iload 5
        //   4870: istore_2
        //   4871: iload 12
        //   4873: istore 11
        //   4875: iload_3
        //   4876: istore 13
        //   4878: iload 48
        //   4880: istore 44
        //   4882: iload 46
        //   4884: istore 47
        //   4886: aload 80
        //   4888: getfield 196	org/vidogram/tgnet/g$ar:K	Lorg/vidogram/tgnet/g$ar;
        //   4891: ifnonnull +665 -> 5556
        //   4894: iload 4
        //   4896: istore 14
        //   4898: iload 9
        //   4900: istore 15
        //   4902: iload 5
        //   4904: istore 6
        //   4906: iload 12
        //   4908: istore 16
        //   4910: iload_3
        //   4911: istore 17
        //   4913: iload 48
        //   4915: istore 45
        //   4917: iload 46
        //   4919: istore 49
        //   4921: iload 4
        //   4923: istore 8
        //   4925: iload 9
        //   4927: istore 10
        //   4929: iload 5
        //   4931: istore_2
        //   4932: iload 12
        //   4934: istore 11
        //   4936: iload_3
        //   4937: istore 13
        //   4939: iload 48
        //   4941: istore 44
        //   4943: iload 46
        //   4945: istore 47
        //   4947: aload 80
        //   4949: getfield 187	org/vidogram/tgnet/g$ar:g	I
        //   4952: ifeq +6955 -> 11907
        //   4955: iload 4
        //   4957: istore 14
        //   4959: iload 9
        //   4961: istore 15
        //   4963: iload 5
        //   4965: istore 6
        //   4967: iload 12
        //   4969: istore 16
        //   4971: iload_3
        //   4972: istore 17
        //   4974: iload 48
        //   4976: istore 45
        //   4978: iload 46
        //   4980: istore 49
        //   4982: iload 4
        //   4984: istore 8
        //   4986: iload 9
        //   4988: istore 10
        //   4990: iload 5
        //   4992: istore_2
        //   4993: iload 12
        //   4995: istore 11
        //   4997: iload_3
        //   4998: istore 13
        //   5000: iload 48
        //   5002: istore 44
        //   5004: iload 46
        //   5006: istore 47
        //   5008: aload 80
        //   5010: getfield 187	org/vidogram/tgnet/g$ar:g	I
        //   5013: i2l
        //   5014: lstore 65
        //   5016: lload 65
        //   5018: lstore 63
        //   5020: iload 4
        //   5022: istore 14
        //   5024: iload 9
        //   5026: istore 15
        //   5028: iload 5
        //   5030: istore 6
        //   5032: iload 12
        //   5034: istore 16
        //   5036: iload_3
        //   5037: istore 17
        //   5039: iload 48
        //   5041: istore 45
        //   5043: iload 46
        //   5045: istore 49
        //   5047: iload 4
        //   5049: istore 8
        //   5051: iload 9
        //   5053: istore 10
        //   5055: iload 5
        //   5057: istore_2
        //   5058: iload 12
        //   5060: istore 11
        //   5062: iload_3
        //   5063: istore 13
        //   5065: iload 48
        //   5067: istore 44
        //   5069: iload 46
        //   5071: istore 47
        //   5073: aload 80
        //   5075: getfield 199	org/vidogram/tgnet/g$ar:d	Lorg/vidogram/tgnet/g$aw;
        //   5078: getfield 202	org/vidogram/tgnet/g$aw:b	I
        //   5081: ifeq +73 -> 5154
        //   5084: iload 4
        //   5086: istore 14
        //   5088: iload 9
        //   5090: istore 15
        //   5092: iload 5
        //   5094: istore 6
        //   5096: iload 12
        //   5098: istore 16
        //   5100: iload_3
        //   5101: istore 17
        //   5103: iload 48
        //   5105: istore 45
        //   5107: iload 46
        //   5109: istore 49
        //   5111: iload 4
        //   5113: istore 8
        //   5115: iload 9
        //   5117: istore 10
        //   5119: iload 5
        //   5121: istore_2
        //   5122: iload 12
        //   5124: istore 11
        //   5126: iload_3
        //   5127: istore 13
        //   5129: iload 48
        //   5131: istore 44
        //   5133: iload 46
        //   5135: istore 47
        //   5137: lload 65
        //   5139: aload 80
        //   5141: getfield 199	org/vidogram/tgnet/g$ar:d	Lorg/vidogram/tgnet/g$aw;
        //   5144: getfield 202	org/vidogram/tgnet/g$aw:b	I
        //   5147: i2l
        //   5148: bipush 32
        //   5150: lshl
        //   5151: lor
        //   5152: lstore 63
        //   5154: iload 4
        //   5156: istore 14
        //   5158: iload 9
        //   5160: istore 15
        //   5162: iload 5
        //   5164: istore 6
        //   5166: iload 12
        //   5168: istore 16
        //   5170: iload_3
        //   5171: istore 17
        //   5173: iload 48
        //   5175: istore 45
        //   5177: iload 46
        //   5179: istore 49
        //   5181: iload 4
        //   5183: istore 8
        //   5185: iload 9
        //   5187: istore 10
        //   5189: iload 5
        //   5191: istore_2
        //   5192: iload 12
        //   5194: istore 11
        //   5196: iload_3
        //   5197: istore 13
        //   5199: iload 48
        //   5201: istore 44
        //   5203: iload 46
        //   5205: istore 47
        //   5207: aload 79
        //   5209: lload 63
        //   5211: invokestatic 111	java/lang/Long:valueOf	(J)Ljava/lang/Long;
        //   5214: invokevirtual 205	java/util/ArrayList:contains	(Ljava/lang/Object;)Z
        //   5217: ifne +67 -> 5284
        //   5220: iload 4
        //   5222: istore 14
        //   5224: iload 9
        //   5226: istore 15
        //   5228: iload 5
        //   5230: istore 6
        //   5232: iload 12
        //   5234: istore 16
        //   5236: iload_3
        //   5237: istore 17
        //   5239: iload 48
        //   5241: istore 45
        //   5243: iload 46
        //   5245: istore 49
        //   5247: iload 4
        //   5249: istore 8
        //   5251: iload 9
        //   5253: istore 10
        //   5255: iload 5
        //   5257: istore_2
        //   5258: iload 12
        //   5260: istore 11
        //   5262: iload_3
        //   5263: istore 13
        //   5265: iload 48
        //   5267: istore 44
        //   5269: iload 46
        //   5271: istore 47
        //   5273: aload 79
        //   5275: lload 63
        //   5277: invokestatic 111	java/lang/Long:valueOf	(J)Ljava/lang/Long;
        //   5280: invokevirtual 183	java/util/ArrayList:add	(Ljava/lang/Object;)Z
        //   5283: pop
        //   5284: iload 4
        //   5286: istore 14
        //   5288: iload 9
        //   5290: istore 15
        //   5292: iload 5
        //   5294: istore 6
        //   5296: iload 12
        //   5298: istore 16
        //   5300: iload_3
        //   5301: istore 17
        //   5303: iload 48
        //   5305: istore 45
        //   5307: iload 46
        //   5309: istore 49
        //   5311: iload 4
        //   5313: istore 8
        //   5315: iload 9
        //   5317: istore 10
        //   5319: iload 5
        //   5321: istore_2
        //   5322: iload 12
        //   5324: istore 11
        //   5326: iload_3
        //   5327: istore 13
        //   5329: iload 48
        //   5331: istore 44
        //   5333: iload 46
        //   5335: istore 47
        //   5337: aload 77
        //   5339: aload 80
        //   5341: getfield 187	org/vidogram/tgnet/g$ar:g	I
        //   5344: invokestatic 124	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   5347: invokevirtual 209	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
        //   5350: checkcast 59	java/util/ArrayList
        //   5353: astore 73
        //   5355: aload 73
        //   5357: astore 72
        //   5359: aload 73
        //   5361: ifnonnull +134 -> 5495
        //   5364: iload 4
        //   5366: istore 14
        //   5368: iload 9
        //   5370: istore 15
        //   5372: iload 5
        //   5374: istore 6
        //   5376: iload 12
        //   5378: istore 16
        //   5380: iload_3
        //   5381: istore 17
        //   5383: iload 48
        //   5385: istore 45
        //   5387: iload 46
        //   5389: istore 49
        //   5391: iload 4
        //   5393: istore 8
        //   5395: iload 9
        //   5397: istore 10
        //   5399: iload 5
        //   5401: istore_2
        //   5402: iload 12
        //   5404: istore 11
        //   5406: iload_3
        //   5407: istore 13
        //   5409: iload 48
        //   5411: istore 44
        //   5413: iload 46
        //   5415: istore 47
        //   5417: new 59	java/util/ArrayList
        //   5420: dup
        //   5421: invokespecial 60	java/util/ArrayList:<init>	()V
        //   5424: astore 72
        //   5426: iload 4
        //   5428: istore 14
        //   5430: iload 9
        //   5432: istore 15
        //   5434: iload 5
        //   5436: istore 6
        //   5438: iload 12
        //   5440: istore 16
        //   5442: iload_3
        //   5443: istore 17
        //   5445: iload 48
        //   5447: istore 45
        //   5449: iload 46
        //   5451: istore 49
        //   5453: iload 4
        //   5455: istore 8
        //   5457: iload 9
        //   5459: istore 10
        //   5461: iload 5
        //   5463: istore_2
        //   5464: iload 12
        //   5466: istore 11
        //   5468: iload_3
        //   5469: istore 13
        //   5471: iload 48
        //   5473: istore 44
        //   5475: iload 46
        //   5477: istore 47
        //   5479: aload 77
        //   5481: aload 80
        //   5483: getfield 187	org/vidogram/tgnet/g$ar:g	I
        //   5486: invokestatic 124	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   5489: aload 72
        //   5491: invokevirtual 213	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   5494: pop
        //   5495: iload 4
        //   5497: istore 14
        //   5499: iload 9
        //   5501: istore 15
        //   5503: iload 5
        //   5505: istore 6
        //   5507: iload 12
        //   5509: istore 16
        //   5511: iload_3
        //   5512: istore 17
        //   5514: iload 48
        //   5516: istore 45
        //   5518: iload 46
        //   5520: istore 49
        //   5522: iload 4
        //   5524: istore 8
        //   5526: iload 9
        //   5528: istore 10
        //   5530: iload 5
        //   5532: istore_2
        //   5533: iload 12
        //   5535: istore 11
        //   5537: iload_3
        //   5538: istore 13
        //   5540: iload 48
        //   5542: istore 44
        //   5544: iload 46
        //   5546: istore 47
        //   5548: aload 72
        //   5550: aload 80
        //   5552: invokevirtual 183	java/util/ArrayList:add	(Ljava/lang/Object;)Z
        //   5555: pop
        //   5556: iload 4
        //   5558: istore 14
        //   5560: iload 9
        //   5562: istore 15
        //   5564: iload 5
        //   5566: istore 6
        //   5568: iload 12
        //   5570: istore 16
        //   5572: iload_3
        //   5573: istore 17
        //   5575: iload 48
        //   5577: istore 45
        //   5579: iload 46
        //   5581: istore 49
        //   5583: iload 4
        //   5585: istore 8
        //   5587: iload 9
        //   5589: istore 10
        //   5591: iload 5
        //   5593: istore_2
        //   5594: iload 12
        //   5596: istore 11
        //   5598: iload_3
        //   5599: istore 13
        //   5601: iload 48
        //   5603: istore 44
        //   5605: iload 46
        //   5607: istore 47
        //   5609: aload 80
        //   5611: aload 71
        //   5613: iconst_2
        //   5614: invokevirtual 95	org/vidogram/SQLite/SQLiteCursor:b	(I)I
        //   5617: putfield 216	org/vidogram/tgnet/g$ar:y	I
        //   5620: iload 4
        //   5622: istore 14
        //   5624: iload 9
        //   5626: istore 15
        //   5628: iload 5
        //   5630: istore 6
        //   5632: iload 12
        //   5634: istore 16
        //   5636: iload_3
        //   5637: istore 17
        //   5639: iload 48
        //   5641: istore 45
        //   5643: iload 46
        //   5645: istore 49
        //   5647: iload 4
        //   5649: istore 8
        //   5651: iload 9
        //   5653: istore 10
        //   5655: iload 5
        //   5657: istore_2
        //   5658: iload 12
        //   5660: istore 11
        //   5662: iload_3
        //   5663: istore 13
        //   5665: iload 48
        //   5667: istore 44
        //   5669: iload 46
        //   5671: istore 47
        //   5673: aload 80
        //   5675: getfield 163	org/vidogram/tgnet/g$ar:b	I
        //   5678: ifle +123 -> 5801
        //   5681: iload 4
        //   5683: istore 14
        //   5685: iload 9
        //   5687: istore 15
        //   5689: iload 5
        //   5691: istore 6
        //   5693: iload 12
        //   5695: istore 16
        //   5697: iload_3
        //   5698: istore 17
        //   5700: iload 48
        //   5702: istore 45
        //   5704: iload 46
        //   5706: istore 49
        //   5708: iload 4
        //   5710: istore 8
        //   5712: iload 9
        //   5714: istore 10
        //   5716: iload 5
        //   5718: istore_2
        //   5719: iload 12
        //   5721: istore 11
        //   5723: iload_3
        //   5724: istore 13
        //   5726: iload 48
        //   5728: istore 44
        //   5730: iload 46
        //   5732: istore 47
        //   5734: aload 80
        //   5736: getfield 216	org/vidogram/tgnet/g$ar:y	I
        //   5739: ifeq +62 -> 5801
        //   5742: iload 4
        //   5744: istore 14
        //   5746: iload 9
        //   5748: istore 15
        //   5750: iload 5
        //   5752: istore 6
        //   5754: iload 12
        //   5756: istore 16
        //   5758: iload_3
        //   5759: istore 17
        //   5761: iload 48
        //   5763: istore 45
        //   5765: iload 46
        //   5767: istore 49
        //   5769: iload 4
        //   5771: istore 8
        //   5773: iload 9
        //   5775: istore 10
        //   5777: iload 5
        //   5779: istore_2
        //   5780: iload 12
        //   5782: istore 11
        //   5784: iload_3
        //   5785: istore 13
        //   5787: iload 48
        //   5789: istore 44
        //   5791: iload 46
        //   5793: istore 47
        //   5795: aload 80
        //   5797: iconst_0
        //   5798: putfield 216	org/vidogram/tgnet/g$ar:y	I
        //   5801: iload 43
        //   5803: ifne +129 -> 5932
        //   5806: iload 4
        //   5808: istore 14
        //   5810: iload 9
        //   5812: istore 15
        //   5814: iload 5
        //   5816: istore 6
        //   5818: iload 12
        //   5820: istore 16
        //   5822: iload_3
        //   5823: istore 17
        //   5825: iload 48
        //   5827: istore 45
        //   5829: iload 46
        //   5831: istore 49
        //   5833: iload 4
        //   5835: istore 8
        //   5837: iload 9
        //   5839: istore 10
        //   5841: iload 5
        //   5843: istore_2
        //   5844: iload 12
        //   5846: istore 11
        //   5848: iload_3
        //   5849: istore 13
        //   5851: iload 48
        //   5853: istore 44
        //   5855: iload 46
        //   5857: istore 47
        //   5859: aload 71
        //   5861: iconst_5
        //   5862: invokevirtual 192	org/vidogram/SQLite/SQLiteCursor:a	(I)Z
        //   5865: ifne +67 -> 5932
        //   5868: iload 4
        //   5870: istore 14
        //   5872: iload 9
        //   5874: istore 15
        //   5876: iload 5
        //   5878: istore 6
        //   5880: iload 12
        //   5882: istore 16
        //   5884: iload_3
        //   5885: istore 17
        //   5887: iload 48
        //   5889: istore 45
        //   5891: iload 46
        //   5893: istore 49
        //   5895: iload 4
        //   5897: istore 8
        //   5899: iload 9
        //   5901: istore 10
        //   5903: iload 5
        //   5905: istore_2
        //   5906: iload 12
        //   5908: istore 11
        //   5910: iload_3
        //   5911: istore 13
        //   5913: iload 48
        //   5915: istore 44
        //   5917: iload 46
        //   5919: istore 47
        //   5921: aload 80
        //   5923: aload 71
        //   5925: iconst_5
        //   5926: invokevirtual 219	org/vidogram/SQLite/SQLiteCursor:d	(I)J
        //   5929: putfield 222	org/vidogram/tgnet/g$ar:C	J
        //   5932: iload 4
        //   5934: istore 14
        //   5936: iload 9
        //   5938: istore 15
        //   5940: iload 5
        //   5942: istore 6
        //   5944: iload 12
        //   5946: istore 16
        //   5948: iload_3
        //   5949: istore 17
        //   5951: iload 48
        //   5953: istore 45
        //   5955: iload 46
        //   5957: istore 49
        //   5959: iload 4
        //   5961: istore 8
        //   5963: iload 9
        //   5965: istore 10
        //   5967: iload 5
        //   5969: istore_2
        //   5970: iload 12
        //   5972: istore 11
        //   5974: iload_3
        //   5975: istore 13
        //   5977: iload 48
        //   5979: istore 44
        //   5981: iload 46
        //   5983: istore 47
        //   5985: aload_0
        //   5986: getfield 37	org/vidogram/messenger/w$28:d	J
        //   5989: l2i
        //   5990: ifne -2497 -> 3493
        //   5993: iload 4
        //   5995: istore 14
        //   5997: iload 9
        //   5999: istore 15
        //   6001: iload 5
        //   6003: istore 6
        //   6005: iload 12
        //   6007: istore 16
        //   6009: iload_3
        //   6010: istore 17
        //   6012: iload 48
        //   6014: istore 45
        //   6016: iload 46
        //   6018: istore 49
        //   6020: iload 4
        //   6022: istore 8
        //   6024: iload 9
        //   6026: istore 10
        //   6028: iload 5
        //   6030: istore_2
        //   6031: iload 12
        //   6033: istore 11
        //   6035: iload_3
        //   6036: istore 13
        //   6038: iload 48
        //   6040: istore 44
        //   6042: iload 46
        //   6044: istore 47
        //   6046: aload 80
        //   6048: getfield 226	org/vidogram/tgnet/g$ar:j	Lorg/vidogram/tgnet/g$au;
        //   6051: ifnull -2558 -> 3493
        //   6054: iload 4
        //   6056: istore 14
        //   6058: iload 9
        //   6060: istore 15
        //   6062: iload 5
        //   6064: istore 6
        //   6066: iload 12
        //   6068: istore 16
        //   6070: iload_3
        //   6071: istore 17
        //   6073: iload 48
        //   6075: istore 45
        //   6077: iload 46
        //   6079: istore 49
        //   6081: iload 4
        //   6083: istore 8
        //   6085: iload 9
        //   6087: istore 10
        //   6089: iload 5
        //   6091: istore_2
        //   6092: iload 12
        //   6094: istore 11
        //   6096: iload_3
        //   6097: istore 13
        //   6099: iload 48
        //   6101: istore 44
        //   6103: iload 46
        //   6105: istore 47
        //   6107: aload 80
        //   6109: getfield 226	org/vidogram/tgnet/g$ar:j	Lorg/vidogram/tgnet/g$au;
        //   6112: getfield 231	org/vidogram/tgnet/g$au:d	Lorg/vidogram/tgnet/g$ay;
        //   6115: astore 72
        //   6117: aload 72
        //   6119: ifnull -2626 -> 3493
        //   6122: iload 4
        //   6124: istore 8
        //   6126: iload 9
        //   6128: istore 10
        //   6130: iload 5
        //   6132: istore_2
        //   6133: iload 12
        //   6135: istore 11
        //   6137: iload_3
        //   6138: istore 13
        //   6140: iload 48
        //   6142: istore 44
        //   6144: iload 46
        //   6146: istore 47
        //   6148: aload_0
        //   6149: getfield 29	org/vidogram/messenger/w$28:i	Lorg/vidogram/messenger/w;
        //   6152: invokestatic 66	org/vidogram/messenger/w:a	(Lorg/vidogram/messenger/w;)Lorg/vidogram/SQLite/SQLiteDatabase;
        //   6155: getstatic 103	java/util/Locale:US	Ljava/util/Locale;
        //   6158: ldc 233
        //   6160: iconst_1
        //   6161: anewarray 4	java/lang/Object
        //   6164: dup
        //   6165: iconst_0
        //   6166: aload 80
        //   6168: getfield 163	org/vidogram/tgnet/g$ar:b	I
        //   6171: invokestatic 124	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   6174: aastore
        //   6175: invokestatic 117	java/lang/String:format	(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   6178: iconst_0
        //   6179: anewarray 4	java/lang/Object
        //   6182: invokevirtual 87	org/vidogram/SQLite/SQLiteDatabase:b	(Ljava/lang/String;[Ljava/lang/Object;)Lorg/vidogram/SQLite/SQLiteCursor;
        //   6185: astore 72
        //   6187: iload 4
        //   6189: istore 8
        //   6191: iload 9
        //   6193: istore 10
        //   6195: iload 5
        //   6197: istore_2
        //   6198: iload 12
        //   6200: istore 11
        //   6202: iload_3
        //   6203: istore 13
        //   6205: iload 48
        //   6207: istore 44
        //   6209: iload 46
        //   6211: istore 47
        //   6213: aload 72
        //   6215: invokevirtual 92	org/vidogram/SQLite/SQLiteCursor:a	()Z
        //   6218: ifeq +40 -> 6258
        //   6221: iload 4
        //   6223: istore 8
        //   6225: iload 9
        //   6227: istore 10
        //   6229: iload 5
        //   6231: istore_2
        //   6232: iload 12
        //   6234: istore 11
        //   6236: iload_3
        //   6237: istore 13
        //   6239: iload 48
        //   6241: istore 44
        //   6243: iload 46
        //   6245: istore 47
        //   6247: aload 80
        //   6249: aload 72
        //   6251: iconst_0
        //   6252: invokevirtual 95	org/vidogram/SQLite/SQLiteCursor:b	(I)I
        //   6255: putfield 236	org/vidogram/tgnet/g$ar:G	I
        //   6258: iload 4
        //   6260: istore 8
        //   6262: iload 9
        //   6264: istore 10
        //   6266: iload 5
        //   6268: istore_2
        //   6269: iload 12
        //   6271: istore 11
        //   6273: iload_3
        //   6274: istore 13
        //   6276: iload 48
        //   6278: istore 44
        //   6280: iload 46
        //   6282: istore 47
        //   6284: aload 72
        //   6286: invokevirtual 97	org/vidogram/SQLite/SQLiteCursor:b	()V
        //   6289: goto -2796 -> 3493
        //   6292: astore 72
        //   6294: iload 4
        //   6296: istore 14
        //   6298: iload 9
        //   6300: istore 15
        //   6302: iload 5
        //   6304: istore 6
        //   6306: iload 12
        //   6308: istore 16
        //   6310: iload_3
        //   6311: istore 17
        //   6313: iload 48
        //   6315: istore 45
        //   6317: iload 46
        //   6319: istore 49
        //   6321: iload 4
        //   6323: istore 8
        //   6325: iload 9
        //   6327: istore 10
        //   6329: iload 5
        //   6331: istore_2
        //   6332: iload 12
        //   6334: istore 11
        //   6336: iload_3
        //   6337: istore 13
        //   6339: iload 48
        //   6341: istore 44
        //   6343: iload 46
        //   6345: istore 47
        //   6347: ldc 238
        //   6349: aload 72
        //   6351: invokestatic 243	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   6354: goto -2861 -> 3493
        //   6357: astore 71
        //   6359: iload 49
        //   6361: istore 46
        //   6363: iload 17
        //   6365: istore_1
        //   6366: iload 16
        //   6368: istore 7
        //   6370: iload 6
        //   6372: istore 17
        //   6374: iload 14
        //   6376: istore 8
        //   6378: iload 15
        //   6380: istore 10
        //   6382: iload 17
        //   6384: istore_2
        //   6385: iload 7
        //   6387: istore 11
        //   6389: iload_1
        //   6390: istore 13
        //   6392: iload 45
        //   6394: istore 44
        //   6396: iload 46
        //   6398: istore 47
        //   6400: aload 74
        //   6402: getfield 179	org/vidogram/tgnet/g$qi:c	Ljava/util/ArrayList;
        //   6405: invokevirtual 246	java/util/ArrayList:clear	()V
        //   6408: iload 14
        //   6410: istore 8
        //   6412: iload 15
        //   6414: istore 10
        //   6416: iload 17
        //   6418: istore_2
        //   6419: iload 7
        //   6421: istore 11
        //   6423: iload_1
        //   6424: istore 13
        //   6426: iload 45
        //   6428: istore 44
        //   6430: iload 46
        //   6432: istore 47
        //   6434: aload 74
        //   6436: getfield 248	org/vidogram/tgnet/g$qi:d	Ljava/util/ArrayList;
        //   6439: invokevirtual 246	java/util/ArrayList:clear	()V
        //   6442: iload 14
        //   6444: istore 8
        //   6446: iload 15
        //   6448: istore 10
        //   6450: iload 17
        //   6452: istore_2
        //   6453: iload 7
        //   6455: istore 11
        //   6457: iload_1
        //   6458: istore 13
        //   6460: iload 45
        //   6462: istore 44
        //   6464: iload 46
        //   6466: istore 47
        //   6468: aload 74
        //   6470: getfield 250	org/vidogram/tgnet/g$qi:e	Ljava/util/ArrayList;
        //   6473: invokevirtual 246	java/util/ArrayList:clear	()V
        //   6476: iload 14
        //   6478: istore 8
        //   6480: iload 15
        //   6482: istore 10
        //   6484: iload 17
        //   6486: istore_2
        //   6487: iload 7
        //   6489: istore 11
        //   6491: iload_1
        //   6492: istore 13
        //   6494: iload 45
        //   6496: istore 44
        //   6498: iload 46
        //   6500: istore 47
        //   6502: ldc 238
        //   6504: aload 71
        //   6506: invokestatic 243	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   6509: invokestatic 255	org/vidogram/messenger/v:a	()Lorg/vidogram/messenger/v;
        //   6512: aload 74
        //   6514: aload_0
        //   6515: getfield 37	org/vidogram/messenger/w$28:d	J
        //   6518: iload 14
        //   6520: aload_0
        //   6521: getfield 33	org/vidogram/messenger/w$28:b	I
        //   6524: iconst_1
        //   6525: aload_0
        //   6526: getfield 43	org/vidogram/messenger/w$28:g	I
        //   6529: iload 15
        //   6531: iload 17
        //   6533: iload 7
        //   6535: iload_1
        //   6536: aload_0
        //   6537: getfield 39	org/vidogram/messenger/w$28:e	I
        //   6540: aload_0
        //   6541: getfield 35	org/vidogram/messenger/w$28:c	Z
        //   6544: iload 45
        //   6546: aload_0
        //   6547: getfield 45	org/vidogram/messenger/w$28:h	I
        //   6550: iload 46
        //   6552: invokevirtual 258	org/vidogram/messenger/v:a	(Lorg/vidogram/tgnet/g$we;JIIZIIIIIIZZIZ)V
        //   6555: return
        //   6556: iconst_1
        //   6557: istore 20
        //   6559: goto -6337 -> 222
        //   6562: iload_3
        //   6563: ifne +232 -> 6795
        //   6566: iconst_0
        //   6567: istore 9
        //   6569: iload_1
        //   6570: istore 5
        //   6572: iload_1
        //   6573: istore 6
        //   6575: aload_0
        //   6576: getfield 29	org/vidogram/messenger/w$28:i	Lorg/vidogram/messenger/w;
        //   6579: invokestatic 66	org/vidogram/messenger/w:a	(Lorg/vidogram/messenger/w;)Lorg/vidogram/SQLite/SQLiteDatabase;
        //   6582: getstatic 103	java/util/Locale:US	Ljava/util/Locale;
        //   6585: ldc_w 260
        //   6588: iconst_1
        //   6589: anewarray 4	java/lang/Object
        //   6592: dup
        //   6593: iconst_0
        //   6594: aload_0
        //   6595: getfield 37	org/vidogram/messenger/w$28:d	J
        //   6598: invokestatic 111	java/lang/Long:valueOf	(J)Ljava/lang/Long;
        //   6601: aastore
        //   6602: invokestatic 117	java/lang/String:format	(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   6605: iconst_0
        //   6606: anewarray 4	java/lang/Object
        //   6609: invokevirtual 87	org/vidogram/SQLite/SQLiteDatabase:b	(Ljava/lang/String;[Ljava/lang/Object;)Lorg/vidogram/SQLite/SQLiteCursor;
        //   6612: astore 71
        //   6614: iload_1
        //   6615: istore 5
        //   6617: iload_1
        //   6618: istore 6
        //   6620: aload 71
        //   6622: invokevirtual 92	org/vidogram/SQLite/SQLiteCursor:a	()Z
        //   6625: ifeq +17 -> 6642
        //   6628: iload_1
        //   6629: istore 5
        //   6631: iload_1
        //   6632: istore 6
        //   6634: aload 71
        //   6636: iconst_0
        //   6637: invokevirtual 95	org/vidogram/SQLite/SQLiteCursor:b	(I)I
        //   6640: istore 9
        //   6642: iload_1
        //   6643: istore 5
        //   6645: iload_1
        //   6646: istore 6
        //   6648: aload 71
        //   6650: invokevirtual 97	org/vidogram/SQLite/SQLiteCursor:b	()V
        //   6653: iload_3
        //   6654: istore 5
        //   6656: iload_1
        //   6657: istore_2
        //   6658: lload 63
        //   6660: lstore 65
        //   6662: iload 9
        //   6664: iload 7
        //   6666: if_icmpne +9007 -> 15673
        //   6669: iload_1
        //   6670: istore 5
        //   6672: iload_1
        //   6673: istore 6
        //   6675: aload_0
        //   6676: getfield 29	org/vidogram/messenger/w$28:i	Lorg/vidogram/messenger/w;
        //   6679: invokestatic 66	org/vidogram/messenger/w:a	(Lorg/vidogram/messenger/w;)Lorg/vidogram/SQLite/SQLiteDatabase;
        //   6682: getstatic 103	java/util/Locale:US	Ljava/util/Locale;
        //   6685: ldc_w 262
        //   6688: iconst_1
        //   6689: anewarray 4	java/lang/Object
        //   6692: dup
        //   6693: iconst_0
        //   6694: aload_0
        //   6695: getfield 37	org/vidogram/messenger/w$28:d	J
        //   6698: invokestatic 111	java/lang/Long:valueOf	(J)Ljava/lang/Long;
        //   6701: aastore
        //   6702: invokestatic 117	java/lang/String:format	(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   6705: iconst_0
        //   6706: anewarray 4	java/lang/Object
        //   6709: invokevirtual 87	org/vidogram/SQLite/SQLiteDatabase:b	(Ljava/lang/String;[Ljava/lang/Object;)Lorg/vidogram/SQLite/SQLiteCursor;
        //   6712: astore 71
        //   6714: iload_1
        //   6715: istore_2
        //   6716: iload_1
        //   6717: istore 5
        //   6719: iload_1
        //   6720: istore 6
        //   6722: aload 71
        //   6724: invokevirtual 92	org/vidogram/SQLite/SQLiteCursor:a	()Z
        //   6727: ifeq +47 -> 6774
        //   6730: iload_1
        //   6731: istore 5
        //   6733: iload_1
        //   6734: istore 6
        //   6736: aload 71
        //   6738: iconst_0
        //   6739: invokevirtual 95	org/vidogram/SQLite/SQLiteCursor:b	(I)I
        //   6742: istore_1
        //   6743: iload_1
        //   6744: i2l
        //   6745: lstore 63
        //   6747: lload 63
        //   6749: lconst_0
        //   6750: lcmp
        //   6751: ifeq +8796 -> 15547
        //   6754: iload 19
        //   6756: ifeq +8791 -> 15547
        //   6759: lload 63
        //   6761: iload 19
        //   6763: i2l
        //   6764: bipush 32
        //   6766: lshl
        //   6767: lor
        //   6768: lstore 63
        //   6770: iload_1
        //   6771: istore_2
        //   6772: iload_1
        //   6773: istore_3
        //   6774: iload_2
        //   6775: istore 5
        //   6777: iload_2
        //   6778: istore 6
        //   6780: aload 71
        //   6782: invokevirtual 97	org/vidogram/SQLite/SQLiteCursor:b	()V
        //   6785: iload_3
        //   6786: istore 5
        //   6788: lload 63
        //   6790: lstore 65
        //   6792: goto +8881 -> 15673
        //   6795: iload_1
        //   6796: istore 5
        //   6798: iload_1
        //   6799: istore 6
        //   6801: aload_0
        //   6802: getfield 29	org/vidogram/messenger/w$28:i	Lorg/vidogram/messenger/w;
        //   6805: invokestatic 66	org/vidogram/messenger/w:a	(Lorg/vidogram/messenger/w;)Lorg/vidogram/SQLite/SQLiteDatabase;
        //   6808: getstatic 103	java/util/Locale:US	Ljava/util/Locale;
        //   6811: ldc_w 264
        //   6814: iconst_3
        //   6815: anewarray 4	java/lang/Object
        //   6818: dup
        //   6819: iconst_0
        //   6820: aload_0
        //   6821: getfield 37	org/vidogram/messenger/w$28:d	J
        //   6824: invokestatic 111	java/lang/Long:valueOf	(J)Ljava/lang/Long;
        //   6827: aastore
        //   6828: dup
        //   6829: iconst_1
        //   6830: iload_3
        //   6831: invokestatic 124	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   6834: aastore
        //   6835: dup
        //   6836: iconst_2
        //   6837: iload_3
        //   6838: invokestatic 124	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   6841: aastore
        //   6842: invokestatic 117	java/lang/String:format	(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   6845: iconst_0
        //   6846: anewarray 4	java/lang/Object
        //   6849: invokevirtual 87	org/vidogram/SQLite/SQLiteDatabase:b	(Ljava/lang/String;[Ljava/lang/Object;)Lorg/vidogram/SQLite/SQLiteCursor;
        //   6852: astore 71
        //   6854: iload_1
        //   6855: istore 5
        //   6857: iload_1
        //   6858: istore 6
        //   6860: aload 71
        //   6862: invokevirtual 92	org/vidogram/SQLite/SQLiteCursor:a	()Z
        //   6865: ifne +185 -> 7050
        //   6868: iconst_1
        //   6869: istore 9
        //   6871: iload_1
        //   6872: istore 5
        //   6874: iload_1
        //   6875: istore 6
        //   6877: aload 71
        //   6879: invokevirtual 97	org/vidogram/SQLite/SQLiteCursor:b	()V
        //   6882: iload_3
        //   6883: istore_2
        //   6884: lload 63
        //   6886: lstore 65
        //   6888: iload 9
        //   6890: ifeq +140 -> 7030
        //   6893: iload_1
        //   6894: istore 5
        //   6896: iload_1
        //   6897: istore 6
        //   6899: aload_0
        //   6900: getfield 29	org/vidogram/messenger/w$28:i	Lorg/vidogram/messenger/w;
        //   6903: invokestatic 66	org/vidogram/messenger/w:a	(Lorg/vidogram/messenger/w;)Lorg/vidogram/SQLite/SQLiteDatabase;
        //   6906: getstatic 103	java/util/Locale:US	Ljava/util/Locale;
        //   6909: ldc_w 266
        //   6912: iconst_2
        //   6913: anewarray 4	java/lang/Object
        //   6916: dup
        //   6917: iconst_0
        //   6918: aload_0
        //   6919: getfield 37	org/vidogram/messenger/w$28:d	J
        //   6922: invokestatic 111	java/lang/Long:valueOf	(J)Ljava/lang/Long;
        //   6925: aastore
        //   6926: dup
        //   6927: iconst_1
        //   6928: iload_3
        //   6929: invokestatic 124	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   6932: aastore
        //   6933: invokestatic 117	java/lang/String:format	(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   6936: iconst_0
        //   6937: anewarray 4	java/lang/Object
        //   6940: invokevirtual 87	org/vidogram/SQLite/SQLiteDatabase:b	(Ljava/lang/String;[Ljava/lang/Object;)Lorg/vidogram/SQLite/SQLiteCursor;
        //   6943: astore 71
        //   6945: iload_1
        //   6946: istore 5
        //   6948: iload_1
        //   6949: istore 6
        //   6951: aload 71
        //   6953: invokevirtual 92	org/vidogram/SQLite/SQLiteCursor:a	()Z
        //   6956: ifeq +57 -> 7013
        //   6959: iload_1
        //   6960: istore 5
        //   6962: iload_1
        //   6963: istore 6
        //   6965: aload 71
        //   6967: iconst_0
        //   6968: invokevirtual 95	org/vidogram/SQLite/SQLiteCursor:b	(I)I
        //   6971: istore_2
        //   6972: iload_2
        //   6973: i2l
        //   6974: lstore 65
        //   6976: iload_2
        //   6977: istore_3
        //   6978: lload 65
        //   6980: lstore 63
        //   6982: lload 65
        //   6984: lconst_0
        //   6985: lcmp
        //   6986: ifeq +27 -> 7013
        //   6989: iload_2
        //   6990: istore_3
        //   6991: lload 65
        //   6993: lstore 63
        //   6995: iload 19
        //   6997: ifeq +16 -> 7013
        //   7000: lload 65
        //   7002: iload 19
        //   7004: i2l
        //   7005: bipush 32
        //   7007: lshl
        //   7008: lor
        //   7009: lstore 63
        //   7011: iload_2
        //   7012: istore_3
        //   7013: iload_1
        //   7014: istore 5
        //   7016: iload_1
        //   7017: istore 6
        //   7019: aload 71
        //   7021: invokevirtual 97	org/vidogram/SQLite/SQLiteCursor:b	()V
        //   7024: lload 63
        //   7026: lstore 65
        //   7028: iload_3
        //   7029: istore_2
        //   7030: lload 65
        //   7032: lstore 63
        //   7034: iload_2
        //   7035: istore_3
        //   7036: iload_1
        //   7037: istore 9
        //   7039: iload 7
        //   7041: istore 12
        //   7043: iload 8
        //   7045: istore 11
        //   7047: goto +8565 -> 15612
        //   7050: iconst_0
        //   7051: istore 9
        //   7053: goto -182 -> 6871
        //   7056: iload 12
        //   7058: iload 4
        //   7060: isub
        //   7061: istore 7
        //   7063: iload 4
        //   7065: bipush 10
        //   7067: iadd
        //   7068: istore 4
        //   7070: iload_3
        //   7071: istore_1
        //   7072: iload 11
        //   7074: istore_3
        //   7075: iload 44
        //   7077: istore 46
        //   7079: lload 63
        //   7081: lstore 65
        //   7083: goto -5312 -> 1771
        //   7086: iconst_0
        //   7087: istore 48
        //   7089: goto -5085 -> 2004
        //   7092: iload 4
        //   7094: istore 14
        //   7096: iload 9
        //   7098: istore 15
        //   7100: iload 18
        //   7102: istore 6
        //   7104: iload 12
        //   7106: istore 16
        //   7108: iload_3
        //   7109: istore 17
        //   7111: iload 52
        //   7113: istore 45
        //   7115: iload 46
        //   7117: istore 49
        //   7119: iload 4
        //   7121: istore 8
        //   7123: iload 9
        //   7125: istore 10
        //   7127: iload 20
        //   7129: istore_2
        //   7130: iload 12
        //   7132: istore 11
        //   7134: iload_3
        //   7135: istore 13
        //   7137: iload 53
        //   7139: istore 44
        //   7141: iload 46
        //   7143: istore 47
        //   7145: aload 71
        //   7147: invokevirtual 97	org/vidogram/SQLite/SQLiteCursor:b	()V
        //   7150: iload 4
        //   7152: istore 14
        //   7154: iload 9
        //   7156: istore 15
        //   7158: iload 18
        //   7160: istore 6
        //   7162: iload 12
        //   7164: istore 16
        //   7166: iload_3
        //   7167: istore 17
        //   7169: iload 52
        //   7171: istore 45
        //   7173: iload 46
        //   7175: istore 49
        //   7177: iload 4
        //   7179: istore 8
        //   7181: iload 9
        //   7183: istore 10
        //   7185: iload 20
        //   7187: istore_2
        //   7188: iload 12
        //   7190: istore 11
        //   7192: iload_3
        //   7193: istore 13
        //   7195: iload 53
        //   7197: istore 44
        //   7199: iload 46
        //   7201: istore 47
        //   7203: aload_0
        //   7204: getfield 29	org/vidogram/messenger/w$28:i	Lorg/vidogram/messenger/w;
        //   7207: invokestatic 66	org/vidogram/messenger/w:a	(Lorg/vidogram/messenger/w;)Lorg/vidogram/SQLite/SQLiteDatabase;
        //   7210: getstatic 103	java/util/Locale:US	Ljava/util/Locale;
        //   7213: ldc_w 268
        //   7216: iconst_1
        //   7217: anewarray 4	java/lang/Object
        //   7220: dup
        //   7221: iconst_0
        //   7222: aload_0
        //   7223: getfield 37	org/vidogram/messenger/w$28:d	J
        //   7226: invokestatic 111	java/lang/Long:valueOf	(J)Ljava/lang/Long;
        //   7229: aastore
        //   7230: invokestatic 117	java/lang/String:format	(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   7233: iconst_0
        //   7234: anewarray 4	java/lang/Object
        //   7237: invokevirtual 87	org/vidogram/SQLite/SQLiteDatabase:b	(Ljava/lang/String;[Ljava/lang/Object;)Lorg/vidogram/SQLite/SQLiteCursor;
        //   7240: astore 71
        //   7242: iload 4
        //   7244: istore 14
        //   7246: iload 9
        //   7248: istore 15
        //   7250: iload 18
        //   7252: istore 6
        //   7254: iload 12
        //   7256: istore 16
        //   7258: iload_3
        //   7259: istore 17
        //   7261: iload 52
        //   7263: istore 45
        //   7265: iload 46
        //   7267: istore 49
        //   7269: iload 4
        //   7271: istore 8
        //   7273: iload 9
        //   7275: istore 10
        //   7277: iload 20
        //   7279: istore_2
        //   7280: iload 12
        //   7282: istore 11
        //   7284: iload_3
        //   7285: istore 13
        //   7287: iload 53
        //   7289: istore 44
        //   7291: iload 46
        //   7293: istore 47
        //   7295: aload 71
        //   7297: invokevirtual 92	org/vidogram/SQLite/SQLiteCursor:a	()Z
        //   7300: ifeq +496 -> 7796
        //   7303: iload 4
        //   7305: istore 14
        //   7307: iload 9
        //   7309: istore 15
        //   7311: iload 18
        //   7313: istore 6
        //   7315: iload 12
        //   7317: istore 16
        //   7319: iload_3
        //   7320: istore 17
        //   7322: iload 52
        //   7324: istore 45
        //   7326: iload 46
        //   7328: istore 49
        //   7330: iload 4
        //   7332: istore 8
        //   7334: iload 9
        //   7336: istore 10
        //   7338: iload 20
        //   7340: istore_2
        //   7341: iload 12
        //   7343: istore 11
        //   7345: iload_3
        //   7346: istore 13
        //   7348: iload 53
        //   7350: istore 44
        //   7352: iload 46
        //   7354: istore 47
        //   7356: aload 71
        //   7358: iconst_0
        //   7359: invokevirtual 95	org/vidogram/SQLite/SQLiteCursor:b	(I)I
        //   7362: istore 23
        //   7364: iload 23
        //   7366: ifeq +430 -> 7796
        //   7369: iload 4
        //   7371: istore 14
        //   7373: iload 9
        //   7375: istore 15
        //   7377: iload 18
        //   7379: istore 6
        //   7381: iload 12
        //   7383: istore 16
        //   7385: iload_3
        //   7386: istore 17
        //   7388: iload 52
        //   7390: istore 45
        //   7392: iload 46
        //   7394: istore 49
        //   7396: iload 4
        //   7398: istore 8
        //   7400: iload 9
        //   7402: istore 10
        //   7404: iload 20
        //   7406: istore_2
        //   7407: iload 12
        //   7409: istore 11
        //   7411: iload_3
        //   7412: istore 13
        //   7414: iload 53
        //   7416: istore 44
        //   7418: iload 46
        //   7420: istore 47
        //   7422: aload_0
        //   7423: getfield 29	org/vidogram/messenger/w$28:i	Lorg/vidogram/messenger/w;
        //   7426: invokestatic 66	org/vidogram/messenger/w:a	(Lorg/vidogram/messenger/w;)Lorg/vidogram/SQLite/SQLiteDatabase;
        //   7429: ldc_w 270
        //   7432: invokevirtual 273	org/vidogram/SQLite/SQLiteDatabase:a	(Ljava/lang/String;)Lorg/vidogram/SQLite/SQLitePreparedStatement;
        //   7435: astore 72
        //   7437: iload 4
        //   7439: istore 14
        //   7441: iload 9
        //   7443: istore 15
        //   7445: iload 18
        //   7447: istore 6
        //   7449: iload 12
        //   7451: istore 16
        //   7453: iload_3
        //   7454: istore 17
        //   7456: iload 52
        //   7458: istore 45
        //   7460: iload 46
        //   7462: istore 49
        //   7464: iload 4
        //   7466: istore 8
        //   7468: iload 9
        //   7470: istore 10
        //   7472: iload 20
        //   7474: istore_2
        //   7475: iload 12
        //   7477: istore 11
        //   7479: iload_3
        //   7480: istore 13
        //   7482: iload 53
        //   7484: istore 44
        //   7486: iload 46
        //   7488: istore 47
        //   7490: aload 72
        //   7492: invokevirtual 277	org/vidogram/SQLite/SQLitePreparedStatement:d	()V
        //   7495: iload 4
        //   7497: istore 14
        //   7499: iload 9
        //   7501: istore 15
        //   7503: iload 18
        //   7505: istore 6
        //   7507: iload 12
        //   7509: istore 16
        //   7511: iload_3
        //   7512: istore 17
        //   7514: iload 52
        //   7516: istore 45
        //   7518: iload 46
        //   7520: istore 49
        //   7522: iload 4
        //   7524: istore 8
        //   7526: iload 9
        //   7528: istore 10
        //   7530: iload 20
        //   7532: istore_2
        //   7533: iload 12
        //   7535: istore 11
        //   7537: iload_3
        //   7538: istore 13
        //   7540: iload 53
        //   7542: istore 44
        //   7544: iload 46
        //   7546: istore 47
        //   7548: aload 72
        //   7550: iconst_1
        //   7551: aload_0
        //   7552: getfield 37	org/vidogram/messenger/w$28:d	J
        //   7555: invokevirtual 280	org/vidogram/SQLite/SQLitePreparedStatement:a	(IJ)V
        //   7558: iload 4
        //   7560: istore 14
        //   7562: iload 9
        //   7564: istore 15
        //   7566: iload 18
        //   7568: istore 6
        //   7570: iload 12
        //   7572: istore 16
        //   7574: iload_3
        //   7575: istore 17
        //   7577: iload 52
        //   7579: istore 45
        //   7581: iload 46
        //   7583: istore 49
        //   7585: iload 4
        //   7587: istore 8
        //   7589: iload 9
        //   7591: istore 10
        //   7593: iload 20
        //   7595: istore_2
        //   7596: iload 12
        //   7598: istore 11
        //   7600: iload_3
        //   7601: istore 13
        //   7603: iload 53
        //   7605: istore 44
        //   7607: iload 46
        //   7609: istore 47
        //   7611: aload 72
        //   7613: iconst_2
        //   7614: iconst_0
        //   7615: invokevirtual 283	org/vidogram/SQLite/SQLitePreparedStatement:a	(II)V
        //   7618: iload 4
        //   7620: istore 14
        //   7622: iload 9
        //   7624: istore 15
        //   7626: iload 18
        //   7628: istore 6
        //   7630: iload 12
        //   7632: istore 16
        //   7634: iload_3
        //   7635: istore 17
        //   7637: iload 52
        //   7639: istore 45
        //   7641: iload 46
        //   7643: istore 49
        //   7645: iload 4
        //   7647: istore 8
        //   7649: iload 9
        //   7651: istore 10
        //   7653: iload 20
        //   7655: istore_2
        //   7656: iload 12
        //   7658: istore 11
        //   7660: iload_3
        //   7661: istore 13
        //   7663: iload 53
        //   7665: istore 44
        //   7667: iload 46
        //   7669: istore 47
        //   7671: aload 72
        //   7673: iconst_3
        //   7674: iload 23
        //   7676: invokevirtual 283	org/vidogram/SQLite/SQLitePreparedStatement:a	(II)V
        //   7679: iload 4
        //   7681: istore 14
        //   7683: iload 9
        //   7685: istore 15
        //   7687: iload 18
        //   7689: istore 6
        //   7691: iload 12
        //   7693: istore 16
        //   7695: iload_3
        //   7696: istore 17
        //   7698: iload 52
        //   7700: istore 45
        //   7702: iload 46
        //   7704: istore 49
        //   7706: iload 4
        //   7708: istore 8
        //   7710: iload 9
        //   7712: istore 10
        //   7714: iload 20
        //   7716: istore_2
        //   7717: iload 12
        //   7719: istore 11
        //   7721: iload_3
        //   7722: istore 13
        //   7724: iload 53
        //   7726: istore 44
        //   7728: iload 46
        //   7730: istore 47
        //   7732: aload 72
        //   7734: invokevirtual 286	org/vidogram/SQLite/SQLitePreparedStatement:b	()I
        //   7737: pop
        //   7738: iload 4
        //   7740: istore 14
        //   7742: iload 9
        //   7744: istore 15
        //   7746: iload 18
        //   7748: istore 6
        //   7750: iload 12
        //   7752: istore 16
        //   7754: iload_3
        //   7755: istore 17
        //   7757: iload 52
        //   7759: istore 45
        //   7761: iload 46
        //   7763: istore 49
        //   7765: iload 4
        //   7767: istore 8
        //   7769: iload 9
        //   7771: istore 10
        //   7773: iload 20
        //   7775: istore_2
        //   7776: iload 12
        //   7778: istore 11
        //   7780: iload_3
        //   7781: istore 13
        //   7783: iload 53
        //   7785: istore 44
        //   7787: iload 46
        //   7789: istore 47
        //   7791: aload 72
        //   7793: invokevirtual 287	org/vidogram/SQLite/SQLitePreparedStatement:e	()V
        //   7796: iload 4
        //   7798: istore 14
        //   7800: iload 9
        //   7802: istore 15
        //   7804: iload 18
        //   7806: istore 6
        //   7808: iload 12
        //   7810: istore 16
        //   7812: iload_3
        //   7813: istore 17
        //   7815: iload 52
        //   7817: istore 45
        //   7819: iload 46
        //   7821: istore 49
        //   7823: iload 4
        //   7825: istore 8
        //   7827: iload 9
        //   7829: istore 10
        //   7831: iload 20
        //   7833: istore_2
        //   7834: iload 12
        //   7836: istore 11
        //   7838: iload_3
        //   7839: istore 13
        //   7841: iload 53
        //   7843: istore 44
        //   7845: iload 46
        //   7847: istore 47
        //   7849: aload 71
        //   7851: invokevirtual 97	org/vidogram/SQLite/SQLiteCursor:b	()V
        //   7854: iload 50
        //   7856: istore 48
        //   7858: goto -5796 -> 2062
        //   7861: astore 71
        //   7863: iload 47
        //   7865: istore 45
        //   7867: iload 44
        //   7869: istore 47
        //   7871: iload 11
        //   7873: istore 5
        //   7875: iload_2
        //   7876: istore 16
        //   7878: iload 10
        //   7880: istore_1
        //   7881: iload 8
        //   7883: istore_2
        //   7884: invokestatic 255	org/vidogram/messenger/v:a	()Lorg/vidogram/messenger/v;
        //   7887: aload 74
        //   7889: aload_0
        //   7890: getfield 37	org/vidogram/messenger/w$28:d	J
        //   7893: iload_2
        //   7894: aload_0
        //   7895: getfield 33	org/vidogram/messenger/w$28:b	I
        //   7898: iconst_1
        //   7899: aload_0
        //   7900: getfield 43	org/vidogram/messenger/w$28:g	I
        //   7903: iload_1
        //   7904: iload 16
        //   7906: iload 5
        //   7908: iload 13
        //   7910: aload_0
        //   7911: getfield 39	org/vidogram/messenger/w$28:e	I
        //   7914: aload_0
        //   7915: getfield 35	org/vidogram/messenger/w$28:c	Z
        //   7918: iload 47
        //   7920: aload_0
        //   7921: getfield 45	org/vidogram/messenger/w$28:h	I
        //   7924: iload 45
        //   7926: invokevirtual 258	org/vidogram/messenger/v:a	(Lorg/vidogram/tgnet/g$we;JIIZIIIIIIZZIZ)V
        //   7929: aload 71
        //   7931: athrow
        //   7932: iconst_0
        //   7933: istore 7
        //   7935: goto -5464 -> 2471
        //   7938: iload 4
        //   7940: istore 14
        //   7942: iload 9
        //   7944: istore 15
        //   7946: iload 5
        //   7948: istore 6
        //   7950: iload 12
        //   7952: istore 16
        //   7954: iload_3
        //   7955: istore 17
        //   7957: iload 48
        //   7959: istore 45
        //   7961: iload 46
        //   7963: istore 49
        //   7965: iload 4
        //   7967: istore 8
        //   7969: iload 9
        //   7971: istore 10
        //   7973: iload 5
        //   7975: istore_2
        //   7976: iload 12
        //   7978: istore 11
        //   7980: iload_3
        //   7981: istore 13
        //   7983: iload 48
        //   7985: istore 44
        //   7987: iload 46
        //   7989: istore 47
        //   7991: aload_0
        //   7992: getfield 29	org/vidogram/messenger/w$28:i	Lorg/vidogram/messenger/w;
        //   7995: invokestatic 66	org/vidogram/messenger/w:a	(Lorg/vidogram/messenger/w;)Lorg/vidogram/SQLite/SQLiteDatabase;
        //   7998: getstatic 103	java/util/Locale:US	Ljava/util/Locale;
        //   8001: ldc_w 289
        //   8004: bipush 6
        //   8006: anewarray 4	java/lang/Object
        //   8009: dup
        //   8010: iconst_0
        //   8011: aload_0
        //   8012: getfield 37	org/vidogram/messenger/w$28:d	J
        //   8015: invokestatic 111	java/lang/Long:valueOf	(J)Ljava/lang/Long;
        //   8018: aastore
        //   8019: dup
        //   8020: iconst_1
        //   8021: lload 65
        //   8023: invokestatic 111	java/lang/Long:valueOf	(J)Ljava/lang/Long;
        //   8026: aastore
        //   8027: dup
        //   8028: iconst_2
        //   8029: iload 4
        //   8031: iconst_2
        //   8032: idiv
        //   8033: invokestatic 124	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   8036: aastore
        //   8037: dup
        //   8038: iconst_3
        //   8039: aload_0
        //   8040: getfield 37	org/vidogram/messenger/w$28:d	J
        //   8043: invokestatic 111	java/lang/Long:valueOf	(J)Ljava/lang/Long;
        //   8046: aastore
        //   8047: dup
        //   8048: iconst_4
        //   8049: lload 65
        //   8051: invokestatic 111	java/lang/Long:valueOf	(J)Ljava/lang/Long;
        //   8054: aastore
        //   8055: dup
        //   8056: iconst_5
        //   8057: iload 4
        //   8059: iconst_2
        //   8060: idiv
        //   8061: invokestatic 124	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   8064: aastore
        //   8065: invokestatic 117	java/lang/String:format	(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   8068: iconst_0
        //   8069: anewarray 4	java/lang/Object
        //   8072: invokevirtual 87	org/vidogram/SQLite/SQLiteDatabase:b	(Ljava/lang/String;[Ljava/lang/Object;)Lorg/vidogram/SQLite/SQLiteCursor;
        //   8075: astore 71
        //   8077: goto +7588 -> 15665
        //   8080: iload 4
        //   8082: istore 14
        //   8084: iload 9
        //   8086: istore 15
        //   8088: iload 18
        //   8090: istore 6
        //   8092: iload 12
        //   8094: istore 16
        //   8096: iload_3
        //   8097: istore 17
        //   8099: iload 48
        //   8101: istore 45
        //   8103: iload 46
        //   8105: istore 49
        //   8107: iload 4
        //   8109: istore 8
        //   8111: iload 9
        //   8113: istore 10
        //   8115: iload 20
        //   8117: istore_2
        //   8118: iload 12
        //   8120: istore 11
        //   8122: iload_3
        //   8123: istore 13
        //   8125: iload 48
        //   8127: istore 44
        //   8129: iload 46
        //   8131: istore 47
        //   8133: aload_0
        //   8134: getfield 39	org/vidogram/messenger/w$28:e	I
        //   8137: iconst_1
        //   8138: if_icmpne +566 -> 8704
        //   8141: lconst_0
        //   8142: lstore 63
        //   8144: iload 4
        //   8146: istore 14
        //   8148: iload 9
        //   8150: istore 15
        //   8152: iload 18
        //   8154: istore 6
        //   8156: iload 12
        //   8158: istore 16
        //   8160: iload_3
        //   8161: istore 17
        //   8163: iload 48
        //   8165: istore 45
        //   8167: iload 46
        //   8169: istore 49
        //   8171: iload 4
        //   8173: istore 8
        //   8175: iload 9
        //   8177: istore 10
        //   8179: iload 20
        //   8181: istore_2
        //   8182: iload 12
        //   8184: istore 11
        //   8186: iload_3
        //   8187: istore 13
        //   8189: iload 48
        //   8191: istore 44
        //   8193: iload 46
        //   8195: istore 47
        //   8197: aload_0
        //   8198: getfield 29	org/vidogram/messenger/w$28:i	Lorg/vidogram/messenger/w;
        //   8201: invokestatic 66	org/vidogram/messenger/w:a	(Lorg/vidogram/messenger/w;)Lorg/vidogram/SQLite/SQLiteDatabase;
        //   8204: getstatic 103	java/util/Locale:US	Ljava/util/Locale;
        //   8207: ldc_w 291
        //   8210: iconst_2
        //   8211: anewarray 4	java/lang/Object
        //   8214: dup
        //   8215: iconst_0
        //   8216: aload_0
        //   8217: getfield 37	org/vidogram/messenger/w$28:d	J
        //   8220: invokestatic 111	java/lang/Long:valueOf	(J)Ljava/lang/Long;
        //   8223: aastore
        //   8224: dup
        //   8225: iconst_1
        //   8226: aload_0
        //   8227: getfield 33	org/vidogram/messenger/w$28:b	I
        //   8230: invokestatic 124	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   8233: aastore
        //   8234: invokestatic 117	java/lang/String:format	(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   8237: iconst_0
        //   8238: anewarray 4	java/lang/Object
        //   8241: invokevirtual 87	org/vidogram/SQLite/SQLiteDatabase:b	(Ljava/lang/String;[Ljava/lang/Object;)Lorg/vidogram/SQLite/SQLiteCursor;
        //   8244: astore 71
        //   8246: iload 4
        //   8248: istore 14
        //   8250: iload 9
        //   8252: istore 15
        //   8254: iload 18
        //   8256: istore 6
        //   8258: iload 12
        //   8260: istore 16
        //   8262: iload_3
        //   8263: istore 17
        //   8265: iload 48
        //   8267: istore 45
        //   8269: iload 46
        //   8271: istore 49
        //   8273: iload 4
        //   8275: istore 8
        //   8277: iload 9
        //   8279: istore 10
        //   8281: iload 20
        //   8283: istore_2
        //   8284: iload 12
        //   8286: istore 11
        //   8288: iload_3
        //   8289: istore 13
        //   8291: iload 48
        //   8293: istore 44
        //   8295: iload 46
        //   8297: istore 47
        //   8299: aload 71
        //   8301: invokevirtual 92	org/vidogram/SQLite/SQLiteCursor:a	()Z
        //   8304: ifeq +85 -> 8389
        //   8307: iload 4
        //   8309: istore 14
        //   8311: iload 9
        //   8313: istore 15
        //   8315: iload 18
        //   8317: istore 6
        //   8319: iload 12
        //   8321: istore 16
        //   8323: iload_3
        //   8324: istore 17
        //   8326: iload 48
        //   8328: istore 45
        //   8330: iload 46
        //   8332: istore 49
        //   8334: iload 4
        //   8336: istore 8
        //   8338: iload 9
        //   8340: istore 10
        //   8342: iload 20
        //   8344: istore_2
        //   8345: iload 12
        //   8347: istore 11
        //   8349: iload_3
        //   8350: istore 13
        //   8352: iload 48
        //   8354: istore 44
        //   8356: iload 46
        //   8358: istore 47
        //   8360: aload 71
        //   8362: iconst_0
        //   8363: invokevirtual 95	org/vidogram/SQLite/SQLiteCursor:b	(I)I
        //   8366: i2l
        //   8367: lstore 67
        //   8369: lload 67
        //   8371: lstore 63
        //   8373: iload 19
        //   8375: ifeq +14 -> 8389
        //   8378: lload 67
        //   8380: iload 19
        //   8382: i2l
        //   8383: bipush 32
        //   8385: lshl
        //   8386: lor
        //   8387: lstore 63
        //   8389: iload 4
        //   8391: istore 14
        //   8393: iload 9
        //   8395: istore 15
        //   8397: iload 18
        //   8399: istore 6
        //   8401: iload 12
        //   8403: istore 16
        //   8405: iload_3
        //   8406: istore 17
        //   8408: iload 48
        //   8410: istore 45
        //   8412: iload 46
        //   8414: istore 49
        //   8416: iload 4
        //   8418: istore 8
        //   8420: iload 9
        //   8422: istore 10
        //   8424: iload 20
        //   8426: istore_2
        //   8427: iload 12
        //   8429: istore 11
        //   8431: iload_3
        //   8432: istore 13
        //   8434: iload 48
        //   8436: istore 44
        //   8438: iload 46
        //   8440: istore 47
        //   8442: aload 71
        //   8444: invokevirtual 97	org/vidogram/SQLite/SQLiteCursor:b	()V
        //   8447: lload 63
        //   8449: lconst_0
        //   8450: lcmp
        //   8451: ifeq +132 -> 8583
        //   8454: iload 4
        //   8456: istore 14
        //   8458: iload 9
        //   8460: istore 15
        //   8462: iload 18
        //   8464: istore 6
        //   8466: iload 12
        //   8468: istore 16
        //   8470: iload_3
        //   8471: istore 17
        //   8473: iload 48
        //   8475: istore 45
        //   8477: iload 46
        //   8479: istore 49
        //   8481: iload 4
        //   8483: istore 8
        //   8485: iload 9
        //   8487: istore 10
        //   8489: iload 20
        //   8491: istore_2
        //   8492: iload 12
        //   8494: istore 11
        //   8496: iload_3
        //   8497: istore 13
        //   8499: iload 48
        //   8501: istore 44
        //   8503: iload 46
        //   8505: istore 47
        //   8507: aload_0
        //   8508: getfield 29	org/vidogram/messenger/w$28:i	Lorg/vidogram/messenger/w;
        //   8511: invokestatic 66	org/vidogram/messenger/w:a	(Lorg/vidogram/messenger/w;)Lorg/vidogram/SQLite/SQLiteDatabase;
        //   8514: getstatic 103	java/util/Locale:US	Ljava/util/Locale;
        //   8517: ldc_w 293
        //   8520: iconst_5
        //   8521: anewarray 4	java/lang/Object
        //   8524: dup
        //   8525: iconst_0
        //   8526: aload_0
        //   8527: getfield 37	org/vidogram/messenger/w$28:d	J
        //   8530: invokestatic 111	java/lang/Long:valueOf	(J)Ljava/lang/Long;
        //   8533: aastore
        //   8534: dup
        //   8535: iconst_1
        //   8536: aload_0
        //   8537: getfield 41	org/vidogram/messenger/w$28:f	I
        //   8540: invokestatic 124	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   8543: aastore
        //   8544: dup
        //   8545: iconst_2
        //   8546: lload 65
        //   8548: invokestatic 111	java/lang/Long:valueOf	(J)Ljava/lang/Long;
        //   8551: aastore
        //   8552: dup
        //   8553: iconst_3
        //   8554: lload 63
        //   8556: invokestatic 111	java/lang/Long:valueOf	(J)Ljava/lang/Long;
        //   8559: aastore
        //   8560: dup
        //   8561: iconst_4
        //   8562: iload 4
        //   8564: invokestatic 124	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   8567: aastore
        //   8568: invokestatic 117	java/lang/String:format	(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   8571: iconst_0
        //   8572: anewarray 4	java/lang/Object
        //   8575: invokevirtual 87	org/vidogram/SQLite/SQLiteDatabase:b	(Ljava/lang/String;[Ljava/lang/Object;)Lorg/vidogram/SQLite/SQLiteCursor;
        //   8578: astore 71
        //   8580: goto +7120 -> 15700
        //   8583: iload 4
        //   8585: istore 14
        //   8587: iload 9
        //   8589: istore 15
        //   8591: iload 18
        //   8593: istore 6
        //   8595: iload 12
        //   8597: istore 16
        //   8599: iload_3
        //   8600: istore 17
        //   8602: iload 48
        //   8604: istore 45
        //   8606: iload 46
        //   8608: istore 49
        //   8610: iload 4
        //   8612: istore 8
        //   8614: iload 9
        //   8616: istore 10
        //   8618: iload 20
        //   8620: istore_2
        //   8621: iload 12
        //   8623: istore 11
        //   8625: iload_3
        //   8626: istore 13
        //   8628: iload 48
        //   8630: istore 44
        //   8632: iload 46
        //   8634: istore 47
        //   8636: aload_0
        //   8637: getfield 29	org/vidogram/messenger/w$28:i	Lorg/vidogram/messenger/w;
        //   8640: invokestatic 66	org/vidogram/messenger/w:a	(Lorg/vidogram/messenger/w;)Lorg/vidogram/SQLite/SQLiteDatabase;
        //   8643: getstatic 103	java/util/Locale:US	Ljava/util/Locale;
        //   8646: ldc_w 295
        //   8649: iconst_4
        //   8650: anewarray 4	java/lang/Object
        //   8653: dup
        //   8654: iconst_0
        //   8655: aload_0
        //   8656: getfield 37	org/vidogram/messenger/w$28:d	J
        //   8659: invokestatic 111	java/lang/Long:valueOf	(J)Ljava/lang/Long;
        //   8662: aastore
        //   8663: dup
        //   8664: iconst_1
        //   8665: aload_0
        //   8666: getfield 41	org/vidogram/messenger/w$28:f	I
        //   8669: invokestatic 124	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   8672: aastore
        //   8673: dup
        //   8674: iconst_2
        //   8675: lload 65
        //   8677: invokestatic 111	java/lang/Long:valueOf	(J)Ljava/lang/Long;
        //   8680: aastore
        //   8681: dup
        //   8682: iconst_3
        //   8683: iload 4
        //   8685: invokestatic 124	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   8688: aastore
        //   8689: invokestatic 117	java/lang/String:format	(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   8692: iconst_0
        //   8693: anewarray 4	java/lang/Object
        //   8696: invokevirtual 87	org/vidogram/SQLite/SQLiteDatabase:b	(Ljava/lang/String;[Ljava/lang/Object;)Lorg/vidogram/SQLite/SQLiteCursor;
        //   8699: astore 71
        //   8701: goto +6999 -> 15700
        //   8704: iload 4
        //   8706: istore 14
        //   8708: iload 9
        //   8710: istore 15
        //   8712: iload 18
        //   8714: istore 6
        //   8716: iload 12
        //   8718: istore 16
        //   8720: iload_3
        //   8721: istore 17
        //   8723: iload 48
        //   8725: istore 45
        //   8727: iload 46
        //   8729: istore 49
        //   8731: iload 4
        //   8733: istore 8
        //   8735: iload 9
        //   8737: istore 10
        //   8739: iload 20
        //   8741: istore_2
        //   8742: iload 12
        //   8744: istore 11
        //   8746: iload_3
        //   8747: istore 13
        //   8749: iload 48
        //   8751: istore 44
        //   8753: iload 46
        //   8755: istore 47
        //   8757: aload_0
        //   8758: getfield 41	org/vidogram/messenger/w$28:f	I
        //   8761: ifeq +693 -> 9454
        //   8764: lload 65
        //   8766: lconst_0
        //   8767: lcmp
        //   8768: ifeq +565 -> 9333
        //   8771: lconst_0
        //   8772: lstore 63
        //   8774: iload 4
        //   8776: istore 14
        //   8778: iload 9
        //   8780: istore 15
        //   8782: iload 18
        //   8784: istore 6
        //   8786: iload 12
        //   8788: istore 16
        //   8790: iload_3
        //   8791: istore 17
        //   8793: iload 48
        //   8795: istore 45
        //   8797: iload 46
        //   8799: istore 49
        //   8801: iload 4
        //   8803: istore 8
        //   8805: iload 9
        //   8807: istore 10
        //   8809: iload 20
        //   8811: istore_2
        //   8812: iload 12
        //   8814: istore 11
        //   8816: iload_3
        //   8817: istore 13
        //   8819: iload 48
        //   8821: istore 44
        //   8823: iload 46
        //   8825: istore 47
        //   8827: aload_0
        //   8828: getfield 29	org/vidogram/messenger/w$28:i	Lorg/vidogram/messenger/w;
        //   8831: invokestatic 66	org/vidogram/messenger/w:a	(Lorg/vidogram/messenger/w;)Lorg/vidogram/SQLite/SQLiteDatabase;
        //   8834: getstatic 103	java/util/Locale:US	Ljava/util/Locale;
        //   8837: ldc 140
        //   8839: iconst_2
        //   8840: anewarray 4	java/lang/Object
        //   8843: dup
        //   8844: iconst_0
        //   8845: aload_0
        //   8846: getfield 37	org/vidogram/messenger/w$28:d	J
        //   8849: invokestatic 111	java/lang/Long:valueOf	(J)Ljava/lang/Long;
        //   8852: aastore
        //   8853: dup
        //   8854: iconst_1
        //   8855: aload_0
        //   8856: getfield 33	org/vidogram/messenger/w$28:b	I
        //   8859: invokestatic 124	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   8862: aastore
        //   8863: invokestatic 117	java/lang/String:format	(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   8866: iconst_0
        //   8867: anewarray 4	java/lang/Object
        //   8870: invokevirtual 87	org/vidogram/SQLite/SQLiteDatabase:b	(Ljava/lang/String;[Ljava/lang/Object;)Lorg/vidogram/SQLite/SQLiteCursor;
        //   8873: astore 71
        //   8875: iload 4
        //   8877: istore 14
        //   8879: iload 9
        //   8881: istore 15
        //   8883: iload 18
        //   8885: istore 6
        //   8887: iload 12
        //   8889: istore 16
        //   8891: iload_3
        //   8892: istore 17
        //   8894: iload 48
        //   8896: istore 45
        //   8898: iload 46
        //   8900: istore 49
        //   8902: iload 4
        //   8904: istore 8
        //   8906: iload 9
        //   8908: istore 10
        //   8910: iload 20
        //   8912: istore_2
        //   8913: iload 12
        //   8915: istore 11
        //   8917: iload_3
        //   8918: istore 13
        //   8920: iload 48
        //   8922: istore 44
        //   8924: iload 46
        //   8926: istore 47
        //   8928: aload 71
        //   8930: invokevirtual 92	org/vidogram/SQLite/SQLiteCursor:a	()Z
        //   8933: ifeq +85 -> 9018
        //   8936: iload 4
        //   8938: istore 14
        //   8940: iload 9
        //   8942: istore 15
        //   8944: iload 18
        //   8946: istore 6
        //   8948: iload 12
        //   8950: istore 16
        //   8952: iload_3
        //   8953: istore 17
        //   8955: iload 48
        //   8957: istore 45
        //   8959: iload 46
        //   8961: istore 49
        //   8963: iload 4
        //   8965: istore 8
        //   8967: iload 9
        //   8969: istore 10
        //   8971: iload 20
        //   8973: istore_2
        //   8974: iload 12
        //   8976: istore 11
        //   8978: iload_3
        //   8979: istore 13
        //   8981: iload 48
        //   8983: istore 44
        //   8985: iload 46
        //   8987: istore 47
        //   8989: aload 71
        //   8991: iconst_0
        //   8992: invokevirtual 95	org/vidogram/SQLite/SQLiteCursor:b	(I)I
        //   8995: i2l
        //   8996: lstore 67
        //   8998: lload 67
        //   9000: lstore 63
        //   9002: iload 19
        //   9004: ifeq +14 -> 9018
        //   9007: lload 67
        //   9009: iload 19
        //   9011: i2l
        //   9012: bipush 32
        //   9014: lshl
        //   9015: lor
        //   9016: lstore 63
        //   9018: iload 4
        //   9020: istore 14
        //   9022: iload 9
        //   9024: istore 15
        //   9026: iload 18
        //   9028: istore 6
        //   9030: iload 12
        //   9032: istore 16
        //   9034: iload_3
        //   9035: istore 17
        //   9037: iload 48
        //   9039: istore 45
        //   9041: iload 46
        //   9043: istore 49
        //   9045: iload 4
        //   9047: istore 8
        //   9049: iload 9
        //   9051: istore 10
        //   9053: iload 20
        //   9055: istore_2
        //   9056: iload 12
        //   9058: istore 11
        //   9060: iload_3
        //   9061: istore 13
        //   9063: iload 48
        //   9065: istore 44
        //   9067: iload 46
        //   9069: istore 47
        //   9071: aload 71
        //   9073: invokevirtual 97	org/vidogram/SQLite/SQLiteCursor:b	()V
        //   9076: lload 63
        //   9078: lconst_0
        //   9079: lcmp
        //   9080: ifeq +132 -> 9212
        //   9083: iload 4
        //   9085: istore 14
        //   9087: iload 9
        //   9089: istore 15
        //   9091: iload 18
        //   9093: istore 6
        //   9095: iload 12
        //   9097: istore 16
        //   9099: iload_3
        //   9100: istore 17
        //   9102: iload 48
        //   9104: istore 45
        //   9106: iload 46
        //   9108: istore 49
        //   9110: iload 4
        //   9112: istore 8
        //   9114: iload 9
        //   9116: istore 10
        //   9118: iload 20
        //   9120: istore_2
        //   9121: iload 12
        //   9123: istore 11
        //   9125: iload_3
        //   9126: istore 13
        //   9128: iload 48
        //   9130: istore 44
        //   9132: iload 46
        //   9134: istore 47
        //   9136: aload_0
        //   9137: getfield 29	org/vidogram/messenger/w$28:i	Lorg/vidogram/messenger/w;
        //   9140: invokestatic 66	org/vidogram/messenger/w:a	(Lorg/vidogram/messenger/w;)Lorg/vidogram/SQLite/SQLiteDatabase;
        //   9143: getstatic 103	java/util/Locale:US	Ljava/util/Locale;
        //   9146: ldc_w 297
        //   9149: iconst_5
        //   9150: anewarray 4	java/lang/Object
        //   9153: dup
        //   9154: iconst_0
        //   9155: aload_0
        //   9156: getfield 37	org/vidogram/messenger/w$28:d	J
        //   9159: invokestatic 111	java/lang/Long:valueOf	(J)Ljava/lang/Long;
        //   9162: aastore
        //   9163: dup
        //   9164: iconst_1
        //   9165: aload_0
        //   9166: getfield 41	org/vidogram/messenger/w$28:f	I
        //   9169: invokestatic 124	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   9172: aastore
        //   9173: dup
        //   9174: iconst_2
        //   9175: lload 65
        //   9177: invokestatic 111	java/lang/Long:valueOf	(J)Ljava/lang/Long;
        //   9180: aastore
        //   9181: dup
        //   9182: iconst_3
        //   9183: lload 63
        //   9185: invokestatic 111	java/lang/Long:valueOf	(J)Ljava/lang/Long;
        //   9188: aastore
        //   9189: dup
        //   9190: iconst_4
        //   9191: iload 4
        //   9193: invokestatic 124	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   9196: aastore
        //   9197: invokestatic 117	java/lang/String:format	(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   9200: iconst_0
        //   9201: anewarray 4	java/lang/Object
        //   9204: invokevirtual 87	org/vidogram/SQLite/SQLiteDatabase:b	(Ljava/lang/String;[Ljava/lang/Object;)Lorg/vidogram/SQLite/SQLiteCursor;
        //   9207: astore 71
        //   9209: goto +6494 -> 15703
        //   9212: iload 4
        //   9214: istore 14
        //   9216: iload 9
        //   9218: istore 15
        //   9220: iload 18
        //   9222: istore 6
        //   9224: iload 12
        //   9226: istore 16
        //   9228: iload_3
        //   9229: istore 17
        //   9231: iload 48
        //   9233: istore 45
        //   9235: iload 46
        //   9237: istore 49
        //   9239: iload 4
        //   9241: istore 8
        //   9243: iload 9
        //   9245: istore 10
        //   9247: iload 20
        //   9249: istore_2
        //   9250: iload 12
        //   9252: istore 11
        //   9254: iload_3
        //   9255: istore 13
        //   9257: iload 48
        //   9259: istore 44
        //   9261: iload 46
        //   9263: istore 47
        //   9265: aload_0
        //   9266: getfield 29	org/vidogram/messenger/w$28:i	Lorg/vidogram/messenger/w;
        //   9269: invokestatic 66	org/vidogram/messenger/w:a	(Lorg/vidogram/messenger/w;)Lorg/vidogram/SQLite/SQLiteDatabase;
        //   9272: getstatic 103	java/util/Locale:US	Ljava/util/Locale;
        //   9275: ldc_w 299
        //   9278: iconst_4
        //   9279: anewarray 4	java/lang/Object
        //   9282: dup
        //   9283: iconst_0
        //   9284: aload_0
        //   9285: getfield 37	org/vidogram/messenger/w$28:d	J
        //   9288: invokestatic 111	java/lang/Long:valueOf	(J)Ljava/lang/Long;
        //   9291: aastore
        //   9292: dup
        //   9293: iconst_1
        //   9294: aload_0
        //   9295: getfield 41	org/vidogram/messenger/w$28:f	I
        //   9298: invokestatic 124	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   9301: aastore
        //   9302: dup
        //   9303: iconst_2
        //   9304: lload 65
        //   9306: invokestatic 111	java/lang/Long:valueOf	(J)Ljava/lang/Long;
        //   9309: aastore
        //   9310: dup
        //   9311: iconst_3
        //   9312: iload 4
        //   9314: invokestatic 124	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   9317: aastore
        //   9318: invokestatic 117	java/lang/String:format	(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   9321: iconst_0
        //   9322: anewarray 4	java/lang/Object
        //   9325: invokevirtual 87	org/vidogram/SQLite/SQLiteDatabase:b	(Ljava/lang/String;[Ljava/lang/Object;)Lorg/vidogram/SQLite/SQLiteCursor;
        //   9328: astore 71
        //   9330: goto +6373 -> 15703
        //   9333: iload 4
        //   9335: istore 14
        //   9337: iload 9
        //   9339: istore 15
        //   9341: iload 18
        //   9343: istore 6
        //   9345: iload 12
        //   9347: istore 16
        //   9349: iload_3
        //   9350: istore 17
        //   9352: iload 48
        //   9354: istore 45
        //   9356: iload 46
        //   9358: istore 49
        //   9360: iload 4
        //   9362: istore 8
        //   9364: iload 9
        //   9366: istore 10
        //   9368: iload 20
        //   9370: istore_2
        //   9371: iload 12
        //   9373: istore 11
        //   9375: iload_3
        //   9376: istore 13
        //   9378: iload 48
        //   9380: istore 44
        //   9382: iload 46
        //   9384: istore 47
        //   9386: aload_0
        //   9387: getfield 29	org/vidogram/messenger/w$28:i	Lorg/vidogram/messenger/w;
        //   9390: invokestatic 66	org/vidogram/messenger/w:a	(Lorg/vidogram/messenger/w;)Lorg/vidogram/SQLite/SQLiteDatabase;
        //   9393: getstatic 103	java/util/Locale:US	Ljava/util/Locale;
        //   9396: ldc_w 301
        //   9399: iconst_4
        //   9400: anewarray 4	java/lang/Object
        //   9403: dup
        //   9404: iconst_0
        //   9405: aload_0
        //   9406: getfield 37	org/vidogram/messenger/w$28:d	J
        //   9409: invokestatic 111	java/lang/Long:valueOf	(J)Ljava/lang/Long;
        //   9412: aastore
        //   9413: dup
        //   9414: iconst_1
        //   9415: aload_0
        //   9416: getfield 41	org/vidogram/messenger/w$28:f	I
        //   9419: invokestatic 124	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   9422: aastore
        //   9423: dup
        //   9424: iconst_2
        //   9425: iload 7
        //   9427: invokestatic 124	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   9430: aastore
        //   9431: dup
        //   9432: iconst_3
        //   9433: iload 4
        //   9435: invokestatic 124	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   9438: aastore
        //   9439: invokestatic 117	java/lang/String:format	(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   9442: iconst_0
        //   9443: anewarray 4	java/lang/Object
        //   9446: invokevirtual 87	org/vidogram/SQLite/SQLiteDatabase:b	(Ljava/lang/String;[Ljava/lang/Object;)Lorg/vidogram/SQLite/SQLiteCursor;
        //   9449: astore 71
        //   9451: goto +6214 -> 15665
        //   9454: iload 4
        //   9456: istore 14
        //   9458: iload 9
        //   9460: istore 15
        //   9462: iload 18
        //   9464: istore 6
        //   9466: iload 12
        //   9468: istore 16
        //   9470: iload_3
        //   9471: istore 17
        //   9473: iload 48
        //   9475: istore 45
        //   9477: iload 46
        //   9479: istore 49
        //   9481: iload 4
        //   9483: istore 8
        //   9485: iload 9
        //   9487: istore 10
        //   9489: iload 20
        //   9491: istore_2
        //   9492: iload 12
        //   9494: istore 11
        //   9496: iload_3
        //   9497: istore 13
        //   9499: iload 48
        //   9501: istore 44
        //   9503: iload 46
        //   9505: istore 47
        //   9507: aload_0
        //   9508: getfield 29	org/vidogram/messenger/w$28:i	Lorg/vidogram/messenger/w;
        //   9511: invokestatic 66	org/vidogram/messenger/w:a	(Lorg/vidogram/messenger/w;)Lorg/vidogram/SQLite/SQLiteDatabase;
        //   9514: getstatic 103	java/util/Locale:US	Ljava/util/Locale;
        //   9517: ldc 134
        //   9519: iconst_1
        //   9520: anewarray 4	java/lang/Object
        //   9523: dup
        //   9524: iconst_0
        //   9525: aload_0
        //   9526: getfield 37	org/vidogram/messenger/w$28:d	J
        //   9529: invokestatic 111	java/lang/Long:valueOf	(J)Ljava/lang/Long;
        //   9532: aastore
        //   9533: invokestatic 117	java/lang/String:format	(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   9536: iconst_0
        //   9537: anewarray 4	java/lang/Object
        //   9540: invokevirtual 87	org/vidogram/SQLite/SQLiteDatabase:b	(Ljava/lang/String;[Ljava/lang/Object;)Lorg/vidogram/SQLite/SQLiteCursor;
        //   9543: astore 71
        //   9545: iload 4
        //   9547: istore 14
        //   9549: iload 9
        //   9551: istore 15
        //   9553: iload 18
        //   9555: istore 6
        //   9557: iload 12
        //   9559: istore 16
        //   9561: iload_3
        //   9562: istore 17
        //   9564: iload 48
        //   9566: istore 45
        //   9568: iload 46
        //   9570: istore 49
        //   9572: iload 4
        //   9574: istore 8
        //   9576: iload 9
        //   9578: istore 10
        //   9580: iload 20
        //   9582: istore_2
        //   9583: iload 12
        //   9585: istore 11
        //   9587: iload_3
        //   9588: istore 13
        //   9590: iload 48
        //   9592: istore 44
        //   9594: iload 46
        //   9596: istore 47
        //   9598: iload 22
        //   9600: istore 5
        //   9602: aload 71
        //   9604: invokevirtual 92	org/vidogram/SQLite/SQLiteCursor:a	()Z
        //   9607: ifeq +64 -> 9671
        //   9610: iload 4
        //   9612: istore 14
        //   9614: iload 9
        //   9616: istore 15
        //   9618: iload 18
        //   9620: istore 6
        //   9622: iload 12
        //   9624: istore 16
        //   9626: iload_3
        //   9627: istore 17
        //   9629: iload 48
        //   9631: istore 45
        //   9633: iload 46
        //   9635: istore 49
        //   9637: iload 4
        //   9639: istore 8
        //   9641: iload 9
        //   9643: istore 10
        //   9645: iload 20
        //   9647: istore_2
        //   9648: iload 12
        //   9650: istore 11
        //   9652: iload_3
        //   9653: istore 13
        //   9655: iload 48
        //   9657: istore 44
        //   9659: iload 46
        //   9661: istore 47
        //   9663: aload 71
        //   9665: iconst_0
        //   9666: invokevirtual 95	org/vidogram/SQLite/SQLiteCursor:b	(I)I
        //   9669: istore 5
        //   9671: iload 4
        //   9673: istore 14
        //   9675: iload 9
        //   9677: istore 15
        //   9679: iload 5
        //   9681: istore 6
        //   9683: iload 12
        //   9685: istore 16
        //   9687: iload_3
        //   9688: istore 17
        //   9690: iload 48
        //   9692: istore 45
        //   9694: iload 46
        //   9696: istore 49
        //   9698: iload 4
        //   9700: istore 8
        //   9702: iload 9
        //   9704: istore 10
        //   9706: iload 5
        //   9708: istore_2
        //   9709: iload 12
        //   9711: istore 11
        //   9713: iload_3
        //   9714: istore 13
        //   9716: iload 48
        //   9718: istore 44
        //   9720: iload 46
        //   9722: istore 47
        //   9724: aload 71
        //   9726: invokevirtual 97	org/vidogram/SQLite/SQLiteCursor:b	()V
        //   9729: lconst_0
        //   9730: lstore 63
        //   9732: iload 4
        //   9734: istore 14
        //   9736: iload 9
        //   9738: istore 15
        //   9740: iload 5
        //   9742: istore 6
        //   9744: iload 12
        //   9746: istore 16
        //   9748: iload_3
        //   9749: istore 17
        //   9751: iload 48
        //   9753: istore 45
        //   9755: iload 46
        //   9757: istore 49
        //   9759: iload 4
        //   9761: istore 8
        //   9763: iload 9
        //   9765: istore 10
        //   9767: iload 5
        //   9769: istore_2
        //   9770: iload 12
        //   9772: istore 11
        //   9774: iload_3
        //   9775: istore 13
        //   9777: iload 48
        //   9779: istore 44
        //   9781: iload 46
        //   9783: istore 47
        //   9785: aload_0
        //   9786: getfield 29	org/vidogram/messenger/w$28:i	Lorg/vidogram/messenger/w;
        //   9789: invokestatic 66	org/vidogram/messenger/w:a	(Lorg/vidogram/messenger/w;)Lorg/vidogram/SQLite/SQLiteDatabase;
        //   9792: getstatic 103	java/util/Locale:US	Ljava/util/Locale;
        //   9795: ldc_w 303
        //   9798: iconst_1
        //   9799: anewarray 4	java/lang/Object
        //   9802: dup
        //   9803: iconst_0
        //   9804: aload_0
        //   9805: getfield 37	org/vidogram/messenger/w$28:d	J
        //   9808: invokestatic 111	java/lang/Long:valueOf	(J)Ljava/lang/Long;
        //   9811: aastore
        //   9812: invokestatic 117	java/lang/String:format	(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   9815: iconst_0
        //   9816: anewarray 4	java/lang/Object
        //   9819: invokevirtual 87	org/vidogram/SQLite/SQLiteDatabase:b	(Ljava/lang/String;[Ljava/lang/Object;)Lorg/vidogram/SQLite/SQLiteCursor;
        //   9822: astore 71
        //   9824: iload 4
        //   9826: istore 14
        //   9828: iload 9
        //   9830: istore 15
        //   9832: iload 5
        //   9834: istore 6
        //   9836: iload 12
        //   9838: istore 16
        //   9840: iload_3
        //   9841: istore 17
        //   9843: iload 48
        //   9845: istore 45
        //   9847: iload 46
        //   9849: istore 49
        //   9851: iload 4
        //   9853: istore 8
        //   9855: iload 9
        //   9857: istore 10
        //   9859: iload 5
        //   9861: istore_2
        //   9862: iload 12
        //   9864: istore 11
        //   9866: iload_3
        //   9867: istore 13
        //   9869: iload 48
        //   9871: istore 44
        //   9873: iload 46
        //   9875: istore 47
        //   9877: aload 71
        //   9879: invokevirtual 92	org/vidogram/SQLite/SQLiteCursor:a	()Z
        //   9882: ifeq +85 -> 9967
        //   9885: iload 4
        //   9887: istore 14
        //   9889: iload 9
        //   9891: istore 15
        //   9893: iload 5
        //   9895: istore 6
        //   9897: iload 12
        //   9899: istore 16
        //   9901: iload_3
        //   9902: istore 17
        //   9904: iload 48
        //   9906: istore 45
        //   9908: iload 46
        //   9910: istore 49
        //   9912: iload 4
        //   9914: istore 8
        //   9916: iload 9
        //   9918: istore 10
        //   9920: iload 5
        //   9922: istore_2
        //   9923: iload 12
        //   9925: istore 11
        //   9927: iload_3
        //   9928: istore 13
        //   9930: iload 48
        //   9932: istore 44
        //   9934: iload 46
        //   9936: istore 47
        //   9938: aload 71
        //   9940: iconst_0
        //   9941: invokevirtual 95	org/vidogram/SQLite/SQLiteCursor:b	(I)I
        //   9944: i2l
        //   9945: lstore 65
        //   9947: lload 65
        //   9949: lstore 63
        //   9951: iload 19
        //   9953: ifeq +14 -> 9967
        //   9956: lload 65
        //   9958: iload 19
        //   9960: i2l
        //   9961: bipush 32
        //   9963: lshl
        //   9964: lor
        //   9965: lstore 63
        //   9967: iload 4
        //   9969: istore 14
        //   9971: iload 9
        //   9973: istore 15
        //   9975: iload 5
        //   9977: istore 6
        //   9979: iload 12
        //   9981: istore 16
        //   9983: iload_3
        //   9984: istore 17
        //   9986: iload 48
        //   9988: istore 45
        //   9990: iload 46
        //   9992: istore 49
        //   9994: iload 4
        //   9996: istore 8
        //   9998: iload 9
        //   10000: istore 10
        //   10002: iload 5
        //   10004: istore_2
        //   10005: iload 12
        //   10007: istore 11
        //   10009: iload_3
        //   10010: istore 13
        //   10012: iload 48
        //   10014: istore 44
        //   10016: iload 46
        //   10018: istore 47
        //   10020: aload 71
        //   10022: invokevirtual 97	org/vidogram/SQLite/SQLiteCursor:b	()V
        //   10025: lload 63
        //   10027: lconst_0
        //   10028: lcmp
        //   10029: ifeq +122 -> 10151
        //   10032: iload 4
        //   10034: istore 14
        //   10036: iload 9
        //   10038: istore 15
        //   10040: iload 5
        //   10042: istore 6
        //   10044: iload 12
        //   10046: istore 16
        //   10048: iload_3
        //   10049: istore 17
        //   10051: iload 48
        //   10053: istore 45
        //   10055: iload 46
        //   10057: istore 49
        //   10059: iload 4
        //   10061: istore 8
        //   10063: iload 9
        //   10065: istore 10
        //   10067: iload 5
        //   10069: istore_2
        //   10070: iload 12
        //   10072: istore 11
        //   10074: iload_3
        //   10075: istore 13
        //   10077: iload 48
        //   10079: istore 44
        //   10081: iload 46
        //   10083: istore 47
        //   10085: aload_0
        //   10086: getfield 29	org/vidogram/messenger/w$28:i	Lorg/vidogram/messenger/w;
        //   10089: invokestatic 66	org/vidogram/messenger/w:a	(Lorg/vidogram/messenger/w;)Lorg/vidogram/SQLite/SQLiteDatabase;
        //   10092: getstatic 103	java/util/Locale:US	Ljava/util/Locale;
        //   10095: ldc_w 305
        //   10098: iconst_4
        //   10099: anewarray 4	java/lang/Object
        //   10102: dup
        //   10103: iconst_0
        //   10104: aload_0
        //   10105: getfield 37	org/vidogram/messenger/w$28:d	J
        //   10108: invokestatic 111	java/lang/Long:valueOf	(J)Ljava/lang/Long;
        //   10111: aastore
        //   10112: dup
        //   10113: iconst_1
        //   10114: lload 63
        //   10116: invokestatic 111	java/lang/Long:valueOf	(J)Ljava/lang/Long;
        //   10119: aastore
        //   10120: dup
        //   10121: iconst_2
        //   10122: iload 7
        //   10124: invokestatic 124	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   10127: aastore
        //   10128: dup
        //   10129: iconst_3
        //   10130: iload 4
        //   10132: invokestatic 124	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   10135: aastore
        //   10136: invokestatic 117	java/lang/String:format	(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   10139: iconst_0
        //   10140: anewarray 4	java/lang/Object
        //   10143: invokevirtual 87	org/vidogram/SQLite/SQLiteDatabase:b	(Ljava/lang/String;[Ljava/lang/Object;)Lorg/vidogram/SQLite/SQLiteCursor;
        //   10146: astore 71
        //   10148: goto +5558 -> 15706
        //   10151: iload 4
        //   10153: istore 14
        //   10155: iload 9
        //   10157: istore 15
        //   10159: iload 5
        //   10161: istore 6
        //   10163: iload 12
        //   10165: istore 16
        //   10167: iload_3
        //   10168: istore 17
        //   10170: iload 48
        //   10172: istore 45
        //   10174: iload 46
        //   10176: istore 49
        //   10178: iload 4
        //   10180: istore 8
        //   10182: iload 9
        //   10184: istore 10
        //   10186: iload 5
        //   10188: istore_2
        //   10189: iload 12
        //   10191: istore 11
        //   10193: iload_3
        //   10194: istore 13
        //   10196: iload 48
        //   10198: istore 44
        //   10200: iload 46
        //   10202: istore 47
        //   10204: aload_0
        //   10205: getfield 29	org/vidogram/messenger/w$28:i	Lorg/vidogram/messenger/w;
        //   10208: invokestatic 66	org/vidogram/messenger/w:a	(Lorg/vidogram/messenger/w;)Lorg/vidogram/SQLite/SQLiteDatabase;
        //   10211: getstatic 103	java/util/Locale:US	Ljava/util/Locale;
        //   10214: ldc_w 307
        //   10217: iconst_3
        //   10218: anewarray 4	java/lang/Object
        //   10221: dup
        //   10222: iconst_0
        //   10223: aload_0
        //   10224: getfield 37	org/vidogram/messenger/w$28:d	J
        //   10227: invokestatic 111	java/lang/Long:valueOf	(J)Ljava/lang/Long;
        //   10230: aastore
        //   10231: dup
        //   10232: iconst_1
        //   10233: iload 7
        //   10235: invokestatic 124	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   10238: aastore
        //   10239: dup
        //   10240: iconst_2
        //   10241: iload 4
        //   10243: invokestatic 124	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   10246: aastore
        //   10247: invokestatic 117	java/lang/String:format	(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   10250: iconst_0
        //   10251: anewarray 4	java/lang/Object
        //   10254: invokevirtual 87	org/vidogram/SQLite/SQLiteDatabase:b	(Ljava/lang/String;[Ljava/lang/Object;)Lorg/vidogram/SQLite/SQLiteCursor;
        //   10257: astore 71
        //   10259: goto +5447 -> 15706
        //   10262: iconst_1
        //   10263: istore 52
        //   10265: iconst_1
        //   10266: istore 56
        //   10268: iconst_1
        //   10269: istore 57
        //   10271: iconst_1
        //   10272: istore 50
        //   10274: iconst_1
        //   10275: istore 53
        //   10277: iload 29
        //   10279: istore_1
        //   10280: iload 21
        //   10282: istore 16
        //   10284: iload 25
        //   10286: istore 5
        //   10288: iload 27
        //   10290: istore 10
        //   10292: iload 56
        //   10294: istore 47
        //   10296: iload 49
        //   10298: istore 45
        //   10300: iload 30
        //   10302: istore_2
        //   10303: iload 22
        //   10305: istore 17
        //   10307: iload 26
        //   10309: istore 6
        //   10311: iload 28
        //   10313: istore 8
        //   10315: iload 57
        //   10317: istore 48
        //   10319: iload 55
        //   10321: istore 46
        //   10323: aload_0
        //   10324: getfield 39	org/vidogram/messenger/w$28:e	I
        //   10327: iconst_1
        //   10328: if_icmpne +124 -> 10452
        //   10331: iload 29
        //   10333: istore_1
        //   10334: iload 21
        //   10336: istore 16
        //   10338: iload 25
        //   10340: istore 5
        //   10342: iload 27
        //   10344: istore 10
        //   10346: iload 56
        //   10348: istore 47
        //   10350: iload 49
        //   10352: istore 45
        //   10354: iload 30
        //   10356: istore_2
        //   10357: iload 22
        //   10359: istore 17
        //   10361: iload 26
        //   10363: istore 6
        //   10365: iload 28
        //   10367: istore 8
        //   10369: iload 57
        //   10371: istore 48
        //   10373: iload 55
        //   10375: istore 46
        //   10377: aload_0
        //   10378: getfield 29	org/vidogram/messenger/w$28:i	Lorg/vidogram/messenger/w;
        //   10381: invokestatic 66	org/vidogram/messenger/w:a	(Lorg/vidogram/messenger/w;)Lorg/vidogram/SQLite/SQLiteDatabase;
        //   10384: getstatic 103	java/util/Locale:US	Ljava/util/Locale;
        //   10387: ldc_w 309
        //   10390: iconst_3
        //   10391: anewarray 4	java/lang/Object
        //   10394: dup
        //   10395: iconst_0
        //   10396: aload_0
        //   10397: getfield 37	org/vidogram/messenger/w$28:d	J
        //   10400: invokestatic 111	java/lang/Long:valueOf	(J)Ljava/lang/Long;
        //   10403: aastore
        //   10404: dup
        //   10405: iconst_1
        //   10406: aload_0
        //   10407: getfield 33	org/vidogram/messenger/w$28:b	I
        //   10410: invokestatic 124	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   10413: aastore
        //   10414: dup
        //   10415: iconst_2
        //   10416: iload 4
        //   10418: invokestatic 124	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   10421: aastore
        //   10422: invokestatic 117	java/lang/String:format	(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   10425: iconst_0
        //   10426: anewarray 4	java/lang/Object
        //   10429: invokevirtual 87	org/vidogram/SQLite/SQLiteDatabase:b	(Ljava/lang/String;[Ljava/lang/Object;)Lorg/vidogram/SQLite/SQLiteCursor;
        //   10432: astore 71
        //   10434: iload 7
        //   10436: istore_1
        //   10437: iload 11
        //   10439: istore 5
        //   10441: iload 50
        //   10443: istore 48
        //   10445: iload 51
        //   10447: istore 46
        //   10449: goto +5216 -> 15665
        //   10452: iload 29
        //   10454: istore_1
        //   10455: iload 21
        //   10457: istore 16
        //   10459: iload 25
        //   10461: istore 5
        //   10463: iload 27
        //   10465: istore 10
        //   10467: iload 56
        //   10469: istore 47
        //   10471: iload 49
        //   10473: istore 45
        //   10475: iload 30
        //   10477: istore_2
        //   10478: iload 22
        //   10480: istore 17
        //   10482: iload 26
        //   10484: istore 6
        //   10486: iload 28
        //   10488: istore 8
        //   10490: iload 57
        //   10492: istore 48
        //   10494: iload 55
        //   10496: istore 46
        //   10498: aload_0
        //   10499: getfield 41	org/vidogram/messenger/w$28:f	I
        //   10502: ifeq +305 -> 10807
        //   10505: iload 29
        //   10507: istore_1
        //   10508: iload 21
        //   10510: istore 16
        //   10512: iload 25
        //   10514: istore 5
        //   10516: iload 27
        //   10518: istore 10
        //   10520: iload 56
        //   10522: istore 47
        //   10524: iload 49
        //   10526: istore 45
        //   10528: iload 30
        //   10530: istore_2
        //   10531: iload 22
        //   10533: istore 17
        //   10535: iload 26
        //   10537: istore 6
        //   10539: iload 28
        //   10541: istore 8
        //   10543: iload 57
        //   10545: istore 48
        //   10547: iload 55
        //   10549: istore 46
        //   10551: aload_0
        //   10552: getfield 33	org/vidogram/messenger/w$28:b	I
        //   10555: ifeq +124 -> 10679
        //   10558: iload 29
        //   10560: istore_1
        //   10561: iload 21
        //   10563: istore 16
        //   10565: iload 25
        //   10567: istore 5
        //   10569: iload 27
        //   10571: istore 10
        //   10573: iload 56
        //   10575: istore 47
        //   10577: iload 49
        //   10579: istore 45
        //   10581: iload 30
        //   10583: istore_2
        //   10584: iload 22
        //   10586: istore 17
        //   10588: iload 26
        //   10590: istore 6
        //   10592: iload 28
        //   10594: istore 8
        //   10596: iload 57
        //   10598: istore 48
        //   10600: iload 55
        //   10602: istore 46
        //   10604: aload_0
        //   10605: getfield 29	org/vidogram/messenger/w$28:i	Lorg/vidogram/messenger/w;
        //   10608: invokestatic 66	org/vidogram/messenger/w:a	(Lorg/vidogram/messenger/w;)Lorg/vidogram/SQLite/SQLiteDatabase;
        //   10611: getstatic 103	java/util/Locale:US	Ljava/util/Locale;
        //   10614: ldc_w 311
        //   10617: iconst_3
        //   10618: anewarray 4	java/lang/Object
        //   10621: dup
        //   10622: iconst_0
        //   10623: aload_0
        //   10624: getfield 37	org/vidogram/messenger/w$28:d	J
        //   10627: invokestatic 111	java/lang/Long:valueOf	(J)Ljava/lang/Long;
        //   10630: aastore
        //   10631: dup
        //   10632: iconst_1
        //   10633: aload_0
        //   10634: getfield 33	org/vidogram/messenger/w$28:b	I
        //   10637: invokestatic 124	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   10640: aastore
        //   10641: dup
        //   10642: iconst_2
        //   10643: iload 4
        //   10645: invokestatic 124	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   10648: aastore
        //   10649: invokestatic 117	java/lang/String:format	(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   10652: iconst_0
        //   10653: anewarray 4	java/lang/Object
        //   10656: invokevirtual 87	org/vidogram/SQLite/SQLiteDatabase:b	(Ljava/lang/String;[Ljava/lang/Object;)Lorg/vidogram/SQLite/SQLiteCursor;
        //   10659: astore 71
        //   10661: iload 7
        //   10663: istore_1
        //   10664: iload 11
        //   10666: istore 5
        //   10668: iload 50
        //   10670: istore 48
        //   10672: iload 51
        //   10674: istore 46
        //   10676: goto +4989 -> 15665
        //   10679: iload 29
        //   10681: istore_1
        //   10682: iload 21
        //   10684: istore 16
        //   10686: iload 25
        //   10688: istore 5
        //   10690: iload 27
        //   10692: istore 10
        //   10694: iload 56
        //   10696: istore 47
        //   10698: iload 49
        //   10700: istore 45
        //   10702: iload 30
        //   10704: istore_2
        //   10705: iload 22
        //   10707: istore 17
        //   10709: iload 26
        //   10711: istore 6
        //   10713: iload 28
        //   10715: istore 8
        //   10717: iload 57
        //   10719: istore 48
        //   10721: iload 55
        //   10723: istore 46
        //   10725: aload_0
        //   10726: getfield 29	org/vidogram/messenger/w$28:i	Lorg/vidogram/messenger/w;
        //   10729: invokestatic 66	org/vidogram/messenger/w:a	(Lorg/vidogram/messenger/w;)Lorg/vidogram/SQLite/SQLiteDatabase;
        //   10732: getstatic 103	java/util/Locale:US	Ljava/util/Locale;
        //   10735: ldc_w 313
        //   10738: iconst_4
        //   10739: anewarray 4	java/lang/Object
        //   10742: dup
        //   10743: iconst_0
        //   10744: aload_0
        //   10745: getfield 37	org/vidogram/messenger/w$28:d	J
        //   10748: invokestatic 111	java/lang/Long:valueOf	(J)Ljava/lang/Long;
        //   10751: aastore
        //   10752: dup
        //   10753: iconst_1
        //   10754: aload_0
        //   10755: getfield 41	org/vidogram/messenger/w$28:f	I
        //   10758: invokestatic 124	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   10761: aastore
        //   10762: dup
        //   10763: iconst_2
        //   10764: iconst_0
        //   10765: invokestatic 124	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   10768: aastore
        //   10769: dup
        //   10770: iconst_3
        //   10771: iload 4
        //   10773: invokestatic 124	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   10776: aastore
        //   10777: invokestatic 117	java/lang/String:format	(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   10780: iconst_0
        //   10781: anewarray 4	java/lang/Object
        //   10784: invokevirtual 87	org/vidogram/SQLite/SQLiteDatabase:b	(Ljava/lang/String;[Ljava/lang/Object;)Lorg/vidogram/SQLite/SQLiteCursor;
        //   10787: astore 71
        //   10789: iload 7
        //   10791: istore_1
        //   10792: iload 11
        //   10794: istore 5
        //   10796: iload 50
        //   10798: istore 48
        //   10800: iload 51
        //   10802: istore 46
        //   10804: goto +4861 -> 15665
        //   10807: iload 29
        //   10809: istore_1
        //   10810: iload 21
        //   10812: istore 16
        //   10814: iload 25
        //   10816: istore 5
        //   10818: iload 27
        //   10820: istore 10
        //   10822: iload 56
        //   10824: istore 47
        //   10826: iload 49
        //   10828: istore 45
        //   10830: iload 30
        //   10832: istore_2
        //   10833: iload 22
        //   10835: istore 17
        //   10837: iload 26
        //   10839: istore 6
        //   10841: iload 28
        //   10843: istore 8
        //   10845: iload 57
        //   10847: istore 48
        //   10849: iload 55
        //   10851: istore 46
        //   10853: iload 42
        //   10855: istore 9
        //   10857: iload 41
        //   10859: istore 11
        //   10861: iload 33
        //   10863: istore 12
        //   10865: iload 40
        //   10867: istore_3
        //   10868: aload_0
        //   10869: getfield 39	org/vidogram/messenger/w$28:e	I
        //   10872: iconst_2
        //   10873: if_icmpne +4836 -> 15709
        //   10876: iload 29
        //   10878: istore_1
        //   10879: iload 21
        //   10881: istore 16
        //   10883: iload 25
        //   10885: istore 5
        //   10887: iload 27
        //   10889: istore 10
        //   10891: iload 56
        //   10893: istore 47
        //   10895: iload 49
        //   10897: istore 45
        //   10899: iload 30
        //   10901: istore_2
        //   10902: iload 22
        //   10904: istore 17
        //   10906: iload 26
        //   10908: istore 6
        //   10910: iload 28
        //   10912: istore 8
        //   10914: iload 57
        //   10916: istore 48
        //   10918: iload 55
        //   10920: istore 46
        //   10922: aload_0
        //   10923: getfield 29	org/vidogram/messenger/w$28:i	Lorg/vidogram/messenger/w;
        //   10926: invokestatic 66	org/vidogram/messenger/w:a	(Lorg/vidogram/messenger/w;)Lorg/vidogram/SQLite/SQLiteDatabase;
        //   10929: getstatic 103	java/util/Locale:US	Ljava/util/Locale;
        //   10932: ldc_w 315
        //   10935: iconst_1
        //   10936: anewarray 4	java/lang/Object
        //   10939: dup
        //   10940: iconst_0
        //   10941: aload_0
        //   10942: getfield 37	org/vidogram/messenger/w$28:d	J
        //   10945: invokestatic 111	java/lang/Long:valueOf	(J)Ljava/lang/Long;
        //   10948: aastore
        //   10949: invokestatic 117	java/lang/String:format	(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   10952: iconst_0
        //   10953: anewarray 4	java/lang/Object
        //   10956: invokevirtual 87	org/vidogram/SQLite/SQLiteDatabase:b	(Ljava/lang/String;[Ljava/lang/Object;)Lorg/vidogram/SQLite/SQLiteCursor;
        //   10959: astore 71
        //   10961: iload 29
        //   10963: istore_1
        //   10964: iload 21
        //   10966: istore 16
        //   10968: iload 25
        //   10970: istore 5
        //   10972: iload 27
        //   10974: istore 10
        //   10976: iload 56
        //   10978: istore 47
        //   10980: iload 49
        //   10982: istore 45
        //   10984: iload 30
        //   10986: istore_2
        //   10987: iload 22
        //   10989: istore 17
        //   10991: iload 26
        //   10993: istore 6
        //   10995: iload 28
        //   10997: istore 8
        //   10999: iload 57
        //   11001: istore 48
        //   11003: iload 55
        //   11005: istore 46
        //   11007: aload 71
        //   11009: invokevirtual 92	org/vidogram/SQLite/SQLiteCursor:a	()Z
        //   11012: ifeq +57 -> 11069
        //   11015: iload 29
        //   11017: istore_1
        //   11018: iload 21
        //   11020: istore 16
        //   11022: iload 25
        //   11024: istore 5
        //   11026: iload 27
        //   11028: istore 10
        //   11030: iload 56
        //   11032: istore 47
        //   11034: iload 49
        //   11036: istore 45
        //   11038: iload 30
        //   11040: istore_2
        //   11041: iload 22
        //   11043: istore 17
        //   11045: iload 26
        //   11047: istore 6
        //   11049: iload 28
        //   11051: istore 8
        //   11053: iload 57
        //   11055: istore 48
        //   11057: iload 55
        //   11059: istore 46
        //   11061: aload 71
        //   11063: iconst_0
        //   11064: invokevirtual 95	org/vidogram/SQLite/SQLiteCursor:b	(I)I
        //   11067: istore 13
        //   11069: iload 29
        //   11071: istore_1
        //   11072: iload 13
        //   11074: istore 16
        //   11076: iload 25
        //   11078: istore 5
        //   11080: iload 27
        //   11082: istore 10
        //   11084: iload 56
        //   11086: istore 47
        //   11088: iload 49
        //   11090: istore 45
        //   11092: iload 30
        //   11094: istore_2
        //   11095: iload 13
        //   11097: istore 17
        //   11099: iload 26
        //   11101: istore 6
        //   11103: iload 28
        //   11105: istore 8
        //   11107: iload 57
        //   11109: istore 48
        //   11111: iload 55
        //   11113: istore 46
        //   11115: aload 71
        //   11117: invokevirtual 97	org/vidogram/SQLite/SQLiteCursor:b	()V
        //   11120: iload 29
        //   11122: istore_1
        //   11123: iload 13
        //   11125: istore 16
        //   11127: iload 25
        //   11129: istore 5
        //   11131: iload 27
        //   11133: istore 10
        //   11135: iload 56
        //   11137: istore 47
        //   11139: iload 49
        //   11141: istore 45
        //   11143: iload 30
        //   11145: istore_2
        //   11146: iload 13
        //   11148: istore 17
        //   11150: iload 26
        //   11152: istore 6
        //   11154: iload 28
        //   11156: istore 8
        //   11158: iload 57
        //   11160: istore 48
        //   11162: iload 55
        //   11164: istore 46
        //   11166: aload_0
        //   11167: getfield 29	org/vidogram/messenger/w$28:i	Lorg/vidogram/messenger/w;
        //   11170: invokestatic 66	org/vidogram/messenger/w:a	(Lorg/vidogram/messenger/w;)Lorg/vidogram/SQLite/SQLiteDatabase;
        //   11173: getstatic 103	java/util/Locale:US	Ljava/util/Locale;
        //   11176: ldc_w 317
        //   11179: iconst_1
        //   11180: anewarray 4	java/lang/Object
        //   11183: dup
        //   11184: iconst_0
        //   11185: aload_0
        //   11186: getfield 37	org/vidogram/messenger/w$28:d	J
        //   11189: invokestatic 111	java/lang/Long:valueOf	(J)Ljava/lang/Long;
        //   11192: aastore
        //   11193: invokestatic 117	java/lang/String:format	(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   11196: iconst_0
        //   11197: anewarray 4	java/lang/Object
        //   11200: invokevirtual 87	org/vidogram/SQLite/SQLiteDatabase:b	(Ljava/lang/String;[Ljava/lang/Object;)Lorg/vidogram/SQLite/SQLiteCursor;
        //   11203: astore 71
        //   11205: iload 29
        //   11207: istore_1
        //   11208: iload 13
        //   11210: istore 16
        //   11212: iload 25
        //   11214: istore 5
        //   11216: iload 27
        //   11218: istore 10
        //   11220: iload 56
        //   11222: istore 47
        //   11224: iload 49
        //   11226: istore 45
        //   11228: iload 30
        //   11230: istore_2
        //   11231: iload 13
        //   11233: istore 17
        //   11235: iload 26
        //   11237: istore 6
        //   11239: iload 28
        //   11241: istore 8
        //   11243: iload 57
        //   11245: istore 48
        //   11247: iload 55
        //   11249: istore 46
        //   11251: aload 71
        //   11253: invokevirtual 92	org/vidogram/SQLite/SQLiteCursor:a	()Z
        //   11256: ifeq +111 -> 11367
        //   11259: iload 29
        //   11261: istore_1
        //   11262: iload 13
        //   11264: istore 16
        //   11266: iload 25
        //   11268: istore 5
        //   11270: iload 27
        //   11272: istore 10
        //   11274: iload 56
        //   11276: istore 47
        //   11278: iload 49
        //   11280: istore 45
        //   11282: iload 30
        //   11284: istore_2
        //   11285: iload 13
        //   11287: istore 17
        //   11289: iload 26
        //   11291: istore 6
        //   11293: iload 28
        //   11295: istore 8
        //   11297: iload 57
        //   11299: istore 48
        //   11301: iload 55
        //   11303: istore 46
        //   11305: aload 71
        //   11307: iconst_0
        //   11308: invokevirtual 95	org/vidogram/SQLite/SQLiteCursor:b	(I)I
        //   11311: istore 14
        //   11313: iload 14
        //   11315: istore_1
        //   11316: iload 13
        //   11318: istore 16
        //   11320: iload 25
        //   11322: istore 5
        //   11324: iload 27
        //   11326: istore 10
        //   11328: iload 56
        //   11330: istore 47
        //   11332: iload 49
        //   11334: istore 45
        //   11336: iload 14
        //   11338: istore_2
        //   11339: iload 13
        //   11341: istore 17
        //   11343: iload 26
        //   11345: istore 6
        //   11347: iload 28
        //   11349: istore 8
        //   11351: iload 57
        //   11353: istore 48
        //   11355: iload 55
        //   11357: istore 46
        //   11359: aload 71
        //   11361: iconst_1
        //   11362: invokevirtual 95	org/vidogram/SQLite/SQLiteCursor:b	(I)I
        //   11365: istore 15
        //   11367: iload 14
        //   11369: istore_1
        //   11370: iload 13
        //   11372: istore 16
        //   11374: iload 25
        //   11376: istore 5
        //   11378: iload 15
        //   11380: istore 10
        //   11382: iload 56
        //   11384: istore 47
        //   11386: iload 49
        //   11388: istore 45
        //   11390: iload 14
        //   11392: istore_2
        //   11393: iload 13
        //   11395: istore 17
        //   11397: iload 26
        //   11399: istore 6
        //   11401: iload 15
        //   11403: istore 8
        //   11405: iload 57
        //   11407: istore 48
        //   11409: iload 55
        //   11411: istore 46
        //   11413: aload 71
        //   11415: invokevirtual 97	org/vidogram/SQLite/SQLiteCursor:b	()V
        //   11418: iload 14
        //   11420: istore 9
        //   11422: iload 13
        //   11424: istore 11
        //   11426: iload 33
        //   11428: istore 12
        //   11430: iload 15
        //   11432: istore_3
        //   11433: iload 14
        //   11435: ifeq +4274 -> 15709
        //   11438: iload 14
        //   11440: istore_1
        //   11441: iload 13
        //   11443: istore 16
        //   11445: iload 25
        //   11447: istore 5
        //   11449: iload 15
        //   11451: istore 10
        //   11453: iload 56
        //   11455: istore 47
        //   11457: iload 49
        //   11459: istore 45
        //   11461: iload 14
        //   11463: istore_2
        //   11464: iload 13
        //   11466: istore 17
        //   11468: iload 26
        //   11470: istore 6
        //   11472: iload 15
        //   11474: istore 8
        //   11476: iload 57
        //   11478: istore 48
        //   11480: iload 55
        //   11482: istore 46
        //   11484: aload_0
        //   11485: getfield 29	org/vidogram/messenger/w$28:i	Lorg/vidogram/messenger/w;
        //   11488: invokestatic 66	org/vidogram/messenger/w:a	(Lorg/vidogram/messenger/w;)Lorg/vidogram/SQLite/SQLiteDatabase;
        //   11491: getstatic 103	java/util/Locale:US	Ljava/util/Locale;
        //   11494: ldc_w 319
        //   11497: iconst_2
        //   11498: anewarray 4	java/lang/Object
        //   11501: dup
        //   11502: iconst_0
        //   11503: aload_0
        //   11504: getfield 37	org/vidogram/messenger/w$28:d	J
        //   11507: invokestatic 111	java/lang/Long:valueOf	(J)Ljava/lang/Long;
        //   11510: aastore
        //   11511: dup
        //   11512: iconst_1
        //   11513: iload 14
        //   11515: invokestatic 124	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   11518: aastore
        //   11519: invokestatic 117	java/lang/String:format	(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   11522: iconst_0
        //   11523: anewarray 4	java/lang/Object
        //   11526: invokevirtual 87	org/vidogram/SQLite/SQLiteDatabase:b	(Ljava/lang/String;[Ljava/lang/Object;)Lorg/vidogram/SQLite/SQLiteCursor;
        //   11529: astore 71
        //   11531: iload 18
        //   11533: istore 12
        //   11535: iload 14
        //   11537: istore_1
        //   11538: iload 13
        //   11540: istore 16
        //   11542: iload 25
        //   11544: istore 5
        //   11546: iload 15
        //   11548: istore 10
        //   11550: iload 56
        //   11552: istore 47
        //   11554: iload 49
        //   11556: istore 45
        //   11558: iload 14
        //   11560: istore_2
        //   11561: iload 13
        //   11563: istore 17
        //   11565: iload 26
        //   11567: istore 6
        //   11569: iload 15
        //   11571: istore 8
        //   11573: iload 57
        //   11575: istore 48
        //   11577: iload 55
        //   11579: istore 46
        //   11581: aload 71
        //   11583: invokevirtual 92	org/vidogram/SQLite/SQLiteCursor:a	()Z
        //   11586: ifeq +57 -> 11643
        //   11589: iload 14
        //   11591: istore_1
        //   11592: iload 13
        //   11594: istore 16
        //   11596: iload 25
        //   11598: istore 5
        //   11600: iload 15
        //   11602: istore 10
        //   11604: iload 56
        //   11606: istore 47
        //   11608: iload 49
        //   11610: istore 45
        //   11612: iload 14
        //   11614: istore_2
        //   11615: iload 13
        //   11617: istore 17
        //   11619: iload 26
        //   11621: istore 6
        //   11623: iload 15
        //   11625: istore 8
        //   11627: iload 57
        //   11629: istore 48
        //   11631: iload 55
        //   11633: istore 46
        //   11635: aload 71
        //   11637: iconst_0
        //   11638: invokevirtual 95	org/vidogram/SQLite/SQLiteCursor:b	(I)I
        //   11641: istore 12
        //   11643: iload 14
        //   11645: istore_1
        //   11646: iload 13
        //   11648: istore 16
        //   11650: iload 12
        //   11652: istore 5
        //   11654: iload 15
        //   11656: istore 10
        //   11658: iload 56
        //   11660: istore 47
        //   11662: iload 49
        //   11664: istore 45
        //   11666: iload 14
        //   11668: istore_2
        //   11669: iload 13
        //   11671: istore 17
        //   11673: iload 12
        //   11675: istore 6
        //   11677: iload 15
        //   11679: istore 8
        //   11681: iload 57
        //   11683: istore 48
        //   11685: iload 55
        //   11687: istore 46
        //   11689: aload 71
        //   11691: invokevirtual 97	org/vidogram/SQLite/SQLiteCursor:b	()V
        //   11694: iload 14
        //   11696: istore 9
        //   11698: iload 13
        //   11700: istore 11
        //   11702: iload 15
        //   11704: istore_3
        //   11705: goto +4004 -> 15709
        //   11708: iload 9
        //   11710: istore_1
        //   11711: iload 11
        //   11713: istore 16
        //   11715: iload 12
        //   11717: istore 5
        //   11719: iload_3
        //   11720: istore 10
        //   11722: iload 56
        //   11724: istore 47
        //   11726: iload 49
        //   11728: istore 45
        //   11730: iload 9
        //   11732: istore_2
        //   11733: iload 11
        //   11735: istore 17
        //   11737: iload 12
        //   11739: istore 6
        //   11741: iload_3
        //   11742: istore 8
        //   11744: iload 57
        //   11746: istore 48
        //   11748: iload 55
        //   11750: istore 46
        //   11752: iload 4
        //   11754: iload 12
        //   11756: bipush 10
        //   11758: iadd
        //   11759: invokestatic 130	java/lang/Math:max	(II)I
        //   11762: istore 13
        //   11764: iload 13
        //   11766: istore 4
        //   11768: iload 12
        //   11770: iload 20
        //   11772: if_icmpge +3738 -> 15510
        //   11775: iconst_0
        //   11776: istore 12
        //   11778: iconst_0
        //   11779: istore 9
        //   11781: iconst_0
        //   11782: istore 5
        //   11784: iconst_0
        //   11785: istore_1
        //   11786: iload 4
        //   11788: istore 14
        //   11790: iload 9
        //   11792: istore 15
        //   11794: iload 5
        //   11796: istore 6
        //   11798: iload 12
        //   11800: istore 16
        //   11802: iload_3
        //   11803: istore 17
        //   11805: iload 53
        //   11807: istore 45
        //   11809: iload 44
        //   11811: istore 49
        //   11813: iload 4
        //   11815: istore 8
        //   11817: iload 9
        //   11819: istore 10
        //   11821: iload 5
        //   11823: istore_2
        //   11824: iload 12
        //   11826: istore 11
        //   11828: iload_3
        //   11829: istore 13
        //   11831: iload 52
        //   11833: istore 44
        //   11835: iload 54
        //   11837: istore 47
        //   11839: aload_0
        //   11840: getfield 29	org/vidogram/messenger/w$28:i	Lorg/vidogram/messenger/w;
        //   11843: invokestatic 66	org/vidogram/messenger/w:a	(Lorg/vidogram/messenger/w;)Lorg/vidogram/SQLite/SQLiteDatabase;
        //   11846: getstatic 103	java/util/Locale:US	Ljava/util/Locale;
        //   11849: ldc_w 321
        //   11852: iconst_3
        //   11853: anewarray 4	java/lang/Object
        //   11856: dup
        //   11857: iconst_0
        //   11858: aload_0
        //   11859: getfield 37	org/vidogram/messenger/w$28:d	J
        //   11862: invokestatic 111	java/lang/Long:valueOf	(J)Ljava/lang/Long;
        //   11865: aastore
        //   11866: dup
        //   11867: iconst_1
        //   11868: iload_1
        //   11869: invokestatic 124	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   11872: aastore
        //   11873: dup
        //   11874: iconst_2
        //   11875: iload 4
        //   11877: invokestatic 124	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   11880: aastore
        //   11881: invokestatic 117	java/lang/String:format	(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   11884: iconst_0
        //   11885: anewarray 4	java/lang/Object
        //   11888: invokevirtual 87	org/vidogram/SQLite/SQLiteDatabase:b	(Ljava/lang/String;[Ljava/lang/Object;)Lorg/vidogram/SQLite/SQLiteCursor;
        //   11891: astore 71
        //   11893: iload 7
        //   11895: istore_1
        //   11896: iload 50
        //   11898: istore 48
        //   11900: iload 51
        //   11902: istore 46
        //   11904: goto +3761 -> 15665
        //   11907: iload 4
        //   11909: istore 14
        //   11911: iload 9
        //   11913: istore 15
        //   11915: iload 5
        //   11917: istore 6
        //   11919: iload 12
        //   11921: istore 16
        //   11923: iload_3
        //   11924: istore 17
        //   11926: iload 48
        //   11928: istore 45
        //   11930: iload 46
        //   11932: istore 49
        //   11934: iload 4
        //   11936: istore 8
        //   11938: iload 9
        //   11940: istore 10
        //   11942: iload 5
        //   11944: istore_2
        //   11945: iload 12
        //   11947: istore 11
        //   11949: iload_3
        //   11950: istore 13
        //   11952: iload 48
        //   11954: istore 44
        //   11956: iload 46
        //   11958: istore 47
        //   11960: aload 79
        //   11962: aload 80
        //   11964: getfield 189	org/vidogram/tgnet/g$ar:h	J
        //   11967: invokestatic 111	java/lang/Long:valueOf	(J)Ljava/lang/Long;
        //   11970: invokevirtual 205	java/util/ArrayList:contains	(Ljava/lang/Object;)Z
        //   11973: ifne +70 -> 12043
        //   11976: iload 4
        //   11978: istore 14
        //   11980: iload 9
        //   11982: istore 15
        //   11984: iload 5
        //   11986: istore 6
        //   11988: iload 12
        //   11990: istore 16
        //   11992: iload_3
        //   11993: istore 17
        //   11995: iload 48
        //   11997: istore 45
        //   11999: iload 46
        //   12001: istore 49
        //   12003: iload 4
        //   12005: istore 8
        //   12007: iload 9
        //   12009: istore 10
        //   12011: iload 5
        //   12013: istore_2
        //   12014: iload 12
        //   12016: istore 11
        //   12018: iload_3
        //   12019: istore 13
        //   12021: iload 48
        //   12023: istore 44
        //   12025: iload 46
        //   12027: istore 47
        //   12029: aload 79
        //   12031: aload 80
        //   12033: getfield 189	org/vidogram/tgnet/g$ar:h	J
        //   12036: invokestatic 111	java/lang/Long:valueOf	(J)Ljava/lang/Long;
        //   12039: invokevirtual 183	java/util/ArrayList:add	(Ljava/lang/Object;)Z
        //   12042: pop
        //   12043: iload 4
        //   12045: istore 14
        //   12047: iload 9
        //   12049: istore 15
        //   12051: iload 5
        //   12053: istore 6
        //   12055: iload 12
        //   12057: istore 16
        //   12059: iload_3
        //   12060: istore 17
        //   12062: iload 48
        //   12064: istore 45
        //   12066: iload 46
        //   12068: istore 49
        //   12070: iload 4
        //   12072: istore 8
        //   12074: iload 9
        //   12076: istore 10
        //   12078: iload 5
        //   12080: istore_2
        //   12081: iload 12
        //   12083: istore 11
        //   12085: iload_3
        //   12086: istore 13
        //   12088: iload 48
        //   12090: istore 44
        //   12092: iload 46
        //   12094: istore 47
        //   12096: aload 78
        //   12098: aload 80
        //   12100: getfield 189	org/vidogram/tgnet/g$ar:h	J
        //   12103: invokestatic 111	java/lang/Long:valueOf	(J)Ljava/lang/Long;
        //   12106: invokevirtual 209	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
        //   12109: checkcast 59	java/util/ArrayList
        //   12112: astore 73
        //   12114: aload 73
        //   12116: astore 72
        //   12118: aload 73
        //   12120: ifnonnull +134 -> 12254
        //   12123: iload 4
        //   12125: istore 14
        //   12127: iload 9
        //   12129: istore 15
        //   12131: iload 5
        //   12133: istore 6
        //   12135: iload 12
        //   12137: istore 16
        //   12139: iload_3
        //   12140: istore 17
        //   12142: iload 48
        //   12144: istore 45
        //   12146: iload 46
        //   12148: istore 49
        //   12150: iload 4
        //   12152: istore 8
        //   12154: iload 9
        //   12156: istore 10
        //   12158: iload 5
        //   12160: istore_2
        //   12161: iload 12
        //   12163: istore 11
        //   12165: iload_3
        //   12166: istore 13
        //   12168: iload 48
        //   12170: istore 44
        //   12172: iload 46
        //   12174: istore 47
        //   12176: new 59	java/util/ArrayList
        //   12179: dup
        //   12180: invokespecial 60	java/util/ArrayList:<init>	()V
        //   12183: astore 72
        //   12185: iload 4
        //   12187: istore 14
        //   12189: iload 9
        //   12191: istore 15
        //   12193: iload 5
        //   12195: istore 6
        //   12197: iload 12
        //   12199: istore 16
        //   12201: iload_3
        //   12202: istore 17
        //   12204: iload 48
        //   12206: istore 45
        //   12208: iload 46
        //   12210: istore 49
        //   12212: iload 4
        //   12214: istore 8
        //   12216: iload 9
        //   12218: istore 10
        //   12220: iload 5
        //   12222: istore_2
        //   12223: iload 12
        //   12225: istore 11
        //   12227: iload_3
        //   12228: istore 13
        //   12230: iload 48
        //   12232: istore 44
        //   12234: iload 46
        //   12236: istore 47
        //   12238: aload 78
        //   12240: aload 80
        //   12242: getfield 189	org/vidogram/tgnet/g$ar:h	J
        //   12245: invokestatic 111	java/lang/Long:valueOf	(J)Ljava/lang/Long;
        //   12248: aload 72
        //   12250: invokevirtual 213	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   12253: pop
        //   12254: iload 4
        //   12256: istore 14
        //   12258: iload 9
        //   12260: istore 15
        //   12262: iload 5
        //   12264: istore 6
        //   12266: iload 12
        //   12268: istore 16
        //   12270: iload_3
        //   12271: istore 17
        //   12273: iload 48
        //   12275: istore 45
        //   12277: iload 46
        //   12279: istore 49
        //   12281: iload 4
        //   12283: istore 8
        //   12285: iload 9
        //   12287: istore 10
        //   12289: iload 5
        //   12291: istore_2
        //   12292: iload 12
        //   12294: istore 11
        //   12296: iload_3
        //   12297: istore 13
        //   12299: iload 48
        //   12301: istore 44
        //   12303: iload 46
        //   12305: istore 47
        //   12307: aload 72
        //   12309: aload 80
        //   12311: invokevirtual 183	java/util/ArrayList:add	(Ljava/lang/Object;)Z
        //   12314: pop
        //   12315: goto -6759 -> 5556
        //   12318: iload 4
        //   12320: istore 14
        //   12322: iload 9
        //   12324: istore 15
        //   12326: iload 5
        //   12328: istore 6
        //   12330: iload 12
        //   12332: istore 16
        //   12334: iload_3
        //   12335: istore 17
        //   12337: iload 48
        //   12339: istore 45
        //   12341: iload 46
        //   12343: istore 49
        //   12345: iload 4
        //   12347: istore 8
        //   12349: iload 9
        //   12351: istore 10
        //   12353: iload 5
        //   12355: istore_2
        //   12356: iload 12
        //   12358: istore 11
        //   12360: iload_3
        //   12361: istore 13
        //   12363: iload 48
        //   12365: istore 44
        //   12367: iload 46
        //   12369: istore 47
        //   12371: aload 71
        //   12373: invokevirtual 97	org/vidogram/SQLite/SQLiteCursor:b	()V
        //   12376: iload 4
        //   12378: istore 14
        //   12380: iload 9
        //   12382: istore 15
        //   12384: iload 5
        //   12386: istore 6
        //   12388: iload 12
        //   12390: istore 16
        //   12392: iload_3
        //   12393: istore 17
        //   12395: iload 48
        //   12397: istore 45
        //   12399: iload 46
        //   12401: istore 49
        //   12403: iload 4
        //   12405: istore 8
        //   12407: iload 9
        //   12409: istore 10
        //   12411: iload 5
        //   12413: istore_2
        //   12414: iload 12
        //   12416: istore 11
        //   12418: iload_3
        //   12419: istore 13
        //   12421: iload 48
        //   12423: istore 44
        //   12425: iload 46
        //   12427: istore 47
        //   12429: aload 74
        //   12431: getfield 179	org/vidogram/tgnet/g$qi:c	Ljava/util/ArrayList;
        //   12434: new 13	org/vidogram/messenger/w$28$1
        //   12437: dup
        //   12438: aload_0
        //   12439: invokespecial 324	org/vidogram/messenger/w$28$1:<init>	(Lorg/vidogram/messenger/w$28;)V
        //   12442: invokestatic 330	java/util/Collections:sort	(Ljava/util/List;Ljava/util/Comparator;)V
        //   12445: iload 4
        //   12447: istore 14
        //   12449: iload 9
        //   12451: istore 15
        //   12453: iload 5
        //   12455: istore 6
        //   12457: iload 12
        //   12459: istore 16
        //   12461: iload_3
        //   12462: istore 17
        //   12464: iload 48
        //   12466: istore 45
        //   12468: iload 46
        //   12470: istore 49
        //   12472: iload 4
        //   12474: istore 8
        //   12476: iload 9
        //   12478: istore 10
        //   12480: iload 5
        //   12482: istore_2
        //   12483: iload 12
        //   12485: istore 11
        //   12487: iload_3
        //   12488: istore 13
        //   12490: iload 48
        //   12492: istore 44
        //   12494: iload 46
        //   12496: istore 47
        //   12498: aload_0
        //   12499: getfield 39	org/vidogram/messenger/w$28:e	I
        //   12502: iconst_3
        //   12503: if_icmpeq +69 -> 12572
        //   12506: iload 4
        //   12508: istore 14
        //   12510: iload 9
        //   12512: istore 15
        //   12514: iload 5
        //   12516: istore 6
        //   12518: iload 12
        //   12520: istore 16
        //   12522: iload_3
        //   12523: istore 17
        //   12525: iload 48
        //   12527: istore 45
        //   12529: iload 46
        //   12531: istore 49
        //   12533: iload 4
        //   12535: istore 8
        //   12537: iload 9
        //   12539: istore 10
        //   12541: iload 5
        //   12543: istore_2
        //   12544: iload 12
        //   12546: istore 11
        //   12548: iload_3
        //   12549: istore 13
        //   12551: iload 48
        //   12553: istore 44
        //   12555: iload 46
        //   12557: istore 47
        //   12559: aload_0
        //   12560: getfield 39	org/vidogram/messenger/w$28:e	I
        //   12563: iconst_2
        //   12564: if_icmpne +468 -> 13032
        //   12567: iload 46
        //   12569: ifeq +463 -> 13032
        //   12572: iload 4
        //   12574: istore 14
        //   12576: iload 9
        //   12578: istore 15
        //   12580: iload 5
        //   12582: istore 6
        //   12584: iload 12
        //   12586: istore 16
        //   12588: iload_3
        //   12589: istore 17
        //   12591: iload 48
        //   12593: istore 45
        //   12595: iload 46
        //   12597: istore 49
        //   12599: iload 4
        //   12601: istore 8
        //   12603: iload 9
        //   12605: istore 10
        //   12607: iload 5
        //   12609: istore_2
        //   12610: iload 12
        //   12612: istore 11
        //   12614: iload_3
        //   12615: istore 13
        //   12617: iload 48
        //   12619: istore 44
        //   12621: iload 46
        //   12623: istore 47
        //   12625: aload 74
        //   12627: getfield 179	org/vidogram/tgnet/g$qi:c	Ljava/util/ArrayList;
        //   12630: invokevirtual 333	java/util/ArrayList:isEmpty	()Z
        //   12633: ifne +399 -> 13032
        //   12636: iload 4
        //   12638: istore 14
        //   12640: iload 9
        //   12642: istore 15
        //   12644: iload 5
        //   12646: istore 6
        //   12648: iload 12
        //   12650: istore 16
        //   12652: iload_3
        //   12653: istore 17
        //   12655: iload 48
        //   12657: istore 45
        //   12659: iload 46
        //   12661: istore 49
        //   12663: iload 4
        //   12665: istore 8
        //   12667: iload 9
        //   12669: istore 10
        //   12671: iload 5
        //   12673: istore_2
        //   12674: iload 12
        //   12676: istore 11
        //   12678: iload_3
        //   12679: istore 13
        //   12681: iload 48
        //   12683: istore 44
        //   12685: iload 46
        //   12687: istore 47
        //   12689: aload 74
        //   12691: getfield 179	org/vidogram/tgnet/g$qi:c	Ljava/util/ArrayList;
        //   12694: aload 74
        //   12696: getfield 179	org/vidogram/tgnet/g$qi:c	Ljava/util/ArrayList;
        //   12699: invokevirtual 336	java/util/ArrayList:size	()I
        //   12702: iconst_1
        //   12703: isub
        //   12704: invokevirtual 339	java/util/ArrayList:get	(I)Ljava/lang/Object;
        //   12707: checkcast 152	org/vidogram/tgnet/g$ar
        //   12710: getfield 163	org/vidogram/tgnet/g$ar:b	I
        //   12713: istore 7
        //   12715: iload 4
        //   12717: istore 14
        //   12719: iload 9
        //   12721: istore 15
        //   12723: iload 5
        //   12725: istore 6
        //   12727: iload 12
        //   12729: istore 16
        //   12731: iload_3
        //   12732: istore 17
        //   12734: iload 48
        //   12736: istore 45
        //   12738: iload 46
        //   12740: istore 49
        //   12742: iload 4
        //   12744: istore 8
        //   12746: iload 9
        //   12748: istore 10
        //   12750: iload 5
        //   12752: istore_2
        //   12753: iload 12
        //   12755: istore 11
        //   12757: iload_3
        //   12758: istore 13
        //   12760: iload 48
        //   12762: istore 44
        //   12764: iload 46
        //   12766: istore 47
        //   12768: aload 74
        //   12770: getfield 179	org/vidogram/tgnet/g$qi:c	Ljava/util/ArrayList;
        //   12773: iconst_0
        //   12774: invokevirtual 339	java/util/ArrayList:get	(I)Ljava/lang/Object;
        //   12777: checkcast 152	org/vidogram/tgnet/g$ar
        //   12780: getfield 163	org/vidogram/tgnet/g$ar:b	I
        //   12783: istore 18
        //   12785: iload 7
        //   12787: iload_1
        //   12788: if_icmpgt +9 -> 12797
        //   12791: iload 18
        //   12793: iload_1
        //   12794: if_icmpge +238 -> 13032
        //   12797: iload 4
        //   12799: istore 14
        //   12801: iload 9
        //   12803: istore 15
        //   12805: iload 5
        //   12807: istore 6
        //   12809: iload 12
        //   12811: istore 16
        //   12813: iload_3
        //   12814: istore 17
        //   12816: iload 48
        //   12818: istore 45
        //   12820: iload 46
        //   12822: istore 49
        //   12824: iload 4
        //   12826: istore 8
        //   12828: iload 9
        //   12830: istore 10
        //   12832: iload 5
        //   12834: istore_2
        //   12835: iload 12
        //   12837: istore 11
        //   12839: iload_3
        //   12840: istore 13
        //   12842: iload 48
        //   12844: istore 44
        //   12846: iload 46
        //   12848: istore 47
        //   12850: aload 79
        //   12852: invokevirtual 246	java/util/ArrayList:clear	()V
        //   12855: iload 4
        //   12857: istore 14
        //   12859: iload 9
        //   12861: istore 15
        //   12863: iload 5
        //   12865: istore 6
        //   12867: iload 12
        //   12869: istore 16
        //   12871: iload_3
        //   12872: istore 17
        //   12874: iload 48
        //   12876: istore 45
        //   12878: iload 46
        //   12880: istore 49
        //   12882: iload 4
        //   12884: istore 8
        //   12886: iload 9
        //   12888: istore 10
        //   12890: iload 5
        //   12892: istore_2
        //   12893: iload 12
        //   12895: istore 11
        //   12897: iload_3
        //   12898: istore 13
        //   12900: iload 48
        //   12902: istore 44
        //   12904: iload 46
        //   12906: istore 47
        //   12908: aload 75
        //   12910: invokevirtual 246	java/util/ArrayList:clear	()V
        //   12913: iload 4
        //   12915: istore 14
        //   12917: iload 9
        //   12919: istore 15
        //   12921: iload 5
        //   12923: istore 6
        //   12925: iload 12
        //   12927: istore 16
        //   12929: iload_3
        //   12930: istore 17
        //   12932: iload 48
        //   12934: istore 45
        //   12936: iload 46
        //   12938: istore 49
        //   12940: iload 4
        //   12942: istore 8
        //   12944: iload 9
        //   12946: istore 10
        //   12948: iload 5
        //   12950: istore_2
        //   12951: iload 12
        //   12953: istore 11
        //   12955: iload_3
        //   12956: istore 13
        //   12958: iload 48
        //   12960: istore 44
        //   12962: iload 46
        //   12964: istore 47
        //   12966: aload 76
        //   12968: invokevirtual 246	java/util/ArrayList:clear	()V
        //   12971: iload 4
        //   12973: istore 14
        //   12975: iload 9
        //   12977: istore 15
        //   12979: iload 5
        //   12981: istore 6
        //   12983: iload 12
        //   12985: istore 16
        //   12987: iload_3
        //   12988: istore 17
        //   12990: iload 48
        //   12992: istore 45
        //   12994: iload 46
        //   12996: istore 49
        //   12998: iload 4
        //   13000: istore 8
        //   13002: iload 9
        //   13004: istore 10
        //   13006: iload 5
        //   13008: istore_2
        //   13009: iload 12
        //   13011: istore 11
        //   13013: iload_3
        //   13014: istore 13
        //   13016: iload 48
        //   13018: istore 44
        //   13020: iload 46
        //   13022: istore 47
        //   13024: aload 74
        //   13026: getfield 179	org/vidogram/tgnet/g$qi:c	Ljava/util/ArrayList;
        //   13029: invokevirtual 246	java/util/ArrayList:clear	()V
        //   13032: iload 4
        //   13034: istore 14
        //   13036: iload 9
        //   13038: istore 15
        //   13040: iload 5
        //   13042: istore 6
        //   13044: iload 12
        //   13046: istore 16
        //   13048: iload_3
        //   13049: istore 17
        //   13051: iload 48
        //   13053: istore 45
        //   13055: iload 46
        //   13057: istore 49
        //   13059: iload 4
        //   13061: istore 8
        //   13063: iload 9
        //   13065: istore 10
        //   13067: iload 5
        //   13069: istore_2
        //   13070: iload 12
        //   13072: istore 11
        //   13074: iload_3
        //   13075: istore 13
        //   13077: iload 48
        //   13079: istore 44
        //   13081: iload 46
        //   13083: istore 47
        //   13085: aload_0
        //   13086: getfield 39	org/vidogram/messenger/w$28:e	I
        //   13089: iconst_3
        //   13090: if_icmpne +129 -> 13219
        //   13093: iload 4
        //   13095: istore 14
        //   13097: iload 9
        //   13099: istore 15
        //   13101: iload 5
        //   13103: istore 6
        //   13105: iload 12
        //   13107: istore 16
        //   13109: iload_3
        //   13110: istore 17
        //   13112: iload 48
        //   13114: istore 45
        //   13116: iload 46
        //   13118: istore 49
        //   13120: iload 4
        //   13122: istore 8
        //   13124: iload 9
        //   13126: istore 10
        //   13128: iload 5
        //   13130: istore_2
        //   13131: iload 12
        //   13133: istore 11
        //   13135: iload_3
        //   13136: istore 13
        //   13138: iload 48
        //   13140: istore 44
        //   13142: iload 46
        //   13144: istore 47
        //   13146: aload 74
        //   13148: getfield 179	org/vidogram/tgnet/g$qi:c	Ljava/util/ArrayList;
        //   13151: invokevirtual 336	java/util/ArrayList:size	()I
        //   13154: iconst_1
        //   13155: if_icmpne +64 -> 13219
        //   13158: iload 4
        //   13160: istore 14
        //   13162: iload 9
        //   13164: istore 15
        //   13166: iload 5
        //   13168: istore 6
        //   13170: iload 12
        //   13172: istore 16
        //   13174: iload_3
        //   13175: istore 17
        //   13177: iload 48
        //   13179: istore 45
        //   13181: iload 46
        //   13183: istore 49
        //   13185: iload 4
        //   13187: istore 8
        //   13189: iload 9
        //   13191: istore 10
        //   13193: iload 5
        //   13195: istore_2
        //   13196: iload 12
        //   13198: istore 11
        //   13200: iload_3
        //   13201: istore 13
        //   13203: iload 48
        //   13205: istore 44
        //   13207: iload 46
        //   13209: istore 47
        //   13211: aload 74
        //   13213: getfield 179	org/vidogram/tgnet/g$qi:c	Ljava/util/ArrayList;
        //   13216: invokevirtual 246	java/util/ArrayList:clear	()V
        //   13219: iload 4
        //   13221: istore 14
        //   13223: iload 9
        //   13225: istore 15
        //   13227: iload 5
        //   13229: istore 6
        //   13231: iload 12
        //   13233: istore 16
        //   13235: iload_3
        //   13236: istore 17
        //   13238: iload 48
        //   13240: istore 45
        //   13242: iload 46
        //   13244: istore 49
        //   13246: iload 4
        //   13248: istore 8
        //   13250: iload 9
        //   13252: istore 10
        //   13254: iload 5
        //   13256: istore_2
        //   13257: iload 12
        //   13259: istore 11
        //   13261: iload_3
        //   13262: istore 13
        //   13264: iload 48
        //   13266: istore 44
        //   13268: iload 46
        //   13270: istore 47
        //   13272: aload 79
        //   13274: invokevirtual 333	java/util/ArrayList:isEmpty	()Z
        //   13277: ifne +1824 -> 15101
        //   13280: iload 4
        //   13282: istore 14
        //   13284: iload 9
        //   13286: istore 15
        //   13288: iload 5
        //   13290: istore 6
        //   13292: iload 12
        //   13294: istore 16
        //   13296: iload_3
        //   13297: istore 17
        //   13299: iload 48
        //   13301: istore 45
        //   13303: iload 46
        //   13305: istore 49
        //   13307: iload 4
        //   13309: istore 8
        //   13311: iload 9
        //   13313: istore 10
        //   13315: iload 5
        //   13317: istore_2
        //   13318: iload 12
        //   13320: istore 11
        //   13322: iload_3
        //   13323: istore 13
        //   13325: iload 48
        //   13327: istore 44
        //   13329: iload 46
        //   13331: istore 47
        //   13333: aload 77
        //   13335: invokevirtual 340	java/util/HashMap:isEmpty	()Z
        //   13338: ifne +875 -> 14213
        //   13341: iload 4
        //   13343: istore 14
        //   13345: iload 9
        //   13347: istore 15
        //   13349: iload 5
        //   13351: istore 6
        //   13353: iload 12
        //   13355: istore 16
        //   13357: iload_3
        //   13358: istore 17
        //   13360: iload 48
        //   13362: istore 45
        //   13364: iload 46
        //   13366: istore 49
        //   13368: iload 4
        //   13370: istore 8
        //   13372: iload 9
        //   13374: istore 10
        //   13376: iload 5
        //   13378: istore_2
        //   13379: iload 12
        //   13381: istore 11
        //   13383: iload_3
        //   13384: istore 13
        //   13386: iload 48
        //   13388: istore 44
        //   13390: iload 46
        //   13392: istore 47
        //   13394: aload_0
        //   13395: getfield 29	org/vidogram/messenger/w$28:i	Lorg/vidogram/messenger/w;
        //   13398: invokestatic 66	org/vidogram/messenger/w:a	(Lorg/vidogram/messenger/w;)Lorg/vidogram/SQLite/SQLiteDatabase;
        //   13401: getstatic 103	java/util/Locale:US	Ljava/util/Locale;
        //   13404: ldc_w 342
        //   13407: iconst_1
        //   13408: anewarray 4	java/lang/Object
        //   13411: dup
        //   13412: iconst_0
        //   13413: ldc_w 344
        //   13416: aload 79
        //   13418: invokestatic 350	android/text/TextUtils:join	(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;
        //   13421: aastore
        //   13422: invokestatic 117	java/lang/String:format	(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   13425: iconst_0
        //   13426: anewarray 4	java/lang/Object
        //   13429: invokevirtual 87	org/vidogram/SQLite/SQLiteDatabase:b	(Ljava/lang/String;[Ljava/lang/Object;)Lorg/vidogram/SQLite/SQLiteCursor;
        //   13432: astore 71
        //   13434: iload 4
        //   13436: istore 14
        //   13438: iload 9
        //   13440: istore 15
        //   13442: iload 5
        //   13444: istore 6
        //   13446: iload 12
        //   13448: istore 16
        //   13450: iload_3
        //   13451: istore 17
        //   13453: iload 48
        //   13455: istore 45
        //   13457: iload 46
        //   13459: istore 49
        //   13461: iload 4
        //   13463: istore 8
        //   13465: iload 9
        //   13467: istore 10
        //   13469: iload 5
        //   13471: istore_2
        //   13472: iload 12
        //   13474: istore 11
        //   13476: iload_3
        //   13477: istore 13
        //   13479: iload 48
        //   13481: istore 44
        //   13483: iload 46
        //   13485: istore 47
        //   13487: aload 71
        //   13489: invokevirtual 92	org/vidogram/SQLite/SQLiteCursor:a	()Z
        //   13492: ifeq +1152 -> 14644
        //   13495: iload 4
        //   13497: istore 14
        //   13499: iload 9
        //   13501: istore 15
        //   13503: iload 5
        //   13505: istore 6
        //   13507: iload 12
        //   13509: istore 16
        //   13511: iload_3
        //   13512: istore 17
        //   13514: iload 48
        //   13516: istore 45
        //   13518: iload 46
        //   13520: istore 49
        //   13522: iload 4
        //   13524: istore 8
        //   13526: iload 9
        //   13528: istore 10
        //   13530: iload 5
        //   13532: istore_2
        //   13533: iload 12
        //   13535: istore 11
        //   13537: iload_3
        //   13538: istore 13
        //   13540: iload 48
        //   13542: istore 44
        //   13544: iload 46
        //   13546: istore 47
        //   13548: aload 71
        //   13550: iconst_0
        //   13551: invokevirtual 145	org/vidogram/SQLite/SQLiteCursor:g	(I)Lorg/vidogram/tgnet/NativeByteBuffer;
        //   13554: astore 73
        //   13556: aload 73
        //   13558: ifnull -124 -> 13434
        //   13561: iload 4
        //   13563: istore 14
        //   13565: iload 9
        //   13567: istore 15
        //   13569: iload 5
        //   13571: istore 6
        //   13573: iload 12
        //   13575: istore 16
        //   13577: iload_3
        //   13578: istore 17
        //   13580: iload 48
        //   13582: istore 45
        //   13584: iload 46
        //   13586: istore 49
        //   13588: iload 4
        //   13590: istore 8
        //   13592: iload 9
        //   13594: istore 10
        //   13596: iload 5
        //   13598: istore_2
        //   13599: iload 12
        //   13601: istore 11
        //   13603: iload_3
        //   13604: istore 13
        //   13606: iload 48
        //   13608: istore 44
        //   13610: iload 46
        //   13612: istore 47
        //   13614: aload 73
        //   13616: aload 73
        //   13618: iconst_0
        //   13619: invokevirtual 150	org/vidogram/tgnet/NativeByteBuffer:b	(Z)I
        //   13622: iconst_0
        //   13623: invokestatic 155	org/vidogram/tgnet/g$ar:a	(Lorg/vidogram/tgnet/a;IZ)Lorg/vidogram/tgnet/g$ar;
        //   13626: astore 72
        //   13628: iload 4
        //   13630: istore 14
        //   13632: iload 9
        //   13634: istore 15
        //   13636: iload 5
        //   13638: istore 6
        //   13640: iload 12
        //   13642: istore 16
        //   13644: iload_3
        //   13645: istore 17
        //   13647: iload 48
        //   13649: istore 45
        //   13651: iload 46
        //   13653: istore 49
        //   13655: iload 4
        //   13657: istore 8
        //   13659: iload 9
        //   13661: istore 10
        //   13663: iload 5
        //   13665: istore_2
        //   13666: iload 12
        //   13668: istore 11
        //   13670: iload_3
        //   13671: istore 13
        //   13673: iload 48
        //   13675: istore 44
        //   13677: iload 46
        //   13679: istore 47
        //   13681: aload 73
        //   13683: invokevirtual 157	org/vidogram/tgnet/NativeByteBuffer:e	()V
        //   13686: iload 4
        //   13688: istore 14
        //   13690: iload 9
        //   13692: istore 15
        //   13694: iload 5
        //   13696: istore 6
        //   13698: iload 12
        //   13700: istore 16
        //   13702: iload_3
        //   13703: istore 17
        //   13705: iload 48
        //   13707: istore 45
        //   13709: iload 46
        //   13711: istore 49
        //   13713: iload 4
        //   13715: istore 8
        //   13717: iload 9
        //   13719: istore 10
        //   13721: iload 5
        //   13723: istore_2
        //   13724: iload 12
        //   13726: istore 11
        //   13728: iload_3
        //   13729: istore 13
        //   13731: iload 48
        //   13733: istore 44
        //   13735: iload 46
        //   13737: istore 47
        //   13739: aload 72
        //   13741: aload 71
        //   13743: iconst_1
        //   13744: invokevirtual 95	org/vidogram/SQLite/SQLiteCursor:b	(I)I
        //   13747: putfield 163	org/vidogram/tgnet/g$ar:b	I
        //   13750: iload 4
        //   13752: istore 14
        //   13754: iload 9
        //   13756: istore 15
        //   13758: iload 5
        //   13760: istore 6
        //   13762: iload 12
        //   13764: istore 16
        //   13766: iload_3
        //   13767: istore 17
        //   13769: iload 48
        //   13771: istore 45
        //   13773: iload 46
        //   13775: istore 49
        //   13777: iload 4
        //   13779: istore 8
        //   13781: iload 9
        //   13783: istore 10
        //   13785: iload 5
        //   13787: istore_2
        //   13788: iload 12
        //   13790: istore 11
        //   13792: iload_3
        //   13793: istore 13
        //   13795: iload 48
        //   13797: istore 44
        //   13799: iload 46
        //   13801: istore 47
        //   13803: aload 72
        //   13805: aload 71
        //   13807: iconst_2
        //   13808: invokevirtual 95	org/vidogram/SQLite/SQLiteCursor:b	(I)I
        //   13811: putfield 164	org/vidogram/tgnet/g$ar:e	I
        //   13814: iload 4
        //   13816: istore 14
        //   13818: iload 9
        //   13820: istore 15
        //   13822: iload 5
        //   13824: istore 6
        //   13826: iload 12
        //   13828: istore 16
        //   13830: iload_3
        //   13831: istore 17
        //   13833: iload 48
        //   13835: istore 45
        //   13837: iload 46
        //   13839: istore 49
        //   13841: iload 4
        //   13843: istore 8
        //   13845: iload 9
        //   13847: istore 10
        //   13849: iload 5
        //   13851: istore_2
        //   13852: iload 12
        //   13854: istore 11
        //   13856: iload_3
        //   13857: istore 13
        //   13859: iload 48
        //   13861: istore 44
        //   13863: iload 46
        //   13865: istore 47
        //   13867: aload 72
        //   13869: aload_0
        //   13870: getfield 37	org/vidogram/messenger/w$28:d	J
        //   13873: putfield 167	org/vidogram/tgnet/g$ar:E	J
        //   13876: iload 4
        //   13878: istore 14
        //   13880: iload 9
        //   13882: istore 15
        //   13884: iload 5
        //   13886: istore 6
        //   13888: iload 12
        //   13890: istore 16
        //   13892: iload_3
        //   13893: istore 17
        //   13895: iload 48
        //   13897: istore 45
        //   13899: iload 46
        //   13901: istore 49
        //   13903: iload 4
        //   13905: istore 8
        //   13907: iload 9
        //   13909: istore 10
        //   13911: iload 5
        //   13913: istore_2
        //   13914: iload 12
        //   13916: istore 11
        //   13918: iload_3
        //   13919: istore 13
        //   13921: iload 48
        //   13923: istore 44
        //   13925: iload 46
        //   13927: istore 47
        //   13929: aload 72
        //   13931: aload 75
        //   13933: aload 76
        //   13935: invokestatic 186	org/vidogram/messenger/w:a	(Lorg/vidogram/tgnet/g$ar;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
        //   13938: iload 4
        //   13940: istore 14
        //   13942: iload 9
        //   13944: istore 15
        //   13946: iload 5
        //   13948: istore 6
        //   13950: iload 12
        //   13952: istore 16
        //   13954: iload_3
        //   13955: istore 17
        //   13957: iload 48
        //   13959: istore 45
        //   13961: iload 46
        //   13963: istore 49
        //   13965: iload 4
        //   13967: istore 8
        //   13969: iload 9
        //   13971: istore 10
        //   13973: iload 5
        //   13975: istore_2
        //   13976: iload 12
        //   13978: istore 11
        //   13980: iload_3
        //   13981: istore 13
        //   13983: iload 48
        //   13985: istore 44
        //   13987: iload 46
        //   13989: istore 47
        //   13991: aload 77
        //   13993: invokevirtual 340	java/util/HashMap:isEmpty	()Z
        //   13996: ifne +313 -> 14309
        //   13999: iload 4
        //   14001: istore 14
        //   14003: iload 9
        //   14005: istore 15
        //   14007: iload 5
        //   14009: istore 6
        //   14011: iload 12
        //   14013: istore 16
        //   14015: iload_3
        //   14016: istore 17
        //   14018: iload 48
        //   14020: istore 45
        //   14022: iload 46
        //   14024: istore 49
        //   14026: iload 4
        //   14028: istore 8
        //   14030: iload 9
        //   14032: istore 10
        //   14034: iload 5
        //   14036: istore_2
        //   14037: iload 12
        //   14039: istore 11
        //   14041: iload_3
        //   14042: istore 13
        //   14044: iload 48
        //   14046: istore 44
        //   14048: iload 46
        //   14050: istore 47
        //   14052: aload 77
        //   14054: aload 72
        //   14056: getfield 163	org/vidogram/tgnet/g$ar:b	I
        //   14059: invokestatic 124	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   14062: invokevirtual 209	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
        //   14065: checkcast 59	java/util/ArrayList
        //   14068: astore 73
        //   14070: aload 73
        //   14072: ifnull -638 -> 13434
        //   14075: iconst_0
        //   14076: istore_1
        //   14077: iload 4
        //   14079: istore 14
        //   14081: iload 9
        //   14083: istore 15
        //   14085: iload 5
        //   14087: istore 6
        //   14089: iload 12
        //   14091: istore 16
        //   14093: iload_3
        //   14094: istore 17
        //   14096: iload 48
        //   14098: istore 45
        //   14100: iload 46
        //   14102: istore 49
        //   14104: iload 4
        //   14106: istore 8
        //   14108: iload 9
        //   14110: istore 10
        //   14112: iload 5
        //   14114: istore_2
        //   14115: iload 12
        //   14117: istore 11
        //   14119: iload_3
        //   14120: istore 13
        //   14122: iload 48
        //   14124: istore 44
        //   14126: iload 46
        //   14128: istore 47
        //   14130: iload_1
        //   14131: aload 73
        //   14133: invokevirtual 336	java/util/ArrayList:size	()I
        //   14136: if_icmpge -702 -> 13434
        //   14139: iload 4
        //   14141: istore 14
        //   14143: iload 9
        //   14145: istore 15
        //   14147: iload 5
        //   14149: istore 6
        //   14151: iload 12
        //   14153: istore 16
        //   14155: iload_3
        //   14156: istore 17
        //   14158: iload 48
        //   14160: istore 45
        //   14162: iload 46
        //   14164: istore 49
        //   14166: iload 4
        //   14168: istore 8
        //   14170: iload 9
        //   14172: istore 10
        //   14174: iload 5
        //   14176: istore_2
        //   14177: iload 12
        //   14179: istore 11
        //   14181: iload_3
        //   14182: istore 13
        //   14184: iload 48
        //   14186: istore 44
        //   14188: iload 46
        //   14190: istore 47
        //   14192: aload 73
        //   14194: iload_1
        //   14195: invokevirtual 339	java/util/ArrayList:get	(I)Ljava/lang/Object;
        //   14198: checkcast 152	org/vidogram/tgnet/g$ar
        //   14201: aload 72
        //   14203: putfield 196	org/vidogram/tgnet/g$ar:K	Lorg/vidogram/tgnet/g$ar;
        //   14206: iload_1
        //   14207: iconst_1
        //   14208: iadd
        //   14209: istore_1
        //   14210: goto -133 -> 14077
        //   14213: iload 4
        //   14215: istore 14
        //   14217: iload 9
        //   14219: istore 15
        //   14221: iload 5
        //   14223: istore 6
        //   14225: iload 12
        //   14227: istore 16
        //   14229: iload_3
        //   14230: istore 17
        //   14232: iload 48
        //   14234: istore 45
        //   14236: iload 46
        //   14238: istore 49
        //   14240: iload 4
        //   14242: istore 8
        //   14244: iload 9
        //   14246: istore 10
        //   14248: iload 5
        //   14250: istore_2
        //   14251: iload 12
        //   14253: istore 11
        //   14255: iload_3
        //   14256: istore 13
        //   14258: iload 48
        //   14260: istore 44
        //   14262: iload 46
        //   14264: istore 47
        //   14266: aload_0
        //   14267: getfield 29	org/vidogram/messenger/w$28:i	Lorg/vidogram/messenger/w;
        //   14270: invokestatic 66	org/vidogram/messenger/w:a	(Lorg/vidogram/messenger/w;)Lorg/vidogram/SQLite/SQLiteDatabase;
        //   14273: getstatic 103	java/util/Locale:US	Ljava/util/Locale;
        //   14276: ldc_w 352
        //   14279: iconst_1
        //   14280: anewarray 4	java/lang/Object
        //   14283: dup
        //   14284: iconst_0
        //   14285: ldc_w 344
        //   14288: aload 79
        //   14290: invokestatic 350	android/text/TextUtils:join	(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;
        //   14293: aastore
        //   14294: invokestatic 117	java/lang/String:format	(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   14297: iconst_0
        //   14298: anewarray 4	java/lang/Object
        //   14301: invokevirtual 87	org/vidogram/SQLite/SQLiteDatabase:b	(Ljava/lang/String;[Ljava/lang/Object;)Lorg/vidogram/SQLite/SQLiteCursor;
        //   14304: astore 71
        //   14306: goto -872 -> 13434
        //   14309: iload 4
        //   14311: istore 14
        //   14313: iload 9
        //   14315: istore 15
        //   14317: iload 5
        //   14319: istore 6
        //   14321: iload 12
        //   14323: istore 16
        //   14325: iload_3
        //   14326: istore 17
        //   14328: iload 48
        //   14330: istore 45
        //   14332: iload 46
        //   14334: istore 49
        //   14336: iload 4
        //   14338: istore 8
        //   14340: iload 9
        //   14342: istore 10
        //   14344: iload 5
        //   14346: istore_2
        //   14347: iload 12
        //   14349: istore 11
        //   14351: iload_3
        //   14352: istore 13
        //   14354: iload 48
        //   14356: istore 44
        //   14358: iload 46
        //   14360: istore 47
        //   14362: aload 78
        //   14364: aload 71
        //   14366: iconst_3
        //   14367: invokevirtual 219	org/vidogram/SQLite/SQLiteCursor:d	(I)J
        //   14370: invokestatic 111	java/lang/Long:valueOf	(J)Ljava/lang/Long;
        //   14373: invokevirtual 355	java/util/HashMap:remove	(Ljava/lang/Object;)Ljava/lang/Object;
        //   14376: checkcast 59	java/util/ArrayList
        //   14379: astore 73
        //   14381: aload 73
        //   14383: ifnull -949 -> 13434
        //   14386: iconst_0
        //   14387: istore_1
        //   14388: iload 4
        //   14390: istore 14
        //   14392: iload 9
        //   14394: istore 15
        //   14396: iload 5
        //   14398: istore 6
        //   14400: iload 12
        //   14402: istore 16
        //   14404: iload_3
        //   14405: istore 17
        //   14407: iload 48
        //   14409: istore 45
        //   14411: iload 46
        //   14413: istore 49
        //   14415: iload 4
        //   14417: istore 8
        //   14419: iload 9
        //   14421: istore 10
        //   14423: iload 5
        //   14425: istore_2
        //   14426: iload 12
        //   14428: istore 11
        //   14430: iload_3
        //   14431: istore 13
        //   14433: iload 48
        //   14435: istore 44
        //   14437: iload 46
        //   14439: istore 47
        //   14441: iload_1
        //   14442: aload 73
        //   14444: invokevirtual 336	java/util/ArrayList:size	()I
        //   14447: if_icmpge -1013 -> 13434
        //   14450: iload 4
        //   14452: istore 14
        //   14454: iload 9
        //   14456: istore 15
        //   14458: iload 5
        //   14460: istore 6
        //   14462: iload 12
        //   14464: istore 16
        //   14466: iload_3
        //   14467: istore 17
        //   14469: iload 48
        //   14471: istore 45
        //   14473: iload 46
        //   14475: istore 49
        //   14477: iload 4
        //   14479: istore 8
        //   14481: iload 9
        //   14483: istore 10
        //   14485: iload 5
        //   14487: istore_2
        //   14488: iload 12
        //   14490: istore 11
        //   14492: iload_3
        //   14493: istore 13
        //   14495: iload 48
        //   14497: istore 44
        //   14499: iload 46
        //   14501: istore 47
        //   14503: aload 73
        //   14505: iload_1
        //   14506: invokevirtual 339	java/util/ArrayList:get	(I)Ljava/lang/Object;
        //   14509: checkcast 152	org/vidogram/tgnet/g$ar
        //   14512: astore 79
        //   14514: iload 4
        //   14516: istore 14
        //   14518: iload 9
        //   14520: istore 15
        //   14522: iload 5
        //   14524: istore 6
        //   14526: iload 12
        //   14528: istore 16
        //   14530: iload_3
        //   14531: istore 17
        //   14533: iload 48
        //   14535: istore 45
        //   14537: iload 46
        //   14539: istore 49
        //   14541: iload 4
        //   14543: istore 8
        //   14545: iload 9
        //   14547: istore 10
        //   14549: iload 5
        //   14551: istore_2
        //   14552: iload 12
        //   14554: istore 11
        //   14556: iload_3
        //   14557: istore 13
        //   14559: iload 48
        //   14561: istore 44
        //   14563: iload 46
        //   14565: istore 47
        //   14567: aload 79
        //   14569: aload 72
        //   14571: putfield 196	org/vidogram/tgnet/g$ar:K	Lorg/vidogram/tgnet/g$ar;
        //   14574: iload 4
        //   14576: istore 14
        //   14578: iload 9
        //   14580: istore 15
        //   14582: iload 5
        //   14584: istore 6
        //   14586: iload 12
        //   14588: istore 16
        //   14590: iload_3
        //   14591: istore 17
        //   14593: iload 48
        //   14595: istore 45
        //   14597: iload 46
        //   14599: istore 49
        //   14601: iload 4
        //   14603: istore 8
        //   14605: iload 9
        //   14607: istore 10
        //   14609: iload 5
        //   14611: istore_2
        //   14612: iload 12
        //   14614: istore 11
        //   14616: iload_3
        //   14617: istore 13
        //   14619: iload 48
        //   14621: istore 44
        //   14623: iload 46
        //   14625: istore 47
        //   14627: aload 79
        //   14629: aload 72
        //   14631: getfield 163	org/vidogram/tgnet/g$ar:b	I
        //   14634: putfield 187	org/vidogram/tgnet/g$ar:g	I
        //   14637: iload_1
        //   14638: iconst_1
        //   14639: iadd
        //   14640: istore_1
        //   14641: goto -253 -> 14388
        //   14644: iload 4
        //   14646: istore 14
        //   14648: iload 9
        //   14650: istore 15
        //   14652: iload 5
        //   14654: istore 6
        //   14656: iload 12
        //   14658: istore 16
        //   14660: iload_3
        //   14661: istore 17
        //   14663: iload 48
        //   14665: istore 45
        //   14667: iload 46
        //   14669: istore 49
        //   14671: iload 4
        //   14673: istore 8
        //   14675: iload 9
        //   14677: istore 10
        //   14679: iload 5
        //   14681: istore_2
        //   14682: iload 12
        //   14684: istore 11
        //   14686: iload_3
        //   14687: istore 13
        //   14689: iload 48
        //   14691: istore 44
        //   14693: iload 46
        //   14695: istore 47
        //   14697: aload 71
        //   14699: invokevirtual 97	org/vidogram/SQLite/SQLiteCursor:b	()V
        //   14702: iload 4
        //   14704: istore 14
        //   14706: iload 9
        //   14708: istore 15
        //   14710: iload 5
        //   14712: istore 6
        //   14714: iload 12
        //   14716: istore 16
        //   14718: iload_3
        //   14719: istore 17
        //   14721: iload 48
        //   14723: istore 45
        //   14725: iload 46
        //   14727: istore 49
        //   14729: iload 4
        //   14731: istore 8
        //   14733: iload 9
        //   14735: istore 10
        //   14737: iload 5
        //   14739: istore_2
        //   14740: iload 12
        //   14742: istore 11
        //   14744: iload_3
        //   14745: istore 13
        //   14747: iload 48
        //   14749: istore 44
        //   14751: iload 46
        //   14753: istore 47
        //   14755: aload 78
        //   14757: invokevirtual 340	java/util/HashMap:isEmpty	()Z
        //   14760: ifne +341 -> 15101
        //   14763: iload 4
        //   14765: istore 14
        //   14767: iload 9
        //   14769: istore 15
        //   14771: iload 5
        //   14773: istore 6
        //   14775: iload 12
        //   14777: istore 16
        //   14779: iload_3
        //   14780: istore 17
        //   14782: iload 48
        //   14784: istore 45
        //   14786: iload 46
        //   14788: istore 49
        //   14790: iload 4
        //   14792: istore 8
        //   14794: iload 9
        //   14796: istore 10
        //   14798: iload 5
        //   14800: istore_2
        //   14801: iload 12
        //   14803: istore 11
        //   14805: iload_3
        //   14806: istore 13
        //   14808: iload 48
        //   14810: istore 44
        //   14812: iload 46
        //   14814: istore 47
        //   14816: aload 78
        //   14818: invokevirtual 359	java/util/HashMap:entrySet	()Ljava/util/Set;
        //   14821: invokeinterface 365 1 0
        //   14826: astore 71
        //   14828: iload 4
        //   14830: istore 14
        //   14832: iload 9
        //   14834: istore 15
        //   14836: iload 5
        //   14838: istore 6
        //   14840: iload 12
        //   14842: istore 16
        //   14844: iload_3
        //   14845: istore 17
        //   14847: iload 48
        //   14849: istore 45
        //   14851: iload 46
        //   14853: istore 49
        //   14855: iload 4
        //   14857: istore 8
        //   14859: iload 9
        //   14861: istore 10
        //   14863: iload 5
        //   14865: istore_2
        //   14866: iload 12
        //   14868: istore 11
        //   14870: iload_3
        //   14871: istore 13
        //   14873: iload 48
        //   14875: istore 44
        //   14877: iload 46
        //   14879: istore 47
        //   14881: aload 71
        //   14883: invokeinterface 370 1 0
        //   14888: ifeq +213 -> 15101
        //   14891: iload 4
        //   14893: istore 14
        //   14895: iload 9
        //   14897: istore 15
        //   14899: iload 5
        //   14901: istore 6
        //   14903: iload 12
        //   14905: istore 16
        //   14907: iload_3
        //   14908: istore 17
        //   14910: iload 48
        //   14912: istore 45
        //   14914: iload 46
        //   14916: istore 49
        //   14918: iload 4
        //   14920: istore 8
        //   14922: iload 9
        //   14924: istore 10
        //   14926: iload 5
        //   14928: istore_2
        //   14929: iload 12
        //   14931: istore 11
        //   14933: iload_3
        //   14934: istore 13
        //   14936: iload 48
        //   14938: istore 44
        //   14940: iload 46
        //   14942: istore 47
        //   14944: aload 71
        //   14946: invokeinterface 374 1 0
        //   14951: checkcast 376	java/util/Map$Entry
        //   14954: invokeinterface 379 1 0
        //   14959: checkcast 59	java/util/ArrayList
        //   14962: astore 72
        //   14964: iconst_0
        //   14965: istore_1
        //   14966: iload 4
        //   14968: istore 14
        //   14970: iload 9
        //   14972: istore 15
        //   14974: iload 5
        //   14976: istore 6
        //   14978: iload 12
        //   14980: istore 16
        //   14982: iload_3
        //   14983: istore 17
        //   14985: iload 48
        //   14987: istore 45
        //   14989: iload 46
        //   14991: istore 49
        //   14993: iload 4
        //   14995: istore 8
        //   14997: iload 9
        //   14999: istore 10
        //   15001: iload 5
        //   15003: istore_2
        //   15004: iload 12
        //   15006: istore 11
        //   15008: iload_3
        //   15009: istore 13
        //   15011: iload 48
        //   15013: istore 44
        //   15015: iload 46
        //   15017: istore 47
        //   15019: iload_1
        //   15020: aload 72
        //   15022: invokevirtual 336	java/util/ArrayList:size	()I
        //   15025: if_icmpge -197 -> 14828
        //   15028: iload 4
        //   15030: istore 14
        //   15032: iload 9
        //   15034: istore 15
        //   15036: iload 5
        //   15038: istore 6
        //   15040: iload 12
        //   15042: istore 16
        //   15044: iload_3
        //   15045: istore 17
        //   15047: iload 48
        //   15049: istore 45
        //   15051: iload 46
        //   15053: istore 49
        //   15055: iload 4
        //   15057: istore 8
        //   15059: iload 9
        //   15061: istore 10
        //   15063: iload 5
        //   15065: istore_2
        //   15066: iload 12
        //   15068: istore 11
        //   15070: iload_3
        //   15071: istore 13
        //   15073: iload 48
        //   15075: istore 44
        //   15077: iload 46
        //   15079: istore 47
        //   15081: aload 72
        //   15083: iload_1
        //   15084: invokevirtual 339	java/util/ArrayList:get	(I)Ljava/lang/Object;
        //   15087: checkcast 152	org/vidogram/tgnet/g$ar
        //   15090: lconst_0
        //   15091: putfield 189	org/vidogram/tgnet/g$ar:h	J
        //   15094: iload_1
        //   15095: iconst_1
        //   15096: iadd
        //   15097: istore_1
        //   15098: goto -132 -> 14966
        //   15101: iload 4
        //   15103: istore 14
        //   15105: iload 9
        //   15107: istore 15
        //   15109: iload 5
        //   15111: istore 6
        //   15113: iload 12
        //   15115: istore 16
        //   15117: iload_3
        //   15118: istore 17
        //   15120: iload 48
        //   15122: istore 45
        //   15124: iload 46
        //   15126: istore 49
        //   15128: iload 4
        //   15130: istore 8
        //   15132: iload 9
        //   15134: istore 10
        //   15136: iload 5
        //   15138: istore_2
        //   15139: iload 12
        //   15141: istore 11
        //   15143: iload_3
        //   15144: istore 13
        //   15146: iload 48
        //   15148: istore 44
        //   15150: iload 46
        //   15152: istore 47
        //   15154: aload 75
        //   15156: invokevirtual 333	java/util/ArrayList:isEmpty	()Z
        //   15159: ifne +76 -> 15235
        //   15162: iload 4
        //   15164: istore 14
        //   15166: iload 9
        //   15168: istore 15
        //   15170: iload 5
        //   15172: istore 6
        //   15174: iload 12
        //   15176: istore 16
        //   15178: iload_3
        //   15179: istore 17
        //   15181: iload 48
        //   15183: istore 45
        //   15185: iload 46
        //   15187: istore 49
        //   15189: iload 4
        //   15191: istore 8
        //   15193: iload 9
        //   15195: istore 10
        //   15197: iload 5
        //   15199: istore_2
        //   15200: iload 12
        //   15202: istore 11
        //   15204: iload_3
        //   15205: istore 13
        //   15207: iload 48
        //   15209: istore 44
        //   15211: iload 46
        //   15213: istore 47
        //   15215: aload_0
        //   15216: getfield 29	org/vidogram/messenger/w$28:i	Lorg/vidogram/messenger/w;
        //   15219: ldc_w 344
        //   15222: aload 75
        //   15224: invokestatic 350	android/text/TextUtils:join	(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;
        //   15227: aload 74
        //   15229: getfield 250	org/vidogram/tgnet/g$qi:e	Ljava/util/ArrayList;
        //   15232: invokevirtual 382	org/vidogram/messenger/w:a	(Ljava/lang/String;Ljava/util/ArrayList;)V
        //   15235: iload 4
        //   15237: istore 14
        //   15239: iload 9
        //   15241: istore 15
        //   15243: iload 5
        //   15245: istore 6
        //   15247: iload 12
        //   15249: istore 16
        //   15251: iload_3
        //   15252: istore 17
        //   15254: iload 48
        //   15256: istore 45
        //   15258: iload 46
        //   15260: istore 49
        //   15262: iload 4
        //   15264: istore 8
        //   15266: iload 9
        //   15268: istore 10
        //   15270: iload 5
        //   15272: istore_2
        //   15273: iload 12
        //   15275: istore 11
        //   15277: iload_3
        //   15278: istore 13
        //   15280: iload 48
        //   15282: istore 44
        //   15284: iload 46
        //   15286: istore 47
        //   15288: aload 76
        //   15290: invokevirtual 333	java/util/ArrayList:isEmpty	()Z
        //   15293: ifne +76 -> 15369
        //   15296: iload 4
        //   15298: istore 14
        //   15300: iload 9
        //   15302: istore 15
        //   15304: iload 5
        //   15306: istore 6
        //   15308: iload 12
        //   15310: istore 16
        //   15312: iload_3
        //   15313: istore 17
        //   15315: iload 48
        //   15317: istore 45
        //   15319: iload 46
        //   15321: istore 49
        //   15323: iload 4
        //   15325: istore 8
        //   15327: iload 9
        //   15329: istore 10
        //   15331: iload 5
        //   15333: istore_2
        //   15334: iload 12
        //   15336: istore 11
        //   15338: iload_3
        //   15339: istore 13
        //   15341: iload 48
        //   15343: istore 44
        //   15345: iload 46
        //   15347: istore 47
        //   15349: aload_0
        //   15350: getfield 29	org/vidogram/messenger/w$28:i	Lorg/vidogram/messenger/w;
        //   15353: ldc_w 344
        //   15356: aload 76
        //   15358: invokestatic 350	android/text/TextUtils:join	(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;
        //   15361: aload 74
        //   15363: getfield 248	org/vidogram/tgnet/g$qi:d	Ljava/util/ArrayList;
        //   15366: invokevirtual 384	org/vidogram/messenger/w:b	(Ljava/lang/String;Ljava/util/ArrayList;)V
        //   15369: invokestatic 255	org/vidogram/messenger/v:a	()Lorg/vidogram/messenger/v;
        //   15372: aload 74
        //   15374: aload_0
        //   15375: getfield 37	org/vidogram/messenger/w$28:d	J
        //   15378: iload 4
        //   15380: aload_0
        //   15381: getfield 33	org/vidogram/messenger/w$28:b	I
        //   15384: iconst_1
        //   15385: aload_0
        //   15386: getfield 43	org/vidogram/messenger/w$28:g	I
        //   15389: iload 9
        //   15391: iload 5
        //   15393: iload 12
        //   15395: iload_3
        //   15396: aload_0
        //   15397: getfield 39	org/vidogram/messenger/w$28:e	I
        //   15400: aload_0
        //   15401: getfield 35	org/vidogram/messenger/w$28:c	Z
        //   15404: iload 48
        //   15406: aload_0
        //   15407: getfield 45	org/vidogram/messenger/w$28:h	I
        //   15410: iload 46
        //   15412: invokevirtual 258	org/vidogram/messenger/v:a	(Lorg/vidogram/tgnet/g$we;JIIZIIIIIIZZIZ)V
        //   15415: return
        //   15416: astore 71
        //   15418: iload 4
        //   15420: istore_2
        //   15421: iload 10
        //   15423: istore 13
        //   15425: goto -7541 -> 7884
        //   15428: astore 71
        //   15430: iload 5
        //   15432: istore_1
        //   15433: iload 4
        //   15435: istore_2
        //   15436: iload 24
        //   15438: istore 16
        //   15440: iload 7
        //   15442: istore 5
        //   15444: iload 8
        //   15446: istore 13
        //   15448: iload 57
        //   15450: istore 47
        //   15452: iload 44
        //   15454: istore 45
        //   15456: goto -7572 -> 7884
        //   15459: astore 71
        //   15461: iload 4
        //   15463: istore 14
        //   15465: iload_2
        //   15466: istore 15
        //   15468: iload 6
        //   15470: istore 7
        //   15472: iload 8
        //   15474: istore_1
        //   15475: iload 48
        //   15477: istore 45
        //   15479: goto -9105 -> 6374
        //   15482: astore 71
        //   15484: iload 4
        //   15486: istore 14
        //   15488: iload 6
        //   15490: istore 15
        //   15492: iload 23
        //   15494: istore 17
        //   15496: iload 8
        //   15498: istore_1
        //   15499: iload 56
        //   15501: istore 45
        //   15503: iload 44
        //   15505: istore 46
        //   15507: goto -9133 -> 6374
        //   15510: iconst_0
        //   15511: istore_1
        //   15512: iload 11
        //   15514: istore 5
        //   15516: goto -3730 -> 11786
        //   15519: iconst_0
        //   15520: istore 7
        //   15522: iload 18
        //   15524: istore 4
        //   15526: iload 15
        //   15528: istore_1
        //   15529: iload 14
        //   15531: istore 12
        //   15533: iload 13
        //   15535: istore_3
        //   15536: iload 44
        //   15538: istore 46
        //   15540: lload 63
        //   15542: lstore 65
        //   15544: goto -13773 -> 1771
        //   15547: iload_1
        //   15548: istore_2
        //   15549: iload_1
        //   15550: istore_3
        //   15551: goto -8777 -> 6774
        //   15554: iload 7
        //   15556: istore 12
        //   15558: goto +54 -> 15612
        //   15561: iload_1
        //   15562: istore 9
        //   15564: iload 8
        //   15566: istore 11
        //   15568: goto -14218 -> 1350
        //   15571: iload_3
        //   15572: istore_1
        //   15573: iload_3
        //   15574: istore_2
        //   15575: iload_1
        //   15576: istore_3
        //   15577: iload_2
        //   15578: istore_1
        //   15579: goto -14367 -> 1212
        //   15582: lload 65
        //   15584: lstore 63
        //   15586: iload 7
        //   15588: istore_3
        //   15589: iconst_0
        //   15590: istore_1
        //   15591: iload 32
        //   15593: istore 7
        //   15595: iload 31
        //   15597: istore 8
        //   15599: iload 60
        //   15601: istore 44
        //   15603: goto -14391 -> 1212
        //   15606: iconst_0
        //   15607: istore 19
        //   15609: goto -15453 -> 156
        //   15612: iload 4
        //   15614: iload 12
        //   15616: if_icmpgt -13952 -> 1664
        //   15619: iload 12
        //   15621: iload 20
        //   15623: if_icmpge -8567 -> 7056
        //   15626: goto -13962 -> 1664
        //   15629: lload 63
        //   15631: lstore 69
        //   15633: lload 63
        //   15635: lconst_0
        //   15636: lcmp
        //   15637: ifne -12303 -> 3334
        //   15640: ldc2_w 385
        //   15643: lstore 69
        //   15645: iload 19
        //   15647: ifeq -12313 -> 3334
        //   15650: ldc2_w 385
        //   15653: iload 19
        //   15655: i2l
        //   15656: bipush 32
        //   15658: lshl
        //   15659: lor
        //   15660: lstore 69
        //   15662: goto -12328 -> 3334
        //   15665: aload 71
        //   15667: ifnull -3291 -> 12376
        //   15670: goto -12177 -> 3493
        //   15673: iload 5
        //   15675: istore_3
        //   15676: lload 65
        //   15678: lstore 63
        //   15680: iload_2
        //   15681: istore 9
        //   15683: iload 7
        //   15685: istore 12
        //   15687: iload 8
        //   15689: istore 11
        //   15691: goto -79 -> 15612
        //   15694: aconst_null
        //   15695: astore 71
        //   15697: goto -32 -> 15665
        //   15700: goto -35 -> 15665
        //   15703: goto -38 -> 15665
        //   15706: goto -41 -> 15665
        //   15709: iload 4
        //   15711: iload 12
        //   15713: if_icmpgt -4005 -> 11708
        //   15716: iload 12
        //   15718: iload 20
        //   15720: if_icmpge +6 -> 15726
        //   15723: goto -4015 -> 11708
        //   15726: iload 12
        //   15728: iload 4
        //   15730: isub
        //   15731: istore_1
        //   15732: iload 4
        //   15734: bipush 10
        //   15736: iadd
        //   15737: istore 4
        //   15739: iload 11
        //   15741: istore 5
        //   15743: goto -3957 -> 11786
        //
        // Exception table:
        //   from	to	target	type
        //   6148	6187	6292	java/lang/Exception
        //   6213	6221	6292	java/lang/Exception
        //   6247	6258	6292	java/lang/Exception
        //   6284	6289	6292	java/lang/Exception
        //   1839	1877	6357	java/lang/Exception
        //   1930	1938	6357	java/lang/Exception
        //   1991	2001	6357	java/lang/Exception
        //   2057	2062	6357	java/lang/Exception
        //   2115	2123	6357	java/lang/Exception
        //   2181	2189	6357	java/lang/Exception
        //   2242	2280	6357	java/lang/Exception
        //   2337	2345	6357	java/lang/Exception
        //   2398	2406	6357	java/lang/Exception
        //   2459	2464	6357	java/lang/Exception
        //   2532	2584	6357	java/lang/Exception
        //   2637	2645	6357	java/lang/Exception
        //   2701	2706	6357	java/lang/Exception
        //   2772	2817	6357	java/lang/Exception
        //   2870	2878	6357	java/lang/Exception
        //   2931	2940	6357	java/lang/Exception
        //   3013	3018	6357	java/lang/Exception
        //   3071	3116	6357	java/lang/Exception
        //   3169	3177	6357	java/lang/Exception
        //   3230	3239	6357	java/lang/Exception
        //   3312	3317	6357	java/lang/Exception
        //   3387	3490	6357	java/lang/Exception
        //   3546	3554	6357	java/lang/Exception
        //   3607	3615	6357	java/lang/Exception
        //   3673	3687	6357	java/lang/Exception
        //   3740	3745	6357	java/lang/Exception
        //   3798	3809	6357	java/lang/Exception
        //   3862	3873	6357	java/lang/Exception
        //   3926	3937	6357	java/lang/Exception
        //   3990	3999	6357	java/lang/Exception
        //   4052	4064	6357	java/lang/Exception
        //   4117	4129	6357	java/lang/Exception
        //   4187	4199	6357	java/lang/Exception
        //   4252	4263	6357	java/lang/Exception
        //   4316	4325	6357	java/lang/Exception
        //   4378	4386	6357	java/lang/Exception
        //   4439	4449	6357	java/lang/Exception
        //   4502	4512	6357	java/lang/Exception
        //   4565	4574	6357	java/lang/Exception
        //   4632	4649	6357	java/lang/Exception
        //   4702	4707	6357	java/lang/Exception
        //   4760	4768	6357	java/lang/Exception
        //   4821	4833	6357	java/lang/Exception
        //   4886	4894	6357	java/lang/Exception
        //   4947	4955	6357	java/lang/Exception
        //   5008	5016	6357	java/lang/Exception
        //   5073	5084	6357	java/lang/Exception
        //   5137	5154	6357	java/lang/Exception
        //   5207	5220	6357	java/lang/Exception
        //   5273	5284	6357	java/lang/Exception
        //   5337	5355	6357	java/lang/Exception
        //   5417	5426	6357	java/lang/Exception
        //   5479	5495	6357	java/lang/Exception
        //   5548	5556	6357	java/lang/Exception
        //   5609	5620	6357	java/lang/Exception
        //   5673	5681	6357	java/lang/Exception
        //   5734	5742	6357	java/lang/Exception
        //   5795	5801	6357	java/lang/Exception
        //   5859	5868	6357	java/lang/Exception
        //   5921	5932	6357	java/lang/Exception
        //   5985	5993	6357	java/lang/Exception
        //   6046	6054	6357	java/lang/Exception
        //   6107	6117	6357	java/lang/Exception
        //   6347	6354	6357	java/lang/Exception
        //   7145	7150	6357	java/lang/Exception
        //   7203	7242	6357	java/lang/Exception
        //   7295	7303	6357	java/lang/Exception
        //   7356	7364	6357	java/lang/Exception
        //   7422	7437	6357	java/lang/Exception
        //   7490	7495	6357	java/lang/Exception
        //   7548	7558	6357	java/lang/Exception
        //   7611	7618	6357	java/lang/Exception
        //   7671	7679	6357	java/lang/Exception
        //   7732	7738	6357	java/lang/Exception
        //   7791	7796	6357	java/lang/Exception
        //   7849	7854	6357	java/lang/Exception
        //   7991	8077	6357	java/lang/Exception
        //   8133	8141	6357	java/lang/Exception
        //   8197	8246	6357	java/lang/Exception
        //   8299	8307	6357	java/lang/Exception
        //   8360	8369	6357	java/lang/Exception
        //   8442	8447	6357	java/lang/Exception
        //   8507	8580	6357	java/lang/Exception
        //   8636	8701	6357	java/lang/Exception
        //   8757	8764	6357	java/lang/Exception
        //   8827	8875	6357	java/lang/Exception
        //   8928	8936	6357	java/lang/Exception
        //   8989	8998	6357	java/lang/Exception
        //   9071	9076	6357	java/lang/Exception
        //   9136	9209	6357	java/lang/Exception
        //   9265	9330	6357	java/lang/Exception
        //   9386	9451	6357	java/lang/Exception
        //   9507	9545	6357	java/lang/Exception
        //   9602	9610	6357	java/lang/Exception
        //   9663	9671	6357	java/lang/Exception
        //   9724	9729	6357	java/lang/Exception
        //   9785	9824	6357	java/lang/Exception
        //   9877	9885	6357	java/lang/Exception
        //   9938	9947	6357	java/lang/Exception
        //   10020	10025	6357	java/lang/Exception
        //   10085	10148	6357	java/lang/Exception
        //   10204	10259	6357	java/lang/Exception
        //   11839	11893	6357	java/lang/Exception
        //   11960	11976	6357	java/lang/Exception
        //   12029	12043	6357	java/lang/Exception
        //   12096	12114	6357	java/lang/Exception
        //   12176	12185	6357	java/lang/Exception
        //   12238	12254	6357	java/lang/Exception
        //   12307	12315	6357	java/lang/Exception
        //   12371	12376	6357	java/lang/Exception
        //   12429	12445	6357	java/lang/Exception
        //   12498	12506	6357	java/lang/Exception
        //   12559	12567	6357	java/lang/Exception
        //   12625	12636	6357	java/lang/Exception
        //   12689	12715	6357	java/lang/Exception
        //   12768	12785	6357	java/lang/Exception
        //   12850	12855	6357	java/lang/Exception
        //   12908	12913	6357	java/lang/Exception
        //   12966	12971	6357	java/lang/Exception
        //   13024	13032	6357	java/lang/Exception
        //   13085	13093	6357	java/lang/Exception
        //   13146	13158	6357	java/lang/Exception
        //   13211	13219	6357	java/lang/Exception
        //   13272	13280	6357	java/lang/Exception
        //   13333	13341	6357	java/lang/Exception
        //   13394	13434	6357	java/lang/Exception
        //   13487	13495	6357	java/lang/Exception
        //   13548	13556	6357	java/lang/Exception
        //   13614	13628	6357	java/lang/Exception
        //   13681	13686	6357	java/lang/Exception
        //   13739	13750	6357	java/lang/Exception
        //   13803	13814	6357	java/lang/Exception
        //   13867	13876	6357	java/lang/Exception
        //   13929	13938	6357	java/lang/Exception
        //   13991	13999	6357	java/lang/Exception
        //   14052	14070	6357	java/lang/Exception
        //   14130	14139	6357	java/lang/Exception
        //   14192	14206	6357	java/lang/Exception
        //   14266	14306	6357	java/lang/Exception
        //   14362	14381	6357	java/lang/Exception
        //   14441	14450	6357	java/lang/Exception
        //   14503	14514	6357	java/lang/Exception
        //   14567	14574	6357	java/lang/Exception
        //   14627	14637	6357	java/lang/Exception
        //   14697	14702	6357	java/lang/Exception
        //   14755	14763	6357	java/lang/Exception
        //   14816	14828	6357	java/lang/Exception
        //   14881	14891	6357	java/lang/Exception
        //   14944	14964	6357	java/lang/Exception
        //   15019	15028	6357	java/lang/Exception
        //   15081	15094	6357	java/lang/Exception
        //   15154	15162	6357	java/lang/Exception
        //   15215	15235	6357	java/lang/Exception
        //   15288	15296	6357	java/lang/Exception
        //   15349	15369	6357	java/lang/Exception
        //   1839	1877	7861	finally
        //   1930	1938	7861	finally
        //   1991	2001	7861	finally
        //   2057	2062	7861	finally
        //   2115	2123	7861	finally
        //   2181	2189	7861	finally
        //   2242	2280	7861	finally
        //   2337	2345	7861	finally
        //   2398	2406	7861	finally
        //   2459	2464	7861	finally
        //   2532	2584	7861	finally
        //   2637	2645	7861	finally
        //   2701	2706	7861	finally
        //   2772	2817	7861	finally
        //   2870	2878	7861	finally
        //   2931	2940	7861	finally
        //   3013	3018	7861	finally
        //   3071	3116	7861	finally
        //   3169	3177	7861	finally
        //   3230	3239	7861	finally
        //   3312	3317	7861	finally
        //   3387	3490	7861	finally
        //   3546	3554	7861	finally
        //   3607	3615	7861	finally
        //   3673	3687	7861	finally
        //   3740	3745	7861	finally
        //   3798	3809	7861	finally
        //   3862	3873	7861	finally
        //   3926	3937	7861	finally
        //   3990	3999	7861	finally
        //   4052	4064	7861	finally
        //   4117	4129	7861	finally
        //   4187	4199	7861	finally
        //   4252	4263	7861	finally
        //   4316	4325	7861	finally
        //   4378	4386	7861	finally
        //   4439	4449	7861	finally
        //   4502	4512	7861	finally
        //   4565	4574	7861	finally
        //   4632	4649	7861	finally
        //   4702	4707	7861	finally
        //   4760	4768	7861	finally
        //   4821	4833	7861	finally
        //   4886	4894	7861	finally
        //   4947	4955	7861	finally
        //   5008	5016	7861	finally
        //   5073	5084	7861	finally
        //   5137	5154	7861	finally
        //   5207	5220	7861	finally
        //   5273	5284	7861	finally
        //   5337	5355	7861	finally
        //   5417	5426	7861	finally
        //   5479	5495	7861	finally
        //   5548	5556	7861	finally
        //   5609	5620	7861	finally
        //   5673	5681	7861	finally
        //   5734	5742	7861	finally
        //   5795	5801	7861	finally
        //   5859	5868	7861	finally
        //   5921	5932	7861	finally
        //   5985	5993	7861	finally
        //   6046	6054	7861	finally
        //   6107	6117	7861	finally
        //   6148	6187	7861	finally
        //   6213	6221	7861	finally
        //   6247	6258	7861	finally
        //   6284	6289	7861	finally
        //   6347	6354	7861	finally
        //   6400	6408	7861	finally
        //   6434	6442	7861	finally
        //   6468	6476	7861	finally
        //   6502	6509	7861	finally
        //   7145	7150	7861	finally
        //   7203	7242	7861	finally
        //   7295	7303	7861	finally
        //   7356	7364	7861	finally
        //   7422	7437	7861	finally
        //   7490	7495	7861	finally
        //   7548	7558	7861	finally
        //   7611	7618	7861	finally
        //   7671	7679	7861	finally
        //   7732	7738	7861	finally
        //   7791	7796	7861	finally
        //   7849	7854	7861	finally
        //   7991	8077	7861	finally
        //   8133	8141	7861	finally
        //   8197	8246	7861	finally
        //   8299	8307	7861	finally
        //   8360	8369	7861	finally
        //   8442	8447	7861	finally
        //   8507	8580	7861	finally
        //   8636	8701	7861	finally
        //   8757	8764	7861	finally
        //   8827	8875	7861	finally
        //   8928	8936	7861	finally
        //   8989	8998	7861	finally
        //   9071	9076	7861	finally
        //   9136	9209	7861	finally
        //   9265	9330	7861	finally
        //   9386	9451	7861	finally
        //   9507	9545	7861	finally
        //   9602	9610	7861	finally
        //   9663	9671	7861	finally
        //   9724	9729	7861	finally
        //   9785	9824	7861	finally
        //   9877	9885	7861	finally
        //   9938	9947	7861	finally
        //   10020	10025	7861	finally
        //   10085	10148	7861	finally
        //   10204	10259	7861	finally
        //   11839	11893	7861	finally
        //   11960	11976	7861	finally
        //   12029	12043	7861	finally
        //   12096	12114	7861	finally
        //   12176	12185	7861	finally
        //   12238	12254	7861	finally
        //   12307	12315	7861	finally
        //   12371	12376	7861	finally
        //   12429	12445	7861	finally
        //   12498	12506	7861	finally
        //   12559	12567	7861	finally
        //   12625	12636	7861	finally
        //   12689	12715	7861	finally
        //   12768	12785	7861	finally
        //   12850	12855	7861	finally
        //   12908	12913	7861	finally
        //   12966	12971	7861	finally
        //   13024	13032	7861	finally
        //   13085	13093	7861	finally
        //   13146	13158	7861	finally
        //   13211	13219	7861	finally
        //   13272	13280	7861	finally
        //   13333	13341	7861	finally
        //   13394	13434	7861	finally
        //   13487	13495	7861	finally
        //   13548	13556	7861	finally
        //   13614	13628	7861	finally
        //   13681	13686	7861	finally
        //   13739	13750	7861	finally
        //   13803	13814	7861	finally
        //   13867	13876	7861	finally
        //   13929	13938	7861	finally
        //   13991	13999	7861	finally
        //   14052	14070	7861	finally
        //   14130	14139	7861	finally
        //   14192	14206	7861	finally
        //   14266	14306	7861	finally
        //   14362	14381	7861	finally
        //   14441	14450	7861	finally
        //   14503	14514	7861	finally
        //   14567	14574	7861	finally
        //   14627	14637	7861	finally
        //   14697	14702	7861	finally
        //   14755	14763	7861	finally
        //   14816	14828	7861	finally
        //   14881	14891	7861	finally
        //   14944	14964	7861	finally
        //   15019	15028	7861	finally
        //   15081	15094	7861	finally
        //   15154	15162	7861	finally
        //   15215	15235	7861	finally
        //   15288	15296	7861	finally
        //   15349	15369	7861	finally
        //   268	277	15416	finally
        //   323	332	15416	finally
        //   378	387	15416	finally
        //   433	442	15416	finally
        //   488	497	15416	finally
        //   543	550	15416	finally
        //   629	637	15416	finally
        //   711	719	15416	finally
        //   793	800	15416	finally
        //   869	877	15416	finally
        //   923	961	15416	finally
        //   1007	1015	15416	finally
        //   1061	1068	15416	finally
        //   1116	1124	15416	finally
        //   1168	1176	15416	finally
        //   1342	1350	15416	finally
        //   1396	1401	15416	finally
        //   1452	1498	15416	finally
        //   1548	1556	15416	finally
        //   1602	1610	15416	finally
        //   1656	1661	15416	finally
        //   1710	1722	15416	finally
        //   10323	10331	15416	finally
        //   10377	10434	15416	finally
        //   10498	10505	15416	finally
        //   10551	10558	15416	finally
        //   10604	10661	15416	finally
        //   10725	10789	15416	finally
        //   10868	10876	15416	finally
        //   10922	10961	15416	finally
        //   11007	11015	15416	finally
        //   11061	11069	15416	finally
        //   11115	11120	15416	finally
        //   11166	11205	15416	finally
        //   11251	11259	15416	finally
        //   11305	11313	15416	finally
        //   11359	11367	15416	finally
        //   11413	11418	15416	finally
        //   11484	11531	15416	finally
        //   11581	11589	15416	finally
        //   11635	11643	15416	finally
        //   11689	11694	15416	finally
        //   11752	11764	15416	finally
        //   1218	1223	15428	finally
        //   1234	1272	15428	finally
        //   1278	1286	15428	finally
        //   1292	1300	15428	finally
        //   6575	6614	15428	finally
        //   6620	6628	15428	finally
        //   6634	6642	15428	finally
        //   6648	6653	15428	finally
        //   6675	6714	15428	finally
        //   6722	6730	15428	finally
        //   6736	6743	15428	finally
        //   6780	6785	15428	finally
        //   6801	6854	15428	finally
        //   6860	6868	15428	finally
        //   6877	6882	15428	finally
        //   6899	6945	15428	finally
        //   6951	6959	15428	finally
        //   6965	6972	15428	finally
        //   7019	7024	15428	finally
        //   268	277	15459	java/lang/Exception
        //   323	332	15459	java/lang/Exception
        //   378	387	15459	java/lang/Exception
        //   433	442	15459	java/lang/Exception
        //   488	497	15459	java/lang/Exception
        //   543	550	15459	java/lang/Exception
        //   629	637	15459	java/lang/Exception
        //   711	719	15459	java/lang/Exception
        //   793	800	15459	java/lang/Exception
        //   869	877	15459	java/lang/Exception
        //   923	961	15459	java/lang/Exception
        //   1007	1015	15459	java/lang/Exception
        //   1061	1068	15459	java/lang/Exception
        //   1116	1124	15459	java/lang/Exception
        //   1168	1176	15459	java/lang/Exception
        //   1342	1350	15459	java/lang/Exception
        //   1396	1401	15459	java/lang/Exception
        //   1452	1498	15459	java/lang/Exception
        //   1548	1556	15459	java/lang/Exception
        //   1602	1610	15459	java/lang/Exception
        //   1656	1661	15459	java/lang/Exception
        //   1710	1722	15459	java/lang/Exception
        //   10323	10331	15459	java/lang/Exception
        //   10377	10434	15459	java/lang/Exception
        //   10498	10505	15459	java/lang/Exception
        //   10551	10558	15459	java/lang/Exception
        //   10604	10661	15459	java/lang/Exception
        //   10725	10789	15459	java/lang/Exception
        //   10868	10876	15459	java/lang/Exception
        //   10922	10961	15459	java/lang/Exception
        //   11007	11015	15459	java/lang/Exception
        //   11061	11069	15459	java/lang/Exception
        //   11115	11120	15459	java/lang/Exception
        //   11166	11205	15459	java/lang/Exception
        //   11251	11259	15459	java/lang/Exception
        //   11305	11313	15459	java/lang/Exception
        //   11359	11367	15459	java/lang/Exception
        //   11413	11418	15459	java/lang/Exception
        //   11484	11531	15459	java/lang/Exception
        //   11581	11589	15459	java/lang/Exception
        //   11635	11643	15459	java/lang/Exception
        //   11689	11694	15459	java/lang/Exception
        //   11752	11764	15459	java/lang/Exception
        //   1218	1223	15482	java/lang/Exception
        //   1234	1272	15482	java/lang/Exception
        //   1278	1286	15482	java/lang/Exception
        //   1292	1300	15482	java/lang/Exception
        //   6575	6614	15482	java/lang/Exception
        //   6620	6628	15482	java/lang/Exception
        //   6634	6642	15482	java/lang/Exception
        //   6648	6653	15482	java/lang/Exception
        //   6675	6714	15482	java/lang/Exception
        //   6722	6730	15482	java/lang/Exception
        //   6736	6743	15482	java/lang/Exception
        //   6780	6785	15482	java/lang/Exception
        //   6801	6854	15482	java/lang/Exception
        //   6860	6868	15482	java/lang/Exception
        //   6877	6882	15482	java/lang/Exception
        //   6899	6945	15482	java/lang/Exception
        //   6951	6959	15482	java/lang/Exception
        //   6965	6972	15482	java/lang/Exception
        //   7019	7024	15482	java/lang/Exception
      }
    });
  }

  public void a(long paramLong, int paramInt, boolean paramBoolean)
  {
    this.h.b(new Runnable(paramBoolean, paramInt, paramLong)
    {
      public void run()
      {
        while (true)
        {
          try
          {
            if (!this.a)
              continue;
            SQLiteCursor localSQLiteCursor = w.a(w.this).b(String.format(Locale.US, "SELECT min(date) FROM download_queue WHERE type = %d", new Object[] { Integer.valueOf(this.b) }), new Object[0]);
            if (localSQLiteCursor.a())
            {
              i = localSQLiteCursor.b(0);
              localSQLiteCursor.b();
              if (i == -1)
                break;
              w.a(w.this).a(String.format(Locale.US, "UPDATE download_queue SET date = %d WHERE uid = %d AND type = %d", new Object[] { Integer.valueOf(i - 1), Long.valueOf(this.c), Integer.valueOf(this.b) })).c().e();
              return;
              w.a(w.this).a(String.format(Locale.US, "DELETE FROM download_queue WHERE uid = %d AND type = %d", new Object[] { Long.valueOf(this.c), Integer.valueOf(this.b) })).c().e();
              return;
            }
          }
          catch (Exception localException)
          {
            n.a("tmessages", localException);
            return;
          }
          int i = -1;
        }
      }
    });
  }

  public void a(long paramLong1, long paramLong2)
  {
    this.h.b(new Runnable(paramLong1, paramLong2)
    {
      public void run()
      {
        try
        {
          w.a(w.this).a(String.format(Locale.US, "REPLACE INTO dialog_settings VALUES(%d, %d)", new Object[] { Long.valueOf(this.a), Long.valueOf(this.b) })).c().e();
          return;
        }
        catch (Exception localException)
        {
          n.a("tmessages", localException);
        }
      }
    });
  }

  public void a(long paramLong1, long paramLong2, int paramInt)
  {
    this.h.b(new Runnable(paramLong1, paramLong2, paramInt)
    {
      public void run()
      {
        int i = 0;
        try
        {
          w.a(w.this).d();
          Object localObject;
          if ((int)this.a != 0)
          {
            localObject = w.a(w.this).a("UPDATE messages SET read_state = read_state | 1 WHERE uid = ? AND mid <= ? AND read_state IN(0,2) AND out = 0");
            ((SQLitePreparedStatement)localObject).d();
            ((SQLitePreparedStatement)localObject).a(1, this.a);
            ((SQLitePreparedStatement)localObject).a(2, this.b);
            ((SQLitePreparedStatement)localObject).b();
            ((SQLitePreparedStatement)localObject).e();
          }
          while (true)
          {
            localObject = w.a(w.this).b("SELECT inbox_max FROM dialogs WHERE did = " + this.a, new Object[0]);
            if (((SQLiteCursor)localObject).a())
              i = ((SQLiteCursor)localObject).b(0);
            ((SQLiteCursor)localObject).b();
            i = Math.max(i, (int)this.b);
            localObject = w.a(w.this).a("UPDATE dialogs SET unread_count = 0, unread_count_i = 0, inbox_max = ? WHERE did = ?");
            ((SQLitePreparedStatement)localObject).d();
            ((SQLitePreparedStatement)localObject).a(1, i);
            ((SQLitePreparedStatement)localObject).a(2, this.a);
            ((SQLitePreparedStatement)localObject).b();
            ((SQLitePreparedStatement)localObject).e();
            w.a(w.this).e();
            return;
            localObject = w.a(w.this).a("UPDATE messages SET read_state = read_state | 1 WHERE uid = ? AND date <= ? AND read_state IN(0,2) AND out = 0");
            ((SQLitePreparedStatement)localObject).d();
            ((SQLitePreparedStatement)localObject).a(1, this.a);
            ((SQLitePreparedStatement)localObject).a(2, this.c);
            ((SQLitePreparedStatement)localObject).b();
            ((SQLitePreparedStatement)localObject).e();
          }
        }
        catch (Exception localException)
        {
          n.a("tmessages", localException);
        }
      }
    });
  }

  public void a(String paramString1, String paramString2)
  {
    if ((paramString1.length() == 0) && (paramString2.length() == 0))
      return;
    this.h.b(new Runnable(paramString1, paramString2)
    {
      public void run()
      {
        try
        {
          if (this.a.length() != 0)
            w.a(w.this).a(String.format(Locale.US, "UPDATE user_phones_v6 SET deleted = 0 WHERE sphone IN(%s)", new Object[] { this.a })).c().e();
          if (this.b.length() != 0)
            w.a(w.this).a(String.format(Locale.US, "UPDATE user_phones_v6 SET deleted = 1 WHERE sphone IN(%s)", new Object[] { this.b })).c().e();
          return;
        }
        catch (Exception localException)
        {
          n.a("tmessages", localException);
        }
      }
    });
  }

  public void a(String paramString, ArrayList<g.vw> paramArrayList)
  {
    if ((paramString == null) || (paramString.length() == 0) || (paramArrayList == null))
      return;
    paramString = this.i.b(String.format(Locale.US, "SELECT data, status FROM users WHERE uid IN(%s)", new Object[] { paramString }), new Object[0]);
    while (paramString.a())
      try
      {
        NativeByteBuffer localNativeByteBuffer = paramString.g(0);
        if (localNativeByteBuffer == null)
          continue;
        g.vw localvw = g.vw.a(localNativeByteBuffer, localNativeByteBuffer.b(false), false);
        localNativeByteBuffer.e();
        if (localvw == null)
          continue;
        if (localvw.k != null)
          localvw.k.c = paramString.b(1);
        paramArrayList.add(localvw);
      }
      catch (Exception localException)
      {
        n.a("tmessages", localException);
      }
    paramString.b();
  }

  public void a(String paramString, ArrayList<g.t> paramArrayList, ArrayList<Integer> paramArrayList1)
  {
    if ((paramString == null) || (paramString.length() == 0) || (paramArrayList == null))
      return;
    paramString = this.i.b(String.format(Locale.US, "SELECT data, user, g, authkey, ttl, layer, seq_in, seq_out, use_count, exchange_id, key_date, fprint, fauthkey, khash, in_seq_no FROM enc_chats WHERE uid IN(%s)", new Object[] { paramString }), new Object[0]);
    while (paramString.a())
      try
      {
        NativeByteBuffer localNativeByteBuffer = paramString.g(0);
        if (localNativeByteBuffer == null)
          continue;
        g.t localt = g.t.a(localNativeByteBuffer, localNativeByteBuffer.b(false), false);
        localNativeByteBuffer.e();
        if (localt == null)
          continue;
        localt.m = paramString.b(1);
        if ((paramArrayList1 != null) && (!paramArrayList1.contains(Integer.valueOf(localt.m))))
          paramArrayList1.add(Integer.valueOf(localt.m));
        localt.k = paramString.f(2);
        localt.l = paramString.f(3);
        localt.n = paramString.b(4);
        localt.o = paramString.b(5);
        localt.p = paramString.b(6);
        localt.q = paramString.b(7);
        int i1 = paramString.b(8);
        localt.t = (short)(i1 >> 16);
        localt.u = (short)i1;
        localt.v = paramString.d(9);
        localt.w = paramString.b(10);
        localt.x = paramString.d(11);
        localt.y = paramString.f(12);
        localt.s = paramString.f(13);
        localt.r = paramString.b(14);
        paramArrayList.add(localt);
      }
      catch (Exception localException)
      {
        n.a("tmessages", localException);
      }
    paramString.b();
  }

  public void a(ArrayList<MediaController.j> paramArrayList)
  {
    this.h.b(new Runnable(paramArrayList)
    {
      public void run()
      {
        int j = 200;
        while (true)
        {
          int i;
          try
          {
            w.a(w.this).d();
            SQLitePreparedStatement localSQLitePreparedStatement = w.a(w.this).a("REPLACE INTO web_recent_v3 VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            i = 0;
            if ((i < this.a.size()) && (i != 200))
              continue;
            localSQLitePreparedStatement.e();
            w.a(w.this).e();
            if (this.a.size() < 200)
              continue;
            w.a(w.this).d();
            i = j;
            if (i >= this.a.size())
              continue;
            w.a(w.this).a("DELETE FROM web_recent_v3 WHERE id = '" + ((MediaController.j)this.a.get(i)).a + "'").c().e();
            i += 1;
            continue;
            MediaController.j localj = (MediaController.j)this.a.get(i);
            localSQLitePreparedStatement.d();
            localSQLitePreparedStatement.a(1, localj.a);
            localSQLitePreparedStatement.a(2, localj.h);
            if (localj.b == null)
              break label406;
            Object localObject = localj.b;
            localSQLitePreparedStatement.a(3, (String)localObject);
            if (localj.c == null)
              break label412;
            localObject = localj.c;
            localSQLitePreparedStatement.a(4, (String)localObject);
            if (localj.d == null)
              break label418;
            localObject = localj.d;
            localSQLitePreparedStatement.a(5, (String)localObject);
            localSQLitePreparedStatement.a(6, localj.e);
            localSQLitePreparedStatement.a(7, localj.f);
            localSQLitePreparedStatement.a(8, localj.g);
            localSQLitePreparedStatement.a(9, localj.i);
            if (localj.m == null)
              continue;
            localObject = new NativeByteBuffer(localj.m.b());
            localj.m.a((org.vidogram.tgnet.a)localObject);
            localSQLitePreparedStatement.a(10, (NativeByteBuffer)localObject);
            localSQLitePreparedStatement.b();
            if (localObject != null)
            {
              ((NativeByteBuffer)localObject).e();
              break label399;
              localSQLitePreparedStatement.a(10);
              localObject = null;
              continue;
              w.a(w.this).e();
              return;
            }
          }
          catch (Exception localException)
          {
            n.a("tmessages", localException);
            return;
          }
          label399: i += 1;
          continue;
          label406: String str = "";
          continue;
          label412: str = "";
          continue;
          label418: str = "";
        }
      }
    });
  }

  public void a(ArrayList<g.vw> paramArrayList, ArrayList<g.i> paramArrayList1, boolean paramBoolean1, boolean paramBoolean2)
  {
    if ((paramArrayList != null) && (paramArrayList.isEmpty()) && (paramArrayList1 != null) && (paramArrayList1.isEmpty()))
      return;
    if (paramBoolean2)
    {
      this.h.b(new Runnable(paramArrayList, paramArrayList1, paramBoolean1)
      {
        public void run()
        {
          w.a(w.this, this.a, this.b, this.c);
        }
      });
      return;
    }
    a(paramArrayList, paramArrayList1, paramBoolean1);
  }

  public void a(ArrayList<g.fw> paramArrayList, boolean paramBoolean)
  {
    if (paramArrayList.isEmpty())
      return;
    paramArrayList = new ArrayList(paramArrayList);
    this.h.b(new Runnable(paramBoolean, paramArrayList)
    {
      public void run()
      {
        while (true)
        {
          try
          {
            if (!this.a)
              continue;
            w.a(w.this).a("DELETE FROM contacts WHERE 1").c().e();
            w.a(w.this).d();
            SQLitePreparedStatement localSQLitePreparedStatement = w.a(w.this).a("REPLACE INTO contacts VALUES(?, ?)");
            int i = 0;
            if (i >= this.b.size())
              continue;
            g.fw localfw = (g.fw)this.b.get(i);
            localSQLitePreparedStatement.d();
            localSQLitePreparedStatement.a(1, localfw.c);
            if (localfw.d)
            {
              j = 1;
              localSQLitePreparedStatement.a(2, j);
              localSQLitePreparedStatement.b();
              i += 1;
              continue;
              localSQLitePreparedStatement.e();
              w.a(w.this).e();
              return;
            }
          }
          catch (Exception localException)
          {
            n.a("tmessages", localException);
            return;
          }
          int j = 0;
        }
      }
    });
  }

  public void a(ArrayList<Integer> paramArrayList, boolean paramBoolean, int paramInt)
  {
    if ((paramArrayList.isEmpty()) && (paramInt == 0))
      return;
    if (paramBoolean)
    {
      this.h.b(new Runnable(paramArrayList, paramInt)
      {
        public void run()
        {
          w.b(w.this, this.a, this.b);
        }
      });
      return;
    }
    b(paramArrayList, paramInt);
  }

  public void a(ArrayList<g.ar> paramArrayList, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, int paramInt)
  {
    a(paramArrayList, paramBoolean1, paramBoolean2, paramBoolean3, paramInt, false);
  }

  public void a(ArrayList<g.ar> paramArrayList, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, int paramInt, boolean paramBoolean4)
  {
    if (paramArrayList.size() == 0)
      return;
    if (paramBoolean2)
    {
      this.h.b(new Runnable(paramArrayList, paramBoolean1, paramBoolean3, paramInt, paramBoolean4)
      {
        public void run()
        {
          w.a(w.this, this.a, this.b, this.c, this.d, this.e);
        }
      });
      return;
    }
    a(paramArrayList, paramBoolean1, paramBoolean3, paramInt, paramBoolean4);
  }

  public void a(HashMap<Integer, f.a> paramHashMap)
  {
    this.h.b(new Runnable(paramHashMap)
    {
      public void run()
      {
        try
        {
          w.a(w.this).d();
          SQLitePreparedStatement localSQLitePreparedStatement1 = w.a(w.this).a("REPLACE INTO user_contacts_v6 VALUES(?, ?, ?)");
          SQLitePreparedStatement localSQLitePreparedStatement2 = w.a(w.this).a("REPLACE INTO user_phones_v6 VALUES(?, ?, ?, ?)");
          Iterator localIterator = this.a.entrySet().iterator();
          while (localIterator.hasNext())
          {
            f.a locala = (f.a)((Map.Entry)localIterator.next()).getValue();
            if ((locala.b.isEmpty()) || (locala.d.isEmpty()))
              continue;
            localSQLitePreparedStatement1.d();
            localSQLitePreparedStatement1.a(1, locala.a);
            localSQLitePreparedStatement1.a(2, locala.f);
            localSQLitePreparedStatement1.a(3, locala.g);
            localSQLitePreparedStatement1.b();
            int i = 0;
            while (i < locala.b.size())
            {
              localSQLitePreparedStatement2.d();
              localSQLitePreparedStatement2.a(1, locala.a);
              localSQLitePreparedStatement2.a(2, (String)locala.b.get(i));
              localSQLitePreparedStatement2.a(3, (String)locala.d.get(i));
              localSQLitePreparedStatement2.a(4, ((Integer)locala.e.get(i)).intValue());
              localSQLitePreparedStatement2.b();
              i += 1;
            }
          }
          localSQLitePreparedStatement1.e();
          localSQLitePreparedStatement2.e();
          w.a(w.this).e();
          return;
        }
        catch (Exception localException)
        {
          n.a("tmessages", localException);
        }
      }
    });
  }

  public void a(g.ar paramar)
  {
    this.h.b(new Runnable(paramar)
    {
      public void run()
      {
        try
        {
          long l2 = this.a.b;
          long l1 = l2;
          if (this.a.d.b != 0)
            l1 = l2 | this.a.d.b << 32;
          w.a(w.this).a("UPDATE messages SET send_state = 2 WHERE mid = " + l1).c().e();
          return;
        }
        catch (Exception localException)
        {
          n.a("tmessages", localException);
        }
      }
    });
  }

  public void a(g.j paramj, boolean paramBoolean)
  {
    this.h.b(new Runnable(paramBoolean, paramj)
    {
      public void run()
      {
        try
        {
          if (this.a)
          {
            localObject1 = w.a(w.this).b("SELECT uid FROM chat_settings_v2 WHERE uid = " + this.b.e, new Object[0]);
            boolean bool = ((SQLiteCursor)localObject1).a();
            ((SQLiteCursor)localObject1).b();
            if (!bool)
              return;
          }
          Object localObject1 = w.a(w.this).a("REPLACE INTO chat_settings_v2 VALUES(?, ?, ?)");
          Object localObject2 = new NativeByteBuffer(this.b.b());
          this.b.a((org.vidogram.tgnet.a)localObject2);
          ((SQLitePreparedStatement)localObject1).a(1, this.b.e);
          ((SQLitePreparedStatement)localObject1).a(2, (NativeByteBuffer)localObject2);
          ((SQLitePreparedStatement)localObject1).a(3, this.b.s);
          ((SQLitePreparedStatement)localObject1).b();
          ((SQLitePreparedStatement)localObject1).e();
          ((NativeByteBuffer)localObject2).e();
          if ((this.b instanceof g.dl))
          {
            localObject1 = w.a(w.this).b("SELECT date, pts, last_mid, inbox_max, outbox_max FROM dialogs WHERE did = " + -this.b.e, new Object[0]);
            if (((SQLiteCursor)localObject1).a())
            {
              int i = ((SQLiteCursor)localObject1).b(3);
              if (i <= this.b.j)
              {
                i = this.b.j - i;
                if (i < this.b.l)
                  this.b.l = i;
                i = ((SQLiteCursor)localObject1).b(0);
                int j = ((SQLiteCursor)localObject1).b(1);
                long l = ((SQLiteCursor)localObject1).d(2);
                int k = ((SQLiteCursor)localObject1).b(4);
                localObject2 = w.a(w.this).a("REPLACE INTO dialogs VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
                ((SQLitePreparedStatement)localObject2).a(1, -this.b.e);
                ((SQLitePreparedStatement)localObject2).a(2, i);
                ((SQLitePreparedStatement)localObject2).a(3, this.b.l);
                ((SQLitePreparedStatement)localObject2).a(4, l);
                ((SQLitePreparedStatement)localObject2).a(5, this.b.j);
                ((SQLitePreparedStatement)localObject2).a(6, Math.max(k, this.b.k));
                ((SQLitePreparedStatement)localObject2).a(7, 0L);
                ((SQLitePreparedStatement)localObject2).a(8, 0);
                ((SQLitePreparedStatement)localObject2).a(9, j);
                ((SQLitePreparedStatement)localObject2).a(10, 0);
                ((SQLitePreparedStatement)localObject2).b();
                ((SQLitePreparedStatement)localObject2).e();
              }
            }
            ((SQLiteCursor)localObject1).b();
            return;
          }
        }
        catch (Exception localException)
        {
          n.a("tmessages", localException);
        }
      }
    });
  }

  public void a(g.t paramt)
  {
    if (paramt == null)
      return;
    this.h.b(new Runnable(paramt)
    {
      public void run()
      {
        Object localObject3 = null;
        Object localObject1 = null;
        try
        {
          SQLitePreparedStatement localSQLitePreparedStatement = w.a(w.this).a("UPDATE enc_chats SET seq_in = ?, seq_out = ?, use_count = ?, in_seq_no = ? WHERE uid = ?");
          localObject1 = localSQLitePreparedStatement;
          localObject3 = localSQLitePreparedStatement;
          localSQLitePreparedStatement.a(1, this.a.p);
          localObject1 = localSQLitePreparedStatement;
          localObject3 = localSQLitePreparedStatement;
          localSQLitePreparedStatement.a(2, this.a.q);
          localObject1 = localSQLitePreparedStatement;
          localObject3 = localSQLitePreparedStatement;
          localSQLitePreparedStatement.a(3, this.a.t << 16 | this.a.u);
          localObject1 = localSQLitePreparedStatement;
          localObject3 = localSQLitePreparedStatement;
          localSQLitePreparedStatement.a(4, this.a.r);
          localObject1 = localSQLitePreparedStatement;
          localObject3 = localSQLitePreparedStatement;
          localSQLitePreparedStatement.a(5, this.a.b);
          localObject1 = localSQLitePreparedStatement;
          localObject3 = localSQLitePreparedStatement;
          localSQLitePreparedStatement.b();
          return;
        }
        catch (Exception localException)
        {
          localObject3 = localObject1;
          n.a("tmessages", localException);
          return;
        }
        finally
        {
          if (localObject3 != null)
            localObject3.e();
        }
        throw localObject2;
      }
    });
  }

  public void a(g.wd paramwd)
  {
    if (paramwd.b.isEmpty())
      return;
    this.h.b(new Runnable(paramwd)
    {
      public void run()
      {
        w.a(w.this, this.a);
        w.this.e();
      }
    });
  }

  public void a(g.we paramwe, long paramLong, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    this.h.b(new Runnable(paramwe, paramInt1, paramLong, paramInt2, paramBoolean)
    {
      public void run()
      {
        SQLitePreparedStatement localSQLitePreparedStatement1;
        SQLitePreparedStatement localSQLitePreparedStatement2;
        Object localObject3;
        int j;
        g.ar localar1;
        label228: long l1;
        do
          try
          {
            if (this.a.c.isEmpty())
            {
              if (this.b != 0)
                break label1196;
              w.a(w.this, "messages_holes", this.c, this.d);
              w.this.a(this.c, this.d, -1);
              return;
            }
            w.a(w.this).d();
            if (this.b == 0)
            {
              i = ((g.ar)this.a.c.get(this.a.c.size() - 1)).b;
              w.a(w.this, "messages_holes", this.c, i, this.d);
              w.this.a(this.c, i, this.d, -1);
            }
            while (true)
            {
              int m = this.a.c.size();
              localSQLitePreparedStatement1 = w.a(w.this).a("REPLACE INTO messages VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, NULL, ?)");
              localSQLitePreparedStatement2 = w.a(w.this).a("REPLACE INTO media_v2 VALUES(?, ?, ?, ?, ?)");
              Object localObject1 = null;
              localObject3 = null;
              i = 0;
              j = 0;
              if (j >= m)
                break label1087;
              localar1 = (g.ar)this.a.c.get(j);
              long l2 = localar1.b;
              if (i != 0)
                break label1193;
              i = localar1.d.b;
              l1 = l2;
              if (localar1.d.b != 0)
                l1 = l2 | i << 32;
              if (this.b != -2)
                break label575;
              localObject4 = w.a(w.this).b(String.format(Locale.US, "SELECT mid, data, ttl FROM messages WHERE mid = %d", new Object[] { Long.valueOf(l1) }), new Object[0]);
              boolean bool = ((SQLiteCursor)localObject4).a();
              if (bool)
              {
                NativeByteBuffer localNativeByteBuffer = ((SQLiteCursor)localObject4).g(1);
                if (localNativeByteBuffer != null)
                {
                  g.ar localar2 = g.ar.a(localNativeByteBuffer, localNativeByteBuffer.b(false), false);
                  localNativeByteBuffer.e();
                  if (localar2 != null)
                  {
                    localar1.A = localar2.A;
                    localar1.F = ((SQLiteCursor)localObject4).b(2);
                  }
                }
              }
              ((SQLiteCursor)localObject4).b();
              if (bool)
                break label575;
              localObject4 = localObject1;
              localObject1 = localObject3;
              localObject3 = localObject4;
              break label1197;
              if (this.b != 1)
                break;
              i = ((g.ar)this.a.c.get(0)).b;
              w.a(w.this, "messages_holes", this.c, this.d, i);
              w.this.a(this.c, this.d, i, -1);
            }
          }
          catch (Exception localException)
          {
            n.a("tmessages", localException);
            return;
          }
        while ((this.b != 3) && (this.b != 2));
        if (this.d == 0);
        for (int i = 2147483647; ; i = ((g.ar)this.a.c.get(0)).b)
        {
          j = ((g.ar)this.a.c.get(this.a.c.size() - 1)).b;
          w.a(w.this, "messages_holes", this.c, j, i);
          w.this.a(this.c, j, i, -1);
          break;
        }
        label575: if ((j == 0) && (this.e))
        {
          localObject4 = w.a(w.this).a("REPLACE INTO dialogs VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
          ((SQLitePreparedStatement)localObject4).a(1, this.c);
          ((SQLitePreparedStatement)localObject4).a(2, localar1.e);
          ((SQLitePreparedStatement)localObject4).a(3, 0);
          ((SQLitePreparedStatement)localObject4).a(4, l1);
          ((SQLitePreparedStatement)localObject4).a(5, localar1.b);
          ((SQLitePreparedStatement)localObject4).a(6, 0);
          ((SQLitePreparedStatement)localObject4).a(7, l1);
          ((SQLitePreparedStatement)localObject4).a(8, localar1.F);
          ((SQLitePreparedStatement)localObject4).a(9, this.a.g);
          ((SQLitePreparedStatement)localObject4).a(10, localar1.e);
          ((SQLitePreparedStatement)localObject4).b();
          ((SQLitePreparedStatement)localObject4).e();
        }
        w.a(w.this, localar1);
        localSQLitePreparedStatement1.d();
        Object localObject4 = new NativeByteBuffer(localar1.b());
        localar1.a((org.vidogram.tgnet.a)localObject4);
        localSQLitePreparedStatement1.a(1, l1);
        localSQLitePreparedStatement1.a(2, this.c);
        localSQLitePreparedStatement1.a(3, u.a(localar1));
        localSQLitePreparedStatement1.a(4, localar1.y);
        localSQLitePreparedStatement1.a(5, localar1.e);
        localSQLitePreparedStatement1.a(6, (NativeByteBuffer)localObject4);
        if (u.d(localar1));
        for (int k = 1; ; k = 0)
        {
          localSQLitePreparedStatement1.a(7, k);
          localSQLitePreparedStatement1.a(8, 0);
          if ((localar1.k & 0x400) != 0)
            localSQLitePreparedStatement1.a(9, localar1.s);
          while (true)
          {
            localSQLitePreparedStatement1.a(10, 0);
            localSQLitePreparedStatement1.b();
            if (org.vidogram.messenger.d.f.b(localar1))
            {
              localSQLitePreparedStatement2.d();
              localSQLitePreparedStatement2.a(1, l1);
              localSQLitePreparedStatement2.a(2, this.c);
              localSQLitePreparedStatement2.a(3, localar1.e);
              localSQLitePreparedStatement2.a(4, org.vidogram.messenger.d.f.a(localar1));
              localSQLitePreparedStatement2.a(5, (NativeByteBuffer)localObject4);
              localSQLitePreparedStatement2.b();
            }
            ((NativeByteBuffer)localObject4).e();
            localObject4 = localException;
            if ((localar1.j instanceof g.oi))
            {
              localObject4 = localException;
              if ((localar1.j.r instanceof g.vr))
              {
                localObject4 = localException;
                if (localException == null)
                  localObject4 = w.a(w.this).a("REPLACE INTO webpage_pending VALUES(?, ?)");
                ((SQLitePreparedStatement)localObject4).d();
                ((SQLitePreparedStatement)localObject4).a(1, localar1.j.r.d);
                ((SQLitePreparedStatement)localObject4).a(2, l1);
                ((SQLitePreparedStatement)localObject4).b();
              }
            }
            if ((this.b != 0) || (!w.b(w.this, localar1)))
              break;
            if (localObject3 == null)
              break label1216;
            if (localObject3.b >= localar1.b)
              break;
            break label1216;
            localSQLitePreparedStatement1.a(9, 0);
            continue;
            label1087: localSQLitePreparedStatement1.e();
            localSQLitePreparedStatement2.e();
            if (localException != null)
              localException.e();
            if (localObject3 != null)
              org.vidogram.messenger.d.a.a(this.c, localObject3);
            w.a(w.this, this.a.e);
            w.b(w.this, this.a.d);
            w.a(w.this).e();
            if (!this.e)
              break label1196;
            w.a().a(new ArrayList(), false, i);
            return;
          }
          Object localObject2 = localObject3;
          localObject3 = localObject4;
          break label1197;
          label1193: break label228;
          label1196: return;
          while (true)
          {
            label1197: j += 1;
            localObject4 = localObject3;
            localObject3 = localObject2;
            localObject2 = localObject4;
            break;
            label1216: localObject3 = localObject4;
            localObject2 = localar1;
          }
        }
      }
    });
  }

  public void a(boolean paramBoolean)
  {
    this.h.a();
    this.h.b(new Runnable(paramBoolean)
    {
      public void run()
      {
        w.a = 0;
        w.d = 0;
        w.b = 0;
        w.c = 0;
        w.e = 0;
        w.a(w.this, 0);
        w.b(w.this, 0);
        w.c(w.this, 0);
        w.d(w.this, 0);
        w.f = null;
        w.g = 0;
        if (w.a(w.this) != null)
        {
          w.a(w.this).b();
          w.a(w.this, null);
        }
        if (w.c(w.this) != null)
        {
          w.c(w.this).delete();
          w.a(w.this, null);
        }
        w.this.d();
        if (this.a)
          Utilities.c.b(new Runnable()
          {
            public void run()
            {
              v.a().i();
            }
          });
      }
    });
  }

  public SQLiteDatabase b()
  {
    return this.i;
  }

  public void b(int paramInt)
  {
    this.h.b(new Runnable(paramInt)
    {
      public void run()
      {
        ArrayList localArrayList;
        try
        {
          SQLiteCursor localSQLiteCursor = w.a(w.this).b("SELECT id, image_url, thumb_url, local_url, width, height, size, date, document FROM web_recent_v3 WHERE type = " + this.a + " ORDER BY date DESC", new Object[0]);
          localArrayList = new ArrayList();
          while (localSQLiteCursor.a())
          {
            MediaController.j localj = new MediaController.j();
            localj.a = localSQLiteCursor.e(0);
            localj.b = localSQLiteCursor.e(1);
            localj.c = localSQLiteCursor.e(2);
            localj.d = localSQLiteCursor.e(3);
            localj.e = localSQLiteCursor.b(4);
            localj.f = localSQLiteCursor.b(5);
            localj.g = localSQLiteCursor.b(6);
            localj.i = localSQLiteCursor.b(7);
            if (!localSQLiteCursor.a(8))
            {
              NativeByteBuffer localNativeByteBuffer = localSQLiteCursor.g(8);
              if (localNativeByteBuffer != null)
              {
                localj.m = g.q.a(localNativeByteBuffer, localNativeByteBuffer.b(false), false);
                localNativeByteBuffer.e();
              }
            }
            localj.h = this.a;
            localArrayList.add(localj);
          }
        }
        catch (Throwable localThrowable)
        {
          n.a("tmessages", localThrowable);
          return;
        }
        localThrowable.b();
        a.a(new Runnable(localArrayList)
        {
          public void run()
          {
            y.a().a(y.F, new Object[] { Integer.valueOf(w.3.this.a), this.a });
          }
        });
      }
    });
  }

  public void b(int paramInt1, int paramInt2)
  {
    this.h.b(new Runnable(paramInt1, paramInt2)
    {
      public void run()
      {
        try
        {
          Object localObject2 = w.a(w.this).b("SELECT info, pinned FROM chat_settings_v2 WHERE uid = " + this.a, new Object[0]);
          SQLitePreparedStatement localSQLitePreparedStatement = null;
          new ArrayList();
          Object localObject1 = localSQLitePreparedStatement;
          if (((SQLiteCursor)localObject2).a())
          {
            NativeByteBuffer localNativeByteBuffer = ((SQLiteCursor)localObject2).g(0);
            localObject1 = localSQLitePreparedStatement;
            if (localNativeByteBuffer != null)
            {
              localObject1 = g.j.a(localNativeByteBuffer, localNativeByteBuffer.b(false), false);
              localNativeByteBuffer.e();
              ((g.j)localObject1).s = ((SQLiteCursor)localObject2).b(1);
            }
          }
          ((SQLiteCursor)localObject2).b();
          if ((localObject1 instanceof g.dl))
          {
            ((g.j)localObject1).s = this.b;
            ((g.j)localObject1).b |= 32;
            a.a(new Runnable((g.j)localObject1)
            {
              public void run()
              {
                y.a().a(y.n, new Object[] { this.a, Integer.valueOf(0), Boolean.valueOf(false), null });
              }
            });
            localSQLitePreparedStatement = w.a(w.this).a("REPLACE INTO chat_settings_v2 VALUES(?, ?, ?)");
            localObject2 = new NativeByteBuffer(((g.j)localObject1).b());
            ((g.j)localObject1).a((org.vidogram.tgnet.a)localObject2);
            localSQLitePreparedStatement.a(1, this.a);
            localSQLitePreparedStatement.a(2, (NativeByteBuffer)localObject2);
            localSQLitePreparedStatement.a(3, ((g.j)localObject1).s);
            localSQLitePreparedStatement.b();
            localSQLitePreparedStatement.e();
            ((NativeByteBuffer)localObject2).e();
          }
          return;
        }
        catch (Exception localException)
        {
          n.a("tmessages", localException);
        }
      }
    });
  }

  public void b(String paramString, ArrayList<g.i> paramArrayList)
  {
    if ((paramString == null) || (paramString.length() == 0) || (paramArrayList == null))
      return;
    paramString = this.i.b(String.format(Locale.US, "SELECT data FROM chats WHERE uid IN(%s)", new Object[] { paramString }), new Object[0]);
    while (paramString.a())
      try
      {
        NativeByteBuffer localNativeByteBuffer = paramString.g(0);
        if (localNativeByteBuffer == null)
          continue;
        g.i locali = g.i.a(localNativeByteBuffer, localNativeByteBuffer.b(false), false);
        localNativeByteBuffer.e();
        if (locali == null)
          continue;
        paramArrayList.add(locali);
      }
      catch (Exception localException)
      {
        n.a("tmessages", localException);
      }
    paramString.b();
  }

  public void b(ArrayList<Integer> paramArrayList)
  {
    this.h.b(new Runnable(paramArrayList)
    {
      public void run()
      {
        int i = 0;
        SQLiteCursor localSQLiteCursor;
        try
        {
          if (this.a != null)
          {
            localObject1 = TextUtils.join(",", this.a);
            w.a(w.this).a(String.format(Locale.US, "DELETE FROM enc_tasks_v2 WHERE mid IN(%s)", new Object[] { localObject1 })).c().e();
          }
          Object localObject1 = null;
          localSQLiteCursor = w.a(w.this).b("SELECT mid, date FROM enc_tasks_v2 WHERE date = (SELECT min(date) FROM enc_tasks_v2)", new Object[0]);
          while (localSQLiteCursor.a())
          {
            int j = localSQLiteCursor.b(0);
            i = localSQLiteCursor.b(1);
            Object localObject2 = localObject1;
            if (localObject1 == null)
              localObject2 = new ArrayList();
            ((ArrayList)localObject2).add(Integer.valueOf(j));
            localObject1 = localObject2;
          }
        }
        catch (Exception localException)
        {
          n.a("tmessages", localException);
          return;
        }
        localSQLiteCursor.b();
        v.a().a(i, localException);
      }
    });
  }

  public void b(ArrayList<Integer> paramArrayList, boolean paramBoolean, int paramInt)
  {
    if (paramArrayList.isEmpty())
      return;
    if (paramBoolean)
    {
      this.h.b(new Runnable(paramArrayList, paramInt)
      {
        public void run()
        {
          w.a(w.this, this.a, this.b);
        }
      });
      return;
    }
    a(paramArrayList, paramInt);
  }

  public void b(g.t paramt)
  {
    if (paramt == null)
      return;
    this.h.b(new Runnable(paramt)
    {
      public void run()
      {
        Object localObject3 = null;
        Object localObject1 = null;
        try
        {
          SQLitePreparedStatement localSQLitePreparedStatement = w.a(w.this).a("UPDATE enc_chats SET ttl = ? WHERE uid = ?");
          localObject1 = localSQLitePreparedStatement;
          localObject3 = localSQLitePreparedStatement;
          localSQLitePreparedStatement.a(1, this.a.n);
          localObject1 = localSQLitePreparedStatement;
          localObject3 = localSQLitePreparedStatement;
          localSQLitePreparedStatement.a(2, this.a.b);
          localObject1 = localSQLitePreparedStatement;
          localObject3 = localSQLitePreparedStatement;
          localSQLitePreparedStatement.b();
          return;
        }
        catch (Exception localException)
        {
          localObject3 = localObject1;
          n.a("tmessages", localException);
          return;
        }
        finally
        {
          if (localObject3 != null)
            localObject3.e();
        }
        throw localObject2;
      }
    });
  }

  public boolean b(long paramLong, int paramInt)
  {
    boolean[] arrayOfBoolean = new boolean[1];
    Semaphore localSemaphore = new Semaphore(0);
    this.h.b(new Runnable(paramLong, paramInt, arrayOfBoolean, localSemaphore)
    {
      public void run()
      {
        Object localObject3 = null;
        Object localObject1 = null;
        try
        {
          SQLiteCursor localSQLiteCursor = w.a(w.this).b(String.format(Locale.US, "SELECT mid FROM messages WHERE uid = %d AND mid = %d", new Object[] { Long.valueOf(this.a), Integer.valueOf(this.b) }), new Object[0]);
          localObject1 = localSQLiteCursor;
          localObject3 = localSQLiteCursor;
          if (localSQLiteCursor.a())
          {
            localObject1 = localSQLiteCursor;
            localObject3 = localSQLiteCursor;
            this.c[0] = true;
          }
          if (localSQLiteCursor != null)
            localSQLiteCursor.b();
          this.d.release();
          return;
        }
        catch (Exception localException)
        {
          while (true)
          {
            localObject3 = localObject1;
            n.a("tmessages", localException);
            if (localObject1 == null)
              continue;
            localObject1.b();
          }
        }
        finally
        {
          if (localObject3 != null)
            localObject3.b();
        }
        throw localObject2;
      }
    });
    try
    {
      localSemaphore.acquire();
      return arrayOfBoolean[0];
    }
    catch (Exception localException)
    {
      while (true)
        n.a("tmessages", localException);
    }
  }

  public h c()
  {
    return this.h;
  }

  public void c(int paramInt)
  {
    this.h.b(new Runnable(paramInt)
    {
      public void run()
      {
        try
        {
          w.a(w.this).a("DELETE FROM web_recent_v3 WHERE type = " + this.a).c().e();
          return;
        }
        catch (Exception localException)
        {
          n.a("tmessages", localException);
        }
      }
    });
  }

  public void c(int paramInt1, int paramInt2)
  {
    this.h.b(new Runnable(paramInt1, paramInt2)
    {
      // ERROR //
      public void run()
      {
        // Byte code:
        //   0: new 32	org/vidogram/tgnet/g$wd
        //   3: dup
        //   4: invokespecial 33	org/vidogram/tgnet/g$wd:<init>	()V
        //   7: astore 7
        //   9: new 35	java/util/ArrayList
        //   12: dup
        //   13: invokespecial 36	java/util/ArrayList:<init>	()V
        //   16: astore 8
        //   18: new 35	java/util/ArrayList
        //   21: dup
        //   22: invokespecial 36	java/util/ArrayList:<init>	()V
        //   25: astore 9
        //   27: aload 9
        //   29: invokestatic 41	org/vidogram/messenger/ad:c	()I
        //   32: invokestatic 47	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   35: invokevirtual 51	java/util/ArrayList:add	(Ljava/lang/Object;)Z
        //   38: pop
        //   39: new 35	java/util/ArrayList
        //   42: dup
        //   43: invokespecial 36	java/util/ArrayList:<init>	()V
        //   46: astore 10
        //   48: new 35	java/util/ArrayList
        //   51: dup
        //   52: invokespecial 36	java/util/ArrayList:<init>	()V
        //   55: astore 11
        //   57: new 35	java/util/ArrayList
        //   60: dup
        //   61: invokespecial 36	java/util/ArrayList:<init>	()V
        //   64: astore 13
        //   66: new 53	java/util/HashMap
        //   69: dup
        //   70: invokespecial 54	java/util/HashMap:<init>	()V
        //   73: astore 12
        //   75: aload_0
        //   76: getfield 19	org/vidogram/messenger/w$46:c	Lorg/vidogram/messenger/w;
        //   79: invokestatic 57	org/vidogram/messenger/w:a	(Lorg/vidogram/messenger/w;)Lorg/vidogram/SQLite/SQLiteDatabase;
        //   82: getstatic 63	java/util/Locale:US	Ljava/util/Locale;
        //   85: ldc 65
        //   87: iconst_2
        //   88: anewarray 4	java/lang/Object
        //   91: dup
        //   92: iconst_0
        //   93: aload_0
        //   94: getfield 21	org/vidogram/messenger/w$46:a	I
        //   97: invokestatic 47	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   100: aastore
        //   101: dup
        //   102: iconst_1
        //   103: aload_0
        //   104: getfield 23	org/vidogram/messenger/w$46:b	I
        //   107: invokestatic 47	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   110: aastore
        //   111: invokestatic 71	java/lang/String:format	(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   114: iconst_0
        //   115: anewarray 4	java/lang/Object
        //   118: invokevirtual 76	org/vidogram/SQLite/SQLiteDatabase:b	(Ljava/lang/String;[Ljava/lang/Object;)Lorg/vidogram/SQLite/SQLiteCursor;
        //   121: astore 14
        //   123: aload 14
        //   125: invokevirtual 81	org/vidogram/SQLite/SQLiteCursor:a	()Z
        //   128: ifeq +696 -> 824
        //   131: new 83	org/vidogram/tgnet/g$hq
        //   134: dup
        //   135: invokespecial 84	org/vidogram/tgnet/g$hq:<init>	()V
        //   138: astore 15
        //   140: aload 15
        //   142: aload 14
        //   144: iconst_0
        //   145: invokevirtual 88	org/vidogram/SQLite/SQLiteCursor:d	(I)J
        //   148: putfield 92	org/vidogram/tgnet/g$hq:m	J
        //   151: aload 15
        //   153: aload 14
        //   155: iconst_1
        //   156: invokevirtual 95	org/vidogram/SQLite/SQLiteCursor:b	(I)I
        //   159: putfield 98	org/vidogram/tgnet/g$hq:e	I
        //   162: aload 15
        //   164: aload 14
        //   166: iconst_2
        //   167: invokevirtual 95	org/vidogram/SQLite/SQLiteCursor:b	(I)I
        //   170: putfield 101	org/vidogram/tgnet/g$hq:h	I
        //   173: aload 15
        //   175: aload 14
        //   177: iconst_3
        //   178: invokevirtual 95	org/vidogram/SQLite/SQLiteCursor:b	(I)I
        //   181: putfield 104	org/vidogram/tgnet/g$hq:l	I
        //   184: aload 15
        //   186: aload 14
        //   188: bipush 10
        //   190: invokevirtual 95	org/vidogram/SQLite/SQLiteCursor:b	(I)I
        //   193: putfield 107	org/vidogram/tgnet/g$hq:j	I
        //   196: aload 15
        //   198: getfield 107	org/vidogram/tgnet/g$hq:j	I
        //   201: ifeq +906 -> 1107
        //   204: aload 15
        //   206: getfield 92	org/vidogram/tgnet/g$hq:m	J
        //   209: l2i
        //   210: ifle +516 -> 726
        //   213: goto +894 -> 1107
        //   216: aload 15
        //   218: iload_1
        //   219: putfield 109	org/vidogram/tgnet/g$hq:c	I
        //   222: aload 15
        //   224: aload 14
        //   226: bipush 11
        //   228: invokevirtual 95	org/vidogram/SQLite/SQLiteCursor:b	(I)I
        //   231: putfield 112	org/vidogram/tgnet/g$hq:f	I
        //   234: aload 15
        //   236: aload 14
        //   238: bipush 12
        //   240: invokevirtual 95	org/vidogram/SQLite/SQLiteCursor:b	(I)I
        //   243: putfield 115	org/vidogram/tgnet/g$hq:g	I
        //   246: aload 14
        //   248: bipush 8
        //   250: invokevirtual 88	org/vidogram/SQLite/SQLiteCursor:d	(I)J
        //   253: lstore_3
        //   254: lload_3
        //   255: l2i
        //   256: istore_1
        //   257: aload 15
        //   259: new 117	org/vidogram/tgnet/g$rl
        //   262: dup
        //   263: invokespecial 118	org/vidogram/tgnet/g$rl:<init>	()V
        //   266: putfield 122	org/vidogram/tgnet/g$hq:i	Lorg/vidogram/tgnet/g$ax;
        //   269: iload_1
        //   270: iconst_1
        //   271: iand
        //   272: ifeq +37 -> 309
        //   275: aload 15
        //   277: getfield 122	org/vidogram/tgnet/g$hq:i	Lorg/vidogram/tgnet/g$ax;
        //   280: lload_3
        //   281: bipush 32
        //   283: lshr
        //   284: l2i
        //   285: putfield 126	org/vidogram/tgnet/g$ax:d	I
        //   288: aload 15
        //   290: getfield 122	org/vidogram/tgnet/g$hq:i	Lorg/vidogram/tgnet/g$ax;
        //   293: getfield 126	org/vidogram/tgnet/g$ax:d	I
        //   296: ifne +13 -> 309
        //   299: aload 15
        //   301: getfield 122	org/vidogram/tgnet/g$hq:i	Lorg/vidogram/tgnet/g$ax;
        //   304: ldc 127
        //   306: putfield 126	org/vidogram/tgnet/g$ax:d	I
        //   309: aload 7
        //   311: getfield 130	org/vidogram/tgnet/g$wd:b	Ljava/util/ArrayList;
        //   314: aload 15
        //   316: invokevirtual 51	java/util/ArrayList:add	(Ljava/lang/Object;)Z
        //   319: pop
        //   320: aload 14
        //   322: iconst_4
        //   323: invokevirtual 133	org/vidogram/SQLite/SQLiteCursor:g	(I)Lorg/vidogram/tgnet/NativeByteBuffer;
        //   326: astore 17
        //   328: aload 17
        //   330: ifnull +290 -> 620
        //   333: aload 17
        //   335: aload 17
        //   337: iconst_0
        //   338: invokevirtual 138	org/vidogram/tgnet/NativeByteBuffer:b	(Z)I
        //   341: iconst_0
        //   342: invokestatic 143	org/vidogram/tgnet/g$ar:a	(Lorg/vidogram/tgnet/a;IZ)Lorg/vidogram/tgnet/g$ar;
        //   345: astore 16
        //   347: aload 17
        //   349: invokevirtual 145	org/vidogram/tgnet/NativeByteBuffer:e	()V
        //   352: aload 16
        //   354: ifnull +266 -> 620
        //   357: aload 16
        //   359: aload 14
        //   361: iconst_5
        //   362: invokevirtual 95	org/vidogram/SQLite/SQLiteCursor:b	(I)I
        //   365: invokestatic 150	org/vidogram/messenger/u:a	(Lorg/vidogram/tgnet/g$ar;I)V
        //   368: aload 16
        //   370: aload 14
        //   372: bipush 6
        //   374: invokevirtual 95	org/vidogram/SQLite/SQLiteCursor:b	(I)I
        //   377: putfield 151	org/vidogram/tgnet/g$ar:b	I
        //   380: aload 14
        //   382: bipush 9
        //   384: invokevirtual 95	org/vidogram/SQLite/SQLiteCursor:b	(I)I
        //   387: istore_1
        //   388: iload_1
        //   389: ifeq +9 -> 398
        //   392: aload 15
        //   394: iload_1
        //   395: putfield 104	org/vidogram/tgnet/g$hq:l	I
        //   398: aload 16
        //   400: aload 14
        //   402: bipush 7
        //   404: invokevirtual 95	org/vidogram/SQLite/SQLiteCursor:b	(I)I
        //   407: putfield 154	org/vidogram/tgnet/g$ar:y	I
        //   410: aload 16
        //   412: aload 15
        //   414: getfield 92	org/vidogram/tgnet/g$hq:m	J
        //   417: putfield 157	org/vidogram/tgnet/g$ar:E	J
        //   420: aload 7
        //   422: getfield 159	org/vidogram/tgnet/g$wd:c	Ljava/util/ArrayList;
        //   425: aload 16
        //   427: invokevirtual 51	java/util/ArrayList:add	(Ljava/lang/Object;)Z
        //   430: pop
        //   431: aload 16
        //   433: aload 9
        //   435: aload 10
        //   437: invokestatic 162	org/vidogram/messenger/w:a	(Lorg/vidogram/tgnet/g$ar;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
        //   440: aload 16
        //   442: getfield 163	org/vidogram/tgnet/g$ar:g	I
        //   445: ifeq +175 -> 620
        //   448: aload 16
        //   450: getfield 166	org/vidogram/tgnet/g$ar:f	Lorg/vidogram/tgnet/g$as;
        //   453: instanceof 168
        //   456: ifne +14 -> 470
        //   459: aload 16
        //   461: getfield 166	org/vidogram/tgnet/g$ar:f	Lorg/vidogram/tgnet/g$as;
        //   464: instanceof 170
        //   467: ifeq +153 -> 620
        //   470: aload 14
        //   472: bipush 13
        //   474: invokevirtual 173	org/vidogram/SQLite/SQLiteCursor:a	(I)Z
        //   477: ifne +59 -> 536
        //   480: aload 14
        //   482: bipush 13
        //   484: invokevirtual 133	org/vidogram/SQLite/SQLiteCursor:g	(I)Lorg/vidogram/tgnet/NativeByteBuffer;
        //   487: astore 17
        //   489: aload 17
        //   491: ifnull +45 -> 536
        //   494: aload 16
        //   496: aload 17
        //   498: aload 17
        //   500: iconst_0
        //   501: invokevirtual 138	org/vidogram/tgnet/NativeByteBuffer:b	(Z)I
        //   504: iconst_0
        //   505: invokestatic 143	org/vidogram/tgnet/g$ar:a	(Lorg/vidogram/tgnet/a;IZ)Lorg/vidogram/tgnet/g$ar;
        //   508: putfield 177	org/vidogram/tgnet/g$ar:K	Lorg/vidogram/tgnet/g$ar;
        //   511: aload 17
        //   513: invokevirtual 145	org/vidogram/tgnet/NativeByteBuffer:e	()V
        //   516: aload 16
        //   518: getfield 177	org/vidogram/tgnet/g$ar:K	Lorg/vidogram/tgnet/g$ar;
        //   521: ifnull +15 -> 536
        //   524: aload 16
        //   526: getfield 177	org/vidogram/tgnet/g$ar:K	Lorg/vidogram/tgnet/g$ar;
        //   529: aload 9
        //   531: aload 10
        //   533: invokestatic 162	org/vidogram/messenger/w:a	(Lorg/vidogram/tgnet/g$ar;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
        //   536: aload 16
        //   538: getfield 177	org/vidogram/tgnet/g$ar:K	Lorg/vidogram/tgnet/g$ar;
        //   541: ifnonnull +79 -> 620
        //   544: aload 16
        //   546: getfield 163	org/vidogram/tgnet/g$ar:g	I
        //   549: i2l
        //   550: lstore 5
        //   552: lload 5
        //   554: lstore_3
        //   555: aload 16
        //   557: getfield 180	org/vidogram/tgnet/g$ar:d	Lorg/vidogram/tgnet/g$aw;
        //   560: getfield 183	org/vidogram/tgnet/g$aw:b	I
        //   563: ifeq +19 -> 582
        //   566: lload 5
        //   568: aload 16
        //   570: getfield 180	org/vidogram/tgnet/g$ar:d	Lorg/vidogram/tgnet/g$aw;
        //   573: getfield 183	org/vidogram/tgnet/g$aw:b	I
        //   576: i2l
        //   577: bipush 32
        //   579: lshl
        //   580: lor
        //   581: lstore_3
        //   582: aload 13
        //   584: lload_3
        //   585: invokestatic 188	java/lang/Long:valueOf	(J)Ljava/lang/Long;
        //   588: invokevirtual 191	java/util/ArrayList:contains	(Ljava/lang/Object;)Z
        //   591: ifne +13 -> 604
        //   594: aload 13
        //   596: lload_3
        //   597: invokestatic 188	java/lang/Long:valueOf	(J)Ljava/lang/Long;
        //   600: invokevirtual 51	java/util/ArrayList:add	(Ljava/lang/Object;)Z
        //   603: pop
        //   604: aload 12
        //   606: aload 15
        //   608: getfield 92	org/vidogram/tgnet/g$hq:m	J
        //   611: invokestatic 188	java/lang/Long:valueOf	(J)Ljava/lang/Long;
        //   614: aload 16
        //   616: invokevirtual 195	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   619: pop
        //   620: aload 15
        //   622: getfield 92	org/vidogram/tgnet/g$hq:m	J
        //   625: l2i
        //   626: istore_1
        //   627: aload 15
        //   629: getfield 92	org/vidogram/tgnet/g$hq:m	J
        //   632: bipush 32
        //   634: lshr
        //   635: l2i
        //   636: istore_2
        //   637: iload_1
        //   638: ifeq +161 -> 799
        //   641: iload_2
        //   642: iconst_1
        //   643: if_icmpne +100 -> 743
        //   646: aload 10
        //   648: iload_1
        //   649: invokestatic 47	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   652: invokevirtual 191	java/util/ArrayList:contains	(Ljava/lang/Object;)Z
        //   655: ifne -532 -> 123
        //   658: aload 10
        //   660: iload_1
        //   661: invokestatic 47	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   664: invokevirtual 51	java/util/ArrayList:add	(Ljava/lang/Object;)Z
        //   667: pop
        //   668: goto -545 -> 123
        //   671: astore 9
        //   673: aload 7
        //   675: getfield 130	org/vidogram/tgnet/g$wd:b	Ljava/util/ArrayList;
        //   678: invokevirtual 198	java/util/ArrayList:clear	()V
        //   681: aload 7
        //   683: getfield 200	org/vidogram/tgnet/g$wd:e	Ljava/util/ArrayList;
        //   686: invokevirtual 198	java/util/ArrayList:clear	()V
        //   689: aload 7
        //   691: getfield 202	org/vidogram/tgnet/g$wd:d	Ljava/util/ArrayList;
        //   694: invokevirtual 198	java/util/ArrayList:clear	()V
        //   697: aload 8
        //   699: invokevirtual 198	java/util/ArrayList:clear	()V
        //   702: ldc 204
        //   704: aload 9
        //   706: invokestatic 209	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   709: invokestatic 214	org/vidogram/messenger/v:a	()Lorg/vidogram/messenger/v;
        //   712: aload 7
        //   714: aload 8
        //   716: iconst_0
        //   717: bipush 100
        //   719: iconst_1
        //   720: iconst_1
        //   721: iconst_0
        //   722: invokevirtual 217	org/vidogram/messenger/v:a	(Lorg/vidogram/tgnet/g$wd;Ljava/util/ArrayList;IIIZZ)V
        //   725: return
        //   726: iconst_1
        //   727: istore_1
        //   728: goto -512 -> 216
        //   731: astore 16
        //   733: ldc 204
        //   735: aload 16
        //   737: invokestatic 209	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   740: goto -120 -> 620
        //   743: iload_1
        //   744: ifle +28 -> 772
        //   747: aload 9
        //   749: iload_1
        //   750: invokestatic 47	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   753: invokevirtual 191	java/util/ArrayList:contains	(Ljava/lang/Object;)Z
        //   756: ifne -633 -> 123
        //   759: aload 9
        //   761: iload_1
        //   762: invokestatic 47	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   765: invokevirtual 51	java/util/ArrayList:add	(Ljava/lang/Object;)Z
        //   768: pop
        //   769: goto -646 -> 123
        //   772: aload 10
        //   774: iload_1
        //   775: ineg
        //   776: invokestatic 47	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   779: invokevirtual 191	java/util/ArrayList:contains	(Ljava/lang/Object;)Z
        //   782: ifne -659 -> 123
        //   785: aload 10
        //   787: iload_1
        //   788: ineg
        //   789: invokestatic 47	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   792: invokevirtual 51	java/util/ArrayList:add	(Ljava/lang/Object;)Z
        //   795: pop
        //   796: goto -673 -> 123
        //   799: aload 11
        //   801: iload_2
        //   802: invokestatic 47	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   805: invokevirtual 191	java/util/ArrayList:contains	(Ljava/lang/Object;)Z
        //   808: ifne -685 -> 123
        //   811: aload 11
        //   813: iload_2
        //   814: invokestatic 47	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   817: invokevirtual 51	java/util/ArrayList:add	(Ljava/lang/Object;)Z
        //   820: pop
        //   821: goto -698 -> 123
        //   824: aload 14
        //   826: invokevirtual 219	org/vidogram/SQLite/SQLiteCursor:b	()V
        //   829: aload 13
        //   831: invokevirtual 222	java/util/ArrayList:isEmpty	()Z
        //   834: ifne +171 -> 1005
        //   837: aload_0
        //   838: getfield 19	org/vidogram/messenger/w$46:c	Lorg/vidogram/messenger/w;
        //   841: invokestatic 57	org/vidogram/messenger/w:a	(Lorg/vidogram/messenger/w;)Lorg/vidogram/SQLite/SQLiteDatabase;
        //   844: getstatic 63	java/util/Locale:US	Ljava/util/Locale;
        //   847: ldc 224
        //   849: iconst_1
        //   850: anewarray 4	java/lang/Object
        //   853: dup
        //   854: iconst_0
        //   855: ldc 226
        //   857: aload 13
        //   859: invokestatic 232	android/text/TextUtils:join	(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;
        //   862: aastore
        //   863: invokestatic 71	java/lang/String:format	(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   866: iconst_0
        //   867: anewarray 4	java/lang/Object
        //   870: invokevirtual 76	org/vidogram/SQLite/SQLiteDatabase:b	(Ljava/lang/String;[Ljava/lang/Object;)Lorg/vidogram/SQLite/SQLiteCursor;
        //   873: astore 13
        //   875: aload 13
        //   877: invokevirtual 81	org/vidogram/SQLite/SQLiteCursor:a	()Z
        //   880: ifeq +120 -> 1000
        //   883: aload 13
        //   885: iconst_0
        //   886: invokevirtual 133	org/vidogram/SQLite/SQLiteCursor:g	(I)Lorg/vidogram/tgnet/NativeByteBuffer;
        //   889: astore 15
        //   891: aload 15
        //   893: ifnull -18 -> 875
        //   896: aload 15
        //   898: aload 15
        //   900: iconst_0
        //   901: invokevirtual 138	org/vidogram/tgnet/NativeByteBuffer:b	(Z)I
        //   904: iconst_0
        //   905: invokestatic 143	org/vidogram/tgnet/g$ar:a	(Lorg/vidogram/tgnet/a;IZ)Lorg/vidogram/tgnet/g$ar;
        //   908: astore 14
        //   910: aload 15
        //   912: invokevirtual 145	org/vidogram/tgnet/NativeByteBuffer:e	()V
        //   915: aload 14
        //   917: aload 13
        //   919: iconst_1
        //   920: invokevirtual 95	org/vidogram/SQLite/SQLiteCursor:b	(I)I
        //   923: putfield 151	org/vidogram/tgnet/g$ar:b	I
        //   926: aload 14
        //   928: aload 13
        //   930: iconst_2
        //   931: invokevirtual 95	org/vidogram/SQLite/SQLiteCursor:b	(I)I
        //   934: putfield 233	org/vidogram/tgnet/g$ar:e	I
        //   937: aload 14
        //   939: aload 13
        //   941: iconst_3
        //   942: invokevirtual 88	org/vidogram/SQLite/SQLiteCursor:d	(I)J
        //   945: putfield 157	org/vidogram/tgnet/g$ar:E	J
        //   948: aload 14
        //   950: aload 9
        //   952: aload 10
        //   954: invokestatic 162	org/vidogram/messenger/w:a	(Lorg/vidogram/tgnet/g$ar;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
        //   957: aload 12
        //   959: aload 14
        //   961: getfield 157	org/vidogram/tgnet/g$ar:E	J
        //   964: invokestatic 188	java/lang/Long:valueOf	(J)Ljava/lang/Long;
        //   967: invokevirtual 237	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
        //   970: checkcast 140	org/vidogram/tgnet/g$ar
        //   973: astore 15
        //   975: aload 15
        //   977: ifnull -102 -> 875
        //   980: aload 15
        //   982: aload 14
        //   984: putfield 177	org/vidogram/tgnet/g$ar:K	Lorg/vidogram/tgnet/g$ar;
        //   987: aload 14
        //   989: aload 15
        //   991: getfield 157	org/vidogram/tgnet/g$ar:E	J
        //   994: putfield 157	org/vidogram/tgnet/g$ar:E	J
        //   997: goto -122 -> 875
        //   1000: aload 13
        //   1002: invokevirtual 219	org/vidogram/SQLite/SQLiteCursor:b	()V
        //   1005: aload 11
        //   1007: invokevirtual 222	java/util/ArrayList:isEmpty	()Z
        //   1010: ifne +21 -> 1031
        //   1013: aload_0
        //   1014: getfield 19	org/vidogram/messenger/w$46:c	Lorg/vidogram/messenger/w;
        //   1017: ldc 226
        //   1019: aload 11
        //   1021: invokestatic 232	android/text/TextUtils:join	(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;
        //   1024: aload 8
        //   1026: aload 9
        //   1028: invokevirtual 240	org/vidogram/messenger/w:a	(Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
        //   1031: aload 10
        //   1033: invokevirtual 222	java/util/ArrayList:isEmpty	()Z
        //   1036: ifne +22 -> 1058
        //   1039: aload_0
        //   1040: getfield 19	org/vidogram/messenger/w$46:c	Lorg/vidogram/messenger/w;
        //   1043: ldc 226
        //   1045: aload 10
        //   1047: invokestatic 232	android/text/TextUtils:join	(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;
        //   1050: aload 7
        //   1052: getfield 202	org/vidogram/tgnet/g$wd:d	Ljava/util/ArrayList;
        //   1055: invokevirtual 243	org/vidogram/messenger/w:b	(Ljava/lang/String;Ljava/util/ArrayList;)V
        //   1058: aload 9
        //   1060: invokevirtual 222	java/util/ArrayList:isEmpty	()Z
        //   1063: ifne +22 -> 1085
        //   1066: aload_0
        //   1067: getfield 19	org/vidogram/messenger/w$46:c	Lorg/vidogram/messenger/w;
        //   1070: ldc 226
        //   1072: aload 9
        //   1074: invokestatic 232	android/text/TextUtils:join	(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;
        //   1077: aload 7
        //   1079: getfield 200	org/vidogram/tgnet/g$wd:e	Ljava/util/ArrayList;
        //   1082: invokevirtual 245	org/vidogram/messenger/w:a	(Ljava/lang/String;Ljava/util/ArrayList;)V
        //   1085: invokestatic 214	org/vidogram/messenger/v:a	()Lorg/vidogram/messenger/v;
        //   1088: aload 7
        //   1090: aload 8
        //   1092: aload_0
        //   1093: getfield 21	org/vidogram/messenger/w$46:a	I
        //   1096: aload_0
        //   1097: getfield 23	org/vidogram/messenger/w$46:b	I
        //   1100: iconst_1
        //   1101: iconst_0
        //   1102: iconst_0
        //   1103: invokevirtual 217	org/vidogram/messenger/v:a	(Lorg/vidogram/tgnet/g$wd;Ljava/util/ArrayList;IIIZZ)V
        //   1106: return
        //   1107: iconst_0
        //   1108: istore_1
        //   1109: goto -893 -> 216
        //
        // Exception table:
        //   from	to	target	type
        //   18	123	671	java/lang/Exception
        //   123	213	671	java/lang/Exception
        //   216	254	671	java/lang/Exception
        //   257	269	671	java/lang/Exception
        //   275	309	671	java/lang/Exception
        //   309	328	671	java/lang/Exception
        //   333	352	671	java/lang/Exception
        //   357	388	671	java/lang/Exception
        //   392	398	671	java/lang/Exception
        //   398	440	671	java/lang/Exception
        //   620	637	671	java/lang/Exception
        //   646	668	671	java/lang/Exception
        //   733	740	671	java/lang/Exception
        //   747	769	671	java/lang/Exception
        //   772	796	671	java/lang/Exception
        //   799	821	671	java/lang/Exception
        //   824	875	671	java/lang/Exception
        //   875	891	671	java/lang/Exception
        //   896	975	671	java/lang/Exception
        //   980	997	671	java/lang/Exception
        //   1000	1005	671	java/lang/Exception
        //   1005	1031	671	java/lang/Exception
        //   1031	1058	671	java/lang/Exception
        //   1058	1085	671	java/lang/Exception
        //   1085	1106	671	java/lang/Exception
        //   440	470	731	java/lang/Exception
        //   470	489	731	java/lang/Exception
        //   494	536	731	java/lang/Exception
        //   536	552	731	java/lang/Exception
        //   555	582	731	java/lang/Exception
        //   582	604	731	java/lang/Exception
        //   604	620	731	java/lang/Exception
      }
    });
  }

  public void c(ArrayList<Long> paramArrayList)
  {
    if ((paramArrayList == null) || (paramArrayList.isEmpty()))
      return;
    this.h.b(new Runnable(paramArrayList)
    {
      public void run()
      {
        try
        {
          w.a(w.this).a(String.format(Locale.US, "UPDATE messages SET read_state = read_state | 2 WHERE mid IN (%s)", new Object[] { TextUtils.join(",", this.a) })).c().e();
          return;
        }
        catch (Exception localException)
        {
          n.a("tmessages", localException);
        }
      }
    });
  }

  public void c(g.t paramt)
  {
    if (paramt == null)
      return;
    this.h.b(new Runnable(paramt)
    {
      public void run()
      {
        int j = 1;
        NativeByteBuffer localNativeByteBuffer1 = null;
        SQLitePreparedStatement localSQLitePreparedStatement2 = null;
        SQLitePreparedStatement localSQLitePreparedStatement1 = localSQLitePreparedStatement2;
        Object localObject1 = localNativeByteBuffer1;
        try
        {
          if (this.a.s != null)
          {
            localSQLitePreparedStatement1 = localSQLitePreparedStatement2;
            localObject1 = localNativeByteBuffer1;
            if (this.a.s.length >= 16);
          }
          else
          {
            localSQLitePreparedStatement1 = localSQLitePreparedStatement2;
            localObject1 = localNativeByteBuffer1;
            if (this.a.l != null)
            {
              localSQLitePreparedStatement1 = localSQLitePreparedStatement2;
              localObject1 = localNativeByteBuffer1;
              this.a.s = a.b(this.a.l);
            }
          }
          localSQLitePreparedStatement1 = localSQLitePreparedStatement2;
          localObject1 = localNativeByteBuffer1;
          localSQLitePreparedStatement2 = w.a(w.this).a("UPDATE enc_chats SET data = ?, g = ?, authkey = ?, ttl = ?, layer = ?, seq_in = ?, seq_out = ?, use_count = ?, exchange_id = ?, key_date = ?, fprint = ?, fauthkey = ?, khash = ?, in_seq_no = ? WHERE uid = ?");
          localSQLitePreparedStatement1 = localSQLitePreparedStatement2;
          localObject1 = localSQLitePreparedStatement2;
          localNativeByteBuffer1 = new NativeByteBuffer(this.a.b());
          localSQLitePreparedStatement1 = localSQLitePreparedStatement2;
          localObject1 = localSQLitePreparedStatement2;
          NativeByteBuffer localNativeByteBuffer2;
          label213: NativeByteBuffer localNativeByteBuffer3;
          if (this.a.k != null)
          {
            localSQLitePreparedStatement1 = localSQLitePreparedStatement2;
            localObject1 = localSQLitePreparedStatement2;
            i = this.a.k.length;
            localSQLitePreparedStatement1 = localSQLitePreparedStatement2;
            localObject1 = localSQLitePreparedStatement2;
            localNativeByteBuffer2 = new NativeByteBuffer(i);
            localSQLitePreparedStatement1 = localSQLitePreparedStatement2;
            localObject1 = localSQLitePreparedStatement2;
            if (this.a.l == null)
              break label877;
            localSQLitePreparedStatement1 = localSQLitePreparedStatement2;
            localObject1 = localSQLitePreparedStatement2;
            i = this.a.l.length;
            localSQLitePreparedStatement1 = localSQLitePreparedStatement2;
            localObject1 = localSQLitePreparedStatement2;
            localNativeByteBuffer3 = new NativeByteBuffer(i);
            localSQLitePreparedStatement1 = localSQLitePreparedStatement2;
            localObject1 = localSQLitePreparedStatement2;
            if (this.a.y == null)
              break label882;
            localSQLitePreparedStatement1 = localSQLitePreparedStatement2;
            localObject1 = localSQLitePreparedStatement2;
          }
          label877: label882: for (int i = this.a.y.length; ; i = 1)
          {
            localSQLitePreparedStatement1 = localSQLitePreparedStatement2;
            localObject1 = localSQLitePreparedStatement2;
            NativeByteBuffer localNativeByteBuffer4 = new NativeByteBuffer(i);
            i = j;
            localSQLitePreparedStatement1 = localSQLitePreparedStatement2;
            localObject1 = localSQLitePreparedStatement2;
            if (this.a.s != null)
            {
              localSQLitePreparedStatement1 = localSQLitePreparedStatement2;
              localObject1 = localSQLitePreparedStatement2;
              i = this.a.s.length;
            }
            localSQLitePreparedStatement1 = localSQLitePreparedStatement2;
            localObject1 = localSQLitePreparedStatement2;
            NativeByteBuffer localNativeByteBuffer5 = new NativeByteBuffer(i);
            localSQLitePreparedStatement1 = localSQLitePreparedStatement2;
            localObject1 = localSQLitePreparedStatement2;
            this.a.a(localNativeByteBuffer1);
            localSQLitePreparedStatement1 = localSQLitePreparedStatement2;
            localObject1 = localSQLitePreparedStatement2;
            localSQLitePreparedStatement2.a(1, localNativeByteBuffer1);
            localSQLitePreparedStatement1 = localSQLitePreparedStatement2;
            localObject1 = localSQLitePreparedStatement2;
            if (this.a.k != null)
            {
              localSQLitePreparedStatement1 = localSQLitePreparedStatement2;
              localObject1 = localSQLitePreparedStatement2;
              localNativeByteBuffer2.b(this.a.k);
            }
            localSQLitePreparedStatement1 = localSQLitePreparedStatement2;
            localObject1 = localSQLitePreparedStatement2;
            if (this.a.l != null)
            {
              localSQLitePreparedStatement1 = localSQLitePreparedStatement2;
              localObject1 = localSQLitePreparedStatement2;
              localNativeByteBuffer3.b(this.a.l);
            }
            localSQLitePreparedStatement1 = localSQLitePreparedStatement2;
            localObject1 = localSQLitePreparedStatement2;
            if (this.a.y != null)
            {
              localSQLitePreparedStatement1 = localSQLitePreparedStatement2;
              localObject1 = localSQLitePreparedStatement2;
              localNativeByteBuffer4.b(this.a.y);
            }
            localSQLitePreparedStatement1 = localSQLitePreparedStatement2;
            localObject1 = localSQLitePreparedStatement2;
            if (this.a.s != null)
            {
              localSQLitePreparedStatement1 = localSQLitePreparedStatement2;
              localObject1 = localSQLitePreparedStatement2;
              localNativeByteBuffer5.b(this.a.s);
            }
            localSQLitePreparedStatement1 = localSQLitePreparedStatement2;
            localObject1 = localSQLitePreparedStatement2;
            localSQLitePreparedStatement2.a(2, localNativeByteBuffer2);
            localSQLitePreparedStatement1 = localSQLitePreparedStatement2;
            localObject1 = localSQLitePreparedStatement2;
            localSQLitePreparedStatement2.a(3, localNativeByteBuffer3);
            localSQLitePreparedStatement1 = localSQLitePreparedStatement2;
            localObject1 = localSQLitePreparedStatement2;
            localSQLitePreparedStatement2.a(4, this.a.n);
            localSQLitePreparedStatement1 = localSQLitePreparedStatement2;
            localObject1 = localSQLitePreparedStatement2;
            localSQLitePreparedStatement2.a(5, this.a.o);
            localSQLitePreparedStatement1 = localSQLitePreparedStatement2;
            localObject1 = localSQLitePreparedStatement2;
            localSQLitePreparedStatement2.a(6, this.a.p);
            localSQLitePreparedStatement1 = localSQLitePreparedStatement2;
            localObject1 = localSQLitePreparedStatement2;
            localSQLitePreparedStatement2.a(7, this.a.q);
            localSQLitePreparedStatement1 = localSQLitePreparedStatement2;
            localObject1 = localSQLitePreparedStatement2;
            localSQLitePreparedStatement2.a(8, this.a.t << 16 | this.a.u);
            localSQLitePreparedStatement1 = localSQLitePreparedStatement2;
            localObject1 = localSQLitePreparedStatement2;
            localSQLitePreparedStatement2.a(9, this.a.v);
            localSQLitePreparedStatement1 = localSQLitePreparedStatement2;
            localObject1 = localSQLitePreparedStatement2;
            localSQLitePreparedStatement2.a(10, this.a.w);
            localSQLitePreparedStatement1 = localSQLitePreparedStatement2;
            localObject1 = localSQLitePreparedStatement2;
            localSQLitePreparedStatement2.a(11, this.a.x);
            localSQLitePreparedStatement1 = localSQLitePreparedStatement2;
            localObject1 = localSQLitePreparedStatement2;
            localSQLitePreparedStatement2.a(12, localNativeByteBuffer4);
            localSQLitePreparedStatement1 = localSQLitePreparedStatement2;
            localObject1 = localSQLitePreparedStatement2;
            localSQLitePreparedStatement2.a(13, localNativeByteBuffer5);
            localSQLitePreparedStatement1 = localSQLitePreparedStatement2;
            localObject1 = localSQLitePreparedStatement2;
            localSQLitePreparedStatement2.a(14, this.a.r);
            localSQLitePreparedStatement1 = localSQLitePreparedStatement2;
            localObject1 = localSQLitePreparedStatement2;
            localSQLitePreparedStatement2.a(15, this.a.b);
            localSQLitePreparedStatement1 = localSQLitePreparedStatement2;
            localObject1 = localSQLitePreparedStatement2;
            localSQLitePreparedStatement2.b();
            localSQLitePreparedStatement1 = localSQLitePreparedStatement2;
            localObject1 = localSQLitePreparedStatement2;
            localNativeByteBuffer1.e();
            localSQLitePreparedStatement1 = localSQLitePreparedStatement2;
            localObject1 = localSQLitePreparedStatement2;
            localNativeByteBuffer2.e();
            localSQLitePreparedStatement1 = localSQLitePreparedStatement2;
            localObject1 = localSQLitePreparedStatement2;
            localNativeByteBuffer3.e();
            localSQLitePreparedStatement1 = localSQLitePreparedStatement2;
            localObject1 = localSQLitePreparedStatement2;
            localNativeByteBuffer4.e();
            localSQLitePreparedStatement1 = localSQLitePreparedStatement2;
            localObject1 = localSQLitePreparedStatement2;
            localNativeByteBuffer5.e();
            if (localSQLitePreparedStatement2 != null)
              localSQLitePreparedStatement2.e();
            return;
            i = 1;
            break;
            i = 1;
            break label213;
          }
        }
        catch (Exception localException)
        {
          do
          {
            localObject1 = localSQLitePreparedStatement1;
            n.a("tmessages", localException);
          }
          while (localSQLitePreparedStatement1 == null);
          localSQLitePreparedStatement1.e();
          return;
        }
        finally
        {
          if (localObject1 != null)
            ((SQLitePreparedStatement)localObject1).e();
        }
        throw localObject2;
      }
    });
  }

  public ArrayList<g.vw> d(ArrayList<Integer> paramArrayList)
  {
    ArrayList localArrayList = new ArrayList();
    try
    {
      a(TextUtils.join(",", paramArrayList), localArrayList);
      return localArrayList;
    }
    catch (Exception paramArrayList)
    {
      localArrayList.clear();
      n.a("tmessages", paramArrayList);
    }
    return localArrayList;
  }

  public void d()
  {
    int i1 = 0;
    this.j = new File(ApplicationLoader.h(), "cache4.db");
    if (!this.j.exists())
      i1 = 1;
    try
    {
      this.i = new SQLiteDatabase(this.j.getPath());
      this.i.a("PRAGMA secure_delete = ON").c().e();
      this.i.a("PRAGMA temp_store = 1").c().e();
      if (i1 != 0)
      {
        this.i.a("CREATE TABLE messages_holes(uid INTEGER, start INTEGER, end INTEGER, PRIMARY KEY(uid, start));").c().e();
        this.i.a("CREATE INDEX IF NOT EXISTS uid_end_messages_holes ON messages_holes(uid, end);").c().e();
        this.i.a("CREATE TABLE media_holes_v2(uid INTEGER, type INTEGER, start INTEGER, end INTEGER, PRIMARY KEY(uid, type, start));").c().e();
        this.i.a("CREATE INDEX IF NOT EXISTS uid_end_media_holes_v2 ON media_holes_v2(uid, type, end);").c().e();
        this.i.a("CREATE TABLE messages(mid INTEGER PRIMARY KEY, uid INTEGER, read_state INTEGER, send_state INTEGER, date INTEGER, data BLOB, out INTEGER, ttl INTEGER, media INTEGER, replydata BLOB, imp INTEGER)").c().e();
        this.i.a("CREATE INDEX IF NOT EXISTS uid_mid_idx_messages ON messages(uid, mid);").c().e();
        this.i.a("CREATE INDEX IF NOT EXISTS uid_date_mid_idx_messages ON messages(uid, date, mid);").c().e();
        this.i.a("CREATE INDEX IF NOT EXISTS mid_out_idx_messages ON messages(mid, out);").c().e();
        this.i.a("CREATE INDEX IF NOT EXISTS task_idx_messages ON messages(uid, out, read_state, ttl, date, send_state);").c().e();
        this.i.a("CREATE INDEX IF NOT EXISTS send_state_idx_messages ON messages(mid, send_state, date) WHERE mid < 0 AND send_state = 1;").c().e();
        this.i.a("CREATE TABLE download_queue(uid INTEGER, type INTEGER, date INTEGER, data BLOB, PRIMARY KEY (uid, type));").c().e();
        this.i.a("CREATE INDEX IF NOT EXISTS type_date_idx_download_queue ON download_queue(type, date);").c().e();
        this.i.a("CREATE TABLE user_phones_v6(uid INTEGER, phone TEXT, sphone TEXT, deleted INTEGER, PRIMARY KEY (uid, phone))").c().e();
        this.i.a("CREATE INDEX IF NOT EXISTS sphone_deleted_idx_user_phones ON user_phones_v6(sphone, deleted);").c().e();
        this.i.a("CREATE TABLE dialogs(did INTEGER PRIMARY KEY, date INTEGER, unread_count INTEGER, last_mid INTEGER, inbox_max INTEGER, outbox_max INTEGER, last_mid_i INTEGER, unread_count_i INTEGER, pts INTEGER, date_i INTEGER)").c().e();
        this.i.a("CREATE INDEX IF NOT EXISTS date_idx_dialogs ON dialogs(date);").c().e();
        this.i.a("CREATE INDEX IF NOT EXISTS last_mid_idx_dialogs ON dialogs(last_mid);").c().e();
        this.i.a("CREATE INDEX IF NOT EXISTS unread_count_idx_dialogs ON dialogs(unread_count);").c().e();
        this.i.a("CREATE INDEX IF NOT EXISTS last_mid_i_idx_dialogs ON dialogs(last_mid_i);").c().e();
        this.i.a("CREATE INDEX IF NOT EXISTS unread_count_i_idx_dialogs ON dialogs(unread_count_i);").c().e();
        this.i.a("CREATE TABLE randoms(random_id INTEGER, mid INTEGER, PRIMARY KEY (random_id, mid))").c().e();
        this.i.a("CREATE INDEX IF NOT EXISTS mid_idx_randoms ON randoms(mid);").c().e();
        this.i.a("CREATE TABLE enc_tasks_v2(mid INTEGER PRIMARY KEY, date INTEGER)").c().e();
        this.i.a("CREATE INDEX IF NOT EXISTS date_idx_enc_tasks_v2 ON enc_tasks_v2(date);").c().e();
        this.i.a("CREATE TABLE messages_seq(mid INTEGER PRIMARY KEY, seq_in INTEGER, seq_out INTEGER);").c().e();
        this.i.a("CREATE INDEX IF NOT EXISTS seq_idx_messages_seq ON messages_seq(seq_in, seq_out);").c().e();
        this.i.a("CREATE TABLE params(id INTEGER PRIMARY KEY, seq INTEGER, pts INTEGER, date INTEGER, qts INTEGER, lsv INTEGER, sg INTEGER, pbytes BLOB)").c().e();
        this.i.a("INSERT INTO params VALUES(1, 0, 0, 0, 0, 0, 0, NULL)").c().e();
        this.i.a("CREATE TABLE media_v2(mid INTEGER PRIMARY KEY, uid INTEGER, date INTEGER, type INTEGER, data BLOB)").c().e();
        this.i.a("CREATE INDEX IF NOT EXISTS uid_mid_type_date_idx_media ON media_v2(uid, mid, type, date);").c().e();
        this.i.a("CREATE TABLE bot_keyboard(uid INTEGER PRIMARY KEY, mid INTEGER, info BLOB)").c().e();
        this.i.a("CREATE INDEX IF NOT EXISTS bot_keyboard_idx_mid ON bot_keyboard(mid);").c().e();
        this.i.a("CREATE TABLE chat_settings_v2(uid INTEGER PRIMARY KEY, info BLOB, pinned INTEGER)").c().e();
        this.i.a("CREATE INDEX IF NOT EXISTS chat_settings_pinned_idx ON chat_settings_v2(uid, pinned) WHERE pinned != 0;").c().e();
        this.i.a("CREATE TABLE chat_pinned(uid INTEGER PRIMARY KEY, pinned INTEGER, data BLOB)").c().e();
        this.i.a("CREATE INDEX IF NOT EXISTS chat_pinned_mid_idx ON chat_pinned(uid, pinned) WHERE pinned != 0;").c().e();
        this.i.a("CREATE TABLE chat_hints(did INTEGER, type INTEGER, rating REAL, date INTEGER, PRIMARY KEY(did, type))").c().e();
        this.i.a("CREATE INDEX IF NOT EXISTS chat_hints_rating_idx ON chat_hints(rating);").c().e();
        this.i.a("CREATE TABLE users_data(uid INTEGER PRIMARY KEY, about TEXT)").c().e();
        this.i.a("CREATE TABLE users(uid INTEGER PRIMARY KEY, name TEXT, status INTEGER, data BLOB)").c().e();
        this.i.a("CREATE TABLE chats(uid INTEGER PRIMARY KEY, name TEXT, data BLOB)").c().e();
        this.i.a("CREATE TABLE enc_chats(uid INTEGER PRIMARY KEY, user INTEGER, name TEXT, data BLOB, g BLOB, authkey BLOB, ttl INTEGER, layer INTEGER, seq_in INTEGER, seq_out INTEGER, use_count INTEGER, exchange_id INTEGER, key_date INTEGER, fprint INTEGER, fauthkey BLOB, khash BLOB, in_seq_no INTEGER)").c().e();
        this.i.a("CREATE TABLE channel_users_v2(did INTEGER, uid INTEGER, date INTEGER, data BLOB, PRIMARY KEY(did, uid))").c().e();
        this.i.a("CREATE TABLE contacts(uid INTEGER PRIMARY KEY, mutual INTEGER)").c().e();
        this.i.a("CREATE TABLE wallpapers(uid INTEGER PRIMARY KEY, data BLOB)").c().e();
        this.i.a("CREATE TABLE user_photos(uid INTEGER, id INTEGER, data BLOB, PRIMARY KEY (uid, id))").c().e();
        this.i.a("CREATE TABLE blocked_users(uid INTEGER PRIMARY KEY)").c().e();
        this.i.a("CREATE TABLE dialog_settings(did INTEGER PRIMARY KEY, flags INTEGER);").c().e();
        this.i.a("CREATE TABLE web_recent_v3(id TEXT, type INTEGER, image_url TEXT, thumb_url TEXT, local_url TEXT, width INTEGER, height INTEGER, size INTEGER, date INTEGER, document BLOB, PRIMARY KEY (id, type));").c().e();
        this.i.a("CREATE TABLE stickers_v2(id INTEGER PRIMARY KEY, data BLOB, date INTEGER, hash TEXT);").c().e();
        this.i.a("CREATE TABLE stickers_featured(id INTEGER PRIMARY KEY, data BLOB, unread BLOB, date INTEGER, hash TEXT);").c().e();
        this.i.a("CREATE TABLE hashtag_recent_v2(id TEXT PRIMARY KEY, date INTEGER);").c().e();
        this.i.a("CREATE TABLE webpage_pending(id INTEGER, mid INTEGER, PRIMARY KEY (id, mid));").c().e();
        this.i.a("CREATE TABLE user_contacts_v6(uid INTEGER PRIMARY KEY, fname TEXT, sname TEXT)").c().e();
        this.i.a("CREATE TABLE sent_files_v2(uid TEXT, type INTEGER, data BLOB, PRIMARY KEY (uid, type))").c().e();
        this.i.a("CREATE TABLE search_recent(did INTEGER PRIMARY KEY, date INTEGER);").c().e();
        this.i.a("CREATE TABLE media_counts_v2(uid INTEGER, type INTEGER, count INTEGER, PRIMARY KEY(uid, type))").c().e();
        this.i.a("CREATE TABLE keyvalue(id TEXT PRIMARY KEY, value TEXT)").c().e();
        this.i.a("CREATE TABLE bot_info(uid INTEGER PRIMARY KEY, info BLOB)").c().e();
        this.i.a("CREATE TABLE pending_tasks(id INTEGER PRIMARY KEY, data BLOB);").c().e();
        this.i.a("CREATE TABLE requested_holes(uid INTEGER, seq_out_start INTEGER, seq_out_end INTEGER, PRIMARY KEY (uid, seq_out_start, seq_out_end));").c().e();
        this.i.a("PRAGMA user_version = 37").c().e();
        e();
        j();
        return;
      }
    }
    catch (Exception localException3)
    {
      try
      {
        SQLiteCursor localSQLiteCursor = this.i.b("SELECT seq, pts, date, qts, lsv, sg, pbytes FROM params WHERE id = 1", new Object[0]);
        if (localSQLiteCursor.a())
        {
          d = localSQLiteCursor.b(0);
          b = localSQLiteCursor.b(1);
          a = localSQLiteCursor.b(2);
          c = localSQLiteCursor.b(3);
          e = localSQLiteCursor.b(4);
          g = localSQLiteCursor.b(5);
          if (!localSQLiteCursor.a(6))
            break label1216;
          f = null;
        }
        while (true)
        {
          localSQLiteCursor.b();
          i1 = this.i.a("PRAGMA user_version", new Object[0]).intValue();
          if (i1 >= 37)
            break;
          a(i1);
          break;
          localException1 = localException1;
          n.a("tmessages", localException1);
          break;
          label1216: f = localException1.f(6);
          if ((f == null) || (f.length != 1))
            continue;
          f = null;
        }
      }
      catch (Exception localException3)
      {
        while (true)
        {
          n.a("tmessages", localException2);
          try
          {
            this.i.a("CREATE TABLE IF NOT EXISTS params(id INTEGER PRIMARY KEY, seq INTEGER, pts INTEGER, date INTEGER, qts INTEGER, lsv INTEGER, sg INTEGER, pbytes BLOB)").c().e();
            this.i.a("INSERT INTO params VALUES(1, 0, 0, 0, 0, 0, 0, NULL)").c().e();
          }
          catch (Exception localException3)
          {
            n.a("tmessages", localException3);
          }
        }
      }
    }
  }

  public void d(int paramInt)
  {
    this.h.b(new Runnable(paramInt)
    {
      public void run()
      {
        Object localObject2;
        ArrayList localArrayList2;
        ArrayList localArrayList3;
        ArrayList localArrayList4;
        Object localObject3;
        Object localObject1;
        ArrayList localArrayList5;
        ArrayList localArrayList6;
        SQLiteCursor localSQLiteCursor;
        int i;
        while (true)
        {
          int j;
          try
          {
            localObject2 = new HashMap();
            ArrayList localArrayList1 = new ArrayList();
            localArrayList2 = new ArrayList();
            localArrayList3 = new ArrayList();
            localArrayList4 = new ArrayList();
            localObject3 = new ArrayList();
            localObject1 = new ArrayList();
            localArrayList5 = new ArrayList();
            localArrayList6 = new ArrayList();
            localSQLiteCursor = w.a(w.this).b("SELECT m.read_state, m.data, m.send_state, m.mid, m.date, r.random_id, m.uid, s.seq_in, s.seq_out, m.ttl FROM messages as m LEFT JOIN randoms as r ON r.mid = m.mid LEFT JOIN messages_seq as s ON m.mid = s.mid WHERE m.mid < 0 AND m.send_state = 1 ORDER BY m.mid DESC LIMIT " + this.a, new Object[0]);
            if (!localSQLiteCursor.a())
              break;
            NativeByteBuffer localNativeByteBuffer = localSQLiteCursor.g(1);
            if (localNativeByteBuffer == null)
              continue;
            g.ar localar = g.ar.a(localNativeByteBuffer, localNativeByteBuffer.b(false), false);
            localNativeByteBuffer.e();
            if (((HashMap)localObject2).containsKey(Integer.valueOf(localar.b)))
              continue;
            u.a(localar, localSQLiteCursor.b(0));
            localar.b = localSQLiteCursor.b(3);
            localar.e = localSQLiteCursor.b(4);
            if (localSQLiteCursor.a(5))
              continue;
            localar.C = localSQLiteCursor.d(5);
            localar.E = localSQLiteCursor.d(6);
            localar.H = localSQLiteCursor.b(7);
            localar.I = localSQLiteCursor.b(8);
            localar.F = localSQLiteCursor.b(9);
            localArrayList1.add(localar);
            ((HashMap)localObject2).put(Integer.valueOf(localar.b), localar);
            i = (int)localar.E;
            j = (int)(localar.E >> 32);
            if (i == 0)
              break label496;
            if (j == 1)
            {
              if (localArrayList5.contains(Integer.valueOf(i)))
                continue;
              localArrayList5.add(Integer.valueOf(i));
              w.a(localar, (ArrayList)localObject3, (ArrayList)localObject1);
              localar.y = localSQLiteCursor.b(2);
              if (((localar.d.b != 0) || (u.b(localar)) || (i == 0)) && (localar.b <= 0))
                continue;
              localar.y = 0;
              if ((i != 0) || (localSQLiteCursor.a(5)))
                continue;
              localar.C = localSQLiteCursor.d(5);
              continue;
            }
          }
          catch (Exception localException)
          {
            n.a("tmessages", localException);
            return;
          }
          if (i < 0)
          {
            j = -i;
            if (((ArrayList)localObject1).contains(Integer.valueOf(j)))
              continue;
            ((ArrayList)localObject1).add(Integer.valueOf(-i));
            continue;
          }
          if (((ArrayList)localObject3).contains(Integer.valueOf(i)))
            continue;
          ((ArrayList)localObject3).add(Integer.valueOf(i));
          continue;
          label496: if (localArrayList6.contains(Integer.valueOf(j)))
            continue;
          localArrayList6.add(Integer.valueOf(j));
        }
        localSQLiteCursor.b();
        if (!localArrayList6.isEmpty())
          w.this.a(TextUtils.join(",", localArrayList6), localArrayList4, (ArrayList)localObject3);
        if (!((ArrayList)localObject3).isEmpty())
          w.this.a(TextUtils.join(",", (Iterable)localObject3), localArrayList2);
        if ((!((ArrayList)localObject1).isEmpty()) || (!localArrayList5.isEmpty()))
        {
          localObject2 = new StringBuilder();
          i = 0;
          while (i < ((ArrayList)localObject1).size())
          {
            localObject3 = (Integer)((ArrayList)localObject1).get(i);
            if (((StringBuilder)localObject2).length() != 0)
              ((StringBuilder)localObject2).append(",");
            ((StringBuilder)localObject2).append(localObject3);
            i += 1;
          }
        }
        while (true)
        {
          if (i < localArrayList5.size())
          {
            localObject1 = (Integer)localArrayList5.get(i);
            if (((StringBuilder)localObject2).length() != 0)
              ((StringBuilder)localObject2).append(",");
            ((StringBuilder)localObject2).append(-((Integer)localObject1).intValue());
            i += 1;
            continue;
          }
          w.this.b(((StringBuilder)localObject2).toString(), localArrayList3);
          ac.a().a(localException, localArrayList2, localArrayList3, localArrayList4);
          return;
          i = 0;
        }
      }
    });
  }

  public void e()
  {
    this.h.b(new Runnable()
    {
      public void run()
      {
        ArrayList localArrayList1;
        ArrayList localArrayList2;
        ArrayList localArrayList3;
        HashMap localHashMap1;
        Object localObject3;
        long l1;
        int i;
        int j;
        while (true)
        {
          try
          {
            localArrayList1 = new ArrayList();
            localArrayList2 = new ArrayList();
            localArrayList3 = new ArrayList();
            localHashMap1 = new HashMap();
            localObject3 = w.a(w.this).b("SELECT d.did, d.unread_count, s.flags FROM dialogs as d LEFT JOIN dialog_settings as s ON d.did = s.did WHERE d.unread_count != 0", new Object[0]);
            StringBuilder localStringBuilder = new StringBuilder();
            if (!((SQLiteCursor)localObject3).a())
              break;
            if ((!((SQLiteCursor)localObject3).a(2)) && (((SQLiteCursor)localObject3).b(2) == 1))
              continue;
            l1 = ((SQLiteCursor)localObject3).d(0);
            localHashMap1.put(Long.valueOf(l1), Integer.valueOf(((SQLiteCursor)localObject3).b(1)));
            if (localStringBuilder.length() == 0)
              continue;
            localStringBuilder.append(",");
            localStringBuilder.append(l1);
            i = (int)l1;
            j = (int)(l1 >> 32);
            if (i == 0)
              break label218;
            if (i < 0)
            {
              if (localArrayList2.contains(Integer.valueOf(-i)))
                continue;
              localArrayList2.add(Integer.valueOf(-i));
              continue;
            }
          }
          catch (Exception localException1)
          {
            n.a("tmessages", localException1);
            return;
          }
          if (localArrayList1.contains(Integer.valueOf(i)))
            continue;
          localArrayList1.add(Integer.valueOf(i));
          continue;
          label218: if (localArrayList3.contains(Integer.valueOf(j)))
            continue;
          localArrayList3.add(Integer.valueOf(j));
        }
        ((SQLiteCursor)localObject3).b();
        Object localObject4 = new ArrayList();
        HashMap localHashMap2 = new HashMap();
        ArrayList localArrayList4 = new ArrayList();
        ArrayList localArrayList5 = new ArrayList();
        ArrayList localArrayList6 = new ArrayList();
        ArrayList localArrayList7 = new ArrayList();
        Object localObject2;
        if (localException1.length() > 0)
        {
          SQLiteCursor localSQLiteCursor = w.a(w.this).b("SELECT read_state, data, send_state, mid, date, uid, replydata FROM messages WHERE uid IN (" + localException1.toString() + ") AND out = 0 AND read_state IN(0,2) ORDER BY date DESC LIMIT 50", new Object[0]);
          while (localSQLiteCursor.a())
          {
            Object localObject1 = localSQLiteCursor.g(1);
            if (localObject1 == null)
              continue;
            g.ar localar = g.ar.a((org.vidogram.tgnet.a)localObject1, ((NativeByteBuffer)localObject1).b(false), false);
            ((NativeByteBuffer)localObject1).e();
            u.a(localar, localSQLiteCursor.b(0));
            localar.b = localSQLiteCursor.b(3);
            localar.e = localSQLiteCursor.b(4);
            localar.E = localSQLiteCursor.d(5);
            localArrayList4.add(localar);
            i = (int)localar.E;
            w.a(localar, localArrayList1, localArrayList2);
            localar.y = localSQLiteCursor.b(2);
            if (((localar.d.b == 0) && (!u.b(localar)) && (i != 0)) || (localar.b > 0))
              localar.y = 0;
            if ((i == 0) && (!localSQLiteCursor.a(5)))
              localar.C = localSQLiteCursor.d(5);
            try
            {
              if ((localar.g == 0) || ((!(localar.f instanceof g.mz)) && (!(localar.f instanceof g.mu))))
                continue;
              if (!localSQLiteCursor.a(6))
              {
                localObject1 = localSQLiteCursor.g(6);
                if (localObject1 != null)
                {
                  localar.K = g.ar.a((org.vidogram.tgnet.a)localObject1, ((NativeByteBuffer)localObject1).b(false), false);
                  ((NativeByteBuffer)localObject1).e();
                  if (localar.K != null)
                    w.a(localar.K, localArrayList1, localArrayList2);
                }
              }
              if (localar.K != null)
                continue;
              long l2 = localar.g;
              l1 = l2;
              if (localar.d.b != 0)
                l1 = l2 | localar.d.b << 32;
              if (!((ArrayList)localObject4).contains(Long.valueOf(l1)))
                ((ArrayList)localObject4).add(Long.valueOf(l1));
              localObject3 = (ArrayList)localHashMap2.get(Integer.valueOf(localar.g));
              localObject1 = localObject3;
              if (localObject3 == null)
              {
                localObject1 = new ArrayList();
                localHashMap2.put(Integer.valueOf(localar.g), localObject1);
              }
              ((ArrayList)localObject1).add(localar);
            }
            catch (Exception localException2)
            {
              n.a("tmessages", localException2);
            }
          }
          localSQLiteCursor.b();
          if (!((ArrayList)localObject4).isEmpty())
          {
            localObject2 = w.a(w.this).b(String.format(Locale.US, "SELECT data, mid, date, uid FROM messages WHERE mid IN(%s)", new Object[] { TextUtils.join(",", (Iterable)localObject4) }), new Object[0]);
            while (((SQLiteCursor)localObject2).a())
            {
              localObject4 = ((SQLiteCursor)localObject2).g(0);
              if (localObject4 == null)
                continue;
              localObject3 = g.ar.a((org.vidogram.tgnet.a)localObject4, ((NativeByteBuffer)localObject4).b(false), false);
              ((NativeByteBuffer)localObject4).e();
              ((g.ar)localObject3).b = ((SQLiteCursor)localObject2).b(1);
              ((g.ar)localObject3).e = ((SQLiteCursor)localObject2).b(2);
              ((g.ar)localObject3).E = ((SQLiteCursor)localObject2).d(3);
              w.a((g.ar)localObject3, localArrayList1, localArrayList2);
              localObject4 = (ArrayList)localHashMap2.get(Integer.valueOf(((g.ar)localObject3).b));
              if (localObject4 == null)
                continue;
              i = 0;
              while (i < ((ArrayList)localObject4).size())
              {
                ((g.ar)((ArrayList)localObject4).get(i)).K = ((g.ar)localObject3);
                i += 1;
              }
            }
            ((SQLiteCursor)localObject2).b();
          }
          if (!localArrayList3.isEmpty())
            w.this.a(TextUtils.join(",", localArrayList3), localArrayList7, localArrayList1);
          if (!localArrayList1.isEmpty())
            w.this.a(TextUtils.join(",", localArrayList1), localArrayList5);
          if (!localArrayList2.isEmpty())
          {
            w.this.b(TextUtils.join(",", localArrayList2), localArrayList6);
            i = 0;
          }
        }
        while (true)
        {
          if (i < localArrayList6.size())
          {
            localObject2 = (g.i)localArrayList6.get(i);
            if ((localObject2 == null) || ((!((g.i)localObject2).t) && (((g.i)localObject2).B == null)))
              break label1262;
            l1 = -((g.i)localObject2).h;
            w.a(w.this).a("UPDATE dialogs SET unread_count = 0, unread_count_i = 0 WHERE did = " + l1).c().e();
            w.a(w.this).a(String.format(Locale.US, "UPDATE messages SET read_state = 3 WHERE uid = %d AND mid > 0 AND read_state IN(0,2) AND out = 0", new Object[] { Long.valueOf(l1) })).c().e();
            localArrayList6.remove(i);
            localHashMap1.remove(Long.valueOf(-((g.i)localObject2).h));
            j = 0;
          }
          while (true)
            if (j < localArrayList4.size())
            {
              if (((g.ar)localArrayList4.get(j)).E == -((g.i)localObject2).h)
              {
                localArrayList4.remove(j);
                j -= 1;
                break label1265;
                Collections.reverse(localArrayList4);
                a.a(new Runnable(localHashMap1, localArrayList4, localArrayList5, localArrayList6, localArrayList7)
                {
                  public void run()
                  {
                    z.a().a(this.a, this.b, this.c, this.d, this.e);
                  }
                });
                return;
              }
              else
              {
                break label1265;
                label1262: break;
              }
              label1265: j += 1;
              continue;
            }
            else
            {
              i -= 1;
            }
          i += 1;
        }
      }
    });
  }

  public void e(int paramInt)
  {
    this.h.b(new Runnable(paramInt)
    {
      public void run()
      {
        try
        {
          if (this.a == 0)
          {
            w.a(w.this).a("DELETE FROM download_queue WHERE 1").c().e();
            return;
          }
          w.a(w.this).a(String.format(Locale.US, "DELETE FROM download_queue WHERE type = %d", new Object[] { Integer.valueOf(this.a) })).c().e();
          return;
        }
        catch (Exception localException)
        {
          n.a("tmessages", localException);
        }
      }
    });
  }

  public void f()
  {
    this.h.b(new Runnable()
    {
      public void run()
      {
        ArrayList localArrayList;
        try
        {
          SQLiteCursor localSQLiteCursor = w.a(w.this).b("SELECT data FROM wallpapers WHERE 1", new Object[0]);
          localArrayList = new ArrayList();
          while (localSQLiteCursor.a())
          {
            NativeByteBuffer localNativeByteBuffer = localSQLiteCursor.g(0);
            if (localNativeByteBuffer == null)
              continue;
            g.wa localwa = g.wa.a(localNativeByteBuffer, localNativeByteBuffer.b(false), false);
            localNativeByteBuffer.e();
            localArrayList.add(localwa);
          }
        }
        catch (Exception localException)
        {
          n.a("tmessages", localException);
          return;
        }
        localException.b();
        a.a(new Runnable(localArrayList)
        {
          public void run()
          {
            y.a().a(y.ao, new Object[] { this.a });
          }
        });
      }
    });
  }

  public void f(int paramInt)
  {
    this.h.b(new Runnable(paramInt)
    {
      public void run()
      {
        SQLiteCursor localSQLiteCursor;
        while (true)
        {
          i locali;
          g.au localau;
          try
          {
            ArrayList localArrayList = new ArrayList();
            localSQLiteCursor = w.a(w.this).b(String.format(Locale.US, "SELECT uid, type, data FROM download_queue WHERE type = %d ORDER BY date DESC LIMIT 3", new Object[] { Integer.valueOf(this.a) }), new Object[0]);
            if (!localSQLiteCursor.a())
              break;
            locali = new i();
            locali.b = localSQLiteCursor.b(1);
            locali.c = localSQLiteCursor.d(0);
            NativeByteBuffer localNativeByteBuffer = localSQLiteCursor.g(2);
            if (localNativeByteBuffer == null)
              continue;
            localau = g.au.a(localNativeByteBuffer, localNativeByteBuffer.b(false), false);
            localNativeByteBuffer.e();
            if (localau.k != null)
            {
              locali.a = localau.k;
              localArrayList.add(locali);
              continue;
            }
          }
          catch (Exception localException)
          {
            n.a("tmessages", localException);
            return;
          }
          if (localau.d == null)
            continue;
          locali.a = m.a(localau.d.h, a.f());
        }
        localSQLiteCursor.b();
        a.a(new Runnable(localException)
        {
          public void run()
          {
            MediaController.a().a(w.37.this.a, this.a);
          }
        });
      }
    });
  }

  public int g(int paramInt)
  {
    Semaphore localSemaphore = new Semaphore(0);
    Integer[] arrayOfInteger = new Integer[1];
    arrayOfInteger[0] = Integer.valueOf(0);
    a().c().b(new Runnable(paramInt, arrayOfInteger, localSemaphore)
    {
      // ERROR //
      public void run()
      {
        // Byte code:
        //   0: aconst_null
        //   1: astore_2
        //   2: aconst_null
        //   3: astore_1
        //   4: aload_0
        //   5: getfield 23	org/vidogram/messenger/w$49:d	Lorg/vidogram/messenger/w;
        //   8: invokestatic 39	org/vidogram/messenger/w:a	(Lorg/vidogram/messenger/w;)Lorg/vidogram/SQLite/SQLiteDatabase;
        //   11: new 41	java/lang/StringBuilder
        //   14: dup
        //   15: invokespecial 42	java/lang/StringBuilder:<init>	()V
        //   18: ldc 44
        //   20: invokevirtual 48	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   23: aload_0
        //   24: getfield 25	org/vidogram/messenger/w$49:a	I
        //   27: ineg
        //   28: invokevirtual 51	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
        //   31: invokevirtual 55	java/lang/StringBuilder:toString	()Ljava/lang/String;
        //   34: iconst_0
        //   35: anewarray 4	java/lang/Object
        //   38: invokevirtual 60	org/vidogram/SQLite/SQLiteDatabase:b	(Ljava/lang/String;[Ljava/lang/Object;)Lorg/vidogram/SQLite/SQLiteCursor;
        //   41: astore_3
        //   42: aload_3
        //   43: astore_1
        //   44: aload_3
        //   45: astore_2
        //   46: aload_3
        //   47: invokevirtual 65	org/vidogram/SQLite/SQLiteCursor:a	()Z
        //   50: ifeq +21 -> 71
        //   53: aload_3
        //   54: astore_1
        //   55: aload_3
        //   56: astore_2
        //   57: aload_0
        //   58: getfield 27	org/vidogram/messenger/w$49:b	[Ljava/lang/Integer;
        //   61: iconst_0
        //   62: aload_3
        //   63: iconst_0
        //   64: invokevirtual 67	org/vidogram/SQLite/SQLiteCursor:b	(I)I
        //   67: invokestatic 73	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   70: aastore
        //   71: aload_3
        //   72: ifnull +7 -> 79
        //   75: aload_3
        //   76: invokevirtual 75	org/vidogram/SQLite/SQLiteCursor:b	()V
        //   79: aload_0
        //   80: getfield 29	org/vidogram/messenger/w$49:c	Ljava/util/concurrent/Semaphore;
        //   83: ifnull +10 -> 93
        //   86: aload_0
        //   87: getfield 29	org/vidogram/messenger/w$49:c	Ljava/util/concurrent/Semaphore;
        //   90: invokevirtual 80	java/util/concurrent/Semaphore:release	()V
        //   93: return
        //   94: astore_3
        //   95: aload_1
        //   96: astore_2
        //   97: ldc 82
        //   99: aload_3
        //   100: invokestatic 87	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   103: aload_1
        //   104: ifnull -25 -> 79
        //   107: aload_1
        //   108: invokevirtual 75	org/vidogram/SQLite/SQLiteCursor:b	()V
        //   111: goto -32 -> 79
        //   114: astore_1
        //   115: aload_2
        //   116: ifnull +7 -> 123
        //   119: aload_2
        //   120: invokevirtual 75	org/vidogram/SQLite/SQLiteCursor:b	()V
        //   123: aload_1
        //   124: athrow
        //   125: astore_1
        //   126: ldc 82
        //   128: aload_1
        //   129: invokestatic 87	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   132: return
        //
        // Exception table:
        //   from	to	target	type
        //   4	42	94	java/lang/Exception
        //   46	53	94	java/lang/Exception
        //   57	71	94	java/lang/Exception
        //   4	42	114	finally
        //   46	53	114	finally
        //   57	71	114	finally
        //   97	103	114	finally
        //   79	93	125	java/lang/Exception
      }
    });
    try
    {
      localSemaphore.acquire();
      return arrayOfInteger[0].intValue();
    }
    catch (Exception localException)
    {
      while (true)
        n.a("tmessages", localException);
    }
  }

  public void g()
  {
    this.h.b(new Runnable()
    {
      public void run()
      {
        ArrayList localArrayList2;
        SQLiteCursor localSQLiteCursor;
        StringBuilder localStringBuilder;
        try
        {
          ArrayList localArrayList1 = new ArrayList();
          localArrayList2 = new ArrayList();
          localSQLiteCursor = w.a(w.this).b("SELECT * FROM blocked_users WHERE 1", new Object[0]);
          localStringBuilder = new StringBuilder();
          while (localSQLiteCursor.a())
          {
            int i = localSQLiteCursor.b(0);
            localArrayList1.add(Integer.valueOf(i));
            if (localStringBuilder.length() != 0)
              localStringBuilder.append(",");
            localStringBuilder.append(i);
          }
        }
        catch (Exception localException)
        {
          n.a("tmessages", localException);
          return;
        }
        localSQLiteCursor.b();
        if (localStringBuilder.length() != 0)
          w.this.a(localStringBuilder.toString(), localArrayList2);
        v.a().a(localException, localArrayList2, true);
      }
    });
  }

  public g.vw h(int paramInt)
  {
    try
    {
      Object localObject = new ArrayList();
      a("" + paramInt, (ArrayList)localObject);
      if (!((ArrayList)localObject).isEmpty())
      {
        localObject = (g.vw)((ArrayList)localObject).get(0);
        return localObject;
      }
    }
    catch (Exception localException)
    {
      n.a("tmessages", localException);
    }
    return (g.vw)null;
  }

  public void h()
  {
    this.h.b(new Runnable()
    {
      public void run()
      {
        HashMap localHashMap = new HashMap();
        label243: 
        while (true)
        {
          SQLiteCursor localSQLiteCursor;
          try
          {
            localSQLiteCursor = w.a(w.this).b("SELECT us.uid, us.fname, us.sname, up.phone, up.sphone, up.deleted FROM user_contacts_v6 as us LEFT JOIN user_phones_v6 as up ON us.uid = up.uid WHERE 1", new Object[0]);
            if (localSQLiteCursor.a())
            {
              int i = localSQLiteCursor.b(0);
              f.a locala = (f.a)localHashMap.get(Integer.valueOf(i));
              if (locala != null)
                break label243;
              locala = new f.a();
              locala.f = localSQLiteCursor.e(1);
              locala.g = localSQLiteCursor.e(2);
              locala.a = i;
              localHashMap.put(Integer.valueOf(i), locala);
              String str3 = localSQLiteCursor.e(3);
              if (str3 == null)
                continue;
              locala.b.add(str3);
              String str2 = localSQLiteCursor.e(4);
              if (str2 == null)
                continue;
              String str1 = str2;
              if (str2.length() != 8)
                continue;
              str1 = str2;
              if (str3.length() == 8)
                continue;
              str1 = b.b(str3);
              locala.d.add(str1);
              locala.e.add(Integer.valueOf(localSQLiteCursor.b(5)));
              locala.c.add("");
              continue;
            }
          }
          catch (Exception localException)
          {
            localHashMap.clear();
            n.a("tmessages", localException);
            f.a().a(localHashMap, true, true, false, false);
            return;
          }
          localSQLiteCursor.b();
          continue;
        }
      }
    });
  }

  public g.i i(int paramInt)
  {
    try
    {
      Object localObject = new ArrayList();
      b("" + paramInt, (ArrayList)localObject);
      if (!((ArrayList)localObject).isEmpty())
      {
        localObject = (g.i)((ArrayList)localObject).get(0);
        return localObject;
      }
    }
    catch (Exception localException)
    {
      n.a("tmessages", localException);
    }
    return (g.i)null;
  }

  public void i()
  {
    this.h.b(new Runnable()
    {
      public void run()
      {
        ArrayList localArrayList1 = new ArrayList();
        ArrayList localArrayList2 = new ArrayList();
        StringBuilder localStringBuilder;
        boolean bool;
        try
        {
          SQLiteCursor localSQLiteCursor = w.a(w.this).b("SELECT * FROM contacts WHERE 1", new Object[0]);
          localStringBuilder = new StringBuilder();
          while (true)
          {
            if (!localSQLiteCursor.a())
              break label163;
            int i = localSQLiteCursor.b(0);
            g.fw localfw = new g.fw();
            localfw.c = i;
            if (localSQLiteCursor.b(1) != 1)
              break;
            bool = true;
            localfw.d = bool;
            if (localStringBuilder.length() != 0)
              localStringBuilder.append(",");
            localArrayList1.add(localfw);
            localStringBuilder.append(localfw.c);
          }
        }
        catch (Exception localException)
        {
          localArrayList1.clear();
          localArrayList2.clear();
          n.a("tmessages", localException);
        }
        while (true)
        {
          f.a().a(localArrayList1, localArrayList2, 1);
          return;
          bool = false;
          break;
          label163: localException.b();
          if (localStringBuilder.length() == 0)
            continue;
          w.this.a(localStringBuilder.toString(), localArrayList2);
        }
      }
    });
  }

  public g.t j(int paramInt)
  {
    try
    {
      Object localObject = new ArrayList();
      a("" + paramInt, (ArrayList)localObject, null);
      if (!((ArrayList)localObject).isEmpty())
      {
        localObject = (g.t)((ArrayList)localObject).get(0);
        return localObject;
      }
    }
    catch (Exception localException)
    {
      n.a("tmessages", localException);
    }
    return (g.t)null;
  }

  private class a
  {
    public int a;
    public int b;
    public int c;

    public a(int paramInt1, int arg3)
    {
      this.a = paramInt1;
      int i;
      this.b = i;
    }

    public a(int paramInt1, int paramInt2, int arg4)
    {
      this.c = paramInt1;
      this.a = paramInt2;
      int i;
      this.b = i;
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.w
 * JD-Core Version:    0.6.0
 */