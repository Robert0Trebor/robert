package org.vidogram.messenger;

import android.graphics.Point;
import android.text.Layout.Alignment;
import android.text.Spannable;
import android.text.Spannable.Factory;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.util.Linkify;
import java.io.File;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.vidogram.tgnet.ConnectionsManager;
import org.vidogram.tgnet.f;
import org.vidogram.tgnet.g.an;
import org.vidogram.tgnet.g.aq;
import org.vidogram.tgnet.g.ar;
import org.vidogram.tgnet.g.as;
import org.vidogram.tgnet.g.au;
import org.vidogram.tgnet.g.aw;
import org.vidogram.tgnet.g.ay;
import org.vidogram.tgnet.g.az;
import org.vidogram.tgnet.g.bb;
import org.vidogram.tgnet.g.gt;
import org.vidogram.tgnet.g.gu;
import org.vidogram.tgnet.g.ht;
import org.vidogram.tgnet.g.hu;
import org.vidogram.tgnet.g.hz;
import org.vidogram.tgnet.g.i;
import org.vidogram.tgnet.g.ia;
import org.vidogram.tgnet.g.ie;
import org.vidogram.tgnet.g.jb;
import org.vidogram.tgnet.g.lq;
import org.vidogram.tgnet.g.mc;
import org.vidogram.tgnet.g.mg;
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
import org.vidogram.tgnet.g.ms;
import org.vidogram.tgnet.g.mt;
import org.vidogram.tgnet.g.mu;
import org.vidogram.tgnet.g.mx;
import org.vidogram.tgnet.g.my;
import org.vidogram.tgnet.g.mz;
import org.vidogram.tgnet.g.na;
import org.vidogram.tgnet.g.nb;
import org.vidogram.tgnet.g.nc;
import org.vidogram.tgnet.g.nd;
import org.vidogram.tgnet.g.ne;
import org.vidogram.tgnet.g.ns;
import org.vidogram.tgnet.g.nt;
import org.vidogram.tgnet.g.nv;
import org.vidogram.tgnet.g.nw;
import org.vidogram.tgnet.g.ny;
import org.vidogram.tgnet.g.nz;
import org.vidogram.tgnet.g.oa;
import org.vidogram.tgnet.g.ob;
import org.vidogram.tgnet.g.od;
import org.vidogram.tgnet.g.of;
import org.vidogram.tgnet.g.oi;
import org.vidogram.tgnet.g.oj;
import org.vidogram.tgnet.g.ov;
import org.vidogram.tgnet.g.q;
import org.vidogram.tgnet.g.r;
import org.vidogram.tgnet.g.rt;
import org.vidogram.tgnet.g.sf;
import org.vidogram.tgnet.g.vp;
import org.vidogram.tgnet.g.vw;
import org.vidogram.tgnet.g.wb;
import org.vidogram.ui.Components.URLSpanBotCommand;
import org.vidogram.ui.Components.URLSpanNoUnderline;
import org.vidogram.ui.Components.URLSpanNoUnderlineBold;

public class u
{
  private static TextPaint A;
  private static TextPaint B;
  private static TextPaint C;
  private static TextPaint D;
  private static TextPaint E;
  private static TextPaint F;
  public static Pattern y;
  private boolean G;
  private int H;
  public g.ar a;
  public CharSequence b;
  public CharSequence c;
  public CharSequence d;
  public u e;
  public int f = 1000;
  public int g;
  public String h;
  public String i;
  public boolean j;
  public float k;
  public int l;
  public ArrayList<g.az> m;
  public ArrayList<g.az> n;
  public af o;
  public boolean p;
  public int q;
  public boolean r;
  public boolean s;
  public boolean t;
  public boolean u;
  public int v;
  public int w;
  public int x;
  public ArrayList<a> z;

