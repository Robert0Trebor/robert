package org.vidogram.messenger.a.a;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.logging.Level;
import java.util.logging.Logger;

public class a extends org.vidogram.messenger.a.a
{
  static final Logger v = Logger.getLogger(a.class.getName());
  private final Level A;
  private BigDecimal w;
  private BigDecimal x;
  private short y;
  private byte z;

  public a(InputStream paramInputStream)
  {
    this(paramInputStream, Level.FINEST);
  }

  public a(InputStream paramInputStream, Level paramLevel)
  {
    this.A = paramLevel;
    paramInputStream = new d(paramInputStream);
    if (v.isLoggable(paramLevel))
      v.log(paramLevel, paramInputStream.toString());
    a(paramInputStream.c("ftyp"));
    b(paramInputStream.a("moov"));
  }

  void a(b paramb)
  {
    if (v.isLoggable(this.A))
      v.log(this.A, paramb.toString());
    this.a = paramb.a(4, "ISO8859_1").trim();
    if (this.a.matches("M4V|MP4|mp42|isom"))
      v.warning(paramb.n() + ": brand=" + this.a + " (experimental)");
    while (true)
    {
      this.b = String.valueOf(paramb.h());
      return;
      if (this.a.matches("M4A|M4P"))
        continue;
      v.warning(paramb.n() + ": brand=" + this.a + " (expected M4A or M4P)");
    }
  }

  void b(b paramb)
  {
    if (v.isLoggable(this.A))
      v.log(this.A, paramb.toString());
    while (paramb.d())
    {
      b localb = paramb.t();
      String str = localb.o();
      int i = -1;
      switch (str.hashCode())
      {
      default:
      case 3363941:
      case 3568424:
      case 3585340:
      }
      while (true)
        switch (i)
        {
        default:
          break;
        case 0:
          c(localb);
          break;
          if (!str.equals("mvhd"))
            continue;
          i = 0;
          continue;
          if (!str.equals("trak"))
            continue;
          i = 1;
          continue;
          if (!str.equals("udta"))
            continue;
          i = 2;
        case 1:
        case 2:
        }
      d(localb);
      continue;
      g(localb);
    }
  }

  void c(b paramb)
  {
    if (v.isLoggable(this.A))
      v.log(this.A, paramb.toString());
    int j = paramb.f();
    paramb.b(3);
    int i;
    long l;
    if (j == 1)
    {
      i = 16;
      paramb.b(i);
      i = paramb.h();
      if (j != 1)
        break label111;
      l = paramb.i();
      label66: if (this.c != 0L)
        break label121;
      this.c = (l * 1000L / i);
    }
    while (true)
    {
      this.x = paramb.l();
      this.w = paramb.k();
      return;
      i = 8;
      break;
      label111: l = paramb.h();
      break label66;
      label121: if ((!v.isLoggable(this.A)) || (Math.abs(this.c - 1000L * l / i) <= 2L))
        continue;
      v.log(this.A, "mvhd: duration " + this.c + " -> " + l * 1000L / i);
    }
  }

  void d(b paramb)
  {
    if (v.isLoggable(this.A))
      v.log(this.A, paramb.toString());
    e(paramb.a("mdia"));
  }

  void e(b paramb)
  {
    if (v.isLoggable(this.A))
      v.log(this.A, paramb.toString());
    f(paramb.c("mdhd"));
  }

  void f(b paramb)
  {
    if (v.isLoggable(this.A))
      v.log(this.A, paramb.toString());
    int j = paramb.f();
    paramb.b(3);
    int i;
    long l;
    if (j == 1)
    {
      i = 16;
      paramb.b(i);
      i = paramb.h();
      if (j != 1)
        break label95;
      l = paramb.i();
      label66: if (this.c != 0L)
        break label105;
      this.c = (l * 1000L / i);
    }
    label95: label105: 
    do
    {
      return;
      i = 8;
      break;
      l = paramb.h();
      break label66;
    }
    while ((!v.isLoggable(this.A)) || (Math.abs(this.c - 1000L * l / i) <= 2L));
    v.log(this.A, "mdhd: duration " + this.c + " -> " + l * 1000L / i);
  }

  void g(b paramb)
  {
    if (v.isLoggable(this.A))
      v.log(this.A, paramb.toString());
    while (paramb.d())
    {
      b localb = paramb.t();
      if (!"meta".equals(localb.o()))
        continue;
      h(localb);
    }
  }

  void h(b paramb)
  {
    if (v.isLoggable(this.A))
      v.log(this.A, paramb.toString());
    paramb.b(4);
    while (paramb.d())
    {
      b localb = paramb.t();
      if (!"ilst".equals(localb.o()))
        continue;
      i(localb);
    }
  }

  void i(b paramb)
  {
    if (v.isLoggable(this.A))
      v.log(this.A, paramb.toString());
    while (paramb.d())
    {
      b localb = paramb.t();
      if (v.isLoggable(this.A))
        v.log(this.A, localb.toString());
      if (localb.c() == 0L)
      {
        if (!v.isLoggable(this.A))
          continue;
        v.log(this.A, localb.n() + ": contains no value");
        continue;
      }
      j(localb.a("data"));
    }
  }

