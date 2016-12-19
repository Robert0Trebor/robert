package org.vidogram.ui;

import android.app.AlertDialog.Builder;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ListView;
import java.util.ArrayList;
import org.vidogram.messenger.ApplicationLoader;
import org.vidogram.messenger.f;
import org.vidogram.messenger.r;
import org.vidogram.messenger.v;
import org.vidogram.messenger.y.b;
import org.vidogram.tgnet.ConnectionsManager;
import org.vidogram.tgnet.g.ba;
import org.vidogram.tgnet.g.cb;
import org.vidogram.tgnet.g.lf;
import org.vidogram.tgnet.g.lg;
import org.vidogram.tgnet.g.lh;
import org.vidogram.tgnet.g.li;
import org.vidogram.tgnet.g.lj;
import org.vidogram.tgnet.g.lk;
import org.vidogram.tgnet.g.ll;
import org.vidogram.tgnet.g.sb;
import org.vidogram.tgnet.g.sc;
import org.vidogram.tgnet.g.sd;
import org.vidogram.tgnet.g.se;
import org.vidogram.tgnet.g.vw;
import org.vidogram.ui.a.a.a;
import org.vidogram.ui.a.g;
import org.vidogram.ui.c.am;
import org.vidogram.ui.c.bf;
import org.vidogram.ui.c.bg;
import org.vidogram.ui.c.w;

