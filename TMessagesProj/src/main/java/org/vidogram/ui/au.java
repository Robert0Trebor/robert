package org.vidogram.ui;

import android.app.AlertDialog.Builder;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.graphics.Point;
import android.os.Build.VERSION;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.AbsListView.LayoutParams;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import java.util.ArrayList;
import org.vidogram.messenger.r;
import org.vidogram.messenger.y;
import org.vidogram.messenger.y.b;
import org.vidogram.tgnet.ConnectionsManager;
import org.vidogram.tgnet.c;
import org.vidogram.tgnet.g.bm;
import org.vidogram.tgnet.g.bw;
import org.vidogram.tgnet.g.ct;
import org.vidogram.tgnet.g.cx;
import org.vidogram.ui.a.a.a;
import org.vidogram.ui.a.g;
import org.vidogram.ui.c.ao;
import org.vidogram.ui.c.bf;
import org.vidogram.ui.c.bg;
import org.vidogram.ui.c.w;

public class au extends g
  implements y.b
{
  private a i;
  private ArrayList<g.cx> j = new ArrayList();
  private g.cx k = null;
  private boolean l;
  private LinearLayout m;
  private int n;
  private int o;
  private int p;
  private int q;
  private int r;
  private int s;
  private int t;
  private int u;
  private int v;
  private int w;

  private void b(boolean paramBoolean)
  {
    if (this.l)
      return;
    if (!paramBoolean)
      this.l = true;
    g.bm localbm = new g.bm();
    int i1 = ConnectionsManager.a().a(localbm, new c()
    {
    });
    ConnectionsManager.a().a(i1, this.e);
  }

  private void q()
  {
    this.w = 0;
    if (this.k != null)
    {
      i1 = this.w;
      this.w = (i1 + 1);
      this.n = i1;
      i1 = this.w;
      this.w = (i1 + 1);
      this.o = i1;
      if (!this.j.isEmpty())
        break label132;
      if (this.k == null)
        break label124;
      i1 = this.w;
      this.w = (i1 + 1);
    }
    label124: for (this.v = i1; ; this.v = -1)
    {
      this.p = -1;
      this.q = -1;
      this.r = -1;
      this.s = -1;
      this.t = -1;
      this.u = -1;
      return;
      this.o = -1;
      this.n = -1;
      break;
    }
    label132: this.v = -1;
    int i1 = this.w;
    this.w = (i1 + 1);
    this.p = i1;
    i1 = this.w;
    this.w = (i1 + 1);
    this.q = i1;
    i1 = this.w;
    this.w = (i1 + 1);
    this.r = i1;
    this.s = (this.r + 1);
    this.t = (this.s + this.j.size());
    this.w += this.j.size();
    i1 = this.w;
    this.w = (i1 + 1);
    this.u = i1;
  }

  public View a(Context paramContext)
  {
    this.d.setBackButtonImage(2130837794);
    this.d.setAllowOverlayTitle(true);
    this.d.setTitle(r.a("SessionsTitle", 2131231818));
    this.d.setActionBarMenuOnItemClick(new a.a()
    {
      public void a(int paramInt)
      {
        if (paramInt == -1)
          au.this.d();
      }
    });
    this.i = new a(paramContext);
    this.b = new FrameLayout(paramContext);
    Object localObject1 = (FrameLayout)this.b;
    ((FrameLayout)localObject1).setBackgroundColor(-986896);
    this.m = new LinearLayout(paramContext);
    this.m.setOrientation(1);
    this.m.setGravity(17);
    this.m.setBackgroundResource(2130837783);
    this.m.setLayoutParams(new AbsListView.LayoutParams(-1, org.vidogram.messenger.a.c.y - org.vidogram.ui.a.a.getCurrentActionBarHeight()));
    Object localObject2 = new ImageView(paramContext);
    ((ImageView)localObject2).setImageResource(2130837729);
    this.m.addView((View)localObject2);
    Object localObject3 = (LinearLayout.LayoutParams)((ImageView)localObject2).getLayoutParams();
    ((LinearLayout.LayoutParams)localObject3).width = -2;
    ((LinearLayout.LayoutParams)localObject3).height = -2;
    ((ImageView)localObject2).setLayoutParams((ViewGroup.LayoutParams)localObject3);
    localObject2 = new TextView(paramContext);
    ((TextView)localObject2).setTextColor(-7697782);
    ((TextView)localObject2).setGravity(17);
    ((TextView)localObject2).setTextSize(1, 17.0F);
    ((TextView)localObject2).setTypeface(org.vidogram.messenger.a.a("fonts/rmedium.ttf"));
    ((TextView)localObject2).setText(r.a("NoOtherSessions", 2131231501));
    this.m.addView((View)localObject2);
    localObject3 = (LinearLayout.LayoutParams)((TextView)localObject2).getLayoutParams();
    ((LinearLayout.LayoutParams)localObject3).topMargin = org.vidogram.messenger.a.a(16.0F);
    ((LinearLayout.LayoutParams)localObject3).width = -2;
    ((LinearLayout.LayoutParams)localObject3).height = -2;
    ((LinearLayout.LayoutParams)localObject3).gravity = 17;
    ((TextView)localObject2).setLayoutParams((ViewGroup.LayoutParams)localObject3);
    localObject2 = new TextView(paramContext);
    ((TextView)localObject2).setTextColor(-7697782);
    ((TextView)localObject2).setGravity(17);
    ((TextView)localObject2).setTextSize(1, 17.0F);
    ((TextView)localObject2).setPadding(org.vidogram.messenger.a.a(20.0F), 0, org.vidogram.messenger.a.a(20.0F), 0);
    ((TextView)localObject2).setText(r.a("NoOtherSessionsInfo", 2131231502));
    this.m.addView((View)localObject2);
    localObject3 = (LinearLayout.LayoutParams)((TextView)localObject2).getLayoutParams();
    ((LinearLayout.LayoutParams)localObject3).topMargin = org.vidogram.messenger.a.a(14.0F);
    ((LinearLayout.LayoutParams)localObject3).width = -2;
    ((LinearLayout.LayoutParams)localObject3).height = -2;
    ((LinearLayout.LayoutParams)localObject3).gravity = 17;
    ((TextView)localObject2).setLayoutParams((ViewGroup.LayoutParams)localObject3);
    localObject2 = new FrameLayout(paramContext);
    ((FrameLayout)localObject1).addView((View)localObject2);
    localObject3 = (FrameLayout.LayoutParams)((FrameLayout)localObject2).getLayoutParams();
    ((FrameLayout.LayoutParams)localObject3).width = -1;
    ((FrameLayout.LayoutParams)localObject3).height = -1;
    ((FrameLayout)localObject2).setLayoutParams((ViewGroup.LayoutParams)localObject3);
    ((FrameLayout)localObject2).setOnTouchListener(new View.OnTouchListener()
    {
      public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
      {
        return true;
      }
    });
    ((FrameLayout)localObject2).addView(new ProgressBar(paramContext));
    localObject3 = (FrameLayout.LayoutParams)((FrameLayout)localObject2).getLayoutParams();
    ((FrameLayout.LayoutParams)localObject3).width = -2;
    ((FrameLayout.LayoutParams)localObject3).height = -2;
    ((FrameLayout.LayoutParams)localObject3).gravity = 17;
    ((FrameLayout)localObject2).setLayoutParams((ViewGroup.LayoutParams)localObject3);
    paramContext = new ListView(paramContext);
    paramContext.setDivider(null);
    paramContext.setDividerHeight(0);
    paramContext.setVerticalScrollBarEnabled(false);
    paramContext.setDrawSelectorOnTop(true);
    paramContext.setEmptyView((View)localObject2);
    ((FrameLayout)localObject1).addView(paramContext);
    localObject1 = (FrameLayout.LayoutParams)paramContext.getLayoutParams();
    ((FrameLayout.LayoutParams)localObject1).width = -1;
    ((FrameLayout.LayoutParams)localObject1).height = -1;
    ((FrameLayout.LayoutParams)localObject1).gravity = 48;
    paramContext.setLayoutParams((ViewGroup.LayoutParams)localObject1);
    paramContext.setAdapter(this.i);
    paramContext.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
      {
        if (paramInt == au.a(au.this))
          if (au.this.l() != null);
        do
        {
          return;
          paramAdapterView = new AlertDialog.Builder(au.this.l());
          paramAdapterView.setMessage(r.a("AreYouSureSessions", 2131230884));
          paramAdapterView.setTitle(r.a("AppName", 2131230856));
          paramAdapterView.setPositiveButton(r.a("OK", 2131231604), new DialogInterface.OnClickListener()
          {
            public void onClick(DialogInterface paramDialogInterface, int paramInt)
            {
              paramDialogInterface = new g.ct();
              ConnectionsManager.a().a(paramDialogInterface, new c()
              {
              });
            }
          });
          paramAdapterView.setNegativeButton(r.a("Cancel", 2131230943), null);
          au.this.b(paramAdapterView.create());
          return;
        }
        while ((paramInt < au.b(au.this)) || (paramInt >= au.c(au.this)));
        paramAdapterView = new AlertDialog.Builder(au.this.l());
        paramAdapterView.setMessage(r.a("TerminateSessionQuestion", 2131231890));
        paramAdapterView.setTitle(r.a("AppName", 2131230856));
        paramAdapterView.setPositiveButton(r.a("OK", 2131231604), new DialogInterface.OnClickListener(paramInt)
        {
          public void onClick(DialogInterface paramDialogInterface, int paramInt)
          {
            paramDialogInterface = new ProgressDialog(au.this.l());
            paramDialogInterface.setMessage(r.a("Loading", 2131231394));
            paramDialogInterface.setCanceledOnTouchOutside(false);
            paramDialogInterface.setCancelable(false);
            paramDialogInterface.show();
            g.cx localcx = (g.cx)au.d(au.this).get(this.a - au.b(au.this));
            g.bw localbw = new g.bw();
            localbw.c = localcx.c;
            ConnectionsManager.a().a(localbw, new c(paramDialogInterface, localcx)
            {
            });
          }
        });
        paramAdapterView.setNegativeButton(r.a("Cancel", 2131230943), null);
        au.this.b(paramAdapterView.create());
      }
    });
    return (View)(View)(View)this.b;
  }

  public void a(int paramInt, Object[] paramArrayOfObject)
  {
    if (paramInt == y.M)
      b(true);
  }

  public boolean f()
  {
    super.f();
    q();
    b(false);
    y.a().a(this, y.M);
    return true;
  }

  public void g()
  {
    super.g();
    y.a().b(this, y.M);
  }

  public void i()
  {
    super.i();
    if (this.i != null)
      this.i.notifyDataSetChanged();
  }

  private class a extends org.vidogram.ui.b.a
  {
    private Context b;

    public a(Context arg2)
    {
      Object localObject;
      this.b = localObject;
    }

    public boolean areAllItemsEnabled()
    {
      return false;
    }

    public int getCount()
    {
      if (au.e(au.this))
        return 0;
      return au.f(au.this);
    }

    public Object getItem(int paramInt)
    {
      return null;
    }

    public long getItemId(int paramInt)
    {
      return paramInt;
    }

    public int getItemViewType(int paramInt)
    {
      if (paramInt == au.a(au.this));
      do
      {
        return 0;
        if ((paramInt == au.g(au.this)) || (paramInt == au.h(au.this)))
          return 1;
        if ((paramInt == au.i(au.this)) || (paramInt == au.j(au.this)))
          return 2;
        if (paramInt == au.n(au.this))
          return 3;
      }
      while ((paramInt != au.l(au.this)) && ((paramInt < au.b(au.this)) || (paramInt >= au.c(au.this))));
      return 4;
    }

    public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      boolean bool1 = true;
      boolean bool2 = false;
      int i = getItemViewType(paramInt);
      if (i == 0)
      {
        if (paramView != null)
          break label513;
        paramViewGroup = new bg(this.b);
        paramViewGroup.setBackgroundColor(-1);
      }
      while (true)
      {
        Object localObject = (bg)paramViewGroup;
        paramView = paramViewGroup;
        if (paramInt == au.a(au.this))
        {
          ((bg)localObject).setTextColor(-2404015);
          ((bg)localObject).a(r.a("TerminateAllSessions", 2131231888), false);
          paramView = paramViewGroup;
        }
        return paramView;
        if (i == 1)
          if (paramView != null)
            break label508;
        label353: label503: label508: for (paramViewGroup = new bf(this.b); ; paramViewGroup = paramView)
        {
          if (paramInt == au.g(au.this))
          {
            ((bf)paramViewGroup).setText(r.a("ClearOtherSessionsHelp", 2131231069));
            paramViewGroup.setBackgroundResource(2130837782);
            return paramViewGroup;
          }
          paramView = paramViewGroup;
          if (paramInt != au.h(au.this))
            break;
          ((bf)paramViewGroup).setText(r.a("TerminateSessionInfo", 2131231889));
          paramViewGroup.setBackgroundResource(2130837783);
          return paramViewGroup;
          if (i == 2)
          {
            if (paramView != null)
              break label503;
            paramViewGroup = new w(this.b);
            paramViewGroup.setBackgroundColor(-1);
          }
          while (true)
          {
            if (paramInt == au.i(au.this))
            {
              ((w)paramViewGroup).setText(r.a("CurrentSession", 2131231095));
              return paramViewGroup;
            }
            paramView = paramViewGroup;
            if (paramInt != au.j(au.this))
              break;
            ((w)paramViewGroup).setText(r.a("OtherSessions", 2131231620));
            return paramViewGroup;
            if (i == 3)
            {
              paramView = au.k(au.this).getLayoutParams();
              int j;
              int k;
              int m;
              if (paramView != null)
              {
                i = org.vidogram.messenger.a.a(220.0F);
                j = org.vidogram.messenger.a.c.y;
                k = org.vidogram.ui.a.a.getCurrentActionBarHeight();
                m = org.vidogram.messenger.a.a(128.0F);
                if (Build.VERSION.SDK_INT < 21)
                  break label353;
              }
              for (paramInt = org.vidogram.messenger.a.a; ; paramInt = 0)
              {
                paramView.height = Math.max(i, j - k - m - paramInt);
                au.k(au.this).setLayoutParams(paramView);
                return au.k(au.this);
              }
            }
            if (i == 4)
            {
              if (paramView == null)
              {
                paramView = new ao(this.b);
                paramView.setBackgroundColor(-1);
              }
              while (true)
              {
                if (paramInt == au.l(au.this))
                {
                  paramViewGroup = (ao)paramView;
                  localObject = au.m(au.this);
                  bool1 = bool2;
                  if (!au.d(au.this).isEmpty())
                    bool1 = true;
                  paramViewGroup.a((g.cx)localObject, bool1);
                  return paramView;
                }
                paramViewGroup = (ao)paramView;
                localObject = (g.cx)au.d(au.this).get(paramInt - au.b(au.this));
                if (paramInt != au.c(au.this) - 1);
                while (true)
                {
                  paramViewGroup.a((g.cx)localObject, bool1);
                  return paramView;
                  bool1 = false;
                }
              }
            }
            return paramView;
            paramViewGroup = paramView;
          }
        }
        label513: paramViewGroup = paramView;
      }
    }

    public int getViewTypeCount()
    {
      return 5;
    }

    public boolean hasStableIds()
    {
      return false;
    }

    public boolean isEmpty()
    {
      return au.e(au.this);
    }

    public boolean isEnabled(int paramInt)
    {
      return (paramInt == au.a(au.this)) || ((paramInt >= au.b(au.this)) && (paramInt < au.c(au.this)));
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.au
 * JD-Core Version:    0.6.0
 */