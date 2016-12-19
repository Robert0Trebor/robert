package org.vidogram.messenger;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import java.io.File;
import java.io.FileInputStream;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import org.vidogram.tgnet.ConnectionsManager;
import org.vidogram.tgnet.NativeByteBuffer;
import org.vidogram.tgnet.c;
import org.vidogram.tgnet.f;
import org.vidogram.tgnet.g.uh;
import org.vidogram.tgnet.g.ui;

public class o
{
  public int a = 0;
  public a b;
  private int c = 32768;
  private String d;
  private byte[] e;
  private int f = 0;
  private int g = 0;
  private long h;
  private boolean i = false;
  private long j = 0L;
  private int k = 0;
  private long l = 0L;
  private int m = 0;
  private byte[] n;
  private byte[] o;
  private byte[] p;
  private boolean q = false;
  private int r = 0;
  private boolean s = false;
  private String t;
  private int u = 0;
  private int v = 0;
  private FileInputStream w;
  private MessageDigest x = null;
  private boolean y = false;

  public o(String paramString, boolean paramBoolean, int paramInt)
  {
    this.d = paramString;
    this.q = paramBoolean;
    this.u = paramInt;
  }

  private void a(SharedPreferences paramSharedPreferences)
  {
    paramSharedPreferences = paramSharedPreferences.edit();
    paramSharedPreferences.putInt(this.t + "_time", this.v);
    paramSharedPreferences.putLong(this.t + "_size", this.j);
    paramSharedPreferences.putLong(this.t + "_id", this.h);
    paramSharedPreferences.remove(this.t + "_uploaded");
    if (this.q)
    {
      paramSharedPreferences.putString(this.t + "_iv", Utilities.a(this.o));
      paramSharedPreferences.putString(this.t + "_ivc", Utilities.a(this.p));
      paramSharedPreferences.putString(this.t + "_key", Utilities.a(this.n));
    }
    paramSharedPreferences.commit();
  }

  private void c()
  {
    ApplicationLoader.a.getSharedPreferences("uploadinfo", 0).edit().remove(this.t + "_time").remove(this.t + "_size").remove(this.t + "_uploaded").remove(this.t + "_id").remove(this.t + "_iv").remove(this.t + "_key").remove(this.t + "_ivc").commit();
    try
    {
      if (this.w != null)
      {
        this.w.close();
        this.w = null;
      }
      return;
    }
    catch (Exception localException)
    {
      n.a("tmessages", localException);
    }
  }

