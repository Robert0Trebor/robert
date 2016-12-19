package org.vidogram.ui.c;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.Layout.Alignment;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.text.style.ForegroundColorSpan;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View.MeasureSpec;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import org.vidogram.messenger.a;
import org.vidogram.messenger.ad;
import org.vidogram.messenger.ae;
import org.vidogram.messenger.j;
import org.vidogram.messenger.q;
import org.vidogram.messenger.r;
import org.vidogram.messenger.u;
import org.vidogram.messenger.v;
import org.vidogram.tgnet.g.ar;
import org.vidogram.tgnet.g.au;
import org.vidogram.tgnet.g.aw;
import org.vidogram.tgnet.g.hq;
import org.vidogram.tgnet.g.i;
import org.vidogram.tgnet.g.im;
import org.vidogram.tgnet.g.in;
import org.vidogram.tgnet.g.ip;
import org.vidogram.tgnet.g.ir;
import org.vidogram.tgnet.g.jb;
import org.vidogram.tgnet.g.m;
import org.vidogram.tgnet.g.nz;
import org.vidogram.tgnet.g.oj;
import org.vidogram.tgnet.g.s;
import org.vidogram.tgnet.g.t;
import org.vidogram.tgnet.g.vw;
import org.vidogram.tgnet.g.vx;
import org.vidogram.tgnet.g.vy;
import org.vidogram.tgnet.g.z;

public class n extends e
{
  private static Drawable ax;
  private static TextPaint c;
  private static TextPaint d;
  private static TextPaint e;
  private static TextPaint f;
  private static TextPaint g;
  private static TextPaint h;
  private static Drawable i;
  private static Drawable j;
  private static Drawable k;
  private static Drawable l;
  private static Drawable m;
  private static Drawable n;
  private static Drawable o;
  private static Drawable p;
  private static Drawable q;
  private static Drawable r;
  private static Drawable s;
  private static Drawable t;
  private static Paint u;
  private static Paint v;
  private int A;
  private boolean B;
  private int C;
  private boolean D;
  private u E;
  private int F;
  private int G;
  private q H;
  private org.vidogram.ui.Components.b I;
  private g.vw J = null;
  private g.i K = null;
  private g.t L = null;
  private CharSequence M = null;
  private g.s N;
  private int O;
  private StaticLayout P;
  private boolean Q;
  private boolean R;
  private boolean S;
  private boolean T;
  private int U;
  private int V;
  private int W;
  public boolean a = false;
  private int aa;
  private int ab = a.a(17.0F);
  private StaticLayout ac;
  private boolean ad;
  private boolean ae;
  private boolean af;
  private int ag;
  private int ah = a.a(18.0F);
  private int ai;
  private int aj = a.a(40.0F);
  private int ak;
  private StaticLayout al;
  private boolean am;
  private int an = a.a(39.0F);
  private int ao;
  private boolean ap;
  private int aq = a.a(39.0F);
  private int ar;
  private int as;
  private StaticLayout at;
  private boolean au;
  private int av = a.a(10.0F);
  private boolean aw;
  private int ay;
  int b;
  private long w;
  private int x;
  private boolean y;
  private int z;

  public n(Context paramContext)
  {
    super(paramContext);
    if (c == null)
    {
      c = new TextPaint(1);
      c.setColor(-14606047);
      c.setTypeface(a.a("fonts/rmedium.ttf"));
      d = new TextPaint(1);
      d.setColor(-16734706);
      d.setTypeface(a.a("fonts/rmedium.ttf"));
      e = new TextPaint(1);
      e.setColor(-7368817);
      e.linkColor = -7368817;
      u = new Paint();
      u.setColor(-2302756);
      v = new Paint();
      v.setColor(251658240);
      f = new TextPaint(1);
      f.setColor(-11697229);
      g = new TextPaint(1);
      g.setColor(-6710887);
      h = new TextPaint(1);
      h.setColor(-1);
      h.setTypeface(a.a("fonts/rmedium.ttf"));
      m = getResources().getDrawable(2130837945);
      i = getResources().getDrawable(2130837732);
      j = getResources().getDrawable(2130837733);
      k = getResources().getDrawable(2130837984);
      l = getResources().getDrawable(2130837734);
      n = getResources().getDrawable(2130837730);
      o = getResources().getDrawable(2130837731);
      p = getResources().getDrawable(2130837942);
      q = getResources().getDrawable(2130837939);
      s = getResources().getDrawable(2130838001);
      t = getResources().getDrawable(2130837683);
      r = getResources().getDrawable(2130837658);
    }
    c.setTextSize(a.a(17.0F));
    d.setTextSize(a.a(17.0F));
    e.setTextSize(a.a(16.0F));
    f.setTextSize(a.a(16.0F));
    g.setTextSize(a.a(13.0F));
    h.setTextSize(a.a(13.0F));
    setBackgroundResource(2130837946);
    this.H = new q(this);
    this.H.a(a.a(26.0F));
    this.I = new org.vidogram.ui.Components.b();
  }

