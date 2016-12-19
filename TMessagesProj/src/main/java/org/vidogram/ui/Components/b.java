package org.vidogram.ui.Components;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextPaint;
import org.vidogram.messenger.ApplicationLoader;
import org.vidogram.messenger.a;
import org.vidogram.messenger.n;
import org.vidogram.tgnet.g.i;
import org.vidogram.tgnet.g.vw;
import org.vidogram.ui.a.l;

public class b extends Drawable
{
  private static Paint a = new Paint(1);
  private static TextPaint b;
  private static TextPaint c;
  private static int[] d = { -1743531, -881592, -7436818, -8992691, -10502443, -11232035, -7436818, -887654 };
  private static int[] e = { -2592923, -615071, -7570990, -9981091, -11099461, -11500111, -7570990, -819290 };
  private static int[] f = { -3514282, -947900, -8557884, -11099828, -12283220, l.b, -8557884, -11762506 };
  private static int[] g = { -406587, -139832, -3291923, -4133446, -4660496, -2626822, -3291923, -4990985 };
  private static int[] h = { -3516848, -2589911, -11627828, -11488718, -12406360, -11627828, -11627828, -11627828 };
  private static int[] i = { -4437183, -1674199, -9216066, -12020419, -13007715, -11959891, -9216066, -11959891 };
  private static Drawable j;
  private static Drawable k;
  private int l;
  private StaticLayout m;
  private float n;
  private float o;
  private float p;
  private boolean q;
  private boolean r;
  private boolean s;
  private boolean t;
  private StringBuilder u = new StringBuilder(5);

  public b()
  {
    if (b == null)
    {
      b = new TextPaint(1);
      b.setColor(-1);
      c = new TextPaint(1);
      c.setColor(-1);
      j = ApplicationLoader.a.getResources().getDrawable(2130837666);
    }
    b.setTextSize(a.a(20.0F));
    c.setTextSize(a.a(14.0F));
  }

  public b(g.i parami)
  {
    this(parami, false);
  }

  public b(g.i parami, boolean paramBoolean)
  {
    this();
    this.q = paramBoolean;
    int i1;
    String str;
    if (parami != null)
    {
      i1 = parami.h;
      str = parami.i;
      if (parami.h >= 0)
        break label44;
    }
    label44: for (paramBoolean = true; ; paramBoolean = false)
    {
      a(i1, str, null, paramBoolean, null);
      return;
    }
  }

  public b(g.vw paramvw)
  {
    this(paramvw, false);
  }

  public b(g.vw paramvw, boolean paramBoolean)
  {
    this();
    this.q = paramBoolean;
    if (paramvw != null)
      a(paramvw.d, paramvw.e, paramvw.f, false, null);
  }

  public static int a(int paramInt)
  {
    if ((paramInt >= 0) && (paramInt < 8))
      return paramInt;
    return Math.abs(paramInt % d.length);
  }

  public static int b(int paramInt)
  {
    return d[a(paramInt)];
  }

  public static int c(int paramInt)
  {
    return i[a(paramInt)];
  }

  public static int d(int paramInt)
  {
    return e[a(paramInt)];
  }

  public static int e(int paramInt)
  {
    return g[a(paramInt)];
  }

  public static int f(int paramInt)
  {
    return f[a(paramInt)];
  }

  public static int g(int paramInt)
  {
    return h[a(paramInt)];
  }

  public void a(int paramInt, String paramString1, String paramString2, boolean paramBoolean)
  {
    a(paramInt, paramString1, paramString2, paramBoolean, null);
  }

