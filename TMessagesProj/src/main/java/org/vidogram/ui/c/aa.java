package org.vidogram.ui.c;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils.TruncateAt;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.vidogram.messenger.a;
import org.vidogram.messenger.q;
import org.vidogram.messenger.r;
import org.vidogram.tgnet.g.of;
import org.vidogram.ui.Components.BackupImageView;
import org.vidogram.ui.Components.v;

public class aa extends FrameLayout
{
  private static Paint e;
  private TextView a;
  private TextView b;
  private BackupImageView c;
  private boolean d;

  public aa(Context paramContext)
  {
    super(paramContext);
    if (e == null)
    {
      e = new Paint();
      e.setColor(-2500135);
      e.setStrokeWidth(1.0F);
    }
    this.c = new BackupImageView(paramContext);
    this.c.setBackgroundResource(2130838113);
    this.c.a(a.a(30.0F), a.a(30.0F));
    this.c.getImageReceiver().a(new PorterDuffColorFilter(-6710887, PorterDuff.Mode.MULTIPLY));
    Object localObject = this.c;
    int i;
    float f1;
    label126: float f2;
    if (r.a)
    {
      i = 5;
      if (!r.a)
        break label464;
      f1 = 0.0F;
      if (!r.a)
        break label470;
      f2 = 17.0F;
      label135: addView((View)localObject, v.a(40, 40.0F, i | 0x30, f1, 8.0F, f2, 0.0F));
      this.a = new TextView(paramContext);
      this.a.setTextSize(1, 16.0F);
      this.a.setMaxLines(1);
      this.a.setEllipsize(TextUtils.TruncateAt.END);
      this.a.setSingleLine(true);
      this.a.setTextColor(-14606047);
      this.a.setTypeface(a.a("fonts/rmedium.ttf"));
      localObject = this.a;
      if (!r.a)
        break label475;
      i = 5;
      label242: ((TextView)localObject).setGravity(i);
      localObject = this.a;
      if (!r.a)
        break label481;
      i = 5;
      label264: if (!r.a)
        break label487;
      int j = 16;
      label274: f1 = j;
      if (!r.a)
        break label494;
      j = 72;
      label288: addView((View)localObject, v.a(-2, -2.0F, i | 0x30, f1, 5.0F, j, 0.0F));
      this.b = new TextView(paramContext);
      this.b.setTextSize(1, 14.0F);
      this.b.setMaxLines(1);
      this.b.setEllipsize(TextUtils.TruncateAt.END);
      this.b.setSingleLine(true);
      this.b.setTextColor(-6710887);
      paramContext = this.b;
      if (!r.a)
        break label501;
      i = 5;
      label384: paramContext.setGravity(i);
      paramContext = this.b;
      if (!r.a)
        break label507;
      i = i1;
      label405: if (!r.a)
        break label513;
    }
    label464: label470: label475: label481: label487: int m;
    label513: for (int k = 16; ; m = 72)
    {
      f1 = k;
      k = n;
      if (r.a)
        k = 72;
      addView(paramContext, v.a(-2, -2.0F, i | 0x30, f1, 30.0F, k, 0.0F));
      return;
      i = 3;
      break;
      f1 = 17.0F;
      break label126;
      f2 = 0.0F;
      break label135;
      i = 3;
      break label242;
      i = 3;
      break label264;
      m = 72;
      break label274;
      label494: m = 16;
      break label288;
      label501: i = 3;
      break label384;
      label507: i = 3;
      break label405;
    }
  }

  public void a(g.of paramof, String paramString, boolean paramBoolean)
  {
    this.d = paramBoolean;
    this.a.setText(paramof.f);
    this.b.setText(paramof.g);
    this.c.a(paramString, null, null);
    if (!paramBoolean);
    for (paramBoolean = true; ; paramBoolean = false)
    {
      setWillNotDraw(paramBoolean);
      return;
    }
  }

  protected void onDraw(Canvas paramCanvas)
  {
    if (this.d)
      paramCanvas.drawLine(a.a(72.0F), getHeight() - 1, getWidth(), getHeight() - 1, e);
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i = a.a(56.0F);
    if (this.d);
    for (paramInt2 = 1; ; paramInt2 = 0)
    {
      super.onMeasure(paramInt1, View.MeasureSpec.makeMeasureSpec(paramInt2 + i, 1073741824));
      return;
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.c.aa
 * JD-Core Version:    0.6.0
 */