  private ArrayList<g.hq> getDialogsArray()
  {
    if (this.G == 0)
      return v.a().a;
    if (this.G == 1)
      return v.a().b;
    if (this.G == 2)
      return v.a().c;
    if (this.G == 3)
      return v.a().M;
    if (this.G == 4)
      return v.a().O;
    if (this.G == 5)
      return v.a().N;
    if (this.G == 6)
      return v.a().Q;
    return null;
  }

  public void a(int paramInt)
  {
    int i3 = 1;
    Object localObject;
    boolean bool;
    int i1;
    if (this.y)
    {
      localObject = (g.hq)v.a().g.get(Long.valueOf(this.w));
      if ((localObject != null) && (paramInt == 0))
      {
        this.E = ((u)v.a().h.get(Long.valueOf(((g.hq)localObject).m)));
        if ((this.E == null) || (!this.E.m()))
          break label598;
        bool = true;
        this.B = bool;
        this.A = ((g.hq)localObject).h;
        if (this.E == null)
          break label604;
        i1 = this.E.a.t;
        label117: this.x = i1;
        this.z = ((g.hq)localObject).l;
        if (this.E != null)
          this.C = this.E.a.y;
      }
    }
    if ((this.y) && (v.a().a(this.w)))
    {
      bool = true;
      label175: this.D = bool;
      this.J = null;
      this.K = null;
      this.L = null;
      i1 = (int)this.w;
      i2 = (int)(this.w >> 32);
      if (i1 == 0)
        break label710;
      if (i2 != 1)
        break label615;
      this.K = v.a().b(Integer.valueOf(i1));
      label234: if (paramInt == 0)
        break label813;
      if ((!this.y) || ((paramInt & 0x40) == 0))
        break label975;
      localObject = (CharSequence)v.a().l.get(Long.valueOf(this.w));
      if (((this.M == null) || (localObject != null)) && ((this.M != null) || (localObject == null)) && ((this.M == null) || (localObject == null) || (this.M.equals(localObject))))
        break label975;
    }
    label710: label967: label972: label975: for (int i2 = 1; ; i2 = 0)
    {
      i1 = i2;
      if (i2 == 0)
      {
        i1 = i2;
        if ((paramInt & 0x2) != 0)
        {
          i1 = i2;
          if (this.K == null)
            i1 = 1;
        }
      }
      i2 = i1;
      if (i1 == 0)
      {
        i2 = i1;
        if ((paramInt & 0x1) != 0)
        {
          i2 = i1;
          if (this.K == null)
            i2 = 1;
        }
      }
      i1 = i2;
      if (i2 == 0)
      {
        i1 = i2;
        if ((paramInt & 0x8) != 0)
        {
          i1 = i2;
          if (this.J == null)
            i1 = 1;
        }
      }
      i2 = i1;
      if (i1 == 0)
      {
        i2 = i1;
        if ((paramInt & 0x10) != 0)
        {
          i2 = i1;
          if (this.J == null)
            i2 = 1;
        }
      }
      if ((i2 == 0) && ((paramInt & 0x100) != 0))
        if ((this.E != null) && (this.B != this.E.m()))
        {
          this.B = this.E.m();
          i2 = 1;
        }
      while (true)
      {
        label471: i1 = i2;
        if (i2 == 0)
        {
          i1 = i2;
          if ((paramInt & 0x1000) != 0)
          {
            i1 = i2;
            if (this.E != null)
            {
              i1 = i2;
              if (this.C != this.E.a.y)
              {
                this.C = this.E.a.y;
                i1 = 1;
              }
            }
          }
        }
        i2 = i1;
        if (this.J != null)
        {
          i2 = i1;
          if (i1 == 0)
          {
            i2 = i1;
            if ((paramInt & 0x4) != 0)
              if (this.J.k == null)
                break label967;
          }
        }
        for (i2 = this.J.k.c; ; i2 = 0)
        {
          if (i2 != this.ay);
          for (paramInt = i3; ; paramInt = i1)
          {
            this.ay = i2;
            i2 = paramInt;
            if (i2 == 0)
            {
              return;
              label598: bool = false;
              break;
              label604: i1 = 0;
              break label117;
              bool = false;
              break label175;
              label615: if (i1 < 0)
              {
                this.K = v.a().b(Integer.valueOf(-i1));
                if ((this.y) || (this.K == null) || (this.K.B == null))
                  break label234;
                localObject = v.a().b(Integer.valueOf(this.K.B.b));
                if (localObject == null)
                  break label234;
                this.K = ((g.i)localObject);
                break label234;
              }
              this.J = v.a().a(Integer.valueOf(i1));
              break label234;
              this.L = v.a().c(Integer.valueOf(i2));
              if (this.L == null)
                break label234;
              this.J = v.a().a(Integer.valueOf(this.L.m));
              break label234;
              if (!this.y)
                break label972;
              localObject = (g.hq)v.a().g.get(Long.valueOf(this.w));
              if ((localObject == null) || (this.A == ((g.hq)localObject).h))
                break label972;
              this.A = ((g.hq)localObject).h;
              i2 = 1;
              break label471;
            }
            if (this.J != null)
              if (this.J.j == null)
                break label956;
            for (localObject = this.J.j.e; ; localObject = null)
            {
              this.I.a(this.J);
              while (true)
              {
                this.H.a((org.vidogram.tgnet.f)localObject, "50_50", this.I, null, false);
                if ((getMeasuredWidth() != 0) || (getMeasuredHeight() != 0))
                {
                  d();
                  label889: invalidate();
                  return;
                  if (this.K == null)
                    break label950;
                  if (this.K.j == null)
                    break label944;
                }
                for (localObject = this.K.j.b; ; localObject = null)
                {
                  this.I.a(this.K);
                  break;
                  requestLayout();
                  break label889;
                }
                localObject = null;
              }
            }
          }
        }
      }
    }
  }

