package org.vidogram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import org.vidogram.messenger.ApplicationLoader;
import org.vidogram.messenger.ad;
import org.vidogram.messenger.r;
import org.vidogram.messenger.y;
import org.vidogram.tgnet.ConnectionsManager;
import org.vidogram.tgnet.g.cf;
import org.vidogram.tgnet.g.vw;
import org.vidogram.ui.a.a.a;
import org.vidogram.ui.a.g;

public class h extends g
{
  private EditText i;
  private EditText j;
  private View k;

  private void q()
  {
    g.vw localvw = ad.d();
    if ((localvw == null) || (this.j.getText() == null) || (this.i.getText() == null));
    String str1;
    String str2;
    do
    {
      return;
      str1 = this.i.getText().toString();
      str2 = this.j.getText().toString();
    }
    while ((localvw.e != null) && (localvw.e.equals(str1)) && (localvw.f != null) && (localvw.f.equals(str2)));
    g.cf localcf = new g.cf();
    localcf.c = 3;
    localcf.d = str1;
    localvw.e = str1;
    localcf.e = str2;
    localvw.f = str2;
    localvw = org.vidogram.messenger.v.a().a(Integer.valueOf(ad.c()));
    if (localvw != null)
    {
      localvw.e = localcf.d;
      localvw.f = localcf.e;
    }
    ad.a(true);
    y.a().a(y.C, new Object[0]);
    y.a().a(y.b, new Object[] { Integer.valueOf(1) });
    ConnectionsManager.a().a(localcf, new org.vidogram.tgnet.c()
    {
    });
  }

  public View a(Context paramContext)
  {
    int n = 5;
    this.d.setBackButtonImage(2130837794);
    this.d.setAllowOverlayTitle(true);
    this.d.setTitle(r.a("EditName", 2131231153));
    this.d.setActionBarMenuOnItemClick(new a.a()
    {
      public void a(int paramInt)
      {
        if (paramInt == -1)
          h.this.d();
        do
          return;
        while ((paramInt != 1) || (h.a(h.this).getText().length() == 0));
        h.b(h.this);
        h.this.d();
      }
    });
    this.k = this.d.a().b(1, 2130837825, org.vidogram.messenger.a.a(56.0F));
    g.vw localvw = org.vidogram.messenger.v.a().a(Integer.valueOf(ad.c()));
    if (localvw == null)
      localvw = ad.d();
    while (true)
    {
      LinearLayout localLinearLayout = new LinearLayout(paramContext);
      this.b = localLinearLayout;
      this.b.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
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
      this.i.setSingleLine(true);
      EditText localEditText = this.i;
      if (r.a)
      {
        m = 5;
        localEditText.setGravity(m);
        this.i.setInputType(49152);
        this.i.setImeOptions(5);
        this.i.setHint(r.a("FirstName", 2131231198));
        org.vidogram.messenger.a.a(this.i);
        localLinearLayout.addView(this.i, org.vidogram.ui.Components.v.a(-1, 36, 24.0F, 24.0F, 24.0F, 0.0F));
        this.i.setOnEditorActionListener(new TextView.OnEditorActionListener()
        {
          public boolean onEditorAction(TextView paramTextView, int paramInt, KeyEvent paramKeyEvent)
          {
            if (paramInt == 5)
            {
              h.c(h.this).requestFocus();
              h.c(h.this).setSelection(h.c(h.this).length());
              return true;
            }
            return false;
          }
        });
        this.j = new EditText(paramContext);
        this.j.setTextSize(1, 18.0F);
        this.j.setHintTextColor(-6842473);
        this.j.setTextColor(-14606047);
        this.j.setMaxLines(1);
        this.j.setLines(1);
        this.j.setSingleLine(true);
        paramContext = this.j;
        if (!r.a)
          break label525;
      }
      label525: for (int m = n; ; m = 3)
      {
        paramContext.setGravity(m);
        this.j.setInputType(49152);
        this.j.setImeOptions(6);
        this.j.setHint(r.a("LastName", 2131231348));
        org.vidogram.messenger.a.a(this.j);
        localLinearLayout.addView(this.j, org.vidogram.ui.Components.v.a(-1, 36, 24.0F, 16.0F, 24.0F, 0.0F));
        this.j.setOnEditorActionListener(new TextView.OnEditorActionListener()
        {
          public boolean onEditorAction(TextView paramTextView, int paramInt, KeyEvent paramKeyEvent)
          {
            if (paramInt == 6)
            {
              h.d(h.this).performClick();
              return true;
            }
            return false;
          }
        });
        if (localvw != null)
        {
          this.i.setText(localvw.e);
          this.i.setSelection(this.i.length());
          this.j.setText(localvw.f);
        }
        return this.b;
        m = 3;
        break;
      }
    }
  }

  public void b(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (paramBoolean1)
      org.vidogram.messenger.a.a(new Runnable()
      {
        public void run()
        {
          if (h.a(h.this) != null)
          {
            h.a(h.this).requestFocus();
            org.vidogram.messenger.a.a(h.a(h.this));
          }
        }
      }
      , 100L);
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
 * Qualified Name:     org.vidogram.ui.h
 * JD-Core Version:    0.6.0
 */