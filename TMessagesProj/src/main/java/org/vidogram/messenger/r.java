package org.vidogram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.format.DateFormat;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import org.vidogram.tgnet.ConnectionsManager;
import org.vidogram.tgnet.g.uo;
import org.vidogram.tgnet.g.va;
import org.vidogram.tgnet.g.vb;
import org.vidogram.tgnet.g.ve;
import org.vidogram.tgnet.g.vw;
import org.vidogram.tgnet.g.vy;

public class r
{
  public static boolean a = false;
  public static int b = 1;
  private static boolean m = false;
  private static volatile r y = null;
  public org.vidogram.messenger.e.a c;
  public org.vidogram.messenger.e.a d;
  public org.vidogram.messenger.e.a e;
  public org.vidogram.messenger.e.a f;
  public org.vidogram.messenger.e.a g;
  public org.vidogram.messenger.e.a h;
  public org.vidogram.messenger.e.a i;
  public org.vidogram.messenger.e.a j;
  public ArrayList<a> k = new ArrayList();
  public HashMap<String, a> l = new HashMap();
  private HashMap<String, b> n = new HashMap();
  private Locale o;
  private Locale p;
  private b q;
  private a r;
  private a s;
  private HashMap<String, String> t = new HashMap();
  private String u;
  private boolean v = false;
  private HashMap<String, String> w;
  private ArrayList<a> x = new ArrayList();

