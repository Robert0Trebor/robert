package org.vidogram.messenger.exoplayer.e;

import android.net.Uri;
import android.util.Log;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import org.vidogram.messenger.exoplayer.f.b;
import org.vidogram.messenger.exoplayer.f.o;
import org.vidogram.messenger.exoplayer.f.r;

public class h
  implements k
{
  private static final Pattern b = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
  private static final AtomicReference<byte[]> c = new AtomicReference();
  private final boolean d;
  private final int e;
  private final int f;
  private final String g;
  private final o<String> h;
  private final HashMap<String, String> i;
  private final m j;
  private f k;
  private HttpURLConnection l;
  private InputStream m;
  private boolean n;
  private long o;
  private long p;
  private long q;
  private long r;

  public h(String paramString, o<String> paramo, m paramm, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    this.g = b.a(paramString);
    this.h = paramo;
    this.j = paramm;
    this.i = new HashMap();
    this.e = paramInt1;
    this.f = paramInt2;
    this.d = paramBoolean;
  }

  // ERROR //
  private static long a(HttpURLConnection paramHttpURLConnection)
  {
    // Byte code:
    //   0: ldc2_w 89
    //   3: lstore_3
    //   4: aload_0
    //   5: ldc 92
    //   7: invokevirtual 97	java/net/HttpURLConnection:getHeaderField	(Ljava/lang/String;)Ljava/lang/String;
    //   10: astore 7
    //   12: lload_3
    //   13: lstore_1
    //   14: aload 7
    //   16: invokestatic 103	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   19: ifne +9 -> 28
    //   22: aload 7
    //   24: invokestatic 109	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   27: lstore_1
    //   28: aload_0
    //   29: ldc 111
    //   31: invokevirtual 97	java/net/HttpURLConnection:getHeaderField	(Ljava/lang/String;)Ljava/lang/String;
    //   34: astore_0
    //   35: lload_1
    //   36: lstore_3
    //   37: aload_0
    //   38: invokestatic 103	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   41: ifne +60 -> 101
    //   44: getstatic 50	org/vidogram/messenger/exoplayer/e/h:b	Ljava/util/regex/Pattern;
    //   47: aload_0
    //   48: invokevirtual 115	java/util/regex/Pattern:matcher	(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
    //   51: astore 8
    //   53: lload_1
    //   54: lstore_3
    //   55: aload 8
    //   57: invokevirtual 121	java/util/regex/Matcher:find	()Z
    //   60: ifeq +41 -> 101
    //   63: aload 8
    //   65: iconst_2
    //   66: invokevirtual 125	java/util/regex/Matcher:group	(I)Ljava/lang/String;
    //   69: invokestatic 109	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   72: lstore_3
    //   73: aload 8
    //   75: iconst_1
    //   76: invokevirtual 125	java/util/regex/Matcher:group	(I)Ljava/lang/String;
    //   79: invokestatic 109	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   82: lstore 5
    //   84: lload_3
    //   85: lload 5
    //   87: lsub
    //   88: lconst_1
    //   89: ladd
    //   90: lstore 5
    //   92: lload_1
    //   93: lconst_0
    //   94: lcmp
    //   95: ifge +46 -> 141
    //   98: lload 5
    //   100: lstore_3
    //   101: lload_3
    //   102: lreturn
    //   103: astore 8
    //   105: ldc 127
    //   107: new 129	java/lang/StringBuilder
    //   110: dup
    //   111: invokespecial 130	java/lang/StringBuilder:<init>	()V
    //   114: ldc 132
    //   116: invokevirtual 136	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   119: aload 7
    //   121: invokevirtual 136	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   124: ldc 138
    //   126: invokevirtual 136	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   129: invokevirtual 142	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   132: invokestatic 147	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   135: pop
    //   136: lload_3
    //   137: lstore_1
    //   138: goto -110 -> 28
    //   141: lload_1
    //   142: lstore_3
    //   143: lload_1
    //   144: lload 5
    //   146: lcmp
    //   147: ifeq -46 -> 101
    //   150: ldc 127
    //   152: new 129	java/lang/StringBuilder
    //   155: dup
    //   156: invokespecial 130	java/lang/StringBuilder:<init>	()V
    //   159: ldc 149
    //   161: invokevirtual 136	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   164: aload 7
    //   166: invokevirtual 136	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   169: ldc 151
    //   171: invokevirtual 136	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   174: aload_0
    //   175: invokevirtual 136	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   178: ldc 138
    //   180: invokevirtual 136	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   183: invokevirtual 142	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   186: invokestatic 154	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   189: pop
    //   190: lload_1
    //   191: lload 5
    //   193: invokestatic 160	java/lang/Math:max	(JJ)J
    //   196: lstore_3
    //   197: lload_3
    //   198: lreturn
    //   199: astore 7
    //   201: ldc 127
    //   203: new 129	java/lang/StringBuilder
    //   206: dup
    //   207: invokespecial 130	java/lang/StringBuilder:<init>	()V
    //   210: ldc 162
    //   212: invokevirtual 136	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   215: aload_0
    //   216: invokevirtual 136	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   219: ldc 138
    //   221: invokevirtual 136	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   224: invokevirtual 142	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   227: invokestatic 147	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   230: pop
    //   231: lload_1
    //   232: lreturn
    //
    // Exception table:
    //   from	to	target	type
    //   22	28	103	java/lang/NumberFormatException
    //   63	84	199	java/lang/NumberFormatException
    //   150	197	199	java/lang/NumberFormatException
  }

  private HttpURLConnection a(URL arg1, byte[] paramArrayOfByte, long paramLong1, long paramLong2, boolean paramBoolean1, boolean paramBoolean2)
  {
    HttpURLConnection localHttpURLConnection = (HttpURLConnection)???.openConnection();
    localHttpURLConnection.setConnectTimeout(this.e);
    localHttpURLConnection.setReadTimeout(this.f);
    Object localObject;
    synchronized (this.i)
    {
      localObject = this.i.entrySet().iterator();
      if (((Iterator)localObject).hasNext())
      {
        Map.Entry localEntry = (Map.Entry)((Iterator)localObject).next();
        localHttpURLConnection.setRequestProperty((String)localEntry.getKey(), (String)localEntry.getValue());
      }
    }
    monitorexit;
    if ((paramLong1 != 0L) || (paramLong2 != -1L))
    {
      localObject = "bytes=" + paramLong1 + "-";
      ??? = (URL)localObject;
      if (paramLong2 != -1L)
        ??? = (String)localObject + (paramLong1 + paramLong2 - 1L);
      localHttpURLConnection.setRequestProperty("Range", ???);
    }
    localHttpURLConnection.setRequestProperty("User-Agent", this.g);
    if (!paramBoolean1)
      localHttpURLConnection.setRequestProperty("Accept-Encoding", "identity");
    localHttpURLConnection.setInstanceFollowRedirects(paramBoolean2);
    if (paramArrayOfByte != null);
    for (paramBoolean1 = true; ; paramBoolean1 = false)
    {
      localHttpURLConnection.setDoOutput(paramBoolean1);
      if (paramArrayOfByte == null)
        break;
      localHttpURLConnection.setFixedLengthStreamingMode(paramArrayOfByte.length);
      localHttpURLConnection.connect();
      ??? = localHttpURLConnection.getOutputStream();
      ???.write(paramArrayOfByte);
      ???.close();
      return localHttpURLConnection;
    }
    localHttpURLConnection.connect();
    return (HttpURLConnection)localHttpURLConnection;
  }

  private static URL a(URL paramURL, String paramString)
  {
    if (paramString == null)
      throw new ProtocolException("Null location redirect");
    paramURL = new URL(paramURL, paramString);
    paramString = paramURL.getProtocol();
    if ((!"https".equals(paramString)) && (!"http".equals(paramString)))
      throw new ProtocolException("Unsupported protocol redirect: " + paramString);
    return paramURL;
  }

  private int b(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (this.p == -1L)
      if (paramInt2 != 0)
        break label36;
    label36: 
    do
    {
      return -1;
      paramInt2 = (int)Math.min(paramInt2, this.p - this.r);
      break;
      paramInt1 = this.m.read(paramArrayOfByte, paramInt1, paramInt2);
      if (paramInt1 != -1)
        break label83;
    }
    while ((this.p == -1L) || (this.p == this.r));
    throw new EOFException();
    label83: this.r += paramInt1;
    if (this.j != null)
      this.j.a(paramInt1);
    return paramInt1;
  }

  private HttpURLConnection b(f paramf)
  {
    Object localObject = new URL(paramf.a.toString());
    byte[] arrayOfByte = paramf.b;
    long l1 = paramf.d;
    long l2 = paramf.e;
    if ((paramf.g & 0x1) != 0);
    for (boolean bool = true; !this.d; bool = false)
      return a((URL)localObject, arrayOfByte, l1, l2, bool, true);
    int i1 = 0;
    paramf = (f)localObject;
    int i2;
    while (true)
    {
      i2 = i1 + 1;
      if (i1 > 20)
        break;
      localObject = a(paramf, arrayOfByte, l1, l2, bool, false);
      i1 = ((HttpURLConnection)localObject).getResponseCode();
      if ((i1 == 300) || (i1 == 301) || (i1 == 302) || (i1 == 303) || ((arrayOfByte == null) && ((i1 == 307) || (i1 == 308))))
      {
        arrayOfByte = null;
        String str = ((HttpURLConnection)localObject).getHeaderField("Location");
        ((HttpURLConnection)localObject).disconnect();
        paramf = a(paramf, str);
        i1 = i2;
        continue;
      }
      return localObject;
    }
    throw new NoRouteToHostException("Too many redirects: " + i2);
  }

  private void c()
  {
    if (this.q == this.o)
      return;
    byte[] arrayOfByte2 = (byte[])c.getAndSet(null);
    byte[] arrayOfByte1 = arrayOfByte2;
    if (arrayOfByte2 == null)
      arrayOfByte1 = new byte[4096];
    while (this.q != this.o)
    {
      int i1 = (int)Math.min(this.o - this.q, arrayOfByte1.length);
      i1 = this.m.read(arrayOfByte1, 0, i1);
      if (Thread.interrupted())
        throw new InterruptedIOException();
      if (i1 == -1)
        throw new EOFException();
      this.q += i1;
      if (this.j == null)
        continue;
      this.j.a(i1);
    }
    c.set(arrayOfByte1);
  }

  private void d()
  {
    if (this.l != null);
    try
    {
      this.l.disconnect();
      this.l = null;
      return;
    }
    catch (Exception localException)
    {
      while (true)
        Log.e("DefaultHttpDataSource", "Unexpected error while disconnecting", localException);
    }
  }

  public int a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    try
    {
      c();
      paramInt1 = b(paramArrayOfByte, paramInt1, paramInt2);
      return paramInt1;
    }
    catch (IOException paramArrayOfByte)
    {
    }
    throw new k.a(paramArrayOfByte, this.k, 2);
  }

  // ERROR //
  public long a(f paramf)
  {
    // Byte code:
    //   0: lconst_0
    //   1: lstore 5
    //   3: aload_0
    //   4: aload_1
    //   5: putfield 376	org/vidogram/messenger/exoplayer/e/h:k	Lorg/vidogram/messenger/exoplayer/e/f;
    //   8: aload_0
    //   9: lconst_0
    //   10: putfield 279	org/vidogram/messenger/exoplayer/e/h:r	J
    //   13: aload_0
    //   14: lconst_0
    //   15: putfield 338	org/vidogram/messenger/exoplayer/e/h:q	J
    //   18: aload_0
    //   19: aload_0
    //   20: aload_1
    //   21: invokespecial 382	org/vidogram/messenger/exoplayer/e/h:b	(Lorg/vidogram/messenger/exoplayer/e/f;)Ljava/net/HttpURLConnection;
    //   24: putfield 361	org/vidogram/messenger/exoplayer/e/h:l	Ljava/net/HttpURLConnection;
    //   27: aload_0
    //   28: getfield 361	org/vidogram/messenger/exoplayer/e/h:l	Ljava/net/HttpURLConnection;
    //   31: invokevirtual 321	java/net/HttpURLConnection:getResponseCode	()I
    //   34: istore_2
    //   35: iload_2
    //   36: sipush 200
    //   39: if_icmplt +10 -> 49
    //   42: iload_2
    //   43: sipush 299
    //   46: if_icmple +112 -> 158
    //   49: aload_0
    //   50: getfield 361	org/vidogram/messenger/exoplayer/e/h:l	Ljava/net/HttpURLConnection;
    //   53: invokevirtual 386	java/net/HttpURLConnection:getHeaderFields	()Ljava/util/Map;
    //   56: astore 7
    //   58: aload_0
    //   59: invokespecial 388	org/vidogram/messenger/exoplayer/e/h:d	()V
    //   62: new 390	org/vidogram/messenger/exoplayer/e/k$c
    //   65: dup
    //   66: iload_2
    //   67: aload 7
    //   69: aload_1
    //   70: invokespecial 393	org/vidogram/messenger/exoplayer/e/k$c:<init>	(ILjava/util/Map;Lorg/vidogram/messenger/exoplayer/e/f;)V
    //   73: athrow
    //   74: astore 7
    //   76: new 374	org/vidogram/messenger/exoplayer/e/k$a
    //   79: dup
    //   80: new 129	java/lang/StringBuilder
    //   83: dup
    //   84: invokespecial 130	java/lang/StringBuilder:<init>	()V
    //   87: ldc_w 395
    //   90: invokevirtual 136	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   93: aload_1
    //   94: getfield 302	org/vidogram/messenger/exoplayer/e/f:a	Landroid/net/Uri;
    //   97: invokevirtual 305	android/net/Uri:toString	()Ljava/lang/String;
    //   100: invokevirtual 136	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   103: invokevirtual 142	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   106: aload 7
    //   108: aload_1
    //   109: iconst_1
    //   110: invokespecial 398	org/vidogram/messenger/exoplayer/e/k$a:<init>	(Ljava/lang/String;Ljava/io/IOException;Lorg/vidogram/messenger/exoplayer/e/f;I)V
    //   113: athrow
    //   114: astore 7
    //   116: aload_0
    //   117: invokespecial 388	org/vidogram/messenger/exoplayer/e/h:d	()V
    //   120: new 374	org/vidogram/messenger/exoplayer/e/k$a
    //   123: dup
    //   124: new 129	java/lang/StringBuilder
    //   127: dup
    //   128: invokespecial 130	java/lang/StringBuilder:<init>	()V
    //   131: ldc_w 395
    //   134: invokevirtual 136	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   137: aload_1
    //   138: getfield 302	org/vidogram/messenger/exoplayer/e/f:a	Landroid/net/Uri;
    //   141: invokevirtual 305	android/net/Uri:toString	()Ljava/lang/String;
    //   144: invokevirtual 136	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   147: invokevirtual 142	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   150: aload 7
    //   152: aload_1
    //   153: iconst_1
    //   154: invokespecial 398	org/vidogram/messenger/exoplayer/e/k$a:<init>	(Ljava/lang/String;Ljava/io/IOException;Lorg/vidogram/messenger/exoplayer/e/f;I)V
    //   157: athrow
    //   158: aload_0
    //   159: getfield 361	org/vidogram/messenger/exoplayer/e/h:l	Ljava/net/HttpURLConnection;
    //   162: invokevirtual 401	java/net/HttpURLConnection:getContentType	()Ljava/lang/String;
    //   165: astore 7
    //   167: aload_0
    //   168: getfield 70	org/vidogram/messenger/exoplayer/e/h:h	Lorg/vidogram/messenger/exoplayer/f/o;
    //   171: ifnull +32 -> 203
    //   174: aload_0
    //   175: getfield 70	org/vidogram/messenger/exoplayer/e/h:h	Lorg/vidogram/messenger/exoplayer/f/o;
    //   178: aload 7
    //   180: invokeinterface 405 2 0
    //   185: ifne +18 -> 203
    //   188: aload_0
    //   189: invokespecial 388	org/vidogram/messenger/exoplayer/e/h:d	()V
    //   192: new 407	org/vidogram/messenger/exoplayer/e/k$b
    //   195: dup
    //   196: aload 7
    //   198: aload_1
    //   199: invokespecial 410	org/vidogram/messenger/exoplayer/e/k$b:<init>	(Ljava/lang/String;Lorg/vidogram/messenger/exoplayer/e/f;)V
    //   202: athrow
    //   203: lload 5
    //   205: lstore_3
    //   206: iload_2
    //   207: sipush 200
    //   210: if_icmpne +20 -> 230
    //   213: lload 5
    //   215: lstore_3
    //   216: aload_1
    //   217: getfield 311	org/vidogram/messenger/exoplayer/e/f:d	J
    //   220: lconst_0
    //   221: lcmp
    //   222: ifeq +8 -> 230
    //   225: aload_1
    //   226: getfield 311	org/vidogram/messenger/exoplayer/e/f:d	J
    //   229: lstore_3
    //   230: aload_0
    //   231: lload_3
    //   232: putfield 340	org/vidogram/messenger/exoplayer/e/h:o	J
    //   235: aload_1
    //   236: getfield 315	org/vidogram/messenger/exoplayer/e/f:g	I
    //   239: iconst_1
    //   240: iand
    //   241: ifne +94 -> 335
    //   244: aload_0
    //   245: getfield 361	org/vidogram/messenger/exoplayer/e/h:l	Ljava/net/HttpURLConnection;
    //   248: invokestatic 412	org/vidogram/messenger/exoplayer/e/h:a	(Ljava/net/HttpURLConnection;)J
    //   251: lstore_3
    //   252: aload_1
    //   253: getfield 313	org/vidogram/messenger/exoplayer/e/f:e	J
    //   256: ldc2_w 89
    //   259: lcmp
    //   260: ifeq +50 -> 310
    //   263: aload_1
    //   264: getfield 313	org/vidogram/messenger/exoplayer/e/f:e	J
    //   267: lstore_3
    //   268: aload_0
    //   269: lload_3
    //   270: putfield 277	org/vidogram/messenger/exoplayer/e/h:p	J
    //   273: aload_0
    //   274: aload_0
    //   275: getfield 361	org/vidogram/messenger/exoplayer/e/h:l	Ljava/net/HttpURLConnection;
    //   278: invokevirtual 416	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   281: putfield 284	org/vidogram/messenger/exoplayer/e/h:m	Ljava/io/InputStream;
    //   284: aload_0
    //   285: iconst_1
    //   286: putfield 418	org/vidogram/messenger/exoplayer/e/h:n	Z
    //   289: aload_0
    //   290: getfield 72	org/vidogram/messenger/exoplayer/e/h:j	Lorg/vidogram/messenger/exoplayer/e/m;
    //   293: ifnull +12 -> 305
    //   296: aload_0
    //   297: getfield 72	org/vidogram/messenger/exoplayer/e/h:j	Lorg/vidogram/messenger/exoplayer/e/m;
    //   300: invokeinterface 420 1 0
    //   305: aload_0
    //   306: getfield 277	org/vidogram/messenger/exoplayer/e/h:p	J
    //   309: lreturn
    //   310: lload_3
    //   311: ldc2_w 89
    //   314: lcmp
    //   315: ifeq +13 -> 328
    //   318: lload_3
    //   319: aload_0
    //   320: getfield 340	org/vidogram/messenger/exoplayer/e/h:o	J
    //   323: lsub
    //   324: lstore_3
    //   325: goto -57 -> 268
    //   328: ldc2_w 89
    //   331: lstore_3
    //   332: goto -64 -> 268
    //   335: aload_0
    //   336: aload_1
    //   337: getfield 313	org/vidogram/messenger/exoplayer/e/f:e	J
    //   340: putfield 277	org/vidogram/messenger/exoplayer/e/h:p	J
    //   343: goto -70 -> 273
    //   346: astore 7
    //   348: aload_0
    //   349: invokespecial 388	org/vidogram/messenger/exoplayer/e/h:d	()V
    //   352: new 374	org/vidogram/messenger/exoplayer/e/k$a
    //   355: dup
    //   356: aload 7
    //   358: aload_1
    //   359: iconst_1
    //   360: invokespecial 379	org/vidogram/messenger/exoplayer/e/k$a:<init>	(Ljava/io/IOException;Lorg/vidogram/messenger/exoplayer/e/f;I)V
    //   363: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   18	27	74	java/io/IOException
    //   27	35	114	java/io/IOException
    //   273	284	346	java/io/IOException
  }

  public void a()
  {
    try
    {
      if (this.m != null)
        r.a(this.l, b());
      try
      {
        this.m.close();
        this.m = null;
        d();
        if (this.n)
        {
          this.n = false;
          if (this.j != null)
            this.j.b();
        }
        return;
      }
      catch (IOException localIOException)
      {
        throw new k.a(localIOException, this.k, 3);
      }
    }
    finally
    {
      this.m = null;
      d();
      if (this.n)
      {
        this.n = false;
        if (this.j != null)
          this.j.b();
      }
    }
    throw localObject;
  }

  protected final long b()
  {
    if (this.p == -1L)
      return this.p;
    return this.p - this.r;
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.exoplayer.e.h
 * JD-Core Version:    0.6.0
 */