package org.vidogram.messenger;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.Spannable;
import android.text.Spannable.Factory;
import android.text.TextPaint;
import android.text.style.ImageSpan;
import java.lang.reflect.Array;
import java.util.HashMap;

public class j
{
  private static HashMap<CharSequence, a> a = new HashMap();
  private static int b;
  private static int c;
  private static boolean d = false;
  private static Paint e;
  private static Bitmap[][] f = (Bitmap[][])Array.newInstance(Bitmap.class, new int[] { 5, 4 });
  private static boolean[][] g = (boolean[][])Array.newInstance(Boolean.TYPE, new int[] { 5, 4 });
  private static final int[][] h;

  static
  {
    Object localObject = { 9, 9, 9, 9 };
    int[] arrayOfInt = { 8, 8, 8, 7 };
    h = new int[][] { { 12, 12, 12, 12 }, { 6, 6, 6, 6 }, localObject, { 9, 9, 9, 9 }, arrayOfInt };
    int j = 2;
    int i;
    float f1;
    label236: int k;
    if (a.b <= 1.0F)
    {
      i = 32;
      j = 1;
      b = a.a(20.0F);
      if (!a.c())
        break label451;
      f1 = 40.0F;
      c = a.a(f1);
      k = 0;
    }
    while (true)
    {
      if (k >= k.e.length)
        break label464;
      int n = (int)Math.ceil(k.e[k].length / 4.0F);
      int m = 0;
      while (true)
        if (m < k.e[k].length)
        {
          int i1 = m / n;
          int i3 = m - i1 * n;
          int i2 = i3 % h[k][i1];
          i3 /= h[k][i1];
          localObject = new Rect(i2 * i + i2 * j, i3 * i + i3 * j, i2 * j + (i2 + 1) * i, i3 * j + (i3 + 1) * i);
          a.put(k.e[k][m], new a((Rect)localObject, (byte)k, (byte)i1, m));
          m += 1;
          continue;
          if (a.b <= 1.5F)
          {
            i = 64;
            break;
          }
          if (a.b <= 2.0F)
          {
            i = 64;
            break;
          }
          i = 64;
          break;
          label451: f1 = 32.0F;
          break label236;
        }
      k += 1;
    }
    label464: e = new Paint();
    e.setColor(0);
  }

  public static CharSequence a(CharSequence paramCharSequence, Paint.FontMetricsInt paramFontMetricsInt, int paramInt, boolean paramBoolean)
  {
    return a(paramCharSequence, paramFontMetricsInt, paramInt, paramBoolean, null);
  }

