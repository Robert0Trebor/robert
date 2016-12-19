package org.vidogram.messenger;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.ProgressDialog;
import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.database.ContentObserver;
import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Point;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.AudioManager;
import android.media.AudioManager.OnAudioFocusChangeListener;
import android.media.AudioRecord;
import android.media.AudioTrack;
import android.media.AudioTrack.OnPlaybackPositionUpdateListener;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaCodecInfo;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecList;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Environment;
import android.os.Handler;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.os.Vibrator;
import android.provider.MediaStore.Images.Media;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import java.io.File;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Semaphore;
import org.vidogram.messenger.d.f;
import org.vidogram.messenger.f.b;
import org.vidogram.tgnet.ConnectionsManager;
import org.vidogram.tgnet.g.ab;
import org.vidogram.tgnet.g.ar;
import org.vidogram.tgnet.g.au;
import org.vidogram.tgnet.g.aw;
import org.vidogram.tgnet.g.az;
import org.vidogram.tgnet.g.hs;
import org.vidogram.tgnet.g.ht;
import org.vidogram.tgnet.g.hu;
import org.vidogram.tgnet.g.im;
import org.vidogram.tgnet.g.q;
import org.vidogram.tgnet.g.qi;
import org.vidogram.tgnet.g.r;
import org.vidogram.tgnet.g.rt;
import org.vidogram.tgnet.g.t;
import org.vidogram.tgnet.g.we;
import org.vidogram.ui.am;
import org.vidogram.ui.q;

