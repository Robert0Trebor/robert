package org.vidogram.ui;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Vibrator;
import android.telephony.TelephonyManager;
import android.text.Editable;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.TextUtils.TruncateAt;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
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
import org.vidogram.messenger.ApplicationLoader;
import org.vidogram.messenger.n;
import org.vidogram.messenger.r;
import org.vidogram.tgnet.ConnectionsManager;
import org.vidogram.tgnet.f;
import org.vidogram.tgnet.g.gd;
import org.vidogram.tgnet.g.lc;
import org.vidogram.ui.Components.BackupImageView;
import org.vidogram.ui.Components.o;
import org.vidogram.ui.Components.t;
import org.vidogram.ui.Components.v;
import org.vidogram.ui.a.a.a;
import org.vidogram.ui.a.d;
import org.vidogram.ui.a.g;

public class ag extends g
  implements AdapterView.OnItemSelectedListener
{
  private boolean A;
  private d i;
  private o j;
  private EditText k;
  private EditText l;
  private EditText m;
  private t n;
  private BackupImageView o;
  private TextView p;
  private org.vidogram.ui.Components.b q;
  private AnimatorSet r;
  private ArrayList<String> s = new ArrayList();
  private HashMap<String, String> t = new HashMap();
  private HashMap<String, String> u = new HashMap();
  private HashMap<String, String> v = new HashMap();
  private boolean w;
  private boolean x;
  private int y;
  private boolean z;

  private void c(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (this.r != null)
      this.r.cancel();
    if (!paramBoolean2)
    {
      if (paramBoolean1)
      {
        this.i.getImageView().setScaleX(0.1F);
        this.i.getImageView().setScaleY(0.1F);
        this.i.getImageView().setAlpha(0.0F);
        this.j.setScaleX(1.0F);
        this.j.setScaleY(1.0F);
        this.j.setAlpha(1.0F);
        this.i.getImageView().setVisibility(4);
        this.j.setVisibility(0);
        this.i.setEnabled(false);
        return;
      }
      this.j.setScaleX(0.1F);
      this.j.setScaleY(0.1F);
      this.j.setAlpha(0.0F);
      this.i.getImageView().setScaleX(1.0F);
      this.i.getImageView().setScaleY(1.0F);
      this.i.getImageView().setAlpha(1.0F);
      this.i.getImageView().setVisibility(0);
      this.j.setVisibility(4);
      this.i.setEnabled(true);
      return;
    }
    this.r = new AnimatorSet();
    if (paramBoolean1)
    {
      this.j.setVisibility(0);
      this.i.setEnabled(false);
      this.r.playTogether(new Animator[] { ObjectAnimator.ofFloat(this.i.getImageView(), "scaleX", new float[] { 0.1F }), ObjectAnimator.ofFloat(this.i.getImageView(), "scaleY", new float[] { 0.1F }), ObjectAnimator.ofFloat(this.i.getImageView(), "alpha", new float[] { 0.0F }), ObjectAnimator.ofFloat(this.j, "scaleX", new float[] { 1.0F }), ObjectAnimator.ofFloat(this.j, "scaleY", new float[] { 1.0F }), ObjectAnimator.ofFloat(this.j, "alpha", new float[] { 1.0F }) });
    }
    while (true)
    {
      this.r.addListener(new org.vidogram.messenger.b(paramBoolean1)
      {
        public void onAnimationCancel(Animator paramAnimator)
        {
          if ((ag.p(ag.this) != null) && (ag.p(ag.this).equals(paramAnimator)))
            ag.a(ag.this, null);
        }

        public void onAnimationEnd(Animator paramAnimator)
        {
          if ((ag.p(ag.this) != null) && (ag.p(ag.this).equals(paramAnimator)))
          {
            if (!this.a)
              ag.q(ag.this).setVisibility(4);
          }
          else
            return;
          ag.o(ag.this).getImageView().setVisibility(4);
        }
      });
      this.r.setDuration(150L);
      this.r.start();
      return;
      this.i.getImageView().setVisibility(0);
      this.i.setEnabled(true);
      this.r.playTogether(new Animator[] { ObjectAnimator.ofFloat(this.j, "scaleX", new float[] { 0.1F }), ObjectAnimator.ofFloat(this.j, "scaleY", new float[] { 0.1F }), ObjectAnimator.ofFloat(this.j, "alpha", new float[] { 0.0F }), ObjectAnimator.ofFloat(this.i.getImageView(), "scaleX", new float[] { 1.0F }), ObjectAnimator.ofFloat(this.i.getImageView(), "scaleY", new float[] { 1.0F }), ObjectAnimator.ofFloat(this.i.getImageView(), "alpha", new float[] { 1.0F }) });
    }
  }

  public View a(Context paramContext)
  {
    this.d.setBackButtonImage(2130837794);
    this.d.setAllowOverlayTitle(true);
    this.d.setTitle(r.a("AddContactTitle", 2131230815));
    this.d.setActionBarMenuOnItemClick(new a.a()
    {
      public void a(int paramInt)
      {
        if (paramInt == -1)
          ag.this.d();
        do
          return;
        while ((paramInt != 1) || (ag.a(ag.this)));
        if (ag.b(ag.this).length() == 0)
        {
          localObject = (Vibrator)ag.this.l().getSystemService("vibrator");
          if (localObject != null)
            ((Vibrator)localObject).vibrate(200L);
          org.vidogram.messenger.a.a(ag.b(ag.this), 2.0F, 0);
          return;
        }
        if (ag.c(ag.this).length() == 0)
        {
          localObject = (Vibrator)ag.this.l().getSystemService("vibrator");
          if (localObject != null)
            ((Vibrator)localObject).vibrate(200L);
          org.vidogram.messenger.a.a(ag.c(ag.this), 2.0F, 0);
          return;
        }
        if (ag.d(ag.this).length() == 0)
        {
          localObject = (Vibrator)ag.this.l().getSystemService("vibrator");
          if (localObject != null)
            ((Vibrator)localObject).vibrate(200L);
          org.vidogram.messenger.a.a(ag.d(ag.this), 2.0F, 0);
          return;
        }
        ag.a(ag.this, true);
        ag.a(ag.this, true, true);
        Object localObject = new g.gd();
        g.lc locallc = new g.lc();
        locallc.e = ag.b(ag.this).getText().toString();
        locallc.f = ag.e(ag.this).getText().toString();
        locallc.d = ("+" + ag.c(ag.this).getText().toString() + ag.d(ag.this).getText().toString());
        ((g.gd)localObject).c.add(locallc);
        paramInt = ConnectionsManager.a().a((f)localObject, new org.vidogram.tgnet.c(locallc)
        {
        }
        , 2);
        ConnectionsManager.a().a(paramInt, ag.f(ag.this));
      }
    });
    this.q = new org.vidogram.ui.Components.b();
    this.q.a(5, "", "", false);
    this.i = this.d.a().b(1, 2130837825, org.vidogram.messenger.a.a(56.0F));
    this.j = new o(paramContext, 1);
    this.i.addView(this.j, v.a(-1, -1.0F));
    this.j.setVisibility(4);
    this.b = new ScrollView(paramContext);
    Object localObject1 = new LinearLayout(paramContext);
    ((LinearLayout)localObject1).setPadding(org.vidogram.messenger.a.a(24.0F), 0, org.vidogram.messenger.a.a(24.0F), 0);
    ((LinearLayout)localObject1).setOrientation(1);
    ((ScrollView)this.b).addView((View)localObject1, v.a(-1, -2, 51));
    ((LinearLayout)localObject1).setOnTouchListener(new View.OnTouchListener()
    {
      public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
      {
        return true;
      }
    });
    Object localObject2 = new FrameLayout(paramContext);
    ((LinearLayout)localObject1).addView((View)localObject2, v.a(-1, -2, 0.0F, 24.0F, 0.0F, 0.0F));
    this.o = new BackupImageView(paramContext);
    this.o.setImageDrawable(this.q);
    ((FrameLayout)localObject2).addView(this.o, v.a(60, 60.0F, 51, 0.0F, 9.0F, 0.0F, 0.0F));
    this.k = new EditText(paramContext);
    this.k.setTextSize(1, 18.0F);
    this.k.setHintTextColor(-6842473);
    this.k.setTextColor(-14606047);
    this.k.setMaxLines(1);
    this.k.setLines(1);
    this.k.setSingleLine(true);
    this.k.setGravity(3);
    this.k.setInputType(49152);
    this.k.setImeOptions(5);
    this.k.setHint(r.a("FirstName", 2131231198));
    org.vidogram.messenger.a.a(this.k);
    ((FrameLayout)localObject2).addView(this.k, v.a(-1, 34.0F, 51, 84.0F, 0.0F, 0.0F, 0.0F));
    this.k.setOnEditorActionListener(new TextView.OnEditorActionListener()
    {
      public boolean onEditorAction(TextView paramTextView, int paramInt, KeyEvent paramKeyEvent)
      {
        if (paramInt == 5)
        {
          ag.e(ag.this).requestFocus();
          ag.e(ag.this).setSelection(ag.e(ag.this).length());
          return true;
        }
        return false;
      }
    });
    this.k.addTextChangedListener(new TextWatcher()
    {
      public void afterTextChanged(Editable paramEditable)
      {
        ag.g(ag.this).a(5, ag.b(ag.this).getText().toString(), ag.e(ag.this).getText().toString(), false);
        ag.h(ag.this).invalidate();
      }

      public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
      {
      }

      public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
      {
      }
    });
    this.l = new EditText(paramContext);
    this.l.setTextSize(1, 18.0F);
    this.l.setHintTextColor(-6842473);
    this.l.setTextColor(-14606047);
    this.l.setMaxLines(1);
    this.l.setLines(1);
    this.l.setSingleLine(true);
    this.l.setGravity(3);
    this.l.setInputType(49152);
    this.l.setImeOptions(5);
    this.l.setHint(r.a("LastName", 2131231348));
    org.vidogram.messenger.a.a(this.l);
    ((FrameLayout)localObject2).addView(this.l, v.a(-1, 34.0F, 51, 84.0F, 44.0F, 0.0F, 0.0F));
    this.l.setOnEditorActionListener(new TextView.OnEditorActionListener()
    {
      public boolean onEditorAction(TextView paramTextView, int paramInt, KeyEvent paramKeyEvent)
      {
        if (paramInt == 5)
        {
          ag.d(ag.this).requestFocus();
          ag.d(ag.this).setSelection(ag.d(ag.this).length());
          return true;
        }
        return false;
      }
    });
    this.l.addTextChangedListener(new TextWatcher()
    {
      public void afterTextChanged(Editable paramEditable)
      {
        ag.g(ag.this).a(5, ag.b(ag.this).getText().toString(), ag.e(ag.this).getText().toString(), false);
        ag.h(ag.this).invalidate();
      }

      public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
      {
      }

      public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
      {
      }
    });
    this.p = new TextView(paramContext);
    this.p.setTextSize(1, 18.0F);
    this.p.setPadding(org.vidogram.messenger.a.a(6.0F), org.vidogram.messenger.a.a(10.0F), org.vidogram.messenger.a.a(6.0F), 0);
    this.p.setTextColor(-14606047);
    this.p.setMaxLines(1);
    this.p.setSingleLine(true);
    this.p.setEllipsize(TextUtils.TruncateAt.END);
    this.p.setGravity(3);
    this.p.setBackgroundResource(2130838150);
    ((LinearLayout)localObject1).addView(this.p, v.a(-1, 36, 0.0F, 24.0F, 0.0F, 14.0F));
    this.p.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramView)
      {
        paramView = new u();
        paramView.a(new u.a()
        {
          public void a(String paramString)
          {
            ag.this.a(paramString);
            org.vidogram.messenger.a.a(new Runnable()
            {
              public void run()
              {
                org.vidogram.messenger.a.a(ag.d(ag.this));
              }
            }
            , 300L);
            ag.d(ag.this).requestFocus();
            ag.d(ag.this).setSelection(ag.d(ag.this).length());
          }
        });
        ag.this.a(paramView);
      }
    });
    localObject2 = new View(paramContext);
    ((View)localObject2).setPadding(org.vidogram.messenger.a.a(8.0F), 0, org.vidogram.messenger.a.a(8.0F), 0);
    ((View)localObject2).setBackgroundColor(-2368549);
    ((LinearLayout)localObject1).addView((View)localObject2, v.a(-1, 1, 0.0F, -17.5F, 0.0F, 0.0F));
    localObject2 = new LinearLayout(paramContext);
    ((LinearLayout)localObject2).setOrientation(0);
    ((LinearLayout)localObject1).addView((View)localObject2, v.a(-1, -2, 0.0F, 20.0F, 0.0F, 0.0F));
    localObject1 = new TextView(paramContext);
    ((TextView)localObject1).setText("+");
    ((TextView)localObject1).setTextColor(-14606047);
    ((TextView)localObject1).setTextSize(1, 18.0F);
    ((LinearLayout)localObject2).addView((View)localObject1, v.b(-2, -2));
    this.m = new EditText(paramContext);
    this.m.setInputType(3);
    this.m.setTextColor(-14606047);
    org.vidogram.messenger.a.a(this.m);
    this.m.setPadding(org.vidogram.messenger.a.a(10.0F), 0, 0, 0);
    this.m.setTextSize(1, 18.0F);
    this.m.setMaxLines(1);
    this.m.setGravity(19);
    this.m.setImeOptions(268435461);
    localObject1 = new InputFilter.LengthFilter(5);
    this.m.setFilters(new InputFilter[] { localObject1 });
    ((LinearLayout)localObject2).addView(this.m, v.a(55, 36, -9.0F, 0.0F, 16.0F, 0.0F));
    this.m.addTextChangedListener(new TextWatcher()
    {
      public void afterTextChanged(Editable paramEditable)
      {
        Object localObject3 = null;
        if (ag.i(ag.this))
          return;
        ag.b(ag.this, true);
        paramEditable = org.vidogram.a.b.b(ag.c(ag.this).getText().toString());
        ag.c(ag.this).setText(paramEditable);
        if (paramEditable.length() == 0)
        {
          ag.j(ag.this).setText(r.a("ChooseCountry", 2131231062));
          ag.d(ag.this).setHintText(null);
          ag.a(ag.this, 1);
          ag.b(ag.this, false);
          return;
        }
        int i;
        label124: Object localObject1;
        Object localObject2;
        label216: Object localObject4;
        if (paramEditable.length() > 4)
        {
          ag.b(ag.this, true);
          i = 4;
          if (i >= 1)
          {
            localObject1 = paramEditable.substring(0, i);
            if ((String)ag.k(ag.this).get(localObject1) != null)
            {
              localObject2 = paramEditable.substring(i, paramEditable.length()) + ag.d(ag.this).getText().toString();
              ag.c(ag.this).setText((CharSequence)localObject1);
              i = 1;
              paramEditable = (Editable)localObject1;
              localObject1 = localObject2;
              localObject2 = paramEditable;
              if (i == 0)
              {
                ag.b(ag.this, true);
                localObject1 = paramEditable.substring(1, paramEditable.length()) + ag.d(ag.this).getText().toString();
                localObject4 = ag.c(ag.this);
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
          localObject2 = (String)ag.k(ag.this).get(localObject1);
          if (localObject2 != null)
          {
            int j = ag.l(ag.this).indexOf(localObject2);
            if (j != -1)
            {
              ag.c(ag.this, true);
              ag.j(ag.this).setText((CharSequence)ag.l(ag.this).get(j));
              localObject4 = (String)ag.m(ag.this).get(localObject1);
              localObject2 = ag.d(ag.this);
              localObject1 = localObject3;
              if (localObject4 != null)
                localObject1 = ((String)localObject4).replace('X', '–');
              ((t)localObject2).setHintText((String)localObject1);
              ag.a(ag.this, 0);
            }
          }
          while (true)
          {
            if (i == 0)
              ag.c(ag.this).setSelection(ag.c(ag.this).getText().length());
            if (paramEditable == null)
              break;
            ag.d(ag.this).requestFocus();
            ag.d(ag.this).setText(paramEditable);
            ag.d(ag.this).setSelection(ag.d(ag.this).length());
            break;
            i -= 1;
            break label124;
            ag.j(ag.this).setText(r.a("WrongCountry", 2131231966));
            ag.d(ag.this).setHintText(null);
            ag.a(ag.this, 2);
            continue;
            ag.j(ag.this).setText(r.a("WrongCountry", 2131231966));
            ag.d(ag.this).setHintText(null);
            ag.a(ag.this, 2);
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
    this.m.setOnEditorActionListener(new TextView.OnEditorActionListener()
    {
      public boolean onEditorAction(TextView paramTextView, int paramInt, KeyEvent paramKeyEvent)
      {
        if (paramInt == 5)
        {
          ag.d(ag.this).requestFocus();
          ag.d(ag.this).setSelection(ag.d(ag.this).length());
          return true;
        }
        return false;
      }
    });
    this.n = new t(paramContext);
    this.n.setInputType(3);
    this.n.setTextColor(-14606047);
    this.n.setHintTextColor(-6842473);
    this.n.setPadding(0, 0, 0, 0);
    org.vidogram.messenger.a.a(this.n);
    this.n.setTextSize(1, 18.0F);
    this.n.setMaxLines(1);
    this.n.setGravity(19);
    this.n.setImeOptions(268435462);
    ((LinearLayout)localObject2).addView(this.n, v.a(-1, 36.0F));
    this.n.addTextChangedListener(new TextWatcher()
    {
      private int b = -1;
      private int c;

      public void afterTextChanged(Editable paramEditable)
      {
        if (ag.n(ag.this))
          return;
        int j = ag.d(ag.this).getSelectionStart();
        Object localObject = ag.d(ag.this).getText().toString();
        paramEditable = (Editable)localObject;
        int i = j;
        if (this.b == 3)
        {
          paramEditable = ((String)localObject).substring(0, this.c) + ((String)localObject).substring(this.c + 1, ((String)localObject).length());
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
        ag.d(ag.this, true);
        paramEditable = ag.d(ag.this).getHintText();
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
                  if (this.b != 2)
                  {
                    m = k;
                    j = i;
                    if (this.b != 3)
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
            if (this.b == 2)
              break;
            j = i;
            if (this.b == 3)
              break;
            j = i + 1;
          }
        }
        ag.d(ag.this).setText((CharSequence)localObject);
        if (j >= 0)
        {
          paramEditable = ag.d(ag.this);
          if (j > ag.d(ag.this).length())
            break label404;
        }
        while (true)
        {
          paramEditable.setSelection(j);
          ag.d(ag.this).a();
          ag.d(ag.this, false);
          return;
          label404: j = ag.d(ag.this).length();
        }
      }

      public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
      {
        if ((paramInt2 == 0) && (paramInt3 == 1))
        {
          this.b = 1;
          return;
        }
        if ((paramInt2 == 1) && (paramInt3 == 0))
        {
          if ((paramCharSequence.charAt(paramInt1) == ' ') && (paramInt1 > 0))
          {
            this.b = 3;
            this.c = (paramInt1 - 1);
            return;
          }
          this.b = 2;
          return;
        }
        this.b = -1;
      }

      public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
      {
      }
    });
    this.n.setOnEditorActionListener(new TextView.OnEditorActionListener()
    {
      public boolean onEditorAction(TextView paramTextView, int paramInt, KeyEvent paramKeyEvent)
      {
        if (paramInt == 6)
        {
          ag.o(ag.this).performClick();
          return true;
        }
        return false;
      }
    });
    localObject1 = new HashMap();
    try
    {
      paramContext = new BufferedReader(new InputStreamReader(paramContext.getResources().getAssets().open("countries.txt")));
      while (true)
      {
        localObject2 = paramContext.readLine();
        if (localObject2 == null)
          break;
        localObject2 = ((String)localObject2).split(";");
        this.s.add(0, localObject2[2]);
        this.t.put(localObject2[2], localObject2[0]);
        this.u.put(localObject2[0], localObject2[2]);
        if (localObject2.length > 3)
          this.v.put(localObject2[0], localObject2[3]);
        ((HashMap)localObject1).put(localObject2[1], localObject2[2]);
      }
    }
    catch (java.lang.Exception paramContext)
    {
      n.a("tmessages", paramContext);
    }
    while (true)
    {
      Collections.sort(this.s, new Comparator()
      {
        public int a(String paramString1, String paramString2)
        {
          return paramString1.compareTo(paramString2);
        }
      });
      try
      {
        paramContext = (TelephonyManager)ApplicationLoader.a.getSystemService("phone");
        if (paramContext != null)
        {
          paramContext = paramContext.getSimCountryIso().toUpperCase();
          if (paramContext != null)
          {
            paramContext = (String)((HashMap)localObject1).get(paramContext);
            if ((paramContext != null) && (this.s.indexOf(paramContext) != -1))
            {
              this.m.setText((CharSequence)this.t.get(paramContext));
              this.y = 0;
            }
          }
          if (this.m.length() == 0)
          {
            this.p.setText(r.a("ChooseCountry", 2131231062));
            this.n.setHintText(null);
            this.y = 1;
          }
          return this.b;
          paramContext.close();
        }
      }
      catch (java.lang.Exception paramContext)
      {
        while (true)
        {
          n.a("tmessages", paramContext);
          paramContext = null;
        }
      }
    }
  }

  public void a(String paramString)
  {
    Object localObject;
    if (this.s.indexOf(paramString) != -1)
    {
      this.w = true;
      localObject = (String)this.t.get(paramString);
      this.m.setText((CharSequence)localObject);
      this.p.setText(paramString);
      paramString = (String)this.v.get(localObject);
      localObject = this.n;
      if (paramString == null)
        break label92;
    }
    label92: for (paramString = paramString.replace('X', '–'); ; paramString = null)
    {
      ((t)localObject).setHintText(paramString);
      this.y = 0;
      this.w = false;
      return;
    }
  }

  public void b(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (paramBoolean1)
    {
      this.k.requestFocus();
      org.vidogram.messenger.a.a(this.k);
    }
  }

  public void i()
  {
    super.i();
    if (!ApplicationLoader.a.getSharedPreferences("mainconfig", 0).getBoolean("view_animations", true))
    {
      this.k.requestFocus();
      org.vidogram.messenger.a.a(this.k);
    }
  }

  public void onItemSelected(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    if (this.z)
    {
      this.z = false;
      return;
    }
    this.w = true;
    paramAdapterView = (String)this.s.get(paramInt);
    this.m.setText((CharSequence)this.t.get(paramAdapterView));
    this.w = false;
  }

  public void onNothingSelected(AdapterView<?> paramAdapterView)
  {
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.ag
 * JD-Core Version:    0.6.0
 */