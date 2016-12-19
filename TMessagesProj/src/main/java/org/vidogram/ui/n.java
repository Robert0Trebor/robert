package org.vidogram.ui;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.os.Vibrator;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.concurrent.Semaphore;
import org.vidogram.messenger.ApplicationLoader;
import org.vidogram.messenger.h;
import org.vidogram.messenger.r;
import org.vidogram.messenger.y;
import org.vidogram.messenger.y.b;
import org.vidogram.tgnet.ConnectionsManager;
import org.vidogram.tgnet.f;
import org.vidogram.tgnet.g.ed;
import org.vidogram.tgnet.g.em;
import org.vidogram.tgnet.g.fk;
import org.vidogram.tgnet.g.i;
import org.vidogram.tgnet.g.j;
import org.vidogram.tgnet.g.jk;
import org.vidogram.tgnet.g.w;
import org.vidogram.ui.a.a.a;
import org.vidogram.ui.a.g;
import org.vidogram.ui.c.al;
import org.vidogram.ui.c.ap;
import org.vidogram.ui.c.ay;
import org.vidogram.ui.c.b;
import org.vidogram.ui.c.bf;
import org.vidogram.ui.c.z;

public class n extends g
  implements y.b
{
  private z A;
  private int B;
  private String C;
  private Runnable D;
  private boolean E;
  private g.i F;
  private int G;
  private boolean H;
  private LinearLayout i;
  private LinearLayout j;
  private LinearLayout k;
  private ay l;
  private al m;
  private al n;
  private ap o;
  private bf p;
  private TextView q;
  private org.vidogram.ui.c.w r;
  private EditText s;
  private boolean t;
  private boolean u;
  private g.w v;
  private boolean w = true;
  private boolean x;
  private bf y;
  private ArrayList<b> z = new ArrayList();

  public n(Bundle paramBundle)
  {
    super(paramBundle);
    this.G = paramBundle.getInt("chat_id", 0);
  }

  private boolean a(String paramString)
  {
    if ((paramString != null) && (paramString.length() > 0))
      this.q.setVisibility(0);
    while (true)
    {
      if (this.D != null)
      {
        org.vidogram.messenger.a.b(this.D);
        this.D = null;
        this.C = null;
        if (this.B != 0)
          ConnectionsManager.a().a(this.B, true);
      }
      this.E = false;
      if (paramString == null)
        break;
      if ((paramString.startsWith("_")) || (paramString.endsWith("_")))
      {
        this.q.setText(r.a("LinkInvalid", 2131231386));
        this.q.setTextColor(-3198928);
        return false;
        this.q.setVisibility(8);
        continue;
      }
      int i1 = 0;
      while (i1 < paramString.length())
      {
        int i2 = paramString.charAt(i1);
        if ((i1 == 0) && (i2 >= 48) && (i2 <= 57))
        {
          if (this.F.r)
          {
            this.q.setText(r.a("LinkInvalidStartNumberMega", 2131231391));
            this.q.setTextColor(-3198928);
            return false;
          }
          this.q.setText(r.a("LinkInvalidStartNumber", 2131231390));
          this.q.setTextColor(-3198928);
          return false;
        }
        if (((i2 < 48) || (i2 > 57)) && ((i2 < 97) || (i2 > 122)) && ((i2 < 65) || (i2 > 90)) && (i2 != 95))
        {
          this.q.setText(r.a("LinkInvalid", 2131231386));
          this.q.setTextColor(-3198928);
          return false;
        }
        i1 += 1;
      }
    }
    if ((paramString == null) || (paramString.length() < 5))
    {
      if (this.F.r)
      {
        this.q.setText(r.a("LinkInvalidShortMega", 2131231389));
        this.q.setTextColor(-3198928);
        return false;
      }
      this.q.setText(r.a("LinkInvalidShort", 2131231388));
      this.q.setTextColor(-3198928);
      return false;
    }
    if (paramString.length() > 32)
    {
      this.q.setText(r.a("LinkInvalidLong", 2131231387));
      this.q.setTextColor(-3198928);
      return false;
    }
    this.q.setText(r.a("LinkChecking", 2131231382));
    this.q.setTextColor(-9605774);
    this.C = paramString;
    this.D = new Runnable(paramString)
    {
      public void run()
      {
        g.ed localed = new g.ed();
        localed.d = this.a;
        localed.c = org.vidogram.messenger.v.b(n.a(n.this));
        n.a(n.this, ConnectionsManager.a().a(localed, new org.vidogram.tgnet.c()
        {
        }
        , 2));
      }
    };
    org.vidogram.messenger.a.a(this.D, 300L);
    return true;
  }

  private void q()
  {
    int i2 = 8;
    boolean bool = false;
    if (this.o == null)
      return;
    if ((!this.t) && (!this.w))
    {
      this.p.setText(r.a("ChangePublicLimitReached", 2131230957));
      this.p.setTextColor(-3198928);
      this.j.setVisibility(8);
      this.o.setVisibility(8);
      if (this.x)
      {
        this.A.setVisibility(0);
        i1 = 0;
        while (i1 < this.z.size())
        {
          ((b)this.z.get(i1)).setVisibility(8);
          i1 += 1;
        }
        this.p.setBackgroundResource(2130837783);
        this.y.setVisibility(8);
      }
      while (true)
      {
        localObject1 = this.m;
        if (!this.t)
          bool = true;
        ((al)localObject1).a(bool, true);
        this.n.a(this.t, true);
        this.s.clearFocus();
        org.vidogram.messenger.a.b(this.s);
        return;
        this.p.setBackgroundResource(2130837782);
        this.A.setVisibility(8);
        i1 = 0;
        while (i1 < this.z.size())
        {
          ((b)this.z.get(i1)).setVisibility(0);
          i1 += 1;
        }
        this.y.setVisibility(0);
      }
    }
    this.p.setTextColor(-8355712);
    this.o.setVisibility(0);
    this.y.setVisibility(8);
    this.p.setBackgroundResource(2130837783);
    int i1 = 0;
    while (i1 < this.z.size())
    {
      ((b)this.z.get(i1)).setVisibility(8);
      i1 += 1;
    }
    this.j.setVisibility(0);
    this.A.setVisibility(8);
    Object localObject2;
    if (this.F.r)
    {
      localObject2 = this.p;
      if (this.t)
      {
        localObject1 = r.a("MegaPrivateLinkHelp", 2131231419);
        label376: ((bf)localObject2).setText((CharSequence)localObject1);
        localObject2 = this.r;
        if (!this.t)
          break label563;
        localObject1 = r.a("ChannelInviteLinkTitle", 2131230984);
        label407: ((org.vidogram.ui.c.w)localObject2).setText((String)localObject1);
        localObject1 = this.k;
        if (!this.t)
          break label670;
        i1 = 8;
        label430: ((LinearLayout)localObject1).setVisibility(i1);
        localObject1 = this.l;
        if (!this.t)
          break label675;
        i1 = 0;
        label451: ((ay)localObject1).setVisibility(i1);
        localObject1 = this.j;
        if (!this.t)
          break label681;
        i1 = 0;
        label472: ((LinearLayout)localObject1).setPadding(0, 0, 0, i1);
        localObject2 = this.l;
        if (this.v == null)
          break label691;
      }
    }
    label656: label670: label675: label681: label691: for (Object localObject1 = this.v.b; ; localObject1 = r.a("Loading", 2131231394))
    {
      ((ay)localObject2).a((String)localObject1, false);
      localObject1 = this.q;
      i1 = i2;
      if (!this.t)
      {
        i1 = i2;
        if (this.q.length() != 0)
          i1 = 0;
      }
      ((TextView)localObject1).setVisibility(i1);
      break;
      localObject1 = r.a("MegaUsernameHelp", 2131231422);
      break label376;
      label563: localObject1 = r.a("ChannelLinkTitle", 2131230991);
      break label407;
      localObject2 = this.p;
      if (this.t)
      {
        localObject1 = r.a("ChannelPrivateLinkHelp", 2131231024);
        label601: ((bf)localObject2).setText((CharSequence)localObject1);
        localObject2 = this.r;
        if (!this.t)
          break label656;
      }
      for (localObject1 = r.a("ChannelInviteLinkTitle", 2131230984); ; localObject1 = r.a("ChannelLinkTitle", 2131230991))
      {
        ((org.vidogram.ui.c.w)localObject2).setText((String)localObject1);
        break;
        localObject1 = r.a("ChannelUsernameHelp", 2131231043);
        break label601;
      }
      i1 = 0;
      break label430;
      i1 = 8;
      break label451;
      i1 = org.vidogram.messenger.a.a(7.0F);
      break label472;
    }
  }

  private void r()
  {
    if ((this.u) || (this.v != null))
      return;
    this.u = true;
    g.em localem = new g.em();
    localem.c = org.vidogram.messenger.v.b(this.G);
    ConnectionsManager.a().a(localem, new org.vidogram.tgnet.c()
    {
    });
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
          n.this.d();
        do
          return;
        while ((paramInt != 1) || (n.b(n.this)));
        Object localObject;
        if ((!n.c(n.this)) && (((n.d(n.this).v == null) && (n.e(n.this).length() != 0)) || ((n.d(n.this).v != null) && (!n.d(n.this).v.equalsIgnoreCase(n.e(n.this).getText().toString())) && (n.e(n.this).length() != 0) && (!n.f(n.this)))))
        {
          localObject = (Vibrator)n.this.l().getSystemService("vibrator");
          if (localObject != null)
            ((Vibrator)localObject).vibrate(200L);
          org.vidogram.messenger.a.a(n.g(n.this), 2.0F, 0);
          return;
        }
        n.a(n.this, true);
        if (n.d(n.this).v != null)
        {
          localObject = n.d(n.this).v;
          if (!n.c(n.this))
            break label251;
        }
        label251: for (String str = ""; ; str = n.e(n.this).getText().toString())
        {
          if (!((String)localObject).equals(str))
            org.vidogram.messenger.v.a().a(n.a(n.this), str);
          n.this.d();
          return;
          localObject = "";
          break;
        }
      }
    });
    this.d.a().b(1, 2130837825, org.vidogram.messenger.a.a(56.0F));
    this.b = new ScrollView(paramContext);
    this.b.setBackgroundColor(-986896);
    Object localObject1 = (ScrollView)this.b;
    ((ScrollView)localObject1).setFillViewport(true);
    this.i = new LinearLayout(paramContext);
    ((ScrollView)localObject1).addView(this.i, new FrameLayout.LayoutParams(-1, -2));
    this.i.setOrientation(1);
    Object localObject2;
    String str1;
    String str2;
    boolean bool;
    if (this.F.r)
    {
      this.d.setTitle(r.a("GroupType", 2131231280));
      localObject1 = new LinearLayout(paramContext);
      ((LinearLayout)localObject1).setOrientation(1);
      ((LinearLayout)localObject1).setBackgroundColor(-1);
      this.i.addView((View)localObject1, org.vidogram.ui.Components.v.b(-1, -2));
      this.m = new al(paramContext);
      this.m.setBackgroundResource(2130837946);
      if (!this.F.r)
        break label1115;
      localObject2 = this.m;
      str1 = r.a("MegaPublic", 2131231420);
      str2 = r.a("MegaPublicInfo", 2131231421);
      if (this.t)
        break label1110;
      bool = true;
      label262: ((al)localObject2).a(str1, str2, bool, false);
      ((LinearLayout)localObject1).addView(this.m, org.vidogram.ui.Components.v.b(-1, -2));
      this.m.setOnClickListener(new View.OnClickListener()
      {
        public void onClick(View paramView)
        {
          if (!n.c(n.this))
            return;
          n.b(n.this, false);
          n.h(n.this);
        }
      });
      this.n = new al(paramContext);
      this.n.setBackgroundResource(2130837946);
      if (!this.F.r)
        break label1171;
      this.n.a(r.a("MegaPrivate", 2131231417), r.a("MegaPrivateInfo", 2131231418), this.t, false);
      label365: ((LinearLayout)localObject1).addView(this.n, org.vidogram.ui.Components.v.b(-1, -2));
      this.n.setOnClickListener(new View.OnClickListener()
      {
        public void onClick(View paramView)
        {
          if (n.c(n.this))
            return;
          n.b(n.this, true);
          n.h(n.this);
        }
      });
      this.o = new ap(paramContext);
      this.i.addView(this.o, org.vidogram.ui.Components.v.b(-1, -2));
      this.j = new LinearLayout(paramContext);
      this.j.setOrientation(1);
      this.j.setBackgroundColor(-1);
      this.i.addView(this.j, org.vidogram.ui.Components.v.b(-1, -2));
      this.r = new org.vidogram.ui.c.w(paramContext);
      this.j.addView(this.r);
      this.k = new LinearLayout(paramContext);
      this.k.setOrientation(0);
      this.j.addView(this.k, org.vidogram.ui.Components.v.a(-1, 36, 17.0F, 7.0F, 17.0F, 0.0F));
      localObject1 = new EditText(paramContext);
      ((EditText)localObject1).setText("telegram.me/");
      ((EditText)localObject1).setTextSize(1, 18.0F);
      ((EditText)localObject1).setHintTextColor(-6842473);
      ((EditText)localObject1).setTextColor(-14606047);
      ((EditText)localObject1).setMaxLines(1);
      ((EditText)localObject1).setLines(1);
      ((EditText)localObject1).setEnabled(false);
      ((EditText)localObject1).setBackgroundDrawable(null);
      ((EditText)localObject1).setPadding(0, 0, 0, 0);
      ((EditText)localObject1).setSingleLine(true);
      ((EditText)localObject1).setInputType(163840);
      ((EditText)localObject1).setImeOptions(6);
      this.k.addView((View)localObject1, org.vidogram.ui.Components.v.b(-2, 36));
      this.s = new EditText(paramContext);
      this.s.setTextSize(1, 18.0F);
      if (!this.t)
        this.s.setText(this.F.v);
      this.s.setHintTextColor(-6842473);
      this.s.setTextColor(-14606047);
      this.s.setMaxLines(1);
      this.s.setLines(1);
      this.s.setBackgroundDrawable(null);
      this.s.setPadding(0, 0, 0, 0);
      this.s.setSingleLine(true);
      this.s.setInputType(163872);
      this.s.setImeOptions(6);
      this.s.setHint(r.a("ChannelUsernamePlaceholder", 2131231044));
      org.vidogram.messenger.a.a(this.s);
      this.k.addView(this.s, org.vidogram.ui.Components.v.b(-1, 36));
      this.s.addTextChangedListener(new TextWatcher()
      {
        public void afterTextChanged(Editable paramEditable)
        {
        }

        public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
        {
        }

        public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
        {
          n.a(n.this, n.e(n.this).getText().toString());
        }
      });
      this.l = new ay(paramContext);
      this.l.setBackgroundResource(2130837946);
      this.j.addView(this.l);
      this.l.setOnClickListener(new View.OnClickListener()
      {
        public void onClick(View paramView)
        {
          if (n.i(n.this) == null)
            return;
          try
          {
            ((ClipboardManager)ApplicationLoader.a.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", n.i(n.this).b));
            Toast.makeText(n.this.l(), r.a("LinkCopied", 2131231383), 0).show();
            return;
          }
          catch (Exception paramView)
          {
            org.vidogram.messenger.n.a("tmessages", paramView);
          }
        }
      });
      this.q = new TextView(paramContext);
      this.q.setTextSize(1, 15.0F);
      localObject1 = this.q;
      if (!r.a)
        break label1204;
      i1 = 5;
      label918: ((TextView)localObject1).setGravity(i1);
      this.q.setVisibility(8);
      localObject1 = this.j;
      localObject2 = this.q;
      if (!r.a)
        break label1209;
    }
    label1171: label1204: label1209: for (int i1 = 5; ; i1 = 3)
    {
      ((LinearLayout)localObject1).addView((View)localObject2, org.vidogram.ui.Components.v.b(-2, -2, i1, 17, 3, 17, 7));
      this.p = new bf(paramContext);
      this.p.setBackgroundResource(2130837783);
      this.i.addView(this.p, org.vidogram.ui.Components.v.b(-1, -2));
      this.A = new z(paramContext);
      this.i.addView(this.A, org.vidogram.ui.Components.v.b(-1, -2));
      this.y = new bf(paramContext);
      this.y.setBackgroundResource(2130837783);
      this.i.addView(this.y, org.vidogram.ui.Components.v.b(-1, -2));
      q();
      return this.b;
      this.d.setTitle(r.a("ChannelType", 2131231034));
      break;
      label1110: bool = false;
      break label262;
      label1115: localObject2 = this.m;
      str1 = r.a("ChannelPublic", 2131231025);
      str2 = r.a("ChannelPublicInfo", 2131231027);
      if (!this.t);
      for (bool = true; ; bool = false)
      {
        ((al)localObject2).a(str1, str2, bool, false);
        break;
      }
      this.n.a(r.a("ChannelPrivate", 2131231022), r.a("ChannelPrivateInfo", 2131231023), this.t, false);
      break label365;
      i1 = 3;
      break label918;
    }
  }

  public void a(int paramInt, Object[] paramArrayOfObject)
  {
    if (paramInt == y.n)
    {
      paramArrayOfObject = (g.j)paramArrayOfObject[0];
      if (paramArrayOfObject.e == this.G)
      {
        this.v = paramArrayOfObject.o;
        q();
      }
    }
  }

  public void a(g.j paramj)
  {
    if (paramj != null)
    {
      if ((paramj.o instanceof g.fk))
        this.v = paramj.o;
    }
    else
      return;
    r();
  }

  public boolean f()
  {
    boolean bool1 = false;
    boolean bool2 = false;
    this.F = org.vidogram.messenger.v.a().b(Integer.valueOf(this.G));
    Object localObject;
    if (this.F == null)
    {
      localObject = new Semaphore(0);
      org.vidogram.messenger.w.a().c().b(new Runnable((Semaphore)localObject)
      {
        public void run()
        {
          n.a(n.this, org.vidogram.messenger.w.a().i(n.a(n.this)));
          this.a.release();
        }
      });
    }
    try
    {
      ((Semaphore)localObject).acquire();
      if (this.F != null)
      {
        org.vidogram.messenger.v.a().a(this.F, true);
        if (this.F.v != null)
        {
          bool1 = bool2;
          if (this.F.v.length() != 0);
        }
        else
        {
          bool1 = true;
        }
        this.t = bool1;
        if (this.t)
        {
          localObject = new g.ed();
          ((g.ed)localObject).d = "1";
          ((g.ed)localObject).c = new g.jk();
          ConnectionsManager.a().a((f)localObject, new org.vidogram.tgnet.c()
          {
          });
        }
        y.a().a(this, y.n);
        bool1 = super.f();
      }
      return bool1;
    }
    catch (Exception localException)
    {
      while (true)
        org.vidogram.messenger.n.a("tmessages", localException);
    }
  }

  public void g()
  {
    super.g();
    y.a().b(this, y.n);
    org.vidogram.messenger.a.b(l(), this.e);
  }

  public void i()
  {
    super.i();
    org.vidogram.messenger.a.a(l(), this.e);
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.n
 * JD-Core Version:    0.6.0
 */