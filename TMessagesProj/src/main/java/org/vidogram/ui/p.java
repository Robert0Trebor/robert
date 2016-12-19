package org.vidogram.ui;

import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.FrameLayout;
import android.widget.ListView;
import java.util.ArrayList;
import org.vidogram.a.b;
import org.vidogram.messenger.Utilities;
import org.vidogram.messenger.ad;
import org.vidogram.messenger.r;
import org.vidogram.messenger.y;
import org.vidogram.messenger.y.b;
import org.vidogram.tgnet.ConnectionsManager;
import org.vidogram.tgnet.c;
import org.vidogram.tgnet.f;
import org.vidogram.tgnet.g.dr;
import org.vidogram.tgnet.g.ds;
import org.vidogram.tgnet.g.du;
import org.vidogram.tgnet.g.dv;
import org.vidogram.tgnet.g.dw;
import org.vidogram.tgnet.g.dx;
import org.vidogram.tgnet.g.dy;
import org.vidogram.tgnet.g.dz;
import org.vidogram.tgnet.g.ea;
import org.vidogram.tgnet.g.ej;
import org.vidogram.tgnet.g.es;
import org.vidogram.tgnet.g.ev;
import org.vidogram.tgnet.g.f;
import org.vidogram.tgnet.g.g;
import org.vidogram.tgnet.g.i;
import org.vidogram.tgnet.g.j;
import org.vidogram.tgnet.g.vw;
import org.vidogram.ui.Components.q;
import org.vidogram.ui.a.a.a;
import org.vidogram.ui.a.g;
import org.vidogram.ui.c.am;
import org.vidogram.ui.c.ap;
import org.vidogram.ui.c.az;
import org.vidogram.ui.c.bf;
import org.vidogram.ui.c.bg;
import org.vidogram.ui.c.bh;
import org.vidogram.ui.c.w;

