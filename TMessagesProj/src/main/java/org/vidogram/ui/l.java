package org.vidogram.ui;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.ProgressDialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Vibrator;
import android.text.Editable;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import org.vidogram.messenger.ApplicationLoader;
import org.vidogram.messenger.ae;
import org.vidogram.messenger.n;
import org.vidogram.messenger.r;
import org.vidogram.messenger.y;
import org.vidogram.messenger.y.b;
import org.vidogram.tgnet.ConnectionsManager;
import org.vidogram.tgnet.g.ad;
import org.vidogram.tgnet.g.az;
import org.vidogram.tgnet.g.ed;
import org.vidogram.tgnet.g.em;
import org.vidogram.tgnet.g.eo;
import org.vidogram.tgnet.g.jk;
import org.vidogram.tgnet.g.vw;
import org.vidogram.tgnet.g.w;
import org.vidogram.tgnet.g.x;
import org.vidogram.ui.Components.BackupImageView;
import org.vidogram.ui.Components.c.a;
import org.vidogram.ui.Components.k;
import org.vidogram.ui.Components.x;
import org.vidogram.ui.a.a.a;
import org.vidogram.ui.a.g;
import org.vidogram.ui.b.f;
import org.vidogram.ui.b.o;
import org.vidogram.ui.c.al;
import org.vidogram.ui.c.ap;
import org.vidogram.ui.c.ay;
import org.vidogram.ui.c.bf;
import org.vidogram.ui.c.bh;
import org.vidogram.ui.c.w;
import org.vidogram.ui.c.z;

