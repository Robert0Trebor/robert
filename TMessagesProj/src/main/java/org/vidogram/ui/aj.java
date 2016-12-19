package org.vidogram.ui;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Build.VERSION;
import android.text.TextUtils.TruncateAt;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import org.vidogram.messenger.ApplicationLoader;
import org.vidogram.messenger.MediaController;
import org.vidogram.messenger.MediaController.a;
import org.vidogram.messenger.MediaController.i;
import org.vidogram.messenger.MediaController.j;
import org.vidogram.messenger.r;
import org.vidogram.messenger.w;
import org.vidogram.messenger.y;
import org.vidogram.messenger.y.b;
import org.vidogram.tgnet.g.ab;
import org.vidogram.ui.Components.am;
import org.vidogram.ui.a.a.a;
import org.vidogram.ui.a.c;
import org.vidogram.ui.a.d;
import org.vidogram.ui.a.g;
import org.vidogram.ui.c.ah;
import org.vidogram.ui.c.ah.b;

public class aj extends g
  implements y.b
{
  private boolean A;
  private boolean B;
  private boolean C;
  private int D;
  private q E;
  private b F;
  private ArrayList<MediaController.a> i = null;
  private ArrayList<MediaController.a> j = null;
  private HashMap<Integer, MediaController.i> k = new HashMap();
  private HashMap<String, MediaController.j> l = new HashMap();
  private HashMap<String, MediaController.j> m = new HashMap();
  private HashMap<String, MediaController.j> n = new HashMap();
  private ArrayList<MediaController.j> o = new ArrayList();
  private ArrayList<MediaController.j> p = new ArrayList();
  private boolean q = false;
  private int r = 2;
  private ListView s;
  private a t;
  private FrameLayout u;
  private TextView v;
  private TextView w;
  private d x;
  private am y;
  private boolean z;

  public aj(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, q paramq)
  {
    this.E = paramq;
    this.A = paramBoolean1;
    this.B = paramBoolean2;
    this.C = paramBoolean3;
  }

  private void a(MediaController.a parama, int paramInt)
  {
    Object localObject2 = null;
    Object localObject1 = localObject2;
    if (parama == null)
    {
      if (paramInt != 0)
        break label69;
      localObject1 = this.o;
    }
    while (true)
    {
      parama = new al(paramInt, parama, this.k, this.l, (ArrayList)localObject1, this.A, this.C, this.E);
      parama.a(new al.b()
      {
        public void a()
        {
          if (aj.j(aj.this) != null)
            aj.j(aj.this).a(aj.k(aj.this).size() + aj.l(aj.this).size(), true);
        }

        public void a(boolean paramBoolean)
        {
          aj.this.e();
          if (!paramBoolean)
            aj.g(aj.this);
        }

        public boolean a(String paramString)
        {
          aj.this.e();
          return aj.a(aj.this).a(paramString);
        }
      });
      a(parama);
      return;
      label69: localObject1 = localObject2;
      if (paramInt != 1)
        continue;
      localObject1 = this.p;
    }
  }

  private void q()
  {
    if (((this.k.isEmpty()) && (this.l.isEmpty())) || (this.F == null) || (this.z))
      return;
    this.z = true;
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    ArrayList localArrayList3 = new ArrayList();
    Object localObject2 = this.k.entrySet().iterator();
    Object localObject1;
    while (((Iterator)localObject2).hasNext())
    {
      localObject3 = (MediaController.i)((Map.Entry)((Iterator)localObject2).next()).getValue();
      if (((MediaController.i)localObject3).g != null)
      {
        localArrayList1.add(((MediaController.i)localObject3).g);
        if (((MediaController.i)localObject3).i != null)
        {
          localObject1 = ((MediaController.i)localObject3).i.toString();
          label149: localArrayList2.add(localObject1);
          if (((MediaController.i)localObject3).j.isEmpty())
            break label195;
        }
        label195: for (localObject1 = new ArrayList(((MediaController.i)localObject3).j); ; localObject1 = null)
        {
          localArrayList3.add(localObject1);
          break;
          localObject1 = null;
          break label149;
        }
      }
      if (((MediaController.i)localObject3).d == null)
        continue;
      localArrayList1.add(((MediaController.i)localObject3).d);
      if (((MediaController.i)localObject3).i != null)
      {
        localObject1 = ((MediaController.i)localObject3).i.toString();
        label238: localArrayList2.add(localObject1);
        if (((MediaController.i)localObject3).j.isEmpty())
          break label284;
      }
      label284: for (localObject1 = new ArrayList(((MediaController.i)localObject3).j); ; localObject1 = null)
      {
        localArrayList3.add(localObject1);
        break;
        localObject1 = null;
        break label238;
      }
    }
    localObject2 = new ArrayList();
    Object localObject3 = this.l.entrySet().iterator();
    int i1 = 0;
    int i2 = 0;
    if (((Iterator)localObject3).hasNext())
    {
      MediaController.j localj = (MediaController.j)((Map.Entry)((Iterator)localObject3).next()).getValue();
      if (localj.k != null)
      {
        localArrayList1.add(localj.k);
        if (localj.l != null)
        {
          localObject1 = localj.l.toString();
          label384: localArrayList2.add(localObject1);
          if (localj.n.isEmpty())
            break label491;
          localObject1 = new ArrayList(localj.n);
          label415: localArrayList3.add(localObject1);
          label422: localj.i = (int)(System.currentTimeMillis() / 1000L);
          if (localj.h != 0)
            break label520;
          localObject1 = (MediaController.j)this.m.get(localj.a);
          if (localObject1 == null)
            break label507;
          this.o.remove(localObject1);
          this.o.add(0, localObject1);
          label481: i1 = 1;
        }
      }
      while (true)
      {
        break;
        localObject1 = null;
        break label384;
        label491: localObject1 = null;
        break label415;
        ((ArrayList)localObject2).add(localj);
        break label422;
        label507: this.o.add(0, localj);
        break label481;
        label520: if (localj.h == 1)
        {
          i2 = 1;
          localObject1 = (MediaController.j)this.n.get(localj.a);
          if (localObject1 != null)
          {
            this.p.remove(localObject1);
            this.p.add(0, localObject1);
            i2 = 1;
            continue;
          }
          this.p.add(0, localj);
        }
      }
    }
    if (i1 != 0)
      w.a().a(this.o);
    if (i2 != 0)
      w.a().a(this.p);
    this.F.a(localArrayList1, localArrayList2, localArrayList3, (ArrayList)localObject2);
  }

  private void r()
  {
    if (this.s != null)
      this.s.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener()
      {
        public boolean onPreDraw()
        {
          aj.h(aj.this);
          if (aj.i(aj.this) != null)
            aj.i(aj.this).getViewTreeObserver().removeOnPreDrawListener(this);
          return true;
        }
      });
  }

  private void s()
  {
    if (l() == null);
    do
    {
      return;
      i1 = ((WindowManager)ApplicationLoader.a.getSystemService("window")).getDefaultDisplay().getRotation();
      this.r = 2;
      if ((!org.vidogram.messenger.a.c()) && ((i1 == 3) || (i1 == 1)))
        this.r = 4;
      this.t.notifyDataSetChanged();
    }
    while (this.x == null);
    FrameLayout.LayoutParams localLayoutParams;
    if (!org.vidogram.messenger.a.c())
    {
      localLayoutParams = (FrameLayout.LayoutParams)this.x.getLayoutParams();
      if (Build.VERSION.SDK_INT < 21)
        break label144;
    }
    label144: for (int i1 = org.vidogram.messenger.a.a; ; i1 = 0)
    {
      localLayoutParams.topMargin = i1;
      this.x.setLayoutParams(localLayoutParams);
      if ((org.vidogram.messenger.a.c()) || (ApplicationLoader.a.getResources().getConfiguration().orientation != 2))
        break;
      this.w.setTextSize(18.0F);
      return;
    }
    this.w.setTextSize(20.0F);
  }

  public View a(Context paramContext)
  {
    this.d.setBackgroundColor(-13421773);
    this.d.setItemsBackgroundColor(-12763843);
    this.d.setBackButtonImage(2130837794);
    this.d.setActionBarMenuOnItemClick(new a.a()
    {
      public void a(int paramInt)
      {
        if (paramInt == -1)
          aj.this.d();
        do
          while (true)
          {
            return;
            if (paramInt == 1)
            {
              if (aj.a(aj.this) == null)
                continue;
              aj.this.a(false);
              aj.a(aj.this).a();
              return;
            }
            if (paramInt != 2)
              break;
            if (aj.b(aj.this) == 0)
              continue;
            aj.a(aj.this, 0);
            aj.c(aj.this).setText(r.a("PickerPhotos", 2131231680));
            aj.d(aj.this).setText(r.a("NoPhotos", 2131231503));
            aj.e(aj.this).notifyDataSetChanged();
            return;
          }
        while ((paramInt != 3) || (aj.b(aj.this) == 1));
        aj.a(aj.this, 1);
        aj.c(aj.this).setText(r.a("PickerVideo", 2131231681));
        aj.d(aj.this).setText(r.a("NoVideo", 2131231519));
        aj.e(aj.this).notifyDataSetChanged();
      }
    });
    Object localObject = this.d.a();
    ((c)localObject).b(1, 2130837803);
    this.b = new FrameLayout(paramContext);
    FrameLayout localFrameLayout = (FrameLayout)this.b;
    localFrameLayout.setBackgroundColor(-16777216);
    int i1;
    if (!this.A)
    {
      this.D = 0;
      this.x = new d(paramContext, (c)localObject, 0);
      this.x.setSubMenuOpenSide(1);
      this.x.a(2, r.a("PickerPhotos", 2131231680), 0);
      this.x.a(3, r.a("PickerVideo", 2131231681), 0);
      this.d.addView(this.x);
      localObject = (FrameLayout.LayoutParams)this.x.getLayoutParams();
      ((FrameLayout.LayoutParams)localObject).height = -1;
      ((FrameLayout.LayoutParams)localObject).width = -2;
      ((FrameLayout.LayoutParams)localObject).rightMargin = org.vidogram.messenger.a.a(40.0F);
      if (org.vidogram.messenger.a.c())
      {
        i1 = org.vidogram.messenger.a.a(64.0F);
        ((FrameLayout.LayoutParams)localObject).leftMargin = i1;
        ((FrameLayout.LayoutParams)localObject).gravity = 51;
        this.x.setLayoutParams((ViewGroup.LayoutParams)localObject);
        this.x.setOnClickListener(new View.OnClickListener()
        {
          public void onClick(View paramView)
          {
            aj.f(aj.this).b();
          }
        });
        this.w = new TextView(paramContext);
        this.w.setGravity(3);
        this.w.setSingleLine(true);
        this.w.setLines(1);
        this.w.setMaxLines(1);
        this.w.setEllipsize(TextUtils.TruncateAt.END);
        this.w.setTextColor(-1);
        this.w.setTypeface(org.vidogram.messenger.a.a("fonts/rmedium.ttf"));
        this.w.setCompoundDrawablesWithIntrinsicBounds(0, 0, 2130837814, 0);
        this.w.setCompoundDrawablePadding(org.vidogram.messenger.a.a(4.0F));
        this.w.setPadding(0, 0, org.vidogram.messenger.a.a(10.0F), 0);
        this.w.setText(r.a("PickerPhotos", 2131231680));
        this.x.addView(this.w);
        localObject = (FrameLayout.LayoutParams)this.w.getLayoutParams();
        ((FrameLayout.LayoutParams)localObject).width = -2;
        ((FrameLayout.LayoutParams)localObject).height = -2;
        ((FrameLayout.LayoutParams)localObject).leftMargin = org.vidogram.messenger.a.a(16.0F);
        ((FrameLayout.LayoutParams)localObject).gravity = 16;
        this.w.setLayoutParams((ViewGroup.LayoutParams)localObject);
        label458: this.s = new ListView(paramContext);
        this.s.setPadding(org.vidogram.messenger.a.a(4.0F), 0, org.vidogram.messenger.a.a(4.0F), org.vidogram.messenger.a.a(4.0F));
        this.s.setClipToPadding(false);
        this.s.setHorizontalScrollBarEnabled(false);
        this.s.setVerticalScrollBarEnabled(false);
        this.s.setSelector(new ColorDrawable(0));
        this.s.setDividerHeight(0);
        this.s.setDivider(null);
        this.s.setDrawingCacheEnabled(false);
        this.s.setScrollingCacheEnabled(false);
        localFrameLayout.addView(this.s);
        localObject = (FrameLayout.LayoutParams)this.s.getLayoutParams();
        ((FrameLayout.LayoutParams)localObject).width = -1;
        ((FrameLayout.LayoutParams)localObject).height = -1;
        ((FrameLayout.LayoutParams)localObject).bottomMargin = org.vidogram.messenger.a.a(48.0F);
        this.s.setLayoutParams((ViewGroup.LayoutParams)localObject);
        localObject = this.s;
        a locala = new a(paramContext);
        this.t = locala;
        ((ListView)localObject).setAdapter(locala);
        org.vidogram.messenger.a.a(this.s, -13421773);
        this.v = new TextView(paramContext);
        this.v.setTextColor(-8355712);
        this.v.setTextSize(20.0F);
        this.v.setGravity(17);
        this.v.setVisibility(8);
        this.v.setText(r.a("NoPhotos", 2131231503));
        localFrameLayout.addView(this.v);
        localObject = (FrameLayout.LayoutParams)this.v.getLayoutParams();
        ((FrameLayout.LayoutParams)localObject).width = -1;
        ((FrameLayout.LayoutParams)localObject).height = -1;
        ((FrameLayout.LayoutParams)localObject).bottomMargin = org.vidogram.messenger.a.a(48.0F);
        this.v.setLayoutParams((ViewGroup.LayoutParams)localObject);
        this.v.setOnTouchListener(new View.OnTouchListener()
        {
          public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
          {
            return true;
          }
        });
        this.u = new FrameLayout(paramContext);
        this.u.setVisibility(8);
        localFrameLayout.addView(this.u);
        localObject = (FrameLayout.LayoutParams)this.u.getLayoutParams();
        ((FrameLayout.LayoutParams)localObject).width = -1;
        ((FrameLayout.LayoutParams)localObject).height = -1;
        ((FrameLayout.LayoutParams)localObject).bottomMargin = org.vidogram.messenger.a.a(48.0F);
        this.u.setLayoutParams((ViewGroup.LayoutParams)localObject);
        localObject = new ProgressBar(paramContext);
        this.u.addView((View)localObject);
        localObject = (FrameLayout.LayoutParams)this.u.getLayoutParams();
        ((FrameLayout.LayoutParams)localObject).width = -2;
        ((FrameLayout.LayoutParams)localObject).height = -2;
        ((FrameLayout.LayoutParams)localObject).gravity = 17;
        this.u.setLayoutParams((ViewGroup.LayoutParams)localObject);
        this.y = new am(paramContext);
        localFrameLayout.addView(this.y);
        paramContext = (FrameLayout.LayoutParams)this.y.getLayoutParams();
        paramContext.width = -1;
        paramContext.height = org.vidogram.messenger.a.a(48.0F);
        paramContext.gravity = 80;
        this.y.setLayoutParams(paramContext);
        this.y.b.setOnClickListener(new View.OnClickListener()
        {
          public void onClick(View paramView)
          {
            aj.this.d();
          }
        });
        this.y.a.setOnClickListener(new View.OnClickListener()
        {
          public void onClick(View paramView)
          {
            aj.g(aj.this);
            aj.this.d();
          }
        });
        if ((!this.q) || ((this.i != null) && ((this.i == null) || (!this.i.isEmpty()))))
          break label1126;
        this.u.setVisibility(0);
        this.s.setEmptyView(null);
      }
    }
    while (true)
    {
      this.y.a(this.k.size() + this.l.size(), true);
      return this.b;
      i1 = org.vidogram.messenger.a.a(56.0F);
      break;
      this.d.setTitle(r.a("Gallery", 2131231272));
      break label458;
      label1126: this.u.setVisibility(8);
      this.s.setEmptyView(this.v);
    }
  }

  public void a(int paramInt, Object[] paramArrayOfObject)
  {
    if (paramInt == y.aM)
    {
      paramInt = ((Integer)paramArrayOfObject[0]).intValue();
      if (this.e == paramInt)
      {
        this.i = ((ArrayList)paramArrayOfObject[1]);
        this.j = ((ArrayList)paramArrayOfObject[3]);
        if (this.u != null)
          this.u.setVisibility(8);
        if ((this.s != null) && (this.s.getEmptyView() == null))
          this.s.setEmptyView(this.v);
        if (this.t != null)
          this.t.notifyDataSetChanged();
        this.q = false;
      }
    }
    while (true)
    {
      return;
      if (paramInt == y.d)
      {
        e();
        return;
      }
      if (paramInt != y.F)
        continue;
      paramInt = ((Integer)paramArrayOfObject[0]).intValue();
      MediaController.j localj;
      if (paramInt == 0)
      {
        this.o = ((ArrayList)paramArrayOfObject[1]);
        this.m.clear();
        paramArrayOfObject = this.o.iterator();
        while (paramArrayOfObject.hasNext())
        {
          localj = (MediaController.j)paramArrayOfObject.next();
          this.m.put(localj.a, localj);
        }
        continue;
      }
      if (paramInt != 1)
        continue;
      this.p = ((ArrayList)paramArrayOfObject[1]);
      this.n.clear();
      paramArrayOfObject = this.p.iterator();
      while (paramArrayOfObject.hasNext())
      {
        localj = (MediaController.j)paramArrayOfObject.next();
        this.n.put(localj.a, localj);
      }
    }
  }

  public void a(Configuration paramConfiguration)
  {
    super.a(paramConfiguration);
    r();
  }

  public void a(b paramb)
  {
    this.F = paramb;
  }

  public boolean f()
  {
    this.q = true;
    MediaController.e(this.e);
    y.a().a(this, y.aM);
    y.a().a(this, y.F);
    y.a().a(this, y.d);
    return super.f();
  }

  public void g()
  {
    y.a().b(this, y.aM);
    y.a().b(this, y.F);
    y.a().b(this, y.d);
    super.g();
  }

  public void i()
  {
    super.i();
    if (this.t != null)
      this.t.notifyDataSetChanged();
    r();
  }

  public void j()
  {
    super.j();
    if (this.x != null)
      this.x.c();
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
      int j = 0;
      int i = 0;
      if ((aj.m(aj.this)) || (aj.b(aj.this) == 0))
        if (aj.m(aj.this))
          if (aj.n(aj.this) != null)
            i = (int)Math.ceil(aj.n(aj.this).size() / aj.o(aj.this));
      do
      {
        return i;
        i = j;
        if (aj.n(aj.this) != null)
          i = (int)Math.ceil(aj.n(aj.this).size() / aj.o(aj.this));
        return i + 1;
      }
      while (aj.p(aj.this) == null);
      return (int)Math.ceil(aj.p(aj.this).size() / aj.o(aj.this));
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
      int i = 1;
      if ((aj.m(aj.this)) || (aj.b(aj.this) == 1))
        i = 0;
      do
        return i;
      while (paramInt == 0);
      return 0;
    }

    public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      int i = getItemViewType(paramInt);
      if (i == 0)
      {
        label59: int j;
        if (paramView == null)
        {
          paramView = new ah(this.b);
          paramViewGroup = (ah)paramView;
          paramViewGroup.setDelegate(new ah.b()
          {
            public void a(MediaController.a parama)
            {
              aj.a(aj.this, parama, 0);
            }
          });
          paramViewGroup.setAlbumsCount(aj.o(aj.this));
          i = 0;
          if (i >= aj.o(aj.this))
            break label257;
          if ((!aj.m(aj.this)) && (aj.b(aj.this) != 1))
            break label179;
          j = aj.o(aj.this) * paramInt + i;
          label106: if ((!aj.m(aj.this)) && (aj.b(aj.this) != 0))
            break label208;
          if (j >= aj.n(aj.this).size())
            break label198;
          paramViewGroup.a(i, (MediaController.a)aj.n(aj.this).get(j));
        }
        while (true)
        {
          i += 1;
          break label59;
          paramViewGroup = (ah)paramView;
          break;
          label179: j = (paramInt - 1) * aj.o(aj.this) + i;
          break label106;
          label198: paramViewGroup.a(i, null);
          continue;
          label208: if (j < aj.p(aj.this).size())
          {
            paramViewGroup.a(i, (MediaController.a)aj.p(aj.this).get(j));
            continue;
          }
          paramViewGroup.a(i, null);
        }
        label257: paramViewGroup.requestLayout();
        paramViewGroup = paramView;
      }
      do
      {
        do
        {
          return paramViewGroup;
          paramViewGroup = paramView;
        }
        while (i != 1);
        paramViewGroup = paramView;
      }
      while (paramView != null);
      paramView = new org.vidogram.ui.c.aj(this.b, aj.q(aj.this));
      ((org.vidogram.ui.c.aj)paramView).setDelegate(new org.vidogram.ui.c.aj.a()
      {
        public void a(int paramInt)
        {
          aj.a(aj.this, null, paramInt);
        }
      });
      return paramView;
    }

    public int getViewTypeCount()
    {
      if ((aj.m(aj.this)) || (aj.b(aj.this) == 1))
        return 1;
      return 2;
    }

    public boolean hasStableIds()
    {
      return true;
    }

    public boolean isEmpty()
    {
      return getCount() == 0;
    }

    public boolean isEnabled(int paramInt)
    {
      return true;
    }
  }

  public static abstract interface b
  {
    public abstract void a();

    public abstract void a(ArrayList<String> paramArrayList1, ArrayList<String> paramArrayList2, ArrayList<ArrayList<g.ab>> paramArrayList, ArrayList<MediaController.j> paramArrayList3);

    public abstract boolean a(String paramString);
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.aj
 * JD-Core Version:    0.6.0
 */