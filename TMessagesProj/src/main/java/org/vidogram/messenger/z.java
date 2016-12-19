package org.vidogram.messenger;

import android.annotation.SuppressLint;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.media.AudioManager;
import android.media.SoundPool;
import android.media.SoundPool.OnLoadCompleteListener;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.os.SystemClock;
import android.provider.Settings.System;
import android.support.v4.app.ag.a;
import android.support.v4.app.ag.a.a;
import android.support.v4.app.ag.c;
import android.support.v4.app.ag.d;
import android.support.v4.app.ag.f;
import android.support.v4.app.ag.f.a.a;
import android.support.v4.app.ag.g;
import android.support.v4.app.ag.h;
import android.support.v4.app.ag.i;
import android.support.v4.app.ag.t;
import android.support.v4.app.ap;
import android.support.v4.app.aq;
import android.support.v4.app.aq.a;
import android.text.TextUtils;
import android.util.SparseArray;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import org.vidogram.tgnet.ConnectionsManager;
import org.vidogram.tgnet.c;
import org.vidogram.tgnet.f;
import org.vidogram.tgnet.g.ar;
import org.vidogram.tgnet.g.as;
import org.vidogram.tgnet.g.au;
import org.vidogram.tgnet.g.aw;
import org.vidogram.tgnet.g.cd;
import org.vidogram.tgnet.g.i;
import org.vidogram.tgnet.g.jb;
import org.vidogram.tgnet.g.kv;
import org.vidogram.tgnet.g.kz;
import org.vidogram.tgnet.g.m;
import org.vidogram.tgnet.g.mh;
import org.vidogram.tgnet.g.mi;
import org.vidogram.tgnet.g.mj;
import org.vidogram.tgnet.g.ml;
import org.vidogram.tgnet.g.mm;
import org.vidogram.tgnet.g.mn;
import org.vidogram.tgnet.g.mo;
import org.vidogram.tgnet.g.mp;
import org.vidogram.tgnet.g.mq;
import org.vidogram.tgnet.g.mr;
import org.vidogram.tgnet.g.mt;
import org.vidogram.tgnet.g.mu;
import org.vidogram.tgnet.g.my;
import org.vidogram.tgnet.g.mz;
import org.vidogram.tgnet.g.nb;
import org.vidogram.tgnet.g.nc;
import org.vidogram.tgnet.g.nv;
import org.vidogram.tgnet.g.nw;
import org.vidogram.tgnet.g.nz;
import org.vidogram.tgnet.g.oa;
import org.vidogram.tgnet.g.ob;
import org.vidogram.tgnet.g.of;
import org.vidogram.tgnet.g.oj;
import org.vidogram.tgnet.g.t;
import org.vidogram.tgnet.g.vw;
import org.vidogram.tgnet.g.vx;
import org.vidogram.tgnet.g.x;
import org.vidogram.ui.LaunchActivity;
import org.vidogram.ui.PopupNotificationActivity;

public class z
{
  private static volatile z B = null;
  private AlarmManager A;
  public ArrayList<u> a = new ArrayList();
  public ArrayList<u> b = new ArrayList();
  protected AudioManager c;
  private h d = new h("notificationsQueue");
  private ArrayList<u> e = new ArrayList();
  private ArrayList<u> f = new ArrayList();
  private HashMap<Long, u> g = new HashMap();
  private HashMap<Long, Point> h = new HashMap();
  private ap i = null;
  private HashMap<Long, Integer> j = new HashMap();
  private HashMap<Long, Integer> k = new HashMap();
  private HashMap<Long, Integer> l = new HashMap();
  private long m = 0L;
  private int n = 0;
  private int o = 0;
  private boolean p = false;
  private int q = 0;
  private boolean r = true;
  private int s;
  private String t;
  private Runnable u;
  private PowerManager.WakeLock v;
  private long w;
  private SoundPool x;
  private int y;
  private boolean z;

  public z()
  {
    try
    {
      this.c = ((AudioManager)ApplicationLoader.a.getSystemService("audio"));
    }
    catch (Exception localException3)
    {
      try
      {
        this.A = ((AlarmManager)ApplicationLoader.a.getSystemService("alarm"));
      }
      catch (Exception localException3)
      {
        try
        {
          while (true)
          {
            this.v = ((PowerManager)ApplicationLoader.a.getSystemService("power")).newWakeLock(1, "lock");
            this.v.setReferenceCounted(false);
            this.u = new Runnable()
            {
              public void run()
              {
                n.a("tmessages", "delay reached");
                if (!z.a(z.this).isEmpty())
                {
                  z.a(z.this, true);
                  z.a(z.this).clear();
                }
                try
                {
                  if (z.b(z.this).isHeld())
                    z.b(z.this).release();
                  return;
                }
                catch (Exception localException)
                {
                  n.a("tmessages", localException);
                }
              }
            };
            return;
            localException1 = localException1;
            n.a("tmessages", localException1);
            continue;
            localException2 = localException2;
            n.a("tmessages", localException2);
          }
        }
        catch (Exception localException3)
        {
          while (true)
            n.a("tmessages", localException3);
        }
      }
    }
  }

  private int a(SharedPreferences paramSharedPreferences, long paramLong)
  {
    int i2 = paramSharedPreferences.getInt("notify2_" + paramLong, 0);
    int i1 = i2;
    if (i2 == 3)
    {
      i1 = i2;
      if (paramSharedPreferences.getInt("notifyuntil_" + paramLong, 0) >= ConnectionsManager.a().b())
        i1 = 2;
    }
    return i1;
  }

