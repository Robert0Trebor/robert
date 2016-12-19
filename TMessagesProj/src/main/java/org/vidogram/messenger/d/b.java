package org.vidogram.messenger.d;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.vidogram.SQLite.SQLiteCursor;
import org.vidogram.SQLite.SQLiteDatabase;
import org.vidogram.messenger.ApplicationLoader;
import org.vidogram.messenger.Utilities;
import org.vidogram.messenger.ad;
import org.vidogram.messenger.h;
import org.vidogram.messenger.n;
import org.vidogram.messenger.v;
import org.vidogram.messenger.w;
import org.vidogram.messenger.y;
import org.vidogram.tgnet.ConnectionsManager;
import org.vidogram.tgnet.NativeByteBuffer;
import org.vidogram.tgnet.c;
import org.vidogram.tgnet.f;
import org.vidogram.tgnet.g.ar;
import org.vidogram.tgnet.g.at;
import org.vidogram.tgnet.g.eq;
import org.vidogram.tgnet.g.i;
import org.vidogram.tgnet.g.ik;
import org.vidogram.tgnet.g.il;
import org.vidogram.tgnet.g.pl;
import org.vidogram.tgnet.g.py;
import org.vidogram.tgnet.g.qq;
import org.vidogram.tgnet.g.s;
import org.vidogram.tgnet.g.vw;

public class b
{
  private static HashMap<Long, g.s> a = new HashMap();
  private static HashMap<Long, g.ar> b = new HashMap();
  private static SharedPreferences c = ApplicationLoader.a.getSharedPreferences("drafts", 0);
  private static boolean d;

  static
  {
    Iterator localIterator = c.getAll().entrySet().iterator();
    while (true)
    {
      Object localObject2;
      if (localIterator.hasNext())
        localObject2 = (Map.Entry)localIterator.next();
      try
      {
        Object localObject1 = (String)((Map.Entry)localObject2).getKey();
        long l = Utilities.b((String)localObject1).longValue();
        localObject2 = new org.vidogram.tgnet.e(Utilities.d((String)((Map.Entry)localObject2).getValue()));
        if (((String)localObject1).startsWith("r_"))
        {
          localObject1 = g.ar.a((org.vidogram.tgnet.a)localObject2, ((org.vidogram.tgnet.e)localObject2).b(true), true);
          if (localObject1 == null)
            continue;
          b.put(Long.valueOf(l), localObject1);
          continue;
        }
        localObject1 = g.s.a((org.vidogram.tgnet.a)localObject2, ((org.vidogram.tgnet.e)localObject2).b(true), true);
        if (localObject1 == null)
          continue;
        a.put(Long.valueOf(l), localObject1);
        continue;
        return;
      }
      catch (Exception localException)
      {
      }
    }
  }

  public static g.s a(long paramLong)
  {
    return (g.s)a.get(Long.valueOf(paramLong));
  }

  public static void a()
  {
    if ((ad.t) || (d))
      return;
    d = true;
    g.pl localpl = new g.pl();
    ConnectionsManager.a().a(localpl, new c()
    {
    });
  }

  public static void a(long paramLong, CharSequence paramCharSequence, ArrayList<g.at> paramArrayList, g.ar paramar, boolean paramBoolean)
  {
    a(paramLong, paramCharSequence, paramArrayList, paramar, paramBoolean, false);
  }

  public static void a(long paramLong, CharSequence paramCharSequence, ArrayList<g.at> paramArrayList, g.ar paramar, boolean paramBoolean1, boolean paramBoolean2)
  {
    Object localObject;
    if ((!TextUtils.isEmpty(paramCharSequence)) || (paramar != null))
    {
      localObject = new g.ik();
      ((g.s)localObject).g = (int)(System.currentTimeMillis() / 1000L);
      if (paramCharSequence != null)
        break label209;
      paramCharSequence = "";
      label41: ((g.s)localObject).e = paramCharSequence;
      ((g.s)localObject).c = paramBoolean1;
      if (paramar != null)
      {
        ((g.s)localObject).d = paramar.b;
        ((g.s)localObject).b |= 1;
      }
      if ((paramArrayList != null) && (!paramArrayList.isEmpty()))
      {
        ((g.s)localObject).f = paramArrayList;
        ((g.s)localObject).b |= 8;
      }
      paramCharSequence = (g.s)a.get(Long.valueOf(paramLong));
      if ((paramBoolean2) || (((paramCharSequence == null) || (!paramCharSequence.e.equals(((g.s)localObject).e)) || (paramCharSequence.d != ((g.s)localObject).d) || (paramCharSequence.c != ((g.s)localObject).c)) && ((paramCharSequence != null) || (!TextUtils.isEmpty(((g.s)localObject).e)) || (((g.s)localObject).d != 0))))
        break label219;
    }
    label209: label219: 
    do
    {
      return;
      localObject = new g.il();
      break;
      paramCharSequence = paramCharSequence.toString();
      break label41;
      a(paramLong, (g.s)localObject, paramar, false);
      int i = (int)paramLong;
      if (i == 0)
        break label321;
      paramCharSequence = new g.qq();
      paramCharSequence.f = v.c(i);
    }
    while (paramCharSequence.f == null);
    paramCharSequence.g = ((g.s)localObject).e;
    paramCharSequence.d = ((g.s)localObject).c;
    paramCharSequence.e = ((g.s)localObject).d;
    paramCharSequence.h = ((g.s)localObject).f;
    paramCharSequence.c = ((g.s)localObject).b;
    ConnectionsManager.a().a(paramCharSequence, new c()
    {
    });
    label321: v.a().b(null);
    y.a().a(y.c, new Object[0]);
  }

