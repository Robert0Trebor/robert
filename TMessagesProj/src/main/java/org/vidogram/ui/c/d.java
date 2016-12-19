package org.vidogram.ui.c;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextUtils.TruncateAt;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.TextView;
import java.util.ArrayList;
import org.vidogram.messenger.MediaController;
import org.vidogram.messenger.MediaController.c;
import org.vidogram.messenger.a;
import org.vidogram.messenger.r;
import org.vidogram.messenger.u;
import org.vidogram.ui.Components.i;
import org.vidogram.ui.Components.v;

public class d extends FrameLayout
{
  private static Paint i;
  private ImageView a;
  private TextView b;
  private TextView c;
  private TextView d;
  private TextView e;
  private i f;
  private MediaController.c g;
  private boolean h;
  private a j;

  public d(Context paramContext)
  {
    super(paramContext);
    if (i == null)
    {
      i = new Paint();
      i.setColor(-2500135);
      i.setStrokeWidth(1.0F);
    }
    this.a = new ImageView(paramContext);
    this.a.setScaleType(ImageView.ScaleType.CENTER);
    Object localObject = this.a;
    int k;
    float f1;
    label84: float f2;
    if (r.a)
    {
      k = 5;
      if (!r.a)
        break label815;
      f1 = 0.0F;
      if (!r.a)
        break label821;
      f2 = 13.0F;
      label93: addView((View)localObject, v.a(46, 46.0F, k | 0x30, f1, 13.0F, f2, 0.0F));
      this.a.setOnClickListener(new View.OnClickListener()
      {
        public void onClick(View paramView)
        {
          if (d.a(d.this) != null)
          {
            if ((!MediaController.a().d(d.a(d.this).g)) || (MediaController.a().s()))
              break label68;
            MediaController.a().b(d.a(d.this).g);
            d.b(d.this).setImageResource(2130837628);
          }
          label68: 
          do
          {
            do
            {
              return;
              paramView = new ArrayList();
              paramView.add(d.a(d.this).g);
            }
            while (!MediaController.a().a(paramView, d.a(d.this).g));
            d.b(d.this).setImageResource(2130837627);
          }
          while (d.c(d.this) == null);
          d.c(d.this).a(d.a(d.this).g);
        }
      });
      this.b = new TextView(paramContext);
      this.b.setTextColor(-14606047);
      this.b.setTextSize(1, 16.0F);
      this.b.setTypeface(a.a("fonts/rmedium.ttf"));
      this.b.setLines(1);
      this.b.setMaxLines(1);
      this.b.setSingleLine(true);
      this.b.setEllipsize(TextUtils.TruncateAt.END);
      localObject = this.b;
      if (!r.a)
        break label826;
      k = 5;
      label223: ((TextView)localObject).setGravity(k | 0x30);
      localObject = this.b;
      if (!r.a)
        break label832;
      k = 5;
      label248: if (!r.a)
        break label838;
      f1 = 50.0F;
      label257: if (!r.a)
        break label844;
      f2 = 72.0F;
      label266: addView((View)localObject, v.a(-1, -2.0F, k | 0x30, f1, 7.0F, f2, 0.0F));
      this.d = new TextView(paramContext);
      this.d.setTextColor(-7697782);
      this.d.setTextSize(1, 14.0F);
      this.d.setLines(1);
      this.d.setMaxLines(1);
      this.d.setSingleLine(true);
      this.d.setEllipsize(TextUtils.TruncateAt.END);
      localObject = this.d;
      if (!r.a)
        break label850;
      k = 5;
      label368: ((TextView)localObject).setGravity(k | 0x30);
      localObject = this.d;
      if (!r.a)
        break label856;
      k = 5;
      label393: if (!r.a)
        break label862;
      f1 = 50.0F;
      label402: if (!r.a)
        break label868;
      f2 = 72.0F;
      label411: addView((View)localObject, v.a(-1, -2.0F, k | 0x30, f1, 28.0F, f2, 0.0F));
      this.c = new TextView(paramContext);
      this.c.setTextColor(-7697782);
      this.c.setTextSize(1, 14.0F);
      this.c.setLines(1);
      this.c.setMaxLines(1);
      this.c.setSingleLine(true);
      this.c.setEllipsize(TextUtils.TruncateAt.END);
      localObject = this.c;
      if (!r.a)
        break label874;
      k = 5;
      label513: ((TextView)localObject).setGravity(k | 0x30);
      localObject = this.c;
      if (!r.a)
        break label880;
      k = 5;
      label538: if (!r.a)
        break label886;
      f1 = 50.0F;
      label547: if (!r.a)
        break label892;
      f2 = 72.0F;
      label556: addView((View)localObject, v.a(-1, -2.0F, k | 0x30, f1, 44.0F, f2, 0.0F));
      this.e = new TextView(paramContext);
      this.e.setTextColor(-6710887);
      this.e.setTextSize(1, 13.0F);
      this.e.setLines(1);
      this.e.setMaxLines(1);
      this.e.setSingleLine(true);
      this.e.setEllipsize(TextUtils.TruncateAt.END);
      localObject = this.e;
      if (!r.a)
        break label898;
      k = 3;
      label658: ((TextView)localObject).setGravity(k | 0x30);
      localObject = this.e;
      if (!r.a)
        break label904;
      k = 3;
      label683: if (!r.a)
        break label910;
      f1 = 18.0F;
      label692: if (!r.a)
        break label915;
      f2 = 0.0F;
      label700: addView((View)localObject, v.a(-2, -2.0F, k | 0x30, f1, 11.0F, f2, 0.0F));
      this.f = new i(paramContext, 2130838112);
      this.f.setVisibility(0);
      this.f.setColor(-14043401);
      paramContext = this.f;
      if (!r.a)
        break label921;
      k = m;
      label769: if (!r.a)
        break label927;
      f1 = 18.0F;
      label778: if (!r.a)
        break label932;
      f2 = 0.0F;
    }
    while (true)
    {
      addView(paramContext, v.a(22, 22.0F, k | 0x30, f1, 39.0F, f2, 0.0F));
      return;
      k = 3;
      break;
      label815: f1 = 13.0F;
      break label84;
      label821: f2 = 0.0F;
      break label93;
      label826: k = 3;
      break label223;
      label832: k = 3;
      break label248;
      label838: f1 = 72.0F;
      break label257;
      label844: f2 = 50.0F;
      break label266;
      label850: k = 3;
      break label368;
      label856: k = 3;
      break label393;
      label862: f1 = 72.0F;
      break label402;
      label868: f2 = 50.0F;
      break label411;
      label874: k = 3;
      break label513;
      label880: k = 3;
      break label538;
      label886: f1 = 72.0F;
      break label547;
      label892: f2 = 50.0F;
      break label556;
      label898: k = 5;
      break label658;
      label904: k = 5;
      break label683;
      label910: f1 = 0.0F;
      break label692;
      label915: f2 = 18.0F;
      break label700;
      label921: k = 5;
      break label769;
      label927: f1 = 0.0F;
      break label778;
      label932: f2 = 18.0F;
    }
  }

