package org.vidogram.messenger;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import org.vidogram.tgnet.ConnectionsManager;
import org.vidogram.tgnet.c;
import org.vidogram.tgnet.g.ae;
import org.vidogram.tgnet.g.hs;
import org.vidogram.tgnet.g.ig;
import org.vidogram.tgnet.g.iy;
import org.vidogram.tgnet.g.iz;
import org.vidogram.tgnet.g.jp;
import org.vidogram.tgnet.g.js;
import org.vidogram.tgnet.g.jv;
import org.vidogram.tgnet.g.q;
import org.vidogram.tgnet.g.uf;
import org.vidogram.tgnet.g.ug;
import org.vidogram.tgnet.g.x;

public class l
{
  private boolean a;
  private int b;
  private g.ae c;
  private volatile int d = 0;
  private int e;
  private int f;
  private int g;
  private a h;
  private byte[] i;
  private byte[] j;
  private int k;
  private int l;
  private int m;
  private int n;
  private int o;
  private ArrayList<b> p;
  private ArrayList<b> q;
  private File r;
  private File s;
  private File t;
  private String u;
  private RandomAccessFile v;
  private RandomAccessFile w;
  private File x;
  private File y;
  private boolean z;

  public l(g.q paramq)
  {
    while (true)
    {
      int i2;
      try
      {
        if (!(paramq instanceof g.ig))
          continue;
        this.c = new g.js();
        this.c.b = paramq.b;
        this.c.c = paramq.c;
        this.b = paramq.k;
        this.j = new byte[32];
        System.arraycopy(paramq.m, 0, this.j, 0, this.j.length);
        this.i = paramq.l;
        this.f = paramq.h;
        if ((this.i == null) || (this.f % 16 == 0))
          continue;
        this.g = (16 - this.f % 16);
        this.f += this.g;
        this.u = m.b(paramq);
        if (this.u == null)
          continue;
        i2 = this.u.lastIndexOf('.');
        if (i2 == -1)
        {
          this.u = "";
          if (this.u.length() > 1)
            break;
          if (paramq.g == null)
            break label365;
          paramq = paramq.g;
          switch (paramq.hashCode())
          {
          case 1331848029:
            this.u = "";
            return;
            if (!(paramq instanceof g.hs))
              continue;
            this.c = new g.jp();
            this.c.b = paramq.b;
            this.c.c = paramq.c;
            this.b = paramq.k;
            continue;
          case 187091926:
          }
        }
      }
      catch (Exception paramq)
      {
        n.a("tmessages", paramq);
        a(true, 0);
        return;
      }
      this.u = this.u.substring(i2);
      continue;
      if (paramq.equals("video/mp4"))
      {
        i1 = 0;
        break label372;
        if (paramq.equals("audio/ogg"))
        {
          i1 = 1;
          break label372;
          this.u = ".mp4";
          return;
          this.u = ".ogg";
          return;
          label365: this.u = "";
          return;
        }
      }
      label372: switch (i1)
      {
      case 0:
      case 1:
      }
    }
  }

  public l(g.x paramx, String paramString, int paramInt)
  {
    if ((paramx instanceof g.iy))
    {
      this.c = new g.js();
      this.c.b = paramx.c;
      this.c.d = paramx.c;
      this.c.c = paramx.e;
      this.c.e = paramx.d;
      this.j = new byte[32];
      System.arraycopy(paramx.g, 0, this.j, 0, this.j.length);
      this.i = paramx.f;
      this.b = paramx.b;
      this.f = paramInt;
      if (paramString == null)
        break label190;
    }
    while (true)
    {
      this.u = paramString;
      return;
      if (!(paramx instanceof g.iz))
        break;
      this.c = new g.jv();
      this.c.d = paramx.c;
      this.c.f = paramx.e;
      this.c.e = paramx.d;
      this.b = paramx.b;
      break;
      label190: paramString = "jpg";
    }
  }

