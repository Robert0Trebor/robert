package org.vidogram.ui.a;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import org.vidogram.messenger.n;
import org.vidogram.tgnet.ConnectionsManager;

public class g
{
  protected Dialog a = null;
  protected View b;
  protected b c;
  protected a d;
  protected int e = 0;
  protected Bundle f;
  protected boolean g = true;
  protected boolean h = false;
  private boolean i = false;

  public g()
  {
    this.e = ConnectionsManager.a().i();
  }

  public g(Bundle paramBundle)
  {
    this.f = paramBundle;
    this.e = ConnectionsManager.a().i();
  }

  protected AnimatorSet a(boolean paramBoolean, Runnable paramRunnable)
  {
    return null;
  }

  public Dialog a(Dialog paramDialog, boolean paramBoolean)
  {
    if ((paramDialog == null) || (this.c == null) || (this.c.c) || (this.c.b) || ((!paramBoolean) && (this.c.f())))
      return null;
    try
    {
      if (this.a != null)
      {
        this.a.dismiss();
        this.a = null;
      }
    }
    catch (Exception localException)
    {
      try
      {
        while (true)
        {
          this.a = paramDialog;
          this.a.setCanceledOnTouchOutside(true);
          this.a.setOnDismissListener(new DialogInterface.OnDismissListener()
          {
            public void onDismiss(DialogInterface paramDialogInterface)
            {
              g.this.c(g.this.a);
              g.this.a = null;
            }
          });
          this.a.show();
          paramDialog = this.a;
          return paramDialog;
          localException = localException;
          n.a("tmessages", localException);
        }
      }
      catch (Exception paramDialog)
      {
        n.a("tmessages", paramDialog);
      }
    }
    return null;
  }

  public View a()
  {
    return this.b;
  }

  public View a(Context paramContext)
  {
    return null;
  }

  public void a(int paramInt1, int paramInt2, Intent paramIntent)
  {
  }

  public void a(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
  }

  public void a(Intent paramIntent, int paramInt)
  {
    if (this.c != null)
      this.c.a(paramIntent, paramInt);
  }

  public void a(Configuration paramConfiguration)
  {
  }

  public void a(Bundle paramBundle)
  {
  }

  protected void a(b paramb)
  {
    if (this.c != paramb)
    {
      this.c = paramb;
      if (this.b != null)
      {
        paramb = (ViewGroup)this.b.getParent();
        if (paramb == null);
      }
    }
    try
    {
      paramb.removeView(this.b);
      if ((this.c != null) && (this.c.getContext() != this.b.getContext()))
        this.b = null;
      if (this.d != null)
      {
        if ((this.c == null) || (this.c.getContext() == this.d.getContext()))
          break label199;
        j = 1;
        if ((this.d.getAddToContainer()) || (j != 0))
        {
          paramb = (ViewGroup)this.d.getParent();
          if (paramb == null);
        }
      }
    }
    catch (Exception paramb)
    {
      try
      {
        while (true)
        {
          paramb.removeView(this.d);
          if (j != 0)
            this.d = null;
          if ((this.c != null) && (this.d == null))
          {
            this.d = b(this.c.getContext());
            this.d.c = this;
          }
          return;
          paramb = paramb;
          n.a("tmessages", paramb);
        }
        label199: int j = 0;
      }
      catch (Exception paramb)
      {
        while (true)
          n.a("tmessages", paramb);
      }
    }
  }

  public void a(boolean paramBoolean)
  {
    if ((this.i) || (this.c == null))
      return;
    this.c.a(paramBoolean);
  }

  protected void a(boolean paramBoolean1, boolean paramBoolean2)
  {
  }

  public boolean a(Dialog paramDialog)
  {
    return true;
  }

  public boolean a(g paramg)
  {
    return (this.c != null) && (this.c.a(paramg));
  }

  public boolean a(g paramg, boolean paramBoolean)
  {
    return (this.c != null) && (this.c.a(paramg, paramBoolean));
  }

  public Dialog b(Dialog paramDialog)
  {
    return a(paramDialog, false);
  }

  public Bundle b()
  {
    return this.f;
  }

  protected a b(Context paramContext)
  {
    paramContext = new a(paramContext);
    paramContext.setBackgroundColor(l.a);
    paramContext.setItemsBackgroundColor(1929379839);
    return paramContext;
  }

  public void b(Bundle paramBundle)
  {
  }

  protected void b(boolean paramBoolean1, boolean paramBoolean2)
  {
  }

  protected void c()
  {
    ViewGroup localViewGroup;
    if (this.b != null)
    {
      localViewGroup = (ViewGroup)this.b.getParent();
      if (localViewGroup == null);
    }
    try
    {
      localViewGroup.removeView(this.b);
      this.b = null;
      if (this.d != null)
      {
        localViewGroup = (ViewGroup)this.d.getParent();
        if (localViewGroup == null);
      }
    }
    catch (Exception localException2)
    {
      try
      {
        localViewGroup.removeView(this.d);
        this.d = null;
        this.c = null;
        return;
        localException1 = localException1;
        n.a("tmessages", localException1);
      }
      catch (Exception localException2)
      {
        while (true)
          n.a("tmessages", localException2);
      }
    }
  }

  protected void c(Dialog paramDialog)
  {
  }

  public void d()
  {
    a(true);
  }

  public void d(Dialog paramDialog)
  {
    this.a = paramDialog;
  }

  public void e()
  {
    if ((this.i) || (this.c == null))
      return;
    this.c.c(this);
  }

  public boolean f()
  {
    return true;
  }

  public void g()
  {
    ConnectionsManager.a().a(this.e);
    this.i = true;
    if (this.d != null)
      this.d.setEnabled(false);
  }

  public boolean h()
  {
    return false;
  }

  public void i()
  {
  }

  public void j()
  {
    if (this.d != null)
      this.d.i();
    try
    {
      if ((this.a != null) && (this.a.isShowing()) && (a(this.a)))
      {
        this.a.dismiss();
        this.a = null;
      }
      return;
    }
    catch (Exception localException)
    {
      n.a("tmessages", localException);
    }
  }

  public boolean k()
  {
    return true;
  }

  public Activity l()
  {
    if (this.c != null)
      return this.c.d;
    return null;
  }

  public void m()
  {
    if (this.a == null)
      return;
    try
    {
      this.a.dismiss();
      this.a = null;
      return;
    }
    catch (Exception localException)
    {
      n.a("tmessages", localException);
    }
  }

  public void n()
  {
    try
    {
      if ((this.a != null) && (this.a.isShowing()))
      {
        this.a.dismiss();
        this.a = null;
      }
      if (this.d != null)
        this.d.i();
      return;
    }
    catch (Exception localException)
    {
      while (true)
        n.a("tmessages", localException);
    }
  }

  protected void o()
  {
  }

  public void p()
  {
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.a.g
 * JD-Core Version:    0.6.0
 */