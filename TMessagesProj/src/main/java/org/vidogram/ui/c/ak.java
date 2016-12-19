package org.vidogram.ui.c;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.view.MotionEvent;
import android.view.View.MeasureSpec;
import java.util.concurrent.ConcurrentHashMap;
import org.vidogram.messenger.a;
import org.vidogram.messenger.ad;
import org.vidogram.messenger.ae;
import org.vidogram.messenger.q;
import org.vidogram.messenger.r;
import org.vidogram.messenger.v;
import org.vidogram.tgnet.ConnectionsManager;
import org.vidogram.tgnet.f;
import org.vidogram.tgnet.g.hq;
import org.vidogram.tgnet.g.i;
import org.vidogram.tgnet.g.m;
import org.vidogram.tgnet.g.t;
import org.vidogram.tgnet.g.vw;
import org.vidogram.tgnet.g.vx;
import org.vidogram.tgnet.g.vy;
import org.vidogram.tgnet.g.x;

public class ak extends e
{
  private static TextPaint c;
  private static TextPaint d;
  private static TextPaint e;
  private static TextPaint f;
  private static TextPaint g;
  private static Drawable h;
  private static Drawable i;
  private static Drawable j;
  private static Drawable k;
  private static Drawable l;
  private static Drawable m;
  private static Drawable n;
  private static Paint o;
  private int A;
  private int B;
  private StaticLayout C;
  private boolean D;
  private boolean E;
  private boolean F;
  private boolean G;
  private int H;
  private int I;
  private boolean J;
  private int K;
  private int L = a.a(25.0F);
  private int M;
  private int N;
  private StaticLayout O;
  private boolean P;
  private int Q;
  private StaticLayout R;
  public boolean a = false;
  public float b = 1.0F;
  private CharSequence p;
  private q q;
  private org.vidogram.ui.Components.b r;
  private CharSequence s;
  private g.vw t = null;
  private g.i u = null;
  private g.t v = null;
  private long w;
  private String x = null;
  private int y = 0;
  private g.x z = null;