  public void a(long paramLong, u paramu, int paramInt)
  {
    this.w = paramLong;
    this.E = paramu;
    this.y = false;
    this.z = paramInt;
    if (paramu != null)
    {
      paramInt = paramu.a.t;
      this.x = paramInt;
      this.A = 0;
      if ((paramu == null) || (!paramu.m()))
        break label98;
    }
    label98: for (boolean bool = true; ; bool = false)
    {
      this.B = bool;
      if (this.E != null)
        this.C = this.E.a.y;
      a(0);
      return;
      paramInt = 0;
      break;
    }
  }

  public void a(g.hq paramhq, int paramInt1, int paramInt2)
  {
    this.w = paramhq.m;
    this.y = true;
    this.F = paramInt1;
    this.G = paramInt2;
    a(0);
  }

  public void d()
  {
    Object localObject3 = null;
    if (this.y)
      localObject3 = (CharSequence)v.a().l.get(Long.valueOf(this.w));
    Object localObject8 = c;
    Object localObject1 = e;
    this.R = false;
    this.S = false;
    this.Q = false;
    this.T = false;
    this.au = false;
    int i2;
    int i1;
    label304: Object localObject4;
    if (this.L != null)
    {
      this.Q = true;
      this.W = a.a(16.5F);
      if (!r.a)
      {
        this.V = a.a(a.g);
        this.O = (a.a(a.g + 4) + m.getIntrinsicWidth());
        i2 = this.z;
        i1 = i2;
        if (this.z == 0)
        {
          i1 = i2;
          if (this.E != null)
            i1 = this.E.a.e;
        }
        if (!this.y)
          break label1586;
        this.N = org.vidogram.messenger.d.b.a(this.w);
        if (((this.N != null) && (((TextUtils.isEmpty(this.N.e)) && (this.N.d == 0)) || ((i1 > this.N.g) && (this.A != 0)))) || ((org.vidogram.messenger.e.d(this.K)) && (!this.K.r) && (!this.K.c) && (!this.K.n)) || ((this.K != null) && ((this.K.t) || (this.K.d))))
          this.N = null;
        if (localObject3 == null)
          break label1594;
        this.M = ((CharSequence)localObject3);
        localObject4 = f;
        i1 = 1;
        localObject1 = localObject3;
        localObject3 = localObject4;
      }
    }
    while (true)
    {
      label331: if (this.N != null);
      label351: label2288: label3190: label4343: for (Object localObject7 = r.d(this.N.g); ; localObject7 = "")
      {
        Object localObject6;
        int i4;
        if (this.E == null)
        {
          this.ad = false;
          this.ae = false;
          this.af = false;
          this.ap = false;
          this.am = false;
          localObject6 = null;
          i4 = (int)Math.ceil(g.measureText((String)localObject7));
          this.ac = new StaticLayout((CharSequence)localObject7, g, i4, Layout.Alignment.ALIGN_NORMAL, 1.0F, 0.0F, false);
          if (r.a)
            break label3190;
          this.aa = (getMeasuredWidth() - a.a(15.0F) - i4);
          if (this.K == null)
            break label3203;
          localObject4 = this.K.i;
          localObject7 = localObject8;
        }
        while (true)
        {
          while (true)
          {
            localObject8 = localObject4;
            if (((String)localObject4).length() == 0)
              localObject8 = r.a("HiddenName", 2131231289);
            int i3;
            int i5;
            if (!r.a)
            {
              i3 = getMeasuredWidth() - this.O - a.a(14.0F) - i4;
              if (!this.Q)
                break label3464;
              i2 = i3 - (a.a(4.0F) + m.getIntrinsicWidth());
              if (!this.af)
                break label3584;
              i5 = k.getIntrinsicWidth() + a.a(5.0F);
              i3 = i2 - i5;
              if (r.a)
                break label3552;
              this.ag = (this.aa - i5);
              if ((!this.D) || (this.au))
                break label3790;
              i4 = a.a(6.0F) + s.getIntrinsicWidth();
              i3 -= i4;
              i2 = i3;
              if (r.a)
              {
                this.O = (i4 + this.O);
                i2 = i3;
              }
              i3 = Math.max(a.a(12.0F), i2);
            }
            try
            {
              this.P = new StaticLayout(TextUtils.ellipsize(((String)localObject8).replace('\n', ' '), (TextPaint)localObject7, i3 - a.a(12.0F), TextUtils.TruncateAt.END), (TextPaint)localObject7, i3, Layout.Alignment.ALIGN_NORMAL, 1.0F, 0.0F, false);
              i2 = getMeasuredWidth() - a.a(a.g + 16);
              if (!r.a)
              {
                this.ak = a.a(a.g);
                if (a.c())
                {
                  f1 = 13.0F;
                  this.b = a.a(f1);
                  this.H.a(this.b, this.av, a.a(52.0F), a.a(52.0F));
                  if (!this.am)
                    break label3945;
                  i4 = l.getIntrinsicWidth();
                  i4 = a.a(8.0F) + i4;
                  if (r.a)
                    break label3921;
                  this.ao = (getMeasuredWidth() - l.getIntrinsicWidth() - a.a(11.0F));
                  i2 -= i4;
                  localObject4 = localObject1;
                  if (i1 != 0)
                  {
                    localObject4 = localObject1;
                    if (localObject1 == null)
                      localObject4 = "";
                    localObject4 = ((CharSequence)localObject4).toString();
                    localObject1 = localObject4;
                    if (((String)localObject4).length() > 150)
                      localObject1 = ((String)localObject4).substring(0, 150);
                    localObject4 = j.a(((String)localObject1).replace('\n', ' '), e.getFontMetricsInt(), a.a(17.0F), false);
                  }
                  i1 = Math.max(a.a(12.0F), i2);
                  localObject1 = TextUtils.ellipsize((CharSequence)localObject4, (TextPaint)localObject3, i1 - a.a(12.0F), TextUtils.TruncateAt.END);
                }
              }
            }
            catch (Exception localException2)
            {
              try
              {
                while (true)
                {
                  this.al = new StaticLayout((CharSequence)localObject1, (TextPaint)localObject3, i1, Layout.Alignment.ALIGN_NORMAL, 1.0F, 0.0F, false);
                  if (!r.a)
                    break label4146;
                  if ((this.P != null) && (this.P.getLineCount() > 0))
                  {
                    f1 = this.P.getLineLeft(0);
                    d1 = Math.ceil(this.P.getLineWidth(0));
                    if ((!this.D) || (this.au))
                      break label4104;
                    this.U = (int)(this.O + (i3 - d1) - a.a(6.0F) - s.getIntrinsicWidth());
                    if ((f1 == 0.0F) && (d1 < i3))
                      this.O = (int)(this.O + (i3 - d1));
                  }
                  if ((this.al != null) && (this.al.getLineCount() > 0) && (this.al.getLineLeft(0) == 0.0F))
                  {
                    d1 = Math.ceil(this.al.getLineWidth(0));
                    if (d1 < i1)
                    {
                      double d2 = this.ak;
                      this.ak = (int)(i1 - d1 + d2);
                    }
                  }
                  return;
                  this.V = (getMeasuredWidth() - a.a(a.g) - m.getIntrinsicWidth());
                  this.O = a.a(14.0F);
                  break;
                  if (this.K != null)
                  {
                    if ((this.K.h < 0) || ((org.vidogram.messenger.e.d(this.K)) && (!this.K.r)))
                    {
                      this.S = true;
                      this.W = a.a(16.5F);
                      label1276: this.au = this.K.q;
                      if (r.a)
                        break label1371;
                      this.V = a.a(a.g);
                      i2 = a.a(a.g + 4);
                      if (!this.R)
                        break label1360;
                    }
                    for (i1 = p.getIntrinsicWidth(); ; i1 = q.getIntrinsicWidth())
                    {
                      this.O = (i1 + i2);
                      break;
                      this.R = true;
                      this.W = a.a(17.5F);
                      break label1276;
                    }
                    i2 = getMeasuredWidth();
                    i3 = a.a(a.g);
                    if (this.R);
                    for (i1 = p.getIntrinsicWidth(); ; i1 = q.getIntrinsicWidth())
                    {
                      this.V = (i2 - i3 - i1);
                      this.O = a.a(14.0F);
                      break;
                    }
                  }
                  if (!r.a)
                  {
                    this.O = a.a(a.g);
                    if (this.J == null)
                      break;
                    if (this.J.r)
                    {
                      this.T = true;
                      this.W = a.a(16.5F);
                      if (r.a)
                        break label1550;
                      this.V = a.a(a.g);
                    }
                  }
                  for (this.O = (a.a(a.g + 4) + r.getIntrinsicWidth()); ; this.O = a.a(14.0F))
                  {
                    this.au = this.J.u;
                    break;
                    this.O = a.a(14.0F);
                    break label1454;
                    this.V = (getMeasuredWidth() - a.a(a.g) - r.getIntrinsicWidth());
                  }
                  this.N = null;
                  break label304;
                  this.M = null;
                  if (this.N != null)
                  {
                    if (TextUtils.isEmpty(this.N.e))
                    {
                      localObject3 = r.a("Draft", 2131231148);
                      localObject4 = SpannableStringBuilder.valueOf((CharSequence)localObject3);
                      ((SpannableStringBuilder)localObject4).setSpan(new ForegroundColorSpan(-2274503), 0, ((String)localObject3).length(), 33);
                      i1 = 0;
                      localObject3 = localObject1;
                      localObject1 = localObject4;
                      break label331;
                    }
                    localObject4 = this.N.e;
                    localObject3 = localObject4;
                    if (((String)localObject4).length() > 150)
                      localObject3 = ((String)localObject4).substring(0, 150);
                    localObject4 = r.a("Draft", 2131231148);
                    localObject3 = SpannableStringBuilder.valueOf(String.format("%s: %s", new Object[] { localObject4, ((String)localObject3).replace('\n', ' ') }));
                    ((SpannableStringBuilder)localObject3).setSpan(new ForegroundColorSpan(-2274503), 0, ((String)localObject4).length() + 1, 33);
                    localObject4 = j.a((CharSequence)localObject3, e.getFontMetricsInt(), a.a(20.0F), false);
                    i1 = 0;
                    localObject3 = localObject1;
                    localObject1 = localObject4;
                    break label331;
                  }
                  if (this.E == null)
                  {
                    localObject3 = localObject1;
                    if (this.L == null)
                      break label4369;
                    localObject1 = f;
                    if ((this.L instanceof g.ip))
                    {
                      localObject4 = r.a("EncryptionProcessing", 2131231176);
                      i1 = 1;
                      localObject3 = localObject1;
                      localObject1 = localObject4;
                      break label331;
                    }
                    if ((this.L instanceof g.ir))
                    {
                      if ((this.J != null) && (this.J.e != null))
                      {
                        localObject4 = r.a("AwaitingEncryption", 2131230912, new Object[] { this.J.e });
                        i1 = 1;
                        localObject3 = localObject1;
                        localObject1 = localObject4;
                        break label331;
                      }
                      localObject4 = r.a("AwaitingEncryption", 2131230912, new Object[] { "" });
                      i1 = 1;
                      localObject3 = localObject1;
                      localObject1 = localObject4;
                      break label331;
                    }
                    if ((this.L instanceof g.in))
                    {
                      localObject4 = r.a("EncryptionRejected", 2131231177);
                      i1 = 1;
                      localObject3 = localObject1;
                      localObject1 = localObject4;
                      break label331;
                    }
                    localObject3 = localObject1;
                    if (!(this.L instanceof g.im))
                      break label4369;
                    if (this.L.e == ad.c())
                    {
                      if ((this.J != null) && (this.J.e != null))
                      {
                        localObject4 = r.a("EncryptedChatStartedOutgoing", 2131231165, new Object[] { this.J.e });
                        i1 = 1;
                        localObject3 = localObject1;
                        localObject1 = localObject4;
                        break label331;
                      }
                      localObject4 = r.a("EncryptedChatStartedOutgoing", 2131231165, new Object[] { "" });
                      i1 = 1;
                      localObject3 = localObject1;
                      localObject1 = localObject4;
                      break label331;
                    }
                    localObject4 = r.a("EncryptedChatStartedIncoming", 2131231164);
                    i1 = 1;
                    localObject3 = localObject1;
                    localObject1 = localObject4;
                    break label331;
                  }
                  localObject4 = null;
                  localObject3 = null;
                  if (this.E.l())
                    localObject4 = v.a().a(Integer.valueOf(this.E.a.c));
                  while (true)
                  {
                    if (!(this.E.a instanceof g.oj))
                      break label2245;
                    localObject1 = this.E.b;
                    localObject3 = f;
                    i1 = 1;
                    break;
                    localObject3 = v.a().b(Integer.valueOf(this.E.a.d.b));
                  }
                  if ((this.K != null) && (this.K.h > 0) && (localObject3 == null))
                  {
                    if (this.E.k())
                    {
                      localObject3 = r.a("FromYou", 2131231271);
                      if (this.E.d == null)
                        break label2492;
                      localObject6 = this.E.d.toString();
                      localObject4 = localObject6;
                      if (((String)localObject6).length() > 150)
                        localObject4 = ((String)localObject6).substring(0, 150);
                      localObject4 = SpannableStringBuilder.valueOf(String.format("%s: %s", new Object[] { localObject3, ((String)localObject4).replace('\n', ' ') }));
                    }
                    while (true)
                    {
                      if (((SpannableStringBuilder)localObject4).length() > 0)
                        ((SpannableStringBuilder)localObject4).setSpan(new ForegroundColorSpan(-11697229), 0, ((String)localObject3).length() + 1, 33);
                      localObject4 = j.a((CharSequence)localObject4, e.getFontMetricsInt(), a.a(20.0F), false);
                      i1 = 0;
                      localObject3 = localObject1;
                      localObject1 = localObject4;
                      break;
                      if (localObject4 != null)
                      {
                        localObject3 = ae.d((g.vw)localObject4).replace("\n", "");
                        break label2288;
                      }
                      if (localObject3 != null)
                      {
                        localObject3 = ((g.i)localObject3).i.replace("\n", "");
                        break label2288;
                      }
                      localObject3 = "DELETED";
                      break label2288;
                      if ((this.E.a.j != null) && (!this.E.U()))
                      {
                        localObject1 = f;
                        if ((this.E.a.j instanceof g.nz));
                        for (localObject4 = SpannableStringBuilder.valueOf(String.format("%s: %s", new Object[] { localObject3, "🎮 " + this.E.a.j.m.g })); ; localObject4 = SpannableStringBuilder.valueOf(String.format("%s: %s", new Object[] { localObject3, this.E.b })))
                        {
                          ((SpannableStringBuilder)localObject4).setSpan(new ForegroundColorSpan(-11697229), ((String)localObject3).length() + 2, ((SpannableStringBuilder)localObject4).length(), 33);
                          break;
                        }
                      }
                      if (this.E.a.i != null)
                      {
                        localObject6 = this.E.a.i;
                        localObject4 = localObject6;
                        if (((String)localObject6).length() > 150)
                          localObject4 = ((String)localObject6).substring(0, 150);
                        localObject4 = SpannableStringBuilder.valueOf(String.format("%s: %s", new Object[] { localObject3, ((String)localObject4).replace('\n', ' ') }));
                        continue;
                      }
                      localObject4 = SpannableStringBuilder.valueOf("");
                    }
                  }
                  if (this.E.d != null)
                  {
                    localObject4 = this.E.d;
                    i1 = 1;
                    localObject3 = localObject1;
                    localObject1 = localObject4;
                    break label331;
                  }
                  if ((this.E.a.j instanceof g.nz));
                  for (localObject3 = "🎮 " + this.E.a.j.m.g; ; localObject3 = this.E.b)
                  {
                    if ((this.E.a.j == null) || (this.E.U()))
                      break label4351;
                    localObject1 = f;
                    i1 = 1;
                    localObject4 = localObject3;
                    localObject3 = localObject1;
                    localObject1 = localObject4;
                    break;
                  }
                  if (this.z != 0)
                  {
                    localObject7 = r.d(this.z);
                    break label351;
                  }
                  if (this.E == null)
                    break label4343;
                  localObject7 = r.d(this.E.a.e);
                  break label351;
                  if (this.A != 0)
                    this.ap = true;
                  for (localObject4 = String.format("%d", new Object[] { Integer.valueOf(this.A) }); ; localObject4 = null)
                  {
                    if ((!this.E.j()) || (this.N != null))
                      break label3163;
                    if (!this.E.v())
                      break label3044;
                    this.ad = false;
                    this.ae = false;
                    this.af = true;
                    this.am = false;
                    localObject6 = localObject4;
                    break;
                    this.ap = false;
                  }
                  if (this.E.w())
                  {
                    this.ad = false;
                    this.ae = false;
                    this.af = false;
                    this.am = true;
                    this.ap = false;
                    localObject6 = localObject4;
                    break label386;
                  }
                  if (this.E.x())
                  {
                    if ((!this.E.m()) || ((org.vidogram.messenger.e.d(this.K)) && (!this.K.r)));
                    for (boolean bool = true; ; bool = false)
                    {
                      this.ad = bool;
                      this.ae = true;
                      this.af = false;
                      this.am = false;
                      localObject6 = localObject4;
                      break;
                    }
                    this.ad = false;
                    this.ae = false;
                    this.af = false;
                    this.am = false;
                  }
                  localObject6 = localObject4;
                  break label386;
                  this.aa = a.a(15.0F);
                  break label449;
                  if (this.J == null)
                    break label4331;
                  if (this.J.d == ad.c())
                    localObject4 = r.a("ChatYourSelfName", 2131231060);
                  while (true)
                  {
                    if (this.L == null)
                      break label4324;
                    localObject7 = d;
                    break;
                    if ((this.J.d / 1000 != 777) && (this.J.d / 1000 != 333) && (org.vidogram.messenger.f.a().f.get(this.J.d) == null))
                    {
                      if ((org.vidogram.messenger.f.a().f.size() == 0) && ((!org.vidogram.messenger.f.a().a) || (org.vidogram.messenger.f.a().j())))
                      {
                        localObject4 = ae.c(this.J);
                        continue;
                      }
                      if ((this.J.i != null) && (this.J.i.length() != 0))
                      {
                        localObject4 = org.vidogram.a.b.a().e("+" + this.J.i);
                        continue;
                      }
                      localObject4 = ae.c(this.J);
                      continue;
                    }
                    localObject4 = ae.c(this.J);
                  }
                  i3 = getMeasuredWidth() - this.O - a.a(a.g) - i4;
                  this.O += i4;
                  break label519;
                  if (this.R)
                  {
                    i2 = i3 - (a.a(4.0F) + p.getIntrinsicWidth());
                    break label544;
                  }
                  if (this.S)
                  {
                    i2 = i3 - (a.a(4.0F) + q.getIntrinsicWidth());
                    break label544;
                  }
                  i2 = i3;
                  if (!this.T)
                    break label544;
                  i2 = i3 - (a.a(4.0F) + r.getIntrinsicWidth());
                  break label544;
                  this.ag = (i4 + this.aa + a.a(5.0F));
                  this.O += i5;
                  break label590;
                  i3 = i2;
                  if (!this.ae)
                    break label590;
                  i5 = i.getIntrinsicWidth() + a.a(5.0F);
                  i3 = i2 - i5;
                  if (this.ad)
                  {
                    i3 -= j.getIntrinsicWidth() - a.a(8.0F);
                    if (!r.a)
                    {
                      this.ai = (this.aa - i5);
                      this.ag = (this.ai - a.a(5.5F));
                      break label590;
                    }
                    this.ag = (i4 + this.aa + a.a(5.0F));
                    this.ai = (this.ag + a.a(5.5F));
                    this.O += i5 + j.getIntrinsicWidth() - a.a(8.0F);
                    break label590;
                  }
                  if (!r.a)
                  {
                    this.ag = (this.aa - i5);
                    break label590;
                  }
                  this.ag = (i4 + this.aa + a.a(5.0F));
                  this.O += i5;
                  break label590;
                  i2 = i3;
                  if (!this.au)
                    break label651;
                  i4 = a.a(6.0F) + t.getIntrinsicWidth();
                  i3 -= i4;
                  i2 = i3;
                  if (!r.a)
                    break label651;
                  this.O = (i4 + this.O);
                  i2 = i3;
                  break label651;
                  localException2 = localException2;
                  org.vidogram.messenger.n.a("tmessages", localException2);
                  continue;
                  f1 = 9.0F;
                  continue;
                  this.ak = a.a(16.0F);
                  i4 = getMeasuredWidth();
                  if (a.c())
                    f1 = 65.0F;
                  while (true)
                  {
                    this.b = (i4 - a.a(f1));
                    break;
                    f1 = 61.0F;
                  }
                  this.ao = a.a(11.0F);
                  this.ak += i4;
                }
                if (localObject6 != null)
                {
                  this.as = Math.max(a.a(12.0F), (int)Math.ceil(h.measureText((String)localObject6)));
                  this.at = new StaticLayout((CharSequence)localObject6, h, this.as, Layout.Alignment.ALIGN_CENTER, 1.0F, 0.0F, false);
                  i4 = this.as;
                  i4 = a.a(18.0F) + i4;
                  if (!r.a)
                    this.ar = (getMeasuredWidth() - this.as - a.a(19.0F));
                  while (true)
                  {
                    this.ap = true;
                    i2 -= i4;
                    break;
                    this.ar = a.a(19.0F);
                    this.ak += i4;
                  }
                }
                this.ap = false;
              }
              catch (Exception localException1)
              {
                double d1;
                do
                {
                  do
                  {
                    while (true)
                    {
                      org.vidogram.messenger.n.a("tmessages", localException1);
                      continue;
                      if (!this.au)
                        continue;
                      this.U = (int)(this.O + (i3 - d1) - a.a(6.0F) - t.getIntrinsicWidth());
                    }
                    if ((this.P == null) || (this.P.getLineCount() <= 0))
                      continue;
                    float f1 = this.P.getLineRight(0);
                    if (f1 == i3)
                    {
                      d1 = Math.ceil(this.P.getLineWidth(0));
                      if (d1 < i3)
                        this.O = (int)(this.O - (i3 - d1));
                    }
                    if ((!this.D) && (!this.au))
                      continue;
                    this.U = (int)(f1 + this.O + a.a(6.0F));
                  }
                  while ((this.al == null) || (this.al.getLineCount() <= 0) || (this.al.getLineRight(0) != i1));
                  d1 = Math.ceil(this.al.getLineWidth(0));
                }
                while (d1 >= i1);
                this.ak = (int)(this.ak - (i1 - d1));
                return;
              }
            }
          }
          localObject7 = localObject8;
          continue;
          localObject7 = localObject8;
          localObject5 = "";
        }
      }
      label386: label449: label590: label1360: label1371: label3044: label3945: label4331: label4351: i1 = 1;
      label519: label544: label1454: label1586: label1594: label2245: label3163: label3552: label4324: Object localObject5 = localObject3;
      label651: label1550: label2492: label3790: label3921: localObject3 = localException1;
      label3203: label3464: label4104: label4146: Object localObject2 = localObject5;
      label3584: continue;
      label4369: i1 = 1;
      localObject2 = "";
    }
  }