  public u(g.ar paramar, AbstractMap<Integer, g.vw> paramAbstractMap, AbstractMap<Integer, g.i> paramAbstractMap1, boolean paramBoolean)
  {
    if (A == null)
    {
      A = new TextPaint(1);
      A.setColor(-16777216);
      A.linkColor = -14255946;
    }
    if (C == null)
    {
      C = new TextPaint(1);
      C.setColor(-16777216);
      C.linkColor = -14255946;
    }
    if (D == null)
    {
      D = new TextPaint(1);
      D.setTextSize(a.a(28.0F));
    }
    if (E == null)
    {
      E = new TextPaint(1);
      E.setTextSize(a.a(24.0F));
    }
    if (F == null)
    {
      F = new TextPaint(1);
      F.setTextSize(a.a(20.0F));
    }
    A.setTextSize(a.a(v.a().B));
    C.setTextSize(a.a(14.0F));
    this.a = paramar;
    if (paramar.K != null)
      this.e = new u(paramar.K, paramAbstractMap, paramAbstractMap1, false);
    g.vw localvw1 = null;
    if (paramar.c > 0)
    {
      if (paramAbstractMap != null)
        localvw1 = (g.vw)paramAbstractMap.get(Integer.valueOf(paramar.c));
      if (localvw1 == null)
        localvw1 = v.a().a(Integer.valueOf(paramar.c));
    }
    while (true)
    {
      int i1;
      if ((paramar instanceof g.oj))
      {
        if (paramar.f != null)
        {
          if (!(paramar.f instanceof g.ml))
            break label738;
          if (!j())
            break label716;
          this.b = r.a("ActionYouCreateGroup", 2131230805);
        }
        while (true)
        {
          if (this.b == null)
            this.b = "";
          d();
          c();
          paramar = new GregorianCalendar();
          paramar.setTimeInMillis(this.a.e * 1000L);
          i1 = paramar.get(6);
          int i2 = paramar.get(1);
          int i3 = paramar.get(2);
          this.h = String.format("%d_%02d_%02d", new Object[] { Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i1) });
          this.i = String.format("%d_%02d", new Object[] { Integer.valueOf(i2), Integer.valueOf(i3) });
          if ((this.a.i != null) && (this.a.b < 0) && (this.a.i.length() > 6) && ((I()) || (N())))
          {
            this.o = new af();
            if (!this.o.a(this.a.i))
              this.o = null;
          }
          i();
          if (!paramBoolean)
            break label3188;
          if ((this.a.j instanceof g.nz))
          {
            paramar = C;
            label556: if (!v.a().z)
              break label3148;
            paramAbstractMap = new int[1];
            label569: this.b = j.a(this.b, paramar.getFontMetricsInt(), a.a(20.0F), false, paramAbstractMap);
            if ((paramAbstractMap == null) || (paramAbstractMap[0] < 1) || (paramAbstractMap[0] > 3))
              break label3182;
            switch (paramAbstractMap[0])
            {
            default:
              paramar = F;
              i1 = a.a(24.0F);
              label647: paramAbstractMap = (j.c[])((Spannable)this.b).getSpans(0, this.b.length(), j.c.class);
              if ((paramAbstractMap == null) || (paramAbstractMap.length <= 0))
                break label3182;
              i2 = 0;
              while (i2 < paramAbstractMap.length)
              {
                paramAbstractMap[i2].a(paramar.getFontMetricsInt(), i1);
                i2 += 1;
              }
              label716: this.b = a(r.a("ActionCreateGroup", 2131230776), "un1", localvw1);
              continue;
              label738: if ((paramar.f instanceof g.mn))
              {
                if (paramar.f.i == paramar.c)
                {
                  if (j())
                  {
                    this.b = r.a("ActionYouLeftUser", 2131230807);
                    continue;
                  }
                  this.b = a(r.a("ActionLeftUser", 2131230782), "un1", localvw1);
                  continue;
                }
                paramAbstractMap1 = null;
                if (paramAbstractMap != null)
                  paramAbstractMap1 = (g.vw)paramAbstractMap.get(Integer.valueOf(paramar.f.i));
                paramAbstractMap = paramAbstractMap1;
                if (paramAbstractMap1 == null)
                  paramAbstractMap = v.a().a(Integer.valueOf(paramar.f.i));
                if (j())
                {
                  this.b = a(r.a("ActionYouKickUser", 2131230806), "un2", paramAbstractMap);
                  continue;
                }
                if (paramar.f.i == ad.c())
                {
                  this.b = a(r.a("ActionKickUserYou", 2131230781), "un1", localvw1);
                  continue;
                }
                this.b = a(r.a("ActionKickUser", 2131230780), "un2", paramAbstractMap);
                this.b = a(this.b, "un1", localvw1);
                continue;
              }
              if ((paramar.f instanceof g.mj))
              {
                i1 = this.a.f.i;
                if ((i1 != 0) || (this.a.f.e.size() != 1))
                  break label3204;
                i1 = ((Integer)this.a.f.e.get(0)).intValue();
              }
            case 1:
            case 2:
            }
          }
        }
      }
      label3204: 
      while (true)
      {
        if (i1 != 0)
        {
          paramAbstractMap1 = null;
          if (paramAbstractMap != null)
            paramAbstractMap1 = (g.vw)paramAbstractMap.get(Integer.valueOf(i1));
          paramAbstractMap = paramAbstractMap1;
          if (paramAbstractMap1 == null)
            paramAbstractMap = v.a().a(Integer.valueOf(i1));
          if (i1 == paramar.c)
          {
            if ((paramar.d.b != 0) && (!t()))
            {
              this.b = r.a("ChannelJoined", 2131230988);
              break;
            }
            if ((paramar.d.b != 0) && (t()))
            {
              if (i1 == ad.c())
              {
                this.b = r.a("ChannelMegaJoined", 2131230992);
                break;
              }
              this.b = a(r.a("ActionAddUserSelfMega", 2131230767), "un1", localvw1);
              break;
            }
            if (j())
            {
              this.b = r.a("ActionAddUserSelfYou", 2131230768);
              break;
            }
            this.b = a(r.a("ActionAddUserSelf", 2131230766), "un1", localvw1);
            break;
          }
          if (j())
          {
            this.b = a(r.a("ActionYouAddUser", 2131230802), "un2", paramAbstractMap);
            break;
          }
          if (i1 == ad.c())
          {
            if (paramar.d.b != 0)
            {
              if (t())
              {
                this.b = a(r.a("MegaAddedBy", 2131231412), "un1", localvw1);
                break;
              }
              this.b = a(r.a("ChannelAddedBy", 2131230963), "un1", localvw1);
              break;
            }
            this.b = a(r.a("ActionAddUserYou", 2131230769), "un1", localvw1);
            break;
          }
          this.b = a(r.a("ActionAddUser", 2131230765), "un2", paramAbstractMap);
          this.b = a(this.b, "un1", localvw1);
          break;
        }
        if (j())
        {
          this.b = a(r.a("ActionYouAddUser", 2131230802), "un2", paramar.f.e, paramAbstractMap);
          break;
        }
        this.b = a(r.a("ActionAddUser", 2131230765), "un2", paramar.f.e, paramAbstractMap);
        this.b = a(this.b, "un1", localvw1);
        break;
        if ((paramar.f instanceof g.mq))
        {
          if (j())
          {
            this.b = r.a("ActionInviteYou", 2131230779);
            break;
          }
          this.b = a(r.a("ActionInviteUser", 2131230778), "un1", localvw1);
          break;
        }
        if ((paramar.f instanceof g.mo))
        {
          if ((paramar.d.b != 0) && (!t()))
          {
            this.b = r.a("ActionChannelChangedPhoto", 2131230772);
            break;
          }
          if (j())
          {
            this.b = r.a("ActionYouChangedPhoto", 2131230803);
            break;
          }
          this.b = a(r.a("ActionChangedPhoto", 2131230770), "un1", localvw1);
          break;
        }
        if ((paramar.f instanceof g.mp))
        {
          if ((paramar.d.b != 0) && (!t()))
          {
            this.b = r.a("ActionChannelChangedTitle", 2131230773).replace("un2", paramar.f.b);
            break;
          }
          if (j())
          {
            this.b = r.a("ActionYouChangedTitle", 2131230804).replace("un2", paramar.f.b);
            break;
          }
          this.b = a(r.a("ActionChangedTitle", 2131230771).replace("un2", paramar.f.b), "un1", localvw1);
          break;
        }
        if ((paramar.f instanceof g.mm))
        {
          if ((paramar.d.b != 0) && (!t()))
          {
            this.b = r.a("ActionChannelRemovedPhoto", 2131230774);
            break;
          }
          if (j())
          {
            this.b = r.a("ActionYouRemovedPhoto", 2131230808);
            break;
          }
          this.b = a(r.a("ActionRemovedPhoto", 2131230797), "un1", localvw1);
          break;
        }
        if ((paramar.f instanceof g.na))
        {
          if (paramar.f.l != 0)
          {
            if (j())
            {
              this.b = r.a("MessageLifetimeChangedOutgoing", 2131231434, new Object[] { a.d(paramar.f.l) });
              break;
            }
            this.b = r.a("MessageLifetimeChanged", 2131231433, new Object[] { ae.d(localvw1), a.d(paramar.f.l) });
            break;
          }
          if (j())
          {
            this.b = r.a("MessageLifetimeYouRemoved", 2131231436);
            break;
          }
          this.b = r.a("MessageLifetimeRemoved", 2131231435, new Object[] { ae.d(localvw1) });
          break;
        }
        if ((paramar.f instanceof g.my))
        {
          long l1 = paramar.e * 1000L;
          String str;
          if ((r.a().c != null) && (r.a().f != null))
          {
            str = r.a("formatDateAtTime", 2131231995, new Object[] { r.a().f.a(l1), r.a().c.a(l1) });
            label2079: g.vw localvw2 = ad.d();
            paramAbstractMap1 = localvw2;
            if (localvw2 == null)
            {
              if (paramAbstractMap != null)
                localvw2 = (g.vw)paramAbstractMap.get(Integer.valueOf(this.a.d.c));
              paramAbstractMap1 = localvw2;
              if (localvw2 == null)
                paramAbstractMap1 = v.a().a(Integer.valueOf(this.a.d.c));
            }
            if (paramAbstractMap1 == null)
              break label2231;
          }
          label2231: for (paramAbstractMap = ae.d(paramAbstractMap1); ; paramAbstractMap = "")
          {
            this.b = r.a("NotificationUnrecognizedDevice", 2131231589, new Object[] { paramAbstractMap, str, paramar.f.b, paramar.f.c });
            break;
            str = "" + paramar.e;
            break label2079;
          }
        }
        if ((paramar.f instanceof g.nb))
        {
          this.b = r.a("NotificationContactJoined", 2131231550, new Object[] { ae.c(localvw1) });
          break;
        }
        if ((paramar.f instanceof g.nc))
        {
          this.b = r.a("NotificationContactNewPhoto", 2131231551, new Object[] { ae.c(localvw1) });
          break;
        }
        if ((paramar.f instanceof g.ne))
        {
          if ((paramar.f.d instanceof g.gt))
          {
            if (j())
            {
              this.b = r.a("ActionTakeScreenshootYou", 2131230799, new Object[0]);
              break;
            }
            this.b = a(r.a("ActionTakeScreenshoot", 2131230798), "un1", localvw1);
            break;
          }
          if (!(paramar.f.d instanceof g.gu))
            break;
          paramar = (g.gu)paramar.f.d;
          if (paramar.b != 0)
          {
            if (j())
            {
              this.b = r.a("MessageLifetimeChangedOutgoing", 2131231434, new Object[] { a.d(paramar.b) });
              break;
            }
            this.b = r.a("MessageLifetimeChanged", 2131231433, new Object[] { ae.d(localvw1), a.d(paramar.b) });
            break;
          }
          if (j())
          {
            this.b = r.a("MessageLifetimeYouRemoved", 2131231436);
            break;
          }
          this.b = r.a("MessageLifetimeRemoved", 2131231435, new Object[] { ae.d(localvw1) });
          break;
        }
        if ((paramar.f instanceof g.ms))
        {
          this.b = r.a("YouCreatedBroadcastList", 2131231976, new Object[0]);
          break;
        }
        if ((paramar.f instanceof g.mh))
        {
          if (t())
          {
            this.b = r.a("ActionCreateMega", 2131230777);
            break;
          }
          this.b = r.a("ActionCreateChannel", 2131230775);
          break;
        }
        if ((paramar.f instanceof g.mr))
        {
          this.b = r.a("ActionMigrateFromGroup", 2131230783);
          break;
        }
        if ((paramar.f instanceof g.mi))
        {
          this.b = r.a("ActionMigrateFromGroup", 2131230783);
          break;
        }
        if ((paramar.f instanceof g.mz))
        {
          if (localvw1 == null);
          for (paramar = (g.i)paramAbstractMap1.get(Integer.valueOf(paramar.d.b)); ; paramar = null)
          {
            a(localvw1, paramar);
            break;
          }
        }
        if ((paramar.f instanceof g.mx))
        {
          this.b = r.a("HistoryCleared", 2131231291);
          break;
        }
        if (!(paramar.f instanceof g.mu))
          break;
        a(localvw1);
        break;
        if (!U())
        {
          if ((paramar.j instanceof g.ob))
          {
            this.b = r.a("AttachPhoto", 2131230900);
            break;
          }
          if (I())
          {
            this.b = r.a("AttachVideo", 2131230902);
            break;
          }
          if (H())
          {
            this.b = r.a("AttachAudio", 2131230892);
            break;
          }
          if (((paramar.j instanceof g.oa)) || ((paramar.j instanceof g.of)))
          {
            this.b = r.a("AttachLocation", 2131230898);
            break;
          }
          if ((paramar.j instanceof g.nv))
          {
            this.b = r.a("AttachContact", 2131230894);
            break;
          }
          if ((paramar.j instanceof g.nz))
          {
            this.b = paramar.i;
            break;
          }
          if ((paramar.j instanceof g.od))
          {
            this.b = r.a("UnsupportedMedia", 2131231919);
            break;
          }
          if (!(paramar.j instanceof g.nw))
            break;
          if (E())
          {
            paramar = B();
            if ((paramar != null) && (paramar.length() > 0))
            {
              this.b = String.format("%s %s", new Object[] { paramar, r.a("AttachSticker", 2131230901) });
              break;
            }
            this.b = r.a("AttachSticker", 2131230901);
            break;
          }
          if (G())
          {
            this.b = r.a("AttachMusic", 2131230899);
            break;
          }
          if (L())
          {
            this.b = r.a("AttachGif", 2131230897);
            break;
          }
          paramar = m.b(paramar.j.k);
          if ((paramar != null) && (paramar.length() > 0))
          {
            this.b = paramar;
            break;
          }
          this.b = r.a("AttachDocument", 2131230895);
          break;
        }
        this.b = paramar.i;
        break;
        paramar = A;
        break label556;
        label3148: paramAbstractMap = null;
        break label569;
        paramar = D;
        i1 = a.a(32.0F);
        break label647;
        paramar = E;
        i1 = a.a(28.0F);
        break label647;
        label3182: b(localvw1);
        label3188: this.G = paramBoolean;
        a(false);
        W();
        return;
      }
      continue;
      localvw1 = null;
    }
  }

  public u(g.ar paramar, AbstractMap<Integer, g.vw> paramAbstractMap, boolean paramBoolean)
  {
    this(paramar, paramAbstractMap, null, paramBoolean);
  }

  public static int a(g.ar paramar)
  {
    int i1 = 0;
    if (!paramar.o)
      i1 = 1;
    int i2 = i1;
    if (!paramar.m)
      i2 = i1 | 0x2;
    return i2;
  }

  public static void a(CharSequence paramCharSequence)
  {
    a(paramCharSequence, true);
  }

  public static void a(CharSequence paramCharSequence, boolean paramBoolean)
  {
    if ((!(paramCharSequence instanceof Spannable)) || (!b(paramCharSequence)) || (paramCharSequence.length() < 200));
    while (true)
    {
      try
      {
        Linkify.addLinks((Spannable)paramCharSequence, 5);
        b(paramCharSequence, paramBoolean);
        return;
      }
      catch (Exception localException1)
      {
        n.a("tmessages", localException1);
        continue;
      }
      try
      {
        Linkify.addLinks((Spannable)paramCharSequence, 1);
      }
      catch (Exception localException2)
      {
        n.a("tmessages", localException2);
      }
    }
  }

  public static void a(g.ar paramar, int paramInt)
  {
    boolean bool2 = true;
    if ((paramInt & 0x1) == 0)
    {
      bool1 = true;
      paramar.o = bool1;
      if ((paramInt & 0x2) != 0)
        break label34;
    }
    label34: for (boolean bool1 = bool2; ; bool1 = false)
    {
      paramar.m = bool1;
      return;
      bool1 = false;
      break;
    }
  }

  public static boolean a(g.ar paramar, g.i parami)
  {
    int i2 = 1;
    if ((paramar == null) || (paramar.d == null) || ((paramar.f != null) && (!(paramar.f instanceof g.mt))) || (m(paramar)) || (paramar.x != 0) || (paramar.b < 0));
    label195: g.i locali;
    do
      do
      {
        do
        {
          return false;
          if ((paramar.c == paramar.d.c) && (paramar.c == ad.c()))
            return true;
        }
        while (Math.abs(paramar.e - ConnectionsManager.a().b()) > v.a().G);
        if (paramar.d.b == 0)
        {
          if ((paramar.n) || (paramar.c == ad.c()))
          {
            i1 = i2;
            if (!(paramar.j instanceof g.ob))
              if ((paramar.j instanceof g.nw))
              {
                i1 = i2;
                if (!f(paramar));
              }
              else
              {
                i1 = i2;
                if (!(paramar.j instanceof g.ny))
                {
                  i1 = i2;
                  if (!(paramar.j instanceof g.oi))
                    if (paramar.j != null)
                      break label195;
                }
              }
          }
          for (int i1 = i2; ; i1 = 0)
            return i1;
        }
        locali = parami;
        if (parami != null)
          break;
        locali = parami;
        if (paramar.d.b == 0)
          break;
        locali = v.a().b(Integer.valueOf(paramar.d.b));
      }
      while (locali == null);
    while (((!locali.r) || (!paramar.n)) && ((locali.r) || ((!locali.c) && ((!locali.n) || (!d(paramar)))) || (!paramar.v) || ((!(paramar.j instanceof g.ob)) && ((!(paramar.j instanceof g.nw)) || (f(paramar))) && (!(paramar.j instanceof g.ny)) && (!(paramar.j instanceof g.oi)) && (paramar.j != null))));
    return true;
  }

  public static boolean a(g.q paramq)
  {
    return (paramq != null) && (paramq.i != null) && (paramq.g != null) && ((paramq.g.equals("image/gif")) || (b(paramq)));
  }

  public static TextPaint b()
  {
    if (A == null)
    {
      A = new TextPaint(1);
      A.setColor(-16777216);
      A.linkColor = -14255946;
    }
    if (C == null)
    {
      C = new TextPaint(1);
      C.setColor(-16777216);
      C.linkColor = -14255946;
    }
    if (D == null)
    {
      D = new TextPaint(1);
      D.setTextSize(a.a(28.0F));
    }
    if (E == null)
    {
      E = new TextPaint(1);
      E.setTextSize(a.a(24.0F));
    }
    if (F == null)
    {
      F = new TextPaint(1);
      F.setTextSize(a.a(20.0F));
    }
    A.setTextSize(a.a(v.a().B));
    C.setTextSize(a.a(14.0F));
    return A;
  }

  private static void b(CharSequence paramCharSequence, boolean paramBoolean)
  {
    label153: label178: label184: 
    while (true)
    {
      int i1;
      int i2;
      try
      {
        if (y != null)
          continue;
        y = Pattern.compile("(^|\\s)/[a-zA-Z@\\d_]{1,255}|(^|\\s)@[a-zA-Z\\d_]{1,32}|(^|\\s)#[\\w\\.]+");
        Matcher localMatcher = y.matcher(paramCharSequence);
        if (localMatcher.find())
        {
          i1 = localMatcher.start();
          i2 = localMatcher.end();
          if ((paramCharSequence.charAt(i1) == '@') || (paramCharSequence.charAt(i1) == '#') || (paramCharSequence.charAt(i1) == '/'))
            break label184;
          i1 += 1;
          if (paramCharSequence.charAt(i1) != '/')
            break label153;
          if (!paramBoolean)
            break label178;
          localObject = new URLSpanBotCommand(paramCharSequence.subSequence(i1, i2).toString());
          if (localObject == null)
            continue;
          ((Spannable)paramCharSequence).setSpan(localObject, i1, i2, 0);
          continue;
        }
      }
      catch (Exception paramCharSequence)
      {
        n.a("tmessages", paramCharSequence);
      }
      return;
      Object localObject = new URLSpanNoUnderline(paramCharSequence.subSequence(i1, i2).toString());
      continue;
      localObject = null;
      continue;
    }
  }

  private static boolean b(CharSequence paramCharSequence)
  {
    int i12 = 1;
    int i11;
    if ((paramCharSequence == null) || (paramCharSequence.length() < 2) || (paramCharSequence.length() > 20480))
      i11 = 0;
    int i6;
    int i7;
    int i4;
    int i5;
    int i8;
    label58: int i9;
    int i3;
    int i1;
    int i2;
    while (true)
    {
      return i11;
      int i10 = paramCharSequence.length();
      i6 = 0;
      i7 = 0;
      i4 = 0;
      i5 = 0;
      i8 = 0;
      if (i6 >= i10)
        break label344;
      i9 = paramCharSequence.charAt(i6);
      if ((i9 < 48) || (i9 > 57))
        break;
      i3 = i8 + 1;
      i11 = i12;
      if (i3 >= 6)
        continue;
      i1 = 0;
      i2 = 0;
      label108: if ((i9 == 64) || (i9 == 35) || (i9 == 47))
      {
        i11 = i12;
        if (i6 == 0)
          continue;
      }
      if (i6 != 0)
      {
        i11 = i12;
        if (paramCharSequence.charAt(i6 - 1) == ' ')
          continue;
        i11 = i12;
        if (paramCharSequence.charAt(i6 - 1) == '\n')
          continue;
      }
      if (i9 != 58)
        break label253;
      if (i1 != 0)
        break label248;
      i1 = 1;
    }
    while (true)
    {
      i6 += 1;
      i7 = i9;
      i4 = i2;
      i5 = i1;
      i8 = i3;
      break label58;
      if (i9 != 32)
      {
        i2 = i4;
        i1 = i5;
        i3 = i8;
        if (i8 > 0)
          break label108;
      }
      i3 = 0;
      i2 = i4;
      i1 = i5;
      break label108;
      label248: i1 = 0;
      continue;
      label253: if (i9 == 47)
      {
        i11 = i12;
        if (i1 == 2)
          break;
        if (i1 == 1)
        {
          i1 += 1;
          continue;
        }
        i1 = 0;
        continue;
      }
      if (i9 == 46)
      {
        if ((i2 == 0) && (i7 != 32))
        {
          i2 += 1;
          continue;
        }
        i2 = 0;
        continue;
      }
      if ((i9 != 32) && (i7 == 46))
      {
        i11 = i12;
        if (i2 == 1)
          break;
      }
      i2 = 0;
    }
    label344: return false;
  }

  public static boolean b(g.ar paramar)
  {
    return paramar.o;
  }

  public static boolean b(g.ar paramar, g.i parami)
  {
    int i1 = 0;
    if (paramar.b < 0);
    g.i locali;
    do
    {
      do
      {
        return true;
        locali = parami;
        if (parami == null)
        {
          locali = parami;
          if (paramar.d.b != 0)
            locali = v.a().b(Integer.valueOf(paramar.d.b));
        }
        if (!e.d(locali))
          break;
        if (paramar.b == 1)
          return false;
      }
      while (locali.c);
      if (!locali.n)
        break label116;
    }
    while ((d(paramar)) || ((paramar.c > 0) && (!paramar.v)));
    label116: 
    do
      while (true)
      {
        if ((d(paramar)) || (!e.d(locali)))
          i1 = 1;
        return i1;
        if (!locali.o)
          break;
        if ((paramar.c > 0) && (!paramar.v))
          return true;
      }
    while ((!d(paramar)) || (paramar.c <= 0));
    return true;
  }

  public static boolean b(g.q paramq)
  {
    int i3 = 0;
    int i2 = i3;
    int i1;
    if (paramq != null)
    {
      i2 = i3;
      if (paramq.g != null)
      {
        i2 = i3;
        if (paramq.g.equals("video/mp4"))
          i1 = 0;
      }
    }
    while (true)
    {
      i2 = i3;
      if (i1 < paramq.o.size())
      {
        if ((paramq.o.get(i1) instanceof g.ht))
          i2 = 1;
      }
      else
        return i2;
      i1 += 1;
    }
  }

  public static boolean c(g.ar paramar)
  {
    return (paramar.k & 0x80000000) != 0;
  }

  public static boolean c(g.q paramq)
  {
    int i3 = 0;
    int i2 = i3;
    int i1;
    if (paramq != null)
      i1 = 0;
    while (true)
    {
      i2 = i3;
      if (i1 < paramq.o.size())
      {
        if (((g.r)paramq.o.get(i1) instanceof g.ia))
          i2 = 1;
      }
      else
        return i2;
      i1 += 1;
    }
  }

  public static boolean d(g.ar paramar)
  {
    return paramar.n;
  }

  public static boolean d(g.q paramq)
  {
    int i3 = 0;
    int i2 = i3;
    int i1;
    if (paramq != null)
      i1 = 0;
    while (true)
    {
      i2 = i3;
      if (i1 < paramq.o.size())
      {
        g.r localr = (g.r)paramq.o.get(i1);
        if (((localr instanceof g.ia)) && (localr.j))
          i2 = 1;
      }
      else
      {
        return i2;
      }
      i1 += 1;
    }
  }

  public static long e(g.ar paramar)
  {
    if ((paramar.E == 0L) && (paramar.d != null))
    {
      if (paramar.d.d == 0)
        break label71;
      if (paramar.d.d >= 0)
        break label55;
      paramar.E = a.a(paramar.d.d);
    }
    while (true)
    {
      return paramar.E;
      label55: paramar.E = (-paramar.d.d);
      continue;
      label71: if (paramar.d.b != 0)
      {
        paramar.E = (-paramar.d.b);
        continue;
      }
      if (d(paramar))
      {
        paramar.E = paramar.d.c;
        continue;
      }
      paramar.E = paramar.c;
    }
  }

  public static boolean e(g.q paramq)
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    int i1;
    if (paramq != null)
      i1 = 0;
    while (true)
    {
      bool1 = bool2;
      if (i1 < paramq.o.size())
      {
        g.r localr = (g.r)paramq.o.get(i1);
        if ((localr instanceof g.hu))
          bool1 = localr.m;
      }
      else
      {
        return bool1;
      }
      i1 += 1;
    }
  }

  public static boolean f(g.ar paramar)
  {
    return (paramar.j != null) && (paramar.j.k != null) && (c(paramar.j.k));
  }

  public static boolean f(g.q paramq)
  {
    int i3 = 0;
    int i2 = i3;
    int i1;
    if (paramq != null)
      i1 = 0;
    while (true)
    {
      i2 = i3;
      if (i1 < paramq.o.size())
      {
        g.r localr = (g.r)paramq.o.get(i1);
        if (!(localr instanceof g.hu))
          break label58;
        i2 = i3;
        if (!localr.m)
          i2 = 1;
      }
      return i2;
      label58: i1 += 1;
    }
  }

  public static boolean g(g.ar paramar)
  {
    return (paramar.j != null) && (paramar.j.k != null) && (d(paramar.j.k));
  }

  public static boolean g(g.q paramq)
  {
    if (paramq != null)
    {
      int i1 = 0;
      int i2 = 0;
      int i3 = 0;
      if (i1 < paramq.o.size())
      {
        g.r localr = (g.r)paramq.o.get(i1);
        int i4;
        if ((localr instanceof g.ie))
          i4 = 1;
        while (true)
        {
          i1 += 1;
          i2 = i4;
          break;
          i4 = i2;
          if (!(localr instanceof g.ht))
            continue;
          i3 = 1;
          i4 = i2;
        }
      }
      return (i2 != 0) && (i3 == 0);
    }
    return false;
  }

  public static boolean h(g.ar paramar)
  {
    if ((paramar.j instanceof g.oi))
      return f(paramar.j.r.s);
    return (paramar.j != null) && (paramar.j.k != null) && (f(paramar.j.k));
  }

  public static boolean i(g.ar paramar)
  {
    if ((paramar.j instanceof g.oi))
      return e(paramar.j.r.s);
    return (paramar.j != null) && (paramar.j.k != null) && (e(paramar.j.k));
  }

  public static boolean j(g.ar paramar)
  {
    if ((paramar.j instanceof g.oi))
      return g(paramar.j.r.s);
    return (paramar.j != null) && (paramar.j.k != null) && (g(paramar.j.k));
  }

  public static boolean k(g.ar paramar)
  {
    return paramar.j instanceof g.nz;
  }

  public static g.an l(g.ar paramar)
  {
    if ((paramar.j != null) && (paramar.j.k != null))
    {
      paramar = paramar.j.k.o.iterator();
      while (paramar.hasNext())
      {
        g.r localr = (g.r)paramar.next();
        if (!(localr instanceof g.ia))
          continue;
        if ((localr.c instanceof g.lq))
          return null;
        return localr.c;
      }
    }
    return null;
  }

  public static boolean m(g.ar paramar)
  {
    return (paramar.k & 0x4) != 0;
  }

  public static boolean n(g.ar paramar)
  {
    return (paramar == null) || (paramar.j == null) || ((paramar.j instanceof g.ny)) || ((paramar.j instanceof g.oi));
  }

  public g.q A()
  {
    if ((this.a.j instanceof g.oi))
      return this.a.j.r.s;
    if (this.a.j != null)
      return this.a.j.k;
    return null;
  }

  public String B()
  {
    if ((this.a.j != null) && (this.a.j.k != null))
    {
      Iterator localIterator = this.a.j.k.o.iterator();
      while (localIterator.hasNext())
      {
        g.r localr = (g.r)localIterator.next();
        if ((localr instanceof g.ia))
          return localr.b;
      }
    }
    return null;
  }

  public int C()
  {
    int i3 = 0;
    int i2;
    int i1;
    if (this.f == 0)
    {
      i2 = this.x;
      if (((this.a.j instanceof g.oi)) && ((this.a.j.r instanceof g.vp)));
      for (i1 = a.a(100.0F); ; i1 = 0)
      {
        i2 = i1 + i2;
        i1 = i2;
        if (T())
          i1 = i2 + a.a(42.0F);
        return i1;
      }
    }
    if (this.f == 2)
      return a.a(72.0F);
    if (this.f == 12)
      return a.a(71.0F);
    if (this.f == 9)
      return a.a(100.0F);
    if (this.f == 4)
      return a.a(114.0F);
    if (this.f == 14)
      return a.a(82.0F);
    if (this.f == 10)
      return a.a(30.0F);
    if (this.f == 11)
      return a.a(50.0F);
    float f2;
    float f1;
    Object localObject;
    if (this.f == 13)
    {
      f2 = a.c.y * 0.4F;
      if (a.c())
      {
        f1 = a.e() * 0.5F;
        localObject = this.a.j.k.o.iterator();
        while (((Iterator)localObject).hasNext())
        {
          g.r localr = (g.r)((Iterator)localObject).next();
          if (!(localr instanceof g.hz))
            continue;
          i1 = localr.h;
          i3 = localr.i;
        }
      }
    }
    while (true)
    {
      i2 = i1;
      if (i1 == 0)
      {
        i3 = (int)f2;
        i2 = a.a(100.0F) + i3;
      }
      if (i3 > f2)
        i2 = (int)(i2 * (f2 / i3));
      for (i1 = (int)f2; ; i1 = i3)
      {
        i3 = i1;
        if (i2 > f1)
          i3 = (int)(i1 * (f1 / i2));
        return i3 + a.a(14.0F);
        f1 = a.c.x * 0.5F;
        break;
        if (a.c())
        {
          i1 = (int)(a.e() * 0.7F);
          i2 = a.a(100.0F) + i1;
          i3 = i1;
          if (i1 > a.f())
            i3 = a.f();
          i1 = i2;
          if (i2 > a.f())
            i1 = a.f();
          localObject = m.a(this.m, a.f());
          i2 = i1;
          if (localObject != null)
          {
            f1 = ((g.az)localObject).d / i3;
            i3 = (int)(((g.az)localObject).e / f1);
            i2 = i3;
            if (i3 == 0)
              i2 = a.a(100.0F);
            if (i2 <= i1)
              break label565;
          }
        }
        while (true)
        {
          label504: i2 = i1;
          if (r())
            if (!a.c())
              break label586;
          label565: label586: for (i2 = (int)(a.e() * 0.5F); ; i2 = (int)(Math.min(a.c.x, a.c.y) * 0.5F))
          {
            return a.a(14.0F) + i2;
            i1 = (int)(Math.min(a.c.x, a.c.y) * 0.7F);
            break;
            if (i2 >= a.a(120.0F))
              break label612;
            i1 = a.a(120.0F);
            break label504;
          }
          label612: i1 = i2;
        }
      }
      i1 = 0;
    }
  }

  public String D()
  {
    int i1 = 0;
    while (i1 < this.a.j.k.o.size())
    {
      g.r localr = (g.r)this.a.j.k.o.get(i1);
      if ((localr instanceof g.ia))
      {
        if ((localr.b != null) && (localr.b.length() > 0))
          return localr.b;
        return null;
      }
      i1 += 1;
    }
    return null;
  }

  public boolean E()
  {
    if (this.f != 1000)
      return this.f == 13;
    return f(this.a);
  }

  public boolean F()
  {
    return g(this.a);
  }

  public boolean G()
  {
    return h(this.a);
  }

  public boolean H()
  {
    return i(this.a);
  }

  public boolean I()
  {
    return j(this.a);
  }

  public boolean J()
  {
    return k(this.a);
  }

  public boolean K()
  {
    return (this.a.j != null) && (this.a.j.d != null) && (this.a.j.d.j);
  }

  public boolean L()
  {
    return ((this.a.j instanceof g.nw)) && (a(this.a.j.k));
  }

  public boolean M()
  {
    return ((this.a.j instanceof g.oi)) && (this.a.j.r.s != null) && (!a(this.a.j.r.s));
  }

  public boolean N()
  {
    return (this.a.j != null) && (b(this.a.j.k));
  }

  public String O()
  {
    Object localObject2;
    int i1;
    if (this.f == 0)
    {
      localObject2 = this.a.j.r.s;
      i1 = 0;
    }
    while (true)
    {
      if (i1 >= ((g.q)localObject2).o.size())
        break label145;
      Object localObject1 = (g.r)((g.q)localObject2).o.get(i1);
      if ((localObject1 instanceof g.hu))
      {
        if (((g.r)localObject1).m)
          localObject1 = r.b(this.a.e);
        label110: 
        do
        {
          String str;
          do
          {
            return localObject1;
            localObject2 = this.a.j.k;
            break;
            str = ((g.r)localObject1).k;
            if (str == null)
              break label110;
            localObject1 = str;
          }
          while (str.length() != 0);
          localObject2 = m.b((g.q)localObject2);
          if (localObject2 == null)
            break label128;
          localObject1 = localObject2;
        }
        while (((String)localObject2).length() != 0);
        label128: return r.a("AudioUnknownTitle", 2131230905);
      }
      i1 += 1;
    }
    label145: return (String)(String)"";
  }

  public int P()
  {
    int i3 = 0;
    g.q localq;
    int i1;
    if (this.f == 0)
    {
      localq = this.a.j.r.s;
      i1 = 0;
    }
    while (true)
    {
      int i2 = i3;
      if (i1 < localq.o.size())
      {
        g.r localr = (g.r)localq.o.get(i1);
        if ((localr instanceof g.hu))
          i2 = localr.d;
      }
      else
      {
        return i2;
        localq = this.a.j.k;
        break;
      }
      i1 += 1;
    }
  }

  public String Q()
  {
    Object localObject2 = null;
    Object localObject1;
    int i1;
    if (this.f == 0)
    {
      localObject1 = this.a.j.r.s;
      i1 = 0;
    }
    while (true)
    {
      if (i1 >= ((g.q)localObject1).o.size())
        break label322;
      g.r localr = (g.r)((g.q)localObject1).o.get(i1);
      if ((localr instanceof g.hu))
      {
        if (localr.m)
          if ((k()) || ((this.a.w != null) && (this.a.w.d == ad.c())))
            localObject1 = r.a("FromYou", 2131231271);
        do
        {
          return localObject1;
          localObject1 = this.a.j.k;
          break;
          if ((this.a.w != null) && (this.a.w.f != 0))
            localObject1 = v.a().b(Integer.valueOf(this.a.w.f));
          while (localObject2 != null)
          {
            return ae.c((g.vw)localObject2);
            if ((this.a.w != null) && (this.a.w.d != 0))
            {
              localObject2 = v.a().a(Integer.valueOf(this.a.w.d));
              localObject1 = null;
              continue;
            }
            if (this.a.c < 0)
            {
              localObject1 = v.a().b(Integer.valueOf(-this.a.c));
              continue;
            }
            localObject2 = v.a().a(Integer.valueOf(this.a.c));
            localObject1 = null;
          }
          if (localObject1 != null)
            return ((g.i)localObject1).i;
          localObject2 = localr.l;
          if (localObject2 == null)
            break label305;
          localObject1 = localObject2;
        }
        while (((String)localObject2).length() != 0);
        label305: return r.a("AudioUnknownArtist", 2131230904);
      }
      i1 += 1;
    }
    label322: return (String)(String)"";
  }

  public g.an R()
  {
    return l(this.a);
  }

  public boolean S()
  {
    return m(this.a);
  }

  public boolean T()
  {
    return ((this.e == null) || (!(this.e.a instanceof g.nd))) && ((this.a.g != 0) || (this.a.h != 0L)) && ((this.a.k & 0x8) != 0);
  }

  public boolean U()
  {
    return n(this.a);
  }

  public String V()
  {
    if (this.a.w != null)
    {
      Object localObject;
      if (this.a.w.f != 0)
      {
        localObject = v.a().b(Integer.valueOf(this.a.w.f));
        if (localObject != null)
          return ((g.i)localObject).i;
      }
      else if (this.a.w.d != 0)
      {
        localObject = v.a().a(Integer.valueOf(this.a.w.d));
        if (localObject != null)
          return ae.c((g.vw)localObject);
      }
    }
    return (String)null;
  }

  public void W()
  {
    this.r = false;
    this.s = false;
    if (this.f == 1)
      if (m.a(this.m, a.f()) != null)
        this.s = m.b(this.a).exists();
    Object localObject;
    do
    {
      do
      {
        while (true)
        {
          return;
          if ((this.f != 8) && (this.f != 3) && (this.f != 9) && (this.f != 2) && (this.f != 14))
            break;
          if ((this.a.A != null) && (this.a.A.length() > 0))
            this.r = new File(this.a.A).exists();
          if (this.r)
            continue;
          this.s = m.b(this.a).exists();
          return;
        }
        localObject = A();
        if (localObject == null)
          continue;
        this.s = m.a((f)localObject).exists();
        return;
      }
      while (this.f != 0);
      localObject = m.a(this.m, a.f());
    }
    while ((localObject == null) || (localObject == null));
    this.s = m.a((f)localObject, true).exists();
  }

  public CharSequence a(CharSequence paramCharSequence, String paramString, ArrayList<Integer> paramArrayList, AbstractMap<Integer, g.vw> paramAbstractMap)
  {
    Object localObject1 = paramCharSequence;
    if (TextUtils.indexOf(paramCharSequence, paramString) >= 0)
    {
      SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder("");
      int i1 = 0;
      while (i1 < paramArrayList.size())
      {
        localObject1 = null;
        if (paramAbstractMap != null)
          localObject1 = (g.vw)paramAbstractMap.get(paramArrayList.get(i1));
        Object localObject2 = localObject1;
        if (localObject1 == null)
          localObject2 = v.a().a((Integer)paramArrayList.get(i1));
        if (localObject2 != null)
        {
          localObject1 = ae.c((g.vw)localObject2);
          int i2 = localSpannableStringBuilder.length();
          if (localSpannableStringBuilder.length() != 0)
            localSpannableStringBuilder.append(", ");
          localSpannableStringBuilder.append((CharSequence)localObject1);
          localSpannableStringBuilder.setSpan(new URLSpanNoUnderlineBold("" + ((g.vw)localObject2).d), i2, ((String)localObject1).length() + i2, 33);
        }
        i1 += 1;
      }
      localObject1 = TextUtils.replace(paramCharSequence, new String[] { paramString }, new CharSequence[] { localSpannableStringBuilder });
    }
    return (CharSequence)(CharSequence)localObject1;
  }

  public CharSequence a(CharSequence paramCharSequence, String paramString, f paramf)
  {
    int i1 = TextUtils.indexOf(paramCharSequence, paramString);
    Object localObject = paramCharSequence;
    if (i1 >= 0)
    {
      if (!(paramf instanceof g.vw))
        break label134;
      localObject = ae.c((g.vw)paramf);
      paramf = "" + ((g.vw)paramf).d;
    }
    while (true)
    {
      paramCharSequence = new SpannableStringBuilder(TextUtils.replace(paramCharSequence, new String[] { paramString }, new String[] { localObject }));
      paramCharSequence.setSpan(new URLSpanNoUnderlineBold("" + paramf), i1, ((String)localObject).length() + i1, 33);
      localObject = paramCharSequence;
      return localObject;
      label134: if ((paramf instanceof g.i))
      {
        localObject = ((g.i)paramf).i;
        paramf = "" + -((g.i)paramf).h;
        continue;
      }
      if ((paramf instanceof g.jb))
      {
        localObject = ((g.jb)paramf).g;
        paramf = "game";
        continue;
      }
      localObject = "";
      paramf = "0";
    }
  }

  public void a()
  {
    if (TextUtils.isEmpty(this.a.i))
      return;
    g.vw localvw = null;
    if (l())
      localvw = v.a().a(Integer.valueOf(this.a.c));
    this.b = this.a.i;
    if ((this.a.j instanceof g.nz));
    for (TextPaint localTextPaint = C; ; localTextPaint = A)
    {
      this.b = j.a(this.b, localTextPaint.getFontMetricsInt(), a.a(20.0F), false);
      b(localvw);
      return;
    }
  }

  public void a(g.vw paramvw)
  {
    g.vw localvw = paramvw;
    if (paramvw == null)
    {
      localvw = paramvw;
      if (this.a.c > 0)
        localvw = v.a().a(Integer.valueOf(this.a.c));
    }
    Object localObject = null;
    paramvw = localObject;
    if (this.e != null)
    {
      paramvw = localObject;
      if (this.e.a.j != null)
      {
        paramvw = localObject;
        if (this.e.a.j.m != null)
          paramvw = this.e.a.j.m;
      }
    }
    if (paramvw == null)
    {
      if ((localvw != null) && (localvw.d == ad.c()))
      {
        this.b = r.a("ActionYouScored", 2131230809, new Object[] { r.b("Points", this.a.f.n) });
        return;
      }
      this.b = a(r.a("ActionUserScored", 2131230800, new Object[] { r.b("Points", this.a.f.n) }), "un1", localvw);
      return;
    }
    if ((localvw != null) && (localvw.d == ad.c()));
    for (this.b = r.a("ActionYouScoredInGame", 2131230810, new Object[] { r.b("Points", this.a.f.n) }); ; this.b = a(r.a("ActionUserScoredInGame", 2131230801, new Object[] { r.b("Points", this.a.f.n) }), "un1", localvw))
    {
      this.b = a(this.b, "un2", paramvw);
      return;
    }
  }

  public void a(g.vw paramvw, g.i parami)
  {
    Object localObject = paramvw;
    g.i locali = parami;
    if (paramvw == null)
    {
      localObject = paramvw;
      locali = parami;
      if (parami == null)
      {
        if (this.a.c > 0)
          paramvw = v.a().a(Integer.valueOf(this.a.c));
        localObject = paramvw;
        locali = parami;
        if (paramvw == null)
        {
          locali = v.a().b(Integer.valueOf(this.a.d.b));
          localObject = paramvw;
        }
      }
    }
    if (this.e == null)
    {
      paramvw = r.a("ActionPinnedNoText", 2131230791);
      if (localObject != null);
      while (true)
      {
        this.b = a(paramvw, "un1", (f)localObject);
        return;
        localObject = locali;
      }
    }
    if (this.e.G())
    {
      paramvw = r.a("ActionPinnedMusic", 2131230790);
      if (localObject != null);
      while (true)
      {
        this.b = a(paramvw, "un1", (f)localObject);
        return;
        localObject = locali;
      }
    }
    if (this.e.I())
    {
      paramvw = r.a("ActionPinnedVideo", 2131230795);
      if (localObject != null);
      while (true)
      {
        this.b = a(paramvw, "un1", (f)localObject);
        return;
        localObject = locali;
      }
    }
    if (this.e.L())
    {
      paramvw = r.a("ActionPinnedGif", 2131230789);
      if (localObject != null);
      while (true)
      {
        this.b = a(paramvw, "un1", (f)localObject);
        return;
        localObject = locali;
      }
    }
    if (this.e.H())
    {
      paramvw = r.a("ActionPinnedVoice", 2131230796);
      if (localObject != null);
      while (true)
      {
        this.b = a(paramvw, "un1", (f)localObject);
        return;
        localObject = locali;
      }
    }
    if (this.e.E())
    {
      paramvw = r.a("ActionPinnedSticker", 2131230793);
      if (localObject != null);
      while (true)
      {
        this.b = a(paramvw, "un1", (f)localObject);
        return;
        localObject = locali;
      }
    }
    if ((this.e.a.j instanceof g.nw))
    {
      paramvw = r.a("ActionPinnedFile", 2131230786);
      if (localObject != null);
      while (true)
      {
        this.b = a(paramvw, "un1", (f)localObject);
        return;
        localObject = locali;
      }
    }
    if ((this.e.a.j instanceof g.oa))
    {
      paramvw = r.a("ActionPinnedGeo", 2131230788);
      if (localObject != null);
      while (true)
      {
        this.b = a(paramvw, "un1", (f)localObject);
        return;
        localObject = locali;
      }
    }
    if ((this.e.a.j instanceof g.nv))
    {
      paramvw = r.a("ActionPinnedContact", 2131230785);
      if (localObject != null);
      while (true)
      {
        this.b = a(paramvw, "un1", (f)localObject);
        return;
        localObject = locali;
      }
    }
    if ((this.e.a.j instanceof g.ob))
    {
      paramvw = r.a("ActionPinnedPhoto", 2131230792);
      if (localObject != null);
      while (true)
      {
        this.b = a(paramvw, "un1", (f)localObject);
        return;
        localObject = locali;
      }
    }
    if ((this.e.a.j instanceof g.nz))
    {
      paramvw = r.a("ActionPinnedGame", 2131230787, new Object[] { "🎮 " + this.e.a.j.m.g });
      if (localObject != null);
      while (true)
      {
        this.b = a(paramvw, "un1", (f)localObject);
        this.b = j.a(this.b, A.getFontMetricsInt(), a.a(20.0F), false);
        return;
        localObject = locali;
      }
    }
    if ((this.e.b != null) && (this.e.b.length() > 0))
    {
      parami = this.e.b;
      paramvw = parami;
      if (parami.length() > 20)
        paramvw = parami.subSequence(0, 20) + "...";
      paramvw = r.a("ActionPinnedText", 2131230794, new Object[] { j.a(paramvw, A.getFontMetricsInt(), a.a(20.0F), false) });
      if (localObject != null);
      while (true)
      {
        this.b = a(paramvw, "un1", (f)localObject);
        return;
        localObject = locali;
      }
    }
    paramvw = r.a("ActionPinnedNoText", 2131230791);
    if (localObject != null);
    while (true)
    {
      this.b = a(paramvw, "un1", (f)localObject);
      return;
      localObject = locali;
    }
  }

  public void a(boolean paramBoolean)
  {
    if ((this.a instanceof g.oj))
      if ((this.a.f instanceof g.mo))
      {
        if (paramBoolean)
          break label52;
        this.m = new ArrayList(this.a.f.g.h);
      }
    label51: label52: label843: label976: 
    do
    {
      do
      {
        break label51;
        break label51;
        return;
        break label51;
        break label51;
        break label51;
        break label51;
        while (true)
          if ((this.m != null) && (!this.m.isEmpty()))
          {
            int i1 = 0;
            g.az localaz1;
            int i2;
            g.az localaz2;
            while (i1 < this.m.size())
            {
              localaz1 = (g.az)this.m.get(i1);
              i2 = 0;
              if (i2 < this.a.f.g.h.size())
              {
                localaz2 = (g.az)this.a.f.g.h.get(i2);
                if ((localaz2 instanceof g.rt));
                do
                {
                  i2 += 1;
                  break;
                }
                while (!localaz2.b.equals(localaz1.b));
                localaz1.c = localaz2.c;
              }
              i1 += 1;
            }
            continue;
            if ((this.a.j == null) || ((this.a.j instanceof g.ny)))
              break;
            if ((this.a.j instanceof g.ob))
            {
              if ((!paramBoolean) || ((this.m != null) && (this.m.size() != this.a.j.d.h.size())))
              {
                this.m = new ArrayList(this.a.j.d.h);
                return;
              }
              if ((this.m == null) || (this.m.isEmpty()))
                break;
              i1 = 0;
              while (i1 < this.m.size())
              {
                localaz1 = (g.az)this.m.get(i1);
                i2 = 0;
                if (i2 < this.a.j.d.h.size())
                {
                  localaz2 = (g.az)this.a.j.d.h.get(i2);
                  if ((localaz2 instanceof g.rt));
                  do
                  {
                    i2 += 1;
                    break;
                  }
                  while (!localaz2.b.equals(localaz1.b));
                  localaz1.c = localaz2.c;
                }
                i1 += 1;
              }
              continue;
            }
            if ((this.a.j instanceof g.nw))
            {
              if ((this.a.j.k.i instanceof g.rt))
                break;
              if (!paramBoolean)
              {
                this.m = new ArrayList();
                this.m.add(this.a.j.k.i);
                return;
              }
              if ((this.m == null) || (this.m.isEmpty()) || (this.a.j.k.i == null))
                break;
              localaz1 = (g.az)this.m.get(0);
              localaz1.c = this.a.j.k.i.c;
              localaz1.d = this.a.j.k.i.d;
              localaz1.e = this.a.j.k.i.e;
              return;
            }
            if ((this.a.j instanceof g.nz))
            {
              if ((this.a.j.m.j != null) && (!(this.a.j.m.j.i instanceof g.rt)))
              {
                if (!paramBoolean)
                {
                  this.m = new ArrayList();
                  this.m.add(this.a.j.m.j.i);
                }
              }
              else if (this.a.j.m.i != null)
              {
                if ((paramBoolean) && (this.n != null))
                  break label843;
                this.n = new ArrayList(this.a.j.m.i.h);
              }
              while (true)
              {
                if ((this.m != null) || (this.n == null))
                  break label976;
                this.m = this.n;
                this.n = null;
                return;
                if ((this.m == null) || (this.m.isEmpty()) || (this.a.j.m.j.i == null))
                  break label689;
                ((g.az)this.m.get(0)).c = this.a.j.m.j.i.c;
                break label689;
                if (this.n.isEmpty())
                  break;
                i1 = 0;
                while (i1 < this.n.size())
                {
                  localaz1 = (g.az)this.n.get(i1);
                  i2 = 0;
                  if (i2 < this.a.j.m.i.h.size())
                  {
                    localaz2 = (g.az)this.a.j.m.i.h.get(i2);
                    if ((localaz2 instanceof g.rt));
                    do
                    {
                      i2 += 1;
                      break;
                    }
                    while (!localaz2.b.equals(localaz1.b));
                    localaz1.c = localaz2.c;
                  }
                  i1 += 1;
                }
              }
              break;
            }
            if (!(this.a.j instanceof g.oi))
              break;
            if (this.a.j.r.k == null)
              break label1179;
            if ((!paramBoolean) || (this.m == null))
            {
              this.m = new ArrayList(this.a.j.r.k.h);
              return;
            }
            if (this.m.isEmpty())
              break;
            i1 = 0;
            while (i1 < this.m.size())
            {
              localaz1 = (g.az)this.m.get(i1);
              i2 = 0;
              if (i2 < this.a.j.r.k.h.size())
              {
                localaz2 = (g.az)this.a.j.r.k.h.get(i2);
                if ((localaz2 instanceof g.rt));
                do
                {
                  i2 += 1;
                  break;
                }
                while (!localaz2.b.equals(localaz1.b));
                localaz1.c = localaz2.c;
              }
              i1 += 1;
            }
            continue;
          }
      }
      while ((this.a.j.r.s == null) || ((this.a.j.r.s.i instanceof g.rt)));
      if (paramBoolean)
        continue;
      this.m = new ArrayList();
      this.m.add(this.a.j.r.s.i);
      return;
    }
    while ((this.m == null) || (this.m.isEmpty()) || (this.a.j.r.s.i == null));
    label689: ((g.az)this.m.get(0)).c = this.a.j.r.s.i.c;
    label1179:
  }

  public boolean a(g.i parami)
  {
    return a(this.a, parami);
  }

  // ERROR //
  public void b(g.vw paramvw)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 59	org/vidogram/messenger/u:f	I
    //   4: ifne +32 -> 36
    //   7: aload_0
    //   8: getfield 104	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   11: getfield 295	org/vidogram/tgnet/g$ar:d	Lorg/vidogram/tgnet/g$aw;
    //   14: ifnull +22 -> 36
    //   17: aload_0
    //   18: getfield 152	org/vidogram/messenger/u:b	Ljava/lang/CharSequence;
    //   21: ifnull +15 -> 36
    //   24: aload_0
    //   25: getfield 152	org/vidogram/messenger/u:b	Ljava/lang/CharSequence;
    //   28: invokeinterface 231 1 0
    //   33: ifne +4 -> 37
    //   36: return
    //   37: aload_0
    //   38: invokevirtual 1079	org/vidogram/messenger/u:h	()V
    //   41: aload_0
    //   42: new 283	java/util/ArrayList
    //   45: dup
    //   46: invokespecial 1062	java/util/ArrayList:<init>	()V
    //   49: putfield 1081	org/vidogram/messenger/u:z	Ljava/util/ArrayList;
    //   52: aload_0
    //   53: iconst_0
    //   54: putfield 1083	org/vidogram/messenger/u:w	I
    //   57: aload_0
    //   58: getfield 104	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   61: getfield 1084	org/vidogram/tgnet/g$ar:y	I
    //   64: ifeq +307 -> 371
    //   67: iconst_0
    //   68: istore 7
    //   70: iload 7
    //   72: aload_0
    //   73: getfield 104	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   76: getfield 1086	org/vidogram/tgnet/g$ar:p	Ljava/util/ArrayList;
    //   79: invokevirtual 286	java/util/ArrayList:size	()I
    //   82: if_icmpge +2405 -> 2487
    //   85: aload_0
    //   86: getfield 104	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   89: getfield 1086	org/vidogram/tgnet/g$ar:p	Ljava/util/ArrayList;
    //   92: iload 7
    //   94: invokevirtual 289	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   97: instanceof 1088
    //   100: ifne +262 -> 362
    //   103: iconst_1
    //   104: istore 7
    //   106: iload 7
    //   108: ifne +288 -> 396
    //   111: aload_0
    //   112: getfield 104	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   115: instanceof 1090
    //   118: ifne +103 -> 221
    //   121: aload_0
    //   122: getfield 104	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   125: instanceof 1092
    //   128: ifne +93 -> 221
    //   131: aload_0
    //   132: getfield 104	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   135: instanceof 1094
    //   138: ifne +83 -> 221
    //   141: aload_0
    //   142: getfield 104	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   145: instanceof 1096
    //   148: ifne +73 -> 221
    //   151: aload_0
    //   152: getfield 104	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   155: instanceof 1098
    //   158: ifne +63 -> 221
    //   161: aload_0
    //   162: getfield 104	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   165: instanceof 1100
    //   168: ifne +53 -> 221
    //   171: aload_0
    //   172: getfield 104	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   175: instanceof 1102
    //   178: ifne +43 -> 221
    //   181: aload_0
    //   182: invokevirtual 142	org/vidogram/messenger/u:j	()Z
    //   185: ifeq +13 -> 198
    //   188: aload_0
    //   189: getfield 104	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   192: getfield 1084	org/vidogram/tgnet/g$ar:y	I
    //   195: ifne +26 -> 221
    //   198: aload_0
    //   199: getfield 104	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   202: getfield 191	org/vidogram/tgnet/g$ar:b	I
    //   205: iflt +16 -> 221
    //   208: aload_0
    //   209: getfield 104	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   212: getfield 213	org/vidogram/tgnet/g$ar:j	Lorg/vidogram/tgnet/g$au;
    //   215: instanceof 543
    //   218: ifeq +178 -> 396
    //   221: iconst_1
    //   222: istore 7
    //   224: iload 7
    //   226: ifeq +176 -> 402
    //   229: aload_0
    //   230: getfield 152	org/vidogram/messenger/u:b	Ljava/lang/CharSequence;
    //   233: invokestatic 1104	org/vidogram/messenger/u:a	(Ljava/lang/CharSequence;)V
    //   236: aload_0
    //   237: getfield 152	org/vidogram/messenger/u:b	Ljava/lang/CharSequence;
    //   240: instanceof 228
    //   243: ifeq +1192 -> 1435
    //   246: aload_0
    //   247: getfield 152	org/vidogram/messenger/u:b	Ljava/lang/CharSequence;
    //   250: checkcast 228	android/text/Spannable
    //   253: astore 18
    //   255: aload_0
    //   256: getfield 104	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   259: getfield 1086	org/vidogram/tgnet/g$ar:p	Ljava/util/ArrayList;
    //   262: invokevirtual 286	java/util/ArrayList:size	()I
    //   265: istore 10
    //   267: aload 18
    //   269: iconst_0
    //   270: aload_0
    //   271: getfield 152	org/vidogram/messenger/u:b	Ljava/lang/CharSequence;
    //   274: invokeinterface 231 1 0
    //   279: ldc_w 1106
    //   282: invokeinterface 237 4 0
    //   287: checkcast 1108	[Landroid/text/style/URLSpan;
    //   290: astore 19
    //   292: iconst_0
    //   293: istore 8
    //   295: iload 8
    //   297: iload 10
    //   299: if_icmpge +1136 -> 1435
    //   302: aload_0
    //   303: getfield 104	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   306: getfield 1086	org/vidogram/tgnet/g$ar:p	Ljava/util/ArrayList;
    //   309: iload 8
    //   311: invokevirtual 289	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   314: checkcast 1110	org/vidogram/tgnet/g$at
    //   317: astore 20
    //   319: aload 20
    //   321: getfield 1111	org/vidogram/tgnet/g$at:c	I
    //   324: ifle +29 -> 353
    //   327: aload 20
    //   329: getfield 1112	org/vidogram/tgnet/g$at:b	I
    //   332: iflt +21 -> 353
    //   335: aload 20
    //   337: getfield 1112	org/vidogram/tgnet/g$at:b	I
    //   340: aload_0
    //   341: getfield 104	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   344: getfield 189	org/vidogram/tgnet/g$ar:i	Ljava/lang/String;
    //   347: invokevirtual 195	java/lang/String:length	()I
    //   350: if_icmplt +105 -> 455
    //   353: iload 8
    //   355: iconst_1
    //   356: iadd
    //   357: istore 8
    //   359: goto -64 -> 295
    //   362: iload 7
    //   364: iconst_1
    //   365: iadd
    //   366: istore 7
    //   368: goto -298 -> 70
    //   371: aload_0
    //   372: getfield 104	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   375: getfield 1086	org/vidogram/tgnet/g$ar:p	Ljava/util/ArrayList;
    //   378: invokevirtual 1055	java/util/ArrayList:isEmpty	()Z
    //   381: ifne +9 -> 390
    //   384: iconst_1
    //   385: istore 7
    //   387: goto -281 -> 106
    //   390: iconst_0
    //   391: istore 7
    //   393: goto -287 -> 106
    //   396: iconst_0
    //   397: istore 7
    //   399: goto -175 -> 224
    //   402: aload_0
    //   403: getfield 152	org/vidogram/messenger/u:b	Ljava/lang/CharSequence;
    //   406: instanceof 228
    //   409: ifeq -173 -> 236
    //   412: aload_0
    //   413: getfield 152	org/vidogram/messenger/u:b	Ljava/lang/CharSequence;
    //   416: invokeinterface 231 1 0
    //   421: sipush 200
    //   424: if_icmpge -188 -> 236
    //   427: aload_0
    //   428: getfield 152	org/vidogram/messenger/u:b	Ljava/lang/CharSequence;
    //   431: checkcast 228	android/text/Spannable
    //   434: iconst_4
    //   435: invokestatic 617	android/text/util/Linkify:addLinks	(Landroid/text/Spannable;I)Z
    //   438: pop
    //   439: goto -203 -> 236
    //   442: astore 18
    //   444: ldc_w 621
    //   447: aload 18
    //   449: invokestatic 626	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   452: goto -216 -> 236
    //   455: aload 20
    //   457: getfield 1112	org/vidogram/tgnet/g$at:b	I
    //   460: aload 20
    //   462: getfield 1111	org/vidogram/tgnet/g$at:c	I
    //   465: iadd
    //   466: aload_0
    //   467: getfield 104	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   470: getfield 189	org/vidogram/tgnet/g$ar:i	Ljava/lang/String;
    //   473: invokevirtual 195	java/lang/String:length	()I
    //   476: if_icmple +24 -> 500
    //   479: aload 20
    //   481: aload_0
    //   482: getfield 104	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   485: getfield 189	org/vidogram/tgnet/g$ar:i	Ljava/lang/String;
    //   488: invokevirtual 195	java/lang/String:length	()I
    //   491: aload 20
    //   493: getfield 1112	org/vidogram/tgnet/g$at:b	I
    //   496: isub
    //   497: putfield 1111	org/vidogram/tgnet/g$at:c	I
    //   500: aload 19
    //   502: ifnull +138 -> 640
    //   505: aload 19
    //   507: arraylength
    //   508: ifle +132 -> 640
    //   511: iconst_0
    //   512: istore 9
    //   514: iload 9
    //   516: aload 19
    //   518: arraylength
    //   519: if_icmpge +121 -> 640
    //   522: aload 19
    //   524: iload 9
    //   526: aaload
    //   527: ifnonnull +12 -> 539
    //   530: iload 9
    //   532: iconst_1
    //   533: iadd
    //   534: istore 9
    //   536: goto -22 -> 514
    //   539: aload 18
    //   541: aload 19
    //   543: iload 9
    //   545: aaload
    //   546: invokeinterface 1116 2 0
    //   551: istore 11
    //   553: aload 18
    //   555: aload 19
    //   557: iload 9
    //   559: aaload
    //   560: invokeinterface 1119 2 0
    //   565: istore 12
    //   567: aload 20
    //   569: getfield 1112	org/vidogram/tgnet/g$at:b	I
    //   572: iload 11
    //   574: if_icmpgt +19 -> 593
    //   577: aload 20
    //   579: getfield 1112	org/vidogram/tgnet/g$at:b	I
    //   582: aload 20
    //   584: getfield 1111	org/vidogram/tgnet/g$at:c	I
    //   587: iadd
    //   588: iload 11
    //   590: if_icmpge +29 -> 619
    //   593: aload 20
    //   595: getfield 1112	org/vidogram/tgnet/g$at:b	I
    //   598: iload 12
    //   600: if_icmpgt -70 -> 530
    //   603: aload 20
    //   605: getfield 1112	org/vidogram/tgnet/g$at:b	I
    //   608: aload 20
    //   610: getfield 1111	org/vidogram/tgnet/g$at:c	I
    //   613: iadd
    //   614: iload 12
    //   616: if_icmplt -86 -> 530
    //   619: aload 18
    //   621: aload 19
    //   623: iload 9
    //   625: aaload
    //   626: invokeinterface 1123 2 0
    //   631: aload 19
    //   633: iload 9
    //   635: aconst_null
    //   636: aastore
    //   637: goto -107 -> 530
    //   640: aload 20
    //   642: instanceof 1125
    //   645: ifeq +56 -> 701
    //   648: new 1127	org/vidogram/ui/Components/bo
    //   651: dup
    //   652: ldc_w 1129
    //   655: invokestatic 1132	org/vidogram/messenger/a:a	(Ljava/lang/String;)Landroid/graphics/Typeface;
    //   658: invokespecial 1135	org/vidogram/ui/Components/bo:<init>	(Landroid/graphics/Typeface;)V
    //   661: astore 21
    //   663: aload 20
    //   665: getfield 1112	org/vidogram/tgnet/g$at:b	I
    //   668: istore 9
    //   670: aload 20
    //   672: getfield 1112	org/vidogram/tgnet/g$at:b	I
    //   675: istore 11
    //   677: aload 18
    //   679: aload 21
    //   681: iload 9
    //   683: aload 20
    //   685: getfield 1111	org/vidogram/tgnet/g$at:c	I
    //   688: iload 11
    //   690: iadd
    //   691: bipush 33
    //   693: invokeinterface 729 5 0
    //   698: goto -345 -> 353
    //   701: aload 20
    //   703: instanceof 1137
    //   706: ifeq +56 -> 762
    //   709: new 1127	org/vidogram/ui/Components/bo
    //   712: dup
    //   713: ldc_w 1139
    //   716: invokestatic 1132	org/vidogram/messenger/a:a	(Ljava/lang/String;)Landroid/graphics/Typeface;
    //   719: invokespecial 1135	org/vidogram/ui/Components/bo:<init>	(Landroid/graphics/Typeface;)V
    //   722: astore 21
    //   724: aload 20
    //   726: getfield 1112	org/vidogram/tgnet/g$at:b	I
    //   729: istore 9
    //   731: aload 20
    //   733: getfield 1112	org/vidogram/tgnet/g$at:b	I
    //   736: istore 11
    //   738: aload 18
    //   740: aload 21
    //   742: iload 9
    //   744: aload 20
    //   746: getfield 1111	org/vidogram/tgnet/g$at:c	I
    //   749: iload 11
    //   751: iadd
    //   752: bipush 33
    //   754: invokeinterface 729 5 0
    //   759: goto -406 -> 353
    //   762: aload 20
    //   764: instanceof 1141
    //   767: ifne +11 -> 778
    //   770: aload 20
    //   772: instanceof 1143
    //   775: ifeq +65 -> 840
    //   778: new 1127	org/vidogram/ui/Components/bo
    //   781: dup
    //   782: getstatic 1149	android/graphics/Typeface:MONOSPACE	Landroid/graphics/Typeface;
    //   785: invokestatic 99	org/vidogram/messenger/v:a	()Lorg/vidogram/messenger/v;
    //   788: getfield 101	org/vidogram/messenger/v:B	I
    //   791: iconst_1
    //   792: isub
    //   793: i2f
    //   794: invokestatic 84	org/vidogram/messenger/a:a	(F)I
    //   797: invokespecial 1152	org/vidogram/ui/Components/bo:<init>	(Landroid/graphics/Typeface;I)V
    //   800: astore 21
    //   802: aload 20
    //   804: getfield 1112	org/vidogram/tgnet/g$at:b	I
    //   807: istore 9
    //   809: aload 20
    //   811: getfield 1112	org/vidogram/tgnet/g$at:b	I
    //   814: istore 11
    //   816: aload 18
    //   818: aload 21
    //   820: iload 9
    //   822: aload 20
    //   824: getfield 1111	org/vidogram/tgnet/g$at:c	I
    //   827: iload 11
    //   829: iadd
    //   830: bipush 33
    //   832: invokeinterface 729 5 0
    //   837: goto -484 -> 353
    //   840: aload 20
    //   842: instanceof 1154
    //   845: ifeq +76 -> 921
    //   848: new 1156	org/vidogram/ui/Components/URLSpanUserMention
    //   851: dup
    //   852: new 436	java/lang/StringBuilder
    //   855: dup
    //   856: invokespecial 437	java/lang/StringBuilder:<init>	()V
    //   859: ldc 154
    //   861: invokevirtual 441	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   864: aload 20
    //   866: checkcast 1154	org/vidogram/tgnet/g$nm
    //   869: getfield 1157	org/vidogram/tgnet/g$nm:g	I
    //   872: invokevirtual 444	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   875: invokevirtual 448	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   878: invokespecial 1158	org/vidogram/ui/Components/URLSpanUserMention:<init>	(Ljava/lang/String;)V
    //   881: astore 21
    //   883: aload 20
    //   885: getfield 1112	org/vidogram/tgnet/g$at:b	I
    //   888: istore 9
    //   890: aload 20
    //   892: getfield 1112	org/vidogram/tgnet/g$at:b	I
    //   895: istore 11
    //   897: aload 18
    //   899: aload 21
    //   901: iload 9
    //   903: aload 20
    //   905: getfield 1111	org/vidogram/tgnet/g$at:c	I
    //   908: iload 11
    //   910: iadd
    //   911: bipush 33
    //   913: invokeinterface 729 5 0
    //   918: goto -565 -> 353
    //   921: aload 20
    //   923: instanceof 1088
    //   926: ifeq +79 -> 1005
    //   929: new 1156	org/vidogram/ui/Components/URLSpanUserMention
    //   932: dup
    //   933: new 436	java/lang/StringBuilder
    //   936: dup
    //   937: invokespecial 437	java/lang/StringBuilder:<init>	()V
    //   940: ldc 154
    //   942: invokevirtual 441	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   945: aload 20
    //   947: checkcast 1088	org/vidogram/tgnet/g$kn
    //   950: getfield 1161	org/vidogram/tgnet/g$kn:g	Lorg/vidogram/tgnet/g$ap;
    //   953: getfield 1164	org/vidogram/tgnet/g$ap:b	I
    //   956: invokevirtual 444	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   959: invokevirtual 448	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   962: invokespecial 1158	org/vidogram/ui/Components/URLSpanUserMention:<init>	(Ljava/lang/String;)V
    //   965: astore 21
    //   967: aload 20
    //   969: getfield 1112	org/vidogram/tgnet/g$at:b	I
    //   972: istore 9
    //   974: aload 20
    //   976: getfield 1112	org/vidogram/tgnet/g$at:b	I
    //   979: istore 11
    //   981: aload 18
    //   983: aload 21
    //   985: iload 9
    //   987: aload 20
    //   989: getfield 1111	org/vidogram/tgnet/g$at:c	I
    //   992: iload 11
    //   994: iadd
    //   995: bipush 33
    //   997: invokeinterface 729 5 0
    //   1002: goto -649 -> 353
    //   1005: iload 7
    //   1007: ifne -654 -> 353
    //   1010: aload_0
    //   1011: getfield 104	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   1014: getfield 189	org/vidogram/tgnet/g$ar:i	Ljava/lang/String;
    //   1017: aload 20
    //   1019: getfield 1112	org/vidogram/tgnet/g$at:b	I
    //   1022: aload 20
    //   1024: getfield 1112	org/vidogram/tgnet/g$at:b	I
    //   1027: aload 20
    //   1029: getfield 1111	org/vidogram/tgnet/g$at:c	I
    //   1032: iadd
    //   1033: invokevirtual 1168	java/lang/String:substring	(II)Ljava/lang/String;
    //   1036: astore 21
    //   1038: aload 20
    //   1040: instanceof 1170
    //   1043: ifeq +52 -> 1095
    //   1046: new 717	org/vidogram/ui/Components/URLSpanBotCommand
    //   1049: dup
    //   1050: aload 21
    //   1052: invokespecial 725	org/vidogram/ui/Components/URLSpanBotCommand:<init>	(Ljava/lang/String;)V
    //   1055: astore 21
    //   1057: aload 20
    //   1059: getfield 1112	org/vidogram/tgnet/g$at:b	I
    //   1062: istore 9
    //   1064: aload 20
    //   1066: getfield 1112	org/vidogram/tgnet/g$at:b	I
    //   1069: istore 11
    //   1071: aload 18
    //   1073: aload 21
    //   1075: iload 9
    //   1077: aload 20
    //   1079: getfield 1111	org/vidogram/tgnet/g$at:c	I
    //   1082: iload 11
    //   1084: iadd
    //   1085: bipush 33
    //   1087: invokeinterface 729 5 0
    //   1092: goto -739 -> 353
    //   1095: aload 20
    //   1097: instanceof 1172
    //   1100: ifne +11 -> 1111
    //   1103: aload 20
    //   1105: instanceof 1174
    //   1108: ifeq +52 -> 1160
    //   1111: new 731	org/vidogram/ui/Components/URLSpanNoUnderline
    //   1114: dup
    //   1115: aload 21
    //   1117: invokespecial 732	org/vidogram/ui/Components/URLSpanNoUnderline:<init>	(Ljava/lang/String;)V
    //   1120: astore 21
    //   1122: aload 20
    //   1124: getfield 1112	org/vidogram/tgnet/g$at:b	I
    //   1127: istore 9
    //   1129: aload 20
    //   1131: getfield 1112	org/vidogram/tgnet/g$at:b	I
    //   1134: istore 11
    //   1136: aload 18
    //   1138: aload 21
    //   1140: iload 9
    //   1142: aload 20
    //   1144: getfield 1111	org/vidogram/tgnet/g$at:c	I
    //   1147: iload 11
    //   1149: iadd
    //   1150: bipush 33
    //   1152: invokeinterface 729 5 0
    //   1157: goto -804 -> 353
    //   1160: aload 20
    //   1162: instanceof 1176
    //   1165: ifeq +71 -> 1236
    //   1168: new 1178	org/vidogram/ui/Components/URLSpanReplacement
    //   1171: dup
    //   1172: new 436	java/lang/StringBuilder
    //   1175: dup
    //   1176: invokespecial 437	java/lang/StringBuilder:<init>	()V
    //   1179: ldc_w 1180
    //   1182: invokevirtual 441	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1185: aload 21
    //   1187: invokevirtual 441	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1190: invokevirtual 448	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1193: invokespecial 1181	org/vidogram/ui/Components/URLSpanReplacement:<init>	(Ljava/lang/String;)V
    //   1196: astore 21
    //   1198: aload 20
    //   1200: getfield 1112	org/vidogram/tgnet/g$at:b	I
    //   1203: istore 9
    //   1205: aload 20
    //   1207: getfield 1112	org/vidogram/tgnet/g$at:b	I
    //   1210: istore 11
    //   1212: aload 18
    //   1214: aload 21
    //   1216: iload 9
    //   1218: aload 20
    //   1220: getfield 1111	org/vidogram/tgnet/g$at:c	I
    //   1223: iload 11
    //   1225: iadd
    //   1226: bipush 33
    //   1228: invokeinterface 729 5 0
    //   1233: goto -880 -> 353
    //   1236: aload 20
    //   1238: instanceof 1183
    //   1241: ifeq +134 -> 1375
    //   1244: aload 21
    //   1246: invokevirtual 1186	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   1249: ldc_w 1188
    //   1252: invokevirtual 1191	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   1255: ifne +71 -> 1326
    //   1258: new 1106	android/text/style/URLSpan
    //   1261: dup
    //   1262: new 436	java/lang/StringBuilder
    //   1265: dup
    //   1266: invokespecial 437	java/lang/StringBuilder:<init>	()V
    //   1269: ldc_w 1193
    //   1272: invokevirtual 441	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1275: aload 21
    //   1277: invokevirtual 441	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1280: invokevirtual 448	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1283: invokespecial 1194	android/text/style/URLSpan:<init>	(Ljava/lang/String;)V
    //   1286: astore 21
    //   1288: aload 20
    //   1290: getfield 1112	org/vidogram/tgnet/g$at:b	I
    //   1293: istore 9
    //   1295: aload 20
    //   1297: getfield 1112	org/vidogram/tgnet/g$at:b	I
    //   1300: istore 11
    //   1302: aload 18
    //   1304: aload 21
    //   1306: iload 9
    //   1308: aload 20
    //   1310: getfield 1111	org/vidogram/tgnet/g$at:c	I
    //   1313: iload 11
    //   1315: iadd
    //   1316: bipush 33
    //   1318: invokeinterface 729 5 0
    //   1323: goto -970 -> 353
    //   1326: new 1106	android/text/style/URLSpan
    //   1329: dup
    //   1330: aload 21
    //   1332: invokespecial 1194	android/text/style/URLSpan:<init>	(Ljava/lang/String;)V
    //   1335: astore 21
    //   1337: aload 20
    //   1339: getfield 1112	org/vidogram/tgnet/g$at:b	I
    //   1342: istore 9
    //   1344: aload 20
    //   1346: getfield 1112	org/vidogram/tgnet/g$at:b	I
    //   1349: istore 11
    //   1351: aload 18
    //   1353: aload 21
    //   1355: iload 9
    //   1357: aload 20
    //   1359: getfield 1111	org/vidogram/tgnet/g$at:c	I
    //   1362: iload 11
    //   1364: iadd
    //   1365: bipush 33
    //   1367: invokeinterface 729 5 0
    //   1372: goto -1019 -> 353
    //   1375: aload 20
    //   1377: instanceof 1196
    //   1380: ifeq -1027 -> 353
    //   1383: new 1178	org/vidogram/ui/Components/URLSpanReplacement
    //   1386: dup
    //   1387: aload 20
    //   1389: getfield 1198	org/vidogram/tgnet/g$at:d	Ljava/lang/String;
    //   1392: invokespecial 1181	org/vidogram/ui/Components/URLSpanReplacement:<init>	(Ljava/lang/String;)V
    //   1395: astore 21
    //   1397: aload 20
    //   1399: getfield 1112	org/vidogram/tgnet/g$at:b	I
    //   1402: istore 9
    //   1404: aload 20
    //   1406: getfield 1112	org/vidogram/tgnet/g$at:b	I
    //   1409: istore 11
    //   1411: aload 18
    //   1413: aload 21
    //   1415: iload 9
    //   1417: aload 20
    //   1419: getfield 1111	org/vidogram/tgnet/g$at:c	I
    //   1422: iload 11
    //   1424: iadd
    //   1425: bipush 33
    //   1427: invokeinterface 729 5 0
    //   1432: goto -1079 -> 353
    //   1435: aload_0
    //   1436: getfield 104	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   1439: getfield 115	org/vidogram/tgnet/g$ar:c	I
    //   1442: ifle +587 -> 2029
    //   1445: aload_0
    //   1446: getfield 104	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   1449: getfield 295	org/vidogram/tgnet/g$ar:d	Lorg/vidogram/tgnet/g$aw;
    //   1452: getfield 298	org/vidogram/tgnet/g$aw:b	I
    //   1455: ifne +29 -> 1484
    //   1458: aload_0
    //   1459: getfield 104	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   1462: getfield 295	org/vidogram/tgnet/g$ar:d	Lorg/vidogram/tgnet/g$aw;
    //   1465: getfield 759	org/vidogram/tgnet/g$aw:d	I
    //   1468: ifne +16 -> 1484
    //   1471: aload_0
    //   1472: getfield 104	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   1475: getfield 213	org/vidogram/tgnet/g$ar:j	Lorg/vidogram/tgnet/g$au;
    //   1478: instanceof 215
    //   1481: ifeq +548 -> 2029
    //   1484: aload_0
    //   1485: invokevirtual 142	org/vidogram/messenger/u:j	()Z
    //   1488: ifne +541 -> 2029
    //   1491: iconst_1
    //   1492: istore 7
    //   1494: invokestatic 829	org/vidogram/messenger/a:c	()Z
    //   1497: ifeq +538 -> 2035
    //   1500: invokestatic 831	org/vidogram/messenger/a:e	()I
    //   1503: istore 8
    //   1505: aload_0
    //   1506: iload 8
    //   1508: putfield 1200	org/vidogram/messenger/u:H	I
    //   1511: aload_0
    //   1512: getfield 1200	org/vidogram/messenger/u:H	I
    //   1515: istore 8
    //   1517: iload 7
    //   1519: ifeq +527 -> 2046
    //   1522: ldc_w 1201
    //   1525: fstore_2
    //   1526: iload 8
    //   1528: fload_2
    //   1529: invokestatic 84	org/vidogram/messenger/a:a	(F)I
    //   1532: isub
    //   1533: istore 8
    //   1535: aload_1
    //   1536: ifnull +10 -> 1546
    //   1539: aload_1
    //   1540: getfield 1202	org/vidogram/tgnet/g$vw:r	Z
    //   1543: ifne +52 -> 1595
    //   1546: aload_0
    //   1547: invokevirtual 300	org/vidogram/messenger/u:t	()Z
    //   1550: ifne +34 -> 1584
    //   1553: iload 8
    //   1555: istore 7
    //   1557: aload_0
    //   1558: getfield 104	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   1561: getfield 892	org/vidogram/tgnet/g$ar:w	Lorg/vidogram/tgnet/g$nt;
    //   1564: ifnull +41 -> 1605
    //   1567: iload 8
    //   1569: istore 7
    //   1571: aload_0
    //   1572: getfield 104	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   1575: getfield 892	org/vidogram/tgnet/g$ar:w	Lorg/vidogram/tgnet/g$nt;
    //   1578: getfield 899	org/vidogram/tgnet/g$nt:f	I
    //   1581: ifeq +24 -> 1605
    //   1584: iload 8
    //   1586: istore 7
    //   1588: aload_0
    //   1589: invokevirtual 142	org/vidogram/messenger/u:j	()Z
    //   1592: ifne +13 -> 1605
    //   1595: iload 8
    //   1597: ldc 94
    //   1599: invokestatic 84	org/vidogram/messenger/a:a	(F)I
    //   1602: isub
    //   1603: istore 7
    //   1605: aload_0
    //   1606: getfield 104	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   1609: getfield 213	org/vidogram/tgnet/g$ar:j	Lorg/vidogram/tgnet/g$au;
    //   1612: instanceof 215
    //   1615: ifeq +865 -> 2480
    //   1618: iload 7
    //   1620: ldc_w 1203
    //   1623: invokestatic 84	org/vidogram/messenger/a:a	(F)I
    //   1626: isub
    //   1627: istore 9
    //   1629: aload_0
    //   1630: getfield 104	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   1633: getfield 213	org/vidogram/tgnet/g$ar:j	Lorg/vidogram/tgnet/g$au;
    //   1636: instanceof 215
    //   1639: ifeq +414 -> 2053
    //   1642: getstatic 76	org/vidogram/messenger/u:C	Landroid/text/TextPaint;
    //   1645: astore_1
    //   1646: new 1205	android/text/StaticLayout
    //   1649: dup
    //   1650: aload_0
    //   1651: getfield 152	org/vidogram/messenger/u:b	Ljava/lang/CharSequence;
    //   1654: aload_1
    //   1655: iload 9
    //   1657: getstatic 1211	android/text/Layout$Alignment:ALIGN_NORMAL	Landroid/text/Layout$Alignment;
    //   1660: fconst_1
    //   1661: fconst_0
    //   1662: iconst_0
    //   1663: invokespecial 1214	android/text/StaticLayout:<init>	(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;FFZ)V
    //   1666: astore 18
    //   1668: aload_0
    //   1669: aload 18
    //   1671: invokevirtual 1217	android/text/StaticLayout:getHeight	()I
    //   1674: putfield 806	org/vidogram/messenger/u:x	I
    //   1677: aload 18
    //   1679: invokevirtual 1220	android/text/StaticLayout:getLineCount	()I
    //   1682: istore 16
    //   1684: iload 16
    //   1686: i2f
    //   1687: ldc_w 1203
    //   1690: fdiv
    //   1691: f2d
    //   1692: invokestatic 1224	java/lang/Math:ceil	(D)D
    //   1695: d2i
    //   1696: istore 17
    //   1698: iconst_0
    //   1699: istore 7
    //   1701: fconst_0
    //   1702: fstore_2
    //   1703: iconst_0
    //   1704: istore 10
    //   1706: iload 10
    //   1708: iload 17
    //   1710: if_icmpge -1674 -> 36
    //   1713: bipush 10
    //   1715: iload 16
    //   1717: iload 7
    //   1719: isub
    //   1720: invokestatic 856	java/lang/Math:min	(II)I
    //   1723: istore 8
    //   1725: new 6	org/vidogram/messenger/u$a
    //   1728: dup
    //   1729: invokespecial 1225	org/vidogram/messenger/u$a:<init>	()V
    //   1732: astore 19
    //   1734: iload 17
    //   1736: iconst_1
    //   1737: if_icmpne +332 -> 2069
    //   1740: aload 19
    //   1742: aload 18
    //   1744: putfield 1228	org/vidogram/messenger/u$a:a	Landroid/text/StaticLayout;
    //   1747: aload 19
    //   1749: fconst_0
    //   1750: putfield 1230	org/vidogram/messenger/u$a:c	F
    //   1753: aload 19
    //   1755: iconst_0
    //   1756: putfield 1231	org/vidogram/messenger/u$a:d	I
    //   1759: aload 19
    //   1761: aload_0
    //   1762: getfield 806	org/vidogram/messenger/u:x	I
    //   1765: putfield 1232	org/vidogram/messenger/u$a:e	I
    //   1768: iload 8
    //   1770: istore 11
    //   1772: aload_0
    //   1773: getfield 1081	org/vidogram/messenger/u:z	Ljava/util/ArrayList;
    //   1776: aload 19
    //   1778: invokevirtual 1065	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   1781: pop
    //   1782: aload 19
    //   1784: fconst_0
    //   1785: putfield 1234	org/vidogram/messenger/u$a:b	F
    //   1788: aload 19
    //   1790: getfield 1228	org/vidogram/messenger/u$a:a	Landroid/text/StaticLayout;
    //   1793: iload 11
    //   1795: iconst_1
    //   1796: isub
    //   1797: invokevirtual 1238	android/text/StaticLayout:getLineLeft	(I)F
    //   1800: fstore_3
    //   1801: aload 19
    //   1803: fload_3
    //   1804: putfield 1234	org/vidogram/messenger/u$a:b	F
    //   1807: fconst_0
    //   1808: fstore 4
    //   1810: aload 19
    //   1812: getfield 1228	org/vidogram/messenger/u$a:a	Landroid/text/StaticLayout;
    //   1815: iload 11
    //   1817: iconst_1
    //   1818: isub
    //   1819: invokevirtual 1241	android/text/StaticLayout:getLineWidth	(I)F
    //   1822: fstore 5
    //   1824: fload 5
    //   1826: fstore 4
    //   1828: fload 4
    //   1830: f2d
    //   1831: invokestatic 1224	java/lang/Math:ceil	(D)D
    //   1834: d2i
    //   1835: istore 14
    //   1837: iload 10
    //   1839: iload 17
    //   1841: iconst_1
    //   1842: isub
    //   1843: if_icmpne +9 -> 1852
    //   1846: aload_0
    //   1847: iload 14
    //   1849: putfield 1243	org/vidogram/messenger/u:v	I
    //   1852: fload 4
    //   1854: fload_3
    //   1855: fadd
    //   1856: f2d
    //   1857: invokestatic 1224	java/lang/Math:ceil	(D)D
    //   1860: d2i
    //   1861: istore 15
    //   1863: fload_3
    //   1864: fconst_0
    //   1865: fcmpl
    //   1866: ifne +608 -> 2474
    //   1869: iconst_1
    //   1870: istore 8
    //   1872: iload 11
    //   1874: iconst_1
    //   1875: if_icmple +575 -> 2450
    //   1878: iconst_0
    //   1879: istore 12
    //   1881: iload 15
    //   1883: istore 13
    //   1885: fconst_0
    //   1886: fstore_3
    //   1887: fconst_0
    //   1888: fstore 4
    //   1890: iload 12
    //   1892: iload 11
    //   1894: if_icmpge +473 -> 2367
    //   1897: aload 19
    //   1899: getfield 1228	org/vidogram/messenger/u$a:a	Landroid/text/StaticLayout;
    //   1902: iload 12
    //   1904: invokevirtual 1241	android/text/StaticLayout:getLineWidth	(I)F
    //   1907: fstore 5
    //   1909: fload 5
    //   1911: iload 9
    //   1913: bipush 20
    //   1915: iadd
    //   1916: i2f
    //   1917: fcmpl
    //   1918: ifle +553 -> 2471
    //   1921: iload 9
    //   1923: i2f
    //   1924: fstore 5
    //   1926: aload 19
    //   1928: getfield 1228	org/vidogram/messenger/u$a:a	Landroid/text/StaticLayout;
    //   1931: iload 12
    //   1933: invokevirtual 1238	android/text/StaticLayout:getLineLeft	(I)F
    //   1936: fstore 6
    //   1938: fload 6
    //   1940: fconst_0
    //   1941: fcmpl
    //   1942: iflt +18 -> 1960
    //   1945: aload 19
    //   1947: aload 19
    //   1949: getfield 1234	org/vidogram/messenger/u$a:b	F
    //   1952: fload 6
    //   1954: invokestatic 1246	java/lang/Math:min	(FF)F
    //   1957: putfield 1234	org/vidogram/messenger/u$a:b	F
    //   1960: fload 6
    //   1962: fconst_0
    //   1963: fcmpl
    //   1964: ifne +6 -> 1970
    //   1967: iconst_1
    //   1968: istore 8
    //   1970: fload 4
    //   1972: fload 5
    //   1974: invokestatic 1249	java/lang/Math:max	(FF)F
    //   1977: fstore 4
    //   1979: fload_3
    //   1980: fload 5
    //   1982: fload 6
    //   1984: fadd
    //   1985: invokestatic 1249	java/lang/Math:max	(FF)F
    //   1988: fstore_3
    //   1989: iload 14
    //   1991: fload 5
    //   1993: f2d
    //   1994: invokestatic 1224	java/lang/Math:ceil	(D)D
    //   1997: d2i
    //   1998: invokestatic 1251	java/lang/Math:max	(II)I
    //   2001: istore 14
    //   2003: iload 13
    //   2005: fload 5
    //   2007: fload 6
    //   2009: fadd
    //   2010: f2d
    //   2011: invokestatic 1224	java/lang/Math:ceil	(D)D
    //   2014: d2i
    //   2015: invokestatic 1251	java/lang/Math:max	(II)I
    //   2018: istore 13
    //   2020: iload 12
    //   2022: iconst_1
    //   2023: iadd
    //   2024: istore 12
    //   2026: goto -136 -> 1890
    //   2029: iconst_0
    //   2030: istore 7
    //   2032: goto -538 -> 1494
    //   2035: getstatic 822	org/vidogram/messenger/a:c	Landroid/graphics/Point;
    //   2038: getfield 838	android/graphics/Point:x	I
    //   2041: istore 8
    //   2043: goto -538 -> 1505
    //   2046: ldc_w 1252
    //   2049: fstore_2
    //   2050: goto -524 -> 1526
    //   2053: getstatic 61	org/vidogram/messenger/u:A	Landroid/text/TextPaint;
    //   2056: astore_1
    //   2057: goto -411 -> 1646
    //   2060: astore_1
    //   2061: ldc_w 621
    //   2064: aload_1
    //   2065: invokestatic 626	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   2068: return
    //   2069: aload 18
    //   2071: iload 7
    //   2073: invokevirtual 1255	android/text/StaticLayout:getLineStart	(I)I
    //   2076: istore 11
    //   2078: aload 18
    //   2080: iload 7
    //   2082: iload 8
    //   2084: iadd
    //   2085: iconst_1
    //   2086: isub
    //   2087: invokevirtual 1258	android/text/StaticLayout:getLineEnd	(I)I
    //   2090: istore 12
    //   2092: iload 12
    //   2094: iload 11
    //   2096: if_icmpge +12 -> 2108
    //   2099: iload 10
    //   2101: iconst_1
    //   2102: iadd
    //   2103: istore 10
    //   2105: goto -399 -> 1706
    //   2108: aload 19
    //   2110: iload 11
    //   2112: putfield 1231	org/vidogram/messenger/u$a:d	I
    //   2115: aload 19
    //   2117: new 1205	android/text/StaticLayout
    //   2120: dup
    //   2121: aload_0
    //   2122: getfield 152	org/vidogram/messenger/u:b	Ljava/lang/CharSequence;
    //   2125: iload 11
    //   2127: iload 12
    //   2129: invokeinterface 721 3 0
    //   2134: aload_1
    //   2135: iload 9
    //   2137: getstatic 1211	android/text/Layout$Alignment:ALIGN_NORMAL	Landroid/text/Layout$Alignment;
    //   2140: fconst_1
    //   2141: fconst_0
    //   2142: iconst_0
    //   2143: invokespecial 1214	android/text/StaticLayout:<init>	(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;FFZ)V
    //   2146: putfield 1228	org/vidogram/messenger/u$a:a	Landroid/text/StaticLayout;
    //   2149: aload 19
    //   2151: aload 18
    //   2153: iload 7
    //   2155: invokevirtual 1261	android/text/StaticLayout:getLineTop	(I)I
    //   2158: i2f
    //   2159: putfield 1230	org/vidogram/messenger/u$a:c	F
    //   2162: iload 10
    //   2164: ifeq +16 -> 2180
    //   2167: aload 19
    //   2169: aload 19
    //   2171: getfield 1230	org/vidogram/messenger/u$a:c	F
    //   2174: fload_2
    //   2175: fsub
    //   2176: f2i
    //   2177: putfield 1232	org/vidogram/messenger/u$a:e	I
    //   2180: aload 19
    //   2182: aload 19
    //   2184: getfield 1232	org/vidogram/messenger/u$a:e	I
    //   2187: aload 19
    //   2189: getfield 1228	org/vidogram/messenger/u$a:a	Landroid/text/StaticLayout;
    //   2192: aload 19
    //   2194: getfield 1228	org/vidogram/messenger/u$a:a	Landroid/text/StaticLayout;
    //   2197: invokevirtual 1220	android/text/StaticLayout:getLineCount	()I
    //   2200: iconst_1
    //   2201: isub
    //   2202: invokevirtual 1264	android/text/StaticLayout:getLineBottom	(I)I
    //   2205: invokestatic 1251	java/lang/Math:max	(II)I
    //   2208: putfield 1232	org/vidogram/messenger/u$a:e	I
    //   2211: aload 19
    //   2213: getfield 1230	org/vidogram/messenger/u$a:c	F
    //   2216: fstore_3
    //   2217: iload 8
    //   2219: istore 11
    //   2221: fload_3
    //   2222: fstore_2
    //   2223: iload 10
    //   2225: iload 17
    //   2227: iconst_1
    //   2228: isub
    //   2229: if_icmpne -457 -> 1772
    //   2232: iload 8
    //   2234: aload 19
    //   2236: getfield 1228	org/vidogram/messenger/u$a:a	Landroid/text/StaticLayout;
    //   2239: invokevirtual 1220	android/text/StaticLayout:getLineCount	()I
    //   2242: invokestatic 1251	java/lang/Math:max	(II)I
    //   2245: istore 11
    //   2247: aload_0
    //   2248: aload_0
    //   2249: getfield 806	org/vidogram/messenger/u:x	I
    //   2252: aload 19
    //   2254: getfield 1230	org/vidogram/messenger/u$a:c	F
    //   2257: aload 19
    //   2259: getfield 1228	org/vidogram/messenger/u$a:a	Landroid/text/StaticLayout;
    //   2262: invokevirtual 1217	android/text/StaticLayout:getHeight	()I
    //   2265: i2f
    //   2266: fadd
    //   2267: f2i
    //   2268: invokestatic 1251	java/lang/Math:max	(II)I
    //   2271: putfield 806	org/vidogram/messenger/u:x	I
    //   2274: fload_3
    //   2275: fstore_2
    //   2276: goto -504 -> 1772
    //   2279: astore 20
    //   2281: ldc_w 621
    //   2284: aload 20
    //   2286: invokestatic 626	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   2289: fload_3
    //   2290: fstore_2
    //   2291: goto -519 -> 1772
    //   2294: astore 19
    //   2296: ldc_w 621
    //   2299: aload 19
    //   2301: invokestatic 626	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   2304: goto -205 -> 2099
    //   2307: astore 20
    //   2309: ldc_w 621
    //   2312: aload 20
    //   2314: invokestatic 626	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   2317: fconst_0
    //   2318: fstore_3
    //   2319: goto -512 -> 1807
    //   2322: astore 20
    //   2324: ldc_w 621
    //   2327: aload 20
    //   2329: invokestatic 626	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   2332: goto -504 -> 1828
    //   2335: astore 20
    //   2337: ldc_w 621
    //   2340: aload 20
    //   2342: invokestatic 626	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   2345: fconst_0
    //   2346: fstore 5
    //   2348: goto -439 -> 1909
    //   2351: astore 20
    //   2353: ldc_w 621
    //   2356: aload 20
    //   2358: invokestatic 626	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   2361: fconst_0
    //   2362: fstore 6
    //   2364: goto -426 -> 1938
    //   2367: iload 8
    //   2369: ifeq +63 -> 2432
    //   2372: fload_3
    //   2373: fstore 4
    //   2375: iload 10
    //   2377: iload 17
    //   2379: iconst_1
    //   2380: isub
    //   2381: if_icmpne +12 -> 2393
    //   2384: aload_0
    //   2385: iload 15
    //   2387: putfield 1243	org/vidogram/messenger/u:v	I
    //   2390: fload_3
    //   2391: fstore 4
    //   2393: aload_0
    //   2394: aload_0
    //   2395: getfield 1083	org/vidogram/messenger/u:w	I
    //   2398: fload 4
    //   2400: f2d
    //   2401: invokestatic 1224	java/lang/Math:ceil	(D)D
    //   2404: d2i
    //   2405: invokestatic 1251	java/lang/Math:max	(II)I
    //   2408: putfield 1083	org/vidogram/messenger/u:w	I
    //   2411: iload 8
    //   2413: ifeq +9 -> 2422
    //   2416: aload 19
    //   2418: fconst_0
    //   2419: putfield 1234	org/vidogram/messenger/u$a:b	F
    //   2422: iload 11
    //   2424: iload 7
    //   2426: iadd
    //   2427: istore 7
    //   2429: goto -330 -> 2099
    //   2432: iload 10
    //   2434: iload 17
    //   2436: iconst_1
    //   2437: isub
    //   2438: if_icmpne +9 -> 2447
    //   2441: aload_0
    //   2442: iload 14
    //   2444: putfield 1243	org/vidogram/messenger/u:v	I
    //   2447: goto -54 -> 2393
    //   2450: aload_0
    //   2451: aload_0
    //   2452: getfield 1083	org/vidogram/messenger/u:w	I
    //   2455: iload 9
    //   2457: iload 14
    //   2459: invokestatic 856	java/lang/Math:min	(II)I
    //   2462: invokestatic 1251	java/lang/Math:max	(II)I
    //   2465: putfield 1083	org/vidogram/messenger/u:w	I
    //   2468: goto -57 -> 2411
    //   2471: goto -545 -> 1926
    //   2474: iconst_0
    //   2475: istore 8
    //   2477: goto -605 -> 1872
    //   2480: iload 7
    //   2482: istore 9
    //   2484: goto -855 -> 1629
    //   2487: iconst_0
    //   2488: istore 7
    //   2490: goto -2384 -> 106
    //
    // Exception table:
    //   from	to	target	type
    //   427	439	442	java/lang/Throwable
    //   1646	1668	2060	java/lang/Exception
    //   2247	2274	2279	java/lang/Exception
    //   2115	2162	2294	java/lang/Exception
    //   2167	2180	2294	java/lang/Exception
    //   2180	2217	2294	java/lang/Exception
    //   1788	1807	2307	java/lang/Exception
    //   1810	1824	2322	java/lang/Exception
    //   1897	1909	2335	java/lang/Exception
    //   1926	1938	2351	java/lang/Exception
  }

  public boolean b(g.i parami)
  {
    return b(this.a, parami);
  }

  public void c()
  {
    this.q = 0;
    if (!(this.a.r instanceof g.sf))
      return;
    if (B == null)
    {
      B = new TextPaint(1);
      B.setTypeface(a.a("fonts/rmedium.ttf"));
    }
    B.setTextSize(a.a(15.0F));
    int i2 = 0;
    label64: int i4;
    int i3;
    int i1;
    if (i2 < this.a.r.b.size())
    {
      g.mc localmc = (g.mc)this.a.r.b.get(i2);
      i4 = localmc.c.size();
      i3 = 0;
      i1 = 0;
      label114: if (i3 < i4)
      {
        StaticLayout localStaticLayout = new StaticLayout(j.a(((g.aq)localmc.c.get(i3)).b, B.getFontMetricsInt(), a.a(15.0F), false), B, a.a(2000.0F), Layout.Alignment.ALIGN_NORMAL, 1.0F, 0.0F, false);
        if (localStaticLayout.getLineCount() <= 0)
          break label261;
        i1 = Math.max(i1, (int)Math.ceil(localStaticLayout.getLineWidth(0) - localStaticLayout.getLineLeft(0)) + a.a(4.0F));
      }
    }
    label261: 
    while (true)
    {
      i3 += 1;
      break label114;
      this.q = Math.max(this.q, (a.a(12.0F) + i1) * i4 + a.a(5.0F) * (i4 - 1));
      i2 += 1;
      break label64;
      break;
    }
  }

  public void d()
  {
    int i1 = this.f;
    if (((this.a instanceof g.mg)) || ((this.a instanceof g.ns)))
      if (U())
      {
        this.f = 0;
        if ((this.b == null) || (this.b.length() == 0))
          this.b = "Empty message";
      }
    while (true)
    {
      if ((i1 != 1000) && (i1 != this.f))
        a(false);
      return;
      if ((this.a.j instanceof g.ob))
      {
        this.f = 1;
        continue;
      }
      if (((this.a.j instanceof g.oa)) || ((this.a.j instanceof g.of)))
      {
        this.f = 4;
        continue;
      }
      if (I())
      {
        this.f = 3;
        continue;
      }
      if (H())
      {
        this.f = 2;
        continue;
      }
      if (G())
      {
        this.f = 14;
        continue;
      }
      if ((this.a.j instanceof g.nv))
      {
        this.f = 12;
        continue;
      }
      if ((this.a.j instanceof g.od))
      {
        this.f = 0;
        continue;
      }
      if ((this.a.j instanceof g.nw))
      {
        if ((this.a.j.k != null) && (this.a.j.k.g != null))
        {
          if (a(this.a.j.k))
          {
            this.f = 8;
            continue;
          }
          if ((this.a.j.k.g.equals("image/webp")) && (E()))
          {
            this.f = 13;
            continue;
          }
          this.f = 9;
          continue;
        }
        this.f = 9;
        continue;
      }
      if (!(this.a.j instanceof g.nz))
        continue;
      this.f = 0;
      continue;
      if (!(this.a instanceof g.oj))
        continue;
      if ((this.a.f instanceof g.my))
      {
        this.f = 0;
        continue;
      }
      if (((this.a.f instanceof g.mo)) || ((this.a.f instanceof g.nc)))
      {
        this.g = 1;
        this.f = 11;
        continue;
      }
      if ((this.a.f instanceof g.ne))
      {
        if (((this.a.f.d instanceof g.gt)) || ((this.a.f.d instanceof g.gu)))
        {
          this.g = 1;
          this.f = 10;
          continue;
        }
        this.g = -1;
        this.f = -1;
        continue;
      }
      if ((this.a.f instanceof g.mx))
      {
        this.g = -1;
        this.f = -1;
        continue;
      }
      this.g = 1;
      this.f = 10;
    }
  }

  public boolean e()
  {
    if ((this.f != 0) || (this.a.d == null) || (this.b == null) || (this.b.length() == 0))
      return false;
    int i1;
    if (this.G)
    {
      if (!a.c())
        break label161;
      i1 = a.e();
      if (Math.abs(this.H - i1) > a.a(52.0F))
        this.G = false;
    }
    if (!this.G)
    {
      this.G = true;
      g.vw localvw = null;
      if (l())
        localvw = v.a().a(Integer.valueOf(this.a.c));
      if ((this.a.j instanceof g.nz));
      for (TextPaint localTextPaint = C; ; localTextPaint = A)
      {
        this.b = j.a(this.b, localTextPaint.getFontMetricsInt(), a.a(20.0F), false);
        b(localvw);
        return true;
        label161: i1 = a.c.x;
        break;
      }
    }
    return false;
  }

  public String f()
  {
    if ((this.a.j instanceof g.nw))
      return m.b(this.a.j.k);
    if ((this.a.j instanceof g.ob))
    {
      Object localObject = this.a.j.d.h;
      if (((ArrayList)localObject).size() > 0)
      {
        localObject = m.a((ArrayList)localObject, a.f());
        if (localObject != null)
          return m.b((f)localObject);
      }
    }
    else if ((this.a.j instanceof g.oi))
    {
      return m.b(this.a.j.r.s);
    }
    return (String)"";
  }

  public int g()
  {
    if (I())
      return 2;
    if (H())
      return 1;
    if ((this.a.j instanceof g.nw))
      return 3;
    if ((this.a.j instanceof g.ob))
      return 0;
    return 4;
  }

  public void h()
  {
    if (this.c != null)
      return;
    if (((this.a.j instanceof g.oi)) && ((this.a.j.r instanceof g.vp)) && (this.a.j.r.j != null))
      this.c = Spannable.Factory.getInstance().newSpannable(this.a.j.r.j);
    while (this.c != null)
    {
      if (b(this.c));
      try
      {
        Linkify.addLinks((Spannable)this.c, 1);
        this.c = j.a(this.c, A.getFontMetricsInt(), a.a(20.0F), false);
        return;
        if ((!(this.a.j instanceof g.nz)) || (this.a.j.m.h == null))
          continue;
        this.c = Spannable.Factory.getInstance().newSpannable(this.a.j.m.h);
      }
      catch (Exception localException)
      {
        while (true)
          n.a("tmessages", localException);
      }
    }
  }

  public void i()
  {
    if (this.d != null);
    do
    {
      do
        return;
      while ((this.a.j == null) || (this.a.j.l == null) || (this.a.j.l.length() <= 0));
      this.d = j.a(this.a.j.l, A.getFontMetricsInt(), a.a(20.0F), false);
    }
    while (!b(this.d));
    try
    {
      Linkify.addLinks((Spannable)this.d, 5);
      b(this.d, true);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        n.a("tmessages", localException);
    }
  }

  public boolean j()
  {
    return this.a.n;
  }

  public boolean k()
  {
    return (this.a.n) && (this.a.c > 0) && (!this.a.v);
  }

  public boolean l()
  {
    return (this.a.c > 0) && (!this.a.v);
  }

  public boolean m()
  {
    return this.a.o;
  }

  public boolean n()
  {
    return this.a.m;
  }

  public void o()
  {
    this.a.o = false;
  }

  public void p()
  {
    this.a.m = false;
  }

  public int q()
  {
    return this.a.b;
  }

  public boolean r()
  {
    return ((this.a instanceof g.ov)) && ((this.a.j instanceof g.ob)) && (this.a.F > 0) && (this.a.F <= 60);
  }

  public boolean s()
  {
    return ((this.a instanceof g.ov)) && ((((this.a.j instanceof g.ob)) && (this.a.F > 0) && (this.a.F <= 60)) || (H()) || (I()));
  }

  public boolean t()
  {
    return c(this.a);
  }

  public long u()
  {
    return e(this.a);
  }

  public boolean v()
  {
    return (this.a.y == 1) && (this.a.b < 0);
  }

  public boolean w()
  {
    return (this.a.y == 2) && (this.a.b < 0);
  }

  public boolean x()
  {
    return (this.a.y == 0) || (this.a.b > 0);
  }

  public String y()
  {
    if (!s())
      return null;
    int i1 = this.a.F;
    if (this.a.G != 0)
      i1 = Math.max(0, this.a.G - ConnectionsManager.a().b());
    if (i1 < 60)
      return i1 + "s";
    return i1 / 60 + "m";
  }

  public String z()
  {
    if ((this.a.j != null) && (this.a.j.k != null))
      return m.b(this.a.j.k);
    return "";
  }

  public static class a
  {
    public StaticLayout a;
    public float b;
    public float c;
    public int d;
    public int e;
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.u
 * JD-Core Version:    0.6.0
 */