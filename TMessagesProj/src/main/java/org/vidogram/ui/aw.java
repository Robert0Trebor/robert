package org.vidogram.ui;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.Html;
import android.text.Spannable;
import android.text.TextUtils.TruncateAt;
import android.text.method.LinkMovementMethod;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewOutlineProvider;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import java.io.File;
import java.util.ArrayList;
import java.util.Locale;
import org.vidogram.messenger.ApplicationLoader;
import org.vidogram.messenger.MediaController;
import org.vidogram.messenger.ad;
import org.vidogram.messenger.ae;
import org.vidogram.messenger.n;
import org.vidogram.messenger.support.widget.LinearLayoutManager;
import org.vidogram.messenger.support.widget.RecyclerView;
import org.vidogram.messenger.support.widget.RecyclerView.a;
import org.vidogram.messenger.support.widget.RecyclerView.i;
import org.vidogram.messenger.support.widget.RecyclerView.l;
import org.vidogram.messenger.support.widget.RecyclerView.u;
import org.vidogram.messenger.u;
import org.vidogram.messenger.y;
import org.vidogram.messenger.y.b;
import org.vidogram.tgnet.ConnectionsManager;
import org.vidogram.tgnet.g.ad;
import org.vidogram.tgnet.g.az;
import org.vidogram.tgnet.g.jh;
import org.vidogram.tgnet.g.sa;
import org.vidogram.tgnet.g.us;
import org.vidogram.tgnet.g.vw;
import org.vidogram.tgnet.g.vx;
import org.vidogram.tgnet.g.x;
import org.vidogram.ui.Components.BackupImageView;
import org.vidogram.ui.Components.ab;
import org.vidogram.ui.Components.aw.c;
import org.vidogram.ui.Components.c.a;
import org.vidogram.ui.a.a.a;
import org.vidogram.ui.a.h.a;
import org.vidogram.ui.a.h.d;
import org.vidogram.ui.c.ap;
import org.vidogram.ui.c.ba;
import org.vidogram.ui.c.bd;
import org.vidogram.ui.c.be;
import org.vidogram.ui.c.bg;
import org.vidogram.ui.c.l;
import org.vidogram.ui.c.w;

