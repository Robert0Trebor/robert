package org.vidogram.ui;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.text.Editable;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;
import org.vidogram.a.b;
import org.vidogram.messenger.ApplicationLoader;
import org.vidogram.messenger.n;
import org.vidogram.messenger.r;
import org.vidogram.messenger.y;
import org.vidogram.messenger.y.b;
import org.vidogram.tgnet.ConnectionsManager;
import org.vidogram.tgnet.g.bj;
import org.vidogram.tgnet.g.bz;
import org.vidogram.tgnet.g.cs;
import org.vidogram.ui.Components.bi;
import org.vidogram.ui.Components.v;
import org.vidogram.ui.a.a.a;
import org.vidogram.ui.a.g;

public class f extends g
{
  private int i = 0;
  private bi[] j = new bi[5];
  private ProgressDialog k;
  private Dialog l;
  private ArrayList<String> m = new ArrayList();
  private boolean n = false;
  private View o;
  private String p;
  private String q;
  private Dialog r;

  public f(Bundle paramBundle)
  {
    super(paramBundle);
    this.p = paramBundle.getString("hash");
    this.q = paramBundle.getString("phone");
  }

  public Dialog a(String paramString)
  {
    if ((paramString == null) || (l() == null))
      return null;
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(l());
    localBuilder.setTitle(r.a("AppName", 2131230856));
    localBuilder.setMessage(paramString);
    localBuilder.setPositiveButton(r.a("OK", 2131231604), null);
    paramString = localBuilder.create();
    b(paramString);
    return paramString;
  }

  public View a(Context paramContext)
  {
    this.d.setTitle(r.a("AppName", 2131230856));
    this.d.setBackButtonImage(2130837794);
    this.d.setActionBarMenuOnItemClick(new a.a()
    {
      public void a(int paramInt)
      {
        if (paramInt == 1)
          f.a(f.this)[f.b(f.this)].a();
        do
          return;
        while (paramInt != -1);
        f.this.d();
      }
    });
    this.o = this.d.a().b(1, 2130837825, org.vidogram.messenger.a.a(56.0F));
    this.o.setVisibility(8);
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
      label229: float f1;
      label251: float f2;
      label260: float f3;
      if (i1 == 0)
      {
        i2 = 0;
        paramContext.setVisibility(i2);
        paramContext = this.j[i1];
        if (i1 != 0)
          break label305;
        f1 = -2.0F;
        if (!org.vidogram.messenger.a.c())
          break label311;
        f2 = 26.0F;
        if (!org.vidogram.messenger.a.c())
          break label317;
        f3 = 26.0F;
      }
      while (true)
      {
        localFrameLayout.addView(paramContext, v.a(-1, f1, 51, f2, 30.0F, f3, 0.0F));
        i1 += 1;
        break;
        i2 = 8;
        break label229;
        label305: f1 = -1.0F;
        break label251;
        label311: f2 = 18.0F;
        break label260;
        label317: f3 = 18.0F;
      }
    }
    this.d.setTitle(this.j[0].getHeaderName());
    return this.b;
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

  public void b(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (paramBoolean1)
      this.j[this.i].c();
  }

