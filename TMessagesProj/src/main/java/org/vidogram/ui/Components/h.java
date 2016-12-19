package org.vidogram.ui.Components;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.vidogram.messenger.a;
import org.vidogram.messenger.r;
import org.vidogram.ui.a.l;

public class h extends LinearLayout
{
  private TextView a;

  public h(Context paramContext, boolean paramBoolean)
  {
    super(paramContext);
    setBackgroundResource(2130838163);
    getBackground().setColorFilter(l.P);
    setPadding(a.a(16.0F), a.a(12.0F), a.a(16.0F), a.a(12.0F));
    setOrientation(1);
    Object localObject;
    label155: int i;
    label183: int j;
    label190: label215: label245: ImageView localImageView;
    label283: TextView localTextView;
    if (paramBoolean)
    {
      this.a = new TextView(paramContext);
      this.a.setTextSize(1, 15.0F);
      this.a.setTextColor(-1);
      this.a.setGravity(1);
      this.a.setMaxWidth(a.a(210.0F));
      addView(this.a, v.d(-2, -2, 49));
      localObject = new TextView(paramContext);
      if (!paramBoolean)
        break label466;
      ((TextView)localObject).setText(r.a("EncryptedDescriptionTitle", 2131231170));
      ((TextView)localObject).setTextSize(1, 15.0F);
      ((TextView)localObject).setTextColor(-1);
      ((TextView)localObject).setMaxWidth(a.a(260.0F));
      if (!paramBoolean)
        break label510;
      if (!r.a)
        break label505;
      i = 5;
      if (!paramBoolean)
        break label515;
      j = 0;
      addView((View)localObject, v.b(-2, -2, i | 0x30, 0, 8, 0, j));
      i = 0;
      if (i >= 4)
        return;
      localObject = new LinearLayout(paramContext);
      ((LinearLayout)localObject).setOrientation(0);
      if (!r.a)
        break label522;
      j = 5;
      addView((View)localObject, v.b(-2, -2, j, 0, 8, 0, 0));
      localImageView = new ImageView(paramContext);
      if (!paramBoolean)
        break label528;
      j = 2130837848;
      localImageView.setImageResource(j);
      localTextView = new TextView(paramContext);
      localTextView.setTextSize(1, 15.0F);
      localTextView.setTextColor(-1);
      if (!r.a)
        break label535;
      j = 5;
      label323: localTextView.setGravity(j | 0x10);
      localTextView.setMaxWidth(a.a(260.0F));
      switch (i)
      {
      default:
        label376: if (!r.a)
          break label700;
        ((LinearLayout)localObject).addView(localTextView, v.b(-2, -2));
        if (!paramBoolean)
          break;
        ((LinearLayout)localObject).addView(localImageView, v.a(-2, -2, 8.0F, 3.0F, 0.0F, 0.0F));
      case 0:
      case 1:
      case 2:
      case 3:
      }
    }
    while (true)
    {
      i += 1;
      break label215;
      localObject = new ImageView(paramContext);
      ((ImageView)localObject).setImageResource(2130837691);
      addView((View)localObject, v.b(-2, -2, 49, 0, 2, 0, 0));
      break;
      label466: ((TextView)localObject).setText(r.a("ChatYourSelfTitle", 2131231061));
      ((TextView)localObject).setTextSize(1, 16.0F);
      ((TextView)localObject).setTypeface(a.a("fonts/rmedium.ttf"));
      ((TextView)localObject).setGravity(1);
      break label155;
      label505: i = 3;
      break label183;
      label510: i = 1;
      break label183;
      label515: j = 8;
      break label190;
      label522: j = 3;
      break label245;
      label528: j = 2130837940;
      break label283;
      label535: j = 3;
      break label323;
      if (paramBoolean)
      {
        localTextView.setText(r.a("EncryptedDescription1", 2131231166));
        break label376;
      }
      localTextView.setText(r.a("ChatYourSelfDescription1", 2131231056));
      break label376;
      if (paramBoolean)
      {
        localTextView.setText(r.a("EncryptedDescription2", 2131231167));
        break label376;
      }
      localTextView.setText(r.a("ChatYourSelfDescription2", 2131231057));
      break label376;
      if (paramBoolean)
      {
        localTextView.setText(r.a("EncryptedDescription3", 2131231168));
        break label376;
      }
      localTextView.setText(r.a("ChatYourSelfDescription3", 2131231058));
      break label376;
      if (paramBoolean)
      {
        localTextView.setText(r.a("EncryptedDescription4", 2131231169));
        break label376;
      }
      localTextView.setText(r.a("ChatYourSelfDescription4", 2131231059));
      break label376;
      ((LinearLayout)localObject).addView(localImageView, v.a(-2, -2, 8.0F, 7.0F, 0.0F, 0.0F));
    }
    label700: if (paramBoolean)
      ((LinearLayout)localObject).addView(localImageView, v.a(-2, -2, 0.0F, 4.0F, 8.0F, 0.0F));
    while (true)
    {
      ((LinearLayout)localObject).addView(localTextView, v.b(-2, -2));
      break;
      ((LinearLayout)localObject).addView(localImageView, v.a(-2, -2, 0.0F, 8.0F, 8.0F, 0.0F));
    }
  }

  public void setSecretText(String paramString)
  {
    this.a.setText(paramString);
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.Components.h
 * JD-Core Version:    0.6.0
 */