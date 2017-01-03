package org.vidogram.messenger;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.ContentProviderOperation;
import android.content.ContentProviderOperation.Builder;
import android.content.ContentProviderResult;
import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.database.Cursor;
import android.net.Uri;
import android.net.Uri.Builder;
import android.provider.ContactsContract.CommonDataKinds.Phone;
import android.provider.ContactsContract.Data;
import android.provider.ContactsContract.RawContacts;
import android.text.TextUtils;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashMap<Ljava.lang.Integer;Lorg.vidogram.messenger.f.a;>;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.vidogram.a.b;
import org.vidogram.tgnet.ConnectionsManager;
import org.vidogram.tgnet.c;
import org.vidogram.tgnet.g.ap;
import org.vidogram.tgnet.g.ba;
import org.vidogram.tgnet.g.bl;
import org.vidogram.tgnet.g.bp;
import org.vidogram.tgnet.g.fw;
import org.vidogram.tgnet.g.fy;
import org.vidogram.tgnet.g.ga;
import org.vidogram.tgnet.g.gb;
import org.vidogram.tgnet.g.gd;
import org.vidogram.tgnet.g.jg;
import org.vidogram.tgnet.g.lc;
import org.vidogram.tgnet.g.lf;
import org.vidogram.tgnet.g.lg;
import org.vidogram.tgnet.g.vw;

public class f
{
  private static volatile f G;
  private static final Object n = new Object();
  private int A = 0;
  private ArrayList<g.ba> B = null;
  private ArrayList<g.ba> C = null;
  private String[] D = { "contact_id", "data1", "data2", "data3" };
  private String[] E = { "contact_id", "data2", "data3", "display_name", "data5" };
  private int F;
  public boolean a = false;
  public HashMap<Integer, a> b = new HashMap();
  public HashMap<String, a> c = new HashMap();
  public ArrayList<a> d = new ArrayList();
  public ArrayList<g.fw> e = new ArrayList();
  public SparseArray<g.fw> f = new SparseArray();
  public HashMap<String, ArrayList<g.fw>> g = new HashMap();
  public ArrayList<String> h = new ArrayList();
  public HashMap<String, ArrayList<g.fw>> i = new HashMap();
  public ArrayList<String> j = new ArrayList();
  public HashMap<String, g.fw> k = new HashMap();
  private Account l;
  private boolean m = false;
  private boolean o = false;
  private boolean p = false;
  private final Object q = new Object();
  private boolean r = false;
  private String s = "";
  private ArrayList<Integer> t = new ArrayList();
  private String u;
  private boolean v = false;
  private HashMap<String, String> w = new HashMap();
  private int x = 0;
  private int y;
  private int z = 0;

  static
  {
    G = null;
  }

  public f()
  {
    if (ApplicationLoader.a.getSharedPreferences("mainconfig", 0).getBoolean("needGetStatuses", false))
      k();
    this.w.put("À", "A");
    this.w.put("Á", "A");
    this.w.put("Ä", "A");
    this.w.put("Ù", "U");
    this.w.put("Ú", "U");
    this.w.put("Ü", "U");
    this.w.put("Ì", "I");
    this.w.put("Í", "I");
    this.w.put("Ï", "I");
    this.w.put("È", "E");
    this.w.put("É", "E");
    this.w.put("Ê", "E");
    this.w.put("Ë", "E");
    this.w.put("Ò", "O");
    this.w.put("Ó", "O");
    this.w.put("Ö", "O");
    this.w.put("Ç", "C");
    this.w.put("Ñ", "N");
    this.w.put("Ÿ", "Y");
    this.w.put("Ý", "Y");
    this.w.put("Ţ", "Y");
  }

  public static String a(String paramString1, String paramString2)
  {
    int i2 = 0;
    String str = paramString1;
    if (paramString1 != null)
      str = paramString1.trim();
    paramString1 = paramString2;
    if (paramString2 != null)
      paramString1 = paramString2.trim();
    int i1;
    if (str != null)
    {
      i1 = str.length();
      if (paramString1 != null)
        i2 = paramString1.length();
      paramString2 = new StringBuilder(i2 + i1 + 1);
      if (r.b != 1)
        break label141;
      if ((str == null) || (str.length() <= 0))
        break label121;
      paramString2.append(str);
      if ((paramString1 != null) && (paramString1.length() > 0))
      {
        alObject = ((Context)localObject).getPackageManager().getPackageInfo(((Context)localObject).getPackageName(), 0);
        paramString2.append(" ");
        paramString2.append(paramString1);
      }
    }
    while (true)
    {
      return paramString2.toString();
      i1 = 0;
      break;
      label121: if ((paramString1 == null) || (paramString1.length() <= 0))
        continue;
      paramString2.append(paramString1);
      continue;
      label141: if ((paramString1 != null) && (paramString1.length() > 0))
      {
        paramString2.append(paramString1);
        if ((str == null) || (str.length() <= 0))
          continue;
        paramString2.append(" ");
        paramString2.append(str);
        continue;
      }
      if ((str == null) || (str.length() <= 0))
        continue;
      paramString2.append(str);
    }
  }

  public static f a()
  {
    Object localObject1 = G;
    if (localObject1 == null)
    {
      monitorenter;
      try
      {
        f localf = G;
        localObject1 = localf;
        if (localf == null)
        {
          localObject1 = new f();
          G = (f)localObject1;
        }
        return localObject1;
      }
      finally
      {
        monitorexit;
      }
    }
    return (f)localObject2;
  }

  private void a(int paramInt)
  {
    if (!v())
      return;
    synchronized (this.q)
    {
      this.o = true;
    }
    try
    {
      ApplicationLoader.a.getContentResolver().delete(ContactsContract.RawContacts.CONTENT_URI.buildUpon().appendQueryParameter("caller_is_syncadapter", "true").appendQueryParameter("account_name", this.l.name).appendQueryParameter("account_type", this.l.type).build(), "sync2 = " + paramInt, null);
      synchronized (this.q)
      {
        this.o = false;
        return;
      }
      localObject3 = finally;
      monitorexit;
      throw localObject3;
    }
    catch (Exception localException)
    {
      while (true)
        n.a("tmessages", localException);
    }
  }