  public void a(int paramInt, String paramString1, String paramString2, boolean paramBoolean, String paramString3)
  {
    if (this.q)
      this.l = e[a(paramInt)];
    while (true)
    {
      this.r = paramBoolean;
      String str2;
      String str1;
      if (paramString1 != null)
      {
        str2 = paramString1;
        str1 = paramString2;
        if (paramString1.length() != 0);
      }
      else
      {
        str1 = null;
        str2 = paramString2;
      }
      this.u.setLength(0);
      if (paramString3 != null)
      {
        this.u.append(paramString3);
        label71: if (this.u.length() <= 0)
          break;
        paramString2 = this.u.toString().toUpperCase();
      }
      else
      {
        try
        {
          if (this.t);
          for (paramString1 = c; ; paramString1 = b)
          {
            this.m = new StaticLayout(paramString2, paramString1, a.a(100.0F), Layout.Alignment.ALIGN_NORMAL, 1.0F, 0.0F, false);
            if (this.m.getLineCount() > 0)
            {
              this.p = this.m.getLineLeft(0);
              this.n = this.m.getLineWidth(0);
              this.o = this.m.getLineBottom(0);
            }
            return;
            this.l = d[a(paramInt)];
            break;
            if ((str2 != null) && (str2.length() > 0))
              this.u.append(str2.substring(0, 1));
            if ((str1 != null) && (str1.length() > 0))
            {
              paramInt = str1.length() - 1;
              paramString1 = null;
              while (true)
              {
                if ((paramInt < 0) || ((paramString1 != null) && (str1.charAt(paramInt) == ' ')))
                {
                  if (Build.VERSION.SDK_INT >= 16)
                    this.u.append("‌");
                  this.u.append(paramString1);
                  break;
                }
                paramString1 = str1.substring(paramInt, paramInt + 1);
                paramInt -= 1;
              }
            }
            if ((str2 == null) || (str2.length() <= 0))
              break label71;
            paramInt = str2.length() - 1;
            while (paramInt >= 0)
            {
              if ((str2.charAt(paramInt) == ' ') && (paramInt != str2.length() - 1) && (str2.charAt(paramInt + 1) != ' '))
              {
                if (Build.VERSION.SDK_INT >= 16)
                  this.u.append("‌");
                this.u.append(str2.substring(paramInt + 1, paramInt + 2));
                break;
              }
              paramInt -= 1;
            }
          }
        }
        catch (java.lang.Exception paramString1)
        {
          n.a("tmessages", paramString1);
          return;
        }
      }
    }
    this.m = null;
  }

  public void a(g.i parami)
  {
    int i1;
    String str;
    if (parami != null)
    {
      i1 = parami.h;
      str = parami.i;
      if (parami.h >= 0)
        break label35;
    }
    label35: for (boolean bool = true; ; bool = false)
    {
      a(i1, str, null, bool, null);
      return;
    }
  }

  public void a(g.vw paramvw)
  {
    if (paramvw != null)
      a(paramvw.d, paramvw.e, paramvw.f, false, null);
  }

  public void a(boolean paramBoolean)
  {
    this.q = paramBoolean;
  }

  public void b(boolean paramBoolean)
  {
    this.t = paramBoolean;
  }

  public void c(boolean paramBoolean)
  {
    if ((paramBoolean) && (k == null))
      k = ApplicationLoader.a.getResources().getDrawable(2130838045);
    this.s = paramBoolean;
  }

  public void draw(Canvas paramCanvas)
  {
    Rect localRect = getBounds();
    if (localRect == null)
      return;
    int i1 = localRect.width();
    a.setColor(this.l);
    paramCanvas.save();
    paramCanvas.translate(localRect.left, localRect.top);
    paramCanvas.drawCircle(i1 / 2, i1 / 2, i1 / 2, a);
    int i2;
    if ((this.r) && (j != null))
    {
      i2 = (i1 - j.getIntrinsicWidth()) / 2;
      i1 = (i1 - j.getIntrinsicHeight()) / 2;
      j.setBounds(i2, i1, j.getIntrinsicWidth() + i2, j.getIntrinsicHeight() + i1);
      j.draw(paramCanvas);
    }
    while (true)
    {
      paramCanvas.restore();
      return;
      if (this.m != null)
      {
        paramCanvas.translate((i1 - this.n) / 2.0F - this.p, (i1 - this.o) / 2.0F);
        this.m.draw(paramCanvas);
        continue;
      }
      if ((!this.s) || (k == null))
        continue;
      i2 = (i1 - k.getIntrinsicWidth()) / 2;
      i1 = (i1 - k.getIntrinsicHeight()) / 2;
      k.setBounds(i2, i1, k.getIntrinsicWidth() + i2, k.getIntrinsicHeight() + i1);
      k.draw(paramCanvas);
    }
  }

  public int getIntrinsicHeight()
  {
    return 0;
  }

  public int getIntrinsicWidth()
  {
    return 0;
  }

  public int getOpacity()
  {
    return -2;
  }

  public void h(int paramInt)
  {
    this.l = paramInt;
  }

  public void setAlpha(int paramInt)
  {
  }

  public void setColorFilter(ColorFilter paramColorFilter)
  {
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.Components.b
 * JD-Core Version:    0.6.0
 */