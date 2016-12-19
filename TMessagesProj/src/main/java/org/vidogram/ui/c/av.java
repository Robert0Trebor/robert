package org.vidogram.ui.c;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import org.vidogram.messenger.a;
import org.vidogram.messenger.q;
import org.vidogram.tgnet.g.az;
import org.vidogram.tgnet.g.q;
import org.vidogram.ui.Components.BackupImageView;
import org.vidogram.ui.Components.v;

public class av extends FrameLayout
{
  private static AccelerateInterpolator g = new AccelerateInterpolator(0.5F);
  private BackupImageView a;
  private g.q b;
  private long c;
  private boolean d;
  private float e;
  private long f = 0L;

  public av(Context paramContext)
  {
    super(paramContext);
    this.a = new BackupImageView(paramContext);
    this.a.setAspectFit(true);
    addView(this.a, v.a(66, 66.0F, 1, 0.0F, 5.0F, 0.0F, 0.0F));
  }

  public void a(g.q paramq, int paramInt)
  {
    if ((paramq != null) && (paramq.i != null))
      this.a.a(paramq.i.c, null, "webp", null);
    this.b = paramq;
    if (paramInt == -1)
    {
      setBackgroundResource(2130838157);
      setPadding(a.a(7.0F), 0, 0, 0);
    }
    while (true)
    {
      if (getBackground() != null)
        getBackground().setAlpha(230);
      return;
      if (paramInt == 0)
      {
        setBackgroundResource(2130838156);
        setPadding(0, 0, 0, 0);
        continue;
      }
      if (paramInt == 1)
      {
        setBackgroundResource(2130838158);
        setPadding(0, 0, a.a(7.0F), 0);
        continue;
      }
      if (paramInt != 2)
        continue;
      setBackgroundResource(2130838154);
      setPadding(a.a(3.0F), 0, a.a(3.0F), 0);
    }
  }

  public boolean a()
  {
    return this.a.getImageReceiver().h() != null;
  }

  protected boolean drawChild(Canvas paramCanvas, View paramView, long paramLong)
  {
    boolean bool = super.drawChild(paramCanvas, paramView, paramLong);
    long l;
    if ((paramView == this.a) && (((this.d) && (this.e != 0.8F)) || ((!this.d) && (this.e != 1.0F))))
    {
      paramLong = System.currentTimeMillis();
      l = paramLong - this.c;
      this.c = paramLong;
      if ((!this.d) || (this.e == 0.8F))
        break label151;
      this.e -= (float)l / 400.0F;
      if (this.e < 0.8F)
        this.e = 0.8F;
    }
    while (true)
    {
      this.a.setScaleX(this.e);
      this.a.setScaleY(this.e);
      this.a.invalidate();
      invalidate();
      return bool;
      label151: this.e += (float)l / 400.0F;
      if (this.e <= 1.0F)
        continue;
      this.e = 1.0F;
    }
  }

  public g.q getSticker()
  {
    return this.b;
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(View.MeasureSpec.makeMeasureSpec(a.a(76.0F) + getPaddingLeft() + getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec(a.a(78.0F), 1073741824));
  }

  public void setPressed(boolean paramBoolean)
  {
    if (this.a.getImageReceiver().b() != paramBoolean)
    {
      this.a.getImageReceiver().a(paramBoolean);
      this.a.invalidate();
    }
    super.setPressed(paramBoolean);
  }

  public void setScaled(boolean paramBoolean)
  {
    this.d = paramBoolean;
    this.c = System.currentTimeMillis();
    invalidate();
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.c.av
 * JD-Core Version:    0.6.0
 */