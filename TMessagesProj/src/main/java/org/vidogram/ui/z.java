package org.vidogram.ui;

import android.app.AlertDialog.Builder;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.TextWatcher;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Semaphore;
import org.vidogram.messenger.h;
import org.vidogram.messenger.n;
import org.vidogram.messenger.r;
import org.vidogram.messenger.v;
import org.vidogram.messenger.w;
import org.vidogram.messenger.y;
import org.vidogram.messenger.y.b;
import org.vidogram.tgnet.ConnectionsManager;
import org.vidogram.tgnet.g.ad;
import org.vidogram.tgnet.g.az;
import org.vidogram.tgnet.g.vw;
import org.vidogram.tgnet.g.x;
import org.vidogram.ui.Components.BackupImageView;
import org.vidogram.ui.Components.b;
import org.vidogram.ui.Components.c.a;
import org.vidogram.ui.a.a.a;
import org.vidogram.ui.a.g;
import org.vidogram.ui.c.bh;
import org.vidogram.ui.c.u;

public class z extends g
  implements y.b, c.a
{
  private a i;
  private ListView j;
  private EditText k;
  private g.x l;
  private g.ad m;
  private ArrayList<Integer> n;
  private BackupImageView o;
  private b p;
  private boolean q;
  private boolean r;
  private org.vidogram.ui.Components.c s = new org.vidogram.ui.Components.c();
  private ProgressDialog t = null;
  private String u = null;
  private int v = 0;

  public z(Bundle paramBundle)
  {
    super(paramBundle);
    this.v = paramBundle.getInt("chatType", 0);
    this.p = new b();
  }

  private void a(int paramInt)
  {
    if (this.j == null);
    while (true)
    {
      return;
      int i2 = this.j.getChildCount();
      int i1 = 0;
      while (i1 < i2)
      {
        View localView = this.j.getChildAt(i1);
        if ((localView instanceof bh))
          ((bh)localView).a(paramInt);
        i1 += 1;
      }
    }
  }

  public View a(Context paramContext)
  {
    this.d.setBackButtonImage(2130837794);
    this.d.setAllowOverlayTitle(true);
    LinearLayout localLinearLayout;
    Object localObject;
    boolean bool;
    if (this.v == 1)
    {
      this.d.setTitle(r.a("NewBroadcastList", 2131231475));
      this.d.setActionBarMenuOnItemClick(new a.a()
      {
        public void a(int paramInt)
        {
          if (paramInt == -1)
            z.this.d();
          do
            return;
          while ((paramInt != 1) || (z.a(z.this)) || (z.b(z.this).getText().length() == 0));
          z.a(z.this, true);
          if (z.c(z.this) == 1)
          {
            v.a().a(z.b(z.this).getText().toString(), z.d(z.this), null, z.c(z.this), z.this);
            return;
          }
          if (z.e(z.this).b != null)
          {
            z.b(z.this, true);
            return;
          }
          z.a(z.this, new ProgressDialog(z.this.l()));
          z.f(z.this).setMessage(r.a("Loading", 2131231394));
          z.f(z.this).setCanceledOnTouchOutside(false);
          z.f(z.this).setCancelable(false);
          paramInt = v.a().a(z.b(z.this).getText().toString(), z.d(z.this), null, z.c(z.this), z.this);
          z.f(z.this).setButton(-2, r.a("Cancel", 2131230943), new DialogInterface.OnClickListener(paramInt)
          {
            public void onClick(DialogInterface paramDialogInterface, int paramInt)
            {
              ConnectionsManager.a().a(this.a, true);
              z.a(z.this, false);
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
          z.f(z.this).show();
        }
      });
      this.d.a().b(1, 2130837825, org.vidogram.messenger.a.a(56.0F));
      this.b = new LinearLayout(paramContext);
      localLinearLayout = (LinearLayout)this.b;
      localLinearLayout.setOrientation(1);
      FrameLayout localFrameLayout = new FrameLayout(paramContext);
      localLinearLayout.addView(localFrameLayout);
      localObject = (LinearLayout.LayoutParams)localFrameLayout.getLayoutParams();
      ((LinearLayout.LayoutParams)localObject).width = -1;
      ((LinearLayout.LayoutParams)localObject).height = -2;
      ((LinearLayout.LayoutParams)localObject).gravity = 51;
      localFrameLayout.setLayoutParams((ViewGroup.LayoutParams)localObject);
      this.o = new BackupImageView(paramContext);
      this.o.setRoundRadius(org.vidogram.messenger.a.a(32.0F));
      localObject = this.p;
      if (this.v != 1)
        break label831;
      bool = true;
      label194: ((b)localObject).a(5, null, null, bool);
      this.o.setImageDrawable(this.p);
      localFrameLayout.addView(this.o);
      localObject = (FrameLayout.LayoutParams)this.o.getLayoutParams();
      ((FrameLayout.LayoutParams)localObject).width = org.vidogram.messenger.a.a(64.0F);
      ((FrameLayout.LayoutParams)localObject).height = org.vidogram.messenger.a.a(64.0F);
      ((FrameLayout.LayoutParams)localObject).topMargin = org.vidogram.messenger.a.a(12.0F);
      ((FrameLayout.LayoutParams)localObject).bottomMargin = org.vidogram.messenger.a.a(12.0F);
      if (!r.a)
        break label836;
      i1 = 0;
      label283: ((FrameLayout.LayoutParams)localObject).leftMargin = i1;
      if (!r.a)
        break label845;
      i1 = org.vidogram.messenger.a.a(16.0F);
      label301: ((FrameLayout.LayoutParams)localObject).rightMargin = i1;
      if (!r.a)
        break label850;
      i1 = 5;
      label315: ((FrameLayout.LayoutParams)localObject).gravity = (i1 | 0x30);
      this.o.setLayoutParams((ViewGroup.LayoutParams)localObject);
      if (this.v != 1)
      {
        this.p.c(true);
        this.o.setOnClickListener(new View.OnClickListener()
        {
          public void onClick(View paramView)
          {
            if (z.this.l() == null)
              return;
            AlertDialog.Builder localBuilder = new AlertDialog.Builder(z.this.l());
            if (z.g(z.this) != null)
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
                    z.e(z.this).b();
                  do
                  {
                    return;
                    if (paramInt != 1)
                      continue;
                    z.e(z.this).c();
                    return;
                  }
                  while (paramInt != 2);
                  z.a(z.this, null);
                  z.a(z.this, null);
                  z.i(z.this).a(z.g(z.this), "50_50", z.h(z.this));
                }
              });
              z.this.b(localBuilder.create());
              return;
              paramView = new CharSequence[2];
              paramView[0] = r.a("FromCamera", 2131231263);
              paramView[1] = r.a("FromGalley", 2131231270);
            }
          }
        });
      }
      this.k = new EditText(paramContext);
      EditText localEditText = this.k;
      if (this.v != 0)
        break label855;
      localObject = r.a("EnterGroupNamePlaceholder", 2131231181);
      label400: localEditText.setHint((CharSequence)localObject);
      if (this.u != null)
      {
        this.k.setText(this.u);
        this.u = null;
      }
      this.k.setMaxLines(4);
      localObject = this.k;
      if (!r.a)
        break label869;
      i1 = 5;
      label452: ((EditText)localObject).setGravity(i1 | 0x10);
      this.k.setTextSize(1, 16.0F);
      this.k.setHintTextColor(-6842473);
      this.k.setImeOptions(268435456);
      this.k.setInputType(16384);
      this.k.setPadding(0, 0, 0, org.vidogram.messenger.a.a(8.0F));
      localObject = new InputFilter.LengthFilter(100);
      this.k.setFilters(new InputFilter[] { localObject });
      org.vidogram.messenger.a.a(this.k);
      this.k.setTextColor(-14606047);
      localFrameLayout.addView(this.k);
      localObject = (FrameLayout.LayoutParams)this.k.getLayoutParams();
      ((FrameLayout.LayoutParams)localObject).width = -1;
      ((FrameLayout.LayoutParams)localObject).height = -2;
      if (!r.a)
        break label874;
      i1 = org.vidogram.messenger.a.a(16.0F);
      label607: ((FrameLayout.LayoutParams)localObject).leftMargin = i1;
      if (!r.a)
        break label884;
    }
    label831: label836: label845: label850: label855: label869: label874: label884: for (int i1 = org.vidogram.messenger.a.a(96.0F); ; i1 = org.vidogram.messenger.a.a(16.0F))
    {
      ((FrameLayout.LayoutParams)localObject).rightMargin = i1;
      ((FrameLayout.LayoutParams)localObject).gravity = 16;
      this.k.setLayoutParams((ViewGroup.LayoutParams)localObject);
      if (this.v != 1)
        this.k.addTextChangedListener(new TextWatcher()
        {
          public void afterTextChanged(Editable paramEditable)
          {
            b localb = z.h(z.this);
            if (z.b(z.this).length() > 0);
            for (paramEditable = z.b(z.this).getText().toString(); ; paramEditable = null)
            {
              localb.a(5, paramEditable, null, false);
              z.i(z.this).invalidate();
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
      localObject = new u(paramContext);
      ((u)localObject).setText(r.b("Members", this.n.size()));
      localLinearLayout.addView((View)localObject);
      this.j = new ListView(paramContext);
      this.j.setDivider(null);
      this.j.setDividerHeight(0);
      this.j.setVerticalScrollBarEnabled(false);
      localObject = this.j;
      paramContext = new a(paramContext);
      this.i = paramContext;
      ((ListView)localObject).setAdapter(paramContext);
      localLinearLayout.addView(this.j);
      paramContext = (LinearLayout.LayoutParams)this.j.getLayoutParams();
      paramContext.width = -1;
      paramContext.height = -1;
      this.j.setLayoutParams(paramContext);
      return this.b;
      this.d.setTitle(r.a("NewGroup", 2131231477));
      break;
      bool = false;
      break label194;
      i1 = org.vidogram.messenger.a.a(16.0F);
      break label283;
      i1 = 0;
      break label301;
      i1 = 3;
      break label315;
      localObject = r.a("EnterListName", 2131231182);
      break label400;
      i1 = 3;
      break label452;
      i1 = org.vidogram.messenger.a.a(96.0F);
      break label607;
    }
  }

  public void a(int paramInt1, int paramInt2, Intent paramIntent)
  {
    this.s.a(paramInt1, paramInt2, paramIntent);
  }

  public void a(int paramInt, Object[] paramArrayOfObject)
  {
    if (paramInt == y.b)
    {
      paramInt = ((Integer)paramArrayOfObject[0]).intValue();
      if (((paramInt & 0x2) != 0) || ((paramInt & 0x1) != 0) || ((paramInt & 0x4) != 0))
        a(paramInt);
    }
    while (true)
    {
      return;
      if (paramInt == y.m)
      {
        if (this.t != null);
        try
        {
          this.t.dismiss();
          this.r = false;
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
      if (this.t != null);
      try
      {
        this.t.dismiss();
        paramInt = ((Integer)paramArrayOfObject[0]).intValue();
        y.a().a(y.d, new Object[0]);
        paramArrayOfObject = new Bundle();
        paramArrayOfObject.putInt("chat_id", paramInt);
        a(new q(paramArrayOfObject), true);
        if (this.m == null)
          continue;
        v.a().a(paramInt, this.m);
        return;
      }
      catch (Exception localException)
      {
        while (true)
          n.a("tmessages", localException);
      }
    }
  }

  public void a(Bundle paramBundle)
  {
    if ((this.s != null) && (this.s.a != null))
      paramBundle.putString("path", this.s.a);
    if (this.k != null)
    {
      String str = this.k.getText().toString();
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
        z.a(z.this, this.a);
        z.a(z.this, this.b.c);
        z.i(z.this).a(z.g(z.this), "50_50", z.h(z.this));
        if (z.j(z.this))
        {
          n.a("tmessages", "avatar did uploaded");
          v.a().a(z.b(z.this).getText().toString(), z.d(z.this), null, z.c(z.this), z.this);
        }
      }
    });
  }

  public void b(Bundle paramBundle)
  {
    if (this.s != null)
      this.s.a = paramBundle.getString("path");
    paramBundle = paramBundle.getString("nameTextView");
    if (paramBundle != null)
    {
      if (this.k != null)
        this.k.setText(paramBundle);
    }
    else
      return;
    this.u = paramBundle;
  }

  public void b(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (paramBoolean1)
    {
      this.k.requestFocus();
      org.vidogram.messenger.a.a(this.k);
    }
  }

  public boolean f()
  {
    y.a().a(this, y.b);
    y.a().a(this, y.l);
    y.a().a(this, y.m);
    this.s.d = this;
    this.s.e = this;
    this.n = b().getIntegerArrayList("result");
    Object localObject1 = new ArrayList();
    Object localObject2 = this.n.iterator();
    Object localObject3;
    while (((Iterator)localObject2).hasNext())
    {
      localObject3 = (Integer)((Iterator)localObject2).next();
      if (v.a().a((Integer)localObject3) != null)
        continue;
      ((ArrayList)localObject1).add(localObject3);
    }
    if (!((ArrayList)localObject1).isEmpty())
    {
      localObject3 = new Semaphore(0);
      localObject2 = new ArrayList();
      w.a().c().b(new Runnable((ArrayList)localObject2, (ArrayList)localObject1, (Semaphore)localObject3)
      {
        public void run()
        {
          this.a.addAll(w.a().d(this.b));
          this.c.release();
        }
      });
      try
      {
        ((Semaphore)localObject3).acquire();
        if (((ArrayList)localObject1).size() != ((ArrayList)localObject2).size())
          return false;
      }
      catch (Exception localException)
      {
        while (true)
          n.a("tmessages", localException);
        if (!((ArrayList)localObject2).isEmpty())
        {
          localObject1 = ((ArrayList)localObject2).iterator();
          while (((Iterator)localObject1).hasNext())
          {
            localObject2 = (g.vw)((Iterator)localObject1).next();
            v.a().a((g.vw)localObject2, true);
          }
        }
        return false;
      }
    }
    return super.f();
  }

  public void g()
  {
    super.g();
    y.a().b(this, y.b);
    y.a().b(this, y.l);
    y.a().b(this, y.m);
    this.s.a();
  }

  public void i()
  {
    super.i();
    if (this.i != null)
      this.i.notifyDataSetChanged();
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
      return z.d(z.this).size();
    }

    public int getItemViewType(int paramInt)
    {
      return 0;
    }

    public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      if (paramView == null)
        paramView = new bh(this.b, 1, 0, false);
      while (true)
      {
        paramViewGroup = v.a().a((Integer)z.d(z.this).get(paramInt));
        ((bh)paramView).a(paramViewGroup, null, null, 0);
        return paramView;
      }
    }

    public int getViewTypeCount()
    {
      return 1;
    }

    public boolean isEnabled(int paramInt)
    {
      return false;
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.z
 * JD-Core Version:    0.6.0
 */