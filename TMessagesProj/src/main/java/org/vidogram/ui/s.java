package org.vidogram.ui;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.HashMap;
import org.vidogram.messenger.ApplicationLoader;
import org.vidogram.messenger.Utilities;
import org.vidogram.messenger.ab;
import org.vidogram.messenger.ad;
import org.vidogram.messenger.ae;
import org.vidogram.messenger.f.a;
import org.vidogram.messenger.n;
import org.vidogram.messenger.r;
import org.vidogram.messenger.v;
import org.vidogram.messenger.w;
import org.vidogram.messenger.y.b;
import org.vidogram.tgnet.g.t;
import org.vidogram.tgnet.g.vw;
import org.vidogram.ui.Components.x;
import org.vidogram.ui.a.a.a;
import org.vidogram.ui.a.c;
import org.vidogram.ui.a.d;
import org.vidogram.ui.a.d.b;
import org.vidogram.ui.a.g;
import org.vidogram.ui.b.e;
import org.vidogram.ui.c.bh;

public class s extends g
  implements y.b
{
  private a A;
  private e i;
  private TextView j;
  private x k;
  private org.vidogram.ui.b.o l;
  private boolean m;
  private boolean n;
  private boolean o;
  private boolean p;
  private boolean q;
  private boolean r;
  private boolean s;
  private boolean t = false;
  private boolean u = true;
  private boolean v = true;
  private int w;
  private String x = null;
  private HashMap<Integer, g.vw> y;
  private boolean z = true;

  public s(Bundle paramBundle)
  {
    super(paramBundle);
  }

  private void a(int paramInt)
  {
    if (this.k != null)
    {
      int i2 = this.k.getChildCount();
      int i1 = 0;
      while (i1 < i2)
      {
        View localView = this.k.getChildAt(i1);
        if ((localView instanceof bh))
          ((bh)localView).a(paramInt);
        i1 += 1;
      }
    }
  }

  private void a(g.vw paramvw, boolean paramBoolean, String paramString)
  {
    AlertDialog.Builder localBuilder;
    EditText localEditText;
    if ((paramBoolean) && (this.x != null))
    {
      if (l() == null)
        return;
      if ((paramvw.r) && (paramvw.t))
        try
        {
          Toast.makeText(l(), r.a("BotCantJoinGroups", 2131230923), 0).show();
          return;
        }
        catch (java.lang.Exception paramvw)
        {
          n.a("tmessages", paramvw);
          return;
        }
      localBuilder = new AlertDialog.Builder(l());
      localBuilder.setTitle(r.a("AppName", 2131230856));
      paramString = r.a(this.x, new Object[] { ae.c(paramvw) });
      if ((paramvw.r) || (!this.v))
        break label370;
      paramString = String.format("%s\n\n%s", new Object[] { paramString, r.a("AddToTheGroupForwardCount", 2131230830) });
      localEditText = new EditText(l());
      localEditText.setTextSize(18.0F);
      localEditText.setText("50");
      localEditText.setGravity(17);
      localEditText.setInputType(2);
      localEditText.setImeOptions(6);
      localEditText.addTextChangedListener(new TextWatcher(localEditText)
      {
        public void afterTextChanged(Editable paramEditable)
        {
          int i;
          try
          {
            paramEditable = paramEditable.toString();
            if (paramEditable.length() == 0)
              return;
            i = Utilities.a(paramEditable).intValue();
            if (i < 0)
            {
              this.a.setText("0");
              this.a.setSelection(this.a.length());
              return;
            }
            if (i > 300)
            {
              this.a.setText("300");
              this.a.setSelection(this.a.length());
              return;
            }
          }
          catch (java.lang.Exception paramEditable)
          {
            n.a("tmessages", paramEditable);
            return;
          }
          if (!paramEditable.equals("" + i))
          {
            this.a.setText("" + i);
            this.a.setSelection(this.a.length());
          }
        }

        public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
        {
        }

        public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
        {
        }
      });
      localBuilder.setView(localEditText);
    }
    while (true)
    {
      localBuilder.setMessage(paramString);
      localBuilder.setPositiveButton(r.a("OK", 2131231604), new DialogInterface.OnClickListener(paramvw, localEditText)
      {
        public void onClick(DialogInterface paramDialogInterface, int paramInt)
        {
          s locals = s.this;
          g.vw localvw = this.a;
          if (this.b != null);
          for (paramDialogInterface = this.b.getText().toString(); ; paramDialogInterface = "0")
          {
            s.a(locals, localvw, false, paramDialogInterface);
            return;
          }
        }
      });
      localBuilder.setNegativeButton(r.a("Cancel", 2131230943), null);
      b(localBuilder.create());
      if (localEditText == null)
        break;
      paramvw = (ViewGroup.MarginLayoutParams)localEditText.getLayoutParams();
      if (paramvw != null)
      {
        if ((paramvw instanceof FrameLayout.LayoutParams))
          ((FrameLayout.LayoutParams)paramvw).gravity = 1;
        int i1 = org.vidogram.messenger.a.a(10.0F);
        paramvw.leftMargin = i1;
        paramvw.rightMargin = i1;
        localEditText.setLayoutParams(paramvw);
      }
      localEditText.setSelection(localEditText.getText().length());
      return;
      if (this.A != null)
      {
        this.A.a(paramvw, paramString);
        this.A = null;
      }
      d();
      return;
      label370: localEditText = null;
    }
  }

  public View a(Context paramContext)
  {
    int i2 = 1;
    this.n = false;
    this.m = false;
    this.d.setBackButtonImage(2130837794);
    this.d.setAllowOverlayTitle(true);
    label168: boolean bool1;
    if (this.q)
      if (this.r)
      {
        this.d.setTitle(r.a("SelectContact", 2131231791));
        this.d.setActionBarMenuOnItemClick(new a.a()
        {
          public void a(int paramInt)
          {
            if (paramInt == -1)
              s.this.d();
            do
              return;
            while (paramInt != 1);
            s.this.a(new ag());
          }
        });
        Object localObject1 = this.d.a();
        ((c)localObject1).b(0, 2130837806).d(true).a(new d.b()
        {
          public void a()
          {
            s.a(s.this, true);
          }

          public void a(EditText paramEditText)
          {
            if (s.a(s.this) == null)
              return;
            paramEditText = paramEditText.getText().toString();
            if (paramEditText.length() != 0)
            {
              s.b(s.this, true);
              if (s.c(s.this) != null)
              {
                s.c(s.this).setAdapter(s.a(s.this));
                s.a(s.this).notifyDataSetChanged();
                s.c(s.this).setFastScrollAlwaysVisible(false);
                s.c(s.this).setFastScrollEnabled(false);
                s.c(s.this).setVerticalScrollBarEnabled(true);
              }
              if (s.d(s.this) != null)
                s.d(s.this).setText(r.a("NoResult", 2131231509));
            }
            s.a(s.this).a(paramEditText);
          }

          public void c()
          {
            s.a(s.this).a(null);
            s.a(s.this, false);
            s.b(s.this, false);
            s.c(s.this).setAdapter(s.b(s.this));
            s.b(s.this).notifyDataSetChanged();
            s.c(s.this).setFastScrollAlwaysVisible(true);
            s.c(s.this).setFastScrollEnabled(true);
            s.c(s.this).setVerticalScrollBarEnabled(false);
            s.d(s.this).setText(r.a("NoContacts", 2131231492));
          }
        }).getSearchField().setHint(r.a("Search", 2131231766));
        ((c)localObject1).b(1, 2130837588);
        this.l = new org.vidogram.ui.b.o(paramContext, this.y, this.z, false, false, this.u);
        if (!this.o)
          break label708;
        i1 = 1;
        boolean bool2 = this.p;
        localObject1 = this.y;
        if (this.w == 0)
          break label713;
        bool1 = true;
        label190: this.i = new org.vidogram.ui.b.f(paramContext, i1, bool2, (HashMap)localObject1, bool1);
        this.b = new FrameLayout(paramContext);
        localObject1 = new LinearLayout(paramContext);
        ((LinearLayout)localObject1).setVisibility(4);
        ((LinearLayout)localObject1).setOrientation(1);
        ((FrameLayout)this.b).addView((View)localObject1);
        Object localObject2 = (FrameLayout.LayoutParams)((LinearLayout)localObject1).getLayoutParams();
        ((FrameLayout.LayoutParams)localObject2).width = -1;
        ((FrameLayout.LayoutParams)localObject2).height = -1;
        ((FrameLayout.LayoutParams)localObject2).gravity = 48;
        ((LinearLayout)localObject1).setLayoutParams((ViewGroup.LayoutParams)localObject2);
        ((LinearLayout)localObject1).setOnTouchListener(new View.OnTouchListener()
        {
          public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
          {
            return true;
          }
        });
        this.j = new TextView(paramContext);
        this.j.setTextColor(-8355712);
        this.j.setTextSize(1, 20.0F);
        this.j.setGravity(17);
        this.j.setText(r.a("NoContacts", 2131231492));
        ((LinearLayout)localObject1).addView(this.j);
        localObject2 = (LinearLayout.LayoutParams)this.j.getLayoutParams();
        ((LinearLayout.LayoutParams)localObject2).width = -1;
        ((LinearLayout.LayoutParams)localObject2).height = -1;
        ((LinearLayout.LayoutParams)localObject2).weight = 0.5F;
        this.j.setLayoutParams((ViewGroup.LayoutParams)localObject2);
        localObject2 = new FrameLayout(paramContext);
        ((LinearLayout)localObject1).addView((View)localObject2);
        LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)((FrameLayout)localObject2).getLayoutParams();
        localLayoutParams.width = -1;
        localLayoutParams.height = -1;
        localLayoutParams.weight = 0.5F;
        ((FrameLayout)localObject2).setLayoutParams(localLayoutParams);
        this.k = new x(paramContext);
        this.k.setEmptyView((View)localObject1);
        this.k.setVerticalScrollBarEnabled(false);
        this.k.setDivider(null);
        this.k.setDividerHeight(0);
        this.k.setFastScrollEnabled(true);
        this.k.setScrollBarStyle(33554432);
        this.k.setAdapter(this.i);
        this.k.setFastScrollAlwaysVisible(true);
        paramContext = this.k;
        if (!r.a)
          break label719;
      }
    label708: label713: label719: for (int i1 = i2; ; i1 = 2)
    {
      paramContext.setVerticalScrollbarPosition(i1);
      ((FrameLayout)this.b).addView(this.k);
      paramContext = (FrameLayout.LayoutParams)this.k.getLayoutParams();
      paramContext.width = -1;
      paramContext.height = -1;
      this.k.setLayoutParams(paramContext);
      this.k.setOnItemClickListener(new AdapterView.OnItemClickListener()
      {
        public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
        {
          if ((s.e(s.this)) && (s.f(s.this)))
          {
            paramAdapterView = (g.vw)s.a(s.this).b(paramInt);
            if (paramAdapterView != null);
          }
          while (true)
          {
            return;
            if (s.a(s.this).a(paramInt))
            {
              paramView = new ArrayList();
              paramView.add(paramAdapterView);
              v.a().a(paramView, false);
              w.a().a(paramView, null, false, true);
            }
            if (s.g(s.this))
            {
              if ((s.h(s.this) != null) && (s.h(s.this).containsKey(Integer.valueOf(paramAdapterView.d))))
                continue;
              s.a(s.this, paramAdapterView, true, null);
              return;
            }
            if (s.i(s.this))
            {
              if (paramAdapterView.d == ad.c())
                continue;
              s.c(s.this, true);
              ab.a().a(s.this.l(), paramAdapterView);
              return;
            }
            paramView = new Bundle();
            paramView.putInt("user_id", paramAdapterView.d);
            if (!v.a(paramView, s.this))
              continue;
            s.this.a(new q(paramView), true);
            return;
            int i = s.b(s.this).a(paramInt);
            paramInt = s.b(s.this).b(paramInt);
            if ((paramInt < 0) || (i < 0))
              continue;
            if (((!s.j(s.this)) || (s.k(s.this) != 0)) && (i == 0))
            {
              if (s.l(s.this))
              {
                if (paramInt != 0)
                  continue;
                try
                {
                  paramAdapterView = new Intent("android.intent.action.SEND");
                  paramAdapterView.setType("text/plain");
                  paramAdapterView.putExtra("android.intent.extra.TEXT", org.vidogram.messenger.f.a().d());
                  s.this.l().startActivityForResult(Intent.createChooser(paramAdapterView, r.a("InviteFriends", 2131231321)), 500);
                  return;
                }
                catch (java.lang.Exception paramAdapterView)
                {
                  n.a("tmessages", paramAdapterView);
                  return;
                }
              }
              if (s.k(s.this) != 0)
              {
                if (paramInt != 0)
                  continue;
                s.this.a(new aa(s.k(s.this)));
                return;
              }
              if (paramInt == 0)
              {
                if (!v.a("chat_create", s.this))
                  continue;
                s.this.a(new y(), false);
                return;
              }
              if (paramInt == 1)
              {
                paramAdapterView = new Bundle();
                paramAdapterView.putBoolean("onlyUsers", true);
                paramAdapterView.putBoolean("destroyAfterSelect", true);
                paramAdapterView.putBoolean("createSecretChat", true);
                paramAdapterView.putBoolean("allowBots", false);
                s.this.a(new s(paramAdapterView), false);
                return;
              }
              if ((paramInt != 2) || (!v.a("broadcast_create", s.this)))
                continue;
              paramAdapterView = ApplicationLoader.a.getSharedPreferences("mainconfig", 0);
              if (paramAdapterView.getBoolean("channel_intro", false))
              {
                paramAdapterView = new Bundle();
                paramAdapterView.putInt("step", 0);
                s.this.a(new l(paramAdapterView));
                return;
              }
              s.this.a(new o());
              paramAdapterView.edit().putBoolean("channel_intro", true).commit();
              return;
            }
            paramAdapterView = s.b(s.this).c(i, paramInt);
            if ((paramAdapterView instanceof g.vw))
            {
              paramAdapterView = (g.vw)paramAdapterView;
              if (s.g(s.this))
              {
                if ((s.h(s.this) != null) && (s.h(s.this).containsKey(Integer.valueOf(paramAdapterView.d))))
                  continue;
                s.a(s.this, paramAdapterView, true, null);
                return;
              }
              if (s.i(s.this))
              {
                s.c(s.this, true);
                ab.a().a(s.this.l(), paramAdapterView);
                return;
              }
              paramView = new Bundle();
              paramView.putInt("user_id", paramAdapterView.d);
              if (!v.a(paramView, s.this))
                continue;
              s.this.a(new q(paramView), true);
              return;
            }
            if (!(paramAdapterView instanceof f.a))
              continue;
            paramAdapterView = (f.a)paramAdapterView;
            if (!paramAdapterView.b.isEmpty());
            for (paramAdapterView = (String)paramAdapterView.b.get(0); (paramAdapterView != null) && (s.this.l() != null); paramAdapterView = null)
            {
              paramView = new AlertDialog.Builder(s.this.l());
              paramView.setMessage(r.a("InviteUser", 2131231327));
              paramView.setTitle(r.a("AppName", 2131230856));
              paramView.setPositiveButton(r.a("OK", 2131231604), new DialogInterface.OnClickListener(paramAdapterView)
              {
                public void onClick(DialogInterface paramDialogInterface, int paramInt)
                {
                  try
                  {
                    paramDialogInterface = new Intent("android.intent.action.VIEW", Uri.fromParts("sms", this.a, null));
                    paramDialogInterface.putExtra("sms_body", r.a("InviteText", 2131231323));
                    s.this.l().startActivityForResult(paramDialogInterface, 500);
                    return;
                  }
                  catch (java.lang.Exception paramDialogInterface)
                  {
                    n.a("tmessages", paramDialogInterface);
                  }
                }
              });
              paramView.setNegativeButton(r.a("Cancel", 2131230943), null);
              s.this.b(paramView.create());
              return;
            }
          }
        }
      });
      this.k.setOnScrollListener(new AbsListView.OnScrollListener()
      {
        public void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
        {
          if (paramAbsListView.isFastScrollEnabled())
            org.vidogram.messenger.a.d(paramAbsListView);
        }

        public void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
        {
          if ((paramInt == 1) && (s.e(s.this)) && (s.f(s.this)))
            org.vidogram.messenger.a.b(s.this.l().getCurrentFocus());
        }
      });
      return this.b;
      if (this.s)
      {
        this.d.setTitle(r.a("NewSecretChat", 2131231485));
        break;
      }
      this.d.setTitle(r.a("NewMessageTitle", 2131231478));
      break;
      this.d.setTitle(r.a("Contacts", 2131231079));
      break;
      i1 = 0;
      break label168;
      bool1 = false;
      break label190;
    }
  }

  public void a(int paramInt, Object[] paramArrayOfObject)
  {
    if (paramInt == org.vidogram.messenger.y.k)
      if (this.i != null)
        this.i.notifyDataSetChanged();
    do
      while (true)
      {
        return;
        if (paramInt == org.vidogram.messenger.y.b)
        {
          paramInt = ((Integer)paramArrayOfObject[0]).intValue();
          if (((paramInt & 0x2) == 0) && ((paramInt & 0x1) == 0) && ((paramInt & 0x4) == 0))
            continue;
          a(paramInt);
          return;
        }
        if (paramInt != org.vidogram.messenger.y.t)
          break;
        if ((!this.s) || (!this.t))
          continue;
        paramArrayOfObject = (g.t)paramArrayOfObject[0];
        Bundle localBundle = new Bundle();
        localBundle.putInt("enc_id", paramArrayOfObject.b);
        org.vidogram.messenger.y.a().a(org.vidogram.messenger.y.d, new Object[0]);
        a(new q(localBundle), true);
        return;
      }
    while ((paramInt != org.vidogram.messenger.y.d) || (this.t));
    e();
  }

  public void a(HashMap<Integer, g.vw> paramHashMap)
  {
    this.y = paramHashMap;
  }

  public void a(a parama)
  {
    this.A = parama;
  }

  public boolean f()
  {
    super.f();
    org.vidogram.messenger.y.a().a(this, org.vidogram.messenger.y.k);
    org.vidogram.messenger.y.a().a(this, org.vidogram.messenger.y.b);
    org.vidogram.messenger.y.a().a(this, org.vidogram.messenger.y.t);
    org.vidogram.messenger.y.a().a(this, org.vidogram.messenger.y.d);
    if (this.f != null)
    {
      this.o = b().getBoolean("onlyUsers", false);
      this.q = this.f.getBoolean("destroyAfterSelect", false);
      this.r = this.f.getBoolean("returnAsResult", false);
      this.s = this.f.getBoolean("createSecretChat", false);
      this.x = this.f.getString("selectAlertString");
      this.z = this.f.getBoolean("allowUsernameSearch", true);
      this.v = this.f.getBoolean("needForwardCount", true);
      this.u = this.f.getBoolean("allowBots", true);
      this.w = this.f.getInt("chat_id", 0);
    }
    while (true)
    {
      org.vidogram.messenger.f.a().c();
      return true;
      this.p = true;
    }
  }

  public void g()
  {
    super.g();
    org.vidogram.messenger.y.a().b(this, org.vidogram.messenger.y.k);
    org.vidogram.messenger.y.a().b(this, org.vidogram.messenger.y.b);
    org.vidogram.messenger.y.a().b(this, org.vidogram.messenger.y.t);
    org.vidogram.messenger.y.a().b(this, org.vidogram.messenger.y.d);
    this.A = null;
  }

  public void i()
  {
    super.i();
    if (this.i != null)
      this.i.notifyDataSetChanged();
  }

  public void j()
  {
    super.j();
    if (this.d != null)
      this.d.g();
  }

  public static abstract interface a
  {
    public abstract void a(g.vw paramvw, String paramString);
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.s
 * JD-Core Version:    0.6.0
 */