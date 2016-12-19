package org.vidogram.ui.c;

import android.content.Context;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.TextView;
import org.vidogram.messenger.a;
import org.vidogram.messenger.r;
import org.vidogram.ui.Components.v;

public class bc extends FrameLayout
{
  private TextView a;
  private TextView b;
  private ImageView c;

  public bc(Context paramContext)
  {
    super(paramContext);
    this.a = new TextView(paramContext);
    this.a.setTextColor(-14606047);
    this.a.setTextSize(1, 16.0F);
    this.a.setLines(1);
    this.a.setMaxLines(1);
    this.a.setSingleLine(true);
    TextView localTextView = this.a;
    int i;
    label100: float f1;
    label109: float f2;
    if (r.a)
    {
      i = 5;
      localTextView.setGravity(i);
      localTextView = this.a;
      if (!r.a)
        break label350;
      i = 5;
      if (!r.a)
        break label356;
      f1 = 16.0F;
      if (!r.a)
        break label362;
      f2 = 71.0F;
      label118: addView(localTextView, v.a(-2, -2.0F, i, f1, 10.0F, f2, 0.0F));
      this.b = new TextView(paramContext);
      this.b.setTextColor(-7697782);
      this.b.setTextSize(1, 13.0F);
      this.b.setLines(1);
      this.b.setMaxLines(1);
      this.b.setSingleLine(true);
      localTextView = this.b;
      if (!r.a)
        break label368;
      i = 5;
      label208: localTextView.setGravity(i);
      localTextView = this.b;
      if (!r.a)
        break label374;
      i = 5;
      label230: if (!r.a)
        break label380;
      f1 = 16.0F;
      label239: if (!r.a)
        break label386;
      f2 = 71.0F;
      label248: addView(localTextView, v.a(-2, -2.0F, i, f1, 35.0F, f2, 0.0F));
      this.c = new ImageView(paramContext);
      this.c.setScaleType(ImageView.ScaleType.CENTER);
      paramContext = this.c;
      if (!r.a)
        break label392;
      i = j;
      label305: if (!r.a)
        break label398;
      f1 = 0.0F;
      label313: if (!r.a)
        break label404;
      f2 = 16.0F;
    }
    while (true)
    {
      addView(paramContext, v.a(-2, -2.0F, i | 0x10, f1, 0.0F, f2, 0.0F));
      return;
      i = 3;
      break;
      label350: i = 3;
      break label100;
      label356: f1 = 71.0F;
      break label109;
      label362: f2 = 16.0F;
      break label118;
      label368: i = 3;
      break label208;
      label374: i = 3;
      break label230;
      label380: f1 = 71.0F;
      break label239;
      label386: f2 = 16.0F;
      break label248;
      label392: i = 3;
      break label305;
      label398: f1 = 16.0F;
      break label313;
      label404: f2 = 0.0F;
    }
  }

  public void a(String paramString1, String paramString2)
  {
    this.a.setText(paramString1);
    this.b.setText(paramString2);
    this.c.setVisibility(4);
  }

  public void a(String paramString1, String paramString2, int paramInt)
  {
    this.a.setText(paramString1);
    this.b.setText(paramString2);
    this.c.setVisibility(0);
    this.c.setImageResource(paramInt);
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(paramInt1), 1073741824), View.MeasureSpec.makeMeasureSpec(a.a(64.0F), 1073741824));
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.c.bc
 * JD-Core Version:    0.6.0
 */