  private void a(ArrayList<Integer> paramArrayList1, ConcurrentHashMap<Integer, g.vw> paramConcurrentHashMap, ArrayList<g.fw> paramArrayList, ArrayList<Integer> paramArrayList2)
  {
    Object localObject1;
    if (paramArrayList != null)
    {
      localObject1 = paramArrayList2;
      if (paramArrayList2 != null);
    }
    else
    {
      paramArrayList2 = new ArrayList();
      localObject2 = new ArrayList();
      i1 = 0;
      paramArrayList = paramArrayList2;
      localObject1 = localObject2;
      if (i1 < paramArrayList1.size())
      {
        paramArrayList = (Integer)paramArrayList1.get(i1);
        if (paramArrayList.intValue() > 0)
        {
          localObject1 = new g.fw();
          ((g.fw)localObject1).c = paramArrayList.intValue();
          paramArrayList2.add(localObject1);
        }
        while (true)
        {
          i1 += 1;
          break;
          if (paramArrayList.intValue() >= 0)
            continue;
          ((ArrayList)localObject2).add(Integer.valueOf(-paramArrayList.intValue()));
        }
      }
    }
    n.a("tmessages", "process update - contacts add = " + paramArrayList.size() + " delete = " + ((ArrayList)localObject1).size());
    paramArrayList2 = new StringBuilder();
    Object localObject2 = new StringBuilder();
    int i2 = 0;
    int i1 = 0;
    Object localObject3;
    if (i2 < paramArrayList.size())
    {
      localObject3 = (g.fw)paramArrayList.get(i2);
      paramArrayList1 = null;
      if (paramConcurrentHashMap != null)
        paramArrayList1 = (g.vw)paramConcurrentHashMap.get(Integer.valueOf(((g.fw)localObject3).c));
      if (paramArrayList1 == null)
      {
        paramArrayList1 = v.a().a(Integer.valueOf(((g.fw)localObject3).c));
        label254: if ((paramArrayList1 != null) && (paramArrayList1.i != null) && (paramArrayList1.i.length() != 0))
          break label299;
        i1 = 1;
      }
      while (true)
      {
        i2 += 1;
        break;
        v.a().a(paramArrayList1, true);
        break label254;
        label299: localObject3 = (a)this.c.get(paramArrayList1.i);
        if (localObject3 != null)
        {
          i3 = ((a)localObject3).d.indexOf(paramArrayList1.i);
          if (i3 != -1)
            ((a)localObject3).e.set(i3, Integer.valueOf(0));
        }
        if (paramArrayList2.length() != 0)
          paramArrayList2.append(",");
        paramArrayList2.append(paramArrayList1.i);
      }
    }
    int i3 = 0;
    i2 = i1;
    i1 = i3;
    if (i1 < ((ArrayList)localObject1).size())
    {
      localObject3 = (Integer)((ArrayList)localObject1).get(i1);
      Utilities.f.b(new Runnable((Integer)localObject3)
      {
        public void run()
        {
          f.b(f.this, this.a.intValue());
        }
      });
      paramArrayList1 = null;
      if (paramConcurrentHashMap != null)
        paramArrayList1 = (g.vw)paramConcurrentHashMap.get(localObject3);
      if (paramArrayList1 == null)
      {
        paramArrayList1 = v.a().a((Integer)localObject3);
        label463: if (paramArrayList1 != null)
          break label495;
        i3 = 1;
      }
      while (true)
      {
        i1 += 1;
        i2 = i3;
        break;
        v.a().a(paramArrayList1, true);
        break label463;
        label495: i3 = i2;
        if (paramArrayList1.i == null)
          continue;
        i3 = i2;
        if (paramArrayList1.i.length() <= 0)
          continue;
        localObject3 = (a)this.c.get(paramArrayList1.i);
        if (localObject3 != null)
        {
          i3 = ((a)localObject3).d.indexOf(paramArrayList1.i);
          if (i3 != -1)
            ((a)localObject3).e.set(i3, Integer.valueOf(1));
        }
        if (((StringBuilder)localObject2).length() != 0)
          ((StringBuilder)localObject2).append(",");
        ((StringBuilder)localObject2).append(paramArrayList1.i);
        i3 = i2;
      }
    }
    if ((paramArrayList2.length() != 0) || (((StringBuilder)localObject2).length() != 0))
      w.a().a(paramArrayList2.toString(), ((StringBuilder)localObject2).toString());
    if (i2 != 0)
    {
      Utilities.c.b(new Runnable()
      {
        public void run()
        {
          f.this.a(false, true);
        }
      });
      return;
    }
    a.a(new Runnable(paramArrayList, (ArrayList)localObject1)
    {
      public void run()
      {
        int i = 0;
        while (i < this.a.size())
        {
          localObject = (g.fw)this.a.get(i);
          if (f.this.f.get(((g.fw)localObject).c) == null)
          {
            f.this.e.add(localObject);
            f.this.f.put(((g.fw)localObject).c, localObject);
          }
          i += 1;
        }
        i = 0;
        while (i < this.b.size())
        {
          localObject = (Integer)this.b.get(i);
          g.fw localfw = (g.fw)f.this.f.get(((Integer)localObject).intValue());
          if (localfw != null)
          {
            f.this.e.remove(localfw);
            f.this.f.remove(((Integer)localObject).intValue());
          }
          i += 1;
        }
        if (!this.a.isEmpty())
        {
          f.a(f.this, f.this.e);
          f.f(f.this);
        }
        f.this.a(f.this.a(f.this.b), false, false, false, false);
        Object localObject = f.this;
        if (!this.a.isEmpty());
        for (boolean bool = true; ; bool = false)
        {
          f.d((f)localObject, bool);
          y.a().a(y.k, new Object[0]);
          return;
        }
      }
    });
  }

  private void b(ArrayList<g.fw> paramArrayList)
  {
    HashMap localHashMap = new HashMap();
    paramArrayList = paramArrayList.iterator();
    Object localObject2;
    while (paramArrayList.hasNext())
    {
      localObject1 = (g.fw)paramArrayList.next();
      localObject2 = v.a().a(Integer.valueOf(((g.fw)localObject1).c));
      if ((localObject2 == null) || (((g.vw)localObject2).i == null) || (((g.vw)localObject2).i.length() == 0))
        continue;
      localHashMap.put(((g.vw)localObject2).i, localObject1);
    }
    paramArrayList = new ArrayList();
    Object localObject1 = this.b.entrySet().iterator();
    label160: label251: label254: 
    while (true)
    {
      a locala;
      if (((Iterator)localObject1).hasNext())
      {
        localObject2 = (Map.Entry)((Iterator)localObject1).next();
        locala = (a)((Map.Entry)localObject2).getValue();
        ((Integer)((Map.Entry)localObject2).getKey()).intValue();
        i1 = 0;
        if (i1 >= locala.b.size())
          break label251;
        if ((!localHashMap.containsKey((String)locala.d.get(i1))) && (((Integer)locala.e.get(i1)).intValue() != 1));
      }
      for (int i1 = 1; ; i1 = 0)
      {
        if (i1 != 0)
          break label254;
        paramArrayList.add(locala);
        break;
        i1 += 1;
        break label160;
        Collections.sort(paramArrayList, new Comparator()
        {
          public int a(f.a parama1, f.a parama2)
          {
            String str2 = parama1.f;
            String str1 = str2;
            if (str2.length() == 0)
              str1 = parama1.g;
            str2 = parama2.f;
            parama1 = str2;
            if (str2.length() == 0)
              parama1 = parama2.g;
            return str1.compareTo(parama1);
          }
        });
        this.d = paramArrayList;
        return;
      }
    }
  }

  private void b(boolean paramBoolean)
  {
    if (paramBoolean)
      Collections.sort(this.e, new Comparator()
      {
        public int a(g.fw paramfw1, g.fw paramfw2)
        {
          paramfw1 = v.a().a(Integer.valueOf(paramfw1.c));
          paramfw2 = v.a().a(Integer.valueOf(paramfw2.c));
          return ae.d(paramfw1).compareTo(ae.d(paramfw2));
        }
      });
    StringBuilder localStringBuilder = new StringBuilder();
    HashMap localHashMap = new HashMap();
    ArrayList localArrayList2 = new ArrayList();
    Iterator localIterator = this.e.iterator();
    while (localIterator.hasNext())
    {
      g.fw localfw = (g.fw)localIterator.next();
      Object localObject1 = v.a().a(Integer.valueOf(localfw.c));
      if (localObject1 == null)
        continue;
      Object localObject2 = ae.d((g.vw)localObject1);
      localObject1 = localObject2;
      if (((String)localObject2).length() > 1)
        localObject1 = ((String)localObject2).substring(0, 1);
      if (((String)localObject1).length() == 0);
      for (localObject1 = "#"; ; localObject1 = ((String)localObject1).toUpperCase())
      {
        localObject2 = (String)this.w.get(localObject1);
        if (localObject2 != null)
          localObject1 = localObject2;
        ArrayList localArrayList1 = (ArrayList)localHashMap.get(localObject1);
        localObject2 = localArrayList1;
        if (localArrayList1 == null)
        {
          localObject2 = new ArrayList();
          localHashMap.put(localObject1, localObject2);
          localArrayList2.add(localObject1);
        }
        ((ArrayList)localObject2).add(localfw);
        if (localStringBuilder.length() != 0)
          localStringBuilder.append(",");
        localStringBuilder.append(localfw.c);
        break;
      }
    }
    ad.f = Utilities.e(localStringBuilder.toString());
    ad.a(false);
    Collections.sort(localArrayList2, new Comparator()
    {
      public int a(String paramString1, String paramString2)
      {
        int i = paramString1.charAt(0);
        int j = paramString2.charAt(0);
        if (i == 35)
          return 1;
        if (j == 35)
          return -1;
        return paramString1.compareTo(paramString2);
      }
    });
    this.g = localHashMap;
    this.h = localArrayList2;
  }

