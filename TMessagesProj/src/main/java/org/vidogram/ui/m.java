package org.vidogram.ui;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.text.Editable;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import java.util.concurrent.Semaphore;
import org.vidogram.messenger.ad;
import org.vidogram.messenger.h;
import org.vidogram.messenger.r;
import org.vidogram.messenger.w;
import org.vidogram.messenger.y;
import org.vidogram.messenger.y.b;
import org.vidogram.tgnet.g.ad;
import org.vidogram.tgnet.g.az;
import org.vidogram.tgnet.g.fs;
import org.vidogram.tgnet.g.i;
import org.vidogram.tgnet.g.j;
import org.vidogram.tgnet.g.m;
import org.vidogram.tgnet.g.x;
import org.vidogram.ui.Components.BackupImageView;
import org.vidogram.ui.Components.b;
import org.vidogram.ui.Components.c.a;
import org.vidogram.ui.a.a.a;
import org.vidogram.ui.a.g;
import org.vidogram.ui.c.ap;
import org.vidogram.ui.c.ba;
import org.vidogram.ui.c.bf;
import org.vidogram.ui.c.bg;

public class m extends g
  implements y.b, c.a
{
  private View i;
  private EditText j;
  private EditText k;
  private BackupImageView l;
  private b m = new b();
  private org.vidogram.ui.Components.c n = new org.vidogram.ui.Components.c();
  private ProgressDialog o;
  private bg p;
  private bg q;
  private g.x r;
  private g.i s;
  private g.j t;
  private int u;
  private g.ad v;
  private boolean w;
  private boolean x;
  private boolean y;

  public m(Bundle paramBundle)
  {
    super(paramBundle);
    this.u = paramBundle.getInt("chat_id", 0);
  }

  private void q()
  {
    String str;
    if ((this.s.v == null) || (this.s.v.length() == 0))
    {
      str = r.a("ChannelTypePrivate", 2131231035);
      if (!this.s.r)
        break label129;
      this.p.a(r.a("GroupType", 2131231280), str, false);
    }
    while (true)
    {
      if ((!this.s.c) || ((this.t != null) && (!this.t.d)))
        break label148;
      this.p.setOnClickListener(new View.OnClickListener()
      {
        public void onClick(View paramView)
        {
          paramView = new Bundle();
          paramView.putInt("chat_id", m.a(m.this));
          paramView = new n(paramView);
          paramView.a(m.g(m.this));
          m.this.a(paramView);
        }
      });
      this.p.setTextColor(-14606047);
      this.p.setTextValueColor(-13660983);
      return;
      str = r.a("ChannelTypePublic", 2131231036);
      break;
      label129: this.p.a(r.a("ChannelType", 2131231034), str, false);
    }
    label148: this.p.setOnClickListener(null);
    this.p.setTextColor(-5723992);
    this.p.setTextValueColor(-5723992);
  }

  private void r()
  {
    if (this.q == null)
      return;
    if (this.t != null)
    {
      this.q.a(r.a("ChannelAdministrators", 2131230966), String.format("%d", new Object[] { Integer.valueOf(this.t.h) }), false);
      return;
    }
    this.q.a(r.a("ChannelAdministrators", 2131230966), false);
  }

  public View a(Context paramContext)
  {
    this.d.setBackButtonImage(2130837794);
    this.d.setAllowOverlayTitle(true);
    this.d.setActionBarMenuOnItemClick(new a.a()
    {
      public void a(int paramInt)
      {
        if (paramInt == -1)
          m.this.d();
        do
          return;
        while ((paramInt != 1) || (m.b(m.this)));
        if (m.c(m.this).length() == 0)
        {
          Vibrator localVibrator = (Vibrator)m.this.l().getSystemService("vibrator");
          if (localVibrator != null)
            localVibrator.vibrate(200L);
          org.vidogram.messenger.a.a(m.c(m.this), 2.0F, 0);
          return;
        }
        m.a(m.this, true);
        if (m.d(m.this).b != null)
        {
          m.b(m.this, true);
          m.a(m.this, new ProgressDialog(m.this.l()));
          m.e(m.this).setMessage(r.a("Loading", 2131231394));
          m.e(m.this).setCanceledOnTouchOutside(false);
          m.e(m.this).setCancelable(false);
          m.e(m.this).setButton(-2, r.a("Cancel", 2131230943), new DialogInterface.OnClickListener()
          {
            public void onClick(DialogInterface paramDialogInterface, int paramInt)
            {
              m.b(m.this, false);
              m.a(m.this, null);
              m.a(m.this, false);
              try
              {
                paramDialogInterface.dismiss();
                return;
              }
              catch (Exception paramDialogInterface)
              {
                org.vidogram.messenger.n.a("tmessages", paramDialogInterface);
              }
            }
          });
          m.e(m.this).show();
          return;
        }
        if (!m.f(m.this).i.equals(m.c(m.this).getText().toString()))
          org.vidogram.messenger.v.a().b(m.a(m.this), m.c(m.this).getText().toString());
        if ((m.g(m.this) != null) && (!m.g(m.this).f.equals(m.h(m.this).getText().toString())))
          org.vidogram.messenger.v.a().a(m.a(m.this), m.h(m.this).getText().toString(), m.g(m.this));
        if (m.i(m.this) != m.f(m.this).y)
        {
          m.f(m.this).y = true;
          org.vidogram.messenger.v.a().b(m.a(m.this), m.i(m.this));
        }
        if (m.j(m.this) != null)
          org.vidogram.messenger.v.a().a(m.a(m.this), m.j(m.this));
        while (true)
        {
          m.this.d();
          return;
          if ((m.k(m.this) != null) || (!(m.f(m.this).j instanceof g.fs)))
            continue;
          org.vidogram.messenger.v.a().a(m.a(m.this), null);
        }
      }
    });
    this.i = this.d.a().b(1, 2130837825, org.vidogram.messenger.a.a(56.0F));
    this.b = new ScrollView(paramContext);
    this.b.setBackgroundColor(-986896);
    Object localObject1 = (ScrollView)this.b;
    ((ScrollView)localObject1).setFillViewport(true);
    LinearLayout localLinearLayout = new LinearLayout(paramContext);
    ((ScrollView)localObject1).addView(localLinearLayout, new FrameLayout.LayoutParams(-1, -2));
    localLinearLayout.setOrientation(1);
    this.d.setTitle(r.a("ChannelEdit", 2131230982));
    Object localObject2 = new LinearLayout(paramContext);
    ((LinearLayout)localObject2).setOrientation(1);
    ((LinearLayout)localObject2).setBackgroundColor(-1);
    localLinearLayout.addView((View)localObject2, org.vidogram.ui.Components.v.b(-1, -2));
    localObject1 = new FrameLayout(paramContext);
    ((LinearLayout)localObject2).addView((View)localObject1, org.vidogram.ui.Components.v.b(-1, -2));
    this.l = new BackupImageView(paramContext);
    this.l.setRoundRadius(org.vidogram.messenger.a.a(32.0F));
    this.m.a(5, null, null, false);
    this.m.c(true);
    localObject2 = this.l;
    int i1;
    float f1;
    label265: float f2;
    if (r.a)
    {
      i1 = 5;
      if (!r.a)
        break label1407;
      f1 = 0.0F;
      if (!r.a)
        break label1414;
      f2 = 16.0F;
      label275: ((FrameLayout)localObject1).addView((View)localObject2, org.vidogram.ui.Components.v.a(64, 64.0F, i1 | 0x30, f1, 12.0F, f2, 12.0F));
      this.l.setOnClickListener(new View.OnClickListener()
      {
        public void onClick(View paramView)
        {
          if (m.this.l() == null)
            return;
          AlertDialog.Builder localBuilder = new AlertDialog.Builder(m.this.l());
          if (m.k(m.this) != null)
          {
            paramView = new CharSequence[3];
            paramView[0] = r.a("FromCamera", 2131231263);
            paramView[1] = r.a("FromGalley", 2131231270);
            paramView[2] = r.a("DeletePhoto", 2131231133);
          }
          while (true)
          {
            localBuilder.setItems(paramView, new DialogInterface.OnClickListener()
            {
              public void onClick(DialogInterface paramDialogInterface, int paramInt)
              {
                if (paramInt == 0)
                  m.d(m.this).b();
                do
                {
                  return;
                  if (paramInt != 1)
                    continue;
                  m.d(m.this).c();
                  return;
                }
                while (paramInt != 2);
                m.a(m.this, null);
                m.a(m.this, null);
                m.m(m.this).a(m.k(m.this), "50_50", m.l(m.this));
              }
            });
            m.this.b(localBuilder.create());
            return;
            paramView = new CharSequence[2];
            paramView[0] = r.a("FromCamera", 2131231263);
            paramView[1] = r.a("FromGalley", 2131231270);
          }
        }
      });
      this.j = new EditText(paramContext);
      if (!this.s.r)
        break label1419;
      this.j.setHint(r.a("GroupName", 2131231278));
      label356: this.j.setMaxLines(4);
      localObject2 = this.j;
      if (!r.a)
        break label1438;
      i1 = 5;
      label379: ((EditText)localObject2).setGravity(i1 | 0x10);
      this.j.setTextSize(1, 16.0F);
      this.j.setHintTextColor(-6842473);
      this.j.setImeOptions(268435456);
      this.j.setInputType(16385);
      this.j.setPadding(0, 0, 0, org.vidogram.messenger.a.a(8.0F));
      localObject2 = new InputFilter.LengthFilter(100);
      this.j.setFilters(new InputFilter[] { localObject2 });
      org.vidogram.messenger.a.a(this.j);
      this.j.setTextColor(-14606047);
      localObject2 = this.j;
      if (!r.a)
        break label1444;
      f1 = 16.0F;
      label505: if (!r.a)
        break label1451;
      f2 = 96.0F;
      label515: ((FrameLayout)localObject1).addView((View)localObject2, org.vidogram.ui.Components.v.a(-1, -2.0F, 16, f1, 0.0F, f2, 0.0F));
      this.j.addTextChangedListener(new TextWatcher()
      {
        public void afterTextChanged(Editable paramEditable)
        {
          b localb = m.l(m.this);
          if (m.c(m.this).length() > 0);
          for (paramEditable = m.c(m.this).getText().toString(); ; paramEditable = null)
          {
            localb.a(5, paramEditable, null, false);
            m.m(m.this).invalidate();
            return;
          }
        }

        public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
        {
        }

        public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
        {
        }
      });
      localObject1 = new View(paramContext);
      ((View)localObject1).setBackgroundColor(-3158065);
      localLinearLayout.addView((View)localObject1, new LinearLayout.LayoutParams(-1, 1));
      localObject1 = new LinearLayout(paramContext);
      ((LinearLayout)localObject1).setOrientation(1);
      ((LinearLayout)localObject1).setBackgroundColor(-1);
      localLinearLayout.addView((View)localObject1, org.vidogram.ui.Components.v.b(-1, -2));
      this.k = new EditText(paramContext);
      this.k.setTextSize(1, 16.0F);
      this.k.setHintTextColor(-6842473);
      this.k.setTextColor(-14606047);
      this.k.setPadding(0, 0, 0, org.vidogram.messenger.a.a(6.0F));
      this.k.setBackgroundDrawable(null);
      localObject2 = this.k;
      if (!r.a)
        break label1458;
      i1 = 5;
      label700: ((EditText)localObject2).setGravity(i1);
      this.k.setInputType(180225);
      this.k.setImeOptions(6);
      localObject2 = new InputFilter.LengthFilter(255);
      this.k.setFilters(new InputFilter[] { localObject2 });
      this.k.setHint(r.a("DescriptionOptionalPlaceholder", 2131231139));
      org.vidogram.messenger.a.a(this.k);
      ((LinearLayout)localObject1).addView(this.k, org.vidogram.ui.Components.v.a(-1, -2, 17.0F, 12.0F, 17.0F, 6.0F));
      this.k.setOnEditorActionListener(new TextView.OnEditorActionListener()
      {
        public boolean onEditorAction(TextView paramTextView, int paramInt, KeyEvent paramKeyEvent)
        {
          if ((paramInt == 6) && (m.n(m.this) != null))
          {
            m.n(m.this).performClick();
            return true;
          }
          return false;
        }
      });
      this.k.addTextChangedListener(new TextWatcher()
      {
        public void afterTextChanged(Editable paramEditable)
        {
        }

        public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
        {
        }

        public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
        {
        }
      });
      localObject1 = new ap(paramContext);
      ((ap)localObject1).setSize(20);
      localLinearLayout.addView((View)localObject1, org.vidogram.ui.Components.v.b(-1, -2));
      if ((this.s.r) || (!this.s.r))
      {
        localObject1 = new FrameLayout(paramContext);
        ((FrameLayout)localObject1).setBackgroundColor(-1);
        localLinearLayout.addView((View)localObject1, org.vidogram.ui.Components.v.b(-1, -2));
        this.p = new bg(paramContext);
        q();
        this.p.setBackgroundResource(2130837946);
        ((FrameLayout)localObject1).addView(this.p, org.vidogram.ui.Components.v.a(-1, -2.0F));
        localObject1 = new View(paramContext);
        ((View)localObject1).setBackgroundColor(-3158065);
        localLinearLayout.addView((View)localObject1, new LinearLayout.LayoutParams(-1, 1));
        localObject1 = new FrameLayout(paramContext);
        ((FrameLayout)localObject1).setBackgroundColor(-1);
        localLinearLayout.addView((View)localObject1, org.vidogram.ui.Components.v.b(-1, -2));
        if (this.s.r)
          break label1464;
        localObject2 = new ba(paramContext);
        ((ba)localObject2).setBackgroundResource(2130837946);
        ((ba)localObject2).a(r.a("ChannelSignMessages", 2131231031), this.w, false);
        ((FrameLayout)localObject1).addView((View)localObject2, org.vidogram.ui.Components.v.a(-1, -2.0F));
        ((ba)localObject2).setOnClickListener(new View.OnClickListener()
        {
          public void onClick(View paramView)
          {
            m localm = m.this;
            if (!m.i(m.this));
            for (boolean bool = true; ; bool = false)
            {
              m.c(localm, bool);
              ((ba)paramView).setChecked(m.i(m.this));
              return;
            }
          }
        });
        localObject1 = new bf(paramContext);
        ((bf)localObject1).setBackgroundResource(2130837782);
        ((bf)localObject1).setText(r.a("ChannelSignMessagesInfo", 2131231032));
        localLinearLayout.addView((View)localObject1, org.vidogram.ui.Components.v.b(-1, -2));
      }
      label1137: if (this.s.c)
      {
        localObject1 = new FrameLayout(paramContext);
        ((FrameLayout)localObject1).setBackgroundColor(-1);
        localLinearLayout.addView((View)localObject1, org.vidogram.ui.Components.v.b(-1, -2));
        localObject2 = new bg(paramContext);
        ((bg)localObject2).setTextColor(-1229511);
        ((bg)localObject2).setBackgroundResource(2130837946);
        if (!this.s.r)
          break label1572;
        ((bg)localObject2).a(r.a("DeleteMega", 2131231131), false);
        ((FrameLayout)localObject1).addView((View)localObject2, org.vidogram.ui.Components.v.a(-1, -2.0F));
        ((bg)localObject2).setOnClickListener(new View.OnClickListener()
        {
          public void onClick(View paramView)
          {
            paramView = new AlertDialog.Builder(m.this.l());
            if (m.f(m.this).r)
              paramView.setMessage(r.a("MegaDeleteAlert", 2131231414));
            while (true)
            {
              paramView.setTitle(r.a("AppName", 2131230856));
              paramView.setPositiveButton(r.a("OK", 2131231604), new DialogInterface.OnClickListener()
              {
                public void onClick(DialogInterface paramDialogInterface, int paramInt)
                {
                  y.a().b(this, y.d);
                  if (org.vidogram.messenger.a.c())
                    y.a().a(y.d, new Object[] { Long.valueOf(-m.a(m.this)) });
                  while (true)
                  {
                    org.vidogram.messenger.v.a().a(m.a(m.this), org.vidogram.messenger.v.a().a(Integer.valueOf(ad.c())), m.g(m.this));
                    m.this.d();
                    return;
                    y.a().a(y.d, new Object[0]);
                  }
                }
              });
              paramView.setNegativeButton(r.a("Cancel", 2131230943), null);
              m.this.b(paramView.create());
              return;
              paramView.setMessage(r.a("ChannelDeleteAlert", 2131230979));
            }
          }
        });
        paramContext = new bf(paramContext);
        paramContext.setBackgroundResource(2130837783);
        if (!this.s.r)
          break label1590;
        paramContext.setText(r.a("MegaDeleteInfo", 2131231415));
        localLinearLayout.addView(paramContext, org.vidogram.ui.Components.v.b(-1, -2));
      }
      label1227: this.j.setText(this.s.i);
      label1293: this.j.setSelection(this.j.length());
      if (this.t != null)
        this.k.setText(this.t.f);
      if (this.s.j == null)
        break label1606;
      this.r = this.s.j.b;
      this.l.a(this.r, "50_50", this.m);
    }
    while (true)
    {
      return this.b;
      i1 = 3;
      break;
      label1407: f1 = 16.0F;
      break label265;
      label1414: f2 = 0.0F;
      break label275;
      label1419: this.j.setHint(r.a("EnterChannelName", 2131231179));
      break label356;
      label1438: i1 = 3;
      break label379;
      label1444: f1 = 96.0F;
      break label505;
      label1451: f2 = 16.0F;
      break label515;
      label1458: i1 = 3;
      break label700;
      label1464: this.q = new bg(paramContext);
      r();
      this.q.setBackgroundResource(2130837946);
      ((FrameLayout)localObject1).addView(this.q, org.vidogram.ui.Components.v.a(-1, -2.0F));
      this.q.setOnClickListener(new View.OnClickListener()
      {
        public void onClick(View paramView)
        {
          paramView = new Bundle();
          paramView.putInt("chat_id", m.a(m.this));
          paramView.putInt("type", 1);
          m.this.a(new p(paramView));
        }
      });
      localObject1 = new ap(paramContext);
      ((ap)localObject1).setSize(20);
      localLinearLayout.addView((View)localObject1, org.vidogram.ui.Components.v.b(-1, -2));
      if (this.s.c)
        break label1137;
      ((ap)localObject1).setBackgroundResource(2130837783);
      break label1137;
      label1572: ((bg)localObject2).a(r.a("ChannelDelete", 2131230978), false);
      break label1227;
      label1590: paramContext.setText(r.a("ChannelDeleteInfo", 2131230980));
      break label1293;
      label1606: this.l.setImageDrawable(this.m);
    }
  }

  public void a(int paramInt1, int paramInt2, Intent paramIntent)
  {
    this.n.a(paramInt1, paramInt2, paramIntent);
  }

  public void a(int paramInt, Object[] paramArrayOfObject)
  {
    if (paramInt == y.n)
    {
      paramArrayOfObject = (g.j)paramArrayOfObject[0];
      if (paramArrayOfObject.e == this.u)
      {
        if (this.t == null)
          this.k.setText(paramArrayOfObject.f);
        this.t = paramArrayOfObject;
        r();
        q();
      }
    }
    do
      return;
    while ((paramInt != y.b) || ((((Integer)paramArrayOfObject[0]).intValue() & 0x2000) == 0));
    q();
  }

  public void a(Bundle paramBundle)
  {
    if ((this.n != null) && (this.n.a != null))
      paramBundle.putString("path", this.n.a);
    if (this.j != null)
    {
      String str = this.j.getText().toString();
      if ((str != null) && (str.length() != 0))
        paramBundle.putString("nameTextView", str);
    }
  }

  public void a(g.ad paramad, g.az paramaz1, g.az paramaz2)
  {
    org.vidogram.messenger.a.a(new Runnable(paramad, paramaz1)
    {
      public void run()
      {
        m.a(m.this, this.a);
        m.a(m.this, this.b.c);
        m.m(m.this).a(m.k(m.this), "50_50", m.l(m.this));
        if (m.o(m.this));
        try
        {
          if ((m.e(m.this) != null) && (m.e(m.this).isShowing()))
          {
            m.e(m.this).dismiss();
            m.a(m.this, null);
          }
          m.n(m.this).performClick();
          return;
        }
        catch (Exception localException)
        {
          while (true)
            org.vidogram.messenger.n.a("tmessages", localException);
        }
      }
    });
  }

  public void a(g.j paramj)
  {
    this.t = paramj;
  }

  public void b(Bundle paramBundle)
  {
    if (this.n != null)
      this.n.a = paramBundle.getString("path");
  }

  public boolean f()
  {
    this.s = org.vidogram.messenger.v.a().b(Integer.valueOf(this.u));
    if (this.s == null)
    {
      Semaphore localSemaphore = new Semaphore(0);
      w.a().c().b(new Runnable(localSemaphore)
      {
        public void run()
        {
          m.a(m.this, w.a().i(m.a(m.this)));
          this.a.release();
        }
      });
      try
      {
        localSemaphore.acquire();
        if (this.s != null)
        {
          org.vidogram.messenger.v.a().a(this.s, true);
          if (this.t != null)
            break label128;
          w.a().a(this.u, localSemaphore, false, false);
        }
      }
      catch (Exception localException2)
      {
        try
        {
          localSemaphore.acquire();
          if (this.t == null)
          {
            return false;
            localException2 = localException2;
            org.vidogram.messenger.n.a("tmessages", localException2);
          }
        }
        catch (Exception localException1)
        {
          while (true)
            org.vidogram.messenger.n.a("tmessages", localException1);
        }
      }
    }
    label128: this.n.d = this;
    this.n.e = this;
    this.w = this.s.y;
    y.a().a(this, y.n);
    y.a().a(this, y.b);
    return super.f();
  }

  public void g()
  {
    super.g();
    if (this.n != null)
      this.n.a();
    y.a().b(this, y.n);
    y.a().b(this, y.b);
    org.vidogram.messenger.a.b(l(), this.e);
  }

  public void i()
  {
    super.i();
    org.vidogram.messenger.a.a(l(), this.e);
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.m
 * JD-Core Version:    0.6.0
 */