  void j(b paramb)
  {
    int i = 0;
    if (v.isLoggable(this.A))
      v.log(this.A, paramb.toString());
    paramb.b(4);
    paramb.b(4);
    Object localObject = paramb.p().o();
    switch (((String)localObject).hashCode())
    {
    default:
      i = -1;
      label226: switch (i)
      {
      default:
      case 0:
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      case 7:
      case 8:
      case 9:
      case 10:
      case 11:
      case 12:
      case 13:
      case 14:
      case 15:
      case 16:
      case 17:
      case 18:
      case 19:
      }
    case 5131342:
    case 2954818:
    case 5099770:
    case 5133313:
    case 5133368:
    case 5152688:
    case 3059752:
    case 3060304:
    case 3060591:
    case 5133411:
    case 5133907:
    case 3083677:
    case 3177818:
    case 5136903:
    case 5137308:
    case 5142332:
    case 5143505:
    case 3511163:
    case 3564088:
    case 3568737:
    }
    label1104: 
    do
    {
      do
      {
        do
        {
          do
          {
            do
            {
              do
              {
                return;
                if (!((String)localObject).equals("©alb"))
                  break;
                break label226;
                if (!((String)localObject).equals("aART"))
                  break;
                i = 1;
                break label226;
                if (!((String)localObject).equals("©ART"))
                  break;
                i = 2;
                break label226;
                if (!((String)localObject).equals("©cmt"))
                  break;
                i = 3;
                break label226;
                if (!((String)localObject).equals("©com"))
                  break;
                i = 4;
                break label226;
                if (!((String)localObject).equals("©wrt"))
                  break;
                i = 5;
                break label226;
                if (!((String)localObject).equals("covr"))
                  break;
                i = 6;
                break label226;
                if (!((String)localObject).equals("cpil"))
                  break;
                i = 7;
                break label226;
                if (!((String)localObject).equals("cprt"))
                  break;
                i = 8;
                break label226;
                if (!((String)localObject).equals("©cpy"))
                  break;
                i = 9;
                break label226;
                if (!((String)localObject).equals("©day"))
                  break;
                i = 10;
                break label226;
                if (!((String)localObject).equals("disk"))
                  break;
                i = 11;
                break label226;
                if (!((String)localObject).equals("gnre"))
                  break;
                i = 12;
                break label226;
                if (!((String)localObject).equals("©gen"))
                  break;
                i = 13;
                break label226;
                if (!((String)localObject).equals("©grp"))
                  break;
                i = 14;
                break label226;
                if (!((String)localObject).equals("©lyr"))
                  break;
                i = 15;
                break label226;
                if (!((String)localObject).equals("©nam"))
                  break;
                i = 16;
                break label226;
                if (!((String)localObject).equals("rtng"))
                  break;
                i = 17;
                break label226;
                if (!((String)localObject).equals("tmpo"))
                  break;
                i = 18;
                break label226;
                if (!((String)localObject).equals("trkn"))
                  break;
                i = 19;
                break label226;
                this.g = paramb.b("UTF-8");
                return;
                this.f = paramb.b("UTF-8");
                return;
                this.e = paramb.b("UTF-8");
                return;
                this.j = paramb.b("UTF-8");
                return;
              }
              while ((this.p != null) && (this.p.trim().length() != 0));
              this.p = paramb.b("UTF-8");
              return;
              while (true)
              {
                try
                {
                  paramb = paramb.j();
                  localObject = new BitmapFactory.Options();
                  ((BitmapFactory.Options)localObject).inJustDecodeBounds = true;
                  ((BitmapFactory.Options)localObject).inSampleSize = 1;
                  BitmapFactory.decodeByteArray(paramb, 0, paramb.length, (BitmapFactory.Options)localObject);
                  if ((((BitmapFactory.Options)localObject).outWidth <= 800) && (((BitmapFactory.Options)localObject).outHeight <= 800))
                    continue;
                  i = Math.max(((BitmapFactory.Options)localObject).outWidth, ((BitmapFactory.Options)localObject).outHeight);
                  if (i <= 800)
                    continue;
                  ((BitmapFactory.Options)localObject).inSampleSize *= 2;
                  i /= 2;
                  continue;
                  ((BitmapFactory.Options)localObject).inJustDecodeBounds = false;
                  this.t = BitmapFactory.decodeByteArray(paramb, 0, paramb.length, (BitmapFactory.Options)localObject);
                  if (this.t == null)
                    break;
                  float f = Math.max(this.t.getWidth(), this.t.getHeight()) / 120.0F;
                  if (f > 0.0F)
                  {
                    this.u = Bitmap.createScaledBitmap(this.t, (int)(this.t.getWidth() / f), (int)(this.t.getHeight() / f), true);
                    if (this.u != null)
                      break;
                    this.u = this.t;
                    return;
                  }
                }
                catch (Exception paramb)
                {
                  paramb.printStackTrace();
                  return;
                }
                this.u = this.t;
              }
              this.r = paramb.e();
              return;
            }
            while ((this.o != null) && (this.o.trim().length() != 0));
            this.o = paramb.b("UTF-8");
            return;
            paramb = paramb.b("UTF-8").trim();
          }
          while (paramb.length() < 4);
          try
          {
            this.h = Short.valueOf(paramb.substring(0, 4)).shortValue();
            return;
          }
          catch (java.lang.NumberFormatException paramb)
          {
            return;
          }
          paramb.b(2);
          this.m = paramb.g();
          this.n = paramb.g();
          return;
        }
        while ((this.i != null) && (this.i.trim().length() != 0));
        if (paramb.c() != 2L)
          break label1104;
        paramb = org.vidogram.messenger.a.b.a.a(paramb.g() - 1);
      }
      while (paramb == null);
      this.i = paramb.a();
      return;
      this.i = paramb.b("UTF-8");
      return;
    }
    while ((this.i != null) && (this.i.trim().length() != 0));
    this.i = paramb.b("UTF-8");
    return;
    this.q = paramb.b("UTF-8");
    return;
    this.s = paramb.b("UTF-8");
    return;
    this.d = paramb.b("UTF-8");
    return;
    this.z = paramb.f();
    return;
    this.y = paramb.g();
    return;
    paramb.b(2);
    this.k = paramb.g();
    this.l = paramb.g();
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.a.a.a
 * JD-Core Version:    0.6.0
 */