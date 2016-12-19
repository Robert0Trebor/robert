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
import android.os.Bundle;
import android.provider.Settings.System;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListView;
import android.widget.TextView;
import java.util.concurrent.ConcurrentHashMap;
import org.vidogram.messenger.ApplicationLoader;
import org.vidogram.messenger.r;
import org.vidogram.messenger.w;
import org.vidogram.messenger.y;
import org.vidogram.messenger.y.b;
import org.vidogram.messenger.z;
import org.vidogram.tgnet.ConnectionsManager;
import org.vidogram.tgnet.g.hq;
import org.vidogram.tgnet.g.rl;
import org.vidogram.ui.Components.ab;
import org.vidogram.ui.Components.b;
import org.vidogram.ui.a.a.a;
import org.vidogram.ui.a.g;
import org.vidogram.ui.c.bb;
import org.vidogram.ui.c.bd;

public class ar extends g
  implements y.b
{
  private ListView i;
  private long j;
  private int k;
  private int l;
  private int m;
  private int n;
  private int o;
  private int p;
  private int q = 0;

  public ar(Bundle paramBundle)
  {
    super(paramBundle);
    this.j = paramBundle.getLong("dialog_id");
  }

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
          ar.this.d();
      }
    });
    this.b = new FrameLayout(paramContext);
    Object localObject = (FrameLayout)this.b;
    this.i = new ListView(paramContext);
    this.i.setDivider(null);
    this.i.setDividerHeight(0);
    this.i.setVerticalScrollBarEnabled(false);
    org.vidogram.messenger.a.a(this.i, b.f(5));
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
        Object localObject1;
        Object localObject2;
        Object localObject3;
        Object localObject4;
        if (paramInt == ar.a(ar.this))
        {
          paramAdapterView = new AlertDialog.Builder(ar.this.l());
          paramAdapterView.setTitle(r.a("Vibrate", 2131231942));
          paramView = r.a("VibrationDisabled", 2131231944);
          localObject1 = r.a("SettingsDefault", 2131231831);
          localObject2 = r.a("SystemDefault", 2131231883);
          localObject3 = r.a("Short", 2131231848);
          localObject4 = r.a("Long", 2131231407);
          1 local1 = new DialogInterface.OnClickListener()
          {
            public void onClick(DialogInterface paramDialogInterface, int paramInt)
            {
              paramDialogInterface = ApplicationLoader.a.getSharedPreferences("Notifications", 0).edit();
              if (paramInt == 0)
                paramDialogInterface.putInt("vibrate_" + ar.b(ar.this), 2);
              while (true)
              {
                paramDialogInterface.commit();
                if (ar.c(ar.this) != null)
                  ar.c(ar.this).invalidateViews();
                return;
                if (paramInt == 1)
                {
                  paramDialogInterface.putInt("vibrate_" + ar.b(ar.this), 0);
                  continue;
                }
                if (paramInt == 2)
                {
                  paramDialogInterface.putInt("vibrate_" + ar.b(ar.this), 4);
                  continue;
                }
                if (paramInt == 3)
                {
                  paramDialogInterface.putInt("vibrate_" + ar.b(ar.this), 1);
                  continue;
                }
                if (paramInt != 4)
                  continue;
                paramDialogInterface.putInt("vibrate_" + ar.b(ar.this), 3);
              }
            }
          };
          paramAdapterView.setItems(new CharSequence[] { paramView, localObject1, localObject2, localObject3, localObject4 }, local1);
          paramAdapterView.setNegativeButton(r.a("Cancel", 2131230943), null);
          ar.this.b(paramAdapterView.create());
        }
        while (true)
        {
          return;
          if (paramInt != ar.d(ar.this))
            break;
          if (ar.this.l() == null)
            continue;
          paramAdapterView = new AlertDialog.Builder(ar.this.l());
          paramAdapterView.setTitle(r.a("AppName", 2131230856));
          paramView = r.a("Default", 2131231116);
          localObject1 = r.a("Enabled", 2131231162);
          localObject2 = r.a("NotificationsDisabled", 2131231592);
          localObject3 = new DialogInterface.OnClickListener()
          {
            public void onClick(DialogInterface paramDialogInterface, int paramInt)
            {
              paramDialogInterface = ApplicationLoader.a.getSharedPreferences("Notifications", 0).edit();
              paramDialogInterface.putInt("notify2_" + ar.b(ar.this), paramInt);
              if (paramInt == 2)
                z.a().b(ar.b(ar.this));
              w localw = w.a();
              long l2 = ar.b(ar.this);
              long l1;
              if (paramInt == 2)
                l1 = 1L;
              while (true)
              {
                localw.a(l2, l1);
                paramDialogInterface.commit();
                paramDialogInterface = (g.hq)org.vidogram.messenger.v.a().g.get(Long.valueOf(ar.b(ar.this)));
                if (paramDialogInterface != null)
                {
                  paramDialogInterface.i = new g.rl();
                  if (paramInt == 2)
                    paramDialogInterface.i.d = 2147483647;
                }
                if (ar.c(ar.this) != null)
                  ar.c(ar.this).invalidateViews();
                z.c(ar.b(ar.this));
                return;
                l1 = 0L;
              }
            }
          };
          paramAdapterView.setItems(new CharSequence[] { paramView, localObject1, localObject2 }, (DialogInterface.OnClickListener)localObject3);
          paramAdapterView.setNegativeButton(r.a("Cancel", 2131230943), null);
          ar.this.b(paramAdapterView.create());
          return;
        }
        if (paramInt == ar.e(ar.this));
        while (true)
        {
          try
          {
            localObject1 = new Intent("android.intent.action.RINGTONE_PICKER");
            ((Intent)localObject1).putExtra("android.intent.extra.ringtone.TYPE", 2);
            ((Intent)localObject1).putExtra("android.intent.extra.ringtone.SHOW_DEFAULT", true);
            ((Intent)localObject1).putExtra("android.intent.extra.ringtone.DEFAULT_URI", RingtoneManager.getDefaultUri(2));
            localObject2 = ApplicationLoader.a.getSharedPreferences("Notifications", 0);
            paramView = Settings.System.DEFAULT_NOTIFICATION_URI;
            if (paramView == null)
              break label1766;
            paramAdapterView = paramView.getPath();
            localObject2 = ((SharedPreferences)localObject2).getString("sound_path_" + ar.b(ar.this), paramAdapterView);
            if ((localObject2 == null) || (((String)localObject2).equals("NoSound")))
              break label1761;
            if (((String)localObject2).equals(paramAdapterView))
            {
              paramAdapterView = paramView;
              ((Intent)localObject1).putExtra("android.intent.extra.ringtone.EXISTING_URI", paramAdapterView);
              ar.this.a((Intent)localObject1, 12);
              return;
            }
          }
          catch (java.lang.Exception paramAdapterView)
          {
            org.vidogram.messenger.n.a("tmessages", paramAdapterView);
            return;
          }
          paramAdapterView = Uri.parse((String)localObject2);
          continue;
          if (paramInt == ar.f(ar.this))
          {
            if (ar.this.l() == null)
              break;
            paramAdapterView = new LinearLayout(ar.this.l());
            paramAdapterView.setOrientation(1);
            paramView = new org.vidogram.ui.Components.n(ar.this.l());
            paramAdapterView.addView(paramView, org.vidogram.ui.Components.v.d(-2, -2, 17));
            localObject1 = ApplicationLoader.a.getSharedPreferences("Notifications", 0);
            if (((SharedPreferences)localObject1).contains("color_" + ar.b(ar.this)))
              paramView.setOldCenterColor(((SharedPreferences)localObject1).getInt("color_" + ar.b(ar.this), -16711936));
            while (true)
            {
              localObject1 = new AlertDialog.Builder(ar.this.l());
              ((AlertDialog.Builder)localObject1).setTitle(r.a("LedColor", 2131231379));
              ((AlertDialog.Builder)localObject1).setView(paramAdapterView);
              ((AlertDialog.Builder)localObject1).setPositiveButton(r.a("Set", 2131231819), new DialogInterface.OnClickListener(paramView)
              {
                public void onClick(DialogInterface paramDialogInterface, int paramInt)
                {
                  paramDialogInterface = ApplicationLoader.a.getSharedPreferences("Notifications", 0).edit();
                  paramDialogInterface.putInt("color_" + ar.b(ar.this), this.a.getColor());
                  paramDialogInterface.commit();
                  ar.c(ar.this).invalidateViews();
                }
              });
              ((AlertDialog.Builder)localObject1).setNeutralButton(r.a("LedDisabled", 2131231380), new DialogInterface.OnClickListener()
              {
                public void onClick(DialogInterface paramDialogInterface, int paramInt)
                {
                  paramDialogInterface = ApplicationLoader.a.getSharedPreferences("Notifications", 0).edit();
                  paramDialogInterface.putInt("color_" + ar.b(ar.this), 0);
                  paramDialogInterface.commit();
                  ar.c(ar.this).invalidateViews();
                }
              });
              ((AlertDialog.Builder)localObject1).setNegativeButton(r.a("Default", 2131231116), new DialogInterface.OnClickListener()
              {
                public void onClick(DialogInterface paramDialogInterface, int paramInt)
                {
                  paramDialogInterface = ApplicationLoader.a.getSharedPreferences("Notifications", 0).edit();
                  paramDialogInterface.remove("color_" + ar.b(ar.this));
                  paramDialogInterface.commit();
                  ar.c(ar.this).invalidateViews();
                }
              });
              ar.this.b(((AlertDialog.Builder)localObject1).create());
              return;
              if ((int)ar.b(ar.this) < 0)
              {
                paramView.setOldCenterColor(((SharedPreferences)localObject1).getInt("GroupLed", -16711936));
                continue;
              }
              paramView.setOldCenterColor(((SharedPreferences)localObject1).getInt("MessagesLed", -16711936));
            }
          }
          if (paramInt == ar.g(ar.this))
          {
            paramAdapterView = new AlertDialog.Builder(ar.this.l());
            paramAdapterView.setTitle(r.a("NotificationsPriority", 2131231594));
            paramView = r.a("SettingsDefault", 2131231831);
            localObject1 = r.a("NotificationsPriorityDefault", 2131231595);
            localObject2 = r.a("NotificationsPriorityHigh", 2131231596);
            localObject3 = r.a("NotificationsPriorityMax", 2131231598);
            localObject4 = new DialogInterface.OnClickListener()
            {
              public void onClick(DialogInterface paramDialogInterface, int paramInt)
              {
                if (paramInt == 0)
                  paramInt = 3;
                while (true)
                {
                  ApplicationLoader.a.getSharedPreferences("Notifications", 0).edit().putInt("priority_" + ar.b(ar.this), paramInt).commit();
                  if (ar.c(ar.this) != null)
                    ar.c(ar.this).invalidateViews();
                  return;
                  paramInt -= 1;
                }
              }
            };
            paramAdapterView.setItems(new CharSequence[] { paramView, localObject1, localObject2, localObject3 }, (DialogInterface.OnClickListener)localObject4);
            paramAdapterView.setNegativeButton(r.a("Cancel", 2131230943), null);
            ar.this.b(paramAdapterView.create());
            return;
          }
          if ((paramInt != ar.h(ar.this)) || (ar.this.l() == null))
            break;
          paramAdapterView = ApplicationLoader.a.getSharedPreferences("Notifications", 0);
          int i = paramAdapterView.getInt("smart_max_count_" + ar.b(ar.this), 2);
          int j = paramAdapterView.getInt("smart_delay_" + ar.b(ar.this), 180);
          paramInt = i;
          if (i == 0)
            paramInt = 2;
          paramAdapterView = new LinearLayout(ar.this.l());
          paramAdapterView.setOrientation(1);
          localObject1 = new LinearLayout(ar.this.l());
          ((LinearLayout)localObject1).setOrientation(0);
          paramAdapterView.addView((View)localObject1);
          paramView = (LinearLayout.LayoutParams)((LinearLayout)localObject1).getLayoutParams();
          paramView.width = -2;
          paramView.height = -2;
          paramView.gravity = 49;
          ((LinearLayout)localObject1).setLayoutParams(paramView);
          paramView = new TextView(ar.this.l());
          paramView.setText(r.a("SmartNotificationsSoundAtMost", 2131231857));
          paramView.setTextSize(1, 18.0F);
          ((LinearLayout)localObject1).addView(paramView);
          localObject2 = (LinearLayout.LayoutParams)paramView.getLayoutParams();
          ((LinearLayout.LayoutParams)localObject2).width = -2;
          ((LinearLayout.LayoutParams)localObject2).height = -2;
          ((LinearLayout.LayoutParams)localObject2).gravity = 19;
          paramView.setLayoutParams((ViewGroup.LayoutParams)localObject2);
          paramView = new ab(ar.this.l());
          paramView.setMinValue(1);
          paramView.setMaxValue(10);
          paramView.setValue(paramInt);
          ((LinearLayout)localObject1).addView(paramView);
          localObject2 = (LinearLayout.LayoutParams)paramView.getLayoutParams();
          ((LinearLayout.LayoutParams)localObject2).width = org.vidogram.messenger.a.a(50.0F);
          paramView.setLayoutParams((ViewGroup.LayoutParams)localObject2);
          localObject2 = new TextView(ar.this.l());
          ((TextView)localObject2).setText(r.a("SmartNotificationsTimes", 2131231858));
          ((TextView)localObject2).setTextSize(1, 18.0F);
          ((LinearLayout)localObject1).addView((View)localObject2);
          localObject1 = (LinearLayout.LayoutParams)((TextView)localObject2).getLayoutParams();
          ((LinearLayout.LayoutParams)localObject1).width = -2;
          ((LinearLayout.LayoutParams)localObject1).height = -2;
          ((LinearLayout.LayoutParams)localObject1).gravity = 19;
          ((TextView)localObject2).setLayoutParams((ViewGroup.LayoutParams)localObject1);
          localObject1 = new LinearLayout(ar.this.l());
          ((LinearLayout)localObject1).setOrientation(0);
          paramAdapterView.addView((View)localObject1);
          localObject2 = (LinearLayout.LayoutParams)((LinearLayout)localObject1).getLayoutParams();
          ((LinearLayout.LayoutParams)localObject2).width = -2;
          ((LinearLayout.LayoutParams)localObject2).height = -2;
          ((LinearLayout.LayoutParams)localObject2).gravity = 49;
          ((LinearLayout)localObject1).setLayoutParams((ViewGroup.LayoutParams)localObject2);
          localObject2 = new TextView(ar.this.l());
          ((TextView)localObject2).setText(r.a("SmartNotificationsWithin", 2131231859));
          ((TextView)localObject2).setTextSize(1, 18.0F);
          ((LinearLayout)localObject1).addView((View)localObject2);
          localObject3 = (LinearLayout.LayoutParams)((TextView)localObject2).getLayoutParams();
          ((LinearLayout.LayoutParams)localObject3).width = -2;
          ((LinearLayout.LayoutParams)localObject3).height = -2;
          ((LinearLayout.LayoutParams)localObject3).gravity = 19;
          ((TextView)localObject2).setLayoutParams((ViewGroup.LayoutParams)localObject3);
          localObject2 = new ab(ar.this.l());
          ((ab)localObject2).setMinValue(1);
          ((ab)localObject2).setMaxValue(10);
          ((ab)localObject2).setValue(j / 60);
          ((LinearLayout)localObject1).addView((View)localObject2);
          localObject3 = (LinearLayout.LayoutParams)((ab)localObject2).getLayoutParams();
          ((LinearLayout.LayoutParams)localObject3).width = org.vidogram.messenger.a.a(50.0F);
          ((ab)localObject2).setLayoutParams((ViewGroup.LayoutParams)localObject3);
          localObject3 = new TextView(ar.this.l());
          ((TextView)localObject3).setText(r.a("SmartNotificationsMinutes", 2131231856));
          ((TextView)localObject3).setTextSize(1, 18.0F);
          ((LinearLayout)localObject1).addView((View)localObject3);
          localObject1 = (LinearLayout.LayoutParams)((TextView)localObject3).getLayoutParams();
          ((LinearLayout.LayoutParams)localObject1).width = -2;
          ((LinearLayout.LayoutParams)localObject1).height = -2;
          ((LinearLayout.LayoutParams)localObject1).gravity = 19;
          ((TextView)localObject3).setLayoutParams((ViewGroup.LayoutParams)localObject1);
          localObject1 = new AlertDialog.Builder(ar.this.l());
          ((AlertDialog.Builder)localObject1).setTitle(r.a("SmartNotifications", 2131231853));
          ((AlertDialog.Builder)localObject1).setView(paramAdapterView);
          ((AlertDialog.Builder)localObject1).setPositiveButton(r.a("OK", 2131231604), new DialogInterface.OnClickListener(paramView, (ab)localObject2)
          {
            public void onClick(DialogInterface paramDialogInterface, int paramInt)
            {
              paramDialogInterface = ApplicationLoader.a.getSharedPreferences("Notifications", 0);
              paramDialogInterface.edit().putInt("smart_max_count_" + ar.b(ar.this), this.a.getValue()).commit();
              paramDialogInterface.edit().putInt("smart_delay_" + ar.b(ar.this), this.b.getValue() * 60).commit();
              if (ar.c(ar.this) != null)
                ar.c(ar.this).invalidateViews();
            }
          });
          ((AlertDialog.Builder)localObject1).setNegativeButton(r.a("SmartNotificationsDisabled", 2131231854), new DialogInterface.OnClickListener()
          {
            public void onClick(DialogInterface paramDialogInterface, int paramInt)
            {
              ApplicationLoader.a.getSharedPreferences("Notifications", 0).edit().putInt("smart_max_count_" + ar.b(ar.this), 0).commit();
              if (ar.c(ar.this) != null)
                ar.c(ar.this).invalidateViews();
            }
          });
          ar.this.b(((AlertDialog.Builder)localObject1).create());
          return;
          label1761: paramAdapterView = null;
          continue;
          label1766: paramAdapterView = null;
        }
      }
    });
    return (View)this.b;
  }

  public void a(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if ((paramInt2 != -1) || (paramIntent == null))
      return;
    Uri localUri = (Uri)paramIntent.getParcelableExtra("android.intent.extra.ringtone.PICKED_URI");
    SharedPreferences.Editor localEditor = null;
    paramIntent = localEditor;
    Ringtone localRingtone;
    if (localUri != null)
    {
      localRingtone = RingtoneManager.getRingtone(ApplicationLoader.a, localUri);
      paramIntent = localEditor;
      if (localRingtone != null)
      {
        if (!localUri.equals(Settings.System.DEFAULT_NOTIFICATION_URI))
          break label183;
        paramIntent = r.a("SoundDefault", 2131231866);
        localRingtone.stop();
      }
    }
    localEditor = ApplicationLoader.a.getSharedPreferences("Notifications", 0).edit();
    if (paramInt1 == 12)
    {
      if (paramIntent == null)
        break label196;
      localEditor.putString("sound_" + this.j, paramIntent);
      localEditor.putString("sound_path_" + this.j, localUri.toString());
    }
    while (true)
    {
      localEditor.commit();
      this.i.invalidateViews();
      return;
      label183: paramIntent = localRingtone.getTitle(l());
      break;
      label196: localEditor.putString("sound_" + this.j, "NoSound");
      localEditor.putString("sound_path_" + this.j, "NoSound");
    }
  }

  public void a(int paramInt, Object[] paramArrayOfObject)
  {
    if (paramInt == y.w)
      this.i.invalidateViews();
  }

  public boolean f()
  {
    int i1 = this.q;
    this.q = (i1 + 1);
    this.k = i1;
    i1 = this.q;
    this.q = (i1 + 1);
    this.l = i1;
    i1 = this.q;
    this.q = (i1 + 1);
    this.m = i1;
    if (Build.VERSION.SDK_INT >= 21)
    {
      i1 = this.q;
      this.q = (i1 + 1);
      this.n = i1;
      if ((int)this.j >= 0)
        break label141;
      i1 = this.q;
      this.q = (i1 + 1);
    }
    label141: for (this.p = i1; ; this.p = 1)
    {
      i1 = this.q;
      this.q = (i1 + 1);
      this.o = i1;
      y.a().a(this, y.w);
      return super.f();
      this.n = -1;
      break;
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
      return true;
    }

    public int getCount()
    {
      return ar.i(ar.this);
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
      if ((paramInt == ar.d(ar.this)) || (paramInt == ar.a(ar.this)) || (paramInt == ar.e(ar.this)) || (paramInt == ar.g(ar.this)) || (paramInt == ar.h(ar.this)));
      do
        return 0;
      while (paramInt != ar.f(ar.this));
      return 1;
    }

    public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      int i = getItemViewType(paramInt);
      if (i == 0)
        if (paramView != null)
          break label1158;
      label1158: for (paramViewGroup = new bd(this.b); ; paramViewGroup = paramView)
      {
        bd localbd = (bd)paramViewGroup;
        paramView = this.b.getSharedPreferences("Notifications", 0);
        if (paramInt == ar.a(ar.this))
        {
          paramInt = paramView.getInt("vibrate_" + ar.b(ar.this), 0);
          if (paramInt == 0)
            localbd.a(r.a("Vibrate", 2131231942), r.a("SettingsDefault", 2131231831), true);
        }
        do
          while (true)
          {
            return paramViewGroup;
            if (paramInt == 1)
            {
              localbd.a(r.a("Vibrate", 2131231942), r.a("Short", 2131231848), true);
              return paramViewGroup;
            }
            if (paramInt == 2)
            {
              localbd.a(r.a("Vibrate", 2131231942), r.a("VibrationDisabled", 2131231944), true);
              return paramViewGroup;
            }
            if (paramInt == 3)
            {
              localbd.a(r.a("Vibrate", 2131231942), r.a("Long", 2131231407), true);
              return paramViewGroup;
            }
            if (paramInt != 4)
              continue;
            localbd.a(r.a("Vibrate", 2131231942), r.a("SystemDefault", 2131231883), true);
            return paramViewGroup;
            if (paramInt == ar.d(ar.this))
            {
              paramInt = paramView.getInt("notify2_" + ar.b(ar.this), 0);
              if (paramInt == 0)
              {
                localbd.a(r.a("Notifications", 2131231590), r.a("Default", 2131231116), true);
                return paramViewGroup;
              }
              if (paramInt == 1)
              {
                localbd.a(r.a("Notifications", 2131231590), r.a("Enabled", 2131231162), true);
                return paramViewGroup;
              }
              if (paramInt == 2)
              {
                localbd.a(r.a("Notifications", 2131231590), r.a("NotificationsDisabled", 2131231592), true);
                return paramViewGroup;
              }
              if (paramInt != 3)
                continue;
              paramInt = paramView.getInt("notifyuntil_" + ar.b(ar.this), 0) - ConnectionsManager.a().b();
              if (paramInt <= 0)
                paramView = r.a("Enabled", 2131231162);
              while (paramView != null)
              {
                localbd.a(r.a("Notifications", 2131231590), paramView, true);
                return paramViewGroup;
                if (paramInt < 3600)
                {
                  paramView = r.a("WillUnmuteIn", 2131231963, new Object[] { r.b("Minutes", paramInt / 60) });
                  continue;
                }
                if (paramInt < 86400)
                {
                  paramView = r.a("WillUnmuteIn", 2131231963, new Object[] { r.b("Hours", (int)Math.ceil(paramInt / 60.0F / 60.0F)) });
                  continue;
                }
                if (paramInt < 31536000)
                {
                  paramView = r.a("WillUnmuteIn", 2131231963, new Object[] { r.b("Days", (int)Math.ceil(paramInt / 60.0F / 60.0F / 24.0F)) });
                  continue;
                }
                paramView = null;
              }
              localbd.a(r.a("Notifications", 2131231590), r.a("NotificationsDisabled", 2131231592), true);
              return paramViewGroup;
            }
            if (paramInt == ar.e(ar.this))
            {
              localObject = paramView.getString("sound_" + ar.b(ar.this), r.a("SoundDefault", 2131231866));
              paramView = (View)localObject;
              if (((String)localObject).equals("NoSound"))
                paramView = r.a("NoSound", 2131231516);
              localbd.a(r.a("Sound", 2131231865), paramView, true);
              return paramViewGroup;
            }
            if (paramInt != ar.g(ar.this))
              break;
            paramInt = paramView.getInt("priority_" + ar.b(ar.this), 3);
            if (paramInt == 0)
            {
              localbd.a(r.a("NotificationsPriority", 2131231594), r.a("NotificationsPriorityDefault", 2131231595), true);
              return paramViewGroup;
            }
            if (paramInt == 1)
            {
              localbd.a(r.a("NotificationsPriority", 2131231594), r.a("NotificationsPriorityHigh", 2131231596), true);
              return paramViewGroup;
            }
            if (paramInt == 2)
            {
              localbd.a(r.a("NotificationsPriority", 2131231594), r.a("NotificationsPriorityMax", 2131231598), true);
              return paramViewGroup;
            }
            if (paramInt != 3)
              continue;
            localbd.a(r.a("NotificationsPriority", 2131231594), r.a("SettingsDefault", 2131231831), true);
            return paramViewGroup;
          }
        while (paramInt != ar.h(ar.this));
        paramInt = paramView.getInt("smart_max_count_" + ar.b(ar.this), 2);
        i = paramView.getInt("smart_delay_" + ar.b(ar.this), 180);
        if (paramInt == 0)
        {
          localbd.a(r.a("SmartNotifications", 2131231853), r.a("SmartNotificationsDisabled", 2131231854), true);
          return paramViewGroup;
        }
        paramView = r.b("Times", paramInt);
        Object localObject = r.b("Minutes", i / 60);
        localbd.a(r.a("SmartNotifications", 2131231853), r.a("SmartNotificationsInfo", 2131231855, new Object[] { paramView, localObject }), true);
        return paramViewGroup;
        if (i == 1)
        {
          if (paramView == null)
            paramView = new bb(this.b);
          while (true)
          {
            paramViewGroup = (bb)paramView;
            localObject = ApplicationLoader.a.getSharedPreferences("Notifications", 0);
            if (((SharedPreferences)localObject).contains("color_" + ar.b(ar.this)))
            {
              paramViewGroup.a(r.a("LedColor", 2131231379), ((SharedPreferences)localObject).getInt("color_" + ar.b(ar.this), -16711936), false);
              return paramView;
            }
            if ((int)ar.b(ar.this) < 0)
            {
              paramViewGroup.a(r.a("LedColor", 2131231379), ((SharedPreferences)localObject).getInt("GroupLed", -16711936), false);
              return paramView;
            }
            paramViewGroup.a(r.a("LedColor", 2131231379), ((SharedPreferences)localObject).getInt("MessagesLed", -16711936), false);
            return paramView;
          }
        }
        return paramView;
      }
    }

    public int getViewTypeCount()
    {
      return 2;
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
      return true;
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.ar
 * JD-Core Version:    0.6.0
 */