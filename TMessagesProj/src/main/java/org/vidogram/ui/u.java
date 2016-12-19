package org.vidogram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import org.vidogram.messenger.r;
import org.vidogram.ui.Components.x;
import org.vidogram.ui.a.a.a;
import org.vidogram.ui.a.c;
import org.vidogram.ui.a.d;
import org.vidogram.ui.a.d.b;
import org.vidogram.ui.b.g.a;
import org.vidogram.ui.b.h;

public class u extends org.vidogram.ui.a.g
{
  private x i;
  private TextView j;
  private org.vidogram.ui.b.g k;
  private h l;
  private boolean m;
  private boolean n;
  private a o;

  public View a(Context paramContext)
  {
    this.d.setBackButtonImage(2130837794);
    this.d.setAllowOverlayTitle(true);
    this.d.setTitle(r.a("ChooseCountry", 2131231062));
    this.d.setActionBarMenuOnItemClick(new a.a()
    {
      public void a(int paramInt)
      {
        if (paramInt == -1)
          u.this.d();
      }
    });
    this.d.a().b(0, 2130837806).d(true).a(new d.b()
    {
      public void a()
      {
        u.a(u.this, true);
      }

      public void a(EditText paramEditText)
      {
        paramEditText = paramEditText.getText().toString();
        u.a(u.this).a(paramEditText);
        if (paramEditText.length() != 0)
        {
          u.b(u.this, true);
          if (u.c(u.this) != null)
          {
            u.c(u.this).setAdapter(u.a(u.this));
            u.c(u.this).setFastScrollAlwaysVisible(false);
            u.c(u.this).setFastScrollEnabled(false);
            u.c(u.this).setVerticalScrollBarEnabled(true);
          }
          if (u.d(u.this) == null);
        }
      }

      public void c()
      {
        u.a(u.this).a(null);
        u.a(u.this, false);
        u.b(u.this, false);
        u.c(u.this).setAdapter(u.b(u.this));
        u.c(u.this).setFastScrollAlwaysVisible(true);
        u.c(u.this).setFastScrollEnabled(true);
        u.c(u.this).setVerticalScrollBarEnabled(false);
        u.d(u.this).setText(r.a("ChooseCountry", 2131231062));
      }
    }).getSearchField().setHint(r.a("Search", 2131231766));
    this.n = false;
    this.m = false;
    this.k = new org.vidogram.ui.b.g(paramContext);
    this.l = new h(paramContext, this.k.b());
    this.b = new FrameLayout(paramContext);
    LinearLayout localLinearLayout = new LinearLayout(paramContext);
    localLinearLayout.setVisibility(4);
    localLinearLayout.setOrientation(1);
    ((FrameLayout)this.b).addView(localLinearLayout);
    Object localObject = (FrameLayout.LayoutParams)localLinearLayout.getLayoutParams();
    ((FrameLayout.LayoutParams)localObject).width = -1;
    ((FrameLayout.LayoutParams)localObject).height = -1;
    ((FrameLayout.LayoutParams)localObject).gravity = 48;
    localLinearLayout.setLayoutParams((ViewGroup.LayoutParams)localObject);
    localLinearLayout.setOnTouchListener(new View.OnTouchListener()
    {
      public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
      {
        return true;
      }
    });
    this.j = new TextView(paramContext);
    this.j.setTextColor(-8355712);
    this.j.setTextSize(20.0F);
    this.j.setGravity(17);
    this.j.setText(r.a("NoResult", 2131231509));
    localLinearLayout.addView(this.j);
    localObject = (LinearLayout.LayoutParams)this.j.getLayoutParams();
    ((LinearLayout.LayoutParams)localObject).width = -1;
    ((LinearLayout.LayoutParams)localObject).height = -1;
    ((LinearLayout.LayoutParams)localObject).weight = 0.5F;
    this.j.setLayoutParams((ViewGroup.LayoutParams)localObject);
    localObject = new FrameLayout(paramContext);
    localLinearLayout.addView((View)localObject);
    LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)((FrameLayout)localObject).getLayoutParams();
    localLayoutParams.width = -1;
    localLayoutParams.height = -1;
    localLayoutParams.weight = 0.5F;
    ((FrameLayout)localObject).setLayoutParams(localLayoutParams);
    this.i = new x(paramContext);
    this.i.setEmptyView(localLinearLayout);
    this.i.setVerticalScrollBarEnabled(false);
    this.i.setDivider(null);
    this.i.setDividerHeight(0);
    this.i.setFastScrollEnabled(true);
    this.i.setScrollBarStyle(33554432);
    this.i.setAdapter(this.k);
    this.i.setFastScrollAlwaysVisible(true);
    paramContext = this.i;
    if (r.a);
    for (int i1 = 1; ; i1 = 2)
    {
      paramContext.setVerticalScrollbarPosition(i1);
      ((FrameLayout)this.b).addView(this.i);
      paramContext = (FrameLayout.LayoutParams)this.i.getLayoutParams();
      paramContext.width = -1;
      paramContext.height = -1;
      this.i.setLayoutParams(paramContext);
      this.i.setOnItemClickListener(new AdapterView.OnItemClickListener()
      {
        public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
        {
          if ((u.e(u.this)) && (u.f(u.this)))
          {
            paramAdapterView = u.a(u.this).a(paramInt);
            if (paramInt >= 0)
              break label91;
          }
          label91: 
          do
          {
            int i;
            int j;
            do
            {
              return;
              i = u.b(u.this).a(paramInt);
              j = u.b(u.this).b(paramInt);
            }
            while ((j < 0) || (i < 0));
            paramAdapterView = u.b(u.this).d(i, j);
            break;
            u.this.d();
          }
          while ((paramAdapterView == null) || (u.g(u.this) == null));
          u.g(u.this).a(paramAdapterView.a);
        }
      });
      this.i.setOnScrollListener(new AbsListView.OnScrollListener()
      {
        public void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
        {
          if (paramAbsListView.isFastScrollEnabled())
            org.vidogram.messenger.a.d(paramAbsListView);
        }

        public void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
        {
          if ((paramInt == 1) && (u.e(u.this)) && (u.f(u.this)))
            org.vidogram.messenger.a.b(u.this.l().getCurrentFocus());
        }
      });
      return this.b;
    }
  }

  public void a(a parama)
  {
    this.o = parama;
  }

  public boolean f()
  {
    return super.f();
  }

  public void g()
  {
    super.g();
  }

  public void i()
  {
    super.i();
    if (this.k != null)
      this.k.notifyDataSetChanged();
  }

  public static abstract interface a
  {
    public abstract void a(String paramString);
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.u
 * JD-Core Version:    0.6.0
 */