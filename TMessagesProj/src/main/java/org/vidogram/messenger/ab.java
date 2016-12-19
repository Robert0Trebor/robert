package org.vidogram.messenger;

import B;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import org.vidogram.tgnet.ConnectionsManager;
import org.vidogram.tgnet.NativeByteBuffer;
import org.vidogram.tgnet.c;
import org.vidogram.tgnet.f;
import org.vidogram.tgnet.g.ac;
import org.vidogram.tgnet.g.ar;
import org.vidogram.tgnet.g.as;
import org.vidogram.tgnet.g.gj;
import org.vidogram.tgnet.g.gk;
import org.vidogram.tgnet.g.gl;
import org.vidogram.tgnet.g.gm;
import org.vidogram.tgnet.g.gn;
import org.vidogram.tgnet.g.go;
import org.vidogram.tgnet.g.gp;
import org.vidogram.tgnet.g.gq;
import org.vidogram.tgnet.g.gr;
import org.vidogram.tgnet.g.gt;
import org.vidogram.tgnet.g.gu;
import org.vidogram.tgnet.g.gw;
import org.vidogram.tgnet.g.hm;
import org.vidogram.tgnet.g.hn;
import org.vidogram.tgnet.g.im;
import org.vidogram.tgnet.g.ip;
import org.vidogram.tgnet.g.ir;
import org.vidogram.tgnet.g.jq;
import org.vidogram.tgnet.g.n;
import org.vidogram.tgnet.g.ne;
import org.vidogram.tgnet.g.o;
import org.vidogram.tgnet.g.oj;
import org.vidogram.tgnet.g.pe;
import org.vidogram.tgnet.g.pq;
import org.vidogram.tgnet.g.qx;
import org.vidogram.tgnet.g.qy;
import org.vidogram.tgnet.g.qz;
import org.vidogram.tgnet.g.ro;
import org.vidogram.tgnet.g.t;
import org.vidogram.tgnet.g.vv;
import org.vidogram.tgnet.g.vw;

public class ab
{
  private static volatile ab g = null;
  public ArrayList<g.vv> a = new ArrayList();
  private ArrayList<Integer> b = new ArrayList();
  private HashMap<Integer, ArrayList<Object>> c = new HashMap();
  private HashMap<Integer, g.t> d = new HashMap();
  private ArrayList<Long> e = new ArrayList();
  private boolean f = false;

  public static ab a()
  {
    Object localObject1 = g;
    if (localObject1 == null)
    {
      monitorenter;
      try
      {
        ab localab = g;
        localObject1 = localab;
        if (localab == null)
        {
          localObject1 = new ab();
          g = (ab)localObject1;
        }
        return localObject1;
      }
      finally
      {
        monitorexit;
      }
    }
    return (ab)localObject2;
  }

  private g.oj a(g.t paramt, g.o paramo)
  {
    g.oj localoj = new g.oj();
    localoj.f = new g.ne();
    localoj.f.d = paramo;
    int i = ad.a();
    localoj.b = i;
    localoj.D = i;
    localoj.c = ad.c();
    localoj.o = true;
    localoj.n = true;
    localoj.k = 256;
    localoj.E = (paramt.b << 32);
    localoj.d = new g.ro();
    localoj.y = 1;
    if (paramt.f == ad.c())
    {
      localoj.d.c = paramt.e;
      if ((!(paramo instanceof g.gt)) && (!(paramo instanceof g.gu)))
        break label211;
    }
    label211: for (localoj.e = ConnectionsManager.a().b(); ; localoj.e = 0)
    {
      localoj.C = ac.a().c();
      ad.a(false);
      paramt = new ArrayList();
      paramt.add(localoj);
      w.a().a(paramt, false, true, true, 0);
      return localoj;
      localoj.d.c = paramt.f;
      break;
    }
  }

  public void a(int paramInt)
  {
    g.pe localpe = new g.pe();
    localpe.c = paramInt;
    ConnectionsManager.a().a(localpe, new c()
    {
    });
  }

