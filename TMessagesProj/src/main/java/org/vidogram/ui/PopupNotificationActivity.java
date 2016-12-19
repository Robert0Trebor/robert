package org.vidogram.ui;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.text.TextUtils.TruncateAt;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import org.vidogram.messenger.ApplicationLoader;
import org.vidogram.messenger.MediaController;
import org.vidogram.messenger.ae;
import org.vidogram.messenger.m;
import org.vidogram.messenger.n;
import org.vidogram.messenger.r;
import org.vidogram.messenger.u;
import org.vidogram.messenger.y;
import org.vidogram.messenger.y.b;
import org.vidogram.messenger.z;
import org.vidogram.tgnet.ConnectionsManager;
import org.vidogram.tgnet.g.ar;
import org.vidogram.tgnet.g.au;
import org.vidogram.tgnet.g.az;
import org.vidogram.tgnet.g.i;
import org.vidogram.tgnet.g.m;
import org.vidogram.tgnet.g.t;
import org.vidogram.tgnet.g.vw;
import org.vidogram.tgnet.g.vx;
import org.vidogram.tgnet.g.y;
import org.vidogram.ui.Components.BackupImageView;
import org.vidogram.ui.Components.aq;
import org.vidogram.ui.Components.au;
import org.vidogram.ui.Components.bg;
import org.vidogram.ui.Components.bp;
import org.vidogram.ui.Components.e;
import org.vidogram.ui.Components.e.a;
import org.vidogram.ui.a.a.a;
import org.vidogram.ui.a.c;
import org.vidogram.ui.a.l;

