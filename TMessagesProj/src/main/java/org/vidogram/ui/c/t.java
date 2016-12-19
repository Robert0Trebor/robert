package org.vidogram.ui.c;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils.TruncateAt;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.vidogram.messenger.a;
import org.vidogram.messenger.d.g;
import org.vidogram.messenger.r;
import org.vidogram.tgnet.g.be;
import org.vidogram.tgnet.g.bf;
import org.vidogram.ui.Components.v;

public class t extends FrameLayout
{
  private static Paint j;
  Drawable a = new Drawable()
  {
    Paint a = new Paint(1);

    public void draw(Canvas paramCanvas)
    {
      this.a.setColor(-11688214);
      paramCanvas.drawCircle(a.a(8.0F), 0.0F, a.a(4.0F), this.a);
    }

    public int getIntrinsicHeight()
    {
      return a.a(26.0F);
    }

    public int getIntrinsicWidth()
    {
      return a.a(12.0F);
    }

    public int getOpacity()
    {
      return 0;
    }

    public void setAlpha(int paramInt)
    {
    }

    public void setColorFilter(ColorFilter paramColorFilter)
    {
    }
  };
  private TextView b;
  private TextView c;
  private TextView d;
  private g.bf e;
  private boolean f;
  private float g;
  private RectF h = new RectF();
  private long i;
  private int k;
  private boolean l;
  private boolean m;

  public t(Context paramContext, int paramInt)
  {
    super(paramContext);
    if (j == null)
    {
      j = new Paint(1);
      j.setColor(-1);
      j.setStrokeCap(Paint.Cap.ROUND);
      j.setStyle(Paint.Style.STROKE);
    }
    j.setStrokeWidth(a.a(2.0F));
    this.b = new TextView(paramContext);
    this.b.setTextColor(-13421773);
    this.b.setTextSize(1, 17.0F);
    this.b.setTypeface(a.a("fonts/rmedium.ttf"));
    this.b.setEllipsize(TextUtils.TruncateAt.END);
    this.b.setSingleLine(true);
    addView(this.b, v.a(-2, -1.0F, 51, paramInt, 8.0F, 100.0F, 0.0F));
    this.c = new TextView(paramContext);
    this.c.setTextColor(-7697782);
    this.c.setTextSize(1, 13.0F);
    this.c.setEllipsize(TextUtils.TruncateAt.END);
    this.c.setSingleLine(true);
    addView(this.c, v.a(-2, -1.0F, 51, paramInt, 30.0F, 100.0F, 0.0F));
    this.d = new TextView(paramContext)
    {
      protected void onDraw(Canvas paramCanvas)
      {
        super.onDraw(paramCanvas);
        long l1;
        long l2;
        if ((t.a(t.this)) || ((!t.a(t.this)) && (t.b(t.this) != 0.0F)))
        {
          t.b().setAlpha(Math.min(255, (int)(t.b(t.this) * 255.0F)));
          int i = getMeasuredWidth() - a.a(11.0F);
          t.c(t.this).set(i, a.a(3.0F), i + a.a(8.0F), a.a(11.0F));
          paramCanvas.drawArc(t.c(t.this), t.d(t.this), 220.0F, false, t.b());
          invalidate((int)t.c(t.this).left - a.a(2.0F), (int)t.c(t.this).top - a.a(2.0F), (int)t.c(t.this).right + a.a(2.0F), (int)t.c(t.this).bottom + a.a(2.0F));
          l1 = System.currentTimeMillis();
          if (Math.abs(t.e(t.this) - System.currentTimeMillis()) < 1000L)
          {
            l2 = l1 - t.e(t.this);
            float f = (float)(360L * l2) / 2000.0F;
            t.a(t.this, (int)(f + t.d(t.this)));
            t.a(t.this, t.d(t.this) - t.d(t.this) / 360 * 360);
            if (!t.a(t.this))
              break label379;
            if (t.b(t.this) < 1.0F)
            {
              paramCanvas = t.this;
              f = t.b(t.this);
              t.a(paramCanvas, (float)l2 / 200.0F + f);
              if (t.b(t.this) > 1.0F)
                t.a(t.this, 1.0F);
            }
          }
        }
        while (true)
        {
          t.a(t.this, l1);
          invalidate();
          return;
          label379: if (t.b(t.this) <= 0.0F)
            continue;
          t.a(t.this, t.b(t.this) - (float)l2 / 200.0F);
          if (t.b(t.this) >= 0.0F)
            continue;
          t.a(t.this, 0.0F);
        }
      }
    };
    this.d.setPadding(a.a(17.0F), 0, a.a(17.0F), 0);
    this.d.setGravity(17);
    this.d.setTextColor(-1);
    this.d.setTextSize(1, 14.0F);
    this.d.setTypeface(a.a("fonts/rmedium.ttf"));
    addView(this.d, v.a(-2, 28.0F, 53, 0.0F, 16.0F, 14.0F, 0.0F));
  }

  public void a(g.bf parambf, boolean paramBoolean)
  {
    this.i = System.currentTimeMillis();
    this.b.setText(parambf.b.d);
    this.c.setText(r.b("Stickers", parambf.b.k));
    if (paramBoolean)
    {
      this.b.setCompoundDrawablesWithIntrinsicBounds(null, null, this.a, null);
      if (!this.m)
        break label168;
      this.d.setVisibility(0);
      paramBoolean = g.a(parambf.b.b);
      this.l = paramBoolean;
      if (!paramBoolean)
        break label139;
      this.d.setBackgroundResource(2130837727);
      this.d.setText(r.a("StickersRemove", 2131231873).toUpperCase());
    }
    while (true)
    {
      this.e = parambf;
      return;
      this.b.setCompoundDrawablesWithIntrinsicBounds(null, null, null, null);
      break;
      label139: this.d.setBackgroundResource(2130837591);
      this.d.setText(r.a("Add", 2131230811).toUpperCase());
      continue;
      label168: this.d.setVisibility(8);
    }
  }

  public boolean a()
  {
    return this.l;
  }

  public g.bf getStickerSet()
  {
    return this.e;
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, View.MeasureSpec.makeMeasureSpec(a.a(60.0F), 1073741824));
  }

  public void setAddOnClickListener(View.OnClickListener paramOnClickListener)
  {
    this.m = true;
    this.d.setOnClickListener(paramOnClickListener);
  }

  public void setDrawProgress(boolean paramBoolean)
  {
    this.f = paramBoolean;
    this.i = System.currentTimeMillis();
    this.d.invalidate();
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.c.t
 * JD-Core Version:    0.6.0
 */