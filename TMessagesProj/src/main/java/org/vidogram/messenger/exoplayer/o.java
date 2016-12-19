package org.vidogram.messenger.exoplayer;

import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecList;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.vidogram.messenger.exoplayer.f.r;

@TargetApi(16)
public final class o
{
  private static final e a = new e("OMX.google.raw.decoder", null);
  private static final Map<a, List<e>> b = new HashMap();
  private static int c = -1;

  private static List<e> a(a parama, c paramc)
  {
    while (true)
    {
      int i;
      String str2;
      int j;
      String str3;
      try
      {
        ArrayList localArrayList = new ArrayList();
        String str1 = parama.a;
        int k = paramc.a();
        boolean bool1 = paramc.b();
        i = 0;
        if (i >= k)
          continue;
        MediaCodecInfo localMediaCodecInfo = paramc.a(i);
        str2 = localMediaCodecInfo.getName();
        if (!a(localMediaCodecInfo, str2, bool1))
          break label335;
        String[] arrayOfString = localMediaCodecInfo.getSupportedTypes();
        int m = arrayOfString.length;
        j = 0;
        if (j >= m)
          break label335;
        str3 = arrayOfString[j];
        boolean bool2 = str3.equalsIgnoreCase(str1);
        if (!bool2)
          break label342;
        try
        {
          MediaCodecInfo.CodecCapabilities localCodecCapabilities = localMediaCodecInfo.getCapabilitiesForType(str3);
          bool2 = paramc.a(str1, localCodecCapabilities);
          if (((!bool1) || (parama.b != bool2)) && ((bool1) || (parama.b)))
            continue;
          localArrayList.add(new e(str2, localCodecCapabilities));
          break label342;
          if ((bool1) || (!bool2))
            break label342;
          localArrayList.add(new e(str2 + ".secure", localCodecCapabilities));
          return localArrayList;
        }
        catch (Exception localException)
        {
          if (r.a > 23)
            break label291;
        }
        if (!localArrayList.isEmpty())
          Log.e("MediaCodecUtil", "Skipping codec " + str2 + " (failed to query capabilities)");
      }
      catch (Exception parama)
      {
        throw new b(parama, null);
      }
      label291: Log.e("MediaCodecUtil", "Failed to query codec " + str2 + " (" + str3 + ")");
      throw localException;
      label335: i += 1;
      continue;
      label342: j += 1;
    }
  }

  public static e a()
  {
    return a;
  }

  public static e a(String paramString, boolean paramBoolean)
  {
    paramString = b(paramString, paramBoolean);
    if (paramString.isEmpty())
      return null;
    return (e)paramString.get(0);
  }

  private static boolean a(MediaCodecInfo paramMediaCodecInfo, String paramString, boolean paramBoolean)
  {
    if ((paramMediaCodecInfo.isEncoder()) || ((!paramBoolean) && (paramString.endsWith(".secure"))));
    do
      return false;
    while (((r.a < 21) && (("CIPAACDecoder".equals(paramString)) || ("CIPMP3Decoder".equals(paramString)) || ("CIPVorbisDecoder".equals(paramString)) || ("AACDecoder".equals(paramString)) || ("MP3Decoder".equals(paramString)))) || ((r.a < 18) && ("OMX.SEC.MP3.Decoder".equals(paramString))) || ((r.a < 18) && ("OMX.MTK.AUDIO.DECODER.AAC".equals(paramString)) && ("a70".equals(r.b))) || ((r.a == 16) && (r.b != null) && ("OMX.qcom.audio.decoder.mp3".equals(paramString)) && (("dlxu".equals(r.b)) || ("protou".equals(r.b)) || ("ville".equals(r.b)) || ("villeplus".equals(r.b)) || ("villec2".equals(r.b)) || (r.b.startsWith("gee")) || ("C6602".equals(r.b)) || ("C6603".equals(r.b)) || ("C6606".equals(r.b)) || ("C6616".equals(r.b)) || ("L36h".equals(r.b)) || ("SO-02E".equals(r.b)))) || ((r.a == 16) && ("OMX.qcom.audio.decoder.aac".equals(paramString)) && (("C1504".equals(r.b)) || ("C1505".equals(r.b)) || ("C1604".equals(r.b)) || ("C1605".equals(r.b)))) || ((r.a <= 19) && (r.b != null) && ((r.b.startsWith("d2")) || (r.b.startsWith("serrano")) || (r.b.startsWith("jflte")) || (r.b.startsWith("santos"))) && ("samsung".equals(r.c)) && (paramString.equals("OMX.SEC.vp8.dec"))) || ((r.a <= 19) && (r.b != null) && (r.b.startsWith("jflte")) && ("OMX.qcom.video.decoder.vp8".equals(paramString))));
    return true;
  }