public class MediaController
  implements SensorEventListener, AudioManager.OnAudioFocusChangeListener, y.b
{
  public static int[] a = new int[3];
  private static Runnable al;
  private static volatile MediaController bv;
  public static a e;
  private static final String[] f = { "_id", "bucket_id", "bucket_display_name", "_data", "datetaken", "orientation" };
  private static final String[] g = { "_id", "bucket_id", "bucket_display_name", "_data", "datetaken" };
  private boolean A;
  private boolean B;
  private boolean C;
  private boolean D;
  private boolean E;
  private float F;
  private float[] G = new float[3];
  private float[] H = new float[3];
  private float[] I = new float[3];
  private int J;
  private boolean K;
  private int L = 0;
  private boolean M;
  private ArrayList<u> N = new ArrayList();
  private final Object O = new Object();
  private boolean P = false;
  private boolean Q = true;
  private HashMap<String, u> R = new HashMap();
  private boolean S;
  private ArrayList<u> T;
  private HashMap<Integer, u> U;
  private int V = 0;
  private ArrayList<i> W = new ArrayList();
  private ArrayList<i> X = new ArrayList();
  private ArrayList<i> Y = new ArrayList();
  private ArrayList<i> Z = new ArrayList();
  private long aA;
  private long aB;
  private int aC = 0;
  private Timer aD = null;
  private final Object aE = new Object();
  private int aF;
  private ArrayList<u> aG = new ArrayList();
  private ArrayList<u> aH = new ArrayList();
  private int aI;
  private boolean aJ;
  private boolean aK;
  private boolean aL;
  private org.vidogram.messenger.a.a aM;
  private AudioRecord aN = null;
  private g.hs aO = null;
  private File aP = null;
  private long aQ;
  private long aR;
  private long aS;
  private u aT;
  private h aU;
  private h aV;
  private ArrayList<b> aW = new ArrayList();
  private ArrayList<b> aX = new ArrayList();
  private final Object aY = new Object();
  private final Object aZ = new Object();
  private ArrayList<i> aa = new ArrayList();
  private ArrayList<i> ab = new ArrayList();
  private HashMap<String, i> ac = new HashMap();
  private boolean ad = true;
  private boolean ae = true;
  private boolean af = true;
  private boolean ag = true;
  private boolean ah = true;
  private boolean ai;
  private int aj;
  private Runnable ak;
  private HashMap<String, ArrayList<WeakReference<e>>> am = new HashMap();
  private HashMap<String, ArrayList<u>> an = new HashMap();
  private HashMap<Integer, String> ao = new HashMap();
  private boolean ap = false;
  private HashMap<String, e> aq = new HashMap();
  private ArrayList<e> ar = new ArrayList();
  private int as = 0;
  private boolean at = false;
  private MediaPlayer au = null;
  private AudioTrack av = null;
  private int aw = 0;
  private u ax;
  private int ay = 0;
  private boolean az = false;
  public int b = 0;
  private short[] ba = new short[1024];
  private long bb;
  private final Object bc = new Object();
  private ArrayList<ByteBuffer> bd = new ArrayList();
  private ByteBuffer be;
  private int bf;
  private int bg;
  private Runnable bh;
  private h bi;
  private h bj;
  private Runnable bk = new Runnable()
  {
    public void run()
    {
      ByteBuffer localByteBuffer;
      int n;
      double d2;
      double d1;
      if (MediaController.a(MediaController.this) != null)
        if (!MediaController.b(MediaController.this).isEmpty())
        {
          localByteBuffer = (ByteBuffer)MediaController.b(MediaController.this).get(0);
          MediaController.b(MediaController.this).remove(0);
          localByteBuffer.rewind();
          n = MediaController.a(MediaController.this).read(localByteBuffer, localByteBuffer.capacity());
          if (n <= 0)
            break label514;
          localByteBuffer.limit(n);
          d2 = 0.0D;
          d1 = d2;
        }
      while (true)
      {
        int m;
        float f2;
        int j;
        double d3;
        try
        {
          long l = MediaController.d(MediaController.this);
          d1 = d2;
          l = n / 2 + l;
          d1 = d2;
          k = (int)(MediaController.d(MediaController.this) / l * MediaController.e(MediaController.this).length);
          d1 = d2;
          m = MediaController.e(MediaController.this).length;
          if (k == 0)
            continue;
          d1 = d2;
          f2 = MediaController.e(MediaController.this).length / k;
          f1 = 0.0F;
          j = 0;
          if (j >= k)
            continue;
          d1 = d2;
          MediaController.e(MediaController.this)[j] = MediaController.e(MediaController.this)[(int)f1];
          f1 += f2;
          j += 1;
          continue;
          localByteBuffer = ByteBuffer.allocateDirect(MediaController.c(MediaController.this));
          localByteBuffer.order(ByteOrder.nativeOrder());
          break;
          float f3 = n / 2.0F / (m - k);
          f1 = 0.0F;
          j = 0;
          d1 = d2;
          if (j >= n / 2)
            continue;
          d1 = d2;
          int i = localByteBuffer.getShort();
          d3 = d2;
          if (i <= 2500)
            continue;
          d3 = d2 + i * i;
          f2 = f1;
          m = k;
          if (j != (int)f1)
            break label542;
          d1 = d3;
          f2 = f1;
          m = k;
          if (k >= MediaController.e(MediaController.this).length)
            break label542;
          d1 = d3;
          MediaController.e(MediaController.this)[k] = i;
          f2 = f1 + f3;
          m = k + 1;
          break label542;
          d1 = d2;
          MediaController.a(MediaController.this, l);
          localByteBuffer.position(0);
          d1 = Math.sqrt(d2 / n / 2.0D);
          if (n == localByteBuffer.capacity())
            continue;
          bool = true;
          if (n == 0)
            continue;
          MediaController.i(MediaController.this).b(new Runnable(localByteBuffer, bool)
          {
            public void run()
            {
              int i;
              if (this.a.hasRemaining())
              {
                if (this.a.remaining() <= MediaController.f(MediaController.this).remaining())
                  break label280;
                i = this.a.limit();
                this.a.limit(MediaController.f(MediaController.this).remaining() + this.a.position());
              }
              while (true)
              {
                MediaController.f(MediaController.this).put(this.a);
                MediaController localMediaController;
                ByteBuffer localByteBuffer;
                if ((MediaController.f(MediaController.this).position() == MediaController.f(MediaController.this).limit()) || (this.b))
                {
                  localMediaController = MediaController.this;
                  localByteBuffer = MediaController.f(MediaController.this);
                  if (this.b)
                    break label247;
                }
                label247: for (int j = MediaController.f(MediaController.this).limit(); ; j = this.a.position())
                {
                  if (MediaController.a(localMediaController, localByteBuffer, j) != 0)
                  {
                    MediaController.f(MediaController.this).rewind();
                    MediaController.b(MediaController.this, MediaController.g(MediaController.this) + MediaController.f(MediaController.this).limit() / 2 / 16);
                  }
                  if (i == -1)
                    break;
                  this.a.limit(i);
                  break;
                }
                MediaController.h(MediaController.this).b(new Runnable()
                {
                  public void run()
                  {
                    MediaController.b(MediaController.this).add(MediaController.1.1.this.a);
                  }
                });
                return;
                label280: i = -1;
              }
            }
          });
          MediaController.h(MediaController.this).b(MediaController.j(MediaController.this));
          a.a(new Runnable(d1)
          {
            public void run()
            {
              y.a().a(y.aH, new Object[] { Long.valueOf(System.currentTimeMillis() - MediaController.k(MediaController.this)), Double.valueOf(this.a) });
            }
          });
          return;
        }
        catch (Exception localException)
        {
          n.a("tmessages", localException);
          d2 = d1;
          continue;
          boolean bool = false;
          continue;
        }
        label514: MediaController.b(MediaController.this).add(localByteBuffer);
        MediaController.a(MediaController.this, MediaController.l(MediaController.this));
        return;
        label542: j += 1;
        float f1 = f2;
        int k = m;
        d2 = d3;
      }
    }
  };
  private d bl = null;
  private h bm = null;
  private long bn = 0L;
  private long bo = 0L;
  private long bp = 0L;
  private g.t bq = null;
  private ArrayList<Long> br = null;
  private int bs = 0;
  private k bt = null;
  private String[] bu = null;
  public int c = 0;
  public int d = 0;
  private final Object h = new Object();
  private HashMap<Long, Long> i = new HashMap();
  private SensorManager j;
  private PowerManager.WakeLock k;
  private Sensor l;
  private Sensor m;
  private Sensor n;
  private Sensor o;
  private boolean p;
  private q q;
  private boolean r;
  private int s;
  private int t;
  private int u;
  private long v;
  private long w = 0L;
  private boolean x;
  private boolean y;
  private float z = -100.0F;

  static
  {
    bv = null;
  }

  public MediaController()
  {
    try
    {
      this.bf = AudioRecord.getMinBufferSize(16000, 16, 2);
      if (this.bf <= 0)
        this.bf = 1280;
      this.ay = AudioTrack.getMinBufferSize(48000, 4, 2);
      if (this.ay <= 0)
      {
        this.ay = 3840;
        break label1281;
        while (i1 < 5)
        {
          ByteBuffer localByteBuffer = ByteBuffer.allocateDirect(4096);
          localByteBuffer.order(ByteOrder.nativeOrder());
          this.bd.add(localByteBuffer);
          i1 += 1;
        }
        while (i1 < 3)
        {
          this.aX.add(new b(this.ay));
          i1 += 1;
        }
      }
    }
    catch (Exception localException5)
    {
      while (true)
      {
        n.a("tmessages", localException1);
        try
        {
          this.j = ((SensorManager)ApplicationLoader.a.getSystemService("sensor"));
          this.n = this.j.getDefaultSensor(10);
          this.o = this.j.getDefaultSensor(9);
          if ((this.n == null) || (this.o == null))
          {
            n.a("tmessages", "gravity or linear sensor not found");
            this.m = this.j.getDefaultSensor(1);
            this.n = null;
            this.o = null;
          }
          this.l = this.j.getDefaultSensor(8);
          this.k = ((PowerManager)ApplicationLoader.a.getSystemService("power")).newWakeLock(32, "proximity");
          this.be = ByteBuffer.allocateDirect(1920);
          this.bi = new h("recordQueue");
          this.bi.setPriority(10);
          this.bj = new h("fileEncodingQueue");
          this.bj.setPriority(10);
          this.aV = new h("playerQueue");
          this.aU = new h("fileDecodingQueue");
          localObject1 = ApplicationLoader.a.getSharedPreferences("mainconfig", 0);
          this.b = ((SharedPreferences)localObject1).getInt("mobileDataDownloadMask", 51);
          this.c = ((SharedPreferences)localObject1).getInt("wifiDownloadMask", 51);
          this.d = ((SharedPreferences)localObject1).getInt("roamingDownloadMask", 0);
          this.ad = ((SharedPreferences)localObject1).getBoolean("save_gallery", false);
          this.ae = ((SharedPreferences)localObject1).getBoolean("autoplay_gif", true);
          this.af = ((SharedPreferences)localObject1).getBoolean("raise_to_speak", true);
          this.ag = ((SharedPreferences)localObject1).getBoolean("custom_tabs", true);
          this.ah = ((SharedPreferences)localObject1).getBoolean("direct_share", true);
          this.ai = ((SharedPreferences)localObject1).getBoolean("shuffleMusic", false);
          this.aj = ((SharedPreferences)localObject1).getInt("repeatMode", 0);
          a.a(new Runnable()
          {
            public void run()
            {
              y.a().a(MediaController.this, y.aA);
              y.a().a(MediaController.this, y.a);
              y.a().a(MediaController.this, y.e);
              y.a().a(MediaController.this, y.az);
              y.a().a(MediaController.this, y.ay);
              y.a().a(MediaController.this, y.ax);
              y.a().a(MediaController.this, y.v);
              y.a().a(MediaController.this, y.X);
              y.a().a(MediaController.this, y.al);
              y.a().a(MediaController.this, y.am);
            }
          });
          localObject1 = new BroadcastReceiver()
          {
            public void onReceive(Context paramContext, Intent paramIntent)
            {
              MediaController.this.d();
            }
          };
          localObject2 = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
          ApplicationLoader.a.registerReceiver((BroadcastReceiver)localObject1, (IntentFilter)localObject2);
          if (ad.b())
            d();
          if (Build.VERSION.SDK_INT >= 16)
            this.bu = new String[] { "_data", "_display_name", "bucket_display_name", "datetaken", "title", "width", "height" };
        }
        catch (Exception localException5)
        {
          try
          {
            ApplicationLoader.a.getContentResolver().registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, false, new f());
          }
          catch (Exception localException5)
          {
            try
            {
              ApplicationLoader.a.getContentResolver().registerContentObserver(MediaStore.Images.Media.INTERNAL_CONTENT_URI, false, new g());
            }
            catch (Exception localException5)
            {
              try
              {
                while (true)
                {
                  Object localObject1 = new PhoneStateListener()
                  {
                    public void onCallStateChanged(int paramInt, String paramString)
                    {
                      if (paramInt == 1)
                        if ((!MediaController.this.d(MediaController.this.j())) || (MediaController.this.s()));
                      do
                      {
                        MediaController.this.b(MediaController.this.j());
                        while (true)
                        {
                          MediaController.a(MediaController.this, true);
                          return;
                          if ((MediaController.q(MediaController.this) == null) && (MediaController.r(MediaController.this) == null))
                            continue;
                          MediaController.this.d(2);
                        }
                        if (paramInt != 0)
                          continue;
                        MediaController.a(MediaController.this, false);
                        return;
                      }
                      while (paramInt != 2);
                      MediaController.a(MediaController.this, true);
                    }
                  };
                  Object localObject2 = (TelephonyManager)ApplicationLoader.a.getSystemService("phone");
                  if (localObject2 != null)
                    ((TelephonyManager)localObject2).listen((PhoneStateListener)localObject1, 32);
                  return;
                  localException2 = localException2;
                  n.a("tmessages", localException2);
                  continue;
                  this.bu = new String[] { "_data", "_display_name", "bucket_display_name", "datetaken", "title" };
                  continue;
                  localException3 = localException3;
                  n.a("tmessages", localException3);
                  continue;
                  localException4 = localException4;
                  n.a("tmessages", localException4);
                }
              }
              catch (Exception localException5)
              {
                n.a("tmessages", localException5);
                return;
              }
            }
          }
        }
        label1281: int i1 = 0;
        continue;
        i1 = 0;
      }
    }
  }

  private void H()
  {
    while (true)
    {
      try
      {
        if (this.L == 1)
          break label54;
        f1 = 1.0F;
        if (this.au == null)
          continue;
        this.au.setVolume(f1, f1);
        return;
        if (this.av != null)
        {
          this.av.setStereoVolume(f1, f1);
          return;
        }
      }
      catch (Exception localException)
      {
        n.a("tmessages", localException);
      }
      return;
      label54: float f1 = 0.2F;
    }
  }

  private void I()
  {
    synchronized (this.aE)
    {
      Timer localTimer = this.aD;
      if (localTimer != null);
      try
      {
        this.aD.cancel();
        this.aD = null;
        return;
      }
      catch (Exception localException)
      {
        while (true)
          n.a("tmessages", localException);
      }
    }
  }

  private int J()
  {
    if (ConnectionsManager.k())
      return this.c;
    if (ConnectionsManager.j())
      return this.d;
    return this.b;
  }

  private void K()
  {
    Iterator localIterator = this.aq.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      a((String)localEntry.getKey(), (e)localEntry.getValue());
    }
    this.aq.clear();
    localIterator = this.ar.iterator();
    while (localIterator.hasNext())
      a((e)localIterator.next());
    this.ar.clear();
  }

  private void L()
  {
    this.aU.b(new Runnable()
    {
      public void run()
      {
        if (MediaController.B(MediaController.this))
          MediaController.C(MediaController.this);
        while (true)
        {
          return;
          int i = 0;
          while (true)
          {
            MediaController.b localb = null;
            synchronized (MediaController.D(MediaController.this))
            {
              if (!MediaController.E(MediaController.this).isEmpty())
              {
                localb = (MediaController.b)MediaController.E(MediaController.this).get(0);
                MediaController.E(MediaController.this).remove(0);
              }
              if (!MediaController.F(MediaController.this).isEmpty())
                i = 1;
              if (localb == null)
                break label249;
              MediaController.a(MediaController.this, localb.a, MediaController.G(MediaController.this), MediaController.a);
              localb.c = MediaController.a[0];
              localb.e = MediaController.a[1];
              localb.d = MediaController.a[2];
              if (localb.d == 1)
                MediaController.b(MediaController.this, true);
              if (localb.c == 0)
                break;
              localb.a.rewind();
              localb.a.get(localb.b);
            }
            synchronized (MediaController.D(MediaController.this))
            {
              MediaController.F(MediaController.this).add(localb);
              i = 1;
              continue;
              localObject1 = finally;
              throw localObject1;
            }
          }
          synchronized (MediaController.D(MediaController.this))
          {
            MediaController.E(MediaController.this).add(localObject2);
            label249: if (i == 0)
              continue;
            MediaController.C(MediaController.this);
            return;
          }
        }
      }
    });
  }

  private void M()
  {
    this.aV.b(new Runnable()
    {
      public void run()
      {
        while (true)
        {
          synchronized (MediaController.H(MediaController.this))
          {
            if ((MediaController.u(MediaController.this) == null) || (MediaController.u(MediaController.this).getPlayState() != 3))
              return;
            synchronized (MediaController.D(MediaController.this))
            {
              if (MediaController.F(MediaController.this).isEmpty())
                break label292;
              ??? = (MediaController.b)MediaController.F(MediaController.this).get(0);
              MediaController.F(MediaController.this).remove(0);
              if (??? == null);
            }
          }
          try
          {
            i = MediaController.u(MediaController.this).write(((MediaController.b)???).b, 0, ((MediaController.b)???).c);
            MediaController.I(MediaController.this);
            if (i > 0)
            {
              long l = ((MediaController.b)???).e;
              if (((MediaController.b)???).d == 1)
                a.a(new Runnable(l, i, MediaController.J(MediaController.this))
                {
                  public void run()
                  {
                    MediaController.c(MediaController.this, this.a);
                    if (this.b != -1)
                    {
                      if (MediaController.u(MediaController.this) != null)
                        MediaController.u(MediaController.this).setNotificationMarkerPosition(1);
                      if (this.c == 1)
                        MediaController.this.a(true, true, true);
                    }
                  }
                });
            }
            else
            {
              if (((MediaController.b)???).d != 1)
                MediaController.C(MediaController.this);
              if ((??? == null) || ((??? != null) && (((MediaController.b)???).d != 1)))
                MediaController.K(MediaController.this);
              if (??? == null)
                break;
              synchronized (MediaController.D(MediaController.this))
              {
                MediaController.E(MediaController.this).add(???);
                return;
              }
              localObject6 = finally;
              monitorexit;
              throw localObject6;
              localObject3 = finally;
              monitorexit;
              throw localObject3;
            }
          }
          catch (Exception localException)
          {
            while (true)
            {
              n.a("tmessages", localException);
              int i = 0;
              continue;
              i = -1;
            }
          }
          label292: Object localObject4 = null;
        }
      }
    });
  }

  private void N()
  {
    if (this.aG.isEmpty());
    while (true)
    {
      return;
      ArrayList localArrayList = new ArrayList(this.aG);
      this.aH.clear();
      u localu = (u)this.aG.get(this.aI);
      localArrayList.remove(this.aI);
      this.aH.add(localu);
      int i2 = localArrayList.size();
      int i1 = 0;
      while (i1 < i2)
      {
        int i3 = Utilities.b.nextInt(localArrayList.size());
        this.aH.add(localArrayList.get(i3));
        localArrayList.remove(i3);
        i1 += 1;
      }
    }
  }

  private void O()
  {
    Object localObject2 = null;
    if ((J() & 0x10) == 0)
      return;
    Object localObject1;
    label26: u localu;
    if (this.ai)
    {
      localObject1 = this.aH;
      if ((localObject1 == null) || (((ArrayList)localObject1).size() < 2))
        break label191;
      int i2 = this.aI + 1;
      int i1 = i2;
      if (i2 >= ((ArrayList)localObject1).size())
        i1 = 0;
      localu = (u)((ArrayList)localObject1).get(i1);
      localObject1 = localObject2;
      if (localu.a.A != null)
      {
        localObject1 = localObject2;
        if (localu.a.A.length() > 0)
        {
          localObject1 = new File(localu.a.A);
          if (((File)localObject1).exists())
            break label206;
          localObject1 = localObject2;
        }
      }
    }
    label191: label204: label206: 
    while (true)
    {
      if (localObject1 != null);
      for (localObject2 = localObject1; ; localObject2 = m.b(localu.a))
      {
        if (((localObject2 != null) && (((File)localObject2).exists())) && ((localObject2 == null) || (localObject2 == localObject1) || (((File)localObject2).exists()) || (!localu.G())))
          break label204;
        m.a().a(localu.A(), false, false);
        return;
        localObject1 = this.aG;
        break label26;
        break;
      }
      break;
    }
  }

  private void P()
  {
    if (!this.N.isEmpty());
    while (true)
    {
      int i1;
      synchronized (this.h)
      {
        this.P = false;
        ??? = (u)this.N.get(0);
        Intent localIntent = new Intent(ApplicationLoader.a, VideoEncodingService.class);
        localIntent.putExtra("path", ((u)???).a.A);
        if (((u)???).a.j.k == null)
          continue;
        i1 = 0;
        if (i1 >= ((u)???).a.j.k.o.size())
          continue;
        if (((g.r)((u)???).a.j.k.o.get(i1) instanceof g.ht))
        {
          localIntent.putExtra("gif", true);
          ApplicationLoader.a.startService(localIntent);
          l.a((u)???);
          return;
        }
      }
      i1 += 1;
    }
  }

  private void Q()
  {
    synchronized (this.h)
    {
      boolean bool = this.P;
      if (bool)
        throw new RuntimeException("canceled conversion");
    }
  }

  @SuppressLint({"NewApi"})
  public static int a(MediaCodecInfo paramMediaCodecInfo, String paramString)
  {
    int i1 = 0;
    paramString = paramMediaCodecInfo.getCapabilitiesForType(paramString);
    int i2 = 0;
    while (i1 < paramString.colorFormats.length)
    {
      int i3 = paramString.colorFormats[i1];
      if (g(i3))
      {
        if ((!paramMediaCodecInfo.getName().equals("OMX.SEC.AVC.Encoder")) || (i3 != 19))
          return i3;
        i2 = i3;
      }
      i1 += 1;
    }
    return i2;
  }

  @TargetApi(16)
  private int a(MediaExtractor paramMediaExtractor, boolean paramBoolean)
  {
    int i2 = paramMediaExtractor.getTrackCount();
    int i1 = 0;
    while (i1 < i2)
    {
      String str = paramMediaExtractor.getTrackFormat(i1).getString("mime");
      if (paramBoolean)
      {
        if (!str.startsWith("audio/"));
      }
      else
        do
          return i1;
        while (str.startsWith("video/"));
      i1 += 1;
    }
    return -5;
  }

  @TargetApi(16)
  private long a(u paramu, MediaExtractor paramMediaExtractor, b paramb, MediaCodec.BufferInfo paramBufferInfo, long paramLong1, long paramLong2, File paramFile, boolean paramBoolean)
  {
    int i4 = a(paramMediaExtractor, paramBoolean);
    int i2;
    int i1;
    long l2;
    long l1;
    label86: int i3;
    int i6;
    label143: long l3;
    if (i4 >= 0)
    {
      paramMediaExtractor.selectTrack(i4);
      Object localObject = paramMediaExtractor.getTrackFormat(i4);
      int i5 = paramb.a((MediaFormat)localObject, paramBoolean);
      i2 = ((MediaFormat)localObject).getInteger("max-input-size");
      i1 = 0;
      if (paramLong1 > 0L)
      {
        paramMediaExtractor.seekTo(paramLong1, 0);
        localObject = ByteBuffer.allocateDirect(i2);
        l2 = -1L;
        Q();
        l1 = -100L;
        if (i1 != 0)
          break label378;
        Q();
        i3 = 0;
        i2 = 0;
        i6 = paramMediaExtractor.getSampleTrackIndex();
        if (i6 != i4)
          break label342;
        paramBufferInfo.size = paramMediaExtractor.readSampleData((ByteBuffer)localObject, 0);
        if (paramBufferInfo.size < 0)
          break label324;
        paramBufferInfo.presentationTimeUs = paramMediaExtractor.getSampleTime();
        if ((paramBufferInfo.size <= 0) || (i2 != 0))
          break label394;
        l3 = l2;
        if (paramLong1 > 0L)
        {
          l3 = l2;
          if (l2 == -1L)
            l3 = paramBufferInfo.presentationTimeUs;
        }
        if ((paramLong2 >= 0L) && (paramBufferInfo.presentationTimeUs >= paramLong2))
          break label336;
        if (paramBufferInfo.presentationTimeUs > l1)
        {
          paramBufferInfo.offset = 0;
          paramBufferInfo.flags = paramMediaExtractor.getSampleFlags();
          if (paramb.a(i5, (ByteBuffer)localObject, paramBufferInfo, paramBoolean))
            a(paramu, paramFile, false, false);
        }
        l1 = paramBufferInfo.presentationTimeUs;
      }
    }
    while (true)
    {
      label262: i3 = i2;
      l2 = l1;
      long l4 = l3;
      if (i2 == 0)
      {
        paramMediaExtractor.advance();
        l4 = l3;
        l2 = l1;
        i3 = i2;
      }
      label296: if (i3 != 0)
        i1 = 1;
      while (true)
      {
        l1 = l2;
        l2 = l4;
        break label86;
        paramMediaExtractor.seekTo(0L, 0);
        break;
        label324: paramBufferInfo.size = 0;
        i2 = 1;
        break label143;
        label336: i2 = 1;
        break label262;
        label342: if (i6 == -1)
        {
          i3 = 1;
          l4 = l2;
          l2 = l1;
          break label296;
        }
        paramMediaExtractor.advance();
        l4 = l2;
        l2 = l1;
        break label296;
        label378: paramMediaExtractor.unselectTrack(i4);
        return l2;
        return -1L;
      }
      label394: l3 = l2;
    }
  }

  @SuppressLint({"NewApi"})
  public static MediaCodecInfo a(String paramString)
  {
    int i3 = MediaCodecList.getCodecCount();
    Object localObject1 = null;
    int i1 = 0;
    while (i1 < i3)
    {
      MediaCodecInfo localMediaCodecInfo = MediaCodecList.getCodecInfoAt(i1);
      Object localObject2;
      if (!localMediaCodecInfo.isEncoder())
      {
        localObject2 = localObject1;
        i1 += 1;
        localObject1 = localObject2;
        continue;
      }
      String[] arrayOfString = localMediaCodecInfo.getSupportedTypes();
      int i4 = arrayOfString.length;
      int i2 = 0;
      while (true)
      {
        localObject2 = localObject1;
        if (i2 >= i4)
          break;
        if (arrayOfString[i2].equalsIgnoreCase(paramString))
        {
          if (!localMediaCodecInfo.getName().equals("OMX.SEC.avc.enc"));
          do
            return localMediaCodecInfo;
          while (localMediaCodecInfo.getName().equals("OMX.SEC.AVC.Encoder"));
          localObject1 = localMediaCodecInfo;
        }
        i2 += 1;
      }
    }
    return localObject1;
  }

  // ERROR //
  public static String a(Uri paramUri, String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 6
    //   3: aload_0
    //   4: invokestatic 1064	org/vidogram/messenger/MediaController:d	(Landroid/net/Uri;)Ljava/lang/String;
    //   7: astore 4
    //   9: aload 4
    //   11: astore_3
    //   12: aload 4
    //   14: ifnonnull +44 -> 58
    //   17: getstatic 1065	org/vidogram/messenger/ad:d	I
    //   20: istore_2
    //   21: getstatic 1065	org/vidogram/messenger/ad:d	I
    //   24: iconst_1
    //   25: isub
    //   26: putstatic 1065	org/vidogram/messenger/ad:d	I
    //   29: iconst_0
    //   30: invokestatic 1068	org/vidogram/messenger/ad:a	(Z)V
    //   33: getstatic 1074	java/util/Locale:US	Ljava/util/Locale;
    //   36: ldc_w 1076
    //   39: iconst_2
    //   40: anewarray 4	java/lang/Object
    //   43: dup
    //   44: iconst_0
    //   45: iload_2
    //   46: invokestatic 1082	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   49: aastore
    //   50: dup
    //   51: iconst_1
    //   52: aload_1
    //   53: aastore
    //   54: invokestatic 1086	java/lang/String:format	(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   57: astore_3
    //   58: getstatic 511	org/vidogram/messenger/ApplicationLoader:a	Landroid/content/Context;
    //   61: invokevirtual 659	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   64: aload_0
    //   65: invokevirtual 1090	android/content/ContentResolver:openInputStream	(Landroid/net/Uri;)Ljava/io/InputStream;
    //   68: astore_0
    //   69: new 812	java/io/File
    //   72: dup
    //   73: invokestatic 823	org/vidogram/messenger/m:a	()Lorg/vidogram/messenger/m;
    //   76: iconst_4
    //   77: invokevirtual 1093	org/vidogram/messenger/m:b	(I)Ljava/io/File;
    //   80: aload_3
    //   81: invokespecial 1096	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   84: astore 5
    //   86: new 1098	java/io/FileOutputStream
    //   89: dup
    //   90: aload 5
    //   92: invokespecial 1101	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   95: astore_1
    //   96: aload_1
    //   97: astore 4
    //   99: aload_0
    //   100: astore_3
    //   101: sipush 20480
    //   104: newarray byte
    //   106: astore 7
    //   108: aload_1
    //   109: astore 4
    //   111: aload_0
    //   112: astore_3
    //   113: aload_0
    //   114: aload 7
    //   116: invokevirtual 1107	java/io/InputStream:read	([B)I
    //   119: istore_2
    //   120: iload_2
    //   121: iconst_m1
    //   122: if_icmpeq +58 -> 180
    //   125: aload_1
    //   126: astore 4
    //   128: aload_0
    //   129: astore_3
    //   130: aload_1
    //   131: aload 7
    //   133: iconst_0
    //   134: iload_2
    //   135: invokevirtual 1111	java/io/FileOutputStream:write	([BII)V
    //   138: goto -30 -> 108
    //   141: astore 5
    //   143: aload_1
    //   144: astore 4
    //   146: aload_0
    //   147: astore_3
    //   148: ldc_w 501
    //   151: aload 5
    //   153: invokestatic 506	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   156: aload_0
    //   157: ifnull +7 -> 164
    //   160: aload_0
    //   161: invokevirtual 1114	java/io/InputStream:close	()V
    //   164: aload 6
    //   166: astore_0
    //   167: aload_1
    //   168: ifnull +10 -> 178
    //   171: aload_1
    //   172: invokevirtual 1115	java/io/FileOutputStream:close	()V
    //   175: aload 6
    //   177: astore_0
    //   178: aload_0
    //   179: areturn
    //   180: aload_1
    //   181: astore 4
    //   183: aload_0
    //   184: astore_3
    //   185: aload 5
    //   187: invokevirtual 1118	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   190: astore 5
    //   192: aload 5
    //   194: astore_3
    //   195: aload_0
    //   196: ifnull +7 -> 203
    //   199: aload_0
    //   200: invokevirtual 1114	java/io/InputStream:close	()V
    //   203: aload_3
    //   204: astore_0
    //   205: aload_1
    //   206: ifnull -28 -> 178
    //   209: aload_1
    //   210: invokevirtual 1115	java/io/FileOutputStream:close	()V
    //   213: aload_3
    //   214: areturn
    //   215: astore_0
    //   216: ldc_w 501
    //   219: aload_0
    //   220: invokestatic 506	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   223: aload_3
    //   224: areturn
    //   225: astore_0
    //   226: ldc_w 501
    //   229: aload_0
    //   230: invokestatic 506	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   233: goto -30 -> 203
    //   236: astore_0
    //   237: ldc_w 501
    //   240: aload_0
    //   241: invokestatic 506	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   244: goto -80 -> 164
    //   247: astore_0
    //   248: ldc_w 501
    //   251: aload_0
    //   252: invokestatic 506	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   255: aconst_null
    //   256: areturn
    //   257: astore_1
    //   258: aconst_null
    //   259: astore 4
    //   261: aconst_null
    //   262: astore_0
    //   263: aload_0
    //   264: ifnull +7 -> 271
    //   267: aload_0
    //   268: invokevirtual 1114	java/io/InputStream:close	()V
    //   271: aload 4
    //   273: ifnull +8 -> 281
    //   276: aload 4
    //   278: invokevirtual 1115	java/io/FileOutputStream:close	()V
    //   281: aload_1
    //   282: athrow
    //   283: astore_0
    //   284: ldc_w 501
    //   287: aload_0
    //   288: invokestatic 506	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   291: goto -20 -> 271
    //   294: astore_0
    //   295: ldc_w 501
    //   298: aload_0
    //   299: invokestatic 506	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   302: goto -21 -> 281
    //   305: astore_1
    //   306: aconst_null
    //   307: astore 4
    //   309: goto -46 -> 263
    //   312: astore_1
    //   313: aload_3
    //   314: astore_0
    //   315: goto -52 -> 263
    //   318: astore 5
    //   320: aconst_null
    //   321: astore_1
    //   322: aconst_null
    //   323: astore_0
    //   324: goto -181 -> 143
    //   327: astore 5
    //   329: aconst_null
    //   330: astore_1
    //   331: goto -188 -> 143
    //
    // Exception table:
    //   from	to	target	type
    //   101	108	141	java/lang/Exception
    //   113	120	141	java/lang/Exception
    //   130	138	141	java/lang/Exception
    //   185	192	141	java/lang/Exception
    //   209	213	215	java/lang/Exception
    //   199	203	225	java/lang/Exception
    //   160	164	236	java/lang/Exception
    //   171	175	247	java/lang/Exception
    //   3	9	257	finally
    //   17	58	257	finally
    //   58	69	257	finally
    //   267	271	283	java/lang/Exception
    //   276	281	294	java/lang/Exception
    //   69	96	305	finally
    //   101	108	312	finally
    //   113	120	312	finally
    //   130	138	312	finally
    //   148	156	312	finally
    //   185	192	312	finally
    //   3	9	318	java/lang/Exception
    //   17	58	318	java/lang/Exception
    //   58	69	318	java/lang/Exception
    //   69	96	327	java/lang/Exception
  }

  public static MediaController a()
  {
    Object localObject1 = bv;
    if (localObject1 == null)
    {
      monitorenter;
      try
      {
        MediaController localMediaController = bv;
        localObject1 = localMediaController;
        if (localMediaController == null)
        {
          localObject1 = new MediaController();
          bv = (MediaController)localObject1;
        }
        return localObject1;
      }
      finally
      {
        monitorexit;
      }
    }
    return (MediaController)localObject2;
  }

  private void a(String paramString, int paramInt)
  {
    i locali = (i)this.ac.get(paramString);
    if (locali != null)
    {
      this.ac.remove(paramString);
      if ((paramInt == 0) || (paramInt == 2))
        w.a().a(locali.c, locali.b, false);
      if (locali.b != 1)
        break label82;
      this.W.remove(locali);
      if (this.W.isEmpty())
        b(1);
    }
    label82: 
    do
    {
      do
        while (true)
        {
          return;
          if (locali.b == 2)
          {
            this.X.remove(locali);
            if (!this.X.isEmpty())
              continue;
            b(2);
            return;
          }
          if (locali.b == 4)
          {
            this.ab.remove(locali);
            if (!this.ab.isEmpty())
              continue;
            b(4);
            return;
          }
          if (locali.b == 8)
          {
            this.Y.remove(locali);
            if (!this.Y.isEmpty())
              continue;
            b(8);
            return;
          }
          if (locali.b != 16)
            break;
          this.Z.remove(locali);
          if (!this.Z.isEmpty())
            continue;
          b(16);
          return;
        }
      while (locali.b != 32);
      this.aa.remove(locali);
    }
    while (!this.aa.isEmpty());
    b(32);
  }

  // ERROR //
  public static void a(String paramString1, Context paramContext, int paramInt, String paramString2, String paramString3)
  {
    // Byte code:
    //   0: aload_0
    //   1: ifnonnull +4 -> 5
    //   4: return
    //   5: aload_0
    //   6: ifnull +164 -> 170
    //   9: aload_0
    //   10: invokevirtual 810	java/lang/String:length	()I
    //   13: ifeq +157 -> 170
    //   16: new 812	java/io/File
    //   19: dup
    //   20: aload_0
    //   21: invokespecial 813	java/io/File:<init>	(Ljava/lang/String;)V
    //   24: astore 5
    //   26: aload 5
    //   28: astore_0
    //   29: aload 5
    //   31: invokevirtual 816	java/io/File:exists	()Z
    //   34: ifne +5 -> 39
    //   37: aconst_null
    //   38: astore_0
    //   39: aload_0
    //   40: ifnull -36 -> 4
    //   43: iconst_1
    //   44: newarray boolean
    //   46: astore 6
    //   48: aload_0
    //   49: invokevirtual 816	java/io/File:exists	()Z
    //   52: ifeq -48 -> 4
    //   55: aload_1
    //   56: ifnull +109 -> 165
    //   59: new 1153	android/app/ProgressDialog
    //   62: dup
    //   63: aload_1
    //   64: invokespecial 1156	android/app/ProgressDialog:<init>	(Landroid/content/Context;)V
    //   67: astore_1
    //   68: aload_1
    //   69: ldc_w 1158
    //   72: ldc_w 1159
    //   75: invokestatic 1164	org/vidogram/messenger/r:a	(Ljava/lang/String;I)Ljava/lang/String;
    //   78: invokevirtual 1168	android/app/ProgressDialog:setMessage	(Ljava/lang/CharSequence;)V
    //   81: aload_1
    //   82: iconst_0
    //   83: invokevirtual 1171	android/app/ProgressDialog:setCanceledOnTouchOutside	(Z)V
    //   86: aload_1
    //   87: iconst_1
    //   88: invokevirtual 1174	android/app/ProgressDialog:setCancelable	(Z)V
    //   91: aload_1
    //   92: iconst_1
    //   93: invokevirtual 1177	android/app/ProgressDialog:setProgressStyle	(I)V
    //   96: aload_1
    //   97: bipush 100
    //   99: invokevirtual 1180	android/app/ProgressDialog:setMax	(I)V
    //   102: aload_1
    //   103: new 34	org/vidogram/messenger/MediaController$14
    //   106: dup
    //   107: aload 6
    //   109: invokespecial 1183	org/vidogram/messenger/MediaController$14:<init>	([Z)V
    //   112: invokevirtual 1187	android/app/ProgressDialog:setOnCancelListener	(Landroid/content/DialogInterface$OnCancelListener;)V
    //   115: aload_1
    //   116: invokevirtual 1190	android/app/ProgressDialog:show	()V
    //   119: new 1192	java/lang/Thread
    //   122: dup
    //   123: new 36	org/vidogram/messenger/MediaController$15
    //   126: dup
    //   127: iload_2
    //   128: aload_3
    //   129: aload_0
    //   130: aload 6
    //   132: aload_1
    //   133: aload 4
    //   135: invokespecial 1195	org/vidogram/messenger/MediaController$15:<init>	(ILjava/lang/String;Ljava/io/File;[ZLandroid/app/ProgressDialog;Ljava/lang/String;)V
    //   138: invokespecial 1197	java/lang/Thread:<init>	(Ljava/lang/Runnable;)V
    //   141: invokevirtual 1200	java/lang/Thread:start	()V
    //   144: return
    //   145: astore 5
    //   147: aconst_null
    //   148: astore_1
    //   149: ldc_w 501
    //   152: aload 5
    //   154: invokestatic 506	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   157: goto -38 -> 119
    //   160: astore 5
    //   162: goto -13 -> 149
    //   165: aconst_null
    //   166: astore_1
    //   167: goto -48 -> 119
    //   170: aconst_null
    //   171: astore_0
    //   172: goto -133 -> 39
    //
    // Exception table:
    //   from	to	target	type
    //   59	68	145	java/lang/Exception
    //   68	119	160	java/lang/Exception
  }

  private void a(ArrayList<Long> paramArrayList)
  {
    if ((paramArrayList == null) || (paramArrayList.isEmpty()) || (this.bn == 0L) || (this.bq == null) || (!(this.bq instanceof g.im)));
    label162: label163: 
    while (true)
    {
      return;
      paramArrayList = paramArrayList.iterator();
      for (int i1 = 0; paramArrayList.hasNext(); i1 = 1)
      {
        label45: Long localLong = (Long)paramArrayList.next();
        if ((this.bp != 0L) && (localLong.longValue() <= this.bp))
          break label45;
        if ((localLong.longValue() < this.bn) || ((this.bo != 0L) && (localLong.longValue() > this.bo + 2000L)))
          break label162;
        this.bp = Math.max(this.bp, localLong.longValue());
      }
      while (true)
      {
        break;
        if (i1 == 0)
          break label163;
        ab.a().c(this.bq, this.br, null);
        return;
      }
    }
  }

  private void a(u paramu, File paramFile, boolean paramBoolean1, boolean paramBoolean2)
  {
    boolean bool = this.Q;
    if (bool)
      this.Q = false;
    a.a(new Runnable(paramBoolean2, paramu, paramFile, bool, paramBoolean1)
    {
      public void run()
      {
        if (this.a)
          y.a().a(y.aD, new Object[] { this.b, this.c.toString() });
        while (true)
        {
          if ((this.a) || (this.e));
          synchronized (MediaController.X(MediaController.this))
          {
            MediaController.d(MediaController.this, false);
            MediaController.Y(MediaController.this).remove(this.b);
            MediaController.Z(MediaController.this);
            return;
            if (this.d)
              y.a().a(y.aB, new Object[] { this.b, this.c.toString() });
            ??? = y.a();
            int i = y.aC;
            u localu = this.b;
            String str = this.c.toString();
            if (this.e)
            {
              l = this.c.length();
              ((y)???).a(i, new Object[] { localu, str, Long.valueOf(l) });
              continue;
            }
            long l = 0L;
          }
        }
      }
    });
  }

  private boolean a(float paramFloat)
  {
    return (paramFloat < 5.0F) && (paramFloat != this.l.getMaximumRange());
  }

  private void b(float paramFloat)
  {
    if (paramFloat == 1.0F)
      return;
    if (!this.at)
      this.av.pause();
    this.av.flush();
    this.aU.b(new Runnable(paramFloat)
    {
      public void run()
      {
        MediaController.a(MediaController.this, this.a);
        synchronized (MediaController.D(MediaController.this))
        {
          MediaController.E(MediaController.this).addAll(MediaController.F(MediaController.this));
          MediaController.F(MediaController.this).clear();
          a.a(new Runnable()
          {
            public void run()
            {
              if (!MediaController.v(MediaController.this))
              {
                MediaController.c(MediaController.this, 3);
                MediaController.c(MediaController.this, ()((float)MediaController.A(MediaController.this) * MediaController.4.this.a));
                if (MediaController.u(MediaController.this) != null)
                  MediaController.u(MediaController.this).play();
                MediaController.b(MediaController.this, (int)((float)MediaController.A(MediaController.this) / 48.0F * MediaController.4.this.a));
                MediaController.C(MediaController.this);
              }
            }
          });
          return;
        }
      }
    });
  }

  private static void b(int paramInt1, ArrayList<a> paramArrayList1, Integer paramInteger1, ArrayList<a> paramArrayList2, Integer paramInteger2, a parama, int paramInt2)
  {
    if (al != null)
      a.b(al);
    paramArrayList1 = new Runnable(paramInt1, paramArrayList1, paramInteger1, paramArrayList2, paramInteger2, parama)
    {
      public void run()
      {
        if (am.a().f())
        {
          MediaController.a(this.a, this.b, this.c, this.d, this.e, this.f, 1000);
          return;
        }
        MediaController.a(null);
        MediaController.e = this.f;
        y.a().a(y.aM, new Object[] { Integer.valueOf(this.a), this.b, this.c, this.d, this.e });
      }
    };
    al = paramArrayList1;
    a.a(paramArrayList1, paramInt2);
  }

  public static boolean b(Uri paramUri)
  {
    int i1 = 0;
    Object localObject1 = null;
    Uri localUri = null;
    try
    {
      paramUri = ApplicationLoader.a.getContentResolver().openInputStream(paramUri);
      localUri = paramUri;
      localObject1 = paramUri;
      Object localObject2 = new byte[12];
      localUri = paramUri;
      localObject1 = paramUri;
      boolean bool;
      if (paramUri.read(localObject2, 0, 12) == 12)
      {
        localUri = paramUri;
        localObject1 = paramUri;
        localObject2 = new String(localObject2);
        if (localObject2 != null)
        {
          localUri = paramUri;
          localObject1 = paramUri;
          localObject2 = ((String)localObject2).toLowerCase();
          localUri = paramUri;
          localObject1 = paramUri;
          if (((String)localObject2).startsWith("riff"))
          {
            localUri = paramUri;
            localObject1 = paramUri;
            bool = ((String)localObject2).endsWith("webp");
            if (bool)
            {
              bool = true;
              i1 = bool;
              if (paramUri == null);
            }
          }
        }
      }
      do
        try
        {
          paramUri.close();
          i1 = bool;
          return i1;
        }
        catch (Exception paramUri)
        {
          n.a("tmessages", paramUri);
          return true;
        }
      while (paramUri == null);
      try
      {
        paramUri.close();
        return false;
      }
      catch (Exception paramUri)
      {
        n.a("tmessages", paramUri);
        return false;
      }
    }
    catch (Exception paramUri)
    {
      do
      {
        localObject1 = localUri;
        n.a("tmessages", paramUri);
      }
      while (localUri == null);
      try
      {
        localUri.close();
        return false;
      }
      catch (Exception paramUri)
      {
        n.a("tmessages", paramUri);
        return false;
      }
    }
    finally
    {
      if (localObject1 == null);
    }
    try
    {
      ((InputStream)localObject1).close();
      throw paramUri;
    }
    catch (Exception localException)
    {
      while (true)
        n.a("tmessages", localException);
    }
  }

  private void c(boolean paramBoolean)
  {
    if (this.ax == null)
      return;
    if (this.au != null);
    u localu;
    for (int i1 = 1; ; i1 = 0)
    {
      y.a().a(y.aP, new Object[] { Boolean.valueOf(this.A) });
      localu = this.ax;
      float f1 = this.ax.k;
      a(false, true);
      localu.k = f1;
      a(localu);
      if (!paramBoolean)
        break;
      if (i1 == 0)
        break label103;
      a.a(new Runnable(localu)
      {
        public void run()
        {
          MediaController.this.b(this.a);
        }
      }
      , 100L);
      return;
    }
    label103: b(localu);
  }

  public static boolean c(Uri paramUri)
  {
    int i1 = 0;
    Object localObject1 = null;
    Uri localUri = null;
    try
    {
      paramUri = ApplicationLoader.a.getContentResolver().openInputStream(paramUri);
      localUri = paramUri;
      localObject1 = paramUri;
      Object localObject2 = new byte[3];
      localUri = paramUri;
      localObject1 = paramUri;
      boolean bool;
      if (paramUri.read(localObject2, 0, 3) == 3)
      {
        localUri = paramUri;
        localObject1 = paramUri;
        localObject2 = new String(localObject2);
        if (localObject2 != null)
        {
          localUri = paramUri;
          localObject1 = paramUri;
          bool = ((String)localObject2).equalsIgnoreCase("gif");
          if (bool)
          {
            bool = true;
            i1 = bool;
            if (paramUri == null);
          }
        }
      }
      do
        try
        {
          paramUri.close();
          i1 = bool;
          return i1;
        }
        catch (Exception paramUri)
        {
          n.a("tmessages", paramUri);
          return true;
        }
      while (paramUri == null);
      try
      {
        paramUri.close();
        return false;
      }
      catch (Exception paramUri)
      {
        n.a("tmessages", paramUri);
        return false;
      }
    }
    catch (Exception paramUri)
    {
      do
      {
        localObject1 = localUri;
        n.a("tmessages", paramUri);
      }
      while (localUri == null);
      try
      {
        localUri.close();
        return false;
      }
      catch (Exception paramUri)
      {
        n.a("tmessages", paramUri);
        return false;
      }
    }
    finally
    {
      if (localObject1 == null);
    }
    try
    {
      ((InputStream)localObject1).close();
      throw paramUri;
    }
    catch (Exception localException)
    {
      while (true)
        n.a("tmessages", localException);
    }
  }

  // ERROR //
  public static String d(Uri paramUri)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: aload_0
    //   3: invokevirtual 1342	android/net/Uri:getScheme	()Ljava/lang/String;
    //   6: ldc_w 1344
    //   9: invokevirtual 919	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   12: ifeq +157 -> 169
    //   15: getstatic 511	org/vidogram/messenger/ApplicationLoader:a	Landroid/content/Context;
    //   18: invokevirtual 659	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   21: aload_0
    //   22: iconst_1
    //   23: anewarray 294	java/lang/String
    //   26: dup
    //   27: iconst_0
    //   28: ldc_w 649
    //   31: aastore
    //   32: aconst_null
    //   33: aconst_null
    //   34: aconst_null
    //   35: invokevirtual 1348	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   38: astore_3
    //   39: aload_3
    //   40: astore 4
    //   42: aload_3
    //   43: invokeinterface 1353 1 0
    //   48: ifeq +22 -> 70
    //   51: aload_3
    //   52: astore 4
    //   54: aload_3
    //   55: aload_3
    //   56: ldc_w 649
    //   59: invokeinterface 1356 2 0
    //   64: invokeinterface 1359 2 0
    //   69: astore_2
    //   70: aload_3
    //   71: ifnull +103 -> 174
    //   74: aload_3
    //   75: invokeinterface 1360 1 0
    //   80: aload_2
    //   81: astore_3
    //   82: aload_2
    //   83: ifnonnull +30 -> 113
    //   86: aload_0
    //   87: invokevirtual 1363	android/net/Uri:getPath	()Ljava/lang/String;
    //   90: astore_0
    //   91: aload_0
    //   92: bipush 47
    //   94: invokevirtual 1366	java/lang/String:lastIndexOf	(I)I
    //   97: istore_1
    //   98: aload_0
    //   99: astore_3
    //   100: iload_1
    //   101: iconst_m1
    //   102: if_icmpeq +11 -> 113
    //   105: aload_0
    //   106: iload_1
    //   107: iconst_1
    //   108: iadd
    //   109: invokevirtual 1369	java/lang/String:substring	(I)Ljava/lang/String;
    //   112: astore_3
    //   113: aload_3
    //   114: areturn
    //   115: astore_2
    //   116: aconst_null
    //   117: astore_3
    //   118: aload_3
    //   119: astore 4
    //   121: ldc_w 501
    //   124: aload_2
    //   125: invokestatic 506	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   128: aload_3
    //   129: ifnull +40 -> 169
    //   132: aload_3
    //   133: invokeinterface 1360 1 0
    //   138: aconst_null
    //   139: astore_2
    //   140: goto -60 -> 80
    //   143: astore_0
    //   144: aconst_null
    //   145: astore 4
    //   147: aload 4
    //   149: ifnull +10 -> 159
    //   152: aload 4
    //   154: invokeinterface 1360 1 0
    //   159: aload_0
    //   160: athrow
    //   161: astore_0
    //   162: goto -15 -> 147
    //   165: astore_2
    //   166: goto -48 -> 118
    //   169: aconst_null
    //   170: astore_2
    //   171: goto -91 -> 80
    //   174: goto -94 -> 80
    //
    // Exception table:
    //   from	to	target	type
    //   15	39	115	java/lang/Exception
    //   15	39	143	finally
    //   42	51	161	finally
    //   54	70	161	finally
    //   121	128	161	finally
    //   42	51	165	java/lang/Exception
    //   54	70	165	java/lang/Exception
  }

  private void d(boolean paramBoolean)
  {
    ArrayList localArrayList;
    if (this.ai)
    {
      localArrayList = this.aH;
      if ((!paramBoolean) || (this.aj != 2) || (this.aJ))
        break label62;
      a(false, false);
      a((u)localArrayList.get(this.aI));
    }
    label62: label353: 
    do
    {
      do
      {
        return;
        localArrayList = this.aG;
        break;
        this.aI += 1;
        if (this.aI < localArrayList.size())
          break label353;
        this.aI = 0;
        if ((!paramBoolean) || (this.aj != 0) || (this.aJ))
          break label353;
      }
      while ((this.au == null) && (this.av == null));
      if (this.au != null);
      while (true)
      {
        try
        {
          this.au.reset();
        }
        catch (Exception localException3)
        {
          try
          {
            this.au.stop();
          }
          catch (Exception localException3)
          {
            try
            {
              this.au.release();
              this.au = null;
              I();
              this.aw = 0;
              this.aF = 0;
              this.at = true;
              this.ax.k = 0.0F;
              this.ax.l = 0;
              y.a().a(y.aE, new Object[] { Integer.valueOf(this.ax.q()), Integer.valueOf(0) });
              y.a().a(y.aG, new Object[] { Integer.valueOf(this.ax.q()) });
              return;
              localException1 = localException1;
              n.a("tmessages", localException1);
              continue;
              localException2 = localException2;
              n.a("tmessages", localException2);
              continue;
            }
            catch (Exception localException3)
            {
              n.a("tmessages", localException3);
              continue;
            }
          }
        }
        if (this.av == null)
          continue;
        try
        {
          synchronized (this.aZ)
          {
            this.av.pause();
            this.av.flush();
          }
        }
        catch (Exception localException5)
        {
          try
          {
            while (true)
            {
              this.av.release();
              this.av = null;
              monitorexit;
              break;
              localObject2 = finally;
              monitorexit;
              throw localObject2;
              localException4 = localException4;
              n.a("tmessages", localException4);
            }
          }
          catch (Exception localException5)
          {
            while (true)
              n.a("tmessages", localException5);
          }
        }
      }
    }
    while ((this.aI < 0) || (this.aI >= ???.size()));
    this.aL = true;
    a((u)???.get(this.aI));
  }

  public static void e(int paramInt)
  {
    Thread localThread = new Thread(new Runnable(paramInt)
    {
      // ERROR //
      public void run()
      {
        // Byte code:
        //   0: new 27	java/util/ArrayList
        //   3: dup
        //   4: invokespecial 28	java/util/ArrayList:<init>	()V
        //   7: astore 19
        //   9: new 27	java/util/ArrayList
        //   12: dup
        //   13: invokespecial 28	java/util/ArrayList:<init>	()V
        //   16: astore 20
        //   18: new 30	java/util/HashMap
        //   21: dup
        //   22: invokespecial 31	java/util/HashMap:<init>	()V
        //   25: astore 21
        //   27: new 33	java/lang/StringBuilder
        //   30: dup
        //   31: invokespecial 34	java/lang/StringBuilder:<init>	()V
        //   34: getstatic 40	android/os/Environment:DIRECTORY_DCIM	Ljava/lang/String;
        //   37: invokestatic 44	android/os/Environment:getExternalStoragePublicDirectory	(Ljava/lang/String;)Ljava/io/File;
        //   40: invokevirtual 50	java/io/File:getAbsolutePath	()Ljava/lang/String;
        //   43: invokevirtual 54	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   46: ldc 56
        //   48: invokevirtual 54	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   51: ldc 58
        //   53: invokevirtual 54	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   56: invokevirtual 61	java/lang/StringBuilder:toString	()Ljava/lang/String;
        //   59: astore 22
        //   61: getstatic 66	android/os/Build$VERSION:SDK_INT	I
        //   64: bipush 23
        //   66: if_icmplt +22 -> 88
        //   69: getstatic 66	android/os/Build$VERSION:SDK_INT	I
        //   72: bipush 23
        //   74: if_icmplt +1202 -> 1276
        //   77: getstatic 71	org/vidogram/messenger/ApplicationLoader:a	Landroid/content/Context;
        //   80: ldc 73
        //   82: invokevirtual 79	android/content/Context:checkSelfPermission	(Ljava/lang/String;)I
        //   85: ifne +1191 -> 1276
        //   88: getstatic 71	org/vidogram/messenger/ApplicationLoader:a	Landroid/content/Context;
        //   91: invokevirtual 83	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
        //   94: getstatic 89	android/provider/MediaStore$Images$Media:EXTERNAL_CONTENT_URI	Landroid/net/Uri;
        //   97: invokestatic 93	org/vidogram/messenger/MediaController:F	()[Ljava/lang/String;
        //   100: aconst_null
        //   101: aconst_null
        //   102: ldc 95
        //   104: invokestatic 99	android/provider/MediaStore$Images$Media:query	(Landroid/content/ContentResolver;Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //   107: astore 12
        //   109: aload 12
        //   111: ifnull +1148 -> 1259
        //   114: aload 12
        //   116: ldc 101
        //   118: invokeinterface 106 2 0
        //   123: istore_1
        //   124: aload 12
        //   126: ldc 108
        //   128: invokeinterface 106 2 0
        //   133: istore_2
        //   134: aload 12
        //   136: ldc 110
        //   138: invokeinterface 106 2 0
        //   143: istore_3
        //   144: aload 12
        //   146: ldc 112
        //   148: invokeinterface 106 2 0
        //   153: istore 4
        //   155: aload 12
        //   157: ldc 114
        //   159: invokeinterface 106 2 0
        //   164: istore 5
        //   166: aload 12
        //   168: ldc 116
        //   170: invokeinterface 106 2 0
        //   175: istore 6
        //   177: aconst_null
        //   178: astore 13
        //   180: aconst_null
        //   181: astore 14
        //   183: aload 12
        //   185: invokeinterface 120 1 0
        //   190: ifeq +294 -> 484
        //   193: aload 12
        //   195: iload_1
        //   196: invokeinterface 124 2 0
        //   201: istore 7
        //   203: aload 12
        //   205: iload_2
        //   206: invokeinterface 124 2 0
        //   211: istore 8
        //   213: aload 12
        //   215: iload_3
        //   216: invokeinterface 128 2 0
        //   221: astore 24
        //   223: aload 12
        //   225: iload 4
        //   227: invokeinterface 128 2 0
        //   232: astore 23
        //   234: aload 12
        //   236: iload 5
        //   238: invokeinterface 132 2 0
        //   243: lstore 10
        //   245: aload 12
        //   247: iload 6
        //   249: invokeinterface 124 2 0
        //   254: istore 9
        //   256: aload 23
        //   258: ifnull -75 -> 183
        //   261: aload 23
        //   263: invokevirtual 138	java/lang/String:length	()I
        //   266: ifeq -83 -> 183
        //   269: new 140	org/vidogram/messenger/MediaController$i
        //   272: dup
        //   273: iload 8
        //   275: iload 7
        //   277: lload 10
        //   279: aload 23
        //   281: iload 9
        //   283: iconst_0
        //   284: invokespecial 143	org/vidogram/messenger/MediaController$i:<init>	(IIJLjava/lang/String;IZ)V
        //   287: astore 18
        //   289: aload 14
        //   291: ifnonnull +965 -> 1256
        //   294: new 145	org/vidogram/messenger/MediaController$a
        //   297: dup
        //   298: iconst_0
        //   299: ldc 147
        //   301: ldc 148
        //   303: invokestatic 153	org/vidogram/messenger/r:a	(Ljava/lang/String;I)Ljava/lang/String;
        //   306: aload 18
        //   308: iconst_0
        //   309: invokespecial 156	org/vidogram/messenger/MediaController$a:<init>	(ILjava/lang/String;Lorg/vidogram/messenger/MediaController$i;Z)V
        //   312: astore 15
        //   314: aload 15
        //   316: astore 16
        //   318: aload 19
        //   320: iconst_0
        //   321: aload 15
        //   323: invokevirtual 160	java/util/ArrayList:add	(ILjava/lang/Object;)V
        //   326: aload 15
        //   328: astore 14
        //   330: aload 14
        //   332: ifnull +14 -> 346
        //   335: aload 14
        //   337: astore 16
        //   339: aload 14
        //   341: aload 18
        //   343: invokevirtual 163	org/vidogram/messenger/MediaController$a:a	(Lorg/vidogram/messenger/MediaController$i;)V
        //   346: aload 14
        //   348: astore 16
        //   350: aload 21
        //   352: iload 8
        //   354: invokestatic 169	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   357: invokevirtual 173	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
        //   360: checkcast 145	org/vidogram/messenger/MediaController$a
        //   363: astore 17
        //   365: aload 17
        //   367: astore 15
        //   369: aload 17
        //   371: ifnonnull +110 -> 481
        //   374: aload 14
        //   376: astore 16
        //   378: new 145	org/vidogram/messenger/MediaController$a
        //   381: dup
        //   382: iload 8
        //   384: aload 24
        //   386: aload 18
        //   388: iconst_0
        //   389: invokespecial 156	org/vidogram/messenger/MediaController$a:<init>	(ILjava/lang/String;Lorg/vidogram/messenger/MediaController$i;Z)V
        //   392: astore 15
        //   394: aload 14
        //   396: astore 16
        //   398: aload 21
        //   400: iload 8
        //   402: invokestatic 169	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   405: aload 15
        //   407: invokevirtual 177	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   410: pop
        //   411: aload 13
        //   413: ifnonnull +56 -> 469
        //   416: aload 22
        //   418: ifnull +51 -> 469
        //   421: aload 23
        //   423: ifnull +46 -> 469
        //   426: aload 14
        //   428: astore 16
        //   430: aload 23
        //   432: aload 22
        //   434: invokevirtual 181	java/lang/String:startsWith	(Ljava/lang/String;)Z
        //   437: ifeq +32 -> 469
        //   440: aload 14
        //   442: astore 16
        //   444: aload 19
        //   446: iconst_0
        //   447: aload 15
        //   449: invokevirtual 160	java/util/ArrayList:add	(ILjava/lang/Object;)V
        //   452: iload 8
        //   454: invokestatic 169	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   457: astore 13
        //   459: aload 15
        //   461: aload 18
        //   463: invokevirtual 163	org/vidogram/messenger/MediaController$a:a	(Lorg/vidogram/messenger/MediaController$i;)V
        //   466: goto -283 -> 183
        //   469: aload 14
        //   471: astore 16
        //   473: aload 19
        //   475: aload 15
        //   477: invokevirtual 184	java/util/ArrayList:add	(Ljava/lang/Object;)Z
        //   480: pop
        //   481: goto -22 -> 459
        //   484: aload 12
        //   486: astore 15
        //   488: aload 14
        //   490: astore 12
        //   492: aload 15
        //   494: astore 14
        //   496: aload 14
        //   498: astore 17
        //   500: aload 13
        //   502: astore 16
        //   504: aload 12
        //   506: astore 15
        //   508: aload 14
        //   510: ifnull +731 -> 1241
        //   513: aload 14
        //   515: invokeinterface 187 1 0
        //   520: aload 14
        //   522: astore 15
        //   524: aload 12
        //   526: astore 14
        //   528: aload 15
        //   530: astore 12
        //   532: getstatic 66	android/os/Build$VERSION:SDK_INT	I
        //   535: bipush 23
        //   537: if_icmplt +22 -> 559
        //   540: getstatic 66	android/os/Build$VERSION:SDK_INT	I
        //   543: bipush 23
        //   545: if_icmplt +690 -> 1235
        //   548: getstatic 71	org/vidogram/messenger/ApplicationLoader:a	Landroid/content/Context;
        //   551: ldc 73
        //   553: invokevirtual 79	android/content/Context:checkSelfPermission	(Ljava/lang/String;)I
        //   556: ifne +679 -> 1235
        //   559: aload 21
        //   561: invokevirtual 190	java/util/HashMap:clear	()V
        //   564: getstatic 71	org/vidogram/messenger/ApplicationLoader:a	Landroid/content/Context;
        //   567: invokevirtual 83	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
        //   570: getstatic 193	android/provider/MediaStore$Video$Media:EXTERNAL_CONTENT_URI	Landroid/net/Uri;
        //   573: invokestatic 196	org/vidogram/messenger/MediaController:G	()[Ljava/lang/String;
        //   576: aconst_null
        //   577: aconst_null
        //   578: ldc 95
        //   580: invokestatic 99	android/provider/MediaStore$Images$Media:query	(Landroid/content/ContentResolver;Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //   583: astore 15
        //   585: aload 15
        //   587: astore 12
        //   589: aload 12
        //   591: ifnull +638 -> 1229
        //   594: aload 12
        //   596: ldc 101
        //   598: invokeinterface 106 2 0
        //   603: istore_1
        //   604: aload 12
        //   606: ldc 108
        //   608: invokeinterface 106 2 0
        //   613: istore_2
        //   614: aload 12
        //   616: ldc 110
        //   618: invokeinterface 106 2 0
        //   623: istore_3
        //   624: aload 12
        //   626: ldc 112
        //   628: invokeinterface 106 2 0
        //   633: istore 4
        //   635: aload 12
        //   637: ldc 114
        //   639: invokeinterface 106 2 0
        //   644: istore 5
        //   646: aconst_null
        //   647: astore 17
        //   649: aconst_null
        //   650: astore 15
        //   652: aload 12
        //   654: invokeinterface 120 1 0
        //   659: ifeq +367 -> 1026
        //   662: aload 12
        //   664: iload_1
        //   665: invokeinterface 124 2 0
        //   670: istore 6
        //   672: aload 12
        //   674: iload_2
        //   675: invokeinterface 124 2 0
        //   680: istore 7
        //   682: aload 12
        //   684: iload_3
        //   685: invokeinterface 128 2 0
        //   690: astore 25
        //   692: aload 12
        //   694: iload 4
        //   696: invokeinterface 128 2 0
        //   701: astore 24
        //   703: aload 12
        //   705: iload 5
        //   707: invokeinterface 132 2 0
        //   712: lstore 10
        //   714: aload 24
        //   716: ifnull -64 -> 652
        //   719: aload 24
        //   721: invokevirtual 138	java/lang/String:length	()I
        //   724: ifeq -72 -> 652
        //   727: new 140	org/vidogram/messenger/MediaController$i
        //   730: dup
        //   731: iload 7
        //   733: iload 6
        //   735: lload 10
        //   737: aload 24
        //   739: iconst_0
        //   740: iconst_1
        //   741: invokespecial 143	org/vidogram/messenger/MediaController$i:<init>	(IIJLjava/lang/String;IZ)V
        //   744: astore 23
        //   746: aload 17
        //   748: astore 16
        //   750: aload 17
        //   752: ifnonnull +31 -> 783
        //   755: new 145	org/vidogram/messenger/MediaController$a
        //   758: dup
        //   759: iconst_0
        //   760: ldc 198
        //   762: ldc 199
        //   764: invokestatic 153	org/vidogram/messenger/r:a	(Ljava/lang/String;I)Ljava/lang/String;
        //   767: aload 23
        //   769: iconst_1
        //   770: invokespecial 156	org/vidogram/messenger/MediaController$a:<init>	(ILjava/lang/String;Lorg/vidogram/messenger/MediaController$i;Z)V
        //   773: astore 16
        //   775: aload 20
        //   777: iconst_0
        //   778: aload 16
        //   780: invokevirtual 160	java/util/ArrayList:add	(ILjava/lang/Object;)V
        //   783: aload 16
        //   785: ifnull +10 -> 795
        //   788: aload 16
        //   790: aload 23
        //   792: invokevirtual 163	org/vidogram/messenger/MediaController$a:a	(Lorg/vidogram/messenger/MediaController$i;)V
        //   795: aload 21
        //   797: iload 7
        //   799: invokestatic 169	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   802: invokevirtual 173	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
        //   805: checkcast 145	org/vidogram/messenger/MediaController$a
        //   808: astore 18
        //   810: aload 18
        //   812: astore 17
        //   814: aload 18
        //   816: ifnonnull +207 -> 1023
        //   819: new 145	org/vidogram/messenger/MediaController$a
        //   822: dup
        //   823: iload 7
        //   825: aload 25
        //   827: aload 23
        //   829: iconst_1
        //   830: invokespecial 156	org/vidogram/messenger/MediaController$a:<init>	(ILjava/lang/String;Lorg/vidogram/messenger/MediaController$i;Z)V
        //   833: astore 17
        //   835: aload 21
        //   837: iload 7
        //   839: invokestatic 169	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   842: aload 17
        //   844: invokevirtual 177	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   847: pop
        //   848: aload 15
        //   850: ifnonnull +165 -> 1015
        //   853: aload 22
        //   855: ifnull +160 -> 1015
        //   858: aload 24
        //   860: ifnull +155 -> 1015
        //   863: aload 24
        //   865: aload 22
        //   867: invokevirtual 181	java/lang/String:startsWith	(Ljava/lang/String;)Z
        //   870: ifeq +145 -> 1015
        //   873: aload 20
        //   875: iconst_0
        //   876: aload 17
        //   878: invokevirtual 160	java/util/ArrayList:add	(ILjava/lang/Object;)V
        //   881: iload 7
        //   883: invokestatic 169	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   886: astore 15
        //   888: aload 17
        //   890: aload 23
        //   892: invokevirtual 163	org/vidogram/messenger/MediaController$a:a	(Lorg/vidogram/messenger/MediaController$i;)V
        //   895: aload 16
        //   897: astore 17
        //   899: goto -247 -> 652
        //   902: astore 15
        //   904: ldc 201
        //   906: aload 15
        //   908: invokestatic 206	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   911: aload 12
        //   913: astore 15
        //   915: aload 14
        //   917: astore 12
        //   919: aload 15
        //   921: astore 14
        //   923: goto -391 -> 532
        //   926: astore 15
        //   928: aconst_null
        //   929: astore 12
        //   931: aconst_null
        //   932: astore 13
        //   934: aconst_null
        //   935: astore 14
        //   937: ldc 201
        //   939: aload 15
        //   941: invokestatic 206	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   944: aload 12
        //   946: astore 17
        //   948: aload 13
        //   950: astore 16
        //   952: aload 14
        //   954: astore 15
        //   956: aload 12
        //   958: ifnull +283 -> 1241
        //   961: aload 12
        //   963: invokeinterface 187 1 0
        //   968: goto -436 -> 532
        //   971: astore 15
        //   973: ldc 201
        //   975: aload 15
        //   977: invokestatic 206	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   980: goto -448 -> 532
        //   983: astore 13
        //   985: aconst_null
        //   986: astore 12
        //   988: aload 12
        //   990: ifnull +10 -> 1000
        //   993: aload 12
        //   995: invokeinterface 187 1 0
        //   1000: aload 13
        //   1002: athrow
        //   1003: astore 12
        //   1005: ldc 201
        //   1007: aload 12
        //   1009: invokestatic 206	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   1012: goto -12 -> 1000
        //   1015: aload 20
        //   1017: aload 17
        //   1019: invokevirtual 184	java/util/ArrayList:add	(Ljava/lang/Object;)Z
        //   1022: pop
        //   1023: goto -135 -> 888
        //   1026: aload 15
        //   1028: astore 16
        //   1030: aload 12
        //   1032: ifnull +14 -> 1046
        //   1035: aload 12
        //   1037: invokeinterface 187 1 0
        //   1042: aload 15
        //   1044: astore 16
        //   1046: aload_0
        //   1047: getfield 16	org/vidogram/messenger/MediaController$16:a	I
        //   1050: aload 19
        //   1052: aload 13
        //   1054: aload 20
        //   1056: aload 16
        //   1058: aload 14
        //   1060: iconst_0
        //   1061: invokestatic 209	org/vidogram/messenger/MediaController:a	(ILjava/util/ArrayList;Ljava/lang/Integer;Ljava/util/ArrayList;Ljava/lang/Integer;Lorg/vidogram/messenger/MediaController$a;I)V
        //   1064: return
        //   1065: astore 12
        //   1067: ldc 201
        //   1069: aload 12
        //   1071: invokestatic 206	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   1074: aload 15
        //   1076: astore 16
        //   1078: goto -32 -> 1046
        //   1081: astore 16
        //   1083: aconst_null
        //   1084: astore 15
        //   1086: ldc 201
        //   1088: aload 16
        //   1090: invokestatic 206	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   1093: aload 15
        //   1095: astore 16
        //   1097: aload 12
        //   1099: ifnull -53 -> 1046
        //   1102: aload 12
        //   1104: invokeinterface 187 1 0
        //   1109: aload 15
        //   1111: astore 16
        //   1113: goto -67 -> 1046
        //   1116: astore 12
        //   1118: ldc 201
        //   1120: aload 12
        //   1122: invokestatic 206	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   1125: aload 15
        //   1127: astore 16
        //   1129: goto -83 -> 1046
        //   1132: astore 13
        //   1134: aload 12
        //   1136: ifnull +10 -> 1146
        //   1139: aload 12
        //   1141: invokeinterface 187 1 0
        //   1146: aload 13
        //   1148: athrow
        //   1149: astore 12
        //   1151: ldc 201
        //   1153: aload 12
        //   1155: invokestatic 206	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   1158: goto -12 -> 1146
        //   1161: astore 13
        //   1163: goto -29 -> 1134
        //   1166: astore 13
        //   1168: goto -34 -> 1134
        //   1171: astore 16
        //   1173: aconst_null
        //   1174: astore 15
        //   1176: goto -90 -> 1086
        //   1179: astore 16
        //   1181: goto -95 -> 1086
        //   1184: astore 16
        //   1186: goto -100 -> 1086
        //   1189: astore 13
        //   1191: goto -203 -> 988
        //   1194: astore 13
        //   1196: goto -208 -> 988
        //   1199: astore 15
        //   1201: aconst_null
        //   1202: astore 13
        //   1204: aconst_null
        //   1205: astore 14
        //   1207: goto -270 -> 937
        //   1210: astore 15
        //   1212: goto -275 -> 937
        //   1215: astore 15
        //   1217: goto -280 -> 937
        //   1220: astore 15
        //   1222: aload 16
        //   1224: astore 14
        //   1226: goto -289 -> 937
        //   1229: aconst_null
        //   1230: astore 15
        //   1232: goto -206 -> 1026
        //   1235: aconst_null
        //   1236: astore 15
        //   1238: goto -212 -> 1026
        //   1241: aload 17
        //   1243: astore 12
        //   1245: aload 16
        //   1247: astore 13
        //   1249: aload 15
        //   1251: astore 14
        //   1253: goto -721 -> 532
        //   1256: goto -926 -> 330
        //   1259: aconst_null
        //   1260: astore 13
        //   1262: aconst_null
        //   1263: astore 15
        //   1265: aload 12
        //   1267: astore 14
        //   1269: aload 15
        //   1271: astore 12
        //   1273: goto -777 -> 496
        //   1276: aconst_null
        //   1277: astore 14
        //   1279: aconst_null
        //   1280: astore 13
        //   1282: aconst_null
        //   1283: astore 12
        //   1285: goto -789 -> 496
        //
        // Exception table:
        //   from	to	target	type
        //   513	520	902	java/lang/Exception
        //   61	88	926	java/lang/Throwable
        //   88	109	926	java/lang/Throwable
        //   961	968	971	java/lang/Exception
        //   61	88	983	finally
        //   88	109	983	finally
        //   993	1000	1003	java/lang/Exception
        //   1035	1042	1065	java/lang/Exception
        //   532	559	1081	java/lang/Throwable
        //   559	585	1081	java/lang/Throwable
        //   1102	1109	1116	java/lang/Exception
        //   532	559	1132	finally
        //   559	585	1132	finally
        //   1139	1146	1149	java/lang/Exception
        //   594	646	1161	finally
        //   652	714	1161	finally
        //   719	746	1161	finally
        //   755	783	1161	finally
        //   788	795	1161	finally
        //   795	810	1161	finally
        //   819	848	1161	finally
        //   863	881	1161	finally
        //   888	895	1161	finally
        //   1015	1023	1161	finally
        //   1086	1093	1166	finally
        //   594	646	1171	java/lang/Throwable
        //   888	895	1179	java/lang/Throwable
        //   652	714	1184	java/lang/Throwable
        //   719	746	1184	java/lang/Throwable
        //   755	783	1184	java/lang/Throwable
        //   788	795	1184	java/lang/Throwable
        //   795	810	1184	java/lang/Throwable
        //   819	848	1184	java/lang/Throwable
        //   863	881	1184	java/lang/Throwable
        //   1015	1023	1184	java/lang/Throwable
        //   114	177	1189	finally
        //   183	256	1189	finally
        //   261	289	1189	finally
        //   294	314	1189	finally
        //   318	326	1189	finally
        //   339	346	1189	finally
        //   350	365	1189	finally
        //   378	394	1189	finally
        //   398	411	1189	finally
        //   430	440	1189	finally
        //   444	452	1189	finally
        //   459	466	1189	finally
        //   473	481	1189	finally
        //   937	944	1194	finally
        //   114	177	1199	java/lang/Throwable
        //   459	466	1210	java/lang/Throwable
        //   183	256	1215	java/lang/Throwable
        //   261	289	1215	java/lang/Throwable
        //   294	314	1215	java/lang/Throwable
        //   318	326	1220	java/lang/Throwable
        //   339	346	1220	java/lang/Throwable
        //   350	365	1220	java/lang/Throwable
        //   378	394	1220	java/lang/Throwable
        //   398	411	1220	java/lang/Throwable
        //   430	440	1220	java/lang/Throwable
        //   444	452	1220	java/lang/Throwable
        //   473	481	1220	java/lang/Throwable
      }
    });
    localThread.setPriority(1);
    localThread.start();
  }

  private void f(int paramInt)
  {
    if (paramInt != 0)
    {
      g.hs localhs = this.aO;
      File localFile = this.aP;
      this.bj.b(new Runnable(localhs, localFile, paramInt)
      {
        public void run()
        {
          MediaController.T(MediaController.this);
          a.a(new Runnable()
          {
            public void run()
            {
              String str = null;
              MediaController.11.this.a.e = ConnectionsManager.a().b();
              MediaController.11.this.a.h = (int)MediaController.11.this.b.length();
              Object localObject = new g.hu();
              ((g.hu)localObject).m = true;
              ((g.hu)localObject).n = MediaController.this.getWaveform2(MediaController.e(MediaController.this), MediaController.e(MediaController.this).length);
              if (((g.hu)localObject).n != null)
                ((g.hu)localObject).e |= 4;
              long l = MediaController.g(MediaController.this);
              ((g.hu)localObject).d = (int)(MediaController.g(MediaController.this) / 1000L);
              MediaController.11.this.a.o.add(localObject);
              if (l > 700L)
              {
                if (MediaController.11.this.c == 1)
                  ac.a().a(MediaController.11.this.a, null, MediaController.11.this.b.getAbsolutePath(), MediaController.V(MediaController.this), MediaController.W(MediaController.this), null, null);
                y localy = y.a();
                int i = y.aN;
                if (MediaController.11.this.c == 2);
                for (localObject = MediaController.11.this.a; ; localObject = null)
                {
                  if (MediaController.11.this.c == 2)
                    str = MediaController.11.this.b.getAbsolutePath();
                  localy.a(i, new Object[] { localObject, str });
                  return;
                }
              }
              MediaController.11.this.b.delete();
            }
          });
        }
      });
    }
    try
    {
      if (this.aN != null)
      {
        this.aN.release();
        this.aN = null;
      }
      this.aO = null;
      this.aP = null;
      return;
    }
    catch (Exception localException)
    {
      while (true)
        n.a("tmessages", localException);
    }
  }

  private static boolean g(int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 19:
    case 20:
    case 21:
    case 39:
    case 2130706688:
    }
    return true;
  }

  private native long getTotalPcmDuration();

  private void h(u paramu)
  {
    synchronized (this.aE)
    {
      Timer localTimer = this.aD;
      if (localTimer != null);
      try
      {
        this.aD.cancel();
        this.aD = null;
        this.aD = new Timer();
        this.aD.schedule(new TimerTask(paramu)
        {
          public void run()
          {
            synchronized (MediaController.s(MediaController.this))
            {
              a.a(new Runnable()
              {
                public void run()
                {
                  if ((MediaController.21.this.a != null) && ((MediaController.t(MediaController.this) != null) || (MediaController.u(MediaController.this) != null)) && (!MediaController.v(MediaController.this)))
                  {
                    int j;
                    int k;
                    do
                    {
                      try
                      {
                        if (MediaController.w(MediaController.this) != 0)
                        {
                          MediaController.x(MediaController.this);
                          return;
                        }
                        if (MediaController.t(MediaController.this) != null)
                        {
                          i = MediaController.t(MediaController.this).getCurrentPosition();
                          f = MediaController.y(MediaController.this) / MediaController.t(MediaController.this).getDuration();
                          if (i <= MediaController.y(MediaController.this))
                            break;
                          MediaController.b(MediaController.this, i);
                          MediaController.21.this.a.k = f;
                          MediaController.21.this.a.l = (MediaController.y(MediaController.this) / 1000);
                          y.a().a(y.aE, new Object[] { Integer.valueOf(MediaController.21.this.a.q()), Float.valueOf(f) });
                          return;
                        }
                      }
                      catch (Exception localException)
                      {
                        n.a("tmessages", localException);
                        return;
                      }
                      j = (int)((float)MediaController.z(MediaController.this) / 48.0F);
                      float f = (float)MediaController.z(MediaController.this) / (float)MediaController.A(MediaController.this);
                      k = MediaController.y(MediaController.this);
                      int i = j;
                    }
                    while (j != k);
                  }
                }
              });
              return;
            }
          }
        }
        , 0L, 17L);
        return;
      }
      catch (Exception localException)
      {
        while (true)
          n.a("tmessages", localException);
      }
    }
  }

  private void i(u paramu)
  {
    if (paramu.H())
      if (this.A)
        i1 = 3;
    while (true)
    {
      if (this.J != i1)
      {
        this.J = i1;
        if (i1 != 3)
          break;
        i1 = z.a().c.requestAudioFocus(this, 0, 1);
        if (i1 == 1)
          this.L = 2;
      }
      return;
      i1 = 2;
      continue;
      i1 = 1;
    }
    paramu = z.a().c;
    if (i1 == 2);
    for (int i1 = 3; ; i1 = 1)
    {
      i1 = paramu.requestAudioFocus(this, 3, i1);
      break;
    }
  }

  private native int isOpusFile(String paramString);

  // ERROR //
  @TargetApi(16)
  private boolean j(u paramu)
  {
    // Byte code:
    //   0: aload_1
    //   1: getfield 1435	org/vidogram/messenger/u:o	Lorg/vidogram/messenger/af;
    //   4: getfield 1439	org/vidogram/messenger/af:i	Ljava/lang/String;
    //   7: astore 29
    //   9: aload_1
    //   10: getfield 1435	org/vidogram/messenger/u:o	Lorg/vidogram/messenger/af;
    //   13: getfield 1441	org/vidogram/messenger/af:a	J
    //   16: lstore 21
    //   18: aload_1
    //   19: getfield 1435	org/vidogram/messenger/u:o	Lorg/vidogram/messenger/af;
    //   22: getfield 1443	org/vidogram/messenger/af:b	J
    //   25: lstore 23
    //   27: aload_1
    //   28: getfield 1435	org/vidogram/messenger/u:o	Lorg/vidogram/messenger/af;
    //   31: getfield 1445	org/vidogram/messenger/af:f	I
    //   34: istore_3
    //   35: aload_1
    //   36: getfield 1435	org/vidogram/messenger/u:o	Lorg/vidogram/messenger/af;
    //   39: getfield 1447	org/vidogram/messenger/af:g	I
    //   42: istore_2
    //   43: aload_1
    //   44: getfield 1435	org/vidogram/messenger/u:o	Lorg/vidogram/messenger/af;
    //   47: getfield 1448	org/vidogram/messenger/af:c	I
    //   50: istore 4
    //   52: aload_1
    //   53: getfield 1435	org/vidogram/messenger/u:o	Lorg/vidogram/messenger/af;
    //   56: getfield 1449	org/vidogram/messenger/af:d	I
    //   59: istore 6
    //   61: aload_1
    //   62: getfield 1435	org/vidogram/messenger/u:o	Lorg/vidogram/messenger/af;
    //   65: getfield 1451	org/vidogram/messenger/af:e	I
    //   68: istore 9
    //   70: aload_1
    //   71: getfield 1435	org/vidogram/messenger/u:o	Lorg/vidogram/messenger/af;
    //   74: getfield 1453	org/vidogram/messenger/af:h	I
    //   77: istore 16
    //   79: new 812	java/io/File
    //   82: dup
    //   83: aload_1
    //   84: getfield 802	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   87: getfield 807	org/vidogram/tgnet/g$ar:A	Ljava/lang/String;
    //   90: invokespecial 813	java/io/File:<init>	(Ljava/lang/String;)V
    //   93: astore 42
    //   95: getstatic 647	android/os/Build$VERSION:SDK_INT	I
    //   98: bipush 18
    //   100: if_icmpge +145 -> 245
    //   103: iload_2
    //   104: iload_3
    //   105: if_icmple +140 -> 245
    //   108: iload_3
    //   109: iload 6
    //   111: if_icmpeq +134 -> 245
    //   114: iload_2
    //   115: iload 9
    //   117: if_icmpeq +128 -> 245
    //   120: bipush 90
    //   122: istore 4
    //   124: sipush 270
    //   127: istore 5
    //   129: iload_2
    //   130: istore 8
    //   132: iload_3
    //   133: istore 7
    //   135: iload 5
    //   137: istore_3
    //   138: iload 4
    //   140: istore_2
    //   141: getstatic 511	org/vidogram/messenger/ApplicationLoader:a	Landroid/content/Context;
    //   144: ldc_w 1455
    //   147: iconst_0
    //   148: invokevirtual 585	android/content/Context:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   151: astore 43
    //   153: aload 43
    //   155: ldc_w 1457
    //   158: iconst_1
    //   159: invokeinterface 603 3 0
    //   164: istore 27
    //   166: aload 43
    //   168: invokeinterface 1461 1 0
    //   173: ldc_w 1457
    //   176: iconst_0
    //   177: invokeinterface 1467 3 0
    //   182: invokeinterface 1470 1 0
    //   187: pop
    //   188: new 812	java/io/File
    //   191: dup
    //   192: aload 29
    //   194: invokespecial 813	java/io/File:<init>	(Ljava/lang/String;)V
    //   197: astore 30
    //   199: aload 30
    //   201: invokevirtual 1473	java/io/File:canRead	()Z
    //   204: ifeq +8 -> 212
    //   207: iload 27
    //   209: ifne +111 -> 320
    //   212: aload_0
    //   213: aload_1
    //   214: aload 42
    //   216: iconst_1
    //   217: iconst_1
    //   218: invokespecial 1024	org/vidogram/messenger/MediaController:a	(Lorg/vidogram/messenger/u;Ljava/io/File;ZZ)V
    //   221: aload 43
    //   223: invokeinterface 1461 1 0
    //   228: ldc_w 1457
    //   231: iconst_1
    //   232: invokeinterface 1467 3 0
    //   237: invokeinterface 1470 1 0
    //   242: pop
    //   243: iconst_0
    //   244: ireturn
    //   245: getstatic 647	android/os/Build$VERSION:SDK_INT	I
    //   248: bipush 20
    //   250: if_icmple +3083 -> 3333
    //   253: iload 4
    //   255: bipush 90
    //   257: if_icmpne +18 -> 275
    //   260: iload_3
    //   261: istore 7
    //   263: iload_2
    //   264: istore 8
    //   266: iconst_0
    //   267: istore_2
    //   268: sipush 270
    //   271: istore_3
    //   272: goto -131 -> 141
    //   275: iload 4
    //   277: sipush 180
    //   280: if_icmpne +18 -> 298
    //   283: iload_2
    //   284: istore 7
    //   286: iload_3
    //   287: istore 8
    //   289: iconst_0
    //   290: istore_2
    //   291: sipush 180
    //   294: istore_3
    //   295: goto -154 -> 141
    //   298: iload 4
    //   300: sipush 270
    //   303: if_icmpne +3030 -> 3333
    //   306: iload_3
    //   307: istore 7
    //   309: iload_2
    //   310: istore 8
    //   312: iconst_0
    //   313: istore_2
    //   314: bipush 90
    //   316: istore_3
    //   317: goto -176 -> 141
    //   320: aload_0
    //   321: iconst_1
    //   322: putfield 349	org/vidogram/messenger/MediaController:Q	Z
    //   325: invokestatic 1478	java/lang/System:currentTimeMillis	()J
    //   328: lstore 25
    //   330: iload 8
    //   332: ifeq +2795 -> 3127
    //   335: iload 7
    //   337: ifeq +2790 -> 3127
    //   340: aconst_null
    //   341: astore 29
    //   343: aconst_null
    //   344: astore 31
    //   346: new 1000	android/media/MediaCodec$BufferInfo
    //   349: dup
    //   350: invokespecial 1479	android/media/MediaCodec$BufferInfo:<init>	()V
    //   353: astore 44
    //   355: new 1481	org/vidogram/messenger/f/c
    //   358: dup
    //   359: invokespecial 1482	org/vidogram/messenger/f/c:<init>	()V
    //   362: astore 32
    //   364: aload 32
    //   366: aload 42
    //   368: invokevirtual 1484	org/vidogram/messenger/f/c:a	(Ljava/io/File;)V
    //   371: aload 32
    //   373: iload_2
    //   374: invokevirtual 1486	org/vidogram/messenger/f/c:a	(I)V
    //   377: aload 32
    //   379: iload 8
    //   381: iload 7
    //   383: invokevirtual 1489	org/vidogram/messenger/f/c:a	(II)V
    //   386: new 974	org/vidogram/messenger/f/b
    //   389: dup
    //   390: invokespecial 1490	org/vidogram/messenger/f/b:<init>	()V
    //   393: aload 32
    //   395: invokevirtual 1493	org/vidogram/messenger/f/b:a	(Lorg/vidogram/messenger/f/c;)Lorg/vidogram/messenger/f/b;
    //   398: astore 33
    //   400: new 925	android/media/MediaExtractor
    //   403: dup
    //   404: invokespecial 1494	android/media/MediaExtractor:<init>	()V
    //   407: astore 37
    //   409: aload 37
    //   411: aload 30
    //   413: invokevirtual 1497	java/io/File:toString	()Ljava/lang/String;
    //   416: invokevirtual 1500	android/media/MediaExtractor:setDataSource	(Ljava/lang/String;)V
    //   419: aload_0
    //   420: invokespecial 990	org/vidogram/messenger/MediaController:Q	()V
    //   423: iload 8
    //   425: iload 6
    //   427: if_icmpne +14 -> 441
    //   430: iload 7
    //   432: iload 9
    //   434: if_icmpne +7 -> 441
    //   437: iload_3
    //   438: ifeq +2547 -> 2985
    //   441: aload_0
    //   442: aload 37
    //   444: iconst_0
    //   445: invokespecial 969	org/vidogram/messenger/MediaController:a	(Landroid/media/MediaExtractor;Z)I
    //   448: istore 17
    //   450: iload 17
    //   452: iflt +2875 -> 3327
    //   455: aconst_null
    //   456: astore 30
    //   458: ldc2_w 987
    //   461: lstore 19
    //   463: iconst_0
    //   464: istore 12
    //   466: iconst_0
    //   467: istore 6
    //   469: iconst_0
    //   470: istore 5
    //   472: iconst_0
    //   473: istore 14
    //   475: iconst_0
    //   476: istore 9
    //   478: bipush 251
    //   480: istore 10
    //   482: iconst_0
    //   483: istore_2
    //   484: aload 30
    //   486: astore 29
    //   488: getstatic 1505	android/os/Build:MANUFACTURER	Ljava/lang/String;
    //   491: invokevirtual 1286	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   494: astore 31
    //   496: aload 30
    //   498: astore 29
    //   500: getstatic 647	android/os/Build$VERSION:SDK_INT	I
    //   503: bipush 18
    //   505: if_icmpge +2911 -> 3416
    //   508: aload 30
    //   510: astore 29
    //   512: ldc_w 1507
    //   515: invokestatic 1509	org/vidogram/messenger/MediaController:a	(Ljava/lang/String;)Landroid/media/MediaCodecInfo;
    //   518: astore 32
    //   520: aload 30
    //   522: astore 29
    //   524: aload 32
    //   526: ldc_w 1507
    //   529: invokestatic 1511	org/vidogram/messenger/MediaController:a	(Landroid/media/MediaCodecInfo;Ljava/lang/String;)I
    //   532: istore 15
    //   534: iload 15
    //   536: ifne +240 -> 776
    //   539: aload 30
    //   541: astore 29
    //   543: new 875	java/lang/RuntimeException
    //   546: dup
    //   547: ldc_w 1513
    //   550: invokespecial 878	java/lang/RuntimeException:<init>	(Ljava/lang/String;)V
    //   553: athrow
    //   554: astore 32
    //   556: aconst_null
    //   557: astore 35
    //   559: aconst_null
    //   560: astore 31
    //   562: aconst_null
    //   563: astore 30
    //   565: aload 29
    //   567: astore 34
    //   569: aload 35
    //   571: astore 29
    //   573: ldc_w 501
    //   576: aload 32
    //   578: invokestatic 506	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   581: iconst_1
    //   582: istore 27
    //   584: aload 31
    //   586: astore 32
    //   588: aload 29
    //   590: astore 31
    //   592: aload 30
    //   594: astore 29
    //   596: aload 37
    //   598: iload 17
    //   600: invokevirtual 1030	android/media/MediaExtractor:unselectTrack	(I)V
    //   603: aload 31
    //   605: ifnull +8 -> 613
    //   608: aload 31
    //   610: invokevirtual 1517	org/vidogram/messenger/f/d:a	()V
    //   613: aload 32
    //   615: ifnull +8 -> 623
    //   618: aload 32
    //   620: invokevirtual 1520	org/vidogram/messenger/f/a:a	()V
    //   623: aload 29
    //   625: ifnull +13 -> 638
    //   628: aload 29
    //   630: invokevirtual 1523	android/media/MediaCodec:stop	()V
    //   633: aload 29
    //   635: invokevirtual 1524	android/media/MediaCodec:release	()V
    //   638: aload 34
    //   640: ifnull +13 -> 653
    //   643: aload 34
    //   645: invokevirtual 1523	android/media/MediaCodec:stop	()V
    //   648: aload 34
    //   650: invokevirtual 1524	android/media/MediaCodec:release	()V
    //   653: aload_0
    //   654: invokespecial 990	org/vidogram/messenger/MediaController:Q	()V
    //   657: goto +2690 -> 3347
    //   660: iload 27
    //   662: ifne +28 -> 690
    //   665: iload 16
    //   667: iconst_m1
    //   668: if_icmpeq +22 -> 690
    //   671: aload_0
    //   672: aload_1
    //   673: aload 37
    //   675: aload 33
    //   677: aload 44
    //   679: lload 19
    //   681: lload 23
    //   683: aload 42
    //   685: iconst_1
    //   686: invokespecial 1526	org/vidogram/messenger/MediaController:a	(Lorg/vidogram/messenger/u;Landroid/media/MediaExtractor;Lorg/vidogram/messenger/f/b;Landroid/media/MediaCodec$BufferInfo;JJLjava/io/File;Z)J
    //   689: pop2
    //   690: aload 37
    //   692: ifnull +8 -> 700
    //   695: aload 37
    //   697: invokevirtual 1527	android/media/MediaExtractor:release	()V
    //   700: aload 33
    //   702: ifnull +9 -> 711
    //   705: aload 33
    //   707: iconst_0
    //   708: invokevirtual 1528	org/vidogram/messenger/f/b:a	(Z)V
    //   711: ldc_w 501
    //   714: new 1530	java/lang/StringBuilder
    //   717: dup
    //   718: invokespecial 1531	java/lang/StringBuilder:<init>	()V
    //   721: ldc_w 1533
    //   724: invokevirtual 1537	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   727: invokestatic 1478	java/lang/System:currentTimeMillis	()J
    //   730: lload 25
    //   732: lsub
    //   733: invokevirtual 1540	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   736: invokevirtual 1541	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   739: invokestatic 536	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   742: aload 43
    //   744: invokeinterface 1461 1 0
    //   749: ldc_w 1457
    //   752: iconst_1
    //   753: invokeinterface 1467 3 0
    //   758: invokeinterface 1470 1 0
    //   763: pop
    //   764: aload_0
    //   765: aload_1
    //   766: aload 42
    //   768: iconst_1
    //   769: iload 27
    //   771: invokespecial 1024	org/vidogram/messenger/MediaController:a	(Lorg/vidogram/messenger/u;Ljava/io/File;ZZ)V
    //   774: iconst_1
    //   775: ireturn
    //   776: aload 30
    //   778: astore 29
    //   780: aload 32
    //   782: invokevirtual 914	android/media/MediaCodecInfo:getName	()Ljava/lang/String;
    //   785: astore 34
    //   787: aload 30
    //   789: astore 29
    //   791: aload 34
    //   793: ldc_w 1543
    //   796: invokevirtual 1547	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   799: ifeq +727 -> 1526
    //   802: iconst_1
    //   803: istore 11
    //   805: aload 30
    //   807: astore 29
    //   809: iload 11
    //   811: istore_2
    //   812: iload 9
    //   814: istore 4
    //   816: getstatic 647	android/os/Build$VERSION:SDK_INT	I
    //   819: bipush 16
    //   821: if_icmpne +43 -> 864
    //   824: aload 30
    //   826: astore 29
    //   828: aload 31
    //   830: ldc_w 1549
    //   833: invokevirtual 919	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   836: ifne +2518 -> 3354
    //   839: aload 30
    //   841: astore 29
    //   843: iload 11
    //   845: istore_2
    //   846: iload 9
    //   848: istore 4
    //   850: aload 31
    //   852: ldc_w 1551
    //   855: invokevirtual 919	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   858: ifeq +6 -> 864
    //   861: goto +2493 -> 3354
    //   864: aload 30
    //   866: astore 29
    //   868: ldc_w 501
    //   871: new 1530	java/lang/StringBuilder
    //   874: dup
    //   875: invokespecial 1531	java/lang/StringBuilder:<init>	()V
    //   878: ldc_w 1553
    //   881: invokevirtual 1537	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   884: aload 32
    //   886: invokevirtual 914	android/media/MediaCodecInfo:getName	()Ljava/lang/String;
    //   889: invokevirtual 1537	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   892: ldc_w 1555
    //   895: invokevirtual 1537	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   898: aload 31
    //   900: invokevirtual 1537	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   903: ldc_w 1557
    //   906: invokevirtual 1537	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   909: getstatic 1560	android/os/Build:MODEL	Ljava/lang/String;
    //   912: invokevirtual 1537	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   915: invokevirtual 1541	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   918: invokestatic 536	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   921: iload 4
    //   923: istore 14
    //   925: aload 30
    //   927: astore 29
    //   929: ldc_w 501
    //   932: new 1530	java/lang/StringBuilder
    //   935: dup
    //   936: invokespecial 1531	java/lang/StringBuilder:<init>	()V
    //   939: ldc_w 1562
    //   942: invokevirtual 1537	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   945: iload 15
    //   947: invokevirtual 1565	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   950: invokevirtual 1541	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   953: invokestatic 536	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   956: aload 30
    //   958: astore 29
    //   960: iload 8
    //   962: iload 7
    //   964: imul
    //   965: iconst_3
    //   966: imul
    //   967: iconst_2
    //   968: idiv
    //   969: istore 11
    //   971: iload_2
    //   972: ifne +653 -> 1625
    //   975: iload 7
    //   977: bipush 16
    //   979: irem
    //   980: ifeq +2341 -> 3321
    //   983: bipush 16
    //   985: iload 7
    //   987: bipush 16
    //   989: irem
    //   990: isub
    //   991: iload 7
    //   993: iadd
    //   994: iload 7
    //   996: isub
    //   997: iload 8
    //   999: imul
    //   1000: istore 9
    //   1002: aload 30
    //   1004: astore 29
    //   1006: iload 11
    //   1008: iload 9
    //   1010: iconst_5
    //   1011: imul
    //   1012: iconst_4
    //   1013: idiv
    //   1014: iadd
    //   1015: istore 11
    //   1017: aload 30
    //   1019: astore 29
    //   1021: aload 37
    //   1023: iload 17
    //   1025: invokevirtual 972	android/media/MediaExtractor:selectTrack	(I)V
    //   1028: lload 21
    //   1030: lconst_0
    //   1031: lcmp
    //   1032: ifle +704 -> 1736
    //   1035: aload 30
    //   1037: astore 29
    //   1039: aload 37
    //   1041: lload 21
    //   1043: iconst_0
    //   1044: invokevirtual 986	android/media/MediaExtractor:seekTo	(JI)V
    //   1047: aload 30
    //   1049: astore 29
    //   1051: aload 37
    //   1053: iload 17
    //   1055: invokevirtual 932	android/media/MediaExtractor:getTrackFormat	(I)Landroid/media/MediaFormat;
    //   1058: astore 35
    //   1060: aload 30
    //   1062: astore 29
    //   1064: ldc_w 1507
    //   1067: iload 8
    //   1069: iload 7
    //   1071: invokestatic 1569	android/media/MediaFormat:createVideoFormat	(Ljava/lang/String;II)Landroid/media/MediaFormat;
    //   1074: astore 31
    //   1076: aload 30
    //   1078: astore 29
    //   1080: aload 31
    //   1082: ldc_w 1571
    //   1085: iload 15
    //   1087: invokevirtual 1574	android/media/MediaFormat:setInteger	(Ljava/lang/String;I)V
    //   1090: iload 16
    //   1092: ifle +717 -> 1809
    //   1095: iload 16
    //   1097: istore_2
    //   1098: aload 30
    //   1100: astore 29
    //   1102: aload 31
    //   1104: ldc_w 1576
    //   1107: iload_2
    //   1108: invokevirtual 1574	android/media/MediaFormat:setInteger	(Ljava/lang/String;I)V
    //   1111: aload 30
    //   1113: astore 29
    //   1115: aload 31
    //   1117: ldc_w 1578
    //   1120: bipush 25
    //   1122: invokevirtual 1574	android/media/MediaFormat:setInteger	(Ljava/lang/String;I)V
    //   1125: aload 30
    //   1127: astore 29
    //   1129: aload 31
    //   1131: ldc_w 1580
    //   1134: bipush 10
    //   1136: invokevirtual 1574	android/media/MediaFormat:setInteger	(Ljava/lang/String;I)V
    //   1139: aload 30
    //   1141: astore 29
    //   1143: getstatic 647	android/os/Build$VERSION:SDK_INT	I
    //   1146: bipush 18
    //   1148: if_icmpge +34 -> 1182
    //   1151: aload 30
    //   1153: astore 29
    //   1155: aload 31
    //   1157: ldc_w 1582
    //   1160: iload 8
    //   1162: bipush 32
    //   1164: iadd
    //   1165: invokevirtual 1574	android/media/MediaFormat:setInteger	(Ljava/lang/String;I)V
    //   1168: aload 30
    //   1170: astore 29
    //   1172: aload 31
    //   1174: ldc_w 1584
    //   1177: iload 7
    //   1179: invokevirtual 1574	android/media/MediaFormat:setInteger	(Ljava/lang/String;I)V
    //   1182: aload 30
    //   1184: astore 29
    //   1186: ldc_w 1507
    //   1189: invokestatic 1588	android/media/MediaCodec:createEncoderByType	(Ljava/lang/String;)Landroid/media/MediaCodec;
    //   1192: astore 34
    //   1194: aload 34
    //   1196: astore 29
    //   1198: aload 34
    //   1200: aload 31
    //   1202: aconst_null
    //   1203: aconst_null
    //   1204: iconst_1
    //   1205: invokevirtual 1592	android/media/MediaCodec:configure	(Landroid/media/MediaFormat;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V
    //   1208: aload 34
    //   1210: astore 29
    //   1212: getstatic 647	android/os/Build$VERSION:SDK_INT	I
    //   1215: bipush 18
    //   1217: if_icmplt +2098 -> 3315
    //   1220: aload 34
    //   1222: astore 29
    //   1224: new 1519	org/vidogram/messenger/f/a
    //   1227: dup
    //   1228: aload 34
    //   1230: invokevirtual 1596	android/media/MediaCodec:createInputSurface	()Landroid/view/Surface;
    //   1233: invokespecial 1599	org/vidogram/messenger/f/a:<init>	(Landroid/view/Surface;)V
    //   1236: astore 30
    //   1238: aload 30
    //   1240: invokevirtual 1601	org/vidogram/messenger/f/a:b	()V
    //   1243: aload 34
    //   1245: invokevirtual 1602	android/media/MediaCodec:start	()V
    //   1248: aload 35
    //   1250: ldc_w 934
    //   1253: invokevirtual 940	android/media/MediaFormat:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   1256: invokestatic 1605	android/media/MediaCodec:createDecoderByType	(Ljava/lang/String;)Landroid/media/MediaCodec;
    //   1259: astore 32
    //   1261: getstatic 647	android/os/Build$VERSION:SDK_INT	I
    //   1264: bipush 18
    //   1266: if_icmplt +550 -> 1816
    //   1269: new 1515	org/vidogram/messenger/f/d
    //   1272: dup
    //   1273: invokespecial 1606	org/vidogram/messenger/f/d:<init>	()V
    //   1276: astore 31
    //   1278: aload 32
    //   1280: aload 35
    //   1282: aload 31
    //   1284: invokevirtual 1608	org/vidogram/messenger/f/d:c	()Landroid/view/Surface;
    //   1287: aconst_null
    //   1288: iconst_0
    //   1289: invokevirtual 1592	android/media/MediaCodec:configure	(Landroid/media/MediaFormat;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V
    //   1292: aload 32
    //   1294: invokevirtual 1602	android/media/MediaCodec:start	()V
    //   1297: aconst_null
    //   1298: astore 29
    //   1300: getstatic 647	android/os/Build$VERSION:SDK_INT	I
    //   1303: bipush 21
    //   1305: if_icmpge +2001 -> 3306
    //   1308: aload 32
    //   1310: invokevirtual 1612	android/media/MediaCodec:getInputBuffers	()[Ljava/nio/ByteBuffer;
    //   1313: astore 36
    //   1315: aload 34
    //   1317: invokevirtual 1615	android/media/MediaCodec:getOutputBuffers	()[Ljava/nio/ByteBuffer;
    //   1320: astore 29
    //   1322: getstatic 647	android/os/Build$VERSION:SDK_INT	I
    //   1325: bipush 18
    //   1327: if_icmpge +1973 -> 3300
    //   1330: aload 34
    //   1332: invokevirtual 1612	android/media/MediaCodec:getInputBuffers	()[Ljava/nio/ByteBuffer;
    //   1335: astore 35
    //   1337: aload_0
    //   1338: invokespecial 990	org/vidogram/messenger/MediaController:Q	()V
    //   1341: iload 12
    //   1343: istore 4
    //   1345: iload 10
    //   1347: istore_3
    //   1348: iload 6
    //   1350: istore_2
    //   1351: iload 4
    //   1353: ifne +1605 -> 2958
    //   1356: aload_0
    //   1357: invokespecial 990	org/vidogram/messenger/MediaController:Q	()V
    //   1360: iload_2
    //   1361: ifne +1933 -> 3294
    //   1364: aload 37
    //   1366: invokevirtual 995	android/media/MediaExtractor:getSampleTrackIndex	()I
    //   1369: istore 6
    //   1371: iload 6
    //   1373: iload 17
    //   1375: if_icmpne +2065 -> 3440
    //   1378: aload 32
    //   1380: ldc2_w 1616
    //   1383: invokevirtual 1621	android/media/MediaCodec:dequeueInputBuffer	(J)I
    //   1386: istore 6
    //   1388: iload 6
    //   1390: iflt +2047 -> 3437
    //   1393: getstatic 647	android/os/Build$VERSION:SDK_INT	I
    //   1396: bipush 21
    //   1398: if_icmpge +459 -> 1857
    //   1401: aload 36
    //   1403: iload 6
    //   1405: aaload
    //   1406: astore 38
    //   1408: aload 37
    //   1410: aload 38
    //   1412: iconst_0
    //   1413: invokevirtual 998	android/media/MediaExtractor:readSampleData	(Ljava/nio/ByteBuffer;I)I
    //   1416: istore 10
    //   1418: iload 10
    //   1420: ifge +449 -> 1869
    //   1423: aload 32
    //   1425: iload 6
    //   1427: iconst_0
    //   1428: iconst_0
    //   1429: lconst_0
    //   1430: iconst_4
    //   1431: invokevirtual 1625	android/media/MediaCodec:queueInputBuffer	(IIIJI)V
    //   1434: iconst_1
    //   1435: istore_2
    //   1436: goto +1927 -> 3363
    //   1439: iload_2
    //   1440: istore 12
    //   1442: iload 6
    //   1444: ifeq +1925 -> 3369
    //   1447: aload 32
    //   1449: ldc2_w 1616
    //   1452: invokevirtual 1621	android/media/MediaCodec:dequeueInputBuffer	(J)I
    //   1455: istore 6
    //   1457: iload_2
    //   1458: istore 12
    //   1460: iload 6
    //   1462: iflt +1907 -> 3369
    //   1465: aload 32
    //   1467: iload 6
    //   1469: iconst_0
    //   1470: iconst_0
    //   1471: lconst_0
    //   1472: iconst_4
    //   1473: invokevirtual 1625	android/media/MediaCodec:queueInputBuffer	(IIIJI)V
    //   1476: iconst_1
    //   1477: istore 12
    //   1479: goto +1890 -> 3369
    //   1482: aload_0
    //   1483: invokespecial 990	org/vidogram/messenger/MediaController:Q	()V
    //   1486: aload 34
    //   1488: aload 44
    //   1490: ldc2_w 1616
    //   1493: invokevirtual 1629	android/media/MediaCodec:dequeueOutputBuffer	(Landroid/media/MediaCodec$BufferInfo;J)I
    //   1496: istore 18
    //   1498: iload 18
    //   1500: iconst_m1
    //   1501: if_icmpne +393 -> 1894
    //   1504: iconst_0
    //   1505: istore 5
    //   1507: iload_3
    //   1508: istore 6
    //   1510: iload_2
    //   1511: istore_3
    //   1512: iload 18
    //   1514: iconst_m1
    //   1515: if_icmpeq +872 -> 2387
    //   1518: iload_3
    //   1519: istore_2
    //   1520: iload 6
    //   1522: istore_3
    //   1523: goto +1880 -> 3403
    //   1526: aload 30
    //   1528: astore 29
    //   1530: aload 34
    //   1532: ldc_w 1631
    //   1535: invokevirtual 1547	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   1538: ifeq +12 -> 1550
    //   1541: iconst_2
    //   1542: istore_2
    //   1543: iload 9
    //   1545: istore 4
    //   1547: goto -683 -> 864
    //   1550: aload 30
    //   1552: astore 29
    //   1554: aload 34
    //   1556: ldc_w 1633
    //   1559: invokevirtual 919	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   1562: ifeq +12 -> 1574
    //   1565: iconst_3
    //   1566: istore_2
    //   1567: iload 9
    //   1569: istore 4
    //   1571: goto -707 -> 864
    //   1574: aload 30
    //   1576: astore 29
    //   1578: aload 34
    //   1580: ldc_w 916
    //   1583: invokevirtual 919	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   1586: ifeq +11 -> 1597
    //   1589: iconst_4
    //   1590: istore_2
    //   1591: iconst_1
    //   1592: istore 4
    //   1594: goto -730 -> 864
    //   1597: aload 30
    //   1599: astore 29
    //   1601: iload 9
    //   1603: istore 4
    //   1605: aload 34
    //   1607: ldc_w 1635
    //   1610: invokevirtual 919	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   1613: ifeq -749 -> 864
    //   1616: iconst_5
    //   1617: istore_2
    //   1618: iload 9
    //   1620: istore 4
    //   1622: goto -758 -> 864
    //   1625: iload_2
    //   1626: iconst_1
    //   1627: if_icmpne +1799 -> 3426
    //   1630: aload 30
    //   1632: astore 29
    //   1634: aload 31
    //   1636: invokevirtual 1286	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   1639: ldc_w 1549
    //   1642: invokevirtual 919	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   1645: ifne +1676 -> 3321
    //   1648: iload 8
    //   1650: iload 7
    //   1652: imul
    //   1653: sipush 2047
    //   1656: iadd
    //   1657: sipush -2048
    //   1660: iand
    //   1661: iload 8
    //   1663: iload 7
    //   1665: imul
    //   1666: isub
    //   1667: istore 9
    //   1669: iload 11
    //   1671: iload 9
    //   1673: iadd
    //   1674: istore 11
    //   1676: goto -659 -> 1017
    //   1679: iload_2
    //   1680: iconst_3
    //   1681: if_icmpne +1640 -> 3321
    //   1684: aload 30
    //   1686: astore 29
    //   1688: aload 31
    //   1690: ldc_w 1637
    //   1693: invokevirtual 919	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   1696: ifeq +1625 -> 3321
    //   1699: bipush 16
    //   1701: iload 7
    //   1703: bipush 16
    //   1705: irem
    //   1706: isub
    //   1707: iload 7
    //   1709: iadd
    //   1710: iload 7
    //   1712: isub
    //   1713: iload 8
    //   1715: imul
    //   1716: istore 9
    //   1718: aload 30
    //   1720: astore 29
    //   1722: iload 11
    //   1724: iload 9
    //   1726: iconst_5
    //   1727: imul
    //   1728: iconst_4
    //   1729: idiv
    //   1730: iadd
    //   1731: istore 11
    //   1733: goto -716 -> 1017
    //   1736: aload 30
    //   1738: astore 29
    //   1740: aload 37
    //   1742: lconst_0
    //   1743: iconst_0
    //   1744: invokevirtual 986	android/media/MediaExtractor:seekTo	(JI)V
    //   1747: goto -700 -> 1047
    //   1750: astore_1
    //   1751: aload 37
    //   1753: astore 29
    //   1755: aload 29
    //   1757: ifnull +8 -> 1765
    //   1760: aload 29
    //   1762: invokevirtual 1527	android/media/MediaExtractor:release	()V
    //   1765: aload 33
    //   1767: ifnull +9 -> 1776
    //   1770: aload 33
    //   1772: iconst_0
    //   1773: invokevirtual 1528	org/vidogram/messenger/f/b:a	(Z)V
    //   1776: ldc_w 501
    //   1779: new 1530	java/lang/StringBuilder
    //   1782: dup
    //   1783: invokespecial 1531	java/lang/StringBuilder:<init>	()V
    //   1786: ldc_w 1533
    //   1789: invokevirtual 1537	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1792: invokestatic 1478	java/lang/System:currentTimeMillis	()J
    //   1795: lload 25
    //   1797: lsub
    //   1798: invokevirtual 1540	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   1801: invokevirtual 1541	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1804: invokestatic 536	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   1807: aload_1
    //   1808: athrow
    //   1809: ldc_w 1638
    //   1812: istore_2
    //   1813: goto -715 -> 1098
    //   1816: new 1515	org/vidogram/messenger/f/d
    //   1819: dup
    //   1820: iload 8
    //   1822: iload 7
    //   1824: iload_3
    //   1825: invokespecial 1641	org/vidogram/messenger/f/d:<init>	(III)V
    //   1828: astore 31
    //   1830: goto -552 -> 1278
    //   1833: astore 29
    //   1835: aload 32
    //   1837: astore 35
    //   1839: aload 29
    //   1841: astore 32
    //   1843: aconst_null
    //   1844: astore 29
    //   1846: aload 30
    //   1848: astore 31
    //   1850: aload 35
    //   1852: astore 30
    //   1854: goto -1281 -> 573
    //   1857: aload 32
    //   1859: iload 6
    //   1861: invokevirtual 1644	android/media/MediaCodec:getInputBuffer	(I)Ljava/nio/ByteBuffer;
    //   1864: astore 38
    //   1866: goto -458 -> 1408
    //   1869: aload 32
    //   1871: iload 6
    //   1873: iconst_0
    //   1874: iload 10
    //   1876: aload 37
    //   1878: invokevirtual 1006	android/media/MediaExtractor:getSampleTime	()J
    //   1881: iconst_0
    //   1882: invokevirtual 1625	android/media/MediaCodec:queueInputBuffer	(IIIJI)V
    //   1885: aload 37
    //   1887: invokevirtual 1027	android/media/MediaExtractor:advance	()Z
    //   1890: pop
    //   1891: goto +1546 -> 3437
    //   1894: iload 18
    //   1896: bipush 253
    //   1898: if_icmpne +32 -> 1930
    //   1901: iload_2
    //   1902: istore 6
    //   1904: iload_3
    //   1905: istore 10
    //   1907: getstatic 647	android/os/Build$VERSION:SDK_INT	I
    //   1910: bipush 21
    //   1912: if_icmpge +1581 -> 3493
    //   1915: aload 34
    //   1917: invokevirtual 1615	android/media/MediaCodec:getOutputBuffers	()[Ljava/nio/ByteBuffer;
    //   1920: astore 29
    //   1922: iload_3
    //   1923: istore 6
    //   1925: iload_2
    //   1926: istore_3
    //   1927: goto -415 -> 1512
    //   1930: iload 18
    //   1932: bipush 254
    //   1934: if_icmpne +32 -> 1966
    //   1937: aload 34
    //   1939: invokevirtual 1648	android/media/MediaCodec:getOutputFormat	()Landroid/media/MediaFormat;
    //   1942: astore 38
    //   1944: iload_2
    //   1945: istore 6
    //   1947: iload_2
    //   1948: bipush 251
    //   1950: if_icmpne +1507 -> 3457
    //   1953: aload 33
    //   1955: aload 38
    //   1957: iconst_0
    //   1958: invokevirtual 977	org/vidogram/messenger/f/b:a	(Landroid/media/MediaFormat;Z)I
    //   1961: istore 6
    //   1963: goto +1494 -> 3457
    //   1966: iload 18
    //   1968: ifge +32 -> 2000
    //   1971: new 875	java/lang/RuntimeException
    //   1974: dup
    //   1975: new 1530	java/lang/StringBuilder
    //   1978: dup
    //   1979: invokespecial 1531	java/lang/StringBuilder:<init>	()V
    //   1982: ldc_w 1650
    //   1985: invokevirtual 1537	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1988: iload 18
    //   1990: invokevirtual 1565	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1993: invokevirtual 1541	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1996: invokespecial 878	java/lang/RuntimeException:<init>	(Ljava/lang/String;)V
    //   1999: athrow
    //   2000: getstatic 647	android/os/Build$VERSION:SDK_INT	I
    //   2003: bipush 21
    //   2005: if_icmpge +50 -> 2055
    //   2008: aload 29
    //   2010: iload 18
    //   2012: aaload
    //   2013: astore 38
    //   2015: aload 38
    //   2017: ifnonnull +50 -> 2067
    //   2020: new 875	java/lang/RuntimeException
    //   2023: dup
    //   2024: new 1530	java/lang/StringBuilder
    //   2027: dup
    //   2028: invokespecial 1531	java/lang/StringBuilder:<init>	()V
    //   2031: ldc_w 1652
    //   2034: invokevirtual 1537	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2037: iload 18
    //   2039: invokevirtual 1565	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   2042: ldc_w 1654
    //   2045: invokevirtual 1537	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2048: invokevirtual 1541	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2051: invokespecial 878	java/lang/RuntimeException:<init>	(Ljava/lang/String;)V
    //   2054: athrow
    //   2055: aload 34
    //   2057: iload 18
    //   2059: invokevirtual 1657	android/media/MediaCodec:getOutputBuffer	(I)Ljava/nio/ByteBuffer;
    //   2062: astore 38
    //   2064: goto -49 -> 2015
    //   2067: iload_2
    //   2068: istore 6
    //   2070: aload 44
    //   2072: getfield 1002	android/media/MediaCodec$BufferInfo:size	I
    //   2075: iconst_1
    //   2076: if_icmple +42 -> 2118
    //   2079: aload 44
    //   2081: getfield 1018	android/media/MediaCodec$BufferInfo:flags	I
    //   2084: iconst_2
    //   2085: iand
    //   2086: ifne +56 -> 2142
    //   2089: iload_2
    //   2090: istore 6
    //   2092: aload 33
    //   2094: iload_2
    //   2095: aload 38
    //   2097: aload 44
    //   2099: iconst_0
    //   2100: invokevirtual 1021	org/vidogram/messenger/f/b:a	(ILjava/nio/ByteBuffer;Landroid/media/MediaCodec$BufferInfo;Z)Z
    //   2103: ifeq +15 -> 2118
    //   2106: aload_0
    //   2107: aload_1
    //   2108: aload 42
    //   2110: iconst_0
    //   2111: iconst_0
    //   2112: invokespecial 1024	org/vidogram/messenger/MediaController:a	(Lorg/vidogram/messenger/u;Ljava/io/File;ZZ)V
    //   2115: iload_2
    //   2116: istore 6
    //   2118: aload 44
    //   2120: getfield 1018	android/media/MediaCodec$BufferInfo:flags	I
    //   2123: iconst_4
    //   2124: iand
    //   2125: ifeq +1385 -> 3510
    //   2128: iconst_1
    //   2129: istore 10
    //   2131: aload 34
    //   2133: iload 18
    //   2135: iconst_0
    //   2136: invokevirtual 1661	android/media/MediaCodec:releaseOutputBuffer	(IZ)V
    //   2139: goto +1354 -> 3493
    //   2142: iload_2
    //   2143: istore 6
    //   2145: iload_2
    //   2146: bipush 251
    //   2148: if_icmpne -30 -> 2118
    //   2151: aload 44
    //   2153: getfield 1002	android/media/MediaCodec$BufferInfo:size	I
    //   2156: newarray byte
    //   2158: astore 45
    //   2160: aload 38
    //   2162: aload 44
    //   2164: getfield 1012	android/media/MediaCodec$BufferInfo:offset	I
    //   2167: aload 44
    //   2169: getfield 1002	android/media/MediaCodec$BufferInfo:size	I
    //   2172: iadd
    //   2173: invokevirtual 1665	java/nio/ByteBuffer:limit	(I)Ljava/nio/Buffer;
    //   2176: pop
    //   2177: aload 38
    //   2179: aload 44
    //   2181: getfield 1012	android/media/MediaCodec$BufferInfo:offset	I
    //   2184: invokevirtual 1668	java/nio/ByteBuffer:position	(I)Ljava/nio/Buffer;
    //   2187: pop
    //   2188: aload 38
    //   2190: aload 45
    //   2192: invokevirtual 1671	java/nio/ByteBuffer:get	([B)Ljava/nio/ByteBuffer;
    //   2195: pop
    //   2196: aconst_null
    //   2197: astore 40
    //   2199: aconst_null
    //   2200: astore 41
    //   2202: aload 44
    //   2204: getfield 1002	android/media/MediaCodec$BufferInfo:size	I
    //   2207: iconst_1
    //   2208: isub
    //   2209: istore_2
    //   2210: aload 41
    //   2212: astore 39
    //   2214: aload 40
    //   2216: astore 38
    //   2218: iload_2
    //   2219: iflt +113 -> 2332
    //   2222: aload 41
    //   2224: astore 39
    //   2226: aload 40
    //   2228: astore 38
    //   2230: iload_2
    //   2231: iconst_3
    //   2232: if_icmple +100 -> 2332
    //   2235: aload 45
    //   2237: iload_2
    //   2238: baload
    //   2239: iconst_1
    //   2240: if_icmpne +1263 -> 3503
    //   2243: aload 45
    //   2245: iload_2
    //   2246: iconst_1
    //   2247: isub
    //   2248: baload
    //   2249: ifne +1254 -> 3503
    //   2252: aload 45
    //   2254: iload_2
    //   2255: iconst_2
    //   2256: isub
    //   2257: baload
    //   2258: ifne +1245 -> 3503
    //   2261: aload 45
    //   2263: iload_2
    //   2264: iconst_3
    //   2265: isub
    //   2266: baload
    //   2267: ifne +1236 -> 3503
    //   2270: iload_2
    //   2271: iconst_3
    //   2272: isub
    //   2273: invokestatic 1674	java/nio/ByteBuffer:allocate	(I)Ljava/nio/ByteBuffer;
    //   2276: astore 38
    //   2278: aload 44
    //   2280: getfield 1002	android/media/MediaCodec$BufferInfo:size	I
    //   2283: iload_2
    //   2284: iconst_3
    //   2285: isub
    //   2286: isub
    //   2287: invokestatic 1674	java/nio/ByteBuffer:allocate	(I)Ljava/nio/ByteBuffer;
    //   2290: astore 39
    //   2292: aload 38
    //   2294: aload 45
    //   2296: iconst_0
    //   2297: iload_2
    //   2298: iconst_3
    //   2299: isub
    //   2300: invokevirtual 1678	java/nio/ByteBuffer:put	([BII)Ljava/nio/ByteBuffer;
    //   2303: iconst_0
    //   2304: invokevirtual 1668	java/nio/ByteBuffer:position	(I)Ljava/nio/Buffer;
    //   2307: pop
    //   2308: aload 39
    //   2310: aload 45
    //   2312: iload_2
    //   2313: iconst_3
    //   2314: isub
    //   2315: aload 44
    //   2317: getfield 1002	android/media/MediaCodec$BufferInfo:size	I
    //   2320: iload_2
    //   2321: iconst_3
    //   2322: isub
    //   2323: isub
    //   2324: invokevirtual 1678	java/nio/ByteBuffer:put	([BII)Ljava/nio/ByteBuffer;
    //   2327: iconst_0
    //   2328: invokevirtual 1668	java/nio/ByteBuffer:position	(I)Ljava/nio/Buffer;
    //   2331: pop
    //   2332: ldc_w 1507
    //   2335: iload 8
    //   2337: iload 7
    //   2339: invokestatic 1569	android/media/MediaFormat:createVideoFormat	(Ljava/lang/String;II)Landroid/media/MediaFormat;
    //   2342: astore 40
    //   2344: aload 38
    //   2346: ifnull +28 -> 2374
    //   2349: aload 39
    //   2351: ifnull +23 -> 2374
    //   2354: aload 40
    //   2356: ldc_w 1680
    //   2359: aload 38
    //   2361: invokevirtual 1684	android/media/MediaFormat:setByteBuffer	(Ljava/lang/String;Ljava/nio/ByteBuffer;)V
    //   2364: aload 40
    //   2366: ldc_w 1686
    //   2369: aload 39
    //   2371: invokevirtual 1684	android/media/MediaFormat:setByteBuffer	(Ljava/lang/String;Ljava/nio/ByteBuffer;)V
    //   2374: aload 33
    //   2376: aload 40
    //   2378: iconst_0
    //   2379: invokevirtual 977	org/vidogram/messenger/f/b:a	(Landroid/media/MediaFormat;Z)I
    //   2382: istore 6
    //   2384: goto -266 -> 2118
    //   2387: iload 13
    //   2389: ifne +893 -> 3282
    //   2392: aload 32
    //   2394: aload 44
    //   2396: ldc2_w 1616
    //   2399: invokevirtual 1629	android/media/MediaCodec:dequeueOutputBuffer	(Landroid/media/MediaCodec$BufferInfo;J)I
    //   2402: istore 18
    //   2404: iload 18
    //   2406: iconst_m1
    //   2407: if_icmpne +1120 -> 3527
    //   2410: iconst_0
    //   2411: istore_2
    //   2412: goto +1104 -> 3516
    //   2415: iload 18
    //   2417: bipush 254
    //   2419: if_icmpne +43 -> 2462
    //   2422: aload 32
    //   2424: invokevirtual 1648	android/media/MediaCodec:getOutputFormat	()Landroid/media/MediaFormat;
    //   2427: astore 38
    //   2429: ldc_w 501
    //   2432: new 1530	java/lang/StringBuilder
    //   2435: dup
    //   2436: invokespecial 1531	java/lang/StringBuilder:<init>	()V
    //   2439: ldc_w 1688
    //   2442: invokevirtual 1537	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2445: aload 38
    //   2447: invokevirtual 1691	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   2450: invokevirtual 1541	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2453: invokestatic 536	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   2456: iload 4
    //   2458: istore_2
    //   2459: goto +1057 -> 3516
    //   2462: iload 18
    //   2464: ifge +32 -> 2496
    //   2467: new 875	java/lang/RuntimeException
    //   2470: dup
    //   2471: new 1530	java/lang/StringBuilder
    //   2474: dup
    //   2475: invokespecial 1531	java/lang/StringBuilder:<init>	()V
    //   2478: ldc_w 1693
    //   2481: invokevirtual 1537	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2484: iload 18
    //   2486: invokevirtual 1565	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   2489: invokevirtual 1541	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2492: invokespecial 878	java/lang/RuntimeException:<init>	(Ljava/lang/String;)V
    //   2495: athrow
    //   2496: getstatic 647	android/os/Build$VERSION:SDK_INT	I
    //   2499: bipush 18
    //   2501: if_icmplt +254 -> 2755
    //   2504: aload 44
    //   2506: getfield 1002	android/media/MediaCodec$BufferInfo:size	I
    //   2509: ifeq +1031 -> 3540
    //   2512: iconst_1
    //   2513: istore 27
    //   2515: iload 27
    //   2517: istore 28
    //   2519: iload 13
    //   2521: istore 10
    //   2523: iload 12
    //   2525: istore_2
    //   2526: lload 23
    //   2528: lconst_0
    //   2529: lcmp
    //   2530: ifle +45 -> 2575
    //   2533: iload 27
    //   2535: istore 28
    //   2537: iload 13
    //   2539: istore 10
    //   2541: iload 12
    //   2543: istore_2
    //   2544: aload 44
    //   2546: getfield 1009	android/media/MediaCodec$BufferInfo:presentationTimeUs	J
    //   2549: lload 23
    //   2551: lcmp
    //   2552: iflt +23 -> 2575
    //   2555: iconst_1
    //   2556: istore_2
    //   2557: iconst_1
    //   2558: istore 10
    //   2560: iconst_0
    //   2561: istore 28
    //   2563: aload 44
    //   2565: aload 44
    //   2567: getfield 1018	android/media/MediaCodec$BufferInfo:flags	I
    //   2570: iconst_4
    //   2571: ior
    //   2572: putfield 1018	android/media/MediaCodec$BufferInfo:flags	I
    //   2575: lload 21
    //   2577: lconst_0
    //   2578: lcmp
    //   2579: ifle +700 -> 3279
    //   2582: lload 19
    //   2584: ldc2_w 987
    //   2587: lcmp
    //   2588: ifne +691 -> 3279
    //   2591: aload 44
    //   2593: getfield 1009	android/media/MediaCodec$BufferInfo:presentationTimeUs	J
    //   2596: lload 21
    //   2598: lcmp
    //   2599: ifge +177 -> 2776
    //   2602: iconst_0
    //   2603: istore 28
    //   2605: ldc_w 501
    //   2608: new 1530	java/lang/StringBuilder
    //   2611: dup
    //   2612: invokespecial 1531	java/lang/StringBuilder:<init>	()V
    //   2615: ldc_w 1695
    //   2618: invokevirtual 1537	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2621: lload 21
    //   2623: invokevirtual 1540	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   2626: ldc_w 1697
    //   2629: invokevirtual 1537	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2632: aload 44
    //   2634: getfield 1009	android/media/MediaCodec$BufferInfo:presentationTimeUs	J
    //   2637: invokevirtual 1540	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   2640: invokevirtual 1541	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2643: invokestatic 536	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   2646: aload 32
    //   2648: iload 18
    //   2650: iload 28
    //   2652: invokevirtual 1661	android/media/MediaCodec:releaseOutputBuffer	(IZ)V
    //   2655: iload 28
    //   2657: ifeq +50 -> 2707
    //   2660: iconst_0
    //   2661: istore 12
    //   2663: aload 31
    //   2665: invokevirtual 1698	org/vidogram/messenger/f/d:d	()V
    //   2668: iload 12
    //   2670: ifne +37 -> 2707
    //   2673: getstatic 647	android/os/Build$VERSION:SDK_INT	I
    //   2676: bipush 18
    //   2678: if_icmplt +124 -> 2802
    //   2681: aload 31
    //   2683: iconst_0
    //   2684: invokevirtual 1699	org/vidogram/messenger/f/d:a	(Z)V
    //   2687: aload 30
    //   2689: aload 44
    //   2691: getfield 1009	android/media/MediaCodec$BufferInfo:presentationTimeUs	J
    //   2694: ldc2_w 1700
    //   2697: lmul
    //   2698: invokevirtual 1704	org/vidogram/messenger/f/a:a	(J)V
    //   2701: aload 30
    //   2703: invokevirtual 1706	org/vidogram/messenger/f/a:c	()Z
    //   2706: pop
    //   2707: aload 44
    //   2709: getfield 1018	android/media/MediaCodec$BufferInfo:flags	I
    //   2712: iconst_4
    //   2713: iand
    //   2714: ifeq +552 -> 3266
    //   2717: iconst_0
    //   2718: istore 4
    //   2720: ldc_w 501
    //   2723: ldc_w 1708
    //   2726: invokestatic 536	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   2729: getstatic 647	android/os/Build$VERSION:SDK_INT	I
    //   2732: bipush 18
    //   2734: if_icmplt +158 -> 2892
    //   2737: aload 34
    //   2739: invokevirtual 1711	android/media/MediaCodec:signalEndOfInputStream	()V
    //   2742: iload_2
    //   2743: istore 12
    //   2745: iload 4
    //   2747: istore_2
    //   2748: iload 10
    //   2750: istore 13
    //   2752: goto +764 -> 3516
    //   2755: aload 44
    //   2757: getfield 1002	android/media/MediaCodec$BufferInfo:size	I
    //   2760: ifne +786 -> 3546
    //   2763: aload 44
    //   2765: getfield 1009	android/media/MediaCodec$BufferInfo:presentationTimeUs	J
    //   2768: lconst_0
    //   2769: lcmp
    //   2770: ifeq +782 -> 3552
    //   2773: goto +773 -> 3546
    //   2776: aload 44
    //   2778: getfield 1009	android/media/MediaCodec$BufferInfo:presentationTimeUs	J
    //   2781: lstore 19
    //   2783: goto -137 -> 2646
    //   2786: astore 38
    //   2788: iconst_1
    //   2789: istore 12
    //   2791: ldc_w 501
    //   2794: aload 38
    //   2796: invokestatic 506	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   2799: goto -131 -> 2668
    //   2802: aload 34
    //   2804: ldc2_w 1616
    //   2807: invokevirtual 1621	android/media/MediaCodec:dequeueInputBuffer	(J)I
    //   2810: istore 12
    //   2812: iload 12
    //   2814: iflt +66 -> 2880
    //   2817: aload 31
    //   2819: iconst_1
    //   2820: invokevirtual 1699	org/vidogram/messenger/f/d:a	(Z)V
    //   2823: aload 31
    //   2825: invokevirtual 1714	org/vidogram/messenger/f/d:e	()Ljava/nio/ByteBuffer;
    //   2828: astore 38
    //   2830: aload 35
    //   2832: iload 12
    //   2834: aaload
    //   2835: astore 39
    //   2837: aload 39
    //   2839: invokevirtual 1717	java/nio/ByteBuffer:clear	()Ljava/nio/Buffer;
    //   2842: pop
    //   2843: aload 38
    //   2845: aload 39
    //   2847: iload 15
    //   2849: iload 8
    //   2851: iload 7
    //   2853: iload 9
    //   2855: iload 14
    //   2857: invokestatic 1721	org/vidogram/messenger/Utilities:convertVideoFrame	(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;IIIII)I
    //   2860: pop
    //   2861: aload 34
    //   2863: iload 12
    //   2865: iconst_0
    //   2866: iload 11
    //   2868: aload 44
    //   2870: getfield 1009	android/media/MediaCodec$BufferInfo:presentationTimeUs	J
    //   2873: iconst_0
    //   2874: invokevirtual 1625	android/media/MediaCodec:queueInputBuffer	(IIIJI)V
    //   2877: goto -170 -> 2707
    //   2880: ldc_w 501
    //   2883: ldc_w 1723
    //   2886: invokestatic 536	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   2889: goto -182 -> 2707
    //   2892: aload 34
    //   2894: ldc2_w 1616
    //   2897: invokevirtual 1621	android/media/MediaCodec:dequeueInputBuffer	(J)I
    //   2900: istore 12
    //   2902: iload 12
    //   2904: iflt +18 -> 2922
    //   2907: aload 34
    //   2909: iload 12
    //   2911: iconst_0
    //   2912: iconst_1
    //   2913: aload 44
    //   2915: getfield 1009	android/media/MediaCodec$BufferInfo:presentationTimeUs	J
    //   2918: iconst_4
    //   2919: invokevirtual 1625	android/media/MediaCodec:queueInputBuffer	(IIIJI)V
    //   2922: iload_2
    //   2923: istore 12
    //   2925: iload 4
    //   2927: istore_2
    //   2928: iload 10
    //   2930: istore 13
    //   2932: goto +584 -> 3516
    //   2935: iload_2
    //   2936: istore 4
    //   2938: iload_3
    //   2939: istore 6
    //   2941: iload 13
    //   2943: istore 5
    //   2945: iload 12
    //   2947: istore_2
    //   2948: iload 4
    //   2950: istore_3
    //   2951: iload 6
    //   2953: istore 4
    //   2955: goto -1604 -> 1351
    //   2958: lload 19
    //   2960: ldc2_w 987
    //   2963: lcmp
    //   2964: ifeq +295 -> 3259
    //   2967: aload 32
    //   2969: astore 29
    //   2971: iconst_0
    //   2972: istore 27
    //   2974: lload 19
    //   2976: lstore 21
    //   2978: aload 30
    //   2980: astore 32
    //   2982: goto -2386 -> 596
    //   2985: aload_0
    //   2986: aload_1
    //   2987: aload 37
    //   2989: aload 33
    //   2991: aload 44
    //   2993: lload 21
    //   2995: lload 23
    //   2997: aload 42
    //   2999: iconst_0
    //   3000: invokespecial 1526	org/vidogram/messenger/MediaController:a	(Lorg/vidogram/messenger/u;Landroid/media/MediaExtractor;Lorg/vidogram/messenger/f/b;Landroid/media/MediaCodec$BufferInfo;JJLjava/io/File;Z)J
    //   3003: lstore 19
    //   3005: lload 19
    //   3007: ldc2_w 987
    //   3010: lcmp
    //   3011: ifeq +238 -> 3249
    //   3014: iconst_0
    //   3015: istore 27
    //   3017: goto -2357 -> 660
    //   3020: astore 29
    //   3022: ldc_w 501
    //   3025: aload 29
    //   3027: invokestatic 506	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   3030: goto -2319 -> 711
    //   3033: astore 30
    //   3035: iconst_1
    //   3036: istore 27
    //   3038: ldc_w 501
    //   3041: aload 30
    //   3043: invokestatic 506	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   3046: aload 31
    //   3048: ifnull +8 -> 3056
    //   3051: aload 31
    //   3053: invokevirtual 1527	android/media/MediaExtractor:release	()V
    //   3056: aload 29
    //   3058: ifnull +9 -> 3067
    //   3061: aload 29
    //   3063: iconst_0
    //   3064: invokevirtual 1528	org/vidogram/messenger/f/b:a	(Z)V
    //   3067: ldc_w 501
    //   3070: new 1530	java/lang/StringBuilder
    //   3073: dup
    //   3074: invokespecial 1531	java/lang/StringBuilder:<init>	()V
    //   3077: ldc_w 1533
    //   3080: invokevirtual 1537	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3083: invokestatic 1478	java/lang/System:currentTimeMillis	()J
    //   3086: lload 25
    //   3088: lsub
    //   3089: invokevirtual 1540	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   3092: invokevirtual 1541	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   3095: invokestatic 536	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   3098: goto -2356 -> 742
    //   3101: astore 29
    //   3103: ldc_w 501
    //   3106: aload 29
    //   3108: invokestatic 506	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   3111: goto -44 -> 3067
    //   3114: astore 29
    //   3116: ldc_w 501
    //   3119: aload 29
    //   3121: invokestatic 506	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   3124: goto -1348 -> 1776
    //   3127: aload 43
    //   3129: invokeinterface 1461 1 0
    //   3134: ldc_w 1457
    //   3137: iconst_1
    //   3138: invokeinterface 1467 3 0
    //   3143: invokeinterface 1470 1 0
    //   3148: pop
    //   3149: aload_0
    //   3150: aload_1
    //   3151: aload 42
    //   3153: iconst_1
    //   3154: iconst_1
    //   3155: invokespecial 1024	org/vidogram/messenger/MediaController:a	(Lorg/vidogram/messenger/u;Ljava/io/File;ZZ)V
    //   3158: iconst_0
    //   3159: ireturn
    //   3160: astore_1
    //   3161: aconst_null
    //   3162: astore 29
    //   3164: aconst_null
    //   3165: astore 33
    //   3167: goto -1412 -> 1755
    //   3170: astore_1
    //   3171: aconst_null
    //   3172: astore 29
    //   3174: goto -1419 -> 1755
    //   3177: astore_1
    //   3178: aload 29
    //   3180: astore 33
    //   3182: aload 31
    //   3184: astore 29
    //   3186: goto -1431 -> 1755
    //   3189: astore 30
    //   3191: aload 33
    //   3193: astore 29
    //   3195: goto -160 -> 3035
    //   3198: astore 30
    //   3200: aload 37
    //   3202: astore 31
    //   3204: aload 33
    //   3206: astore 29
    //   3208: goto -173 -> 3035
    //   3211: astore 32
    //   3213: aconst_null
    //   3214: astore 29
    //   3216: aconst_null
    //   3217: astore 35
    //   3219: aload 30
    //   3221: astore 31
    //   3223: aload 35
    //   3225: astore 30
    //   3227: goto -2654 -> 573
    //   3230: astore 32
    //   3232: aconst_null
    //   3233: astore 29
    //   3235: aconst_null
    //   3236: astore 35
    //   3238: aload 30
    //   3240: astore 31
    //   3242: aload 35
    //   3244: astore 30
    //   3246: goto -2673 -> 573
    //   3249: lload 21
    //   3251: lstore 19
    //   3253: iconst_0
    //   3254: istore 27
    //   3256: goto -2596 -> 660
    //   3259: lload 21
    //   3261: lstore 19
    //   3263: goto -296 -> 2967
    //   3266: iload_2
    //   3267: istore 12
    //   3269: iload 4
    //   3271: istore_2
    //   3272: iload 10
    //   3274: istore 13
    //   3276: goto +240 -> 3516
    //   3279: goto -633 -> 2646
    //   3282: iload 4
    //   3284: istore_2
    //   3285: goto +231 -> 3516
    //   3288: iconst_0
    //   3289: istore 6
    //   3291: goto -1852 -> 1439
    //   3294: iload_2
    //   3295: istore 12
    //   3297: goto +72 -> 3369
    //   3300: aconst_null
    //   3301: astore 35
    //   3303: goto -1966 -> 1337
    //   3306: aconst_null
    //   3307: astore 35
    //   3309: aconst_null
    //   3310: astore 36
    //   3312: goto -1975 -> 1337
    //   3315: aconst_null
    //   3316: astore 30
    //   3318: goto -2075 -> 1243
    //   3321: iconst_0
    //   3322: istore 9
    //   3324: goto -2307 -> 1017
    //   3327: iconst_0
    //   3328: istore 27
    //   3330: goto +17 -> 3347
    //   3333: iload_2
    //   3334: istore 7
    //   3336: iload_3
    //   3337: istore 8
    //   3339: iload 4
    //   3341: istore_2
    //   3342: iconst_0
    //   3343: istore_3
    //   3344: goto -3203 -> 141
    //   3347: lload 21
    //   3349: lstore 19
    //   3351: goto -2691 -> 660
    //   3354: iconst_1
    //   3355: istore 4
    //   3357: iload 11
    //   3359: istore_2
    //   3360: goto -2496 -> 864
    //   3363: iconst_0
    //   3364: istore 6
    //   3366: goto -1927 -> 1439
    //   3369: iload 5
    //   3371: ifne +81 -> 3452
    //   3374: iconst_1
    //   3375: istore_2
    //   3376: iconst_1
    //   3377: istore 10
    //   3379: iload_2
    //   3380: istore 6
    //   3382: iload 5
    //   3384: istore 13
    //   3386: iload 4
    //   3388: istore 5
    //   3390: iload_3
    //   3391: istore_2
    //   3392: iload 6
    //   3394: istore 4
    //   3396: iload 5
    //   3398: istore_3
    //   3399: iload 10
    //   3401: istore 5
    //   3403: iload 4
    //   3405: ifne -1923 -> 1482
    //   3408: iload 5
    //   3410: ifeq -475 -> 2935
    //   3413: goto -1931 -> 1482
    //   3416: ldc_w 1724
    //   3419: istore 15
    //   3421: iconst_0
    //   3422: istore_2
    //   3423: goto -2498 -> 925
    //   3426: iload_2
    //   3427: iconst_5
    //   3428: if_icmpne -1749 -> 1679
    //   3431: iconst_0
    //   3432: istore 9
    //   3434: goto -2417 -> 1017
    //   3437: goto -74 -> 3363
    //   3440: iload 6
    //   3442: iconst_m1
    //   3443: if_icmpne -155 -> 3288
    //   3446: iconst_1
    //   3447: istore 6
    //   3449: goto -2010 -> 1439
    //   3452: iconst_0
    //   3453: istore_2
    //   3454: goto -78 -> 3376
    //   3457: iload_3
    //   3458: istore_2
    //   3459: iload 6
    //   3461: istore_3
    //   3462: iload_2
    //   3463: istore 6
    //   3465: goto -1953 -> 1512
    //   3468: astore 29
    //   3470: aload 32
    //   3472: astore 35
    //   3474: aload 29
    //   3476: astore 32
    //   3478: aload 31
    //   3480: astore 29
    //   3482: aload 30
    //   3484: astore 31
    //   3486: aload 35
    //   3488: astore 30
    //   3490: goto -2917 -> 573
    //   3493: iload 6
    //   3495: istore_3
    //   3496: iload 10
    //   3498: istore 6
    //   3500: goto -1988 -> 1512
    //   3503: iload_2
    //   3504: iconst_1
    //   3505: isub
    //   3506: istore_2
    //   3507: goto -1297 -> 2210
    //   3510: iconst_0
    //   3511: istore 10
    //   3513: goto -1382 -> 2131
    //   3516: iload_2
    //   3517: istore 4
    //   3519: iload_3
    //   3520: istore_2
    //   3521: iload 6
    //   3523: istore_3
    //   3524: goto -121 -> 3403
    //   3527: iload 18
    //   3529: bipush 253
    //   3531: if_icmpne -1116 -> 2415
    //   3534: iload 4
    //   3536: istore_2
    //   3537: goto -21 -> 3516
    //   3540: iconst_0
    //   3541: istore 27
    //   3543: goto -1028 -> 2515
    //   3546: iconst_1
    //   3547: istore 27
    //   3549: goto -1034 -> 2515
    //   3552: iconst_0
    //   3553: istore 27
    //   3555: goto -1040 -> 2515
    //
    // Exception table:
    //   from	to	target	type
    //   488	496	554	java/lang/Exception
    //   500	508	554	java/lang/Exception
    //   512	520	554	java/lang/Exception
    //   524	534	554	java/lang/Exception
    //   543	554	554	java/lang/Exception
    //   780	787	554	java/lang/Exception
    //   791	802	554	java/lang/Exception
    //   816	824	554	java/lang/Exception
    //   828	839	554	java/lang/Exception
    //   850	861	554	java/lang/Exception
    //   868	921	554	java/lang/Exception
    //   929	956	554	java/lang/Exception
    //   960	971	554	java/lang/Exception
    //   1006	1017	554	java/lang/Exception
    //   1021	1028	554	java/lang/Exception
    //   1039	1047	554	java/lang/Exception
    //   1051	1060	554	java/lang/Exception
    //   1064	1076	554	java/lang/Exception
    //   1080	1090	554	java/lang/Exception
    //   1102	1111	554	java/lang/Exception
    //   1115	1125	554	java/lang/Exception
    //   1129	1139	554	java/lang/Exception
    //   1143	1151	554	java/lang/Exception
    //   1155	1168	554	java/lang/Exception
    //   1172	1182	554	java/lang/Exception
    //   1186	1194	554	java/lang/Exception
    //   1198	1208	554	java/lang/Exception
    //   1212	1220	554	java/lang/Exception
    //   1224	1238	554	java/lang/Exception
    //   1530	1541	554	java/lang/Exception
    //   1554	1565	554	java/lang/Exception
    //   1578	1589	554	java/lang/Exception
    //   1605	1616	554	java/lang/Exception
    //   1634	1648	554	java/lang/Exception
    //   1688	1699	554	java/lang/Exception
    //   1722	1733	554	java/lang/Exception
    //   1740	1747	554	java/lang/Exception
    //   409	423	1750	finally
    //   441	450	1750	finally
    //   488	496	1750	finally
    //   500	508	1750	finally
    //   512	520	1750	finally
    //   524	534	1750	finally
    //   543	554	1750	finally
    //   573	581	1750	finally
    //   596	603	1750	finally
    //   608	613	1750	finally
    //   618	623	1750	finally
    //   628	638	1750	finally
    //   643	653	1750	finally
    //   653	657	1750	finally
    //   671	690	1750	finally
    //   780	787	1750	finally
    //   791	802	1750	finally
    //   816	824	1750	finally
    //   828	839	1750	finally
    //   850	861	1750	finally
    //   868	921	1750	finally
    //   929	956	1750	finally
    //   960	971	1750	finally
    //   1006	1017	1750	finally
    //   1021	1028	1750	finally
    //   1039	1047	1750	finally
    //   1051	1060	1750	finally
    //   1064	1076	1750	finally
    //   1080	1090	1750	finally
    //   1102	1111	1750	finally
    //   1115	1125	1750	finally
    //   1129	1139	1750	finally
    //   1143	1151	1750	finally
    //   1155	1168	1750	finally
    //   1172	1182	1750	finally
    //   1186	1194	1750	finally
    //   1198	1208	1750	finally
    //   1212	1220	1750	finally
    //   1224	1238	1750	finally
    //   1238	1243	1750	finally
    //   1243	1261	1750	finally
    //   1261	1278	1750	finally
    //   1278	1297	1750	finally
    //   1300	1337	1750	finally
    //   1337	1341	1750	finally
    //   1356	1360	1750	finally
    //   1364	1371	1750	finally
    //   1378	1388	1750	finally
    //   1393	1401	1750	finally
    //   1408	1418	1750	finally
    //   1423	1434	1750	finally
    //   1447	1457	1750	finally
    //   1465	1476	1750	finally
    //   1482	1498	1750	finally
    //   1530	1541	1750	finally
    //   1554	1565	1750	finally
    //   1578	1589	1750	finally
    //   1605	1616	1750	finally
    //   1634	1648	1750	finally
    //   1688	1699	1750	finally
    //   1722	1733	1750	finally
    //   1740	1747	1750	finally
    //   1816	1830	1750	finally
    //   1857	1866	1750	finally
    //   1869	1891	1750	finally
    //   1907	1922	1750	finally
    //   1937	1944	1750	finally
    //   1953	1963	1750	finally
    //   1971	2000	1750	finally
    //   2000	2008	1750	finally
    //   2020	2055	1750	finally
    //   2055	2064	1750	finally
    //   2070	2089	1750	finally
    //   2092	2115	1750	finally
    //   2118	2128	1750	finally
    //   2131	2139	1750	finally
    //   2151	2196	1750	finally
    //   2202	2210	1750	finally
    //   2270	2332	1750	finally
    //   2332	2344	1750	finally
    //   2354	2374	1750	finally
    //   2374	2384	1750	finally
    //   2392	2404	1750	finally
    //   2422	2456	1750	finally
    //   2467	2496	1750	finally
    //   2496	2512	1750	finally
    //   2544	2555	1750	finally
    //   2563	2575	1750	finally
    //   2591	2602	1750	finally
    //   2605	2646	1750	finally
    //   2646	2655	1750	finally
    //   2663	2668	1750	finally
    //   2673	2707	1750	finally
    //   2707	2717	1750	finally
    //   2720	2742	1750	finally
    //   2755	2773	1750	finally
    //   2776	2783	1750	finally
    //   2791	2799	1750	finally
    //   2802	2812	1750	finally
    //   2817	2830	1750	finally
    //   2837	2877	1750	finally
    //   2880	2889	1750	finally
    //   2892	2902	1750	finally
    //   2907	2922	1750	finally
    //   2985	3005	1750	finally
    //   1261	1278	1833	java/lang/Exception
    //   1816	1830	1833	java/lang/Exception
    //   2663	2668	2786	java/lang/Exception
    //   705	711	3020	java/lang/Exception
    //   346	400	3033	java/lang/Exception
    //   3061	3067	3101	java/lang/Exception
    //   1770	1776	3114	java/lang/Exception
    //   346	400	3160	finally
    //   400	409	3170	finally
    //   3038	3046	3177	finally
    //   400	409	3189	java/lang/Exception
    //   409	423	3198	java/lang/Exception
    //   441	450	3198	java/lang/Exception
    //   573	581	3198	java/lang/Exception
    //   596	603	3198	java/lang/Exception
    //   608	613	3198	java/lang/Exception
    //   618	623	3198	java/lang/Exception
    //   628	638	3198	java/lang/Exception
    //   643	653	3198	java/lang/Exception
    //   653	657	3198	java/lang/Exception
    //   671	690	3198	java/lang/Exception
    //   2985	3005	3198	java/lang/Exception
    //   1238	1243	3211	java/lang/Exception
    //   1243	1261	3230	java/lang/Exception
    //   1278	1297	3468	java/lang/Exception
    //   1300	1337	3468	java/lang/Exception
    //   1337	1341	3468	java/lang/Exception
    //   1356	1360	3468	java/lang/Exception
    //   1364	1371	3468	java/lang/Exception
    //   1378	1388	3468	java/lang/Exception
    //   1393	1401	3468	java/lang/Exception
    //   1408	1418	3468	java/lang/Exception
    //   1423	1434	3468	java/lang/Exception
    //   1447	1457	3468	java/lang/Exception
    //   1465	1476	3468	java/lang/Exception
    //   1482	1498	3468	java/lang/Exception
    //   1857	1866	3468	java/lang/Exception
    //   1869	1891	3468	java/lang/Exception
    //   1907	1922	3468	java/lang/Exception
    //   1937	1944	3468	java/lang/Exception
    //   1953	1963	3468	java/lang/Exception
    //   1971	2000	3468	java/lang/Exception
    //   2000	2008	3468	java/lang/Exception
    //   2020	2055	3468	java/lang/Exception
    //   2055	2064	3468	java/lang/Exception
    //   2070	2089	3468	java/lang/Exception
    //   2092	2115	3468	java/lang/Exception
    //   2118	2128	3468	java/lang/Exception
    //   2131	2139	3468	java/lang/Exception
    //   2151	2196	3468	java/lang/Exception
    //   2202	2210	3468	java/lang/Exception
    //   2270	2332	3468	java/lang/Exception
    //   2332	2344	3468	java/lang/Exception
    //   2354	2374	3468	java/lang/Exception
    //   2374	2384	3468	java/lang/Exception
    //   2392	2404	3468	java/lang/Exception
    //   2422	2456	3468	java/lang/Exception
    //   2467	2496	3468	java/lang/Exception
    //   2496	2512	3468	java/lang/Exception
    //   2544	2555	3468	java/lang/Exception
    //   2563	2575	3468	java/lang/Exception
    //   2591	2602	3468	java/lang/Exception
    //   2605	2646	3468	java/lang/Exception
    //   2646	2655	3468	java/lang/Exception
    //   2673	2707	3468	java/lang/Exception
    //   2707	2717	3468	java/lang/Exception
    //   2720	2742	3468	java/lang/Exception
    //   2755	2773	3468	java/lang/Exception
    //   2776	2783	3468	java/lang/Exception
    //   2791	2799	3468	java/lang/Exception
    //   2802	2812	3468	java/lang/Exception
    //   2817	2830	3468	java/lang/Exception
    //   2837	2877	3468	java/lang/Exception
    //   2880	2889	3468	java/lang/Exception
    //   2892	2902	3468	java/lang/Exception
    //   2907	2922	3468	java/lang/Exception
  }

  private native int openOpusFile(String paramString);

  private native void readOpusFile(ByteBuffer paramByteBuffer, int paramInt, int[] paramArrayOfInt);

  private native int seekOpusFile(float paramFloat);

  private native int startRecord(String paramString);

  private native void stopRecord();

  private native int writeFrame(ByteBuffer paramByteBuffer, int paramInt);

  public boolean A()
  {
    return this.ad;
  }

  public boolean B()
  {
    return this.ae;
  }

  public boolean C()
  {
    return this.af;
  }

  public boolean D()
  {
    return this.ag;
  }

  public boolean E()
  {
    return this.ah;
  }

  protected void a(int paramInt, ArrayList<i> paramArrayList)
  {
    if (paramArrayList.isEmpty())
      return;
    ArrayList localArrayList;
    if (paramInt == 1)
      localArrayList = this.W;
    while (true)
    {
      label19: int i1 = 0;
      label21: i locali;
      String str;
      if (i1 < paramArrayList.size())
      {
        locali = (i)paramArrayList.get(i1);
        if (!(locali.a instanceof g.q))
          break label155;
        str = m.b((g.q)locali.a);
        label63: if (!this.ac.containsKey(str))
          break label168;
      }
      label263: 
      while (true)
      {
        i1 += 1;
        break label21;
        break;
        if (paramInt == 2)
        {
          localArrayList = this.X;
          break label19;
        }
        if (paramInt == 4)
        {
          localArrayList = this.ab;
          break label19;
        }
        if (paramInt == 8)
        {
          localArrayList = this.Y;
          break label19;
        }
        if (paramInt == 16)
        {
          localArrayList = this.Z;
          break label19;
        }
        if (paramInt != 32)
          break label265;
        localArrayList = this.aa;
        break label19;
        label155: str = m.b(locali.a);
        break label63;
        label168: if ((locali.a instanceof g.az))
        {
          m.a().a((g.az)locali.a, null, false);
          paramInt = 1;
        }
        while (true)
        {
          if (paramInt == 0)
            break label263;
          localArrayList.add(locali);
          this.ac.put(str, locali);
          break;
          if ((locali.a instanceof g.q))
          {
            g.q localq = (g.q)locali.a;
            m.a().a(localq, false, false);
            paramInt = 1;
            continue;
          }
          paramInt = 0;
        }
      }
      label265: localArrayList = null;
    }
  }

  public void a(int paramInt, Object[] paramArrayOfObject)
  {
    int i1 = 0;
    int i3 = 0;
    int i2 = 0;
    Object localObject1;
    Object localObject2;
    Object localObject3;
    if ((paramInt == y.aA) || (paramInt == y.am))
    {
      this.ap = true;
      localObject1 = (String)paramArrayOfObject[0];
      localObject2 = (ArrayList)this.am.get(localObject1);
      if (localObject2 != null)
      {
        paramInt = 0;
        while (paramInt < ((ArrayList)localObject2).size())
        {
          localObject3 = (WeakReference)((ArrayList)localObject2).get(paramInt);
          if (((WeakReference)localObject3).get() != null)
          {
            ((e)((WeakReference)localObject3).get()).a((String)localObject1);
            this.ao.remove(Integer.valueOf(((e)((WeakReference)localObject3).get()).getObserverTag()));
          }
          paramInt += 1;
        }
        this.am.remove(localObject1);
      }
      this.ap = false;
      K();
      a((String)localObject1, ((Integer)paramArrayOfObject[1]).intValue());
      return;
    }
    if ((paramInt == y.az) || (paramInt == y.al))
    {
      this.ap = true;
      paramArrayOfObject = (String)paramArrayOfObject[0];
      if ((this.aK) && (this.ax != null) && (m.b(this.ax.A()).equals(paramArrayOfObject)))
      {
        this.aL = true;
        a(this.ax);
      }
      localObject1 = (ArrayList)this.an.get(paramArrayOfObject);
      if (localObject1 != null)
      {
        paramInt = 0;
        while (paramInt < ((ArrayList)localObject1).size())
        {
          ((u)((ArrayList)localObject1).get(paramInt)).s = true;
          paramInt += 1;
        }
        this.an.remove(paramArrayOfObject);
      }
      localObject1 = (ArrayList)this.am.get(paramArrayOfObject);
      if (localObject1 != null)
      {
        paramInt = 0;
        while (paramInt < ((ArrayList)localObject1).size())
        {
          localObject2 = (WeakReference)((ArrayList)localObject1).get(paramInt);
          if (((WeakReference)localObject2).get() != null)
          {
            ((e)((WeakReference)localObject2).get()).b(paramArrayOfObject);
            this.ao.remove(Integer.valueOf(((e)((WeakReference)localObject2).get()).getObserverTag()));
          }
          paramInt += 1;
        }
        this.am.remove(paramArrayOfObject);
      }
      this.ap = false;
      K();
      a(paramArrayOfObject, 0);
      return;
    }
    if (paramInt == y.ay)
    {
      this.ap = true;
      localObject1 = (String)paramArrayOfObject[0];
      localObject2 = (ArrayList)this.am.get(localObject1);
      if (localObject2 != null)
      {
        paramArrayOfObject = (Float)paramArrayOfObject[1];
        localObject2 = ((ArrayList)localObject2).iterator();
        while (((Iterator)localObject2).hasNext())
        {
          localObject3 = (WeakReference)((Iterator)localObject2).next();
          if (((WeakReference)localObject3).get() == null)
            continue;
          ((e)((WeakReference)localObject3).get()).a((String)localObject1, paramArrayOfObject.floatValue());
        }
      }
      this.ap = false;
      K();
      return;
    }
    if (paramInt == y.ax)
    {
      this.ap = true;
      localObject1 = (String)paramArrayOfObject[0];
      localObject3 = (ArrayList)this.am.get(localObject1);
      if (localObject3 != null)
      {
        localObject2 = (Float)paramArrayOfObject[1];
        paramArrayOfObject = (Boolean)paramArrayOfObject[2];
        localObject3 = ((ArrayList)localObject3).iterator();
        while (((Iterator)localObject3).hasNext())
        {
          WeakReference localWeakReference = (WeakReference)((Iterator)localObject3).next();
          if (localWeakReference.get() == null)
            continue;
          ((e)localWeakReference.get()).a((String)localObject1, ((Float)localObject2).floatValue(), paramArrayOfObject.booleanValue());
        }
      }
      this.ap = false;
      K();
    }
    while (true)
    {
      long l1;
      try
      {
        paramArrayOfObject = ac.a().b((String)localObject1);
        if (paramArrayOfObject == null)
          break;
        paramInt = i2;
        if (paramInt >= paramArrayOfObject.size())
          break;
        localObject1 = (ac.a)paramArrayOfObject.get(paramInt);
        if (((ac.a)localObject1).i != null)
          break label1291;
        l1 = ((ac.a)localObject1).h.u();
        localObject2 = (Long)this.i.get(Long.valueOf(l1));
        if ((localObject2 != null) && (((Long)localObject2).longValue() + 4000L >= System.currentTimeMillis()))
          break label1291;
        if (!u.g(((ac.a)localObject1).f))
          continue;
        v.a().a(l1, 5, 0);
        this.i.put(Long.valueOf(l1), Long.valueOf(System.currentTimeMillis()));
        break label1291;
        if (((ac.a)localObject1).f != null)
        {
          v.a().a(l1, 3, 0);
          continue;
        }
      }
      catch (Exception paramArrayOfObject)
      {
        n.a("tmessages", paramArrayOfObject);
        return;
      }
      if (((ac.a)localObject1).e == null)
        continue;
      v.a().a(l1, 4, 0);
      continue;
      if (paramInt == y.e)
      {
        paramInt = ((Integer)paramArrayOfObject[1]).intValue();
        paramArrayOfObject = (ArrayList)paramArrayOfObject[0];
        if ((this.ax != null) && (paramInt == this.ax.a.d.b) && (paramArrayOfObject.contains(Integer.valueOf(this.ax.q()))))
          a(true, true);
        if ((this.T == null) || (this.T.isEmpty()) || (paramInt != ((u)this.T.get(0)).a.d.b))
          break;
        paramInt = i1;
        while (paramInt < paramArrayOfObject.size())
        {
          localObject1 = (u)this.U.remove(paramArrayOfObject.get(paramInt));
          if (localObject1 != null)
            this.T.remove(localObject1);
          paramInt += 1;
        }
        break;
      }
      if (paramInt == y.v)
      {
        l1 = ((Long)paramArrayOfObject[0]).longValue();
        if ((this.ax == null) || (this.ax.u() != l1))
          break;
        a(false, true);
        return;
      }
      if (paramInt == y.X)
      {
        l1 = ((Long)paramArrayOfObject[0]).longValue();
        if ((this.ax == null) || (!this.ax.G()) || (this.ax.u() != l1))
          break;
        paramArrayOfObject = (ArrayList)paramArrayOfObject[1];
        this.aG.addAll(0, paramArrayOfObject);
        if (this.ai)
        {
          N();
          this.aI = 0;
          return;
        }
        paramInt = this.aI;
        this.aI = (paramArrayOfObject.size() + paramInt);
        return;
      }
      if ((paramInt != y.a) || (this.T == null) || (this.T.isEmpty()))
        break;
      localObject1 = (u)this.T.get(0);
      if (((Long)paramArrayOfObject[0]).longValue() != ((u)localObject1).u())
        break;
      paramArrayOfObject = (ArrayList)paramArrayOfObject[1];
      paramInt = i3;
      while (paramInt < paramArrayOfObject.size())
      {
        localObject1 = (u)paramArrayOfObject.get(paramInt);
        if ((((u)localObject1).H()) && ((!this.S) || ((((u)localObject1).n()) && (!((u)localObject1).j()))))
        {
          this.T.add(localObject1);
          this.U.put(Integer.valueOf(((u)localObject1).q()), localObject1);
        }
        paramInt += 1;
      }
      break;
      label1291: paramInt += 1;
    }
  }

  public void a(long paramLong1, long paramLong2, g.t paramt, ArrayList<Long> paramArrayList)
  {
    this.bn = paramLong1;
    this.bo = paramLong2;
    this.bq = paramt;
    this.br = paramArrayList;
  }

  public void a(long paramLong, u paramu)
  {
    int i2 = 0;
    int i1 = i2;
    if (this.ax != null)
    {
      i1 = i2;
      if (d(this.ax))
      {
        i1 = i2;
        if (!s())
        {
          i1 = 1;
          b(this.ax);
        }
      }
    }
    try
    {
      ((Vibrator)ApplicationLoader.a.getSystemService("vibrator")).vibrate(50L);
      h localh = this.bi;
      paramu = new Runnable(paramLong, paramu)
      {
        public void run()
        {
          if (MediaController.a(MediaController.this) != null)
          {
            a.a(new Runnable()
            {
              public void run()
              {
                MediaController.b(MediaController.this, null);
                y.a().a(y.aJ, new Object[0]);
              }
            });
            return;
          }
          MediaController.a(MediaController.this, new g.hs());
          MediaController.r(MediaController.this).k = -2147483648;
          MediaController.r(MediaController.this).b = ad.d;
          MediaController.r(MediaController.this).d = ad.c();
          MediaController.r(MediaController.this).g = "audio/ogg";
          MediaController.r(MediaController.this).i = new g.rt();
          MediaController.r(MediaController.this).i.b = "s";
          ad.d -= 1;
          ad.a(false);
          MediaController.a(MediaController.this, new File(m.a().b(4), m.b(MediaController.r(MediaController.this))));
          try
          {
            if (MediaController.b(MediaController.this, MediaController.S(MediaController.this).getAbsolutePath()) == 0)
            {
              a.a(new Runnable()
              {
                public void run()
                {
                  MediaController.b(MediaController.this, null);
                  y.a().a(y.aJ, new Object[0]);
                }
              });
              return;
            }
          }
          catch (Exception localException1)
          {
            n.a("tmessages", localException1);
            MediaController.a(MediaController.this, null);
            MediaController.T(MediaController.this);
            MediaController.S(MediaController.this).delete();
            MediaController.a(MediaController.this, null);
          }
          try
          {
            MediaController.a(MediaController.this).release();
            MediaController.a(MediaController.this, null);
            a.a(new Runnable()
            {
              public void run()
              {
                MediaController.b(MediaController.this, null);
                y.a().a(y.aJ, new Object[0]);
              }
            });
            return;
            MediaController.a(MediaController.this, new AudioRecord(1, 16000, 16, 2, MediaController.c(MediaController.this) * 10));
            MediaController.d(MediaController.this, System.currentTimeMillis());
            MediaController.b(MediaController.this, 0L);
            MediaController.a(MediaController.this, 0L);
            MediaController.e(MediaController.this, this.a);
            MediaController.a(MediaController.this, this.b);
            MediaController.f(MediaController.this).rewind();
            MediaController.a(MediaController.this).startRecording();
            MediaController.h(MediaController.this).b(MediaController.j(MediaController.this));
            a.a(new Runnable()
            {
              public void run()
              {
                MediaController.b(MediaController.this, null);
                y.a().a(y.aI, new Object[0]);
              }
            });
            return;
          }
          catch (Exception localException2)
          {
            while (true)
              n.a("tmessages", localException2);
          }
        }
      };
      this.bh = paramu;
      if (i1 != 0)
      {
        paramLong = 500L;
        localh.a(paramu, paramLong);
        return;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        n.a("tmessages", localException);
        continue;
        paramLong = 50L;
      }
    }
  }

  public void a(Uri paramUri)
  {
    while (true)
    {
      ArrayList localArrayList;
      try
      {
        Point localPoint = a.g();
        paramUri = ApplicationLoader.a.getContentResolver().query(paramUri, this.bu, null, null, "date_added DESC LIMIT 1");
        localArrayList = new ArrayList();
        if (paramUri == null)
          break label336;
        if (paramUri.moveToNext())
        {
          String str1 = paramUri.getString(0);
          Object localObject = paramUri.getString(1);
          String str2 = paramUri.getString(2);
          long l1 = paramUri.getLong(3);
          String str3 = paramUri.getString(4);
          if (Build.VERSION.SDK_INT < 16)
            break label358;
          i2 = paramUri.getInt(5);
          i1 = paramUri.getInt(6);
          if (((str1 != null) && (str1.toLowerCase().contains("screenshot"))) || ((localObject != null) && (((String)localObject).toLowerCase().contains("screenshot"))) || ((str2 != null) && (str2.toLowerCase().contains("screenshot"))))
            continue;
          if (str3 == null)
            continue;
          boolean bool = str3.toLowerCase().contains("screenshot");
          if (!bool)
            continue;
          if (i2 == 0)
            continue;
          int i3 = i1;
          if (i1 != 0)
            continue;
          try
          {
            localObject = new BitmapFactory.Options();
            ((BitmapFactory.Options)localObject).inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str1, (BitmapFactory.Options)localObject);
            i2 = ((BitmapFactory.Options)localObject).outWidth;
            i3 = ((BitmapFactory.Options)localObject).outHeight;
            if ((i2 > 0) && (i3 > 0) && ((i2 != localPoint.x) || (i3 != localPoint.y)) && ((i3 != localPoint.x) || (i2 != localPoint.y)))
              continue;
            localArrayList.add(Long.valueOf(l1));
          }
          catch (Exception localException)
          {
            localArrayList.add(Long.valueOf(l1));
          }
          continue;
        }
      }
      catch (Exception paramUri)
      {
        n.a("tmessages", paramUri);
        return;
      }
      paramUri.close();
      label336: if (localArrayList.isEmpty())
        continue;
      a.a(new Runnable(localArrayList)
      {
        public void run()
        {
          y.a().a(y.aL, new Object[0]);
          MediaController.a(MediaController.this, this.a);
        }
      });
      return;
      label358: int i1 = 0;
      int i2 = 0;
    }
  }

  public void a(String paramString, e parame)
  {
    a(paramString, null, parame);
  }

  public void a(String paramString, u paramu, e parame)
  {
    if (this.ap)
    {
      this.aq.put(paramString, parame);
      return;
    }
    a(parame);
    ArrayList localArrayList2 = (ArrayList)this.am.get(paramString);
    ArrayList localArrayList1 = localArrayList2;
    if (localArrayList2 == null)
    {
      localArrayList1 = new ArrayList();
      this.am.put(paramString, localArrayList1);
    }
    localArrayList1.add(new WeakReference(parame));
    if (paramu != null)
    {
      localArrayList2 = (ArrayList)this.an.get(paramString);
      localArrayList1 = localArrayList2;
      if (localArrayList2 == null)
      {
        localArrayList1 = new ArrayList();
        this.an.put(paramString, localArrayList1);
      }
      localArrayList1.add(paramu);
    }
    this.ao.put(Integer.valueOf(parame.getObserverTag()), paramString);
  }

  public void a(ArrayList<u> paramArrayList, boolean paramBoolean)
  {
    this.T = paramArrayList;
    if (this.T != null)
    {
      this.S = paramBoolean;
      this.U = new HashMap();
      int i1 = 0;
      while (i1 < this.T.size())
      {
        paramArrayList = (u)this.T.get(i1);
        this.U.put(Integer.valueOf(paramArrayList.q()), paramArrayList);
        i1 += 1;
      }
    }
  }

  public void a(e parame)
  {
    if (this.ap)
      this.ar.add(parame);
    String str;
    do
    {
      return;
      str = (String)this.ao.get(Integer.valueOf(parame.getObserverTag()));
    }
    while (str == null);
    ArrayList localArrayList = (ArrayList)this.am.get(str);
    if (localArrayList != null)
    {
      int i2;
      for (int i1 = 0; i1 < localArrayList.size(); i1 = i2 + 1)
      {
        WeakReference localWeakReference = (WeakReference)localArrayList.get(i1);
        if (localWeakReference.get() != null)
        {
          i2 = i1;
          if (localWeakReference.get() != parame)
            continue;
        }
        localArrayList.remove(i1);
        i2 = i1 - 1;
      }
      if (localArrayList.isEmpty())
        this.am.remove(str);
    }
    this.ao.remove(Integer.valueOf(parame.getObserverTag()));
  }

  public void a(q paramq)
  {
    if ((paramq == null) || ((this.m == null) && ((this.o == null) || (this.I == null))) || (this.l == null));
    do
    {
      return;
      this.q = paramq;
    }
    while (((!this.af) && ((this.ax == null) || (!this.ax.H()))) || (this.E));
    paramq = this.G;
    float[] arrayOfFloat = this.G;
    this.G[2] = 0.0F;
    arrayOfFloat[1] = 0.0F;
    paramq[0] = 0.0F;
    paramq = this.I;
    arrayOfFloat = this.I;
    this.I[2] = 0.0F;
    arrayOfFloat[1] = 0.0F;
    paramq[0] = 0.0F;
    paramq = this.H;
    arrayOfFloat = this.H;
    this.H[2] = 0.0F;
    arrayOfFloat[1] = 0.0F;
    paramq[0] = 0.0F;
    this.w = 0L;
    this.F = 0.0F;
    this.s = 0;
    this.u = 0;
    this.t = 0;
    Utilities.d.b(new Runnable()
    {
      public void run()
      {
        if (MediaController.L(MediaController.this) != null)
          MediaController.M(MediaController.this).registerListener(MediaController.this, MediaController.L(MediaController.this), 30000);
        if (MediaController.N(MediaController.this) != null)
          MediaController.M(MediaController.this).registerListener(MediaController.this, MediaController.N(MediaController.this), 30000);
        if (MediaController.O(MediaController.this) != null)
          MediaController.M(MediaController.this).registerListener(MediaController.this, MediaController.O(MediaController.this), 30000);
        MediaController.M(MediaController.this).registerListener(MediaController.this, MediaController.P(MediaController.this), 3);
      }
    });
    this.E = true;
  }

  public void a(boolean paramBoolean)
  {
    this.B = paramBoolean;
  }

  public void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    a(paramBoolean1, paramBoolean2, false);
  }

  public void a(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    if (this.au != null);
    while (true)
    {
      try
      {
        this.au.reset();
      }
      catch (Exception localException3)
      {
        try
        {
          this.au.stop();
        }
        catch (Exception localException3)
        {
          try
          {
            this.au.release();
            this.au = null;
            I();
            this.aw = 0;
            this.aF = 0;
            this.at = false;
            if (this.ax == null)
              continue;
            if (!this.aK)
              continue;
            m.a().a(this.ax.A());
            Object localObject1 = this.ax;
            this.ax.k = 0.0F;
            this.ax.l = 0;
            y.a().a(y.aE, new Object[] { Integer.valueOf(this.ax.q()), Integer.valueOf(0) });
            this.ax = null;
            this.aK = false;
            if (!paramBoolean1)
              continue;
            z.a().c.abandonAudioFocus(this);
            this.J = 0;
            if (this.T == null)
              continue;
            if ((!paramBoolean3) || (this.T.get(0) != localObject1))
              break label440;
            this.T.remove(0);
            this.U.remove(Integer.valueOf(((u)localObject1).q()));
            if (!this.T.isEmpty())
              continue;
            this.T = null;
            this.U = null;
            if (this.T == null)
              break label453;
            a((u)this.T.get(0));
            if (!paramBoolean2)
              continue;
            localObject1 = new Intent(ApplicationLoader.a, MusicPlayerService.class);
            ApplicationLoader.a.stopService((Intent)localObject1);
            if ((this.A) || (this.af))
              continue;
            localObject1 = this.q;
            b(this.q);
            this.q = ((q)localObject1);
            return;
            localException1 = localException1;
            n.a("tmessages", localException1);
            continue;
            localException2 = localException2;
            n.a("tmessages", localException2);
            continue;
          }
          catch (Exception localException3)
          {
            n.a("tmessages", localException3);
            continue;
          }
        }
      }
      if (this.av == null)
        continue;
      try
      {
        synchronized (this.aZ)
        {
          this.av.pause();
          this.av.flush();
        }
      }
      catch (Exception localException5)
      {
        try
        {
          while (true)
          {
            this.av.release();
            this.av = null;
            monitorexit;
            break;
            localObject3 = finally;
            monitorexit;
            throw localObject3;
            localException4 = localException4;
            n.a("tmessages", localException4);
          }
        }
        catch (Exception localException5)
        {
          while (true)
            n.a("tmessages", localException5);
        }
      }
      label440: this.T = null;
      this.U = null;
      continue;
      label453: if ((???.H()) && (???.q() != 0))
        i();
      y.a().a(y.aF, new Object[] { Integer.valueOf(???.q()), Boolean.valueOf(paramBoolean2) });
    }
  }

  public boolean a(int paramInt)
  {
    return (J() & paramInt) != 0;
  }

  public boolean a(ArrayList<u> paramArrayList, u paramu)
  {
    return a(paramArrayList, paramu, true);
  }

  public boolean a(ArrayList<u> paramArrayList, u paramu, boolean paramBoolean)
  {
    boolean bool2 = true;
    if (this.ax == paramu)
      return a(paramu);
    if (!paramBoolean)
    {
      bool1 = true;
      this.aJ = bool1;
      if (this.aG.isEmpty())
        break label114;
    }
    label114: for (boolean bool1 = bool2; ; bool1 = false)
    {
      this.aL = bool1;
      this.aG.clear();
      int i1 = paramArrayList.size() - 1;
      while (i1 >= 0)
      {
        u localu = (u)paramArrayList.get(i1);
        if (localu.G())
          this.aG.add(localu);
        i1 -= 1;
      }
      bool1 = false;
      break;
    }
    this.aI = this.aG.indexOf(paramu);
    if (this.aI == -1)
    {
      this.aG.clear();
      this.aH.clear();
      this.aI = this.aG.size();
      this.aG.add(paramu);
    }
    if (paramu.G())
    {
      if (this.ai)
      {
        N();
        this.aI = 0;
      }
      if (paramBoolean)
        f.a(paramu.u(), ((u)this.aG.get(0)).q());
    }
    return a(paramu);
  }

  // ERROR //
  public boolean a(u paramu)
  {
    // Byte code:
    //   0: aload_1
    //   1: ifnonnull +5 -> 6
    //   4: iconst_0
    //   5: ireturn
    //   6: aload_0
    //   7: getfield 403	org/vidogram/messenger/MediaController:av	Landroid/media/AudioTrack;
    //   10: ifnonnull +10 -> 20
    //   13: aload_0
    //   14: getfield 401	org/vidogram/messenger/MediaController:au	Landroid/media/MediaPlayer;
    //   17: ifnull +54 -> 71
    //   20: aload_0
    //   21: getfield 881	org/vidogram/messenger/MediaController:ax	Lorg/vidogram/messenger/u;
    //   24: ifnull +47 -> 71
    //   27: aload_1
    //   28: invokevirtual 1388	org/vidogram/messenger/u:q	()I
    //   31: aload_0
    //   32: getfield 881	org/vidogram/messenger/MediaController:ax	Lorg/vidogram/messenger/u;
    //   35: invokevirtual 1388	org/vidogram/messenger/u:q	()I
    //   38: if_icmpne +33 -> 71
    //   41: aload_0
    //   42: getfield 399	org/vidogram/messenger/MediaController:at	Z
    //   45: ifeq +9 -> 54
    //   48: aload_0
    //   49: aload_1
    //   50: invokevirtual 1990	org/vidogram/messenger/MediaController:c	(Lorg/vidogram/messenger/u;)Z
    //   53: pop
    //   54: aload_0
    //   55: getfield 379	org/vidogram/messenger/MediaController:af	Z
    //   58: ifne +11 -> 69
    //   61: aload_0
    //   62: aload_0
    //   63: getfield 1938	org/vidogram/messenger/MediaController:q	Lorg/vidogram/ui/q;
    //   66: invokevirtual 1992	org/vidogram/messenger/MediaController:a	(Lorg/vidogram/ui/q;)V
    //   69: iconst_1
    //   70: ireturn
    //   71: aload_1
    //   72: invokevirtual 1862	org/vidogram/messenger/u:j	()Z
    //   75: ifne +30 -> 105
    //   78: aload_1
    //   79: invokevirtual 1861	org/vidogram/messenger/u:n	()Z
    //   82: ifeq +23 -> 105
    //   85: aload_1
    //   86: getfield 802	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   89: getfield 1836	org/vidogram/tgnet/g$ar:d	Lorg/vidogram/tgnet/g$aw;
    //   92: getfield 1839	org/vidogram/tgnet/g$aw:b	I
    //   95: ifne +10 -> 105
    //   98: invokestatic 1826	org/vidogram/messenger/v:a	()Lorg/vidogram/messenger/v;
    //   101: aload_1
    //   102: invokevirtual 1993	org/vidogram/messenger/v:a	(Lorg/vidogram/messenger/u;)V
    //   105: aload_0
    //   106: getfield 1393	org/vidogram/messenger/MediaController:aL	Z
    //   109: ifne +220 -> 329
    //   112: iconst_1
    //   113: istore 4
    //   115: aload_0
    //   116: getfield 881	org/vidogram/messenger/MediaController:ax	Lorg/vidogram/messenger/u;
    //   119: ifnull +6 -> 125
    //   122: iconst_0
    //   123: istore 4
    //   125: aload_0
    //   126: iload 4
    //   128: iconst_0
    //   129: invokevirtual 1324	org/vidogram/messenger/MediaController:a	(ZZ)V
    //   132: aload_0
    //   133: iconst_0
    //   134: putfield 1393	org/vidogram/messenger/MediaController:aL	Z
    //   137: aload_1
    //   138: getfield 802	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   141: getfield 807	org/vidogram/tgnet/g$ar:A	Ljava/lang/String;
    //   144: ifnull +977 -> 1121
    //   147: aload_1
    //   148: getfield 802	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   151: getfield 807	org/vidogram/tgnet/g$ar:A	Ljava/lang/String;
    //   154: invokevirtual 810	java/lang/String:length	()I
    //   157: ifle +964 -> 1121
    //   160: new 812	java/io/File
    //   163: dup
    //   164: aload_1
    //   165: getfield 802	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   168: getfield 807	org/vidogram/tgnet/g$ar:A	Ljava/lang/String;
    //   171: invokespecial 813	java/io/File:<init>	(Ljava/lang/String;)V
    //   174: astore 6
    //   176: aload 6
    //   178: astore 5
    //   180: aload 6
    //   182: invokevirtual 816	java/io/File:exists	()Z
    //   185: ifne +6 -> 191
    //   188: aconst_null
    //   189: astore 5
    //   191: aload 5
    //   193: ifnull +142 -> 335
    //   196: aload 5
    //   198: astore 6
    //   200: aload 6
    //   202: ifnull +170 -> 372
    //   205: aload 6
    //   207: aload 5
    //   209: if_acmpeq +163 -> 372
    //   212: aload 6
    //   214: invokevirtual 816	java/io/File:exists	()Z
    //   217: ifne +155 -> 372
    //   220: aload_1
    //   221: invokevirtual 818	org/vidogram/messenger/u:G	()Z
    //   224: ifeq +148 -> 372
    //   227: invokestatic 823	org/vidogram/messenger/m:a	()Lorg/vidogram/messenger/m;
    //   230: aload_1
    //   231: invokevirtual 826	org/vidogram/messenger/u:A	()Lorg/vidogram/tgnet/g$q;
    //   234: iconst_0
    //   235: iconst_0
    //   236: invokevirtual 829	org/vidogram/messenger/m:a	(Lorg/vidogram/tgnet/g$q;ZZ)V
    //   239: aload_0
    //   240: iconst_1
    //   241: putfield 1774	org/vidogram/messenger/MediaController:aK	Z
    //   244: aload_0
    //   245: iconst_0
    //   246: putfield 399	org/vidogram/messenger/MediaController:at	Z
    //   249: aload_0
    //   250: iconst_0
    //   251: putfield 405	org/vidogram/messenger/MediaController:aw	I
    //   254: aload_0
    //   255: lconst_0
    //   256: putfield 1299	org/vidogram/messenger/MediaController:aB	J
    //   259: aload_0
    //   260: aconst_null
    //   261: putfield 1995	org/vidogram/messenger/MediaController:aM	Lorg/vidogram/messenger/a/a;
    //   264: aload_0
    //   265: aload_1
    //   266: putfield 881	org/vidogram/messenger/MediaController:ax	Lorg/vidogram/messenger/u;
    //   269: aload_0
    //   270: getfield 881	org/vidogram/messenger/MediaController:ax	Lorg/vidogram/messenger/u;
    //   273: invokevirtual 826	org/vidogram/messenger/u:A	()Lorg/vidogram/tgnet/g$q;
    //   276: ifnull +71 -> 347
    //   279: new 834	android/content/Intent
    //   282: dup
    //   283: getstatic 511	org/vidogram/messenger/ApplicationLoader:a	Landroid/content/Context;
    //   286: ldc_w 1965
    //   289: invokespecial 839	android/content/Intent:<init>	(Landroid/content/Context;Ljava/lang/Class;)V
    //   292: astore_1
    //   293: getstatic 511	org/vidogram/messenger/ApplicationLoader:a	Landroid/content/Context;
    //   296: aload_1
    //   297: invokevirtual 870	android/content/Context:startService	(Landroid/content/Intent;)Landroid/content/ComponentName;
    //   300: pop
    //   301: invokestatic 1307	org/vidogram/messenger/y:a	()Lorg/vidogram/messenger/y;
    //   304: getstatic 1390	org/vidogram/messenger/y:aG	I
    //   307: iconst_1
    //   308: anewarray 4	java/lang/Object
    //   311: dup
    //   312: iconst_0
    //   313: aload_0
    //   314: getfield 881	org/vidogram/messenger/MediaController:ax	Lorg/vidogram/messenger/u;
    //   317: invokevirtual 1388	org/vidogram/messenger/u:q	()I
    //   320: invokestatic 1082	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   323: aastore
    //   324: invokevirtual 1319	org/vidogram/messenger/y:a	(I[Ljava/lang/Object;)V
    //   327: iconst_1
    //   328: ireturn
    //   329: iconst_0
    //   330: istore 4
    //   332: goto -217 -> 115
    //   335: aload_1
    //   336: getfield 802	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   339: invokestatic 832	org/vidogram/messenger/m:b	(Lorg/vidogram/tgnet/g$ar;)Ljava/io/File;
    //   342: astore 6
    //   344: goto -144 -> 200
    //   347: new 834	android/content/Intent
    //   350: dup
    //   351: getstatic 511	org/vidogram/messenger/ApplicationLoader:a	Landroid/content/Context;
    //   354: ldc_w 1965
    //   357: invokespecial 839	android/content/Intent:<init>	(Landroid/content/Context;Ljava/lang/Class;)V
    //   360: astore_1
    //   361: getstatic 511	org/vidogram/messenger/ApplicationLoader:a	Landroid/content/Context;
    //   364: aload_1
    //   365: invokevirtual 1969	android/content/Context:stopService	(Landroid/content/Intent;)Z
    //   368: pop
    //   369: goto -68 -> 301
    //   372: aload_0
    //   373: iconst_0
    //   374: putfield 1774	org/vidogram/messenger/MediaController:aK	Z
    //   377: aload_1
    //   378: invokevirtual 818	org/vidogram/messenger/u:G	()Z
    //   381: ifeq +7 -> 388
    //   384: aload_0
    //   385: invokespecial 1997	org/vidogram/messenger/MediaController:O	()V
    //   388: aload_0
    //   389: aload 6
    //   391: invokevirtual 1118	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   394: invokespecial 1999	org/vidogram/messenger/MediaController:isOpusFile	(Ljava/lang/String;)I
    //   397: iconst_1
    //   398: if_icmpne +372 -> 770
    //   401: aload_0
    //   402: getfield 417	org/vidogram/messenger/MediaController:aG	Ljava/util/ArrayList;
    //   405: invokevirtual 758	java/util/ArrayList:clear	()V
    //   408: aload_0
    //   409: getfield 419	org/vidogram/messenger/MediaController:aH	Ljava/util/ArrayList;
    //   412: invokevirtual 758	java/util/ArrayList:clear	()V
    //   415: aload_0
    //   416: getfield 433	org/vidogram/messenger/MediaController:aZ	Ljava/lang/Object;
    //   419: astore 5
    //   421: aload 5
    //   423: monitorenter
    //   424: aload_0
    //   425: iconst_3
    //   426: putfield 411	org/vidogram/messenger/MediaController:aC	I
    //   429: new 2001	java/util/concurrent/Semaphore
    //   432: dup
    //   433: iconst_0
    //   434: invokespecial 2002	java/util/concurrent/Semaphore:<init>	(I)V
    //   437: astore 7
    //   439: iconst_1
    //   440: anewarray 1313	java/lang/Boolean
    //   443: astore 8
    //   445: aload_0
    //   446: getfield 579	org/vidogram/messenger/MediaController:aU	Lorg/vidogram/messenger/h;
    //   449: new 74	org/vidogram/messenger/MediaController$5
    //   452: dup
    //   453: aload_0
    //   454: aload 8
    //   456: aload 6
    //   458: aload 7
    //   460: invokespecial 2005	org/vidogram/messenger/MediaController$5:<init>	(Lorg/vidogram/messenger/MediaController;[Ljava/lang/Boolean;Ljava/io/File;Ljava/util/concurrent/Semaphore;)V
    //   463: invokevirtual 764	org/vidogram/messenger/h:b	(Ljava/lang/Runnable;)V
    //   466: aload 7
    //   468: invokevirtual 2008	java/util/concurrent/Semaphore:acquire	()V
    //   471: aload 8
    //   473: iconst_0
    //   474: aaload
    //   475: invokevirtual 1792	java/lang/Boolean:booleanValue	()Z
    //   478: istore 4
    //   480: iload 4
    //   482: ifne +14 -> 496
    //   485: aload 5
    //   487: monitorexit
    //   488: iconst_0
    //   489: ireturn
    //   490: astore_1
    //   491: aload 5
    //   493: monitorexit
    //   494: aload_1
    //   495: athrow
    //   496: aload_0
    //   497: aload_0
    //   498: invokespecial 2010	org/vidogram/messenger/MediaController:getTotalPcmDuration	()J
    //   501: putfield 688	org/vidogram/messenger/MediaController:aA	J
    //   504: aload_0
    //   505: getfield 1311	org/vidogram/messenger/MediaController:A	Z
    //   508: ifeq +210 -> 718
    //   511: iconst_0
    //   512: istore_2
    //   513: aload_0
    //   514: new 475	android/media/AudioTrack
    //   517: dup
    //   518: iload_2
    //   519: ldc_w 473
    //   522: iconst_4
    //   523: iconst_2
    //   524: aload_0
    //   525: getfield 407	org/vidogram/messenger/MediaController:ay	I
    //   528: iconst_1
    //   529: invokespecial 2013	android/media/AudioTrack:<init>	(IIIIII)V
    //   532: putfield 403	org/vidogram/messenger/MediaController:av	Landroid/media/AudioTrack;
    //   535: aload_0
    //   536: getfield 403	org/vidogram/messenger/MediaController:av	Landroid/media/AudioTrack;
    //   539: fconst_1
    //   540: fconst_1
    //   541: invokevirtual 705	android/media/AudioTrack:setStereoVolume	(FF)I
    //   544: pop
    //   545: aload_0
    //   546: getfield 403	org/vidogram/messenger/MediaController:av	Landroid/media/AudioTrack;
    //   549: new 76	org/vidogram/messenger/MediaController$6
    //   552: dup
    //   553: aload_0
    //   554: invokespecial 2014	org/vidogram/messenger/MediaController$6:<init>	(Lorg/vidogram/messenger/MediaController;)V
    //   557: invokevirtual 2018	android/media/AudioTrack:setPlaybackPositionUpdateListener	(Landroid/media/AudioTrack$OnPlaybackPositionUpdateListener;)V
    //   560: aload_0
    //   561: getfield 403	org/vidogram/messenger/MediaController:av	Landroid/media/AudioTrack;
    //   564: invokevirtual 2021	android/media/AudioTrack:play	()V
    //   567: aload 5
    //   569: monitorexit
    //   570: aload_0
    //   571: aload_1
    //   572: invokespecial 2023	org/vidogram/messenger/MediaController:i	(Lorg/vidogram/messenger/u;)V
    //   575: aload_0
    //   576: invokespecial 2025	org/vidogram/messenger/MediaController:H	()V
    //   579: aload_0
    //   580: iconst_0
    //   581: putfield 399	org/vidogram/messenger/MediaController:at	Z
    //   584: aload_0
    //   585: iconst_0
    //   586: putfield 405	org/vidogram/messenger/MediaController:aw	I
    //   589: aload_0
    //   590: lconst_0
    //   591: putfield 1299	org/vidogram/messenger/MediaController:aB	J
    //   594: aload_0
    //   595: aload_1
    //   596: putfield 881	org/vidogram/messenger/MediaController:ax	Lorg/vidogram/messenger/u;
    //   599: aload_0
    //   600: getfield 379	org/vidogram/messenger/MediaController:af	Z
    //   603: ifne +11 -> 614
    //   606: aload_0
    //   607: aload_0
    //   608: getfield 1938	org/vidogram/messenger/MediaController:q	Lorg/vidogram/ui/q;
    //   611: invokevirtual 1992	org/vidogram/messenger/MediaController:a	(Lorg/vidogram/ui/q;)V
    //   614: aload_0
    //   615: aload_0
    //   616: getfield 881	org/vidogram/messenger/MediaController:ax	Lorg/vidogram/messenger/u;
    //   619: invokespecial 2027	org/vidogram/messenger/MediaController:h	(Lorg/vidogram/messenger/u;)V
    //   622: invokestatic 1307	org/vidogram/messenger/y:a	()Lorg/vidogram/messenger/y;
    //   625: getstatic 2029	org/vidogram/messenger/y:aO	I
    //   628: iconst_1
    //   629: anewarray 4	java/lang/Object
    //   632: dup
    //   633: iconst_0
    //   634: aload_1
    //   635: aastore
    //   636: invokevirtual 1319	org/vidogram/messenger/y:a	(I[Ljava/lang/Object;)V
    //   639: aload_0
    //   640: getfield 401	org/vidogram/messenger/MediaController:au	Landroid/media/MediaPlayer;
    //   643: ifnull +408 -> 1051
    //   646: aload_0
    //   647: getfield 881	org/vidogram/messenger/MediaController:ax	Lorg/vidogram/messenger/u;
    //   650: getfield 1321	org/vidogram/messenger/u:k	F
    //   653: fconst_0
    //   654: fcmpl
    //   655: ifeq +29 -> 684
    //   658: aload_0
    //   659: getfield 401	org/vidogram/messenger/MediaController:au	Landroid/media/MediaPlayer;
    //   662: invokevirtual 2032	android/media/MediaPlayer:getDuration	()I
    //   665: i2f
    //   666: aload_0
    //   667: getfield 881	org/vidogram/messenger/MediaController:ax	Lorg/vidogram/messenger/u;
    //   670: getfield 1321	org/vidogram/messenger/u:k	F
    //   673: fmul
    //   674: f2i
    //   675: istore_2
    //   676: aload_0
    //   677: getfield 401	org/vidogram/messenger/MediaController:au	Landroid/media/MediaPlayer;
    //   680: iload_2
    //   681: invokevirtual 2034	android/media/MediaPlayer:seekTo	(I)V
    //   684: aload_0
    //   685: getfield 881	org/vidogram/messenger/MediaController:ax	Lorg/vidogram/messenger/u;
    //   688: invokevirtual 818	org/vidogram/messenger/u:G	()Z
    //   691: ifeq +405 -> 1096
    //   694: new 834	android/content/Intent
    //   697: dup
    //   698: getstatic 511	org/vidogram/messenger/ApplicationLoader:a	Landroid/content/Context;
    //   701: ldc_w 1965
    //   704: invokespecial 839	android/content/Intent:<init>	(Landroid/content/Context;Ljava/lang/Class;)V
    //   707: astore_1
    //   708: getstatic 511	org/vidogram/messenger/ApplicationLoader:a	Landroid/content/Context;
    //   711: aload_1
    //   712: invokevirtual 870	android/content/Context:startService	(Landroid/content/Intent;)Landroid/content/ComponentName;
    //   715: pop
    //   716: iconst_1
    //   717: ireturn
    //   718: iconst_3
    //   719: istore_2
    //   720: goto -207 -> 513
    //   723: astore_1
    //   724: ldc_w 501
    //   727: aload_1
    //   728: invokestatic 506	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   731: aload_0
    //   732: getfield 403	org/vidogram/messenger/MediaController:av	Landroid/media/AudioTrack;
    //   735: ifnull +30 -> 765
    //   738: aload_0
    //   739: getfield 403	org/vidogram/messenger/MediaController:av	Landroid/media/AudioTrack;
    //   742: invokevirtual 1391	android/media/AudioTrack:release	()V
    //   745: aload_0
    //   746: aconst_null
    //   747: putfield 403	org/vidogram/messenger/MediaController:av	Landroid/media/AudioTrack;
    //   750: aload_0
    //   751: iconst_0
    //   752: putfield 399	org/vidogram/messenger/MediaController:at	Z
    //   755: aload_0
    //   756: aconst_null
    //   757: putfield 881	org/vidogram/messenger/MediaController:ax	Lorg/vidogram/messenger/u;
    //   760: aload_0
    //   761: iconst_0
    //   762: putfield 1774	org/vidogram/messenger/MediaController:aK	Z
    //   765: aload 5
    //   767: monitorexit
    //   768: iconst_0
    //   769: ireturn
    //   770: aload_0
    //   771: new 697	android/media/MediaPlayer
    //   774: dup
    //   775: invokespecial 2035	android/media/MediaPlayer:<init>	()V
    //   778: putfield 401	org/vidogram/messenger/MediaController:au	Landroid/media/MediaPlayer;
    //   781: aload_0
    //   782: getfield 401	org/vidogram/messenger/MediaController:au	Landroid/media/MediaPlayer;
    //   785: astore 5
    //   787: aload_0
    //   788: getfield 1311	org/vidogram/messenger/MediaController:A	Z
    //   791: ifeq +165 -> 956
    //   794: iconst_0
    //   795: istore_2
    //   796: aload 5
    //   798: iload_2
    //   799: invokevirtual 2038	android/media/MediaPlayer:setAudioStreamType	(I)V
    //   802: aload_0
    //   803: getfield 401	org/vidogram/messenger/MediaController:au	Landroid/media/MediaPlayer;
    //   806: aload 6
    //   808: invokevirtual 1118	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   811: invokevirtual 2039	android/media/MediaPlayer:setDataSource	(Ljava/lang/String;)V
    //   814: aload_0
    //   815: getfield 401	org/vidogram/messenger/MediaController:au	Landroid/media/MediaPlayer;
    //   818: new 78	org/vidogram/messenger/MediaController$7
    //   821: dup
    //   822: aload_0
    //   823: aload_1
    //   824: invokespecial 2040	org/vidogram/messenger/MediaController$7:<init>	(Lorg/vidogram/messenger/MediaController;Lorg/vidogram/messenger/u;)V
    //   827: invokevirtual 2044	android/media/MediaPlayer:setOnCompletionListener	(Landroid/media/MediaPlayer$OnCompletionListener;)V
    //   830: aload_0
    //   831: getfield 401	org/vidogram/messenger/MediaController:au	Landroid/media/MediaPlayer;
    //   834: invokevirtual 2047	android/media/MediaPlayer:prepare	()V
    //   837: aload_0
    //   838: getfield 401	org/vidogram/messenger/MediaController:au	Landroid/media/MediaPlayer;
    //   841: invokevirtual 2048	android/media/MediaPlayer:start	()V
    //   844: aload_1
    //   845: invokevirtual 1414	org/vidogram/messenger/u:H	()Z
    //   848: ifeq +113 -> 961
    //   851: aload_0
    //   852: aconst_null
    //   853: putfield 1995	org/vidogram/messenger/MediaController:aM	Lorg/vidogram/messenger/a/a;
    //   856: aload_0
    //   857: getfield 417	org/vidogram/messenger/MediaController:aG	Ljava/util/ArrayList;
    //   860: invokevirtual 758	java/util/ArrayList:clear	()V
    //   863: aload_0
    //   864: getfield 419	org/vidogram/messenger/MediaController:aH	Ljava/util/ArrayList;
    //   867: invokevirtual 758	java/util/ArrayList:clear	()V
    //   870: goto -300 -> 570
    //   873: astore_1
    //   874: ldc_w 501
    //   877: aload_1
    //   878: invokestatic 506	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   881: invokestatic 1307	org/vidogram/messenger/y:a	()Lorg/vidogram/messenger/y;
    //   884: astore_1
    //   885: getstatic 1390	org/vidogram/messenger/y:aG	I
    //   888: istore_3
    //   889: aload_0
    //   890: getfield 881	org/vidogram/messenger/MediaController:ax	Lorg/vidogram/messenger/u;
    //   893: ifnull +93 -> 986
    //   896: aload_0
    //   897: getfield 881	org/vidogram/messenger/MediaController:ax	Lorg/vidogram/messenger/u;
    //   900: invokevirtual 1388	org/vidogram/messenger/u:q	()I
    //   903: istore_2
    //   904: aload_1
    //   905: iload_3
    //   906: iconst_1
    //   907: anewarray 4	java/lang/Object
    //   910: dup
    //   911: iconst_0
    //   912: iload_2
    //   913: invokestatic 1082	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   916: aastore
    //   917: invokevirtual 1319	org/vidogram/messenger/y:a	(I[Ljava/lang/Object;)V
    //   920: aload_0
    //   921: getfield 401	org/vidogram/messenger/MediaController:au	Landroid/media/MediaPlayer;
    //   924: ifnull -920 -> 4
    //   927: aload_0
    //   928: getfield 401	org/vidogram/messenger/MediaController:au	Landroid/media/MediaPlayer;
    //   931: invokevirtual 1380	android/media/MediaPlayer:release	()V
    //   934: aload_0
    //   935: aconst_null
    //   936: putfield 401	org/vidogram/messenger/MediaController:au	Landroid/media/MediaPlayer;
    //   939: aload_0
    //   940: iconst_0
    //   941: putfield 399	org/vidogram/messenger/MediaController:at	Z
    //   944: aload_0
    //   945: aconst_null
    //   946: putfield 881	org/vidogram/messenger/MediaController:ax	Lorg/vidogram/messenger/u;
    //   949: aload_0
    //   950: iconst_0
    //   951: putfield 1774	org/vidogram/messenger/MediaController:aK	Z
    //   954: iconst_0
    //   955: ireturn
    //   956: iconst_3
    //   957: istore_2
    //   958: goto -162 -> 796
    //   961: aload_0
    //   962: aload 6
    //   964: invokestatic 2053	org/vidogram/messenger/a/a:a	(Ljava/io/File;)Lorg/vidogram/messenger/a/a;
    //   967: putfield 1995	org/vidogram/messenger/MediaController:aM	Lorg/vidogram/messenger/a/a;
    //   970: goto -400 -> 570
    //   973: astore 5
    //   975: ldc_w 501
    //   978: aload 5
    //   980: invokestatic 506	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   983: goto -413 -> 570
    //   986: iconst_0
    //   987: istore_2
    //   988: goto -84 -> 904
    //   991: astore_1
    //   992: aload_0
    //   993: getfield 881	org/vidogram/messenger/MediaController:ax	Lorg/vidogram/messenger/u;
    //   996: fconst_0
    //   997: putfield 1321	org/vidogram/messenger/u:k	F
    //   1000: aload_0
    //   1001: getfield 881	org/vidogram/messenger/MediaController:ax	Lorg/vidogram/messenger/u;
    //   1004: iconst_0
    //   1005: putfield 1384	org/vidogram/messenger/u:l	I
    //   1008: invokestatic 1307	org/vidogram/messenger/y:a	()Lorg/vidogram/messenger/y;
    //   1011: getstatic 1386	org/vidogram/messenger/y:aE	I
    //   1014: iconst_2
    //   1015: anewarray 4	java/lang/Object
    //   1018: dup
    //   1019: iconst_0
    //   1020: aload_0
    //   1021: getfield 881	org/vidogram/messenger/MediaController:ax	Lorg/vidogram/messenger/u;
    //   1024: invokevirtual 1388	org/vidogram/messenger/u:q	()I
    //   1027: invokestatic 1082	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1030: aastore
    //   1031: dup
    //   1032: iconst_1
    //   1033: iconst_0
    //   1034: invokestatic 1082	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1037: aastore
    //   1038: invokevirtual 1319	org/vidogram/messenger/y:a	(I[Ljava/lang/Object;)V
    //   1041: ldc_w 501
    //   1044: aload_1
    //   1045: invokestatic 506	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   1048: goto -364 -> 684
    //   1051: aload_0
    //   1052: getfield 403	org/vidogram/messenger/MediaController:av	Landroid/media/AudioTrack;
    //   1055: ifnull -371 -> 684
    //   1058: aload_0
    //   1059: getfield 881	org/vidogram/messenger/MediaController:ax	Lorg/vidogram/messenger/u;
    //   1062: getfield 1321	org/vidogram/messenger/u:k	F
    //   1065: fconst_1
    //   1066: fcmpl
    //   1067: ifne +11 -> 1078
    //   1070: aload_0
    //   1071: getfield 881	org/vidogram/messenger/MediaController:ax	Lorg/vidogram/messenger/u;
    //   1074: fconst_0
    //   1075: putfield 1321	org/vidogram/messenger/u:k	F
    //   1078: aload_0
    //   1079: getfield 579	org/vidogram/messenger/MediaController:aU	Lorg/vidogram/messenger/h;
    //   1082: new 80	org/vidogram/messenger/MediaController$8
    //   1085: dup
    //   1086: aload_0
    //   1087: invokespecial 2054	org/vidogram/messenger/MediaController$8:<init>	(Lorg/vidogram/messenger/MediaController;)V
    //   1090: invokevirtual 764	org/vidogram/messenger/h:b	(Ljava/lang/Runnable;)V
    //   1093: goto -409 -> 684
    //   1096: new 834	android/content/Intent
    //   1099: dup
    //   1100: getstatic 511	org/vidogram/messenger/ApplicationLoader:a	Landroid/content/Context;
    //   1103: ldc_w 1965
    //   1106: invokespecial 839	android/content/Intent:<init>	(Landroid/content/Context;Ljava/lang/Class;)V
    //   1109: astore_1
    //   1110: getstatic 511	org/vidogram/messenger/ApplicationLoader:a	Landroid/content/Context;
    //   1113: aload_1
    //   1114: invokevirtual 1969	android/content/Context:stopService	(Landroid/content/Intent;)Z
    //   1117: pop
    //   1118: goto -402 -> 716
    //   1121: aconst_null
    //   1122: astore 5
    //   1124: goto -933 -> 191
    //
    // Exception table:
    //   from	to	target	type
    //   424	480	490	finally
    //   485	488	490	finally
    //   491	494	490	finally
    //   496	511	490	finally
    //   513	567	490	finally
    //   567	570	490	finally
    //   724	765	490	finally
    //   765	768	490	finally
    //   424	480	723	java/lang/Exception
    //   496	511	723	java/lang/Exception
    //   513	567	723	java/lang/Exception
    //   770	794	873	java/lang/Exception
    //   796	870	873	java/lang/Exception
    //   975	983	873	java/lang/Exception
    //   961	970	973	java/lang/Exception
    //   646	684	991	java/lang/Exception
  }

  public boolean a(u paramu, float paramFloat)
  {
    if (((this.av == null) && (this.au == null)) || (paramu == null) || (this.ax == null) || ((this.ax != null) && (this.ax.q() != paramu.q())))
      return false;
    try
    {
      if (this.au != null)
      {
        int i1 = (int)(this.au.getDuration() * paramFloat);
        this.au.seekTo(i1);
        this.aw = i1;
      }
      else if (this.av != null)
      {
        b(paramFloat);
      }
    }
    catch (Exception paramu)
    {
      n.a("tmessages", paramu);
      return false;
    }
    return true;
  }

  public void b()
  {
    a(false, true);
    this.aM = null;
    this.aL = false;
    this.W.clear();
    this.X.clear();
    this.Y.clear();
    this.ab.clear();
    this.Z.clear();
    this.aa.clear();
    this.ac.clear();
    this.N.clear();
    this.aG.clear();
    this.aH.clear();
    this.R.clear();
    this.i.clear();
    this.T = null;
    this.U = null;
    g(null);
  }

  protected void b(int paramInt)
  {
    int i1 = J();
    if (((i1 & 0x1) != 0) && ((paramInt & 0x1) != 0) && (this.W.isEmpty()))
      w.a().f(1);
    if (((i1 & 0x2) != 0) && ((paramInt & 0x2) != 0) && (this.X.isEmpty()))
      w.a().f(2);
    if (((i1 & 0x4) != 0) && ((paramInt & 0x4) != 0) && (this.ab.isEmpty()))
      w.a().f(4);
    if (((i1 & 0x8) != 0) && ((paramInt & 0x8) != 0) && (this.Y.isEmpty()))
      w.a().f(8);
    if (((i1 & 0x10) != 0) && ((paramInt & 0x10) != 0) && (this.Z.isEmpty()))
      w.a().f(16);
    if (((i1 & 0x20) != 0) && ((paramInt & 0x20) != 0) && (this.aa.isEmpty()))
      w.a().f(32);
  }

  public void b(q paramq)
  {
    if (this.D)
      this.D = false;
    do
    {
      do
        return;
      while ((!this.E) || (this.D) || ((this.m == null) && ((this.o == null) || (this.I == null))) || (this.l == null) || (this.q != paramq));
      this.q = null;
      d(0);
      this.E = false;
      this.r = false;
      this.x = false;
      this.p = false;
      this.A = false;
      Utilities.d.b(new Runnable()
      {
        public void run()
        {
          if (MediaController.N(MediaController.this) != null)
            MediaController.M(MediaController.this).unregisterListener(MediaController.this, MediaController.N(MediaController.this));
          if (MediaController.L(MediaController.this) != null)
            MediaController.M(MediaController.this).unregisterListener(MediaController.this, MediaController.L(MediaController.this));
          if (MediaController.O(MediaController.this) != null)
            MediaController.M(MediaController.this).unregisterListener(MediaController.this, MediaController.O(MediaController.this));
          MediaController.M(MediaController.this).unregisterListener(MediaController.this, MediaController.P(MediaController.this));
        }
      });
    }
    while ((!this.y) || (this.k == null) || (!this.k.isHeld()));
    this.k.release();
  }

  public void b(boolean paramBoolean)
  {
    this.C = paramBoolean;
  }

  public boolean b(u paramu)
  {
    if (((this.av == null) && (this.au == null)) || (paramu == null) || (this.ax == null) || ((this.ax != null) && (this.ax.q() != paramu.q())))
      return false;
    I();
    try
    {
      if (this.au != null)
        this.au.pause();
      while (true)
      {
        this.at = true;
        y.a().a(y.aG, new Object[] { Integer.valueOf(this.ax.q()) });
        return true;
        if (this.av == null)
          continue;
        this.av.pause();
      }
    }
    catch (Exception paramu)
    {
      n.a("tmessages", paramu);
      this.at = false;
    }
    return false;
  }

  protected int c()
  {
    int i2 = 0;
    if (((this.b & 0x1) != 0) || ((this.c & 0x1) != 0) || ((this.d & 0x1) != 0))
      i2 = 1;
    int i1;
    if (((this.b & 0x2) == 0) && ((this.c & 0x2) == 0))
    {
      i1 = i2;
      if ((this.d & 0x2) == 0);
    }
    else
    {
      i1 = i2 | 0x2;
    }
    if (((this.b & 0x4) == 0) && ((this.c & 0x4) == 0))
    {
      i2 = i1;
      if ((this.d & 0x4) == 0);
    }
    else
    {
      i2 = i1 | 0x4;
    }
    if (((this.b & 0x8) == 0) && ((this.c & 0x8) == 0))
    {
      i1 = i2;
      if ((this.d & 0x8) == 0);
    }
    else
    {
      i1 = i2 | 0x8;
    }
    if (((this.b & 0x10) == 0) && ((this.c & 0x10) == 0))
    {
      i2 = i1;
      if ((this.d & 0x10) == 0);
    }
    else
    {
      i2 = i1 | 0x10;
    }
    if (((this.b & 0x20) == 0) && ((this.c & 0x20) == 0))
    {
      i1 = i2;
      if ((this.d & 0x20) == 0);
    }
    else
    {
      i1 = i2 | 0x20;
    }
    return i1;
  }

  public void c(int paramInt)
  {
    if ((this.aI < 0) || (this.aI >= this.aG.size()))
      return;
    this.aI = paramInt;
    this.aL = true;
    a((u)this.aG.get(this.aI));
  }

  public boolean c(u paramu)
  {
    if (((this.av == null) && (this.au == null)) || (paramu == null) || (this.ax == null) || ((this.ax != null) && (this.ax.q() != paramu.q())))
      return false;
    try
    {
      h(paramu);
      if (this.au != null)
        this.au.start();
      while (true)
      {
        i(paramu);
        this.at = false;
        y.a().a(y.aG, new Object[] { Integer.valueOf(this.ax.q()) });
        return true;
        if (this.av == null)
          continue;
        this.av.play();
        M();
      }
    }
    catch (Exception paramu)
    {
      n.a("tmessages", paramu);
    }
    return false;
  }

  public void d()
  {
    int i2 = J();
    if (i2 == this.V);
    label61: label84: label105: int i1;
    label128: label223: label498: 
    do
    {
      return;
      this.V = i2;
      if ((i2 & 0x1) != 0)
      {
        if (this.W.isEmpty())
          b(1);
        if ((i2 & 0x2) == 0)
          break label223;
        if (this.X.isEmpty())
          b(2);
        if ((i2 & 0x8) == 0)
          break label278;
        if (this.Y.isEmpty())
          b(8);
        if ((i2 & 0x4) == 0)
          break label333;
        if (this.ab.isEmpty())
          b(4);
        if ((i2 & 0x10) == 0)
          break label388;
        if (this.Z.isEmpty())
          b(16);
        if ((i2 & 0x20) == 0)
          break label443;
        if (this.aa.isEmpty())
          b(32);
      }
      while (true)
      {
        i1 = c();
        if (i1 != 0)
          break label498;
        w.a().e(0);
        return;
        i1 = 0;
        Object localObject;
        while (i1 < this.W.size())
        {
          localObject = (i)this.W.get(i1);
          m.a().a((g.az)((i)localObject).a);
          i1 += 1;
        }
        this.W.clear();
        break;
        i1 = 0;
        while (i1 < this.X.size())
        {
          localObject = (i)this.X.get(i1);
          m.a().a((g.q)((i)localObject).a);
          i1 += 1;
        }
        this.X.clear();
        break label61;
        i1 = 0;
        while (i1 < this.Y.size())
        {
          localObject = (g.q)((i)this.Y.get(i1)).a;
          m.a().a((g.q)localObject);
          i1 += 1;
        }
        this.Y.clear();
        break label84;
        i1 = 0;
        while (i1 < this.ab.size())
        {
          localObject = (i)this.ab.get(i1);
          m.a().a((g.q)((i)localObject).a);
          i1 += 1;
        }
        this.ab.clear();
        break label105;
        i1 = 0;
        while (i1 < this.Z.size())
        {
          localObject = (g.q)((i)this.Z.get(i1)).a;
          m.a().a((g.q)localObject);
          i1 += 1;
        }
        this.Z.clear();
        break label128;
        i1 = 0;
        while (i1 < this.aa.size())
        {
          localObject = (g.q)((i)this.aa.get(i1)).a;
          m.a().a((g.q)localObject);
          i1 += 1;
        }
        this.aa.clear();
      }
      if ((i1 & 0x1) == 0)
        w.a().e(1);
      if ((i1 & 0x2) == 0)
        w.a().e(2);
      if ((i1 & 0x4) == 0)
        w.a().e(4);
      if ((i1 & 0x8) == 0)
        w.a().e(8);
      if ((i1 & 0x10) != 0)
        continue;
      w.a().e(16);
    }
    while ((i1 & 0x20) != 0);
    label278: label333: w.a().e(32);
    label388: label443: return;
  }

  public void d(int paramInt)
  {
    if (this.bh != null)
    {
      this.bi.a(this.bh);
      this.bh = null;
    }
    this.bi.b(new Runnable(paramInt)
    {
      public void run()
      {
        if (MediaController.a(MediaController.this) == null)
          return;
        try
        {
          MediaController.d(MediaController.this, this.a);
          MediaController.a(MediaController.this).stop();
          if (this.a == 0)
            MediaController.a(MediaController.this, 0);
        }
        catch (Exception localException2)
        {
          try
          {
            do
            {
              ((Vibrator)ApplicationLoader.a.getSystemService("vibrator")).vibrate(50L);
              a.a(new Runnable()
              {
                public void run()
                {
                  y.a().a(y.aK, new Object[0]);
                }
              });
              return;
              localException1 = localException1;
              n.a("tmessages", localException1);
            }
            while (MediaController.S(MediaController.this) == null);
            MediaController.S(MediaController.this).delete();
          }
          catch (Exception localException2)
          {
            while (true)
              n.a("tmessages", localException2);
          }
        }
      }
    });
  }

  public boolean d(u paramu)
  {
    return ((this.av != null) || (this.au != null)) && (paramu != null) && (this.ax != null) && ((this.ax == null) || ((this.ax.q() == paramu.q()) && (!this.aK)));
  }

  public void e()
  {
    ApplicationLoader.b.removeCallbacks(this.bt);
    this.bs += 1;
    try
    {
      if (this.bm == null)
      {
        localContentResolver = ApplicationLoader.a.getContentResolver();
        localUri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        localObject = new d();
        this.bl = ((d)localObject);
        localContentResolver.registerContentObserver(localUri, false, (ContentObserver)localObject);
      }
    }
    catch (Exception localException2)
    {
      try
      {
        while (true)
        {
          ContentResolver localContentResolver;
          Uri localUri;
          Object localObject;
          if (this.bl == null)
          {
            localContentResolver = ApplicationLoader.a.getContentResolver();
            localUri = MediaStore.Images.Media.INTERNAL_CONTENT_URI;
            localObject = new h();
            this.bm = ((h)localObject);
            localContentResolver.registerContentObserver(localUri, false, (ContentObserver)localObject);
          }
          return;
          localException1 = localException1;
          n.a("tmessages", localException1);
        }
      }
      catch (Exception localException2)
      {
        n.a("tmessages", localException2);
      }
    }
  }

  public void e(u paramu)
  {
    String str1 = paramu.q() + "_" + paramu.u();
    String str2 = m.b(paramu.a).getAbsolutePath();
    if (this.R.containsKey(str1))
      return;
    this.R.put(str1, paramu);
    Utilities.d.b(new Runnable(str2, str1)
    {
      public void run()
      {
        a.a(new Runnable(MediaController.a().getWaveform(this.a))
        {
          public void run()
          {
            u localu = (u)MediaController.U(MediaController.this).remove(MediaController.10.this.b);
            if (localu == null);
            do
              return;
            while (this.a == null);
            int i = 0;
            while (true)
            {
              Object localObject;
              if (i < localu.A().o.size())
              {
                localObject = (g.r)localu.A().o.get(i);
                if ((localObject instanceof g.hu))
                {
                  ((g.r)localObject).n = this.a;
                  ((g.r)localObject).e |= 4;
                }
              }
              else
              {
                localObject = new g.qi();
                ((g.qi)localObject).c.add(localu.a);
                w.a().a((g.we)localObject, localu.u(), -1, 0, false);
                localObject = new ArrayList();
                ((ArrayList)localObject).add(localu);
                y.a().a(y.G, new Object[] { Long.valueOf(localu.u()), localObject });
                return;
              }
              i += 1;
            }
          }
        });
      }
    });
  }

  public void f()
  {
    if (this.bt == null)
      this.bt = new k(null);
    this.bt.a = this.bs;
    ApplicationLoader.b.postDelayed(this.bt, 5000L);
  }

  public void f(u paramu)
  {
    this.N.add(paramu);
    if (this.N.size() == 1)
      P();
  }

  public int g()
  {
    int i1 = this.as;
    this.as = (i1 + 1);
    return i1;
  }

  public void g(u arg1)
  {
    if (??? == null)
      synchronized (this.h)
      {
        this.P = true;
        return;
      }
    if (!this.N.isEmpty())
    {
      if (this.N.get(0) == ???);
      synchronized (this.h)
      {
        this.P = true;
        this.N.remove(???);
        return;
      }
    }
  }

  public native byte[] getWaveform(String paramString);

  public native byte[] getWaveform2(short[] paramArrayOfShort, int paramInt);

  protected boolean h()
  {
    return (this.bh != null) || (this.aO != null);
  }

  public void i()
  {
    if ((!this.A) || (this.q == null) || (!this.C))
      return;
    this.p = true;
    a(this.q.q(), null);
    this.D = true;
  }

  public u j()
  {
    return this.ax;
  }

  public int k()
  {
    return this.aI;
  }

  public void l()
  {
    d(false);
  }

  public void m()
  {
    if (this.ai);
    for (ArrayList localArrayList = this.aH; ; localArrayList = this.aG)
    {
      this.aI -= 1;
      if (this.aI < 0)
        this.aI = (localArrayList.size() - 1);
      if ((this.aI >= 0) && (this.aI < localArrayList.size()))
        break;
      return;
    }
    this.aL = true;
    a((u)localArrayList.get(this.aI));
  }

  public org.vidogram.messenger.a.a n()
  {
    return this.aM;
  }

  public boolean o()
  {
    return this.ai;
  }

  public void onAccuracyChanged(Sensor paramSensor, int paramInt)
  {
  }

  public void onAudioFocusChange(int paramInt)
  {
    if (paramInt == -1)
    {
      if ((d(j())) && (!s()))
        b(j());
      this.J = 0;
      this.L = 0;
    }
    while (true)
    {
      H();
      return;
      if (paramInt == 1)
      {
        this.L = 2;
        if (!this.M)
          continue;
        this.M = false;
        if ((!d(j())) || (!s()))
          continue;
        a(j());
        continue;
      }
      if (paramInt == -3)
      {
        this.L = 1;
        continue;
      }
      if (paramInt != -2)
        continue;
      this.L = 0;
      if ((!d(j())) || (s()))
        continue;
      b(j());
      this.M = true;
    }
  }

  public void onSensorChanged(SensorEvent paramSensorEvent)
  {
    if (!this.E);
    label1047: label1565: 
    while (true)
    {
      return;
      label92: float f1;
      label249: boolean bool;
      if (paramSensorEvent.sensor == this.l)
      {
        n.a("tmessages", "proximity changed to " + paramSensorEvent.values[0]);
        if (this.z == -100.0F)
        {
          this.z = paramSensorEvent.values[0];
          if (this.y)
            this.x = a(paramSensorEvent.values[0]);
          if ((paramSensorEvent.sensor == this.n) || (paramSensorEvent.sensor == this.o) || (paramSensorEvent.sensor == this.m))
          {
            f1 = this.G[0] * this.I[0] + this.G[1] * this.I[1] + this.G[2] * this.I[2];
            if (this.t != 6)
            {
              if ((f1 <= 0.0F) || (this.F <= 0.0F))
                break label1109;
              if ((f1 <= 15.0F) || (this.t != 0))
                break label1047;
              if ((this.s < 6) && (!this.x))
              {
                this.s += 1;
                if (this.s == 6)
                  this.u = 0;
              }
            }
            this.F = f1;
            if ((this.H[1] <= 2.5F) || (Math.abs(this.H[2]) >= 4.0F) || (Math.abs(this.H[0]) <= 1.5F))
              break label1253;
            bool = true;
            label303: this.r = bool;
          }
          if ((this.t != 6) || (!this.r) || (!this.x) || (z.a().c.isWiredHeadsetOn()))
            break label1341;
          n.a("tmessages", "sensor values reached");
          if ((this.ax != null) || (this.bh != null) || (this.aO != null) || (am.a().f()) || (!ApplicationLoader.c) || (this.B) || (!this.C) || (this.q == null) || (this.K))
            break label1259;
          if (!this.p)
          {
            n.a("tmessages", "start record");
            this.A = true;
            if (!this.q.r())
            {
              this.p = true;
              this.A = false;
              a(this.q.q(), null);
            }
            this.D = true;
            if ((this.y) && (this.k != null) && (!this.k.isHeld()))
              this.k.acquire();
          }
          label506: this.t = 0;
          this.s = 0;
          this.u = 0;
        }
      }
      while (true)
      {
        if ((this.v == 0L) || (this.t != 6) || (Math.abs(System.currentTimeMillis() - this.v) <= 1000L))
          break label1565;
        this.t = 0;
        this.s = 0;
        this.u = 0;
        this.v = 0L;
        return;
        if (this.z == paramSensorEvent.values[0])
          break;
        this.y = true;
        break;
        if (paramSensorEvent.sensor == this.m)
        {
          double d1;
          if (this.w == 0L)
            d1 = 0.9800000190734863D;
          while (true)
          {
            this.w = paramSensorEvent.timestamp;
            this.G[0] = (float)(this.G[0] * d1 + (1.0D - d1) * paramSensorEvent.values[0]);
            this.G[1] = (float)(this.G[1] * d1 + (1.0D - d1) * paramSensorEvent.values[1]);
            arrayOfFloat1 = this.G;
            double d2 = this.G[2];
            arrayOfFloat1[2] = (float)((1.0D - d1) * paramSensorEvent.values[2] + d2 * d1);
            this.H[0] = (0.8F * this.G[0] + 0.2F * paramSensorEvent.values[0]);
            this.H[1] = (0.8F * this.G[1] + 0.2F * paramSensorEvent.values[1]);
            this.H[2] = (0.8F * this.G[2] + 0.2F * paramSensorEvent.values[2]);
            this.I[0] = (paramSensorEvent.values[0] - this.G[0]);
            this.I[1] = (paramSensorEvent.values[1] - this.G[1]);
            this.I[2] = (paramSensorEvent.values[2] - this.G[2]);
            break;
            d1 = 1.0D / (1.0D + (paramSensorEvent.timestamp - this.w) / 1000000000.0D);
          }
        }
        if (paramSensorEvent.sensor == this.n)
        {
          this.I[0] = paramSensorEvent.values[0];
          this.I[1] = paramSensorEvent.values[1];
          this.I[2] = paramSensorEvent.values[2];
          break label92;
        }
        if (paramSensorEvent.sensor != this.o)
          break label92;
        float[] arrayOfFloat1 = this.H;
        float[] arrayOfFloat2 = this.G;
        f1 = paramSensorEvent.values[0];
        arrayOfFloat2[0] = f1;
        arrayOfFloat1[0] = f1;
        arrayOfFloat1 = this.H;
        arrayOfFloat2 = this.G;
        f1 = paramSensorEvent.values[1];
        arrayOfFloat2[1] = f1;
        arrayOfFloat1[1] = f1;
        arrayOfFloat1 = this.H;
        arrayOfFloat2 = this.G;
        f1 = paramSensorEvent.values[2];
        arrayOfFloat2[2] = f1;
        arrayOfFloat1[2] = f1;
        break label92;
        if (f1 < 15.0F)
          this.u += 1;
        if ((this.u != 10) && (this.s == 6) && (this.t == 0))
          break label249;
        this.t = 0;
        this.s = 0;
        this.u = 0;
        break label249;
        label1109: if ((f1 >= 0.0F) || (this.F >= 0.0F))
          break label249;
        if ((this.s == 6) && (f1 < -15.0F))
        {
          if (this.t >= 6)
            break label249;
          this.t += 1;
          if (this.t != 6)
            break label249;
          this.s = 0;
          this.u = 0;
          this.v = System.currentTimeMillis();
          break label249;
        }
        if (f1 > -15.0F)
          this.u += 1;
        if ((this.u != 10) && (this.s == 6) && (this.t == 0))
          break label249;
        this.s = 0;
        this.t = 0;
        this.u = 0;
        break label249;
        label1253: bool = false;
        break label303;
        label1259: if ((this.ax == null) || (!this.ax.H()) || (this.A))
          break label506;
        n.a("tmessages", "start listen");
        if ((this.y) && (this.k != null) && (!this.k.isHeld()))
          this.k.acquire();
        this.A = true;
        c(false);
        this.D = true;
        break label506;
        label1341: if (this.x)
        {
          if ((this.ax == null) || (!this.ax.H()) || (this.A))
            continue;
          n.a("tmessages", "start listen by proximity only");
          if ((this.y) && (this.k != null) && (!this.k.isHeld()))
            this.k.acquire();
          this.A = true;
          c(false);
          this.D = true;
          continue;
        }
        if (this.x)
          continue;
        if (this.p)
        {
          n.a("tmessages", "stop record");
          d(2);
          this.p = false;
          this.D = false;
          if ((!this.y) || (this.k == null) || (!this.k.isHeld()))
            continue;
          this.k.release();
          continue;
        }
        if (!this.A)
          continue;
        n.a("tmessages", "stop listen");
        this.A = false;
        c(true);
        this.D = false;
        if ((!this.y) || (this.k == null) || (!this.k.isHeld()))
          continue;
        this.k.release();
      }
    }
  }

  public int p()
  {
    return this.aj;
  }

  public void q()
  {
    boolean bool;
    if (!this.ai)
    {
      bool = true;
      this.ai = bool;
      SharedPreferences.Editor localEditor = ApplicationLoader.a.getSharedPreferences("mainconfig", 0).edit();
      localEditor.putBoolean("shuffleMusic", this.ai);
      localEditor.commit();
      if (!this.ai)
        break label73;
      N();
      this.aI = 0;
    }
    label73: 
    do
    {
      do
      {
        return;
        bool = false;
        break;
      }
      while (this.ax == null);
      this.aI = this.aG.indexOf(this.ax);
    }
    while (this.aI != -1);
    this.aG.clear();
    this.aH.clear();
    a(true, true);
  }

  public void r()
  {
    this.aj += 1;
    if (this.aj > 2)
      this.aj = 0;
    SharedPreferences.Editor localEditor = ApplicationLoader.a.getSharedPreferences("mainconfig", 0).edit();
    localEditor.putInt("repeatMode", this.aj);
    localEditor.commit();
  }

  public boolean s()
  {
    return (this.at) || (this.aK);
  }

  public boolean t()
  {
    return this.aK;
  }

  public void u()
  {
    if (!this.ad);
    for (boolean bool = true; ; bool = false)
    {
      this.ad = bool;
      SharedPreferences.Editor localEditor = ApplicationLoader.a.getSharedPreferences("mainconfig", 0).edit();
      localEditor.putBoolean("save_gallery", this.ad);
      localEditor.commit();
      z();
      return;
    }
  }

  public void v()
  {
    if (!this.ae);
    for (boolean bool = true; ; bool = false)
    {
      this.ae = bool;
      SharedPreferences.Editor localEditor = ApplicationLoader.a.getSharedPreferences("mainconfig", 0).edit();
      localEditor.putBoolean("autoplay_gif", this.ae);
      localEditor.commit();
      return;
    }
  }

  public void w()
  {
    if (!this.af);
    for (boolean bool = true; ; bool = false)
    {
      this.af = bool;
      SharedPreferences.Editor localEditor = ApplicationLoader.a.getSharedPreferences("mainconfig", 0).edit();
      localEditor.putBoolean("raise_to_speak", this.af);
      localEditor.commit();
      return;
    }
  }

  public void x()
  {
    if (!this.ag);
    for (boolean bool = true; ; bool = false)
    {
      this.ag = bool;
      SharedPreferences.Editor localEditor = ApplicationLoader.a.getSharedPreferences("mainconfig", 0).edit();
      localEditor.putBoolean("custom_tabs", this.ag);
      localEditor.commit();
      return;
    }
  }

  public void y()
  {
    if (!this.ah);
    for (boolean bool = true; ; bool = false)
    {
      this.ah = bool;
      SharedPreferences.Editor localEditor = ApplicationLoader.a.getSharedPreferences("mainconfig", 0).edit();
      localEditor.putBoolean("direct_share", this.ah);
      localEditor.commit();
      return;
    }
  }

  public void z()
  {
    try
    {
      File localFile2 = new File(Environment.getExternalStorageDirectory(), "Telegram");
      File localFile1 = new File(localFile2, "Telegram Images");
      localFile1.mkdir();
      localFile2 = new File(localFile2, "Telegram Video");
      localFile2.mkdir();
      if (this.ad)
      {
        if (localFile1.isDirectory())
          new File(localFile1, ".nomedia").delete();
        if (localFile2.isDirectory())
        {
          new File(localFile2, ".nomedia").delete();
          return;
        }
      }
      else
      {
        if (localFile1.isDirectory())
          new File(localFile1, ".nomedia").createNewFile();
        if (localFile2.isDirectory())
        {
          new File(localFile2, ".nomedia").createNewFile();
          return;
        }
      }
    }
    catch (Exception localException)
    {
      n.a("tmessages", localException);
    }
  }

  public static class a
  {
    public int a;
    public String b;
    public MediaController.i c;
    public ArrayList<MediaController.i> d = new ArrayList();
    public HashMap<Integer, MediaController.i> e = new HashMap();
    public boolean f;

    public a(int paramInt, String paramString, MediaController.i parami, boolean paramBoolean)
    {
      this.a = paramInt;
      this.b = paramString;
      this.c = parami;
      this.f = paramBoolean;
    }

    public void a(MediaController.i parami)
    {
      this.d.add(parami);
      this.e.put(Integer.valueOf(parami.b), parami);
    }
  }

  private class b
  {
    ByteBuffer a;
    byte[] b;
    int c;
    int d;
    long e;

    public b(int arg2)
    {
      int i;
      this.a = ByteBuffer.allocateDirect(i);
      this.b = new byte[i];
    }
  }

  public static class c
  {
    public long a;
    public String b;
    public String c;
    public String d;
    public int e;
    public String f;
    public u g;
  }

  private class d extends ContentObserver
  {
    public d()
    {
      super();
    }

    public void onChange(boolean paramBoolean)
    {
      super.onChange(paramBoolean);
      MediaController.this.a(MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
    }
  }

  public static abstract interface e
  {
    public abstract void a(String paramString);

    public abstract void a(String paramString, float paramFloat);

    public abstract void a(String paramString, float paramFloat, boolean paramBoolean);

    public abstract void b(String paramString);

    public abstract int getObserverTag();
  }

  private class f extends ContentObserver
  {
    public f()
    {
      super();
    }

    public void onChange(boolean paramBoolean)
    {
      super.onChange(paramBoolean);
      if (MediaController.m(MediaController.this) != null)
        a.b(MediaController.m(MediaController.this));
      a.a(MediaController.a(MediaController.this, new Runnable()
      {
        public void run()
        {
          MediaController.a(MediaController.this, null);
          MediaController.e(0);
        }
      }), 2000L);
    }
  }

  private class g extends ContentObserver
  {
    public g()
    {
      super();
    }

    private void a()
    {
      a.a(MediaController.a(MediaController.this, new Runnable()
      {
        public void run()
        {
          if (am.a().f())
          {
            MediaController.g.a(MediaController.g.this);
            return;
          }
          MediaController.a(MediaController.this, null);
          MediaController.e(0);
        }
      }), 2000L);
    }

    public void onChange(boolean paramBoolean)
    {
      super.onChange(paramBoolean);
      if (MediaController.m(MediaController.this) != null)
        a.b(MediaController.m(MediaController.this));
      a();
    }
  }

  private class h extends ContentObserver
  {
    public h()
    {
      super();
    }

    public void onChange(boolean paramBoolean)
    {
      super.onChange(paramBoolean);
      MediaController.this.a(MediaStore.Images.Media.INTERNAL_CONTENT_URI);
    }
  }

  public static class i
  {
    public int a;
    public int b;
    public long c;
    public String d;
    public int e;
    public String f;
    public String g;
    public boolean h;
    public CharSequence i;
    public ArrayList<g.ab> j = new ArrayList();

    public i(int paramInt1, int paramInt2, long paramLong, String paramString, int paramInt3, boolean paramBoolean)
    {
      this.a = paramInt1;
      this.b = paramInt2;
      this.c = paramLong;
      this.d = paramString;
      this.e = paramInt3;
      this.h = paramBoolean;
    }
  }

  public static class j
  {
    public String a;
    public String b;
    public String c;
    public String d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public String j;
    public String k;
    public CharSequence l;
    public g.q m;
    public ArrayList<g.ab> n = new ArrayList();
  }

  private final class k
    implements Runnable
  {
    public int a = 0;

    private k()
    {
    }

    public void run()
    {
      if (this.a == MediaController.n(MediaController.this));
      try
      {
        if (MediaController.o(MediaController.this) != null)
        {
          ApplicationLoader.a.getContentResolver().unregisterContentObserver(MediaController.o(MediaController.this));
          MediaController.a(MediaController.this, null);
        }
      }
      catch (Exception localException2)
      {
        try
        {
          while (true)
          {
            if (MediaController.p(MediaController.this) != null)
            {
              ApplicationLoader.a.getContentResolver().unregisterContentObserver(MediaController.p(MediaController.this));
              MediaController.a(MediaController.this, null);
            }
            return;
            localException1 = localException1;
            n.a("tmessages", localException1);
          }
        }
        catch (Exception localException2)
        {
          n.a("tmessages", localException2);
        }
      }
    }
  }

  private static class l
    implements Runnable
  {
    private u a;

    private l(u paramu)
    {
      this.a = paramu;
    }

    public static void a(u paramu)
    {
      new Thread(new Runnable(paramu)
      {
        public void run()
        {
          try
          {
            Thread localThread = new Thread(new MediaController.l(this.a, null), "VideoConvertRunnable");
            localThread.start();
            localThread.join();
            return;
          }
          catch (Exception localException)
          {
            n.a("tmessages", localException);
          }
        }
      }).start();
    }

    public void run()
    {
      MediaController.b(MediaController.a(), this.a);
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.MediaController
 * JD-Core Version:    0.6.0
 */