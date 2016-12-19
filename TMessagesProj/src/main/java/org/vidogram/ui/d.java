package org.vidogram.ui;

import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import java.util.ArrayList;
import org.vidogram.a.b;
import org.vidogram.messenger.r;
import org.vidogram.messenger.y;
import org.vidogram.messenger.y.b;
import org.vidogram.tgnet.g.vw;
import org.vidogram.ui.a.a.a;
import org.vidogram.ui.a.c;
import org.vidogram.ui.a.g;
import org.vidogram.ui.c.be;
import org.vidogram.ui.c.bh;

public class d extends g
  implements y.b, s.a
{
  private ListView i;
  private a j;
  private FrameLayout k;
  private TextView l;
  private int m;

  private void a(int paramInt)
  {
    if (this.i == null);
    while (true)
    {
      return;
      int i1 = this.i.getChildCount();
      int n = 0;
      while (n < i1)
      {
        View localView = this.i.getChildAt(n);
        if ((localView instanceof bh))
          ((bh)localView).a(paramInt);
        n += 1;
      }
    }
  }

  public View a(Context paramContext)
  {
    int n = 1;
    this.d.setBackButtonImage(2130837794);
    this.d.setAllowOverlayTitle(true);
    this.d.setTitle(r.a("BlockedUsers", 2131230917));
    this.d.setActionBarMenuOnItemClick(new a.a()
    {
      public void a(int paramInt)
      {
        if (paramInt == -1)
          d.this.d();
        do
          return;
        while (paramInt != 1);
        Object localObject = new Bundle();
        ((Bundle)localObject).putBoolean("onlyUsers", true);
        ((Bundle)localObject).putBoolean("destroyAfterSelect", true);
        ((Bundle)localObject).putBoolean("returnAsResult", true);
        localObject = new s((Bundle)localObject);
        ((s)localObject).a(d.this);
        d.this.a((g)localObject);
      }
    });
    this.d.a().b(1, 2130838095);
    this.b = new FrameLayout(paramContext);
    FrameLayout localFrameLayout = (FrameLayout)this.b;
    this.l = new TextView(paramContext);
    this.l.setTextColor(-8355712);
    this.l.setTextSize(20.0F);
    this.l.setGravity(17);
    this.l.setVisibility(4);
    this.l.setText(r.a("NoBlocked", 2131231488));
    localFrameLayout.addView(this.l, org.vidogram.ui.Components.v.b(-1, -1, 51));
    this.l.setOnTouchListener(new View.OnTouchListener()
    {
      public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
      {
        return true;
      }
    });
    this.k = new FrameLayout(paramContext);
    localFrameLayout.addView(this.k, org.vidogram.ui.Components.v.a(-1, -1.0F));
    Object localObject = new ProgressBar(paramContext);
    this.k.addView((View)localObject, org.vidogram.ui.Components.v.b(-2, -2, 17));
    this.i = new ListView(paramContext);
    this.i.setEmptyView(this.l);
    this.i.setVerticalScrollBarEnabled(false);
    this.i.setDivider(null);
    this.i.setDividerHeight(0);
    localObject = this.i;
    paramContext = new a(paramContext);
    this.j = paramContext;
    ((ListView)localObject).setAdapter(paramContext);
    paramContext = this.i;
    if (r.a)
    {
      paramContext.setVerticalScrollbarPosition(n);
      localFrameLayout.addView(this.i, org.vidogram.ui.Components.v.a(-1, -1.0F));
      this.i.setOnItemClickListener(new AdapterView.OnItemClickListener()
      {
        public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
        {
          if (paramInt < org.vidogram.messenger.v.a().q.size())
          {
            paramAdapterView = new Bundle();
            paramAdapterView.putInt("user_id", ((Integer)org.vidogram.messenger.v.a().q.get(paramInt)).intValue());
            d.this.a(new aq(paramAdapterView));
          }
        }
      });
      this.i.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener()
      {
        public boolean onItemLongClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
        {
          if ((paramInt < 0) || (paramInt >= org.vidogram.messenger.v.a().q.size()) || (d.this.l() == null))
            return true;
          d.a(d.this, ((Integer)org.vidogram.messenger.v.a().q.get(paramInt)).intValue());
          paramAdapterView = new AlertDialog.Builder(d.this.l());
          paramView = r.a("Unblock", 2131231909);
          1 local1 = new DialogInterface.OnClickListener()
          {
            public void onClick(DialogInterface paramDialogInterface, int paramInt)
            {
              if (paramInt == 0)
                org.vidogram.messenger.v.a().i(d.a(d.this));
            }
          };
          paramAdapterView.setItems(new CharSequence[] { paramView }, local1);
          d.this.b(paramAdapterView.create());
          return true;
        }
      });
      if (!org.vidogram.messenger.v.a().p)
        break label405;
      this.k.setVisibility(0);
      this.l.setVisibility(8);
      this.i.setEmptyView(null);
    }
    while (true)
    {
      return this.b;
      n = 2;
      break;
      label405: this.k.setVisibility(8);
      this.i.setEmptyView(this.l);
    }
  }

  public void a(int paramInt, Object[] paramArrayOfObject)
  {
    if (paramInt == y.b)
    {
      paramInt = ((Integer)paramArrayOfObject[0]).intValue();
      if (((paramInt & 0x2) != 0) || ((paramInt & 0x1) != 0))
        a(paramInt);
    }
    do
    {
      do
        return;
      while (paramInt != y.y);
      if (this.k != null)
        this.k.setVisibility(8);
      if ((this.i == null) || (this.i.getEmptyView() != null))
        continue;
      this.i.setEmptyView(this.l);
    }
    while (this.j == null);
    this.j.notifyDataSetChanged();
  }

  public void a(g.vw paramvw, String paramString)
  {
    if (paramvw == null)
      return;
    org.vidogram.messenger.v.a().h(paramvw.d);
  }

  public boolean f()
  {
    super.f();
    y.a().a(this, y.b);
    y.a().a(this, y.y);
    org.vidogram.messenger.v.a().a(false);
    return true;
  }

  public void g()
  {
    super.g();
    y.a().b(this, y.b);
    y.a().b(this, y.y);
  }

  public void i()
  {
    super.i();
    if (this.j != null)
      this.j.notifyDataSetChanged();
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
      if (org.vidogram.messenger.v.a().q.isEmpty())
        return 0;
      return org.vidogram.messenger.v.a().q.size() + 1;
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
      if (paramInt == org.vidogram.messenger.v.a().q.size())
        return 1;
      return 0;
    }

    public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      int i = getItemViewType(paramInt);
      if (i == 0)
        if (paramView != null)
          break label225;
      label225: for (paramViewGroup = new bh(this.b, 1, 0, false); ; paramViewGroup = paramView)
      {
        g.vw localvw = org.vidogram.messenger.v.a().a((Integer)org.vidogram.messenger.v.a().q.get(paramInt));
        if (localvw != null)
        {
          if (!localvw.r)
            break label122;
          paramView = r.a("Bot", 2131230922).substring(0, 1).toUpperCase() + r.a("Bot", 2131230922).substring(1);
        }
        while (true)
        {
          ((bh)paramViewGroup).a(localvw, null, paramView, 0);
          return paramViewGroup;
          label122: if ((localvw.i != null) && (localvw.i.length() != 0))
          {
            paramView = b.a().e("+" + localvw.i);
            continue;
          }
          paramView = r.a("NumberUnknown", 2131231603);
        }
        if ((i == 1) && (paramView == null))
        {
          paramView = new be(this.b);
          ((be)paramView).setText(r.a("UnblockText", 2131231910));
          return paramView;
        }
        return paramView;
      }
    }

    public int getViewTypeCount()
    {
      return 2;
    }

    public boolean hasStableIds()
    {
      return false;
    }

    public boolean isEmpty()
    {
      return org.vidogram.messenger.v.a().q.isEmpty();
    }

    public boolean isEnabled(int paramInt)
    {
      return paramInt != org.vidogram.messenger.v.a().q.size();
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.d
 * JD-Core Version:    0.6.0
 */