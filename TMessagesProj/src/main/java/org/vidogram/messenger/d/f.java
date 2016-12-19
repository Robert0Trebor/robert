package org.vidogram.messenger.d;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import org.vidogram.SQLite.SQLiteCursor;
import org.vidogram.SQLite.SQLiteDatabase;
import org.vidogram.SQLite.SQLitePreparedStatement;
import org.vidogram.messenger.a;
import org.vidogram.messenger.e;
import org.vidogram.messenger.h;
import org.vidogram.messenger.n;
import org.vidogram.messenger.p;
import org.vidogram.messenger.u;
import org.vidogram.messenger.v;
import org.vidogram.messenger.w;
import org.vidogram.messenger.y;
import org.vidogram.tgnet.ConnectionsManager;
import org.vidogram.tgnet.NativeByteBuffer;
import org.vidogram.tgnet.c;
import org.vidogram.tgnet.g.ar;
import org.vidogram.tgnet.g.at;
import org.vidogram.tgnet.g.au;
import org.vidogram.tgnet.g.aw;
import org.vidogram.tgnet.g.kp;
import org.vidogram.tgnet.g.kr;
import org.vidogram.tgnet.g.ks;
import org.vidogram.tgnet.g.kt;
import org.vidogram.tgnet.g.ku;
import org.vidogram.tgnet.g.ni;
import org.vidogram.tgnet.g.no;
import org.vidogram.tgnet.g.nq;
import org.vidogram.tgnet.g.nw;
import org.vidogram.tgnet.g.ob;
import org.vidogram.tgnet.g.ov;
import org.vidogram.tgnet.g.qt;
import org.vidogram.tgnet.g.vw;
import org.vidogram.tgnet.g.we;

public class f
{
  public static int a(g.ar paramar)
  {
    int j = 0;
    int i;
    if (paramar == null)
      i = -1;
    while (true)
    {
      return i;
      i = j;
      if ((paramar.j instanceof g.ob))
        continue;
      if (!(paramar.j instanceof g.nw))
        break;
      if (u.i(paramar))
        return 2;
      i = j;
      if (u.j(paramar))
        continue;
      if (u.f(paramar))
        return -1;
      if (u.h(paramar))
        return 4;
      return 1;
    }
    if (!paramar.p.isEmpty())
    {
      i = 0;
      while (i < paramar.p.size())
      {
        g.at localat = (g.at)paramar.p.get(i);
        if (((localat instanceof g.nq)) || ((localat instanceof g.no)) || ((localat instanceof g.ni)))
          return 3;
        i += 1;
      }
    }
    return -1;
  }

  public static void a(long paramLong, int paramInt)
  {
    w.a().c().b(new Runnable(paramLong, paramInt)
    {
      public void run()
      {
        ArrayList localArrayList = new ArrayList();
        try
        {
          SQLiteCursor localSQLiteCursor = w.a().b().b(String.format(Locale.US, "SELECT data, mid FROM media_v2 WHERE uid = %d AND mid < %d AND type = %d ORDER BY date DESC, mid DESC LIMIT 1000", new Object[] { Long.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(4) }), new Object[0]);
          while (localSQLiteCursor.a())
          {
            NativeByteBuffer localNativeByteBuffer = localSQLiteCursor.g(0);
            if (localNativeByteBuffer == null)
              continue;
            g.ar localar = g.ar.a(localNativeByteBuffer, localNativeByteBuffer.b(false), false);
            localNativeByteBuffer.e();
            if (!u.h(localar))
              continue;
            localar.b = localSQLiteCursor.b(1);
            localar.E = this.a;
            localArrayList.add(0, new u(localar, null, false));
          }
        }
        catch (Exception localException)
        {
          n.a("tmessages", localException);
        }
        while (true)
        {
          a.a(new Runnable(localArrayList)
          {
            public void run()
            {
              y.a().a(y.X, new Object[] { Long.valueOf(f.9.this.a), this.a });
            }
          });
          return;
          localException.b();
        }
      }
    });
  }

