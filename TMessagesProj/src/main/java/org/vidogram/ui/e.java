package org.vidogram.ui;

import android.app.AlarmManager;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.PendingIntent;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListView;
import java.io.File;
import java.util.ArrayList;
import org.vidogram.SQLite.SQLiteCursor;
import org.vidogram.SQLite.SQLiteDatabase;
import org.vidogram.SQLite.SQLitePreparedStatement;
import org.vidogram.messenger.ApplicationLoader;
import org.vidogram.messenger.ClearCacheService;
import org.vidogram.messenger.Utilities;
import org.vidogram.messenger.h;
import org.vidogram.messenger.m;
import org.vidogram.messenger.n;
import org.vidogram.messenger.p;
import org.vidogram.messenger.r;
import org.vidogram.messenger.w;
import org.vidogram.tgnet.NativeByteBuffer;
import org.vidogram.tgnet.g.ar;
import org.vidogram.ui.Components.v;
import org.vidogram.ui.a.a.a;
import org.vidogram.ui.a.g;
import org.vidogram.ui.a.h.a;
import org.vidogram.ui.a.h.d;
import org.vidogram.ui.c.bf;
import org.vidogram.ui.c.bg;
import org.vidogram.ui.c.l;

public class e extends g
{
  private volatile boolean A = false;
  private a i;
  private int j;
  private int k;
  private int l;
  private int m;
  private int n;
  private int o;
  private int p;
  private long q = -1L;
  private long r = -1L;
  private long s = -1L;
  private long t = -1L;
  private long u = -1L;
  private long v = -1L;
  private long w = -1L;
  private long x = -1L;
  private boolean[] y = new boolean[6];
  private boolean z = true;

  // ERROR //
  private long a(File paramFile, int paramInt)
  {
    // Byte code:
    //   0: aload_1
    //   1: ifnull +10 -> 11
    //   4: aload_0
    //   5: getfield 83	org/vidogram/ui/e:A	Z
    //   8: ifeq +5 -> 13
    //   11: lconst_0
    //   12: lreturn
    //   13: aload_1
    //   14: invokevirtual 93	java/io/File:isDirectory	()Z
    //   17: ifeq +139 -> 156
    //   20: aload_1
    //   21: invokevirtual 97	java/io/File:listFiles	()[Ljava/io/File;
    //   24: astore_1
    //   25: aload_1
    //   26: ifnull +152 -> 178
    //   29: iconst_0
    //   30: istore_3
    //   31: lconst_0
    //   32: lstore 4
    //   34: lload 4
    //   36: lstore 6
    //   38: iload_3
    //   39: aload_1
    //   40: arraylength
    //   41: if_icmpge +112 -> 153
    //   44: aload_0
    //   45: getfield 83	org/vidogram/ui/e:A	Z
    //   48: ifne -37 -> 11
    //   51: aload_1
    //   52: iload_3
    //   53: aaload
    //   54: astore 8
    //   56: iload_2
    //   57: iconst_1
    //   58: if_icmpeq +8 -> 66
    //   61: iload_2
    //   62: iconst_2
    //   63: if_icmpne +36 -> 99
    //   66: aload 8
    //   68: invokevirtual 101	java/io/File:getName	()Ljava/lang/String;
    //   71: invokevirtual 106	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   74: astore 9
    //   76: aload 9
    //   78: ldc 108
    //   80: invokevirtual 112	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   83: ifne +101 -> 184
    //   86: aload 9
    //   88: ldc 114
    //   90: invokevirtual 112	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   93: ifeq +111 -> 204
    //   96: goto +88 -> 184
    //   99: aload 8
    //   101: invokevirtual 93	java/io/File:isDirectory	()Z
    //   104: ifeq +18 -> 122
    //   107: lload 4
    //   109: aload_0
    //   110: aload 8
    //   112: iload_2
    //   113: invokespecial 116	org/vidogram/ui/e:a	(Ljava/io/File;I)J
    //   116: ladd
    //   117: lstore 6
    //   119: goto +74 -> 193
    //   122: aload 8
    //   124: invokevirtual 120	java/io/File:length	()J
    //   127: lstore 6
    //   129: lload 4
    //   131: lload 6
    //   133: ladd
    //   134: lstore 6
    //   136: goto +57 -> 193
    //   139: astore_1
    //   140: lconst_0
    //   141: lstore 4
    //   143: ldc 122
    //   145: aload_1
    //   146: invokestatic 127	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   149: lload 4
    //   151: lstore 6
    //   153: lload 6
    //   155: lreturn
    //   156: aload_1
    //   157: invokevirtual 130	java/io/File:isFile	()Z
    //   160: ifeq +18 -> 178
    //   163: aload_1
    //   164: invokevirtual 120	java/io/File:length	()J
    //   167: lconst_0
    //   168: ladd
    //   169: lstore 6
    //   171: goto -18 -> 153
    //   174: astore_1
    //   175: goto -32 -> 143
    //   178: lconst_0
    //   179: lstore 6
    //   181: goto -28 -> 153
    //   184: iload_2
    //   185: iconst_1
    //   186: if_icmpne -87 -> 99
    //   189: lload 4
    //   191: lstore 6
    //   193: iload_3
    //   194: iconst_1
    //   195: iadd
    //   196: istore_3
    //   197: lload 6
    //   199: lstore 4
    //   201: goto -167 -> 34
    //   204: lload 4
    //   206: lstore 6
    //   208: iload_2
    //   209: iconst_2
    //   210: if_icmpeq -17 -> 193
    //   213: goto -114 -> 99
    //
    // Exception table:
    //   from	to	target	type
    //   20	25	139	java/lang/Throwable
    //   38	51	174	java/lang/Throwable
    //   66	96	174	java/lang/Throwable
    //   99	119	174	java/lang/Throwable
    //   122	129	174	java/lang/Throwable
  }

