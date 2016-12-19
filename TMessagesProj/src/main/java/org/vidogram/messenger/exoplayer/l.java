package org.vidogram.messenger.exoplayer;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.PlaybackParams;
import android.os.Handler;
import org.vidogram.messenger.exoplayer.a.a;
import org.vidogram.messenger.exoplayer.a.b.d;
import org.vidogram.messenger.exoplayer.a.b.f;
import org.vidogram.messenger.exoplayer.f.i;

@TargetApi(16)
public class l extends n
  implements k
{
  private final a c;
  private final org.vidogram.messenger.exoplayer.a.b d;
  private boolean e;
  private android.media.MediaFormat f;
  private int g;
  private int h;
  private long i;
  private boolean j;
  private boolean k;
  private long l;

  public l(t paramt, m paramm, org.vidogram.messenger.exoplayer.b.b paramb, boolean paramBoolean, Handler paramHandler, a parama, a parama1, int paramInt)
  {
    this(new t[] { paramt }, paramm, paramb, paramBoolean, paramHandler, parama, parama1, paramInt);
  }

  public l(t[] paramArrayOft, m paramm, org.vidogram.messenger.exoplayer.b.b paramb, boolean paramBoolean, Handler paramHandler, a parama, a parama1, int paramInt)
  {
    super(paramArrayOft, paramm, paramb, paramBoolean, paramHandler, parama);
    this.c = parama;
    this.h = 0;
    this.d = new org.vidogram.messenger.exoplayer.a.b(parama1, paramInt);
  }

  private void a(int paramInt, long paramLong1, long paramLong2)
  {
    if ((this.b != null) && (this.c != null))
      this.b.post(new Runnable(paramInt, paramLong1, paramLong2)
      {
        public void run()
        {
          l.a(l.this).a(this.a, this.b, this.c);
        }
      });
  }

  private void a(b.d paramd)
  {
    if ((this.b != null) && (this.c != null))
      this.b.post(new Runnable(paramd)
      {
        public void run()
        {
          l.a(l.this).a(this.a);
        }
      });
  }

  private void a(b.f paramf)
  {
    if ((this.b != null) && (this.c != null))
      this.b.post(new Runnable(paramf)
      {
        public void run()
        {
          l.a(l.this).a(this.a);
        }
      });
  }

  public long a()
  {
    long l1 = this.d.a(b());
    if (l1 != -9223372036854775808L)
      if (!this.j)
        break label42;
    while (true)
    {
      this.i = l1;
      this.j = false;
      return this.i;
      label42: l1 = Math.max(this.i, l1);
    }
  }

  protected e a(m paramm, String paramString, boolean paramBoolean)
  {
    if (a(paramString))
    {
      e locale = paramm.a();
      if (locale != null)
      {
        this.e = true;
        return locale;
      }
    }
    this.e = false;
    return super.a(paramm, paramString, paramBoolean);
  }

  public void a(int paramInt, Object paramObject)
  {
    switch (paramInt)
    {
    default:
      super.a(paramInt, paramObject);
      return;
    case 1:
      this.d.a(((Float)paramObject).floatValue());
      return;
    case 2:
    }
    this.d.a((PlaybackParams)paramObject);
  }

  protected void a(MediaCodec paramMediaCodec, android.media.MediaFormat paramMediaFormat)
  {
    int m;
    if (this.f != null)
    {
      m = 1;
      if (m == 0)
        break label68;
    }
    label68: for (paramMediaCodec = this.f.getString("mime"); ; paramMediaCodec = "audio/raw")
    {
      if (m != 0)
        paramMediaFormat = this.f;
      m = paramMediaFormat.getInteger("channel-count");
      int n = paramMediaFormat.getInteger("sample-rate");
      this.d.a(paramMediaCodec, m, n, this.g);
      return;
      m = 0;
      break;
    }
  }

  protected void a(MediaCodec paramMediaCodec, boolean paramBoolean, android.media.MediaFormat paramMediaFormat, MediaCrypto paramMediaCrypto)
  {
    String str = paramMediaFormat.getString("mime");
    if (this.e)
    {
      paramMediaFormat.setString("mime", "audio/raw");
      paramMediaCodec.configure(paramMediaFormat, null, paramMediaCrypto, 0);
      paramMediaFormat.setString("mime", str);
      this.f = paramMediaFormat;
      return;
    }
    paramMediaCodec.configure(paramMediaFormat, null, paramMediaCrypto, 0);
    this.f = null;
  }

  protected void a(q paramq)
  {
    super.a(paramq);
    if ("audio/raw".equals(paramq.a.b));
    for (int m = paramq.a.p; ; m = 2)
    {
      this.g = m;
      return;
    }
  }

  // ERROR //
  protected boolean a(long paramLong1, long paramLong2, MediaCodec paramMediaCodec, java.nio.ByteBuffer paramByteBuffer, android.media.MediaCodec.BufferInfo paramBufferInfo, int paramInt, boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 109	org/vidogram/messenger/exoplayer/l:e	Z
    //   4: ifeq +23 -> 27
    //   7: aload 7
    //   9: getfield 197	android/media/MediaCodec$BufferInfo:flags	I
    //   12: iconst_2
    //   13: iand
    //   14: ifeq +13 -> 27
    //   17: aload 5
    //   19: iload 8
    //   21: iconst_0
    //   22: invokevirtual 201	android/media/MediaCodec:releaseOutputBuffer	(IZ)V
    //   25: iconst_1
    //   26: ireturn
    //   27: iload 9
    //   29: ifeq +38 -> 67
    //   32: aload 5
    //   34: iload 8
    //   36: iconst_0
    //   37: invokevirtual 201	android/media/MediaCodec:releaseOutputBuffer	(IZ)V
    //   40: aload_0
    //   41: getfield 204	org/vidogram/messenger/exoplayer/l:a	Lorg/vidogram/messenger/exoplayer/c;
    //   44: astore 5
    //   46: aload 5
    //   48: aload 5
    //   50: getfield 207	org/vidogram/messenger/exoplayer/c:g	I
    //   53: iconst_1
    //   54: iadd
    //   55: putfield 207	org/vidogram/messenger/exoplayer/c:g	I
    //   58: aload_0
    //   59: getfield 56	org/vidogram/messenger/exoplayer/l:d	Lorg/vidogram/messenger/exoplayer/a/b;
    //   62: invokevirtual 210	org/vidogram/messenger/exoplayer/a/b:f	()V
    //   65: iconst_1
    //   66: ireturn
    //   67: aload_0
    //   68: getfield 56	org/vidogram/messenger/exoplayer/l:d	Lorg/vidogram/messenger/exoplayer/a/b;
    //   71: invokevirtual 212	org/vidogram/messenger/exoplayer/a/b:a	()Z
    //   74: ifne +166 -> 240
    //   77: aload_0
    //   78: getfield 49	org/vidogram/messenger/exoplayer/l:h	I
    //   81: ifeq +119 -> 200
    //   84: aload_0
    //   85: getfield 56	org/vidogram/messenger/exoplayer/l:d	Lorg/vidogram/messenger/exoplayer/a/b;
    //   88: aload_0
    //   89: getfield 49	org/vidogram/messenger/exoplayer/l:h	I
    //   92: invokevirtual 215	org/vidogram/messenger/exoplayer/a/b:a	(I)I
    //   95: pop
    //   96: aload_0
    //   97: iconst_0
    //   98: putfield 217	org/vidogram/messenger/exoplayer/l:k	Z
    //   101: aload_0
    //   102: invokevirtual 221	org/vidogram/messenger/exoplayer/l:u	()I
    //   105: iconst_3
    //   106: if_icmpne +10 -> 116
    //   109: aload_0
    //   110: getfield 56	org/vidogram/messenger/exoplayer/l:d	Lorg/vidogram/messenger/exoplayer/a/b;
    //   113: invokevirtual 223	org/vidogram/messenger/exoplayer/a/b:e	()V
    //   116: aload_0
    //   117: getfield 56	org/vidogram/messenger/exoplayer/l:d	Lorg/vidogram/messenger/exoplayer/a/b;
    //   120: aload 6
    //   122: aload 7
    //   124: getfield 226	android/media/MediaCodec$BufferInfo:offset	I
    //   127: aload 7
    //   129: getfield 229	android/media/MediaCodec$BufferInfo:size	I
    //   132: aload 7
    //   134: getfield 232	android/media/MediaCodec$BufferInfo:presentationTimeUs	J
    //   137: invokevirtual 235	org/vidogram/messenger/exoplayer/a/b:a	(Ljava/nio/ByteBuffer;IIJ)I
    //   140: istore 10
    //   142: aload_0
    //   143: invokestatic 240	android/os/SystemClock:elapsedRealtime	()J
    //   146: putfield 242	org/vidogram/messenger/exoplayer/l:l	J
    //   149: iload 10
    //   151: iconst_1
    //   152: iand
    //   153: ifeq +12 -> 165
    //   156: aload_0
    //   157: invokevirtual 244	org/vidogram/messenger/exoplayer/l:l	()V
    //   160: aload_0
    //   161: iconst_1
    //   162: putfield 90	org/vidogram/messenger/exoplayer/l:j	Z
    //   165: iload 10
    //   167: iconst_2
    //   168: iand
    //   169: ifeq +184 -> 353
    //   172: aload 5
    //   174: iload 8
    //   176: iconst_0
    //   177: invokevirtual 201	android/media/MediaCodec:releaseOutputBuffer	(IZ)V
    //   180: aload_0
    //   181: getfield 204	org/vidogram/messenger/exoplayer/l:a	Lorg/vidogram/messenger/exoplayer/c;
    //   184: astore 5
    //   186: aload 5
    //   188: aload 5
    //   190: getfield 246	org/vidogram/messenger/exoplayer/c:f	I
    //   193: iconst_1
    //   194: iadd
    //   195: putfield 246	org/vidogram/messenger/exoplayer/c:f	I
    //   198: iconst_1
    //   199: ireturn
    //   200: aload_0
    //   201: aload_0
    //   202: getfield 56	org/vidogram/messenger/exoplayer/l:d	Lorg/vidogram/messenger/exoplayer/a/b;
    //   205: invokevirtual 248	org/vidogram/messenger/exoplayer/a/b:b	()I
    //   208: putfield 49	org/vidogram/messenger/exoplayer/l:h	I
    //   211: aload_0
    //   212: aload_0
    //   213: getfield 49	org/vidogram/messenger/exoplayer/l:h	I
    //   216: invokevirtual 251	org/vidogram/messenger/exoplayer/l:b	(I)V
    //   219: goto -123 -> 96
    //   222: astore 5
    //   224: aload_0
    //   225: aload 5
    //   227: invokespecial 253	org/vidogram/messenger/exoplayer/l:a	(Lorg/vidogram/messenger/exoplayer/a/b$d;)V
    //   230: new 255	org/vidogram/messenger/exoplayer/g
    //   233: dup
    //   234: aload 5
    //   236: invokespecial 258	org/vidogram/messenger/exoplayer/g:<init>	(Ljava/lang/Throwable;)V
    //   239: athrow
    //   240: aload_0
    //   241: getfield 217	org/vidogram/messenger/exoplayer/l:k	Z
    //   244: istore 9
    //   246: aload_0
    //   247: aload_0
    //   248: getfield 56	org/vidogram/messenger/exoplayer/l:d	Lorg/vidogram/messenger/exoplayer/a/b;
    //   251: invokevirtual 260	org/vidogram/messenger/exoplayer/a/b:h	()Z
    //   254: putfield 217	org/vidogram/messenger/exoplayer/l:k	Z
    //   257: iload 9
    //   259: ifeq -143 -> 116
    //   262: aload_0
    //   263: getfield 217	org/vidogram/messenger/exoplayer/l:k	Z
    //   266: ifne -150 -> 116
    //   269: aload_0
    //   270: invokevirtual 221	org/vidogram/messenger/exoplayer/l:u	()I
    //   273: iconst_3
    //   274: if_icmpne -158 -> 116
    //   277: invokestatic 240	android/os/SystemClock:elapsedRealtime	()J
    //   280: lstore_3
    //   281: aload_0
    //   282: getfield 242	org/vidogram/messenger/exoplayer/l:l	J
    //   285: lstore 11
    //   287: aload_0
    //   288: getfield 56	org/vidogram/messenger/exoplayer/l:d	Lorg/vidogram/messenger/exoplayer/a/b;
    //   291: invokevirtual 262	org/vidogram/messenger/exoplayer/a/b:d	()J
    //   294: lstore_1
    //   295: lload_1
    //   296: ldc2_w 263
    //   299: lcmp
    //   300: ifne +26 -> 326
    //   303: ldc2_w 263
    //   306: lstore_1
    //   307: aload_0
    //   308: aload_0
    //   309: getfield 56	org/vidogram/messenger/exoplayer/l:d	Lorg/vidogram/messenger/exoplayer/a/b;
    //   312: invokevirtual 266	org/vidogram/messenger/exoplayer/a/b:c	()I
    //   315: lload_1
    //   316: lload_3
    //   317: lload 11
    //   319: lsub
    //   320: invokespecial 268	org/vidogram/messenger/exoplayer/l:a	(IJJ)V
    //   323: goto -207 -> 116
    //   326: lload_1
    //   327: ldc2_w 269
    //   330: ldiv
    //   331: lstore_1
    //   332: goto -25 -> 307
    //   335: astore 5
    //   337: aload_0
    //   338: aload 5
    //   340: invokespecial 272	org/vidogram/messenger/exoplayer/l:a	(Lorg/vidogram/messenger/exoplayer/a/b$f;)V
    //   343: new 255	org/vidogram/messenger/exoplayer/g
    //   346: dup
    //   347: aload 5
    //   349: invokespecial 258	org/vidogram/messenger/exoplayer/g:<init>	(Ljava/lang/Throwable;)V
    //   352: athrow
    //   353: iconst_0
    //   354: ireturn
    //
    // Exception table:
    //   from	to	target	type
    //   77	96	222	org/vidogram/messenger/exoplayer/a/b$d
    //   96	101	222	org/vidogram/messenger/exoplayer/a/b$d
    //   200	219	222	org/vidogram/messenger/exoplayer/a/b$d
    //   116	149	335	org/vidogram/messenger/exoplayer/a/b$f
  }

  protected boolean a(String paramString)
  {
    return this.d.a(paramString);
  }

  protected boolean a(m paramm, MediaFormat paramMediaFormat)
  {
    int n = 0;
    paramMediaFormat = paramMediaFormat.b;
    int m = n;
    if (i.a(paramMediaFormat))
      if ((!"audio/x-unknown".equals(paramMediaFormat)) && ((!a(paramMediaFormat)) || (paramm.a() == null)))
      {
        m = n;
        if (paramm.a(paramMediaFormat, false) == null);
      }
      else
      {
        m = 1;
      }
    return m;
  }

  protected void b(int paramInt)
  {
  }

  protected boolean b()
  {
    return (super.b()) && (!this.d.h());
  }

  protected void c(long paramLong)
  {
    super.c(paramLong);
    this.d.j();
    this.i = paramLong;
    this.j = true;
  }

  protected boolean c()
  {
    return (this.d.h()) || (super.c());
  }

  protected k g()
  {
    return this;
  }

  protected void h()
  {
    super.h();
    this.d.e();
  }

  protected void i()
  {
    this.d.i();
    super.i();
  }

  protected void j()
  {
    this.h = 0;
    try
    {
      this.d.k();
      return;
    }
    finally
    {
      super.j();
    }
    throw localObject;
  }

  protected void k()
  {
    this.d.g();
  }

  protected void l()
  {
  }

  public static abstract interface a extends n.b
  {
    public abstract void a(int paramInt, long paramLong1, long paramLong2);

    public abstract void a(b.d paramd);

    public abstract void a(b.f paramf);
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.exoplayer.l
 * JD-Core Version:    0.6.0
 */