  public void e()
  {
    if (this.F < getDialogsArray().size())
    {
      g.hq localhq = (g.hq)getDialogsArray().get(this.F);
      g.s locals = org.vidogram.messenger.d.b.a(this.w);
      u localu = (u)v.a().h.get(Long.valueOf(localhq.m));
      if ((this.w != localhq.m) || ((this.E != null) && (this.E.q() != localhq.e)) || ((localu != null) && (localu.a.t != this.x)) || (this.A != localhq.h) || (this.E != localu) || ((this.E == null) && (localu != null)) || (locals != this.N))
      {
        this.w = localhq.m;
        a(0);
      }
    }
  }

  public long getDialogId()
  {
    return this.w;
  }

  public boolean hasOverlappingRendering()
  {
    return false;
  }

  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    this.H.g();
  }

  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    this.H.f();
  }

  protected void onDraw(Canvas paramCanvas)
  {
    if (this.w == 0L);
    while (true)
    {
      return;
      if (this.aw)
        paramCanvas.drawRect(0.0F, 0.0F, getMeasuredWidth(), getMeasuredHeight(), v);
      if (this.Q)
      {
        a(m, this.V, this.W);
        m.draw(paramCanvas);
        label65: if (this.P != null)
        {
          paramCanvas.save();
          paramCanvas.translate(this.O, a.a(13.0F));
          this.P.draw(paramCanvas);
          paramCanvas.restore();
        }
        paramCanvas.save();
        paramCanvas.translate(this.aa, this.ab);
        this.ac.draw(paramCanvas);
        paramCanvas.restore();
        if (this.al != null)
        {
          paramCanvas.save();
          paramCanvas.translate(this.ak, this.aj);
        }
      }
      try
      {
        this.al.draw(paramCanvas);
        paramCanvas.restore();
        if (this.af)
        {
          a(k, this.ag, this.ah);
          k.draw(paramCanvas);
          if ((!this.D) || (this.au))
            break label600;
          a(s, this.U, a.a(16.5F));
          s.draw(paramCanvas);
          if (!this.am)
            break label634;
          a(l, this.ao, this.an);
          l.draw(paramCanvas);
          if (this.a)
          {
            if (!r.a)
              break label791;
            paramCanvas.drawLine(0.0F, getMeasuredHeight() - 1, getMeasuredWidth() - a.a(a.g), getMeasuredHeight() - 1, u);
          }
          this.H.a(paramCanvas);
          if ((this.J == null) || (this.J.r))
            continue;
          r.a();
          ax = r.a(this.J, getContext());
          if (!r.a)
            break label828;
          a(ax, this.b + a.a(5.0F), this.aj + this.al.getHeight() / 2);
          ax.draw(paramCanvas);
          return;
          if (this.R)
          {
            a(p, this.V, this.W);
            p.draw(paramCanvas);
            break label65;
          }
          if (this.S)
          {
            a(q, this.V, this.W);
            q.draw(paramCanvas);
            break label65;
          }
          if (!this.T)
            break label65;
          a(r, this.V, this.W);
          r.draw(paramCanvas);
        }
      }
      catch (Exception localException)
      {
        while (true)
        {
          org.vidogram.messenger.n.a("tmessages", localException);
          continue;
          if (!this.ae)
            continue;
          if (this.ad)
          {
            a(j, this.ai, this.ah);
            j.draw(paramCanvas);
            a(i, this.ag, this.ah);
            i.draw(paramCanvas);
            continue;
          }
          a(i, this.ag, this.ah);
          i.draw(paramCanvas);
          continue;
          label600: if (!this.au)
            continue;
          a(t, this.U, a.a(16.5F));
          t.draw(paramCanvas);
          continue;
          label634: if (!this.ap)
            continue;
          if (this.D)
          {
            a(o, this.ar - a.a(5.5F), this.aq, this.as + a.a(11.0F), n.getIntrinsicHeight());
            o.draw(paramCanvas);
          }
          while (true)
          {
            paramCanvas.save();
            paramCanvas.translate(this.ar, this.aq + a.a(4.0F));
            if (this.at != null)
              this.at.draw(paramCanvas);
            paramCanvas.restore();
            break;
            a(n, this.ar - a.a(5.5F), this.aq, this.as + a.a(11.0F), n.getIntrinsicHeight());
            n.draw(paramCanvas);
          }
          label791: paramCanvas.drawLine(a.a(a.g), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, u);
          continue;
          label828: a(ax, this.b + a.a(35.0F), this.aj + this.al.getHeight() / 2);
        }
      }
    }
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (this.w == 0L)
      super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    do
      return;
    while (!paramBoolean);
    d();
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    paramInt2 = View.MeasureSpec.getSize(paramInt1);
    int i1 = a.a(72.0F);
    if (this.a);
    for (paramInt1 = 1; ; paramInt1 = 0)
    {
      setMeasuredDimension(paramInt2, paramInt1 + i1);
      return;
    }
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if ((Build.VERSION.SDK_INT >= 21) && (getBackground() != null) && ((paramMotionEvent.getAction() == 0) || (paramMotionEvent.getAction() == 2)))
      getBackground().setHotspot(paramMotionEvent.getX(), paramMotionEvent.getY());
    return super.onTouchEvent(paramMotionEvent);
  }

  public void setDialogSelected(boolean paramBoolean)
  {
    if (this.aw != paramBoolean)
      invalidate();
    this.aw = paramBoolean;
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.c.n
 * JD-Core Version:    0.6.0
 */