public class l extends g
  implements y.b, c.a
{
  private w A;
  private int B;
  private String C;
  private Runnable D;
  private boolean E;
  private boolean F;
  private boolean G;
  private g.w H;
  private boolean I;
  private bf J;
  private ArrayList<org.vidogram.ui.c.b> K = new ArrayList();
  private z L;
  private f M;
  private TextView N;
  private x O;
  private o P;
  private boolean Q;
  private boolean R;
  private HashMap<Integer, k> S = new HashMap();
  private ArrayList<k> T = new ArrayList();
  private int U;
  private boolean V;
  private CharSequence W;
  private int X;
  private int Y;
  private boolean Z = true;
  private g.ad aa;
  private boolean ab;
  private boolean ac;
  private View i;
  private EditText j;
  private ProgressDialog k;
  private ap l;
  private BackupImageView m;
  private org.vidogram.ui.Components.b n;
  private org.vidogram.ui.Components.c o;
  private EditText p;
  private g.x q;
  private String r;
  private LinearLayout s;
  private LinearLayout t;
  private LinearLayout u;
  private ay v;
  private al w;
  private al x;
  private bf y;
  private TextView z;

  public l(Bundle paramBundle)
  {
    super(paramBundle);
    this.X = paramBundle.getInt("step", 0);
    if (this.X == 0)
    {
      this.n = new org.vidogram.ui.Components.b();
      this.o = new org.vidogram.ui.Components.c();
      paramBundle = new g.ed();
      paramBundle.d = "1";
      paramBundle.c = new g.jk();
      ConnectionsManager.a().a(paramBundle, new org.vidogram.tgnet.c()
      {
      });
      return;
    }
    if (this.X == 1)
    {
      this.Z = paramBundle.getBoolean("canCreatePublic", true);
      if (this.Z)
        break label181;
    }
    while (true)
    {
      this.F = bool;
      if (!this.Z)
        s();
      this.Y = paramBundle.getInt("chat_id", 0);
      return;
      label181: bool = false;
    }
  }

  private k a(g.vw paramvw)
  {
    Object localObject2;
    Object localObject1;
    try
    {
      Object localObject3 = ((LayoutInflater)ApplicationLoader.a.getSystemService("layout_inflater")).inflate(2130968616, null);
      TextView localTextView = (TextView)((View)localObject3).findViewById(2131624078);
      localObject2 = ae.c(paramvw);
      localObject1 = localObject2;
      if (((String)localObject2).length() == 0)
      {
        localObject1 = localObject2;
        if (paramvw.i != null)
        {
          localObject1 = localObject2;
          if (paramvw.i.length() != 0)
            localObject1 = org.vidogram.a.b.a().e("+" + paramvw.i);
        }
      }
      localTextView.setText((String)localObject1 + ", ");
      int i1 = View.MeasureSpec.makeMeasureSpec(0, 0);
      ((View)localObject3).measure(i1, i1);
      ((View)localObject3).layout(0, 0, ((View)localObject3).getMeasuredWidth(), ((View)localObject3).getMeasuredHeight());
      localObject1 = Bitmap.createBitmap(((View)localObject3).getWidth(), ((View)localObject3).getHeight(), Bitmap.Config.ARGB_8888);
      localObject2 = new Canvas((Bitmap)localObject1);
      ((Canvas)localObject2).translate(-((View)localObject3).getScrollX(), -((View)localObject3).getScrollY());
      ((View)localObject3).draw((Canvas)localObject2);
      ((View)localObject3).setDrawingCacheEnabled(true);
      ((View)localObject3).getDrawingCache().copy(Bitmap.Config.ARGB_8888, true);
      ((View)localObject3).destroyDrawingCache();
      localObject2 = new BitmapDrawable((Bitmap)localObject1);
      ((BitmapDrawable)localObject2).setBounds(0, 0, ((Bitmap)localObject1).getWidth(), ((Bitmap)localObject1).getHeight());
      localObject1 = new SpannableStringBuilder("");
      localObject2 = new k((Drawable)localObject2, 1);
      this.T.add(localObject2);
      this.S.put(Integer.valueOf(paramvw.d), localObject2);
      paramvw = this.T.iterator();
      while (paramvw.hasNext())
      {
        localObject3 = (ImageSpan)paramvw.next();
        ((SpannableStringBuilder)localObject1).append("<<");
        ((SpannableStringBuilder)localObject1).setSpan(localObject3, ((SpannableStringBuilder)localObject1).length() - 2, ((SpannableStringBuilder)localObject1).length(), 33);
      }
    }
    catch (Exception paramvw)
    {
      n.a("tmessages", paramvw);
      return null;
    }
    this.j.setText((CharSequence)localObject1);
    this.j.setSelection(((SpannableStringBuilder)localObject1).length());
    return (k)(k)(k)localObject2;
  }

  private void a(int paramInt)
  {
    if (this.O == null);
    while (true)
    {
      return;
      int i2 = this.O.getChildCount();
      int i1 = 0;
      while (i1 < i2)
      {
        View localView = this.O.getChildAt(i1);
        if ((localView instanceof bh))
          ((bh)localView).a(paramInt);
        i1 += 1;
      }
    }
  }

  private boolean a(String paramString)
  {
    if ((paramString != null) && (paramString.length() > 0))
      this.z.setVisibility(0);
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
        this.z.setText(r.a("LinkInvalid", 2131231386));
        this.z.setTextColor(-3198928);
        return false;
        this.z.setVisibility(8);
        continue;
      }
      int i1 = 0;
      while (i1 < paramString.length())
      {
        int i2 = paramString.charAt(i1);
        if ((i1 == 0) && (i2 >= 48) && (i2 <= 57))
        {
          this.z.setText(r.a("LinkInvalidStartNumber", 2131231390));
          this.z.setTextColor(-3198928);
          return false;
        }
        if (((i2 < 48) || (i2 > 57)) && ((i2 < 97) || (i2 > 122)) && ((i2 < 65) || (i2 > 90)) && (i2 != 95))
        {
          this.z.setText(r.a("LinkInvalid", 2131231386));
          this.z.setTextColor(-3198928);
          return false;
        }
        i1 += 1;
      }
    }
    if ((paramString == null) || (paramString.length() < 5))
    {
      this.z.setText(r.a("LinkInvalidShort", 2131231388));
      this.z.setTextColor(-3198928);
      return false;
    }
    if (paramString.length() > 32)
    {
      this.z.setText(r.a("LinkInvalidLong", 2131231387));
      this.z.setTextColor(-3198928);
      return false;
    }
    this.z.setText(r.a("LinkChecking", 2131231382));
    this.z.setTextColor(-9605774);
    this.C = paramString;
    this.D = new Runnable(paramString)
    {
      public void run()
      {
        g.ed localed = new g.ed();
        localed.d = this.a;
        localed.c = org.vidogram.messenger.v.b(l.j(l.this));
        l.b(l.this, ConnectionsManager.a().a(localed, new org.vidogram.tgnet.c()
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
    if ((this.G) || (this.H != null))
      return;
    this.G = true;
    g.em localem = new g.em();
    localem.c = org.vidogram.messenger.v.b(this.Y);
    ConnectionsManager.a().a(localem, new org.vidogram.tgnet.c()
    {
    });
  }

  private void r()
  {
    int i2 = 8;
    boolean bool = false;
    if (this.l == null)
      return;
    if ((!this.F) && (!this.Z))
    {
      this.y.setText(r.a("ChangePublicLimitReached", 2131230957));
      this.y.setTextColor(-3198928);
      this.t.setVisibility(8);
      this.l.setVisibility(8);
      if (this.I)
      {
        this.L.setVisibility(0);
        i1 = 0;
        while (i1 < this.K.size())
        {
          ((org.vidogram.ui.c.b)this.K.get(i1)).setVisibility(8);
          i1 += 1;
        }
        this.y.setBackgroundResource(2130837783);
        this.J.setVisibility(8);
      }
      while (true)
      {
        localObject1 = this.w;
        if (!this.F)
          bool = true;
        ((al)localObject1).a(bool, true);
        this.x.a(this.F, true);
        this.j.clearFocus();
        org.vidogram.messenger.a.b(this.j);
        return;
        this.y.setBackgroundResource(2130837782);
        this.L.setVisibility(8);
        i1 = 0;
        while (i1 < this.K.size())
        {
          ((org.vidogram.ui.c.b)this.K.get(i1)).setVisibility(0);
          i1 += 1;
        }
        this.J.setVisibility(0);
      }
    }
    this.y.setTextColor(-8355712);
    this.l.setVisibility(0);
    this.J.setVisibility(8);
    this.y.setBackgroundResource(2130837783);
    int i1 = 0;
    while (i1 < this.K.size())
    {
      ((org.vidogram.ui.c.b)this.K.get(i1)).setVisibility(8);
      i1 += 1;
    }
    this.t.setVisibility(0);
    this.L.setVisibility(8);
    Object localObject2 = this.y;
    if (this.F)
    {
      localObject1 = r.a("ChannelPrivateLinkHelp", 2131231024);
      label369: ((bf)localObject2).setText((CharSequence)localObject1);
      localObject2 = this.A;
      if (!this.F)
        break label556;
      localObject1 = r.a("ChannelInviteLinkTitle", 2131230984);
      label400: ((w)localObject2).setText((String)localObject1);
      localObject1 = this.u;
      if (!this.F)
        break label570;
      i1 = 8;
      label423: ((LinearLayout)localObject1).setVisibility(i1);
      localObject1 = this.v;
      if (!this.F)
        break label575;
      i1 = 0;
      label444: ((ay)localObject1).setVisibility(i1);
      localObject1 = this.t;
      if (!this.F)
        break label581;
      i1 = 0;
      label465: ((LinearLayout)localObject1).setPadding(0, 0, 0, i1);
      localObject2 = this.v;
      if (this.H == null)
        break label591;
    }
    label556: label570: label575: label581: label591: for (Object localObject1 = this.H.b; ; localObject1 = r.a("Loading", 2131231394))
    {
      ((ay)localObject2).a((String)localObject1, false);
      localObject1 = this.z;
      i1 = i2;
      if (!this.F)
      {
        i1 = i2;
        if (this.z.length() != 0)
          i1 = 0;
      }
      ((TextView)localObject1).setVisibility(i1);
      break;
      localObject1 = r.a("ChannelUsernameHelp", 2131231043);
      break label369;
      localObject1 = r.a("ChannelLinkTitle", 2131230991);
      break label400;
      i1 = 0;
      break label423;
      i1 = 8;
      break label444;
      i1 = org.vidogram.messenger.a.a(7.0F);
      break label465;
    }
  }

  private void s()
  {
    if (this.I)
      return;
    this.I = true;
    r();
    g.eo localeo = new g.eo();
    ConnectionsManager.a().a(localeo, new org.vidogram.tgnet.c()
    {
    });
  }

  public View a(Context paramContext)
  {
    int i1 = 3;
    int i2 = 1;
    this.R = false;
    this.Q = false;
    this.d.setBackButtonImage(2130837794);
    this.d.setAllowOverlayTitle(true);
    this.d.setActionBarMenuOnItemClick(new a.a()
    {
      public void a(int paramInt)
      {
        if (paramInt == -1)
          l.this.d();
        while (true)
        {
          do
            return;
          while (paramInt != 1);
          if (l.a(l.this) != 0)
            break;
          if (l.b(l.this))
            continue;
          if (l.c(l.this).length() == 0)
          {
            localObject1 = (Vibrator)l.this.l().getSystemService("vibrator");
            if (localObject1 != null)
              ((Vibrator)localObject1).vibrate(200L);
            org.vidogram.messenger.a.a(l.c(l.this), 2.0F, 0);
            return;
          }
          l.a(l.this, true);
          if (l.d(l.this).b != null)
          {
            l.b(l.this, true);
            l.a(l.this, new ProgressDialog(l.this.l()));
            l.e(l.this).setMessage(r.a("Loading", 2131231394));
            l.e(l.this).setCanceledOnTouchOutside(false);
            l.e(l.this).setCancelable(false);
            l.e(l.this).setButton(-2, r.a("Cancel", 2131230943), new DialogInterface.OnClickListener()
            {
              public void onClick(DialogInterface paramDialogInterface, int paramInt)
              {
                l.b(l.this, false);
                l.a(l.this, null);
                l.a(l.this, false);
                try
                {
                  paramDialogInterface.dismiss();
                  return;
                }
                catch (Exception paramDialogInterface)
                {
                  n.a("tmessages", paramDialogInterface);
                }
              }
            });
            l.e(l.this).show();
            return;
          }
          paramInt = org.vidogram.messenger.v.a().a(l.c(l.this).getText().toString(), new ArrayList(), l.f(l.this).getText().toString(), 2, l.this);
          l.a(l.this, new ProgressDialog(l.this.l()));
          l.e(l.this).setMessage(r.a("Loading", 2131231394));
          l.e(l.this).setCanceledOnTouchOutside(false);
          l.e(l.this).setCancelable(false);
          l.e(l.this).setButton(-2, r.a("Cancel", 2131230943), new DialogInterface.OnClickListener(paramInt)
          {
            public void onClick(DialogInterface paramDialogInterface, int paramInt)
            {
              ConnectionsManager.a().a(this.a, true);
              l.a(l.this, false);
              try
              {
                paramDialogInterface.dismiss();
                return;
              }
              catch (Exception paramDialogInterface)
              {
                n.a("tmessages", paramDialogInterface);
              }
            }
          });
          l.e(l.this).show();
          return;
        }
        if (l.a(l.this) == 1)
        {
          if (!l.g(l.this))
          {
            if (l.c(l.this).length() == 0)
            {
              localObject1 = new AlertDialog.Builder(l.this.l());
              ((AlertDialog.Builder)localObject1).setTitle(r.a("AppName", 2131230856));
              ((AlertDialog.Builder)localObject1).setMessage(r.a("ChannelPublicEmptyUsername", 2131231026));
              ((AlertDialog.Builder)localObject1).setPositiveButton(r.a("Close", 2131231072), null);
              l.this.b(((AlertDialog.Builder)localObject1).create());
              return;
            }
            if (!l.h(l.this))
            {
              localObject1 = (Vibrator)l.this.l().getSystemService("vibrator");
              if (localObject1 != null)
                ((Vibrator)localObject1).vibrate(200L);
              org.vidogram.messenger.a.a(l.i(l.this), 2.0F, 0);
              return;
            }
            org.vidogram.messenger.v.a().a(l.j(l.this), l.k(l.this));
          }
          localObject1 = new Bundle();
          ((Bundle)localObject1).putInt("step", 2);
          ((Bundle)localObject1).putInt("chat_id", l.j(l.this));
          l.this.a(new l((Bundle)localObject1), true);
          return;
        }
        Object localObject1 = new ArrayList();
        Iterator localIterator = l.l(l.this).keySet().iterator();
        while (localIterator.hasNext())
        {
          Object localObject2 = (Integer)localIterator.next();
          localObject2 = org.vidogram.messenger.v.a(org.vidogram.messenger.v.a().a((Integer)localObject2));
          if (localObject2 == null)
            continue;
          ((ArrayList)localObject1).add(localObject2);
        }
        org.vidogram.messenger.v.a().a(l.j(l.this), (ArrayList)localObject1, null);
        y.a().a(y.d, new Object[0]);
        localObject1 = new Bundle();
        ((Bundle)localObject1).putInt("chat_id", l.j(l.this));
        l.this.a(new q((Bundle)localObject1), true);
      }
    });
    this.i = this.d.a().b(1, 2130837825, org.vidogram.messenger.a.a(56.0F));
    label273: float f1;
    label281: float f2;
    if (this.X != 2)
    {
      this.b = new ScrollView(paramContext);
      localObject1 = (ScrollView)this.b;
      ((ScrollView)localObject1).setFillViewport(true);
      this.s = new LinearLayout(paramContext);
      ((ScrollView)localObject1).addView(this.s, new FrameLayout.LayoutParams(-1, -2));
      this.s.setOrientation(1);
      if (this.X != 0)
        break label979;
      this.d.setTitle(r.a("NewChannel", 2131231476));
      this.b.setBackgroundColor(-1);
      localObject1 = new FrameLayout(paramContext);
      this.s.addView((View)localObject1, org.vidogram.ui.Components.v.b(-1, -2));
      this.m = new BackupImageView(paramContext);
      this.m.setRoundRadius(org.vidogram.messenger.a.a(32.0F));
      this.n.a(5, null, null, false);
      this.n.c(true);
      this.m.setImageDrawable(this.n);
      localObject2 = this.m;
      if (!r.a)
        break label923;
      i1 = 5;
      if (!r.a)
        break label929;
      f1 = 0.0F;
      if (!r.a)
        break label936;
      f2 = 16.0F;
      label291: ((FrameLayout)localObject1).addView((View)localObject2, org.vidogram.ui.Components.v.a(64, 64.0F, i1 | 0x30, f1, 12.0F, f2, 12.0F));
      this.m.setOnClickListener(new View.OnClickListener()
      {
        public void onClick(View paramView)
        {
          if (l.this.l() == null)
            return;
          AlertDialog.Builder localBuilder = new AlertDialog.Builder(l.this.l());
          if (l.m(l.this) != null)
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
                  l.d(l.this).b();
                do
                {
                  return;
                  if (paramInt != 1)
                    continue;
                  l.d(l.this).c();
                  return;
                }
                while (paramInt != 2);
                l.a(l.this, null);
                l.a(l.this, null);
                l.o(l.this).a(l.m(l.this), "50_50", l.n(l.this));
              }
            });
            l.this.b(localBuilder.create());
            return;
            paramView = new CharSequence[2];
            paramView[0] = r.a("FromCamera", 2131231263);
            paramView[1] = r.a("FromGalley", 2131231270);
          }
        }
      });
      this.j = new EditText(paramContext);
      this.j.setHint(r.a("EnterChannelName", 2131231179));
      if (this.r != null)
      {
        this.j.setText(this.r);
        this.r = null;
      }
      this.j.setMaxLines(4);
      localObject2 = this.j;
      if (!r.a)
        break label941;
      i1 = 5;
      label408: ((EditText)localObject2).setGravity(i1 | 0x10);
      this.j.setTextSize(1, 16.0F);
      this.j.setHintTextColor(-6842473);
      this.j.setImeOptions(268435456);
      this.j.setInputType(16385);
      localObject2 = new InputFilter.LengthFilter(100);
      this.j.setFilters(new InputFilter[] { localObject2 });
      this.j.setPadding(0, 0, 0, org.vidogram.messenger.a.a(8.0F));
      org.vidogram.messenger.a.a(this.j);
      this.j.setTextColor(-14606047);
      localObject2 = this.j;
      if (!r.a)
        break label947;
      f1 = 16.0F;
      label535: if (!r.a)
        break label954;
      f2 = 96.0F;
      label545: ((FrameLayout)localObject1).addView((View)localObject2, org.vidogram.ui.Components.v.a(-1, -2.0F, 16, f1, 0.0F, f2, 0.0F));
      this.j.addTextChangedListener(new TextWatcher()
      {
        public void afterTextChanged(Editable paramEditable)
        {
          org.vidogram.ui.Components.b localb = l.n(l.this);
          if (l.c(l.this).length() > 0);
          for (paramEditable = l.c(l.this).getText().toString(); ; paramEditable = null)
          {
            localb.a(5, paramEditable, null, false);
            l.o(l.this).invalidate();
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
      this.p = new EditText(paramContext);
      this.p.setTextSize(1, 18.0F);
      this.p.setHintTextColor(-6842473);
      this.p.setTextColor(-14606047);
      this.p.setPadding(0, 0, 0, org.vidogram.messenger.a.a(6.0F));
      localObject1 = this.p;
      if (!r.a)
        break label961;
      i1 = 5;
      label654: ((EditText)localObject1).setGravity(i1);
      this.p.setInputType(180225);
      this.p.setImeOptions(6);
      localObject1 = new InputFilter.LengthFilter(120);
      this.p.setFilters(new InputFilter[] { localObject1 });
      this.p.setHint(r.a("DescriptionPlaceholder", 2131231140));
      org.vidogram.messenger.a.a(this.p);
      this.s.addView(this.p, org.vidogram.ui.Components.v.a(-1, -2, 24.0F, 18.0F, 24.0F, 0.0F));
      this.p.setOnEditorActionListener(new TextView.OnEditorActionListener()
      {
        public boolean onEditorAction(TextView paramTextView, int paramInt, KeyEvent paramKeyEvent)
        {
          if ((paramInt == 6) && (l.p(l.this) != null))
          {
            l.p(l.this).performClick();
            return true;
          }
          return false;
        }
      });
      this.p.addTextChangedListener(new TextWatcher()
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
      paramContext = new TextView(paramContext);
      paramContext.setTextSize(1, 15.0F);
      paramContext.setTextColor(-9605774);
      if (!r.a)
        break label967;
      i1 = 5;
      label820: paramContext.setGravity(i1);
      paramContext.setText(r.a("DescriptionInfo", 2131231137));
      localObject1 = this.s;
      if (!r.a)
        break label973;
      i1 = 5;
      label854: ((LinearLayout)localObject1).addView(paramContext, org.vidogram.ui.Components.v.b(-2, -2, i1, 24, 10, 24, 20));
    }
    label923: label929: label936: label941: label947: label954: label961: label967: label973: label979: label1110: label1917: 
    do
    {
      return this.b;
      this.b = new LinearLayout(paramContext);
      this.b.setOnTouchListener(new View.OnTouchListener()
      {
        public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
        {
          return true;
        }
      });
      this.s = ((LinearLayout)this.b);
      break;
      i1 = 3;
      break label273;
      f1 = 16.0F;
      break label281;
      f2 = 0.0F;
      break label291;
      i1 = 3;
      break label408;
      f1 = 96.0F;
      break label535;
      f2 = 16.0F;
      break label545;
      i1 = 3;
      break label654;
      i1 = 3;
      break label820;
      i1 = 3;
      break label854;
      if (this.X != 1)
        continue;
      this.d.setTitle(r.a("ChannelSettings", 2131231030));
      this.b.setBackgroundColor(-986896);
      localObject1 = new LinearLayout(paramContext);
      ((LinearLayout)localObject1).setOrientation(1);
      ((LinearLayout)localObject1).setBackgroundColor(-1);
      this.s.addView((View)localObject1, org.vidogram.ui.Components.v.b(-1, -2));
      this.w = new al(paramContext);
      this.w.setBackgroundResource(2130837946);
      localObject2 = this.w;
      String str1 = r.a("ChannelPublic", 2131231025);
      String str2 = r.a("ChannelPublicInfo", 2131231027);
      boolean bool;
      if (!this.F)
      {
        bool = true;
        ((al)localObject2).a(str1, str2, bool, false);
        ((LinearLayout)localObject1).addView(this.w, org.vidogram.ui.Components.v.b(-1, -2));
        this.w.setOnClickListener(new View.OnClickListener()
        {
          public void onClick(View paramView)
          {
            if (!l.g(l.this))
              return;
            l.c(l.this, false);
            l.q(l.this);
          }
        });
        this.x = new al(paramContext);
        this.x.setBackgroundResource(2130837946);
        this.x.a(r.a("ChannelPrivate", 2131231022), r.a("ChannelPrivateInfo", 2131231023), this.F, false);
        ((LinearLayout)localObject1).addView(this.x, org.vidogram.ui.Components.v.b(-1, -2));
        this.x.setOnClickListener(new View.OnClickListener()
        {
          public void onClick(View paramView)
          {
            if (l.g(l.this))
              return;
            l.c(l.this, true);
            l.q(l.this);
          }
        });
        this.l = new ap(paramContext);
        this.s.addView(this.l, org.vidogram.ui.Components.v.b(-1, -2));
        this.t = new LinearLayout(paramContext);
        this.t.setOrientation(1);
        this.t.setBackgroundColor(-1);
        this.s.addView(this.t, org.vidogram.ui.Components.v.b(-1, -2));
        this.A = new w(paramContext);
        this.t.addView(this.A);
        this.u = new LinearLayout(paramContext);
        this.u.setOrientation(0);
        this.t.addView(this.u, org.vidogram.ui.Components.v.a(-1, 36, 17.0F, 7.0F, 17.0F, 0.0F));
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
        this.u.addView((View)localObject1, org.vidogram.ui.Components.v.b(-2, 36));
        this.j = new EditText(paramContext);
        this.j.setTextSize(1, 18.0F);
        this.j.setHintTextColor(-6842473);
        this.j.setTextColor(-14606047);
        this.j.setMaxLines(1);
        this.j.setLines(1);
        this.j.setBackgroundDrawable(null);
        this.j.setPadding(0, 0, 0, 0);
        this.j.setSingleLine(true);
        this.j.setInputType(163872);
        this.j.setImeOptions(6);
        this.j.setHint(r.a("ChannelUsernamePlaceholder", 2131231044));
        org.vidogram.messenger.a.a(this.j);
        this.u.addView(this.j, org.vidogram.ui.Components.v.b(-1, 36));
        this.j.addTextChangedListener(new TextWatcher()
        {
          public void afterTextChanged(Editable paramEditable)
          {
          }

          public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
          {
          }

          public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
          {
            l.a(l.this, l.c(l.this).getText().toString());
          }
        });
        this.v = new ay(paramContext);
        this.v.setBackgroundResource(2130837946);
        this.t.addView(this.v);
        this.v.setOnClickListener(new View.OnClickListener()
        {
          public void onClick(View paramView)
          {
            if (l.r(l.this) == null)
              return;
            try
            {
              ((ClipboardManager)ApplicationLoader.a.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", l.r(l.this).b));
              Toast.makeText(l.this.l(), r.a("LinkCopied", 2131231383), 0).show();
              return;
            }
            catch (Exception paramView)
            {
              n.a("tmessages", paramView);
            }
          }
        });
        this.z = new TextView(paramContext);
        this.z.setTextSize(1, 15.0F);
        localObject1 = this.z;
        if (!r.a)
          break label1917;
        i1 = 5;
        ((TextView)localObject1).setGravity(i1);
        this.z.setVisibility(8);
        localObject1 = this.t;
        localObject2 = this.z;
        if (!r.a)
          break label1923;
      }
      for (i1 = 5; ; i1 = 3)
      {
        ((LinearLayout)localObject1).addView((View)localObject2, org.vidogram.ui.Components.v.b(-2, -2, i1, 17, 3, 17, 7));
        this.y = new bf(paramContext);
        this.y.setBackgroundResource(2130837783);
        this.s.addView(this.y, org.vidogram.ui.Components.v.b(-1, -2));
        this.L = new z(paramContext);
        this.s.addView(this.L, org.vidogram.ui.Components.v.b(-1, -2));
        this.J = new bf(paramContext);
        this.J.setBackgroundResource(2130837783);
        this.s.addView(this.J, org.vidogram.ui.Components.v.b(-1, -2));
        r();
        break;
        bool = false;
        break label1110;
        i1 = 3;
        break label1737;
      }
    }
    while (this.X != 2);
    label1737: this.d.setTitle(r.a("ChannelAddMembers", 2131230960));
    label1923: this.d.setSubtitle(r.b("Members", this.S.size()));
    this.P = new o(paramContext, null, false, false, false, false);
    this.P.a(this.S);
    this.P.a(true);
    this.M = new f(paramContext, 1, false, null, false);
    this.M.a(this.S);
    Object localObject1 = new FrameLayout(paramContext);
    this.s.addView((View)localObject1, org.vidogram.ui.Components.v.b(-1, -2));
    this.j = new EditText(paramContext);
    this.j.setTextSize(1, 16.0F);
    this.j.setHintTextColor(-6842473);
    this.j.setTextColor(-14606047);
    this.j.setInputType(655536);
    this.j.setMinimumHeight(org.vidogram.messenger.a.a(54.0F));
    this.j.setSingleLine(false);
    this.j.setLines(2);
    this.j.setMaxLines(2);
    this.j.setVerticalScrollBarEnabled(true);
    this.j.setHorizontalScrollBarEnabled(false);
    this.j.setPadding(0, 0, 0, 0);
    this.j.setHint(r.a("AddMutual", 2131230820));
    this.j.setTextIsSelectable(false);
    this.j.setImeOptions(268435462);
    Object localObject2 = this.j;
    if (r.a)
      i1 = 5;
    ((EditText)localObject2).setGravity(i1 | 0x10);
    org.vidogram.messenger.a.a(this.j);
    ((FrameLayout)localObject1).addView(this.j, org.vidogram.ui.Components.v.a(-1, -2.0F, 51, 10.0F, 0.0F, 10.0F, 0.0F));
    this.j.addTextChangedListener(new TextWatcher()
    {
      public void afterTextChanged(Editable paramEditable)
      {
        int i;
        if (!l.s(l.this))
        {
          i = l.c(l.this).getSelectionEnd();
          if (paramEditable.toString().length() >= l.t(l.this).toString().length())
            break label411;
          paramEditable = "";
        }
        while (true)
        {
          try
          {
            Object localObject = l.t(l.this).toString().substring(i, l.u(l.this));
            paramEditable = (Editable)localObject;
            if (paramEditable.length() > 0)
            {
              if ((!l.v(l.this)) || (!l.w(l.this)))
                break label523;
              i = 1;
              paramEditable = l.c(l.this).getText();
              int j = 0;
              if (j >= l.x(l.this).size())
                continue;
              localObject = (k)l.x(l.this).get(j);
              if (paramEditable.getSpanStart(localObject) != -1)
                continue;
              l.x(l.this).remove(localObject);
              l.l(l.this).remove(Integer.valueOf(((k)localObject).a));
              j += 1;
              continue;
            }
          }
          catch (Exception localException)
          {
            n.a("tmessages", localException);
            continue;
            l.y(l.this).setSubtitle(r.b("Members", l.l(l.this).size()));
            l.z(l.this).invalidateViews();
          }
          while (true)
          {
            if (i != 0)
            {
              paramEditable = l.c(l.this).getText().toString().replace("<", "");
              if (paramEditable.length() == 0)
                break;
              l.d(l.this, true);
              l.e(l.this, true);
              if (l.z(l.this) != null)
              {
                l.z(l.this).setAdapter(l.A(l.this));
                l.A(l.this).notifyDataSetChanged();
                l.z(l.this).setFastScrollAlwaysVisible(false);
                l.z(l.this).setFastScrollEnabled(false);
                l.z(l.this).setVerticalScrollBarEnabled(true);
              }
              if (l.B(l.this) != null)
                l.B(l.this).setText(r.a("NoResult", 2131231509));
              l.A(l.this).a(paramEditable);
            }
            return;
            i = 1;
            continue;
            label411: i = 1;
          }
          l.A(l.this).a(null);
          l.d(l.this, false);
          l.e(l.this, false);
          l.z(l.this).setAdapter(l.C(l.this));
          l.C(l.this).notifyDataSetChanged();
          l.z(l.this).setFastScrollAlwaysVisible(true);
          l.z(l.this).setFastScrollEnabled(true);
          l.z(l.this).setVerticalScrollBarEnabled(false);
          l.B(l.this).setText(r.a("NoContacts", 2131231492));
          return;
          label523: i = 0;
        }
      }

      public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
      {
        if (!l.s(l.this))
        {
          l.a(l.this, l.c(l.this).getSelectionStart());
          l.a(l.this, new SpannableString(paramCharSequence));
        }
      }

      public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
      {
      }
    });
    localObject1 = new LinearLayout(paramContext);
    ((LinearLayout)localObject1).setVisibility(4);
    ((LinearLayout)localObject1).setOrientation(1);
    this.s.addView((View)localObject1, org.vidogram.ui.Components.v.b(-1, -1));
    ((LinearLayout)localObject1).setOnTouchListener(new View.OnTouchListener()
    {
      public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
      {
        return true;
      }
    });
    this.N = new TextView(paramContext);
    this.N.setTextColor(-8355712);
    this.N.setTextSize(20.0F);
    this.N.setGravity(17);
    this.N.setText(r.a("NoContacts", 2131231492));
    ((LinearLayout)localObject1).addView(this.N, org.vidogram.ui.Components.v.a(-1, -1, 0.5F));
    ((LinearLayout)localObject1).addView(new FrameLayout(paramContext), org.vidogram.ui.Components.v.a(-1, -1, 0.5F));
    this.O = new x(paramContext);
    this.O.setEmptyView((View)localObject1);
    this.O.setVerticalScrollBarEnabled(false);
    this.O.setDivider(null);
    this.O.setDividerHeight(0);
    this.O.setFastScrollEnabled(true);
    this.O.setScrollBarStyle(33554432);
    this.O.setAdapter(this.M);
    this.O.setFastScrollAlwaysVisible(true);
    paramContext = this.O;
    if (r.a);
    for (i1 = i2; ; i1 = 2)
    {
      paramContext.setVerticalScrollbarPosition(i1);
      this.s.addView(this.O, org.vidogram.ui.Components.v.b(-1, -1));
      this.O.setOnItemClickListener(new AdapterView.OnItemClickListener()
      {
        public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
        {
          if ((l.v(l.this)) && (l.w(l.this)))
          {
            paramAdapterView = (g.vw)l.A(l.this).b(paramInt);
            if (paramAdapterView != null)
              break label94;
          }
          label94: boolean bool;
          label437: label578: 
          do
          {
            int i;
            do
            {
              return;
              i = l.C(l.this).a(paramInt);
              paramInt = l.C(l.this).b(paramInt);
            }
            while ((paramInt < 0) || (i < 0));
            paramAdapterView = (g.vw)l.C(l.this).c(i, paramInt);
            break;
            if (l.l(l.this).containsKey(Integer.valueOf(paramAdapterView.d)));
            while (true)
            {
              try
              {
                localObject = (k)l.l(l.this).get(Integer.valueOf(paramAdapterView.d));
                l.l(l.this).remove(Integer.valueOf(paramAdapterView.d));
                paramAdapterView = new SpannableStringBuilder(l.c(l.this).getText());
                paramAdapterView.delete(paramAdapterView.getSpanStart(localObject), paramAdapterView.getSpanEnd(localObject));
                l.x(l.this).remove(localObject);
                l.f(l.this, true);
                l.c(l.this).setText(paramAdapterView);
                l.c(l.this).setSelection(paramAdapterView.length());
                l.f(l.this, false);
                bool = false;
                l.D(l.this).setSubtitle(r.b("Members", l.l(l.this).size()));
                if ((!l.v(l.this)) && (!l.w(l.this)))
                  break label578;
                l.f(l.this, true);
                paramAdapterView = new SpannableStringBuilder("");
                paramView = l.x(l.this).iterator();
                if (!paramView.hasNext())
                  break label437;
                localObject = (ImageSpan)paramView.next();
                paramAdapterView.append("<<");
                paramAdapterView.setSpan(localObject, paramAdapterView.length() - 2, paramAdapterView.length(), 33);
                continue;
              }
              catch (Exception paramAdapterView)
              {
                n.a("tmessages", paramAdapterView);
                bool = false;
                continue;
              }
              l.f(l.this, true);
              Object localObject = l.a(l.this, paramAdapterView);
              if (localObject != null)
                ((k)localObject).a = paramAdapterView.d;
              l.f(l.this, false);
              if (localObject == null)
                break;
              bool = true;
            }
            l.c(l.this).setText(paramAdapterView);
            l.c(l.this).setSelection(paramAdapterView.length());
            l.f(l.this, false);
            l.A(l.this).a(null);
            l.d(l.this, false);
            l.e(l.this, false);
            l.z(l.this).setAdapter(l.C(l.this));
            l.C(l.this).notifyDataSetChanged();
            l.z(l.this).setFastScrollAlwaysVisible(true);
            l.z(l.this).setFastScrollEnabled(true);
            l.z(l.this).setVerticalScrollBarEnabled(false);
            l.B(l.this).setText(r.a("NoContacts", 2131231492));
            return;
          }
          while (!(paramView instanceof bh));
          ((bh)paramView).a(bool, true);
        }
      });
      this.O.setOnScrollListener(new AbsListView.OnScrollListener()
      {
        public void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
        {
          if (paramAbsListView.isFastScrollEnabled())
            org.vidogram.messenger.a.d(paramAbsListView);
        }

        public void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
        {
          boolean bool = true;
          if (paramInt == 1)
            org.vidogram.messenger.a.b(l.c(l.this));
          if (l.C(l.this) != null)
          {
            paramAbsListView = l.C(l.this);
            if (paramInt == 0)
              break label45;
          }
          while (true)
          {
            paramAbsListView.a(bool);
            return;
            label45: bool = false;
          }
        }
      });
      break;
    }
  }

  public void a(int paramInt1, int paramInt2, Intent paramIntent)
  {
    this.o.a(paramInt1, paramInt2, paramIntent);
  }

  public void a(int paramInt, Object[] paramArrayOfObject)
  {
    if (paramInt == y.b)
    {
      paramInt = ((Integer)paramArrayOfObject[0]).intValue();
      if (((paramInt & 0x2) != 0) || ((paramInt & 0x1) != 0) || ((paramInt & 0x4) != 0))
        a(paramInt);
    }
    do
    {
      return;
      if (paramInt == y.m)
      {
        if (this.k != null);
        try
        {
          this.k.dismiss();
          this.ac = false;
          return;
        }
        catch (Exception paramArrayOfObject)
        {
          while (true)
            n.a("tmessages", paramArrayOfObject);
        }
      }
      if (paramInt != y.l)
        continue;
      if (this.k != null);
      try
      {
        this.k.dismiss();
        paramInt = ((Integer)paramArrayOfObject[0]).intValue();
        paramArrayOfObject = new Bundle();
        paramArrayOfObject.putInt("step", 1);
        paramArrayOfObject.putInt("chat_id", paramInt);
        paramArrayOfObject.putBoolean("canCreatePublic", this.Z);
        if (this.aa != null)
          org.vidogram.messenger.v.a().a(paramInt, this.aa);
        a(new l(paramArrayOfObject), true);
        return;
      }
      catch (Exception localException)
      {
        while (true)
          n.a("tmessages", localException);
      }
    }
    while ((paramInt != y.k) || (this.M == null));
    this.M.notifyDataSetChanged();
  }

  public void a(Bundle paramBundle)
  {
    if (this.X == 0)
    {
      if ((this.o != null) && (this.o.a != null))
        paramBundle.putString("path", this.o.a);
      if (this.j != null)
      {
        String str = this.j.getText().toString();
        if ((str != null) && (str.length() != 0))
          paramBundle.putString("nameTextView", str);
      }
    }
  }

  public void a(g.ad paramad, g.az paramaz1, g.az paramaz2)
  {
    org.vidogram.messenger.a.a(new Runnable(paramad, paramaz1)
    {
      public void run()
      {
        l.a(l.this, this.a);
        l.a(l.this, this.b.c);
        l.o(l.this).a(l.m(l.this), "50_50", l.n(l.this));
        if (l.E(l.this));
        try
        {
          if ((l.e(l.this) != null) && (l.e(l.this).isShowing()))
          {
            l.e(l.this).dismiss();
            l.a(l.this, null);
          }
          l.p(l.this).performClick();
          return;
        }
        catch (Exception localException)
        {
          while (true)
            n.a("tmessages", localException);
        }
      }
    });
  }

  public void b(Bundle paramBundle)
  {
    if (this.X == 0)
    {
      if (this.o != null)
        this.o.a = paramBundle.getString("path");
      paramBundle = paramBundle.getString("nameTextView");
      if (paramBundle != null)
      {
        if (this.j == null)
          break label56;
        this.j.setText(paramBundle);
      }
    }
    return;
    label56: this.r = paramBundle;
  }

  public void b(boolean paramBoolean1, boolean paramBoolean2)
  {
    if ((paramBoolean1) && (this.X != 1))
    {
      this.j.requestFocus();
      org.vidogram.messenger.a.a(this.j);
    }
  }

  public boolean f()
  {
    y.a().a(this, y.b);
    y.a().a(this, y.l);
    y.a().a(this, y.m);
    if (this.X == 2)
      y.a().a(this, y.k);
    while (true)
    {
      if (this.o != null)
      {
        this.o.d = this;
        this.o.e = this;
      }
      return super.f();
      if (this.X != 1)
        continue;
      q();
    }
  }

  public void g()
  {
    super.g();
    y.a().b(this, y.b);
    y.a().b(this, y.l);
    y.a().b(this, y.m);
    if (this.X == 2)
      y.a().b(this, y.k);
    if (this.o != null)
      this.o.a();
    org.vidogram.messenger.a.b(l(), this.e);
  }

  public void i()
  {
    super.i();
    org.vidogram.messenger.a.a(l(), this.e);
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.l
 * JD-Core Version:    0.6.0
 */