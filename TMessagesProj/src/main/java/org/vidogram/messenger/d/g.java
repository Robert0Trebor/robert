package org.vidogram.messenger.d;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import java.util.ArrayList;
import java.util.HashMap;
import org.vidogram.SQLite.SQLiteCursor;
import org.vidogram.SQLite.SQLiteDatabase;
import org.vidogram.SQLite.SQLitePreparedStatement;
import org.vidogram.messenger.ApplicationLoader;
import org.vidogram.messenger.Utilities;
import org.vidogram.messenger.a;
import org.vidogram.messenger.h;
import org.vidogram.messenger.n;
import org.vidogram.messenger.v;
import org.vidogram.messenger.w;
import org.vidogram.messenger.y;
import org.vidogram.tgnet.ConnectionsManager;
import org.vidogram.tgnet.NativeByteBuffer;
import org.vidogram.tgnet.c;
import org.vidogram.tgnet.f;
import org.vidogram.tgnet.g.be;
import org.vidogram.tgnet.g.bf;
import org.vidogram.tgnet.g.if;
import org.vidogram.tgnet.g.jn;
import org.vidogram.tgnet.g.lr;
import org.vidogram.tgnet.g.pm;
import org.vidogram.tgnet.g.ps;
import org.vidogram.tgnet.g.pw;
import org.vidogram.tgnet.g.q;
import org.vidogram.tgnet.g.qb;
import org.vidogram.tgnet.g.qc;
import org.vidogram.tgnet.g.qh;
import org.vidogram.tgnet.g.ql;
import org.vidogram.tgnet.g.qr;
import org.vidogram.tgnet.g.rg;
import org.vidogram.tgnet.g.ri;
import org.vidogram.tgnet.g.sz;

public class g
{
  private static ArrayList<g.rg>[] a = { new ArrayList(), new ArrayList() };
  private static HashMap<Long, g.rg> b = new HashMap();
  private static HashMap<String, g.rg> c = new HashMap();
  private static boolean[] d = new boolean[2];
  private static boolean[] e = new boolean[2];
  private static int[] f = new int[2];
  private static int[] g = new int[2];
  private static HashMap<Long, String> h = new HashMap();
  private static HashMap<String, ArrayList<g.q>> i = new HashMap();
  private static ArrayList<g.q>[] j = { new ArrayList(), new ArrayList() };
  private static boolean[] k = new boolean[2];
  private static boolean[] l = new boolean[2];
  private static ArrayList<g.q> m = new ArrayList();
  private static boolean n;
  private static boolean o;
  private static int p;
  private static int q;
  private static ArrayList<g.bf> r = new ArrayList();
  private static HashMap<Long, g.bf> s = new HashMap();
  private static ArrayList<Long> t = new ArrayList();
  private static ArrayList<Long> u = new ArrayList();
  private static boolean v;
  private static boolean w;

  public static g.rg a(Long paramLong)
  {
    return (g.rg)b.get(paramLong);
  }

  public static g.rg a(String paramString)
  {
    return (g.rg)c.get(paramString);
  }

  public static void a()
  {
    int i1 = 0;
    while (i1 < 2)
    {
      f[i1] = 0;
      g[i1] = 0;
      a[i1].clear();
      j[i1].clear();
      d[i1] = false;
      e[i1] = false;
      k[i1] = false;
      l[i1] = false;
      i1 += 1;
    }
    q = 0;
    p = 0;
    i.clear();
    h.clear();
    s.clear();
    r.clear();
    t.clear();
    m.clear();
    b.clear();
    c.clear();
    v = false;
    w = false;
    n = false;
    o = false;
  }

  public static void a(int paramInt)
  {
    if ((d[paramInt] == 0) && ((e[paramInt] == 0) || (Math.abs(System.currentTimeMillis() / 1000L - g[paramInt]) >= 3600L)))
      b(paramInt, true, false);
  }

