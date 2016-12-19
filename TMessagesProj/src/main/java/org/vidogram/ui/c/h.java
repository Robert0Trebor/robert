package org.vidogram.ui.c;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.Layout.Alignment;
import android.text.Spannable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.MotionEvent;
import android.view.View.MeasureSpec;
import org.vidogram.messenger.ApplicationLoader;
import org.vidogram.messenger.a;
import org.vidogram.messenger.ad;
import org.vidogram.messenger.m;
import org.vidogram.messenger.n;
import org.vidogram.messenger.q;
import org.vidogram.messenger.u;
import org.vidogram.messenger.v;
import org.vidogram.tgnet.g.ar;
import org.vidogram.tgnet.g.as;
import org.vidogram.tgnet.g.aw;
import org.vidogram.tgnet.g.az;
import org.vidogram.tgnet.g.nc;
import org.vidogram.tgnet.g.vx;
import org.vidogram.ui.Components.b;
import org.vidogram.ui.am;

public class h extends e
{
  private static TextPaint a;
  private static Paint b;
  private URLSpan c;
  private q d;
  private b e;
  private StaticLayout f;
  private int g = 0;
  private int h = 0;
  private int i = 0;
  private int j = 0;
  private int k = 0;
  private int l = 0;
  private boolean m = false;
  private boolean n;
  private u o;
  private a p;

  public h(Context paramContext)
  {
    super(paramContext);
    if (a == null)
    {
      a = new TextPaint(1);
      a.setColor(-1);
      a.linkColor = -1;
      a.setTypeface(a.a("fonts/rmedium.ttf"));
      b = new Paint(1);
    }
    b.setColor(ApplicationLoader.d());
    this.d = new q(this);
    this.d.a(a.a(32.0F));
    this.e = new b();
    a.setTextSize(a.a(v.a().B - 2));
  }

  private int a(int paramInt)
  {
    int i1 = (int)Math.ceil(this.f.getLineWidth(paramInt));
    int i3 = this.f.getLineCount();
    int i2 = paramInt + 1;
    while (i2 < i3)
    {
      int i4 = (int)Math.ceil(this.f.getLineWidth(i2));
      if (Math.abs(i4 - i1) >= a.a(12.0F))
        break;
      i1 = Math.max(i4, i1);
      i2 += 1;
    }
    paramInt -= 1;
    while (paramInt >= 0)
    {
      i2 = (int)Math.ceil(this.f.getLineWidth(paramInt));
      if (Math.abs(i2 - i1) >= a.a(12.0F))
        break;
      i1 = Math.max(i2, i1);
      paramInt -= 1;
    }
    return i1;
  }

  protected void c()
  {
    if (this.p != null)
      this.p.b(this);
  }

  public u getMessageObject()
  {
    return this.o;
  }

  public q getPhotoImage()
  {
    return this.d;
  }