public class an extends g
  implements y.b
{
  private a i;
  private View j;
  private int k = 0;
  private ArrayList<Integer> l;
  private ArrayList<Integer> m;
  private int n = -1;
  private boolean o;
  private boolean p;
  private int q;
  private int r;
  private int s;
  private int t;
  private int u;
  private int v;
  private int w;
  private int x;
  private int y;
  private int z;

  public an(boolean paramBoolean)
  {
    this.o = paramBoolean;
  }

  private void q()
  {
    g.cb localcb = new g.cb();
    if (this.o)
      localcb.c = new g.lf();
    Object localObject1;
    int i1;
    Object localObject2;
    while ((this.k != 0) && (this.l.size() > 0))
    {
      localObject1 = new g.lj();
      i1 = 0;
      while (true)
        if (i1 < this.l.size())
        {
          localObject2 = v.a().a((Integer)this.l.get(i1));
          if (localObject2 != null)
          {
            localObject2 = v.a((g.vw)localObject2);
            if (localObject2 != null)
              ((g.lj)localObject1).b.add(localObject2);
          }
          i1 += 1;
          continue;
          localcb.c = new g.lg();
          break;
        }
      localcb.d.add(localObject1);
    }
    if ((this.k != 1) && (this.m.size() > 0))
    {
      localObject1 = new g.ll();
      i1 = 0;
      while (i1 < this.m.size())
      {
        localObject2 = v.a().a((Integer)this.m.get(i1));
        if (localObject2 != null)
        {
          localObject2 = v.a((g.vw)localObject2);
          if (localObject2 != null)
            ((g.ll)localObject1).b.add(localObject2);
        }
        i1 += 1;
      }
      localcb.d.add(localObject1);
    }
    if (this.k == 0)
      localcb.d.add(new g.lh());
    while (true)
    {
      localObject1 = null;
      if (l() != null)
      {
        localObject1 = new ProgressDialog(l());
        ((ProgressDialog)localObject1).setMessage(r.a("Loading", 2131231394));
        ((ProgressDialog)localObject1).setCanceledOnTouchOutside(false);
        ((ProgressDialog)localObject1).setCancelable(false);
        ((ProgressDialog)localObject1).show();
      }
      ConnectionsManager.a().a(localcb, new org.vidogram.tgnet.c((ProgressDialog)localObject1)
      {
      }
      , 2);
      return;
      if (this.k == 1)
      {
        localcb.d.add(new g.lk());
        continue;
      }
      if (this.k != 2)
        continue;
      localcb.d.add(new g.li());
    }
  }

  private void r()
  {
    this.l = new ArrayList();
    this.m = new ArrayList();
    ArrayList localArrayList = f.a().a(this.o);
    if (localArrayList.size() == 0)
    {
      this.k = 1;
      return;
    }
    int i2 = 0;
    int i1 = -1;
    if (i2 < localArrayList.size())
    {
      g.ba localba = (g.ba)localArrayList.get(i2);
      if ((localba instanceof g.sc))
        this.l.addAll(localba.b);
      while (true)
      {
        i2 += 1;
        break;
        if ((localba instanceof g.se))
        {
          this.m.addAll(localba.b);
          continue;
        }
        if ((localba instanceof g.sb))
        {
          i1 = 0;
          continue;
        }
        if ((localba instanceof g.sd))
        {
          i1 = 1;
          continue;
        }
        i1 = 2;
      }
    }
    if ((i1 == 0) || ((i1 == -1) && (this.m.size() > 0)))
      this.k = 0;
    while (true)
    {
      if (this.j != null)
        this.j.setVisibility(8);
      s();
      return;
      if ((i1 == 2) || ((i1 == -1) && (this.m.size() > 0) && (this.l.size() > 0)))
      {
        this.k = 2;
        continue;
      }
      if ((i1 != 1) && ((i1 != -1) || (this.l.size() <= 0)))
        continue;
      this.k = 1;
    }
  }

  private void s()
  {
    this.z = 0;
    int i1 = this.z;
    this.z = (i1 + 1);
    this.q = i1;
    i1 = this.z;
    this.z = (i1 + 1);
    this.r = i1;
    i1 = this.z;
    this.z = (i1 + 1);
    this.s = i1;
    if (this.o)
    {
      this.t = -1;
      i1 = this.z;
      this.z = (i1 + 1);
      this.u = i1;
      i1 = this.z;
      this.z = (i1 + 1);
      this.v = i1;
      if ((this.k != 1) && (this.k != 2))
        break label219;
      i1 = this.z;
      this.z = (i1 + 1);
      this.w = i1;
      label135: if ((this.k != 0) && (this.k != 2))
        break label227;
      i1 = this.z;
      this.z = (i1 + 1);
    }
    label219: label227: for (this.x = i1; ; this.x = -1)
    {
      i1 = this.z;
      this.z = (i1 + 1);
      this.y = i1;
      if (this.i != null)
        this.i.notifyDataSetChanged();
      return;
      i1 = this.z;
      this.z = (i1 + 1);
      this.t = i1;
      break;
      this.w = -1;
      break label135;
    }
  }

  public View a(Context paramContext)
  {
    this.d.setBackButtonImage(2130837794);
    this.d.setAllowOverlayTitle(true);
    if (this.o)
      this.d.setTitle(r.a("GroupsAndChannels", 2131231286));
    while (true)
    {
      this.d.setActionBarMenuOnItemClick(new a.a()
      {
        public void a(int paramInt)
        {
          if (paramInt == -1)
            an.this.d();
          do
            return;
          while ((paramInt != 1) || (an.this.l() == null));
          if ((an.a(an.this) != 0) && (!an.b(an.this)))
          {
            SharedPreferences localSharedPreferences = ApplicationLoader.a.getSharedPreferences("mainconfig", 0);
            if (!localSharedPreferences.getBoolean("privacyAlertShowed", false))
            {
              AlertDialog.Builder localBuilder = new AlertDialog.Builder(an.this.l());
              if (an.b(an.this))
                localBuilder.setMessage(r.a("WhoCanAddMeInfo", 2131231959));
              while (true)
              {
                localBuilder.setTitle(r.a("AppName", 2131230856));
                localBuilder.setPositiveButton(r.a("OK", 2131231604), new DialogInterface.OnClickListener(localSharedPreferences)
                {
                  public void onClick(DialogInterface paramDialogInterface, int paramInt)
                  {
                    an.c(an.this);
                    this.a.edit().putBoolean("privacyAlertShowed", true).commit();
                  }
                });
                localBuilder.setNegativeButton(r.a("Cancel", 2131230943), null);
                an.this.b(localBuilder.create());
                return;
                localBuilder.setMessage(r.a("CustomHelp", 2131231101));
              }
            }
          }
          an.c(an.this);
        }
      });
      this.j = this.d.a().b(1, 2130837825, org.vidogram.messenger.a.a(56.0F));
      this.j.setVisibility(8);
      this.i = new a(paramContext);
      this.b = new FrameLayout(paramContext);
      Object localObject = (FrameLayout)this.b;
      ((FrameLayout)localObject).setBackgroundColor(-986896);
      paramContext = new ListView(paramContext);
      paramContext.setDivider(null);
      paramContext.setDividerHeight(0);
      paramContext.setVerticalScrollBarEnabled(false);
      paramContext.setDrawSelectorOnTop(true);
      ((FrameLayout)localObject).addView(paramContext);
      localObject = (FrameLayout.LayoutParams)paramContext.getLayoutParams();
      ((FrameLayout.LayoutParams)localObject).width = -1;
      ((FrameLayout.LayoutParams)localObject).height = -1;
      ((FrameLayout.LayoutParams)localObject).gravity = 48;
      paramContext.setLayoutParams((ViewGroup.LayoutParams)localObject);
      paramContext.setAdapter(this.i);
      paramContext.setOnItemClickListener(new AdapterView.OnItemClickListener()
      {
        public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
        {
          boolean bool1 = true;
          int i;
          if ((paramInt == an.d(an.this)) || (paramInt == an.e(an.this)) || (paramInt == an.f(an.this)))
          {
            i = an.a(an.this);
            if (paramInt == an.d(an.this))
            {
              i = 1;
              if (i != an.a(an.this))
                break label106;
            }
          }
          label106: 
          do
          {
            return;
            if (paramInt == an.e(an.this))
            {
              i = 0;
              break;
            }
            if (paramInt != an.f(an.this))
              break;
            i = 2;
            break;
            an.a(an.this, true);
            an.g(an.this).setVisibility(0);
            an.a(an.this, an.a(an.this));
            an.b(an.this, i);
            an.h(an.this);
            return;
          }
          while ((paramInt != an.i(an.this)) && (paramInt != an.j(an.this)));
          if (paramInt == an.i(an.this))
          {
            paramAdapterView = an.k(an.this);
            if (!paramAdapterView.isEmpty())
              break label297;
            paramView = new Bundle();
            if (paramInt != an.i(an.this))
              break label291;
          }
          label291: for (paramAdapterView = "isNeverShare"; ; paramAdapterView = "isAlwaysShare")
          {
            paramView.putBoolean(paramAdapterView, true);
            paramView.putBoolean("isGroup", an.b(an.this));
            paramAdapterView = new y(paramView);
            paramAdapterView.a(new y.a(paramInt)
            {
              public void a(ArrayList<Integer> paramArrayList)
              {
                if (this.a == an.i(an.this))
                {
                  an.a(an.this, paramArrayList);
                  i = 0;
                  while (i < an.k(an.this).size())
                  {
                    an.l(an.this).remove(an.k(an.this).get(i));
                    i += 1;
                  }
                }
                an.b(an.this, paramArrayList);
                int i = 0;
                while (i < an.l(an.this).size())
                {
                  an.k(an.this).remove(an.l(an.this).get(i));
                  i += 1;
                }
                an.g(an.this).setVisibility(0);
                an.a(an.this, -1);
                an.m(an.this).notifyDataSetChanged();
              }
            });
            an.this.a(paramAdapterView);
            return;
            paramAdapterView = an.l(an.this);
            break;
          }
          label297: boolean bool2 = an.b(an.this);
          if (paramInt == an.j(an.this));
          while (true)
          {
            paramAdapterView = new ap(paramAdapterView, bool2, bool1);
            paramAdapterView.a(new ap.b(paramInt)
            {
              public void a(ArrayList<Integer> paramArrayList, boolean paramBoolean)
              {
                int i;
                if (this.a == an.i(an.this))
                {
                  an.a(an.this, paramArrayList);
                  if (paramBoolean)
                  {
                    i = 0;
                    while (i < an.k(an.this).size())
                    {
                      an.l(an.this).remove(an.k(an.this).get(i));
                      i += 1;
                    }
                  }
                }
                else
                {
                  an.b(an.this, paramArrayList);
                  if (paramBoolean)
                  {
                    i = 0;
                    while (i < an.l(an.this).size())
                    {
                      an.k(an.this).remove(an.l(an.this).get(i));
                      i += 1;
                    }
                  }
                }
                an.g(an.this).setVisibility(0);
                an.m(an.this).notifyDataSetChanged();
              }
            });
            an.this.a(paramAdapterView);
            return;
            bool1 = false;
          }
        }
      });
      return this.b;
      this.d.setTitle(r.a("PrivacyLastSeen", 2131231700));
    }
  }

  public void a(int paramInt, Object[] paramArrayOfObject)
  {
    if (paramInt == org.vidogram.messenger.y.D)
      r();
  }

  public boolean f()
  {
    super.f();
    r();
    s();
    org.vidogram.messenger.y.a().a(this, org.vidogram.messenger.y.D);
    return true;
  }

  public void g()
  {
    super.g();
    org.vidogram.messenger.y.a().b(this, org.vidogram.messenger.y.D);
  }

  public void i()
  {
    super.i();
    this.n = -1;
    this.p = false;
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
      return an.n(an.this);
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
      if ((paramInt == an.j(an.this)) || (paramInt == an.i(an.this)));
      do
      {
        return 0;
        if ((paramInt == an.p(an.this)) || (paramInt == an.o(an.this)))
          return 1;
        if ((paramInt == an.q(an.this)) || (paramInt == an.r(an.this)))
          return 2;
      }
      while ((paramInt != an.e(an.this)) && (paramInt != an.f(an.this)) && (paramInt != an.d(an.this)));
      return 3;
    }

    public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      boolean bool2 = true;
      boolean bool1 = true;
      int i = getItemViewType(paramInt);
      if (i == 0)
      {
        if (paramView != null)
          break label826;
        paramViewGroup = new bg(this.b);
        paramViewGroup.setBackgroundColor(-1);
      }
      while (true)
      {
        Object localObject = (bg)paramViewGroup;
        String str;
        if (paramInt == an.j(an.this))
          if (an.l(an.this).size() != 0)
          {
            paramView = r.b("Users", an.l(an.this).size());
            if (!an.b(an.this))
              break label146;
            str = r.a("AlwaysAllow", 2131230838);
            if (an.i(an.this) == -1)
              break label140;
            label115: ((bg)localObject).a(str, paramView, bool1);
            paramView = paramViewGroup;
          }
        label140: label146: 
        do
        {
          return paramView;
          paramView = r.a("EmpryUsersPlaceholder", 2131231160);
          break;
          bool1 = false;
          break label115;
          str = r.a("AlwaysShareWith", 2131230840);
          if (an.i(an.this) != -1);
          for (bool1 = bool2; ; bool1 = false)
          {
            ((bg)localObject).a(str, paramView, bool1);
            return paramViewGroup;
          }
          paramView = paramViewGroup;
        }
        while (paramInt != an.i(an.this));
        if (an.k(an.this).size() != 0);
        for (paramView = r.b("Users", an.k(an.this).size()); an.b(an.this); paramView = r.a("EmpryUsersPlaceholder", 2131231160))
        {
          ((bg)localObject).a(r.a("NeverAllow", 2131231470), paramView, false);
          return paramViewGroup;
        }
        ((bg)localObject).a(r.a("NeverShareWith", 2131231472), paramView, false);
        return paramViewGroup;
        if (i == 1)
        {
          if (paramView != null)
            break label821;
          paramViewGroup = new bf(this.b);
          paramViewGroup.setBackgroundColor(-1);
        }
        while (true)
        {
          if (paramInt == an.o(an.this))
          {
            if (an.b(an.this))
              ((bf)paramViewGroup).setText(r.a("WhoCanAddMeInfo", 2131231959));
            while (true)
            {
              paramViewGroup.setBackgroundResource(2130837782);
              return paramViewGroup;
              ((bf)paramViewGroup).setText(r.a("CustomHelp", 2131231101));
            }
          }
          paramView = paramViewGroup;
          if (paramInt != an.p(an.this))
            break;
          if (an.b(an.this))
            ((bf)paramViewGroup).setText(r.a("CustomShareInfo", 2131231102));
          while (true)
          {
            paramViewGroup.setBackgroundResource(2130837783);
            return paramViewGroup;
            ((bf)paramViewGroup).setText(r.a("CustomShareSettingsHelp", 2131231103));
          }
          if (i == 2)
          {
            if (paramView != null)
              break label816;
            paramViewGroup = new w(this.b);
            paramViewGroup.setBackgroundColor(-1);
          }
          while (true)
          {
            if (paramInt == an.q(an.this))
            {
              if (an.b(an.this))
              {
                ((w)paramViewGroup).setText(r.a("WhoCanAddMe", 2131231958));
                return paramViewGroup;
              }
              ((w)paramViewGroup).setText(r.a("LastSeenTitle", 2131231373));
              return paramViewGroup;
            }
            paramView = paramViewGroup;
            if (paramInt != an.r(an.this))
              break;
            ((w)paramViewGroup).setText(r.a("AddExceptions", 2131230816));
            return paramViewGroup;
            if (i == 3)
            {
              if (paramView == null)
              {
                paramViewGroup = new am(this.b);
                paramViewGroup.setBackgroundColor(-1);
              }
              while (true)
              {
                localObject = (am)paramViewGroup;
                if (paramInt == an.e(an.this))
                {
                  paramView = r.a("LastSeenEverybody", 2131231355);
                  if (an.s(an.this) == 0)
                  {
                    bool1 = true;
                    label606: ((am)localObject).a(paramView, bool1, true);
                    paramInt = 0;
                  }
                }
                while (true)
                {
                  if (an.s(an.this) == paramInt)
                  {
                    ((am)localObject).a(false, an.t(an.this));
                    return paramViewGroup;
                    bool1 = false;
                    break label606;
                    if (paramInt == an.f(an.this))
                    {
                      paramView = r.a("LastSeenContacts", 2131231350);
                      if (an.s(an.this) == 2)
                      {
                        bool1 = true;
                        label682: if (an.d(an.this) == -1)
                          break label717;
                      }
                      label717: for (bool2 = true; ; bool2 = false)
                      {
                        ((am)localObject).a(paramView, bool1, bool2);
                        paramInt = 2;
                        break;
                        bool1 = false;
                        break label682;
                      }
                    }
                    if (paramInt == an.d(an.this))
                    {
                      paramView = r.a("LastSeenNobody", 2131231370);
                      if (an.s(an.this) == 1);
                      for (bool1 = true; ; bool1 = false)
                      {
                        ((am)localObject).a(paramView, bool1, false);
                        paramInt = 1;
                        break;
                      }
                    }
                  }
                  else
                  {
                    paramView = paramViewGroup;
                    if (an.a(an.this) != paramInt)
                      break;
                    ((am)localObject).a(true, an.t(an.this));
                    return paramViewGroup;
                  }
                  paramInt = 0;
                }
                paramViewGroup = paramView;
              }
            }
            return paramView;
            label816: paramViewGroup = paramView;
          }
          label821: paramViewGroup = paramView;
        }
        label826: paramViewGroup = paramView;
      }
    }

    public int getViewTypeCount()
    {
      return 4;
    }

    public boolean hasStableIds()
    {
      return false;
    }

    public boolean isEmpty()
    {
      return false;
    }

    public boolean isEnabled(int paramInt)
    {
      return (paramInt == an.d(an.this)) || (paramInt == an.e(an.this)) || (paramInt == an.f(an.this)) || (paramInt == an.i(an.this)) || (paramInt == an.j(an.this));
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.an
 * JD-Core Version:    0.6.0
 */