  public static List<e> b(String paramString, boolean paramBoolean)
  {
    monitorenter;
    label210: 
    while (true)
    {
      try
      {
        a locala = new a(paramString, paramBoolean);
        localObject = (List)b.get(locala);
        if (localObject == null)
          continue;
        paramString = (String)localObject;
        return paramString;
        if (r.a >= 21)
        {
          localObject = new e(paramBoolean);
          List localList = a(locala, (c)localObject);
          localObject = localList;
          if (!paramBoolean)
            continue;
          localObject = localList;
          if (!localList.isEmpty())
            continue;
          localObject = localList;
          if (21 > r.a)
            continue;
          localObject = localList;
          if (r.a > 23)
            continue;
          localObject = a(locala, new d(null));
          if (((List)localObject).isEmpty())
            break label210;
          Log.w("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + paramString + ". Assuming: " + ((e)((List)localObject).get(0)).a);
          break label210;
          paramString = Collections.unmodifiableList((List)localObject);
          b.put(locala, paramString);
          continue;
        }
      }
      finally
      {
        monitorexit;
      }
      Object localObject = new d(null);
      continue;
    }
  }

  private static final class a
  {
    public final String a;
    public final boolean b;

    public a(String paramString, boolean paramBoolean)
    {
      this.a = paramString;
      this.b = paramBoolean;
    }

    public boolean equals(Object paramObject)
    {
      if (this == paramObject);
      do
      {
        return true;
        if ((paramObject == null) || (paramObject.getClass() != a.class))
          return false;
        paramObject = (a)paramObject;
      }
      while ((TextUtils.equals(this.a, paramObject.a)) && (this.b == paramObject.b));
      return false;
    }

    public int hashCode()
    {
      int i;
      if (this.a == null)
      {
        i = 0;
        if (!this.b)
          break label41;
      }
      label41: for (int j = 1231; ; j = 1237)
      {
        return j + (i + 31) * 31;
        i = this.a.hashCode();
        break;
      }
    }
  }

  public static class b extends IOException
  {
    private b(Throwable paramThrowable)
    {
      super(paramThrowable);
    }
  }

  private static abstract interface c
  {
    public abstract int a();

    public abstract MediaCodecInfo a(int paramInt);

    public abstract boolean a(String paramString, MediaCodecInfo.CodecCapabilities paramCodecCapabilities);

    public abstract boolean b();
  }

  private static final class d
    implements o.c
  {
    public int a()
    {
      return MediaCodecList.getCodecCount();
    }

    public MediaCodecInfo a(int paramInt)
    {
      return MediaCodecList.getCodecInfoAt(paramInt);
    }

    public boolean a(String paramString, MediaCodecInfo.CodecCapabilities paramCodecCapabilities)
    {
      return "video/avc".equals(paramString);
    }

    public boolean b()
    {
      return false;
    }
  }

  @TargetApi(21)
  private static final class e
    implements o.c
  {
    private final int a;
    private MediaCodecInfo[] b;

    public e(boolean paramBoolean)
    {
      if (paramBoolean);
      for (int i = 1; ; i = 0)
      {
        this.a = i;
        return;
      }
    }

    private void c()
    {
      if (this.b == null)
        this.b = new MediaCodecList(this.a).getCodecInfos();
    }

    public int a()
    {
      c();
      return this.b.length;
    }

    public MediaCodecInfo a(int paramInt)
    {
      c();
      return this.b[paramInt];
    }

    public boolean a(String paramString, MediaCodecInfo.CodecCapabilities paramCodecCapabilities)
    {
      return paramCodecCapabilities.isFeatureSupported("secure-playback");
    }

    public boolean b()
    {
      return true;
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.exoplayer.o
 * JD-Core Version:    0.6.0
 */