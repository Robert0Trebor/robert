package org.vidogram.ui;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.text.Editable;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.TextUtils.TruncateAt;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;
import org.vidogram.messenger.ApplicationLoader;
import org.vidogram.messenger.d;
import org.vidogram.messenger.n;
import org.vidogram.messenger.r;
import org.vidogram.messenger.y;
import org.vidogram.messenger.y.b;
import org.vidogram.tgnet.ConnectionsManager;
import org.vidogram.tgnet.f;
import org.vidogram.tgnet.g.bh;
import org.vidogram.tgnet.g.by;
import org.vidogram.tgnet.g.cn;
import org.vidogram.tgnet.g.cs;
import org.vidogram.ui.Components.bi;
import org.vidogram.ui.Components.t;
import org.vidogram.ui.Components.v;
import org.vidogram.ui.a.a.a;
import org.vidogram.ui.a.g;

public class i extends g
{
  private int i = 0;
  private bi[] j = new bi[5];
  private ProgressDialog k;
  private Dialog l;
  private ArrayList<String> m = new ArrayList();
  private boolean n = true;
  private View o;

  public View a(Context paramContext)
  {
    this.d.setTitle(r.a("AppName", 2131230856));
    this.d.setBackButtonImage(2130837794);
    this.d.setActionBarMenuOnItemClick(new a.a()
    {
      public void a(int paramInt)
      {
        if (paramInt == 1)
          i.a(i.this)[i.b(i.this)].a();
        do
          return;
        while (paramInt != -1);
        i.this.d();
      }
    });
    this.o = this.d.a().b(1, 2130837825, org.vidogram.messenger.a.a(56.0F));
    this.b = new ScrollView(paramContext);
    ScrollView localScrollView = (ScrollView)this.b;
    localScrollView.setFillViewport(true);
    FrameLayout localFrameLayout = new FrameLayout(paramContext);
    localScrollView.addView(localFrameLayout, v.a(-1, -2, 51));
    this.j[0] = new b(paramContext);
    this.j[1] = new a(paramContext, 1);
    this.j[2] = new a(paramContext, 2);
    this.j[3] = new a(paramContext, 3);
    this.j[4] = new a(paramContext, 4);
    int i1 = 0;
    if (i1 < this.j.length)
    {
      paramContext = this.j[i1];
      int i2;
      label220: float f1;
      label242: float f2;
      label251: float f3;
      if (i1 == 0)
      {
        i2 = 0;
        paramContext.setVisibility(i2);
        paramContext = this.j[i1];
        if (i1 != 0)
          break label296;
        f1 = -2.0F;
        if (!org.vidogram.messenger.a.c())
          break label302;
        f2 = 26.0F;
        if (!org.vidogram.messenger.a.c())
          break label308;
        f3 = 26.0F;
      }
      while (true)
      {
        localFrameLayout.addView(paramContext, v.a(-1, f1, 51, f2, 30.0F, f3, 0.0F));
        i1 += 1;
        break;
        i2 = 8;
        break label220;
        label296: f1 = -1.0F;
        break label242;
        label302: f2 = 18.0F;
        break label251;
        label308: f3 = 18.0F;
      }
    }
    this.d.setTitle(this.j[0].getHeaderName());
    return this.b;
  }

  public void a(int paramInt, boolean paramBoolean1, Bundle paramBundle, boolean paramBoolean2)
  {
    bi localbi1;
    bi localbi2;
    float f;
    if (paramInt == 3)
    {
      this.o.setVisibility(8);
      localbi1 = this.j[this.i];
      localbi2 = this.j[paramInt];
      this.i = paramInt;
      localbi2.setParams(paramBundle);
      this.d.setTitle(localbi2.getHeaderName());
      localbi2.c();
      if (!paramBoolean2)
        break label208;
      f = -org.vidogram.messenger.a.c.x;
      label76: localbi2.setX(f);
      paramBundle = new AnimatorSet();
      paramBundle.setInterpolator(new AccelerateDecelerateInterpolator());
      paramBundle.setDuration(300L);
      if (!paramBoolean2)
        break label220;
      f = org.vidogram.messenger.a.c.x;
    }
    while (true)
    {
      paramBundle.playTogether(new Animator[] { ObjectAnimator.ofFloat(localbi1, "translationX", new float[] { f }), ObjectAnimator.ofFloat(localbi2, "translationX", new float[] { 0.0F }) });
      paramBundle.addListener(new org.vidogram.messenger.b(localbi2, localbi1)
      {
        public void onAnimationEnd(Animator paramAnimator)
        {
          this.b.setVisibility(8);
          this.b.setX(0.0F);
        }

        public void onAnimationStart(Animator paramAnimator)
        {
          this.a.setVisibility(0);
        }
      });
      paramBundle.start();
      return;
      if (paramInt == 0)
        this.n = true;
      this.o.setVisibility(0);
      break;
      label208: f = org.vidogram.messenger.a.c.x;
      break label76;
      label220: f = -org.vidogram.messenger.a.c.x;
    }
  }

  public void a(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    if (paramInt == 6)
    {
      this.n = false;
      if (this.i == 0)
        this.j[this.i].a();
    }
  }

  public void a(String paramString)
  {
    if ((paramString == null) || (l() == null))
      return;
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(l());
    localBuilder.setTitle(r.a("AppName", 2131230856));
    localBuilder.setMessage(paramString);
    localBuilder.setPositiveButton(r.a("OK", 2131231604), null);
    b(localBuilder.create());
  }

  public void b(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (paramBoolean1)
      this.j[this.i].c();
  }

  protected void c(Dialog paramDialog)
  {
    if ((Build.VERSION.SDK_INT >= 23) && (paramDialog == this.l) && (!this.m.isEmpty()))
      l().requestPermissions((String[])this.m.toArray(new String[this.m.size()]), 6);
  }

