package org.vidogram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
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
import org.vidogram.messenger.r;
import org.vidogram.tgnet.ConnectionsManager;
import org.vidogram.tgnet.g.bv;
import org.vidogram.tgnet.g.lm;
import org.vidogram.ui.a.a.a;
import org.vidogram.ui.a.g;

public class as extends g
{
  private EditText i;
  private long j = b().getLong("dialog_id", 0L);
  private View k;

  public as(Bundle paramBundle)
  {
    super(paramBundle);
  }

  public View a(Context paramContext)
  {
    int n = 3;
    this.d.setBackButtonImage(2130837794);
    this.d.setAllowOverlayTitle(true);
    this.d.setTitle(r.a("ReportChat", 2131231719));
    this.d.setActionBarMenuOnItemClick(new a.a()
    {
      public void a(int paramInt)
      {
        if (paramInt == -1)
          as.this.d();
        do
          return;
        while ((paramInt != 1) || (as.a(as.this).getText().length() == 0));
        g.bv localbv = new g.bv();
        localbv.c = org.vidogram.messenger.v.c((int)as.b(as.this));
        localbv.d = new g.lm();
        localbv.d.b = as.a(as.this).getText().toString();
        ConnectionsManager.a().a(localbv, new org.vidogram.tgnet.c()
        {
        });
        as.this.d();
      }
    });
    this.k = this.d.a().b(1, 2130837825, org.vidogram.messenger.a.a(56.0F));
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
    this.i.setMaxLines(3);
    this.i.setPadding(0, 0, 0, 0);
    paramContext = this.i;
    if (r.a);
    for (int m = 5; ; m = 3)
    {
      paramContext.setGravity(m);
      this.i.setInputType(180224);
      this.i.setImeOptions(6);
      paramContext = this.i;
      m = n;
      if (r.a)
        m = 5;
      paramContext.setGravity(m);
      org.vidogram.messenger.a.a(this.i);
      this.i.setOnEditorActionListener(new TextView.OnEditorActionListener()
      {
        public boolean onEditorAction(TextView paramTextView, int paramInt, KeyEvent paramKeyEvent)
        {
          if ((paramInt == 6) && (as.c(as.this) != null))
          {
            as.c(as.this).performClick();
            return true;
          }
          return false;
        }
      });
      localLinearLayout.addView(this.i, org.vidogram.ui.Components.v.a(-1, 36, 24.0F, 24.0F, 24.0F, 0.0F));
      this.i.setHint(r.a("ReportChatDescription", 2131231720));
      this.i.setSelection(this.i.length());
      return this.b;
    }
  }

  public void b(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (paramBoolean1)
      org.vidogram.messenger.a.a(new Runnable()
      {
        public void run()
        {
          if (as.a(as.this) != null)
          {
            as.a(as.this).requestFocus();
            org.vidogram.messenger.a.a(as.a(as.this));
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
 * Qualified Name:     org.vidogram.ui.as
 * JD-Core Version:    0.6.0
 */