package org.vidogram.tgnet;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.NetworkInfo.State;
import android.os.Build.VERSION;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InterfaceAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.vidogram.messenger.ApplicationLoader;
import org.vidogram.messenger.Utilities;
import org.vidogram.messenger.a;
import org.vidogram.messenger.h;
import org.vidogram.messenger.n;
import org.vidogram.messenger.y;

public class ConnectionsManager
{
  private static volatile ConnectionsManager h = null;
  private long a = System.currentTimeMillis();
  private boolean b = true;
  private int c = 1;
  private boolean d = false;
  private int e = native_getConnectionState();
  private AtomicInteger f = new AtomicInteger(1);
  private PowerManager.WakeLock g = null;

  public ConnectionsManager()
  {
    try
    {
      this.g = ((PowerManager)ApplicationLoader.a.getSystemService("power")).newWakeLock(1, "lock");
      this.g.setReferenceCounted(false);
      return;
    }
    catch (Exception localException)
    {
      n.a("tmessages", localException);
    }
  }

  public static ConnectionsManager a()
  {
    Object localObject1 = h;
    if (localObject1 == null)
    {
      monitorenter;
      try
      {
        ConnectionsManager localConnectionsManager = h;
        localObject1 = localConnectionsManager;
        if (localConnectionsManager == null)
        {
          localObject1 = new ConnectionsManager();
          h = (ConnectionsManager)localObject1;
        }
        return localObject1;
      }
      finally
      {
        monitorexit;
      }
    }
    return (ConnectionsManager)localObject2;
  }

  public static void h()
  {
    a.a(new Runnable()
    {
      public void run()
      {
        try
        {
          if (!ConnectionsManager.b(ConnectionsManager.a()).isHeld())
          {
            ConnectionsManager.b(ConnectionsManager.a()).acquire(10000L);
            n.b("tmessages", "acquire wakelock");
          }
          return;
        }
        catch (Exception localException)
        {
          n.a("tmessages", localException);
        }
      }
    });
  }

  public static boolean j()
  {
    try
    {
      NetworkInfo localNetworkInfo = ((ConnectivityManager)ApplicationLoader.a.getSystemService("connectivity")).getActiveNetworkInfo();
      if (localNetworkInfo != null)
      {
        boolean bool = localNetworkInfo.isRoaming();
        return bool;
      }
    }
    catch (Exception localException)
    {
      n.a("tmessages", localException);
    }
    return false;
  }

  public static boolean k()
  {
    try
    {
      Object localObject = ((ConnectivityManager)ApplicationLoader.a.getSystemService("connectivity")).getNetworkInfo(1);
      if (localObject != null)
      {
        localObject = ((NetworkInfo)localObject).getState();
        NetworkInfo.State localState = NetworkInfo.State.CONNECTED;
        if (localObject == localState)
          return true;
      }
    }
    catch (Exception localException)
    {
      n.a("tmessages", localException);
    }
    return false;
  }

