package org.vidogram.ui;

import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.f;
import android.support.v4.view.aa;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import org.vidogram.messenger.a;
import org.vidogram.messenger.d;
import org.vidogram.messenger.r;
import org.vidogram.tgnet.ConnectionsManager;
import org.vidogram.ui.a.l;

public class IntroActivity extends Activity
{
  private ViewPager a;
  private ImageView b;
  private ImageView c;
  private ViewGroup d;
  private int e = 0;
  private boolean f = false;
  private boolean g = false;
  private int[] h;
  private int[] i;
  private int[] j;

  protected void onCreate(Bundle paramBundle)
  {
    setTheme(2131427463);
    super.onCreate(paramBundle);
    l.a(this);
    requestWindowFeature(1);
    Object localObject;
    if (a.c())
    {
      setContentView(2130968624);
      paramBundle = findViewById(2131624112);
      localObject = (BitmapDrawable)getResources().getDrawable(2130837679);
      ((BitmapDrawable)localObject).setTileModeXY(Shader.TileMode.REPEAT, Shader.TileMode.REPEAT);
      paramBundle.setBackgroundDrawable((Drawable)localObject);
      if (Build.VERSION.SDK_INT >= 21)
        getWindow().setStatusBarColor(l.a);
      if (!r.a)
        break label515;
      this.h = new int[] { 2130837932, 2130837844, 2130837843, 2130837842, 2130837841, 2130837840, 2130837839 };
      this.i = new int[] { 2131232553, 2131232551, 2131232549, 2131232547, 2131232545, 2131232543, 2131232541 };
    }
    for (this.j = new int[] { 2131232552, 2131232550, 2131232548, 2131232546, 2131232544, 2131232542, 2131232540 }; ; this.j = new int[] { 2131232540, 2131232542, 2131232544, 2131232546, 2131232548, 2131232550, 2131232552 })
    {
      this.a = ((ViewPager)findViewById(2131624109));
      paramBundle = (TextView)findViewById(2131624110);
      paramBundle.setText(r.a("StartMessaging", 2131231868).toUpperCase());
      if (Build.VERSION.SDK_INT >= 21)
      {
        localObject = new StateListAnimator();
        ObjectAnimator localObjectAnimator = ObjectAnimator.ofFloat(paramBundle, "translationZ", new float[] { a.a(2.0F), a.a(4.0F) }).setDuration(200L);
        ((StateListAnimator)localObject).addState(new int[] { 16842919 }, localObjectAnimator);
        localObjectAnimator = ObjectAnimator.ofFloat(paramBundle, "translationZ", new float[] { a.a(4.0F), a.a(2.0F) }).setDuration(200L);
        ((StateListAnimator)localObject).addState(new int[0], localObjectAnimator);
        paramBundle.setStateListAnimator((StateListAnimator)localObject);
      }
      this.b = ((ImageView)findViewById(2131624107));
      this.c = ((ImageView)findViewById(2131624108));
      this.d = ((ViewGroup)findViewById(2131624111));
      this.c.setVisibility(8);
      this.a.setAdapter(new a(null));
      this.a.setPageMargin(0);
      this.a.setOffscreenPageLimit(1);
      this.a.a(new ViewPager.f()
      {
        public void a(int paramInt)
        {
        }

        public void a(int paramInt1, float paramFloat, int paramInt2)
        {
        }

        public void b(int paramInt)
        {
          ImageView localImageView2;
          if (((paramInt == 0) || (paramInt == 2)) && (IntroActivity.a(IntroActivity.this) != IntroActivity.b(IntroActivity.this).getCurrentItem()))
          {
            IntroActivity.a(IntroActivity.this, IntroActivity.b(IntroActivity.this).getCurrentItem());
            if (IntroActivity.c(IntroActivity.this).getVisibility() != 0)
              break label170;
            localImageView2 = IntroActivity.c(IntroActivity.this);
          }
          for (ImageView localImageView1 = IntroActivity.d(IntroActivity.this); ; localImageView1 = IntroActivity.c(IntroActivity.this))
          {
            localImageView1.bringToFront();
            localImageView1.setImageResource(IntroActivity.e(IntroActivity.this)[IntroActivity.a(IntroActivity.this)]);
            localImageView1.clearAnimation();
            localImageView2.clearAnimation();
            Animation localAnimation1 = AnimationUtils.loadAnimation(IntroActivity.this, 2131034123);
            localAnimation1.setAnimationListener(new Animation.AnimationListener(localImageView2)
            {
              public void onAnimationEnd(Animation paramAnimation)
              {
                this.a.setVisibility(8);
              }

              public void onAnimationRepeat(Animation paramAnimation)
              {
              }

              public void onAnimationStart(Animation paramAnimation)
              {
              }
            });
            Animation localAnimation2 = AnimationUtils.loadAnimation(IntroActivity.this, 2131034122);
            localAnimation2.setAnimationListener(new Animation.AnimationListener(localImageView1)
            {
              public void onAnimationEnd(Animation paramAnimation)
              {
              }

              public void onAnimationRepeat(Animation paramAnimation)
              {
              }

              public void onAnimationStart(Animation paramAnimation)
              {
                this.a.setVisibility(0);
              }
            });
            localImageView2.startAnimation(localAnimation1);
            localImageView1.startAnimation(localAnimation2);
            return;
            label170: localImageView2 = IntroActivity.d(IntroActivity.this);
          }
        }
      });
      paramBundle.setOnClickListener(new View.OnClickListener()
      {
        public void onClick(View paramView)
        {
          if (IntroActivity.f(IntroActivity.this))
            return;
          IntroActivity.a(IntroActivity.this, true);
          paramView = new Intent(IntroActivity.this, LaunchActivity.class);
          paramView.putExtra("fromIntro", true);
          IntroActivity.this.startActivity(paramView);
          IntroActivity.this.finish();
        }
      });
      if (d.a)
        paramBundle.setOnLongClickListener(new View.OnLongClickListener()
        {
          public boolean onLongClick(View paramView)
          {
            ConnectionsManager.a().f();
            return true;
          }
        });
      this.f = true;
      return;
      setRequestedOrientation(1);
      setContentView(2130968623);
      break;
      label515: this.h = new int[] { 2130837839, 2130837840, 2130837841, 2130837842, 2130837843, 2130837844, 2130837932 };
      this.i = new int[] { 2131232541, 2131232543, 2131232545, 2131232547, 2131232549, 2131232551, 2131232553 };
    }
  }