  private String a(u paramu, boolean paramBoolean)
  {
    long l1 = paramu.a.E;
    int i2;
    int i1;
    if (paramu.a.d.d != 0)
    {
      i2 = paramu.a.d.d;
      i1 = paramu.a.d.c;
      if (i1 != 0)
        break label149;
      if ((!paramu.l()) && (paramu.q() >= 0))
        break label142;
      i1 = paramu.a.c;
    }
    label142: label149: label6556: label6559: 
    while (true)
    {
      label71: if (l1 == 0L)
        if (i2 != 0)
          l1 = -i2;
      while (true)
      {
        label89: Object localObject1 = null;
        Object localObject2;
        if (i1 > 0)
        {
          localObject2 = v.a().a(Integer.valueOf(i1));
          if (localObject2 != null)
            localObject1 = ae.c((g.vw)localObject2);
        }
        while (true)
        {
          if (localObject1 == null)
          {
            return null;
            i2 = paramu.a.d.b;
            break;
            i1 = -i2;
            break label71;
            if (i1 != ad.c())
              break label6559;
            i1 = paramu.a.c;
            break label71;
            if (i1 == 0)
              break label6556;
            l1 = i1;
            break label89;
            localObject1 = v.a().b(Integer.valueOf(-i1));
            if (localObject1 != null)
            {
              localObject1 = ((g.i)localObject1).i;
              continue;
            }
          }
          else
          {
            if (i2 != 0)
            {
              localObject2 = v.a().b(Integer.valueOf(i2));
              if (localObject2 == null)
                return null;
            }
            while (true)
            {
              if (((int)l1 == 0) || (a.c(false)) || (ad.o))
                return r.a("YouHaveNewMessage", 2131231977);
              if ((i2 == 0) && (i1 != 0))
              {
                if (ApplicationLoader.a.getSharedPreferences("Notifications", 0).getBoolean("EnablePreviewAll", true))
                {
                  if ((paramu.a instanceof g.oj))
                  {
                    if ((paramu.a.f instanceof g.nb))
                      return r.a("NotificationContactJoined", 2131231550, new Object[] { localObject1 });
                    if ((paramu.a.f instanceof g.nc))
                      return r.a("NotificationContactNewPhoto", 2131231551, new Object[] { localObject1 });
                    if ((paramu.a.f instanceof g.my))
                    {
                      localObject1 = r.a("formatDateAtTime", 2131231995, new Object[] { r.a().f.a(paramu.a.e * 1000L), r.a().c.a(paramu.a.e * 1000L) });
                      return r.a("NotificationUnrecognizedDevice", 2131231589, new Object[] { ad.d().e, localObject1, paramu.a.f.b, paramu.a.f.c });
                    }
                    if ((paramu.a.f instanceof g.mu))
                      return paramu.b.toString();
                  }
                  else
                  {
                    if (paramu.U())
                    {
                      if (!paramBoolean)
                      {
                        if ((paramu.a.i != null) && (paramu.a.i.length() != 0))
                          return r.a("NotificationMessageText", 2131231586, new Object[] { localObject1, paramu.a.i });
                        return r.a("NotificationMessageNoText", 2131231582, new Object[] { localObject1 });
                      }
                      return r.a("NotificationMessageNoText", 2131231582, new Object[] { localObject1 });
                    }
                    if ((paramu.a.j instanceof g.ob))
                    {
                      if ((!paramBoolean) && (Build.VERSION.SDK_INT >= 19) && (!TextUtils.isEmpty(paramu.a.j.l)))
                        return r.a("NotificationMessageText", 2131231586, new Object[] { localObject1, "🖼 " + paramu.a.j.l });
                      return r.a("NotificationMessagePhoto", 2131231583, new Object[] { localObject1 });
                    }
                    if (paramu.I())
                    {
                      if ((!paramBoolean) && (Build.VERSION.SDK_INT >= 19) && (!TextUtils.isEmpty(paramu.a.j.l)))
                        return r.a("NotificationMessageText", 2131231586, new Object[] { localObject1, "📹 " + paramu.a.j.l });
                      return r.a("NotificationMessageVideo", 2131231587, new Object[] { localObject1 });
                    }
                    if (paramu.J())
                      return r.a("NotificationMessageGame", 2131231565, new Object[] { localObject1, paramu.a.j.m.g });
                    if (paramu.H())
                      return r.a("NotificationMessageAudio", 2131231562, new Object[] { localObject1 });
                    if (paramu.G())
                      return r.a("NotificationMessageMusic", 2131231581, new Object[] { localObject1 });
                    if ((paramu.a.j instanceof g.nv))
                      return r.a("NotificationMessageContact", 2131231563, new Object[] { localObject1 });
                    if (((paramu.a.j instanceof g.oa)) || ((paramu.a.j instanceof g.of)))
                      return r.a("NotificationMessageMap", 2131231580, new Object[] { localObject1 });
                    if ((paramu.a.j instanceof g.nw))
                    {
                      if (paramu.E())
                      {
                        paramu = paramu.D();
                        if (paramu != null)
                          return r.a("NotificationMessageStickerEmoji", 2131231585, new Object[] { localObject1, paramu });
                        return r.a("NotificationMessageSticker", 2131231584, new Object[] { localObject1 });
                      }
                      if (paramu.L())
                      {
                        if ((!paramBoolean) && (Build.VERSION.SDK_INT >= 19) && (!TextUtils.isEmpty(paramu.a.j.l)))
                          return r.a("NotificationMessageText", 2131231586, new Object[] { localObject1, "🎬 " + paramu.a.j.l });
                        return r.a("NotificationMessageGif", 2131231566, new Object[] { localObject1 });
                      }
                      if ((!paramBoolean) && (Build.VERSION.SDK_INT >= 19) && (!TextUtils.isEmpty(paramu.a.j.l)))
                        return r.a("NotificationMessageText", 2131231586, new Object[] { localObject1, "📎 " + paramu.a.j.l });
                      return r.a("NotificationMessageDocument", 2131231564, new Object[] { localObject1 });
                    }
                  }
                }
                else
                  return r.a("NotificationMessageNoText", 2131231582, new Object[] { localObject1 });
              }
              else if (i2 != 0)
                if (ApplicationLoader.a.getSharedPreferences("Notifications", 0).getBoolean("EnablePreviewGroup", true))
                {
                  if ((paramu.a instanceof g.oj))
                  {
                    Object localObject3;
                    if ((paramu.a.f instanceof g.mj))
                    {
                      int i3 = paramu.a.f.i;
                      i2 = i3;
                      if (i3 == 0)
                      {
                        i2 = i3;
                        if (paramu.a.f.e.size() == 1)
                          i2 = ((Integer)paramu.a.f.e.get(0)).intValue();
                      }
                      if (i2 != 0)
                      {
                        if ((paramu.a.d.b != 0) && (!((g.i)localObject2).r))
                          return r.a("ChannelAddedByNotification", 2131230964, new Object[] { localObject1, ((g.i)localObject2).i });
                        if (i2 == ad.c())
                          return r.a("NotificationInvitedToGroup", 2131231560, new Object[] { localObject1, ((g.i)localObject2).i });
                        paramu = v.a().a(Integer.valueOf(i2));
                        if (paramu == null)
                          return null;
                        if (i1 == paramu.d)
                        {
                          if (((g.i)localObject2).r)
                            return r.a("NotificationGroupAddSelfMega", 2131231556, new Object[] { localObject1, ((g.i)localObject2).i });
                          return r.a("NotificationGroupAddSelf", 2131231555, new Object[] { localObject1, ((g.i)localObject2).i });
                        }
                        return r.a("NotificationGroupAddMember", 2131231554, new Object[] { localObject1, ((g.i)localObject2).i, ae.c(paramu) });
                      }
                      localObject3 = new StringBuilder("");
                      i1 = 0;
                      while (i1 < paramu.a.f.e.size())
                      {
                        Object localObject4 = v.a().a((Integer)paramu.a.f.e.get(i1));
                        if (localObject4 != null)
                        {
                          localObject4 = ae.c((g.vw)localObject4);
                          if (((StringBuilder)localObject3).length() != 0)
                            ((StringBuilder)localObject3).append(", ");
                          ((StringBuilder)localObject3).append((String)localObject4);
                        }
                        i1 += 1;
                      }
                      return r.a("NotificationGroupAddMember", 2131231554, new Object[] { localObject1, ((g.i)localObject2).i, ((StringBuilder)localObject3).toString() });
                    }
                    if ((paramu.a.f instanceof g.mq))
                      return r.a("NotificationInvitedToGroupByLink", 2131231561, new Object[] { localObject1, ((g.i)localObject2).i });
                    if ((paramu.a.f instanceof g.mp))
                      return r.a("NotificationEditedGroupName", 2131231552, new Object[] { localObject1, paramu.a.f.b });
                    if (((paramu.a.f instanceof g.mo)) || ((paramu.a.f instanceof g.mm)))
                    {
                      if ((paramu.a.d.b != 0) && (!((g.i)localObject2).r))
                        return r.a("ChannelPhotoEditNotification", 2131231021, new Object[] { ((g.i)localObject2).i });
                      return r.a("NotificationEditedGroupPhoto", 2131231553, new Object[] { localObject1, ((g.i)localObject2).i });
                    }
                    if ((paramu.a.f instanceof g.mn))
                    {
                      if (paramu.a.f.i == ad.c())
                        return r.a("NotificationGroupKickYou", 2131231558, new Object[] { localObject1, ((g.i)localObject2).i });
                      if (paramu.a.f.i == i1)
                        return r.a("NotificationGroupLeftMember", 2131231559, new Object[] { localObject1, ((g.i)localObject2).i });
                      paramu = v.a().a(Integer.valueOf(paramu.a.f.i));
                      if (paramu == null)
                        return null;
                      return r.a("NotificationGroupKickMember", 2131231557, new Object[] { localObject1, ((g.i)localObject2).i, ae.c(paramu) });
                    }
                    if ((paramu.a.f instanceof g.ml))
                      return paramu.b.toString();
                    if ((paramu.a.f instanceof g.mh))
                      return paramu.b.toString();
                    if ((paramu.a.f instanceof g.mr))
                      return r.a("ActionMigrateFromGroupNotify", 2131230784, new Object[] { ((g.i)localObject2).i });
                    if ((paramu.a.f instanceof g.mi))
                      return r.a("ActionMigrateFromGroupNotify", 2131230784, new Object[] { paramu.a.f.b });
                    if ((paramu.a.f instanceof g.mz))
                    {
                      if (paramu.e == null)
                      {
                        if ((!e.d((g.i)localObject2)) || (((g.i)localObject2).r))
                          return r.a("NotificationActionPinnedNoText", 2131231536, new Object[] { localObject1, ((g.i)localObject2).i });
                        return r.a("NotificationActionPinnedNoTextChannel", 2131231537, new Object[] { localObject1, ((g.i)localObject2).i });
                      }
                      localObject3 = paramu.e;
                      if (((u)localObject3).G())
                      {
                        if ((!e.d((g.i)localObject2)) || (((g.i)localObject2).r))
                          return r.a("NotificationActionPinnedMusic", 2131231534, new Object[] { localObject1, ((g.i)localObject2).i });
                        return r.a("NotificationActionPinnedMusicChannel", 2131231535, new Object[] { ((g.i)localObject2).i });
                      }
                      if (((u)localObject3).I())
                      {
                        if ((Build.VERSION.SDK_INT >= 19) && (!TextUtils.isEmpty(((u)localObject3).a.j.l)))
                        {
                          paramu = "📹 " + ((u)localObject3).a.j.l;
                          if ((!e.d((g.i)localObject2)) || (((g.i)localObject2).r))
                            return r.a("NotificationActionPinnedText", 2131231544, new Object[] { localObject1, paramu, ((g.i)localObject2).i });
                          return r.a("NotificationActionPinnedTextChannel", 2131231545, new Object[] { ((g.i)localObject2).i, paramu });
                        }
                        if ((!e.d((g.i)localObject2)) || (((g.i)localObject2).r))
                          return r.a("NotificationActionPinnedVideo", 2131231546, new Object[] { localObject1, ((g.i)localObject2).i });
                        return r.a("NotificationActionPinnedVideoChannel", 2131231547, new Object[] { ((g.i)localObject2).i });
                      }
                      if (((u)localObject3).L())
                      {
                        if ((Build.VERSION.SDK_INT >= 19) && (!TextUtils.isEmpty(((u)localObject3).a.j.l)))
                        {
                          paramu = "🎬 " + ((u)localObject3).a.j.l;
                          if ((!e.d((g.i)localObject2)) || (((g.i)localObject2).r))
                            return r.a("NotificationActionPinnedText", 2131231544, new Object[] { localObject1, paramu, ((g.i)localObject2).i });
                          return r.a("NotificationActionPinnedTextChannel", 2131231545, new Object[] { ((g.i)localObject2).i, paramu });
                        }
                        if ((!e.d((g.i)localObject2)) || (((g.i)localObject2).r))
                          return r.a("NotificationActionPinnedGif", 2131231532, new Object[] { localObject1, ((g.i)localObject2).i });
                        return r.a("NotificationActionPinnedGifChannel", 2131231533, new Object[] { ((g.i)localObject2).i });
                      }
                      if (((u)localObject3).H())
                      {
                        if ((!e.d((g.i)localObject2)) || (((g.i)localObject2).r))
                          return r.a("NotificationActionPinnedVoice", 2131231548, new Object[] { localObject1, ((g.i)localObject2).i });
                        return r.a("NotificationActionPinnedVoiceChannel", 2131231549, new Object[] { ((g.i)localObject2).i });
                      }
                      if (((u)localObject3).E())
                      {
                        paramu = paramu.D();
                        if (paramu != null)
                        {
                          if ((!e.d((g.i)localObject2)) || (((g.i)localObject2).r))
                            return r.a("NotificationActionPinnedStickerEmoji", 2131231542, new Object[] { localObject1, ((g.i)localObject2).i, paramu });
                          return r.a("NotificationActionPinnedStickerEmojiChannel", 2131231543, new Object[] { ((g.i)localObject2).i, paramu });
                        }
                        if ((!e.d((g.i)localObject2)) || (((g.i)localObject2).r))
                          return r.a("NotificationActionPinnedSticker", 2131231540, new Object[] { localObject1, ((g.i)localObject2).i });
                        return r.a("NotificationActionPinnedStickerChannel", 2131231541, new Object[] { ((g.i)localObject2).i });
                      }
                      if ((((u)localObject3).a.j instanceof g.nw))
                      {
                        if ((Build.VERSION.SDK_INT >= 19) && (!TextUtils.isEmpty(((u)localObject3).a.j.l)))
                        {
                          paramu = "📎 " + ((u)localObject3).a.j.l;
                          if ((!e.d((g.i)localObject2)) || (((g.i)localObject2).r))
                            return r.a("NotificationActionPinnedText", 2131231544, new Object[] { localObject1, paramu, ((g.i)localObject2).i });
                          return r.a("NotificationActionPinnedTextChannel", 2131231545, new Object[] { ((g.i)localObject2).i, paramu });
                        }
                        if ((!e.d((g.i)localObject2)) || (((g.i)localObject2).r))
                          return r.a("NotificationActionPinnedFile", 2131231526, new Object[] { localObject1, ((g.i)localObject2).i });
                        return r.a("NotificationActionPinnedFileChannel", 2131231527, new Object[] { ((g.i)localObject2).i });
                      }
                      if ((((u)localObject3).a.j instanceof g.oa))
                      {
                        if ((!e.d((g.i)localObject2)) || (((g.i)localObject2).r))
                          return r.a("NotificationActionPinnedGeo", 2131231530, new Object[] { localObject1, ((g.i)localObject2).i });
                        return r.a("NotificationActionPinnedGeoChannel", 2131231531, new Object[] { ((g.i)localObject2).i });
                      }
                      if ((((u)localObject3).a.j instanceof g.nv))
                      {
                        if ((!e.d((g.i)localObject2)) || (((g.i)localObject2).r))
                          return r.a("NotificationActionPinnedContact", 2131231524, new Object[] { localObject1, ((g.i)localObject2).i });
                        return r.a("NotificationActionPinnedContactChannel", 2131231525, new Object[] { ((g.i)localObject2).i });
                      }
                      if ((((u)localObject3).a.j instanceof g.ob))
                      {
                        if ((Build.VERSION.SDK_INT >= 19) && (!TextUtils.isEmpty(((u)localObject3).a.j.l)))
                        {
                          paramu = "🖼 " + ((u)localObject3).a.j.l;
                          if ((!e.d((g.i)localObject2)) || (((g.i)localObject2).r))
                            return r.a("NotificationActionPinnedText", 2131231544, new Object[] { localObject1, paramu, ((g.i)localObject2).i });
                          return r.a("NotificationActionPinnedTextChannel", 2131231545, new Object[] { ((g.i)localObject2).i, paramu });
                        }
                        if ((!e.d((g.i)localObject2)) || (((g.i)localObject2).r))
                          return r.a("NotificationActionPinnedPhoto", 2131231538, new Object[] { localObject1, ((g.i)localObject2).i });
                        return r.a("NotificationActionPinnedPhotoChannel", 2131231539, new Object[] { ((g.i)localObject2).i });
                      }
                      if ((((u)localObject3).a.j instanceof g.nz))
                      {
                        if ((!e.d((g.i)localObject2)) || (((g.i)localObject2).r))
                          return r.a("NotificationActionPinnedGame", 2131231528, new Object[] { localObject1, ((g.i)localObject2).i });
                        return r.a("NotificationActionPinnedGameChannel", 2131231529, new Object[] { ((g.i)localObject2).i });
                      }
                      if ((((u)localObject3).b != null) && (((u)localObject3).b.length() > 0))
                      {
                        localObject3 = ((u)localObject3).b;
                        paramu = (u)localObject3;
                        if (((CharSequence)localObject3).length() > 20)
                          paramu = ((CharSequence)localObject3).subSequence(0, 20) + "...";
                        if ((!e.d((g.i)localObject2)) || (((g.i)localObject2).r))
                          return r.a("NotificationActionPinnedText", 2131231544, new Object[] { localObject1, paramu, ((g.i)localObject2).i });
                        return r.a("NotificationActionPinnedTextChannel", 2131231545, new Object[] { ((g.i)localObject2).i, paramu });
                      }
                      if ((!e.d((g.i)localObject2)) || (((g.i)localObject2).r))
                        return r.a("NotificationActionPinnedNoText", 2131231536, new Object[] { localObject1, ((g.i)localObject2).i });
                      return r.a("NotificationActionPinnedNoTextChannel", 2131231537, new Object[] { ((g.i)localObject2).i });
                    }
                    if ((paramu.a.f instanceof g.mu))
                      return paramu.b.toString();
                  }
                  else if ((e.d((g.i)localObject2)) && (!((g.i)localObject2).r))
                  {
                    if (paramu.a.v)
                    {
                      if (paramu.U())
                      {
                        if ((!paramBoolean) && (paramu.a.i != null) && (paramu.a.i.length() != 0))
                          return r.a("NotificationMessageGroupText", 2131231578, new Object[] { localObject1, ((g.i)localObject2).i, paramu.a.i });
                        return r.a("ChannelMessageNoText", 2131231012, new Object[] { localObject1, ((g.i)localObject2).i });
                      }
                      if ((paramu.a.j instanceof g.ob))
                      {
                        if ((!paramBoolean) && (Build.VERSION.SDK_INT >= 19) && (!TextUtils.isEmpty(paramu.a.j.l)))
                          return r.a("NotificationMessageGroupText", 2131231578, new Object[] { localObject1, ((g.i)localObject2).i, "🖼 " + paramu.a.j.l });
                        return r.a("ChannelMessagePhoto", 2131231013, new Object[] { localObject1, ((g.i)localObject2).i });
                      }
                      if (paramu.I())
                      {
                        if ((!paramBoolean) && (Build.VERSION.SDK_INT >= 19) && (!TextUtils.isEmpty(paramu.a.j.l)))
                          return r.a("NotificationMessageGroupText", 2131231578, new Object[] { localObject1, ((g.i)localObject2).i, "📹 " + paramu.a.j.l });
                        return r.a("ChannelMessageVideo", 2131231016, new Object[] { localObject1, ((g.i)localObject2).i });
                      }
                      if (paramu.H())
                        return r.a("ChannelMessageAudio", 2131230995, new Object[] { localObject1, ((g.i)localObject2).i });
                      if (paramu.G())
                        return r.a("ChannelMessageMusic", 2131231011, new Object[] { localObject1, ((g.i)localObject2).i });
                      if ((paramu.a.j instanceof g.nv))
                        return r.a("ChannelMessageContact", 2131230996, new Object[] { localObject1, ((g.i)localObject2).i });
                      if (((paramu.a.j instanceof g.oa)) || ((paramu.a.j instanceof g.of)))
                        return r.a("ChannelMessageMap", 2131231010, new Object[] { localObject1, ((g.i)localObject2).i });
                      if ((paramu.a.j instanceof g.nw))
                      {
                        if (paramu.E())
                        {
                          paramu = paramu.D();
                          if (paramu != null)
                            return r.a("ChannelMessageStickerEmoji", 2131231015, new Object[] { localObject1, ((g.i)localObject2).i, paramu });
                          return r.a("ChannelMessageSticker", 2131231014, new Object[] { localObject1, ((g.i)localObject2).i });
                        }
                        if (paramu.L())
                        {
                          if ((!paramBoolean) && (Build.VERSION.SDK_INT >= 19) && (!TextUtils.isEmpty(paramu.a.j.l)))
                            return r.a("NotificationMessageGroupText", 2131231578, new Object[] { localObject1, ((g.i)localObject2).i, "🎬 " + paramu.a.j.l });
                          return r.a("ChannelMessageGIF", 2131230998, new Object[] { localObject1, ((g.i)localObject2).i });
                        }
                        if ((!paramBoolean) && (Build.VERSION.SDK_INT >= 19) && (!TextUtils.isEmpty(paramu.a.j.l)))
                          return r.a("NotificationMessageGroupText", 2131231578, new Object[] { localObject1, ((g.i)localObject2).i, "📎 " + paramu.a.j.l });
                        return r.a("ChannelMessageDocument", 2131230997, new Object[] { localObject1, ((g.i)localObject2).i });
                      }
                    }
                    else
                    {
                      if (paramu.U())
                      {
                        if ((!paramBoolean) && (paramu.a.i != null) && (paramu.a.i.length() != 0))
                          return r.a("NotificationMessageGroupText", 2131231578, new Object[] { localObject1, ((g.i)localObject2).i, paramu.a.i });
                        return r.a("ChannelMessageGroupNoText", 2131231005, new Object[] { localObject1, ((g.i)localObject2).i });
                      }
                      if ((paramu.a.j instanceof g.ob))
                      {
                        if ((!paramBoolean) && (Build.VERSION.SDK_INT >= 19) && (!TextUtils.isEmpty(paramu.a.j.l)))
                          return r.a("NotificationMessageGroupText", 2131231578, new Object[] { localObject1, ((g.i)localObject2).i, "🖼 " + paramu.a.j.l });
                        return r.a("ChannelMessageGroupPhoto", 2131231006, new Object[] { localObject1, ((g.i)localObject2).i });
                      }
                      if (paramu.I())
                      {
                        if ((!paramBoolean) && (Build.VERSION.SDK_INT >= 19) && (!TextUtils.isEmpty(paramu.a.j.l)))
                          return r.a("NotificationMessageGroupText", 2131231578, new Object[] { localObject1, ((g.i)localObject2).i, "📹 " + paramu.a.j.l });
                        return r.a("ChannelMessageGroupVideo", 2131231009, new Object[] { localObject1, ((g.i)localObject2).i });
                      }
                      if (paramu.H())
                        return r.a("ChannelMessageGroupAudio", 2131230999, new Object[] { localObject1, ((g.i)localObject2).i });
                      if (paramu.G())
                        return r.a("ChannelMessageGroupMusic", 2131231004, new Object[] { localObject1, ((g.i)localObject2).i });
                      if ((paramu.a.j instanceof g.nv))
                        return r.a("ChannelMessageGroupContact", 2131231000, new Object[] { localObject1, ((g.i)localObject2).i });
                      if (((paramu.a.j instanceof g.oa)) || ((paramu.a.j instanceof g.of)))
                        return r.a("ChannelMessageGroupMap", 2131231003, new Object[] { localObject1, ((g.i)localObject2).i });
                      if ((paramu.a.j instanceof g.nw))
                      {
                        if (paramu.E())
                        {
                          paramu = paramu.D();
                          if (paramu != null)
                            return r.a("ChannelMessageGroupStickerEmoji", 2131231008, new Object[] { localObject1, ((g.i)localObject2).i, paramu });
                          return r.a("ChannelMessageGroupSticker", 2131231007, new Object[] { localObject1, ((g.i)localObject2).i });
                        }
                        if (paramu.L())
                        {
                          if ((!paramBoolean) && (Build.VERSION.SDK_INT >= 19) && (!TextUtils.isEmpty(paramu.a.j.l)))
                            return r.a("NotificationMessageGroupText", 2131231578, new Object[] { localObject1, ((g.i)localObject2).i, "🎬 " + paramu.a.j.l });
                          return r.a("ChannelMessageGroupGif", 2131231002, new Object[] { localObject1, ((g.i)localObject2).i });
                        }
                        if ((!paramBoolean) && (Build.VERSION.SDK_INT >= 19) && (!TextUtils.isEmpty(paramu.a.j.l)))
                          return r.a("NotificationMessageGroupText", 2131231578, new Object[] { localObject1, ((g.i)localObject2).i, "📎 " + paramu.a.j.l });
                        return r.a("ChannelMessageGroupDocument", 2131231001, new Object[] { localObject1, ((g.i)localObject2).i });
                      }
                    }
                  }
                  else
                  {
                    if (paramu.U())
                    {
                      if ((!paramBoolean) && (paramu.a.i != null) && (paramu.a.i.length() != 0))
                        return r.a("NotificationMessageGroupText", 2131231578, new Object[] { localObject1, ((g.i)localObject2).i, paramu.a.i });
                      return r.a("NotificationMessageGroupNoText", 2131231574, new Object[] { localObject1, ((g.i)localObject2).i });
                    }
                    if ((paramu.a.j instanceof g.ob))
                    {
                      if ((!paramBoolean) && (Build.VERSION.SDK_INT >= 19) && (!TextUtils.isEmpty(paramu.a.j.l)))
                        return r.a("NotificationMessageGroupText", 2131231578, new Object[] { localObject1, ((g.i)localObject2).i, "🖼 " + paramu.a.j.l });
                      return r.a("NotificationMessageGroupPhoto", 2131231575, new Object[] { localObject1, ((g.i)localObject2).i });
                    }
                    if (paramu.I())
                    {
                      if ((!paramBoolean) && (Build.VERSION.SDK_INT >= 19) && (!TextUtils.isEmpty(paramu.a.j.l)))
                        return r.a("NotificationMessageGroupText", 2131231578, new Object[] { localObject1, ((g.i)localObject2).i, "📹 " + paramu.a.j.l });
                      return r.a("NotificationMessageGroupVideo", 2131231579, new Object[] { localObject1, ((g.i)localObject2).i });
                    }
                    if (paramu.H())
                      return r.a("NotificationMessageGroupAudio", 2131231567, new Object[] { localObject1, ((g.i)localObject2).i });
                    if (paramu.G())
                      return r.a("NotificationMessageGroupMusic", 2131231573, new Object[] { localObject1, ((g.i)localObject2).i });
                    if ((paramu.a.j instanceof g.nv))
                      return r.a("NotificationMessageGroupContact", 2131231568, new Object[] { localObject1, ((g.i)localObject2).i });
                    if ((paramu.a.j instanceof g.nz))
                      return r.a("NotificationMessageGroupGame", 2131231570, new Object[] { localObject1, ((g.i)localObject2).i, paramu.a.j.m.g });
                    if (((paramu.a.j instanceof g.oa)) || ((paramu.a.j instanceof g.of)))
                      return r.a("NotificationMessageGroupMap", 2131231572, new Object[] { localObject1, ((g.i)localObject2).i });
                    if ((paramu.a.j instanceof g.nw))
                    {
                      if (paramu.E())
                      {
                        paramu = paramu.D();
                        if (paramu != null)
                          return r.a("NotificationMessageGroupStickerEmoji", 2131231577, new Object[] { localObject1, ((g.i)localObject2).i, paramu });
                        return r.a("NotificationMessageGroupSticker", 2131231576, new Object[] { localObject1, ((g.i)localObject2).i });
                      }
                      if (paramu.L())
                      {
                        if ((!paramBoolean) && (Build.VERSION.SDK_INT >= 19) && (!TextUtils.isEmpty(paramu.a.j.l)))
                          return r.a("NotificationMessageGroupText", 2131231578, new Object[] { localObject1, ((g.i)localObject2).i, "🎬 " + paramu.a.j.l });
                        return r.a("NotificationMessageGroupGif", 2131231571, new Object[] { localObject1, ((g.i)localObject2).i });
                      }
                      if ((!paramBoolean) && (Build.VERSION.SDK_INT >= 19) && (!TextUtils.isEmpty(paramu.a.j.l)))
                        return r.a("NotificationMessageGroupText", 2131231578, new Object[] { localObject1, ((g.i)localObject2).i, "📎 " + paramu.a.j.l });
                      return r.a("NotificationMessageGroupDocument", 2131231569, new Object[] { localObject1, ((g.i)localObject2).i });
                    }
                  }
                }
                else
                {
                  if ((e.d((g.i)localObject2)) && (!((g.i)localObject2).r))
                    return r.a("ChannelMessageNoText", 2131231012, new Object[] { localObject1, ((g.i)localObject2).i });
                  return r.a("NotificationMessageGroupNoText", 2131231574, new Object[] { localObject1, ((g.i)localObject2).i });
                }
              return null;
              localObject2 = null;
            }
          }
          localObject1 = null;
        }
      }
    }
  }