  public static CharSequence a(CharSequence paramCharSequence, Paint.FontMetricsInt paramFontMetricsInt, int paramInt, boolean paramBoolean, int[] paramArrayOfInt)
  {
    if ((v.a().A) || (paramCharSequence == null) || (paramCharSequence.length() == 0))
      return paramCharSequence;
    Spannable localSpannable;
    long l;
    int i2;
    int i1;
    int k;
    int i4;
    StringBuilder localStringBuilder;
    int i9;
    int m;
    int n;
    if ((!paramBoolean) && ((paramCharSequence instanceof Spannable)))
    {
      localSpannable = (Spannable)paramCharSequence;
      l = 0L;
      i2 = 0;
      i1 = -1;
      k = 0;
      i4 = 0;
      localStringBuilder = new StringBuilder(16);
      i9 = paramCharSequence.length();
      m = 0;
      n = 0;
      if (n >= i9)
        break label831;
    }
    while (true)
    {
      int j;
      char c1;
      try
      {
        int i = paramCharSequence.charAt(n);
        if (i < 55356)
          break label897;
        if (i <= 55358)
          break label942;
        break label897;
        localStringBuilder.append(i);
        k += 1;
        l = l << 16 | i;
        i1 = i3;
        break label959;
        if (i6 >= 3)
          break label1120;
        i5 = k;
        i7 = i4;
        i3 = m;
        if (k + 1 >= i9)
          continue;
        j = paramCharSequence.charAt(k + 1);
        if (i6 != 1)
          break label1063;
        i5 = k;
        i7 = i4;
        i3 = m;
        if (j != 8205)
          continue;
        i5 = k;
        i7 = i4;
        i3 = m;
        if (localStringBuilder.length() <= 0)
          continue;
        localStringBuilder.append(j);
        i5 = k + 1;
        i3 = m + 1;
        i7 = 0;
        i6 += 1;
        k = i5;
        i4 = i7;
        m = i3;
        continue;
        localSpannable = Spannable.Factory.getInstance().newSpannable(paramCharSequence.toString());
        break;
        if ((localStringBuilder.length() <= 0) || ((j != 9792) && (j != 9794)))
          continue;
        localStringBuilder.append(j);
        k += 1;
        l = 0L;
        m = 1;
        break label959;
        if ((l <= 0L) || ((0xF000 & j) != 53248))
          continue;
        localStringBuilder.append(j);
        k += 1;
        l = 0L;
        m = 1;
        break label959;
        if (j != 8419)
          break label1005;
        if (n <= 0)
          break label887;
        c1 = paramCharSequence.charAt(i4);
        if ((c1 < '0') || (c1 > '9'))
          break label981;
        label420: k = n - i4 + 1;
        localStringBuilder.append(c1);
        localStringBuilder.append(j);
        m = 1;
        break label998;
        label451: if (!k.g.containsKey(Character.valueOf(j)))
          continue;
        i3 = i1;
        if (i1 != -1)
          continue;
        i3 = n;
        k += 1;
        localStringBuilder.append(j);
        m = 1;
        i1 = i3;
        break label959;
        label503: if (i1 == -1)
          break label1040;
        localStringBuilder.setLength(0);
        i1 = -1;
        k = 0;
        m = 0;
        break label959;
        if ((k + 2 < i9) && (paramCharSequence.charAt(k + 1) == 55356) && (paramCharSequence.charAt(k + 2) >= 57339) && (paramCharSequence.charAt(k + 2) <= 57343))
        {
          localStringBuilder.append(paramCharSequence.subSequence(k + 1, k + 3));
          k += 2;
          i3 = m + 2;
          m = k;
          k = m;
          i4 = i3;
          if (m + 2 >= i9)
            continue;
          k = m;
          i4 = i3;
          if (paramCharSequence.charAt(m + 1) != '‍')
            continue;
          if (paramCharSequence.charAt(m + 2) == '♀')
            continue;
          k = m;
          i4 = i3;
          if (paramCharSequence.charAt(m + 2) != '♂')
            continue;
          localStringBuilder.append(paramCharSequence.subSequence(m + 1, m + 3));
          i4 = i3 + 2;
          k = m + 2;
          b localb = a(localStringBuilder.subSequence(0, localStringBuilder.length()));
          m = i2;
          if (localb == null)
            continue;
          localSpannable.setSpan(new c(localb, 0, paramInt, paramFontMetricsInt), i1, i4 + i1, 33);
          m = i2 + 1;
          i5 = 0;
          i3 = -1;
          localStringBuilder.setLength(0);
          i6 = 0;
          i7 = m;
          i8 = k;
          k = Build.VERSION.SDK_INT;
          if ((k < 23) && (i7 >= 50))
            label831: return localSpannable;
          m = i6;
          k = i5;
          i5 = i8 + 1;
          i4 = n;
          i1 = i3;
          i2 = i7;
          n = i5;
        }
      }
      catch (java.lang.Exception paramFontMetricsInt)
      {
        n.a("tmessages", paramFontMetricsInt);
        return paramCharSequence;
      }
      int i3 = m;
      m = k;
      continue;
      label887: break label959;
      label890: i4 = i1;
      break label998;
      label897: if ((l == 0L) || ((0x0 & l) != 0L) || ((0xFFFF & l) != 55356L) || (j < 56806) || (j > 56831))
        continue;
      label942: i3 = i1;
      if (i1 != -1)
        continue;
      i3 = n;
      continue;
      while (true)
      {
        label959: i6 = 0;
        i3 = k;
        k = n;
        i4 = m;
        m = i3;
        break;
        label981: if (c1 == '#')
          break label420;
        if (c1 != '*')
          break label890;
        break label420;
        label998: i1 = i4;
        continue;
        label1005: if ((j == 169) || (j == 174))
          break label451;
        if ((j < 8252) || (j > 12953))
          break label503;
        break label451;
        label1040: if ((j == 65039) || (paramArrayOfInt == null))
          break label887;
        paramArrayOfInt[0] = 0;
        paramArrayOfInt = null;
      }
      label1063: int i5 = k;
      int i7 = i4;
      i3 = m;
      if (j < 65024)
        continue;
      i5 = k;
      i7 = i4;
      i3 = m;
      if (j > 65039)
        continue;
      i5 = k + 1;
      i3 = m + 1;
      i7 = i4;
      continue;
      label1120: int i8 = k;
      int i6 = i4;
      i3 = i1;
      i5 = m;
      i7 = i2;
      if (i4 == 0)
        continue;
      if (paramArrayOfInt == null)
        continue;
      paramArrayOfInt[0] += 1;
    }
  }

