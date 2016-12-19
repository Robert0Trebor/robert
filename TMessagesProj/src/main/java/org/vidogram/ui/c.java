package org.vidogram.ui;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import org.vidogram.messenger.MediaController;
import org.vidogram.messenger.MediaController.c;
import org.vidogram.messenger.Utilities;
import org.vidogram.messenger.h;
import org.vidogram.messenger.r;
import org.vidogram.messenger.u;
import org.vidogram.messenger.y;
import org.vidogram.messenger.y.b;
import org.vidogram.ui.Components.am;
import org.vidogram.ui.Components.q;
import org.vidogram.ui.Components.v;
import org.vidogram.ui.a.a.a;
import org.vidogram.ui.a.g;
import org.vidogram.ui.c.d;
import org.vidogram.ui.c.d.a;

public class c extends g
  implements y.b
{
  private b i;
  private q j;
  private am k;
  private boolean l;
  private ArrayList<MediaController.c> m = new ArrayList();
  private HashMap<Long, MediaController.c> n = new HashMap();
  private a o;
  private u p;

  private void q()
  {
    this.k.a(this.n.size(), true);
  }

  private void r()
  {
    this.l = true;
    if (this.j != null)
      this.j.a();
    Utilities.d.b(new Runnable()
    {
      // ERROR //
      public void run()
      {
        // Byte code:
        //   0: new 27	java/util/ArrayList
        //   3: dup
        //   4: invokespecial 28	java/util/ArrayList:<init>	()V
        //   7: astore 6
        //   9: getstatic 33	org/vidogram/messenger/ApplicationLoader:a	Landroid/content/Context;
        //   12: invokevirtual 39	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
        //   15: getstatic 45	android/provider/MediaStore$Audio$Media:EXTERNAL_CONTENT_URI	Landroid/net/Uri;
        //   18: bipush 6
        //   20: anewarray 47	java/lang/String
        //   23: dup
        //   24: iconst_0
        //   25: ldc 49
        //   27: aastore
        //   28: dup
        //   29: iconst_1
        //   30: ldc 51
        //   32: aastore
        //   33: dup
        //   34: iconst_2
        //   35: ldc 53
        //   37: aastore
        //   38: dup
        //   39: iconst_3
        //   40: ldc 55
        //   42: aastore
        //   43: dup
        //   44: iconst_4
        //   45: ldc 57
        //   47: aastore
        //   48: dup
        //   49: iconst_5
        //   50: ldc 59
        //   52: aastore
        //   53: ldc 61
        //   55: aconst_null
        //   56: ldc 53
        //   58: invokevirtual 67	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //   61: astore 4
        //   63: ldc 68
        //   65: istore_1
        //   66: aload 4
        //   68: astore_3
        //   69: aload 4
        //   71: invokeinterface 74 1 0
        //   76: ifeq +672 -> 748
        //   79: aload 4
        //   81: astore_3
        //   82: new 76	org/vidogram/messenger/MediaController$c
        //   85: dup
        //   86: invokespecial 77	org/vidogram/messenger/MediaController$c:<init>	()V
        //   89: astore 7
        //   91: aload 4
        //   93: astore_3
        //   94: aload 7
        //   96: aload 4
        //   98: iconst_0
        //   99: invokeinterface 81 2 0
        //   104: i2l
        //   105: putfield 84	org/vidogram/messenger/MediaController$c:a	J
        //   108: aload 4
        //   110: astore_3
        //   111: aload 7
        //   113: aload 4
        //   115: iconst_1
        //   116: invokeinterface 88 2 0
        //   121: putfield 92	org/vidogram/messenger/MediaController$c:b	Ljava/lang/String;
        //   124: aload 4
        //   126: astore_3
        //   127: aload 7
        //   129: aload 4
        //   131: iconst_2
        //   132: invokeinterface 88 2 0
        //   137: putfield 95	org/vidogram/messenger/MediaController$c:c	Ljava/lang/String;
        //   140: aload 4
        //   142: astore_3
        //   143: aload 7
        //   145: aload 4
        //   147: iconst_3
        //   148: invokeinterface 88 2 0
        //   153: putfield 98	org/vidogram/messenger/MediaController$c:f	Ljava/lang/String;
        //   156: aload 4
        //   158: astore_3
        //   159: aload 7
        //   161: aload 4
        //   163: iconst_4
        //   164: invokeinterface 102 2 0
        //   169: ldc2_w 103
        //   172: ldiv
        //   173: l2i
        //   174: putfield 108	org/vidogram/messenger/MediaController$c:e	I
        //   177: aload 4
        //   179: astore_3
        //   180: aload 7
        //   182: aload 4
        //   184: iconst_5
        //   185: invokeinterface 88 2 0
        //   190: putfield 111	org/vidogram/messenger/MediaController$c:d	Ljava/lang/String;
        //   193: aload 4
        //   195: astore_3
        //   196: new 113	java/io/File
        //   199: dup
        //   200: aload 7
        //   202: getfield 98	org/vidogram/messenger/MediaController$c:f	Ljava/lang/String;
        //   205: invokespecial 116	java/io/File:<init>	(Ljava/lang/String;)V
        //   208: astore 8
        //   210: aload 4
        //   212: astore_3
        //   213: new 118	org/vidogram/tgnet/g$mg
        //   216: dup
        //   217: invokespecial 119	org/vidogram/tgnet/g$mg:<init>	()V
        //   220: astore 9
        //   222: aload 4
        //   224: astore_3
        //   225: aload 9
        //   227: iconst_1
        //   228: putfield 123	org/vidogram/tgnet/g$mg:n	Z
        //   231: aload 4
        //   233: astore_3
        //   234: aload 9
        //   236: iload_1
        //   237: putfield 125	org/vidogram/tgnet/g$mg:b	I
        //   240: aload 4
        //   242: astore_3
        //   243: aload 9
        //   245: new 127	org/vidogram/tgnet/g$ro
        //   248: dup
        //   249: invokespecial 128	org/vidogram/tgnet/g$ro:<init>	()V
        //   252: putfield 131	org/vidogram/tgnet/g$mg:d	Lorg/vidogram/tgnet/g$aw;
        //   255: aload 4
        //   257: astore_3
        //   258: aload 9
        //   260: getfield 131	org/vidogram/tgnet/g$mg:d	Lorg/vidogram/tgnet/g$aw;
        //   263: astore 5
        //   265: aload 4
        //   267: astore_3
        //   268: invokestatic 136	org/vidogram/messenger/ad:c	()I
        //   271: istore_2
        //   272: aload 4
        //   274: astore_3
        //   275: aload 9
        //   277: iload_2
        //   278: putfield 138	org/vidogram/tgnet/g$mg:c	I
        //   281: aload 4
        //   283: astore_3
        //   284: aload 5
        //   286: iload_2
        //   287: putfield 141	org/vidogram/tgnet/g$aw:c	I
        //   290: aload 4
        //   292: astore_3
        //   293: aload 9
        //   295: invokestatic 147	java/lang/System:currentTimeMillis	()J
        //   298: ldc2_w 103
        //   301: ldiv
        //   302: l2i
        //   303: putfield 148	org/vidogram/tgnet/g$mg:e	I
        //   306: aload 4
        //   308: astore_3
        //   309: aload 9
        //   311: ldc 150
        //   313: putfield 153	org/vidogram/tgnet/g$mg:i	Ljava/lang/String;
        //   316: aload 4
        //   318: astore_3
        //   319: aload 9
        //   321: aload 7
        //   323: getfield 98	org/vidogram/messenger/MediaController$c:f	Ljava/lang/String;
        //   326: putfield 156	org/vidogram/tgnet/g$mg:A	Ljava/lang/String;
        //   329: aload 4
        //   331: astore_3
        //   332: aload 9
        //   334: new 158	org/vidogram/tgnet/g$nw
        //   337: dup
        //   338: invokespecial 159	org/vidogram/tgnet/g$nw:<init>	()V
        //   341: putfield 163	org/vidogram/tgnet/g$mg:j	Lorg/vidogram/tgnet/g$au;
        //   344: aload 4
        //   346: astore_3
        //   347: aload 9
        //   349: getfield 163	org/vidogram/tgnet/g$mg:j	Lorg/vidogram/tgnet/g$au;
        //   352: new 165	org/vidogram/tgnet/g$hs
        //   355: dup
        //   356: invokespecial 166	org/vidogram/tgnet/g$hs:<init>	()V
        //   359: putfield 172	org/vidogram/tgnet/g$au:k	Lorg/vidogram/tgnet/g$q;
        //   362: aload 4
        //   364: astore_3
        //   365: aload 9
        //   367: aload 9
        //   369: getfield 174	org/vidogram/tgnet/g$mg:k	I
        //   372: sipush 768
        //   375: ior
        //   376: putfield 174	org/vidogram/tgnet/g$mg:k	I
        //   379: aload 4
        //   381: astore_3
        //   382: aload 8
        //   384: invokestatic 179	org/vidogram/messenger/m:a	(Ljava/io/File;)Ljava/lang/String;
        //   387: astore 5
        //   389: aload 4
        //   391: astore_3
        //   392: aload 9
        //   394: getfield 163	org/vidogram/tgnet/g$mg:j	Lorg/vidogram/tgnet/g$au;
        //   397: getfield 172	org/vidogram/tgnet/g$au:k	Lorg/vidogram/tgnet/g$q;
        //   400: lconst_0
        //   401: putfield 183	org/vidogram/tgnet/g$q:b	J
        //   404: aload 4
        //   406: astore_3
        //   407: aload 9
        //   409: getfield 163	org/vidogram/tgnet/g$mg:j	Lorg/vidogram/tgnet/g$au;
        //   412: getfield 172	org/vidogram/tgnet/g$au:k	Lorg/vidogram/tgnet/g$q;
        //   415: lconst_0
        //   416: putfield 185	org/vidogram/tgnet/g$q:c	J
        //   419: aload 4
        //   421: astore_3
        //   422: aload 9
        //   424: getfield 163	org/vidogram/tgnet/g$mg:j	Lorg/vidogram/tgnet/g$au;
        //   427: getfield 172	org/vidogram/tgnet/g$au:k	Lorg/vidogram/tgnet/g$q;
        //   430: aload 9
        //   432: getfield 148	org/vidogram/tgnet/g$mg:e	I
        //   435: putfield 186	org/vidogram/tgnet/g$q:e	I
        //   438: aload 4
        //   440: astore_3
        //   441: aload 9
        //   443: getfield 163	org/vidogram/tgnet/g$mg:j	Lorg/vidogram/tgnet/g$au;
        //   446: getfield 172	org/vidogram/tgnet/g$au:k	Lorg/vidogram/tgnet/g$q;
        //   449: astore 10
        //   451: aload 4
        //   453: astore_3
        //   454: new 188	java/lang/StringBuilder
        //   457: dup
        //   458: invokespecial 189	java/lang/StringBuilder:<init>	()V
        //   461: ldc 191
        //   463: invokevirtual 195	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   466: astore 11
        //   468: aload 4
        //   470: astore_3
        //   471: aload 5
        //   473: invokevirtual 198	java/lang/String:length	()I
        //   476: ifle +264 -> 740
        //   479: aload 4
        //   481: astore_3
        //   482: aload 10
        //   484: aload 11
        //   486: aload 5
        //   488: invokevirtual 195	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   491: invokevirtual 202	java/lang/StringBuilder:toString	()Ljava/lang/String;
        //   494: putfield 205	org/vidogram/tgnet/g$q:g	Ljava/lang/String;
        //   497: aload 4
        //   499: astore_3
        //   500: aload 9
        //   502: getfield 163	org/vidogram/tgnet/g$mg:j	Lorg/vidogram/tgnet/g$au;
        //   505: getfield 172	org/vidogram/tgnet/g$au:k	Lorg/vidogram/tgnet/g$q;
        //   508: aload 8
        //   510: invokevirtual 207	java/io/File:length	()J
        //   513: l2i
        //   514: putfield 210	org/vidogram/tgnet/g$q:h	I
        //   517: aload 4
        //   519: astore_3
        //   520: aload 9
        //   522: getfield 163	org/vidogram/tgnet/g$mg:j	Lorg/vidogram/tgnet/g$au;
        //   525: getfield 172	org/vidogram/tgnet/g$au:k	Lorg/vidogram/tgnet/g$q;
        //   528: new 212	org/vidogram/tgnet/g$rt
        //   531: dup
        //   532: invokespecial 213	org/vidogram/tgnet/g$rt:<init>	()V
        //   535: putfield 216	org/vidogram/tgnet/g$q:i	Lorg/vidogram/tgnet/g$az;
        //   538: aload 4
        //   540: astore_3
        //   541: aload 9
        //   543: getfield 163	org/vidogram/tgnet/g$mg:j	Lorg/vidogram/tgnet/g$au;
        //   546: getfield 172	org/vidogram/tgnet/g$au:k	Lorg/vidogram/tgnet/g$q;
        //   549: getfield 216	org/vidogram/tgnet/g$q:i	Lorg/vidogram/tgnet/g$az;
        //   552: ldc 218
        //   554: putfield 221	org/vidogram/tgnet/g$az:b	Ljava/lang/String;
        //   557: aload 4
        //   559: astore_3
        //   560: aload 9
        //   562: getfield 163	org/vidogram/tgnet/g$mg:j	Lorg/vidogram/tgnet/g$au;
        //   565: getfield 172	org/vidogram/tgnet/g$au:k	Lorg/vidogram/tgnet/g$q;
        //   568: iconst_0
        //   569: putfield 222	org/vidogram/tgnet/g$q:k	I
        //   572: aload 4
        //   574: astore_3
        //   575: new 224	org/vidogram/tgnet/g$hu
        //   578: dup
        //   579: invokespecial 225	org/vidogram/tgnet/g$hu:<init>	()V
        //   582: astore 5
        //   584: aload 4
        //   586: astore_3
        //   587: aload 5
        //   589: aload 7
        //   591: getfield 108	org/vidogram/messenger/MediaController$c:e	I
        //   594: putfield 227	org/vidogram/tgnet/g$hu:d	I
        //   597: aload 4
        //   599: astore_3
        //   600: aload 5
        //   602: aload 7
        //   604: getfield 95	org/vidogram/messenger/MediaController$c:c	Ljava/lang/String;
        //   607: putfield 229	org/vidogram/tgnet/g$hu:k	Ljava/lang/String;
        //   610: aload 4
        //   612: astore_3
        //   613: aload 5
        //   615: aload 7
        //   617: getfield 92	org/vidogram/messenger/MediaController$c:b	Ljava/lang/String;
        //   620: putfield 232	org/vidogram/tgnet/g$hu:l	Ljava/lang/String;
        //   623: aload 4
        //   625: astore_3
        //   626: aload 5
        //   628: aload 5
        //   630: getfield 233	org/vidogram/tgnet/g$hu:e	I
        //   633: iconst_3
        //   634: ior
        //   635: putfield 233	org/vidogram/tgnet/g$hu:e	I
        //   638: aload 4
        //   640: astore_3
        //   641: aload 9
        //   643: getfield 163	org/vidogram/tgnet/g$mg:j	Lorg/vidogram/tgnet/g$au;
        //   646: getfield 172	org/vidogram/tgnet/g$au:k	Lorg/vidogram/tgnet/g$q;
        //   649: getfield 237	org/vidogram/tgnet/g$q:o	Ljava/util/ArrayList;
        //   652: aload 5
        //   654: invokevirtual 241	java/util/ArrayList:add	(Ljava/lang/Object;)Z
        //   657: pop
        //   658: aload 4
        //   660: astore_3
        //   661: new 243	org/vidogram/tgnet/g$hx
        //   664: dup
        //   665: invokespecial 244	org/vidogram/tgnet/g$hx:<init>	()V
        //   668: astore 5
        //   670: aload 4
        //   672: astore_3
        //   673: aload 5
        //   675: aload 8
        //   677: invokevirtual 247	java/io/File:getName	()Ljava/lang/String;
        //   680: putfield 248	org/vidogram/tgnet/g$hx:g	Ljava/lang/String;
        //   683: aload 4
        //   685: astore_3
        //   686: aload 9
        //   688: getfield 163	org/vidogram/tgnet/g$mg:j	Lorg/vidogram/tgnet/g$au;
        //   691: getfield 172	org/vidogram/tgnet/g$au:k	Lorg/vidogram/tgnet/g$q;
        //   694: getfield 237	org/vidogram/tgnet/g$q:o	Ljava/util/ArrayList;
        //   697: aload 5
        //   699: invokevirtual 241	java/util/ArrayList:add	(Ljava/lang/Object;)Z
        //   702: pop
        //   703: aload 4
        //   705: astore_3
        //   706: aload 7
        //   708: new 250	org/vidogram/messenger/u
        //   711: dup
        //   712: aload 9
        //   714: aconst_null
        //   715: iconst_0
        //   716: invokespecial 253	org/vidogram/messenger/u:<init>	(Lorg/vidogram/tgnet/g$ar;Ljava/util/AbstractMap;Z)V
        //   719: putfield 256	org/vidogram/messenger/MediaController$c:g	Lorg/vidogram/messenger/u;
        //   722: aload 4
        //   724: astore_3
        //   725: aload 6
        //   727: aload 7
        //   729: invokevirtual 241	java/util/ArrayList:add	(Ljava/lang/Object;)Z
        //   732: pop
        //   733: iload_1
        //   734: iconst_1
        //   735: isub
        //   736: istore_1
        //   737: goto -671 -> 66
        //   740: ldc_w 258
        //   743: astore 5
        //   745: goto -266 -> 479
        //   748: aload 4
        //   750: ifnull +10 -> 760
        //   753: aload 4
        //   755: invokeinterface 261 1 0
        //   760: new 13	org/vidogram/ui/c$5$1
        //   763: dup
        //   764: aload_0
        //   765: aload 6
        //   767: invokespecial 264	org/vidogram/ui/c$5$1:<init>	(Lorg/vidogram/ui/c$5;Ljava/util/ArrayList;)V
        //   770: invokestatic 269	org/vidogram/messenger/a:a	(Ljava/lang/Runnable;)V
        //   773: return
        //   774: astore 5
        //   776: aconst_null
        //   777: astore 4
        //   779: aload 4
        //   781: astore_3
        //   782: ldc_w 271
        //   785: aload 5
        //   787: invokestatic 276	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   790: aload 4
        //   792: ifnull -32 -> 760
        //   795: aload 4
        //   797: invokeinterface 261 1 0
        //   802: goto -42 -> 760
        //   805: astore 4
        //   807: aconst_null
        //   808: astore_3
        //   809: aload_3
        //   810: ifnull +9 -> 819
        //   813: aload_3
        //   814: invokeinterface 261 1 0
        //   819: aload 4
        //   821: athrow
        //   822: astore 4
        //   824: goto -15 -> 809
        //   827: astore 5
        //   829: goto -50 -> 779
        //
        // Exception table:
        //   from	to	target	type
        //   9	63	774	java/lang/Exception
        //   9	63	805	finally
        //   69	79	822	finally
        //   82	91	822	finally
        //   94	108	822	finally
        //   111	124	822	finally
        //   127	140	822	finally
        //   143	156	822	finally
        //   159	177	822	finally
        //   180	193	822	finally
        //   196	210	822	finally
        //   213	222	822	finally
        //   225	231	822	finally
        //   234	240	822	finally
        //   243	255	822	finally
        //   258	265	822	finally
        //   268	272	822	finally
        //   275	281	822	finally
        //   284	290	822	finally
        //   293	306	822	finally
        //   309	316	822	finally
        //   319	329	822	finally
        //   332	344	822	finally
        //   347	362	822	finally
        //   365	379	822	finally
        //   382	389	822	finally
        //   392	404	822	finally
        //   407	419	822	finally
        //   422	438	822	finally
        //   441	451	822	finally
        //   454	468	822	finally
        //   471	479	822	finally
        //   482	497	822	finally
        //   500	517	822	finally
        //   520	538	822	finally
        //   541	557	822	finally
        //   560	572	822	finally
        //   575	584	822	finally
        //   587	597	822	finally
        //   600	610	822	finally
        //   613	623	822	finally
        //   626	638	822	finally
        //   641	658	822	finally
        //   661	670	822	finally
        //   673	683	822	finally
        //   686	703	822	finally
        //   706	722	822	finally
        //   725	733	822	finally
        //   782	790	822	finally
        //   69	79	827	java/lang/Exception
        //   82	91	827	java/lang/Exception
        //   94	108	827	java/lang/Exception
        //   111	124	827	java/lang/Exception
        //   127	140	827	java/lang/Exception
        //   143	156	827	java/lang/Exception
        //   159	177	827	java/lang/Exception
        //   180	193	827	java/lang/Exception
        //   196	210	827	java/lang/Exception
        //   213	222	827	java/lang/Exception
        //   225	231	827	java/lang/Exception
        //   234	240	827	java/lang/Exception
        //   243	255	827	java/lang/Exception
        //   258	265	827	java/lang/Exception
        //   268	272	827	java/lang/Exception
        //   275	281	827	java/lang/Exception
        //   284	290	827	java/lang/Exception
        //   293	306	827	java/lang/Exception
        //   309	316	827	java/lang/Exception
        //   319	329	827	java/lang/Exception
        //   332	344	827	java/lang/Exception
        //   347	362	827	java/lang/Exception
        //   365	379	827	java/lang/Exception
        //   382	389	827	java/lang/Exception
        //   392	404	827	java/lang/Exception
        //   407	419	827	java/lang/Exception
        //   422	438	827	java/lang/Exception
        //   441	451	827	java/lang/Exception
        //   454	468	827	java/lang/Exception
        //   471	479	827	java/lang/Exception
        //   482	497	827	java/lang/Exception
        //   500	517	827	java/lang/Exception
        //   520	538	827	java/lang/Exception
        //   541	557	827	java/lang/Exception
        //   560	572	827	java/lang/Exception
        //   575	584	827	java/lang/Exception
        //   587	597	827	java/lang/Exception
        //   600	610	827	java/lang/Exception
        //   613	623	827	java/lang/Exception
        //   626	638	827	java/lang/Exception
        //   641	658	827	java/lang/Exception
        //   661	670	827	java/lang/Exception
        //   673	683	827	java/lang/Exception
        //   686	703	827	java/lang/Exception
        //   706	722	827	java/lang/Exception
        //   725	733	827	java/lang/Exception
      }
    });
  }

  public View a(Context paramContext)
  {
    this.d.setBackButtonImage(2130837794);
    this.d.setAllowOverlayTitle(true);
    this.d.setTitle(r.a("AttachMusic", 2131230899));
    this.d.setActionBarMenuOnItemClick(new a.a()
    {
      public void a(int paramInt)
      {
        if (paramInt == -1)
          c.this.d();
      }
    });
    this.b = new FrameLayout(paramContext);
    FrameLayout localFrameLayout = (FrameLayout)this.b;
    this.j = new q(paramContext);
    this.j.setText(r.a("NoAudio", 2131231487));
    localFrameLayout.addView(this.j, v.a(-1, -1.0F));
    ListView localListView = new ListView(paramContext);
    localListView.setEmptyView(this.j);
    localListView.setVerticalScrollBarEnabled(false);
    localListView.setDivider(null);
    localListView.setDividerHeight(0);
    b localb = new b(paramContext);
    this.i = localb;
    localListView.setAdapter(localb);
    int i1;
    if (r.a)
    {
      i1 = 1;
      localListView.setVerticalScrollbarPosition(i1);
      localFrameLayout.addView(localListView, v.a(-1, -1.0F, 51, 0.0F, 0.0F, 0.0F, 48.0F));
      localListView.setOnItemClickListener(new AdapterView.OnItemClickListener()
      {
        public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
        {
          paramAdapterView = (d)paramView;
          paramView = paramAdapterView.getAudioEntry();
          if (c.a(c.this).containsKey(Long.valueOf(paramView.a)))
          {
            c.a(c.this).remove(Long.valueOf(paramView.a));
            paramAdapterView.setChecked(false);
          }
          while (true)
          {
            c.b(c.this);
            return;
            c.a(c.this).put(Long.valueOf(paramView.a), paramView);
            paramAdapterView.setChecked(true);
          }
        }
      });
      this.k = new am(paramContext, false);
      localFrameLayout.addView(this.k, v.b(-1, 48, 80));
      this.k.b.setOnClickListener(new View.OnClickListener()
      {
        public void onClick(View paramView)
        {
          c.this.d();
        }
      });
      this.k.a.setOnClickListener(new View.OnClickListener()
      {
        public void onClick(View paramView)
        {
          if (c.c(c.this) != null)
          {
            paramView = new ArrayList();
            Iterator localIterator = c.a(c.this).entrySet().iterator();
            while (localIterator.hasNext())
              paramView.add(((MediaController.c)((Map.Entry)localIterator.next()).getValue()).g);
            c.c(c.this).a(paramView);
          }
          c.this.d();
        }
      });
      paramContext = new View(paramContext);
      paramContext.setBackgroundResource(2130837788);
      localFrameLayout.addView(paramContext, v.a(-1, 3.0F, 83, 0.0F, 0.0F, 0.0F, 48.0F));
      if (!this.l)
        break label339;
      this.j.a();
    }
    while (true)
    {
      q();
      return this.b;
      i1 = 2;
      break;
      label339: this.j.b();
    }
  }

  public void a(int paramInt, Object[] paramArrayOfObject)
  {
    if (paramInt == y.d)
      e();
    do
      return;
    while ((paramInt != y.aF) || (this.i == null));
    this.i.notifyDataSetChanged();
  }

  public void a(a parama)
  {
    this.o = parama;
  }

  public boolean f()
  {
    super.f();
    y.a().a(this, y.d);
    y.a().a(this, y.aF);
    r();
    return true;
  }

  public void g()
  {
    super.g();
    y.a().b(this, y.d);
    y.a().b(this, y.aF);
    if ((this.p != null) && (MediaController.a().d(this.p)))
      MediaController.a().a(true, true);
  }

  public static abstract interface a
  {
    public abstract void a(ArrayList<u> paramArrayList);
  }

  private class b extends org.vidogram.ui.b.a
  {
    private Context b;

    public b(Context arg2)
    {
      Object localObject;
      this.b = localObject;
    }

    public boolean areAllItemsEnabled()
    {
      return true;
    }

    public int getCount()
    {
      return c.f(c.this).size();
    }

    public Object getItem(int paramInt)
    {
      return c.f(c.this).get(paramInt);
    }

    public long getItemId(int paramInt)
    {
      return paramInt;
    }

    public int getItemViewType(int paramInt)
    {
      return 0;
    }

    public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      getItemViewType(paramInt);
      if (paramView == null)
      {
        paramView = new d(this.b);
        ((d)paramView).setDelegate(new d.a()
        {
          public void a(u paramu)
          {
            c.a(c.this, paramu);
          }
        });
      }
      while (true)
      {
        paramViewGroup = (MediaController.c)c.f(c.this).get(paramInt);
        d locald = (d)paramView;
        MediaController.c localc = (MediaController.c)c.f(c.this).get(paramInt);
        if (paramInt != c.f(c.this).size() - 1);
        for (boolean bool = true; ; bool = false)
        {
          locald.a(localc, bool, c.a(c.this).containsKey(Long.valueOf(paramViewGroup.a)));
          return paramView;
        }
      }
    }

    public int getViewTypeCount()
    {
      return 1;
    }

    public boolean hasStableIds()
    {
      return false;
    }

    public boolean isEmpty()
    {
      return c.f(c.this).isEmpty();
    }

    public boolean isEnabled(int paramInt)
    {
      return true;
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.c
 * JD-Core Version:    0.6.0
 */