  public static z a()
  {
    Object localObject1 = B;
    if (localObject1 == null)
    {
      monitorenter;
      try
      {
        z localz = B;
        localObject1 = localz;
        if (localz == null)
        {
          localObject1 = new z();
          B = (z)localObject1;
        }
        return localObject1;
      }
      finally
      {
        monitorexit;
      }
    }
    return (z)localObject2;
  }

  private void a(int paramInt)
  {
    this.d.b(new Runnable(paramInt)
    {
      public void run()
      {
        if (z.o(z.this) == this.a);
        while (true)
        {
          return;
          z.c(z.this, this.a);
          try
          {
            ContentValues localContentValues = new ContentValues();
            localContentValues.put("tag", "org.vidogram.messenger/org.vidogram.ui.LaunchActivity");
            localContentValues.put("count", Integer.valueOf(this.a));
            ApplicationLoader.a.getContentResolver().insert(Uri.parse("content://com.teslacoilsw.notifier/unread_count"), localContentValues);
            try
            {
              label72: if (z.p(z.this) == null)
                z.a(z.this, z.a(ApplicationLoader.a));
              if (z.p(z.this) == null)
                continue;
              a.a(new Runnable()
              {
                public void run()
                {
                  try
                  {
                    Intent localIntent = new Intent("android.intent.action.BADGE_COUNT_UPDATE");
                    localIntent.putExtra("badge_count", z.3.this.a);
                    localIntent.putExtra("badge_count_package_name", ApplicationLoader.a.getPackageName());
                    localIntent.putExtra("badge_count_class_name", z.p(z.this));
                    ApplicationLoader.a.sendBroadcast(localIntent);
                    return;
                  }
                  catch (Exception localException)
                  {
                    n.a("tmessages", localException);
                  }
                }
              });
              return;
            }
            catch (Throwable localThrowable1)
            {
              n.a("tmessages", localThrowable1);
              return;
            }
          }
          catch (Throwable localThrowable2)
          {
            break label72;
          }
        }
      }
    });
  }