  public static String a(String paramString)
  {
    int n = paramString.length();
    int k = 0;
    String str = paramString;
    int i;
    int j;
    int m;
    if (k < n)
    {
      i = str.charAt(k);
      if ((i >= 55356) && (i <= 55358))
        if ((i == 55356) && (k < n - 1))
        {
          j = str.charAt(k + 1);
          if ((j == 56879) || (j == 56324) || (j == 56858) || (j == 56703))
          {
            paramString = str.substring(0, k + 2) + "️" + str.substring(k + 2);
            m = n + 1;
            j = k + 2;
          }
        }
    }
    while (true)
    {
      k = j + 1;
      n = m;
      str = paramString;
      break;
      j = k + 1;
      m = n;
      paramString = str;
      continue;
      j = k + 1;
      m = n;
      paramString = str;
      continue;
      if (i == 8419)
        return str;
      j = k;
      m = n;
      paramString = str;
      if (i < 8252)
        continue;
      j = k;
      m = n;
      paramString = str;
      if (i > 12953)
        continue;
      j = k;
      m = n;
      paramString = str;
      if (!k.f.containsKey(Character.valueOf(i)))
        continue;
      paramString = str.substring(0, k + 1) + "️" + str.substring(k + 1);
      m = n + 1;
      j = k + 1;
    }
  }

  public static b a(CharSequence paramCharSequence)
  {
    a locala = (a)a.get(paramCharSequence);
    if (locala == null)
    {
      n.a("tmessages", "No drawable for emoji " + paramCharSequence);
      return null;
    }
    paramCharSequence = new b(locala);
    paramCharSequence.setBounds(0, 0, b, b);
    return paramCharSequence;
  }

  public static Drawable b(String paramString)
  {
    paramString = a(paramString);
    if (paramString == null)
      return null;
    paramString.setBounds(0, 0, c, c);
    b.a(paramString, true);
    return paramString;
  }