  @SuppressLint({"NewApi"})
  protected static boolean l()
  {
    int i1 = 1;
    if (Build.VERSION.SDK_INT < 19)
    {
      i1 = 0;
      return i1;
    }
    Object localObject;
    int i;
    label113: InetAddress localInetAddress;
    if (org.vidogram.messenger.d.a)
      try
      {
        Enumeration localEnumeration1 = NetworkInterface.getNetworkInterfaces();
        while (localEnumeration1.hasMoreElements())
        {
          localObject = (NetworkInterface)localEnumeration1.nextElement();
          if ((!((NetworkInterface)localObject).isUp()) || (((NetworkInterface)localObject).isLoopback()) || (((NetworkInterface)localObject).getInterfaceAddresses().isEmpty()))
            continue;
          n.a("tmessages", "valid interface: " + localObject);
          localObject = ((NetworkInterface)localObject).getInterfaceAddresses();
          i = 0;
          if (i >= ((List)localObject).size())
            continue;
          localInetAddress = ((InterfaceAddress)((List)localObject).get(i)).getAddress();
          if (org.vidogram.messenger.d.a)
            n.a("tmessages", "address: " + localInetAddress.getHostAddress());
          if ((localInetAddress.isLinkLocalAddress()) || (localInetAddress.isLoopbackAddress()) || (localInetAddress.isMulticastAddress()) || (!org.vidogram.messenger.d.a))
            break label434;
          n.a("tmessages", "address is good");
        }
      }
      catch (Throwable localThrowable1)
      {
        n.a("tmessages", localThrowable1);
      }
    while (true)
    {
      try
      {
        Enumeration localEnumeration2 = NetworkInterface.getNetworkInterfaces();
        int n = 0;
        m = 0;
        if (!localEnumeration2.hasMoreElements())
          continue;
        localObject = (NetworkInterface)localEnumeration2.nextElement();
        if ((!((NetworkInterface)localObject).isUp()) || (((NetworkInterface)localObject).isLoopback()))
          continue;
        localObject = ((NetworkInterface)localObject).getInterfaceAddresses();
        k = 0;
        i = m;
        j = n;
        n = j;
        m = i;
        if (k >= ((List)localObject).size())
          continue;
        localInetAddress = ((InterfaceAddress)((List)localObject).get(k)).getAddress();
        if ((localInetAddress.isLinkLocalAddress()) || (localInetAddress.isLoopbackAddress()))
          continue;
        if (!localInetAddress.isMulticastAddress())
          continue;
        m = i;
        i = j;
        j = m;
        break label441;
        if (!(localInetAddress instanceof Inet6Address))
          continue;
        m = 1;
        j = i;
        i = m;
        break label441;
        if (!(localInetAddress instanceof Inet4Address))
          continue;
        boolean bool = localInetAddress.getHostAddress().startsWith("192.0.0.");
        if (bool)
          continue;
        i = j;
        j = 1;
        break label441;
        if ((m == 0) && (n != 0))
          break;
        return false;
      }
      catch (Throwable localThrowable2)
      {
        n.a("tmessages", localThrowable2);
        continue;
        m = i;
        i = j;
        j = m;
      }
      label434: i += 1;
      break label113;
      label441: int m = k + 1;
      int k = j;
      int j = i;
      i = k;
      k = m;
    }
  }

  public static boolean m()
  {
    try
    {
      Object localObject = (ConnectivityManager)ApplicationLoader.a.getSystemService("connectivity");
      NetworkInfo localNetworkInfo = ((ConnectivityManager)localObject).getActiveNetworkInfo();
      if ((localNetworkInfo != null) && ((localNetworkInfo.isConnectedOrConnecting()) || (localNetworkInfo.isAvailable())))
        break label89;
      localNetworkInfo = ((ConnectivityManager)localObject).getNetworkInfo(0);
      if ((localNetworkInfo != null) && (localNetworkInfo.isConnectedOrConnecting()))
        return true;
      localObject = ((ConnectivityManager)localObject).getNetworkInfo(1);
      if (localObject != null)
      {
        boolean bool = ((NetworkInfo)localObject).isConnectedOrConnecting();
        if (bool)
          return true;
      }
    }
    catch (Exception localException)
    {
      n.a("tmessages", localException);
      return true;
    }
    return false;
    label89: return true;
  }

  private void n()
  {
    native_setUseIpv6(l());
    native_setNetworkAvailable(m());
  }

  public static native void native_applyDatacenterAddress(int paramInt1, String paramString, int paramInt2);

  public static native void native_bindRequestToGuid(int paramInt1, int paramInt2);

  public static native void native_cancelRequest(int paramInt, boolean paramBoolean);

  public static native void native_cancelRequestsForGuid(int paramInt);

  public static native void native_cleanUp();

  public static native int native_getConnectionState();

  public static native int native_getCurrentTime();

  public static native int native_getTimeDifference();

  public static native void native_init(int paramInt1, int paramInt2, int paramInt3, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, int paramInt4, boolean paramBoolean);

  public static native void native_pauseNetwork();

  public static native void native_resumeNetwork(boolean paramBoolean);

  public static native void native_sendRequest(int paramInt1, d paramd, b paramb, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean, int paramInt5);

  public static native void native_setJava(boolean paramBoolean);

  public static native void native_setNetworkAvailable(boolean paramBoolean);

  public static native void native_setPushConnectionEnabled(boolean paramBoolean);

  public static native void native_setUseIpv6(boolean paramBoolean);

  public static native void native_switchBackend();

  public int a(f paramf, c paramc)
  {
    return a(paramf, paramc, null, 0);
  }

