package org.vidogram.ui;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.os.Vibrator;
import android.text.Editable;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.TextUtils.TruncateAt;
import android.text.TextWatcher;
import android.text.method.DigitsKeyListener;
import android.text.method.PasswordTransformationMethod;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import android.widget.Toast;
import java.security.SecureRandom;
import org.vidogram.messenger.ApplicationLoader;
import org.vidogram.messenger.Utilities;
import org.vidogram.messenger.ad;
import org.vidogram.messenger.n;
import org.vidogram.messenger.r;
import org.vidogram.messenger.y;
import org.vidogram.messenger.y.b;
import org.vidogram.ui.Components.ab;
import org.vidogram.ui.Components.ab.b;
import org.vidogram.ui.a.a.a;
import org.vidogram.ui.a.c;
import org.vidogram.ui.a.d;
import org.vidogram.ui.a.g;
import org.vidogram.ui.c.ba;
import org.vidogram.ui.c.bf;
import org.vidogram.ui.c.bg;

public class ai extends g
  implements y.b
{
  private a i;
  private ListView j;
  private TextView k;
  private EditText l;
  private TextView m;
  private d n;
  private int o;
  private int p = 0;
  private int q = 0;
  private String r;
  private int s;
  private int t;
  private int u;
  private int v;
  private int w;
  private int x;
  private int y;

  public ai(int paramInt)
  {
    this.o = paramInt;
  }

  private void q()
  {
    this.y = 0;
    int i1 = this.y;
    this.y = (i1 + 1);
    this.s = i1;
    i1 = this.y;
    this.y = (i1 + 1);
    this.t = i1;
    i1 = this.y;
    this.y = (i1 + 1);
    this.u = i1;
    if (ad.i.length() > 0)
      try
      {
        if ((Build.VERSION.SDK_INT >= 23) && (android.support.v4.c.a.a.a(ApplicationLoader.a).b()))
        {
          i1 = this.y;
          this.y = (i1 + 1);
          this.v = i1;
        }
        i1 = this.y;
        this.y = (i1 + 1);
        this.w = i1;
        i1 = this.y;
        this.y = (i1 + 1);
        this.x = i1;
        return;
      }
      catch (Throwable localThrowable)
      {
        while (true)
          n.a("tmessages", localThrowable);
      }
    this.v = -1;
    this.w = -1;
    this.x = -1;
  }

  private void r()
  {
    if (this.m != null)
    {
      if (this.p == 0)
        this.m.setText(r.a("PasscodePIN", 2131231645));
    }
    else
    {
      if (((this.o != 1) || (this.p != 0)) && ((this.o != 2) || (ad.l != 0)))
        break label137;
      InputFilter.LengthFilter localLengthFilter = new InputFilter.LengthFilter(4);
      this.l.setFilters(new InputFilter[] { localLengthFilter });
      this.l.setInputType(3);
      this.l.setKeyListener(DigitsKeyListener.getInstance("1234567890"));
    }
    while (true)
    {
      this.l.setTransformationMethod(PasswordTransformationMethod.getInstance());
      return;
      if (this.p != 1)
        break;
      this.m.setText(r.a("PasscodePassword", 2131231646));
      break;
      label137: if (((this.o != 1) || (this.p != 1)) && ((this.o != 2) || (ad.l != 1)))
        continue;
      this.l.setFilters(new InputFilter[0]);
      this.l.setKeyListener(null);
      this.l.setInputType(129);
    }
  }

  private void s()
  {
    if ((this.l.getText().length() == 0) || ((this.p == 0) && (this.l.getText().length() != 4)))
    {
      u();
      return;
    }
    if (this.p == 0)
      this.d.setTitle(r.a("PasscodePIN", 2131231645));
    while (true)
    {
      this.n.setVisibility(8);
      this.k.setText(r.a("ReEnterYourPasscode", 2131231707));
      this.r = this.l.getText().toString();
      this.l.setText("");
      this.q = 1;
      return;
      this.d.setTitle(r.a("PasscodePassword", 2131231646));
    }
  }

  private void t()
  {
    if (this.l.getText().length() == 0)
      u();
    do
    {
      return;
      if (this.o != 1)
        continue;
      if (!this.r.equals(this.l.getText().toString()))
        try
        {
          Toast.makeText(l(), r.a("PasscodeDoNotMatch", 2131231644), 0).show();
          org.vidogram.messenger.a.a(this.k, 2.0F, 0);
          this.l.setText("");
          return;
        }
        catch (Exception localException1)
        {
          while (true)
            n.a("tmessages", localException1);
        }
      try
      {
        ad.j = new byte[16];
        Utilities.b.nextBytes(ad.j);
        byte[] arrayOfByte1 = this.r.getBytes("UTF-8");
        byte[] arrayOfByte2 = new byte[arrayOfByte1.length + 32];
        System.arraycopy(ad.j, 0, arrayOfByte2, 0, 16);
        System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 16, arrayOfByte1.length);
        System.arraycopy(ad.j, 0, arrayOfByte2, arrayOfByte1.length + 16, 16);
        ad.i = Utilities.a(Utilities.b(arrayOfByte2, 0, arrayOfByte2.length));
        ad.l = this.p;
        ad.a(false);
        d();
        y.a().a(y.H, new Object[0]);
        this.l.clearFocus();
        org.vidogram.messenger.a.b(this.l);
        return;
      }
      catch (Exception localException2)
      {
        while (true)
          n.a("tmessages", localException2);
      }
    }
    while (this.o != 2);
    if (!ad.a(this.l.getText().toString()))
    {
      this.l.setText("");
      u();
      return;
    }
    this.l.clearFocus();
    org.vidogram.messenger.a.b(this.l);
    a(new ai(0), true);
  }

  private void u()
  {
    if (l() == null)
      return;
    Vibrator localVibrator = (Vibrator)l().getSystemService("vibrator");
    if (localVibrator != null)
      localVibrator.vibrate(200L);
    org.vidogram.messenger.a.a(this.k, 2.0F, 0);
  }

  private void v()
  {
    FrameLayout.LayoutParams localLayoutParams;
    if (this.n != null)
      if (!org.vidogram.messenger.a.c())
      {
        localLayoutParams = (FrameLayout.LayoutParams)this.n.getLayoutParams();
        if (Build.VERSION.SDK_INT < 21)
          break label82;
      }
    label82: for (int i1 = org.vidogram.messenger.a.a; ; i1 = 0)
    {
      localLayoutParams.topMargin = i1;
      this.n.setLayoutParams(localLayoutParams);
      if ((org.vidogram.messenger.a.c()) || (ApplicationLoader.a.getResources().getConfiguration().orientation != 2))
        break;
      this.m.setTextSize(18.0F);
      return;
    }
    this.m.setTextSize(20.0F);
  }

  public View a(Context paramContext)
  {
    if (this.o != 3)
      this.d.setBackButtonImage(2130837794);
    this.d.setAllowOverlayTitle(false);
    this.d.setActionBarMenuOnItemClick(new a.a()
    {
      public void a(int paramInt)
      {
        if (paramInt == -1)
          ai.this.d();
        do
        {
          while (true)
          {
            return;
            if (paramInt != 1)
              break;
            if (ai.a(ai.this) == 0)
            {
              ai.b(ai.this);
              return;
            }
            if (ai.a(ai.this) != 1)
              continue;
            ai.c(ai.this);
            return;
          }
          if (paramInt != 2)
            continue;
          ai.a(ai.this, 0);
          ai.d(ai.this);
          return;
        }
        while (paramInt != 3);
        ai.a(ai.this, 1);
        ai.d(ai.this);
      }
    });
    this.b = new FrameLayout(paramContext);
    Object localObject2 = (FrameLayout)this.b;
    Object localObject1;
    label313: int i1;
    if (this.o != 0)
    {
      localObject1 = this.d.a();
      ((c)localObject1).b(1, 2130837825, org.vidogram.messenger.a.a(56.0F));
      this.k = new TextView(paramContext);
      this.k.setTextColor(-9079435);
      if (this.o == 1)
        if (ad.i.length() != 0)
        {
          this.k.setText(r.a("EnterNewPasscode", 2131231184));
          this.k.setTextSize(1, 18.0F);
          this.k.setGravity(1);
          ((FrameLayout)localObject2).addView(this.k);
          FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)this.k.getLayoutParams();
          localLayoutParams.width = -2;
          localLayoutParams.height = -2;
          localLayoutParams.gravity = 1;
          localLayoutParams.topMargin = org.vidogram.messenger.a.a(38.0F);
          this.k.setLayoutParams(localLayoutParams);
          this.l = new EditText(paramContext);
          this.l.setTextSize(1, 20.0F);
          this.l.setTextColor(-16777216);
          this.l.setMaxLines(1);
          this.l.setLines(1);
          this.l.setGravity(1);
          this.l.setSingleLine(true);
          if (this.o != 1)
            break label856;
          this.q = 0;
          this.l.setImeOptions(5);
          this.l.setTransformationMethod(PasswordTransformationMethod.getInstance());
          this.l.setTypeface(Typeface.DEFAULT);
          org.vidogram.messenger.a.a(this.l);
          ((FrameLayout)localObject2).addView(this.l);
          localObject2 = (FrameLayout.LayoutParams)this.l.getLayoutParams();
          ((FrameLayout.LayoutParams)localObject2).topMargin = org.vidogram.messenger.a.a(90.0F);
          ((FrameLayout.LayoutParams)localObject2).height = org.vidogram.messenger.a.a(36.0F);
          ((FrameLayout.LayoutParams)localObject2).leftMargin = org.vidogram.messenger.a.a(40.0F);
          ((FrameLayout.LayoutParams)localObject2).gravity = 51;
          ((FrameLayout.LayoutParams)localObject2).rightMargin = org.vidogram.messenger.a.a(40.0F);
          ((FrameLayout.LayoutParams)localObject2).width = -1;
          this.l.setLayoutParams((ViewGroup.LayoutParams)localObject2);
          this.l.setOnEditorActionListener(new TextView.OnEditorActionListener()
          {
            public boolean onEditorAction(TextView paramTextView, int paramInt, KeyEvent paramKeyEvent)
            {
              if (ai.a(ai.this) == 0)
              {
                ai.b(ai.this);
                return true;
              }
              if (ai.a(ai.this) == 1)
              {
                ai.c(ai.this);
                return true;
              }
              return false;
            }
          });
          this.l.addTextChangedListener(new TextWatcher()
          {
            public void afterTextChanged(Editable paramEditable)
            {
              if (ai.e(ai.this).length() == 4)
              {
                if ((ai.f(ai.this) != 2) || (ad.l != 0))
                  break label39;
                ai.c(ai.this);
              }
              label39: 
              do
              {
                do
                  return;
                while ((ai.f(ai.this) != 1) || (ai.g(ai.this) != 0));
                if (ai.a(ai.this) != 0)
                  continue;
                ai.b(ai.this);
                return;
              }
              while (ai.a(ai.this) != 1);
              ai.c(ai.this);
            }

            public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
            {
            }

            public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
            {
            }
          });
          this.l.setCustomSelectionActionModeCallback(new ActionMode.Callback()
          {
            public boolean onActionItemClicked(ActionMode paramActionMode, MenuItem paramMenuItem)
            {
              return false;
            }

            public boolean onCreateActionMode(ActionMode paramActionMode, Menu paramMenu)
            {
              return false;
            }

            public void onDestroyActionMode(ActionMode paramActionMode)
            {
            }

            public boolean onPrepareActionMode(ActionMode paramActionMode, Menu paramMenu)
            {
              return false;
            }
          });
          if (this.o != 1)
            break label883;
          this.n = new d(paramContext, (c)localObject1, 0);
          this.n.setSubMenuOpenSide(1);
          this.n.a(2, r.a("PasscodePIN", 2131231645), 0);
          this.n.a(3, r.a("PasscodePassword", 2131231646), 0);
          this.d.addView(this.n);
          localObject1 = (FrameLayout.LayoutParams)this.n.getLayoutParams();
          ((FrameLayout.LayoutParams)localObject1).height = -1;
          ((FrameLayout.LayoutParams)localObject1).width = -2;
          ((FrameLayout.LayoutParams)localObject1).rightMargin = org.vidogram.messenger.a.a(40.0F);
          if (!org.vidogram.messenger.a.c())
            break label873;
          i1 = org.vidogram.messenger.a.a(64.0F);
          label592: ((FrameLayout.LayoutParams)localObject1).leftMargin = i1;
          ((FrameLayout.LayoutParams)localObject1).gravity = 51;
          this.n.setLayoutParams((ViewGroup.LayoutParams)localObject1);
          this.n.setOnClickListener(new View.OnClickListener()
          {
            public void onClick(View paramView)
            {
              ai.h(ai.this).b();
            }
          });
          this.m = new TextView(paramContext);
          this.m.setGravity(3);
          this.m.setSingleLine(true);
          this.m.setLines(1);
          this.m.setMaxLines(1);
          this.m.setEllipsize(TextUtils.TruncateAt.END);
          this.m.setTextColor(-1);
          this.m.setTypeface(org.vidogram.messenger.a.a("fonts/rmedium.ttf"));
          this.m.setCompoundDrawablesWithIntrinsicBounds(0, 0, 2130837814, 0);
          this.m.setCompoundDrawablePadding(org.vidogram.messenger.a.a(4.0F));
          this.m.setPadding(0, 0, org.vidogram.messenger.a.a(10.0F), 0);
          this.n.addView(this.m);
          paramContext = (FrameLayout.LayoutParams)this.m.getLayoutParams();
          paramContext.width = -2;
          paramContext.height = -2;
          paramContext.leftMargin = org.vidogram.messenger.a.a(16.0F);
          paramContext.gravity = 16;
          paramContext.bottomMargin = org.vidogram.messenger.a.a(1.0F);
          this.m.setLayoutParams(paramContext);
          label809: r();
        }
    }
    while (true)
    {
      return this.b;
      this.k.setText(r.a("EnterNewFirstPasscode", 2131231183));
      break;
      this.k.setText(r.a("EnterCurrentPasscode", 2131231180));
      break;
      label856: this.q = 1;
      this.l.setImeOptions(6);
      break label313;
      label873: i1 = org.vidogram.messenger.a.a(56.0F);
      break label592;
      label883: this.d.setTitle(r.a("Passcode", 2131231643));
      break label809;
      this.d.setTitle(r.a("Passcode", 2131231643));
      ((FrameLayout)localObject2).setBackgroundColor(-986896);
      this.j = new ListView(paramContext);
      this.j.setDivider(null);
      this.j.setDividerHeight(0);
      this.j.setVerticalScrollBarEnabled(false);
      this.j.setDrawSelectorOnTop(true);
      ((FrameLayout)localObject2).addView(this.j);
      localObject1 = (FrameLayout.LayoutParams)this.j.getLayoutParams();
      ((FrameLayout.LayoutParams)localObject1).width = -1;
      ((FrameLayout.LayoutParams)localObject1).height = -1;
      ((FrameLayout.LayoutParams)localObject1).gravity = 48;
      this.j.setLayoutParams((ViewGroup.LayoutParams)localObject1);
      localObject1 = this.j;
      paramContext = new a(paramContext);
      this.i = paramContext;
      ((ListView)localObject1).setAdapter(paramContext);
      this.j.setOnItemClickListener(new AdapterView.OnItemClickListener()
      {
        public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
        {
          boolean bool = true;
          if (paramInt == ai.i(ai.this))
            ai.this.a(new ai(1));
          label156: 
          do
            while (true)
            {
              return;
              if (paramInt == ai.j(ai.this))
              {
                paramAdapterView = (ba)paramView;
                if (ad.i.length() != 0)
                {
                  ad.i = "";
                  ad.k = false;
                  ad.a(false);
                  int i = ai.k(ai.this).getChildCount();
                  paramInt = 0;
                  if (paramInt < i)
                  {
                    paramView = ai.k(ai.this).getChildAt(paramInt);
                    if ((paramView instanceof bg))
                      ((bg)paramView).setTextColor(-3750202);
                  }
                  else
                  {
                    if (ad.i.length() == 0)
                      break label156;
                  }
                  for (bool = true; ; bool = false)
                  {
                    paramAdapterView.setChecked(bool);
                    y.a().a(y.H, new Object[0]);
                    return;
                    paramInt += 1;
                    break;
                  }
                }
                ai.this.a(new ai(1));
                return;
              }
              if (paramInt != ai.l(ai.this))
                break;
              if (ai.this.l() == null)
                continue;
              paramAdapterView = new AlertDialog.Builder(ai.this.l());
              paramAdapterView.setTitle(r.a("AutoLock", 2131230906));
              paramView = new ab(ai.this.l());
              paramView.setMinValue(0);
              paramView.setMaxValue(4);
              if (ad.m == 0)
                paramView.setValue(0);
              while (true)
              {
                paramView.setFormatter(new ab.b()
                {
                  public String a(int paramInt)
                  {
                    if (paramInt == 0)
                      return r.a("AutoLockDisabled", 2131230907);
                    if (paramInt == 1)
                      return r.a("AutoLockInTime", 2131230908, new Object[] { r.b("Minutes", 1) });
                    if (paramInt == 2)
                      return r.a("AutoLockInTime", 2131230908, new Object[] { r.b("Minutes", 5) });
                    if (paramInt == 3)
                      return r.a("AutoLockInTime", 2131230908, new Object[] { r.b("Hours", 1) });
                    if (paramInt == 4)
                      return r.a("AutoLockInTime", 2131230908, new Object[] { r.b("Hours", 5) });
                    return "";
                  }
                });
                paramAdapterView.setView(paramView);
                paramAdapterView.setNegativeButton(r.a("Done", 2131231147), new DialogInterface.OnClickListener(paramView)
                {
                  public void onClick(DialogInterface paramDialogInterface, int paramInt)
                  {
                    paramInt = this.a.getValue();
                    if (paramInt == 0)
                      ad.m = 0;
                    while (true)
                    {
                      ai.k(ai.this).invalidateViews();
                      ad.a(false);
                      return;
                      if (paramInt == 1)
                      {
                        ad.m = 60;
                        continue;
                      }
                      if (paramInt == 2)
                      {
                        ad.m = 300;
                        continue;
                      }
                      if (paramInt == 3)
                      {
                        ad.m = 3600;
                        continue;
                      }
                      if (paramInt != 4)
                        continue;
                      ad.m = 18000;
                    }
                  }
                });
                ai.this.b(paramAdapterView.create());
                return;
                if (ad.m == 60)
                {
                  paramView.setValue(1);
                  continue;
                }
                if (ad.m == 300)
                {
                  paramView.setValue(2);
                  continue;
                }
                if (ad.m == 3600)
                {
                  paramView.setValue(3);
                  continue;
                }
                if (ad.m != 18000)
                  continue;
                paramView.setValue(4);
              }
            }
          while (paramInt != ai.m(ai.this));
          if (!ad.p);
          while (true)
          {
            ad.p = bool;
            ad.a(false);
            ((ba)paramView).setChecked(ad.p);
            return;
            bool = false;
          }
        }
      });
    }
  }

  public void a(int paramInt, Object[] paramArrayOfObject)
  {
    if ((paramInt == y.H) && (this.o == 0))
    {
      q();
      if (this.i != null)
        this.i.notifyDataSetChanged();
    }
  }

  public void a(Configuration paramConfiguration)
  {
    super.a(paramConfiguration);
    if (this.j != null)
      this.j.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener()
      {
        public boolean onPreDraw()
        {
          ai.k(ai.this).getViewTreeObserver().removeOnPreDrawListener(this);
          ai.n(ai.this);
          return true;
        }
      });
  }

  public void b(boolean paramBoolean1, boolean paramBoolean2)
  {
    if ((paramBoolean1) && (this.o != 0))
      org.vidogram.messenger.a.a(this.l);
  }

  public boolean f()
  {
    super.f();
    q();
    if (this.o == 0)
      y.a().a(this, y.H);
    return true;
  }

  public void g()
  {
    super.g();
    if (this.o == 0)
      y.a().b(this, y.H);
  }

  public void i()
  {
    super.i();
    if (this.i != null)
      this.i.notifyDataSetChanged();
    if (this.o != 0)
      org.vidogram.messenger.a.a(new Runnable()
      {
        public void run()
        {
          if (ai.e(ai.this) != null)
          {
            ai.e(ai.this).requestFocus();
            org.vidogram.messenger.a.a(ai.e(ai.this));
          }
        }
      }
      , 200L);
    v();
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
      return ai.o(ai.this);
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
      if ((paramInt == ai.j(ai.this)) || (paramInt == ai.m(ai.this)));
      do
      {
        return 0;
        if ((paramInt == ai.i(ai.this)) || (paramInt == ai.l(ai.this)))
          return 1;
      }
      while ((paramInt != ai.p(ai.this)) && (paramInt != ai.q(ai.this)));
      return 2;
    }

    public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      boolean bool = false;
      int i = getItemViewType(paramInt);
      if (i == 0)
      {
        if (paramView != null)
          break label500;
        paramViewGroup = new ba(this.b);
        paramViewGroup.setBackgroundColor(-1);
      }
      while (true)
      {
        Object localObject = (ba)paramViewGroup;
        if (paramInt == ai.j(ai.this))
        {
          paramView = r.a("Passcode", 2131231643);
          if (ad.i.length() > 0)
            bool = true;
          ((ba)localObject).a(paramView, bool, true);
          paramView = paramViewGroup;
        }
        do
        {
          return paramView;
          paramView = paramViewGroup;
        }
        while (paramInt != ai.m(ai.this));
        ((ba)localObject).a(r.a("UnlockFingerprint", 2131231913), ad.p, true);
        return paramViewGroup;
        if (i == 1)
        {
          if (paramView != null)
            break label495;
          paramViewGroup = new bg(this.b);
          paramViewGroup.setBackgroundColor(-1);
        }
        while (true)
        {
          localObject = (bg)paramViewGroup;
          if (paramInt == ai.i(ai.this))
          {
            ((bg)localObject).a(r.a("ChangePasscode", 2131230950), false);
            if (ad.i.length() == 0);
            for (paramInt = -3750202; ; paramInt = -16777216)
            {
              ((bg)localObject).setTextColor(paramInt);
              return paramViewGroup;
            }
          }
          paramView = paramViewGroup;
          if (paramInt != ai.l(ai.this))
            break;
          if (ad.m == 0)
            paramView = r.a("AutoLockDisabled", 2131230907, new Object[0]);
          while (true)
          {
            ((bg)localObject).a(r.a("AutoLock", 2131230906), paramView, true);
            ((bg)localObject).setTextColor(-16777216);
            return paramViewGroup;
            if (ad.m < 3600)
            {
              paramView = r.a("AutoLockInTime", 2131230908, new Object[] { r.b("Minutes", ad.m / 60) });
              continue;
            }
            if (ad.m < 86400)
            {
              paramView = r.a("AutoLockInTime", 2131230908, new Object[] { r.b("Hours", (int)Math.ceil(ad.m / 60.0F / 60.0F)) });
              continue;
            }
            paramView = r.a("AutoLockInTime", 2131230908, new Object[] { r.b("Days", (int)Math.ceil(ad.m / 60.0F / 60.0F / 24.0F)) });
          }
          if (i == 2)
          {
            if (paramView == null);
            for (paramViewGroup = new bf(this.b); ; paramViewGroup = paramView)
            {
              if (paramInt == ai.p(ai.this))
              {
                ((bf)paramViewGroup).setText(r.a("ChangePasscodeInfo", 2131230952));
                if (ai.q(ai.this) != -1)
                {
                  paramViewGroup.setBackgroundResource(2130837782);
                  return paramViewGroup;
                }
                paramViewGroup.setBackgroundResource(2130837783);
                return paramViewGroup;
              }
              paramView = paramViewGroup;
              if (paramInt != ai.q(ai.this))
                break;
              ((bf)paramViewGroup).setText(r.a("AutoLockInfo", 2131230909));
              paramViewGroup.setBackgroundResource(2130837783);
              return paramViewGroup;
            }
          }
          return paramView;
          label495: paramViewGroup = paramView;
        }
        label500: paramViewGroup = paramView;
      }
    }

    public int getViewTypeCount()
    {
      return 3;
    }

    public boolean hasStableIds()
    {
      return false;
    }

    public boolean isEmpty()
    {
      return false;
    }

    public boolean isEnabled(int paramInt)
    {
      return (paramInt == ai.j(ai.this)) || (paramInt == ai.m(ai.this)) || (paramInt == ai.l(ai.this)) || ((ad.i.length() != 0) && (paramInt == ai.i(ai.this)));
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.ai
 * JD-Core Version:    0.6.0
 */