  private static void a(long paramLong, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, boolean paramBoolean)
  {
    w.a().c().b(new Runnable(paramInt2, paramLong, paramInt3, paramBoolean, paramInt4, paramInt1, paramInt5)
    {
      // ERROR //
      public void run()
      {
        // Byte code:
        //   0: new 45	org/vidogram/tgnet/g$qi
        //   3: dup
        //   4: invokespecial 46	org/vidogram/tgnet/g$qi:<init>	()V
        //   7: astore 12
        //   9: new 48	java/util/ArrayList
        //   12: dup
        //   13: invokespecial 49	java/util/ArrayList:<init>	()V
        //   16: astore 13
        //   18: new 48	java/util/ArrayList
        //   21: dup
        //   22: invokespecial 49	java/util/ArrayList:<init>	()V
        //   25: astore 14
        //   27: aload_0
        //   28: getfield 24	org/vidogram/messenger/d/f$7:a	I
        //   31: iconst_1
        //   32: iadd
        //   33: istore_2
        //   34: invokestatic 54	org/vidogram/messenger/w:a	()Lorg/vidogram/messenger/w;
        //   37: invokevirtual 57	org/vidogram/messenger/w:b	()Lorg/vidogram/SQLite/SQLiteDatabase;
        //   40: astore 11
        //   42: iconst_0
        //   43: istore 4
        //   45: aload_0
        //   46: getfield 26	org/vidogram/messenger/d/f$7:b	J
        //   49: l2i
        //   50: ifeq +942 -> 992
        //   53: iconst_0
        //   54: istore_1
        //   55: aload_0
        //   56: getfield 28	org/vidogram/messenger/d/f$7:c	I
        //   59: i2l
        //   60: lstore 7
        //   62: aload_0
        //   63: getfield 30	org/vidogram/messenger/d/f$7:d	Z
        //   66: ifeq +1245 -> 1311
        //   69: aload_0
        //   70: getfield 26	org/vidogram/messenger/d/f$7:b	J
        //   73: l2i
        //   74: ineg
        //   75: istore_1
        //   76: goto +1235 -> 1311
        //   79: aload 11
        //   81: getstatic 63	java/util/Locale:US	Ljava/util/Locale;
        //   84: ldc 65
        //   86: iconst_2
        //   87: anewarray 4	java/lang/Object
        //   90: dup
        //   91: iconst_0
        //   92: aload_0
        //   93: getfield 26	org/vidogram/messenger/d/f$7:b	J
        //   96: invokestatic 71	java/lang/Long:valueOf	(J)Ljava/lang/Long;
        //   99: aastore
        //   100: dup
        //   101: iconst_1
        //   102: aload_0
        //   103: getfield 32	org/vidogram/messenger/d/f$7:e	I
        //   106: invokestatic 76	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   109: aastore
        //   110: invokestatic 82	java/lang/String:format	(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   113: iconst_0
        //   114: anewarray 4	java/lang/Object
        //   117: invokevirtual 87	org/vidogram/SQLite/SQLiteDatabase:b	(Ljava/lang/String;[Ljava/lang/Object;)Lorg/vidogram/SQLite/SQLiteCursor;
        //   120: astore 15
        //   122: aload 15
        //   124: invokevirtual 92	org/vidogram/SQLite/SQLiteCursor:a	()Z
        //   127: ifeq +403 -> 530
        //   130: aload 15
        //   132: iconst_0
        //   133: invokevirtual 95	org/vidogram/SQLite/SQLiteCursor:b	(I)I
        //   136: iconst_1
        //   137: if_icmpne +387 -> 524
        //   140: iconst_1
        //   141: istore 4
        //   143: aload 15
        //   145: invokevirtual 97	org/vidogram/SQLite/SQLiteCursor:b	()V
        //   148: lload 7
        //   150: lconst_0
        //   151: lcmp
        //   152: ifeq +613 -> 765
        //   155: lconst_0
        //   156: lstore 5
        //   158: aload 11
        //   160: getstatic 63	java/util/Locale:US	Ljava/util/Locale;
        //   163: ldc 99
        //   165: iconst_3
        //   166: anewarray 4	java/lang/Object
        //   169: dup
        //   170: iconst_0
        //   171: aload_0
        //   172: getfield 26	org/vidogram/messenger/d/f$7:b	J
        //   175: invokestatic 71	java/lang/Long:valueOf	(J)Ljava/lang/Long;
        //   178: aastore
        //   179: dup
        //   180: iconst_1
        //   181: aload_0
        //   182: getfield 32	org/vidogram/messenger/d/f$7:e	I
        //   185: invokestatic 76	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   188: aastore
        //   189: dup
        //   190: iconst_2
        //   191: aload_0
        //   192: getfield 28	org/vidogram/messenger/d/f$7:c	I
        //   195: invokestatic 76	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   198: aastore
        //   199: invokestatic 82	java/lang/String:format	(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   202: iconst_0
        //   203: anewarray 4	java/lang/Object
        //   206: invokevirtual 87	org/vidogram/SQLite/SQLiteDatabase:b	(Ljava/lang/String;[Ljava/lang/Object;)Lorg/vidogram/SQLite/SQLiteCursor;
        //   209: astore 15
        //   211: aload 15
        //   213: invokevirtual 92	org/vidogram/SQLite/SQLiteCursor:a	()Z
        //   216: ifeq +30 -> 246
        //   219: aload 15
        //   221: iconst_0
        //   222: invokevirtual 95	org/vidogram/SQLite/SQLiteCursor:b	(I)I
        //   225: i2l
        //   226: lstore 9
        //   228: lload 9
        //   230: lstore 5
        //   232: iload_1
        //   233: ifeq +13 -> 246
        //   236: lload 9
        //   238: iload_1
        //   239: i2l
        //   240: bipush 32
        //   242: lshl
        //   243: lor
        //   244: lstore 5
        //   246: aload 15
        //   248: invokevirtual 97	org/vidogram/SQLite/SQLiteCursor:b	()V
        //   251: lload 5
        //   253: lconst_1
        //   254: lcmp
        //   255: ifle +449 -> 704
        //   258: aload 11
        //   260: getstatic 63	java/util/Locale:US	Ljava/util/Locale;
        //   263: ldc 101
        //   265: iconst_5
        //   266: anewarray 4	java/lang/Object
        //   269: dup
        //   270: iconst_0
        //   271: aload_0
        //   272: getfield 26	org/vidogram/messenger/d/f$7:b	J
        //   275: invokestatic 71	java/lang/Long:valueOf	(J)Ljava/lang/Long;
        //   278: aastore
        //   279: dup
        //   280: iconst_1
        //   281: lload 7
        //   283: invokestatic 71	java/lang/Long:valueOf	(J)Ljava/lang/Long;
        //   286: aastore
        //   287: dup
        //   288: iconst_2
        //   289: lload 5
        //   291: invokestatic 71	java/lang/Long:valueOf	(J)Ljava/lang/Long;
        //   294: aastore
        //   295: dup
        //   296: iconst_3
        //   297: aload_0
        //   298: getfield 32	org/vidogram/messenger/d/f$7:e	I
        //   301: invokestatic 76	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   304: aastore
        //   305: dup
        //   306: iconst_4
        //   307: iload_2
        //   308: invokestatic 76	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   311: aastore
        //   312: invokestatic 82	java/lang/String:format	(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   315: iconst_0
        //   316: anewarray 4	java/lang/Object
        //   319: invokevirtual 87	org/vidogram/SQLite/SQLiteDatabase:b	(Ljava/lang/String;[Ljava/lang/Object;)Lorg/vidogram/SQLite/SQLiteCursor;
        //   322: astore 11
        //   324: aload 11
        //   326: invokevirtual 92	org/vidogram/SQLite/SQLiteCursor:a	()Z
        //   329: ifeq +834 -> 1163
        //   332: aload 11
        //   334: iconst_0
        //   335: invokevirtual 104	org/vidogram/SQLite/SQLiteCursor:g	(I)Lorg/vidogram/tgnet/NativeByteBuffer;
        //   338: astore 15
        //   340: aload 15
        //   342: ifnull -18 -> 324
        //   345: aload 15
        //   347: aload 15
        //   349: iconst_0
        //   350: invokevirtual 109	org/vidogram/tgnet/NativeByteBuffer:b	(Z)I
        //   353: iconst_0
        //   354: invokestatic 114	org/vidogram/tgnet/g$ar:a	(Lorg/vidogram/tgnet/a;IZ)Lorg/vidogram/tgnet/g$ar;
        //   357: astore 16
        //   359: aload 15
        //   361: invokevirtual 116	org/vidogram/tgnet/NativeByteBuffer:e	()V
        //   364: aload 16
        //   366: aload 11
        //   368: iconst_1
        //   369: invokevirtual 95	org/vidogram/SQLite/SQLiteCursor:b	(I)I
        //   372: putfield 118	org/vidogram/tgnet/g$ar:b	I
        //   375: aload 16
        //   377: aload_0
        //   378: getfield 26	org/vidogram/messenger/d/f$7:b	J
        //   381: putfield 121	org/vidogram/tgnet/g$ar:E	J
        //   384: aload_0
        //   385: getfield 26	org/vidogram/messenger/d/f$7:b	J
        //   388: l2i
        //   389: ifne +14 -> 403
        //   392: aload 16
        //   394: aload 11
        //   396: iconst_2
        //   397: invokevirtual 124	org/vidogram/SQLite/SQLiteCursor:d	(I)J
        //   400: putfield 127	org/vidogram/tgnet/g$ar:C	J
        //   403: aload 12
        //   405: getfield 130	org/vidogram/tgnet/g$qi:c	Ljava/util/ArrayList;
        //   408: aload 16
        //   410: invokevirtual 134	java/util/ArrayList:add	(Ljava/lang/Object;)Z
        //   413: pop
        //   414: aload 16
        //   416: getfield 135	org/vidogram/tgnet/g$ar:c	I
        //   419: ifle +709 -> 1128
        //   422: aload 13
        //   424: aload 16
        //   426: getfield 135	org/vidogram/tgnet/g$ar:c	I
        //   429: invokestatic 76	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   432: invokevirtual 138	java/util/ArrayList:contains	(Ljava/lang/Object;)Z
        //   435: ifne -111 -> 324
        //   438: aload 13
        //   440: aload 16
        //   442: getfield 135	org/vidogram/tgnet/g$ar:c	I
        //   445: invokestatic 76	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   448: invokevirtual 134	java/util/ArrayList:add	(Ljava/lang/Object;)Z
        //   451: pop
        //   452: goto -128 -> 324
        //   455: astore 11
        //   457: aload 12
        //   459: getfield 130	org/vidogram/tgnet/g$qi:c	Ljava/util/ArrayList;
        //   462: invokevirtual 141	java/util/ArrayList:clear	()V
        //   465: aload 12
        //   467: getfield 143	org/vidogram/tgnet/g$qi:d	Ljava/util/ArrayList;
        //   470: invokevirtual 141	java/util/ArrayList:clear	()V
        //   473: aload 12
        //   475: getfield 145	org/vidogram/tgnet/g$qi:e	Ljava/util/ArrayList;
        //   478: invokevirtual 141	java/util/ArrayList:clear	()V
        //   481: ldc 147
        //   483: aload 11
        //   485: invokestatic 152	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   488: aload 12
        //   490: aload_0
        //   491: getfield 26	org/vidogram/messenger/d/f$7:b	J
        //   494: aload_0
        //   495: getfield 34	org/vidogram/messenger/d/f$7:f	I
        //   498: aload_0
        //   499: getfield 24	org/vidogram/messenger/d/f$7:a	I
        //   502: aload_0
        //   503: getfield 28	org/vidogram/messenger/d/f$7:c	I
        //   506: aload_0
        //   507: getfield 32	org/vidogram/messenger/d/f$7:e	I
        //   510: iconst_1
        //   511: aload_0
        //   512: getfield 36	org/vidogram/messenger/d/f$7:g	I
        //   515: aload_0
        //   516: getfield 30	org/vidogram/messenger/d/f$7:d	Z
        //   519: iconst_0
        //   520: invokestatic 155	org/vidogram/messenger/d/f:a	(Lorg/vidogram/tgnet/g$we;JIIIIZIZZ)V
        //   523: return
        //   524: iconst_0
        //   525: istore 4
        //   527: goto -384 -> 143
        //   530: aload 15
        //   532: invokevirtual 97	org/vidogram/SQLite/SQLiteCursor:b	()V
        //   535: aload 11
        //   537: getstatic 63	java/util/Locale:US	Ljava/util/Locale;
        //   540: ldc 157
        //   542: iconst_2
        //   543: anewarray 4	java/lang/Object
        //   546: dup
        //   547: iconst_0
        //   548: aload_0
        //   549: getfield 26	org/vidogram/messenger/d/f$7:b	J
        //   552: invokestatic 71	java/lang/Long:valueOf	(J)Ljava/lang/Long;
        //   555: aastore
        //   556: dup
        //   557: iconst_1
        //   558: aload_0
        //   559: getfield 32	org/vidogram/messenger/d/f$7:e	I
        //   562: invokestatic 76	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   565: aastore
        //   566: invokestatic 82	java/lang/String:format	(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   569: iconst_0
        //   570: anewarray 4	java/lang/Object
        //   573: invokevirtual 87	org/vidogram/SQLite/SQLiteDatabase:b	(Ljava/lang/String;[Ljava/lang/Object;)Lorg/vidogram/SQLite/SQLiteCursor;
        //   576: astore 15
        //   578: aload 15
        //   580: invokevirtual 92	org/vidogram/SQLite/SQLiteCursor:a	()Z
        //   583: ifeq +73 -> 656
        //   586: aload 15
        //   588: iconst_0
        //   589: invokevirtual 95	org/vidogram/SQLite/SQLiteCursor:b	(I)I
        //   592: istore_3
        //   593: iload_3
        //   594: ifeq +62 -> 656
        //   597: aload 11
        //   599: ldc 159
        //   601: invokevirtual 162	org/vidogram/SQLite/SQLiteDatabase:a	(Ljava/lang/String;)Lorg/vidogram/SQLite/SQLitePreparedStatement;
        //   604: astore 16
        //   606: aload 16
        //   608: invokevirtual 166	org/vidogram/SQLite/SQLitePreparedStatement:d	()V
        //   611: aload 16
        //   613: iconst_1
        //   614: aload_0
        //   615: getfield 26	org/vidogram/messenger/d/f$7:b	J
        //   618: invokevirtual 169	org/vidogram/SQLite/SQLitePreparedStatement:a	(IJ)V
        //   621: aload 16
        //   623: iconst_2
        //   624: aload_0
        //   625: getfield 32	org/vidogram/messenger/d/f$7:e	I
        //   628: invokevirtual 172	org/vidogram/SQLite/SQLitePreparedStatement:a	(II)V
        //   631: aload 16
        //   633: iconst_3
        //   634: iconst_0
        //   635: invokevirtual 172	org/vidogram/SQLite/SQLitePreparedStatement:a	(II)V
        //   638: aload 16
        //   640: iconst_4
        //   641: iload_3
        //   642: invokevirtual 172	org/vidogram/SQLite/SQLitePreparedStatement:a	(II)V
        //   645: aload 16
        //   647: invokevirtual 175	org/vidogram/SQLite/SQLitePreparedStatement:b	()I
        //   650: pop
        //   651: aload 16
        //   653: invokevirtual 176	org/vidogram/SQLite/SQLitePreparedStatement:e	()V
        //   656: aload 15
        //   658: invokevirtual 97	org/vidogram/SQLite/SQLiteCursor:b	()V
        //   661: goto -513 -> 148
        //   664: astore 11
        //   666: aload 12
        //   668: aload_0
        //   669: getfield 26	org/vidogram/messenger/d/f$7:b	J
        //   672: aload_0
        //   673: getfield 34	org/vidogram/messenger/d/f$7:f	I
        //   676: aload_0
        //   677: getfield 24	org/vidogram/messenger/d/f$7:a	I
        //   680: aload_0
        //   681: getfield 28	org/vidogram/messenger/d/f$7:c	I
        //   684: aload_0
        //   685: getfield 32	org/vidogram/messenger/d/f$7:e	I
        //   688: iconst_1
        //   689: aload_0
        //   690: getfield 36	org/vidogram/messenger/d/f$7:g	I
        //   693: aload_0
        //   694: getfield 30	org/vidogram/messenger/d/f$7:d	Z
        //   697: iconst_0
        //   698: invokestatic 155	org/vidogram/messenger/d/f:a	(Lorg/vidogram/tgnet/g$we;JIIIIZIZZ)V
        //   701: aload 11
        //   703: athrow
        //   704: aload 11
        //   706: getstatic 63	java/util/Locale:US	Ljava/util/Locale;
        //   709: ldc 178
        //   711: iconst_4
        //   712: anewarray 4	java/lang/Object
        //   715: dup
        //   716: iconst_0
        //   717: aload_0
        //   718: getfield 26	org/vidogram/messenger/d/f$7:b	J
        //   721: invokestatic 71	java/lang/Long:valueOf	(J)Ljava/lang/Long;
        //   724: aastore
        //   725: dup
        //   726: iconst_1
        //   727: lload 7
        //   729: invokestatic 71	java/lang/Long:valueOf	(J)Ljava/lang/Long;
        //   732: aastore
        //   733: dup
        //   734: iconst_2
        //   735: aload_0
        //   736: getfield 32	org/vidogram/messenger/d/f$7:e	I
        //   739: invokestatic 76	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   742: aastore
        //   743: dup
        //   744: iconst_3
        //   745: iload_2
        //   746: invokestatic 76	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   749: aastore
        //   750: invokestatic 82	java/lang/String:format	(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   753: iconst_0
        //   754: anewarray 4	java/lang/Object
        //   757: invokevirtual 87	org/vidogram/SQLite/SQLiteDatabase:b	(Ljava/lang/String;[Ljava/lang/Object;)Lorg/vidogram/SQLite/SQLiteCursor;
        //   760: astore 11
        //   762: goto -438 -> 324
        //   765: lconst_0
        //   766: lstore 5
        //   768: aload 11
        //   770: getstatic 63	java/util/Locale:US	Ljava/util/Locale;
        //   773: ldc 180
        //   775: iconst_2
        //   776: anewarray 4	java/lang/Object
        //   779: dup
        //   780: iconst_0
        //   781: aload_0
        //   782: getfield 26	org/vidogram/messenger/d/f$7:b	J
        //   785: invokestatic 71	java/lang/Long:valueOf	(J)Ljava/lang/Long;
        //   788: aastore
        //   789: dup
        //   790: iconst_1
        //   791: aload_0
        //   792: getfield 32	org/vidogram/messenger/d/f$7:e	I
        //   795: invokestatic 76	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   798: aastore
        //   799: invokestatic 82	java/lang/String:format	(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   802: iconst_0
        //   803: anewarray 4	java/lang/Object
        //   806: invokevirtual 87	org/vidogram/SQLite/SQLiteDatabase:b	(Ljava/lang/String;[Ljava/lang/Object;)Lorg/vidogram/SQLite/SQLiteCursor;
        //   809: astore 15
        //   811: aload 15
        //   813: invokevirtual 92	org/vidogram/SQLite/SQLiteCursor:a	()Z
        //   816: ifeq +30 -> 846
        //   819: aload 15
        //   821: iconst_0
        //   822: invokevirtual 95	org/vidogram/SQLite/SQLiteCursor:b	(I)I
        //   825: i2l
        //   826: lstore 7
        //   828: lload 7
        //   830: lstore 5
        //   832: iload_1
        //   833: ifeq +13 -> 846
        //   836: lload 7
        //   838: iload_1
        //   839: i2l
        //   840: bipush 32
        //   842: lshl
        //   843: lor
        //   844: lstore 5
        //   846: aload 15
        //   848: invokevirtual 97	org/vidogram/SQLite/SQLiteCursor:b	()V
        //   851: lload 5
        //   853: lconst_1
        //   854: lcmp
        //   855: ifle +74 -> 929
        //   858: aload 11
        //   860: getstatic 63	java/util/Locale:US	Ljava/util/Locale;
        //   863: ldc 182
        //   865: iconst_5
        //   866: anewarray 4	java/lang/Object
        //   869: dup
        //   870: iconst_0
        //   871: aload_0
        //   872: getfield 26	org/vidogram/messenger/d/f$7:b	J
        //   875: invokestatic 71	java/lang/Long:valueOf	(J)Ljava/lang/Long;
        //   878: aastore
        //   879: dup
        //   880: iconst_1
        //   881: lload 5
        //   883: invokestatic 71	java/lang/Long:valueOf	(J)Ljava/lang/Long;
        //   886: aastore
        //   887: dup
        //   888: iconst_2
        //   889: aload_0
        //   890: getfield 32	org/vidogram/messenger/d/f$7:e	I
        //   893: invokestatic 76	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   896: aastore
        //   897: dup
        //   898: iconst_3
        //   899: aload_0
        //   900: getfield 34	org/vidogram/messenger/d/f$7:f	I
        //   903: invokestatic 76	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   906: aastore
        //   907: dup
        //   908: iconst_4
        //   909: iload_2
        //   910: invokestatic 76	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   913: aastore
        //   914: invokestatic 82	java/lang/String:format	(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   917: iconst_0
        //   918: anewarray 4	java/lang/Object
        //   921: invokevirtual 87	org/vidogram/SQLite/SQLiteDatabase:b	(Ljava/lang/String;[Ljava/lang/Object;)Lorg/vidogram/SQLite/SQLiteCursor;
        //   924: astore 11
        //   926: goto -602 -> 324
        //   929: aload 11
        //   931: getstatic 63	java/util/Locale:US	Ljava/util/Locale;
        //   934: ldc 184
        //   936: iconst_4
        //   937: anewarray 4	java/lang/Object
        //   940: dup
        //   941: iconst_0
        //   942: aload_0
        //   943: getfield 26	org/vidogram/messenger/d/f$7:b	J
        //   946: invokestatic 71	java/lang/Long:valueOf	(J)Ljava/lang/Long;
        //   949: aastore
        //   950: dup
        //   951: iconst_1
        //   952: aload_0
        //   953: getfield 32	org/vidogram/messenger/d/f$7:e	I
        //   956: invokestatic 76	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   959: aastore
        //   960: dup
        //   961: iconst_2
        //   962: aload_0
        //   963: getfield 34	org/vidogram/messenger/d/f$7:f	I
        //   966: invokestatic 76	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   969: aastore
        //   970: dup
        //   971: iconst_3
        //   972: iload_2
        //   973: invokestatic 76	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   976: aastore
        //   977: invokestatic 82	java/lang/String:format	(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   980: iconst_0
        //   981: anewarray 4	java/lang/Object
        //   984: invokevirtual 87	org/vidogram/SQLite/SQLiteDatabase:b	(Ljava/lang/String;[Ljava/lang/Object;)Lorg/vidogram/SQLite/SQLiteCursor;
        //   987: astore 11
        //   989: goto -665 -> 324
        //   992: iconst_1
        //   993: istore 4
        //   995: aload_0
        //   996: getfield 28	org/vidogram/messenger/d/f$7:c	I
        //   999: ifeq +66 -> 1065
        //   1002: aload 11
        //   1004: getstatic 63	java/util/Locale:US	Ljava/util/Locale;
        //   1007: ldc 186
        //   1009: iconst_4
        //   1010: anewarray 4	java/lang/Object
        //   1013: dup
        //   1014: iconst_0
        //   1015: aload_0
        //   1016: getfield 26	org/vidogram/messenger/d/f$7:b	J
        //   1019: invokestatic 71	java/lang/Long:valueOf	(J)Ljava/lang/Long;
        //   1022: aastore
        //   1023: dup
        //   1024: iconst_1
        //   1025: aload_0
        //   1026: getfield 28	org/vidogram/messenger/d/f$7:c	I
        //   1029: invokestatic 76	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   1032: aastore
        //   1033: dup
        //   1034: iconst_2
        //   1035: aload_0
        //   1036: getfield 32	org/vidogram/messenger/d/f$7:e	I
        //   1039: invokestatic 76	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   1042: aastore
        //   1043: dup
        //   1044: iconst_3
        //   1045: iload_2
        //   1046: invokestatic 76	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   1049: aastore
        //   1050: invokestatic 82	java/lang/String:format	(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   1053: iconst_0
        //   1054: anewarray 4	java/lang/Object
        //   1057: invokevirtual 87	org/vidogram/SQLite/SQLiteDatabase:b	(Ljava/lang/String;[Ljava/lang/Object;)Lorg/vidogram/SQLite/SQLiteCursor;
        //   1060: astore 11
        //   1062: goto -738 -> 324
        //   1065: aload 11
        //   1067: getstatic 63	java/util/Locale:US	Ljava/util/Locale;
        //   1070: ldc 188
        //   1072: iconst_4
        //   1073: anewarray 4	java/lang/Object
        //   1076: dup
        //   1077: iconst_0
        //   1078: aload_0
        //   1079: getfield 26	org/vidogram/messenger/d/f$7:b	J
        //   1082: invokestatic 71	java/lang/Long:valueOf	(J)Ljava/lang/Long;
        //   1085: aastore
        //   1086: dup
        //   1087: iconst_1
        //   1088: aload_0
        //   1089: getfield 32	org/vidogram/messenger/d/f$7:e	I
        //   1092: invokestatic 76	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   1095: aastore
        //   1096: dup
        //   1097: iconst_2
        //   1098: aload_0
        //   1099: getfield 34	org/vidogram/messenger/d/f$7:f	I
        //   1102: invokestatic 76	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   1105: aastore
        //   1106: dup
        //   1107: iconst_3
        //   1108: iload_2
        //   1109: invokestatic 76	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   1112: aastore
        //   1113: invokestatic 82	java/lang/String:format	(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   1116: iconst_0
        //   1117: anewarray 4	java/lang/Object
        //   1120: invokevirtual 87	org/vidogram/SQLite/SQLiteDatabase:b	(Ljava/lang/String;[Ljava/lang/Object;)Lorg/vidogram/SQLite/SQLiteCursor;
        //   1123: astore 11
        //   1125: goto -801 -> 324
        //   1128: aload 14
        //   1130: aload 16
        //   1132: getfield 135	org/vidogram/tgnet/g$ar:c	I
        //   1135: ineg
        //   1136: invokestatic 76	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   1139: invokevirtual 138	java/util/ArrayList:contains	(Ljava/lang/Object;)Z
        //   1142: ifne -818 -> 324
        //   1145: aload 14
        //   1147: aload 16
        //   1149: getfield 135	org/vidogram/tgnet/g$ar:c	I
        //   1152: ineg
        //   1153: invokestatic 76	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   1156: invokevirtual 134	java/util/ArrayList:add	(Ljava/lang/Object;)Z
        //   1159: pop
        //   1160: goto -836 -> 324
        //   1163: aload 11
        //   1165: invokevirtual 97	org/vidogram/SQLite/SQLiteCursor:b	()V
        //   1168: aload 13
        //   1170: invokevirtual 191	java/util/ArrayList:isEmpty	()Z
        //   1173: ifne +21 -> 1194
        //   1176: invokestatic 54	org/vidogram/messenger/w:a	()Lorg/vidogram/messenger/w;
        //   1179: ldc 193
        //   1181: aload 13
        //   1183: invokestatic 199	android/text/TextUtils:join	(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;
        //   1186: aload 12
        //   1188: getfield 145	org/vidogram/tgnet/g$qi:e	Ljava/util/ArrayList;
        //   1191: invokevirtual 202	org/vidogram/messenger/w:a	(Ljava/lang/String;Ljava/util/ArrayList;)V
        //   1194: aload 14
        //   1196: invokevirtual 191	java/util/ArrayList:isEmpty	()Z
        //   1199: ifne +21 -> 1220
        //   1202: invokestatic 54	org/vidogram/messenger/w:a	()Lorg/vidogram/messenger/w;
        //   1205: ldc 193
        //   1207: aload 14
        //   1209: invokestatic 199	android/text/TextUtils:join	(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;
        //   1212: aload 12
        //   1214: getfield 143	org/vidogram/tgnet/g$qi:d	Ljava/util/ArrayList;
        //   1217: invokevirtual 204	org/vidogram/messenger/w:b	(Ljava/lang/String;Ljava/util/ArrayList;)V
        //   1220: aload 12
        //   1222: getfield 130	org/vidogram/tgnet/g$qi:c	Ljava/util/ArrayList;
        //   1225: invokevirtual 207	java/util/ArrayList:size	()I
        //   1228: istore_1
        //   1229: aload_0
        //   1230: getfield 24	org/vidogram/messenger/d/f$7:a	I
        //   1233: istore_2
        //   1234: iload_1
        //   1235: iload_2
        //   1236: if_icmple +25 -> 1261
        //   1239: iconst_0
        //   1240: istore 4
        //   1242: aload 12
        //   1244: getfield 130	org/vidogram/tgnet/g$qi:c	Ljava/util/ArrayList;
        //   1247: aload 12
        //   1249: getfield 130	org/vidogram/tgnet/g$qi:c	Ljava/util/ArrayList;
        //   1252: invokevirtual 207	java/util/ArrayList:size	()I
        //   1255: iconst_1
        //   1256: isub
        //   1257: invokevirtual 211	java/util/ArrayList:remove	(I)Ljava/lang/Object;
        //   1260: pop
        //   1261: aload 12
        //   1263: aload_0
        //   1264: getfield 26	org/vidogram/messenger/d/f$7:b	J
        //   1267: aload_0
        //   1268: getfield 34	org/vidogram/messenger/d/f$7:f	I
        //   1271: aload_0
        //   1272: getfield 24	org/vidogram/messenger/d/f$7:a	I
        //   1275: aload_0
        //   1276: getfield 28	org/vidogram/messenger/d/f$7:c	I
        //   1279: aload_0
        //   1280: getfield 32	org/vidogram/messenger/d/f$7:e	I
        //   1283: iconst_1
        //   1284: aload_0
        //   1285: getfield 36	org/vidogram/messenger/d/f$7:g	I
        //   1288: aload_0
        //   1289: getfield 30	org/vidogram/messenger/d/f$7:d	Z
        //   1292: iload 4
        //   1294: invokestatic 155	org/vidogram/messenger/d/f:a	(Lorg/vidogram/tgnet/g$we;JIIIIZIZZ)V
        //   1297: return
        //   1298: astore 11
        //   1300: goto -634 -> 666
        //   1303: astore 11
        //   1305: goto -848 -> 457
        //   1308: goto -1229 -> 79
        //   1311: lload 7
        //   1313: lconst_0
        //   1314: lcmp
        //   1315: ifeq -7 -> 1308
        //   1318: iload_1
        //   1319: ifeq -11 -> 1308
        //   1322: lload 7
        //   1324: iload_1
        //   1325: i2l
        //   1326: bipush 32
        //   1328: lshl
        //   1329: lor
        //   1330: lstore 7
        //   1332: goto -1253 -> 79
        //
        // Exception table:
        //   from	to	target	type
        //   9	42	455	java/lang/Exception
        //   45	53	455	java/lang/Exception
        //   55	62	455	java/lang/Exception
        //   62	76	455	java/lang/Exception
        //   79	140	455	java/lang/Exception
        //   143	148	455	java/lang/Exception
        //   158	211	455	java/lang/Exception
        //   211	228	455	java/lang/Exception
        //   246	251	455	java/lang/Exception
        //   258	324	455	java/lang/Exception
        //   324	340	455	java/lang/Exception
        //   345	403	455	java/lang/Exception
        //   403	452	455	java/lang/Exception
        //   530	593	455	java/lang/Exception
        //   597	656	455	java/lang/Exception
        //   656	661	455	java/lang/Exception
        //   704	762	455	java/lang/Exception
        //   768	811	455	java/lang/Exception
        //   811	828	455	java/lang/Exception
        //   846	851	455	java/lang/Exception
        //   858	926	455	java/lang/Exception
        //   929	989	455	java/lang/Exception
        //   995	1062	455	java/lang/Exception
        //   1065	1125	455	java/lang/Exception
        //   1128	1160	455	java/lang/Exception
        //   1163	1194	455	java/lang/Exception
        //   1194	1220	455	java/lang/Exception
        //   1220	1234	455	java/lang/Exception
        //   9	42	664	finally
        //   45	53	664	finally
        //   55	62	664	finally
        //   62	76	664	finally
        //   79	140	664	finally
        //   143	148	664	finally
        //   158	211	664	finally
        //   211	228	664	finally
        //   246	251	664	finally
        //   258	324	664	finally
        //   324	340	664	finally
        //   345	403	664	finally
        //   403	452	664	finally
        //   530	593	664	finally
        //   597	656	664	finally
        //   656	661	664	finally
        //   704	762	664	finally
        //   768	811	664	finally
        //   811	828	664	finally
        //   846	851	664	finally
        //   858	926	664	finally
        //   929	989	664	finally
        //   995	1062	664	finally
        //   1065	1125	664	finally
        //   1128	1160	664	finally
        //   1163	1194	664	finally
        //   1194	1220	664	finally
        //   1220	1234	664	finally
        //   457	488	1298	finally
        //   1242	1261	1298	finally
        //   1242	1261	1303	java/lang/Exception
      }
    });
  }