  private static void a(int paramInt1, ArrayList<g.q> paramArrayList, boolean paramBoolean, int paramInt2)
  {
    if (paramArrayList != null)
      w.a().c().b(new Runnable(paramBoolean, paramArrayList, paramInt1, paramInt2)
      {
        public void run()
        {
          while (true)
          {
            int i;
            int m;
            int k;
            try
            {
              SQLiteDatabase localSQLiteDatabase = w.a().b();
              if (!this.a)
                continue;
              i = v.a().K;
              localSQLiteDatabase.d();
              SQLitePreparedStatement localSQLitePreparedStatement = localSQLiteDatabase.a("REPLACE INTO web_recent_v3 VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
              m = this.b.size();
              k = 0;
              break label360;
              localSQLitePreparedStatement.e();
              localSQLiteDatabase.e();
              if (this.b.size() < i)
                continue;
              localSQLiteDatabase.d();
              if (i >= this.b.size())
                continue;
              localSQLiteDatabase.a("DELETE FROM web_recent_v3 WHERE id = '" + ((g.q)this.b.get(i)).b + "'").c().e();
              i += 1;
              continue;
              i = v.a().J;
              continue;
              label152: g.q localq = (g.q)this.b.get(k);
              localSQLitePreparedStatement.d();
              localSQLitePreparedStatement.a(1, "" + localq.b);
              if (!this.a)
                continue;
              j = 2;
              localSQLitePreparedStatement.a(2, j);
              localSQLitePreparedStatement.a(3, "");
              localSQLitePreparedStatement.a(4, "");
              localSQLitePreparedStatement.a(5, "");
              localSQLitePreparedStatement.a(6, 0);
              localSQLitePreparedStatement.a(7, 0);
              localSQLitePreparedStatement.a(8, 0);
              if (this.d == 0)
                break label386;
              j = this.d;
              localSQLitePreparedStatement.a(9, j);
              NativeByteBuffer localNativeByteBuffer = new NativeByteBuffer(localq.b());
              localq.a(localNativeByteBuffer);
              localSQLitePreparedStatement.a(10, localNativeByteBuffer);
              localSQLitePreparedStatement.b();
              if (localNativeByteBuffer != null)
              {
                localNativeByteBuffer.e();
                break label374;
                if (this.c != 0)
                  break label381;
                j = 3;
                continue;
                localSQLiteDatabase.e();
                return;
              }
            }
            catch (Exception localException)
            {
              n.a("tmessages", localException);
              return;
            }
            label360: 
            while (k < m)
            {
              if (k != i)
                break label152;
              break;
              label374: k += 1;
            }
            label381: int j = 4;
            continue;
            label386: j = m - k;
          }
        }
      });
    if (paramInt2 == 0)
      a.a(new Runnable(paramBoolean, paramInt1, paramArrayList)
      {
        public void run()
        {
          SharedPreferences.Editor localEditor = ApplicationLoader.a.getSharedPreferences("emoji", 0).edit();
          if (this.a)
          {
            g.b(false);
            g.c(true);
            localEditor.putLong("lastGifLoadTime", System.currentTimeMillis()).commit();
            if (this.c != null)
            {
              if (!this.a)
                break label143;
              g.a(this.c);
            }
          }
          while (true)
          {
            y.a().a(y.ah, new Object[] { Boolean.valueOf(this.a), Integer.valueOf(this.b) });
            return;
            g.h()[this.b] = 0;
            g.i()[this.b] = 1;
            localEditor.putLong("lastStickersLoadTime", System.currentTimeMillis()).commit();
            break;
            label143: g.g()[this.b] = this.c;
          }
        }
      });
  }

  public static void a(int paramInt1, g.q paramq, int paramInt2)
  {
    int i1 = 0;
    int i2 = 0;
    while (i1 < j[paramInt1].size())
    {
      localObject = (g.q)j[paramInt1].get(i1);
      if (((g.q)localObject).b == paramq.b)
      {
        j[paramInt1].remove(i1);
        j[paramInt1].add(0, localObject);
        i2 = 1;
      }
      i1 += 1;
    }
    if (i2 == 0)
      j[paramInt1].add(0, paramq);
    if (j[paramInt1].size() > v.a().J)
    {
      localObject = (g.q)j[paramInt1].remove(j[paramInt1].size() - 1);
      w.a().c().b(new Runnable((g.q)localObject)
      {
        public void run()
        {
          try
          {
            w.a().b().a("DELETE FROM web_recent_v3 WHERE id = '" + this.a.b + "'").c().e();
            return;
          }
          catch (Exception localException)
          {
            n.a("tmessages", localException);
          }
        }
      });
    }
    Object localObject = new ArrayList();
    ((ArrayList)localObject).add(paramq);
    a(paramInt1, (ArrayList)localObject, false, paramInt2);
  }

  public static void a(int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (paramBoolean1)
      if (!n);
    while (true)
    {
      return;
      n = true;
      if (o)
        paramBoolean2 = false;
      while (true)
      {
        if (!paramBoolean2)
          break label73;
        w.a().c().b(new Runnable(paramBoolean1, paramInt)
        {
          public void run()
          {
            while (true)
            {
              Object localObject2;
              try
              {
                Object localObject1 = w.a().b();
                localObject2 = new StringBuilder().append("SELECT document FROM web_recent_v3 WHERE type = ");
                if (this.a)
                {
                  i = 2;
                  localObject1 = ((SQLiteDatabase)localObject1).b(i + " ORDER BY date DESC", new Object[0]);
                  localObject2 = new ArrayList();
                  if (!((SQLiteCursor)localObject1).a())
                    break label140;
                  if (((SQLiteCursor)localObject1).a(0))
                    continue;
                  NativeByteBuffer localNativeByteBuffer = ((SQLiteCursor)localObject1).g(0);
                  if (localNativeByteBuffer == null)
                    continue;
                  g.q localq = g.q.a(localNativeByteBuffer, localNativeByteBuffer.b(false), false);
                  if (localq == null)
                    continue;
                  ((ArrayList)localObject2).add(localq);
                  localNativeByteBuffer.e();
                  continue;
                }
              }
              catch (Throwable localThrowable)
              {
                n.a("tmessages", localThrowable);
                return;
              }
              if (this.b == 0)
              {
                i = 3;
                continue;
                label140: localThrowable.b();
                a.a(new Runnable((ArrayList)localObject2)
                {
                  public void run()
                  {
                    if (g.20.this.a)
                    {
                      g.a(this.a);
                      g.b(false);
                      g.c(true);
                    }
                    while (true)
                    {
                      y.a().a(y.ah, new Object[] { Boolean.valueOf(g.20.this.a), Integer.valueOf(g.20.this.b) });
                      g.a(g.20.this.b, g.20.this.a, false);
                      return;
                      g.g()[g.20.this.b] = this.a;
                      g.h()[g.20.this.b] = 0;
                      g.i()[g.20.this.b] = 1;
                    }
                  }
                });
                return;
              }
              int i = 4;
            }
          }
        });
        return;
        if (k[paramInt] != 0)
          break;
        k[paramInt] = true;
        if (l[paramInt] == 0)
          continue;
        paramBoolean2 = false;
      }
      label73: localObject = ApplicationLoader.a.getSharedPreferences("emoji", 0);
      long l1;
      if (paramBoolean1)
        l1 = ((SharedPreferences)localObject).getLong("lastGifLoadTime", 0L);
      while (Math.abs(System.currentTimeMillis() - l1) >= 3600000L)
      {
        if (!paramBoolean1)
          break label174;
        localObject = new g.qc();
        ((g.qc)localObject).c = f(m);
        ConnectionsManager.a().a((f)localObject, new c(paramInt, paramBoolean1)
        {
        });
        return;
        l1 = ((SharedPreferences)localObject).getLong("lastStickersLoadTime", 0L);
      }
    }
    label174: Object localObject = new g.qb();
    ((g.qb)localObject).e = f(j[paramInt]);
    if (paramInt == 1);
    for (paramBoolean2 = true; ; paramBoolean2 = false)
    {
      ((g.qb)localObject).d = paramBoolean2;
      ConnectionsManager.a().a((f)localObject, new c(paramInt, paramBoolean1)
      {
      });
      return;
    }
  }

  public static void a(Context paramContext, g.be parambe, int paramInt, org.vidogram.ui.a.g paramg, boolean paramBoolean)
  {
    boolean bool2 = true;
    int i1;
    g.lr locallr;
    label52: int i2;
    if (parambe.j)
    {
      i1 = 1;
      locallr = new g.lr();
      locallr.c = parambe.c;
      locallr.b = parambe.b;
      if (paramInt == 0)
        break label304;
      if (paramInt != 1)
        break label249;
      bool1 = true;
      parambe.h = bool1;
      i2 = 0;
      label61: if (i2 < a[i1].size())
      {
        paramContext = (g.rg)a[i1].get(i2);
        if (paramContext.c.b != parambe.b)
          break label289;
        a[i1].remove(i2);
        if (paramInt != 2)
          break label255;
        a[i1].add(0, paramContext);
      }
      label133: f[i1] = h(a[i1]);
      b(i1, a[i1], g[i1], f[i1]);
      y.a().a(y.P, new Object[] { Integer.valueOf(i1) });
      paramContext = new g.qh();
      paramContext.c = locallr;
      if (paramInt != 1)
        break label298;
    }
    label289: label298: for (boolean bool1 = bool2; ; bool1 = false)
    {
      paramContext.d = bool1;
      ConnectionsManager.a().a(paramContext, new c(i1, paramInt, paramg, paramBoolean)
      {
      });
      return;
      i1 = 0;
      break;
      label249: bool1 = false;
      break label52;
      label255: b.remove(Long.valueOf(paramContext.c.b));
      c.remove(paramContext.c.e);
      break label133;
      i2 += 1;
      break label61;
    }
    label304: paramg = new g.ri();
    paramg.c = locallr;
    ConnectionsManager.a().a(paramg, new c(parambe, paramContext, i1)
    {
    });
  }

  public static void a(g.q paramq)
  {
    m.remove(paramq);
    g.qr localqr = new g.qr();
    localqr.c = new g.jn();
    localqr.c.b = paramq.b;
    localqr.c.c = paramq.c;
    localqr.d = true;
    ConnectionsManager.a().a(localqr, new c()
    {
    });
    w.a().c().b(new Runnable(paramq)
    {
      public void run()
      {
        try
        {
          w.a().b().a("DELETE FROM web_recent_v3 WHERE id = '" + this.a.b + "'").c().e();
          return;
        }
        catch (Exception localException)
        {
          n.a("tmessages", localException);
        }
      }
    });
  }

  public static void a(g.q paramq, int paramInt)
  {
    int i1 = 0;
    int i2 = 0;
    while (i1 < m.size())
    {
      localObject = (g.q)m.get(i1);
      if (((g.q)localObject).b == paramq.b)
      {
        m.remove(i1);
        m.add(0, localObject);
        i2 = 1;
      }
      i1 += 1;
    }
    if (i2 == 0)
      m.add(0, paramq);
    if (m.size() > v.a().K)
    {
      localObject = (g.q)m.remove(m.size() - 1);
      w.a().c().b(new Runnable((g.q)localObject)
      {
        public void run()
        {
          try
          {
            w.a().b().a("DELETE FROM web_recent_v3 WHERE id = '" + this.a.b + "'").c().e();
            return;
          }
          catch (Exception localException)
          {
            n.a("tmessages", localException);
          }
        }
      });
    }
    Object localObject = new ArrayList();
    ((ArrayList)localObject).add(paramq);
    a(0, (ArrayList)localObject, true, paramInt);
  }

  public static void a(boolean paramBoolean)
  {
    if (t.isEmpty());
    do
    {
      return;
      t.clear();
      p = g(r);
      y.a().a(y.Q, new Object[0]);
      b(r, t, q, p);
    }
    while (!paramBoolean);
    g.ql localql = new g.ql();
    ConnectionsManager.a().a(localql, new c()
    {
    });
  }

  public static void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (v)
      return;
    v = true;
    if (paramBoolean1)
    {
      w.a().c().b(new Runnable()
      {
        // ERROR //
        public void run()
        {
          // Byte code:
          //   0: aconst_null
          //   1: astore 8
          //   3: aconst_null
          //   4: astore 6
          //   6: iconst_0
          //   7: istore_2
          //   8: iconst_0
          //   9: istore_1
          //   10: new 21	java/util/ArrayList
          //   13: dup
          //   14: invokespecial 22	java/util/ArrayList:<init>	()V
          //   17: astore 9
          //   19: invokestatic 27	org/vidogram/messenger/w:a	()Lorg/vidogram/messenger/w;
          //   22: invokevirtual 31	org/vidogram/messenger/w:b	()Lorg/vidogram/SQLite/SQLiteDatabase;
          //   25: ldc 33
          //   27: iconst_0
          //   28: anewarray 4	java/lang/Object
          //   31: invokevirtual 38	org/vidogram/SQLite/SQLiteDatabase:b	(Ljava/lang/String;[Ljava/lang/Object;)Lorg/vidogram/SQLite/SQLiteCursor;
          //   34: astore 5
          //   36: aload 5
          //   38: invokevirtual 43	org/vidogram/SQLite/SQLiteCursor:a	()Z
          //   41: ifeq +326 -> 367
          //   44: aload 5
          //   46: iconst_0
          //   47: invokevirtual 47	org/vidogram/SQLite/SQLiteCursor:g	(I)Lorg/vidogram/tgnet/NativeByteBuffer;
          //   50: astore 10
          //   52: aload 10
          //   54: ifnull +307 -> 361
          //   57: new 21	java/util/ArrayList
          //   60: dup
          //   61: invokespecial 22	java/util/ArrayList:<init>	()V
          //   64: astore 6
          //   66: aload 6
          //   68: astore 7
          //   70: aload 10
          //   72: iconst_0
          //   73: invokevirtual 52	org/vidogram/tgnet/NativeByteBuffer:b	(Z)I
          //   76: istore_3
          //   77: iconst_0
          //   78: istore_1
          //   79: iload_1
          //   80: iload_3
          //   81: if_icmpge +32 -> 113
          //   84: aload 6
          //   86: astore 7
          //   88: aload 6
          //   90: aload 10
          //   92: aload 10
          //   94: iconst_0
          //   95: invokevirtual 52	org/vidogram/tgnet/NativeByteBuffer:b	(Z)I
          //   98: iconst_0
          //   99: invokestatic 57	org/vidogram/tgnet/g$bf:a	(Lorg/vidogram/tgnet/a;IZ)Lorg/vidogram/tgnet/g$bf;
          //   102: invokevirtual 61	java/util/ArrayList:add	(Ljava/lang/Object;)Z
          //   105: pop
          //   106: iload_1
          //   107: iconst_1
          //   108: iadd
          //   109: istore_1
          //   110: goto -31 -> 79
          //   113: aload 6
          //   115: astore 7
          //   117: aload 10
          //   119: invokevirtual 64	org/vidogram/tgnet/NativeByteBuffer:e	()V
          //   122: aload 6
          //   124: astore 7
          //   126: aload 5
          //   128: iconst_1
          //   129: invokevirtual 47	org/vidogram/SQLite/SQLiteCursor:g	(I)Lorg/vidogram/tgnet/NativeByteBuffer;
          //   132: astore 8
          //   134: aload 8
          //   136: ifnull +56 -> 192
          //   139: aload 6
          //   141: astore 7
          //   143: aload 8
          //   145: iconst_0
          //   146: invokevirtual 52	org/vidogram/tgnet/NativeByteBuffer:b	(Z)I
          //   149: istore_3
          //   150: iconst_0
          //   151: istore_1
          //   152: iload_1
          //   153: iload_3
          //   154: if_icmpge +29 -> 183
          //   157: aload 6
          //   159: astore 7
          //   161: aload 9
          //   163: aload 8
          //   165: iconst_0
          //   166: invokevirtual 68	org/vidogram/tgnet/NativeByteBuffer:d	(Z)J
          //   169: invokestatic 74	java/lang/Long:valueOf	(J)Ljava/lang/Long;
          //   172: invokevirtual 61	java/util/ArrayList:add	(Ljava/lang/Object;)Z
          //   175: pop
          //   176: iload_1
          //   177: iconst_1
          //   178: iadd
          //   179: istore_1
          //   180: goto -28 -> 152
          //   183: aload 6
          //   185: astore 7
          //   187: aload 8
          //   189: invokevirtual 64	org/vidogram/tgnet/NativeByteBuffer:e	()V
          //   192: aload 6
          //   194: astore 7
          //   196: aload 5
          //   198: iconst_2
          //   199: invokevirtual 77	org/vidogram/SQLite/SQLiteCursor:b	(I)I
          //   202: istore_1
          //   203: aload 6
          //   205: invokestatic 80	org/vidogram/messenger/d/g:b	(Ljava/util/ArrayList;)I
          //   208: istore_3
          //   209: iload_1
          //   210: istore_2
          //   211: iload_3
          //   212: istore_1
          //   213: iload_1
          //   214: istore_3
          //   215: iload_2
          //   216: istore 4
          //   218: aload 6
          //   220: astore 7
          //   222: aload 5
          //   224: ifnull +17 -> 241
          //   227: aload 5
          //   229: invokevirtual 82	org/vidogram/SQLite/SQLiteCursor:b	()V
          //   232: aload 6
          //   234: astore 7
          //   236: iload_2
          //   237: istore 4
          //   239: iload_1
          //   240: istore_3
          //   241: aload 7
          //   243: aload 9
          //   245: iconst_1
          //   246: iload 4
          //   248: iload_3
          //   249: invokestatic 85	org/vidogram/messenger/d/g:a	(Ljava/util/ArrayList;Ljava/util/ArrayList;ZII)V
          //   252: return
          //   253: astore 7
          //   255: aconst_null
          //   256: astore 5
          //   258: iconst_0
          //   259: istore_1
          //   260: aload 8
          //   262: astore 6
          //   264: ldc 87
          //   266: aload 7
          //   268: invokestatic 92	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
          //   271: iload_2
          //   272: istore_3
          //   273: iload_1
          //   274: istore 4
          //   276: aload 6
          //   278: astore 7
          //   280: aload 5
          //   282: ifnull -41 -> 241
          //   285: aload 5
          //   287: invokevirtual 82	org/vidogram/SQLite/SQLiteCursor:b	()V
          //   290: iload_2
          //   291: istore_3
          //   292: iload_1
          //   293: istore 4
          //   295: aload 6
          //   297: astore 7
          //   299: goto -58 -> 241
          //   302: astore 6
          //   304: aconst_null
          //   305: astore 5
          //   307: aload 5
          //   309: ifnull +8 -> 317
          //   312: aload 5
          //   314: invokevirtual 82	org/vidogram/SQLite/SQLiteCursor:b	()V
          //   317: aload 6
          //   319: athrow
          //   320: astore 6
          //   322: goto -15 -> 307
          //   325: astore 6
          //   327: goto -20 -> 307
          //   330: astore 7
          //   332: iconst_0
          //   333: istore_1
          //   334: aload 8
          //   336: astore 6
          //   338: goto -74 -> 264
          //   341: astore 8
          //   343: aload 7
          //   345: astore 6
          //   347: aload 8
          //   349: astore 7
          //   351: iconst_0
          //   352: istore_1
          //   353: goto -89 -> 264
          //   356: astore 7
          //   358: goto -94 -> 264
          //   361: aconst_null
          //   362: astore 6
          //   364: goto -242 -> 122
          //   367: iconst_0
          //   368: istore_2
          //   369: goto -156 -> 213
          //
          // Exception table:
          //   from	to	target	type
          //   19	36	253	java/lang/Throwable
          //   19	36	302	finally
          //   36	52	320	finally
          //   57	66	320	finally
          //   70	77	320	finally
          //   88	106	320	finally
          //   117	122	320	finally
          //   126	134	320	finally
          //   143	150	320	finally
          //   161	176	320	finally
          //   187	192	320	finally
          //   196	203	320	finally
          //   203	209	320	finally
          //   264	271	325	finally
          //   36	52	330	java/lang/Throwable
          //   57	66	330	java/lang/Throwable
          //   70	77	341	java/lang/Throwable
          //   88	106	341	java/lang/Throwable
          //   117	122	341	java/lang/Throwable
          //   126	134	341	java/lang/Throwable
          //   143	150	341	java/lang/Throwable
          //   161	176	341	java/lang/Throwable
          //   187	192	341	java/lang/Throwable
          //   196	203	341	java/lang/Throwable
          //   203	209	356	java/lang/Throwable
        }
      });
      return;
    }
    g.ps localps = new g.ps();
    if (paramBoolean2);
    for (int i1 = 0; ; i1 = p)
    {
      localps.c = i1;
      ConnectionsManager.a().a(localps, new c(localps)
      {
      });
      return;
    }
  }