  public void g()
  {
    super.g();
    int i1 = 0;
    while (i1 < this.j.length)
    {
      if (this.j[i1] != null)
        this.j[i1].b();
      i1 += 1;
    }
    if (this.k != null);
    try
    {
      this.k.dismiss();
      this.k = null;
      org.vidogram.messenger.a.b(l(), this.e);
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
    org.vidogram.messenger.a.a(l(), this.e);
  }

  public boolean k()
  {
    int i1 = 0;
    if (this.i == 0)
    {
      while (i1 < this.j.length)
      {
        if (this.j[i1] != null)
          this.j[i1].b();
        i1 += 1;
      }
      return true;
    }
    this.j[this.i].d();
    a(0, true, null, true);
    return false;
  }

  public void q()
  {
    if ((l() == null) || (l().isFinishing()) || (this.k != null))
      return;
    this.k = new ProgressDialog(l());
    this.k.setMessage(r.a("Loading", 2131231394));
    this.k.setCanceledOnTouchOutside(false);
    this.k.setCancelable(false);
    this.k.show();
  }

  public class a extends bi
    implements y.b
  {
    private int A;
    private int B;
    private String b;
    private String c;
    private String d;
    private String e;
    private EditText f;
    private TextView g;
    private TextView h;
    private TextView i;
    private Bundle j;
    private a k;
    private Timer l;
    private Timer m;
    private int n;
    private final Object o = new Object();
    private volatile int p = 60000;
    private volatile int q = 15000;
    private double r;
    private double s;
    private boolean t;
    private boolean u;
    private boolean v;
    private String w = "";
    private int x;
    private int y;
    private String z = "*";

    public a(Context paramInt, int arg3)
    {
      super();
      this.x = i1;
      setOrientation(1);
      this.g = new TextView(paramInt);
      this.g.setTextColor(-9079435);
      this.g.setTextSize(1, 14.0F);
      Object localObject1 = this.g;
      Object localObject2;
      if (r.a)
      {
        i1 = 5;
        ((TextView)localObject1).setGravity(i1);
        this.g.setLineSpacing(org.vidogram.messenger.a.a(2.0F), 1.0F);
        if (this.x != 3)
          break label938;
        localObject1 = new FrameLayout(paramInt);
        localObject2 = new ImageView(paramInt);
        ((ImageView)localObject2).setImageResource(2130838029);
        if (!r.a)
          break label872;
        ((FrameLayout)localObject1).addView((View)localObject2, v.a(64, 76.0F, 19, 2.0F, 2.0F, 0.0F, 0.0F));
        localObject2 = this.g;
        if (!r.a)
          break label867;
        i1 = 5;
        label195: ((FrameLayout)localObject1).addView((View)localObject2, v.a(-1, -2.0F, i1, 82.0F, 0.0F, 0.0F, 0.0F));
        if (!r.a)
          break label933;
        i1 = 5;
        label222: addView((View)localObject1, v.d(-2, -2, i1));
        this.f = new EditText(paramInt);
        this.f.setTextColor(-14606047);
        this.f.setHint(r.a("Code", 2131231073));
        org.vidogram.messenger.a.a(this.f);
        this.f.setHintTextColor(-6842473);
        this.f.setImeOptions(268435461);
        this.f.setTextSize(1, 18.0F);
        this.f.setInputType(3);
        this.f.setMaxLines(1);
        this.f.setPadding(0, 0, 0, 0);
        addView(this.f, v.b(-1, 36, 1, 0, 20, 0, 0));
        this.f.addTextChangedListener(new TextWatcher(i.this)
        {
          public void afterTextChanged(Editable paramEditable)
          {
            if (i.a.a(i.a.this));
            do
              return;
            while ((i.a.b(i.a.this) == 0) || (i.a.c(i.a.this).length() != i.a.b(i.a.this)));
            i.a.this.a();
          }

          public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
          {
          }

          public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
          {
          }
        });
        this.f.setOnEditorActionListener(new TextView.OnEditorActionListener(i.this)
        {
          public boolean onEditorAction(TextView paramTextView, int paramInt, KeyEvent paramKeyEvent)
          {
            if (paramInt == 5)
            {
              i.a.this.a();
              return true;
            }
            return false;
          }
        });
        if (this.x == 3)
        {
          this.f.setEnabled(false);
          this.f.setInputType(0);
          this.f.setVisibility(8);
        }
        this.h = new TextView(paramInt);
        this.h.setTextSize(1, 14.0F);
        this.h.setTextColor(-9079435);
        this.h.setLineSpacing(org.vidogram.messenger.a.a(2.0F), 1.0F);
        localObject1 = this.h;
        if (!r.a)
          break label974;
        i1 = 5;
        label476: ((TextView)localObject1).setGravity(i1);
        localObject1 = this.h;
        if (!r.a)
          break label979;
        i1 = 5;
        label496: addView((View)localObject1, v.b(-2, -2, i1, 0, 30, 0, 0));
        if (this.x == 3)
        {
          this.k = new a(paramInt);
          addView(this.k, v.a(-1, 3, 0.0F, 12.0F, 0.0F, 0.0F));
        }
        this.i = new TextView(paramInt);
        this.i.setText(r.a("DidNotGetTheCode", 2131231141));
        localObject1 = this.i;
        if (!r.a)
          break label984;
        i1 = 5;
        label594: ((TextView)localObject1).setGravity(i1);
        this.i.setTextSize(1, 14.0F);
        this.i.setTextColor(-11697229);
        this.i.setLineSpacing(org.vidogram.messenger.a.a(2.0F), 1.0F);
        this.i.setPadding(0, org.vidogram.messenger.a.a(2.0F), 0, org.vidogram.messenger.a.a(12.0F));
        localObject1 = this.i;
        if (!r.a)
          break label989;
        i1 = 5;
        label664: addView((View)localObject1, v.b(-2, -2, i1, 0, 20, 0, 0));
        this.i.setOnClickListener(new View.OnClickListener(i.this)
        {
          public void onClick(View paramView)
          {
            if (i.a.d(i.a.this))
              return;
            if ((i.a.e(i.a.this) != 0) && (i.a.e(i.a.this) != 4))
            {
              i.a.f(i.a.this);
              return;
            }
            try
            {
              paramView = ApplicationLoader.a.getPackageManager().getPackageInfo(ApplicationLoader.a.getPackageName(), 0);
              paramView = String.format(Locale.US, "%s (%d)", new Object[] { paramView.versionName, Integer.valueOf(paramView.versionCode) });
              Intent localIntent = new Intent("android.intent.action.SEND");
              localIntent.setType("message/rfc822");
              localIntent.putExtra("android.intent.extra.EMAIL", new String[] { "sms@stel.com" });
              localIntent.putExtra("android.intent.extra.SUBJECT", "Android registration/login issue " + paramView + " " + i.a.g(i.a.this));
              localIntent.putExtra("android.intent.extra.TEXT", "Phone: " + i.a.h(i.a.this) + "\nApp version: " + paramView + "\nOS version: SDK " + Build.VERSION.SDK_INT + "\nDevice Name: " + Build.MANUFACTURER + Build.MODEL + "\nLocale: " + Locale.getDefault() + "\nError: " + i.a.i(i.a.this));
              i.a.this.getContext().startActivity(Intent.createChooser(localIntent, "Send email..."));
              return;
            }
            catch (Exception paramView)
            {
              i.this.a(r.a("NoMailInstalled", 2131231495));
            }
          }
        });
        localObject1 = new LinearLayout(paramInt);
        if (!r.a)
          break label994;
        i1 = 5;
        label717: ((LinearLayout)localObject1).setGravity(i1 | 0x10);
        if (!r.a)
          break label999;
        i1 = 5;
        label734: addView((View)localObject1, v.d(-1, -1, i1));
        paramInt = new TextView(paramInt);
        if (!r.a)
          break label1004;
        i1 = 5;
        label763: paramInt.setGravity(i1 | 0x1);
        paramInt.setTextColor(-11697229);
        paramInt.setTextSize(1, 14.0F);
        paramInt.setLineSpacing(org.vidogram.messenger.a.a(2.0F), 1.0F);
        paramInt.setPadding(0, org.vidogram.messenger.a.a(24.0F), 0, 0);
        if (!r.a)
          break label1009;
      }
      label867: label872: label1004: label1009: for (int i1 = 5; ; i1 = 3)
      {
        ((LinearLayout)localObject1).addView(paramInt, v.b(-2, -2, i1 | 0x50, 0, 0, 0, 10));
        paramInt.setText(r.a("WrongNumber", 2131231967));
        paramInt.setOnClickListener(new View.OnClickListener(i.this)
        {
          public void onClick(View paramView)
          {
            paramView = new g.cn();
            paramView.c = i.a.h(i.a.this);
            paramView.d = i.a.j(i.a.this);
            ConnectionsManager.a().a(paramView, new org.vidogram.tgnet.c()
            {
            }
            , 2);
            i.a.this.d();
            i.this.a(0, true, null, true);
          }
        });
        return;
        i1 = 3;
        break;
        i1 = 3;
        break label195;
        TextView localTextView = this.g;
        if (r.a);
        for (i1 = 5; ; i1 = 3)
        {
          ((FrameLayout)localObject1).addView(localTextView, v.a(-1, -2.0F, i1, 0.0F, 0.0F, 82.0F, 0.0F));
          ((FrameLayout)localObject1).addView((View)localObject2, v.a(64, 76.0F, 21, 0.0F, 2.0F, 0.0F, 2.0F));
          break;
        }
        i1 = 3;
        break label222;
        localObject1 = this.g;
        if (r.a);
        for (i1 = 5; ; i1 = 3)
        {
          addView((View)localObject1, v.d(-2, -2, i1));
          break;
        }
        i1 = 3;
        break label476;
        i1 = 3;
        break label496;
        i1 = 3;
        break label594;
        i1 = 3;
        break label664;
        i1 = 3;
        break label717;
        i1 = 3;
        break label734;
        i1 = 3;
        break label763;
      }
    }

    private void f()
    {
      Bundle localBundle = new Bundle();
      localBundle.putString("phone", this.b);
      localBundle.putString("ephone", this.e);
      localBundle.putString("phoneFormated", this.d);
      this.v = true;
      i.this.q();
      g.cs localcs = new g.cs();
      localcs.c = this.d;
      localcs.d = this.c;
      ConnectionsManager.a().a(localcs, new org.vidogram.tgnet.c(localBundle)
      {
      }
      , 2);
    }

    private void g()
    {
      if (this.m != null)
        return;
      this.q = 15000;
      this.m = new Timer();
      this.s = System.currentTimeMillis();
      this.m.schedule(new TimerTask()
      {
        public void run()
        {
          double d1 = System.currentTimeMillis();
          double d2 = i.a.k(i.a.this);
          i.a.a(i.a.this, (int)(i.a.l(i.a.this) - (d1 - d2)));
          i.a.a(i.a.this, d1);
          org.vidogram.messenger.a.a(new Runnable()
          {
            public void run()
            {
              if (i.a.l(i.a.this) <= 1000)
              {
                i.a.m(i.a.this).setVisibility(0);
                i.a.n(i.a.this);
              }
            }
          });
        }
      }
      , 0L, 1000L);
    }

    private void h()
    {
      try
      {
        synchronized (this.o)
        {
          if (this.m != null)
          {
            this.m.cancel();
            this.m = null;
          }
          return;
        }
      }
      catch (Exception localException)
      {
        n.a("tmessages", localException);
      }
    }

    private void i()
    {
      if (this.l != null)
        return;
      this.l = new Timer();
      this.l.schedule(new TimerTask()
      {
        public void run()
        {
          if (i.a.o(i.a.this) == null)
            return;
          double d1 = System.currentTimeMillis();
          double d2 = i.a.p(i.a.this);
          i.a.b(i.a.this, (int)(i.a.q(i.a.this) - (d1 - d2)));
          i.a.b(i.a.this, d1);
          org.vidogram.messenger.a.a(new Runnable()
          {
            public void run()
            {
              int i;
              int j;
              if (i.a.q(i.a.this) >= 1000)
              {
                i = i.a.q(i.a.this) / 1000 / 60;
                j = i.a.q(i.a.this) / 1000 - i * 60;
                if ((i.a.e(i.a.this) == 4) || (i.a.e(i.a.this) == 3))
                  i.a.r(i.a.this).setText(r.a("CallText", 2131230941, new Object[] { Integer.valueOf(i), Integer.valueOf(j) }));
              }
              do
              {
                do
                {
                  while (true)
                  {
                    if (i.a.s(i.a.this) != null)
                      i.a.s(i.a.this).a(1.0F - i.a.q(i.a.this) / i.a.t(i.a.this));
                    return;
                    if (i.a.e(i.a.this) != 2)
                      continue;
                    i.a.r(i.a.this).setText(r.a("SmsText", 2131231860, new Object[] { Integer.valueOf(i), Integer.valueOf(j) }));
                  }
                  if (i.a.s(i.a.this) != null)
                    i.a.s(i.a.this).a(1.0F);
                  i.a.u(i.a.this);
                  if (i.a.v(i.a.this) != 3)
                    continue;
                  org.vidogram.messenger.a.b(false);
                  y.a().b(this, y.as);
                  i.a.a(i.a.this, false);
                  i.a.n(i.a.this);
                  i.a.f(i.a.this);
                  return;
                }
                while (i.a.v(i.a.this) != 2);
                if (i.a.e(i.a.this) != 4)
                  continue;
                i.a.r(i.a.this).setText(r.a("Calling", 2131230942));
                i.a.w(i.a.this);
                g.cs localcs = new g.cs();
                localcs.c = i.a.h(i.a.this);
                localcs.d = i.a.j(i.a.this);
                ConnectionsManager.a().a(localcs, new org.vidogram.tgnet.c()
                {
                }
                , 2);
                return;
              }
              while (i.a.e(i.a.this) != 3);
              org.vidogram.messenger.a.a(false);
              y.a().b(this, y.ar);
              i.a.a(i.a.this, false);
              i.a.n(i.a.this);
              i.a.f(i.a.this);
            }
          });
        }
      }
      , 0L, 1000L);
    }

    private void j()
    {
      try
      {
        synchronized (this.o)
        {
          if (this.l != null)
          {
            this.l.cancel();
            this.l = null;
          }
          return;
        }
      }
      catch (Exception localException)
      {
        n.a("tmessages", localException);
      }
    }

    public void a()
    {
      if (this.v)
        return;
      this.v = true;
      if (this.x == 2)
      {
        org.vidogram.messenger.a.a(false);
        y.a().b(this, y.ar);
      }
      while (true)
      {
        this.u = false;
        g.bh localbh = new g.bh();
        localbh.c = this.d;
        localbh.e = this.f.getText().toString();
        localbh.d = this.c;
        j();
        i.this.q();
        ConnectionsManager.a().a(localbh, new org.vidogram.tgnet.c()
        {
        }
        , 2);
        return;
        if (this.x != 3)
          continue;
        org.vidogram.messenger.a.b(false);
        y.a().b(this, y.as);
      }
    }

    public void a(int paramInt, Object[] paramArrayOfObject)
    {
      if ((!this.u) || (this.f == null));
      do
      {
        do
        {
          return;
          if (paramInt != y.ar)
            continue;
          this.t = true;
          this.f.setText("" + paramArrayOfObject[0]);
          this.t = false;
          a();
          return;
        }
        while (paramInt != y.as);
        paramArrayOfObject = "" + paramArrayOfObject[0];
      }
      while ((!this.z.equals("*")) && (!paramArrayOfObject.contains(this.z.replace("*", ""))));
      this.t = true;
      this.f.setText(paramArrayOfObject);
      this.t = false;
      a();
    }

    public void b()
    {
      super.b();
      if (this.x == 2)
      {
        org.vidogram.messenger.a.a(false);
        y.a().b(this, y.ar);
      }
      while (true)
      {
        this.u = false;
        j();
        h();
        return;
        if (this.x != 3)
          continue;
        org.vidogram.messenger.a.b(false);
        y.a().b(this, y.as);
      }
    }

    public void c()
    {
      super.c();
      if (this.f != null)
      {
        this.f.requestFocus();
        this.f.setSelection(this.f.length());
      }
    }

    public void d()
    {
      j();
      h();
      this.j = null;
      if (this.x == 2)
      {
        org.vidogram.messenger.a.a(false);
        y.a().b(this, y.ar);
      }
      while (true)
      {
        this.u = false;
        return;
        if (this.x != 3)
          continue;
        org.vidogram.messenger.a.b(false);
        y.a().b(this, y.as);
      }
    }

    public String getHeaderName()
    {
      return r.a("YourCode", 2131231980);
    }

    public void setParams(Bundle paramBundle)
    {
      int i2 = 0;
      if (paramBundle == null);
      int i1;
      label189: label210: String str;
      while (true)
      {
        return;
        this.f.setText("");
        this.u = true;
        if (this.x != 2)
          break;
        org.vidogram.messenger.a.a(true);
        y.a().a(this, y.ar);
        this.j = paramBundle;
        this.b = paramBundle.getString("phone");
        this.e = paramBundle.getString("ephone");
        this.d = paramBundle.getString("phoneFormated");
        this.c = paramBundle.getString("phoneHash");
        i1 = paramBundle.getInt("timeout");
        this.p = i1;
        this.B = i1;
        this.n = (int)(System.currentTimeMillis() / 1000L);
        this.y = paramBundle.getInt("nextType");
        this.z = paramBundle.getString("pattern");
        this.A = paramBundle.getInt("length");
        if (this.A == 0)
          break label356;
        paramBundle = new InputFilter.LengthFilter(this.A);
        this.f.setFilters(new InputFilter[] { paramBundle });
        if (this.k != null)
        {
          paramBundle = this.k;
          if (this.y == 0)
            break label370;
          i1 = 0;
          paramBundle.setVisibility(i1);
        }
        if (this.b == null)
          continue;
        str = org.vidogram.a.b.a().e(this.b);
        paramBundle = "";
        if (this.x != 1)
          break label376;
        paramBundle = org.vidogram.messenger.a.b(r.a("SentAppCode", 2131231812));
        label258: this.g.setText(paramBundle);
        if (this.x == 3)
          break label475;
        org.vidogram.messenger.a.a(this.f);
        this.f.requestFocus();
      }
      while (true)
      {
        j();
        h();
        this.r = System.currentTimeMillis();
        if (this.x != 1)
          break label485;
        this.i.setVisibility(0);
        this.h.setVisibility(8);
        return;
        if (this.x != 3)
          break;
        org.vidogram.messenger.a.b(true);
        y.a().a(this, y.as);
        break;
        label356: this.f.setFilters(new InputFilter[0]);
        break label189;
        label370: i1 = 8;
        break label210;
        label376: if (this.x == 2)
        {
          paramBundle = org.vidogram.messenger.a.b(r.a("SentSmsCode", 2131231815, new Object[] { str }));
          break label258;
        }
        if (this.x == 3)
        {
          paramBundle = org.vidogram.messenger.a.b(r.a("SentCallCode", 2131231813, new Object[] { str }));
          break label258;
        }
        if (this.x != 4)
          break label258;
        paramBundle = org.vidogram.messenger.a.b(r.a("SentCallOnly", 2131231814, new Object[] { str }));
        break label258;
        label475: org.vidogram.messenger.a.b(this.f);
      }
      label485: if ((this.x == 3) && ((this.y == 4) || (this.y == 2)))
      {
        this.i.setVisibility(8);
        this.h.setVisibility(0);
        if (this.y == 4)
          this.h.setText(r.a("CallText", 2131230941, new Object[] { Integer.valueOf(1), Integer.valueOf(0) }));
        while (true)
        {
          i();
          return;
          if (this.y != 2)
            continue;
          this.h.setText(r.a("SmsText", 2131231860, new Object[] { Integer.valueOf(1), Integer.valueOf(0) }));
        }
      }
      if ((this.x == 2) && ((this.y == 4) || (this.y == 3)))
      {
        this.h.setVisibility(0);
        this.h.setText(r.a("CallText", 2131230941, new Object[] { Integer.valueOf(2), Integer.valueOf(0) }));
        paramBundle = this.i;
        if (this.p < 1000);
        for (i1 = i2; ; i1 = 8)
        {
          paramBundle.setVisibility(i1);
          i();
          return;
        }
      }
      this.h.setVisibility(8);
      this.i.setVisibility(8);
      g();
    }

    private class a extends View
    {
      private Paint b = new Paint();
      private Paint c = new Paint();
      private float d;

      public a(Context arg2)
      {
        super();
        this.b.setColor(-1971470);
        this.c.setColor(-10313520);
      }

      public void a(float paramFloat)
      {
        this.d = paramFloat;
        invalidate();
      }

      protected void onDraw(Canvas paramCanvas)
      {
        int i = (int)(getMeasuredWidth() * this.d);
        paramCanvas.drawRect(0.0F, 0.0F, i, getMeasuredHeight(), this.c);
        paramCanvas.drawRect(i, 0.0F, getMeasuredWidth(), getMeasuredHeight(), this.b);
      }
    }
  }

  public class b extends bi
    implements AdapterView.OnItemSelectedListener
  {
    private EditText b;
    private t c;
    private TextView d;
    private int e = 0;
    private ArrayList<String> f = new ArrayList();
    private HashMap<String, String> g = new HashMap();
    private HashMap<String, String> h = new HashMap();
    private HashMap<String, String> i = new HashMap();
    private boolean j = false;
    private boolean k = false;
    private boolean l = false;
    private boolean m = false;

    public b(Context arg2)
    {
      super();
      setOrientation(1);
      this.d = new TextView((Context)localObject1);
      this.d.setTextSize(1, 18.0F);
      this.d.setPadding(org.vidogram.messenger.a.a(12.0F), org.vidogram.messenger.a.a(10.0F), org.vidogram.messenger.a.a(12.0F), 0);
      this.d.setTextColor(-14606047);
      this.d.setMaxLines(1);
      this.d.setSingleLine(true);
      this.d.setEllipsize(TextUtils.TruncateAt.END);
      Object localObject2 = this.d;
      int n;
      if (r.a)
        n = 5;
      while (true)
      {
        ((TextView)localObject2).setGravity(n | 0x1);
        this.d.setBackgroundResource(2130838150);
        addView(this.d, v.a(-1, 36, 0.0F, 0.0F, 0.0F, 14.0F));
        this.d.setOnClickListener(new View.OnClickListener(i.this)
        {
          public void onClick(View paramView)
          {
            paramView = new u();
            paramView.a(new u.a()
            {
              public void a(String paramString)
              {
                i.b.this.a(paramString);
                org.vidogram.messenger.a.a(new Runnable()
                {
                  public void run()
                  {
                    org.vidogram.messenger.a.a(i.b.a(i.b.this));
                  }
                }
                , 300L);
                i.b.a(i.b.this).requestFocus();
                i.b.a(i.b.this).setSelection(i.b.a(i.b.this).length());
              }
            });
            i.this.a(paramView);
          }
        });
        localObject2 = new View((Context)localObject1);
        ((View)localObject2).setPadding(org.vidogram.messenger.a.a(12.0F), 0, org.vidogram.messenger.a.a(12.0F), 0);
        ((View)localObject2).setBackgroundColor(-2368549);
        addView((View)localObject2, v.a(-1, 1, 4.0F, -17.5F, 4.0F, 0.0F));
        localObject2 = new LinearLayout((Context)localObject1);
        ((LinearLayout)localObject2).setOrientation(0);
        addView((View)localObject2, v.a(-1, -2, 0.0F, 20.0F, 0.0F, 0.0F));
        Object localObject3 = new TextView((Context)localObject1);
        ((TextView)localObject3).setText("+");
        ((TextView)localObject3).setTextColor(-14606047);
        ((TextView)localObject3).setTextSize(1, 18.0F);
        ((LinearLayout)localObject2).addView((View)localObject3, v.b(-2, -2));
        this.b = new EditText((Context)localObject1);
        this.b.setInputType(3);
        this.b.setTextColor(-14606047);
        org.vidogram.messenger.a.a(this.b);
        this.b.setPadding(org.vidogram.messenger.a.a(10.0F), 0, 0, 0);
        this.b.setTextSize(1, 18.0F);
        this.b.setMaxLines(1);
        this.b.setGravity(19);
        this.b.setImeOptions(268435461);
        localObject3 = new InputFilter.LengthFilter(5);
        this.b.setFilters(new InputFilter[] { localObject3 });
        ((LinearLayout)localObject2).addView(this.b, v.a(55, 36, -9.0F, 0.0F, 16.0F, 0.0F));
        this.b.addTextChangedListener(new TextWatcher(i.this)
        {
          public void afterTextChanged(Editable paramEditable)
          {
            Object localObject3 = null;
            if (i.b.b(i.b.this))
              return;
            i.b.a(i.b.this, true);
            paramEditable = org.vidogram.a.b.b(i.b.c(i.b.this).getText().toString());
            i.b.c(i.b.this).setText(paramEditable);
            if (paramEditable.length() == 0)
            {
              i.b.d(i.b.this).setText(r.a("ChooseCountry", 2131231062));
              i.b.a(i.b.this).setHintText(null);
              i.b.a(i.b.this, 1);
              i.b.a(i.b.this, false);
              return;
            }
            int i;
            label124: Object localObject1;
            Object localObject2;
            label216: Object localObject4;
            if (paramEditable.length() > 4)
            {
              i.b.a(i.b.this, true);
              i = 4;
              if (i >= 1)
              {
                localObject1 = paramEditable.substring(0, i);
                if ((String)i.b.e(i.b.this).get(localObject1) != null)
                {
                  localObject2 = paramEditable.substring(i, paramEditable.length()) + i.b.a(i.b.this).getText().toString();
                  i.b.c(i.b.this).setText((CharSequence)localObject1);
                  i = 1;
                  paramEditable = (Editable)localObject1;
                  localObject1 = localObject2;
                  localObject2 = paramEditable;
                  if (i == 0)
                  {
                    i.b.a(i.b.this, true);
                    localObject1 = paramEditable.substring(1, paramEditable.length()) + i.b.a(i.b.this).getText().toString();
                    localObject4 = i.b.c(i.b.this);
                    localObject2 = paramEditable.substring(0, 1);
                    ((EditText)localObject4).setText((CharSequence)localObject2);
                  }
                  paramEditable = (Editable)localObject1;
                  localObject1 = localObject2;
                }
              }
            }
            while (true)
            {
              localObject2 = (String)i.b.e(i.b.this).get(localObject1);
              if (localObject2 != null)
              {
                int j = i.b.f(i.b.this).indexOf(localObject2);
                if (j != -1)
                {
                  i.b.b(i.b.this, true);
                  i.b.d(i.b.this).setText((CharSequence)i.b.f(i.b.this).get(j));
                  localObject4 = (String)i.b.g(i.b.this).get(localObject1);
                  localObject2 = i.b.a(i.b.this);
                  localObject1 = localObject3;
                  if (localObject4 != null)
                    localObject1 = ((String)localObject4).replace('X', '–');
                  ((t)localObject2).setHintText((String)localObject1);
                  i.b.a(i.b.this, 0);
                }
              }
              while (true)
              {
                if (i == 0)
                  i.b.c(i.b.this).setSelection(i.b.c(i.b.this).getText().length());
                if (paramEditable == null)
                  break;
                i.b.a(i.b.this).requestFocus();
                i.b.a(i.b.this).setText(paramEditable);
                i.b.a(i.b.this).setSelection(i.b.a(i.b.this).length());
                break;
                i -= 1;
                break label124;
                i.b.d(i.b.this).setText(r.a("WrongCountry", 2131231966));
                i.b.a(i.b.this).setHintText(null);
                i.b.a(i.b.this, 2);
                continue;
                i.b.d(i.b.this).setText(r.a("WrongCountry", 2131231966));
                i.b.a(i.b.this).setHintText(null);
                i.b.a(i.b.this, 2);
              }
              localObject1 = null;
              i = 0;
              break label216;
              i = 0;
              localObject1 = paramEditable;
              paramEditable = null;
            }
          }

          public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
          {
          }

          public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
          {
          }
        });
        this.b.setOnEditorActionListener(new TextView.OnEditorActionListener(i.this)
        {
          public boolean onEditorAction(TextView paramTextView, int paramInt, KeyEvent paramKeyEvent)
          {
            if (paramInt == 5)
            {
              i.b.a(i.b.this).requestFocus();
              i.b.a(i.b.this).setSelection(i.b.a(i.b.this).length());
              return true;
            }
            return false;
          }
        });
        this.c = new t((Context)localObject1);
        this.c.setInputType(3);
        this.c.setTextColor(-14606047);
        this.c.setHintTextColor(-6842473);
        this.c.setPadding(0, 0, 0, 0);
        org.vidogram.messenger.a.a(this.c);
        this.c.setTextSize(1, 18.0F);
        this.c.setMaxLines(1);
        this.c.setGravity(19);
        this.c.setImeOptions(268435461);
        ((LinearLayout)localObject2).addView(this.c, v.a(-1, 36.0F));
        this.c.addTextChangedListener(new TextWatcher(i.this)
        {
          private int c = -1;
          private int d;

          public void afterTextChanged(Editable paramEditable)
          {
            if (i.b.h(i.b.this))
              return;
            int j = i.b.a(i.b.this).getSelectionStart();
            Object localObject = i.b.a(i.b.this).getText().toString();
            paramEditable = (Editable)localObject;
            int i = j;
            if (this.c == 3)
            {
              paramEditable = ((String)localObject).substring(0, this.d) + ((String)localObject).substring(this.d + 1, ((String)localObject).length());
              i = j - 1;
            }
            localObject = new StringBuilder(paramEditable.length());
            j = 0;
            while (j < paramEditable.length())
            {
              String str = paramEditable.substring(j, j + 1);
              if ("0123456789".contains(str))
                ((StringBuilder)localObject).append(str);
              j += 1;
            }
            i.b.c(i.b.this, true);
            paramEditable = i.b.a(i.b.this).getHintText();
            j = i;
            if (paramEditable != null)
            {
              int k = 0;
              while (true)
              {
                j = i;
                if (k >= ((StringBuilder)localObject).length())
                  break;
                if (k < paramEditable.length())
                {
                  int m = k;
                  j = i;
                  if (paramEditable.charAt(k) == ' ')
                  {
                    ((StringBuilder)localObject).insert(k, ' ');
                    k += 1;
                    m = k;
                    j = i;
                    if (i == k)
                    {
                      m = k;
                      j = i;
                      if (this.c != 2)
                      {
                        m = k;
                        j = i;
                        if (this.c != 3)
                        {
                          j = i + 1;
                          m = k;
                        }
                      }
                    }
                  }
                  k = m + 1;
                  i = j;
                  continue;
                }
                ((StringBuilder)localObject).insert(k, ' ');
                j = i;
                if (i != k + 1)
                  break;
                j = i;
                if (this.c == 2)
                  break;
                j = i;
                if (this.c == 3)
                  break;
                j = i + 1;
              }
            }
            i.b.a(i.b.this).setText((CharSequence)localObject);
            if (j >= 0)
            {
              paramEditable = i.b.a(i.b.this);
              if (j > i.b.a(i.b.this).length())
                break label404;
            }
            while (true)
            {
              paramEditable.setSelection(j);
              i.b.a(i.b.this).a();
              i.b.c(i.b.this, false);
              return;
              label404: j = i.b.a(i.b.this).length();
            }
          }

          public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
          {
            if ((paramInt2 == 0) && (paramInt3 == 1))
            {
              this.c = 1;
              return;
            }
            if ((paramInt2 == 1) && (paramInt3 == 0))
            {
              if ((paramCharSequence.charAt(paramInt1) == ' ') && (paramInt1 > 0))
              {
                this.c = 3;
                this.d = (paramInt1 - 1);
                return;
              }
              this.c = 2;
              return;
            }
            this.c = -1;
          }

          public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
          {
          }
        });
        this.c.setOnEditorActionListener(new TextView.OnEditorActionListener(i.this)
        {
          public boolean onEditorAction(TextView paramTextView, int paramInt, KeyEvent paramKeyEvent)
          {
            if (paramInt == 5)
            {
              i.b.this.a();
              return true;
            }
            return false;
          }
        });
        localObject1 = new TextView((Context)localObject1);
        ((TextView)localObject1).setText(r.a("ChangePhoneHelp", 2131230954));
        ((TextView)localObject1).setTextColor(-9079435);
        ((TextView)localObject1).setTextSize(1, 14.0F);
        if (r.a)
        {
          n = 5;
          label709: ((TextView)localObject1).setGravity(n);
          ((TextView)localObject1).setLineSpacing(org.vidogram.messenger.a.a(2.0F), 1.0F);
          if (!r.a)
            break label1085;
          n = 5;
          label732: addView((View)localObject1, v.b(-2, -2, n, 0, 28, 0, 10));
          localObject1 = new HashMap();
          try
          {
            localObject2 = new BufferedReader(new InputStreamReader(getResources().getAssets().open("countries.txt")));
            while (true)
            {
              localObject3 = ((BufferedReader)localObject2).readLine();
              if (localObject3 == null)
                break;
              localObject3 = ((String)localObject3).split(";");
              this.f.add(0, localObject3[2]);
              this.g.put(localObject3[2], localObject3[0]);
              this.h.put(localObject3[0], localObject3[2]);
              if (localObject3.length > 3)
                this.i.put(localObject3[0], localObject3[3]);
              ((HashMap)localObject1).put(localObject3[1], localObject3[2]);
            }
          }
          catch (Exception localException)
          {
            n.a("tmessages", localException);
          }
          Collections.sort(this.f, new Comparator(i.this)
          {
            public int a(String paramString1, String paramString2)
            {
              return paramString1.compareTo(paramString2);
            }
          });
        }
        try
        {
          this$1 = (TelephonyManager)ApplicationLoader.a.getSystemService("phone");
          if (i.this != null)
          {
            this$1 = i.this.getSimCountryIso().toUpperCase();
            if (i.this != null)
            {
              this$1 = (String)((HashMap)localObject1).get(i.this);
              if ((i.this != null) && (this.f.indexOf(i.this) != -1))
              {
                this.b.setText((CharSequence)this.g.get(i.this));
                this.e = 0;
              }
            }
            if (this.b.length() == 0)
            {
              this.d.setText(r.a("ChooseCountry", 2131231062));
              this.c.setHintText(null);
              this.e = 1;
            }
            if (this.b.length() == 0)
              break label1111;
            org.vidogram.messenger.a.a(this.c);
            this.c.requestFocus();
            this.c.setSelection(this.c.length());
            return;
            n = 3;
            continue;
            n = 3;
            break label709;
            label1085: n = 3;
            break label732;
            localException.close();
          }
        }
        catch (Exception this$1)
        {
          while (true)
          {
            n.a("tmessages", i.this);
            this$1 = null;
          }
          label1111: org.vidogram.messenger.a.a(this.b);
          this.b.requestFocus();
        }
      }
    }

    public void a()
    {
      if ((i.this.l() == null) || (this.m))
        return;
      Object localObject2 = (TelephonyManager)ApplicationLoader.a.getSystemService("phone");
      int i1;
      int n;
      label81: int i2;
      if ((((TelephonyManager)localObject2).getSimState() != 1) && (((TelephonyManager)localObject2).getPhoneType() != 0))
      {
        i1 = 1;
        if ((Build.VERSION.SDK_INT < 23) || (i1 == 0))
          break label445;
        if (i.this.l().checkSelfPermission("android.permission.READ_PHONE_STATE") != 0)
          break label356;
        n = 1;
        if (i.this.l().checkSelfPermission("android.permission.RECEIVE_SMS") != 0)
          break label361;
        i2 = 1;
        label99: i3 = n;
        if (!i.c(i.this))
          break label448;
        i.d(i.this).clear();
        if (n == 0)
          i.d(i.this).add("android.permission.READ_PHONE_STATE");
        if (i2 == 0)
          i.d(i.this).add("android.permission.RECEIVE_SMS");
        i3 = n;
        if (i.d(i.this).isEmpty())
          break label448;
        localObject1 = ApplicationLoader.a.getSharedPreferences("mainconfig", 0);
        if ((!((SharedPreferences)localObject1).getBoolean("firstlogin", true)) && (!i.this.l().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE")) && (!i.this.l().shouldShowRequestPermissionRationale("android.permission.RECEIVE_SMS")))
          break label406;
        ((SharedPreferences)localObject1).edit().putBoolean("firstlogin", false).commit();
        localObject1 = new AlertDialog.Builder(i.this.l());
        ((AlertDialog.Builder)localObject1).setTitle(r.a("AppName", 2131230856));
        ((AlertDialog.Builder)localObject1).setPositiveButton(r.a("OK", 2131231604), null);
        if (i.d(i.this).size() != 2)
          break label366;
        ((AlertDialog.Builder)localObject1).setMessage(r.a("AllowReadCallAndSms", 2131230836));
      }
      while (true)
      {
        i.a(i.this, i.this.b(((AlertDialog.Builder)localObject1).create()));
        return;
        i1 = 0;
        break;
        label356: n = 0;
        break label81;
        label361: i2 = 0;
        break label99;
        label366: if (i2 == 0)
        {
          ((AlertDialog.Builder)localObject1).setMessage(r.a("AllowReadSms", 2131230837));
          continue;
        }
        ((AlertDialog.Builder)localObject1).setMessage(r.a("AllowReadCall", 2131230835));
      }
      label406: i.this.l().requestPermissions((String[])i.d(i.this).toArray(new String[i.d(i.this).size()]), 6);
      return;
      label445: int i3 = 1;
      label448: if (this.e == 1)
      {
        i.this.a(r.a("ChooseCountry", 2131231062));
        return;
      }
      if ((this.e == 2) && (!d.a))
      {
        i.this.a(r.a("WrongCountry", 2131231966));
        return;
      }
      if (this.b.length() == 0)
      {
        i.this.a(r.a("InvalidPhoneNumber", 2131231318));
        return;
      }
      Object localObject1 = new g.by();
      String str = org.vidogram.a.b.b("" + this.b.getText() + this.c.getText());
      ((g.by)localObject1).e = str;
      boolean bool;
      if ((i1 != 0) && (i3 != 0))
        bool = true;
      while (true)
      {
        ((g.by)localObject1).d = bool;
        if (((g.by)localObject1).d);
        try
        {
          localObject2 = ((TelephonyManager)localObject2).getLine1Number();
          if ((localObject2 != null) && (((String)localObject2).length() != 0))
          {
            if (str.contains((CharSequence)localObject2))
              break label893;
            if (((String)localObject2).contains(str))
            {
              break label893;
              ((g.by)localObject1).f = bool;
              localObject2 = new Bundle();
              ((Bundle)localObject2).putString("phone", "+" + this.b.getText() + this.c.getText());
            }
          }
        }
        catch (Exception localException1)
        {
          while (true)
          {
            try
            {
              ((Bundle)localObject2).putString("ephone", "+" + org.vidogram.a.b.b(this.b.getText().toString()) + " " + org.vidogram.a.b.b(this.c.getText().toString()));
              ((Bundle)localObject2).putString("phoneFormated", str);
              this.m = true;
              i.this.q();
              ConnectionsManager.a().a((f)localObject1, new org.vidogram.tgnet.c((Bundle)localObject2)
              {
              }
              , 2);
              return;
              bool = false;
              break;
              bool = false;
              continue;
              localException1 = localException1;
              ((g.by)localObject1).d = false;
              n.a("tmessages", localException1);
            }
            catch (Exception localException2)
            {
              n.a("tmessages", localException2);
              localException1.putString("ephone", "+" + str);
              continue;
            }
            label893: bool = true;
          }
        }
      }
    }

    public void a(String paramString)
    {
      Object localObject;
      if (this.f.indexOf(paramString) != -1)
      {
        this.k = true;
        localObject = (String)this.g.get(paramString);
        this.b.setText((CharSequence)localObject);
        this.d.setText(paramString);
        paramString = (String)this.i.get(localObject);
        localObject = this.c;
        if (paramString == null)
          break label92;
      }
      label92: for (paramString = paramString.replace('X', '–'); ; paramString = null)
      {
        ((t)localObject).setHintText(paramString);
        this.e = 0;
        this.k = false;
        return;
      }
    }

    public void c()
    {
      super.c();
      if (this.c != null)
      {
        if (this.b.length() != 0)
        {
          org.vidogram.messenger.a.a(this.c);
          this.c.requestFocus();
          this.c.setSelection(this.c.length());
        }
      }
      else
        return;
      org.vidogram.messenger.a.a(this.b);
      this.b.requestFocus();
    }

    public String getHeaderName()
    {
      return r.a("ChangePhoneNewNumber", 2131230955);
    }

    public void onItemSelected(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
    {
      if (this.j)
      {
        this.j = false;
        return;
      }
      this.k = true;
      paramAdapterView = (String)this.f.get(paramInt);
      this.b.setText((CharSequence)this.g.get(paramAdapterView));
      this.k = false;
    }

    public void onNothingSelected(AdapterView<?> paramAdapterView)
    {
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.i
 * JD-Core Version:    0.6.0
 */