  public void a(Context paramContext, g.vw paramvw)
  {
    if ((paramvw == null) || (paramContext == null))
      return;
    this.f = true;
    ProgressDialog localProgressDialog = new ProgressDialog(paramContext);
    localProgressDialog.setMessage(r.a("Loading", 2131231394));
    localProgressDialog.setCanceledOnTouchOutside(false);
    localProgressDialog.setCancelable(false);
    g.pq localpq = new g.pq();
    localpq.d = 256;
    localpq.c = w.e;
    int i = ConnectionsManager.a().a(localpq, new c(paramContext, localProgressDialog, paramvw)
    {
    }
    , 2);
    localProgressDialog.setButton(-2, r.a("Cancel", 2131230943), new DialogInterface.OnClickListener(i)
    {
      public void onClick(DialogInterface paramDialogInterface, int paramInt)
      {
        ConnectionsManager.a().a(this.a, true);
        try
        {
          paramDialogInterface.dismiss();
          return;
        }
        catch (Exception paramDialogInterface)
        {
          n.a("tmessages", paramDialogInterface);
        }
      }
    });
    try
    {
      localProgressDialog.show();
      return;
    }
    catch (Exception paramContext)
    {
    }
  }

  protected void a(g.n paramn, g.ar paramar, g.t paramt, g.ac paramac, String paramString, u paramu)
  {
    if ((paramn == null) || (paramt.l == null) || ((paramt instanceof g.ip)) || ((paramt instanceof g.ir)))
      return;
    ac.a().a(paramar);
    Utilities.c.b(new Runnable(paramt, paramn, paramar, paramac, paramu, paramString)
    {
      public void run()
      {
        int i = 0;
        while (true)
        {
          Object localObject3;
          try
          {
            if (a.c(this.a.o) < 17)
              break label805;
            Object localObject1 = new g.gw();
            ((g.gw)localObject1).d = Math.min(Math.max(17, a.b(this.a.o)), a.c(this.a.o));
            ((g.gw)localObject1).g = this.b;
            ((g.gw)localObject1).c = new byte[15];
            Utilities.b.nextBytes(((g.gw)localObject1).c);
            if ((this.a.p != 0) || (this.a.q != 0))
              continue;
            if (this.a.e != ad.c())
              continue;
            this.a.q = 1;
            if ((this.c.H == 0) && (this.c.I == 0))
            {
              ((g.gw)localObject1).e = this.a.p;
              ((g.gw)localObject1).f = this.a.q;
              localObject3 = this.a;
              ((g.t)localObject3).q += 2;
              if (a.c(this.a.o) < 20)
                continue;
              if (this.a.w != 0)
                continue;
              this.a.w = ConnectionsManager.a().b();
              localObject3 = this.a;
              ((g.t)localObject3).u = (short)(((g.t)localObject3).u + 1);
              if (((this.a.u < 100) && (this.a.w >= ConnectionsManager.a().b() - 604800)) || (this.a.v != 0L) || (this.a.x != 0L))
                continue;
              ab.this.a(this.a);
              w.a().a(this.a);
              if (this.c == null)
                continue;
              this.c.H = ((g.gw)localObject1).e;
              this.c.I = ((g.gw)localObject1).f;
              w.a().a(this.c.b, this.c.H, this.c.I);
              n.a("tmessages", this.b + " send message with in_seq = " + ((g.gw)localObject1).e + " out_seq = " + ((g.gw)localObject1).f);
              int j = ((f)localObject1).b();
              localObject3 = new NativeByteBuffer(j + 4);
              ((NativeByteBuffer)localObject3).a(j);
              ((f)localObject1).a((org.vidogram.tgnet.a)localObject3);
              Object localObject4 = Utilities.a(((NativeByteBuffer)localObject3).b);
              localObject1 = new byte[16];
              if (localObject4.length == 0)
                continue;
              System.arraycopy(localObject4, localObject4.length - 16, localObject1, 0, 16);
              t localt = t.a(this.a.l, localObject1, false);
              j = ((NativeByteBuffer)localObject3).d();
              if (j % 16 == 0)
                continue;
              i = 16 - j % 16;
              localObject4 = new NativeByteBuffer(j + i);
              ((NativeByteBuffer)localObject3).c(0);
              ((NativeByteBuffer)localObject4).b((NativeByteBuffer)localObject3);
              if (i == 0)
                continue;
              byte[] arrayOfByte = new byte[i];
              Utilities.b.nextBytes(arrayOfByte);
              ((NativeByteBuffer)localObject4).b(arrayOfByte);
              ((NativeByteBuffer)localObject3).e();
              Utilities.a(((NativeByteBuffer)localObject4).b, localt.a, localt.b, true, false, 0, ((NativeByteBuffer)localObject4).b());
              localObject3 = new NativeByteBuffer(localObject1.length + 8 + ((NativeByteBuffer)localObject4).d());
              ((NativeByteBuffer)localObject4).c(0);
              ((NativeByteBuffer)localObject3).a(this.a.j);
              ((NativeByteBuffer)localObject3).b(localObject1);
              ((NativeByteBuffer)localObject3).b((NativeByteBuffer)localObject4);
              ((NativeByteBuffer)localObject4).e();
              ((NativeByteBuffer)localObject3).c(0);
              if (this.d != null)
                break label880;
              if (!(this.b instanceof g.hm))
                break label813;
              localObject1 = new g.qz();
              ((g.qz)localObject1).e = ((NativeByteBuffer)localObject3);
              ((g.qz)localObject1).d = this.b.b;
              ((g.qz)localObject1).c = new g.jq();
              ((g.qz)localObject1).c.c = this.a.b;
              ((g.qz)localObject1).c.d = this.a.c;
              ConnectionsManager.a().a((f)localObject1, new c()
              {
              }
              , 64);
              return;
              this.a.p = 1;
              continue;
            }
          }
          catch (Exception localException)
          {
            n.a("tmessages", localException);
            return;
          }
          localException.e = this.c.H;
          localException.f = this.c.I;
          continue;
          label805: Object localObject2 = this.b;
          continue;
          label813: localObject2 = new g.qx();
          ((g.qx)localObject2).e = ((NativeByteBuffer)localObject3);
          ((g.qx)localObject2).d = this.b.b;
          ((g.qx)localObject2).c = new g.jq();
          ((g.qx)localObject2).c.c = this.a.b;
          ((g.qx)localObject2).c.d = this.a.c;
          continue;
          label880: localObject2 = new g.qy();
          ((g.qy)localObject2).e = ((NativeByteBuffer)localObject3);
          ((g.qy)localObject2).d = this.b.b;
          ((g.qy)localObject2).c = new g.jq();
          ((g.qy)localObject2).c.c = this.a.b;
          ((g.qy)localObject2).c.d = this.a.c;
          ((g.qy)localObject2).f = this.d;
        }
      }
    });
  }