  private void q()
  {
    ProgressDialog localProgressDialog = new ProgressDialog(l());
    localProgressDialog.setMessage(r.a("Loading", 2131231394));
    localProgressDialog.setCanceledOnTouchOutside(false);
    localProgressDialog.setCancelable(false);
    localProgressDialog.show();
    Utilities.d.b(new Runnable(localProgressDialog)
    {
      public void run()
      {
        int k = 0;
        boolean bool2 = false;
        boolean bool1;
        int i;
        int j;
        label46: Object localObject;
        if (k < 6)
        {
          if (e.i(e.this)[k] == 0)
            bool1 = bool2;
          do
          {
            k += 1;
            bool2 = bool1;
            break;
            if (k != 0)
              break label481;
            i = 0;
            j = 0;
            bool1 = bool2;
          }
          while (j == -1);
          localObject = m.a().a(j);
          if (localObject == null);
        }
        label541: 
        while (true)
        {
          int m;
          try
          {
            localObject = ((File)localObject).listFiles();
            if (localObject != null)
            {
              m = 0;
              label84: if (m < localObject.length)
              {
                String str = localObject[m].getName().toLowerCase();
                if ((i != 1) && (i != 2))
                  continue;
                if (str.endsWith(".mp3"))
                  break label467;
                if (!str.endsWith(".m4a"))
                  break label541;
                break label467;
                if ((str.equals(".nomedia")) || (!localObject[m].isFile()))
                  break label472;
                localObject[m].delete();
              }
            }
          }
          catch (Throwable localThrowable)
          {
            n.a("tmessages", localThrowable);
          }
          if (j == 4)
          {
            e.a(e.this, e.a(e.this, m.a().a(4), i));
            bool1 = true;
            break;
          }
          if (j == 1)
          {
            e.f(e.this, e.a(e.this, m.a().a(1), i));
            bool1 = bool2;
            break;
          }
          if (j == 3)
          {
            if (i == 1)
            {
              e.d(e.this, e.a(e.this, m.a().a(3), i));
              bool1 = bool2;
              break;
            }
            e.e(e.this, e.a(e.this, m.a().a(3), i));
            bool1 = bool2;
            break;
          }
          if (j == 0)
          {
            e.b(e.this, e.a(e.this, m.a().a(0), i));
            bool1 = true;
            break;
          }
          bool1 = bool2;
          if (j != 2)
            break;
          e.c(e.this, e.a(e.this, m.a().a(2), i));
          bool1 = bool2;
          break;
          e.g(e.this, e.b(e.this) + e.c(e.this) + e.d(e.this) + e.e(e.this) + e.f(e.this) + e.g(e.this));
          org.vidogram.messenger.a.a(new Runnable(bool2)
          {
            public void run()
            {
              if (this.a)
                p.a().d();
              if (e.h(e.this) != null)
                e.h(e.this).notifyDataSetChanged();
              try
              {
                e.2.this.a.dismiss();
                return;
              }
              catch (Exception localException)
              {
                n.a("tmessages", localException);
              }
            }
          });
          return;
          label460: i = 0;
          j = -1;
          break label46;
          label467: if (i != 1)
            continue;
          label472: label481: 
          do
          {
            m += 1;
            break label84;
            if (k == 1)
            {
              i = 0;
              j = 2;
              break;
            }
            if (k == 2)
            {
              i = 1;
              j = 3;
              break;
            }
            if (k == 3)
            {
              i = 2;
              j = 3;
              break;
            }
            if (k == 4)
            {
              i = 0;
              j = 1;
              break;
            }
            if (k != 5)
              break label460;
            i = 0;
            j = 4;
            break;
          }
          while (i == 2);
        }
      }
    });
  }

