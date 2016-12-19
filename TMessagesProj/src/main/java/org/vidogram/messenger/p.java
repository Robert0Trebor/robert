package org.vidogram.messenger;

import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.media.ThumbnailUtils;
import android.os.AsyncTask;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.net.URLConnection;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;
import org.vidogram.tgnet.f;
import org.vidogram.tgnet.g.ar;
import org.vidogram.tgnet.g.au;
import org.vidogram.tgnet.g.ay;
import org.vidogram.tgnet.g.az;
import org.vidogram.tgnet.g.iz;
import org.vidogram.tgnet.g.ja;
import org.vidogram.tgnet.g.nw;
import org.vidogram.tgnet.g.ob;
import org.vidogram.tgnet.g.oi;
import org.vidogram.tgnet.g.q;
import org.vidogram.tgnet.g.rq;
import org.vidogram.tgnet.g.rs;
import org.vidogram.tgnet.g.wb;
import org.vidogram.tgnet.g.x;
import org.vidogram.ui.Components.AnimatedFileDrawable;

public class p
{
  private static volatile p C;
  private static byte[] o;
  private static byte[] p;
  private static byte[] q = new byte[12];
  private static byte[] r = new byte[12];
  private long A = 0L;
  private File B = null;
  private HashMap<String, Integer> a = new HashMap();
  private s b;
  private HashMap<String, a> c = new HashMap();
  private HashMap<String, a> d = new HashMap();
  private HashMap<Integer, a> e = new HashMap();
  private HashMap<String, e> f = new HashMap();
  private HashMap<Integer, String> g = new HashMap();
  private LinkedList<d> h = new LinkedList();
  private h i = new h("cacheOutQueue");
  private h j = new h("cacheThumbOutQueue");
  private h k = new h("thumbGeneratingQueue");
  private h l = new h("imageLoadQueue");
  private ConcurrentHashMap<String, Float> m = new ConcurrentHashMap();
  private HashMap<String, f> n = new HashMap();
  private int s = 0;
  private LinkedList<c> t = new LinkedList();
  private HashMap<String, c> u = new HashMap();
  private HashMap<String, Runnable> v = new HashMap();
  private int w = 0;
  private String x = null;
  private volatile long y = 0L;
  private int z = 0;

  static
  {
    C = null;
  }

  public p()
  {
    this.i.setPriority(1);
    this.j.setPriority(1);
    this.k.setPriority(1);
    this.l.setPriority(1);
    this.b = new s(Math.min(15, ((ActivityManager)ApplicationLoader.a.getSystemService("activity")).getMemoryClass() / 7) * 1024 * 1024)
    {
      protected int a(String paramString, BitmapDrawable paramBitmapDrawable)
      {
        return paramBitmapDrawable.getBitmap().getByteCount();
      }

      protected void a(boolean paramBoolean, String paramString, BitmapDrawable paramBitmapDrawable1, BitmapDrawable paramBitmapDrawable2)
      {
        if ((p.l(p.this) != null) && (paramString != null) && (p.l(p.this).equals(paramString)));
        do
        {
          do
          {
            return;
            paramString = (Integer)p.m(p.this).get(paramString);
          }
          while ((paramString != null) && (paramString.intValue() != 0));
          paramString = paramBitmapDrawable1.getBitmap();
        }
        while (paramString.isRecycled());
        paramString.recycle();
      }
    };
    m.a().a(new m.a()
    {
      public void a(String paramString, int paramInt)
      {
        p.a(p.this).remove(paramString);
        a.a(new Runnable(paramString, paramInt)
        {
          public void run()
          {
            p.a(p.this, this.a, this.b);
            y.a().a(y.aA, new Object[] { this.a, Integer.valueOf(this.b) });
          }
        });
      }

      public void a(String paramString, File paramFile, int paramInt)
      {
        p.a(p.this).remove(paramString);
        a.a(new Runnable(paramFile, paramString, paramInt)
        {
          public void run()
          {
            if ((MediaController.a().A()) && (p.n(p.this) != null) && (this.a != null) && ((this.b.endsWith(".mp4")) || (this.b.endsWith(".jpg"))) && (this.a.toString().startsWith(p.n(p.this).toString())))
              a.c(this.a.toString());
            y.a().a(y.az, new Object[] { this.b });
            p.a(p.this, this.b, this.a, this.c);
          }
        });
      }

      public void a(String paramString, boolean paramBoolean)
      {
        Utilities.c.b(new Runnable(paramString, paramBoolean)
        {
          public void run()
          {
            a.a(new Runnable()
            {
              public void run()
              {
                y.a().a(y.aw, new Object[] { p.4.1.this.a, Boolean.valueOf(p.4.1.this.b) });
              }
            });
            p.a(p.this).remove(this.a);
          }
        });
      }
    });
    Object localObject1 = new BroadcastReceiver()
    {
      public void onReceive(Context paramContext, Intent paramIntent)
      {
        n.a("tmessages", "file system changed");
        paramContext = new Runnable()
        {
          public void run()
          {
            p.this.b();
          }
        };
        if ("android.intent.action.MEDIA_UNMOUNTED".equals(paramIntent.getAction()))
        {
          a.a(paramContext, 1000L);
          return;
        }
        paramContext.run();
      }
    };
    Object localObject2 = new IntentFilter();
    ((IntentFilter)localObject2).addAction("android.intent.action.MEDIA_BAD_REMOVAL");
    ((IntentFilter)localObject2).addAction("android.intent.action.MEDIA_CHECKING");
    ((IntentFilter)localObject2).addAction("android.intent.action.MEDIA_EJECT");
    ((IntentFilter)localObject2).addAction("android.intent.action.MEDIA_MOUNTED");
    ((IntentFilter)localObject2).addAction("android.intent.action.MEDIA_NOFS");
    ((IntentFilter)localObject2).addAction("android.intent.action.MEDIA_REMOVED");
    ((IntentFilter)localObject2).addAction("android.intent.action.MEDIA_SHARED");
    ((IntentFilter)localObject2).addAction("android.intent.action.MEDIA_UNMOUNTABLE");
    ((IntentFilter)localObject2).addAction("android.intent.action.MEDIA_UNMOUNTED");
    ((IntentFilter)localObject2).addDataScheme("file");
    ApplicationLoader.a.registerReceiver((BroadcastReceiver)localObject1, (IntentFilter)localObject2);
    localObject1 = new HashMap();
    localObject2 = a.b();
    if (!((File)localObject2).isDirectory());
    try
    {
      ((File)localObject2).mkdirs();
    }
    catch (Exception localException2)
    {
      try
      {
        while (true)
        {
          new File((File)localObject2, ".nomedia").createNewFile();
          ((HashMap)localObject1).put(Integer.valueOf(4), localObject2);
          m.a().a((HashMap)localObject1);
          b();
          return;
          localException1 = localException1;
          n.a("tmessages", localException1);
        }
      }
      catch (Exception localException2)
      {
        while (true)
          n.a("tmessages", localException2);
      }
    }
  }

  // ERROR //
  public static Bitmap a(String paramString, android.net.Uri paramUri, float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 11
    //   3: aconst_null
    //   4: astore 12
    //   6: new 342	android/graphics/BitmapFactory$Options
    //   9: dup
    //   10: invokespecial 343	android/graphics/BitmapFactory$Options:<init>	()V
    //   13: astore 13
    //   15: aload 13
    //   17: iconst_1
    //   18: putfield 347	android/graphics/BitmapFactory$Options:inJustDecodeBounds	Z
    //   21: aload_0
    //   22: ifnonnull +294 -> 316
    //   25: aload_1
    //   26: ifnull +290 -> 316
    //   29: aload_1
    //   30: invokevirtual 353	android/net/Uri:getScheme	()Ljava/lang/String;
    //   33: ifnull +283 -> 316
    //   36: aload_1
    //   37: invokevirtual 353	android/net/Uri:getScheme	()Ljava/lang/String;
    //   40: ldc_w 285
    //   43: invokevirtual 359	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   46: ifeq +248 -> 294
    //   49: aload_1
    //   50: invokevirtual 362	android/net/Uri:getPath	()Ljava/lang/String;
    //   53: astore_0
    //   54: aload_0
    //   55: ifnull +264 -> 319
    //   58: aload_0
    //   59: aload 13
    //   61: invokestatic 368	android/graphics/BitmapFactory:decodeFile	(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   64: pop
    //   65: aconst_null
    //   66: astore 9
    //   68: aload 13
    //   70: getfield 371	android/graphics/BitmapFactory$Options:outWidth	I
    //   73: i2f
    //   74: fstore 5
    //   76: aload 13
    //   78: getfield 374	android/graphics/BitmapFactory$Options:outHeight	I
    //   81: i2f
    //   82: fstore 6
    //   84: iload 4
    //   86: ifeq +288 -> 374
    //   89: fload 5
    //   91: fload_2
    //   92: fdiv
    //   93: fload 6
    //   95: fload_3
    //   96: fdiv
    //   97: invokestatic 378	java/lang/Math:max	(FF)F
    //   100: fstore_2
    //   101: fload_2
    //   102: fstore_3
    //   103: fload_2
    //   104: fconst_1
    //   105: fcmpg
    //   106: ifge +5 -> 111
    //   109: fconst_1
    //   110: fstore_3
    //   111: aload 13
    //   113: iconst_0
    //   114: putfield 347	android/graphics/BitmapFactory$Options:inJustDecodeBounds	Z
    //   117: aload 13
    //   119: fload_3
    //   120: f2i
    //   121: putfield 381	android/graphics/BitmapFactory$Options:inSampleSize	I
    //   124: getstatic 386	android/os/Build$VERSION:SDK_INT	I
    //   127: bipush 21
    //   129: if_icmpge +260 -> 389
    //   132: iconst_1
    //   133: istore 4
    //   135: aload 13
    //   137: iload 4
    //   139: putfield 389	android/graphics/BitmapFactory$Options:inPurgeable	Z
    //   142: aload_0
    //   143: ifnull +252 -> 395
    //   146: aload_0
    //   147: astore 8
    //   149: aload 8
    //   151: ifnull +588 -> 739
    //   154: new 391	android/media/ExifInterface
    //   157: dup
    //   158: aload 8
    //   160: invokespecial 392	android/media/ExifInterface:<init>	(Ljava/lang/String;)V
    //   163: ldc_w 394
    //   166: iconst_1
    //   167: invokevirtual 398	android/media/ExifInterface:getAttributeInt	(Ljava/lang/String;I)I
    //   170: istore 7
    //   172: new 400	android/graphics/Matrix
    //   175: dup
    //   176: invokespecial 401	android/graphics/Matrix:<init>	()V
    //   179: astore 8
    //   181: iload 7
    //   183: tableswitch	default:+37 -> 220, 3:+254->437, 4:+37->220, 5:+37->220, 6:+225->408, 7:+37->220, 8:+266->449
    //   221: iconst_5
    //   222: astore 10
    //   224: aload_0
    //   225: ifnull +354 -> 579
    //   228: aload_0
    //   229: aload 13
    //   231: invokestatic 368	android/graphics/BitmapFactory:decodeFile	(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   234: astore_1
    //   235: aload_1
    //   236: astore 8
    //   238: aload_1
    //   239: ifnull +52 -> 291
    //   242: aload 13
    //   244: getfield 389	android/graphics/BitmapFactory$Options:inPurgeable	Z
    //   247: ifeq +8 -> 255
    //   250: aload_1
    //   251: invokestatic 407	org/vidogram/messenger/Utilities:pinBitmap	(Landroid/graphics/Bitmap;)I
    //   254: pop
    //   255: aload_1
    //   256: iconst_0
    //   257: iconst_0
    //   258: aload_1
    //   259: invokevirtual 412	android/graphics/Bitmap:getWidth	()I
    //   262: aload_1
    //   263: invokevirtual 415	android/graphics/Bitmap:getHeight	()I
    //   266: aload 10
    //   268: iconst_1
    //   269: invokestatic 420	org/vidogram/messenger/c:a	(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;
    //   272: astore 9
    //   274: aload_1
    //   275: astore 8
    //   277: aload 9
    //   279: aload_1
    //   280: if_acmpeq +11 -> 291
    //   283: aload_1
    //   284: invokevirtual 423	android/graphics/Bitmap:recycle	()V
    //   287: aload 9
    //   289: astore 8
    //   291: aload 8
    //   293: areturn
    //   294: aload_1
    //   295: invokestatic 426	org/vidogram/messenger/a:c	(Landroid/net/Uri;)Ljava/lang/String;
    //   298: astore 8
    //   300: aload 8
    //   302: astore_0
    //   303: goto -249 -> 54
    //   306: astore 8
    //   308: ldc_w 331
    //   311: aload 8
    //   313: invokestatic 336	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   316: goto -262 -> 54
    //   319: aload_1
    //   320: ifnull +431 -> 751
    //   323: getstatic 222	org/vidogram/messenger/ApplicationLoader:a	Landroid/content/Context;
    //   326: invokevirtual 430	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   329: aload_1
    //   330: invokevirtual 436	android/content/ContentResolver:openInputStream	(Landroid/net/Uri;)Ljava/io/InputStream;
    //   333: astore 8
    //   335: aload 8
    //   337: aconst_null
    //   338: aload 13
    //   340: invokestatic 440	android/graphics/BitmapFactory:decodeStream	(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   343: pop
    //   344: aload 8
    //   346: invokevirtual 445	java/io/InputStream:close	()V
    //   349: getstatic 222	org/vidogram/messenger/ApplicationLoader:a	Landroid/content/Context;
    //   352: invokevirtual 430	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   355: aload_1
    //   356: invokevirtual 436	android/content/ContentResolver:openInputStream	(Landroid/net/Uri;)Ljava/io/InputStream;
    //   359: astore 9
    //   361: goto -293 -> 68
    //   364: astore_0
    //   365: ldc_w 331
    //   368: aload_0
    //   369: invokestatic 336	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   372: aconst_null
    //   373: areturn
    //   374: fload 5
    //   376: fload_2
    //   377: fdiv
    //   378: fload 6
    //   380: fload_3
    //   381: fdiv
    //   382: invokestatic 447	java/lang/Math:min	(FF)F
    //   385: fstore_2
    //   386: goto -285 -> 101
    //   389: iconst_0
    //   390: istore 4
    //   392: goto -257 -> 135
    //   395: aload_1
    //   396: ifnull +349 -> 745
    //   399: aload_1
    //   400: invokestatic 426	org/vidogram/messenger/a:c	(Landroid/net/Uri;)Ljava/lang/String;
    //   403: astore 8
    //   405: goto -256 -> 149
    //   408: aload 8
    //   410: ldc_w 448
    //   413: invokevirtual 452	android/graphics/Matrix:postRotate	(F)Z
    //   416: pop
    //   417: goto -197 -> 220
    //   420: astore 10
    //   422: ldc_w 331
    //   425: aload 10
    //   427: invokestatic 336	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   430: aload 8
    //   432: astore 10
    //   434: goto -210 -> 224
    //   437: aload 8
    //   439: ldc_w 453
    //   442: invokevirtual 452	android/graphics/Matrix:postRotate	(F)Z
    //   445: pop
    //   446: goto -226 -> 220
    //   449: aload 8
    //   451: ldc_w 454
    //   454: invokevirtual 452	android/graphics/Matrix:postRotate	(F)Z
    //   457: pop
    //   458: goto -238 -> 220
    //   461: astore 8
    //   463: aconst_null
    //   464: astore_1
    //   465: ldc_w 331
    //   468: aload 8
    //   470: invokestatic 336	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   473: invokestatic 457	org/vidogram/messenger/p:a	()Lorg/vidogram/messenger/p;
    //   476: invokevirtual 459	org/vidogram/messenger/p:d	()V
    //   479: aload_1
    //   480: astore 8
    //   482: aload_1
    //   483: ifnonnull +40 -> 523
    //   486: aload_0
    //   487: aload 13
    //   489: invokestatic 368	android/graphics/BitmapFactory:decodeFile	(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   492: astore_0
    //   493: aload_0
    //   494: astore 8
    //   496: aload_0
    //   497: ifnull +26 -> 523
    //   500: aload_0
    //   501: astore 8
    //   503: aload_0
    //   504: astore_1
    //   505: aload 13
    //   507: getfield 389	android/graphics/BitmapFactory$Options:inPurgeable	Z
    //   510: ifeq +13 -> 523
    //   513: aload_0
    //   514: astore_1
    //   515: aload_0
    //   516: invokestatic 407	org/vidogram/messenger/Utilities:pinBitmap	(Landroid/graphics/Bitmap;)I
    //   519: pop
    //   520: aload_0
    //   521: astore 8
    //   523: aload 8
    //   525: astore_0
    //   526: aload_0
    //   527: astore 8
    //   529: aload_0
    //   530: ifnull -239 -> 291
    //   533: aload_0
    //   534: iconst_0
    //   535: iconst_0
    //   536: aload_0
    //   537: invokevirtual 412	android/graphics/Bitmap:getWidth	()I
    //   540: aload_0
    //   541: invokevirtual 415	android/graphics/Bitmap:getHeight	()I
    //   544: aload 10
    //   546: iconst_1
    //   547: invokestatic 420	org/vidogram/messenger/c:a	(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;
    //   550: astore_1
    //   551: aload_0
    //   552: astore 8
    //   554: aload_1
    //   555: aload_0
    //   556: if_acmpeq -265 -> 291
    //   559: aload_0
    //   560: invokevirtual 423	android/graphics/Bitmap:recycle	()V
    //   563: aload_1
    //   564: areturn
    //   565: astore 8
    //   567: aload_1
    //   568: astore_0
    //   569: ldc_w 331
    //   572: aload 8
    //   574: invokestatic 336	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   577: aload_0
    //   578: areturn
    //   579: aload 12
    //   581: astore 8
    //   583: aload_1
    //   584: ifnull -293 -> 291
    //   587: aload 11
    //   589: astore_0
    //   590: aload 9
    //   592: aconst_null
    //   593: aload 13
    //   595: invokestatic 440	android/graphics/BitmapFactory:decodeStream	(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   598: astore_1
    //   599: aload_1
    //   600: astore_0
    //   601: aload_1
    //   602: ifnull +58 -> 660
    //   605: aload_1
    //   606: astore_0
    //   607: aload 13
    //   609: getfield 389	android/graphics/BitmapFactory$Options:inPurgeable	Z
    //   612: ifeq +10 -> 622
    //   615: aload_1
    //   616: astore_0
    //   617: aload_1
    //   618: invokestatic 407	org/vidogram/messenger/Utilities:pinBitmap	(Landroid/graphics/Bitmap;)I
    //   621: pop
    //   622: aload_1
    //   623: astore_0
    //   624: aload_1
    //   625: iconst_0
    //   626: iconst_0
    //   627: aload_1
    //   628: invokevirtual 412	android/graphics/Bitmap:getWidth	()I
    //   631: aload_1
    //   632: invokevirtual 415	android/graphics/Bitmap:getHeight	()I
    //   635: aload 10
    //   637: iconst_1
    //   638: invokestatic 420	org/vidogram/messenger/c:a	(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;
    //   641: astore 8
    //   643: aload_1
    //   644: astore_0
    //   645: aload 8
    //   647: aload_1
    //   648: if_acmpeq +12 -> 660
    //   651: aload_1
    //   652: astore_0
    //   653: aload_1
    //   654: invokevirtual 423	android/graphics/Bitmap:recycle	()V
    //   657: aload 8
    //   659: astore_0
    //   660: aload 9
    //   662: invokevirtual 445	java/io/InputStream:close	()V
    //   665: aload_0
    //   666: areturn
    //   667: astore_1
    //   668: ldc_w 331
    //   671: aload_1
    //   672: invokestatic 336	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   675: aload_0
    //   676: areturn
    //   677: astore_1
    //   678: ldc_w 331
    //   681: aload_1
    //   682: invokestatic 336	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   685: aload 9
    //   687: invokevirtual 445	java/io/InputStream:close	()V
    //   690: aload_0
    //   691: areturn
    //   692: astore_1
    //   693: ldc_w 331
    //   696: aload_1
    //   697: invokestatic 336	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   700: aload_0
    //   701: areturn
    //   702: astore_0
    //   703: aload 9
    //   705: invokevirtual 445	java/io/InputStream:close	()V
    //   708: aload_0
    //   709: athrow
    //   710: astore_1
    //   711: ldc_w 331
    //   714: aload_1
    //   715: invokestatic 336	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   718: goto -10 -> 708
    //   721: astore 8
    //   723: goto -154 -> 569
    //   726: astore 8
    //   728: goto -263 -> 465
    //   731: astore 10
    //   733: aconst_null
    //   734: astore 8
    //   736: goto -314 -> 422
    //   739: aconst_null
    //   740: astore 10
    //   742: goto -518 -> 224
    //   745: aconst_null
    //   746: astore 8
    //   748: goto -599 -> 149
    //   751: aconst_null
    //   752: astore 9
    //   754: goto -686 -> 68
    //
    // Exception table:
    //   from	to	target	type
    //   294	300	306	java/lang/Throwable
    //   323	361	364	java/lang/Throwable
    //   408	417	420	java/lang/Throwable
    //   437	446	420	java/lang/Throwable
    //   449	458	420	java/lang/Throwable
    //   228	235	461	java/lang/Throwable
    //   486	493	565	java/lang/Throwable
    //   505	513	565	java/lang/Throwable
    //   515	520	565	java/lang/Throwable
    //   660	665	667	java/lang/Throwable
    //   590	599	677	java/lang/Throwable
    //   607	615	677	java/lang/Throwable
    //   617	622	677	java/lang/Throwable
    //   624	643	677	java/lang/Throwable
    //   653	657	677	java/lang/Throwable
    //   685	690	692	java/lang/Throwable
    //   590	599	702	finally
    //   607	615	702	finally
    //   617	622	702	finally
    //   624	643	702	finally
    //   653	657	702	finally
    //   678	685	702	finally
    //   703	708	710	java/lang/Throwable
    //   533	551	721	java/lang/Throwable
    //   559	563	721	java/lang/Throwable
    //   242	255	726	java/lang/Throwable
    //   255	274	726	java/lang/Throwable
    //   283	287	726	java/lang/Throwable
    //   154	181	731	java/lang/Throwable
  }

  public static p a()
  {
    Object localObject1 = C;
    if (localObject1 == null)
    {
      monitorenter;
      try
      {
        p localp = C;
        localObject1 = localp;
        if (localp == null)
        {
          localObject1 = new p();
          C = (p)localObject1;
        }
        return localObject1;
      }
      finally
      {
        monitorexit;
      }
    }
    return (p)localObject2;
  }