  public void a(g.t paramt)
  {
    if (a.c(paramt.o) < 20)
      return;
    byte[] arrayOfByte2 = new byte[256];
    Utilities.b.nextBytes(arrayOfByte2);
    Object localObject = BigInteger.valueOf(w.g).modPow(new BigInteger(1, arrayOfByte2), new BigInteger(1, w.f)).toByteArray();
    if (localObject.length > 256)
    {
      byte[] arrayOfByte1 = new byte[256];
      System.arraycopy(localObject, 1, arrayOfByte1, 0, 256);
      localObject = arrayOfByte1;
    }
    while (true)
    {
      paramt.v = ac.a().c();
      paramt.k = arrayOfByte2;
      paramt.g = ((B)localObject);
      w.a().c(paramt);
      c(paramt, null);
      return;
    }
  }

  public void a(g.t paramt, ArrayList<Long> paramArrayList, g.ar paramar)
  {
    if (!(paramt instanceof g.im))
      return;
    Object localObject;
    if (a.c(paramt.o) >= 17)
    {
      localObject = new g.hm();
      if (paramar == null)
        break label98;
      ((g.hm)localObject).f = paramar.f.d;
    }
    while (true)
    {
      ((g.hm)localObject).b = paramar.C;
      a((g.n)localObject, paramar, paramt, null, null, null);
      return;
      localObject = new g.hn();
      ((g.hm)localObject).g = new byte[15];
      Utilities.b.nextBytes(((g.hm)localObject).g);
      break;
      label98: ((g.hm)localObject).f = new g.gq();
      ((g.hm)localObject).f.d = paramArrayList;
      paramar = a(paramt, ((g.hm)localObject).f);
    }
  }

  public void a(g.t paramt, g.ar paramar)
  {
    if (!(paramt instanceof g.im))
      return;
    Object localObject;
    if (a.c(paramt.o) >= 17)
    {
      localObject = new g.hm();
      if (paramar == null)
        break label91;
      ((g.hm)localObject).f = paramar.f.d;
    }
    while (true)
    {
      ((g.hm)localObject).b = paramar.C;
      a((g.n)localObject, paramar, paramt, null, null, null);
      return;
      localObject = new g.hn();
      ((g.hm)localObject).g = new byte[15];
      Utilities.b.nextBytes(((g.hm)localObject).g);
      break;
      label91: ((g.hm)localObject).f = new g.gn();
      paramar = a(paramt, ((g.hm)localObject).f);
    }
  }

