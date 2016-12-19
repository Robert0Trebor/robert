package org.vidogram.messenger;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.ContentUris;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.Intent.ShortcutIconResource;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Matrix.ScaleToFit;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Environment;
import android.os.Handler;
import android.os.Parcelable;
import android.provider.DocumentsContract;
import android.provider.MediaStore.Audio.Media;
import android.provider.MediaStore.Images.Media;
import android.provider.MediaStore.Video.Media;
import android.support.v4.content.FileProvider;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.DisplayMetrics;
import android.util.StateSet;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.webkit.MimeTypeMap;
import android.widget.AbsListView;
import android.widget.EdgeEffect;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Hashtable;
import java.util.Locale;
import java.util.regex.Pattern;
import org.vidogram.tgnet.ConnectionsManager;
import org.vidogram.tgnet.g.ar;
import org.vidogram.tgnet.g.i;
import org.vidogram.tgnet.g.m;
import org.vidogram.tgnet.g.q;
import org.vidogram.tgnet.g.t;
import org.vidogram.tgnet.g.vw;
import org.vidogram.tgnet.g.vx;
import org.vidogram.ui.Components.ab.b;
import org.vidogram.ui.Components.bo;
import org.vidogram.ui.Components.s;
import org.vidogram.ui.a.g;

public class a
{
  public static int a;
  public static float b;
  public static Point c;
  public static boolean d;
  public static Integer e;
  public static DisplayMetrics f;
  public static int g;
  public static boolean h;
  public static boolean i;
  public static Pattern j;
  private static final Hashtable<String, Typeface> k = new Hashtable();
  private static int l = -10;
  private static boolean m = false;
  private static boolean n = false;
  private static final Object o = new Object();
  private static final Object p = new Object();
  private static Boolean q;
  private static int r;
  private static Paint s;
  private static RectF t;
  private static Field u;
  private static Field v;

  static
  {
    a = 0;
    b = 1.0F;
    c = new Point();
    e = null;
    f = new DisplayMetrics();
    q = null;
    r = 0;
    j = null;
    try
    {
      Pattern localPattern = Pattern.compile("((25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9])\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[0-9]))");
      localPattern = Pattern.compile("(([a-zA-Z0-9 -퟿豈-﷏ﷰ-￯]([a-zA-Z0-9 -퟿豈-﷏ﷰ-￯\\-]{0,61}[a-zA-Z0-9 -퟿豈-﷏ﷰ-￯]){0,1}\\.)+[a-zA-Z -퟿豈-﷏ﷰ-￯]{2,63}|" + localPattern + ")");
      j = Pattern.compile("((?:(http|https|Http|Https):\\/\\/(?:(?:[a-zA-Z0-9\\$\\-\\_\\.\\+\\!\\*\\'\\(\\)\\,\\;\\?\\&\\=]|(?:\\%[a-fA-F0-9]{2})){1,64}(?:\\:(?:[a-zA-Z0-9\\$\\-\\_\\.\\+\\!\\*\\'\\(\\)\\,\\;\\?\\&\\=]|(?:\\%[a-fA-F0-9]{2})){1,25})?\\@)?)?(?:" + localPattern + ")" + "(?:\\:\\d{1,5})?)" + "(\\/(?:(?:[" + "a-zA-Z0-9 -퟿豈-﷏ﷰ-￯" + "\\;\\/\\?\\:\\@\\&\\=\\#\\~" + "\\-\\.\\+\\!\\*\\'\\(\\)\\,\\_])|(?:\\%[a-fA-F0-9]{2}))*)?" + "(?:\\b|$)");
      if (c())
      {
        i1 = 80;
        g = i1;
        a(ApplicationLoader.a, null);
        return;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        n.a("tmessages", localException);
        continue;
        int i1 = 72;
      }
    }
  }

  public static float a(float paramFloat, boolean paramBoolean)
  {
    float f1 = paramFloat / 2.54F;
    if (paramBoolean)
      paramFloat = f.xdpi;
    while (true)
    {
      return paramFloat * f1;
      paramFloat = f.ydpi;
    }
  }

  public static int a(float paramFloat)
  {
    if (paramFloat == 0.0F)
      return 0;
    return (int)Math.ceil(b * paramFloat);
  }

  public static int a(int paramInt1, int paramInt2)
  {
    if (paramInt1 == paramInt2)
      return 0;
    if (paramInt1 > paramInt2)
      return 1;
    return -1;
  }

  public static long a(int paramInt)
  {
    return 0x0 | paramInt & 0xFFFFFFFF;
  }

  public static AlertDialog.Builder a(Context paramContext, g.t paramt)
  {
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(paramContext);
    localBuilder.setTitle(r.a("MessageLifetime", 2131231432));
    paramContext = new org.vidogram.ui.Components.ab(paramContext);
    paramContext.setMinValue(0);
    paramContext.setMaxValue(20);
    if ((paramt.n > 0) && (paramt.n < 16))
      paramContext.setValue(paramt.n);
    while (true)
    {
      paramContext.setFormatter(new ab.b()
      {
        public String a(int paramInt)
        {
          if (paramInt == 0)
            return r.a("ShortMessageLifetimeForever", 2131231849);
          if ((paramInt >= 1) && (paramInt < 16))
            return a.d(paramInt);
          if (paramInt == 16)
            return a.d(30);
          if (paramInt == 17)
            return a.d(60);
          if (paramInt == 18)
            return a.d(3600);
          if (paramInt == 19)
            return a.d(86400);
          if (paramInt == 20)
            return a.d(604800);
          return "";
        }
      });
      localBuilder.setView(paramContext);
      localBuilder.setNegativeButton(r.a("Done", 2131231147), new DialogInterface.OnClickListener(paramt, paramContext)
      {
        public void onClick(DialogInterface paramDialogInterface, int paramInt)
        {
          paramInt = this.a.n;
          int i = this.b.getValue();
          if ((i >= 0) && (i < 16))
            this.a.n = i;
          while (true)
          {
            if (paramInt != this.a.n)
            {
              ab.a().g(this.a, null);
              w.a().b(this.a);
            }
            return;
            if (i == 16)
            {
              this.a.n = 30;
              continue;
            }
            if (i == 17)
            {
              this.a.n = 60;
              continue;
            }
            if (i == 18)
            {
              this.a.n = 3600;
              continue;
            }
            if (i == 19)
            {
              this.a.n = 86400;
              continue;
            }
            if (i != 20)
              continue;
            this.a.n = 604800;
          }
        }
      });
      return localBuilder;
      if (paramt.n == 30)
      {
        paramContext.setValue(16);
        continue;
      }
      if (paramt.n == 60)
      {
        paramContext.setValue(17);
        continue;
      }
      if (paramt.n == 3600)
      {
        paramContext.setValue(18);
        continue;
      }
      if (paramt.n == 86400)
      {
        paramContext.setValue(19);
        continue;
      }
      if (paramt.n == 604800)
      {
        paramContext.setValue(20);
        continue;
      }
      if (paramt.n != 0)
        continue;
      paramContext.setValue(0);
    }
  }

