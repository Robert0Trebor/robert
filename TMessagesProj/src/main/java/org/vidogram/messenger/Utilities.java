package org.vidogram.messenger;

import B;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utilities
{
  public static Pattern a = Pattern.compile("[\\-0-9]+");
  public static SecureRandom b = new SecureRandom();
  public static volatile h c = new h("stageQueue");
  public static volatile h d = new h("globalQueue");
  public static volatile h e = new h("searchQueue");
  public static volatile h f = new h("photoBookQueue");
  protected static final char[] g = "0123456789ABCDEF".toCharArray();

  static
  {
    try
    {
      FileInputStream localFileInputStream = new FileInputStream(new File("/dev/urandom"));
      byte[] arrayOfByte = new byte[1024];
      localFileInputStream.read(arrayOfByte);
      localFileInputStream.close();
      b.setSeed(arrayOfByte);
      return;
    }
    catch (Exception localException)
    {
      n.a("tmessages", localException);
    }
  }

  public static Integer a(String paramString)
  {
    if (paramString == null)
      paramString = Integer.valueOf(0);
    Integer localInteger;
    while (true)
    {
      return paramString;
      localInteger = Integer.valueOf(0);
      try
      {
        Matcher localMatcher = a.matcher(paramString);
        paramString = localInteger;
        if (!localMatcher.find())
          continue;
        int i = Integer.parseInt(localMatcher.group(0));
        return Integer.valueOf(i);
      }
      catch (Exception paramString)
      {
        n.a("tmessages", paramString);
      }
    }
    return localInteger;
  }

  public static String a(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null)
      return "";
    char[] arrayOfChar = new char[paramArrayOfByte.length * 2];
    int i = 0;
    while (i < paramArrayOfByte.length)
    {
      int j = paramArrayOfByte[i] & 0xFF;
      arrayOfChar[(i * 2)] = g[(j >>> 4)];
      arrayOfChar[(i * 2 + 1)] = g[(j & 0xF)];
      i += 1;
    }
    return new String(arrayOfChar);
  }

  public static void a(ByteBuffer paramByteBuffer, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2)
  {
    if (paramBoolean2);
    while (true)
    {
      aesIgeEncryption(paramByteBuffer, paramArrayOfByte1, paramArrayOfByte2, paramBoolean1, paramInt1, paramInt2);
      return;
      paramArrayOfByte2 = (byte[])paramArrayOfByte2.clone();
    }
  }

  public static byte[] a(ByteBuffer paramByteBuffer)
  {
    return a(paramByteBuffer, 0, paramByteBuffer.limit());
  }

  public static byte[] a(ByteBuffer paramByteBuffer, int paramInt1, int paramInt2)
  {
    int i = paramByteBuffer.position();
    int j = paramByteBuffer.limit();
    try
    {
      Object localObject1 = MessageDigest.getInstance("SHA-1");
      paramByteBuffer.position(paramInt1);
      paramByteBuffer.limit(paramInt2);
      ((MessageDigest)localObject1).update(paramByteBuffer);
      localObject1 = ((MessageDigest)localObject1).digest();
      return localObject1;
    }
    catch (Exception localException)
    {
      n.a("tmessages", localException);
      return new byte[20];
    }
    finally
    {
      paramByteBuffer.limit(j);
      paramByteBuffer.position(i);
    }
    throw localObject2;
  }

  public static byte[] a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    try
    {
      MessageDigest localMessageDigest = MessageDigest.getInstance("SHA-1");
      localMessageDigest.update(paramArrayOfByte, paramInt1, paramInt2);
      paramArrayOfByte = localMessageDigest.digest();
      return paramArrayOfByte;
    }
    catch (Exception paramArrayOfByte)
    {
      n.a("tmessages", paramArrayOfByte);
    }
    return new byte[20];
  }

  private static native void aesIgeEncryption(ByteBuffer paramByteBuffer, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, boolean paramBoolean, int paramInt1, int paramInt2);

  public static Long b(String paramString)
  {
    if (paramString == null)
      paramString = Long.valueOf(0L);
    Long localLong;
    while (true)
    {
      return paramString;
      localLong = Long.valueOf(0L);
      try
      {
        Matcher localMatcher = a.matcher(paramString);
        paramString = localLong;
        if (!localMatcher.find())
          continue;
        long l = Long.parseLong(localMatcher.group(0));
        return Long.valueOf(l);
      }
      catch (Exception paramString)
      {
        n.a("tmessages", paramString);
      }
    }
    return localLong;
  }

  public static byte[] b(byte[] paramArrayOfByte)
  {
    return a(paramArrayOfByte, 0, paramArrayOfByte.length);
  }

  public static byte[] b(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    try
    {
      MessageDigest localMessageDigest = MessageDigest.getInstance("SHA-256");
      localMessageDigest.update(paramArrayOfByte, paramInt1, paramInt2);
      paramArrayOfByte = localMessageDigest.digest();
      return paramArrayOfByte;
    }
    catch (Exception paramArrayOfByte)
    {
      n.a("tmessages", paramArrayOfByte);
    }
    return null;
  }

  public static native void blurBitmap(Object paramObject, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5);

  public static String c(String paramString)
  {
    paramString = a.matcher(paramString);
    if (paramString.find())
      return paramString.group(0);
    return null;
  }

  public static native void calcCDT(ByteBuffer paramByteBuffer1, int paramInt1, int paramInt2, ByteBuffer paramByteBuffer2);

  public static native int convertVideoFrame(ByteBuffer paramByteBuffer1, ByteBuffer paramByteBuffer2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5);

  public static byte[] d(String paramString)
  {
    Object localObject;
    if (paramString == null)
    {
      localObject = null;
      return localObject;
    }
    int j = paramString.length();
    byte[] arrayOfByte = new byte[j / 2];
    int i = 0;
    while (true)
    {
      localObject = arrayOfByte;
      if (i >= j)
        break;
      arrayOfByte[(i / 2)] = (byte)((Character.digit(paramString.charAt(i), 16) << 4) + Character.digit(paramString.charAt(i + 1), 16));
      i += 2;
    }
  }

  public static String e(String paramString)
  {
    if (paramString == null)
      return null;
    try
    {
      paramString = MessageDigest.getInstance("MD5").digest(paramString.getBytes());
      StringBuilder localStringBuilder = new StringBuilder();
      int i = 0;
      while (i < paramString.length)
      {
        localStringBuilder.append(Integer.toHexString(paramString[i] & 0xFF | 0x100).substring(1, 3));
        i += 1;
      }
      paramString = localStringBuilder.toString();
      return paramString;
    }
    catch (java.security.NoSuchAlgorithmException paramString)
    {
      n.a("tmessages", paramString);
    }
    return null;
  }

  public static native boolean loadWebpImage(Bitmap paramBitmap, ByteBuffer paramByteBuffer, int paramInt, BitmapFactory.Options paramOptions, boolean paramBoolean);

  public static native int pinBitmap(Bitmap paramBitmap);

  public static native String readlink(String paramString);
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.Utilities
 * JD-Core Version:    0.6.0
 */