package org.vidogram.ui;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewOutlineProvider;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import itman.robert.tabLayout.CommonTabLayout;
import itman.robert.tabLayout.widget.MsgView;
import java.util.ArrayList;
import org.vidogram.messenger.ApplicationLoader;
import org.vidogram.messenger.ad;
import org.vidogram.messenger.ae;
import org.vidogram.messenger.f;
import org.vidogram.messenger.p;
import org.vidogram.messenger.r;
import org.vidogram.messenger.support.widget.LinearLayoutManager;
import org.vidogram.messenger.support.widget.RecyclerView;
import org.vidogram.messenger.support.widget.RecyclerView.a;
import org.vidogram.messenger.support.widget.RecyclerView.l;
import org.vidogram.messenger.u;
import org.vidogram.messenger.w;
import org.vidogram.messenger.y;
import org.vidogram.messenger.y.b;
import org.vidogram.tgnet.g.hq;
import org.vidogram.tgnet.g.i;
import org.vidogram.tgnet.g.t;
import org.vidogram.tgnet.g.vw;
import org.vidogram.tgnet.g.z;
import org.vidogram.ui.Components.ao;
import org.vidogram.ui.Components.aw;
import org.vidogram.ui.Components.aw.b;
import org.vidogram.ui.Components.aw.c;
import org.vidogram.ui.a.a.a;
import org.vidogram.ui.a.c;
import org.vidogram.ui.a.d.b;
import org.vidogram.ui.a.h.d;
import org.vidogram.ui.a.l;
import org.vidogram.ui.b.j.c;
import org.vidogram.ui.c.ak;
import org.vidogram.ui.c.bh;
import org.vidogram.ui.c.x;