  public static boolean a(long paramLong)
  {
    return b.containsKey(Long.valueOf(paramLong));
  }

  public static String b(long paramLong)
  {
    String str = (String)h.get(Long.valueOf(paramLong));
    if (str != null)
      return str;
    return "";
  }

  public static ArrayList<g.q> b(int paramInt)
  {
    return new ArrayList(j[paramInt]);
  }

  public static void b()
  {
    if ((!v) && ((!w) || (Math.abs(System.currentTimeMillis() / 1000L - q) >= 3600L)))
      a(true, false);
  }

  private static void b(int paramInt1, ArrayList<g.rg> paramArrayList, int paramInt2, int paramInt3)
  {
    if (paramArrayList != null);
    for (paramArrayList = new ArrayList(paramArrayList); ; paramArrayList = null)
    {
      w.a().c().b(new Runnable(paramArrayList, paramInt1, paramInt2, paramInt3)
      {
        public void run()
        {
          int k = 0;
          while (true)
          {
            try
            {
              if (this.a == null)
                continue;
              SQLitePreparedStatement localSQLitePreparedStatement = w.a().b().a("REPLACE INTO stickers_v2 VALUES(?, ?, ?, ?)");
              localSQLitePreparedStatement.d();
              i = 0;
              int j = 4;
              if (i >= this.a.size())
                continue;
              j += ((g.rg)this.a.get(i)).b();
              i += 1;
              continue;
              NativeByteBuffer localNativeByteBuffer = new NativeByteBuffer(j);
              localNativeByteBuffer.a(this.a.size());
              i = k;
              if (i >= this.a.size())
                continue;
              ((g.rg)this.a.get(i)).a(localNativeByteBuffer);
              i += 1;
              continue;
              if (this.b == 0)
              {
                i = 1;
                localSQLitePreparedStatement.a(1, i);
                localSQLitePreparedStatement.a(2, localNativeByteBuffer);
                localSQLitePreparedStatement.a(3, this.c);
                localSQLitePreparedStatement.a(4, this.d);
                localSQLitePreparedStatement.b();
                localNativeByteBuffer.e();
                localSQLitePreparedStatement.e();
                return;
                localSQLitePreparedStatement = w.a().b().a("UPDATE stickers_v2 SET date = ?");
                localSQLitePreparedStatement.d();
                localSQLitePreparedStatement.a(1, this.c);
                localSQLitePreparedStatement.b();
                localSQLitePreparedStatement.e();
                return;
              }
            }
            catch (Exception localException)
            {
              n.a("tmessages", localException);
              return;
            }
            int i = 2;
          }
        }
      });
      return;
    }
  }

