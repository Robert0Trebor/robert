package org.vidogram.ui.c;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.TextUtils.TruncateAt;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.TextView;
import java.util.ArrayList;
import org.vidogram.messenger.a;
import org.vidogram.messenger.r;
import org.vidogram.tgnet.g.az;
import org.vidogram.tgnet.g.be;
import org.vidogram.tgnet.g.q;
import org.vidogram.tgnet.g.rg;
import org.vidogram.ui.Components.BackupImageView;
import org.vidogram.ui.Components.v;
import org.vidogram.ui.a.l;

public class ax extends FrameLayout
{
  private static Paint h;
  private TextView a;
  private TextView b;
  private BackupImageView c;
  private boolean d;
  private ImageView e;
  private g.rg f;
  private Rect g = new Rect();

  public ax(Context paramContext)
  {
    super(paramContext);
    if (h == null)
    {
      h = new Paint();
      h.setColor(-2500135);
    }
    this.a = new TextView(paramContext);
    this.a.setTextColor(-14606047);
    this.a.setTextSize(1, 16.0F);
    this.a.setLines(1);
    this.a.setMaxLines(1);
    this.a.setSingleLine(true);
    this.a.setEllipsize(TextUtils.TruncateAt.END);
    Object localObject = this.a;
    label145: float f1;
    label154: float f2;
    if (r.a)
    {
      i = 5;
      ((TextView)localObject).setGravity(i);
      localObject = this.a;
      if (!r.a)
        break label478;
      i = 5;
      if (!r.a)
        break label484;
      f1 = 40.0F;
      if (!r.a)
        break label490;
      f2 = 71.0F;
      label163: addView((View)localObject, v.a(-2, -2.0F, i, f1, 10.0F, f2, 0.0F));
      this.b = new TextView(paramContext);
      this.b.setTextColor(-7697782);
      this.b.setTextSize(1, 13.0F);
      this.b.setLines(1);
      this.b.setMaxLines(1);
      this.b.setSingleLine(true);
      localObject = this.b;
      if (!r.a)
        break label496;
      i = 5;
      label253: ((TextView)localObject).setGravity(i);
      localObject = this.b;
      if (!r.a)
        break label502;
      i = 5;
      label275: if (!r.a)
        break label508;
      f1 = 40.0F;
      label284: if (!r.a)
        break label514;
      f2 = 71.0F;
      label293: addView((View)localObject, v.a(-2, -2.0F, i, f1, 35.0F, f2, 0.0F));
      this.c = new BackupImageView(paramContext);
      this.c.setAspectFit(true);
      localObject = this.c;
      if (!r.a)
        break label520;
      i = 5;
      label348: if (!r.a)
        break label526;
      f1 = 0.0F;
      label356: if (!r.a)
        break label532;
      f2 = 12.0F;
      label365: addView((View)localObject, v.a(48, 48.0F, i | 0x30, f1, 8.0F, f2, 0.0F));
      this.e = new ImageView(paramContext);
      this.e.setFocusable(false);
      this.e.setBackgroundDrawable(l.a(788529152));
      this.e.setImageResource(2130837735);
      this.e.setScaleType(ImageView.ScaleType.CENTER);
      paramContext = this.e;
      if (!r.a)
        break label537;
    }
    label514: label520: label526: label532: label537: for (int i = j; ; i = 5)
    {
      addView(paramContext, v.b(40, 40, i | 0x30));
      return;
      i = 3;
      break;
      label478: i = 3;
      break label145;
      label484: f1 = 71.0F;
      break label154;
      label490: f2 = 40.0F;
      break label163;
      label496: i = 3;
      break label253;
      label502: i = 3;
      break label275;
      label508: f1 = 71.0F;
      break label284;
      f2 = 40.0F;
      break label293;
      i = 3;
      break label348;
      f1 = 12.0F;
      break label356;
      f2 = 0.0F;
      break label365;
    }
  }

  public void a(g.rg paramrg, boolean paramBoolean)
  {
    this.d = paramBoolean;
    this.f = paramrg;
    this.a.setText(this.f.c.d);
    if (this.f.c.h)
    {
      this.a.setAlpha(0.5F);
      this.b.setAlpha(0.5F);
      this.c.setAlpha(0.5F);
    }
    while (true)
    {
      paramrg = paramrg.e;
      if ((paramrg == null) || (paramrg.isEmpty()))
        break;
      this.b.setText(r.b("Stickers", paramrg.size()));
      paramrg = (g.q)paramrg.get(0);
      if ((paramrg.i != null) && (paramrg.i.c != null))
        this.c.a(paramrg.i.c, null, "webp", null);
      return;
      this.a.setAlpha(1.0F);
      this.b.setAlpha(1.0F);
      this.c.setAlpha(1.0F);
    }
    this.b.setText(r.b("Stickers", 0));
  }

  public g.rg getStickersSet()
  {
    return this.f;
  }

  protected void onDraw(Canvas paramCanvas)
  {
    if (this.d)
      paramCanvas.drawLine(0.0F, getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, h);
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    paramInt2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(paramInt1), 1073741824);
    int i = a.a(64.0F);
    if (this.d);
    for (paramInt1 = 1; ; paramInt1 = 0)
    {
      super.onMeasure(paramInt2, View.MeasureSpec.makeMeasureSpec(paramInt1 + i, 1073741824));
      return;
    }
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if ((Build.VERSION.SDK_INT >= 21) && (getBackground() != null))
    {
      this.e.getHitRect(this.g);
      if (this.g.contains((int)paramMotionEvent.getX(), (int)paramMotionEvent.getY()))
        return true;
      if ((paramMotionEvent.getAction() == 0) || (paramMotionEvent.getAction() == 2))
        getBackground().setHotspot(paramMotionEvent.getX(), paramMotionEvent.getY());
    }
    return super.onTouchEvent(paramMotionEvent);
  }

  public void setOnOptionsClick(View.OnClickListener paramOnClickListener)
  {
    this.e.setOnClickListener(paramOnClickListener);
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.c.ax
 * JD-Core Version:    0.6.0
 */