public class v extends org.vidogram.ui.a.g
  implements y.b
{
  public static boolean i;
  private String A;
  private String B;
  private String C;
  private int D;
  private boolean E;
  private boolean F;
  private boolean G;
  private long H;
  private String I;
  private long J;
  private boolean K;
  private a L;
  private org.vidogram.ui.a.d M;
  private FrameLayout N;
  private int[] O = { 2130837900, 2130837902, 2130837908, 2130837904, 2130837898 };
  private int[] P = { 2130837901, 2130837903, 2130837909, 2130837905, 2130837899 };
  private ArrayList<itman.robert.tabLayout.a.a> Q;
  private CommonTabLayout R;
  private FrameLayout S;
  private int T = this.P.length - 1;
  private boolean U;
  public Context j;
  private aw k;
  private LinearLayoutManager l;
  private org.vidogram.ui.b.i m;
  private org.vidogram.ui.b.j n;
  private org.vidogram.ui.Components.q o;
  private ProgressBar p;
  private LinearLayout q;
  private org.vidogram.ui.a.d r;
  private ImageView s;
  private AlertDialog t;
  private int u;
  private int v;
  private boolean w;
  private boolean x;
  private final AccelerateDecelerateInterpolator y = new AccelerateDecelerateInterpolator();
  private boolean z = true;

  public v(Bundle paramBundle)
  {
    super(paramBundle);
  }

  private void a(int paramInt)
  {
    if (this.k == null)
      return;
    if (paramInt == 256)
      v();
    int i3 = this.k.getChildCount();
    int i1 = 0;
    label30: Object localObject;
    boolean bool;
    if (i1 < i3)
    {
      localObject = this.k.getChildAt(i1);
      if (!(localObject instanceof org.vidogram.ui.c.n))
        break label215;
      if (this.k.getAdapter() != this.n)
      {
        localObject = (org.vidogram.ui.c.n)localObject;
        if ((paramInt & 0x800) == 0)
          break label145;
        ((org.vidogram.ui.c.n)localObject).e();
        if (((this.D == 0) || (this.D > 2)) && (org.vidogram.messenger.a.c()))
        {
          if (((org.vidogram.ui.c.n)localObject).getDialogId() != this.J)
            break label139;
          bool = true;
          label125: ((org.vidogram.ui.c.n)localObject).setDialogSelected(bool);
        }
      }
    }
    while (true)
    {
      i1 += 1;
      break label30;
      break;
      label139: bool = false;
      break label125;
      label145: if ((paramInt & 0x200) != 0)
      {
        if (((this.D != 0) && (this.D <= 2)) || (!org.vidogram.messenger.a.c()))
          continue;
        if (((org.vidogram.ui.c.n)localObject).getDialogId() == this.J);
        for (bool = true; ; bool = false)
        {
          ((org.vidogram.ui.c.n)localObject).setDialogSelected(bool);
          break;
        }
      }
      ((org.vidogram.ui.c.n)localObject).a(paramInt);
      continue;
      label215: if ((localObject instanceof bh))
      {
        ((bh)localObject).a(paramInt);
        continue;
      }
      if ((localObject instanceof ak))
      {
        ((ak)localObject).a(paramInt);
        continue;
      }
      if (!(localObject instanceof aw))
        continue;
      localObject = (aw)localObject;
      int i4 = ((aw)localObject).getChildCount();
      int i2 = 0;
      while (i2 < i4)
      {
        View localView = ((aw)localObject).getChildAt(i2);
        if ((localView instanceof x))
          ((x)localView).a(paramInt);
        i2 += 1;
      }
    }
  }

  private void a(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    if (paramInt2 == 0)
      this.R.a(paramInt1);
    MsgView localMsgView;
    do
    {
      return;
      this.R.a(paramInt1, paramInt2);
      this.R.a(paramInt1, -15.0F, 5.0F);
      localMsgView = this.R.b(paramInt1);
    }
    while (localMsgView == null);
    if (paramBoolean)
    {
      localMsgView.setBackgroundColor(Color.parseColor("#c7c7c7"));
      return;
    }
    localMsgView.setBackgroundColor(Color.parseColor("#4ecc5e"));
  }

  private void a(long paramLong, boolean paramBoolean1, boolean paramBoolean2)
  {
    AlertDialog.Builder localBuilder;
    if ((this.C == null) && ((int)paramLong < 0) && (org.vidogram.messenger.e.a(-(int)paramLong)) && ((this.K) || (!org.vidogram.messenger.e.b(-(int)paramLong))))
    {
      localBuilder = new AlertDialog.Builder(l());
      localBuilder.setTitle(r.a("AppName", 2131230856));
      localBuilder.setMessage(r.a("ChannelCantSendMessage", 2131230976));
      localBuilder.setNegativeButton(r.a("OK", 2131231604), null);
      b(localBuilder.create());
    }
    int i1;
    int i2;
    Object localObject;
    while (true)
    {
      return;
      if ((!paramBoolean1) || (((this.A == null) || (this.B == null)) && (this.C == null)))
        break label483;
      if (l() == null)
        continue;
      localBuilder = new AlertDialog.Builder(l());
      localBuilder.setTitle(r.a("AppName", 2131230856));
      i1 = (int)paramLong;
      i2 = (int)(paramLong >> 32);
      if (i1 == 0)
        break label421;
      if (i2 != 1)
        break;
      localObject = org.vidogram.messenger.v.a().b(Integer.valueOf(i1));
      if (localObject == null)
        continue;
      localBuilder.setMessage(r.a(this.B, new Object[] { ((g.i)localObject).i }));
    }
    while (true)
    {
      localBuilder.setPositiveButton(r.a("OK", 2131231604), new DialogInterface.OnClickListener(paramLong)
      {
        public void onClick(DialogInterface paramDialogInterface, int paramInt)
        {
          v.a(v.this, this.a, false, false);
        }
      });
      localBuilder.setNegativeButton(r.a("Cancel", 2131230943), null);
      b(localBuilder.create());
      return;
      if (i1 > 0)
      {
        localObject = org.vidogram.messenger.v.a().a(Integer.valueOf(i1));
        if (localObject == null)
          break;
        localBuilder.setMessage(r.a(this.A, new Object[] { ae.c((g.vw)localObject) }));
        continue;
      }
      if (i1 >= 0)
        continue;
      localObject = org.vidogram.messenger.v.a().b(Integer.valueOf(-i1));
      if (localObject == null)
        break;
      if (this.C != null)
      {
        localBuilder.setMessage(r.a(this.C, new Object[] { ((g.i)localObject).i }));
        continue;
      }
      localBuilder.setMessage(r.a(this.B, new Object[] { ((g.i)localObject).i }));
      continue;
      label421: localObject = org.vidogram.messenger.v.a().c(Integer.valueOf(i2));
      localObject = org.vidogram.messenger.v.a().a(Integer.valueOf(((g.t)localObject).m));
      if (localObject == null)
        break;
      localBuilder.setMessage(r.a(this.A, new Object[] { ae.c((g.vw)localObject) }));
    }
    label483: if (this.L != null)
    {
      this.L.a(this, paramLong, paramBoolean2);
      this.L = null;
      return;
    }
    d();
  }

  private void b(int paramInt)
  {
    this.T = paramInt;
    switch (paramInt)
    {
    default:
      return;
    case 0:
      c(5);
      return;
    case 1:
      c(3);
      return;
    case 2:
      c(2);
      return;
    case 3:
      c(4);
      return;
    case 4:
    }
    c(0);
  }

  private void b(boolean paramBoolean)
  {
    if (this.x == paramBoolean)
      return;
    this.x = paramBoolean;
    Object localObject = this.s;
    float f;
    ImageView localImageView;
    if (this.x)
    {
      f = org.vidogram.messenger.a.a(100.0F);
      localObject = ObjectAnimator.ofFloat(localObject, "translationY", new float[] { f }).setDuration(300L);
      ((ObjectAnimator)localObject).setInterpolator(this.y);
      localImageView = this.s;
      if (paramBoolean)
        break label91;
    }
    label91: for (paramBoolean = true; ; paramBoolean = false)
    {
      localImageView.setClickable(paramBoolean);
      ((ObjectAnimator)localObject).start();
      return;
      f = 0.0F;
      break;
    }
  }

  private void c(int paramInt)
  {
    this.D = paramInt;
    this.m.a = paramInt;
    this.m.c();
  }

  @TargetApi(23)
  private void r()
  {
    Activity localActivity = l();
    if (localActivity == null)
      return;
    ArrayList localArrayList = new ArrayList();
    if (localActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0)
    {
      localArrayList.add("android.permission.READ_CONTACTS");
      localArrayList.add("android.permission.WRITE_CONTACTS");
      localArrayList.add("android.permission.GET_ACCOUNTS");
    }
    if (localActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0)
    {
      localArrayList.add("android.permission.READ_EXTERNAL_STORAGE");
      localArrayList.add("android.permission.WRITE_EXTERNAL_STORAGE");
    }
    localActivity.requestPermissions((String[])localArrayList.toArray(new String[localArrayList.size()]), 1);
  }

  private ArrayList<g.hq> s()
  {
    if (this.D == 0)
      return org.vidogram.messenger.v.a().a;
    if (this.D == 1)
      return org.vidogram.messenger.v.a().b;
    if (this.D == 2)
      return org.vidogram.messenger.v.a().c;
    if (this.D == 3)
      return org.vidogram.messenger.v.a().M;
    if (this.D == 4)
      return org.vidogram.messenger.v.a().O;
    if (this.D == 5)
      return org.vidogram.messenger.v.a().N;
    if (this.D == 6)
      return org.vidogram.messenger.v.a().Q;
    return null;
  }

  private void t()
  {
    if (this.r == null)
      return;
    if ((ad.i.length() != 0) && (!this.E))
    {
      this.r.setVisibility(0);
      if (ad.k)
      {
        this.r.setIcon(2130837957);
        return;
      }
      this.r.setIcon(2130837958);
      return;
    }
    this.r.setVisibility(8);
  }

  private void u()
  {
    int i2 = 0;
    this.N = ((FrameLayout)LayoutInflater.from(this.j).inflate(2130968613, null, false));
    this.S = ((FrameLayout)this.N.findViewById(2131624066));
    this.b = this.N;
    this.Q = new ArrayList();
    int i1 = 0;
    while (i1 < this.P.length)
    {
      this.Q.add(new itman.robert.tabLayout.b(null, this.P[i1], this.O[i1]));
      i1 += 1;
    }
    this.R = ((CommonTabLayout)this.N.findViewById(2131624067));
    this.R.setBackgroundColor(l.a);
    this.R.setUnderlineColor(l.a);
    CommonTabLayout localCommonTabLayout = this.R;
    i1 = i2;
    if (this.U)
      i1 = 8;
    localCommonTabLayout.setVisibility(i1);
    this.R.setTabData(this.Q);
    this.R.setOnTabSelectListener(new itman.robert.tabLayout.a.b()
    {
      public void a(int paramInt)
      {
        v.d(v.this, paramInt);
        try
        {
          ((LinearLayoutManager)v.a(v.this).getLayoutManager()).a(0, 0);
          return;
        }
        catch (Exception localException)
        {
        }
      }

      public void b(int paramInt)
      {
      }
    });
    this.R.setCurrentTab(this.T);
    w();
  }

  private void v()
  {
    try
    {
      new b(null).execute(new String[0]);
      return;
    }
    catch (Exception localException)
    {
    }
  }

  private void w()
  {
    a(4, org.vidogram.messenger.v.a().U, org.vidogram.messenger.v.a().ab);
    a(3, org.vidogram.messenger.v.a().S, org.vidogram.messenger.v.a().Y);
    a(2, org.vidogram.messenger.v.a().R, org.vidogram.messenger.v.a().X);
    a(1, org.vidogram.messenger.v.a().T, org.vidogram.messenger.v.a().Z);
    a(0, org.vidogram.messenger.v.a().V, org.vidogram.messenger.v.a().aa);
  }

  public View a(Context paramContext)
  {
    int i2 = 1;
    this.E = false;
    this.F = false;
    this.j = paramContext;
    org.vidogram.messenger.a.a(new Runnable(paramContext)
    {
      public void run()
      {
        l.a(this.a);
      }
    });
    Object localObject1 = this.d.a();
    if ((!this.G) && (this.I == null))
    {
      this.r = ((c)localObject1).b(1, 2130837957);
      t();
    }
    label172: int i1;
    label301: label758: float f1;
    label989: label999: float f2;
    if (new itman.robert.a().a(ApplicationLoader.a))
    {
      this.M = ((c)localObject1).b(10, 2130837596);
      ((c)localObject1).b(0, 2130837806).d(true).a(new d.b()
      {
        public void a()
        {
          v.a(v.this, true);
          if (v.a(v.this) != null)
          {
            if (v.b(v.this) != null)
            {
              v.a(v.this).setEmptyView(v.c(v.this));
              v.d(v.this).setVisibility(8);
              v.e(v.this).setVisibility(8);
            }
            if (!v.f(v.this))
              v.g(v.this).setVisibility(8);
            if (!v.h(v.this))
              v.i(v.this).setVisibility(8);
          }
          v.j(v.this);
        }

        public void a(EditText paramEditText)
        {
          paramEditText = paramEditText.getText().toString();
          if ((paramEditText.length() != 0) || ((v.l(v.this) != null) && (v.l(v.this).i())))
          {
            v.b(v.this, true);
            if ((v.l(v.this) != null) && (v.a(v.this).getAdapter() != v.l(v.this)))
            {
              v.a(v.this).setAdapter(v.l(v.this));
              v.l(v.this).c();
            }
            if ((v.c(v.this) != null) && (v.a(v.this).getEmptyView() != v.c(v.this)))
            {
              v.e(v.this).setVisibility(8);
              v.d(v.this).setVisibility(8);
              v.c(v.this).b();
              v.a(v.this).setEmptyView(v.c(v.this));
            }
          }
          if (v.l(v.this) != null)
            v.l(v.this).a(paramEditText);
        }

        public boolean b()
        {
          if (v.b(v.this) != null)
          {
            v.this.d();
            return false;
          }
          return true;
        }

        public void c()
        {
          v.a(v.this, false);
          v.b(v.this, false);
          if (v.a(v.this) != null)
          {
            v.c(v.this).setVisibility(8);
            if ((!org.vidogram.messenger.v.a().r) || (!org.vidogram.messenger.v.a().a.isEmpty()))
              break label241;
            v.e(v.this).setVisibility(8);
            v.a(v.this).setEmptyView(v.d(v.this));
          }
          while (true)
          {
            if (!v.f(v.this))
            {
              v.g(v.this).setVisibility(0);
              v.c(v.this, true);
              v.g(v.this).setTranslationY(org.vidogram.messenger.a.a(100.0F));
              v.d(v.this, false);
            }
            if (!v.h(v.this))
              v.i(v.this).setVisibility(0);
            if (v.a(v.this).getAdapter() != v.k(v.this))
            {
              v.a(v.this).setAdapter(v.k(v.this));
              v.k(v.this).c();
            }
            if (v.l(v.this) != null)
              v.l(v.this).a(null);
            v.j(v.this);
            return;
            label241: v.d(v.this).setVisibility(8);
            v.a(v.this).setEmptyView(v.e(v.this));
          }
        }
      }).getSearchField().setHint(r.a("Search", 2131231766));
      if (!this.G)
        break label1309;
      this.d.setBackButtonImage(2130837794);
      this.d.setTitle(r.a("SelectChat", 2131231790));
      this.d.setAllowOverlayTitle(true);
      this.d.setActionBarMenuOnItemClick(new a.a()
      {
        public void a(int paramInt)
        {
          boolean bool = true;
          if (paramInt == -1)
            if (v.f(v.this))
              v.this.d();
          do
          {
            do
              return;
            while (v.m(v.this) == null);
            v.n(v.this).getDrawerLayoutContainer().a(false);
            return;
            if (paramInt != 1)
              continue;
            if (!ad.k);
            while (true)
            {
              ad.k = bool;
              ad.a(false);
              v.j(v.this);
              return;
              bool = false;
            }
          }
          while (paramInt != 10);
          itman.robert.a locala = new itman.robert.a();
          if (locala.a(ApplicationLoader.a))
          {
            v.o(v.this).setIcon(2130837595);
            locala.a(ApplicationLoader.a, false);
            return;
          }
          locala.a(ApplicationLoader.a, true);
          org.vidogram.messenger.v.a().k();
          v.o(v.this).setIcon(2130837596);
        }
      });
      u();
      this.k = new aw(paramContext);
      this.k.setVerticalScrollBarEnabled(true);
      this.k.setItemAnimator(null);
      this.k.setInstantClick(true);
      this.k.setLayoutAnimation(null);
      this.k.setTag(Integer.valueOf(4));
      this.l = new LinearLayoutManager(paramContext)
      {
        public boolean c()
        {
          return false;
        }
      };
      this.l.b(1);
      this.k.setLayoutManager(this.l);
      localObject1 = this.k;
      if (!r.a)
        break label1387;
      i1 = 1;
      ((aw)localObject1).setVerticalScrollbarPosition(i1);
      this.S.addView(this.k, org.vidogram.ui.Components.v.a(-1, -1.0F));
      this.k.setOnItemClickListener(new aw.b()
      {
        public void a(View paramView, int paramInt)
        {
          if ((v.a(v.this) == null) || (v.a(v.this).getAdapter() == null));
          label564: label825: label855: label858: 
          while (true)
          {
            return;
            paramView = v.a(v.this).getAdapter();
            Object localObject1;
            long l1;
            if (paramView == v.k(v.this))
            {
              localObject1 = v.k(v.this).e(paramInt);
              if (localObject1 == null)
                continue;
              l1 = ((g.hq)localObject1).m;
              paramInt = 0;
            }
            while (true)
            {
              if (l1 == 0L)
                break label858;
              Object localObject2;
              if (v.f(v.this))
              {
                v.a(v.this, l1, true, false);
                return;
                if (paramView == v.l(v.this))
                {
                  localObject1 = v.l(v.this).f(paramInt);
                  long l2;
                  if ((localObject1 instanceof g.vw))
                  {
                    l2 = ((g.vw)localObject1).d;
                    if (v.l(v.this).e(paramInt))
                    {
                      localObject2 = new ArrayList();
                      ((ArrayList)localObject2).add((g.vw)localObject1);
                      org.vidogram.messenger.v.a().a((ArrayList)localObject2, false);
                      w.a().a((ArrayList)localObject2, null, false, true);
                    }
                    l1 = l2;
                    if (v.f(v.this))
                      break label855;
                    v.l(v.this).a(l2, (g.vw)localObject1);
                    paramInt = 0;
                    l1 = l2;
                    continue;
                  }
                  if ((localObject1 instanceof g.i))
                  {
                    if (v.l(v.this).e(paramInt))
                    {
                      localObject2 = new ArrayList();
                      ((ArrayList)localObject2).add((g.i)localObject1);
                      org.vidogram.messenger.v.a().b((ArrayList)localObject2, false);
                      w.a().a(null, (ArrayList)localObject2, false, true);
                    }
                    if (((g.i)localObject1).h > 0)
                      l2 = -((g.i)localObject1).h;
                    while (true)
                    {
                      l1 = l2;
                      if (v.f(v.this))
                        break label855;
                      v.l(v.this).a(l2, (g.i)localObject1);
                      paramInt = 0;
                      l1 = l2;
                      break;
                      l2 = org.vidogram.messenger.a.a(((g.i)localObject1).h);
                    }
                  }
                  if ((localObject1 instanceof g.t))
                  {
                    l2 = ((g.t)localObject1).b << 32;
                    l1 = l2;
                    if (v.f(v.this))
                      break label855;
                    v.l(v.this).a(l2, (g.t)localObject1);
                    paramInt = 0;
                    l1 = l2;
                    continue;
                  }
                  if ((localObject1 instanceof u))
                  {
                    localObject1 = (u)localObject1;
                    l1 = ((u)localObject1).u();
                    paramInt = ((u)localObject1).q();
                    v.l(v.this).a(v.l(v.this).h());
                    continue;
                  }
                  if ((localObject1 instanceof String))
                    v.p(v.this).a((String)localObject1);
                }
                paramInt = 0;
                l1 = 0L;
                continue;
              }
              else
              {
                localObject1 = new Bundle();
                int j = (int)l1;
                int i = (int)(l1 >> 32);
                if (j != 0)
                  if (i == 1)
                  {
                    ((Bundle)localObject1).putInt("chat_id", j);
                    if (paramInt == 0)
                      break label802;
                    ((Bundle)localObject1).putInt("message_id", paramInt);
                  }
                while (true)
                {
                  if (org.vidogram.messenger.a.c())
                  {
                    if ((v.s(v.this) == l1) && (paramView != v.l(v.this)))
                      break;
                    if (v.k(v.this) != null)
                    {
                      v.k(v.this).a(v.a(v.this, l1));
                      v.a(v.this, 512);
                    }
                  }
                  if (v.b(v.this) == null)
                    break label825;
                  if (!org.vidogram.messenger.v.a((Bundle)localObject1, v.this))
                    break;
                  y.a().a(y.d, new Object[0]);
                  v.this.a(new q((Bundle)localObject1));
                  return;
                  if (j > 0)
                  {
                    ((Bundle)localObject1).putInt("user_id", j);
                    break label564;
                  }
                  if (j >= 0)
                    break label564;
                  i = j;
                  if (paramInt != 0)
                  {
                    localObject2 = org.vidogram.messenger.v.a().b(Integer.valueOf(-j));
                    i = j;
                    if (localObject2 != null)
                    {
                      i = j;
                      if (((g.i)localObject2).B != null)
                      {
                        ((Bundle)localObject1).putInt("migrated_to", j);
                        i = -((g.i)localObject2).B.b;
                      }
                    }
                  }
                  ((Bundle)localObject1).putInt("chat_id", -i);
                  break label564;
                  ((Bundle)localObject1).putInt("enc_id", i);
                  break label564;
                  if (v.q(v.this) == null)
                    continue;
                  v.r(v.this).g();
                }
                if (!org.vidogram.messenger.v.a((Bundle)localObject1, v.this))
                  break;
                v.this.a(new q((Bundle)localObject1));
                return;
              }
              paramInt = 0;
            }
          }
        }
      });
      this.k.setOnItemLongClickListener(new aw.c()
      {
        public boolean a(View paramView, int paramInt)
        {
          if ((v.f(v.this)) || ((v.t(v.this)) && (v.u(v.this))) || (v.this.l() == null))
          {
            if (((v.u(v.this)) && (v.t(v.this))) || ((v.l(v.this).j()) && (v.a(v.this).getAdapter() == v.l(v.this)) && (((v.l(v.this).f(paramInt) instanceof String)) || (v.l(v.this).j()))))
            {
              paramView = new AlertDialog.Builder(v.this.l());
              paramView.setTitle(r.a("AppName", 2131230856));
              paramView.setMessage(r.a("ClearSearch", 2131231071));
              paramView.setPositiveButton(r.a("ClearButton", 2131231065).toUpperCase(), new DialogInterface.OnClickListener()
              {
                public void onClick(DialogInterface paramDialogInterface, int paramInt)
                {
                  if (v.l(v.this).j())
                  {
                    v.l(v.this).l();
                    return;
                  }
                  v.l(v.this).e();
                }
              });
              paramView.setNegativeButton(r.a("Cancel", 2131230943), null);
              v.this.b(paramView.create());
              return true;
            }
            return false;
          }
          paramView = v.v(v.this);
          if ((paramInt < 0) || (paramInt >= paramView.size()))
            return false;
          paramView = (g.hq)paramView.get(paramInt);
          v.b(v.this, paramView.m);
          h.d locald = new h.d(v.this.l());
          paramInt = (int)v.w(v.this);
          int i = (int)(v.w(v.this) >> 32);
          Object localObject1;
          Object localObject2;
          if (org.vidogram.messenger.g.a(paramView))
          {
            localObject1 = org.vidogram.messenger.v.a().b(Integer.valueOf(-paramInt));
            if ((localObject1 != null) && (((g.i)localObject1).r))
            {
              localObject2 = r.a("ClearHistoryCache", 2131231067);
              if ((localObject1 == null) || (!((g.i)localObject1).c));
              for (paramView = r.a("LeaveMegaMenu", 2131231378); ; paramView = r.a("DeleteMegaMenu", 2131231132))
              {
                paramView = new CharSequence[] { localObject2, paramView };
                locald.a(paramView, new DialogInterface.OnClickListener((g.i)localObject1)
                {
                  public void onClick(DialogInterface paramDialogInterface, int paramInt)
                  {
                    paramDialogInterface = new AlertDialog.Builder(v.this.l());
                    paramDialogInterface.setTitle(r.a("AppName", 2131230856));
                    if (paramInt == 0)
                    {
                      if ((this.a != null) && (this.a.r))
                        paramDialogInterface.setMessage(r.a("AreYouSureClearHistorySuper", 2131230874));
                      while (true)
                      {
                        paramDialogInterface.setPositiveButton(r.a("OK", 2131231604), new DialogInterface.OnClickListener()
                        {
                          public void onClick(DialogInterface paramDialogInterface, int paramInt)
                          {
                            org.vidogram.messenger.v.a().a(v.w(v.this), 2);
                          }
                        });
                        paramDialogInterface.setNegativeButton(r.a("Cancel", 2131230943), null);
                        v.this.b(paramDialogInterface.create());
                        return;
                        paramDialogInterface.setMessage(r.a("AreYouSureClearHistoryChannel", 2131230873));
                      }
                    }
                    if ((this.a != null) && (this.a.r))
                      if (!this.a.c)
                        paramDialogInterface.setMessage(r.a("MegaLeaveAlert", 2131231416));
                    while (true)
                    {
                      paramDialogInterface.setPositiveButton(r.a("OK", 2131231604), new DialogInterface.OnClickListener()
                      {
                        public void onClick(DialogInterface paramDialogInterface, int paramInt)
                        {
                          org.vidogram.messenger.v.a().a((int)(-v.w(v.this)), ad.d(), null);
                          if (org.vidogram.messenger.a.c())
                            y.a().a(y.d, new Object[] { Long.valueOf(v.w(v.this)) });
                        }
                      });
                      break;
                      paramDialogInterface.setMessage(r.a("MegaDeleteAlert", 2131231414));
                      continue;
                      if ((this.a == null) || (!this.a.c))
                      {
                        paramDialogInterface.setMessage(r.a("ChannelLeaveAlert", 2131230989));
                        continue;
                      }
                      paramDialogInterface.setMessage(r.a("ChannelDeleteAlert", 2131230979));
                    }
                  }
                });
                v.this.b(locald.a());
                return true;
              }
            }
            localObject2 = r.a("ClearHistoryCache", 2131231067);
            if ((localObject1 == null) || (!((g.i)localObject1).c));
            for (paramView = r.a("LeaveChannelMenu", 2131231376); ; paramView = r.a("ChannelDeleteMenu", 2131230981))
            {
              paramView = new CharSequence[] { localObject2, paramView };
              break;
            }
          }
          boolean bool1;
          if ((paramInt < 0) && (i != 1))
          {
            bool1 = true;
            if ((bool1) || (paramInt <= 0) || (i == 1))
              break label634;
          }
          label523: label607: label634: for (paramView = org.vidogram.messenger.v.a().a(Integer.valueOf(paramInt)); ; paramView = null)
          {
            boolean bool2;
            if ((paramView != null) && (paramView.r))
            {
              bool2 = true;
              localObject1 = r.a("ClearHistory", 2131231066);
              if (!bool1)
                break label607;
              paramView = r.a("DeleteChat", 2131231126);
            }
            while (true)
            {
              localObject2 = new DialogInterface.OnClickListener(bool1, bool2)
              {
                public void onClick(DialogInterface paramDialogInterface, int paramInt)
                {
                  paramDialogInterface = new AlertDialog.Builder(v.this.l());
                  paramDialogInterface.setTitle(r.a("AppName", 2131230856));
                  if (paramInt == 0)
                    paramDialogInterface.setMessage(r.a("AreYouSureClearHistory", 2131230872));
                  while (true)
                  {
                    paramDialogInterface.setPositiveButton(r.a("OK", 2131231604), new DialogInterface.OnClickListener(paramInt)
                    {
                      public void onClick(DialogInterface paramDialogInterface, int paramInt)
                      {
                        if (this.a != 0)
                        {
                          if (v.11.3.this.a)
                          {
                            paramDialogInterface = org.vidogram.messenger.v.a().b(Integer.valueOf((int)(-v.w(v.this))));
                            if ((paramDialogInterface != null) && (org.vidogram.messenger.e.c(paramDialogInterface)))
                              org.vidogram.messenger.v.a().a(v.w(v.this), 0);
                          }
                          while (true)
                          {
                            if (v.11.3.this.b)
                              org.vidogram.messenger.v.a().h((int)v.w(v.this));
                            if (org.vidogram.messenger.a.c())
                              y.a().a(y.d, new Object[] { Long.valueOf(v.w(v.this)) });
                            return;
                            org.vidogram.messenger.v.a().a((int)(-v.w(v.this)), org.vidogram.messenger.v.a().a(Integer.valueOf(ad.c())), null);
                            continue;
                            org.vidogram.messenger.v.a().a(v.w(v.this), 0);
                          }
                        }
                        org.vidogram.messenger.v.a().a(v.w(v.this), 1);
                      }
                    });
                    paramDialogInterface.setNegativeButton(r.a("Cancel", 2131230943), null);
                    v.this.b(paramDialogInterface.create());
                    return;
                    if (this.a)
                    {
                      paramDialogInterface.setMessage(r.a("AreYouSureDeleteAndExit", 2131230875));
                      continue;
                    }
                    paramDialogInterface.setMessage(r.a("AreYouSureDeleteThisChat", 2131230879));
                  }
                }
              };
              locald.a(new CharSequence[] { localObject1, paramView }, (DialogInterface.OnClickListener)localObject2);
              v.this.b(locald.a());
              return true;
              bool1 = false;
              break;
              bool2 = false;
              break label523;
              if (bool2)
              {
                paramView = r.a("DeleteAndStop", 2131231124);
                continue;
              }
              paramView = r.a("Delete", 2131231117);
            }
          }
        }
      });
      this.o = new org.vidogram.ui.Components.q(paramContext);
      this.o.setVisibility(8);
      this.o.setShowAtCenter(true);
      this.o.setText(r.a("NoResult", 2131231509));
      this.S.addView(this.o, org.vidogram.ui.Components.v.a(-1, -1.0F));
      this.q = new LinearLayout(paramContext);
      this.q.setOrientation(1);
      this.q.setVisibility(8);
      this.q.setGravity(17);
      this.S.addView(this.q, org.vidogram.ui.Components.v.a(-1, -1.0F));
      this.q.setOnTouchListener(new View.OnTouchListener()
      {
        public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
        {
          return true;
        }
      });
      localObject1 = new TextView(paramContext);
      ((TextView)localObject1).setText(r.a("NoChats", 2131231490));
      ((TextView)localObject1).setTextColor(-6974059);
      ((TextView)localObject1).setGravity(17);
      ((TextView)localObject1).setTextSize(1, 20.0F);
      this.q.addView((View)localObject1, org.vidogram.ui.Components.v.b(-2, -2));
      TextView localTextView = new TextView(paramContext);
      Object localObject2 = r.a("NoChatsHelp", 2131231491);
      localObject1 = localObject2;
      if (org.vidogram.messenger.a.c())
      {
        localObject1 = localObject2;
        if (!org.vidogram.messenger.a.d())
          localObject1 = ((String)localObject2).replace('\n', ' ');
      }
      localTextView.setText((CharSequence)localObject1);
      localTextView.setTextColor(-6974059);
      localTextView.setTextSize(1, 15.0F);
      localTextView.setGravity(17);
      localTextView.setPadding(org.vidogram.messenger.a.a(8.0F), org.vidogram.messenger.a.a(6.0F), org.vidogram.messenger.a.a(8.0F), 0);
      localTextView.setLineSpacing(org.vidogram.messenger.a.a(2.0F), 1.0F);
      this.q.addView(localTextView, org.vidogram.ui.Components.v.b(-2, -2));
      this.p = new ProgressBar(paramContext);
      this.p.setVisibility(8);
      this.S.addView(this.p, org.vidogram.ui.Components.v.b(-2, -2, 17));
      this.s = new ImageView(paramContext);
      localObject1 = this.s;
      if (!this.G)
        break label1393;
      i1 = 8;
      ((ImageView)localObject1).setVisibility(i1);
      this.s.setScaleType(ImageView.ScaleType.CENTER);
      localObject1 = paramContext.getResources().getDrawable(2130837778);
      ((Drawable)localObject1).mutate();
      ((Drawable)localObject1).setColorFilter(l.a, PorterDuff.Mode.SRC_ATOP);
      this.s.setBackgroundDrawable((Drawable)localObject1);
      this.s.setImageResource(2130837776);
      if (Build.VERSION.SDK_INT >= 21)
      {
        localObject1 = new StateListAnimator();
        localObject2 = ObjectAnimator.ofFloat(this.s, "translationZ", new float[] { org.vidogram.messenger.a.a(2.0F), org.vidogram.messenger.a.a(4.0F) }).setDuration(200L);
        ((StateListAnimator)localObject1).addState(new int[] { 16842919 }, (Animator)localObject2);
        localObject2 = ObjectAnimator.ofFloat(this.s, "translationZ", new float[] { org.vidogram.messenger.a.a(4.0F), org.vidogram.messenger.a.a(2.0F) }).setDuration(200L);
        ((StateListAnimator)localObject1).addState(new int[0], (Animator)localObject2);
        this.s.setStateListAnimator((StateListAnimator)localObject1);
        this.s.setOutlineProvider(new ViewOutlineProvider()
        {
          @SuppressLint({"NewApi"})
          public void getOutline(View paramView, Outline paramOutline)
          {
            paramOutline.setOval(0, 0, org.vidogram.messenger.a.a(56.0F), org.vidogram.messenger.a.a(56.0F));
          }
        });
      }
      localObject1 = this.S;
      localObject2 = this.s;
      if (!r.a)
        break label1399;
      i1 = 3;
      if (!r.a)
        break label1405;
      f1 = 14.0F;
      if (!r.a)
        break label1410;
      f2 = 0.0F;
      label1007: ((FrameLayout)localObject1).addView((View)localObject2, org.vidogram.ui.Components.v.a(-2, -2.0F, i1 | 0x50, f1, 0.0F, f2, 14.0F));
      this.s.setOnClickListener(new View.OnClickListener()
      {
        public void onClick(View paramView)
        {
          paramView = new Bundle();
          paramView.putBoolean("destroyAfterSelect", true);
          v.this.a(new s(paramView));
        }
      });
      this.k.setOnScrollListener(new RecyclerView.l()
      {
        public void a(RecyclerView paramRecyclerView, int paramInt)
        {
          if ((paramInt == 1) && (v.t(v.this)) && (v.u(v.this)))
            org.vidogram.messenger.a.b(v.this.l().getCurrentFocus());
        }

        public void a(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
        {
          boolean bool2 = false;
          paramInt1 = 0;
          int i = v.x(v.this).m();
          paramInt2 = Math.abs(v.x(v.this).n() - i) + 1;
          int j = paramRecyclerView.getAdapter().a();
          if ((v.t(v.this)) && (v.u(v.this)))
            if ((paramInt2 > 0) && (v.x(v.this).n() == j - 1) && (!v.l(v.this).f()))
              v.l(v.this).g();
          boolean bool1;
          while (true)
          {
            return;
            if ((paramInt2 > 0) && (v.x(v.this).n() >= v.v(v.this).size() - 10))
            {
              org.vidogram.messenger.v localv = org.vidogram.messenger.v.a();
              if (org.vidogram.messenger.v.a().s)
                break;
              bool1 = true;
              localv.b(-1, 100, bool1);
            }
            else
            {
              if (v.g(v.this).getVisibility() == 8)
                continue;
              paramRecyclerView = paramRecyclerView.getChildAt(0);
              if (paramRecyclerView == null)
                break label345;
            }
          }
          label345: for (paramInt2 = paramRecyclerView.getTop(); ; paramInt2 = 0)
          {
            if (v.y(v.this) == i)
            {
              j = v.z(v.this);
              if (paramInt2 < v.z(v.this))
              {
                bool1 = true;
                label232: bool2 = bool1;
                if (Math.abs(j - paramInt2) > 1)
                  paramInt1 = 1;
              }
            }
            for (bool2 = bool1; ; bool2 = bool1)
            {
              if ((paramInt1 != 0) && (v.A(v.this)))
                v.d(v.this, bool2);
              v.b(v.this, i);
              v.c(v.this, paramInt2);
              v.e(v.this, true);
              return;
              bool1 = false;
              break;
              bool1 = false;
              break label232;
              bool1 = bool2;
              if (i > v.y(v.this))
                bool1 = true;
              paramInt1 = 1;
            }
          }
        }
      });
      if (this.I == null)
      {
        this.m = new org.vidogram.ui.b.i(paramContext, this.D);
        if ((org.vidogram.messenger.a.c()) && (this.J != 0L))
          this.m.a(this.J);
        this.k.setAdapter(this.m);
      }
      if (this.I == null)
        break label1417;
      i1 = 2;
      label1133: this.n = new org.vidogram.ui.b.j(paramContext, i1, this.D);
      this.n.a(new j.c()
      {
        public void a(int paramInt)
        {
          if (v.f(v.this))
            v.a(v.this, paramInt, true, false);
          Bundle localBundle;
          label168: 
          do
          {
            return;
            localBundle = new Bundle();
            if (paramInt > 0)
              localBundle.putInt("user_id", paramInt);
            while (true)
            {
              if (v.B(v.this) != null)
                v.C(v.this).g();
              if ((org.vidogram.messenger.a.c()) && (v.k(v.this) != null))
              {
                v.k(v.this).a(v.a(v.this, paramInt));
                v.a(v.this, 512);
              }
              if (v.b(v.this) == null)
                break label168;
              if (!org.vidogram.messenger.v.a(localBundle, v.this))
                break;
              y.a().a(y.d, new Object[0]);
              v.this.a(new q(localBundle));
              return;
              localBundle.putInt("chat_id", -paramInt);
            }
          }
          while (!org.vidogram.messenger.v.a(localBundle, v.this));
          v.this.a(new q(localBundle));
        }

        public void a(boolean paramBoolean)
        {
          if ((v.t(v.this)) && (v.u(v.this)) && (v.c(v.this) != null))
          {
            if (paramBoolean)
              v.c(v.this).a();
          }
          else
            return;
          v.c(v.this).b();
        }

        public void b(int paramInt)
        {
          if (v.this.l() == null);
          g.vw localvw;
          do
          {
            return;
            localvw = org.vidogram.messenger.v.a().a(Integer.valueOf(paramInt));
          }
          while (localvw == null);
          AlertDialog.Builder localBuilder = new AlertDialog.Builder(v.this.l());
          localBuilder.setTitle(r.a("AppName", 2131230856));
          localBuilder.setMessage(r.a("ChatHintsDelete", 2131231051, new Object[] { f.a(localvw.e, localvw.f) }));
          localBuilder.setPositiveButton(r.a("OK", 2131231604), new DialogInterface.OnClickListener(paramInt)
          {
            public void onClick(DialogInterface paramDialogInterface, int paramInt)
            {
              org.vidogram.messenger.d.e.c(this.a);
            }
          });
          localBuilder.setNegativeButton(r.a("Cancel", 2131230943), null);
          v.this.b(localBuilder.create());
        }
      });
      if ((!org.vidogram.messenger.v.a().r) || (!org.vidogram.messenger.v.a().a.isEmpty()))
        break label1434;
      this.o.setVisibility(8);
      this.q.setVisibility(8);
      this.k.setEmptyView(this.p);
    }
    while (true)
    {
      if (this.I != null)
        this.d.a(this.I);
      if ((!this.G) && ((this.D == 0) || (this.D > 2)))
        this.N.addView(new ao(paramContext, this), org.vidogram.ui.Components.v.a(-1, 39.0F, 51, 0.0F, -36.0F, 0.0F, 0.0F));
      return this.b;
      this.M = ((c)localObject1).b(10, 2130837595);
      break;
      label1309: if (this.I != null)
        this.d.setBackButtonImage(2130837794);
      while (true)
      {
        if (!org.vidogram.messenger.d.a)
          break label1368;
        this.d.setTitle(r.a("AppNameBeta", 2131230857));
        break;
        this.d.setBackButtonDrawable(new org.vidogram.ui.a.j());
      }
      label1368: this.d.setTitle(r.a("AppName", 2131230856));
      break label172;
      label1387: i1 = 2;
      break label301;
      label1393: i1 = 0;
      break label758;
      label1399: i1 = 5;
      break label989;
      label1405: f1 = 0.0F;
      break label999;
      label1410: f2 = 14.0F;
      break label1007;
      label1417: i1 = i2;
      if (!this.G)
        break label1133;
      i1 = 0;
      break label1133;
      label1434: this.o.setVisibility(8);
      this.p.setVisibility(8);
      this.k.setEmptyView(this.q);
    }
  }

  public void a(int paramInt, Object[] paramArrayOfObject)
  {
    if (paramInt == y.c)
      if (this.m != null)
      {
        if (this.m.d())
          this.m.c();
      }
      else
      {
        if (this.n != null)
          this.n.c();
        if (this.k == null);
      }
    label465: 
    do
    {
      while (true)
      {
        try
        {
          if ((!org.vidogram.messenger.v.a().r) || (!org.vidogram.messenger.v.a().a.isEmpty()))
            continue;
          this.o.setVisibility(8);
          this.q.setVisibility(8);
          this.k.setEmptyView(this.p);
          if (paramInt != y.aa)
            break label465;
          if (this.n == null)
            continue;
          this.n.k();
          return;
          a(2048);
          break;
          this.p.setVisibility(8);
          if ((!this.E) || (!this.F))
            continue;
          this.q.setVisibility(8);
          this.k.setEmptyView(this.o);
          continue;
        }
        catch (Exception paramArrayOfObject)
        {
          org.vidogram.messenger.n.a("tmessages", paramArrayOfObject);
          continue;
          this.o.setVisibility(8);
          this.k.setEmptyView(this.q);
          continue;
        }
        if (paramInt == y.at)
        {
          a(0);
          continue;
        }
        if (paramInt == y.b)
        {
          a(((Integer)paramArrayOfObject[0]).intValue());
          continue;
        }
        if (paramInt == y.au)
        {
          i = false;
          continue;
        }
        if (paramInt == y.r)
        {
          a(0);
          continue;
        }
        if (paramInt == y.k)
        {
          a(0);
          v();
          continue;
        }
        if (paramInt == y.z)
        {
          if (((this.D != 0) && (this.D <= 2)) || (!org.vidogram.messenger.a.c()))
            continue;
          boolean bool = ((Boolean)paramArrayOfObject[1]).booleanValue();
          long l1 = ((Long)paramArrayOfObject[0]).longValue();
          if (bool)
            if (l1 != this.J);
          for (this.J = 0L; ; this.J = l1)
          {
            if (this.m != null)
              this.m.a(this.J);
            a(512);
            break;
          }
        }
        if (paramInt == y.w)
        {
          a(0);
          continue;
        }
        if ((paramInt == y.h) || (paramInt == y.i) || (paramInt == y.j))
        {
          a(4096);
          continue;
        }
        if (paramInt != y.H)
          continue;
        t();
      }
      if (paramInt != y.K)
        continue;
      a(0);
      return;
    }
    while ((paramInt != y.ae) || (this.n == null));
    this.n.c();
  }

  public void a(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    if (paramInt == 1)
    {
      int i1 = 0;
      if (i1 < paramArrayOfString.length)
      {
        if ((paramArrayOfInt.length <= i1) || (paramArrayOfInt[i1] != 0));
        while (true)
        {
          i1 += 1;
          break;
          String str = paramArrayOfString[i1];
          paramInt = -1;
          switch (str.hashCode())
          {
          default:
          case 1977429404:
          case 1365911975:
          }
          while (true)
            switch (paramInt)
            {
            default:
              break;
            case 0:
              f.a().i();
              break;
              if (!str.equals("android.permission.READ_CONTACTS"))
                continue;
              paramInt = 0;
              continue;
              if (!str.equals("android.permission.WRITE_EXTERNAL_STORAGE"))
                continue;
              paramInt = 1;
            case 1:
            }
          p.a().b();
        }
      }
    }
  }

  public void a(Configuration paramConfiguration)
  {
    super.a(paramConfiguration);
    if ((!this.G) && (this.s != null))
      this.s.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener()
      {
        public void onGlobalLayout()
        {
          ImageView localImageView = v.g(v.this);
          float f;
          if (v.D(v.this))
          {
            f = org.vidogram.messenger.a.a(100.0F);
            localImageView.setTranslationY(f);
            localImageView = v.g(v.this);
            if (v.D(v.this))
              break label93;
          }
          label93: for (boolean bool = true; ; bool = false)
          {
            localImageView.setClickable(bool);
            if (v.g(v.this) != null)
            {
              if (Build.VERSION.SDK_INT >= 16)
                break label98;
              v.g(v.this).getViewTreeObserver().removeGlobalOnLayoutListener(this);
            }
            return;
            f = 0.0F;
            break;
          }
          label98: v.g(v.this).getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
      });
  }

  public void a(String paramString)
  {
    this.I = paramString;
  }

  public void a(a parama)
  {
    this.L = parama;
  }

  protected void c(Dialog paramDialog)
  {
    super.c(paramDialog);
    if ((this.t != null) && (paramDialog == this.t) && (l() != null))
      r();
  }

  public boolean f()
  {
    super.f();
    this.D = 0;
    if (b() != null)
    {
      this.G = this.f.getBoolean("onlySelect", false);
      this.U = this.f.getBoolean("invisibleTab", false);
      this.K = this.f.getBoolean("cantSendToChannels", false);
      this.D = this.f.getInt("dialogsType", 0);
      this.A = this.f.getString("selectAlertString");
      this.B = this.f.getString("selectAlertStringGroup");
      this.C = this.f.getString("addToGroupAlertString");
    }
    if (this.I == null)
    {
      y.a().a(this, y.c);
      y.a().a(this, y.at);
      y.a().a(this, y.b);
      y.a().a(this, y.r);
      y.a().a(this, y.k);
      y.a().a(this, y.au);
      y.a().a(this, y.z);
      y.a().a(this, y.w);
      y.a().a(this, y.h);
      y.a().a(this, y.i);
      y.a().a(this, y.j);
      y.a().a(this, y.H);
      y.a().a(this, y.aa);
      y.a().a(this, y.K);
      y.a().a(this, y.ae);
    }
    if (!i)
    {
      org.vidogram.messenger.v.a().b(0, 100, true);
      f.a().c();
      org.vidogram.messenger.d.g.b();
      i = true;
    }
    return true;
  }

  public void g()
  {
    super.g();
    if (this.I == null)
    {
      y.a().b(this, y.c);
      y.a().b(this, y.at);
      y.a().b(this, y.b);
      y.a().b(this, y.r);
      y.a().b(this, y.k);
      y.a().b(this, y.au);
      y.a().b(this, y.z);
      y.a().b(this, y.w);
      y.a().b(this, y.h);
      y.a().b(this, y.i);
      y.a().b(this, y.j);
      y.a().b(this, y.H);
      y.a().b(this, y.aa);
      y.a().b(this, y.K);
      y.a().b(this, y.ae);
    }
    this.L = null;
  }

  public void i()
  {
    super.i();
    if (this.m != null)
      this.m.c();
    if (this.n != null)
      this.n.c();
    Object localObject;
    if ((this.z) && (!this.G) && (Build.VERSION.SDK_INT >= 23))
    {
      localObject = l();
      if (localObject != null)
      {
        this.z = false;
        if ((((Activity)localObject).checkSelfPermission("android.permission.READ_CONTACTS") != 0) || (((Activity)localObject).checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0))
        {
          if (!((Activity)localObject).shouldShowRequestPermissionRationale("android.permission.READ_CONTACTS"))
            break label167;
          localObject = new AlertDialog.Builder((Context)localObject);
          ((AlertDialog.Builder)localObject).setTitle(r.a("AppName", 2131230856));
          ((AlertDialog.Builder)localObject).setMessage(r.a("PermissionContacts", 2131231656));
          ((AlertDialog.Builder)localObject).setPositiveButton(r.a("OK", 2131231604), null);
          localObject = ((AlertDialog.Builder)localObject).create();
          this.t = ((AlertDialog)localObject);
          b((Dialog)localObject);
        }
      }
    }
    return;
    label167: if (((Activity)localObject).shouldShowRequestPermissionRationale("android.permission.WRITE_EXTERNAL_STORAGE"))
    {
      localObject = new AlertDialog.Builder((Context)localObject);
      ((AlertDialog.Builder)localObject).setTitle(r.a("AppName", 2131230856));
      ((AlertDialog.Builder)localObject).setMessage(r.a("PermissionStorage", 2131231662));
      ((AlertDialog.Builder)localObject).setPositiveButton(r.a("OK", 2131231604), null);
      localObject = ((AlertDialog.Builder)localObject).create();
      this.t = ((AlertDialog)localObject);
      b((Dialog)localObject);
      return;
    }
    r();
  }

  public boolean q()
  {
    return (this.L == null) && (this.I == null);
  }

  public static abstract interface a
  {
    public abstract void a(v paramv, long paramLong, boolean paramBoolean);
  }

  private class b extends AsyncTask<String, Void, Void>
  {
    private b()
    {
    }

    protected Void a(String[] paramArrayOfString)
    {
      try
      {
        org.vidogram.messenger.v.a().b(null);
        return null;
      }
      catch (Exception paramArrayOfString)
      {
      }
      return null;
    }

    protected void a(Void paramVoid)
    {
      v.E(v.this);
    }

    protected void onPreExecute()
    {
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.v
 * JD-Core Version:    0.6.0
 */