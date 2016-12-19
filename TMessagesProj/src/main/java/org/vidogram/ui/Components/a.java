package org.vidogram.ui.Components;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import java.util.concurrent.ConcurrentHashMap;
import org.vidogram.messenger.ApplicationLoader;
import org.vidogram.messenger.r;
import org.vidogram.messenger.v;
import org.vidogram.messenger.w;
import org.vidogram.messenger.z;
import org.vidogram.tgnet.ConnectionsManager;
import org.vidogram.tgnet.c;
import org.vidogram.tgnet.g.bv;
import org.vidogram.tgnet.g.hq;
import org.vidogram.tgnet.g.ln;
import org.vidogram.tgnet.g.lo;
import org.vidogram.tgnet.g.lp;
import org.vidogram.tgnet.g.rl;
import org.vidogram.ui.a.g;
import org.vidogram.ui.a.h.d;
import org.vidogram.ui.as;

public class a
{
  public static Dialog a(Context paramContext, long paramLong)
  {
    if (paramContext == null)
      return null;
    paramContext = new h.d(paramContext);
    paramContext.a(r.a("Notifications", 2131231590));
    String str1 = r.a("MuteFor", 2131231467, new Object[] { r.b("Hours", 1) });
    String str2 = r.a("MuteFor", 2131231467, new Object[] { r.b("Hours", 8) });
    String str3 = r.a("MuteFor", 2131231467, new Object[] { r.b("Days", 2) });
    String str4 = r.a("MuteDisable", 2131231466);
    1 local1 = new DialogInterface.OnClickListener(paramLong)
    {
      public void onClick(DialogInterface paramDialogInterface, int paramInt)
      {
        long l = 1L;
        int i = ConnectionsManager.a().b();
        if (paramInt == 0)
          i += 3600;
        label260: 
        while (true)
        {
          paramDialogInterface = ApplicationLoader.a.getSharedPreferences("Notifications", 0).edit();
          if (paramInt == 3)
            paramDialogInterface.putInt("notify2_" + this.a, 2);
          while (true)
          {
            z.a().b(this.a);
            w.a().a(this.a, l);
            paramDialogInterface.commit();
            paramDialogInterface = (g.hq)v.a().g.get(Long.valueOf(this.a));
            if (paramDialogInterface != null)
            {
              paramDialogInterface.i = new g.rl();
              paramDialogInterface.i.d = i;
            }
            z.c(this.a);
            return;
            if (paramInt == 1)
            {
              i += 28800;
              break;
            }
            if (paramInt == 2)
            {
              i += 172800;
              break;
            }
            if (paramInt != 3)
              break label260;
            i = 2147483647;
            break;
            paramDialogInterface.putInt("notify2_" + this.a, 3);
            paramDialogInterface.putInt("notifyuntil_" + this.a, i);
            l = 1L | i << 32;
          }
        }
      }
    };
    paramContext.a(new CharSequence[] { str1, str2, str3, str4 }, local1);
    return paramContext.a();
  }

  public static Dialog a(Context paramContext, long paramLong, g paramg)
  {
    if ((paramContext == null) || (paramg == null))
      return null;
    paramContext = new h.d(paramContext);
    paramContext.a(r.a("ReportChat", 2131231719));
    String str1 = r.a("ReportChatSpam", 2131231723);
    String str2 = r.a("ReportChatViolence", 2131231724);
    String str3 = r.a("ReportChatPornography", 2131231722);
    String str4 = r.a("ReportChatOther", 2131231721);
    paramg = new DialogInterface.OnClickListener(paramLong, paramg)
    {
      public void onClick(DialogInterface paramDialogInterface, int paramInt)
      {
        if (paramInt == 3)
        {
          paramDialogInterface = new Bundle();
          paramDialogInterface.putLong("dialog_id", this.a);
          this.b.a(new as(paramDialogInterface));
          return;
        }
        paramDialogInterface = new g.bv();
        paramDialogInterface.c = v.c((int)this.a);
        if (paramInt == 0)
          paramDialogInterface.d = new g.lo();
        while (true)
        {
          ConnectionsManager.a().a(paramDialogInterface, new c()
          {
          });
          return;
          if (paramInt == 1)
          {
            paramDialogInterface.d = new g.lp();
            continue;
          }
          if (paramInt != 2)
            continue;
          paramDialogInterface.d = new g.ln();
        }
      }
    };
    paramContext.a(new CharSequence[] { str1, str2, str3, str4 }, paramg);
    return paramContext.a();
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.Components.a
 * JD-Core Version:    0.6.0
 */