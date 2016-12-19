package org.vidogram.ui;

import android.app.AlertDialog.Builder;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.SharedPreferences;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import org.vidogram.messenger.ApplicationLoader;
import org.vidogram.messenger.ad;
import org.vidogram.messenger.n;
import org.vidogram.messenger.r;
import org.vidogram.messenger.y;
import org.vidogram.tgnet.ConnectionsManager;
import org.vidogram.tgnet.g.bi;
import org.vidogram.tgnet.g.ch;
import org.vidogram.tgnet.g.vw;
import org.vidogram.ui.a.a.a;
import org.vidogram.ui.a.g;

public class k extends g
{
  private EditText i;
  private View j;
  private TextView k;
  private int l = 0;
  private String m = null;
  private Runnable n = null;
  private boolean o = false;

  private void a(String paramString)
  {
    if (l() == null)
      return;
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(l());
    localBuilder.setTitle(r.a("AppName", 2131230856));
    int i1 = -1;
    switch (paramString.hashCode())
    {
    default:
      switch (i1)
      {
      default:
        localBuilder.setMessage(r.a("ErrorOccurred", 2131231186));
      case 0:
      case 1:
      case 2:
      }
    case 288843630:
    case 533175271:
    case -141887186:
    }
    while (true)
    {
      localBuilder.setPositiveButton(r.a("OK", 2131231604), null);
      b(localBuilder.create());
      return;
      if (!paramString.equals("USERNAME_INVALID"))
        break;
      i1 = 0;
      break;
      if (!paramString.equals("USERNAME_OCCUPIED"))
        break;
      i1 = 1;
      break;
      if (!paramString.equals("USERNAMES_UNAVAILABLE"))
        break;
      i1 = 2;
      break;
      localBuilder.setMessage(r.a("UsernameInvalid", 2131231931));
      continue;
      localBuilder.setMessage(r.a("UsernameInUse", 2131231930));
      continue;
      localBuilder.setMessage(r.a("FeatureUnavailable", 2131231191));
    }
  }

  private boolean a(String paramString, boolean paramBoolean)
  {
    if ((paramString != null) && (paramString.length() > 0))
      this.k.setVisibility(0);
    while ((paramBoolean) && (paramString.length() == 0))
    {
      return true;
      this.k.setVisibility(8);
    }
    if (this.n != null)
    {
      org.vidogram.messenger.a.b(this.n);
      this.n = null;
      this.m = null;
      if (this.l != 0)
        ConnectionsManager.a().a(this.l, true);
    }
    this.o = false;
    if (paramString != null)
    {
      if ((paramString.startsWith("_")) || (paramString.endsWith("_")))
      {
        this.k.setText(r.a("UsernameInvalid", 2131231931));
        this.k.setTextColor(-3198928);
        return false;
      }
      int i1 = 0;
      while (i1 < paramString.length())
      {
        int i2 = paramString.charAt(i1);
        if ((i1 == 0) && (i2 >= 48) && (i2 <= 57))
        {
          if (paramBoolean)
          {
            a(r.a("UsernameInvalidStartNumber", 2131231934));
            return false;
          }
          this.k.setText(r.a("UsernameInvalidStartNumber", 2131231934));
          this.k.setTextColor(-3198928);
          return false;
        }
        if (((i2 < 48) || (i2 > 57)) && ((i2 < 97) || (i2 > 122)) && ((i2 < 65) || (i2 > 90)) && (i2 != 95))
        {
          if (paramBoolean)
          {
            a(r.a("UsernameInvalid", 2131231931));
            return false;
          }
          this.k.setText(r.a("UsernameInvalid", 2131231931));
          this.k.setTextColor(-3198928);
          return false;
        }
        i1 += 1;
      }
    }
    if ((paramString == null) || (paramString.length() < 5))
    {
      if (paramBoolean)
      {
        a(r.a("UsernameInvalidShort", 2131231933));
        return false;
      }
      this.k.setText(r.a("UsernameInvalidShort", 2131231933));
      this.k.setTextColor(-3198928);
      return false;
    }
    if (paramString.length() > 32)
    {
      if (paramBoolean)
      {
        a(r.a("UsernameInvalidLong", 2131231932));
        return false;
      }
      this.k.setText(r.a("UsernameInvalidLong", 2131231932));
      this.k.setTextColor(-3198928);
      return false;
    }
    if (!paramBoolean)
    {
      String str2 = ad.d().g;
      String str1 = str2;
      if (str2 == null)
        str1 = "";
      if (paramString.equals(str1))
      {
        this.k.setText(r.a("UsernameAvailable", 2131231926, new Object[] { paramString }));
        this.k.setTextColor(-14248148);
        return true;
      }
      this.k.setText(r.a("UsernameChecking", 2131231927));
      this.k.setTextColor(-9605774);
      this.m = paramString;
      this.n = new Runnable(paramString)
      {
        public void run()
        {
          g.bi localbi = new g.bi();
          localbi.c = this.a;
          k.a(k.this, ConnectionsManager.a().a(localbi, new org.vidogram.tgnet.c()
          {
          }
          , 2));
        }
      };
      org.vidogram.messenger.a.a(this.n, 300L);
    }
    return true;
  }

