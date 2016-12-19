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
import android.widget.FrameLayout;
import android.widget.ListView;
import org.vidogram.messenger.r;
import org.vidogram.messenger.y;
import org.vidogram.messenger.y.b;
import org.vidogram.ui.a.a.a;
import org.vidogram.ui.a.g;
import org.vidogram.ui.c.bf;
import org.vidogram.ui.c.bg;

public class t extends g
  implements y.b
{
  private a i;
  private int j;
  private int k;
  private int l;
  private int m;
  private int n;

  public t(Bundle paramBundle)
  {
    super(paramBundle);
    this.n = paramBundle.getInt("chat_id");
  }

  public View a(Context paramContext)
  {
    this.d.setBackButtonImage(2130837794);
    this.d.setAllowOverlayTitle(true);
    this.d.setTitle(r.a("ConvertGroup", 2131231081));
    this.d.setActionBarMenuOnItemClick(new a.a()
    {
      public void a(int paramInt)
      {
        if (paramInt == -1)
          t.this.d();
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
        if (paramInt == t.a(t.this))
        {
          paramAdapterView = new AlertDialog.Builder(t.this.l());
          paramAdapterView.setMessage(r.a("ConvertGroupAlert", 2131231082));
          paramAdapterView.setTitle(r.a("ConvertGroupAlertWarning", 2131231083));
          paramAdapterView.setPositiveButton(r.a("OK", 2131231604), new DialogInterface.OnClickListener()
          {
            public void onClick(DialogInterface paramDialogInterface, int paramInt)
            {
              org.vidogram.messenger.v.a().a(t.this.l(), t.b(t.this));
            }
          });
          paramAdapterView.setNegativeButton(r.a("Cancel", 2131230943), null);
          t.this.b(paramAdapterView.create());
        }
      }
    });
    return this.b;
  }

  public void a(int paramInt, Object[] paramArrayOfObject)
  {
    if (paramInt == y.d)
      e();
  }

  public boolean f()
  {
    super.f();
    int i1 = this.m;
    this.m = (i1 + 1);
    this.j = i1;
    i1 = this.m;
    this.m = (i1 + 1);
    this.k = i1;
    i1 = this.m;
    this.m = (i1 + 1);
    this.l = i1;
    y.a().a(this, y.d);
    return true;
  }

  public void g()
  {
    super.g();
    y.a().b(this, y.d);
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
      return t.c(t.this);
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
      if (paramInt == t.a(t.this));
      do
        return 0;
      while ((paramInt != t.d(t.this)) && (paramInt != t.e(t.this)));
      return 1;
    }

    public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      int i = getItemViewType(paramInt);
      if (i == 0)
      {
        if (paramView != null)
          break label170;
        paramView = new bg(this.b);
        paramView.setBackgroundColor(-1);
      }
      label170: 
      while (true)
      {
        bg localbg = (bg)paramView;
        paramViewGroup = paramView;
        if (paramInt == t.a(t.this))
        {
          localbg.a(r.a("ConvertGroup", 2131231081), false);
          paramViewGroup = paramView;
        }
        return paramViewGroup;
        if (i == 1)
        {
          if (paramView == null)
            paramView = new bf(this.b);
          while (true)
          {
            if (paramInt == t.d(t.this))
            {
              ((bf)paramView).setText(org.vidogram.messenger.a.b(r.a("ConvertGroupInfo2", 2131231085)));
              paramView.setBackgroundResource(2130837782);
              return paramView;
            }
            paramViewGroup = paramView;
            if (paramInt != t.e(t.this))
              break;
            ((bf)paramView).setText(org.vidogram.messenger.a.b(r.a("ConvertGroupInfo3", 2131231086)));
            paramView.setBackgroundResource(2130837783);
            return paramView;
          }
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
      return false;
    }

    public boolean isEnabled(int paramInt)
    {
      return paramInt == t.a(t.this);
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.t
 * JD-Core Version:    0.6.0
 */