package org.vidogram.ui.Components;

import android.app.AlertDialog.Builder;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import java.util.ArrayList;
import java.util.HashMap;
import org.vidogram.messenger.ad;
import org.vidogram.messenger.e;
import org.vidogram.messenger.n;
import org.vidogram.messenger.r;
import org.vidogram.messenger.v;
import org.vidogram.tgnet.ConnectionsManager;
import org.vidogram.tgnet.f;
import org.vidogram.tgnet.g.dl;
import org.vidogram.tgnet.g.fi;
import org.vidogram.tgnet.g.i;
import org.vidogram.tgnet.g.j;
import org.vidogram.tgnet.g.k;
import org.vidogram.tgnet.g.l;
import org.vidogram.tgnet.g.m;
import org.vidogram.tgnet.g.vw;
import org.vidogram.tgnet.g.vx;
import org.vidogram.tgnet.g.vy;
import org.vidogram.ui.a.k;
import org.vidogram.ui.aq;
import org.vidogram.ui.q;

public class g extends FrameLayout
{
  private BackupImageView a;
  private k b;
  private k c;
  private ImageView d;
  private bn e;
  private q f;
  private bp g;
  private au h;
  private bc i;
  private b j = new b();
  private int k = -1;

  public g(Context paramContext, q paramq, boolean paramBoolean)
  {
    super(paramContext);
    this.f = paramq;
    this.a = new BackupImageView(paramContext);
    this.a.setRoundRadius(org.vidogram.messenger.a.a(21.0F));
    addView(this.a);
    this.b = new k(paramContext);
    this.b.setTextColor(-1);
    this.b.setTextSize(18);
    this.b.setGravity(3);
    this.b.setTypeface(org.vidogram.messenger.a.a("fonts/rmedium.ttf"));
    this.b.setLeftDrawableTopPadding(-org.vidogram.messenger.a.a(1.3F));
    this.b.setRightDrawableTopPadding(-org.vidogram.messenger.a.a(1.3F));
    addView(this.b);
    this.c = new k(paramContext);
    this.c.setTextColor(-2758409);
    this.c.setTextSize(14);
    this.c.setGravity(3);
    addView(this.c);
    if (paramBoolean)
    {
      this.d = new ImageView(paramContext);
      this.d.setPadding(org.vidogram.messenger.a.a(10.0F), org.vidogram.messenger.a.a(10.0F), org.vidogram.messenger.a.a(5.0F), org.vidogram.messenger.a.a(5.0F));
      this.d.setScaleType(ImageView.ScaleType.CENTER);
      paramq = this.d;
      paramContext = new bn(paramContext);
      this.e = paramContext;
      paramq.setImageDrawable(paramContext);
      addView(this.d);
      this.d.setOnClickListener(new View.OnClickListener()
      {
        public void onClick(View paramView)
        {
          g.a(g.this).b(org.vidogram.messenger.a.a(g.this.getContext(), g.a(g.this).u()).create());
        }
      });
    }
    setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramView)
      {
        paramView = g.a(g.this).s();
        Object localObject = g.a(g.this).t();
        if (paramView != null)
        {
          localObject = new Bundle();
          ((Bundle)localObject).putInt("user_id", paramView.d);
          if (g.b(g.this) != null)
            ((Bundle)localObject).putLong("dialog_id", g.a(g.this).q());
          paramView = new aq((Bundle)localObject);
          paramView.b(true);
          g.a(g.this).a(paramView);
        }
        do
          return;
        while (localObject == null);
        paramView = new Bundle();
        paramView.putInt("chat_id", ((g.i)localObject).h);
        paramView = new aq(paramView);
        paramView.a(g.a(g.this).v());
        paramView.b(true);
        g.a(g.this).a(paramView);
      }
    });
    paramContext = this.f.t();
    this.g = new bp();
    paramq = this.g;
    if (paramContext != null)
    {
      paramBoolean = true;
      paramq.a(paramBoolean);
      this.h = new au();
      paramq = this.h;
      if (paramContext == null)
        break label398;
      paramBoolean = true;
      label359: paramq.a(paramBoolean);
      this.i = new bc();
      paramq = this.i;
      if (paramContext == null)
        break label403;
    }
    label398: label403: for (paramBoolean = bool; ; paramBoolean = false)
    {
      paramq.a(paramBoolean);
      return;
      paramBoolean = false;
      break;
      paramBoolean = false;
      break label359;
    }
  }

  private void setTypingAnimation(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      try
      {
        Integer localInteger = (Integer)v.a().m.get(Long.valueOf(this.f.q()));
        if (localInteger.intValue() == 0)
        {
          this.c.setLeftDrawable(this.g);
          this.g.a();
          this.h.b();
          this.i.b();
          return;
        }
        if (localInteger.intValue() == 1)
        {
          this.c.setLeftDrawable(this.h);
          this.h.a();
          this.g.b();
          this.i.b();
          return;
        }
      }
      catch (Exception localException)
      {
        n.a("tmessages", localException);
        return;
      }
      if (localException.intValue() == 2)
      {
        this.c.setLeftDrawable(this.i);
        this.i.a();
        this.g.b();
        this.h.b();
        return;
      }
    }
    else
    {
      this.c.setLeftDrawable(null);
      this.g.b();
      this.h.b();
      this.i.b();
    }
  }

  public void a()
  {
    if (this.d == null)
      return;
    this.d.setVisibility(0);
  }

  public void a(int paramInt1, int paramInt2)
  {
    this.b.setLeftDrawable(paramInt1);
    this.b.setRightDrawable(paramInt2);
  }

  public void b()
  {
    if (this.d == null)
      return;
    this.d.setVisibility(8);
  }

  public void c()
  {
    g.vw localvw = this.f.s();
    g.i locali = this.f.t();
    Object localObject2 = (CharSequence)v.a().l.get(Long.valueOf(this.f.q()));
    Object localObject1 = localObject2;
    if (localObject2 != null)
      localObject1 = TextUtils.replace((CharSequence)localObject2, new String[] { "..." }, new String[] { "" });
    if ((localObject1 == null) || (((CharSequence)localObject1).length() == 0) || ((e.d(locali)) && (!locali.r)))
    {
      setTypingAnimation(false);
      if (locali != null)
      {
        localObject1 = this.f.v();
        if (e.d(locali))
          if ((localObject1 != null) && (((g.j)localObject1).g != 0))
            if ((locali.r) && (((g.j)localObject1).g <= 200))
              if ((this.k > 1) && (((g.j)localObject1).g != 0))
                this.c.setText(String.format("%s, %s", new Object[] { r.b("Members", ((g.j)localObject1).g), r.b("Online", this.k) }));
      }
      do
      {
        return;
        this.c.setText(r.b("Members", ((g.j)localObject1).g));
        return;
        localObject2 = new int[1];
        localObject1 = r.a(((g.j)localObject1).g, localObject2);
        localObject1 = r.b("Members", localObject2[0]).replace(String.format("%d", new Object[] { Integer.valueOf(localObject2[0]) }), (CharSequence)localObject1);
        this.c.setText((CharSequence)localObject1);
        return;
        if (locali.r)
        {
          this.c.setText(r.a("Loading", 2131231394).toLowerCase());
          return;
        }
        if ((locali.b & 0x40) != 0)
        {
          this.c.setText(r.a("ChannelPublic", 2131231025).toLowerCase());
          return;
        }
        this.c.setText(r.a("ChannelPrivate", 2131231022).toLowerCase());
        return;
        if (e.b(locali))
        {
          this.c.setText(r.a("YouWereKicked", 2131231979));
          return;
        }
        if (e.a(locali))
        {
          this.c.setText(r.a("YouLeft", 2131231978));
          return;
        }
        int n = locali.k;
        int m = n;
        if (localObject1 != null)
        {
          m = n;
          if (((g.j)localObject1).t != null)
            m = ((g.j)localObject1).t.e.size();
        }
        if ((this.k > 1) && (m != 0))
        {
          this.c.setText(String.format("%s, %s", new Object[] { r.b("Members", m), r.b("Online", this.k) }));
          return;
        }
        this.c.setText(r.b("Members", m));
        return;
      }
      while (localvw == null);
      localObject1 = v.a().a(Integer.valueOf(localvw.d));
      if (((g.vw)localObject1).d == ad.c())
        localObject1 = r.a("ChatYourSelf", 2131231055);
      while (true)
      {
        this.c.setText((CharSequence)localObject1);
        return;
        if ((((g.vw)localObject1).d == 333000) || (((g.vw)localObject1).d == 777000))
        {
          localObject1 = r.a("ServiceNotifications", 2131231816);
          continue;
        }
        if (((g.vw)localObject1).r)
        {
          localObject1 = r.a("Bot", 2131230922);
          continue;
        }
        localObject1 = r.a((g.vw)localObject1);
      }
    }
    this.c.setText((CharSequence)localObject1);
    setTypingAnimation(true);
  }

  public void d()
  {
    Object localObject3 = null;
    Object localObject2 = null;
    Object localObject1 = null;
    g.vw localvw = this.f.s();
    g.i locali = this.f.t();
    if (localvw != null)
    {
      if (localvw.j != null)
        localObject1 = localvw.j.e;
      this.j.a(localvw);
    }
    while (true)
    {
      if (this.a != null)
        this.a.a((f)localObject1, "50_50", this.j);
      return;
      localObject1 = localObject3;
      if (locali == null)
        continue;
      localObject1 = localObject2;
      if (locali.j != null)
        localObject1 = locali.j.b;
      this.j.a(locali);
    }
  }

  public void e()
  {
    this.k = 0;
    g.j localj = this.f.v();
    if (localj == null);
    while (true)
    {
      return;
      int n = ConnectionsManager.a().b();
      if ((!(localj instanceof g.fi)) && ((!(localj instanceof g.dl)) || (localj.g > 200) || (localj.t == null)))
        continue;
      int m = 0;
      while (m < localj.t.e.size())
      {
        Object localObject = (g.k)localj.t.e.get(m);
        localObject = v.a().a(Integer.valueOf(((g.k)localObject).b));
        if ((localObject != null) && (((g.vw)localObject).k != null) && ((((g.vw)localObject).k.c > n) || (((g.vw)localObject).d == ad.c())) && (((g.vw)localObject).k.c > 10000))
          this.k += 1;
        m += 1;
      }
    }
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramInt2 = (org.vidogram.ui.a.a.getCurrentActionBarHeight() - org.vidogram.messenger.a.a(42.0F)) / 2;
    if (Build.VERSION.SDK_INT >= 21);
    for (paramInt1 = org.vidogram.messenger.a.a; ; paramInt1 = 0)
    {
      paramInt1 += paramInt2;
      this.a.layout(org.vidogram.messenger.a.a(8.0F), paramInt1, org.vidogram.messenger.a.a(50.0F), org.vidogram.messenger.a.a(42.0F) + paramInt1);
      this.b.layout(org.vidogram.messenger.a.a(62.0F), org.vidogram.messenger.a.a(1.3F) + paramInt1, org.vidogram.messenger.a.a(62.0F) + this.b.getMeasuredWidth(), this.b.getTextHeight() + paramInt1 + org.vidogram.messenger.a.a(1.3F));
      if (this.d != null)
        this.d.layout(org.vidogram.messenger.a.a(24.0F), org.vidogram.messenger.a.a(15.0F) + paramInt1, org.vidogram.messenger.a.a(58.0F), org.vidogram.messenger.a.a(49.0F) + paramInt1);
      this.c.layout(org.vidogram.messenger.a.a(62.0F), org.vidogram.messenger.a.a(24.0F) + paramInt1, org.vidogram.messenger.a.a(62.0F) + this.c.getMeasuredWidth(), paramInt1 + this.c.getTextHeight() + org.vidogram.messenger.a.a(24.0F));
      return;
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    paramInt1 = View.MeasureSpec.getSize(paramInt1);
    int m = paramInt1 - org.vidogram.messenger.a.a(70.0F);
    this.a.measure(View.MeasureSpec.makeMeasureSpec(org.vidogram.messenger.a.a(42.0F), 1073741824), View.MeasureSpec.makeMeasureSpec(org.vidogram.messenger.a.a(42.0F), 1073741824));
    this.b.measure(View.MeasureSpec.makeMeasureSpec(m, -2147483648), View.MeasureSpec.makeMeasureSpec(org.vidogram.messenger.a.a(24.0F), -2147483648));
    this.c.measure(View.MeasureSpec.makeMeasureSpec(m, -2147483648), View.MeasureSpec.makeMeasureSpec(org.vidogram.messenger.a.a(20.0F), -2147483648));
    if (this.d != null)
      this.d.measure(View.MeasureSpec.makeMeasureSpec(org.vidogram.messenger.a.a(34.0F), 1073741824), View.MeasureSpec.makeMeasureSpec(org.vidogram.messenger.a.a(34.0F), 1073741824));
    setMeasuredDimension(paramInt1, View.MeasureSpec.getSize(paramInt2));
  }

  public void setTime(int paramInt)
  {
    if (this.e == null)
      return;
    this.e.a(paramInt);
  }

  public void setTitle(CharSequence paramCharSequence)
  {
    this.b.setText(paramCharSequence);
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.Components.g
 * JD-Core Version:    0.6.0
 */