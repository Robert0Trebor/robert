package org.vidogram.messenger.c;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.hardware.Camera;
import android.hardware.Camera.CameraInfo;
import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import android.os.Build;
import android.view.Display;
import android.view.OrientationEventListener;
import android.view.WindowManager;
import java.util.ArrayList;
import org.vidogram.messenger.ApplicationLoader;

public class c
{
  protected b a;
  private String b = "off";
  private OrientationEventListener c;
  private int d = -1;
  private boolean e;
  private final e f;
  private final e g;
  private final int h;
  private boolean i;

  public c(b paramb, e parame1, e parame2, int paramInt)
  {
    this.g = parame1;
    this.f = parame2;
    this.h = paramInt;
    this.a = paramb;
    parame1 = ApplicationLoader.a.getSharedPreferences("camera", 0);
    if (this.a.e != 0);
    for (paramb = "flashMode_front"; ; paramb = "flashMode")
    {
      this.b = parame1.getString(paramb, "off");
      this.c = new OrientationEventListener(ApplicationLoader.a)
      {
        public void onOrientationChanged(int paramInt)
        {
          if ((c.a(c.this) == null) || (!c.b(c.this)));
          do
          {
            return;
            paramInt = ((WindowManager)ApplicationLoader.a.getSystemService("window")).getDefaultDisplay().getRotation();
          }
          while (c.c(c.this) == paramInt);
          if (!c.d(c.this))
            c.this.e();
          c.a(c.this, paramInt);
        }
      };
      if (!this.c.canDetectOrientation())
        break;
      this.c.enable();
      return;
    }
    this.c.disable();
    this.c = null;
  }

