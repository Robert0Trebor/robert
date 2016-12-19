package org.vidogram.ui.c;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.TextPaint;
import android.text.TextUtils.TruncateAt;
import android.view.MotionEvent;
import android.view.View.MeasureSpec;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.vidogram.messenger.a;
import org.vidogram.messenger.ae;
import org.vidogram.messenger.j;
import org.vidogram.tgnet.g.vw;
import org.vidogram.tgnet.g.vx;
import org.vidogram.ui.Components.BackupImageView;
import org.vidogram.ui.Components.b;
import org.vidogram.ui.Components.v;

public class ad extends LinearLayout
{
  private BackupImageView a;
  private TextView b;
  private TextView c;
  private b d;

  public ad(Context paramContext)
  {
    super(paramContext);
    setOrientation(0);
    setBackgroundResource(2130837946);
    this.d = new b();
    this.d.b(true);
    this.a = new BackupImageView(paramContext);
    this.a.setRoundRadius(a.a(14.0F));
    addView(this.a, v.a(28, 28, 12.0F, 4.0F, 0.0F, 0.0F));
    this.b = new TextView(paramContext);
    this.b.setTextColor(-16777216);
    this.b.setTextSize(1, 15.0F);
    this.b.setSingleLine(true);
    this.b.setGravity(3);
    this.b.setEllipsize(TextUtils.TruncateAt.END);
    addView(this.b, v.b(-2, -2, 16, 12, 0, 0, 0));
    this.c = new TextView(paramContext);
    this.c.setTextColor(-6710887);
    this.c.setTextSize(1, 15.0F);
    this.c.setSingleLine(true);
    this.c.setGravity(3);
    this.c.setEllipsize(TextUtils.TruncateAt.END);
    addView(this.c, v.b(-2, -2, 16, 12, 0, 8, 0));
  }

  public void a(String paramString1, String paramString2, g.vw paramvw)
  {
    if (paramvw != null)
    {
      this.a.setVisibility(0);
      this.d.a(paramvw);
      if ((paramvw.j != null) && (paramvw.j.e != null))
        this.a.a(paramvw.j.e, "50_50", this.d);
    }
    while (true)
    {
      this.c.setVisibility(0);
      this.b.setText(paramString1);
      this.c.setText(j.a(paramString2, this.c.getPaint().getFontMetricsInt(), a.a(20.0F), false));
      return;
      this.a.setImageDrawable(this.d);
      continue;
      this.a.setVisibility(4);
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(paramInt1), 1073741824), View.MeasureSpec.makeMeasureSpec(a.a(36.0F), 1073741824));
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if ((Build.VERSION.SDK_INT >= 21) && (getBackground() != null) && ((paramMotionEvent.getAction() == 0) || (paramMotionEvent.getAction() == 2)))
      getBackground().setHotspot(paramMotionEvent.getX(), paramMotionEvent.getY());
    return super.onTouchEvent(paramMotionEvent);
  }

  public void setIsDarkTheme(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.b.setTextColor(-1);
      this.c.setTextColor(-6710887);
      return;
    }
    this.b.setTextColor(-16777216);
    this.c.setTextColor(-6710887);
  }

  public void setText(String paramString)
  {
    this.a.setVisibility(4);
    this.c.setVisibility(4);
    this.b.setText(paramString);
  }

  public void setUser(g.vw paramvw)
  {
    if (paramvw == null)
    {
      this.b.setText("");
      this.c.setText("");
      this.a.setImageDrawable(null);
      return;
    }
    this.d.a(paramvw);
    if ((paramvw.j != null) && (paramvw.j.e != null))
    {
      this.a.a(paramvw.j.e, "50_50", this.d);
      this.b.setText(ae.c(paramvw));
      if (paramvw.g == null)
        break label154;
      this.c.setText("@" + paramvw.g);
    }
    while (true)
    {
      this.a.setVisibility(0);
      this.c.setVisibility(0);
      return;
      this.a.setImageDrawable(this.d);
      break;
      label154: this.c.setText("");
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.c.ad
 * JD-Core Version:    0.6.0
 */