  public void a(g.t paramt, g.ar paramar, long paramLong)
  {
    if (!(paramt instanceof g.im))
      return;
    Object localObject;
    if (a.c(paramt.o) >= 17)
    {
      localObject = new g.hm();
      if (paramar == null)
        break label98;
      ((g.hm)localObject).f = paramar.f.d;
    }
    while (true)
    {
      ((g.hm)localObject).b = paramar.C;
      a((g.n)localObject, paramar, paramt, null, null, null);
      return;
      localObject = new g.hn();
      ((g.hm)localObject).g = new byte[15];
      Utilities.b.nextBytes(((g.hm)localObject).g);
      break;
      label98: ((g.hm)localObject).f = new g.gj();
      ((g.hm)localObject).f.e = paramLong;
      paramar = a(paramt, ((g.hm)localObject).f);
    }
  }

  public void b()
  {
    this.b.clear();
    this.d.clear();
    this.c.clear();
    this.a.clear();
    this.e.clear();
    this.f = false;
  }

  public void b(g.t paramt, ArrayList<Long> paramArrayList, g.ar paramar)
  {
    if (!(paramt instanceof g.im))
      return;
    Object localObject;
    if (a.c(paramt.o) >= 17)
    {
      localObject = new g.hm();
      if (paramar == null)
        break label98;
      ((g.hm)localObject).f = paramar.f.d;
    }
    while (true)
    {
      ((g.hm)localObject).b = paramar.C;
      a((g.n)localObject, paramar, paramt, null, null, null);
      return;
      localObject = new g.hn();
      ((g.hm)localObject).g = new byte[15];
      Utilities.b.nextBytes(((g.hm)localObject).g);
      break;
      label98: ((g.hm)localObject).f = new g.gm();
      ((g.hm)localObject).f.d = paramArrayList;
      paramar = a(paramt, ((g.hm)localObject).f);
    }
  }

  public void b(g.t paramt, g.ar paramar)
  {
    if (!(paramt instanceof g.im));
    do
      return;
    while (this.b.contains(Integer.valueOf(paramt.b)));
    this.b.add(Integer.valueOf(paramt.b));
    Object localObject;
    if (a.c(paramt.o) >= 17)
    {
      localObject = new g.hm();
      if (paramar == null)
        break label123;
      ((g.hm)localObject).f = paramar.f.d;
    }
    while (true)
    {
      ((g.hm)localObject).b = paramar.C;
      a((g.n)localObject, paramar, paramt, null, null, null);
      return;
      localObject = new g.hn();
      ((g.hm)localObject).g = new byte[15];
      Utilities.b.nextBytes(((g.hm)localObject).g);
      break;
      label123: ((g.hm)localObject).f = new g.gp();
      ((g.hm)localObject).f.c = 46;
      paramar = a(paramt, ((g.hm)localObject).f);
    }
  }

  public void c(g.t paramt, ArrayList<Long> paramArrayList, g.ar paramar)
  {
    if (!(paramt instanceof g.im))
      return;
    Object localObject;
    if (a.c(paramt.o) >= 17)
    {
      localObject = new g.hm();
      if (paramar == null)
        break label98;
      ((g.hm)localObject).f = paramar.f.d;
    }
    while (true)
    {
      ((g.hm)localObject).b = paramar.C;
      a((g.n)localObject, paramar, paramt, null, null, null);
      return;
      localObject = new g.hn();
      ((g.hm)localObject).g = new byte[15];
      Utilities.b.nextBytes(((g.hm)localObject).g);
      break;
      label98: ((g.hm)localObject).f = new g.gt();
      ((g.hm)localObject).f.d = paramArrayList;
      paramar = a(paramt, ((g.hm)localObject).f);
      paramArrayList = new u(paramar, null, false);
      paramArrayList.a.y = 1;
      ArrayList localArrayList = new ArrayList();
      localArrayList.add(paramArrayList);
      v.a().a(paramar.E, localArrayList);
      y.a().a(y.c, new Object[0]);
    }
  }

