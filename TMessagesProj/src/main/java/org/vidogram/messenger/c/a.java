package org.vidogram.messenger.c;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.hardware.Camera.CameraInfo;
import android.hardware.Camera.Parameters;
import android.hardware.Camera.PictureCallback;
import android.hardware.Camera.Size;
import android.media.MediaRecorder;
import android.media.MediaRecorder.OnInfoListener;
import android.media.ThumbnailUtils;
import android.os.Build;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.vidogram.messenger.n;
import org.vidogram.messenger.y;

public class a
  implements MediaRecorder.OnInfoListener
{
  private static final int c = Runtime.getRuntime().availableProcessors();
  private static volatile a i = null;
  protected ArrayList<String> a = new ArrayList();
  protected ArrayList<b> b = null;
  private ThreadPoolExecutor d = new ThreadPoolExecutor(1, c, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue());
  private MediaRecorder e;
  private String f;
  private b g;
  private boolean h;

  private static int a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    int k = 1;
    int j = paramInt1;
    if (paramBoolean)
    {
      j = paramInt1 + (paramInt2 - 1);
      k = -1;
    }
    paramInt1 = 0;
    while (paramInt2 > 0)
    {
      paramInt1 = paramInt1 << 8 | paramArrayOfByte[j] & 0xFF;
      j += k;
      paramInt2 -= 1;
    }
    return paramInt1;
  }

  public static a a()
  {
    Object localObject1 = i;
    if (localObject1 == null)
    {
      monitorenter;
      try
      {
        a locala = i;
        localObject1 = locala;
        if (locala == null)
        {
          localObject1 = new a();
          i = (a)localObject1;
        }
        return localObject1;
      }
      finally
      {
        monitorexit;
      }
    }
    return (a)localObject2;
  }

  public static e a(List<e> paramList, int paramInt1, int paramInt2, e parame)
  {
    ArrayList localArrayList = new ArrayList();
    int k = parame.a();
    int m = parame.b();
    int j = 0;
    while (j < paramList.size())
    {
      parame = (e)paramList.get(j);
      if ((parame.b() == parame.a() * m / k) && (parame.a() >= paramInt1) && (parame.b() >= paramInt2))
        localArrayList.add(parame);
      j += 1;
    }
    if (localArrayList.size() > 0)
      return (e)Collections.min(localArrayList, new a());
    return (e)Collections.max(paramList, new a());
  }

  private static int b(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null);
    label8: label393: label396: 
    while (true)
    {
      return 0;
      int j = 0;
      int m;
      int k;
      int n;
      while (true)
      {
        m = j;
        if (j + 3 < paramArrayOfByte.length)
        {
          k = j + 1;
          if ((paramArrayOfByte[j] & 0xFF) != 255)
            break label393;
          n = paramArrayOfByte[k] & 0xFF;
          if (n == 255)
          {
            j = k;
            continue;
          }
          k += 1;
          j = k;
          if (n == 216)
            continue;
          j = k;
          if (n == 1)
            continue;
          m = k;
          if (n != 217)
          {
            if (n != 218)
              break;
            j = 0;
          }
        }
      }
      while (true)
      {
        label99: if (j <= 8)
          break label396;
        m = a(paramArrayOfByte, k, 4, false);
        if ((m != 1229531648) && (m != 1296891946))
          break;
        boolean bool;
        if (m == 1229531648)
        {
          bool = true;
          m = a(paramArrayOfByte, k + 4, 4, bool) + 2;
          if ((m < 10) || (m > j))
            break;
          k += m;
          n = a(paramArrayOfByte, k - 2, 2, bool);
          j -= m;
          m = k;
          k = j;
          j = n;
        }
        while (true)
        {
          if ((j <= 0) || (k < 12))
            break label384;
          if (a(paramArrayOfByte, m, 2, bool) == 274)
            switch (a(paramArrayOfByte, m + 8, 2, bool))
            {
            case 1:
            case 2:
            case 4:
            case 5:
            case 7:
            default:
              return 0;
            case 3:
              return 180;
              j = a(paramArrayOfByte, k, 2, false);
              if ((j < 2) || (k + j > paramArrayOfByte.length))
                break;
              if ((n == 225) && (j >= 8) && (a(paramArrayOfByte, k + 2, 4, false) == 1165519206) && (a(paramArrayOfByte, k + 6, 2, false) == 0))
              {
                k += 8;
                j -= 8;
                break label99;
              }
              j = k + j;
              break label8;
              bool = false;
              break;
            case 6:
              return 90;
            case 8:
              return 270;
            }
          m += 12;
          k -= 12;
          j -= 1;
        }
        break;
        j = 0;
        k = m;
        continue;
        j = 0;
      }
    }
  }

  public void a(c paramc)
  {
    if (paramc == null)
      return;
    this.d.execute(new Runnable(paramc)
    {
      @SuppressLint({"NewApi"})
      public void run()
      {
        Camera localCamera3 = this.a.a.b;
        Camera localCamera1 = localCamera3;
        Camera localCamera2;
        if (localCamera3 == null)
          localCamera2 = localCamera3;
        try
        {
          b localb = this.a.a;
          localCamera2 = localCamera3;
          localCamera1 = Camera.open(this.a.a.a);
          localCamera2 = localCamera3;
          localb.b = localCamera1;
          localCamera2 = localCamera1;
          localCamera1.startPreview();
          return;
        }
        catch (Exception localException)
        {
          this.a.a.b = null;
          if (localCamera2 != null)
            localCamera2.release();
          n.a("tmessages", localException);
        }
      }
    });
  }

  public void a(c paramc, SurfaceTexture paramSurfaceTexture, Runnable paramRunnable)
  {
    if ((paramc == null) || (paramSurfaceTexture == null))
      return;
    this.d.execute(new Runnable(paramc, paramSurfaceTexture, paramRunnable)
    {
      @SuppressLint({"NewApi"})
      public void run()
      {
        Object localObject3 = this.a.a.b;
        Object localObject1 = localObject3;
        Object localObject2;
        if (localObject3 == null)
          localObject2 = localObject3;
        while (true)
        {
          int i;
          try
          {
            Object localObject4 = this.a.a;
            localObject2 = localObject3;
            localObject1 = Camera.open(this.a.a.a);
            localObject2 = localObject3;
            ((b)localObject4).b = ((Camera)localObject1);
            localObject2 = localObject1;
            localObject3 = ((Camera)localObject1).getParameters().getSupportedFlashModes();
            localObject2 = localObject1;
            a.this.a.clear();
            if (localObject3 == null)
              continue;
            i = 0;
            localObject2 = localObject1;
            if (i >= ((List)localObject3).size())
              continue;
            localObject2 = localObject1;
            localObject4 = (String)((List)localObject3).get(i);
            localObject2 = localObject1;
            if (((String)localObject4).equals("off"))
              continue;
            localObject2 = localObject1;
            if (((String)localObject4).equals("on"))
              continue;
            localObject2 = localObject1;
            if (((String)localObject4).equals("auto"))
            {
              localObject2 = localObject1;
              a.this.a.add(localObject4);
              break label264;
              localObject2 = localObject1;
              this.a.a((String)a.this.a.get(0));
              localObject2 = localObject1;
              this.a.e();
              localObject2 = localObject1;
              ((Camera)localObject1).setPreviewTexture(this.b);
              localObject2 = localObject1;
              ((Camera)localObject1).startPreview();
              localObject2 = localObject1;
              if (this.c == null)
                continue;
              localObject2 = localObject1;
              org.vidogram.messenger.a.a(this.c);
              return;
            }
          }
          catch (Exception localException)
          {
            this.a.a.b = null;
            if (localObject2 == null)
              continue;
            localObject2.release();
            n.a("tmessages", localException);
            return;
          }
          label264: i += 1;
        }
      }
    });
  }

  public void a(c paramc, File paramFile, b paramb)
  {
    if (paramc == null);
    while (true)
    {
      return;
      try
      {
        b localb = paramc.a;
        Camera localCamera = localb.b;
        if (localCamera == null)
          continue;
        localCamera.stopPreview();
        localCamera.unlock();
        try
        {
          this.e = new MediaRecorder();
          this.e.setCamera(localCamera);
          this.e.setVideoSource(1);
          this.e.setAudioSource(5);
          paramc.a(1, this.e);
          this.e.setOutputFile(paramFile.getAbsolutePath());
          this.e.setMaxFileSize(1073741824L);
          this.e.setVideoFrameRate(30);
          this.e.setMaxDuration(0);
          paramc = new e(16, 9);
          paramc = a(localb.c(), 720, 480, paramc);
          this.e.setVideoSize(paramc.a(), paramc.b());
          this.e.setVideoEncodingBitRate(1800000);
          this.e.setOnInfoListener(this);
          this.e.prepare();
          this.e.start();
          this.g = paramb;
          this.f = paramFile.getAbsolutePath();
          return;
        }
        catch (Exception paramc)
        {
          this.e.release();
          this.e = null;
          n.a("tmessages", paramc);
          return;
        }
      }
      catch (Exception paramc)
      {
        n.a("tmessages", paramc);
      }
    }
  }

  public void a(c paramc, Semaphore paramSemaphore)
  {
    paramc.g();
    Camera localCamera = paramc.a.b;
    paramc.a.b = null;
    this.d.execute(new Runnable(localCamera, paramSemaphore)
    {
      public void run()
      {
        try
        {
          if (this.a != null)
          {
            this.a.stopPreview();
            this.a.release();
          }
          if (this.b != null)
            this.b.release();
          return;
        }
        catch (Exception localException)
        {
          while (true)
            n.a("tmessages", localException);
        }
      }
    });
    if (paramSemaphore != null);
    try
    {
      paramSemaphore.acquire();
      return;
    }
    catch (Exception paramc)
    {
      n.a("tmessages", paramc);
    }
  }

  public void a(c paramc, boolean paramBoolean)
  {
    try
    {
      Camera localCamera = paramc.a.b;
      if ((localCamera != null) && (this.e != null))
      {
        MediaRecorder localMediaRecorder = this.e;
        this.e = null;
        localMediaRecorder.stop();
        localMediaRecorder.release();
        localCamera.reconnect();
        localCamera.startPreview();
        paramc.f();
      }
      if (!paramBoolean)
        org.vidogram.messenger.a.a(new Runnable(ThumbnailUtils.createVideoThumbnail(this.f, 1))
        {
          public void run()
          {
            a.a(a.this).a(this.a);
          }
        });
      return;
    }
    catch (Exception paramc)
    {
      n.a("tmessages", paramc);
    }
  }

  public boolean a(File paramFile, c paramc, Runnable paramRunnable)
  {
    if (paramc == null)
      return false;
    paramc = paramc.a;
    Camera localCamera = paramc.b;
    try
    {
      localCamera.takePicture(null, null, new Camera.PictureCallback(paramFile, paramc, paramRunnable)
      {
        // ERROR //
        public void onPictureTaken(byte[] paramArrayOfByte, Camera paramCamera)
        {
          // Byte code:
          //   0: invokestatic 44	org/vidogram/messenger/a:f	()I
          //   3: i2f
          //   4: getstatic 47	org/vidogram/messenger/a:b	F
          //   7: fdiv
          //   8: f2i
          //   9: istore_3
          //   10: getstatic 53	java/util/Locale:US	Ljava/util/Locale;
          //   13: ldc 55
          //   15: iconst_3
          //   16: anewarray 4	java/lang/Object
          //   19: dup
          //   20: iconst_0
          //   21: aload_0
          //   22: getfield 24	org/vidogram/messenger/c/a$3:a	Ljava/io/File;
          //   25: invokevirtual 61	java/io/File:getAbsolutePath	()Ljava/lang/String;
          //   28: invokestatic 67	org/vidogram/messenger/Utilities:e	(Ljava/lang/String;)Ljava/lang/String;
          //   31: aastore
          //   32: dup
          //   33: iconst_1
          //   34: iload_3
          //   35: invokestatic 73	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
          //   38: aastore
          //   39: dup
          //   40: iconst_2
          //   41: iload_3
          //   42: invokestatic 73	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
          //   45: aastore
          //   46: invokestatic 79	java/lang/String:format	(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
          //   49: astore 4
          //   51: new 81	android/graphics/BitmapFactory$Options
          //   54: dup
          //   55: invokespecial 82	android/graphics/BitmapFactory$Options:<init>	()V
          //   58: astore_2
          //   59: aload_2
          //   60: iconst_1
          //   61: putfield 86	android/graphics/BitmapFactory$Options:inPurgeable	Z
          //   64: aload_1
          //   65: iconst_0
          //   66: aload_1
          //   67: arraylength
          //   68: aload_2
          //   69: invokestatic 92	android/graphics/BitmapFactory:decodeByteArray	([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
          //   72: astore_2
          //   73: aload_0
          //   74: getfield 26	org/vidogram/messenger/c/a$3:b	Lorg/vidogram/messenger/c/b;
          //   77: getfield 97	org/vidogram/messenger/c/b:e	I
          //   80: istore_3
          //   81: iload_3
          //   82: ifeq +158 -> 240
          //   85: new 99	android/graphics/Matrix
          //   88: dup
          //   89: invokespecial 100	android/graphics/Matrix:<init>	()V
          //   92: astore 5
          //   94: aload 5
          //   96: aload_1
          //   97: invokestatic 103	org/vidogram/messenger/c/a:a	([B)I
          //   100: i2f
          //   101: invokevirtual 107	android/graphics/Matrix:setRotate	(F)V
          //   104: aload 5
          //   106: ldc 108
          //   108: fconst_1
          //   109: invokevirtual 112	android/graphics/Matrix:postScale	(FF)Z
          //   112: pop
          //   113: aload_2
          //   114: iconst_0
          //   115: iconst_0
          //   116: aload_2
          //   117: invokevirtual 117	android/graphics/Bitmap:getWidth	()I
          //   120: aload_2
          //   121: invokevirtual 120	android/graphics/Bitmap:getHeight	()I
          //   124: aload 5
          //   126: iconst_0
          //   127: invokestatic 125	org/vidogram/messenger/c:a	(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;
          //   130: astore 5
          //   132: aload_2
          //   133: invokevirtual 128	android/graphics/Bitmap:recycle	()V
          //   136: new 130	java/io/FileOutputStream
          //   139: dup
          //   140: aload_0
          //   141: getfield 24	org/vidogram/messenger/c/a$3:a	Ljava/io/File;
          //   144: invokespecial 133	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
          //   147: astore 6
          //   149: aload 5
          //   151: getstatic 139	android/graphics/Bitmap$CompressFormat:JPEG	Landroid/graphics/Bitmap$CompressFormat;
          //   154: bipush 80
          //   156: aload 6
          //   158: invokevirtual 143	android/graphics/Bitmap:compress	(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
          //   161: pop
          //   162: aload 6
          //   164: invokevirtual 146	java/io/FileOutputStream:flush	()V
          //   167: aload 6
          //   169: invokevirtual 150	java/io/FileOutputStream:getFD	()Ljava/io/FileDescriptor;
          //   172: invokevirtual 155	java/io/FileDescriptor:sync	()V
          //   175: aload 6
          //   177: invokevirtual 158	java/io/FileOutputStream:close	()V
          //   180: aload 5
          //   182: ifnull +20 -> 202
          //   185: invokestatic 163	org/vidogram/messenger/p:a	()Lorg/vidogram/messenger/p;
          //   188: new 165	android/graphics/drawable/BitmapDrawable
          //   191: dup
          //   192: aload 5
          //   194: invokespecial 168	android/graphics/drawable/BitmapDrawable:<init>	(Landroid/graphics/Bitmap;)V
          //   197: aload 4
          //   199: invokevirtual 171	org/vidogram/messenger/p:a	(Landroid/graphics/drawable/BitmapDrawable;Ljava/lang/String;)V
          //   202: aload_0
          //   203: getfield 28	org/vidogram/messenger/c/a$3:c	Ljava/lang/Runnable;
          //   206: ifnull +12 -> 218
          //   209: aload_0
          //   210: getfield 28	org/vidogram/messenger/c/a$3:c	Ljava/lang/Runnable;
          //   213: invokeinterface 176 1 0
          //   218: return
          //   219: astore_2
          //   220: ldc 178
          //   222: aload_2
          //   223: invokestatic 183	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
          //   226: aconst_null
          //   227: astore_2
          //   228: goto -155 -> 73
          //   231: astore 5
          //   233: ldc 178
          //   235: aload 5
          //   237: invokestatic 183	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
          //   240: new 130	java/io/FileOutputStream
          //   243: dup
          //   244: aload_0
          //   245: getfield 24	org/vidogram/messenger/c/a$3:a	Ljava/io/File;
          //   248: invokespecial 133	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
          //   251: astore 5
          //   253: aload 5
          //   255: aload_1
          //   256: invokevirtual 187	java/io/FileOutputStream:write	([B)V
          //   259: aload 5
          //   261: invokevirtual 146	java/io/FileOutputStream:flush	()V
          //   264: aload 5
          //   266: invokevirtual 150	java/io/FileOutputStream:getFD	()Ljava/io/FileDescriptor;
          //   269: invokevirtual 155	java/io/FileDescriptor:sync	()V
          //   272: aload 5
          //   274: invokevirtual 158	java/io/FileOutputStream:close	()V
          //   277: aload_2
          //   278: ifnull +19 -> 297
          //   281: invokestatic 163	org/vidogram/messenger/p:a	()Lorg/vidogram/messenger/p;
          //   284: new 165	android/graphics/drawable/BitmapDrawable
          //   287: dup
          //   288: aload_2
          //   289: invokespecial 168	android/graphics/drawable/BitmapDrawable:<init>	(Landroid/graphics/Bitmap;)V
          //   292: aload 4
          //   294: invokevirtual 171	org/vidogram/messenger/p:a	(Landroid/graphics/drawable/BitmapDrawable;Ljava/lang/String;)V
          //   297: aload_0
          //   298: getfield 28	org/vidogram/messenger/c/a$3:c	Ljava/lang/Runnable;
          //   301: ifnull -83 -> 218
          //   304: aload_0
          //   305: getfield 28	org/vidogram/messenger/c/a$3:c	Ljava/lang/Runnable;
          //   308: invokeinterface 176 1 0
          //   313: return
          //   314: astore_1
          //   315: ldc 178
          //   317: aload_1
          //   318: invokestatic 183	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
          //   321: goto -24 -> 297
          //
          // Exception table:
          //   from	to	target	type
          //   51	73	219	java/lang/Throwable
          //   85	180	231	java/lang/Throwable
          //   185	202	231	java/lang/Throwable
          //   202	218	231	java/lang/Throwable
          //   73	81	314	java/lang/Exception
          //   85	180	314	java/lang/Exception
          //   185	202	314	java/lang/Exception
          //   202	218	314	java/lang/Exception
          //   233	240	314	java/lang/Exception
          //   240	277	314	java/lang/Exception
          //   281	297	314	java/lang/Exception
        }
      });
      return true;
    }
    catch (Exception paramFile)
    {
      n.a("tmessages", paramFile);
    }
    return false;
  }

  public void b()
  {
    if (this.h)
      return;
    this.d.execute(new Runnable()
    {
      public void run()
      {
        while (true)
        {
          int j;
          try
          {
            if (a.this.b != null)
              continue;
            int k = Camera.getNumberOfCameras();
            ArrayList localArrayList = new ArrayList();
            Camera.CameraInfo localCameraInfo = new Camera.CameraInfo();
            int i = 0;
            if (i >= k)
              continue;
            Camera.getCameraInfo(i, localCameraInfo);
            b localb = new b(i, localCameraInfo);
            Camera localCamera = Camera.open(localb.a());
            Object localObject1 = localCamera.getParameters();
            Object localObject2 = ((Camera.Parameters)localObject1).getSupportedPreviewSizes();
            j = 0;
            if (j >= ((List)localObject2).size())
              continue;
            Camera.Size localSize = (Camera.Size)((List)localObject2).get(j);
            if ((localSize.height < 2160) && (localSize.width < 2160))
            {
              localb.d.add(new e(localSize.width, localSize.height));
              break label304;
              localObject1 = ((Camera.Parameters)localObject1).getSupportedPictureSizes();
              j = 0;
              if (j >= ((List)localObject1).size())
                continue;
              localObject2 = (Camera.Size)((List)localObject1).get(j);
              if (("samsung".equals(Build.MANUFACTURER)) && ("jflteuc".equals(Build.PRODUCT)) && (((Camera.Size)localObject2).width >= 2048))
                break label311;
              localb.c.add(new e(((Camera.Size)localObject2).width, ((Camera.Size)localObject2).height));
              break label311;
              localCamera.release();
              localArrayList.add(localb);
              i += 1;
              continue;
              a.this.b = localArrayList;
              org.vidogram.messenger.a.a(new Runnable()
              {
                public void run()
                {
                  a.a(a.this, true);
                  y.a().a(y.ai, new Object[0]);
                }
              });
              return;
            }
          }
          catch (Exception localException)
          {
            n.a("tmessages", localException);
            return;
          }
          label304: j += 1;
          continue;
          label311: j += 1;
        }
      }
    });
  }

  public boolean c()
  {
    return (this.h) && (this.b != null) && (!this.b.isEmpty());
  }

  public ArrayList<b> d()
  {
    return this.b;
  }

  public void onInfo(MediaRecorder paramMediaRecorder, int paramInt1, int paramInt2)
  {
    if ((paramInt1 == 800) || (paramInt1 == 801) || (paramInt1 == 1))
    {
      paramMediaRecorder = this.e;
      this.e = null;
      if (paramMediaRecorder != null)
      {
        paramMediaRecorder.stop();
        paramMediaRecorder.release();
      }
      org.vidogram.messenger.a.a(new Runnable(ThumbnailUtils.createVideoThumbnail(this.f, 1))
      {
        public void run()
        {
          a.a(a.this).a(this.a);
        }
      });
    }
  }

  static class a
    implements Comparator<e>
  {
    public int a(e parame1, e parame2)
    {
      return Long.signum(parame1.a() * parame1.b() - parame2.a() * parame2.b());
    }
  }

  public static abstract interface b
  {
    public abstract void a(Bitmap paramBitmap);
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.c.a
 * JD-Core Version:    0.6.0
 */