  public static g.az a(Bitmap paramBitmap, float paramFloat1, float paramFloat2, int paramInt, boolean paramBoolean)
  {
    return a(paramBitmap, paramFloat1, paramFloat2, paramInt, paramBoolean, 0, 0);
  }

  public static g.az a(Bitmap paramBitmap, float paramFloat1, float paramFloat2, int paramInt1, boolean paramBoolean, int paramInt2, int paramInt3)
  {
    if (paramBitmap == null)
      return null;
    float f1 = paramBitmap.getWidth();
    float f2 = paramBitmap.getHeight();
    if ((f1 == 0.0F) || (f2 == 0.0F))
      return null;
    boolean bool2 = false;
    paramFloat2 = Math.max(f1 / paramFloat1, f2 / paramFloat2);
    paramFloat1 = paramFloat2;
    boolean bool1 = bool2;
    if (paramInt2 != 0)
    {
      paramFloat1 = paramFloat2;
      bool1 = bool2;
      if (paramInt3 != 0)
        if (f1 >= paramInt2)
        {
          paramFloat1 = paramFloat2;
          bool1 = bool2;
          if (f2 >= paramInt3);
        }
        else
        {
          if ((f1 >= paramInt2) || (f2 <= paramInt3))
            break label151;
          paramFloat1 = f1 / paramInt2;
        }
    }
    while (true)
    {
      bool1 = true;
      paramInt2 = (int)(f1 / paramFloat1);
      paramInt3 = (int)(f2 / paramFloat1);
      if ((paramInt3 != 0) && (paramInt2 != 0))
        break;
      return null;
      label151: if ((f1 > paramInt2) && (f2 < paramInt3))
      {
        paramFloat1 = f2 / paramInt3;
        continue;
      }
      paramFloat1 = Math.max(f1 / paramInt2, f2 / paramInt3);
    }
    try
    {
      g.az localaz = a(paramBitmap, paramInt2, paramInt3, f1, f2, paramFloat1, paramInt1, paramBoolean, bool1);
      return localaz;
    }
    catch (Throwable localThrowable)
    {
      n.a("tmessages", localThrowable);
      a().d();
      System.gc();
      try
      {
        paramBitmap = a(paramBitmap, paramInt2, paramInt3, f1, f2, paramFloat1, paramInt1, paramBoolean, bool1);
        return paramBitmap;
      }
      catch (Throwable paramBitmap)
      {
        n.a("tmessages", paramBitmap);
      }
    }
    return null;
  }

  private static g.az a(Bitmap paramBitmap, int paramInt1, int paramInt2, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt3, boolean paramBoolean1, boolean paramBoolean2)
  {
    Bitmap localBitmap;
    Object localObject;
    g.rs localrs;
    if ((paramFloat3 > 1.0F) || (paramBoolean2))
    {
      localBitmap = c.a(paramBitmap, paramInt1, paramInt2, true);
      localObject = new g.iz();
      ((g.iz)localObject).c = -2147483648L;
      ((g.iz)localObject).b = -2147483648;
      ((g.iz)localObject).d = ad.d;
      ad.d -= 1;
      localrs = new g.rs();
      localrs.c = ((g.x)localObject);
      localrs.d = localBitmap.getWidth();
      localrs.e = localBitmap.getHeight();
      if ((localrs.d > 100) || (localrs.e > 100))
        break label282;
      localrs.b = "s";
      label126: localObject = ((g.iz)localObject).c + "_" + ((g.iz)localObject).d + ".jpg";
      localObject = new FileOutputStream(new File(m.a().b(4), (String)localObject));
      localBitmap.compress(Bitmap.CompressFormat.JPEG, paramInt3, (OutputStream)localObject);
      if (!paramBoolean1)
        break label392;
      ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
      localBitmap.compress(Bitmap.CompressFormat.JPEG, paramInt3, localByteArrayOutputStream);
      localrs.g = localByteArrayOutputStream.toByteArray();
      localrs.f = localrs.g.length;
      localByteArrayOutputStream.close();
    }
    while (true)
    {
      ((FileOutputStream)localObject).close();
      if (localBitmap != paramBitmap)
        localBitmap.recycle();
      return localrs;
      localBitmap = paramBitmap;
      break;
      label282: if ((localrs.d <= 320) && (localrs.e <= 320))
      {
        localrs.b = "m";
        break label126;
      }
      if ((localrs.d <= 800) && (localrs.e <= 800))
      {
        localrs.b = "x";
        break label126;
      }
      if ((localrs.d <= 1280) && (localrs.e <= 1280))
      {
        localrs.b = "y";
        break label126;
      }
      localrs.b = "w";
      break label126;
      label392: localrs.f = (int)((FileOutputStream)localObject).getChannel().size();
    }
  }

  private void a(int paramInt, File paramFile, g.x paramx, String paramString)
  {
    if (((paramInt != 0) && (paramInt != 2) && (paramInt != 3)) || (paramFile == null) || (paramx == null));
    String str;
    do
    {
      return;
      str = m.b(paramx);
    }
    while ((f)this.n.get(str) != null);
    paramFile = new f(paramInt, paramFile, paramx, paramString);
    this.k.b(paramFile);
  }

  private void a(Integer paramInteger)
  {
    String str = (String)this.g.get(paramInteger);
    if (str != null)
    {
      e locale = (e)this.f.get(str);
      if (locale != null)
      {
        e.a(locale);
        if (e.b(locale) == 0)
          this.f.remove(str);
      }
      this.g.remove(paramInteger);
    }
  }

  private void a(String paramString, int paramInt)
  {
    if (paramInt == 1)
      return;
    this.l.b(new Runnable(paramString)
    {
      public void run()
      {
        p.a locala = (p.a)p.j(p.this).get(this.a);
        if (locala != null)
          locala.a(null);
      }
    });
  }

  private void a(String paramString, File paramFile, int paramInt)
  {
    this.l.b(new Runnable(paramString, paramInt, paramFile)
    {
      public void run()
      {
        int k = 0;
        Object localObject = (p.e)p.o(p.this).get(this.a);
        if (localObject != null)
        {
          p.a(p.this, this.b, this.c, p.e.d((p.e)localObject), p.e.e((p.e)localObject));
          p.o(p.this).remove(this.a);
        }
        p.a locala2 = (p.a)p.j(p.this).get(this.a);
        if (locala2 == null)
          return;
        p.j(p.this).remove(this.a);
        ArrayList localArrayList = new ArrayList();
        int i = 0;
        int j;
        while (true)
        {
          j = k;
          if (i >= locala2.m.size())
            break;
          String str1 = (String)locala2.n.get(i);
          String str2 = (String)locala2.o.get(i);
          q localq = (q)locala2.m.get(i);
          p.a locala1 = (p.a)p.k(p.this).get(str1);
          localObject = locala1;
          if (locala1 == null)
          {
            localObject = new p.a(p.this, null);
            ((p.a)localObject).g = this.c;
            ((p.a)localObject).a = str1;
            ((p.a)localObject).j = locala2.j;
            ((p.a)localObject).i = locala2.i;
            ((p.a)localObject).d = locala2.d;
            ((p.a)localObject).l = new p.b(p.this, (p.a)localObject);
            ((p.a)localObject).c = str2;
            ((p.a)localObject).f = locala2.f;
            p.k(p.this).put(str1, localObject);
            localArrayList.add(((p.a)localObject).l);
          }
          ((p.a)localObject).a(localq, str1, str2);
          i += 1;
        }
        label338: if (j < localArrayList.size())
        {
          if (!locala2.i)
            break label381;
          p.g(p.this).b((Runnable)localArrayList.get(j));
        }
        while (true)
        {
          j += 1;
          break label338;
          break;
          label381: p.h(p.this).b((Runnable)localArrayList.get(j));
        }
      }
    });
  }

  public static void a(ArrayList<g.ar> paramArrayList)
  {
    if ((paramArrayList == null) || (paramArrayList.isEmpty()));
    while (true)
    {
      return;
      int i1 = 0;
      while (i1 < paramArrayList.size())
      {
        a((g.ar)paramArrayList.get(i1));
        i1 += 1;
      }
    }
  }