  // ERROR //
  private static void b(int paramInt1, int paramInt2)
  {
    // Byte code:
    //   0: iconst_2
    //   1: istore_3
    //   2: getstatic 70	org/vidogram/messenger/a:b	F
    //   5: fstore_2
    //   6: fload_2
    //   7: fconst_1
    //   8: fcmpg
    //   9: ifgt +144 -> 153
    //   12: iconst_4
    //   13: istore 4
    //   15: iload 4
    //   17: bipush 7
    //   19: if_icmpge +168 -> 187
    //   22: getstatic 287	java/util/Locale:US	Ljava/util/Locale;
    //   25: ldc_w 289
    //   28: iconst_3
    //   29: anewarray 4	java/lang/Object
    //   32: dup
    //   33: iconst_0
    //   34: iload 4
    //   36: invokestatic 294	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   39: aastore
    //   40: dup
    //   41: iconst_1
    //   42: fconst_2
    //   43: invokestatic 299	java/lang/Float:valueOf	(F)Ljava/lang/Float;
    //   46: aastore
    //   47: dup
    //   48: iconst_2
    //   49: iload_0
    //   50: invokestatic 294	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   53: aastore
    //   54: invokestatic 303	java/lang/String:format	(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   57: astore 5
    //   59: getstatic 308	org/vidogram/messenger/ApplicationLoader:a	Landroid/content/Context;
    //   62: aload 5
    //   64: invokevirtual 314	android/content/Context:getFileStreamPath	(Ljava/lang/String;)Ljava/io/File;
    //   67: astore 5
    //   69: aload 5
    //   71: invokevirtual 319	java/io/File:exists	()Z
    //   74: ifeq +9 -> 83
    //   77: aload 5
    //   79: invokevirtual 322	java/io/File:delete	()Z
    //   82: pop
    //   83: getstatic 287	java/util/Locale:US	Ljava/util/Locale;
    //   86: ldc_w 324
    //   89: iconst_3
    //   90: anewarray 4	java/lang/Object
    //   93: dup
    //   94: iconst_0
    //   95: iload 4
    //   97: invokestatic 294	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   100: aastore
    //   101: dup
    //   102: iconst_1
    //   103: fconst_2
    //   104: invokestatic 299	java/lang/Float:valueOf	(F)Ljava/lang/Float;
    //   107: aastore
    //   108: dup
    //   109: iconst_2
    //   110: iload_0
    //   111: invokestatic 294	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   114: aastore
    //   115: invokestatic 303	java/lang/String:format	(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   118: astore 5
    //   120: getstatic 308	org/vidogram/messenger/ApplicationLoader:a	Landroid/content/Context;
    //   123: aload 5
    //   125: invokevirtual 314	android/content/Context:getFileStreamPath	(Ljava/lang/String;)Ljava/io/File;
    //   128: astore 5
    //   130: aload 5
    //   132: invokevirtual 319	java/io/File:exists	()Z
    //   135: ifeq +9 -> 144
    //   138: aload 5
    //   140: invokevirtual 322	java/io/File:delete	()Z
    //   143: pop
    //   144: iload 4
    //   146: iconst_1
    //   147: iadd
    //   148: istore 4
    //   150: goto -135 -> 15
    //   153: getstatic 70	org/vidogram/messenger/a:b	F
    //   156: ldc 107
    //   158: fcmpg
    //   159: ifgt +8 -> 167
    //   162: iconst_1
    //   163: istore_3
    //   164: goto -152 -> 12
    //   167: getstatic 70	org/vidogram/messenger/a:b	F
    //   170: fstore_2
    //   171: fload_2
    //   172: fconst_2
    //   173: fcmpg
    //   174: ifgt +8 -> 182
    //   177: iconst_1
    //   178: istore_3
    //   179: goto -167 -> 12
    //   182: iconst_1
    //   183: istore_3
    //   184: goto -172 -> 12
    //   187: bipush 8
    //   189: istore 4
    //   191: iload 4
    //   193: bipush 10
    //   195: if_icmpge +82 -> 277
    //   198: getstatic 287	java/util/Locale:US	Ljava/util/Locale;
    //   201: ldc_w 326
    //   204: iconst_3
    //   205: anewarray 4	java/lang/Object
    //   208: dup
    //   209: iconst_0
    //   210: iload 4
    //   212: invokestatic 294	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   215: aastore
    //   216: dup
    //   217: iconst_1
    //   218: fconst_2
    //   219: invokestatic 299	java/lang/Float:valueOf	(F)Ljava/lang/Float;
    //   222: aastore
    //   223: dup
    //   224: iconst_2
    //   225: iload_0
    //   226: invokestatic 294	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   229: aastore
    //   230: invokestatic 303	java/lang/String:format	(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   233: astore 5
    //   235: getstatic 308	org/vidogram/messenger/ApplicationLoader:a	Landroid/content/Context;
    //   238: aload 5
    //   240: invokevirtual 314	android/content/Context:getFileStreamPath	(Ljava/lang/String;)Ljava/io/File;
    //   243: astore 5
    //   245: aload 5
    //   247: invokevirtual 319	java/io/File:exists	()Z
    //   250: ifeq +9 -> 259
    //   253: aload 5
    //   255: invokevirtual 322	java/io/File:delete	()Z
    //   258: pop
    //   259: iload 4
    //   261: iconst_1
    //   262: iadd
    //   263: istore 4
    //   265: goto -74 -> 191
    //   268: astore 5
    //   270: ldc 213
    //   272: aload 5
    //   274: invokestatic 218	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   277: getstatic 308	org/vidogram/messenger/ApplicationLoader:a	Landroid/content/Context;
    //   280: invokevirtual 330	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
    //   283: new 142	java/lang/StringBuilder
    //   286: dup
    //   287: invokespecial 238	java/lang/StringBuilder:<init>	()V
    //   290: ldc_w 332
    //   293: invokevirtual 245	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   296: getstatic 287	java/util/Locale:US	Ljava/util/Locale;
    //   299: ldc_w 334
    //   302: iconst_3
    //   303: anewarray 4	java/lang/Object
    //   306: dup
    //   307: iconst_0
    //   308: fconst_2
    //   309: invokestatic 299	java/lang/Float:valueOf	(F)Ljava/lang/Float;
    //   312: aastore
    //   313: dup
    //   314: iconst_1
    //   315: iload_0
    //   316: invokestatic 294	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   319: aastore
    //   320: dup
    //   321: iconst_2
    //   322: iload_1
    //   323: invokestatic 294	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   326: aastore
    //   327: invokestatic 303	java/lang/String:format	(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   330: invokevirtual 245	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   333: invokevirtual 251	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   336: invokevirtual 340	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   339: astore 6
    //   341: new 342	android/graphics/BitmapFactory$Options
    //   344: dup
    //   345: invokespecial 343	android/graphics/BitmapFactory$Options:<init>	()V
    //   348: astore 5
    //   350: aload 5
    //   352: iconst_0
    //   353: putfield 346	android/graphics/BitmapFactory$Options:inJustDecodeBounds	Z
    //   356: aload 5
    //   358: iload_3
    //   359: putfield 349	android/graphics/BitmapFactory$Options:inSampleSize	I
    //   362: aload 6
    //   364: aconst_null
    //   365: aload 5
    //   367: invokestatic 355	android/graphics/BitmapFactory:decodeStream	(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   370: astore 5
    //   372: aload 6
    //   374: invokevirtual 360	java/io/InputStream:close	()V
    //   377: new 6	org/vidogram/messenger/j$1
    //   380: dup
    //   381: iload_0
    //   382: iload_1
    //   383: aload 5
    //   385: invokespecial 363	org/vidogram/messenger/j$1:<init>	(IILandroid/graphics/Bitmap;)V
    //   388: invokestatic 366	org/vidogram/messenger/a:a	(Ljava/lang/Runnable;)V
    //   391: return
    //   392: ldc 213
    //   394: aload 6
    //   396: invokestatic 218	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   399: goto -22 -> 377
    //   402: astore 5
    //   404: ldc 213
    //   406: ldc_w 368
    //   409: aload 5
    //   411: invokestatic 371	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   414: return
    //   415: astore 6
    //   417: goto -25 -> 392
    //   420: astore 6
    //   422: aconst_null
    //   423: astore 5
    //   425: goto -33 -> 392
    //
    // Exception table:
    //   from	to	target	type
    //   22	83	268	java/lang/Exception
    //   83	144	268	java/lang/Exception
    //   198	259	268	java/lang/Exception
    //   2	6	402	java/lang/Throwable
    //   22	83	402	java/lang/Throwable
    //   83	144	402	java/lang/Throwable
    //   153	162	402	java/lang/Throwable
    //   167	171	402	java/lang/Throwable
    //   198	259	402	java/lang/Throwable
    //   270	277	402	java/lang/Throwable
    //   377	391	402	java/lang/Throwable
    //   392	399	402	java/lang/Throwable
    //   372	377	415	java/lang/Throwable
    //   277	372	420	java/lang/Throwable
  }

