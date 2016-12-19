package org.vidogram.ui;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
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
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Vibrator;
import android.telephony.TelephonyManager;
import android.text.Editable;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.TextUtils.TruncateAt;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewPropertyAnimator;
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
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;
import org.vidogram.a.b;
import org.vidogram.messenger.ApplicationLoader;
import org.vidogram.messenger.Utilities;
import org.vidogram.messenger.d;
import org.vidogram.messenger.n;
import org.vidogram.messenger.r;
import org.vidogram.messenger.y;
import org.vidogram.messenger.y.b;
import org.vidogram.tgnet.ConnectionsManager;
import org.vidogram.tgnet.f;
import org.vidogram.tgnet.g.bk;
import org.vidogram.tgnet.g.cn;
import org.vidogram.tgnet.g.co;
import org.vidogram.tgnet.g.cq;
import org.vidogram.tgnet.g.cr;
import org.vidogram.tgnet.g.cs;
import org.vidogram.tgnet.g.cu;
import org.vidogram.tgnet.g.cv;
import org.vidogram.tgnet.g.cw;
import org.vidogram.ui.Components.bi;
import org.vidogram.ui.Components.t;
import org.vidogram.ui.Components.v;
import org.vidogram.ui.a.a.a;
import org.vidogram.ui.a.g;

public class ae extends g
{
  private int i = 0;
  private bi[] j = new bi[9];
  private ProgressDialog k;
  private Dialog l;
  private ArrayList<String> m = new ArrayList();
  private boolean n = true;
  private View o;

