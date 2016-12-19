package org.vidogram.ui;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlarmManager;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.PendingIntent;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import itman.robert.b.c.a;
import itman.robert.b.d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.vidogram.messenger.ApplicationLoader;
import org.vidogram.messenger.n;
import org.vidogram.messenger.p;
import org.vidogram.messenger.r;
import org.vidogram.messenger.x;
import org.vidogram.messenger.y.b;
import org.vidogram.tgnet.ConnectionsManager;
import org.vidogram.tgnet.g.au;
import org.vidogram.tgnet.g.gf;
import org.vidogram.tgnet.g.ls;
import org.vidogram.tgnet.g.oz;
import org.vidogram.tgnet.g.qg;
import org.vidogram.tgnet.g.vw;
import org.vidogram.ui.Components.ae.b;
import org.vidogram.ui.Components.bl;
import org.vidogram.ui.a.b.a;
import org.vidogram.ui.a.g;
import org.vidogram.ui.a.i;
import org.vidogram.ui.b.k;

public class LaunchActivity extends Activity
  implements y.b, b.a, v.a
{
  private static ArrayList<g> l = new ArrayList();
  private static ArrayList<g> m = new ArrayList();
  private static ArrayList<g> n = new ArrayList();
  private boolean A;
  private boolean B;
  private boolean C;
  private Runnable D;
  protected i a;
  private boolean b;
  private String c;
  private String d;
  private ArrayList<Uri> e;
  private ArrayList<String> f;
  private ArrayList<Uri> g;
  private String h;
  private ArrayList<String> i;
  private ArrayList<g.vw> j;
  private int k;
  private ViewTreeObserver.OnGlobalLayoutListener o;
  private org.vidogram.ui.a.b p;
  private org.vidogram.ui.a.b q;
  private org.vidogram.ui.a.b r;
  private FrameLayout s;
  private FrameLayout t;
  private View u;
  private k v;
  private org.vidogram.ui.Components.ae w;
  private AlertDialog x;
  private ListView y;
  private Intent z;

  private void a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, boolean paramBoolean, Integer paramInteger, String paramString7, int paramInt)
  {
    ProgressDialog localProgressDialog = new ProgressDialog(this);
    localProgressDialog.setMessage(r.a("Loading", 2131231394));
    localProgressDialog.setCanceledOnTouchOutside(false);
    localProgressDialog.setCancelable(false);
    int i2 = 0;
    int i1;
    if (paramString1 != null)
    {
      paramString2 = new g.gf();
      paramString2.c = paramString1;
      i1 = ConnectionsManager.a().a(paramString2, new org.vidogram.tgnet.c(localProgressDialog, paramString7, paramString5, paramString4, paramInteger)
      {
      });
    }
    while (true)
    {
      if (i1 != 0)
      {
        localProgressDialog.setButton(-2, r.a("Cancel", 2131230943), new DialogInterface.OnClickListener(i1)
        {
          public void onClick(DialogInterface paramDialogInterface, int paramInt)
          {
            ConnectionsManager.a().a(this.a, true);
            try
            {
              paramDialogInterface.dismiss();
              return;
            }
            catch (Exception paramDialogInterface)
            {
              n.a("tmessages", paramDialogInterface);
            }
          }
        });
        localProgressDialog.show();
      }
      do
      {
        return;
        if (paramString2 != null)
        {
          if (paramInt == 0)
          {
            g.oz localoz = new g.oz();
            localoz.c = paramString2;
            i1 = ConnectionsManager.a().a(localoz, new org.vidogram.tgnet.c(localProgressDialog, paramString2, paramString1, paramString3, paramString4, paramString5, paramString6, paramBoolean, paramInteger, paramString7)
            {
            }
            , 2);
            break;
          }
          i1 = i2;
          if (paramInt != 1)
            break;
          paramString1 = new g.qg();
          paramString1.c = paramString2;
          ConnectionsManager.a().a(paramString1, new org.vidogram.tgnet.c(localProgressDialog)
          {
          }
          , 2);
          i1 = i2;
          break;
        }
        if (paramString3 == null)
          break label290;
      }
      while (l.isEmpty());
      paramString1 = new g.ls();
      paramString1.d = paramString3;
      paramString2 = (g)l.get(l.size() - 1);
      paramString2.b(new bl(this, paramString2, paramString1, null, null));
      return;
      label290: i1 = i2;
      if (paramString6 == null)
        continue;
      paramString1 = new Bundle();
      paramString1.putBoolean("onlySelect", true);
      paramString1 = new v(paramString1);
      paramString1.a(new v.a(paramBoolean, paramString6)
      {
        public void a(v paramv, long paramLong, boolean paramBoolean)
        {
          Bundle localBundle = new Bundle();
          localBundle.putBoolean("scrollToTopOnResume", true);
          localBundle.putBoolean("hasUrl", this.a);
          int i = (int)paramLong;
          int j = (int)(paramLong >> 32);
          if (i != 0)
            if (j == 1)
              localBundle.putInt("chat_id", i);
          while (true)
          {
            if (org.vidogram.messenger.v.a(localBundle, paramv))
            {
              org.vidogram.messenger.y.a().a(org.vidogram.messenger.y.d, new Object[0]);
              org.vidogram.messenger.d.b.a(paramLong, this.b, null, null, true);
              LaunchActivity.a(LaunchActivity.this).a(new q(localBundle), true, false, true);
            }
            return;
            if (i > 0)
            {
              localBundle.putInt("user_id", i);
              continue;
            }
            if (i >= 0)
              continue;
            localBundle.putInt("chat_id", -i);
            continue;
            localBundle.putInt("enc_id", j);
          }
        }
      });
      a(paramString1, false, true);
      i1 = i2;
    }
  }

  // ERROR //
  private boolean a(Intent paramIntent, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual 258	android/content/Intent:getFlags	()I
    //   4: istore 5
    //   6: iload 4
    //   8: ifne +41 -> 49
    //   11: iconst_1
    //   12: invokestatic 263	org/vidogram/messenger/a:c	(Z)Z
    //   15: ifne +9 -> 24
    //   18: getstatic 267	org/vidogram/messenger/ad:o	Z
    //   21: ifeq +28 -> 49
    //   24: aload_0
    //   25: invokespecial 269	org/vidogram/ui/LaunchActivity:d	()V
    //   28: aload_0
    //   29: aload_1
    //   30: putfield 123	org/vidogram/ui/LaunchActivity:z	Landroid/content/Intent;
    //   33: aload_0
    //   34: iload_2
    //   35: putfield 271	org/vidogram/ui/LaunchActivity:A	Z
    //   38: aload_0
    //   39: iload_3
    //   40: putfield 273	org/vidogram/ui/LaunchActivity:B	Z
    //   43: iconst_0
    //   44: invokestatic 275	org/vidogram/messenger/ad:a	(Z)V
    //   47: iconst_0
    //   48: ireturn
    //   49: iconst_0
    //   50: istore 8
    //   52: iconst_0
    //   53: istore 4
    //   55: iconst_0
    //   56: invokestatic 281	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   59: astore 24
    //   61: iconst_0
    //   62: invokestatic 281	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   65: astore 25
    //   67: iconst_0
    //   68: invokestatic 281	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   71: astore 26
    //   73: iconst_0
    //   74: invokestatic 281	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   77: astore 23
    //   79: aload_1
    //   80: ifnull +5114 -> 5194
    //   83: aload_1
    //   84: invokevirtual 285	android/content/Intent:getExtras	()Landroid/os/Bundle;
    //   87: ifnull +5107 -> 5194
    //   90: aload_1
    //   91: invokevirtual 285	android/content/Intent:getExtras	()Landroid/os/Bundle;
    //   94: ldc_w 287
    //   97: lconst_0
    //   98: invokevirtual 291	android/os/Bundle:getLong	(Ljava/lang/String;J)J
    //   101: lstore 11
    //   103: iconst_0
    //   104: istore 7
    //   106: aload_0
    //   107: aconst_null
    //   108: putfield 293	org/vidogram/ui/LaunchActivity:e	Ljava/util/ArrayList;
    //   111: aload_0
    //   112: aconst_null
    //   113: putfield 294	org/vidogram/ui/LaunchActivity:c	Ljava/lang/String;
    //   116: aload_0
    //   117: aconst_null
    //   118: putfield 295	org/vidogram/ui/LaunchActivity:d	Ljava/lang/String;
    //   121: aload_0
    //   122: aconst_null
    //   123: putfield 297	org/vidogram/ui/LaunchActivity:f	Ljava/util/ArrayList;
    //   126: aload_0
    //   127: aconst_null
    //   128: putfield 299	org/vidogram/ui/LaunchActivity:i	Ljava/util/ArrayList;
    //   131: aload_0
    //   132: aconst_null
    //   133: putfield 301	org/vidogram/ui/LaunchActivity:h	Ljava/lang/String;
    //   136: aload_0
    //   137: aconst_null
    //   138: putfield 303	org/vidogram/ui/LaunchActivity:g	Ljava/util/ArrayList;
    //   141: aload_0
    //   142: aconst_null
    //   143: putfield 305	org/vidogram/ui/LaunchActivity:j	Ljava/util/ArrayList;
    //   146: invokestatic 307	org/vidogram/messenger/ad:b	()Z
    //   149: ifeq +4784 -> 4933
    //   152: ldc_w 308
    //   155: iload 5
    //   157: iand
    //   158: ifne +4775 -> 4933
    //   161: aload_1
    //   162: ifnull +4771 -> 4933
    //   165: aload_1
    //   166: invokevirtual 312	android/content/Intent:getAction	()Ljava/lang/String;
    //   169: ifnull +4764 -> 4933
    //   172: iload_3
    //   173: ifne +4760 -> 4933
    //   176: ldc_w 314
    //   179: aload_1
    //   180: invokevirtual 312	android/content/Intent:getAction	()Ljava/lang/String;
    //   183: invokevirtual 320	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   186: ifeq +1471 -> 1657
    //   189: iconst_0
    //   190: istore 6
    //   192: aload_1
    //   193: invokevirtual 323	android/content/Intent:getType	()Ljava/lang/String;
    //   196: astore 15
    //   198: aload 15
    //   200: ifnull +976 -> 1176
    //   203: aload 15
    //   205: ldc_w 325
    //   208: invokevirtual 320	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   211: ifeq +965 -> 1176
    //   214: aload_1
    //   215: invokevirtual 285	android/content/Intent:getExtras	()Landroid/os/Bundle;
    //   218: ldc_w 327
    //   221: invokevirtual 330	android/os/Bundle:get	(Ljava/lang/String;)Ljava/lang/Object;
    //   224: checkcast 332	android/net/Uri
    //   227: astore 13
    //   229: aload 13
    //   231: ifnull +939 -> 1170
    //   234: aload_0
    //   235: invokevirtual 336	org/vidogram/ui/LaunchActivity:getContentResolver	()Landroid/content/ContentResolver;
    //   238: aload 13
    //   240: invokevirtual 342	android/content/ContentResolver:openInputStream	(Landroid/net/Uri;)Ljava/io/InputStream;
    //   243: astore 18
    //   245: new 109	java/util/ArrayList
    //   248: dup
    //   249: invokespecial 112	java/util/ArrayList:<init>	()V
    //   252: astore 17
    //   254: aconst_null
    //   255: astore 13
    //   257: new 344	java/io/BufferedReader
    //   260: dup
    //   261: new 346	java/io/InputStreamReader
    //   264: dup
    //   265: aload 18
    //   267: ldc_w 348
    //   270: invokespecial 351	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;Ljava/lang/String;)V
    //   273: invokespecial 354	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   276: astore 19
    //   278: aload 19
    //   280: invokevirtual 357	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   283: astore 14
    //   285: aload 14
    //   287: ifnull +693 -> 980
    //   290: ldc_w 359
    //   293: aload 14
    //   295: invokestatic 364	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   298: aload 14
    //   300: ldc_w 366
    //   303: invokevirtual 370	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   306: astore 20
    //   308: aload 20
    //   310: arraylength
    //   311: iconst_2
    //   312: if_icmpne -34 -> 278
    //   315: aload 20
    //   317: iconst_0
    //   318: aaload
    //   319: ldc_w 372
    //   322: invokevirtual 320	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   325: ifeq +38 -> 363
    //   328: aload 20
    //   330: iconst_1
    //   331: aaload
    //   332: ldc_w 374
    //   335: invokevirtual 320	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   338: ifeq +25 -> 363
    //   341: new 56	org/vidogram/ui/LaunchActivity$a
    //   344: dup
    //   345: aload_0
    //   346: aconst_null
    //   347: invokespecial 377	org/vidogram/ui/LaunchActivity$a:<init>	(Lorg/vidogram/ui/LaunchActivity;Lorg/vidogram/ui/LaunchActivity$1;)V
    //   350: astore 13
    //   352: aload 17
    //   354: aload 13
    //   356: invokevirtual 380	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   359: pop
    //   360: goto +4826 -> 5186
    //   363: aload 20
    //   365: iconst_0
    //   366: aaload
    //   367: ldc_w 382
    //   370: invokevirtual 320	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   373: ifeq +4813 -> 5186
    //   376: aload 20
    //   378: iconst_1
    //   379: aaload
    //   380: ldc_w 374
    //   383: invokevirtual 320	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   386: ifeq +4800 -> 5186
    //   389: aconst_null
    //   390: astore 13
    //   392: goto +4794 -> 5186
    //   395: aload 20
    //   397: iconst_0
    //   398: aaload
    //   399: ldc_w 384
    //   402: invokevirtual 388	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   405: ifne +27 -> 432
    //   408: aload 20
    //   410: iconst_0
    //   411: aaload
    //   412: ldc_w 390
    //   415: invokevirtual 388	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   418: ifeq +517 -> 935
    //   421: aload 13
    //   423: getfield 392	org/vidogram/ui/LaunchActivity$a:a	Ljava/lang/String;
    //   426: invokestatic 397	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   429: ifeq +506 -> 935
    //   432: aload 20
    //   434: iconst_0
    //   435: aaload
    //   436: ldc_w 399
    //   439: invokevirtual 370	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   442: astore 21
    //   444: aload 21
    //   446: arraylength
    //   447: istore 6
    //   449: aconst_null
    //   450: astore 14
    //   452: aconst_null
    //   453: astore 15
    //   455: iconst_0
    //   456: istore 5
    //   458: iload 5
    //   460: iload 6
    //   462: if_icmpge +82 -> 544
    //   465: aload 21
    //   467: iload 5
    //   469: aaload
    //   470: ldc_w 401
    //   473: invokevirtual 370	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   476: astore 22
    //   478: aload 22
    //   480: arraylength
    //   481: iconst_2
    //   482: if_icmpeq +10 -> 492
    //   485: aload 14
    //   487: astore 16
    //   489: goto +4711 -> 5200
    //   492: aload 22
    //   494: iconst_0
    //   495: aaload
    //   496: ldc_w 403
    //   499: invokevirtual 320	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   502: ifeq +12 -> 514
    //   505: aload 22
    //   507: iconst_1
    //   508: aaload
    //   509: astore 16
    //   511: goto +4689 -> 5200
    //   514: aload 14
    //   516: astore 16
    //   518: aload 22
    //   520: iconst_0
    //   521: aaload
    //   522: ldc_w 405
    //   525: invokevirtual 320	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   528: ifeq +4672 -> 5200
    //   531: aload 22
    //   533: iconst_1
    //   534: aaload
    //   535: astore 15
    //   537: aload 14
    //   539: astore 16
    //   541: goto +4659 -> 5200
    //   544: aload 13
    //   546: aload 20
    //   548: iconst_1
    //   549: aaload
    //   550: putfield 392	org/vidogram/ui/LaunchActivity$a:a	Ljava/lang/String;
    //   553: aload 15
    //   555: ifnull +4658 -> 5213
    //   558: aload 15
    //   560: ldc_w 407
    //   563: invokevirtual 410	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   566: ifeq +4647 -> 5213
    //   569: aload 13
    //   571: getfield 392	org/vidogram/ui/LaunchActivity$a:a	Ljava/lang/String;
    //   574: ldc_w 401
    //   577: invokevirtual 413	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   580: ifeq +44 -> 624
    //   583: aload 15
    //   585: ifnull +39 -> 624
    //   588: aload 13
    //   590: aload 13
    //   592: getfield 392	org/vidogram/ui/LaunchActivity$a:a	Ljava/lang/String;
    //   595: iconst_0
    //   596: aload 13
    //   598: getfield 392	org/vidogram/ui/LaunchActivity$a:a	Ljava/lang/String;
    //   601: invokevirtual 416	java/lang/String:length	()I
    //   604: iconst_1
    //   605: isub
    //   606: invokevirtual 420	java/lang/String:substring	(II)Ljava/lang/String;
    //   609: putfield 392	org/vidogram/ui/LaunchActivity$a:a	Ljava/lang/String;
    //   612: aload 19
    //   614: invokevirtual 357	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   617: astore 16
    //   619: aload 16
    //   621: ifnonnull +55 -> 676
    //   624: aload 13
    //   626: getfield 392	org/vidogram/ui/LaunchActivity$a:a	Ljava/lang/String;
    //   629: invokevirtual 424	java/lang/String:getBytes	()[B
    //   632: invokestatic 427	org/vidogram/messenger/a:a	([B)[B
    //   635: astore 15
    //   637: aload 15
    //   639: ifnull +4574 -> 5213
    //   642: aload 15
    //   644: arraylength
    //   645: ifeq +4568 -> 5213
    //   648: new 316	java/lang/String
    //   651: dup
    //   652: aload 15
    //   654: aload 14
    //   656: invokespecial 430	java/lang/String:<init>	([BLjava/lang/String;)V
    //   659: astore 14
    //   661: aload 14
    //   663: ifnull +4550 -> 5213
    //   666: aload 13
    //   668: aload 14
    //   670: putfield 392	org/vidogram/ui/LaunchActivity$a:a	Ljava/lang/String;
    //   673: goto +4540 -> 5213
    //   676: aload 13
    //   678: new 432	java/lang/StringBuilder
    //   681: dup
    //   682: invokespecial 433	java/lang/StringBuilder:<init>	()V
    //   685: aload 13
    //   687: getfield 392	org/vidogram/ui/LaunchActivity$a:a	Ljava/lang/String;
    //   690: invokevirtual 437	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   693: aload 16
    //   695: invokevirtual 437	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   698: invokevirtual 440	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   701: putfield 392	org/vidogram/ui/LaunchActivity$a:a	Ljava/lang/String;
    //   704: goto -135 -> 569
    //   707: astore 13
    //   709: ldc_w 359
    //   712: aload 13
    //   714: invokestatic 443	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   717: iconst_1
    //   718: istore 5
    //   720: iload 5
    //   722: ifeq +14 -> 736
    //   725: aload_0
    //   726: ldc_w 445
    //   729: iconst_0
    //   730: invokestatic 451	android/widget/Toast:makeText	(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
    //   733: invokevirtual 452	android/widget/Toast:show	()V
    //   736: iconst_0
    //   737: istore 5
    //   739: aload 23
    //   741: astore 13
    //   743: iload 7
    //   745: istore 6
    //   747: aload 24
    //   749: astore 14
    //   751: aload 14
    //   753: invokevirtual 455	java/lang/Integer:intValue	()I
    //   756: ifeq +3157 -> 3913
    //   759: new 229	android/os/Bundle
    //   762: dup
    //   763: invokespecial 230	android/os/Bundle:<init>	()V
    //   766: astore 13
    //   768: aload 13
    //   770: ldc_w 457
    //   773: aload 14
    //   775: invokevirtual 455	java/lang/Integer:intValue	()I
    //   778: invokevirtual 461	android/os/Bundle:putInt	(Ljava/lang/String;I)V
    //   781: getstatic 114	org/vidogram/ui/LaunchActivity:l	Ljava/util/ArrayList;
    //   784: invokevirtual 204	java/util/ArrayList:isEmpty	()Z
    //   787: ifne +28 -> 815
    //   790: aload 13
    //   792: getstatic 114	org/vidogram/ui/LaunchActivity:l	Ljava/util/ArrayList;
    //   795: getstatic 114	org/vidogram/ui/LaunchActivity:l	Ljava/util/ArrayList;
    //   798: invokevirtual 213	java/util/ArrayList:size	()I
    //   801: iconst_1
    //   802: isub
    //   803: invokevirtual 217	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   806: checkcast 219	org/vidogram/ui/a/g
    //   809: invokestatic 466	org/vidogram/messenger/v:a	(Landroid/os/Bundle;Lorg/vidogram/ui/a/g;)Z
    //   812: ifeq +4116 -> 4928
    //   815: new 468	org/vidogram/ui/q
    //   818: dup
    //   819: aload 13
    //   821: invokespecial 469	org/vidogram/ui/q:<init>	(Landroid/os/Bundle;)V
    //   824: astore 13
    //   826: aload_0
    //   827: getfield 129	org/vidogram/ui/LaunchActivity:p	Lorg/vidogram/ui/a/b;
    //   830: aload 13
    //   832: iconst_0
    //   833: iconst_1
    //   834: iconst_1
    //   835: invokevirtual 474	org/vidogram/ui/a/b:a	(Lorg/vidogram/ui/a/g;ZZZ)Z
    //   838: ifeq +4090 -> 4928
    //   841: iconst_1
    //   842: istore_3
    //   843: iload_3
    //   844: ifne +83 -> 927
    //   847: iload_2
    //   848: ifne +79 -> 927
    //   851: invokestatic 476	org/vidogram/messenger/a:c	()Z
    //   854: ifeq +3991 -> 4845
    //   857: invokestatic 307	org/vidogram/messenger/ad:b	()Z
    //   860: ifne +3944 -> 4804
    //   863: aload_0
    //   864: getfield 478	org/vidogram/ui/LaunchActivity:q	Lorg/vidogram/ui/a/b;
    //   867: getfield 479	org/vidogram/ui/a/b:e	Ljava/util/ArrayList;
    //   870: invokevirtual 204	java/util/ArrayList:isEmpty	()Z
    //   873: ifeq +27 -> 900
    //   876: aload_0
    //   877: getfield 478	org/vidogram/ui/LaunchActivity:q	Lorg/vidogram/ui/a/b;
    //   880: new 481	org/vidogram/ui/ae
    //   883: dup
    //   884: invokespecial 482	org/vidogram/ui/ae:<init>	()V
    //   887: invokevirtual 485	org/vidogram/ui/a/b:b	(Lorg/vidogram/ui/a/g;)Z
    //   890: pop
    //   891: aload_0
    //   892: getfield 487	org/vidogram/ui/LaunchActivity:a	Lorg/vidogram/ui/a/i;
    //   895: iconst_0
    //   896: iconst_0
    //   897: invokevirtual 492	org/vidogram/ui/a/i:a	(ZZ)V
    //   900: aload_0
    //   901: getfield 129	org/vidogram/ui/LaunchActivity:p	Lorg/vidogram/ui/a/b;
    //   904: invokevirtual 494	org/vidogram/ui/a/b:h	()V
    //   907: invokestatic 476	org/vidogram/messenger/a:c	()Z
    //   910: ifeq +17 -> 927
    //   913: aload_0
    //   914: getfield 478	org/vidogram/ui/LaunchActivity:q	Lorg/vidogram/ui/a/b;
    //   917: invokevirtual 494	org/vidogram/ui/a/b:h	()V
    //   920: aload_0
    //   921: getfield 496	org/vidogram/ui/LaunchActivity:r	Lorg/vidogram/ui/a/b;
    //   924: invokevirtual 494	org/vidogram/ui/a/b:h	()V
    //   927: aload_1
    //   928: aconst_null
    //   929: invokevirtual 500	android/content/Intent:setAction	(Ljava/lang/String;)Landroid/content/Intent;
    //   932: pop
    //   933: iload_3
    //   934: ireturn
    //   935: aload 20
    //   937: iconst_0
    //   938: aaload
    //   939: ldc_w 502
    //   942: invokevirtual 388	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   945: ifeq +4268 -> 5213
    //   948: aload 20
    //   950: iconst_1
    //   951: aaload
    //   952: iconst_1
    //   953: invokestatic 507	org/vidogram/a/b:a	(Ljava/lang/String;Z)Ljava/lang/String;
    //   956: astore 14
    //   958: aload 14
    //   960: invokevirtual 416	java/lang/String:length	()I
    //   963: ifle +4250 -> 5213
    //   966: aload 13
    //   968: getfield 509	org/vidogram/ui/LaunchActivity$a:b	Ljava/util/ArrayList;
    //   971: aload 14
    //   973: invokevirtual 380	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   976: pop
    //   977: goto +4236 -> 5213
    //   980: aload 19
    //   982: invokevirtual 512	java/io/BufferedReader:close	()V
    //   985: aload 18
    //   987: invokevirtual 515	java/io/InputStream:close	()V
    //   990: iconst_0
    //   991: istore 5
    //   993: iload 5
    //   995: aload 17
    //   997: invokevirtual 213	java/util/ArrayList:size	()I
    //   1000: if_icmpge +164 -> 1164
    //   1003: aload 17
    //   1005: iload 5
    //   1007: invokevirtual 217	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   1010: checkcast 56	org/vidogram/ui/LaunchActivity$a
    //   1013: astore 13
    //   1015: aload 13
    //   1017: getfield 392	org/vidogram/ui/LaunchActivity$a:a	Ljava/lang/String;
    //   1020: ifnull +135 -> 1155
    //   1023: aload 13
    //   1025: getfield 509	org/vidogram/ui/LaunchActivity$a:b	Ljava/util/ArrayList;
    //   1028: invokevirtual 204	java/util/ArrayList:isEmpty	()Z
    //   1031: ifne +124 -> 1155
    //   1034: aload_0
    //   1035: getfield 305	org/vidogram/ui/LaunchActivity:j	Ljava/util/ArrayList;
    //   1038: ifnonnull +4178 -> 5216
    //   1041: aload_0
    //   1042: new 109	java/util/ArrayList
    //   1045: dup
    //   1046: invokespecial 112	java/util/ArrayList:<init>	()V
    //   1049: putfield 305	org/vidogram/ui/LaunchActivity:j	Ljava/util/ArrayList;
    //   1052: goto +4164 -> 5216
    //   1055: iload 6
    //   1057: aload 13
    //   1059: getfield 509	org/vidogram/ui/LaunchActivity$a:b	Ljava/util/ArrayList;
    //   1062: invokevirtual 213	java/util/ArrayList:size	()I
    //   1065: if_icmpge +90 -> 1155
    //   1068: aload 13
    //   1070: getfield 509	org/vidogram/ui/LaunchActivity$a:b	Ljava/util/ArrayList;
    //   1073: iload 6
    //   1075: invokevirtual 217	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   1078: checkcast 316	java/lang/String
    //   1081: astore 14
    //   1083: new 517	org/vidogram/tgnet/g$ul
    //   1086: dup
    //   1087: invokespecial 518	org/vidogram/tgnet/g$ul:<init>	()V
    //   1090: astore 15
    //   1092: aload 15
    //   1094: aload 14
    //   1096: putfield 522	org/vidogram/tgnet/g$vw:i	Ljava/lang/String;
    //   1099: aload 15
    //   1101: aload 13
    //   1103: getfield 392	org/vidogram/ui/LaunchActivity$a:a	Ljava/lang/String;
    //   1106: putfield 524	org/vidogram/tgnet/g$vw:e	Ljava/lang/String;
    //   1109: aload 15
    //   1111: ldc_w 526
    //   1114: putfield 528	org/vidogram/tgnet/g$vw:f	Ljava/lang/String;
    //   1117: aload 15
    //   1119: iconst_0
    //   1120: putfield 530	org/vidogram/tgnet/g$vw:d	I
    //   1123: aload_0
    //   1124: getfield 305	org/vidogram/ui/LaunchActivity:j	Ljava/util/ArrayList;
    //   1127: aload 15
    //   1129: invokevirtual 380	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   1132: pop
    //   1133: iload 6
    //   1135: iconst_1
    //   1136: iadd
    //   1137: istore 6
    //   1139: goto -84 -> 1055
    //   1142: astore 13
    //   1144: ldc_w 359
    //   1147: aload 13
    //   1149: invokestatic 443	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   1152: goto -162 -> 990
    //   1155: iload 5
    //   1157: iconst_1
    //   1158: iadd
    //   1159: istore 5
    //   1161: goto -168 -> 993
    //   1164: iconst_0
    //   1165: istore 5
    //   1167: goto -447 -> 720
    //   1170: iconst_1
    //   1171: istore 5
    //   1173: goto -453 -> 720
    //   1176: aload_1
    //   1177: ldc_w 532
    //   1180: invokevirtual 536	android/content/Intent:getStringExtra	(Ljava/lang/String;)Ljava/lang/String;
    //   1183: astore 14
    //   1185: aload 14
    //   1187: astore 13
    //   1189: aload 14
    //   1191: ifnonnull +30 -> 1221
    //   1194: aload_1
    //   1195: ldc_w 532
    //   1198: invokevirtual 540	android/content/Intent:getCharSequenceExtra	(Ljava/lang/String;)Ljava/lang/CharSequence;
    //   1201: astore 16
    //   1203: aload 14
    //   1205: astore 13
    //   1207: aload 16
    //   1209: ifnull +12 -> 1221
    //   1212: aload 16
    //   1214: invokeinterface 543 1 0
    //   1219: astore 13
    //   1221: aload_1
    //   1222: ldc_w 545
    //   1225: invokevirtual 536	android/content/Intent:getStringExtra	(Ljava/lang/String;)Ljava/lang/String;
    //   1228: astore 16
    //   1230: aload 13
    //   1232: ifnull +233 -> 1465
    //   1235: aload 13
    //   1237: invokevirtual 416	java/lang/String:length	()I
    //   1240: ifeq +225 -> 1465
    //   1243: aload 13
    //   1245: ldc_w 547
    //   1248: invokevirtual 388	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   1251: ifne +18 -> 1269
    //   1254: aload 13
    //   1256: astore 14
    //   1258: aload 13
    //   1260: ldc_w 549
    //   1263: invokevirtual 388	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   1266: ifeq +52 -> 1318
    //   1269: aload 13
    //   1271: astore 14
    //   1273: aload 16
    //   1275: ifnull +43 -> 1318
    //   1278: aload 13
    //   1280: astore 14
    //   1282: aload 16
    //   1284: invokevirtual 416	java/lang/String:length	()I
    //   1287: ifeq +31 -> 1318
    //   1290: new 432	java/lang/StringBuilder
    //   1293: dup
    //   1294: invokespecial 433	java/lang/StringBuilder:<init>	()V
    //   1297: aload 16
    //   1299: invokevirtual 437	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1302: ldc_w 551
    //   1305: invokevirtual 437	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1308: aload 13
    //   1310: invokevirtual 437	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1313: invokevirtual 440	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1316: astore 14
    //   1318: aload_0
    //   1319: aload 14
    //   1321: putfield 295	org/vidogram/ui/LaunchActivity:d	Ljava/lang/String;
    //   1324: aload_1
    //   1325: ldc_w 327
    //   1328: invokevirtual 555	android/content/Intent:getParcelableExtra	(Ljava/lang/String;)Landroid/os/Parcelable;
    //   1331: astore 14
    //   1333: aload 14
    //   1335: ifnull +309 -> 1644
    //   1338: aload 14
    //   1340: astore 13
    //   1342: aload 14
    //   1344: instanceof 332
    //   1347: ifne +13 -> 1360
    //   1350: aload 14
    //   1352: invokevirtual 558	java/lang/Object:toString	()Ljava/lang/String;
    //   1355: invokestatic 562	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   1358: astore 13
    //   1360: aload 13
    //   1362: checkcast 332	android/net/Uri
    //   1365: astore 16
    //   1367: iload 6
    //   1369: istore 5
    //   1371: aload 16
    //   1373: ifnull +18 -> 1391
    //   1376: iload 6
    //   1378: istore 5
    //   1380: aload 16
    //   1382: invokestatic 565	org/vidogram/messenger/a:a	(Landroid/net/Uri;)Z
    //   1385: ifeq +6 -> 1391
    //   1388: iconst_1
    //   1389: istore 5
    //   1391: iload 5
    //   1393: ifne +69 -> 1462
    //   1396: aload 16
    //   1398: ifnull +89 -> 1487
    //   1401: aload 15
    //   1403: ifnull +14 -> 1417
    //   1406: aload 15
    //   1408: ldc_w 567
    //   1411: invokevirtual 388	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   1414: ifne +20 -> 1434
    //   1417: aload 16
    //   1419: invokevirtual 568	android/net/Uri:toString	()Ljava/lang/String;
    //   1422: invokevirtual 571	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   1425: ldc_w 573
    //   1428: invokevirtual 413	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   1431: ifeq +56 -> 1487
    //   1434: aload_0
    //   1435: getfield 293	org/vidogram/ui/LaunchActivity:e	Ljava/util/ArrayList;
    //   1438: ifnonnull +14 -> 1452
    //   1441: aload_0
    //   1442: new 109	java/util/ArrayList
    //   1445: dup
    //   1446: invokespecial 112	java/util/ArrayList:<init>	()V
    //   1449: putfield 293	org/vidogram/ui/LaunchActivity:e	Ljava/util/ArrayList;
    //   1452: aload_0
    //   1453: getfield 293	org/vidogram/ui/LaunchActivity:e	Ljava/util/ArrayList;
    //   1456: aload 16
    //   1458: invokevirtual 380	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   1461: pop
    //   1462: goto -742 -> 720
    //   1465: aload 16
    //   1467: ifnull -143 -> 1324
    //   1470: aload 16
    //   1472: invokevirtual 416	java/lang/String:length	()I
    //   1475: ifle -151 -> 1324
    //   1478: aload_0
    //   1479: aload 16
    //   1481: putfield 295	org/vidogram/ui/LaunchActivity:d	Ljava/lang/String;
    //   1484: goto -160 -> 1324
    //   1487: aload 16
    //   1489: invokestatic 576	org/vidogram/messenger/a:c	(Landroid/net/Uri;)Ljava/lang/String;
    //   1492: astore 14
    //   1494: aload 14
    //   1496: ifnull +111 -> 1607
    //   1499: aload 14
    //   1501: astore 13
    //   1503: aload 14
    //   1505: ldc_w 578
    //   1508: invokevirtual 388	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   1511: ifeq +16 -> 1527
    //   1514: aload 14
    //   1516: ldc_w 580
    //   1519: ldc_w 526
    //   1522: invokevirtual 584	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   1525: astore 13
    //   1527: aload 15
    //   1529: ifnull +23 -> 1552
    //   1532: aload 15
    //   1534: ldc_w 586
    //   1537: invokevirtual 388	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   1540: ifeq +12 -> 1552
    //   1543: aload_0
    //   1544: aload 13
    //   1546: putfield 294	org/vidogram/ui/LaunchActivity:c	Ljava/lang/String;
    //   1549: goto -87 -> 1462
    //   1552: aload_0
    //   1553: getfield 297	org/vidogram/ui/LaunchActivity:f	Ljava/util/ArrayList;
    //   1556: ifnonnull +25 -> 1581
    //   1559: aload_0
    //   1560: new 109	java/util/ArrayList
    //   1563: dup
    //   1564: invokespecial 112	java/util/ArrayList:<init>	()V
    //   1567: putfield 297	org/vidogram/ui/LaunchActivity:f	Ljava/util/ArrayList;
    //   1570: aload_0
    //   1571: new 109	java/util/ArrayList
    //   1574: dup
    //   1575: invokespecial 112	java/util/ArrayList:<init>	()V
    //   1578: putfield 299	org/vidogram/ui/LaunchActivity:i	Ljava/util/ArrayList;
    //   1581: aload_0
    //   1582: getfield 297	org/vidogram/ui/LaunchActivity:f	Ljava/util/ArrayList;
    //   1585: aload 13
    //   1587: invokevirtual 380	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   1590: pop
    //   1591: aload_0
    //   1592: getfield 299	org/vidogram/ui/LaunchActivity:i	Ljava/util/ArrayList;
    //   1595: aload 16
    //   1597: invokevirtual 568	android/net/Uri:toString	()Ljava/lang/String;
    //   1600: invokevirtual 380	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   1603: pop
    //   1604: goto -142 -> 1462
    //   1607: aload_0
    //   1608: getfield 303	org/vidogram/ui/LaunchActivity:g	Ljava/util/ArrayList;
    //   1611: ifnonnull +14 -> 1625
    //   1614: aload_0
    //   1615: new 109	java/util/ArrayList
    //   1618: dup
    //   1619: invokespecial 112	java/util/ArrayList:<init>	()V
    //   1622: putfield 303	org/vidogram/ui/LaunchActivity:g	Ljava/util/ArrayList;
    //   1625: aload_0
    //   1626: getfield 303	org/vidogram/ui/LaunchActivity:g	Ljava/util/ArrayList;
    //   1629: aload 16
    //   1631: invokevirtual 380	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   1634: pop
    //   1635: aload_0
    //   1636: aload 15
    //   1638: putfield 301	org/vidogram/ui/LaunchActivity:h	Ljava/lang/String;
    //   1641: goto -179 -> 1462
    //   1644: aload_0
    //   1645: getfield 295	org/vidogram/ui/LaunchActivity:d	Ljava/lang/String;
    //   1648: ifnonnull +3532 -> 5180
    //   1651: iconst_1
    //   1652: istore 5
    //   1654: goto -934 -> 720
    //   1657: aload_1
    //   1658: invokevirtual 312	android/content/Intent:getAction	()Ljava/lang/String;
    //   1661: ldc_w 588
    //   1664: invokevirtual 320	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   1667: ifeq +459 -> 2126
    //   1670: aload_1
    //   1671: ldc_w 327
    //   1674: invokevirtual 592	android/content/Intent:getParcelableArrayListExtra	(Ljava/lang/String;)Ljava/util/ArrayList;
    //   1677: astore 14
    //   1679: aload_1
    //   1680: invokevirtual 323	android/content/Intent:getType	()Ljava/lang/String;
    //   1683: astore 16
    //   1685: aload 14
    //   1687: ifnull +3483 -> 5170
    //   1690: iconst_0
    //   1691: istore 5
    //   1693: iload 5
    //   1695: aload 14
    //   1697: invokevirtual 213	java/util/ArrayList:size	()I
    //   1700: if_icmpge +74 -> 1774
    //   1703: aload 14
    //   1705: iload 5
    //   1707: invokevirtual 217	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   1710: checkcast 594	android/os/Parcelable
    //   1713: astore 15
    //   1715: aload 15
    //   1717: astore 13
    //   1719: aload 15
    //   1721: instanceof 332
    //   1724: ifne +13 -> 1737
    //   1727: aload 15
    //   1729: invokevirtual 558	java/lang/Object:toString	()Ljava/lang/String;
    //   1732: invokestatic 562	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   1735: astore 13
    //   1737: aload 13
    //   1739: checkcast 332	android/net/Uri
    //   1742: astore 13
    //   1744: aload 13
    //   1746: ifnull +3431 -> 5177
    //   1749: aload 13
    //   1751: invokestatic 565	org/vidogram/messenger/a:a	(Landroid/net/Uri;)Z
    //   1754: ifeq +3423 -> 5177
    //   1757: aload 14
    //   1759: iload 5
    //   1761: invokevirtual 597	java/util/ArrayList:remove	(I)Ljava/lang/Object;
    //   1764: pop
    //   1765: iload 5
    //   1767: iconst_1
    //   1768: isub
    //   1769: istore 5
    //   1771: goto +3451 -> 5222
    //   1774: aload 14
    //   1776: invokevirtual 204	java/util/ArrayList:isEmpty	()Z
    //   1779: ifeq +3391 -> 5170
    //   1782: aconst_null
    //   1783: astore 13
    //   1785: aload 13
    //   1787: ifnull +317 -> 2104
    //   1790: aload 16
    //   1792: ifnull +142 -> 1934
    //   1795: aload 16
    //   1797: ldc_w 567
    //   1800: invokevirtual 388	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   1803: ifeq +131 -> 1934
    //   1806: iconst_0
    //   1807: istore 5
    //   1809: iload 5
    //   1811: aload 13
    //   1813: invokevirtual 213	java/util/ArrayList:size	()I
    //   1816: if_icmpge +81 -> 1897
    //   1819: aload 13
    //   1821: iload 5
    //   1823: invokevirtual 217	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   1826: checkcast 594	android/os/Parcelable
    //   1829: astore 15
    //   1831: aload 15
    //   1833: astore 14
    //   1835: aload 15
    //   1837: instanceof 332
    //   1840: ifne +13 -> 1853
    //   1843: aload 15
    //   1845: invokevirtual 558	java/lang/Object:toString	()Ljava/lang/String;
    //   1848: invokestatic 562	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   1851: astore 14
    //   1853: aload 14
    //   1855: checkcast 332	android/net/Uri
    //   1858: astore 14
    //   1860: aload_0
    //   1861: getfield 293	org/vidogram/ui/LaunchActivity:e	Ljava/util/ArrayList;
    //   1864: ifnonnull +14 -> 1878
    //   1867: aload_0
    //   1868: new 109	java/util/ArrayList
    //   1871: dup
    //   1872: invokespecial 112	java/util/ArrayList:<init>	()V
    //   1875: putfield 293	org/vidogram/ui/LaunchActivity:e	Ljava/util/ArrayList;
    //   1878: aload_0
    //   1879: getfield 293	org/vidogram/ui/LaunchActivity:e	Ljava/util/ArrayList;
    //   1882: aload 14
    //   1884: invokevirtual 380	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   1887: pop
    //   1888: iload 5
    //   1890: iconst_1
    //   1891: iadd
    //   1892: istore 5
    //   1894: goto -85 -> 1809
    //   1897: iconst_0
    //   1898: istore 5
    //   1900: iload 5
    //   1902: ifeq +14 -> 1916
    //   1905: aload_0
    //   1906: ldc_w 445
    //   1909: iconst_0
    //   1910: invokestatic 451	android/widget/Toast:makeText	(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
    //   1913: invokevirtual 452	android/widget/Toast:show	()V
    //   1916: iconst_0
    //   1917: istore 5
    //   1919: aload 23
    //   1921: astore 13
    //   1923: aload 24
    //   1925: astore 14
    //   1927: iload 7
    //   1929: istore 6
    //   1931: goto -1180 -> 751
    //   1934: iconst_0
    //   1935: istore 5
    //   1937: iload 5
    //   1939: aload 13
    //   1941: invokevirtual 213	java/util/ArrayList:size	()I
    //   1944: if_icmpge +154 -> 2098
    //   1947: aload 13
    //   1949: iload 5
    //   1951: invokevirtual 217	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   1954: checkcast 594	android/os/Parcelable
    //   1957: astore 15
    //   1959: aload 15
    //   1961: instanceof 332
    //   1964: ifne +3203 -> 5167
    //   1967: aload 15
    //   1969: invokevirtual 558	java/lang/Object:toString	()Ljava/lang/String;
    //   1972: invokestatic 562	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   1975: astore 15
    //   1977: aload 15
    //   1979: checkcast 332	android/net/Uri
    //   1982: invokestatic 576	org/vidogram/messenger/a:c	(Landroid/net/Uri;)Ljava/lang/String;
    //   1985: astore 14
    //   1987: aload 15
    //   1989: invokevirtual 558	java/lang/Object:toString	()Ljava/lang/String;
    //   1992: astore 16
    //   1994: aload 16
    //   1996: astore 15
    //   1998: aload 16
    //   2000: ifnonnull +7 -> 2007
    //   2003: aload 14
    //   2005: astore 15
    //   2007: aload 14
    //   2009: ifnull +80 -> 2089
    //   2012: aload 14
    //   2014: astore 16
    //   2016: aload 14
    //   2018: ldc_w 578
    //   2021: invokevirtual 388	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   2024: ifeq +16 -> 2040
    //   2027: aload 14
    //   2029: ldc_w 580
    //   2032: ldc_w 526
    //   2035: invokevirtual 584	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   2038: astore 16
    //   2040: aload_0
    //   2041: getfield 297	org/vidogram/ui/LaunchActivity:f	Ljava/util/ArrayList;
    //   2044: ifnonnull +25 -> 2069
    //   2047: aload_0
    //   2048: new 109	java/util/ArrayList
    //   2051: dup
    //   2052: invokespecial 112	java/util/ArrayList:<init>	()V
    //   2055: putfield 297	org/vidogram/ui/LaunchActivity:f	Ljava/util/ArrayList;
    //   2058: aload_0
    //   2059: new 109	java/util/ArrayList
    //   2062: dup
    //   2063: invokespecial 112	java/util/ArrayList:<init>	()V
    //   2066: putfield 299	org/vidogram/ui/LaunchActivity:i	Ljava/util/ArrayList;
    //   2069: aload_0
    //   2070: getfield 297	org/vidogram/ui/LaunchActivity:f	Ljava/util/ArrayList;
    //   2073: aload 16
    //   2075: invokevirtual 380	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   2078: pop
    //   2079: aload_0
    //   2080: getfield 299	org/vidogram/ui/LaunchActivity:i	Ljava/util/ArrayList;
    //   2083: aload 15
    //   2085: invokevirtual 380	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   2088: pop
    //   2089: iload 5
    //   2091: iconst_1
    //   2092: iadd
    //   2093: istore 5
    //   2095: goto -158 -> 1937
    //   2098: iconst_0
    //   2099: istore 5
    //   2101: goto -201 -> 1900
    //   2104: iconst_1
    //   2105: istore 5
    //   2107: goto -207 -> 1900
    //   2110: astore 13
    //   2112: ldc_w 359
    //   2115: aload 13
    //   2117: invokestatic 443	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   2120: iconst_1
    //   2121: istore 5
    //   2123: goto -223 -> 1900
    //   2126: ldc_w 599
    //   2129: aload_1
    //   2130: invokevirtual 312	android/content/Intent:getAction	()Ljava/lang/String;
    //   2133: invokevirtual 320	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   2136: ifeq +1524 -> 3660
    //   2139: aload_1
    //   2140: invokevirtual 603	android/content/Intent:getData	()Landroid/net/Uri;
    //   2143: astore 16
    //   2145: aload 24
    //   2147: astore 14
    //   2149: aload 16
    //   2151: ifnull +273 -> 2424
    //   2154: aconst_null
    //   2155: astore 22
    //   2157: iconst_0
    //   2158: istore 9
    //   2160: iconst_0
    //   2161: istore 10
    //   2163: iconst_0
    //   2164: istore_3
    //   2165: aload 16
    //   2167: invokevirtual 606	android/net/Uri:getScheme	()Ljava/lang/String;
    //   2170: astore 13
    //   2172: aload 13
    //   2174: ifnull +2791 -> 4965
    //   2177: aload 13
    //   2179: ldc_w 608
    //   2182: invokevirtual 320	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   2185: ifne +14 -> 2199
    //   2188: aload 13
    //   2190: ldc_w 610
    //   2193: invokevirtual 320	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   2196: ifeq +666 -> 2862
    //   2199: aload 16
    //   2201: invokevirtual 613	android/net/Uri:getHost	()Ljava/lang/String;
    //   2204: invokevirtual 571	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   2207: astore 13
    //   2209: aload 13
    //   2211: ldc_w 615
    //   2214: invokevirtual 320	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   2217: ifne +14 -> 2231
    //   2220: aload 13
    //   2222: ldc_w 617
    //   2225: invokevirtual 320	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   2228: ifeq +2856 -> 5084
    //   2231: aload 16
    //   2233: invokevirtual 620	android/net/Uri:getPath	()Ljava/lang/String;
    //   2236: astore 13
    //   2238: aload 13
    //   2240: ifnull +2844 -> 5084
    //   2243: aload 13
    //   2245: invokevirtual 416	java/lang/String:length	()I
    //   2248: iconst_1
    //   2249: if_icmple +2835 -> 5084
    //   2252: aload 13
    //   2254: iconst_1
    //   2255: invokevirtual 623	java/lang/String:substring	(I)Ljava/lang/String;
    //   2258: astore 13
    //   2260: aload 13
    //   2262: ldc_w 625
    //   2265: invokevirtual 388	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   2268: ifeq +170 -> 2438
    //   2271: aload 13
    //   2273: ldc_w 625
    //   2276: ldc_w 526
    //   2279: invokevirtual 584	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   2282: astore 20
    //   2284: aconst_null
    //   2285: astore 14
    //   2287: aconst_null
    //   2288: astore 17
    //   2290: aconst_null
    //   2291: astore 13
    //   2293: aconst_null
    //   2294: astore 16
    //   2296: aconst_null
    //   2297: astore 19
    //   2299: aconst_null
    //   2300: astore 21
    //   2302: aconst_null
    //   2303: astore 15
    //   2305: aconst_null
    //   2306: astore 18
    //   2308: aload 20
    //   2310: astore 27
    //   2312: aload 14
    //   2314: astore 20
    //   2316: aload 21
    //   2318: astore 14
    //   2320: aload 15
    //   2322: astore 21
    //   2324: aload 18
    //   2326: astore 15
    //   2328: aload 16
    //   2330: astore 18
    //   2332: aload 22
    //   2334: astore 28
    //   2336: aload 19
    //   2338: astore 16
    //   2340: aload 21
    //   2342: astore 22
    //   2344: aload 20
    //   2346: astore 21
    //   2348: aload 28
    //   2350: astore 20
    //   2352: aload 18
    //   2354: astore 19
    //   2356: aload 17
    //   2358: astore 18
    //   2360: aload 15
    //   2362: astore 17
    //   2364: aload 27
    //   2366: astore 15
    //   2368: aload 22
    //   2370: ifnonnull +8 -> 2378
    //   2373: aload 13
    //   2375: ifnull +1129 -> 3504
    //   2378: new 229	android/os/Bundle
    //   2381: dup
    //   2382: invokespecial 230	android/os/Bundle:<init>	()V
    //   2385: astore 14
    //   2387: aload 14
    //   2389: ldc_w 627
    //   2392: aload 22
    //   2394: invokevirtual 630	android/os/Bundle:putString	(Ljava/lang/String;Ljava/lang/String;)V
    //   2397: aload 14
    //   2399: ldc_w 632
    //   2402: aload 13
    //   2404: invokevirtual 630	android/os/Bundle:putString	(Ljava/lang/String;Ljava/lang/String;)V
    //   2407: new 34	org/vidogram/ui/LaunchActivity$16
    //   2410: dup
    //   2411: aload_0
    //   2412: aload 14
    //   2414: invokespecial 635	org/vidogram/ui/LaunchActivity$16:<init>	(Lorg/vidogram/ui/LaunchActivity;Landroid/os/Bundle;)V
    //   2417: invokestatic 638	org/vidogram/messenger/a:a	(Ljava/lang/Runnable;)V
    //   2420: aload 24
    //   2422: astore 14
    //   2424: iconst_0
    //   2425: istore 5
    //   2427: aload 23
    //   2429: astore 13
    //   2431: iload 7
    //   2433: istore 6
    //   2435: goto -1684 -> 751
    //   2438: aload 13
    //   2440: ldc_w 640
    //   2443: invokevirtual 388	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   2446: ifeq +43 -> 2489
    //   2449: aload 13
    //   2451: ldc_w 640
    //   2454: ldc_w 526
    //   2457: invokevirtual 584	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   2460: astore 19
    //   2462: aconst_null
    //   2463: astore 14
    //   2465: aconst_null
    //   2466: astore 17
    //   2468: aconst_null
    //   2469: astore 20
    //   2471: aconst_null
    //   2472: astore 13
    //   2474: aconst_null
    //   2475: astore 16
    //   2477: aconst_null
    //   2478: astore 21
    //   2480: aconst_null
    //   2481: astore 15
    //   2483: aconst_null
    //   2484: astore 18
    //   2486: goto -178 -> 2308
    //   2489: aload 13
    //   2491: ldc_w 642
    //   2494: invokevirtual 388	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   2497: ifne +14 -> 2511
    //   2500: aload 13
    //   2502: ldc_w 644
    //   2505: invokevirtual 388	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   2508: ifeq +154 -> 2662
    //   2511: aload 16
    //   2513: ldc_w 646
    //   2516: invokevirtual 649	android/net/Uri:getQueryParameter	(Ljava/lang/String;)Ljava/lang/String;
    //   2519: astore 14
    //   2521: aload 14
    //   2523: astore 13
    //   2525: aload 14
    //   2527: ifnonnull +8 -> 2535
    //   2530: ldc_w 526
    //   2533: astore 13
    //   2535: aload 16
    //   2537: ldc_w 651
    //   2540: invokevirtual 649	android/net/Uri:getQueryParameter	(Ljava/lang/String;)Ljava/lang/String;
    //   2543: ifnull +2615 -> 5158
    //   2546: aload 13
    //   2548: invokevirtual 416	java/lang/String:length	()I
    //   2551: ifle +2602 -> 5153
    //   2554: new 432	java/lang/StringBuilder
    //   2557: dup
    //   2558: invokespecial 433	java/lang/StringBuilder:<init>	()V
    //   2561: aload 13
    //   2563: invokevirtual 437	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2566: ldc_w 551
    //   2569: invokevirtual 437	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2572: invokevirtual 440	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2575: astore 13
    //   2577: iconst_1
    //   2578: istore_3
    //   2579: new 432	java/lang/StringBuilder
    //   2582: dup
    //   2583: invokespecial 433	java/lang/StringBuilder:<init>	()V
    //   2586: aload 13
    //   2588: invokevirtual 437	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2591: aload 16
    //   2593: ldc_w 651
    //   2596: invokevirtual 649	android/net/Uri:getQueryParameter	(Ljava/lang/String;)Ljava/lang/String;
    //   2599: invokevirtual 437	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2602: invokevirtual 440	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2605: astore 14
    //   2607: aload 14
    //   2609: astore 13
    //   2611: aload 14
    //   2613: invokevirtual 416	java/lang/String:length	()I
    //   2616: sipush 16384
    //   2619: if_icmple +14 -> 2633
    //   2622: aload 14
    //   2624: iconst_0
    //   2625: sipush 16384
    //   2628: invokevirtual 420	java/lang/String:substring	(II)Ljava/lang/String;
    //   2631: astore 13
    //   2633: aload 13
    //   2635: ldc_w 551
    //   2638: invokevirtual 413	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   2641: ifeq +2473 -> 5114
    //   2644: aload 13
    //   2646: iconst_0
    //   2647: aload 13
    //   2649: invokevirtual 416	java/lang/String:length	()I
    //   2652: iconst_1
    //   2653: isub
    //   2654: invokevirtual 420	java/lang/String:substring	(II)Ljava/lang/String;
    //   2657: astore 13
    //   2659: goto -26 -> 2633
    //   2662: aload 13
    //   2664: ldc_w 653
    //   2667: invokevirtual 388	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   2670: ifeq +47 -> 2717
    //   2673: aload 16
    //   2675: ldc_w 627
    //   2678: invokevirtual 649	android/net/Uri:getQueryParameter	(Ljava/lang/String;)Ljava/lang/String;
    //   2681: astore 15
    //   2683: aload 16
    //   2685: ldc_w 632
    //   2688: invokevirtual 649	android/net/Uri:getQueryParameter	(Ljava/lang/String;)Ljava/lang/String;
    //   2691: astore 13
    //   2693: aconst_null
    //   2694: astore 16
    //   2696: aconst_null
    //   2697: astore 18
    //   2699: aconst_null
    //   2700: astore 19
    //   2702: aconst_null
    //   2703: astore 21
    //   2705: aconst_null
    //   2706: astore 14
    //   2708: aconst_null
    //   2709: astore 17
    //   2711: aconst_null
    //   2712: astore 20
    //   2714: goto -406 -> 2308
    //   2717: aload 13
    //   2719: invokevirtual 416	java/lang/String:length	()I
    //   2722: iconst_1
    //   2723: if_icmplt +2361 -> 5084
    //   2726: aload 16
    //   2728: invokevirtual 657	android/net/Uri:getPathSegments	()Ljava/util/List;
    //   2731: astore 14
    //   2733: aload 14
    //   2735: invokeinterface 660 1 0
    //   2740: ifle +2335 -> 5075
    //   2743: aload 14
    //   2745: iconst_0
    //   2746: invokeinterface 661 2 0
    //   2751: checkcast 316	java/lang/String
    //   2754: astore 13
    //   2756: aload 14
    //   2758: invokeinterface 660 1 0
    //   2763: iconst_1
    //   2764: if_icmple +2301 -> 5065
    //   2767: aload 14
    //   2769: iconst_1
    //   2770: invokeinterface 661 2 0
    //   2775: checkcast 316	java/lang/String
    //   2778: invokestatic 666	org/vidogram/messenger/Utilities:a	(Ljava/lang/String;)Ljava/lang/Integer;
    //   2781: astore 15
    //   2783: aload 15
    //   2785: invokevirtual 455	java/lang/Integer:intValue	()I
    //   2788: ifne +2266 -> 5054
    //   2791: aconst_null
    //   2792: astore 15
    //   2794: aload 13
    //   2796: astore 14
    //   2798: aload 15
    //   2800: astore 13
    //   2802: aload 16
    //   2804: ldc_w 668
    //   2807: invokevirtual 649	android/net/Uri:getQueryParameter	(Ljava/lang/String;)Ljava/lang/String;
    //   2810: astore 18
    //   2812: aload 16
    //   2814: ldc_w 670
    //   2817: invokevirtual 649	android/net/Uri:getQueryParameter	(Ljava/lang/String;)Ljava/lang/String;
    //   2820: astore 17
    //   2822: aload 16
    //   2824: ldc_w 672
    //   2827: invokevirtual 649	android/net/Uri:getQueryParameter	(Ljava/lang/String;)Ljava/lang/String;
    //   2830: astore 15
    //   2832: aconst_null
    //   2833: astore 20
    //   2835: aload 14
    //   2837: astore 21
    //   2839: aload 15
    //   2841: astore 14
    //   2843: aload 13
    //   2845: astore 22
    //   2847: aconst_null
    //   2848: astore 13
    //   2850: aconst_null
    //   2851: astore 16
    //   2853: aconst_null
    //   2854: astore 19
    //   2856: aconst_null
    //   2857: astore 15
    //   2859: goto -551 -> 2308
    //   2862: aload 13
    //   2864: ldc_w 674
    //   2867: invokevirtual 320	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   2870: ifeq +2095 -> 4965
    //   2873: aload 16
    //   2875: invokevirtual 568	android/net/Uri:toString	()Ljava/lang/String;
    //   2878: astore 13
    //   2880: aload 13
    //   2882: ldc_w 676
    //   2885: invokevirtual 388	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   2888: ifne +14 -> 2902
    //   2891: aload 13
    //   2893: ldc_w 678
    //   2896: invokevirtual 388	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   2899: ifeq +112 -> 3011
    //   2902: aload 13
    //   2904: ldc_w 676
    //   2907: ldc_w 680
    //   2910: invokevirtual 584	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   2913: ldc_w 678
    //   2916: ldc_w 680
    //   2919: invokevirtual 584	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   2922: invokestatic 562	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   2925: astore 13
    //   2927: aload 13
    //   2929: ldc_w 682
    //   2932: invokevirtual 649	android/net/Uri:getQueryParameter	(Ljava/lang/String;)Ljava/lang/String;
    //   2935: astore 14
    //   2937: aload 13
    //   2939: ldc_w 668
    //   2942: invokevirtual 649	android/net/Uri:getQueryParameter	(Ljava/lang/String;)Ljava/lang/String;
    //   2945: astore 17
    //   2947: aload 13
    //   2949: ldc_w 670
    //   2952: invokevirtual 649	android/net/Uri:getQueryParameter	(Ljava/lang/String;)Ljava/lang/String;
    //   2955: astore 18
    //   2957: aload 13
    //   2959: ldc_w 672
    //   2962: invokevirtual 649	android/net/Uri:getQueryParameter	(Ljava/lang/String;)Ljava/lang/String;
    //   2965: astore 21
    //   2967: aload 13
    //   2969: ldc_w 684
    //   2972: invokevirtual 649	android/net/Uri:getQueryParameter	(Ljava/lang/String;)Ljava/lang/String;
    //   2975: invokestatic 666	org/vidogram/messenger/Utilities:a	(Ljava/lang/String;)Ljava/lang/Integer;
    //   2978: astore 20
    //   2980: aload 20
    //   2982: invokevirtual 455	java/lang/Integer:intValue	()I
    //   2985: ifne +2049 -> 5034
    //   2988: aconst_null
    //   2989: astore 13
    //   2991: aconst_null
    //   2992: astore 22
    //   2994: iconst_0
    //   2995: istore_3
    //   2996: aconst_null
    //   2997: astore 19
    //   2999: aconst_null
    //   3000: astore 15
    //   3002: aconst_null
    //   3003: astore 20
    //   3005: aconst_null
    //   3006: astore 16
    //   3008: goto -640 -> 2368
    //   3011: aload 13
    //   3013: ldc_w 686
    //   3016: invokevirtual 388	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   3019: ifne +14 -> 3033
    //   3022: aload 13
    //   3024: ldc_w 688
    //   3027: invokevirtual 388	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   3030: ifeq +66 -> 3096
    //   3033: aload 13
    //   3035: ldc_w 686
    //   3038: ldc_w 680
    //   3041: invokevirtual 584	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   3044: ldc_w 688
    //   3047: ldc_w 680
    //   3050: invokevirtual 584	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   3053: invokestatic 562	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   3056: ldc_w 690
    //   3059: invokevirtual 649	android/net/Uri:getQueryParameter	(Ljava/lang/String;)Ljava/lang/String;
    //   3062: astore 15
    //   3064: aconst_null
    //   3065: astore 13
    //   3067: aconst_null
    //   3068: astore 14
    //   3070: aconst_null
    //   3071: astore 18
    //   3073: aconst_null
    //   3074: astore 17
    //   3076: aconst_null
    //   3077: astore 22
    //   3079: aconst_null
    //   3080: astore 21
    //   3082: iconst_0
    //   3083: istore_3
    //   3084: aconst_null
    //   3085: astore 19
    //   3087: aconst_null
    //   3088: astore 20
    //   3090: aconst_null
    //   3091: astore 16
    //   3093: goto -725 -> 2368
    //   3096: aload 13
    //   3098: ldc_w 692
    //   3101: invokevirtual 388	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   3104: ifne +14 -> 3118
    //   3107: aload 13
    //   3109: ldc_w 694
    //   3112: invokevirtual 388	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   3115: ifeq +66 -> 3181
    //   3118: aload 13
    //   3120: ldc_w 692
    //   3123: ldc_w 680
    //   3126: invokevirtual 584	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   3129: ldc_w 694
    //   3132: ldc_w 680
    //   3135: invokevirtual 584	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   3138: invokestatic 562	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   3141: ldc_w 696
    //   3144: invokevirtual 649	android/net/Uri:getQueryParameter	(Ljava/lang/String;)Ljava/lang/String;
    //   3147: astore 16
    //   3149: aconst_null
    //   3150: astore 13
    //   3152: aconst_null
    //   3153: astore 14
    //   3155: aconst_null
    //   3156: astore 18
    //   3158: aconst_null
    //   3159: astore 17
    //   3161: aconst_null
    //   3162: astore 22
    //   3164: aconst_null
    //   3165: astore 21
    //   3167: iconst_0
    //   3168: istore_3
    //   3169: aconst_null
    //   3170: astore 19
    //   3172: aconst_null
    //   3173: astore 15
    //   3175: aconst_null
    //   3176: astore 20
    //   3178: goto -810 -> 2368
    //   3181: aload 13
    //   3183: ldc_w 698
    //   3186: invokevirtual 388	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   3189: ifne +36 -> 3225
    //   3192: aload 13
    //   3194: ldc_w 700
    //   3197: invokevirtual 388	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   3200: ifne +25 -> 3225
    //   3203: aload 13
    //   3205: ldc_w 702
    //   3208: invokevirtual 388	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   3211: ifne +14 -> 3225
    //   3214: aload 13
    //   3216: ldc_w 704
    //   3219: invokevirtual 388	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   3222: ifeq +211 -> 3433
    //   3225: aload 13
    //   3227: ldc_w 698
    //   3230: ldc_w 680
    //   3233: invokevirtual 584	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   3236: ldc_w 700
    //   3239: ldc_w 680
    //   3242: invokevirtual 584	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   3245: ldc_w 702
    //   3248: ldc_w 680
    //   3251: invokevirtual 584	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   3254: ldc_w 704
    //   3257: ldc_w 680
    //   3260: invokevirtual 584	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   3263: invokestatic 562	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   3266: astore 15
    //   3268: aload 15
    //   3270: ldc_w 646
    //   3273: invokevirtual 649	android/net/Uri:getQueryParameter	(Ljava/lang/String;)Ljava/lang/String;
    //   3276: astore 14
    //   3278: aload 14
    //   3280: astore 13
    //   3282: aload 14
    //   3284: ifnonnull +8 -> 3292
    //   3287: ldc_w 526
    //   3290: astore 13
    //   3292: aload 13
    //   3294: astore 14
    //   3296: iload 10
    //   3298: istore_3
    //   3299: aload 15
    //   3301: ldc_w 651
    //   3304: invokevirtual 649	android/net/Uri:getQueryParameter	(Ljava/lang/String;)Ljava/lang/String;
    //   3307: ifnull +71 -> 3378
    //   3310: aload 13
    //   3312: astore 14
    //   3314: iload 9
    //   3316: istore_3
    //   3317: aload 13
    //   3319: invokevirtual 416	java/lang/String:length	()I
    //   3322: ifle +28 -> 3350
    //   3325: iconst_1
    //   3326: istore_3
    //   3327: new 432	java/lang/StringBuilder
    //   3330: dup
    //   3331: invokespecial 433	java/lang/StringBuilder:<init>	()V
    //   3334: aload 13
    //   3336: invokevirtual 437	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3339: ldc_w 551
    //   3342: invokevirtual 437	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3345: invokevirtual 440	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   3348: astore 14
    //   3350: new 432	java/lang/StringBuilder
    //   3353: dup
    //   3354: invokespecial 433	java/lang/StringBuilder:<init>	()V
    //   3357: aload 14
    //   3359: invokevirtual 437	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3362: aload 15
    //   3364: ldc_w 651
    //   3367: invokevirtual 649	android/net/Uri:getQueryParameter	(Ljava/lang/String;)Ljava/lang/String;
    //   3370: invokevirtual 437	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3373: invokevirtual 440	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   3376: astore 14
    //   3378: aload 14
    //   3380: astore 13
    //   3382: aload 14
    //   3384: invokevirtual 416	java/lang/String:length	()I
    //   3387: sipush 16384
    //   3390: if_icmple +14 -> 3404
    //   3393: aload 14
    //   3395: iconst_0
    //   3396: sipush 16384
    //   3399: invokevirtual 420	java/lang/String:substring	(II)Ljava/lang/String;
    //   3402: astore 13
    //   3404: aload 13
    //   3406: ldc_w 551
    //   3409: invokevirtual 413	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   3412: ifeq +1588 -> 5000
    //   3415: aload 13
    //   3417: iconst_0
    //   3418: aload 13
    //   3420: invokevirtual 416	java/lang/String:length	()I
    //   3423: iconst_1
    //   3424: isub
    //   3425: invokevirtual 420	java/lang/String:substring	(II)Ljava/lang/String;
    //   3428: astore 13
    //   3430: goto -26 -> 3404
    //   3433: aload 13
    //   3435: ldc_w 706
    //   3438: invokevirtual 388	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   3441: ifne +14 -> 3455
    //   3444: aload 13
    //   3446: ldc_w 708
    //   3449: invokevirtual 388	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   3452: ifeq +1513 -> 4965
    //   3455: aload 16
    //   3457: ldc_w 627
    //   3460: invokevirtual 649	android/net/Uri:getQueryParameter	(Ljava/lang/String;)Ljava/lang/String;
    //   3463: astore 22
    //   3465: aload 16
    //   3467: ldc_w 632
    //   3470: invokevirtual 649	android/net/Uri:getQueryParameter	(Ljava/lang/String;)Ljava/lang/String;
    //   3473: astore 13
    //   3475: aconst_null
    //   3476: astore 14
    //   3478: aconst_null
    //   3479: astore 18
    //   3481: aconst_null
    //   3482: astore 17
    //   3484: aconst_null
    //   3485: astore 21
    //   3487: iconst_0
    //   3488: istore_3
    //   3489: aconst_null
    //   3490: astore 19
    //   3492: aconst_null
    //   3493: astore 15
    //   3495: aconst_null
    //   3496: astore 20
    //   3498: aconst_null
    //   3499: astore 16
    //   3501: goto -1133 -> 2368
    //   3504: aload 14
    //   3506: ifnonnull +23 -> 3529
    //   3509: aload 15
    //   3511: ifnonnull +18 -> 3529
    //   3514: aload 16
    //   3516: ifnonnull +13 -> 3529
    //   3519: aload 19
    //   3521: ifnonnull +8 -> 3529
    //   3524: aload 21
    //   3526: ifnull +32 -> 3558
    //   3529: aload_0
    //   3530: aload 14
    //   3532: aload 15
    //   3534: aload 16
    //   3536: aload 17
    //   3538: aload 18
    //   3540: aload 19
    //   3542: iload_3
    //   3543: aload 20
    //   3545: aload 21
    //   3547: iconst_0
    //   3548: invokespecial 710	org/vidogram/ui/LaunchActivity:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/String;I)V
    //   3551: aload 24
    //   3553: astore 14
    //   3555: goto -1131 -> 2424
    //   3558: aload_0
    //   3559: invokevirtual 336	org/vidogram/ui/LaunchActivity:getContentResolver	()Landroid/content/ContentResolver;
    //   3562: aload_1
    //   3563: invokevirtual 603	android/content/Intent:getData	()Landroid/net/Uri;
    //   3566: aconst_null
    //   3567: aconst_null
    //   3568: aconst_null
    //   3569: aconst_null
    //   3570: invokevirtual 714	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   3573: astore 14
    //   3575: aload 14
    //   3577: ifnull +1381 -> 4958
    //   3580: aload 14
    //   3582: invokeinterface 719 1 0
    //   3587: ifeq +1364 -> 4951
    //   3590: aload 14
    //   3592: aload 14
    //   3594: ldc_w 721
    //   3597: invokeinterface 725 2 0
    //   3602: invokeinterface 729 2 0
    //   3607: istore 5
    //   3609: invokestatic 734	org/vidogram/messenger/y:a	()Lorg/vidogram/messenger/y;
    //   3612: getstatic 735	org/vidogram/messenger/y:d	I
    //   3615: iconst_0
    //   3616: anewarray 557	java/lang/Object
    //   3619: invokevirtual 738	org/vidogram/messenger/y:a	(I[Ljava/lang/Object;)V
    //   3622: iload 5
    //   3624: invokestatic 281	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   3627: astore 13
    //   3629: aload 14
    //   3631: invokeinterface 739 1 0
    //   3636: aload 13
    //   3638: astore 14
    //   3640: goto -1216 -> 2424
    //   3643: astore 15
    //   3645: aload 24
    //   3647: astore 14
    //   3649: ldc_w 359
    //   3652: aload 15
    //   3654: invokestatic 443	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   3657: goto -1233 -> 2424
    //   3660: aload_1
    //   3661: invokevirtual 312	android/content/Intent:getAction	()Ljava/lang/String;
    //   3664: ldc_w 741
    //   3667: invokevirtual 320	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   3670: ifeq +23 -> 3693
    //   3673: iconst_1
    //   3674: invokestatic 281	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   3677: astore 13
    //   3679: iconst_0
    //   3680: istore 5
    //   3682: aload 24
    //   3684: astore 14
    //   3686: iload 7
    //   3688: istore 6
    //   3690: goto -2939 -> 751
    //   3693: aload_1
    //   3694: invokevirtual 312	android/content/Intent:getAction	()Ljava/lang/String;
    //   3697: ldc_w 743
    //   3700: invokevirtual 388	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   3703: ifeq +179 -> 3882
    //   3706: aload_1
    //   3707: ldc_w 745
    //   3710: iconst_0
    //   3711: invokevirtual 749	android/content/Intent:getIntExtra	(Ljava/lang/String;I)I
    //   3714: istore 5
    //   3716: aload_1
    //   3717: ldc_w 751
    //   3720: iconst_0
    //   3721: invokevirtual 749	android/content/Intent:getIntExtra	(Ljava/lang/String;I)I
    //   3724: istore 6
    //   3726: aload_1
    //   3727: ldc_w 753
    //   3730: iconst_0
    //   3731: invokevirtual 749	android/content/Intent:getIntExtra	(Ljava/lang/String;I)I
    //   3734: istore 7
    //   3736: iload 5
    //   3738: ifeq +56 -> 3794
    //   3741: invokestatic 734	org/vidogram/messenger/y:a	()Lorg/vidogram/messenger/y;
    //   3744: getstatic 735	org/vidogram/messenger/y:d	I
    //   3747: iconst_0
    //   3748: anewarray 557	java/lang/Object
    //   3751: invokevirtual 738	org/vidogram/messenger/y:a	(I[Ljava/lang/Object;)V
    //   3754: aload 26
    //   3756: astore 13
    //   3758: iload 5
    //   3760: invokestatic 281	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   3763: astore 14
    //   3765: iconst_0
    //   3766: istore 5
    //   3768: iload 5
    //   3770: istore 6
    //   3772: aload 13
    //   3774: astore 26
    //   3776: aload 14
    //   3778: astore 25
    //   3780: iconst_0
    //   3781: istore 5
    //   3783: aload 23
    //   3785: astore 13
    //   3787: aload 24
    //   3789: astore 14
    //   3791: goto -3040 -> 751
    //   3794: iload 6
    //   3796: ifeq +37 -> 3833
    //   3799: invokestatic 734	org/vidogram/messenger/y:a	()Lorg/vidogram/messenger/y;
    //   3802: getstatic 735	org/vidogram/messenger/y:d	I
    //   3805: iconst_0
    //   3806: anewarray 557	java/lang/Object
    //   3809: invokevirtual 738	org/vidogram/messenger/y:a	(I[Ljava/lang/Object;)V
    //   3812: iload 6
    //   3814: invokestatic 281	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   3817: astore 24
    //   3819: iconst_0
    //   3820: istore 5
    //   3822: aload 26
    //   3824: astore 13
    //   3826: aload 25
    //   3828: astore 14
    //   3830: goto -62 -> 3768
    //   3833: iload 7
    //   3835: ifeq +33 -> 3868
    //   3838: invokestatic 734	org/vidogram/messenger/y:a	()Lorg/vidogram/messenger/y;
    //   3841: getstatic 735	org/vidogram/messenger/y:d	I
    //   3844: iconst_0
    //   3845: anewarray 557	java/lang/Object
    //   3848: invokevirtual 738	org/vidogram/messenger/y:a	(I[Ljava/lang/Object;)V
    //   3851: iload 7
    //   3853: invokestatic 281	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   3856: astore 13
    //   3858: aload 25
    //   3860: astore 14
    //   3862: iconst_0
    //   3863: istore 5
    //   3865: goto -97 -> 3768
    //   3868: iconst_1
    //   3869: istore 5
    //   3871: aload 26
    //   3873: astore 13
    //   3875: aload 25
    //   3877: astore 14
    //   3879: goto -111 -> 3768
    //   3882: aload_1
    //   3883: invokevirtual 312	android/content/Intent:getAction	()Ljava/lang/String;
    //   3886: ldc_w 755
    //   3889: invokevirtual 320	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   3892: ifeq +1041 -> 4933
    //   3895: iconst_1
    //   3896: istore 5
    //   3898: aload 23
    //   3900: astore 13
    //   3902: aload 24
    //   3904: astore 14
    //   3906: iload 7
    //   3908: istore 6
    //   3910: goto -3159 -> 751
    //   3913: aload 25
    //   3915: invokevirtual 455	java/lang/Integer:intValue	()I
    //   3918: ifeq +96 -> 4014
    //   3921: new 229	android/os/Bundle
    //   3924: dup
    //   3925: invokespecial 230	android/os/Bundle:<init>	()V
    //   3928: astore 13
    //   3930: aload 13
    //   3932: ldc_w 757
    //   3935: aload 25
    //   3937: invokevirtual 455	java/lang/Integer:intValue	()I
    //   3940: invokevirtual 461	android/os/Bundle:putInt	(Ljava/lang/String;I)V
    //   3943: getstatic 114	org/vidogram/ui/LaunchActivity:l	Ljava/util/ArrayList;
    //   3946: invokevirtual 204	java/util/ArrayList:isEmpty	()Z
    //   3949: ifne +31 -> 3980
    //   3952: iload 4
    //   3954: istore_3
    //   3955: aload 13
    //   3957: getstatic 114	org/vidogram/ui/LaunchActivity:l	Ljava/util/ArrayList;
    //   3960: getstatic 114	org/vidogram/ui/LaunchActivity:l	Ljava/util/ArrayList;
    //   3963: invokevirtual 213	java/util/ArrayList:size	()I
    //   3966: iconst_1
    //   3967: isub
    //   3968: invokevirtual 217	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   3971: checkcast 219	org/vidogram/ui/a/g
    //   3974: invokestatic 466	org/vidogram/messenger/v:a	(Landroid/os/Bundle;Lorg/vidogram/ui/a/g;)Z
    //   3977: ifeq +34 -> 4011
    //   3980: new 468	org/vidogram/ui/q
    //   3983: dup
    //   3984: aload 13
    //   3986: invokespecial 469	org/vidogram/ui/q:<init>	(Landroid/os/Bundle;)V
    //   3989: astore 13
    //   3991: iload 4
    //   3993: istore_3
    //   3994: aload_0
    //   3995: getfield 129	org/vidogram/ui/LaunchActivity:p	Lorg/vidogram/ui/a/b;
    //   3998: aload 13
    //   4000: iconst_0
    //   4001: iconst_1
    //   4002: iconst_1
    //   4003: invokevirtual 474	org/vidogram/ui/a/b:a	(Lorg/vidogram/ui/a/g;ZZZ)Z
    //   4006: ifeq +5 -> 4011
    //   4009: iconst_1
    //   4010: istore_3
    //   4011: goto -3168 -> 843
    //   4014: aload 26
    //   4016: invokevirtual 455	java/lang/Integer:intValue	()I
    //   4019: ifeq +59 -> 4078
    //   4022: new 229	android/os/Bundle
    //   4025: dup
    //   4026: invokespecial 230	android/os/Bundle:<init>	()V
    //   4029: astore 13
    //   4031: aload 13
    //   4033: ldc_w 759
    //   4036: aload 26
    //   4038: invokevirtual 455	java/lang/Integer:intValue	()I
    //   4041: invokevirtual 461	android/os/Bundle:putInt	(Ljava/lang/String;I)V
    //   4044: new 468	org/vidogram/ui/q
    //   4047: dup
    //   4048: aload 13
    //   4050: invokespecial 469	org/vidogram/ui/q:<init>	(Landroid/os/Bundle;)V
    //   4053: astore 13
    //   4055: iload 8
    //   4057: istore_3
    //   4058: aload_0
    //   4059: getfield 129	org/vidogram/ui/LaunchActivity:p	Lorg/vidogram/ui/a/b;
    //   4062: aload 13
    //   4064: iconst_0
    //   4065: iconst_1
    //   4066: iconst_1
    //   4067: invokevirtual 474	org/vidogram/ui/a/b:a	(Lorg/vidogram/ui/a/g;ZZZ)Z
    //   4070: ifeq +5 -> 4075
    //   4073: iconst_1
    //   4074: istore_3
    //   4075: goto -3232 -> 843
    //   4078: iload 6
    //   4080: ifeq +86 -> 4166
    //   4083: invokestatic 476	org/vidogram/messenger/a:c	()Z
    //   4086: ifne +17 -> 4103
    //   4089: aload_0
    //   4090: getfield 129	org/vidogram/ui/LaunchActivity:p	Lorg/vidogram/ui/a/b;
    //   4093: invokevirtual 761	org/vidogram/ui/a/b:i	()V
    //   4096: iconst_0
    //   4097: istore_2
    //   4098: iconst_0
    //   4099: istore_3
    //   4100: goto -3257 -> 843
    //   4103: aload_0
    //   4104: getfield 478	org/vidogram/ui/LaunchActivity:q	Lorg/vidogram/ui/a/b;
    //   4107: getfield 479	org/vidogram/ui/a/b:e	Ljava/util/ArrayList;
    //   4110: invokevirtual 204	java/util/ArrayList:isEmpty	()Z
    //   4113: ifne -17 -> 4096
    //   4116: aload_0
    //   4117: getfield 478	org/vidogram/ui/LaunchActivity:q	Lorg/vidogram/ui/a/b;
    //   4120: getfield 479	org/vidogram/ui/a/b:e	Ljava/util/ArrayList;
    //   4123: invokevirtual 213	java/util/ArrayList:size	()I
    //   4126: iconst_1
    //   4127: isub
    //   4128: ifle +27 -> 4155
    //   4131: aload_0
    //   4132: getfield 478	org/vidogram/ui/LaunchActivity:q	Lorg/vidogram/ui/a/b;
    //   4135: aload_0
    //   4136: getfield 478	org/vidogram/ui/LaunchActivity:q	Lorg/vidogram/ui/a/b;
    //   4139: getfield 479	org/vidogram/ui/a/b:e	Ljava/util/ArrayList;
    //   4142: iconst_0
    //   4143: invokevirtual 217	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   4146: checkcast 219	org/vidogram/ui/a/g
    //   4149: invokevirtual 764	org/vidogram/ui/a/b:c	(Lorg/vidogram/ui/a/g;)V
    //   4152: goto -36 -> 4116
    //   4155: aload_0
    //   4156: getfield 478	org/vidogram/ui/LaunchActivity:q	Lorg/vidogram/ui/a/b;
    //   4159: iconst_0
    //   4160: invokevirtual 765	org/vidogram/ui/a/b:a	(Z)V
    //   4163: goto -67 -> 4096
    //   4166: iload 5
    //   4168: ifeq +189 -> 4357
    //   4171: invokestatic 476	org/vidogram/messenger/a:c	()Z
    //   4174: ifeq +110 -> 4284
    //   4177: iconst_0
    //   4178: istore 5
    //   4180: iload 5
    //   4182: aload_0
    //   4183: getfield 478	org/vidogram/ui/LaunchActivity:q	Lorg/vidogram/ui/a/b;
    //   4186: getfield 479	org/vidogram/ui/a/b:e	Ljava/util/ArrayList;
    //   4189: invokevirtual 213	java/util/ArrayList:size	()I
    //   4192: if_icmpge +37 -> 4229
    //   4195: aload_0
    //   4196: getfield 478	org/vidogram/ui/LaunchActivity:q	Lorg/vidogram/ui/a/b;
    //   4199: getfield 479	org/vidogram/ui/a/b:e	Ljava/util/ArrayList;
    //   4202: iload 5
    //   4204: invokevirtual 217	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   4207: checkcast 219	org/vidogram/ui/a/g
    //   4210: astore 13
    //   4212: aload 13
    //   4214: instanceof 767
    //   4217: ifeq +58 -> 4275
    //   4220: aload_0
    //   4221: getfield 478	org/vidogram/ui/LaunchActivity:q	Lorg/vidogram/ui/a/b;
    //   4224: aload 13
    //   4226: invokevirtual 764	org/vidogram/ui/a/b:c	(Lorg/vidogram/ui/a/g;)V
    //   4229: aload_0
    //   4230: getfield 129	org/vidogram/ui/LaunchActivity:p	Lorg/vidogram/ui/a/b;
    //   4233: invokevirtual 494	org/vidogram/ui/a/b:h	()V
    //   4236: aload_0
    //   4237: getfield 496	org/vidogram/ui/LaunchActivity:r	Lorg/vidogram/ui/a/b;
    //   4240: invokevirtual 494	org/vidogram/ui/a/b:h	()V
    //   4243: aload_0
    //   4244: getfield 487	org/vidogram/ui/LaunchActivity:a	Lorg/vidogram/ui/a/i;
    //   4247: iconst_0
    //   4248: iconst_0
    //   4249: invokevirtual 492	org/vidogram/ui/a/i:a	(ZZ)V
    //   4252: aload_0
    //   4253: getfield 129	org/vidogram/ui/LaunchActivity:p	Lorg/vidogram/ui/a/b;
    //   4256: new 767	org/vidogram/ui/b
    //   4259: dup
    //   4260: invokespecial 768	org/vidogram/ui/b:<init>	()V
    //   4263: iconst_0
    //   4264: iconst_1
    //   4265: iconst_1
    //   4266: invokevirtual 474	org/vidogram/ui/a/b:a	(Lorg/vidogram/ui/a/g;ZZZ)Z
    //   4269: pop
    //   4270: iconst_1
    //   4271: istore_3
    //   4272: goto -3429 -> 843
    //   4275: iload 5
    //   4277: iconst_1
    //   4278: iadd
    //   4279: istore 5
    //   4281: goto -101 -> 4180
    //   4284: iconst_0
    //   4285: istore 5
    //   4287: iload 5
    //   4289: aload_0
    //   4290: getfield 129	org/vidogram/ui/LaunchActivity:p	Lorg/vidogram/ui/a/b;
    //   4293: getfield 479	org/vidogram/ui/a/b:e	Ljava/util/ArrayList;
    //   4296: invokevirtual 213	java/util/ArrayList:size	()I
    //   4299: if_icmpge +37 -> 4336
    //   4302: aload_0
    //   4303: getfield 129	org/vidogram/ui/LaunchActivity:p	Lorg/vidogram/ui/a/b;
    //   4306: getfield 479	org/vidogram/ui/a/b:e	Ljava/util/ArrayList;
    //   4309: iload 5
    //   4311: invokevirtual 217	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   4314: checkcast 219	org/vidogram/ui/a/g
    //   4317: astore 13
    //   4319: aload 13
    //   4321: instanceof 767
    //   4324: ifeq +24 -> 4348
    //   4327: aload_0
    //   4328: getfield 129	org/vidogram/ui/LaunchActivity:p	Lorg/vidogram/ui/a/b;
    //   4331: aload 13
    //   4333: invokevirtual 764	org/vidogram/ui/a/b:c	(Lorg/vidogram/ui/a/g;)V
    //   4336: aload_0
    //   4337: getfield 487	org/vidogram/ui/LaunchActivity:a	Lorg/vidogram/ui/a/i;
    //   4340: iconst_1
    //   4341: iconst_0
    //   4342: invokevirtual 492	org/vidogram/ui/a/i:a	(ZZ)V
    //   4345: goto -93 -> 4252
    //   4348: iload 5
    //   4350: iconst_1
    //   4351: iadd
    //   4352: istore 5
    //   4354: goto -67 -> 4287
    //   4357: aload_0
    //   4358: getfield 294	org/vidogram/ui/LaunchActivity:c	Ljava/lang/String;
    //   4361: ifnonnull +38 -> 4399
    //   4364: aload_0
    //   4365: getfield 293	org/vidogram/ui/LaunchActivity:e	Ljava/util/ArrayList;
    //   4368: ifnonnull +31 -> 4399
    //   4371: aload_0
    //   4372: getfield 295	org/vidogram/ui/LaunchActivity:d	Ljava/lang/String;
    //   4375: ifnonnull +24 -> 4399
    //   4378: aload_0
    //   4379: getfield 297	org/vidogram/ui/LaunchActivity:f	Ljava/util/ArrayList;
    //   4382: ifnonnull +17 -> 4399
    //   4385: aload_0
    //   4386: getfield 305	org/vidogram/ui/LaunchActivity:j	Ljava/util/ArrayList;
    //   4389: ifnonnull +10 -> 4399
    //   4392: aload_0
    //   4393: getfield 303	org/vidogram/ui/LaunchActivity:g	Ljava/util/ArrayList;
    //   4396: ifnull +336 -> 4732
    //   4399: invokestatic 476	org/vidogram/messenger/a:c	()Z
    //   4402: ifne +16 -> 4418
    //   4405: invokestatic 734	org/vidogram/messenger/y:a	()Lorg/vidogram/messenger/y;
    //   4408: getstatic 735	org/vidogram/messenger/y:d	I
    //   4411: iconst_0
    //   4412: anewarray 557	java/lang/Object
    //   4415: invokevirtual 738	org/vidogram/messenger/y:a	(I[Ljava/lang/Object;)V
    //   4418: lload 11
    //   4420: lconst_0
    //   4421: lcmp
    //   4422: ifne +297 -> 4719
    //   4425: new 229	android/os/Bundle
    //   4428: dup
    //   4429: invokespecial 230	android/os/Bundle:<init>	()V
    //   4432: astore 13
    //   4434: aload 13
    //   4436: ldc 232
    //   4438: iconst_1
    //   4439: invokevirtual 236	android/os/Bundle:putBoolean	(Ljava/lang/String;Z)V
    //   4442: aload_0
    //   4443: getfield 305	org/vidogram/ui/LaunchActivity:j	Ljava/util/ArrayList;
    //   4446: ifnull +167 -> 4613
    //   4449: aload 13
    //   4451: ldc_w 770
    //   4454: ldc_w 772
    //   4457: ldc_w 773
    //   4460: invokestatic 143	org/vidogram/messenger/r:a	(Ljava/lang/String;I)Ljava/lang/String;
    //   4463: invokevirtual 630	android/os/Bundle:putString	(Ljava/lang/String;Ljava/lang/String;)V
    //   4466: aload 13
    //   4468: ldc_w 775
    //   4471: ldc_w 777
    //   4474: ldc_w 778
    //   4477: invokestatic 143	org/vidogram/messenger/r:a	(Ljava/lang/String;I)Ljava/lang/String;
    //   4480: invokevirtual 630	android/os/Bundle:putString	(Ljava/lang/String;Ljava/lang/String;)V
    //   4483: new 238	org/vidogram/ui/v
    //   4486: dup
    //   4487: aload 13
    //   4489: invokespecial 241	org/vidogram/ui/v:<init>	(Landroid/os/Bundle;)V
    //   4492: astore 13
    //   4494: aload 13
    //   4496: aload_0
    //   4497: invokevirtual 247	org/vidogram/ui/v:a	(Lorg/vidogram/ui/v$a;)V
    //   4500: invokestatic 476	org/vidogram/messenger/a:c	()Z
    //   4503: ifeq +152 -> 4655
    //   4506: aload_0
    //   4507: getfield 478	org/vidogram/ui/LaunchActivity:q	Lorg/vidogram/ui/a/b;
    //   4510: getfield 479	org/vidogram/ui/a/b:e	Ljava/util/ArrayList;
    //   4513: invokevirtual 213	java/util/ArrayList:size	()I
    //   4516: ifle +134 -> 4650
    //   4519: aload_0
    //   4520: getfield 478	org/vidogram/ui/LaunchActivity:q	Lorg/vidogram/ui/a/b;
    //   4523: getfield 479	org/vidogram/ui/a/b:e	Ljava/util/ArrayList;
    //   4526: aload_0
    //   4527: getfield 478	org/vidogram/ui/LaunchActivity:q	Lorg/vidogram/ui/a/b;
    //   4530: getfield 479	org/vidogram/ui/a/b:e	Ljava/util/ArrayList;
    //   4533: invokevirtual 213	java/util/ArrayList:size	()I
    //   4536: iconst_1
    //   4537: isub
    //   4538: invokevirtual 217	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   4541: instanceof 238
    //   4544: ifeq +106 -> 4650
    //   4547: iconst_1
    //   4548: istore_3
    //   4549: aload_0
    //   4550: getfield 129	org/vidogram/ui/LaunchActivity:p	Lorg/vidogram/ui/a/b;
    //   4553: aload 13
    //   4555: iload_3
    //   4556: iconst_1
    //   4557: iconst_1
    //   4558: invokevirtual 474	org/vidogram/ui/a/b:a	(Lorg/vidogram/ui/a/g;ZZZ)Z
    //   4561: pop
    //   4562: invokestatic 783	org/vidogram/ui/am:a	()Lorg/vidogram/ui/am;
    //   4565: invokevirtual 785	org/vidogram/ui/am:f	()Z
    //   4568: ifeq +11 -> 4579
    //   4571: invokestatic 783	org/vidogram/ui/am:a	()Lorg/vidogram/ui/am;
    //   4574: iconst_0
    //   4575: iconst_1
    //   4576: invokevirtual 786	org/vidogram/ui/am:a	(ZZ)V
    //   4579: aload_0
    //   4580: getfield 487	org/vidogram/ui/LaunchActivity:a	Lorg/vidogram/ui/a/i;
    //   4583: iconst_0
    //   4584: iconst_0
    //   4585: invokevirtual 492	org/vidogram/ui/a/i:a	(ZZ)V
    //   4588: invokestatic 476	org/vidogram/messenger/a:c	()Z
    //   4591: ifeq +116 -> 4707
    //   4594: aload_0
    //   4595: getfield 129	org/vidogram/ui/LaunchActivity:p	Lorg/vidogram/ui/a/b;
    //   4598: invokevirtual 494	org/vidogram/ui/a/b:h	()V
    //   4601: aload_0
    //   4602: getfield 496	org/vidogram/ui/LaunchActivity:r	Lorg/vidogram/ui/a/b;
    //   4605: invokevirtual 494	org/vidogram/ui/a/b:h	()V
    //   4608: iconst_1
    //   4609: istore_3
    //   4610: goto -3767 -> 843
    //   4613: aload 13
    //   4615: ldc_w 770
    //   4618: ldc_w 788
    //   4621: ldc_w 773
    //   4624: invokestatic 143	org/vidogram/messenger/r:a	(Ljava/lang/String;I)Ljava/lang/String;
    //   4627: invokevirtual 630	android/os/Bundle:putString	(Ljava/lang/String;Ljava/lang/String;)V
    //   4630: aload 13
    //   4632: ldc_w 775
    //   4635: ldc_w 790
    //   4638: ldc_w 791
    //   4641: invokestatic 143	org/vidogram/messenger/r:a	(Ljava/lang/String;I)Ljava/lang/String;
    //   4644: invokevirtual 630	android/os/Bundle:putString	(Ljava/lang/String;Ljava/lang/String;)V
    //   4647: goto -164 -> 4483
    //   4650: iconst_0
    //   4651: istore_3
    //   4652: goto -103 -> 4549
    //   4655: aload_0
    //   4656: getfield 129	org/vidogram/ui/LaunchActivity:p	Lorg/vidogram/ui/a/b;
    //   4659: getfield 479	org/vidogram/ui/a/b:e	Ljava/util/ArrayList;
    //   4662: invokevirtual 213	java/util/ArrayList:size	()I
    //   4665: iconst_1
    //   4666: if_icmple +36 -> 4702
    //   4669: aload_0
    //   4670: getfield 129	org/vidogram/ui/LaunchActivity:p	Lorg/vidogram/ui/a/b;
    //   4673: getfield 479	org/vidogram/ui/a/b:e	Ljava/util/ArrayList;
    //   4676: aload_0
    //   4677: getfield 129	org/vidogram/ui/LaunchActivity:p	Lorg/vidogram/ui/a/b;
    //   4680: getfield 479	org/vidogram/ui/a/b:e	Ljava/util/ArrayList;
    //   4683: invokevirtual 213	java/util/ArrayList:size	()I
    //   4686: iconst_1
    //   4687: isub
    //   4688: invokevirtual 217	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   4691: instanceof 238
    //   4694: ifeq +8 -> 4702
    //   4697: iconst_1
    //   4698: istore_3
    //   4699: goto -150 -> 4549
    //   4702: iconst_0
    //   4703: istore_3
    //   4704: goto -155 -> 4549
    //   4707: aload_0
    //   4708: getfield 487	org/vidogram/ui/LaunchActivity:a	Lorg/vidogram/ui/a/i;
    //   4711: iconst_1
    //   4712: iconst_0
    //   4713: invokevirtual 492	org/vidogram/ui/a/i:a	(ZZ)V
    //   4716: goto -108 -> 4608
    //   4719: aload_0
    //   4720: aconst_null
    //   4721: lload 11
    //   4723: iconst_0
    //   4724: invokevirtual 794	org/vidogram/ui/LaunchActivity:a	(Lorg/vidogram/ui/v;JZ)V
    //   4727: iconst_0
    //   4728: istore_3
    //   4729: goto -3886 -> 843
    //   4732: aload 13
    //   4734: invokevirtual 455	java/lang/Integer:intValue	()I
    //   4737: ifeq +191 -> 4928
    //   4740: aload_0
    //   4741: getfield 129	org/vidogram/ui/LaunchActivity:p	Lorg/vidogram/ui/a/b;
    //   4744: new 796	org/vidogram/ui/aw
    //   4747: dup
    //   4748: invokespecial 797	org/vidogram/ui/aw:<init>	()V
    //   4751: iconst_0
    //   4752: iconst_1
    //   4753: iconst_1
    //   4754: invokevirtual 474	org/vidogram/ui/a/b:a	(Lorg/vidogram/ui/a/g;ZZZ)Z
    //   4757: pop
    //   4758: invokestatic 476	org/vidogram/messenger/a:c	()Z
    //   4761: ifeq +31 -> 4792
    //   4764: aload_0
    //   4765: getfield 129	org/vidogram/ui/LaunchActivity:p	Lorg/vidogram/ui/a/b;
    //   4768: invokevirtual 494	org/vidogram/ui/a/b:h	()V
    //   4771: aload_0
    //   4772: getfield 496	org/vidogram/ui/LaunchActivity:r	Lorg/vidogram/ui/a/b;
    //   4775: invokevirtual 494	org/vidogram/ui/a/b:h	()V
    //   4778: aload_0
    //   4779: getfield 487	org/vidogram/ui/LaunchActivity:a	Lorg/vidogram/ui/a/i;
    //   4782: iconst_0
    //   4783: iconst_0
    //   4784: invokevirtual 492	org/vidogram/ui/a/i:a	(ZZ)V
    //   4787: iconst_1
    //   4788: istore_3
    //   4789: goto -3946 -> 843
    //   4792: aload_0
    //   4793: getfield 487	org/vidogram/ui/LaunchActivity:a	Lorg/vidogram/ui/a/i;
    //   4796: iconst_1
    //   4797: iconst_0
    //   4798: invokevirtual 492	org/vidogram/ui/a/i:a	(ZZ)V
    //   4801: goto -14 -> 4787
    //   4804: aload_0
    //   4805: getfield 129	org/vidogram/ui/LaunchActivity:p	Lorg/vidogram/ui/a/b;
    //   4808: getfield 479	org/vidogram/ui/a/b:e	Ljava/util/ArrayList;
    //   4811: invokevirtual 204	java/util/ArrayList:isEmpty	()Z
    //   4814: ifeq -3914 -> 900
    //   4817: aload_0
    //   4818: getfield 129	org/vidogram/ui/LaunchActivity:p	Lorg/vidogram/ui/a/b;
    //   4821: new 238	org/vidogram/ui/v
    //   4824: dup
    //   4825: aconst_null
    //   4826: invokespecial 241	org/vidogram/ui/v:<init>	(Landroid/os/Bundle;)V
    //   4829: invokevirtual 485	org/vidogram/ui/a/b:b	(Lorg/vidogram/ui/a/g;)Z
    //   4832: pop
    //   4833: aload_0
    //   4834: getfield 487	org/vidogram/ui/LaunchActivity:a	Lorg/vidogram/ui/a/i;
    //   4837: iconst_1
    //   4838: iconst_0
    //   4839: invokevirtual 492	org/vidogram/ui/a/i:a	(ZZ)V
    //   4842: goto -3942 -> 900
    //   4845: aload_0
    //   4846: getfield 129	org/vidogram/ui/LaunchActivity:p	Lorg/vidogram/ui/a/b;
    //   4849: getfield 479	org/vidogram/ui/a/b:e	Ljava/util/ArrayList;
    //   4852: invokevirtual 204	java/util/ArrayList:isEmpty	()Z
    //   4855: ifeq -3955 -> 900
    //   4858: invokestatic 307	org/vidogram/messenger/ad:b	()Z
    //   4861: ifne +30 -> 4891
    //   4864: aload_0
    //   4865: getfield 129	org/vidogram/ui/LaunchActivity:p	Lorg/vidogram/ui/a/b;
    //   4868: new 481	org/vidogram/ui/ae
    //   4871: dup
    //   4872: invokespecial 482	org/vidogram/ui/ae:<init>	()V
    //   4875: invokevirtual 485	org/vidogram/ui/a/b:b	(Lorg/vidogram/ui/a/g;)Z
    //   4878: pop
    //   4879: aload_0
    //   4880: getfield 487	org/vidogram/ui/LaunchActivity:a	Lorg/vidogram/ui/a/i;
    //   4883: iconst_0
    //   4884: iconst_0
    //   4885: invokevirtual 492	org/vidogram/ui/a/i:a	(ZZ)V
    //   4888: goto -3988 -> 900
    //   4891: aload_0
    //   4892: getfield 129	org/vidogram/ui/LaunchActivity:p	Lorg/vidogram/ui/a/b;
    //   4895: new 238	org/vidogram/ui/v
    //   4898: dup
    //   4899: aconst_null
    //   4900: invokespecial 241	org/vidogram/ui/v:<init>	(Landroid/os/Bundle;)V
    //   4903: invokevirtual 485	org/vidogram/ui/a/b:b	(Lorg/vidogram/ui/a/g;)Z
    //   4906: pop
    //   4907: aload_0
    //   4908: getfield 487	org/vidogram/ui/LaunchActivity:a	Lorg/vidogram/ui/a/i;
    //   4911: iconst_1
    //   4912: iconst_0
    //   4913: invokevirtual 492	org/vidogram/ui/a/i:a	(ZZ)V
    //   4916: goto -4016 -> 900
    //   4919: astore 15
    //   4921: aload 13
    //   4923: astore 14
    //   4925: goto -1276 -> 3649
    //   4928: iconst_0
    //   4929: istore_3
    //   4930: goto -4087 -> 843
    //   4933: iconst_0
    //   4934: istore 5
    //   4936: aload 23
    //   4938: astore 13
    //   4940: aload 24
    //   4942: astore 14
    //   4944: iload 7
    //   4946: istore 6
    //   4948: goto -4197 -> 751
    //   4951: aload 24
    //   4953: astore 13
    //   4955: goto -1326 -> 3629
    //   4958: aload 24
    //   4960: astore 13
    //   4962: goto -1326 -> 3636
    //   4965: aconst_null
    //   4966: astore 13
    //   4968: aconst_null
    //   4969: astore 14
    //   4971: aconst_null
    //   4972: astore 18
    //   4974: aconst_null
    //   4975: astore 17
    //   4977: aconst_null
    //   4978: astore 22
    //   4980: aconst_null
    //   4981: astore 21
    //   4983: iconst_0
    //   4984: istore_3
    //   4985: aconst_null
    //   4986: astore 19
    //   4988: aconst_null
    //   4989: astore 15
    //   4991: aconst_null
    //   4992: astore 20
    //   4994: aconst_null
    //   4995: astore 16
    //   4997: goto -2629 -> 2368
    //   5000: aconst_null
    //   5001: astore 20
    //   5003: aconst_null
    //   5004: astore 14
    //   5006: aconst_null
    //   5007: astore 17
    //   5009: aconst_null
    //   5010: astore 16
    //   5012: aconst_null
    //   5013: astore 22
    //   5015: aconst_null
    //   5016: astore 15
    //   5018: aconst_null
    //   5019: astore 18
    //   5021: aconst_null
    //   5022: astore 21
    //   5024: aload 13
    //   5026: astore 19
    //   5028: aconst_null
    //   5029: astore 13
    //   5031: goto -2663 -> 2368
    //   5034: aconst_null
    //   5035: astore 13
    //   5037: aconst_null
    //   5038: astore 22
    //   5040: iconst_0
    //   5041: istore_3
    //   5042: aconst_null
    //   5043: astore 19
    //   5045: aconst_null
    //   5046: astore 15
    //   5048: aconst_null
    //   5049: astore 16
    //   5051: goto -2683 -> 2368
    //   5054: aload 13
    //   5056: astore 14
    //   5058: aload 15
    //   5060: astore 13
    //   5062: goto -2260 -> 2802
    //   5065: aload 13
    //   5067: astore 14
    //   5069: aconst_null
    //   5070: astore 13
    //   5072: goto -2270 -> 2802
    //   5075: aconst_null
    //   5076: astore 13
    //   5078: aconst_null
    //   5079: astore 14
    //   5081: goto -2279 -> 2802
    //   5084: aconst_null
    //   5085: astore 13
    //   5087: aconst_null
    //   5088: astore 14
    //   5090: aconst_null
    //   5091: astore 16
    //   5093: aconst_null
    //   5094: astore 17
    //   5096: aconst_null
    //   5097: astore 19
    //   5099: aconst_null
    //   5100: astore 20
    //   5102: aconst_null
    //   5103: astore 18
    //   5105: aconst_null
    //   5106: astore 21
    //   5108: aconst_null
    //   5109: astore 15
    //   5111: goto -2803 -> 2308
    //   5114: aconst_null
    //   5115: astore 19
    //   5117: aconst_null
    //   5118: astore 14
    //   5120: aload 13
    //   5122: astore 16
    //   5124: aconst_null
    //   5125: astore 27
    //   5127: aconst_null
    //   5128: astore 17
    //   5130: aconst_null
    //   5131: astore 20
    //   5133: aconst_null
    //   5134: astore 18
    //   5136: aconst_null
    //   5137: astore 21
    //   5139: aconst_null
    //   5140: astore 15
    //   5142: aload 14
    //   5144: astore 13
    //   5146: aload 27
    //   5148: astore 14
    //   5150: goto -2842 -> 2308
    //   5153: iconst_0
    //   5154: istore_3
    //   5155: goto -2576 -> 2579
    //   5158: iconst_0
    //   5159: istore_3
    //   5160: aload 13
    //   5162: astore 14
    //   5164: goto -2557 -> 2607
    //   5167: goto -3190 -> 1977
    //   5170: aload 14
    //   5172: astore 13
    //   5174: goto -3389 -> 1785
    //   5177: goto +45 -> 5222
    //   5180: iconst_0
    //   5181: istore 5
    //   5183: goto -4463 -> 720
    //   5186: aload 13
    //   5188: ifnonnull -4793 -> 395
    //   5191: goto -4913 -> 278
    //   5194: lconst_0
    //   5195: lstore 11
    //   5197: goto -5094 -> 103
    //   5200: iload 5
    //   5202: iconst_1
    //   5203: iadd
    //   5204: istore 5
    //   5206: aload 16
    //   5208: astore 14
    //   5210: goto -4752 -> 458
    //   5213: goto -4935 -> 278
    //   5216: iconst_0
    //   5217: istore 6
    //   5219: goto -4164 -> 1055
    //   5222: iload 5
    //   5224: iconst_1
    //   5225: iadd
    //   5226: istore 5
    //   5228: goto -3535 -> 1693
    //
    // Exception table:
    //   from	to	target	type
    //   214	229	707	java/lang/Exception
    //   234	254	707	java/lang/Exception
    //   257	278	707	java/lang/Exception
    //   278	285	707	java/lang/Exception
    //   290	360	707	java/lang/Exception
    //   363	389	707	java/lang/Exception
    //   395	432	707	java/lang/Exception
    //   432	449	707	java/lang/Exception
    //   465	485	707	java/lang/Exception
    //   492	505	707	java/lang/Exception
    //   518	531	707	java/lang/Exception
    //   544	553	707	java/lang/Exception
    //   558	569	707	java/lang/Exception
    //   569	583	707	java/lang/Exception
    //   588	619	707	java/lang/Exception
    //   624	637	707	java/lang/Exception
    //   642	661	707	java/lang/Exception
    //   666	673	707	java/lang/Exception
    //   676	704	707	java/lang/Exception
    //   935	977	707	java/lang/Exception
    //   993	1052	707	java/lang/Exception
    //   1055	1133	707	java/lang/Exception
    //   1144	1152	707	java/lang/Exception
    //   980	990	1142	java/lang/Exception
    //   1670	1685	2110	java/lang/Exception
    //   1693	1715	2110	java/lang/Exception
    //   1719	1737	2110	java/lang/Exception
    //   1737	1744	2110	java/lang/Exception
    //   1749	1765	2110	java/lang/Exception
    //   1774	1782	2110	java/lang/Exception
    //   1795	1806	2110	java/lang/Exception
    //   1809	1831	2110	java/lang/Exception
    //   1835	1853	2110	java/lang/Exception
    //   1853	1878	2110	java/lang/Exception
    //   1878	1888	2110	java/lang/Exception
    //   1937	1977	2110	java/lang/Exception
    //   1977	1994	2110	java/lang/Exception
    //   2016	2040	2110	java/lang/Exception
    //   2040	2069	2110	java/lang/Exception
    //   2069	2089	2110	java/lang/Exception
    //   3558	3575	3643	java/lang/Exception
    //   3580	3622	3643	java/lang/Exception
    //   3629	3636	4919	java/lang/Exception
  }

  private void c()
  {
    int i1 = 8;
    int i2 = 0;
    if (!org.vidogram.messenger.a.c())
      return;
    if ((!org.vidogram.messenger.a.i) && ((!org.vidogram.messenger.a.d()) || (getResources().getConfiguration().orientation == 2)))
    {
      this.C = false;
      if (this.p.e.size() >= 2)
      {
        while (1 < this.p.e.size())
        {
          localObject = (g)this.p.e.get(1);
          ((g)localObject).j();
          this.p.e.remove(1);
          this.r.e.add(localObject);
        }
        if (this.w.getVisibility() != 0)
        {
          this.p.h();
          this.r.h();
        }
      }
      localObject = this.r;
      if (this.r.e.isEmpty())
      {
        i1 = 8;
        ((org.vidogram.ui.a.b)localObject).setVisibility(i1);
        localObject = this.u;
        if (!this.r.e.isEmpty())
          break label223;
        i1 = 0;
        label187: ((View)localObject).setVisibility(i1);
        localObject = this.t;
        if (this.p.e.isEmpty())
          break label229;
      }
      label223: label229: for (i1 = i2; ; i1 = 8)
      {
        ((FrameLayout)localObject).setVisibility(i1);
        return;
        i1 = 0;
        break;
        i1 = 8;
        break label187;
      }
    }
    this.C = true;
    if (!this.r.e.isEmpty())
    {
      while (this.r.e.size() > 0)
      {
        localObject = (g)this.r.e.get(0);
        ((g)localObject).j();
        this.r.e.remove(0);
        this.p.e.add(localObject);
      }
      if (this.w.getVisibility() != 0)
        this.p.h();
    }
    this.t.setVisibility(8);
    this.r.setVisibility(8);
    Object localObject = this.u;
    if (!this.p.e.isEmpty());
    while (true)
    {
      ((View)localObject).setVisibility(i1);
      return;
      i1 = 0;
    }
  }

  private void d()
  {
    if (this.w == null)
      return;
    org.vidogram.messenger.ad.k = true;
    if (am.a().f())
      am.a().a(false, true);
    this.w.c();
    org.vidogram.messenger.ad.o = true;
    this.a.a(false, false);
    this.w.setDelegate(new ae.b()
    {
      public void a()
      {
        org.vidogram.messenger.ad.o = false;
        if (LaunchActivity.g(LaunchActivity.this) != null)
        {
          LaunchActivity.a(LaunchActivity.this, LaunchActivity.g(LaunchActivity.this), LaunchActivity.h(LaunchActivity.this), LaunchActivity.i(LaunchActivity.this), true);
          LaunchActivity.a(LaunchActivity.this, null);
        }
        LaunchActivity.this.a.a(true, false);
        LaunchActivity.a(LaunchActivity.this).h();
        if (org.vidogram.messenger.a.c())
        {
          LaunchActivity.f(LaunchActivity.this).h();
          LaunchActivity.c(LaunchActivity.this).h();
        }
      }
    });
  }

  private void e()
  {
    if (this.b)
      return;
    this.b = true;
    if (this.D != null)
    {
      org.vidogram.messenger.a.b(this.D);
      this.D = null;
    }
    org.vidogram.messenger.y.a().b(this, org.vidogram.messenger.y.au);
    org.vidogram.messenger.y.a().b(this, org.vidogram.messenger.y.C);
    org.vidogram.messenger.y.a().b(this, org.vidogram.messenger.y.ap);
    org.vidogram.messenger.y.a().b(this, org.vidogram.messenger.y.aq);
    org.vidogram.messenger.y.a().b(this, org.vidogram.messenger.y.Y);
    org.vidogram.messenger.y.a().b(this, org.vidogram.messenger.y.ad);
    org.vidogram.messenger.y.a().b(this, org.vidogram.messenger.y.ak);
  }

  private void f()
  {
    if (this.D != null)
    {
      org.vidogram.messenger.a.b(this.D);
      this.D = null;
    }
    if (org.vidogram.messenger.ad.i.length() != 0)
    {
      org.vidogram.messenger.ad.n = ConnectionsManager.a().b();
      this.D = new Runnable()
      {
        public void run()
        {
          if (LaunchActivity.j(LaunchActivity.this) == this)
          {
            if (!org.vidogram.messenger.a.c(true))
              break label42;
            n.a("tmessages", "lock app");
            LaunchActivity.k(LaunchActivity.this);
          }
          while (true)
          {
            LaunchActivity.a(LaunchActivity.this, null);
            return;
            label42: n.a("tmessages", "didn't pass lock check");
          }
        }
      };
      if (org.vidogram.messenger.ad.k)
        org.vidogram.messenger.a.a(this.D, 1000L);
    }
    while (true)
    {
      org.vidogram.messenger.ad.a(false);
      return;
      if (org.vidogram.messenger.ad.m == 0)
        continue;
      org.vidogram.messenger.a.a(this.D, org.vidogram.messenger.ad.m * 1000L + 1000L);
      continue;
      org.vidogram.messenger.ad.n = 0;
    }
  }

  private void g()
  {
    if (this.D != null)
    {
      org.vidogram.messenger.a.b(this.D);
      this.D = null;
    }
    if (org.vidogram.messenger.a.c(true))
      d();
    if (org.vidogram.messenger.ad.n != 0)
    {
      org.vidogram.messenger.ad.n = 0;
      org.vidogram.messenger.ad.a(false);
    }
  }

  private void h()
  {
    String str = null;
    if (this.k == 2)
      str = r.a("WaitingForNetwork", 2131231947);
    while (true)
    {
      this.p.setTitleOverlayText(str);
      return;
      if (this.k == 1)
      {
        str = r.a("Connecting", 2131231076);
        continue;
      }
      if (this.k != 4)
        continue;
      str = r.a("Updating", 2131231920);
    }
  }

  public void a(int paramInt, Object[] paramArrayOfObject)
  {
    if (paramInt == org.vidogram.messenger.y.au)
    {
      if (this.v != null)
        this.v.notifyDataSetChanged();
      paramArrayOfObject = this.p.e.iterator();
      while (paramArrayOfObject.hasNext())
        ((g)paramArrayOfObject.next()).g();
      this.p.e.clear();
      if (org.vidogram.messenger.a.c())
      {
        paramArrayOfObject = this.q.e.iterator();
        while (paramArrayOfObject.hasNext())
          ((g)paramArrayOfObject.next()).g();
        this.q.e.clear();
        paramArrayOfObject = this.r.e.iterator();
        while (paramArrayOfObject.hasNext())
          ((g)paramArrayOfObject.next()).g();
        this.r.e.clear();
      }
      startActivity(new Intent(this, IntroActivity.class));
      e();
      finish();
    }
    do
    {
      do
        while (true)
        {
          return;
          if (paramInt == org.vidogram.messenger.y.ap)
          {
            if (paramArrayOfObject[0] == this)
              continue;
            e();
            finish();
            return;
          }
          if (paramInt == org.vidogram.messenger.y.aq)
          {
            paramInt = ConnectionsManager.a().e();
            if (this.k == paramInt)
              continue;
            n.b("tmessages", "switch to state " + paramInt);
            this.k = paramInt;
            h();
            return;
          }
          if (paramInt == org.vidogram.messenger.y.C)
          {
            this.v.notifyDataSetChanged();
            return;
          }
          if (paramInt == org.vidogram.messenger.y.Y)
          {
            localObject = (Integer)paramArrayOfObject[0];
            AlertDialog.Builder localBuilder = new AlertDialog.Builder(this);
            localBuilder.setTitle(r.a("AppName", 2131230856));
            localBuilder.setPositiveButton(r.a("OK", 2131231604), null);
            if (((Integer)localObject).intValue() != 2)
              localBuilder.setNegativeButton(r.a("MoreInfo", 2131231465), new DialogInterface.OnClickListener()
              {
                public void onClick(DialogInterface paramDialogInterface, int paramInt)
                {
                  if (!LaunchActivity.b().isEmpty())
                    org.vidogram.messenger.v.a("spambot", (g)LaunchActivity.b().get(LaunchActivity.b().size() - 1), 1);
                }
              });
            if (((Integer)localObject).intValue() == 0)
              localBuilder.setMessage(r.a("NobodyLikesSpam1", 2131231520));
            while (!l.isEmpty())
            {
              ((g)l.get(l.size() - 1)).b(localBuilder.create());
              return;
              if (((Integer)localObject).intValue() == 1)
              {
                localBuilder.setMessage(r.a("NobodyLikesSpam2", 2131231521));
                continue;
              }
              if (((Integer)localObject).intValue() != 2)
                continue;
              localBuilder.setMessage((String)paramArrayOfObject[1]);
            }
            continue;
          }
          if (paramInt != org.vidogram.messenger.y.ad)
            break;
          paramArrayOfObject = (HashMap)paramArrayOfObject[0];
          Object localObject = new AlertDialog.Builder(this);
          ((AlertDialog.Builder)localObject).setTitle(r.a("AppName", 2131230856));
          ((AlertDialog.Builder)localObject).setPositiveButton(r.a("OK", 2131231604), null);
          ((AlertDialog.Builder)localObject).setNegativeButton(r.a("ShareYouLocationUnableManually", 2131231843), new DialogInterface.OnClickListener(paramArrayOfObject)
          {
            public void onClick(DialogInterface paramDialogInterface, int paramInt)
            {
              if (LaunchActivity.b().isEmpty());
              do
                return;
              while (!org.vidogram.messenger.a.a((g)LaunchActivity.b().get(LaunchActivity.b().size() - 1)));
              paramDialogInterface = new ad();
              paramDialogInterface.a(new ad.a()
              {
                public void a(g.au paramau)
                {
                  Iterator localIterator = LaunchActivity.8.this.a.entrySet().iterator();
                  while (localIterator.hasNext())
                  {
                    org.vidogram.messenger.u localu = (org.vidogram.messenger.u)((Map.Entry)localIterator.next()).getValue();
                    org.vidogram.messenger.ac.a().a(paramau, localu.u(), localu, null, null);
                  }
                }
              });
              LaunchActivity.this.a(paramDialogInterface);
            }
          });
          ((AlertDialog.Builder)localObject).setMessage(r.a("ShareYouLocationUnable", 2131231842));
          if (l.isEmpty())
            continue;
          ((g)l.get(l.size() - 1)).b(((AlertDialog.Builder)localObject).create());
          return;
        }
      while ((paramInt != org.vidogram.messenger.y.ak) || (this.y == null));
      paramArrayOfObject = this.y.getChildAt(0);
    }
    while (paramArrayOfObject == null);
    paramArrayOfObject.invalidate();
  }

  public void a(g paramg)
  {
    this.p.a(paramg);
  }

  public void a(v paramv, long paramLong, boolean paramBoolean)
  {
    int i1;
    int i2;
    if (paramLong != 0L)
    {
      i1 = (int)paramLong;
      i2 = (int)(paramLong >> 32);
      localObject1 = new Bundle();
      ((Bundle)localObject1).putBoolean("scrollToTopOnResume", true);
      if (!org.vidogram.messenger.a.c())
        org.vidogram.messenger.y.a().a(org.vidogram.messenger.y.d, new Object[0]);
      if (i1 == 0)
        break label122;
      if (i2 != 1)
        break label85;
      ((Bundle)localObject1).putInt("chat_id", i1);
    }
    while (!org.vidogram.messenger.v.a((Bundle)localObject1, paramv))
    {
      return;
      label85: if (i1 > 0)
      {
        ((Bundle)localObject1).putInt("user_id", i1);
        continue;
      }
      if (i1 >= 0)
        continue;
      ((Bundle)localObject1).putInt("chat_id", -i1);
      continue;
      label122: ((Bundle)localObject1).putInt("enc_id", i2);
    }
    Object localObject1 = new q((Bundle)localObject1);
    if (this.c != null)
    {
      if (Build.VERSION.SDK_INT >= 16)
      {
        if (org.vidogram.messenger.a.c())
        {
          this.p.a((g)localObject1, false, true, true);
          localObject2 = this.c;
          if (paramv == null)
            break label277;
        }
        label277: for (paramBoolean = true; ; paramBoolean = false)
        {
          if ((!((q)localObject1).a((String)localObject2, paramBoolean, false)) && (paramv != null) && (!org.vidogram.messenger.a.c()))
            paramv.a(true);
          this.e = null;
          this.c = null;
          this.d = null;
          this.f = null;
          this.i = null;
          this.j = null;
          return;
          this.p.a((g)localObject1, this.p.e.size() - 1);
          break;
        }
      }
      localObject2 = this.p;
      if (paramv != null)
      {
        paramBoolean = true;
        label296: if (paramv != null)
          break label340;
      }
      label340: for (bool = true; ; bool = false)
      {
        ((org.vidogram.ui.a.b)localObject2).a((g)localObject1, paramBoolean, bool, true);
        org.vidogram.messenger.ac.a(this.c, 0L, 0L, 0, 0, null, paramLong, null, null);
        break;
        paramBoolean = false;
        break label296;
      }
    }
    Object localObject2 = this.p;
    if (paramv != null)
    {
      paramBoolean = true;
      label359: if (paramv != null)
        break label579;
    }
    label579: for (boolean bool = true; ; bool = false)
    {
      ((org.vidogram.ui.a.b)localObject2).a((g)localObject1, paramBoolean, bool, true);
      if (this.e != null)
      {
        localObject1 = null;
        paramv = (v)localObject1;
        if (this.d != null)
        {
          paramv = (v)localObject1;
          if (this.d.length() <= 200)
          {
            paramv = (v)localObject1;
            if (this.e.size() == 1)
            {
              paramv = new ArrayList();
              paramv.add(this.d);
              this.d = null;
            }
          }
        }
        org.vidogram.messenger.ac.a(null, this.e, paramLong, null, paramv, null);
      }
      if (this.d != null)
        org.vidogram.messenger.ac.a(this.d, paramLong);
      if ((this.f != null) || (this.g != null))
        org.vidogram.messenger.ac.a(this.f, this.i, this.g, this.h, paramLong, null);
      if ((this.j == null) || (this.j.isEmpty()))
        break;
      paramv = this.j.iterator();
      while (paramv.hasNext())
      {
        localObject1 = (g.vw)paramv.next();
        org.vidogram.messenger.ac.a().a((g.vw)localObject1, paramLong, null, null, null);
      }
      break;
      paramBoolean = false;
      break label359;
    }
  }

  public boolean a()
  {
    if (am.a().f())
    {
      am.a().a(true, false);
      return true;
    }
    return false;
  }

  public boolean a(org.vidogram.ui.a.b paramb)
  {
    if (org.vidogram.messenger.a.c())
    {
      if ((paramb == this.p) && (paramb.e.size() <= 1))
      {
        e();
        finish();
        return false;
      }
      if (paramb == this.r)
        if (!this.C)
          this.u.setVisibility(0);
    }
    do
    {
      do
        return true;
      while ((paramb != this.q) || (!this.p.e.isEmpty()) || (this.q.e.size() != 1));
      e();
      finish();
      return false;
    }
    while (paramb.e.size() > 1);
    e();
    finish();
    return false;
  }

  public boolean a(g paramg, org.vidogram.ui.a.b paramb)
  {
    if (org.vidogram.messenger.a.c())
    {
      i locali = this.a;
      if ((!(paramg instanceof ae)) && (!(paramg instanceof u)) && (this.q.getVisibility() != 0))
      {
        bool = true;
        locali.a(bool, true);
        if (!(paramg instanceof v))
          break label154;
        if ((!((v)paramg).q()) || (paramb == this.p))
          break label438;
        this.p.i();
        this.p.b(paramg);
        this.q.i();
        this.q.setVisibility(8);
        this.a.a(true, false);
        if (!this.C)
        {
          this.t.setVisibility(0);
          if (this.r.e.isEmpty())
            this.u.setVisibility(0);
        }
      }
      label154: 
      do
      {
        do
        {
          return false;
          bool = false;
          break;
          if (!(paramg instanceof q))
            break label357;
          if ((this.C) || (paramb == this.r))
            break label271;
          this.r.setVisibility(0);
          this.u.setVisibility(8);
          this.r.i();
          this.r.b(paramg);
        }
        while (this.q.e.isEmpty());
        while (this.q.e.size() - 1 > 0)
          this.q.c((g)this.q.e.get(0));
        this.q.a(true);
        return false;
        if ((!this.C) || (paramb == this.p))
          break label438;
        this.p.b(paramg);
      }
      while (this.q.e.isEmpty());
      label271: 
      while (this.q.e.size() - 1 > 0)
        this.q.c((g)this.q.e.get(0));
      this.q.a(true);
      return false;
      label357: if (paramb != this.q)
      {
        this.q.setVisibility(0);
        this.a.a(false, true);
        if ((paramg instanceof ae))
        {
          this.u.setVisibility(0);
          this.t.setVisibility(8);
          this.s.setBackgroundColor(0);
        }
        while (true)
        {
          this.q.b(paramg);
          return false;
          this.s.setBackgroundColor(2130706432);
        }
      }
      label438: return true;
    }
    paramb = this.a;
    if ((!(paramg instanceof ae)) && (!(paramg instanceof u)));
    for (boolean bool = true; ; bool = false)
    {
      paramb.a(bool, false);
      return true;
    }
  }

  public boolean a(g paramg, boolean paramBoolean1, boolean paramBoolean2)
  {
    return this.p.a(paramg, paramBoolean1, paramBoolean2, true);
  }

  public boolean a(g paramg, boolean paramBoolean1, boolean paramBoolean2, org.vidogram.ui.a.b paramb)
  {
    boolean bool5 = true;
    boolean bool3 = true;
    boolean bool4 = true;
    boolean bool2 = true;
    if (org.vidogram.messenger.a.c())
    {
      i locali = this.a;
      boolean bool1;
      if ((!(paramg instanceof ae)) && (!(paramg instanceof u)) && (this.q.getVisibility() != 0))
      {
        bool1 = true;
        locali.a(bool1, true);
        if ((!(paramg instanceof v)) || (!((v)paramg).q()) || (paramb == this.p))
          break label173;
        this.p.i();
        this.p.a(paramg, paramBoolean1, paramBoolean2, false);
        this.q.i();
        this.q.setVisibility(8);
        this.a.a(true, false);
        if (!this.C)
        {
          this.t.setVisibility(0);
          if (this.r.e.isEmpty())
            this.u.setVisibility(0);
        }
      }
      label173: label340: 
      do
      {
        return false;
        bool1 = false;
        break;
        if (!(paramg instanceof q))
          break label718;
        if (((!this.C) && (paramb == this.r)) || ((this.C) && (paramb == this.p)))
        {
          if ((!this.C) || (paramb != this.p) || (this.p.e.size() != 1))
            paramBoolean1 = true;
          while (!this.q.e.isEmpty())
          {
            while (true)
              if (this.q.e.size() - 1 > 0)
              {
                this.q.c((g)this.q.e.get(0));
                continue;
                paramBoolean1 = false;
                break;
              }
            paramb = this.q;
            if (paramBoolean2)
              break label340;
          }
          for (bool1 = bool2; ; bool1 = false)
          {
            paramb.a(bool1);
            if (!paramBoolean1)
              this.p.a(paramg, false, paramBoolean2, false);
            return paramBoolean1;
          }
        }
        if ((this.C) || (paramb == this.r))
          break label474;
        this.r.setVisibility(0);
        this.u.setVisibility(8);
        this.r.i();
        this.r.a(paramg, paramBoolean1, true, false);
      }
      while (this.q.e.isEmpty());
      while (this.q.e.size() - 1 > 0)
        this.q.c((g)this.q.e.get(0));
      paramg = this.q;
      if (!paramBoolean2);
      for (paramBoolean1 = bool5; ; paramBoolean1 = false)
      {
        paramg.a(paramBoolean1);
        return false;
      }
      label474: if ((this.C) && (paramb != this.p))
      {
        paramb = this.p;
        if (this.p.e.size() > 1);
        for (paramBoolean1 = true; ; paramBoolean1 = false)
        {
          paramb.a(paramg, paramBoolean1, paramBoolean2, false);
          if (this.q.e.isEmpty())
            break;
          while (this.q.e.size() - 1 > 0)
            this.q.c((g)this.q.e.get(0));
        }
        paramg = this.q;
        if (!paramBoolean2);
        for (paramBoolean1 = bool3; ; paramBoolean1 = false)
        {
          paramg.a(paramBoolean1);
          return false;
        }
      }
      if (!this.q.e.isEmpty())
      {
        while (this.q.e.size() - 1 > 0)
          this.q.c((g)this.q.e.get(0));
        paramb = this.q;
        if (!paramBoolean2)
        {
          paramBoolean1 = true;
          paramb.a(paramBoolean1);
        }
      }
      else
      {
        paramb = this.p;
        if (this.p.e.size() <= 1)
          break label713;
      }
      label713: for (paramBoolean1 = bool4; ; paramBoolean1 = false)
      {
        paramb.a(paramg, paramBoolean1, paramBoolean2, false);
        return false;
        paramBoolean1 = false;
        break;
      }
      label718: if (paramb != this.q)
      {
        this.q.setVisibility(0);
        this.a.a(false, true);
        if ((paramg instanceof ae))
        {
          this.u.setVisibility(0);
          this.t.setVisibility(8);
          this.s.setBackgroundColor(0);
        }
        while (true)
        {
          this.q.a(paramg, paramBoolean1, paramBoolean2, false);
          return false;
          this.s.setBackgroundColor(2130706432);
        }
      }
      return true;
    }
    paramb = this.a;
    if ((!(paramg instanceof ae)) && (!(paramg instanceof u)));
    for (paramBoolean1 = true; ; paramBoolean1 = false)
    {
      paramb.a(paramBoolean1, false);
      return true;
    }
  }

  public void b(org.vidogram.ui.a.b paramb)
  {
    if ((org.vidogram.messenger.a.c()) && (paramb == this.q))
    {
      this.r.b(true);
      this.r.h();
      this.p.b(true);
      this.p.h();
    }
    this.v.notifyDataSetChanged();
  }

  public void onActionModeFinished(ActionMode paramActionMode)
  {
    super.onActionModeFinished(paramActionMode);
    if ((Build.VERSION.SDK_INT >= 23) && (paramActionMode.getType() == 1));
    do
    {
      return;
      this.p.b(paramActionMode);
    }
    while (!org.vidogram.messenger.a.c());
    this.r.b(paramActionMode);
    this.q.b(paramActionMode);
  }

  public void onActionModeStarted(ActionMode paramActionMode)
  {
    super.onActionModeStarted(paramActionMode);
    if ((Build.VERSION.SDK_INT >= 23) && (paramActionMode.getType() == 1));
    do
    {
      return;
      this.p.a(paramActionMode);
    }
    while (!org.vidogram.messenger.a.c());
    this.r.a(paramActionMode);
    this.q.a(paramActionMode);
  }

  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if ((org.vidogram.messenger.ad.i.length() != 0) && (org.vidogram.messenger.ad.n != 0))
    {
      org.vidogram.messenger.ad.n = 0;
      org.vidogram.messenger.ad.a(false);
    }
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (this.p.e.size() != 0)
      ((g)this.p.e.get(this.p.e.size() - 1)).a(paramInt1, paramInt2, paramIntent);
    if (org.vidogram.messenger.a.c())
    {
      if (this.r.e.size() != 0)
        ((g)this.r.e.get(this.r.e.size() - 1)).a(paramInt1, paramInt2, paramIntent);
      if (this.q.e.size() != 0)
        ((g)this.q.e.get(this.q.e.size() - 1)).a(paramInt1, paramInt2, paramIntent);
    }
  }

  public void onBackPressed()
  {
    int i2 = 0;
    if (this.w.getVisibility() == 0)
      finish();
    while (true)
    {
      return;
      if (am.a().f())
      {
        am.a().a(true, false);
        return;
      }
      if (this.a.b())
      {
        this.a.b(false);
        return;
      }
      if (!org.vidogram.messenger.a.c())
        break;
      if (this.q.getVisibility() == 0)
      {
        this.q.d();
        return;
      }
      int i1 = i2;
      if (this.r.getVisibility() == 0)
      {
        i1 = i2;
        if (!this.r.e.isEmpty())
          if (((g)this.r.e.get(this.r.e.size() - 1)).k())
            break label150;
      }
      label150: for (i1 = 1; i1 == 0; i1 = 0)
      {
        this.p.d();
        return;
      }
    }
    this.p.d();
  }

  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    org.vidogram.messenger.a.a(this, paramConfiguration);
    super.onConfigurationChanged(paramConfiguration);
    c();
  }

  protected void onCreate(Bundle paramBundle)
  {
    int i2 = 8;
    boolean bool3 = true;
    ApplicationLoader.i();
    x.a(this);
    org.vidogram.messenger.a.a(this, getResources().getConfiguration());
    Object localObject1;
    if (!org.vidogram.messenger.ad.b())
    {
      localObject1 = getIntent();
      if ((localObject1 != null) && (((Intent)localObject1).getAction() != null) && (("android.intent.action.SEND".equals(((Intent)localObject1).getAction())) || (((Intent)localObject1).getAction().equals("android.intent.action.SEND_MULTIPLE"))))
      {
        super.onCreate(paramBundle);
        finish();
      }
    }
    label674: label689: label1217: label1232: label1241: label1402: Object localObject2;
    while (true)
    {
      return;
      requestWindowFeature(1);
      setTheme(2131427463);
      getWindow().setBackgroundDrawableResource(2130838191);
      super.onCreate(paramBundle);
      if (org.vidogram.messenger.ad.b())
        new itman.robert.groupchatwebrtc.a(this, org.vidogram.messenger.v.a().b(org.vidogram.messenger.ad.d()), org.vidogram.messenger.ad.c() + "", "Vidogram", ApplicationLoader.l().m(), org.vidogram.messenger.v.a().L).a();
      if (Build.VERSION.SDK_INT >= 24)
        org.vidogram.messenger.a.i = isInMultiWindowMode();
      org.vidogram.ui.a.l.a(this);
      if ((org.vidogram.messenger.ad.i.length() != 0) && (org.vidogram.messenger.ad.k))
        org.vidogram.messenger.ad.n = ConnectionsManager.a().b();
      int i1 = getResources().getIdentifier("status_bar_height", "dimen", "android");
      if (i1 > 0)
        org.vidogram.messenger.a.a = getResources().getDimensionPixelSize(i1);
      this.p = new org.vidogram.ui.a.b(this);
      this.a = new i(this);
      setContentView(this.a, new ViewGroup.LayoutParams(-1, -1));
      if (Build.VERSION.SDK_INT >= 21)
        getWindow().setStatusBarColor(org.vidogram.ui.a.l.a);
      Object localObject3;
      if (org.vidogram.messenger.a.c())
      {
        getWindow().setSoftInputMode(16);
        localObject1 = new RelativeLayout(this)
        {
          private boolean b;

          protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
          {
            int i = paramInt3 - paramInt1;
            if ((!org.vidogram.messenger.a.i) && ((!org.vidogram.messenger.a.d()) || (getResources().getConfiguration().orientation == 2)))
            {
              paramInt3 = i / 100 * 35;
              paramInt1 = paramInt3;
              if (paramInt3 < org.vidogram.messenger.a.a(320.0F))
                paramInt1 = org.vidogram.messenger.a.a(320.0F);
              LaunchActivity.b(LaunchActivity.this).layout(paramInt1, 0, LaunchActivity.b(LaunchActivity.this).getMeasuredWidth() + paramInt1, LaunchActivity.b(LaunchActivity.this).getMeasuredHeight());
              LaunchActivity.a(LaunchActivity.this).layout(0, 0, LaunchActivity.a(LaunchActivity.this).getMeasuredWidth(), LaunchActivity.a(LaunchActivity.this).getMeasuredHeight());
              LaunchActivity.c(LaunchActivity.this).layout(paramInt1, 0, LaunchActivity.c(LaunchActivity.this).getMeasuredWidth() + paramInt1, LaunchActivity.c(LaunchActivity.this).getMeasuredHeight());
              paramInt3 = (i - LaunchActivity.f(LaunchActivity.this).getMeasuredWidth()) / 2;
              if (Build.VERSION.SDK_INT < 21)
                break label348;
            }
            label348: for (paramInt1 = org.vidogram.messenger.a.a; ; paramInt1 = 0)
            {
              paramInt1 += (paramInt4 - paramInt2 - LaunchActivity.f(LaunchActivity.this).getMeasuredHeight()) / 2;
              LaunchActivity.f(LaunchActivity.this).layout(paramInt3, paramInt1, LaunchActivity.f(LaunchActivity.this).getMeasuredWidth() + paramInt3, LaunchActivity.f(LaunchActivity.this).getMeasuredHeight() + paramInt1);
              LaunchActivity.d(LaunchActivity.this).layout(0, 0, LaunchActivity.d(LaunchActivity.this).getMeasuredWidth(), LaunchActivity.d(LaunchActivity.this).getMeasuredHeight());
              LaunchActivity.e(LaunchActivity.this).layout(0, 0, LaunchActivity.e(LaunchActivity.this).getMeasuredWidth(), LaunchActivity.e(LaunchActivity.this).getMeasuredHeight());
              return;
              LaunchActivity.a(LaunchActivity.this).layout(0, 0, LaunchActivity.a(LaunchActivity.this).getMeasuredWidth(), LaunchActivity.a(LaunchActivity.this).getMeasuredHeight());
              break;
            }
          }

          protected void onMeasure(int paramInt1, int paramInt2)
          {
            this.b = true;
            int j = View.MeasureSpec.getSize(paramInt1);
            int i = View.MeasureSpec.getSize(paramInt2);
            setMeasuredDimension(j, i);
            org.vidogram.ui.a.b localb;
            if ((!org.vidogram.messenger.a.i) && ((!org.vidogram.messenger.a.d()) || (getResources().getConfiguration().orientation == 2)))
            {
              LaunchActivity.a(LaunchActivity.this, false);
              paramInt2 = j / 100 * 35;
              paramInt1 = paramInt2;
              if (paramInt2 < org.vidogram.messenger.a.a(320.0F))
                paramInt1 = org.vidogram.messenger.a.a(320.0F);
              LaunchActivity.a(LaunchActivity.this).measure(View.MeasureSpec.makeMeasureSpec(paramInt1, 1073741824), View.MeasureSpec.makeMeasureSpec(i, 1073741824));
              LaunchActivity.b(LaunchActivity.this).measure(View.MeasureSpec.makeMeasureSpec(org.vidogram.messenger.a.a(1.0F), 1073741824), View.MeasureSpec.makeMeasureSpec(i, 1073741824));
              LaunchActivity.c(LaunchActivity.this).measure(View.MeasureSpec.makeMeasureSpec(j - paramInt1, 1073741824), View.MeasureSpec.makeMeasureSpec(i, 1073741824));
              LaunchActivity.d(LaunchActivity.this).measure(View.MeasureSpec.makeMeasureSpec(j, 1073741824), View.MeasureSpec.makeMeasureSpec(i, 1073741824));
              LaunchActivity.e(LaunchActivity.this).measure(View.MeasureSpec.makeMeasureSpec(j, 1073741824), View.MeasureSpec.makeMeasureSpec(i, 1073741824));
              localb = LaunchActivity.f(LaunchActivity.this);
              paramInt2 = View.MeasureSpec.makeMeasureSpec(Math.min(org.vidogram.messenger.a.a(530.0F), j), 1073741824);
              j = org.vidogram.messenger.a.a(528.0F);
              if (Build.VERSION.SDK_INT < 21)
                break label306;
            }
            label306: for (paramInt1 = org.vidogram.messenger.a.a; ; paramInt1 = 0)
            {
              localb.measure(paramInt2, View.MeasureSpec.makeMeasureSpec(Math.min(j - paramInt1, i), 1073741824));
              this.b = false;
              return;
              LaunchActivity.a(LaunchActivity.this, true);
              LaunchActivity.a(LaunchActivity.this).measure(View.MeasureSpec.makeMeasureSpec(j, 1073741824), View.MeasureSpec.makeMeasureSpec(i, 1073741824));
              break;
            }
          }

          public void requestLayout()
          {
            if (this.b)
              return;
            super.requestLayout();
          }
        };
        this.a.addView((View)localObject1, org.vidogram.ui.Components.v.a(-1, -1.0F));
        this.u = new View(this);
        localObject3 = (BitmapDrawable)getResources().getDrawable(2130837679);
        ((BitmapDrawable)localObject3).setTileModeXY(Shader.TileMode.REPEAT, Shader.TileMode.REPEAT);
        this.u.setBackgroundDrawable((Drawable)localObject3);
        ((RelativeLayout)localObject1).addView(this.u, org.vidogram.ui.Components.v.a(-1, -1));
        ((RelativeLayout)localObject1).addView(this.p);
        this.r = new org.vidogram.ui.a.b(this);
        this.r.a(n);
        this.r.setDelegate(this);
        ((RelativeLayout)localObject1).addView(this.r);
        this.t = new FrameLayout(this);
        this.t.setBackgroundColor(1076449908);
        ((RelativeLayout)localObject1).addView(this.t);
        this.s = new FrameLayout(this);
        localObject3 = this.s;
        if (m.isEmpty())
        {
          i1 = 8;
          ((FrameLayout)localObject3).setVisibility(i1);
          this.s.setBackgroundColor(2130706432);
          ((RelativeLayout)localObject1).addView(this.s);
          this.s.setOnTouchListener(new View.OnTouchListener()
          {
            public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
            {
              if ((!LaunchActivity.a(LaunchActivity.this).e.isEmpty()) && (paramMotionEvent.getAction() == 1))
              {
                float f1 = paramMotionEvent.getX();
                float f2 = paramMotionEvent.getY();
                paramView = new int[2];
                LaunchActivity.f(LaunchActivity.this).getLocationOnScreen(paramView);
                int i = paramView[0];
                int j = paramView[1];
                if ((LaunchActivity.f(LaunchActivity.this).f()) || ((f1 > i) && (f1 < i + LaunchActivity.f(LaunchActivity.this).getWidth()) && (f2 > j) && (f2 < LaunchActivity.f(LaunchActivity.this).getHeight() + j)))
                  return false;
                if (!LaunchActivity.f(LaunchActivity.this).e.isEmpty())
                {
                  while (LaunchActivity.f(LaunchActivity.this).e.size() - 1 > 0)
                    LaunchActivity.f(LaunchActivity.this).c((g)LaunchActivity.f(LaunchActivity.this).e.get(0));
                  LaunchActivity.f(LaunchActivity.this).a(true);
                }
                return true;
              }
              return false;
            }
          });
          this.s.setOnClickListener(new View.OnClickListener()
          {
            public void onClick(View paramView)
            {
            }
          });
          this.q = new org.vidogram.ui.a.b(this);
          this.q.setRemoveActionBarExtraHeight(true);
          this.q.setBackgroundView(this.s);
          this.q.setUseAlphaAnimations(true);
          this.q.setBackgroundResource(2130837662);
          this.q.a(m);
          this.q.setDelegate(this);
          this.q.setDrawerLayoutContainer(this.a);
          localObject3 = this.q;
          if (!m.isEmpty())
            break label1156;
          i1 = i2;
          ((org.vidogram.ui.a.b)localObject3).setVisibility(i1);
          ((RelativeLayout)localObject1).addView(this.q);
          this.y = new ListView(this)
          {
            public boolean hasOverlappingRendering()
            {
              return false;
            }
          };
          this.y.setBackgroundColor(-1);
          localObject1 = this.y;
          localObject3 = new k(this);
          this.v = ((k)localObject3);
          ((ListView)localObject1).setAdapter((ListAdapter)localObject3);
          this.y.setChoiceMode(1);
          this.y.setDivider(null);
          this.y.setDividerHeight(0);
          this.y.setVerticalScrollBarEnabled(false);
          this.a.setDrawerLayout(this.y);
          localObject1 = (FrameLayout.LayoutParams)this.y.getLayoutParams();
          localObject3 = org.vidogram.messenger.a.g();
          if (!org.vidogram.messenger.a.c())
            break label1184;
        }
      }
      label1156: label1184: for (i1 = org.vidogram.messenger.a.a(320.0F); ; i1 = Math.min(org.vidogram.messenger.a.a(320.0F), Math.min(((Point)localObject3).x, ((Point)localObject3).y) - org.vidogram.messenger.a.a(56.0F)))
      {
        ((FrameLayout.LayoutParams)localObject1).width = i1;
        ((FrameLayout.LayoutParams)localObject1).height = -1;
        this.y.setLayoutParams((ViewGroup.LayoutParams)localObject1);
        this.y.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
          public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
          {
            if (paramInt == 0)
            {
              paramAdapterView = new Bundle();
              paramAdapterView.putInt("user_id", org.vidogram.messenger.ad.c());
              LaunchActivity.this.a(new q(paramAdapterView));
              LaunchActivity.this.a.b(false);
            }
            do
            {
              while (true)
              {
                return;
                if (paramInt == 2)
                {
                  if (!org.vidogram.messenger.v.a("chat_create", (g)LaunchActivity.a(LaunchActivity.this).e.get(LaunchActivity.a(LaunchActivity.this).e.size() - 1)))
                    continue;
                  LaunchActivity.this.a(new y());
                  LaunchActivity.this.a.b(false);
                  return;
                }
                if (paramInt == 3)
                {
                  paramAdapterView = new Bundle();
                  paramAdapterView.putBoolean("onlyUsers", true);
                  paramAdapterView.putBoolean("destroyAfterSelect", true);
                  paramAdapterView.putBoolean("createSecretChat", true);
                  paramAdapterView.putBoolean("allowBots", false);
                  LaunchActivity.this.a(new s(paramAdapterView));
                  LaunchActivity.this.a.b(false);
                  return;
                }
                if (paramInt != 4)
                  break;
                if (!org.vidogram.messenger.v.a("broadcast_create", (g)LaunchActivity.a(LaunchActivity.this).e.get(LaunchActivity.a(LaunchActivity.this).e.size() - 1)))
                  continue;
                paramAdapterView = ApplicationLoader.a.getSharedPreferences("mainconfig", 0);
                if (paramAdapterView.getBoolean("channel_intro", false))
                {
                  paramAdapterView = new Bundle();
                  paramAdapterView.putInt("step", 0);
                  LaunchActivity.this.a(new l(paramAdapterView));
                }
                while (true)
                {
                  LaunchActivity.this.a.b(false);
                  return;
                  LaunchActivity.this.a(new o());
                  paramAdapterView.edit().putBoolean("channel_intro", true).commit();
                }
              }
              if (paramInt == 6)
              {
                LaunchActivity.this.a(new s(null));
                LaunchActivity.this.a.b(false);
                return;
              }
              if (paramInt == 7)
                try
                {
                  paramAdapterView = new Intent("android.intent.action.SEND");
                  paramAdapterView.setType("text/plain");
                  paramAdapterView.putExtra("android.intent.extra.TEXT", org.vidogram.messenger.f.a().d());
                  LaunchActivity.this.startActivityForResult(Intent.createChooser(paramAdapterView, r.a("InviteFriends", 2131231321)), 500);
                  LaunchActivity.this.a.b(false);
                  return;
                }
                catch (Exception paramAdapterView)
                {
                  while (true)
                    n.a("tmessages", paramAdapterView);
                }
              if (paramInt == 8)
              {
                LaunchActivity.this.a(new aw());
                LaunchActivity.this.a.b(false);
                return;
              }
              if (paramInt != 10)
                continue;
              org.vidogram.messenger.b.a.a(LaunchActivity.this, r.a("TelegramFaqUrl", 2131231887));
              LaunchActivity.this.a.b(false);
              return;
            }
            while (paramInt != 9);
            itman.robert.b.a.b.a(LaunchActivity.this, 2131427547).a(LaunchActivity.this.getString(2131232159)).a(new itman.robert.a().b(ApplicationLoader.a)).a(c.a.b).b(12).a(new d()
            {
              public void a(int paramInt)
              {
              }
            }).a(LaunchActivity.this.getString(2131231116), new DialogInterface.OnClickListener()
            {
              public void onClick(DialogInterface paramDialogInterface, int paramInt)
              {
                if (new itman.robert.a().b(ApplicationLoader.a) != -11371101)
                {
                  new itman.robert.a().a(ApplicationLoader.a, -11371101);
                  paramDialogInterface = new Intent(LaunchActivity.this, LaunchActivity.class);
                  paramDialogInterface = PendingIntent.getActivity(LaunchActivity.this, 123456, paramDialogInterface, 268435456);
                  LaunchActivity localLaunchActivity1 = LaunchActivity.this;
                  LaunchActivity localLaunchActivity2 = LaunchActivity.this;
                  ((AlarmManager)localLaunchActivity1.getSystemService("alarm")).set(1, System.currentTimeMillis() + 100L, paramDialogInterface);
                  System.exit(0);
                }
              }
            }).a(LaunchActivity.this.getString(2131231604), new itman.robert.b.a.a()
            {
              public void a(DialogInterface paramDialogInterface, int paramInt, Integer[] paramArrayOfInteger)
              {
                if (new itman.robert.a().b(ApplicationLoader.a) != paramInt)
                {
                  new itman.robert.a().a(ApplicationLoader.a, paramInt);
                  paramDialogInterface = new Intent(LaunchActivity.this, LaunchActivity.class);
                  paramDialogInterface = PendingIntent.getActivity(LaunchActivity.this, 123456, paramDialogInterface, 268435456);
                  paramArrayOfInteger = LaunchActivity.this;
                  LaunchActivity localLaunchActivity = LaunchActivity.this;
                  ((AlarmManager)paramArrayOfInteger.getSystemService("alarm")).set(1, System.currentTimeMillis() + 100L, paramDialogInterface);
                  System.exit(0);
                }
              }
            }).b(LaunchActivity.this.getString(2131232575), new DialogInterface.OnClickListener()
            {
              public void onClick(DialogInterface paramDialogInterface, int paramInt)
              {
              }
            }).a().show();
            LaunchActivity.this.a.b(false);
          }
        });
        this.a.setParentActionBarLayout(this.p);
        this.p.setDrawerLayoutContainer(this.a);
        this.p.a(l);
        this.p.setDelegate(this);
        ApplicationLoader.f();
        this.w = new org.vidogram.ui.Components.ae(this);
        this.a.addView(this.w);
        localObject1 = (FrameLayout.LayoutParams)this.w.getLayoutParams();
        ((FrameLayout.LayoutParams)localObject1).width = -1;
        ((FrameLayout.LayoutParams)localObject1).height = -1;
        this.w.setLayoutParams((ViewGroup.LayoutParams)localObject1);
        org.vidogram.messenger.y.a().a(org.vidogram.messenger.y.ap, new Object[] { this });
        this.k = ConnectionsManager.a().e();
        org.vidogram.messenger.y.a().a(this, org.vidogram.messenger.y.au);
        org.vidogram.messenger.y.a().a(this, org.vidogram.messenger.y.C);
        org.vidogram.messenger.y.a().a(this, org.vidogram.messenger.y.ap);
        org.vidogram.messenger.y.a().a(this, org.vidogram.messenger.y.aq);
        org.vidogram.messenger.y.a().a(this, org.vidogram.messenger.y.Y);
        org.vidogram.messenger.y.a().a(this, org.vidogram.messenger.y.ad);
        org.vidogram.messenger.y.a().a(this, org.vidogram.messenger.y.ak);
        if (!this.p.e.isEmpty())
          break label1932;
        if (org.vidogram.messenger.ad.b())
          break label1537;
        if (!new itman.robert.a().c(getApplicationContext()))
          break label1519;
        localObject1 = getIntent();
        if ((localObject1 == null) || (((Intent)localObject1).getBooleanExtra("fromIntro", false)) || (!ApplicationLoader.a.getSharedPreferences("logininfo2", 0).getAll().isEmpty()))
          break label1217;
        startActivity(new Intent(this, IntroActivity.class));
        super.onCreate(paramBundle);
        finish();
        return;
        i1 = 0;
        break;
        i1 = 0;
        break label674;
        this.a.addView(this.p, new ViewGroup.LayoutParams(-1, -1));
        break label689;
      }
      this.p.b(new ae());
      this.a.a(false, false);
      if (paramBundle != null);
      try
      {
        localObject1 = paramBundle.getString("fragment");
        if (localObject1 != null)
        {
          localObject3 = paramBundle.getBundle("args");
          i1 = ((String)localObject1).hashCode();
          switch (i1)
          {
          default:
            label1340: i1 = -1;
            label1342: switch (i1)
            {
            default:
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            }
          case 3052376:
          case 1434631203:
          case 98629247:
          case 738950403:
          case 3108362:
          case -1349522494:
          case -1529105743:
          }
        }
        while (true)
        {
          while (true)
          {
            c();
            localObject1 = getIntent();
            if (paramBundle == null)
              break label2071;
            bool1 = bool3;
            a((Intent)localObject1, false, bool1, false);
            try
            {
              paramBundle = Build.DISPLAY;
              localObject1 = Build.USER;
              if (paramBundle == null)
                break label2077;
              paramBundle = paramBundle.toLowerCase();
              label1431: if (localObject1 == null)
                break label2084;
              localObject1 = paramBundle.toLowerCase();
              label1442: if ((!paramBundle.contains("flyme")) && (!((String)localObject1).contains("flyme")))
                break;
              org.vidogram.messenger.a.d = true;
              localObject1 = getWindow().getDecorView().getRootView();
              paramBundle = ((View)localObject1).getViewTreeObserver();
              localObject1 = new ViewTreeObserver.OnGlobalLayoutListener((View)localObject1)
              {
                public void onGlobalLayout()
                {
                  int j = this.a.getMeasuredHeight();
                  int i = j;
                  if (Build.VERSION.SDK_INT >= 21)
                    i = j - org.vidogram.messenger.a.a;
                  if ((i > org.vidogram.messenger.a.a(100.0F)) && (i < org.vidogram.messenger.a.c.y) && (org.vidogram.messenger.a.a(100.0F) + i > org.vidogram.messenger.a.c.y))
                  {
                    org.vidogram.messenger.a.c.y = i;
                    n.a("tmessages", "fix display size y to " + org.vidogram.messenger.a.c.y);
                  }
                }
              };
              this.o = ((ViewTreeObserver.OnGlobalLayoutListener)localObject1);
              paramBundle.addOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)localObject1);
              return;
            }
            catch (Exception paramBundle)
            {
              n.a("tmessages", paramBundle);
              return;
            }
          }
          label1519: this.p.b(new ac());
          break label1232;
          label1537: this.p.b(new v(null));
          this.a.a(true, false);
          break label1241;
          if (!((String)localObject1).equals("chat"))
            break label1340;
          i1 = 0;
          break label1342;
          if (!((String)localObject1).equals("settings"))
            break label1340;
          i1 = 1;
          break label1342;
          if (!((String)localObject1).equals("group"))
            break label1340;
          i1 = 2;
          break label1342;
          if (!((String)localObject1).equals("channel"))
            break label1340;
          i1 = 3;
          break label1342;
          if (!((String)localObject1).equals("edit"))
            break label1340;
          i1 = 4;
          break label1342;
          if (!((String)localObject1).equals("chat_profile"))
            break label1340;
          i1 = 5;
          break label1342;
          if (!((String)localObject1).equals("wallpapers"))
            break label1340;
          i1 = 6;
          break label1342;
          if (localObject3 == null)
            continue;
          localObject1 = new q((Bundle)localObject3);
          if (!this.p.b((g)localObject1))
            continue;
          ((q)localObject1).b(paramBundle);
        }
      }
      catch (Exception localObject2)
      {
        while (true)
        {
          n.a("tmessages", localException);
          continue;
          localObject2 = new aw();
          this.p.b((g)localObject2);
          ((aw)localObject2).b(paramBundle);
          continue;
          if (localObject3 == null)
            continue;
          localObject2 = new z((Bundle)localObject3);
          if (!this.p.b((g)localObject2))
            continue;
          ((z)localObject2).b(paramBundle);
          continue;
          if (localObject3 == null)
            continue;
          localObject2 = new l((Bundle)localObject3);
          if (!this.p.b((g)localObject2))
            continue;
          ((l)localObject2).b(paramBundle);
          continue;
          if (localObject3 == null)
            continue;
          localObject2 = new m((Bundle)localObject3);
          if (!this.p.b((g)localObject2))
            continue;
          ((m)localObject2).b(paramBundle);
          continue;
          if (localObject3 == null)
            continue;
          localObject2 = new aq((Bundle)localObject3);
          if (!this.p.b((g)localObject2))
            continue;
          ((aq)localObject2).b(paramBundle);
          continue;
          localObject2 = new bb();
          this.p.b((g)localObject2);
          ((bb)localObject2).b(paramBundle);
        }
      }
    }
    label1932: boolean bool2;
    if (org.vidogram.messenger.a.c())
      if ((this.p.e.size() <= 1) && (this.q.e.isEmpty()))
      {
        bool2 = true;
        label1968: bool1 = bool2;
        if (this.q.e.size() == 1)
        {
          bool1 = bool2;
          if (!(this.q.e.get(0) instanceof ae));
        }
      }
    for (boolean bool1 = false; ; bool1 = true)
    {
      bool2 = bool1;
      if (this.p.e.size() == 1)
      {
        bool2 = bool1;
        if ((this.p.e.get(0) instanceof ae))
          bool2 = false;
      }
      this.a.a(bool2, false);
      break;
      bool2 = false;
      break label1968;
      label2071: bool1 = false;
      break label1402;
      label2077: paramBundle = "";
      break label1431;
      label2084: localObject2 = "";
      break label1442;
    }
  }

  protected void onDestroy()
  {
    am.a().c();
    at.a().d();
    ax.a().e();
    try
    {
      if (this.x != null)
      {
        this.x.dismiss();
        this.x = null;
      }
    }
    catch (Exception localException2)
    {
      try
      {
        if (this.o != null)
        {
          View localView = getWindow().getDecorView().getRootView();
          if (Build.VERSION.SDK_INT >= 16)
            break label94;
          localView.getViewTreeObserver().removeGlobalOnLayoutListener(this.o);
        }
        while (true)
        {
          super.onDestroy();
          e();
          return;
          localException1 = localException1;
          n.a("tmessages", localException1);
          break;
          label94: localException1.getViewTreeObserver().removeOnGlobalLayoutListener(this.o);
        }
      }
      catch (Exception localException2)
      {
        while (true)
          n.a("tmessages", localException2);
      }
    }
  }

  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramInt == 82) && (!org.vidogram.messenger.ad.o))
    {
      if (am.a().f())
        return super.onKeyUp(paramInt, paramKeyEvent);
      if (!org.vidogram.messenger.a.c())
        break label123;
      if ((this.q.getVisibility() != 0) || (this.q.e.isEmpty()))
        break label74;
      this.q.onKeyUp(paramInt, paramKeyEvent);
    }
    while (true)
    {
      return super.onKeyUp(paramInt, paramKeyEvent);
      label74: if ((this.r.getVisibility() == 0) && (!this.r.e.isEmpty()))
      {
        this.r.onKeyUp(paramInt, paramKeyEvent);
        continue;
      }
      this.p.onKeyUp(paramInt, paramKeyEvent);
      continue;
      label123: if (this.p.e.size() == 1)
      {
        if (!this.a.b())
        {
          if (getCurrentFocus() != null)
            org.vidogram.messenger.a.b(getCurrentFocus());
          this.a.a(false);
          continue;
        }
        this.a.b(false);
        continue;
      }
      this.p.onKeyUp(paramInt, paramKeyEvent);
    }
  }

  public void onLowMemory()
  {
    super.onLowMemory();
    this.p.e();
    if (org.vidogram.messenger.a.c())
    {
      this.r.e();
      this.q.e();
    }
  }

  public void onMultiWindowModeChanged(boolean paramBoolean)
  {
    org.vidogram.messenger.a.i = paramBoolean;
    c();
  }

  protected void onNewIntent(Intent paramIntent)
  {
    super.onNewIntent(paramIntent);
    a(paramIntent, true, false, false);
  }

  protected void onPause()
  {
    super.onPause();
    ApplicationLoader.d = true;
    f();
    this.p.c();
    if (org.vidogram.messenger.a.c())
    {
      this.r.c();
      this.q.c();
    }
    if (this.w != null)
      this.w.b();
    ConnectionsManager.a().a(true, false);
    org.vidogram.messenger.a.h();
    if (am.a().f())
      am.a().e();
  }

  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    super.onRequestPermissionsResult(paramInt, paramArrayOfString, paramArrayOfInt);
    int i2;
    int i1;
    if ((paramInt == 3) || (paramInt == 4) || (paramInt == 5) || (paramInt == 19) || (paramInt == 20))
    {
      i2 = 1;
      i1 = i2;
      if (paramArrayOfInt.length > 0)
      {
        i1 = i2;
        if (paramArrayOfInt[0] == 0)
          if (paramInt == 4)
            p.a().b();
      }
    }
    do
    {
      do
      {
        do
        {
          return;
          if (paramInt != 5)
            continue;
          org.vidogram.messenger.f.a().i();
          return;
        }
        while (paramInt == 3);
        if (paramInt != 19)
        {
          i1 = i2;
          if (paramInt != 20);
        }
        else
        {
          i1 = 0;
        }
        if (i1 != 0)
        {
          paramArrayOfString = new AlertDialog.Builder(this);
          paramArrayOfString.setTitle(r.a("AppName", 2131230856));
          if (paramInt == 3)
            paramArrayOfString.setMessage(r.a("PermissionNoAudio", 2131231657));
          while (true)
          {
            paramArrayOfString.setNegativeButton(r.a("PermissionOpenSettings", 2131231661), new DialogInterface.OnClickListener()
            {
              @TargetApi(9)
              public void onClick(DialogInterface paramDialogInterface, int paramInt)
              {
                try
                {
                  paramDialogInterface = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                  paramDialogInterface.setData(Uri.parse("package:" + ApplicationLoader.a.getPackageName()));
                  LaunchActivity.this.startActivity(paramDialogInterface);
                  return;
                }
                catch (Exception paramDialogInterface)
                {
                  n.a("tmessages", paramDialogInterface);
                }
              }
            });
            paramArrayOfString.setPositiveButton(r.a("OK", 2131231604), null);
            paramArrayOfString.show();
            return;
            if (paramInt == 4)
            {
              paramArrayOfString.setMessage(r.a("PermissionStorage", 2131231662));
              continue;
            }
            if (paramInt == 5)
            {
              paramArrayOfString.setMessage(r.a("PermissionContacts", 2131231656));
              continue;
            }
            if ((paramInt != 19) && (paramInt != 20))
              continue;
            paramArrayOfString.setMessage(r.a("PermissionNoCamera", 2131231658));
          }
          if ((paramInt == 2) && (paramArrayOfInt.length > 0) && (paramArrayOfInt[0] == 0))
            org.vidogram.messenger.y.a().a(org.vidogram.messenger.y.ab, new Object[0]);
        }
        if (this.p.e.size() == 0)
          continue;
        ((g)this.p.e.get(this.p.e.size() - 1)).a(paramInt, paramArrayOfString, paramArrayOfInt);
      }
      while (!org.vidogram.messenger.a.c());
      if (this.r.e.size() == 0)
        continue;
      ((g)this.r.e.get(this.r.e.size() - 1)).a(paramInt, paramArrayOfString, paramArrayOfInt);
    }
    while (this.q.e.size() == 0);
    ((g)this.q.e.get(this.q.e.size() - 1)).a(paramInt, paramArrayOfString, paramArrayOfInt);
  }

  protected void onResume()
  {
    super.onResume();
    ApplicationLoader.d = false;
    g();
    if (this.w.getVisibility() != 0)
    {
      this.p.b();
      if (org.vidogram.messenger.a.c())
      {
        this.r.b();
        this.q.b();
      }
    }
    while (true)
    {
      org.vidogram.messenger.a.c(this);
      org.vidogram.messenger.a.d(this);
      ConnectionsManager.a().a(false, false);
      h();
      if (am.a().f())
        am.a().d();
      return;
      this.p.a();
      if (org.vidogram.messenger.a.c())
      {
        this.r.a();
        this.q.a();
      }
      this.w.a();
    }
  }

  protected void onSaveInstanceState(Bundle paramBundle)
  {
    while (true)
    {
      Bundle localBundle;
      try
      {
        super.onSaveInstanceState(paramBundle);
        if (!org.vidogram.messenger.a.c())
          continue;
        if (this.q.e.isEmpty())
          continue;
        localg = (g)this.q.e.get(this.q.e.size() - 1);
        if (localg == null)
          break;
        localBundle = localg.b();
        if ((!(localg instanceof q)) || (localBundle == null))
          continue;
        paramBundle.putBundle("args", localBundle);
        paramBundle.putString("fragment", "chat");
        localg.a(paramBundle);
        return;
        if (this.r.e.isEmpty())
          continue;
        localg = (g)this.r.e.get(this.r.e.size() - 1);
        continue;
        if (this.p.e.isEmpty())
          break label417;
        localg = (g)this.p.e.get(this.p.e.size() - 1);
        continue;
        if (this.p.e.isEmpty())
          break label417;
        localg = (g)this.p.e.get(this.p.e.size() - 1);
        continue;
        if ((localg instanceof aw))
        {
          paramBundle.putString("fragment", "settings");
          continue;
        }
      }
      catch (Exception paramBundle)
      {
        n.a("tmessages", paramBundle);
        return;
      }
      if (((localg instanceof z)) && (localBundle != null))
      {
        paramBundle.putBundle("args", localBundle);
        paramBundle.putString("fragment", "group");
        continue;
      }
      if ((localg instanceof bb))
      {
        paramBundle.putString("fragment", "wallpapers");
        continue;
      }
      if (((localg instanceof aq)) && (((aq)localg).q()) && (localBundle != null))
      {
        paramBundle.putBundle("args", localBundle);
        paramBundle.putString("fragment", "chat_profile");
        continue;
      }
      if (((localg instanceof l)) && (localBundle != null) && (localBundle.getInt("step") == 0))
      {
        paramBundle.putBundle("args", localBundle);
        paramBundle.putString("fragment", "channel");
        continue;
      }
      if ((!(localg instanceof m)) || (localBundle == null))
        continue;
      paramBundle.putBundle("args", localBundle);
      paramBundle.putString("fragment", "edit");
      continue;
      label417: g localg = null;
    }
  }

  protected void onStart()
  {
    super.onStart();
    org.vidogram.messenger.b.a.a(this);
  }

  protected void onStop()
  {
    super.onStop();
    org.vidogram.messenger.b.a.b(this);
  }

  private class a
  {
    String a;
    ArrayList<String> b = new ArrayList();

    private a()
    {
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.LaunchActivity
 * JD-Core Version:    0.6.0
 */