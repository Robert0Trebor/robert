package org.vidogram.ui;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import java.util.ArrayList;
import org.vidogram.messenger.ApplicationLoader;
import org.vidogram.messenger.a;
import org.vidogram.messenger.y;
import org.vidogram.tgnet.ConnectionsManager;
import org.vidogram.ui.Components.v;
import org.vidogram.ui.a.b;
import org.vidogram.ui.a.b.a;
import org.vidogram.ui.a.g;
import org.vidogram.ui.a.i;
import org.vidogram.ui.a.l;

public class ManageSpaceActivity extends Activity
  implements b.a
{
  private static ArrayList<g> d = new ArrayList();
  private static ArrayList<g> e = new ArrayList();
  protected i a;
  private boolean b;
  private int c;
  private b f;
  private b g;

  private boolean a(Intent paramIntent, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    if (a.c())
      if (this.g.e.isEmpty())
        this.g.b(new e());
    while (true)
    {
      this.f.h();
      if (a.c())
        this.g.h();
      paramIntent.setAction(null);
      return false;
      if (!this.f.e.isEmpty())
        continue;
      this.f.b(new e());
    }
  }

  private void d()
  {
    if (this.b)
      return;
    this.b = true;
  }

  public boolean a()
  {
    return false;
  }

  public boolean a(b paramb)
  {
    if (a.c())
    {
      if ((paramb == this.f) && (paramb.e.size() <= 1))
      {
        d();
        finish();
        return false;
      }
      if ((paramb == this.g) && (this.f.e.isEmpty()) && (this.g.e.size() == 1))
      {
        d();
        finish();
        return false;
      }
    }
    else if (paramb.e.size() <= 1)
    {
      d();
      finish();
      return false;
    }
    return true;
  }

  public boolean a(g paramg, b paramb)
  {
    return true;
  }

  public boolean a(g paramg, boolean paramBoolean1, boolean paramBoolean2, b paramb)
  {
    return true;
  }

  public void b()
  {
    RelativeLayout.LayoutParams localLayoutParams;
    int i;
    if (a.c())
    {
      localLayoutParams = (RelativeLayout.LayoutParams)this.g.getLayoutParams();
      localLayoutParams.leftMargin = ((a.c.x - localLayoutParams.width) / 2);
      if (Build.VERSION.SDK_INT < 21)
        break label209;
      i = a.a;
      localLayoutParams.topMargin = (i + (a.c.y - localLayoutParams.height - i) / 2);
      this.g.setLayoutParams(localLayoutParams);
      if ((a.d()) && (getResources().getConfiguration().orientation != 2))
        break label214;
      i = a.c.x / 100 * 35;
      if (i >= a.a(320.0F))
        break label244;
      i = a.a(320.0F);
    }
    label209: label214: label244: 
    while (true)
    {
      localLayoutParams = (RelativeLayout.LayoutParams)this.f.getLayoutParams();
      localLayoutParams.width = i;
      localLayoutParams.height = -1;
      this.f.setLayoutParams(localLayoutParams);
      if ((a.d()) && (this.f.e.size() == 2))
      {
        ((g)this.f.e.get(1)).j();
        this.f.e.remove(1);
        this.f.h();
      }
      return;
      i = 0;
      break;
      localLayoutParams = (RelativeLayout.LayoutParams)this.f.getLayoutParams();
      localLayoutParams.width = -1;
      localLayoutParams.height = -1;
      this.f.setLayoutParams(localLayoutParams);
      return;
    }
  }

  public void b(b paramb)
  {
    if ((a.c()) && (paramb == this.g))
    {
      this.f.b(true);
      this.f.h();
    }
  }

  public void c()
  {
    if (!a.c());
    do
      return;
    while (this.f == null);
    this.f.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener()
    {
      public void onGlobalLayout()
      {
        ManageSpaceActivity.this.b();
        if (ManageSpaceActivity.a(ManageSpaceActivity.this) != null)
        {
          if (Build.VERSION.SDK_INT < 16)
            ManageSpaceActivity.a(ManageSpaceActivity.this).getViewTreeObserver().removeGlobalOnLayoutListener(this);
        }
        else
          return;
        ManageSpaceActivity.a(ManageSpaceActivity.this).getViewTreeObserver().removeOnGlobalLayoutListener(this);
      }
    });
  }

  public void onBackPressed()
  {
    if (am.a().f())
    {
      am.a().a(true, false);
      return;
    }
    if (this.a.b())
    {
      this.a.b(false);
      return;
    }
    if (a.c())
    {
      if (this.g.getVisibility() == 0)
      {
        this.g.d();
        return;
      }
      this.f.d();
      return;
    }
    this.f.d();
  }

  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    a.a(this, paramConfiguration);
    super.onConfigurationChanged(paramConfiguration);
    c();
  }

  protected void onCreate(Bundle paramBundle)
  {
    ApplicationLoader.i();
    requestWindowFeature(1);
    setTheme(2131427463);
    getWindow().setBackgroundDrawableResource(2130838191);
    super.onCreate(paramBundle);
    l.a(this);
    int i = getResources().getIdentifier("status_bar_height", "dimen", "android");
    if (i > 0)
      a.a = getResources().getDimensionPixelSize(i);
    this.f = new b(this);
    this.a = new i(this);
    this.a.a(false, false);
    setContentView(this.a, new ViewGroup.LayoutParams(-1, -1));
    if (Build.VERSION.SDK_INT >= 21)
      getWindow().setStatusBarColor(l.a);
    Object localObject1;
    if (a.c())
    {
      getWindow().setSoftInputMode(16);
      localObject1 = new RelativeLayout(this);
      this.a.addView((View)localObject1);
      Object localObject2 = (FrameLayout.LayoutParams)((RelativeLayout)localObject1).getLayoutParams();
      ((FrameLayout.LayoutParams)localObject2).width = -1;
      ((FrameLayout.LayoutParams)localObject2).height = -1;
      ((RelativeLayout)localObject1).setLayoutParams((ViewGroup.LayoutParams)localObject2);
      localObject2 = new View(this);
      BitmapDrawable localBitmapDrawable = (BitmapDrawable)getResources().getDrawable(2130837679);
      localBitmapDrawable.setTileModeXY(Shader.TileMode.REPEAT, Shader.TileMode.REPEAT);
      ((View)localObject2).setBackgroundDrawable(localBitmapDrawable);
      ((RelativeLayout)localObject1).addView((View)localObject2, v.a(-1, -1));
      ((RelativeLayout)localObject1).addView(this.f, v.a(-1, -1));
      localObject2 = new FrameLayout(this);
      ((FrameLayout)localObject2).setBackgroundColor(2130706432);
      ((RelativeLayout)localObject1).addView((View)localObject2, v.a(-1, -1));
      ((FrameLayout)localObject2).setOnTouchListener(new View.OnTouchListener()
      {
        public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
        {
          if ((!ManageSpaceActivity.a(ManageSpaceActivity.this).e.isEmpty()) && (paramMotionEvent.getAction() == 1))
          {
            float f1 = paramMotionEvent.getX();
            float f2 = paramMotionEvent.getY();
            paramView = new int[2];
            ManageSpaceActivity.b(ManageSpaceActivity.this).getLocationOnScreen(paramView);
            int i = paramView[0];
            int j = paramView[1];
            if ((ManageSpaceActivity.b(ManageSpaceActivity.this).f()) || ((f1 > i) && (f1 < i + ManageSpaceActivity.b(ManageSpaceActivity.this).getWidth()) && (f2 > j) && (f2 < ManageSpaceActivity.b(ManageSpaceActivity.this).getHeight() + j)))
              return false;
            if (!ManageSpaceActivity.b(ManageSpaceActivity.this).e.isEmpty())
            {
              while (ManageSpaceActivity.b(ManageSpaceActivity.this).e.size() - 1 > 0)
                ManageSpaceActivity.b(ManageSpaceActivity.this).c((g)ManageSpaceActivity.b(ManageSpaceActivity.this).e.get(0));
              ManageSpaceActivity.b(ManageSpaceActivity.this).a(true);
            }
            return true;
          }
          return false;
        }
      });
      ((FrameLayout)localObject2).setOnClickListener(new View.OnClickListener()
      {
        public void onClick(View paramView)
        {
        }
      });
      this.g = new b(this);
      this.g.setRemoveActionBarExtraHeight(true);
      this.g.setBackgroundView((View)localObject2);
      this.g.setUseAlphaAnimations(true);
      this.g.setBackgroundResource(2130837662);
      ((RelativeLayout)localObject1).addView(this.g, v.a(530, 528));
      this.g.a(e);
      this.g.setDelegate(this);
      this.g.setDrawerLayoutContainer(this.a);
      this.a.setParentActionBarLayout(this.f);
      this.f.setDrawerLayoutContainer(this.a);
      this.f.a(d);
      this.f.setDelegate(this);
      y.a().a(y.ap, new Object[] { this });
      this.c = ConnectionsManager.a().e();
      localObject1 = getIntent();
      if (paramBundle == null)
        break label529;
    }
    label529: for (boolean bool = true; ; bool = false)
    {
      a((Intent)localObject1, false, bool, false);
      b();
      return;
      this.a.addView(this.f, new ViewGroup.LayoutParams(-1, -1));
      break;
    }
  }

  protected void onDestroy()
  {
    super.onDestroy();
    d();
  }

  public void onLowMemory()
  {
    super.onLowMemory();
    this.f.e();
    if (a.c())
      this.g.e();
  }

  protected void onNewIntent(Intent paramIntent)
  {
    super.onNewIntent(paramIntent);
    a(paramIntent, true, false, false);
  }

  protected void onPause()
  {
    super.onPause();
    this.f.c();
    if (a.c())
      this.g.c();
  }

  protected void onResume()
  {
    super.onResume();
    this.f.b();
    if (a.c())
      this.g.b();
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.ManageSpaceActivity
 * JD-Core Version:    0.6.0
 */