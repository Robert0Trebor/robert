package org.vidogram.ui;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.graphics.Typeface;
import android.os.Vibrator;
import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import android.widget.Toast;
import org.vidogram.messenger.Utilities;
import org.vidogram.messenger.n;
import org.vidogram.messenger.r;
import org.vidogram.messenger.y;
import org.vidogram.messenger.y.b;
import org.vidogram.tgnet.ConnectionsManager;
import org.vidogram.tgnet.f;
import org.vidogram.tgnet.g.bn;
import org.vidogram.tgnet.g.bo;
import org.vidogram.tgnet.g.br;
import org.vidogram.tgnet.g.bs;
import org.vidogram.tgnet.g.bt;
import org.vidogram.tgnet.g.ce;
import org.vidogram.tgnet.g.cq;
import org.vidogram.tgnet.g.cr;
import org.vidogram.tgnet.g.wc;
import org.vidogram.ui.a.a.a;
import org.vidogram.ui.a.d;
import org.vidogram.ui.a.g;
import org.vidogram.ui.c.bf;
import org.vidogram.ui.c.bg;

public class az extends g
  implements y.b
{
  private boolean A;
  private g.wc B;
  private boolean C = true;
  private byte[] D = new byte[0];
  private Runnable E;
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
  private a i;
  private ListView j;
  private TextView k;
  private TextView l;
  private TextView m;
  private EditText n;
  private ProgressDialog o;
  private FrameLayout p;
  private d q;
  private ScrollView r;
  private int s;
  private int t;
  private String u;
  private String v;
  private String w;
  private boolean x;
  private boolean y;
  private boolean z;

  public az(int paramInt)
  {
    this.s = paramInt;
    if (paramInt == 0)
      b(false);
  }

  private void a(int paramInt)
  {
    int i1 = 4;
    if (this.n == null)
      return;
    this.t = paramInt;
    if (this.t == 0)
    {
      this.d.setTitle(r.a("YourPassword", 2131231989));
      if ((this.B instanceof g.br))
      {
        this.k.setText(r.a("PleaseEnterFirstPassword", 2131231689));
        this.n.setImeOptions(5);
        this.n.setTransformationMethod(PasswordTransformationMethod.getInstance());
        this.l.setVisibility(4);
        this.m.setVisibility(4);
      }
    }
    while (true)
    {
      this.n.setText("");
      return;
      this.k.setText(r.a("PleaseEnterPassword", 2131231690));
      break;
      if (this.t == 1)
      {
        this.d.setTitle(r.a("YourPassword", 2131231989));
        this.k.setText(r.a("PleaseReEnterPassword", 2131231691));
        this.n.setImeOptions(5);
        this.n.setTransformationMethod(PasswordTransformationMethod.getInstance());
        this.l.setVisibility(4);
        this.m.setVisibility(4);
        continue;
      }
      if (this.t == 2)
      {
        this.d.setTitle(r.a("PasswordHint", 2131231651));
        this.k.setText(r.a("PasswordHintText", 2131231652));
        this.n.setImeOptions(5);
        this.n.setTransformationMethod(null);
        this.l.setVisibility(4);
        this.m.setVisibility(4);
        continue;
      }
      if (this.t == 3)
      {
        this.d.setTitle(r.a("RecoveryEmail", 2131231710));
        this.k.setText(r.a("YourEmail", 2131231981));
        this.n.setImeOptions(6);
        this.n.setTransformationMethod(null);
        this.n.setInputType(33);
        this.l.setVisibility(0);
        TextView localTextView = this.m;
        if (this.x);
        for (paramInt = i1; ; paramInt = 0)
        {
          localTextView.setVisibility(paramInt);
          break;
        }
      }
      if (this.t != 4)
        continue;
      this.d.setTitle(r.a("PasswordRecovery", 2131231653));
      this.k.setText(r.a("PasswordCode", 2131231648));
      this.l.setText(r.a("RestoreEmailSentInfo", 2131231744));
      this.m.setText(r.a("RestoreEmailTrouble", 2131231745, new Object[] { this.B.g }));
      this.n.setImeOptions(6);
      this.n.setTransformationMethod(null);
      this.n.setInputType(3);
      this.l.setVisibility(0);
      this.m.setVisibility(0);
    }
  }

  private void a(String paramString1, String paramString2)
  {
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(l());
    localBuilder.setPositiveButton(r.a("OK", 2131231604), null);
    localBuilder.setTitle(paramString1);
    localBuilder.setMessage(paramString2);
    b(localBuilder.create());
  }

  private boolean a(String paramString)
  {
    if ((paramString == null) || (paramString.length() < 3));
    int i1;
    int i2;
    do
    {
      return false;
      i1 = paramString.lastIndexOf('.');
      i2 = paramString.lastIndexOf('@');
    }
    while ((i1 < 0) || (i2 < 0) || (i1 < i2));
    return true;
  }

  private void b(boolean paramBoolean)
  {
    if (!paramBoolean)
      this.y = true;
    g.bn localbn = new g.bn();
    ConnectionsManager.a().a(localbn, new org.vidogram.tgnet.c(paramBoolean)
    {
    }
    , 10);
  }

  private void c(boolean paramBoolean)
  {
    g.ce localce = new g.ce();
    localce.c = this.D;
    localce.d = new g.bt();
    if (paramBoolean)
      if ((this.A) && ((this.B instanceof g.br)))
      {
        localce.d.c = 2;
        localce.d.g = "";
        localce.c = new byte[0];
      }
    while (true)
    {
      r();
      ConnectionsManager.a().a(localce, new org.vidogram.tgnet.c(paramBoolean, localce)
      {
      }
      , 10);
      return;
      localce.d.c = 3;
      localce.d.f = "";
      localce.d.e = new byte[0];
      localce.d.d = new byte[0];
      localce.d.g = "";
      continue;
      Object localObject;
      if ((this.u != null) && (this.u.length() > 0))
        localObject = null;
      try
      {
        byte[] arrayOfByte1 = this.u.getBytes("UTF-8");
        localObject = arrayOfByte1;
        arrayOfByte1 = this.B.d;
        byte[] arrayOfByte2 = new byte[arrayOfByte1.length * 2 + localObject.length];
        System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 0, arrayOfByte1.length);
        System.arraycopy(localObject, 0, arrayOfByte2, arrayOfByte1.length, localObject.length);
        System.arraycopy(arrayOfByte1, 0, arrayOfByte2, arrayOfByte2.length - arrayOfByte1.length, arrayOfByte1.length);
        localObject = localce.d;
        ((g.bt)localObject).c |= 1;
        localce.d.f = this.v;
        localce.d.e = Utilities.b(arrayOfByte2, 0, arrayOfByte2.length);
        localce.d.d = arrayOfByte1;
        if (this.w.length() <= 0)
          continue;
        localObject = localce.d;
        ((g.bt)localObject).c |= 2;
        localce.d.g = this.w;
      }
      catch (Exception localException)
      {
        while (true)
          n.a("tmessages", localException);
      }
    }
  }

  private void d(boolean paramBoolean)
  {
    if (l() == null)
      return;
    Vibrator localVibrator = (Vibrator)l().getSystemService("vibrator");
    if (localVibrator != null)
      localVibrator.vibrate(200L);
    if (paramBoolean)
      this.n.setText("");
    org.vidogram.messenger.a.a(this.k, 2.0F, 0);
  }

  private void q()
  {
    this.Q = 0;
    this.F = -1;
    this.G = -1;
    this.H = -1;
    this.J = -1;
    this.K = -1;
    this.L = -1;
    this.M = -1;
    this.N = -1;
    this.O = -1;
    this.P = -1;
    this.I = -1;
    int i1;
    if ((!this.y) && (this.B != null))
    {
      if (!(this.B instanceof g.br))
        break label291;
      if (this.A)
      {
        i1 = this.Q;
        this.Q = (i1 + 1);
        this.N = i1;
        i1 = this.Q;
        this.Q = (i1 + 1);
        this.M = i1;
        i1 = this.Q;
        this.Q = (i1 + 1);
        this.I = i1;
      }
    }
    else
    {
      if (this.i != null)
        this.i.notifyDataSetChanged();
      if (!this.C)
        break label429;
      if (this.j != null)
      {
        this.j.setVisibility(0);
        this.r.setVisibility(4);
        this.p.setVisibility(0);
        this.j.setEmptyView(this.p);
      }
      if (this.n != null)
      {
        this.q.setVisibility(8);
        this.n.setVisibility(4);
        this.k.setVisibility(4);
        this.l.setVisibility(4);
        this.m.setVisibility(4);
      }
    }
    label291: label429: 
    do
    {
      return;
      i1 = this.Q;
      this.Q = (i1 + 1);
      this.F = i1;
      i1 = this.Q;
      this.Q = (i1 + 1);
      this.G = i1;
      break;
      if (!(this.B instanceof g.bs))
        break;
      i1 = this.Q;
      this.Q = (i1 + 1);
      this.H = i1;
      i1 = this.Q;
      this.Q = (i1 + 1);
      this.J = i1;
      if (this.B.f)
      {
        i1 = this.Q;
        this.Q = (i1 + 1);
        this.L = i1;
      }
      while (true)
      {
        if (!this.A)
          break label409;
        i1 = this.Q;
        this.Q = (i1 + 1);
        this.P = i1;
        break;
        i1 = this.Q;
        this.Q = (i1 + 1);
        this.K = i1;
      }
      i1 = this.Q;
      this.Q = (i1 + 1);
      this.O = i1;
      break;
      if (this.j == null)
        continue;
      this.j.setEmptyView(null);
      this.j.setVisibility(4);
      this.r.setVisibility(0);
      this.p.setVisibility(4);
    }
    while (this.n == null);
    label409: this.q.setVisibility(0);
    this.n.setVisibility(0);
    this.k.setVisibility(0);
    this.m.setVisibility(0);
    this.l.setVisibility(4);
    this.m.setText(r.a("ForgotPassword", 2131231202));
    if ((this.B.e != null) && (this.B.e.length() > 0))
      this.n.setHint(this.B.e);
    while (true)
    {
      org.vidogram.messenger.a.a(new Runnable()
      {
        public void run()
        {
          if (az.m(az.this) != null)
          {
            az.m(az.this).requestFocus();
            org.vidogram.messenger.a.a(az.m(az.this));
          }
        }
      }
      , 200L);
      return;
      this.n.setHint("");
    }
  }

  private void r()
  {
    if ((l() == null) || (l().isFinishing()) || (this.o != null))
      return;
    this.o = new ProgressDialog(l());
    this.o.setMessage(r.a("Loading", 2131231394));
    this.o.setCanceledOnTouchOutside(false);
    this.o.setCancelable(false);
    this.o.show();
  }

  private void s()
  {
    Object localObject2;
    if (this.s == 0)
      if (!this.C)
      {
        localObject2 = this.n.getText().toString();
        if (((String)localObject2).length() != 0)
          break label38;
        d(false);
      }
    label38: 
    do
    {
      do
      {
        return;
        Object localObject1 = null;
        try
        {
          localObject2 = ((String)localObject2).getBytes("UTF-8");
          localObject1 = localObject2;
          r();
          localObject2 = new byte[this.B.c.length * 2 + localObject1.length];
          System.arraycopy(this.B.c, 0, localObject2, 0, this.B.c.length);
          System.arraycopy(localObject1, 0, localObject2, this.B.c.length, localObject1.length);
          System.arraycopy(this.B.c, 0, localObject2, localObject2.length - this.B.c.length, this.B.c.length);
          localObject1 = new g.bo();
          ((g.bo)localObject1).c = Utilities.b(localObject2, 0, localObject2.length);
          ConnectionsManager.a().a((f)localObject1, new org.vidogram.tgnet.c((g.bo)localObject1)
          {
          }
          , 10);
          return;
        }
        catch (Exception localException3)
        {
          while (true)
            n.a("tmessages", localException3);
        }
      }
      while (this.s != 1);
      if (this.t == 0)
      {
        if (this.n.getText().length() == 0)
        {
          d(false);
          return;
        }
        this.k.setText(r.a("ReEnterYourPasscode", 2131231707));
        this.u = this.n.getText().toString();
        a(1);
        return;
      }
      if (this.t == 1)
      {
        if (!this.u.equals(this.n.getText().toString()))
          try
          {
            Toast.makeText(l(), r.a("PasswordDoNotMatch", 2131231649), 0).show();
            d(true);
            return;
          }
          catch (Exception localException1)
          {
            while (true)
              n.a("tmessages", localException1);
          }
        a(2);
        return;
      }
      if (this.t == 2)
      {
        this.v = this.n.getText().toString();
        if (this.v.toLowerCase().equals(this.u.toLowerCase()))
          try
          {
            Toast.makeText(l(), r.a("PasswordAsHintError", 2131231647), 0).show();
            d(false);
            return;
          }
          catch (Exception localException2)
          {
            while (true)
              n.a("tmessages", localException2);
          }
        if (!this.B.f)
        {
          a(3);
          return;
        }
        this.w = "";
        c(false);
        return;
      }
      if (this.t != 3)
        continue;
      this.w = this.n.getText().toString();
      if (!a(this.w))
      {
        d(false);
        return;
      }
      c(false);
      return;
    }
    while (this.t != 4);
    String str = this.n.getText().toString();
    if (str.length() == 0)
    {
      d(false);
      return;
    }
    g.cq localcq = new g.cq();
    localcq.c = str;
    ConnectionsManager.a().a(localcq, new org.vidogram.tgnet.c()
    {
    }
    , 10);
  }

  public View a(Context paramContext)
  {
    this.d.setBackButtonImage(2130837794);
    this.d.setAllowOverlayTitle(false);
    this.d.setActionBarMenuOnItemClick(new a.a()
    {
      public void a(int paramInt)
      {
        if (paramInt == -1)
          az.this.d();
        do
          return;
        while (paramInt != 1);
        az.a(az.this);
      }
    });
    this.b = new FrameLayout(paramContext);
    Object localObject1 = (FrameLayout)this.b;
    ((FrameLayout)localObject1).setBackgroundColor(-986896);
    this.q = this.d.a().b(1, 2130837825, org.vidogram.messenger.a.a(56.0F));
    this.r = new ScrollView(paramContext);
    this.r.setFillViewport(true);
    ((FrameLayout)localObject1).addView(this.r);
    Object localObject2 = (FrameLayout.LayoutParams)this.r.getLayoutParams();
    ((FrameLayout.LayoutParams)localObject2).width = -1;
    ((FrameLayout.LayoutParams)localObject2).height = -1;
    this.r.setLayoutParams((ViewGroup.LayoutParams)localObject2);
    localObject2 = new LinearLayout(paramContext);
    ((LinearLayout)localObject2).setOrientation(1);
    this.r.addView((View)localObject2);
    Object localObject3 = (FrameLayout.LayoutParams)((LinearLayout)localObject2).getLayoutParams();
    ((FrameLayout.LayoutParams)localObject3).width = -1;
    ((FrameLayout.LayoutParams)localObject3).height = -2;
    ((LinearLayout)localObject2).setLayoutParams((ViewGroup.LayoutParams)localObject3);
    this.k = new TextView(paramContext);
    this.k.setTextColor(-9079435);
    this.k.setTextSize(1, 18.0F);
    this.k.setGravity(1);
    ((LinearLayout)localObject2).addView(this.k);
    localObject3 = (LinearLayout.LayoutParams)this.k.getLayoutParams();
    ((LinearLayout.LayoutParams)localObject3).width = -2;
    ((LinearLayout.LayoutParams)localObject3).height = -2;
    ((LinearLayout.LayoutParams)localObject3).gravity = 1;
    ((LinearLayout.LayoutParams)localObject3).topMargin = org.vidogram.messenger.a.a(38.0F);
    this.k.setLayoutParams((ViewGroup.LayoutParams)localObject3);
    this.n = new EditText(paramContext);
    this.n.setTextSize(1, 20.0F);
    this.n.setTextColor(-16777216);
    this.n.setMaxLines(1);
    this.n.setLines(1);
    this.n.setGravity(1);
    this.n.setSingleLine(true);
    this.n.setInputType(129);
    this.n.setTransformationMethod(PasswordTransformationMethod.getInstance());
    this.n.setTypeface(Typeface.DEFAULT);
    org.vidogram.messenger.a.a(this.n);
    ((LinearLayout)localObject2).addView(this.n);
    localObject3 = (LinearLayout.LayoutParams)this.n.getLayoutParams();
    ((LinearLayout.LayoutParams)localObject3).topMargin = org.vidogram.messenger.a.a(32.0F);
    ((LinearLayout.LayoutParams)localObject3).height = org.vidogram.messenger.a.a(36.0F);
    ((LinearLayout.LayoutParams)localObject3).leftMargin = org.vidogram.messenger.a.a(40.0F);
    ((LinearLayout.LayoutParams)localObject3).rightMargin = org.vidogram.messenger.a.a(40.0F);
    ((LinearLayout.LayoutParams)localObject3).gravity = 51;
    ((LinearLayout.LayoutParams)localObject3).width = -1;
    this.n.setLayoutParams((ViewGroup.LayoutParams)localObject3);
    this.n.setOnEditorActionListener(new TextView.OnEditorActionListener()
    {
      public boolean onEditorAction(TextView paramTextView, int paramInt, KeyEvent paramKeyEvent)
      {
        if ((paramInt == 5) || (paramInt == 6))
        {
          az.a(az.this);
          return true;
        }
        return false;
      }
    });
    this.n.setCustomSelectionActionModeCallback(new ActionMode.Callback()
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
    this.l = new TextView(paramContext);
    this.l.setTextColor(-9079435);
    this.l.setTextSize(1, 14.0F);
    localObject3 = this.l;
    int i1;
    if (r.a)
    {
      i1 = 5;
      ((TextView)localObject3).setGravity(i1 | 0x30);
      this.l.setText(r.a("YourEmailInfo", 2131231984));
      ((LinearLayout)localObject2).addView(this.l);
      localObject3 = (LinearLayout.LayoutParams)this.l.getLayoutParams();
      ((LinearLayout.LayoutParams)localObject3).width = -2;
      ((LinearLayout.LayoutParams)localObject3).height = -2;
      if (!r.a)
        break label1257;
      i1 = 5;
      label636: ((LinearLayout.LayoutParams)localObject3).gravity = (i1 | 0x30);
      ((LinearLayout.LayoutParams)localObject3).topMargin = org.vidogram.messenger.a.a(30.0F);
      ((LinearLayout.LayoutParams)localObject3).leftMargin = org.vidogram.messenger.a.a(40.0F);
      ((LinearLayout.LayoutParams)localObject3).rightMargin = org.vidogram.messenger.a.a(40.0F);
      this.l.setLayoutParams((ViewGroup.LayoutParams)localObject3);
      localObject3 = new LinearLayout(paramContext);
      ((LinearLayout)localObject3).setGravity(80);
      ((LinearLayout)localObject2).addView((View)localObject3);
      localObject2 = (LinearLayout.LayoutParams)((LinearLayout)localObject3).getLayoutParams();
      ((LinearLayout.LayoutParams)localObject2).width = -1;
      ((LinearLayout.LayoutParams)localObject2).height = -1;
      ((LinearLayout)localObject3).setLayoutParams((ViewGroup.LayoutParams)localObject2);
      this.m = new TextView(paramContext);
      this.m.setTextColor(-11697229);
      this.m.setTextSize(1, 14.0F);
      localObject2 = this.m;
      if (!r.a)
        break label1262;
      i1 = 5;
      label787: ((TextView)localObject2).setGravity(i1 | 0x50);
      this.m.setText(r.a("YourEmailSkip", 2131231985));
      this.m.setPadding(0, org.vidogram.messenger.a.a(10.0F), 0, 0);
      ((LinearLayout)localObject3).addView(this.m);
      localObject2 = (LinearLayout.LayoutParams)this.m.getLayoutParams();
      ((LinearLayout.LayoutParams)localObject2).width = -2;
      ((LinearLayout.LayoutParams)localObject2).height = -2;
      if (!r.a)
        break label1267;
      i1 = 5;
      label871: ((LinearLayout.LayoutParams)localObject2).gravity = (i1 | 0x50);
      ((LinearLayout.LayoutParams)localObject2).bottomMargin = org.vidogram.messenger.a.a(14.0F);
      ((LinearLayout.LayoutParams)localObject2).leftMargin = org.vidogram.messenger.a.a(40.0F);
      ((LinearLayout.LayoutParams)localObject2).rightMargin = org.vidogram.messenger.a.a(40.0F);
      this.m.setLayoutParams((ViewGroup.LayoutParams)localObject2);
      this.m.setOnClickListener(new View.OnClickListener()
      {
        public void onClick(View paramView)
        {
          if (az.b(az.this) == 0)
          {
            if (az.c(az.this).f)
            {
              az.d(az.this);
              paramView = new g.cr();
              ConnectionsManager.a().a(paramView, new org.vidogram.tgnet.c()
              {
              }
              , 10);
              return;
            }
            az.a(az.this, r.a("RestorePasswordNoEmailTitle", 2131231748), r.a("RestorePasswordNoEmailText", 2131231747));
            return;
          }
          if (az.e(az.this) == 4)
          {
            az.a(az.this, r.a("RestorePasswordNoEmailTitle", 2131231748), r.a("RestoreEmailTroubleText", 2131231746));
            return;
          }
          paramView = new AlertDialog.Builder(az.this.l());
          paramView.setMessage(r.a("YourEmailSkipWarningText", 2131231987));
          paramView.setTitle(r.a("YourEmailSkipWarning", 2131231986));
          paramView.setPositiveButton(r.a("YourEmailSkip", 2131231985), new DialogInterface.OnClickListener()
          {
            public void onClick(DialogInterface paramDialogInterface, int paramInt)
            {
              az.a(az.this, "");
              az.a(az.this, false);
            }
          });
          paramView.setNegativeButton(r.a("Cancel", 2131230943), null);
          az.this.b(paramView.create());
        }
      });
      if (this.s != 0)
        break label1272;
      this.p = new FrameLayout(paramContext);
      ((FrameLayout)localObject1).addView(this.p);
      localObject2 = (FrameLayout.LayoutParams)this.p.getLayoutParams();
      ((FrameLayout.LayoutParams)localObject2).width = -1;
      ((FrameLayout.LayoutParams)localObject2).height = -1;
      this.p.setLayoutParams((ViewGroup.LayoutParams)localObject2);
      this.p.setOnTouchListener(new View.OnTouchListener()
      {
        public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
        {
          return true;
        }
      });
      localObject2 = new ProgressBar(paramContext);
      this.p.addView((View)localObject2);
      localObject2 = (FrameLayout.LayoutParams)this.p.getLayoutParams();
      ((FrameLayout.LayoutParams)localObject2).width = -2;
      ((FrameLayout.LayoutParams)localObject2).height = -2;
      ((FrameLayout.LayoutParams)localObject2).gravity = 17;
      this.p.setLayoutParams((ViewGroup.LayoutParams)localObject2);
      this.j = new ListView(paramContext);
      this.j.setDivider(null);
      this.j.setEmptyView(this.p);
      this.j.setDividerHeight(0);
      this.j.setVerticalScrollBarEnabled(false);
      this.j.setDrawSelectorOnTop(true);
      ((FrameLayout)localObject1).addView(this.j);
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
          if ((paramInt == az.f(az.this)) || (paramInt == az.g(az.this)))
          {
            paramAdapterView = new az(1);
            az.a(paramAdapterView, az.h(az.this));
            az.a(paramAdapterView, az.c(az.this));
            az.this.a(paramAdapterView);
          }
          do
          {
            return;
            if ((paramInt != az.i(az.this)) && (paramInt != az.j(az.this)))
              continue;
            paramAdapterView = new az(1);
            az.a(paramAdapterView, az.h(az.this));
            az.a(paramAdapterView, az.c(az.this));
            az.b(paramAdapterView, true);
            az.a(paramAdapterView, 3);
            az.this.a(paramAdapterView);
            return;
          }
          while ((paramInt != az.k(az.this)) && (paramInt != az.l(az.this)));
          paramAdapterView = new AlertDialog.Builder(az.this.l());
          paramAdapterView.setMessage(r.a("TurnPasswordOffQuestion", 2131231905));
          paramAdapterView.setTitle(r.a("AppName", 2131230856));
          paramAdapterView.setPositiveButton(r.a("OK", 2131231604), new DialogInterface.OnClickListener()
          {
            public void onClick(DialogInterface paramDialogInterface, int paramInt)
            {
              az.a(az.this, true);
            }
          });
          paramAdapterView.setNegativeButton(r.a("Cancel", 2131230943), null);
          az.this.b(paramAdapterView.create());
        }
      });
      q();
      this.d.setTitle(r.a("TwoStepVerification", 2131231906));
      this.k.setText(r.a("PleaseEnterCurrentPassword", 2131231688));
    }
    while (true)
    {
      return this.b;
      i1 = 3;
      break;
      label1257: i1 = 3;
      break label636;
      label1262: i1 = 3;
      break label787;
      label1267: i1 = 3;
      break label871;
      label1272: if (this.s != 1)
        continue;
      a(this.t);
    }
  }

  public void a(int paramInt, Object[] paramArrayOfObject)
  {
    if (paramInt == y.I)
    {
      if ((paramArrayOfObject != null) && (paramArrayOfObject.length > 0) && (paramArrayOfObject[0] != null))
        this.D = ((byte[])(byte[])paramArrayOfObject[0]);
      b(false);
      q();
    }
  }

  public void b(boolean paramBoolean1, boolean paramBoolean2)
  {
    if ((paramBoolean1) && (this.s == 1))
      org.vidogram.messenger.a.a(this.n);
  }

  public boolean f()
  {
    super.f();
    q();
    if (this.s == 0)
      y.a().a(this, y.I);
    return true;
  }

  public void g()
  {
    super.g();
    if (this.s == 0)
    {
      y.a().b(this, y.I);
      if (this.E != null)
      {
        org.vidogram.messenger.a.b(this.E);
        this.E = null;
      }
      this.z = true;
    }
    if (this.o != null);
    try
    {
      this.o.dismiss();
      this.o = null;
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
    if (this.s == 1)
      org.vidogram.messenger.a.a(new Runnable()
      {
        public void run()
        {
          if (az.m(az.this) != null)
          {
            az.m(az.this).requestFocus();
            org.vidogram.messenger.a.a(az.m(az.this));
          }
        }
      }
      , 200L);
    org.vidogram.messenger.a.a(l(), this.e);
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
      if ((az.s(az.this)) || (az.c(az.this) == null))
        return 0;
      return az.t(az.this);
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
      if ((paramInt == az.n(az.this)) || (paramInt == az.o(az.this)) || (paramInt == az.p(az.this)) || (paramInt == az.r(az.this)) || (paramInt == az.q(az.this)))
        return 1;
      return 0;
    }

    public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      boolean bool = true;
      int i = getItemViewType(paramInt);
      if (i == 0)
      {
        if (paramView != null)
          break label459;
        paramView = new bg(this.b);
        paramView.setBackgroundColor(-1);
      }
      label459: 
      while (true)
      {
        bg localbg = (bg)paramView;
        localbg.setTextColor(-14606047);
        if (paramInt == az.g(az.this))
        {
          localbg.a(r.a("ChangePassword", 2131230953), true);
          paramViewGroup = paramView;
        }
        do
        {
          return paramViewGroup;
          if (paramInt == az.f(az.this))
          {
            localbg.a(r.a("SetAdditionalPassword", 2131231820), true);
            return paramView;
          }
          if (paramInt == az.k(az.this))
          {
            localbg.a(r.a("TurnPasswordOff", 2131231904), true);
            return paramView;
          }
          if (paramInt == az.j(az.this))
          {
            paramViewGroup = r.a("ChangeRecoveryEmail", 2131230958);
            if (az.l(az.this) != -1);
            while (true)
            {
              localbg.a(paramViewGroup, bool);
              return paramView;
              bool = false;
            }
          }
          if (paramInt == az.i(az.this))
          {
            localbg.a(r.a("SetRecoveryEmail", 2131231828), false);
            return paramView;
          }
          paramViewGroup = paramView;
        }
        while (paramInt != az.l(az.this));
        localbg.setTextColor(-2995895);
        localbg.a(r.a("AbortPassword", 2131230762), false);
        return paramView;
        if (i == 1)
        {
          if (paramView == null)
            paramView = new bf(this.b);
          while (true)
          {
            if (paramInt == az.n(az.this))
            {
              ((bf)paramView).setText(r.a("SetAdditionalPasswordInfo", 2131231821));
              paramView.setBackgroundResource(2130837783);
              return paramView;
            }
            if (paramInt == az.o(az.this))
            {
              ((bf)paramView).setText("");
              paramView.setBackgroundResource(2130837783);
              return paramView;
            }
            if (paramInt == az.p(az.this))
            {
              ((bf)paramView).setText(r.a("EmailPasswordConfirmText", 2131231156, new Object[] { az.c(az.this).g }));
              paramView.setBackgroundResource(2130837784);
              return paramView;
            }
            if (paramInt == az.r(az.this))
            {
              ((bf)paramView).setText(r.a("EnabledPasswordText", 2131231163));
              paramView.setBackgroundResource(2130837783);
              return paramView;
            }
            paramViewGroup = paramView;
            if (paramInt != az.q(az.this))
              break;
            ((bf)paramView).setText(r.a("PendingEmailText", 2131231655, new Object[] { az.c(az.this).g }));
            paramView.setBackgroundResource(2130837783);
            return paramView;
          }
        }
        return paramView;
      }
    }

    public int getViewTypeCount()
    {
      return 2;
    }

    public boolean hasStableIds()
    {
      return false;
    }

    public boolean isEmpty()
    {
      return (az.s(az.this)) || (az.c(az.this) == null);
    }

    public boolean isEnabled(int paramInt)
    {
      return (paramInt != az.n(az.this)) && (paramInt != az.o(az.this)) && (paramInt != az.p(az.this)) && (paramInt != az.q(az.this)) && (paramInt != az.r(az.this));
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.az
 * JD-Core Version:    0.6.0
 */