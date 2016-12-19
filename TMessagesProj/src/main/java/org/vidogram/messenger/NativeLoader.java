package org.vidogram.messenger;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import java.io.File;
import java.lang.reflect.Field;

public class NativeLoader
{
  private static volatile boolean a = false;

  // ERROR //
  public static void a(Context paramContext)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: getstatic 10	org/vidogram/messenger/NativeLoader:a	Z
    //   6: istore_1
    //   7: iload_1
    //   8: ifeq +7 -> 15
    //   11: ldc 2
    //   13: monitorexit
    //   14: return
    //   15: aload_0
    //   16: invokestatic 22	net/hockeyapp/android/a:a	(Landroid/content/Context;)V
    //   19: getstatic 28	android/os/Build:CPU_ABI	Ljava/lang/String;
    //   22: ldc 30
    //   24: invokevirtual 36	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   27: ifeq +249 -> 276
    //   30: ldc 30
    //   32: astore_2
    //   33: ldc 38
    //   35: invokestatic 44	java/lang/System:getProperty	(Ljava/lang/String;)Ljava/lang/String;
    //   38: astore_3
    //   39: aload_3
    //   40: ifnull +340 -> 380
    //   43: aload_3
    //   44: ldc 46
    //   46: invokevirtual 50	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   49: ifeq +331 -> 380
    //   52: ldc 52
    //   54: astore_2
    //   55: aload_0
    //   56: invokestatic 56	org/vidogram/messenger/NativeLoader:b	(Landroid/content/Context;)Ljava/io/File;
    //   59: astore_3
    //   60: aload_3
    //   61: ifnull +54 -> 115
    //   64: new 58	java/io/File
    //   67: dup
    //   68: aload_3
    //   69: ldc 60
    //   71: invokespecial 64	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   74: invokevirtual 68	java/io/File:exists	()Z
    //   77: ifeq +38 -> 115
    //   80: ldc 70
    //   82: ldc 72
    //   84: invokestatic 77	org/vidogram/messenger/n:b	(Ljava/lang/String;Ljava/lang/String;)V
    //   87: ldc 79
    //   89: invokestatic 83	java/lang/System:loadLibrary	(Ljava/lang/String;)V
    //   92: getstatic 85	net/hockeyapp/android/a:a	Ljava/lang/String;
    //   95: getstatic 88	org/vidogram/messenger/d:a	Z
    //   98: invokestatic 92	org/vidogram/messenger/NativeLoader:init	(Ljava/lang/String;Z)V
    //   101: iconst_1
    //   102: putstatic 10	org/vidogram/messenger/NativeLoader:a	Z
    //   105: goto -94 -> 11
    //   108: astore_3
    //   109: ldc 70
    //   111: aload_3
    //   112: invokestatic 95	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   115: new 58	java/io/File
    //   118: dup
    //   119: aload_0
    //   120: invokevirtual 101	android/content/Context:getFilesDir	()Ljava/io/File;
    //   123: ldc 103
    //   125: invokespecial 64	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   128: astore_3
    //   129: aload_3
    //   130: invokevirtual 106	java/io/File:mkdirs	()Z
    //   133: pop
    //   134: new 58	java/io/File
    //   137: dup
    //   138: aload_3
    //   139: ldc 108
    //   141: invokespecial 64	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   144: astore 4
    //   146: aload 4
    //   148: invokevirtual 68	java/io/File:exists	()Z
    //   151: istore_1
    //   152: iload_1
    //   153: ifeq +49 -> 202
    //   156: ldc 70
    //   158: ldc 110
    //   160: invokestatic 77	org/vidogram/messenger/n:b	(Ljava/lang/String;Ljava/lang/String;)V
    //   163: aload 4
    //   165: invokevirtual 114	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   168: invokestatic 117	java/lang/System:load	(Ljava/lang/String;)V
    //   171: getstatic 85	net/hockeyapp/android/a:a	Ljava/lang/String;
    //   174: getstatic 88	org/vidogram/messenger/d:a	Z
    //   177: invokestatic 92	org/vidogram/messenger/NativeLoader:init	(Ljava/lang/String;Z)V
    //   180: iconst_1
    //   181: putstatic 10	org/vidogram/messenger/NativeLoader:a	Z
    //   184: goto -173 -> 11
    //   187: astore 5
    //   189: ldc 70
    //   191: aload 5
    //   193: invokestatic 95	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   196: aload 4
    //   198: invokevirtual 120	java/io/File:delete	()Z
    //   201: pop
    //   202: ldc 70
    //   204: new 122	java/lang/StringBuilder
    //   207: dup
    //   208: invokespecial 124	java/lang/StringBuilder:<init>	()V
    //   211: ldc 126
    //   213: invokevirtual 130	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   216: aload_2
    //   217: invokevirtual 130	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   220: invokevirtual 133	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   223: invokestatic 135	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   226: aload_0
    //   227: aload_3
    //   228: aload 4
    //   230: aload_2
    //   231: invokestatic 138	org/vidogram/messenger/NativeLoader:a	(Landroid/content/Context;Ljava/io/File;Ljava/io/File;Ljava/lang/String;)Z
    //   234: istore_1
    //   235: iload_1
    //   236: ifne -225 -> 11
    //   239: ldc 79
    //   241: invokestatic 83	java/lang/System:loadLibrary	(Ljava/lang/String;)V
    //   244: getstatic 85	net/hockeyapp/android/a:a	Ljava/lang/String;
    //   247: getstatic 88	org/vidogram/messenger/d:a	Z
    //   250: invokestatic 92	org/vidogram/messenger/NativeLoader:init	(Ljava/lang/String;Z)V
    //   253: iconst_1
    //   254: putstatic 10	org/vidogram/messenger/NativeLoader:a	Z
    //   257: goto -246 -> 11
    //   260: astore_0
    //   261: ldc 70
    //   263: aload_0
    //   264: invokestatic 95	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   267: goto -256 -> 11
    //   270: astore_0
    //   271: ldc 2
    //   273: monitorexit
    //   274: aload_0
    //   275: athrow
    //   276: getstatic 28	android/os/Build:CPU_ABI	Ljava/lang/String;
    //   279: ldc 140
    //   281: invokevirtual 36	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   284: ifeq +9 -> 293
    //   287: ldc 140
    //   289: astore_2
    //   290: goto -257 -> 33
    //   293: getstatic 28	android/os/Build:CPU_ABI	Ljava/lang/String;
    //   296: ldc 52
    //   298: invokevirtual 36	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   301: ifeq +9 -> 310
    //   304: ldc 52
    //   306: astore_2
    //   307: goto -274 -> 33
    //   310: getstatic 28	android/os/Build:CPU_ABI	Ljava/lang/String;
    //   313: ldc 142
    //   315: invokevirtual 36	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   318: ifeq +9 -> 327
    //   321: ldc 142
    //   323: astore_2
    //   324: goto -291 -> 33
    //   327: ldc 140
    //   329: astore_2
    //   330: ldc 70
    //   332: new 122	java/lang/StringBuilder
    //   335: dup
    //   336: invokespecial 124	java/lang/StringBuilder:<init>	()V
    //   339: ldc 144
    //   341: invokevirtual 130	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   344: getstatic 28	android/os/Build:CPU_ABI	Ljava/lang/String;
    //   347: invokevirtual 130	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   350: invokevirtual 133	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   353: invokestatic 135	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   356: goto -323 -> 33
    //   359: astore_2
    //   360: ldc 70
    //   362: aload_2
    //   363: invokestatic 95	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   366: ldc 140
    //   368: astore_2
    //   369: goto -336 -> 33
    //   372: astore_0
    //   373: aload_0
    //   374: invokevirtual 147	java/lang/Throwable:printStackTrace	()V
    //   377: goto -138 -> 239
    //   380: goto -325 -> 55
    //
    // Exception table:
    //   from	to	target	type
    //   87	105	108	java/lang/Error
    //   156	184	187	java/lang/Error
    //   239	257	260	java/lang/Error
    //   3	7	270	finally
    //   15	19	270	finally
    //   19	30	270	finally
    //   33	39	270	finally
    //   43	52	270	finally
    //   55	60	270	finally
    //   64	87	270	finally
    //   87	105	270	finally
    //   109	115	270	finally
    //   115	152	270	finally
    //   156	184	270	finally
    //   189	202	270	finally
    //   202	235	270	finally
    //   239	257	270	finally
    //   261	267	270	finally
    //   276	287	270	finally
    //   293	304	270	finally
    //   310	321	270	finally
    //   330	356	270	finally
    //   360	366	270	finally
    //   373	377	270	finally
    //   19	30	359	java/lang/Exception
    //   276	287	359	java/lang/Exception
    //   293	304	359	java/lang/Exception
    //   310	321	359	java/lang/Exception
    //   330	356	359	java/lang/Exception
    //   19	30	372	java/lang/Throwable
    //   33	39	372	java/lang/Throwable
    //   43	52	372	java/lang/Throwable
    //   55	60	372	java/lang/Throwable
    //   64	87	372	java/lang/Throwable
    //   87	105	372	java/lang/Throwable
    //   109	115	372	java/lang/Throwable
    //   115	152	372	java/lang/Throwable
    //   156	184	372	java/lang/Throwable
    //   189	202	372	java/lang/Throwable
    //   202	235	372	java/lang/Throwable
    //   276	287	372	java/lang/Throwable
    //   293	304	372	java/lang/Throwable
    //   310	321	372	java/lang/Throwable
    //   330	356	372	java/lang/Throwable
    //   360	366	372	java/lang/Throwable
  }

  // ERROR //
  private static boolean a(Context paramContext, File paramFile1, File paramFile2, String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 9
    //   3: aconst_null
    //   4: astore 8
    //   6: aconst_null
    //   7: astore 7
    //   9: iconst_1
    //   10: istore 6
    //   12: aload_1
    //   13: invokevirtual 151	java/io/File:listFiles	()[Ljava/io/File;
    //   16: astore_1
    //   17: aload_1
    //   18: arraylength
    //   19: istore 5
    //   21: iconst_0
    //   22: istore 4
    //   24: iload 4
    //   26: iload 5
    //   28: if_icmpge +27 -> 55
    //   31: aload_1
    //   32: iload 4
    //   34: aaload
    //   35: invokevirtual 120	java/io/File:delete	()Z
    //   38: pop
    //   39: iload 4
    //   41: iconst_1
    //   42: iadd
    //   43: istore 4
    //   45: goto -21 -> 24
    //   48: astore_1
    //   49: ldc 70
    //   51: aload_1
    //   52: invokestatic 95	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   55: new 153	java/util/zip/ZipFile
    //   58: dup
    //   59: aload_0
    //   60: invokevirtual 157	android/content/Context:getApplicationInfo	()Landroid/content/pm/ApplicationInfo;
    //   63: getfield 162	android/content/pm/ApplicationInfo:sourceDir	Ljava/lang/String;
    //   66: invokespecial 164	java/util/zip/ZipFile:<init>	(Ljava/lang/String;)V
    //   69: astore_0
    //   70: aload 9
    //   72: astore_1
    //   73: aload_0
    //   74: new 122	java/lang/StringBuilder
    //   77: dup
    //   78: invokespecial 124	java/lang/StringBuilder:<init>	()V
    //   81: ldc 166
    //   83: invokevirtual 130	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   86: aload_3
    //   87: invokevirtual 130	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   90: ldc 168
    //   92: invokevirtual 130	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   95: ldc 60
    //   97: invokevirtual 130	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   100: invokevirtual 133	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   103: invokevirtual 172	java/util/zip/ZipFile:getEntry	(Ljava/lang/String;)Ljava/util/zip/ZipEntry;
    //   106: astore 7
    //   108: aload 7
    //   110: ifnonnull +78 -> 188
    //   113: aload 9
    //   115: astore_1
    //   116: new 14	java/lang/Exception
    //   119: dup
    //   120: new 122	java/lang/StringBuilder
    //   123: dup
    //   124: invokespecial 124	java/lang/StringBuilder:<init>	()V
    //   127: ldc 174
    //   129: invokevirtual 130	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   132: aload_3
    //   133: invokevirtual 130	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   136: ldc 168
    //   138: invokevirtual 130	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   141: ldc 79
    //   143: invokevirtual 130	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   146: invokevirtual 133	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   149: invokespecial 175	java/lang/Exception:<init>	(Ljava/lang/String;)V
    //   152: athrow
    //   153: astore_2
    //   154: aconst_null
    //   155: astore_3
    //   156: aload_0
    //   157: astore_1
    //   158: aload_3
    //   159: astore_0
    //   160: ldc 70
    //   162: aload_2
    //   163: invokestatic 95	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   166: aload_0
    //   167: ifnull +7 -> 174
    //   170: aload_0
    //   171: invokevirtual 180	java/io/InputStream:close	()V
    //   174: aload_1
    //   175: ifnull +7 -> 182
    //   178: aload_1
    //   179: invokevirtual 181	java/util/zip/ZipFile:close	()V
    //   182: iconst_0
    //   183: istore 6
    //   185: iload 6
    //   187: ireturn
    //   188: aload 9
    //   190: astore_1
    //   191: aload_0
    //   192: aload 7
    //   194: invokevirtual 185	java/util/zip/ZipFile:getInputStream	(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;
    //   197: astore_3
    //   198: aload_3
    //   199: astore_1
    //   200: new 187	java/io/FileOutputStream
    //   203: dup
    //   204: aload_2
    //   205: invokespecial 190	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   208: astore 7
    //   210: aload_3
    //   211: astore_1
    //   212: sipush 4096
    //   215: newarray byte
    //   217: astore 8
    //   219: aload_3
    //   220: astore_1
    //   221: aload_3
    //   222: aload 8
    //   224: invokevirtual 194	java/io/InputStream:read	([B)I
    //   227: istore 4
    //   229: iload 4
    //   231: ifle +23 -> 254
    //   234: aload_3
    //   235: astore_1
    //   236: invokestatic 199	java/lang/Thread:yield	()V
    //   239: aload_3
    //   240: astore_1
    //   241: aload 7
    //   243: aload 8
    //   245: iconst_0
    //   246: iload 4
    //   248: invokevirtual 205	java/io/OutputStream:write	([BII)V
    //   251: goto -32 -> 219
    //   254: aload_3
    //   255: astore_1
    //   256: aload 7
    //   258: invokevirtual 206	java/io/OutputStream:close	()V
    //   261: aload_3
    //   262: astore_1
    //   263: aload_2
    //   264: iconst_1
    //   265: iconst_0
    //   266: invokevirtual 210	java/io/File:setReadable	(ZZ)Z
    //   269: pop
    //   270: aload_3
    //   271: astore_1
    //   272: aload_2
    //   273: iconst_1
    //   274: iconst_0
    //   275: invokevirtual 213	java/io/File:setExecutable	(ZZ)Z
    //   278: pop
    //   279: aload_3
    //   280: astore_1
    //   281: aload_2
    //   282: iconst_1
    //   283: invokevirtual 217	java/io/File:setWritable	(Z)Z
    //   286: pop
    //   287: aload_3
    //   288: astore_1
    //   289: aload_2
    //   290: invokevirtual 114	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   293: invokestatic 117	java/lang/System:load	(Ljava/lang/String;)V
    //   296: aload_3
    //   297: astore_1
    //   298: getstatic 85	net/hockeyapp/android/a:a	Ljava/lang/String;
    //   301: getstatic 88	org/vidogram/messenger/d:a	Z
    //   304: invokestatic 92	org/vidogram/messenger/NativeLoader:init	(Ljava/lang/String;Z)V
    //   307: aload_3
    //   308: astore_1
    //   309: iconst_1
    //   310: putstatic 10	org/vidogram/messenger/NativeLoader:a	Z
    //   313: aload_3
    //   314: ifnull +7 -> 321
    //   317: aload_3
    //   318: invokevirtual 180	java/io/InputStream:close	()V
    //   321: aload_0
    //   322: ifnull -137 -> 185
    //   325: aload_0
    //   326: invokevirtual 181	java/util/zip/ZipFile:close	()V
    //   329: iconst_1
    //   330: ireturn
    //   331: astore_0
    //   332: ldc 70
    //   334: aload_0
    //   335: invokestatic 95	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   338: iconst_1
    //   339: ireturn
    //   340: astore_2
    //   341: aload_3
    //   342: astore_1
    //   343: ldc 70
    //   345: aload_2
    //   346: invokestatic 95	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   349: goto -36 -> 313
    //   352: astore_3
    //   353: aload_0
    //   354: astore_2
    //   355: aload_3
    //   356: astore_0
    //   357: aload_1
    //   358: ifnull +7 -> 365
    //   361: aload_1
    //   362: invokevirtual 180	java/io/InputStream:close	()V
    //   365: aload_2
    //   366: ifnull +7 -> 373
    //   369: aload_2
    //   370: invokevirtual 181	java/util/zip/ZipFile:close	()V
    //   373: aload_0
    //   374: athrow
    //   375: astore_1
    //   376: ldc 70
    //   378: aload_1
    //   379: invokestatic 95	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   382: goto -61 -> 321
    //   385: astore_0
    //   386: ldc 70
    //   388: aload_0
    //   389: invokestatic 95	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   392: goto -218 -> 174
    //   395: astore_0
    //   396: ldc 70
    //   398: aload_0
    //   399: invokestatic 95	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   402: goto -220 -> 182
    //   405: astore_1
    //   406: ldc 70
    //   408: aload_1
    //   409: invokestatic 95	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   412: goto -47 -> 365
    //   415: astore_1
    //   416: ldc 70
    //   418: aload_1
    //   419: invokestatic 95	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   422: goto -49 -> 373
    //   425: astore_0
    //   426: aconst_null
    //   427: astore_2
    //   428: aload 8
    //   430: astore_1
    //   431: goto -74 -> 357
    //   434: astore_3
    //   435: aload_1
    //   436: astore_2
    //   437: aload_0
    //   438: astore_1
    //   439: aload_3
    //   440: astore_0
    //   441: goto -84 -> 357
    //   444: astore_2
    //   445: aconst_null
    //   446: astore_0
    //   447: aload 7
    //   449: astore_1
    //   450: goto -290 -> 160
    //   453: astore_2
    //   454: aload_0
    //   455: astore_1
    //   456: aload_3
    //   457: astore_0
    //   458: goto -298 -> 160
    //
    // Exception table:
    //   from	to	target	type
    //   12	21	48	java/lang/Exception
    //   31	39	48	java/lang/Exception
    //   73	108	153	java/lang/Exception
    //   116	153	153	java/lang/Exception
    //   191	198	153	java/lang/Exception
    //   325	329	331	java/lang/Exception
    //   289	296	340	java/lang/Error
    //   298	307	340	java/lang/Error
    //   309	313	340	java/lang/Error
    //   73	108	352	finally
    //   116	153	352	finally
    //   191	198	352	finally
    //   200	210	352	finally
    //   212	219	352	finally
    //   221	229	352	finally
    //   236	239	352	finally
    //   241	251	352	finally
    //   256	261	352	finally
    //   263	270	352	finally
    //   272	279	352	finally
    //   281	287	352	finally
    //   289	296	352	finally
    //   298	307	352	finally
    //   309	313	352	finally
    //   343	349	352	finally
    //   317	321	375	java/lang/Exception
    //   170	174	385	java/lang/Exception
    //   178	182	395	java/lang/Exception
    //   361	365	405	java/lang/Exception
    //   369	373	415	java/lang/Exception
    //   55	70	425	finally
    //   160	166	434	finally
    //   55	70	444	java/lang/Exception
    //   200	210	453	java/lang/Exception
    //   212	219	453	java/lang/Exception
    //   221	229	453	java/lang/Exception
    //   236	239	453	java/lang/Exception
    //   241	251	453	java/lang/Exception
    //   256	261	453	java/lang/Exception
    //   263	270	453	java/lang/Exception
    //   272	279	453	java/lang/Exception
    //   281	287	453	java/lang/Exception
    //   289	296	453	java/lang/Exception
    //   298	307	453	java/lang/Exception
    //   309	313	453	java/lang/Exception
    //   343	349	453	java/lang/Exception
  }

  private static File b(Context paramContext)
  {
    if (paramContext != null);
    while (true)
    {
      try
      {
        File localFile1 = new File((String)ApplicationInfo.class.getField("nativeLibraryDir").get(paramContext.getApplicationInfo()));
        File localFile2 = localFile1;
        if (localFile1 != null)
          continue;
        localFile2 = new File(paramContext.getApplicationInfo().dataDir, "lib");
        if (!localFile2.isDirectory())
          break;
        return localFile2;
      }
      catch (Throwable localThrowable)
      {
        localThrowable.printStackTrace();
      }
      Object localObject = null;
    }
    return null;
  }

  private static native void init(String paramString, boolean paramBoolean);
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.NativeLoader
 * JD-Core Version:    0.6.0
 */