  private void a(c paramc, int paramInt)
  {
    a.a(new Runnable(paramc, paramInt)
    {
      public void run()
      {
        if (this.a != null)
          p.q(p.this);
        Object localObject;
        if (this.a != null)
        {
          if (this.b != 1)
            break label229;
          if (!p.c.b(this.a))
            break label178;
          localObject = new Runnable(new p.c(p.this, p.c.a(this.a), p.c.c(this.a), p.c.d(this.a)))
          {
            public void run()
            {
              p.r(p.this).add(this.a);
              p.a(p.this, null, 0);
            }
          };
          p.s(p.this).put(p.c.a(this.a), localObject);
          a.a((Runnable)localObject, 1000L);
        }
        while ((p.u(p.this) < 2) && (!p.r(p.this).isEmpty()))
        {
          ((p.c)p.r(p.this).poll()).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[] { null, null, null });
          p.v(p.this);
          continue;
          label178: p.t(p.this).remove(p.c.a(this.a));
          y.a().a(y.am, new Object[] { p.c.a(this.a), Integer.valueOf(0) });
          continue;
          label229: if (this.b != 2)
            continue;
          p.t(p.this).remove(p.c.a(this.a));
          localObject = new File(m.a().b(4), Utilities.e(p.c.a(this.a)) + "." + p.c.d(this.a));
          if (p.c.c(this.a).renameTo((File)localObject));
          for (localObject = ((File)localObject).toString(); ; localObject = p.c.c(this.a).toString())
          {
            y.a().a(y.al, new Object[] { p.c.a(this.a), localObject });
            break;
          }
        }
      }
    });
  }

  private void a(q paramq, String paramString1, String paramString2, String paramString3, f paramf, String paramString4, String paramString5, int paramInt1, boolean paramBoolean, int paramInt2)
  {
    if ((paramq == null) || (paramString2 == null) || (paramString1 == null))
      return;
    Object localObject2;
    Object localObject1;
    if (paramInt2 != 0)
    {
      bool1 = true;
      localObject2 = paramq.h(bool1);
      localObject1 = localObject2;
      if (localObject2 == null)
      {
        localObject2 = Integer.valueOf(this.z);
        if (paramInt2 == 0)
          break label161;
      }
    }
    label161: for (boolean bool1 = true; ; bool1 = false)
    {
      paramq.a((Integer)localObject2, bool1);
      this.z += 1;
      localObject1 = localObject2;
      if (this.z == 2147483647)
      {
        this.z = 0;
        localObject1 = localObject2;
      }
      bool1 = paramq.F();
      localObject2 = paramq.E();
      boolean bool2 = paramq.G();
      this.l.b(new Runnable(paramInt2, paramString2, paramString1, localObject1, paramq, paramString5, paramString4, bool1, (u)localObject2, paramf, bool2, paramBoolean, paramInt1, paramString3)
      {
        public void run()
        {
          boolean bool2 = false;
          Object localObject1;
          Object localObject2;
          Object localObject3;
          int i1;
          if (this.a != 2)
          {
            localObject1 = (p.a)p.j(p.this).get(this.b);
            localObject2 = (p.a)p.k(p.this).get(this.c);
            localObject3 = (p.a)p.f(p.this).get(this.d);
            if (localObject3 != null)
              if ((localObject3 == localObject1) || (localObject3 == localObject2))
              {
                i1 = 1;
                if ((i1 != 0) || (localObject2 == null))
                  break label1285;
                ((p.a)localObject2).a(this.e, this.c, this.f);
                i1 = 1;
                label116: if ((i1 != 0) || (localObject1 == null))
                  break label1282;
                ((p.a)localObject1).a(this.e, this.c, this.f);
                i1 = 1;
              }
          }
          while (true)
          {
            if (i1 == 0)
            {
              if (this.g == null)
                break label601;
              if (this.g.startsWith("http"))
                break label1262;
              if (!this.g.startsWith("thumb://"))
                break label531;
              i1 = this.g.indexOf(":", 8);
              if (i1 < 0)
                break label1276;
            }
            label372: label1270: label1276: for (localObject1 = new File(this.g.substring(i1 + 1)); ; localObject1 = null)
            {
              i1 = 1;
              boolean bool1;
              if (this.a != 2)
              {
                localObject3 = new p.a(p.this, null);
                if (((this.g != null) && (!this.g.startsWith("vthumb")) && (!this.g.startsWith("thumb")) && ((this.g.endsWith("mp4")) || (this.g.endsWith("gif")))) || (((this.j instanceof g.q)) && (u.a((g.q)this.j))))
                  ((p.a)localObject3).f = true;
                localObject2 = localObject1;
                if (localObject1 == null)
                {
                  if ((this.l) || (this.m == 0) || (this.g != null))
                    localObject2 = new File(m.a().b(4), this.b);
                }
                else
                {
                  if (this.a == 0)
                    break label976;
                  bool1 = true;
                  label381: ((p.a)localObject3).i = bool1;
                  ((p.a)localObject3).a = this.c;
                  ((p.a)localObject3).c = this.f;
                  ((p.a)localObject3).j = this.g;
                  ((p.a)localObject3).d = this.n;
                  ((p.a)localObject3).a(this.e, this.c, this.f);
                  if ((i1 == 0) && (!((File)localObject2).exists()))
                    break label997;
                  ((p.a)localObject3).g = ((File)localObject2);
                  ((p.a)localObject3).l = new p.b(p.this, (p.a)localObject3);
                  p.k(p.this).put(this.c, localObject3);
                  if (this.a == 0)
                    break label981;
                  p.g(p.this).b(((p.a)localObject3).l);
                }
              }
              else
              {
                return;
                ((p.a)localObject3).a(this.e);
                i1 = 0;
                break;
                if (this.g.startsWith("vthumb://"))
                {
                  i1 = this.g.indexOf(":", 9);
                  if (i1 < 0)
                    break label1270;
                }
              }
              for (localObject1 = new File(this.g.substring(i1 + 1)); ; localObject1 = null)
              {
                i1 = 1;
                break;
                localObject1 = new File(this.g);
                i1 = 1;
                break;
                if (this.a != 0)
                {
                  if (this.h)
                  {
                    localObject1 = new File(m.a().b(4), "q_" + this.b);
                    if (!((File)localObject1).exists())
                      localObject1 = null;
                  }
                  while (true)
                  {
                    if (this.i != null)
                    {
                      if ((this.i.a.A == null) || (this.i.a.A.length() <= 0))
                        break label1247;
                      localObject3 = new File(this.i.a.A);
                      localObject2 = localObject3;
                      if (((File)localObject3).exists());
                    }
                    for (localObject2 = null; ; localObject2 = null)
                    {
                      if (localObject2 == null)
                        localObject2 = m.b(this.i.a);
                      while (true)
                      {
                        if ((this.h) && (localObject1 == null))
                        {
                          String str = this.i.f();
                          p.e locale = (p.e)p.o(p.this).get(str);
                          localObject3 = locale;
                          if (locale == null)
                          {
                            localObject3 = new p.e(p.this, null);
                            p.e.a((p.e)localObject3, (g.iz)this.j);
                            p.e.a((p.e)localObject3, this.f);
                            p.o(p.this).put(str, localObject3);
                          }
                          p.e.c((p.e)localObject3);
                          p.p(p.this).put(this.d, str);
                        }
                        if ((((File)localObject2).exists()) && (this.k))
                          p.a(p.this, this.i.g(), (File)localObject2, (g.iz)this.j, this.f);
                        i1 = 0;
                        break;
                        if ((this.j instanceof g.q))
                        {
                          localObject2 = new File(m.a().b(3), this.b);
                          break label372;
                        }
                        localObject2 = new File(m.a().b(0), this.b);
                        break label372;
                        bool1 = false;
                        break label381;
                        p.h(p.this).b(((p.a)localObject3).l);
                        return;
                        ((p.a)localObject3).b = this.b;
                        ((p.a)localObject3).e = this.j;
                        p.j(p.this).put(this.b, localObject3);
                        if (this.g == null)
                        {
                          if ((this.j instanceof g.x))
                          {
                            localObject1 = (g.x)this.j;
                            localObject2 = m.a();
                            localObject3 = this.n;
                            i1 = this.m;
                            if ((this.m != 0) && (((g.x)localObject1).f == null))
                            {
                              bool1 = bool2;
                              if (!this.l);
                            }
                            else
                            {
                              bool1 = true;
                            }
                            ((m)localObject2).a((g.x)localObject1, (String)localObject3, i1, bool1);
                            return;
                          }
                          if (!(this.j instanceof g.q))
                            break label516;
                          m.a().a((g.q)this.j, true, this.l);
                          return;
                        }
                        localObject1 = Utilities.e(this.g);
                        ((p.a)localObject3).h = new File(m.a().b(4), (String)localObject1 + "_temp.jpg");
                        ((p.a)localObject3).g = ((File)localObject2);
                        ((p.a)localObject3).k = new p.d(p.this, (p.a)localObject3, this.m);
                        p.i(p.this).add(((p.a)localObject3).k);
                        p.a(p.this, false);
                        return;
                      }
                    }
                    continue;
                    localObject1 = null;
                  }
                }
                localObject1 = null;
                i1 = 0;
                break;
              }
            }
            label516: label531: label601: label997: label1262: continue;
            label976: label981: label1247: break label116;
            label1282: label1285: i1 = 0;
          }
        }
      });
      return;
      bool1 = false;
      break;
    }
  }

  public static void a(g.ar paramar)
  {
    int i1 = 0;
    Object localObject2 = null;
    Object localObject1;
    if ((paramar.j instanceof g.ob))
    {
      localObject2 = paramar.j.d.h.iterator();
      do
      {
        if (!((Iterator)localObject2).hasNext())
          break;
        localObject1 = (g.az)((Iterator)localObject2).next();
      }
      while (!(localObject1 instanceof g.rq));
    }
    while (true)
    {
      if ((localObject1 != null) && (((g.az)localObject1).g != null) && (((g.az)localObject1).g.length != 0))
      {
        if ((((g.az)localObject1).c instanceof g.ja))
        {
          ((g.az)localObject1).c = new g.iz();
          ((g.az)localObject1).c.c = -2147483648L;
          ((g.az)localObject1).c.b = -2147483648;
          ((g.az)localObject1).c.d = ad.d;
          ad.d -= 1;
        }
        localObject2 = m.a((f)localObject1, true);
        if (((File)localObject2).exists());
      }
      while (true)
      {
        try
        {
          localObject2 = new RandomAccessFile((File)localObject2, "rws");
          ((RandomAccessFile)localObject2).write(((g.az)localObject1).g);
          ((RandomAccessFile)localObject2).close();
          localObject2 = new g.rs();
          ((g.rs)localObject2).d = ((g.az)localObject1).d;
          ((g.rs)localObject2).e = ((g.az)localObject1).e;
          ((g.rs)localObject2).c = ((g.az)localObject1).c;
          ((g.rs)localObject2).f = ((g.az)localObject1).f;
          ((g.rs)localObject2).b = ((g.az)localObject1).b;
          if (!(paramar.j instanceof g.ob))
            continue;
          i1 = 0;
          if (i1 >= paramar.j.d.h.size())
            continue;
          if (!(paramar.j.d.h.get(i1) instanceof g.rq))
            continue;
          paramar.j.d.h.set(i1, localObject2);
          return;
          if (!(paramar.j instanceof g.nw))
            continue;
          localObject1 = localObject2;
          if (!(paramar.j.k.i instanceof g.rq))
            break;
          localObject1 = paramar.j.k.i;
          break;
          localObject1 = localObject2;
          if (!(paramar.j instanceof g.oi))
            break;
          localObject1 = localObject2;
          if (paramar.j.r.k == null)
            break;
          Iterator localIterator = paramar.j.r.k.h.iterator();
          localObject1 = localObject2;
          if (!localIterator.hasNext())
            break;
          localObject1 = (g.az)localIterator.next();
          if (!(localObject1 instanceof g.rq))
            continue;
        }
        catch (Exception localException)
        {
          n.a("tmessages", localException);
          continue;
          i1 += 1;
          continue;
          if (!(paramar.j instanceof g.nw))
            continue;
          paramar.j.k.i = localException;
          return;
          if (!(paramar.j instanceof g.oi))
            continue;
        }
        while (i1 < paramar.j.r.k.h.size())
        {
          if ((paramar.j.r.k.h.get(i1) instanceof g.rq))
          {
            paramar.j.r.k.h.set(i1, localException);
            return;
          }
          i1 += 1;
        }
      }
      localObject1 = null;
    }
  }

  public static void a(g.az paramaz)
  {
    if ((paramaz == null) || (paramaz.g != null));
    while (true)
    {
      return;
      Object localObject = m.a(paramaz, true);
      try
      {
        localObject = new RandomAccessFile((File)localObject, "r");
        if ((int)((RandomAccessFile)localObject).length() >= 20000)
          continue;
        paramaz.g = new byte[(int)((RandomAccessFile)localObject).length()];
        ((RandomAccessFile)localObject).readFully(paramaz.g, 0, paramaz.g.length);
        return;
      }
      catch (Throwable paramaz)
      {
        n.a("tmessages", paramaz);
      }
    }
  }

  private void a(boolean paramBoolean)
  {
    if (paramBoolean)
      this.s -= 1;
    while ((this.s < 4) && (!this.h.isEmpty()))
    {
      ((d)this.h.poll()).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[] { null, null, null });
      this.s += 1;
    }
  }

  // ERROR //
  private boolean a(File paramFile1, File paramFile2, int paramInt)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 8
    //   3: aconst_null
    //   4: astore 7
    //   6: iload_3
    //   7: ifne +136 -> 143
    //   10: aload 8
    //   12: astore 5
    //   14: new 299	java/io/File
    //   17: dup
    //   18: aload_1
    //   19: ldc_w 776
    //   22: invokespecial 311	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   25: astore 6
    //   27: aload 8
    //   29: astore 5
    //   31: new 299	java/io/File
    //   34: dup
    //   35: aload_2
    //   36: ldc_w 778
    //   39: invokespecial 311	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   42: astore_1
    //   43: aload 6
    //   45: astore_2
    //   46: aload 8
    //   48: astore 5
    //   50: sipush 1024
    //   53: newarray byte
    //   55: astore 9
    //   57: aload 8
    //   59: astore 5
    //   61: aload_2
    //   62: invokevirtual 314	java/io/File:createNewFile	()Z
    //   65: pop
    //   66: aload 8
    //   68: astore 5
    //   70: new 712	java/io/RandomAccessFile
    //   73: dup
    //   74: aload_2
    //   75: ldc_w 714
    //   78: invokespecial 715	java/io/RandomAccessFile:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   81: astore 6
    //   83: aload 6
    //   85: aload 9
    //   87: invokevirtual 719	java/io/RandomAccessFile:write	([B)V
    //   90: aload 6
    //   92: invokevirtual 720	java/io/RandomAccessFile:close	()V
    //   95: aload 8
    //   97: astore 5
    //   99: aload_2
    //   100: aload_1
    //   101: invokevirtual 782	java/io/File:renameTo	(Ljava/io/File;)Z
    //   104: istore 4
    //   106: aload 8
    //   108: astore 5
    //   110: aload_2
    //   111: invokevirtual 785	java/io/File:delete	()Z
    //   114: pop
    //   115: aload 8
    //   117: astore 5
    //   119: aload_1
    //   120: invokevirtual 785	java/io/File:delete	()Z
    //   123: pop
    //   124: iload 4
    //   126: ifeq +161 -> 287
    //   129: iconst_0
    //   130: ifeq +11 -> 141
    //   133: new 787	java/lang/NullPointerException
    //   136: dup
    //   137: invokespecial 788	java/lang/NullPointerException:<init>	()V
    //   140: athrow
    //   141: iconst_1
    //   142: ireturn
    //   143: iload_3
    //   144: iconst_3
    //   145: if_icmpne +44 -> 189
    //   148: aload 8
    //   150: astore 5
    //   152: new 299	java/io/File
    //   155: dup
    //   156: aload_1
    //   157: ldc_w 790
    //   160: invokespecial 311	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   163: astore_1
    //   164: aload 8
    //   166: astore 5
    //   168: new 299	java/io/File
    //   171: dup
    //   172: aload_2
    //   173: ldc_w 792
    //   176: invokespecial 311	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   179: astore 6
    //   181: aload_1
    //   182: astore_2
    //   183: aload 6
    //   185: astore_1
    //   186: goto -140 -> 46
    //   189: iload_3
    //   190: iconst_1
    //   191: if_icmpne +42 -> 233
    //   194: aload 8
    //   196: astore 5
    //   198: new 299	java/io/File
    //   201: dup
    //   202: aload_1
    //   203: ldc_w 794
    //   206: invokespecial 311	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   209: astore 6
    //   211: aload 8
    //   213: astore 5
    //   215: new 299	java/io/File
    //   218: dup
    //   219: aload_2
    //   220: ldc_w 796
    //   223: invokespecial 311	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   226: astore_1
    //   227: aload 6
    //   229: astore_2
    //   230: goto -184 -> 46
    //   233: iload_3
    //   234: iconst_2
    //   235: if_icmpne +152 -> 387
    //   238: aload 8
    //   240: astore 5
    //   242: new 299	java/io/File
    //   245: dup
    //   246: aload_1
    //   247: ldc_w 798
    //   250: invokespecial 311	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   253: astore 6
    //   255: aload 8
    //   257: astore 5
    //   259: new 299	java/io/File
    //   262: dup
    //   263: aload_2
    //   264: ldc_w 800
    //   267: invokespecial 311	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   270: astore_1
    //   271: aload 6
    //   273: astore_2
    //   274: goto -228 -> 46
    //   277: astore_1
    //   278: ldc_w 331
    //   281: aload_1
    //   282: invokestatic 336	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   285: iconst_1
    //   286: ireturn
    //   287: iconst_0
    //   288: ifeq +11 -> 299
    //   291: new 787	java/lang/NullPointerException
    //   294: dup
    //   295: invokespecial 788	java/lang/NullPointerException:<init>	()V
    //   298: athrow
    //   299: iconst_0
    //   300: ireturn
    //   301: astore_1
    //   302: ldc_w 331
    //   305: aload_1
    //   306: invokestatic 336	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   309: goto -10 -> 299
    //   312: astore_2
    //   313: aload 7
    //   315: astore_1
    //   316: aload_1
    //   317: astore 5
    //   319: ldc_w 331
    //   322: aload_2
    //   323: invokestatic 336	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   326: aload_1
    //   327: ifnull -28 -> 299
    //   330: aload_1
    //   331: invokevirtual 720	java/io/RandomAccessFile:close	()V
    //   334: goto -35 -> 299
    //   337: astore_1
    //   338: ldc_w 331
    //   341: aload_1
    //   342: invokestatic 336	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   345: goto -46 -> 299
    //   348: astore_1
    //   349: aload 5
    //   351: ifnull +8 -> 359
    //   354: aload 5
    //   356: invokevirtual 720	java/io/RandomAccessFile:close	()V
    //   359: aload_1
    //   360: athrow
    //   361: astore_2
    //   362: ldc_w 331
    //   365: aload_2
    //   366: invokestatic 336	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   369: goto -10 -> 359
    //   372: astore_1
    //   373: aload 6
    //   375: astore 5
    //   377: goto -28 -> 349
    //   380: astore_2
    //   381: aload 6
    //   383: astore_1
    //   384: goto -68 -> 316
    //   387: aconst_null
    //   388: astore_1
    //   389: aconst_null
    //   390: astore_2
    //   391: goto -345 -> 46
    //
    // Exception table:
    //   from	to	target	type
    //   133	141	277	java/lang/Exception
    //   291	299	301	java/lang/Exception
    //   14	27	312	java/lang/Exception
    //   31	43	312	java/lang/Exception
    //   50	57	312	java/lang/Exception
    //   61	66	312	java/lang/Exception
    //   70	83	312	java/lang/Exception
    //   99	106	312	java/lang/Exception
    //   110	115	312	java/lang/Exception
    //   119	124	312	java/lang/Exception
    //   152	164	312	java/lang/Exception
    //   168	181	312	java/lang/Exception
    //   198	211	312	java/lang/Exception
    //   215	227	312	java/lang/Exception
    //   242	255	312	java/lang/Exception
    //   259	271	312	java/lang/Exception
    //   330	334	337	java/lang/Exception
    //   14	27	348	finally
    //   31	43	348	finally
    //   50	57	348	finally
    //   61	66	348	finally
    //   70	83	348	finally
    //   99	106	348	finally
    //   110	115	348	finally
    //   119	124	348	finally
    //   152	164	348	finally
    //   168	181	348	finally
    //   198	211	348	finally
    //   215	227	348	finally
    //   242	255	348	finally
    //   259	271	348	finally
    //   319	326	348	finally
    //   354	359	361	java/lang/Exception
    //   83	95	372	finally
    //   83	95	380	java/lang/Exception
  }

  public static String b(String paramString1, String paramString2)
  {
    String str = null;
    int i1 = paramString1.lastIndexOf('.');
    if (i1 != -1)
      str = paramString1.substring(i1 + 1);
    if ((str == null) || (str.length() == 0) || (str.length() > 4))
      return paramString2;
    return str;
  }

  private void h(String paramString)
  {
    this.l.b(new Runnable(paramString)
    {
      public void run()
      {
        p.a locala = (p.a)p.j(p.this).get(this.a);
        if (locala == null)
          return;
        p.d locald = locala.k;
        locala.k = new p.d(p.this, p.d.a(locald), p.d.b(locald));
        p.i(p.this).add(locala.k);
        p.a(p.this, false);
      }
    });
  }

  public BitmapDrawable a(f paramf, String paramString1, String paramString2)
  {
    Object localObject = null;
    if ((paramf == null) && (paramString1 == null))
      return null;
    if (paramString1 != null)
      paramString1 = Utilities.e(paramString1);
    while (true)
    {
      paramf = paramString1;
      if (paramString2 != null)
        paramf = paramString1 + "@" + paramString2;
      return this.b.a(paramf);
      if ((paramf instanceof g.x))
      {
        paramf = (g.x)paramf;
        paramString1 = paramf.c + "_" + paramf.d;
        continue;
      }
      paramString1 = localObject;
      if (!(paramf instanceof g.q))
        continue;
      paramf = (g.q)paramf;
      if (paramf.j == 0)
      {
        paramString1 = paramf.k + "_" + paramf.b;
        continue;
      }
      paramString1 = paramf.k + "_" + paramf.b + "_" + paramf.j;
    }
  }

  public Float a(String paramString)
  {
    if (paramString == null)
      return null;
    return (Float)this.m.get(paramString);
  }

  public void a(BitmapDrawable paramBitmapDrawable, String paramString)
  {
    this.b.b(paramString, paramBitmapDrawable);
  }

  public void a(String paramString1, String paramString2)
  {
    if ((paramString1 == null) || (paramString1.length() == 0) || (this.u.containsKey(paramString1)))
      return;
    paramString2 = b(paramString1, paramString2);
    File localFile = new File(m.a().b(4), Utilities.e(paramString1) + "_temp." + paramString2);
    localFile.delete();
    paramString2 = new c(paramString1, localFile, paramString2);
    this.t.add(paramString2);
    this.u.put(paramString1, paramString2);
    a(null, 0);
  }

  public void a(q paramq)
  {
    if (paramq == null)
      return;
    Object localObject1 = paramq.v();
    Object localObject2;
    if (localObject1 != null)
    {
      localObject2 = this.b.a((String)localObject1);
      if (localObject2 != null)
      {
        a(paramq, 0);
        if (!paramq.C())
        {
          paramq.a((BitmapDrawable)localObject2, (String)localObject1, false, true);
          return;
        }
      }
    }
    localObject1 = paramq.w();
    if (localObject1 != null)
    {
      localObject2 = this.b.a((String)localObject1);
      if (localObject2 != null)
      {
        paramq.a((BitmapDrawable)localObject2, (String)localObject1, true, true);
        a(paramq, 1);
      }
    }
    for (int i2 = 1; ; i2 = 0)
    {
      g.x localx = paramq.z();
      f localf = paramq.y();
      String str1 = paramq.A();
      int i1 = 0;
      Object localObject3 = null;
      localObject1 = null;
      localObject2 = null;
      Object localObject4 = paramq.r();
      Object localObject5 = localObject4;
      if (localObject4 == null)
        localObject5 = "jpg";
      if (str1 != null)
      {
        localObject1 = Utilities.e(str1);
        localObject3 = (String)localObject1 + "." + b(str1, "jpg");
        i1 = 0;
        localObject2 = null;
      }
      while (true)
      {
        label203: String str2;
        label270: String str3;
        if (localx != null)
        {
          localObject4 = localx.c + "_" + localx.d;
          localObject2 = (String)localObject4 + "." + (String)localObject5;
          str2 = paramq.t();
          str3 = paramq.u();
          if ((localObject1 != null) && (str2 != null))
          {
            localObject1 = (String)localObject1 + "@" + str2;
            label320: if ((localObject4 != null) && (str3 != null))
            {
              localObject4 = (String)localObject4 + "@" + str3;
              label358: if (str1 != null)
                if (i2 != 0)
                {
                  i1 = 2;
                  label369: a(paramq, (String)localObject4, (String)localObject2, (String)localObject5, localx, null, str3, 0, true, i1);
                  a(paramq, (String)localObject1, (String)localObject3, (String)localObject5, null, str1, str2, 0, true, 0);
                  return;
                  if (localf == null)
                    break label971;
                  if ((localf instanceof g.x))
                  {
                    localObject4 = (g.x)localf;
                    localObject2 = ((g.x)localObject4).c + "_" + ((g.x)localObject4).d;
                    localObject3 = (String)localObject2 + "." + (String)localObject5;
                    if ((paramq.r() == null) && (((g.x)localObject4).f == null) && ((((g.x)localObject4).c != -2147483648L) || (((g.x)localObject4).d >= 0)))
                      break label966;
                    i1 = 1;
                  }
                }
            }
          }
        }
        while (true)
        {
          if (localf == localx)
          {
            localObject3 = null;
            localf = null;
            localObject4 = null;
            localObject2 = localObject1;
            localObject1 = localObject4;
            break label203;
            if (!(localf instanceof g.q))
              continue;
            localObject4 = (g.q)localf;
            if ((((g.q)localObject4).b == 0L) || (((g.q)localObject4).k == 0))
              break;
            if (((g.q)localObject4).j == 0)
            {
              localObject1 = ((g.q)localObject4).k + "_" + ((g.q)localObject4).b;
              label629: localObject2 = m.b((g.q)localObject4);
              if (localObject2 != null)
              {
                i1 = ((String)localObject2).lastIndexOf('.');
                if (i1 != -1)
                  break label828;
              }
              localObject2 = "";
              label659: localObject3 = localObject2;
              if (((String)localObject2).length() <= 1)
              {
                if ((((g.q)localObject4).g == null) || (!((g.q)localObject4).g.equals("video/mp4")))
                  break label839;
                localObject3 = ".mp4";
              }
              label699: localObject3 = (String)localObject1 + (String)localObject3;
              if (0 == 0)
                break label960;
            }
          }
          label828: label960: for (localObject2 = null + "." + (String)localObject5; ; localObject2 = null)
          {
            if (!u.a((g.q)localObject4));
            for (i1 = 1; ; i1 = 0)
            {
              localObject4 = localObject2;
              localObject2 = localObject1;
              localObject1 = localObject4;
              break;
              localObject1 = ((g.q)localObject4).k + "_" + ((g.q)localObject4).b + "_" + ((g.q)localObject4).j;
              break label629;
              localObject2 = ((String)localObject2).substring(i1);
              break label659;
              label839: localObject3 = "";
              break label699;
            }
            i1 = 1;
            break label369;
            if (i2 != 0)
            {
              i2 = 2;
              a(paramq, (String)localObject4, (String)localObject2, (String)localObject5, localx, null, str3, 0, true, i2);
              i2 = paramq.x();
              if ((i1 == 0) && (!paramq.B()))
                break label927;
            }
            for (boolean bool = true; ; bool = false)
            {
              a(paramq, (String)localObject1, (String)localObject3, (String)localObject5, localf, null, str2, i2, bool, 0);
              return;
              i2 = 1;
              break;
            }
            break label358;
            break label320;
            localObject4 = null;
            break label270;
            localObject4 = localObject1;
            localObject1 = localObject2;
            localObject2 = localObject4;
            break;
          }
          label927: label966: i1 = 0;
        }
        label971: localObject3 = null;
        i1 = 0;
        localObject1 = null;
        localObject2 = null;
      }
    }
  }

  public void a(q paramq, int paramInt)
  {
    if (paramq == null)
      return;
    this.l.b(new Runnable(paramInt, paramq)
    {
      public void run()
      {
        int j;
        int i;
        if (this.a == 1)
        {
          j = 1;
          i = 0;
        }
        while (true)
        {
          if (i < j)
          {
            Object localObject = this.b;
            if (i == 0);
            for (boolean bool = true; ; bool = false)
            {
              localObject = ((q)localObject).h(bool);
              if (i == 0)
                p.a(p.this, (Integer)localObject);
              if (localObject != null)
              {
                localObject = (p.a)p.f(p.this).get(localObject);
                if (localObject != null)
                  ((p.a)localObject).a(this.b);
              }
              i += 1;
              break;
              if (this.a != 2)
                break label114;
              j = 2;
              i = 1;
              break;
            }
          }
          return;
          label114: j = 2;
          i = 0;
        }
      }
    });
  }

  public void b()
  {
    this.i.b(new Runnable()
    {
      public void run()
      {
        a.a(new Runnable(p.this.c())
        {
          public void run()
          {
            m.a().a(this.a);
          }
        });
      }
    });
  }

  public void b(String paramString)
  {
    Integer localInteger = (Integer)this.a.get(paramString);
    if (localInteger == null)
    {
      this.a.put(paramString, Integer.valueOf(1));
      return;
    }
    this.a.put(paramString, Integer.valueOf(localInteger.intValue() + 1));
  }

  // ERROR //
  public HashMap<Integer, File> c()
  {
    // Byte code:
    //   0: new 147	java/util/HashMap
    //   3: dup
    //   4: invokespecial 148	java/util/HashMap:<init>	()V
    //   7: astore_2
    //   8: invokestatic 297	org/vidogram/messenger/a:b	()Ljava/io/File;
    //   11: astore_3
    //   12: aload_3
    //   13: invokevirtual 303	java/io/File:isDirectory	()Z
    //   16: ifne +8 -> 24
    //   19: aload_3
    //   20: invokevirtual 306	java/io/File:mkdirs	()Z
    //   23: pop
    //   24: new 299	java/io/File
    //   27: dup
    //   28: aload_3
    //   29: ldc_w 308
    //   32: invokespecial 311	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   35: invokevirtual 314	java/io/File:createNewFile	()Z
    //   38: pop
    //   39: aload_2
    //   40: iconst_4
    //   41: invokestatic 320	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   44: aload_3
    //   45: invokevirtual 324	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   48: pop
    //   49: ldc_w 331
    //   52: new 507	java/lang/StringBuilder
    //   55: dup
    //   56: invokespecial 508	java/lang/StringBuilder:<init>	()V
    //   59: ldc_w 933
    //   62: invokevirtual 517	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   65: aload_3
    //   66: invokevirtual 936	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   69: invokevirtual 525	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   72: invokestatic 938	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   75: ldc_w 940
    //   78: invokestatic 945	android/os/Environment:getExternalStorageState	()Ljava/lang/String;
    //   81: invokevirtual 912	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   84: ifeq +482 -> 566
    //   87: aload_0
    //   88: new 299	java/io/File
    //   91: dup
    //   92: invokestatic 948	android/os/Environment:getExternalStorageDirectory	()Ljava/io/File;
    //   95: ldc_w 950
    //   98: invokespecial 311	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   101: putfield 213	org/vidogram/messenger/p:B	Ljava/io/File;
    //   104: aload_0
    //   105: getfield 213	org/vidogram/messenger/p:B	Ljava/io/File;
    //   108: invokevirtual 306	java/io/File:mkdirs	()Z
    //   111: pop
    //   112: aload_0
    //   113: getfield 213	org/vidogram/messenger/p:B	Ljava/io/File;
    //   116: invokevirtual 303	java/io/File:isDirectory	()Z
    //   119: istore_1
    //   120: iload_1
    //   121: ifeq +351 -> 472
    //   124: new 299	java/io/File
    //   127: dup
    //   128: aload_0
    //   129: getfield 213	org/vidogram/messenger/p:B	Ljava/io/File;
    //   132: ldc_w 952
    //   135: invokespecial 311	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   138: astore 4
    //   140: aload 4
    //   142: invokevirtual 955	java/io/File:mkdir	()Z
    //   145: pop
    //   146: aload 4
    //   148: invokevirtual 303	java/io/File:isDirectory	()Z
    //   151: ifeq +52 -> 203
    //   154: aload_0
    //   155: aload_3
    //   156: aload 4
    //   158: iconst_0
    //   159: invokespecial 957	org/vidogram/messenger/p:a	(Ljava/io/File;Ljava/io/File;I)Z
    //   162: ifeq +41 -> 203
    //   165: aload_2
    //   166: iconst_0
    //   167: invokestatic 320	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   170: aload 4
    //   172: invokevirtual 324	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   175: pop
    //   176: ldc_w 331
    //   179: new 507	java/lang/StringBuilder
    //   182: dup
    //   183: invokespecial 508	java/lang/StringBuilder:<init>	()V
    //   186: ldc_w 959
    //   189: invokevirtual 517	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   192: aload 4
    //   194: invokevirtual 936	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   197: invokevirtual 525	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   200: invokestatic 938	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   203: new 299	java/io/File
    //   206: dup
    //   207: aload_0
    //   208: getfield 213	org/vidogram/messenger/p:B	Ljava/io/File;
    //   211: ldc_w 961
    //   214: invokespecial 311	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   217: astore 4
    //   219: aload 4
    //   221: invokevirtual 955	java/io/File:mkdir	()Z
    //   224: pop
    //   225: aload 4
    //   227: invokevirtual 303	java/io/File:isDirectory	()Z
    //   230: ifeq +52 -> 282
    //   233: aload_0
    //   234: aload_3
    //   235: aload 4
    //   237: iconst_2
    //   238: invokespecial 957	org/vidogram/messenger/p:a	(Ljava/io/File;Ljava/io/File;I)Z
    //   241: ifeq +41 -> 282
    //   244: aload_2
    //   245: iconst_2
    //   246: invokestatic 320	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   249: aload 4
    //   251: invokevirtual 324	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   254: pop
    //   255: ldc_w 331
    //   258: new 507	java/lang/StringBuilder
    //   261: dup
    //   262: invokespecial 508	java/lang/StringBuilder:<init>	()V
    //   265: ldc_w 963
    //   268: invokevirtual 517	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   271: aload 4
    //   273: invokevirtual 936	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   276: invokevirtual 525	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   279: invokestatic 938	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   282: new 299	java/io/File
    //   285: dup
    //   286: aload_0
    //   287: getfield 213	org/vidogram/messenger/p:B	Ljava/io/File;
    //   290: ldc_w 965
    //   293: invokespecial 311	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   296: astore 4
    //   298: aload 4
    //   300: invokevirtual 955	java/io/File:mkdir	()Z
    //   303: pop
    //   304: aload 4
    //   306: invokevirtual 303	java/io/File:isDirectory	()Z
    //   309: ifeq +68 -> 377
    //   312: aload_0
    //   313: aload_3
    //   314: aload 4
    //   316: iconst_1
    //   317: invokespecial 957	org/vidogram/messenger/p:a	(Ljava/io/File;Ljava/io/File;I)Z
    //   320: ifeq +57 -> 377
    //   323: new 299	java/io/File
    //   326: dup
    //   327: aload 4
    //   329: ldc_w 308
    //   332: invokespecial 311	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   335: invokevirtual 314	java/io/File:createNewFile	()Z
    //   338: pop
    //   339: aload_2
    //   340: iconst_1
    //   341: invokestatic 320	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   344: aload 4
    //   346: invokevirtual 324	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   349: pop
    //   350: ldc_w 331
    //   353: new 507	java/lang/StringBuilder
    //   356: dup
    //   357: invokespecial 508	java/lang/StringBuilder:<init>	()V
    //   360: ldc_w 967
    //   363: invokevirtual 517	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   366: aload 4
    //   368: invokevirtual 936	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   371: invokevirtual 525	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   374: invokestatic 938	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   377: new 299	java/io/File
    //   380: dup
    //   381: aload_0
    //   382: getfield 213	org/vidogram/messenger/p:B	Ljava/io/File;
    //   385: ldc_w 969
    //   388: invokespecial 311	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   391: astore 4
    //   393: aload 4
    //   395: invokevirtual 955	java/io/File:mkdir	()Z
    //   398: pop
    //   399: aload 4
    //   401: invokevirtual 303	java/io/File:isDirectory	()Z
    //   404: ifeq +68 -> 472
    //   407: aload_0
    //   408: aload_3
    //   409: aload 4
    //   411: iconst_3
    //   412: invokespecial 957	org/vidogram/messenger/p:a	(Ljava/io/File;Ljava/io/File;I)Z
    //   415: ifeq +57 -> 472
    //   418: new 299	java/io/File
    //   421: dup
    //   422: aload 4
    //   424: ldc_w 308
    //   427: invokespecial 311	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   430: invokevirtual 314	java/io/File:createNewFile	()Z
    //   433: pop
    //   434: aload_2
    //   435: iconst_3
    //   436: invokestatic 320	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   439: aload 4
    //   441: invokevirtual 324	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   444: pop
    //   445: ldc_w 331
    //   448: new 507	java/lang/StringBuilder
    //   451: dup
    //   452: invokespecial 508	java/lang/StringBuilder:<init>	()V
    //   455: ldc_w 971
    //   458: invokevirtual 517	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   461: aload 4
    //   463: invokevirtual 936	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   466: invokevirtual 525	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   469: invokestatic 938	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   472: invokestatic 976	org/vidogram/messenger/MediaController:a	()Lorg/vidogram/messenger/MediaController;
    //   475: invokevirtual 978	org/vidogram/messenger/MediaController:z	()V
    //   478: aload_2
    //   479: areturn
    //   480: astore 4
    //   482: ldc_w 331
    //   485: aload 4
    //   487: invokestatic 336	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   490: goto -466 -> 24
    //   493: astore 4
    //   495: ldc_w 331
    //   498: aload 4
    //   500: invokestatic 336	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   503: goto -464 -> 39
    //   506: astore 4
    //   508: ldc_w 331
    //   511: aload 4
    //   513: invokestatic 336	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   516: goto -313 -> 203
    //   519: astore_3
    //   520: ldc_w 331
    //   523: aload_3
    //   524: invokestatic 336	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   527: aload_2
    //   528: areturn
    //   529: astore 4
    //   531: ldc_w 331
    //   534: aload 4
    //   536: invokestatic 336	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   539: goto -257 -> 282
    //   542: astore 4
    //   544: ldc_w 331
    //   547: aload 4
    //   549: invokestatic 336	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   552: goto -175 -> 377
    //   555: astore_3
    //   556: ldc_w 331
    //   559: aload_3
    //   560: invokestatic 336	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   563: goto -91 -> 472
    //   566: ldc_w 331
    //   569: ldc_w 980
    //   572: invokestatic 938	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   575: goto -103 -> 472
    //
    // Exception table:
    //   from	to	target	type
    //   19	24	480	java/lang/Exception
    //   24	39	493	java/lang/Exception
    //   124	203	506	java/lang/Exception
    //   75	120	519	java/lang/Exception
    //   472	478	519	java/lang/Exception
    //   508	516	519	java/lang/Exception
    //   531	539	519	java/lang/Exception
    //   544	552	519	java/lang/Exception
    //   556	563	519	java/lang/Exception
    //   566	575	519	java/lang/Exception
    //   203	282	529	java/lang/Exception
    //   282	377	542	java/lang/Exception
    //   377	472	555	java/lang/Exception
  }

  public boolean c(String paramString)
  {
    Integer localInteger = (Integer)this.a.get(paramString);
    if (localInteger == null)
      return true;
    if (localInteger.intValue() == 1)
    {
      this.a.remove(paramString);
      return true;
    }
    this.a.put(paramString, Integer.valueOf(localInteger.intValue() - 1));
    return false;
  }

  public void d()
  {
    this.b.a();
  }

  public void d(String paramString)
  {
    this.a.remove(paramString);
    this.b.b(paramString);
  }

  public boolean e(String paramString)
  {
    return this.b.a(paramString) != null;
  }

  public boolean f(String paramString)
  {
    return this.u.containsKey(paramString);
  }

  public void g(String paramString)
  {
    c localc = (c)this.u.get(paramString);
    if (localc != null)
    {
      localc.cancel(true);
      this.u.remove(paramString);
      this.t.remove(localc);
    }
    paramString = (Runnable)this.v.get(paramString);
    if (paramString != null)
      a.b(paramString);
    a(null, 0);
  }

  private class a
  {
    protected String a;
    protected String b;
    protected String c;
    protected String d;
    protected f e;
    protected boolean f;
    protected File g;
    protected File h;
    protected boolean i;
    protected String j;
    protected p.d k;
    protected p.b l;
    protected ArrayList<q> m = new ArrayList();
    protected ArrayList<String> n = new ArrayList();
    protected ArrayList<String> o = new ArrayList();

    private a()
    {
    }

    public void a(BitmapDrawable paramBitmapDrawable)
    {
      if (paramBitmapDrawable != null)
        a.a(new Runnable(paramBitmapDrawable, new ArrayList(this.m))
        {
          public void run()
          {
            int i;
            if ((this.a instanceof AnimatedFileDrawable))
            {
              AnimatedFileDrawable localAnimatedFileDrawable2 = (AnimatedFileDrawable)this.a;
              i = 0;
              int j = 0;
              if (i < this.b.size())
              {
                q localq = (q)this.b.get(i);
                if (i == 0);
                for (AnimatedFileDrawable localAnimatedFileDrawable1 = localAnimatedFileDrawable2; ; localAnimatedFileDrawable1 = localAnimatedFileDrawable2.e())
                {
                  if (localq.a(localAnimatedFileDrawable1, p.a.this.a, p.a.this.i, false))
                    j = 1;
                  i += 1;
                  break;
                }
              }
              if (j == 0)
                ((AnimatedFileDrawable)this.a).a();
            }
            while (true)
            {
              return;
              i = 0;
              while (i < this.b.size())
              {
                ((q)this.b.get(i)).a(this.a, p.a.this.a, p.a.this.i, false);
                i += 1;
              }
            }
          }
        });
      int i1 = 0;
      while (i1 < this.m.size())
      {
        paramBitmapDrawable = (q)this.m.get(i1);
        p.f(p.this).remove(paramBitmapDrawable.h(this.i));
        i1 += 1;
      }
      this.m.clear();
      if (this.b != null)
        p.j(p.this).remove(this.b);
      if (this.a != null)
        p.k(p.this).remove(this.a);
    }

    public void a(q paramq)
    {
      int i3 = 0;
      int i2;
      for (int i1 = 0; i1 < this.m.size(); i1 = i2 + 1)
      {
        q localq = (q)this.m.get(i1);
        if (localq != null)
        {
          i2 = i1;
          if (localq != paramq)
            continue;
        }
        this.m.remove(i1);
        this.n.remove(i1);
        this.o.remove(i1);
        if (localq != null)
          p.f(p.this).remove(localq.h(this.i));
        i2 = i1 - 1;
      }
      if (this.m.size() == 0)
      {
        i1 = i3;
        while (i1 < this.m.size())
        {
          p.f(p.this).remove(((q)this.m.get(i1)).h(this.i));
          i1 += 1;
        }
        this.m.clear();
        if (this.e != null)
        {
          if (!(this.e instanceof g.x))
            break label327;
          m.a().a((g.x)this.e, this.d);
        }
        if (this.l != null)
        {
          if (!this.i)
            break label353;
          p.g(p.this).a(this.l);
        }
      }
      while (true)
      {
        this.l.a();
        this.l = null;
        if (this.k != null)
        {
          p.i(p.this).remove(this.k);
          this.k.cancel(true);
          this.k = null;
        }
        if (this.b != null)
          p.j(p.this).remove(this.b);
        if (this.a != null)
          p.k(p.this).remove(this.a);
        return;
        label327: if (!(this.e instanceof g.q))
          break;
        m.a().a((g.q)this.e);
        break;
        label353: p.h(p.this).a(this.l);
      }
    }

    public void a(q paramq, String paramString1, String paramString2)
    {
      if (this.m.contains(paramq))
        return;
      this.m.add(paramq);
      this.n.add(paramString1);
      this.o.add(paramString2);
      p.f(p.this).put(paramq.h(this.i), this);
    }
  }

  private class b
    implements Runnable
  {
    private Thread b;
    private final Object c = new Object();
    private p.a d;
    private boolean e;

    public b(p.a arg2)
    {
      Object localObject;
      this.d = localObject;
    }

    private void a(BitmapDrawable paramBitmapDrawable)
    {
      a.a(new Runnable(paramBitmapDrawable)
      {
        public void run()
        {
          BitmapDrawable localBitmapDrawable = null;
          if ((this.a instanceof AnimatedFileDrawable))
            localBitmapDrawable = this.a;
          while (true)
          {
            p.b(p.this).b(new Runnable(localBitmapDrawable)
            {
              public void run()
              {
                p.b.a(p.b.this).a(this.a);
              }
            });
            return;
            if (this.a == null)
              continue;
            localBitmapDrawable = p.d(p.this).a(p.b.a(p.b.this).a);
            if (localBitmapDrawable == null)
            {
              p.d(p.this).b(p.b.a(p.b.this).a, this.a);
              localBitmapDrawable = this.a;
              continue;
            }
            this.a.getBitmap().recycle();
          }
        }
      });
    }

    public void a()
    {
      try
      {
        synchronized (this.c)
        {
          this.e = true;
          if (this.b != null)
            this.b.interrupt();
          label26: return;
        }
      }
      catch (Exception localException)
      {
        break label26;
      }
    }

    // ERROR //
    public void run()
    {
      // Byte code:
      //   0: aload_0
      //   1: getfield 31	org/vidogram/messenger/p$b:c	Ljava/lang/Object;
      //   4: astore 12
      //   6: aload 12
      //   8: monitorenter
      //   9: aload_0
      //   10: invokestatic 62	java/lang/Thread:currentThread	()Ljava/lang/Thread;
      //   13: putfield 50	org/vidogram/messenger/p$b:b	Ljava/lang/Thread;
      //   16: invokestatic 66	java/lang/Thread:interrupted	()Z
      //   19: pop
      //   20: aload_0
      //   21: getfield 48	org/vidogram/messenger/p$b:e	Z
      //   24: ifeq +7 -> 31
      //   27: aload 12
      //   29: monitorexit
      //   30: return
      //   31: aload 12
      //   33: monitorexit
      //   34: aload_0
      //   35: getfield 33	org/vidogram/messenger/p$b:d	Lorg/vidogram/messenger/p$a;
      //   38: getfield 71	org/vidogram/messenger/p$a:f	Z
      //   41: ifeq +109 -> 150
      //   44: aload_0
      //   45: getfield 31	org/vidogram/messenger/p$b:c	Ljava/lang/Object;
      //   48: astore 12
      //   50: aload 12
      //   52: monitorenter
      //   53: aload_0
      //   54: getfield 48	org/vidogram/messenger/p$b:e	Z
      //   57: ifeq +23 -> 80
      //   60: aload 12
      //   62: monitorexit
      //   63: return
      //   64: astore 13
      //   66: aload 12
      //   68: monitorexit
      //   69: aload 13
      //   71: athrow
      //   72: astore 13
      //   74: aload 12
      //   76: monitorexit
      //   77: aload 13
      //   79: athrow
      //   80: aload 12
      //   82: monitorexit
      //   83: aload_0
      //   84: getfield 33	org/vidogram/messenger/p$b:d	Lorg/vidogram/messenger/p$a;
      //   87: getfield 75	org/vidogram/messenger/p$a:g	Ljava/io/File;
      //   90: astore 12
      //   92: aload_0
      //   93: getfield 33	org/vidogram/messenger/p$b:d	Lorg/vidogram/messenger/p$a;
      //   96: getfield 78	org/vidogram/messenger/p$a:c	Ljava/lang/String;
      //   99: ifnull +45 -> 144
      //   102: aload_0
      //   103: getfield 33	org/vidogram/messenger/p$b:d	Lorg/vidogram/messenger/p$a;
      //   106: getfield 78	org/vidogram/messenger/p$a:c	Ljava/lang/String;
      //   109: ldc 79
      //   111: invokevirtual 85	java/lang/String:equals	(Ljava/lang/Object;)Z
      //   114: ifeq +30 -> 144
      //   117: iconst_1
      //   118: istore 11
      //   120: new 87	org/vidogram/ui/Components/AnimatedFileDrawable
      //   123: dup
      //   124: aload 12
      //   126: iload 11
      //   128: invokespecial 90	org/vidogram/ui/Components/AnimatedFileDrawable:<init>	(Ljava/io/File;Z)V
      //   131: astore 12
      //   133: invokestatic 66	java/lang/Thread:interrupted	()Z
      //   136: pop
      //   137: aload_0
      //   138: aload 12
      //   140: invokespecial 92	org/vidogram/messenger/p$b:a	(Landroid/graphics/drawable/BitmapDrawable;)V
      //   143: return
      //   144: iconst_0
      //   145: istore 11
      //   147: goto -27 -> 120
      //   150: aconst_null
      //   151: astore 18
      //   153: aconst_null
      //   154: astore 15
      //   156: iconst_0
      //   157: istore 8
      //   159: aconst_null
      //   160: astore 17
      //   162: aconst_null
      //   163: astore 16
      //   165: aload_0
      //   166: getfield 33	org/vidogram/messenger/p$b:d	Lorg/vidogram/messenger/p$a;
      //   169: getfield 75	org/vidogram/messenger/p$a:g	Ljava/io/File;
      //   172: astore 19
      //   174: iconst_0
      //   175: istore 7
      //   177: iconst_0
      //   178: istore 6
      //   180: iconst_0
      //   181: istore 10
      //   183: iconst_0
      //   184: istore 9
      //   186: getstatic 98	android/os/Build$VERSION:SDK_INT	I
      //   189: bipush 19
      //   191: if_icmpge +169 -> 360
      //   194: new 100	java/io/RandomAccessFile
      //   197: dup
      //   198: aload 19
      //   200: ldc 102
      //   202: invokespecial 105	java/io/RandomAccessFile:<init>	(Ljava/io/File;Ljava/lang/String;)V
      //   205: astore 13
      //   207: aload 13
      //   209: astore 12
      //   211: iload 10
      //   213: istore 6
      //   215: aload_0
      //   216: getfield 33	org/vidogram/messenger/p$b:d	Lorg/vidogram/messenger/p$a;
      //   219: getfield 108	org/vidogram/messenger/p$a:i	Z
      //   222: ifeq +254 -> 476
      //   225: aload 13
      //   227: astore 12
      //   229: iload 10
      //   231: istore 6
      //   233: invokestatic 111	org/vidogram/messenger/p:e	()[B
      //   236: astore 14
      //   238: aload 13
      //   240: astore 12
      //   242: iload 10
      //   244: istore 6
      //   246: aload 13
      //   248: aload 14
      //   250: iconst_0
      //   251: aload 14
      //   253: arraylength
      //   254: invokevirtual 115	java/io/RandomAccessFile:readFully	([BII)V
      //   257: aload 13
      //   259: astore 12
      //   261: iload 10
      //   263: istore 6
      //   265: new 81	java/lang/String
      //   268: dup
      //   269: aload 14
      //   271: invokespecial 118	java/lang/String:<init>	([B)V
      //   274: invokevirtual 122	java/lang/String:toLowerCase	()Ljava/lang/String;
      //   277: invokevirtual 122	java/lang/String:toLowerCase	()Ljava/lang/String;
      //   280: astore 14
      //   282: iload 9
      //   284: istore 5
      //   286: aload 13
      //   288: astore 12
      //   290: iload 10
      //   292: istore 6
      //   294: aload 14
      //   296: ldc 124
      //   298: invokevirtual 128	java/lang/String:startsWith	(Ljava/lang/String;)Z
      //   301: ifeq +28 -> 329
      //   304: iload 9
      //   306: istore 5
      //   308: aload 13
      //   310: astore 12
      //   312: iload 10
      //   314: istore 6
      //   316: aload 14
      //   318: ldc 130
      //   320: invokevirtual 133	java/lang/String:endsWith	(Ljava/lang/String;)Z
      //   323: ifeq +6 -> 329
      //   326: iconst_1
      //   327: istore 5
      //   329: aload 13
      //   331: astore 12
      //   333: iload 5
      //   335: istore 6
      //   337: aload 13
      //   339: invokevirtual 136	java/io/RandomAccessFile:close	()V
      //   342: iload 5
      //   344: istore 7
      //   346: aload 13
      //   348: ifnull +12 -> 360
      //   351: aload 13
      //   353: invokevirtual 136	java/io/RandomAccessFile:close	()V
      //   356: iload 5
      //   358: istore 7
      //   360: aload_0
      //   361: getfield 33	org/vidogram/messenger/p$b:d	Lorg/vidogram/messenger/p$a;
      //   364: getfield 108	org/vidogram/messenger/p$a:i	Z
      //   367: ifeq +915 -> 1282
      //   370: aload_0
      //   371: getfield 33	org/vidogram/messenger/p$b:d	Lorg/vidogram/messenger/p$a;
      //   374: getfield 78	org/vidogram/messenger/p$a:c	Ljava/lang/String;
      //   377: ifnull +2478 -> 2855
      //   380: aload_0
      //   381: getfield 33	org/vidogram/messenger/p$b:d	Lorg/vidogram/messenger/p$a;
      //   384: getfield 78	org/vidogram/messenger/p$a:c	Ljava/lang/String;
      //   387: ldc 138
      //   389: invokevirtual 142	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
      //   392: ifeq +199 -> 591
      //   395: iconst_3
      //   396: istore 5
      //   398: aload_0
      //   399: getfield 26	org/vidogram/messenger/p$b:a	Lorg/vidogram/messenger/p;
      //   402: invokestatic 148	java/lang/System:currentTimeMillis	()J
      //   405: invokestatic 151	org/vidogram/messenger/p:a	(Lorg/vidogram/messenger/p;J)J
      //   408: pop2
      //   409: aload_0
      //   410: getfield 31	org/vidogram/messenger/p$b:c	Ljava/lang/Object;
      //   413: astore 12
      //   415: aload 12
      //   417: monitorenter
      //   418: aload_0
      //   419: getfield 48	org/vidogram/messenger/p$b:e	Z
      //   422: ifeq +211 -> 633
      //   425: aload 12
      //   427: monitorexit
      //   428: return
      //   429: astore 13
      //   431: aload 12
      //   433: monitorexit
      //   434: aload 13
      //   436: athrow
      //   437: astore 13
      //   439: aconst_null
      //   440: astore 12
      //   442: ldc 153
      //   444: aload 13
      //   446: invokestatic 158	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
      //   449: invokestatic 66	java/lang/Thread:interrupted	()Z
      //   452: pop
      //   453: aload 12
      //   455: ifnull +2367 -> 2822
      //   458: new 160	android/graphics/drawable/BitmapDrawable
      //   461: dup
      //   462: aload 12
      //   464: invokespecial 163	android/graphics/drawable/BitmapDrawable:<init>	(Landroid/graphics/Bitmap;)V
      //   467: astore 12
      //   469: aload_0
      //   470: aload 12
      //   472: invokespecial 92	org/vidogram/messenger/p$b:a	(Landroid/graphics/drawable/BitmapDrawable;)V
      //   475: return
      //   476: aload 13
      //   478: astore 12
      //   480: iload 10
      //   482: istore 6
      //   484: invokestatic 165	org/vidogram/messenger/p:f	()[B
      //   487: astore 14
      //   489: goto -251 -> 238
      //   492: astore 12
      //   494: ldc 153
      //   496: aload 12
      //   498: invokestatic 158	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
      //   501: iload 5
      //   503: istore 7
      //   505: goto -145 -> 360
      //   508: astore 14
      //   510: aconst_null
      //   511: astore 13
      //   513: aload 13
      //   515: astore 12
      //   517: ldc 153
      //   519: aload 14
      //   521: invokestatic 158	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
      //   524: iload 6
      //   526: istore 7
      //   528: aload 13
      //   530: ifnull -170 -> 360
      //   533: aload 13
      //   535: invokevirtual 136	java/io/RandomAccessFile:close	()V
      //   538: iload 6
      //   540: istore 7
      //   542: goto -182 -> 360
      //   545: astore 12
      //   547: ldc 153
      //   549: aload 12
      //   551: invokestatic 158	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
      //   554: iload 6
      //   556: istore 7
      //   558: goto -198 -> 360
      //   561: astore 13
      //   563: aconst_null
      //   564: astore 12
      //   566: aload 12
      //   568: ifnull +8 -> 576
      //   571: aload 12
      //   573: invokevirtual 136	java/io/RandomAccessFile:close	()V
      //   576: aload 13
      //   578: athrow
      //   579: astore 12
      //   581: ldc 153
      //   583: aload 12
      //   585: invokestatic 158	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
      //   588: goto -12 -> 576
      //   591: aload_0
      //   592: getfield 33	org/vidogram/messenger/p$b:d	Lorg/vidogram/messenger/p$a;
      //   595: getfield 78	org/vidogram/messenger/p$a:c	Ljava/lang/String;
      //   598: ldc 167
      //   600: invokevirtual 142	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
      //   603: ifeq +9 -> 612
      //   606: iconst_2
      //   607: istore 5
      //   609: goto -211 -> 398
      //   612: aload_0
      //   613: getfield 33	org/vidogram/messenger/p$b:d	Lorg/vidogram/messenger/p$a;
      //   616: getfield 78	org/vidogram/messenger/p$a:c	Ljava/lang/String;
      //   619: ldc 168
      //   621: invokevirtual 142	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
      //   624: ifeq +2231 -> 2855
      //   627: iconst_1
      //   628: istore 5
      //   630: goto -232 -> 398
      //   633: aload 12
      //   635: monitorexit
      //   636: new 170	android/graphics/BitmapFactory$Options
      //   639: dup
      //   640: invokespecial 171	android/graphics/BitmapFactory$Options:<init>	()V
      //   643: astore 14
      //   645: aload 14
      //   647: iconst_1
      //   648: putfield 174	android/graphics/BitmapFactory$Options:inSampleSize	I
      //   651: getstatic 98	android/os/Build$VERSION:SDK_INT	I
      //   654: bipush 21
      //   656: if_icmpge +9 -> 665
      //   659: aload 14
      //   661: iconst_1
      //   662: putfield 177	android/graphics/BitmapFactory$Options:inPurgeable	Z
      //   665: iload 7
      //   667: ifeq +196 -> 863
      //   670: new 100	java/io/RandomAccessFile
      //   673: dup
      //   674: aload 19
      //   676: ldc 102
      //   678: invokespecial 105	java/io/RandomAccessFile:<init>	(Ljava/io/File;Ljava/lang/String;)V
      //   681: astore 15
      //   683: aload 15
      //   685: invokevirtual 181	java/io/RandomAccessFile:getChannel	()Ljava/nio/channels/FileChannel;
      //   688: getstatic 187	java/nio/channels/FileChannel$MapMode:READ_ONLY	Ljava/nio/channels/FileChannel$MapMode;
      //   691: lconst_0
      //   692: aload 19
      //   694: invokevirtual 192	java/io/File:length	()J
      //   697: invokevirtual 198	java/nio/channels/FileChannel:map	(Ljava/nio/channels/FileChannel$MapMode;JJ)Ljava/nio/MappedByteBuffer;
      //   700: astore 16
      //   702: new 170	android/graphics/BitmapFactory$Options
      //   705: dup
      //   706: invokespecial 171	android/graphics/BitmapFactory$Options:<init>	()V
      //   709: astore 12
      //   711: aload 12
      //   713: iconst_1
      //   714: putfield 201	android/graphics/BitmapFactory$Options:inJustDecodeBounds	Z
      //   717: aconst_null
      //   718: aload 16
      //   720: aload 16
      //   722: invokevirtual 207	java/nio/ByteBuffer:limit	()I
      //   725: aload 12
      //   727: iconst_1
      //   728: invokestatic 213	org/vidogram/messenger/Utilities:loadWebpImage	(Landroid/graphics/Bitmap;Ljava/nio/ByteBuffer;ILandroid/graphics/BitmapFactory$Options;Z)Z
      //   731: pop
      //   732: aload 12
      //   734: getfield 216	android/graphics/BitmapFactory$Options:outWidth	I
      //   737: aload 12
      //   739: getfield 219	android/graphics/BitmapFactory$Options:outHeight	I
      //   742: getstatic 225	android/graphics/Bitmap$Config:ARGB_8888	Landroid/graphics/Bitmap$Config;
      //   745: invokestatic 230	org/vidogram/messenger/c:a	(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
      //   748: astore 13
      //   750: aload 13
      //   752: astore 12
      //   754: aload 16
      //   756: invokevirtual 207	java/nio/ByteBuffer:limit	()I
      //   759: istore 6
      //   761: aload 13
      //   763: astore 12
      //   765: aload 14
      //   767: getfield 177	android/graphics/BitmapFactory$Options:inPurgeable	Z
      //   770: ifne +87 -> 857
      //   773: iconst_1
      //   774: istore 11
      //   776: aload 13
      //   778: astore 12
      //   780: aload 13
      //   782: aload 16
      //   784: iload 6
      //   786: aconst_null
      //   787: iload 11
      //   789: invokestatic 213	org/vidogram/messenger/Utilities:loadWebpImage	(Landroid/graphics/Bitmap;Ljava/nio/ByteBuffer;ILandroid/graphics/BitmapFactory$Options;Z)Z
      //   792: pop
      //   793: aload 13
      //   795: astore 12
      //   797: aload 15
      //   799: invokevirtual 136	java/io/RandomAccessFile:close	()V
      //   802: aload 13
      //   804: ifnonnull +187 -> 991
      //   807: aload 19
      //   809: invokevirtual 192	java/io/File:length	()J
      //   812: lconst_0
      //   813: lcmp
      //   814: ifeq +17 -> 831
      //   817: aload 13
      //   819: astore 12
      //   821: aload_0
      //   822: getfield 33	org/vidogram/messenger/p$b:d	Lorg/vidogram/messenger/p$a;
      //   825: getfield 78	org/vidogram/messenger/p$a:c	Ljava/lang/String;
      //   828: ifnonnull -379 -> 449
      //   831: aload 19
      //   833: invokevirtual 233	java/io/File:delete	()Z
      //   836: pop
      //   837: aload 13
      //   839: astore 12
      //   841: goto -392 -> 449
      //   844: astore 14
      //   846: aload 13
      //   848: astore 12
      //   850: aload 14
      //   852: astore 13
      //   854: goto -412 -> 442
      //   857: iconst_0
      //   858: istore 11
      //   860: goto -84 -> 776
      //   863: aload 14
      //   865: getfield 177	android/graphics/BitmapFactory$Options:inPurgeable	Z
      //   868: ifeq +90 -> 958
      //   871: new 100	java/io/RandomAccessFile
      //   874: dup
      //   875: aload 19
      //   877: ldc 102
      //   879: invokespecial 105	java/io/RandomAccessFile:<init>	(Ljava/io/File;Ljava/lang/String;)V
      //   882: astore 15
      //   884: aload 15
      //   886: invokevirtual 234	java/io/RandomAccessFile:length	()J
      //   889: l2i
      //   890: istore 6
      //   892: invokestatic 236	org/vidogram/messenger/p:g	()[B
      //   895: ifnull +1966 -> 2861
      //   898: invokestatic 236	org/vidogram/messenger/p:g	()[B
      //   901: arraylength
      //   902: iload 6
      //   904: if_icmplt +1957 -> 2861
      //   907: invokestatic 236	org/vidogram/messenger/p:g	()[B
      //   910: astore 12
      //   912: aload 12
      //   914: astore 13
      //   916: aload 12
      //   918: ifnonnull +15 -> 933
      //   921: iload 6
      //   923: newarray byte
      //   925: astore 13
      //   927: aload 13
      //   929: invokestatic 239	org/vidogram/messenger/p:a	([B)[B
      //   932: pop
      //   933: aload 15
      //   935: aload 13
      //   937: iconst_0
      //   938: iload 6
      //   940: invokevirtual 115	java/io/RandomAccessFile:readFully	([BII)V
      //   943: aload 13
      //   945: iconst_0
      //   946: iload 6
      //   948: aload 14
      //   950: invokestatic 245	android/graphics/BitmapFactory:decodeByteArray	([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
      //   953: astore 13
      //   955: goto -153 -> 802
      //   958: new 247	java/io/FileInputStream
      //   961: dup
      //   962: aload 19
      //   964: invokespecial 250	java/io/FileInputStream:<init>	(Ljava/io/File;)V
      //   967: astore 15
      //   969: aload 15
      //   971: aconst_null
      //   972: aload 14
      //   974: invokestatic 254	android/graphics/BitmapFactory:decodeStream	(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
      //   977: astore 13
      //   979: aload 13
      //   981: astore 12
      //   983: aload 15
      //   985: invokevirtual 255	java/io/FileInputStream:close	()V
      //   988: goto -186 -> 802
      //   991: iload 5
      //   993: iconst_1
      //   994: if_icmpne +59 -> 1053
      //   997: aload 13
      //   999: astore 12
      //   1001: aload 13
      //   1003: invokevirtual 261	android/graphics/Bitmap:getConfig	()Landroid/graphics/Bitmap$Config;
      //   1006: getstatic 225	android/graphics/Bitmap$Config:ARGB_8888	Landroid/graphics/Bitmap$Config;
      //   1009: if_acmpne -560 -> 449
      //   1012: aload 14
      //   1014: getfield 177	android/graphics/BitmapFactory$Options:inPurgeable	Z
      //   1017: ifeq +1850 -> 2867
      //   1020: iconst_0
      //   1021: istore 5
      //   1023: aload 13
      //   1025: iconst_3
      //   1026: iload 5
      //   1028: aload 13
      //   1030: invokevirtual 264	android/graphics/Bitmap:getWidth	()I
      //   1033: aload 13
      //   1035: invokevirtual 267	android/graphics/Bitmap:getHeight	()I
      //   1038: aload 13
      //   1040: invokevirtual 270	android/graphics/Bitmap:getRowBytes	()I
      //   1043: invokestatic 274	org/vidogram/messenger/Utilities:blurBitmap	(Ljava/lang/Object;IIIII)V
      //   1046: aload 13
      //   1048: astore 12
      //   1050: goto -601 -> 449
      //   1053: iload 5
      //   1055: iconst_2
      //   1056: if_icmpne +59 -> 1115
      //   1059: aload 13
      //   1061: astore 12
      //   1063: aload 13
      //   1065: invokevirtual 261	android/graphics/Bitmap:getConfig	()Landroid/graphics/Bitmap$Config;
      //   1068: getstatic 225	android/graphics/Bitmap$Config:ARGB_8888	Landroid/graphics/Bitmap$Config;
      //   1071: if_acmpne -622 -> 449
      //   1074: aload 14
      //   1076: getfield 177	android/graphics/BitmapFactory$Options:inPurgeable	Z
      //   1079: ifeq +1794 -> 2873
      //   1082: iconst_0
      //   1083: istore 5
      //   1085: aload 13
      //   1087: iconst_1
      //   1088: iload 5
      //   1090: aload 13
      //   1092: invokevirtual 264	android/graphics/Bitmap:getWidth	()I
      //   1095: aload 13
      //   1097: invokevirtual 267	android/graphics/Bitmap:getHeight	()I
      //   1100: aload 13
      //   1102: invokevirtual 270	android/graphics/Bitmap:getRowBytes	()I
      //   1105: invokestatic 274	org/vidogram/messenger/Utilities:blurBitmap	(Ljava/lang/Object;IIIII)V
      //   1108: aload 13
      //   1110: astore 12
      //   1112: goto -663 -> 449
      //   1115: iload 5
      //   1117: iconst_3
      //   1118: if_icmpne +130 -> 1248
      //   1121: aload 13
      //   1123: astore 12
      //   1125: aload 13
      //   1127: invokevirtual 261	android/graphics/Bitmap:getConfig	()Landroid/graphics/Bitmap$Config;
      //   1130: getstatic 225	android/graphics/Bitmap$Config:ARGB_8888	Landroid/graphics/Bitmap$Config;
      //   1133: if_acmpne -684 -> 449
      //   1136: aload 14
      //   1138: getfield 177	android/graphics/BitmapFactory$Options:inPurgeable	Z
      //   1141: ifeq +1738 -> 2879
      //   1144: iconst_0
      //   1145: istore 5
      //   1147: aload 13
      //   1149: bipush 7
      //   1151: iload 5
      //   1153: aload 13
      //   1155: invokevirtual 264	android/graphics/Bitmap:getWidth	()I
      //   1158: aload 13
      //   1160: invokevirtual 267	android/graphics/Bitmap:getHeight	()I
      //   1163: aload 13
      //   1165: invokevirtual 270	android/graphics/Bitmap:getRowBytes	()I
      //   1168: invokestatic 274	org/vidogram/messenger/Utilities:blurBitmap	(Ljava/lang/Object;IIIII)V
      //   1171: aload 14
      //   1173: getfield 177	android/graphics/BitmapFactory$Options:inPurgeable	Z
      //   1176: ifeq +1709 -> 2885
      //   1179: iconst_0
      //   1180: istore 5
      //   1182: aload 13
      //   1184: bipush 7
      //   1186: iload 5
      //   1188: aload 13
      //   1190: invokevirtual 264	android/graphics/Bitmap:getWidth	()I
      //   1193: aload 13
      //   1195: invokevirtual 267	android/graphics/Bitmap:getHeight	()I
      //   1198: aload 13
      //   1200: invokevirtual 270	android/graphics/Bitmap:getRowBytes	()I
      //   1203: invokestatic 274	org/vidogram/messenger/Utilities:blurBitmap	(Ljava/lang/Object;IIIII)V
      //   1206: aload 14
      //   1208: getfield 177	android/graphics/BitmapFactory$Options:inPurgeable	Z
      //   1211: ifeq +1680 -> 2891
      //   1214: iconst_0
      //   1215: istore 5
      //   1217: aload 13
      //   1219: bipush 7
      //   1221: iload 5
      //   1223: aload 13
      //   1225: invokevirtual 264	android/graphics/Bitmap:getWidth	()I
      //   1228: aload 13
      //   1230: invokevirtual 267	android/graphics/Bitmap:getHeight	()I
      //   1233: aload 13
      //   1235: invokevirtual 270	android/graphics/Bitmap:getRowBytes	()I
      //   1238: invokestatic 274	org/vidogram/messenger/Utilities:blurBitmap	(Ljava/lang/Object;IIIII)V
      //   1241: aload 13
      //   1243: astore 12
      //   1245: goto -796 -> 449
      //   1248: aload 13
      //   1250: astore 12
      //   1252: iload 5
      //   1254: ifne -805 -> 449
      //   1257: aload 13
      //   1259: astore 12
      //   1261: aload 14
      //   1263: getfield 177	android/graphics/BitmapFactory$Options:inPurgeable	Z
      //   1266: ifeq -817 -> 449
      //   1269: aload 13
      //   1271: invokestatic 278	org/vidogram/messenger/Utilities:pinBitmap	(Landroid/graphics/Bitmap;)I
      //   1274: pop
      //   1275: aload 13
      //   1277: astore 12
      //   1279: goto -830 -> 449
      //   1282: aload_0
      //   1283: getfield 33	org/vidogram/messenger/p$b:d	Lorg/vidogram/messenger/p$a;
      //   1286: getfield 281	org/vidogram/messenger/p$a:j	Ljava/lang/String;
      //   1289: ifnull +1554 -> 2843
      //   1292: aload_0
      //   1293: getfield 33	org/vidogram/messenger/p$b:d	Lorg/vidogram/messenger/p$a;
      //   1296: getfield 281	org/vidogram/messenger/p$a:j	Ljava/lang/String;
      //   1299: ldc_w 283
      //   1302: invokevirtual 128	java/lang/String:startsWith	(Ljava/lang/String;)Z
      //   1305: ifeq +142 -> 1447
      //   1308: aload_0
      //   1309: getfield 33	org/vidogram/messenger/p$b:d	Lorg/vidogram/messenger/p$a;
      //   1312: getfield 281	org/vidogram/messenger/p$a:j	Ljava/lang/String;
      //   1315: ldc_w 285
      //   1318: bipush 8
      //   1320: invokevirtual 289	java/lang/String:indexOf	(Ljava/lang/String;I)I
      //   1323: istore 5
      //   1325: aload 15
      //   1327: astore 12
      //   1329: iload 5
      //   1331: iflt +1566 -> 2897
      //   1334: aload_0
      //   1335: getfield 33	org/vidogram/messenger/p$b:d	Lorg/vidogram/messenger/p$a;
      //   1338: getfield 281	org/vidogram/messenger/p$a:j	Ljava/lang/String;
      //   1341: bipush 8
      //   1343: iload 5
      //   1345: invokevirtual 293	java/lang/String:substring	(II)Ljava/lang/String;
      //   1348: invokestatic 299	java/lang/Long:parseLong	(Ljava/lang/String;)J
      //   1351: invokestatic 303	java/lang/Long:valueOf	(J)Ljava/lang/Long;
      //   1354: astore 12
      //   1356: goto +1541 -> 2897
      //   1359: iload 8
      //   1361: ifeq +47 -> 1408
      //   1364: aload_0
      //   1365: getfield 26	org/vidogram/messenger/p$b:a	Lorg/vidogram/messenger/p;
      //   1368: invokestatic 306	org/vidogram/messenger/p:e	(Lorg/vidogram/messenger/p;)J
      //   1371: lconst_0
      //   1372: lcmp
      //   1373: ifeq +35 -> 1408
      //   1376: aload_0
      //   1377: getfield 26	org/vidogram/messenger/p$b:a	Lorg/vidogram/messenger/p;
      //   1380: invokestatic 306	org/vidogram/messenger/p:e	(Lorg/vidogram/messenger/p;)J
      //   1383: invokestatic 148	java/lang/System:currentTimeMillis	()J
      //   1386: iload 8
      //   1388: i2l
      //   1389: lsub
      //   1390: lcmp
      //   1391: ifle +17 -> 1408
      //   1394: getstatic 98	android/os/Build$VERSION:SDK_INT	I
      //   1397: bipush 21
      //   1399: if_icmpge +9 -> 1408
      //   1402: iload 8
      //   1404: i2l
      //   1405: invokestatic 310	java/lang/Thread:sleep	(J)V
      //   1408: aload_0
      //   1409: getfield 26	org/vidogram/messenger/p$b:a	Lorg/vidogram/messenger/p;
      //   1412: invokestatic 148	java/lang/System:currentTimeMillis	()J
      //   1415: invokestatic 151	org/vidogram/messenger/p:a	(Lorg/vidogram/messenger/p;J)J
      //   1418: pop2
      //   1419: aload_0
      //   1420: getfield 31	org/vidogram/messenger/p$b:c	Ljava/lang/Object;
      //   1423: astore 12
      //   1425: aload 12
      //   1427: monitorenter
      //   1428: aload_0
      //   1429: getfield 48	org/vidogram/messenger/p$b:e	Z
      //   1432: ifeq +121 -> 1553
      //   1435: aload 12
      //   1437: monitorexit
      //   1438: return
      //   1439: astore 13
      //   1441: aload 12
      //   1443: monitorexit
      //   1444: aload 13
      //   1446: athrow
      //   1447: aload_0
      //   1448: getfield 33	org/vidogram/messenger/p$b:d	Lorg/vidogram/messenger/p$a;
      //   1451: getfield 281	org/vidogram/messenger/p$a:j	Ljava/lang/String;
      //   1454: ldc_w 312
      //   1457: invokevirtual 128	java/lang/String:startsWith	(Ljava/lang/String;)Z
      //   1460: ifeq +61 -> 1521
      //   1463: aload_0
      //   1464: getfield 33	org/vidogram/messenger/p$b:d	Lorg/vidogram/messenger/p$a;
      //   1467: getfield 281	org/vidogram/messenger/p$a:j	Ljava/lang/String;
      //   1470: ldc_w 285
      //   1473: bipush 9
      //   1475: invokevirtual 289	java/lang/String:indexOf	(Ljava/lang/String;I)I
      //   1478: istore 6
      //   1480: iload 8
      //   1482: istore 5
      //   1484: aload 18
      //   1486: astore 12
      //   1488: iload 6
      //   1490: iflt +1440 -> 2930
      //   1493: aload_0
      //   1494: getfield 33	org/vidogram/messenger/p$b:d	Lorg/vidogram/messenger/p$a;
      //   1497: getfield 281	org/vidogram/messenger/p$a:j	Ljava/lang/String;
      //   1500: bipush 9
      //   1502: iload 6
      //   1504: invokevirtual 293	java/lang/String:substring	(II)Ljava/lang/String;
      //   1507: invokestatic 299	java/lang/Long:parseLong	(Ljava/lang/String;)J
      //   1510: invokestatic 303	java/lang/Long:valueOf	(J)Ljava/lang/Long;
      //   1513: astore 12
      //   1515: iconst_1
      //   1516: istore 5
      //   1518: goto +1412 -> 2930
      //   1521: aload_0
      //   1522: getfield 33	org/vidogram/messenger/p$b:d	Lorg/vidogram/messenger/p$a;
      //   1525: getfield 281	org/vidogram/messenger/p$a:j	Ljava/lang/String;
      //   1528: ldc_w 314
      //   1531: invokevirtual 128	java/lang/String:startsWith	(Ljava/lang/String;)Z
      //   1534: istore 11
      //   1536: iload 11
      //   1538: ifne +1305 -> 2843
      //   1541: iconst_0
      //   1542: istore 6
      //   1544: iconst_0
      //   1545: istore 5
      //   1547: aconst_null
      //   1548: astore 14
      //   1550: goto +1357 -> 2907
      //   1553: aload 12
      //   1555: monitorexit
      //   1556: new 170	android/graphics/BitmapFactory$Options
      //   1559: dup
      //   1560: invokespecial 171	android/graphics/BitmapFactory$Options:<init>	()V
      //   1563: astore 18
      //   1565: aload 18
      //   1567: iconst_1
      //   1568: putfield 174	android/graphics/BitmapFactory$Options:inSampleSize	I
      //   1571: fconst_0
      //   1572: fstore_2
      //   1573: fconst_0
      //   1574: fstore_1
      //   1575: fconst_0
      //   1576: fstore_3
      //   1577: iconst_0
      //   1578: istore 9
      //   1580: iconst_0
      //   1581: istore 8
      //   1583: aload 17
      //   1585: astore 15
      //   1587: aload_0
      //   1588: getfield 33	org/vidogram/messenger/p$b:d	Lorg/vidogram/messenger/p$a;
      //   1591: getfield 78	org/vidogram/messenger/p$a:c	Ljava/lang/String;
      //   1594: ifnull +222 -> 1816
      //   1597: aload_0
      //   1598: getfield 33	org/vidogram/messenger/p$b:d	Lorg/vidogram/messenger/p$a;
      //   1601: getfield 78	org/vidogram/messenger/p$a:c	Ljava/lang/String;
      //   1604: ldc_w 316
      //   1607: invokevirtual 320	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
      //   1610: astore 12
      //   1612: aload 12
      //   1614: arraylength
      //   1615: iconst_2
      //   1616: if_icmplt +37 -> 1653
      //   1619: aload 12
      //   1621: iconst_0
      //   1622: aaload
      //   1623: invokestatic 326	java/lang/Float:parseFloat	(Ljava/lang/String;)F
      //   1626: fstore_1
      //   1627: getstatic 329	org/vidogram/messenger/a:b	F
      //   1630: fstore 4
      //   1632: aload 12
      //   1634: iconst_1
      //   1635: aaload
      //   1636: invokestatic 326	java/lang/Float:parseFloat	(Ljava/lang/String;)F
      //   1639: fstore_2
      //   1640: getstatic 329	org/vidogram/messenger/a:b	F
      //   1643: fstore_3
      //   1644: fload 4
      //   1646: fload_1
      //   1647: fmul
      //   1648: fstore_1
      //   1649: fload_2
      //   1650: fload_3
      //   1651: fmul
      //   1652: fstore_3
      //   1653: aload_0
      //   1654: getfield 33	org/vidogram/messenger/p$b:d	Lorg/vidogram/messenger/p$a;
      //   1657: getfield 78	org/vidogram/messenger/p$a:c	Ljava/lang/String;
      //   1660: ldc 168
      //   1662: invokevirtual 142	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
      //   1665: ifeq +6 -> 1671
      //   1668: iconst_1
      //   1669: istore 8
      //   1671: iload 8
      //   1673: istore 9
      //   1675: fload_1
      //   1676: fstore_2
      //   1677: aload 17
      //   1679: astore 15
      //   1681: fload_1
      //   1682: fconst_0
      //   1683: fcmpl
      //   1684: ifeq +132 -> 1816
      //   1687: iload 8
      //   1689: istore 9
      //   1691: fload_1
      //   1692: fstore_2
      //   1693: aload 17
      //   1695: astore 15
      //   1697: fload_3
      //   1698: fconst_0
      //   1699: fcmpl
      //   1700: ifeq +116 -> 1816
      //   1703: aload 18
      //   1705: iconst_1
      //   1706: putfield 201	android/graphics/BitmapFactory$Options:inJustDecodeBounds	Z
      //   1709: aload 14
      //   1711: ifnull +175 -> 1886
      //   1714: iload 5
      //   1716: ifeq +145 -> 1861
      //   1719: getstatic 334	org/vidogram/messenger/ApplicationLoader:a	Landroid/content/Context;
      //   1722: invokevirtual 340	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
      //   1725: aload 14
      //   1727: invokevirtual 343	java/lang/Long:longValue	()J
      //   1730: iconst_1
      //   1731: aload 18
      //   1733: invokestatic 349	android/provider/MediaStore$Video$Thumbnails:getThumbnail	(Landroid/content/ContentResolver;JILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
      //   1736: pop
      //   1737: aload 16
      //   1739: astore 15
      //   1741: aload 15
      //   1743: astore 12
      //   1745: aload 18
      //   1747: getfield 216	android/graphics/BitmapFactory$Options:outWidth	I
      //   1750: i2f
      //   1751: fstore_2
      //   1752: aload 15
      //   1754: astore 12
      //   1756: aload 18
      //   1758: getfield 219	android/graphics/BitmapFactory$Options:outHeight	I
      //   1761: i2f
      //   1762: fstore 4
      //   1764: aload 15
      //   1766: astore 12
      //   1768: fload_2
      //   1769: fload_1
      //   1770: fdiv
      //   1771: fload 4
      //   1773: fload_3
      //   1774: fdiv
      //   1775: invokestatic 355	java/lang/Math:max	(FF)F
      //   1778: fstore_3
      //   1779: fload_3
      //   1780: fstore_2
      //   1781: fload_3
      //   1782: fconst_1
      //   1783: fcmpg
      //   1784: ifge +5 -> 1789
      //   1787: fconst_1
      //   1788: fstore_2
      //   1789: aload 15
      //   1791: astore 12
      //   1793: aload 18
      //   1795: iconst_0
      //   1796: putfield 201	android/graphics/BitmapFactory$Options:inJustDecodeBounds	Z
      //   1799: aload 15
      //   1801: astore 12
      //   1803: aload 18
      //   1805: fload_2
      //   1806: f2i
      //   1807: putfield 174	android/graphics/BitmapFactory$Options:inSampleSize	I
      //   1810: fload_1
      //   1811: fstore_2
      //   1812: iload 8
      //   1814: istore 9
      //   1816: aload 15
      //   1818: astore 12
      //   1820: aload_0
      //   1821: getfield 31	org/vidogram/messenger/p$b:c	Ljava/lang/Object;
      //   1824: astore 13
      //   1826: aload 15
      //   1828: astore 12
      //   1830: aload 13
      //   1832: monitorenter
      //   1833: aload_0
      //   1834: getfield 48	org/vidogram/messenger/p$b:e	Z
      //   1837: ifeq +82 -> 1919
      //   1840: aload 13
      //   1842: monitorexit
      //   1843: return
      //   1844: astore 14
      //   1846: aload 13
      //   1848: monitorexit
      //   1849: aload 15
      //   1851: astore 12
      //   1853: aload 14
      //   1855: athrow
      //   1856: astore 13
      //   1858: goto -1409 -> 449
      //   1861: getstatic 334	org/vidogram/messenger/ApplicationLoader:a	Landroid/content/Context;
      //   1864: invokevirtual 340	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
      //   1867: aload 14
      //   1869: invokevirtual 343	java/lang/Long:longValue	()J
      //   1872: iconst_1
      //   1873: aload 18
      //   1875: invokestatic 358	android/provider/MediaStore$Images$Thumbnails:getThumbnail	(Landroid/content/ContentResolver;JILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
      //   1878: pop
      //   1879: aload 16
      //   1881: astore 15
      //   1883: goto -142 -> 1741
      //   1886: new 247	java/io/FileInputStream
      //   1889: dup
      //   1890: aload 19
      //   1892: invokespecial 250	java/io/FileInputStream:<init>	(Ljava/io/File;)V
      //   1895: astore 13
      //   1897: aload 13
      //   1899: aconst_null
      //   1900: aload 18
      //   1902: invokestatic 254	android/graphics/BitmapFactory:decodeStream	(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
      //   1905: astore 15
      //   1907: aload 15
      //   1909: astore 12
      //   1911: aload 13
      //   1913: invokevirtual 255	java/io/FileInputStream:close	()V
      //   1916: goto -175 -> 1741
      //   1919: aload 13
      //   1921: monitorexit
      //   1922: aload 15
      //   1924: astore 12
      //   1926: aload_0
      //   1927: getfield 33	org/vidogram/messenger/p$b:d	Lorg/vidogram/messenger/p$a;
      //   1930: getfield 78	org/vidogram/messenger/p$a:c	Ljava/lang/String;
      //   1933: ifnull +22 -> 1955
      //   1936: iload 9
      //   1938: ifne +17 -> 1955
      //   1941: aload 15
      //   1943: astore 12
      //   1945: aload_0
      //   1946: getfield 33	org/vidogram/messenger/p$b:d	Lorg/vidogram/messenger/p$a;
      //   1949: getfield 281	org/vidogram/messenger/p$a:j	Ljava/lang/String;
      //   1952: ifnull +326 -> 2278
      //   1955: aload 15
      //   1957: astore 12
      //   1959: aload 18
      //   1961: getstatic 225	android/graphics/Bitmap$Config:ARGB_8888	Landroid/graphics/Bitmap$Config;
      //   1964: putfield 361	android/graphics/BitmapFactory$Options:inPreferredConfig	Landroid/graphics/Bitmap$Config;
      //   1967: aload 15
      //   1969: astore 12
      //   1971: getstatic 98	android/os/Build$VERSION:SDK_INT	I
      //   1974: bipush 21
      //   1976: if_icmpge +13 -> 1989
      //   1979: aload 15
      //   1981: astore 12
      //   1983: aload 18
      //   1985: iconst_1
      //   1986: putfield 177	android/graphics/BitmapFactory$Options:inPurgeable	Z
      //   1989: aload 15
      //   1991: astore 12
      //   1993: aload 18
      //   1995: iconst_0
      //   1996: putfield 364	android/graphics/BitmapFactory$Options:inDither	Z
      //   1999: aload 15
      //   2001: astore 13
      //   2003: aload 14
      //   2005: ifnull +31 -> 2036
      //   2008: iload 5
      //   2010: ifeq +283 -> 2293
      //   2013: aload 15
      //   2015: astore 12
      //   2017: getstatic 334	org/vidogram/messenger/ApplicationLoader:a	Landroid/content/Context;
      //   2020: invokevirtual 340	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
      //   2023: aload 14
      //   2025: invokevirtual 343	java/lang/Long:longValue	()J
      //   2028: iconst_1
      //   2029: aload 18
      //   2031: invokestatic 349	android/provider/MediaStore$Video$Thumbnails:getThumbnail	(Landroid/content/ContentResolver;JILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
      //   2034: astore 13
      //   2036: aload 13
      //   2038: astore 12
      //   2040: aload 13
      //   2042: ifnonnull +458 -> 2500
      //   2045: iload 7
      //   2047: ifeq +272 -> 2319
      //   2050: aload 13
      //   2052: astore 12
      //   2054: new 100	java/io/RandomAccessFile
      //   2057: dup
      //   2058: aload 19
      //   2060: ldc 102
      //   2062: invokespecial 105	java/io/RandomAccessFile:<init>	(Ljava/io/File;Ljava/lang/String;)V
      //   2065: astore 14
      //   2067: aload 13
      //   2069: astore 12
      //   2071: aload 14
      //   2073: invokevirtual 181	java/io/RandomAccessFile:getChannel	()Ljava/nio/channels/FileChannel;
      //   2076: getstatic 187	java/nio/channels/FileChannel$MapMode:READ_ONLY	Ljava/nio/channels/FileChannel$MapMode;
      //   2079: lconst_0
      //   2080: aload 19
      //   2082: invokevirtual 192	java/io/File:length	()J
      //   2085: invokevirtual 198	java/nio/channels/FileChannel:map	(Ljava/nio/channels/FileChannel$MapMode;JJ)Ljava/nio/MappedByteBuffer;
      //   2088: astore 15
      //   2090: aload 13
      //   2092: astore 12
      //   2094: new 170	android/graphics/BitmapFactory$Options
      //   2097: dup
      //   2098: invokespecial 171	android/graphics/BitmapFactory$Options:<init>	()V
      //   2101: astore 16
      //   2103: aload 13
      //   2105: astore 12
      //   2107: aload 16
      //   2109: iconst_1
      //   2110: putfield 201	android/graphics/BitmapFactory$Options:inJustDecodeBounds	Z
      //   2113: aload 13
      //   2115: astore 12
      //   2117: aconst_null
      //   2118: aload 15
      //   2120: aload 15
      //   2122: invokevirtual 207	java/nio/ByteBuffer:limit	()I
      //   2125: aload 16
      //   2127: iconst_1
      //   2128: invokestatic 213	org/vidogram/messenger/Utilities:loadWebpImage	(Landroid/graphics/Bitmap;Ljava/nio/ByteBuffer;ILandroid/graphics/BitmapFactory$Options;Z)Z
      //   2131: pop
      //   2132: aload 13
      //   2134: astore 12
      //   2136: aload 16
      //   2138: getfield 216	android/graphics/BitmapFactory$Options:outWidth	I
      //   2141: aload 16
      //   2143: getfield 219	android/graphics/BitmapFactory$Options:outHeight	I
      //   2146: getstatic 225	android/graphics/Bitmap$Config:ARGB_8888	Landroid/graphics/Bitmap$Config;
      //   2149: invokestatic 230	org/vidogram/messenger/c:a	(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
      //   2152: astore 13
      //   2154: aload 13
      //   2156: astore 12
      //   2158: aload 15
      //   2160: invokevirtual 207	java/nio/ByteBuffer:limit	()I
      //   2163: istore 5
      //   2165: aload 13
      //   2167: astore 12
      //   2169: aload 18
      //   2171: getfield 177	android/graphics/BitmapFactory$Options:inPurgeable	Z
      //   2174: ifne +766 -> 2940
      //   2177: iconst_1
      //   2178: istore 11
      //   2180: aload 13
      //   2182: astore 12
      //   2184: aload 13
      //   2186: aload 15
      //   2188: iload 5
      //   2190: aconst_null
      //   2191: iload 11
      //   2193: invokestatic 213	org/vidogram/messenger/Utilities:loadWebpImage	(Landroid/graphics/Bitmap;Ljava/nio/ByteBuffer;ILandroid/graphics/BitmapFactory$Options;Z)Z
      //   2196: pop
      //   2197: aload 13
      //   2199: astore 12
      //   2201: aload 14
      //   2203: invokevirtual 136	java/io/RandomAccessFile:close	()V
      //   2206: aload 13
      //   2208: ifnonnull +299 -> 2507
      //   2211: aload 13
      //   2213: astore 12
      //   2215: iload 6
      //   2217: ifeq -1768 -> 449
      //   2220: aload 13
      //   2222: astore 14
      //   2224: aload 19
      //   2226: invokevirtual 192	java/io/File:length	()J
      //   2229: lconst_0
      //   2230: lcmp
      //   2231: ifeq +21 -> 2252
      //   2234: aload 13
      //   2236: astore 12
      //   2238: aload 13
      //   2240: astore 14
      //   2242: aload_0
      //   2243: getfield 33	org/vidogram/messenger/p$b:d	Lorg/vidogram/messenger/p$a;
      //   2246: getfield 78	org/vidogram/messenger/p$a:c	Ljava/lang/String;
      //   2249: ifnonnull -1800 -> 449
      //   2252: aload 13
      //   2254: astore 14
      //   2256: aload 19
      //   2258: invokevirtual 233	java/io/File:delete	()Z
      //   2261: pop
      //   2262: aload 13
      //   2264: astore 12
      //   2266: goto -1817 -> 449
      //   2269: astore 12
      //   2271: aload 14
      //   2273: astore 12
      //   2275: goto -1826 -> 449
      //   2278: aload 15
      //   2280: astore 12
      //   2282: aload 18
      //   2284: getstatic 367	android/graphics/Bitmap$Config:RGB_565	Landroid/graphics/Bitmap$Config;
      //   2287: putfield 361	android/graphics/BitmapFactory$Options:inPreferredConfig	Landroid/graphics/Bitmap$Config;
      //   2290: goto -323 -> 1967
      //   2293: aload 15
      //   2295: astore 12
      //   2297: getstatic 334	org/vidogram/messenger/ApplicationLoader:a	Landroid/content/Context;
      //   2300: invokevirtual 340	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
      //   2303: aload 14
      //   2305: invokevirtual 343	java/lang/Long:longValue	()J
      //   2308: iconst_1
      //   2309: aload 18
      //   2311: invokestatic 358	android/provider/MediaStore$Images$Thumbnails:getThumbnail	(Landroid/content/ContentResolver;JILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
      //   2314: astore 13
      //   2316: goto -280 -> 2036
      //   2319: aload 13
      //   2321: astore 12
      //   2323: aload 18
      //   2325: getfield 177	android/graphics/BitmapFactory$Options:inPurgeable	Z
      //   2328: ifeq +130 -> 2458
      //   2331: aload 13
      //   2333: astore 12
      //   2335: new 100	java/io/RandomAccessFile
      //   2338: dup
      //   2339: aload 19
      //   2341: ldc 102
      //   2343: invokespecial 105	java/io/RandomAccessFile:<init>	(Ljava/io/File;Ljava/lang/String;)V
      //   2346: astore 15
      //   2348: aload 13
      //   2350: astore 12
      //   2352: aload 15
      //   2354: invokevirtual 234	java/io/RandomAccessFile:length	()J
      //   2357: l2i
      //   2358: istore 5
      //   2360: aload 13
      //   2362: astore 12
      //   2364: invokestatic 370	org/vidogram/messenger/p:h	()[B
      //   2367: ifnull +579 -> 2946
      //   2370: aload 13
      //   2372: astore 12
      //   2374: invokestatic 370	org/vidogram/messenger/p:h	()[B
      //   2377: arraylength
      //   2378: iload 5
      //   2380: if_icmplt +566 -> 2946
      //   2383: aload 13
      //   2385: astore 12
      //   2387: invokestatic 370	org/vidogram/messenger/p:h	()[B
      //   2390: astore 14
      //   2392: aload 14
      //   2394: astore 12
      //   2396: aload 12
      //   2398: astore 14
      //   2400: aload 12
      //   2402: ifnonnull +23 -> 2425
      //   2405: aload 13
      //   2407: astore 12
      //   2409: iload 5
      //   2411: newarray byte
      //   2413: astore 14
      //   2415: aload 13
      //   2417: astore 12
      //   2419: aload 14
      //   2421: invokestatic 372	org/vidogram/messenger/p:b	([B)[B
      //   2424: pop
      //   2425: aload 13
      //   2427: astore 12
      //   2429: aload 15
      //   2431: aload 14
      //   2433: iconst_0
      //   2434: iload 5
      //   2436: invokevirtual 115	java/io/RandomAccessFile:readFully	([BII)V
      //   2439: aload 13
      //   2441: astore 12
      //   2443: aload 14
      //   2445: iconst_0
      //   2446: iload 5
      //   2448: aload 18
      //   2450: invokestatic 245	android/graphics/BitmapFactory:decodeByteArray	([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
      //   2453: astore 13
      //   2455: goto -249 -> 2206
      //   2458: aload 13
      //   2460: astore 12
      //   2462: new 247	java/io/FileInputStream
      //   2465: dup
      //   2466: aload 19
      //   2468: invokespecial 250	java/io/FileInputStream:<init>	(Ljava/io/File;)V
      //   2471: astore 14
      //   2473: aload 13
      //   2475: astore 12
      //   2477: aload 14
      //   2479: aconst_null
      //   2480: aload 18
      //   2482: invokestatic 254	android/graphics/BitmapFactory:decodeStream	(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
      //   2485: astore 13
      //   2487: aload 13
      //   2489: astore 12
      //   2491: aload 14
      //   2493: invokevirtual 255	java/io/FileInputStream:close	()V
      //   2496: aload 13
      //   2498: astore 12
      //   2500: aload 12
      //   2502: astore 13
      //   2504: goto -298 -> 2206
      //   2507: iconst_0
      //   2508: istore 6
      //   2510: aload 13
      //   2512: astore 14
      //   2514: aload 13
      //   2516: astore 15
      //   2518: iload 6
      //   2520: istore 5
      //   2522: aload_0
      //   2523: getfield 33	org/vidogram/messenger/p$b:d	Lorg/vidogram/messenger/p$a;
      //   2526: getfield 78	org/vidogram/messenger/p$a:c	Ljava/lang/String;
      //   2529: ifnull +245 -> 2774
      //   2532: aload 13
      //   2534: astore 14
      //   2536: aload 13
      //   2538: invokevirtual 264	android/graphics/Bitmap:getWidth	()I
      //   2541: i2f
      //   2542: fstore_1
      //   2543: aload 13
      //   2545: astore 14
      //   2547: aload 13
      //   2549: invokevirtual 267	android/graphics/Bitmap:getHeight	()I
      //   2552: i2f
      //   2553: fstore_3
      //   2554: aload 13
      //   2556: astore 14
      //   2558: aload 13
      //   2560: astore 12
      //   2562: aload 18
      //   2564: getfield 177	android/graphics/BitmapFactory$Options:inPurgeable	Z
      //   2567: ifne +89 -> 2656
      //   2570: aload 13
      //   2572: astore 12
      //   2574: fload_2
      //   2575: fconst_0
      //   2576: fcmpl
      //   2577: ifeq +79 -> 2656
      //   2580: aload 13
      //   2582: astore 12
      //   2584: fload_1
      //   2585: fload_2
      //   2586: fcmpl
      //   2587: ifeq +69 -> 2656
      //   2590: aload 13
      //   2592: astore 12
      //   2594: fload_1
      //   2595: ldc_w 373
      //   2598: fload_2
      //   2599: fadd
      //   2600: fcmpl
      //   2601: ifle +55 -> 2656
      //   2604: aload 13
      //   2606: astore 14
      //   2608: fload_1
      //   2609: fload_2
      //   2610: fdiv
      //   2611: fstore 4
      //   2613: aload 13
      //   2615: astore 14
      //   2617: aload 13
      //   2619: fload_2
      //   2620: f2i
      //   2621: fload_3
      //   2622: fload 4
      //   2624: fdiv
      //   2625: f2i
      //   2626: iconst_1
      //   2627: invokestatic 376	org/vidogram/messenger/c:a	(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;
      //   2630: astore 15
      //   2632: aload 13
      //   2634: astore 12
      //   2636: aload 13
      //   2638: aload 15
      //   2640: if_acmpeq +16 -> 2656
      //   2643: aload 13
      //   2645: astore 14
      //   2647: aload 13
      //   2649: invokevirtual 379	android/graphics/Bitmap:recycle	()V
      //   2652: aload 15
      //   2654: astore 12
      //   2656: aload 12
      //   2658: astore 15
      //   2660: iload 6
      //   2662: istore 5
      //   2664: aload 12
      //   2666: ifnull +108 -> 2774
      //   2669: aload 12
      //   2671: astore 15
      //   2673: iload 6
      //   2675: istore 5
      //   2677: iload 9
      //   2679: ifeq +95 -> 2774
      //   2682: aload 12
      //   2684: astore 15
      //   2686: iload 6
      //   2688: istore 5
      //   2690: fload_3
      //   2691: ldc_w 380
      //   2694: fcmpg
      //   2695: ifge +79 -> 2774
      //   2698: aload 12
      //   2700: astore 15
      //   2702: iload 6
      //   2704: istore 5
      //   2706: fload_1
      //   2707: ldc_w 380
      //   2710: fcmpg
      //   2711: ifge +63 -> 2774
      //   2714: aload 12
      //   2716: astore 14
      //   2718: aload 12
      //   2720: invokevirtual 261	android/graphics/Bitmap:getConfig	()Landroid/graphics/Bitmap$Config;
      //   2723: getstatic 225	android/graphics/Bitmap$Config:ARGB_8888	Landroid/graphics/Bitmap$Config;
      //   2726: if_acmpne +226 -> 2952
      //   2729: aload 12
      //   2731: astore 14
      //   2733: aload 18
      //   2735: getfield 177	android/graphics/BitmapFactory$Options:inPurgeable	Z
      //   2738: ifeq +78 -> 2816
      //   2741: iconst_0
      //   2742: istore 5
      //   2744: aload 12
      //   2746: astore 14
      //   2748: aload 12
      //   2750: iconst_3
      //   2751: iload 5
      //   2753: aload 12
      //   2755: invokevirtual 264	android/graphics/Bitmap:getWidth	()I
      //   2758: aload 12
      //   2760: invokevirtual 267	android/graphics/Bitmap:getHeight	()I
      //   2763: aload 12
      //   2765: invokevirtual 270	android/graphics/Bitmap:getRowBytes	()I
      //   2768: invokestatic 274	org/vidogram/messenger/Utilities:blurBitmap	(Ljava/lang/Object;IIIII)V
      //   2771: goto +181 -> 2952
      //   2774: aload 15
      //   2776: astore 12
      //   2778: iload 5
      //   2780: ifne -2331 -> 449
      //   2783: aload 15
      //   2785: astore 12
      //   2787: aload 15
      //   2789: astore 14
      //   2791: aload 18
      //   2793: getfield 177	android/graphics/BitmapFactory$Options:inPurgeable	Z
      //   2796: ifeq -2347 -> 449
      //   2799: aload 15
      //   2801: astore 14
      //   2803: aload 15
      //   2805: invokestatic 278	org/vidogram/messenger/Utilities:pinBitmap	(Landroid/graphics/Bitmap;)I
      //   2808: pop
      //   2809: aload 15
      //   2811: astore 12
      //   2813: goto -2364 -> 449
      //   2816: iconst_1
      //   2817: istore 5
      //   2819: goto -75 -> 2744
      //   2822: aconst_null
      //   2823: astore 12
      //   2825: goto -2356 -> 469
      //   2828: astore 13
      //   2830: goto -2388 -> 442
      //   2833: astore 13
      //   2835: goto -2269 -> 566
      //   2838: astore 14
      //   2840: goto -2327 -> 513
      //   2843: iconst_1
      //   2844: istore 6
      //   2846: iconst_0
      //   2847: istore 5
      //   2849: aconst_null
      //   2850: astore 14
      //   2852: goto +55 -> 2907
      //   2855: iconst_0
      //   2856: istore 5
      //   2858: goto -2460 -> 398
      //   2861: aconst_null
      //   2862: astore 12
      //   2864: goto -1952 -> 912
      //   2867: iconst_1
      //   2868: istore 5
      //   2870: goto -1847 -> 1023
      //   2873: iconst_1
      //   2874: istore 5
      //   2876: goto -1791 -> 1085
      //   2879: iconst_1
      //   2880: istore 5
      //   2882: goto -1735 -> 1147
      //   2885: iconst_1
      //   2886: istore 5
      //   2888: goto -1706 -> 1182
      //   2891: iconst_1
      //   2892: istore 5
      //   2894: goto -1677 -> 1217
      //   2897: iconst_0
      //   2898: istore 6
      //   2900: iconst_0
      //   2901: istore 5
      //   2903: aload 12
      //   2905: astore 14
      //   2907: bipush 20
      //   2909: istore 8
      //   2911: aload 14
      //   2913: ifnull -1554 -> 1359
      //   2916: iconst_0
      //   2917: istore 8
      //   2919: goto -1560 -> 1359
      //   2922: astore 12
      //   2924: aconst_null
      //   2925: astore 12
      //   2927: goto -2478 -> 449
      //   2930: iconst_0
      //   2931: istore 6
      //   2933: aload 12
      //   2935: astore 14
      //   2937: goto -30 -> 2907
      //   2940: iconst_0
      //   2941: istore 11
      //   2943: goto -763 -> 2180
      //   2946: aconst_null
      //   2947: astore 12
      //   2949: goto -553 -> 2396
      //   2952: iconst_1
      //   2953: istore 5
      //   2955: aload 12
      //   2957: astore 15
      //   2959: goto -185 -> 2774
      //
      // Exception table:
      //   from	to	target	type
      //   53	63	64	finally
      //   66	69	64	finally
      //   80	83	64	finally
      //   9	30	72	finally
      //   31	34	72	finally
      //   74	77	72	finally
      //   418	428	429	finally
      //   431	434	429	finally
      //   633	636	429	finally
      //   398	418	437	java/lang/Throwable
      //   434	437	437	java/lang/Throwable
      //   636	665	437	java/lang/Throwable
      //   670	750	437	java/lang/Throwable
      //   863	912	437	java/lang/Throwable
      //   921	933	437	java/lang/Throwable
      //   933	955	437	java/lang/Throwable
      //   958	979	437	java/lang/Throwable
      //   351	356	492	java/lang/Exception
      //   194	207	508	java/lang/Exception
      //   533	538	545	java/lang/Exception
      //   194	207	561	finally
      //   571	576	579	java/lang/Exception
      //   807	817	844	java/lang/Throwable
      //   821	831	844	java/lang/Throwable
      //   831	837	844	java/lang/Throwable
      //   1001	1020	844	java/lang/Throwable
      //   1023	1046	844	java/lang/Throwable
      //   1063	1082	844	java/lang/Throwable
      //   1085	1108	844	java/lang/Throwable
      //   1125	1144	844	java/lang/Throwable
      //   1147	1179	844	java/lang/Throwable
      //   1182	1214	844	java/lang/Throwable
      //   1217	1241	844	java/lang/Throwable
      //   1261	1275	844	java/lang/Throwable
      //   1428	1438	1439	finally
      //   1441	1444	1439	finally
      //   1553	1556	1439	finally
      //   1833	1843	1844	finally
      //   1846	1849	1844	finally
      //   1919	1922	1844	finally
      //   1745	1752	1856	java/lang/Throwable
      //   1756	1764	1856	java/lang/Throwable
      //   1768	1779	1856	java/lang/Throwable
      //   1793	1799	1856	java/lang/Throwable
      //   1803	1810	1856	java/lang/Throwable
      //   1820	1826	1856	java/lang/Throwable
      //   1830	1833	1856	java/lang/Throwable
      //   1853	1856	1856	java/lang/Throwable
      //   1911	1916	1856	java/lang/Throwable
      //   1926	1936	1856	java/lang/Throwable
      //   1945	1955	1856	java/lang/Throwable
      //   1959	1967	1856	java/lang/Throwable
      //   1971	1979	1856	java/lang/Throwable
      //   1983	1989	1856	java/lang/Throwable
      //   1993	1999	1856	java/lang/Throwable
      //   2017	2036	1856	java/lang/Throwable
      //   2054	2067	1856	java/lang/Throwable
      //   2071	2090	1856	java/lang/Throwable
      //   2094	2103	1856	java/lang/Throwable
      //   2107	2113	1856	java/lang/Throwable
      //   2117	2132	1856	java/lang/Throwable
      //   2136	2154	1856	java/lang/Throwable
      //   2158	2165	1856	java/lang/Throwable
      //   2169	2177	1856	java/lang/Throwable
      //   2184	2197	1856	java/lang/Throwable
      //   2201	2206	1856	java/lang/Throwable
      //   2282	2290	1856	java/lang/Throwable
      //   2297	2316	1856	java/lang/Throwable
      //   2323	2331	1856	java/lang/Throwable
      //   2335	2348	1856	java/lang/Throwable
      //   2352	2360	1856	java/lang/Throwable
      //   2364	2370	1856	java/lang/Throwable
      //   2374	2383	1856	java/lang/Throwable
      //   2387	2392	1856	java/lang/Throwable
      //   2409	2415	1856	java/lang/Throwable
      //   2419	2425	1856	java/lang/Throwable
      //   2429	2439	1856	java/lang/Throwable
      //   2443	2455	1856	java/lang/Throwable
      //   2462	2473	1856	java/lang/Throwable
      //   2477	2487	1856	java/lang/Throwable
      //   2491	2496	1856	java/lang/Throwable
      //   2224	2234	2269	java/lang/Throwable
      //   2242	2252	2269	java/lang/Throwable
      //   2256	2262	2269	java/lang/Throwable
      //   2522	2532	2269	java/lang/Throwable
      //   2536	2543	2269	java/lang/Throwable
      //   2547	2554	2269	java/lang/Throwable
      //   2562	2570	2269	java/lang/Throwable
      //   2608	2613	2269	java/lang/Throwable
      //   2617	2632	2269	java/lang/Throwable
      //   2647	2652	2269	java/lang/Throwable
      //   2718	2729	2269	java/lang/Throwable
      //   2733	2741	2269	java/lang/Throwable
      //   2748	2771	2269	java/lang/Throwable
      //   2791	2799	2269	java/lang/Throwable
      //   2803	2809	2269	java/lang/Throwable
      //   754	761	2828	java/lang/Throwable
      //   765	773	2828	java/lang/Throwable
      //   780	793	2828	java/lang/Throwable
      //   797	802	2828	java/lang/Throwable
      //   983	988	2828	java/lang/Throwable
      //   215	225	2833	finally
      //   233	238	2833	finally
      //   246	257	2833	finally
      //   265	282	2833	finally
      //   294	304	2833	finally
      //   316	326	2833	finally
      //   337	342	2833	finally
      //   484	489	2833	finally
      //   517	524	2833	finally
      //   215	225	2838	java/lang/Exception
      //   233	238	2838	java/lang/Exception
      //   246	257	2838	java/lang/Exception
      //   265	282	2838	java/lang/Exception
      //   294	304	2838	java/lang/Exception
      //   316	326	2838	java/lang/Exception
      //   337	342	2838	java/lang/Exception
      //   484	489	2838	java/lang/Exception
      //   1282	1325	2922	java/lang/Throwable
      //   1334	1356	2922	java/lang/Throwable
      //   1364	1408	2922	java/lang/Throwable
      //   1408	1428	2922	java/lang/Throwable
      //   1444	1447	2922	java/lang/Throwable
      //   1447	1480	2922	java/lang/Throwable
      //   1493	1515	2922	java/lang/Throwable
      //   1521	1536	2922	java/lang/Throwable
      //   1556	1571	2922	java/lang/Throwable
      //   1587	1612	2922	java/lang/Throwable
      //   1612	1644	2922	java/lang/Throwable
      //   1653	1668	2922	java/lang/Throwable
      //   1703	1709	2922	java/lang/Throwable
      //   1719	1737	2922	java/lang/Throwable
      //   1861	1879	2922	java/lang/Throwable
      //   1886	1907	2922	java/lang/Throwable
    }
  }

  private class c extends AsyncTask<Void, Void, Boolean>
  {
    private String b;
    private File c;
    private String d;
    private int e;
    private RandomAccessFile f = null;
    private boolean g = true;
    private long h;

    public c(String paramFile, File paramString1, String arg4)
    {
      this.b = paramFile;
      this.c = paramString1;
      Object localObject;
      this.d = localObject;
    }

    private void a(float paramFloat)
    {
      long l = System.currentTimeMillis();
      if ((paramFloat == 1.0F) || (this.h == 0L) || (this.h < l - 500L))
      {
        this.h = l;
        Utilities.c.b(new Runnable(paramFloat)
        {
          public void run()
          {
            p.a(p.this).put(p.c.a(p.c.this), Float.valueOf(this.a));
            a.a(new Runnable()
            {
              public void run()
              {
                y.a().a(y.ay, new Object[] { p.c.a(p.c.this), Float.valueOf(p.c.1.this.a) });
              }
            });
          }
        });
      }
    }

    // ERROR //
    protected Boolean a(Void[] paramArrayOfVoid)
    {
      // Byte code:
      //   0: iconst_0
      //   1: istore 5
      //   3: iconst_0
      //   4: istore 6
      //   6: iconst_0
      //   7: istore 4
      //   9: new 78	java/net/URL
      //   12: dup
      //   13: aload_0
      //   14: getfield 39	org/vidogram/messenger/p$c:b	Ljava/lang/String;
      //   17: invokespecial 81	java/net/URL:<init>	(Ljava/lang/String;)V
      //   20: invokevirtual 85	java/net/URL:openConnection	()Ljava/net/URLConnection;
      //   23: astore 8
      //   25: aload 8
      //   27: astore 7
      //   29: aload 8
      //   31: ldc 87
      //   33: ldc 89
      //   35: invokevirtual 95	java/net/URLConnection:addRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
      //   38: aload 8
      //   40: astore 7
      //   42: aload 8
      //   44: ldc 97
      //   46: ldc 99
      //   48: invokevirtual 95	java/net/URLConnection:addRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
      //   51: aload 8
      //   53: astore 7
      //   55: aload 8
      //   57: sipush 5000
      //   60: invokevirtual 103	java/net/URLConnection:setConnectTimeout	(I)V
      //   63: aload 8
      //   65: astore 7
      //   67: aload 8
      //   69: sipush 5000
      //   72: invokevirtual 106	java/net/URLConnection:setReadTimeout	(I)V
      //   75: aload 8
      //   77: astore_1
      //   78: aload 8
      //   80: astore 7
      //   82: aload 8
      //   84: instanceof 108
      //   87: ifeq +132 -> 219
      //   90: aload 8
      //   92: astore 7
      //   94: aload 8
      //   96: checkcast 108	java/net/HttpURLConnection
      //   99: astore 9
      //   101: aload 8
      //   103: astore 7
      //   105: aload 9
      //   107: iconst_1
      //   108: invokevirtual 112	java/net/HttpURLConnection:setInstanceFollowRedirects	(Z)V
      //   111: aload 8
      //   113: astore 7
      //   115: aload 9
      //   117: invokevirtual 116	java/net/HttpURLConnection:getResponseCode	()I
      //   120: istore_2
      //   121: iload_2
      //   122: sipush 302
      //   125: if_icmpeq +20 -> 145
      //   128: iload_2
      //   129: sipush 301
      //   132: if_icmpeq +13 -> 145
      //   135: aload 8
      //   137: astore_1
      //   138: iload_2
      //   139: sipush 303
      //   142: if_icmpne +77 -> 219
      //   145: aload 8
      //   147: astore 7
      //   149: aload 9
      //   151: ldc 118
      //   153: invokevirtual 122	java/net/HttpURLConnection:getHeaderField	(Ljava/lang/String;)Ljava/lang/String;
      //   156: astore_1
      //   157: aload 8
      //   159: astore 7
      //   161: aload 9
      //   163: ldc 124
      //   165: invokevirtual 122	java/net/HttpURLConnection:getHeaderField	(Ljava/lang/String;)Ljava/lang/String;
      //   168: astore 9
      //   170: aload 8
      //   172: astore 7
      //   174: new 78	java/net/URL
      //   177: dup
      //   178: aload_1
      //   179: invokespecial 81	java/net/URL:<init>	(Ljava/lang/String;)V
      //   182: invokevirtual 85	java/net/URL:openConnection	()Ljava/net/URLConnection;
      //   185: astore_1
      //   186: aload_1
      //   187: astore 7
      //   189: aload_1
      //   190: ldc 126
      //   192: aload 9
      //   194: invokevirtual 129	java/net/URLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
      //   197: aload_1
      //   198: astore 7
      //   200: aload_1
      //   201: ldc 87
      //   203: ldc 89
      //   205: invokevirtual 95	java/net/URLConnection:addRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
      //   208: aload_1
      //   209: astore 7
      //   211: aload_1
      //   212: ldc 97
      //   214: ldc 99
      //   216: invokevirtual 95	java/net/URLConnection:addRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
      //   219: aload_1
      //   220: astore 7
      //   222: aload_1
      //   223: invokevirtual 132	java/net/URLConnection:connect	()V
      //   226: aload_1
      //   227: astore 7
      //   229: aload_1
      //   230: invokevirtual 136	java/net/URLConnection:getInputStream	()Ljava/io/InputStream;
      //   233: astore 8
      //   235: aload_0
      //   236: new 138	java/io/RandomAccessFile
      //   239: dup
      //   240: aload_0
      //   241: getfield 41	org/vidogram/messenger/p$c:c	Ljava/io/File;
      //   244: ldc 140
      //   246: invokespecial 143	java/io/RandomAccessFile:<init>	(Ljava/io/File;Ljava/lang/String;)V
      //   249: putfield 35	org/vidogram/messenger/p$c:f	Ljava/io/RandomAccessFile;
      //   252: aload 8
      //   254: astore 7
      //   256: aload_0
      //   257: getfield 37	org/vidogram/messenger/p$c:g	Z
      //   260: ifeq +175 -> 435
      //   263: aload_1
      //   264: ifnull +44 -> 308
      //   267: aload_1
      //   268: instanceof 108
      //   271: ifeq +37 -> 308
      //   274: aload_1
      //   275: checkcast 108	java/net/HttpURLConnection
      //   278: invokevirtual 116	java/net/HttpURLConnection:getResponseCode	()I
      //   281: istore_2
      //   282: iload_2
      //   283: sipush 200
      //   286: if_icmpeq +22 -> 308
      //   289: iload_2
      //   290: sipush 202
      //   293: if_icmpeq +15 -> 308
      //   296: iload_2
      //   297: sipush 304
      //   300: if_icmpeq +8 -> 308
      //   303: aload_0
      //   304: iconst_0
      //   305: putfield 37	org/vidogram/messenger/p$c:g	Z
      //   308: aload_1
      //   309: ifnull +63 -> 372
      //   312: aload_1
      //   313: invokevirtual 147	java/net/URLConnection:getHeaderFields	()Ljava/util/Map;
      //   316: astore_1
      //   317: aload_1
      //   318: ifnull +54 -> 372
      //   321: aload_1
      //   322: ldc 149
      //   324: invokeinterface 155 2 0
      //   329: checkcast 157	java/util/List
      //   332: astore_1
      //   333: aload_1
      //   334: ifnull +38 -> 372
      //   337: aload_1
      //   338: invokeinterface 161 1 0
      //   343: ifne +29 -> 372
      //   346: aload_1
      //   347: iconst_0
      //   348: invokeinterface 164 2 0
      //   353: checkcast 166	java/lang/String
      //   356: astore_1
      //   357: aload_1
      //   358: ifnull +14 -> 372
      //   361: aload_0
      //   362: aload_1
      //   363: invokestatic 169	org/vidogram/messenger/Utilities:a	(Ljava/lang/String;)Ljava/lang/Integer;
      //   366: invokevirtual 174	java/lang/Integer:intValue	()I
      //   369: putfield 176	org/vidogram/messenger/p$c:e	I
      //   372: aload 7
      //   374: ifnull +24 -> 398
      //   377: ldc 177
      //   379: newarray byte
      //   381: astore_1
      //   382: iconst_0
      //   383: istore_2
      //   384: aload_0
      //   385: invokevirtual 180	org/vidogram/messenger/p$c:isCancelled	()Z
      //   388: istore 4
      //   390: iload 4
      //   392: ifeq +180 -> 572
      //   395: iconst_0
      //   396: istore 4
      //   398: aload_0
      //   399: getfield 35	org/vidogram/messenger/p$c:f	Ljava/io/RandomAccessFile;
      //   402: ifnull +15 -> 417
      //   405: aload_0
      //   406: getfield 35	org/vidogram/messenger/p$c:f	Ljava/io/RandomAccessFile;
      //   409: invokevirtual 183	java/io/RandomAccessFile:close	()V
      //   412: aload_0
      //   413: aconst_null
      //   414: putfield 35	org/vidogram/messenger/p$c:f	Ljava/io/RandomAccessFile;
      //   417: iload 4
      //   419: istore 5
      //   421: aload 7
      //   423: ifnull +12 -> 435
      //   426: aload 7
      //   428: invokevirtual 186	java/io/InputStream:close	()V
      //   431: iload 4
      //   433: istore 5
      //   435: iload 5
      //   437: invokestatic 192	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
      //   440: areturn
      //   441: astore 7
      //   443: aconst_null
      //   444: astore_1
      //   445: aconst_null
      //   446: astore 8
      //   448: aload 7
      //   450: instanceof 194
      //   453: ifeq +28 -> 481
      //   456: invokestatic 199	org/vidogram/tgnet/ConnectionsManager:m	()Z
      //   459: ifeq +8 -> 467
      //   462: aload_0
      //   463: iconst_0
      //   464: putfield 37	org/vidogram/messenger/p$c:g	Z
      //   467: ldc 201
      //   469: aload 7
      //   471: invokestatic 206	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
      //   474: aload 8
      //   476: astore 7
      //   478: goto -222 -> 256
      //   481: aload 7
      //   483: instanceof 208
      //   486: ifeq +11 -> 497
      //   489: aload_0
      //   490: iconst_0
      //   491: putfield 37	org/vidogram/messenger/p$c:g	Z
      //   494: goto -27 -> 467
      //   497: aload 7
      //   499: instanceof 210
      //   502: ifeq +32 -> 534
      //   505: aload 7
      //   507: invokevirtual 214	java/lang/Throwable:getMessage	()Ljava/lang/String;
      //   510: ifnull -43 -> 467
      //   513: aload 7
      //   515: invokevirtual 214	java/lang/Throwable:getMessage	()Ljava/lang/String;
      //   518: ldc 216
      //   520: invokevirtual 220	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
      //   523: ifeq -56 -> 467
      //   526: aload_0
      //   527: iconst_0
      //   528: putfield 37	org/vidogram/messenger/p$c:g	Z
      //   531: goto -64 -> 467
      //   534: aload 7
      //   536: instanceof 222
      //   539: ifeq -72 -> 467
      //   542: aload_0
      //   543: iconst_0
      //   544: putfield 37	org/vidogram/messenger/p$c:g	Z
      //   547: goto -80 -> 467
      //   550: astore 8
      //   552: ldc 201
      //   554: aload 8
      //   556: invokestatic 206	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
      //   559: goto -251 -> 308
      //   562: astore_1
      //   563: ldc 201
      //   565: aload_1
      //   566: invokestatic 206	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
      //   569: goto -197 -> 372
      //   572: aload 7
      //   574: aload_1
      //   575: invokevirtual 226	java/io/InputStream:read	([B)I
      //   578: istore_3
      //   579: iload_3
      //   580: ifle +66 -> 646
      //   583: aload_0
      //   584: getfield 35	org/vidogram/messenger/p$c:f	Ljava/io/RandomAccessFile;
      //   587: aload_1
      //   588: iconst_0
      //   589: iload_3
      //   590: invokevirtual 230	java/io/RandomAccessFile:write	([BII)V
      //   593: iload_2
      //   594: iload_3
      //   595: iadd
      //   596: istore_3
      //   597: iload_3
      //   598: istore_2
      //   599: aload_0
      //   600: getfield 176	org/vidogram/messenger/p$c:e	I
      //   603: ifle -219 -> 384
      //   606: aload_0
      //   607: iload_3
      //   608: i2f
      //   609: aload_0
      //   610: getfield 176	org/vidogram/messenger/p$c:e	I
      //   613: i2f
      //   614: fdiv
      //   615: invokespecial 232	org/vidogram/messenger/p$c:a	(F)V
      //   618: iload_3
      //   619: istore_2
      //   620: goto -236 -> 384
      //   623: astore_1
      //   624: iconst_0
      //   625: istore 4
      //   627: ldc 201
      //   629: aload_1
      //   630: invokestatic 206	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
      //   633: goto -235 -> 398
      //   636: astore_1
      //   637: ldc 201
      //   639: aload_1
      //   640: invokestatic 206	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
      //   643: goto -245 -> 398
      //   646: iload_3
      //   647: iconst_m1
      //   648: if_icmpne +21 -> 669
      //   651: aload_0
      //   652: getfield 176	org/vidogram/messenger/p$c:e	I
      //   655: ifeq +8 -> 663
      //   658: aload_0
      //   659: fconst_1
      //   660: invokespecial 232	org/vidogram/messenger/p$c:a	(F)V
      //   663: iconst_1
      //   664: istore 4
      //   666: goto -268 -> 398
      //   669: iconst_0
      //   670: istore 4
      //   672: goto -274 -> 398
      //   675: astore_1
      //   676: ldc 201
      //   678: aload_1
      //   679: invokestatic 206	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
      //   682: goto -265 -> 417
      //   685: astore_1
      //   686: ldc 201
      //   688: aload_1
      //   689: invokestatic 206	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
      //   692: iload 4
      //   694: istore 5
      //   696: goto -261 -> 435
      //   699: astore_1
      //   700: iload 6
      //   702: istore 4
      //   704: goto -67 -> 637
      //   707: astore_1
      //   708: iconst_1
      //   709: istore 4
      //   711: goto -74 -> 637
      //   714: astore_1
      //   715: iconst_1
      //   716: istore 4
      //   718: goto -91 -> 627
      //   721: astore 9
      //   723: aconst_null
      //   724: astore 8
      //   726: aload 7
      //   728: astore_1
      //   729: aload 9
      //   731: astore 7
      //   733: goto -285 -> 448
      //   736: astore 7
      //   738: goto -290 -> 448
      //
      // Exception table:
      //   from	to	target	type
      //   9	25	441	java/lang/Throwable
      //   267	282	550	java/lang/Exception
      //   303	308	550	java/lang/Exception
      //   312	317	562	java/lang/Exception
      //   321	333	562	java/lang/Exception
      //   337	357	562	java/lang/Exception
      //   361	372	562	java/lang/Exception
      //   572	579	623	java/lang/Exception
      //   583	593	623	java/lang/Exception
      //   599	618	623	java/lang/Exception
      //   627	633	636	java/lang/Throwable
      //   398	417	675	java/lang/Throwable
      //   426	431	685	java/lang/Throwable
      //   377	382	699	java/lang/Throwable
      //   384	390	699	java/lang/Throwable
      //   572	579	699	java/lang/Throwable
      //   583	593	699	java/lang/Throwable
      //   599	618	699	java/lang/Throwable
      //   651	663	707	java/lang/Throwable
      //   651	663	714	java/lang/Exception
      //   29	38	721	java/lang/Throwable
      //   42	51	721	java/lang/Throwable
      //   55	63	721	java/lang/Throwable
      //   67	75	721	java/lang/Throwable
      //   82	90	721	java/lang/Throwable
      //   94	101	721	java/lang/Throwable
      //   105	111	721	java/lang/Throwable
      //   115	121	721	java/lang/Throwable
      //   149	157	721	java/lang/Throwable
      //   161	170	721	java/lang/Throwable
      //   174	186	721	java/lang/Throwable
      //   189	197	721	java/lang/Throwable
      //   200	208	721	java/lang/Throwable
      //   211	219	721	java/lang/Throwable
      //   222	226	721	java/lang/Throwable
      //   229	235	721	java/lang/Throwable
      //   235	252	736	java/lang/Throwable
    }

    protected void a(Boolean paramBoolean)
    {
      p localp = p.this;
      if (paramBoolean.booleanValue());
      for (int i = 2; ; i = 1)
      {
        p.a(localp, this, i);
        return;
      }
    }

    protected void onCancelled()
    {
      p.a(p.this, this, 2);
    }
  }

  private class d extends AsyncTask<Void, Void, Boolean>
  {
    private p.a b = null;
    private RandomAccessFile c = null;
    private int d;
    private long e;
    private boolean f = true;
    private URLConnection g = null;

    public d(p.a paramInt, int arg3)
    {
      this.b = paramInt;
      int i;
      this.d = i;
    }

    private void a(float paramFloat)
    {
      long l = System.currentTimeMillis();
      if ((paramFloat == 1.0F) || (this.e == 0L) || (this.e < l - 500L))
      {
        this.e = l;
        Utilities.c.b(new Runnable(paramFloat)
        {
          public void run()
          {
            p.a(p.this).put(p.d.a(p.d.this).b, Float.valueOf(this.a));
            a.a(new Runnable()
            {
              public void run()
              {
                y.a().a(y.ay, new Object[] { p.d.a(p.d.this).b, Float.valueOf(p.d.1.this.a) });
              }
            });
          }
        });
      }
    }

    // ERROR //
    protected Boolean a(Void[] paramArrayOfVoid)
    {
      // Byte code:
      //   0: aconst_null
      //   1: astore_1
      //   2: iconst_0
      //   3: istore 6
      //   5: iconst_0
      //   6: istore 7
      //   8: aload_0
      //   9: invokevirtual 90	org/vidogram/messenger/p$d:isCancelled	()Z
      //   12: ifne +129 -> 141
      //   15: aload_0
      //   16: new 92	java/net/URL
      //   19: dup
      //   20: aload_0
      //   21: getfield 46	org/vidogram/messenger/p$d:b	Lorg/vidogram/messenger/p$a;
      //   24: getfield 98	org/vidogram/messenger/p$a:j	Ljava/lang/String;
      //   27: invokespecial 101	java/net/URL:<init>	(Ljava/lang/String;)V
      //   30: invokevirtual 105	java/net/URL:openConnection	()Ljava/net/URLConnection;
      //   33: putfield 52	org/vidogram/messenger/p$d:g	Ljava/net/URLConnection;
      //   36: aload_0
      //   37: getfield 52	org/vidogram/messenger/p$d:g	Ljava/net/URLConnection;
      //   40: ldc 107
      //   42: ldc 109
      //   44: invokevirtual 115	java/net/URLConnection:addRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
      //   47: aload_0
      //   48: getfield 52	org/vidogram/messenger/p$d:g	Ljava/net/URLConnection;
      //   51: ldc 117
      //   53: ldc 119
      //   55: invokevirtual 115	java/net/URLConnection:addRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
      //   58: aload_0
      //   59: getfield 52	org/vidogram/messenger/p$d:g	Ljava/net/URLConnection;
      //   62: sipush 5000
      //   65: invokevirtual 123	java/net/URLConnection:setConnectTimeout	(I)V
      //   68: aload_0
      //   69: getfield 52	org/vidogram/messenger/p$d:g	Ljava/net/URLConnection;
      //   72: sipush 5000
      //   75: invokevirtual 126	java/net/URLConnection:setReadTimeout	(I)V
      //   78: aload_0
      //   79: getfield 52	org/vidogram/messenger/p$d:g	Ljava/net/URLConnection;
      //   82: instanceof 128
      //   85: ifeq +14 -> 99
      //   88: aload_0
      //   89: getfield 52	org/vidogram/messenger/p$d:g	Ljava/net/URLConnection;
      //   92: checkcast 128	java/net/HttpURLConnection
      //   95: iconst_1
      //   96: invokevirtual 132	java/net/HttpURLConnection:setInstanceFollowRedirects	(Z)V
      //   99: aload_0
      //   100: invokevirtual 90	org/vidogram/messenger/p$d:isCancelled	()Z
      //   103: ifne +594 -> 697
      //   106: aload_0
      //   107: getfield 52	org/vidogram/messenger/p$d:g	Ljava/net/URLConnection;
      //   110: invokevirtual 135	java/net/URLConnection:connect	()V
      //   113: aload_0
      //   114: getfield 52	org/vidogram/messenger/p$d:g	Ljava/net/URLConnection;
      //   117: invokevirtual 139	java/net/URLConnection:getInputStream	()Ljava/io/InputStream;
      //   120: astore_1
      //   121: aload_0
      //   122: new 141	java/io/RandomAccessFile
      //   125: dup
      //   126: aload_0
      //   127: getfield 46	org/vidogram/messenger/p$d:b	Lorg/vidogram/messenger/p$a;
      //   130: getfield 145	org/vidogram/messenger/p$a:h	Ljava/io/File;
      //   133: ldc 147
      //   135: invokespecial 150	java/io/RandomAccessFile:<init>	(Ljava/io/File;Ljava/lang/String;)V
      //   138: putfield 48	org/vidogram/messenger/p$d:c	Ljava/io/RandomAccessFile;
      //   141: iload 7
      //   143: istore 5
      //   145: aload_0
      //   146: invokevirtual 90	org/vidogram/messenger/p$d:isCancelled	()Z
      //   149: ifne +175 -> 324
      //   152: aload_0
      //   153: getfield 52	org/vidogram/messenger/p$d:g	Ljava/net/URLConnection;
      //   156: ifnull +50 -> 206
      //   159: aload_0
      //   160: getfield 52	org/vidogram/messenger/p$d:g	Ljava/net/URLConnection;
      //   163: instanceof 128
      //   166: ifeq +40 -> 206
      //   169: aload_0
      //   170: getfield 52	org/vidogram/messenger/p$d:g	Ljava/net/URLConnection;
      //   173: checkcast 128	java/net/HttpURLConnection
      //   176: invokevirtual 154	java/net/HttpURLConnection:getResponseCode	()I
      //   179: istore_2
      //   180: iload_2
      //   181: sipush 200
      //   184: if_icmpeq +22 -> 206
      //   187: iload_2
      //   188: sipush 202
      //   191: if_icmpeq +15 -> 206
      //   194: iload_2
      //   195: sipush 304
      //   198: if_icmpeq +8 -> 206
      //   201: aload_0
      //   202: iconst_0
      //   203: putfield 50	org/vidogram/messenger/p$d:f	Z
      //   206: aload_0
      //   207: getfield 54	org/vidogram/messenger/p$d:d	I
      //   210: ifne +83 -> 293
      //   213: aload_0
      //   214: getfield 52	org/vidogram/messenger/p$d:g	Ljava/net/URLConnection;
      //   217: ifnull +76 -> 293
      //   220: aload_0
      //   221: getfield 52	org/vidogram/messenger/p$d:g	Ljava/net/URLConnection;
      //   224: invokevirtual 158	java/net/URLConnection:getHeaderFields	()Ljava/util/Map;
      //   227: astore 8
      //   229: aload 8
      //   231: ifnull +62 -> 293
      //   234: aload 8
      //   236: ldc 160
      //   238: invokeinterface 166 2 0
      //   243: checkcast 168	java/util/List
      //   246: astore 8
      //   248: aload 8
      //   250: ifnull +43 -> 293
      //   253: aload 8
      //   255: invokeinterface 171 1 0
      //   260: ifne +33 -> 293
      //   263: aload 8
      //   265: iconst_0
      //   266: invokeinterface 174 2 0
      //   271: checkcast 176	java/lang/String
      //   274: astore 8
      //   276: aload 8
      //   278: ifnull +15 -> 293
      //   281: aload_0
      //   282: aload 8
      //   284: invokestatic 179	org/vidogram/messenger/Utilities:a	(Ljava/lang/String;)Ljava/lang/Integer;
      //   287: invokevirtual 184	java/lang/Integer:intValue	()I
      //   290: putfield 54	org/vidogram/messenger/p$d:d	I
      //   293: iload 7
      //   295: istore 5
      //   297: aload_1
      //   298: ifnull +26 -> 324
      //   301: sipush 8192
      //   304: newarray byte
      //   306: astore 8
      //   308: iconst_0
      //   309: istore_2
      //   310: aload_0
      //   311: invokevirtual 90	org/vidogram/messenger/p$d:isCancelled	()Z
      //   314: istore 5
      //   316: iload 5
      //   318: ifeq +214 -> 532
      //   321: iconst_0
      //   322: istore 5
      //   324: aload_0
      //   325: getfield 48	org/vidogram/messenger/p$d:c	Ljava/io/RandomAccessFile;
      //   328: ifnull +15 -> 343
      //   331: aload_0
      //   332: getfield 48	org/vidogram/messenger/p$d:c	Ljava/io/RandomAccessFile;
      //   335: invokevirtual 187	java/io/RandomAccessFile:close	()V
      //   338: aload_0
      //   339: aconst_null
      //   340: putfield 48	org/vidogram/messenger/p$d:c	Ljava/io/RandomAccessFile;
      //   343: aload_1
      //   344: ifnull +7 -> 351
      //   347: aload_1
      //   348: invokevirtual 190	java/io/InputStream:close	()V
      //   351: iload 5
      //   353: ifeq +47 -> 400
      //   356: aload_0
      //   357: getfield 46	org/vidogram/messenger/p$d:b	Lorg/vidogram/messenger/p$a;
      //   360: getfield 145	org/vidogram/messenger/p$a:h	Ljava/io/File;
      //   363: ifnull +37 -> 400
      //   366: aload_0
      //   367: getfield 46	org/vidogram/messenger/p$d:b	Lorg/vidogram/messenger/p$a;
      //   370: getfield 145	org/vidogram/messenger/p$a:h	Ljava/io/File;
      //   373: aload_0
      //   374: getfield 46	org/vidogram/messenger/p$d:b	Lorg/vidogram/messenger/p$a;
      //   377: getfield 192	org/vidogram/messenger/p$a:g	Ljava/io/File;
      //   380: invokevirtual 198	java/io/File:renameTo	(Ljava/io/File;)Z
      //   383: ifne +17 -> 400
      //   386: aload_0
      //   387: getfield 46	org/vidogram/messenger/p$d:b	Lorg/vidogram/messenger/p$a;
      //   390: aload_0
      //   391: getfield 46	org/vidogram/messenger/p$d:b	Lorg/vidogram/messenger/p$a;
      //   394: getfield 145	org/vidogram/messenger/p$a:h	Ljava/io/File;
      //   397: putfield 192	org/vidogram/messenger/p$a:g	Ljava/io/File;
      //   400: iload 5
      //   402: invokestatic 204	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
      //   405: areturn
      //   406: astore 8
      //   408: aconst_null
      //   409: astore_1
      //   410: aload 8
      //   412: instanceof 206
      //   415: ifeq +24 -> 439
      //   418: invokestatic 211	org/vidogram/tgnet/ConnectionsManager:m	()Z
      //   421: ifeq +8 -> 429
      //   424: aload_0
      //   425: iconst_0
      //   426: putfield 50	org/vidogram/messenger/p$d:f	Z
      //   429: ldc 213
      //   431: aload 8
      //   433: invokestatic 218	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
      //   436: goto -295 -> 141
      //   439: aload 8
      //   441: instanceof 220
      //   444: ifeq +11 -> 455
      //   447: aload_0
      //   448: iconst_0
      //   449: putfield 50	org/vidogram/messenger/p$d:f	Z
      //   452: goto -23 -> 429
      //   455: aload 8
      //   457: instanceof 222
      //   460: ifeq +32 -> 492
      //   463: aload 8
      //   465: invokevirtual 226	java/lang/Throwable:getMessage	()Ljava/lang/String;
      //   468: ifnull -39 -> 429
      //   471: aload 8
      //   473: invokevirtual 226	java/lang/Throwable:getMessage	()Ljava/lang/String;
      //   476: ldc 228
      //   478: invokevirtual 232	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
      //   481: ifeq -52 -> 429
      //   484: aload_0
      //   485: iconst_0
      //   486: putfield 50	org/vidogram/messenger/p$d:f	Z
      //   489: goto -60 -> 429
      //   492: aload 8
      //   494: instanceof 234
      //   497: ifeq -68 -> 429
      //   500: aload_0
      //   501: iconst_0
      //   502: putfield 50	org/vidogram/messenger/p$d:f	Z
      //   505: goto -76 -> 429
      //   508: astore 8
      //   510: ldc 213
      //   512: aload 8
      //   514: invokestatic 218	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
      //   517: goto -311 -> 206
      //   520: astore 8
      //   522: ldc 213
      //   524: aload 8
      //   526: invokestatic 218	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
      //   529: goto -236 -> 293
      //   532: aload_1
      //   533: aload 8
      //   535: invokevirtual 238	java/io/InputStream:read	([B)I
      //   538: istore 4
      //   540: iload 4
      //   542: ifle +73 -> 615
      //   545: iload_2
      //   546: iload 4
      //   548: iadd
      //   549: istore_3
      //   550: aload_0
      //   551: getfield 48	org/vidogram/messenger/p$d:c	Ljava/io/RandomAccessFile;
      //   554: aload 8
      //   556: iconst_0
      //   557: iload 4
      //   559: invokevirtual 242	java/io/RandomAccessFile:write	([BII)V
      //   562: iload_3
      //   563: istore_2
      //   564: aload_0
      //   565: getfield 54	org/vidogram/messenger/p$d:d	I
      //   568: ifeq -258 -> 310
      //   571: aload_0
      //   572: iload_3
      //   573: i2f
      //   574: aload_0
      //   575: getfield 54	org/vidogram/messenger/p$d:d	I
      //   578: i2f
      //   579: fdiv
      //   580: invokespecial 244	org/vidogram/messenger/p$d:a	(F)V
      //   583: iload_3
      //   584: istore_2
      //   585: goto -275 -> 310
      //   588: astore 8
      //   590: iconst_0
      //   591: istore 5
      //   593: ldc 213
      //   595: aload 8
      //   597: invokestatic 218	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
      //   600: goto -276 -> 324
      //   603: astore 8
      //   605: ldc 213
      //   607: aload 8
      //   609: invokestatic 218	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
      //   612: goto -288 -> 324
      //   615: iload 4
      //   617: iconst_m1
      //   618: if_icmpne +21 -> 639
      //   621: aload_0
      //   622: getfield 54	org/vidogram/messenger/p$d:d	I
      //   625: ifeq +8 -> 633
      //   628: aload_0
      //   629: fconst_1
      //   630: invokespecial 244	org/vidogram/messenger/p$d:a	(F)V
      //   633: iconst_1
      //   634: istore 5
      //   636: goto -312 -> 324
      //   639: iconst_0
      //   640: istore 5
      //   642: goto -318 -> 324
      //   645: astore 8
      //   647: ldc 213
      //   649: aload 8
      //   651: invokestatic 218	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
      //   654: goto -311 -> 343
      //   657: astore_1
      //   658: ldc 213
      //   660: aload_1
      //   661: invokestatic 218	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
      //   664: goto -313 -> 351
      //   667: astore 8
      //   669: iload 6
      //   671: istore 5
      //   673: goto -68 -> 605
      //   676: astore 8
      //   678: iconst_1
      //   679: istore 5
      //   681: goto -76 -> 605
      //   684: astore 8
      //   686: iconst_1
      //   687: istore 5
      //   689: goto -96 -> 593
      //   692: astore 8
      //   694: goto -284 -> 410
      //   697: aconst_null
      //   698: astore_1
      //   699: goto -558 -> 141
      //
      // Exception table:
      //   from	to	target	type
      //   15	99	406	java/lang/Throwable
      //   99	121	406	java/lang/Throwable
      //   152	180	508	java/lang/Exception
      //   201	206	508	java/lang/Exception
      //   220	229	520	java/lang/Exception
      //   234	248	520	java/lang/Exception
      //   253	276	520	java/lang/Exception
      //   281	293	520	java/lang/Exception
      //   532	540	588	java/lang/Exception
      //   550	562	588	java/lang/Exception
      //   564	583	588	java/lang/Exception
      //   593	600	603	java/lang/Throwable
      //   324	343	645	java/lang/Throwable
      //   347	351	657	java/lang/Throwable
      //   301	308	667	java/lang/Throwable
      //   310	316	667	java/lang/Throwable
      //   532	540	667	java/lang/Throwable
      //   550	562	667	java/lang/Throwable
      //   564	583	667	java/lang/Throwable
      //   621	633	676	java/lang/Throwable
      //   621	633	684	java/lang/Exception
      //   121	141	692	java/lang/Throwable
    }

    protected void a(Boolean paramBoolean)
    {
      if ((paramBoolean.booleanValue()) || (!this.f))
        p.a(p.this, this.b.b, this.b.g, 0);
      while (true)
      {
        Utilities.c.b(new Runnable(paramBoolean)
        {
          public void run()
          {
            p.a(p.this).remove(p.d.a(p.d.this).b);
            a.a(new Runnable()
            {
              public void run()
              {
                if (p.d.2.this.a.booleanValue())
                {
                  y.a().a(y.az, new Object[] { p.d.a(p.d.this).b });
                  return;
                }
                y.a().a(y.aA, new Object[] { p.d.a(p.d.this).b, Integer.valueOf(2) });
              }
            });
          }
        });
        p.b(p.this).b(new Runnable()
        {
          public void run()
          {
            p.a(p.this, true);
          }
        });
        return;
        p.a(p.this, this.b.b);
      }
    }

    protected void onCancelled()
    {
      p.b(p.this).b(new Runnable()
      {
        public void run()
        {
          p.a(p.this, true);
        }
      });
      Utilities.c.b(new Runnable()
      {
        public void run()
        {
          p.a(p.this).remove(p.d.a(p.d.this).b);
          a.a(new Runnable()
          {
            public void run()
            {
              y.a().a(y.aA, new Object[] { p.d.a(p.d.this).b, Integer.valueOf(1) });
            }
          });
        }
      });
    }
  }

  private class e
  {
    private int b;
    private g.x c;
    private String d;

    private e()
    {
    }
  }

  private class f
    implements Runnable
  {
    private File b;
    private int c;
    private g.x d;
    private String e;

    public f(int paramFile, File paramx, g.x paramString, String arg5)
    {
      this.c = paramFile;
      this.b = paramx;
      this.d = paramString;
      Object localObject;
      this.e = localObject;
    }

    private void a()
    {
      if (this.d == null)
        return;
      String str = m.b(this.d);
      p.b(p.this).b(new Runnable(str)
      {
        public void run()
        {
          p.c(p.this).remove(this.a);
        }
      });
    }

    public void run()
    {
      Object localObject1 = null;
      String str;
      File localFile;
      try
      {
        if (this.d == null)
        {
          a();
          return;
        }
        str = this.d.c + "_" + this.d.d;
        localFile = new File(m.a().b(4), "q_" + str + ".jpg");
        if ((localFile.exists()) || (!this.b.exists()))
        {
          a();
          return;
        }
      }
      catch (Throwable localThrowable)
      {
        n.a("tmessages", localThrowable);
        a();
        return;
      }
      int i = Math.min(180, Math.min(a.c.x, a.c.y) / 4);
      if (this.c == 0)
        localObject2 = p.a(this.b.toString(), null, i, i, false);
      while (localObject2 == null)
      {
        a();
        return;
        if (this.c == 2)
        {
          localObject2 = ThumbnailUtils.createVideoThumbnail(this.b.toString(), 1);
          continue;
        }
        if (this.c != 3)
          continue;
        localObject2 = this.b.toString().toLowerCase();
        if ((!((String)localObject2).endsWith(".jpg")) && (!((String)localObject2).endsWith(".jpeg")) && (!((String)localObject2).endsWith(".png")) && (!((String)localObject2).endsWith(".gif")))
        {
          a();
          return;
        }
        localObject2 = p.a((String)localObject2, null, i, i, false);
      }
      int j = ((Bitmap)localObject2).getWidth();
      int k = ((Bitmap)localObject2).getHeight();
      if ((j == 0) || (k == 0))
      {
        a();
        return;
      }
      float f = Math.min(j / i, k / i);
      Bitmap localBitmap = c.a((Bitmap)localObject2, (int)(j / f), (int)(k / f), true);
      if (localBitmap != localObject2)
        ((Bitmap)localObject2).recycle();
      Object localObject2 = new FileOutputStream(localFile);
      localBitmap.compress(Bitmap.CompressFormat.JPEG, 60, (OutputStream)localObject2);
      try
      {
        ((FileOutputStream)localObject2).close();
        a.a(new Runnable(str, new BitmapDrawable(localBitmap))
        {
          public void run()
          {
            p.f.a(p.f.this);
            String str2 = this.a;
            String str1 = str2;
            if (p.f.b(p.f.this) != null)
              str1 = str2 + "@" + p.f.b(p.f.this);
            y.a().a(y.an, new Object[] { this.b, str1 });
            p.d(p.this).b(str1, this.b);
          }
        });
        return;
      }
      catch (Exception localException)
      {
        while (true)
          n.a("tmessages", localException);
      }
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.p
 * JD-Core Version:    0.6.0
 */