package org.vidogram.ui.c;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.TextUtils.TruncateAt;
import android.view.MotionEvent;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.vidogram.messenger.a;
import org.vidogram.messenger.f;
import org.vidogram.tgnet.g.i;
import org.vidogram.tgnet.g.m;
import org.vidogram.tgnet.g.vw;
import org.vidogram.tgnet.g.vx;
import org.vidogram.ui.Components.BackupImageView;
import org.vidogram.ui.Components.b;
import org.vidogram.ui.Components.i;

public class aq extends FrameLayout
{
  private BackupImageView a;
  private TextView b;
  private i c;
  private b d = new b();

  public aq(Context paramContext)
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
    this.c = new i(paramContext, 2130838112);
    this.c.setSize(24);
    this.c.setCheckOffset(a.a(1.0F));
    this.c.setVisibility(0);
    this.c.setColor(-12664327);
    addView(this.c, org.vidogram.ui.Components.v.a(24, 24.0F, 49, 17.0F, 39.0F, 0.0F, 0.0F));
  }

  public void a(int paramInt, boolean paramBoolean, CharSequence paramCharSequence)
  {
    Object localObject1 = null;
    if (paramInt > 0)
    {
      localObject2 = org.vidogram.messenger.v.a().a(Integer.valueOf(paramInt));
      if (paramCharSequence != null)
        this.b.setText(paramCharSequence);
      while (true)
      {
        this.d.a((g.vw)localObject2);
        paramCharSequence = localObject1;
        if (localObject2 != null)
        {
          paramCharSequence = localObject1;
          if (((g.vw)localObject2).j != null)
            paramCharSequence = ((g.vw)localObject2).j.e;
        }
        this.a.a(paramCharSequence, "50_50", this.d);
        this.c.a(paramBoolean, false);
        return;
        if (localObject2 != null)
        {
          this.b.setText(f.a(((g.vw)localObject2).e, ((g.vw)localObject2).f));
          continue;
        }
        this.b.setText("");
      }
    }
    Object localObject2 = org.vidogram.messenger.v.a().b(Integer.valueOf(-paramInt));
    if (paramCharSequence != null)
      this.b.setText(paramCharSequence);
    while (true)
    {
      this.d.a((g.i)localObject2);
      paramCharSequence = localObject1;
      if (localObject2 == null)
        break;
      paramCharSequence = localObject1;
      if (((g.i)localObject2).j == null)
        break;
      paramCharSequence = ((g.i)localObject2).j.b;
      break;
      if (localObject2 != null)
      {
        this.b.setText(((g.i)localObject2).i);
        continue;
      }
      this.b.setText("");
    }
  }

  public void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    this.c.a(paramBoolean1, paramBoolean2);
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
 * Qualified Name:     org.vidogram.ui.c.aq
 * JD-Core Version:    0.6.0
 */