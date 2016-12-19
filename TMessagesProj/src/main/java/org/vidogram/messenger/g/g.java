package org.vidogram.messenger.g;

import android.annotation.TargetApi;
import android.net.TrafficStats;
import android.os.Build.VERSION;
import java.util.concurrent.BlockingQueue;

public class g extends Thread
{
  private final BlockingQueue<l<?>> a;
  private final f b;
  private final b c;
  private final o d;
  private volatile boolean e = false;

  public g(BlockingQueue<l<?>> paramBlockingQueue, f paramf, b paramb, o paramo)
  {
    this.a = paramBlockingQueue;
    this.b = paramf;
    this.c = paramb;
    this.d = paramo;
  }

  @TargetApi(14)
  private void a(l<?> paraml)
  {
    if (Build.VERSION.SDK_INT >= 14)
      TrafficStats.setThreadStatsTag(paraml.c());
  }

  private void a(l<?> paraml, s params)
  {
    params = paraml.a(params);
    this.d.a(paraml, params);
  }

  public void a()
  {
    this.e = true;
    interrupt();
  }

  // ERROR //
  public void run()
  {
    // Byte code:
    //   0: bipush 10
    //   2: invokestatic 80	android/os/Process:setThreadPriority	(I)V
    //   5: invokestatic 86	android/os/SystemClock:elapsedRealtime	()J
    //   8: lstore_1
    //   9: aload_0
    //   10: getfield 24	org/vidogram/messenger/g/g:a	Ljava/util/concurrent/BlockingQueue;
    //   13: invokeinterface 92 1 0
    //   18: checkcast 45	org/vidogram/messenger/g/l
    //   21: astore_3
    //   22: aload_3
    //   23: ldc 94
    //   25: invokevirtual 97	org/vidogram/messenger/g/l:a	(Ljava/lang/String;)V
    //   28: aload_3
    //   29: invokevirtual 101	org/vidogram/messenger/g/l:h	()Z
    //   32: ifeq +43 -> 75
    //   35: aload_3
    //   36: ldc 103
    //   38: invokevirtual 105	org/vidogram/messenger/g/l:b	(Ljava/lang/String;)V
    //   41: goto -36 -> 5
    //   44: astore 4
    //   46: aload 4
    //   48: invokestatic 86	android/os/SystemClock:elapsedRealtime	()J
    //   51: lload_1
    //   52: lsub
    //   53: invokevirtual 108	org/vidogram/messenger/g/s:a	(J)V
    //   56: aload_0
    //   57: aload_3
    //   58: aload 4
    //   60: invokespecial 109	org/vidogram/messenger/g/g:a	(Lorg/vidogram/messenger/g/l;Lorg/vidogram/messenger/g/s;)V
    //   63: goto -58 -> 5
    //   66: astore_3
    //   67: aload_0
    //   68: getfield 22	org/vidogram/messenger/g/g:e	Z
    //   71: ifeq -66 -> 5
    //   74: return
    //   75: aload_0
    //   76: aload_3
    //   77: invokespecial 111	org/vidogram/messenger/g/g:a	(Lorg/vidogram/messenger/g/l;)V
    //   80: aload_0
    //   81: getfield 26	org/vidogram/messenger/g/g:b	Lorg/vidogram/messenger/g/f;
    //   84: aload_3
    //   85: invokeinterface 116 2 0
    //   90: astore 4
    //   92: aload_3
    //   93: ldc 118
    //   95: invokevirtual 97	org/vidogram/messenger/g/l:a	(Ljava/lang/String;)V
    //   98: aload 4
    //   100: getfield 122	org/vidogram/messenger/g/i:d	Z
    //   103: ifeq +76 -> 179
    //   106: aload_3
    //   107: invokevirtual 125	org/vidogram/messenger/g/l:w	()Z
    //   110: ifeq +69 -> 179
    //   113: aload_3
    //   114: ldc 127
    //   116: invokevirtual 105	org/vidogram/messenger/g/l:b	(Ljava/lang/String;)V
    //   119: goto -114 -> 5
    //   122: astore 4
    //   124: aload 4
    //   126: ldc 129
    //   128: iconst_1
    //   129: anewarray 131	java/lang/Object
    //   132: dup
    //   133: iconst_0
    //   134: aload 4
    //   136: invokevirtual 135	java/lang/Exception:toString	()Ljava/lang/String;
    //   139: aastore
    //   140: invokestatic 140	org/vidogram/messenger/g/t:a	(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   143: new 73	org/vidogram/messenger/g/s
    //   146: dup
    //   147: aload 4
    //   149: invokespecial 143	org/vidogram/messenger/g/s:<init>	(Ljava/lang/Throwable;)V
    //   152: astore 4
    //   154: aload 4
    //   156: invokestatic 86	android/os/SystemClock:elapsedRealtime	()J
    //   159: lload_1
    //   160: lsub
    //   161: invokevirtual 108	org/vidogram/messenger/g/s:a	(J)V
    //   164: aload_0
    //   165: getfield 30	org/vidogram/messenger/g/g:d	Lorg/vidogram/messenger/g/o;
    //   168: aload_3
    //   169: aload 4
    //   171: invokeinterface 64 3 0
    //   176: goto -171 -> 5
    //   179: aload_3
    //   180: aload 4
    //   182: invokevirtual 146	org/vidogram/messenger/g/l:a	(Lorg/vidogram/messenger/g/i;)Lorg/vidogram/messenger/g/n;
    //   185: astore 4
    //   187: aload_3
    //   188: ldc 148
    //   190: invokevirtual 97	org/vidogram/messenger/g/l:a	(Ljava/lang/String;)V
    //   193: aload_3
    //   194: invokevirtual 151	org/vidogram/messenger/g/l:r	()Z
    //   197: ifeq +35 -> 232
    //   200: aload 4
    //   202: getfield 156	org/vidogram/messenger/g/n:b	Lorg/vidogram/messenger/g/b$a;
    //   205: ifnull +27 -> 232
    //   208: aload_0
    //   209: getfield 28	org/vidogram/messenger/g/g:c	Lorg/vidogram/messenger/g/b;
    //   212: aload_3
    //   213: invokevirtual 158	org/vidogram/messenger/g/l:e	()Ljava/lang/String;
    //   216: aload 4
    //   218: getfield 156	org/vidogram/messenger/g/n:b	Lorg/vidogram/messenger/g/b$a;
    //   221: invokeinterface 163 3 0
    //   226: aload_3
    //   227: ldc 165
    //   229: invokevirtual 97	org/vidogram/messenger/g/l:a	(Ljava/lang/String;)V
    //   232: aload_3
    //   233: invokevirtual 168	org/vidogram/messenger/g/l:v	()V
    //   236: aload_0
    //   237: getfield 30	org/vidogram/messenger/g/g:d	Lorg/vidogram/messenger/g/o;
    //   240: aload_3
    //   241: aload 4
    //   243: invokeinterface 171 3 0
    //   248: goto -243 -> 5
    //
    // Exception table:
    //   from	to	target	type
    //   22	41	44	org/vidogram/messenger/g/s
    //   75	119	44	org/vidogram/messenger/g/s
    //   179	232	44	org/vidogram/messenger/g/s
    //   232	248	44	org/vidogram/messenger/g/s
    //   9	22	66	java/lang/InterruptedException
    //   22	41	122	java/lang/Exception
    //   75	119	122	java/lang/Exception
    //   179	232	122	java/lang/Exception
    //   232	248	122	java/lang/Exception
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.g.g
 * JD-Core Version:    0.6.0
 */