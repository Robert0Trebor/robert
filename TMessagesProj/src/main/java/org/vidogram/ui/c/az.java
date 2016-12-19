package org.vidogram.ui.c;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import org.vidogram.messenger.a;
import org.vidogram.messenger.r;
import org.vidogram.ui.a.k;

public class az extends FrameLayout
{
  private k a;
  private k b;
  private ImageView c;
  private ImageView d;

  public az(Context paramContext)
  {
    super(paramContext);
    this.a = new k(paramContext);
    this.a.setTextColor(-14606047);
    this.a.setTextSize(16);
    k localk = this.a;
    if (r.a)
    {
      i = 5;
      localk.setGravity(i);
      addView(this.a);
      this.b = new k(paramContext);
      this.b.setTextColor(-13660983);
      this.b.setTextSize(16);
      localk = this.b;
      if (!r.a)
        break label189;
    }
    label189: for (int i = j; ; i = 5)
    {
      localk.setGravity(i);
      addView(this.b);
      this.c = new ImageView(paramContext);
      this.c.setScaleType(ImageView.ScaleType.CENTER);
      addView(this.c);
      this.d = new ImageView(paramContext);
      this.d.setScaleType(ImageView.ScaleType.CENTER);
      addView(this.d);
      return;
      i = 3;
      break;
    }
  }

  public void a(String paramString, int paramInt)
  {
    this.a.setText(paramString);
    this.b.setText(null);
    this.c.setImageResource(paramInt);
    this.c.setVisibility(0);
    this.b.setVisibility(4);
    this.d.setVisibility(4);
    this.c.setPadding(0, a.a(7.0F), 0, 0);
  }

  public void a(String paramString, Drawable paramDrawable)
  {
    this.a.setText(paramString);
    this.b.setText(null);
    this.d.setVisibility(0);
    this.d.setImageDrawable(paramDrawable);
    this.b.setVisibility(4);
    this.c.setVisibility(4);
    this.c.setPadding(0, a.a(7.0F), 0, 0);
  }

  public void a(String paramString1, String paramString2)
  {
    this.a.setText(paramString1);
    this.b.setText(paramString2);
    this.b.setVisibility(0);
    this.c.setVisibility(4);
    this.d.setVisibility(4);
  }

  public void a(String paramString1, String paramString2, int paramInt)
  {
    this.a.setText(paramString1);
    this.b.setText(paramString2);
    this.b.setVisibility(0);
    this.d.setVisibility(4);
    this.c.setVisibility(0);
    this.c.setPadding(0, a.a(7.0F), 0, 0);
    this.c.setImageResource(paramInt);
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramInt2 = paramInt4 - paramInt2;
    paramInt3 -= paramInt1;
    paramInt4 = (paramInt2 - this.b.getTextHeight()) / 2;
    if (r.a)
    {
      paramInt1 = a.a(24.0F);
      this.b.layout(paramInt1, paramInt4, this.b.getMeasuredWidth() + paramInt1, this.b.getMeasuredHeight() + paramInt4);
      paramInt4 = (paramInt2 - this.a.getTextHeight()) / 2;
      if (r.a)
        break label224;
      paramInt1 = a.a(71.0F);
      label90: this.a.layout(paramInt1, paramInt4, this.a.getMeasuredWidth() + paramInt1, this.a.getMeasuredHeight() + paramInt4);
      paramInt4 = a.a(5.0F);
      if (r.a)
        break label233;
      paramInt1 = a.a(16.0F);
      label138: this.c.layout(paramInt1, paramInt4, this.c.getMeasuredWidth() + paramInt1, this.c.getMeasuredHeight() + paramInt4);
      paramInt2 = (paramInt2 - this.d.getMeasuredHeight()) / 2;
      if (!r.a)
        break label253;
    }
    label224: label233: label253: for (paramInt1 = a.a(24.0F); ; paramInt1 = paramInt3 - this.d.getMeasuredWidth() - a.a(24.0F))
    {
      this.d.layout(paramInt1, paramInt2, this.d.getMeasuredWidth() + paramInt1, this.d.getMeasuredHeight() + paramInt2);
      return;
      paramInt1 = 0;
      break;
      paramInt1 = a.a(24.0F);
      break label90;
      paramInt1 = paramInt3 - this.c.getMeasuredWidth() - a.a(16.0F);
      break label138;
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    paramInt1 = View.MeasureSpec.getSize(paramInt1);
    paramInt2 = a.a(48.0F);
    this.b.measure(View.MeasureSpec.makeMeasureSpec(paramInt1 - a.a(24.0F), -2147483648), View.MeasureSpec.makeMeasureSpec(a.a(20.0F), 1073741824));
    this.a.measure(View.MeasureSpec.makeMeasureSpec(paramInt1 - a.a(95.0F), -2147483648), View.MeasureSpec.makeMeasureSpec(a.a(20.0F), 1073741824));
    this.c.measure(View.MeasureSpec.makeMeasureSpec(paramInt1, -2147483648), View.MeasureSpec.makeMeasureSpec(paramInt2, -2147483648));
    this.d.measure(View.MeasureSpec.makeMeasureSpec(paramInt1, -2147483648), View.MeasureSpec.makeMeasureSpec(paramInt2, -2147483648));
    setMeasuredDimension(paramInt1, a.a(48.0F));
  }

  public void setText(String paramString)
  {
    this.a.setText(paramString);
    this.b.setText(null);
    this.c.setVisibility(4);
    this.b.setVisibility(4);
    this.d.setVisibility(4);
  }

  public void setTextColor(int paramInt)
  {
    this.a.setTextColor(paramInt);
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.c.az
 * JD-Core Version:    0.6.0
 */