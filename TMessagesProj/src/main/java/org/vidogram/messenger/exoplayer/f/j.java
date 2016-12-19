package org.vidogram.messenger.exoplayer.f;

public final class j
{
  private static final String[] h = { "audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg" };
  private static final int[] i = { 44100, 48000, 32000 };
  private static final int[] j = { 32, 64, 96, 128, 160, 192, 224, 256, 288, 320, 352, 384, 416, 448 };
  private static final int[] k = { 32, 48, 56, 64, 80, 96, 112, 128, 144, 160, 176, 192, 224, 256 };
  private static final int[] l = { 32, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384 };
  private static final int[] m = { 32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320 };
  private static final int[] n = { 8, 16, 24, 32, 40, 48, 56, 64, 80, 96, 112, 128, 144, 160 };
  public int a;
  public String b;
  public int c;
  public int d;
  public int e;
  public int f;
  public int g;

  public static int a(int paramInt)
  {
    if ((paramInt & 0xFFE00000) != -2097152);
    int i2;
    int i3;
    int i5;
    do
    {
      do
      {
        do
        {
          do
          {
            return -1;
            i2 = paramInt >>> 19 & 0x3;
          }
          while (i2 == 1);
          i3 = paramInt >>> 17 & 0x3;
        }
        while (i3 == 0);
        i5 = paramInt >>> 12 & 0xF;
      }
      while ((i5 == 0) || (i5 == 15));
      i1 = paramInt >>> 10 & 0x3;
    }
    while (i1 == 3);
    int i1 = i[i1];
    if (i2 == 2)
      i1 /= 2;
    label226: 
    while (true)
    {
      int i4 = paramInt >>> 9 & 0x1;
      if (i3 == 3)
      {
        if (i2 == 3);
        for (paramInt = j[(i5 - 1)]; ; paramInt = k[(i5 - 1)])
        {
          return (paramInt * 12000 / i1 + i4) * 4;
          if (i2 != 0)
            break label226;
          i1 /= 4;
          break;
        }
      }
      if (i2 == 3)
        if (i3 == 2)
          paramInt = l[(i5 - 1)];
      while (i2 == 3)
      {
        return 144000 * paramInt / i1 + i4;
        paramInt = m[(i5 - 1)];
        continue;
        paramInt = n[(i5 - 1)];
      }
      if (i3 == 1);
      for (i2 = 72000; ; i2 = 144000)
        return i2 * paramInt / i1 + i4;
    }
  }

  private void a(int paramInt1, String paramString, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    this.a = paramInt1;
    this.b = paramString;
    this.c = paramInt2;
    this.d = paramInt3;
    this.e = paramInt4;
    this.f = paramInt5;
    this.g = paramInt6;
  }

  public static boolean a(int paramInt, j paramj)
  {
    int i5 = 2;
    if ((paramInt & 0xFFE00000) != -2097152)
      return false;
    int i7 = paramInt >>> 19 & 0x3;
    if (i7 == 1)
      return false;
    int i8 = paramInt >>> 17 & 0x3;
    if (i8 == 0)
      return false;
    int i3 = paramInt >>> 12 & 0xF;
    if ((i3 == 0) || (i3 == 15))
      return false;
    int i1 = paramInt >>> 10 & 0x3;
    if (i1 == 3)
      return false;
    int i2 = i[i1];
    int i6;
    if (i7 == 2)
    {
      i1 = i2 / 2;
      i6 = paramInt >>> 9 & 0x1;
      if (i8 != 3)
        break label219;
      if (i7 != 3)
        break label206;
    }
    label206: for (i3 = j[(i3 - 1)]; ; i3 = k[(i3 - 1)])
    {
      i4 = (i3 * 12000 / i1 + i6) * 4;
      i2 = 384;
      String str = h[(3 - i8)];
      if ((paramInt >> 6 & 0x3) == 3)
        i5 = 1;
      paramj.a(i7, str, i4, i1, i5, i3 * 1000, i2);
      return true;
      i1 = i2;
      if (i7 != 0)
        break;
      i1 = i2 / 4;
      break;
    }
    label219: if (i7 == 3)
    {
      if (i8 == 2);
      for (i3 = l[(i3 - 1)]; ; i3 = m[(i3 - 1)])
      {
        i2 = 1152;
        i4 = i6 + 144000 * i3 / i1;
        break;
      }
    }
    int i4 = n[(i3 - 1)];
    if (i8 == 1)
    {
      i2 = 576;
      label293: if (i8 != 1)
        break label333;
    }
    label333: for (i3 = 72000; ; i3 = 144000)
    {
      i6 += i3 * i4 / i1;
      i3 = i4;
      i4 = i6;
      break;
      i2 = 1152;
      break label293;
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.exoplayer.f.j
 * JD-Core Version:    0.6.0
 */