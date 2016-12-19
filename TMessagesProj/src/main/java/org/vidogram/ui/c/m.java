package org.vidogram.ui.c;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.animation.AccelerateInterpolator;
import java.io.File;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Locale;
import org.vidogram.messenger.MediaController;
import org.vidogram.messenger.MediaController.e;
import org.vidogram.messenger.Utilities;
import org.vidogram.messenger.a;
import org.vidogram.messenger.ad;
import org.vidogram.messenger.n;
import org.vidogram.messenger.p;
import org.vidogram.messenger.q;
import org.vidogram.messenger.r;
import org.vidogram.messenger.u;
import org.vidogram.tgnet.f;
import org.vidogram.tgnet.g.au;
import org.vidogram.tgnet.g.aw;
import org.vidogram.tgnet.g.ay;
import org.vidogram.tgnet.g.az;
import org.vidogram.tgnet.g.c;
import org.vidogram.tgnet.g.d;
import org.vidogram.tgnet.g.df;
import org.vidogram.tgnet.g.dg;
import org.vidogram.tgnet.g.hs;
import org.vidogram.tgnet.g.hu;
import org.vidogram.tgnet.g.hx;
import org.vidogram.tgnet.g.hz;
import org.vidogram.tgnet.g.ie;
import org.vidogram.tgnet.g.mg;
import org.vidogram.tgnet.g.nw;
import org.vidogram.tgnet.g.q;
import org.vidogram.tgnet.g.r;
import org.vidogram.tgnet.g.ro;
import org.vidogram.tgnet.g.rp;
import org.vidogram.tgnet.g.rt;
import org.vidogram.tgnet.g.x;
import org.vidogram.tgnet.g.y;
import org.vidogram.ui.Components.as;
import org.vidogram.ui.Components.w;
import org.vidogram.ui.a.l;