  private void q()
  {
    if (!a(this.i.getText().toString(), true));
    do
    {
      return;
      localObject = ad.d();
    }
    while ((l() == null) || (localObject == null));
    String str = ((g.vw)localObject).g;
    Object localObject = str;
    if (str == null)
      localObject = "";
    str = this.i.getText().toString();
    if (((String)localObject).equals(str))
    {
      d();
      return;
    }
    localObject = new ProgressDialog(l());
    ((ProgressDialog)localObject).setMessage(r.a("Loading", 2131231394));
    ((ProgressDialog)localObject).setCanceledOnTouchOutside(false);
    ((ProgressDialog)localObject).setCancelable(false);
    g.ch localch = new g.ch();
    localch.c = str;
    y.a().a(y.b, new Object[] { Integer.valueOf(1) });
    int i1 = ConnectionsManager.a().a(localch, new org.vidogram.tgnet.c((ProgressDialog)localObject)
    {
    }
    , 2);
    ConnectionsManager.a().a(i1, this.e);
    ((ProgressDialog)localObject).setButton(-2, r.a("Cancel", 2131230943), new DialogInterface.OnClickListener(i1)
    {
      public void onClick(DialogInterface paramDialogInterface, int paramInt)
      {
        ConnectionsManager.a().a(this.a, true);
        try
        {
          paramDialogInterface.dismiss();
          return;
        }
        catch (java.lang.Exception paramDialogInterface)
        {
          n.a("tmessages", paramDialogInterface);
        }
      }
    });
    ((ProgressDialog)localObject).show();
  }

  public View a(Context paramContext)
  {
    this.d.setBackButtonImage(2130837794);
    this.d.setAllowOverlayTitle(true);
    this.d.setTitle(r.a("Username", 2131231925));
    this.d.setActionBarMenuOnItemClick(new a.a()
    {
      public void a(int paramInt)
      {
        if (paramInt == -1)
          k.this.d();
        do
          return;
        while (paramInt != 1);
        k.a(k.this);
      }
    });
    this.j = this.d.a().b(1, 2130837825, org.vidogram.messenger.a.a(56.0F));
    Object localObject1 = org.vidogram.messenger.v.a().a(Integer.valueOf(ad.c()));
    if (localObject1 == null)
      localObject1 = ad.d();
    while (true)
    {
      this.b = new LinearLayout(paramContext);
      ((LinearLayout)this.b).setOrientation(1);
      this.b.setOnTouchListener(new View.OnTouchListener()
      {
        public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
        {
          return true;
        }
      });
      this.i = new EditText(paramContext);
      this.i.setTextSize(1, 18.0F);
      this.i.setHintTextColor(-6842473);
      this.i.setTextColor(-14606047);
      this.i.setMaxLines(1);
      this.i.setLines(1);
      this.i.setPadding(0, 0, 0, 0);
      this.i.setSingleLine(true);
      Object localObject2 = this.i;
      if (r.a)
      {
        i1 = 5;
        ((EditText)localObject2).setGravity(i1);
        this.i.setInputType(180224);
        this.i.setImeOptions(6);
        this.i.setHint(r.a("UsernamePlaceholder", 2131231935));
        org.vidogram.messenger.a.a(this.i);
        this.i.setOnEditorActionListener(new TextView.OnEditorActionListener()
        {
          public boolean onEditorAction(TextView paramTextView, int paramInt, KeyEvent paramKeyEvent)
          {
            if ((paramInt == 6) && (k.b(k.this) != null))
            {
              k.b(k.this).performClick();
              return true;
            }
            return false;
          }
        });
        ((LinearLayout)this.b).addView(this.i, org.vidogram.ui.Components.v.a(-1, 36, 24.0F, 24.0F, 24.0F, 0.0F));
        if ((localObject1 != null) && (((g.vw)localObject1).g != null) && (((g.vw)localObject1).g.length() > 0))
        {
          this.i.setText(((g.vw)localObject1).g);
          this.i.setSelection(this.i.length());
        }
        this.k = new TextView(paramContext);
        this.k.setTextSize(1, 15.0F);
        localObject1 = this.k;
        if (!r.a)
          break label569;
        i1 = 5;
        label399: ((TextView)localObject1).setGravity(i1);
        localObject1 = (LinearLayout)this.b;
        localObject2 = this.k;
        if (!r.a)
          break label574;
        i1 = 5;
        label426: ((LinearLayout)localObject1).addView((View)localObject2, org.vidogram.ui.Components.v.b(-2, -2, i1, 24, 12, 24, 0));
        paramContext = new TextView(paramContext);
        paramContext.setTextSize(1, 15.0F);
        paramContext.setTextColor(-9605774);
        if (!r.a)
          break label579;
        i1 = 5;
        label478: paramContext.setGravity(i1);
        paramContext.setText(org.vidogram.messenger.a.b(r.a("UsernameHelp", 2131231929)));
        localObject1 = (LinearLayout)this.b;
        if (!r.a)
          break label584;
      }
      label569: label574: label579: label584: for (int i1 = 5; ; i1 = 3)
      {
        ((LinearLayout)localObject1).addView(paramContext, org.vidogram.ui.Components.v.b(-2, -2, i1, 24, 10, 24, 0));
        this.i.addTextChangedListener(new TextWatcher()
        {
          public void afterTextChanged(Editable paramEditable)
          {
          }

          public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
          {
          }

          public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
          {
            k.a(k.this, k.c(k.this).getText().toString(), false);
          }
        });
        this.k.setVisibility(8);
        return this.b;
        i1 = 3;
        break;
        i1 = 3;
        break label399;
        i1 = 3;
        break label426;
        i1 = 3;
        break label478;
      }
    }
  }

  public void b(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (paramBoolean1)
    {
      this.i.requestFocus();
      org.vidogram.messenger.a.a(this.i);
    }
  }

  public void i()
  {
    super.i();
    if (!ApplicationLoader.a.getSharedPreferences("mainconfig", 0).getBoolean("view_animations", true))
    {
      this.i.requestFocus();
      org.vidogram.messenger.a.a(this.i);
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.k
 * JD-Core Version:    0.6.0
 */