package org.vidogram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Environment;
import android.os.StatFs;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ListView;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import org.vidogram.messenger.ApplicationLoader;
import org.vidogram.messenger.n;
import org.vidogram.messenger.r;
import org.vidogram.ui.Components.ac;
import org.vidogram.ui.Components.v;
import org.vidogram.ui.a.a.a;
import org.vidogram.ui.a.c;
import org.vidogram.ui.a.f;
import org.vidogram.ui.a.g;
import org.vidogram.ui.c.ar;

public class w extends g
{
  private ListView i;
  private c j;
  private ac k;
  private TextView l;
  private File m;
  private ArrayList<d> n = new ArrayList();
  private boolean o = false;
  private ArrayList<b> p = new ArrayList();
  private long q = 1610612736L;
  private a r;
  private HashMap<String, d> s = new HashMap();
  private ArrayList<View> t = new ArrayList();
  private boolean u;
  private BroadcastReceiver v = new BroadcastReceiver()
  {
    public void onReceive(Context paramContext, Intent paramIntent)
    {
      paramContext = new Runnable()
      {
        public void run()
        {
          try
          {
            if (w.a(w.this) == null)
            {
              w.b(w.this);
              return;
            }
            w.a(w.this, w.a(w.this));
            return;
          }
          catch (Exception localException)
          {
            n.a("tmessages", localException);
          }
        }
      };
      if ("android.intent.action.MEDIA_UNMOUNTED".equals(paramIntent.getAction()))
      {
        w.c(w.this).postDelayed(paramContext, 1000L);
        return;
      }
      paramContext.run();
    }
  };

  private void a(String paramString)
  {
    if (l() == null)
      return;
    new AlertDialog.Builder(l()).setTitle(r.a("AppName", 2131230856)).setMessage(paramString).setPositiveButton(r.a("OK", 2131231604), null).show();
  }

  private boolean a(File paramFile)
  {
    if (!paramFile.canRead())
    {
      if (((paramFile.getAbsolutePath().startsWith(Environment.getExternalStorageDirectory().toString())) || (paramFile.getAbsolutePath().startsWith("/sdcard")) || (paramFile.getAbsolutePath().startsWith("/mnt/sdcard"))) && (!Environment.getExternalStorageState().equals("mounted")) && (!Environment.getExternalStorageState().equals("mounted_ro")))
      {
        this.m = paramFile;
        this.n.clear();
        if ("shared".equals(Environment.getExternalStorageState()))
          this.l.setText(r.a("UsbActive", 2131231922));
        while (true)
        {
          org.vidogram.messenger.a.d(this.i);
          this.u = true;
          this.j.notifyDataSetChanged();
          return true;
          this.l.setText(r.a("NotMounted", 2131231523));
        }
      }
      a(r.a("AccessError", 2131230763));
      return false;
    }
    this.l.setText(r.a("NoFiles", 2131231493));
    Object localObject1;
    try
    {
      localObject1 = paramFile.listFiles();
      if (localObject1 == null)
      {
        a(r.a("UnknownError", 2131231912));
        return false;
      }
    }
    catch (Exception paramFile)
    {
      a(paramFile.getLocalizedMessage());
      return false;
    }
    this.m = paramFile;
    this.n.clear();
    Arrays.sort(localObject1, new Comparator()
    {
      public int a(File paramFile1, File paramFile2)
      {
        if (paramFile1.isDirectory() != paramFile2.isDirectory())
        {
          if (paramFile1.isDirectory())
            return -1;
          return 1;
        }
        return paramFile1.getName().compareToIgnoreCase(paramFile2.getName());
      }
    });
    int i1 = 0;
    if (i1 < localObject1.length)
    {
      Object localObject2 = localObject1[i1];
      if (localObject2.getName().indexOf('.') == 0);
      d locald;
      while (true)
      {
        i1 += 1;
        break;
        locald = new d(null);
        locald.b = localObject2.getName();
        locald.f = localObject2;
        if (!localObject2.isDirectory())
          break label331;
        locald.a = 2130837824;
        locald.c = r.a("Folder", 2131231201);
        this.n.add(locald);
      }
      label331: String str = localObject2.getName();
      paramFile = str.split("\\.");
      if (paramFile.length > 1);
      for (paramFile = paramFile[(paramFile.length - 1)]; ; paramFile = "?")
      {
        locald.d = paramFile;
        locald.c = org.vidogram.messenger.a.c(localObject2.length());
        paramFile = str.toLowerCase();
        if ((!paramFile.endsWith(".jpg")) && (!paramFile.endsWith(".png")) && (!paramFile.endsWith(".gif")) && (!paramFile.endsWith(".jpeg")))
          break;
        locald.e = localObject2.getAbsolutePath();
        break;
      }
    }
    paramFile = new d(null);
    paramFile.b = "..";
    if (this.p.size() > 0)
    {
      localObject1 = (b)this.p.get(this.p.size() - 1);
      if (((b)localObject1).c == null)
        paramFile.c = r.a("Folder", 2131231201);
    }
    while (true)
    {
      paramFile.a = 2130837824;
      paramFile.f = null;
      this.n.add(0, paramFile);
      org.vidogram.messenger.a.d(this.i);
      this.u = true;
      this.j.notifyDataSetChanged();
      return true;
      paramFile.c = ((b)localObject1).c.toString();
      continue;
      paramFile.c = r.a("Folder", 2131231201);
    }
  }