  protected void onPause()
  {
    super.onPause();
    a.h();
  }

  protected void onResume()
  {
    super.onResume();
    if (this.f)
    {
      if (!r.a)
        break label46;
      this.a.setCurrentItem(6);
    }
    for (this.e = 6; ; this.e = 0)
    {
      this.f = false;
      a.c(this);
      a.d(this);
      return;
      label46: this.a.setCurrentItem(0);
    }
  }

  private class a extends aa
  {
    private a()
    {
    }

    public int a()
    {
      return 7;
    }

    public Object a(ViewGroup paramViewGroup, int paramInt)
    {
      View localView = View.inflate(paramViewGroup.getContext(), 2130968625, null);
      TextView localTextView1 = (TextView)localView.findViewById(2131624113);
      TextView localTextView2 = (TextView)localView.findViewById(2131624114);
      paramViewGroup.addView(localView, 0);
      localTextView1.setText(IntroActivity.this.getString(IntroActivity.g(IntroActivity.this)[paramInt]));
      localTextView2.setText(a.b(IntroActivity.this.getString(IntroActivity.h(IntroActivity.this)[paramInt])));
      return localView;
    }

    public void a(Parcelable paramParcelable, ClassLoader paramClassLoader)
    {
    }

    public void a(ViewGroup paramViewGroup, int paramInt, Object paramObject)
    {
      paramViewGroup.removeView((View)paramObject);
    }

    public boolean a(View paramView, Object paramObject)
    {
      return paramView.equals(paramObject);
    }

    public Parcelable b()
    {
      return null;
    }

    public void b(ViewGroup paramViewGroup, int paramInt, Object paramObject)
    {
      super.b(paramViewGroup, paramInt, paramObject);
      int j = IntroActivity.i(IntroActivity.this).getChildCount();
      int i = 0;
      if (i < j)
      {
        paramViewGroup = IntroActivity.i(IntroActivity.this).getChildAt(i);
        if (i == paramInt)
          paramViewGroup.setBackgroundColor(-13851168);
        while (true)
        {
          i += 1;
          break;
          paramViewGroup.setBackgroundColor(-4473925);
        }
      }
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.IntroActivity
 * JD-Core Version:    0.6.0
 */