package org.vidogram.ui;

import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.ScrollView;
import android.widget.TextView;
import org.vidogram.a.b;
import org.vidogram.messenger.ad;
import org.vidogram.messenger.n;
import org.vidogram.messenger.r;
import org.vidogram.tgnet.g.vw;
import org.vidogram.ui.a.a.a;
import org.vidogram.ui.a.g;

public class j extends g
{
  public View a(Context paramContext)
  {
    this.d.setBackButtonImage(2130837794);
    this.d.setAllowOverlayTitle(true);
    Object localObject1 = ad.d();
    if ((localObject1 != null) && (((g.vw)localObject1).i != null) && (((g.vw)localObject1).i.length() != 0))
      localObject1 = b.a().e("+" + ((g.vw)localObject1).i);
    while (true)
    {
      this.d.setTitle((CharSequence)localObject1);
      this.d.setActionBarMenuOnItemClick(new a.a()
      {
        public void a(int paramInt)
        {
          if (paramInt == -1)
            j.this.d();
        }
      });
      this.b = new RelativeLayout(paramContext);
      this.b.setOnTouchListener(new View.OnTouchListener()
      {
        public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
        {
          return true;
        }
      });
      localObject1 = (RelativeLayout)this.b;
      Object localObject2 = new ScrollView(paramContext);
      ((RelativeLayout)localObject1).addView((View)localObject2);
      localObject1 = (RelativeLayout.LayoutParams)((ScrollView)localObject2).getLayoutParams();
      ((RelativeLayout.LayoutParams)localObject1).width = -1;
      ((RelativeLayout.LayoutParams)localObject1).height = -2;
      ((RelativeLayout.LayoutParams)localObject1).addRule(15, -1);
      ((ScrollView)localObject2).setLayoutParams((ViewGroup.LayoutParams)localObject1);
      localObject1 = new LinearLayout(paramContext);
      ((LinearLayout)localObject1).setOrientation(1);
      ((LinearLayout)localObject1).setPadding(0, org.vidogram.messenger.a.a(20.0F), 0, org.vidogram.messenger.a.a(20.0F));
      ((ScrollView)localObject2).addView((View)localObject1);
      localObject2 = (FrameLayout.LayoutParams)((LinearLayout)localObject1).getLayoutParams();
      ((FrameLayout.LayoutParams)localObject2).width = -1;
      ((FrameLayout.LayoutParams)localObject2).height = -2;
      ((LinearLayout)localObject1).setLayoutParams((ViewGroup.LayoutParams)localObject2);
      localObject2 = new ImageView(paramContext);
      ((ImageView)localObject2).setImageResource(2130838030);
      ((LinearLayout)localObject1).addView((View)localObject2);
      LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)((ImageView)localObject2).getLayoutParams();
      localLayoutParams.width = -2;
      localLayoutParams.height = -2;
      localLayoutParams.gravity = 1;
      ((ImageView)localObject2).setLayoutParams(localLayoutParams);
      localObject2 = new TextView(paramContext);
      ((TextView)localObject2).setTextSize(1, 16.0F);
      ((TextView)localObject2).setGravity(1);
      ((TextView)localObject2).setTextColor(-14606047);
      try
      {
        ((TextView)localObject2).setText(org.vidogram.messenger.a.b(r.a("PhoneNumberHelp", 2131231669)));
        ((LinearLayout)localObject1).addView((View)localObject2);
        localLayoutParams = (LinearLayout.LayoutParams)((TextView)localObject2).getLayoutParams();
        localLayoutParams.width = -2;
        localLayoutParams.height = -2;
        localLayoutParams.gravity = 1;
        localLayoutParams.leftMargin = org.vidogram.messenger.a.a(20.0F);
        localLayoutParams.rightMargin = org.vidogram.messenger.a.a(20.0F);
        localLayoutParams.topMargin = org.vidogram.messenger.a.a(56.0F);
        ((TextView)localObject2).setLayoutParams(localLayoutParams);
        paramContext = new TextView(paramContext);
        paramContext.setTextSize(1, 18.0F);
        paramContext.setGravity(1);
        paramContext.setTextColor(-11697229);
        paramContext.setText(r.a("PhoneNumberChange", 2131231668));
        paramContext.setTypeface(org.vidogram.messenger.a.a("fonts/rmedium.ttf"));
        paramContext.setPadding(0, org.vidogram.messenger.a.a(10.0F), 0, org.vidogram.messenger.a.a(10.0F));
        ((LinearLayout)localObject1).addView(paramContext);
        localObject1 = (LinearLayout.LayoutParams)paramContext.getLayoutParams();
        ((LinearLayout.LayoutParams)localObject1).width = -2;
        ((LinearLayout.LayoutParams)localObject1).height = -2;
        ((LinearLayout.LayoutParams)localObject1).gravity = 1;
        ((LinearLayout.LayoutParams)localObject1).leftMargin = org.vidogram.messenger.a.a(20.0F);
        ((LinearLayout.LayoutParams)localObject1).rightMargin = org.vidogram.messenger.a.a(20.0F);
        ((LinearLayout.LayoutParams)localObject1).topMargin = org.vidogram.messenger.a.a(46.0F);
        paramContext.setLayoutParams((ViewGroup.LayoutParams)localObject1);
        paramContext.setOnClickListener(new View.OnClickListener()
        {
          public void onClick(View paramView)
          {
            if (j.this.l() == null)
              return;
            paramView = new AlertDialog.Builder(j.this.l());
            paramView.setTitle(r.a("AppName", 2131230856));
            paramView.setMessage(r.a("PhoneNumberAlert", 2131231667));
            paramView.setPositiveButton(r.a("OK", 2131231604), new DialogInterface.OnClickListener()
            {
              public void onClick(DialogInterface paramDialogInterface, int paramInt)
              {
                j.this.a(new i(), true);
              }
            });
            paramView.setNegativeButton(r.a("Cancel", 2131230943), null);
            j.this.b(paramView.create());
          }
        });
        return this.b;
        localObject1 = r.a("NumberUnknown", 2131231603);
      }
      catch (Exception localException)
      {
        while (true)
        {
          n.a("tmessages", localException);
          ((TextView)localObject2).setText(r.a("PhoneNumberHelp", 2131231669));
        }
      }
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.j
 * JD-Core Version:    0.6.0
 */