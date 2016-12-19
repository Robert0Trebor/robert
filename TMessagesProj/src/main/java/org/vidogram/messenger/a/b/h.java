package org.vidogram.messenger.a.b;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class h extends org.vidogram.messenger.a.a
{
  static final Logger v = Logger.getLogger(h.class.getName());
  private final Level w;
  private byte x;

  public h(InputStream paramInputStream, Level paramLevel)
  {
    this.w = paramLevel;
    j localj;
    i locali;
    if (a(paramInputStream))
    {
      localj = new j(paramInputStream);
      this.a = "ID3";
      this.b = String.format("2.%d.%d", new Object[] { Integer.valueOf(localj.a()), Integer.valueOf(localj.b()) });
      locali = localj.a(paramInputStream);
    }
    while (true)
      try
      {
        if (locali.c() <= 10L)
          continue;
        localg = new g(locali);
        boolean bool = localg.i();
        if (!bool)
          continue;
        locali.a().a(locali.c());
        if (localj.c() <= 0)
          continue;
        paramInputStream.skip(localj.c());
        return;
        if (localg.c() <= locali.c())
          continue;
        if (!v.isLoggable(paramLevel))
          continue;
        v.log(paramLevel, "ID3 frame claims to extend frames area");
        continue;
      }
      catch (e localf)
      {
        g localg;
        if (!v.isLoggable(paramLevel))
          continue;
        v.log(paramLevel, "ID3 exception occured: " + locale1.getMessage());
        continue;
        if ((!localg.h()) || (localg.e()))
          continue;
        f localf = locali.a(localg);
        try
        {
          a(localf);
          localf.a().a(localf.c());
          continue;
        }
        catch (e locale2)
        {
          if (!v.isLoggable(paramLevel))
            continue;
          v.log(paramLevel, String.format("ID3 exception occured in frame %s: %s", new Object[] { localg.a(), locale2.getMessage() }));
          localf.a().a(localf.c());
          continue;
        }
        finally
        {
          localf.a().a(localf.c());
        }
        locali.a().a(localObject.c());
      }
  }

  public static boolean a(InputStream paramInputStream)
  {
    paramInputStream.mark(3);
    try
    {
      if ((paramInputStream.read() == 73) && (paramInputStream.read() == 68))
      {
        int i = paramInputStream.read();
        if (i == 51)
        {
          j = 1;
          return j;
        }
      }
      int j = 0;
    }
    finally
    {
      paramInputStream.reset();
    }
  }

  void a(f paramf)
  {
    int i = 0;
    if (v.isLoggable(this.w))
      v.log(this.w, "Parsing frame: " + paramf.e().a());
    Object localObject1 = paramf.e().a();
    switch (((String)localObject1).hashCode())
    {
    default:
      i = -1;
      label342: switch (i)
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
      case 20:
      case 21:
      case 22:
      case 23:
      case 24:
      case 25:
      case 26:
      case 27:
      case 28:
      case 29:
      case 30:
      case 31:
      case 32:
      }
    case 79210:
    case 2015625:
    case 66913:
    case 2074380:
    case 82815:
    case 2567331:
    case 82881:
    case 2569298:
    case 82878:
    case 2569357:
    case 82880:
    case 2569358:
    case 82883:
    case 2569360:
    case 2570401:
    case 83149:
    case 2577697:
    case 83253:
    case 2581512:
    case 83254:
    case 2581513:
    case 83269:
    case 2581856:
    case 83341:
    case 2583398:
    case 83377:
    case 2575250:
    case 83378:
    case 2575251:
    case 83552:
    case 2590194:
    case 84125:
    case 2614438:
    }
    while (true)
    {
      return;
      if (!((String)localObject1).equals("PIC"))
        break;
      break label342;
      if (!((String)localObject1).equals("APIC"))
        break;
      i = 1;
      break label342;
      if (!((String)localObject1).equals("COM"))
        break;
      i = 2;
      break label342;
      if (!((String)localObject1).equals("COMM"))
        break;
      i = 3;
      break label342;
      if (!((String)localObject1).equals("TAL"))
        break;
      i = 4;
      break label342;
      if (!((String)localObject1).equals("TALB"))
        break;
      i = 5;
      break label342;
      if (!((String)localObject1).equals("TCP"))
        break;
      i = 6;
      break label342;
      if (!((String)localObject1).equals("TCMP"))
        break;
      i = 7;
      break label342;
      if (!((String)localObject1).equals("TCM"))
        break;
      i = 8;
      break label342;
      if (!((String)localObject1).equals("TCOM"))
        break;
      i = 9;
      break label342;
      if (!((String)localObject1).equals("TCO"))
        break;
      i = 10;
      break label342;
      if (!((String)localObject1).equals("TCON"))
        break;
      i = 11;
      break label342;
      if (!((String)localObject1).equals("TCR"))
        break;
      i = 12;
      break label342;
      if (!((String)localObject1).equals("TCOP"))
        break;
      i = 13;
      break label342;
      if (!((String)localObject1).equals("TDRC"))
        break;
      i = 14;
      break label342;
      if (!((String)localObject1).equals("TLE"))
        break;
      i = 15;
      break label342;
      if (!((String)localObject1).equals("TLEN"))
        break;
      i = 16;
      break label342;
      if (!((String)localObject1).equals("TP1"))
        break;
      i = 17;
      break label342;
      if (!((String)localObject1).equals("TPE1"))
        break;
      i = 18;
      break label342;
      if (!((String)localObject1).equals("TP2"))
        break;
      i = 19;
      break label342;
      if (!((String)localObject1).equals("TPE2"))
        break;
      i = 20;
      break label342;
      if (!((String)localObject1).equals("TPA"))
        break;
      i = 21;
      break label342;
      if (!((String)localObject1).equals("TPOS"))
        break;
      i = 22;
      break label342;
      if (!((String)localObject1).equals("TRK"))
        break;
      i = 23;
      break label342;
      if (!((String)localObject1).equals("TRCK"))
        break;
      i = 24;
      break label342;
      if (!((String)localObject1).equals("TT1"))
        break;
      i = 25;
      break label342;
      if (!((String)localObject1).equals("TIT1"))
        break;
      i = 26;
      break label342;
      if (!((String)localObject1).equals("TT2"))
        break;
      i = 27;
      break label342;
      if (!((String)localObject1).equals("TIT2"))
        break;
      i = 28;
      break label342;
      if (!((String)localObject1).equals("TYE"))
        break;
      i = 29;
      break label342;
      if (!((String)localObject1).equals("TYER"))
        break;
      i = 30;
      break label342;
      if (!((String)localObject1).equals("ULT"))
        break;
      i = 31;
      break label342;
      if (!((String)localObject1).equals("USLT"))
        break;
      i = 32;
      break label342;
      if ((this.t != null) && (this.x == 3))
        continue;
      paramf = d(paramf);
      if ((this.t != null) && (paramf.a != 3) && (paramf.a != 0))
        continue;
      try
      {
        localObject1 = paramf.d;
        localObject2 = new BitmapFactory.Options();
        ((BitmapFactory.Options)localObject2).inJustDecodeBounds = true;
        ((BitmapFactory.Options)localObject2).inSampleSize = 1;
        BitmapFactory.decodeByteArray(localObject1, 0, localObject1.length, (BitmapFactory.Options)localObject2);
        if ((((BitmapFactory.Options)localObject2).outWidth > 800) || (((BitmapFactory.Options)localObject2).outHeight > 800))
        {
          i = Math.max(((BitmapFactory.Options)localObject2).outWidth, ((BitmapFactory.Options)localObject2).outHeight);
          while (i > 800)
          {
            ((BitmapFactory.Options)localObject2).inSampleSize *= 2;
            i /= 2;
          }
        }
        ((BitmapFactory.Options)localObject2).inJustDecodeBounds = false;
        this.t = BitmapFactory.decodeByteArray(localObject1, 0, localObject1.length, (BitmapFactory.Options)localObject2);
        float f;
        if (this.t != null)
        {
          f = Math.max(this.t.getWidth(), this.t.getHeight()) / 120.0F;
          if (f <= 0.0F)
            break label1268;
        }
        label1268: for (this.u = Bitmap.createScaledBitmap(this.t, (int)(this.t.getWidth() / f), (int)(this.t.getHeight() / f), true); ; this.u = this.t)
        {
          if (this.u == null)
            this.u = this.t;
          this.x = paramf.a;
          return;
        }
      }
      catch (Throwable localThrowable)
      {
        while (true)
          localThrowable.printStackTrace();
      }
      paramf = c(paramf);
      if ((this.j != null) && (paramf.b != null) && (!"".equals(paramf.b)))
        continue;
      this.j = paramf.c;
      return;
      this.g = b(paramf);
      return;
      this.r = "1".equals(b(paramf));
      return;
      this.p = b(paramf);
      return;
      Object localObject2 = b(paramf);
      if (((String)localObject2).length() <= 0)
        continue;
      this.i = ((String)localObject2);
      paramf = null;
      try
      {
        a locala;
        if (((String)localObject2).charAt(0) == '(')
        {
          i = ((String)localObject2).indexOf(')');
          if (i > 1)
          {
            locala = a.a(Integer.parseInt(((String)localObject2).substring(1, i)));
            paramf = locala;
            if (locala == null)
            {
              paramf = locala;
              if (((String)localObject2).length() > i + 1)
                this.i = ((String)localObject2).substring(i + 1);
            }
          }
        }
        for (paramf = locala; paramf != null; paramf = a.a(Integer.parseInt((String)localObject2)))
        {
          this.i = paramf.a();
          return;
        }
        this.o = b(paramf);
        return;
        paramf = b(paramf);
        if (paramf.length() < 4)
          continue;
        try
        {
          this.h = Short.valueOf(paramf.substring(0, 4)).shortValue();
          return;
        }
        catch (NumberFormatException localNumberFormatException1)
        {
        }
        if (!v.isLoggable(this.w))
          continue;
        v.log(this.w, "Could not parse year from: " + paramf);
        return;
        paramf = b(paramf);
        try
        {
          this.c = Long.valueOf(paramf).longValue();
          return;
        }
        catch (NumberFormatException localNumberFormatException2)
        {
        }
        if (!v.isLoggable(this.w))
          continue;
        v.log(this.w, "Could not parse track duration: " + paramf);
        return;
        this.e = b(paramf);
        return;
        this.f = b(paramf);
        return;
        paramf = b(paramf);
        if (paramf.length() <= 0)
          continue;
        i = paramf.indexOf('/');
        if (i < 0)
        {
          try
          {
            this.m = Short.valueOf(paramf).shortValue();
            return;
          }
          catch (NumberFormatException localNumberFormatException3)
          {
          }
          if (!v.isLoggable(this.w))
            continue;
          v.log(this.w, "Could not parse disc number: " + paramf);
          return;
        }
        try
        {
          this.m = Short.valueOf(paramf.substring(0, i)).shortValue();
          try
          {
            this.n = Short.valueOf(paramf.substring(i + 1)).shortValue();
            return;
          }
          catch (NumberFormatException localNumberFormatException4)
          {
          }
          if (!v.isLoggable(this.w))
            continue;
          v.log(this.w, "Could not parse number of discs: " + paramf);
          return;
        }
        catch (NumberFormatException localNumberFormatException5)
        {
          while (true)
          {
            if (!v.isLoggable(this.w))
              continue;
            v.log(this.w, "Could not parse disc number: " + paramf);
          }
        }
        paramf = b(paramf);
        if (paramf.length() <= 0)
          continue;
        i = paramf.indexOf('/');
        if (i < 0)
        {
          try
          {
            this.k = Short.valueOf(paramf).shortValue();
            return;
          }
          catch (NumberFormatException localNumberFormatException6)
          {
          }
          if (!v.isLoggable(this.w))
            continue;
          v.log(this.w, "Could not parse track number: " + paramf);
          return;
        }
        try
        {
          this.k = Short.valueOf(paramf.substring(0, i)).shortValue();
          try
          {
            this.l = Short.valueOf(paramf.substring(i + 1)).shortValue();
            return;
          }
          catch (NumberFormatException localNumberFormatException7)
          {
          }
          if (!v.isLoggable(this.w))
            continue;
          v.log(this.w, "Could not parse number of tracks: " + paramf);
          return;
        }
        catch (NumberFormatException localNumberFormatException8)
        {
          while (true)
          {
            if (!v.isLoggable(this.w))
              continue;
            v.log(this.w, "Could not parse track number: " + paramf);
          }
        }
        this.q = b(paramf);
        return;
        this.d = b(paramf);
        return;
        paramf = b(paramf);
        if (paramf.length() <= 0)
          continue;
        try
        {
          this.h = Short.valueOf(paramf).shortValue();
          return;
        }
        catch (NumberFormatException localNumberFormatException9)
        {
        }
        if (!v.isLoggable(this.w))
          continue;
        v.log(this.w, "Could not parse year: " + paramf);
        return;
        if (this.s != null)
          continue;
        this.s = c(paramf).c;
        return;
      }
      catch (NumberFormatException paramf)
      {
      }
    }
  }

  String b(f paramf)
  {
    d locald = paramf.f();
    return paramf.b((int)paramf.c(), locald);
  }

  b c(f paramf)
  {
    d locald = paramf.f();
    return new b(paramf.b(3, d.a), paramf.a(200, locald), paramf.b((int)paramf.c(), locald));
  }

  a d(f paramf)
  {
    d locald = paramf.f();
    String str;
    int i;
    if (paramf.d().a() == 2)
    {
      str = paramf.b(3, d.a).toUpperCase();
      i = -1;
      switch (str.hashCode())
      {
      default:
        switch (i)
        {
        default:
          str = "image/unknown";
        case 0:
        case 1:
        }
      case 79369:
      case 73665:
      }
    }
    while (true)
    {
      return new a(paramf.a().a(), paramf.a(200, locald), str, paramf.a().a((int)paramf.c()));
      if (!str.equals("PNG"))
        break;
      i = 0;
      break;
      if (!str.equals("JPG"))
        break;
      i = 1;
      break;
      str = "image/png";
      continue;
      str = "image/jpeg";
      continue;
      str = paramf.a(20, d.a);
    }
  }

  static class a
  {
    final byte a;
    final String b;
    final String c;
    final byte[] d;

    public a(byte paramByte, String paramString1, String paramString2, byte[] paramArrayOfByte)
    {
      this.a = paramByte;
      this.b = paramString1;
      this.c = paramString2;
      this.d = paramArrayOfByte;
    }
  }

  static class b
  {
    final String a;
    final String b;
    final String c;

    public b(String paramString1, String paramString2, String paramString3)
    {
      this.a = paramString1;
      this.b = paramString2;
      this.c = paramString3;
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.a.b.h
 * JD-Core Version:    0.6.0
 */