  private void d()
  {
    int i4 = 1;
    if (this.a != 1)
      return;
    int i1;
    while (true)
    {
      try
      {
        this.y = true;
        if (this.w != null)
          break label1382;
        File localFile = new File(this.d);
        this.w = new FileInputStream(localFile);
        if (this.u == 0)
          continue;
        this.j = this.u;
        if (this.j > 10485760L)
        {
          this.s = true;
          this.c = (int)Math.max(32L, (this.j + 3072000L - 1L) / 3072000L);
          if (1024 % this.c == 0)
            break label201;
          i1 = 64;
          if (this.c <= i1)
            break;
          i1 *= 2;
          continue;
          this.j = localFile.length();
          continue;
        }
      }
      catch (Exception localException1)
      {
        n.a("tmessages", localException1);
        this.b.a(this);
        c();
        return;
      }
      try
      {
        this.x = MessageDigest.getInstance("MD5");
      }
      catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
      {
        n.a("tmessages", localNoSuchAlgorithmException);
      }
    }
    this.c = i1;
    label201: this.c *= 1024;
    this.k = ((int)(this.j + this.c - 1L) / this.c);
    this.e = new byte[this.c];
    Object localObject3 = new StringBuilder().append(this.d);
    Object localObject1;
    label272: long l1;
    int i2;
    label616: int i3;
    if (this.q)
    {
      localObject1 = "enc";
      this.t = Utilities.e((String)localObject1);
      localObject1 = ApplicationLoader.a.getSharedPreferences("uploadinfo", 0);
      l1 = ((SharedPreferences)localObject1).getLong(this.t + "_size", 0L);
      this.v = (int)(System.currentTimeMillis() / 1000L);
      if ((this.u != 0) || (l1 != this.j))
        break label1785;
      this.h = ((SharedPreferences)localObject1).getLong(this.t + "_id", 0L);
      i2 = ((SharedPreferences)localObject1).getInt(this.t + "_time", 0);
      l1 = ((SharedPreferences)localObject1).getLong(this.t + "_uploaded", 0L);
      if (this.q)
      {
        localObject3 = ((SharedPreferences)localObject1).getString(this.t + "_iv", null);
        String str = ((SharedPreferences)localObject1).getString(this.t + "_key", null);
        if ((localObject3 == null) || (str == null))
          break label1765;
        this.n = Utilities.d(str);
        this.o = Utilities.d((String)localObject3);
        if ((this.n == null) || (this.o == null) || (this.n.length != 32) || (this.o.length != 32))
          break label1760;
        this.p = new byte[32];
        System.arraycopy(this.o, 0, this.p, 0, 32);
        i1 = 0;
        if ((i1 != 0) || (i2 == 0))
          break label1780;
        if ((this.s) && (i2 < this.v - 86400))
        {
          i3 = 0;
          i2 = i1;
          if (i3 == 0)
            break label1007;
          if (l1 <= 0L)
            break label1775;
          this.l = l1;
          this.g = (int)(l1 / this.c);
          if (!this.s)
            i3 = 0;
        }
        else
        {
          while (true)
          {
            i2 = i1;
            if (i3 >= this.l / this.c)
              break label1007;
            int i5 = this.w.read(this.e);
            if ((!this.q) || (i5 % 16 == 0))
              break label1742;
            i2 = 16 - i5 % 16 + 0;
            label743: localObject3 = new NativeByteBuffer(i5 + i2);
            if ((i5 != this.c) || (this.k == this.g + 1))
              this.i = true;
            ((NativeByteBuffer)localObject3).a(this.e, 0, i5);
            if (this.q)
            {
              i4 = 0;
              while (true)
                if (i4 < i2)
                {
                  ((NativeByteBuffer)localObject3).d(0);
                  i4 += 1;
                  continue;
                  i3 = i2;
                  if (this.s)
                    break;
                  i3 = i2;
                  if (i2 >= this.v - 5400.0F)
                    break;
                  i3 = 0;
                  break;
                }
              Utilities.a(((NativeByteBuffer)localObject3).b, this.n, this.p, true, true, 0, i2 + i5);
            }
            ((NativeByteBuffer)localObject3).c();
            this.x.update(((NativeByteBuffer)localObject3).b);
            ((NativeByteBuffer)localObject3).e();
            i3 += 1;
          }
        }
        this.w.skip(l1);
        i2 = i1;
        if (this.q)
        {
          localObject3 = ((SharedPreferences)localObject1).getString(this.t + "_ivc", null);
          if (localObject3 == null)
            break label1203;
          this.p = Utilities.d((String)localObject3);
          if ((this.p != null) && (this.p.length == 32))
            break label1739;
          this.l = 0L;
          this.g = 0;
          i1 = i4;
          break label1770;
        }
      }
    }
    while (true)
    {
      label1007: if (i2 != 0)
      {
        if (this.q)
        {
          this.o = new byte[32];
          this.n = new byte[32];
          this.p = new byte[32];
          Utilities.b.nextBytes(this.o);
          Utilities.b.nextBytes(this.n);
          System.arraycopy(this.o, 0, this.p, 0, 32);
        }
        this.h = Utilities.b.nextLong();
        if (this.u == 0)
          a((SharedPreferences)localObject1);
      }
      boolean bool = this.q;
      if (bool)
      {
        try
        {
          localObject1 = MessageDigest.getInstance("MD5");
          localObject3 = new byte[64];
          System.arraycopy(this.n, 0, localObject3, 0, 32);
          System.arraycopy(this.o, 0, localObject3, 32, 32);
          localObject1 = ((MessageDigest)localObject1).digest(localObject3);
          i1 = 0;
          while (i1 < 4)
          {
            this.r |= ((localObject1[i1] ^ localObject1[(i1 + 4)]) & 0xFF) << i1 * 8;
            i1 += 1;
            continue;
            label1203: this.l = 0L;
            this.g = 0;
            i1 = i4;
          }
        }
        catch (Exception localException2)
        {
          n.a("tmessages", localException2);
        }
      }
      else
      {
        if (this.u != 0)
        {
          l1 = this.w.getChannel().size();
          if (this.l + this.c > l1)
            break;
        }
        i3 = this.w.read(this.e);
        if ((this.q) && (i3 % 16 != 0));
        for (i1 = 16 - i3 % 16 + 0; ; i1 = 0)
        {
          localObject3 = new NativeByteBuffer(i3 + i1);
          if ((i3 != this.c) || ((this.u == 0) && (this.k == this.g + 1)))
            this.i = true;
          ((NativeByteBuffer)localObject3).a(this.e, 0, i3);
          if (this.q)
          {
            i2 = 0;
            while (true)
              if (i2 < i1)
              {
                ((NativeByteBuffer)localObject3).d(0);
                i2 += 1;
                continue;
                label1382: if (this.u != 0)
                  break;
                if (this.m >= 4)
                  this.m = 0;
                if (((this.s) && (this.l % 1048576L == 0L)) || ((!this.s) && (this.m == 0)))
                {
                  localObject2 = ApplicationLoader.a.getSharedPreferences("uploadinfo", 0).edit();
                  ((SharedPreferences.Editor)localObject2).putLong(this.t + "_uploaded", this.l);
                  if (this.q)
                    ((SharedPreferences.Editor)localObject2).putString(this.t + "_ivc", Utilities.a(this.p));
                  ((SharedPreferences.Editor)localObject2).commit();
                }
                this.m += 1;
                break;
              }
            Utilities.a(((NativeByteBuffer)localObject3).b, this.n, this.p, true, true, 0, i1 + i3);
          }
          ((NativeByteBuffer)localObject3).c();
          if (!this.s)
            this.x.update(((NativeByteBuffer)localObject3).b);
          if (this.s)
          {
            localObject2 = new g.uh();
            ((g.uh)localObject2).d = this.g;
            ((g.uh)localObject2).c = this.h;
            if (this.u != 0)
            {
              ((g.uh)localObject2).e = -1;
              ((g.uh)localObject2).f = ((NativeByteBuffer)localObject3);
            }
          }
          while (true)
          {
            this.l += i3;
            this.f = ConnectionsManager.a().a((f)localObject2, new c()
            {
            }
            , 0, 4);
            return;
            ((g.uh)localObject2).e = this.k;
            break;
            localObject2 = new g.ui();
            ((g.ui)localObject2).d = this.g;
            ((g.ui)localObject2).c = this.h;
            ((g.ui)localObject2).e = ((NativeByteBuffer)localObject3);
          }
        }
        label1739: break label1770;
        label1742: i2 = 0;
        break label743;
        i1 = 0;
        break label616;
        Object localObject2 = "";
        break label272;
        label1760: i1 = 1;
        break label616;
        label1765: i1 = 1;
        break label616;
      }
      label1770: i2 = i1;
      continue;
      label1775: i2 = 1;
      continue;
      label1780: i2 = 1;
      continue;
      label1785: i2 = 1;
    }
  }

  public void a()
  {
    if (this.a != 0)
      return;
    this.a = 1;
    Utilities.c.b(new Runnable()
    {
      public void run()
      {
        o.a(o.this);
      }
    });
  }

  protected void a(long paramLong)
  {
    Utilities.c.b(new Runnable(paramLong)
    {
      public void run()
      {
        if ((o.b(o.this) != 0) && (this.a != 0L))
        {
          o.a(o.this, 0);
          o.a(o.this, this.a);
          o.b(o.this, (int)(o.c(o.this) + o.d(o.this) - 1L) / o.d(o.this));
          if (o.e(o.this))
          {
            SharedPreferences localSharedPreferences = ApplicationLoader.a.getSharedPreferences("uploadinfo", 0);
            o.a(o.this, localSharedPreferences);
          }
        }
        if (o.f(o.this) == 0)
          o.a(o.this);
      }
    });
  }

  public void b()
  {
    if (this.a == 3)
      return;
    this.a = 2;
    if (this.f != 0)
      ConnectionsManager.a().a(this.f, true);
    this.b.a(this);
    c();
  }

  public static abstract interface a
  {
    public abstract void a(o paramo);
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.o
 * JD-Core Version:    0.6.0
 */