  public void c(g.t paramt, g.ar paramar)
  {
    if (!(paramt instanceof g.im))
      return;
    Object localObject;
    if (a.c(paramt.o) >= 17)
    {
      localObject = new g.hm();
      if (paramar == null)
        break label91;
      ((g.hm)localObject).f = paramar.f.d;
    }
    while (true)
    {
      ((g.hm)localObject).b = paramar.C;
      a((g.n)localObject, paramar, paramt, null, null, null);
      return;
      localObject = new g.hn();
      ((g.hm)localObject).g = new byte[15];
      Utilities.b.nextBytes(((g.hm)localObject).g);
      break;
      label91: ((g.hm)localObject).f = new g.gr();
      ((g.hm)localObject).f.e = paramt.v;
      ((g.hm)localObject).f.k = paramt.g;
      paramar = a(paramt, ((g.hm)localObject).f);
    }
  }

  public void d(g.t paramt, g.ar paramar)
  {
    if (!(paramt instanceof g.im))
      return;
    Object localObject;
    if (a.c(paramt.o) >= 17)
    {
      localObject = new g.hm();
      if (paramar == null)
        break label91;
      ((g.hm)localObject).f = paramar.f.d;
    }
    while (true)
    {
      ((g.hm)localObject).b = paramar.C;
      a((g.n)localObject, paramar, paramt, null, null, null);
      return;
      localObject = new g.hn();
      ((g.hm)localObject).g = new byte[15];
      Utilities.b.nextBytes(((g.hm)localObject).g);
      break;
      label91: ((g.hm)localObject).f = new g.gk();
      ((g.hm)localObject).f.e = paramt.v;
      ((g.hm)localObject).f.f = paramt.x;
      ((g.hm)localObject).f.h = paramt.i;
      paramar = a(paramt, ((g.hm)localObject).f);
    }
  }

  public void e(g.t paramt, g.ar paramar)
  {
    if (!(paramt instanceof g.im))
      return;
    Object localObject;
    if (a.c(paramt.o) >= 17)
    {
      localObject = new g.hm();
      if (paramar == null)
        break label91;
      ((g.hm)localObject).f = paramar.f.d;
    }
    while (true)
    {
      ((g.hm)localObject).b = paramar.C;
      a((g.n)localObject, paramar, paramt, null, null, null);
      return;
      localObject = new g.hn();
      ((g.hm)localObject).g = new byte[15];
      Utilities.b.nextBytes(((g.hm)localObject).g);
      break;
      label91: ((g.hm)localObject).f = new g.gl();
      ((g.hm)localObject).f.e = paramt.v;
      ((g.hm)localObject).f.f = paramt.x;
      paramar = a(paramt, ((g.hm)localObject).f);
    }
  }

  public void f(g.t paramt, g.ar paramar)
  {
    if (!(paramt instanceof g.im))
      return;
    Object localObject;
    if (a.c(paramt.o) >= 17)
    {
      localObject = new g.hm();
      if (paramar == null)
        break label91;
      ((g.hm)localObject).f = paramar.f.d;
    }
    while (true)
    {
      ((g.hm)localObject).b = paramar.C;
      a((g.n)localObject, paramar, paramt, null, null, null);
      return;
      localObject = new g.hn();
      ((g.hm)localObject).g = new byte[15];
      Utilities.b.nextBytes(((g.hm)localObject).g);
      break;
      label91: ((g.hm)localObject).f = new g.go();
      paramar = a(paramt, ((g.hm)localObject).f);
    }
  }

  public void g(g.t paramt, g.ar paramar)
  {
    if (!(paramt instanceof g.im))
      return;
    Object localObject;
    if (a.c(paramt.o) >= 17)
    {
      localObject = new g.hm();
      if (paramar == null)
        break label91;
      ((g.hm)localObject).f = paramar.f.d;
    }
    while (true)
    {
      ((g.hm)localObject).b = paramar.C;
      a((g.n)localObject, paramar, paramt, null, null, null);
      return;
      localObject = new g.hn();
      ((g.hm)localObject).g = new byte[15];
      Utilities.b.nextBytes(((g.hm)localObject).g);
      break;
      label91: ((g.hm)localObject).f = new g.gu();
      ((g.hm)localObject).f.b = paramt.n;
      paramar = a(paramt, ((g.hm)localObject).f);
      u localu = new u(paramar, null, false);
      localu.a.y = 1;
      ArrayList localArrayList = new ArrayList();
      localArrayList.add(localu);
      v.a().a(paramar.E, localArrayList);
      y.a().a(y.c, new Object[0]);
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.ab
 * JD-Core Version:    0.6.0
 */