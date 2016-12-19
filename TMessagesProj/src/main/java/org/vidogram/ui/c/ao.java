package org.vidogram.ui.c;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextUtils.TruncateAt;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Locale;
import org.vidogram.messenger.a;
import org.vidogram.messenger.r;
import org.vidogram.tgnet.g.cx;
import org.vidogram.ui.Components.v;

public class ao extends FrameLayout
{
  private static Paint f;
  boolean a;
  private TextView b;
  private TextView c;
  private TextView d;
  private TextView e;

  public ao(Context paramContext)
  {
    super(paramContext);
    if (f == null)
    {
      f = new Paint();
      f.setColor(-2500135);
      f.setStrokeWidth(1.0F);
    }
    Object localObject = new LinearLayout(paramContext);
    ((LinearLayout)localObject).setOrientation(0);
    ((LinearLayout)localObject).setWeightSum(1.0F);
    if (r.a)
    {
      i = 5;
      addView((View)localObject, v.a(-1, 30.0F, i | 0x30, 17.0F, 11.0F, 11.0F, 0.0F));
      this.b = new TextView(paramContext);
      this.b.setTextColor(-14606047);
      this.b.setTextSize(1, 16.0F);
      this.b.setLines(1);
      this.b.setTypeface(a.a("fonts/rmedium.ttf"));
      this.b.setMaxLines(1);
      this.b.setSingleLine(true);
      this.b.setEllipsize(TextUtils.TruncateAt.END);
      TextView localTextView = this.b;
      if (!r.a)
        break label525;
      i = 5;
      label176: localTextView.setGravity(i | 0x30);
      this.c = new TextView(paramContext);
      this.c.setTextSize(1, 14.0F);
      localTextView = this.c;
      if (!r.a)
        break label530;
      i = 3;
      label221: localTextView.setGravity(i | 0x30);
      if (!r.a)
        break label535;
      ((LinearLayout)localObject).addView(this.c, v.b(-2, -1, 51, 0, 2, 0, 0));
      ((LinearLayout)localObject).addView(this.b, v.a(0, -1, 1.0F, 53, 10, 0, 0, 0));
      label277: this.d = new TextView(paramContext);
      this.d.setTextColor(-14606047);
      this.d.setTextSize(1, 14.0F);
      this.d.setLines(1);
      this.d.setMaxLines(1);
      this.d.setSingleLine(true);
      this.d.setEllipsize(TextUtils.TruncateAt.END);
      localObject = this.d;
      if (!r.a)
        break label579;
      i = 5;
      label355: ((TextView)localObject).setGravity(i | 0x30);
      localObject = this.d;
      if (!r.a)
        break label584;
      i = 5;
      label376: addView((View)localObject, v.a(-1, -2.0F, i | 0x30, 17.0F, 36.0F, 17.0F, 0.0F));
      this.e = new TextView(paramContext);
      this.e.setTextColor(-6710887);
      this.e.setTextSize(1, 14.0F);
      this.e.setLines(1);
      this.e.setMaxLines(1);
      this.e.setSingleLine(true);
      this.e.setEllipsize(TextUtils.TruncateAt.END);
      paramContext = this.e;
      if (!r.a)
        break label589;
      i = 5;
      label476: paramContext.setGravity(i | 0x30);
      paramContext = this.e;
      if (!r.a)
        break label594;
    }
    label525: label530: label535: label579: label584: label589: label594: for (int i = 5; ; i = 3)
    {
      addView(paramContext, v.a(-1, -2.0F, i | 0x30, 17.0F, 59.0F, 17.0F, 0.0F));
      return;
      i = 3;
      break;
      i = 3;
      break label176;
      i = 5;
      break label221;
      ((LinearLayout)localObject).addView(this.b, v.a(0, -1, 1.0F, 51, 0, 0, 10, 0));
      ((LinearLayout)localObject).addView(this.c, v.b(-2, -1, 53, 0, 2, 0, 0));
      break label277;
      i = 3;
      break label355;
      i = 3;
      break label376;
      i = 3;
      break label476;
    }
  }

  public void a(g.cx paramcx, boolean paramBoolean)
  {
    this.a = paramBoolean;
    this.b.setText(String.format(Locale.US, "%s %s", new Object[] { paramcx.i, paramcx.j }));
    if ((paramcx.d & 0x1) != 0)
    {
      this.c.setText(r.a("Online", 2131231606));
      this.c.setTextColor(-13660983);
    }
    while (true)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      if (paramcx.m.length() != 0)
        localStringBuilder.append(paramcx.m);
      if (paramcx.n.length() != 0)
      {
        if (localStringBuilder.length() != 0)
          localStringBuilder.append(" ");
        localStringBuilder.append("— ");
        localStringBuilder.append(paramcx.n);
      }
      this.e.setText(localStringBuilder);
      localStringBuilder = new StringBuilder();
      if (paramcx.e.length() != 0)
        localStringBuilder.append(paramcx.e);
      if ((paramcx.g.length() != 0) || (paramcx.f.length() != 0))
      {
        if (localStringBuilder.length() != 0)
          localStringBuilder.append(", ");
        if (paramcx.f.length() != 0)
          localStringBuilder.append(paramcx.f);
        if (paramcx.g.length() != 0)
        {
          if (paramcx.f.length() != 0)
            localStringBuilder.append(" ");
          localStringBuilder.append(paramcx.g);
        }
      }
      if ((paramcx.d & 0x2) == 0)
      {
        if (localStringBuilder.length() != 0)
          localStringBuilder.append(", ");
        localStringBuilder.append(r.a("UnofficialApp", 2131231915));
        localStringBuilder.append(" (ID: ");
        localStringBuilder.append(paramcx.h);
        localStringBuilder.append(")");
      }
      this.d.setText(localStringBuilder);
      return;
      this.c.setText(r.d(paramcx.l));
      this.c.setTextColor(-6710887);
    }
  }

  protected void onDraw(Canvas paramCanvas)
  {
    if (this.a)
      paramCanvas.drawLine(getPaddingLeft(), getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, f);
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i = a.a(90.0F);
    if (this.a);
    for (paramInt2 = 1; ; paramInt2 = 0)
    {
      super.onMeasure(paramInt1, View.MeasureSpec.makeMeasureSpec(paramInt2 + i, 1073741824));
      return;
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.c.ao
 * JD-Core Version:    0.6.0
 */