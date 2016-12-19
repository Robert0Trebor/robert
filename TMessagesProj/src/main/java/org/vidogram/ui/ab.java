package org.vidogram.ui;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.vidogram.messenger.ApplicationLoader;
import org.vidogram.messenger.Utilities;
import org.vidogram.messenger.n;
import org.vidogram.messenger.r;
import org.vidogram.tgnet.g.t;
import org.vidogram.tgnet.g.vw;
import org.vidogram.ui.Components.URLSpanReplacement;
import org.vidogram.ui.Components.u;
import org.vidogram.ui.a.a.a;
import org.vidogram.ui.a.g;

public class ab extends g
{
  private int i;

  public ab(Bundle paramBundle)
  {
    super(paramBundle);
  }

  private void q()
  {
    this.b.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener()
    {
      public boolean onPreDraw()
      {
        if (ab.a(ab.this) == null)
          return true;
        ab.b(ab.this).getViewTreeObserver().removeOnPreDrawListener(this);
        LinearLayout localLinearLayout = (LinearLayout)ab.c(ab.this);
        int i = ((WindowManager)ApplicationLoader.a.getSystemService("window")).getDefaultDisplay().getRotation();
        if ((i == 3) || (i == 1))
          localLinearLayout.setOrientation(0);
        while (true)
        {
          ab.g(ab.this).setPadding(ab.d(ab.this).getPaddingLeft(), 0, ab.e(ab.this).getPaddingRight(), ab.f(ab.this).getPaddingBottom());
          return true;
          localLinearLayout.setOrientation(1);
        }
      }
    });
  }

  public View a(Context paramContext)
  {
    this.d.setBackButtonImage(2130837794);
    this.d.setAllowOverlayTitle(true);
    this.d.setTitle(r.a("EncryptionKey", 2131231173));
    this.d.setActionBarMenuOnItemClick(new a.a()
    {
      public void a(int paramInt)
      {
        if (paramInt == -1)
          ab.this.d();
      }
    });
    this.b = new LinearLayout(paramContext);
    Object localObject2 = (LinearLayout)this.b;
    ((LinearLayout)localObject2).setOrientation(1);
    ((LinearLayout)localObject2).setWeightSum(100.0F);
    ((LinearLayout)localObject2).setBackgroundColor(-986896);
    this.b.setOnTouchListener(new View.OnTouchListener()
    {
      public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
      {
        return true;
      }
    });
    Object localObject3 = new FrameLayout(paramContext);
    ((FrameLayout)localObject3).setPadding(org.vidogram.messenger.a.a(20.0F), org.vidogram.messenger.a.a(20.0F), org.vidogram.messenger.a.a(20.0F), org.vidogram.messenger.a.a(20.0F));
    ((LinearLayout)localObject2).addView((View)localObject3, org.vidogram.ui.Components.v.a(-1, -1, 50.0F));
    Object localObject1 = new ImageView(paramContext);
    ((ImageView)localObject1).setScaleType(ImageView.ScaleType.FIT_XY);
    ((FrameLayout)localObject3).addView((View)localObject1, org.vidogram.ui.Components.v.a(-1, -1.0F));
    localObject3 = new FrameLayout(paramContext);
    ((FrameLayout)localObject3).setBackgroundColor(-1);
    ((FrameLayout)localObject3).setPadding(org.vidogram.messenger.a.a(10.0F), 0, org.vidogram.messenger.a.a(10.0F), org.vidogram.messenger.a.a(10.0F));
    ((LinearLayout)localObject2).addView((View)localObject3, org.vidogram.ui.Components.v.a(-1, -1, 50.0F));
    paramContext = new TextView(paramContext);
    paramContext.setTextColor(-8421505);
    paramContext.setTextSize(1, 16.0F);
    paramContext.setLinksClickable(true);
    paramContext.setClickable(true);
    paramContext.setMovementMethod(new a(null));
    paramContext.setLinkTextColor(-14255946);
    paramContext.setGravity(17);
    ((FrameLayout)localObject3).addView(paramContext, org.vidogram.ui.Components.v.a(-1, -1.0F));
    localObject2 = org.vidogram.messenger.v.a().c(Integer.valueOf(this.i));
    if (localObject2 != null)
    {
      localObject3 = new u();
      ((ImageView)localObject1).setImageDrawable((Drawable)localObject3);
      ((u)localObject3).a((g.t)localObject2);
      localObject1 = org.vidogram.messenger.v.a().a(Integer.valueOf(((g.t)localObject2).m));
      localObject3 = new SpannableStringBuilder();
      if (((g.t)localObject2).s.length > 16)
      {
        localObject2 = Utilities.a(((g.t)localObject2).s);
        j = 0;
        if (j < 32)
        {
          if (j != 0)
          {
            if (j % 8 != 0)
              break label446;
            ((SpannableStringBuilder)localObject3).append('\n');
          }
          while (true)
          {
            ((SpannableStringBuilder)localObject3).append(((String)localObject2).substring(j * 2, j * 2 + 2));
            ((SpannableStringBuilder)localObject3).append(' ');
            j += 1;
            break;
            label446: if (j % 4 != 0)
              continue;
            ((SpannableStringBuilder)localObject3).append(' ');
          }
        }
        ((SpannableStringBuilder)localObject3).append("\n\n");
      }
      ((SpannableStringBuilder)localObject3).append(org.vidogram.messenger.a.b(r.a("EncryptionKeyDescription", 2131231174, new Object[] { ((g.vw)localObject1).e, ((g.vw)localObject1).e })));
      int j = ((SpannableStringBuilder)localObject3).toString().indexOf("telegram.org");
      if (j != -1)
        ((SpannableStringBuilder)localObject3).setSpan(new URLSpanReplacement(r.a("EncryptionKeyLink", 2131231175)), j, "telegram.org".length() + j, 33);
      paramContext.setText((CharSequence)localObject3);
    }
    return (View)(View)(View)this.b;
  }

  public void a(Configuration paramConfiguration)
  {
    super.a(paramConfiguration);
    q();
  }

  public boolean f()
  {
    this.i = b().getInt("chat_id");
    return super.f();
  }

  public void i()
  {
    super.i();
    q();
  }

  private static class a extends LinkMovementMethod
  {
    public boolean onTouchEvent(TextView paramTextView, Spannable paramSpannable, MotionEvent paramMotionEvent)
    {
      try
      {
        boolean bool = super.onTouchEvent(paramTextView, paramSpannable, paramMotionEvent);
        return bool;
      }
      catch (java.lang.Exception paramTextView)
      {
        n.a("tmessages", paramTextView);
      }
      return false;
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.ab
 * JD-Core Version:    0.6.0
 */