  private void a(Bundle paramBundle, SharedPreferences.Editor paramEditor, String paramString)
  {
    Iterator localIterator = paramBundle.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      Object localObject = paramBundle.get(str);
      if ((localObject instanceof String))
      {
        if (paramString != null)
        {
          paramEditor.putString(paramString + "_|_" + str, (String)localObject);
          continue;
        }
        paramEditor.putString(str, (String)localObject);
        continue;
      }
      if ((localObject instanceof Integer))
      {
        if (paramString != null)
        {
          paramEditor.putInt(paramString + "_|_" + str, ((Integer)localObject).intValue());
          continue;
        }
        paramEditor.putInt(str, ((Integer)localObject).intValue());
        continue;
      }
      if (!(localObject instanceof Bundle))
        continue;
      a((Bundle)localObject, paramEditor, str);
    }
  }

  private void a(String paramString1, String paramString2)
  {
    if ((paramString2 == null) || (l() == null))
      return;
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(l());
    localBuilder.setTitle(paramString1);
    localBuilder.setMessage(paramString2);
    localBuilder.setPositiveButton(r.a("OK", 2131231604), null);
    b(localBuilder.create());
  }

  private Bundle q()
  {
    Bundle localBundle;
    while (true)
    {
      Object localObject3;
      String[] arrayOfString;
      try
      {
        localBundle = new Bundle();
        Iterator localIterator = ApplicationLoader.a.getSharedPreferences("logininfo2", 0).getAll().entrySet().iterator();
        if (!localIterator.hasNext())
          break;
        localObject2 = (Map.Entry)localIterator.next();
        String str = (String)((Map.Entry)localObject2).getKey();
        localObject3 = ((Map.Entry)localObject2).getValue();
        arrayOfString = str.split("_\\|_");
        if (arrayOfString.length != 1)
          break label145;
        if ((localObject3 instanceof String))
        {
          localBundle.putString(str, (String)localObject3);
          continue;
        }
      }
      catch (Exception localException)
      {
        n.a("tmessages", localException);
        return null;
      }
      if (!(localObject3 instanceof Integer))
        continue;
      localBundle.putInt(localException, ((Integer)localObject3).intValue());
      continue;
      label145: if (arrayOfString.length != 2)
        continue;
      Object localObject2 = localBundle.getBundle(arrayOfString[0]);
      Object localObject1 = localObject2;
      if (localObject2 == null)
      {
        localObject1 = new Bundle();
        localBundle.putBundle(arrayOfString[0], (Bundle)localObject1);
      }
      if ((localObject3 instanceof String))
      {
        ((Bundle)localObject1).putString(arrayOfString[1], (String)localObject3);
        continue;
      }
      if (!(localObject3 instanceof Integer))
        continue;
      ((Bundle)localObject1).putInt(arrayOfString[1], ((Integer)localObject3).intValue());
    }
    return (Bundle)(Bundle)localBundle;
  }

  private void r()
  {
    SharedPreferences.Editor localEditor = ApplicationLoader.a.getSharedPreferences("logininfo2", 0).edit();
    localEditor.clear();
    localEditor.commit();
  }

  private void s()
  {
    if ((l() == null) || (l().isFinishing()) || (this.k != null))
      return;
    this.k = new ProgressDialog(l());
    this.k.setMessage(r.a("Loading", 2131231394));
    this.k.setCanceledOnTouchOutside(false);
    this.k.setCancelable(false);
    this.k.show();
  }

  public View a(Context paramContext)
  {
    this.d.setTitle(r.a("AppName", 2131230856));
    this.d.setActionBarMenuOnItemClick(new a.a()
    {
      public void a(int paramInt)
      {
        if (paramInt == 1)
          ae.a(ae.this)[ae.b(ae.this)].a();
        do
          return;
        while (paramInt != -1);
        ae.this.k();
      }
    });
    this.o = this.d.a().b(1, 2130837825, org.vidogram.messenger.a.a(56.0F));
    this.b = new ScrollView(paramContext);
    ScrollView localScrollView = (ScrollView)this.b;
    localScrollView.setFillViewport(true);
    Object localObject = new FrameLayout(paramContext);
    localScrollView.addView((View)localObject, v.a(-1, -2, 51));
    this.j[0] = new f(paramContext);
    this.j[1] = new e(paramContext, 1);
    this.j[2] = new e(paramContext, 2);
    this.j[3] = new e(paramContext, 3);
    this.j[4] = new e(paramContext, 4);
    this.j[5] = new c(paramContext);
    this.j[6] = new a(paramContext);
    this.j[7] = new b(paramContext);
    this.j[8] = new d(paramContext);
    int i1 = 0;
    int i2;
    if (i1 < this.j.length)
    {
      paramContext = this.j[i1];
      label278: float f1;
      label301: float f2;
      label311: float f3;
      if (i1 == 0)
      {
        i2 = 0;
        paramContext.setVisibility(i2);
        paramContext = this.j[i1];
        if (i1 != 0)
          break label358;
        f1 = -2.0F;
        if (!org.vidogram.messenger.a.c())
          break label365;
        f2 = 26.0F;
        if (!org.vidogram.messenger.a.c())
          break label372;
        f3 = 26.0F;
      }
      while (true)
      {
        ((FrameLayout)localObject).addView(paramContext, v.a(-1, f1, 51, f2, 30.0F, f3, 0.0F));
        i1 += 1;
        break;
        i2 = 8;
        break label278;
        label358: f1 = -1.0F;
        break label301;
        label365: f2 = 18.0F;
        break label311;
        label372: f3 = 18.0F;
      }
    }
    localObject = q();
    paramContext = (Context)localObject;
    if (localObject != null)
    {
      this.i = ((Bundle)localObject).getInt("currentViewNum", 0);
      paramContext = (Context)localObject;
      if (this.i >= 1)
      {
        paramContext = (Context)localObject;
        if (this.i <= 4)
        {
          i1 = ((Bundle)localObject).getInt("open");
          paramContext = (Context)localObject;
          if (i1 != 0)
          {
            paramContext = (Context)localObject;
            if (Math.abs(System.currentTimeMillis() / 1000L - i1) >= 86400L)
            {
              this.i = 0;
              paramContext = null;
              r();
            }
          }
        }
      }
    }
    this.d.setTitle(this.j[this.i].getHeaderName());
    i1 = 0;
    if (i1 < this.j.length)
    {
      if (paramContext != null)
      {
        if ((i1 < 1) || (i1 > 4))
          break label642;
        if (i1 == this.i)
          this.j[i1].b(paramContext);
      }
      label550: if (this.i == i1)
      {
        localObject = this.d;
        if (this.j[i1].e())
        {
          i2 = 2130837794;
          label583: ((org.vidogram.ui.a.a)localObject).setBackButtonImage(i2);
          this.j[i1].setVisibility(0);
          this.j[i1].c();
          if ((i1 == 3) || (i1 == 8))
            this.o.setVisibility(8);
        }
      }
      while (true)
      {
        i1 += 1;
        break;
        label642: this.j[i1].b(paramContext);
        break label550;
        i2 = 0;
        break label583;
        this.j[i1].setVisibility(8);
      }
    }
    return (View)this.b;
  }

  public void a(int paramInt, boolean paramBoolean1, Bundle paramBundle, boolean paramBoolean2)
  {
    int i1 = 2130837794;
    label67: float f;
    if ((paramInt == 3) || (paramInt == 8))
    {
      this.o.setVisibility(8);
      if (!paramBoolean1)
        break label270;
      bi localbi = this.j[this.i];
      localObject = this.j[paramInt];
      this.i = paramInt;
      org.vidogram.ui.a.a locala = this.d;
      if (!((bi)localObject).e())
        break label239;
      locala.setBackButtonImage(i1);
      ((bi)localObject).setParams(paramBundle);
      this.d.setTitle(((bi)localObject).getHeaderName());
      ((bi)localObject).c();
      if (!paramBoolean2)
        break label245;
      f = -org.vidogram.messenger.a.c.x;
      label112: ((bi)localObject).setX(f);
      paramBundle = localbi.animate().setInterpolator(new AccelerateDecelerateInterpolator()).setListener(new Animator.AnimatorListener(localbi)
      {
        public void onAnimationCancel(Animator paramAnimator)
        {
        }

        @SuppressLint({"NewApi"})
        public void onAnimationEnd(Animator paramAnimator)
        {
          this.a.setVisibility(8);
          this.a.setX(0.0F);
        }

        public void onAnimationRepeat(Animator paramAnimator)
        {
        }

        public void onAnimationStart(Animator paramAnimator)
        {
        }
      }).setDuration(300L);
      if (!paramBoolean2)
        break label257;
      f = org.vidogram.messenger.a.c.x;
    }
    while (true)
    {
      paramBundle.translationX(f).start();
      ((bi)localObject).animate().setInterpolator(new AccelerateDecelerateInterpolator()).setListener(new Animator.AnimatorListener((bi)localObject)
      {
        public void onAnimationCancel(Animator paramAnimator)
        {
        }

        public void onAnimationEnd(Animator paramAnimator)
        {
        }

        public void onAnimationRepeat(Animator paramAnimator)
        {
        }

        public void onAnimationStart(Animator paramAnimator)
        {
          this.a.setVisibility(0);
        }
      }).setDuration(300L).translationX(0.0F).start();
      return;
      if (paramInt == 0)
        this.n = true;
      this.o.setVisibility(0);
      break;
      label239: i1 = 0;
      break label67;
      label245: f = org.vidogram.messenger.a.c.x;
      break label112;
      label257: f = -org.vidogram.messenger.a.c.x;
    }
    label270: Object localObject = this.d;
    if (this.j[paramInt].e());
    while (true)
    {
      ((org.vidogram.ui.a.a)localObject).setBackButtonImage(i1);
      this.j[this.i].setVisibility(8);
      this.i = paramInt;
      this.j[paramInt].setParams(paramBundle);
      this.j[paramInt].setVisibility(0);
      this.d.setTitle(this.j[paramInt].getHeaderName());
      this.j[paramInt].c();
      return;
      i1 = 0;
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

  public void a(Bundle paramBundle)
  {
    int i1 = 0;
    while (true)
    {
      try
      {
        paramBundle = new Bundle();
        paramBundle.putInt("currentViewNum", this.i);
        if (i1 > this.i)
          continue;
        Object localObject = this.j[i1];
        if (localObject != null)
        {
          ((bi)localObject).a(paramBundle);
          break label95;
          localObject = ApplicationLoader.a.getSharedPreferences("logininfo2", 0).edit();
          ((SharedPreferences.Editor)localObject).clear();
          a(paramBundle, (SharedPreferences.Editor)localObject, null);
          ((SharedPreferences.Editor)localObject).commit();
          return;
        }
      }
      catch (Exception paramBundle)
      {
        n.a("tmessages", paramBundle);
        return;
      }
      label95: i1 += 1;
    }
  }

  protected void c(Dialog paramDialog)
  {
    if ((Build.VERSION.SDK_INT >= 23) && (paramDialog == this.l) && (!this.m.isEmpty()) && (l() != null))
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
    try
    {
      if ((this.i >= 1) && (this.i <= 4) && ((this.j[this.i] instanceof e)))
      {
        int i1 = e.a((e)this.j[this.i]);
        if ((i1 != 0) && (Math.abs(System.currentTimeMillis() / 1000L - i1) >= 86400L))
        {
          this.j[this.i].d();
          a(0, false, null, true);
        }
      }
      return;
    }
    catch (Exception localException)
    {
      n.a("tmessages", localException);
    }
  }

  public void j()
  {
    super.j();
    org.vidogram.messenger.a.b(l(), this.e);
  }

  public boolean k()
  {
    int i2 = 0;
    int i1 = 0;
    if (this.i == 0)
    {
      while (i1 < this.j.length)
      {
        if (this.j[i1] != null)
          this.j[i1].b();
        i1 += 1;
      }
      r();
      i2 = 1;
    }
    do
    {
      return i2;
      if (this.i != 6)
        continue;
      this.j[this.i].d();
      a(0, true, null, true);
      return false;
    }
    while ((this.i != 7) && (this.i != 8));
    this.j[this.i].d();
    a(6, true, null, true);
    return false;
  }

  public class a extends bi
  {
    private EditText b;
    private TextView c;
    private TextView d;
    private TextView e;
    private Bundle f;
    private boolean g;
    private byte[] h;
    private String i;
    private String j;
    private boolean k;
    private String l;
    private String m;
    private String n;

    public a(Context arg2)
    {
      super();
      setOrientation(1);
      this.c = new TextView(localContext);
      this.c.setTextColor(-9079435);
      this.c.setTextSize(1, 14.0F);
      Object localObject = this.c;
      if (r.a)
      {
        i1 = 5;
        ((TextView)localObject).setGravity(i1);
        this.c.setLineSpacing(org.vidogram.messenger.a.a(2.0F), 1.0F);
        this.c.setText(r.a("LoginPasswordText", 2131231406));
        localObject = this.c;
        if (!r.a)
          break label711;
        i1 = 5;
        label107: addView((View)localObject, v.d(-2, -2, i1));
        this.b = new EditText(localContext);
        this.b.setTextColor(-14606047);
        org.vidogram.messenger.a.a(this.b);
        this.b.setHintTextColor(-6842473);
        this.b.setHint(r.a("LoginPassword", 2131231405));
        this.b.setImeOptions(268435461);
        this.b.setTextSize(1, 18.0F);
        this.b.setMaxLines(1);
        this.b.setPadding(0, 0, 0, 0);
        this.b.setInputType(129);
        this.b.setTransformationMethod(PasswordTransformationMethod.getInstance());
        this.b.setTypeface(Typeface.DEFAULT);
        localObject = this.b;
        if (!r.a)
          break label716;
        i1 = 5;
        label254: ((EditText)localObject).setGravity(i1);
        addView(this.b, v.b(-1, 36, 1, 0, 20, 0, 0));
        this.b.setOnEditorActionListener(new TextView.OnEditorActionListener(ae.this)
        {
          public boolean onEditorAction(TextView paramTextView, int paramInt, KeyEvent paramKeyEvent)
          {
            if (paramInt == 5)
            {
              ae.a.this.a();
              return true;
            }
            return false;
          }
        });
        localObject = new TextView(localContext);
        if (!r.a)
          break label721;
        i1 = 5;
        label314: ((TextView)localObject).setGravity(i1 | 0x30);
        ((TextView)localObject).setTextColor(-11697229);
        ((TextView)localObject).setText(r.a("ForgotPassword", 2131231202));
        ((TextView)localObject).setTextSize(1, 14.0F);
        ((TextView)localObject).setLineSpacing(org.vidogram.messenger.a.a(2.0F), 1.0F);
        ((TextView)localObject).setPadding(0, org.vidogram.messenger.a.a(14.0F), 0, 0);
        if (!r.a)
          break label726;
        i1 = 5;
        label382: addView((View)localObject, v.d(-2, -2, i1 | 0x30));
        ((TextView)localObject).setOnClickListener(new View.OnClickListener(ae.this)
        {
          public void onClick(View paramView)
          {
            if (ae.a.a(ae.a.this))
            {
              ae.e(ae.this);
              paramView = new g.cr();
              ConnectionsManager.a().a(paramView, new org.vidogram.tgnet.c()
              {
              }
              , 10);
              return;
            }
            ae.a.b(ae.a.this).setVisibility(0);
            ae.a.c(ae.a.this).setVisibility(0);
            org.vidogram.messenger.a.b(ae.a.d(ae.a.this));
            ae.a(ae.this, r.a("RestorePasswordNoEmailTitle", 2131231748), r.a("RestorePasswordNoEmailText", 2131231747));
          }
        });
        this.d = new TextView(localContext);
        localObject = this.d;
        if (!r.a)
          break label731;
        i1 = 5;
        label439: ((TextView)localObject).setGravity(i1 | 0x30);
        this.d.setTextColor(-39322);
        this.d.setVisibility(8);
        this.d.setText(r.a("ResetMyAccount", 2131231737));
        this.d.setTypeface(org.vidogram.messenger.a.a("fonts/rmedium.ttf"));
        this.d.setTextSize(1, 14.0F);
        this.d.setLineSpacing(org.vidogram.messenger.a.a(2.0F), 1.0F);
        this.d.setPadding(0, org.vidogram.messenger.a.a(14.0F), 0, 0);
        localObject = this.d;
        if (!r.a)
          break label736;
        i1 = 5;
        label544: addView((View)localObject, v.b(-2, -2, i1 | 0x30, 0, 34, 0, 0));
        this.d.setOnClickListener(new View.OnClickListener(ae.this)
        {
          public void onClick(View paramView)
          {
            paramView = new AlertDialog.Builder(ae.this.l());
            paramView.setMessage(r.a("ResetMyAccountWarningText", 2131231741));
            paramView.setTitle(r.a("ResetMyAccountWarning", 2131231739));
            paramView.setPositiveButton(r.a("ResetMyAccountWarningReset", 2131231740), new DialogInterface.OnClickListener()
            {
              public void onClick(DialogInterface paramDialogInterface, int paramInt)
              {
                ae.e(ae.this);
                paramDialogInterface = new g.bk();
                paramDialogInterface.c = "Forgot password";
                ConnectionsManager.a().a(paramDialogInterface, new org.vidogram.tgnet.c()
                {
                }
                , 10);
              }
            });
            paramView.setNegativeButton(r.a("Cancel", 2131230943), null);
            ae.this.b(paramView.create());
          }
        });
        this.e = new TextView(localContext);
        this$1 = this.e;
        if (!r.a)
          break label741;
        i1 = 5;
        label607: ae.this.setGravity(i1 | 0x30);
        this.e.setVisibility(8);
        this.e.setTextColor(-9079435);
        this.e.setText(r.a("ResetMyAccountText", 2131231738));
        this.e.setTextSize(1, 14.0F);
        this.e.setLineSpacing(org.vidogram.messenger.a.a(2.0F), 1.0F);
        this$1 = this.e;
        if (!r.a)
          break label746;
      }
      label711: label716: label721: label726: label731: label736: label741: label746: for (int i1 = 5; ; i1 = 3)
      {
        addView(ae.this, v.b(-2, -2, i1 | 0x30, 0, 7, 0, 14));
        return;
        i1 = 3;
        break;
        i1 = 3;
        break label107;
        i1 = 3;
        break label254;
        i1 = 3;
        break label314;
        i1 = 3;
        break label382;
        i1 = 3;
        break label439;
        i1 = 3;
        break label544;
        i1 = 3;
        break label607;
      }
    }

    private void a(boolean paramBoolean)
    {
      if (ae.this.l() == null)
        return;
      Vibrator localVibrator = (Vibrator)ae.this.l().getSystemService("vibrator");
      if (localVibrator != null)
        localVibrator.vibrate(200L);
      if (paramBoolean)
        this.b.setText("");
      org.vidogram.messenger.a.a(this.c, 2.0F, 0);
    }

    public void a()
    {
      if (this.g)
        return;
      Object localObject2 = this.b.getText().toString();
      if (((String)localObject2).length() == 0)
      {
        a(false);
        return;
      }
      this.g = true;
      Object localObject1 = null;
      try
      {
        localObject2 = ((String)localObject2).getBytes("UTF-8");
        localObject1 = localObject2;
        ae.e(ae.this);
        localObject2 = new byte[this.h.length * 2 + localObject1.length];
        System.arraycopy(this.h, 0, localObject2, 0, this.h.length);
        System.arraycopy(localObject1, 0, localObject2, this.h.length, localObject1.length);
        System.arraycopy(this.h, 0, localObject2, localObject2.length - this.h.length, this.h.length);
        localObject1 = new g.co();
        ((g.co)localObject1).c = Utilities.b(localObject2, 0, localObject2.length);
        ConnectionsManager.a().a((f)localObject1, new org.vidogram.tgnet.c()
        {
        }
        , 10);
        return;
      }
      catch (Exception localException)
      {
        while (true)
          n.a("tmessages", localException);
      }
    }

    public void a(Bundle paramBundle)
    {
      String str = this.b.getText().toString();
      if (str.length() != 0)
        paramBundle.putString("passview_code", str);
      if (this.f != null)
        paramBundle.putBundle("passview_params", this.f);
    }

    public void b(Bundle paramBundle)
    {
      this.f = paramBundle.getBundle("passview_params");
      if (this.f != null)
        setParams(this.f);
      paramBundle = paramBundle.getString("passview_code");
      if (paramBundle != null)
        this.b.setText(paramBundle);
    }

    public void c()
    {
      super.c();
      if (this.b != null)
      {
        this.b.requestFocus();
        this.b.setSelection(this.b.length());
        org.vidogram.messenger.a.a(this.b);
      }
    }

    public void d()
    {
      this.f = null;
    }

    public boolean e()
    {
      return true;
    }

    public String getHeaderName()
    {
      return r.a("LoginPassword", 2131231405);
    }

    public void setParams(Bundle paramBundle)
    {
      boolean bool = true;
      if (paramBundle == null)
        return;
      if (paramBundle.isEmpty())
      {
        this.d.setVisibility(0);
        this.e.setVisibility(0);
        org.vidogram.messenger.a.b(this.b);
        return;
      }
      this.d.setVisibility(8);
      this.e.setVisibility(8);
      this.b.setText("");
      this.f = paramBundle;
      this.h = Utilities.d(this.f.getString("current_salt"));
      this.i = this.f.getString("hint");
      if (this.f.getInt("has_recovery") == 1);
      while (true)
      {
        this.k = bool;
        this.j = this.f.getString("email_unconfirmed_pattern");
        this.l = paramBundle.getString("phoneFormated");
        this.m = paramBundle.getString("phoneHash");
        this.n = paramBundle.getString("code");
        if ((this.i == null) || (this.i.length() <= 0))
          break;
        this.b.setHint(this.i);
        return;
        bool = false;
      }
      this.b.setHint(r.a("LoginPassword", 2131231405));
    }
  }

  public class b extends bi
  {
    private EditText b;
    private TextView c;
    private TextView d;
    private Bundle e;
    private boolean f;
    private String g;

    public b(Context arg2)
    {
      super();
      setOrientation(1);
      this.c = new TextView((Context)localObject1);
      this.c.setTextColor(-9079435);
      this.c.setTextSize(1, 14.0F);
      Object localObject2 = this.c;
      if (r.a)
      {
        i = 5;
        ((TextView)localObject2).setGravity(i);
        this.c.setLineSpacing(org.vidogram.messenger.a.a(2.0F), 1.0F);
        this.c.setText(r.a("RestoreEmailSentInfo", 2131231744));
        localObject2 = this.c;
        if (!r.a)
          break label434;
        i = 5;
        label110: addView((View)localObject2, v.d(-2, -2, i));
        this.b = new EditText((Context)localObject1);
        this.b.setTextColor(-14606047);
        org.vidogram.messenger.a.a(this.b);
        this.b.setHintTextColor(-6842473);
        this.b.setHint(r.a("PasswordCode", 2131231648));
        this.b.setImeOptions(268435461);
        this.b.setTextSize(1, 18.0F);
        this.b.setMaxLines(1);
        this.b.setPadding(0, 0, 0, 0);
        this.b.setInputType(3);
        this.b.setTransformationMethod(PasswordTransformationMethod.getInstance());
        this.b.setTypeface(Typeface.DEFAULT);
        localObject2 = this.b;
        if (!r.a)
          break label439;
        i = 5;
        label255: ((EditText)localObject2).setGravity(i);
        addView(this.b, v.b(-1, 36, 1, 0, 20, 0, 0));
        this.b.setOnEditorActionListener(new TextView.OnEditorActionListener(ae.this)
        {
          public boolean onEditorAction(TextView paramTextView, int paramInt, KeyEvent paramKeyEvent)
          {
            if (paramInt == 5)
            {
              ae.b.this.a();
              return true;
            }
            return false;
          }
        });
        this.d = new TextView((Context)localObject1);
        localObject1 = this.d;
        if (!r.a)
          break label444;
        i = 5;
        label322: ((TextView)localObject1).setGravity(i | 0x50);
        this.d.setTextColor(-11697229);
        this.d.setTextSize(1, 14.0F);
        this.d.setLineSpacing(org.vidogram.messenger.a.a(2.0F), 1.0F);
        this.d.setPadding(0, org.vidogram.messenger.a.a(14.0F), 0, 0);
        localObject1 = this.d;
        if (!r.a)
          break label449;
      }
      label434: label439: label444: label449: for (int i = j; ; i = 3)
      {
        addView((View)localObject1, v.b(-2, -2, i | 0x50, 0, 0, 0, 14));
        this.d.setOnClickListener(new View.OnClickListener(ae.this)
        {
          public void onClick(View paramView)
          {
            paramView = new AlertDialog.Builder(ae.this.l());
            paramView.setMessage(r.a("RestoreEmailTroubleText", 2131231746));
            paramView.setTitle(r.a("RestorePasswordNoEmailTitle", 2131231748));
            paramView.setPositiveButton(r.a("OK", 2131231604), new DialogInterface.OnClickListener()
            {
              public void onClick(DialogInterface paramDialogInterface, int paramInt)
              {
                ae.this.a(6, true, new Bundle(), true);
              }
            });
            paramView = ae.this.b(paramView.create());
            if (paramView != null)
            {
              paramView.setCanceledOnTouchOutside(false);
              paramView.setCancelable(false);
            }
          }
        });
        return;
        i = 3;
        break;
        i = 3;
        break label110;
        i = 3;
        break label255;
        i = 3;
        break label322;
      }
    }

    private void a(boolean paramBoolean)
    {
      if (ae.this.l() == null)
        return;
      Vibrator localVibrator = (Vibrator)ae.this.l().getSystemService("vibrator");
      if (localVibrator != null)
        localVibrator.vibrate(200L);
      if (paramBoolean)
        this.b.setText("");
      org.vidogram.messenger.a.a(this.c, 2.0F, 0);
    }

    public void a()
    {
      if (this.f)
        return;
      if (this.b.getText().toString().length() == 0)
      {
        a(false);
        return;
      }
      this.f = true;
      String str = this.b.getText().toString();
      if (str.length() == 0)
      {
        a(false);
        return;
      }
      ae.e(ae.this);
      g.cq localcq = new g.cq();
      localcq.c = str;
      ConnectionsManager.a().a(localcq, new org.vidogram.tgnet.c()
      {
      }
      , 10);
    }

    public void a(Bundle paramBundle)
    {
      String str = this.b.getText().toString();
      if ((str != null) && (str.length() != 0))
        paramBundle.putString("recoveryview_code", str);
      if (this.e != null)
        paramBundle.putBundle("recoveryview_params", this.e);
    }

    public void b(Bundle paramBundle)
    {
      this.e = paramBundle.getBundle("recoveryview_params");
      if (this.e != null)
        setParams(this.e);
      paramBundle = paramBundle.getString("recoveryview_code");
      if (paramBundle != null)
        this.b.setText(paramBundle);
    }

    public void c()
    {
      super.c();
      if (this.b != null)
      {
        this.b.requestFocus();
        this.b.setSelection(this.b.length());
      }
    }

    public void d()
    {
      this.e = null;
    }

    public boolean e()
    {
      return true;
    }

    public String getHeaderName()
    {
      return r.a("LoginPassword", 2131231405);
    }

    public void setParams(Bundle paramBundle)
    {
      if (paramBundle == null)
        return;
      this.b.setText("");
      this.e = paramBundle;
      this.g = this.e.getString("email_unconfirmed_pattern");
      this.d.setText(r.a("RestoreEmailTrouble", 2131231745, new Object[] { this.g }));
      org.vidogram.messenger.a.a(this.b);
      this.b.requestFocus();
    }
  }

  public class c extends bi
  {
    private EditText b;
    private EditText c;
    private String d;
    private String e;
    private String f;
    private Bundle g;
    private boolean h = false;

    public c(Context arg2)
    {
      super();
      setOrientation(1);
      Object localObject2 = new TextView((Context)localObject1);
      ((TextView)localObject2).setText(r.a("RegisterText", 2131231711));
      ((TextView)localObject2).setTextColor(-9079435);
      if (r.a)
      {
        i = 5;
        ((TextView)localObject2).setGravity(i);
        ((TextView)localObject2).setTextSize(1, 14.0F);
        if (!r.a)
          break label475;
        i = 5;
        label79: addView((View)localObject2, v.b(-2, -2, i, 0, 8, 0, 0));
        this.b = new EditText((Context)localObject1);
        this.b.setHintTextColor(-6842473);
        this.b.setTextColor(-14606047);
        org.vidogram.messenger.a.a(this.b);
        this.b.setHint(r.a("FirstName", 2131231198));
        this.b.setImeOptions(268435461);
        this.b.setTextSize(1, 18.0F);
        this.b.setMaxLines(1);
        this.b.setInputType(8192);
        addView(this.b, v.a(-1, 36, 0.0F, 26.0F, 0.0F, 0.0F));
        this.b.setOnEditorActionListener(new TextView.OnEditorActionListener(ae.this)
        {
          public boolean onEditorAction(TextView paramTextView, int paramInt, KeyEvent paramKeyEvent)
          {
            if (paramInt == 5)
            {
              ae.c.a(ae.c.this).requestFocus();
              return true;
            }
            return false;
          }
        });
        this.c = new EditText((Context)localObject1);
        this.c.setHint(r.a("LastName", 2131231348));
        this.c.setHintTextColor(-6842473);
        this.c.setTextColor(-14606047);
        org.vidogram.messenger.a.a(this.c);
        this.c.setImeOptions(268435461);
        this.c.setTextSize(1, 18.0F);
        this.c.setMaxLines(1);
        this.c.setInputType(8192);
        addView(this.c, v.a(-1, 36, 0.0F, 10.0F, 0.0F, 0.0F));
        localObject2 = new LinearLayout((Context)localObject1);
        ((LinearLayout)localObject2).setGravity(80);
        addView((View)localObject2, v.b(-1, -1));
        localObject1 = new TextView((Context)localObject1);
        ((TextView)localObject1).setText(r.a("CancelRegistration", 2131230948));
        if (!r.a)
          break label480;
        i = 5;
        label384: ((TextView)localObject1).setGravity(i | 0x1);
        ((TextView)localObject1).setTextColor(-11697229);
        ((TextView)localObject1).setTextSize(1, 14.0F);
        ((TextView)localObject1).setLineSpacing(org.vidogram.messenger.a.a(2.0F), 1.0F);
        ((TextView)localObject1).setPadding(0, org.vidogram.messenger.a.a(24.0F), 0, 0);
        if (!r.a)
          break label485;
      }
      label475: label480: label485: for (int i = 5; ; i = 3)
      {
        ((LinearLayout)localObject2).addView((View)localObject1, v.b(-2, -2, i | 0x50, 0, 0, 0, 10));
        ((TextView)localObject1).setOnClickListener(new View.OnClickListener(ae.this)
        {
          public void onClick(View paramView)
          {
            paramView = new AlertDialog.Builder(ae.this.l());
            paramView.setTitle(r.a("AppName", 2131230856));
            paramView.setMessage(r.a("AreYouSureRegistration", 2131230882));
            paramView.setPositiveButton(r.a("OK", 2131231604), new DialogInterface.OnClickListener()
            {
              public void onClick(DialogInterface paramDialogInterface, int paramInt)
              {
                ae.c.this.d();
                ae.this.a(0, true, null, true);
              }
            });
            paramView.setNegativeButton(r.a("Cancel", 2131230943), null);
            ae.this.b(paramView.create());
          }
        });
        return;
        i = 3;
        break;
        i = 3;
        break label79;
        i = 3;
        break label384;
      }
    }

    public void a()
    {
      if (this.h)
        return;
      this.h = true;
      g.cw localcw = new g.cw();
      localcw.e = this.f;
      localcw.d = this.e;
      localcw.c = this.d;
      localcw.f = this.b.getText().toString();
      localcw.g = this.c.getText().toString();
      ae.e(ae.this);
      ConnectionsManager.a().a(localcw, new org.vidogram.tgnet.c()
      {
      }
      , 10);
    }

    public void a(Bundle paramBundle)
    {
      String str = this.b.getText().toString();
      if (str.length() != 0)
        paramBundle.putString("registerview_first", str);
      str = this.c.getText().toString();
      if (str.length() != 0)
        paramBundle.putString("registerview_last", str);
      if (this.g != null)
        paramBundle.putBundle("registerview_params", this.g);
    }

    public void b(Bundle paramBundle)
    {
      this.g = paramBundle.getBundle("registerview_params");
      if (this.g != null)
        setParams(this.g);
      String str = paramBundle.getString("registerview_first");
      if (str != null)
        this.b.setText(str);
      paramBundle = paramBundle.getString("registerview_last");
      if (paramBundle != null)
        this.c.setText(paramBundle);
    }

    public void c()
    {
      super.c();
      if (this.b != null)
      {
        this.b.requestFocus();
        this.b.setSelection(this.b.length());
      }
    }

    public void d()
    {
      this.g = null;
    }

    public String getHeaderName()
    {
      return r.a("YourName", 2131231988);
    }

    public void setParams(Bundle paramBundle)
    {
      if (paramBundle == null)
        return;
      this.b.setText("");
      this.c.setText("");
      this.d = paramBundle.getString("phoneFormated");
      this.e = paramBundle.getString("phoneHash");
      this.f = paramBundle.getString("code");
      this.g = paramBundle;
    }
  }

  public class d extends bi
  {
    private TextView b;
    private TextView c;
    private TextView d;
    private Runnable e;
    private Bundle f;
    private String g;
    private String h;
    private String i;
    private int j;
    private int k;

    public d(Context arg2)
    {
      super();
      setOrientation(1);
      this.b = new TextView((Context)localObject);
      this.b.setTextColor(-9079435);
      this.b.setTextSize(1, 14.0F);
      TextView localTextView = this.b;
      if (r.a)
      {
        m = 5;
        localTextView.setGravity(m);
        this.b.setLineSpacing(org.vidogram.messenger.a.a(2.0F), 1.0F);
        localTextView = this.b;
        if (!r.a)
          break label461;
        m = 5;
        label96: addView(localTextView, v.d(-2, -2, m));
        localTextView = new TextView((Context)localObject);
        if (!r.a)
          break label466;
        m = 5;
        label128: localTextView.setGravity(m | 0x30);
        localTextView.setTextColor(-9079435);
        localTextView.setText(r.a("ResetAccountStatus", 2131231735));
        localTextView.setTextSize(1, 14.0F);
        localTextView.setLineSpacing(org.vidogram.messenger.a.a(2.0F), 1.0F);
        if (!r.a)
          break label471;
        m = 5;
        label183: addView(localTextView, v.b(-2, -2, m | 0x30, 0, 24, 0, 0));
        this.d = new TextView((Context)localObject);
        localTextView = this.d;
        if (!r.a)
          break label476;
        m = 5;
        label231: localTextView.setGravity(m | 0x30);
        this.d.setTextColor(-9079435);
        this.d.setTextSize(1, 14.0F);
        this.d.setLineSpacing(org.vidogram.messenger.a.a(2.0F), 1.0F);
        localTextView = this.d;
        if (!r.a)
          break label481;
        m = 5;
        label286: addView(localTextView, v.b(-2, -2, m | 0x30, 0, 2, 0, 0));
        this.c = new TextView((Context)localObject);
        localObject = this.c;
        if (!r.a)
          break label486;
        m = 5;
        label332: ((TextView)localObject).setGravity(m | 0x30);
        this.c.setText(r.a("ResetAccountButton", 2131231732));
        this.c.setTypeface(org.vidogram.messenger.a.a("fonts/rmedium.ttf"));
        this.c.setTextSize(1, 14.0F);
        this.c.setLineSpacing(org.vidogram.messenger.a.a(2.0F), 1.0F);
        this.c.setPadding(0, org.vidogram.messenger.a.a(14.0F), 0, 0);
        localObject = this.c;
        if (!r.a)
          break label491;
      }
      label461: label466: label471: label476: label481: label486: label491: for (int m = n; ; m = 3)
      {
        addView((View)localObject, v.b(-2, -2, m | 0x30, 0, 7, 0, 0));
        this.c.setOnClickListener(new View.OnClickListener(ae.this)
        {
          public void onClick(View paramView)
          {
            if (Math.abs(ConnectionsManager.a().b() - ae.d.a(ae.d.this)) < ae.d.b(ae.d.this))
              return;
            paramView = new AlertDialog.Builder(ae.this.l());
            paramView.setMessage(r.a("ResetMyAccountWarningText", 2131231741));
            paramView.setTitle(r.a("ResetMyAccountWarning", 2131231739));
            paramView.setPositiveButton(r.a("ResetMyAccountWarningReset", 2131231740), new DialogInterface.OnClickListener()
            {
              public void onClick(DialogInterface paramDialogInterface, int paramInt)
              {
                ae.e(ae.this);
                paramDialogInterface = new g.bk();
                paramDialogInterface.c = "Forgot password";
                ConnectionsManager.a().a(paramDialogInterface, new org.vidogram.tgnet.c()
                {
                }
                , 10);
              }
            });
            paramView.setNegativeButton(r.a("Cancel", 2131230943), null);
            ae.this.b(paramView.create());
          }
        });
        return;
        m = 3;
        break;
        m = 3;
        break label96;
        m = 3;
        break label128;
        m = 3;
        break label183;
        m = 3;
        break label231;
        m = 3;
        break label286;
        m = 3;
        break label332;
      }
    }

    private void f()
    {
      int m = Math.max(0, this.k - (ConnectionsManager.a().b() - this.j));
      int n = m / 86400;
      int i1 = (m - n * 86400) / 3600;
      int i2 = (m - n * 86400 - i1 * 3600) / 60;
      if (n != 0)
        this.d.setText(org.vidogram.messenger.a.b(r.b("DaysBold", n) + " " + r.b("HoursBold", i1) + " " + r.b("MinutesBold", i2)));
      while (m > 0)
      {
        this.c.setTextColor(-2004318072);
        return;
        this.d.setText(org.vidogram.messenger.a.b(r.b("HoursBold", i1) + " " + r.b("MinutesBold", i2) + " " + r.b("SecondsBold", m % 60)));
      }
      this.c.setTextColor(-39322);
    }

    public void a(Bundle paramBundle)
    {
      if (this.f != null)
        paramBundle.putBundle("resetview_params", this.f);
    }

    public void b(Bundle paramBundle)
    {
      this.f = paramBundle.getBundle("resetview_params");
      if (this.f != null)
        setParams(this.f);
    }

    public void d()
    {
      org.vidogram.messenger.a.b(this.e);
      this.e = null;
      this.f = null;
    }

    public boolean e()
    {
      return true;
    }

    public String getHeaderName()
    {
      return r.a("ResetAccount", 2131231731);
    }

    public void setParams(Bundle paramBundle)
    {
      if (paramBundle == null)
        return;
      this.f = paramBundle;
      this.g = paramBundle.getString("phoneFormated");
      this.h = paramBundle.getString("phoneHash");
      this.i = paramBundle.getString("code");
      this.j = paramBundle.getInt("startTime");
      this.k = paramBundle.getInt("waitTime");
      this.b.setText(org.vidogram.messenger.a.b(r.a("ResetAccountInfo", 2131231734, new Object[] { b.a().e("+" + this.g) })));
      f();
      this.e = new Runnable()
      {
        public void run()
        {
          if (ae.d.c(ae.d.this) != this)
            return;
          ae.d.d(ae.d.this);
          org.vidogram.messenger.a.a(ae.d.c(ae.d.this), 1000L);
        }
      };
      org.vidogram.messenger.a.a(this.e, 1000L);
    }
  }

  public class e extends bi
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

    public e(Context paramInt, int arg3)
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
        this.f.addTextChangedListener(new TextWatcher(ae.this)
        {
          public void afterTextChanged(Editable paramEditable)
          {
            if (ae.e.b(ae.e.this));
            do
              return;
            while ((ae.e.c(ae.e.this) == 0) || (ae.e.d(ae.e.this).length() != ae.e.c(ae.e.this)));
            ae.e.this.a();
          }

          public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
          {
          }

          public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
          {
          }
        });
        this.f.setOnEditorActionListener(new TextView.OnEditorActionListener(ae.this)
        {
          public boolean onEditorAction(TextView paramTextView, int paramInt, KeyEvent paramKeyEvent)
          {
            if (paramInt == 5)
            {
              ae.e.this.a();
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
        this.i.setOnClickListener(new View.OnClickListener(ae.this)
        {
          public void onClick(View paramView)
          {
            if (ae.e.e(ae.e.this))
              return;
            if ((ae.e.f(ae.e.this) != 0) && (ae.e.f(ae.e.this) != 4))
            {
              ae.e.g(ae.e.this);
              return;
            }
            try
            {
              paramView = ApplicationLoader.a.getPackageManager().getPackageInfo(ApplicationLoader.a.getPackageName(), 0);
              paramView = String.format(Locale.US, "%s (%d)", new Object[] { paramView.versionName, Integer.valueOf(paramView.versionCode) });
              Intent localIntent = new Intent("android.intent.action.SEND");
              localIntent.setType("message/rfc822");
              localIntent.putExtra("android.intent.extra.EMAIL", new String[] { "sms@stel.com" });
              localIntent.putExtra("android.intent.extra.SUBJECT", "Android registration/login issue " + paramView + " " + ae.e.h(ae.e.this));
              localIntent.putExtra("android.intent.extra.TEXT", "Phone: " + ae.e.i(ae.e.this) + "\nApp version: " + paramView + "\nOS version: SDK " + Build.VERSION.SDK_INT + "\nDevice Name: " + Build.MANUFACTURER + Build.MODEL + "\nLocale: " + Locale.getDefault() + "\nError: " + ae.e.j(ae.e.this));
              ae.e.this.getContext().startActivity(Intent.createChooser(localIntent, "Send email..."));
              return;
            }
            catch (Exception paramView)
            {
              ae.a(ae.this, r.a("AppName", 2131230856), r.a("NoMailInstalled", 2131231495));
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
        paramInt.setOnClickListener(new View.OnClickListener(ae.this)
        {
          public void onClick(View paramView)
          {
            paramView = new g.cn();
            paramView.c = ae.e.i(ae.e.this);
            paramView.d = ae.e.k(ae.e.this);
            ConnectionsManager.a().a(paramView, new org.vidogram.tgnet.c()
            {
            }
            , 10);
            ae.e.this.d();
            ae.this.a(0, true, null, true);
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
      ae.e(ae.this);
      g.cs localcs = new g.cs();
      localcs.c = this.d;
      localcs.d = this.c;
      ConnectionsManager.a().a(localcs, new org.vidogram.tgnet.c(localBundle)
      {
      }
      , 10);
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
          double d2 = ae.e.l(ae.e.this);
          ae.e.a(ae.e.this, (int)(ae.e.m(ae.e.this) - (d1 - d2)));
          ae.e.a(ae.e.this, d1);
          org.vidogram.messenger.a.a(new Runnable()
          {
            public void run()
            {
              if (ae.e.m(ae.e.this) <= 1000)
              {
                ae.e.n(ae.e.this).setVisibility(0);
                ae.e.o(ae.e.this);
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
          if (ae.e.p(ae.e.this) == null)
            return;
          double d1 = System.currentTimeMillis();
          double d2 = ae.e.q(ae.e.this);
          ae.e.b(ae.e.this, (int)(ae.e.r(ae.e.this) - (d1 - d2)));
          ae.e.b(ae.e.this, d1);
          org.vidogram.messenger.a.a(new Runnable()
          {
            public void run()
            {
              int i;
              int j;
              if (ae.e.r(ae.e.this) >= 1000)
              {
                i = ae.e.r(ae.e.this) / 1000 / 60;
                j = ae.e.r(ae.e.this) / 1000 - i * 60;
                if ((ae.e.f(ae.e.this) == 4) || (ae.e.f(ae.e.this) == 3))
                  ae.e.s(ae.e.this).setText(r.a("CallText", 2131230941, new Object[] { Integer.valueOf(i), Integer.valueOf(j) }));
              }
              do
              {
                do
                {
                  while (true)
                  {
                    if (ae.e.t(ae.e.this) != null)
                      ae.e.t(ae.e.this).a(1.0F - ae.e.r(ae.e.this) / ae.e.u(ae.e.this));
                    return;
                    if (ae.e.f(ae.e.this) != 2)
                      continue;
                    ae.e.s(ae.e.this).setText(r.a("SmsText", 2131231860, new Object[] { Integer.valueOf(i), Integer.valueOf(j) }));
                  }
                  if (ae.e.t(ae.e.this) != null)
                    ae.e.t(ae.e.this).a(1.0F);
                  ae.e.v(ae.e.this);
                  if (ae.e.w(ae.e.this) != 3)
                    continue;
                  org.vidogram.messenger.a.b(false);
                  y.a().b(this, y.as);
                  ae.e.a(ae.e.this, false);
                  ae.e.o(ae.e.this);
                  ae.e.g(ae.e.this);
                  return;
                }
                while (ae.e.w(ae.e.this) != 2);
                if (ae.e.f(ae.e.this) != 4)
                  continue;
                ae.e.s(ae.e.this).setText(r.a("Calling", 2131230942));
                ae.e.x(ae.e.this);
                g.cs localcs = new g.cs();
                localcs.c = ae.e.i(ae.e.this);
                localcs.d = ae.e.k(ae.e.this);
                ConnectionsManager.a().a(localcs, new org.vidogram.tgnet.c()
                {
                }
                , 10);
                return;
              }
              while (ae.e.f(ae.e.this) != 3);
              org.vidogram.messenger.a.a(false);
              y.a().b(this, y.ar);
              ae.e.a(ae.e.this, false);
              ae.e.o(ae.e.this);
              ae.e.g(ae.e.this);
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
        g.cv localcv = new g.cv();
        localcv.c = this.d;
        localcv.e = this.f.getText().toString();
        localcv.d = this.c;
        j();
        ae.e(ae.this);
        ConnectionsManager.a().a(localcv, new org.vidogram.tgnet.c(localcv)
        {
        }
        , 10);
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

    public void a(Bundle paramBundle)
    {
      String str = this.f.getText().toString();
      if (str.length() != 0)
        paramBundle.putString("smsview_code_" + this.x, str);
      if (this.j != null)
        paramBundle.putBundle("smsview_params_" + this.x, this.j);
      if (this.p != 0)
        paramBundle.putInt("time", this.p);
      if (this.n != 0)
        paramBundle.putInt("open", this.n);
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

    public void b(Bundle paramBundle)
    {
      this.j = paramBundle.getBundle("smsview_params_" + this.x);
      if (this.j != null)
        setParams(this.j);
      String str = paramBundle.getString("smsview_code_" + this.x);
      if (str != null)
        this.f.setText(str);
      int i1 = paramBundle.getInt("time");
      if (i1 != 0)
        this.p = i1;
      i1 = paramBundle.getInt("open");
      if (i1 != 0)
        this.n = i1;
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
        str = b.a().e(this.b);
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

  public class f extends bi
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

    public f(Context arg2)
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
        this.d.setOnClickListener(new View.OnClickListener(ae.this)
        {
          public void onClick(View paramView)
          {
            paramView = new u();
            paramView.a(new u.a()
            {
              public void a(String paramString)
              {
                ae.f.this.a(paramString);
                org.vidogram.messenger.a.a(new Runnable()
                {
                  public void run()
                  {
                    org.vidogram.messenger.a.a(ae.f.a(ae.f.this));
                  }
                }
                , 300L);
                ae.f.a(ae.f.this).requestFocus();
                ae.f.a(ae.f.this).setSelection(ae.f.a(ae.f.this).length());
              }
            });
            ae.this.a(paramView);
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
        this.b.addTextChangedListener(new TextWatcher(ae.this)
        {
          public void afterTextChanged(Editable paramEditable)
          {
            Object localObject3 = null;
            if (ae.f.b(ae.f.this))
              return;
            ae.f.a(ae.f.this, true);
            paramEditable = b.b(ae.f.c(ae.f.this).getText().toString());
            ae.f.c(ae.f.this).setText(paramEditable);
            if (paramEditable.length() == 0)
            {
              ae.f.d(ae.f.this).setText(r.a("ChooseCountry", 2131231062));
              ae.f.a(ae.f.this).setHintText(null);
              ae.f.a(ae.f.this, 1);
              ae.f.a(ae.f.this, false);
              return;
            }
            int i;
            label124: Object localObject1;
            Object localObject2;
            label216: Object localObject4;
            if (paramEditable.length() > 4)
            {
              ae.f.a(ae.f.this, true);
              i = 4;
              if (i >= 1)
              {
                localObject1 = paramEditable.substring(0, i);
                if ((String)ae.f.e(ae.f.this).get(localObject1) != null)
                {
                  localObject2 = paramEditable.substring(i, paramEditable.length()) + ae.f.a(ae.f.this).getText().toString();
                  ae.f.c(ae.f.this).setText((CharSequence)localObject1);
                  i = 1;
                  paramEditable = (Editable)localObject1;
                  localObject1 = localObject2;
                  localObject2 = paramEditable;
                  if (i == 0)
                  {
                    ae.f.a(ae.f.this, true);
                    localObject1 = paramEditable.substring(1, paramEditable.length()) + ae.f.a(ae.f.this).getText().toString();
                    localObject4 = ae.f.c(ae.f.this);
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
              localObject2 = (String)ae.f.e(ae.f.this).get(localObject1);
              if (localObject2 != null)
              {
                int j = ae.f.f(ae.f.this).indexOf(localObject2);
                if (j != -1)
                {
                  ae.f.b(ae.f.this, true);
                  ae.f.d(ae.f.this).setText((CharSequence)ae.f.f(ae.f.this).get(j));
                  localObject4 = (String)ae.f.g(ae.f.this).get(localObject1);
                  localObject2 = ae.f.a(ae.f.this);
                  localObject1 = localObject3;
                  if (localObject4 != null)
                    localObject1 = ((String)localObject4).replace('X', '–');
                  ((t)localObject2).setHintText((String)localObject1);
                  ae.f.a(ae.f.this, 0);
                }
              }
              while (true)
              {
                if (i == 0)
                  ae.f.c(ae.f.this).setSelection(ae.f.c(ae.f.this).getText().length());
                if (paramEditable == null)
                  break;
                ae.f.a(ae.f.this).requestFocus();
                ae.f.a(ae.f.this).setText(paramEditable);
                ae.f.a(ae.f.this).setSelection(ae.f.a(ae.f.this).length());
                break;
                i -= 1;
                break label124;
                ae.f.d(ae.f.this).setText(r.a("WrongCountry", 2131231966));
                ae.f.a(ae.f.this).setHintText(null);
                ae.f.a(ae.f.this, 2);
                continue;
                ae.f.d(ae.f.this).setText(r.a("WrongCountry", 2131231966));
                ae.f.a(ae.f.this).setHintText(null);
                ae.f.a(ae.f.this, 2);
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
        this.b.setOnEditorActionListener(new TextView.OnEditorActionListener(ae.this)
        {
          public boolean onEditorAction(TextView paramTextView, int paramInt, KeyEvent paramKeyEvent)
          {
            if (paramInt == 5)
            {
              ae.f.a(ae.f.this).requestFocus();
              ae.f.a(ae.f.this).setSelection(ae.f.a(ae.f.this).length());
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
        this.c.addTextChangedListener(new TextWatcher(ae.this)
        {
          private int c = -1;
          private int d;

          public void afterTextChanged(Editable paramEditable)
          {
            if (ae.f.h(ae.f.this))
              return;
            int j = ae.f.a(ae.f.this).getSelectionStart();
            Object localObject = ae.f.a(ae.f.this).getText().toString();
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
            ae.f.c(ae.f.this, true);
            paramEditable = ae.f.a(ae.f.this).getHintText();
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
            ae.f.a(ae.f.this).setText((CharSequence)localObject);
            if (j >= 0)
            {
              paramEditable = ae.f.a(ae.f.this);
              if (j > ae.f.a(ae.f.this).length())
                break label404;
            }
            while (true)
            {
              paramEditable.setSelection(j);
              ae.f.a(ae.f.this).a();
              ae.f.c(ae.f.this, false);
              return;
              label404: j = ae.f.a(ae.f.this).length();
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
        this.c.setOnEditorActionListener(new TextView.OnEditorActionListener(ae.this)
        {
          public boolean onEditorAction(TextView paramTextView, int paramInt, KeyEvent paramKeyEvent)
          {
            if (paramInt == 5)
            {
              ae.f.this.a();
              return true;
            }
            return false;
          }
        });
        localObject1 = new TextView((Context)localObject1);
        ((TextView)localObject1).setText(r.a("StartText", 2131231869));
        ((TextView)localObject1).setTextColor(-9079435);
        ((TextView)localObject1).setTextSize(1, 14.0F);
        if (r.a)
        {
          n = 5;
          label709: ((TextView)localObject1).setGravity(n);
          ((TextView)localObject1).setLineSpacing(org.vidogram.messenger.a.a(2.0F), 1.0F);
          if (!r.a)
            break label1078;
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
          Collections.sort(this.f, new Comparator(ae.this)
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
          if (ae.this != null)
          {
            this$1 = ae.this.getSimCountryIso().toUpperCase();
            if (ae.this != null)
            {
              this$1 = (String)((HashMap)localObject1).get(ae.this);
              if ((ae.this != null) && (this.f.indexOf(ae.this) != -1))
              {
                this.b.setText((CharSequence)this.g.get(ae.this));
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
              break label1104;
            this.c.requestFocus();
            this.c.setSelection(this.c.length());
            return;
            n = 3;
            continue;
            n = 3;
            break label709;
            label1078: n = 3;
            break label732;
            localException.close();
          }
        }
        catch (Exception this$1)
        {
          while (true)
          {
            n.a("tmessages", ae.this);
            this$1 = null;
          }
          label1104: this.b.requestFocus();
        }
      }
    }

    public void a()
    {
      if ((ae.this.l() == null) || (this.m))
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
        if (ae.this.l().checkSelfPermission("android.permission.READ_PHONE_STATE") != 0)
          break label356;
        n = 1;
        if (ae.this.l().checkSelfPermission("android.permission.RECEIVE_SMS") != 0)
          break label361;
        i2 = 1;
        label99: i3 = n;
        if (!ae.c(ae.this))
          break label448;
        ae.d(ae.this).clear();
        if (n == 0)
          ae.d(ae.this).add("android.permission.READ_PHONE_STATE");
        if (i2 == 0)
          ae.d(ae.this).add("android.permission.RECEIVE_SMS");
        i3 = n;
        if (ae.d(ae.this).isEmpty())
          break label448;
        localObject1 = ApplicationLoader.a.getSharedPreferences("mainconfig", 0);
        if ((!((SharedPreferences)localObject1).getBoolean("firstlogin", true)) && (!ae.this.l().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE")) && (!ae.this.l().shouldShowRequestPermissionRationale("android.permission.RECEIVE_SMS")))
          break label406;
        ((SharedPreferences)localObject1).edit().putBoolean("firstlogin", false).commit();
        localObject1 = new AlertDialog.Builder(ae.this.l());
        ((AlertDialog.Builder)localObject1).setTitle(r.a("AppName", 2131230856));
        ((AlertDialog.Builder)localObject1).setPositiveButton(r.a("OK", 2131231604), null);
        if (ae.d(ae.this).size() != 2)
          break label366;
        ((AlertDialog.Builder)localObject1).setMessage(r.a("AllowReadCallAndSms", 2131230836));
      }
      while (true)
      {
        ae.a(ae.this, ae.this.b(((AlertDialog.Builder)localObject1).create()));
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
      label406: ae.this.l().requestPermissions((String[])ae.d(ae.this).toArray(new String[ae.d(ae.this).size()]), 6);
      return;
      label445: int i3 = 1;
      label448: if (this.e == 1)
      {
        ae.a(ae.this, r.a("AppName", 2131230856), r.a("ChooseCountry", 2131231062));
        return;
      }
      if ((this.e == 2) && (!d.a) && (!this.b.getText().toString().equals("999")))
      {
        ae.a(ae.this, r.a("AppName", 2131230856), r.a("WrongCountry", 2131231966));
        return;
      }
      if (this.b.length() == 0)
      {
        ae.a(ae.this, r.a("AppName", 2131230856), r.a("InvalidPhoneNumber", 2131231318));
        return;
      }
      ConnectionsManager.a().d();
      Object localObject1 = new g.cu();
      String str = b.b("" + this.b.getText() + this.c.getText());
      ConnectionsManager.a().a(str);
      ((g.cu)localObject1).h = d.e;
      ((g.cu)localObject1).g = d.d;
      ((g.cu)localObject1).e = str;
      boolean bool;
      if ((i1 != 0) && (i3 != 0))
        bool = true;
      while (true)
      {
        ((g.cu)localObject1).d = bool;
        if (((g.cu)localObject1).d);
        try
        {
          localObject2 = ((TelephonyManager)localObject2).getLine1Number();
          if ((localObject2 != null) && (((String)localObject2).length() != 0))
          {
            if (str.contains((CharSequence)localObject2))
              break label972;
            if (((String)localObject2).contains(str))
            {
              break label972;
              ((g.cu)localObject1).f = bool;
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
              ((Bundle)localObject2).putString("ephone", "+" + b.b(this.b.getText().toString()) + " " + b.b(this.c.getText().toString()));
              ((Bundle)localObject2).putString("phoneFormated", str);
              this.m = true;
              ae.e(ae.this);
              ConnectionsManager.a().a((f)localObject1, new org.vidogram.tgnet.c((Bundle)localObject2, (g.cu)localObject1)
              {
              }
              , 27);
              return;
              bool = false;
              break;
              bool = false;
              continue;
              localException1 = localException1;
              ((g.cu)localObject1).d = false;
              n.a("tmessages", localException1);
            }
            catch (Exception localException2)
            {
              n.a("tmessages", localException2);
              localException1.putString("ephone", "+" + str);
              continue;
            }
            label972: bool = true;
          }
        }
      }
    }

    public void a(Bundle paramBundle)
    {
      String str = this.b.getText().toString();
      if (str.length() != 0)
        paramBundle.putString("phoneview_code", str);
      str = this.c.getText().toString();
      if (str.length() != 0)
        paramBundle.putString("phoneview_phone", str);
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

    public void b(Bundle paramBundle)
    {
      String str = paramBundle.getString("phoneview_code");
      if (str != null)
        this.b.setText(str);
      paramBundle = paramBundle.getString("phoneview_phone");
      if (paramBundle != null)
        this.c.setText(paramBundle);
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
      return r.a("YourPhone", 2131231992);
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
 * Qualified Name:     org.vidogram.ui.ae
 * JD-Core Version:    0.6.0
 */