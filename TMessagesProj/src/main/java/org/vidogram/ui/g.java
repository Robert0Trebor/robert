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
import org.vidogram.tgnet.g.i;
import org.vidogram.ui.a.a.a;
import org.vidogram.ui.a.c;

public class g extends org.vidogram.ui.a.g
{
  private EditText i;
  private int j;
  private View k;

  public g(Bundle paramBundle)
  {
    super(paramBundle);
  }

  private void q()
  {
    org.vidogram.messenger.v.a().b(this.j, this.i.getText().toString());
  }

  public View a(Context paramContext)
  {
    int n = 3;
    this.d.setBackButtonImage(2130837794);
    this.d.setAllowOverlayTitle(true);
    this.d.setTitle(r.a("EditName", 2131231153));
    this.d.setActionBarMenuOnItemClick(new a.a()
    {
      public void a(int paramInt)
      {
        if (paramInt == -1)
          g.this.d();
        do
          return;
        while ((paramInt != 1) || (g.a(g.this).getText().length() == 0));
        g.b(g.this);
        g.this.d();
      }
    });
    this.k = this.d.a().b(1, 2130837825, org.vidogram.messenger.a.a(56.0F));
    g.i locali = org.vidogram.messenger.v.a().b(Integer.valueOf(this.j));
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
    this.i.setText(locali.i);
    this.i.setTextSize(1, 18.0F);
    this.i.setHintTextColor(-6842473);
    this.i.setTextColor(-14606047);
    this.i.setMaxLines(3);
    this.i.setPadding(0, 0, 0, 0);
    paramContext = this.i;
    int m;
    if (r.a)
    {
      m = 5;
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
          if ((paramInt == 6) && (g.c(g.this) != null))
          {
            g.c(g.this).performClick();
            return true;
          }
          return false;
        }
      });
      localLinearLayout.addView(this.i, org.vidogram.ui.Components.v.a(-1, 36, 24.0F, 24.0F, 24.0F, 0.0F));
      if (this.j <= 0)
        break label359;
      this.i.setHint(r.a("GroupName", 2131231278));
    }
    while (true)
    {
      this.i.setSelection(this.i.length());
      return this.b;
      m = 3;
      break;
      label359: this.i.setHint(r.a("EnterListName", 2131231182));
    }
  }

  public void b(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (paramBoolean1)
      org.vidogram.messenger.a.a(new Runnable()
      {
        public void run()
        {
          if (g.a(g.this) != null)
          {
            g.a(g.this).requestFocus();
            org.vidogram.messenger.a.a(g.a(g.this));
          }
        }
      }
      , 100L);
  }

  public boolean f()
  {
    super.f();
    this.j = b().getInt("chat_id", 0);
    return true;
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
 * Qualified Name:     org.vidogram.ui.g
 * JD-Core Version:    0.6.0
 */