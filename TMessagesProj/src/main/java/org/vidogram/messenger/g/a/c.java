package org.vidogram.messenger.g.a;

import android.os.SystemClock;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Map<Ljava.lang.String;Ljava.lang.String;>;
import java.util.Set;
import org.vidogram.messenger.g.b;
import org.vidogram.messenger.g.b.a;
import org.vidogram.messenger.g.t;

public class c
  implements b
{
  private final Map<String, a> a = new LinkedHashMap(16, 0.75F, true);
  private long b = 0L;
  private final File c;
  private final int d;

  public c(File paramFile)
  {
    this(paramFile, 5242880);
  }

  public c(File paramFile, int paramInt)
  {
    this.c = paramFile;
    this.d = paramInt;
  }

  static int a(InputStream paramInputStream)
  {
    return 0x0 | e(paramInputStream) << 0 | e(paramInputStream) << 8 | e(paramInputStream) << 16 | e(paramInputStream) << 24;
  }

  private void a(int paramInt)
  {
    if (this.b + paramInt < this.d);
    label229: label233: 
    while (true)
    {
      return;
      if (t.b)
        t.a("Pruning old cache entries.", new Object[0]);
      long l1 = this.b;
      long l2 = SystemClock.elapsedRealtime();
      Iterator localIterator = this.a.entrySet().iterator();
      int i = 0;
      a locala;
      if (localIterator.hasNext())
      {
        locala = (a)((Map.Entry)localIterator.next()).getValue();
        if (c(locala.b).delete())
        {
          this.b -= locala.a;
          label119: localIterator.remove();
          i += 1;
          if ((float)(this.b + paramInt) >= this.d * 0.9F)
            break label229;
        }
      }
      while (true)
      {
        if (!t.b)
          break label233;
        t.a("pruned %d files, %d bytes, %d ms", new Object[] { Integer.valueOf(i), Long.valueOf(this.b - l1), Long.valueOf(SystemClock.elapsedRealtime() - l2) });
        return;
        t.b("Could not delete cache entry for key=%s, filename=%s", new Object[] { locala.b, d(locala.b) });
        break label119;
        break;
      }
    }
  }

  static void a(OutputStream paramOutputStream, int paramInt)
  {
    paramOutputStream.write(paramInt >> 0 & 0xFF);
    paramOutputStream.write(paramInt >> 8 & 0xFF);
    paramOutputStream.write(paramInt >> 16 & 0xFF);
    paramOutputStream.write(paramInt >> 24 & 0xFF);
  }

  static void a(OutputStream paramOutputStream, long paramLong)
  {
    paramOutputStream.write((byte)(int)(paramLong >>> 0));
    paramOutputStream.write((byte)(int)(paramLong >>> 8));
    paramOutputStream.write((byte)(int)(paramLong >>> 16));
    paramOutputStream.write((byte)(int)(paramLong >>> 24));
    paramOutputStream.write((byte)(int)(paramLong >>> 32));
    paramOutputStream.write((byte)(int)(paramLong >>> 40));
    paramOutputStream.write((byte)(int)(paramLong >>> 48));
    paramOutputStream.write((byte)(int)(paramLong >>> 56));
  }

  static void a(OutputStream paramOutputStream, String paramString)
  {
    paramString = paramString.getBytes("UTF-8");
    a(paramOutputStream, paramString.length);
    paramOutputStream.write(paramString, 0, paramString.length);
  }

  private void a(String paramString, a parama)
  {
    if (!this.a.containsKey(paramString))
      this.b += parama.a;
    while (true)
    {
      this.a.put(paramString, parama);
      return;
      a locala = (a)this.a.get(paramString);
      long l = this.b;
      this.b = (parama.a - locala.a + l);
    }
  }

  static void a(Map<String, String> paramMap, OutputStream paramOutputStream)
  {
    if (paramMap != null)
    {
      a(paramOutputStream, paramMap.size());
      paramMap = paramMap.entrySet().iterator();
      while (paramMap.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)paramMap.next();
        a(paramOutputStream, (String)localEntry.getKey());
        a(paramOutputStream, (String)localEntry.getValue());
      }
    }
    a(paramOutputStream, 0);
  }

  private static byte[] a(InputStream paramInputStream, int paramInt)
  {
    byte[] arrayOfByte = new byte[paramInt];
    int i = 0;
    while (i < paramInt)
    {
      int j = paramInputStream.read(arrayOfByte, i, paramInt - i);
      if (j == -1)
        break;
      i += j;
    }
    if (i != paramInt)
      throw new IOException("Expected " + paramInt + " bytes, read " + i + " bytes");
    return arrayOfByte;
  }

  static long b(InputStream paramInputStream)
  {
    return 0L | (e(paramInputStream) & 0xFF) << 0 | (e(paramInputStream) & 0xFF) << 8 | (e(paramInputStream) & 0xFF) << 16 | (e(paramInputStream) & 0xFF) << 24 | (e(paramInputStream) & 0xFF) << 32 | (e(paramInputStream) & 0xFF) << 40 | (e(paramInputStream) & 0xFF) << 48 | (e(paramInputStream) & 0xFF) << 56;
  }

  static String c(InputStream paramInputStream)
  {
    return new String(a(paramInputStream, (int)b(paramInputStream)), "UTF-8");
  }

  private String d(String paramString)
  {
    int i = paramString.length() / 2;
    int j = paramString.substring(0, i).hashCode();
    return String.valueOf(j) + String.valueOf(paramString.substring(i).hashCode());
  }

  static Map<String, String> d(InputStream paramInputStream)
  {
    int j = a(paramInputStream);
    if (j == 0);
    for (Object localObject = Collections.emptyMap(); ; localObject = new HashMap(j))
    {
      int i = 0;
      while (i < j)
      {
        ((Map)localObject).put(c(paramInputStream).intern(), c(paramInputStream).intern());
        i += 1;
      }
    }
    return (Map<String, String>)localObject;
  }

  private static int e(InputStream paramInputStream)
  {
    int i = paramInputStream.read();
    if (i == -1)
      throw new EOFException();
    return i;
  }

  private void e(String paramString)
  {
    a locala = (a)this.a.get(paramString);
    if (locala != null)
    {
      this.b -= locala.a;
      this.a.remove(paramString);
    }
  }

  // ERROR //
  public b.a a(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 39	org/vidogram/messenger/g/a/c:a	Ljava/util/Map;
    //   6: aload_1
    //   7: invokeinterface 164 2 0
    //   12: checkcast 10	org/vidogram/messenger/g/a/c$a
    //   15: astore 4
    //   17: aload 4
    //   19: ifnonnull +9 -> 28
    //   22: aconst_null
    //   23: astore_1
    //   24: aload_0
    //   25: monitorexit
    //   26: aload_1
    //   27: areturn
    //   28: aload_0
    //   29: aload_1
    //   30: invokevirtual 99	org/vidogram/messenger/g/a/c:c	(Ljava/lang/String;)Ljava/io/File;
    //   33: astore 5
    //   35: new 13	org/vidogram/messenger/g/a/c$b
    //   38: dup
    //   39: new 265	java/io/BufferedInputStream
    //   42: dup
    //   43: new 267	java/io/FileInputStream
    //   46: dup
    //   47: aload 5
    //   49: invokespecial 269	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   52: invokespecial 272	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   55: aconst_null
    //   56: invokespecial 275	org/vidogram/messenger/g/a/c$b:<init>	(Ljava/io/InputStream;Lorg/vidogram/messenger/g/a/c$1;)V
    //   59: astore_3
    //   60: aload_3
    //   61: astore_2
    //   62: aload_3
    //   63: invokestatic 278	org/vidogram/messenger/g/a/c$a:a	(Ljava/io/InputStream;)Lorg/vidogram/messenger/g/a/c$a;
    //   66: pop
    //   67: aload_3
    //   68: astore_2
    //   69: aload 4
    //   71: aload_3
    //   72: aload 5
    //   74: invokevirtual 280	java/io/File:length	()J
    //   77: aload_3
    //   78: invokestatic 283	org/vidogram/messenger/g/a/c$b:a	(Lorg/vidogram/messenger/g/a/c$b;)I
    //   81: i2l
    //   82: lsub
    //   83: l2i
    //   84: invokestatic 218	org/vidogram/messenger/g/a/c:a	(Ljava/io/InputStream;I)[B
    //   87: invokevirtual 286	org/vidogram/messenger/g/a/c$a:a	([B)Lorg/vidogram/messenger/g/b$a;
    //   90: astore 4
    //   92: aload 4
    //   94: astore_2
    //   95: aload_2
    //   96: astore_1
    //   97: aload_3
    //   98: ifnull -74 -> 24
    //   101: aload_3
    //   102: invokevirtual 289	org/vidogram/messenger/g/a/c$b:close	()V
    //   105: aload_2
    //   106: astore_1
    //   107: goto -83 -> 24
    //   110: astore_1
    //   111: aconst_null
    //   112: astore_1
    //   113: goto -89 -> 24
    //   116: astore 4
    //   118: aconst_null
    //   119: astore_3
    //   120: aload_3
    //   121: astore_2
    //   122: ldc_w 291
    //   125: iconst_2
    //   126: anewarray 4	java/lang/Object
    //   129: dup
    //   130: iconst_0
    //   131: aload 5
    //   133: invokevirtual 294	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   136: aastore
    //   137: dup
    //   138: iconst_1
    //   139: aload 4
    //   141: invokevirtual 295	java/io/IOException:toString	()Ljava/lang/String;
    //   144: aastore
    //   145: invokestatic 130	org/vidogram/messenger/g/t:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   148: aload_3
    //   149: astore_2
    //   150: aload_0
    //   151: aload_1
    //   152: invokevirtual 297	org/vidogram/messenger/g/a/c:b	(Ljava/lang/String;)V
    //   155: aload_3
    //   156: ifnull +7 -> 163
    //   159: aload_3
    //   160: invokevirtual 289	org/vidogram/messenger/g/a/c$b:close	()V
    //   163: aconst_null
    //   164: astore_1
    //   165: goto -141 -> 24
    //   168: astore_1
    //   169: aconst_null
    //   170: astore_1
    //   171: goto -147 -> 24
    //   174: astore_1
    //   175: aconst_null
    //   176: astore_2
    //   177: aload_2
    //   178: ifnull +7 -> 185
    //   181: aload_2
    //   182: invokevirtual 289	org/vidogram/messenger/g/a/c$b:close	()V
    //   185: aload_1
    //   186: athrow
    //   187: astore_1
    //   188: aload_0
    //   189: monitorexit
    //   190: aload_1
    //   191: athrow
    //   192: astore_1
    //   193: aconst_null
    //   194: astore_1
    //   195: goto -171 -> 24
    //   198: astore_1
    //   199: goto -22 -> 177
    //   202: astore 4
    //   204: goto -84 -> 120
    //
    // Exception table:
    //   from	to	target	type
    //   101	105	110	java/io/IOException
    //   35	60	116	java/io/IOException
    //   159	163	168	java/io/IOException
    //   35	60	174	finally
    //   2	17	187	finally
    //   28	35	187	finally
    //   101	105	187	finally
    //   159	163	187	finally
    //   181	185	187	finally
    //   185	187	187	finally
    //   181	185	192	java/io/IOException
    //   62	67	198	finally
    //   69	92	198	finally
    //   122	148	198	finally
    //   150	155	198	finally
    //   62	67	202	java/io/IOException
    //   69	92	202	java/io/IOException
  }

  // ERROR //
  public void a()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 43	org/vidogram/messenger/g/a/c:c	Ljava/io/File;
    //   6: invokevirtual 300	java/io/File:exists	()Z
    //   9: ifne +36 -> 45
    //   12: aload_0
    //   13: getfield 43	org/vidogram/messenger/g/a/c:c	Ljava/io/File;
    //   16: invokevirtual 303	java/io/File:mkdirs	()Z
    //   19: ifne +23 -> 42
    //   22: ldc_w 305
    //   25: iconst_1
    //   26: anewarray 4	java/lang/Object
    //   29: dup
    //   30: iconst_0
    //   31: aload_0
    //   32: getfield 43	org/vidogram/messenger/g/a/c:c	Ljava/io/File;
    //   35: invokevirtual 294	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   38: aastore
    //   39: invokestatic 307	org/vidogram/messenger/g/t:c	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   42: aload_0
    //   43: monitorexit
    //   44: return
    //   45: aload_0
    //   46: getfield 43	org/vidogram/messenger/g/a/c:c	Ljava/io/File;
    //   49: invokevirtual 311	java/io/File:listFiles	()[Ljava/io/File;
    //   52: astore 5
    //   54: aload 5
    //   56: ifnull -14 -> 42
    //   59: aload 5
    //   61: arraylength
    //   62: istore_2
    //   63: iconst_0
    //   64: istore_1
    //   65: iload_1
    //   66: iload_2
    //   67: if_icmpge -25 -> 42
    //   70: aload 5
    //   72: iload_1
    //   73: aaload
    //   74: astore 6
    //   76: aconst_null
    //   77: astore_3
    //   78: new 265	java/io/BufferedInputStream
    //   81: dup
    //   82: new 267	java/io/FileInputStream
    //   85: dup
    //   86: aload 6
    //   88: invokespecial 269	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   91: invokespecial 272	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   94: astore 4
    //   96: aload 4
    //   98: astore_3
    //   99: aload 4
    //   101: invokestatic 278	org/vidogram/messenger/g/a/c$a:a	(Ljava/io/InputStream;)Lorg/vidogram/messenger/g/a/c$a;
    //   104: astore 7
    //   106: aload 4
    //   108: astore_3
    //   109: aload 7
    //   111: aload 6
    //   113: invokevirtual 280	java/io/File:length	()J
    //   116: putfield 106	org/vidogram/messenger/g/a/c$a:a	J
    //   119: aload 4
    //   121: astore_3
    //   122: aload_0
    //   123: aload 7
    //   125: getfield 96	org/vidogram/messenger/g/a/c$a:b	Ljava/lang/String;
    //   128: aload 7
    //   130: invokespecial 313	org/vidogram/messenger/g/a/c:a	(Ljava/lang/String;Lorg/vidogram/messenger/g/a/c$a;)V
    //   133: aload 4
    //   135: ifnull +8 -> 143
    //   138: aload 4
    //   140: invokevirtual 314	java/io/BufferedInputStream:close	()V
    //   143: iload_1
    //   144: iconst_1
    //   145: iadd
    //   146: istore_1
    //   147: goto -82 -> 65
    //   150: astore_3
    //   151: aconst_null
    //   152: astore 4
    //   154: aload 6
    //   156: ifnull +12 -> 168
    //   159: aload 4
    //   161: astore_3
    //   162: aload 6
    //   164: invokevirtual 104	java/io/File:delete	()Z
    //   167: pop
    //   168: aload 4
    //   170: ifnull -27 -> 143
    //   173: aload 4
    //   175: invokevirtual 314	java/io/BufferedInputStream:close	()V
    //   178: goto -35 -> 143
    //   181: astore_3
    //   182: goto -39 -> 143
    //   185: astore 5
    //   187: aload_3
    //   188: astore 4
    //   190: aload 5
    //   192: astore_3
    //   193: aload 4
    //   195: ifnull +8 -> 203
    //   198: aload 4
    //   200: invokevirtual 314	java/io/BufferedInputStream:close	()V
    //   203: aload_3
    //   204: athrow
    //   205: astore_3
    //   206: aload_0
    //   207: monitorexit
    //   208: aload_3
    //   209: athrow
    //   210: astore_3
    //   211: goto -68 -> 143
    //   214: astore 4
    //   216: goto -13 -> 203
    //   219: astore 5
    //   221: aload_3
    //   222: astore 4
    //   224: aload 5
    //   226: astore_3
    //   227: goto -34 -> 193
    //   230: astore_3
    //   231: goto -77 -> 154
    //
    // Exception table:
    //   from	to	target	type
    //   78	96	150	java/io/IOException
    //   173	178	181	java/io/IOException
    //   78	96	185	finally
    //   2	42	205	finally
    //   45	54	205	finally
    //   59	63	205	finally
    //   138	143	205	finally
    //   173	178	205	finally
    //   198	203	205	finally
    //   203	205	205	finally
    //   138	143	210	java/io/IOException
    //   198	203	214	java/io/IOException
    //   99	106	219	finally
    //   109	119	219	finally
    //   122	133	219	finally
    //   162	168	219	finally
    //   99	106	230	java/io/IOException
    //   109	119	230	java/io/IOException
    //   122	133	230	java/io/IOException
  }

  public void a(String paramString, b.a parama)
  {
    monitorenter;
    try
    {
      a(parama.a.length);
      File localFile = c(paramString);
      while (true)
      {
        BufferedOutputStream localBufferedOutputStream;
        a locala;
        try
        {
          localBufferedOutputStream = new BufferedOutputStream(new FileOutputStream(localFile));
          locala = new a(paramString, parama);
          if (!locala.a(localBufferedOutputStream))
          {
            localBufferedOutputStream.close();
            t.b("Failed to write header for %s", new Object[] { localFile.getAbsolutePath() });
            throw new IOException();
          }
        }
        catch (IOException paramString)
        {
          if (localFile.delete())
            continue;
          t.b("Could not clean up file %s", new Object[] { localFile.getAbsolutePath() });
          monitorexit;
          return;
        }
        localBufferedOutputStream.write(parama.a);
        localBufferedOutputStream.close();
        a(paramString, locala);
      }
    }
    finally
    {
      monitorexit;
    }
    throw paramString;
  }

  public void b(String paramString)
  {
    monitorenter;
    try
    {
      boolean bool = c(paramString).delete();
      e(paramString);
      if (!bool)
        t.b("Could not delete cache entry for key=%s, filename=%s", new Object[] { paramString, d(paramString) });
      return;
    }
    finally
    {
      monitorexit;
    }
    throw paramString;
  }

  public File c(String paramString)
  {
    return new File(this.c, d(paramString));
  }

  static class a
  {
    public long a;
    public String b;
    public String c;
    public long d;
    public long e;
    public long f;
    public long g;
    public Map<String, String> h;

    private a()
    {
    }

    public a(String paramString, b.a parama)
    {
      this.b = paramString;
      this.a = parama.a.length;
      this.c = parama.b;
      this.d = parama.c;
      this.e = parama.d;
      this.f = parama.e;
      this.g = parama.f;
      this.h = parama.g;
    }

    public static a a(InputStream paramInputStream)
    {
      a locala = new a();
      if (c.a(paramInputStream) != 538247942)
        throw new IOException();
      locala.b = c.c(paramInputStream);
      locala.c = c.c(paramInputStream);
      if (locala.c.equals(""))
        locala.c = null;
      locala.d = c.b(paramInputStream);
      locala.e = c.b(paramInputStream);
      locala.f = c.b(paramInputStream);
      locala.g = c.b(paramInputStream);
      locala.h = c.d(paramInputStream);
      return locala;
    }

    public b.a a(byte[] paramArrayOfByte)
    {
      b.a locala = new b.a();
      locala.a = paramArrayOfByte;
      locala.b = this.c;
      locala.c = this.d;
      locala.d = this.e;
      locala.e = this.f;
      locala.f = this.g;
      locala.g = this.h;
      return locala;
    }

    public boolean a(OutputStream paramOutputStream)
    {
      try
      {
        c.a(paramOutputStream, 538247942);
        c.a(paramOutputStream, this.b);
        if (this.c == null);
        for (String str = ""; ; str = this.c)
        {
          c.a(paramOutputStream, str);
          c.a(paramOutputStream, this.d);
          c.a(paramOutputStream, this.e);
          c.a(paramOutputStream, this.f);
          c.a(paramOutputStream, this.g);
          c.a(this.h, paramOutputStream);
          paramOutputStream.flush();
          return true;
        }
      }
      catch (IOException paramOutputStream)
      {
        t.b("%s", new Object[] { paramOutputStream.toString() });
      }
      return false;
    }
  }

  private static class b extends FilterInputStream
  {
    private int a = 0;

    private b(InputStream paramInputStream)
    {
      super();
    }

    public int read()
    {
      int i = super.read();
      if (i != -1)
        this.a += 1;
      return i;
    }

    public int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    {
      paramInt1 = super.read(paramArrayOfByte, paramInt1, paramInt2);
      if (paramInt1 != -1)
        this.a += paramInt1;
      return paramInt1;
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.g.a.c
 * JD-Core Version:    0.6.0
 */