  public void a(MediaController.c paramc, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.g = paramc;
    this.b.setText(this.g.c);
    this.d.setText(this.g.d);
    this.c.setText(this.g.b);
    this.e.setText(String.format("%d:%02d", new Object[] { Integer.valueOf(this.g.e / 60), Integer.valueOf(this.g.e % 60) }));
    paramc = this.a;
    int k;
    if ((MediaController.a().d(this.g.g)) && (!MediaController.a().s()))
    {
      k = 2130837627;
      paramc.setImageResource(k);
      this.h = paramBoolean1;
      if (paramBoolean1)
        break label168;
    }
    label168: for (paramBoolean1 = true; ; paramBoolean1 = false)
    {
      setWillNotDraw(paramBoolean1);
      this.f.a(paramBoolean2, false);
      return;
      k = 2130837628;
      break;
    }
  }

  public MediaController.c getAudioEntry()
  {
    return this.g;
  }

  protected void onDraw(Canvas paramCanvas)
  {
    if (this.h)
      paramCanvas.drawLine(a.a(72.0F), getHeight() - 1, getWidth(), getHeight() - 1, i);
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int k = a.a(72.0F);
    if (this.h);
    for (paramInt2 = 1; ; paramInt2 = 0)
    {
      super.onMeasure(paramInt1, View.MeasureSpec.makeMeasureSpec(paramInt2 + k, 1073741824));
      return;
    }
  }

  public void setChecked(boolean paramBoolean)
  {
    this.f.a(paramBoolean, true);
  }

  public void setDelegate(a parama)
  {
    this.j = parama;
  }

  public static abstract interface a
  {
    public abstract void a(u paramu);
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.c.d
 * JD-Core Version:    0.6.0
 */