  public static void a(long paramLong, int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean, int paramInt5)
  {
    if (((int)paramLong < 0) && (e.a(-(int)paramLong)));
    int i;
    for (boolean bool = true; ; bool = false)
    {
      i = (int)paramLong;
      if ((!paramBoolean) && (i != 0))
        break;
      a(paramLong, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, bool);
      return;
    }
    g.qt localqt = new g.qt();
    localqt.i = paramInt1;
    localqt.k = (paramInt2 + 1);
    localqt.j = paramInt3;
    if (paramInt4 == 0)
      localqt.f = new g.ks();
    while (true)
    {
      localqt.e = "";
      localqt.d = v.c(i);
      if (localqt.d == null)
        break;
      paramInt1 = ConnectionsManager.a().a(localqt, new c(paramInt2, paramLong, paramInt1, paramInt3, paramInt4, paramInt5, bool)
      {
      });
      ConnectionsManager.a().a(paramInt1, paramInt5);
      return;
      if (paramInt4 == 1)
      {
        localqt.f = new g.kp();
        continue;
      }
      if (paramInt4 == 2)
      {
        localqt.f = new g.ku();
        continue;
      }
      if (paramInt4 == 3)
      {
        localqt.f = new g.kt();
        continue;
      }
      if (paramInt4 != 4)
        continue;
      localqt.f = new g.kr();
    }
  }