  public static void a(long paramLong, g.s params, g.ar paramar, boolean paramBoolean)
  {
    g.vw localvw = null;
    SharedPreferences.Editor localEditor = c.edit();
    label150: label198: long l;
    if ((params == null) || ((params instanceof g.il)))
    {
      a.remove(Long.valueOf(paramLong));
      b.remove(Long.valueOf(paramLong));
      c.edit().remove("" + paramLong).remove("r_" + paramLong).commit();
      if (paramar != null)
        break label364;
      b.remove(Long.valueOf(paramLong));
      localEditor.remove("r_" + paramLong);
      localEditor.commit();
      if (paramBoolean)
        if ((params.d != 0) && (paramar == null))
        {
          i = (int)paramLong;
          if (i <= 0)
            break label433;
          localvw = v.a().a(Integer.valueOf(i));
          paramar = null;
          if ((localvw != null) || (paramar != null))
          {
            l = params.d;
            if (!org.vidogram.messenger.e.d(paramar))
              break label449;
            l |= paramar.h << 32;
          }
        }
    }
    label433: label449: for (int i = paramar.h; ; i = 0)
    {
      while (true)
      {
        w.a().c().b(new Runnable(l, i, paramLong)
        {
          public void run()
          {
            Object localObject2 = null;
            try
            {
              SQLiteCursor localSQLiteCursor = w.a().b().b(String.format(Locale.US, "SELECT data FROM messages WHERE mid = %d", new Object[] { Long.valueOf(this.a) }), new Object[0]);
              Object localObject1 = localObject2;
              if (localSQLiteCursor.a())
              {
                NativeByteBuffer localNativeByteBuffer = localSQLiteCursor.g(0);
                localObject1 = localObject2;
                if (localNativeByteBuffer != null)
                {
                  localObject1 = g.ar.a(localNativeByteBuffer, localNativeByteBuffer.b(false), false);
                  localNativeByteBuffer.e();
                }
              }
              localSQLiteCursor.b();
              if (localObject1 == null)
              {
                if (this.b != 0)
                {
                  localObject1 = new g.eq();
                  ((g.eq)localObject1).c = v.b(this.b);
                  ((g.eq)localObject1).d.add(Integer.valueOf((int)this.a));
                  ConnectionsManager.a().a((f)localObject1, new c()
                  {
                  });
                  return;
                }
                localObject1 = new g.py();
                ((g.py)localObject1).c.add(Integer.valueOf((int)this.a));
                ConnectionsManager.a().a((f)localObject1, new c()
                {
                });
                return;
              }
            }
            catch (Exception localException)
            {
              n.a("tmessages", localException);
              return;
            }
            b.a(this.c, localException);
          }
        });
        y.a().a(y.ag, new Object[] { Long.valueOf(paramLong) });
        return;
        a.put(Long.valueOf(paramLong), params);
        try
        {
          org.vidogram.tgnet.e locale1 = new org.vidogram.tgnet.e(params.b());
          params.a(locale1);
          localEditor.putString("" + paramLong, Utilities.a(locale1.c()));
        }
        catch (Exception localException)
        {
          n.a("tmessages", localException);
        }
      }
      break;
      label364: b.put(Long.valueOf(paramLong), paramar);
      org.vidogram.tgnet.e locale2 = new org.vidogram.tgnet.e(paramar.b());
      paramar.a(locale2);
      localEditor.putString("r_" + paramLong, Utilities.a(locale2.c()));
      break label150;
      paramar = v.a().b(Integer.valueOf(-i));
      break label198;
    }
  }

  public static void a(long paramLong, boolean paramBoolean)
  {
    g.s locals = (g.s)a.get(Long.valueOf(paramLong));
    if (locals == null);
    do
    {
      return;
      if (paramBoolean)
        continue;
      a.remove(Long.valueOf(paramLong));
      b.remove(Long.valueOf(paramLong));
      c.edit().remove("" + paramLong).remove("r_" + paramLong).commit();
      v.a().b(null);
      y.a().a(y.c, new Object[0]);
      return;
    }
    while (locals.d == 0);
    locals.d = 0;
    locals.b &= -2;
    a(paramLong, locals.e, locals.f, null, locals.c, true);
  }

  public static g.ar b(long paramLong)
  {
    return (g.ar)b.get(Long.valueOf(paramLong));
  }

  public static void b()
  {
    a.clear();
    b.clear();
    c.edit().clear().commit();
  }

  private static void b(long paramLong, g.ar paramar)
  {
    if (paramar == null)
      return;
    org.vidogram.messenger.a.a(new Runnable(paramLong, paramar)
    {
      public void run()
      {
        Object localObject = (g.s)b.c().get(Long.valueOf(this.a));
        if ((localObject != null) && (((g.s)localObject).d == this.b.b))
        {
          b.d().put(Long.valueOf(this.a), this.b);
          localObject = new org.vidogram.tgnet.e(this.b.b());
          this.b.a((org.vidogram.tgnet.a)localObject);
          b.e().edit().putString("r_" + this.a, Utilities.a(((org.vidogram.tgnet.e)localObject).c())).commit();
          y.a().a(y.ag, new Object[] { Long.valueOf(this.a) });
        }
      }
    });
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.d.b
 * JD-Core Version:    0.6.0
 */