  private static void b(int paramInt1, ArrayList<g.rg> paramArrayList, boolean paramBoolean, int paramInt2, int paramInt3)
  {
    a.a(new Runnable(paramInt1)
    {
      public void run()
      {
        g.p()[this.a] = 0;
        g.q()[this.a] = 1;
      }
    });
    Utilities.c.b(new Runnable(paramBoolean, paramArrayList, paramInt2, paramInt3, paramInt1)
    {
      public void run()
      {
        long l = 1000L;
        Object localObject1;
        if (((this.a) && ((this.b == null) || (Math.abs(System.currentTimeMillis() / 1000L - this.c) >= 3600L))) || ((!this.a) && (this.b == null) && (this.d == 0)))
        {
          localObject1 = new Runnable()
          {
            public void run()
            {
              if ((g.15.this.b != null) && (g.15.this.d != 0))
                g.r()[g.15.this.e] = g.15.this.d;
              g.b(g.15.this.e, false, false);
            }
          };
          if ((this.b == null) && (!this.a));
          while (true)
          {
            a.a((Runnable)localObject1, l);
            if (this.b != null)
              break;
            return;
            l = 0L;
          }
        }
        ArrayList localArrayList2;
        HashMap localHashMap1;
        HashMap localHashMap2;
        HashMap localHashMap3;
        HashMap localHashMap4;
        HashMap localHashMap5;
        int i;
        label171: int j;
        label248: g.sz localsz;
        label332: ArrayList localArrayList1;
        if (this.b != null)
        {
          g.rg localrg;
          try
          {
            localArrayList2 = new ArrayList();
            localHashMap1 = new HashMap();
            localHashMap2 = new HashMap();
            localHashMap3 = new HashMap();
            localHashMap4 = new HashMap();
            localHashMap5 = new HashMap();
            i = 0;
            if (i >= this.b.size())
              break label513;
            localrg = (g.rg)this.b.get(i);
            if (localrg == null)
              break label594;
            localArrayList2.add(localrg);
            localHashMap1.put(Long.valueOf(localrg.c.b), localrg);
            localHashMap2.put(localrg.c.e, localrg);
            j = 0;
            if (j < localrg.e.size())
            {
              localObject1 = (g.q)localrg.e.get(j);
              if ((localObject1 == null) || ((localObject1 instanceof g.if)))
                break label601;
              localHashMap4.put(Long.valueOf(((g.q)localObject1).b), localObject1);
            }
          }
          catch (Throwable localThrowable)
          {
            n.a("tmessages", localThrowable);
            return;
          }
          if (localrg.c.h)
            break label594;
          j = 0;
          if (j >= localrg.d.size())
            break label594;
          localsz = (g.sz)localrg.d.get(j);
          if ((localsz == null) || (localsz.c == null))
            break label608;
          localsz.c = localsz.c.replace("️", "");
          localArrayList1 = (ArrayList)localHashMap5.get(localsz.c);
          if (localArrayList1 != null)
            break label591;
          localArrayList1 = new ArrayList();
          localHashMap5.put(localsz.c, localArrayList1);
          break label615;
        }
        while (true)
        {
          if (k < localsz.d.size())
          {
            Object localObject2 = (Long)localsz.d.get(k);
            if (!localHashMap3.containsKey(localObject2))
              localHashMap3.put(localObject2, localsz.c);
            localObject2 = (g.q)localHashMap4.get(localObject2);
            if (localObject2 == null)
              break label620;
            localArrayList1.add(localObject2);
            break label620;
            label513: if (!this.a)
              g.a(this.e, localArrayList2, this.c, this.d);
            a.a(new Runnable(localHashMap1, localHashMap2, localArrayList2, localHashMap5, localHashMap3)
            {
              public void run()
              {
                int i = 0;
                while (i < g.s()[g.15.this.e].size())
                {
                  g.be localbe = ((g.rg)g.s()[g.15.this.e].get(i)).c;
                  g.o().remove(Long.valueOf(localbe.b));
                  g.t().remove(localbe.e);
                  i += 1;
                }
                g.o().putAll(this.a);
                g.t().putAll(this.b);
                g.s()[g.15.this.e] = this.c;
                g.r()[g.15.this.e] = g.15.this.d;
                g.u()[g.15.this.e] = g.15.this.c;
                if (g.15.this.e == 0)
                {
                  g.b(this.d);
                  g.c(this.e);
                }
                y.a().a(y.P, new Object[] { Integer.valueOf(g.15.this.e) });
              }
            });
            return;
            if (this.a)
              break;
            a.a(new Runnable()
            {
              public void run()
              {
                g.u()[g.15.this.e] = g.15.this.c;
              }
            });
            g.a(this.e, null, this.c, 0);
            return;
            label591: break label615;
            label594: i += 1;
            break label171;
            label601: j += 1;
            break label248;
          }
          else
          {
            label608: j += 1;
            break label332;
          }
          label615: int k = 0;
          continue;
          label620: k += 1;
        }
      }
    });
  }