  protected void c(Dialog paramDialog)
  {
    if ((Build.VERSION.SDK_INT >= 23) && (paramDialog == this.l) && (!this.m.isEmpty()))
      l().requestPermissions((String[])this.m.toArray(new String[this.m.size()]), 6);
    if (paramDialog == this.r)
      d();
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
    while (i1 < this.j.length)
    {
      if (this.j[i1] != null)
        this.j[i1].b();
      i1 += 1;
    }
    return true;
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
    private String b;
    private String c;
    private EditText d;
    private TextView e;
    private TextView f;
    private TextView g;
    private Bundle h;
    private a i;
    private Timer j;
    private Timer k;
    private int l;
    private final Object m = new Object();
    private volatile int n = 60000;
    private volatile int o = 15000;
    private double p;
    private double q;
    private boolean r;
    private boolean s;
    private boolean t;
    private String u = "";
    private int v;
    private int w;
    private String x = "*";
    private int y;
    private int z;

    public a(Context paramInt, int arg3)
    {
      super();
      this.v = i1;
      setOrientation(1);
      this.e = new TextView(paramInt);
      this.e.setTextColor(-9079435);
      this.e.setTextSize(1, 14.0F);
      Object localObject1 = this.e;
      Object localObject2;
      if (r.a)
      {
        i1 = 5;
        ((TextView)localObject1).setGravity(i1);
        this.e.setLineSpacing(org.vidogram.messenger.a.a(2.0F), 1.0F);
        if (this.v != 3)
          break label772;
        localObject1 = new FrameLayout(paramInt);
        localObject2 = new ImageView(paramInt);
        ((ImageView)localObject2).setImageResource(2130838029);
        if (!r.a)
          break label706;
        ((FrameLayout)localObject1).addView((View)localObject2, v.a(64, 76.0F, 19, 2.0F, 2.0F, 0.0F, 0.0F));
        localObject2 = this.e;
        if (!r.a)
          break label701;
        i1 = 5;
        label195: ((FrameLayout)localObject1).addView((View)localObject2, v.a(-1, -2.0F, i1, 82.0F, 0.0F, 0.0F, 0.0F));
        if (!r.a)
          break label767;
        i1 = 5;
        label222: addView((View)localObject1, v.d(-2, -2, i1));
        this.d = new EditText(paramInt);
        this.d.setTextColor(-14606047);
        this.d.setHint(r.a("Code", 2131231073));
        org.vidogram.messenger.a.a(this.d);
        this.d.setHintTextColor(-6842473);
        this.d.setImeOptions(268435461);
        this.d.setTextSize(1, 18.0F);
        this.d.setInputType(3);
        this.d.setMaxLines(1);
        this.d.setPadding(0, 0, 0, 0);
        addView(this.d, v.b(-1, 36, 1, 0, 20, 0, 0));
        this.d.addTextChangedListener(new TextWatcher(f.this)
        {
          public void afterTextChanged(Editable paramEditable)
          {
            if (f.a.a(f.a.this));
            do
              return;
            while ((f.a.b(f.a.this) == 0) || (f.a.c(f.a.this).length() != f.a.b(f.a.this)));
            f.a.this.a();
          }

          public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
          {
          }

          public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
          {
          }
        });
        this.d.setOnEditorActionListener(new TextView.OnEditorActionListener(f.this)
        {
          public boolean onEditorAction(TextView paramTextView, int paramInt, KeyEvent paramKeyEvent)
          {
            if (paramInt == 5)
            {
              f.a.this.a();
              return true;
            }
            return false;
          }
        });
        if (this.v == 3)
        {
          this.d.setEnabled(false);
          this.d.setInputType(0);
          this.d.setVisibility(8);
        }
        this.f = new TextView(paramInt);
        this.f.setTextSize(1, 14.0F);
        this.f.setTextColor(-9079435);
        this.f.setLineSpacing(org.vidogram.messenger.a.a(2.0F), 1.0F);
        localObject1 = this.f;
        if (!r.a)
          break label808;
        i1 = 5;
        label476: ((TextView)localObject1).setGravity(i1);
        localObject1 = this.f;
        if (!r.a)
          break label813;
        i1 = 5;
        label496: addView((View)localObject1, v.b(-2, -2, i1, 0, 30, 0, 0));
        if (this.v == 3)
        {
          this.i = new a(paramInt);
          addView(this.i, v.a(-1, 3, 0.0F, 12.0F, 0.0F, 0.0F));
        }
        this.g = new TextView(paramInt);
        this.g.setText(r.a("DidNotGetTheCode", 2131231141));
        paramInt = this.g;
        if (!r.a)
          break label818;
        i1 = 5;
        label593: paramInt.setGravity(i1);
        this.g.setTextSize(1, 14.0F);
        this.g.setTextColor(-11697229);
        this.g.setLineSpacing(org.vidogram.messenger.a.a(2.0F), 1.0F);
        this.g.setPadding(0, org.vidogram.messenger.a.a(2.0F), 0, org.vidogram.messenger.a.a(12.0F));
        paramInt = this.g;
        if (!r.a)
          break label823;
      }
      label772: label808: label813: label818: label823: for (int i1 = 5; ; i1 = 3)
      {
        addView(paramInt, v.b(-2, -2, i1, 0, 20, 0, 0));
        this.g.setOnClickListener(new View.OnClickListener(f.this)
        {
          public void onClick(View paramView)
          {
            if (f.a.d(f.a.this))
              return;
            if ((f.a.e(f.a.this) != 0) && (f.a.e(f.a.this) != 4))
            {
              f.a.f(f.a.this);
              return;
            }
            try
            {
              paramView = ApplicationLoader.a.getPackageManager().getPackageInfo(ApplicationLoader.a.getPackageName(), 0);
              paramView = String.format(Locale.US, "%s (%d)", new Object[] { paramView.versionName, Integer.valueOf(paramView.versionCode) });
              Intent localIntent = new Intent("android.intent.action.SEND");
              localIntent.setType("message/rfc822");
              localIntent.putExtra("android.intent.extra.EMAIL", new String[] { "sms@stel.com" });
              localIntent.putExtra("android.intent.extra.SUBJECT", "Android cancel account deletion issue " + paramView + " " + f.a.g(f.a.this));
              localIntent.putExtra("android.intent.extra.TEXT", "Phone: " + f.a.g(f.a.this) + "\nApp version: " + paramView + "\nOS version: SDK " + Build.VERSION.SDK_INT + "\nDevice Name: " + Build.MANUFACTURER + Build.MODEL + "\nLocale: " + Locale.getDefault() + "\nError: " + f.a.h(f.a.this));
              f.a.this.getContext().startActivity(Intent.createChooser(localIntent, "Send email..."));
              return;
            }
            catch (Exception paramView)
            {
              f.this.a(r.a("NoMailInstalled", 2131231495));
            }
          }
        });
        return;
        i1 = 3;
        break;
        label701: i1 = 3;
        break label195;
        label706: TextView localTextView = this.e;
        if (r.a);
        for (i1 = 5; ; i1 = 3)
        {
          ((FrameLayout)localObject1).addView(localTextView, v.a(-1, -2.0F, i1, 0.0F, 0.0F, 82.0F, 0.0F));
          ((FrameLayout)localObject1).addView((View)localObject2, v.a(64, 76.0F, 21, 0.0F, 2.0F, 0.0F, 2.0F));
          break;
        }
        label767: i1 = 3;
        break label222;
        localObject1 = this.e;
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
        break label593;
      }
    }

    private void f()
    {
      Bundle localBundle = new Bundle();
      localBundle.putString("phone", this.b);
      this.t = true;
      f.this.q();
      g.cs localcs = new g.cs();
      localcs.c = this.b;
      localcs.d = this.c;
      ConnectionsManager.a().a(localcs, new org.vidogram.tgnet.c(localBundle)
      {
      }
      , 2);
    }

    private void g()
    {
      if (this.k != null)
        return;
      this.o = 15000;
      this.k = new Timer();
      this.q = System.currentTimeMillis();
      this.k.schedule(new TimerTask()
      {
        public void run()
        {
          double d1 = System.currentTimeMillis();
          double d2 = f.a.i(f.a.this);
          f.a.a(f.a.this, (int)(f.a.j(f.a.this) - (d1 - d2)));
          f.a.a(f.a.this, d1);
          org.vidogram.messenger.a.a(new Runnable()
          {
            public void run()
            {
              if (f.a.j(f.a.this) <= 1000)
              {
                f.a.k(f.a.this).setVisibility(0);
                f.a.l(f.a.this);
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
        synchronized (this.m)
        {
          if (this.k != null)
          {
            this.k.cancel();
            this.k = null;
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
      if (this.j != null)
        return;
      this.j = new Timer();
      this.j.schedule(new TimerTask()
      {
        public void run()
        {
          if (f.a.m(f.a.this) == null)
            return;
          double d1 = System.currentTimeMillis();
          double d2 = f.a.n(f.a.this);
          f.a.b(f.a.this, (int)(f.a.o(f.a.this) - (d1 - d2)));
          f.a.b(f.a.this, d1);
          org.vidogram.messenger.a.a(new Runnable()
          {
            public void run()
            {
              int i;
              int j;
              if (f.a.o(f.a.this) >= 1000)
              {
                i = f.a.o(f.a.this) / 1000 / 60;
                j = f.a.o(f.a.this) / 1000 - i * 60;
                if ((f.a.e(f.a.this) == 4) || (f.a.e(f.a.this) == 3))
                  f.a.p(f.a.this).setText(r.a("CallText", 2131230941, new Object[] { Integer.valueOf(i), Integer.valueOf(j) }));
              }
              do
              {
                do
                {
                  while (true)
                  {
                    if (f.a.q(f.a.this) != null)
                      f.a.q(f.a.this).a(1.0F - f.a.o(f.a.this) / f.a.r(f.a.this));
                    return;
                    if (f.a.e(f.a.this) != 2)
                      continue;
                    f.a.p(f.a.this).setText(r.a("SmsText", 2131231860, new Object[] { Integer.valueOf(i), Integer.valueOf(j) }));
                  }
                  if (f.a.q(f.a.this) != null)
                    f.a.q(f.a.this).a(1.0F);
                  f.a.s(f.a.this);
                  if (f.a.t(f.a.this) != 3)
                    continue;
                  org.vidogram.messenger.a.b(false);
                  y.a().b(this, y.as);
                  f.a.a(f.a.this, false);
                  f.a.l(f.a.this);
                  f.a.f(f.a.this);
                  return;
                }
                while (f.a.t(f.a.this) != 2);
                if (f.a.e(f.a.this) != 4)
                  continue;
                f.a.p(f.a.this).setText(r.a("Calling", 2131230942));
                f.a.u(f.a.this);
                g.cs localcs = new g.cs();
                localcs.c = f.a.g(f.a.this);
                localcs.d = f.a.v(f.a.this);
                ConnectionsManager.a().a(localcs, new org.vidogram.tgnet.c()
                {
                }
                , 2);
                return;
              }
              while (f.a.e(f.a.this) != 3);
              org.vidogram.messenger.a.a(false);
              y.a().b(this, y.ar);
              f.a.a(f.a.this, false);
              f.a.l(f.a.this);
              f.a.f(f.a.this);
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
        synchronized (this.m)
        {
          if (this.j != null)
          {
            this.j.cancel();
            this.j = null;
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
      if (this.t)
        return;
      this.t = true;
      if (this.v == 2)
      {
        org.vidogram.messenger.a.a(false);
        y.a().b(this, y.ar);
      }
      while (true)
      {
        this.s = false;
        g.bj localbj = new g.bj();
        localbj.d = this.d.getText().toString();
        localbj.c = this.c;
        j();
        f.this.q();
        ConnectionsManager.a().a(localbj, new org.vidogram.tgnet.c()
        {
        }
        , 2);
        return;
        if (this.v != 3)
          continue;
        org.vidogram.messenger.a.b(false);
        y.a().b(this, y.as);
      }
    }

    public void a(int paramInt, Object[] paramArrayOfObject)
    {
      if ((!this.s) || (this.d == null));
      do
      {
        do
        {
          return;
          if (paramInt != y.ar)
            continue;
          this.r = true;
          this.d.setText("" + paramArrayOfObject[0]);
          this.r = false;
          a();
          return;
        }
        while (paramInt != y.as);
        paramArrayOfObject = "" + paramArrayOfObject[0];
      }
      while ((!this.x.equals("*")) && (!paramArrayOfObject.contains(this.x.replace("*", ""))));
      this.r = true;
      this.d.setText(paramArrayOfObject);
      this.r = false;
      a();
    }

    public void b()
    {
      super.b();
      if (this.v == 2)
      {
        org.vidogram.messenger.a.a(false);
        y.a().b(this, y.ar);
      }
      while (true)
      {
        this.s = false;
        j();
        h();
        return;
        if (this.v != 3)
          continue;
        org.vidogram.messenger.a.b(false);
        y.a().b(this, y.as);
      }
    }

    public void c()
    {
      super.c();
      if (this.d != null)
      {
        this.d.requestFocus();
        this.d.setSelection(this.d.length());
      }
    }

    public String getHeaderName()
    {
      return r.a("CancelAccountReset", 2131230944);
    }

    public void setParams(Bundle paramBundle)
    {
      int i2 = 0;
      if (paramBundle == null);
      int i1;
      while (true)
      {
        return;
        this.d.setText("");
        this.s = true;
        if (this.v != 2)
          break;
        org.vidogram.messenger.a.a(true);
        y.a().a(this, y.ar);
        this.h = paramBundle;
        this.b = paramBundle.getString("phone");
        this.c = paramBundle.getString("phoneHash");
        i1 = paramBundle.getInt("timeout");
        this.n = i1;
        this.z = i1;
        this.l = (int)(System.currentTimeMillis() / 1000L);
        this.w = paramBundle.getInt("nextType");
        this.x = paramBundle.getString("pattern");
        this.y = paramBundle.getInt("length");
        if (this.y == 0)
          break label355;
        paramBundle = new InputFilter.LengthFilter(this.y);
        this.d.setFilters(new InputFilter[] { paramBundle });
        label167: if (this.i != null)
        {
          paramBundle = this.i;
          if (this.w == 0)
            break label369;
          i1 = 0;
          label188: paramBundle.setVisibility(i1);
        }
        if (this.b == null)
          continue;
        paramBundle = b.a().e(this.b);
        paramBundle = org.vidogram.messenger.a.b(r.a("CancelAccountResetInfo", 2131230945, new Object[] { b.a().e("+" + paramBundle) }));
        this.e.setText(paramBundle);
        if (this.v == 3)
          break label375;
        org.vidogram.messenger.a.a(this.d);
        this.d.requestFocus();
      }
      while (true)
      {
        j();
        h();
        this.p = System.currentTimeMillis();
        if (this.v != 1)
          break label385;
        this.g.setVisibility(0);
        this.f.setVisibility(8);
        return;
        if (this.v != 3)
          break;
        org.vidogram.messenger.a.b(true);
        y.a().a(this, y.as);
        break;
        label355: this.d.setFilters(new InputFilter[0]);
        break label167;
        label369: i1 = 8;
        break label188;
        label375: org.vidogram.messenger.a.b(this.d);
      }
      label385: if ((this.v == 3) && ((this.w == 4) || (this.w == 2)))
      {
        this.g.setVisibility(8);
        this.f.setVisibility(0);
        if (this.w == 4)
          this.f.setText(r.a("CallText", 2131230941, new Object[] { Integer.valueOf(1), Integer.valueOf(0) }));
        while (true)
        {
          i();
          return;
          if (this.w != 2)
            continue;
          this.f.setText(r.a("SmsText", 2131231860, new Object[] { Integer.valueOf(1), Integer.valueOf(0) }));
        }
      }
      if ((this.v == 2) && ((this.w == 4) || (this.w == 3)))
      {
        this.f.setVisibility(0);
        this.f.setText(r.a("CallText", 2131230941, new Object[] { Integer.valueOf(2), Integer.valueOf(0) }));
        paramBundle = this.g;
        if (this.n < 1000);
        for (i1 = i2; ; i1 = 8)
        {
          paramBundle.setVisibility(i1);
          i();
          return;
        }
      }
      this.f.setVisibility(8);
      this.g.setVisibility(8);
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
  {
    private boolean b = false;

    public b(Context arg2)
    {
      super();
      setOrientation(1);
      this$1 = new FrameLayout(localContext);
      addView(f.this, v.b(-1, 200));
      f.this.addView(new ProgressBar(localContext), v.b(-2, -2, 17));
    }

    public void a()
    {
      if ((f.this.l() == null) || (this.b))
        return;
      Object localObject = (TelephonyManager)ApplicationLoader.a.getSystemService("phone");
      int i;
      if ((((TelephonyManager)localObject).getSimState() != 1) && (((TelephonyManager)localObject).getPhoneType() != 0))
        i = 1;
      while (true)
      {
        if ((Build.VERSION.SDK_INT >= 23) && (i != 0));
        g.bz localbz = new g.bz();
        localbz.d = false;
        localbz.e = f.c(f.this);
        if (localbz.d);
        try
        {
          localObject = ((TelephonyManager)localObject).getLine1Number();
          if ((localObject != null) && (((String)localObject).length() != 0))
          {
            if (f.d(f.this).contains((CharSequence)localObject))
              break label226;
            if (((String)localObject).contains(f.d(f.this)))
              break label226;
          }
          while (true)
          {
            localbz.f = bool;
            localObject = new Bundle();
            ((Bundle)localObject).putString("phone", f.d(f.this));
            this.b = true;
            ConnectionsManager.a().a(localbz, new org.vidogram.tgnet.c((Bundle)localObject)
            {
            }
            , 2);
            return;
            i = 0;
            break;
            bool = false;
          }
        }
        catch (Exception localException)
        {
          while (true)
          {
            localbz.d = false;
            n.a("tmessages", localException);
            continue;
            label226: boolean bool = true;
          }
        }
      }
    }

    public void c()
    {
      super.c();
      a();
    }

    public String getHeaderName()
    {
      return r.a("CancelAccountReset", 2131230944);
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.f
 * JD-Core Version:    0.6.0
 */