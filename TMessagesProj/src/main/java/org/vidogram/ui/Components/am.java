package org.vidogram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.vidogram.messenger.a;
import org.vidogram.messenger.r;
import org.vidogram.ui.a.l;

public class am extends FrameLayout
{
  public LinearLayout a;
  public TextView b;
  public TextView c;
  public TextView d;
  private boolean e;

  public am(Context paramContext)
  {
    this(paramContext, true);
  }

  public am(Context paramContext, boolean paramBoolean)
  {
    super(paramContext);
    this.e = paramBoolean;
    if (this.e)
    {
      i = -15066598;
      setBackgroundColor(i);
      this.b = new TextView(paramContext);
      this.b.setTextSize(1, 14.0F);
      Object localObject = this.b;
      if (!this.e)
        break label501;
      i = -1;
      label65: ((TextView)localObject).setTextColor(i);
      this.b.setGravity(17);
      localObject = this.b;
      if (!this.e)
        break label507;
      i = -12763843;
      label96: ((TextView)localObject).setBackgroundDrawable(l.a(i, false));
      this.b.setPadding(a.a(29.0F), 0, a.a(29.0F), 0);
      this.b.setText(r.a("Cancel", 2131230943).toUpperCase());
      this.b.setTypeface(a.a("fonts/rmedium.ttf"));
      addView(this.b, v.b(-2, -1, 51));
      this.a = new LinearLayout(paramContext);
      this.a.setOrientation(0);
      localObject = this.a;
      if (!this.e)
        break label513;
      i = -12763843;
      label206: ((LinearLayout)localObject).setBackgroundDrawable(l.a(i, false));
      this.a.setPadding(a.a(29.0F), 0, a.a(29.0F), 0);
      addView(this.a, v.b(-2, -1, 53));
      this.d = new TextView(paramContext);
      this.d.setTypeface(a.a("fonts/rmedium.ttf"));
      this.d.setTextSize(1, 13.0F);
      this.d.setTextColor(-1);
      this.d.setGravity(17);
      localObject = this.d;
      if (!this.e)
        break label519;
      i = 2130838046;
      label318: ((TextView)localObject).setBackgroundResource(i);
      this.d.setMinWidth(a.a(23.0F));
      this.d.setPadding(a.a(8.0F), 0, a.a(8.0F), a.a(1.0F));
      this.a.addView(this.d, v.b(-2, 23, 16, 0, 0, 10, 0));
      this.c = new TextView(paramContext);
      this.c.setTextSize(1, 14.0F);
      paramContext = this.c;
      if (!this.e)
        break label525;
    }
    label513: label519: label525: for (int i = j; ; i = -15095832)
    {
      paramContext.setTextColor(i);
      this.c.setGravity(17);
      this.c.setCompoundDrawablePadding(a.a(8.0F));
      this.c.setText(r.a("Send", 2131231793).toUpperCase());
      this.c.setTypeface(a.a("fonts/rmedium.ttf"));
      this.a.addView(this.c, v.d(-2, -2, 16));
      return;
      i = -1;
      break;
      label501: i = -15095832;
      break label65;
      label507: i = 788529152;
      break label96;
      i = 788529152;
      break label206;
      i = 2130837636;
      break label318;
    }
  }

  public void a(int paramInt, boolean paramBoolean)
  {
    int i = -1;
    if (paramInt == 0)
    {
      this.d.setVisibility(8);
      if (paramBoolean)
      {
        this.c.setTextColor(-6710887);
        this.a.setEnabled(false);
        return;
      }
      localTextView = this.c;
      if (this.e);
      while (true)
      {
        localTextView.setTextColor(i);
        return;
        i = -15095832;
      }
    }
    this.d.setVisibility(0);
    this.d.setText(String.format("%d", new Object[] { Integer.valueOf(paramInt) }));
    TextView localTextView = this.c;
    if (this.e);
    while (true)
    {
      localTextView.setTextColor(i);
      if (!paramBoolean)
        break;
      this.a.setEnabled(true);
      return;
      i = -15095832;
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.Components.am
 * JD-Core Version:    0.6.0
 */