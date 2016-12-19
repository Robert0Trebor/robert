package org.vidogram.ui.c;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils.TruncateAt;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.concurrent.ConcurrentHashMap;
import org.vidogram.messenger.a;
import org.vidogram.messenger.f;
import org.vidogram.tgnet.g.hq;
import org.vidogram.tgnet.g.i;
import org.vidogram.tgnet.g.m;
import org.vidogram.tgnet.g.vw;
import org.vidogram.tgnet.g.vx;
import org.vidogram.ui.Components.BackupImageView;
import org.vidogram.ui.Components.b;

public class x extends FrameLayout
{
  private static Drawable d;
  private static Drawable e;
  private static TextPaint f;
  private BackupImageView a;
  private TextView b;
  private b c = new b();
  private int g;
  private int h;
  private StaticLayout i;
  private long j;

  public x(Context paramContext)
  {
    super(paramContext);
    setBackgroundResource(2130837946);
    this.a = new BackupImageView(paramContext);
    this.a.setRoundRadius(a.a(27.0F));
    addView(this.a, org.vidogram.ui.Components.v.a(54, 54.0F, 49, 0.0F, 7.0F, 0.0F, 0.0F));
    this.b = new TextView(paramContext);
    this.b.setTextColor(-14606047);
    this.b.setTextSize(1, 12.0F);
    this.b.setMaxLines(2);
    this.b.setGravity(49);
    this.b.setLines(2);
    this.b.setEllipsize(TextUtils.TruncateAt.END);
    addView(this.b, org.vidogram.ui.Components.v.a(-1, -2.0F, 51, 6.0F, 64.0F, 6.0F, 0.0F));
    if (d == null)
    {
      d = getResources().getDrawable(2130837730);
      e = getResources().getDrawable(2130837731);
      f = new TextPaint(1);
      f.setColor(-1);
      f.setTypeface(a.a("fonts/rmedium.ttf"));
    }
    f.setTextSize(a.a(13.0F));
  }

  public void a(int paramInt)
  {
    if ((paramInt != 0) && ((paramInt & 0x100) == 0) && ((paramInt & 0x800) == 0));
    do
      while (true)
      {
        return;
        Object localObject = (g.hq)org.vidogram.messenger.v.a().g.get(Long.valueOf(this.j));
        if ((localObject == null) || (((g.hq)localObject).h == 0))
          break;
        if (this.g == ((g.hq)localObject).h)
          continue;
        this.g = ((g.hq)localObject).h;
        localObject = String.format("%d", new Object[] { Integer.valueOf(((g.hq)localObject).h) });
        this.h = Math.max(a.a(12.0F), (int)Math.ceil(f.measureText((String)localObject)));
        this.i = new StaticLayout((CharSequence)localObject, f, this.h, Layout.Alignment.ALIGN_CENTER, 1.0F, 0.0F, false);
        if (paramInt == 0)
          continue;
        invalidate();
        return;
      }
    while (this.i == null);
    if (paramInt != 0)
      invalidate();
    this.g = 0;
    this.i = null;
  }

  public void a(int paramInt, boolean paramBoolean, CharSequence paramCharSequence)
  {
    this.j = paramInt;
    Object localObject;
    if (paramInt > 0)
    {
      localObject = org.vidogram.messenger.v.a().a(Integer.valueOf(paramInt));
      if (paramCharSequence != null)
      {
        this.b.setText(paramCharSequence);
        this.c.a((g.vw)localObject);
        if ((localObject == null) || (((g.vw)localObject).j == null))
          break label226;
        paramCharSequence = ((g.vw)localObject).j.e;
      }
    }
    while (true)
    {
      this.a.a(paramCharSequence, "50_50", this.c);
      if (paramBoolean)
      {
        a(0);
        return;
        if (localObject != null)
        {
          this.b.setText(f.a(((g.vw)localObject).e, ((g.vw)localObject).f));
          break;
        }
        this.b.setText("");
        break;
        localObject = org.vidogram.messenger.v.a().b(Integer.valueOf(-paramInt));
        if (paramCharSequence != null)
          this.b.setText(paramCharSequence);
        while (true)
        {
          this.c.a((g.i)localObject);
          if ((localObject == null) || (((g.i)localObject).j == null))
            break label226;
          paramCharSequence = ((g.i)localObject).j.b;
          break;
          if (localObject != null)
          {
            this.b.setText(((g.i)localObject).i);
            continue;
          }
          this.b.setText("");
        }
      }
      this.i = null;
      return;
      label226: paramCharSequence = null;
    }
  }

  protected boolean drawChild(Canvas paramCanvas, View paramView, long paramLong)
  {
    boolean bool = super.drawChild(paramCanvas, paramView, paramLong);
    int k;
    int m;
    int n;
    if ((paramView == this.a) && (this.i != null))
    {
      k = a.a(6.0F);
      m = a.a(54.0F);
      n = m - a.a(5.5F);
      if (!org.vidogram.messenger.v.a().a(this.j))
        break label139;
      e.setBounds(n, k, this.h + n + a.a(11.0F), e.getIntrinsicHeight() + k);
      e.draw(paramCanvas);
    }
    while (true)
    {
      paramCanvas.save();
      paramCanvas.translate(m, k + a.a(4.0F));
      this.i.draw(paramCanvas);
      paramCanvas.restore();
      return bool;
      label139: d.setBounds(n, k, this.h + n + a.a(11.0F), d.getIntrinsicHeight() + k);
      d.draw(paramCanvas);
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, View.MeasureSpec.makeMeasureSpec(a.a(100.0F), 1073741824));
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if ((Build.VERSION.SDK_INT >= 21) && (getBackground() != null) && ((paramMotionEvent.getAction() == 0) || (paramMotionEvent.getAction() == 2)))
      getBackground().setHotspot(paramMotionEvent.getX(), paramMotionEvent.getY());
    return super.onTouchEvent(paramMotionEvent);
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.c.x
 * JD-Core Version:    0.6.0
 */