  private String b(String paramString)
  {
    try
    {
      Object localObject = new StatFs(paramString);
      long l1 = ((StatFs)localObject).getBlockCount() * ((StatFs)localObject).getBlockSize();
      long l2 = ((StatFs)localObject).getAvailableBlocks();
      long l3 = ((StatFs)localObject).getBlockSize();
      if (l1 == 0L)
        return "";
      localObject = r.a("FreeOfTotal", 2131231261, new Object[] { org.vidogram.messenger.a.c(l3 * l2), org.vidogram.messenger.a.c(l1) });
      return localObject;
    }
    catch (Exception localException)
    {
      n.a("tmessages", localException);
    }
    return (String)paramString;
  }

  private void q()
  {
    if (this.k == null)
      return;
    if ((!org.vidogram.messenger.a.c()) && (ApplicationLoader.a.getResources().getConfiguration().orientation == 2))
    {
      this.k.setTextSize(18);
      return;
    }
    this.k.setTextSize(20);
  }

  // ERROR //
  @android.annotation.SuppressLint({"NewApi"})
  private void r()
  {
    // Byte code:
    //   0: aload_0
    //   1: aconst_null
    //   2: putfield 98	org/vidogram/ui/w:m	Ljava/io/File;
    //   5: aload_0
    //   6: getfield 74	org/vidogram/ui/w:n	Ljava/util/ArrayList;
    //   9: invokevirtual 182	java/util/ArrayList:clear	()V
    //   12: new 403	java/util/HashSet
    //   15: dup
    //   16: invokespecial 404	java/util/HashSet:<init>	()V
    //   19: astore 6
    //   21: invokestatic 155	android/os/Environment:getExternalStorageDirectory	()Ljava/io/File;
    //   24: invokevirtual 407	java/io/File:getPath	()Ljava/lang/String;
    //   27: astore_2
    //   28: invokestatic 410	android/os/Environment:isExternalStorageRemovable	()Z
    //   31: pop
    //   32: invokestatic 171	android/os/Environment:getExternalStorageState	()Ljava/lang/String;
    //   35: astore_3
    //   36: aload_3
    //   37: ldc 173
    //   39: invokevirtual 177	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   42: ifne +12 -> 54
    //   45: aload_3
    //   46: ldc 179
    //   48: invokevirtual 177	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   51: ifeq +71 -> 122
    //   54: new 35	org/vidogram/ui/w$d
    //   57: dup
    //   58: aload_0
    //   59: aconst_null
    //   60: invokespecial 245	org/vidogram/ui/w$d:<init>	(Lorg/vidogram/ui/w;Lorg/vidogram/ui/w$1;)V
    //   63: astore_3
    //   64: invokestatic 410	android/os/Environment:isExternalStorageRemovable	()Z
    //   67: ifeq +675 -> 742
    //   70: aload_3
    //   71: ldc_w 412
    //   74: ldc_w 413
    //   77: invokestatic 115	org/vidogram/messenger/r:a	(Ljava/lang/String;I)Ljava/lang/String;
    //   80: putfield 248	org/vidogram/ui/w$d:b	Ljava/lang/String;
    //   83: aload_3
    //   84: ldc_w 414
    //   87: putfield 258	org/vidogram/ui/w$d:a	I
    //   90: aload_3
    //   91: aload_0
    //   92: aload_2
    //   93: invokespecial 416	org/vidogram/ui/w:b	(Ljava/lang/String;)Ljava/lang/String;
    //   96: putfield 263	org/vidogram/ui/w$d:c	Ljava/lang/String;
    //   99: aload_3
    //   100: invokestatic 155	android/os/Environment:getExternalStorageDirectory	()Ljava/io/File;
    //   103: putfield 251	org/vidogram/ui/w$d:f	Ljava/io/File;
    //   106: aload_0
    //   107: getfield 74	org/vidogram/ui/w:n	Ljava/util/ArrayList;
    //   110: aload_3
    //   111: invokevirtual 266	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   114: pop
    //   115: aload 6
    //   117: aload_2
    //   118: invokevirtual 417	java/util/HashSet:add	(Ljava/lang/Object;)Z
    //   121: pop
    //   122: new 419	java/io/BufferedReader
    //   125: dup
    //   126: new 421	java/io/FileReader
    //   129: dup
    //   130: ldc_w 423
    //   133: invokespecial 424	java/io/FileReader:<init>	(Ljava/lang/String;)V
    //   136: invokespecial 427	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   139: astore_3
    //   140: aload_3
    //   141: astore_2
    //   142: aload_3
    //   143: invokevirtual 430	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   146: astore 5
    //   148: aload 5
    //   150: ifnull +651 -> 801
    //   153: aload_3
    //   154: astore_2
    //   155: aload 5
    //   157: ldc_w 432
    //   160: invokevirtual 436	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   163: ifne +16 -> 179
    //   166: aload_3
    //   167: astore_2
    //   168: aload 5
    //   170: ldc_w 438
    //   173: invokevirtual 436	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   176: ifeq -36 -> 140
    //   179: aload_3
    //   180: astore_2
    //   181: ldc_w 345
    //   184: aload 5
    //   186: invokestatic 441	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   189: aload_3
    //   190: astore_2
    //   191: new 443	java/util/StringTokenizer
    //   194: dup
    //   195: aload 5
    //   197: ldc_w 445
    //   200: invokespecial 447	java/util/StringTokenizer:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   203: astore 4
    //   205: aload_3
    //   206: astore_2
    //   207: aload 4
    //   209: invokevirtual 450	java/util/StringTokenizer:nextToken	()Ljava/lang/String;
    //   212: pop
    //   213: aload_3
    //   214: astore_2
    //   215: aload 4
    //   217: invokevirtual 450	java/util/StringTokenizer:nextToken	()Ljava/lang/String;
    //   220: astore 4
    //   222: aload_3
    //   223: astore_2
    //   224: aload 6
    //   226: aload 4
    //   228: invokevirtual 452	java/util/HashSet:contains	(Ljava/lang/Object;)Z
    //   231: ifne -91 -> 140
    //   234: aload_3
    //   235: astore_2
    //   236: aload 5
    //   238: ldc_w 454
    //   241: invokevirtual 436	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   244: ifeq -104 -> 140
    //   247: aload_3
    //   248: astore_2
    //   249: aload 5
    //   251: ldc_w 456
    //   254: invokevirtual 436	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   257: ifne -117 -> 140
    //   260: aload_3
    //   261: astore_2
    //   262: aload 5
    //   264: ldc_w 458
    //   267: invokevirtual 436	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   270: ifne -130 -> 140
    //   273: aload_3
    //   274: astore_2
    //   275: aload 5
    //   277: ldc_w 460
    //   280: invokevirtual 436	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   283: ifne -143 -> 140
    //   286: aload_3
    //   287: astore_2
    //   288: aload 5
    //   290: ldc_w 462
    //   293: invokevirtual 436	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   296: ifne -156 -> 140
    //   299: aload_3
    //   300: astore_2
    //   301: aload 5
    //   303: ldc_w 464
    //   306: invokevirtual 436	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   309: ifne -169 -> 140
    //   312: aload_3
    //   313: astore_2
    //   314: new 141	java/io/File
    //   317: dup
    //   318: aload 4
    //   320: invokespecial 465	java/io/File:<init>	(Ljava/lang/String;)V
    //   323: invokevirtual 254	java/io/File:isDirectory	()Z
    //   326: ifne +543 -> 869
    //   329: aload_3
    //   330: astore_2
    //   331: aload 4
    //   333: bipush 47
    //   335: invokevirtual 468	java/lang/String:lastIndexOf	(I)I
    //   338: istore_1
    //   339: iload_1
    //   340: iconst_m1
    //   341: if_icmpeq +528 -> 869
    //   344: aload_3
    //   345: astore_2
    //   346: new 470	java/lang/StringBuilder
    //   349: dup
    //   350: invokespecial 471	java/lang/StringBuilder:<init>	()V
    //   353: ldc_w 473
    //   356: invokevirtual 477	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   359: aload 4
    //   361: iload_1
    //   362: iconst_1
    //   363: iadd
    //   364: invokevirtual 481	java/lang/String:substring	(I)Ljava/lang/String;
    //   367: invokevirtual 477	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   370: invokevirtual 482	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   373: astore 5
    //   375: aload_3
    //   376: astore_2
    //   377: new 141	java/io/File
    //   380: dup
    //   381: aload 5
    //   383: invokespecial 465	java/io/File:<init>	(Ljava/lang/String;)V
    //   386: invokevirtual 254	java/io/File:isDirectory	()Z
    //   389: ifeq +480 -> 869
    //   392: aload 5
    //   394: astore 4
    //   396: aload_3
    //   397: astore_2
    //   398: aload 6
    //   400: aload 4
    //   402: invokevirtual 417	java/util/HashSet:add	(Ljava/lang/Object;)Z
    //   405: pop
    //   406: aload_3
    //   407: astore_2
    //   408: new 35	org/vidogram/ui/w$d
    //   411: dup
    //   412: aload_0
    //   413: aconst_null
    //   414: invokespecial 245	org/vidogram/ui/w$d:<init>	(Lorg/vidogram/ui/w;Lorg/vidogram/ui/w$1;)V
    //   417: astore 5
    //   419: aload_3
    //   420: astore_2
    //   421: aload 4
    //   423: invokevirtual 284	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   426: ldc_w 484
    //   429: invokevirtual 436	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   432: ifeq +333 -> 765
    //   435: aload_3
    //   436: astore_2
    //   437: aload 5
    //   439: ldc_w 412
    //   442: ldc_w 413
    //   445: invokestatic 115	org/vidogram/messenger/r:a	(Ljava/lang/String;I)Ljava/lang/String;
    //   448: putfield 248	org/vidogram/ui/w$d:b	Ljava/lang/String;
    //   451: aload_3
    //   452: astore_2
    //   453: aload 5
    //   455: ldc_w 414
    //   458: putfield 258	org/vidogram/ui/w$d:a	I
    //   461: aload_3
    //   462: astore_2
    //   463: aload 5
    //   465: aload_0
    //   466: aload 4
    //   468: invokespecial 416	org/vidogram/ui/w:b	(Ljava/lang/String;)Ljava/lang/String;
    //   471: putfield 263	org/vidogram/ui/w$d:c	Ljava/lang/String;
    //   474: aload_3
    //   475: astore_2
    //   476: aload 5
    //   478: new 141	java/io/File
    //   481: dup
    //   482: aload 4
    //   484: invokespecial 465	java/io/File:<init>	(Ljava/lang/String;)V
    //   487: putfield 251	org/vidogram/ui/w$d:f	Ljava/io/File;
    //   490: aload_3
    //   491: astore_2
    //   492: aload_0
    //   493: getfield 74	org/vidogram/ui/w:n	Ljava/util/ArrayList;
    //   496: aload 5
    //   498: invokevirtual 266	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   501: pop
    //   502: goto -362 -> 140
    //   505: astore 4
    //   507: aload_3
    //   508: astore_2
    //   509: ldc_w 345
    //   512: aload 4
    //   514: invokestatic 350	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   517: goto -377 -> 140
    //   520: astore 4
    //   522: aload_3
    //   523: astore_2
    //   524: ldc_w 345
    //   527: aload 4
    //   529: invokestatic 350	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   532: aload_3
    //   533: ifnull +7 -> 540
    //   536: aload_3
    //   537: invokevirtual 487	java/io/BufferedReader:close	()V
    //   540: new 35	org/vidogram/ui/w$d
    //   543: dup
    //   544: aload_0
    //   545: aconst_null
    //   546: invokespecial 245	org/vidogram/ui/w$d:<init>	(Lorg/vidogram/ui/w;Lorg/vidogram/ui/w$1;)V
    //   549: astore_2
    //   550: aload_2
    //   551: ldc_w 489
    //   554: putfield 248	org/vidogram/ui/w$d:b	Ljava/lang/String;
    //   557: aload_2
    //   558: ldc_w 491
    //   561: ldc_w 492
    //   564: invokestatic 115	org/vidogram/messenger/r:a	(Ljava/lang/String;I)Ljava/lang/String;
    //   567: putfield 263	org/vidogram/ui/w$d:c	Ljava/lang/String;
    //   570: aload_2
    //   571: ldc 255
    //   573: putfield 258	org/vidogram/ui/w$d:a	I
    //   576: aload_2
    //   577: new 141	java/io/File
    //   580: dup
    //   581: ldc_w 489
    //   584: invokespecial 465	java/io/File:<init>	(Ljava/lang/String;)V
    //   587: putfield 251	org/vidogram/ui/w$d:f	Ljava/io/File;
    //   590: aload_0
    //   591: getfield 74	org/vidogram/ui/w:n	Ljava/util/ArrayList;
    //   594: aload_2
    //   595: invokevirtual 266	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   598: pop
    //   599: new 141	java/io/File
    //   602: dup
    //   603: invokestatic 155	android/os/Environment:getExternalStorageDirectory	()Ljava/io/File;
    //   606: ldc_w 494
    //   609: invokespecial 497	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   612: astore_2
    //   613: aload_2
    //   614: invokevirtual 500	java/io/File:exists	()Z
    //   617: ifeq +48 -> 665
    //   620: new 35	org/vidogram/ui/w$d
    //   623: dup
    //   624: aload_0
    //   625: aconst_null
    //   626: invokespecial 245	org/vidogram/ui/w$d:<init>	(Lorg/vidogram/ui/w;Lorg/vidogram/ui/w$1;)V
    //   629: astore_3
    //   630: aload_3
    //   631: ldc_w 494
    //   634: putfield 248	org/vidogram/ui/w$d:b	Ljava/lang/String;
    //   637: aload_3
    //   638: aload_2
    //   639: invokevirtual 158	java/io/File:toString	()Ljava/lang/String;
    //   642: putfield 263	org/vidogram/ui/w$d:c	Ljava/lang/String;
    //   645: aload_3
    //   646: ldc 255
    //   648: putfield 258	org/vidogram/ui/w$d:a	I
    //   651: aload_3
    //   652: aload_2
    //   653: putfield 251	org/vidogram/ui/w$d:f	Ljava/io/File;
    //   656: aload_0
    //   657: getfield 74	org/vidogram/ui/w:n	Ljava/util/ArrayList;
    //   660: aload_3
    //   661: invokevirtual 266	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   664: pop
    //   665: new 35	org/vidogram/ui/w$d
    //   668: dup
    //   669: aload_0
    //   670: aconst_null
    //   671: invokespecial 245	org/vidogram/ui/w$d:<init>	(Lorg/vidogram/ui/w;Lorg/vidogram/ui/w$1;)V
    //   674: astore_2
    //   675: aload_2
    //   676: ldc_w 502
    //   679: ldc_w 503
    //   682: invokestatic 115	org/vidogram/messenger/r:a	(Ljava/lang/String;I)Ljava/lang/String;
    //   685: putfield 248	org/vidogram/ui/w$d:b	Ljava/lang/String;
    //   688: aload_2
    //   689: ldc_w 505
    //   692: ldc_w 506
    //   695: invokestatic 115	org/vidogram/messenger/r:a	(Ljava/lang/String;I)Ljava/lang/String;
    //   698: putfield 263	org/vidogram/ui/w$d:c	Ljava/lang/String;
    //   701: aload_2
    //   702: ldc_w 507
    //   705: putfield 258	org/vidogram/ui/w$d:a	I
    //   708: aload_2
    //   709: aconst_null
    //   710: putfield 251	org/vidogram/ui/w$d:f	Ljava/io/File;
    //   713: aload_0
    //   714: getfield 74	org/vidogram/ui/w:n	Ljava/util/ArrayList;
    //   717: aload_2
    //   718: invokevirtual 266	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   721: pop
    //   722: aload_0
    //   723: getfield 197	org/vidogram/ui/w:i	Landroid/widget/ListView;
    //   726: invokestatic 202	org/vidogram/messenger/a:d	(Landroid/view/View;)V
    //   729: aload_0
    //   730: iconst_1
    //   731: putfield 204	org/vidogram/ui/w:u	Z
    //   734: aload_0
    //   735: getfield 206	org/vidogram/ui/w:j	Lorg/vidogram/ui/w$c;
    //   738: invokevirtual 209	org/vidogram/ui/w$c:notifyDataSetChanged	()V
    //   741: return
    //   742: aload_3
    //   743: ldc_w 509
    //   746: ldc_w 510
    //   749: invokestatic 115	org/vidogram/messenger/r:a	(Ljava/lang/String;I)Ljava/lang/String;
    //   752: putfield 248	org/vidogram/ui/w$d:b	Ljava/lang/String;
    //   755: aload_3
    //   756: ldc_w 511
    //   759: putfield 258	org/vidogram/ui/w$d:a	I
    //   762: goto -672 -> 90
    //   765: aload_3
    //   766: astore_2
    //   767: aload 5
    //   769: ldc_w 513
    //   772: ldc_w 514
    //   775: invokestatic 115	org/vidogram/messenger/r:a	(Ljava/lang/String;I)Ljava/lang/String;
    //   778: putfield 248	org/vidogram/ui/w$d:b	Ljava/lang/String;
    //   781: goto -330 -> 451
    //   784: astore 4
    //   786: aload_2
    //   787: astore_3
    //   788: aload 4
    //   790: astore_2
    //   791: aload_3
    //   792: ifnull +7 -> 799
    //   795: aload_3
    //   796: invokevirtual 487	java/io/BufferedReader:close	()V
    //   799: aload_2
    //   800: athrow
    //   801: aload_3
    //   802: ifnull -262 -> 540
    //   805: aload_3
    //   806: invokevirtual 487	java/io/BufferedReader:close	()V
    //   809: goto -269 -> 540
    //   812: astore_2
    //   813: ldc_w 345
    //   816: aload_2
    //   817: invokestatic 350	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   820: goto -280 -> 540
    //   823: astore_2
    //   824: ldc_w 345
    //   827: aload_2
    //   828: invokestatic 350	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   831: goto -291 -> 540
    //   834: astore_3
    //   835: ldc_w 345
    //   838: aload_3
    //   839: invokestatic 350	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   842: goto -43 -> 799
    //   845: astore_2
    //   846: ldc_w 345
    //   849: aload_2
    //   850: invokestatic 350	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   853: goto -188 -> 665
    //   856: astore_2
    //   857: aconst_null
    //   858: astore_3
    //   859: goto -68 -> 791
    //   862: astore 4
    //   864: aconst_null
    //   865: astore_3
    //   866: goto -344 -> 522
    //   869: goto -473 -> 396
    //
    // Exception table:
    //   from	to	target	type
    //   408	419	505	java/lang/Exception
    //   421	435	505	java/lang/Exception
    //   437	451	505	java/lang/Exception
    //   453	461	505	java/lang/Exception
    //   463	474	505	java/lang/Exception
    //   476	490	505	java/lang/Exception
    //   492	502	505	java/lang/Exception
    //   767	781	505	java/lang/Exception
    //   142	148	520	java/lang/Exception
    //   155	166	520	java/lang/Exception
    //   168	179	520	java/lang/Exception
    //   181	189	520	java/lang/Exception
    //   191	205	520	java/lang/Exception
    //   207	213	520	java/lang/Exception
    //   215	222	520	java/lang/Exception
    //   224	234	520	java/lang/Exception
    //   236	247	520	java/lang/Exception
    //   249	260	520	java/lang/Exception
    //   262	273	520	java/lang/Exception
    //   275	286	520	java/lang/Exception
    //   288	299	520	java/lang/Exception
    //   301	312	520	java/lang/Exception
    //   314	329	520	java/lang/Exception
    //   331	339	520	java/lang/Exception
    //   346	375	520	java/lang/Exception
    //   377	392	520	java/lang/Exception
    //   398	406	520	java/lang/Exception
    //   509	517	520	java/lang/Exception
    //   142	148	784	finally
    //   155	166	784	finally
    //   168	179	784	finally
    //   181	189	784	finally
    //   191	205	784	finally
    //   207	213	784	finally
    //   215	222	784	finally
    //   224	234	784	finally
    //   236	247	784	finally
    //   249	260	784	finally
    //   262	273	784	finally
    //   275	286	784	finally
    //   288	299	784	finally
    //   301	312	784	finally
    //   314	329	784	finally
    //   331	339	784	finally
    //   346	375	784	finally
    //   377	392	784	finally
    //   398	406	784	finally
    //   408	419	784	finally
    //   421	435	784	finally
    //   437	451	784	finally
    //   453	461	784	finally
    //   463	474	784	finally
    //   476	490	784	finally
    //   492	502	784	finally
    //   509	517	784	finally
    //   524	532	784	finally
    //   767	781	784	finally
    //   805	809	812	java/lang/Exception
    //   536	540	823	java/lang/Exception
    //   795	799	834	java/lang/Exception
    //   599	665	845	java/lang/Exception
    //   122	140	856	finally
    //   122	140	862	java/lang/Exception
  }