  private int a(Camera.CameraInfo paramCameraInfo, boolean paramBoolean)
  {
    int j;
    switch (((WindowManager)ApplicationLoader.a.getSystemService("window")).getDefaultDisplay().getRotation())
    {
    default:
      j = 0;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
      if (paramCameraInfo.facing == 1)
      {
        int k = (360 - (j + paramCameraInfo.orientation) % 360) % 360;
        j = k;
        if (!paramBoolean)
        {
          j = k;
          if (k == 90)
            j = 270;
        }
        if ((paramBoolean) || (!"Huawei".equals(Build.MANUFACTURER)) || (!"angler".equals(Build.PRODUCT)) || (j != 270))
          break;
        return 90;
        j = 0;
        continue;
        j = 90;
        continue;
        j = 180;
        continue;
        j = 270;
        continue;
      }
      else
      {
        return (paramCameraInfo.orientation - j + 360) % 360;
      }
    return j;
  }

  private int h()
  {
    if (("LGE".equals(Build.MANUFACTURER)) && ("g3_tmo_us".equals(Build.PRODUCT)))
      return 4;
    return 1;
  }

  public String a()
  {
    return this.b;
  }

  protected void a(int paramInt, MediaRecorder paramMediaRecorder)
  {
    Camera.CameraInfo localCameraInfo = new Camera.CameraInfo();
    Camera.getCameraInfo(this.a.a, localCameraInfo);
    paramMediaRecorder.setOrientationHint(a(localCameraInfo, false));
    int j = h();
    boolean bool1 = CamcorderProfile.hasProfile(this.a.a, j);
    boolean bool2 = CamcorderProfile.hasProfile(this.a.a, 0);
    if ((bool1) && ((paramInt == 1) || (!bool2)))
      paramMediaRecorder.setProfile(CamcorderProfile.get(this.a.a, j));
    while (true)
    {
      this.e = true;
      return;
      if (!bool2)
        break;
      paramMediaRecorder.setProfile(CamcorderProfile.get(this.a.a, 0));
    }
    throw new IllegalStateException("cannot find valid CamcorderProfile");
  }

  public void a(String paramString)
  {
    if (a.a().a.contains(this.b))
      return;
    this.b = paramString;
    e();
    SharedPreferences.Editor localEditor = ApplicationLoader.a.getSharedPreferences("camera", 0).edit();
    if (this.a.e != 0);
    for (String str = "flashMode_front"; ; str = "flashMode")
    {
      localEditor.putString(str, paramString).commit();
      return;
    }
  }

  public String b()
  {
    ArrayList localArrayList = a.a().a;
    int j = 0;
    while (j < localArrayList.size())
    {
      if (((String)localArrayList.get(j)).equals(this.b))
      {
        if (j < localArrayList.size() - 1)
          return (String)localArrayList.get(j + 1);
        return (String)localArrayList.get(0);
      }
      j += 1;
    }
    return this.b;
  }

  public void b(String paramString)
  {
    this.b = paramString;
    e();
    SharedPreferences.Editor localEditor = ApplicationLoader.a.getSharedPreferences("camera", 0).edit();
    if (this.a.e != 0);
    for (String str = "flashMode_front"; ; str = "flashMode")
    {
      localEditor.putString(str, paramString).commit();
      return;
    }
  }

  protected void c()
  {
    this.i = true;
  }

  protected boolean d()
  {
    return this.i;
  }

  // ERROR //
  protected void e()
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_3
    //   2: iconst_0
    //   3: istore_1
    //   4: aload_0
    //   5: getfield 40	org/vidogram/messenger/c/c:a	Lorg/vidogram/messenger/c/b;
    //   8: getfield 225	org/vidogram/messenger/c/b:b	Landroid/hardware/Camera;
    //   11: astore 5
    //   13: aload 5
    //   15: ifnull +184 -> 199
    //   18: new 106	android/hardware/Camera$CameraInfo
    //   21: dup
    //   22: invokespecial 145	android/hardware/Camera$CameraInfo:<init>	()V
    //   25: astore 6
    //   27: aload 5
    //   29: invokevirtual 229	android/hardware/Camera:getParameters	()Landroid/hardware/Camera$Parameters;
    //   32: astore 4
    //   34: aload_0
    //   35: getfield 40	org/vidogram/messenger/c/c:a	Lorg/vidogram/messenger/c/b;
    //   38: invokevirtual 231	org/vidogram/messenger/c/b:a	()I
    //   41: aload 6
    //   43: invokestatic 153	android/hardware/Camera:getCameraInfo	(ILandroid/hardware/Camera$CameraInfo;)V
    //   46: aload_0
    //   47: aload 6
    //   49: iconst_1
    //   50: invokespecial 155	org/vidogram/messenger/c/c:a	(Landroid/hardware/Camera$CameraInfo;Z)I
    //   53: istore_2
    //   54: ldc 233
    //   56: getstatic 119	android/os/Build:MANUFACTURER	Ljava/lang/String;
    //   59: invokevirtual 125	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   62: ifeq +246 -> 308
    //   65: ldc 235
    //   67: getstatic 130	android/os/Build:PRODUCT	Ljava/lang/String;
    //   70: invokevirtual 125	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   73: ifeq +235 -> 308
    //   76: aload 5
    //   78: iload_1
    //   79: invokevirtual 238	android/hardware/Camera:setDisplayOrientation	(I)V
    //   82: aload 4
    //   84: ifnull +115 -> 199
    //   87: aload 4
    //   89: aload_0
    //   90: getfield 34	org/vidogram/messenger/c/c:g	Lorg/vidogram/messenger/c/e;
    //   93: invokevirtual 241	org/vidogram/messenger/c/e:a	()I
    //   96: aload_0
    //   97: getfield 34	org/vidogram/messenger/c/c:g	Lorg/vidogram/messenger/c/e;
    //   100: invokevirtual 243	org/vidogram/messenger/c/e:b	()I
    //   103: invokevirtual 249	android/hardware/Camera$Parameters:setPreviewSize	(II)V
    //   106: aload 4
    //   108: aload_0
    //   109: getfield 36	org/vidogram/messenger/c/c:f	Lorg/vidogram/messenger/c/e;
    //   112: invokevirtual 241	org/vidogram/messenger/c/e:a	()I
    //   115: aload_0
    //   116: getfield 36	org/vidogram/messenger/c/c:f	Lorg/vidogram/messenger/c/e;
    //   119: invokevirtual 243	org/vidogram/messenger/c/e:b	()I
    //   122: invokevirtual 252	android/hardware/Camera$Parameters:setPictureSize	(II)V
    //   125: aload 4
    //   127: aload_0
    //   128: getfield 38	org/vidogram/messenger/c/c:h	I
    //   131: invokevirtual 255	android/hardware/Camera$Parameters:setPictureFormat	(I)V
    //   134: aload 4
    //   136: invokevirtual 259	android/hardware/Camera$Parameters:getSupportedFocusModes	()Ljava/util/List;
    //   139: ldc_w 261
    //   142: invokeinterface 264 2 0
    //   147: ifeq +11 -> 158
    //   150: aload 4
    //   152: ldc_w 261
    //   155: invokevirtual 267	android/hardware/Camera$Parameters:setFocusMode	(Ljava/lang/String;)V
    //   158: aload 6
    //   160: getfield 109	android/hardware/Camera$CameraInfo:facing	I
    //   163: iconst_1
    //   164: if_icmpne +120 -> 284
    //   167: sipush 360
    //   170: iload_2
    //   171: isub
    //   172: sipush 360
    //   175: irem
    //   176: istore_1
    //   177: aload 4
    //   179: iload_1
    //   180: invokevirtual 270	android/hardware/Camera$Parameters:setRotation	(I)V
    //   183: aload 4
    //   185: aload_0
    //   186: getfield 30	org/vidogram/messenger/c/c:b	Ljava/lang/String;
    //   189: invokevirtual 273	android/hardware/Camera$Parameters:setFlashMode	(Ljava/lang/String;)V
    //   192: aload 5
    //   194: aload 4
    //   196: invokevirtual 277	android/hardware/Camera:setParameters	(Landroid/hardware/Camera$Parameters;)V
    //   199: return
    //   200: astore 4
    //   202: ldc_w 279
    //   205: aload 4
    //   207: invokestatic 284	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   210: aconst_null
    //   211: astore 4
    //   213: goto -179 -> 34
    //   216: aload 6
    //   218: getfield 112	android/hardware/Camera$CameraInfo:orientation	I
    //   221: bipush 90
    //   223: irem
    //   224: ifeq +9 -> 233
    //   227: aload 6
    //   229: iconst_0
    //   230: putfield 112	android/hardware/Camera$CameraInfo:orientation	I
    //   233: aload 6
    //   235: getfield 109	android/hardware/Camera$CameraInfo:facing	I
    //   238: iconst_1
    //   239: if_icmpne +26 -> 265
    //   242: sipush 360
    //   245: iload_1
    //   246: aload 6
    //   248: getfield 112	android/hardware/Camera$CameraInfo:orientation	I
    //   251: iadd
    //   252: sipush 360
    //   255: irem
    //   256: isub
    //   257: sipush 360
    //   260: irem
    //   261: istore_1
    //   262: goto -186 -> 76
    //   265: aload 6
    //   267: getfield 112	android/hardware/Camera$CameraInfo:orientation	I
    //   270: iload_1
    //   271: isub
    //   272: sipush 360
    //   275: iadd
    //   276: sipush 360
    //   279: irem
    //   280: istore_1
    //   281: goto -205 -> 76
    //   284: iload_2
    //   285: istore_1
    //   286: goto -109 -> 177
    //   289: astore 4
    //   291: ldc_w 279
    //   294: aload 4
    //   296: invokestatic 284	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   299: return
    //   300: astore 6
    //   302: goto -119 -> 183
    //   305: astore 4
    //   307: return
    //   308: iload_3
    //   309: istore_1
    //   310: iload_2
    //   311: tableswitch	default:+29 -> 340, 0:+-95->216, 1:+34->345, 2:+40->351, 3:+47->358
    //   341: istore_1
    //   342: goto -126 -> 216
    //   345: bipush 90
    //   347: istore_1
    //   348: goto -132 -> 216
    //   351: sipush 180
    //   354: istore_1
    //   355: goto -139 -> 216
    //   358: sipush 270
    //   361: istore_1
    //   362: goto -146 -> 216
    //
    // Exception table:
    //   from	to	target	type
    //   27	34	200	java/lang/Exception
    //   4	13	289	java/lang/Throwable
    //   18	27	289	java/lang/Throwable
    //   27	34	289	java/lang/Throwable
    //   34	76	289	java/lang/Throwable
    //   76	82	289	java/lang/Throwable
    //   87	158	289	java/lang/Throwable
    //   158	167	289	java/lang/Throwable
    //   177	183	289	java/lang/Throwable
    //   183	192	289	java/lang/Throwable
    //   192	199	289	java/lang/Throwable
    //   202	210	289	java/lang/Throwable
    //   216	233	289	java/lang/Throwable
    //   233	262	289	java/lang/Throwable
    //   265	281	289	java/lang/Throwable
    //   177	183	300	java/lang/Exception
    //   192	199	305	java/lang/Exception
  }

  protected void f()
  {
    this.e = false;
    e();
  }

  public void g()
  {
    this.i = false;
    if (this.c != null)
    {
      this.c.disable();
      this.c = null;
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.c.c
 * JD-Core Version:    0.6.0
 */