  private static class a
  {
    public Rect a;
    public byte b;
    public byte c;
    public int d;

    public a(Rect paramRect, byte paramByte1, byte paramByte2, int paramInt)
    {
      this.a = paramRect;
      this.b = paramByte1;
      this.c = paramByte2;
      this.d = paramInt;
    }
  }

  public static class b extends Drawable
  {
    private static Paint c = new Paint(2);
    private static Rect d = new Rect();
    private static TextPaint e = new TextPaint(1);
    private j.a a;
    private boolean b = false;

    public b(j.a parama)
    {
      this.a = parama;
    }

    public Rect a()
    {
      Rect localRect = getBounds();
      int k = localRect.centerX();
      int j = localRect.centerY();
      localRect = d;
      if (this.b)
      {
        i = j.b();
        localRect.left = (k - i / 2);
        localRect = d;
        if (!this.b)
          break label133;
        i = j.b();
        label60: localRect.right = (i / 2 + k);
        localRect = d;
        if (!this.b)
          break label140;
        i = j.b();
        label86: localRect.top = (j - i / 2);
        localRect = d;
        if (!this.b)
          break label147;
      }
      label133: label140: label147: for (int i = j.b(); ; i = j.c())
      {
        localRect.bottom = (i / 2 + j);
        return d;
        i = j.c();
        break;
        i = j.c();
        break label60;
        i = j.c();
        break label86;
      }
    }

