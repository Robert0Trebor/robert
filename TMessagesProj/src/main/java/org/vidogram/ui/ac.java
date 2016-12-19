package org.vidogram.ui;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Timer;
import java.util.TimerTask;
import org.vidogram.messenger.Utilities;
import org.vidogram.messenger.h;
import org.vidogram.messenger.n;
import org.vidogram.messenger.r;
import org.vidogram.messenger.r.a;
import org.vidogram.ui.a.a.a;
import org.vidogram.ui.a.b;
import org.vidogram.ui.a.c;
import org.vidogram.ui.a.d;
import org.vidogram.ui.a.d.b;
import org.vidogram.ui.a.g;
import org.vidogram.ui.c.bg;

public class ac extends g
{
  public ArrayList<r.a> i;
  private org.vidogram.ui.b.a j;
  private ListView k;
  private boolean l;
  private boolean m;
  private org.vidogram.ui.b.a n;
  private TextView o;
  private Timer p;

  private void a(ArrayList<r.a> paramArrayList)
  {
    org.vidogram.messenger.a.a(new Runnable(paramArrayList)
    {
      public void run()
      {
        ac.this.i = this.a;
        ac.d(ac.this).notifyDataSetChanged();
      }
    });
  }

  private void b(String paramString)
  {
    Utilities.e.b(new Runnable(paramString)
    {
      public void run()
      {
        if (this.a.trim().toLowerCase().length() == 0)
        {
          ac.a(ac.this, new ArrayList());
          return;
        }
        System.currentTimeMillis();
        ArrayList localArrayList = new ArrayList();
        Iterator localIterator = r.a().k.iterator();
        while (localIterator.hasNext())
        {
          r.a locala = (r.a)localIterator.next();
          if ((!locala.a.toLowerCase().startsWith(this.a)) && (!locala.b.toLowerCase().startsWith(this.a)))
            continue;
          localArrayList.add(locala);
        }
        ac.a(ac.this, localArrayList);
      }
    });
  }

