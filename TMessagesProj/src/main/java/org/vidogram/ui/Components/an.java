package org.vidogram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.vidogram.messenger.a;
import org.vidogram.messenger.r;
import org.vidogram.ui.a.l;

public class an extends FrameLayout
{
  public TextView a;
  public TextView b;
  public TextView c;
  private boolean d;

  public an(Context paramContext)
  {
    this(paramContext, true);
  }

  public an(Context paramContext, boolean paramBoolean)
  {
    super(paramContext);
    this.d = paramBoolean;
    if (this.d)
    {
      i = -15066598;
      setBackgroundColor(i);
      this.a = new TextView(paramContext);
      this.a.setTextSize(1, 14.0F);
      TextView localTextView = this.a;
      if (!this.d)
        break label442;
      i = -1;
      label62: localTextView.setTextColor(i);
      this.a.setGravity(17);
      localTextView = this.a;
      if (!this.d)
        break label448;
      i = -12763843;
      label93: localTextView.setBackgroundDrawable(l.a(i, false));
      this.a.setPadding(a.a(20.0F), 0, a.a(20.0F), 0);
      this.a.setText(r.a("Cancel", 2131230943).toUpperCase());
      this.a.setTypeface(a.a("fonts/rmedium.ttf"));
      addView(this.a, v.b(-2, -1, 51));
      this.b = new TextView(paramContext);
      this.b.setTextSize(1, 14.0F);
      localTextView = this.b;
      if (!this.d)
        break label454;
      i = -1;
      label204: localTextView.setTextColor(i);
      this.b.setGravity(17);
      localTextView = this.b;
      if (!this.d)
        break label460;
      i = -12763843;
      label235: localTextView.setBackgroundDrawable(l.a(i, false));
      this.b.setPadding(a.a(20.0F), 0, a.a(20.0F), 0);
      this.b.setText(r.a("Send", 2131231793).toUpperCase());
      this.b.setTypeface(a.a("fonts/rmedium.ttf"));
      addView(this.b, v.b(-2, -1, 53));
      this.c = new TextView(paramContext);
      this.c.setTypeface(a.a("fonts/rmedium.ttf"));
      this.c.setTextSize(1, 13.0F);
      this.c.setTextColor(-1);
      this.c.setGravity(17);
      paramContext = this.c;
      if (!this.d)
        break label466;
    }
    label442: label448: label454: label460: label466: for (int i = 2130838046; ; i = 2130837636)
    {
      paramContext.setBackgroundResource(i);
      this.c.setMinWidth(a.a(23.0F));
      this.c.setPadding(a.a(8.0F), 0, a.a(8.0F), a.a(1.0F));
      addView(this.c, v.a(-2, 23.0F, 53, 0.0F, 0.0F, 7.0F, 0.0F));
      return;
      i = -1;
      break;
      i = -15095832;
      break label62;
      i = 788529152;
      break label93;
      i = -15095832;
      break label204;
      i = 788529152;
      break label235;
    }
  }

  public void a(int paramInt, boolean paramBoolean)
  {
    int i = -1;
    if (paramInt == 0)
    {
      this.c.setVisibility(8);
      if (paramBoolean)
      {
        this.b.setTextColor(-6710887);
        this.b.setEnabled(false);
        return;
      }
      localTextView = this.b;
      if (this.d);
      while (true)
      {
        localTextView.setTextColor(i);
        return;
        i = -15095832;
      }
    }
    this.c.setVisibility(0);
    this.c.setText(String.format("%d", new Object[] { Integer.valueOf(paramInt) }));
    TextView localTextView = this.b;
    if (this.d);
    while (true)
    {
      localTextView.setTextColor(i);
      if (!paramBoolean)
        break;
      this.b.setEnabled(true);
      return;
      i = -15095832;
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.Components.an
 * JD-Core Version:    0.6.0
 */