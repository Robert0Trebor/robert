package org.vidogram.ui.c;

import android.content.Context;
import android.os.Build.VERSION;
import android.text.TextUtils.TruncateAt;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import org.vidogram.messenger.a;
import org.vidogram.messenger.r;
import org.vidogram.ui.Components.v;

public class aj extends LinearLayout
{
  private a a;

  public aj(Context paramContext, boolean paramBoolean)
  {
    super(paramContext);
    setOrientation(0);
    Object localObject = new b(paramContext);
    b.a((b)localObject).setText(r.a("SearchImages", 2131231769));
    b.b((b)localObject).setText(r.a("SearchImagesInfo", 2131231770));
    b.c((b)localObject).setImageResource(2130838130);
    addView((View)localObject);
    LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)((b)localObject).getLayoutParams();
    localLayoutParams.weight = 0.5F;
    localLayoutParams.topMargin = a.a(4.0F);
    localLayoutParams.height = a.a(48.0F);
    localLayoutParams.width = 0;
    ((b)localObject).setLayoutParams(localLayoutParams);
    ((b)localObject).setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramView)
      {
        if (aj.a(aj.this) != null)
          aj.a(aj.this).a(0);
      }
    });
    localObject = new FrameLayout(paramContext);
    ((FrameLayout)localObject).setBackgroundColor(0);
    addView((View)localObject);
    localLayoutParams = (LinearLayout.LayoutParams)((FrameLayout)localObject).getLayoutParams();
    localLayoutParams.topMargin = a.a(4.0F);
    localLayoutParams.height = a.a(48.0F);
    localLayoutParams.width = a.a(4.0F);
    ((FrameLayout)localObject).setLayoutParams(localLayoutParams);
    paramContext = new b(paramContext);
    b.a(paramContext).setText(r.a("SearchGifs", 2131231767));
    b.b(paramContext).setText("GIPHY");
    b.c(paramContext).setImageResource(2130838125);
    addView(paramContext);
    localObject = (LinearLayout.LayoutParams)paramContext.getLayoutParams();
    ((LinearLayout.LayoutParams)localObject).weight = 0.5F;
    ((LinearLayout.LayoutParams)localObject).topMargin = a.a(4.0F);
    ((LinearLayout.LayoutParams)localObject).height = a.a(48.0F);
    ((LinearLayout.LayoutParams)localObject).width = 0;
    paramContext.setLayoutParams((ViewGroup.LayoutParams)localObject);
    if (paramBoolean)
    {
      paramContext.setOnClickListener(new View.OnClickListener()
      {
        public void onClick(View paramView)
        {
          if (aj.a(aj.this) != null)
            aj.a(aj.this).a(1);
        }
      });
      return;
    }
    paramContext.setAlpha(0.5F);
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, View.MeasureSpec.makeMeasureSpec(a.a(52.0F), 1073741824));
  }

  public void setDelegate(a parama)
  {
    this.a = parama;
  }

  public static abstract interface a
  {
    public abstract void a(int paramInt);
  }

  private class b extends FrameLayout
  {
    private TextView b;
    private TextView c;
    private ImageView d;
    private View e;

    public b(Context arg2)
    {
      super();
      setBackgroundColor(-15066598);
      this.e = new View(localContext);
      this.e.setBackgroundResource(2130837946);
      addView(this.e, v.a(-1, -1.0F));
      this.d = new ImageView(localContext);
      this.d.setScaleType(ImageView.ScaleType.CENTER);
      addView(this.d, v.b(48, 48, 51));
      this.b = new TextView(localContext);
      this.b.setGravity(16);
      this.b.setTextSize(1, 14.0F);
      this.b.setTypeface(a.a("fonts/rmedium.ttf"));
      this.b.setTextColor(-1);
      this.b.setSingleLine(true);
      this.b.setEllipsize(TextUtils.TruncateAt.END);
      addView(this.b, v.a(-1, -2.0F, 51, 51.0F, 8.0F, 4.0F, 0.0F));
      this.c = new TextView(localContext);
      this.c.setGravity(16);
      this.c.setTextSize(1, 10.0F);
      this.c.setTypeface(a.a("fonts/rmedium.ttf"));
      this.c.setTextColor(-10066330);
      this.c.setSingleLine(true);
      this.c.setEllipsize(TextUtils.TruncateAt.END);
      addView(this.c, v.a(-1, -2.0F, 51, 51.0F, 26.0F, 4.0F, 0.0F));
    }

    public boolean onTouchEvent(MotionEvent paramMotionEvent)
    {
      if (Build.VERSION.SDK_INT >= 21)
        this.e.drawableHotspotChanged(paramMotionEvent.getX(), paramMotionEvent.getY());
      return super.onTouchEvent(paramMotionEvent);
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.c.aj
 * JD-Core Version:    0.6.0
 */