package org.vidogram.messenger.f;

import android.annotation.TargetApi;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaFormat;
import com.a.a.a.a.d;
import com.a.a.a.p;
import com.a.a.a.t;
import com.a.a.a.z;
import com.b.a.a.a.a.h;
import com.b.a.a.a.a.n;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@TargetApi(16)
public class g
{
  private static Map<Integer, Integer> o = new HashMap();
  private long a = 0L;
  private ArrayList<e> b = new ArrayList();
  private long c = 0L;
  private String d;
  private com.a.a.a.a e = null;
  private p f = null;
  private LinkedList<Integer> g = null;
  private int h;
  private Date i = new Date();
  private int j;
  private int k;
  private float l = 0.0F;
  private ArrayList<Long> m = new ArrayList();
  private boolean n = false;
  private long p = 0L;
  private boolean q = true;

  static
  {
    o.put(Integer.valueOf(96000), Integer.valueOf(0));
    o.put(Integer.valueOf(88200), Integer.valueOf(1));
    o.put(Integer.valueOf(64000), Integer.valueOf(2));
    o.put(Integer.valueOf(48000), Integer.valueOf(3));
    o.put(Integer.valueOf(44100), Integer.valueOf(4));
    o.put(Integer.valueOf(32000), Integer.valueOf(5));
    o.put(Integer.valueOf(24000), Integer.valueOf(6));
    o.put(Integer.valueOf(22050), Integer.valueOf(7));
    o.put(Integer.valueOf(16000), Integer.valueOf(8));
    o.put(Integer.valueOf(12000), Integer.valueOf(9));
    o.put(Integer.valueOf(11025), Integer.valueOf(10));
    o.put(Integer.valueOf(8000), Integer.valueOf(11));
  }

  public g(int paramInt, MediaFormat paramMediaFormat, boolean paramBoolean)
  {
    this.a = paramInt;
    this.n = paramBoolean;
    if (!this.n)
    {
      this.m.add(Long.valueOf(3015L));
      this.c = 3015L;
      this.k = paramMediaFormat.getInteger("width");
      this.j = paramMediaFormat.getInteger("height");
      this.h = 90000;
      this.g = new LinkedList();
      this.d = "vide";
      this.e = new z();
      this.f = new p();
      localObject1 = paramMediaFormat.getString("mime");
      if (((String)localObject1).equals("video/avc"))
      {
        localObject1 = new d("avc1");
        ((d)localObject1).a(1);
        ((d)localObject1).e(24);
        ((d)localObject1).d(1);
        ((d)localObject1).a(72.0D);
        ((d)localObject1).b(72.0D);
        ((d)localObject1).b(this.k);
        ((d)localObject1).c(this.j);
        localObject2 = new com.c.a.a.a();
        if (paramMediaFormat.getByteBuffer("csd-0") != null)
        {
          localObject3 = new ArrayList();
          localObject4 = paramMediaFormat.getByteBuffer("csd-0");
          ((ByteBuffer)localObject4).position(4);
          byte[] arrayOfByte = new byte[((ByteBuffer)localObject4).remaining()];
          ((ByteBuffer)localObject4).get(arrayOfByte);
          ((ArrayList)localObject3).add(arrayOfByte);
          localObject4 = new ArrayList();
          paramMediaFormat = paramMediaFormat.getByteBuffer("csd-1");
          paramMediaFormat.position(4);
          arrayOfByte = new byte[paramMediaFormat.remaining()];
          paramMediaFormat.get(arrayOfByte);
          ((ArrayList)localObject4).add(arrayOfByte);
          ((com.c.a.a.a)localObject2).a((List)localObject3);
          ((com.c.a.a.a)localObject2).b((List)localObject4);
        }
        ((com.c.a.a.a)localObject2).d(13);
        ((com.c.a.a.a)localObject2).b(100);
        ((com.c.a.a.a)localObject2).g(-1);
        ((com.c.a.a.a)localObject2).h(-1);
        ((com.c.a.a.a)localObject2).f(-1);
        ((com.c.a.a.a)localObject2).a(1);
        ((com.c.a.a.a)localObject2).e(3);
        ((com.c.a.a.a)localObject2).c(0);
        ((d)localObject1).a((com.a.a.a.b)localObject2);
        this.f.a((com.a.a.a.b)localObject1);
      }
      do
        return;
      while (!((String)localObject1).equals("video/mp4v"));
      paramMediaFormat = new d("mp4v");
      paramMediaFormat.a(1);
      paramMediaFormat.e(24);
      paramMediaFormat.d(1);
      paramMediaFormat.a(72.0D);
      paramMediaFormat.b(72.0D);
      paramMediaFormat.b(this.k);
      paramMediaFormat.c(this.j);
      this.f.a(paramMediaFormat);
      return;
    }
    this.m.add(Long.valueOf(1024L));
    this.c = 1024L;
    this.l = 1.0F;
    this.h = paramMediaFormat.getInteger("sample-rate");
    this.d = "soun";
    this.e = new t();
    this.f = new p();
    Object localObject1 = new com.a.a.a.a.b("mp4a");
    ((com.a.a.a.a.b)localObject1).b(paramMediaFormat.getInteger("channel-count"));
    ((com.a.a.a.a.b)localObject1).a(paramMediaFormat.getInteger("sample-rate"));
    ((com.a.a.a.a.b)localObject1).a(1);
    ((com.a.a.a.a.b)localObject1).c(16);
    paramMediaFormat = new com.b.a.a.a.b();
    Object localObject2 = new h();
    ((h)localObject2).a(0);
    Object localObject3 = new n();
    ((n)localObject3).a(2);
    ((h)localObject2).a((n)localObject3);
    localObject3 = new com.b.a.a.a.a.e();
    ((com.b.a.a.a.a.e)localObject3).a(64);
    ((com.b.a.a.a.a.e)localObject3).b(5);
    ((com.b.a.a.a.a.e)localObject3).c(1536);
    ((com.b.a.a.a.a.e)localObject3).a(96000L);
    ((com.b.a.a.a.a.e)localObject3).b(96000L);
    Object localObject4 = new com.b.a.a.a.a.a();
    ((com.b.a.a.a.a.a)localObject4).a(2);
    ((com.b.a.a.a.a.a)localObject4).b(((Integer)o.get(Integer.valueOf((int)((com.a.a.a.a.b)localObject1).f()))).intValue());
    ((com.b.a.a.a.a.a)localObject4).c(((com.a.a.a.a.b)localObject1).e());
    ((com.b.a.a.a.a.e)localObject3).a((com.b.a.a.a.a.a)localObject4);
    ((h)localObject2).a((com.b.a.a.a.a.e)localObject3);
    localObject3 = ((h)localObject2).b();
    paramMediaFormat.a((h)localObject2);
    paramMediaFormat.e((ByteBuffer)localObject3);
    ((com.a.a.a.a.b)localObject1).a(paramMediaFormat);
    this.f.a((com.a.a.a.b)localObject1);
  }

