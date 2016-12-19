package org.vidogram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils.TruncateAt;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import org.vidogram.messenger.ApplicationLoader;
import org.vidogram.messenger.f;
import org.vidogram.messenger.v;
import org.vidogram.messenger.y;
import org.vidogram.messenger.y.b;
import org.vidogram.tgnet.g.vw;
import org.vidogram.tgnet.g.vx;
import org.vidogram.tgnet.g.x;
import org.vidogram.ui.Components.BackupImageView;
import org.vidogram.ui.a.a.a;
import org.vidogram.ui.a.c;
import org.vidogram.ui.a.g;

public class r extends g
  implements y.b
{
  private View i;
  private EditText j;
  private EditText k;
  private BackupImageView l;
  private TextView m;
  private TextView n;
  private int o;
  private boolean p;
  private String q = null;

  public r(Bundle paramBundle)
  {
    super(paramBundle);
  }

  private void q()
  {
    if (this.m == null);
    g.vw localvw;
    do
    {
      return;
      localvw = v.a().a(Integer.valueOf(this.o));
    }
    while (localvw == null);
    this.m.setText(org.vidogram.a.b.a().e("+" + localvw.i));
    this.n.setText(org.vidogram.messenger.r.a(localvw));
    g.x localx = null;
    if (localvw.j != null)
      localx = localvw.j.e;
    this.l.a(localx, "50_50", new org.vidogram.ui.Components.b(localvw));
  }

  public View a(Context paramContext)
  {
    int i2 = 5;
    this.d.setBackButtonImage(2130837794);
    this.d.setAllowOverlayTitle(true);
    LinearLayout localLinearLayout;
    label291: float f;
    if (this.p)
    {
      this.d.setTitle(org.vidogram.messenger.r.a("AddContactTitle", 2131230815));
      this.d.setActionBarMenuOnItemClick(new a.a()
      {
        public void a(int paramInt)
        {
          if (paramInt == -1)
            r.this.d();
          do
            return;
          while ((paramInt != 1) || (r.a(r.this).getText().length() == 0));
          g.vw localvw = v.a().a(Integer.valueOf(r.b(r.this)));
          localvw.e = r.a(r.this).getText().toString();
          localvw.f = r.c(r.this).getText().toString();
          f.a().a(localvw);
          r.this.d();
          ApplicationLoader.a.getSharedPreferences("Notifications", 0).edit().putInt("spam3_" + r.b(r.this), 1).commit();
          y.a().a(y.b, new Object[] { Integer.valueOf(1) });
        }
      });
      this.i = this.d.a().b(1, 2130837825, org.vidogram.messenger.a.a(56.0F));
      this.b = new ScrollView(paramContext);
      localLinearLayout = new LinearLayout(paramContext);
      localLinearLayout.setOrientation(1);
      ((ScrollView)this.b).addView(localLinearLayout);
      Object localObject1 = (FrameLayout.LayoutParams)localLinearLayout.getLayoutParams();
      ((FrameLayout.LayoutParams)localObject1).width = -1;
      ((FrameLayout.LayoutParams)localObject1).height = -2;
      localLinearLayout.setLayoutParams((ViewGroup.LayoutParams)localObject1);
      localLinearLayout.setOnTouchListener(new View.OnTouchListener()
      {
        public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
        {
          return true;
        }
      });
      localObject1 = new FrameLayout(paramContext);
      localLinearLayout.addView((View)localObject1);
      Object localObject2 = (LinearLayout.LayoutParams)((FrameLayout)localObject1).getLayoutParams();
      ((LinearLayout.LayoutParams)localObject2).topMargin = org.vidogram.messenger.a.a(24.0F);
      ((LinearLayout.LayoutParams)localObject2).leftMargin = org.vidogram.messenger.a.a(24.0F);
      ((LinearLayout.LayoutParams)localObject2).rightMargin = org.vidogram.messenger.a.a(24.0F);
      ((LinearLayout.LayoutParams)localObject2).width = -1;
      ((LinearLayout.LayoutParams)localObject2).height = -2;
      ((FrameLayout)localObject1).setLayoutParams((ViewGroup.LayoutParams)localObject2);
      this.l = new BackupImageView(paramContext);
      this.l.setRoundRadius(org.vidogram.messenger.a.a(30.0F));
      ((FrameLayout)localObject1).addView(this.l);
      localObject2 = (FrameLayout.LayoutParams)this.l.getLayoutParams();
      if (!org.vidogram.messenger.r.a)
        break label1266;
      i1 = 5;
      ((FrameLayout.LayoutParams)localObject2).gravity = (i1 | 0x30);
      ((FrameLayout.LayoutParams)localObject2).width = org.vidogram.messenger.a.a(60.0F);
      ((FrameLayout.LayoutParams)localObject2).height = org.vidogram.messenger.a.a(60.0F);
      this.l.setLayoutParams((ViewGroup.LayoutParams)localObject2);
      this.m = new TextView(paramContext);
      this.m.setTextColor(-14606047);
      this.m.setTextSize(1, 20.0F);
      this.m.setLines(1);
      this.m.setMaxLines(1);
      this.m.setSingleLine(true);
      this.m.setEllipsize(TextUtils.TruncateAt.END);
      localObject2 = this.m;
      if (!org.vidogram.messenger.r.a)
        break label1271;
      i1 = 5;
      label409: ((TextView)localObject2).setGravity(i1);
      this.m.setTypeface(org.vidogram.messenger.a.a("fonts/rmedium.ttf"));
      ((FrameLayout)localObject1).addView(this.m);
      localObject2 = (FrameLayout.LayoutParams)this.m.getLayoutParams();
      ((FrameLayout.LayoutParams)localObject2).width = -2;
      ((FrameLayout.LayoutParams)localObject2).height = -2;
      if (!org.vidogram.messenger.r.a)
        break label1276;
      f = 0.0F;
      label471: ((FrameLayout.LayoutParams)localObject2).leftMargin = org.vidogram.messenger.a.a(f);
      if (!org.vidogram.messenger.r.a)
        break label1283;
      f = 80.0F;
      label490: ((FrameLayout.LayoutParams)localObject2).rightMargin = org.vidogram.messenger.a.a(f);
      ((FrameLayout.LayoutParams)localObject2).topMargin = org.vidogram.messenger.a.a(3.0F);
      if (!org.vidogram.messenger.r.a)
        break label1288;
      i1 = 5;
      label518: ((FrameLayout.LayoutParams)localObject2).gravity = (i1 | 0x30);
      this.m.setLayoutParams((ViewGroup.LayoutParams)localObject2);
      this.n = new TextView(paramContext);
      this.n.setTextColor(-6710887);
      this.n.setTextSize(1, 14.0F);
      this.n.setLines(1);
      this.n.setMaxLines(1);
      this.n.setSingleLine(true);
      this.n.setEllipsize(TextUtils.TruncateAt.END);
      localObject2 = this.n;
      if (!org.vidogram.messenger.r.a)
        break label1293;
      i1 = 5;
      label617: ((TextView)localObject2).setGravity(i1);
      ((FrameLayout)localObject1).addView(this.n);
      localObject1 = (FrameLayout.LayoutParams)this.n.getLayoutParams();
      ((FrameLayout.LayoutParams)localObject1).width = -2;
      ((FrameLayout.LayoutParams)localObject1).height = -2;
      if (!org.vidogram.messenger.r.a)
        break label1298;
      f = 0.0F;
      label666: ((FrameLayout.LayoutParams)localObject1).leftMargin = org.vidogram.messenger.a.a(f);
      if (!org.vidogram.messenger.r.a)
        break label1305;
      f = 80.0F;
      label685: ((FrameLayout.LayoutParams)localObject1).rightMargin = org.vidogram.messenger.a.a(f);
      ((FrameLayout.LayoutParams)localObject1).topMargin = org.vidogram.messenger.a.a(32.0F);
      if (!org.vidogram.messenger.r.a)
        break label1310;
      i1 = 5;
      label713: ((FrameLayout.LayoutParams)localObject1).gravity = (i1 | 0x30);
      this.n.setLayoutParams((ViewGroup.LayoutParams)localObject1);
      this.j = new EditText(paramContext);
      this.j.setTextSize(1, 18.0F);
      this.j.setHintTextColor(-6842473);
      this.j.setTextColor(-14606047);
      this.j.setMaxLines(1);
      this.j.setLines(1);
      this.j.setSingleLine(true);
      localObject1 = this.j;
      if (!org.vidogram.messenger.r.a)
        break label1315;
      i1 = 5;
      label811: ((EditText)localObject1).setGravity(i1);
      this.j.setInputType(49152);
      this.j.setImeOptions(5);
      this.j.setHint(org.vidogram.messenger.r.a("FirstName", 2131231198));
      org.vidogram.messenger.a.a(this.j);
      localLinearLayout.addView(this.j);
      localObject1 = (LinearLayout.LayoutParams)this.j.getLayoutParams();
      ((LinearLayout.LayoutParams)localObject1).topMargin = org.vidogram.messenger.a.a(24.0F);
      ((LinearLayout.LayoutParams)localObject1).height = org.vidogram.messenger.a.a(36.0F);
      ((LinearLayout.LayoutParams)localObject1).leftMargin = org.vidogram.messenger.a.a(24.0F);
      ((LinearLayout.LayoutParams)localObject1).rightMargin = org.vidogram.messenger.a.a(24.0F);
      ((LinearLayout.LayoutParams)localObject1).width = -1;
      this.j.setLayoutParams((ViewGroup.LayoutParams)localObject1);
      this.j.setOnEditorActionListener(new TextView.OnEditorActionListener()
      {
        public boolean onEditorAction(TextView paramTextView, int paramInt, KeyEvent paramKeyEvent)
        {
          if (paramInt == 5)
          {
            r.c(r.this).requestFocus();
            r.c(r.this).setSelection(r.c(r.this).length());
            return true;
          }
          return false;
        }
      });
      this.k = new EditText(paramContext);
      this.k.setTextSize(1, 18.0F);
      this.k.setHintTextColor(-6842473);
      this.k.setTextColor(-14606047);
      this.k.setMaxLines(1);
      this.k.setLines(1);
      this.k.setSingleLine(true);
      paramContext = this.k;
      if (!org.vidogram.messenger.r.a)
        break label1320;
    }
    label1283: label1288: label1293: label1298: label1305: label1310: label1315: label1320: for (int i1 = i2; ; i1 = 3)
    {
      paramContext.setGravity(i1);
      this.k.setInputType(49152);
      this.k.setImeOptions(6);
      this.k.setHint(org.vidogram.messenger.r.a("LastName", 2131231348));
      org.vidogram.messenger.a.a(this.k);
      localLinearLayout.addView(this.k);
      paramContext = (LinearLayout.LayoutParams)this.k.getLayoutParams();
      paramContext.topMargin = org.vidogram.messenger.a.a(16.0F);
      paramContext.height = org.vidogram.messenger.a.a(36.0F);
      paramContext.leftMargin = org.vidogram.messenger.a.a(24.0F);
      paramContext.rightMargin = org.vidogram.messenger.a.a(24.0F);
      paramContext.width = -1;
      this.k.setLayoutParams(paramContext);
      this.k.setOnEditorActionListener(new TextView.OnEditorActionListener()
      {
        public boolean onEditorAction(TextView paramTextView, int paramInt, KeyEvent paramKeyEvent)
        {
          if (paramInt == 6)
          {
            r.d(r.this).performClick();
            return true;
          }
          return false;
        }
      });
      paramContext = v.a().a(Integer.valueOf(this.o));
      if (paramContext != null)
      {
        if ((paramContext.i == null) && (this.q != null))
          paramContext.i = org.vidogram.a.b.b(this.q);
        this.j.setText(paramContext.e);
        this.j.setSelection(this.j.length());
        this.k.setText(paramContext.f);
      }
      return this.b;
      this.d.setTitle(org.vidogram.messenger.r.a("EditName", 2131231153));
      break;
      label1266: i1 = 3;
      break label291;
      label1271: i1 = 3;
      break label409;
      label1276: f = 80.0F;
      break label471;
      f = 0.0F;
      break label490;
      i1 = 3;
      break label518;
      i1 = 3;
      break label617;
      f = 80.0F;
      break label666;
      f = 0.0F;
      break label685;
      i1 = 3;
      break label713;
      i1 = 3;
      break label811;
    }
  }

  public void a(int paramInt, Object[] paramArrayOfObject)
  {
    if (paramInt == y.b)
    {
      paramInt = ((Integer)paramArrayOfObject[0]).intValue();
      if (((paramInt & 0x2) != 0) || ((paramInt & 0x4) != 0))
        q();
    }
  }

  public void b(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (paramBoolean1)
    {
      this.j.requestFocus();
      org.vidogram.messenger.a.a(this.j);
    }
  }

  public boolean f()
  {
    int i2 = 0;
    y.a().a(this, y.b);
    this.o = b().getInt("user_id", 0);
    this.q = b().getString("phone");
    this.p = b().getBoolean("addContact", false);
    int i1 = i2;
    if (v.a().a(Integer.valueOf(this.o)) != null)
    {
      i1 = i2;
      if (super.f())
        i1 = 1;
    }
    return i1;
  }

  public void g()
  {
    super.g();
    y.a().b(this, y.b);
  }

  public void i()
  {
    super.i();
    q();
    if (!ApplicationLoader.a.getSharedPreferences("mainconfig", 0).getBoolean("view_animations", true))
    {
      this.j.requestFocus();
      org.vidogram.messenger.a.a(this.j);
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.r
 * JD-Core Version:    0.6.0
 */