  public View a(Context paramContext)
  {
    this.d.setBackButtonImage(2130837794);
    this.d.setAllowOverlayTitle(true);
    this.d.setTitle(r.a("CacheSettings", 2131230938));
    this.d.setActionBarMenuOnItemClick(new a.a()
    {
      public void a(int paramInt)
      {
        if (paramInt == -1)
          e.this.d();
      }
    });
    this.i = new a(paramContext);
    this.b = new FrameLayout(paramContext);
    FrameLayout localFrameLayout = (FrameLayout)this.b;
    localFrameLayout.setBackgroundColor(-986896);
    paramContext = new ListView(paramContext);
    paramContext.setDivider(null);
    paramContext.setDividerHeight(0);
    paramContext.setVerticalScrollBarEnabled(false);
    paramContext.setDrawSelectorOnTop(true);
    localFrameLayout.addView(paramContext, v.a(-1, -1.0F));
    paramContext.setAdapter(this.i);
    paramContext.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
      {
        if (e.this.l() == null);
        Object localObject2;
        do
        {
          return;
          if (paramInt == e.j(e.this))
          {
            paramAdapterView = new h.d(e.this.l());
            paramView = r.b("Weeks", 1);
            localObject1 = r.b("Months", 1);
            localObject2 = r.a("KeepMediaForever", 2131231340);
            1 local1 = new DialogInterface.OnClickListener()
            {
              public void onClick(DialogInterface paramDialogInterface, int paramInt)
              {
                ApplicationLoader.a.getSharedPreferences("mainconfig", 0).edit().putInt("keep_media", paramInt).commit();
                if (e.h(e.this) != null)
                  e.h(e.this).notifyDataSetChanged();
                paramDialogInterface = PendingIntent.getService(ApplicationLoader.a, 0, new Intent(ApplicationLoader.a, ClearCacheService.class), 0);
                AlarmManager localAlarmManager = (AlarmManager)ApplicationLoader.a.getSystemService("alarm");
                if (paramInt == 2)
                {
                  localAlarmManager.cancel(paramDialogInterface);
                  return;
                }
                localAlarmManager.setInexactRepeating(2, 86400000L, 86400000L, paramDialogInterface);
              }
            };
            paramAdapterView.a(new CharSequence[] { paramView, localObject1, localObject2 }, local1);
            e.this.b(paramAdapterView.a());
            return;
          }
          if (paramInt != e.k(e.this))
            continue;
          paramAdapterView = new AlertDialog.Builder(e.this.l());
          paramAdapterView.setTitle(r.a("AppName", 2131230856));
          paramAdapterView.setNegativeButton(r.a("Cancel", 2131230943), null);
          paramAdapterView.setMessage(r.a("LocalDatabaseClear", 2131231398));
          paramAdapterView.setPositiveButton(r.a("CacheClear", 2131230936), new DialogInterface.OnClickListener()
          {
            public void onClick(DialogInterface paramDialogInterface, int paramInt)
            {
              paramDialogInterface = new ProgressDialog(e.this.l());
              paramDialogInterface.setMessage(r.a("Loading", 2131231394));
              paramDialogInterface.setCanceledOnTouchOutside(false);
              paramDialogInterface.setCancelable(false);
              paramDialogInterface.show();
              w.a().c().b(new Runnable(paramDialogInterface)
              {
                public void run()
                {
                  while (true)
                  {
                    Object localObject2;
                    int j;
                    SQLitePreparedStatement localSQLitePreparedStatement;
                    try
                    {
                      SQLiteDatabase localSQLiteDatabase = w.a().b();
                      localArrayList = new ArrayList();
                      localObject2 = localSQLiteDatabase.b("SELECT did FROM dialogs WHERE 1", new Object[0]);
                      new StringBuilder();
                      if (!((SQLiteCursor)localObject2).a())
                        continue;
                      l1 = ((SQLiteCursor)localObject2).d(0);
                      i = (int)l1;
                      j = (int)(l1 >> 32);
                      if ((i == 0) || (j == 1))
                        continue;
                      localArrayList.add(Long.valueOf(l1));
                      continue;
                    }
                    catch (Exception localException1)
                    {
                      ArrayList localArrayList;
                      long l1;
                      int i;
                      n.a("tmessages", localException1);
                      return;
                      ((SQLiteCursor)localObject2).b();
                      localObject2 = localException1.a("REPLACE INTO messages_holes VALUES(?, ?, ?)");
                      localSQLitePreparedStatement = localException1.a("REPLACE INTO media_holes_v2 VALUES(?, ?, ?, ?)");
                      localException1.d();
                      j = 0;
                      if (j < localArrayList.size())
                      {
                        Long localLong = (Long)localArrayList.get(j);
                        i = 0;
                        SQLiteCursor localSQLiteCursor1 = localException1.b("SELECT COUNT(mid) FROM messages WHERE uid = " + localLong, new Object[0]);
                        if (!localSQLiteCursor1.a())
                          continue;
                        i = localSQLiteCursor1.b(0);
                        localSQLiteCursor1.b();
                        if (i <= 2)
                          break label704;
                        localSQLiteCursor1 = localException1.b("SELECT last_mid_i, last_mid FROM dialogs WHERE did = " + localLong, new Object[0]);
                        i = -1;
                        if (!localSQLiteCursor1.a())
                          continue;
                        l1 = localSQLiteCursor1.d(0);
                        long l2 = localSQLiteCursor1.d(1);
                        SQLiteCursor localSQLiteCursor2 = localException1.b("SELECT data FROM messages WHERE uid = " + localLong + " AND mid IN (" + l1 + "," + l2 + ")", new Object[0]);
                        int k = i;
                        try
                        {
                          if (!localSQLiteCursor2.a())
                            continue;
                          NativeByteBuffer localNativeByteBuffer = localSQLiteCursor2.g(0);
                          i = k;
                          if (localNativeByteBuffer == null)
                            continue;
                          g.ar localar = g.ar.a(localNativeByteBuffer, localNativeByteBuffer.b(false), false);
                          localNativeByteBuffer.e();
                          i = k;
                          if (localar == null)
                            continue;
                          i = localar.b;
                        }
                        catch (Exception localException2)
                        {
                          n.a("tmessages", localException2);
                          localSQLiteCursor2.b();
                          localException1.a("DELETE FROM messages WHERE uid = " + localLong + " AND mid != " + l1 + " AND mid != " + l2).c().e();
                          localException1.a("DELETE FROM messages_holes WHERE uid = " + localLong).c().e();
                          localException1.a("DELETE FROM bot_keyboard WHERE uid = " + localLong).c().e();
                          localException1.a("DELETE FROM media_counts_v2 WHERE uid = " + localLong).c().e();
                          localException1.a("DELETE FROM media_v2 WHERE uid = " + localLong).c().e();
                          localException1.a("DELETE FROM media_holes_v2 WHERE uid = " + localLong).c().e();
                          org.vidogram.messenger.d.a.a(localLong.longValue(), null);
                          if (k == -1)
                            continue;
                          w.a(localLong.longValue(), (SQLitePreparedStatement)localObject2, localSQLitePreparedStatement, k);
                        }
                        localSQLiteCursor1.b();
                      }
                    }
                    finally
                    {
                      org.vidogram.messenger.a.a(new Runnable()
                      {
                        public void run()
                        {
                          try
                          {
                            e.4.2.1.this.a.dismiss();
                            if (e.h(e.this) != null)
                            {
                              File localFile = new File(ApplicationLoader.h(), "cache4.db");
                              e.h(e.this, localFile.length());
                              e.h(e.this).notifyDataSetChanged();
                            }
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
                    ((SQLitePreparedStatement)localObject2).e();
                    localSQLitePreparedStatement.e();
                    localObject1.e();
                    localObject1.a("VACUUM").c().e();
                    org.vidogram.messenger.a.a(new Runnable()
                    {
                      public void run()
                      {
                        try
                        {
                          e.4.2.1.this.a.dismiss();
                          if (e.h(e.this) != null)
                          {
                            File localFile = new File(ApplicationLoader.h(), "cache4.db");
                            e.h(e.this, localFile.length());
                            e.h(e.this).notifyDataSetChanged();
                          }
                          return;
                        }
                        catch (Exception localException)
                        {
                          while (true)
                            n.a("tmessages", localException);
                        }
                      }
                    });
                    return;
                    label704: j += 1;
                  }
                }
              });
            }
          });
          e.this.b(paramAdapterView.create());
          return;
        }
        while ((paramInt != e.l(e.this)) || (e.m(e.this) <= 0L) || (e.this.l() == null));
        paramView = new h.d(e.this.l());
        paramView.a(false);
        paramView.b(false);
        Object localObject1 = new LinearLayout(e.this.l());
        ((LinearLayout)localObject1).setOrientation(1);
        paramInt = 0;
        if (paramInt < 6)
        {
          paramLong = 0L;
          paramAdapterView = null;
          if (paramInt == 0)
          {
            paramLong = e.e(e.this);
            paramAdapterView = r.a("LocalPhotoCache", 2131231402);
            label321: if (paramLong <= 0L)
              break label541;
            e.i(e.this)[paramInt] = 1;
            localObject2 = new l(e.this.l());
            ((l)localObject2).setTag(Integer.valueOf(paramInt));
            ((l)localObject2).setBackgroundResource(2130837946);
            ((LinearLayout)localObject1).addView((View)localObject2, v.b(-1, 48));
            ((l)localObject2).a(paramAdapterView, org.vidogram.messenger.a.c(paramLong), true, true);
            ((l)localObject2).setOnClickListener(new View.OnClickListener()
            {
              public void onClick(View paramView)
              {
                paramView = (l)paramView;
                int i = ((Integer)paramView.getTag()).intValue();
                boolean[] arrayOfBoolean = e.i(e.this);
                if (e.i(e.this)[i] == 0);
                for (int j = 1; ; j = 0)
                {
                  arrayOfBoolean[i] = j;
                  paramView.a(e.i(e.this)[i], true);
                  return;
                }
              }
            });
          }
          while (true)
          {
            paramInt += 1;
            break;
            if (paramInt == 1)
            {
              paramLong = e.c(e.this);
              paramAdapterView = r.a("LocalVideoCache", 2131231403);
              break label321;
            }
            if (paramInt == 2)
            {
              paramLong = e.f(e.this);
              paramAdapterView = r.a("LocalDocumentCache", 2131231400);
              break label321;
            }
            if (paramInt == 3)
            {
              paramLong = e.g(e.this);
              paramAdapterView = r.a("LocalMusicCache", 2131231401);
              break label321;
            }
            if (paramInt == 4)
            {
              paramLong = e.d(e.this);
              paramAdapterView = r.a("LocalAudioCache", 2131231395);
              break label321;
            }
            if (paramInt != 5)
              break label321;
            paramLong = e.b(e.this);
            paramAdapterView = r.a("LocalCache", 2131231396);
            break label321;
            label541: e.i(e.this)[paramInt] = 0;
          }
        }
        paramAdapterView = new h.a(e.this.l(), 1);
        paramAdapterView.setBackgroundResource(2130837946);
        paramAdapterView.a(r.a("ClearMediaCache", 2131231068).toUpperCase(), 0);
        paramAdapterView.setTextColor(-3319206);
        paramAdapterView.setOnClickListener(new View.OnClickListener()
        {
          public void onClick(View paramView)
          {
            try
            {
              if (e.n(e.this) != null)
                e.o(e.this).dismiss();
              e.p(e.this);
              return;
            }
            catch (Exception paramView)
            {
              while (true)
                n.a("tmessages", paramView);
            }
          }
        });
        ((LinearLayout)localObject1).addView(paramAdapterView, v.b(-1, 48));
        paramView.a((View)localObject1);
        e.this.b(paramView.a());
      }
    });
    return this.b;
  }

  public boolean f()
  {
    super.f();
    this.p = 0;
    int i1 = this.p;
    this.p = (i1 + 1);
    this.l = i1;
    i1 = this.p;
    this.p = (i1 + 1);
    this.m = i1;
    i1 = this.p;
    this.p = (i1 + 1);
    this.n = i1;
    i1 = this.p;
    this.p = (i1 + 1);
    this.o = i1;
    i1 = this.p;
    this.p = (i1 + 1);
    this.j = i1;
    i1 = this.p;
    this.p = (i1 + 1);
    this.k = i1;
    this.q = new File(ApplicationLoader.h(), "cache4.db").length();
    Utilities.d.b(new Runnable()
    {
      public void run()
      {
        e.a(e.this, e.a(e.this, m.a().a(4), 0));
        if (e.a(e.this));
        do
        {
          do
          {
            do
            {
              do
              {
                return;
                e.b(e.this, e.a(e.this, m.a().a(0), 0));
              }
              while (e.a(e.this));
              e.c(e.this, e.a(e.this, m.a().a(2), 0));
            }
            while (e.a(e.this));
            e.d(e.this, e.a(e.this, m.a().a(3), 1));
          }
          while (e.a(e.this));
          e.e(e.this, e.a(e.this, m.a().a(3), 2));
        }
        while (e.a(e.this));
        e.f(e.this, e.a(e.this, m.a().a(1), 0));
        e.g(e.this, e.b(e.this) + e.c(e.this) + e.d(e.this) + e.e(e.this) + e.f(e.this) + e.g(e.this));
        org.vidogram.messenger.a.a(new Runnable()
        {
          public void run()
          {
            e.a(e.this, false);
            if (e.h(e.this) != null)
              e.h(e.this).notifyDataSetChanged();
          }
        });
      }
    });
    return true;
  }

  public void g()
  {
    super.g();
    this.A = true;
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
      return e.q(e.this);
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
      if ((paramInt == e.k(e.this)) || (paramInt == e.l(e.this)) || (paramInt == e.j(e.this)));
      do
        return 0;
      while ((paramInt != e.t(e.this)) && (paramInt != e.u(e.this)) && (paramInt != e.v(e.this)));
      return 1;
    }

    public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      int i = getItemViewType(paramInt);
      if (i == 0)
      {
        if (paramView != null)
          break label384;
        paramView = new bg(this.b);
        paramView.setBackgroundColor(-1);
      }
      label384: 
      while (true)
      {
        bg localbg = (bg)paramView;
        if (paramInt == e.k(e.this))
        {
          localbg.a(r.a("LocalDatabase", 2131231397), org.vidogram.messenger.a.c(e.r(e.this)), false);
          paramViewGroup = paramView;
        }
        do
        {
          return paramViewGroup;
          if (paramInt == e.l(e.this))
          {
            if (e.s(e.this))
            {
              localbg.a(r.a("ClearMediaCache", 2131231068), r.a("CalculatingSize", 2131230939), false);
              return paramView;
            }
            String str = r.a("ClearMediaCache", 2131231068);
            if (e.m(e.this) == 0L);
            for (paramViewGroup = r.a("CacheEmpty", 2131230937); ; paramViewGroup = org.vidogram.messenger.a.c(e.m(e.this)))
            {
              localbg.a(str, paramViewGroup, false);
              return paramView;
            }
          }
          paramViewGroup = paramView;
        }
        while (paramInt != e.j(e.this));
        paramInt = ApplicationLoader.a.getSharedPreferences("mainconfig", 0).getInt("keep_media", 2);
        if (paramInt == 0)
          paramViewGroup = r.b("Weeks", 1);
        while (true)
        {
          localbg.a(r.a("KeepMedia", 2131231339), paramViewGroup, false);
          return paramView;
          if (paramInt == 1)
          {
            paramViewGroup = r.b("Months", 1);
            continue;
          }
          paramViewGroup = r.a("KeepMediaForever", 2131231340);
        }
        if (i == 1)
        {
          if (paramView == null)
            paramView = new bf(this.b);
          while (true)
          {
            if (paramInt == e.t(e.this))
            {
              ((bf)paramView).setText(r.a("LocalDatabaseInfo", 2131231399));
              paramView.setBackgroundResource(2130837783);
              return paramView;
            }
            if (paramInt == e.u(e.this))
            {
              ((bf)paramView).setText("");
              paramView.setBackgroundResource(2130837782);
              return paramView;
            }
            paramViewGroup = paramView;
            if (paramInt != e.v(e.this))
              break;
            ((bf)paramView).setText(org.vidogram.messenger.a.b(r.a("KeepMediaInfo", 2131231341)));
            paramView.setBackgroundResource(2130837782);
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
      return (paramInt == e.k(e.this)) || ((paramInt == e.l(e.this)) && (e.m(e.this) > 0L)) || (paramInt == e.j(e.this));
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.e
 * JD-Core Version:    0.6.0
 */