  public View a(Context paramContext)
  {
    if (!this.o)
    {
      this.o = true;
      localObject = new IntentFilter();
      ((IntentFilter)localObject).addAction("android.intent.action.MEDIA_BAD_REMOVAL");
      ((IntentFilter)localObject).addAction("android.intent.action.MEDIA_CHECKING");
      ((IntentFilter)localObject).addAction("android.intent.action.MEDIA_EJECT");
      ((IntentFilter)localObject).addAction("android.intent.action.MEDIA_MOUNTED");
      ((IntentFilter)localObject).addAction("android.intent.action.MEDIA_NOFS");
      ((IntentFilter)localObject).addAction("android.intent.action.MEDIA_REMOVED");
      ((IntentFilter)localObject).addAction("android.intent.action.MEDIA_SHARED");
      ((IntentFilter)localObject).addAction("android.intent.action.MEDIA_UNMOUNTABLE");
      ((IntentFilter)localObject).addAction("android.intent.action.MEDIA_UNMOUNTED");
      ((IntentFilter)localObject).addDataScheme("file");
      ApplicationLoader.a.registerReceiver(this.v, (IntentFilter)localObject);
    }
    this.d.setBackButtonDrawable(new f(false));
    this.d.setAllowOverlayTitle(true);
    this.d.setTitle(r.a("SelectFile", 2131231792));
    this.d.setActionBarMenuOnItemClick(new a.a()
    {
      public void a(int paramInt)
      {
        if (paramInt == -1)
          if (w.d(w.this).f())
          {
            w.e(w.this).clear();
            w.f(w.this).d();
            w.c(w.this).invalidateViews();
          }
        do
        {
          return;
          w.this.d();
          return;
        }
        while ((paramInt != 3) || (w.g(w.this) == null));
        ArrayList localArrayList = new ArrayList();
        localArrayList.addAll(w.e(w.this).keySet());
        w.g(w.this).a(w.this, localArrayList);
      }
    });
    this.s.clear();
    this.t.clear();
    Object localObject = this.d.b();
    this.k = new ac(((c)localObject).getContext());
    this.k.setTextSize(18);
    this.k.setTypeface(org.vidogram.messenger.a.a("fonts/rmedium.ttf"));
    this.k.setTextColor(-9211021);
    this.k.setOnTouchListener(new View.OnTouchListener()
    {
      public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
      {
        return true;
      }
    });
    ((c)localObject).addView(this.k, v.a(0, -1, 1.0F, 65, 0, 0, 0));
    this.t.add(((c)localObject).a(3, 2130837797, -986896, null, org.vidogram.messenger.a.a(54.0F)));
    this.b = l().getLayoutInflater().inflate(2130968611, null, false);
    this.j = new c(paramContext);
    this.l = ((TextView)this.b.findViewById(2131624057));
    this.l.setOnTouchListener(new View.OnTouchListener()
    {
      public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
      {
        return true;
      }
    });
    this.i = ((ListView)this.b.findViewById(2131624056));
    this.i.setEmptyView(this.l);
    this.i.setAdapter(this.j);
    this.i.setOnScrollListener(new AbsListView.OnScrollListener()
    {
      public void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
      {
      }

      public void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
      {
        paramAbsListView = w.this;
        if (paramInt != 0);
        for (boolean bool = true; ; bool = false)
        {
          w.a(paramAbsListView, bool);
          return;
        }
      }
    });
    this.i.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener()
    {
      public boolean onItemLongClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
      {
        if ((w.h(w.this).f()) || (paramInt < 0) || (paramInt >= w.i(w.this).size()));
        while (true)
        {
          return false;
          paramAdapterView = (w.d)w.i(w.this).get(paramInt);
          Object localObject = paramAdapterView.f;
          if ((localObject == null) || (((File)localObject).isDirectory()))
            break;
          if (!((File)localObject).canRead())
          {
            w.a(w.this, r.a("AccessError", 2131230763));
            return false;
          }
          if ((w.j(w.this) != 0L) && (((File)localObject).length() > w.j(w.this)))
          {
            w.a(w.this, r.a("FileUploadLimit", 2131231194, new Object[] { org.vidogram.messenger.a.c(w.j(w.this)) }));
            return false;
          }
          if (((File)localObject).length() == 0L)
            continue;
          w.e(w.this).put(((File)localObject).toString(), paramAdapterView);
          w.k(w.this).a(1, false);
          paramAdapterView = new AnimatorSet();
          localObject = new ArrayList();
          paramInt = 0;
          while (paramInt < w.l(w.this).size())
          {
            View localView = (View)w.l(w.this).get(paramInt);
            org.vidogram.messenger.a.d(localView);
            ((ArrayList)localObject).add(ObjectAnimator.ofFloat(localView, "scaleY", new float[] { 0.1F, 1.0F }));
            paramInt += 1;
          }
          paramAdapterView.playTogether((Collection)localObject);
          paramAdapterView.setDuration(250L);
          paramAdapterView.start();
          w.a(w.this, false);
          if ((paramView instanceof ar))
            ((ar)paramView).a(true, true);
          w.m(w.this).c();
        }
        return true;
      }
    });
    this.i.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
      {
        if ((paramInt < 0) || (paramInt >= w.i(w.this).size()));
        label466: 
        do
        {
          w.d locald;
          do
          {
            return;
            locald = (w.d)w.i(w.this).get(paramInt);
            File localFile = locald.f;
            if (localFile == null)
            {
              if (locald.a == 2130837897)
              {
                if (w.g(w.this) != null)
                  w.g(w.this).a();
                w.this.a(false);
                return;
              }
              paramAdapterView = (w.b)w.n(w.this).remove(w.n(w.this).size() - 1);
              w.o(w.this).setTitle(paramAdapterView.d);
              if (paramAdapterView.c != null)
                w.a(w.this, paramAdapterView.c);
              while (true)
              {
                w.c(w.this).setSelectionFromTop(paramAdapterView.a, paramAdapterView.b);
                return;
                w.b(w.this);
              }
            }
            if (localFile.isDirectory())
            {
              paramAdapterView = new w.b(w.this, null);
              paramAdapterView.a = w.c(w.this).getFirstVisiblePosition();
              paramAdapterView.b = w.c(w.this).getChildAt(0).getTop();
              paramAdapterView.c = w.a(w.this);
              paramAdapterView.d = w.p(w.this).getTitle();
              w.n(w.this).add(paramAdapterView);
              if (!w.a(w.this, localFile))
              {
                w.n(w.this).remove(paramAdapterView);
                return;
              }
              w.q(w.this).setTitle(locald.b);
              w.c(w.this).setSelection(0);
              return;
            }
            paramAdapterView = localFile;
            if (!localFile.canRead())
            {
              w.a(w.this, r.a("AccessError", 2131230763));
              paramAdapterView = new File("/mnt/sdcard");
            }
            if ((w.j(w.this) == 0L) || (paramAdapterView.length() <= w.j(w.this)))
              continue;
            w.a(w.this, r.a("FileUploadLimit", 2131231194, new Object[] { org.vidogram.messenger.a.c(w.j(w.this)) }));
            return;
          }
          while (paramAdapterView.length() == 0L);
          if (!w.r(w.this).f())
            continue;
          if (w.e(w.this).containsKey(paramAdapterView.toString()))
          {
            w.e(w.this).remove(paramAdapterView.toString());
            if (!w.e(w.this).isEmpty())
              break label552;
            w.s(w.this).d();
          }
          while (true)
          {
            w.a(w.this, false);
            if (!(paramView instanceof ar))
              break;
            ((ar)paramView).a(w.e(w.this).containsKey(locald.f.toString()), true);
            return;
            w.e(w.this).put(paramAdapterView.toString(), locald);
            break label466;
            w.k(w.this).a(w.e(w.this).size(), true);
          }
        }
        while (w.g(w.this) == null);
        label552: paramView = new ArrayList();
        paramView.add(paramAdapterView.getAbsolutePath());
        w.g(w.this).a(w.this, paramView);
      }
    });
    r();
    return (View)this.b;
  }

  public void a(Configuration paramConfiguration)
  {
    super.a(paramConfiguration);
    if (this.i != null)
      this.i.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener()
      {
        public boolean onPreDraw()
        {
          w.c(w.this).getViewTreeObserver().removeOnPreDrawListener(this);
          w.t(w.this);
          return true;
        }
      });
  }

  public void a(a parama)
  {
    this.r = parama;
  }

  public void g()
  {
    try
    {
      if (this.o)
        ApplicationLoader.a.unregisterReceiver(this.v);
      super.g();
      return;
    }
    catch (Exception localException)
    {
      while (true)
        n.a("tmessages", localException);
    }
  }

  public void i()
  {
    super.i();
    if (this.j != null)
      this.j.notifyDataSetChanged();
    q();
  }

  public boolean k()
  {
    if (this.p.size() > 0)
    {
      b localb = (b)this.p.remove(this.p.size() - 1);
      this.d.setTitle(localb.d);
      if (localb.c != null)
        a(localb.c);
      while (true)
      {
        this.i.setSelectionFromTop(localb.a, localb.b);
        return false;
        r();
      }
    }
    return super.k();
  }

  public static abstract interface a
  {
    public abstract void a();

    public abstract void a(w paramw, ArrayList<String> paramArrayList);
  }

  private class b
  {
    int a;
    int b;
    File c;
    String d;

    private b()
    {
    }
  }

  private class c extends org.vidogram.ui.b.a
  {
    private Context b;

    public c(Context arg2)
    {
      Object localObject;
      this.b = localObject;
    }

    public int getCount()
    {
      return w.i(w.this).size();
    }

    public Object getItem(int paramInt)
    {
      return w.i(w.this).get(paramInt);
    }

    public long getItemId(int paramInt)
    {
      return 0L;
    }

    public int getItemViewType(int paramInt)
    {
      if (((w.d)w.i(w.this).get(paramInt)).c.length() > 0)
        return 0;
      return 1;
    }

    public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      boolean bool1 = true;
      if (paramView == null)
        paramView = new ar(this.b);
      while (true)
      {
        paramViewGroup = (ar)paramView;
        w.d locald = (w.d)w.i(w.this).get(paramInt);
        boolean bool2;
        if (locald.a != 0)
        {
          ((ar)paramView).a(locald.b, locald.c, null, null, locald.a);
          if ((locald.f == null) || (!w.u(w.this).f()))
            break label196;
          bool2 = w.e(w.this).containsKey(locald.f.toString());
          if (w.v(w.this))
            break label190;
        }
        label190: for (bool1 = true; ; bool1 = false)
        {
          paramViewGroup.a(bool2, bool1);
          return paramView;
          String str = locald.d.toUpperCase().substring(0, Math.min(locald.d.length(), 4));
          ((ar)paramView).a(locald.b, locald.c, str, locald.e, 0);
          break;
        }
        label196: if (!w.v(w.this));
        while (true)
        {
          paramViewGroup.a(false, bool1);
          return paramView;
          bool1 = false;
        }
      }
    }

    public int getViewTypeCount()
    {
      return 2;
    }
  }

  private class d
  {
    int a;
    String b;
    String c = "";
    String d = "";
    String e;
    File f;

    private d()
    {
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.w
 * JD-Core Version:    0.6.0
 */