  private void c(ArrayList<g.fw> paramArrayList)
  {
    Object localObject1;
    Object localObject2;
    try
    {
      if (!v())
        return;
      localObject1 = ContactsContract.RawContacts.CONTENT_URI.buildUpon().appendQueryParameter("account_name", this.l.name).appendQueryParameter("account_type", this.l.type).build();
      localObject2 = ApplicationLoader.a.getContentResolver().query((Uri)localObject1, new String[] { "_id", "sync2" }, null, null, null);
      localObject1 = new HashMap();
      if (localObject2 == null)
        return;
      while (((Cursor)localObject2).moveToNext())
        ((HashMap)localObject1).put(Integer.valueOf(((Cursor)localObject2).getInt(1)), Long.valueOf(((Cursor)localObject2).getLong(0)));
    }
    catch (Exception paramArrayList)
    {
      n.a("tmessages", paramArrayList);
      return;
    }
    ((Cursor)localObject2).close();
    int i1 = 0;
    while (i1 < paramArrayList.size())
    {
      localObject2 = (g.fw)paramArrayList.get(i1);
      if (!((HashMap)localObject1).containsKey(Integer.valueOf(((g.fw)localObject2).c)))
        a(v.a().a(Integer.valueOf(((g.fw)localObject2).c)), false);
      i1 += 1;
    }
  }

