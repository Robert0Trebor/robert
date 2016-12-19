package org.vidogram.messenger.d;

import android.text.TextUtils;
import java.util.ArrayList;
import org.vidogram.messenger.u;
import org.vidogram.messenger.v;
import org.vidogram.messenger.y;
import org.vidogram.tgnet.ConnectionsManager;
import org.vidogram.tgnet.c;
import org.vidogram.tgnet.f;
import org.vidogram.tgnet.g.aj;
import org.vidogram.tgnet.g.kq;
import org.vidogram.tgnet.g.qt;

public class d
{
  private static int a;
  private static int b;
  private static long c;
  private static int d;
  private static int[] e = { 0, 0 };
  private static boolean[] f = { 0, 0 };
  private static ArrayList<u> g = new ArrayList();
  private static String h;
  private static int i;

  public static String a()
  {
    return h;
  }

  public static void a(String paramString, long paramLong1, long paramLong2, int paramInt1, int paramInt2)
  {
    a(paramString, paramLong1, paramLong2, paramInt1, paramInt2, false);
  }

  private static void a(String paramString, long paramLong1, long paramLong2, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    int k = 0;
    if (!paramBoolean)
    {
      j = 1;
      if (a != 0)
      {
        ConnectionsManager.a().a(a, true);
        a = 0;
      }
      if (b != 0)
      {
        ConnectionsManager.a().a(b, true);
        b = 0;
      }
      if (!TextUtils.isEmpty(paramString))
        break label579;
      if (!g.isEmpty())
        break label74;
    }
    label74: Object localObject;
    long l;
    label273: label284: label309: 
    do
    {
      return;
      j = 0;
      break;
      if (paramInt2 != 1)
        break label440;
      i += 1;
      if (i < g.size())
      {
        paramString = (u)g.get(i);
        y.a().a(y.W, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramString.q()), Integer.valueOf(b()), Long.valueOf(paramString.u()), Integer.valueOf(i), Integer.valueOf(e[0] + e[1]) });
        return;
      }
      if ((f[0] != 0) && (paramLong2 == 0L) && (f[1] != 0))
      {
        i -= 1;
        return;
      }
      paramString = h;
      localObject = (u)g.get(g.size() - 1);
      if ((((u)localObject).u() != paramLong1) || (f[0] != 0))
        break label411;
      j = ((u)localObject).q();
      l = paramLong1;
      int m = 0;
      k = j;
      j = m;
      if ((f[0] == 0) || (f[1] != 0) || (paramLong2 == 0L))
        break label750;
      l = paramLong2;
      if ((l != paramLong1) || (j == 0))
        break label644;
      if (paramLong2 == 0L)
        break label628;
      localObject = v.c((int)paramLong2);
    }
    while (localObject == null);
    g.qt localqt = new g.qt();
    localqt.d = ((g.aj)localObject);
    c = paramLong2;
    localqt.k = 1;
    localqt.e = paramString;
    localqt.f = new g.kq();
    b = ConnectionsManager.a().a(localqt, new c(paramLong2, localqt, paramLong1, paramInt1, paramInt2)
    {
    }
    , 2);
    return;
    label411: if (((u)localObject).u() == paramLong2);
    for (int j = ((u)localObject).q(); ; j = 0)
    {
      f[1] = false;
      l = paramLong2;
      break label273;
      label440: if (paramInt2 != 2)
        break;
      i -= 1;
      if (i < 0)
      {
        i = 0;
        return;
      }
      if (i >= g.size())
        i = g.size() - 1;
      paramString = (u)g.get(i);
      y.a().a(y.W, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramString.q()), Integer.valueOf(b()), Long.valueOf(paramString.u()), Integer.valueOf(i), Integer.valueOf(e[0] + e[1]) });
      return;
      label579: if (j != 0)
      {
        localObject = f;
        f[1] = false;
        localObject[0] = 0;
        localObject = e;
        e[1] = 0;
        localObject[0] = 0;
        g.clear();
      }
      l = paramLong1;
      break label284;
      label628: c = 0L;
      f[1] = true;
      e[1] = 0;
      label644: localObject = new g.qt();
      ((g.qt)localObject).d = v.c((int)l);
      if (((g.qt)localObject).d == null)
        break;
      ((g.qt)localObject).k = 21;
      ((g.qt)localObject).e = paramString;
      ((g.qt)localObject).j = k;
      ((g.qt)localObject).f = new g.kq();
      paramInt2 = d + 1;
      d = paramInt2;
      h = paramString;
      a = ConnectionsManager.a().a((f)localObject, new c(paramInt2, (g.qt)localObject, l, paramLong1, paramInt1, paramLong2)
      {
      }
      , 2);
      return;
      label750: break label309;
    }
  }

  private static int b()
  {
    int j = 0;
    if ((i < g.size() - 1) || (f[0] == 0) || (f[1] == 0))
      j = 1;
    int k = j;
    if (i > 0)
      k = j | 0x2;
    return k;
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.d.d
 * JD-Core Version:    0.6.0
 */