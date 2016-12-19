package org.vidogram.messenger.f;

import android.annotation.TargetApi;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaFormat;
import com.a.a.a.h;
import com.a.a.a.j;
import com.a.a.a.k;
import com.a.a.a.l;
import com.a.a.a.m;
import com.a.a.a.n;
import com.a.a.a.o;
import com.a.a.a.q;
import com.a.a.a.r;
import com.a.a.a.s;
import com.a.a.a.s.a;
import com.a.a.a.u;
import com.a.a.a.v;
import com.a.a.a.w;
import com.a.a.a.w.a;
import com.a.a.a.x;
import com.a.a.a.y;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@TargetApi(16)
public class b
{
  private a a = null;
  private c b = null;
  private FileOutputStream c = null;
  private FileChannel d = null;
  private long e = 0L;
  private long f = 0L;
  private boolean g = true;
  private HashMap<g, long[]> h = new HashMap();
  private ByteBuffer i = null;

  public static long a(long paramLong1, long paramLong2)
  {
    if (paramLong2 == 0L)
      return paramLong1;
    return a(paramLong2, paramLong1 % paramLong2);
  }

  private void b()
  {
    long l = this.d.position();
    this.d.position(this.a.d());
    this.a.a(this.d);
    this.d.position(l);
    this.a.a(0L);
    this.a.b(0L);
    this.c.flush();
  }

  public int a(MediaFormat paramMediaFormat, boolean paramBoolean)
  {
    return this.b.a(paramMediaFormat, paramBoolean);
  }

  protected com.a.a.a.b a(g paramg)
  {
    r localr = new r();
    a(paramg, localr);
    b(paramg, localr);
    c(paramg, localr);
    d(paramg, localr);
    e(paramg, localr);
    f(paramg, localr);
    return localr;
  }

  protected h a()
  {
    LinkedList localLinkedList = new LinkedList();
    localLinkedList.add("isom");
    localLinkedList.add("3gp4");
    return new h("isom", 0L, localLinkedList);
  }

  protected x a(g paramg, c paramc)
  {
    x localx = new x();
    Object localObject1 = new y();
    ((y)localObject1).a(true);
    ((y)localObject1).b(true);
    ((y)localObject1).c(true);
    Object localObject2;
    if (paramg.n())
    {
      ((y)localObject1).a(com.b.a.b.g.j);
      ((y)localObject1).b(0);
      ((y)localObject1).a(paramg.i());
      ((y)localObject1).b(paramg.c() * b(paramc) / paramg.h());
      ((y)localObject1).b(paramg.k());
      ((y)localObject1).a(paramg.j());
      ((y)localObject1).a(0);
      ((y)localObject1).b(new Date());
      ((y)localObject1).a(paramg.a() + 1L);
      ((y)localObject1).a(paramg.l());
      localx.a((com.a.a.a.b)localObject1);
      localObject1 = new k();
      localx.a((com.a.a.a.b)localObject1);
      paramc = new l();
      paramc.a(paramg.i());
      paramc.b(paramg.c());
      paramc.a(paramg.h());
      paramc.a("eng");
      ((k)localObject1).a(paramc);
      localObject2 = new j();
      if (!paramg.n())
        break label349;
    }
    label349: for (paramc = "SoundHandle"; ; paramc = "VideoHandle")
    {
      ((j)localObject2).a(paramc);
      ((j)localObject2).b(paramg.d());
      ((k)localObject1).a((com.a.a.a.b)localObject2);
      paramc = new m();
      paramc.a(paramg.e());
      localObject2 = new com.a.a.a.f();
      com.a.a.a.g localg = new com.a.a.a.g();
      ((com.a.a.a.f)localObject2).a(localg);
      com.a.a.a.e locale = new com.a.a.a.e();
      locale.d(1);
      localg.a(locale);
      paramc.a((com.a.a.a.b)localObject2);
      paramc.a(a(paramg));
      ((k)localObject1).a(paramc);
      return localx;
      ((y)localObject1).a(paramc.a());
      break;
    }
  }