  public ak(Context paramContext)
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
      e.setColor(-14255946);
      f = new TextPaint(1);
      f.setColor(-6710887);
      o = new Paint();
      o.setColor(-2302756);
      g = new TextPaint(1);
      g.setColor(-1);
      g.setTypeface(a.a("fonts/rmedium.ttf"));
      j = getResources().getDrawable(2130837939);
      h = getResources().getDrawable(2130837945);
      k = getResources().getDrawable(2130837942);
      l = getResources().getDrawable(2130837730);
      m = getResources().getDrawable(2130837731);
      n = getResources().getDrawable(2130837683);
      i = getResources().getDrawable(2130837658);
    }
    c.setTextSize(a.a(17.0F));
    d.setTextSize(a.a(17.0F));
    e.setTextSize(a.a(16.0F));
    f.setTextSize(a.a(16.0F));
    g.setTextSize(a.a(13.0F));
    this.q = new q(this);
    this.q.a(a.a(26.0F));
    this.r = new org.vidogram.ui.Components.b();
  }

  public void a(int paramInt)
  {
    if (this.t != null)
      if (this.t.j == null)
        break label594;
    label140: label185: label572: label577: label583: label588: label594: for (g.x localx = this.t.j.e; ; localx = null)
    {
      this.r.a(this.t);
      int i1;
      int i3;
      Object localObject;
      if (paramInt != 0)
      {
        if ((((paramInt & 0x2) == 0) || (this.t == null)) && (((paramInt & 0x8) == 0) || (this.u == null) || (((this.z == null) || (localx != null)) && ((this.z != null) || (localx == null) || (this.z == null) || (localx == null) || ((this.z.c == localx.c) && (this.z.d == localx.d))))))
          break label583;
        i1 = 1;
        int i2 = i1;
        if (i1 == 0)
        {
          i2 = i1;
          if ((paramInt & 0x4) != 0)
          {
            i2 = i1;
            if (this.t != null)
            {
              if (this.t.k == null)
                break label577;
              i3 = this.t.k.c;
              i2 = i1;
              if (i3 != this.y)
                i2 = 1;
            }
          }
        }
        if ((i2 != 0) || ((paramInt & 0x1) == 0) || (this.t == null))
        {
          i1 = i2;
          if ((paramInt & 0x10) != 0)
          {
            i1 = i2;
            if (this.u == null);
          }
        }
        else
        {
          if (this.t == null)
            break label412;
          localObject = this.t.e + this.t.f;
          i1 = i2;
          if (!((String)localObject).equals(this.x))
            i1 = 1;
        }
        if ((i1 != 0) || (!this.J) || ((paramInt & 0x100) == 0))
          break label572;
        localObject = (g.hq)v.a().g.get(Long.valueOf(this.w));
        if ((localObject == null) || (((g.hq)localObject).h == this.K))
          break label572;
        paramInt = 1;
        label347: if (paramInt == 0)
        {
          return;
          if (this.u != null)
            if (this.u.j == null)
              break label588;
        }
      }
      for (localx = this.u.j.b; ; localx = null)
      {
        this.r.a(this.u);
        break;
        this.r.a(0, null, null, false);
        localx = null;
        break;
        localObject = this.u.i;
        break label272;
        if (this.t != null)
          if (this.t.k != null)
          {
            this.y = this.t.k.c;
            this.x = (this.t.e + this.t.f);
            label489: this.z = localx;
            this.q.a(localx, "50_50", this.r, null, false);
            if ((getMeasuredWidth() == 0) && (getMeasuredHeight() == 0))
              break label565;
            d();
          }
        while (true)
        {
          postInvalidate();
          return;
          this.y = 0;
          break;
          if (this.u == null)
            break label489;
          this.x = this.u.i;
          break label489;
          requestLayout();
        }
        paramInt = i1;
        break label347;
        i3 = 0;
        break label185;
        i1 = 0;
        break label140;
      }
    }
  }

  public void a(f paramf, g.t paramt, CharSequence paramCharSequence1, CharSequence paramCharSequence2, boolean paramBoolean)
  {
    this.p = paramCharSequence1;
    if ((paramf instanceof g.vw))
    {
      this.t = ((g.vw)paramf);
      this.u = null;
    }
    while (true)
    {
      this.v = paramt;
      this.s = paramCharSequence2;
      this.J = paramBoolean;
      a(0);
      return;
      if (!(paramf instanceof g.i))
        continue;
      this.u = ((g.i)paramf);
      this.t = null;
    }
  }

  public void d()
  {
    this.E = false;
    this.D = false;
    this.F = false;
    this.P = false;
    this.G = false;
    Object localObject1;
    if (this.v != null)
    {
      this.D = true;
      this.w = (this.v.b << 32);
      if (!r.a)
      {
        this.H = a.a(a.g);
        this.A = (a.a(a.g + 4) + h.getIntrinsicWidth());
        this.I = a.a(16.5F);
        if (this.p == null)
          break label1254;
        localObject1 = this.p;
        if (((CharSequence)localObject1).length() != 0)
          break label1841;
        if ((this.t == null) || (this.t.i == null) || (this.t.i.length() == 0))
          break label1308;
        localObject1 = org.vidogram.a.b.a().e("+" + this.t.i);
      }
    }
    label422: label1330: 
    while (true)
    {
      label186: Object localObject2;
      label198: int i1;
      int i2;
      if (this.v != null)
      {
        localObject2 = d;
        if (r.a)
          break label1330;
        i1 = getMeasuredWidth() - this.A - a.a(14.0F);
        i2 = i1;
        label226: if (!this.D)
          break label1356;
        i1 -= a.a(6.0F) + h.getIntrinsicWidth();
      }
      label1204: label1356: label1490: 
      while (true)
      {
        label251: Object localObject3;
        int i3;
        label494: float f1;
        label600: label616: double d1;
        if (this.J)
        {
          localObject3 = (g.hq)v.a().g.get(Long.valueOf(this.w));
          if ((localObject3 != null) && (((g.hq)localObject3).h != 0))
          {
            this.K = ((g.hq)localObject3).h;
            localObject3 = String.format("%d", new Object[] { Integer.valueOf(((g.hq)localObject3).h) });
            this.N = Math.max(a.a(12.0F), (int)Math.ceil(g.measureText((String)localObject3)));
            this.O = new StaticLayout((CharSequence)localObject3, g, this.N, Layout.Alignment.ALIGN_CENTER, 1.0F, 0.0F, false);
            i3 = this.N + a.a(18.0F);
            i1 -= i3;
            if (!r.a)
            {
              this.M = (getMeasuredWidth() - this.N - a.a(19.0F));
              this.C = new StaticLayout(TextUtils.ellipsize((CharSequence)localObject1, (TextPaint)localObject2, i1 - a.a(12.0F), TextUtils.TruncateAt.END), (TextPaint)localObject2, i1, Layout.Alignment.ALIGN_NORMAL, 1.0F, 0.0F, false);
              if ((this.u != null) && (this.s == null))
                break label1643;
              if (r.a)
                break label1490;
              this.Q = a.a(a.g);
              localObject1 = "";
              localObject3 = f;
              if (this.s == null)
                break label1503;
              localObject1 = this.s;
              localObject2 = localObject3;
              this.R = new StaticLayout(TextUtils.ellipsize((CharSequence)localObject1, (TextPaint)localObject2, i2 - a.a(12.0F), TextUtils.TruncateAt.END), (TextPaint)localObject2, i2, Layout.Alignment.ALIGN_NORMAL, 1.0F, 0.0F, false);
              this.B = a.a(13.0F);
              if ((this.s != null) && (this.u != null))
                this.I -= a.a(12.0F);
              if (r.a)
                break label1668;
              if (!a.c())
                break label1660;
              f1 = 13.0F;
              i3 = a.a(f1);
              this.q.a(i3, a.a(10.0F), a.a(52.0F), a.a(52.0F));
              if (!r.a)
                break label1706;
              double d2;
              if ((this.C.getLineCount() > 0) && (this.C.getLineLeft(0) == 0.0F))
              {
                d1 = Math.ceil(this.C.getLineWidth(0));
                if (d1 < i1)
                {
                  d2 = this.A;
                  this.A = (int)(i1 - d1 + d2);
                }
              }
              if ((this.R != null) && (this.R.getLineCount() > 0) && (this.R.getLineLeft(0) == 0.0F))
              {
                d1 = Math.ceil(this.R.getLineWidth(0));
                if (d1 < i2)
                {
                  d2 = this.Q;
                  this.Q = (int)(i2 - d1 + d2);
                }
              }
            }
          }
        }
        label872: label1007: label1018: label1660: 
        do
        {
          do
          {
            return;
            this.H = (getMeasuredWidth() - a.a(a.g + 2) - h.getIntrinsicWidth());
            this.A = a.a(11.0F);
            break;
            if (this.u != null)
            {
              if (this.u.h < 0)
              {
                this.w = a.a(this.u.h);
                this.E = true;
                this.I = a.a(28.5F);
                this.P = this.u.q;
                if (r.a)
                  break label1018;
                this.H = a.a(a.g);
                i2 = a.a(a.g + 4);
                if (!this.F)
                  break label1007;
              }
              for (i1 = k.getIntrinsicWidth(); ; i1 = j.getIntrinsicWidth())
              {
                this.A = (i1 + i2);
                break;
                this.w = (-this.u.h);
                if ((org.vidogram.messenger.e.d(this.u)) && (!this.u.r))
                {
                  this.E = true;
                  this.I = a.a(28.5F);
                  break label872;
                }
                this.F = true;
                this.I = a.a(30.0F);
                break label872;
              }
              i2 = getMeasuredWidth();
              i3 = a.a(a.g + 2);
              if (this.F);
              for (i1 = k.getIntrinsicWidth(); ; i1 = j.getIntrinsicWidth())
              {
                this.H = (i2 - i3 - i1);
                this.A = a.a(11.0F);
                break;
              }
            }
            this.w = this.t.d;
            if (!r.a)
            {
              this.A = a.a(a.g);
              if (!this.t.r)
                break label1242;
              this.G = true;
              if (r.a)
                break label1204;
              this.H = a.a(a.g);
              this.A = (a.a(a.g + 4) + i.getIntrinsicWidth());
            }
            for (this.I = a.a(16.5F); ; this.I = a.a(17.0F))
            {
              this.P = this.t.u;
              break;
              this.A = a.a(11.0F);
              break label1115;
              this.H = (getMeasuredWidth() - a.a(a.g + 2) - i.getIntrinsicWidth());
              this.A = a.a(11.0F);
              break label1167;
            }
            localObject1 = "";
            if (this.u != null)
              localObject1 = this.u.i;
            while (true)
            {
              localObject1 = ((String)localObject1).replace('\n', ' ');
              break;
              if (this.t == null)
                continue;
              localObject1 = ae.c(this.t);
            }
            localObject1 = r.a("HiddenName", 2131231289);
            break label186;
            localObject2 = c;
            break label198;
            i1 = getMeasuredWidth() - this.A - a.a(a.g);
            i2 = i1;
            break label226;
            if (this.E)
            {
              i1 -= a.a(6.0F) + j.getIntrinsicWidth();
              break label251;
            }
            if (this.F)
            {
              i1 -= a.a(6.0F) + k.getIntrinsicWidth();
              break label251;
            }
            if (!this.G)
              break label1838;
            i1 -= a.a(6.0F) + i.getIntrinsicWidth();
            break label251;
            this.M = a.a(19.0F);
            this.A = (i3 + this.A);
            break label422;
            this.K = 0;
            this.O = null;
            break label422;
            this.K = 0;
            this.O = null;
            break label422;
            this.Q = a.a(11.0F);
            break label494;
            localObject2 = localObject3;
            if (this.t == null)
              break label521;
            if (this.t.r)
            {
              localObject1 = r.a("Bot", 2131230922);
              localObject2 = localObject3;
              break label521;
            }
            String str = r.a(this.t);
            localObject1 = str;
            localObject2 = localObject3;
            if (this.t == null)
              break label521;
            if (this.t.d != ad.c())
            {
              localObject1 = str;
              localObject2 = localObject3;
              if (this.t.k == null)
                break label521;
              localObject1 = str;
              localObject2 = localObject3;
              if (this.t.k.c <= ConnectionsManager.a().b())
                break label521;
            }
            localObject2 = e;
            localObject1 = r.a("Online", 2131231606);
            break label521;
            this.R = null;
            this.B = a.a(25.0F);
            break label600;
            f1 = 9.0F;
            break label616;
            i3 = getMeasuredWidth();
            if (a.c())
              f1 = 65.0F;
            while (true)
            {
              i3 -= a.a(f1);
              break;
              f1 = 61.0F;
            }
            if ((this.C.getLineCount() <= 0) || (this.C.getLineRight(0) != i1))
              continue;
            d1 = Math.ceil(this.C.getLineWidth(0));
            if (d1 >= i1)
              continue;
            this.A = (int)(this.A - (i1 - d1));
          }
          while ((this.R == null) || (this.R.getLineCount() <= 0) || (this.R.getLineRight(0) != i2));
          d1 = Math.ceil(this.R.getLineWidth(0));
        }
        while (d1 >= i2);
        label1115: label1254: label1643: this.Q = (int)(this.Q - (i2 - d1));
        label1242: label1503: return;
      }
    }
  }

  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    this.q.g();
  }

  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    this.q.f();
  }

  protected void onDraw(Canvas paramCanvas)
  {
    if ((this.t == null) && (this.u == null) && (this.v == null))
      return;
    label135: label215: Drawable localDrawable;
    int i1;
    int i2;
    int i3;
    int i4;
    if (this.a)
    {
      if (r.a)
        paramCanvas.drawLine(0.0F, getMeasuredHeight() - 1, getMeasuredWidth() - a.a(a.g), getMeasuredHeight() - 1, o);
    }
    else
    {
      if (this.b != 1.0F)
        paramCanvas.saveLayerAlpha(0.0F, 0.0F, paramCanvas.getWidth(), paramCanvas.getHeight(), (int)(255.0F * this.b), 4);
      if (!this.D)
        break label429;
      a(h, this.H, this.I);
      h.draw(paramCanvas);
      if (this.C != null)
      {
        paramCanvas.save();
        paramCanvas.translate(this.A, this.B);
        this.C.draw(paramCanvas);
        paramCanvas.restore();
        if (this.P)
        {
          if (!r.a)
            break label525;
          a(n, this.A - a.a(4.0F) - n.getIntrinsicWidth(), this.I);
          n.draw(paramCanvas);
        }
      }
      if (this.R != null)
      {
        paramCanvas.save();
        paramCanvas.translate(this.Q, a.a(40.0F));
        this.R.draw(paramCanvas);
        paramCanvas.restore();
      }
      if (this.O != null)
      {
        if (!v.a().a(this.w))
          break label560;
        localDrawable = m;
        i1 = this.M;
        i2 = a.a(5.5F);
        i3 = this.L;
        i4 = this.N;
        a(localDrawable, i1 - i2, i3, a.a(11.0F) + i4, m.getIntrinsicHeight());
        m.draw(paramCanvas);
      }
    }
    while (true)
    {
      paramCanvas.save();
      paramCanvas.translate(this.M, this.L + a.a(4.0F));
      this.O.draw(paramCanvas);
      paramCanvas.restore();
      this.q.a(paramCanvas);
      return;
      paramCanvas.drawLine(a.a(a.g), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, o);
      break;
      label429: if (this.F)
      {
        a(k, this.H, this.I);
        k.draw(paramCanvas);
        break label135;
      }
      if (this.E)
      {
        a(j, this.H, this.I);
        j.draw(paramCanvas);
        break label135;
      }
      if (!this.G)
        break label135;
      a(i, this.H, this.I);
      i.draw(paramCanvas);
      break label135;
      label525: a(n, this.A + (int)this.C.getLineWidth(0) + a.a(4.0F), this.I);
      break label215;
      label560: localDrawable = l;
      i1 = this.M;
      i2 = a.a(5.5F);
      i3 = this.L;
      i4 = this.N;
      a(localDrawable, i1 - i2, i3, a.a(11.0F) + i4, l.getIntrinsicHeight());
      l.draw(paramCanvas);
    }
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if ((this.t == null) && (this.u == null) && (this.v == null))
      super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    do
      return;
    while (!paramBoolean);
    d();
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    setMeasuredDimension(View.MeasureSpec.getSize(paramInt1), a.a(72.0F));
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if ((Build.VERSION.SDK_INT >= 21) && (getBackground() != null) && ((paramMotionEvent.getAction() == 0) || (paramMotionEvent.getAction() == 2)))
      getBackground().setHotspot(paramMotionEvent.getX(), paramMotionEvent.getY());
    return super.onTouchEvent(paramMotionEvent);
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.c.ak
 * JD-Core Version:    0.6.0
 */