public class aw extends org.vidogram.ui.a.g
  implements y.b, am.d
{
  private int A;
  private int B;
  private int C;
  private int D;
  private int E;
  private int F;
  private int G;
  private int H;
  private int I;
  private int J;
  private int K;
  private int L;
  private int M;
  private int N;
  private int O;
  private int P;
  private int Q;
  private int R;
  private int S;
  private int T;
  private int U;
  private int V;
  private int W;
  private int X;
  private int Y;
  private int Z;
  private int aa;
  private int ab;
  private int ac;
  private int ad;
  private int ae;
  private int af;
  private int ag;
  private int ah;
  private int ai;
  private int aj;
  private int ak;
  private org.vidogram.ui.Components.aw i;
  private b j;
  private LinearLayoutManager k;
  private BackupImageView l;
  private TextView m;
  private TextView n;
  private ImageView o;
  private AnimatorSet p;
  private org.vidogram.ui.Components.c q = new org.vidogram.ui.Components.c();
  private View r;
  private View s;
  private int t;
  private int u;
  private int v;
  private int w;
  private int x;
  private int y;
  private int z;

  private void q()
  {
    SharedPreferences localSharedPreferences = ApplicationLoader.a.getSharedPreferences("mainconfig", 0);
    int i1 = localSharedPreferences.getInt("support_id", 0);
    Object localObject2;
    Object localObject1;
    Object localObject3;
    if (i1 != 0)
    {
      localObject2 = org.vidogram.messenger.v.a().a(Integer.valueOf(i1));
      localObject1 = localObject2;
      if (localObject2 == null)
      {
        localObject3 = localSharedPreferences.getString("support_user", null);
        localObject1 = localObject2;
        if (localObject3 == null);
      }
    }
    while (true)
    {
      try
      {
        localObject3 = Base64.decode((String)localObject3, 0);
        localObject1 = localObject2;
        if (localObject3 == null)
          continue;
        localObject3 = new org.vidogram.tgnet.e(localObject3);
        localObject2 = g.vw.a((org.vidogram.tgnet.a)localObject3, ((org.vidogram.tgnet.e)localObject3).b(false), false);
        localObject1 = localObject2;
        if (localObject2 == null)
          continue;
        localObject1 = localObject2;
        if (((g.vw)localObject2).d != 333000)
          continue;
        localObject1 = null;
        ((org.vidogram.tgnet.e)localObject3).b();
        if (localObject1 != null)
          continue;
        localObject1 = new ProgressDialog(l());
        ((ProgressDialog)localObject1).setMessage(org.vidogram.messenger.r.a("Loading", 2131231394));
        ((ProgressDialog)localObject1).setCanceledOnTouchOutside(false);
        ((ProgressDialog)localObject1).setCancelable(false);
        ((ProgressDialog)localObject1).show();
        localObject2 = new g.jh();
        ConnectionsManager.a().a((org.vidogram.tgnet.f)localObject2, new org.vidogram.tgnet.c(localSharedPreferences, (ProgressDialog)localObject1)
        {
        });
        return;
      }
      catch (Exception localvw)
      {
        n.a("tmessages", localException);
        localvw = null;
        continue;
        org.vidogram.messenger.v.a().a(localvw, true);
        localObject2 = new Bundle();
        ((Bundle)localObject2).putInt("user_id", localvw.d);
        a(new q((Bundle)localObject2));
        return;
      }
      g.vw localvw = null;
    }
  }

  private void r()
  {
    int i3 = 0;
    float f1;
    int i2;
    label138: boolean bool1;
    label172: boolean bool2;
    if (this.d.getOccupyStatusBar())
    {
      int i1 = org.vidogram.messenger.a.a;
      i1 = org.vidogram.ui.a.a.getCurrentActionBarHeight() + i1;
      Object localObject;
      if (this.i != null)
      {
        localObject = (FrameLayout.LayoutParams)this.i.getLayoutParams();
        if (((FrameLayout.LayoutParams)localObject).topMargin != i1)
        {
          ((FrameLayout.LayoutParams)localObject).topMargin = i1;
          this.i.setLayoutParams((ViewGroup.LayoutParams)localObject);
          this.r.setTranslationY(i1);
        }
      }
      if (this.l != null)
      {
        f1 = this.t / org.vidogram.messenger.a.a(88.0F);
        this.r.setScaleY(f1);
        this.s.setTranslationY(i1 + this.t);
        localObject = this.o;
        if (!this.d.getOccupyStatusBar())
          break label630;
        i2 = org.vidogram.messenger.a.a;
        ((ImageView)localObject).setTranslationY(i2 + org.vidogram.ui.a.a.getCurrentActionBarHeight() + this.t - org.vidogram.messenger.a.a(29.5F));
        if (f1 <= 0.2F)
          break label635;
        bool1 = true;
        if (this.o.getTag() != null)
          break label641;
        bool2 = true;
        label185: if (bool1 != bool2)
        {
          if (!bool1)
            break label647;
          this.o.setTag(null);
          this.o.setVisibility(0);
          label213: if (this.p != null)
          {
            localObject = this.p;
            this.p = null;
            ((AnimatorSet)localObject).cancel();
          }
          this.p = new AnimatorSet();
          if (!bool1)
            break label661;
          this.p.setInterpolator(new DecelerateInterpolator());
          this.p.playTogether(new Animator[] { ObjectAnimator.ofFloat(this.o, "scaleX", new float[] { 1.0F }), ObjectAnimator.ofFloat(this.o, "scaleY", new float[] { 1.0F }), ObjectAnimator.ofFloat(this.o, "alpha", new float[] { 1.0F }) });
        }
      }
    }
    while (true)
    {
      this.p.setDuration(150L);
      this.p.addListener(new org.vidogram.messenger.b(bool1)
      {
        public void onAnimationEnd(Animator paramAnimator)
        {
          if ((aw.T(aw.this) != null) && (aw.T(aw.this).equals(paramAnimator)))
          {
            paramAnimator = aw.U(aw.this);
            if (!this.a)
              break label56;
          }
          label56: for (int i = 0; ; i = 8)
          {
            paramAnimator.setVisibility(i);
            aw.a(aw.this, null);
            return;
          }
        }
      });
      this.p.start();
      this.l.setScaleX((18.0F * f1 + 42.0F) / 42.0F);
      this.l.setScaleY((18.0F * f1 + 42.0F) / 42.0F);
      i2 = i3;
      if (this.d.getOccupyStatusBar())
        i2 = org.vidogram.messenger.a.a;
      float f2 = i2 + org.vidogram.ui.a.a.getCurrentActionBarHeight() / 2.0F * (1.0F + f1) - 21.0F * org.vidogram.messenger.a.b + 27.0F * org.vidogram.messenger.a.b * f1;
      this.l.setTranslationX(-org.vidogram.messenger.a.a(47.0F) * f1);
      this.l.setTranslationY((float)Math.ceil(f2));
      this.m.setTranslationX(-21.0F * org.vidogram.messenger.a.b * f1);
      this.m.setTranslationY((float)Math.floor(f2) - (float)Math.ceil(org.vidogram.messenger.a.b) + (float)Math.floor(7.0F * org.vidogram.messenger.a.b * f1));
      this.n.setTranslationX(-21.0F * org.vidogram.messenger.a.b * f1);
      this.n.setTranslationY((float)Math.floor(f2) + org.vidogram.messenger.a.a(22.0F) + (float)Math.floor(11.0F * org.vidogram.messenger.a.b) * f1);
      this.m.setScaleX(0.12F * f1 + 1.0F);
      this.m.setScaleY(0.12F * f1 + 1.0F);
      return;
      i2 = 0;
      break;
      label630: i2 = 0;
      break label138;
      label635: bool1 = false;
      break label172;
      label641: bool2 = false;
      break label185;
      label647: this.o.setTag(Integer.valueOf(0));
      break label213;
      label661: this.p.setInterpolator(new AccelerateInterpolator());
      this.p.playTogether(new Animator[] { ObjectAnimator.ofFloat(this.o, "scaleX", new float[] { 0.2F }), ObjectAnimator.ofFloat(this.o, "scaleY", new float[] { 0.2F }), ObjectAnimator.ofFloat(this.o, "alpha", new float[] { 0.0F }) });
    }
  }

  private void s()
  {
    if (this.b == null)
      return;
    this.b.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener()
    {
      public boolean onPreDraw()
      {
        if (aw.V(aw.this) != null)
        {
          aw.S(aw.this);
          aw.W(aw.this).getViewTreeObserver().removeOnPreDrawListener(this);
        }
        return true;
      }
    });
  }

  private void t()
  {
    g.x localx = null;
    boolean bool2 = true;
    g.vw localvw = org.vidogram.messenger.v.a().a(Integer.valueOf(ad.c()));
    Object localObject;
    if (localvw.j != null)
    {
      localObject = localvw.j.e;
      localx = localvw.j.f;
    }
    while (true)
    {
      org.vidogram.ui.Components.b localb = new org.vidogram.ui.Components.b(localvw, true);
      localb.h(-11500111);
      if (this.l != null)
      {
        this.l.a((org.vidogram.tgnet.f)localObject, "50_50", localb);
        localObject = this.l.getImageReceiver();
        if (am.a().a(localx))
          break label171;
        bool1 = true;
        ((org.vidogram.messenger.q)localObject).a(bool1, false);
        this.m.setText(ae.c(localvw));
        this.n.setText(org.vidogram.messenger.r.a("Online", 2131231606));
        localObject = this.l.getImageReceiver();
        if (am.a().a(localx))
          break label176;
      }
      label171: label176: for (boolean bool1 = bool2; ; bool1 = false)
      {
        ((org.vidogram.messenger.q)localObject).a(bool1, false);
        return;
        bool1 = false;
        break;
      }
      localObject = null;
    }
  }

  private void u()
  {
    int i1 = 0;
    try
    {
      ArrayList localArrayList = new ArrayList();
      Object localObject = ApplicationLoader.a.getExternalFilesDir(null);
      localObject = new File(((File)localObject).getAbsolutePath() + "/logs").listFiles();
      int i2 = localObject.length;
      while (i1 < i2)
      {
        localArrayList.add(Uri.fromFile(localObject[i1]));
        i1 += 1;
      }
      if (localArrayList.isEmpty())
        return;
      localObject = new Intent("android.intent.action.SEND_MULTIPLE");
      ((Intent)localObject).setType("message/rfc822");
      ((Intent)localObject).putExtra("android.intent.extra.EMAIL", new String[] { org.vidogram.messenger.d.i });
      ((Intent)localObject).putExtra("android.intent.extra.SUBJECT", "last logs");
      ((Intent)localObject).putParcelableArrayListExtra("android.intent.extra.STREAM", localArrayList);
      l().startActivityForResult(Intent.createChooser((Intent)localObject, "Select email application."), 500);
      return;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }

  public int A()
  {
    return 0;
  }

  public View a(Context paramContext)
  {
    this.d.setBackgroundColor(org.vidogram.ui.Components.b.f(5));
    this.d.setItemsBackgroundColor(org.vidogram.ui.Components.b.c(5));
    this.d.setBackButtonImage(2130837794);
    this.d.setAddToContainer(false);
    this.t = 88;
    if (org.vidogram.messenger.a.c())
      this.d.setOccupyStatusBar(false);
    this.d.setActionBarMenuOnItemClick(new a.a()
    {
      public void a(int paramInt)
      {
        if (paramInt == -1)
          aw.this.d();
        do
        {
          return;
          if (paramInt != 1)
            continue;
          aw.this.a(new h());
          return;
        }
        while ((paramInt != 2) || (aw.this.l() == null));
        AlertDialog.Builder localBuilder = new AlertDialog.Builder(aw.this.l());
        localBuilder.setMessage(org.vidogram.messenger.r.a("AreYouSureLogout", 2131230881));
        localBuilder.setTitle(org.vidogram.messenger.r.a("AppName", 2131230856));
        localBuilder.setPositiveButton(org.vidogram.messenger.r.a("OK", 2131231604), new DialogInterface.OnClickListener()
        {
          public void onClick(DialogInterface paramDialogInterface, int paramInt)
          {
            org.vidogram.messenger.v.a().b(true);
          }
        });
        localBuilder.setNegativeButton(org.vidogram.messenger.r.a("Cancel", 2131230943), null);
        aw.this.b(localBuilder.create());
      }
    });
    Object localObject1 = this.d.a().b(0, 2130837803);
    ((org.vidogram.ui.a.d)localObject1).a(1, org.vidogram.messenger.r.a("EditName", 2131231153), 0);
    ((org.vidogram.ui.a.d)localObject1).a(2, org.vidogram.messenger.r.a("LogOut", 2131231404), 0);
    this.j = new b(paramContext);
    this.b = new FrameLayout(paramContext)
    {
      protected boolean drawChild(Canvas paramCanvas, View paramView, long paramLong)
      {
        boolean bool;
        View localView;
        if (paramView == aw.a(aw.this))
        {
          bool = super.drawChild(paramCanvas, paramView, paramLong);
          if (aw.b(aw.this) != null)
          {
            int j = getChildCount();
            i = 0;
            if (i >= j)
              break label127;
            localView = getChildAt(i);
            if (localView == paramView);
            do
            {
              i += 1;
              break;
            }
            while ((!(localView instanceof org.vidogram.ui.a.a)) || (localView.getVisibility() != 0));
            if (!((org.vidogram.ui.a.a)localView).getCastShadows())
              break label127;
          }
        }
        label127: for (int i = localView.getMeasuredHeight(); ; i = 0)
        {
          aw.c(aw.this).a(paramCanvas, i);
          return bool;
          return super.drawChild(paramCanvas, paramView, paramLong);
        }
      }
    };
    localObject1 = (FrameLayout)this.b;
    this.i = new org.vidogram.ui.Components.aw(paramContext);
    this.i.setVerticalScrollBarEnabled(false);
    Object localObject2 = this.i;
    LinearLayoutManager localLinearLayoutManager = new LinearLayoutManager(paramContext, 1, false);
    this.k = localLinearLayoutManager;
    ((org.vidogram.ui.Components.aw)localObject2).setLayoutManager(localLinearLayoutManager);
    this.i.setGlowColor(org.vidogram.ui.Components.b.f(5));
    ((FrameLayout)localObject1).addView(this.i, org.vidogram.ui.Components.v.b(-1, -1, 51));
    this.i.setAdapter(this.j);
    this.i.setOnItemClickListener(new org.vidogram.ui.Components.aw.b()
    {
      public void a(View paramView, int paramInt)
      {
        if (paramInt == aw.d(aw.this))
          if (aw.this.l() != null);
        label248: Object localObject4;
        label344: int j;
        label714: 
        do
        {
          while (true)
          {
            return;
            paramView = new AlertDialog.Builder(aw.this.l());
            paramView.setTitle(org.vidogram.messenger.r.a("TextSize", 2131231891));
            localObject1 = new ab(aw.this.l());
            ((ab)localObject1).setMinValue(12);
            ((ab)localObject1).setMaxValue(30);
            ((ab)localObject1).setValue(org.vidogram.messenger.v.a().B);
            paramView.setView((View)localObject1);
            paramView.setNegativeButton(org.vidogram.messenger.r.a("Done", 2131231147), new DialogInterface.OnClickListener((ab)localObject1, paramInt)
            {
              public void onClick(DialogInterface paramDialogInterface, int paramInt)
              {
                paramDialogInterface = ApplicationLoader.a.getSharedPreferences("mainconfig", 0).edit();
                paramDialogInterface.putInt("fons_size", this.a.getValue());
                org.vidogram.messenger.v.a().B = this.a.getValue();
                paramDialogInterface.commit();
                if (aw.e(aw.this) != null)
                  aw.e(aw.this).c(this.b);
              }
            });
            aw.this.b(paramView.create());
            return;
            boolean bool2;
            if (paramInt == aw.f(aw.this))
            {
              localObject1 = ApplicationLoader.a.getSharedPreferences("mainconfig", 0);
              bool2 = ((SharedPreferences)localObject1).getBoolean("view_animations", true);
              localObject1 = ((SharedPreferences)localObject1).edit();
              if (!bool2)
              {
                bool1 = true;
                ((SharedPreferences.Editor)localObject1).putBoolean("view_animations", bool1);
                ((SharedPreferences.Editor)localObject1).commit();
                if (!(paramView instanceof ba))
                  continue;
                paramView = (ba)paramView;
                if (bool2)
                  break label248;
              }
              for (bool1 = true; ; bool1 = false)
              {
                paramView.setChecked(bool1);
                aw.g(aw.this).b(false);
                return;
                bool1 = false;
                break;
              }
            }
            if (paramInt == aw.h(aw.this))
            {
              bool2 = new itman.robert.a().d(ApplicationLoader.a);
              localObject1 = new itman.robert.a();
              localObject2 = ApplicationLoader.a;
              if (!bool2)
              {
                bool1 = true;
                ((itman.robert.a)localObject1).c((Context)localObject2, bool1);
                if (!(paramView instanceof ba))
                  continue;
                paramView = (ba)paramView;
                if (bool2)
                  break label344;
              }
              for (bool1 = true; ; bool1 = false)
              {
                paramView.setChecked(bool1);
                return;
                bool1 = false;
                break;
              }
            }
            if (paramInt == aw.i(aw.this))
            {
              aw.this.a(new ah());
              return;
            }
            if (paramInt == aw.j(aw.this))
            {
              aw.this.a(new bb());
              return;
            }
            if (paramInt == aw.k(aw.this))
            {
              if (aw.this.l() == null)
                continue;
              paramView = new TextView(aw.this.l());
              paramView.setText(Html.fromHtml(org.vidogram.messenger.r.a("AskAQuestionInfo", 2131230890)));
              paramView.setTextSize(18.0F);
              paramView.setLinkTextColor(-14255946);
              paramView.setPadding(org.vidogram.messenger.a.a(8.0F), org.vidogram.messenger.a.a(5.0F), org.vidogram.messenger.a.a(8.0F), org.vidogram.messenger.a.a(6.0F));
              paramView.setMovementMethod(new aw.a(null));
              localObject1 = new AlertDialog.Builder(aw.this.l());
              ((AlertDialog.Builder)localObject1).setView(paramView);
              ((AlertDialog.Builder)localObject1).setPositiveButton(org.vidogram.messenger.r.a("AskButton", 2131230891), new DialogInterface.OnClickListener()
              {
                public void onClick(DialogInterface paramDialogInterface, int paramInt)
                {
                  aw.l(aw.this);
                }
              });
              ((AlertDialog.Builder)localObject1).setNegativeButton(org.vidogram.messenger.r.a("Cancel", 2131230943), null);
              aw.this.b(((AlertDialog.Builder)localObject1).create());
              return;
            }
            if (paramInt == aw.m(aw.this))
            {
              aw.n(aw.this);
              return;
            }
            if (paramInt == aw.o(aw.this))
            {
              n.c();
              return;
            }
            if (paramInt == aw.p(aw.this))
            {
              localObject1 = ApplicationLoader.a.getSharedPreferences("mainconfig", 0);
              bool2 = ((SharedPreferences)localObject1).getBoolean("send_by_enter", false);
              localObject1 = ((SharedPreferences)localObject1).edit();
              if (!bool2)
              {
                bool1 = true;
                ((SharedPreferences.Editor)localObject1).putBoolean("send_by_enter", bool1);
                ((SharedPreferences.Editor)localObject1).commit();
                if (!(paramView instanceof ba))
                  continue;
                paramView = (ba)paramView;
                if (bool2)
                  break label714;
              }
              for (bool1 = true; ; bool1 = false)
              {
                paramView.setChecked(bool1);
                return;
                bool1 = false;
                break;
              }
            }
            if (paramInt == aw.q(aw.this))
            {
              MediaController.a().w();
              if (!(paramView instanceof ba))
                continue;
              ((ba)paramView).setChecked(MediaController.a().C());
              return;
            }
            if (paramInt == aw.r(aw.this))
            {
              MediaController.a().v();
              if (!(paramView instanceof ba))
                continue;
              ((ba)paramView).setChecked(MediaController.a().B());
              return;
            }
            if (paramInt == aw.s(aw.this))
            {
              MediaController.a().u();
              if (!(paramView instanceof ba))
                continue;
              ((ba)paramView).setChecked(MediaController.a().A());
              return;
            }
            if (paramInt == aw.t(aw.this))
            {
              MediaController.a().x();
              if (!(paramView instanceof ba))
                continue;
              ((ba)paramView).setChecked(MediaController.a().D());
              return;
            }
            if (paramInt == aw.u(aw.this))
            {
              MediaController.a().y();
              if (!(paramView instanceof ba))
                continue;
              ((ba)paramView).setChecked(MediaController.a().E());
              return;
            }
            if (paramInt == aw.v(aw.this))
            {
              aw.this.a(new ao());
              return;
            }
            if (paramInt == aw.w(aw.this))
            {
              aw.this.a(new ac());
              return;
            }
            if (paramInt == aw.x(aw.this))
            {
              if (aw.this.l() == null)
                continue;
              paramView = new AlertDialog.Builder(aw.this.l());
              paramView.setMessage(org.vidogram.messenger.r.a("AreYouSure", 2131230870));
              paramView.setTitle(org.vidogram.messenger.r.a("AppName", 2131230856));
              paramView.setPositiveButton(org.vidogram.messenger.r.a("OK", 2131231604), new DialogInterface.OnClickListener()
              {
                public void onClick(DialogInterface paramDialogInterface, int paramInt)
                {
                  ConnectionsManager.a().f();
                }
              });
              paramView.setNegativeButton(org.vidogram.messenger.r.a("Cancel", 2131230943), null);
              aw.this.b(paramView.create());
              return;
            }
            if (paramInt == aw.y(aw.this))
            {
              org.vidogram.messenger.b.a.a(aw.this.l(), org.vidogram.messenger.r.a("TelegramFaqUrl", 2131231887));
              return;
            }
            if (paramInt == aw.z(aw.this))
            {
              org.vidogram.messenger.b.a.a(aw.this.l(), org.vidogram.messenger.r.a("PrivacyPolicyUrl", 2131231702));
              return;
            }
            if (paramInt == aw.A(aw.this))
              continue;
            if (paramInt == aw.B(aw.this))
            {
              if (aw.this.l() == null)
                continue;
              paramView = new AlertDialog.Builder(aw.this.l());
              paramView.setTitle(org.vidogram.messenger.r.a("SortBy", 2131231862));
              localObject1 = org.vidogram.messenger.r.a("Default", 2131231116);
              localObject2 = org.vidogram.messenger.r.a("SortFirstName", 2131231863);
              localObject3 = org.vidogram.messenger.r.a("SortLastName", 2131231864);
              localObject4 = new DialogInterface.OnClickListener(paramInt)
              {
                public void onClick(DialogInterface paramDialogInterface, int paramInt)
                {
                  paramDialogInterface = ApplicationLoader.a.getSharedPreferences("mainconfig", 0).edit();
                  paramDialogInterface.putInt("sortContactsBy", paramInt);
                  paramDialogInterface.commit();
                  if (aw.e(aw.this) != null)
                    aw.e(aw.this).c(this.a);
                }
              };
              paramView.setItems(new CharSequence[] { localObject1, localObject2, localObject3 }, (DialogInterface.OnClickListener)localObject4);
              paramView.setNegativeButton(org.vidogram.messenger.r.a("Cancel", 2131230943), null);
              aw.this.b(paramView.create());
              return;
            }
            if ((paramInt != aw.C(aw.this)) && (paramInt != aw.D(aw.this)) && (paramInt != aw.E(aw.this)))
              break;
            if (aw.this.l() == null)
              continue;
            localObject1 = new boolean[6];
            localObject2 = new h.d(aw.this.l());
            i = 0;
            if (paramInt == aw.D(aw.this))
            {
              i = MediaController.a().b;
              ((h.d)localObject2).a(false);
              ((h.d)localObject2).b(false);
              localObject3 = new LinearLayout(aw.this.l());
              ((LinearLayout)localObject3).setOrientation(1);
              j = 0;
              if (j >= 6)
                break label1801;
              paramView = null;
              if (j != 0)
                break label1593;
              if ((i & 0x1) == 0)
                break label1587;
              bool1 = true;
              localObject1[j] = bool1;
              paramView = org.vidogram.messenger.r.a("AttachPhoto", 2131230900);
            }
            do
            {
              localObject4 = new l(aw.this.l());
              ((l)localObject4).setTag(Integer.valueOf(j));
              ((l)localObject4).setBackgroundResource(2130837946);
              ((LinearLayout)localObject3).addView((View)localObject4, org.vidogram.ui.Components.v.b(-1, 48));
              ((l)localObject4).a(paramView, "", localObject1[j], true);
              ((l)localObject4).setOnClickListener(new View.OnClickListener(localObject1)
              {
                public void onClick(View paramView)
                {
                  paramView = (l)paramView;
                  int i = ((Integer)paramView.getTag()).intValue();
                  boolean[] arrayOfBoolean = this.a;
                  if (this.a[i] == 0);
                  for (int j = 1; ; j = 0)
                  {
                    arrayOfBoolean[i] = j;
                    paramView.a(this.a[i], true);
                    return;
                  }
                }
              });
              j += 1;
              break label1419;
              if (paramInt == aw.C(aw.this))
              {
                i = MediaController.a().c;
                break;
              }
              if (paramInt != aw.E(aw.this))
                break;
              i = MediaController.a().d;
              break;
              bool1 = false;
              break label1442;
              if (j == 1)
              {
                if ((i & 0x2) != 0);
                for (bool1 = true; ; bool1 = false)
                {
                  localObject1[j] = bool1;
                  paramView = org.vidogram.messenger.r.a("AttachAudio", 2131230892);
                  break;
                }
              }
              if (j == 2)
              {
                if ((i & 0x4) != 0);
                for (bool1 = true; ; bool1 = false)
                {
                  localObject1[j] = bool1;
                  paramView = org.vidogram.messenger.r.a("AttachVideo", 2131230902);
                  break;
                }
              }
              if (j == 3)
              {
                if ((i & 0x8) != 0);
                for (bool1 = true; ; bool1 = false)
                {
                  localObject1[j] = bool1;
                  paramView = org.vidogram.messenger.r.a("AttachDocument", 2131230895);
                  break;
                }
              }
              if (j != 4)
                continue;
              if ((i & 0x10) != 0);
              for (bool1 = true; ; bool1 = false)
              {
                localObject1[j] = bool1;
                paramView = org.vidogram.messenger.r.a("AttachMusic", 2131230899);
                break;
              }
            }
            while (j != 5);
            if ((i & 0x20) != 0);
            for (boolean bool1 = true; ; bool1 = false)
            {
              localObject1[j] = bool1;
              paramView = org.vidogram.messenger.r.a("AttachGif", 2131230897);
              break;
            }
            paramView = new h.a(aw.this.l(), 1);
            paramView.setBackgroundResource(2130837946);
            paramView.a(org.vidogram.messenger.r.a("Save", 2131231759).toUpperCase(), 0);
            paramView.setTextColor(-12940081);
            paramView.setOnClickListener(new View.OnClickListener(localObject1, paramInt)
            {
              public void onClick(View paramView)
              {
                int k;
                try
                {
                  if (aw.F(aw.this) != null)
                    aw.G(aw.this).dismiss();
                  j = 0;
                  for (k = 0; ; k = i)
                  {
                    if (j >= 6)
                      break label149;
                    i = k;
                    if (this.a[j] != 0)
                    {
                      if (j != 0)
                        break;
                      i = k | 0x1;
                    }
                    j += 1;
                  }
                }
                catch (Exception paramView)
                {
                  while (true)
                  {
                    int j;
                    n.a("tmessages", paramView);
                    continue;
                    if (j == 1)
                    {
                      i = k | 0x2;
                      continue;
                    }
                    if (j == 2)
                    {
                      i = k | 0x4;
                      continue;
                    }
                    if (j == 3)
                    {
                      i = k | 0x8;
                      continue;
                    }
                    if (j == 4)
                    {
                      i = k | 0x10;
                      continue;
                    }
                    int i = k;
                    if (j != 5)
                      continue;
                    i = k | 0x20;
                  }
                  label149: paramView = ApplicationLoader.a.getSharedPreferences("mainconfig", 0).edit();
                  if (this.b != aw.D(aw.this))
                    break label238;
                }
                paramView.putInt("mobileDataDownloadMask", k);
                MediaController.a().b = k;
                while (true)
                {
                  paramView.commit();
                  if (aw.e(aw.this) != null)
                    aw.e(aw.this).c(this.b);
                  return;
                  label238: if (this.b == aw.C(aw.this))
                  {
                    paramView.putInt("wifiDownloadMask", k);
                    MediaController.a().c = k;
                    continue;
                  }
                  if (this.b != aw.E(aw.this))
                    continue;
                  paramView.putInt("roamingDownloadMask", k);
                  MediaController.a().d = k;
                }
              }
            });
            ((LinearLayout)localObject3).addView(paramView, org.vidogram.ui.Components.v.b(-1, 48));
            ((h.d)localObject2).a((View)localObject3);
            aw.this.b(((h.d)localObject2).a());
            return;
          }
          if (paramInt == aw.H(aw.this))
          {
            aw.this.a(new k());
            return;
          }
          if (paramInt == aw.I(aw.this))
          {
            aw.this.a(new j());
            return;
          }
          if (paramInt == aw.J(aw.this))
          {
            aw.this.a(new ay(0));
            return;
          }
          if (paramInt != aw.K(aw.this))
            continue;
          aw.this.a(new e());
          return;
        }
        while ((paramInt != aw.L(aw.this)) || (aw.this.l() == null));
        label1419: label1442: label1587: label1593: Object localObject1 = new boolean[2];
        label1801: Object localObject2 = new h.d(aw.this.l());
        ((h.d)localObject2).a(false);
        ((h.d)localObject2).b(false);
        Object localObject3 = new LinearLayout(aw.this.l());
        ((LinearLayout)localObject3).setOrientation(1);
        int i = 0;
        if (Build.VERSION.SDK_INT >= 19)
        {
          j = 2;
          label2097: if (i >= j)
            break label2245;
          paramView = null;
          if (i != 0)
            break label2217;
          localObject1[i] = org.vidogram.messenger.v.a().z;
          paramView = org.vidogram.messenger.r.a("EmojiBigSize", 2131231158);
        }
        while (true)
        {
          localObject4 = new l(aw.this.l());
          ((l)localObject4).setTag(Integer.valueOf(i));
          ((l)localObject4).setBackgroundResource(2130837946);
          ((LinearLayout)localObject3).addView((View)localObject4, org.vidogram.ui.Components.v.b(-1, 48));
          ((l)localObject4).a(paramView, "", localObject1[i], true);
          ((l)localObject4).setOnClickListener(new View.OnClickListener(localObject1)
          {
            public void onClick(View paramView)
            {
              paramView = (l)paramView;
              int i = ((Integer)paramView.getTag()).intValue();
              boolean[] arrayOfBoolean = this.a;
              if (this.a[i] == 0);
              for (int j = 1; ; j = 0)
              {
                arrayOfBoolean[i] = j;
                paramView.a(this.a[i], true);
                return;
              }
            }
          });
          i += 1;
          break;
          j = 1;
          break label2097;
          label2217: if (i != 1)
            continue;
          localObject1[i] = org.vidogram.messenger.v.a().A;
          paramView = org.vidogram.messenger.r.a("EmojiUseDefault", 2131231159);
        }
        label2245: paramView = new h.a(aw.this.l(), 1);
        paramView.setBackgroundResource(2130837946);
        paramView.a(org.vidogram.messenger.r.a("Save", 2131231759).toUpperCase(), 0);
        paramView.setTextColor(-12940081);
        paramView.setOnClickListener(new View.OnClickListener(localObject1, paramInt)
        {
          public void onClick(View paramView)
          {
            try
            {
              if (aw.M(aw.this) != null)
                aw.N(aw.this).dismiss();
              paramView = ApplicationLoader.a.getSharedPreferences("mainconfig", 0).edit();
              org.vidogram.messenger.v localv = org.vidogram.messenger.v.a();
              int i = this.a[0];
              localv.z = i;
              paramView.putBoolean("allowBigEmoji", i);
              localv = org.vidogram.messenger.v.a();
              int j = this.a[1];
              localv.A = j;
              paramView.putBoolean("useSystemEmoji", j);
              paramView.commit();
              if (aw.e(aw.this) != null)
                aw.e(aw.this).c(this.b);
              return;
            }
            catch (Exception paramView)
            {
              while (true)
                n.a("tmessages", paramView);
            }
          }
        });
        ((LinearLayout)localObject3).addView(paramView, org.vidogram.ui.Components.v.b(-1, 48));
        ((h.d)localObject2).a((View)localObject3);
        aw.this.b(((h.d)localObject2).a());
      }
    });
    this.i.setOnItemLongClickListener(new aw.c()
    {
      private int b = 0;

      public boolean a(View paramView, int paramInt)
      {
        if (paramInt == aw.O(aw.this))
        {
          this.b += 1;
          if (this.b >= 2)
          {
            paramView = new AlertDialog.Builder(aw.this.l());
            paramView.setTitle("Debug Menu");
            1 local1 = new DialogInterface.OnClickListener()
            {
              public void onClick(DialogInterface paramDialogInterface, int paramInt)
              {
                if (paramInt == 0)
                  org.vidogram.messenger.f.a().h();
                do
                  return;
                while (paramInt != 1);
                org.vidogram.messenger.f.a().a(false, true);
              }
            };
            paramView.setItems(new CharSequence[] { "Import Contacts", "Reload Contacts" }, local1);
            paramView.setNegativeButton(org.vidogram.messenger.r.a("Cancel", 2131230943), null);
            aw.this.b(paramView.create());
            return true;
          }
          try
          {
            Toast.makeText(aw.this.l(), "¯\\_(ツ)_/¯", 0).show();
            return true;
          }
          catch (Exception paramView)
          {
            n.a("tmessages", paramView);
            return true;
          }
        }
        return false;
      }
    });
    ((FrameLayout)localObject1).addView(this.d);
    this.r = new View(paramContext);
    this.r.setPivotY(0.0F);
    this.r.setBackgroundColor(org.vidogram.ui.Components.b.f(5));
    ((FrameLayout)localObject1).addView(this.r, org.vidogram.ui.Components.v.a(-1, 88.0F));
    this.s = new View(paramContext);
    this.s.setBackgroundResource(2130837787);
    ((FrameLayout)localObject1).addView(this.s, org.vidogram.ui.Components.v.a(-1, 3.0F));
    this.l = new BackupImageView(paramContext);
    this.l.setRoundRadius(org.vidogram.messenger.a.a(21.0F));
    this.l.setPivotX(0.0F);
    this.l.setPivotY(0.0F);
    ((FrameLayout)localObject1).addView(this.l, org.vidogram.ui.Components.v.a(42, 42.0F, 51, 64.0F, 0.0F, 0.0F, 0.0F));
    this.l.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramView)
      {
        paramView = org.vidogram.messenger.v.a().a(Integer.valueOf(ad.c()));
        if ((paramView != null) && (paramView.j != null) && (paramView.j.f != null))
        {
          am.a().a(aw.this.l());
          am.a().a(paramView.j.f, aw.this);
        }
      }
    });
    this.m = new TextView(paramContext);
    this.m.setTextColor(-1);
    this.m.setTextSize(1, 18.0F);
    this.m.setLines(1);
    this.m.setMaxLines(1);
    this.m.setSingleLine(true);
    this.m.setEllipsize(TextUtils.TruncateAt.END);
    this.m.setGravity(3);
    this.m.setTypeface(org.vidogram.messenger.a.a("fonts/rmedium.ttf"));
    this.m.setPivotX(0.0F);
    this.m.setPivotY(0.0F);
    ((FrameLayout)localObject1).addView(this.m, org.vidogram.ui.Components.v.a(-2, -2.0F, 51, 118.0F, 0.0F, 48.0F, 0.0F));
    this.n = new TextView(paramContext);
    this.n.setTextColor(org.vidogram.ui.Components.b.e(5));
    this.n.setTextSize(1, 14.0F);
    this.n.setLines(1);
    this.n.setMaxLines(1);
    this.n.setSingleLine(true);
    this.n.setEllipsize(TextUtils.TruncateAt.END);
    this.n.setGravity(3);
    ((FrameLayout)localObject1).addView(this.n, org.vidogram.ui.Components.v.a(-2, -2.0F, 51, 118.0F, 0.0F, 48.0F, 0.0F));
    this.o = new ImageView(paramContext);
    this.o.setBackgroundResource(2130837779);
    this.o.setImageResource(2130837773);
    this.o.setScaleType(ImageView.ScaleType.CENTER);
    if (Build.VERSION.SDK_INT >= 21)
    {
      paramContext = new StateListAnimator();
      localObject2 = ObjectAnimator.ofFloat(this.o, "translationZ", new float[] { org.vidogram.messenger.a.a(2.0F), org.vidogram.messenger.a.a(4.0F) }).setDuration(200L);
      paramContext.addState(new int[] { 16842919 }, (Animator)localObject2);
      localObject2 = ObjectAnimator.ofFloat(this.o, "translationZ", new float[] { org.vidogram.messenger.a.a(4.0F), org.vidogram.messenger.a.a(2.0F) }).setDuration(200L);
      paramContext.addState(new int[0], (Animator)localObject2);
      this.o.setStateListAnimator(paramContext);
      this.o.setOutlineProvider(new ViewOutlineProvider()
      {
        @SuppressLint({"NewApi"})
        public void getOutline(View paramView, Outline paramOutline)
        {
          paramOutline.setOval(0, 0, org.vidogram.messenger.a.a(56.0F), org.vidogram.messenger.a.a(56.0F));
        }
      });
    }
    ((FrameLayout)localObject1).addView(this.o, org.vidogram.ui.Components.v.a(-2, -2.0F, 53, 0.0F, 0.0F, 16.0F, 0.0F));
    this.o.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramView)
      {
        if (aw.this.l() == null);
        AlertDialog.Builder localBuilder;
        do
        {
          return;
          localBuilder = new AlertDialog.Builder(aw.this.l());
          g.vw localvw = org.vidogram.messenger.v.a().a(Integer.valueOf(ad.c()));
          paramView = localvw;
          if (localvw != null)
            continue;
          paramView = ad.d();
        }
        while (paramView == null);
        if ((paramView.j != null) && (paramView.j.f != null) && (!(paramView.j instanceof g.us)))
        {
          paramView = new CharSequence[3];
          paramView[0] = org.vidogram.messenger.r.a("FromCamera", 2131231263);
          paramView[1] = org.vidogram.messenger.r.a("FromGalley", 2131231270);
          paramView[2] = org.vidogram.messenger.r.a("DeletePhoto", 2131231133);
        }
        while (true)
        {
          localBuilder.setItems(paramView, new DialogInterface.OnClickListener()
          {
            public void onClick(DialogInterface paramDialogInterface, int paramInt)
            {
              if (paramInt == 0)
                aw.P(aw.this).b();
              do
              {
                return;
                if (paramInt != 1)
                  continue;
                aw.P(aw.this).c();
                return;
              }
              while (paramInt != 2);
              org.vidogram.messenger.v.a().a(null);
            }
          });
          aw.this.b(localBuilder.create());
          return;
          paramView = new CharSequence[2];
          paramView[0] = org.vidogram.messenger.r.a("FromCamera", 2131231263);
          paramView[1] = org.vidogram.messenger.r.a("FromGalley", 2131231270);
        }
      }
    });
    r();
    this.i.setOnScrollListener(new RecyclerView.l()
    {
      public void a(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
      {
        paramInt1 = 0;
        paramInt2 = 0;
        if (aw.Q(aw.this).D() == 0);
        do
        {
          do
          {
            return;
            paramRecyclerView = paramRecyclerView.getChildAt(0);
          }
          while (paramRecyclerView == null);
          if (aw.Q(aw.this).m() != 0)
            continue;
          int i = org.vidogram.messenger.a.a(88.0F);
          paramInt1 = paramInt2;
          if (paramRecyclerView.getTop() < 0)
            paramInt1 = paramRecyclerView.getTop();
          paramInt1 += i;
        }
        while (aw.R(aw.this) == paramInt1);
        aw.a(aw.this, paramInt1);
        aw.S(aw.this);
      }
    });
    return (View)(View)this.b;
  }

  public am.e a(u paramu, g.x paramx, int paramInt)
  {
    paramInt = 0;
    if (paramx == null)
      return null;
    paramu = org.vidogram.messenger.v.a().a(Integer.valueOf(ad.c()));
    if ((paramu != null) && (paramu.j != null) && (paramu.j.f != null))
    {
      paramu = paramu.j.f;
      if ((paramu.d == paramx.d) && (paramu.c == paramx.c) && (paramu.b == paramx.b))
      {
        paramu = new int[2];
        this.l.getLocationInWindow(paramu);
        paramx = new am.e();
        paramx.b = paramu[0];
        int i1 = paramu[1];
        if (Build.VERSION.SDK_INT >= 21);
        while (true)
        {
          paramx.c = (i1 - paramInt);
          paramx.d = this.l;
          paramx.a = this.l.getImageReceiver();
          paramx.f = ad.c();
          paramx.e = paramx.a.h();
          paramx.g = -1;
          paramx.h = this.l.getImageReceiver().D();
          paramx.k = this.l.getScaleX();
          return paramx;
          paramInt = org.vidogram.messenger.a.a;
        }
      }
    }
    return null;
  }

  public void a(int paramInt1, int paramInt2, Intent paramIntent)
  {
    this.q.a(paramInt1, paramInt2, paramIntent);
  }

  public void a(int paramInt, Object[] paramArrayOfObject)
  {
    if (paramInt == y.b)
    {
      paramInt = ((Integer)paramArrayOfObject[0]).intValue();
      if (((paramInt & 0x2) != 0) || ((paramInt & 0x1) != 0))
        t();
    }
    do
      return;
    while ((paramInt != y.Q) || (this.j == null));
    this.j.c(this.R);
  }

  public void a(Configuration paramConfiguration)
  {
    super.a(paramConfiguration);
    s();
  }

  public void a(Bundle paramBundle)
  {
    if ((this.q != null) && (this.q.a != null))
      paramBundle.putString("path", this.q.a);
  }

  public void a_(int paramInt)
  {
  }

  public Bitmap b(u paramu, g.x paramx, int paramInt)
  {
    return null;
  }

  public void b(Bundle paramBundle)
  {
    if (this.q != null)
      this.q.a = paramBundle.getString("path");
  }

  public boolean b(int paramInt)
  {
    return false;
  }

  public void c(int paramInt)
  {
  }

  protected void c(Dialog paramDialog)
  {
    MediaController.a().d();
  }

  public void c(u paramu, g.x paramx, int paramInt)
  {
  }

  public void d(int paramInt)
  {
  }

  public boolean f()
  {
    super.f();
    this.q.d = this;
    this.q.e = new c.a()
    {
      public void a(g.ad paramad, g.az paramaz1, g.az paramaz2)
      {
        paramaz1 = new g.sa();
        paramaz1.c = paramad;
        ConnectionsManager.a().a(paramaz1, new org.vidogram.tgnet.c()
        {
        });
      }
    };
    y.a().a(this, y.b);
    y.a().a(this, y.Q);
    this.aj = 0;
    int i1 = this.aj;
    this.aj = (i1 + 1);
    this.u = i1;
    i1 = this.aj;
    this.aj = (i1 + 1);
    this.v = i1;
    i1 = this.aj;
    this.aj = (i1 + 1);
    this.w = i1;
    i1 = this.aj;
    this.aj = (i1 + 1);
    this.x = i1;
    i1 = this.aj;
    this.aj = (i1 + 1);
    this.y = i1;
    i1 = this.aj;
    this.aj = (i1 + 1);
    this.z = i1;
    i1 = this.aj;
    this.aj = (i1 + 1);
    this.A = i1;
    i1 = this.aj;
    this.aj = (i1 + 1);
    this.C = i1;
    i1 = this.aj;
    this.aj = (i1 + 1);
    this.F = i1;
    i1 = this.aj;
    this.aj = (i1 + 1);
    this.D = i1;
    i1 = this.aj;
    this.aj = (i1 + 1);
    this.E = i1;
    i1 = this.aj;
    this.aj = (i1 + 1);
    this.ak = i1;
    i1 = this.aj;
    this.aj = (i1 + 1);
    this.B = i1;
    i1 = this.aj;
    this.aj = (i1 + 1);
    this.G = i1;
    i1 = this.aj;
    this.aj = (i1 + 1);
    this.H = i1;
    i1 = this.aj;
    this.aj = (i1 + 1);
    this.I = i1;
    i1 = this.aj;
    this.aj = (i1 + 1);
    this.J = i1;
    i1 = this.aj;
    this.aj = (i1 + 1);
    this.K = i1;
    i1 = this.aj;
    this.aj = (i1 + 1);
    this.ai = i1;
    i1 = this.aj;
    this.aj = (i1 + 1);
    this.L = i1;
    i1 = this.aj;
    this.aj = (i1 + 1);
    this.M = i1;
    i1 = this.aj;
    this.aj = (i1 + 1);
    this.N = i1;
    i1 = this.aj;
    this.aj = (i1 + 1);
    this.O = i1;
    if (Build.VERSION.SDK_INT >= 23)
    {
      i1 = this.aj;
      this.aj = (i1 + 1);
      this.P = i1;
    }
    i1 = this.aj;
    this.aj = (i1 + 1);
    this.R = i1;
    i1 = this.aj;
    this.aj = (i1 + 1);
    this.Q = i1;
    i1 = this.aj;
    this.aj = (i1 + 1);
    this.T = i1;
    i1 = this.aj;
    this.aj = (i1 + 1);
    this.U = i1;
    i1 = this.aj;
    this.aj = (i1 + 1);
    this.V = i1;
    i1 = this.aj;
    this.aj = (i1 + 1);
    this.W = i1;
    i1 = this.aj;
    this.aj = (i1 + 1);
    this.X = i1;
    i1 = this.aj;
    this.aj = (i1 + 1);
    this.Y = i1;
    i1 = this.aj;
    this.aj = (i1 + 1);
    this.Z = i1;
    i1 = this.aj;
    this.aj = (i1 + 1);
    this.aa = i1;
    if (org.vidogram.messenger.d.a)
    {
      i1 = this.aj;
      this.aj = (i1 + 1);
      this.ab = i1;
      i1 = this.aj;
      this.aj = (i1 + 1);
      this.ac = i1;
      i1 = this.aj;
      this.aj = (i1 + 1);
      this.ad = i1;
    }
    i1 = this.aj;
    this.aj = (i1 + 1);
    this.ae = i1;
    org.vidogram.messenger.d.g.b();
    org.vidogram.messenger.v.a().a(ad.d(), this.e, true);
    return true;
  }

  public void g()
  {
    super.g();
    if (this.l != null)
      this.l.setImageDrawable(null);
    org.vidogram.messenger.v.a().g(ad.c());
    y.a().b(this, y.b);
    y.a().b(this, y.Q);
    this.q.a();
  }

  public void i()
  {
    super.i();
    if (this.j != null)
      this.j.c();
    t();
    s();
  }

  public boolean w()
  {
    return true;
  }

  public boolean x()
  {
    return false;
  }

  public void y()
  {
    this.l.getImageReceiver().a(true, true);
  }

  public boolean z()
  {
    return true;
  }

  private static class a extends LinkMovementMethod
  {
    public boolean onTouchEvent(TextView paramTextView, Spannable paramSpannable, MotionEvent paramMotionEvent)
    {
      try
      {
        boolean bool = super.onTouchEvent(paramTextView, paramSpannable, paramMotionEvent);
        return bool;
      }
      catch (Exception paramTextView)
      {
        n.a("tmessages", paramTextView);
      }
      return false;
    }
  }

  private class b extends RecyclerView.a
  {
    private Context b;

    public b(Context arg2)
    {
      Object localObject;
      this.b = localObject;
    }

    public int a()
    {
      return aw.X(aw.this);
    }

    public int a(int paramInt)
    {
      int j = 2;
      int i;
      if ((paramInt == aw.ae(aw.this)) || (paramInt == aw.Y(aw.this)))
        i = 0;
      do
      {
        do
        {
          do
          {
            do
            {
              do
              {
                do
                {
                  do
                  {
                    do
                    {
                      do
                      {
                        do
                        {
                          do
                          {
                            do
                            {
                              do
                              {
                                do
                                {
                                  do
                                  {
                                    do
                                    {
                                      do
                                      {
                                        return i;
                                        if ((paramInt == aw.af(aw.this)) || (paramInt == aw.ag(aw.this)) || (paramInt == aw.ah(aw.this)) || (paramInt == aw.ai(aw.this)) || (paramInt == aw.aj(aw.this)))
                                          return 1;
                                        if ((paramInt == aw.h(aw.this)) || (paramInt == aw.f(aw.this)) || (paramInt == aw.p(aw.this)) || (paramInt == aw.s(aw.this)) || (paramInt == aw.r(aw.this)) || (paramInt == aw.q(aw.this)) || (paramInt == aw.t(aw.this)) || (paramInt == aw.u(aw.this)))
                                          return 3;
                                        i = j;
                                      }
                                      while (paramInt == aw.i(aw.this));
                                      i = j;
                                    }
                                    while (paramInt == aw.j(aw.this));
                                    i = j;
                                  }
                                  while (paramInt == aw.k(aw.this));
                                  i = j;
                                }
                                while (paramInt == aw.m(aw.this));
                                i = j;
                              }
                              while (paramInt == aw.v(aw.this));
                              i = j;
                            }
                            while (paramInt == aw.o(aw.this));
                            i = j;
                          }
                          while (paramInt == aw.x(aw.this));
                          i = j;
                        }
                        while (paramInt == aw.y(aw.this));
                        i = j;
                      }
                      while (paramInt == aw.A(aw.this));
                      i = j;
                    }
                    while (paramInt == aw.d(aw.this));
                    i = j;
                  }
                  while (paramInt == aw.w(aw.this));
                  i = j;
                }
                while (paramInt == aw.B(aw.this));
                i = j;
              }
              while (paramInt == aw.J(aw.this));
              i = j;
            }
            while (paramInt == aw.K(aw.this));
            i = j;
          }
          while (paramInt == aw.z(aw.this));
          i = j;
        }
        while (paramInt == aw.L(aw.this));
        if (paramInt == aw.O(aw.this))
          return 5;
        if ((paramInt == aw.C(aw.this)) || (paramInt == aw.D(aw.this)) || (paramInt == aw.E(aw.this)) || (paramInt == aw.I(aw.this)) || (paramInt == aw.H(aw.this)))
          return 6;
        if ((paramInt == aw.Z(aw.this)) || (paramInt == aw.ab(aw.this)) || (paramInt == aw.aa(aw.this)) || (paramInt == aw.ad(aw.this)))
          break;
        i = j;
      }
      while (paramInt != aw.ac(aw.this));
      return 4;
    }

    public RecyclerView.u a(ViewGroup paramViewGroup, int paramInt)
    {
      paramViewGroup = null;
      3 local3;
      switch (paramInt)
      {
      default:
      case 0:
      case 1:
      case 2:
      case 3:
      case 4:
        while (true)
        {
          paramViewGroup.setLayoutParams(new RecyclerView.i(-1, -2));
          return new a(paramViewGroup);
          paramViewGroup = new org.vidogram.ui.c.r(this.b);
          continue;
          paramViewGroup = new ap(this.b);
          continue;
          paramViewGroup = new bg(this.b)
          {
            public boolean onTouchEvent(MotionEvent paramMotionEvent)
            {
              if ((Build.VERSION.SDK_INT >= 21) && (getBackground() != null) && ((paramMotionEvent.getAction() == 0) || (paramMotionEvent.getAction() == 2)))
                getBackground().setHotspot(paramMotionEvent.getX(), paramMotionEvent.getY());
              return super.onTouchEvent(paramMotionEvent);
            }
          };
          continue;
          paramViewGroup = new ba(this.b)
          {
            public boolean onTouchEvent(MotionEvent paramMotionEvent)
            {
              if ((Build.VERSION.SDK_INT >= 21) && (getBackground() != null) && ((paramMotionEvent.getAction() == 0) || (paramMotionEvent.getAction() == 2)))
                getBackground().setHotspot(paramMotionEvent.getX(), paramMotionEvent.getY());
              return super.onTouchEvent(paramMotionEvent);
            }
          };
          continue;
          paramViewGroup = new w(this.b);
        }
      case 5:
        local3 = new be(this.b)
        {
          public boolean onTouchEvent(MotionEvent paramMotionEvent)
          {
            if ((Build.VERSION.SDK_INT >= 21) && (getBackground() != null) && ((paramMotionEvent.getAction() == 0) || (paramMotionEvent.getAction() == 2)))
              getBackground().setHotspot(paramMotionEvent.getX(), paramMotionEvent.getY());
            return super.onTouchEvent(paramMotionEvent);
          }
        };
      case 6:
      }
      while (true)
      {
        try
        {
          PackageInfo localPackageInfo = ApplicationLoader.a.getPackageManager().getPackageInfo(ApplicationLoader.a.getPackageName(), 0);
          paramInt = localPackageInfo.versionCode / 10;
          switch (localPackageInfo.versionCode % 10)
          {
          case 0:
            ((be)local3).setText(String.format(Locale.US, "Vidogram for Android v%s (%d) %s", new Object[] { localPackageInfo.versionName, Integer.valueOf(paramInt), paramViewGroup }));
            paramViewGroup = local3;
          case 3:
          default:
          case 1:
          case 2:
          }
        }
        catch (Exception paramViewGroup)
        {
          n.a("tmessages", paramViewGroup);
          paramViewGroup = local3;
        }
        break;
        paramViewGroup = "arm";
        continue;
        paramViewGroup = "universal";
        continue;
        paramViewGroup = new bd(this.b)
        {
          public boolean onTouchEvent(MotionEvent paramMotionEvent)
          {
            if ((Build.VERSION.SDK_INT >= 21) && (getBackground() != null) && ((paramMotionEvent.getAction() == 0) || (paramMotionEvent.getAction() == 2)))
              getBackground().setHotspot(paramMotionEvent.getX(), paramMotionEvent.getY());
            return super.onTouchEvent(paramMotionEvent);
          }
        };
        break;
        paramViewGroup = "";
        continue;
        paramViewGroup = "arm-v7a";
        continue;
        paramViewGroup = "x86";
      }
    }

    public void a(RecyclerView.u paramu, int paramInt)
    {
      int j = 1;
      int i;
      switch (paramu.h())
      {
      case 1:
      case 5:
      default:
        i = 0;
      case 0:
      case 2:
      case 3:
      case 4:
      case 6:
      }
      label404: Object localObject2;
      String str;
      bd localbd;
      while (true)
      {
        if (i != 0)
        {
          if ((paramInt != aw.d(aw.this)) && (paramInt != aw.f(aw.this)) && (paramInt != aw.h(aw.this)) && (paramInt != aw.i(aw.this)) && (paramInt != aw.j(aw.this)) && (paramInt != aw.I(aw.this)) && (paramInt != aw.k(aw.this)) && (paramInt != aw.m(aw.this)) && (paramInt != aw.p(aw.this)) && (paramInt != aw.r(aw.this)) && (paramInt != aw.v(aw.this)) && (paramInt != aw.C(aw.this)) && (paramInt != aw.D(aw.this)) && (paramInt != aw.o(aw.this)) && (paramInt != aw.E(aw.this)) && (paramInt != aw.w(aw.this)) && (paramInt != aw.H(aw.this)) && (paramInt != aw.x(aw.this)) && (paramInt != aw.y(aw.this)) && (paramInt != aw.B(aw.this)) && (paramInt != aw.A(aw.this)) && (paramInt != aw.s(aw.this)) && (paramInt != aw.J(aw.this)) && (paramInt != aw.K(aw.this)) && (paramInt != aw.q(aw.this)) && (paramInt != aw.z(aw.this)) && (paramInt != aw.t(aw.this)) && (paramInt != aw.u(aw.this)) && (paramInt != aw.O(aw.this)) && (paramInt != aw.L(aw.this)))
            break label2482;
          if (paramu.a.getBackground() == null)
            paramu.a.setBackgroundResource(2130837946);
        }
        return;
        if (paramInt == aw.Y(aw.this))
          ((org.vidogram.ui.c.r)paramu.a).setHeight(org.vidogram.messenger.a.a(88.0F));
        while (true)
        {
          i = 0;
          break;
          ((org.vidogram.ui.c.r)paramu.a).setHeight(org.vidogram.messenger.a.a(16.0F));
        }
        localObject2 = (bg)paramu.a;
        if (paramInt == aw.d(aw.this))
        {
          localObject1 = ApplicationLoader.a.getSharedPreferences("mainconfig", 0);
          if (org.vidogram.messenger.a.c());
          for (i = 18; ; i = 16)
          {
            i = ((SharedPreferences)localObject1).getInt("fons_size", i);
            ((bg)localObject2).a(org.vidogram.messenger.r.a("TextSize", 2131231891), String.format("%d", new Object[] { Integer.valueOf(i) }), true);
            i = j;
            break;
          }
        }
        if (paramInt == aw.w(aw.this))
        {
          ((bg)localObject2).a(org.vidogram.messenger.r.a("Language", 2131231344), org.vidogram.messenger.r.d(), true);
          i = j;
          continue;
        }
        if (paramInt == aw.B(aw.this))
        {
          i = ApplicationLoader.a.getSharedPreferences("mainconfig", 0).getInt("sortContactsBy", 0);
          if (i == 0)
            localObject1 = org.vidogram.messenger.r.a("Default", 2131231116);
          while (true)
          {
            ((bg)localObject2).a(org.vidogram.messenger.r.a("SortBy", 2131231862), (String)localObject1, true);
            i = j;
            break;
            if (i == 1)
            {
              localObject1 = org.vidogram.messenger.r.a("FirstName", 2131231863);
              continue;
            }
            localObject1 = org.vidogram.messenger.r.a("LastName", 2131231864);
          }
        }
        if (paramInt == aw.i(aw.this))
        {
          ((bg)localObject2).a(org.vidogram.messenger.r.a("NotificationsAndSounds", 2131231591), true);
          i = j;
          continue;
        }
        if (paramInt == aw.j(aw.this))
        {
          ((bg)localObject2).a(org.vidogram.messenger.r.a("ChatBackground", 2131231046), true);
          i = j;
          continue;
        }
        if (paramInt == aw.m(aw.this))
        {
          ((bg)localObject2).a("Send Logs", true);
          i = j;
          continue;
        }
        if (paramInt == aw.o(aw.this))
        {
          ((bg)localObject2).a("Clear Logs", true);
          i = j;
          continue;
        }
        if (paramInt == aw.k(aw.this))
        {
          ((bg)localObject2).a(org.vidogram.messenger.r.a("AskAQuestion", 2131230889), true);
          i = j;
          continue;
        }
        if (paramInt == aw.v(aw.this))
        {
          ((bg)localObject2).a(org.vidogram.messenger.r.a("PrivacySettings", 2131231703), true);
          i = j;
          continue;
        }
        if (paramInt == aw.x(aw.this))
        {
          ((bg)localObject2).a("Switch Backend", true);
          i = j;
          continue;
        }
        if (paramInt == aw.y(aw.this))
        {
          ((bg)localObject2).a(org.vidogram.messenger.r.a("TelegramFAQ", 2131231886), true);
          i = j;
          continue;
        }
        if (paramInt == aw.A(aw.this))
        {
          ((bg)localObject2).a(org.vidogram.messenger.r.a("ImportContacts", 2131231305), true);
          i = j;
          continue;
        }
        if (paramInt == aw.J(aw.this))
        {
          i = org.vidogram.messenger.d.g.f().size();
          str = org.vidogram.messenger.r.a("Stickers", 2131231870);
          if (i != 0);
          for (localObject1 = String.format("%d", new Object[] { Integer.valueOf(i) }); ; localObject1 = "")
          {
            ((bg)localObject2).a(str, (String)localObject1, true);
            i = j;
            break;
          }
        }
        if (paramInt == aw.K(aw.this))
        {
          ((bg)localObject2).a(org.vidogram.messenger.r.a("CacheSettings", 2131230938), true);
          i = j;
          continue;
        }
        if (paramInt == aw.z(aw.this))
        {
          ((bg)localObject2).a(org.vidogram.messenger.r.a("PrivacyPolicy", 2131231701), true);
          i = j;
          continue;
        }
        i = j;
        if (paramInt != aw.L(aw.this))
          continue;
        ((bg)localObject2).a(org.vidogram.messenger.r.a("Emoji", 2131231157), true);
        i = j;
        continue;
        localObject1 = (ba)paramu.a;
        localObject2 = ApplicationLoader.a.getSharedPreferences("mainconfig", 0);
        if (paramInt == aw.f(aw.this))
        {
          ((ba)localObject1).a(org.vidogram.messenger.r.a("EnableAnimations", 2131231161), ((SharedPreferences)localObject2).getBoolean("view_animations", true), false);
          i = j;
          continue;
        }
        if (paramInt == aw.h(aw.this))
        {
          ((ba)localObject1).a(org.vidogram.messenger.r.a("PersionDate", 2131232388), new itman.robert.a().d(ApplicationLoader.l()), false);
          i = j;
          continue;
        }
        if (paramInt == aw.p(aw.this))
        {
          ((ba)localObject1).a(org.vidogram.messenger.r.a("SendByEnter", 2131231794), ((SharedPreferences)localObject2).getBoolean("send_by_enter", false), false);
          i = j;
          continue;
        }
        if (paramInt == aw.s(aw.this))
        {
          ((ba)localObject1).a(org.vidogram.messenger.r.a("SaveToGallerySettings", 2131231763), MediaController.a().A(), false);
          i = j;
          continue;
        }
        if (paramInt == aw.r(aw.this))
        {
          ((ba)localObject1).a(org.vidogram.messenger.r.a("AutoplayGifs", 2131230911), MediaController.a().B(), true);
          i = j;
          continue;
        }
        if (paramInt == aw.q(aw.this))
        {
          ((ba)localObject1).a(org.vidogram.messenger.r.a("RaiseToSpeak", 2131231705), MediaController.a().C(), true);
          i = j;
          continue;
        }
        if (paramInt == aw.t(aw.this))
        {
          ((ba)localObject1).a(org.vidogram.messenger.r.a("ChromeCustomTabs", 2131231063), org.vidogram.messenger.r.a("ChromeCustomTabsInfo", 2131231064), MediaController.a().D(), false, true);
          i = j;
          continue;
        }
        i = j;
        if (paramInt != aw.u(aw.this))
          continue;
        ((ba)localObject1).a(org.vidogram.messenger.r.a("DirectShare", 2131231142), org.vidogram.messenger.r.a("DirectShareInfo", 2131231143), MediaController.a().E(), false, true);
        i = j;
        continue;
        if (paramInt == aw.Z(aw.this))
        {
          ((w)paramu.a).setText(org.vidogram.messenger.r.a("SETTINGS", 2131231756));
          i = j;
          continue;
        }
        if (paramInt == aw.aa(aw.this))
        {
          ((w)paramu.a).setText(org.vidogram.messenger.r.a("Support", 2131231882));
          i = j;
          continue;
        }
        if (paramInt == aw.ab(aw.this))
        {
          ((w)paramu.a).setText(org.vidogram.messenger.r.a("MessagesSettings", 2131231439));
          i = j;
          continue;
        }
        if (paramInt == aw.ac(aw.this))
        {
          ((w)paramu.a).setText(org.vidogram.messenger.r.a("AutomaticMediaDownload", 2131230910));
          i = j;
          continue;
        }
        i = j;
        if (paramInt != aw.ad(aw.this))
          continue;
        ((w)paramu.a).setText(org.vidogram.messenger.r.a("Info", 2131231312));
        i = j;
        continue;
        localbd = (bd)paramu.a;
        if ((paramInt == aw.D(aw.this)) || (paramInt == aw.C(aw.this)) || (paramInt == aw.E(aw.this)))
        {
          ApplicationLoader.a.getSharedPreferences("mainconfig", 0);
          if (paramInt == aw.D(aw.this))
          {
            str = org.vidogram.messenger.r.a("WhenUsingMobileData", 2131231957);
            i = MediaController.a().b;
            label1765: localObject2 = "";
            if ((i & 0x1) != 0)
              localObject2 = "" + org.vidogram.messenger.r.a("AttachPhoto", 2131230900);
            localObject1 = localObject2;
            if ((i & 0x2) != 0)
            {
              localObject1 = localObject2;
              if (((String)localObject2).length() != 0)
                localObject1 = (String)localObject2 + ", ";
              localObject1 = (String)localObject1 + org.vidogram.messenger.r.a("AttachAudio", 2131230892);
            }
            localObject2 = localObject1;
            if ((i & 0x4) != 0)
            {
              localObject2 = localObject1;
              if (((String)localObject1).length() != 0)
                localObject2 = (String)localObject1 + ", ";
              localObject2 = (String)localObject2 + org.vidogram.messenger.r.a("AttachVideo", 2131230902);
            }
            localObject1 = localObject2;
            if ((i & 0x8) != 0)
            {
              localObject1 = localObject2;
              if (((String)localObject2).length() != 0)
                localObject1 = (String)localObject2 + ", ";
              localObject1 = (String)localObject1 + org.vidogram.messenger.r.a("AttachDocument", 2131230895);
            }
            localObject2 = localObject1;
            if ((i & 0x10) != 0)
            {
              localObject2 = localObject1;
              if (((String)localObject1).length() != 0)
                localObject2 = (String)localObject1 + ", ";
              localObject2 = (String)localObject2 + org.vidogram.messenger.r.a("AttachMusic", 2131230899);
            }
            localObject1 = localObject2;
            if ((i & 0x20) == 0)
              break;
            if (((String)localObject2).length() == 0)
              break label2501;
          }
        }
      }
      label2482: label2501: for (Object localObject1 = (String)localObject2 + ", "; ; localObject1 = localObject2)
      {
        localObject1 = (String)localObject1 + org.vidogram.messenger.r.a("AttachGif", 2131230897);
        localObject2 = localObject1;
        if (((String)localObject1).length() == 0)
          localObject2 = org.vidogram.messenger.r.a("NoMediaAutoDownload", 2131231498);
        localbd.a(str, (String)localObject2, true);
        i = j;
        break;
        if (paramInt == aw.C(aw.this))
        {
          str = org.vidogram.messenger.r.a("WhenConnectedOnWiFi", 2131231955);
          i = MediaController.a().c;
          break label1765;
        }
        str = org.vidogram.messenger.r.a("WhenRoaming", 2131231956);
        i = MediaController.a().d;
        break label1765;
        if (paramInt == aw.I(aw.this))
        {
          localObject1 = ad.d();
          if ((localObject1 != null) && (((g.vw)localObject1).i != null) && (((g.vw)localObject1).i.length() != 0));
          for (localObject1 = org.vidogram.a.b.a().e("+" + ((g.vw)localObject1).i); ; localObject1 = org.vidogram.messenger.r.a("NumberUnknown", 2131231603))
          {
            localbd.a((String)localObject1, org.vidogram.messenger.r.a("Phone", 2131231663), true);
            i = j;
            break;
          }
        }
        i = j;
        if (paramInt != aw.H(aw.this))
          break;
        localObject1 = ad.d();
        if ((localObject1 != null) && (((g.vw)localObject1).g != null) && (((g.vw)localObject1).g.length() != 0));
        for (localObject1 = "@" + ((g.vw)localObject1).g; ; localObject1 = org.vidogram.messenger.r.a("UsernameEmpty", 2131231928))
        {
          localbd.a((String)localObject1, org.vidogram.messenger.r.a("Username", 2131231925), false);
          i = j;
          break;
        }
        if (paramu.a.getBackground() == null)
          break label404;
        paramu.a.setBackgroundDrawable(null);
        return;
      }
    }

    private class a extends RecyclerView.u
    {
      public a(View arg2)
      {
        super();
      }
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.aw
 * JD-Core Version:    0.6.0
 */