  public static void a(long paramLong, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    int i = (int)paramLong;
    if ((paramBoolean) || (i == 0))
    {
      c(paramLong, paramInt1, paramInt2);
      return;
    }
    g.qt localqt = new g.qt();
    localqt.i = 0;
    localqt.k = 1;
    localqt.j = 0;
    if (paramInt1 == 0)
      localqt.f = new g.ks();
    while (true)
    {
      localqt.e = "";
      localqt.d = v.c(i);
      if (localqt.d == null)
        break;
      paramInt1 = ConnectionsManager.a().a(localqt, new c(paramLong, paramInt1, paramInt2)
      {
      });
      ConnectionsManager.a().a(paramInt1, paramInt2);
      return;
      if (paramInt1 == 1)
      {
        localqt.f = new g.kp();
        continue;
      }
      if (paramInt1 == 2)
      {
        localqt.f = new g.ku();
        continue;
      }
      if (paramInt1 == 3)
      {
        localqt.f = new g.kt();
        continue;
      }
      if (paramInt1 != 4)
        continue;
      localqt.f = new g.kr();
    }
  }

  private static void a(long paramLong, int paramInt1, ArrayList<g.ar> paramArrayList, int paramInt2, boolean paramBoolean)
  {
    w.a().c().b(new Runnable(paramArrayList, paramBoolean, paramLong, paramInt2, paramInt1)
    {
      public void run()
      {
        int i = 1;
        try
        {
          if ((this.a.isEmpty()) || (this.b))
          {
            w.a().a(this.c, this.d, this.e);
            if (this.a.isEmpty())
              return;
          }
          w.a().b().d();
          SQLitePreparedStatement localSQLitePreparedStatement = w.a().b().a("REPLACE INTO media_v2 VALUES(?, ?, ?, ?, ?)");
          Iterator localIterator = this.a.iterator();
          while (localIterator.hasNext())
          {
            g.ar localar = (g.ar)localIterator.next();
            if (!f.b(localar))
              continue;
            long l2 = localar.b;
            long l1 = l2;
            if (localar.d.b != 0)
              l1 = l2 | localar.d.b << 32;
            localSQLitePreparedStatement.d();
            NativeByteBuffer localNativeByteBuffer = new NativeByteBuffer(localar.b());
            localar.a(localNativeByteBuffer);
            localSQLitePreparedStatement.a(1, l1);
            localSQLitePreparedStatement.a(2, this.c);
            localSQLitePreparedStatement.a(3, localar.e);
            localSQLitePreparedStatement.a(4, this.e);
            localSQLitePreparedStatement.a(5, localNativeByteBuffer);
            localSQLitePreparedStatement.b();
            localNativeByteBuffer.e();
          }
        }
        catch (Exception localException)
        {
          n.a("tmessages", localException);
          return;
        }
        localException.e();
        if ((!this.b) || (this.d != 0))
        {
          if (!this.b)
            break label305;
          if (this.d == 0)
            break label331;
          w.a().a(this.c, i, this.d, this.e);
        }
        while (true)
        {
          w.a().b().e();
          return;
          label305: i = ((g.ar)this.a.get(this.a.size() - 1)).b;
          break;
          label331: w.a().a(this.c, i, 2147483647, this.e);
        }
      }
    });
  }