public class PopupNotificationActivity extends Activity
  implements y.b
{
  private boolean A = false;
  private long B = 0L;
  private float C = -1.0F;
  private boolean D = false;
  private Runnable E = null;
  private boolean F;
  private ArrayList<u> G = new ArrayList();
  private org.vidogram.ui.a.a a;
  private e b;
  private BackupImageView c;
  private TextView d;
  private TextView e;
  private FrameLayout f;
  private TextView g;
  private ViewGroup h;
  private ViewGroup i;
  private ViewGroup j;
  private ViewGroup k;
  private RelativeLayout l;
  private ArrayList<ViewGroup> m = new ArrayList();
  private ArrayList<ViewGroup> n = new ArrayList();
  private ArrayList<ViewGroup> o = new ArrayList();
  private VelocityTracker p = null;
  private bp q;
  private au r;
  private int s;
  private g.vw t;
  private g.i u;
  private boolean v = false;
  private CharSequence w;
  private u x = null;
  private int y = 0;
  private PowerManager.WakeLock z = null;

  private ViewGroup a(int paramInt, boolean paramBoolean)
  {
    Object localObject2;
    if ((this.G.size() == 1) && ((paramInt < 0) || (paramInt >= this.G.size())))
      localObject2 = null;
    int i1;
    u localu;
    Object localObject1;
    label112: Object localObject3;
    g.az localaz2;
    int i2;
    while (true)
    {
      return localObject2;
      if (paramInt != -1)
        break;
      i1 = this.G.size() - 1;
      localu = (u)this.G.get(i1);
      if ((localu.f != 1) && (localu.f != 4))
        break label652;
      if (this.n.size() <= 0)
        break label422;
      localObject1 = (ViewGroup)this.n.get(0);
      this.n.remove(0);
      localObject2 = (TextView)((ViewGroup)localObject1).findViewById(2131624114);
      localObject3 = (BackupImageView)((ViewGroup)localObject1).findViewById(2131624152);
      ((BackupImageView)localObject3).setAspectFit(true);
      if (localu.f != 1)
        break label518;
      g.az localaz1 = m.a(localu.m, org.vidogram.messenger.a.f());
      localaz2 = m.a(localu.m, 100);
      i2 = 0;
      paramInt = i2;
      if (localaz1 != null)
      {
        int i3 = 1;
        paramInt = i3;
        if (localu.f == 1)
        {
          paramInt = i3;
          if (!m.b(localu.a).exists())
            paramInt = 0;
        }
        if ((paramInt == 0) && (!MediaController.a().a(1)))
          break label474;
        ((BackupImageView)localObject3).a(localaz1.c, "100_100", localaz2.c, localaz1.f);
        paramInt = 1;
      }
      label259: if (paramInt != 0)
        break label502;
      ((BackupImageView)localObject3).setVisibility(8);
      ((TextView)localObject2).setVisibility(0);
      ((TextView)localObject2).setTextSize(2, org.vidogram.messenger.v.a().B);
      ((TextView)localObject2).setText(localu.b);
      label299: if (((ViewGroup)localObject1).getParent() == null)
        this.h.addView((View)localObject1);
      ((ViewGroup)localObject1).setVisibility(0);
      localObject2 = localObject1;
      if (!paramBoolean)
        continue;
      paramInt = org.vidogram.messenger.a.c.x - org.vidogram.messenger.a.a(24.0F);
      localObject2 = (FrameLayout.LayoutParams)((ViewGroup)localObject1).getLayoutParams();
      ((FrameLayout.LayoutParams)localObject2).gravity = 51;
      ((FrameLayout.LayoutParams)localObject2).height = -1;
      ((FrameLayout.LayoutParams)localObject2).width = paramInt;
      if (i1 != this.y)
        break label974;
      ((FrameLayout.LayoutParams)localObject2).leftMargin = 0;
    }
    while (true)
    {
      ((ViewGroup)localObject1).setLayoutParams((ViewGroup.LayoutParams)localObject2);
      ((ViewGroup)localObject1).invalidate();
      return localObject1;
      i1 = paramInt;
      if (paramInt != this.G.size())
        break;
      i1 = 0;
      break;
      label422: localObject1 = new a(this);
      ((ViewGroup)localObject1).addView(getLayoutInflater().inflate(2130968649, null));
      ((ViewGroup)localObject1).setTag(Integer.valueOf(2));
      ((ViewGroup)localObject1).setOnClickListener(new View.OnClickListener()
      {
        public void onClick(View paramView)
        {
          PopupNotificationActivity.i(PopupNotificationActivity.this);
        }
      });
      break label112;
      label474: paramInt = i2;
      if (localaz2 == null)
        break label259;
      ((BackupImageView)localObject3).a(localaz2.c, null, (Drawable)null);
      paramInt = 1;
      break label259;
      label502: ((BackupImageView)localObject3).setVisibility(0);
      ((TextView)localObject2).setVisibility(8);
      break label299;
      label518: if (localu.f != 4)
        break label299;
      ((TextView)localObject2).setVisibility(8);
      ((TextView)localObject2).setText(localu.b);
      ((BackupImageView)localObject3).setVisibility(0);
      double d1 = localu.a.j.e.c;
      double d2 = localu.a.j.e.b;
      ((BackupImageView)localObject3).a(String.format(Locale.US, "https://maps.googleapis.com/maps/api/staticmap?center=%f,%f&zoom=13&size=100x100&maptype=roadmap&scale=%d&markers=color:red|size:big|%f,%f&sensor=false", new Object[] { Double.valueOf(d1), Double.valueOf(d2), Integer.valueOf(Math.min(2, (int)Math.ceil(org.vidogram.messenger.a.b))), Double.valueOf(d1), Double.valueOf(d2) }), null, null);
      break label299;
      label652: if (localu.f == 2)
      {
        if (this.o.size() > 0)
        {
          localObject2 = (ViewGroup)this.o.get(0);
          this.o.remove(0);
          localObject3 = (aq)((ViewGroup)localObject2).findViewWithTag(Integer.valueOf(300));
        }
        while (true)
        {
          ((aq)localObject3).setMessageObject(localu);
          localObject1 = localObject2;
          if (!MediaController.a().a(2))
            break;
          ((aq)localObject3).e();
          localObject1 = localObject2;
          break;
          localObject2 = new a(this);
          ((ViewGroup)localObject2).addView(getLayoutInflater().inflate(2130968647, null));
          ((ViewGroup)localObject2).setTag(Integer.valueOf(3));
          ((ViewGroup)localObject2).setOnClickListener(new View.OnClickListener()
          {
            public void onClick(View paramView)
            {
              PopupNotificationActivity.i(PopupNotificationActivity.this);
            }
          });
          localObject1 = (ViewGroup)((ViewGroup)localObject2).findViewById(2131624150);
          localObject3 = new aq(this);
          ((aq)localObject3).setTag(Integer.valueOf(300));
          ((ViewGroup)localObject1).addView((View)localObject3);
        }
      }
      if (this.m.size() > 0)
      {
        localObject1 = (ViewGroup)this.m.get(0);
        this.m.remove(0);
      }
      while (true)
      {
        localObject2 = (TextView)((ViewGroup)localObject1).findViewById(2131624114);
        ((TextView)localObject2).setTag(Integer.valueOf(301));
        ((TextView)localObject2).setTextSize(2, org.vidogram.messenger.v.a().B);
        ((TextView)localObject2).setText(localu.b);
        break;
        localObject1 = new a(this);
        ((ViewGroup)localObject1).addView(getLayoutInflater().inflate(2130968650, null));
        ((ViewGroup)localObject1).setTag(Integer.valueOf(1));
        ((ViewGroup)localObject1).findViewById(2131624149).setOnClickListener(new View.OnClickListener()
        {
          public void onClick(View paramView)
          {
            PopupNotificationActivity.i(PopupNotificationActivity.this);
          }
        });
      }
      label974: if (i1 == this.y - 1)
      {
        ((FrameLayout.LayoutParams)localObject2).leftMargin = (-paramInt);
        continue;
      }
      if (i1 != this.y + 1)
        continue;
      ((FrameLayout.LayoutParams)localObject2).leftMargin = paramInt;
    }
  }

  private void a(int paramInt)
  {
    int i1 = org.vidogram.messenger.a.c.x - org.vidogram.messenger.a.a(24.0F);
    FrameLayout.LayoutParams localLayoutParams;
    if (this.j != null)
    {
      localLayoutParams = (FrameLayout.LayoutParams)this.j.getLayoutParams();
      localLayoutParams.gravity = 51;
      localLayoutParams.height = -1;
      localLayoutParams.width = i1;
      localLayoutParams.leftMargin = (-i1 + paramInt);
      this.j.setLayoutParams(localLayoutParams);
    }
    if (this.i != null)
    {
      localLayoutParams = (FrameLayout.LayoutParams)this.i.getLayoutParams();
      localLayoutParams.gravity = 51;
      localLayoutParams.height = -1;
      localLayoutParams.width = i1;
      localLayoutParams.leftMargin = paramInt;
      this.i.setLayoutParams(localLayoutParams);
    }
    if (this.k != null)
    {
      localLayoutParams = (FrameLayout.LayoutParams)this.k.getLayoutParams();
      localLayoutParams.gravity = 51;
      localLayoutParams.height = -1;
      localLayoutParams.width = i1;
      localLayoutParams.leftMargin = (i1 + paramInt);
      this.k.setLayoutParams(localLayoutParams);
    }
    this.h.invalidate();
  }

  private void a(Intent paramIntent)
  {
    boolean bool;
    if ((paramIntent != null) && (paramIntent.getBooleanExtra("force", false)))
    {
      bool = true;
      this.F = bool;
      if (!this.F)
        break label93;
      this.G = z.a().b;
      label39: if ((!((KeyguardManager)getSystemService("keyguard")).inKeyguardRestrictedInputMode()) && (ApplicationLoader.c))
        break label106;
      getWindow().addFlags(2623490);
    }
    while (true)
    {
      if (this.x == null)
        this.y = 0;
      f();
      return;
      bool = false;
      break;
      label93: this.G = z.a().a;
      break label39;
      label106: getWindow().addFlags(2623488);
      getWindow().clearFlags(2);
    }
  }

  private void a(ViewGroup paramViewGroup)
  {
    if (paramViewGroup == null);
    int i1;
    do
    {
      return;
      i1 = ((Integer)paramViewGroup.getTag()).intValue();
      paramViewGroup.setVisibility(8);
      if (i1 == 1)
      {
        this.m.add(paramViewGroup);
        return;
      }
      if (i1 != 2)
        continue;
      this.n.add(paramViewGroup);
      return;
    }
    while (i1 != 3);
    this.o.add(paramViewGroup);
  }

  private void a(boolean paramBoolean)
  {
    if (this.a == null);
    while (true)
    {
      return;
      if (!paramBoolean)
        break;
      try
      {
        Integer localInteger = (Integer)org.vidogram.messenger.v.a().m.get(Long.valueOf(this.x.u()));
        if (localInteger.intValue() == 0)
        {
          this.e.setCompoundDrawablesWithIntrinsicBounds(this.q, null, null, null);
          this.e.setCompoundDrawablePadding(org.vidogram.messenger.a.a(4.0F));
          this.q.a();
          this.r.b();
          return;
        }
      }
      catch (Exception localException)
      {
        n.a("tmessages", localException);
        return;
      }
      if (localException.intValue() != 1)
        continue;
      this.e.setCompoundDrawablesWithIntrinsicBounds(this.r, null, null, null);
      this.e.setCompoundDrawablePadding(org.vidogram.messenger.a.a(4.0F));
      this.r.a();
      this.q.b();
      return;
    }
    this.e.setCompoundDrawablesWithIntrinsicBounds(null, null, null, null);
    this.e.setCompoundDrawablePadding(0);
    this.q.b();
    this.r.b();
  }

  private void b(int paramInt)
  {
    if (paramInt == 0)
    {
      a(this.i);
      a(this.j);
      a(this.k);
      paramInt = this.y - 1;
      if (paramInt < this.y + 2)
      {
        if (paramInt == this.y - 1)
          this.j = a(paramInt, true);
        while (true)
        {
          paramInt += 1;
          break;
          if (paramInt == this.y)
          {
            this.i = a(paramInt, true);
            continue;
          }
          if (paramInt != this.y + 1)
            continue;
          this.k = a(paramInt, true);
        }
      }
    }
    else
    {
      if (paramInt != 1)
        break label161;
      a(this.k);
      this.k = this.i;
      this.i = this.j;
      this.j = a(this.y - 1, true);
    }
    label161: 
    do
    {
      do
        while (true)
        {
          return;
          if (paramInt == 2)
          {
            a(this.j);
            this.j = this.i;
            this.i = this.k;
            this.k = a(this.y + 1, true);
            return;
          }
          if (paramInt != 3)
            break;
          if (this.k == null)
            continue;
          paramInt = ((FrameLayout.LayoutParams)this.k.getLayoutParams()).leftMargin;
          a(this.k);
          localObject = a(this.y + 1, false);
          this.k = ((ViewGroup)localObject);
          if (localObject == null)
            continue;
          i1 = org.vidogram.messenger.a.c.x;
          i2 = org.vidogram.messenger.a.a(24.0F);
          localObject = (FrameLayout.LayoutParams)this.k.getLayoutParams();
          ((FrameLayout.LayoutParams)localObject).gravity = 51;
          ((FrameLayout.LayoutParams)localObject).height = -1;
          ((FrameLayout.LayoutParams)localObject).width = (i1 - i2);
          ((FrameLayout.LayoutParams)localObject).leftMargin = paramInt;
          this.k.setLayoutParams((ViewGroup.LayoutParams)localObject);
          this.k.invalidate();
          return;
        }
      while ((paramInt != 4) || (this.j == null));
      paramInt = ((FrameLayout.LayoutParams)this.j.getLayoutParams()).leftMargin;
      a(this.j);
      localObject = a(0, false);
      this.j = ((ViewGroup)localObject);
    }
    while (localObject == null);
    int i1 = org.vidogram.messenger.a.c.x;
    int i2 = org.vidogram.messenger.a.a(24.0F);
    Object localObject = (FrameLayout.LayoutParams)this.j.getLayoutParams();
    ((FrameLayout.LayoutParams)localObject).gravity = 51;
    ((FrameLayout.LayoutParams)localObject).height = -1;
    ((FrameLayout.LayoutParams)localObject).width = (i1 - i2);
    ((FrameLayout.LayoutParams)localObject).leftMargin = paramInt;
    this.j.setLayoutParams((ViewGroup.LayoutParams)localObject);
    this.j.invalidate();
  }

  private void c()
  {
    if (this.G.size() > 1)
    {
      if (this.y >= this.G.size() - 1)
        break label103;
      this.y += 1;
    }
    while (true)
    {
      this.x = ((u)this.G.get(this.y));
      c(2);
      this.g.setText(String.format("%d/%d", new Object[] { Integer.valueOf(this.y + 1), Integer.valueOf(this.G.size()) }));
      return;
      label103: this.y = 0;
    }
  }

  private void c(int paramInt)
  {
    if (this.a == null)
      return;
    this.u = null;
    this.t = null;
    long l1 = this.x.u();
    this.b.setDialogId(l1);
    int i1;
    if ((int)l1 != 0)
    {
      i1 = (int)l1;
      if (i1 > 0)
      {
        this.t = org.vidogram.messenger.v.a().a(Integer.valueOf(i1));
        if ((this.u == null) || (this.t == null))
          break label218;
        this.d.setText(this.u.i);
        this.e.setText(ae.c(this.t));
        this.d.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        this.d.setCompoundDrawablePadding(0);
      }
    }
    while (true)
    {
      b(paramInt);
      h();
      i();
      a(0);
      return;
      this.u = org.vidogram.messenger.v.a().b(Integer.valueOf(-i1));
      this.t = org.vidogram.messenger.v.a().a(Integer.valueOf(this.x.a.c));
      break;
      g.t localt = org.vidogram.messenger.v.a().c(Integer.valueOf((int)(l1 >> 32)));
      this.t = org.vidogram.messenger.v.a().a(Integer.valueOf(localt.m));
      break;
      label218: if (this.t == null)
        continue;
      this.d.setText(ae.c(this.t));
      if ((int)l1 == 0)
      {
        this.d.setCompoundDrawablesWithIntrinsicBounds(2130837848, 0, 0, 0);
        this.d.setCompoundDrawablePadding(org.vidogram.messenger.a.a(4.0F));
        continue;
      }
      this.d.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
      this.d.setCompoundDrawablePadding(0);
    }
  }

  private void d()
  {
    if (this.G.size() > 1)
    {
      if (this.y <= 0)
        break label94;
      this.y -= 1;
    }
    while (true)
    {
      this.x = ((u)this.G.get(this.y));
      c(1);
      this.g.setText(String.format("%d/%d", new Object[] { Integer.valueOf(this.y + 1), Integer.valueOf(this.G.size()) }));
      return;
      label94: this.y = (this.G.size() - 1);
    }
  }

  private void e()
  {
    if (this.f != null)
      this.f.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener()
      {
        public boolean onPreDraw()
        {
          if (PopupNotificationActivity.l(PopupNotificationActivity.this) != null)
            PopupNotificationActivity.l(PopupNotificationActivity.this).getViewTreeObserver().removeOnPreDrawListener(this);
          int i = (org.vidogram.ui.a.a.getCurrentActionBarHeight() - org.vidogram.messenger.a.a(48.0F)) / 2;
          PopupNotificationActivity.l(PopupNotificationActivity.this).setPadding(PopupNotificationActivity.l(PopupNotificationActivity.this).getPaddingLeft(), i, PopupNotificationActivity.l(PopupNotificationActivity.this).getPaddingRight(), i);
          return true;
        }
      });
    if (this.h != null)
      this.h.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener()
      {
        public boolean onPreDraw()
        {
          PopupNotificationActivity.m(PopupNotificationActivity.this).getViewTreeObserver().removeOnPreDrawListener(this);
          if ((!PopupNotificationActivity.this.a()) && (!PopupNotificationActivity.n(PopupNotificationActivity.this)))
          {
            ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)PopupNotificationActivity.m(PopupNotificationActivity.this).getLayoutParams();
            localMarginLayoutParams.topMargin = org.vidogram.ui.a.a.getCurrentActionBarHeight();
            localMarginLayoutParams.bottomMargin = org.vidogram.messenger.a.a(48.0F);
            localMarginLayoutParams.width = -1;
            localMarginLayoutParams.height = -1;
            PopupNotificationActivity.m(PopupNotificationActivity.this).setLayoutParams(localMarginLayoutParams);
            PopupNotificationActivity.a(PopupNotificationActivity.this, 0);
          }
          return true;
        }
      });
  }

  private void f()
  {
    if (this.G.isEmpty())
    {
      b();
      finish();
      return;
    }
    if (((this.y != 0) || (this.b.i()) || (this.D)) && (this.x != null))
    {
      i1 = 0;
      if (i1 < this.G.size())
        if (((u)this.G.get(i1)).q() == this.x.q())
          this.y = i1;
    }
    for (int i1 = 1; ; i1 = 0)
    {
      if (i1 == 0)
      {
        this.y = 0;
        this.x = ((u)this.G.get(0));
        c(0);
      }
      while (true)
      {
        this.g.setText(String.format("%d/%d", new Object[] { Integer.valueOf(this.y + 1), Integer.valueOf(this.G.size()) }));
        return;
        i1 += 1;
        break;
        if (!this.D)
          continue;
        if (this.y == this.G.size() - 1)
        {
          b(3);
          continue;
        }
        if (this.y != 1)
          continue;
        b(4);
      }
    }
  }

  private void g()
  {
    if (this.x == null)
      return;
    Intent localIntent = new Intent(ApplicationLoader.a, LaunchActivity.class);
    long l1 = this.x.u();
    int i1;
    if ((int)l1 != 0)
    {
      i1 = (int)l1;
      if (i1 < 0)
        localIntent.putExtra("chatId", -i1);
    }
    while (true)
    {
      localIntent.setAction("com.tmessages.openchat" + Math.random() + 2147483647);
      localIntent.setFlags(32768);
      startActivity(localIntent);
      b();
      finish();
      return;
      localIntent.putExtra("userId", i1);
      continue;
      localIntent.putExtra("encId", (int)(l1 >> 32));
    }
  }

  private void h()
  {
    if (this.a == null);
    do
      return;
    while ((this.u != null) || (this.t == null));
    if ((this.t.d / 1000 != 777) && (this.t.d / 1000 != 333) && (org.vidogram.messenger.f.a().f.get(this.t.d) == null) && ((org.vidogram.messenger.f.a().f.size() != 0) || (!org.vidogram.messenger.f.a().j())))
      if ((this.t.i != null) && (this.t.i.length() != 0))
        this.d.setText(org.vidogram.a.b.a().e("+" + this.t.i));
    Object localObject;
    while (true)
    {
      localObject = (CharSequence)org.vidogram.messenger.v.a().l.get(Long.valueOf(this.x.u()));
      if ((localObject != null) && (((CharSequence)localObject).length() != 0))
        break;
      this.w = null;
      a(false);
      localObject = org.vidogram.messenger.v.a().a(Integer.valueOf(this.t.d));
      if (localObject != null)
        this.t = ((g.vw)localObject);
      this.e.setText(r.a(this.t));
      return;
      this.d.setText(ae.c(this.t));
      continue;
      this.d.setText(ae.c(this.t));
    }
    this.w = ((CharSequence)localObject);
    this.e.setText((CharSequence)localObject);
    a(true);
  }

  private void i()
  {
    Object localObject2 = null;
    org.vidogram.ui.Components.b localb = null;
    Object localObject1 = null;
    if (this.u != null)
    {
      localObject2 = org.vidogram.messenger.v.a().b(Integer.valueOf(this.u.h));
      if (localObject2 != null);
    }
    label179: 
    while (true)
    {
      return;
      this.u = ((g.i)localObject2);
      if (this.u.j != null)
        localObject1 = this.u.j.b;
      localb = new org.vidogram.ui.Components.b(this.u);
      localObject2 = localObject1;
      localObject1 = localb;
      while (true)
      {
        if (this.c == null)
          break label179;
        this.c.a((org.vidogram.tgnet.f)localObject2, "50_50", (Drawable)localObject1);
        return;
        if (this.t != null)
        {
          localObject1 = org.vidogram.messenger.v.a().a(Integer.valueOf(this.t.d));
          if (localObject1 == null)
            break;
          this.t = ((g.vw)localObject1);
          localObject1 = localb;
          if (this.t.j != null)
            localObject1 = this.t.j.e;
          localb = new org.vidogram.ui.Components.b(this.t);
          localObject2 = localObject1;
          localObject1 = localb;
          continue;
        }
        localb = null;
        localObject1 = localObject2;
        localObject2 = localb;
      }
    }
  }

  public void a(int paramInt, Object[] paramArrayOfObject)
  {
    int i1 = 0;
    if (paramInt == y.au)
    {
      b();
      finish();
    }
    do
      while (true)
      {
        return;
        if (paramInt == y.x)
        {
          f();
          return;
        }
        if (paramInt == y.b)
        {
          if (this.x == null)
            continue;
          paramInt = ((Integer)paramArrayOfObject[0]).intValue();
          if (((paramInt & 0x1) != 0) || ((paramInt & 0x4) != 0) || ((paramInt & 0x10) != 0) || ((paramInt & 0x20) != 0))
            h();
          if (((paramInt & 0x2) != 0) || ((paramInt & 0x8) != 0))
            i();
          if ((paramInt & 0x40) == 0)
            continue;
          paramArrayOfObject = (CharSequence)org.vidogram.messenger.v.a().l.get(Long.valueOf(this.x.u()));
          if (((this.w == null) || (paramArrayOfObject != null)) && ((this.w != null) || (paramArrayOfObject == null)) && ((this.w == null) || (paramArrayOfObject == null) || (this.w.equals(paramArrayOfObject))))
            continue;
          h();
          return;
        }
        Object localObject;
        if (paramInt == y.aF)
        {
          paramArrayOfObject = (Integer)paramArrayOfObject[0];
          if (this.h == null)
            continue;
          i1 = this.h.getChildCount();
          paramInt = 0;
          while (paramInt < i1)
          {
            localObject = this.h.getChildAt(paramInt);
            if (((Integer)((View)localObject).getTag()).intValue() == 3)
            {
              localObject = (aq)((View)localObject).findViewWithTag(Integer.valueOf(300));
              if ((((aq)localObject).getMessageObject() != null) && (((aq)localObject).getMessageObject().q() == paramArrayOfObject.intValue()))
              {
                ((aq)localObject).f();
                return;
              }
            }
            paramInt += 1;
          }
          continue;
        }
        if (paramInt == y.aE)
        {
          paramArrayOfObject = (Integer)paramArrayOfObject[0];
          if (this.h == null)
            continue;
          i1 = this.h.getChildCount();
          paramInt = 0;
          while (paramInt < i1)
          {
            localObject = this.h.getChildAt(paramInt);
            if (((Integer)((View)localObject).getTag()).intValue() == 3)
            {
              localObject = (aq)((View)localObject).findViewWithTag(Integer.valueOf(300));
              if ((((aq)localObject).getMessageObject() != null) && (((aq)localObject).getMessageObject().q() == paramArrayOfObject.intValue()))
              {
                ((aq)localObject).d();
                return;
              }
            }
            paramInt += 1;
          }
          continue;
        }
        if (paramInt != y.at)
          break;
        if (this.h == null)
          continue;
        int i2 = this.h.getChildCount();
        paramInt = i1;
        while (paramInt < i2)
        {
          paramArrayOfObject = this.h.getChildAt(paramInt);
          if (((Integer)paramArrayOfObject.getTag()).intValue() == 1)
          {
            paramArrayOfObject = (TextView)paramArrayOfObject.findViewWithTag(Integer.valueOf(301));
            if (paramArrayOfObject != null)
              paramArrayOfObject.invalidate();
          }
          paramInt += 1;
        }
      }
    while (paramInt != y.k);
    h();
  }

  public boolean a()
  {
    if ((this.A) && (this.B < System.currentTimeMillis() - 400L))
    {
      this.A = false;
      if (this.E != null)
      {
        this.E.run();
        this.E = null;
      }
    }
    return this.A;
  }

  public boolean a(MotionEvent paramMotionEvent)
  {
    if (a())
      return false;
    if ((paramMotionEvent != null) && (paramMotionEvent.getAction() == 0))
      this.C = paramMotionEvent.getX();
    int i4;
    int i2;
    label199: label209: 
    do
      while (true)
      {
        return this.D;
        if ((paramMotionEvent == null) || (paramMotionEvent.getAction() != 2))
          break;
        float f1 = paramMotionEvent.getX();
        i4 = (int)(f1 - this.C);
        int i1 = i4;
        if (this.C != -1.0F)
        {
          i1 = i4;
          if (!this.D)
          {
            i1 = i4;
            if (Math.abs(i4) > org.vidogram.messenger.a.a(10.0F))
            {
              this.D = true;
              this.C = f1;
              org.vidogram.messenger.a.a(this);
              if (this.p != null)
                break label199;
              this.p = VelocityTracker.obtain();
            }
          }
        }
        for (i2 = 0; ; i2 = 0)
        {
          if (!this.D)
            break label209;
          i4 = i2;
          if (this.j == null)
          {
            i4 = i2;
            if (i2 > 0)
              i4 = 0;
          }
          i2 = i4;
          if (this.k == null)
          {
            i2 = i4;
            if (i4 < 0)
              i2 = 0;
          }
          if (this.p != null)
            this.p.addMovement(paramMotionEvent);
          a(i2);
          break;
          this.p.clear();
        }
      }
    while ((paramMotionEvent != null) && (paramMotionEvent.getAction() != 1) && (paramMotionEvent.getAction() != 3));
    Object localObject;
    int i5;
    if ((paramMotionEvent != null) && (this.D))
    {
      localObject = (FrameLayout.LayoutParams)this.i.getLayoutParams();
      i5 = (int)(paramMotionEvent.getX() - this.C);
      i4 = org.vidogram.messenger.a.c.x - org.vidogram.messenger.a.a(24.0F);
      if (this.p == null)
        break label622;
      this.p.computeCurrentVelocity(1000);
      if (this.p.getXVelocity() >= 3500.0F)
        i2 = 1;
    }
    while (true)
    {
      label313: if (((i2 == 1) || (i5 > i4 / 3)) && (this.j != null))
      {
        i2 = i4 - ((FrameLayout.LayoutParams)localObject).leftMargin;
        paramMotionEvent = this.j;
        this.E = new Runnable()
        {
          public void run()
          {
            PopupNotificationActivity.a(PopupNotificationActivity.this, false);
            PopupNotificationActivity.k(PopupNotificationActivity.this);
            org.vidogram.messenger.a.b(PopupNotificationActivity.this);
          }
        };
      }
      while (true)
      {
        label360: if (i2 != 0)
        {
          i4 = (int)(Math.abs(i2 / i4) * 200.0F);
          localObject = new TranslateAnimation(0.0F, i2, 0.0F, 0.0F);
          ((TranslateAnimation)localObject).setDuration(i4);
          this.i.startAnimation((Animation)localObject);
          if (paramMotionEvent != null)
          {
            localObject = new TranslateAnimation(0.0F, i2, 0.0F, 0.0F);
            ((TranslateAnimation)localObject).setDuration(i4);
            paramMotionEvent.startAnimation((Animation)localObject);
          }
          this.A = true;
          this.B = System.currentTimeMillis();
        }
        while (true)
        {
          if (this.p != null)
          {
            this.p.recycle();
            this.p = null;
          }
          this.D = false;
          this.C = -1.0F;
          break;
          if (this.p.getXVelocity() > -3500.0F)
            break label622;
          i3 = 2;
          break label313;
          if (((i3 == 2) || (i5 < -i4 / 3)) && (this.k != null))
          {
            i3 = -i4 - ((FrameLayout.LayoutParams)localObject).leftMargin;
            paramMotionEvent = this.k;
            this.E = new Runnable()
            {
              public void run()
              {
                PopupNotificationActivity.a(PopupNotificationActivity.this, false);
                PopupNotificationActivity.j(PopupNotificationActivity.this);
                org.vidogram.messenger.a.b(PopupNotificationActivity.this);
              }
            };
            break label360;
          }
          if (((FrameLayout.LayoutParams)localObject).leftMargin == 0)
            break label615;
          i3 = -((FrameLayout.LayoutParams)localObject).leftMargin;
          if (i5 > 0);
          for (paramMotionEvent = this.j; ; paramMotionEvent = this.k)
          {
            this.E = new Runnable()
            {
              public void run()
              {
                PopupNotificationActivity.a(PopupNotificationActivity.this, false);
                PopupNotificationActivity.a(PopupNotificationActivity.this, 0);
                org.vidogram.messenger.a.b(PopupNotificationActivity.this);
              }
            };
            break;
          }
          a(0);
        }
        label615: paramMotionEvent = null;
        i3 = 0;
      }
      label622: int i3 = 0;
    }
  }

  protected void b()
  {
    if (this.v);
    do
    {
      return;
      this.v = true;
      if (this.F)
        this.G.clear();
      y.a().b(this, y.au);
      y.a().b(this, y.x);
      y.a().b(this, y.b);
      y.a().b(this, y.aE);
      y.a().b(this, y.aF);
      y.a().b(this, y.k);
      y.a().b(this, y.at);
      if (this.b == null)
        continue;
      this.b.c();
    }
    while (!this.z.isHeld());
    this.z.release();
  }

  public void onBackPressed()
  {
    if (this.b.o())
    {
      this.b.c(true);
      return;
    }
    super.onBackPressed();
  }

  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    org.vidogram.messenger.a.a(this, paramConfiguration);
    e();
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    l.a(this);
    int i1 = getResources().getIdentifier("status_bar_height", "dimen", "android");
    if (i1 > 0)
      org.vidogram.messenger.a.a = getResources().getDimensionPixelSize(i1);
    this.s = ConnectionsManager.a().i();
    y.a().a(this, y.au);
    y.a().a(this, y.x);
    y.a().a(this, y.b);
    y.a().a(this, y.aE);
    y.a().a(this, y.aF);
    y.a().a(this, y.k);
    y.a().a(this, y.at);
    this.q = new bp();
    this.r = new au();
    paramBundle = new bg(this)
    {
      protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
      {
        int n = getChildCount();
        int k;
        if (getKeyboardHeight() <= org.vidogram.messenger.a.a(20.0F))
          k = PopupNotificationActivity.b(PopupNotificationActivity.this).getEmojiPadding();
        View localView;
        FrameLayout.LayoutParams localLayoutParams;
        int i1;
        int i2;
        int i;
        int j;
        while (true)
        {
          int m = 0;
          while (true)
          {
            if (m >= n)
              break label473;
            localView = getChildAt(m);
            if (localView.getVisibility() == 8)
            {
              m += 1;
              continue;
              k = 0;
              break;
            }
          }
          localLayoutParams = (FrameLayout.LayoutParams)localView.getLayoutParams();
          i1 = localView.getMeasuredWidth();
          i2 = localView.getMeasuredHeight();
          i = localLayoutParams.gravity;
          j = i;
          if (i == -1)
            j = 51;
          switch (j & 0x7 & 0x7)
          {
          default:
            i = localLayoutParams.leftMargin;
            label159: switch (j & 0x70)
            {
            default:
              j = localLayoutParams.topMargin;
              label207: if (PopupNotificationActivity.b(PopupNotificationActivity.this).b(localView))
                if (k != 0)
                  j = getMeasuredHeight() - k;
            case 48:
            case 16:
            case 80:
            }
          case 1:
          case 5:
          }
        }
        while (true)
        {
          localView.layout(i, j, i + i1, j + i2);
          break;
          i = (paramInt3 - paramInt1 - i1) / 2 + localLayoutParams.leftMargin - localLayoutParams.rightMargin;
          break label159;
          i = paramInt3 - i1 - localLayoutParams.rightMargin;
          break label159;
          j = localLayoutParams.topMargin;
          break label207;
          j = (paramInt4 - k - paramInt2 - i2) / 2 + localLayoutParams.topMargin - localLayoutParams.bottomMargin;
          break label207;
          j = paramInt4 - k - paramInt2 - i2 - localLayoutParams.bottomMargin;
          break label207;
          j = getMeasuredHeight();
          continue;
          if (PopupNotificationActivity.b(PopupNotificationActivity.this).c(localView))
          {
            j = PopupNotificationActivity.c(PopupNotificationActivity.this).getTop();
            int i3 = PopupNotificationActivity.c(PopupNotificationActivity.this).getMeasuredHeight();
            int i4 = localView.getMeasuredHeight();
            int i5 = localLayoutParams.bottomMargin;
            i = PopupNotificationActivity.c(PopupNotificationActivity.this).getLeft() + PopupNotificationActivity.c(PopupNotificationActivity.this).getMeasuredWidth() - localView.getMeasuredWidth() - localLayoutParams.rightMargin;
            j = j + i3 - i4 - i5;
            continue;
            label473: a();
            return;
          }
        }
      }

      protected void onMeasure(int paramInt1, int paramInt2)
      {
        View.MeasureSpec.getMode(paramInt1);
        View.MeasureSpec.getMode(paramInt2);
        int k = View.MeasureSpec.getSize(paramInt1);
        int i = View.MeasureSpec.getSize(paramInt2);
        setMeasuredDimension(k, i);
        if (getKeyboardHeight() <= org.vidogram.messenger.a.a(20.0F))
          i -= PopupNotificationActivity.b(PopupNotificationActivity.this).getEmojiPadding();
        while (true)
        {
          int m = getChildCount();
          int j = 0;
          if (j < m)
          {
            View localView = getChildAt(j);
            if (localView.getVisibility() == 8);
            while (true)
            {
              j += 1;
              break;
              if (PopupNotificationActivity.b(PopupNotificationActivity.this).b(localView))
              {
                localView.measure(View.MeasureSpec.makeMeasureSpec(k, 1073741824), View.MeasureSpec.makeMeasureSpec(localView.getLayoutParams().height, 1073741824));
                continue;
              }
              if (PopupNotificationActivity.b(PopupNotificationActivity.this).c(localView))
              {
                measureChildWithMargins(localView, paramInt1, 0, paramInt2, 0);
                continue;
              }
              localView.measure(View.MeasureSpec.makeMeasureSpec(k, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(org.vidogram.messenger.a.a(10.0F), org.vidogram.messenger.a.a(2.0F) + i), 1073741824));
            }
          }
          return;
        }
      }
    };
    setContentView(paramBundle);
    if (Build.VERSION.SDK_INT >= 21)
      getWindow().setStatusBarColor(l.a);
    paramBundle.setBackgroundColor(-1728053248);
    RelativeLayout localRelativeLayout = new RelativeLayout(this);
    paramBundle.addView(localRelativeLayout, org.vidogram.ui.Components.v.a(-1, -1.0F));
    this.l = new RelativeLayout(this);
    this.l.setBackgroundColor(-1);
    localRelativeLayout.addView(this.l, org.vidogram.ui.Components.v.a(-1, 240, 12, 0, 12, 0, 13));
    if (this.b != null)
      this.b.c();
    this.b = new e(this, paramBundle, null, false);
    this.l.addView(this.b, org.vidogram.ui.Components.v.c(-1, -2, 12));
    this.b.setDelegate(new e.a()
    {
      public void a()
      {
        if (PopupNotificationActivity.d(PopupNotificationActivity.this) != null)
          org.vidogram.messenger.v.a().a(PopupNotificationActivity.d(PopupNotificationActivity.this).u(), 0, PopupNotificationActivity.h(PopupNotificationActivity.this));
      }

      public void a(int paramInt)
      {
      }

      public void a(CharSequence paramCharSequence)
      {
        if (PopupNotificationActivity.d(PopupNotificationActivity.this) == null)
          return;
        if ((PopupNotificationActivity.e(PopupNotificationActivity.this) >= 0) && (PopupNotificationActivity.e(PopupNotificationActivity.this) < PopupNotificationActivity.f(PopupNotificationActivity.this).size()))
          PopupNotificationActivity.f(PopupNotificationActivity.this).remove(PopupNotificationActivity.e(PopupNotificationActivity.this));
        org.vidogram.messenger.v.a().a(PopupNotificationActivity.d(PopupNotificationActivity.this).u(), PopupNotificationActivity.d(PopupNotificationActivity.this).q(), Math.max(0, PopupNotificationActivity.d(PopupNotificationActivity.this).q()), PopupNotificationActivity.d(PopupNotificationActivity.this).a.e, true, true);
        PopupNotificationActivity.a(PopupNotificationActivity.this, null);
        PopupNotificationActivity.g(PopupNotificationActivity.this);
      }

      public void a(CharSequence paramCharSequence, boolean paramBoolean)
      {
      }

      public void a(boolean paramBoolean)
      {
      }

      public void b()
      {
      }

      public void b(boolean paramBoolean)
      {
      }

      public void c()
      {
      }
    });
    this.h = new b(this);
    this.l.addView(this.h, 0);
    this.a = new org.vidogram.ui.a.a(this);
    this.a.setOccupyStatusBar(false);
    this.a.setBackButtonImage(2130837794);
    this.a.setBackgroundColor(l.a);
    this.a.setItemsBackgroundColor(1929379839);
    this.l.addView(this.a);
    paramBundle = this.a.getLayoutParams();
    paramBundle.width = -1;
    this.a.setLayoutParams(paramBundle);
    this.g = ((TextView)this.a.a().a(2, 2130968648).findViewById(2131624151));
    this.f = new FrameLayout(this);
    this.f.setPadding(org.vidogram.messenger.a.a(4.0F), 0, org.vidogram.messenger.a.a(4.0F), 0);
    this.a.addView(this.f);
    paramBundle = (FrameLayout.LayoutParams)this.f.getLayoutParams();
    paramBundle.height = -1;
    paramBundle.width = -2;
    paramBundle.rightMargin = org.vidogram.messenger.a.a(48.0F);
    paramBundle.leftMargin = org.vidogram.messenger.a.a(60.0F);
    paramBundle.gravity = 51;
    this.f.setLayoutParams(paramBundle);
    this.c = new BackupImageView(this);
    this.c.setRoundRadius(org.vidogram.messenger.a.a(21.0F));
    this.f.addView(this.c);
    paramBundle = (FrameLayout.LayoutParams)this.c.getLayoutParams();
    paramBundle.width = org.vidogram.messenger.a.a(42.0F);
    paramBundle.height = org.vidogram.messenger.a.a(42.0F);
    paramBundle.topMargin = org.vidogram.messenger.a.a(3.0F);
    this.c.setLayoutParams(paramBundle);
    this.d = new TextView(this);
    this.d.setTextColor(-1);
    this.d.setTextSize(1, 18.0F);
    this.d.setLines(1);
    this.d.setMaxLines(1);
    this.d.setSingleLine(true);
    this.d.setEllipsize(TextUtils.TruncateAt.END);
    this.d.setGravity(3);
    this.d.setTypeface(org.vidogram.messenger.a.a("fonts/rmedium.ttf"));
    this.f.addView(this.d);
    paramBundle = (FrameLayout.LayoutParams)this.d.getLayoutParams();
    paramBundle.width = -2;
    paramBundle.height = -2;
    paramBundle.leftMargin = org.vidogram.messenger.a.a(54.0F);
    paramBundle.bottomMargin = org.vidogram.messenger.a.a(22.0F);
    paramBundle.gravity = 80;
    this.d.setLayoutParams(paramBundle);
    this.e = new TextView(this);
    this.e.setTextColor(-2758409);
    this.e.setTextSize(1, 14.0F);
    this.e.setLines(1);
    this.e.setMaxLines(1);
    this.e.setSingleLine(true);
    this.e.setEllipsize(TextUtils.TruncateAt.END);
    this.e.setGravity(3);
    this.f.addView(this.e);
    paramBundle = (FrameLayout.LayoutParams)this.e.getLayoutParams();
    paramBundle.width = -2;
    paramBundle.height = -2;
    paramBundle.leftMargin = org.vidogram.messenger.a.a(54.0F);
    paramBundle.bottomMargin = org.vidogram.messenger.a.a(4.0F);
    paramBundle.gravity = 80;
    this.e.setLayoutParams(paramBundle);
    this.a.setActionBarMenuOnItemClick(new a.a()
    {
      public void a(int paramInt)
      {
        if (paramInt == -1)
        {
          PopupNotificationActivity.this.b();
          PopupNotificationActivity.this.finish();
        }
        do
        {
          return;
          if (paramInt != 1)
            continue;
          PopupNotificationActivity.i(PopupNotificationActivity.this);
          return;
        }
        while (paramInt != 2);
        PopupNotificationActivity.j(PopupNotificationActivity.this);
      }
    });
    this.z = ((PowerManager)ApplicationLoader.a.getSystemService("power")).newWakeLock(268435462, "screen");
    this.z.setReferenceCounted(false);
    a(getIntent());
  }

  protected void onDestroy()
  {
    super.onDestroy();
    b();
    if (this.z.isHeld())
      this.z.release();
    if (this.c != null)
      this.c.setImageDrawable(null);
  }

  protected void onNewIntent(Intent paramIntent)
  {
    super.onNewIntent(paramIntent);
    a(paramIntent);
  }

  protected void onPause()
  {
    super.onPause();
    overridePendingTransition(0, 0);
    if (this.b != null)
    {
      this.b.c(false);
      this.b.setFieldFocused(false);
    }
    ConnectionsManager.a().a(true, false);
  }

  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    super.onRequestPermissionsResult(paramInt, paramArrayOfString, paramArrayOfInt);
    if ((paramInt != 3) || (paramArrayOfInt[0] == 0))
      return;
    paramArrayOfString = new AlertDialog.Builder(this);
    paramArrayOfString.setTitle(r.a("AppName", 2131230856));
    paramArrayOfString.setMessage(r.a("PermissionNoAudio", 2131231657));
    paramArrayOfString.setNegativeButton(r.a("PermissionOpenSettings", 2131231661), new DialogInterface.OnClickListener()
    {
      @TargetApi(9)
      public void onClick(DialogInterface paramDialogInterface, int paramInt)
      {
        try
        {
          paramDialogInterface = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
          paramDialogInterface.setData(Uri.parse("package:" + ApplicationLoader.a.getPackageName()));
          PopupNotificationActivity.this.startActivity(paramDialogInterface);
          return;
        }
        catch (Exception paramDialogInterface)
        {
          n.a("tmessages", paramDialogInterface);
        }
      }
    });
    paramArrayOfString.setPositiveButton(r.a("OK", 2131231604), null);
    paramArrayOfString.show();
  }

  protected void onResume()
  {
    super.onResume();
    if (this.b != null)
      this.b.setFieldFocused(true);
    ConnectionsManager.a().a(false, false);
    e();
    i();
    this.z.acquire(7000L);
  }

  public class a extends FrameLayout
  {
    public a(Context arg2)
    {
      super();
    }

    protected void onAnimationEnd()
    {
      super.onAnimationEnd();
      if (PopupNotificationActivity.a(PopupNotificationActivity.this) != null)
      {
        PopupNotificationActivity.a(PopupNotificationActivity.this).run();
        PopupNotificationActivity.a(PopupNotificationActivity.this, null);
      }
    }
  }

  private class b extends FrameLayout
  {
    public b(Context arg2)
    {
      super();
    }

    public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
    {
      return (PopupNotificationActivity.this.a()) || (((PopupNotificationActivity)getContext()).a(paramMotionEvent));
    }

    public boolean onTouchEvent(MotionEvent paramMotionEvent)
    {
      return (PopupNotificationActivity.this.a()) || (((PopupNotificationActivity)getContext()).a(paramMotionEvent));
    }

    public void requestDisallowInterceptTouchEvent(boolean paramBoolean)
    {
      ((PopupNotificationActivity)getContext()).a(null);
      super.requestDisallowInterceptTouchEvent(paramBoolean);
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.PopupNotificationActivity
 * JD-Core Version:    0.6.0
 */