  public View a(Context paramContext)
  {
    this.m = false;
    this.l = false;
    this.d.setAllowOverlayTitle(true);
    this.d.setTitle(r.a("Language", 2131231344));
    if (new itman.robert.a().c(paramContext))
    {
      this.d.setBackButtonImage(2130837794);
      this.d.setActionBarMenuOnItemClick(new a.a()
      {
        public void a(int paramInt)
        {
          if (paramInt == -1)
            ac.this.d();
        }
      });
    }
    this.d.a().b(0, 2130837806).d(true).a(new d.b()
    {
      public void a()
      {
        ac.a(ac.this, true);
      }

      public void a(EditText paramEditText)
      {
        paramEditText = paramEditText.getText().toString();
        ac.this.a(paramEditText);
        if (paramEditText.length() != 0)
        {
          ac.b(ac.this, true);
          if (ac.a(ac.this) != null)
            ac.a(ac.this).setAdapter(ac.d(ac.this));
        }
      }

      public void c()
      {
        ac.this.a(null);
        ac.a(ac.this, false);
        ac.b(ac.this, false);
        if (ac.a(ac.this) != null)
        {
          ac.b(ac.this).setVisibility(8);
          ac.a(ac.this).setAdapter(ac.c(ac.this));
        }
      }
    }).getSearchField().setHint(r.a("Search", 2131231766));
    this.j = new a(paramContext);
    this.n = new b(paramContext);
    this.b = new FrameLayout(paramContext);
    Object localObject1 = new LinearLayout(paramContext);
    ((LinearLayout)localObject1).setVisibility(4);
    ((LinearLayout)localObject1).setOrientation(1);
    ((FrameLayout)this.b).addView((View)localObject1);
    Object localObject2 = (FrameLayout.LayoutParams)((LinearLayout)localObject1).getLayoutParams();
    ((FrameLayout.LayoutParams)localObject2).width = -1;
    ((FrameLayout.LayoutParams)localObject2).height = -1;
    ((FrameLayout.LayoutParams)localObject2).gravity = 48;
    ((LinearLayout)localObject1).setLayoutParams((ViewGroup.LayoutParams)localObject2);
    ((LinearLayout)localObject1).setOnTouchListener(new View.OnTouchListener()
    {
      public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
      {
        return true;
      }
    });
    this.o = new TextView(paramContext);
    this.o.setTextColor(-8355712);
    this.o.setTextSize(20.0F);
    this.o.setGravity(17);
    this.o.setText(r.a("NoResult", 2131231509));
    ((LinearLayout)localObject1).addView(this.o);
    localObject2 = (LinearLayout.LayoutParams)this.o.getLayoutParams();
    ((LinearLayout.LayoutParams)localObject2).width = -1;
    ((LinearLayout.LayoutParams)localObject2).height = -1;
    ((LinearLayout.LayoutParams)localObject2).weight = 0.5F;
    this.o.setLayoutParams((ViewGroup.LayoutParams)localObject2);
    localObject2 = new FrameLayout(paramContext);
    ((LinearLayout)localObject1).addView((View)localObject2);
    LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)((FrameLayout)localObject2).getLayoutParams();
    localLayoutParams.width = -1;
    localLayoutParams.height = -1;
    localLayoutParams.weight = 0.5F;
    ((FrameLayout)localObject2).setLayoutParams(localLayoutParams);
    this.k = new ListView(paramContext);
    this.k.setEmptyView((View)localObject1);
    this.k.setVerticalScrollBarEnabled(false);
    this.k.setDivider(null);
    this.k.setDividerHeight(0);
    this.k.setAdapter(this.j);
    ((FrameLayout)this.b).addView(this.k);
    localObject1 = (FrameLayout.LayoutParams)this.k.getLayoutParams();
    ((FrameLayout.LayoutParams)localObject1).width = -1;
    ((FrameLayout.LayoutParams)localObject1).height = -1;
    this.k.setLayoutParams((ViewGroup.LayoutParams)localObject1);
    this.k.setOnItemClickListener(new AdapterView.OnItemClickListener(paramContext)
    {
      public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
      {
        paramView = null;
        if ((ac.e(ac.this)) && (ac.f(ac.this)))
        {
          paramAdapterView = paramView;
          if (paramInt >= 0)
          {
            paramAdapterView = paramView;
            if (paramInt < ac.this.i.size())
              paramAdapterView = (r.a)ac.this.i.get(paramInt);
          }
        }
        while (true)
        {
          if (paramAdapterView != null)
          {
            r.a().a(paramAdapterView, true);
            ac.g(ac.this).b(false);
          }
          if (!new itman.robert.a().c(this.a))
            break;
          ac.this.d();
          return;
          paramAdapterView = paramView;
          if (paramInt < 0)
            continue;
          paramAdapterView = paramView;
          if (paramInt >= r.a().k.size())
            continue;
          paramAdapterView = (r.a)r.a().k.get(paramInt);
        }
        new itman.robert.a().b(this.a, true);
        ac.this.e();
        ((Activity)this.a).finish();
        paramAdapterView = new Intent(this.a, LaunchActivity.class);
        this.a.startActivity(paramAdapterView);
      }
    });
    this.k.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener()
    {
      public boolean onItemLongClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
      {
        if ((ac.e(ac.this)) && (ac.f(ac.this)))
        {
          if ((paramInt < 0) || (paramInt >= ac.this.i.size()))
            break label197;
          paramAdapterView = (r.a)ac.this.i.get(paramInt);
        }
        while (true)
        {
          if ((paramAdapterView == null) || (paramAdapterView.d == null) || (ac.this.l() == null))
          {
            return false;
            if ((paramInt >= 0) && (paramInt < r.a().k.size()))
            {
              paramAdapterView = (r.a)r.a().k.get(paramInt);
              continue;
            }
          }
          else
          {
            paramView = new AlertDialog.Builder(ac.this.l());
            paramView.setMessage(r.a("DeleteLocalization", 2131231130));
            paramView.setTitle(r.a("AppName", 2131230856));
            paramView.setPositiveButton(r.a("Delete", 2131231117), new DialogInterface.OnClickListener(paramAdapterView)
            {
              public void onClick(DialogInterface paramDialogInterface, int paramInt)
              {
                if (r.a().a(this.a))
                {
                  if (ac.this.i != null)
                    ac.this.i.remove(this.a);
                  if (ac.c(ac.this) != null)
                    ac.c(ac.this).notifyDataSetChanged();
                  if (ac.d(ac.this) != null)
                    ac.d(ac.this).notifyDataSetChanged();
                }
              }
            });
            paramView.setNegativeButton(r.a("Cancel", 2131230943), null);
            ac.this.b(paramView.create());
            return true;
          }
          label197: paramAdapterView = null;
        }
      }
    });
    this.k.setOnScrollListener(new AbsListView.OnScrollListener()
    {
      public void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
      {
      }

      public void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
      {
        if ((paramInt == 1) && (ac.e(ac.this)) && (ac.f(ac.this)))
          org.vidogram.messenger.a.b(ac.this.l().getCurrentFocus());
      }
    });
    return (View)(View)this.b;
  }

  public void a(String paramString)
  {
    if (paramString == null)
    {
      this.i = null;
      return;
    }
    try
    {
      if (this.p != null)
        this.p.cancel();
      this.p = new Timer();
      this.p.schedule(new TimerTask(paramString)
      {
        public void run()
        {
          try
          {
            ac.h(ac.this).cancel();
            ac.a(ac.this, null);
            ac.a(ac.this, this.a);
            return;
          }
          catch (Exception localException)
          {
            while (true)
              n.a("tmessages", localException);
          }
        }
      }
      , 100L, 300L);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        n.a("tmessages", localException);
    }
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
      return true;
    }

    public int getCount()
    {
      if (r.a().k == null)
        return 0;
      return r.a().k.size();
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
      return 0;
    }

    public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      if (paramView == null)
        paramView = new bg(this.b);
      while (true)
      {
        Object localObject = (r.a)r.a().k.get(paramInt);
        paramViewGroup = (bg)paramView;
        localObject = ((r.a)localObject).a;
        if (paramInt != r.a().k.size() - 1);
        for (boolean bool = true; ; bool = false)
        {
          paramViewGroup.a((String)localObject, bool);
          return paramView;
        }
      }
    }

    public int getViewTypeCount()
    {
      return 1;
    }

    public boolean hasStableIds()
    {
      return false;
    }

    public boolean isEmpty()
    {
      return (r.a().k == null) || (r.a().k.size() == 0);
    }

    public boolean isEnabled(int paramInt)
    {
      return true;
    }
  }

  private class b extends org.vidogram.ui.b.a
  {
    private Context b;

    public b(Context arg2)
    {
      Object localObject;
      this.b = localObject;
    }

    public boolean areAllItemsEnabled()
    {
      return true;
    }

    public int getCount()
    {
      if (ac.this.i == null)
        return 0;
      return ac.this.i.size();
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
      return 0;
    }

    public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      if (paramView == null)
        paramView = new bg(this.b);
      while (true)
      {
        Object localObject = (r.a)ac.this.i.get(paramInt);
        paramViewGroup = (bg)paramView;
        localObject = ((r.a)localObject).a;
        if (paramInt != ac.this.i.size() - 1);
        for (boolean bool = true; ; bool = false)
        {
          paramViewGroup.a((String)localObject, bool);
          return paramView;
        }
      }
    }

    public int getViewTypeCount()
    {
      return 1;
    }

    public boolean hasStableIds()
    {
      return false;
    }

    public boolean isEmpty()
    {
      return (ac.this.i == null) || (ac.this.i.size() == 0);
    }

    public boolean isEnabled(int paramInt)
    {
      return true;
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.ac
 * JD-Core Version:    0.6.0
 */