public class m extends View
  implements MediaController.e
{
  private static AccelerateInterpolator C = new AccelerateInterpolator(0.5F);
  private static TextPaint r;
  private static TextPaint s;
  private static Paint t;
  private static Drawable u;
  private float A;
  private long B = 0L;
  private a D;
  private q a;
  private boolean b;
  private w c;
  private boolean d;
  private boolean e;
  private boolean f;
  private int g;
  private StaticLayout h;
  private int i = a.a(7.0F);
  private StaticLayout j;
  private int k = a.a(27.0F);
  private StaticLayout l;
  private g.d m;
  private g.q n;
  private int o;
  private boolean p;
  private u q;
  private int v;
  private int w;
  private as x;
  private long y;
  private boolean z;

  public m(Context paramContext)
  {
    super(paramContext);
    if (r == null)
    {
      r = new TextPaint(1);
      r.setTypeface(a.a("fonts/rmedium.ttf"));
      r.setColor(-14606047);
      s = new TextPaint(1);
      t = new Paint();
      t.setColor(-2500135);
      t.setStrokeWidth(1.0F);
    }
    r.setTextSize(a.a(15.0F));
    s.setTextSize(a.a(13.0F));
    this.a = new q(this);
    this.c = new w();
    this.x = new as(this);
    this.v = MediaController.a().g();
  }

  private void c()
  {
    this.q = null;
    this.o = 0;
    if (this.n != null)
      if (u.a(this.n))
        this.o = 2;
    g.mg localmg;
    while (true)
    {
      if ((this.o == 3) || (this.o == 5))
      {
        localmg = new g.mg();
        localmg.n = true;
        localmg.b = (-Utilities.b.nextInt());
        localmg.d = new g.ro();
        localObject1 = localmg.d;
        int i1 = ad.c();
        localmg.c = i1;
        ((g.aw)localObject1).c = i1;
        localmg.e = (int)(System.currentTimeMillis() / 1000L);
        localmg.i = "-1";
        localmg.j = new g.nw();
        localmg.j.k = new g.hs();
        localmg.k |= 768;
        if (this.n == null)
          break;
        localmg.j.k = this.n;
        localmg.A = "";
        this.q = new u(localmg, null, false);
      }
      return;
      if (u.c(this.n))
      {
        this.o = 6;
        continue;
      }
      if (u.f(this.n))
      {
        this.o = 5;
        continue;
      }
      if (!u.e(this.n))
        continue;
      this.o = 3;
      continue;
      if (this.m == null)
        continue;
      if (this.m.o != null)
      {
        this.o = 7;
        continue;
      }
      if (this.m.d.equals("audio"))
      {
        this.o = 5;
        continue;
      }
      if (!this.m.d.equals("voice"))
        continue;
      this.o = 3;
    }
    Object localObject2 = this.m.i;
    label343: label510: StringBuilder localStringBuilder;
    label534: String str;
    if (this.o == 5)
    {
      localObject1 = "mp3";
      localObject1 = p.b((String)localObject2, (String)localObject1);
      localmg.j.k.b = 0L;
      localmg.j.k.c = 0L;
      localmg.j.k.e = localmg.e;
      localmg.j.k.g = ("audio/" + (String)localObject1);
      localmg.j.k.h = 0;
      localmg.j.k.i = new g.rt();
      localmg.j.k.i.b = "s";
      localmg.j.k.k = 0;
      localObject2 = new g.hu();
      ((g.hu)localObject2).d = this.m.m;
      if (this.m.e == null)
        break label771;
      localObject1 = this.m.e;
      ((g.hu)localObject2).k = ((String)localObject1);
      if (this.m.f == null)
        break label777;
      localObject1 = this.m.f;
      ((g.hu)localObject2).l = ((String)localObject1);
      ((g.hu)localObject2).e |= 3;
      if (this.o == 3)
        ((g.hu)localObject2).m = true;
      localmg.j.k.o.add(localObject2);
      localObject2 = new g.hx();
      localStringBuilder = new StringBuilder().append(Utilities.e(this.m.i)).append(".");
      str = this.m.i;
      if (this.o != 5)
        break label783;
      localObject1 = "mp3";
      label639: ((g.hx)localObject2).g = p.b(str, (String)localObject1);
      localmg.j.k.o.add(localObject2);
      localObject2 = org.vidogram.messenger.m.a().b(4);
      localStringBuilder = new StringBuilder().append(Utilities.e(this.m.i)).append(".");
      str = this.m.i;
      if (this.o != 5)
        break label790;
    }
    label771: label777: label783: label790: for (Object localObject1 = "mp3"; ; localObject1 = "ogg")
    {
      localmg.A = new File((File)localObject2, p.b(str, (String)localObject1)).getAbsolutePath();
      break;
      localObject1 = "ogg";
      break label343;
      localObject1 = "";
      break label510;
      localObject1 = "";
      break label534;
      localObject1 = "ogg";
      break label639;
    }
  }

  private void d()
  {
    if ((this.o == 3) || (this.o == 5))
    {
      if (this.w != 0)
        break label59;
      if (MediaController.a().a(this.q))
      {
        this.w = 1;
        this.x.a(getDrawableForCurrentState(), false, false);
        invalidate();
      }
    }
    label59: 
    do
    {
      while (true)
      {
        return;
        if (this.w != 1)
          break;
        if (!MediaController.a().b(this.q))
          continue;
        this.w = 0;
        this.x.a(getDrawableForCurrentState(), false, false);
        invalidate();
        return;
      }
      if (this.w != 2)
        continue;
      this.x.a(0.0F, false);
      if (this.n != null)
      {
        org.vidogram.messenger.m.a().a(this.n, true, false);
        this.w = 4;
        this.x.a(getDrawableForCurrentState(), true, false);
        invalidate();
        return;
      }
      p localp = p.a();
      String str2 = this.m.i;
      if (this.o == 5);
      for (String str1 = "mp3"; ; str1 = "ogg")
      {
        localp.a(str2, str1);
        break;
      }
    }
    while (this.w != 4);
    if (this.n != null)
      org.vidogram.messenger.m.a().a(this.n);
    while (true)
    {
      this.w = 2;
      this.x.a(getDrawableForCurrentState(), false, false);
      invalidate();
      return;
      p.a().g(this.m.i);
    }
  }

  private Drawable getDrawableForCurrentState()
  {
    int i1 = 1;
    if ((this.o == 3) || (this.o == 5))
    {
      if (this.w == -1)
        return null;
      this.x.a(false);
      Drawable[] arrayOfDrawable = l.M[(this.w + 5)];
      if (this.e);
      while (true)
      {
        return arrayOfDrawable[i1];
        i1 = 0;
      }
    }
    if (this.w == 1)
      return l.N[5][0];
    return null;
  }

  public void a(String paramString)
  {
    a(false);
  }

  public void a(String paramString, float paramFloat)
  {
    this.x.a(paramFloat, true);
    if ((this.o == 3) || (this.o == 5))
      if (this.w != 4)
        a(false);
    do
      return;
    while (this.w == 1);
    a(false);
  }

  public void a(String paramString, float paramFloat, boolean paramBoolean)
  {
  }

  public void a(g.d paramd, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    this.d = paramBoolean2;
    this.f = paramBoolean3;
    if ((this.f) && (u == null))
      u = getContext().getResources().getDrawable(2130837787);
    this.m = paramd;
    if ((this.m != null) && (this.m.p != null));
    for (this.n = this.m.p; ; this.n = null)
    {
      this.p = paramBoolean1;
      c();
      requestLayout();
      a(false);
      return;
    }
  }

  public void a(g.q paramq, boolean paramBoolean)
  {
    this.d = paramBoolean;
    this.f = false;
    this.m = null;
    this.n = paramq;
    this.p = true;
    c();
    requestLayout();
    a(false);
  }

  public void a(boolean paramBoolean)
  {
    File localFile = null;
    StringBuilder localStringBuilder = null;
    Object localObject2;
    Object localObject1;
    if ((this.o == 5) || (this.o == 3))
      if (this.n != null)
      {
        localObject2 = org.vidogram.messenger.m.b(this.n);
        localObject1 = org.vidogram.messenger.m.a(this.n);
      }
    while (TextUtils.isEmpty((CharSequence)localObject2))
    {
      this.x.a(null, false, false);
      return;
      localObject2 = this.m.i;
      localFile = org.vidogram.messenger.m.a().b(4);
      localStringBuilder = new StringBuilder().append(Utilities.e(this.m.i)).append(".");
      String str = this.m.i;
      if (this.o == 5);
      for (localObject1 = "mp3"; ; localObject1 = "ogg")
      {
        localObject1 = new File(localFile, p.b(str, (String)localObject1));
        break;
      }
      localObject1 = localStringBuilder;
      localObject2 = localFile;
      if (!this.p)
        continue;
      if (this.m != null)
      {
        if ((this.m.p instanceof g.hs))
        {
          localObject2 = org.vidogram.messenger.m.b(this.m.p);
          localObject1 = org.vidogram.messenger.m.a(this.m.p);
          continue;
        }
        if ((this.m.o instanceof g.rp))
        {
          localObject1 = org.vidogram.messenger.m.a(this.m.o.h, a.f(), true);
          localObject2 = org.vidogram.messenger.m.b((f)localObject1);
          localObject1 = org.vidogram.messenger.m.a((f)localObject1);
          continue;
        }
        if (this.m.i != null)
        {
          localObject2 = Utilities.e(this.m.i) + "." + p.b(this.m.i, "jpg");
          localObject1 = new File(org.vidogram.messenger.m.a().b(4), (String)localObject2);
          continue;
        }
        localObject1 = localStringBuilder;
        localObject2 = localFile;
        if (this.m.h == null)
          continue;
        localObject2 = Utilities.e(this.m.h) + "." + p.b(this.m.h, "jpg");
        localObject1 = new File(org.vidogram.messenger.m.a().b(4), (String)localObject2);
        continue;
      }
      localObject1 = localStringBuilder;
      localObject2 = localFile;
      if (this.n == null)
        continue;
      localObject2 = org.vidogram.messenger.m.b(this.n);
      localObject1 = org.vidogram.messenger.m.a(this.n);
    }
    if ((((File)localObject1).exists()) && (((File)localObject1).length() == 0L))
      ((File)localObject1).delete();
    boolean bool;
    if (!((File)localObject1).exists())
    {
      MediaController.a().a((String)localObject2, this);
      if ((this.o == 5) || (this.o == 3))
      {
        if (this.n != null);
        for (bool = org.vidogram.messenger.m.a().a((String)localObject2); !bool; bool = p.a().f((String)localObject2))
        {
          this.w = 2;
          this.x.a(0.0F, paramBoolean);
          this.x.a(getDrawableForCurrentState(), false, paramBoolean);
          invalidate();
          return;
        }
        this.w = 4;
        localObject1 = p.a().a((String)localObject2);
        if (localObject1 != null)
          this.x.a(((Float)localObject1).floatValue(), paramBoolean);
        while (true)
        {
          this.x.a(getDrawableForCurrentState(), true, paramBoolean);
          break;
          this.x.a(0.0F, paramBoolean);
        }
      }
      this.w = 1;
      localObject1 = p.a().a((String)localObject2);
      float f1;
      if (localObject1 != null)
        f1 = ((Float)localObject1).floatValue();
      while (true)
      {
        this.x.a(f1, false);
        this.x.a(getDrawableForCurrentState(), true, paramBoolean);
        break;
        f1 = 0.0F;
      }
    }
    MediaController.a().a(this);
    if ((this.o == 5) || (this.o == 3))
    {
      bool = MediaController.a().d(this.q);
      if ((!bool) || ((bool) && (MediaController.a().s())))
        this.w = 0;
    }
    while (true)
    {
      this.x.a(getDrawableForCurrentState(), false, paramBoolean);
      invalidate();
      return;
      this.w = 1;
      continue;
      this.w = -1;
    }
  }

  public boolean a()
  {
    return this.o == 6;
  }

  public void b(String paramString)
  {
    this.x.a(1.0F, true);
    a(true);
  }

  public boolean b()
  {
    return this.a.h() != null;
  }

  public g.q getDocument()
  {
    return this.n;
  }

  public u getMessageObject()
  {
    return this.q;
  }

  public int getObserverTag()
  {
    return this.v;
  }

  public q getPhotoImage()
  {
    return this.a;
  }

  public g.d getResult()
  {
    return this.m;
  }

  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    if ((this.b) && (this.a.g()))
      a(false);
  }

  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    if (this.b)
      this.a.f();
    MediaController.a().a(this);
  }

  protected void onDraw(Canvas paramCanvas)
  {
    float f2 = 8.0F;
    float f1;
    label83: int i1;
    label138: label205: label220: long l2;
    if (this.j != null)
    {
      paramCanvas.save();
      if (r.a)
      {
        f1 = 8.0F;
        paramCanvas.translate(a.a(f1), this.i);
        this.j.draw(paramCanvas);
        paramCanvas.restore();
      }
    }
    else
    {
      if (this.l != null)
      {
        s.setColor(-7697782);
        paramCanvas.save();
        if (!r.a)
          break label523;
        f1 = 8.0F;
        paramCanvas.translate(a.a(f1), this.k);
        this.l.draw(paramCanvas);
        paramCanvas.restore();
      }
      if (this.h != null)
      {
        s.setColor(-14255946);
        paramCanvas.save();
        if (!r.a)
          break label531;
        f1 = f2;
        paramCanvas.translate(a.a(f1), this.g);
        this.h.draw(paramCanvas);
        paramCanvas.restore();
      }
      if (this.p)
        break label1078;
      if ((this.o != 3) && (this.o != 5))
        break label545;
      as localas = this.x;
      if (!this.e)
        break label539;
      i1 = -1902337;
      localas.a(i1);
      this.x.a(paramCanvas);
      if (this.b)
      {
        paramCanvas.save();
        if (((this.z) && (this.A != 0.8F)) || ((!this.z) && (this.A != 1.0F)))
        {
          long l1 = System.currentTimeMillis();
          l2 = l1 - this.y;
          this.y = l1;
          if ((!this.z) || (this.A == 0.8F))
            break label1256;
          this.A -= (float)l2 / 400.0F;
          if (this.A < 0.8F)
            this.A = 0.8F;
          label338: invalidate();
        }
        paramCanvas.scale(this.A, this.A, getMeasuredWidth() / 2, getMeasuredHeight() / 2);
        this.a.a(paramCanvas);
        paramCanvas.restore();
      }
      if ((this.p) && ((this.o == 7) || (this.o == 2)))
      {
        this.x.a(-1);
        this.x.a(paramCanvas);
      }
      if ((this.d) && (!this.p))
      {
        if (!r.a)
          break label1289;
        paramCanvas.drawLine(0.0F, getMeasuredHeight() - 1, getMeasuredWidth() - a.a(a.g), getMeasuredHeight() - 1, t);
      }
    }
    while (true)
    {
      if ((this.f) && (u != null))
      {
        u.setBounds(0, 0, getMeasuredWidth(), a.a(3.0F));
        u.draw(paramCanvas);
      }
      return;
      f1 = a.g;
      break;
      label523: f1 = a.g;
      break label83;
      label531: f1 = a.g;
      break label138;
      label539: i1 = -1;
      break label205;
      label545: if ((this.m != null) && (this.m.d.equals("file")))
      {
        i1 = l.I.getIntrinsicWidth();
        i2 = l.I.getIntrinsicHeight();
        i3 = this.a.n() + (a.a(52.0F) - i1) / 2;
        i4 = this.a.o() + (a.a(52.0F) - i2) / 2;
        paramCanvas.drawRect(this.a.n(), this.a.o(), this.a.n() + a.a(52.0F), this.a.o() + a.a(52.0F), w.a);
        l.I.setBounds(i3, i4, i3 + i1, i4 + i2);
        l.I.draw(paramCanvas);
        break label220;
      }
      if ((this.m != null) && ((this.m.d.equals("audio")) || (this.m.d.equals("voice"))))
      {
        i1 = l.J.getIntrinsicWidth();
        i2 = l.J.getIntrinsicHeight();
        i3 = this.a.n() + (a.a(52.0F) - i1) / 2;
        i4 = this.a.o() + (a.a(52.0F) - i2) / 2;
        paramCanvas.drawRect(this.a.n(), this.a.o(), this.a.n() + a.a(52.0F), this.a.o() + a.a(52.0F), w.a);
        l.J.setBounds(i3, i4, i3 + i1, i4 + i2);
        l.J.draw(paramCanvas);
        break label220;
      }
      if ((this.m != null) && ((this.m.d.equals("venue")) || (this.m.d.equals("geo"))))
      {
        i1 = l.K.getIntrinsicWidth();
        i2 = l.K.getIntrinsicHeight();
        i3 = this.a.n() + (a.a(52.0F) - i1) / 2;
        i4 = this.a.o() + (a.a(52.0F) - i2) / 2;
        paramCanvas.drawRect(this.a.n(), this.a.o(), this.a.n() + a.a(52.0F), this.a.o() + a.a(52.0F), w.a);
        l.K.setBounds(i3, i4, i3 + i1, i4 + i2);
        l.K.draw(paramCanvas);
        break label220;
      }
      this.c.draw(paramCanvas);
      break label220;
      label1078: if ((this.m == null) || ((!(this.m.n instanceof g.df)) && (!(this.m.n instanceof g.dg))))
        break label220;
      i1 = l.K.getIntrinsicWidth();
      int i2 = l.K.getIntrinsicHeight();
      int i3 = this.a.n() + (this.a.p() - i1) / 2;
      int i4 = this.a.o() + (this.a.q() - i2) / 2;
      paramCanvas.drawRect(this.a.n(), this.a.o(), this.a.n() + this.a.p(), this.a.o() + this.a.q(), w.a);
      l.K.setBounds(i3, i4, i3 + i1, i4 + i2);
      l.K.draw(paramCanvas);
      break label220;
      label1256: this.A += (float)l2 / 400.0F;
      if (this.A <= 1.0F)
        break label338;
      this.A = 1.0F;
      break label338;
      label1289: paramCanvas.drawLine(a.a(a.g), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, t);
    }
  }

  @SuppressLint({"DrawAllocation"})
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    this.b = false;
    this.l = null;
    this.j = null;
    this.h = null;
    this.g = a.a(27.0F);
    if ((this.m == null) && (this.n == null))
    {
      setMeasuredDimension(a.a(100.0F), a.a(100.0F));
      return;
    }
    int i5 = View.MeasureSpec.getSize(paramInt1);
    int i1 = i5 - a.a(a.g) - a.a(8.0F);
    Object localObject1;
    if (this.n != null)
    {
      localObject1 = new ArrayList();
      ((ArrayList)localObject1).add(this.n.i);
    }
    label1538: 
    while (true)
      label1410: label1827: label1960: 
      while (true)
      {
        if ((this.p) || (this.m == null) || (this.m.e != null));
        label1323: label1970: 
        try
        {
          i2 = (int)Math.ceil(r.measureText(this.m.e));
          this.j = new StaticLayout(TextUtils.ellipsize(org.vidogram.messenger.j.a(this.m.e.replace('\n', ' '), r.getFontMetricsInt(), a.a(15.0F), false), r, Math.min(i2, i1), TextUtils.TruncateAt.END), r, a.a(4.0F) + i1, Layout.Alignment.ALIGN_NORMAL, 1.0F, 0.0F, false);
          this.c.a(this.m.e);
          if (this.m.f == null);
        }
        catch (Exception localObject2)
        {
          label1208: label1982: 
          try
          {
            this.l = j.a(org.vidogram.messenger.j.a(this.m.f, s.getFontMetricsInt(), a.a(13.0F), false), s, i1, i1, 0, 3);
            if (this.l.getLineCount() > 0)
              this.g = (this.k + this.l.getLineBottom(this.l.getLineCount() - 1) + a.a(1.0F));
            if (this.m.g == null);
          }
          catch (Exception localObject2)
          {
            label1473: label1988: 
            try
            {
              while (true)
              {
                i2 = (int)Math.ceil(s.measureText(this.m.g));
                this.h = new StaticLayout(TextUtils.ellipsize(this.m.g.replace('\n', ' '), s, Math.min(i2, i1), TextUtils.TruncateAt.MIDDLE), s, i1, Layout.Alignment.ALIGN_NORMAL, 1.0F, 0.0F, false);
                str = null;
                if (this.n == null)
                  break label1269;
                if (!u.a(this.n))
                  break label1208;
                localObject1 = this.n.i;
                q localq = null;
                if (this.m == null)
                  break label1988;
                if ((this.m.i == null) || (this.m.d == null))
                  break label1982;
                if (!this.m.d.startsWith("gif"))
                  break label1323;
                if (this.o == 2)
                  break label1982;
                localObject3 = this.m.i;
                this.o = 2;
                localObject4 = localObject3;
                if (localObject3 == null)
                {
                  localObject4 = localObject3;
                  if (this.m.h != null)
                    localObject4 = this.m.h;
                }
                localObject5 = localObject4;
                if (localObject4 == null)
                {
                  localObject5 = localObject4;
                  if (localObject1 == null)
                  {
                    localObject5 = localObject4;
                    if (localq == null)
                      if (!(this.m.n instanceof g.dg))
                      {
                        localObject5 = localObject4;
                        if (!(this.m.n instanceof g.df));
                      }
                      else
                      {
                        double d1 = this.m.n.c.c;
                        double d2 = this.m.n.c.b;
                        localObject5 = String.format(Locale.US, "https://maps.googleapis.com/maps/api/staticmap?center=%f,%f&zoom=15&size=72x72&maptype=roadmap&scale=%d&markers=color:red|size:small|%f,%f&sensor=false", new Object[] { Double.valueOf(d1), Double.valueOf(d2), Integer.valueOf(Math.min(2, (int)Math.ceil(a.b))), Double.valueOf(d1), Double.valueOf(d2) });
                      }
                  }
                }
                if (this.n == null)
                  break label1970;
                i1 = 0;
                if (i1 >= this.n.o.size())
                  break label1970;
                localObject3 = (g.r)this.n.o.get(i1);
                if ((!(localObject3 instanceof g.hz)) && (!(localObject3 instanceof g.ie)))
                  break label1365;
                i4 = ((g.r)localObject3).h;
                i3 = ((g.r)localObject3).i;
                if (i4 != 0)
                {
                  i1 = i3;
                  i2 = i4;
                  if (i3 != 0);
                }
                else
                {
                  if (localObject1 == null)
                    break label1374;
                  if (localq != null)
                    localq.f = -1;
                  i2 = ((g.az)localObject1).d;
                  i1 = ((g.az)localObject1).e;
                }
                if (i2 != 0)
                {
                  i3 = i1;
                  if (i1 != 0);
                }
                else
                {
                  i3 = a.a(80.0F);
                  i2 = i3;
                }
                if ((this.n != null) || (localObject1 != null) || (localObject5 != null))
                {
                  localObject4 = "52_52_b";
                  if (!this.p)
                    break label1473;
                  i1 = (int)(i2 / (i3 / a.a(80.0F)));
                  if (this.o != 2)
                    break label1410;
                  localObject4 = String.format(Locale.US, "%d_%d_b", new Object[] { Integer.valueOf((int)(i1 / a.b)), Integer.valueOf(80) });
                  localObject3 = localObject4;
                  localObject6 = this.a;
                  if (this.o != 6)
                    break label1481;
                  bool = true;
                  ((q)localObject6).c(bool);
                  if (this.o != 2)
                    break label1538;
                  if (this.n == null)
                    break label1493;
                  localq = this.a;
                  localObject4 = this.n;
                  if (localObject1 == null)
                    break label1487;
                  localObject1 = ((g.az)localObject1).c;
                  localq.a((f)localObject4, null, (g.x)localObject1, (String)localObject3, this.n.h, str, false);
                  this.b = true;
                }
                if (!this.p)
                  break label1644;
                setBackgroundDrawable(null);
                paramInt2 = View.MeasureSpec.getSize(paramInt2);
                paramInt1 = paramInt2;
                if (paramInt2 == 0)
                  paramInt1 = a.a(100.0F);
                setMeasuredDimension(i5, paramInt1);
                paramInt2 = (i5 - a.a(24.0F)) / 2;
                i1 = (paramInt1 - a.a(24.0F)) / 2;
                this.x.a(paramInt2, i1, a.a(24.0F) + paramInt2, a.a(24.0F) + i1);
                this.a.a(0, 0, i5, paramInt1);
                return;
                if ((this.m == null) || (this.m.o == null))
                  break label2014;
                localObject1 = new ArrayList(this.m.o.h);
                break;
                localException1 = localException1;
                n.a("tmessages", localException1);
              }
              localException2 = localException2;
              n.a("tmessages", localException2);
            }
            catch (Exception localObject2)
            {
              label1365: label1493: 
              while (true)
              {
                int i2;
                String str;
                Object localObject3;
                Object localObject4;
                Object localObject5;
                int i4;
                int i3;
                Object localObject6;
                boolean bool;
                n.a("tmessages", localException3);
                continue;
                if (u.c(this.n))
                {
                  localObject1 = this.n.i;
                  str = "webp";
                  localObject2 = null;
                  continue;
                }
                if ((this.o != 5) && (this.o != 3))
                {
                  localObject1 = this.n.i;
                  localObject2 = null;
                  continue;
                  if ((this.m != null) && (this.m.o != null))
                  {
                    localObject2 = org.vidogram.messenger.m.a((ArrayList)localObject1, a.f(), true);
                    localObject3 = org.vidogram.messenger.m.a((ArrayList)localObject1, 80);
                    if (localObject3 == localObject2)
                    {
                      localObject1 = localObject2;
                      localObject2 = null;
                      continue;
                      if (this.m.d.equals("photo"))
                      {
                        localObject3 = this.m.h;
                        if (localObject3 == null)
                        {
                          localObject3 = this.m.i;
                          continue;
                          i1 += 1;
                          continue;
                          i1 = i3;
                          i2 = i4;
                          if (this.m == null)
                            continue;
                          i2 = this.m.k;
                          i1 = this.m.l;
                          continue;
                          localObject3 = String.format(Locale.US, "%d_%d", new Object[] { Integer.valueOf((int)(i1 / a.b)), Integer.valueOf(80) });
                          localObject4 = (String)localObject3 + "_b";
                          continue;
                          localObject3 = "52_52";
                          continue;
                          bool = false;
                          continue;
                          localObject1 = null;
                          continue;
                          localObject2 = this.a;
                          if (localObject1 != null);
                          for (localObject1 = ((g.az)localObject1).c; ; localObject1 = null)
                          {
                            ((q)localObject2).a(null, (String)localObject5, null, null, (g.x)localObject1, (String)localObject3, -1, str, true);
                            break;
                          }
                          if (localObject1 != null)
                          {
                            localObject5 = this.a;
                            localObject6 = ((g.az)localObject1).c;
                            if (localObject2 != null);
                            for (localObject2 = ((g.az)localObject2).c; ; localObject2 = null)
                            {
                              ((q)localObject5).a((f)localObject6, (String)localObject3, (g.x)localObject2, (String)localObject4, ((g.az)localObject1).f, str, false);
                              break;
                            }
                          }
                          localObject6 = this.a;
                          if (localObject2 != null);
                          for (localObject1 = ((g.az)localObject2).c; ; localObject1 = null)
                          {
                            ((q)localObject6).a(null, (String)localObject5, (String)localObject3, null, (g.x)localObject1, (String)localObject4, -1, str, true);
                            break;
                          }
                          setBackgroundResource(2130837946);
                          i1 = 0;
                          paramInt2 = i1;
                          if (this.j != null)
                          {
                            paramInt2 = i1;
                            if (this.j.getLineCount() != 0)
                              paramInt2 = 0 + this.j.getLineBottom(this.j.getLineCount() - 1);
                          }
                          i1 = paramInt2;
                          if (this.l != null)
                          {
                            i1 = paramInt2;
                            if (this.l.getLineCount() != 0)
                              i1 = paramInt2 + this.l.getLineBottom(this.l.getLineCount() - 1);
                          }
                          paramInt2 = i1;
                          if (this.h != null)
                          {
                            paramInt2 = i1;
                            if (this.h.getLineCount() > 0)
                              paramInt2 = i1 + this.h.getLineBottom(this.h.getLineCount() - 1);
                          }
                          paramInt2 = Math.max(a.a(52.0F), paramInt2);
                          i1 = View.MeasureSpec.getSize(paramInt1);
                          i2 = Math.max(a.a(68.0F), paramInt2 + a.a(16.0F));
                          if (this.d)
                          {
                            paramInt2 = 1;
                            setMeasuredDimension(i1, paramInt2 + i2);
                            paramInt2 = a.a(52.0F);
                            if (!r.a)
                              break label1960;
                          }
                          for (paramInt1 = View.MeasureSpec.getSize(paramInt1) - a.a(8.0F) - paramInt2; ; paramInt1 = a.a(8.0F))
                          {
                            this.c.setBounds(paramInt1, a.a(8.0F), paramInt1 + paramInt2, a.a(60.0F));
                            this.a.a(paramInt1, a.a(8.0F), paramInt2, paramInt2);
                            if ((this.o != 3) && (this.o != 5))
                              break;
                            this.x.a(a.a(4.0F) + paramInt1, a.a(12.0F), paramInt1 + a.a(48.0F), a.a(56.0F));
                            return;
                            paramInt2 = 0;
                            break label1827;
                          }
                          i3 = 0;
                          i4 = 0;
                          continue;
                        }
                        continue;
                      }
                      localObject3 = null;
                      continue;
                      localObject4 = null;
                      continue;
                    }
                    localObject1 = localObject2;
                    localObject2 = localObject3;
                    continue;
                  }
                }
                label1269: Object localObject2 = null;
                label1374: label1644: localObject1 = null;
              }
              label1481: label1487: label2014: localObject1 = null;
            }
          }
        }
      }
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool1 = true;
    if ((Build.VERSION.SDK_INT >= 21) && (getBackground() != null) && ((paramMotionEvent.getAction() == 0) || (paramMotionEvent.getAction() == 2)))
      getBackground().setHotspot(paramMotionEvent.getX(), paramMotionEvent.getY());
    boolean bool2;
    if ((this.p) || (this.D == null) || (this.m == null))
      bool2 = super.onTouchEvent(paramMotionEvent);
    int i1;
    int i2;
    while (true)
    {
      return bool2;
      i1 = (int)paramMotionEvent.getX();
      i2 = (int)paramMotionEvent.getY();
      a.a(48.0F);
      if ((this.o != 3) && (this.o != 5))
        break label272;
      bool2 = this.c.getBounds().contains(i1, i2);
      if (paramMotionEvent.getAction() != 0)
        break;
      if (!bool2)
        break label221;
      this.e = true;
      invalidate();
      this.x.a(getDrawableForCurrentState());
      bool2 = bool1;
      if (!bool1)
        return super.onTouchEvent(paramMotionEvent);
    }
    if (this.e)
    {
      if (paramMotionEvent.getAction() != 1)
        break label227;
      this.e = false;
      playSoundEffect(0);
      d();
      invalidate();
      label209: this.x.a(getDrawableForCurrentState());
    }
    while (true)
    {
      label221: bool1 = false;
      break;
      label227: if (paramMotionEvent.getAction() == 3)
      {
        this.e = false;
        invalidate();
        break label209;
      }
      if ((paramMotionEvent.getAction() != 2) || (bool2))
        break label209;
      this.e = false;
      invalidate();
      break label209;
      label272: if ((this.m == null) || (this.m.i == null) || (this.m.i.length() <= 0))
        continue;
      if (paramMotionEvent.getAction() == 0)
      {
        if (!this.c.getBounds().contains(i1, i2))
          continue;
        this.e = true;
        break;
      }
      if (!this.e)
        continue;
      if (paramMotionEvent.getAction() == 1)
      {
        this.e = false;
        playSoundEffect(0);
        this.D.a(this);
        bool1 = false;
        break;
      }
      if (paramMotionEvent.getAction() == 3)
      {
        this.e = false;
        bool1 = false;
        break;
      }
      if ((paramMotionEvent.getAction() != 2) || (this.c.getBounds().contains(i1, i2)))
        continue;
      this.e = false;
    }
  }

  public void setDelegate(a parama)
  {
    this.D = parama;
  }

  public void setScaled(boolean paramBoolean)
  {
    this.z = paramBoolean;
    this.y = System.currentTimeMillis();
    invalidate();
  }

  public static abstract interface a
  {
    public abstract void a(m paramm);
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.c.m
 * JD-Core Version:    0.6.0
 */