  private static void b(int paramInt1, long paramLong, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    a.a(new Runnable(paramLong, paramBoolean, paramInt1, paramInt2, paramInt3)
    {
      public void run()
      {
        int i = 0;
        int j = (int)this.a;
        if ((this.b) && (this.c == -1) && (j != 0))
        {
          f.a(this.a, this.d, this.e, false);
          return;
        }
        if (!this.b)
          f.a(this.a, this.d, this.c);
        y localy = y.a();
        j = y.q;
        long l = this.a;
        if ((this.b) && (this.c == -1));
        while (true)
        {
          localy.a(j, new Object[] { Long.valueOf(l), Integer.valueOf(i), Boolean.valueOf(this.b), Integer.valueOf(this.d) });
          return;
          i = this.c;
        }
      }
    });
  }

  private static void b(long paramLong, int paramInt1, int paramInt2)
  {
    w.a().c().b(new Runnable(paramLong, paramInt1, paramInt2)
    {
      public void run()
      {
        try
        {
          SQLitePreparedStatement localSQLitePreparedStatement = w.a().b().a("REPLACE INTO media_counts_v2 VALUES(?, ?, ?)");
          localSQLitePreparedStatement.d();
          localSQLitePreparedStatement.a(1, this.a);
          localSQLitePreparedStatement.a(2, this.b);
          localSQLitePreparedStatement.a(3, this.c);
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
  }

  private static void b(g.we paramwe, long paramLong, int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean1, int paramInt5, boolean paramBoolean2, boolean paramBoolean3)
  {
    int i = (int)paramLong;
    if ((paramBoolean1) && (paramwe.c.isEmpty()) && (i != 0))
    {
      a(paramLong, paramInt1, paramInt2, paramInt3, paramInt4, false, paramInt5);
      return;
    }
    if (!paramBoolean1)
    {
      p.a(paramwe.c);
      w.a().a(paramwe.e, paramwe.d, true, true);
      a(paramLong, paramInt4, paramwe.c, paramInt3, paramBoolean3);
    }
    HashMap localHashMap = new HashMap();
    paramInt1 = 0;
    while (paramInt1 < paramwe.e.size())
    {
      localObject = (g.vw)paramwe.e.get(paramInt1);
      localHashMap.put(Integer.valueOf(((g.vw)localObject).d), localObject);
      paramInt1 += 1;
    }
    Object localObject = new ArrayList();
    paramInt1 = 0;
    while (paramInt1 < paramwe.c.size())
    {
      ((ArrayList)localObject).add(new u((g.ar)paramwe.c.get(paramInt1), localHashMap, true));
      paramInt1 += 1;
    }
    a.a(new Runnable(paramwe, paramBoolean1, paramLong, (ArrayList)localObject, paramInt5, paramInt4, paramBoolean3)
    {
      public void run()
      {
        int i = this.a.h;
        v.a().a(this.a.e, this.b);
        v.a().b(this.a.d, this.b);
        y.a().a(y.p, new Object[] { Long.valueOf(this.c), Integer.valueOf(i), this.d, Integer.valueOf(this.e), Integer.valueOf(this.f), Boolean.valueOf(this.g) });
      }
    });
  }

  public static boolean b(g.ar paramar)
  {
    if (((paramar instanceof g.ov)) && ((paramar.j instanceof g.ob)) && (paramar.F != 0) && (paramar.F <= 60));
    while (true)
    {
      return false;
      if (((paramar.j instanceof g.ob)) || (((paramar.j instanceof g.nw)) && (!u.a(paramar.j.k))))
        return true;
      if (paramar.p.isEmpty())
        continue;
      int i = 0;
      while (i < paramar.p.size())
      {
        g.at localat = (g.at)paramar.p.get(i);
        if (((localat instanceof g.nq)) || ((localat instanceof g.no)) || ((localat instanceof g.ni)))
          return true;
        i += 1;
      }
    }
  }

  private static void c(long paramLong, int paramInt1, int paramInt2)
  {
    w.a().c().b(new Runnable(paramLong, paramInt1, paramInt2)
    {
      public void run()
      {
        while (true)
        {
          try
          {
            SQLiteCursor localSQLiteCursor = w.a().b().b(String.format(Locale.US, "SELECT count FROM media_counts_v2 WHERE uid = %d AND type = %d LIMIT 1", new Object[] { Long.valueOf(this.a), Integer.valueOf(this.b) }), new Object[0]);
            if (localSQLiteCursor.a())
            {
              i = localSQLiteCursor.b(0);
              localSQLiteCursor.b();
              int k = (int)this.a;
              int j = i;
              if (i != -1)
                continue;
              j = i;
              if (k != 0)
                continue;
              localSQLiteCursor = w.a().b().b(String.format(Locale.US, "SELECT COUNT(mid) FROM media_v2 WHERE uid = %d AND type = %d LIMIT 1", new Object[] { Long.valueOf(this.a), Integer.valueOf(this.b) }), new Object[0]);
              if (!localSQLiteCursor.a())
                continue;
              i = localSQLiteCursor.b(0);
              localSQLiteCursor.b();
              j = i;
              if (i == -1)
                continue;
              f.a(this.a, this.b, i);
              j = i;
              f.a(j, this.a, this.b, this.c, true);
              return;
            }
          }
          catch (Exception localException)
          {
            n.a("tmessages", localException);
            return;
          }
          int i = -1;
        }
      }
    });
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.d.f
 * JD-Core Version:    0.6.0
 */