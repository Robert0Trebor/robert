package org.vidogram.messenger.g.a;

import java.io.InputStream;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.StatusLine;
import org.apache.http.impl.cookie.DateUtils;
import org.vidogram.messenger.g.b.a;
import org.vidogram.messenger.g.l;
import org.vidogram.messenger.g.p;
import org.vidogram.messenger.g.q;
import org.vidogram.messenger.g.s;
import org.vidogram.messenger.g.t;

public class a
  implements org.vidogram.messenger.g.f
{
  protected static final boolean a = t.b;
  private static int d = 3000;
  private static int e = 4096;
  protected final f b;
  protected final b c;

  public a(f paramf)
  {
    this(paramf, new b(e));
  }

  public a(f paramf, b paramb)
  {
    this.b = paramf;
    this.c = paramb;
  }

  protected static Map<String, String> a(Header[] paramArrayOfHeader)
  {
    TreeMap localTreeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
    int i = 0;
    while (i < paramArrayOfHeader.length)
    {
      localTreeMap.put(paramArrayOfHeader[i].getName(), paramArrayOfHeader[i].getValue());
      i += 1;
    }
    return localTreeMap;
  }

  private void a(long paramLong, l<?> paraml, byte[] paramArrayOfByte, StatusLine paramStatusLine)
  {
    if ((a) || (paramLong > d))
      if (paramArrayOfByte == null)
        break label82;
    label82: for (paramArrayOfByte = Integer.valueOf(paramArrayOfByte.length); ; paramArrayOfByte = "null")
    {
      t.b("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", new Object[] { paraml, Long.valueOf(paramLong), paramArrayOfByte, Integer.valueOf(paramStatusLine.getStatusCode()), Integer.valueOf(paraml.u().b()) });
      return;
    }
  }

  private static void a(String paramString, l<?> paraml, s params)
  {
    p localp = paraml.u();
    int i = paraml.t();
    try
    {
      localp.a(params);
      paraml.a(String.format("%s-retry [timeout=%s]", new Object[] { paramString, Integer.valueOf(i) }));
      return;
    }
    catch (s params)
    {
      paraml.a(String.format("%s-timeout-giveup [timeout=%s]", new Object[] { paramString, Integer.valueOf(i) }));
    }
    throw params;
  }

  private void a(Map<String, String> paramMap, b.a parama)
  {
    if (parama == null);
    do
    {
      return;
      if (parama.b == null)
        continue;
      paramMap.put("If-None-Match", parama.b);
    }
    while (parama.d <= 0L);
    paramMap.put("If-Modified-Since", DateUtils.formatDate(new Date(parama.d)));
  }

  private byte[] a(HttpEntity paramHttpEntity)
  {
    j localj = new j(this.c, (int)paramHttpEntity.getContentLength());
    Object localObject2 = null;
    Object localObject1 = localObject2;
    Object localObject4;
    try
    {
      localObject4 = paramHttpEntity.getContent();
      if (localObject4 == null)
      {
        localObject1 = localObject2;
        throw new q();
      }
    }
    finally
    {
    }
    try
    {
      paramHttpEntity.consumeContent();
      this.c.a(localObject1);
      localj.close();
      throw localObject3;
      localObject1 = localObject3;
      byte[] arrayOfByte = this.c.a(1024);
      while (true)
      {
        localObject1 = arrayOfByte;
        int i = ((InputStream)localObject4).read(arrayOfByte);
        if (i == -1)
          break;
        localObject1 = arrayOfByte;
        localj.write(arrayOfByte, 0, i);
      }
      localObject1 = arrayOfByte;
      localObject4 = localj.toByteArray();
      try
      {
        paramHttpEntity.consumeContent();
        this.c.a(arrayOfByte);
        localj.close();
        return localObject4;
      }
      catch (java.io.IOException paramHttpEntity)
      {
        while (true)
          t.a("Error occured when calling consumingContent", new Object[0]);
      }
    }
    catch (java.io.IOException paramHttpEntity)
    {
      while (true)
        t.a("Error occured when calling consumingContent", new Object[0]);
    }
  }

  // ERROR //
  public org.vidogram.messenger.g.i a(l<?> paraml)
  {
    // Byte code:
    //   0: invokestatic 218	android/os/SystemClock:elapsedRealtime	()J
    //   3: lstore_3
    //   4: aconst_null
    //   5: astore 9
    //   7: invokestatic 224	java/util/Collections:emptyMap	()Ljava/util/Map;
    //   10: astore 7
    //   12: new 226	java/util/HashMap
    //   15: dup
    //   16: invokespecial 227	java/util/HashMap:<init>	()V
    //   19: astore 5
    //   21: aload_0
    //   22: aload 5
    //   24: aload_1
    //   25: invokevirtual 231	org/vidogram/messenger/g/l:f	()Lorg/vidogram/messenger/g/b$a;
    //   28: invokespecial 233	org/vidogram/messenger/g/a/a:a	(Ljava/util/Map;Lorg/vidogram/messenger/g/b$a;)V
    //   31: aload_0
    //   32: getfield 42	org/vidogram/messenger/g/a/a:b	Lorg/vidogram/messenger/g/a/f;
    //   35: aload_1
    //   36: aload 5
    //   38: invokeinterface 238 3 0
    //   43: astore 6
    //   45: aload 7
    //   47: astore 5
    //   49: aload 6
    //   51: invokeinterface 244 1 0
    //   56: astore 8
    //   58: aload 7
    //   60: astore 5
    //   62: aload 8
    //   64: invokeinterface 93 1 0
    //   69: istore_2
    //   70: aload 7
    //   72: astore 5
    //   74: aload 6
    //   76: invokeinterface 248 1 0
    //   81: invokestatic 250	org/vidogram/messenger/g/a/a:a	([Lorg/apache/http/Header;)Ljava/util/Map;
    //   84: astore 9
    //   86: iload_2
    //   87: sipush 304
    //   90: if_icmpne +89 -> 179
    //   93: aload 9
    //   95: astore 5
    //   97: aload_1
    //   98: invokevirtual 231	org/vidogram/messenger/g/l:f	()Lorg/vidogram/messenger/g/b$a;
    //   101: astore 7
    //   103: aload 7
    //   105: ifnonnull +27 -> 132
    //   108: aload 9
    //   110: astore 5
    //   112: new 252	org/vidogram/messenger/g/i
    //   115: dup
    //   116: sipush 304
    //   119: aconst_null
    //   120: aload 9
    //   122: iconst_1
    //   123: invokestatic 218	android/os/SystemClock:elapsedRealtime	()J
    //   126: lload_3
    //   127: lsub
    //   128: invokespecial 255	org/vidogram/messenger/g/i:<init>	(I[BLjava/util/Map;ZJ)V
    //   131: areturn
    //   132: aload 9
    //   134: astore 5
    //   136: aload 7
    //   138: getfield 259	org/vidogram/messenger/g/b$a:g	Ljava/util/Map;
    //   141: aload 9
    //   143: invokeinterface 263 2 0
    //   148: aload 9
    //   150: astore 5
    //   152: new 252	org/vidogram/messenger/g/i
    //   155: dup
    //   156: sipush 304
    //   159: aload 7
    //   161: getfield 266	org/vidogram/messenger/g/b$a:a	[B
    //   164: aload 7
    //   166: getfield 259	org/vidogram/messenger/g/b$a:g	Ljava/util/Map;
    //   169: iconst_1
    //   170: invokestatic 218	android/os/SystemClock:elapsedRealtime	()J
    //   173: lload_3
    //   174: lsub
    //   175: invokespecial 255	org/vidogram/messenger/g/i:<init>	(I[BLjava/util/Map;ZJ)V
    //   178: areturn
    //   179: aload 9
    //   181: astore 5
    //   183: aload 6
    //   185: invokeinterface 270 1 0
    //   190: ifnull +79 -> 269
    //   193: aload 9
    //   195: astore 5
    //   197: aload_0
    //   198: aload 6
    //   200: invokeinterface 270 1 0
    //   205: invokespecial 272	org/vidogram/messenger/g/a/a:a	(Lorg/apache/http/HttpEntity;)[B
    //   208: astore 7
    //   210: aload 7
    //   212: astore 5
    //   214: aload_0
    //   215: invokestatic 218	android/os/SystemClock:elapsedRealtime	()J
    //   218: lload_3
    //   219: lsub
    //   220: aload_1
    //   221: aload 5
    //   223: aload 8
    //   225: invokespecial 274	org/vidogram/messenger/g/a/a:a	(JLorg/vidogram/messenger/g/l;[BLorg/apache/http/StatusLine;)V
    //   228: iload_2
    //   229: sipush 200
    //   232: if_icmplt +10 -> 242
    //   235: iload_2
    //   236: sipush 299
    //   239: if_icmple +46 -> 285
    //   242: new 158	java/io/IOException
    //   245: dup
    //   246: invokespecial 275	java/io/IOException:<init>	()V
    //   249: athrow
    //   250: astore 5
    //   252: ldc_w 277
    //   255: aload_1
    //   256: new 279	org/vidogram/messenger/g/r
    //   259: dup
    //   260: invokespecial 280	org/vidogram/messenger/g/r:<init>	()V
    //   263: invokestatic 282	org/vidogram/messenger/g/a/a:a	(Ljava/lang/String;Lorg/vidogram/messenger/g/l;Lorg/vidogram/messenger/g/s;)V
    //   266: goto -262 -> 4
    //   269: aload 9
    //   271: astore 5
    //   273: iconst_0
    //   274: newarray byte
    //   276: astore 7
    //   278: aload 7
    //   280: astore 5
    //   282: goto -68 -> 214
    //   285: new 252	org/vidogram/messenger/g/i
    //   288: dup
    //   289: iload_2
    //   290: aload 5
    //   292: aload 9
    //   294: iconst_0
    //   295: invokestatic 218	android/os/SystemClock:elapsedRealtime	()J
    //   298: lload_3
    //   299: lsub
    //   300: invokespecial 255	org/vidogram/messenger/g/i:<init>	(I[BLjava/util/Map;ZJ)V
    //   303: astore 7
    //   305: aload 7
    //   307: areturn
    //   308: astore 5
    //   310: ldc_w 284
    //   313: aload_1
    //   314: new 279	org/vidogram/messenger/g/r
    //   317: dup
    //   318: invokespecial 280	org/vidogram/messenger/g/r:<init>	()V
    //   321: invokestatic 282	org/vidogram/messenger/g/a/a:a	(Ljava/lang/String;Lorg/vidogram/messenger/g/l;Lorg/vidogram/messenger/g/s;)V
    //   324: goto -320 -> 4
    //   327: astore 5
    //   329: new 286	java/lang/RuntimeException
    //   332: dup
    //   333: new 288	java/lang/StringBuilder
    //   336: dup
    //   337: invokespecial 289	java/lang/StringBuilder:<init>	()V
    //   340: ldc_w 291
    //   343: invokevirtual 295	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   346: aload_1
    //   347: invokevirtual 297	org/vidogram/messenger/g/l:d	()Ljava/lang/String;
    //   350: invokevirtual 295	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   353: invokevirtual 300	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   356: aload 5
    //   358: invokespecial 303	java/lang/RuntimeException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   361: athrow
    //   362: astore 6
    //   364: aconst_null
    //   365: astore 8
    //   367: aload 7
    //   369: astore 5
    //   371: aload 9
    //   373: astore 7
    //   375: aload 7
    //   377: ifnull +98 -> 475
    //   380: aload 7
    //   382: invokeinterface 244 1 0
    //   387: invokeinterface 93 1 0
    //   392: istore_2
    //   393: ldc_w 305
    //   396: iconst_2
    //   397: anewarray 4	java/lang/Object
    //   400: dup
    //   401: iconst_0
    //   402: iload_2
    //   403: invokestatic 80	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   406: aastore
    //   407: dup
    //   408: iconst_1
    //   409: aload_1
    //   410: invokevirtual 297	org/vidogram/messenger/g/l:d	()Ljava/lang/String;
    //   413: aastore
    //   414: invokestatic 307	org/vidogram/messenger/g/t:c	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   417: aload 8
    //   419: ifnull +76 -> 495
    //   422: new 252	org/vidogram/messenger/g/i
    //   425: dup
    //   426: iload_2
    //   427: aload 8
    //   429: aload 5
    //   431: iconst_0
    //   432: invokestatic 218	android/os/SystemClock:elapsedRealtime	()J
    //   435: lload_3
    //   436: lsub
    //   437: invokespecial 255	org/vidogram/messenger/g/i:<init>	(I[BLjava/util/Map;ZJ)V
    //   440: astore 5
    //   442: iload_2
    //   443: sipush 401
    //   446: if_icmpeq +10 -> 456
    //   449: iload_2
    //   450: sipush 403
    //   453: if_icmpne +32 -> 485
    //   456: ldc_w 309
    //   459: aload_1
    //   460: new 311	org/vidogram/messenger/g/a
    //   463: dup
    //   464: aload 5
    //   466: invokespecial 314	org/vidogram/messenger/g/a:<init>	(Lorg/vidogram/messenger/g/i;)V
    //   469: invokestatic 282	org/vidogram/messenger/g/a/a:a	(Ljava/lang/String;Lorg/vidogram/messenger/g/l;Lorg/vidogram/messenger/g/s;)V
    //   472: goto -468 -> 4
    //   475: new 316	org/vidogram/messenger/g/j
    //   478: dup
    //   479: aload 6
    //   481: invokespecial 319	org/vidogram/messenger/g/j:<init>	(Ljava/lang/Throwable;)V
    //   484: athrow
    //   485: new 175	org/vidogram/messenger/g/q
    //   488: dup
    //   489: aload 5
    //   491: invokespecial 320	org/vidogram/messenger/g/q:<init>	(Lorg/vidogram/messenger/g/i;)V
    //   494: athrow
    //   495: new 322	org/vidogram/messenger/g/h
    //   498: dup
    //   499: aconst_null
    //   500: invokespecial 323	org/vidogram/messenger/g/h:<init>	(Lorg/vidogram/messenger/g/i;)V
    //   503: athrow
    //   504: astore 9
    //   506: aconst_null
    //   507: astore 8
    //   509: aload 6
    //   511: astore 7
    //   513: aload 9
    //   515: astore 6
    //   517: goto -142 -> 375
    //   520: astore 8
    //   522: aload 6
    //   524: astore 7
    //   526: aload 8
    //   528: astore 6
    //   530: aload 5
    //   532: astore 8
    //   534: aload 9
    //   536: astore 5
    //   538: goto -163 -> 375
    //
    // Exception table:
    //   from	to	target	type
    //   12	45	250	java/net/SocketTimeoutException
    //   49	58	250	java/net/SocketTimeoutException
    //   62	70	250	java/net/SocketTimeoutException
    //   74	86	250	java/net/SocketTimeoutException
    //   97	103	250	java/net/SocketTimeoutException
    //   112	132	250	java/net/SocketTimeoutException
    //   136	148	250	java/net/SocketTimeoutException
    //   152	179	250	java/net/SocketTimeoutException
    //   183	193	250	java/net/SocketTimeoutException
    //   197	210	250	java/net/SocketTimeoutException
    //   214	228	250	java/net/SocketTimeoutException
    //   242	250	250	java/net/SocketTimeoutException
    //   273	278	250	java/net/SocketTimeoutException
    //   285	305	250	java/net/SocketTimeoutException
    //   12	45	308	org/apache/http/conn/ConnectTimeoutException
    //   49	58	308	org/apache/http/conn/ConnectTimeoutException
    //   62	70	308	org/apache/http/conn/ConnectTimeoutException
    //   74	86	308	org/apache/http/conn/ConnectTimeoutException
    //   97	103	308	org/apache/http/conn/ConnectTimeoutException
    //   112	132	308	org/apache/http/conn/ConnectTimeoutException
    //   136	148	308	org/apache/http/conn/ConnectTimeoutException
    //   152	179	308	org/apache/http/conn/ConnectTimeoutException
    //   183	193	308	org/apache/http/conn/ConnectTimeoutException
    //   197	210	308	org/apache/http/conn/ConnectTimeoutException
    //   214	228	308	org/apache/http/conn/ConnectTimeoutException
    //   242	250	308	org/apache/http/conn/ConnectTimeoutException
    //   273	278	308	org/apache/http/conn/ConnectTimeoutException
    //   285	305	308	org/apache/http/conn/ConnectTimeoutException
    //   12	45	327	java/net/MalformedURLException
    //   49	58	327	java/net/MalformedURLException
    //   62	70	327	java/net/MalformedURLException
    //   74	86	327	java/net/MalformedURLException
    //   97	103	327	java/net/MalformedURLException
    //   112	132	327	java/net/MalformedURLException
    //   136	148	327	java/net/MalformedURLException
    //   152	179	327	java/net/MalformedURLException
    //   183	193	327	java/net/MalformedURLException
    //   197	210	327	java/net/MalformedURLException
    //   214	228	327	java/net/MalformedURLException
    //   242	250	327	java/net/MalformedURLException
    //   273	278	327	java/net/MalformedURLException
    //   285	305	327	java/net/MalformedURLException
    //   12	45	362	java/io/IOException
    //   49	58	504	java/io/IOException
    //   62	70	504	java/io/IOException
    //   74	86	504	java/io/IOException
    //   97	103	504	java/io/IOException
    //   112	132	504	java/io/IOException
    //   136	148	504	java/io/IOException
    //   152	179	504	java/io/IOException
    //   183	193	504	java/io/IOException
    //   197	210	504	java/io/IOException
    //   273	278	504	java/io/IOException
    //   214	228	520	java/io/IOException
    //   242	250	520	java/io/IOException
    //   285	305	520	java/io/IOException
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.g.a.a
 * JD-Core Version:    0.6.0
 */