  public b a(c paramc)
  {
    this.b = paramc;
    this.c = new FileOutputStream(paramc.c());
    this.d = this.c.getChannel();
    paramc = a();
    paramc.a(this.d);
    long l = this.e;
    this.e = (paramc.b() + l);
    this.f += this.e;
    this.a = new a(null);
    this.i = ByteBuffer.allocateDirect(4);
    return this;
  }

  protected void a(g paramg, r paramr)
  {
    paramr.a(paramg.f());
  }

  public void a(boolean paramBoolean)
  {
    if (this.a.e() != 0L)
      b();
    Iterator localIterator = this.b.b().iterator();
    while (localIterator.hasNext())
    {
      g localg = (g)localIterator.next();
      ArrayList localArrayList = localg.b();
      long[] arrayOfLong = new long[localArrayList.size()];
      int j = 0;
      while (j < arrayOfLong.length)
      {
        arrayOfLong[j] = ((e)localArrayList.get(j)).b();
        j += 1;
      }
      this.h.put(localg, arrayOfLong);
    }
    c(this.b).a(this.d);
    this.c.flush();
    this.d.close();
    this.c.close();
  }

  public boolean a(int paramInt, ByteBuffer paramByteBuffer, MediaCodec.BufferInfo paramBufferInfo, boolean paramBoolean)
  {
    int k = 1;
    if (this.g)
    {
      this.a.b(0L);
      this.a.a(this.d);
      this.a.a(this.e);
      this.e += 16L;
      this.f += 16L;
      this.g = false;
    }
    this.a.b(this.a.e() + paramBufferInfo.size);
    this.f += paramBufferInfo.size;
    if (this.f >= 32768L)
    {
      b();
      this.g = true;
      this.f -= 32768L;
    }
    while (true)
    {
      this.b.a(paramInt, this.e, paramBufferInfo);
      int j = paramBufferInfo.offset;
      if (paramBoolean);
      for (paramInt = 0; ; paramInt = 4)
      {
        paramByteBuffer.position(paramInt + j);
        paramByteBuffer.limit(paramBufferInfo.offset + paramBufferInfo.size);
        if (!paramBoolean)
        {
          this.i.position(0);
          this.i.putInt(paramBufferInfo.size - 4);
          this.i.position(0);
          this.d.write(this.i);
        }
        this.d.write(paramByteBuffer);
        this.e += paramBufferInfo.size;
        if (k != 0)
          this.c.flush();
        return k;
      }
      k = 0;
    }
  }

  public long b(c paramc)
  {
    long l = 0L;
    if (!paramc.b().isEmpty())
      l = ((g)paramc.b().iterator().next()).h();
    paramc = paramc.b().iterator();
    while (paramc.hasNext())
      l = a(((g)paramc.next()).h(), l);
    return l;
  }

  protected void b(g paramg, r paramr)
  {
    Object localObject = null;
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = paramg.m().iterator();
    paramg = localObject;
    if (localIterator.hasNext())
    {
      long l = ((Long)localIterator.next()).longValue();
      if ((paramg != null) && (paramg.b() == l))
        paramg.a(paramg.a() + 1L);
      while (true)
      {
        break;
        paramg = new w.a(1L, l);
        localArrayList.add(paramg);
      }
    }
    paramg = new w();
    paramg.a(localArrayList);
    paramr.a(paramg);
  }

  protected n c(c paramc)
  {
    n localn = new n();
    Object localObject = new o();
    ((o)localObject).a(new Date());
    ((o)localObject).b(new Date());
    ((o)localObject).a(com.b.a.b.g.j);
    long l3 = b(paramc);
    Iterator localIterator = paramc.b().iterator();
    long l1 = 0L;
    if (localIterator.hasNext())
    {
      g localg = (g)localIterator.next();
      long l2 = localg.c() * l3 / localg.h();
      if (l2 <= l1)
        break label200;
      l1 = l2;
    }
    label200: 
    while (true)
    {
      break;
      ((o)localObject).b(l1);
      ((o)localObject).a(l3);
      ((o)localObject).c(paramc.b().size() + 1);
      localn.a((com.a.a.a.b)localObject);
      localObject = paramc.b().iterator();
      while (((Iterator)localObject).hasNext())
        localn.a(a((g)((Iterator)localObject).next(), paramc));
      return localn;
    }
  }