  private void a(boolean paramBoolean, int paramInt)
  {
    e();
    this.d = 2;
    if (paramBoolean)
    {
      Utilities.c.b(new Runnable(paramInt)
      {
        public void run()
        {
          l.g(l.this).a(l.this, this.a);
        }
      });
      return;
    }
    this.h.a(this, paramInt);
  }

  // ERROR //
  private void e()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 217	org/vidogram/messenger/l:v	Ljava/io/RandomAccessFile;
    //   4: astore_2
    //   5: aload_2
    //   6: ifnull +25 -> 31
    //   9: aload_0
    //   10: getfield 217	org/vidogram/messenger/l:v	Ljava/io/RandomAccessFile;
    //   13: invokevirtual 223	java/io/RandomAccessFile:getChannel	()Ljava/nio/channels/FileChannel;
    //   16: invokevirtual 228	java/nio/channels/FileChannel:close	()V
    //   19: aload_0
    //   20: getfield 217	org/vidogram/messenger/l:v	Ljava/io/RandomAccessFile;
    //   23: invokevirtual 229	java/io/RandomAccessFile:close	()V
    //   26: aload_0
    //   27: aconst_null
    //   28: putfield 217	org/vidogram/messenger/l:v	Ljava/io/RandomAccessFile;
    //   31: aload_0
    //   32: getfield 231	org/vidogram/messenger/l:w	Ljava/io/RandomAccessFile;
    //   35: ifnull +15 -> 50
    //   38: aload_0
    //   39: getfield 231	org/vidogram/messenger/l:w	Ljava/io/RandomAccessFile;
    //   42: invokevirtual 229	java/io/RandomAccessFile:close	()V
    //   45: aload_0
    //   46: aconst_null
    //   47: putfield 231	org/vidogram/messenger/l:w	Ljava/io/RandomAccessFile;
    //   50: aload_0
    //   51: getfield 233	org/vidogram/messenger/l:q	Ljava/util/ArrayList;
    //   54: ifnull +94 -> 148
    //   57: iconst_0
    //   58: istore_1
    //   59: iload_1
    //   60: aload_0
    //   61: getfield 233	org/vidogram/messenger/l:q	Ljava/util/ArrayList;
    //   64: invokevirtual 238	java/util/ArrayList:size	()I
    //   67: if_icmpge +74 -> 141
    //   70: aload_0
    //   71: getfield 233	org/vidogram/messenger/l:q	Ljava/util/ArrayList;
    //   74: iload_1
    //   75: invokevirtual 242	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   78: checkcast 19	org/vidogram/messenger/l$b
    //   81: astore_2
    //   82: aload_2
    //   83: invokestatic 245	org/vidogram/messenger/l$b:b	(Lorg/vidogram/messenger/l$b;)Lorg/vidogram/tgnet/g$uf;
    //   86: ifnull +18 -> 104
    //   89: aload_2
    //   90: invokestatic 245	org/vidogram/messenger/l$b:b	(Lorg/vidogram/messenger/l$b;)Lorg/vidogram/tgnet/g$uf;
    //   93: iconst_0
    //   94: putfield 249	org/vidogram/tgnet/g$uf:a	Z
    //   97: aload_2
    //   98: invokestatic 245	org/vidogram/messenger/l$b:b	(Lorg/vidogram/messenger/l$b;)Lorg/vidogram/tgnet/g$uf;
    //   101: invokevirtual 251	org/vidogram/tgnet/g$uf:a	()V
    //   104: iload_1
    //   105: iconst_1
    //   106: iadd
    //   107: istore_1
    //   108: goto -49 -> 59
    //   111: astore_2
    //   112: ldc 136
    //   114: aload_2
    //   115: invokestatic 141	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   118: goto -99 -> 19
    //   121: astore_2
    //   122: ldc 136
    //   124: aload_2
    //   125: invokestatic 141	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   128: goto -97 -> 31
    //   131: astore_2
    //   132: ldc 136
    //   134: aload_2
    //   135: invokestatic 141	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   138: goto -88 -> 50
    //   141: aload_0
    //   142: getfield 233	org/vidogram/messenger/l:q	Ljava/util/ArrayList;
    //   145: invokevirtual 254	java/util/ArrayList:clear	()V
    //   148: return
    //
    // Exception table:
    //   from	to	target	type
    //   9	19	111	java/lang/Exception
    //   0	5	121	java/lang/Exception
    //   19	31	121	java/lang/Exception
    //   112	118	121	java/lang/Exception
    //   31	50	131	java/lang/Exception
  }

  private void f()
  {
    if (this.d != 1)
      return;
    this.d = 3;
    e();
    if (this.t != null)
    {
      this.t.delete();
      this.t = null;
    }
    if ((this.r != null) && (!this.r.renameTo(this.s)))
    {
      if (d.a)
        n.a("tmessages", "unable to rename temp = " + this.r + " to final = " + this.s + " retry = " + this.n);
      this.n += 1;
      if (this.n < 3)
      {
        this.d = 1;
        Utilities.c.a(new Runnable()
        {
          public void run()
          {
            try
            {
              l.c(l.this);
              return;
            }
            catch (Exception localException)
            {
              l.a(l.this, false, 0);
            }
          }
        }
        , 200L);
        return;
      }
      this.s = this.r;
    }
    if (d.a)
      n.a("tmessages", "finished downloading file to " + this.s);
    this.h.a(this, this.s);
  }

  private void g()
  {
    if ((this.d != 1) || ((this.f > 0) && (this.o >= this.f)) || (this.p.size() + this.q.size() >= this.l))
      return;
    if (this.f > 0);
    for (int i1 = Math.max(0, this.l - this.p.size()); ; i1 = 1)
    {
      int i2 = 0;
      label75: boolean bool;
      label138: g.ug localug;
      b localb;
      ConnectionsManager localConnectionsManager;
      5 local5;
      int i3;
      label245: int i5;
      if ((i2 < i1) && ((this.f <= 0) || (this.o < this.f)))
      {
        if ((this.f > 0) && (i2 != i1 - 1) && ((this.f <= 0) || (this.o + this.k < this.f)))
          break label305;
        bool = true;
        localug = new g.ug();
        localug.c = this.c;
        localug.d = this.o;
        localug.e = this.k;
        this.o += this.k;
        localb = new b(null);
        this.p.add(localb);
        b.a(localb, localug.d);
        localConnectionsManager = ConnectionsManager.a();
        local5 = new c(localb)
        {
        };
        if (!this.z)
          break label311;
        i3 = 32;
        i5 = this.b;
        if (this.m % 2 != 0)
          break label316;
      }
      label305: label311: label316: for (int i4 = 2; ; i4 = 65538)
      {
        b.b(localb, localConnectionsManager.a(localug, local5, null, i3 | 0x2, i5, i4, bool));
        this.m += 1;
        i2 += 1;
        break label75;
        break;
        bool = false;
        break label138;
        i3 = 0;
        break label245;
      }
    }
  }

  public void a(File paramFile1, File paramFile2)
  {
    this.x = paramFile1;
    this.y = paramFile2;
  }

  public void a(a parama)
  {
    this.h = parama;
  }

  public void a(boolean paramBoolean)
  {
    this.z = paramBoolean;
  }

  public boolean a()
  {
    return this.z;
  }

  public boolean b()
  {
    return this.a;
  }

  public boolean c()
  {
    if (this.d != 0)
      return false;
    if (this.c == null)
    {
      a(true, 0);
      return false;
    }
    String str1 = null;
    String str4;
    String str5;
    String str2;
    String str3;
    if ((this.c.d != 0L) && (this.c.e != 0))
    {
      if ((this.b == -2147483648) || (this.c.d == -2147483648L) || (this.b == 0))
      {
        a(true, 0);
        return false;
      }
      str4 = this.c.d + "_" + this.c.e + ".temp";
      str5 = this.c.d + "_" + this.c.e + "." + this.u;
      str2 = str4;
      str3 = str5;
      if (this.i != null)
      {
        str1 = this.c.d + "_" + this.c.e + ".iv";
        str3 = str5;
        str2 = str4;
      }
    }
    while (true)
    {
      int i1;
      if (this.f >= 1048576)
      {
        i1 = 131072;
        label264: this.k = i1;
        if (this.f < 1048576)
          break label817;
        i1 = 2;
        label281: this.l = i1;
        this.p = new ArrayList(this.l);
        this.q = new ArrayList(this.l - 1);
        this.d = 1;
        this.s = new File(this.x, str3);
        if ((this.s.exists()) && (this.f != 0) && (this.f != this.s.length()))
          this.s.delete();
        if (this.s.exists())
          break label880;
        this.r = new File(this.y, str2);
        if (this.r.exists())
        {
          this.e = (int)this.r.length();
          i1 = this.e / this.k * this.k;
          this.e = i1;
          this.o = i1;
        }
        if (d.a)
          n.b("tmessages", "start loading file to temp = " + this.r + " final = " + this.s);
        if (str1 != null)
          this.t = new File(this.y, str1);
      }
      try
      {
        this.w = new RandomAccessFile(this.t, "rws");
        long l1 = this.t.length();
        if ((l1 > 0L) && (l1 % 32L == 0L))
          this.w.read(this.j, 0, 32);
      }
      catch (Exception localException2)
      {
        try
        {
          while (true)
          {
            this.v = new RandomAccessFile(this.r, "rws");
            if (this.e != 0)
              this.v.seek(this.e);
            if (this.v != null)
              break label859;
            a(true, 0);
            return false;
            if ((this.b == 0) || (this.c.b == 0L))
            {
              a(true, 0);
              return false;
            }
            str4 = this.b + "_" + this.c.b + ".temp";
            str5 = this.b + "_" + this.c.b + this.u;
            str2 = str4;
            str3 = str5;
            if (this.i == null)
              break;
            str1 = this.b + "_" + this.c.b + ".iv";
            str2 = str4;
            str3 = str5;
            break;
            i1 = 32768;
            break label264;
            label817: i1 = 4;
            break label281;
            this.e = 0;
            continue;
            localException1 = localException1;
            n.a("tmessages", localException1);
            this.e = 0;
          }
        }
        catch (Exception localException2)
        {
          while (true)
            n.a("tmessages", localException2);
          label859: this.a = true;
          Utilities.c.b(new Runnable()
          {
            public void run()
            {
              if ((l.a(l.this) != 0) && (l.b(l.this) == l.a(l.this)))
                try
                {
                  l.c(l.this);
                  return;
                }
                catch (Exception localException)
                {
                  l.a(l.this, true, 0);
                  return;
                }
              l.d(l.this);
            }
          });
        }
      }
    }
    while (true)
    {
      return true;
      label880: this.a = true;
      try
      {
        f();
      }
      catch (Exception localException3)
      {
        a(true, 0);
      }
    }
  }

  public void d()
  {
    Utilities.c.b(new Runnable()
    {
      public void run()
      {
        if ((l.e(l.this) == 3) || (l.e(l.this) == 2))
          return;
        if (l.f(l.this) != null)
        {
          int i = 0;
          while (i < l.f(l.this).size())
          {
            l.b localb = (l.b)l.f(l.this).get(i);
            if (l.b.a(localb) != 0)
              ConnectionsManager.a().a(l.b.a(localb), true);
            i += 1;
          }
        }
        l.a(l.this, false, 1);
      }
    });
  }

  public static abstract interface a
  {
    public abstract void a(l paraml, int paramInt);

    public abstract void a(l paraml, File paramFile);
  }

  private static class b
  {
    private int a;
    private int b;
    private g.uf c;
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.l
 * JD-Core Version:    0.6.0
 */