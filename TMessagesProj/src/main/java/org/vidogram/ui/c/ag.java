package org.vidogram.ui.c;

import android.content.Context;
import android.text.TextUtils.TruncateAt;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.TextView;
import org.vidogram.messenger.a;
import org.vidogram.ui.Components.v;

public class ag extends FrameLayout
{
  private ImageView a;
  private TextView b;
  private TextView c;

  public ag(Context paramContext)
  {
    super(paramContext);
    this.a = new ImageView(paramContext);
    this.a.setScaleType(ImageView.ScaleType.CENTER);
    addView(this.a, v.a(-1, -1.0F, 51, 0.0F, 0.0F, 0.0F, 12.0F));
    this.b = new TextView(paramContext);
    this.b.setGravity(17);
    this.b.setTextColor(-1);
    this.b.setTextSize(1, 10.0F);
    this.b.setTypeface(a.a("fonts/rmedium.ttf"));
    this.b.setMaxLines(1);
    this.b.setSingleLine(true);
    this.b.setEllipsize(TextUtils.TruncateAt.END);
    addView(this.b, v.a(-1, -2.0F, 83, 4.0F, 0.0F, 4.0F, 0.0F));
    this.c = new TextView(paramContext);
    this.c.setTextColor(-9649153);
    this.c.setTextSize(1, 11.0F);
    this.c.setTypeface(a.a("fonts/rmedium.ttf"));
    addView(this.c, v.a(-2, -2.0F, 51, 57.0F, 3.0F, 0.0F, 0.0F));
  }

  public void a(int paramInt, String paramString, float paramFloat)
  {
    this.a.setImageResource(paramInt);
    this.b.setText(paramString.toUpperCase());
    if (paramFloat == 0.0F)
    {
      this.c.setText("");
      return;
    }
    if (paramFloat > 0.0F)
    {
      this.c.setText("+" + (int)paramFloat);
      return;
    }
    this.c.setText("" + (int)paramFloat);
  }

  public void a(int paramInt, String paramString1, String paramString2)
  {
    this.a.setImageResource(paramInt);
    this.b.setText(paramString1.toUpperCase());
    this.c.setText(paramString2);
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(View.MeasureSpec.makeMeasureSpec(a.a(86.0F), 1073741824), View.MeasureSpec.makeMeasureSpec(a.a(60.0F), 1073741824));
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.c.ag
 * JD-Core Version:    0.6.0
 */