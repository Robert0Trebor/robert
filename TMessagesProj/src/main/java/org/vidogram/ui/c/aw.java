package org.vidogram.ui.c;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextPaint;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.vidogram.messenger.a;
import org.vidogram.messenger.d.g;
import org.vidogram.messenger.j;
import org.vidogram.messenger.q;
import org.vidogram.tgnet.g.az;
import org.vidogram.tgnet.g.ia;
import org.vidogram.tgnet.g.q;
import org.vidogram.tgnet.g.r;
import org.vidogram.ui.Components.BackupImageView;
import org.vidogram.ui.Components.v;

public class aw extends FrameLayout
{
  private static AccelerateInterpolator j = new AccelerateInterpolator(0.5F);
  private BackupImageView a;
  private g.q b;
  private TextView c;
  private float d = 1.0F;
  private boolean e;
  private long f;
  private boolean g;
  private float h;
  private long i = 0L;

  public aw(Context paramContext)
  {
    super(paramContext);
    this.a = new BackupImageView(paramContext);
    this.a.setAspectFit(true);
    addView(this.a, v.b(66, 66, 17));
    this.c = new TextView(paramContext);
    this.c.setTextSize(1, 16.0F);
    addView(this.c, v.b(28, 28, 85));
  }

  public void a()
  {
    this.e = true;
    this.d = 0.5F;
    this.i = 0L;
    this.a.getImageReceiver().a(this.d);
    this.a.invalidate();
    this.f = System.currentTimeMillis();
    invalidate();
  }

  public void a(g.q paramq, boolean paramBoolean)
  {
    if (paramq != null)
    {
      this.b = paramq;
      if (paramq.i != null)
        this.a.a(paramq.i.c, null, "webp", null);
      if (!paramBoolean)
        break label180;
      k = 0;
      if (k >= paramq.o.size())
        break label189;
      g.r localr = (g.r)paramq.o.get(k);
      if (!(localr instanceof g.ia))
        break label173;
      if ((localr.b == null) || (localr.b.length() <= 0))
        break label189;
      this.c.setText(j.a(localr.b, this.c.getPaint().getFontMetricsInt(), a.a(16.0F), false));
    }
    label173: label180: label189: for (int k = 1; ; k = 0)
    {
      if (k == 0)
        this.c.setText(j.a(g.b(this.b.b), this.c.getPaint().getFontMetricsInt(), a.a(16.0F), false));
      this.c.setVisibility(0);
      return;
      k += 1;
      break;
      this.c.setVisibility(4);
      return;
    }
  }

  public boolean b()
  {
    return this.e;
  }

  public boolean c()
  {
    return this.a.getImageReceiver().h() != null;
  }

  protected boolean drawChild(Canvas paramCanvas, View paramView, long paramLong)
  {
    boolean bool = super.drawChild(paramCanvas, paramView, paramLong);
    long l;
    if ((paramView == this.a) && ((this.e) || ((this.g) && (this.h != 0.8F)) || ((!this.g) && (this.h != 1.0F))))
    {
      paramLong = System.currentTimeMillis();
      l = paramLong - this.f;
      this.f = paramLong;
      if (!this.e)
        break label203;
      this.i += l;
      if (this.i > 1050L)
        this.i = 1050L;
      this.d = (0.5F + j.getInterpolation((float)this.i / 1050.0F) * 0.5F);
      if (this.d >= 1.0F)
      {
        this.e = false;
        this.d = 1.0F;
      }
      this.a.getImageReceiver().a(this.d);
    }
    while (true)
    {
      this.a.setScaleX(this.h);
      this.a.setScaleY(this.h);
      this.a.invalidate();
      invalidate();
      return bool;
      label203: if ((this.g) && (this.h != 0.8F))
      {
        this.h -= (float)l / 400.0F;
        if (this.h >= 0.8F)
          continue;
        this.h = 0.8F;
        continue;
      }
      this.h += (float)l / 400.0F;
      if (this.h <= 1.0F)
        continue;
      this.h = 1.0F;
    }
  }

  public g.q getSticker()
  {
    return this.b;
  }

  public void invalidate()
  {
    this.c.invalidate();
    super.invalidate();
  }

  public void setScaled(boolean paramBoolean)
  {
    this.g = paramBoolean;
    this.f = System.currentTimeMillis();
    invalidate();
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.c.aw
 * JD-Core Version:    0.6.0
 */