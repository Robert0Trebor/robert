package org.vidogram.ui;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.Toast;
import org.vidogram.messenger.ApplicationLoader;
import org.vidogram.messenger.e;
import org.vidogram.messenger.n;
import org.vidogram.messenger.r;
import org.vidogram.messenger.y;
import org.vidogram.messenger.y.b;
import org.vidogram.tgnet.ConnectionsManager;
import org.vidogram.tgnet.c;
import org.vidogram.tgnet.f;
import org.vidogram.tgnet.g.em;
import org.vidogram.tgnet.g.fk;
import org.vidogram.tgnet.g.i;
import org.vidogram.tgnet.g.j;
import org.vidogram.tgnet.g.pj;
import org.vidogram.tgnet.g.w;
import org.vidogram.ui.a.a.a;
import org.vidogram.ui.a.g;
import org.vidogram.ui.c.ay;
import org.vidogram.ui.c.bf;
import org.vidogram.ui.c.bg;

public class aa extends g
  implements y.b
{
  private a i;
  private int j;
  private boolean k;
  private g.w l;
  private int m;
  private int n;
  private int o;
  private int p;
  private int q;
  private int r;
  private int s;

  public aa(int paramInt)
  {
    this.j = paramInt;
  }

  private void b(boolean paramBoolean)
  {
    this.k = true;
    Object localObject;
    if (e.a(this.j))
    {
      localObject = new g.em();
      ((g.em)localObject).c = org.vidogram.messenger.v.b(this.j);
    }
    while (true)
    {
      int i1 = ConnectionsManager.a().a((f)localObject, new c(paramBoolean)
      {
      });
      ConnectionsManager.a().a(i1, this.e);
      if (this.i != null)
        this.i.notifyDataSetChanged();
      return;
      localObject = new g.pj();
      ((g.pj)localObject).c = this.j;
    }
  }

  public View a(Context paramContext)
  {
    this.d.setBackButtonImage(2130837794);
    this.d.setAllowOverlayTitle(true);
    this.d.setTitle(r.a("InviteLink", 2131231322));
    this.d.setActionBarMenuOnItemClick(new a.a()
    {
      public void a(int paramInt)
      {
        if (paramInt == -1)
          aa.this.d();
      }
    });
    this.i = new a(paramContext);
    this.b = new FrameLayout(paramContext);
    FrameLayout localFrameLayout1 = (FrameLayout)this.b;
    localFrameLayout1.setBackgroundColor(-986896);
    FrameLayout localFrameLayout2 = new FrameLayout(paramContext);
    localFrameLayout1.addView(localFrameLayout2, org.vidogram.ui.Components.v.a(-1, -1.0F));
    localFrameLayout2.addView(new ProgressBar(paramContext), org.vidogram.ui.Components.v.b(-2, -2, 17));
    paramContext = new ListView(paramContext);
    paramContext.setDivider(null);
    paramContext.setDividerHeight(0);
    paramContext.setEmptyView(localFrameLayout2);
    paramContext.setVerticalScrollBarEnabled(false);
    paramContext.setDrawSelectorOnTop(true);
    localFrameLayout1.addView(paramContext, org.vidogram.ui.Components.v.b(-1, -1, 51));
    paramContext.setAdapter(this.i);
    paramContext.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
      {
        if (aa.this.l() == null);
        do
          while (true)
          {
            return;
            if ((paramInt == aa.a(aa.this)) || (paramInt == aa.b(aa.this)))
            {
              if (aa.c(aa.this) == null)
                continue;
              try
              {
                ((ClipboardManager)ApplicationLoader.a.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", aa.c(aa.this).b));
                Toast.makeText(aa.this.l(), r.a("LinkCopied", 2131231383), 0).show();
                return;
              }
              catch (java.lang.Exception paramAdapterView)
              {
                n.a("tmessages", paramAdapterView);
                return;
              }
            }
            if (paramInt != aa.d(aa.this))
              break;
            if (aa.c(aa.this) == null)
              continue;
            try
            {
              paramAdapterView = new Intent("android.intent.action.SEND");
              paramAdapterView.setType("text/plain");
              paramAdapterView.putExtra("android.intent.extra.TEXT", aa.c(aa.this).b);
              aa.this.l().startActivityForResult(Intent.createChooser(paramAdapterView, r.a("InviteToGroupByLink", 2131231325)), 500);
              return;
            }
            catch (java.lang.Exception paramAdapterView)
            {
              n.a("tmessages", paramAdapterView);
              return;
            }
          }
        while (paramInt != aa.e(aa.this));
        paramAdapterView = new AlertDialog.Builder(aa.this.l());
        paramAdapterView.setMessage(r.a("RevokeAlert", 2131231750));
        paramAdapterView.setTitle(r.a("RevokeLink", 2131231753));
        paramAdapterView.setPositiveButton(r.a("RevokeButton", 2131231752), new DialogInterface.OnClickListener()
        {
          public void onClick(DialogInterface paramDialogInterface, int paramInt)
          {
            aa.a(aa.this, true);
          }
        });
        paramAdapterView.setNegativeButton(r.a("Cancel", 2131230943), null);
        aa.this.b(paramAdapterView.create());
      }
    });
    return this.b;
  }

  public void a(int paramInt, Object[] paramArrayOfObject)
  {
    if (paramInt == y.n)
    {
      g.j localj = (g.j)paramArrayOfObject[0];
      paramInt = ((Integer)paramArrayOfObject[1]).intValue();
      if ((localj.e == this.j) && (paramInt == this.e))
      {
        this.l = org.vidogram.messenger.v.a().e(this.j);
        if ((this.l instanceof g.fk))
          break label73;
        b(false);
      }
    }
    label73: 
    do
    {
      return;
      this.k = false;
    }
    while (this.i == null);
    this.i.notifyDataSetChanged();
  }

  public boolean f()
  {
    super.f();
    y.a().a(this, y.n);
    org.vidogram.messenger.v.a().a(this.j, this.e, true);
    this.k = true;
    this.s = 0;
    int i1 = this.s;
    this.s = (i1 + 1);
    this.m = i1;
    i1 = this.s;
    this.s = (i1 + 1);
    this.n = i1;
    i1 = this.s;
    this.s = (i1 + 1);
    this.o = i1;
    i1 = this.s;
    this.s = (i1 + 1);
    this.p = i1;
    i1 = this.s;
    this.s = (i1 + 1);
    this.q = i1;
    i1 = this.s;
    this.s = (i1 + 1);
    this.r = i1;
    return true;
  }

  public void g()
  {
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
      if (aa.f(aa.this))
        return 0;
      return aa.g(aa.this);
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
      if ((paramInt == aa.a(aa.this)) || (paramInt == aa.d(aa.this)) || (paramInt == aa.e(aa.this)));
      do
      {
        return 0;
        if ((paramInt == aa.h(aa.this)) || (paramInt == aa.i(aa.this)))
          return 1;
      }
      while (paramInt != aa.b(aa.this));
      return 2;
    }

    public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      int i = getItemViewType(paramInt);
      if (i == 0)
      {
        if (paramView != null)
          break label331;
        paramView = new bg(this.b);
        paramView.setBackgroundColor(-1);
      }
      label328: label331: 
      while (true)
      {
        Object localObject = (bg)paramView;
        if (paramInt == aa.a(aa.this))
        {
          ((bg)localObject).a(r.a("CopyLink", 2131231089), true);
          paramViewGroup = paramView;
        }
        do
        {
          return paramViewGroup;
          if (paramInt == aa.d(aa.this))
          {
            ((bg)localObject).a(r.a("ShareLink", 2131231835), false);
            return paramView;
          }
          paramViewGroup = paramView;
        }
        while (paramInt != aa.e(aa.this));
        ((bg)localObject).a(r.a("RevokeLink", 2131231753), true);
        return paramView;
        if (i == 1)
        {
          if (paramView != null)
            break label328;
          paramView = new bf(this.b);
        }
        while (true)
        {
          if (paramInt == aa.h(aa.this))
          {
            ((bf)paramView).setText("");
            paramView.setBackgroundResource(2130837783);
            return paramView;
          }
          paramViewGroup = paramView;
          if (paramInt != aa.i(aa.this))
            break;
          paramViewGroup = org.vidogram.messenger.v.a().b(Integer.valueOf(aa.j(aa.this)));
          if ((e.d(paramViewGroup)) && (!paramViewGroup.r))
            ((bf)paramView).setText(r.a("ChannelLinkInfo", 2131230990));
          while (true)
          {
            paramView.setBackgroundResource(2130837782);
            return paramView;
            ((bf)paramView).setText(r.a("LinkInfo", 2131231385));
          }
          if (i == 2)
          {
            if (paramView == null)
            {
              paramView = new ay(this.b);
              paramView.setBackgroundColor(-1);
            }
            while (true)
            {
              localObject = (ay)paramView;
              if (aa.c(aa.this) != null);
              for (paramViewGroup = aa.c(aa.this).b; ; paramViewGroup = "error")
              {
                ((ay)localObject).a(paramViewGroup, false);
                return paramView;
              }
            }
          }
          return paramView;
        }
      }
    }

    public int getViewTypeCount()
    {
      return 3;
    }

    public boolean hasStableIds()
    {
      return false;
    }

    public boolean isEmpty()
    {
      return aa.f(aa.this);
    }

    public boolean isEnabled(int paramInt)
    {
      return (paramInt == aa.e(aa.this)) || (paramInt == aa.a(aa.this)) || (paramInt == aa.d(aa.this)) || (paramInt == aa.b(aa.this));
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.aa
 * JD-Core Version:    0.6.0
 */