  @SuppressLint({"InlinedApi"})
  private void a(ag.d paramd, boolean paramBoolean)
  {
    if (Build.VERSION.SDK_INT < 18)
      return;
    ArrayList localArrayList1 = new ArrayList();
    HashMap localHashMap1 = new HashMap();
    int i1 = 0;
    Object localObject2;
    long l1;
    Object localObject1;
    if (i1 < this.e.size())
    {
      localObject2 = (u)this.e.get(i1);
      l1 = ((u)localObject2).u();
      if ((int)l1 == 0);
      while (true)
      {
        i1 += 1;
        break;
        localObject1 = (ArrayList)localHashMap1.get(Long.valueOf(l1));
        paramd = (ag.d)localObject1;
        if (localObject1 == null)
        {
          paramd = new ArrayList();
          localHashMap1.put(Long.valueOf(l1), paramd);
          localArrayList1.add(0, Long.valueOf(l1));
        }
        paramd.add(localObject2);
      }
    }
    HashMap localHashMap2 = new HashMap();
    localHashMap2.putAll(this.k);
    this.k.clear();
    i1 = 0;
    ArrayList localArrayList2;
    int i2;
    int i3;
    g.vw localvw;
    g.i locali;
    if (i1 < localArrayList1.size())
    {
      l1 = ((Long)localArrayList1.get(i1)).longValue();
      localArrayList2 = (ArrayList)localHashMap1.get(Long.valueOf(l1));
      i2 = ((u)localArrayList2.get(0)).q();
      i3 = ((u)localArrayList2.get(0)).a.e;
      if (l1 > 0L)
      {
        localvw = v.a().a(Integer.valueOf((int)l1));
        if (localvw != null)
          break label1736;
      }
      do
      {
        i1 += 1;
        break;
        locali = v.a().b(Integer.valueOf(-(int)l1));
      }
      while (locali == null);
      localvw = null;
    }
    while (true)
    {
      if ((a.c(false)) || (ad.o))
      {
        localObject1 = r.a("AppName", 2131230856);
        paramd = null;
      }
      while (true)
      {
        Integer localInteger = (Integer)localHashMap2.get(Long.valueOf(l1));
        label353: ag.f.a.a locala;
        Object localObject4;
        if (localInteger == null)
        {
          localInteger = Integer.valueOf((int)l1);
          locala = new ag.f.a.a((String)localObject1).a(i3 * 1000L);
          localObject2 = new Intent();
          ((Intent)localObject2).addFlags(32);
          ((Intent)localObject2).setAction("org.telegram.messenger.ACTION_MESSAGE_HEARD");
          ((Intent)localObject2).putExtra("dialog_id", l1);
          ((Intent)localObject2).putExtra("max_id", i2);
          locala.a(PendingIntent.getBroadcast(ApplicationLoader.a, localInteger.intValue(), (Intent)localObject2, 134217728));
          if ((e.d(locali)) || (a.c(false)) || (ad.o))
            break label1722;
          localObject2 = new Intent();
          ((Intent)localObject2).addFlags(32);
          ((Intent)localObject2).setAction("org.telegram.messenger.ACTION_MESSAGE_REPLY");
          ((Intent)localObject2).putExtra("dialog_id", l1);
          ((Intent)localObject2).putExtra("max_id", i2);
          locala.a(PendingIntent.getBroadcast(ApplicationLoader.a, localInteger.intValue(), (Intent)localObject2, 134217728), new aq.a("extra_voice_reply").a(r.a("Reply", 2131231716)).a());
          localObject2 = new Intent(ApplicationLoader.a, WearReplyReceiver.class);
          ((Intent)localObject2).putExtra("dialog_id", l1);
          ((Intent)localObject2).putExtra("max_id", i2);
          localObject3 = PendingIntent.getBroadcast(ApplicationLoader.a, localInteger.intValue(), (Intent)localObject2, 134217728);
          localObject4 = new aq.a("extra_voice_reply").a(r.a("Reply", 2131231716)).a();
          if (locali == null)
            break label1002;
          localObject2 = r.a("ReplyToGroup", 2131231717, new Object[] { localObject1 });
        }
        label667: label1592: label1722: for (Object localObject3 = new ag.a.a(2130837872, (CharSequence)localObject2, (PendingIntent)localObject3).a((aq)localObject4).a(); ; localObject3 = null)
        {
          localObject4 = (Integer)this.j.get(Long.valueOf(l1));
          localObject2 = localObject4;
          if (localObject4 == null)
            localObject2 = Integer.valueOf(0);
          ag.i locali1 = new ag.i(null).a(String.format("%1$s (%2$s)", new Object[] { localObject1, r.b("NewMessages", Math.max(((Integer)localObject2).intValue(), localArrayList2.size())) }));
          localObject2 = "";
          i2 = localArrayList2.size() - 1;
          u localu;
          while (true)
          {
            if (i2 < 0)
              break label1212;
            localu = (u)localArrayList2.get(i2);
            localObject4 = a(localu, false);
            if (localObject4 == null)
            {
              i2 -= 1;
              continue;
              if (locali != null);
              for (paramd = locali.i; ; paramd = ae.c(localvw))
              {
                if (locali == null)
                  break label920;
                if ((locali.j == null) || (locali.j.b == null) || (locali.j.b.c == 0L) || (locali.j.b.d == 0))
                  break label1728;
                localObject2 = locali.j.b;
                localObject1 = paramd;
                paramd = (ag.d)localObject2;
                break;
              }
              if ((localvw.j == null) || (localvw.j.e == null) || (localvw.j.e.c == 0L) || (localvw.j.e.d == 0))
                break label1728;
              localObject2 = localvw.j.e;
              localObject1 = paramd;
              paramd = (ag.d)localObject2;
              break;
              localHashMap2.remove(Long.valueOf(l1));
              break label353;
              label1002: localObject2 = r.a("ReplyToUser", 2131231718, new Object[] { localObject1 });
              break label667;
            }
          }
          if (locali != null);
          Object localObject5;
          for (localObject4 = ((String)localObject4).replace(" @ " + (String)localObject1, ""); ; localObject4 = ((String)localObject4).replace((String)localObject1 + ": ", "").replace((String)localObject1 + " ", ""))
          {
            localObject5 = localObject2;
            if (((String)localObject2).length() > 0)
              localObject5 = (String)localObject2 + "\n\n";
            localObject2 = (String)localObject5 + (String)localObject4;
            locala.a((String)localObject4);
            locali1.a((CharSequence)localObject4, localu.a.e * 1000L, null);
            break;
          }
          label1212: localObject4 = new Intent(ApplicationLoader.a, LaunchActivity.class);
          ((Intent)localObject4).setAction("com.tmessages.openchat" + Math.random() + 2147483647);
          ((Intent)localObject4).setFlags(32768);
          if (locali != null)
            ((Intent)localObject4).putExtra("chatId", locali.h);
          while (true)
          {
            localObject4 = PendingIntent.getActivity(ApplicationLoader.a, 0, (Intent)localObject4, 1073741824);
            localObject5 = new ag.t();
            if (localObject3 != null)
              ((ag.t)localObject5).a((ag.a)localObject3);
            localObject1 = new ag.d(ApplicationLoader.a).a((CharSequence)localObject1).a(2130837864).c("messages").b((CharSequence)localObject2).a(true).b(localArrayList2.size()).e(-13851168).b(false).a(((u)localArrayList2.get(0)).a.e * 1000L).a(locali1).a((PendingIntent)localObject4).a((ag.g)localObject5).a(new ag.f().a(locala.a())).a("msg");
            if (paramd != null)
            {
              localObject2 = p.a().a(paramd, null, "50_50");
              if (localObject2 == null)
                break label1592;
              ((ag.d)localObject1).a(((BitmapDrawable)localObject2).getBitmap());
            }
            if ((locali == null) && (localvw != null) && (localvw.i != null) && (localvw.i.length() > 0))
              ((ag.d)localObject1).b("tel:+" + localvw.i);
            this.i.a(localInteger.intValue(), ((ag.d)localObject1).b());
            this.k.put(Long.valueOf(l1), localInteger);
            break;
            if (localvw == null)
              continue;
            ((Intent)localObject4).putExtra("userId", localvw.d);
          }
          while (true)
          {
            float f1;
            try
            {
              f1 = 160.0F / a.a(50.0F);
              localObject2 = new BitmapFactory.Options();
              if (f1 >= 1.0F)
                break label1661;
              i2 = 1;
              ((BitmapFactory.Options)localObject2).inSampleSize = i2;
              paramd = BitmapFactory.decodeFile(m.a(paramd, true).toString(), (BitmapFactory.Options)localObject2);
              if (paramd == null)
                break;
              ((ag.d)localObject1).a(paramd);
            }
            catch (Throwable paramd)
            {
            }
            break;
            label1661: i2 = (int)f1;
          }
          paramd = localHashMap2.entrySet().iterator();
          while (paramd.hasNext())
          {
            localObject1 = (Map.Entry)paramd.next();
            this.i.a(((Integer)((Map.Entry)localObject1).getValue()).intValue());
          }
          break;
        }
        label920: label1728: localObject1 = paramd;
        paramd = null;
      }
      label1736: locali = null;
    }
  }