  protected void c(g paramg, r paramr)
  {
    paramg = paramg.g();
    if ((paramg != null) && (paramg.length > 0))
    {
      v localv = new v();
      localv.a(paramg);
      paramr.a(localv);
    }
  }

  protected void d(g paramg, r paramr)
  {
    s locals = new s();
    locals.a(new LinkedList());
    int k = 1;
    int m = 0;
    int j = -1;
    int i3 = paramg.b().size();
    int n = 0;
    int i1;
    if (n < i3)
    {
      e locale = (e)paramg.b().get(n);
      long l1 = locale.a();
      long l2 = locale.b();
      i1 = m + 1;
      if (n != i3 - 1)
      {
        if (l1 + l2 == ((e)paramg.b().get(n + 1)).a())
          break label228;
        m = 1;
      }
    }
    while (true)
    {
      label120: int i2;
      if (m != 0)
        if (j != i1)
        {
          locals.e().add(new s.a(k, i1, 1L));
          j = i1;
          label159: m = 0;
          i2 = k + 1;
          k = m;
          m = i2;
        }
      while (true)
      {
        i2 = n + 1;
        n = m;
        m = k;
        k = n;
        n = i2;
        break;
        m = 1;
        break label120;
        paramr.a(locals);
        return;
        break label159;
        m = k;
        k = i2;
      }
      label228: m = 0;
    }
  }

  protected void e(g paramg, r paramr)
  {
    q localq = new q();
    localq.a((long[])this.h.get(paramg));
    paramr.a(localq);
  }

  protected void f(g paramg, r paramr)
  {
    Object localObject = new ArrayList();
    paramg = paramg.b().iterator();
    long l1 = -1L;
    while (paramg.hasNext())
    {
      e locale = (e)paramg.next();
      long l3 = locale.a();
      long l2 = l1;
      if (l1 != -1L)
      {
        l2 = l1;
        if (l1 != l3)
          l2 = -1L;
      }
      if (l2 == -1L)
        ((ArrayList)localObject).add(Long.valueOf(l3));
      l1 = locale.b() + l3;
    }
    paramg = new long[((ArrayList)localObject).size()];
    int j = 0;
    while (j < ((ArrayList)localObject).size())
    {
      paramg[j] = ((Long)((ArrayList)localObject).get(j)).longValue();
      j += 1;
    }
    localObject = new u();
    ((u)localObject).a(paramg);
    paramr.a((com.a.a.a.b)localObject);
  }

  private class a
    implements com.a.a.a.b
  {
    private com.a.a.a.d b;
    private long c = 1073741824L;
    private long d = 0L;

    private a()
    {
    }

    private boolean c(long paramLong)
    {
      return 8L + paramLong < 4294967296L;
    }

    public com.a.a.a.d a()
    {
      return this.b;
    }

    public void a(long paramLong)
    {
      this.d = paramLong;
    }

    public void a(com.a.a.a.d paramd)
    {
      this.b = paramd;
    }

    public void a(com.b.a.e parame, ByteBuffer paramByteBuffer, long paramLong, com.a.a.b paramb)
    {
    }

    public void a(WritableByteChannel paramWritableByteChannel)
    {
      ByteBuffer localByteBuffer = ByteBuffer.allocate(16);
      long l = b();
      if (c(l))
      {
        com.a.a.f.b(localByteBuffer, l);
        localByteBuffer.put(com.a.a.d.a("mdat"));
        if (!c(l))
          break label80;
        localByteBuffer.put(new byte[8]);
      }
      while (true)
      {
        localByteBuffer.rewind();
        paramWritableByteChannel.write(localByteBuffer);
        return;
        com.a.a.f.b(localByteBuffer, 1L);
        break;
        label80: com.a.a.f.a(localByteBuffer, l);
      }
    }

    public long b()
    {
      return 16L + this.c;
    }

    public void b(long paramLong)
    {
      this.c = paramLong;
    }

    public String c()
    {
      return "mdat";
    }

    public long d()
    {
      return this.d;
    }

    public long e()
    {
      return this.c;
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.f.b
 * JD-Core Version:    0.6.0
 */