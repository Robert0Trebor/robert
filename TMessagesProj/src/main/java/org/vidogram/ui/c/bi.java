package org.vidogram.ui.c;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import java.util.ArrayList;
import org.vidogram.messenger.a;
import org.vidogram.tgnet.g.az;
import org.vidogram.tgnet.g.rq;
import org.vidogram.tgnet.g.vo;
import org.vidogram.tgnet.g.wa;
import org.vidogram.tgnet.g.x;
import org.vidogram.ui.Components.BackupImageView;
import org.vidogram.ui.Components.v;

public class bi extends FrameLayout
{
  private BackupImageView a;
  private View b;
  private ImageView c;

  public bi(Context paramContext)
  {
    super(paramContext);
    this.a = new BackupImageView(paramContext);
    addView(this.a, v.b(100, 100, 83));
    this.c = new ImageView(paramContext);
    this.c.setImageResource(2130837837);
    this.c.setScaleType(ImageView.ScaleType.CENTER);
    addView(this.c, v.b(100, 100, 83));
    this.b = new View(paramContext);
    this.b.setBackgroundResource(2130838199);
    addView(this.b, v.a(100, 102.0F));
  }

  public void a(g.wa paramwa, int paramInt)
  {
    int i = 4;
    int j = 0;
    if (paramwa == null)
    {
      this.a.setVisibility(4);
      this.c.setVisibility(0);
      paramwa = this.b;
      if (paramInt == -1)
      {
        i = j;
        paramwa.setVisibility(i);
        paramwa = this.c;
        if ((paramInt != -1) && (paramInt != 1000001))
          break label73;
      }
      label73: for (paramInt = 1514625126; ; paramInt = 1509949440)
      {
        paramwa.setBackgroundColor(paramInt);
        return;
        i = 4;
        break;
      }
    }
    this.a.setVisibility(0);
    this.c.setVisibility(4);
    Object localObject1 = this.b;
    if (paramInt == paramwa.c)
      i = 0;
    ((View)localObject1).setVisibility(i);
    if ((paramwa instanceof g.vo))
    {
      this.a.setImageBitmap(null);
      this.a.setBackgroundColor(0xFF000000 | paramwa.g);
      return;
    }
    j = a.a(100.0F);
    paramInt = 0;
    localObject1 = null;
    while (paramInt < paramwa.e.size())
    {
      g.az localaz = (g.az)paramwa.e.get(paramInt);
      Object localObject2;
      if (localaz == null)
      {
        localObject2 = localObject1;
        paramInt += 1;
        localObject1 = localObject2;
        continue;
      }
      if (localaz.d >= localaz.e);
      for (i = localaz.d; ; i = localaz.e)
      {
        localObject2 = localaz;
        if (localObject1 == null)
          break;
        if ((j > 100) && (((g.az)localObject1).c != null))
        {
          localObject2 = localaz;
          if (((g.az)localObject1).c.b == -2147483648)
            break;
        }
        localObject2 = localaz;
        if ((localaz instanceof g.rq))
          break;
        localObject2 = localaz;
        if (i <= j)
          break;
        localObject2 = localObject1;
        break;
      }
    }
    if ((localObject1 != null) && (((g.az)localObject1).c != null))
      this.a.a(((g.az)localObject1).c, "100_100", (Drawable)null);
    this.a.setBackgroundColor(1514625126);
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(View.MeasureSpec.makeMeasureSpec(a.a(100.0F), 1073741824), View.MeasureSpec.makeMeasureSpec(a.a(102.0F), 1073741824));
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.c.bi
 * JD-Core Version:    0.6.0
 */