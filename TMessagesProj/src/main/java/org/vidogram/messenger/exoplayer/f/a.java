package org.vidogram.messenger.exoplayer.f;

import java.nio.ByteBuffer;
import org.vidogram.messenger.exoplayer.MediaFormat;

public final class a
{
  private static final int[] a = { 1, 2, 3, 6 };
  private static final int[] b = { 48000, 44100, 32000 };
  private static final int[] c = { 24000, 22050, 16000 };
  private static final int[] d = { 2, 1, 2, 3, 3, 4, 4, 5 };
  private static final int[] e = { 32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640 };
  private static final int[] f = { 69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393 };

  public static int a()
  {
    return 1536;
  }

  private static int a(int paramInt1, int paramInt2)
  {
    paramInt1 = b[paramInt1];
    if (paramInt1 == 44100)
      return (f[(paramInt2 / 2)] + paramInt2 % 2) * 2;
    paramInt2 = e[(paramInt2 / 2)];
    if (paramInt1 == 32000)
      return paramInt2 * 6;
    return paramInt2 * 4;
  }

  public static int a(ByteBuffer paramByteBuffer)
  {
    if ((paramByteBuffer.get(paramByteBuffer.position() + 4) & 0xC0) >> 6 == 3);
    for (int i = 6; ; i = a[((paramByteBuffer.get(paramByteBuffer.position() + 4) & 0x30) >> 4)])
      return i * 256;
  }

  public static int a(byte[] paramArrayOfByte)
  {
    return a((paramArrayOfByte[4] & 0xC0) >> 6, paramArrayOfByte[4] & 0x3F);
  }

  public static MediaFormat a(l paraml, String paramString1, long paramLong, String paramString2)
  {
    int i = 1;
    paraml.b(32);
    int j = paraml.c(2);
    paraml.b(14);
    int k = paraml.c(3);
    if (((k & 0x1) != 0) && (k != 1))
      paraml.b(2);
    if ((k & 0x4) != 0)
      paraml.b(2);
    if (k == 2)
      paraml.b(2);
    boolean bool = paraml.b();
    k = d[k];
    if (bool);
    while (true)
    {
      return MediaFormat.a(paramString1, "audio/ac3", -1, -1, paramLong, k + i, b[j], null, paramString2);
      i = 0;
    }
  }

  public static MediaFormat a(m paramm, String paramString1, long paramLong, String paramString2)
  {
    int i = paramm.f();
    int k = b[((i & 0xC0) >> 6)];
    int m = paramm.f();
    int j = d[((m & 0x38) >> 3)];
    i = j;
    if ((m & 0x4) != 0)
      i = j + 1;
    return MediaFormat.a(paramString1, "audio/ac3", -1, -1, paramLong, i, k, null, paramString2);
  }

  public static int b(byte[] paramArrayOfByte)
  {
    return (((paramArrayOfByte[2] & 0x7) << 8) + (paramArrayOfByte[3] & 0xFF) + 1) * 2;
  }

  public static MediaFormat b(l paraml, String paramString1, long paramLong, String paramString2)
  {
    paraml.b(32);
    int i = paraml.c(2);
    int k;
    if (i == 3)
    {
      i = c[paraml.c(2)];
      j = paraml.c(3);
      boolean bool = paraml.b();
      k = d[j];
      if (!bool)
        break label95;
    }
    label95: for (int j = 1; ; j = 0)
    {
      return MediaFormat.a(paramString1, "audio/eac3", -1, -1, paramLong, k + j, i, null, paramString2);
      paraml.b(2);
      i = b[i];
      break;
    }
  }

  public static MediaFormat b(m paramm, String paramString1, long paramLong, String paramString2)
  {
    paramm.c(2);
    int i = paramm.f();
    int k = b[((i & 0xC0) >> 6)];
    int m = paramm.f();
    int j = d[((m & 0xE) >> 1)];
    i = j;
    if ((m & 0x1) != 0)
      i = j + 1;
    return MediaFormat.a(paramString1, "audio/eac3", -1, -1, paramLong, i, k, null, paramString2);
  }

  public static int c(byte[] paramArrayOfByte)
  {
    if ((paramArrayOfByte[4] & 0xC0) >> 6 == 3);
    for (int i = 6; ; i = a[((paramArrayOfByte[4] & 0x30) >> 4)])
      return i * 256;
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.exoplayer.f.a
 * JD-Core Version:    0.6.0
 */