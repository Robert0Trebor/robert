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
import android.widget.FrameLayout.LayoutParams;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import org.vidogram.a.b;
import org.vidogram.messenger.r;
import org.vidogram.messenger.v;
import org.vidogram.messenger.y.b;
import org.vidogram.tgnet.g.vw;
import org.vidogram.ui.a.a.a;
import org.vidogram.ui.a.c;
import org.vidogram.ui.a.g;
import org.vidogram.ui.c.be;
import org.vidogram.ui.c.bh;

public class ap extends g
  implements y.b
{
  private ListView i;
  private a j;
  private int k;
  private boolean l;
  private ArrayList<Integer> m;
  private boolean n;
  private b o;

  public ap(ArrayList<Integer> paramArrayList, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.m = paramArrayList;
    this.n = paramBoolean2;
    this.l = paramBoolean1;
  }

  private void a(int paramInt)
  {
    if (this.i == null);
    while (true)
    {
      return;
      int i2 = this.i.getChildCount();
      int i1 = 0;
      while (i1 < i2)
      {
        View localView = this.i.getChildAt(i1);
        if ((localView instanceof bh))
          ((bh)localView).a(paramInt);
        i1 += 1;
      }
    }
  }

  public View a(Context paramContext)
  {
    this.d.setBackButtonImage(2130837794);
    this.d.setAllowOverlayTitle(true);
    FrameLayout localFrameLayout;
    if (this.l)
      if (this.n)
      {
        this.d.setTitle(r.a("AlwaysAllow", 2131230838));
        this.d.setActionBarMenuOnItemClick(new a.a()
        {
          public void a(int paramInt)
          {
            if (paramInt == -1)
              ap.this.d();
            do
              return;
            while (paramInt != 1);
            Bundle localBundle = new Bundle();
            if (ap.a(ap.this));
            for (Object localObject = "isAlwaysShare"; ; localObject = "isNeverShare")
            {
              localBundle.putBoolean((String)localObject, true);
              localBundle.putBoolean("isGroup", ap.b(ap.this));
              localObject = new y(localBundle);
              ((y)localObject).a(new y.a()
              {
                public void a(ArrayList<Integer> paramArrayList)
                {
                  paramArrayList = paramArrayList.iterator();
                  while (paramArrayList.hasNext())
                  {
                    Integer localInteger = (Integer)paramArrayList.next();
                    if (ap.c(ap.this).contains(localInteger))
                      continue;
                    ap.c(ap.this).add(localInteger);
                  }
                  ap.d(ap.this).notifyDataSetChanged();
                  if (ap.e(ap.this) != null)
                    ap.e(ap.this).a(ap.c(ap.this), true);
                }
              });
              ap.this.a((g)localObject);
              return;
            }
          }
        });
        this.d.a().b(1, 2130838095);
        this.b = new FrameLayout(paramContext);
        localFrameLayout = (FrameLayout)this.b;
        Object localObject = new TextView(paramContext);
        ((TextView)localObject).setTextColor(-8355712);
        ((TextView)localObject).setTextSize(20.0F);
        ((TextView)localObject).setGravity(17);
        ((TextView)localObject).setVisibility(4);
        ((TextView)localObject).setText(r.a("NoContacts", 2131231492));
        localFrameLayout.addView((View)localObject);
        FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)((TextView)localObject).getLayoutParams();
        localLayoutParams.width = -1;
        localLayoutParams.height = -1;
        localLayoutParams.gravity = 48;
        ((TextView)localObject).setLayoutParams(localLayoutParams);
        ((TextView)localObject).setOnTouchListener(new View.OnTouchListener()
        {
          public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
          {
            return true;
          }
        });
        this.i = new ListView(paramContext);
        this.i.setEmptyView((View)localObject);
        this.i.setVerticalScrollBarEnabled(false);
        this.i.setDivider(null);
        this.i.setDividerHeight(0);
        localObject = this.i;
        paramContext = new a(paramContext);
        this.j = paramContext;
        ((ListView)localObject).setAdapter(paramContext);
        paramContext = this.i;
        if (!r.a)
          break label418;
      }
    label418: for (int i1 = 1; ; i1 = 2)
    {
      paramContext.setVerticalScrollbarPosition(i1);
      localFrameLayout.addView(this.i);
      paramContext = (FrameLayout.LayoutParams)this.i.getLayoutParams();
      paramContext.width = -1;
      paramContext.height = -1;
      this.i.setLayoutParams(paramContext);
      this.i.setOnItemClickListener(new AdapterView.OnItemClickListener()
      {
        public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
        {
          if (paramInt < ap.c(ap.this).size())
          {
            paramAdapterView = new Bundle();
            paramAdapterView.putInt("user_id", ((Integer)ap.c(ap.this).get(paramInt)).intValue());
            ap.this.a(new aq(paramAdapterView));
          }
        }
      });
      this.i.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener()
      {
        public boolean onItemLongClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
        {
          if ((paramInt < 0) || (paramInt >= ap.c(ap.this).size()) || (ap.this.l() == null))
            return true;
          ap.a(ap.this, ((Integer)ap.c(ap.this).get(paramInt)).intValue());
          paramAdapterView = new AlertDialog.Builder(ap.this.l());
          paramView = r.a("Delete", 2131231117);
          1 local1 = new DialogInterface.OnClickListener()
          {
            public void onClick(DialogInterface paramDialogInterface, int paramInt)
            {
              if (paramInt == 0)
              {
                ap.c(ap.this).remove(Integer.valueOf(ap.f(ap.this)));
                ap.d(ap.this).notifyDataSetChanged();
                if (ap.e(ap.this) != null)
                  ap.e(ap.this).a(ap.c(ap.this), false);
              }
            }
          };
          paramAdapterView.setItems(new CharSequence[] { paramView }, local1);
          ap.this.b(paramAdapterView.create());
          return true;
        }
      });
      return this.b;
      this.d.setTitle(r.a("NeverAllow", 2131231470));
      break;
      if (this.n)
      {
        this.d.setTitle(r.a("AlwaysShareWithTitle", 2131230842));
        break;
      }
      this.d.setTitle(r.a("NeverShareWithTitle", 2131231474));
      break;
    }
  }

  public void a(int paramInt, Object[] paramArrayOfObject)
  {
    if (paramInt == org.vidogram.messenger.y.b)
    {
      paramInt = ((Integer)paramArrayOfObject[0]).intValue();
      if (((paramInt & 0x2) != 0) || ((paramInt & 0x1) != 0))
        a(paramInt);
    }
  }

  public void a(b paramb)
  {
    this.o = paramb;
  }

  public boolean f()
  {
    super.f();
    org.vidogram.messenger.y.a().a(this, org.vidogram.messenger.y.b);
    return true;
  }

  public void g()
  {
    super.g();
    org.vidogram.messenger.y.a().b(this, org.vidogram.messenger.y.b);
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
      if (ap.c(ap.this).isEmpty())
        return 0;
      return ap.c(ap.this).size() + 1;
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
      if (paramInt == ap.c(ap.this).size())
        return 1;
      return 0;
    }

    public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      int i = getItemViewType(paramInt);
      if (i == 0)
      {
        if (paramView != null)
          break label171;
        paramView = new bh(this.b, 1, 0, false);
      }
      label171: 
      while (true)
      {
        g.vw localvw = v.a().a((Integer)ap.c(ap.this).get(paramInt));
        bh localbh = (bh)paramView;
        if ((localvw.i != null) && (localvw.i.length() != 0));
        for (paramViewGroup = b.a().e("+" + localvw.i); ; paramViewGroup = r.a("NumberUnknown", 2131231603))
        {
          localbh.a(localvw, null, paramViewGroup, 0);
          return paramView;
        }
        if ((i == 1) && (paramView == null))
        {
          paramView = new be(this.b);
          ((be)paramView).setText(r.a("RemoveFromListText", 2131231712));
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
      return ap.c(ap.this).isEmpty();
    }

    public boolean isEnabled(int paramInt)
    {
      return paramInt != ap.c(ap.this).size();
    }
  }

  public static abstract interface b
  {
    public abstract void a(ArrayList<Integer> paramArrayList, boolean paramBoolean);
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.ap
 * JD-Core Version:    0.6.0
 */