  public static void b(int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    int i2 = 0;
    int i1 = 0;
    if (d[paramInt] != 0)
      return;
    d[paramInt] = true;
    if (paramBoolean1)
    {
      w.a().c().b(new Runnable(paramInt)
      {
        // ERROR //
        public void run()
        {
          // Byte code:
          //   0: aconst_null
          //   1: astore 8
          //   3: aconst_null
          //   4: astore 6
          //   6: iconst_0
          //   7: istore_2
          //   8: iconst_0
          //   9: istore_1
          //   10: invokestatic 29	org/vidogram/messenger/w:a	()Lorg/vidogram/messenger/w;
          //   13: invokevirtual 32	org/vidogram/messenger/w:b	()Lorg/vidogram/SQLite/SQLiteDatabase;
          //   16: new 34	java/lang/StringBuilder
          //   19: dup
          //   20: invokespecial 35	java/lang/StringBuilder:<init>	()V
          //   23: ldc 37
          //   25: invokevirtual 41	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
          //   28: aload_0
          //   29: getfield 17	org/vidogram/messenger/d/g$10:a	I
          //   32: iconst_1
          //   33: iadd
          //   34: invokevirtual 44	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
          //   37: invokevirtual 48	java/lang/StringBuilder:toString	()Ljava/lang/String;
          //   40: iconst_0
          //   41: anewarray 4	java/lang/Object
          //   44: invokevirtual 53	org/vidogram/SQLite/SQLiteDatabase:b	(Ljava/lang/String;[Ljava/lang/Object;)Lorg/vidogram/SQLite/SQLiteCursor;
          //   47: astore 5
          //   49: aload 5
          //   51: invokevirtual 58	org/vidogram/SQLite/SQLiteCursor:a	()Z
          //   54: ifeq +258 -> 312
          //   57: aload 5
          //   59: iconst_0
          //   60: invokevirtual 62	org/vidogram/SQLite/SQLiteCursor:g	(I)Lorg/vidogram/tgnet/NativeByteBuffer;
          //   63: astore 9
          //   65: aload 9
          //   67: ifnull +239 -> 306
          //   70: new 64	java/util/ArrayList
          //   73: dup
          //   74: invokespecial 65	java/util/ArrayList:<init>	()V
          //   77: astore 6
          //   79: aload 6
          //   81: astore 7
          //   83: aload 9
          //   85: iconst_0
          //   86: invokevirtual 70	org/vidogram/tgnet/NativeByteBuffer:b	(Z)I
          //   89: istore_3
          //   90: iconst_0
          //   91: istore_1
          //   92: iload_1
          //   93: iload_3
          //   94: if_icmpge +32 -> 126
          //   97: aload 6
          //   99: astore 7
          //   101: aload 6
          //   103: aload 9
          //   105: aload 9
          //   107: iconst_0
          //   108: invokevirtual 70	org/vidogram/tgnet/NativeByteBuffer:b	(Z)I
          //   111: iconst_0
          //   112: invokestatic 75	org/vidogram/tgnet/g$rg:a	(Lorg/vidogram/tgnet/a;IZ)Lorg/vidogram/tgnet/g$rg;
          //   115: invokevirtual 79	java/util/ArrayList:add	(Ljava/lang/Object;)Z
          //   118: pop
          //   119: iload_1
          //   120: iconst_1
          //   121: iadd
          //   122: istore_1
          //   123: goto -31 -> 92
          //   126: aload 6
          //   128: astore 7
          //   130: aload 9
          //   132: invokevirtual 82	org/vidogram/tgnet/NativeByteBuffer:e	()V
          //   135: aload 6
          //   137: astore 7
          //   139: aload 5
          //   141: iconst_1
          //   142: invokevirtual 85	org/vidogram/SQLite/SQLiteCursor:b	(I)I
          //   145: istore_1
          //   146: aload 6
          //   148: invokestatic 88	org/vidogram/messenger/d/g:e	(Ljava/util/ArrayList;)I
          //   151: istore_3
          //   152: iload_1
          //   153: istore_2
          //   154: iload_3
          //   155: istore_1
          //   156: iload_1
          //   157: istore_3
          //   158: iload_2
          //   159: istore 4
          //   161: aload 6
          //   163: astore 7
          //   165: aload 5
          //   167: ifnull +17 -> 184
          //   170: aload 5
          //   172: invokevirtual 90	org/vidogram/SQLite/SQLiteCursor:b	()V
          //   175: aload 6
          //   177: astore 7
          //   179: iload_2
          //   180: istore 4
          //   182: iload_1
          //   183: istore_3
          //   184: aload_0
          //   185: getfield 17	org/vidogram/messenger/d/g$10:a	I
          //   188: aload 7
          //   190: iconst_1
          //   191: iload 4
          //   193: iload_3
          //   194: invokestatic 93	org/vidogram/messenger/d/g:a	(ILjava/util/ArrayList;ZII)V
          //   197: return
          //   198: astore 7
          //   200: aconst_null
          //   201: astore 5
          //   203: iconst_0
          //   204: istore_1
          //   205: aload 8
          //   207: astore 6
          //   209: ldc 95
          //   211: aload 7
          //   213: invokestatic 100	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
          //   216: iload_2
          //   217: istore_3
          //   218: iload_1
          //   219: istore 4
          //   221: aload 6
          //   223: astore 7
          //   225: aload 5
          //   227: ifnull -43 -> 184
          //   230: aload 5
          //   232: invokevirtual 90	org/vidogram/SQLite/SQLiteCursor:b	()V
          //   235: iload_2
          //   236: istore_3
          //   237: iload_1
          //   238: istore 4
          //   240: aload 6
          //   242: astore 7
          //   244: goto -60 -> 184
          //   247: astore 6
          //   249: aconst_null
          //   250: astore 5
          //   252: aload 5
          //   254: ifnull +8 -> 262
          //   257: aload 5
          //   259: invokevirtual 90	org/vidogram/SQLite/SQLiteCursor:b	()V
          //   262: aload 6
          //   264: athrow
          //   265: astore 6
          //   267: goto -15 -> 252
          //   270: astore 6
          //   272: goto -20 -> 252
          //   275: astore 7
          //   277: iconst_0
          //   278: istore_1
          //   279: aload 8
          //   281: astore 6
          //   283: goto -74 -> 209
          //   286: astore 8
          //   288: aload 7
          //   290: astore 6
          //   292: aload 8
          //   294: astore 7
          //   296: iconst_0
          //   297: istore_1
          //   298: goto -89 -> 209
          //   301: astore 7
          //   303: goto -94 -> 209
          //   306: aconst_null
          //   307: astore 6
          //   309: goto -174 -> 135
          //   312: iconst_0
          //   313: istore_2
          //   314: goto -158 -> 156
          //
          // Exception table:
          //   from	to	target	type
          //   10	49	198	java/lang/Throwable
          //   10	49	247	finally
          //   49	65	265	finally
          //   70	79	265	finally
          //   83	90	265	finally
          //   101	119	265	finally
          //   130	135	265	finally
          //   139	146	265	finally
          //   146	152	265	finally
          //   209	216	270	finally
          //   49	65	275	java/lang/Throwable
          //   70	79	275	java/lang/Throwable
          //   83	90	286	java/lang/Throwable
          //   101	119	286	java/lang/Throwable
          //   130	135	286	java/lang/Throwable
          //   139	146	286	java/lang/Throwable
          //   146	152	301	java/lang/Throwable
        }
      });
      return;
    }
    if (paramInt == 0)
    {
      localObject1 = new g.pm();
      localObject2 = (g.pm)localObject1;
      if (paramBoolean2);
      while (true)
      {
        ((g.pm)localObject2).c = i1;
        ConnectionsManager.a().a((f)localObject1, new c(paramInt, i1)
        {
        });
        return;
        i1 = f[paramInt];
      }
    }
    Object localObject1 = new g.pw();
    Object localObject2 = (g.pw)localObject1;
    if (paramBoolean2);
    for (i1 = i2; ; i1 = f[paramInt])
    {
      ((g.pw)localObject2).c = i1;
      break;
    }
  }

