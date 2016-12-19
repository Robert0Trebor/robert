package org.vidogram.ui;

import android.app.AlertDialog.Builder;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.ListView;
import java.util.ArrayList;
import org.vidogram.messenger.ApplicationLoader;
import org.vidogram.messenger.ad;
import org.vidogram.messenger.f;
import org.vidogram.messenger.r;
import org.vidogram.messenger.y;
import org.vidogram.messenger.y.b;
import org.vidogram.tgnet.ConnectionsManager;
import org.vidogram.tgnet.c;
import org.vidogram.tgnet.g.ba;
import org.vidogram.tgnet.g.bg;
import org.vidogram.tgnet.g.ca;
import org.vidogram.tgnet.g.sb;
import org.vidogram.tgnet.g.sc;
import org.vidogram.tgnet.g.sd;
import org.vidogram.tgnet.g.se;
import org.vidogram.ui.a.a.a;
import org.vidogram.ui.a.g;
import org.vidogram.ui.c.ba;
import org.vidogram.ui.c.bf;
import org.vidogram.ui.c.bg;
import org.vidogram.ui.c.w;

public class ao extends g
  implements y.b
{
  private a i;
  private int j;
  private int k;
  private int l;
  private int m;
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
  private int x;
  private int y;
  private int z;

  private String b(boolean paramBoolean)
  {
    ArrayList localArrayList = f.a().a(paramBoolean);
    if (localArrayList.size() == 0)
      return r.a("LastSeenNobody", 2131231370);
    int i2 = 0;
    int i4 = 0;
    int i3 = 0;
    int i1 = -1;
    if (i2 < localArrayList.size())
    {
      g.ba localba = (g.ba)localArrayList.get(i2);
      if ((localba instanceof g.sc))
        i3 += localba.b.size();
      while (true)
      {
        i2 += 1;
        break;
        if ((localba instanceof g.se))
        {
          i4 += localba.b.size();
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
    if ((i1 == 0) || ((i1 == -1) && (i4 > 0)))
    {
      if (i4 == 0)
        return r.a("LastSeenEverybody", 2131231355);
      return r.a("LastSeenEverybodyMinus", 2131231356, new Object[] { Integer.valueOf(i4) });
    }
    if ((i1 == 2) || ((i1 == -1) && (i4 > 0) && (i3 > 0)))
    {
      if ((i3 == 0) && (i4 == 0))
        return r.a("LastSeenContacts", 2131231350);
      if ((i3 != 0) && (i4 != 0))
        return r.a("LastSeenContactsMinusPlus", 2131231352, new Object[] { Integer.valueOf(i4), Integer.valueOf(i3) });
      if (i4 != 0)
        return r.a("LastSeenContactsMinus", 2131231351, new Object[] { Integer.valueOf(i4) });
      return r.a("LastSeenContactsPlus", 2131231353, new Object[] { Integer.valueOf(i3) });
    }
    if ((i1 == 1) || (i3 > 0))
    {
      if (i3 == 0)
        return r.a("LastSeenNobody", 2131231370);
      return r.a("LastSeenNobodyPlus", 2131231371, new Object[] { Integer.valueOf(i3) });
    }
    return "unknown";
  }

  public View a(Context paramContext)
  {
    this.d.setBackButtonImage(2130837794);
    this.d.setAllowOverlayTitle(true);
    this.d.setTitle(r.a("PrivacySettings", 2131231703));
    this.d.setActionBarMenuOnItemClick(new a.a()
    {
      public void a(int paramInt)
      {
        if (paramInt == -1)
          ao.this.d();
      }
    });
    this.i = new a(paramContext);
    this.b = new FrameLayout(paramContext);
    FrameLayout localFrameLayout = (FrameLayout)this.b;
    localFrameLayout.setBackgroundColor(-986896);
    paramContext = new ListView(paramContext);
    paramContext.setDivider(null);
    paramContext.setDividerHeight(0);
    paramContext.setVerticalScrollBarEnabled(false);
    paramContext.setDrawSelectorOnTop(true);
    localFrameLayout.addView(paramContext, org.vidogram.ui.Components.v.a(-1, -1.0F));
    paramContext.setAdapter(this.i);
    paramContext.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
      {
        boolean bool = true;
        if (paramInt == ao.a(ao.this))
          ao.this.a(new d());
        while (true)
        {
          return;
          if (paramInt == ao.b(ao.this))
          {
            ao.this.a(new au());
            return;
          }
          if (paramInt == ao.c(ao.this))
          {
            if (ao.this.l() == null)
              continue;
            paramAdapterView = new AlertDialog.Builder(ao.this.l());
            paramAdapterView.setTitle(r.a("DeleteAccountTitle", 2131231121));
            paramView = r.b("Months", 1);
            String str1 = r.b("Months", 3);
            String str2 = r.b("Months", 6);
            String str3 = r.b("Years", 1);
            1 local1 = new DialogInterface.OnClickListener()
            {
              public void onClick(DialogInterface paramDialogInterface, int paramInt)
              {
                if (paramInt == 0)
                  paramInt = 30;
                while (true)
                {
                  paramDialogInterface = new ProgressDialog(ao.this.l());
                  paramDialogInterface.setMessage(r.a("Loading", 2131231394));
                  paramDialogInterface.setCanceledOnTouchOutside(false);
                  paramDialogInterface.setCancelable(false);
                  paramDialogInterface.show();
                  g.ca localca = new g.ca();
                  localca.c = new g.bg();
                  localca.c.c = paramInt;
                  ConnectionsManager.a().a(localca, new c(paramDialogInterface, localca)
                  {
                  });
                  return;
                  if (paramInt == 1)
                  {
                    paramInt = 90;
                    continue;
                  }
                  if (paramInt == 2)
                  {
                    paramInt = 182;
                    continue;
                  }
                  if (paramInt == 3)
                  {
                    paramInt = 365;
                    continue;
                  }
                  paramInt = 0;
                }
              }
            };
            paramAdapterView.setItems(new CharSequence[] { paramView, str1, str2, str3 }, local1);
            paramAdapterView.setNegativeButton(r.a("Cancel", 2131230943), null);
            ao.this.b(paramAdapterView.create());
            return;
          }
          if (paramInt == ao.d(ao.this))
          {
            ao.this.a(new an(false));
            return;
          }
          if (paramInt == ao.e(ao.this))
          {
            ao.this.a(new an(true));
            return;
          }
          if (paramInt == ao.f(ao.this))
          {
            ao.this.a(new az(0));
            return;
          }
          if (paramInt == ao.g(ao.this))
          {
            if (ad.i.length() > 0)
            {
              ao.this.a(new ai(2));
              return;
            }
            ao.this.a(new ai(0));
            return;
          }
          if (paramInt != ao.h(ao.this))
            continue;
          if (org.vidogram.messenger.v.a().x != 1)
            break;
          org.vidogram.messenger.v.a().x = 0;
          ApplicationLoader.a.getSharedPreferences("mainconfig", 0).edit().putInt("secretWebpage2", org.vidogram.messenger.v.a().x).commit();
          if (!(paramView instanceof ba))
            continue;
          paramAdapterView = (ba)paramView;
          if (org.vidogram.messenger.v.a().x != 1)
            break label441;
        }
        while (true)
        {
          paramAdapterView.setChecked(bool);
          return;
          org.vidogram.messenger.v.a().x = 1;
          break;
          label441: bool = false;
        }
      }
    });
    return this.b;
  }

  public void a(int paramInt, Object[] paramArrayOfObject)
  {
    if ((paramInt == y.D) && (this.i != null))
      this.i.notifyDataSetChanged();
  }

  public boolean f()
  {
    super.f();
    f.a().l();
    this.z = 0;
    int i1 = this.z;
    this.z = (i1 + 1);
    this.j = i1;
    i1 = this.z;
    this.z = (i1 + 1);
    this.k = i1;
    i1 = this.z;
    this.z = (i1 + 1);
    this.l = i1;
    i1 = this.z;
    this.z = (i1 + 1);
    this.m = i1;
    i1 = this.z;
    this.z = (i1 + 1);
    this.n = i1;
    i1 = this.z;
    this.z = (i1 + 1);
    this.o = i1;
    i1 = this.z;
    this.z = (i1 + 1);
    this.r = i1;
    i1 = this.z;
    this.z = (i1 + 1);
    this.q = i1;
    i1 = this.z;
    this.z = (i1 + 1);
    this.p = i1;
    i1 = this.z;
    this.z = (i1 + 1);
    this.s = i1;
    i1 = this.z;
    this.z = (i1 + 1);
    this.t = i1;
    i1 = this.z;
    this.z = (i1 + 1);
    this.u = i1;
    i1 = this.z;
    this.z = (i1 + 1);
    this.v = i1;
    if (org.vidogram.messenger.v.a().x != 1)
    {
      i1 = this.z;
      this.z = (i1 + 1);
      this.w = i1;
      i1 = this.z;
      this.z = (i1 + 1);
      this.x = i1;
      i1 = this.z;
      this.z = (i1 + 1);
    }
    for (this.y = i1; ; this.y = -1)
    {
      y.a().a(this, y.D);
      return true;
      this.w = -1;
      this.x = -1;
    }
  }

  public void g()
  {
    super.g();
    y.a().b(this, y.D);
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
      return ao.i(ao.this);
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
      if ((paramInt == ao.d(ao.this)) || (paramInt == ao.a(ao.this)) || (paramInt == ao.c(ao.this)) || (paramInt == ao.b(ao.this)) || (paramInt == ao.f(ao.this)) || (paramInt == ao.g(ao.this)) || (paramInt == ao.e(ao.this)));
      do
      {
        return 0;
        if ((paramInt == ao.j(ao.this)) || (paramInt == ao.l(ao.this)) || (paramInt == ao.m(ao.this)) || (paramInt == ao.n(ao.this)))
          return 1;
        if ((paramInt == ao.p(ao.this)) || (paramInt == ao.q(ao.this)) || (paramInt == ao.o(ao.this)) || (paramInt == ao.k(ao.this)))
          return 2;
      }
      while (paramInt != ao.h(ao.this));
      return 3;
    }

    public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      int i = getItemViewType(paramInt);
      if (i == 0)
      {
        if (paramView != null)
          break label769;
        paramViewGroup = new bg(this.b);
        paramViewGroup.setBackgroundColor(-1);
      }
      while (true)
      {
        Object localObject = (bg)paramViewGroup;
        if (paramInt == ao.a(ao.this))
        {
          ((bg)localObject).a(r.a("BlockedUsers", 2131230917), true);
          paramView = paramViewGroup;
        }
        do
        {
          return paramView;
          if (paramInt == ao.b(ao.this))
          {
            ((bg)localObject).a(r.a("SessionsTitle", 2131231818), false);
            return paramViewGroup;
          }
          if (paramInt == ao.f(ao.this))
          {
            ((bg)localObject).a(r.a("TwoStepVerification", 2131231906), true);
            return paramViewGroup;
          }
          if (paramInt == ao.g(ao.this))
          {
            ((bg)localObject).a(r.a("Passcode", 2131231643), true);
            return paramViewGroup;
          }
          if (paramInt == ao.d(ao.this))
          {
            if (f.a().o());
            for (paramView = r.a("Loading", 2131231394); ; paramView = ao.a(ao.this, false))
            {
              ((bg)localObject).a(r.a("PrivacyLastSeen", 2131231700), paramView, true);
              return paramViewGroup;
            }
          }
          if (paramInt == ao.e(ao.this))
          {
            if (f.a().p());
            for (paramView = r.a("Loading", 2131231394); ; paramView = ao.a(ao.this, true))
            {
              ((bg)localObject).a(r.a("GroupsAndChannels", 2131231286), paramView, false);
              return paramViewGroup;
            }
          }
          paramView = paramViewGroup;
        }
        while (paramInt != ao.c(ao.this));
        if (f.a().n())
          paramView = r.a("Loading", 2131231394);
        while (true)
        {
          ((bg)localObject).a(r.a("DeleteAccountIfAwayFor", 2131231119), paramView, false);
          return paramViewGroup;
          paramInt = f.a().m();
          if (paramInt <= 182)
          {
            paramView = r.b("Months", paramInt / 30);
            continue;
          }
          if (paramInt == 365)
          {
            paramView = r.b("Years", paramInt / 365);
            continue;
          }
          paramView = r.b("Days", paramInt);
        }
        if (i == 1)
          if (paramView != null)
            break label764;
        label759: label764: for (paramViewGroup = new bf(this.b); ; paramViewGroup = paramView)
        {
          if (paramInt == ao.j(ao.this))
          {
            ((bf)paramViewGroup).setText(r.a("DeleteAccountHelp", 2131231118));
            if (ao.k(ao.this) == -1);
            for (paramInt = 2130837783; ; paramInt = 2130837782)
            {
              paramViewGroup.setBackgroundResource(paramInt);
              return paramViewGroup;
            }
          }
          if (paramInt == ao.l(ao.this))
          {
            ((bf)paramViewGroup).setText(r.a("GroupsAndChannelsHelp", 2131231287));
            paramViewGroup.setBackgroundResource(2130837782);
            return paramViewGroup;
          }
          if (paramInt == ao.m(ao.this))
          {
            ((bf)paramViewGroup).setText(r.a("SessionsInfo", 2131231817));
            paramViewGroup.setBackgroundResource(2130837782);
            return paramViewGroup;
          }
          paramView = paramViewGroup;
          if (paramInt != ao.n(ao.this))
            break;
          ((bf)paramViewGroup).setText("");
          paramViewGroup.setBackgroundResource(2130837783);
          return paramViewGroup;
          if (i == 2)
          {
            if (paramView != null)
              break label759;
            paramViewGroup = new w(this.b);
            paramViewGroup.setBackgroundColor(-1);
          }
          while (true)
          {
            if (paramInt == ao.o(ao.this))
            {
              ((w)paramViewGroup).setText(r.a("PrivacyTitle", 2131231704));
              return paramViewGroup;
            }
            if (paramInt == ao.p(ao.this))
            {
              ((w)paramViewGroup).setText(r.a("SecurityTitle", 2131231789));
              return paramViewGroup;
            }
            if (paramInt == ao.q(ao.this))
            {
              ((w)paramViewGroup).setText(r.a("DeleteAccountTitle", 2131231121));
              return paramViewGroup;
            }
            paramView = paramViewGroup;
            if (paramInt != ao.k(ao.this))
              break;
            ((w)paramViewGroup).setText(r.a("SecretChat", 2131231785));
            return paramViewGroup;
            if (i == 3)
            {
              if (paramView == null)
              {
                paramViewGroup = new ba(this.b);
                paramViewGroup.setBackgroundColor(-1);
              }
              while (true)
              {
                localObject = (ba)paramViewGroup;
                paramView = paramViewGroup;
                if (paramInt != ao.h(ao.this))
                  break;
                paramView = r.a("SecretWebPage", 2131231788);
                if (org.vidogram.messenger.v.a().x == 1);
                for (boolean bool = true; ; bool = false)
                {
                  ((ba)localObject).a(paramView, bool, true);
                  return paramViewGroup;
                }
                paramViewGroup = paramView;
              }
            }
            return paramView;
            paramViewGroup = paramView;
          }
        }
        label769: paramViewGroup = paramView;
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
      return (paramInt == ao.g(ao.this)) || (paramInt == ao.f(ao.this)) || (paramInt == ao.a(ao.this)) || (paramInt == ao.b(ao.this)) || (paramInt == ao.h(ao.this)) || ((paramInt == ao.e(ao.this)) && (!f.a().p())) || ((paramInt == ao.d(ao.this)) && (!f.a().o())) || ((paramInt == ao.c(ao.this)) && (!f.a().n()));
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.ao
 * JD-Core Version:    0.6.0
 */