  public int a(f paramf, c paramc, int paramInt)
  {
    return a(paramf, paramc, null, paramInt, 2147483647, 1, true);
  }

  public int a(f paramf, c paramc, int paramInt1, int paramInt2)
  {
    return a(paramf, paramc, null, paramInt1, 2147483647, paramInt2, true);
  }

  public int a(f paramf, c paramc, b paramb, int paramInt)
  {
    return a(paramf, paramc, paramb, paramInt, 2147483647, 1, true);
  }

  public int a(f paramf, c paramc, b paramb, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    int i = this.f.getAndIncrement();
    Utilities.c.b(new Runnable(paramf, i, paramc, paramb, paramInt1, paramInt2, paramInt3, paramBoolean)
    {
      public void run()
      {
        n.b("tmessages", "send request " + this.a + " with token = " + this.b);
        try
        {
          NativeByteBuffer localNativeByteBuffer = new NativeByteBuffer(this.a.b());
          this.a.a(localNativeByteBuffer);
          this.a.a();
          ConnectionsManager.native_sendRequest(localNativeByteBuffer.a, new d()
          {
          }
          , this.d, this.e, this.f, this.g, this.h, this.b);
          return;
        }
        catch (Exception localException)
        {
          n.a("tmessages", localException);
        }
      }
    });
    return i;
  }

  public void a(int paramInt)
  {
    native_cancelRequestsForGuid(paramInt);
  }

  public void a(int paramInt1, int paramInt2)
  {
    native_bindRequestToGuid(paramInt1, paramInt2);
  }

  public void a(int paramInt1, int paramInt2, int paramInt3, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, int paramInt4, boolean paramBoolean)
  {
    native_init(paramInt1, paramInt2, paramInt3, paramString1, paramString2, paramString3, paramString4, paramString5, paramString6, paramInt4, paramBoolean);
    n();
    paramString1 = new BroadcastReceiver()
    {
      public void onReceive(Context paramContext, Intent paramIntent)
      {
        ConnectionsManager.a(ConnectionsManager.this);
      }
    };
    paramString2 = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
    ApplicationLoader.a.registerReceiver(paramString1, paramString2);
  }

  public void a(int paramInt1, String paramString, int paramInt2)
  {
    native_applyDatacenterAddress(paramInt1, paramString, paramInt2);
  }

  public void a(int paramInt, boolean paramBoolean)
  {
    native_cancelRequest(paramInt, paramBoolean);
  }

  public void a(String paramString)
  {
  }

  public void a(boolean paramBoolean)
  {
    native_setPushConnectionEnabled(paramBoolean);
  }

  public void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (!paramBoolean2)
    {
      this.b = paramBoolean1;
      n.b("tmessages", "app paused = " + paramBoolean1);
    }
    if (paramBoolean1)
    {
      if (this.a == 0L)
        this.a = System.currentTimeMillis();
      native_pauseNetwork();
    }
    do
      return;
    while (this.b);
    n.a("tmessages", "reset app pause time");
    if ((this.a != 0L) && (System.currentTimeMillis() - this.a > 5000L))
      org.vidogram.messenger.f.a().g();
    this.a = 0L;
    native_resumeNetwork(false);
  }

  public int b()
  {
    return native_getCurrentTime();
  }

  public void b(boolean paramBoolean)
  {
    a.a(new Runnable(paramBoolean)
    {
      public void run()
      {
        if (ConnectionsManager.c(ConnectionsManager.this) == this.a);
        do
        {
          return;
          ConnectionsManager.a(ConnectionsManager.this, this.a);
        }
        while (ConnectionsManager.d(ConnectionsManager.this) != 3);
        y.a().a(y.aq, new Object[0]);
      }
    });
  }

  public int c()
  {
    return native_getTimeDifference();
  }

  public void d()
  {
    native_cleanUp();
  }

  public int e()
  {
    if ((this.e == 3) && (this.d))
      return 4;
    return this.e;
  }

  public void f()
  {
    native_switchBackend();
  }

  public void g()
  {
    native_resumeNetwork(true);
  }

  public int i()
  {
    int i = this.c;
    this.c = (i + 1);
    return i;
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.tgnet.ConnectionsManager
 * JD-Core Version:    0.6.0
 */