  // ERROR //
  private boolean r()
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore 5
    //   3: iconst_0
    //   4: istore_1
    //   5: iconst_0
    //   6: istore_3
    //   7: iconst_0
    //   8: istore 7
    //   10: iconst_0
    //   11: istore 6
    //   13: iconst_0
    //   14: istore 4
    //   16: iload 7
    //   18: istore_2
    //   19: aload_0
    //   20: invokespecial 335	org/vidogram/messenger/f:v	()Z
    //   23: ifne +5 -> 28
    //   26: iconst_0
    //   27: ireturn
    //   28: iload 7
    //   30: istore_2
    //   31: getstatic 222	org/vidogram/messenger/ApplicationLoader:a	Landroid/content/Context;
    //   34: invokevirtual 339	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   37: astore 8
    //   39: aload 8
    //   41: getstatic 345	android/provider/ContactsContract$RawContacts:CONTENT_URI	Landroid/net/Uri;
    //   44: iconst_1
    //   45: anewarray 178	java/lang/String
    //   48: dup
    //   49: iconst_0
    //   50: ldc_w 629
    //   53: aastore
    //   54: aconst_null
    //   55: aconst_null
    //   56: aconst_null
    //   57: invokevirtual 594	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   60: astore 8
    //   62: aload 8
    //   64: ifnull +173 -> 237
    //   67: iload 4
    //   69: istore_2
    //   70: iload 6
    //   72: istore_3
    //   73: new 312	java/lang/StringBuilder
    //   76: dup
    //   77: invokespecial 380	java/lang/StringBuilder:<init>	()V
    //   80: astore 9
    //   82: iload 4
    //   84: istore_2
    //   85: iload 6
    //   87: istore_3
    //   88: aload 8
    //   90: invokeinterface 599 1 0
    //   95: ifeq +77 -> 172
    //   98: iload 4
    //   100: istore_2
    //   101: iload 6
    //   103: istore_3
    //   104: aload 9
    //   106: aload 8
    //   108: aload 8
    //   110: ldc_w 629
    //   113: invokeinterface 633 2 0
    //   118: invokeinterface 637 2 0
    //   123: invokevirtual 323	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   126: pop
    //   127: goto -45 -> 82
    //   130: astore 9
    //   132: iload_2
    //   133: istore_1
    //   134: ldc_w 393
    //   137: aload 9
    //   139: invokestatic 398	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   142: iload_1
    //   143: istore_2
    //   144: aload 8
    //   146: ifnull +162 -> 308
    //   149: iload_1
    //   150: istore_2
    //   151: aload 8
    //   153: invokeinterface 615 1 0
    //   158: iload_1
    //   159: ireturn
    //   160: astore 8
    //   162: ldc_w 393
    //   165: aload 8
    //   167: invokestatic 398	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   170: iload_2
    //   171: ireturn
    //   172: iload 4
    //   174: istore_2
    //   175: iload 6
    //   177: istore_3
    //   178: aload 9
    //   180: invokevirtual 328	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   183: astore 9
    //   185: iload 4
    //   187: istore_2
    //   188: iload 5
    //   190: istore_1
    //   191: iload 6
    //   193: istore_3
    //   194: aload_0
    //   195: getfield 154	org/vidogram/messenger/f:s	Ljava/lang/String;
    //   198: invokevirtual 310	java/lang/String:length	()I
    //   201: ifeq +26 -> 227
    //   204: iload 4
    //   206: istore_2
    //   207: iload 5
    //   209: istore_1
    //   210: iload 6
    //   212: istore_3
    //   213: aload_0
    //   214: getfield 154	org/vidogram/messenger/f:s	Ljava/lang/String;
    //   217: aload 9
    //   219: invokevirtual 640	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   222: ifne +5 -> 227
    //   225: iconst_1
    //   226: istore_1
    //   227: iload_1
    //   228: istore_2
    //   229: iload_1
    //   230: istore_3
    //   231: aload_0
    //   232: aload 9
    //   234: putfield 154	org/vidogram/messenger/f:s	Ljava/lang/String;
    //   237: iload_1
    //   238: istore_2
    //   239: aload 8
    //   241: ifnull +67 -> 308
    //   244: iload_1
    //   245: istore_2
    //   246: aload 8
    //   248: invokeinterface 615 1 0
    //   253: iload_1
    //   254: ireturn
    //   255: astore 9
    //   257: aconst_null
    //   258: astore 8
    //   260: iload_3
    //   261: istore_1
    //   262: aload 8
    //   264: ifnull +12 -> 276
    //   267: iload_1
    //   268: istore_2
    //   269: aload 8
    //   271: invokeinterface 615 1 0
    //   276: iload_1
    //   277: istore_2
    //   278: aload 9
    //   280: athrow
    //   281: astore 8
    //   283: goto -121 -> 162
    //   286: astore 9
    //   288: iload_3
    //   289: istore_1
    //   290: goto -28 -> 262
    //   293: astore 9
    //   295: goto -33 -> 262
    //   298: astore 9
    //   300: aconst_null
    //   301: astore 8
    //   303: iconst_0
    //   304: istore_1
    //   305: goto -171 -> 134
    //   308: iload_2
    //   309: ireturn
    //
    // Exception table:
    //   from	to	target	type
    //   73	82	130	java/lang/Exception
    //   88	98	130	java/lang/Exception
    //   104	127	130	java/lang/Exception
    //   178	185	130	java/lang/Exception
    //   194	204	130	java/lang/Exception
    //   213	225	130	java/lang/Exception
    //   231	237	130	java/lang/Exception
    //   151	158	160	java/lang/Exception
    //   246	253	160	java/lang/Exception
    //   39	62	255	finally
    //   19	26	281	java/lang/Exception
    //   31	39	281	java/lang/Exception
    //   269	276	281	java/lang/Exception
    //   278	281	281	java/lang/Exception
    //   73	82	286	finally
    //   88	98	286	finally
    //   104	127	286	finally
    //   178	185	286	finally
    //   194	204	286	finally
    //   213	225	286	finally
    //   231	237	286	finally
    //   134	142	293	finally
    //   39	62	298	java/lang/Exception
  }

  private HashMap<Integer, a> s()
  {
    HashMap localHashMap1 = new HashMap();
    while (true)
    {
      Object localObject6;
      HashMap localHashMap2;
      Object localObject7;
      Object localObject8;
      Object localObject4;
      int i1;
      Object localObject5;
      Object localObject3;
      try
      {
        if (!v())
          return localHashMap1;
        localObject6 = ApplicationLoader.a.getContentResolver();
        localHashMap2 = new HashMap();
        localObject7 = new ArrayList();
        localObject8 = ((ContentResolver)localObject6).query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, this.D, null, null, null);
        if (localObject8 == null)
          break label469;
        if (((Cursor)localObject8).getCount() <= 0)
          break label462;
        if (!((Cursor)localObject8).moveToNext())
          break label462;
        String str = ((Cursor)localObject8).getString(1);
        if ((str == null) || (str.length() == 0))
          continue;
        localObject4 = b.a(str, true);
        if (((String)localObject4).length() == 0)
          continue;
        if (!((String)localObject4).startsWith("+"))
          break label1108;
        str = ((String)localObject4).substring(1);
        if (localHashMap2.containsKey(str))
          continue;
        Integer localInteger = Integer.valueOf(((Cursor)localObject8).getInt(0));
        if (((ArrayList)localObject7).contains(localInteger))
          continue;
        ((ArrayList)localObject7).add(localInteger);
        i1 = ((Cursor)localObject8).getInt(2);
        localObject5 = (a)localHashMap1.get(localInteger);
        localObject3 = localObject5;
        if (localObject5 != null)
          continue;
        localObject3 = new a();
        ((a)localObject3).f = "";
        ((a)localObject3).g = "";
        ((a)localObject3).a = localInteger.intValue();
        localHashMap1.put(localInteger, localObject3);
        ((a)localObject3).d.add(str);
        ((a)localObject3).b.add(localObject4);
        ((a)localObject3).e.add(Integer.valueOf(0));
        if (i1 == 0)
        {
          ((a)localObject3).c.add(((Cursor)localObject8).getString(3));
          localHashMap2.put(str, localObject3);
          continue;
        }
      }
      catch (Exception localException1)
      {
        n.a("tmessages", localException1);
        localHashMap1.clear();
        return localHashMap1;
      }
      if (i1 == 1)
      {
        ((a)localObject3).c.add(r.a("PhoneHome", 2131231664));
        continue;
      }
      if (i1 == 2)
      {
        ((a)localObject3).c.add(r.a("PhoneMobile", 2131231666));
        continue;
      }
      if (i1 == 3)
      {
        ((a)localObject3).c.add(r.a("PhoneWork", 2131231671));
        continue;
      }
      if (i1 == 12)
      {
        ((a)localObject3).c.add(r.a("PhoneMain", 2131231665));
        continue;
      }
      ((a)localObject3).c.add(r.a("PhoneOther", 2131231670));
      continue;
      label462: ((Cursor)localObject8).close();
      label469: Object localObject1 = TextUtils.join(",", (Iterable)localObject7);
      localObject1 = ((ContentResolver)localObject6).query(ContactsContract.Data.CONTENT_URI, this.E, "contact_id IN (" + (String)localObject1 + ") AND " + "mimetype" + " = '" + "vnd.android.cursor.item/name" + "'", null, null);
      if ((localObject1 != null) && (((Cursor)localObject1).getCount() > 0))
      {
        while (((Cursor)localObject1).moveToNext())
        {
          i1 = ((Cursor)localObject1).getInt(0);
          localObject3 = ((Cursor)localObject1).getString(1);
          localObject4 = ((Cursor)localObject1).getString(2);
          localObject5 = ((Cursor)localObject1).getString(3);
          localObject7 = ((Cursor)localObject1).getString(4);
          localObject8 = (a)localHashMap1.get(Integer.valueOf(i1));
          if ((localObject8 == null) || (((a)localObject8).f.length() != 0) || (((a)localObject8).g.length() != 0))
            continue;
          ((a)localObject8).f = ((String)localObject3);
          ((a)localObject8).g = ((String)localObject4);
          if (((a)localObject8).f == null)
            ((a)localObject8).f = "";
          if ((localObject7 != null) && (((String)localObject7).length() != 0))
            if (((a)localObject8).f.length() == 0)
              break label797;
          label797: for (((a)localObject8).f = (((a)localObject8).f + " " + (String)localObject7); ; ((a)localObject8).f = ((String)localObject7))
          {
            if (((a)localObject8).g == null)
              ((a)localObject8).g = "";
            if ((((a)localObject8).g.length() != 0) || (((a)localObject8).f.length() != 0) || (localObject5 == null) || (((String)localObject5).length() == 0))
              break;
            ((a)localObject8).f = ((String)localObject5);
            break;
          }
        }
        ((Cursor)localObject1).close();
      }
      while (true)
      {
        try
        {
          localObject4 = ((ContentResolver)localObject6).query(ContactsContract.RawContacts.CONTENT_URI, new String[] { "display_name", "sync1", "contact_id" }, "account_type = 'com.whatsapp'", null, null);
          if (localObject4 == null)
            break;
          if (!((Cursor)localObject4).moveToNext())
            break label1092;
          localObject1 = ((Cursor)localObject4).getString(1);
          if ((localObject1 == null) || (((String)localObject1).length() == 0))
            continue;
          boolean bool = ((String)localObject1).startsWith("+");
          localObject3 = Utilities.c((String)localObject1);
          if ((localObject3 == null) || (((String)localObject3).length() == 0))
            continue;
          if (bool)
            break label1102;
          localObject1 = "+" + (String)localObject3;
          if (localHashMap2.containsKey(localObject3))
            continue;
          localObject5 = ((Cursor)localObject4).getString(0);
          if (TextUtils.isEmpty((CharSequence)localObject5))
            continue;
          localObject6 = new a();
          ((a)localObject6).f = ((String)localObject5);
          ((a)localObject6).g = "";
          ((a)localObject6).a = ((Cursor)localObject4).getInt(2);
          localHashMap1.put(Integer.valueOf(((a)localObject6).a), localObject6);
          ((a)localObject6).e.add(Integer.valueOf(0));
          ((a)localObject6).d.add(localObject3);
          ((a)localObject6).b.add(localObject1);
          ((a)localObject6).c.add(r.a("PhoneMobile", 2131231666));
          localHashMap2.put(localObject3, localObject6);
          continue;
        }
        catch (Exception localException2)
        {
          n.a("tmessages", localException2);
        }
        break;
        label1092: ((Cursor)localObject4).close();
        break;
        label1102: localObject2 = localObject3;
      }
      label1108: Object localObject2 = localObject4;
    }
  }

  private void t()
  {
    try
    {
      if (ApplicationLoader.a.getSharedPreferences("mainconfig", 0).getLong("lastReloadStatusTime", 0L) < System.currentTimeMillis() - 86400000L)
        k();
      return;
    }
    catch (Exception localException)
    {
      n.a("tmessages", localException);
    }
  }

  private void u()
  {
    try
    {
      ApplicationLoader.a.getSharedPreferences("mainconfig", 0).edit().putLong("lastReloadStatusTime", System.currentTimeMillis()).commit();
      return;
    }
    catch (Exception localException)
    {
      n.a("tmessages", localException);
    }
  }

  // ERROR //
  private boolean v()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: getstatic 756	android/os/Build$VERSION:SDK_INT	I
    //   5: bipush 23
    //   7: if_icmplt +19 -> 26
    //   10: getstatic 222	org/vidogram/messenger/ApplicationLoader:a	Landroid/content/Context;
    //   13: ldc_w 758
    //   16: invokevirtual 761	android/content/Context:checkSelfPermission	(Ljava/lang/String;)I
    //   19: ifne +5 -> 24
    //   22: iconst_1
    //   23: ireturn
    //   24: iconst_0
    //   25: ireturn
    //   26: getstatic 222	org/vidogram/messenger/ApplicationLoader:a	Landroid/content/Context;
    //   29: invokevirtual 339	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   32: getstatic 643	android/provider/ContactsContract$CommonDataKinds$Phone:CONTENT_URI	Landroid/net/Uri;
    //   35: aload_0
    //   36: getfield 188	org/vidogram/messenger/f:D	[Ljava/lang/String;
    //   39: aconst_null
    //   40: aconst_null
    //   41: aconst_null
    //   42: invokevirtual 594	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   45: astore_2
    //   46: aload_2
    //   47: astore_3
    //   48: aload_3
    //   49: ifnull +16 -> 65
    //   52: aload_3
    //   53: astore_2
    //   54: aload_3
    //   55: invokeinterface 646 1 0
    //   60: istore_1
    //   61: iload_1
    //   62: ifne +26 -> 88
    //   65: aload_3
    //   66: ifnull +9 -> 75
    //   69: aload_3
    //   70: invokeinterface 615 1 0
    //   75: iconst_0
    //   76: ireturn
    //   77: astore_2
    //   78: ldc_w 393
    //   81: aload_2
    //   82: invokestatic 398	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   85: goto -10 -> 75
    //   88: aload_3
    //   89: ifnull +9 -> 98
    //   92: aload_3
    //   93: invokeinterface 615 1 0
    //   98: iconst_1
    //   99: ireturn
    //   100: astore_2
    //   101: ldc_w 393
    //   104: aload_2
    //   105: invokestatic 398	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   108: goto -10 -> 98
    //   111: astore 4
    //   113: aconst_null
    //   114: astore_3
    //   115: aload_3
    //   116: astore_2
    //   117: ldc_w 393
    //   120: aload 4
    //   122: invokestatic 398	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   125: aload_3
    //   126: ifnull -28 -> 98
    //   129: aload_3
    //   130: invokeinterface 615 1 0
    //   135: goto -37 -> 98
    //   138: astore_2
    //   139: ldc_w 393
    //   142: aload_2
    //   143: invokestatic 398	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   146: goto -48 -> 98
    //   149: astore_2
    //   150: aload_3
    //   151: ifnull +9 -> 160
    //   154: aload_3
    //   155: invokeinterface 615 1 0
    //   160: aload_2
    //   161: athrow
    //   162: astore_3
    //   163: ldc_w 393
    //   166: aload_3
    //   167: invokestatic 398	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   170: goto -10 -> 160
    //   173: astore 4
    //   175: aload_2
    //   176: astore_3
    //   177: aload 4
    //   179: astore_2
    //   180: goto -30 -> 150
    //   183: astore 4
    //   185: goto -70 -> 115
    //
    // Exception table:
    //   from	to	target	type
    //   69	75	77	java/lang/Exception
    //   92	98	100	java/lang/Exception
    //   26	46	111	java/lang/Throwable
    //   129	135	138	java/lang/Exception
    //   26	46	149	finally
    //   154	160	162	java/lang/Exception
    //   54	61	173	finally
    //   117	125	173	finally
    //   54	61	183	java/lang/Throwable
  }

  private void w()
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.addAll(this.e);
    Utilities.f.b(new Runnable(localArrayList)
    {
      public void run()
      {
        f.b(f.this, this.a);
      }
    });
  }

  public long a(g.vw arg1, boolean paramBoolean)
  {
    long l2 = -1L;
    if ((this.l == null) || (??? == null) || (???.i == null) || (???.i.length() == 0));
    do
      return -1L;
    while (!v());
    synchronized (this.q)
    {
      this.o = true;
      ??? = ApplicationLoader.a.getContentResolver();
      if (!paramBoolean);
    }
    try
    {
      ((ContentResolver)???).delete(ContactsContract.RawContacts.CONTENT_URI.buildUpon().appendQueryParameter("caller_is_syncadapter", "true").appendQueryParameter("account_name", this.l.name).appendQueryParameter("account_type", this.l.type).build(), "sync2 = " + ???.d, null);
      localArrayList = new ArrayList();
      ContentProviderOperation.Builder localBuilder = ContentProviderOperation.newInsert(ContactsContract.RawContacts.CONTENT_URI);
      localBuilder.withValue("account_name", this.l.name);
      localBuilder.withValue("account_type", this.l.type);
      localBuilder.withValue("sync1", ???.i);
      localBuilder.withValue("sync2", Integer.valueOf(???.d));
      localArrayList.add(localBuilder.build());
      localBuilder = ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI);
      localBuilder.withValueBackReference("raw_contact_id", 0);
      localBuilder.withValue("mimetype", "vnd.android.cursor.item/name");
      localBuilder.withValue("data2", ???.e);
      localBuilder.withValue("data3", ???.f);
      localArrayList.add(localBuilder.build());
      localBuilder = ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI);
      localBuilder.withValueBackReference("raw_contact_id", 0);
      localBuilder.withValue("mimetype", "vnd.android.cursor.item/vnd.org.telegram.messenger.android.profile");
      localBuilder.withValue("data1", Integer.valueOf(???.d));
      localBuilder.withValue("data2", "Telegram Profile");
      localBuilder.withValue("data3", "+" + ???.i);
      localBuilder.withValue("data4", Integer.valueOf(???.d));
      localArrayList.add(localBuilder.build());
    }
    catch (Exception localException)
    {
      try
      {
        ArrayList localArrayList;
        ??? = ((ContentResolver)???).applyBatch("com.android.contacts", localArrayList);
        l1 = l2;
        if (??? != null)
        {
          l1 = l2;
          if (???.length > 0)
          {
            l1 = l2;
            if (???[0].uri != null)
              l1 = Long.parseLong(???[0].uri.getLastPathSegment());
          }
        }
        synchronized (this.q)
        {
          this.o = false;
          return l1;
        }
        ??? = finally;
        monitorexit;
        throw ???;
        localException = localException;
        n.a("tmessages", localException);
      }
      catch (Exception )
      {
        while (true)
        {
          n.a("tmessages", ???);
          long l1 = l2;
        }
      }
    }
  }

  public ArrayList<g.ba> a(boolean paramBoolean)
  {
    if (paramBoolean)
      return this.C;
    return this.B;
  }

  public HashMap<Integer, a> a(HashMap<Integer, a> paramHashMap)
  {
    HashMap localHashMap = new HashMap();
    paramHashMap = paramHashMap.entrySet().iterator();
    while (paramHashMap.hasNext())
    {
      Object localObject = (Map.Entry)paramHashMap.next();
      a locala = new a();
      localObject = (a)((Map.Entry)localObject).getValue();
      locala.e.addAll(((a)localObject).e);
      locala.b.addAll(((a)localObject).b);
      locala.c.addAll(((a)localObject).c);
      locala.d.addAll(((a)localObject).d);
      locala.f = ((a)localObject).f;
      locala.g = ((a)localObject).g;
      locala.a = ((a)localObject).a;
      localHashMap.put(Integer.valueOf(locala.a), locala);
    }
    return (HashMap<Integer, a>)localHashMap;
  }

  public void a(ArrayList<g.vw> paramArrayList)
  {
    if ((paramArrayList == null) || (paramArrayList.isEmpty()))
      return;
    g.fy localfy = new g.fy();
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = paramArrayList.iterator();
    while (localIterator.hasNext())
    {
      g.vw localvw = (g.vw)localIterator.next();
      g.ap localap = v.a(localvw);
      if (localap == null)
        continue;
      localArrayList.add(Integer.valueOf(localvw.d));
      localfy.c.add(localap);
    }
    ConnectionsManager.a().a(localfy, new c(localArrayList, paramArrayList)
    {
    });
  }

  public void a(ArrayList<g.fw> paramArrayList, ArrayList<g.vw> paramArrayList1, int paramInt)
  {
    a.a(new Runnable(paramArrayList1, paramInt, paramArrayList)
    {
      public void run()
      {
        boolean bool = true;
        int k = 0;
        Object localObject1 = v.a();
        Object localObject2 = this.a;
        if (this.b == 1);
        int i;
        while (true)
        {
          ((v)localObject1).a((ArrayList)localObject2, bool);
          localObject1 = new HashMap();
          bool = this.c.isEmpty();
          i = k;
          if (f.this.e.isEmpty())
            break;
          i = 0;
          while (true)
            if (i < this.c.size())
            {
              localObject2 = (g.fw)this.c.get(i);
              int j = i;
              if (f.this.f.get(((g.fw)localObject2).c) != null)
              {
                this.c.remove(i);
                j = i - 1;
              }
              i = j + 1;
              continue;
              bool = false;
              break;
            }
          this.c.addAll(f.this.e);
          i = k;
        }
        while (i < this.c.size())
        {
          localObject2 = v.a().a(Integer.valueOf(((g.fw)this.c.get(i)).c));
          if (localObject2 != null)
            ((HashMap)localObject1).put(Integer.valueOf(((g.vw)localObject2).d), localObject2);
          i += 1;
        }
        Utilities.c.b(new Runnable((HashMap)localObject1, bool)
        {
          public void run()
          {
            n.a("tmessages", "done loading contacts");
            if ((f.20.this.b == 1) && ((f.20.this.c.isEmpty()) || (Math.abs(System.currentTimeMillis() / 1000L - ad.r) >= 86400L)))
            {
              f.this.a(false, true);
              return;
            }
            if (f.20.this.b == 0)
            {
              ad.r = (int)(System.currentTimeMillis() / 1000L);
              ad.a(false);
            }
            Object localObject1 = f.20.this.c.iterator();
            while (((Iterator)localObject1).hasNext())
            {
              localObject2 = (g.fw)((Iterator)localObject1).next();
              if ((this.a.get(Integer.valueOf(((g.fw)localObject2).c)) != null) || (((g.fw)localObject2).c == ad.c()))
                continue;
              f.this.a(false, true);
              n.a("tmessages", "contacts are broken, load from server");
              return;
            }
            Object localObject3;
            if (f.20.this.b != 1)
            {
              w.a().a(f.20.this.a, null, true, true);
              localObject1 = w.a();
              localObject2 = f.20.this.c;
              if (f.20.this.b != 2);
              for (boolean bool = true; ; bool = false)
              {
                ((w)localObject1).a((ArrayList)localObject2, bool);
                Collections.sort(f.20.this.c, new Comparator()
                {
                  public int a(g.fw paramfw1, g.fw paramfw2)
                  {
                    if (paramfw1.c > paramfw2.c)
                      return 1;
                    if (paramfw1.c < paramfw2.c)
                      return -1;
                    return 0;
                  }
                });
                localObject1 = new StringBuilder();
                localObject2 = f.20.this.c.iterator();
                while (((Iterator)localObject2).hasNext())
                {
                  localObject3 = (g.fw)((Iterator)localObject2).next();
                  if (((StringBuilder)localObject1).length() != 0)
                    ((StringBuilder)localObject1).append(",");
                  ((StringBuilder)localObject1).append(((g.fw)localObject3).c);
                }
              }
              ad.f = Utilities.e(((StringBuilder)localObject1).toString());
              ad.a(false);
            }
            Collections.sort(f.20.this.c, new Comparator()
            {
              public int a(g.fw paramfw1, g.fw paramfw2)
              {
                paramfw1 = (g.vw)f.20.1.this.a.get(Integer.valueOf(paramfw1.c));
                paramfw2 = (g.vw)f.20.1.this.a.get(Integer.valueOf(paramfw2.c));
                return ae.d(paramfw1).compareTo(ae.d(paramfw2));
              }
            });
            SparseArray localSparseArray = new SparseArray();
            HashMap localHashMap1 = new HashMap();
            HashMap localHashMap2 = new HashMap();
            ArrayList localArrayList2 = new ArrayList();
            ArrayList localArrayList3 = new ArrayList();
            if (!f.d(f.this));
            for (Object localObject2 = new HashMap(); ; localObject2 = null)
            {
              int i = 0;
              while (i < f.20.this.c.size())
              {
                g.fw localfw = (g.fw)f.20.this.c.get(i);
                g.vw localvw = (g.vw)this.a.get(Integer.valueOf(localfw.c));
                if (localvw == null)
                {
                  i += 1;
                  continue;
                }
                localSparseArray.put(localfw.c, localfw);
                if (localObject2 != null)
                  ((HashMap)localObject2).put(localvw.i, localfw);
                localObject3 = ae.d(localvw);
                localObject1 = localObject3;
                if (((String)localObject3).length() > 1)
                  localObject1 = ((String)localObject3).substring(0, 1);
                if (((String)localObject1).length() == 0);
                for (localObject1 = "#"; ; localObject1 = ((String)localObject1).toUpperCase())
                {
                  localObject3 = (String)f.e(f.this).get(localObject1);
                  if (localObject3 != null)
                    localObject1 = localObject3;
                  ArrayList localArrayList1 = (ArrayList)localHashMap1.get(localObject1);
                  localObject3 = localArrayList1;
                  if (localArrayList1 == null)
                  {
                    localObject3 = new ArrayList();
                    localHashMap1.put(localObject1, localObject3);
                    localArrayList2.add(localObject1);
                  }
                  ((ArrayList)localObject3).add(localfw);
                  if (!localvw.p)
                    break;
                  localArrayList1 = (ArrayList)localHashMap2.get(localObject1);
                  localObject3 = localArrayList1;
                  if (localArrayList1 == null)
                  {
                    localObject3 = new ArrayList();
                    localHashMap2.put(localObject1, localObject3);
                    localArrayList3.add(localObject1);
                  }
                  ((ArrayList)localObject3).add(localfw);
                  break;
                }
              }
              Collections.sort(localArrayList2, new Comparator()
              {
                public int a(String paramString1, String paramString2)
                {
                  int i = paramString1.charAt(0);
                  int j = paramString2.charAt(0);
                  if (i == 35)
                    return 1;
                  if (j == 35)
                    return -1;
                  return paramString1.compareTo(paramString2);
                }
              });
              Collections.sort(localArrayList3, new Comparator()
              {
                public int a(String paramString1, String paramString2)
                {
                  int i = paramString1.charAt(0);
                  int j = paramString2.charAt(0);
                  if (i == 35)
                    return 1;
                  if (j == 35)
                    return -1;
                  return paramString1.compareTo(paramString2);
                }
              });
              a.a(new Runnable(localSparseArray, localHashMap1, localHashMap2, localArrayList2, localArrayList3)
              {
                public void run()
                {
                  f.this.e = f.20.this.c;
                  f.this.f = this.a;
                  f.this.g = this.b;
                  f.this.i = this.c;
                  f.this.h = this.d;
                  f.this.j = this.e;
                  if (f.20.this.b != 2);
                  synchronized (f.q())
                  {
                    f.a(f.this, false);
                    f.f(f.this);
                    f.a(f.this, f.20.this.c);
                    y.a().a(y.k, new Object[0]);
                    if ((f.20.this.b != 1) && (!f.20.1.this.b))
                    {
                      f.g(f.this);
                      return;
                    }
                  }
                  f.h(f.this);
                }
              });
              if ((!f.c(f.this).isEmpty()) && (f.this.a) && (f.d(f.this)))
              {
                f.a(f.this, f.c(f.this), null, null, null);
                f.c(f.this).clear();
              }
              if (localObject2 != null)
              {
                a.a(new Runnable((HashMap)localObject2)
                {
                  public void run()
                  {
                    Utilities.d.b(new Runnable()
                    {
                      public void run()
                      {
                        f.this.k = f.20.1.6.this.a;
                      }
                    });
                    if (f.i(f.this))
                      return;
                    f.b(f.this, true);
                    w.a().h();
                  }
                });
                return;
              }
              f.this.a = true;
              return;
            }
          }
        });
      }
    });
  }

  protected void a(HashMap<Integer, a> paramHashMap, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4)
  {
    if ((!paramBoolean2) && (!this.r))
      return;
    Utilities.d.b(new Runnable(paramHashMap, paramBoolean3, paramBoolean1, paramBoolean2, paramBoolean4)
    {
      public void run()
      {
        Object localObject5 = new HashMap();
        Object localObject1 = this.a.entrySet().iterator();
        Object localObject2;
        int i;
        while (((Iterator)localObject1).hasNext())
        {
          localObject2 = (f.a)((Map.Entry)((Iterator)localObject1).next()).getValue();
          i = 0;
          while (i < ((f.a)localObject2).d.size())
          {
            ((HashMap)localObject5).put(((f.a)localObject2).d.get(i), localObject2);
            i += 1;
          }
        }
        n.a("tmessages", "start read contacts from phone");
        if (!this.b)
          f.a(f.this);
        HashMap localHashMap1 = f.b(f.this);
        HashMap localHashMap2 = new HashMap();
        int k = this.a.size();
        ArrayList localArrayList = new ArrayList();
        f.a locala;
        Object localObject3;
        if (!this.a.isEmpty())
        {
          Iterator localIterator = localHashMap1.entrySet().iterator();
          if (localIterator.hasNext())
          {
            localObject1 = (Map.Entry)localIterator.next();
            localObject2 = (Integer)((Map.Entry)localObject1).getKey();
            locala = (f.a)((Map.Entry)localObject1).getValue();
            localObject1 = (f.a)this.a.get(localObject2);
            if (localObject1 != null)
              break label1606;
            i = 0;
            if (i >= locala.d.size())
              break label1606;
            localObject3 = (f.a)((HashMap)localObject5).get(locala.d.get(i));
            if (localObject3 != null)
            {
              i = ((f.a)localObject3).a;
              localObject1 = localObject3;
              localObject2 = Integer.valueOf(i);
            }
          }
        }
        label797: label804: label811: label1458: label1465: label1472: label1606: 
        while (true)
        {
          label350: int j;
          label361: Object localObject4;
          if ((localObject1 != null) && (((TextUtils.isEmpty(locala.f)) && (!((f.a)localObject1).f.equals(locala.f))) || ((!TextUtils.isEmpty(locala.g)) && (!((f.a)localObject1).g.equals(locala.g)))))
          {
            i = 1;
            if ((localObject1 != null) && (i == 0))
              break label603;
            j = 0;
            if (j >= locala.b.size())
              break label585;
            localObject3 = (String)locala.d.get(j);
            localHashMap2.put(localObject3, locala);
            if (localObject1 == null)
              break label475;
            int m = ((f.a)localObject1).d.indexOf(localObject3);
            if (m == -1)
              break label475;
            localObject4 = (Integer)((f.a)localObject1).e.get(m);
            locala.e.set(j, localObject4);
            if (((Integer)localObject4).intValue() != 1)
              break label475;
          }
          while (true)
          {
            j += 1;
            break label361;
            i += 1;
            break;
            i = 0;
            break label350;
            label475: if ((!this.c) || ((i == 0) && (f.this.k.containsKey(localObject3))))
              continue;
            localObject3 = new g.lc();
            ((g.lc)localObject3).c = locala.a;
            ((g.lc)localObject3).c |= j << 32;
            ((g.lc)localObject3).e = locala.f;
            ((g.lc)localObject3).f = locala.g;
            ((g.lc)localObject3).d = ((String)locala.b.get(j));
            localArrayList.add(localObject3);
          }
          label585: if (localObject1 == null)
            break;
          this.a.remove(localObject2);
          break;
          label603: i = 0;
          if (i < locala.b.size())
          {
            localObject3 = (String)locala.d.get(i);
            localHashMap2.put(localObject3, locala);
            j = ((f.a)localObject1).d.indexOf(localObject3);
            if (j == -1)
              if (this.c)
              {
                localObject3 = (g.fw)f.this.k.get(localObject3);
                if (localObject3 == null)
                  break label811;
                g.vw localvw = v.a().a(Integer.valueOf(((g.fw)localObject3).c));
                if (localvw == null)
                  break label811;
                if (localvw.e == null)
                  break label797;
                localObject3 = localvw.e;
                label722: if (localvw.f == null)
                  break label804;
                localObject4 = localvw.f;
                label737: if ((localvw == null) || (((!((String)localObject3).equals(locala.f)) || (!((String)localObject4).equals(locala.g))) && ((!TextUtils.isEmpty(locala.f)) || (!TextUtils.isEmpty(locala.g)))))
                  break label811;
              }
            while (true)
            {
              i += 1;
              break;
              localObject3 = "";
              break label722;
              localObject4 = "";
              break label737;
              localObject3 = new g.lc();
              ((g.lc)localObject3).c = locala.a;
              ((g.lc)localObject3).c |= i << 32;
              ((g.lc)localObject3).e = locala.f;
              ((g.lc)localObject3).f = locala.g;
              ((g.lc)localObject3).d = ((String)locala.b.get(i));
              localArrayList.add(localObject3);
              continue;
              locala.e.set(i, ((f.a)localObject1).e.get(j));
              ((f.a)localObject1).b.remove(j);
              ((f.a)localObject1).d.remove(j);
              ((f.a)localObject1).e.remove(j);
              ((f.a)localObject1).c.remove(j);
            }
          }
          if (!((f.a)localObject1).b.isEmpty())
            break;
          this.a.remove(localObject2);
          break;
          if ((!this.d) && (this.a.isEmpty()) && (localArrayList.isEmpty()) && (k == localHashMap1.size()))
            n.a("tmessages", "contacts not changed!");
          label1242: label1383: label1398: 
          do
          {
            return;
            if ((this.c) && (!this.a.isEmpty()) && (!localHashMap1.isEmpty()) && (localArrayList.isEmpty()))
              w.a().a(localHashMap1);
            do
            {
              n.a("tmessages", "done processing contacts");
              if (!this.c)
                break label1571;
              if (localArrayList.isEmpty())
                break label1552;
              localObject1 = new HashMap(localHashMap1);
              f.a(f.this, 0);
              j = (int)Math.ceil(localArrayList.size() / 500.0F);
              i = 0;
              while (i < j)
              {
                localObject2 = new ArrayList();
                ((ArrayList)localObject2).addAll(localArrayList.subList(i * 500, Math.min((i + 1) * 500, localArrayList.size())));
                localObject3 = new g.gd();
                ((g.gd)localObject3).c = ((ArrayList)localObject2);
                ((g.gd)localObject3).d = false;
                ConnectionsManager.a().a((org.vidogram.tgnet.f)localObject3, new c((HashMap)localObject1, j, localHashMap2, localHashMap1)
                {
                }
                , 6);
                i += 1;
              }
              break;
            }
            while (!this.c);
            localObject3 = localHashMap1.entrySet().iterator();
            if (((Iterator)localObject3).hasNext())
            {
              localObject1 = (Map.Entry)((Iterator)localObject3).next();
              localObject4 = (f.a)((Map.Entry)localObject1).getValue();
              j = ((Integer)((Map.Entry)localObject1).getKey()).intValue();
              i = 0;
              if (i < ((f.a)localObject4).b.size())
              {
                if (this.e)
                  break label1472;
                localObject1 = (String)((f.a)localObject4).d.get(i);
                localObject1 = (g.fw)f.this.k.get(localObject1);
                if (localObject1 == null)
                  break label1472;
                localObject5 = v.a().a(Integer.valueOf(((g.fw)localObject1).c));
                if (localObject5 == null)
                  break label1472;
                if (((g.vw)localObject5).e == null)
                  break label1458;
                localObject1 = ((g.vw)localObject5).e;
                if (((g.vw)localObject5).f == null)
                  break label1465;
                localObject2 = ((g.vw)localObject5).f;
                if ((localObject5 == null) || (((!((String)localObject1).equals(((f.a)localObject4).f)) || (!((String)localObject2).equals(((f.a)localObject4).g))) && ((!TextUtils.isEmpty(((f.a)localObject4).f)) || (!TextUtils.isEmpty(((f.a)localObject4).g)))))
                  break label1472;
              }
            }
            while (true)
            {
              i += 1;
              break label1292;
              break label1242;
              break;
              localObject1 = "";
              break label1383;
              localObject2 = "";
              break label1398;
              localObject1 = new g.lc();
              ((g.lc)localObject1).c = j;
              ((g.lc)localObject1).c |= i << 32;
              ((g.lc)localObject1).e = ((f.a)localObject4).f;
              ((g.lc)localObject1).f = ((f.a)localObject4).g;
              ((g.lc)localObject1).d = ((String)((f.a)localObject4).b.get(i));
              localArrayList.add(localObject1);
            }
            Utilities.c.b(new Runnable(localHashMap2, localHashMap1)
            {
              public void run()
              {
                f.this.c = this.a;
                f.this.b = this.b;
                f.b(f.this, false);
                f.c(f.this, true);
                if (f.18.this.d)
                  f.this.a = true;
                if ((!f.c(f.this).isEmpty()) && (f.this.a))
                {
                  f.a(f.this, f.c(f.this), null, null, null);
                  f.c(f.this).clear();
                }
                a.a(new Runnable()
                {
                  public void run()
                  {
                    f.a(f.this, f.this.e);
                    y.a().a(y.k, new Object[0]);
                  }
                });
              }
            });
            return;
            Utilities.c.b(new Runnable(localHashMap2, localHashMap1)
            {
              public void run()
              {
                f.this.c = this.a;
                f.this.b = this.b;
                f.b(f.this, false);
                f.c(f.this, true);
                if (f.18.this.d)
                  f.this.a = true;
                if ((!f.c(f.this).isEmpty()) && (f.this.a) && (f.d(f.this)))
                {
                  f.a(f.this, f.c(f.this), null, null, null);
                  f.c(f.this).clear();
                }
              }
            });
          }
          while (localHashMap1.isEmpty());
          w.a().a(localHashMap1);
          return;
        }
      }
    });
  }

  public void a(g.vw paramvw)
  {
    if ((paramvw == null) || (paramvw.i == null))
      return;
    g.gd localgd = new g.gd();
    ArrayList localArrayList = new ArrayList();
    g.lc locallc = new g.lc();
    locallc.d = paramvw.i;
    if (!locallc.d.startsWith("+"))
      locallc.d = ("+" + locallc.d);
    locallc.e = paramvw.e;
    locallc.f = paramvw.f;
    locallc.c = 0L;
    localArrayList.add(locallc);
    localgd.c = localArrayList;
    localgd.d = false;
    ConnectionsManager.a().a(localgd, new c()
    {
    }
    , 6);
  }

  public void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    synchronized (n)
    {
      this.m = true;
      if (paramBoolean1)
      {
        n.a("tmessages", "load contacts from cache");
        w.a().i();
        return;
      }
    }
    n.a("tmessages", "load contacts from server");
    g.ga localga = new g.ga();
    if (paramBoolean2);
    for (??? = ""; ; ??? = ad.f)
    {
      localga.c = ((String)???);
      ConnectionsManager.a().a(localga, new c()
      {
      });
      return;
    }
  }

  public void b()
  {
    this.b.clear();
    this.c.clear();
    this.d.clear();
    this.e.clear();
    this.f.clear();
    this.g.clear();
    this.i.clear();
    this.h.clear();
    this.j.clear();
    this.t.clear();
    this.k.clear();
    this.m = false;
    this.p = false;
    this.a = false;
    this.r = false;
    this.s = "";
    this.x = 0;
    this.y = 0;
    this.z = 0;
    this.A = 0;
    Utilities.d.b(new Runnable()
    {
      public void run()
      {
        f.a(f.this, 0);
      }
    });
    this.B = null;
  }

  public void c()
  {
    Object localObject = ApplicationLoader.a.getSharedPreferences("mainconfig", 0);
    this.u = ((SharedPreferences)localObject).getString("invitetext", null);
    int i1 = ((SharedPreferences)localObject).getInt("invitetexttime", 0);
    if ((!this.v) && ((this.u == null) || (i1 + 86400 < (int)(System.currentTimeMillis() / 1000L))))
    {
      this.v = true;
      localObject = new g.jg();
      ConnectionsManager.a().a((org.vidogram.tgnet.f)localObject, new c()
      {
      }
      , 2);
    }
  }

  public String d()
  {
    if (this.u != null)
      return this.u;
    return r.a("InviteText", 2131231323);
  }

  public void e()
  {
    int i4 = 1;
    int i3 = 1;
    int i2 = 0;
    AccountManager localAccountManager = AccountManager.get(ApplicationLoader.a);
    try
    {
      Account[] arrayOfAccount1 = localAccountManager.getAccountsByType("org.telegram.account");
      if ((arrayOfAccount1 != null) && (arrayOfAccount1.length > 0))
      {
        i1 = 0;
        while (i1 < arrayOfAccount1.length)
        {
          localAccountManager.removeAccount(arrayOfAccount1[i1], null, null);
          i1 += 1;
        }
      }
    }
    catch (Exception localException3)
    {
      int i1;
      n.a("tmessages", localException2);
      Account[] arrayOfAccount2 = localAccountManager.getAccountsByType("org.telegram.messenger");
      Account localAccount;
      if (ad.b())
      {
        i1 = i3;
        if (arrayOfAccount2.length == 1)
        {
          localAccount = arrayOfAccount2[0];
          if (localAccount.name.equals("" + ad.c()))
            break label175;
          i1 = i3;
        }
      }
      while (true)
      {
        i();
        label143: if (i1 != 0)
        {
          i1 = i2;
          try
          {
            while (true)
              if (i1 < arrayOfAccount2.length)
              {
                localAccountManager.removeAccount(arrayOfAccount2[i1], null, null);
                i1 += 1;
                continue;
                label175: this.l = localAccount;
                i1 = 0;
                break;
                i1 = i4;
                if (arrayOfAccount2.length > 0)
                  break label143;
                i1 = 0;
              }
          }
          catch (Exception localException3)
          {
            n.a("tmessages", localException3);
            if (!ad.b());
          }
        }
      }
      try
      {
        this.l = new Account("" + ad.c(), "org.telegram.messenger");
        localAccountManager.addAccountExplicitly(this.l, "", null);
        return;
      }
      catch (Exception localException1)
      {
        n.a("tmessages", localException1);
      }
    }
  }

  public void f()
  {
    try
    {
      AccountManager localAccountManager = AccountManager.get(ApplicationLoader.a);
      Account[] arrayOfAccount = localAccountManager.getAccountsByType("org.telegram.messenger");
      int i1 = 0;
      while (i1 < arrayOfAccount.length)
      {
        localAccountManager.removeAccount(arrayOfAccount[i1], null, null);
        i1 += 1;
      }
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }

  public void g()
  {
    Utilities.d.b(new Runnable()
    {
      public void run()
      {
        if (f.a(f.this))
        {
          n.a("tmessages", "detected contacts change");
          f.a().a(f.a().a(f.a().b), true, false, true, false);
        }
      }
    });
  }

  public void h()
  {
    Utilities.d.b(new Runnable()
    {
      public void run()
      {
        f.a().a(new HashMap(), true, true, true, true);
      }
    });
  }

  public void i()
  {
    synchronized (n)
    {
      if (this.m)
        return;
      this.m = true;
      Utilities.c.b(new Runnable()
      {
        public void run()
        {
          if ((!f.this.e.isEmpty()) || (f.this.a))
            synchronized (f.q())
            {
              f.a(f.this, false);
              return;
            }
          f.this.a(true, false);
        }
      });
      return;
    }
  }

  public boolean j()
  {
    synchronized (n)
    {
      boolean bool = this.m;
      return bool;
    }
  }

  public void k()
  {
    u();
    v.a().e();
    SharedPreferences.Editor localEditor = ApplicationLoader.a.getSharedPreferences("mainconfig", 0).edit();
    localEditor.putBoolean("needGetStatuses", true).commit();
    g.gb localgb = new g.gb();
    ConnectionsManager.a().a(localgb, new c(localEditor)
    {
    });
  }

  public void l()
  {
    Object localObject;
    if (this.x == 0)
    {
      this.x = 1;
      localObject = new g.bl();
      ConnectionsManager.a().a((org.vidogram.tgnet.f)localObject, new c()
      {
      });
    }
    if (this.z == 0)
    {
      this.z = 1;
      localObject = new g.bp();
      ((g.bp)localObject).c = new g.lg();
      ConnectionsManager.a().a((org.vidogram.tgnet.f)localObject, new c()
      {
      });
    }
    if (this.A == 0)
    {
      this.A = 1;
      localObject = new g.bp();
      ((g.bp)localObject).c = new g.lf();
      ConnectionsManager.a().a((org.vidogram.tgnet.f)localObject, new c()
      {
      });
    }
    y.a().a(y.D, new Object[0]);
  }

  public int m()
  {
    return this.y;
  }

  public boolean n()
  {
    return this.x != 2;
  }

  public boolean o()
  {
    return this.z != 2;
  }

  public boolean p()
  {
    return this.A != 2;
  }

  public static class a
  {
    public int a;
    public ArrayList<String> b = new ArrayList();
    public ArrayList<String> c = new ArrayList();
    public ArrayList<String> d = new ArrayList();
    public ArrayList<Integer> e = new ArrayList();
    public String f;
    public String g;
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.f
 * JD-Core Version:    0.6.0
 */