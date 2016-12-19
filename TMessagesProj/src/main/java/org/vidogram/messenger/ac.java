package org.vidogram.messenger;

import B;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.MimeTypeMap;
import android.widget.Toast;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel.MapMode;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import org.vidogram.tgnet.ConnectionsManager;
import org.vidogram.tgnet.b;
import org.vidogram.tgnet.c;
import org.vidogram.tgnet.f;
import org.vidogram.tgnet.g.ab;
import org.vidogram.tgnet.g.ac;
import org.vidogram.tgnet.g.ad;
import org.vidogram.tgnet.g.ah;
import org.vidogram.tgnet.g.aj;
import org.vidogram.tgnet.g.aq;
import org.vidogram.tgnet.g.ar;
import org.vidogram.tgnet.g.as;
import org.vidogram.tgnet.g.at;
import org.vidogram.tgnet.g.au;
import org.vidogram.tgnet.g.aw;
import org.vidogram.tgnet.g.az;
import org.vidogram.tgnet.g.bb;
import org.vidogram.tgnet.g.c;
import org.vidogram.tgnet.g.d;
import org.vidogram.tgnet.g.dc;
import org.vidogram.tgnet.g.dd;
import org.vidogram.tgnet.g.de;
import org.vidogram.tgnet.g.df;
import org.vidogram.tgnet.g.dg;
import org.vidogram.tgnet.g.dh;
import org.vidogram.tgnet.g.gi;
import org.vidogram.tgnet.g.gj;
import org.vidogram.tgnet.g.gk;
import org.vidogram.tgnet.g.gl;
import org.vidogram.tgnet.g.gm;
import org.vidogram.tgnet.g.gn;
import org.vidogram.tgnet.g.go;
import org.vidogram.tgnet.g.gp;
import org.vidogram.tgnet.g.gq;
import org.vidogram.tgnet.g.gr;
import org.vidogram.tgnet.g.gs;
import org.vidogram.tgnet.g.gt;
import org.vidogram.tgnet.g.gu;
import org.vidogram.tgnet.g.gv;
import org.vidogram.tgnet.g.ha;
import org.vidogram.tgnet.g.hf;
import org.vidogram.tgnet.g.hi;
import org.vidogram.tgnet.g.hs;
import org.vidogram.tgnet.g.ht;
import org.vidogram.tgnet.g.hu;
import org.vidogram.tgnet.g.hw;
import org.vidogram.tgnet.g.hx;
import org.vidogram.tgnet.g.hz;
import org.vidogram.tgnet.g.i;
import org.vidogram.tgnet.g.ia;
import org.vidogram.tgnet.g.ie;
import org.vidogram.tgnet.g.j;
import org.vidogram.tgnet.g.ja;
import org.vidogram.tgnet.g.jb;
import org.vidogram.tgnet.g.jd;
import org.vidogram.tgnet.g.kw;
import org.vidogram.tgnet.g.ky;
import org.vidogram.tgnet.g.lq;
import org.vidogram.tgnet.g.lz;
import org.vidogram.tgnet.g.mg;
import org.vidogram.tgnet.g.ne;
import org.vidogram.tgnet.g.nt;
import org.vidogram.tgnet.g.ny;
import org.vidogram.tgnet.g.oa;
import org.vidogram.tgnet.g.of;
import org.vidogram.tgnet.g.oi;
import org.vidogram.tgnet.g.pi;
import org.vidogram.tgnet.g.pk;
import org.vidogram.tgnet.g.pp;
import org.vidogram.tgnet.g.q;
import org.vidogram.tgnet.g.qw;
import org.vidogram.tgnet.g.r;
import org.vidogram.tgnet.g.rb;
import org.vidogram.tgnet.g.rc;
import org.vidogram.tgnet.g.rj;
import org.vidogram.tgnet.g.rp;
import org.vidogram.tgnet.g.rq;
import org.vidogram.tgnet.g.rs;
import org.vidogram.tgnet.g.rt;
import org.vidogram.tgnet.g.t;
import org.vidogram.tgnet.g.uj;
import org.vidogram.tgnet.g.ul;
import org.vidogram.tgnet.g.vw;
import org.vidogram.tgnet.g.wb;
import org.vidogram.tgnet.g.x;
import org.vidogram.ui.a.g;
import org.vidogram.ui.q;

public class ac
  implements y.b
{
  private static volatile ac h = null;
  private g.j a = null;
  private HashMap<String, ArrayList<a>> b = new HashMap();
  private HashMap<Integer, u> c = new HashMap();
  private HashMap<Integer, g.ar> d = new HashMap();
  private HashMap<String, u> e = new HashMap();
  private HashMap<String, u> f = new HashMap();
  private b g = new b(new ac.b.b()
  {
    public void a()
    {
      HashMap localHashMap = new HashMap(ac.a(ac.this));
      y.a().a(y.ad, new Object[] { localHashMap });
      ac.a(ac.this).clear();
    }

    public void a(Location paramLocation)
    {
      ac.a(ac.this, paramLocation);
      ac.a(ac.this).clear();
    }
  });

  public ac()
  {
    y.a().a(this, y.av);
    y.a().a(this, y.aw);
    y.a().a(this, y.aB);
    y.a().a(this, y.aC);
    y.a().a(this, y.aD);
    y.a().a(this, y.am);
    y.a().a(this, y.al);
    y.a().a(this, y.az);
    y.a().a(this, y.aA);
  }

  public static ac a()
  {
    Object localObject1 = h;
    if (localObject1 == null)
    {
      monitorenter;
      try
      {
        ac localac = h;
        localObject1 = localac;
        if (localac == null)
        {
          localObject1 = new ac();
          h = (ac)localObject1;
        }
        return localObject1;
      }
      finally
      {
        monitorexit;
      }
    }
    return (ac)localObject2;
  }

  private void a(Location paramLocation)
  {
    g.oa localoa = new g.oa();
    localoa.e = new g.jd();
    localoa.e.c = paramLocation.getLatitude();
    localoa.e.b = paramLocation.getLongitude();
    paramLocation = this.e.entrySet().iterator();
    while (paramLocation.hasNext())
    {
      u localu = (u)((Map.Entry)paramLocation.next()).getValue();
      a().a(localoa, localu.u(), localu, null, null);
    }
  }

  public static void a(String paramString, long paramLong)
  {
    w.a().c().b(new Runnable(paramString, paramLong)
    {
      public void run()
      {
        Utilities.c.b(new Runnable()
        {
          public void run()
          {
            a.a(new Runnable()
            {
              public void run()
              {
                String str1 = ac.c(ac.9.this.a);
                if (str1.length() != 0)
                {
                  int j = (int)Math.ceil(str1.length() / 4096.0F);
                  int i = 0;
                  while (i < j)
                  {
                    String str2 = str1.substring(i * 4096, Math.min((i + 1) * 4096, str1.length()));
                    ac.a().a(str2, ac.9.this.b, null, null, true, null, null, null);
                    i += 1;
                  }
                }
              }
            });
          }
        });
      }
    });
  }

  public static void a(String paramString1, long paramLong1, long paramLong2, int paramInt1, int paramInt2, af paramaf, long paramLong3, u paramu, String paramString2)
  {
    if ((paramString1 == null) || (paramString1.length() == 0))
      return;
    new Thread(new Runnable(paramLong3, paramaf, paramString1, paramLong2, paramInt2, paramInt1, paramLong1, paramString2, paramu)
    {
      public void run()
      {
        Object localObject4 = null;
        boolean bool;
        Object localObject3;
        Object localObject1;
        Object localObject5;
        Object localObject2;
        if ((int)this.a == 0)
        {
          bool = true;
          if ((this.b == null) && (!this.c.endsWith("mp4")))
            break label692;
          localObject3 = this.c;
          localObject1 = this.c;
          localObject5 = new File((String)localObject1);
          localObject2 = (String)localObject1 + ((File)localObject5).length() + "_" + ((File)localObject5).lastModified();
          localObject1 = localObject2;
          if (this.b != null)
          {
            localObject2 = (String)localObject2 + this.d + "_" + this.b.a + "_" + this.b.b;
            localObject1 = localObject2;
            if (this.b.f == this.b.d)
              localObject1 = (String)localObject2 + "_" + this.b.f;
          }
          if ((!bool) && (0 != 0))
            break label719;
          localObject4 = p.a(ThumbnailUtils.createVideoThumbnail(this.c, 1), 90.0F, 90.0F, 55, bool);
          localObject2 = new g.hs();
          ((g.hs)localObject2).i = ((g.az)localObject4);
          if (((g.hs)localObject2).i != null)
            break label554;
          ((g.hs)localObject2).i = new g.rt();
          ((g.hs)localObject2).i.b = "s";
          label279: ((g.hs)localObject2).g = "video/mp4";
          ad.a(false);
          localObject4 = new g.ie();
          ((g.hs)localObject2).o.add(localObject4);
          if (this.b == null)
            break label648;
          if (this.b.h != -1)
            break label567;
          ((g.hs)localObject2).o.add(new g.ht());
          ac.a(this.c, (g.ie)localObject4, this.b);
          localObject3 = this.b;
          localObject5 = this.b;
          int j = ((g.ie)localObject4).h;
          ((af)localObject5).f = j;
          ((af)localObject3).d = j;
          localObject3 = this.b;
          localObject5 = this.b;
          j = ((g.ie)localObject4).i;
          ((af)localObject5).g = j;
          ((af)localObject3).e = j;
          label417: ((g.hs)localObject2).h = (int)this.g;
          localObject3 = "-2147483648_" + ad.d + ".mp4";
          ad.d -= 1;
          localObject3 = new File(m.a().b(4), (String)localObject3);
          ad.a(false);
          localObject4 = ((File)localObject3).getAbsolutePath();
          localObject3 = localObject2;
          localObject2 = localObject4;
        }
        while (true)
        {
          localObject4 = new HashMap();
          ((g.hs)localObject3).n = this.h;
          if (localObject1 != null)
            ((HashMap)localObject4).put("originalPath", localObject1);
          a.a(new Runnable((g.hs)localObject3, (String)localObject2, (HashMap)localObject4)
          {
            public void run()
            {
              ac.a().a(this.a, ac.11.this.b, this.b, ac.11.this.a, ac.11.this.i, null, this.c);
            }
          });
          return;
          bool = false;
          break;
          label554: ((g.hs)localObject2).i.b = "s";
          break label279;
          label567: ((g.ie)localObject4).d = (int)(this.d / 1000L);
          if ((this.b.c == 90) || (this.b.c == 270))
          {
            ((g.ie)localObject4).h = this.e;
            ((g.ie)localObject4).i = this.f;
            break label417;
          }
          ((g.ie)localObject4).h = this.f;
          ((g.ie)localObject4).i = this.e;
          break label417;
          label648: if (((File)localObject5).exists())
            ((g.hs)localObject2).h = (int)((File)localObject5).length();
          ac.a(this.c, (g.ie)localObject4, null);
          localObject4 = localObject2;
          localObject2 = localObject3;
          localObject3 = localObject4;
          continue;
          label692: ac.a(this.c, this.c, null, null, this.a, this.i, this.h);
          return;
          label719: localObject2 = localObject3;
          localObject3 = localObject4;
        }
      }
    }).start();
  }

  public static void a(String paramString, Uri paramUri, long paramLong, u paramu, CharSequence paramCharSequence, ArrayList<g.ab> paramArrayList)
  {
    Object localObject2 = null;
    Object localObject1;
    if ((paramString != null) && (paramString.length() != 0))
    {
      localObject1 = new ArrayList();
      ((ArrayList)localObject1).add(paramString);
    }
    for (paramString = (String)localObject1; ; paramString = null)
    {
      if (paramUri != null)
      {
        localObject1 = new ArrayList();
        ((ArrayList)localObject1).add(paramUri);
      }
      for (paramUri = (Uri)localObject1; ; paramUri = null)
      {
        if (paramCharSequence != null)
        {
          localObject1 = new ArrayList();
          ((ArrayList)localObject1).add(paramCharSequence.toString());
        }
        for (paramCharSequence = (CharSequence)localObject1; ; paramCharSequence = null)
        {
          localObject1 = localObject2;
          if (paramArrayList != null)
          {
            localObject1 = localObject2;
            if (!paramArrayList.isEmpty())
            {
              localObject1 = new ArrayList();
              ((ArrayList)localObject1).add(new ArrayList(paramArrayList));
            }
          }
          a(paramString, paramUri, paramLong, paramu, paramCharSequence, (ArrayList)localObject1);
          return;
        }
      }
    }
  }

  public static void a(String paramString1, String paramString2, Uri paramUri, String paramString3, long paramLong, u paramu)
  {
    if (((paramString1 == null) || (paramString2 == null)) && (paramUri == null))
      return;
    ArrayList localArrayList2 = new ArrayList();
    ArrayList localArrayList3 = new ArrayList();
    ArrayList localArrayList1 = null;
    if (paramUri != null)
      localArrayList1 = new ArrayList();
    localArrayList2.add(paramString1);
    localArrayList3.add(paramString2);
    a(localArrayList2, localArrayList3, localArrayList1, paramString3, paramLong, paramu);
  }

  private void a(String paramString, a parama)
  {
    ArrayList localArrayList2 = (ArrayList)this.b.get(paramString);
    ArrayList localArrayList1 = localArrayList2;
    if (localArrayList2 == null)
    {
      localArrayList1 = new ArrayList();
      this.b.put(paramString, localArrayList1);
    }
    localArrayList1.add(parama);
  }

  // ERROR //
  private void a(String paramString1, g.au paramau, g.rp paramrp, af paramaf, g.vw paramvw, g.hs paramhs, g.jb paramjb, long paramLong, String paramString2, u paramu1, g.wb paramwb, boolean paramBoolean, u paramu2, ArrayList<g.at> paramArrayList, g.bb parambb, HashMap<String, String> paramHashMap)
  {
    // Byte code:
    //   0: lload 8
    //   2: lconst_0
    //   3: lcmp
    //   4: ifne +4 -> 8
    //   7: return
    //   8: aload 17
    //   10: ifnull +8526 -> 8536
    //   13: aload 17
    //   15: ldc_w 302
    //   18: invokevirtual 305	java/util/HashMap:containsKey	(Ljava/lang/Object;)Z
    //   21: ifeq +8515 -> 8536
    //   24: aload 17
    //   26: ldc_w 302
    //   29: invokevirtual 293	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   32: checkcast 245	java/lang/String
    //   35: astore 27
    //   37: aconst_null
    //   38: astore 24
    //   40: lload 8
    //   42: l2i
    //   43: istore 22
    //   45: lload 8
    //   47: bipush 32
    //   49: lshr
    //   50: l2i
    //   51: istore 21
    //   53: iconst_0
    //   54: istore 19
    //   56: iload 22
    //   58: ifeq +92 -> 150
    //   61: iload 22
    //   63: invokestatic 310	org/vidogram/messenger/v:c	(I)Lorg/vidogram/tgnet/g$aj;
    //   66: astore 28
    //   68: iload 22
    //   70: ifne +86 -> 156
    //   73: invokestatic 313	org/vidogram/messenger/v:a	()Lorg/vidogram/messenger/v;
    //   76: iload 21
    //   78: invokestatic 319	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   81: invokevirtual 322	org/vidogram/messenger/v:c	(Ljava/lang/Integer;)Lorg/vidogram/tgnet/g$t;
    //   84: astore 26
    //   86: aload 26
    //   88: ifnonnull +8445 -> 8533
    //   91: aload 14
    //   93: ifnull -86 -> 7
    //   96: invokestatic 232	org/vidogram/messenger/w:a	()Lorg/vidogram/messenger/w;
    //   99: aload 14
    //   101: getfield 325	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   104: invokevirtual 328	org/vidogram/messenger/w:a	(Lorg/vidogram/tgnet/g$ar;)V
    //   107: aload 14
    //   109: getfield 325	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   112: iconst_2
    //   113: putfield 333	org/vidogram/tgnet/g$ar:y	I
    //   116: invokestatic 130	org/vidogram/messenger/y:a	()Lorg/vidogram/messenger/y;
    //   119: getstatic 336	org/vidogram/messenger/y:j	I
    //   122: iconst_1
    //   123: anewarray 4	java/lang/Object
    //   126: dup
    //   127: iconst_0
    //   128: aload 14
    //   130: invokevirtual 339	org/vidogram/messenger/u:q	()I
    //   133: invokestatic 319	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   136: aastore
    //   137: invokevirtual 342	org/vidogram/messenger/y:a	(I[Ljava/lang/Object;)V
    //   140: aload_0
    //   141: aload 14
    //   143: invokevirtual 339	org/vidogram/messenger/u:q	()I
    //   146: invokevirtual 345	org/vidogram/messenger/ac:a	(I)V
    //   149: return
    //   150: aconst_null
    //   151: astore 28
    //   153: goto -85 -> 68
    //   156: aload 28
    //   158: instanceof 347
    //   161: ifeq +8366 -> 8527
    //   164: invokestatic 313	org/vidogram/messenger/v:a	()Lorg/vidogram/messenger/v;
    //   167: aload 28
    //   169: getfield 351	org/vidogram/tgnet/g$aj:e	I
    //   172: invokestatic 319	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   175: invokevirtual 354	org/vidogram/messenger/v:b	(Ljava/lang/Integer;)Lorg/vidogram/tgnet/g$i;
    //   178: astore 25
    //   180: aload 25
    //   182: ifnull +484 -> 666
    //   185: aload 25
    //   187: getfield 360	org/vidogram/tgnet/g$i:r	Z
    //   190: ifne +476 -> 666
    //   193: iconst_1
    //   194: istore 18
    //   196: aconst_null
    //   197: astore 26
    //   199: iload 18
    //   201: istore 19
    //   203: aload 14
    //   205: ifnull +778 -> 983
    //   208: aload 14
    //   210: getfield 325	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   213: astore 7
    //   215: aload 14
    //   217: invokevirtual 363	org/vidogram/messenger/u:S	()Z
    //   220: istore 23
    //   222: iload 23
    //   224: ifeq +448 -> 672
    //   227: iconst_4
    //   228: istore 18
    //   230: aload_3
    //   231: astore 24
    //   233: aload_1
    //   234: astore 25
    //   236: aload 7
    //   238: getfield 367	org/vidogram/tgnet/g$ar:C	J
    //   241: lconst_0
    //   242: lcmp
    //   243: ifne +12 -> 255
    //   246: aload 7
    //   248: aload_0
    //   249: invokevirtual 369	org/vidogram/messenger/ac:c	()J
    //   252: putfield 367	org/vidogram/tgnet/g$ar:C	J
    //   255: aload 17
    //   257: ifnull +65 -> 322
    //   260: aload 17
    //   262: ldc_w 371
    //   265: invokevirtual 305	java/util/HashMap:containsKey	(Ljava/lang/Object;)Z
    //   268: ifeq +54 -> 322
    //   271: aload 26
    //   273: ifnull +2362 -> 2635
    //   276: aload 7
    //   278: aload 17
    //   280: ldc_w 373
    //   283: invokevirtual 293	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   286: checkcast 245	java/lang/String
    //   289: putfield 376	org/vidogram/tgnet/g$ar:q	Ljava/lang/String;
    //   292: aload 7
    //   294: getfield 376	org/vidogram/tgnet/g$ar:q	Ljava/lang/String;
    //   297: ifnonnull +11 -> 308
    //   300: aload 7
    //   302: ldc_w 378
    //   305: putfield 376	org/vidogram/tgnet/g$ar:q	Ljava/lang/String;
    //   308: aload 7
    //   310: aload 7
    //   312: getfield 381	org/vidogram/tgnet/g$ar:k	I
    //   315: sipush 2048
    //   318: ior
    //   319: putfield 381	org/vidogram/tgnet/g$ar:k	I
    //   322: aload 7
    //   324: aload 17
    //   326: putfield 384	org/vidogram/tgnet/g$ar:B	Ljava/util/HashMap;
    //   329: aload 14
    //   331: ifnull +11 -> 342
    //   334: aload 14
    //   336: getfield 387	org/vidogram/messenger/u:t	Z
    //   339: ifne +93 -> 432
    //   342: aload 7
    //   344: invokestatic 392	org/vidogram/tgnet/ConnectionsManager:a	()Lorg/vidogram/tgnet/ConnectionsManager;
    //   347: invokevirtual 394	org/vidogram/tgnet/ConnectionsManager:b	()I
    //   350: putfield 395	org/vidogram/tgnet/g$ar:e	I
    //   353: aload 28
    //   355: instanceof 347
    //   358: ifeq +2326 -> 2684
    //   361: iload 19
    //   363: ifeq +23 -> 386
    //   366: aload 7
    //   368: iconst_1
    //   369: putfield 398	org/vidogram/tgnet/g$ar:s	I
    //   372: aload 7
    //   374: aload 7
    //   376: getfield 381	org/vidogram/tgnet/g$ar:k	I
    //   379: sipush 1024
    //   382: ior
    //   383: putfield 381	org/vidogram/tgnet/g$ar:k	I
    //   386: invokestatic 313	org/vidogram/messenger/v:a	()Lorg/vidogram/messenger/v;
    //   389: aload 28
    //   391: getfield 351	org/vidogram/tgnet/g$aj:e	I
    //   394: invokestatic 319	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   397: invokevirtual 354	org/vidogram/messenger/v:b	(Ljava/lang/Integer;)Lorg/vidogram/tgnet/g$i;
    //   400: astore_1
    //   401: aload_1
    //   402: ifnull +30 -> 432
    //   405: aload_1
    //   406: getfield 360	org/vidogram/tgnet/g$i:r	Z
    //   409: ifeq +2251 -> 2660
    //   412: aload 7
    //   414: aload 7
    //   416: getfield 381	org/vidogram/tgnet/g$ar:k	I
    //   419: ldc_w 399
    //   422: ior
    //   423: putfield 381	org/vidogram/tgnet/g$ar:k	I
    //   426: aload 7
    //   428: iconst_1
    //   429: putfield 402	org/vidogram/tgnet/g$ar:o	Z
    //   432: aload 7
    //   434: aload 7
    //   436: getfield 381	org/vidogram/tgnet/g$ar:k	I
    //   439: sipush 512
    //   442: ior
    //   443: putfield 381	org/vidogram/tgnet/g$ar:k	I
    //   446: aload 7
    //   448: lload 8
    //   450: putfield 405	org/vidogram/tgnet/g$ar:E	J
    //   453: aload 11
    //   455: ifnull +57 -> 512
    //   458: aload 26
    //   460: ifnull +2233 -> 2693
    //   463: aload 11
    //   465: getfield 325	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   468: getfield 367	org/vidogram/tgnet/g$ar:C	J
    //   471: lconst_0
    //   472: lcmp
    //   473: ifeq +2220 -> 2693
    //   476: aload 7
    //   478: aload 11
    //   480: getfield 325	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   483: getfield 367	org/vidogram/tgnet/g$ar:C	J
    //   486: putfield 407	org/vidogram/tgnet/g$ar:h	J
    //   489: aload 7
    //   491: aload 7
    //   493: getfield 381	org/vidogram/tgnet/g$ar:k	I
    //   496: bipush 8
    //   498: ior
    //   499: putfield 381	org/vidogram/tgnet/g$ar:k	I
    //   502: aload 7
    //   504: aload 11
    //   506: invokevirtual 339	org/vidogram/messenger/u:q	()I
    //   509: putfield 409	org/vidogram/tgnet/g$ar:g	I
    //   512: aload 16
    //   514: ifnull +28 -> 542
    //   517: aload 26
    //   519: ifnonnull +23 -> 542
    //   522: aload 7
    //   524: aload 7
    //   526: getfield 381	org/vidogram/tgnet/g$ar:k	I
    //   529: bipush 64
    //   531: ior
    //   532: putfield 381	org/vidogram/tgnet/g$ar:k	I
    //   535: aload 7
    //   537: aload 16
    //   539: putfield 412	org/vidogram/tgnet/g$ar:r	Lorg/vidogram/tgnet/g$bb;
    //   542: iload 22
    //   544: ifeq +2646 -> 3190
    //   547: iload 21
    //   549: iconst_1
    //   550: if_icmpne +2583 -> 3133
    //   553: aload_0
    //   554: getfield 104	org/vidogram/messenger/ac:a	Lorg/vidogram/tgnet/g$j;
    //   557: ifnonnull +2152 -> 2709
    //   560: invokestatic 232	org/vidogram/messenger/w:a	()Lorg/vidogram/messenger/w;
    //   563: aload 7
    //   565: invokevirtual 328	org/vidogram/messenger/w:a	(Lorg/vidogram/tgnet/g$ar;)V
    //   568: invokestatic 130	org/vidogram/messenger/y:a	()Lorg/vidogram/messenger/y;
    //   571: getstatic 336	org/vidogram/messenger/y:j	I
    //   574: iconst_1
    //   575: anewarray 4	java/lang/Object
    //   578: dup
    //   579: iconst_0
    //   580: aload 7
    //   582: getfield 414	org/vidogram/tgnet/g$ar:b	I
    //   585: invokestatic 319	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   588: aastore
    //   589: invokevirtual 342	org/vidogram/messenger/y:a	(I[Ljava/lang/Object;)V
    //   592: aload_0
    //   593: aload 7
    //   595: getfield 414	org/vidogram/tgnet/g$ar:b	I
    //   598: invokevirtual 345	org/vidogram/messenger/ac:a	(I)V
    //   601: return
    //   602: astore_1
    //   603: aconst_null
    //   604: astore_3
    //   605: aload 7
    //   607: astore_2
    //   608: ldc_w 416
    //   611: aload_1
    //   612: invokestatic 421	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   615: invokestatic 232	org/vidogram/messenger/w:a	()Lorg/vidogram/messenger/w;
    //   618: aload_2
    //   619: invokevirtual 328	org/vidogram/messenger/w:a	(Lorg/vidogram/tgnet/g$ar;)V
    //   622: aload_3
    //   623: ifnull +11 -> 634
    //   626: aload_3
    //   627: getfield 325	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   630: iconst_2
    //   631: putfield 333	org/vidogram/tgnet/g$ar:y	I
    //   634: invokestatic 130	org/vidogram/messenger/y:a	()Lorg/vidogram/messenger/y;
    //   637: getstatic 336	org/vidogram/messenger/y:j	I
    //   640: iconst_1
    //   641: anewarray 4	java/lang/Object
    //   644: dup
    //   645: iconst_0
    //   646: aload_2
    //   647: getfield 414	org/vidogram/tgnet/g$ar:b	I
    //   650: invokestatic 319	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   653: aastore
    //   654: invokevirtual 342	org/vidogram/messenger/y:a	(I[Ljava/lang/Object;)V
    //   657: aload_0
    //   658: aload_2
    //   659: getfield 414	org/vidogram/tgnet/g$ar:b	I
    //   662: invokevirtual 345	org/vidogram/messenger/ac:a	(I)V
    //   665: return
    //   666: iconst_0
    //   667: istore 18
    //   669: goto -473 -> 196
    //   672: aload 14
    //   674: getfield 423	org/vidogram/messenger/u:f	I
    //   677: ifne +58 -> 735
    //   680: aload 14
    //   682: getfield 325	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   685: getfield 426	org/vidogram/tgnet/g$ar:j	Lorg/vidogram/tgnet/g$au;
    //   688: instanceof 428
    //   691: ifeq +35 -> 726
    //   694: goto +7848 -> 8542
    //   697: aload 17
    //   699: ifnull +7813 -> 8512
    //   702: aload 17
    //   704: ldc_w 430
    //   707: invokevirtual 305	java/util/HashMap:containsKey	(Ljava/lang/Object;)Z
    //   710: ifeq +7802 -> 8512
    //   713: bipush 9
    //   715: istore 18
    //   717: aload_1
    //   718: astore 25
    //   720: aload_3
    //   721: astore 24
    //   723: goto -487 -> 236
    //   726: aload 7
    //   728: getfield 433	org/vidogram/tgnet/g$ar:i	Ljava/lang/String;
    //   731: astore_1
    //   732: goto +7810 -> 8542
    //   735: aload 14
    //   737: getfield 423	org/vidogram/messenger/u:f	I
    //   740: iconst_4
    //   741: if_icmpne +15 -> 756
    //   744: aload 7
    //   746: getfield 426	org/vidogram/tgnet/g$ar:j	Lorg/vidogram/tgnet/g$au;
    //   749: astore_2
    //   750: iconst_1
    //   751: istore 18
    //   753: goto -56 -> 697
    //   756: aload 14
    //   758: getfield 423	org/vidogram/messenger/u:f	I
    //   761: iconst_1
    //   762: if_icmpne +21 -> 783
    //   765: aload 7
    //   767: getfield 426	org/vidogram/tgnet/g$ar:j	Lorg/vidogram/tgnet/g$au;
    //   770: getfield 438	org/vidogram/tgnet/g$au:d	Lorg/vidogram/tgnet/g$ay;
    //   773: checkcast 440	org/vidogram/tgnet/g$rp
    //   776: astore_3
    //   777: iconst_2
    //   778: istore 18
    //   780: goto -83 -> 697
    //   783: aload 14
    //   785: getfield 423	org/vidogram/messenger/u:f	I
    //   788: iconst_3
    //   789: if_icmpeq +8 -> 797
    //   792: aload 4
    //   794: ifnull +22 -> 816
    //   797: aload 7
    //   799: getfield 426	org/vidogram/tgnet/g$ar:j	Lorg/vidogram/tgnet/g$au;
    //   802: getfield 443	org/vidogram/tgnet/g$au:k	Lorg/vidogram/tgnet/g$q;
    //   805: checkcast 445	org/vidogram/tgnet/g$hs
    //   808: astore 6
    //   810: iconst_3
    //   811: istore 18
    //   813: goto -116 -> 697
    //   816: aload 14
    //   818: getfield 423	org/vidogram/messenger/u:f	I
    //   821: bipush 12
    //   823: if_icmpne +71 -> 894
    //   826: new 447	org/vidogram/tgnet/g$uv
    //   829: dup
    //   830: invokespecial 448	org/vidogram/tgnet/g$uv:<init>	()V
    //   833: astore 5
    //   835: aload 5
    //   837: aload 7
    //   839: getfield 426	org/vidogram/tgnet/g$ar:j	Lorg/vidogram/tgnet/g$au;
    //   842: getfield 451	org/vidogram/tgnet/g$au:n	Ljava/lang/String;
    //   845: putfield 454	org/vidogram/tgnet/g$vw:i	Ljava/lang/String;
    //   848: aload 5
    //   850: aload 7
    //   852: getfield 426	org/vidogram/tgnet/g$ar:j	Lorg/vidogram/tgnet/g$au;
    //   855: getfield 456	org/vidogram/tgnet/g$au:o	Ljava/lang/String;
    //   858: putfield 458	org/vidogram/tgnet/g$vw:e	Ljava/lang/String;
    //   861: aload 5
    //   863: aload 7
    //   865: getfield 426	org/vidogram/tgnet/g$ar:j	Lorg/vidogram/tgnet/g$au;
    //   868: getfield 461	org/vidogram/tgnet/g$au:p	Ljava/lang/String;
    //   871: putfield 463	org/vidogram/tgnet/g$vw:f	Ljava/lang/String;
    //   874: aload 5
    //   876: aload 7
    //   878: getfield 426	org/vidogram/tgnet/g$ar:j	Lorg/vidogram/tgnet/g$au;
    //   881: getfield 465	org/vidogram/tgnet/g$au:q	I
    //   884: putfield 467	org/vidogram/tgnet/g$vw:d	I
    //   887: bipush 6
    //   889: istore 18
    //   891: goto -194 -> 697
    //   894: aload 14
    //   896: getfield 423	org/vidogram/messenger/u:f	I
    //   899: bipush 8
    //   901: if_icmpeq +33 -> 934
    //   904: aload 14
    //   906: getfield 423	org/vidogram/messenger/u:f	I
    //   909: bipush 9
    //   911: if_icmpeq +23 -> 934
    //   914: aload 14
    //   916: getfield 423	org/vidogram/messenger/u:f	I
    //   919: bipush 13
    //   921: if_icmpeq +13 -> 934
    //   924: aload 14
    //   926: getfield 423	org/vidogram/messenger/u:f	I
    //   929: bipush 14
    //   931: if_icmpne +23 -> 954
    //   934: aload 7
    //   936: getfield 426	org/vidogram/tgnet/g$ar:j	Lorg/vidogram/tgnet/g$au;
    //   939: getfield 443	org/vidogram/tgnet/g$au:k	Lorg/vidogram/tgnet/g$q;
    //   942: checkcast 445	org/vidogram/tgnet/g$hs
    //   945: astore 6
    //   947: bipush 7
    //   949: istore 18
    //   951: goto -254 -> 697
    //   954: aload 14
    //   956: getfield 423	org/vidogram/messenger/u:f	I
    //   959: iconst_2
    //   960: if_icmpne +7561 -> 8521
    //   963: aload 7
    //   965: getfield 426	org/vidogram/tgnet/g$ar:j	Lorg/vidogram/tgnet/g$au;
    //   968: getfield 443	org/vidogram/tgnet/g$au:k	Lorg/vidogram/tgnet/g$q;
    //   971: checkcast 445	org/vidogram/tgnet/g$hs
    //   974: astore 6
    //   976: bipush 8
    //   978: istore 18
    //   980: goto -283 -> 697
    //   983: aload_1
    //   984: ifnull +354 -> 1338
    //   987: aload 26
    //   989: ifnull +283 -> 1272
    //   992: aload 26
    //   994: getfield 471	org/vidogram/tgnet/g$t:o	I
    //   997: invokestatic 476	org/vidogram/messenger/a:c	(I)I
    //   1000: bipush 17
    //   1002: if_icmplt +270 -> 1272
    //   1005: new 478	org/vidogram/tgnet/g$ov
    //   1008: dup
    //   1009: invokespecial 479	org/vidogram/tgnet/g$ov:<init>	()V
    //   1012: astore 7
    //   1014: aload 15
    //   1016: ifnull +26 -> 1042
    //   1019: aload 7
    //   1021: astore 24
    //   1023: aload 15
    //   1025: invokevirtual 276	java/util/ArrayList:isEmpty	()Z
    //   1028: ifne +14 -> 1042
    //   1031: aload 7
    //   1033: astore 24
    //   1035: aload 7
    //   1037: aload 15
    //   1039: putfield 482	org/vidogram/tgnet/g$ar:p	Ljava/util/ArrayList;
    //   1042: aload 12
    //   1044: astore 25
    //   1046: aload 26
    //   1048: ifnull +58 -> 1106
    //   1051: aload 12
    //   1053: astore 25
    //   1055: aload 7
    //   1057: astore 24
    //   1059: aload 12
    //   1061: instanceof 484
    //   1064: ifeq +42 -> 1106
    //   1067: aload 7
    //   1069: astore 24
    //   1071: aload 12
    //   1073: getfield 487	org/vidogram/tgnet/g$wb:e	Ljava/lang/String;
    //   1076: ifnull +208 -> 1284
    //   1079: aload 7
    //   1081: astore 24
    //   1083: new 489	org/vidogram/tgnet/g$vs
    //   1086: dup
    //   1087: invokespecial 490	org/vidogram/tgnet/g$vs:<init>	()V
    //   1090: astore 25
    //   1092: aload 7
    //   1094: astore 24
    //   1096: aload 25
    //   1098: aload 12
    //   1100: getfield 487	org/vidogram/tgnet/g$wb:e	Ljava/lang/String;
    //   1103: putfield 487	org/vidogram/tgnet/g$wb:e	Ljava/lang/String;
    //   1106: aload 25
    //   1108: ifnonnull +182 -> 1290
    //   1111: aload 7
    //   1113: astore 24
    //   1115: aload 7
    //   1117: new 492	org/vidogram/tgnet/g$ny
    //   1120: dup
    //   1121: invokespecial 493	org/vidogram/tgnet/g$ny:<init>	()V
    //   1124: putfield 426	org/vidogram/tgnet/g$ar:j	Lorg/vidogram/tgnet/g$au;
    //   1127: aload 17
    //   1129: ifnull +203 -> 1332
    //   1132: aload 7
    //   1134: astore 24
    //   1136: aload 17
    //   1138: ldc_w 430
    //   1141: invokevirtual 305	java/util/HashMap:containsKey	(Ljava/lang/Object;)Z
    //   1144: ifeq +188 -> 1332
    //   1147: bipush 9
    //   1149: istore 18
    //   1151: aload 7
    //   1153: astore 24
    //   1155: aload 7
    //   1157: aload_1
    //   1158: putfield 433	org/vidogram/tgnet/g$ar:i	Ljava/lang/String;
    //   1161: aload 25
    //   1163: astore 12
    //   1165: aload 7
    //   1167: astore 24
    //   1169: aload 7
    //   1171: getfield 496	org/vidogram/tgnet/g$ar:A	Ljava/lang/String;
    //   1174: ifnonnull +15 -> 1189
    //   1177: aload 7
    //   1179: astore 24
    //   1181: aload 7
    //   1183: ldc_w 378
    //   1186: putfield 496	org/vidogram/tgnet/g$ar:A	Ljava/lang/String;
    //   1189: aload 7
    //   1191: astore 24
    //   1193: invokestatic 500	org/vidogram/messenger/ad:a	()I
    //   1196: istore 20
    //   1198: aload 7
    //   1200: astore 24
    //   1202: aload 7
    //   1204: iload 20
    //   1206: putfield 414	org/vidogram/tgnet/g$ar:b	I
    //   1209: aload 7
    //   1211: astore 24
    //   1213: aload 7
    //   1215: iload 20
    //   1217: putfield 502	org/vidogram/tgnet/g$ar:D	I
    //   1220: aload 7
    //   1222: astore 24
    //   1224: aload 7
    //   1226: iconst_1
    //   1227: putfield 504	org/vidogram/tgnet/g$ar:n	Z
    //   1230: iload 19
    //   1232: ifeq +1370 -> 2602
    //   1235: aload 28
    //   1237: ifnull +1365 -> 2602
    //   1240: aload 7
    //   1242: astore 24
    //   1244: aload 7
    //   1246: aload 28
    //   1248: getfield 351	org/vidogram/tgnet/g$aj:e	I
    //   1251: ineg
    //   1252: putfield 506	org/vidogram/tgnet/g$ar:c	I
    //   1255: aload 7
    //   1257: astore 24
    //   1259: iconst_0
    //   1260: invokestatic 509	org/vidogram/messenger/ad:a	(Z)V
    //   1263: aload_1
    //   1264: astore 25
    //   1266: aload_3
    //   1267: astore 24
    //   1269: goto -1033 -> 236
    //   1272: new 511	org/vidogram/tgnet/g$mg
    //   1275: dup
    //   1276: invokespecial 512	org/vidogram/tgnet/g$mg:<init>	()V
    //   1279: astore 7
    //   1281: goto -267 -> 1014
    //   1284: aconst_null
    //   1285: astore 25
    //   1287: goto -181 -> 1106
    //   1290: aload 7
    //   1292: astore 24
    //   1294: aload 7
    //   1296: new 514	org/vidogram/tgnet/g$oi
    //   1299: dup
    //   1300: invokespecial 515	org/vidogram/tgnet/g$oi:<init>	()V
    //   1303: putfield 426	org/vidogram/tgnet/g$ar:j	Lorg/vidogram/tgnet/g$au;
    //   1306: aload 7
    //   1308: astore 24
    //   1310: aload 7
    //   1312: getfield 426	org/vidogram/tgnet/g$ar:j	Lorg/vidogram/tgnet/g$au;
    //   1315: aload 25
    //   1317: putfield 518	org/vidogram/tgnet/g$au:r	Lorg/vidogram/tgnet/g$wb;
    //   1320: goto -193 -> 1127
    //   1323: astore_1
    //   1324: aconst_null
    //   1325: astore_3
    //   1326: aload 24
    //   1328: astore_2
    //   1329: goto -721 -> 608
    //   1332: iconst_0
    //   1333: istore 18
    //   1335: goto -184 -> 1151
    //   1338: aload_2
    //   1339: ifnull +95 -> 1434
    //   1342: aload 26
    //   1344: ifnull +78 -> 1422
    //   1347: aload 26
    //   1349: getfield 471	org/vidogram/tgnet/g$t:o	I
    //   1352: invokestatic 476	org/vidogram/messenger/a:c	(I)I
    //   1355: bipush 17
    //   1357: if_icmplt +65 -> 1422
    //   1360: new 478	org/vidogram/tgnet/g$ov
    //   1363: dup
    //   1364: invokespecial 479	org/vidogram/tgnet/g$ov:<init>	()V
    //   1367: astore 7
    //   1369: aload 7
    //   1371: astore 24
    //   1373: aload 7
    //   1375: aload_2
    //   1376: putfield 426	org/vidogram/tgnet/g$ar:j	Lorg/vidogram/tgnet/g$au;
    //   1379: aload 7
    //   1381: astore 24
    //   1383: aload 7
    //   1385: ldc_w 378
    //   1388: putfield 433	org/vidogram/tgnet/g$ar:i	Ljava/lang/String;
    //   1391: aload 17
    //   1393: ifnull +7155 -> 8548
    //   1396: aload 7
    //   1398: astore 24
    //   1400: aload 17
    //   1402: ldc_w 430
    //   1405: invokevirtual 305	java/util/HashMap:containsKey	(Ljava/lang/Object;)Z
    //   1408: istore 23
    //   1410: iload 23
    //   1412: ifeq +7136 -> 8548
    //   1415: bipush 9
    //   1417: istore 18
    //   1419: goto -254 -> 1165
    //   1422: new 511	org/vidogram/tgnet/g$mg
    //   1425: dup
    //   1426: invokespecial 512	org/vidogram/tgnet/g$mg:<init>	()V
    //   1429: astore 7
    //   1431: goto -62 -> 1369
    //   1434: aload_3
    //   1435: ifnull +245 -> 1680
    //   1438: aload 26
    //   1440: ifnull +179 -> 1619
    //   1443: aload 26
    //   1445: getfield 471	org/vidogram/tgnet/g$t:o	I
    //   1448: invokestatic 476	org/vidogram/messenger/a:c	(I)I
    //   1451: bipush 17
    //   1453: if_icmplt +166 -> 1619
    //   1456: new 478	org/vidogram/tgnet/g$ov
    //   1459: dup
    //   1460: invokespecial 479	org/vidogram/tgnet/g$ov:<init>	()V
    //   1463: astore 7
    //   1465: aload 7
    //   1467: astore 24
    //   1469: aload 7
    //   1471: new 520	org/vidogram/tgnet/g$ob
    //   1474: dup
    //   1475: invokespecial 521	org/vidogram/tgnet/g$ob:<init>	()V
    //   1478: putfield 426	org/vidogram/tgnet/g$ar:j	Lorg/vidogram/tgnet/g$au;
    //   1481: aload 7
    //   1483: astore 24
    //   1485: aload 7
    //   1487: getfield 426	org/vidogram/tgnet/g$ar:j	Lorg/vidogram/tgnet/g$au;
    //   1490: astore 29
    //   1492: aload 7
    //   1494: astore 24
    //   1496: aload_3
    //   1497: getfield 522	org/vidogram/tgnet/g$rp:f	Ljava/lang/String;
    //   1500: ifnull +131 -> 1631
    //   1503: aload 7
    //   1505: astore 24
    //   1507: aload_3
    //   1508: getfield 522	org/vidogram/tgnet/g$rp:f	Ljava/lang/String;
    //   1511: astore 25
    //   1513: aload 7
    //   1515: astore 24
    //   1517: aload 29
    //   1519: aload 25
    //   1521: putfield 525	org/vidogram/tgnet/g$au:l	Ljava/lang/String;
    //   1524: aload 7
    //   1526: astore 24
    //   1528: aload 7
    //   1530: getfield 426	org/vidogram/tgnet/g$ar:j	Lorg/vidogram/tgnet/g$au;
    //   1533: aload_3
    //   1534: putfield 438	org/vidogram/tgnet/g$au:d	Lorg/vidogram/tgnet/g$ay;
    //   1537: aload 17
    //   1539: ifnull +7015 -> 8554
    //   1542: aload 7
    //   1544: astore 24
    //   1546: aload 17
    //   1548: ldc_w 430
    //   1551: invokevirtual 305	java/util/HashMap:containsKey	(Ljava/lang/Object;)Z
    //   1554: ifeq +7000 -> 8554
    //   1557: bipush 9
    //   1559: istore 18
    //   1561: aload 7
    //   1563: astore 24
    //   1565: aload 7
    //   1567: ldc_w 527
    //   1570: putfield 433	org/vidogram/tgnet/g$ar:i	Ljava/lang/String;
    //   1573: aload 10
    //   1575: ifnull +64 -> 1639
    //   1578: aload 7
    //   1580: astore 24
    //   1582: aload 10
    //   1584: invokevirtual 249	java/lang/String:length	()I
    //   1587: ifle +52 -> 1639
    //   1590: aload 7
    //   1592: astore 24
    //   1594: aload 10
    //   1596: ldc_w 529
    //   1599: invokevirtual 533	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   1602: ifeq +37 -> 1639
    //   1605: aload 7
    //   1607: astore 24
    //   1609: aload 7
    //   1611: aload 10
    //   1613: putfield 496	org/vidogram/tgnet/g$ar:A	Ljava/lang/String;
    //   1616: goto -451 -> 1165
    //   1619: new 511	org/vidogram/tgnet/g$mg
    //   1622: dup
    //   1623: invokespecial 512	org/vidogram/tgnet/g$mg:<init>	()V
    //   1626: astore 7
    //   1628: goto -163 -> 1465
    //   1631: ldc_w 378
    //   1634: astore 25
    //   1636: goto -123 -> 1513
    //   1639: aload 7
    //   1641: astore 24
    //   1643: aload 7
    //   1645: aload_3
    //   1646: getfield 535	org/vidogram/tgnet/g$rp:h	Ljava/util/ArrayList;
    //   1649: aload_3
    //   1650: getfield 535	org/vidogram/tgnet/g$rp:h	Ljava/util/ArrayList;
    //   1653: invokevirtual 538	java/util/ArrayList:size	()I
    //   1656: iconst_1
    //   1657: isub
    //   1658: invokevirtual 541	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   1661: checkcast 543	org/vidogram/tgnet/g$az
    //   1664: getfield 546	org/vidogram/tgnet/g$az:c	Lorg/vidogram/tgnet/g$x;
    //   1667: iconst_1
    //   1668: invokestatic 551	org/vidogram/messenger/m:a	(Lorg/vidogram/tgnet/f;Z)Ljava/io/File;
    //   1671: invokevirtual 554	java/io/File:toString	()Ljava/lang/String;
    //   1674: putfield 496	org/vidogram/tgnet/g$ar:A	Ljava/lang/String;
    //   1677: goto -512 -> 1165
    //   1680: aload 7
    //   1682: ifnull +84 -> 1766
    //   1685: new 511	org/vidogram/tgnet/g$mg
    //   1688: dup
    //   1689: invokespecial 512	org/vidogram/tgnet/g$mg:<init>	()V
    //   1692: astore 24
    //   1694: aload 24
    //   1696: new 428	org/vidogram/tgnet/g$nz
    //   1699: dup
    //   1700: invokespecial 555	org/vidogram/tgnet/g$nz:<init>	()V
    //   1703: putfield 426	org/vidogram/tgnet/g$ar:j	Lorg/vidogram/tgnet/g$au;
    //   1706: aload 24
    //   1708: getfield 426	org/vidogram/tgnet/g$ar:j	Lorg/vidogram/tgnet/g$au;
    //   1711: ldc_w 378
    //   1714: putfield 525	org/vidogram/tgnet/g$au:l	Ljava/lang/String;
    //   1717: aload 24
    //   1719: getfield 426	org/vidogram/tgnet/g$ar:j	Lorg/vidogram/tgnet/g$au;
    //   1722: aload 7
    //   1724: putfield 559	org/vidogram/tgnet/g$au:m	Lorg/vidogram/tgnet/g$jb;
    //   1727: aload 24
    //   1729: ldc_w 378
    //   1732: putfield 433	org/vidogram/tgnet/g$ar:i	Ljava/lang/String;
    //   1735: aload 17
    //   1737: ifnull +6765 -> 8502
    //   1740: aload 17
    //   1742: ldc_w 430
    //   1745: invokevirtual 305	java/util/HashMap:containsKey	(Ljava/lang/Object;)Z
    //   1748: istore 23
    //   1750: iload 23
    //   1752: ifeq +6750 -> 8502
    //   1755: bipush 9
    //   1757: istore 18
    //   1759: aload 24
    //   1761: astore 7
    //   1763: goto -598 -> 1165
    //   1766: aload 5
    //   1768: ifnull +253 -> 2021
    //   1771: aload 26
    //   1773: ifnull +236 -> 2009
    //   1776: aload 26
    //   1778: getfield 471	org/vidogram/tgnet/g$t:o	I
    //   1781: invokestatic 476	org/vidogram/messenger/a:c	(I)I
    //   1784: bipush 17
    //   1786: if_icmplt +223 -> 2009
    //   1789: new 478	org/vidogram/tgnet/g$ov
    //   1792: dup
    //   1793: invokespecial 479	org/vidogram/tgnet/g$ov:<init>	()V
    //   1796: astore 7
    //   1798: aload 7
    //   1800: astore 24
    //   1802: aload 7
    //   1804: new 561	org/vidogram/tgnet/g$nv
    //   1807: dup
    //   1808: invokespecial 562	org/vidogram/tgnet/g$nv:<init>	()V
    //   1811: putfield 426	org/vidogram/tgnet/g$ar:j	Lorg/vidogram/tgnet/g$au;
    //   1814: aload 7
    //   1816: astore 24
    //   1818: aload 7
    //   1820: getfield 426	org/vidogram/tgnet/g$ar:j	Lorg/vidogram/tgnet/g$au;
    //   1823: aload 5
    //   1825: getfield 454	org/vidogram/tgnet/g$vw:i	Ljava/lang/String;
    //   1828: putfield 451	org/vidogram/tgnet/g$au:n	Ljava/lang/String;
    //   1831: aload 7
    //   1833: astore 24
    //   1835: aload 7
    //   1837: getfield 426	org/vidogram/tgnet/g$ar:j	Lorg/vidogram/tgnet/g$au;
    //   1840: aload 5
    //   1842: getfield 458	org/vidogram/tgnet/g$vw:e	Ljava/lang/String;
    //   1845: putfield 456	org/vidogram/tgnet/g$au:o	Ljava/lang/String;
    //   1848: aload 7
    //   1850: astore 24
    //   1852: aload 7
    //   1854: getfield 426	org/vidogram/tgnet/g$ar:j	Lorg/vidogram/tgnet/g$au;
    //   1857: aload 5
    //   1859: getfield 463	org/vidogram/tgnet/g$vw:f	Ljava/lang/String;
    //   1862: putfield 461	org/vidogram/tgnet/g$au:p	Ljava/lang/String;
    //   1865: aload 7
    //   1867: astore 24
    //   1869: aload 7
    //   1871: getfield 426	org/vidogram/tgnet/g$ar:j	Lorg/vidogram/tgnet/g$au;
    //   1874: aload 5
    //   1876: getfield 467	org/vidogram/tgnet/g$vw:d	I
    //   1879: putfield 465	org/vidogram/tgnet/g$au:q	I
    //   1882: aload 7
    //   1884: astore 24
    //   1886: aload 7
    //   1888: getfield 426	org/vidogram/tgnet/g$ar:j	Lorg/vidogram/tgnet/g$au;
    //   1891: getfield 456	org/vidogram/tgnet/g$au:o	Ljava/lang/String;
    //   1894: ifnonnull +30 -> 1924
    //   1897: aload 7
    //   1899: astore 24
    //   1901: aload 7
    //   1903: getfield 426	org/vidogram/tgnet/g$ar:j	Lorg/vidogram/tgnet/g$au;
    //   1906: ldc_w 378
    //   1909: putfield 456	org/vidogram/tgnet/g$au:o	Ljava/lang/String;
    //   1912: aload 7
    //   1914: astore 24
    //   1916: aload 5
    //   1918: ldc_w 378
    //   1921: putfield 458	org/vidogram/tgnet/g$vw:e	Ljava/lang/String;
    //   1924: aload 7
    //   1926: astore 24
    //   1928: aload 7
    //   1930: getfield 426	org/vidogram/tgnet/g$ar:j	Lorg/vidogram/tgnet/g$au;
    //   1933: getfield 461	org/vidogram/tgnet/g$au:p	Ljava/lang/String;
    //   1936: ifnonnull +30 -> 1966
    //   1939: aload 7
    //   1941: astore 24
    //   1943: aload 7
    //   1945: getfield 426	org/vidogram/tgnet/g$ar:j	Lorg/vidogram/tgnet/g$au;
    //   1948: ldc_w 378
    //   1951: putfield 461	org/vidogram/tgnet/g$au:p	Ljava/lang/String;
    //   1954: aload 7
    //   1956: astore 24
    //   1958: aload 5
    //   1960: ldc_w 378
    //   1963: putfield 463	org/vidogram/tgnet/g$vw:f	Ljava/lang/String;
    //   1966: aload 7
    //   1968: astore 24
    //   1970: aload 7
    //   1972: ldc_w 378
    //   1975: putfield 433	org/vidogram/tgnet/g$ar:i	Ljava/lang/String;
    //   1978: aload 17
    //   1980: ifnull +6580 -> 8560
    //   1983: aload 7
    //   1985: astore 24
    //   1987: aload 17
    //   1989: ldc_w 430
    //   1992: invokevirtual 305	java/util/HashMap:containsKey	(Ljava/lang/Object;)Z
    //   1995: istore 23
    //   1997: iload 23
    //   1999: ifeq +6561 -> 8560
    //   2002: bipush 9
    //   2004: istore 18
    //   2006: goto -841 -> 1165
    //   2009: new 511	org/vidogram/tgnet/g$mg
    //   2012: dup
    //   2013: invokespecial 512	org/vidogram/tgnet/g$mg:<init>	()V
    //   2016: astore 7
    //   2018: goto -220 -> 1798
    //   2021: aload 6
    //   2023: ifnull +6469 -> 8492
    //   2026: aload 26
    //   2028: ifnull +310 -> 2338
    //   2031: aload 26
    //   2033: getfield 471	org/vidogram/tgnet/g$t:o	I
    //   2036: invokestatic 476	org/vidogram/messenger/a:c	(I)I
    //   2039: bipush 17
    //   2041: if_icmplt +297 -> 2338
    //   2044: new 478	org/vidogram/tgnet/g$ov
    //   2047: dup
    //   2048: invokespecial 479	org/vidogram/tgnet/g$ov:<init>	()V
    //   2051: astore 7
    //   2053: aload 7
    //   2055: astore 24
    //   2057: aload 7
    //   2059: new 564	org/vidogram/tgnet/g$nw
    //   2062: dup
    //   2063: invokespecial 565	org/vidogram/tgnet/g$nw:<init>	()V
    //   2066: putfield 426	org/vidogram/tgnet/g$ar:j	Lorg/vidogram/tgnet/g$au;
    //   2069: aload 7
    //   2071: astore 24
    //   2073: aload 7
    //   2075: getfield 426	org/vidogram/tgnet/g$ar:j	Lorg/vidogram/tgnet/g$au;
    //   2078: astore 29
    //   2080: aload 7
    //   2082: astore 24
    //   2084: aload 6
    //   2086: getfield 566	org/vidogram/tgnet/g$hs:n	Ljava/lang/String;
    //   2089: ifnull +261 -> 2350
    //   2092: aload 7
    //   2094: astore 24
    //   2096: aload 6
    //   2098: getfield 566	org/vidogram/tgnet/g$hs:n	Ljava/lang/String;
    //   2101: astore 25
    //   2103: aload 7
    //   2105: astore 24
    //   2107: aload 29
    //   2109: aload 25
    //   2111: putfield 525	org/vidogram/tgnet/g$au:l	Ljava/lang/String;
    //   2114: aload 7
    //   2116: astore 24
    //   2118: aload 7
    //   2120: getfield 426	org/vidogram/tgnet/g$ar:j	Lorg/vidogram/tgnet/g$au;
    //   2123: aload 6
    //   2125: putfield 443	org/vidogram/tgnet/g$au:k	Lorg/vidogram/tgnet/g$q;
    //   2128: aload 17
    //   2130: ifnull +228 -> 2358
    //   2133: aload 7
    //   2135: astore 24
    //   2137: aload 17
    //   2139: ldc_w 430
    //   2142: invokevirtual 305	java/util/HashMap:containsKey	(Ljava/lang/Object;)Z
    //   2145: ifeq +213 -> 2358
    //   2148: bipush 9
    //   2150: istore 18
    //   2152: aload 4
    //   2154: ifnonnull +243 -> 2397
    //   2157: aload 7
    //   2159: astore 24
    //   2161: aload 7
    //   2163: ldc_w 527
    //   2166: putfield 433	org/vidogram/tgnet/g$ar:i	Ljava/lang/String;
    //   2169: aload 26
    //   2171: ifnull +243 -> 2414
    //   2174: aload 7
    //   2176: astore 24
    //   2178: aload 6
    //   2180: getfield 567	org/vidogram/tgnet/g$hs:k	I
    //   2183: ifle +231 -> 2414
    //   2186: aload 7
    //   2188: astore 24
    //   2190: aload 6
    //   2192: invokestatic 570	org/vidogram/messenger/u:c	(Lorg/vidogram/tgnet/g$q;)Z
    //   2195: ifne +219 -> 2414
    //   2198: aload 7
    //   2200: astore 24
    //   2202: aload 7
    //   2204: aload 6
    //   2206: invokestatic 573	org/vidogram/messenger/m:a	(Lorg/vidogram/tgnet/f;)Ljava/io/File;
    //   2209: invokevirtual 554	java/io/File:toString	()Ljava/lang/String;
    //   2212: putfield 496	org/vidogram/tgnet/g$ar:A	Ljava/lang/String;
    //   2215: aload 26
    //   2217: ifnull +6272 -> 8489
    //   2220: aload 7
    //   2222: astore 24
    //   2224: aload 6
    //   2226: invokestatic 570	org/vidogram/messenger/u:c	(Lorg/vidogram/tgnet/g$q;)Z
    //   2229: ifeq +6260 -> 8489
    //   2232: iconst_0
    //   2233: istore 20
    //   2235: aload 7
    //   2237: astore 24
    //   2239: iload 20
    //   2241: aload 6
    //   2243: getfield 575	org/vidogram/tgnet/g$hs:o	Ljava/util/ArrayList;
    //   2246: invokevirtual 538	java/util/ArrayList:size	()I
    //   2249: if_icmpge +6240 -> 8489
    //   2252: aload 7
    //   2254: astore 24
    //   2256: aload 6
    //   2258: getfield 575	org/vidogram/tgnet/g$hs:o	Ljava/util/ArrayList;
    //   2261: iload 20
    //   2263: invokevirtual 541	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   2266: checkcast 577	org/vidogram/tgnet/g$r
    //   2269: astore 29
    //   2271: aload 7
    //   2273: astore 24
    //   2275: aload 29
    //   2277: instanceof 579
    //   2280: ifeq +6303 -> 8583
    //   2283: aload 7
    //   2285: astore 24
    //   2287: aload 26
    //   2289: getfield 471	org/vidogram/tgnet/g$t:o	I
    //   2292: invokestatic 476	org/vidogram/messenger/a:c	(I)I
    //   2295: bipush 46
    //   2297: if_icmpge +131 -> 2428
    //   2300: aload 7
    //   2302: astore 24
    //   2304: aload 6
    //   2306: getfield 575	org/vidogram/tgnet/g$hs:o	Ljava/util/ArrayList;
    //   2309: iload 20
    //   2311: invokevirtual 582	java/util/ArrayList:remove	(I)Ljava/lang/Object;
    //   2314: pop
    //   2315: aload 7
    //   2317: astore 24
    //   2319: aload 6
    //   2321: getfield 575	org/vidogram/tgnet/g$hs:o	Ljava/util/ArrayList;
    //   2324: new 584	org/vidogram/tgnet/g$ic
    //   2327: dup
    //   2328: invokespecial 585	org/vidogram/tgnet/g$ic:<init>	()V
    //   2331: invokevirtual 267	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   2334: pop
    //   2335: goto -1170 -> 1165
    //   2338: new 511	org/vidogram/tgnet/g$mg
    //   2341: dup
    //   2342: invokespecial 512	org/vidogram/tgnet/g$mg:<init>	()V
    //   2345: astore 7
    //   2347: goto -294 -> 2053
    //   2350: ldc_w 378
    //   2353: astore 25
    //   2355: goto -252 -> 2103
    //   2358: aload 7
    //   2360: astore 24
    //   2362: aload 6
    //   2364: invokestatic 587	org/vidogram/messenger/u:g	(Lorg/vidogram/tgnet/g$q;)Z
    //   2367: ifne +6200 -> 8567
    //   2370: aload 4
    //   2372: ifnull +6 -> 2378
    //   2375: goto +6192 -> 8567
    //   2378: aload 7
    //   2380: astore 24
    //   2382: aload 6
    //   2384: invokestatic 589	org/vidogram/messenger/u:e	(Lorg/vidogram/tgnet/g$q;)Z
    //   2387: ifeq +6186 -> 8573
    //   2390: bipush 8
    //   2392: istore 18
    //   2394: goto -242 -> 2152
    //   2397: aload 7
    //   2399: astore 24
    //   2401: aload 7
    //   2403: aload 4
    //   2405: invokevirtual 593	org/vidogram/messenger/af:a	()Ljava/lang/String;
    //   2408: putfield 433	org/vidogram/tgnet/g$ar:i	Ljava/lang/String;
    //   2411: goto -242 -> 2169
    //   2414: aload 7
    //   2416: astore 24
    //   2418: aload 7
    //   2420: aload 10
    //   2422: putfield 496	org/vidogram/tgnet/g$ar:A	Ljava/lang/String;
    //   2425: goto -210 -> 2215
    //   2428: aload 7
    //   2430: astore 24
    //   2432: aload 6
    //   2434: getfield 575	org/vidogram/tgnet/g$hs:o	Ljava/util/ArrayList;
    //   2437: iload 20
    //   2439: invokevirtual 582	java/util/ArrayList:remove	(I)Ljava/lang/Object;
    //   2442: pop
    //   2443: aload 7
    //   2445: astore 24
    //   2447: new 595	org/vidogram/tgnet/g$ib
    //   2450: dup
    //   2451: invokespecial 596	org/vidogram/tgnet/g$ib:<init>	()V
    //   2454: astore 25
    //   2456: aload 7
    //   2458: astore 24
    //   2460: aload 6
    //   2462: getfield 575	org/vidogram/tgnet/g$hs:o	Ljava/util/ArrayList;
    //   2465: aload 25
    //   2467: invokevirtual 267	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   2470: pop
    //   2471: aload 7
    //   2473: astore 24
    //   2475: aload 25
    //   2477: aload 29
    //   2479: getfield 598	org/vidogram/tgnet/g$r:b	Ljava/lang/String;
    //   2482: putfield 599	org/vidogram/tgnet/g$ib:b	Ljava/lang/String;
    //   2485: aload 7
    //   2487: astore 24
    //   2489: aload 29
    //   2491: getfield 602	org/vidogram/tgnet/g$r:c	Lorg/vidogram/tgnet/g$an;
    //   2494: ifnull +89 -> 2583
    //   2497: aload 7
    //   2499: astore 24
    //   2501: aload 29
    //   2503: getfield 602	org/vidogram/tgnet/g$r:c	Lorg/vidogram/tgnet/g$an;
    //   2506: getfield 606	org/vidogram/tgnet/g$an:b	J
    //   2509: invokestatic 611	org/vidogram/messenger/d/g:d	(J)Ljava/lang/String;
    //   2512: astore 29
    //   2514: aload 29
    //   2516: ifnull +48 -> 2564
    //   2519: aload 7
    //   2521: astore 24
    //   2523: aload 29
    //   2525: invokevirtual 249	java/lang/String:length	()I
    //   2528: ifle +36 -> 2564
    //   2531: aload 7
    //   2533: astore 24
    //   2535: aload 25
    //   2537: new 613	org/vidogram/tgnet/g$ls
    //   2540: dup
    //   2541: invokespecial 614	org/vidogram/tgnet/g$ls:<init>	()V
    //   2544: putfield 615	org/vidogram/tgnet/g$ib:c	Lorg/vidogram/tgnet/g$an;
    //   2547: aload 7
    //   2549: astore 24
    //   2551: aload 25
    //   2553: getfield 615	org/vidogram/tgnet/g$ib:c	Lorg/vidogram/tgnet/g$an;
    //   2556: aload 29
    //   2558: putfield 617	org/vidogram/tgnet/g$an:d	Ljava/lang/String;
    //   2561: goto +6019 -> 8580
    //   2564: aload 7
    //   2566: astore 24
    //   2568: aload 25
    //   2570: new 619	org/vidogram/tgnet/g$lq
    //   2573: dup
    //   2574: invokespecial 620	org/vidogram/tgnet/g$lq:<init>	()V
    //   2577: putfield 615	org/vidogram/tgnet/g$ib:c	Lorg/vidogram/tgnet/g$an;
    //   2580: goto +6000 -> 8580
    //   2583: aload 7
    //   2585: astore 24
    //   2587: aload 25
    //   2589: new 619	org/vidogram/tgnet/g$lq
    //   2592: dup
    //   2593: invokespecial 620	org/vidogram/tgnet/g$lq:<init>	()V
    //   2596: putfield 615	org/vidogram/tgnet/g$ib:c	Lorg/vidogram/tgnet/g$an;
    //   2599: goto +5981 -> 8580
    //   2602: aload 7
    //   2604: astore 24
    //   2606: aload 7
    //   2608: invokestatic 622	org/vidogram/messenger/ad:c	()I
    //   2611: putfield 506	org/vidogram/tgnet/g$ar:c	I
    //   2614: aload 7
    //   2616: astore 24
    //   2618: aload 7
    //   2620: aload 7
    //   2622: getfield 381	org/vidogram/tgnet/g$ar:k	I
    //   2625: sipush 256
    //   2628: ior
    //   2629: putfield 381	org/vidogram/tgnet/g$ar:k	I
    //   2632: goto -1377 -> 1255
    //   2635: aload 7
    //   2637: aload 17
    //   2639: ldc_w 371
    //   2642: invokevirtual 293	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   2645: checkcast 245	java/lang/String
    //   2648: invokestatic 627	org/vidogram/messenger/Utilities:a	(Ljava/lang/String;)Ljava/lang/Integer;
    //   2651: invokevirtual 630	java/lang/Integer:intValue	()I
    //   2654: putfield 633	org/vidogram/tgnet/g$ar:x	I
    //   2657: goto -2349 -> 308
    //   2660: aload 7
    //   2662: iconst_1
    //   2663: putfield 636	org/vidogram/tgnet/g$ar:v	Z
    //   2666: aload_1
    //   2667: getfield 638	org/vidogram/tgnet/g$i:y	Z
    //   2670: ifeq -2238 -> 432
    //   2673: aload 7
    //   2675: invokestatic 622	org/vidogram/messenger/ad:c	()I
    //   2678: putfield 506	org/vidogram/tgnet/g$ar:c	I
    //   2681: goto -2249 -> 432
    //   2684: aload 7
    //   2686: iconst_1
    //   2687: putfield 402	org/vidogram/tgnet/g$ar:o	Z
    //   2690: goto -2258 -> 432
    //   2693: aload 7
    //   2695: aload 7
    //   2697: getfield 381	org/vidogram/tgnet/g$ar:k	I
    //   2700: bipush 8
    //   2702: ior
    //   2703: putfield 381	org/vidogram/tgnet/g$ar:k	I
    //   2706: goto -2204 -> 502
    //   2709: new 262	java/util/ArrayList
    //   2712: dup
    //   2713: invokespecial 263	java/util/ArrayList:<init>	()V
    //   2716: astore_3
    //   2717: aload_0
    //   2718: getfield 104	org/vidogram/messenger/ac:a	Lorg/vidogram/tgnet/g$j;
    //   2721: getfield 643	org/vidogram/tgnet/g$j:t	Lorg/vidogram/tgnet/g$l;
    //   2724: getfield 647	org/vidogram/tgnet/g$l:e	Ljava/util/ArrayList;
    //   2727: invokevirtual 648	java/util/ArrayList:iterator	()Ljava/util/Iterator;
    //   2730: astore_1
    //   2731: aload_1
    //   2732: invokeinterface 206 1 0
    //   2737: ifeq +48 -> 2785
    //   2740: aload_1
    //   2741: invokeinterface 210 1 0
    //   2746: checkcast 650	org/vidogram/tgnet/g$k
    //   2749: astore 16
    //   2751: invokestatic 313	org/vidogram/messenger/v:a	()Lorg/vidogram/messenger/v;
    //   2754: aload 16
    //   2756: getfield 651	org/vidogram/tgnet/g$k:b	I
    //   2759: invokestatic 319	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   2762: invokevirtual 654	org/vidogram/messenger/v:a	(Ljava/lang/Integer;)Lorg/vidogram/tgnet/g$vw;
    //   2765: invokestatic 657	org/vidogram/messenger/v:a	(Lorg/vidogram/tgnet/g$vw;)Lorg/vidogram/tgnet/g$ap;
    //   2768: astore 16
    //   2770: aload 16
    //   2772: ifnull -41 -> 2731
    //   2775: aload_3
    //   2776: aload 16
    //   2778: invokevirtual 267	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   2781: pop
    //   2782: goto -51 -> 2731
    //   2785: aload 7
    //   2787: new 659	org/vidogram/tgnet/g$rk
    //   2790: dup
    //   2791: invokespecial 660	org/vidogram/tgnet/g$rk:<init>	()V
    //   2794: putfield 663	org/vidogram/tgnet/g$ar:d	Lorg/vidogram/tgnet/g$aw;
    //   2797: aload 7
    //   2799: getfield 663	org/vidogram/tgnet/g$ar:d	Lorg/vidogram/tgnet/g$aw;
    //   2802: iload 22
    //   2804: putfield 666	org/vidogram/tgnet/g$aw:d	I
    //   2807: aload 26
    //   2809: ifnull +16 -> 2825
    //   2812: aload 26
    //   2814: getfield 471	org/vidogram/tgnet/g$t:o	I
    //   2817: invokestatic 476	org/vidogram/messenger/a:c	(I)I
    //   2820: bipush 46
    //   2822: if_icmplt +34 -> 2856
    //   2825: iload 21
    //   2827: iconst_1
    //   2828: if_icmpeq +28 -> 2856
    //   2831: aload 7
    //   2833: invokestatic 669	org/vidogram/messenger/u:i	(Lorg/vidogram/tgnet/g$ar;)Z
    //   2836: ifeq +20 -> 2856
    //   2839: aload 7
    //   2841: getfield 663	org/vidogram/tgnet/g$ar:d	Lorg/vidogram/tgnet/g$aw;
    //   2844: getfield 670	org/vidogram/tgnet/g$aw:b	I
    //   2847: ifne +9 -> 2856
    //   2850: aload 7
    //   2852: iconst_1
    //   2853: putfield 672	org/vidogram/tgnet/g$ar:m	Z
    //   2856: aload 7
    //   2858: iconst_1
    //   2859: putfield 333	org/vidogram/tgnet/g$ar:y	I
    //   2862: new 217	org/vidogram/messenger/u
    //   2865: dup
    //   2866: aload 7
    //   2868: aconst_null
    //   2869: iconst_1
    //   2870: invokespecial 675	org/vidogram/messenger/u:<init>	(Lorg/vidogram/tgnet/g$ar;Ljava/util/AbstractMap;Z)V
    //   2873: astore 16
    //   2875: aload 16
    //   2877: aload 11
    //   2879: putfield 678	org/vidogram/messenger/u:e	Lorg/vidogram/messenger/u;
    //   2882: aload 16
    //   2884: invokevirtual 363	org/vidogram/messenger/u:S	()Z
    //   2887: ifne +34 -> 2921
    //   2890: aload 16
    //   2892: getfield 423	org/vidogram/messenger/u:f	I
    //   2895: iconst_3
    //   2896: if_icmpeq +8 -> 2904
    //   2899: aload 4
    //   2901: ifnull +20 -> 2921
    //   2904: aload 7
    //   2906: getfield 496	org/vidogram/tgnet/g$ar:A	Ljava/lang/String;
    //   2909: invokestatic 683	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   2912: ifne +9 -> 2921
    //   2915: aload 16
    //   2917: iconst_1
    //   2918: putfield 684	org/vidogram/messenger/u:r	Z
    //   2921: new 262	java/util/ArrayList
    //   2924: dup
    //   2925: invokespecial 263	java/util/ArrayList:<init>	()V
    //   2928: astore_1
    //   2929: aload_1
    //   2930: aload 16
    //   2932: invokevirtual 267	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   2935: pop
    //   2936: new 262	java/util/ArrayList
    //   2939: dup
    //   2940: invokespecial 263	java/util/ArrayList:<init>	()V
    //   2943: astore 29
    //   2945: aload 29
    //   2947: aload 7
    //   2949: invokevirtual 267	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   2952: pop
    //   2953: invokestatic 232	org/vidogram/messenger/w:a	()Lorg/vidogram/messenger/w;
    //   2956: aload 29
    //   2958: iconst_0
    //   2959: iconst_1
    //   2960: iconst_0
    //   2961: iconst_0
    //   2962: invokevirtual 687	org/vidogram/messenger/w:a	(Ljava/util/ArrayList;ZZZI)V
    //   2965: invokestatic 313	org/vidogram/messenger/v:a	()Lorg/vidogram/messenger/v;
    //   2968: lload 8
    //   2970: aload_1
    //   2971: invokevirtual 690	org/vidogram/messenger/v:a	(JLjava/util/ArrayList;)V
    //   2974: invokestatic 130	org/vidogram/messenger/y:a	()Lorg/vidogram/messenger/y;
    //   2977: getstatic 691	org/vidogram/messenger/y:c	I
    //   2980: iconst_0
    //   2981: anewarray 4	java/lang/Object
    //   2984: invokevirtual 342	org/vidogram/messenger/y:a	(I[Ljava/lang/Object;)V
    //   2987: getstatic 695	org/vidogram/messenger/d:a	Z
    //   2990: ifeq +5602 -> 8592
    //   2993: aload 28
    //   2995: ifnull +5597 -> 8592
    //   2998: ldc_w 416
    //   3001: new 697	java/lang/StringBuilder
    //   3004: dup
    //   3005: invokespecial 698	java/lang/StringBuilder:<init>	()V
    //   3008: ldc_w 700
    //   3011: invokevirtual 704	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3014: aload 28
    //   3016: getfield 705	org/vidogram/tgnet/g$aj:b	I
    //   3019: invokevirtual 708	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   3022: ldc_w 710
    //   3025: invokevirtual 704	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3028: aload 28
    //   3030: getfield 711	org/vidogram/tgnet/g$aj:d	I
    //   3033: invokevirtual 708	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   3036: ldc_w 713
    //   3039: invokevirtual 704	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3042: aload 28
    //   3044: getfield 351	org/vidogram/tgnet/g$aj:e	I
    //   3047: invokevirtual 708	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   3050: ldc_w 715
    //   3053: invokevirtual 704	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3056: aload 28
    //   3058: getfield 717	org/vidogram/tgnet/g$aj:c	J
    //   3061: invokevirtual 720	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   3064: invokevirtual 721	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   3067: invokestatic 724	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   3070: goto +5522 -> 8592
    //   3073: aload 26
    //   3075: ifnonnull +579 -> 3654
    //   3078: aload_3
    //   3079: ifnull +396 -> 3475
    //   3082: new 726	org/vidogram/tgnet/g$qw
    //   3085: dup
    //   3086: invokespecial 727	org/vidogram/tgnet/g$qw:<init>	()V
    //   3089: astore_1
    //   3090: new 262	java/util/ArrayList
    //   3093: dup
    //   3094: invokespecial 263	java/util/ArrayList:<init>	()V
    //   3097: astore_2
    //   3098: iconst_0
    //   3099: istore 18
    //   3101: iload 18
    //   3103: aload_3
    //   3104: invokevirtual 538	java/util/ArrayList:size	()I
    //   3107: if_icmpge +332 -> 3439
    //   3110: aload_2
    //   3111: getstatic 730	org/vidogram/messenger/Utilities:b	Ljava/security/SecureRandom;
    //   3114: invokevirtual 735	java/security/SecureRandom:nextLong	()J
    //   3117: invokestatic 740	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   3120: invokevirtual 267	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   3123: pop
    //   3124: iload 18
    //   3126: iconst_1
    //   3127: iadd
    //   3128: istore 18
    //   3130: goto -29 -> 3101
    //   3133: aload 7
    //   3135: iload 22
    //   3137: invokestatic 743	org/vidogram/messenger/v:d	(I)Lorg/vidogram/tgnet/g$aw;
    //   3140: putfield 663	org/vidogram/tgnet/g$ar:d	Lorg/vidogram/tgnet/g$aw;
    //   3143: iload 22
    //   3145: ifle +280 -> 3425
    //   3148: invokestatic 313	org/vidogram/messenger/v:a	()Lorg/vidogram/messenger/v;
    //   3151: iload 22
    //   3153: invokestatic 319	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   3156: invokevirtual 654	org/vidogram/messenger/v:a	(Ljava/lang/Integer;)Lorg/vidogram/tgnet/g$vw;
    //   3159: astore_1
    //   3160: aload_1
    //   3161: ifnonnull +13 -> 3174
    //   3164: aload_0
    //   3165: aload 7
    //   3167: getfield 414	org/vidogram/tgnet/g$ar:b	I
    //   3170: invokevirtual 345	org/vidogram/messenger/ac:a	(I)V
    //   3173: return
    //   3174: aload_1
    //   3175: getfield 744	org/vidogram/tgnet/g$vw:r	Z
    //   3178: ifeq +5439 -> 8617
    //   3181: aload 7
    //   3183: iconst_0
    //   3184: putfield 402	org/vidogram/tgnet/g$ar:o	Z
    //   3187: goto +5430 -> 8617
    //   3190: aload 7
    //   3192: new 746	org/vidogram/tgnet/g$ro
    //   3195: dup
    //   3196: invokespecial 747	org/vidogram/tgnet/g$ro:<init>	()V
    //   3199: putfield 663	org/vidogram/tgnet/g$ar:d	Lorg/vidogram/tgnet/g$aw;
    //   3202: aload 26
    //   3204: getfield 748	org/vidogram/tgnet/g$t:f	I
    //   3207: invokestatic 622	org/vidogram/messenger/ad:c	()I
    //   3210: if_icmpne +119 -> 3329
    //   3213: aload 7
    //   3215: getfield 663	org/vidogram/tgnet/g$ar:d	Lorg/vidogram/tgnet/g$aw;
    //   3218: aload 26
    //   3220: getfield 749	org/vidogram/tgnet/g$t:e	I
    //   3223: putfield 750	org/vidogram/tgnet/g$aw:c	I
    //   3226: aload 7
    //   3228: aload 26
    //   3230: getfield 752	org/vidogram/tgnet/g$t:n	I
    //   3233: putfield 755	org/vidogram/tgnet/g$ar:F	I
    //   3236: aload 7
    //   3238: getfield 755	org/vidogram/tgnet/g$ar:F	I
    //   3241: ifeq +184 -> 3425
    //   3244: aload 7
    //   3246: invokestatic 669	org/vidogram/messenger/u:i	(Lorg/vidogram/tgnet/g$ar;)Z
    //   3249: ifeq +96 -> 3345
    //   3252: iconst_0
    //   3253: istore 19
    //   3255: iload 19
    //   3257: aload 7
    //   3259: getfield 426	org/vidogram/tgnet/g$ar:j	Lorg/vidogram/tgnet/g$au;
    //   3262: getfield 443	org/vidogram/tgnet/g$au:k	Lorg/vidogram/tgnet/g$q;
    //   3265: getfield 758	org/vidogram/tgnet/g$q:o	Ljava/util/ArrayList;
    //   3268: invokevirtual 538	java/util/ArrayList:size	()I
    //   3271: if_icmpge +5212 -> 8483
    //   3274: aload 7
    //   3276: getfield 426	org/vidogram/tgnet/g$ar:j	Lorg/vidogram/tgnet/g$au;
    //   3279: getfield 443	org/vidogram/tgnet/g$au:k	Lorg/vidogram/tgnet/g$q;
    //   3282: getfield 758	org/vidogram/tgnet/g$q:o	Ljava/util/ArrayList;
    //   3285: iload 19
    //   3287: invokevirtual 541	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   3290: checkcast 577	org/vidogram/tgnet/g$r
    //   3293: astore_1
    //   3294: aload_1
    //   3295: instanceof 760
    //   3298: ifeq +5324 -> 8622
    //   3301: aload_1
    //   3302: getfield 761	org/vidogram/tgnet/g$r:d	I
    //   3305: istore 19
    //   3307: aload 7
    //   3309: aload 26
    //   3311: getfield 752	org/vidogram/tgnet/g$t:n	I
    //   3314: iload 19
    //   3316: iconst_1
    //   3317: iadd
    //   3318: invokestatic 767	java/lang/Math:max	(II)I
    //   3321: putfield 755	org/vidogram/tgnet/g$ar:F	I
    //   3324: aconst_null
    //   3325: astore_3
    //   3326: goto -519 -> 2807
    //   3329: aload 7
    //   3331: getfield 663	org/vidogram/tgnet/g$ar:d	Lorg/vidogram/tgnet/g$aw;
    //   3334: aload 26
    //   3336: getfield 748	org/vidogram/tgnet/g$t:f	I
    //   3339: putfield 750	org/vidogram/tgnet/g$aw:c	I
    //   3342: goto -116 -> 3226
    //   3345: aload 7
    //   3347: invokestatic 769	org/vidogram/messenger/u:j	(Lorg/vidogram/tgnet/g$ar;)Z
    //   3350: ifeq +75 -> 3425
    //   3353: iconst_0
    //   3354: istore 19
    //   3356: iload 19
    //   3358: aload 7
    //   3360: getfield 426	org/vidogram/tgnet/g$ar:j	Lorg/vidogram/tgnet/g$au;
    //   3363: getfield 443	org/vidogram/tgnet/g$au:k	Lorg/vidogram/tgnet/g$q;
    //   3366: getfield 758	org/vidogram/tgnet/g$q:o	Ljava/util/ArrayList;
    //   3369: invokevirtual 538	java/util/ArrayList:size	()I
    //   3372: if_icmpge +5105 -> 8477
    //   3375: aload 7
    //   3377: getfield 426	org/vidogram/tgnet/g$ar:j	Lorg/vidogram/tgnet/g$au;
    //   3380: getfield 443	org/vidogram/tgnet/g$au:k	Lorg/vidogram/tgnet/g$q;
    //   3383: getfield 758	org/vidogram/tgnet/g$q:o	Ljava/util/ArrayList;
    //   3386: iload 19
    //   3388: invokevirtual 541	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   3391: checkcast 577	org/vidogram/tgnet/g$r
    //   3394: astore_1
    //   3395: aload_1
    //   3396: instanceof 771
    //   3399: ifeq +31 -> 3430
    //   3402: aload_1
    //   3403: getfield 761	org/vidogram/tgnet/g$r:d	I
    //   3406: istore 19
    //   3408: aload 7
    //   3410: aload 26
    //   3412: getfield 752	org/vidogram/tgnet/g$t:n	I
    //   3415: iload 19
    //   3417: iconst_1
    //   3418: iadd
    //   3419: invokestatic 767	java/lang/Math:max	(II)I
    //   3422: putfield 755	org/vidogram/tgnet/g$ar:F	I
    //   3425: aconst_null
    //   3426: astore_3
    //   3427: goto -620 -> 2807
    //   3430: iload 19
    //   3432: iconst_1
    //   3433: iadd
    //   3434: istore 19
    //   3436: goto -80 -> 3356
    //   3439: aload_1
    //   3440: aload 25
    //   3442: putfield 772	org/vidogram/tgnet/g$qw:e	Ljava/lang/String;
    //   3445: aload_1
    //   3446: aload_3
    //   3447: putfield 774	org/vidogram/tgnet/g$qw:c	Ljava/util/ArrayList;
    //   3450: aload_1
    //   3451: new 776	org/vidogram/tgnet/g$kd
    //   3454: dup
    //   3455: invokespecial 777	org/vidogram/tgnet/g$kd:<init>	()V
    //   3458: putfield 780	org/vidogram/tgnet/g$qw:f	Lorg/vidogram/tgnet/g$ah;
    //   3461: aload_1
    //   3462: aload_2
    //   3463: putfield 782	org/vidogram/tgnet/g$qw:d	Ljava/util/ArrayList;
    //   3466: aload_0
    //   3467: aload_1
    //   3468: aload 16
    //   3470: aconst_null
    //   3471: invokespecial 785	org/vidogram/messenger/ac:a	(Lorg/vidogram/tgnet/f;Lorg/vidogram/messenger/u;Ljava/lang/String;)V
    //   3474: return
    //   3475: new 787	org/vidogram/tgnet/g$rc
    //   3478: dup
    //   3479: invokespecial 788	org/vidogram/tgnet/g$rc:<init>	()V
    //   3482: astore_1
    //   3483: aload_1
    //   3484: aload 25
    //   3486: putfield 790	org/vidogram/tgnet/g$rc:j	Ljava/lang/String;
    //   3489: aload 14
    //   3491: ifnonnull +5150 -> 8641
    //   3494: iconst_1
    //   3495: istore 23
    //   3497: aload_1
    //   3498: iload 23
    //   3500: putfield 792	org/vidogram/tgnet/g$rc:g	Z
    //   3503: aload 7
    //   3505: getfield 663	org/vidogram/tgnet/g$ar:d	Lorg/vidogram/tgnet/g$aw;
    //   3508: instanceof 794
    //   3511: ifeq +44 -> 3555
    //   3514: aload_1
    //   3515: getstatic 799	org/vidogram/messenger/ApplicationLoader:a	Landroid/content/Context;
    //   3518: ldc_w 801
    //   3521: iconst_0
    //   3522: invokevirtual 807	android/content/Context:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   3525: new 697	java/lang/StringBuilder
    //   3528: dup
    //   3529: invokespecial 698	java/lang/StringBuilder:<init>	()V
    //   3532: ldc_w 809
    //   3535: invokevirtual 704	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3538: lload 8
    //   3540: invokevirtual 720	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   3543: invokevirtual 721	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   3546: iconst_0
    //   3547: invokeinterface 815 3 0
    //   3552: putfield 817	org/vidogram/tgnet/g$rc:e	Z
    //   3555: aload_1
    //   3556: aload 28
    //   3558: putfield 820	org/vidogram/tgnet/g$rc:h	Lorg/vidogram/tgnet/g$aj;
    //   3561: aload_1
    //   3562: aload 7
    //   3564: getfield 367	org/vidogram/tgnet/g$ar:C	J
    //   3567: putfield 822	org/vidogram/tgnet/g$rc:k	J
    //   3570: aload 11
    //   3572: ifnull +22 -> 3594
    //   3575: aload_1
    //   3576: aload_1
    //   3577: getfield 823	org/vidogram/tgnet/g$rc:c	I
    //   3580: iconst_1
    //   3581: ior
    //   3582: putfield 823	org/vidogram/tgnet/g$rc:c	I
    //   3585: aload_1
    //   3586: aload 11
    //   3588: invokevirtual 339	org/vidogram/messenger/u:q	()I
    //   3591: putfield 825	org/vidogram/tgnet/g$rc:i	I
    //   3594: iload 13
    //   3596: ifne +8 -> 3604
    //   3599: aload_1
    //   3600: iconst_1
    //   3601: putfield 827	org/vidogram/tgnet/g$rc:d	Z
    //   3604: aload 15
    //   3606: ifnull +28 -> 3634
    //   3609: aload 15
    //   3611: invokevirtual 276	java/util/ArrayList:isEmpty	()Z
    //   3614: ifne +20 -> 3634
    //   3617: aload_1
    //   3618: aload 15
    //   3620: putfield 829	org/vidogram/tgnet/g$rc:m	Ljava/util/ArrayList;
    //   3623: aload_1
    //   3624: aload_1
    //   3625: getfield 823	org/vidogram/tgnet/g$rc:c	I
    //   3628: bipush 8
    //   3630: ior
    //   3631: putfield 823	org/vidogram/tgnet/g$rc:c	I
    //   3634: aload_0
    //   3635: aload_1
    //   3636: aload 16
    //   3638: aconst_null
    //   3639: invokespecial 785	org/vidogram/messenger/ac:a	(Lorg/vidogram/tgnet/f;Lorg/vidogram/messenger/u;Ljava/lang/String;)V
    //   3642: aload 14
    //   3644: ifnonnull -3637 -> 7
    //   3647: lload 8
    //   3649: iconst_0
    //   3650: invokestatic 834	org/vidogram/messenger/d/b:a	(JZ)V
    //   3653: return
    //   3654: aload 26
    //   3656: getfield 471	org/vidogram/tgnet/g$t:o	I
    //   3659: invokestatic 476	org/vidogram/messenger/a:c	(I)I
    //   3662: bipush 46
    //   3664: if_icmplt +234 -> 3898
    //   3667: new 836	org/vidogram/tgnet/g$gi
    //   3670: dup
    //   3671: invokespecial 837	org/vidogram/tgnet/g$gi:<init>	()V
    //   3674: astore_2
    //   3675: aload_2
    //   3676: aload 7
    //   3678: getfield 755	org/vidogram/tgnet/g$ar:F	I
    //   3681: putfield 838	org/vidogram/tgnet/g$gi:c	I
    //   3684: aload 15
    //   3686: ifnull +29 -> 3715
    //   3689: aload 15
    //   3691: invokevirtual 276	java/util/ArrayList:isEmpty	()Z
    //   3694: ifne +21 -> 3715
    //   3697: aload_2
    //   3698: aload 15
    //   3700: putfield 840	org/vidogram/tgnet/g$gi:i	Ljava/util/ArrayList;
    //   3703: aload_2
    //   3704: aload_2
    //   3705: getfield 842	org/vidogram/tgnet/g$gi:h	I
    //   3708: sipush 128
    //   3711: ior
    //   3712: putfield 842	org/vidogram/tgnet/g$gi:h	I
    //   3715: aload_2
    //   3716: astore_1
    //   3717: aload 11
    //   3719: ifnull +43 -> 3762
    //   3722: aload_2
    //   3723: astore_1
    //   3724: aload 11
    //   3726: getfield 325	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   3729: getfield 367	org/vidogram/tgnet/g$ar:C	J
    //   3732: lconst_0
    //   3733: lcmp
    //   3734: ifeq +28 -> 3762
    //   3737: aload_2
    //   3738: aload 11
    //   3740: getfield 325	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   3743: getfield 367	org/vidogram/tgnet/g$ar:C	J
    //   3746: putfield 843	org/vidogram/tgnet/g$gi:k	J
    //   3749: aload_2
    //   3750: aload_2
    //   3751: getfield 842	org/vidogram/tgnet/g$gi:h	I
    //   3754: bipush 8
    //   3756: ior
    //   3757: putfield 842	org/vidogram/tgnet/g$gi:h	I
    //   3760: aload_2
    //   3761: astore_1
    //   3762: aload 17
    //   3764: ifnull +41 -> 3805
    //   3767: aload 17
    //   3769: ldc_w 373
    //   3772: invokevirtual 293	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   3775: ifnull +30 -> 3805
    //   3778: aload_1
    //   3779: aload 17
    //   3781: ldc_w 373
    //   3784: invokevirtual 293	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   3787: checkcast 245	java/lang/String
    //   3790: putfield 844	org/vidogram/tgnet/g$gi:j	Ljava/lang/String;
    //   3793: aload_1
    //   3794: aload_1
    //   3795: getfield 842	org/vidogram/tgnet/g$gi:h	I
    //   3798: sipush 2048
    //   3801: ior
    //   3802: putfield 842	org/vidogram/tgnet/g$gi:h	I
    //   3805: aload_1
    //   3806: aload 7
    //   3808: getfield 367	org/vidogram/tgnet/g$ar:C	J
    //   3811: putfield 845	org/vidogram/tgnet/g$gi:b	J
    //   3814: aload_1
    //   3815: aload 25
    //   3817: putfield 846	org/vidogram/tgnet/g$gi:d	Ljava/lang/String;
    //   3820: aload 12
    //   3822: ifnull +138 -> 3960
    //   3825: aload 12
    //   3827: getfield 487	org/vidogram/tgnet/g$wb:e	Ljava/lang/String;
    //   3830: ifnull +130 -> 3960
    //   3833: aload_1
    //   3834: new 848	org/vidogram/tgnet/g$hl
    //   3837: dup
    //   3838: invokespecial 849	org/vidogram/tgnet/g$hl:<init>	()V
    //   3841: putfield 852	org/vidogram/tgnet/g$gi:e	Lorg/vidogram/tgnet/g$p;
    //   3844: aload_1
    //   3845: getfield 852	org/vidogram/tgnet/g$gi:e	Lorg/vidogram/tgnet/g$p;
    //   3848: aload 12
    //   3850: getfield 487	org/vidogram/tgnet/g$wb:e	Ljava/lang/String;
    //   3853: putfield 855	org/vidogram/tgnet/g$p:q	Ljava/lang/String;
    //   3856: aload_1
    //   3857: aload_1
    //   3858: getfield 842	org/vidogram/tgnet/g$gi:h	I
    //   3861: sipush 512
    //   3864: ior
    //   3865: putfield 842	org/vidogram/tgnet/g$gi:h	I
    //   3868: invokestatic 860	org/vidogram/messenger/ab:a	()Lorg/vidogram/messenger/ab;
    //   3871: aload_1
    //   3872: aload 16
    //   3874: getfield 325	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   3877: aload 26
    //   3879: aconst_null
    //   3880: aconst_null
    //   3881: aload 16
    //   3883: invokevirtual 863	org/vidogram/messenger/ab:a	(Lorg/vidogram/tgnet/g$n;Lorg/vidogram/tgnet/g$ar;Lorg/vidogram/tgnet/g$t;Lorg/vidogram/tgnet/g$ac;Ljava/lang/String;Lorg/vidogram/messenger/u;)V
    //   3886: aload 14
    //   3888: ifnonnull -3881 -> 7
    //   3891: lload 8
    //   3893: iconst_0
    //   3894: invokestatic 834	org/vidogram/messenger/d/b:a	(JZ)V
    //   3897: return
    //   3898: aload 26
    //   3900: getfield 471	org/vidogram/tgnet/g$t:o	I
    //   3903: invokestatic 476	org/vidogram/messenger/a:c	(I)I
    //   3906: bipush 17
    //   3908: if_icmplt +23 -> 3931
    //   3911: new 865	org/vidogram/tgnet/g$ho
    //   3914: dup
    //   3915: invokespecial 866	org/vidogram/tgnet/g$ho:<init>	()V
    //   3918: astore_1
    //   3919: aload_1
    //   3920: aload 7
    //   3922: getfield 755	org/vidogram/tgnet/g$ar:F	I
    //   3925: putfield 838	org/vidogram/tgnet/g$gi:c	I
    //   3928: goto -166 -> 3762
    //   3931: new 868	org/vidogram/tgnet/g$hp
    //   3934: dup
    //   3935: invokespecial 869	org/vidogram/tgnet/g$hp:<init>	()V
    //   3938: astore_1
    //   3939: aload_1
    //   3940: bipush 15
    //   3942: newarray byte
    //   3944: putfield 872	org/vidogram/tgnet/g$gi:g	[B
    //   3947: getstatic 730	org/vidogram/messenger/Utilities:b	Ljava/security/SecureRandom;
    //   3950: aload_1
    //   3951: getfield 872	org/vidogram/tgnet/g$gi:g	[B
    //   3954: invokevirtual 876	java/security/SecureRandom:nextBytes	([B)V
    //   3957: goto -195 -> 3762
    //   3960: aload_1
    //   3961: new 878	org/vidogram/tgnet/g$hc
    //   3964: dup
    //   3965: invokespecial 879	org/vidogram/tgnet/g$hc:<init>	()V
    //   3968: putfield 852	org/vidogram/tgnet/g$gi:e	Lorg/vidogram/tgnet/g$p;
    //   3971: goto -103 -> 3868
    //   3974: aload 26
    //   3976: ifnonnull +1519 -> 5495
    //   3979: aconst_null
    //   3980: astore 12
    //   3982: iload 18
    //   3984: iconst_1
    //   3985: if_icmpne +4702 -> 8687
    //   3988: aload_2
    //   3989: instanceof 881
    //   3992: ifeq +143 -> 4135
    //   3995: new 883	org/vidogram/tgnet/g$km
    //   3998: dup
    //   3999: invokespecial 884	org/vidogram/tgnet/g$km:<init>	()V
    //   4002: astore_1
    //   4003: aload_1
    //   4004: aload_2
    //   4005: getfield 886	org/vidogram/tgnet/g$au:g	Ljava/lang/String;
    //   4008: putfield 889	org/vidogram/tgnet/g$ah:o	Ljava/lang/String;
    //   4011: aload_1
    //   4012: aload_2
    //   4013: getfield 890	org/vidogram/tgnet/g$au:f	Ljava/lang/String;
    //   4016: putfield 891	org/vidogram/tgnet/g$ah:n	Ljava/lang/String;
    //   4019: aload_1
    //   4020: aload_2
    //   4021: getfield 893	org/vidogram/tgnet/g$au:h	Ljava/lang/String;
    //   4024: putfield 894	org/vidogram/tgnet/g$ah:p	Ljava/lang/String;
    //   4027: aload_1
    //   4028: aload_2
    //   4029: getfield 895	org/vidogram/tgnet/g$au:i	Ljava/lang/String;
    //   4032: putfield 896	org/vidogram/tgnet/g$ah:q	Ljava/lang/String;
    //   4035: aload_1
    //   4036: new 898	org/vidogram/tgnet/g$jy
    //   4039: dup
    //   4040: invokespecial 899	org/vidogram/tgnet/g$jy:<init>	()V
    //   4043: putfield 902	org/vidogram/tgnet/g$ah:m	Lorg/vidogram/tgnet/g$ag;
    //   4046: aload_1
    //   4047: getfield 902	org/vidogram/tgnet/g$ah:m	Lorg/vidogram/tgnet/g$ag;
    //   4050: aload_2
    //   4051: getfield 903	org/vidogram/tgnet/g$au:e	Lorg/vidogram/tgnet/g$y;
    //   4054: getfield 185	org/vidogram/tgnet/g$y:c	D
    //   4057: putfield 906	org/vidogram/tgnet/g$ag:b	D
    //   4060: aload_1
    //   4061: getfield 902	org/vidogram/tgnet/g$ah:m	Lorg/vidogram/tgnet/g$ag;
    //   4064: aload_2
    //   4065: getfield 903	org/vidogram/tgnet/g$au:e	Lorg/vidogram/tgnet/g$y;
    //   4068: getfield 190	org/vidogram/tgnet/g$y:b	D
    //   4071: putfield 907	org/vidogram/tgnet/g$ag:c	D
    //   4074: aload 12
    //   4076: astore_2
    //   4077: aload_3
    //   4078: ifnull +1150 -> 5228
    //   4081: new 726	org/vidogram/tgnet/g$qw
    //   4084: dup
    //   4085: invokespecial 727	org/vidogram/tgnet/g$qw:<init>	()V
    //   4088: astore 4
    //   4090: new 262	java/util/ArrayList
    //   4093: dup
    //   4094: invokespecial 263	java/util/ArrayList:<init>	()V
    //   4097: astore 5
    //   4099: iconst_0
    //   4100: istore 19
    //   4102: iload 19
    //   4104: aload_3
    //   4105: invokevirtual 538	java/util/ArrayList:size	()I
    //   4108: if_icmpge +1051 -> 5159
    //   4111: aload 5
    //   4113: getstatic 730	org/vidogram/messenger/Utilities:b	Ljava/security/SecureRandom;
    //   4116: invokevirtual 735	java/security/SecureRandom:nextLong	()J
    //   4119: invokestatic 740	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   4122: invokevirtual 267	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   4125: pop
    //   4126: iload 19
    //   4128: iconst_1
    //   4129: iadd
    //   4130: istore 19
    //   4132: goto -30 -> 4102
    //   4135: new 909	org/vidogram/tgnet/g$kf
    //   4138: dup
    //   4139: invokespecial 910	org/vidogram/tgnet/g$kf:<init>	()V
    //   4142: astore_1
    //   4143: goto -108 -> 4035
    //   4146: aload 24
    //   4148: getfield 911	org/vidogram/tgnet/g$rp:c	J
    //   4151: lconst_0
    //   4152: lcmp
    //   4153: ifne +207 -> 4360
    //   4156: new 913	org/vidogram/tgnet/g$kk
    //   4159: dup
    //   4160: invokespecial 914	org/vidogram/tgnet/g$kk:<init>	()V
    //   4163: astore_1
    //   4164: aload 24
    //   4166: getfield 522	org/vidogram/tgnet/g$rp:f	Ljava/lang/String;
    //   4169: ifnull +4539 -> 8708
    //   4172: aload 24
    //   4174: getfield 522	org/vidogram/tgnet/g$rp:f	Ljava/lang/String;
    //   4177: astore_2
    //   4178: aload_1
    //   4179: aload_2
    //   4180: putfield 915	org/vidogram/tgnet/g$ah:j	Ljava/lang/String;
    //   4183: aload 17
    //   4185: ifnull +85 -> 4270
    //   4188: aload 17
    //   4190: ldc_w 917
    //   4193: invokevirtual 293	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   4196: checkcast 245	java/lang/String
    //   4199: astore_2
    //   4200: aload_2
    //   4201: ifnull +69 -> 4270
    //   4204: new 919	org/vidogram/tgnet/e
    //   4207: dup
    //   4208: aload_2
    //   4209: invokestatic 922	org/vidogram/messenger/Utilities:d	(Ljava/lang/String;)[B
    //   4212: invokespecial 924	org/vidogram/tgnet/e:<init>	([B)V
    //   4215: astore_2
    //   4216: aload_2
    //   4217: iconst_0
    //   4218: invokevirtual 927	org/vidogram/tgnet/e:b	(Z)I
    //   4221: istore 20
    //   4223: iconst_0
    //   4224: istore 19
    //   4226: iload 19
    //   4228: iload 20
    //   4230: if_icmpge +30 -> 4260
    //   4233: aload_1
    //   4234: getfield 929	org/vidogram/tgnet/g$ah:k	Ljava/util/ArrayList;
    //   4237: aload_2
    //   4238: aload_2
    //   4239: iconst_0
    //   4240: invokevirtual 927	org/vidogram/tgnet/e:b	(Z)I
    //   4243: iconst_0
    //   4244: invokestatic 934	org/vidogram/tgnet/g$ab:a	(Lorg/vidogram/tgnet/a;IZ)Lorg/vidogram/tgnet/g$ab;
    //   4247: invokevirtual 267	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   4250: pop
    //   4251: iload 19
    //   4253: iconst_1
    //   4254: iadd
    //   4255: istore 19
    //   4257: goto -31 -> 4226
    //   4260: aload_1
    //   4261: aload_1
    //   4262: getfield 935	org/vidogram/tgnet/g$ah:e	I
    //   4265: iconst_1
    //   4266: ior
    //   4267: putfield 935	org/vidogram/tgnet/g$ah:e	I
    //   4270: new 70	org/vidogram/messenger/ac$a
    //   4273: dup
    //   4274: aload_0
    //   4275: invokespecial 936	org/vidogram/messenger/ac$a:<init>	(Lorg/vidogram/messenger/ac;)V
    //   4278: astore_2
    //   4279: aload_2
    //   4280: aload 27
    //   4282: putfield 937	org/vidogram/messenger/ac$a:d	Ljava/lang/String;
    //   4285: aload_2
    //   4286: iconst_0
    //   4287: putfield 938	org/vidogram/messenger/ac$a:c	I
    //   4290: aload_2
    //   4291: aload 16
    //   4293: putfield 940	org/vidogram/messenger/ac$a:h	Lorg/vidogram/messenger/u;
    //   4296: aload 10
    //   4298: ifnull +31 -> 4329
    //   4301: aload 10
    //   4303: invokevirtual 249	java/lang/String:length	()I
    //   4306: ifle +23 -> 4329
    //   4309: aload 10
    //   4311: ldc_w 529
    //   4314: invokevirtual 533	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   4317: ifeq +12 -> 4329
    //   4320: aload_2
    //   4321: aload 10
    //   4323: putfield 941	org/vidogram/messenger/ac$a:g	Ljava/lang/String;
    //   4326: goto -249 -> 4077
    //   4329: aload_2
    //   4330: aload 24
    //   4332: getfield 535	org/vidogram/tgnet/g$rp:h	Ljava/util/ArrayList;
    //   4335: aload 24
    //   4337: getfield 535	org/vidogram/tgnet/g$rp:h	Ljava/util/ArrayList;
    //   4340: invokevirtual 538	java/util/ArrayList:size	()I
    //   4343: iconst_1
    //   4344: isub
    //   4345: invokevirtual 541	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   4348: checkcast 543	org/vidogram/tgnet/g$az
    //   4351: getfield 546	org/vidogram/tgnet/g$az:c	Lorg/vidogram/tgnet/g$x;
    //   4354: putfield 943	org/vidogram/messenger/ac$a:e	Lorg/vidogram/tgnet/g$x;
    //   4357: goto -280 -> 4077
    //   4360: new 945	org/vidogram/tgnet/g$kh
    //   4363: dup
    //   4364: invokespecial 946	org/vidogram/tgnet/g$kh:<init>	()V
    //   4367: astore_2
    //   4368: aload_2
    //   4369: new 948	org/vidogram/tgnet/g$ld
    //   4372: dup
    //   4373: invokespecial 949	org/vidogram/tgnet/g$ld:<init>	()V
    //   4376: putfield 952	org/vidogram/tgnet/g$kh:s	Lorg/vidogram/tgnet/g$ak;
    //   4379: aload 24
    //   4381: getfield 522	org/vidogram/tgnet/g$rp:f	Ljava/lang/String;
    //   4384: ifnull +4331 -> 8715
    //   4387: aload 24
    //   4389: getfield 522	org/vidogram/tgnet/g$rp:f	Ljava/lang/String;
    //   4392: astore_1
    //   4393: aload_2
    //   4394: aload_1
    //   4395: putfield 953	org/vidogram/tgnet/g$kh:j	Ljava/lang/String;
    //   4398: aload_2
    //   4399: getfield 952	org/vidogram/tgnet/g$kh:s	Lorg/vidogram/tgnet/g$ak;
    //   4402: aload 24
    //   4404: getfield 954	org/vidogram/tgnet/g$rp:b	J
    //   4407: putfield 957	org/vidogram/tgnet/g$ak:b	J
    //   4410: aload_2
    //   4411: getfield 952	org/vidogram/tgnet/g$kh:s	Lorg/vidogram/tgnet/g$ak;
    //   4414: aload 24
    //   4416: getfield 911	org/vidogram/tgnet/g$rp:c	J
    //   4419: putfield 958	org/vidogram/tgnet/g$ak:c	J
    //   4422: aload_2
    //   4423: astore_1
    //   4424: aload 12
    //   4426: astore_2
    //   4427: goto -350 -> 4077
    //   4430: iload 18
    //   4432: iconst_3
    //   4433: if_icmpne +203 -> 4636
    //   4436: aload 6
    //   4438: getfield 959	org/vidogram/tgnet/g$hs:c	J
    //   4441: lconst_0
    //   4442: lcmp
    //   4443: ifne +123 -> 4566
    //   4446: aload 6
    //   4448: getfield 962	org/vidogram/tgnet/g$hs:i	Lorg/vidogram/tgnet/g$az;
    //   4451: getfield 546	org/vidogram/tgnet/g$az:c	Lorg/vidogram/tgnet/g$x;
    //   4454: ifnull +101 -> 4555
    //   4457: new 964	org/vidogram/tgnet/g$kl
    //   4460: dup
    //   4461: invokespecial 965	org/vidogram/tgnet/g$kl:<init>	()V
    //   4464: astore_1
    //   4465: aload 6
    //   4467: getfield 566	org/vidogram/tgnet/g$hs:n	Ljava/lang/String;
    //   4470: ifnull +4252 -> 8722
    //   4473: aload 6
    //   4475: getfield 566	org/vidogram/tgnet/g$hs:n	Ljava/lang/String;
    //   4478: astore_2
    //   4479: aload_1
    //   4480: aload_2
    //   4481: putfield 915	org/vidogram/tgnet/g$ah:j	Ljava/lang/String;
    //   4484: aload_1
    //   4485: aload 6
    //   4487: getfield 966	org/vidogram/tgnet/g$hs:g	Ljava/lang/String;
    //   4490: putfield 967	org/vidogram/tgnet/g$ah:h	Ljava/lang/String;
    //   4493: aload_1
    //   4494: aload 6
    //   4496: getfield 575	org/vidogram/tgnet/g$hs:o	Ljava/util/ArrayList;
    //   4499: putfield 968	org/vidogram/tgnet/g$ah:i	Ljava/util/ArrayList;
    //   4502: new 70	org/vidogram/messenger/ac$a
    //   4505: dup
    //   4506: aload_0
    //   4507: invokespecial 936	org/vidogram/messenger/ac$a:<init>	(Lorg/vidogram/messenger/ac;)V
    //   4510: astore_2
    //   4511: aload_2
    //   4512: aload 27
    //   4514: putfield 937	org/vidogram/messenger/ac$a:d	Ljava/lang/String;
    //   4517: aload_2
    //   4518: iconst_1
    //   4519: putfield 938	org/vidogram/messenger/ac$a:c	I
    //   4522: aload_2
    //   4523: aload 16
    //   4525: putfield 940	org/vidogram/messenger/ac$a:h	Lorg/vidogram/messenger/u;
    //   4528: aload_2
    //   4529: aload 6
    //   4531: getfield 962	org/vidogram/tgnet/g$hs:i	Lorg/vidogram/tgnet/g$az;
    //   4534: getfield 546	org/vidogram/tgnet/g$az:c	Lorg/vidogram/tgnet/g$x;
    //   4537: putfield 943	org/vidogram/messenger/ac$a:e	Lorg/vidogram/tgnet/g$x;
    //   4540: aload_2
    //   4541: aload 6
    //   4543: putfield 971	org/vidogram/messenger/ac$a:f	Lorg/vidogram/tgnet/g$hs;
    //   4546: aload_2
    //   4547: aload 4
    //   4549: putfield 974	org/vidogram/messenger/ac$a:j	Lorg/vidogram/messenger/af;
    //   4552: goto -475 -> 4077
    //   4555: new 976	org/vidogram/tgnet/g$kj
    //   4558: dup
    //   4559: invokespecial 977	org/vidogram/tgnet/g$kj:<init>	()V
    //   4562: astore_1
    //   4563: goto -98 -> 4465
    //   4566: new 979	org/vidogram/tgnet/g$kb
    //   4569: dup
    //   4570: invokespecial 980	org/vidogram/tgnet/g$kb:<init>	()V
    //   4573: astore_2
    //   4574: aload_2
    //   4575: new 982	org/vidogram/tgnet/g$jn
    //   4578: dup
    //   4579: invokespecial 983	org/vidogram/tgnet/g$jn:<init>	()V
    //   4582: putfield 986	org/vidogram/tgnet/g$kb:s	Lorg/vidogram/tgnet/g$ab;
    //   4585: aload 6
    //   4587: getfield 566	org/vidogram/tgnet/g$hs:n	Ljava/lang/String;
    //   4590: ifnull +4139 -> 8729
    //   4593: aload 6
    //   4595: getfield 566	org/vidogram/tgnet/g$hs:n	Ljava/lang/String;
    //   4598: astore_1
    //   4599: aload_2
    //   4600: aload_1
    //   4601: putfield 987	org/vidogram/tgnet/g$kb:j	Ljava/lang/String;
    //   4604: aload_2
    //   4605: getfield 986	org/vidogram/tgnet/g$kb:s	Lorg/vidogram/tgnet/g$ab;
    //   4608: aload 6
    //   4610: getfield 988	org/vidogram/tgnet/g$hs:b	J
    //   4613: putfield 989	org/vidogram/tgnet/g$ab:b	J
    //   4616: aload_2
    //   4617: getfield 986	org/vidogram/tgnet/g$kb:s	Lorg/vidogram/tgnet/g$ab;
    //   4620: aload 6
    //   4622: getfield 959	org/vidogram/tgnet/g$hs:c	J
    //   4625: putfield 990	org/vidogram/tgnet/g$ab:c	J
    //   4628: aload_2
    //   4629: astore_1
    //   4630: aload 12
    //   4632: astore_2
    //   4633: goto -556 -> 4077
    //   4636: iload 18
    //   4638: bipush 6
    //   4640: if_icmpne +4096 -> 8736
    //   4643: new 992	org/vidogram/tgnet/g$ka
    //   4646: dup
    //   4647: invokespecial 993	org/vidogram/tgnet/g$ka:<init>	()V
    //   4650: astore_1
    //   4651: aload_1
    //   4652: aload 5
    //   4654: getfield 454	org/vidogram/tgnet/g$vw:i	Ljava/lang/String;
    //   4657: putfield 994	org/vidogram/tgnet/g$ah:b	Ljava/lang/String;
    //   4660: aload_1
    //   4661: aload 5
    //   4663: getfield 458	org/vidogram/tgnet/g$vw:e	Ljava/lang/String;
    //   4666: putfield 996	org/vidogram/tgnet/g$ah:c	Ljava/lang/String;
    //   4669: aload_1
    //   4670: aload 5
    //   4672: getfield 463	org/vidogram/tgnet/g$vw:f	Ljava/lang/String;
    //   4675: putfield 997	org/vidogram/tgnet/g$ah:d	Ljava/lang/String;
    //   4678: aload 12
    //   4680: astore_2
    //   4681: goto -604 -> 4077
    //   4684: aload 6
    //   4686: getfield 959	org/vidogram/tgnet/g$hs:c	J
    //   4689: lconst_0
    //   4690: lcmp
    //   4691: ifne +230 -> 4921
    //   4694: aload 26
    //   4696: ifnonnull +134 -> 4830
    //   4699: aload 27
    //   4701: ifnull +129 -> 4830
    //   4704: aload 27
    //   4706: invokevirtual 249	java/lang/String:length	()I
    //   4709: ifle +121 -> 4830
    //   4712: aload 27
    //   4714: ldc_w 529
    //   4717: invokevirtual 533	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   4720: ifeq +110 -> 4830
    //   4723: aload 17
    //   4725: ifnull +105 -> 4830
    //   4728: new 999	org/vidogram/tgnet/g$kg
    //   4731: dup
    //   4732: invokespecial 1000	org/vidogram/tgnet/g$kg:<init>	()V
    //   4735: astore_2
    //   4736: aload 17
    //   4738: ldc_w 1002
    //   4741: invokevirtual 293	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   4744: checkcast 245	java/lang/String
    //   4747: ldc_w 1004
    //   4750: invokevirtual 1008	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   4753: astore_1
    //   4754: aload_1
    //   4755: arraylength
    //   4756: iconst_2
    //   4757: if_icmpne +3996 -> 8753
    //   4760: aload_2
    //   4761: checkcast 999	org/vidogram/tgnet/g$kg
    //   4764: aload_1
    //   4765: iconst_0
    //   4766: aaload
    //   4767: putfield 1010	org/vidogram/tgnet/g$kg:s	Ljava/lang/String;
    //   4770: aload_2
    //   4771: aload_1
    //   4772: iconst_1
    //   4773: aaload
    //   4774: putfield 1011	org/vidogram/tgnet/g$ah:l	Ljava/lang/String;
    //   4777: goto +3976 -> 8753
    //   4780: aload_2
    //   4781: aload 6
    //   4783: getfield 966	org/vidogram/tgnet/g$hs:g	Ljava/lang/String;
    //   4786: putfield 967	org/vidogram/tgnet/g$ah:h	Ljava/lang/String;
    //   4789: aload_2
    //   4790: aload 6
    //   4792: getfield 575	org/vidogram/tgnet/g$hs:o	Ljava/util/ArrayList;
    //   4795: putfield 968	org/vidogram/tgnet/g$ah:i	Ljava/util/ArrayList;
    //   4798: aload 6
    //   4800: getfield 566	org/vidogram/tgnet/g$hs:n	Ljava/lang/String;
    //   4803: ifnull +3955 -> 8758
    //   4806: aload 6
    //   4808: getfield 566	org/vidogram/tgnet/g$hs:n	Ljava/lang/String;
    //   4811: astore 4
    //   4813: aload_2
    //   4814: aload 4
    //   4816: putfield 915	org/vidogram/tgnet/g$ah:j	Ljava/lang/String;
    //   4819: aload_2
    //   4820: astore 4
    //   4822: aload_1
    //   4823: astore_2
    //   4824: aload 4
    //   4826: astore_1
    //   4827: goto -750 -> 4077
    //   4830: aload 6
    //   4832: getfield 962	org/vidogram/tgnet/g$hs:i	Lorg/vidogram/tgnet/g$az;
    //   4835: getfield 546	org/vidogram/tgnet/g$az:c	Lorg/vidogram/tgnet/g$x;
    //   4838: ifnull +72 -> 4910
    //   4841: aload 6
    //   4843: getfield 962	org/vidogram/tgnet/g$hs:i	Lorg/vidogram/tgnet/g$az;
    //   4846: getfield 546	org/vidogram/tgnet/g$az:c	Lorg/vidogram/tgnet/g$x;
    //   4849: instanceof 1013
    //   4852: ifeq +58 -> 4910
    //   4855: new 964	org/vidogram/tgnet/g$kl
    //   4858: dup
    //   4859: invokespecial 965	org/vidogram/tgnet/g$kl:<init>	()V
    //   4862: astore_2
    //   4863: new 70	org/vidogram/messenger/ac$a
    //   4866: dup
    //   4867: aload_0
    //   4868: invokespecial 936	org/vidogram/messenger/ac$a:<init>	(Lorg/vidogram/messenger/ac;)V
    //   4871: astore_1
    //   4872: aload_1
    //   4873: aload 27
    //   4875: putfield 937	org/vidogram/messenger/ac$a:d	Ljava/lang/String;
    //   4878: aload_1
    //   4879: iconst_2
    //   4880: putfield 938	org/vidogram/messenger/ac$a:c	I
    //   4883: aload_1
    //   4884: aload 16
    //   4886: putfield 940	org/vidogram/messenger/ac$a:h	Lorg/vidogram/messenger/u;
    //   4889: aload_1
    //   4890: aload 6
    //   4892: putfield 971	org/vidogram/messenger/ac$a:f	Lorg/vidogram/tgnet/g$hs;
    //   4895: aload_1
    //   4896: aload 6
    //   4898: getfield 962	org/vidogram/tgnet/g$hs:i	Lorg/vidogram/tgnet/g$az;
    //   4901: getfield 546	org/vidogram/tgnet/g$az:c	Lorg/vidogram/tgnet/g$x;
    //   4904: putfield 943	org/vidogram/messenger/ac$a:e	Lorg/vidogram/tgnet/g$x;
    //   4907: goto -127 -> 4780
    //   4910: new 976	org/vidogram/tgnet/g$kj
    //   4913: dup
    //   4914: invokespecial 977	org/vidogram/tgnet/g$kj:<init>	()V
    //   4917: astore_2
    //   4918: goto -55 -> 4863
    //   4921: new 979	org/vidogram/tgnet/g$kb
    //   4924: dup
    //   4925: invokespecial 980	org/vidogram/tgnet/g$kb:<init>	()V
    //   4928: astore_2
    //   4929: aload_2
    //   4930: new 982	org/vidogram/tgnet/g$jn
    //   4933: dup
    //   4934: invokespecial 983	org/vidogram/tgnet/g$jn:<init>	()V
    //   4937: putfield 986	org/vidogram/tgnet/g$kb:s	Lorg/vidogram/tgnet/g$ab;
    //   4940: aload_2
    //   4941: getfield 986	org/vidogram/tgnet/g$kb:s	Lorg/vidogram/tgnet/g$ab;
    //   4944: aload 6
    //   4946: getfield 988	org/vidogram/tgnet/g$hs:b	J
    //   4949: putfield 989	org/vidogram/tgnet/g$ab:b	J
    //   4952: aload_2
    //   4953: getfield 986	org/vidogram/tgnet/g$kb:s	Lorg/vidogram/tgnet/g$ab;
    //   4956: aload 6
    //   4958: getfield 959	org/vidogram/tgnet/g$hs:c	J
    //   4961: putfield 990	org/vidogram/tgnet/g$ab:c	J
    //   4964: aload 6
    //   4966: getfield 566	org/vidogram/tgnet/g$hs:n	Ljava/lang/String;
    //   4969: ifnull +3797 -> 8766
    //   4972: aload 6
    //   4974: getfield 566	org/vidogram/tgnet/g$hs:n	Ljava/lang/String;
    //   4977: astore_1
    //   4978: aload_2
    //   4979: aload_1
    //   4980: putfield 987	org/vidogram/tgnet/g$kb:j	Ljava/lang/String;
    //   4983: aload_2
    //   4984: astore_1
    //   4985: aload 12
    //   4987: astore_2
    //   4988: goto -911 -> 4077
    //   4991: iload 18
    //   4993: bipush 8
    //   4995: if_icmpne +3474 -> 8469
    //   4998: aload 6
    //   5000: getfield 959	org/vidogram/tgnet/g$hs:c	J
    //   5003: lconst_0
    //   5004: lcmp
    //   5005: ifne +84 -> 5089
    //   5008: new 976	org/vidogram/tgnet/g$kj
    //   5011: dup
    //   5012: invokespecial 977	org/vidogram/tgnet/g$kj:<init>	()V
    //   5015: astore 4
    //   5017: aload 4
    //   5019: aload 6
    //   5021: getfield 966	org/vidogram/tgnet/g$hs:g	Ljava/lang/String;
    //   5024: putfield 967	org/vidogram/tgnet/g$ah:h	Ljava/lang/String;
    //   5027: aload 4
    //   5029: aload 6
    //   5031: getfield 575	org/vidogram/tgnet/g$hs:o	Ljava/util/ArrayList;
    //   5034: putfield 968	org/vidogram/tgnet/g$ah:i	Ljava/util/ArrayList;
    //   5037: aload 6
    //   5039: getfield 566	org/vidogram/tgnet/g$hs:n	Ljava/lang/String;
    //   5042: ifnull +3731 -> 8773
    //   5045: aload 6
    //   5047: getfield 566	org/vidogram/tgnet/g$hs:n	Ljava/lang/String;
    //   5050: astore_1
    //   5051: aload 4
    //   5053: aload_1
    //   5054: putfield 915	org/vidogram/tgnet/g$ah:j	Ljava/lang/String;
    //   5057: new 70	org/vidogram/messenger/ac$a
    //   5060: dup
    //   5061: aload_0
    //   5062: invokespecial 936	org/vidogram/messenger/ac$a:<init>	(Lorg/vidogram/messenger/ac;)V
    //   5065: astore_2
    //   5066: aload_2
    //   5067: iconst_3
    //   5068: putfield 938	org/vidogram/messenger/ac$a:c	I
    //   5071: aload_2
    //   5072: aload 16
    //   5074: putfield 940	org/vidogram/messenger/ac$a:h	Lorg/vidogram/messenger/u;
    //   5077: aload_2
    //   5078: aload 6
    //   5080: putfield 971	org/vidogram/messenger/ac$a:f	Lorg/vidogram/tgnet/g$hs;
    //   5083: aload 4
    //   5085: astore_1
    //   5086: goto -1009 -> 4077
    //   5089: new 979	org/vidogram/tgnet/g$kb
    //   5092: dup
    //   5093: invokespecial 980	org/vidogram/tgnet/g$kb:<init>	()V
    //   5096: astore_2
    //   5097: aload_2
    //   5098: new 982	org/vidogram/tgnet/g$jn
    //   5101: dup
    //   5102: invokespecial 983	org/vidogram/tgnet/g$jn:<init>	()V
    //   5105: putfield 986	org/vidogram/tgnet/g$kb:s	Lorg/vidogram/tgnet/g$ab;
    //   5108: aload 6
    //   5110: getfield 566	org/vidogram/tgnet/g$hs:n	Ljava/lang/String;
    //   5113: ifnull +3667 -> 8780
    //   5116: aload 6
    //   5118: getfield 566	org/vidogram/tgnet/g$hs:n	Ljava/lang/String;
    //   5121: astore_1
    //   5122: aload_2
    //   5123: aload_1
    //   5124: putfield 987	org/vidogram/tgnet/g$kb:j	Ljava/lang/String;
    //   5127: aload_2
    //   5128: getfield 986	org/vidogram/tgnet/g$kb:s	Lorg/vidogram/tgnet/g$ab;
    //   5131: aload 6
    //   5133: getfield 988	org/vidogram/tgnet/g$hs:b	J
    //   5136: putfield 989	org/vidogram/tgnet/g$ab:b	J
    //   5139: aload_2
    //   5140: getfield 986	org/vidogram/tgnet/g$kb:s	Lorg/vidogram/tgnet/g$ab;
    //   5143: aload 6
    //   5145: getfield 959	org/vidogram/tgnet/g$hs:c	J
    //   5148: putfield 990	org/vidogram/tgnet/g$ab:c	J
    //   5151: aload_2
    //   5152: astore_1
    //   5153: aload 12
    //   5155: astore_2
    //   5156: goto -1079 -> 4077
    //   5159: aload 4
    //   5161: aload_3
    //   5162: putfield 774	org/vidogram/tgnet/g$qw:c	Ljava/util/ArrayList;
    //   5165: aload 4
    //   5167: aload_1
    //   5168: putfield 780	org/vidogram/tgnet/g$qw:f	Lorg/vidogram/tgnet/g$ah;
    //   5171: aload 4
    //   5173: aload 5
    //   5175: putfield 782	org/vidogram/tgnet/g$qw:d	Ljava/util/ArrayList;
    //   5178: aload 4
    //   5180: ldc_w 378
    //   5183: putfield 772	org/vidogram/tgnet/g$qw:e	Ljava/lang/String;
    //   5186: aload_2
    //   5187: ifnull +9 -> 5196
    //   5190: aload_2
    //   5191: aload 4
    //   5193: putfield 1016	org/vidogram/messenger/ac$a:a	Lorg/vidogram/tgnet/f;
    //   5196: aload 4
    //   5198: astore_1
    //   5199: aload 14
    //   5201: ifnonnull +12 -> 5213
    //   5204: lload 8
    //   5206: iconst_0
    //   5207: invokestatic 834	org/vidogram/messenger/d/b:a	(JZ)V
    //   5210: aload 4
    //   5212: astore_1
    //   5213: iload 18
    //   5215: iconst_1
    //   5216: if_icmpne +132 -> 5348
    //   5219: aload_0
    //   5220: aload_1
    //   5221: aload 16
    //   5223: aconst_null
    //   5224: invokespecial 785	org/vidogram/messenger/ac:a	(Lorg/vidogram/tgnet/f;Lorg/vidogram/messenger/u;Ljava/lang/String;)V
    //   5227: return
    //   5228: new 1018	org/vidogram/tgnet/g$rb
    //   5231: dup
    //   5232: invokespecial 1019	org/vidogram/tgnet/g$rb:<init>	()V
    //   5235: astore_3
    //   5236: aload_3
    //   5237: aload 28
    //   5239: putfield 1021	org/vidogram/tgnet/g$rb:g	Lorg/vidogram/tgnet/g$aj;
    //   5242: aload 7
    //   5244: getfield 663	org/vidogram/tgnet/g$ar:d	Lorg/vidogram/tgnet/g$aw;
    //   5247: instanceof 794
    //   5250: ifeq +44 -> 5294
    //   5253: aload_3
    //   5254: getstatic 799	org/vidogram/messenger/ApplicationLoader:a	Landroid/content/Context;
    //   5257: ldc_w 801
    //   5260: iconst_0
    //   5261: invokevirtual 807	android/content/Context:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   5264: new 697	java/lang/StringBuilder
    //   5267: dup
    //   5268: invokespecial 698	java/lang/StringBuilder:<init>	()V
    //   5271: ldc_w 809
    //   5274: invokevirtual 704	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   5277: lload 8
    //   5279: invokevirtual 720	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   5282: invokevirtual 721	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   5285: iconst_0
    //   5286: invokeinterface 815 3 0
    //   5291: putfield 1022	org/vidogram/tgnet/g$rb:d	Z
    //   5294: aload_3
    //   5295: aload 7
    //   5297: getfield 367	org/vidogram/tgnet/g$ar:C	J
    //   5300: putfield 1024	org/vidogram/tgnet/g$rb:j	J
    //   5303: aload_3
    //   5304: aload_1
    //   5305: putfield 1026	org/vidogram/tgnet/g$rb:i	Lorg/vidogram/tgnet/g$ah;
    //   5308: aload 11
    //   5310: ifnull +22 -> 5332
    //   5313: aload_3
    //   5314: aload_3
    //   5315: getfield 1027	org/vidogram/tgnet/g$rb:c	I
    //   5318: iconst_1
    //   5319: ior
    //   5320: putfield 1027	org/vidogram/tgnet/g$rb:c	I
    //   5323: aload_3
    //   5324: aload 11
    //   5326: invokevirtual 339	org/vidogram/messenger/u:q	()I
    //   5329: putfield 1028	org/vidogram/tgnet/g$rb:h	I
    //   5332: aload_3
    //   5333: astore_1
    //   5334: aload_2
    //   5335: ifnull -122 -> 5213
    //   5338: aload_2
    //   5339: aload_3
    //   5340: putfield 1016	org/vidogram/messenger/ac$a:a	Lorg/vidogram/tgnet/f;
    //   5343: aload_3
    //   5344: astore_1
    //   5345: goto -132 -> 5213
    //   5348: iload 18
    //   5350: iconst_2
    //   5351: if_icmpne +28 -> 5379
    //   5354: aload 24
    //   5356: getfield 911	org/vidogram/tgnet/g$rp:c	J
    //   5359: lconst_0
    //   5360: lcmp
    //   5361: ifne +9 -> 5370
    //   5364: aload_0
    //   5365: aload_2
    //   5366: invokespecial 1031	org/vidogram/messenger/ac:a	(Lorg/vidogram/messenger/ac$a;)V
    //   5369: return
    //   5370: aload_0
    //   5371: aload_1
    //   5372: aload 16
    //   5374: aconst_null
    //   5375: invokespecial 785	org/vidogram/messenger/ac:a	(Lorg/vidogram/tgnet/f;Lorg/vidogram/messenger/u;Ljava/lang/String;)V
    //   5378: return
    //   5379: iload 18
    //   5381: iconst_3
    //   5382: if_icmpne +28 -> 5410
    //   5385: aload 6
    //   5387: getfield 959	org/vidogram/tgnet/g$hs:c	J
    //   5390: lconst_0
    //   5391: lcmp
    //   5392: ifne +9 -> 5401
    //   5395: aload_0
    //   5396: aload_2
    //   5397: invokespecial 1031	org/vidogram/messenger/ac:a	(Lorg/vidogram/messenger/ac$a;)V
    //   5400: return
    //   5401: aload_0
    //   5402: aload_1
    //   5403: aload 16
    //   5405: aconst_null
    //   5406: invokespecial 785	org/vidogram/messenger/ac:a	(Lorg/vidogram/tgnet/f;Lorg/vidogram/messenger/u;Ljava/lang/String;)V
    //   5409: return
    //   5410: iload 18
    //   5412: bipush 6
    //   5414: if_icmpne +12 -> 5426
    //   5417: aload_0
    //   5418: aload_1
    //   5419: aload 16
    //   5421: aconst_null
    //   5422: invokespecial 785	org/vidogram/messenger/ac:a	(Lorg/vidogram/tgnet/f;Lorg/vidogram/messenger/u;Ljava/lang/String;)V
    //   5425: return
    //   5426: iload 18
    //   5428: bipush 7
    //   5430: if_icmpne +33 -> 5463
    //   5433: aload 6
    //   5435: getfield 959	org/vidogram/tgnet/g$hs:c	J
    //   5438: lconst_0
    //   5439: lcmp
    //   5440: ifne +13 -> 5453
    //   5443: aload_2
    //   5444: ifnull +9 -> 5453
    //   5447: aload_0
    //   5448: aload_2
    //   5449: invokespecial 1031	org/vidogram/messenger/ac:a	(Lorg/vidogram/messenger/ac$a;)V
    //   5452: return
    //   5453: aload_0
    //   5454: aload_1
    //   5455: aload 16
    //   5457: aload 27
    //   5459: invokespecial 785	org/vidogram/messenger/ac:a	(Lorg/vidogram/tgnet/f;Lorg/vidogram/messenger/u;Ljava/lang/String;)V
    //   5462: return
    //   5463: iload 18
    //   5465: bipush 8
    //   5467: if_icmpne -5460 -> 7
    //   5470: aload 6
    //   5472: getfield 959	org/vidogram/tgnet/g$hs:c	J
    //   5475: lconst_0
    //   5476: lcmp
    //   5477: ifne +9 -> 5486
    //   5480: aload_0
    //   5481: aload_2
    //   5482: invokespecial 1031	org/vidogram/messenger/ac:a	(Lorg/vidogram/messenger/ac$a;)V
    //   5485: return
    //   5486: aload_0
    //   5487: aload_1
    //   5488: aload 16
    //   5490: aconst_null
    //   5491: invokespecial 785	org/vidogram/messenger/ac:a	(Lorg/vidogram/tgnet/f;Lorg/vidogram/messenger/u;Ljava/lang/String;)V
    //   5494: return
    //   5495: aload 26
    //   5497: getfield 471	org/vidogram/tgnet/g$t:o	I
    //   5500: invokestatic 476	org/vidogram/messenger/a:c	(I)I
    //   5503: bipush 46
    //   5505: if_icmplt +302 -> 5807
    //   5508: new 836	org/vidogram/tgnet/g$gi
    //   5511: dup
    //   5512: invokespecial 837	org/vidogram/tgnet/g$gi:<init>	()V
    //   5515: astore_1
    //   5516: aload_1
    //   5517: aload 7
    //   5519: getfield 755	org/vidogram/tgnet/g$ar:F	I
    //   5522: putfield 838	org/vidogram/tgnet/g$gi:c	I
    //   5525: aload 15
    //   5527: ifnull +29 -> 5556
    //   5530: aload 15
    //   5532: invokevirtual 276	java/util/ArrayList:isEmpty	()Z
    //   5535: ifne +21 -> 5556
    //   5538: aload_1
    //   5539: aload 15
    //   5541: putfield 840	org/vidogram/tgnet/g$gi:i	Ljava/util/ArrayList;
    //   5544: aload_1
    //   5545: aload_1
    //   5546: getfield 842	org/vidogram/tgnet/g$gi:h	I
    //   5549: sipush 128
    //   5552: ior
    //   5553: putfield 842	org/vidogram/tgnet/g$gi:h	I
    //   5556: aload 11
    //   5558: ifnull +39 -> 5597
    //   5561: aload 11
    //   5563: getfield 325	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   5566: getfield 367	org/vidogram/tgnet/g$ar:C	J
    //   5569: lconst_0
    //   5570: lcmp
    //   5571: ifeq +26 -> 5597
    //   5574: aload_1
    //   5575: aload 11
    //   5577: getfield 325	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   5580: getfield 367	org/vidogram/tgnet/g$ar:C	J
    //   5583: putfield 843	org/vidogram/tgnet/g$gi:k	J
    //   5586: aload_1
    //   5587: aload_1
    //   5588: getfield 842	org/vidogram/tgnet/g$gi:h	I
    //   5591: bipush 8
    //   5593: ior
    //   5594: putfield 842	org/vidogram/tgnet/g$gi:h	I
    //   5597: aload_1
    //   5598: aload_1
    //   5599: getfield 842	org/vidogram/tgnet/g$gi:h	I
    //   5602: sipush 512
    //   5605: ior
    //   5606: putfield 842	org/vidogram/tgnet/g$gi:h	I
    //   5609: aload 17
    //   5611: ifnull +41 -> 5652
    //   5614: aload 17
    //   5616: ldc_w 373
    //   5619: invokevirtual 293	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   5622: ifnull +30 -> 5652
    //   5625: aload_1
    //   5626: aload 17
    //   5628: ldc_w 373
    //   5631: invokevirtual 293	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   5634: checkcast 245	java/lang/String
    //   5637: putfield 844	org/vidogram/tgnet/g$gi:j	Ljava/lang/String;
    //   5640: aload_1
    //   5641: aload_1
    //   5642: getfield 842	org/vidogram/tgnet/g$gi:h	I
    //   5645: sipush 2048
    //   5648: ior
    //   5649: putfield 842	org/vidogram/tgnet/g$gi:h	I
    //   5652: aload_1
    //   5653: aload 7
    //   5655: getfield 367	org/vidogram/tgnet/g$ar:C	J
    //   5658: putfield 845	org/vidogram/tgnet/g$gi:b	J
    //   5661: aload_1
    //   5662: ldc_w 378
    //   5665: putfield 846	org/vidogram/tgnet/g$gi:d	Ljava/lang/String;
    //   5668: iload 18
    //   5670: iconst_1
    //   5671: if_icmpne +3116 -> 8787
    //   5674: aload_2
    //   5675: instanceof 881
    //   5678: ifeq +191 -> 5869
    //   5681: aload 26
    //   5683: getfield 471	org/vidogram/tgnet/g$t:o	I
    //   5686: invokestatic 476	org/vidogram/messenger/a:c	(I)I
    //   5689: bipush 46
    //   5691: if_icmplt +178 -> 5869
    //   5694: aload_1
    //   5695: new 1033	org/vidogram/tgnet/g$hh
    //   5698: dup
    //   5699: invokespecial 1034	org/vidogram/tgnet/g$hh:<init>	()V
    //   5702: putfield 852	org/vidogram/tgnet/g$gi:e	Lorg/vidogram/tgnet/g$p;
    //   5705: aload_1
    //   5706: getfield 852	org/vidogram/tgnet/g$gi:e	Lorg/vidogram/tgnet/g$p;
    //   5709: aload_2
    //   5710: getfield 886	org/vidogram/tgnet/g$au:g	Ljava/lang/String;
    //   5713: putfield 1036	org/vidogram/tgnet/g$p:v	Ljava/lang/String;
    //   5716: aload_1
    //   5717: getfield 852	org/vidogram/tgnet/g$gi:e	Lorg/vidogram/tgnet/g$p;
    //   5720: aload_2
    //   5721: getfield 890	org/vidogram/tgnet/g$au:f	Ljava/lang/String;
    //   5724: putfield 1038	org/vidogram/tgnet/g$p:u	Ljava/lang/String;
    //   5727: aload_1
    //   5728: getfield 852	org/vidogram/tgnet/g$gi:e	Lorg/vidogram/tgnet/g$p;
    //   5731: aload_2
    //   5732: getfield 893	org/vidogram/tgnet/g$au:h	Ljava/lang/String;
    //   5735: putfield 1041	org/vidogram/tgnet/g$p:w	Ljava/lang/String;
    //   5738: aload_1
    //   5739: getfield 852	org/vidogram/tgnet/g$gi:e	Lorg/vidogram/tgnet/g$p;
    //   5742: aload_2
    //   5743: getfield 895	org/vidogram/tgnet/g$au:i	Ljava/lang/String;
    //   5746: putfield 1043	org/vidogram/tgnet/g$p:x	Ljava/lang/String;
    //   5749: aload_1
    //   5750: getfield 852	org/vidogram/tgnet/g$gi:e	Lorg/vidogram/tgnet/g$p;
    //   5753: aload_2
    //   5754: getfield 903	org/vidogram/tgnet/g$au:e	Lorg/vidogram/tgnet/g$y;
    //   5757: getfield 185	org/vidogram/tgnet/g$y:c	D
    //   5760: putfield 1045	org/vidogram/tgnet/g$p:g	D
    //   5763: aload_1
    //   5764: getfield 852	org/vidogram/tgnet/g$gi:e	Lorg/vidogram/tgnet/g$p;
    //   5767: aload_2
    //   5768: getfield 903	org/vidogram/tgnet/g$au:e	Lorg/vidogram/tgnet/g$y;
    //   5771: getfield 190	org/vidogram/tgnet/g$y:b	D
    //   5774: putfield 1047	org/vidogram/tgnet/g$p:h	D
    //   5777: invokestatic 860	org/vidogram/messenger/ab:a	()Lorg/vidogram/messenger/ab;
    //   5780: aload_1
    //   5781: aload 16
    //   5783: getfield 325	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   5786: aload 26
    //   5788: aconst_null
    //   5789: aconst_null
    //   5790: aload 16
    //   5792: invokevirtual 863	org/vidogram/messenger/ab:a	(Lorg/vidogram/tgnet/g$n;Lorg/vidogram/tgnet/g$ar;Lorg/vidogram/tgnet/g$t;Lorg/vidogram/tgnet/g$ac;Ljava/lang/String;Lorg/vidogram/messenger/u;)V
    //   5795: aload 14
    //   5797: ifnonnull -5790 -> 7
    //   5800: lload 8
    //   5802: iconst_0
    //   5803: invokestatic 834	org/vidogram/messenger/d/b:a	(JZ)V
    //   5806: return
    //   5807: aload 26
    //   5809: getfield 471	org/vidogram/tgnet/g$t:o	I
    //   5812: invokestatic 476	org/vidogram/messenger/a:c	(I)I
    //   5815: bipush 17
    //   5817: if_icmplt +23 -> 5840
    //   5820: new 865	org/vidogram/tgnet/g$ho
    //   5823: dup
    //   5824: invokespecial 866	org/vidogram/tgnet/g$ho:<init>	()V
    //   5827: astore_1
    //   5828: aload_1
    //   5829: aload 7
    //   5831: getfield 755	org/vidogram/tgnet/g$ar:F	I
    //   5834: putfield 838	org/vidogram/tgnet/g$gi:c	I
    //   5837: goto -228 -> 5609
    //   5840: new 868	org/vidogram/tgnet/g$hp
    //   5843: dup
    //   5844: invokespecial 869	org/vidogram/tgnet/g$hp:<init>	()V
    //   5847: astore_1
    //   5848: aload_1
    //   5849: bipush 15
    //   5851: newarray byte
    //   5853: putfield 872	org/vidogram/tgnet/g$gi:g	[B
    //   5856: getstatic 730	org/vidogram/messenger/Utilities:b	Ljava/security/SecureRandom;
    //   5859: aload_1
    //   5860: getfield 872	org/vidogram/tgnet/g$gi:g	[B
    //   5863: invokevirtual 876	java/security/SecureRandom:nextBytes	([B)V
    //   5866: goto -257 -> 5609
    //   5869: aload_1
    //   5870: new 1049	org/vidogram/tgnet/g$he
    //   5873: dup
    //   5874: invokespecial 1050	org/vidogram/tgnet/g$he:<init>	()V
    //   5877: putfield 852	org/vidogram/tgnet/g$gi:e	Lorg/vidogram/tgnet/g$p;
    //   5880: goto -131 -> 5749
    //   5883: aload 24
    //   5885: getfield 535	org/vidogram/tgnet/g$rp:h	Ljava/util/ArrayList;
    //   5888: iconst_0
    //   5889: invokevirtual 541	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   5892: checkcast 543	org/vidogram/tgnet/g$az
    //   5895: astore 4
    //   5897: aload 24
    //   5899: getfield 535	org/vidogram/tgnet/g$rp:h	Ljava/util/ArrayList;
    //   5902: aload 24
    //   5904: getfield 535	org/vidogram/tgnet/g$rp:h	Ljava/util/ArrayList;
    //   5907: invokevirtual 538	java/util/ArrayList:size	()I
    //   5910: iconst_1
    //   5911: isub
    //   5912: invokevirtual 541	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   5915: checkcast 543	org/vidogram/tgnet/g$az
    //   5918: astore_3
    //   5919: aload 4
    //   5921: invokestatic 1055	org/vidogram/messenger/p:a	(Lorg/vidogram/tgnet/g$az;)V
    //   5924: aload 26
    //   5926: getfield 471	org/vidogram/tgnet/g$t:o	I
    //   5929: invokestatic 476	org/vidogram/messenger/a:c	(I)I
    //   5932: bipush 46
    //   5934: if_icmplt +221 -> 6155
    //   5937: aload_1
    //   5938: new 1057	org/vidogram/tgnet/g$hf
    //   5941: dup
    //   5942: invokespecial 1058	org/vidogram/tgnet/g$hf:<init>	()V
    //   5945: putfield 852	org/vidogram/tgnet/g$gi:e	Lorg/vidogram/tgnet/g$p;
    //   5948: aload_1
    //   5949: getfield 852	org/vidogram/tgnet/g$gi:e	Lorg/vidogram/tgnet/g$p;
    //   5952: astore 5
    //   5954: aload 24
    //   5956: getfield 522	org/vidogram/tgnet/g$rp:f	Ljava/lang/String;
    //   5959: ifnull +2849 -> 8808
    //   5962: aload 24
    //   5964: getfield 522	org/vidogram/tgnet/g$rp:f	Ljava/lang/String;
    //   5967: astore_2
    //   5968: aload 5
    //   5970: aload_2
    //   5971: putfield 1059	org/vidogram/tgnet/g$p:p	Ljava/lang/String;
    //   5974: aload 4
    //   5976: getfield 1060	org/vidogram/tgnet/g$az:g	[B
    //   5979: ifnull +160 -> 6139
    //   5982: aload_1
    //   5983: getfield 852	org/vidogram/tgnet/g$gi:e	Lorg/vidogram/tgnet/g$p;
    //   5986: checkcast 1057	org/vidogram/tgnet/g$hf
    //   5989: aload 4
    //   5991: getfield 1060	org/vidogram/tgnet/g$az:g	[B
    //   5994: putfield 1062	org/vidogram/tgnet/g$hf:D	[B
    //   5997: aload_1
    //   5998: getfield 852	org/vidogram/tgnet/g$gi:e	Lorg/vidogram/tgnet/g$p;
    //   6001: aload 4
    //   6003: getfield 1063	org/vidogram/tgnet/g$az:e	I
    //   6006: putfield 1064	org/vidogram/tgnet/g$p:n	I
    //   6009: aload_1
    //   6010: getfield 852	org/vidogram/tgnet/g$gi:e	Lorg/vidogram/tgnet/g$p;
    //   6013: aload 4
    //   6015: getfield 1065	org/vidogram/tgnet/g$az:d	I
    //   6018: putfield 1067	org/vidogram/tgnet/g$p:m	I
    //   6021: aload_1
    //   6022: getfield 852	org/vidogram/tgnet/g$gi:e	Lorg/vidogram/tgnet/g$p;
    //   6025: aload_3
    //   6026: getfield 1065	org/vidogram/tgnet/g$az:d	I
    //   6029: putfield 1069	org/vidogram/tgnet/g$p:r	I
    //   6032: aload_1
    //   6033: getfield 852	org/vidogram/tgnet/g$gi:e	Lorg/vidogram/tgnet/g$p;
    //   6036: aload_3
    //   6037: getfield 1063	org/vidogram/tgnet/g$az:e	I
    //   6040: putfield 1070	org/vidogram/tgnet/g$p:s	I
    //   6043: aload_1
    //   6044: getfield 852	org/vidogram/tgnet/g$gi:e	Lorg/vidogram/tgnet/g$p;
    //   6047: aload_3
    //   6048: getfield 1071	org/vidogram/tgnet/g$az:f	I
    //   6051: putfield 1072	org/vidogram/tgnet/g$p:d	I
    //   6054: aload_3
    //   6055: getfield 546	org/vidogram/tgnet/g$az:c	Lorg/vidogram/tgnet/g$x;
    //   6058: getfield 1076	org/vidogram/tgnet/g$x:f	[B
    //   6061: ifnonnull +178 -> 6239
    //   6064: new 70	org/vidogram/messenger/ac$a
    //   6067: dup
    //   6068: aload_0
    //   6069: invokespecial 936	org/vidogram/messenger/ac$a:<init>	(Lorg/vidogram/messenger/ac;)V
    //   6072: astore_2
    //   6073: aload_2
    //   6074: aload 27
    //   6076: putfield 937	org/vidogram/messenger/ac$a:d	Ljava/lang/String;
    //   6079: aload_2
    //   6080: aload_1
    //   6081: putfield 1079	org/vidogram/messenger/ac$a:b	Lorg/vidogram/tgnet/g$gi;
    //   6084: aload_2
    //   6085: iconst_0
    //   6086: putfield 938	org/vidogram/messenger/ac$a:c	I
    //   6089: aload_2
    //   6090: aload 16
    //   6092: putfield 940	org/vidogram/messenger/ac$a:h	Lorg/vidogram/messenger/u;
    //   6095: aload_2
    //   6096: aload 26
    //   6098: putfield 1082	org/vidogram/messenger/ac$a:i	Lorg/vidogram/tgnet/g$t;
    //   6101: aload 10
    //   6103: ifnull +105 -> 6208
    //   6106: aload 10
    //   6108: invokevirtual 249	java/lang/String:length	()I
    //   6111: ifle +97 -> 6208
    //   6114: aload 10
    //   6116: ldc_w 529
    //   6119: invokevirtual 533	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   6122: ifeq +86 -> 6208
    //   6125: aload_2
    //   6126: aload 10
    //   6128: putfield 941	org/vidogram/messenger/ac$a:g	Ljava/lang/String;
    //   6131: aload_0
    //   6132: aload_2
    //   6133: invokespecial 1031	org/vidogram/messenger/ac:a	(Lorg/vidogram/messenger/ac$a;)V
    //   6136: goto -341 -> 5795
    //   6139: aload_1
    //   6140: getfield 852	org/vidogram/tgnet/g$gi:e	Lorg/vidogram/tgnet/g$p;
    //   6143: checkcast 1057	org/vidogram/tgnet/g$hf
    //   6146: iconst_0
    //   6147: newarray byte
    //   6149: putfield 1062	org/vidogram/tgnet/g$hf:D	[B
    //   6152: goto -155 -> 5997
    //   6155: aload_1
    //   6156: new 1084	org/vidogram/tgnet/g$hg
    //   6159: dup
    //   6160: invokespecial 1085	org/vidogram/tgnet/g$hg:<init>	()V
    //   6163: putfield 852	org/vidogram/tgnet/g$gi:e	Lorg/vidogram/tgnet/g$p;
    //   6166: aload 4
    //   6168: getfield 1060	org/vidogram/tgnet/g$az:g	[B
    //   6171: ifnull +21 -> 6192
    //   6174: aload_1
    //   6175: getfield 852	org/vidogram/tgnet/g$gi:e	Lorg/vidogram/tgnet/g$p;
    //   6178: checkcast 1084	org/vidogram/tgnet/g$hg
    //   6181: aload 4
    //   6183: getfield 1060	org/vidogram/tgnet/g$az:g	[B
    //   6186: putfield 1087	org/vidogram/tgnet/g$hg:F	[B
    //   6189: goto -192 -> 5997
    //   6192: aload_1
    //   6193: getfield 852	org/vidogram/tgnet/g$gi:e	Lorg/vidogram/tgnet/g$p;
    //   6196: checkcast 1084	org/vidogram/tgnet/g$hg
    //   6199: iconst_0
    //   6200: newarray byte
    //   6202: putfield 1087	org/vidogram/tgnet/g$hg:F	[B
    //   6205: goto -208 -> 5997
    //   6208: aload_2
    //   6209: aload 24
    //   6211: getfield 535	org/vidogram/tgnet/g$rp:h	Ljava/util/ArrayList;
    //   6214: aload 24
    //   6216: getfield 535	org/vidogram/tgnet/g$rp:h	Ljava/util/ArrayList;
    //   6219: invokevirtual 538	java/util/ArrayList:size	()I
    //   6222: iconst_1
    //   6223: isub
    //   6224: invokevirtual 541	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   6227: checkcast 543	org/vidogram/tgnet/g$az
    //   6230: getfield 546	org/vidogram/tgnet/g$az:c	Lorg/vidogram/tgnet/g$x;
    //   6233: putfield 943	org/vidogram/messenger/ac$a:e	Lorg/vidogram/tgnet/g$x;
    //   6236: goto -105 -> 6131
    //   6239: new 1089	org/vidogram/tgnet/g$jr
    //   6242: dup
    //   6243: invokespecial 1090	org/vidogram/tgnet/g$jr:<init>	()V
    //   6246: astore_2
    //   6247: aload_2
    //   6248: aload_3
    //   6249: getfield 546	org/vidogram/tgnet/g$az:c	Lorg/vidogram/tgnet/g$x;
    //   6252: getfield 1091	org/vidogram/tgnet/g$x:c	J
    //   6255: putfield 1092	org/vidogram/tgnet/g$jr:b	J
    //   6258: aload_2
    //   6259: aload_3
    //   6260: getfield 546	org/vidogram/tgnet/g$az:c	Lorg/vidogram/tgnet/g$x;
    //   6263: getfield 1094	org/vidogram/tgnet/g$x:e	J
    //   6266: putfield 1095	org/vidogram/tgnet/g$jr:c	J
    //   6269: aload_1
    //   6270: getfield 852	org/vidogram/tgnet/g$gi:e	Lorg/vidogram/tgnet/g$p;
    //   6273: aload_3
    //   6274: getfield 546	org/vidogram/tgnet/g$az:c	Lorg/vidogram/tgnet/g$x;
    //   6277: getfield 1076	org/vidogram/tgnet/g$x:f	[B
    //   6280: putfield 1097	org/vidogram/tgnet/g$p:e	[B
    //   6283: aload_1
    //   6284: getfield 852	org/vidogram/tgnet/g$gi:e	Lorg/vidogram/tgnet/g$p;
    //   6287: aload_3
    //   6288: getfield 546	org/vidogram/tgnet/g$az:c	Lorg/vidogram/tgnet/g$x;
    //   6291: getfield 1098	org/vidogram/tgnet/g$x:g	[B
    //   6294: putfield 1099	org/vidogram/tgnet/g$p:f	[B
    //   6297: invokestatic 860	org/vidogram/messenger/ab:a	()Lorg/vidogram/messenger/ab;
    //   6300: aload_1
    //   6301: aload 16
    //   6303: getfield 325	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   6306: aload 26
    //   6308: aload_2
    //   6309: aconst_null
    //   6310: aload 16
    //   6312: invokevirtual 863	org/vidogram/messenger/ab:a	(Lorg/vidogram/tgnet/g$n;Lorg/vidogram/tgnet/g$ar;Lorg/vidogram/tgnet/g$t;Lorg/vidogram/tgnet/g$ac;Ljava/lang/String;Lorg/vidogram/messenger/u;)V
    //   6315: goto -520 -> 5795
    //   6318: iload 18
    //   6320: iconst_3
    //   6321: if_icmpne +606 -> 6927
    //   6324: aload 6
    //   6326: getfield 962	org/vidogram/tgnet/g$hs:i	Lorg/vidogram/tgnet/g$az;
    //   6329: invokestatic 1055	org/vidogram/messenger/p:a	(Lorg/vidogram/tgnet/g$az;)V
    //   6332: aload 26
    //   6334: getfield 471	org/vidogram/tgnet/g$t:o	I
    //   6337: invokestatic 476	org/vidogram/messenger/a:c	(I)I
    //   6340: bipush 46
    //   6342: if_icmplt +367 -> 6709
    //   6345: aload 6
    //   6347: invokestatic 1101	org/vidogram/messenger/u:b	(Lorg/vidogram/tgnet/g$q;)Z
    //   6350: ifeq +292 -> 6642
    //   6353: aload_1
    //   6354: new 1103	org/vidogram/tgnet/g$ha
    //   6357: dup
    //   6358: invokespecial 1104	org/vidogram/tgnet/g$ha:<init>	()V
    //   6361: putfield 852	org/vidogram/tgnet/g$gi:e	Lorg/vidogram/tgnet/g$p;
    //   6364: aload_1
    //   6365: getfield 852	org/vidogram/tgnet/g$gi:e	Lorg/vidogram/tgnet/g$p;
    //   6368: aload 6
    //   6370: getfield 575	org/vidogram/tgnet/g$hs:o	Ljava/util/ArrayList;
    //   6373: putfield 1105	org/vidogram/tgnet/g$p:o	Ljava/util/ArrayList;
    //   6376: aload 6
    //   6378: getfield 962	org/vidogram/tgnet/g$hs:i	Lorg/vidogram/tgnet/g$az;
    //   6381: ifnull +245 -> 6626
    //   6384: aload 6
    //   6386: getfield 962	org/vidogram/tgnet/g$hs:i	Lorg/vidogram/tgnet/g$az;
    //   6389: getfield 1060	org/vidogram/tgnet/g$az:g	[B
    //   6392: ifnull +234 -> 6626
    //   6395: aload_1
    //   6396: getfield 852	org/vidogram/tgnet/g$gi:e	Lorg/vidogram/tgnet/g$p;
    //   6399: checkcast 1103	org/vidogram/tgnet/g$ha
    //   6402: aload 6
    //   6404: getfield 962	org/vidogram/tgnet/g$hs:i	Lorg/vidogram/tgnet/g$az;
    //   6407: getfield 1060	org/vidogram/tgnet/g$az:g	[B
    //   6410: putfield 1106	org/vidogram/tgnet/g$ha:D	[B
    //   6413: aload_1
    //   6414: getfield 852	org/vidogram/tgnet/g$gi:e	Lorg/vidogram/tgnet/g$p;
    //   6417: astore_3
    //   6418: aload 6
    //   6420: getfield 566	org/vidogram/tgnet/g$hs:n	Ljava/lang/String;
    //   6423: ifnull +2392 -> 8815
    //   6426: aload 6
    //   6428: getfield 566	org/vidogram/tgnet/g$hs:n	Ljava/lang/String;
    //   6431: astore_2
    //   6432: aload_3
    //   6433: aload_2
    //   6434: putfield 1059	org/vidogram/tgnet/g$p:p	Ljava/lang/String;
    //   6437: aload_1
    //   6438: getfield 852	org/vidogram/tgnet/g$gi:e	Lorg/vidogram/tgnet/g$p;
    //   6441: ldc_w 1108
    //   6444: putfield 1109	org/vidogram/tgnet/g$p:c	Ljava/lang/String;
    //   6447: aload_1
    //   6448: getfield 852	org/vidogram/tgnet/g$gi:e	Lorg/vidogram/tgnet/g$p;
    //   6451: aload 6
    //   6453: getfield 1110	org/vidogram/tgnet/g$hs:h	I
    //   6456: putfield 1072	org/vidogram/tgnet/g$p:d	I
    //   6459: iconst_0
    //   6460: istore 18
    //   6462: iload 18
    //   6464: aload 6
    //   6466: getfield 575	org/vidogram/tgnet/g$hs:o	Ljava/util/ArrayList;
    //   6469: invokevirtual 538	java/util/ArrayList:size	()I
    //   6472: if_icmpge +57 -> 6529
    //   6475: aload 6
    //   6477: getfield 575	org/vidogram/tgnet/g$hs:o	Ljava/util/ArrayList;
    //   6480: iload 18
    //   6482: invokevirtual 541	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   6485: checkcast 577	org/vidogram/tgnet/g$r
    //   6488: astore_2
    //   6489: aload_2
    //   6490: instanceof 771
    //   6493: ifeq +2329 -> 8822
    //   6496: aload_1
    //   6497: getfield 852	org/vidogram/tgnet/g$gi:e	Lorg/vidogram/tgnet/g$p;
    //   6500: aload_2
    //   6501: getfield 1111	org/vidogram/tgnet/g$r:h	I
    //   6504: putfield 1069	org/vidogram/tgnet/g$p:r	I
    //   6507: aload_1
    //   6508: getfield 852	org/vidogram/tgnet/g$gi:e	Lorg/vidogram/tgnet/g$p;
    //   6511: aload_2
    //   6512: getfield 1112	org/vidogram/tgnet/g$r:i	I
    //   6515: putfield 1070	org/vidogram/tgnet/g$p:s	I
    //   6518: aload_1
    //   6519: getfield 852	org/vidogram/tgnet/g$gi:e	Lorg/vidogram/tgnet/g$p;
    //   6522: aload_2
    //   6523: getfield 761	org/vidogram/tgnet/g$r:d	I
    //   6526: putfield 1113	org/vidogram/tgnet/g$p:b	I
    //   6529: aload_1
    //   6530: getfield 852	org/vidogram/tgnet/g$gi:e	Lorg/vidogram/tgnet/g$p;
    //   6533: aload 6
    //   6535: getfield 962	org/vidogram/tgnet/g$hs:i	Lorg/vidogram/tgnet/g$az;
    //   6538: getfield 1063	org/vidogram/tgnet/g$az:e	I
    //   6541: putfield 1064	org/vidogram/tgnet/g$p:n	I
    //   6544: aload_1
    //   6545: getfield 852	org/vidogram/tgnet/g$gi:e	Lorg/vidogram/tgnet/g$p;
    //   6548: aload 6
    //   6550: getfield 962	org/vidogram/tgnet/g$hs:i	Lorg/vidogram/tgnet/g$az;
    //   6553: getfield 1065	org/vidogram/tgnet/g$az:d	I
    //   6556: putfield 1067	org/vidogram/tgnet/g$p:m	I
    //   6559: aload 6
    //   6561: getfield 959	org/vidogram/tgnet/g$hs:c	J
    //   6564: lconst_0
    //   6565: lcmp
    //   6566: ifne +290 -> 6856
    //   6569: new 70	org/vidogram/messenger/ac$a
    //   6572: dup
    //   6573: aload_0
    //   6574: invokespecial 936	org/vidogram/messenger/ac$a:<init>	(Lorg/vidogram/messenger/ac;)V
    //   6577: astore_2
    //   6578: aload_2
    //   6579: aload 27
    //   6581: putfield 937	org/vidogram/messenger/ac$a:d	Ljava/lang/String;
    //   6584: aload_2
    //   6585: aload_1
    //   6586: putfield 1079	org/vidogram/messenger/ac$a:b	Lorg/vidogram/tgnet/g$gi;
    //   6589: aload_2
    //   6590: iconst_1
    //   6591: putfield 938	org/vidogram/messenger/ac$a:c	I
    //   6594: aload_2
    //   6595: aload 16
    //   6597: putfield 940	org/vidogram/messenger/ac$a:h	Lorg/vidogram/messenger/u;
    //   6600: aload_2
    //   6601: aload 26
    //   6603: putfield 1082	org/vidogram/messenger/ac$a:i	Lorg/vidogram/tgnet/g$t;
    //   6606: aload_2
    //   6607: aload 6
    //   6609: putfield 971	org/vidogram/messenger/ac$a:f	Lorg/vidogram/tgnet/g$hs;
    //   6612: aload_2
    //   6613: aload 4
    //   6615: putfield 974	org/vidogram/messenger/ac$a:j	Lorg/vidogram/messenger/af;
    //   6618: aload_0
    //   6619: aload_2
    //   6620: invokespecial 1031	org/vidogram/messenger/ac:a	(Lorg/vidogram/messenger/ac$a;)V
    //   6623: goto -828 -> 5795
    //   6626: aload_1
    //   6627: getfield 852	org/vidogram/tgnet/g$gi:e	Lorg/vidogram/tgnet/g$p;
    //   6630: checkcast 1103	org/vidogram/tgnet/g$ha
    //   6633: iconst_0
    //   6634: newarray byte
    //   6636: putfield 1106	org/vidogram/tgnet/g$ha:D	[B
    //   6639: goto -226 -> 6413
    //   6642: aload_1
    //   6643: new 1115	org/vidogram/tgnet/g$hi
    //   6646: dup
    //   6647: invokespecial 1116	org/vidogram/tgnet/g$hi:<init>	()V
    //   6650: putfield 852	org/vidogram/tgnet/g$gi:e	Lorg/vidogram/tgnet/g$p;
    //   6653: aload 6
    //   6655: getfield 962	org/vidogram/tgnet/g$hs:i	Lorg/vidogram/tgnet/g$az;
    //   6658: ifnull +35 -> 6693
    //   6661: aload 6
    //   6663: getfield 962	org/vidogram/tgnet/g$hs:i	Lorg/vidogram/tgnet/g$az;
    //   6666: getfield 1060	org/vidogram/tgnet/g$az:g	[B
    //   6669: ifnull +24 -> 6693
    //   6672: aload_1
    //   6673: getfield 852	org/vidogram/tgnet/g$gi:e	Lorg/vidogram/tgnet/g$p;
    //   6676: checkcast 1115	org/vidogram/tgnet/g$hi
    //   6679: aload 6
    //   6681: getfield 962	org/vidogram/tgnet/g$hs:i	Lorg/vidogram/tgnet/g$az;
    //   6684: getfield 1060	org/vidogram/tgnet/g$az:g	[B
    //   6687: putfield 1117	org/vidogram/tgnet/g$hi:D	[B
    //   6690: goto -277 -> 6413
    //   6693: aload_1
    //   6694: getfield 852	org/vidogram/tgnet/g$gi:e	Lorg/vidogram/tgnet/g$p;
    //   6697: checkcast 1115	org/vidogram/tgnet/g$hi
    //   6700: iconst_0
    //   6701: newarray byte
    //   6703: putfield 1117	org/vidogram/tgnet/g$hi:D	[B
    //   6706: goto -293 -> 6413
    //   6709: aload 26
    //   6711: getfield 471	org/vidogram/tgnet/g$t:o	I
    //   6714: invokestatic 476	org/vidogram/messenger/a:c	(I)I
    //   6717: bipush 17
    //   6719: if_icmplt +70 -> 6789
    //   6722: aload_1
    //   6723: new 1119	org/vidogram/tgnet/g$hj
    //   6726: dup
    //   6727: invokespecial 1120	org/vidogram/tgnet/g$hj:<init>	()V
    //   6730: putfield 852	org/vidogram/tgnet/g$gi:e	Lorg/vidogram/tgnet/g$p;
    //   6733: aload 6
    //   6735: getfield 962	org/vidogram/tgnet/g$hs:i	Lorg/vidogram/tgnet/g$az;
    //   6738: ifnull +35 -> 6773
    //   6741: aload 6
    //   6743: getfield 962	org/vidogram/tgnet/g$hs:i	Lorg/vidogram/tgnet/g$az;
    //   6746: getfield 1060	org/vidogram/tgnet/g$az:g	[B
    //   6749: ifnull +24 -> 6773
    //   6752: aload_1
    //   6753: getfield 852	org/vidogram/tgnet/g$gi:e	Lorg/vidogram/tgnet/g$p;
    //   6756: checkcast 1119	org/vidogram/tgnet/g$hj
    //   6759: aload 6
    //   6761: getfield 962	org/vidogram/tgnet/g$hs:i	Lorg/vidogram/tgnet/g$az;
    //   6764: getfield 1060	org/vidogram/tgnet/g$az:g	[B
    //   6767: putfield 1121	org/vidogram/tgnet/g$hj:F	[B
    //   6770: goto -357 -> 6413
    //   6773: aload_1
    //   6774: getfield 852	org/vidogram/tgnet/g$gi:e	Lorg/vidogram/tgnet/g$p;
    //   6777: checkcast 1119	org/vidogram/tgnet/g$hj
    //   6780: iconst_0
    //   6781: newarray byte
    //   6783: putfield 1121	org/vidogram/tgnet/g$hj:F	[B
    //   6786: goto -373 -> 6413
    //   6789: aload_1
    //   6790: new 1123	org/vidogram/tgnet/g$hk
    //   6793: dup
    //   6794: invokespecial 1124	org/vidogram/tgnet/g$hk:<init>	()V
    //   6797: putfield 852	org/vidogram/tgnet/g$gi:e	Lorg/vidogram/tgnet/g$p;
    //   6800: aload 6
    //   6802: getfield 962	org/vidogram/tgnet/g$hs:i	Lorg/vidogram/tgnet/g$az;
    //   6805: ifnull +35 -> 6840
    //   6808: aload 6
    //   6810: getfield 962	org/vidogram/tgnet/g$hs:i	Lorg/vidogram/tgnet/g$az;
    //   6813: getfield 1060	org/vidogram/tgnet/g$az:g	[B
    //   6816: ifnull +24 -> 6840
    //   6819: aload_1
    //   6820: getfield 852	org/vidogram/tgnet/g$gi:e	Lorg/vidogram/tgnet/g$p;
    //   6823: checkcast 1123	org/vidogram/tgnet/g$hk
    //   6826: aload 6
    //   6828: getfield 962	org/vidogram/tgnet/g$hs:i	Lorg/vidogram/tgnet/g$az;
    //   6831: getfield 1060	org/vidogram/tgnet/g$az:g	[B
    //   6834: putfield 1125	org/vidogram/tgnet/g$hk:F	[B
    //   6837: goto -424 -> 6413
    //   6840: aload_1
    //   6841: getfield 852	org/vidogram/tgnet/g$gi:e	Lorg/vidogram/tgnet/g$p;
    //   6844: checkcast 1123	org/vidogram/tgnet/g$hk
    //   6847: iconst_0
    //   6848: newarray byte
    //   6850: putfield 1125	org/vidogram/tgnet/g$hk:F	[B
    //   6853: goto -440 -> 6413
    //   6856: new 1089	org/vidogram/tgnet/g$jr
    //   6859: dup
    //   6860: invokespecial 1090	org/vidogram/tgnet/g$jr:<init>	()V
    //   6863: astore_2
    //   6864: aload_2
    //   6865: aload 6
    //   6867: getfield 988	org/vidogram/tgnet/g$hs:b	J
    //   6870: putfield 1092	org/vidogram/tgnet/g$jr:b	J
    //   6873: aload_2
    //   6874: aload 6
    //   6876: getfield 959	org/vidogram/tgnet/g$hs:c	J
    //   6879: putfield 1095	org/vidogram/tgnet/g$jr:c	J
    //   6882: aload_1
    //   6883: getfield 852	org/vidogram/tgnet/g$gi:e	Lorg/vidogram/tgnet/g$p;
    //   6886: aload 6
    //   6888: getfield 1127	org/vidogram/tgnet/g$hs:l	[B
    //   6891: putfield 1097	org/vidogram/tgnet/g$p:e	[B
    //   6894: aload_1
    //   6895: getfield 852	org/vidogram/tgnet/g$gi:e	Lorg/vidogram/tgnet/g$p;
    //   6898: aload 6
    //   6900: getfield 1129	org/vidogram/tgnet/g$hs:m	[B
    //   6903: putfield 1099	org/vidogram/tgnet/g$p:f	[B
    //   6906: invokestatic 860	org/vidogram/messenger/ab:a	()Lorg/vidogram/messenger/ab;
    //   6909: aload_1
    //   6910: aload 16
    //   6912: getfield 325	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   6915: aload 26
    //   6917: aload_2
    //   6918: aconst_null
    //   6919: aload 16
    //   6921: invokevirtual 863	org/vidogram/messenger/ab:a	(Lorg/vidogram/tgnet/g$n;Lorg/vidogram/tgnet/g$ar;Lorg/vidogram/tgnet/g$t;Lorg/vidogram/tgnet/g$ac;Ljava/lang/String;Lorg/vidogram/messenger/u;)V
    //   6924: goto -1129 -> 5795
    //   6927: iload 18
    //   6929: bipush 6
    //   6931: if_icmpne +1900 -> 8831
    //   6934: aload_1
    //   6935: new 1131	org/vidogram/tgnet/g$gz
    //   6938: dup
    //   6939: invokespecial 1132	org/vidogram/tgnet/g$gz:<init>	()V
    //   6942: putfield 852	org/vidogram/tgnet/g$gi:e	Lorg/vidogram/tgnet/g$p;
    //   6945: aload_1
    //   6946: getfield 852	org/vidogram/tgnet/g$gi:e	Lorg/vidogram/tgnet/g$p;
    //   6949: aload 5
    //   6951: getfield 454	org/vidogram/tgnet/g$vw:i	Ljava/lang/String;
    //   6954: putfield 1133	org/vidogram/tgnet/g$p:i	Ljava/lang/String;
    //   6957: aload_1
    //   6958: getfield 852	org/vidogram/tgnet/g$gi:e	Lorg/vidogram/tgnet/g$p;
    //   6961: aload 5
    //   6963: getfield 458	org/vidogram/tgnet/g$vw:e	Ljava/lang/String;
    //   6966: putfield 1134	org/vidogram/tgnet/g$p:j	Ljava/lang/String;
    //   6969: aload_1
    //   6970: getfield 852	org/vidogram/tgnet/g$gi:e	Lorg/vidogram/tgnet/g$p;
    //   6973: aload 5
    //   6975: getfield 463	org/vidogram/tgnet/g$vw:f	Ljava/lang/String;
    //   6978: putfield 1136	org/vidogram/tgnet/g$p:k	Ljava/lang/String;
    //   6981: aload_1
    //   6982: getfield 852	org/vidogram/tgnet/g$gi:e	Lorg/vidogram/tgnet/g$p;
    //   6985: aload 5
    //   6987: getfield 467	org/vidogram/tgnet/g$vw:d	I
    //   6990: putfield 1138	org/vidogram/tgnet/g$p:l	I
    //   6993: invokestatic 860	org/vidogram/messenger/ab:a	()Lorg/vidogram/messenger/ab;
    //   6996: aload_1
    //   6997: aload 16
    //   6999: getfield 325	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   7002: aload 26
    //   7004: aconst_null
    //   7005: aconst_null
    //   7006: aload 16
    //   7008: invokevirtual 863	org/vidogram/messenger/ab:a	(Lorg/vidogram/tgnet/g$n;Lorg/vidogram/tgnet/g$ar;Lorg/vidogram/tgnet/g$t;Lorg/vidogram/tgnet/g$ac;Ljava/lang/String;Lorg/vidogram/messenger/u;)V
    //   7011: goto -1216 -> 5795
    //   7014: aload 6
    //   7016: invokestatic 570	org/vidogram/messenger/u:c	(Lorg/vidogram/tgnet/g$q;)Z
    //   7019: ifeq +178 -> 7197
    //   7022: aload_1
    //   7023: new 1140	org/vidogram/tgnet/g$hd
    //   7026: dup
    //   7027: invokespecial 1141	org/vidogram/tgnet/g$hd:<init>	()V
    //   7030: putfield 852	org/vidogram/tgnet/g$gi:e	Lorg/vidogram/tgnet/g$p;
    //   7033: aload_1
    //   7034: getfield 852	org/vidogram/tgnet/g$gi:e	Lorg/vidogram/tgnet/g$p;
    //   7037: aload 6
    //   7039: getfield 988	org/vidogram/tgnet/g$hs:b	J
    //   7042: putfield 1143	org/vidogram/tgnet/g$p:y	J
    //   7045: aload_1
    //   7046: getfield 852	org/vidogram/tgnet/g$gi:e	Lorg/vidogram/tgnet/g$p;
    //   7049: aload 6
    //   7051: getfield 1144	org/vidogram/tgnet/g$hs:e	I
    //   7054: putfield 1146	org/vidogram/tgnet/g$p:A	I
    //   7057: aload_1
    //   7058: getfield 852	org/vidogram/tgnet/g$gi:e	Lorg/vidogram/tgnet/g$p;
    //   7061: aload 6
    //   7063: getfield 959	org/vidogram/tgnet/g$hs:c	J
    //   7066: putfield 1149	org/vidogram/tgnet/g$p:z	J
    //   7069: aload_1
    //   7070: getfield 852	org/vidogram/tgnet/g$gi:e	Lorg/vidogram/tgnet/g$p;
    //   7073: aload 6
    //   7075: getfield 966	org/vidogram/tgnet/g$hs:g	Ljava/lang/String;
    //   7078: putfield 1109	org/vidogram/tgnet/g$p:c	Ljava/lang/String;
    //   7081: aload_1
    //   7082: getfield 852	org/vidogram/tgnet/g$gi:e	Lorg/vidogram/tgnet/g$p;
    //   7085: aload 6
    //   7087: getfield 1110	org/vidogram/tgnet/g$hs:h	I
    //   7090: putfield 1072	org/vidogram/tgnet/g$p:d	I
    //   7093: aload_1
    //   7094: getfield 852	org/vidogram/tgnet/g$gi:e	Lorg/vidogram/tgnet/g$p;
    //   7097: aload 6
    //   7099: getfield 567	org/vidogram/tgnet/g$hs:k	I
    //   7102: putfield 1151	org/vidogram/tgnet/g$p:B	I
    //   7105: aload_1
    //   7106: getfield 852	org/vidogram/tgnet/g$gi:e	Lorg/vidogram/tgnet/g$p;
    //   7109: aload 6
    //   7111: getfield 575	org/vidogram/tgnet/g$hs:o	Ljava/util/ArrayList;
    //   7114: putfield 1105	org/vidogram/tgnet/g$p:o	Ljava/util/ArrayList;
    //   7117: aload 6
    //   7119: getfield 962	org/vidogram/tgnet/g$hs:i	Lorg/vidogram/tgnet/g$az;
    //   7122: ifnonnull +57 -> 7179
    //   7125: aload_1
    //   7126: getfield 852	org/vidogram/tgnet/g$gi:e	Lorg/vidogram/tgnet/g$p;
    //   7129: checkcast 1140	org/vidogram/tgnet/g$hd
    //   7132: new 1153	org/vidogram/tgnet/g$rt
    //   7135: dup
    //   7136: invokespecial 1154	org/vidogram/tgnet/g$rt:<init>	()V
    //   7139: putfield 1156	org/vidogram/tgnet/g$hd:D	Lorg/vidogram/tgnet/g$az;
    //   7142: aload_1
    //   7143: getfield 852	org/vidogram/tgnet/g$gi:e	Lorg/vidogram/tgnet/g$p;
    //   7146: checkcast 1140	org/vidogram/tgnet/g$hd
    //   7149: getfield 1156	org/vidogram/tgnet/g$hd:D	Lorg/vidogram/tgnet/g$az;
    //   7152: ldc_w 1157
    //   7155: putfield 1158	org/vidogram/tgnet/g$az:b	Ljava/lang/String;
    //   7158: invokestatic 860	org/vidogram/messenger/ab:a	()Lorg/vidogram/messenger/ab;
    //   7161: aload_1
    //   7162: aload 16
    //   7164: getfield 325	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   7167: aload 26
    //   7169: aconst_null
    //   7170: aconst_null
    //   7171: aload 16
    //   7173: invokevirtual 863	org/vidogram/messenger/ab:a	(Lorg/vidogram/tgnet/g$n;Lorg/vidogram/tgnet/g$ar;Lorg/vidogram/tgnet/g$t;Lorg/vidogram/tgnet/g$ac;Ljava/lang/String;Lorg/vidogram/messenger/u;)V
    //   7176: goto -1381 -> 5795
    //   7179: aload_1
    //   7180: getfield 852	org/vidogram/tgnet/g$gi:e	Lorg/vidogram/tgnet/g$p;
    //   7183: checkcast 1140	org/vidogram/tgnet/g$hd
    //   7186: aload 6
    //   7188: getfield 962	org/vidogram/tgnet/g$hs:i	Lorg/vidogram/tgnet/g$az;
    //   7191: putfield 1156	org/vidogram/tgnet/g$hd:D	Lorg/vidogram/tgnet/g$az;
    //   7194: goto -36 -> 7158
    //   7197: aload 6
    //   7199: getfield 962	org/vidogram/tgnet/g$hs:i	Lorg/vidogram/tgnet/g$az;
    //   7202: invokestatic 1055	org/vidogram/messenger/p:a	(Lorg/vidogram/tgnet/g$az;)V
    //   7205: aload 26
    //   7207: getfield 471	org/vidogram/tgnet/g$t:o	I
    //   7210: invokestatic 476	org/vidogram/messenger/a:c	(I)I
    //   7213: bipush 46
    //   7215: if_icmplt +262 -> 7477
    //   7218: aload_1
    //   7219: new 1103	org/vidogram/tgnet/g$ha
    //   7222: dup
    //   7223: invokespecial 1104	org/vidogram/tgnet/g$ha:<init>	()V
    //   7226: putfield 852	org/vidogram/tgnet/g$gi:e	Lorg/vidogram/tgnet/g$p;
    //   7229: aload_1
    //   7230: getfield 852	org/vidogram/tgnet/g$gi:e	Lorg/vidogram/tgnet/g$p;
    //   7233: aload 6
    //   7235: getfield 575	org/vidogram/tgnet/g$hs:o	Ljava/util/ArrayList;
    //   7238: putfield 1105	org/vidogram/tgnet/g$p:o	Ljava/util/ArrayList;
    //   7241: aload_1
    //   7242: getfield 852	org/vidogram/tgnet/g$gi:e	Lorg/vidogram/tgnet/g$p;
    //   7245: astore_3
    //   7246: aload 6
    //   7248: getfield 566	org/vidogram/tgnet/g$hs:n	Ljava/lang/String;
    //   7251: ifnull +1602 -> 8853
    //   7254: aload 6
    //   7256: getfield 566	org/vidogram/tgnet/g$hs:n	Ljava/lang/String;
    //   7259: astore_2
    //   7260: aload_3
    //   7261: aload_2
    //   7262: putfield 1059	org/vidogram/tgnet/g$p:p	Ljava/lang/String;
    //   7265: aload 6
    //   7267: getfield 962	org/vidogram/tgnet/g$hs:i	Lorg/vidogram/tgnet/g$az;
    //   7270: ifnull +175 -> 7445
    //   7273: aload 6
    //   7275: getfield 962	org/vidogram/tgnet/g$hs:i	Lorg/vidogram/tgnet/g$az;
    //   7278: getfield 1060	org/vidogram/tgnet/g$az:g	[B
    //   7281: ifnull +164 -> 7445
    //   7284: aload_1
    //   7285: getfield 852	org/vidogram/tgnet/g$gi:e	Lorg/vidogram/tgnet/g$p;
    //   7288: checkcast 1103	org/vidogram/tgnet/g$ha
    //   7291: aload 6
    //   7293: getfield 962	org/vidogram/tgnet/g$hs:i	Lorg/vidogram/tgnet/g$az;
    //   7296: getfield 1060	org/vidogram/tgnet/g$az:g	[B
    //   7299: putfield 1106	org/vidogram/tgnet/g$ha:D	[B
    //   7302: aload_1
    //   7303: getfield 852	org/vidogram/tgnet/g$gi:e	Lorg/vidogram/tgnet/g$p;
    //   7306: aload 6
    //   7308: getfield 962	org/vidogram/tgnet/g$hs:i	Lorg/vidogram/tgnet/g$az;
    //   7311: getfield 1063	org/vidogram/tgnet/g$az:e	I
    //   7314: putfield 1064	org/vidogram/tgnet/g$p:n	I
    //   7317: aload_1
    //   7318: getfield 852	org/vidogram/tgnet/g$gi:e	Lorg/vidogram/tgnet/g$p;
    //   7321: aload 6
    //   7323: getfield 962	org/vidogram/tgnet/g$hs:i	Lorg/vidogram/tgnet/g$az;
    //   7326: getfield 1065	org/vidogram/tgnet/g$az:d	I
    //   7329: putfield 1067	org/vidogram/tgnet/g$p:m	I
    //   7332: aload_1
    //   7333: getfield 852	org/vidogram/tgnet/g$gi:e	Lorg/vidogram/tgnet/g$p;
    //   7336: aload 6
    //   7338: getfield 1110	org/vidogram/tgnet/g$hs:h	I
    //   7341: putfield 1072	org/vidogram/tgnet/g$p:d	I
    //   7344: aload_1
    //   7345: getfield 852	org/vidogram/tgnet/g$gi:e	Lorg/vidogram/tgnet/g$p;
    //   7348: aload 6
    //   7350: getfield 966	org/vidogram/tgnet/g$hs:g	Ljava/lang/String;
    //   7353: putfield 1109	org/vidogram/tgnet/g$p:c	Ljava/lang/String;
    //   7356: aload 6
    //   7358: getfield 1127	org/vidogram/tgnet/g$hs:l	[B
    //   7361: ifnonnull +241 -> 7602
    //   7364: new 70	org/vidogram/messenger/ac$a
    //   7367: dup
    //   7368: aload_0
    //   7369: invokespecial 936	org/vidogram/messenger/ac$a:<init>	(Lorg/vidogram/messenger/ac;)V
    //   7372: astore_2
    //   7373: aload_2
    //   7374: aload 27
    //   7376: putfield 937	org/vidogram/messenger/ac$a:d	Ljava/lang/String;
    //   7379: aload_2
    //   7380: aload_1
    //   7381: putfield 1079	org/vidogram/messenger/ac$a:b	Lorg/vidogram/tgnet/g$gi;
    //   7384: aload_2
    //   7385: iconst_2
    //   7386: putfield 938	org/vidogram/messenger/ac$a:c	I
    //   7389: aload_2
    //   7390: aload 16
    //   7392: putfield 940	org/vidogram/messenger/ac$a:h	Lorg/vidogram/messenger/u;
    //   7395: aload_2
    //   7396: aload 26
    //   7398: putfield 1082	org/vidogram/messenger/ac$a:i	Lorg/vidogram/tgnet/g$t;
    //   7401: aload 10
    //   7403: ifnull +28 -> 7431
    //   7406: aload 10
    //   7408: invokevirtual 249	java/lang/String:length	()I
    //   7411: ifle +20 -> 7431
    //   7414: aload 10
    //   7416: ldc_w 529
    //   7419: invokevirtual 533	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   7422: ifeq +9 -> 7431
    //   7425: aload_2
    //   7426: aload 10
    //   7428: putfield 941	org/vidogram/messenger/ac$a:g	Ljava/lang/String;
    //   7431: aload_2
    //   7432: aload 6
    //   7434: putfield 971	org/vidogram/messenger/ac$a:f	Lorg/vidogram/tgnet/g$hs;
    //   7437: aload_0
    //   7438: aload_2
    //   7439: invokespecial 1031	org/vidogram/messenger/ac:a	(Lorg/vidogram/messenger/ac$a;)V
    //   7442: goto -1647 -> 5795
    //   7445: aload_1
    //   7446: getfield 852	org/vidogram/tgnet/g$gi:e	Lorg/vidogram/tgnet/g$p;
    //   7449: checkcast 1103	org/vidogram/tgnet/g$ha
    //   7452: iconst_0
    //   7453: newarray byte
    //   7455: putfield 1106	org/vidogram/tgnet/g$ha:D	[B
    //   7458: aload_1
    //   7459: getfield 852	org/vidogram/tgnet/g$gi:e	Lorg/vidogram/tgnet/g$p;
    //   7462: iconst_0
    //   7463: putfield 1064	org/vidogram/tgnet/g$p:n	I
    //   7466: aload_1
    //   7467: getfield 852	org/vidogram/tgnet/g$gi:e	Lorg/vidogram/tgnet/g$p;
    //   7470: iconst_0
    //   7471: putfield 1067	org/vidogram/tgnet/g$p:m	I
    //   7474: goto -142 -> 7332
    //   7477: aload_1
    //   7478: new 1160	org/vidogram/tgnet/g$hb
    //   7481: dup
    //   7482: invokespecial 1161	org/vidogram/tgnet/g$hb:<init>	()V
    //   7485: putfield 852	org/vidogram/tgnet/g$gi:e	Lorg/vidogram/tgnet/g$p;
    //   7488: aload_1
    //   7489: getfield 852	org/vidogram/tgnet/g$gi:e	Lorg/vidogram/tgnet/g$p;
    //   7492: aload 6
    //   7494: invokestatic 1164	org/vidogram/messenger/m:b	(Lorg/vidogram/tgnet/g$q;)Ljava/lang/String;
    //   7497: putfield 1166	org/vidogram/tgnet/g$p:t	Ljava/lang/String;
    //   7500: aload 6
    //   7502: getfield 962	org/vidogram/tgnet/g$hs:i	Lorg/vidogram/tgnet/g$az;
    //   7505: ifnull +65 -> 7570
    //   7508: aload 6
    //   7510: getfield 962	org/vidogram/tgnet/g$hs:i	Lorg/vidogram/tgnet/g$az;
    //   7513: getfield 1060	org/vidogram/tgnet/g$az:g	[B
    //   7516: ifnull +54 -> 7570
    //   7519: aload_1
    //   7520: getfield 852	org/vidogram/tgnet/g$gi:e	Lorg/vidogram/tgnet/g$p;
    //   7523: checkcast 1160	org/vidogram/tgnet/g$hb
    //   7526: aload 6
    //   7528: getfield 962	org/vidogram/tgnet/g$hs:i	Lorg/vidogram/tgnet/g$az;
    //   7531: getfield 1060	org/vidogram/tgnet/g$az:g	[B
    //   7534: putfield 1167	org/vidogram/tgnet/g$hb:F	[B
    //   7537: aload_1
    //   7538: getfield 852	org/vidogram/tgnet/g$gi:e	Lorg/vidogram/tgnet/g$p;
    //   7541: aload 6
    //   7543: getfield 962	org/vidogram/tgnet/g$hs:i	Lorg/vidogram/tgnet/g$az;
    //   7546: getfield 1063	org/vidogram/tgnet/g$az:e	I
    //   7549: putfield 1064	org/vidogram/tgnet/g$p:n	I
    //   7552: aload_1
    //   7553: getfield 852	org/vidogram/tgnet/g$gi:e	Lorg/vidogram/tgnet/g$p;
    //   7556: aload 6
    //   7558: getfield 962	org/vidogram/tgnet/g$hs:i	Lorg/vidogram/tgnet/g$az;
    //   7561: getfield 1065	org/vidogram/tgnet/g$az:d	I
    //   7564: putfield 1067	org/vidogram/tgnet/g$p:m	I
    //   7567: goto -235 -> 7332
    //   7570: aload_1
    //   7571: getfield 852	org/vidogram/tgnet/g$gi:e	Lorg/vidogram/tgnet/g$p;
    //   7574: checkcast 1160	org/vidogram/tgnet/g$hb
    //   7577: iconst_0
    //   7578: newarray byte
    //   7580: putfield 1167	org/vidogram/tgnet/g$hb:F	[B
    //   7583: aload_1
    //   7584: getfield 852	org/vidogram/tgnet/g$gi:e	Lorg/vidogram/tgnet/g$p;
    //   7587: iconst_0
    //   7588: putfield 1064	org/vidogram/tgnet/g$p:n	I
    //   7591: aload_1
    //   7592: getfield 852	org/vidogram/tgnet/g$gi:e	Lorg/vidogram/tgnet/g$p;
    //   7595: iconst_0
    //   7596: putfield 1067	org/vidogram/tgnet/g$p:m	I
    //   7599: goto -267 -> 7332
    //   7602: new 1089	org/vidogram/tgnet/g$jr
    //   7605: dup
    //   7606: invokespecial 1090	org/vidogram/tgnet/g$jr:<init>	()V
    //   7609: astore_2
    //   7610: aload_2
    //   7611: aload 6
    //   7613: getfield 988	org/vidogram/tgnet/g$hs:b	J
    //   7616: putfield 1092	org/vidogram/tgnet/g$jr:b	J
    //   7619: aload_2
    //   7620: aload 6
    //   7622: getfield 959	org/vidogram/tgnet/g$hs:c	J
    //   7625: putfield 1095	org/vidogram/tgnet/g$jr:c	J
    //   7628: aload_1
    //   7629: getfield 852	org/vidogram/tgnet/g$gi:e	Lorg/vidogram/tgnet/g$p;
    //   7632: aload 6
    //   7634: getfield 1127	org/vidogram/tgnet/g$hs:l	[B
    //   7637: putfield 1097	org/vidogram/tgnet/g$p:e	[B
    //   7640: aload_1
    //   7641: getfield 852	org/vidogram/tgnet/g$gi:e	Lorg/vidogram/tgnet/g$p;
    //   7644: aload 6
    //   7646: getfield 1129	org/vidogram/tgnet/g$hs:m	[B
    //   7649: putfield 1099	org/vidogram/tgnet/g$p:f	[B
    //   7652: invokestatic 860	org/vidogram/messenger/ab:a	()Lorg/vidogram/messenger/ab;
    //   7655: aload_1
    //   7656: aload 16
    //   7658: getfield 325	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   7661: aload 26
    //   7663: aload_2
    //   7664: aconst_null
    //   7665: aload 16
    //   7667: invokevirtual 863	org/vidogram/messenger/ab:a	(Lorg/vidogram/tgnet/g$n;Lorg/vidogram/tgnet/g$ar;Lorg/vidogram/tgnet/g$t;Lorg/vidogram/tgnet/g$ac;Ljava/lang/String;Lorg/vidogram/messenger/u;)V
    //   7670: goto -1875 -> 5795
    //   7673: iload 18
    //   7675: bipush 8
    //   7677: if_icmpne -1882 -> 5795
    //   7680: new 70	org/vidogram/messenger/ac$a
    //   7683: dup
    //   7684: aload_0
    //   7685: invokespecial 936	org/vidogram/messenger/ac$a:<init>	(Lorg/vidogram/messenger/ac;)V
    //   7688: astore_3
    //   7689: aload_3
    //   7690: aload 26
    //   7692: putfield 1082	org/vidogram/messenger/ac$a:i	Lorg/vidogram/tgnet/g$t;
    //   7695: aload_3
    //   7696: aload_1
    //   7697: putfield 1079	org/vidogram/messenger/ac$a:b	Lorg/vidogram/tgnet/g$gi;
    //   7700: aload_3
    //   7701: aload 16
    //   7703: putfield 940	org/vidogram/messenger/ac$a:h	Lorg/vidogram/messenger/u;
    //   7706: aload_3
    //   7707: aload 6
    //   7709: putfield 971	org/vidogram/messenger/ac$a:f	Lorg/vidogram/tgnet/g$hs;
    //   7712: aload_3
    //   7713: iconst_3
    //   7714: putfield 938	org/vidogram/messenger/ac$a:c	I
    //   7717: aload 26
    //   7719: getfield 471	org/vidogram/tgnet/g$t:o	I
    //   7722: invokestatic 476	org/vidogram/messenger/a:c	(I)I
    //   7725: bipush 46
    //   7727: if_icmplt +189 -> 7916
    //   7730: aload_1
    //   7731: new 1103	org/vidogram/tgnet/g$ha
    //   7734: dup
    //   7735: invokespecial 1104	org/vidogram/tgnet/g$ha:<init>	()V
    //   7738: putfield 852	org/vidogram/tgnet/g$gi:e	Lorg/vidogram/tgnet/g$p;
    //   7741: aload_1
    //   7742: getfield 852	org/vidogram/tgnet/g$gi:e	Lorg/vidogram/tgnet/g$p;
    //   7745: aload 6
    //   7747: getfield 575	org/vidogram/tgnet/g$hs:o	Ljava/util/ArrayList;
    //   7750: putfield 1105	org/vidogram/tgnet/g$p:o	Ljava/util/ArrayList;
    //   7753: aload_1
    //   7754: getfield 852	org/vidogram/tgnet/g$gi:e	Lorg/vidogram/tgnet/g$p;
    //   7757: astore 4
    //   7759: aload 6
    //   7761: getfield 566	org/vidogram/tgnet/g$hs:n	Ljava/lang/String;
    //   7764: ifnull +1096 -> 8860
    //   7767: aload 6
    //   7769: getfield 566	org/vidogram/tgnet/g$hs:n	Ljava/lang/String;
    //   7772: astore_2
    //   7773: aload 4
    //   7775: aload_2
    //   7776: putfield 1059	org/vidogram/tgnet/g$p:p	Ljava/lang/String;
    //   7779: aload 6
    //   7781: getfield 962	org/vidogram/tgnet/g$hs:i	Lorg/vidogram/tgnet/g$az;
    //   7784: ifnull +100 -> 7884
    //   7787: aload 6
    //   7789: getfield 962	org/vidogram/tgnet/g$hs:i	Lorg/vidogram/tgnet/g$az;
    //   7792: getfield 1060	org/vidogram/tgnet/g$az:g	[B
    //   7795: ifnull +89 -> 7884
    //   7798: aload_1
    //   7799: getfield 852	org/vidogram/tgnet/g$gi:e	Lorg/vidogram/tgnet/g$p;
    //   7802: checkcast 1103	org/vidogram/tgnet/g$ha
    //   7805: aload 6
    //   7807: getfield 962	org/vidogram/tgnet/g$hs:i	Lorg/vidogram/tgnet/g$az;
    //   7810: getfield 1060	org/vidogram/tgnet/g$az:g	[B
    //   7813: putfield 1106	org/vidogram/tgnet/g$ha:D	[B
    //   7816: aload_1
    //   7817: getfield 852	org/vidogram/tgnet/g$gi:e	Lorg/vidogram/tgnet/g$p;
    //   7820: aload 6
    //   7822: getfield 962	org/vidogram/tgnet/g$hs:i	Lorg/vidogram/tgnet/g$az;
    //   7825: getfield 1063	org/vidogram/tgnet/g$az:e	I
    //   7828: putfield 1064	org/vidogram/tgnet/g$p:n	I
    //   7831: aload_1
    //   7832: getfield 852	org/vidogram/tgnet/g$gi:e	Lorg/vidogram/tgnet/g$p;
    //   7835: aload 6
    //   7837: getfield 962	org/vidogram/tgnet/g$hs:i	Lorg/vidogram/tgnet/g$az;
    //   7840: getfield 1065	org/vidogram/tgnet/g$az:d	I
    //   7843: putfield 1067	org/vidogram/tgnet/g$p:m	I
    //   7846: aload_1
    //   7847: getfield 852	org/vidogram/tgnet/g$gi:e	Lorg/vidogram/tgnet/g$p;
    //   7850: aload 6
    //   7852: getfield 966	org/vidogram/tgnet/g$hs:g	Ljava/lang/String;
    //   7855: putfield 1109	org/vidogram/tgnet/g$p:c	Ljava/lang/String;
    //   7858: aload_1
    //   7859: getfield 852	org/vidogram/tgnet/g$gi:e	Lorg/vidogram/tgnet/g$p;
    //   7862: aload 6
    //   7864: getfield 1110	org/vidogram/tgnet/g$hs:h	I
    //   7867: putfield 1072	org/vidogram/tgnet/g$p:d	I
    //   7870: aload_3
    //   7871: aload 27
    //   7873: putfield 937	org/vidogram/messenger/ac$a:d	Ljava/lang/String;
    //   7876: aload_0
    //   7877: aload_3
    //   7878: invokespecial 1031	org/vidogram/messenger/ac:a	(Lorg/vidogram/messenger/ac$a;)V
    //   7881: goto -2086 -> 5795
    //   7884: aload_1
    //   7885: getfield 852	org/vidogram/tgnet/g$gi:e	Lorg/vidogram/tgnet/g$p;
    //   7888: checkcast 1103	org/vidogram/tgnet/g$ha
    //   7891: iconst_0
    //   7892: newarray byte
    //   7894: putfield 1106	org/vidogram/tgnet/g$ha:D	[B
    //   7897: aload_1
    //   7898: getfield 852	org/vidogram/tgnet/g$gi:e	Lorg/vidogram/tgnet/g$p;
    //   7901: iconst_0
    //   7902: putfield 1064	org/vidogram/tgnet/g$p:n	I
    //   7905: aload_1
    //   7906: getfield 852	org/vidogram/tgnet/g$gi:e	Lorg/vidogram/tgnet/g$p;
    //   7909: iconst_0
    //   7910: putfield 1067	org/vidogram/tgnet/g$p:m	I
    //   7913: goto -67 -> 7846
    //   7916: aload 26
    //   7918: getfield 471	org/vidogram/tgnet/g$t:o	I
    //   7921: invokestatic 476	org/vidogram/messenger/a:c	(I)I
    //   7924: bipush 17
    //   7926: if_icmplt +92 -> 8018
    //   7929: aload_1
    //   7930: new 1169	org/vidogram/tgnet/g$gx
    //   7933: dup
    //   7934: invokespecial 1170	org/vidogram/tgnet/g$gx:<init>	()V
    //   7937: putfield 852	org/vidogram/tgnet/g$gi:e	Lorg/vidogram/tgnet/g$p;
    //   7940: goto +927 -> 8867
    //   7943: iload 18
    //   7945: aload 6
    //   7947: getfield 575	org/vidogram/tgnet/g$hs:o	Ljava/util/ArrayList;
    //   7950: invokevirtual 538	java/util/ArrayList:size	()I
    //   7953: if_icmpge +35 -> 7988
    //   7956: aload 6
    //   7958: getfield 575	org/vidogram/tgnet/g$hs:o	Ljava/util/ArrayList;
    //   7961: iload 18
    //   7963: invokevirtual 541	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   7966: checkcast 577	org/vidogram/tgnet/g$r
    //   7969: astore_2
    //   7970: aload_2
    //   7971: instanceof 760
    //   7974: ifeq +899 -> 8873
    //   7977: aload_1
    //   7978: getfield 852	org/vidogram/tgnet/g$gi:e	Lorg/vidogram/tgnet/g$p;
    //   7981: aload_2
    //   7982: getfield 761	org/vidogram/tgnet/g$r:d	I
    //   7985: putfield 1113	org/vidogram/tgnet/g$p:b	I
    //   7988: aload_1
    //   7989: getfield 852	org/vidogram/tgnet/g$gi:e	Lorg/vidogram/tgnet/g$p;
    //   7992: ldc_w 1172
    //   7995: putfield 1109	org/vidogram/tgnet/g$p:c	Ljava/lang/String;
    //   7998: aload_1
    //   7999: getfield 852	org/vidogram/tgnet/g$gi:e	Lorg/vidogram/tgnet/g$p;
    //   8002: aload 6
    //   8004: getfield 1110	org/vidogram/tgnet/g$hs:h	I
    //   8007: putfield 1072	org/vidogram/tgnet/g$p:d	I
    //   8010: aload_3
    //   8011: iconst_3
    //   8012: putfield 938	org/vidogram/messenger/ac$a:c	I
    //   8015: goto -139 -> 7876
    //   8018: aload_1
    //   8019: new 1174	org/vidogram/tgnet/g$gy
    //   8022: dup
    //   8023: invokespecial 1175	org/vidogram/tgnet/g$gy:<init>	()V
    //   8026: putfield 852	org/vidogram/tgnet/g$gi:e	Lorg/vidogram/tgnet/g$p;
    //   8029: goto +838 -> 8867
    //   8032: iload 18
    //   8034: iconst_4
    //   8035: if_icmpne +241 -> 8276
    //   8038: new 1177	org/vidogram/tgnet/g$pk
    //   8041: dup
    //   8042: invokespecial 1178	org/vidogram/tgnet/g$pk:<init>	()V
    //   8045: astore_1
    //   8046: aload_1
    //   8047: aload 28
    //   8049: putfield 1180	org/vidogram/tgnet/g$pk:j	Lorg/vidogram/tgnet/g$aj;
    //   8052: aload_1
    //   8053: aload 14
    //   8055: getfield 325	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   8058: getfield 1182	org/vidogram/tgnet/g$ar:J	Z
    //   8061: putfield 1184	org/vidogram/tgnet/g$pk:f	Z
    //   8064: aload 14
    //   8066: getfield 325	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   8069: getfield 755	org/vidogram/tgnet/g$ar:F	I
    //   8072: ifeq +168 -> 8240
    //   8075: invokestatic 313	org/vidogram/messenger/v:a	()Lorg/vidogram/messenger/v;
    //   8078: aload 14
    //   8080: getfield 325	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   8083: getfield 755	org/vidogram/tgnet/g$ar:F	I
    //   8086: ineg
    //   8087: invokestatic 319	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   8090: invokevirtual 354	org/vidogram/messenger/v:b	(Ljava/lang/Integer;)Lorg/vidogram/tgnet/g$i;
    //   8093: astore_2
    //   8094: aload_1
    //   8095: new 347	org/vidogram/tgnet/g$kw
    //   8098: dup
    //   8099: invokespecial 1185	org/vidogram/tgnet/g$kw:<init>	()V
    //   8102: putfield 1186	org/vidogram/tgnet/g$pk:g	Lorg/vidogram/tgnet/g$aj;
    //   8105: aload_1
    //   8106: getfield 1186	org/vidogram/tgnet/g$pk:g	Lorg/vidogram/tgnet/g$aj;
    //   8109: aload 14
    //   8111: getfield 325	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   8114: getfield 755	org/vidogram/tgnet/g$ar:F	I
    //   8117: ineg
    //   8118: putfield 351	org/vidogram/tgnet/g$aj:e	I
    //   8121: aload_2
    //   8122: ifnull +14 -> 8136
    //   8125: aload_1
    //   8126: getfield 1186	org/vidogram/tgnet/g$pk:g	Lorg/vidogram/tgnet/g$aj;
    //   8129: aload_2
    //   8130: getfield 1188	org/vidogram/tgnet/g$i:u	J
    //   8133: putfield 717	org/vidogram/tgnet/g$aj:c	J
    //   8136: aload 14
    //   8138: getfield 325	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   8141: getfield 663	org/vidogram/tgnet/g$ar:d	Lorg/vidogram/tgnet/g$aw;
    //   8144: instanceof 794
    //   8147: ifeq +44 -> 8191
    //   8150: aload_1
    //   8151: getstatic 799	org/vidogram/messenger/ApplicationLoader:a	Landroid/content/Context;
    //   8154: ldc_w 801
    //   8157: iconst_0
    //   8158: invokevirtual 807	android/content/Context:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   8161: new 697	java/lang/StringBuilder
    //   8164: dup
    //   8165: invokespecial 698	java/lang/StringBuilder:<init>	()V
    //   8168: ldc_w 809
    //   8171: invokevirtual 704	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   8174: lload 8
    //   8176: invokevirtual 720	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   8179: invokevirtual 721	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   8182: iconst_0
    //   8183: invokeinterface 815 3 0
    //   8188: putfield 1189	org/vidogram/tgnet/g$pk:d	Z
    //   8191: aload_1
    //   8192: getfield 1190	org/vidogram/tgnet/g$pk:i	Ljava/util/ArrayList;
    //   8195: aload 7
    //   8197: getfield 367	org/vidogram/tgnet/g$ar:C	J
    //   8200: invokestatic 740	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   8203: invokevirtual 267	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   8206: pop
    //   8207: aload 14
    //   8209: invokevirtual 339	org/vidogram/messenger/u:q	()I
    //   8212: iflt +42 -> 8254
    //   8215: aload_1
    //   8216: getfield 1191	org/vidogram/tgnet/g$pk:h	Ljava/util/ArrayList;
    //   8219: aload 14
    //   8221: invokevirtual 339	org/vidogram/messenger/u:q	()I
    //   8224: invokestatic 319	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   8227: invokevirtual 267	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   8230: pop
    //   8231: aload_0
    //   8232: aload_1
    //   8233: aload 16
    //   8235: aconst_null
    //   8236: invokespecial 785	org/vidogram/messenger/ac:a	(Lorg/vidogram/tgnet/f;Lorg/vidogram/messenger/u;Ljava/lang/String;)V
    //   8239: return
    //   8240: aload_1
    //   8241: new 1193	org/vidogram/tgnet/g$ky
    //   8244: dup
    //   8245: invokespecial 1194	org/vidogram/tgnet/g$ky:<init>	()V
    //   8248: putfield 1186	org/vidogram/tgnet/g$pk:g	Lorg/vidogram/tgnet/g$aj;
    //   8251: goto -115 -> 8136
    //   8254: aload_1
    //   8255: getfield 1191	org/vidogram/tgnet/g$pk:h	Ljava/util/ArrayList;
    //   8258: aload 14
    //   8260: getfield 325	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   8263: getfield 1196	org/vidogram/tgnet/g$ar:z	I
    //   8266: invokestatic 319	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   8269: invokevirtual 267	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   8272: pop
    //   8273: goto -42 -> 8231
    //   8276: iload 18
    //   8278: bipush 9
    //   8280: if_icmpne -8273 -> 7
    //   8283: new 1198	org/vidogram/tgnet/g$ra
    //   8286: dup
    //   8287: invokespecial 1199	org/vidogram/tgnet/g$ra:<init>	()V
    //   8290: astore_1
    //   8291: aload_1
    //   8292: aload 28
    //   8294: putfield 1200	org/vidogram/tgnet/g$ra:g	Lorg/vidogram/tgnet/g$aj;
    //   8297: aload_1
    //   8298: aload 7
    //   8300: getfield 367	org/vidogram/tgnet/g$ar:C	J
    //   8303: putfield 1202	org/vidogram/tgnet/g$ra:i	J
    //   8306: aload 11
    //   8308: ifnull +22 -> 8330
    //   8311: aload_1
    //   8312: aload_1
    //   8313: getfield 1203	org/vidogram/tgnet/g$ra:c	I
    //   8316: iconst_1
    //   8317: ior
    //   8318: putfield 1203	org/vidogram/tgnet/g$ra:c	I
    //   8321: aload_1
    //   8322: aload 11
    //   8324: invokevirtual 339	org/vidogram/messenger/u:q	()I
    //   8327: putfield 1204	org/vidogram/tgnet/g$ra:h	I
    //   8330: aload 7
    //   8332: getfield 663	org/vidogram/tgnet/g$ar:d	Lorg/vidogram/tgnet/g$aw;
    //   8335: instanceof 794
    //   8338: ifeq +44 -> 8382
    //   8341: aload_1
    //   8342: getstatic 799	org/vidogram/messenger/ApplicationLoader:a	Landroid/content/Context;
    //   8345: ldc_w 801
    //   8348: iconst_0
    //   8349: invokevirtual 807	android/content/Context:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   8352: new 697	java/lang/StringBuilder
    //   8355: dup
    //   8356: invokespecial 698	java/lang/StringBuilder:<init>	()V
    //   8359: ldc_w 809
    //   8362: invokevirtual 704	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   8365: lload 8
    //   8367: invokevirtual 720	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   8370: invokevirtual 721	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   8373: iconst_0
    //   8374: invokeinterface 815 3 0
    //   8379: putfield 1205	org/vidogram/tgnet/g$ra:d	Z
    //   8382: aload_1
    //   8383: aload 17
    //   8385: ldc_w 430
    //   8388: invokevirtual 293	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   8391: checkcast 245	java/lang/String
    //   8394: invokestatic 1208	org/vidogram/messenger/Utilities:b	(Ljava/lang/String;)Ljava/lang/Long;
    //   8397: invokevirtual 1211	java/lang/Long:longValue	()J
    //   8400: putfield 1212	org/vidogram/tgnet/g$ra:j	J
    //   8403: aload_1
    //   8404: aload 17
    //   8406: ldc_w 1214
    //   8409: invokevirtual 293	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   8412: checkcast 245	java/lang/String
    //   8415: putfield 1215	org/vidogram/tgnet/g$ra:k	Ljava/lang/String;
    //   8418: aload 14
    //   8420: ifnonnull +14 -> 8434
    //   8423: aload_1
    //   8424: iconst_1
    //   8425: putfield 1216	org/vidogram/tgnet/g$ra:f	Z
    //   8428: lload 8
    //   8430: iconst_0
    //   8431: invokestatic 834	org/vidogram/messenger/d/b:a	(JZ)V
    //   8434: aload_0
    //   8435: aload_1
    //   8436: aload 16
    //   8438: aconst_null
    //   8439: invokespecial 785	org/vidogram/messenger/ac:a	(Lorg/vidogram/tgnet/f;Lorg/vidogram/messenger/u;Ljava/lang/String;)V
    //   8442: return
    //   8443: astore_1
    //   8444: aconst_null
    //   8445: astore_3
    //   8446: aconst_null
    //   8447: astore_2
    //   8448: goto -7840 -> 608
    //   8451: astore_1
    //   8452: aconst_null
    //   8453: astore_3
    //   8454: aload 7
    //   8456: astore_2
    //   8457: goto -7849 -> 608
    //   8460: astore_1
    //   8461: aconst_null
    //   8462: astore_3
    //   8463: aload 24
    //   8465: astore_2
    //   8466: goto -7858 -> 608
    //   8469: aconst_null
    //   8470: astore_1
    //   8471: aload 12
    //   8473: astore_2
    //   8474: goto -4397 -> 4077
    //   8477: iconst_0
    //   8478: istore 19
    //   8480: goto -5072 -> 3408
    //   8483: iconst_0
    //   8484: istore 19
    //   8486: goto -5179 -> 3307
    //   8489: goto -7324 -> 1165
    //   8492: iconst_m1
    //   8493: istore 18
    //   8495: aload 24
    //   8497: astore 7
    //   8499: goto -7334 -> 1165
    //   8502: iconst_m1
    //   8503: istore 18
    //   8505: aload 24
    //   8507: astore 7
    //   8509: goto -7344 -> 1165
    //   8512: aload_1
    //   8513: astore 25
    //   8515: aload_3
    //   8516: astore 24
    //   8518: goto -8282 -> 236
    //   8521: iconst_m1
    //   8522: istore 18
    //   8524: goto -7827 -> 697
    //   8527: aconst_null
    //   8528: astore 26
    //   8530: goto -8327 -> 203
    //   8533: goto -8330 -> 203
    //   8536: aconst_null
    //   8537: astore 27
    //   8539: goto -8502 -> 37
    //   8542: iconst_0
    //   8543: istore 18
    //   8545: goto -7848 -> 697
    //   8548: iconst_1
    //   8549: istore 18
    //   8551: goto -7386 -> 1165
    //   8554: iconst_2
    //   8555: istore 18
    //   8557: goto -6996 -> 1561
    //   8560: bipush 6
    //   8562: istore 18
    //   8564: goto -7399 -> 1165
    //   8567: iconst_3
    //   8568: istore 18
    //   8570: goto -6418 -> 2152
    //   8573: bipush 7
    //   8575: istore 18
    //   8577: goto -6425 -> 2152
    //   8580: goto -7415 -> 1165
    //   8583: iload 20
    //   8585: iconst_1
    //   8586: iadd
    //   8587: istore 20
    //   8589: goto -6354 -> 2235
    //   8592: iload 18
    //   8594: ifeq -5521 -> 3073
    //   8597: iload 18
    //   8599: bipush 9
    //   8601: if_icmpne +46 -> 8647
    //   8604: aload 25
    //   8606: ifnull +41 -> 8647
    //   8609: aload 26
    //   8611: ifnull +36 -> 8647
    //   8614: goto -5541 -> 3073
    //   8617: aconst_null
    //   8618: astore_3
    //   8619: goto -5812 -> 2807
    //   8622: iload 19
    //   8624: iconst_1
    //   8625: iadd
    //   8626: istore 19
    //   8628: goto -5373 -> 3255
    //   8631: astore_1
    //   8632: aload 7
    //   8634: astore_2
    //   8635: aload 16
    //   8637: astore_3
    //   8638: goto -8030 -> 608
    //   8641: iconst_0
    //   8642: istore 23
    //   8644: goto -5147 -> 3497
    //   8647: iload 18
    //   8649: iconst_1
    //   8650: if_icmplt +9 -> 8659
    //   8653: iload 18
    //   8655: iconst_3
    //   8656: if_icmple -4682 -> 3974
    //   8659: iload 18
    //   8661: iconst_5
    //   8662: if_icmplt +10 -> 8672
    //   8665: iload 18
    //   8667: bipush 8
    //   8669: if_icmple -4695 -> 3974
    //   8672: iload 18
    //   8674: bipush 9
    //   8676: if_icmpne -644 -> 8032
    //   8679: aload 26
    //   8681: ifnull -649 -> 8032
    //   8684: goto -4710 -> 3974
    //   8687: iload 18
    //   8689: iconst_2
    //   8690: if_icmpeq -4544 -> 4146
    //   8693: iload 18
    //   8695: bipush 9
    //   8697: if_icmpne -4267 -> 4430
    //   8700: aload 24
    //   8702: ifnull -4272 -> 4430
    //   8705: goto -4559 -> 4146
    //   8708: ldc_w 378
    //   8711: astore_2
    //   8712: goto -4534 -> 4178
    //   8715: ldc_w 378
    //   8718: astore_1
    //   8719: goto -4326 -> 4393
    //   8722: ldc_w 378
    //   8725: astore_2
    //   8726: goto -4247 -> 4479
    //   8729: ldc_w 378
    //   8732: astore_1
    //   8733: goto -4134 -> 4599
    //   8736: iload 18
    //   8738: bipush 7
    //   8740: if_icmpeq -4056 -> 4684
    //   8743: iload 18
    //   8745: bipush 9
    //   8747: if_icmpne -3756 -> 4991
    //   8750: goto -4066 -> 4684
    //   8753: aconst_null
    //   8754: astore_1
    //   8755: goto -3975 -> 4780
    //   8758: ldc_w 378
    //   8761: astore 4
    //   8763: goto -3950 -> 4813
    //   8766: ldc_w 378
    //   8769: astore_1
    //   8770: goto -3792 -> 4978
    //   8773: ldc_w 378
    //   8776: astore_1
    //   8777: goto -3726 -> 5051
    //   8780: ldc_w 378
    //   8783: astore_1
    //   8784: goto -3662 -> 5122
    //   8787: iload 18
    //   8789: iconst_2
    //   8790: if_icmpeq -2907 -> 5883
    //   8793: iload 18
    //   8795: bipush 9
    //   8797: if_icmpne -2479 -> 6318
    //   8800: aload 24
    //   8802: ifnull -2484 -> 6318
    //   8805: goto -2922 -> 5883
    //   8808: ldc_w 378
    //   8811: astore_2
    //   8812: goto -2844 -> 5968
    //   8815: ldc_w 378
    //   8818: astore_2
    //   8819: goto -2387 -> 6432
    //   8822: iload 18
    //   8824: iconst_1
    //   8825: iadd
    //   8826: istore 18
    //   8828: goto -2366 -> 6462
    //   8831: iload 18
    //   8833: bipush 7
    //   8835: if_icmpeq -1821 -> 7014
    //   8838: iload 18
    //   8840: bipush 9
    //   8842: if_icmpne -1169 -> 7673
    //   8845: aload 6
    //   8847: ifnull -1174 -> 7673
    //   8850: goto -1836 -> 7014
    //   8853: ldc_w 378
    //   8856: astore_2
    //   8857: goto -1597 -> 7260
    //   8860: ldc_w 378
    //   8863: astore_2
    //   8864: goto -1091 -> 7773
    //   8867: iconst_0
    //   8868: istore 18
    //   8870: goto -927 -> 7943
    //   8873: iload 18
    //   8875: iconst_1
    //   8876: iadd
    //   8877: istore 18
    //   8879: goto -936 -> 7943
    //
    // Exception table:
    //   from	to	target	type
    //   236	255	602	java/lang/Exception
    //   260	271	602	java/lang/Exception
    //   276	308	602	java/lang/Exception
    //   308	322	602	java/lang/Exception
    //   322	329	602	java/lang/Exception
    //   334	342	602	java/lang/Exception
    //   342	361	602	java/lang/Exception
    //   366	386	602	java/lang/Exception
    //   386	401	602	java/lang/Exception
    //   405	432	602	java/lang/Exception
    //   432	453	602	java/lang/Exception
    //   463	502	602	java/lang/Exception
    //   502	512	602	java/lang/Exception
    //   522	542	602	java/lang/Exception
    //   553	601	602	java/lang/Exception
    //   2635	2657	602	java/lang/Exception
    //   2660	2681	602	java/lang/Exception
    //   2684	2690	602	java/lang/Exception
    //   2693	2706	602	java/lang/Exception
    //   2709	2731	602	java/lang/Exception
    //   2731	2770	602	java/lang/Exception
    //   2775	2782	602	java/lang/Exception
    //   2785	2807	602	java/lang/Exception
    //   2812	2825	602	java/lang/Exception
    //   2831	2856	602	java/lang/Exception
    //   2856	2875	602	java/lang/Exception
    //   3133	3143	602	java/lang/Exception
    //   3148	3160	602	java/lang/Exception
    //   3164	3173	602	java/lang/Exception
    //   3174	3187	602	java/lang/Exception
    //   3190	3226	602	java/lang/Exception
    //   3226	3252	602	java/lang/Exception
    //   3255	3307	602	java/lang/Exception
    //   3307	3324	602	java/lang/Exception
    //   3329	3342	602	java/lang/Exception
    //   3345	3353	602	java/lang/Exception
    //   3356	3408	602	java/lang/Exception
    //   3408	3425	602	java/lang/Exception
    //   1023	1031	1323	java/lang/Exception
    //   1035	1042	1323	java/lang/Exception
    //   1059	1067	1323	java/lang/Exception
    //   1071	1079	1323	java/lang/Exception
    //   1083	1092	1323	java/lang/Exception
    //   1096	1106	1323	java/lang/Exception
    //   1115	1127	1323	java/lang/Exception
    //   1136	1147	1323	java/lang/Exception
    //   1155	1161	1323	java/lang/Exception
    //   1169	1177	1323	java/lang/Exception
    //   1181	1189	1323	java/lang/Exception
    //   1193	1198	1323	java/lang/Exception
    //   1202	1209	1323	java/lang/Exception
    //   1213	1220	1323	java/lang/Exception
    //   1224	1230	1323	java/lang/Exception
    //   1244	1255	1323	java/lang/Exception
    //   1259	1263	1323	java/lang/Exception
    //   1294	1306	1323	java/lang/Exception
    //   1310	1320	1323	java/lang/Exception
    //   1373	1379	1323	java/lang/Exception
    //   1383	1391	1323	java/lang/Exception
    //   1400	1410	1323	java/lang/Exception
    //   1469	1481	1323	java/lang/Exception
    //   1485	1492	1323	java/lang/Exception
    //   1496	1503	1323	java/lang/Exception
    //   1507	1513	1323	java/lang/Exception
    //   1517	1524	1323	java/lang/Exception
    //   1528	1537	1323	java/lang/Exception
    //   1546	1557	1323	java/lang/Exception
    //   1565	1573	1323	java/lang/Exception
    //   1582	1590	1323	java/lang/Exception
    //   1594	1605	1323	java/lang/Exception
    //   1609	1616	1323	java/lang/Exception
    //   1643	1677	1323	java/lang/Exception
    //   1802	1814	1323	java/lang/Exception
    //   1818	1831	1323	java/lang/Exception
    //   1835	1848	1323	java/lang/Exception
    //   1852	1865	1323	java/lang/Exception
    //   1869	1882	1323	java/lang/Exception
    //   1886	1897	1323	java/lang/Exception
    //   1901	1912	1323	java/lang/Exception
    //   1916	1924	1323	java/lang/Exception
    //   1928	1939	1323	java/lang/Exception
    //   1943	1954	1323	java/lang/Exception
    //   1958	1966	1323	java/lang/Exception
    //   1970	1978	1323	java/lang/Exception
    //   1987	1997	1323	java/lang/Exception
    //   2057	2069	1323	java/lang/Exception
    //   2073	2080	1323	java/lang/Exception
    //   2084	2092	1323	java/lang/Exception
    //   2096	2103	1323	java/lang/Exception
    //   2107	2114	1323	java/lang/Exception
    //   2118	2128	1323	java/lang/Exception
    //   2137	2148	1323	java/lang/Exception
    //   2161	2169	1323	java/lang/Exception
    //   2178	2186	1323	java/lang/Exception
    //   2190	2198	1323	java/lang/Exception
    //   2202	2215	1323	java/lang/Exception
    //   2224	2232	1323	java/lang/Exception
    //   2239	2252	1323	java/lang/Exception
    //   2256	2271	1323	java/lang/Exception
    //   2275	2283	1323	java/lang/Exception
    //   2287	2300	1323	java/lang/Exception
    //   2304	2315	1323	java/lang/Exception
    //   2319	2335	1323	java/lang/Exception
    //   2362	2370	1323	java/lang/Exception
    //   2382	2390	1323	java/lang/Exception
    //   2401	2411	1323	java/lang/Exception
    //   2418	2425	1323	java/lang/Exception
    //   2432	2443	1323	java/lang/Exception
    //   2447	2456	1323	java/lang/Exception
    //   2460	2471	1323	java/lang/Exception
    //   2475	2485	1323	java/lang/Exception
    //   2489	2497	1323	java/lang/Exception
    //   2501	2514	1323	java/lang/Exception
    //   2523	2531	1323	java/lang/Exception
    //   2535	2547	1323	java/lang/Exception
    //   2551	2561	1323	java/lang/Exception
    //   2568	2580	1323	java/lang/Exception
    //   2587	2599	1323	java/lang/Exception
    //   2606	2614	1323	java/lang/Exception
    //   2618	2632	1323	java/lang/Exception
    //   208	215	8443	java/lang/Exception
    //   992	1014	8443	java/lang/Exception
    //   1272	1281	8443	java/lang/Exception
    //   1347	1369	8443	java/lang/Exception
    //   1422	1431	8443	java/lang/Exception
    //   1443	1465	8443	java/lang/Exception
    //   1619	1628	8443	java/lang/Exception
    //   1685	1694	8443	java/lang/Exception
    //   1776	1798	8443	java/lang/Exception
    //   2009	2018	8443	java/lang/Exception
    //   2031	2053	8443	java/lang/Exception
    //   2338	2347	8443	java/lang/Exception
    //   215	222	8451	java/lang/Exception
    //   672	694	8451	java/lang/Exception
    //   702	713	8451	java/lang/Exception
    //   726	732	8451	java/lang/Exception
    //   735	750	8451	java/lang/Exception
    //   756	777	8451	java/lang/Exception
    //   783	792	8451	java/lang/Exception
    //   797	810	8451	java/lang/Exception
    //   816	887	8451	java/lang/Exception
    //   894	934	8451	java/lang/Exception
    //   934	947	8451	java/lang/Exception
    //   954	976	8451	java/lang/Exception
    //   1694	1735	8460	java/lang/Exception
    //   1740	1750	8460	java/lang/Exception
    //   2875	2899	8631	java/lang/Exception
    //   2904	2921	8631	java/lang/Exception
    //   2921	2993	8631	java/lang/Exception
    //   2998	3070	8631	java/lang/Exception
    //   3082	3098	8631	java/lang/Exception
    //   3101	3124	8631	java/lang/Exception
    //   3439	3474	8631	java/lang/Exception
    //   3475	3489	8631	java/lang/Exception
    //   3497	3555	8631	java/lang/Exception
    //   3555	3570	8631	java/lang/Exception
    //   3575	3594	8631	java/lang/Exception
    //   3599	3604	8631	java/lang/Exception
    //   3609	3634	8631	java/lang/Exception
    //   3634	3642	8631	java/lang/Exception
    //   3647	3653	8631	java/lang/Exception
    //   3654	3684	8631	java/lang/Exception
    //   3689	3715	8631	java/lang/Exception
    //   3724	3760	8631	java/lang/Exception
    //   3767	3805	8631	java/lang/Exception
    //   3805	3820	8631	java/lang/Exception
    //   3825	3868	8631	java/lang/Exception
    //   3868	3886	8631	java/lang/Exception
    //   3891	3897	8631	java/lang/Exception
    //   3898	3928	8631	java/lang/Exception
    //   3931	3957	8631	java/lang/Exception
    //   3960	3971	8631	java/lang/Exception
    //   3988	4035	8631	java/lang/Exception
    //   4035	4074	8631	java/lang/Exception
    //   4081	4099	8631	java/lang/Exception
    //   4102	4126	8631	java/lang/Exception
    //   4135	4143	8631	java/lang/Exception
    //   4146	4178	8631	java/lang/Exception
    //   4178	4183	8631	java/lang/Exception
    //   4188	4200	8631	java/lang/Exception
    //   4204	4223	8631	java/lang/Exception
    //   4233	4251	8631	java/lang/Exception
    //   4260	4270	8631	java/lang/Exception
    //   4270	4296	8631	java/lang/Exception
    //   4301	4326	8631	java/lang/Exception
    //   4329	4357	8631	java/lang/Exception
    //   4360	4393	8631	java/lang/Exception
    //   4393	4422	8631	java/lang/Exception
    //   4436	4465	8631	java/lang/Exception
    //   4465	4479	8631	java/lang/Exception
    //   4479	4552	8631	java/lang/Exception
    //   4555	4563	8631	java/lang/Exception
    //   4566	4599	8631	java/lang/Exception
    //   4599	4628	8631	java/lang/Exception
    //   4643	4678	8631	java/lang/Exception
    //   4684	4694	8631	java/lang/Exception
    //   4704	4723	8631	java/lang/Exception
    //   4728	4777	8631	java/lang/Exception
    //   4780	4813	8631	java/lang/Exception
    //   4813	4819	8631	java/lang/Exception
    //   4830	4863	8631	java/lang/Exception
    //   4863	4907	8631	java/lang/Exception
    //   4910	4918	8631	java/lang/Exception
    //   4921	4978	8631	java/lang/Exception
    //   4978	4983	8631	java/lang/Exception
    //   4998	5051	8631	java/lang/Exception
    //   5051	5083	8631	java/lang/Exception
    //   5089	5122	8631	java/lang/Exception
    //   5122	5151	8631	java/lang/Exception
    //   5159	5186	8631	java/lang/Exception
    //   5190	5196	8631	java/lang/Exception
    //   5204	5210	8631	java/lang/Exception
    //   5219	5227	8631	java/lang/Exception
    //   5228	5294	8631	java/lang/Exception
    //   5294	5308	8631	java/lang/Exception
    //   5313	5332	8631	java/lang/Exception
    //   5338	5343	8631	java/lang/Exception
    //   5354	5369	8631	java/lang/Exception
    //   5370	5378	8631	java/lang/Exception
    //   5385	5400	8631	java/lang/Exception
    //   5401	5409	8631	java/lang/Exception
    //   5417	5425	8631	java/lang/Exception
    //   5433	5443	8631	java/lang/Exception
    //   5447	5452	8631	java/lang/Exception
    //   5453	5462	8631	java/lang/Exception
    //   5470	5485	8631	java/lang/Exception
    //   5486	5494	8631	java/lang/Exception
    //   5495	5525	8631	java/lang/Exception
    //   5530	5556	8631	java/lang/Exception
    //   5561	5597	8631	java/lang/Exception
    //   5597	5609	8631	java/lang/Exception
    //   5614	5652	8631	java/lang/Exception
    //   5652	5668	8631	java/lang/Exception
    //   5674	5749	8631	java/lang/Exception
    //   5749	5795	8631	java/lang/Exception
    //   5800	5806	8631	java/lang/Exception
    //   5807	5837	8631	java/lang/Exception
    //   5840	5866	8631	java/lang/Exception
    //   5869	5880	8631	java/lang/Exception
    //   5883	5968	8631	java/lang/Exception
    //   5968	5997	8631	java/lang/Exception
    //   5997	6101	8631	java/lang/Exception
    //   6106	6131	8631	java/lang/Exception
    //   6131	6136	8631	java/lang/Exception
    //   6139	6152	8631	java/lang/Exception
    //   6155	6189	8631	java/lang/Exception
    //   6192	6205	8631	java/lang/Exception
    //   6208	6236	8631	java/lang/Exception
    //   6239	6315	8631	java/lang/Exception
    //   6324	6413	8631	java/lang/Exception
    //   6413	6432	8631	java/lang/Exception
    //   6432	6459	8631	java/lang/Exception
    //   6462	6529	8631	java/lang/Exception
    //   6529	6623	8631	java/lang/Exception
    //   6626	6639	8631	java/lang/Exception
    //   6642	6690	8631	java/lang/Exception
    //   6693	6706	8631	java/lang/Exception
    //   6709	6770	8631	java/lang/Exception
    //   6773	6786	8631	java/lang/Exception
    //   6789	6837	8631	java/lang/Exception
    //   6840	6853	8631	java/lang/Exception
    //   6856	6924	8631	java/lang/Exception
    //   6934	7011	8631	java/lang/Exception
    //   7014	7158	8631	java/lang/Exception
    //   7158	7176	8631	java/lang/Exception
    //   7179	7194	8631	java/lang/Exception
    //   7197	7260	8631	java/lang/Exception
    //   7260	7332	8631	java/lang/Exception
    //   7332	7401	8631	java/lang/Exception
    //   7406	7431	8631	java/lang/Exception
    //   7431	7442	8631	java/lang/Exception
    //   7445	7474	8631	java/lang/Exception
    //   7477	7567	8631	java/lang/Exception
    //   7570	7599	8631	java/lang/Exception
    //   7602	7670	8631	java/lang/Exception
    //   7680	7773	8631	java/lang/Exception
    //   7773	7846	8631	java/lang/Exception
    //   7846	7876	8631	java/lang/Exception
    //   7876	7881	8631	java/lang/Exception
    //   7884	7913	8631	java/lang/Exception
    //   7916	7940	8631	java/lang/Exception
    //   7943	7988	8631	java/lang/Exception
    //   7988	8015	8631	java/lang/Exception
    //   8018	8029	8631	java/lang/Exception
    //   8038	8121	8631	java/lang/Exception
    //   8125	8136	8631	java/lang/Exception
    //   8136	8191	8631	java/lang/Exception
    //   8191	8231	8631	java/lang/Exception
    //   8231	8239	8631	java/lang/Exception
    //   8240	8251	8631	java/lang/Exception
    //   8254	8273	8631	java/lang/Exception
    //   8283	8306	8631	java/lang/Exception
    //   8311	8330	8631	java/lang/Exception
    //   8330	8382	8631	java/lang/Exception
    //   8382	8418	8631	java/lang/Exception
    //   8423	8434	8631	java/lang/Exception
    //   8434	8442	8631	java/lang/Exception
  }

  public static void a(ArrayList<u> paramArrayList, long paramLong, u paramu)
  {
    new Thread(new Runnable(paramArrayList, paramLong, paramu)
    {
      public void run()
      {
        int m = this.a.size();
        int i = 0;
        u localu;
        String str;
        Object localObject1;
        int j;
        if (i < m)
        {
          localu = (u)this.a.get(i);
          str = localu.a.A;
          localObject1 = new File(str);
          if ((int)this.b != 0)
            break label179;
          j = 1;
          label61: if (str == null)
            break label339;
          str = str + "audio" + ((File)localObject1).length();
        }
        label179: label336: label339: 
        while (true)
        {
          localObject1 = null;
          int k;
          if (j == 0)
          {
            localObject1 = w.a();
            if (j == 0)
            {
              k = 1;
              label114: localObject1 = (g.hs)((w)localObject1).a(str, k);
            }
          }
          else
          {
            if (localObject1 != null)
              break label336;
            localObject1 = (g.hs)localu.a.j.k;
          }
          while (true)
          {
            Object localObject2;
            if (j != 0)
            {
              j = (int)(this.b >> 32);
              localObject2 = v.a().c(Integer.valueOf(j));
              if (localObject2 == null)
              {
                return;
                j = 0;
                break label61;
                k = 4;
                break label114;
              }
              if (a.c(((g.t)localObject2).o) < 46)
                j = 0;
            }
            while (true)
            {
              if (j < ((g.hs)localObject1).o.size())
              {
                if ((((g.hs)localObject1).o.get(j) instanceof g.hu))
                {
                  localObject2 = new g.hw();
                  ((g.hw)localObject2).d = ((g.r)((g.hs)localObject1).o.get(j)).d;
                  ((g.hs)localObject1).o.remove(j);
                  ((g.hs)localObject1).o.add(localObject2);
                }
              }
              else
              {
                localObject2 = new HashMap();
                if (str != null)
                  ((HashMap)localObject2).put("originalPath", str);
                a.a(new Runnable((g.hs)localObject1, localu, (HashMap)localObject2)
                {
                  public void run()
                  {
                    ac.a().a(this.a, null, this.b.a.A, ac.5.this.b, ac.5.this.c, null, this.c);
                  }
                });
                i += 1;
                break;
              }
              j += 1;
            }
          }
        }
      }
    }).start();
  }

  public static void a(ArrayList<String> paramArrayList1, ArrayList<Uri> paramArrayList, long paramLong, u paramu, ArrayList<String> paramArrayList2, ArrayList<ArrayList<g.ab>> paramArrayList3)
  {
    if (((paramArrayList1 == null) && (paramArrayList == null)) || ((paramArrayList1 != null) && (paramArrayList1.isEmpty())) || ((paramArrayList != null) && (paramArrayList.isEmpty())))
      return;
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    if (paramArrayList1 != null)
      localArrayList1.addAll(paramArrayList1);
    if (paramArrayList != null)
      localArrayList2.addAll(paramArrayList);
    new Thread(new Runnable(paramLong, localArrayList1, localArrayList2, paramArrayList2, paramArrayList3, paramu)
    {
      public void run()
      {
        int j;
        Object localObject3;
        Object localObject4;
        ArrayList localArrayList;
        int k;
        label37: String str;
        Object localObject1;
        Object localObject5;
        int m;
        label49: Object localObject2;
        if ((int)this.a == 0)
        {
          j = 1;
          localObject3 = null;
          localObject4 = null;
          localArrayList = null;
          if (this.b.isEmpty())
            break label273;
          k = this.b.size();
          str = null;
          localObject1 = null;
          localObject5 = null;
          m = 0;
          if (m >= k)
            break label872;
          if (this.b.isEmpty())
            break label284;
          str = (String)this.b.get(m);
          localObject2 = localObject1;
        }
        while (true)
        {
          label83: if ((str == null) && (localObject2 != null))
            localObject1 = a.c((Uri)localObject2);
          for (Object localObject6 = ((Uri)localObject2).toString(); ; localObject6 = str)
          {
            int i = 0;
            label148: Object localObject7;
            if ((localObject1 != null) && ((((String)localObject1).endsWith(".gif")) || (((String)localObject1).endsWith(".webp"))))
              if (((String)localObject1).endsWith(".gif"))
              {
                localObject5 = "gif";
                localObject7 = localObject1;
                localObject1 = localObject5;
                i = 1;
                localObject5 = localObject7;
              }
            while (true)
            {
              label162: if (i != 0)
              {
                if (localObject3 != null)
                  break label949;
                localObject3 = new ArrayList();
                localObject4 = new ArrayList();
                localArrayList = new ArrayList();
              }
              label273: label284: label946: label949: 
              while (true)
              {
                ((ArrayList)localObject3).add(localObject5);
                ((ArrayList)localObject4).add(localObject6);
                if (this.d != null);
                for (localObject5 = (String)this.d.get(m); ; localObject5 = null)
                {
                  localArrayList.add(localObject5);
                  localObject6 = localObject4;
                  m += 1;
                  localObject5 = localObject1;
                  localObject1 = localObject2;
                  localObject4 = localObject6;
                  break label49;
                  j = 0;
                  break;
                  k = this.c.size();
                  break label37;
                  if (this.c.isEmpty())
                    break label978;
                  localObject2 = (Uri)this.c.get(m);
                  break label83;
                  localObject5 = "webp";
                  break label148;
                  if ((localObject1 != null) || (localObject2 == null))
                    break label952;
                  if (MediaController.c((Uri)localObject2))
                  {
                    i = 1;
                    localObject6 = ((Uri)localObject2).toString();
                    localObject5 = MediaController.a((Uri)localObject2, "gif");
                    localObject1 = "gif";
                    break label162;
                  }
                  if (!MediaController.b((Uri)localObject2))
                    break label952;
                  i = 1;
                  localObject6 = ((Uri)localObject2).toString();
                  localObject5 = MediaController.a((Uri)localObject2, "webp");
                  localObject1 = "webp";
                  break label162;
                }
                label472: Object localObject8;
                if (localObject5 != null)
                {
                  localObject7 = new File((String)localObject5);
                  localObject7 = (String)localObject6 + ((File)localObject7).length() + "_" + ((File)localObject7).lastModified();
                  localObject6 = null;
                  if (j == 0)
                  {
                    localObject6 = w.a();
                    if (j != 0)
                      break label705;
                    i = 0;
                    localObject8 = (g.rp)((w)localObject6).a((String)localObject7, i);
                    localObject6 = localObject8;
                    if (localObject8 == null)
                    {
                      localObject6 = localObject8;
                      if (localObject2 != null)
                      {
                        localObject6 = w.a();
                        localObject8 = a.c((Uri)localObject2);
                        if (j != 0)
                          break label710;
                        i = 0;
                        localObject6 = (g.rp)((w)localObject6).a((String)localObject8, i);
                      }
                    }
                  }
                  if (localObject6 != null)
                    break label946;
                  localObject6 = ac.a().a(str, (Uri)localObject2);
                }
                while (true)
                {
                  if (localObject6 != null)
                  {
                    localObject5 = new HashMap();
                    if (this.d != null)
                      ((g.rp)localObject6).f = ((String)this.d.get(m));
                    if (this.e != null)
                    {
                      localObject8 = (ArrayList)this.e.get(m);
                      if ((localObject8 != null) && (!((ArrayList)localObject8).isEmpty()));
                      org.vidogram.tgnet.e locale;
                      for (boolean bool = true; ; bool = false)
                      {
                        ((g.rp)localObject6).j = bool;
                        if (!bool)
                          break label737;
                        locale = new org.vidogram.tgnet.e(((ArrayList)localObject8).size() * 20 + 4);
                        locale.a(((ArrayList)localObject8).size());
                        i = 0;
                        while (i < ((ArrayList)localObject8).size())
                        {
                          ((g.ab)((ArrayList)localObject8).get(i)).a(locale);
                          i += 1;
                        }
                        localObject7 = null;
                        break;
                        label705: i = 3;
                        break label472;
                        label710: i = 3;
                        break label521;
                      }
                      ((HashMap)localObject5).put("masks", Utilities.a(locale.c()));
                    }
                    label737: if (localObject7 != null)
                      ((HashMap)localObject5).put("originalPath", localObject7);
                    a.a(new Runnable((g.rp)localObject6, (HashMap)localObject5)
                    {
                      public void run()
                      {
                        ac.a().a(this.a, null, ac.10.this.a, ac.10.this.f, null, this.b);
                      }
                    });
                    localObject6 = localObject4;
                    break;
                  }
                  localObject6 = localObject4;
                  localObject4 = localObject3;
                  if (localObject3 == null)
                  {
                    localObject4 = new ArrayList();
                    localObject6 = new ArrayList();
                    localArrayList = new ArrayList();
                  }
                  ((ArrayList)localObject4).add(localObject5);
                  ((ArrayList)localObject6).add(localObject7);
                  if (this.d != null);
                  for (localObject3 = (String)this.d.get(m); ; localObject3 = null)
                  {
                    localArrayList.add(localObject3);
                    localObject3 = localObject4;
                    break;
                  }
                  label872: if ((localObject3 != null) && (!((ArrayList)localObject3).isEmpty()))
                  {
                    i = 0;
                    while (i < ((ArrayList)localObject3).size())
                    {
                      ac.a((String)((ArrayList)localObject3).get(i), (String)((ArrayList)localObject4).get(i), null, (String)localObject5, this.a, this.f, (String)localArrayList.get(i));
                      i += 1;
                    }
                  }
                  return;
                }
              }
              label521: label952: localObject7 = localObject5;
              localObject5 = localObject1;
              localObject1 = localObject7;
            }
            localObject1 = str;
          }
          label978: localObject2 = localObject1;
        }
      }
    }).start();
  }

  public static void a(ArrayList<String> paramArrayList1, ArrayList<String> paramArrayList2, ArrayList<Uri> paramArrayList, String paramString, long paramLong, u paramu)
  {
    if (((paramArrayList1 == null) && (paramArrayList2 == null) && (paramArrayList == null)) || ((paramArrayList1 != null) && (paramArrayList2 != null) && (paramArrayList1.size() != paramArrayList2.size())))
      return;
    new Thread(new Runnable(paramArrayList1, paramArrayList2, paramString, paramLong, paramu, paramArrayList)
    {
      public void run()
      {
        int k;
        int j;
        if (this.a != null)
        {
          k = 0;
          j = 0;
          i = j;
          if (k >= this.a.size())
            break label79;
          if (ac.a((String)this.a.get(k), (String)this.b.get(k), null, this.c, this.d, this.e, null))
            break label160;
        }
        label160: for (int i = 1; ; i = j)
        {
          k += 1;
          j = i;
          break;
          i = 0;
          label79: k = i;
          if (this.f != null)
          {
            j = 0;
            while (true)
            {
              k = i;
              if (j >= this.f.size())
                break;
              if (!ac.a(null, null, (Uri)this.f.get(j), this.c, this.d, this.e, null))
                i = 1;
              j += 1;
            }
          }
          if (k != 0)
            a.a(new Runnable()
            {
              public void run()
              {
                try
                {
                  Toast.makeText(ApplicationLoader.a, r.a("UnsupportedAttachment", 2131231918), 0).show();
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
    }).start();
  }

  private void a(a parama)
  {
    if (parama.c == 0)
      if (parama.g != null)
      {
        a(parama.g, parama);
        p.a().a(parama.g, "file");
      }
    label882: 
    do
    {
      while (true)
      {
        return;
        if (parama.a != null)
        {
          localObject = m.a(parama.e).toString();
          a((String)localObject, parama);
          m.a().a((String)localObject, false, true);
          return;
        }
        localObject = m.a(parama.e).toString();
        if ((parama.b != null) && (parama.e.b != 0) && (!new File((String)localObject).exists()))
        {
          a(m.b(parama.e), parama);
          m.a().a(parama.e, "jpg", 0, false);
          return;
        }
        a((String)localObject, parama);
        m.a().a((String)localObject, true, true);
        return;
        if (parama.c == 1)
        {
          if (parama.j != null)
          {
            str = parama.h.a.A;
            localObject = str;
            if (str == null)
              localObject = m.a().b(4) + "/" + parama.f.b + ".mp4";
            a((String)localObject, parama);
            MediaController.a().f(parama.h);
            return;
          }
          if (parama.a != null)
          {
            if ((parama.a instanceof g.rb))
              localObject = ((g.rb)parama.a).i;
            while (((g.ah)localObject).f == null)
            {
              str = parama.h.a.A;
              localObject = str;
              if (str == null)
                localObject = m.a().b(4) + "/" + parama.f.b + ".mp4";
              a((String)localObject, parama);
              if (parama.h.o != null)
              {
                m.a().a((String)localObject, false, false, parama.f.h);
                return;
                localObject = ((g.qw)parama.a).f;
                continue;
              }
              m.a().a((String)localObject, false, false);
              return;
            }
            localObject = m.a().b(4) + "/" + parama.e.c + "_" + parama.e.d + ".jpg";
            a((String)localObject, parama);
            m.a().a((String)localObject, false, true);
            return;
          }
          String str = parama.h.a.A;
          localObject = str;
          if (str == null)
            localObject = m.a().b(4) + "/" + parama.f.b + ".mp4";
          a((String)localObject, parama);
          if (parama.h.o != null)
          {
            m.a().a((String)localObject, true, false, parama.f.h);
            return;
          }
          m.a().a((String)localObject, true, false);
          return;
        }
        if (parama.c != 2)
          break label882;
        if (parama.g != null)
        {
          a(parama.g, parama);
          p.a().a(parama.g, "gif");
          return;
        }
        if (parama.a == null)
          break;
        if ((parama.a instanceof g.rb))
          localObject = ((g.rb)parama.a).i;
        while (((g.ah)localObject).f == null)
        {
          localObject = parama.h.a.A;
          a((String)localObject, parama);
          if (parama.a != null)
          {
            m.a().a((String)localObject, false, false);
            return;
            localObject = ((g.qw)parama.a).f;
            continue;
          }
          m.a().a((String)localObject, true, false);
          return;
        }
        if ((((g.ah)localObject).g != null) || (parama.e == null))
          continue;
        localObject = m.a().b(4) + "/" + parama.e.c + "_" + parama.e.d + ".jpg";
        a((String)localObject, parama);
        m.a().a((String)localObject, false, true);
        return;
      }
      localObject = parama.h.a.A;
      if ((parama.b != null) && (parama.f.k != 0) && (!new File((String)localObject).exists()))
      {
        a(m.b(parama.f), parama);
        m.a().a(parama.f, true, false);
        return;
      }
      a((String)localObject, parama);
      m.a().a((String)localObject, true, false);
      return;
    }
    while (parama.c != 3);
    Object localObject = parama.h.a.A;
    a((String)localObject, parama);
    if (parama.a != null)
    {
      m.a().a((String)localObject, false, true);
      return;
    }
    m.a().a((String)localObject, true, true);
  }

  private void a(f paramf, u paramu, String paramString)
  {
    g.ar localar = paramu.a;
    a(localar);
    ConnectionsManager localConnectionsManager = ConnectionsManager.a();
    paramu = new c(localar, paramf, paramu, paramString)
    {
    };
    paramString = new b(localar)
    {
    };
    if ((paramf instanceof g.rc));
    for (int i = 128; ; i = 0)
    {
      localConnectionsManager.a(paramf, paramu, paramString, i | 0x44);
      return;
    }
  }

  public static void a(g.d paramd, HashMap<String, String> paramHashMap, long paramLong, u paramu)
  {
    if (paramd == null);
    do
    {
      return;
      if ((paramd.n instanceof g.dd))
      {
        new Thread(new Runnable(paramd, paramLong, paramHashMap, paramu)
        {
          public void run()
          {
            Object localObject6;
            Object localObject1;
            Object localObject5;
            String str;
            if ((this.a instanceof g.dc))
              if (this.a.d.equals("game"))
              {
                if ((int)this.b == 0)
                  return;
                localObject6 = new g.jb();
                ((g.jb)localObject6).g = this.a.e;
                ((g.jb)localObject6).h = this.a.f;
                ((g.jb)localObject6).f = this.a.c;
                ((g.jb)localObject6).i = this.a.o;
                if (!(this.a.p instanceof g.hs))
                  break label1878;
                ((g.jb)localObject6).j = this.a.p;
                ((g.jb)localObject6).c |= 1;
                localObject1 = null;
                localObject5 = null;
                str = null;
              }
            while (true)
            {
              label135: if ((this.c != null) && (this.a.i != null))
                this.c.put("originalPath", this.a.i);
              a.a(new Runnable((g.hs)localObject5, str, (g.rp)localObject1, (g.jb)localObject6)
              {
                public void run()
                {
                  if (this.a != null)
                  {
                    this.a.n = ac.7.this.a.n.e;
                    ac.a().a(this.a, null, this.b, ac.7.this.b, ac.7.this.d, ac.7.this.a.n.d, ac.7.this.c);
                  }
                  do
                  {
                    return;
                    if (this.c == null)
                      continue;
                    this.c.f = ac.7.this.a.n.e;
                    ac.a().a(this.c, ac.7.this.a.i, ac.7.this.b, ac.7.this.d, ac.7.this.a.n.d, ac.7.this.c);
                    return;
                  }
                  while (this.d == null);
                  ac.a().a(this.d, ac.7.this.b, ac.7.this.a.n.d, ac.7.this.c);
                }
              });
              return;
              if (this.a.p != null)
              {
                if ((this.a.p instanceof g.hs))
                {
                  localObject5 = (g.hs)this.a.p;
                  localObject6 = null;
                  localObject1 = null;
                  str = null;
                  continue;
                }
              }
              else if ((this.a.o != null) && ((this.a.o instanceof g.rp)))
              {
                localObject1 = (g.rp)this.a.o;
                localObject6 = null;
                localObject5 = null;
                str = null;
                continue;
                if (this.a.i != null)
                {
                  localObject1 = new File(m.a().b(4), Utilities.e(this.a.i) + "." + p.b(this.a.i, "file"));
                  if (((File)localObject1).exists())
                  {
                    str = ((File)localObject1).getAbsolutePath();
                    label357: localObject5 = this.a.d;
                    i = -1;
                    switch (((String)localObject5).hashCode())
                    {
                    default:
                    case 93166550:
                    case 112386354:
                    case 3143036:
                    case 112202875:
                    case -1890252483:
                    case 102340:
                    case 106642994:
                    }
                  }
                  while (true)
                    switch (i)
                    {
                    default:
                      localObject6 = null;
                      localObject1 = null;
                      localObject5 = null;
                      break label135;
                      str = this.a.i;
                      break label357;
                      if (!((String)localObject5).equals("audio"))
                        continue;
                      i = 0;
                      continue;
                      if (!((String)localObject5).equals("voice"))
                        continue;
                      i = 1;
                      continue;
                      if (!((String)localObject5).equals("file"))
                        continue;
                      i = 2;
                      continue;
                      if (!((String)localObject5).equals("video"))
                        continue;
                      i = 3;
                      continue;
                      if (!((String)localObject5).equals("sticker"))
                        continue;
                      i = 4;
                      continue;
                      if (!((String)localObject5).equals("gif"))
                        continue;
                      i = 5;
                      continue;
                      if (!((String)localObject5).equals("photo"))
                        continue;
                      i = 6;
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    }
                  localObject5 = new g.hs();
                  ((g.hs)localObject5).b = 0L;
                  ((g.hs)localObject5).h = 0;
                  ((g.hs)localObject5).k = 0;
                  ((g.hs)localObject5).g = this.a.j;
                  ((g.hs)localObject5).e = ConnectionsManager.a().b();
                  localObject6 = new g.hx();
                  ((g.hs)localObject5).o.add(localObject6);
                  localObject1 = this.a.d;
                  int i = -1;
                  switch (((String)localObject1).hashCode())
                  {
                  default:
                    label756: switch (i)
                    {
                    default:
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    }
                  case 102340:
                  case 112386354:
                  case 93166550:
                  case 3143036:
                  case 112202875:
                  case -1890252483:
                  }
                  while (true)
                  {
                    if (((g.hx)localObject6).g == null)
                      ((g.hx)localObject6).g = "file";
                    if (((g.hs)localObject5).g == null)
                      ((g.hs)localObject5).g = "application/octet-stream";
                    if (((g.hs)localObject5).i != null)
                      break label1857;
                    ((g.hs)localObject5).i = new g.rs();
                    ((g.hs)localObject5).i.d = this.a.k;
                    ((g.hs)localObject5).i.e = this.a.l;
                    ((g.hs)localObject5).i.f = 0;
                    ((g.hs)localObject5).i.c = new g.ja();
                    ((g.hs)localObject5).i.b = "x";
                    localObject6 = null;
                    localObject1 = null;
                    break;
                    if (!((String)localObject1).equals("gif"))
                      break label756;
                    i = 0;
                    break label756;
                    if (!((String)localObject1).equals("voice"))
                      break label756;
                    i = 1;
                    break label756;
                    if (!((String)localObject1).equals("audio"))
                      break label756;
                    i = 2;
                    break label756;
                    if (!((String)localObject1).equals("file"))
                      break label756;
                    i = 3;
                    break label756;
                    if (!((String)localObject1).equals("video"))
                      break label756;
                    i = 4;
                    break label756;
                    if (!((String)localObject1).equals("sticker"))
                      break label756;
                    i = 5;
                    break label756;
                    ((g.hx)localObject6).g = "animation.gif";
                    if (str.endsWith("mp4"))
                    {
                      ((g.hs)localObject5).g = "video/mp4";
                      ((g.hs)localObject5).o.add(new g.ht());
                    }
                    while (true)
                    {
                      try
                      {
                        if (!str.endsWith("mp4"))
                          break label1105;
                        localObject1 = ThumbnailUtils.createVideoThumbnail(str, 1);
                        if (localObject1 == null)
                          break;
                        ((g.hs)localObject5).i = p.a((Bitmap)localObject1, 90.0F, 90.0F, 55, false);
                        ((Bitmap)localObject1).recycle();
                      }
                      catch (Throwable localThrowable1)
                      {
                        n.a("tmessages", localThrowable1);
                      }
                      break;
                      ((g.hs)localObject5).g = "image/gif";
                      continue;
                      label1105: localObject2 = p.a(str, null, 90.0F, 90.0F, true);
                    }
                    Object localObject2 = new g.hu();
                    ((g.hu)localObject2).d = this.a.m;
                    ((g.hu)localObject2).m = true;
                    ((g.hx)localObject6).g = "audio.ogg";
                    ((g.hs)localObject5).o.add(localObject2);
                    ((g.hs)localObject5).i = new g.rt();
                    ((g.hs)localObject5).i.b = "s";
                    continue;
                    localObject2 = new g.hu();
                    ((g.hu)localObject2).d = this.a.m;
                    ((g.hu)localObject2).k = this.a.e;
                    ((g.hu)localObject2).e |= 1;
                    if (this.a.f != null)
                    {
                      ((g.hu)localObject2).l = this.a.f;
                      ((g.hu)localObject2).e |= 2;
                    }
                    ((g.hx)localObject6).g = "audio.mp3";
                    ((g.hs)localObject5).o.add(localObject2);
                    ((g.hs)localObject5).i = new g.rt();
                    ((g.hs)localObject5).i.b = "s";
                    continue;
                    i = this.a.j.indexOf('/');
                    if (i != -1)
                    {
                      ((g.hx)localObject6).g = ("file." + this.a.j.substring(i + 1));
                      continue;
                    }
                    ((g.hx)localObject6).g = "file";
                    continue;
                    ((g.hx)localObject6).g = "video.mp4";
                    localObject2 = new g.ie();
                    ((g.ie)localObject2).h = this.a.k;
                    ((g.ie)localObject2).i = this.a.l;
                    ((g.ie)localObject2).d = this.a.m;
                    ((g.hs)localObject5).o.add(localObject2);
                    try
                    {
                      localObject2 = p.a(new File(m.a().b(4), Utilities.e(this.a.h) + "." + p.b(this.a.h, "jpg")).getAbsolutePath(), null, 90.0F, 90.0F, true);
                      if (localObject2 == null)
                        continue;
                      ((g.hs)localObject5).i = p.a((Bitmap)localObject2, 90.0F, 90.0F, 55, false);
                      ((Bitmap)localObject2).recycle();
                    }
                    catch (Throwable localThrowable2)
                    {
                      n.a("tmessages", localThrowable2);
                    }
                    continue;
                    Object localObject3 = new g.ia();
                    ((g.ia)localObject3).b = "";
                    ((g.ia)localObject3).c = new g.lq();
                    ((g.hs)localObject5).o.add(localObject3);
                    localObject3 = new g.hz();
                    ((g.hz)localObject3).h = this.a.k;
                    ((g.hz)localObject3).i = this.a.l;
                    ((g.hs)localObject5).o.add(localObject3);
                    ((g.hx)localObject6).g = "sticker.webp";
                    try
                    {
                      localObject3 = p.a(new File(m.a().b(4), Utilities.e(this.a.h) + "." + p.b(this.a.h, "webp")).getAbsolutePath(), null, 90.0F, 90.0F, true);
                      if (localObject3 == null)
                        continue;
                      ((g.hs)localObject5).i = p.a((Bitmap)localObject3, 90.0F, 90.0F, 55, false);
                      ((Bitmap)localObject3).recycle();
                    }
                    catch (Throwable localThrowable3)
                    {
                      n.a("tmessages", localThrowable3);
                    }
                  }
                  if (localThrowable3.exists());
                  for (localObject5 = ac.a().a(str, null); ; localObject5 = null)
                  {
                    localObject4 = localObject5;
                    if (localObject5 == null)
                    {
                      localObject4 = new g.rp();
                      ((g.rp)localObject4).e = ConnectionsManager.a().b();
                      localObject5 = new g.rs();
                      ((g.rs)localObject5).d = this.a.k;
                      ((g.rs)localObject5).e = this.a.l;
                      ((g.rs)localObject5).f = 1;
                      ((g.rs)localObject5).c = new g.ja();
                      ((g.rs)localObject5).b = "x";
                      ((g.rp)localObject4).h.add(localObject5);
                    }
                    localObject6 = null;
                    localObject5 = null;
                    break;
                  }
                  label1857: localObject6 = null;
                  localObject4 = null;
                  continue;
                }
              }
              localObject6 = null;
              Object localObject4 = null;
              localObject5 = null;
              str = null;
              continue;
              label1878: localObject4 = null;
              localObject5 = null;
              str = null;
            }
          }
        }).run();
        return;
      }
      if ((paramd.n instanceof g.dh))
      {
        localObject = a();
        String str = paramd.n.g;
        if (!paramd.n.f);
        for (boolean bool = true; ; bool = false)
        {
          ((ac)localObject).a(str, paramLong, paramu, null, bool, paramd.n.h, paramd.n.d, paramHashMap);
          return;
        }
      }
      if ((paramd.n instanceof g.dg))
      {
        localObject = new g.of();
        ((g.of)localObject).e = paramd.n.c;
        ((g.of)localObject).g = paramd.n.m;
        ((g.of)localObject).f = paramd.n.l;
        ((g.of)localObject).h = paramd.n.n;
        ((g.of)localObject).i = paramd.n.o;
        a().a((g.au)localObject, paramLong, paramu, paramd.n.d, paramHashMap);
        return;
      }
      if (!(paramd.n instanceof g.df))
        continue;
      localObject = new g.oa();
      ((g.oa)localObject).e = paramd.n.c;
      a().a((g.au)localObject, paramLong, paramu, paramd.n.d, paramHashMap);
      return;
    }
    while (!(paramd.n instanceof g.de));
    Object localObject = new g.uj();
    ((g.vw)localObject).i = paramd.n.i;
    ((g.vw)localObject).e = paramd.n.j;
    ((g.vw)localObject).f = paramd.n.k;
    a().a((g.vw)localObject, paramLong, paramu, paramd.n.d, paramHashMap);
  }

  // ERROR //
  private static void b(String paramString, g.ie paramie, af paramaf)
  {
    // Byte code:
    //   0: new 1377	android/media/MediaMetadataRetriever
    //   3: dup
    //   4: invokespecial 1378	android/media/MediaMetadataRetriever:<init>	()V
    //   7: astore 6
    //   9: aload 6
    //   11: astore 5
    //   13: aload 6
    //   15: aload_0
    //   16: invokevirtual 1381	android/media/MediaMetadataRetriever:setDataSource	(Ljava/lang/String;)V
    //   19: aload 6
    //   21: astore 5
    //   23: aload 6
    //   25: bipush 18
    //   27: invokevirtual 1385	android/media/MediaMetadataRetriever:extractMetadata	(I)Ljava/lang/String;
    //   30: astore 7
    //   32: aload 7
    //   34: ifnull +16 -> 50
    //   37: aload 6
    //   39: astore 5
    //   41: aload_1
    //   42: aload 7
    //   44: invokestatic 1389	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   47: putfield 1390	org/vidogram/tgnet/g$ie:h	I
    //   50: aload 6
    //   52: astore 5
    //   54: aload 6
    //   56: bipush 19
    //   58: invokevirtual 1385	android/media/MediaMetadataRetriever:extractMetadata	(I)Ljava/lang/String;
    //   61: astore 7
    //   63: aload 7
    //   65: ifnull +16 -> 81
    //   68: aload 6
    //   70: astore 5
    //   72: aload_1
    //   73: aload 7
    //   75: invokestatic 1389	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   78: putfield 1391	org/vidogram/tgnet/g$ie:i	I
    //   81: aload 6
    //   83: astore 5
    //   85: aload 6
    //   87: bipush 9
    //   89: invokevirtual 1385	android/media/MediaMetadataRetriever:extractMetadata	(I)Ljava/lang/String;
    //   92: astore 7
    //   94: aload 7
    //   96: ifnull +26 -> 122
    //   99: aload 6
    //   101: astore 5
    //   103: aload_1
    //   104: aload 7
    //   106: invokestatic 1395	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   109: l2f
    //   110: ldc_w 1396
    //   113: fdiv
    //   114: f2d
    //   115: invokestatic 1400	java/lang/Math:ceil	(D)D
    //   118: d2i
    //   119: putfield 1401	org/vidogram/tgnet/g$ie:d	I
    //   122: aload 6
    //   124: astore 5
    //   126: getstatic 1406	android/os/Build$VERSION:SDK_INT	I
    //   129: bipush 17
    //   131: if_icmplt +47 -> 178
    //   134: aload 6
    //   136: astore 5
    //   138: aload 6
    //   140: bipush 24
    //   142: invokevirtual 1385	android/media/MediaMetadataRetriever:extractMetadata	(I)Ljava/lang/String;
    //   145: astore 7
    //   147: aload 7
    //   149: ifnull +29 -> 178
    //   152: aload 6
    //   154: astore 5
    //   156: aload 7
    //   158: invokestatic 627	org/vidogram/messenger/Utilities:a	(Ljava/lang/String;)Ljava/lang/Integer;
    //   161: invokevirtual 630	java/lang/Integer:intValue	()I
    //   164: istore_3
    //   165: aload_2
    //   166: ifnull +96 -> 262
    //   169: aload 6
    //   171: astore 5
    //   173: aload_2
    //   174: iload_3
    //   175: putfield 1407	org/vidogram/messenger/af:c	I
    //   178: iconst_1
    //   179: istore 4
    //   181: iload 4
    //   183: istore_3
    //   184: aload 6
    //   186: ifnull +11 -> 197
    //   189: aload 6
    //   191: invokevirtual 1410	android/media/MediaMetadataRetriever:release	()V
    //   194: iload 4
    //   196: istore_3
    //   197: iload_3
    //   198: ifne +63 -> 261
    //   201: getstatic 799	org/vidogram/messenger/ApplicationLoader:a	Landroid/content/Context;
    //   204: new 553	java/io/File
    //   207: dup
    //   208: aload_0
    //   209: invokespecial 1254	java/io/File:<init>	(Ljava/lang/String;)V
    //   212: invokestatic 1416	android/net/Uri:fromFile	(Ljava/io/File;)Landroid/net/Uri;
    //   215: invokestatic 1422	android/media/MediaPlayer:create	(Landroid/content/Context;Landroid/net/Uri;)Landroid/media/MediaPlayer;
    //   218: astore_0
    //   219: aload_0
    //   220: ifnull +41 -> 261
    //   223: aload_1
    //   224: aload_0
    //   225: invokevirtual 1425	android/media/MediaPlayer:getDuration	()I
    //   228: i2f
    //   229: ldc_w 1396
    //   232: fdiv
    //   233: f2d
    //   234: invokestatic 1400	java/lang/Math:ceil	(D)D
    //   237: d2i
    //   238: putfield 1401	org/vidogram/tgnet/g$ie:d	I
    //   241: aload_1
    //   242: aload_0
    //   243: invokevirtual 1428	android/media/MediaPlayer:getVideoWidth	()I
    //   246: putfield 1390	org/vidogram/tgnet/g$ie:h	I
    //   249: aload_1
    //   250: aload_0
    //   251: invokevirtual 1431	android/media/MediaPlayer:getVideoHeight	()I
    //   254: putfield 1391	org/vidogram/tgnet/g$ie:i	I
    //   257: aload_0
    //   258: invokevirtual 1432	android/media/MediaPlayer:release	()V
    //   261: return
    //   262: iload_3
    //   263: bipush 90
    //   265: if_icmpeq +10 -> 275
    //   268: iload_3
    //   269: sipush 270
    //   272: if_icmpne -94 -> 178
    //   275: aload 6
    //   277: astore 5
    //   279: aload_1
    //   280: getfield 1390	org/vidogram/tgnet/g$ie:h	I
    //   283: istore_3
    //   284: aload 6
    //   286: astore 5
    //   288: aload_1
    //   289: aload_1
    //   290: getfield 1391	org/vidogram/tgnet/g$ie:i	I
    //   293: putfield 1390	org/vidogram/tgnet/g$ie:h	I
    //   296: aload 6
    //   298: astore 5
    //   300: aload_1
    //   301: iload_3
    //   302: putfield 1391	org/vidogram/tgnet/g$ie:i	I
    //   305: goto -127 -> 178
    //   308: astore 5
    //   310: aload 6
    //   312: astore_2
    //   313: aload 5
    //   315: astore 6
    //   317: aload_2
    //   318: astore 5
    //   320: ldc_w 416
    //   323: aload 6
    //   325: invokestatic 421	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   328: aload_2
    //   329: ifnull +7 -> 336
    //   332: aload_2
    //   333: invokevirtual 1410	android/media/MediaMetadataRetriever:release	()V
    //   336: iconst_0
    //   337: istore_3
    //   338: goto -141 -> 197
    //   341: astore_2
    //   342: ldc_w 416
    //   345: aload_2
    //   346: invokestatic 421	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   349: iload 4
    //   351: istore_3
    //   352: goto -155 -> 197
    //   355: astore_2
    //   356: ldc_w 416
    //   359: aload_2
    //   360: invokestatic 421	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   363: iconst_0
    //   364: istore_3
    //   365: goto -168 -> 197
    //   368: astore_0
    //   369: aconst_null
    //   370: astore 5
    //   372: aload 5
    //   374: ifnull +8 -> 382
    //   377: aload 5
    //   379: invokevirtual 1410	android/media/MediaMetadataRetriever:release	()V
    //   382: aload_0
    //   383: athrow
    //   384: astore_1
    //   385: ldc_w 416
    //   388: aload_1
    //   389: invokestatic 421	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   392: goto -10 -> 382
    //   395: astore_0
    //   396: ldc_w 416
    //   399: aload_0
    //   400: invokestatic 421	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   403: return
    //   404: astore_0
    //   405: goto -33 -> 372
    //   408: astore 6
    //   410: aconst_null
    //   411: astore_2
    //   412: goto -95 -> 317
    //
    // Exception table:
    //   from	to	target	type
    //   13	19	308	java/lang/Exception
    //   23	32	308	java/lang/Exception
    //   41	50	308	java/lang/Exception
    //   54	63	308	java/lang/Exception
    //   72	81	308	java/lang/Exception
    //   85	94	308	java/lang/Exception
    //   103	122	308	java/lang/Exception
    //   126	134	308	java/lang/Exception
    //   138	147	308	java/lang/Exception
    //   156	165	308	java/lang/Exception
    //   173	178	308	java/lang/Exception
    //   279	284	308	java/lang/Exception
    //   288	296	308	java/lang/Exception
    //   300	305	308	java/lang/Exception
    //   189	194	341	java/lang/Exception
    //   332	336	355	java/lang/Exception
    //   0	9	368	finally
    //   377	382	384	java/lang/Exception
    //   201	219	395	java/lang/Exception
    //   223	261	395	java/lang/Exception
    //   13	19	404	finally
    //   23	32	404	finally
    //   41	50	404	finally
    //   54	63	404	finally
    //   72	81	404	finally
    //   85	94	404	finally
    //   103	122	404	finally
    //   126	134	404	finally
    //   138	147	404	finally
    //   156	165	404	finally
    //   173	178	404	finally
    //   279	284	404	finally
    //   288	296	404	finally
    //   300	305	404	finally
    //   320	328	404	finally
    //   0	9	408	java/lang/Exception
  }

  public static void b(ArrayList<MediaController.j> paramArrayList, long paramLong, u paramu)
  {
    if ((paramArrayList == null) || (paramArrayList.isEmpty()))
      return;
    new Thread(new Runnable(paramLong, paramArrayList, paramu)
    {
      public void run()
      {
        boolean bool2;
        int i;
        label13: MediaController.j localj;
        HashMap localHashMap;
        Object localObject2;
        Object localObject1;
        label84: Object localObject5;
        Object localObject4;
        g.hs localhs;
        if ((int)this.a == 0)
        {
          bool2 = true;
          i = 0;
          if (i >= this.b.size())
            break label1212;
          localj = (MediaController.j)this.b.get(i);
          if (localj.h != 1)
            break label756;
          localHashMap = new HashMap();
          if (!(localj.m instanceof g.hs))
            break label572;
          localObject2 = (g.hs)localj.m;
          localObject1 = m.a((f)localObject2, true);
          localObject5 = localObject1;
          localObject4 = localObject2;
          if (localObject2 == null)
          {
            if (localj.d != null)
              localHashMap.put("url", localj.d);
            localObject2 = null;
            localhs = new g.hs();
            localhs.b = 0L;
            localhs.e = ConnectionsManager.a().b();
            localObject4 = new g.hx();
            ((g.hx)localObject4).g = "animation.gif";
            localhs.o.add(localObject4);
            localhs.h = localj.g;
            localhs.k = 0;
            if (!((File)localObject1).toString().endsWith("mp4"))
              break label699;
            localhs.g = "video/mp4";
            localhs.o.add(new g.ht());
            label226: if (!((File)localObject1).exists())
              break label709;
            localObject2 = localObject1;
            label238: localObject4 = localObject2;
            if (localObject2 == null)
            {
              localObject2 = Utilities.e(localj.c) + "." + p.b(localj.c, "jpg");
              localObject2 = new File(m.a().b(4), (String)localObject2);
              localObject4 = localObject2;
              if (!((File)localObject2).exists())
                localObject4 = null;
            }
            if (localObject4 == null);
          }
        }
        while (true)
        {
          try
          {
            if (!((File)localObject4).getAbsolutePath().endsWith("mp4"))
              continue;
            localObject2 = ThumbnailUtils.createVideoThumbnail(((File)localObject4).getAbsolutePath(), 1);
            if (localObject2 == null)
              continue;
            localhs.i = p.a((Bitmap)localObject2, 90.0F, 90.0F, 55, bool2);
            ((Bitmap)localObject2).recycle();
            localObject5 = localObject1;
            localObject4 = localhs;
            if (localhs.i != null)
              continue;
            localhs.i = new g.rs();
            localhs.i.d = localj.e;
            localhs.i.e = localj.f;
            localhs.i.f = 0;
            localhs.i.c = new g.ja();
            localhs.i.b = "x";
            localObject4 = localhs;
            localObject5 = localObject1;
            if (localj.l == null)
              continue;
            ((g.hs)localObject4).n = localj.l.toString();
            localObject1 = localj.b;
            if (localObject5 != null)
              continue;
            localObject1 = localj.b;
            if ((localHashMap == null) || (localj.b == null))
              continue;
            localHashMap.put("originalPath", localj.b);
            a.a(new Runnable((g.hs)localObject4, (String)localObject1, localHashMap)
            {
              public void run()
              {
                ac.a().a(this.a, null, this.b, ac.8.this.a, ac.8.this.c, null, this.c);
              }
            });
            i += 1;
            break label13;
            bool2 = false;
            break;
            label572: if (bool2)
              break label1213;
            localObject1 = w.a();
            localObject2 = localj.b;
            if (bool2)
              continue;
            j = 1;
            localObject1 = (g.q)((w)localObject1).a((String)localObject2, j);
            if (!(localObject1 instanceof g.hs))
              break label1213;
            localObject1 = (g.hs)localObject1;
            localObject2 = Utilities.e(localj.b) + "." + p.b(localj.b, "jpg");
            localObject4 = new File(m.a().b(4), (String)localObject2);
            localObject2 = localObject1;
            localObject1 = localObject4;
            break label84;
            j = 4;
            continue;
            label699: localhs.g = "image/gif";
            break label226;
            label709: localObject1 = null;
            break label238;
            localObject2 = p.a(((File)localObject4).getAbsolutePath(), null, 90.0F, 90.0F, true);
            continue;
          }
          catch (Exception localException)
          {
            n.a("tmessages", localException);
            continue;
            localObject1 = localObject5.toString();
            continue;
          }
          label756: boolean bool3 = true;
          boolean bool4 = true;
          Object localObject3 = null;
          if (!bool2)
          {
            localObject1 = w.a();
            localObject3 = localj.b;
            if (bool2)
              break label1207;
          }
          label1207: for (int j = 0; ; j = 3)
          {
            localObject3 = (g.rp)((w)localObject1).a((String)localObject3, j);
            localObject4 = localObject3;
            if (localObject3 == null)
            {
              localObject1 = Utilities.e(localj.b) + "." + p.b(localj.b, "jpg");
              localObject4 = new File(m.a().b(4), (String)localObject1);
              localObject1 = localObject3;
              boolean bool1 = bool4;
              if (((File)localObject4).exists())
              {
                localObject1 = localObject3;
                bool1 = bool4;
                if (((File)localObject4).length() != 0L)
                {
                  localObject3 = ac.a().a(((File)localObject4).toString(), null);
                  localObject1 = localObject3;
                  bool1 = bool4;
                  if (localObject3 != null)
                  {
                    bool1 = false;
                    localObject1 = localObject3;
                  }
                }
              }
              localObject4 = localObject1;
              bool3 = bool1;
              if (localObject1 == null)
              {
                localObject3 = Utilities.e(localj.c) + "." + p.b(localj.c, "jpg");
                localObject3 = new File(m.a().b(4), (String)localObject3);
                if (((File)localObject3).exists())
                  localObject1 = ac.a().a(((File)localObject3).toString(), null);
                localObject4 = localObject1;
                bool3 = bool1;
                if (localObject1 == null)
                {
                  localObject4 = new g.rp();
                  ((g.rp)localObject4).e = ConnectionsManager.a().b();
                  localObject1 = new g.rs();
                  ((g.rs)localObject1).d = localj.e;
                  ((g.rs)localObject1).e = localj.f;
                  ((g.rs)localObject1).f = 0;
                  ((g.rs)localObject1).c = new g.ja();
                  ((g.rs)localObject1).b = "x";
                  ((g.rp)localObject4).h.add(localObject1);
                  bool3 = bool1;
                }
              }
            }
            if (localObject4 == null)
              break;
            if (localj.l != null)
              ((g.rp)localObject4).f = localj.l.toString();
            localObject1 = new HashMap();
            if (localj.b != null)
              ((HashMap)localObject1).put("originalPath", localj.b);
            a.a(new Runnable((g.rp)localObject4, bool3, localj, (HashMap)localObject1)
            {
              public void run()
              {
                ac localac = ac.a();
                g.rp localrp = this.a;
                if (this.b);
                for (String str = this.c.b; ; str = null)
                {
                  localac.a(localrp, str, ac.8.this.a, ac.8.this.c, null, this.d);
                  return;
                }
              }
            });
            break;
          }
          label1212: return;
          label1213: localObject1 = null;
        }
      }
    }).start();
  }

  private static boolean b(String paramString1, String paramString2, Uri paramUri, String paramString3, long paramLong, u paramu, String paramString4)
  {
    if (((paramString1 == null) || (paramString1.length() == 0)) && (paramUri == null))
      return false;
    if ((paramUri != null) && (a.a(paramUri)))
      return false;
    if ((paramString1 != null) && (a.a(Uri.fromFile(new File(paramString1)))))
      return false;
    MimeTypeMap localMimeTypeMap = MimeTypeMap.getSingleton();
    Object localObject2 = null;
    String str1 = paramString1;
    if (paramUri != null)
    {
      paramString1 = null;
      if (paramString3 != null)
        paramString1 = localMimeTypeMap.getExtensionFromMimeType(paramString3);
      paramString3 = paramString1;
      if (paramString1 == null)
        paramString3 = "txt";
      paramString1 = MediaController.a(paramUri, paramString3);
      str1 = paramString1;
      if (paramString1 == null)
        return false;
    }
    File localFile = new File(str1);
    if ((!localFile.exists()) || (localFile.length() == 0L))
      return false;
    boolean bool;
    int i;
    label154: String str2;
    int j;
    if ((int)paramLong == 0)
    {
      bool = true;
      if (bool)
        break label280;
      i = 1;
      str2 = localFile.getName();
      j = str1.lastIndexOf('.');
      if (j == -1)
        break label1088;
    }
    label280: label426: label445: label1088: for (paramString3 = str1.substring(j + 1); ; paramString3 = "")
    {
      Object localObject1;
      if (!paramString3.toLowerCase().equals("mp3"))
      {
        localObject1 = localObject2;
        if (!paramString3.toLowerCase().equals("m4a"));
      }
      else
      {
        paramUri = org.vidogram.messenger.a.a.a(localFile);
        localObject1 = localObject2;
        if (paramUri != null)
        {
          localObject1 = localObject2;
          if (paramUri.a() != 0L)
          {
            if (!bool)
              break label966;
            j = (int)(paramLong >> 32);
            paramString1 = v.a().c(Integer.valueOf(j));
            if (paramString1 == null)
            {
              return false;
              bool = false;
              break;
              i = 0;
              break label154;
            }
            if (a.c(paramString1.o) < 46)
              break label955;
            paramString1 = new g.hu();
            paramString1.d = (int)(paramUri.a() / 1000L);
            paramString1.k = paramUri.b();
            paramString1.l = paramUri.c();
            if (paramString1.k == null)
            {
              paramString1.k = "";
              paramString1.e |= 1;
            }
            if (paramString1.l == null)
            {
              paramString1.l = "";
              paramString1.e |= 2;
            }
            localObject1 = paramString1;
          }
        }
      }
      paramUri = paramString2;
      if (paramString2 != null)
      {
        if (localObject1 != null)
          paramUri = paramString2 + "audio" + localFile.length();
      }
      else
      {
        paramString1 = null;
        if (!bool)
        {
          paramString1 = w.a();
          if (bool)
            break label1009;
          j = 1;
          paramString2 = (g.hs)paramString1.a(paramUri, j);
          paramString1 = paramString2;
          if (paramString2 == null)
          {
            paramString1 = paramString2;
            if (!str1.equals(paramUri))
            {
              paramString1 = paramString2;
              if (!bool)
              {
                paramString1 = w.a();
                paramString2 = str1 + localFile.length();
                if (bool)
                  break label1015;
                j = 1;
                paramString1 = (g.hs)paramString1.a(paramString2, j);
              }
            }
          }
        }
        if (paramString1 != null)
          break label1085;
        paramString1 = new g.hs();
        paramString1.b = 0L;
        paramString1.e = ConnectionsManager.a().b();
        paramString2 = new g.hx();
        paramString2.g = str2;
        paramString1.o.add(paramString2);
        paramString1.h = (int)localFile.length();
        paramString1.k = 0;
        if (localObject1 != null)
          paramString1.o.add(localObject1);
        if (paramString3.length() == 0)
          break label1053;
        if (!paramString3.toLowerCase().equals("webp"))
          break label1021;
        paramString1.g = "image/webp";
        label634: if (!paramString1.g.equals("image/gif"));
      }
      while (true)
        try
        {
          paramString3 = p.a(localFile.getAbsolutePath(), null, 90.0F, 90.0F, true);
          if (paramString3 == null)
            continue;
          paramString2.g = "animation.gif";
          paramString1.i = p.a(paramString3, 90.0F, 90.0F, 55, bool);
          paramString3.recycle();
          if ((!paramString1.g.equals("image/webp")) || (i == 0))
            continue;
          paramString2 = new BitmapFactory.Options();
        }
        catch (Exception paramString2)
        {
          try
          {
            paramString2.inJustDecodeBounds = true;
            paramString3 = new RandomAccessFile(str1, "r");
            localObject1 = paramString3.getChannel().map(FileChannel.MapMode.READ_ONLY, 0L, str1.length());
            Utilities.loadWebpImage(null, (ByteBuffer)localObject1, ((ByteBuffer)localObject1).limit(), paramString2, true);
            paramString3.close();
            if ((paramString2.outWidth == 0) || (paramString2.outHeight == 0) || (paramString2.outWidth > 800) || (paramString2.outHeight > 800))
              continue;
            paramString3 = new g.ia();
            paramString3.b = "";
            paramString3.c = new g.lq();
            paramString1.o.add(paramString3);
            paramString3 = new g.hz();
            paramString3.h = paramString2.outWidth;
            paramString3.i = paramString2.outHeight;
            paramString1.o.add(paramString3);
            if (paramString1.i != null)
              continue;
            paramString1.i = new g.rt();
            paramString1.i.b = "s";
            paramString1.n = paramString4;
            paramString2 = new HashMap();
            if (paramUri == null)
              continue;
            paramString2.put("originalPath", paramUri);
            a.a(new Runnable(paramString1, str1, paramLong, paramu, paramString2)
            {
              public void run()
              {
                ac.a().a(this.a, null, this.b, this.c, this.d, null, this.e);
              }
            });
            return true;
            paramString1 = new g.hw();
            break;
            label966: paramString1 = new g.hu();
            break;
            paramUri = paramString2 + "" + localFile.length();
            break label426;
            label1009: j = 4;
            break label445;
            label1015: j = 4;
            break label516;
            label1021: paramString3 = localMimeTypeMap.getMimeTypeFromExtension(paramString3.toLowerCase());
            if (paramString3 == null)
              continue;
            paramString1.g = paramString3;
            break label634;
            paramString1.g = "application/octet-stream";
            break label634;
            paramString1.g = "application/octet-stream";
            break label634;
            paramString2 = paramString2;
            n.a("tmessages", paramString2);
          }
          catch (Exception paramString3)
          {
            n.a("tmessages", paramString3);
            continue;
          }
        }
    }
  }

  private static String d(String paramString)
  {
    String str = paramString.trim();
    if (str.length() == 0)
    {
      paramString = str;
      return paramString;
    }
    while (true)
    {
      str = paramString;
      if (!paramString.startsWith("\n"))
        break;
      paramString = paramString.substring(1);
    }
    while (true)
    {
      paramString = str;
      if (!str.endsWith("\n"))
        break;
      str = str.substring(0, str.length() - 1);
    }
  }

  public int a(u paramu, String paramString, boolean paramBoolean, g paramg, ArrayList<g.at> paramArrayList, Runnable paramRunnable)
  {
    boolean bool = false;
    if ((paramg == null) || (paramg.l() == null) || (paramRunnable == null))
      return 0;
    g.pi localpi = new g.pi();
    localpi.e = v.c((int)paramu.u());
    localpi.g = paramString;
    localpi.c |= 2048;
    localpi.f = paramu.q();
    if (!paramBoolean)
      bool = true;
    localpi.d = bool;
    if (paramArrayList != null)
    {
      localpi.i = paramArrayList;
      localpi.c |= 8;
    }
    return ConnectionsManager.a().a(localpi, new c(paramRunnable, paramg)
    {
    });
  }

  public g.rp a(String paramString, Uri paramUri)
  {
    Bitmap localBitmap2 = p.a(paramString, paramUri, a.f(), a.f(), true);
    Bitmap localBitmap1 = localBitmap2;
    if (localBitmap2 == null)
    {
      localBitmap1 = localBitmap2;
      if (a.f() != 800)
        localBitmap1 = p.a(paramString, paramUri, 800.0F, 800.0F, true);
    }
    paramString = new ArrayList();
    paramUri = p.a(localBitmap1, 90.0F, 90.0F, 55, true);
    if (paramUri != null)
      paramString.add(paramUri);
    paramUri = p.a(localBitmap1, a.f(), a.f(), 80, false, 101, 101);
    if (paramUri != null)
      paramString.add(paramUri);
    if (localBitmap1 != null)
      localBitmap1.recycle();
    if (paramString.isEmpty())
      return null;
    ad.a(false);
    paramUri = new g.rp();
    paramUri.e = ConnectionsManager.a().b();
    paramUri.h = paramString;
    return paramUri;
  }

  protected void a(int paramInt)
  {
    int i = this.c.size();
    this.c.remove(Integer.valueOf(paramInt));
    if ((i != 0) && (this.c.size() == 0))
      d();
  }

  public void a(int paramInt, Object[] paramArrayOfObject)
  {
    Object localObject2;
    Object localObject3;
    label99: int i;
    label143: label188: long l;
    if (paramInt == y.av)
    {
      localObject2 = (String)paramArrayOfObject[0];
      localObject3 = (g.ad)paramArrayOfObject[1];
      g.ac localac = (g.ac)paramArrayOfObject[2];
      ArrayList localArrayList = (ArrayList)this.b.get(localObject2);
      if (localArrayList != null)
      {
        paramInt = 0;
        if (paramInt < localArrayList.size())
        {
          a locala = (a)localArrayList.get(paramInt);
          localObject1 = null;
          if ((locala.a instanceof g.rb))
          {
            localObject1 = ((g.rb)locala.a).i;
            if ((localObject3 == null) || (localObject1 == null))
              break label426;
            if (locala.c != 0)
              break label188;
            ((g.ah)localObject1).f = ((g.ad)localObject3);
            a(locala.a, locala.h, locala.d);
            localArrayList.remove(paramInt);
            i = paramInt - 1;
          }
          while (true)
          {
            paramInt = i + 1;
            break;
            if (!(locala.a instanceof g.qw))
              break label99;
            localObject1 = ((g.qw)locala.a).f;
            break label99;
            if (locala.c == 1)
            {
              if (((g.ah)localObject1).f == null)
              {
                ((g.ah)localObject1).f = ((g.ad)localObject3);
                if ((((g.ah)localObject1).g == null) && (locala.e != null))
                {
                  a(locala);
                  break label143;
                }
                a(locala.a, locala.h, locala.d);
                break label143;
              }
              ((g.ah)localObject1).g = ((g.ad)localObject3);
              a(locala.a, locala.h, locala.d);
              break label143;
            }
            if (locala.c == 2)
            {
              if (((g.ah)localObject1).f == null)
              {
                ((g.ah)localObject1).f = ((g.ad)localObject3);
                if ((((g.ah)localObject1).g == null) && (locala.e != null))
                {
                  a(locala);
                  break label143;
                }
                a(locala.a, locala.h, locala.d);
                break label143;
              }
              ((g.ah)localObject1).g = ((g.ad)localObject3);
              a(locala.a, locala.h, locala.d);
              break label143;
            }
            if (locala.c != 3)
              break label143;
            ((g.ah)localObject1).f = ((g.ad)localObject3);
            a(locala.a, locala.h, locala.d);
            break label143;
            label426: i = paramInt;
            if (localac == null)
              continue;
            i = paramInt;
            if (locala.b == null)
              continue;
            if (((locala.b.e instanceof g.hi)) || ((locala.b.e instanceof g.hf)) || ((locala.b.e instanceof g.ha)))
            {
              l = ((Long)paramArrayOfObject[5]).longValue();
              locala.b.e.d = (int)l;
            }
            locala.b.e.e = ((byte[])(byte[])paramArrayOfObject[3]);
            locala.b.e.f = ((byte[])(byte[])paramArrayOfObject[4]);
            ab.a().a(locala.b, locala.h.a, locala.i, localac, locala.d, locala.h);
            localArrayList.remove(paramInt);
            i = paramInt - 1;
          }
        }
        if (localArrayList.isEmpty())
          this.b.remove(localObject2);
      }
    }
    label982: 
    do
    {
      do
        while (true)
        {
          return;
          boolean bool;
          if (paramInt == y.aw)
          {
            localObject1 = (String)paramArrayOfObject[0];
            bool = ((Boolean)paramArrayOfObject[1]).booleanValue();
            paramArrayOfObject = (ArrayList)this.b.get(localObject1);
            if (paramArrayOfObject == null)
              continue;
            for (paramInt = 0; paramInt < paramArrayOfObject.size(); paramInt = i + 1)
            {
              localObject2 = (a)paramArrayOfObject.get(paramInt);
              if ((!bool) || (((a)localObject2).b == null))
              {
                i = paramInt;
                if (bool)
                  continue;
                i = paramInt;
                if (((a)localObject2).a == null)
                  continue;
              }
              w.a().a(((a)localObject2).h.a);
              ((a)localObject2).h.a.y = 2;
              paramArrayOfObject.remove(paramInt);
              i = paramInt - 1;
              y.a().a(y.j, new Object[] { Integer.valueOf(((a)localObject2).h.q()) });
              a(((a)localObject2).h.q());
            }
            if (!paramArrayOfObject.isEmpty())
              continue;
            this.b.remove(localObject1);
            return;
          }
          if (paramInt == y.aB)
          {
            localObject1 = (u)paramArrayOfObject[0];
            paramArrayOfObject = (String)paramArrayOfObject[1];
            paramArrayOfObject = (ArrayList)this.b.get(((u)localObject1).a.A);
            if (paramArrayOfObject == null)
              continue;
            paramInt = 0;
            while (true)
            {
              if (paramInt < paramArrayOfObject.size())
              {
                localObject2 = (a)paramArrayOfObject.get(paramInt);
                if (((a)localObject2).h == localObject1)
                {
                  ((a)localObject2).j = null;
                  a((a)localObject2);
                  paramArrayOfObject.remove(paramInt);
                }
              }
              else
              {
                if (!paramArrayOfObject.isEmpty())
                  break;
                this.b.remove(((u)localObject1).a.A);
                return;
              }
              paramInt += 1;
            }
          }
          if (paramInt == y.aC)
          {
            localObject1 = (u)paramArrayOfObject[0];
            localObject2 = (String)paramArrayOfObject[1];
            l = ((Long)paramArrayOfObject[2]).longValue();
            if ((int)((u)localObject1).u() == 0)
            {
              bool = true;
              m.a().a((String)localObject2, bool, l);
              if (l == 0L)
                continue;
              paramArrayOfObject = (ArrayList)this.b.get(((u)localObject1).a.A);
              if (paramArrayOfObject == null)
                continue;
              paramInt = 0;
            }
            while (true)
            {
              if (paramInt < paramArrayOfObject.size())
              {
                localObject2 = (a)paramArrayOfObject.get(paramInt);
                if (((a)localObject2).h == localObject1)
                {
                  ((a)localObject2).h.o = null;
                  ((a)localObject2).h.a.i = "-1";
                  ((a)localObject2).h.a.j.k.h = (int)l;
                  localObject3 = new ArrayList();
                  ((ArrayList)localObject3).add(((a)localObject2).h.a);
                  w.a().a((ArrayList)localObject3, false, true, false, 0);
                }
              }
              else
              {
                if (!paramArrayOfObject.isEmpty())
                  break;
                this.b.remove(((u)localObject1).a.A);
                return;
                bool = false;
                break label982;
              }
              paramInt += 1;
            }
          }
          if (paramInt == y.aD)
          {
            localObject1 = (u)paramArrayOfObject[0];
            paramArrayOfObject = (String)paramArrayOfObject[1];
            a(((u)localObject1).a.A);
            localObject2 = (ArrayList)this.b.get(paramArrayOfObject);
            if (localObject2 == null)
              continue;
            for (paramInt = 0; paramInt < ((ArrayList)localObject2).size(); paramInt = i + 1)
            {
              localObject3 = (a)((ArrayList)localObject2).get(paramInt);
              i = paramInt;
              if (((a)localObject3).h != localObject1)
                continue;
              w.a().a(((a)localObject3).h.a);
              ((a)localObject3).h.a.y = 2;
              ((ArrayList)localObject2).remove(paramInt);
              i = paramInt - 1;
              y.a().a(y.j, new Object[] { Integer.valueOf(((a)localObject3).h.q()) });
              a(((a)localObject3).h.q());
            }
            if (!((ArrayList)localObject2).isEmpty())
              continue;
            this.b.remove(paramArrayOfObject);
            return;
          }
          if (paramInt == y.al)
          {
            paramArrayOfObject = (String)paramArrayOfObject[0];
            localObject1 = (ArrayList)this.b.get(paramArrayOfObject);
            if (localObject1 == null)
              continue;
            paramInt = 0;
            if (paramInt < ((ArrayList)localObject1).size())
            {
              localObject2 = (a)((ArrayList)localObject1).get(paramInt);
              if (((a)localObject2).c == 0)
              {
                localObject3 = Utilities.e(((a)localObject2).g) + "." + p.b(((a)localObject2).g, "file");
                localObject3 = new File(m.a().b(4), (String)localObject3);
                Utilities.d.b(new Runnable((File)localObject3, (a)localObject2)
                {
                  public void run()
                  {
                    a.a(new Runnable(ac.a().a(this.a.toString(), null))
                    {
                      public void run()
                      {
                        if (this.a != null)
                        {
                          ac.12.this.b.g = null;
                          ac.12.this.b.h.a.j.d = this.a;
                          ac.12.this.b.h.a.A = ac.12.this.a.toString();
                          ac.12.this.b.e = ((g.az)this.a.h.get(this.a.h.size() - 1)).c;
                          ArrayList localArrayList = new ArrayList();
                          localArrayList.add(ac.12.this.b.h.a);
                          w.a().a(localArrayList, false, true, false, 0);
                          ac.a(ac.this, ac.12.this.b);
                          y.a().a(y.E, new Object[] { ac.12.this.b.h });
                          return;
                        }
                        n.a("tmessages", "can't load image " + ac.12.this.b.g + " to file " + ac.12.this.a.toString());
                        w.a().a(ac.12.this.b.h.a);
                        ac.12.this.b.h.a.y = 2;
                        y.a().a(y.j, new Object[] { Integer.valueOf(ac.12.this.b.h.q()) });
                        ac.this.a(ac.12.this.b.h.q());
                      }
                    });
                  }
                });
              }
              while (true)
              {
                paramInt += 1;
                break;
                if (((a)localObject2).c != 2)
                  continue;
                localObject3 = Utilities.e(((a)localObject2).g) + ".gif";
                localObject3 = new File(m.a().b(4), (String)localObject3);
                Utilities.d.b(new Runnable((a)localObject2, (File)localObject3)
                {
                  public void run()
                  {
                    boolean bool = true;
                    if ((this.a.f.i.c instanceof g.ja));
                    try
                    {
                      Bitmap localBitmap = p.a(this.b.getAbsolutePath(), null, 90.0F, 90.0F, true);
                      g.hs localhs;
                      if (localBitmap != null)
                      {
                        localhs = this.a.f;
                        if (this.a.b == null)
                          break label136;
                      }
                      while (true)
                      {
                        localhs.i = p.a(localBitmap, 90.0F, 90.0F, 55, bool);
                        localBitmap.recycle();
                        if (this.a.f.i == null)
                        {
                          this.a.f.i = new g.rt();
                          this.a.f.i.b = "s";
                        }
                        a.a(new Runnable()
                        {
                          public void run()
                          {
                            ac.13.this.a.g = null;
                            ac.13.this.a.h.a.A = ac.13.this.b.toString();
                            ac.13.this.a.e = ac.13.this.a.f.i.c;
                            ArrayList localArrayList = new ArrayList();
                            localArrayList.add(ac.13.this.a.h.a);
                            w.a().a(localArrayList, false, true, false, 0);
                            ac.a(ac.this, ac.13.this.a);
                            y.a().a(y.E, new Object[] { ac.13.this.a.h });
                          }
                        });
                        return;
                        label136: bool = false;
                      }
                    }
                    catch (Exception localException)
                    {
                      while (true)
                      {
                        this.a.f.i = null;
                        n.a("tmessages", localException);
                      }
                    }
                  }
                });
              }
            }
            this.b.remove(paramArrayOfObject);
            return;
          }
          if (paramInt != y.az)
            break;
          paramArrayOfObject = (String)paramArrayOfObject[0];
          localObject1 = (ArrayList)this.b.get(paramArrayOfObject);
          if (localObject1 == null)
            continue;
          paramInt = 0;
          while (paramInt < ((ArrayList)localObject1).size())
          {
            a((a)((ArrayList)localObject1).get(paramInt));
            paramInt += 1;
          }
          this.b.remove(paramArrayOfObject);
          return;
        }
      while ((paramInt != y.am) && (paramInt != y.aA));
      paramArrayOfObject = (String)paramArrayOfObject[0];
      localObject1 = (ArrayList)this.b.get(paramArrayOfObject);
    }
    while (localObject1 == null);
    Object localObject1 = ((ArrayList)localObject1).iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (a)((Iterator)localObject1).next();
      w.a().a(((a)localObject2).h.a);
      ((a)localObject2).h.a.y = 2;
      y.a().a(y.j, new Object[] { Integer.valueOf(((a)localObject2).h.q()) });
      a(((a)localObject2).h.q());
    }
    this.b.remove(paramArrayOfObject);
  }

  protected void a(String paramString)
  {
    w.a().c().b(new Runnable(paramString)
    {
      public void run()
      {
        a.a(new Runnable()
        {
          public void run()
          {
            y.a().a(y.A, new Object[] { ac.18.this.a });
          }
        });
      }
    });
  }

  public void a(String paramString, long paramLong, u paramu, g.wb paramwb, boolean paramBoolean, ArrayList<g.at> paramArrayList, g.bb parambb, HashMap<String, String> paramHashMap)
  {
    a(paramString, null, null, null, null, null, null, paramLong, null, paramu, paramwb, paramBoolean, null, paramArrayList, parambb, paramHashMap);
  }

  public void a(ArrayList<u> paramArrayList, long paramLong)
  {
    if (((int)paramLong == 0) || (paramArrayList == null) || (paramArrayList.isEmpty()));
    int i;
    g.aw localaw;
    boolean bool1;
    boolean bool2;
    while (true)
    {
      return;
      i = (int)paramLong;
      localaw = v.d((int)paramLong);
      if (i <= 0)
        break;
      if (v.a().a(Integer.valueOf(i)) == null)
        continue;
      bool1 = false;
      bool2 = false;
    }
    while (true)
    {
      label53: ArrayList localArrayList2 = new ArrayList();
      ArrayList localArrayList3 = new ArrayList();
      Object localObject1 = new ArrayList();
      ArrayList localArrayList1 = new ArrayList();
      Object localObject2 = new HashMap();
      g.aj localaj = v.c(i);
      i = 0;
      label108: Object localObject3;
      if (i < paramArrayList.size())
      {
        localObject3 = (u)paramArrayList.get(i);
        if (((u)localObject3).q() > 0)
          break label208;
        localObject3 = localObject2;
        localObject2 = localObject1;
        localObject1 = localObject3;
      }
      while (true)
      {
        i += 1;
        localObject3 = localObject2;
        localObject2 = localObject1;
        localObject1 = localObject3;
        break label108;
        break;
        localObject1 = v.a().b(Integer.valueOf(-i));
        if (!e.d((g.i)localObject1))
          break label1509;
        bool2 = ((g.i)localObject1).r;
        bool1 = ((g.i)localObject1).y;
        break label53;
        label208: Object localObject4 = new g.mg();
        int j;
        label474: label487: Object localObject5;
        if (((u)localObject3).S())
        {
          ((g.ar)localObject4).w = ((u)localObject3).a.w;
          ((g.ar)localObject4).j = ((u)localObject3).a.j;
          ((g.ar)localObject4).k = 4;
          if (((g.ar)localObject4).j != null)
            ((g.ar)localObject4).k |= 512;
          if (bool2)
            ((g.ar)localObject4).k |= -2147483648;
          if (((u)localObject3).a.x != 0)
          {
            ((g.ar)localObject4).x = ((u)localObject3).a.x;
            ((g.ar)localObject4).k |= 2048;
          }
          ((g.ar)localObject4).i = ((u)localObject3).a.i;
          ((g.ar)localObject4).z = ((u)localObject3).q();
          ((g.ar)localObject4).A = ((u)localObject3).a.A;
          ((g.ar)localObject4).p = ((u)localObject3).a.p;
          if (!((g.ar)localObject4).p.isEmpty())
            ((g.ar)localObject4).k |= 128;
          if (((g.ar)localObject4).A == null)
            ((g.ar)localObject4).A = "";
          j = ad.a();
          ((g.ar)localObject4).b = j;
          ((g.ar)localObject4).D = j;
          ((g.ar)localObject4).n = true;
          if ((localaw.b == 0) || (bool2))
            break label1388;
          if (!bool1)
            break label1377;
          j = ad.c();
          ((g.ar)localObject4).c = j;
          ((g.ar)localObject4).v = true;
          if (((g.ar)localObject4).C == 0L)
            ((g.ar)localObject4).C = c();
          ((ArrayList)localObject1).add(Long.valueOf(((g.ar)localObject4).C));
          ((HashMap)localObject2).put(Long.valueOf(((g.ar)localObject4).C), localObject4);
          localArrayList1.add(Integer.valueOf(((g.ar)localObject4).z));
          ((g.ar)localObject4).e = ConnectionsManager.a().b();
          if (!(localaj instanceof g.kw))
            break label1422;
          if (bool2)
            break label1413;
          ((g.ar)localObject4).s = 1;
          ((g.ar)localObject4).k |= 1024;
          label594: ((g.ar)localObject4).E = paramLong;
          ((g.ar)localObject4).d = localaw;
          if ((u.i((g.ar)localObject4)) && (((g.ar)localObject4).d.b == 0))
            ((g.ar)localObject4).m = true;
          if ((((u)localObject3).a.d instanceof g.rj))
            ((g.ar)localObject4).F = (-((u)localObject3).a.d.b);
          localObject5 = new u((g.ar)localObject4, null, true);
          ((u)localObject5).a.y = 1;
          localArrayList2.add(localObject5);
          localArrayList3.add(localObject4);
          a((g.ar)localObject4);
          if (d.a)
            n.a("tmessages", "forward message user_id = " + localaj.b + " chat_id = " + localaj.d + " channel_id = " + localaj.e + " access_hash = " + localaj.c);
          if ((localArrayList3.size() != 100) && (i != paramArrayList.size() - 1) && ((i == paramArrayList.size() - 1) || (((u)paramArrayList.get(i + 1)).u() == ((u)localObject3).u())))
            break label1494;
          w.a().a(new ArrayList(localArrayList3), false, true, false, 0);
          v.a().a(paramLong, localArrayList2);
          y.a().a(y.c, new Object[0]);
          ad.a(false);
          localObject4 = new g.pk();
          ((g.pk)localObject4).j = localaj;
          if ((((g.pk)localObject4).j instanceof g.kw))
            ((g.pk)localObject4).d = ApplicationLoader.a.getSharedPreferences("Notifications", 0).getBoolean("silent_" + paramLong, false);
          if (!(((u)localObject3).a.d instanceof g.rj))
            break label1473;
          localObject5 = v.a().b(Integer.valueOf(((u)localObject3).a.d.b));
          ((g.pk)localObject4).g = new g.kw();
          ((g.pk)localObject4).g.e = ((u)localObject3).a.d.b;
          if (localObject5 != null)
            ((g.pk)localObject4).g.c = ((g.i)localObject5).u;
          label1038: ((g.pk)localObject4).i = ((ArrayList)localObject1);
          ((g.pk)localObject4).h = localArrayList1;
          if ((paramArrayList.size() != 1) || (!((u)paramArrayList.get(0)).a.J))
            break label1488;
        }
        label1413: label1422: label1473: label1488: for (boolean bool3 = true; ; bool3 = false)
        {
          ((g.pk)localObject4).f = bool3;
          ConnectionsManager.a().a((f)localObject4, new c(paramLong, bool2, (HashMap)localObject2, localArrayList3, localArrayList2, localaw)
          {
          }
          , 68);
          if (i == paramArrayList.size() - 1)
            break label1494;
          localArrayList2 = new ArrayList();
          localArrayList3 = new ArrayList();
          localObject2 = new ArrayList();
          localArrayList1 = new ArrayList();
          localObject1 = new HashMap();
          break;
          ((g.ar)localObject4).w = new g.nt();
          if (((u)localObject3).l())
          {
            ((g.ar)localObject4).w.d = ((u)localObject3).a.c;
            localObject5 = ((g.ar)localObject4).w;
            ((g.nt)localObject5).c |= 1;
          }
          while (true)
          {
            ((g.ar)localObject4).e = ((u)localObject3).a.e;
            break;
            ((g.ar)localObject4).w.f = ((u)localObject3).a.d.b;
            localObject5 = ((g.ar)localObject4).w;
            ((g.nt)localObject5).c |= 2;
            if (!((u)localObject3).a.v)
              continue;
            ((g.ar)localObject4).w.g = ((u)localObject3).q();
            localObject5 = ((g.ar)localObject4).w;
            ((g.nt)localObject5).c |= 4;
            if (((u)localObject3).a.c <= 0)
              continue;
            ((g.ar)localObject4).w.d = ((u)localObject3).a.c;
            localObject5 = ((g.ar)localObject4).w;
            ((g.nt)localObject5).c |= 1;
          }
          label1377: j = -localaw.b;
          break label474;
          label1388: ((g.ar)localObject4).c = ad.c();
          ((g.ar)localObject4).k |= 256;
          break label487;
          ((g.ar)localObject4).o = true;
          break label594;
          if ((((u)localObject3).a.k & 0x400) != 0)
          {
            ((g.ar)localObject4).s = ((u)localObject3).a.s;
            ((g.ar)localObject4).k |= 1024;
          }
          ((g.ar)localObject4).o = true;
          break label594;
          ((g.pk)localObject4).g = new g.ky();
          break label1038;
        }
        label1494: localObject3 = localObject1;
        localObject1 = localObject2;
        localObject2 = localObject3;
      }
      label1509: bool1 = false;
      bool2 = false;
    }
  }

  protected void a(ArrayList<g.ar> paramArrayList, ArrayList<g.vw> paramArrayList1, ArrayList<g.i> paramArrayList2, ArrayList<g.t> paramArrayList3)
  {
    a.a(new Runnable(paramArrayList1, paramArrayList2, paramArrayList3, paramArrayList)
    {
      public void run()
      {
        v.a().a(this.a, true);
        v.a().b(this.b, true);
        v.a().c(this.c, true);
        int i = 0;
        while (i < this.d.size())
        {
          u localu = new u((g.ar)this.d.get(i), null, false);
          ac.this.a(localu, true);
          i += 1;
        }
      }
    });
  }

  public void a(u paramu)
  {
    Iterator localIterator = this.b.entrySet().iterator();
    boolean bool = false;
    Object localObject = null;
    int i;
    if (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      ArrayList localArrayList = (ArrayList)localEntry.getValue();
      i = 0;
      label55: if (i >= localArrayList.size())
        break label233;
      a locala = (a)localArrayList.get(i);
      if (locala.h.q() == paramu.q())
      {
        localArrayList.remove(i);
        MediaController.a().g(locala.h);
        if (localArrayList.size() != 0)
          break label233;
        localObject = (String)localEntry.getKey();
        if (locala.b == null)
          break label236;
        bool = true;
      }
    }
    label221: label233: label236: 
    while (true)
    {
      break;
      i += 1;
      break label55;
      if (localObject != null)
      {
        if (!((String)localObject).startsWith("http"))
          break label221;
        p.a().g((String)localObject);
      }
      while (true)
      {
        a((String)localObject);
        localObject = new ArrayList();
        ((ArrayList)localObject).add(Integer.valueOf(paramu.q()));
        v.a().a((ArrayList)localObject, null, null, paramu.a.d.b);
        return;
        m.a().a((String)localObject, bool);
      }
      continue;
    }
  }

  public void a(u paramu, long paramLong)
  {
    if (paramu == null)
      return;
    if ((paramu.a.j != null) && (!(paramu.a.j instanceof g.ny)) && (!(paramu.a.j instanceof g.oi)))
    {
      if ((paramu.a.j.d instanceof g.rp))
      {
        paramu.a.j.d.f = paramu.a.j.l;
        a((g.rp)paramu.a.j.d, null, paramLong, paramu.e, null, null);
        return;
      }
      if ((paramu.a.j.k instanceof g.hs))
      {
        paramu.a.j.k.n = paramu.a.j.l;
        a((g.hs)paramu.a.j.k, null, paramu.a.A, paramLong, paramu.e, null, null);
        return;
      }
      if (((paramu.a.j instanceof g.of)) || ((paramu.a.j instanceof g.oa)))
      {
        a(paramu.a.j, paramLong, paramu.e, null, null);
        return;
      }
      if (paramu.a.j.n != null)
      {
        localObject = new g.ul();
        ((g.vw)localObject).i = paramu.a.j.n;
        ((g.vw)localObject).e = paramu.a.j.o;
        ((g.vw)localObject).f = paramu.a.j.p;
        ((g.vw)localObject).d = paramu.a.j.q;
        a((g.vw)localObject, paramLong, paramu.e, null, null);
        return;
      }
      localObject = new ArrayList();
      ((ArrayList)localObject).add(paramu);
      a((ArrayList)localObject, paramLong);
      return;
    }
    if (paramu.a.i != null)
    {
      localObject = null;
      if ((paramu.a.j instanceof g.oi))
        localObject = paramu.a.j.r;
      a(paramu.a.i, paramLong, paramu.e, (g.wb)localObject, true, paramu.a.p, null, null);
      return;
    }
    Object localObject = new ArrayList();
    ((ArrayList)localObject).add(paramu);
    a((ArrayList)localObject, paramLong);
  }

  public void a(u paramu, g.aq paramaq)
  {
    paramaq = paramu.q() + "_" + Utilities.a(paramaq.f);
    this.e.put(paramaq, paramu);
    this.g.a();
  }

  public void a(u paramu, g.aq paramaq, q paramq)
  {
    if ((paramu == null) || (paramaq == null) || (paramq == null))
      return;
    String str = paramu.q() + "_" + Utilities.a(paramaq.f);
    this.f.put(str, paramu);
    g.pp localpp = new g.pp();
    localpp.e = v.c((int)paramu.u());
    localpp.f = paramu.q();
    localpp.d = (paramaq instanceof g.lz);
    if (paramaq.f != null)
    {
      localpp.c |= 1;
      localpp.g = paramaq.f;
    }
    ConnectionsManager.a().a(localpp, new c(str, paramq, paramu, paramaq)
    {
    }
    , 2);
  }

  // ERROR //
  public void a(g.aj paramaj, org.vidogram.tgnet.g.ke paramke, long paramLong1, long paramLong2)
  {
    // Byte code:
    //   0: aload_1
    //   1: ifnull +7 -> 8
    //   4: aload_2
    //   5: ifnonnull +4 -> 9
    //   8: return
    //   9: new 1018	org/vidogram/tgnet/g$rb
    //   12: dup
    //   13: invokespecial 1019	org/vidogram/tgnet/g$rb:<init>	()V
    //   16: astore 10
    //   18: aload 10
    //   20: aload_1
    //   21: putfield 1021	org/vidogram/tgnet/g$rb:g	Lorg/vidogram/tgnet/g$aj;
    //   24: aload 10
    //   26: getfield 1021	org/vidogram/tgnet/g$rb:g	Lorg/vidogram/tgnet/g$aj;
    //   29: instanceof 347
    //   32: ifeq +47 -> 79
    //   35: aload 10
    //   37: getstatic 799	org/vidogram/messenger/ApplicationLoader:a	Landroid/content/Context;
    //   40: ldc_w 801
    //   43: iconst_0
    //   44: invokevirtual 807	android/content/Context:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   47: new 697	java/lang/StringBuilder
    //   50: dup
    //   51: invokespecial 698	java/lang/StringBuilder:<init>	()V
    //   54: ldc_w 809
    //   57: invokevirtual 704	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   60: aload_1
    //   61: getfield 351	org/vidogram/tgnet/g$aj:e	I
    //   64: invokevirtual 708	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   67: invokevirtual 721	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   70: iconst_0
    //   71: invokeinterface 815 3 0
    //   76: putfield 1022	org/vidogram/tgnet/g$rb:d	Z
    //   79: lload_3
    //   80: lconst_0
    //   81: lcmp
    //   82: ifeq +109 -> 191
    //   85: lload_3
    //   86: lstore 7
    //   88: aload 10
    //   90: lload 7
    //   92: putfield 1024	org/vidogram/tgnet/g$rb:j	J
    //   95: aload 10
    //   97: aload_2
    //   98: putfield 1026	org/vidogram/tgnet/g$rb:i	Lorg/vidogram/tgnet/g$ah;
    //   101: lload 5
    //   103: lstore 7
    //   105: lload 5
    //   107: lconst_0
    //   108: lcmp
    //   109: ifne +62 -> 171
    //   112: new 1772	org/vidogram/tgnet/NativeByteBuffer
    //   115: dup
    //   116: aload_1
    //   117: invokevirtual 1773	org/vidogram/tgnet/g$aj:b	()I
    //   120: aload_2
    //   121: invokevirtual 1776	org/vidogram/tgnet/g$ke:b	()I
    //   124: iadd
    //   125: iconst_4
    //   126: iadd
    //   127: bipush 8
    //   129: iadd
    //   130: invokespecial 1778	org/vidogram/tgnet/NativeByteBuffer:<init>	(I)V
    //   133: astore 9
    //   135: aload 9
    //   137: iconst_3
    //   138: invokevirtual 1779	org/vidogram/tgnet/NativeByteBuffer:a	(I)V
    //   141: aload 9
    //   143: lload_3
    //   144: invokevirtual 1782	org/vidogram/tgnet/NativeByteBuffer:a	(J)V
    //   147: aload_1
    //   148: aload 9
    //   150: invokevirtual 1785	org/vidogram/tgnet/g$aj:a	(Lorg/vidogram/tgnet/a;)V
    //   153: aload_2
    //   154: aload 9
    //   156: invokevirtual 1786	org/vidogram/tgnet/g$ke:a	(Lorg/vidogram/tgnet/a;)V
    //   159: aload 9
    //   161: astore_1
    //   162: invokestatic 232	org/vidogram/messenger/w:a	()Lorg/vidogram/messenger/w;
    //   165: aload_1
    //   166: invokevirtual 1789	org/vidogram/messenger/w:a	(Lorg/vidogram/tgnet/NativeByteBuffer;)J
    //   169: lstore 7
    //   171: invokestatic 392	org/vidogram/tgnet/ConnectionsManager:a	()Lorg/vidogram/tgnet/ConnectionsManager;
    //   174: aload 10
    //   176: new 32	org/vidogram/messenger/ac$17
    //   179: dup
    //   180: aload_0
    //   181: lload 7
    //   183: invokespecial 1792	org/vidogram/messenger/ac$17:<init>	(Lorg/vidogram/messenger/ac;J)V
    //   186: invokevirtual 1627	org/vidogram/tgnet/ConnectionsManager:a	(Lorg/vidogram/tgnet/f;Lorg/vidogram/tgnet/c;)I
    //   189: pop
    //   190: return
    //   191: aload_0
    //   192: invokevirtual 369	org/vidogram/messenger/ac:c	()J
    //   195: lstore 7
    //   197: goto -109 -> 88
    //   200: astore_2
    //   201: aconst_null
    //   202: astore_1
    //   203: ldc_w 416
    //   206: aload_2
    //   207: invokestatic 421	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   210: goto -48 -> 162
    //   213: astore_2
    //   214: aload 9
    //   216: astore_1
    //   217: goto -14 -> 203
    //
    // Exception table:
    //   from	to	target	type
    //   112	135	200	java/lang/Exception
    //   135	159	213	java/lang/Exception
  }

  protected void a(g.ar paramar)
  {
    this.d.put(Integer.valueOf(paramar.b), paramar);
  }

  public void a(g.au paramau, long paramLong, u paramu, g.bb parambb, HashMap<String, String> paramHashMap)
  {
    a(null, paramau, null, null, null, null, null, paramLong, null, paramu, null, true, null, null, parambb, paramHashMap);
  }

  public void a(g.hs paramhs, af paramaf, String paramString, long paramLong, u paramu, g.bb parambb, HashMap<String, String> paramHashMap)
  {
    a(null, null, null, paramaf, null, paramhs, null, paramLong, paramString, paramu, null, true, null, null, parambb, paramHashMap);
  }

  public void a(g.j paramj)
  {
    this.a = paramj;
  }

  public void a(g.jb paramjb, long paramLong, g.bb parambb, HashMap<String, String> paramHashMap)
  {
    a(null, null, null, null, null, null, paramjb, paramLong, null, null, null, true, null, null, parambb, paramHashMap);
  }

  public void a(g.q paramq, long paramLong, u paramu)
  {
    if (paramq == null);
    int i;
    Object localObject2;
    while (true)
    {
      return;
      if ((int)paramLong != 0)
        break;
      i = (int)(paramLong >> 32);
      if (v.a().c(Integer.valueOf(i)) == null)
        continue;
      if (!(paramq.i instanceof g.rs))
        break;
      localObject2 = m.a(paramq.i, true);
      if (!((File)localObject2).exists())
        break;
    }
    while (true)
    {
      try
      {
        i = (int)((File)localObject2).length();
        Object localObject1 = new byte[(int)((File)localObject2).length()];
        new RandomAccessFile((File)localObject2, "r").readFully(localObject1);
        localObject2 = new g.hs();
        ((g.hs)localObject2).i = new g.rq();
        ((g.hs)localObject2).i.c = paramq.i.c;
        ((g.hs)localObject2).i.f = paramq.i.f;
        ((g.hs)localObject2).i.d = paramq.i.d;
        ((g.hs)localObject2).i.e = paramq.i.e;
        ((g.hs)localObject2).i.b = paramq.i.b;
        ((g.hs)localObject2).i.g = ((B)localObject1);
        ((g.hs)localObject2).b = paramq.b;
        ((g.hs)localObject2).c = paramq.c;
        ((g.hs)localObject2).e = paramq.e;
        ((g.hs)localObject2).g = paramq.g;
        ((g.hs)localObject2).h = paramq.h;
        ((g.hs)localObject2).k = paramq.k;
        ((g.hs)localObject2).o = paramq.o;
        localObject1 = localObject2;
        if (((g.hs)localObject2).g != null)
          continue;
        ((g.hs)localObject2).g = "";
        localObject1 = localObject2;
        a().a((g.hs)localObject1, null, null, paramLong, paramu, null, null);
        return;
      }
      catch (Exception localException)
      {
        n.a("tmessages", localException);
      }
      g.q localq = paramq;
    }
  }

  public void a(g.rp paramrp, String paramString, long paramLong, u paramu, g.bb parambb, HashMap<String, String> paramHashMap)
  {
    a(null, null, paramrp, null, null, null, null, paramLong, paramString, paramu, null, true, null, null, parambb, paramHashMap);
  }

  public void a(g.vw paramvw, long paramLong, u paramu, g.bb parambb, HashMap<String, String> paramHashMap)
  {
    a(null, null, null, null, paramvw, null, null, paramLong, null, paramu, null, true, null, null, parambb, paramHashMap);
  }

  public boolean a(u paramu, boolean paramBoolean)
  {
    if (paramu.q() >= 0)
      return false;
    if ((paramu.a.f instanceof g.ne))
    {
      int i = (int)(paramu.u() >> 32);
      g.t localt = v.a().c(Integer.valueOf(i));
      if (localt == null)
      {
        w.a().a(paramu.a);
        paramu.a.y = 2;
        y.a().a(y.j, new Object[] { Integer.valueOf(paramu.q()) });
        a(paramu.q());
        return false;
      }
      if (paramu.a.C == 0L)
        paramu.a.C = c();
      if ((paramu.a.f.d instanceof g.gu))
        ab.a().g(localt, paramu.a);
      while (true)
      {
        return true;
        if ((paramu.a.f.d instanceof g.gm))
        {
          ab.a().b(localt, null, paramu.a);
          continue;
        }
        if ((paramu.a.f.d instanceof g.gn))
        {
          ab.a().a(localt, paramu.a);
          continue;
        }
        if ((paramu.a.f.d instanceof g.gp))
        {
          ab.a().b(localt, paramu.a);
          continue;
        }
        if ((paramu.a.f.d instanceof g.gq))
        {
          ab.a().a(localt, null, paramu.a);
          continue;
        }
        if ((paramu.a.f.d instanceof g.gt))
        {
          ab.a().c(localt, null, paramu.a);
          continue;
        }
        if (((paramu.a.f.d instanceof g.gv)) || ((paramu.a.f.d instanceof g.gs)))
          continue;
        if ((paramu.a.f.d instanceof g.gl))
        {
          ab.a().e(localt, paramu.a);
          continue;
        }
        if ((paramu.a.f.d instanceof g.gj))
        {
          ab.a().a(localt, paramu.a, 0L);
          continue;
        }
        if ((paramu.a.f.d instanceof g.gr))
        {
          ab.a().c(localt, paramu.a);
          continue;
        }
        if ((paramu.a.f.d instanceof g.gk))
        {
          ab.a().d(localt, paramu.a);
          continue;
        }
        if (!(paramu.a.f.d instanceof g.go))
          continue;
        ab.a().f(localt, paramu.a);
      }
    }
    if (paramBoolean)
      this.c.put(Integer.valueOf(paramu.q()), paramu);
    b(paramu);
    return true;
  }

  protected ArrayList<a> b(String paramString)
  {
    return (ArrayList)this.b.get(paramString);
  }

  public void b()
  {
    this.b.clear();
    this.c.clear();
    this.d.clear();
    this.e.clear();
    this.f.clear();
    this.a = null;
    this.g.b();
  }

  public void b(u paramu)
  {
    a(null, null, null, null, null, null, null, paramu.u(), paramu.a.A, null, null, true, paramu, null, paramu.a.r, paramu.a.B);
  }

  public boolean b(int paramInt)
  {
    return this.d.containsKey(Integer.valueOf(paramInt));
  }

  public boolean b(u paramu, g.aq paramaq)
  {
    return (paramu != null) && (paramaq != null) && (this.e.containsKey(paramu.q() + "_" + Utilities.a(paramaq.f)));
  }

  protected long c()
  {
    long l = 0L;
    while (l == 0L)
      l = Utilities.b.nextLong();
    return l;
  }

  public boolean c(u paramu, g.aq paramaq)
  {
    return (paramu != null) && (paramaq != null) && (this.f.containsKey(paramu.q() + "_" + Utilities.a(paramaq.f)));
  }

  public void d()
  {
    w.a().d(1000);
  }

  protected class a
  {
    public f a;
    public g.gi b;
    public int c;
    public String d;
    public g.x e;
    public g.hs f;
    public String g;
    public u h;
    public g.t i;
    public af j;

    protected a()
    {
    }
  }

  public static class b
  {
    private b a;
    private LocationManager b;
    private a c = new a(null);
    private a d = new a(null);
    private Runnable e;
    private Location f;

    public b()
    {
    }

    public b(b paramb)
    {
      this.a = paramb;
    }

    private void c()
    {
      this.b.removeUpdates(this.c);
      this.b.removeUpdates(this.d);
      this.f = null;
      this.e = null;
    }

    public void a()
    {
      if (this.b == null)
        this.b = ((LocationManager)ApplicationLoader.a.getSystemService("location"));
      try
      {
        this.b.requestLocationUpdates("gps", 1L, 0.0F, this.c);
      }
      catch (Exception localException3)
      {
        try
        {
          this.b.requestLocationUpdates("network", 1L, 0.0F, this.d);
        }
        catch (Exception localException3)
        {
          try
          {
            while (true)
            {
              this.f = this.b.getLastKnownLocation("gps");
              if (this.f == null)
                this.f = this.b.getLastKnownLocation("network");
              if (this.e != null)
                a.b(this.e);
              this.e = new Runnable()
              {
                public void run()
                {
                  if (ac.b.a(ac.b.this) != this)
                    return;
                  if (ac.b.b(ac.b.this) != null)
                  {
                    if (ac.b.d(ac.b.this) == null)
                      break label59;
                    ac.b.b(ac.b.this).a(ac.b.d(ac.b.this));
                  }
                  while (true)
                  {
                    ac.b.c(ac.b.this);
                    return;
                    label59: ac.b.b(ac.b.this).a();
                  }
                }
              };
              a.a(this.e, 5000L);
              return;
              localException1 = localException1;
              n.a("tmessages", localException1);
              continue;
              localException2 = localException2;
              n.a("tmessages", localException2);
            }
          }
          catch (Exception localException3)
          {
            while (true)
              n.a("tmessages", localException3);
          }
        }
      }
    }

    public void b()
    {
      if (this.b == null)
        return;
      if (this.e != null)
        a.b(this.e);
      c();
    }

    private class a
      implements LocationListener
    {
      private a()
      {
      }

      public void onLocationChanged(Location paramLocation)
      {
        if ((paramLocation == null) || (ac.b.a(ac.b.this) == null));
        do
        {
          return;
          n.a("tmessages", "found location " + paramLocation);
          ac.b.a(ac.b.this, paramLocation);
        }
        while (paramLocation.getAccuracy() >= 100.0F);
        if (ac.b.b(ac.b.this) != null)
          ac.b.b(ac.b.this).a(paramLocation);
        if (ac.b.a(ac.b.this) != null)
          a.b(ac.b.a(ac.b.this));
        ac.b.c(ac.b.this);
      }

      public void onProviderDisabled(String paramString)
      {
      }

      public void onProviderEnabled(String paramString)
      {
      }

      public void onStatusChanged(String paramString, int paramInt, Bundle paramBundle)
      {
      }
    }

    public static abstract interface b
    {
      public abstract void a();

      public abstract void a(Location paramLocation);
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.ac
 * JD-Core Version:    0.6.0
 */