  public r()
  {
    Object localObject1 = new n();
    a(new String[] { "bem", "brx", "da", "de", "el", "en", "eo", "es", "et", "fi", "fo", "gl", "he", "iw", "it", "nb", "nl", "nn", "no", "sv", "af", "bg", "bn", "ca", "eu", "fur", "fy", "gu", "ha", "is", "ku", "lb", "ml", "mr", "nah", "ne", "om", "or", "pa", "pap", "ps", "so", "sq", "sw", "ta", "te", "tk", "ur", "zu", "mn", "gsw", "chr", "rm", "pt", "an", "ast" }, (b)localObject1);
    localObject1 = new f();
    a(new String[] { "cs", "sk" }, (b)localObject1);
    localObject1 = new g();
    a(new String[] { "ff", "fr", "kab" }, (b)localObject1);
    localObject1 = new d();
    a(new String[] { "hr", "ru", "sr", "uk", "be", "bs", "sh" }, (b)localObject1);
    localObject1 = new i();
    a(new String[] { "lv" }, (b)localObject1);
    localObject1 = new j();
    a(new String[] { "lt" }, (b)localObject1);
    localObject1 = new o();
    a(new String[] { "pl" }, (b)localObject1);
    localObject1 = new p();
    a(new String[] { "ro", "mo" }, (b)localObject1);
    localObject1 = new q();
    a(new String[] { "sl" }, (b)localObject1);
    localObject1 = new c();
    a(new String[] { "ar" }, (b)localObject1);
    localObject1 = new k();
    a(new String[] { "mk" }, (b)localObject1);
    localObject1 = new t();
    a(new String[] { "cy" }, (b)localObject1);
    localObject1 = new e();
    a(new String[] { "br" }, (b)localObject1);
    localObject1 = new h();
    a(new String[] { "lag" }, (b)localObject1);
    localObject1 = new r();
    a(new String[] { "shi" }, (b)localObject1);
    localObject1 = new l();
    a(new String[] { "mt" }, (b)localObject1);
    localObject1 = new s();
    a(new String[] { "ga", "se", "sma", "smi", "smj", "smn", "sms" }, (b)localObject1);
    localObject1 = new u();
    a(new String[] { "ak", "am", "bh", "fil", "tl", "guw", "hi", "ln", "mg", "nso", "ti", "wa" }, (b)localObject1);
    localObject1 = new m();
    a(new String[] { "az", "bm", "fa", "ig", "hu", "ja", "kde", "kea", "ko", "my", "ses", "sg", "to", "tr", "vi", "wo", "yo", "zh", "bo", "dz", "id", "jv", "ka", "km", "kn", "ms", "th" }, (b)localObject1);
    localObject1 = new a();
    ((a)localObject1).a = "English";
    ((a)localObject1).b = "English";
    ((a)localObject1).c = "en";
    ((a)localObject1).d = null;
    this.k.add(localObject1);
    this.l.put(((a)localObject1).c, localObject1);
    localObject1 = new a();
    ((a)localObject1).a = "Italiano";
    ((a)localObject1).b = "Italian";
    ((a)localObject1).c = "it";
    ((a)localObject1).d = null;
    this.k.add(localObject1);
    this.l.put(((a)localObject1).c, localObject1);
    localObject1 = new a();
    ((a)localObject1).a = "Español";
    ((a)localObject1).b = "Spanish";
    ((a)localObject1).c = "es";
    this.k.add(localObject1);
    this.l.put(((a)localObject1).c, localObject1);
    localObject1 = new a();
    ((a)localObject1).a = "Deutsch";
    ((a)localObject1).b = "German";
    ((a)localObject1).c = "de";
    ((a)localObject1).d = null;
    this.k.add(localObject1);
    this.l.put(((a)localObject1).c, localObject1);
    localObject1 = new a();
    ((a)localObject1).a = "Nederlands";
    ((a)localObject1).b = "Dutch";
    ((a)localObject1).c = "nl";
    ((a)localObject1).d = null;
    this.k.add(localObject1);
    this.l.put(((a)localObject1).c, localObject1);
    localObject1 = new a();
    ((a)localObject1).a = "فارسی";
    ((a)localObject1).b = "persian";
    ((a)localObject1).c = "fa";
    ((a)localObject1).d = null;
    this.k.add(localObject1);
    this.l.put(((a)localObject1).c, localObject1);
    localObject1 = new a();
    ((a)localObject1).a = "العربية";
    ((a)localObject1).b = "Arabic";
    ((a)localObject1).c = "ar";
    ((a)localObject1).d = null;
    this.k.add(localObject1);
    this.l.put(((a)localObject1).c, localObject1);
    localObject1 = new a();
    ((a)localObject1).a = "Português (Brasil)";
    ((a)localObject1).b = "Portuguese (Brazil)";
    ((a)localObject1).c = "pt_BR";
    ((a)localObject1).d = null;
    this.k.add(localObject1);
    this.l.put(((a)localObject1).c, localObject1);
    localObject1 = new a();
    ((a)localObject1).a = "Português (Portugal)";
    ((a)localObject1).b = "Portuguese (Portugal)";
    ((a)localObject1).c = "pt_PT";
    ((a)localObject1).d = null;
    this.k.add(localObject1);
    this.l.put(((a)localObject1).c, localObject1);
    localObject1 = new a();
    ((a)localObject1).a = "한국어";
    ((a)localObject1).b = "Korean";
    ((a)localObject1).c = "ko";
    ((a)localObject1).d = null;
    this.k.add(localObject1);
    this.l.put(((a)localObject1).c, localObject1);
    g();
    localObject1 = this.x.iterator();
    Object localObject2;
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (a)((Iterator)localObject1).next();
      this.k.add(localObject2);
      this.l.put(((a)localObject2).c, localObject2);
    }
    Collections.sort(this.k, new Comparator()
    {
      public int a(r.a parama1, r.a parama2)
      {
        return parama1.a.compareTo(parama2.a);
      }
    });
    localObject1 = new a();
    this.s = ((a)localObject1);
    ((a)localObject1).a = "System default";
    ((a)localObject1).b = "System default";
    ((a)localObject1).c = null;
    ((a)localObject1).d = null;
    this.k.add(0, localObject1);
    this.p = Locale.getDefault();
    m = DateFormat.is24HourFormat(ApplicationLoader.a);
    while (true)
    {
      try
      {
        localObject1 = ApplicationLoader.a.getSharedPreferences("mainconfig", 0).getString("language", null);
        if (localObject1 == null)
          break label2038;
        localObject2 = (a)this.l.get(localObject1);
        if (localObject2 != null)
        {
          localObject1 = localObject2;
          if (localObject2 != null)
            continue;
          localObject1 = localObject2;
          if (this.p.getLanguage() == null)
            continue;
          localObject1 = (a)this.l.get(this.p.getLanguage());
          localObject2 = localObject1;
          if (localObject1 != null)
            continue;
          localObject2 = (a)this.l.get(a(this.p));
          localObject1 = localObject2;
          if (localObject2 != null)
            continue;
          localObject1 = (a)this.l.get("en");
          a((a)localObject1, bool);
        }
      }
      catch (Exception localException2)
      {
        try
        {
          localObject1 = new IntentFilter("android.intent.action.TIMEZONE_CHANGED");
          ApplicationLoader.a.registerReceiver(new v(null), (IntentFilter)localObject1);
          return;
          localException1 = localException1;
          n.a("tmessages", localException1);
          continue;
        }
        catch (Exception localException2)
        {
          n.a("tmessages", localException2);
          return;
        }
      }
      bool = false;
      continue;
      label2038: bool = false;
      localObject2 = null;
    }
  }

  public static Drawable a(g.vw paramvw, Context paramContext)
  {
    if ((paramvw != null) && (paramvw.k != null) && (paramvw.k.c == 0))
    {
      if (!(paramvw.k instanceof g.ve))
        break label91;
      paramvw.k.c = -100;
    }
    while ((paramvw != null) && (paramvw.k != null) && (paramvw.k.c <= 0) && (v.a().o.containsKey(Integer.valueOf(paramvw.d))))
    {
      return paramContext.getResources().getDrawable(2130838014);
      label91: if ((paramvw.k instanceof g.vb))
      {
        paramvw.k.c = -101;
        continue;
      }
      if (!(paramvw.k instanceof g.va))
        continue;
      paramvw.k.c = -102;
    }
    if ((paramvw == null) || (paramvw.k == null) || (paramvw.k.c == 0) || (ae.a(paramvw)) || ((paramvw instanceof g.uo)))
      return paramContext.getResources().getDrawable(2130837633);
    int i1 = ConnectionsManager.a().b();
    if (paramvw.k.c > i1)
      return paramContext.getResources().getDrawable(2130838014);
    if (paramvw.k.c == -1)
      return paramContext.getResources().getDrawable(2130837933);
    if (paramvw.k.c == -100)
      return paramContext.getResources().getDrawable(2130837936);
    if (paramvw.k.c == -101)
      return paramContext.getResources().getDrawable(2130838201);
    if (paramvw.k.c == -102)
      return paramContext.getResources().getDrawable(2130838200);
    return paramContext.getResources().getDrawable(2130838013);
  }

  private String a(int paramInt)
  {
    switch (paramInt)
    {
    default:
      return "other";
    case 1:
      return "zero";
    case 2:
      return "one";
    case 4:
      return "two";
    case 8:
      return "few";
    case 16:
    }
    return "many";
  }

  public static String a(int paramInt, int[] paramArrayOfInt)
  {
    String str = "";
    int i1 = 0;
    while (paramInt / 1000 > 0)
    {
      str = str + "K";
      i1 = paramInt % 1000 / 100;
      paramInt /= 1000;
    }
    if (paramArrayOfInt != null)
    {
      double d1 = paramInt + i1 / 10.0D;
      int i2 = 0;
      while (i2 < str.length())
      {
        d1 *= 1000.0D;
        i2 += 1;
      }
      paramArrayOfInt[0] = (int)d1;
    }
    if ((i1 != 0) && (str.length() > 0))
    {
      if (str.length() == 2)
        return String.format(Locale.US, "%d.%dM", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i1) });
      return String.format(Locale.US, "%d.%d%s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i1), str });
    }
    if (str.length() == 2)
      return String.format(Locale.US, "%dM", new Object[] { Integer.valueOf(paramInt) });
    return String.format(Locale.US, "%d%s", new Object[] { Integer.valueOf(paramInt), str });
  }

  public static String a(long paramLong)
  {
    int i1;
    if ((a().o.getLanguage().toLowerCase().equals("fa")) || (new itman.robert.a().d(ApplicationLoader.l())))
      try
      {
        Object localObject1 = Calendar.getInstance();
        i1 = ((Calendar)localObject1).get(1);
        ((Calendar)localObject1).setTimeInMillis(paramLong * 1000L);
        int i2 = ((Calendar)localObject1).get(1);
        itman.robert.a.a locala = new itman.robert.a.a();
        locala.a((Calendar)localObject1);
        if (i1 == i2)
          return locala.a(ApplicationLoader.l().getApplicationContext());
        localObject1 = locala.b(ApplicationLoader.l().getApplicationContext());
        return localObject1;
      }
      catch (Exception localException1)
      {
        n.a("tmessages", localException1);
        return "LOC_ERR: formatDateChat";
      }
    try
    {
      Object localObject2 = Calendar.getInstance();
      i1 = ((Calendar)localObject2).get(1);
      ((Calendar)localObject2).setTimeInMillis(paramLong * 1000L);
      if (i1 == ((Calendar)localObject2).get(1))
        return a().i.a(paramLong * 1000L);
      localObject2 = a().j.a(paramLong * 1000L);
      return localObject2;
    }
    catch (Exception localException2)
    {
      n.a("tmessages", localException2);
    }
    return (String)(String)"LOC_ERR: formatDateChat";
  }

  public static String a(String paramString, int paramInt)
  {
    return a().c(paramString, paramInt);
  }

  public static String a(String paramString, int paramInt, Object[] paramArrayOfObject)
  {
    try
    {
      String str2 = (String)a().t.get(paramString);
      String str1 = str2;
      if (str2 == null)
        str1 = ApplicationLoader.a.getString(paramInt);
      if (a().o != null)
        return String.format(a().o, str1, paramArrayOfObject);
      paramArrayOfObject = String.format(str1, paramArrayOfObject);
      return paramArrayOfObject;
    }
    catch (Exception paramArrayOfObject)
    {
      n.a("tmessages", paramArrayOfObject);
    }
    return "LOC_ERR: " + paramString;
  }

  public static String a(String paramString, Object[] paramArrayOfObject)
  {
    try
    {
      if (a().o != null)
        return String.format(a().o, paramString, paramArrayOfObject);
      paramArrayOfObject = String.format(paramString, paramArrayOfObject);
      return paramArrayOfObject;
    }
    catch (Exception paramArrayOfObject)
    {
      n.a("tmessages", paramArrayOfObject);
    }
    return "LOC_ERR: " + paramString;
  }

  private String a(Locale paramLocale)
  {
    if (paramLocale == null)
      return "en";
    String str1 = paramLocale.getLanguage();
    String str2 = paramLocale.getCountry();
    paramLocale = paramLocale.getVariant();
    if ((str1.length() == 0) && (str2.length() == 0))
      return "en";
    StringBuilder localStringBuilder = new StringBuilder(11);
    localStringBuilder.append(str1);
    if ((str2.length() > 0) || (paramLocale.length() > 0))
      localStringBuilder.append('_');
    localStringBuilder.append(str2);
    if (paramLocale.length() > 0)
      localStringBuilder.append('_');
    localStringBuilder.append(paramLocale);
    return localStringBuilder.toString();
  }

  public static String a(g.vw paramvw)
  {
    if ((paramvw != null) && (paramvw.k != null) && (paramvw.k.c == 0))
    {
      if (!(paramvw.k instanceof g.ve))
        break label90;
      paramvw.k.c = -100;
    }
    while ((paramvw != null) && (paramvw.k != null) && (paramvw.k.c <= 0) && (v.a().o.containsKey(Integer.valueOf(paramvw.d))))
    {
      return a("Online", 2131231606);
      label90: if ((paramvw.k instanceof g.vb))
      {
        paramvw.k.c = -101;
        continue;
      }
      if (!(paramvw.k instanceof g.va))
        continue;
      paramvw.k.c = -102;
    }
    if ((paramvw == null) || (paramvw.k == null) || (paramvw.k.c == 0) || (ae.a(paramvw)) || ((paramvw instanceof g.uo)))
      return a("ALongTimeAgo", 2131230761);
    int i1 = ConnectionsManager.a().b();
    if (paramvw.k.c > i1)
      return a("Online", 2131231606);
    if (paramvw.k.c == -1)
      return a("Invisible", 2131231319);
    if (paramvw.k.c == -100)
      return a("Lately", 2131231374);
    if (paramvw.k.c == -101)
      return a("WithinAWeek", 2131231965);
    if (paramvw.k.c == -102)
      return a("WithinAMonth", 2131231964);
    return c(paramvw.k.c);
  }

  private org.vidogram.messenger.e.a a(Locale paramLocale, String paramString1, String paramString2)
  {
    String str;
    if (paramString1 != null)
    {
      str = paramString1;
      if (paramString1.length() != 0);
    }
    else
    {
      str = paramString2;
    }
    try
    {
      paramString1 = org.vidogram.messenger.e.a.a(str, paramLocale);
      return paramString1;
    }
    catch (Exception paramString1)
    {
    }
    return org.vidogram.messenger.e.a.a(paramString2, paramLocale);
  }

  public static r a()
  {
    Object localObject1 = y;
    if (localObject1 == null)
    {
      monitorenter;
      try
      {
        r localr = y;
        localObject1 = localr;
        if (localr == null)
        {
          localObject1 = new r();
          y = (r)localObject1;
        }
        return localObject1;
      }
      finally
      {
        monitorexit;
      }
    }
    return (r)localObject2;
  }

  private void a(String[] paramArrayOfString, b paramb)
  {
    int i2 = paramArrayOfString.length;
    int i1 = 0;
    while (i1 < i2)
    {
      String str = paramArrayOfString[i1];
      this.n.put(str, paramb);
      i1 += 1;
    }
  }

  public static String b(long paramLong)
  {
    int i1;
    int i2;
    int i3;
    int i4;
    if ((a().o.getLanguage().toLowerCase().equals("fa")) || (new itman.robert.a().d(ApplicationLoader.l())))
      try
      {
        Object localObject1 = Calendar.getInstance();
        i1 = ((Calendar)localObject1).get(6);
        i2 = ((Calendar)localObject1).get(1);
        ((Calendar)localObject1).setTimeInMillis(paramLong * 1000L);
        itman.robert.a.a locala = new itman.robert.a.a();
        locala.a((Calendar)localObject1);
        i3 = ((Calendar)localObject1).get(6);
        i4 = ((Calendar)localObject1).get(1);
        if ((i3 == i1) && (i2 == i4))
          return String.format("%s %s", new Object[] { a("TodayAt", 2131231903), a().c.a(new Date(paramLong * 1000L)) });
        if ((i3 + 1 == i1) && (i2 == i4))
          return String.format("%s %s", new Object[] { a("YesterdayAt", 2131231975), a().c.a(new Date(paramLong * 1000L)) });
        if (i2 == i4)
          return a("formatDateAtTime", 2131231995, new Object[] { locala.a(ApplicationLoader.l()), a().c.a(new Date(paramLong * 1000L)) });
        localObject1 = a("formatDateAtTime", 2131231995, new Object[] { locala.c(ApplicationLoader.l()), a().c.a(new Date(paramLong * 1000L)) });
        return localObject1;
      }
      catch (Exception localException1)
      {
        n.a("tmessages", localException1);
        return "LOC_ERR";
      }
    try
    {
      Object localObject2 = Calendar.getInstance();
      i1 = ((Calendar)localObject2).get(6);
      i2 = ((Calendar)localObject2).get(1);
      ((Calendar)localObject2).setTimeInMillis(paramLong * 1000L);
      i3 = ((Calendar)localObject2).get(6);
      i4 = ((Calendar)localObject2).get(1);
      if ((i3 == i1) && (i2 == i4))
        return String.format("%s %s", new Object[] { a("TodayAt", 2131231903), a().c.a(new Date(paramLong * 1000L)) });
      if ((i3 + 1 == i1) && (i2 == i4))
        return String.format("%s %s", new Object[] { a("YesterdayAt", 2131231975), a().c.a(new Date(paramLong * 1000L)) });
      if (i2 == i4)
        return a("formatDateAtTime", 2131231995, new Object[] { a().e.a(new Date(paramLong * 1000L)), a().c.a(new Date(paramLong * 1000L)) });
      localObject2 = a("formatDateAtTime", 2131231995, new Object[] { a().f.a(new Date(paramLong * 1000L)), a().c.a(new Date(paramLong * 1000L)) });
      return localObject2;
    }
    catch (Exception localException2)
    {
      n.a("tmessages", localException2);
    }
    return (String)(String)"LOC_ERR";
  }

  public static String b(String paramString, int paramInt)
  {
    if ((paramString == null) || (paramString.length() == 0) || (a().q == null))
      return "LOC_ERR:" + paramString;
    String str = a().a(a().q.a(paramInt));
    paramString = paramString + "_" + str;
    return a(paramString, ApplicationLoader.a.getResources().getIdentifier(paramString, "string", ApplicationLoader.a.getPackageName()), new Object[] { Integer.valueOf(paramInt) });
  }

  // ERROR //
  private HashMap<String, String> b(File paramFile)
  {
    // Byte code:
    //   0: new 111	java/util/HashMap
    //   3: dup
    //   4: invokespecial 112	java/util/HashMap:<init>	()V
    //   7: astore 9
    //   9: invokestatic 852	android/util/Xml:newPullParser	()Lorg/xmlpull/v1/XmlPullParser;
    //   12: astore 10
    //   14: new 854	java/io/FileInputStream
    //   17: dup
    //   18: aload_1
    //   19: invokespecial 857	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   22: astore 8
    //   24: aload 10
    //   26: aload 8
    //   28: ldc_w 859
    //   31: invokeinterface 865 3 0
    //   36: aload 10
    //   38: invokeinterface 868 1 0
    //   43: istore_2
    //   44: aconst_null
    //   45: astore 7
    //   47: aconst_null
    //   48: astore 6
    //   50: aconst_null
    //   51: astore 5
    //   53: iload_2
    //   54: iconst_1
    //   55: if_icmpeq +282 -> 337
    //   58: iload_2
    //   59: iconst_2
    //   60: if_icmpne +174 -> 234
    //   63: aload 10
    //   65: invokeinterface 871 1 0
    //   70: astore 6
    //   72: aload 5
    //   74: astore_3
    //   75: aload 7
    //   77: astore_1
    //   78: aload 6
    //   80: astore 4
    //   82: aload 10
    //   84: invokeinterface 874 1 0
    //   89: ifle +19 -> 108
    //   92: aload 10
    //   94: iconst_0
    //   95: invokeinterface 877 2 0
    //   100: astore_3
    //   101: aload 6
    //   103: astore 4
    //   105: aload 7
    //   107: astore_1
    //   108: aload_3
    //   109: astore 5
    //   111: aload_1
    //   112: astore 7
    //   114: aload 4
    //   116: astore 6
    //   118: aload 4
    //   120: ifnull +103 -> 223
    //   123: aload_3
    //   124: astore 5
    //   126: aload_1
    //   127: astore 7
    //   129: aload 4
    //   131: astore 6
    //   133: aload 4
    //   135: ldc_w 838
    //   138: invokevirtual 697	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   141: ifeq +82 -> 223
    //   144: aload_3
    //   145: astore 5
    //   147: aload_1
    //   148: astore 7
    //   150: aload 4
    //   152: astore 6
    //   154: aload_1
    //   155: ifnull +68 -> 223
    //   158: aload_3
    //   159: astore 5
    //   161: aload_1
    //   162: astore 7
    //   164: aload 4
    //   166: astore 6
    //   168: aload_3
    //   169: ifnull +54 -> 223
    //   172: aload_3
    //   173: astore 5
    //   175: aload_1
    //   176: astore 7
    //   178: aload 4
    //   180: astore 6
    //   182: aload_1
    //   183: invokevirtual 668	java/lang/String:length	()I
    //   186: ifeq +37 -> 223
    //   189: aload_3
    //   190: astore 5
    //   192: aload_1
    //   193: astore 7
    //   195: aload 4
    //   197: astore 6
    //   199: aload_3
    //   200: invokevirtual 668	java/lang/String:length	()I
    //   203: ifeq +20 -> 223
    //   206: aload 9
    //   208: aload_3
    //   209: aload_1
    //   210: invokevirtual 424	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   213: pop
    //   214: aconst_null
    //   215: astore 5
    //   217: aconst_null
    //   218: astore 7
    //   220: aconst_null
    //   221: astore 6
    //   223: aload 10
    //   225: invokeinterface 879 1 0
    //   230: istore_2
    //   231: goto -178 -> 53
    //   234: iload_2
    //   235: iconst_4
    //   236: if_icmpne +76 -> 312
    //   239: aload 5
    //   241: astore_3
    //   242: aload 7
    //   244: astore_1
    //   245: aload 6
    //   247: astore 4
    //   249: aload 5
    //   251: ifnull -143 -> 108
    //   254: aload 10
    //   256: invokeinterface 882 1 0
    //   261: astore 7
    //   263: aload 5
    //   265: astore_3
    //   266: aload 7
    //   268: astore_1
    //   269: aload 6
    //   271: astore 4
    //   273: aload 7
    //   275: ifnull -167 -> 108
    //   278: aload 7
    //   280: invokevirtual 885	java/lang/String:trim	()Ljava/lang/String;
    //   283: ldc_w 887
    //   286: ldc_w 889
    //   289: invokevirtual 893	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   292: ldc_w 895
    //   295: ldc_w 651
    //   298: invokevirtual 893	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   301: astore_1
    //   302: aload 5
    //   304: astore_3
    //   305: aload 6
    //   307: astore 4
    //   309: goto -201 -> 108
    //   312: aload 5
    //   314: astore_3
    //   315: aload 7
    //   317: astore_1
    //   318: aload 6
    //   320: astore 4
    //   322: iload_2
    //   323: iconst_3
    //   324: if_icmpne -216 -> 108
    //   327: aconst_null
    //   328: astore_3
    //   329: aconst_null
    //   330: astore_1
    //   331: aconst_null
    //   332: astore 4
    //   334: goto -226 -> 108
    //   337: aload 8
    //   339: ifnull +8 -> 347
    //   342: aload 8
    //   344: invokevirtual 898	java/io/FileInputStream:close	()V
    //   347: aload 9
    //   349: areturn
    //   350: astore_1
    //   351: ldc_w 561
    //   354: aload_1
    //   355: invokestatic 566	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   358: goto -11 -> 347
    //   361: astore_3
    //   362: aconst_null
    //   363: astore_1
    //   364: ldc_w 561
    //   367: aload_3
    //   368: invokestatic 566	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   371: aload_1
    //   372: ifnull +7 -> 379
    //   375: aload_1
    //   376: invokevirtual 898	java/io/FileInputStream:close	()V
    //   379: new 111	java/util/HashMap
    //   382: dup
    //   383: invokespecial 112	java/util/HashMap:<init>	()V
    //   386: areturn
    //   387: astore_1
    //   388: ldc_w 561
    //   391: aload_1
    //   392: invokestatic 566	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   395: goto -16 -> 379
    //   398: astore_1
    //   399: aconst_null
    //   400: astore_3
    //   401: aload_3
    //   402: ifnull +7 -> 409
    //   405: aload_3
    //   406: invokevirtual 898	java/io/FileInputStream:close	()V
    //   409: aload_1
    //   410: athrow
    //   411: astore_3
    //   412: ldc_w 561
    //   415: aload_3
    //   416: invokestatic 566	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   419: goto -10 -> 409
    //   422: astore_1
    //   423: aload 8
    //   425: astore_3
    //   426: goto -25 -> 401
    //   429: astore 4
    //   431: aload_1
    //   432: astore_3
    //   433: aload 4
    //   435: astore_1
    //   436: goto -35 -> 401
    //   439: astore_3
    //   440: aload 8
    //   442: astore_1
    //   443: goto -79 -> 364
    //
    // Exception table:
    //   from	to	target	type
    //   342	347	350	java/lang/Exception
    //   0	24	361	java/lang/Exception
    //   375	379	387	java/lang/Exception
    //   0	24	398	finally
    //   405	409	411	java/lang/Exception
    //   24	44	422	finally
    //   63	72	422	finally
    //   82	101	422	finally
    //   133	144	422	finally
    //   182	189	422	finally
    //   199	214	422	finally
    //   223	231	422	finally
    //   254	263	422	finally
    //   278	302	422	finally
    //   364	371	429	finally
    //   24	44	439	java/lang/Exception
    //   63	72	439	java/lang/Exception
    //   82	101	439	java/lang/Exception
    //   133	144	439	java/lang/Exception
    //   182	189	439	java/lang/Exception
    //   199	214	439	java/lang/Exception
    //   223	231	439	java/lang/Exception
    //   254	263	439	java/lang/Exception
    //   278	302	439	java/lang/Exception
  }

  public static String c()
  {
    Object localObject = a().b();
    if (localObject == null)
      return "en";
    String str1 = ((Locale)localObject).getLanguage();
    String str2 = ((Locale)localObject).getCountry();
    localObject = ((Locale)localObject).getVariant();
    if ((str1.length() == 0) && (str2.length() == 0))
      return "en";
    StringBuilder localStringBuilder = new StringBuilder(11);
    localStringBuilder.append(str1);
    if ((str2.length() > 0) || (((String)localObject).length() > 0))
      localStringBuilder.append('-');
    localStringBuilder.append(str2);
    if (((String)localObject).length() > 0)
      localStringBuilder.append('_');
    localStringBuilder.append((String)localObject);
    return (String)localStringBuilder.toString();
  }

  public static String c(long paramLong)
  {
    int i1;
    int i2;
    int i3;
    int i4;
    if ((a().o.getLanguage().toLowerCase().equals("fa")) || (new itman.robert.a().d(ApplicationLoader.l())))
      try
      {
        Object localObject1 = Calendar.getInstance();
        i1 = ((Calendar)localObject1).get(6);
        i2 = ((Calendar)localObject1).get(1);
        ((Calendar)localObject1).setTimeInMillis(paramLong * 1000L);
        itman.robert.a.a locala = new itman.robert.a.a();
        locala.a((Calendar)localObject1);
        i3 = ((Calendar)localObject1).get(6);
        i4 = ((Calendar)localObject1).get(1);
        if ((i3 == i1) && (i2 == i4))
          return String.format("%s %s %s", new Object[] { a("LastSeen", 2131231349), a("TodayAt", 2131231903), a().c.a(new Date(paramLong * 1000L)) });
        if ((i3 + 1 == i1) && (i2 == i4))
          return String.format("%s %s %s", new Object[] { a("LastSeen", 2131231349), a("YesterdayAt", 2131231975), a().c.a(new Date(paramLong * 1000L)) });
        if (i2 == i4)
        {
          localObject1 = a("formatDateAtTime", 2131231995, new Object[] { locala.a(ApplicationLoader.l()), a().c.a(new Date(paramLong * 1000L)) });
          return String.format("%s %s", new Object[] { a("LastSeenDate", 2131231354), localObject1 });
        }
        localObject1 = a("formatDateAtTime", 2131231995, new Object[] { locala.c(ApplicationLoader.l()), a().c.a(new Date(paramLong * 1000L)) });
        localObject1 = String.format("%s %s", new Object[] { a("LastSeenDate", 2131231354), localObject1 });
        return localObject1;
      }
      catch (Exception localException1)
      {
        n.a("tmessages", localException1);
        return "LOC_ERR";
      }
    try
    {
      Object localObject2 = Calendar.getInstance();
      i1 = ((Calendar)localObject2).get(6);
      i2 = ((Calendar)localObject2).get(1);
      ((Calendar)localObject2).setTimeInMillis(paramLong * 1000L);
      i3 = ((Calendar)localObject2).get(6);
      i4 = ((Calendar)localObject2).get(1);
      if ((i3 == i1) && (i2 == i4))
        return String.format("%s %s %s", new Object[] { a("LastSeen", 2131231349), a("TodayAt", 2131231903), a().c.a(new Date(paramLong * 1000L)) });
      if ((i3 + 1 == i1) && (i2 == i4))
        return String.format("%s %s %s", new Object[] { a("LastSeen", 2131231349), a("YesterdayAt", 2131231975), a().c.a(new Date(paramLong * 1000L)) });
      if (i2 == i4)
      {
        localObject2 = a("formatDateAtTime", 2131231995, new Object[] { a().e.a(new Date(paramLong * 1000L)), a().c.a(new Date(paramLong * 1000L)) });
        return String.format("%s %s", new Object[] { a("LastSeenDate", 2131231354), localObject2 });
      }
      localObject2 = a("formatDateAtTime", 2131231995, new Object[] { a().f.a(new Date(paramLong * 1000L)), a().c.a(new Date(paramLong * 1000L)) });
      localObject2 = String.format("%s %s", new Object[] { a("LastSeenDate", 2131231354), localObject2 });
      return localObject2;
    }
    catch (Exception localException2)
    {
      n.a("tmessages", localException2);
    }
    return (String)(String)"LOC_ERR";
  }

  private String c(String paramString, int paramInt)
  {
    Object localObject3 = (String)this.t.get(paramString);
    Object localObject1 = localObject3;
    if (localObject3 == null);
    try
    {
      localObject1 = ApplicationLoader.a.getString(paramInt);
      localObject3 = localObject1;
      if (localObject1 == null)
        localObject3 = "LOC_ERR:" + paramString;
      return localObject3;
    }
    catch (Exception localObject2)
    {
      while (true)
      {
        n.a("tmessages", localException);
        Object localObject2 = localObject3;
      }
    }
  }

  public static String d()
  {
    return a("LanguageName", 2131231346);
  }

  public static String d(long paramLong)
  {
    int i1;
    int i2;
    int i3;
    if ((a().o.getLanguage().toLowerCase().equals("fa")) || (new itman.robert.a().d(ApplicationLoader.l())))
      try
      {
        Object localObject1 = Calendar.getInstance();
        i1 = ((Calendar)localObject1).get(6);
        i2 = ((Calendar)localObject1).get(1);
        ((Calendar)localObject1).setTimeInMillis(paramLong * 1000L);
        itman.robert.a.a locala = new itman.robert.a.a();
        locala.a((Calendar)localObject1);
        i3 = ((Calendar)localObject1).get(6);
        if (i2 != ((Calendar)localObject1).get(1))
          return locala.c(ApplicationLoader.l());
        i1 = i3 - i1;
        if ((i1 == 0) || ((i1 == -1) && ((int)(System.currentTimeMillis() / 1000L) - paramLong < 28800L)))
          return a().c.a(new Date(paramLong * 1000L));
        if ((i1 > -7) && (i1 <= -1))
          return locala.d(ApplicationLoader.l());
        localObject1 = locala.a(ApplicationLoader.l());
        return localObject1;
      }
      catch (Exception localException1)
      {
        n.a("tmessages", localException1);
        return "LOC_ERR";
      }
    try
    {
      Object localObject2 = Calendar.getInstance();
      i1 = ((Calendar)localObject2).get(6);
      i2 = ((Calendar)localObject2).get(1);
      ((Calendar)localObject2).setTimeInMillis(paramLong * 1000L);
      i3 = ((Calendar)localObject2).get(6);
      if (i2 != ((Calendar)localObject2).get(1))
        return a().f.a(new Date(paramLong * 1000L));
      i1 = i3 - i1;
      if ((i1 == 0) || ((i1 == -1) && ((int)(System.currentTimeMillis() / 1000L) - paramLong < 28800L)))
        return a().c.a(new Date(paramLong * 1000L));
      if ((i1 > -7) && (i1 <= -1))
        return a().d.a(new Date(paramLong * 1000L));
      localObject2 = a().e.a(new Date(paramLong * 1000L));
      return localObject2;
    }
    catch (Exception localException2)
    {
      n.a("tmessages", localException2);
    }
    return (String)(String)"LOC_ERR";
  }

  private void f()
  {
    SharedPreferences.Editor localEditor = ApplicationLoader.a.getSharedPreferences("langconfig", 0).edit();
    String str1 = "";
    Iterator localIterator = this.x.iterator();
    String str2;
    while (localIterator.hasNext())
    {
      str2 = ((a)localIterator.next()).a();
      if (str2 == null)
        continue;
      if (str1.length() == 0)
        break label126;
      str1 = str1 + "&";
    }
    label126: 
    while (true)
    {
      str1 = str1 + str2;
      break;
      localEditor.putString("locales", str1);
      localEditor.commit();
      return;
    }
  }

  private void g()
  {
    int i1 = 0;
    Object localObject = ApplicationLoader.a.getSharedPreferences("langconfig", 0).getString("locales", null);
    if ((localObject == null) || (((String)localObject).length() == 0));
    while (true)
    {
      return;
      localObject = ((String)localObject).split("&");
      int i2 = localObject.length;
      while (i1 < i2)
      {
        a locala = a.a(localObject[i1]);
        if (locala != null)
          this.x.add(locala);
        i1 += 1;
      }
    }
  }

  public String a(String paramString)
  {
    if (this.w == null)
    {
      this.w = new HashMap(520);
      this.w.put("ȼ", "c");
      this.w.put("ᶇ", "n");
      this.w.put("ɖ", "d");
      this.w.put("ỿ", "y");
      this.w.put("ᴓ", "o");
      this.w.put("ø", "o");
      this.w.put("ḁ", "a");
      this.w.put("ʯ", "h");
      this.w.put("ŷ", "y");
      this.w.put("ʞ", "k");
      this.w.put("ừ", "u");
      this.w.put("ꜳ", "aa");
      this.w.put("ĳ", "ij");
      this.w.put("ḽ", "l");
      this.w.put("ɪ", "i");
      this.w.put("ḇ", "b");
      this.w.put("ʀ", "r");
      this.w.put("ě", "e");
      this.w.put("ﬃ", "ffi");
      this.w.put("ơ", "o");
      this.w.put("ⱹ", "r");
      this.w.put("ồ", "o");
      this.w.put("ǐ", "i");
      this.w.put("ꝕ", "p");
      this.w.put("ý", "y");
      this.w.put("ḝ", "e");
      this.w.put("ₒ", "o");
      this.w.put("ⱥ", "a");
      this.w.put("ʙ", "b");
      this.w.put("ḛ", "e");
      this.w.put("ƈ", "c");
      this.w.put("ɦ", "h");
      this.w.put("ᵬ", "b");
      this.w.put("ṣ", "s");
      this.w.put("đ", "d");
      this.w.put("ỗ", "o");
      this.w.put("ɟ", "j");
      this.w.put("ẚ", "a");
      this.w.put("ɏ", "y");
      this.w.put("л", "l");
      this.w.put("ʌ", "v");
      this.w.put("ꝓ", "p");
      this.w.put("ﬁ", "fi");
      this.w.put("ᶄ", "k");
      this.w.put("ḏ", "d");
      this.w.put("ᴌ", "l");
      this.w.put("ė", "e");
      this.w.put("ё", "yo");
      this.w.put("ᴋ", "k");
      this.w.put("ċ", "c");
      this.w.put("ʁ", "r");
      this.w.put("ƕ", "hv");
      this.w.put("ƀ", "b");
      this.w.put("ṍ", "o");
      this.w.put("ȣ", "ou");
      this.w.put("ǰ", "j");
      this.w.put("ᶃ", "g");
      this.w.put("ṋ", "n");
      this.w.put("ɉ", "j");
      this.w.put("ǧ", "g");
      this.w.put("ǳ", "dz");
      this.w.put("ź", "z");
      this.w.put("ꜷ", "au");
      this.w.put("ǖ", "u");
      this.w.put("ᵹ", "g");
      this.w.put("ȯ", "o");
      this.w.put("ɐ", "a");
      this.w.put("ą", "a");
      this.w.put("õ", "o");
      this.w.put("ɻ", "r");
      this.w.put("ꝍ", "o");
      this.w.put("ǟ", "a");
      this.w.put("ȴ", "l");
      this.w.put("ʂ", "s");
      this.w.put("ﬂ", "fl");
      this.w.put("ȉ", "i");
      this.w.put("ⱻ", "e");
      this.w.put("ṉ", "n");
      this.w.put("ï", "i");
      this.w.put("ñ", "n");
      this.w.put("ᴉ", "i");
      this.w.put("ʇ", "t");
      this.w.put("ẓ", "z");
      this.w.put("ỷ", "y");
      this.w.put("ȳ", "y");
      this.w.put("ṩ", "s");
      this.w.put("ɽ", "r");
      this.w.put("ĝ", "g");
      this.w.put("в", "v");
      this.w.put("ᴝ", "u");
      this.w.put("ḳ", "k");
      this.w.put("ꝫ", "et");
      this.w.put("ī", "i");
      this.w.put("ť", "t");
      this.w.put("ꜿ", "c");
      this.w.put("ʟ", "l");
      this.w.put("ꜹ", "av");
      this.w.put("û", "u");
      this.w.put("æ", "ae");
      this.w.put("и", "i");
      this.w.put("ă", "a");
      this.w.put("ǘ", "u");
      this.w.put("ꞅ", "s");
      this.w.put("ᵣ", "r");
      this.w.put("ᴀ", "a");
      this.w.put("ƃ", "b");
      this.w.put("ḩ", "h");
      this.w.put("ṧ", "s");
      this.w.put("ₑ", "e");
      this.w.put("ʜ", "h");
      this.w.put("ẋ", "x");
      this.w.put("ꝅ", "k");
      this.w.put("ḋ", "d");
      this.w.put("ƣ", "oi");
      this.w.put("ꝑ", "p");
      this.w.put("ħ", "h");
      this.w.put("ⱴ", "v");
      this.w.put("ẇ", "w");
      this.w.put("ǹ", "n");
      this.w.put("ɯ", "m");
      this.w.put("ɡ", "g");
      this.w.put("ɴ", "n");
      this.w.put("ᴘ", "p");
      this.w.put("ᵥ", "v");
      this.w.put("ū", "u");
      this.w.put("ḃ", "b");
      this.w.put("ṗ", "p");
      this.w.put("ь", "");
      this.w.put("å", "a");
      this.w.put("ɕ", "c");
      this.w.put("ọ", "o");
      this.w.put("ắ", "a");
      this.w.put("ƒ", "f");
      this.w.put("ǣ", "ae");
      this.w.put("ꝡ", "vy");
      this.w.put("ﬀ", "ff");
      this.w.put("ᶉ", "r");
      this.w.put("ô", "o");
      this.w.put("ǿ", "o");
      this.w.put("ṳ", "u");
      this.w.put("ȥ", "z");
      this.w.put("ḟ", "f");
      this.w.put("ḓ", "d");
      this.w.put("ȇ", "e");
      this.w.put("ȕ", "u");
      this.w.put("п", "p");
      this.w.put("ȵ", "n");
      this.w.put("ʠ", "q");
      this.w.put("ấ", "a");
      this.w.put("ǩ", "k");
      this.w.put("ĩ", "i");
      this.w.put("ṵ", "u");
      this.w.put("ŧ", "t");
      this.w.put("ɾ", "r");
      this.w.put("ƙ", "k");
      this.w.put("ṫ", "t");
      this.w.put("ꝗ", "q");
      this.w.put("ậ", "a");
      this.w.put("н", "n");
      this.w.put("ʄ", "j");
      this.w.put("ƚ", "l");
      this.w.put("ᶂ", "f");
      this.w.put("д", "d");
      this.w.put("ᵴ", "s");
      this.w.put("ꞃ", "r");
      this.w.put("ᶌ", "v");
      this.w.put("ɵ", "o");
      this.w.put("ḉ", "c");
      this.w.put("ᵤ", "u");
      this.w.put("ẑ", "z");
      this.w.put("ṹ", "u");
      this.w.put("ň", "n");
      this.w.put("ʍ", "w");
      this.w.put("ầ", "a");
      this.w.put("ǉ", "lj");
      this.w.put("ɓ", "b");
      this.w.put("ɼ", "r");
      this.w.put("ò", "o");
      this.w.put("ẘ", "w");
      this.w.put("ɗ", "d");
      this.w.put("ꜽ", "ay");
      this.w.put("ư", "u");
      this.w.put("ᶀ", "b");
      this.w.put("ǜ", "u");
      this.w.put("ẹ", "e");
      this.w.put("ǡ", "a");
      this.w.put("ɥ", "h");
      this.w.put("ṏ", "o");
      this.w.put("ǔ", "u");
      this.w.put("ʎ", "y");
      this.w.put("ȱ", "o");
      this.w.put("ệ", "e");
      this.w.put("ế", "e");
      this.w.put("ĭ", "i");
      this.w.put("ⱸ", "e");
      this.w.put("ṯ", "t");
      this.w.put("ᶑ", "d");
      this.w.put("ḧ", "h");
      this.w.put("ṥ", "s");
      this.w.put("ë", "e");
      this.w.put("ᴍ", "m");
      this.w.put("ö", "o");
      this.w.put("é", "e");
      this.w.put("ı", "i");
      this.w.put("ď", "d");
      this.w.put("ᵯ", "m");
      this.w.put("ỵ", "y");
      this.w.put("я", "ya");
      this.w.put("ŵ", "w");
      this.w.put("ề", "e");
      this.w.put("ứ", "u");
      this.w.put("ƶ", "z");
      this.w.put("ĵ", "j");
      this.w.put("ḍ", "d");
      this.w.put("ŭ", "u");
      this.w.put("ʝ", "j");
      this.w.put("ж", "zh");
      this.w.put("ê", "e");
      this.w.put("ǚ", "u");
      this.w.put("ġ", "g");
      this.w.put("ṙ", "r");
      this.w.put("ƞ", "n");
      this.w.put("ъ", "");
      this.w.put("ḗ", "e");
      this.w.put("ẝ", "s");
      this.w.put("ᶁ", "d");
      this.w.put("ķ", "k");
      this.w.put("ᴂ", "ae");
      this.w.put("ɘ", "e");
      this.w.put("ợ", "o");
      this.w.put("ḿ", "m");
      this.w.put("ꜰ", "f");
      this.w.put("а", "a");
      this.w.put("ẵ", "a");
      this.w.put("ꝏ", "oo");
      this.w.put("ᶆ", "m");
      this.w.put("ᵽ", "p");
      this.w.put("ц", "ts");
      this.w.put("ữ", "u");
      this.w.put("ⱪ", "k");
      this.w.put("ḥ", "h");
      this.w.put("ţ", "t");
      this.w.put("ᵱ", "p");
      this.w.put("ṁ", "m");
      this.w.put("á", "a");
      this.w.put("ᴎ", "n");
      this.w.put("ꝟ", "v");
      this.w.put("è", "e");
      this.w.put("ᶎ", "z");
      this.w.put("ꝺ", "d");
      this.w.put("ᶈ", "p");
      this.w.put("м", "m");
      this.w.put("ɫ", "l");
      this.w.put("ᴢ", "z");
      this.w.put("ɱ", "m");
      this.w.put("ṝ", "r");
      this.w.put("ṽ", "v");
      this.w.put("ũ", "u");
      this.w.put("ß", "ss");
      this.w.put("т", "t");
      this.w.put("ĥ", "h");
      this.w.put("ᵵ", "t");
      this.w.put("ʐ", "z");
      this.w.put("ṟ", "r");
      this.w.put("ɲ", "n");
      this.w.put("à", "a");
      this.w.put("ẙ", "y");
      this.w.put("ỳ", "y");
      this.w.put("ᴔ", "oe");
      this.w.put("ы", "i");
      this.w.put("ₓ", "x");
      this.w.put("ȗ", "u");
      this.w.put("ⱼ", "j");
      this.w.put("ẫ", "a");
      this.w.put("ʑ", "z");
      this.w.put("ẛ", "s");
      this.w.put("ḭ", "i");
      this.w.put("ꜵ", "ao");
      this.w.put("ɀ", "z");
      this.w.put("ÿ", "y");
      this.w.put("ǝ", "e");
      this.w.put("ǭ", "o");
      this.w.put("ᴅ", "d");
      this.w.put("ᶅ", "l");
      this.w.put("ù", "u");
      this.w.put("ạ", "a");
      this.w.put("ḅ", "b");
      this.w.put("ụ", "u");
      this.w.put("к", "k");
      this.w.put("ằ", "a");
      this.w.put("ᴛ", "t");
      this.w.put("ƴ", "y");
      this.w.put("ⱦ", "t");
      this.w.put("з", "z");
      this.w.put("ⱡ", "l");
      this.w.put("ȷ", "j");
      this.w.put("ᵶ", "z");
      this.w.put("ḫ", "h");
      this.w.put("ⱳ", "w");
      this.w.put("ḵ", "k");
      this.w.put("ờ", "o");
      this.w.put("î", "i");
      this.w.put("ģ", "g");
      this.w.put("ȅ", "e");
      this.w.put("ȧ", "a");
      this.w.put("ẳ", "a");
      this.w.put("щ", "sch");
      this.w.put("ɋ", "q");
      this.w.put("ṭ", "t");
      this.w.put("ꝸ", "um");
      this.w.put("ᴄ", "c");
      this.w.put("ẍ", "x");
      this.w.put("ủ", "u");
      this.w.put("ỉ", "i");
      this.w.put("ᴚ", "r");
      this.w.put("ś", "s");
      this.w.put("ꝋ", "o");
      this.w.put("ỹ", "y");
      this.w.put("ṡ", "s");
      this.w.put("ǌ", "nj");
      this.w.put("ȁ", "a");
      this.w.put("ẗ", "t");
      this.w.put("ĺ", "l");
      this.w.put("ž", "z");
      this.w.put("ᵺ", "th");
      this.w.put("ƌ", "d");
      this.w.put("ș", "s");
      this.w.put("š", "s");
      this.w.put("ᶙ", "u");
      this.w.put("ẽ", "e");
      this.w.put("ẜ", "s");
      this.w.put("ɇ", "e");
      this.w.put("ṷ", "u");
      this.w.put("ố", "o");
      this.w.put("ȿ", "s");
      this.w.put("ᴠ", "v");
      this.w.put("ꝭ", "is");
      this.w.put("ᴏ", "o");
      this.w.put("ɛ", "e");
      this.w.put("ǻ", "a");
      this.w.put("ﬄ", "ffl");
      this.w.put("ⱺ", "o");
      this.w.put("ȋ", "i");
      this.w.put("ᵫ", "ue");
      this.w.put("ȡ", "d");
      this.w.put("ⱬ", "z");
      this.w.put("ẁ", "w");
      this.w.put("ᶏ", "a");
      this.w.put("ꞇ", "t");
      this.w.put("ğ", "g");
      this.w.put("ɳ", "n");
      this.w.put("ʛ", "g");
      this.w.put("ᴜ", "u");
      this.w.put("ф", "f");
      this.w.put("ẩ", "a");
      this.w.put("ṅ", "n");
      this.w.put("ɨ", "i");
      this.w.put("ᴙ", "r");
      this.w.put("ǎ", "a");
      this.w.put("ſ", "s");
      this.w.put("у", "u");
      this.w.put("ȫ", "o");
      this.w.put("ɿ", "r");
      this.w.put("ƭ", "t");
      this.w.put("ḯ", "i");
      this.w.put("ǽ", "ae");
      this.w.put("ⱱ", "v");
      this.w.put("ɶ", "oe");
      this.w.put("ṃ", "m");
      this.w.put("ż", "z");
      this.w.put("ĕ", "e");
      this.w.put("ꜻ", "av");
      this.w.put("ở", "o");
      this.w.put("ễ", "e");
      this.w.put("ɬ", "l");
      this.w.put("ị", "i");
      this.w.put("ᵭ", "d");
      this.w.put("ﬆ", "st");
      this.w.put("ḷ", "l");
      this.w.put("ŕ", "r");
      this.w.put("ᴕ", "ou");
      this.w.put("ʈ", "t");
      this.w.put("ā", "a");
      this.w.put("э", "e");
      this.w.put("ḙ", "e");
      this.w.put("ᴑ", "o");
      this.w.put("ç", "c");
      this.w.put("ᶊ", "s");
      this.w.put("ặ", "a");
      this.w.put("ų", "u");
      this.w.put("ả", "a");
      this.w.put("ǥ", "g");
      this.w.put("р", "r");
      this.w.put("ꝁ", "k");
      this.w.put("ẕ", "z");
      this.w.put("ŝ", "s");
      this.w.put("ḕ", "e");
      this.w.put("ɠ", "g");
      this.w.put("ꝉ", "l");
      this.w.put("ꝼ", "f");
      this.w.put("ᶍ", "x");
      this.w.put("х", "h");
      this.w.put("ǒ", "o");
      this.w.put("ę", "e");
      this.w.put("ổ", "o");
      this.w.put("ƫ", "t");
      this.w.put("ǫ", "o");
      this.w.put("i̇", "i");
      this.w.put("ṇ", "n");
      this.w.put("ć", "c");
      this.w.put("ᵷ", "g");
      this.w.put("ẅ", "w");
      this.w.put("ḑ", "d");
      this.w.put("ḹ", "l");
      this.w.put("ч", "ch");
      this.w.put("œ", "oe");
      this.w.put("ᵳ", "r");
      this.w.put("ļ", "l");
      this.w.put("ȑ", "r");
      this.w.put("ȭ", "o");
      this.w.put("ᵰ", "n");
      this.w.put("ᴁ", "ae");
      this.w.put("ŀ", "l");
      this.w.put("ä", "a");
      this.w.put("ƥ", "p");
      this.w.put("ỏ", "o");
      this.w.put("į", "i");
      this.w.put("ȓ", "r");
      this.w.put("ǆ", "dz");
      this.w.put("ḡ", "g");
      this.w.put("ṻ", "u");
      this.w.put("ō", "o");
      this.w.put("ľ", "l");
      this.w.put("ẃ", "w");
      this.w.put("ț", "t");
      this.w.put("ń", "n");
      this.w.put("ɍ", "r");
      this.w.put("ȃ", "a");
      this.w.put("ü", "u");
      this.w.put("ꞁ", "l");
      this.w.put("ᴐ", "o");
      this.w.put("ớ", "o");
      this.w.put("ᴃ", "b");
      this.w.put("ɹ", "r");
      this.w.put("ᵲ", "r");
      this.w.put("ʏ", "y");
      this.w.put("ᵮ", "f");
      this.w.put("ⱨ", "h");
      this.w.put("ŏ", "o");
      this.w.put("ú", "u");
      this.w.put("ṛ", "r");
      this.w.put("ʮ", "h");
      this.w.put("ó", "o");
      this.w.put("ů", "u");
      this.w.put("ỡ", "o");
      this.w.put("ṕ", "p");
      this.w.put("ᶖ", "i");
      this.w.put("ự", "u");
      this.w.put("ã", "a");
      this.w.put("ᵢ", "i");
      this.w.put("ṱ", "t");
      this.w.put("ể", "e");
      this.w.put("ử", "u");
      this.w.put("í", "i");
      this.w.put("ɔ", "o");
      this.w.put("с", "s");
      this.w.put("й", "i");
      this.w.put("ɺ", "r");
      this.w.put("ɢ", "g");
      this.w.put("ř", "r");
      this.w.put("ẖ", "h");
      this.w.put("ű", "u");
      this.w.put("ȍ", "o");
      this.w.put("ш", "sh");
      this.w.put("ḻ", "l");
      this.w.put("ḣ", "h");
      this.w.put("ȶ", "t");
      this.w.put("ņ", "n");
      this.w.put("ᶒ", "e");
      this.w.put("ì", "i");
      this.w.put("ẉ", "w");
      this.w.put("б", "b");
      this.w.put("ē", "e");
      this.w.put("ᴇ", "e");
      this.w.put("ł", "l");
      this.w.put("ộ", "o");
      this.w.put("ɭ", "l");
      this.w.put("ẏ", "y");
      this.w.put("ᴊ", "j");
      this.w.put("ḱ", "k");
      this.w.put("ṿ", "v");
      this.w.put("ȩ", "e");
      this.w.put("â", "a");
      this.w.put("ş", "s");
      this.w.put("ŗ", "r");
      this.w.put("ʋ", "v");
      this.w.put("ₐ", "a");
      this.w.put("ↄ", "c");
      this.w.put("ᶓ", "e");
      this.w.put("ɰ", "m");
      this.w.put("е", "e");
      this.w.put("ᴡ", "w");
      this.w.put("ȏ", "o");
      this.w.put("č", "c");
      this.w.put("ǵ", "g");
      this.w.put("ĉ", "c");
      this.w.put("ю", "yu");
      this.w.put("ᶗ", "o");
      this.w.put("ꝃ", "k");
      this.w.put("ꝙ", "q");
      this.w.put("г", "g");
      this.w.put("ṑ", "o");
      this.w.put("ꜱ", "s");
      this.w.put("ṓ", "o");
      this.w.put("ȟ", "h");
      this.w.put("ő", "o");
      this.w.put("ꜩ", "tz");
      this.w.put("ẻ", "e");
      this.w.put("о", "o");
    }
    StringBuilder localStringBuilder = new StringBuilder(paramString.length());
    int i2 = paramString.length();
    int i1 = 0;
    if (i1 < i2)
    {
      String str1 = paramString.substring(i1, i1 + 1);
      String str2 = (String)this.w.get(str1);
      if (str2 != null)
        localStringBuilder.append(str2);
      while (true)
      {
        i1 += 1;
        break;
        localStringBuilder.append(str1);
      }
    }
    return localStringBuilder.toString();
  }

  public void a(Configuration paramConfiguration)
  {
    if (this.v);
    do
    {
      do
      {
        return;
        m = DateFormat.is24HourFormat(ApplicationLoader.a);
        this.p = paramConfiguration.locale;
        if (this.u != null)
        {
          paramConfiguration = this.r;
          this.r = null;
          a(paramConfiguration, false);
          return;
        }
        paramConfiguration = paramConfiguration.locale;
      }
      while (paramConfiguration == null);
      String str1 = paramConfiguration.getDisplayName();
      String str2 = this.o.getDisplayName();
      if ((str1 != null) && (str2 != null) && (!str1.equals(str2)))
        e();
      this.o = paramConfiguration;
      this.q = ((b)this.n.get(this.o.getLanguage()));
    }
    while (this.q != null);
    this.q = ((b)this.n.get("en"));
  }

  public void a(a parama, boolean paramBoolean)
  {
    a(parama, paramBoolean, false);
  }

  public void a(a parama, boolean paramBoolean1, boolean paramBoolean2)
  {
    Object localObject1 = null;
    if (parama == null)
      return;
    try
    {
      if (parama.c != null)
      {
        localObject1 = parama.c.split("_");
        if (localObject1.length == 1);
        for (localObject1 = new Locale(parama.c); ; localObject1 = new Locale(localObject1[0], localObject1[1]))
        {
          localObject2 = localObject1;
          if (localObject1 != null)
          {
            localObject2 = localObject1;
            if (paramBoolean1)
            {
              this.u = parama.c;
              localObject2 = ApplicationLoader.a.getSharedPreferences("mainconfig", 0).edit();
              ((SharedPreferences.Editor)localObject2).putString("language", parama.c);
              ((SharedPreferences.Editor)localObject2).commit();
              localObject2 = localObject1;
            }
          }
          if (localObject2 != null)
          {
            if (parama.d != null)
              break;
            this.t.clear();
            this.o = ((Locale)localObject2);
            this.r = parama;
            this.q = ((b)this.n.get(this.o.getLanguage()));
            if (this.q == null)
              this.q = ((b)this.n.get("en"));
            this.v = true;
            Locale.setDefault(this.o);
            parama = new Configuration();
            parama.locale = this.o;
            ApplicationLoader.a.getResources().updateConfiguration(parama, ApplicationLoader.a.getResources().getDisplayMetrics());
            this.v = false;
          }
          e();
          return;
        }
      }
    }
    catch (Exception parama)
    {
      while (true)
      {
        n.a("tmessages", parama);
        this.v = false;
        continue;
        Locale localLocale = this.p;
        this.u = null;
        Object localObject2 = ApplicationLoader.a.getSharedPreferences("mainconfig", 0).edit();
        ((SharedPreferences.Editor)localObject2).remove("language");
        ((SharedPreferences.Editor)localObject2).commit();
        if (localLocale != null)
        {
          if (localLocale.getLanguage() != null)
            localObject1 = (a)this.l.get(localLocale.getLanguage());
          localObject2 = localObject1;
          if (localObject1 == null)
            localObject2 = (a)this.l.get(a(localLocale));
          if (localObject2 == null)
          {
            localObject2 = Locale.US;
            continue;
            if (paramBoolean2)
              continue;
            this.t = b(new File(parama.d));
            continue;
          }
        }
        localObject2 = localLocale;
      }
    }
  }

  public boolean a(File paramFile)
  {
    try
    {
      HashMap localHashMap = b(paramFile);
      String str1 = (String)localHashMap.get("LanguageName");
      String str2 = (String)localHashMap.get("LanguageNameInEnglish");
      String str3 = (String)localHashMap.get("LanguageCode");
      if ((str1 != null) && (str1.length() > 0) && (str2 != null) && (str2.length() > 0) && (str3 != null) && (str3.length() > 0))
      {
        if ((str1.contains("&")) || (str1.contains("|")))
          break label350;
        if ((str2.contains("&")) || (str2.contains("|")))
          break label352;
        if ((str3.contains("&")) || (str3.contains("|")) || (str3.contains("/")) || (str3.contains("\\")))
          break label354;
        File localFile = new File(ApplicationLoader.h(), str3 + ".xml");
        if (!a.a(paramFile, localFile))
          return false;
        a locala = (a)this.l.get(str3);
        paramFile = locala;
        if (locala == null)
        {
          paramFile = new a();
          paramFile.a = str1;
          paramFile.b = str2;
          paramFile.c = str3;
          paramFile.d = localFile.getAbsolutePath();
          this.k.add(paramFile);
          this.l.put(paramFile.c, paramFile);
          this.x.add(paramFile);
          Collections.sort(this.k, new Comparator()
          {
            public int a(r.a parama1, r.a parama2)
            {
              if (parama1.c == null)
                return -1;
              if (parama2.c == null)
                return 1;
              return parama1.a.compareTo(parama2.a);
            }
          });
          f();
        }
        this.t = localHashMap;
        a(paramFile, true, true);
        return true;
      }
    }
    catch (Exception paramFile)
    {
      n.a("tmessages", paramFile);
    }
    return false;
    label350: return false;
    label352: return false;
    label354: return false;
  }

  public boolean a(a parama)
  {
    if (parama.d == null)
      return false;
    if (this.r == parama)
      a(this.s, true);
    this.x.remove(parama);
    this.k.remove(parama);
    this.l.remove(parama.c);
    new File(parama.d).delete();
    f();
    return true;
  }

  public Locale b()
  {
    return this.p;
  }

  public void e()
  {
    int i1 = 1;
    Object localObject2 = this.o;
    Object localObject1 = localObject2;
    if (localObject2 == null)
      localObject1 = Locale.getDefault();
    localObject2 = ((Locale)localObject1).getLanguage();
    Object localObject3 = localObject2;
    if (localObject2 == null)
      localObject3 = "en";
    if ((((String)localObject3).toLowerCase().equals("ar")) || (((String)localObject3).toLowerCase().equals("fa")))
      a = true;
    if (((String)localObject3).toLowerCase().equals("ko"))
      i1 = 2;
    b = i1;
    this.e = a((Locale)localObject1, c("formatterMonth", 2131231998), "dd MMM");
    this.f = a((Locale)localObject1, c("formatterYear", 2131232001), "dd.MM.yy");
    this.h = a((Locale)localObject1, c("formatterYearMax", 2131232002), "dd.MM.yyyy");
    this.i = a((Locale)localObject1, c("chatDate", 2131231993), "d MMMM");
    this.j = a((Locale)localObject1, c("chatFullDate", 2131231994), "d MMMM yyyy");
    this.d = a((Locale)localObject1, c("formatterWeek", 2131232000), "EEE");
    this.g = a((Locale)localObject1, c("formatterMonthYear", 2131231999), "MMMM yyyy");
    localObject2 = localObject1;
    if (!((String)localObject3).toLowerCase().equals("ar"))
    {
      localObject2 = localObject1;
      if (!((String)localObject3).toLowerCase().equals("fa"))
      {
        if (!((String)localObject3).toLowerCase().equals("ko"))
          break label328;
        localObject2 = localObject1;
      }
    }
    if (m)
    {
      localObject1 = c("formatterDay24H", 2131231997);
      label304: if (!m)
        break label349;
    }
    label328: label349: for (localObject3 = "HH:mm"; ; localObject3 = "h:mm a")
    {
      this.c = a((Locale)localObject2, (String)localObject1, (String)localObject3);
      return;
      localObject2 = Locale.US;
      break;
      localObject1 = c("formatterDay12H", 2131231996);
      break label304;
    }
  }

  public static class a
  {
    public String a;
    public String b;
    public String c;
    public String d;

    public static a a(String paramString)
    {
      if ((paramString == null) || (paramString.length() == 0));
      do
      {
        return null;
        paramString = paramString.split("\\|");
      }
      while (paramString.length != 4);
      a locala = new a();
      locala.a = paramString[0];
      locala.b = paramString[1];
      locala.c = paramString[2];
      locala.d = paramString[3];
      return locala;
    }

    public String a()
    {
      return this.a + "|" + this.b + "|" + this.c + "|" + this.d;
    }
  }

  public static abstract class b
  {
    abstract int a(int paramInt);
  }

  public static class c extends r.b
  {
    public int a(int paramInt)
    {
      int i = paramInt % 100;
      if (paramInt == 0)
        return 1;
      if (paramInt == 1)
        return 2;
      if (paramInt == 2)
        return 4;
      if ((i >= 3) && (i <= 10))
        return 8;
      if ((i >= 11) && (i <= 99))
        return 16;
      return 0;
    }
  }

  public static class d extends r.b
  {
    public int a(int paramInt)
    {
      int i = paramInt % 100;
      paramInt %= 10;
      if ((paramInt == 1) && (i != 11))
        return 2;
      if ((paramInt >= 2) && (paramInt <= 4) && ((i < 12) || (i > 14)))
        return 8;
      if ((paramInt == 0) || ((paramInt >= 5) && (paramInt <= 9)) || ((i >= 11) && (i <= 14)))
        return 16;
      return 0;
    }
  }

  public static class e extends r.b
  {
    public int a(int paramInt)
    {
      if (paramInt == 0)
        return 1;
      if (paramInt == 1)
        return 2;
      if (paramInt == 2)
        return 4;
      if (paramInt == 3)
        return 8;
      if (paramInt == 6)
        return 16;
      return 0;
    }
  }

  public static class f extends r.b
  {
    public int a(int paramInt)
    {
      if (paramInt == 1)
        return 2;
      if ((paramInt >= 2) && (paramInt <= 4))
        return 8;
      return 0;
    }
  }

  public static class g extends r.b
  {
    public int a(int paramInt)
    {
      if ((paramInt >= 0) && (paramInt < 2))
        return 2;
      return 0;
    }
  }

  public static class h extends r.b
  {
    public int a(int paramInt)
    {
      int i = 2;
      if (paramInt == 0)
        i = 1;
      do
        return i;
      while ((paramInt > 0) && (paramInt < 2));
      return 0;
    }
  }

  public static class i extends r.b
  {
    public int a(int paramInt)
    {
      if (paramInt == 0)
        return 1;
      if ((paramInt % 10 == 1) && (paramInt % 100 != 11))
        return 2;
      return 0;
    }
  }

  public static class j extends r.b
  {
    public int a(int paramInt)
    {
      int i = paramInt % 100;
      paramInt %= 10;
      if ((paramInt == 1) && ((i < 11) || (i > 19)))
        return 2;
      if ((paramInt >= 2) && (paramInt <= 9) && ((i < 11) || (i > 19)))
        return 8;
      return 0;
    }
  }

  public static class k extends r.b
  {
    public int a(int paramInt)
    {
      if ((paramInt % 10 == 1) && (paramInt != 11))
        return 2;
      return 0;
    }
  }

  public static class l extends r.b
  {
    public int a(int paramInt)
    {
      int i = paramInt % 100;
      if (paramInt == 1)
        return 2;
      if ((paramInt == 0) || ((i >= 2) && (i <= 10)))
        return 8;
      if ((i >= 11) && (i <= 19))
        return 16;
      return 0;
    }
  }

  public static class m extends r.b
  {
    public int a(int paramInt)
    {
      return 0;
    }
  }

  public static class n extends r.b
  {
    public int a(int paramInt)
    {
      if (paramInt == 1)
        return 2;
      return 0;
    }
  }

  public static class o extends r.b
  {
    public int a(int paramInt)
    {
      int i = paramInt % 100;
      int j = paramInt % 10;
      if (paramInt == 1)
        return 2;
      if ((j >= 2) && (j <= 4) && ((i < 12) || (i > 14)) && ((i < 22) || (i > 24)))
        return 8;
      return 0;
    }
  }

  public static class p extends r.b
  {
    public int a(int paramInt)
    {
      int i = paramInt % 100;
      if (paramInt == 1)
        return 2;
      if ((paramInt == 0) || ((i >= 1) && (i <= 19)))
        return 8;
      return 0;
    }
  }

  public static class q extends r.b
  {
    public int a(int paramInt)
    {
      paramInt %= 100;
      if (paramInt == 1)
        return 2;
      if (paramInt == 2)
        return 4;
      if ((paramInt >= 3) && (paramInt <= 4))
        return 8;
      return 0;
    }
  }

  public static class r extends r.b
  {
    public int a(int paramInt)
    {
      if ((paramInt >= 0) && (paramInt <= 1))
        return 2;
      if ((paramInt >= 2) && (paramInt <= 10))
        return 8;
      return 0;
    }
  }

  public static class s extends r.b
  {
    public int a(int paramInt)
    {
      if (paramInt == 1)
        return 2;
      if (paramInt == 2)
        return 4;
      return 0;
    }
  }

  public static class t extends r.b
  {
    public int a(int paramInt)
    {
      if (paramInt == 0)
        return 1;
      if (paramInt == 1)
        return 2;
      if (paramInt == 2)
        return 4;
      if (paramInt == 3)
        return 8;
      if (paramInt == 6)
        return 16;
      return 0;
    }
  }

  public static class u extends r.b
  {
    public int a(int paramInt)
    {
      if ((paramInt == 0) || (paramInt == 1))
        return 2;
      return 0;
    }
  }

  private class v extends BroadcastReceiver
  {
    private v()
    {
    }

    public void onReceive(Context paramContext, Intent paramIntent)
    {
      ApplicationLoader.b.post(new Runnable()
      {
        public void run()
        {
          if (!r.this.e.a().equals(TimeZone.getDefault()))
            r.a().e();
        }
      });
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.r
 * JD-Core Version:    0.6.0
 */