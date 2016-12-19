package org.vidogram.ui.c;

import android.content.Context;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.vidogram.messenger.a;
import org.vidogram.messenger.r;
import org.vidogram.ui.Components.v;
import org.vidogram.ui.a.k;

public class an extends FrameLayout
{
  private k a;
  private k b;

  public an(Context paramContext)
  {
    super(paramContext);
    Object localObject = new ImageView(paramContext);
    ((ImageView)localObject).setImageResource(2130838067);
    int i;
    float f1;
    label42: float f2;
    if (r.a)
    {
      i = 5;
      if (!r.a)
        break label304;
      f1 = 0.0F;
      if (!r.a)
        break label310;
      f2 = 17.0F;
      label51: addView((View)localObject, v.a(-2, -2.0F, i | 0x30, f1, 13.0F, f2, 0.0F));
      this.b = new k(paramContext);
      this.b.setTextSize(16);
      this.b.setTextColor(-13141330);
      localObject = this.b;
      if (!r.a)
        break label315;
      i = 5;
      label119: ((k)localObject).setGravity(i);
      this.b.setTypeface(a.a("fonts/rmedium.ttf"));
      localObject = this.b;
      if (!r.a)
        break label321;
      i = 5;
      label153: if (!r.a)
        break label327;
      f1 = 16.0F;
      label162: if (!r.a)
        break label333;
      f2 = 73.0F;
      label171: addView((View)localObject, v.a(-1, 20.0F, i | 0x30, f1, 12.0F, f2, 0.0F));
      this.a = new k(paramContext);
      this.a.setTextSize(14);
      this.a.setTextColor(-6710887);
      paramContext = this.a;
      if (!r.a)
        break label339;
      i = 5;
      label237: paramContext.setGravity(i);
      paramContext = this.a;
      if (!r.a)
        break label345;
      i = j;
      label258: if (!r.a)
        break label351;
      f1 = 16.0F;
      label267: if (!r.a)
        break label357;
      f2 = 73.0F;
    }
    while (true)
    {
      addView(paramContext, v.a(-1, 20.0F, i | 0x30, f1, 37.0F, f2, 0.0F));
      return;
      i = 3;
      break;
      label304: f1 = 17.0F;
      break label42;
      label310: f2 = 0.0F;
      break label51;
      label315: i = 3;
      break label119;
      label321: i = 3;
      break label153;
      label327: f1 = 73.0F;
      break label162;
      label333: f2 = 16.0F;
      break label171;
      label339: i = 3;
      break label237;
      label345: i = 3;
      break label258;
      label351: f1 = 73.0F;
      break label267;
      label357: f2 = 16.0F;
    }
  }

  public void a(String paramString1, String paramString2)
  {
    this.b.setText(paramString1);
    this.a.setText(paramString2);
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, View.MeasureSpec.makeMeasureSpec(a.a(66.0F), 1073741824));
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.c.an
 * JD-Core Version:    0.6.0
 */