  private static void b(ArrayList<g.bf> paramArrayList, ArrayList<Long> paramArrayList1, int paramInt1, int paramInt2)
  {
    if (paramArrayList != null);
    for (paramArrayList = new ArrayList(paramArrayList); ; paramArrayList = null)
    {
      w.a().c().b(new Runnable(paramArrayList, paramArrayList1, paramInt1, paramInt2)
      {
        public void run()
        {
          int k = 0;
          try
          {
            if (this.a != null)
            {
              localSQLitePreparedStatement = w.a().b().a("REPLACE INTO stickers_featured VALUES(?, ?, ?, ?, ?)");
              localSQLitePreparedStatement.d();
              int i = 0;
              int j = 4;
              while (i < this.a.size())
              {
                j += ((g.bf)this.a.get(i)).b();
                i += 1;
              }
              NativeByteBuffer localNativeByteBuffer1 = new NativeByteBuffer(j);
              NativeByteBuffer localNativeByteBuffer2 = new NativeByteBuffer(this.b.size() * 8 + 4);
              localNativeByteBuffer1.a(this.a.size());
              i = 0;
              while (i < this.a.size())
              {
                ((g.bf)this.a.get(i)).a(localNativeByteBuffer1);
                i += 1;
              }
              localNativeByteBuffer2.a(this.b.size());
              i = k;
              while (i < this.b.size())
              {
                localNativeByteBuffer2.a(((Long)this.b.get(i)).longValue());
                i += 1;
              }
              localSQLitePreparedStatement.a(1, 1);
              localSQLitePreparedStatement.a(2, localNativeByteBuffer1);
              localSQLitePreparedStatement.a(3, localNativeByteBuffer2);
              localSQLitePreparedStatement.a(4, this.c);
              localSQLitePreparedStatement.a(5, this.d);
              localSQLitePreparedStatement.b();
              localNativeByteBuffer1.e();
              localNativeByteBuffer2.e();
              localSQLitePreparedStatement.e();
              return;
            }
            SQLitePreparedStatement localSQLitePreparedStatement = w.a().b().a("UPDATE stickers_featured SET date = ?");
            localSQLitePreparedStatement.d();
            localSQLitePreparedStatement.a(1, this.c);
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
      return;
    }
  }

  private static void b(ArrayList<g.bf> paramArrayList, ArrayList<Long> paramArrayList1, boolean paramBoolean, int paramInt1, int paramInt2)
  {
    a.a(new Runnable()
    {
      public void run()
      {
        g.d(false);
        g.e(true);
      }
    });
    Utilities.c.b(new Runnable(paramBoolean, paramArrayList, paramInt1, paramInt2, paramArrayList1)
    {
      public void run()
      {
        long l = 1000L;
        Object localObject;
        if (((this.a) && ((this.b == null) || (Math.abs(System.currentTimeMillis() / 1000L - this.c) >= 3600L))) || ((!this.a) && (this.b == null) && (this.d == 0)))
        {
          localObject = new Runnable()
          {
            public void run()
            {
              if ((g.5.this.b != null) && (g.5.this.d != 0))
                g.f(g.5.this.d);
              g.a(false, false);
            }
          };
          if ((this.b == null) && (!this.a))
          {
            a.a((Runnable)localObject, l);
            if (this.b != null)
              break label105;
          }
        }
        label105: 
        do
        {
          return;
          l = 0L;
          break;
          if (this.b == null)
            continue;
          try
          {
            localObject = new ArrayList();
            HashMap localHashMap = new HashMap();
            int i = 0;
            while (i < this.b.size())
            {
              g.bf localbf = (g.bf)this.b.get(i);
              ((ArrayList)localObject).add(localbf);
              localHashMap.put(Long.valueOf(localbf.b.b), localbf);
              i += 1;
            }
            if (!this.a)
              g.a((ArrayList)localObject, this.e, this.c, this.d);
            a.a(new Runnable(localHashMap, (ArrayList)localObject)
            {
              public void run()
              {
                g.c(g.5.this.e);
                g.a(this.a);
                g.d(this.b);
                g.f(g.5.this.d);
                g.g(g.5.this.c);
                y.a().a(y.Q, new Object[0]);
              }
            });
            return;
          }
          catch (Throwable localThrowable)
          {
            n.a("tmessages", localThrowable);
            return;
          }
        }
        while (this.a);
        a.a(new Runnable()
        {
          public void run()
          {
            g.g(g.5.this.c);
          }
        });
        g.a(null, null, this.c, 0);
      }
    });
  }

  public static boolean b(String paramString)
  {
    return c.containsKey(paramString);
  }

  public static ArrayList<g.q> c()
  {
    return new ArrayList(m);
  }

  public static ArrayList<g.q> c(int paramInt)
  {
    return j[paramInt];
  }

  public static void c(long paramLong)
  {
    if ((!t.contains(Long.valueOf(paramLong))) || (u.contains(Long.valueOf(paramLong))))
      return;
    u.add(Long.valueOf(paramLong));
    g.ql localql = new g.ql();
    localql.c.add(Long.valueOf(paramLong));
    ConnectionsManager.a().a(localql, new c()
    {
    });
    a.a(new Runnable(paramLong)
    {
      public void run()
      {
        g.j().remove(Long.valueOf(this.a));
        g.k().remove(Long.valueOf(this.a));
        g.f(g.b(g.l()));
        y.a().a(y.Q, new Object[0]);
        g.a(g.l(), g.j(), g.m(), g.n());
      }
    }
    , 1000L);
  }

  public static String d(long paramLong)
  {
    g.rg localrg = (g.rg)b.get(Long.valueOf(paramLong));
    if (localrg != null)
      return localrg.c.e;
    return null;
  }

  public static ArrayList<g.rg> d(int paramInt)
  {
    return a[paramInt];
  }

  public static HashMap<String, ArrayList<g.q>> d()
  {
    return i;
  }

  public static ArrayList<g.bf> e()
  {
    return r;
  }

  public static void e(int paramInt)
  {
    f[paramInt] = h(a[paramInt]);
  }

  private static int f(ArrayList<g.q> paramArrayList)
  {
    if (paramArrayList == null)
      return 0;
    long l1 = 0L;
    int i1 = 0;
    if (i1 < Math.min(200, paramArrayList.size()))
    {
      g.q localq = (g.q)paramArrayList.get(i1);
      if (localq == null);
      while (true)
      {
        i1 += 1;
        break;
        int i2 = (int)(localq.b >> 32);
        int i3 = (int)localq.b;
        l1 = ((l1 * 20261L + 2147483648L + i2) % 2147483648L * 20261L + 2147483648L + i3) % 2147483648L;
      }
    }
    return (int)l1;
  }

  public static ArrayList<Long> f()
  {
    return t;
  }

  private static int g(ArrayList<g.bf> paramArrayList)
  {
    long l1 = 0L;
    int i1 = 0;
    if (i1 < paramArrayList.size())
    {
      g.be localbe = ((g.bf)paramArrayList.get(i1)).b;
      if (localbe.h);
      while (true)
      {
        i1 += 1;
        break;
        int i2 = (int)(localbe.b >> 32);
        int i3 = (int)localbe.b;
        long l2 = ((l1 * 20261L + 2147483648L + i2) % 2147483648L * 20261L + 2147483648L + i3) % 2147483648L;
        l1 = l2;
        if (!t.contains(Long.valueOf(localbe.b)))
          continue;
        l1 = (l2 * 20261L + 2147483648L + 1L) % 2147483648L;
      }
    }
    return (int)l1;
  }

  private static int h(ArrayList<g.rg> paramArrayList)
  {
    long l1 = 0L;
    int i1 = 0;
    if (i1 < paramArrayList.size())
    {
      g.be localbe = ((g.rg)paramArrayList.get(i1)).c;
      if (localbe.h);
      while (true)
      {
        i1 += 1;
        break;
        l1 = (l1 * 20261L + 2147483648L + localbe.l) % 2147483648L;
      }
    }
    return (int)l1;
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.d.g
 * JD-Core Version:    0.6.0
 */