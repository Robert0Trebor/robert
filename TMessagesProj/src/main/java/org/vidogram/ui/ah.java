package org.vidogram.ui;

import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build.VERSION;
import android.provider.Settings.System;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView<*>;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.ListView;
import org.vidogram.messenger.ApplicationLoader;
import org.vidogram.messenger.r;
import org.vidogram.messenger.y;
import org.vidogram.messenger.y.b;
import org.vidogram.messenger.z;
import org.vidogram.tgnet.ConnectionsManager;
import org.vidogram.tgnet.c;
import org.vidogram.tgnet.g.bx;
import org.vidogram.ui.a.a.a;
import org.vidogram.ui.a.g;
import org.vidogram.ui.c.ap;
import org.vidogram.ui.c.ba;
import org.vidogram.ui.c.bb;
import org.vidogram.ui.c.bd;
import org.vidogram.ui.c.w;

public class ah extends g
  implements y.b
{
  private int A;
  private int B;
  private int C;
  private int D;
  private int E;
  private int F;
  private int G;
  private int H;
  private int I;
  private int J;
  private int K;
  private int L;
  private int M;
  private int N;
  private int O;
  private int P;
  private int Q;
  private int R;
  private int S;
  private int T;
  private int U;
  private int V;
  private int W = 0;
  private ListView i;
  private boolean j = false;
  private int k;
  private int l;
  private int m;
  private int n;
  private int o;
  private int p;
  private int q;
  private int r;
  private int s;
  private int t;
  private int u;
  private int v;
  private int w;
  private int x;
  private int y;
  private int z;

  public View a(Context paramContext)
  {
    this.d.setBackButtonImage(2130837794);
    this.d.setAllowOverlayTitle(true);
    this.d.setTitle(r.a("NotificationsAndSounds", 2131231591));
    this.d.setActionBarMenuOnItemClick(new a.a()
    {
      public void a(int paramInt)
      {
        if (paramInt == -1)
          ah.this.d();
      }
    });
    this.b = new FrameLayout(paramContext);
    Object localObject = (FrameLayout)this.b;
    this.i = new ListView(paramContext);
    this.i.setDivider(null);
    this.i.setDividerHeight(0);
    this.i.setVerticalScrollBarEnabled(false);
    ((FrameLayout)localObject).addView(this.i);
    localObject = (FrameLayout.LayoutParams)this.i.getLayoutParams();
    ((FrameLayout.LayoutParams)localObject).width = -1;
    ((FrameLayout.LayoutParams)localObject).height = -1;
    this.i.setLayoutParams((ViewGroup.LayoutParams)localObject);
    this.i.setAdapter(new a(paramContext));
    this.i.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
      {
        String str1 = null;
        boolean bool3 = true;
        Object localObject1;
        boolean bool2;
        boolean bool1;
        if ((paramInt == ah.a(ah.this)) || (paramInt == ah.b(ah.this)))
        {
          paramAdapterView = ApplicationLoader.a.getSharedPreferences("Notifications", 0);
          localObject1 = paramAdapterView.edit();
          if (paramInt == ah.a(ah.this))
          {
            bool2 = paramAdapterView.getBoolean("EnableAll", true);
            if (!bool2)
            {
              bool1 = true;
              ((SharedPreferences.Editor)localObject1).putBoolean("EnableAll", bool1);
              bool1 = bool2;
              ((SharedPreferences.Editor)localObject1).commit();
              paramAdapterView = ah.this;
              if (paramInt != ah.b(ah.this))
                break label214;
            }
          }
          label146: label152: label214: for (bool2 = true; ; bool2 = false)
          {
            paramAdapterView.b(bool2);
            label125: if ((paramView instanceof ba))
            {
              paramAdapterView = (ba)paramView;
              if (bool1)
                break label2705;
              bool1 = bool3;
              paramAdapterView.setChecked(bool1);
            }
            return;
            bool1 = false;
            break;
            if (paramInt != ah.b(ah.this))
              break label2728;
            bool2 = paramAdapterView.getBoolean("EnableGroup", true);
            if (!bool2);
            for (bool1 = true; ; bool1 = false)
            {
              ((SharedPreferences.Editor)localObject1).putBoolean("EnableGroup", bool1);
              bool1 = bool2;
              break;
            }
          }
        }
        if ((paramInt == ah.c(ah.this)) || (paramInt == ah.d(ah.this)))
        {
          paramAdapterView = ApplicationLoader.a.getSharedPreferences("Notifications", 0);
          localObject1 = paramAdapterView.edit();
          if (paramInt == ah.c(ah.this))
          {
            bool2 = paramAdapterView.getBoolean("EnablePreviewAll", true);
            if (!bool2)
            {
              bool1 = true;
              label290: ((SharedPreferences.Editor)localObject1).putBoolean("EnablePreviewAll", bool1);
              bool1 = bool2;
              label306: ((SharedPreferences.Editor)localObject1).commit();
              paramAdapterView = ah.this;
              if (paramInt != ah.d(ah.this))
                break label403;
            }
          }
          label403: for (bool2 = true; ; bool2 = false)
          {
            paramAdapterView.b(bool2);
            break;
            bool1 = false;
            break label290;
            if (paramInt != ah.d(ah.this))
              break label2722;
            bool2 = paramAdapterView.getBoolean("EnablePreviewGroup", true);
            if (!bool2);
            for (bool1 = true; ; bool1 = false)
            {
              ((SharedPreferences.Editor)localObject1).putBoolean("EnablePreviewGroup", bool1);
              bool1 = bool2;
              break;
            }
          }
        }
        if ((paramInt == ah.e(ah.this)) || (paramInt == ah.f(ah.this)));
        label1687: label2716: label2722: label2728: label2734: 
        while (true)
        {
          Object localObject4;
          Object localObject3;
          try
          {
            localObject4 = ApplicationLoader.a.getSharedPreferences("Notifications", 0);
            localObject3 = new Intent("android.intent.action.RINGTONE_PICKER");
            ((Intent)localObject3).putExtra("android.intent.extra.ringtone.TYPE", 2);
            ((Intent)localObject3).putExtra("android.intent.extra.ringtone.SHOW_DEFAULT", true);
            ((Intent)localObject3).putExtra("android.intent.extra.ringtone.DEFAULT_URI", RingtoneManager.getDefaultUri(2));
            localObject1 = Settings.System.DEFAULT_NOTIFICATION_URI;
            if (localObject1 == null)
              break label2716;
            localObject2 = ((Uri)localObject1).getPath();
            if (paramInt != ah.e(ah.this))
              continue;
            paramAdapterView = ((SharedPreferences)localObject4).getString("GlobalSoundPath", (String)localObject2);
            if ((paramAdapterView == null) || (paramAdapterView.equals("NoSound")))
              break label2711;
            if (!paramAdapterView.equals(localObject2))
              continue;
            paramAdapterView = (AdapterView<?>)localObject1;
            break label2734;
            ((Intent)localObject3).putExtra("android.intent.extra.ringtone.EXISTING_URI", paramAdapterView);
            ah.this.a((Intent)localObject3, paramInt);
            bool1 = false;
            break label125;
            paramAdapterView = Uri.parse(paramAdapterView);
            break label2734;
            paramAdapterView = str1;
            if (paramInt != ah.f(ah.this))
              continue;
            localObject4 = ((SharedPreferences)localObject4).getString("GroupSoundPath", (String)localObject2);
            paramAdapterView = str1;
            if (localObject4 == null)
              continue;
            paramAdapterView = str1;
            if (((String)localObject4).equals("NoSound"))
              continue;
            if (!((String)localObject4).equals(localObject2))
              continue;
            paramAdapterView = (AdapterView<?>)localObject1;
            continue;
            paramAdapterView = Uri.parse((String)localObject4);
            continue;
          }
          catch (java.lang.Exception paramAdapterView)
          {
            org.vidogram.messenger.n.a("tmessages", paramAdapterView);
            bool1 = false;
          }
          break label125;
          if (paramInt == ah.g(ah.this))
          {
            if (ah.h(ah.this))
              break label152;
            ah.a(ah.this, true);
            paramAdapterView = new g.bx();
            ConnectionsManager.a().a(paramAdapterView, new c()
            {
            });
            bool1 = false;
            break label125;
          }
          if (paramInt == ah.j(ah.this))
          {
            paramAdapterView = ApplicationLoader.a.getSharedPreferences("Notifications", 0);
            localObject1 = paramAdapterView.edit();
            bool2 = paramAdapterView.getBoolean("EnableInAppSounds", true);
            if (!bool2);
            for (bool1 = true; ; bool1 = false)
            {
              ((SharedPreferences.Editor)localObject1).putBoolean("EnableInAppSounds", bool1);
              ((SharedPreferences.Editor)localObject1).commit();
              bool1 = bool2;
              break;
            }
          }
          if (paramInt == ah.k(ah.this))
          {
            paramAdapterView = ApplicationLoader.a.getSharedPreferences("Notifications", 0);
            localObject1 = paramAdapterView.edit();
            bool2 = paramAdapterView.getBoolean("EnableInAppVibrate", true);
            if (!bool2);
            for (bool1 = true; ; bool1 = false)
            {
              ((SharedPreferences.Editor)localObject1).putBoolean("EnableInAppVibrate", bool1);
              ((SharedPreferences.Editor)localObject1).commit();
              bool1 = bool2;
              break;
            }
          }
          if (paramInt == ah.l(ah.this))
          {
            paramAdapterView = ApplicationLoader.a.getSharedPreferences("Notifications", 0);
            localObject1 = paramAdapterView.edit();
            bool2 = paramAdapterView.getBoolean("EnableInAppPreview", true);
            if (!bool2);
            for (bool1 = true; ; bool1 = false)
            {
              ((SharedPreferences.Editor)localObject1).putBoolean("EnableInAppPreview", bool1);
              ((SharedPreferences.Editor)localObject1).commit();
              bool1 = bool2;
              break;
            }
          }
          if (paramInt == ah.m(ah.this))
          {
            paramAdapterView = ApplicationLoader.a.getSharedPreferences("Notifications", 0);
            localObject1 = paramAdapterView.edit();
            bool2 = paramAdapterView.getBoolean("EnableInChatSound", true);
            if (!bool2)
            {
              bool1 = true;
              label1021: ((SharedPreferences.Editor)localObject1).putBoolean("EnableInChatSound", bool1);
              ((SharedPreferences.Editor)localObject1).commit();
              paramAdapterView = z.a();
              if (bool2)
                break label1072;
            }
            label1072: for (bool1 = true; ; bool1 = false)
            {
              paramAdapterView.a(bool1);
              bool1 = bool2;
              break;
              bool1 = false;
              break label1021;
            }
          }
          if (paramInt == ah.n(ah.this))
          {
            paramAdapterView = ApplicationLoader.a.getSharedPreferences("Notifications", 0);
            localObject1 = paramAdapterView.edit();
            bool2 = paramAdapterView.getBoolean("EnableInAppPriority", false);
            if (!bool2);
            for (bool1 = true; ; bool1 = false)
            {
              ((SharedPreferences.Editor)localObject1).putBoolean("EnableInAppPriority", bool1);
              ((SharedPreferences.Editor)localObject1).commit();
              bool1 = bool2;
              break;
            }
          }
          if (paramInt == ah.o(ah.this))
          {
            localObject1 = ApplicationLoader.a.getSharedPreferences("Notifications", 0);
            paramAdapterView = ((SharedPreferences)localObject1).edit();
            bool2 = ((SharedPreferences)localObject1).getBoolean("EnableContactJoined", true);
            localObject1 = org.vidogram.messenger.v.a();
            if (!bool2)
            {
              bool1 = true;
              label1214: ((org.vidogram.messenger.v)localObject1).y = bool1;
              if (bool2)
                break label1260;
            }
            label1260: for (bool1 = true; ; bool1 = false)
            {
              paramAdapterView.putBoolean("EnableContactJoined", bool1);
              paramAdapterView.commit();
              bool1 = bool2;
              break;
              bool1 = false;
              break label1214;
            }
          }
          if (paramInt == ah.p(ah.this))
          {
            paramAdapterView = ApplicationLoader.a.getSharedPreferences("Notifications", 0);
            localObject1 = paramAdapterView.edit();
            bool2 = paramAdapterView.getBoolean("PinnedMessages", true);
            if (!bool2);
            for (bool1 = true; ; bool1 = false)
            {
              ((SharedPreferences.Editor)localObject1).putBoolean("PinnedMessages", bool1);
              ((SharedPreferences.Editor)localObject1).commit();
              bool1 = bool2;
              break;
            }
          }
          if (paramInt == ah.q(ah.this))
          {
            paramAdapterView = ApplicationLoader.a.getSharedPreferences("Notifications", 0);
            localObject1 = paramAdapterView.edit();
            bool2 = paramAdapterView.getBoolean("EnableAutoNotifications", false);
            if (!bool2);
            for (bool1 = true; ; bool1 = false)
            {
              ((SharedPreferences.Editor)localObject1).putBoolean("EnableAutoNotifications", bool1);
              ((SharedPreferences.Editor)localObject1).commit();
              bool1 = bool2;
              break;
            }
          }
          if (paramInt == ah.r(ah.this))
          {
            paramAdapterView = ApplicationLoader.a.getSharedPreferences("Notifications", 0);
            localObject1 = paramAdapterView.edit();
            bool2 = paramAdapterView.getBoolean("badgeNumber", true);
            if (!bool2)
            {
              bool1 = true;
              label1479: ((SharedPreferences.Editor)localObject1).putBoolean("badgeNumber", bool1);
              ((SharedPreferences.Editor)localObject1).commit();
              paramAdapterView = z.a();
              if (bool2)
                break label1531;
            }
            label1531: for (bool1 = true; ; bool1 = false)
            {
              paramAdapterView.b(bool1);
              bool1 = bool2;
              break;
              bool1 = false;
              break label1479;
            }
          }
          if (paramInt == ah.s(ah.this))
          {
            paramAdapterView = ApplicationLoader.a.getSharedPreferences("Notifications", 0);
            bool2 = paramAdapterView.getBoolean("pushConnection", true);
            paramAdapterView = paramAdapterView.edit();
            if (!bool2)
            {
              bool1 = true;
              label1585: paramAdapterView.putBoolean("pushConnection", bool1);
              paramAdapterView.commit();
              if (bool2)
                break label1629;
              ConnectionsManager.a().a(true);
            }
            while (true)
            {
              bool1 = bool2;
              break;
              bool1 = false;
              break label1585;
              label1629: ConnectionsManager.a().a(false);
            }
          }
          if (paramInt == ah.t(ah.this))
          {
            paramAdapterView = ApplicationLoader.a.getSharedPreferences("Notifications", 0);
            bool2 = paramAdapterView.getBoolean("pushService", true);
            paramAdapterView = paramAdapterView.edit();
            if (!bool2)
            {
              bool1 = true;
              paramAdapterView.putBoolean("pushService", bool1);
              paramAdapterView.commit();
              if (bool2)
                break label1727;
              ApplicationLoader.j();
            }
            while (true)
            {
              bool1 = bool2;
              break;
              bool1 = false;
              break label1687;
              label1727: ApplicationLoader.k();
            }
          }
          if ((paramInt == ah.u(ah.this)) || (paramInt == ah.v(ah.this)))
          {
            if (ah.this.l() == null)
              break label152;
            paramAdapterView = new LinearLayout(ah.this.l());
            paramAdapterView.setOrientation(1);
            localObject1 = new org.vidogram.ui.Components.n(ah.this.l());
            paramAdapterView.addView((View)localObject1, org.vidogram.ui.Components.v.d(-2, -2, 17));
            localObject2 = ApplicationLoader.a.getSharedPreferences("Notifications", 0);
            if (paramInt == ah.u(ah.this))
              ((org.vidogram.ui.Components.n)localObject1).setOldCenterColor(((SharedPreferences)localObject2).getInt("MessagesLed", -16711936));
            while (true)
            {
              localObject2 = new AlertDialog.Builder(ah.this.l());
              ((AlertDialog.Builder)localObject2).setTitle(r.a("LedColor", 2131231379));
              ((AlertDialog.Builder)localObject2).setView(paramAdapterView);
              ((AlertDialog.Builder)localObject2).setPositiveButton(r.a("Set", 2131231819), new DialogInterface.OnClickListener(paramView, paramInt, (org.vidogram.ui.Components.n)localObject1)
              {
                public void onClick(DialogInterface paramDialogInterface, int paramInt)
                {
                  paramDialogInterface = ApplicationLoader.a.getSharedPreferences("Notifications", 0).edit();
                  bb localbb = (bb)this.a;
                  if (this.b == ah.u(ah.this))
                  {
                    paramDialogInterface.putInt("MessagesLed", this.c.getColor());
                    localbb.a(r.a("LedColor", 2131231379), this.c.getColor(), true);
                  }
                  while (true)
                  {
                    paramDialogInterface.commit();
                    return;
                    if (this.b != ah.v(ah.this))
                      continue;
                    paramDialogInterface.putInt("GroupLed", this.c.getColor());
                    localbb.a(r.a("LedColor", 2131231379), this.c.getColor(), true);
                  }
                }
              });
              ((AlertDialog.Builder)localObject2).setNeutralButton(r.a("LedDisabled", 2131231380), new DialogInterface.OnClickListener(paramView, paramInt)
              {
                public void onClick(DialogInterface paramDialogInterface, int paramInt)
                {
                  paramDialogInterface = ApplicationLoader.a.getSharedPreferences("Notifications", 0).edit();
                  bb localbb = (bb)this.a;
                  if (this.b == ah.u(ah.this))
                  {
                    paramDialogInterface.putInt("MessagesLed", 0);
                    localbb.a(r.a("LedColor", 2131231379), 0, true);
                  }
                  while (true)
                  {
                    paramDialogInterface.commit();
                    ah.i(ah.this).invalidateViews();
                    return;
                    if (this.b != ah.v(ah.this))
                      continue;
                    paramDialogInterface.putInt("GroupLed", 0);
                    localbb.a(r.a("LedColor", 2131231379), 0, true);
                  }
                }
              });
              ah.this.b(((AlertDialog.Builder)localObject2).create());
              bool1 = false;
              break;
              if (paramInt != ah.v(ah.this))
                continue;
              ((org.vidogram.ui.Components.n)localObject1).setOldCenterColor(((SharedPreferences)localObject2).getInt("GroupLed", -16711936));
            }
          }
          if ((paramInt == ah.w(ah.this)) || (paramInt == ah.x(ah.this)))
          {
            paramAdapterView = new AlertDialog.Builder(ah.this.l());
            paramAdapterView.setTitle(r.a("PopupNotification", 2131231698));
            localObject1 = r.a("NoPopup", 2131231505);
            localObject2 = r.a("OnlyWhenScreenOn", 2131231615);
            str1 = r.a("OnlyWhenScreenOff", 2131231614);
            localObject3 = r.a("AlwaysShowPopup", 2131230843);
            localObject4 = new DialogInterface.OnClickListener(paramInt)
            {
              public void onClick(DialogInterface paramDialogInterface, int paramInt)
              {
                paramDialogInterface = ApplicationLoader.a.getSharedPreferences("Notifications", 0).edit();
                if (this.a == ah.w(ah.this))
                  paramDialogInterface.putInt("popupAll", paramInt);
                while (true)
                {
                  paramDialogInterface.commit();
                  if (ah.i(ah.this) != null)
                    ah.i(ah.this).invalidateViews();
                  return;
                  if (this.a != ah.x(ah.this))
                    continue;
                  paramDialogInterface.putInt("popupGroup", paramInt);
                }
              }
            };
            paramAdapterView.setItems(new CharSequence[] { localObject1, localObject2, str1, localObject3 }, (DialogInterface.OnClickListener)localObject4);
            paramAdapterView.setNegativeButton(r.a("Cancel", 2131230943), null);
            ah.this.b(paramAdapterView.create());
            bool1 = false;
            break label125;
          }
          Object localObject5;
          if ((paramInt == ah.y(ah.this)) || (paramInt == ah.z(ah.this)))
          {
            paramAdapterView = new AlertDialog.Builder(ah.this.l());
            paramAdapterView.setTitle(r.a("Vibrate", 2131231942));
            localObject1 = r.a("VibrationDisabled", 2131231944);
            localObject2 = r.a("VibrationDefault", 2131231943);
            str1 = r.a("Short", 2131231848);
            localObject3 = r.a("Long", 2131231407);
            localObject4 = r.a("OnlyIfSilent", 2131231613);
            localObject5 = new DialogInterface.OnClickListener(paramInt)
            {
              public void onClick(DialogInterface paramDialogInterface, int paramInt)
              {
                SharedPreferences.Editor localEditor = ApplicationLoader.a.getSharedPreferences("Notifications", 0).edit();
                paramDialogInterface = "vibrate_messages";
                if (this.a == ah.z(ah.this))
                  paramDialogInterface = "vibrate_group";
                if (paramInt == 0)
                  localEditor.putInt(paramDialogInterface, 2);
                while (true)
                {
                  localEditor.commit();
                  if (ah.i(ah.this) != null)
                    ah.i(ah.this).invalidateViews();
                  return;
                  if (paramInt == 1)
                  {
                    localEditor.putInt(paramDialogInterface, 0);
                    continue;
                  }
                  if (paramInt == 2)
                  {
                    localEditor.putInt(paramDialogInterface, 1);
                    continue;
                  }
                  if (paramInt == 3)
                  {
                    localEditor.putInt(paramDialogInterface, 3);
                    continue;
                  }
                  if (paramInt != 4)
                    continue;
                  localEditor.putInt(paramDialogInterface, 4);
                }
              }
            };
            paramAdapterView.setItems(new CharSequence[] { localObject1, localObject2, str1, localObject3, localObject4 }, (DialogInterface.OnClickListener)localObject5);
            paramAdapterView.setNegativeButton(r.a("Cancel", 2131230943), null);
            ah.this.b(paramAdapterView.create());
            bool1 = false;
            break label125;
          }
          if ((paramInt == ah.A(ah.this)) || (paramInt == ah.B(ah.this)))
          {
            paramAdapterView = new AlertDialog.Builder(ah.this.l());
            paramAdapterView.setTitle(r.a("NotificationsPriority", 2131231594));
            localObject1 = r.a("NotificationsPriorityDefault", 2131231595);
            localObject2 = r.a("NotificationsPriorityHigh", 2131231596);
            str1 = r.a("NotificationsPriorityMax", 2131231598);
            localObject3 = new DialogInterface.OnClickListener(paramInt)
            {
              public void onClick(DialogInterface paramDialogInterface, int paramInt)
              {
                paramDialogInterface = ApplicationLoader.a.getSharedPreferences("Notifications", 0);
                if (this.a == ah.A(ah.this))
                  paramDialogInterface.edit().putInt("priority_messages", paramInt).commit();
                while (true)
                {
                  if (ah.i(ah.this) != null)
                    ah.i(ah.this).invalidateViews();
                  return;
                  if (this.a != ah.B(ah.this))
                    continue;
                  paramDialogInterface.edit().putInt("priority_group", paramInt).commit();
                }
              }
            };
            paramAdapterView.setItems(new CharSequence[] { localObject1, localObject2, str1 }, (DialogInterface.OnClickListener)localObject3);
            paramAdapterView.setNegativeButton(r.a("Cancel", 2131230943), null);
            ah.this.b(paramAdapterView.create());
            bool1 = false;
            break label125;
          }
          if (paramInt == ah.C(ah.this))
          {
            paramAdapterView = new AlertDialog.Builder(ah.this.l());
            paramAdapterView.setTitle(r.a("RepeatNotifications", 2131231714));
            localObject1 = r.a("RepeatDisabled", 2131231713);
            localObject2 = r.b("Minutes", 5);
            str1 = r.b("Minutes", 10);
            localObject3 = r.b("Minutes", 30);
            localObject4 = r.b("Hours", 1);
            localObject5 = r.b("Hours", 2);
            String str2 = r.b("Hours", 4);
            7 local7 = new DialogInterface.OnClickListener()
            {
              public void onClick(DialogInterface paramDialogInterface, int paramInt)
              {
                int i = 5;
                if (paramInt == 1)
                  paramInt = i;
                while (true)
                {
                  ApplicationLoader.a.getSharedPreferences("Notifications", 0).edit().putInt("repeat_messages", paramInt).commit();
                  if (ah.i(ah.this) != null)
                    ah.i(ah.this).invalidateViews();
                  return;
                  if (paramInt == 2)
                  {
                    paramInt = 10;
                    continue;
                  }
                  if (paramInt == 3)
                  {
                    paramInt = 30;
                    continue;
                  }
                  if (paramInt == 4)
                  {
                    paramInt = 60;
                    continue;
                  }
                  if (paramInt == 5)
                  {
                    paramInt = 120;
                    continue;
                  }
                  if (paramInt == 6)
                  {
                    paramInt = 240;
                    continue;
                  }
                  paramInt = 0;
                }
              }
            };
            paramAdapterView.setItems(new CharSequence[] { localObject1, localObject2, str1, localObject3, localObject4, localObject5, str2 }, local7);
            paramAdapterView.setNegativeButton(r.a("Cancel", 2131230943), null);
            ah.this.b(paramAdapterView.create());
          }
          bool1 = false;
          break label125;
          bool1 = false;
          break label146;
          paramAdapterView = null;
          break label2734;
          Object localObject2 = null;
          continue;
          bool1 = false;
          break label306;
          bool1 = false;
          break;
        }
      }
    });
    return (View)this.b;
  }

  public void a(int paramInt1, int paramInt2, Intent paramIntent)
  {
    Uri localUri;
    SharedPreferences.Editor localEditor;
    Ringtone localRingtone;
    if (paramInt2 == -1)
    {
      localUri = (Uri)paramIntent.getParcelableExtra("android.intent.extra.ringtone.PICKED_URI");
      localEditor = null;
      paramIntent = localEditor;
      if (localUri != null)
      {
        localRingtone = RingtoneManager.getRingtone(l(), localUri);
        paramIntent = localEditor;
        if (localRingtone != null)
        {
          if (!localUri.equals(Settings.System.DEFAULT_NOTIFICATION_URI))
            break label151;
          paramIntent = r.a("SoundDefault", 2131231866);
          localRingtone.stop();
        }
      }
      localEditor = ApplicationLoader.a.getSharedPreferences("Notifications", 0).edit();
      if (paramInt1 != this.q)
        break label195;
      if ((paramIntent == null) || (localUri == null))
        break label164;
      localEditor.putString("GlobalSound", paramIntent);
      localEditor.putString("GlobalSoundPath", localUri.toString());
    }
    while (true)
    {
      localEditor.commit();
      this.i.invalidateViews();
      return;
      label151: paramIntent = localRingtone.getTitle(l());
      break;
      label164: localEditor.putString("GlobalSound", "NoSound");
      localEditor.putString("GlobalSoundPath", "NoSound");
      continue;
      label195: if (paramInt1 != this.z)
        continue;
      if ((paramIntent != null) && (localUri != null))
      {
        localEditor.putString("GroupSound", paramIntent);
        localEditor.putString("GroupSoundPath", localUri.toString());
        continue;
      }
      localEditor.putString("GroupSound", "NoSound");
      localEditor.putString("GroupSoundPath", "NoSound");
    }
  }

  public void a(int paramInt, Object[] paramArrayOfObject)
  {
    if (paramInt == y.w)
      this.i.invalidateViews();
  }

  public void b(boolean paramBoolean)
  {
  }

  public boolean f()
  {
    int i1 = this.W;
    this.W = (i1 + 1);
    this.m = i1;
    i1 = this.W;
    this.W = (i1 + 1);
    this.n = i1;
    i1 = this.W;
    this.W = (i1 + 1);
    this.o = i1;
    i1 = this.W;
    this.W = (i1 + 1);
    this.r = i1;
    i1 = this.W;
    this.W = (i1 + 1);
    this.p = i1;
    i1 = this.W;
    this.W = (i1 + 1);
    this.s = i1;
    i1 = this.W;
    this.W = (i1 + 1);
    this.q = i1;
    if (Build.VERSION.SDK_INT >= 21)
    {
      i1 = this.W;
      this.W = (i1 + 1);
      this.t = i1;
      i1 = this.W;
      this.W = (i1 + 1);
      this.u = i1;
      i1 = this.W;
      this.W = (i1 + 1);
      this.v = i1;
      i1 = this.W;
      this.W = (i1 + 1);
      this.w = i1;
      i1 = this.W;
      this.W = (i1 + 1);
      this.x = i1;
      i1 = this.W;
      this.W = (i1 + 1);
      this.A = i1;
      i1 = this.W;
      this.W = (i1 + 1);
      this.y = i1;
      i1 = this.W;
      this.W = (i1 + 1);
      this.B = i1;
      i1 = this.W;
      this.W = (i1 + 1);
      this.z = i1;
      if (Build.VERSION.SDK_INT < 21)
        break label681;
      i1 = this.W;
      this.W = (i1 + 1);
      this.C = i1;
      label305: i1 = this.W;
      this.W = (i1 + 1);
      this.D = i1;
      i1 = this.W;
      this.W = (i1 + 1);
      this.E = i1;
      i1 = this.W;
      this.W = (i1 + 1);
      this.F = i1;
      i1 = this.W;
      this.W = (i1 + 1);
      this.G = i1;
      i1 = this.W;
      this.W = (i1 + 1);
      this.H = i1;
      i1 = this.W;
      this.W = (i1 + 1);
      this.I = i1;
      if (Build.VERSION.SDK_INT < 21)
        break label689;
      i1 = this.W;
      this.W = (i1 + 1);
    }
    label681: label689: for (this.J = i1; ; this.J = -1)
    {
      i1 = this.W;
      this.W = (i1 + 1);
      this.K = i1;
      i1 = this.W;
      this.W = (i1 + 1);
      this.L = i1;
      i1 = this.W;
      this.W = (i1 + 1);
      this.M = i1;
      i1 = this.W;
      this.W = (i1 + 1);
      this.N = i1;
      i1 = this.W;
      this.W = (i1 + 1);
      this.O = i1;
      i1 = this.W;
      this.W = (i1 + 1);
      this.P = i1;
      i1 = this.W;
      this.W = (i1 + 1);
      this.k = i1;
      i1 = this.W;
      this.W = (i1 + 1);
      this.l = i1;
      i1 = this.W;
      this.W = (i1 + 1);
      this.Q = i1;
      this.R = -1;
      i1 = this.W;
      this.W = (i1 + 1);
      this.S = i1;
      i1 = this.W;
      this.W = (i1 + 1);
      this.T = i1;
      i1 = this.W;
      this.W = (i1 + 1);
      this.U = i1;
      i1 = this.W;
      this.W = (i1 + 1);
      this.V = i1;
      y.a().a(this, y.w);
      return super.f();
      this.t = -1;
      break;
      this.C = -1;
      break label305;
    }
  }

  public void g()
  {
    super.g();
    y.a().b(this, y.w);
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
      return ah.O(ah.this);
    }

    public Object getItem(int paramInt)
    {
      return null;
    }

    public long getItemId(int paramInt)
    {
      return paramInt;
    }

    public int getItemViewType(int paramInt)
    {
      if ((paramInt == ah.D(ah.this)) || (paramInt == ah.E(ah.this)) || (paramInt == ah.F(ah.this)) || (paramInt == ah.G(ah.this)) || (paramInt == ah.H(ah.this)) || (paramInt == ah.I(ah.this)))
        return 0;
      if ((paramInt == ah.a(ah.this)) || (paramInt == ah.c(ah.this)) || (paramInt == ah.b(ah.this)) || (paramInt == ah.d(ah.this)) || (paramInt == ah.j(ah.this)) || (paramInt == ah.k(ah.this)) || (paramInt == ah.l(ah.this)) || (paramInt == ah.o(ah.this)) || (paramInt == ah.p(ah.this)) || (paramInt == ah.t(ah.this)) || (paramInt == ah.r(ah.this)) || (paramInt == ah.n(ah.this)) || (paramInt == ah.m(ah.this)) || (paramInt == ah.q(ah.this)) || (paramInt == ah.s(ah.this)))
        return 1;
      if ((paramInt == ah.u(ah.this)) || (paramInt == ah.v(ah.this)))
        return 3;
      if ((paramInt == ah.J(ah.this)) || (paramInt == ah.K(ah.this)) || (paramInt == ah.L(ah.this)) || (paramInt == ah.M(ah.this)) || (paramInt == ah.N(ah.this)))
        return 4;
      return 2;
    }

    public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      int j = 0;
      int i = 0;
      int k = getItemViewType(paramInt);
      if (k == 0)
        if (paramView == null)
        {
          paramView = new w(this.b);
          if (paramInt == ah.D(ah.this))
            ((w)paramView).setText(r.a("MessageNotifications", 2131231437));
        }
      while (true)
      {
        Object localObject2;
        Object localObject1;
        if (k == 1)
        {
          paramViewGroup = paramView;
          if (paramView == null)
            paramViewGroup = new ba(this.b);
          paramView = (ba)paramViewGroup;
          localObject2 = ApplicationLoader.a.getSharedPreferences("Notifications", 0);
          if (paramInt == ah.a(ah.this))
          {
            paramView.a(r.a("Alert", 2131230832), ((SharedPreferences)localObject2).getBoolean("EnableAll", true), true);
            localObject1 = paramViewGroup;
          }
          do
          {
            return localObject1;
            if (paramInt == ah.E(ah.this))
            {
              ((w)paramView).setText(r.a("GroupNotifications", 2131231279));
              break;
            }
            if (paramInt == ah.F(ah.this))
            {
              ((w)paramView).setText(r.a("InAppNotifications", 2131231306));
              break;
            }
            if (paramInt == ah.G(ah.this))
            {
              ((w)paramView).setText(r.a("Events", 2131231187));
              break;
            }
            if (paramInt == ah.H(ah.this))
            {
              ((w)paramView).setText(r.a("NotificationsOther", 2131231593));
              break;
            }
            if (paramInt == ah.I(ah.this))
              ((w)paramView).setText(r.a("Reset", 2131231730));
            break;
            if (paramInt == ah.b(ah.this))
            {
              paramView.a(r.a("Alert", 2131230832), ((SharedPreferences)localObject2).getBoolean("EnableGroup", true), true);
              return paramViewGroup;
            }
            if (paramInt == ah.c(ah.this))
            {
              paramView.a(r.a("MessagePreview", 2131231438), ((SharedPreferences)localObject2).getBoolean("EnablePreviewAll", true), true);
              return paramViewGroup;
            }
            if (paramInt == ah.d(ah.this))
            {
              paramView.a(r.a("MessagePreview", 2131231438), ((SharedPreferences)localObject2).getBoolean("EnablePreviewGroup", true), true);
              return paramViewGroup;
            }
            if (paramInt == ah.j(ah.this))
            {
              paramView.a(r.a("InAppSounds", 2131231308), ((SharedPreferences)localObject2).getBoolean("EnableInAppSounds", true), true);
              return paramViewGroup;
            }
            if (paramInt == ah.k(ah.this))
            {
              paramView.a(r.a("InAppVibrate", 2131231309), ((SharedPreferences)localObject2).getBoolean("EnableInAppVibrate", true), true);
              return paramViewGroup;
            }
            if (paramInt == ah.l(ah.this))
            {
              paramView.a(r.a("InAppPreview", 2131231307), ((SharedPreferences)localObject2).getBoolean("EnableInAppPreview", true), true);
              return paramViewGroup;
            }
            if (paramInt == ah.n(ah.this))
            {
              paramView.a(r.a("NotificationsPriority", 2131231594), ((SharedPreferences)localObject2).getBoolean("EnableInAppPriority", false), false);
              return paramViewGroup;
            }
            if (paramInt == ah.o(ah.this))
            {
              paramView.a(r.a("ContactJoined", 2131231077), ((SharedPreferences)localObject2).getBoolean("EnableContactJoined", true), true);
              return paramViewGroup;
            }
            if (paramInt == ah.p(ah.this))
            {
              paramView.a(r.a("PinnedMessages", 2131231686), ((SharedPreferences)localObject2).getBoolean("PinnedMessages", true), false);
              return paramViewGroup;
            }
            if (paramInt == ah.q(ah.this))
            {
              paramView.a("Android Auto", ((SharedPreferences)localObject2).getBoolean("EnableAutoNotifications", false), true);
              return paramViewGroup;
            }
            if (paramInt == ah.t(ah.this))
            {
              paramView.a(r.a("NotificationsService", 2131231599), r.a("NotificationsServiceInfo", 2131231602), ((SharedPreferences)localObject2).getBoolean("pushService", true), true, true);
              return paramViewGroup;
            }
            if (paramInt == ah.s(ah.this))
            {
              paramView.a(r.a("NotificationsServiceConnection", 2131231600), r.a("NotificationsServiceConnectionInfo", 2131231601), ((SharedPreferences)localObject2).getBoolean("pushConnection", true), true, true);
              return paramViewGroup;
            }
            if (paramInt == ah.r(ah.this))
            {
              paramView.a(r.a("BadgeNumber", 2131230914), ((SharedPreferences)localObject2).getBoolean("badgeNumber", true), true);
              return paramViewGroup;
            }
            localObject1 = paramViewGroup;
          }
          while (paramInt != ah.m(ah.this));
          paramView.a(r.a("InChatSound", 2131231310), ((SharedPreferences)localObject2).getBoolean("EnableInChatSound", true), true);
          return paramViewGroup;
        }
        if (k == 2)
          if (paramView != null)
            break label1829;
        label923: label1055: label1829: for (paramViewGroup = new bd(this.b); ; paramViewGroup = paramView)
        {
          localObject2 = (bd)paramViewGroup;
          localObject1 = ApplicationLoader.a.getSharedPreferences("Notifications", 0);
          if ((paramInt == ah.e(ah.this)) || (paramInt == ah.f(ah.this)))
          {
            ((bd)localObject2).setMultilineDetail(false);
            paramView = null;
            if (paramInt == ah.e(ah.this))
            {
              paramView = ((SharedPreferences)localObject1).getString("GlobalSound", r.a("SoundDefault", 2131231866));
              localObject1 = paramView;
              if (paramView.equals("NoSound"))
                localObject1 = r.a("NoSound", 2131231516);
              ((bd)localObject2).a(r.a("Sound", 2131231865), (String)localObject1, true);
            }
          }
          label1116: 
          do
          {
            while (true)
            {
              return paramViewGroup;
              if (paramInt != ah.f(ah.this))
                break;
              paramView = ((SharedPreferences)localObject1).getString("GroupSound", r.a("SoundDefault", 2131231866));
              break;
              if (paramInt == ah.g(ah.this))
              {
                ((bd)localObject2).setMultilineDetail(true);
                ((bd)localObject2).a(r.a("ResetAllNotifications", 2131231736), r.a("UndoAllCustom", 2131231911), false);
                continue;
              }
              if ((paramInt == ah.w(ah.this)) || (paramInt == ah.x(ah.this)))
              {
                ((bd)localObject2).setMultilineDetail(false);
                if (paramInt == ah.w(ah.this))
                {
                  i = ((SharedPreferences)localObject1).getInt("popupAll", 0);
                  if (i != 0)
                    break label1116;
                  paramView = r.a("NoPopup", 2131231505);
                }
                while (true)
                {
                  ((bd)localObject2).a(r.a("PopupNotification", 2131231698), paramView, true);
                  break;
                  if (paramInt != ah.x(ah.this))
                    break label1055;
                  i = ((SharedPreferences)localObject1).getInt("popupGroup", 0);
                  break label1055;
                  if (i == 1)
                  {
                    paramView = r.a("OnlyWhenScreenOn", 2131231615);
                    continue;
                  }
                  if (i == 2)
                  {
                    paramView = r.a("OnlyWhenScreenOff", 2131231614);
                    continue;
                  }
                  paramView = r.a("AlwaysShowPopup", 2131230843);
                }
              }
              if ((paramInt != ah.y(ah.this)) && (paramInt != ah.z(ah.this)))
                break label1414;
              ((bd)localObject2).setMultilineDetail(false);
              if (paramInt == ah.y(ah.this))
                i = ((SharedPreferences)localObject1).getInt("vibrate_messages", 0);
              while (true)
              {
                if (i != 0)
                  break label1282;
                ((bd)localObject2).a(r.a("Vibrate", 2131231942), r.a("VibrationDefault", 2131231943), true);
                break;
                i = j;
                if (paramInt != ah.z(ah.this))
                  continue;
                i = ((SharedPreferences)localObject1).getInt("vibrate_group", 0);
              }
              if (i == 1)
              {
                ((bd)localObject2).a(r.a("Vibrate", 2131231942), r.a("Short", 2131231848), true);
                continue;
              }
              if (i == 2)
              {
                ((bd)localObject2).a(r.a("Vibrate", 2131231942), r.a("VibrationDisabled", 2131231944), true);
                continue;
              }
              if (i == 3)
              {
                ((bd)localObject2).a(r.a("Vibrate", 2131231942), r.a("Long", 2131231407), true);
                continue;
              }
              if (i != 4)
                continue;
              ((bd)localObject2).a(r.a("Vibrate", 2131231942), r.a("OnlyIfSilent", 2131231613), true);
            }
            if (paramInt != ah.C(ah.this))
              continue;
            ((bd)localObject2).setMultilineDetail(false);
            paramInt = ((SharedPreferences)localObject1).getInt("repeat_messages", 60);
            if (paramInt == 0)
              paramView = r.a("RepeatNotificationsNever", 2131231715);
            while (true)
            {
              ((bd)localObject2).a(r.a("RepeatNotifications", 2131231714), paramView, false);
              break;
              if (paramInt < 60)
              {
                paramView = r.b("Minutes", paramInt);
                continue;
              }
              paramView = r.b("Hours", paramInt / 60);
            }
          }
          while ((paramInt != ah.A(ah.this)) && (paramInt != ah.B(ah.this)));
          ((bd)localObject2).setMultilineDetail(false);
          if (paramInt == ah.A(ah.this))
            paramInt = ((SharedPreferences)localObject1).getInt("priority_messages", 1);
          while (true)
          {
            if (paramInt == 0)
            {
              ((bd)localObject2).a(r.a("NotificationsPriority", 2131231594), r.a("NotificationsPriorityDefault", 2131231595), false);
              break label923;
              if (paramInt == ah.B(ah.this))
              {
                paramInt = ((SharedPreferences)localObject1).getInt("priority_group", 1);
                continue;
              }
            }
            else
            {
              if (paramInt == 1)
              {
                ((bd)localObject2).a(r.a("NotificationsPriority", 2131231594), r.a("NotificationsPriorityHigh", 2131231596), false);
                break label923;
              }
              if (paramInt != 2)
                break label923;
              ((bd)localObject2).a(r.a("NotificationsPriority", 2131231594), r.a("NotificationsPriorityMax", 2131231598), false);
              break label923;
              if (k == 3)
              {
                if (paramView != null)
                  break label1821;
                paramView = new bb(this.b);
              }
              while (true)
              {
                paramViewGroup = (bb)paramView;
                localObject1 = ApplicationLoader.a.getSharedPreferences("Notifications", 0);
                if (paramInt == ah.u(ah.this))
                  paramViewGroup.a(r.a("LedColor", 2131231379), ((SharedPreferences)localObject1).getInt("MessagesLed", -16711936), true);
                while (true)
                {
                  return paramView;
                  if (paramInt != ah.v(ah.this))
                    continue;
                  paramViewGroup.a(r.a("LedColor", 2131231379), ((SharedPreferences)localObject1).getInt("GroupLed", -16711936), true);
                }
                localObject1 = paramView;
                if (k != 4)
                  break;
                localObject1 = paramView;
                if (paramView != null)
                  break;
                return new ap(this.b);
              }
            }
            paramInt = 0;
          }
        }
        label1282: label1414: label1821: break;
      }
    }

    public int getViewTypeCount()
    {
      return 5;
    }

    public boolean hasStableIds()
    {
      return false;
    }

    public boolean isEmpty()
    {
      return false;
    }

    public boolean isEnabled(int paramInt)
    {
      return (paramInt != ah.D(ah.this)) && (paramInt != ah.E(ah.this)) && (paramInt != ah.F(ah.this)) && (paramInt != ah.G(ah.this)) && (paramInt != ah.H(ah.this)) && (paramInt != ah.I(ah.this)) && (paramInt != ah.J(ah.this)) && (paramInt != ah.K(ah.this)) && (paramInt != ah.L(ah.this)) && (paramInt != ah.M(ah.this)) && (paramInt != ah.N(ah.this));
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.ah
 * JD-Core Version:    0.6.0
 */