  public long a()
  {
    return this.a;
  }

  public void a(long paramLong, MediaCodec.BufferInfo paramBufferInfo)
  {
    long l1 = paramBufferInfo.presentationTimeUs - this.p;
    if (l1 < 0L)
      return;
    if ((!this.n) && ((paramBufferInfo.flags & 0x1) != 0));
    for (int i1 = 1; ; i1 = 0)
    {
      this.b.add(new e(paramLong, paramBufferInfo.size));
      if ((this.g != null) && (i1 != 0))
        this.g.add(Integer.valueOf(this.b.size()));
      paramLong = (l1 * this.h + 500000L) / 1000000L;
      this.p = paramBufferInfo.presentationTimeUs;
      if (!this.q)
      {
        this.m.add(this.m.size() - 1, Long.valueOf(paramLong));
        this.c = (paramLong + this.c);
      }
      this.q = false;
      return;
    }
  }

  public ArrayList<e> b()
  {
    return this.b;
  }

  public long c()
  {
    return this.c;
  }

  public String d()
  {
    return this.d;
  }

  public com.a.a.a.a e()
  {
    return this.e;
  }

  public p f()
  {
    return this.f;
  }

  public long[] g()
  {
    if ((this.g == null) || (this.g.isEmpty()))
      return null;
    long[] arrayOfLong = new long[this.g.size()];
    int i1 = 0;
    while (i1 < this.g.size())
    {
      arrayOfLong[i1] = ((Integer)this.g.get(i1)).intValue();
      i1 += 1;
    }
    return arrayOfLong;
  }

  public int h()
  {
    return this.h;
  }

  public Date i()
  {
    return this.i;
  }

  public int j()
  {
    return this.k;
  }

  public int k()
  {
    return this.j;
  }

  public float l()
  {
    return this.l;
  }

  public ArrayList<Long> m()
  {
    return this.m;
  }

  public boolean n()
  {
    return this.n;
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.f.g
 * JD-Core Version:    0.6.0
 */