  private static Intent a(long paramLong, boolean paramBoolean)
  {
    Canvas localCanvas = null;
    Object localObject6 = null;
    Intent localIntent1 = new Intent(ApplicationLoader.a, OpenChatReceiver.class);
    int i1 = (int)paramLong;
    int i2 = (int)(paramLong >> 32);
    Object localObject1;
    g.vw localvw;
    label85: Object localObject4;
    Object localObject5;
    if (i1 == 0)
    {
      localIntent1.putExtra("encId", i2);
      localObject1 = v.a().c(Integer.valueOf(i2));
      if (localObject1 == null);
      do
      {
        return null;
        localvw = v.a().a(Integer.valueOf(((g.t)localObject1).m));
        localObject1 = null;
      }
      while ((localvw == null) && (localObject1 == null));
      if (localvw == null)
        break label684;
      localObject2 = f.a(localvw.e, localvw.f);
      localObject4 = localObject2;
      if (localvw.j == null)
        break label862;
      localObject5 = localvw.j.e;
      localObject4 = localObject2;
    }
    label145: label684: Object localObject3;
    label862: for (Object localObject2 = localObject5; ; localObject3 = null)
      while (true)
      {
        localIntent1.setAction("com.tmessages.openchat" + paramLong);
        localIntent1.addFlags(67108864);
        Intent localIntent2 = new Intent();
        localIntent2.putExtra("android.intent.extra.shortcut.INTENT", localIntent1);
        localIntent2.putExtra("android.intent.extra.shortcut.NAME", (String)localObject4);
        localIntent2.putExtra("duplicate", false);
        if (!paramBoolean)
        {
          localObject4 = localObject6;
          if (localObject2 != null)
            localObject4 = localCanvas;
        }
        try
        {
          localObject2 = BitmapFactory.decodeFile(m.a((org.vidogram.tgnet.f)localObject2, true).toString());
          if (localObject2 != null)
          {
            localObject4 = localObject2;
            int i3 = a(58.0F);
            localObject4 = localObject2;
            localObject5 = Bitmap.createBitmap(i3, i3, Bitmap.Config.ARGB_8888);
            localObject4 = localObject2;
            ((Bitmap)localObject5).eraseColor(0);
            localObject4 = localObject2;
            localCanvas = new Canvas((Bitmap)localObject5);
            localObject4 = localObject2;
            localObject6 = new BitmapShader((Bitmap)localObject2, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
            localObject4 = localObject2;
            if (s == null)
            {
              localObject4 = localObject2;
              s = new Paint(1);
              localObject4 = localObject2;
              t = new RectF();
            }
            localObject4 = localObject2;
            float f1 = i3 / ((Bitmap)localObject2).getWidth();
            localObject4 = localObject2;
            localCanvas.save();
            localObject4 = localObject2;
            localCanvas.scale(f1, f1);
            localObject4 = localObject2;
            s.setShader((Shader)localObject6);
            localObject4 = localObject2;
            t.set(0.0F, 0.0F, ((Bitmap)localObject2).getWidth(), ((Bitmap)localObject2).getHeight());
            localObject4 = localObject2;
            localCanvas.drawRoundRect(t, ((Bitmap)localObject2).getWidth(), ((Bitmap)localObject2).getHeight(), s);
            localObject4 = localObject2;
            localCanvas.restore();
            localObject4 = localObject2;
            localObject6 = ApplicationLoader.a.getResources().getDrawable(2130837647);
            localObject4 = localObject2;
            i1 = a(15.0F);
            localObject4 = localObject2;
            i2 = i3 - i1 - a(2.0F);
            localObject4 = localObject2;
            i3 = i3 - i1 - a(2.0F);
            localObject4 = localObject2;
            ((Drawable)localObject6).setBounds(i2, i3, i2 + i1, i1 + i3);
            localObject4 = localObject2;
            ((Drawable)localObject6).draw(localCanvas);
            localObject4 = localObject2;
          }
        }
        catch (Throwable localObject3)
        {
          while (true)
            try
            {
              localCanvas.setBitmap(null);
              localObject2 = localObject5;
              localObject4 = localObject2;
              if (localObject4 == null)
                continue;
              localIntent2.putExtra("android.intent.extra.shortcut.ICON", (Parcelable)localObject4);
              return localIntent2;
              if (i1 <= 0)
                continue;
              localIntent1.putExtra("userId", i1);
              localvw = v.a().a(Integer.valueOf(i1));
              localObject1 = null;
              break label85;
              if (i1 >= 0)
                break;
              localObject1 = v.a().b(Integer.valueOf(-i1));
              localIntent1.putExtra("chatId", -i1);
              localvw = null;
              break label85;
              localObject5 = ((g.i)localObject1).i;
              localObject4 = localObject5;
              if (((g.i)localObject1).j == null)
                break label862;
              localObject2 = ((g.i)localObject1).j.b;
              localObject4 = localObject5;
              break label145;
              localThrowable = localThrowable;
              n.a("tmessages", localThrowable);
              continue;
              if (localvw == null)
                continue;
              if (!localvw.r)
                continue;
              localIntent2.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(ApplicationLoader.a, 2130837644));
              continue;
              localIntent2.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(ApplicationLoader.a, 2130837648));
              continue;
              if (localObject1 == null)
                continue;
              if ((!e.d((g.i)localObject1)) || (((g.i)localObject1).r))
                continue;
              localIntent2.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(ApplicationLoader.a, 2130837645));
              continue;
              localIntent2.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(ApplicationLoader.a, 2130837646));
              continue;
            }
            catch (Exception localObject3)
            {
              localObject3 = localObject5;
              continue;
            }
        }
      }
  }

  public static Typeface a(String paramString)
  {
    synchronized (k)
    {
      boolean bool = k.containsKey(paramString);
      if (!bool);
      try
      {
        Typeface localTypeface = Typeface.createFromAsset(ApplicationLoader.a.getAssets(), paramString);
        k.put(paramString, localTypeface);
        paramString = (Typeface)k.get(paramString);
        return paramString;
      }
      catch (Exception localException)
      {
        n.a("Typefaces", "Could not get typeface '" + paramString + "' because " + localException.getMessage());
        return null;
      }
    }
  }

  public static SpannableStringBuilder a(String paramString, int paramInt)
  {
    int i2 = 0;
    int i1;
    try
    {
      localObject = new StringBuilder(paramString);
      if ((paramInt & 0x1) == 0)
        break label96;
      while (true)
      {
        i1 = ((StringBuilder)localObject).indexOf("<br>");
        if (i1 == -1)
          break;
        ((StringBuilder)localObject).replace(i1, i1 + 4, "\n");
      }
    }
    catch (Exception localException)
    {
      n.a("tmessages", localException);
      return new SpannableStringBuilder(paramString);
    }
    while (true)
    {
      i1 = ((StringBuilder)localObject).indexOf("<br/>");
      if (i1 == -1)
        break;
      ((StringBuilder)localObject).replace(i1, i1 + 5, "\n");
    }
    label96: ArrayList localArrayList1 = new ArrayList();
    int i3;
    if ((paramInt & 0x2) != 0)
      while (true)
      {
        int i4 = ((StringBuilder)localObject).indexOf("<b>");
        if (i4 == -1)
          break;
        ((StringBuilder)localObject).replace(i4, i4 + 3, "");
        i3 = ((StringBuilder)localObject).indexOf("</b>");
        i1 = i3;
        if (i3 == -1)
          i1 = ((StringBuilder)localObject).indexOf("<b>");
        ((StringBuilder)localObject).replace(i1, i1 + 4, "");
        localArrayList1.add(Integer.valueOf(i4));
        localArrayList1.add(Integer.valueOf(i1));
      }
    ArrayList localArrayList2 = new ArrayList();
    if ((paramInt & 0x4) != 0)
      while (true)
      {
        paramInt = ((StringBuilder)localObject).indexOf("<c#");
        if (paramInt == -1)
          break;
        ((StringBuilder)localObject).replace(paramInt, paramInt + 2, "");
        i3 = ((StringBuilder)localObject).indexOf(">", paramInt);
        i1 = Color.parseColor(((StringBuilder)localObject).substring(paramInt, i3));
        ((StringBuilder)localObject).replace(paramInt, i3 + 1, "");
        i3 = ((StringBuilder)localObject).indexOf("</c>");
        ((StringBuilder)localObject).replace(i3, i3 + 4, "");
        localArrayList2.add(Integer.valueOf(paramInt));
        localArrayList2.add(Integer.valueOf(i3));
        localArrayList2.add(Integer.valueOf(i1));
      }
    Object localObject = new SpannableStringBuilder((CharSequence)localObject);
    paramInt = 0;
    while (true)
    {
      i1 = i2;
      if (paramInt >= localArrayList1.size() / 2)
        break;
      ((SpannableStringBuilder)localObject).setSpan(new bo(a("fonts/rmedium.ttf")), ((Integer)localArrayList1.get(paramInt * 2)).intValue(), ((Integer)localArrayList1.get(paramInt * 2 + 1)).intValue(), 33);
      paramInt += 1;
    }
    while (i1 < localArrayList2.size() / 3)
    {
      ((SpannableStringBuilder)localObject).setSpan(new ForegroundColorSpan(((Integer)localArrayList2.get(i1 * 3 + 2)).intValue()), ((Integer)localArrayList2.get(i1 * 3)).intValue(), ((Integer)localArrayList2.get(i1 * 3 + 1)).intValue(), 33);
      i1 += 1;
    }
    return (SpannableStringBuilder)localObject;
  }

  public static CharSequence a(CharSequence paramCharSequence)
  {
    CharSequence localCharSequence = paramCharSequence;
    if (paramCharSequence != null)
    {
      localCharSequence = paramCharSequence;
      if (paramCharSequence.length() == 0)
        localCharSequence = paramCharSequence;
    }
    else
    {
      return localCharSequence;
    }
    while (true)
    {
      paramCharSequence = localCharSequence;
      if (localCharSequence.length() <= 0)
        break;
      if (localCharSequence.charAt(0) != '\n')
      {
        paramCharSequence = localCharSequence;
        if (localCharSequence.charAt(0) != ' ')
          break;
      }
      localCharSequence = localCharSequence.subSequence(1, localCharSequence.length());
    }
    while (true)
    {
      localCharSequence = paramCharSequence;
      if (paramCharSequence.length() <= 0)
        break;
      if (paramCharSequence.charAt(paramCharSequence.length() - 1) != '\n')
      {
        localCharSequence = paramCharSequence;
        if (paramCharSequence.charAt(paramCharSequence.length() - 1) != ' ')
          break;
      }
      paramCharSequence = paramCharSequence.subSequence(0, paramCharSequence.length() - 1);
    }
  }

  public static CharSequence a(String paramString1, String paramString2, String paramString3)
  {
    if ((paramString1 == null) && (paramString2 == null))
      return "";
    SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder();
    String str;
    int i1;
    label67: int i2;
    label108: int i3;
    if ((paramString1 == null) || (paramString1.length() == 0))
    {
      str = paramString2;
      paramString1 = str.trim();
      paramString2 = " " + paramString1.toLowerCase();
      i1 = 0;
      int i4 = paramString2.indexOf(" " + paramString3, i1);
      if (i4 == -1)
        break label326;
      if (i4 != 0)
        break label289;
      i2 = 0;
      i3 = i4 - i2;
      int i5 = paramString3.length();
      if (i4 != 0)
        break label295;
      i2 = 0;
      label129: i2 = i2 + i5 + i3;
      if ((i1 == 0) || (i1 == i3 + 1))
        break label301;
      localSpannableStringBuilder.append(paramString1.substring(i1, i3));
    }
    while (true)
    {
      str = paramString1.substring(i3, i2);
      if (str.startsWith(" "))
        localSpannableStringBuilder.append(" ");
      str = str.trim();
      localSpannableStringBuilder.append(b("<c#ff4d83b3>" + str + "</c>"));
      i1 = i2;
      break label67;
      str = paramString1;
      if (paramString2 == null)
        break;
      str = paramString1;
      if (paramString2.length() == 0)
        break;
      str = paramString1 + " " + paramString2;
      break;
      label289: i2 = 1;
      break label108;
      label295: i2 = 1;
      break label129;
      label301: if ((i1 != 0) || (i3 == 0))
        continue;
      localSpannableStringBuilder.append(paramString1.substring(0, i3));
    }
    label326: if ((i1 != -1) && (i1 != paramString1.length()))
      localSpannableStringBuilder.append(paramString1.substring(i1, paramString1.length()));
    return localSpannableStringBuilder;
  }

  // ERROR //
  public static String a(Context paramContext, Uri paramUri, String paramString, String[] paramArrayOfString)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 631	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   4: aload_1
    //   5: iconst_1
    //   6: anewarray 603	java/lang/String
    //   9: dup
    //   10: iconst_0
    //   11: ldc_w 633
    //   14: aastore
    //   15: aload_2
    //   16: aload_3
    //   17: aconst_null
    //   18: invokevirtual 639	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   21: astore_1
    //   22: aload_1
    //   23: ifnull +100 -> 123
    //   26: aload_1
    //   27: astore_0
    //   28: aload_1
    //   29: invokeinterface 644 1 0
    //   34: ifeq +89 -> 123
    //   37: aload_1
    //   38: astore_0
    //   39: aload_1
    //   40: aload_1
    //   41: ldc_w 633
    //   44: invokeinterface 647 2 0
    //   49: invokeinterface 651 2 0
    //   54: astore_2
    //   55: aload_1
    //   56: astore_0
    //   57: aload_2
    //   58: ldc_w 653
    //   61: invokevirtual 621	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   64: ifne +31 -> 95
    //   67: aload_1
    //   68: astore_0
    //   69: aload_2
    //   70: ldc_w 655
    //   73: invokevirtual 621	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   76: ifne +33 -> 109
    //   79: aload_1
    //   80: astore_0
    //   81: aload_2
    //   82: ldc_w 657
    //   85: invokevirtual 621	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   88: istore 4
    //   90: iload 4
    //   92: ifne +17 -> 109
    //   95: aload_1
    //   96: ifnull +9 -> 105
    //   99: aload_1
    //   100: invokeinterface 660 1 0
    //   105: aconst_null
    //   106: astore_0
    //   107: aload_0
    //   108: areturn
    //   109: aload_2
    //   110: astore_0
    //   111: aload_1
    //   112: ifnull -5 -> 107
    //   115: aload_1
    //   116: invokeinterface 660 1 0
    //   121: aload_2
    //   122: areturn
    //   123: aload_1
    //   124: ifnull +9 -> 133
    //   127: aload_1
    //   128: invokeinterface 660 1 0
    //   133: aconst_null
    //   134: areturn
    //   135: astore_2
    //   136: aconst_null
    //   137: astore_1
    //   138: aload_1
    //   139: astore_0
    //   140: ldc 149
    //   142: aload_2
    //   143: invokestatic 154	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   146: aload_1
    //   147: ifnull -14 -> 133
    //   150: aload_1
    //   151: invokeinterface 660 1 0
    //   156: goto -23 -> 133
    //   159: astore_1
    //   160: aconst_null
    //   161: astore_0
    //   162: aload_0
    //   163: ifnull +9 -> 172
    //   166: aload_0
    //   167: invokeinterface 660 1 0
    //   172: aload_1
    //   173: athrow
    //   174: astore_1
    //   175: goto -13 -> 162
    //   178: astore_2
    //   179: goto -41 -> 138
    //
    // Exception table:
    //   from	to	target	type
    //   0	22	135	java/lang/Exception
    //   0	22	159	finally
    //   28	37	174	finally
    //   39	55	174	finally
    //   57	67	174	finally
    //   69	79	174	finally
    //   81	90	174	finally
    //   140	146	174	finally
    //   28	37	178	java/lang/Exception
    //   39	55	178	java/lang/Exception
    //   57	67	178	java/lang/Exception
    //   69	79	178	java/lang/Exception
    //   81	90	178	java/lang/Exception
  }

  public static void a(long paramLong)
  {
    try
    {
      Intent localIntent = a(paramLong, false);
      localIntent.setAction("com.android.launcher.action.INSTALL_SHORTCUT");
      ApplicationLoader.a.sendBroadcast(localIntent);
      return;
    }
    catch (Exception localException)
    {
      n.a("tmessages", localException);
    }
  }

  public static void a(Activity paramActivity)
  {
    if ((paramActivity == null) || (l != -10));
    int i1;
    int i2;
    while (true)
    {
      return;
      try
      {
        l = paramActivity.getRequestedOrientation();
        WindowManager localWindowManager = (WindowManager)paramActivity.getSystemService("window");
        if ((localWindowManager == null) || (localWindowManager.getDefaultDisplay() == null))
          continue;
        i1 = localWindowManager.getDefaultDisplay().getRotation();
        i2 = paramActivity.getResources().getConfiguration().orientation;
        if (i1 != 3)
          break label96;
        if (i2 != 1)
          break;
        paramActivity.setRequestedOrientation(1);
        return;
      }
      catch (Exception paramActivity)
      {
        n.a("tmessages", paramActivity);
        return;
      }
    }
    paramActivity.setRequestedOrientation(8);
    return;
    label96: if (i1 == 1)
    {
      if (i2 == 1)
      {
        paramActivity.setRequestedOrientation(9);
        return;
      }
      paramActivity.setRequestedOrientation(0);
      return;
    }
    if (i1 == 0)
    {
      if (i2 == 2)
      {
        paramActivity.setRequestedOrientation(0);
        return;
      }
      paramActivity.setRequestedOrientation(1);
      return;
    }
    if (i2 == 2)
    {
      paramActivity.setRequestedOrientation(8);
      return;
    }
    paramActivity.setRequestedOrientation(9);
  }

  public static void a(Activity paramActivity, int paramInt)
  {
    if ((paramActivity == null) || (c()))
      return;
    paramActivity.getWindow().setSoftInputMode(16);
    r = paramInt;
  }

  public static void a(Context paramContext, Configuration paramConfiguration)
  {
    boolean bool = true;
    try
    {
      b = paramContext.getResources().getDisplayMetrics().density;
      Configuration localConfiguration = paramConfiguration;
      if (paramConfiguration == null)
        localConfiguration = paramContext.getResources().getConfiguration();
      if ((localConfiguration.keyboard != 1) && (localConfiguration.hardKeyboardHidden == 1));
      while (true)
      {
        h = bool;
        paramContext = (WindowManager)paramContext.getSystemService("window");
        if (paramContext != null)
        {
          paramContext = paramContext.getDefaultDisplay();
          if (paramContext != null)
          {
            paramContext.getMetrics(f);
            paramContext.getSize(c);
          }
        }
        int i1;
        if (localConfiguration.screenWidthDp != 0)
        {
          i1 = (int)Math.ceil(localConfiguration.screenWidthDp * b);
          if (Math.abs(c.x - i1) > 3)
            c.x = i1;
        }
        if (localConfiguration.screenHeightDp != 0)
        {
          i1 = (int)Math.ceil(localConfiguration.screenHeightDp * b);
          if (Math.abs(c.y - i1) > 3)
            c.y = i1;
        }
        n.a("tmessages", "display size = " + c.x + " " + c.y + " " + f.xdpi + "x" + f.ydpi);
        return;
        bool = false;
      }
    }
    catch (Exception paramContext)
    {
      n.a("tmessages", paramContext);
    }
  }

  public static void a(Matrix paramMatrix, RectF paramRectF1, RectF paramRectF2, int paramInt, Matrix.ScaleToFit paramScaleToFit)
  {
    float f2;
    float f1;
    float f3;
    float f4;
    if ((paramInt == 90) || (paramInt == 270))
    {
      f2 = paramRectF2.height() / paramRectF1.width();
      f1 = paramRectF2.width() / paramRectF1.height();
      f3 = f1;
      f4 = f2;
      if (paramScaleToFit != Matrix.ScaleToFit.FILL)
      {
        if (f2 <= f1)
          break label168;
        f4 = f1;
        f3 = f1;
      }
      label67: f1 = -paramRectF1.left;
      f2 = -paramRectF1.top;
      paramMatrix.setTranslate(paramRectF2.left, paramRectF2.top);
      if (paramInt != 90)
        break label179;
      paramMatrix.preRotate(90.0F);
      paramMatrix.preTranslate(0.0F, -paramRectF2.width());
    }
    while (true)
    {
      paramMatrix.preScale(f4, f3);
      paramMatrix.preTranslate(f1 * f4, f2 * f3);
      return;
      f2 = paramRectF2.width() / paramRectF1.width();
      f1 = paramRectF2.height() / paramRectF1.height();
      break;
      label168: f3 = f2;
      f4 = f2;
      break label67;
      label179: if (paramInt == 180)
      {
        paramMatrix.preRotate(180.0F);
        paramMatrix.preTranslate(-paramRectF2.width(), -paramRectF2.height());
        continue;
      }
      if (paramInt != 270)
        continue;
      paramMatrix.preRotate(270.0F);
      paramMatrix.preTranslate(-paramRectF2.height(), 0.0F);
    }
  }

  public static void a(View paramView)
  {
    if (paramView == null)
      return;
    try
    {
      ((InputMethodManager)paramView.getContext().getSystemService("input_method")).showSoftInput(paramView, 1);
      return;
    }
    catch (Exception paramView)
    {
      n.a("tmessages", paramView);
    }
  }

  public static void a(View paramView, float paramFloat, int paramInt)
  {
    if (paramInt == 6)
    {
      paramView.setTranslationX(0.0F);
      return;
    }
    AnimatorSet localAnimatorSet = new AnimatorSet();
    localAnimatorSet.playTogether(new Animator[] { ObjectAnimator.ofFloat(paramView, "translationX", new float[] { a(paramFloat) }) });
    localAnimatorSet.setDuration(50L);
    localAnimatorSet.addListener(new b(paramView, paramInt, paramFloat)
    {
      public void onAnimationEnd(Animator paramAnimator)
      {
        paramAnimator = this.a;
        float f;
        if (this.b == 5)
          f = 0.0F;
        while (true)
        {
          a.a(paramAnimator, f, this.b + 1);
          return;
          f = -this.c;
        }
      }
    });
    localAnimatorSet.start();
  }

  public static void a(AbsListView paramAbsListView, int paramInt)
  {
    if (Build.VERSION.SDK_INT >= 21);
    try
    {
      Object localObject = AbsListView.class.getDeclaredField("mEdgeGlowTop");
      ((Field)localObject).setAccessible(true);
      localObject = (EdgeEffect)((Field)localObject).get(paramAbsListView);
      if (localObject != null)
        ((EdgeEffect)localObject).setColor(paramInt);
      localObject = AbsListView.class.getDeclaredField("mEdgeGlowBottom");
      ((Field)localObject).setAccessible(true);
      paramAbsListView = (EdgeEffect)((Field)localObject).get(paramAbsListView);
      if (paramAbsListView != null)
        paramAbsListView.setColor(paramInt);
      return;
    }
    catch (Exception paramAbsListView)
    {
      n.a("tmessages", paramAbsListView);
    }
  }

  public static void a(EditText paramEditText)
  {
    if (paramEditText == null)
      return;
    try
    {
      Field localField = TextView.class.getDeclaredField("mCursorDrawableRes");
      localField.setAccessible(true);
      localField.setInt(paramEditText, 0);
      return;
    }
    catch (Exception paramEditText)
    {
      n.a("tmessages", paramEditText);
    }
  }

  public static void a(ProgressBar paramProgressBar, int paramInt)
  {
    if (paramProgressBar == null)
      return;
    try
    {
      Field localField = ProgressBar.class.getDeclaredField("mDuration");
      localField.setAccessible(true);
      localField.setInt(paramProgressBar, paramInt);
      return;
    }
    catch (Exception paramProgressBar)
    {
      n.a("tmessages", paramProgressBar);
    }
  }

  public static void a(Runnable paramRunnable)
  {
    a(paramRunnable, 0L);
  }

  public static void a(Runnable paramRunnable, long paramLong)
  {
    if (paramLong == 0L)
    {
      ApplicationLoader.b.post(paramRunnable);
      return;
    }
    ApplicationLoader.b.postDelayed(paramRunnable, paramLong);
  }

  public static void a(u paramu, Activity paramActivity)
  {
    Object localObject2 = paramu.f();
    if ((paramu.a.A != null) && (paramu.a.A.length() != 0));
    for (Object localObject1 = new File(paramu.a.A); ; localObject1 = null)
    {
      if ((localObject1 == null) || (!((File)localObject1).exists()));
      label305: for (Object localObject3 = m.b(paramu.a); ; localObject3 = localObject1)
      {
        Intent localIntent;
        if ((localObject3 != null) && (((File)localObject3).exists()))
        {
          localIntent = new Intent("android.intent.action.VIEW");
          localIntent.setFlags(1);
          localObject1 = MimeTypeMap.getSingleton();
          int i1 = ((String)localObject2).lastIndexOf('.');
          if (i1 == -1)
            break label332;
          localObject2 = ((MimeTypeMap)localObject1).getMimeTypeFromExtension(((String)localObject2).substring(i1 + 1).toLowerCase());
          localObject1 = localObject2;
          if (localObject2 == null)
          {
            if ((paramu.f == 9) || (paramu.f == 0))
              localObject2 = paramu.A().g;
            if (localObject2 != null)
            {
              localObject1 = localObject2;
              if (((String)localObject2).length() != 0)
                break label181;
            }
          }
        }
        label181: label322: label332: for (localObject1 = null; ; localObject1 = null)
        {
          if (Build.VERSION.SDK_INT >= 24)
          {
            localObject2 = FileProvider.a(paramActivity, "org.vidogram.messenger.beta.provider", (File)localObject3);
            if (localObject1 != null)
              paramu = (u)localObject1;
          }
          while (true)
          {
            localIntent.setDataAndType((Uri)localObject2, paramu);
            if (localObject1 == null)
              break label322;
            try
            {
              paramActivity.startActivityForResult(localIntent, 500);
              return;
              paramu = "text/plain";
              continue;
              localObject2 = Uri.fromFile((File)localObject3);
              if (localObject1 != null);
              for (paramu = (u)localObject1; ; paramu = "text/plain")
              {
                localIntent.setDataAndType((Uri)localObject2, paramu);
                break;
              }
            }
            catch (Exception paramu)
            {
              if (Build.VERSION.SDK_INT < 24)
                break label305;
            }
          }
          localIntent.setDataAndType(FileProvider.a(paramActivity, "org.vidogram.messenger.beta.provider", (File)localObject3), "text/plain");
          while (true)
          {
            paramActivity.startActivityForResult(localIntent, 500);
            return;
            localIntent.setDataAndType(Uri.fromFile((File)localObject3), "text/plain");
          }
          paramActivity.startActivityForResult(localIntent, 500);
          return;
        }
      }
    }
  }

  public static void a(boolean paramBoolean)
  {
    synchronized (o)
    {
      m = paramBoolean;
      return;
    }
  }

  public static boolean a()
  {
    synchronized (o)
    {
      boolean bool = m;
      return bool;
    }
  }

  public static boolean a(Uri paramUri)
  {
    Object localObject = paramUri.getPath();
    paramUri = (Uri)localObject;
    if (localObject == null)
      return false;
    do
    {
      paramUri = (Uri)localObject;
      localObject = Utilities.readlink(paramUri);
    }
    while ((localObject != null) && (!((String)localObject).equals(paramUri)));
    localObject = paramUri;
    if (paramUri != null);
    try
    {
      String str = new File(paramUri).getCanonicalPath();
      localObject = paramUri;
      if (str != null)
        localObject = str;
      if ((localObject != null) && (((String)localObject).toLowerCase().contains("/data/data/" + ApplicationLoader.a.getPackageName() + "/files")))
      {
        i1 = 1;
        return i1;
      }
    }
    catch (Exception localUri)
    {
      while (true)
      {
        paramUri.replace("/./", "/");
        Uri localUri = paramUri;
        continue;
        int i1 = 0;
      }
    }
  }

  // ERROR //
  public static boolean a(File paramFile1, File paramFile2)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 5
    //   3: aconst_null
    //   4: astore 4
    //   6: aload_1
    //   7: invokevirtual 934	java/io/File:exists	()Z
    //   10: ifne +8 -> 18
    //   13: aload_1
    //   14: invokevirtual 1025	java/io/File:createNewFile	()Z
    //   17: pop
    //   18: new 1027	java/io/FileInputStream
    //   21: dup
    //   22: aload_0
    //   23: invokespecial 1030	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   26: astore_3
    //   27: new 1032	java/io/FileOutputStream
    //   30: dup
    //   31: aload_1
    //   32: invokespecial 1033	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   35: astore_0
    //   36: aload_0
    //   37: invokevirtual 1037	java/io/FileOutputStream:getChannel	()Ljava/nio/channels/FileChannel;
    //   40: aload_3
    //   41: invokevirtual 1038	java/io/FileInputStream:getChannel	()Ljava/nio/channels/FileChannel;
    //   44: lconst_0
    //   45: aload_3
    //   46: invokevirtual 1038	java/io/FileInputStream:getChannel	()Ljava/nio/channels/FileChannel;
    //   49: invokevirtual 1043	java/nio/channels/FileChannel:size	()J
    //   52: invokevirtual 1047	java/nio/channels/FileChannel:transferFrom	(Ljava/nio/channels/ReadableByteChannel;JJ)J
    //   55: pop2
    //   56: aload_3
    //   57: ifnull +7 -> 64
    //   60: aload_3
    //   61: invokevirtual 1048	java/io/FileInputStream:close	()V
    //   64: aload_0
    //   65: ifnull +7 -> 72
    //   68: aload_0
    //   69: invokevirtual 1049	java/io/FileOutputStream:close	()V
    //   72: iconst_1
    //   73: istore_2
    //   74: iload_2
    //   75: ireturn
    //   76: astore_3
    //   77: aconst_null
    //   78: astore_0
    //   79: aload 4
    //   81: astore_1
    //   82: ldc 149
    //   84: aload_3
    //   85: invokestatic 154	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   88: iconst_0
    //   89: istore_2
    //   90: aload_0
    //   91: ifnull +7 -> 98
    //   94: aload_0
    //   95: invokevirtual 1048	java/io/FileInputStream:close	()V
    //   98: aload_1
    //   99: ifnull -25 -> 74
    //   102: aload_1
    //   103: invokevirtual 1049	java/io/FileOutputStream:close	()V
    //   106: iconst_0
    //   107: ireturn
    //   108: astore_0
    //   109: aconst_null
    //   110: astore_3
    //   111: aload 5
    //   113: astore_1
    //   114: aload_3
    //   115: ifnull +7 -> 122
    //   118: aload_3
    //   119: invokevirtual 1048	java/io/FileInputStream:close	()V
    //   122: aload_1
    //   123: ifnull +7 -> 130
    //   126: aload_1
    //   127: invokevirtual 1049	java/io/FileOutputStream:close	()V
    //   130: aload_0
    //   131: athrow
    //   132: astore_0
    //   133: aload 5
    //   135: astore_1
    //   136: goto -22 -> 114
    //   139: astore 4
    //   141: aload_0
    //   142: astore_1
    //   143: aload 4
    //   145: astore_0
    //   146: goto -32 -> 114
    //   149: astore 4
    //   151: aload_0
    //   152: astore_3
    //   153: aload 4
    //   155: astore_0
    //   156: goto -42 -> 114
    //   159: astore_1
    //   160: aload_3
    //   161: astore_0
    //   162: aload_1
    //   163: astore_3
    //   164: aload 4
    //   166: astore_1
    //   167: goto -85 -> 82
    //   170: astore_1
    //   171: aload_3
    //   172: astore 4
    //   174: aload_1
    //   175: astore_3
    //   176: aload_0
    //   177: astore_1
    //   178: aload 4
    //   180: astore_0
    //   181: goto -99 -> 82
    //
    // Exception table:
    //   from	to	target	type
    //   18	27	76	java/lang/Exception
    //   18	27	108	finally
    //   27	36	132	finally
    //   36	56	139	finally
    //   82	88	149	finally
    //   27	36	159	java/lang/Exception
    //   36	56	170	java/lang/Exception
  }

  public static boolean a(g paramg)
  {
    try
    {
      ApplicationLoader.a.getPackageManager().getApplicationInfo("com.google.android.apps.maps", 0);
      return true;
    }
    catch (PackageManager.NameNotFoundException localBuilder)
    {
      if (paramg.l() == null)
        return false;
      AlertDialog.Builder localBuilder = new AlertDialog.Builder(paramg.l());
      localBuilder.setMessage("Install Google Maps?");
      localBuilder.setCancelable(true);
      localBuilder.setPositiveButton(r.a("OK", 2131231604), new DialogInterface.OnClickListener(paramg)
      {
        public void onClick(DialogInterface paramDialogInterface, int paramInt)
        {
          try
          {
            paramDialogInterface = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.google.android.apps.maps"));
            this.a.l().startActivityForResult(paramDialogInterface, 500);
            return;
          }
          catch (Exception paramDialogInterface)
          {
            n.a("tmessages", paramDialogInterface);
          }
        }
      });
      localBuilder.setNegativeButton(r.a("Cancel", 2131230943), null);
      paramg.b(localBuilder.create());
    }
    return false;
  }

  public static byte[] a(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null)
      return null;
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    int i1 = 0;
    if (i1 < paramArrayOfByte.length)
    {
      int i2 = paramArrayOfByte[i1];
      if (i2 == 61)
        i1 += 1;
      while (true)
      {
        try
        {
          i2 = Character.digit((char)paramArrayOfByte[i1], 16);
          i1 += 1;
          localByteArrayOutputStream.write((char)((i2 << 4) + Character.digit((char)paramArrayOfByte[i1], 16)));
          i1 += 1;
        }
        catch (Exception paramArrayOfByte)
        {
          n.a("tmessages", paramArrayOfByte);
          return null;
        }
        localByteArrayOutputStream.write(i2);
      }
    }
    paramArrayOfByte = localByteArrayOutputStream.toByteArray();
    try
    {
      localByteArrayOutputStream.close();
      return paramArrayOfByte;
    }
    catch (Exception localException)
    {
      n.a("tmessages", localException);
    }
    return paramArrayOfByte;
  }

  private static double[] a(int paramInt1, int paramInt2, int paramInt3)
  {
    double d5 = paramInt1 / 255.0D;
    double d3 = paramInt2 / 255.0D;
    double d4 = paramInt3 / 255.0D;
    double d1;
    double d2;
    label63: double d7;
    double d6;
    if ((d5 > d3) && (d5 > d4))
    {
      d1 = d5;
      if ((d5 >= d3) || (d5 >= d4))
        break label126;
      d2 = d5;
      d7 = d1 - d2;
      if (d1 != 0.0D)
        break label148;
      d6 = 0.0D;
    }
    while (true)
    {
      if (d1 != d2)
        break label157;
      d2 = 0.0D;
      return new double[] { d2, d6, d1 };
      if (d3 > d4)
      {
        d1 = d3;
        break;
      }
      d1 = d4;
      break;
      label126: if (d3 < d4)
      {
        d2 = d3;
        break label63;
      }
      d2 = d4;
      break label63;
      label148: d6 = d7 / d1;
    }
    label157: if ((d5 > d3) && (d5 > d4))
    {
      d2 = (d3 - d4) / d7;
      if (d3 < d4)
      {
        paramInt1 = 6;
        label194: d2 = paramInt1 + d2;
      }
    }
    while (true)
    {
      d2 /= 6.0D;
      break;
      paramInt1 = 0;
      break label194;
      if (d3 > d4)
      {
        d2 = (d4 - d5) / d7 + 2.0D;
        continue;
      }
      d2 = (d5 - d3) / d7 + 4.0D;
    }
  }

  private static int[] a(double paramDouble1, double paramDouble2, double paramDouble3)
  {
    double d2 = (int)Math.floor(6.0D * paramDouble1);
    double d3 = 6.0D * paramDouble1 - d2;
    paramDouble1 = (1.0D - paramDouble2) * paramDouble3;
    double d1 = (1.0D - d3 * paramDouble2) * paramDouble3;
    paramDouble2 = (1.0D - (1.0D - d3) * paramDouble2) * paramDouble3;
    switch ((int)d2 % 6)
    {
    default:
      paramDouble3 = 0.0D;
      paramDouble2 = 0.0D;
      paramDouble1 = 0.0D;
    case 0:
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    }
    while (true)
    {
      return new int[] { (int)(paramDouble1 * 255.0D), (int)(paramDouble2 * 255.0D), (int)(255.0D * paramDouble3) };
      d1 = paramDouble1;
      paramDouble1 = paramDouble3;
      paramDouble3 = d1;
      continue;
      paramDouble2 = paramDouble3;
      paramDouble3 = paramDouble1;
      paramDouble1 = d1;
      continue;
      d1 = paramDouble3;
      paramDouble3 = paramDouble2;
      paramDouble2 = d1;
      continue;
      paramDouble2 = d1;
      continue;
      d1 = paramDouble2;
      paramDouble2 = paramDouble1;
      paramDouble1 = d1;
      continue;
      paramDouble2 = paramDouble1;
      paramDouble1 = paramDouble3;
      paramDouble3 = d1;
    }
  }

  public static int[] a(Drawable paramDrawable)
  {
    int i3 = -16777216;
    int i2 = i3;
    try
    {
      if ((paramDrawable instanceof BitmapDrawable))
      {
        i2 = i3;
        paramDrawable = ((BitmapDrawable)paramDrawable).getBitmap();
        i1 = i3;
        if (paramDrawable != null)
        {
          i2 = i3;
          paramDrawable = c.a(paramDrawable, 1, 1, true);
          i1 = i3;
          if (paramDrawable != null)
          {
            i2 = i3;
            i1 = paramDrawable.getPixel(0, 0);
            i2 = i1;
            paramDrawable.recycle();
          }
        }
      }
      while (true)
      {
        paramDrawable = a(i1 >> 16 & 0xFF, i1 >> 8 & 0xFF, i1 & 0xFF);
        paramDrawable[1] = Math.min(1.0D, paramDrawable[1] + 0.05D + 0.1D * (1.0D - paramDrawable[1]));
        paramDrawable[2] = Math.max(0.0D, paramDrawable[2] * 0.65D);
        paramDrawable = a(paramDrawable[0], paramDrawable[1], paramDrawable[2]);
        return new int[] { Color.argb(102, paramDrawable[0], paramDrawable[1], paramDrawable[2]), Color.argb(136, paramDrawable[0], paramDrawable[1], paramDrawable[2]) };
        i1 = i3;
        i2 = i3;
        if (!(paramDrawable instanceof ColorDrawable))
          continue;
        i2 = i3;
        i1 = ((ColorDrawable)paramDrawable).getColor();
      }
    }
    catch (Exception paramDrawable)
    {
      while (true)
      {
        n.a("tmessages", paramDrawable);
        int i1 = i2;
      }
    }
  }

  public static float b(float paramFloat)
  {
    if (paramFloat == 0.0F)
      return 0.0F;
    return b * paramFloat;
  }

  public static int b(int paramInt)
  {
    return 0xFFFF & paramInt;
  }

  public static SpannableStringBuilder b(String paramString)
  {
    return a(paramString, 7);
  }

  public static File b()
  {
    Object localObject1 = null;
    while (true)
    {
      try
      {
        String str = Environment.getExternalStorageState();
        localObject1 = str;
        if (localObject1 == null)
          continue;
        if (!((String)localObject1).startsWith("mounted"));
      }
      catch (Exception localException3)
      {
        try
        {
          localObject1 = ApplicationLoader.a.getExternalCacheDir();
          if (localObject1 != null)
          {
            return localObject1;
            localException3 = localException3;
            n.a("tmessages", localException3);
          }
        }
        catch (Exception localException1)
        {
          n.a("tmessages", localException1);
        }
      }
      try
      {
        File localFile = ApplicationLoader.a.getCacheDir();
        Object localObject2 = localFile;
        if (localFile != null)
          continue;
        return new File("");
      }
      catch (Exception localException2)
      {
        while (true)
          n.a("tmessages", localException2);
      }
    }
  }

  public static void b(long paramLong)
  {
    try
    {
      Intent localIntent = a(paramLong, true);
      localIntent.setAction("com.android.launcher.action.UNINSTALL_SHORTCUT");
      ApplicationLoader.a.sendBroadcast(localIntent);
      return;
    }
    catch (Exception localException)
    {
      n.a("tmessages", localException);
    }
  }

  public static void b(Activity paramActivity)
  {
    if (paramActivity == null);
    while (true)
    {
      return;
      try
      {
        if (l == -10)
          continue;
        paramActivity.setRequestedOrientation(l);
        l = -10;
        return;
      }
      catch (Exception paramActivity)
      {
        n.a("tmessages", paramActivity);
      }
    }
  }

  public static void b(Activity paramActivity, int paramInt)
  {
    if ((paramActivity == null) || (c()));
    do
      return;
    while (r != paramInt);
    paramActivity.getWindow().setSoftInputMode(32);
  }

  public static void b(Uri paramUri)
  {
    if (paramUri == null)
      return;
    try
    {
      Intent localIntent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
      localIntent.setData(paramUri);
      ApplicationLoader.a.sendBroadcast(localIntent);
      return;
    }
    catch (Exception paramUri)
    {
      n.a("tmessages", paramUri);
    }
  }

  public static void b(View paramView)
  {
    if (paramView == null);
    while (true)
    {
      return;
      try
      {
        InputMethodManager localInputMethodManager = (InputMethodManager)paramView.getContext().getSystemService("input_method");
        if (!localInputMethodManager.isActive())
          continue;
        localInputMethodManager.hideSoftInputFromWindow(paramView.getWindowToken(), 0);
        return;
      }
      catch (Exception paramView)
      {
        n.a("tmessages", paramView);
      }
    }
  }

  public static void b(CharSequence paramCharSequence)
  {
    try
    {
      ((ClipboardManager)ApplicationLoader.a.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", paramCharSequence));
      return;
    }
    catch (Exception paramCharSequence)
    {
      n.a("tmessages", paramCharSequence);
    }
  }

  public static void b(Runnable paramRunnable)
  {
    ApplicationLoader.b.removeCallbacks(paramRunnable);
  }

  public static void b(boolean paramBoolean)
  {
    synchronized (p)
    {
      n = paramBoolean;
      return;
    }
  }

  public static byte[] b(byte[] paramArrayOfByte)
  {
    paramArrayOfByte = Utilities.b(paramArrayOfByte);
    byte[] arrayOfByte = new byte[16];
    System.arraycopy(paramArrayOfByte, 0, arrayOfByte, 0, 16);
    return arrayOfByte;
  }

  public static int c(int paramInt)
  {
    return paramInt >> 16 & 0xFFFF;
  }

  public static int c(View paramView)
  {
    if ((paramView == null) || (Build.VERSION.SDK_INT < 21) || (paramView.getHeight() == c.y) || (paramView.getHeight() == c.y - a))
      return 0;
    try
    {
      if (u == null)
      {
        u = View.class.getDeclaredField("mAttachInfo");
        u.setAccessible(true);
      }
      paramView = u.get(paramView);
      if (paramView != null)
      {
        if (v == null)
        {
          v = paramView.getClass().getDeclaredField("mStableInsets");
          v.setAccessible(true);
        }
        int i1 = ((Rect)v.get(paramView)).bottom;
        return i1;
      }
    }
    catch (Exception paramView)
    {
      n.a("tmessages", paramView);
    }
    return 0;
  }

  public static String c(long paramLong)
  {
    if (paramLong < 1024L)
      return String.format("%d B", new Object[] { Long.valueOf(paramLong) });
    if (paramLong < 1048576L)
      return String.format("%.1f KB", new Object[] { Float.valueOf((float)paramLong / 1024.0F) });
    if (paramLong < 1073741824L)
      return String.format("%.1f MB", new Object[] { Float.valueOf((float)paramLong / 1024.0F / 1024.0F) });
    return String.format("%.1f GB", new Object[] { Float.valueOf((float)paramLong / 1024.0F / 1024.0F / 1024.0F) });
  }

  @SuppressLint({"NewApi"})
  public static String c(Uri paramUri)
  {
    int i2 = 0;
    while (true)
    {
      try
      {
        if (Build.VERSION.SDK_INT < 19)
          break label325;
        i1 = 1;
        if ((i1 == 0) || (!DocumentsContract.isDocumentUri(ApplicationLoader.a, paramUri)))
          continue;
        if (!d(paramUri))
          continue;
        paramUri = DocumentsContract.getDocumentId(paramUri).split(":");
        if ("primary".equalsIgnoreCase(paramUri[0]))
        {
          return Environment.getExternalStorageDirectory() + "/" + paramUri[1];
          if (!e(paramUri))
            continue;
          paramUri = DocumentsContract.getDocumentId(paramUri);
          paramUri = ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.valueOf(paramUri).longValue());
          return a(ApplicationLoader.a, paramUri, null, null);
          if (f(paramUri))
          {
            Object localObject = DocumentsContract.getDocumentId(paramUri).split(":");
            paramUri = localObject[0];
            switch (paramUri.hashCode())
            {
            case 100313435:
              localObject = localObject[1];
              return a(ApplicationLoader.a, paramUri, "_id=?", new String[] { localObject });
              if (!paramUri.equals("image"))
                break;
              i1 = i2;
              break;
            case 112202875:
              if (!paramUri.equals("video"))
                break;
              i1 = 1;
              break;
            case 93166550:
              if (!paramUri.equals("audio"))
                break;
              i1 = 2;
              break label332;
              paramUri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
              continue;
              paramUri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
              continue;
              paramUri = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
              continue;
              if ("content".equalsIgnoreCase(paramUri.getScheme()))
                return a(ApplicationLoader.a, paramUri, null, null);
              if ("file".equalsIgnoreCase(paramUri.getScheme()))
              {
                paramUri = paramUri.getPath();
                return paramUri;
              }
            }
          }
        }
      }
      catch (Exception paramUri)
      {
        n.a("tmessages", paramUri);
      }
      return null;
      label325: int i1 = 0;
      continue;
      i1 = -1;
      label332: switch (i1)
      {
      case 0:
      case 1:
      case 2:
      }
      paramUri = null;
    }
  }

  public static void c(Activity paramActivity)
  {
    if (d.a);
    for (String str = d.g; ; str = d.f)
    {
      net.hockeyapp.android.b.a(paramActivity, str, new net.hockeyapp.android.c()
      {
        public boolean b()
        {
          return true;
        }
      });
      return;
    }
  }

  public static void c(String paramString)
  {
    if (paramString == null)
      return;
    b(Uri.fromFile(new File(paramString)));
  }

  public static boolean c()
  {
    if (q == null)
      q = Boolean.valueOf(ApplicationLoader.a.getResources().getBoolean(2131492865));
    return q.booleanValue();
  }

  public static boolean c(boolean paramBoolean)
  {
    boolean bool = s.a().a(paramBoolean);
    if (paramBoolean)
      s.a().b();
    return (ad.i.length() > 0) && (bool) && ((ad.k) || ((ad.m != 0) && (ad.n != 0) && (!ad.k) && (ad.n + ad.m <= ConnectionsManager.a().b())));
  }

  public static String d(int paramInt)
  {
    if (paramInt < 60)
      return r.b("Seconds", paramInt);
    if (paramInt < 3600)
      return r.b("Minutes", paramInt / 60);
    if (paramInt < 86400)
      return r.b("Hours", paramInt / 60 / 60);
    if (paramInt < 604800)
      return r.b("Days", paramInt / 60 / 60 / 24);
    int i1 = paramInt / 60 / 60 / 24;
    if (paramInt % 7 == 0)
      return r.b("Weeks", i1 / 7);
    return String.format("%s %s", new Object[] { r.b("Weeks", i1 / 7), r.b("Days", i1 % 7) });
  }

  public static void d(Activity paramActivity)
  {
    if (d.a)
      if (!d.a)
        break label22;
    label22: for (String str = d.g; ; str = d.f)
    {
      net.hockeyapp.android.m.a(paramActivity, str);
      return;
    }
  }

  @SuppressLint({"NewApi"})
  public static void d(View paramView)
  {
    if ((Build.VERSION.SDK_INT < 21) || (paramView == null));
    do
    {
      while (true)
      {
        return;
        if (!(paramView instanceof ListView))
          break;
        paramView = ((ListView)paramView).getSelector();
        if (paramView == null)
          continue;
        paramView.setState(StateSet.NOTHING);
        return;
      }
      paramView = paramView.getBackground();
    }
    while (paramView == null);
    paramView.setState(StateSet.NOTHING);
    paramView.jumpToCurrentState();
  }

  public static boolean d()
  {
    return Math.min(c.x, c.y) / b <= 700.0F;
  }

  public static boolean d(Uri paramUri)
  {
    return "com.android.externalstorage.documents".equals(paramUri.getAuthority());
  }

  public static int e()
  {
    if (!d())
    {
      i3 = Math.min(c.x, c.y);
      i2 = i3 * 35 / 100;
      i1 = i2;
      if (i2 < a(320.0F))
        i1 = a(320.0F);
      return i3 - i1;
    }
    int i3 = Math.min(c.x, c.y);
    int i4 = Math.max(c.x, c.y);
    int i2 = i4 * 35 / 100;
    int i1 = i2;
    if (i2 < a(320.0F))
      i1 = a(320.0F);
    return Math.min(i3, i4 - i1);
  }

  public static boolean e(Uri paramUri)
  {
    return "com.android.providers.downloads.documents".equals(paramUri.getAuthority());
  }

  public static int f()
  {
    if (e == null)
    {
      if (Build.VERSION.SDK_INT < 16)
        break label30;
      e = Integer.valueOf(1280);
    }
    while (true)
    {
      return e.intValue();
      label30: e = Integer.valueOf(800);
    }
  }

  public static boolean f(Uri paramUri)
  {
    return "com.android.providers.media.documents".equals(paramUri.getAuthority());
  }

  public static Point g()
  {
    Point localPoint = new Point();
    try
    {
      WindowManager localWindowManager = (WindowManager)ApplicationLoader.a.getSystemService("window");
      if (Build.VERSION.SDK_INT >= 17)
      {
        localWindowManager.getDefaultDisplay().getRealSize(localPoint);
        return localPoint;
      }
      try
      {
        Method localMethod1 = Display.class.getMethod("getRawWidth", new Class[0]);
        Method localMethod2 = Display.class.getMethod("getRawHeight", new Class[0]);
        localPoint.set(((Integer)localMethod1.invoke(localWindowManager.getDefaultDisplay(), new Object[0])).intValue(), ((Integer)localMethod2.invoke(localWindowManager.getDefaultDisplay(), new Object[0])).intValue());
        return localPoint;
      }
      catch (Exception localException2)
      {
        localPoint.set(localWindowManager.getDefaultDisplay().getWidth(), localWindowManager.getDefaultDisplay().getHeight());
        n.a("tmessages", localException2);
        return localPoint;
      }
    }
    catch (Exception localException1)
    {
      n.a("tmessages", localException1);
    }
    return localPoint;
  }

  public static void h()
  {
    if (d.a)
      net.hockeyapp.android.m.a();
  }

  public static File i()
  {
    try
    {
      File localFile = k();
      String str = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.US).format(new Date());
      localFile = new File(localFile, "IMG_" + str + ".jpg");
      return localFile;
    }
    catch (Exception localException)
    {
      n.a("tmessages", localException);
    }
    return null;
  }

  public static File j()
  {
    try
    {
      File localFile = k();
      String str = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.US).format(new Date());
      localFile = new File(localFile, "VID_" + str + ".mp4");
      return localFile;
    }
    catch (Exception localException)
    {
      n.a("tmessages", localException);
    }
    return null;
  }

  private static File k()
  {
    if ((Build.VERSION.SDK_INT >= 23) && (ApplicationLoader.a.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0))
      return m.a().b(4);
    File localFile1;
    if ("mounted".equals(Environment.getExternalStorageState()))
    {
      File localFile2 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), "Telegram");
      localFile1 = localFile2;
      if (!localFile2.mkdirs())
      {
        localFile1 = localFile2;
        if (!localFile2.exists())
        {
          n.b("tmessages", "failed to create directory");
          return null;
        }
      }
    }
    else
    {
      n.b("tmessages", "External storage is not mounted READ/WRITE.");
      localFile1 = null;
    }
    return localFile1;
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.a
 * JD-Core Version:    0.6.0
 */