  protected void onDraw(Canvas paramCanvas)
  {
    if (this.o == null);
    do
    {
      return;
      if (this.o.f != 11)
        continue;
      this.d.a(paramCanvas);
    }
    while (this.f == null);
    int i27 = this.f.getLineCount();
    int i28 = a.a(6.0F);
    int i3 = a.a(7.0F);
    int i19 = 0;
    int i1 = 0;
    int i4;
    int i29;
    int i30;
    int i21;
    int i20;
    int i22;
    int i6;
    label137: label144: int i14;
    if (i19 < i27)
    {
      i4 = a(i19);
      i29 = (getMeasuredWidth() - i4) / 2 - a.a(3.0F);
      i30 = i4 + a.a(6.0F);
      i21 = this.f.getLineBottom(i19);
      i20 = i21 - i1;
      i22 = 0;
      if (i19 == i27 - 1)
      {
        i6 = 1;
        if (i19 != 0)
          break label751;
        i1 = 1;
        i4 = i20;
        i14 = i3;
        if (i1 != 0)
        {
          i14 = i3 - a.a(3.0F);
          i4 = i20 + a.a(3.0F);
        }
        if (i6 == 0)
          break label1111;
        i4 += a.a(3.0F);
      }
    }
    label1111: 
    while (true)
    {
      paramCanvas.drawRect(i29, i14, i29 + i30, i14 + i4, b);
      i20 = i6;
      i3 = i22;
      if (i6 == 0)
      {
        i20 = i6;
        i3 = i22;
        if (i19 + 1 < i27)
        {
          i22 = a(i19 + 1) + a.a(6.0F);
          if (i28 * 2 + i22 >= i30)
            break label756;
          i6 = (getMeasuredWidth() - i22) / 2;
          i20 = 1;
          i3 = a.a(3.0F);
          paramCanvas.drawRect(i29, i14 + i4, i6, i14 + i4 + a.a(3.0F), b);
          paramCanvas.drawRect(i6 + i22, i14 + i4, i29 + i30, i14 + i4 + a.a(3.0F), b);
        }
      }
      label358: int i16;
      int i8;
      if ((i1 == 0) && (i19 > 0))
      {
        int i7 = a(i19 - 1) + a.a(6.0F);
        if (i28 * 2 + i7 < i30)
        {
          i22 = (getMeasuredWidth() - i7) / 2;
          i1 = i14 - a.a(3.0F);
          int i15 = a.a(3.0F);
          paramCanvas.drawRect(i29, i1, i22, a.a(3.0F) + i1, b);
          paramCanvas.drawRect(i22 + i7, i1, i29 + i30, a.a(3.0F) + i1, b);
          i16 = i4 + i15;
          i8 = 1;
          i4 = i1;
          i1 = i16;
        }
      }
      while (true)
      {
        paramCanvas.drawRect(i29 - i28, i4 + i28, i29, i4 + i1 + i3 - i28, b);
        paramCanvas.drawRect(i29 + i30, i4 + i28, i29 + i30 + i28, i4 + i1 + i3 - i28, b);
        if (i8 != 0)
        {
          i8 = i29 - i28;
          org.vidogram.ui.a.l.z[0].setBounds(i8, i4, i8 + i28, i4 + i28);
          org.vidogram.ui.a.l.z[0].draw(paramCanvas);
          int i9 = i29 + i30;
          org.vidogram.ui.a.l.z[1].setBounds(i9, i4, i9 + i28, i4 + i28);
          org.vidogram.ui.a.l.z[1].draw(paramCanvas);
        }
        if (i20 != 0)
        {
          i3 = i4 + i1 + i3 - i28;
          int i10 = i29 + i30;
          org.vidogram.ui.a.l.z[2].setBounds(i10, i3, i10 + i28, i3 + i28);
          org.vidogram.ui.a.l.z[2].draw(paramCanvas);
          int i11 = i29 - i28;
          org.vidogram.ui.a.l.z[3].setBounds(i11, i3, i11 + i28, i3 + i28);
          org.vidogram.ui.a.l.z[3].draw(paramCanvas);
        }
        i3 = i4 + i1;
        i19 += 1;
        i1 = i21;
        break;
        int i12 = 0;
        break label137;
        label751: int i2 = 0;
        break label144;
        label756: if (i28 * 2 + i30 < i22)
        {
          i3 = a.a(3.0F);
          i20 = i16 + i4 - a.a(9.0F);
          int i23 = i29 - i28 * 2;
          org.vidogram.ui.a.l.A[2].setBounds(i23, i20, i23 + i28, i20 + i28);
          org.vidogram.ui.a.l.A[2].draw(paramCanvas);
          int i24 = i29 + i30 + i28;
          org.vidogram.ui.a.l.A[3].setBounds(i24, i20, i24 + i28, i20 + i28);
          org.vidogram.ui.a.l.A[3].draw(paramCanvas);
          i20 = i12;
          break label358;
        }
        i3 = a.a(6.0F);
        i20 = i12;
        break label358;
        int i17;
        if (i28 * 2 + i30 < i12)
        {
          i16 -= a.a(3.0F);
          i12 = a.a(3.0F);
          int i25 = i17 + i28;
          int i31 = i29 - i28 * 2;
          org.vidogram.ui.a.l.A[0].setBounds(i31, i25, i31 + i28, i25 + i28);
          org.vidogram.ui.a.l.A[0].draw(paramCanvas);
          int i32 = i29 + i30 + i28;
          org.vidogram.ui.a.l.A[1].setBounds(i32, i25, i32 + i28, i25 + i28);
          org.vidogram.ui.a.l.A[1].draw(paramCanvas);
          i4 += i12;
          i12 = i2;
          i2 = i5;
          i5 = i17;
          continue;
        }
        int i26 = a.a(6.0F);
        int i13 = a.a(6.0F);
        int i18;
        i17 -= i26;
        i5 += i13;
        i13 = i2;
        i2 = i5;
        int i5 = i18;
        continue;
        paramCanvas.save();
        paramCanvas.translate(this.k, this.j);
        this.f.draw(paramCanvas);
        paramCanvas.restore();
        return;
        i13 = i2;
        i2 = i5;
        i5 = i18;
      }
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    paramInt2 = 0;
    if (this.o == null)
    {
      setMeasuredDimension(View.MeasureSpec.getSize(paramInt1), this.h + a.a(14.0F));
      return;
    }
    int i1 = Math.max(a.a(30.0F), View.MeasureSpec.getSize(paramInt1));
    if (i1 != this.l)
    {
      this.l = i1;
      i2 = i1 - a.a(30.0F);
      this.f = new StaticLayout(this.o.b, a, i2, Layout.Alignment.ALIGN_CENTER, 1.0F, 0.0F, false);
      this.h = 0;
      this.g = 0;
      try
      {
        int i3 = this.f.getLineCount();
        paramInt1 = 0;
        while (true)
          if (paramInt1 < i3)
            try
            {
              float f2 = this.f.getLineWidth(paramInt1);
              float f1 = f2;
              if (f2 > i2)
                f1 = i2;
              this.h = (int)Math.max(this.h, Math.ceil(this.f.getLineBottom(paramInt1)));
              this.g = (int)Math.max(this.g, Math.ceil(f1));
              paramInt1 += 1;
            }
            catch (Exception localException1)
            {
              n.a("tmessages", localException1);
              return;
            }
      }
      catch (Exception localException2)
      {
        n.a("tmessages", localException2);
        this.i = ((i1 - this.g) / 2);
        this.j = a.a(7.0F);
        this.k = ((i1 - this.f.getWidth()) / 2);
        if (this.o.f == 11)
          this.d.a((i1 - a.a(64.0F)) / 2, this.h + a.a(15.0F), a.a(64.0F), a.a(64.0F));
      }
    }
    int i2 = this.h;
    paramInt1 = paramInt2;
    if (this.o.f == 11)
      paramInt1 = 70;
    setMeasuredDimension(i1, i2 + a.a(paramInt1 + 14));
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    float f3 = paramMotionEvent.getX();
    float f1 = paramMotionEvent.getY();
    if (paramMotionEvent.getAction() == 0)
    {
      if (this.p == null)
        break label418;
      if ((this.o.f != 11) || (!this.d.a(f3, f1)))
        break label529;
      this.m = true;
    }
    label513: label521: label529: for (boolean bool2 = true; ; bool2 = false)
    {
      boolean bool1 = bool2;
      if (bool2)
      {
        a();
        bool1 = bool2;
      }
      while (true)
      {
        if ((bool1) || ((paramMotionEvent.getAction() != 0) && ((this.c == null) || (paramMotionEvent.getAction() != 1))))
          break label510;
        if ((f3 < this.i) || (f1 < this.j) || (f3 > this.i + this.g) || (f1 > this.j + this.h))
          break label521;
        float f2 = this.j;
        f3 -= this.k;
        int i1 = this.f.getLineForVertical((int)(f1 - f2));
        int i2 = this.f.getOffsetForHorizontal(i1, f3);
        f1 = this.f.getLineLeft(i1);
        if ((f1 > f3) || (this.f.getLineWidth(i1) + f1 < f3) || (!(this.o.b instanceof Spannable)))
          break label513;
        Object localObject = (URLSpan[])((Spannable)this.o.b).getSpans(i2, i2, URLSpan.class);
        if (localObject.length == 0)
          break;
        if (paramMotionEvent.getAction() == 0)
        {
          this.c = localObject[0];
          bool1 = true;
          bool2 = bool1;
          if (!bool1)
            bool2 = super.onTouchEvent(paramMotionEvent);
          return bool2;
          if (paramMotionEvent.getAction() != 2)
            b();
          if (this.m)
            if (paramMotionEvent.getAction() == 1)
            {
              this.m = false;
              if (this.p != null)
              {
                this.p.a(this);
                playSoundEffect(0);
                bool1 = false;
                continue;
              }
            }
            else
            {
              if (paramMotionEvent.getAction() == 3)
              {
                this.m = false;
                bool1 = false;
                continue;
              }
              if ((paramMotionEvent.getAction() == 2) && (!this.d.a(f3, f1)))
                this.m = false;
            }
          label418: bool1 = false;
          continue;
        }
        if (localObject[0] != this.c)
          break label510;
        if (this.p != null)
        {
          localObject = localObject[0].getURL();
          if (!((String)localObject).startsWith("game"))
            break label488;
          this.p.a(this, this.o.a.g);
        }
        while (true)
        {
          bool1 = true;
          break;
          label488: this.p.a(Integer.parseInt((String)localObject));
        }
      }
      this.c = null;
      while (true)
      {
        label510: break;
        this.c = null;
        continue;
        this.c = null;
      }
    }
  }

  public void setDelegate(a parama)
  {
    this.p = parama;
  }

  public void setMessageObject(u paramu)
  {
    boolean bool2 = true;
    if ((this.o == paramu) && ((this.n) || (paramu.e == null)))
      return;
    this.o = paramu;
    boolean bool1;
    int i1;
    if (paramu.e != null)
    {
      bool1 = true;
      this.n = bool1;
      this.l = 0;
      if (this.o.f != 11)
        break label318;
      if (paramu.a.d == null)
        break label332;
      if (paramu.a.d.d == 0)
        break label197;
      i1 = paramu.a.d.d;
    }
    while (true)
    {
      label98: this.e.a(i1, null, null, false);
      if ((this.o.a.f instanceof g.nc))
      {
        this.d.a(this.o.a.f.j.e, "50_50", this.e, null, false);
        label157: paramu = this.d;
        if (am.a().a(this.o))
          break label312;
        bool1 = bool2;
        label179: paramu.a(bool1, false);
      }
      while (true)
      {
        requestLayout();
        return;
        bool1 = false;
        break;
        label197: if (paramu.a.d.b != 0)
        {
          i1 = paramu.a.d.b;
          break label98;
        }
        int i2 = paramu.a.d.c;
        i1 = i2;
        if (i2 != ad.c())
          break label98;
        i1 = paramu.a.c;
        break label98;
        paramu = m.a(this.o.m, a.a(64.0F));
        if (paramu != null)
        {
          this.d.a(paramu.c, "50_50", this.e, null, false);
          break label157;
        }
        this.d.a(this.e);
        break label157;
        label312: bool1 = false;
        break label179;
        label318: this.d.a((Bitmap)null);
      }
      label332: i1 = 0;
    }
  }

  public static abstract interface a
  {
    public abstract void a(int paramInt);

    public abstract void a(h paramh);

    public abstract void a(h paramh, int paramInt);

    public abstract void b(h paramh);
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.c.h
 * JD-Core Version:    0.6.0
 */