    public void draw(Canvas paramCanvas)
    {
      if (j.a()[this.a.b][this.a.c] == null)
      {
        if (j.d()[this.a.b][this.a.c] != 0)
          return;
        j.d()[this.a.b][this.a.c] = 1;
        Utilities.d.b(new Runnable()
        {
          public void run()
          {
            j.a(j.b.a(j.b.this).b, j.b.a(j.b.this).c);
            j.d()[j.b.a(j.b.this).b][j.b.a(j.b.this).c] = 0;
          }
        });
        paramCanvas.drawRect(getBounds(), j.e());
        return;
      }
      if (this.b);
      for (Rect localRect = a(); ; localRect = getBounds())
      {
        paramCanvas.drawBitmap(j.a()[this.a.b][this.a.c], this.a.a, localRect, c);
        return;
      }
    }

    public int getOpacity()
    {
      return -2;
    }

    public void setAlpha(int paramInt)
    {
    }

    public void setColorFilter(ColorFilter paramColorFilter)
    {
    }
  }

  public static class c extends ImageSpan
  {
    private Paint.FontMetricsInt a = null;
    private int b = a.a(20.0F);

    public c(j.b paramb, int paramInt1, int paramInt2, Paint.FontMetricsInt paramFontMetricsInt)
    {
      super(paramInt1);
      this.a = paramFontMetricsInt;
      if (paramFontMetricsInt != null)
      {
        this.b = (Math.abs(this.a.descent) + Math.abs(this.a.ascent));
        if (this.b == 0)
          this.b = a.a(20.0F);
      }
    }

    public void a(Paint.FontMetricsInt paramFontMetricsInt, int paramInt)
    {
      this.a = paramFontMetricsInt;
      this.b = paramInt;
    }

    public int getSize(Paint paramPaint, CharSequence paramCharSequence, int paramInt1, int paramInt2, Paint.FontMetricsInt paramFontMetricsInt)
    {
      if (paramFontMetricsInt == null)
        paramFontMetricsInt = new Paint.FontMetricsInt();
      while (true)
      {
        if (this.a == null)
        {
          paramInt1 = super.getSize(paramPaint, paramCharSequence, paramInt1, paramInt2, paramFontMetricsInt);
          paramInt2 = a.a(8.0F);
          int i = a.a(10.0F);
          paramFontMetricsInt.top = (-i - paramInt2);
          paramFontMetricsInt.bottom = (i - paramInt2);
          paramFontMetricsInt.ascent = (-i - paramInt2);
          paramFontMetricsInt.leading = 0;
          paramFontMetricsInt.descent = (i - paramInt2);
          return paramInt1;
        }
        if (paramFontMetricsInt != null)
        {
          paramFontMetricsInt.ascent = this.a.ascent;
          paramFontMetricsInt.descent = this.a.descent;
          paramFontMetricsInt.top = this.a.top;
          paramFontMetricsInt.bottom = this.a.bottom;
        }
        if (getDrawable() != null)
          getDrawable().setBounds(0, 0, this.b, this.b);
        return this.b;
      }
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.j
 * JD-Core Version:    0.6.0
 */