public class p extends g
  implements y.b
{
  private a i;
  private q j;
  private ArrayList<g.f> k = new ArrayList();
  private int l = this.f.getInt("chat_id");
  private int m = this.f.getInt("type");
  private boolean n;
  private boolean o;
  private boolean p;
  private boolean q;
  private boolean r;
  private int s;

  public p(Bundle paramBundle)
  {
    super(paramBundle);
    paramBundle = org.vidogram.messenger.v.a().b(Integer.valueOf(this.l));
    boolean bool;
    if (paramBundle != null)
    {
      if (paramBundle.c)
      {
        this.p = true;
        if ((paramBundle.b & 0x40) != 0)
        {
          bool = true;
          this.q = bool;
        }
      }
      else
      {
        this.r = paramBundle.r;
      }
    }
    else
    {
      if (this.m != 0)
        break label122;
      this.s = 0;
    }
    label122: 
    do
    {
      return;
      bool = false;
      break;
      if (this.m != 1)
        continue;
      i1 = i2;
      if (this.p)
      {
        i1 = i2;
        if (this.r)
          i1 = 4;
      }
      this.s = i1;
      return;
    }
    while (this.m != 2);
    if (this.p)
      if (!this.q)
        break label186;
    label186: for (i1 = 2; ; i1 = 3)
    {
      this.s = i1;
      return;
    }
  }

  private void a(int paramInt1, int paramInt2)
  {
    if (this.n)
      return;
    this.n = true;
    if ((this.j != null) && (!this.o))
      this.j.a();
    if (this.i != null)
      this.i.notifyDataSetChanged();
    g.es locales = new g.es();
    locales.c = org.vidogram.messenger.v.b(this.l);
    if (this.m == 0)
      locales.d = new g.dx();
    while (true)
    {
      locales.e = paramInt1;
      locales.f = paramInt2;
      paramInt1 = ConnectionsManager.a().a(locales, new c()
      {
      });
      ConnectionsManager.a().a(paramInt1, this.e);
      return;
      if (this.m == 1)
      {
        locales.d = new g.dw();
        continue;
      }
      if (this.m != 2)
        continue;
      locales.d = new g.dy();
    }
  }

  public View a(Context paramContext)
  {
    int i1 = 1;
    this.d.setBackButtonImage(2130837794);
    this.d.setAllowOverlayTitle(true);
    if (this.m == 0)
    {
      this.d.setTitle(r.a("ChannelBlockedUsers", 2131230971));
      this.d.setActionBarMenuOnItemClick(new a.a()
      {
        public void a(int paramInt)
        {
          if (paramInt == -1)
            p.this.d();
        }
      });
      this.d.a();
      this.b = new FrameLayout(paramContext);
      this.b.setBackgroundColor(-986896);
      FrameLayout localFrameLayout = (FrameLayout)this.b;
      this.j = new q(paramContext);
      if (this.m == 0)
      {
        if (!this.r)
          break label350;
        this.j.setText(r.a("NoBlockedGroup", 2131231489));
      }
      label132: localFrameLayout.addView(this.j, org.vidogram.ui.Components.v.a(-1, -1.0F));
      ListView localListView = new ListView(paramContext);
      localListView.setEmptyView(this.j);
      localListView.setDivider(null);
      localListView.setDividerHeight(0);
      localListView.setDrawSelectorOnTop(true);
      paramContext = new a(paramContext);
      this.i = paramContext;
      localListView.setAdapter(paramContext);
      if (!r.a)
        break label369;
      label210: localListView.setVerticalScrollbarPosition(i1);
      localFrameLayout.addView(localListView, org.vidogram.ui.Components.v.a(-1, -1.0F));
      localListView.setOnItemClickListener(new AdapterView.OnItemClickListener(localListView)
      {
        public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
        {
          if (p.a(p.this) == 2)
            if (p.b(p.this))
            {
              if (paramInt != 0)
                break label212;
              paramAdapterView = new Bundle();
              paramAdapterView.putBoolean("onlyUsers", true);
              paramAdapterView.putBoolean("destroyAfterSelect", true);
              paramAdapterView.putBoolean("returnAsResult", true);
              paramAdapterView.putBoolean("needForwardCount", false);
              paramAdapterView.putBoolean("allowUsernameSearch", false);
              paramAdapterView.putString("selectAlertString", r.a("ChannelAddTo", 2131230961));
              paramAdapterView = new s(paramAdapterView);
              paramAdapterView.a(new s.a()
              {
                public void a(g.vw paramvw, String paramString)
                {
                  org.vidogram.messenger.v localv = org.vidogram.messenger.v.a();
                  int j = p.c(p.this);
                  if (paramString != null);
                  for (int i = Utilities.a(paramString).intValue(); ; i = 0)
                  {
                    localv.a(j, paramvw, null, i, null, p.this);
                    return;
                  }
                }
              });
              p.this.a(paramAdapterView);
            }
            else
            {
              label111: paramView = null;
              paramAdapterView = paramView;
              if (paramInt >= p.f(p.this))
              {
                paramAdapterView = paramView;
                if (paramInt < p.g(p.this).size() + p.f(p.this))
                  paramAdapterView = (g.f)p.g(p.this).get(paramInt - p.f(p.this));
              }
              if (paramAdapterView != null)
              {
                paramView = new Bundle();
                paramView.putInt("user_id", paramAdapterView.b);
                p.this.a(new aq(paramView));
              }
            }
          label583: label586: 
          while (true)
          {
            return;
            label212: if ((p.d(p.this)) || (paramInt != 1))
              break label111;
            p.this.a(new aa(p.c(p.this)));
            break label111;
            if ((p.a(p.this) != 1) || (!p.b(p.this)))
              break label111;
            if ((p.e(p.this)) && ((paramInt == 1) || (paramInt == 2)))
            {
              paramAdapterView = org.vidogram.messenger.v.a().b(Integer.valueOf(p.c(p.this)));
              if (paramAdapterView == null)
                break;
              if ((paramInt == 1) && (!paramAdapterView.x))
              {
                paramAdapterView.x = true;
                paramInt = 1;
              }
            }
            while (true)
            {
              label333: if (paramInt == 0)
                break label586;
              org.vidogram.messenger.v.a().a(p.c(p.this), paramAdapterView.x);
              int i = this.a.getChildCount();
              paramInt = 0;
              label365: if (paramInt < i)
              {
                paramView = this.a.getChildAt(paramInt);
                if ((paramView instanceof am))
                {
                  int j = ((Integer)paramView.getTag()).intValue();
                  paramView = (am)paramView;
                  if (((j != 0) || (!paramAdapterView.x)) && ((j != 1) || (paramAdapterView.x)))
                    break label468;
                }
              }
              label468: for (boolean bool = true; ; bool = false)
              {
                paramView.a(bool, true);
                paramInt += 1;
                break label365;
                break;
                if ((paramInt != 2) || (!paramAdapterView.x))
                  break label583;
                paramAdapterView.x = false;
                paramInt = 1;
                break label333;
              }
              if (paramInt != p.f(p.this) + p.g(p.this).size())
                break;
              paramAdapterView = new Bundle();
              paramAdapterView.putBoolean("onlyUsers", true);
              paramAdapterView.putBoolean("destroyAfterSelect", true);
              paramAdapterView.putBoolean("returnAsResult", true);
              paramAdapterView.putBoolean("needForwardCount", false);
              paramAdapterView.putBoolean("allowUsernameSearch", true);
              paramAdapterView.putString("selectAlertString", r.a("ChannelAddUserAdminAlert", 2131230962));
              paramAdapterView = new s(paramAdapterView);
              paramAdapterView.a(new s.a()
              {
                public void a(g.vw paramvw, String paramString)
                {
                  p.this.a(paramvw, new g.dz());
                }
              });
              p.this.a(paramAdapterView);
              return;
              paramInt = 0;
            }
          }
        }
      });
      if ((this.p) || ((this.r) && (this.m == 0)))
        localListView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener()
        {
          public boolean onItemLongClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
          {
            if (p.this.l() == null)
              return false;
            if ((paramInt >= p.f(p.this)) && (paramInt < p.g(p.this).size() + p.f(p.this)));
            for (paramView = (g.f)p.g(p.this).get(paramInt - p.f(p.this)); ; paramView = null)
            {
              AlertDialog.Builder localBuilder;
              if (paramView != null)
              {
                localBuilder = new AlertDialog.Builder(p.this.l());
                if (p.a(p.this) == 0)
                {
                  paramAdapterView = new CharSequence[1];
                  paramAdapterView[0] = r.a("Unblock", 2131231909);
                }
              }
              while (true)
              {
                localBuilder.setItems(paramAdapterView, new DialogInterface.OnClickListener(paramView)
                {
                  public void onClick(DialogInterface paramDialogInterface, int paramInt)
                  {
                    if (paramInt == 0)
                    {
                      if (p.a(p.this) != 0)
                        break label109;
                      p.g(p.this).remove(this.a);
                      p.h(p.this).notifyDataSetChanged();
                      paramDialogInterface = new g.ev();
                      paramDialogInterface.e = false;
                      paramDialogInterface.d = org.vidogram.messenger.v.a(this.a.b);
                      paramDialogInterface.c = org.vidogram.messenger.v.b(p.c(p.this));
                      ConnectionsManager.a().a(paramDialogInterface, new c()
                      {
                      });
                    }
                    label109: 
                    do
                    {
                      return;
                      if (p.a(p.this) != 1)
                        continue;
                      p.this.a(org.vidogram.messenger.v.a().a(Integer.valueOf(this.a.b)), new g.ea());
                      return;
                    }
                    while (p.a(p.this) != 2);
                    org.vidogram.messenger.v.a().a(p.c(p.this), org.vidogram.messenger.v.a().a(Integer.valueOf(this.a.b)), null);
                  }
                });
                p.this.b(localBuilder.create());
                return true;
                if (p.a(p.this) == 1)
                {
                  paramAdapterView = new CharSequence[1];
                  paramAdapterView[0] = r.a("ChannelRemoveUserAdmin", 2131231029);
                  continue;
                }
                if (p.a(p.this) == 2)
                {
                  paramAdapterView = new CharSequence[1];
                  paramAdapterView[0] = r.a("ChannelRemoveUser", 2131231028);
                  continue;
                  return false;
                }
                paramAdapterView = null;
              }
            }
          }
        });
      if (!this.n)
        break label374;
      this.j.a();
    }
    while (true)
    {
      return this.b;
      if (this.m == 1)
      {
        this.d.setTitle(r.a("ChannelAdministrators", 2131230966));
        break;
      }
      if (this.m != 2)
        break;
      this.d.setTitle(r.a("ChannelMembers", 2131230993));
      break;
      label350: this.j.setText(r.a("NoBlocked", 2131231488));
      break label132;
      label369: i1 = 2;
      break label210;
      label374: this.j.b();
    }
  }

  public void a(int paramInt, Object[] paramArrayOfObject)
  {
    if ((paramInt == y.n) && (((g.j)paramArrayOfObject[0]).e == this.l))
      org.vidogram.messenger.a.a(new Runnable()
      {
        public void run()
        {
          p.a(p.this, 0, 200);
        }
      });
  }

  public void a(g.vw paramvw, g.g paramg)
  {
    if ((paramvw == null) || (paramg == null))
      return;
    g.ej localej = new g.ej();
    localej.c = org.vidogram.messenger.v.b(this.l);
    localej.d = org.vidogram.messenger.v.a(paramvw);
    localej.e = paramg;
    ConnectionsManager.a().a(localej, new c()
    {
    });
  }

  public boolean f()
  {
    super.f();
    y.a().a(this, y.n);
    a(0, 200);
    return true;
  }

  public void g()
  {
    super.g();
    y.a().b(this, y.n);
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
      int i = 1;
      if (((p.g(p.this).isEmpty()) && (p.a(p.this) == 0)) || ((p.i(p.this)) && (!p.j(p.this))))
        return 0;
      if (p.a(p.this) == 1)
      {
        int k = p.g(p.this).size();
        if (p.b(p.this))
          i = 2;
        if ((p.b(p.this)) && (p.e(p.this)));
        for (int j = 4; ; j = 0)
          return k + i + j;
      }
      return p.g(p.this).size() + p.f(p.this) + 1;
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
      int i = 3;
      if (p.a(p.this) == 1)
      {
        if (p.b(p.this))
        {
          if (p.e(p.this))
          {
            if (paramInt == 0)
              i = 5;
            do
            {
              return i;
              if ((paramInt == 1) || (paramInt == 2))
                return 6;
            }
            while (paramInt == 3);
          }
          if (paramInt == p.f(p.this) + p.g(p.this).size())
            return 4;
          if (paramInt == p.f(p.this) + p.g(p.this).size() + 1)
            return 1;
        }
      }
      else if ((p.a(p.this) == 2) && (p.b(p.this)))
        if (!p.d(p.this))
        {
          if ((paramInt == 0) || (paramInt == 1))
            return 2;
          if (paramInt == 2)
            return 1;
        }
        else
        {
          if (paramInt == 0)
            return 2;
          if (paramInt == 1)
            return 1;
        }
      if (paramInt == p.g(p.this).size() + p.f(p.this))
        return 1;
      return 0;
    }

    public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      boolean bool = true;
      int i = getItemViewType(paramInt);
      if (i == 0)
      {
        if (paramView != null)
          break label974;
        paramViewGroup = new bh(this.b, 1, 0, false);
        paramViewGroup.setBackgroundColor(-1);
      }
      while (true)
      {
        Object localObject1 = (bh)paramViewGroup;
        g.f localf = (g.f)p.g(p.this).get(paramInt - p.f(p.this));
        Object localObject2 = org.vidogram.messenger.v.a().a(Integer.valueOf(localf.b));
        paramView = paramViewGroup;
        if (localObject2 != null)
        {
          if (p.a(p.this) != 0)
            break label176;
          if ((((g.vw)localObject2).i == null) || (((g.vw)localObject2).i.length() == 0))
            break label165;
        }
        label165: for (paramView = b.a().e("+" + ((g.vw)localObject2).i); ; paramView = r.a("NumberUnknown", 2131231603))
        {
          ((bh)localObject1).a((f)localObject2, null, paramView, 0);
          paramView = paramViewGroup;
          return paramView;
        }
        label176: if (p.a(p.this) == 1)
          if (((localf instanceof g.dr)) || ((localf instanceof g.dv)))
            paramView = r.a("ChannelCreator", 2131230977);
        while (true)
        {
          ((bh)localObject1).a((f)localObject2, null, paramView, 0);
          return paramViewGroup;
          if ((localf instanceof g.du))
          {
            paramView = r.a("ChannelModerator", 2131231017);
            continue;
          }
          if ((localf instanceof g.ds))
          {
            paramView = r.a("ChannelEditor", 2131230983);
            continue;
            paramView = paramViewGroup;
            if (p.a(p.this) != 2)
              break;
            ((bh)localObject1).a((f)localObject2, null, null, 0);
            return paramViewGroup;
            if (i == 1)
              if (paramView != null)
                break label964;
            label953: label956: label959: label964: for (paramViewGroup = new bf(this.b); ; paramViewGroup = paramView)
            {
              if (p.a(p.this) == 0)
              {
                ((bf)paramViewGroup).setText(String.format("%1$s\n\n%2$s", new Object[] { r.a("NoBlockedGroup", 2131231489), r.a("UnblockText", 2131231910) }));
                paramViewGroup.setBackgroundResource(2130837783);
                return paramViewGroup;
              }
              if (p.a(p.this) == 1)
              {
                if (p.b(p.this))
                {
                  if (p.e(p.this))
                  {
                    ((bf)paramViewGroup).setText(r.a("MegaAdminsInfo", 2131231413));
                    paramViewGroup.setBackgroundResource(2130837783);
                    return paramViewGroup;
                  }
                  ((bf)paramViewGroup).setText(r.a("ChannelAdminsInfo", 2131230967));
                  paramViewGroup.setBackgroundResource(2130837783);
                  return paramViewGroup;
                }
                ((bf)paramViewGroup).setText("");
                paramViewGroup.setBackgroundResource(2130837783);
                return paramViewGroup;
              }
              paramView = paramViewGroup;
              if (p.a(p.this) != 2)
                break;
              if (((!p.d(p.this)) && (paramInt == 2)) || ((paramInt == 1) && (p.b(p.this))))
              {
                if (p.e(p.this))
                  ((bf)paramViewGroup).setText("");
                while (true)
                {
                  paramViewGroup.setBackgroundResource(2130837782);
                  return paramViewGroup;
                  ((bf)paramViewGroup).setText(r.a("ChannelMembersInfo", 2131230994));
                }
              }
              ((bf)paramViewGroup).setText("");
              paramViewGroup.setBackgroundResource(2130837783);
              return paramViewGroup;
              if (i == 2)
              {
                if (paramView != null)
                  break label959;
                paramViewGroup = new bg(this.b);
                paramViewGroup.setBackgroundColor(-1);
              }
              while (true)
              {
                localObject1 = (bg)paramViewGroup;
                if (p.a(p.this) == 2)
                {
                  if (paramInt == 0)
                  {
                    ((bg)localObject1).a(r.a("AddMember", 2131230819), true);
                    return paramViewGroup;
                  }
                  paramView = paramViewGroup;
                  if (paramInt != 1)
                    break;
                  ((bg)localObject1).a(r.a("ChannelInviteViaLink", 2131230985), false);
                  return paramViewGroup;
                }
                paramView = paramViewGroup;
                if (p.a(p.this) != 1)
                  break;
                ((bg)localObject1).a(r.a("ChannelAddAdmin", 2131230959), 2130837960, false);
                return paramViewGroup;
                if (i == 3)
                {
                  if (paramView == null)
                    return new ap(this.b);
                }
                else if (i == 4)
                {
                  if (paramView != null)
                    break label956;
                  paramView = new az(this.b);
                  paramView.setBackgroundColor(-1);
                }
                while (true)
                {
                  ((az)paramView).a(r.a("ChannelAddAdmin", 2131230959), 2130837960);
                  return paramView;
                  if (i == 5)
                  {
                    if (paramView != null)
                      break label953;
                    paramView = new w(this.b);
                    paramView.setBackgroundColor(-1);
                  }
                  while (true)
                  {
                    ((w)paramView).setText(r.a("WhoCanAddMembers", 2131231960));
                    return paramView;
                    if (i == 6)
                    {
                      if (paramView == null)
                      {
                        paramViewGroup = new am(this.b);
                        paramViewGroup.setBackgroundColor(-1);
                      }
                      while (true)
                      {
                        localObject1 = (am)paramViewGroup;
                        localObject2 = org.vidogram.messenger.v.a().b(Integer.valueOf(p.c(p.this)));
                        if (paramInt == 1)
                        {
                          ((am)localObject1).setTag(Integer.valueOf(0));
                          paramView = r.a("WhoCanAddMembersAllMembers", 2131231962);
                          if ((localObject2 != null) && (((g.i)localObject2).x));
                          for (bool = true; ; bool = false)
                          {
                            ((am)localObject1).a(paramView, bool, true);
                            return paramViewGroup;
                          }
                        }
                        paramView = paramViewGroup;
                        if (paramInt != 2)
                          break;
                        ((am)localObject1).setTag(Integer.valueOf(1));
                        paramView = r.a("WhoCanAddMembersAdmins", 2131231961);
                        if ((localObject2 != null) && (!((g.i)localObject2).x));
                        while (true)
                        {
                          ((am)localObject1).a(paramView, bool, false);
                          return paramViewGroup;
                          bool = false;
                        }
                        paramViewGroup = paramView;
                      }
                    }
                    return paramView;
                  }
                }
                paramViewGroup = paramView;
              }
            }
          }
          paramView = null;
        }
        label974: paramViewGroup = paramView;
      }
    }

    public int getViewTypeCount()
    {
      return 7;
    }

    public boolean hasStableIds()
    {
      return false;
    }

    public boolean isEmpty()
    {
      return (getCount() == 0) || ((p.g(p.this).isEmpty()) && (p.i(p.this)));
    }

    public boolean isEnabled(int paramInt)
    {
      int i = 0;
      int j = 1;
      if (p.a(p.this) == 2)
        if (p.b(p.this))
        {
          if (!p.d(p.this))
          {
            if ((paramInt == 0) || (paramInt == 1))
              i = 1;
            do
              return i;
            while (paramInt == 2);
          }
        }
        else
          label53: if ((paramInt == p.g(p.this).size() + p.f(p.this)) || (((g.f)p.g(p.this).get(paramInt - p.f(p.this))).b == ad.c()))
            break label232;
      label232: for (i = j; ; i = 0)
      {
        return i;
        if (paramInt == 0)
          return true;
        if (paramInt != 1)
          break label53;
        return false;
        if (p.a(p.this) != 1)
          break label53;
        if (paramInt == p.f(p.this) + p.g(p.this).size())
          return p.b(p.this);
        if (paramInt == p.f(p.this) + p.g(p.this).size() + 1)
          break;
        if ((!p.e(p.this)) || (!p.b(p.this)) || (paramInt >= 4))
          break label53;
        if ((paramInt == 1) || (paramInt == 2));
        for (i = 1; ; i = 0)
          return i;
      }
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.p
 * JD-Core Version:    0.6.0
 */