  private boolean a(u paramu)
  {
    return (paramu.a.d != null) && (paramu.a.d.d == 0) && (paramu.a.d.b == 0) && ((paramu.a.f == null) || ((paramu.a.f instanceof g.mt)));
  }

  private static String b(Context paramContext)
  {
    try
    {
      Object localObject1 = paramContext.getPackageManager();
      Object localObject2 = new Intent("android.intent.action.MAIN");
      ((Intent)localObject2).addCategory("android.intent.category.LAUNCHER");
      localObject1 = ((PackageManager)localObject1).queryIntentActivities((Intent)localObject2, 0).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (ResolveInfo)((Iterator)localObject1).next();
        if (!((ResolveInfo)localObject2).activityInfo.applicationInfo.packageName.equalsIgnoreCase(paramContext.getPackageName()))
          continue;
        paramContext = ((ResolveInfo)localObject2).activityInfo.name;
        return paramContext;
      }
    }
    catch (Throwable paramContext)
    {
      n.a("tmessages", paramContext);
    }
    return (String)(String)null;
  }

  public static void c(long paramLong)
  {
    y.a().a(y.w, new Object[0]);
    if ((int)paramLong == 0)
      return;
    SharedPreferences localSharedPreferences = ApplicationLoader.a.getSharedPreferences("Notifications", 0);
    g.cd localcd = new g.cd();
    localcd.d = new g.kz();
    localcd.d.g = "default";
    int i1 = localSharedPreferences.getInt("notify2_" + paramLong, 0);
    if (i1 == 3)
    {
      localcd.d.f = localSharedPreferences.getInt("notifyuntil_" + paramLong, 0);
      localcd.d.d = localSharedPreferences.getBoolean("preview_" + paramLong, true);
      localcd.d.e = localSharedPreferences.getBoolean("silent_" + paramLong, false);
      localcd.c = new g.kv();
      ((g.kv)localcd.c).c = v.c((int)paramLong);
      ConnectionsManager.a().a(localcd, new c()
      {
      });
      return;
    }
    g.kz localkz = localcd.d;
    if (i1 != 2);
    for (i1 = 0; ; i1 = 2147483647)
    {
      localkz.f = i1;
      break;
    }
  }

  private void c(boolean paramBoolean)
  {
    try
    {
      n.a("tmessages", "delay notification start, onlineReason = " + paramBoolean);
      this.v.acquire(10000L);
      a.b(this.u);
      Runnable localRunnable = this.u;
      if (paramBoolean);
      int i2;
      for (int i1 = 3000; ; i2 = 1000)
      {
        a.a(localRunnable, i1);
        return;
      }
    }
    catch (Exception localException)
    {
      n.a("tmessages", localException);
      d(this.p);
    }
  }

  private void d(boolean paramBoolean)
  {
    if ((!ad.b()) || (this.e.isEmpty()))
    {
      h();
      return;
    }
    u localu1;
    Object localObject3;
    int i11;
    try
    {
      ConnectionsManager.a().g();
      localu1 = (u)this.e.get(0);
      localObject3 = ApplicationLoader.a.getSharedPreferences("Notifications", 0);
      i11 = ((SharedPreferences)localObject3).getInt("dismissDate", 0);
      if (localu1.a.e <= i11)
      {
        h();
        return;
      }
    }
    catch (Exception localException1)
    {
      n.a("tmessages", localException1);
      return;
    }
    long l2 = localu1.u();
    long l1;
    label154: label182: Object localObject7;
    g.i locali;
    label213: int i2;
    int i3;
    int i4;
    int i1;
    label283: label427: boolean bool1;
    int i10;
    int i7;
    int i9;
    label611: int i5;
    label651: label716: Object localObject5;
    label768: label821: label986: label1009: ag.d locald;
    label912: label928: label1229: label1259: label1527: label1528: label1789: Object localObject2;
    if (localu1.a.l)
    {
      l1 = localu1.a.c;
      localu1.q();
      int i8;
      int i6;
      Object localObject1;
      String str2;
      Object localObject6;
      String str1;
      label1183: label1347: label1477: if (localu1.a.d.d != 0)
      {
        i8 = localu1.a.d.d;
        i6 = localu1.a.d.c;
        if (i6 != 0)
          break label1646;
        i6 = localu1.a.c;
        localObject7 = v.a().a(Integer.valueOf(i6));
        if (i8 == 0)
          break label2800;
        locali = v.a().b(Integer.valueOf(i8));
        i2 = 0;
        i3 = -16711936;
        i4 = a((SharedPreferences)localObject3, l1);
        if ((!paramBoolean) || (i4 == 2))
          break label2824;
        if (!((SharedPreferences)localObject3).getBoolean("EnableAll", true))
          break label2816;
        i1 = i2;
        if (i8 != 0)
        {
          i1 = i2;
          if (!((SharedPreferences)localObject3).getBoolean("EnableGroup", true))
            break label2816;
        }
        if ((i1 != 0) || (l2 != l1) || (locali == null))
          break label2794;
        i2 = ((SharedPreferences)localObject3).getInt("smart_max_count_" + l2, 2);
        i4 = ((SharedPreferences)localObject3).getInt("smart_delay_" + l2, 180);
        if (i2 == 0)
          break label2794;
        localObject1 = (Point)this.h.get(Long.valueOf(l2));
        if (localObject1 != null)
          break label1667;
        localObject1 = new Point(1, (int)(System.currentTimeMillis() / 1000L));
        this.h.put(Long.valueOf(l2), localObject1);
        i2 = i1;
        str2 = Settings.System.DEFAULT_NOTIFICATION_URI.getPath();
        if (i2 != 0)
          break label2774;
        boolean bool2 = ((SharedPreferences)localObject3).getBoolean("EnableInAppSounds", true);
        boolean bool3 = ((SharedPreferences)localObject3).getBoolean("EnableInAppVibrate", true);
        bool1 = ((SharedPreferences)localObject3).getBoolean("EnableInAppPreview", true);
        boolean bool4 = ((SharedPreferences)localObject3).getBoolean("EnableInAppPriority", false);
        i10 = ((SharedPreferences)localObject3).getInt("vibrate_" + l2, 0);
        i7 = ((SharedPreferences)localObject3).getInt("priority_" + l2, 3);
        i9 = 0;
        localObject1 = ((SharedPreferences)localObject3).getString("sound_path_" + l2, null);
        if (i8 == 0)
          break label1766;
        if ((localObject1 == null) || (!((String)localObject1).equals(str2)))
          break label1744;
        localObject1 = null;
        i1 = ((SharedPreferences)localObject3).getInt("vibrate_group", 0);
        i4 = ((SharedPreferences)localObject3).getInt("priority_group", 1);
        i3 = ((SharedPreferences)localObject3).getInt("GroupLed", -16711936);
        if (!((SharedPreferences)localObject3).contains("color_" + l2))
          break label2829;
        i3 = ((SharedPreferences)localObject3).getInt("color_" + l2, 0);
        break label2829;
        boolean bool5 = ApplicationLoader.d;
        i4 = i5;
        i1 = i7;
        localObject3 = localObject1;
        if (!bool5)
        {
          if (!bool2)
            localObject1 = null;
          if (!bool3)
            i5 = 2;
          if (bool4)
            break label2937;
          i1 = 0;
          localObject3 = localObject1;
          i4 = i5;
        }
        if ((i9 == 0) || (i4 == 2))
          break label2967;
        label1354: break label2646;
      }
      while (true)
      {
        try
        {
          i7 = this.c.getRingerMode();
          i5 = i4;
          if (i7 != 0)
          {
            i5 = i4;
            if (i7 != 1)
              i5 = 2;
          }
          localObject5 = localObject3;
          i4 = i3;
          i3 = i1;
          localObject1 = new Intent(ApplicationLoader.a, LaunchActivity.class);
          ((Intent)localObject1).setAction("com.tmessages.openchat" + Math.random() + 2147483647);
          ((Intent)localObject1).setFlags(32768);
          if ((int)l2 == 0)
            break label2030;
          if (this.j.size() == 1)
          {
            if (i8 != 0)
              ((Intent)localObject1).putExtra("chatId", i8);
          }
          else
          {
            if (a.c(false))
              break label2913;
            if (!ad.o)
              break label1885;
            break label2913;
            localObject1 = PendingIntent.getActivity(ApplicationLoader.a, 0, (Intent)localObject1, 1073741824);
            if (((int)l2 != 0) && (this.j.size() <= 1) && (!a.c(false)) && (!ad.o))
              break label2059;
            localObject6 = r.a("AppName", 2131230856);
            i6 = 0;
            if (this.j.size() != 1)
              break label2090;
            str1 = r.b("NewMessages", this.n);
            locald = new ag.d(ApplicationLoader.a).a((CharSequence)localObject6).a(2130837864).a(true).b(this.n).a((PendingIntent)localObject1).c("messages").b(true).e(-13851168);
            locald.a("msg");
            if ((locali == null) && (localObject7 != null) && (((g.vw)localObject7).i != null) && (((g.vw)localObject7).i.length() > 0))
              locald.b("tel:+" + ((g.vw)localObject7).i);
            i1 = 2;
            localObject1 = null;
            if (this.e.size() != 1)
              break label2198;
            localObject1 = (u)this.e.get(0);
            localObject7 = a((u)localObject1, false);
            if (!((u)localObject1).a.u)
              break label2999;
            i1 = 1;
            if (localObject7 == null)
              break;
            if (i6 == 0)
              break label2739;
            if (locali == null)
              break label2137;
            localObject1 = ((String)localObject7).replace(" @ " + (String)localObject6, "");
            locald.b((CharSequence)localObject1);
            locald.a(new ag.c().a((CharSequence)localObject1));
            localObject1 = localObject7;
            localObject6 = new Intent(ApplicationLoader.a, NotificationDismissReceiver.class);
            ((Intent)localObject6).putExtra("messageDate", localu1.a.e);
            locald.b(PendingIntent.getBroadcast(ApplicationLoader.a, 1, (Intent)localObject6, 134217728));
            if (localObject3 == null)
              break label2919;
            localObject6 = p.a().a((f)localObject3, null, "50_50");
            if (localObject6 == null)
              break label2455;
            locald.a(((BitmapDrawable)localObject6).getBitmap());
            break label2919;
            locald.d(-1);
            if ((i1 == 1) || (i2 != 0))
              break label2674;
            if ((ApplicationLoader.d) || (bool1))
            {
              if (((String)localObject1).length() <= 100)
                break label2727;
              localObject1 = ((String)localObject1).substring(0, 100).replace('\n', ' ').trim() + "...";
              label1424: locald.c((CharSequence)localObject1);
            }
            if ((!MediaController.a().h()) && (localObject5 != null) && (!localObject5.equals("NoSound")))
            {
              if (!localObject5.equals(str2))
                break label2583;
              locald.a(Settings.System.DEFAULT_NOTIFICATION_URI, 5);
            }
            if (i4 != 0)
              locald.a(i4, 1000, 1000);
            if ((i5 != 2) && (!MediaController.a().h()))
              break label2598;
            locald.a(new long[] { 0L, 0L });
            if ((Build.VERSION.SDK_INT >= 24) || (ad.i.length() != 0) || (!c()))
              continue;
            localObject1 = new Intent(ApplicationLoader.a, PopupReplyReceiver.class);
            if (Build.VERSION.SDK_INT > 19)
              break label2694;
            locald.a(2130837805, r.a("Reply", 2131231716), PendingIntent.getBroadcast(ApplicationLoader.a, 2, (Intent)localObject1, 134217728));
            label1605: a(locald, paramBoolean);
            this.i.a(1, locald.b());
            g();
            return;
            i8 = localu1.a.d.b;
            break label154;
            label1646: if (i6 != ad.c())
              break label2806;
            i6 = localu1.a.c;
            break label182;
            label1667: if (i4 + ((Point)localObject1).y >= System.currentTimeMillis() / 1000L)
              continue;
            ((Point)localObject1).set(1, (int)(System.currentTimeMillis() / 1000L));
            i2 = i1;
            break label427;
            i4 = ((Point)localObject1).x;
            if (i4 >= i2)
              break label2931;
            ((Point)localObject1).set(i4 + 1, (int)(System.currentTimeMillis() / 1000L));
            i2 = i1;
            break label427;
            label1744: if (localObject1 != null)
              break label2771;
            localObject1 = ((SharedPreferences)localObject3).getString("GroupSoundPath", str2);
            break label611;
            label1766: if (i6 == 0)
              break label2763;
            if ((localObject1 == null) || (!((String)localObject1).equals(str2)))
              continue;
            localObject1 = null;
            i1 = ((SharedPreferences)localObject3).getInt("vibrate_messages", 0);
            i4 = ((SharedPreferences)localObject3).getInt("priority_group", 1);
            i3 = ((SharedPreferences)localObject3).getInt("MessagesLed", -16711936);
            break label651;
            if (localObject1 != null)
              break label2760;
            localObject1 = ((SharedPreferences)localObject3).getString("GlobalSoundPath", str2);
            continue;
          }
        }
        catch (Exception localException2)
        {
          n.a("tmessages", localException2);
        }
        if (i6 == 0)
          break label912;
        localException2.putExtra("userId", i6);
        break label912;
        label1885: if (this.j.size() != 1)
          break label2993;
        if (locali != null)
        {
          if ((locali.j == null) || (locali.j.b == null) || (locali.j.b.c == 0L) || (locali.j.b.d == 0))
            break label2993;
          localObject3 = locali.j.b;
          break label928;
        }
        if ((localObject7 == null) || (((g.vw)localObject7).j == null) || (((g.vw)localObject7).j.e == null) || (((g.vw)localObject7).j.e.c == 0L) || (((g.vw)localObject7).j.e.d == 0))
          break label2993;
        localObject3 = ((g.vw)localObject7).j.e;
        break label928;
        label2030: if (this.j.size() != 1)
          break label2993;
        localException2.putExtra("encId", (int)(l2 >> 32));
        break label2993;
        label2059: if (locali != null)
        {
          localObject6 = locali.i;
          i6 = 1;
          break label986;
        }
        localObject6 = ae.c((g.vw)localObject7);
        i6 = 1;
        break label986;
        label2090: str1 = r.a("NotificationMessagesPeopleDisplayOrder", 2131231588, new Object[] { r.b("NewMessages", this.n), r.b("FromChats", this.j.size()) });
        break label1009;
        label2137: localObject2 = ((String)localObject7).replace((String)localObject6 + ": ", "").replace((String)localObject6 + " ", "");
        break label1229;
        label2198: locald.b(str1);
        ag.h localh = new ag.h();
        localh.a((CharSequence)localObject6);
        i8 = Math.min(10, this.e.size());
        i7 = 0;
        label2240: if (i7 < i8)
        {
          u localu2 = (u)this.e.get(i7);
          localObject7 = a(localu2, false);
          if (localObject7 == null)
            break label2733;
          if (localu2.a.e <= i11)
            break label3004;
          if (i1 != 2)
            break label2730;
          if (!localu2.a.u)
            break label3020;
          i1 = 1;
          break label3013;
          if ((this.j.size() != 1) || (i6 == 0))
            break label2736;
          if (locali != null);
          for (localObject7 = ((String)localObject7).replace(" @ " + (String)localObject6, ""); ; localObject7 = ((String)localObject7).replace((String)localObject6 + ": ", "").replace((String)localObject6 + " ", ""))
          {
            localh.c((CharSequence)localObject7);
            break;
          }
        }
        label2312: label2364: localh.b(str1);
        locald.a(localh);
        break label1259;
        while (true)
        {
          label2455: float f1;
          try
          {
            f1 = 160.0F / a.a(50.0F);
            localObject6 = new BitmapFactory.Options();
            if (f1 < 1.0F)
            {
              i6 = 1;
              ((BitmapFactory.Options)localObject6).inSampleSize = i6;
              localObject3 = BitmapFactory.decodeFile(m.a((f)localObject3, true).toString(), (BitmapFactory.Options)localObject6);
              if (localObject3 == null)
                break;
              locald.a((Bitmap)localObject3);
            }
          }
          catch (Throwable localThrowable)
          {
          }
          i6 = (int)f1;
        }
        label2536: if (i3 == 0)
        {
          locald.d(0);
          break label1354;
        }
        if (i3 == 1)
        {
          locald.d(1);
          break label1354;
        }
        if (i3 != 2)
          break label1354;
        locald.d(2);
        break label1354;
        label2583: locald.a(Uri.parse(localObject5), 5);
        break label1477;
        label2598: if (i5 != 1)
          break label3025;
        locald.a(new long[] { 0L, 100L, 0L, 100L });
      }
    }
    while (true)
    {
      locald.c(2);
      break label1528;
      label2646: if (i5 != 3)
        break label1528;
      locald.a(new long[] { 0L, 1000L });
      break label1528;
      label2674: locald.a(new long[] { 0L, 0L });
      break label1528;
      label2694: locald.a(2130837804, r.a("Reply", 2131231716), PendingIntent.getBroadcast(ApplicationLoader.a, 2, (Intent)localObject2, 134217728));
      break label1605;
      label2727: break label1424;
      label2730: break label2312;
      label2733: break label3004;
      label2736: break label2364;
      label2739: localObject2 = localObject7;
      break label1229;
      label2760: label2763: label2771: label2774: label2794: label2800: label2806: 
      do
      {
        i5 = i4;
        break label716;
        do
        {
          i7 = i4;
          break label2835;
          break label1789;
          i1 = 0;
          i4 = 0;
          break label651;
          break label611;
          i3 = 0;
          bool1 = false;
          i4 = -16711936;
          localObject5 = null;
          i5 = 0;
          break label821;
          i2 = i1;
          break label427;
          locali = null;
          break label213;
          break label182;
          l1 = l2;
          break;
          i1 = i2;
          if (i4 != 0)
            break label283;
          i1 = 1;
          break label283;
        }
        while (i7 == 3);
        i4 = i1;
        if (i1 == 4)
        {
          i4 = 0;
          i9 = 1;
        }
        if (i4 == 2)
        {
          i5 = i10;
          if (i10 == 1)
            break label716;
          i5 = i10;
          if (i10 == 3)
            break label716;
          i5 = i10;
          if (i10 == 5)
            break label716;
        }
        if (i4 == 2)
          continue;
        i5 = i10;
        if (i10 == 2)
          break label716;
      }
      while (i10 == 0);
      label2816: label2824: label2829: label2835: i5 = i10;
      break label716;
      label2913: Object localObject4 = null;
      break label928;
      label2919: if (!paramBoolean)
        break label1347;
      if (i1 != 1)
        break label2536;
      break label1347;
      label2931: i2 = 1;
      break label427;
      label2937: i4 = i5;
      i1 = i7;
      localObject4 = localObject2;
      if (i7 != 2)
        break label768;
      i1 = 1;
      i4 = i5;
      localObject4 = localObject2;
      break label768;
      label2967: i5 = i3;
      i7 = i4;
      i3 = i1;
      i4 = i5;
      localObject5 = localObject4;
      i5 = i7;
      break label821;
      label2993: localObject4 = null;
      break label928;
      label2999: i1 = 0;
      break label1183;
      label3004: i7 += 1;
      break label2240;
      while (true)
      {
        label3013: localObject2 = localObject7;
        break;
        label3020: i1 = 0;
      }
      label3025: if (i5 == 0)
        continue;
      if (i5 != 4)
        break label1527;
    }
  }

  private void g()
  {
    try
    {
      PendingIntent localPendingIntent = PendingIntent.getService(ApplicationLoader.a, 0, new Intent(ApplicationLoader.a, NotificationRepeat.class), 0);
      int i1 = ApplicationLoader.a.getSharedPreferences("Notifications", 0).getInt("repeat_messages", 60);
      if ((i1 > 0) && (this.o > 0))
      {
        this.A.set(2, SystemClock.elapsedRealtime() + i1 * 60 * 1000, localPendingIntent);
        return;
      }
      this.A.cancel(localPendingIntent);
      return;
    }
    catch (Exception localException)
    {
      n.a("tmessages", localException);
    }
  }

  private void h()
  {
    try
    {
      this.i.a(1);
      this.e.clear();
      this.g.clear();
      Iterator localIterator = this.k.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        this.i.a(((Integer)localEntry.getValue()).intValue());
      }
    }
    catch (Exception localException)
    {
      n.a("tmessages", localException);
      return;
    }
    this.k.clear();
    a.a(new Runnable()
    {
      public void run()
      {
        y.a().a(y.x, new Object[0]);
      }
    });
  }

  public void a(long paramLong)
  {
    this.d.b(new Runnable(paramLong)
    {
      public void run()
      {
        z.a(z.this, this.a);
      }
    });
  }

  public void a(SparseArray<Long> paramSparseArray, long paramLong, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    if (this.a.isEmpty());
    for (ArrayList localArrayList = null; ; localArrayList = new ArrayList(this.a))
    {
      this.d.b(new Runnable(localArrayList, paramSparseArray, paramLong, paramInt2, paramInt1, paramBoolean)
      {
        public void run()
        {
          int k;
          int j;
          int i;
          u localu;
          int m;
          long l2;
          long l1;
          if (this.a != null)
          {
            k = this.a.size();
            if (this.b != null)
              j = 0;
          }
          else
          {
            while (true)
            {
              if (j >= this.b.size())
                break label275;
              int n = this.b.keyAt(j);
              long l3 = ((Long)this.b.get(n)).longValue();
              i = 0;
              while (true)
                if (i < z.c(z.this).size())
                {
                  localu = (u)z.c(z.this).get(i);
                  m = i;
                  if (localu.u() == n)
                  {
                    m = i;
                    if (localu.q() <= (int)l3)
                    {
                      if (z.a(z.this, localu))
                        z.h(z.this);
                      if (this.a != null)
                        this.a.remove(localu);
                      l2 = localu.a.b;
                      l1 = l2;
                      if (localu.a.d.b != 0)
                        l1 = l2 | localu.a.d.b << 32;
                      z.d(z.this).remove(Long.valueOf(l1));
                      z.a(z.this).remove(localu);
                      z.c(z.this).remove(i);
                      m = i - 1;
                    }
                  }
                  i = m + 1;
                  continue;
                  k = 0;
                  break;
                }
              j += 1;
            }
            label275: if ((this.a != null) && (z.c(z.this).isEmpty()) && (!this.a.isEmpty()))
              this.a.clear();
          }
          if ((this.c != 0L) && ((this.d != 0) || (this.e != 0)))
          {
            j = 0;
            if (j < z.c(z.this).size())
            {
              localu = (u)z.c(z.this).get(j);
              m = j;
              if (localu.u() == this.c)
              {
                if (this.e == 0)
                  break label554;
                if (localu.a.e > this.e)
                  break label676;
                i = 1;
              }
            }
          }
          while (true)
          {
            m = j;
            if (i != 0)
            {
              if (z.a(z.this, localu))
                z.h(z.this);
              z.c(z.this).remove(j);
              z.a(z.this).remove(localu);
              if (this.a != null)
                this.a.remove(localu);
              l2 = localu.a.b;
              l1 = l2;
              if (localu.a.d.b != 0)
                l1 = l2 | localu.a.d.b << 32;
              z.d(z.this).remove(Long.valueOf(l1));
              m = j - 1;
            }
            j = m + 1;
            break;
            label554: if (!this.f)
            {
              if ((localu.q() <= this.d) || (this.d < 0))
              {
                i = 1;
                continue;
              }
            }
            else if ((localu.q() == this.d) || (this.d < 0))
            {
              i = 1;
              continue;
              if ((this.a != null) && (z.c(z.this).isEmpty()) && (!this.a.isEmpty()))
                this.a.clear();
              if ((this.a != null) && (k != this.a.size()))
                a.a(new Runnable()
                {
                  public void run()
                  {
                    z.this.a = z.11.this.a;
                    y.a().a(y.x, new Object[0]);
                  }
                });
              return;
            }
            label676: i = 0;
          }
        }
      });
      return;
    }
  }

  public void a(HashMap<Long, Integer> paramHashMap)
  {
    if (this.a.isEmpty());
    for (ArrayList localArrayList = null; ; localArrayList = new ArrayList(this.a))
    {
      this.d.b(new Runnable(paramHashMap, localArrayList)
      {
        public void run()
        {
          int k = z.g(z.this);
          SharedPreferences localSharedPreferences = ApplicationLoader.a.getSharedPreferences("Notifications", 0);
          Iterator localIterator = this.a.entrySet().iterator();
          Object localObject;
          long l3;
          int i;
          Integer localInteger1;
          if (localIterator.hasNext())
          {
            localObject = (Map.Entry)localIterator.next();
            l3 = ((Long)((Map.Entry)localObject).getKey()).longValue();
            i = z.a(z.this, localSharedPreferences, l3);
            if (!z.k(z.this))
              break label779;
            localInteger1 = (Integer)z.j(z.this).get(Long.valueOf(l3));
            if ((localInteger1 == null) || (localInteger1.intValue() != 1))
              break label779;
            z.j(z.this).put(Long.valueOf(l3), Integer.valueOf(0));
            i = 1;
          }
          label779: 
          while (true)
          {
            if ((i != 2) && (((localSharedPreferences.getBoolean("EnableAll", true)) && (((int)l3 >= 0) || (localSharedPreferences.getBoolean("EnableGroup", true)))) || (i != 0)));
            for (i = 1; ; i = 0)
            {
              Integer localInteger2 = (Integer)z.e(z.this).get(Long.valueOf(l3));
              localInteger1 = (Integer)((Map.Entry)localObject).getValue();
              if (localInteger1.intValue() == 0)
                z.i(z.this).remove(Long.valueOf(l3));
              localObject = localInteger1;
              int j;
              if (localInteger1.intValue() < 0)
              {
                if (localInteger2 == null)
                  break;
                j = localInteger2.intValue();
                localObject = Integer.valueOf(localInteger1.intValue() + j);
              }
              if (((i != 0) || (((Integer)localObject).intValue() == 0)) && (localInteger2 != null))
                z.a(z.this, z.g(z.this) - localInteger2.intValue());
              if (((Integer)localObject).intValue() != 0)
                break label592;
              z.e(z.this).remove(Long.valueOf(l3));
              z.j(z.this).remove(Long.valueOf(l3));
              for (i = 0; i < z.c(z.this).size(); i = j + 1)
              {
                localObject = (u)z.c(z.this).get(i);
                j = i;
                if (((u)localObject).u() != l3)
                  continue;
                if (z.a(z.this, (u)localObject))
                  z.h(z.this);
                z.c(z.this).remove(i);
                i -= 1;
                z.a(z.this).remove(localObject);
                long l2 = ((u)localObject).a.b;
                long l1 = l2;
                if (((u)localObject).a.d.b != 0)
                  l1 = l2 | ((u)localObject).a.d.b << 32;
                z.d(z.this).remove(Long.valueOf(l1));
                j = i;
                if (this.b == null)
                  continue;
                this.b.remove(localObject);
                j = i;
              }
            }
            if ((this.b == null) || (!z.c(z.this).isEmpty()) || (this.b.isEmpty()))
              break;
            this.b.clear();
            break;
            label592: if (i == 0)
              break;
            z.a(z.this, z.g(z.this) + ((Integer)localObject).intValue());
            z.e(z.this).put(Long.valueOf(l3), localObject);
            break;
            if (this.b != null)
              a.a(new Runnable()
              {
                public void run()
                {
                  z.this.a = z.12.this.b;
                }
              });
            if (k != z.g(z.this))
            {
              if (!z.k(z.this))
              {
                z.a(z.this).clear();
                z.a(z.this, z.k(z.this));
              }
            }
            else
            {
              z.b(z.this, false);
              if (localSharedPreferences.getBoolean("badgeNumber", true))
                z.d(z.this, z.g(z.this));
              return;
            }
            localObject = z.this;
            if (z.l(z.this) > ConnectionsManager.a().b());
            for (boolean bool = true; ; bool = false)
            {
              z.c((z)localObject, bool);
              break;
            }
          }
        }
      });
      return;
    }
  }

  public void a(HashMap<Long, Integer> paramHashMap, ArrayList<g.ar> paramArrayList, ArrayList<g.vw> paramArrayList1, ArrayList<g.i> paramArrayList2, ArrayList<g.t> paramArrayList3)
  {
    v.a().a(paramArrayList1, true);
    v.a().b(paramArrayList2, true);
    v.a().c(paramArrayList3, true);
    this.d.b(new Runnable(paramArrayList, paramHashMap)
    {
      public void run()
      {
        boolean bool2 = false;
        z.e(z.this).clear();
        z.c(z.this).clear();
        z.d(z.this).clear();
        z.a(z.this, 0);
        z.b(z.this, 0);
        SharedPreferences localSharedPreferences = ApplicationLoader.a.getSharedPreferences("Notifications", 0);
        HashMap localHashMap = new HashMap();
        Iterator localIterator;
        Object localObject1;
        long l2;
        long l1;
        Object localObject2;
        long l3;
        if (this.a != null)
        {
          localIterator = this.a.iterator();
          while (localIterator.hasNext())
          {
            localObject1 = (g.ar)localIterator.next();
            l2 = ((g.ar)localObject1).b;
            l1 = l2;
            if (((g.ar)localObject1).d.b != 0)
              l1 = l2 | ((g.ar)localObject1).d.b << 32;
            if (z.d(z.this).containsKey(Long.valueOf(l1)))
              continue;
            localObject2 = new u((g.ar)localObject1, null, false);
            if (z.a(z.this, (u)localObject2))
              z.n(z.this);
            l3 = ((u)localObject2).u();
            if (!((u)localObject2).a.l)
              break label774;
            l2 = ((u)localObject2).a.c;
          }
        }
        while (true)
        {
          Boolean localBoolean = (Boolean)localHashMap.get(Long.valueOf(l2));
          localObject1 = localBoolean;
          int i;
          if (localBoolean == null)
          {
            i = z.a(z.this, localSharedPreferences, l2);
            if ((i == 2) || (((!localSharedPreferences.getBoolean("EnableAll", true)) || (((int)l2 < 0) && (!localSharedPreferences.getBoolean("EnableGroup", true)))) && (i == 0)))
              break label415;
          }
          label415: for (boolean bool1 = true; ; bool1 = false)
          {
            localObject1 = Boolean.valueOf(bool1);
            localHashMap.put(Long.valueOf(l2), localObject1);
            if ((!((Boolean)localObject1).booleanValue()) || ((l2 == z.m(z.this)) && (ApplicationLoader.c)))
              break;
            z.d(z.this).put(Long.valueOf(l1), localObject2);
            z.c(z.this).add(0, localObject2);
            if (l3 == l2)
              break;
            z.j(z.this).put(Long.valueOf(l3), Integer.valueOf(1));
            break;
          }
          localIterator = this.b.entrySet().iterator();
          if (localIterator.hasNext())
          {
            localObject2 = (Map.Entry)localIterator.next();
            l1 = ((Long)((Map.Entry)localObject2).getKey()).longValue();
            localBoolean = (Boolean)localHashMap.get(Long.valueOf(l1));
            localObject1 = localBoolean;
            if (localBoolean == null)
            {
              i = z.a(z.this, localSharedPreferences, l1);
              localObject1 = (Integer)z.j(z.this).get(Long.valueOf(l1));
              if ((localObject1 == null) || (((Integer)localObject1).intValue() != 1))
                break label771;
              z.j(z.this).put(Long.valueOf(l1), Integer.valueOf(0));
              i = 1;
            }
          }
          label771: 
          while (true)
          {
            if ((i != 2) && (((localSharedPreferences.getBoolean("EnableAll", true)) && (((int)l1 >= 0) || (localSharedPreferences.getBoolean("EnableGroup", true)))) || (i != 0)));
            for (bool1 = true; ; bool1 = false)
            {
              localObject1 = Boolean.valueOf(bool1);
              localHashMap.put(Long.valueOf(l1), localObject1);
              if (!((Boolean)localObject1).booleanValue())
                break;
              i = ((Integer)((Map.Entry)localObject2).getValue()).intValue();
              z.e(z.this).put(Long.valueOf(l1), Integer.valueOf(i));
              z.a(z.this, i + z.g(z.this));
              break;
            }
            if (z.g(z.this) == 0)
              a.a(new Runnable()
              {
                public void run()
                {
                  z.this.a.clear();
                  y.a().a(y.x, new Object[0]);
                }
              });
            localObject1 = z.this;
            bool1 = bool2;
            if (SystemClock.uptimeMillis() / 1000L < 60L)
              bool1 = true;
            z.a((z)localObject1, bool1);
            if (localSharedPreferences.getBoolean("badgeNumber", true))
              z.d(z.this, z.g(z.this));
            return;
          }
          label774: l2 = l3;
        }
      }
    });
  }

  public void a(boolean paramBoolean)
  {
    this.r = paramBoolean;
  }

  public void b()
  {
    this.a.clear();
    this.b.clear();
    this.d.b(new Runnable()
    {
      public void run()
      {
        z.a(z.this, 0L);
        z.a(z.this, 0);
        z.b(z.this, 0);
        z.c(z.this).clear();
        z.d(z.this).clear();
        z.e(z.this).clear();
        z.f(z.this).clear();
        z.a(z.this).clear();
        z.b(z.this, false);
        z.c(z.this, 0);
        try
        {
          if (z.b(z.this).isHeld())
            z.b(z.this).release();
          z.d(z.this, 0);
          SharedPreferences.Editor localEditor = ApplicationLoader.a.getSharedPreferences("Notifications", 0).edit();
          localEditor.clear();
          localEditor.commit();
          return;
        }
        catch (Exception localException)
        {
          while (true)
            n.a("tmessages", localException);
        }
      }
    });
  }

  public void b(long paramLong)
  {
    a().a(null, paramLong, 0, 2147483647, false);
    HashMap localHashMap = new HashMap();
    localHashMap.put(Long.valueOf(paramLong), Integer.valueOf(0));
    a().a(localHashMap);
  }

  public void b(boolean paramBoolean)
  {
    if (paramBoolean);
    for (int i1 = this.n; ; i1 = 0)
    {
      a(i1);
      return;
    }
  }

  public boolean c()
  {
    int i3 = 0;
    int i1 = 0;
    int i2;
    while (true)
    {
      i2 = i3;
      if (i1 >= this.e.size())
        break;
      u localu = (u)this.e.get(i1);
      long l1 = localu.u();
      if (((localu.a.l) && ((localu.a.f instanceof g.mz))) || ((int)l1 == 0) || ((localu.a.d.b != 0) && (!localu.t())))
      {
        i1 += 1;
        continue;
      }
      i2 = 1;
    }
    return i2;
  }

  protected void d()
  {
    this.d.b(new Runnable()
    {
      public void run()
      {
        ArrayList localArrayList = new ArrayList();
        int i = 0;
        if (i < z.c(z.this).size())
        {
          u localu = (u)z.c(z.this).get(i);
          long l = localu.u();
          if (((localu.a.l) && ((localu.a.f instanceof g.mz))) || ((int)l == 0) || ((localu.a.d.b != 0) && (!localu.t())));
          while (true)
          {
            i += 1;
            break;
            localArrayList.add(0, localu);
          }
        }
        if ((!localArrayList.isEmpty()) && (!a.c(false)))
          a.a(new Runnable(localArrayList)
          {
            public void run()
            {
              z.this.b = this.a;
              Intent localIntent = new Intent(ApplicationLoader.a, PopupNotificationActivity.class);
              localIntent.putExtra("force", true);
              localIntent.setFlags(268763140);
              ApplicationLoader.a.startActivity(localIntent);
              localIntent = new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS");
              ApplicationLoader.a.sendBroadcast(localIntent);
            }
          });
      }
    });
  }

  protected void e()
  {
    this.d.b(new Runnable()
    {
      public void run()
      {
        int i = Calendar.getInstance().get(11);
        if ((i >= 11) && (i <= 22))
        {
          z.r(z.this).a(1);
          z.a(z.this, true);
          return;
        }
        z.s(z.this);
      }
    });
  }

  public void f()
  {
    if ((!this.r) || (MediaController.a().h()));
    while (true)
    {
      return;
      try
      {
        int i1 = this.c.getRingerMode();
        if (i1 == 0)
          continue;
        this.d.b(new Runnable()
        {
          public void run()
          {
            try
            {
              if (Math.abs(System.currentTimeMillis() - z.t(z.this)) <= 100L)
                return;
              z.b(z.this, System.currentTimeMillis());
              if (z.q(z.this) == null)
              {
                z.a(z.this, new SoundPool(3, 1, 0));
                z.q(z.this).setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener()
                {
                  public void onLoadComplete(SoundPool paramSoundPool, int paramInt1, int paramInt2)
                  {
                    if (paramInt2 == 0)
                      paramSoundPool.play(paramInt1, 1.0F, 1.0F, 1, 0, 1.0F);
                  }
                });
              }
              if ((z.u(z.this) == 0) && (!z.v(z.this)))
              {
                z.d(z.this, true);
                z.e(z.this, z.q(z.this).load(ApplicationLoader.a, 2131165186, 1));
              }
              if (z.u(z.this) != 0)
              {
                z.q(z.this).play(z.u(z.this), 1.0F, 1.0F, 1, 0, 1.0F);
                return;
              }
            }
            catch (Exception localException)
            {
              n.a("tmessages", localException);
            }
          }
        });
        return;
      }
      catch (Exception localException)
      {
        while (true)
          n.a("tmessages", localException);
      }
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.z
 * JD-Core Version:    0.6.0
 */