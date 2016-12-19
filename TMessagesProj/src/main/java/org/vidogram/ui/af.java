package org.vidogram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.content.FileProvider;
import android.text.TextUtils.TruncateAt;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.view.WindowManager;
import android.webkit.MimeTypeMap;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;
import org.vidogram.messenger.ApplicationLoader;
import org.vidogram.messenger.MediaController;
import org.vidogram.messenger.Utilities;
import org.vidogram.messenger.h;
import org.vidogram.messenger.m;
import org.vidogram.messenger.n;
import org.vidogram.messenger.r;
import org.vidogram.messenger.y;
import org.vidogram.messenger.y.b;
import org.vidogram.tgnet.ConnectionsManager;
import org.vidogram.tgnet.g.ar;
import org.vidogram.tgnet.g.au;
import org.vidogram.tgnet.g.aw;
import org.vidogram.tgnet.g.hu;
import org.vidogram.tgnet.g.i;
import org.vidogram.tgnet.g.j;
import org.vidogram.tgnet.g.kp;
import org.vidogram.tgnet.g.kr;
import org.vidogram.tgnet.g.kt;
import org.vidogram.tgnet.g.q;
import org.vidogram.tgnet.g.qt;
import org.vidogram.tgnet.g.r;
import org.vidogram.tgnet.g.t;
import org.vidogram.tgnet.g.vq;
import org.vidogram.tgnet.g.wb;
import org.vidogram.tgnet.g.x;
import org.vidogram.ui.Components.BackupImageView;
import org.vidogram.ui.Components.ac;
import org.vidogram.ui.Components.ao;
import org.vidogram.ui.Components.az;
import org.vidogram.ui.Components.bt;
import org.vidogram.ui.a.a.a;
import org.vidogram.ui.a.d;
import org.vidogram.ui.a.d.b;
import org.vidogram.ui.a.g;
import org.vidogram.ui.a.h.d;
import org.vidogram.ui.c.ar;
import org.vidogram.ui.c.as;
import org.vidogram.ui.c.as.a;
import org.vidogram.ui.c.at;
import org.vidogram.ui.c.au;
import org.vidogram.ui.c.au.b;
import org.vidogram.ui.c.z;

public class af extends g
  implements y.b, am.d
{
  private boolean A;
  private boolean B;
  private HashMap<Integer, org.vidogram.messenger.u>[] C = { new HashMap(), new HashMap() };
  private int D;
  private ArrayList<View> E = new ArrayList();
  private boolean F;
  private long G;
  private long H;
  private int I;
  private int J = 4;
  private d[] K = new d[5];
  protected g.j i = null;
  private e j;
  private c k;
  private b l;
  private b m;
  private a n;
  private a o;
  private a p;
  private az q;
  private LinearLayout r;
  private TextView s;
  private ImageView t;
  private LinearLayout u;
  private TextView v;
  private d w;
  private d x;
  private ac y;
  private ArrayList<au> z = new ArrayList(6);

  public af(Bundle paramBundle)
  {
    super(paramBundle);
  }

  private void a(int paramInt1, View paramView, org.vidogram.messenger.u paramu, int paramInt2)
  {
    if (paramu == null);
    label83: label114: Object localObject1;
    label186: label225: label255: Intent localIntent;
    label262: label458: label496: Uri localUri;
    while (true)
    {
      return;
      if (this.d.f())
      {
        if (paramu.u() == this.H)
        {
          paramInt1 = 0;
          if (!this.C[paramInt1].containsKey(Integer.valueOf(paramu.q())))
            break label186;
          this.C[paramInt1].remove(Integer.valueOf(paramu.q()));
          if (!paramu.b(null))
            this.D -= 1;
          if ((!this.C[0].isEmpty()) || (!this.C[1].isEmpty()))
            break label225;
          this.d.d();
          localObject1 = this.d.b().b(4);
          if (this.D != 0)
            break label255;
        }
        for (int i1 = 0; ; i1 = 8)
        {
          ((d)localObject1).setVisibility(i1);
          this.F = false;
          if (!(paramView instanceof ar))
            break label262;
          ((ar)paramView).a(this.C[paramInt1].containsKey(Integer.valueOf(paramu.q())), true);
          return;
          paramInt1 = 1;
          break;
          this.C[paramInt1].put(Integer.valueOf(paramu.q()), paramu);
          if (paramu.b(null))
            break label83;
          this.D += 1;
          break label83;
          this.y.a(this.C[0].size() + this.C[1].size(), true);
          break label114;
        }
        if ((paramView instanceof au))
        {
          ((au)paramView).a(paramInt2, this.C[paramInt1].containsKey(Integer.valueOf(paramu.q())), true);
          return;
        }
        if (!(paramView instanceof as))
          continue;
        ((as)paramView).a(this.C[paramInt1].containsKey(Integer.valueOf(paramu.q())), true);
        return;
      }
      if (this.I == 0)
      {
        am.a().a(l());
        am.a().a(d.d(this.K[this.I]), paramInt1, this.H, this.G, this);
        return;
      }
      if ((this.I != 1) && (this.I != 4))
        break label926;
      if (!(paramView instanceof ar))
        continue;
      paramView = (ar)paramView;
      if (!paramView.b())
        break;
      if ((paramu.G()) && (MediaController.a().a(d.d(this.K[this.I]), paramu)))
        continue;
      if (paramu.a.j != null)
      {
        localObject2 = m.b(paramu.A());
        if ((paramu.a.A == null) || (paramu.a.A.length() == 0))
          break label1049;
        paramView = new File(paramu.a.A);
        if ((paramView != null) && ((paramView == null) || (paramView.exists())))
          break label1043;
        localObject1 = m.b(paramu.a);
        label520: if ((localObject1 == null) || (!((File)localObject1).exists()))
          break label1047;
      }
      while (true)
      {
        try
        {
          localIntent = new Intent("android.intent.action.VIEW");
          localIntent.setFlags(1);
          paramView = MimeTypeMap.getSingleton();
          paramInt1 = ((String)localObject2).lastIndexOf('.');
          if (paramInt1 == -1)
            break label1038;
          localObject2 = paramView.getMimeTypeFromExtension(((String)localObject2).substring(paramInt1 + 1).toLowerCase());
          paramView = (View)localObject2;
          if (localObject2 != null)
            continue;
          localObject2 = paramu.A().g;
          if (localObject2 == null)
            break label1054;
          paramView = (View)localObject2;
          if (((String)localObject2).length() == 0)
            break label1054;
          label622: if (Build.VERSION.SDK_INT < 24)
            break label824;
          localUri = FileProvider.a(l(), "org.vidogram.messenger.beta.provider", (File)localObject1);
          if (paramView == null)
            break label816;
          localObject2 = paramView;
          localIntent.setDataAndType(localUri, (String)localObject2);
          label661: if (paramView == null)
            break label868;
          try
          {
            l().startActivityForResult(localIntent, 500);
            return;
          }
          catch (Exception paramView)
          {
            if (Build.VERSION.SDK_INT < 24)
              break label851;
          }
          localIntent.setDataAndType(FileProvider.a(l(), "org.vidogram.messenger.beta.provider", (File)localObject1), "text/plain");
          label708: l().startActivityForResult(localIntent, 500);
          return;
        }
        catch (Exception paramView)
        {
        }
        if (l() == null)
          break;
        paramView = new AlertDialog.Builder(l());
        paramView.setTitle(r.a("AppName", 2131230856));
        paramView.setPositiveButton(r.a("OK", 2131231604), null);
        paramView.setMessage(r.a("NoHandleAppInstalled", 2131231494, new Object[] { paramu.A().g }));
        b(paramView.create());
        return;
        localObject2 = "";
        break label458;
        label816: localObject2 = "text/plain";
      }
      label824: localUri = Uri.fromFile((File)localObject1);
      if (paramView == null)
        break label1059;
    }
    label926: label1054: label1059: for (Object localObject2 = paramView; ; localObject2 = "text/plain")
    {
      localIntent.setDataAndType(localUri, (String)localObject2);
      break label661;
      label851: localIntent.setDataAndType(Uri.fromFile((File)localObject1), "text/plain");
      break label708;
      label868: l().startActivityForResult(localIntent, 500);
      return;
      if (!paramView.c())
      {
        m.a().a(paramView.getMessage().A(), false, false);
        paramView.a();
        return;
      }
      m.a().a(paramView.getMessage().A());
      paramView.a();
      return;
      if (this.I != 3)
        break;
      try
      {
        paramu = paramu.a.j.r;
        if ((paramu != null) && (!(paramu instanceof g.vq)))
          if ((Build.VERSION.SDK_INT >= 16) && (paramu.l != null) && (paramu.l.length() != 0))
          {
            a(paramu);
            return;
          }
      }
      catch (Exception paramView)
      {
        n.a("tmessages", paramView);
        return;
      }
      for (paramu = paramu.e; ; paramu = null)
      {
        localObject1 = paramu;
        if (paramu == null)
          localObject1 = ((as)paramView).a(0);
        if (localObject1 == null)
          break;
        org.vidogram.messenger.b.a.a(l(), (String)localObject1);
        return;
      }
      paramView = null;
      break label622;
      localObject1 = paramView;
      break label520;
      break;
      paramView = null;
      break label496;
      paramView = null;
      break label622;
    }
  }

  private void a(g.wb paramwb)
  {
    h.d locald = new h.d(l());
    locald.a(new bt(l(), locald.a(), paramwb.h, paramwb.j, paramwb.e, paramwb.l, paramwb.n, paramwb.o));
    locald.c(true);
    b(locald.a());
  }

  private boolean a(org.vidogram.messenger.u paramu, View paramView, int paramInt)
  {
    if (this.d.f())
      return false;
    org.vidogram.messenger.a.b(l().getCurrentFocus());
    Object localObject = this.C;
    if (paramu.u() == this.H)
    {
      i1 = 0;
      localObject[i1].put(Integer.valueOf(paramu.q()), paramu);
      if (!paramu.b(null))
        this.D += 1;
      paramu = this.d.b().b(4);
      if (this.D != 0)
        break label208;
    }
    label208: for (int i1 = 0; ; i1 = 8)
    {
      paramu.setVisibility(i1);
      this.y.a(1, false);
      paramu = new AnimatorSet();
      localObject = new ArrayList();
      i1 = 0;
      while (i1 < this.E.size())
      {
        View localView = (View)this.E.get(i1);
        org.vidogram.messenger.a.d(localView);
        ((ArrayList)localObject).add(ObjectAnimator.ofFloat(localView, "scaleY", new float[] { 0.1F, 1.0F }));
        i1 += 1;
      }
      i1 = 1;
      break;
    }
    paramu.playTogether((Collection)localObject);
    paramu.setDuration(250L);
    paramu.start();
    this.F = false;
    if ((paramView instanceof ar))
      ((ar)paramView).a(true, true);
    while (true)
    {
      this.d.c();
      return true;
      if ((paramView instanceof au))
      {
        ((au)paramView).a(paramInt, true, true);
        continue;
      }
      if (!(paramView instanceof as))
        continue;
      ((as)paramView).a(true, true);
    }
  }

  private void q()
  {
    if ((this.B) && (this.A))
      if (this.q != null)
      {
        if (this.I == 1)
        {
          this.q.setAdapter(this.n);
          this.n.notifyDataSetChanged();
        }
      }
      else if (this.s != null)
      {
        this.s.setText(r.a("NoResult", 2131231509));
        this.s.setTextSize(1, 20.0F);
        this.t.setVisibility(8);
      }
    label347: d locald;
    int i1;
    label481: 
    do
    {
      return;
      if (this.I == 3)
      {
        this.q.setAdapter(this.p);
        this.p.notifyDataSetChanged();
        break;
      }
      if (this.I != 4)
        break;
      this.q.setAdapter(this.o);
      this.o.notifyDataSetChanged();
      break;
      this.s.setTextSize(1, 17.0F);
      this.t.setVisibility(0);
      if (this.I == 0)
      {
        this.q.setAdapter(this.j);
        this.v.setText(r.a("SharedMediaTitle", 2131231846));
        this.t.setImageResource(2130838169);
        if ((int)this.H == 0)
        {
          this.s.setText(r.a("NoMediaSecret", 2131231499));
          this.x.setVisibility(8);
          if ((!d.c(this.K[this.I])) || (!d.d(this.K[this.I]).isEmpty()))
            break label347;
          this.r.setVisibility(0);
          this.q.setEmptyView(null);
          this.u.setVisibility(8);
        }
        while (true)
        {
          this.q.setVisibility(0);
          this.q.setPadding(0, 0, 0, org.vidogram.messenger.a.a(4.0F));
          return;
          this.s.setText(r.a("NoMedia", 2131231497));
          break;
          this.r.setVisibility(8);
          this.q.setEmptyView(this.u);
        }
      }
      if ((this.I != 1) && (this.I != 4))
        continue;
      if (this.I == 1)
      {
        this.q.setAdapter(this.l);
        this.v.setText(r.a("DocumentsTitle", 2131231146));
        this.t.setImageResource(2130838170);
        if ((int)this.H == 0)
        {
          this.s.setText(r.a("NoSharedFilesSecret", 2131231513));
          locald = this.x;
          if (d.d(this.K[this.I]).isEmpty())
            break label773;
          i1 = 0;
          locald.setVisibility(i1);
          if ((!d.c(this.K[this.I])) && (d.b(this.K[this.I])[0] == 0) && (d.d(this.K[this.I]).isEmpty()))
          {
            d.a(this.K[this.I], true);
            long l1 = this.H;
            if (this.I != 1)
              break label779;
            i1 = 1;
            org.vidogram.messenger.d.f.a(l1, 0, 50, 0, i1, true, this.e);
          }
          this.q.setVisibility(0);
          if ((!d.c(this.K[this.I])) || (!d.d(this.K[this.I]).isEmpty()))
            break label784;
          this.r.setVisibility(0);
          this.q.setEmptyView(null);
          this.u.setVisibility(8);
        }
      }
      while (true)
      {
        this.q.setPadding(0, 0, 0, org.vidogram.messenger.a.a(4.0F));
        return;
        this.s.setText(r.a("NoSharedFiles", 2131231512));
        break;
        if (this.I != 4)
          break;
        this.q.setAdapter(this.m);
        this.v.setText(r.a("AudioTitle", 2131230903));
        this.t.setImageResource(2130838172);
        if ((int)this.H == 0)
        {
          this.s.setText(r.a("NoSharedAudioSecret", 2131231511));
          break;
        }
        this.s.setText(r.a("NoSharedAudio", 2131231510));
        break;
        i1 = 8;
        break label481;
        i1 = 4;
        break label566;
        this.r.setVisibility(8);
        this.q.setEmptyView(this.u);
      }
    }
    while (this.I != 3);
    label566: this.q.setAdapter(this.k);
    label773: label779: label784: this.v.setText(r.a("LinksTitle", 2131231393));
    this.t.setImageResource(2130838171);
    if ((int)this.H == 0)
    {
      this.s.setText(r.a("NoSharedLinksSecret", 2131231515));
      locald = this.x;
      if (d.d(this.K[3]).isEmpty())
        break label1088;
      i1 = 0;
      label899: locald.setVisibility(i1);
      if ((!d.c(this.K[this.I])) && (d.b(this.K[this.I])[0] == 0) && (d.d(this.K[this.I]).isEmpty()))
      {
        d.a(this.K[this.I], true);
        org.vidogram.messenger.d.f.a(this.H, 0, 50, 0, 3, true, this.e);
      }
      this.q.setVisibility(0);
      if ((!d.c(this.K[this.I])) || (!d.d(this.K[this.I]).isEmpty()))
        break label1094;
      this.r.setVisibility(0);
      this.q.setEmptyView(null);
      this.u.setVisibility(8);
    }
    while (true)
    {
      this.q.setPadding(0, 0, 0, org.vidogram.messenger.a.a(4.0F));
      return;
      this.s.setText(r.a("NoSharedLinks", 2131231514));
      break;
      label1088: i1 = 8;
      break label899;
      label1094: this.r.setVisibility(8);
      this.q.setEmptyView(this.u);
    }
  }

  private void r()
  {
    int i1 = 0;
    if (this.q == null)
      return;
    int i2 = ((WindowManager)ApplicationLoader.a.getSystemService("window")).getDefaultDisplay().getRotation();
    if ((!org.vidogram.messenger.a.c()) && (ApplicationLoader.a.getResources().getConfiguration().orientation == 2))
    {
      this.y.setTextSize(18);
      label62: if (!org.vidogram.messenger.a.c())
        break label200;
      this.J = 4;
      this.s.setPadding(org.vidogram.messenger.a.a(40.0F), 0, org.vidogram.messenger.a.a(40.0F), org.vidogram.messenger.a.a(128.0F));
    }
    while (true)
    {
      this.j.notifyDataSetChanged();
      if (this.w == null)
        break;
      if (!org.vidogram.messenger.a.c())
      {
        FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)this.w.getLayoutParams();
        if (Build.VERSION.SDK_INT >= 21)
          i1 = org.vidogram.messenger.a.a;
        localLayoutParams.topMargin = i1;
        this.w.setLayoutParams(localLayoutParams);
      }
      if ((org.vidogram.messenger.a.c()) || (ApplicationLoader.a.getResources().getConfiguration().orientation != 2))
        break label274;
      this.v.setTextSize(18.0F);
      return;
      this.y.setTextSize(20);
      break label62;
      label200: if ((i2 == 3) || (i2 == 1))
      {
        this.J = 6;
        this.s.setPadding(org.vidogram.messenger.a.a(40.0F), 0, org.vidogram.messenger.a.a(40.0F), 0);
        continue;
      }
      this.J = 4;
      this.s.setPadding(org.vidogram.messenger.a.a(40.0F), 0, org.vidogram.messenger.a.a(40.0F), org.vidogram.messenger.a.a(128.0F));
    }
    label274: this.v.setTextSize(20.0F);
  }

  public int A()
  {
    return 0;
  }

  public View a(Context paramContext)
  {
    this.d.setBackButtonDrawable(new org.vidogram.ui.a.f(false));
    this.d.setTitle("");
    this.d.setAllowOverlayTitle(false);
    this.d.setActionBarMenuOnItemClick(new a.a()
    {
      public void a(int paramInt)
      {
        int i = 1;
        if (paramInt == -1)
          if (af.b(af.this).f())
          {
            paramInt = i;
            while (paramInt >= 0)
            {
              af.c(af.this)[paramInt].clear();
              paramInt -= 1;
            }
            af.a(af.this, 0);
            af.d(af.this).d();
            af.e(af.this).invalidateViews();
          }
        do
          while (true)
          {
            return;
            af.this.d();
            return;
            if (paramInt == 1)
            {
              if (af.f(af.this) == 0)
                continue;
              af.b(af.this, 0);
              af.g(af.this);
              return;
            }
            if (paramInt == 2)
            {
              if (af.f(af.this) == 1)
                continue;
              af.b(af.this, 1);
              af.g(af.this);
              return;
            }
            if (paramInt == 5)
            {
              if (af.f(af.this) == 3)
                continue;
              af.b(af.this, 3);
              af.g(af.this);
              return;
            }
            if (paramInt == 6)
            {
              if (af.f(af.this) == 4)
                continue;
              af.b(af.this, 4);
              af.g(af.this);
              return;
            }
            if (paramInt != 4)
              break;
            if (af.this.l() == null)
              continue;
            localObject = new AlertDialog.Builder(af.this.l());
            paramInt = af.c(af.this)[0].size();
            ((AlertDialog.Builder)localObject).setMessage(r.a("AreYouSureDeleteMessages", 2131230877, new Object[] { r.b("items", af.c(af.this)[1].size() + paramInt) }));
            ((AlertDialog.Builder)localObject).setTitle(r.a("AppName", 2131230856));
            ((AlertDialog.Builder)localObject).setPositiveButton(r.a("OK", 2131231604), new DialogInterface.OnClickListener()
            {
              public void onClick(DialogInterface paramDialogInterface, int paramInt)
              {
                paramInt = 1;
                ArrayList localArrayList;
                int i;
                Object localObject;
                if (paramInt >= 0)
                {
                  localArrayList = new ArrayList(af.c(af.this)[paramInt].keySet());
                  paramDialogInterface = null;
                  int j = 0;
                  i = j;
                  if (!localArrayList.isEmpty())
                  {
                    localObject = (org.vidogram.messenger.u)af.c(af.this)[paramInt].get(localArrayList.get(0));
                    i = j;
                    if (((org.vidogram.messenger.u)localObject).a.d.b != 0)
                      i = ((org.vidogram.messenger.u)localObject).a.d.b;
                  }
                  if ((int)af.a(af.this) == 0)
                    paramDialogInterface = org.vidogram.messenger.v.a().c(Integer.valueOf((int)(af.a(af.this) >> 32)));
                  if (paramDialogInterface == null)
                    break label320;
                  localObject = new ArrayList();
                  Iterator localIterator = af.c(af.this)[paramInt].entrySet().iterator();
                  while (localIterator.hasNext())
                  {
                    org.vidogram.messenger.u localu = (org.vidogram.messenger.u)((Map.Entry)localIterator.next()).getValue();
                    if ((localu.a.C == 0L) || (localu.f == 10))
                      continue;
                    ((ArrayList)localObject).add(Long.valueOf(localu.a.C));
                  }
                }
                while (true)
                {
                  org.vidogram.messenger.v.a().a(localArrayList, (ArrayList)localObject, paramDialogInterface, i);
                  af.c(af.this)[paramInt].clear();
                  paramInt -= 1;
                  break;
                  af.h(af.this).d();
                  af.i(af.this).g();
                  af.a(af.this, 0);
                  return;
                  label320: localObject = null;
                }
              }
            });
            ((AlertDialog.Builder)localObject).setNegativeButton(r.a("Cancel", 2131230943), null);
            af.this.b(((AlertDialog.Builder)localObject).create());
            return;
          }
        while (paramInt != 3);
        Object localObject = new Bundle();
        ((Bundle)localObject).putBoolean("onlySelect", true);
        ((Bundle)localObject).putInt("dialogsType", 1);
        localObject = new v((Bundle)localObject);
        ((v)localObject).a(new v.a()
        {
          public void a(v paramv, long paramLong, boolean paramBoolean)
          {
            int i = (int)paramLong;
            if (i != 0)
            {
              Object localObject1 = new Bundle();
              ((Bundle)localObject1).putBoolean("scrollToTopOnResume", true);
              if (i > 0)
                ((Bundle)localObject1).putInt("user_id", i);
              do
              {
                while (!org.vidogram.messenger.v.a((Bundle)localObject1, paramv))
                {
                  return;
                  if (i >= 0)
                    continue;
                  ((Bundle)localObject1).putInt("chat_id", -i);
                }
                paramv = new ArrayList();
                i = 1;
                while (i >= 0)
                {
                  Object localObject2 = new ArrayList(af.c(af.this)[i].keySet());
                  Collections.sort((List)localObject2);
                  localObject2 = ((ArrayList)localObject2).iterator();
                  while (((Iterator)localObject2).hasNext())
                  {
                    Integer localInteger = (Integer)((Iterator)localObject2).next();
                    if (localInteger.intValue() <= 0)
                      continue;
                    paramv.add(af.c(af.this)[i].get(localInteger));
                  }
                  af.c(af.this)[i].clear();
                  i -= 1;
                }
                af.a(af.this, 0);
                af.j(af.this).d();
                y.a().a(y.d, new Object[0]);
                localObject1 = new q((Bundle)localObject1);
                af.this.a((g)localObject1, true);
                ((q)localObject1).a(true, null, paramv, null, false, false);
              }
              while (org.vidogram.messenger.a.c());
              af.this.e();
              return;
            }
            paramv.d();
          }
        });
        af.this.a((g)localObject);
      }
    });
    int i1 = 1;
    while (i1 >= 0)
    {
      this.C[i1].clear();
      i1 -= 1;
    }
    this.D = 0;
    this.E.clear();
    Object localObject1 = this.d.a();
    this.x = ((org.vidogram.ui.a.c)localObject1).b(0, 2130837806).d(true).a(new d.b()
    {
      public void a()
      {
        af.k(af.this).setVisibility(8);
        af.a(af.this, true);
      }

      public void a(EditText paramEditText)
      {
        paramEditText = paramEditText.getText().toString();
        if (paramEditText.length() != 0)
        {
          af.b(af.this, true);
          af.g(af.this);
        }
        if (af.f(af.this) == 1)
          if (af.l(af.this) != null);
        do
          while (true)
          {
            return;
            af.l(af.this).a(paramEditText);
            return;
            if (af.f(af.this) != 3)
              break;
            if (af.m(af.this) == null)
              continue;
            af.m(af.this).a(paramEditText);
            return;
          }
        while ((af.f(af.this) != 4) || (af.n(af.this) == null));
        af.n(af.this).a(paramEditText);
      }

      public void c()
      {
        af.k(af.this).setVisibility(0);
        if (af.f(af.this) == 1)
          af.l(af.this).a(null);
        while (true)
        {
          af.a(af.this, false);
          af.b(af.this, false);
          af.g(af.this);
          return;
          if (af.f(af.this) == 3)
          {
            af.m(af.this).a(null);
            continue;
          }
          if (af.f(af.this) != 4)
            continue;
          af.n(af.this).a(null);
        }
      }
    });
    this.x.getSearchField().setHint(r.a("Search", 2131231766));
    this.x.setVisibility(8);
    this.w = new d(paramContext, (org.vidogram.ui.a.c)localObject1, 0);
    this.w.setSubMenuOpenSide(1);
    this.w.a(1, r.a("SharedMediaTitle", 2131231846), 0);
    this.w.a(2, r.a("DocumentsTitle", 2131231146), 0);
    float f;
    if ((int)this.H != 0)
    {
      this.w.a(5, r.a("LinksTitle", 2131231393), 0);
      this.w.a(6, r.a("AudioTitle", 2131230903), 0);
      localObject1 = this.d;
      localObject2 = this.w;
      if (!org.vidogram.messenger.a.c())
        break label922;
      f = 64.0F;
    }
    while (true)
    {
      ((org.vidogram.ui.a.a)localObject1).addView((View)localObject2, 0, org.vidogram.ui.Components.v.a(-2, -1.0F, 51, f, 0.0F, 40.0F, 0.0F));
      this.w.setOnClickListener(new View.OnClickListener()
      {
        public void onClick(View paramView)
        {
          af.k(af.this).b();
        }
      });
      this.v = new TextView(paramContext);
      this.v.setGravity(3);
      this.v.setSingleLine(true);
      this.v.setLines(1);
      this.v.setMaxLines(1);
      this.v.setEllipsize(TextUtils.TruncateAt.END);
      this.v.setTextColor(-1);
      this.v.setTypeface(org.vidogram.messenger.a.a("fonts/rmedium.ttf"));
      this.v.setCompoundDrawablesWithIntrinsicBounds(0, 0, 2130837814, 0);
      this.v.setCompoundDrawablePadding(org.vidogram.messenger.a.a(4.0F));
      this.v.setPadding(0, 0, org.vidogram.messenger.a.a(10.0F), 0);
      this.w.addView(this.v, org.vidogram.ui.Components.v.a(-2, -2.0F, 16, 16.0F, 0.0F, 0.0F, 0.0F));
      localObject1 = this.d.b();
      this.y = new ac(((org.vidogram.ui.a.c)localObject1).getContext());
      this.y.setTextSize(18);
      this.y.setTypeface(org.vidogram.messenger.a.a("fonts/rmedium.ttf"));
      this.y.setTextColor(-9211021);
      this.y.setOnTouchListener(new View.OnTouchListener()
      {
        public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
        {
          return true;
        }
      });
      ((org.vidogram.ui.a.c)localObject1).addView(this.y, org.vidogram.ui.Components.v.a(0, -1, 1.0F, 65, 0, 0, 0));
      if ((int)this.H != 0)
        this.E.add(((org.vidogram.ui.a.c)localObject1).a(3, 2130837800, -986896, null, org.vidogram.messenger.a.a(54.0F)));
      this.E.add(((org.vidogram.ui.a.c)localObject1).a(4, 2130837799, -986896, null, org.vidogram.messenger.a.a(54.0F)));
      this.j = new e(paramContext);
      this.l = new b(paramContext, 1);
      this.m = new b(paramContext, 4);
      this.n = new a(paramContext, 1);
      this.o = new a(paramContext, 4);
      this.p = new a(paramContext, 3);
      this.k = new c(paramContext);
      localObject1 = new FrameLayout(paramContext);
      this.b = ((View)localObject1);
      this.q = new az(paramContext);
      this.q.setDivider(null);
      this.q.setDividerHeight(0);
      this.q.setDrawSelectorOnTop(true);
      this.q.setClipToPadding(false);
      ((FrameLayout)localObject1).addView(this.q, org.vidogram.ui.Components.v.a(-1, -1.0F));
      this.q.setOnItemClickListener(new AdapterView.OnItemClickListener()
      {
        public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
        {
          if (((af.f(af.this) == 1) || (af.f(af.this) == 4)) && ((paramView instanceof ar)))
            af.a(af.this, paramInt, paramView, ((ar)paramView).getMessage(), 0);
          do
            return;
          while ((af.f(af.this) != 3) || (!(paramView instanceof as)));
          af.a(af.this, paramInt, paramView, ((as)paramView).getMessage(), 0);
        }
      });
      this.q.setOnScrollListener(new AbsListView.OnScrollListener()
      {
        public void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
        {
          int i = 2;
          if ((af.o(af.this)) && (af.p(af.this)));
          do
          {
            do
              return;
            while ((paramInt2 == 0) || (paramInt1 + paramInt2 <= paramInt3 - 2) || (af.d.c(af.q(af.this)[af.f(af.this)])));
            if (af.f(af.this) == 0)
              paramInt1 = 0;
            while (af.d.b(af.q(af.this)[af.f(af.this)])[0] == 0)
            {
              af.d.a(af.q(af.this)[af.f(af.this)], true);
              org.vidogram.messenger.d.f.a(af.a(af.this), 0, 50, af.d.a(af.q(af.this)[af.f(af.this)])[0], paramInt1, true, af.r(af.this));
              return;
              if (af.f(af.this) == 1)
              {
                paramInt1 = 1;
                continue;
              }
              paramInt1 = i;
              if (af.f(af.this) == 2)
                continue;
              if (af.f(af.this) == 4)
              {
                paramInt1 = 4;
                continue;
              }
              paramInt1 = 3;
            }
          }
          while ((af.s(af.this) == 0L) || (af.d.b(af.q(af.this)[af.f(af.this)])[1] != 0));
          af.d.a(af.q(af.this)[af.f(af.this)], true);
          org.vidogram.messenger.d.f.a(af.s(af.this), 0, 50, af.d.a(af.q(af.this)[af.f(af.this)])[1], paramInt1, true, af.t(af.this));
        }

        public void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
        {
          boolean bool = true;
          if ((paramInt == 1) && (af.o(af.this)) && (af.p(af.this)))
            org.vidogram.messenger.a.b(af.this.l().getCurrentFocus());
          paramAbsListView = af.this;
          if (paramInt != 0);
          while (true)
          {
            af.c(paramAbsListView, bool);
            return;
            bool = false;
          }
        }
      });
      this.q.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener()
      {
        public boolean onItemLongClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
        {
          if (((af.f(af.this) == 1) || (af.f(af.this) == 4)) && ((paramView instanceof ar)))
          {
            paramAdapterView = ((ar)paramView).getMessage();
            return af.a(af.this, paramAdapterView, paramView, 0);
          }
          if ((af.f(af.this) == 3) && ((paramView instanceof as)))
          {
            paramAdapterView = ((as)paramView).getMessage();
            return af.a(af.this, paramAdapterView, paramView, 0);
          }
          return false;
        }
      });
      i1 = 0;
      while (i1 < 6)
      {
        this.z.add(new au(paramContext));
        i1 += 1;
      }
      localObject1 = org.vidogram.messenger.v.a().c(Integer.valueOf((int)(this.H >> 32)));
      if ((localObject1 == null) || (org.vidogram.messenger.a.c(((g.t)localObject1).o) < 46))
        break;
      this.w.a(6, r.a("AudioTitle", 2131230903), 0);
      break;
      label922: f = 56.0F;
    }
    this.u = new LinearLayout(paramContext);
    this.u.setOrientation(1);
    this.u.setGravity(17);
    this.u.setVisibility(8);
    this.u.setBackgroundColor(-986896);
    ((FrameLayout)localObject1).addView(this.u, org.vidogram.ui.Components.v.a(-1, -1.0F));
    this.u.setOnTouchListener(new View.OnTouchListener()
    {
      public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
      {
        return true;
      }
    });
    this.t = new ImageView(paramContext);
    this.u.addView(this.t, org.vidogram.ui.Components.v.b(-2, -2));
    this.s = new TextView(paramContext);
    this.s.setTextColor(-7697782);
    this.s.setGravity(17);
    this.s.setTextSize(1, 17.0F);
    this.s.setPadding(org.vidogram.messenger.a.a(40.0F), 0, org.vidogram.messenger.a.a(40.0F), org.vidogram.messenger.a.a(128.0F));
    this.u.addView(this.s, org.vidogram.ui.Components.v.b(-2, -2, 17, 0, 24, 0, 0));
    this.r = new LinearLayout(paramContext);
    this.r.setGravity(17);
    this.r.setOrientation(1);
    this.r.setVisibility(8);
    this.r.setBackgroundColor(-986896);
    ((FrameLayout)localObject1).addView(this.r, org.vidogram.ui.Components.v.a(-1, -1.0F));
    Object localObject2 = new ProgressBar(paramContext);
    this.r.addView((View)localObject2, org.vidogram.ui.Components.v.b(-2, -2));
    q();
    if (!org.vidogram.messenger.a.c())
      ((FrameLayout)localObject1).addView(new ao(paramContext, this), org.vidogram.ui.Components.v.a(-1, 39.0F, 51, 0.0F, -36.0F, 0.0F, 0.0F));
    return (View)(View)this.b;
  }

  public am.e a(org.vidogram.messenger.u paramu, g.x paramx, int paramInt)
  {
    if ((paramu == null) || (this.q == null) || (this.I != 0))
      return null;
    int i2 = this.q.getChildCount();
    paramInt = 0;
    if (paramInt < i2)
    {
      paramx = this.q.getChildAt(paramInt);
      Object localObject;
      int i1;
      if ((paramx instanceof au))
      {
        localObject = (au)paramx;
        i1 = 0;
      }
      while (true)
      {
        org.vidogram.messenger.u localu;
        if (i1 < 6)
        {
          localu = ((au)localObject).b(i1);
          if (localu != null);
        }
        else
        {
          paramInt += 1;
          break;
        }
        paramx = ((au)localObject).a(i1);
        if (localu.q() == paramu.q())
        {
          paramu = new int[2];
          paramx.getLocationInWindow(paramu);
          localObject = new am.e();
          ((am.e)localObject).b = paramu[0];
          i1 = paramu[1];
          if (Build.VERSION.SDK_INT >= 21);
          for (paramInt = 0; ; paramInt = org.vidogram.messenger.a.a)
          {
            ((am.e)localObject).c = (i1 - paramInt);
            ((am.e)localObject).d = this.q;
            ((am.e)localObject).a = paramx.getImageReceiver();
            ((am.e)localObject).e = ((am.e)localObject).a.h();
            ((am.e)localObject).d.getLocationInWindow(paramu);
            ((am.e)localObject).j = org.vidogram.messenger.a.a(40.0F);
            return localObject;
          }
        }
        i1 += 1;
      }
    }
    return (am.e)null;
  }

  public void a(int paramInt, Object[] paramArrayOfObject)
  {
    int i2;
    boolean bool;
    int i1;
    Object localObject2;
    if (paramInt == y.p)
    {
      long l1 = ((Long)paramArrayOfObject[0]).longValue();
      if (((Integer)paramArrayOfObject[3]).intValue() == this.e)
      {
        i2 = ((Integer)paramArrayOfObject[4]).intValue();
        d.a(this.K[i2], false);
        d.a(this.K[i2], ((Integer)paramArrayOfObject[1]).intValue());
        localObject1 = (ArrayList)paramArrayOfObject[2];
        if ((int)this.H == 0)
        {
          bool = true;
          if (l1 != this.H)
            break label159;
        }
        label159: for (paramInt = 0; ; paramInt = 1)
        {
          i1 = 0;
          while (i1 < ((ArrayList)localObject1).size())
          {
            localObject2 = (org.vidogram.messenger.u)((ArrayList)localObject1).get(i1);
            this.K[i2].a((org.vidogram.messenger.u)localObject2, false, bool);
            i1 += 1;
          }
          bool = false;
          break;
        }
        d.b(this.K[i2])[paramInt] = ((Boolean)paramArrayOfObject[5]).booleanValue();
        if ((paramInt == 0) && (d.d(this.K[this.I]).isEmpty()) && (this.G != 0L))
        {
          d.a(this.K[this.I], true);
          org.vidogram.messenger.d.f.a(this.G, 0, 50, d.a(this.K[this.I])[1], i2, true, this.e);
        }
        if (!d.c(this.K[this.I]))
        {
          if (this.r != null)
            this.r.setVisibility(8);
          if ((this.I == i2) && (this.q != null) && (this.q.getEmptyView() == null))
            this.q.setEmptyView(this.u);
        }
        this.F = true;
        if ((this.I != 0) || (i2 != 0))
          break label422;
        if (this.j != null)
          this.j.notifyDataSetChanged();
        if ((this.I == 1) || (this.I == 3) || (this.I == 4))
        {
          paramArrayOfObject = this.x;
          if ((d.d(this.K[this.I]).isEmpty()) || (this.B))
            break label515;
        }
      }
      label515: for (paramInt = 0; ; paramInt = 8)
      {
        paramArrayOfObject.setVisibility(paramInt);
        return;
        label422: if ((this.I == 1) && (i2 == 1))
        {
          if (this.l == null)
            break;
          this.l.notifyDataSetChanged();
          break;
        }
        if ((this.I == 3) && (i2 == 3))
        {
          if (this.k == null)
            break;
          this.k.notifyDataSetChanged();
          break;
        }
        if ((this.I != 4) || (i2 != 4) || (this.m == null))
          break;
        this.m.notifyDataSetChanged();
        break;
      }
    }
    if (paramInt == y.e)
      if ((int)this.H >= 0)
        break label1151;
    label697: label873: label880: label1148: label1151: for (Object localObject1 = org.vidogram.messenger.v.a().b(Integer.valueOf(-(int)this.H)); ; localObject1 = null)
    {
      paramInt = ((Integer)paramArrayOfObject[1]).intValue();
      if (org.vidogram.messenger.e.d((g.i)localObject1))
        if ((paramInt == 0) && (this.G != 0L))
          paramInt = 1;
      while (true)
      {
        paramArrayOfObject = (ArrayList)paramArrayOfObject[0];
        i2 = 0;
        paramArrayOfObject = paramArrayOfObject.iterator();
        if (!paramArrayOfObject.hasNext())
          break label697;
        localObject1 = (Integer)paramArrayOfObject.next();
        localObject2 = this.K;
        int i4 = localObject2.length;
        i1 = 0;
        int i3 = i2;
        while (true)
        {
          i2 = i3;
          if (i1 >= i4)
            break;
          if (localObject2[i1].a(((Integer)localObject1).intValue(), paramInt))
            i3 = 1;
          i1 += 1;
        }
        if (paramInt != ((g.i)localObject1).h)
          break;
        paramInt = 0;
        continue;
        if (paramInt != 0)
          break;
        paramInt = 0;
      }
      if (i2 == 0)
        break;
      this.F = true;
      if (this.j != null)
        this.j.notifyDataSetChanged();
      if (this.l != null)
        this.l.notifyDataSetChanged();
      if (this.k != null)
        this.k.notifyDataSetChanged();
      if (this.m != null)
        this.m.notifyDataSetChanged();
      if ((this.I != 1) && (this.I != 3) && (this.I != 4))
        break;
      paramArrayOfObject = this.x;
      if ((!d.d(this.K[this.I]).isEmpty()) && (!this.B));
      for (paramInt = 0; ; paramInt = 8)
      {
        paramArrayOfObject.setVisibility(paramInt);
        return;
      }
      if (paramInt == y.a)
      {
        if (((Long)paramArrayOfObject[0]).longValue() != this.H)
          break;
        paramArrayOfObject = (ArrayList)paramArrayOfObject[1];
        if ((int)this.H == 0)
        {
          bool = true;
          paramInt = 0;
          paramArrayOfObject = paramArrayOfObject.iterator();
          while (true)
            if (paramArrayOfObject.hasNext())
            {
              localObject1 = (org.vidogram.messenger.u)paramArrayOfObject.next();
              if (((org.vidogram.messenger.u)localObject1).a.j == null)
                continue;
              i1 = org.vidogram.messenger.d.f.a(((org.vidogram.messenger.u)localObject1).a);
              if (i1 == -1)
                break;
              if (!this.K[i1].a((org.vidogram.messenger.u)localObject1, true, bool))
                break label1148;
              paramInt = 1;
            }
        }
      }
      while (true)
      {
        break label880;
        bool = false;
        break label873;
        if (paramInt == 0)
          break;
        this.F = true;
        if (this.j != null)
          this.j.notifyDataSetChanged();
        if (this.l != null)
          this.l.notifyDataSetChanged();
        if (this.k != null)
          this.k.notifyDataSetChanged();
        if (this.m != null)
          this.m.notifyDataSetChanged();
        if ((this.I != 1) && (this.I != 3) && (this.I != 4))
          break;
        paramArrayOfObject = this.x;
        if ((!d.d(this.K[this.I]).isEmpty()) && (!this.B));
        for (paramInt = 0; ; paramInt = 8)
        {
          paramArrayOfObject.setVisibility(paramInt);
          return;
        }
        if (paramInt != y.i)
          break;
        localObject1 = (Integer)paramArrayOfObject[0];
        paramArrayOfObject = (Integer)paramArrayOfObject[1];
        localObject2 = this.K;
        i1 = localObject2.length;
        paramInt = 0;
        while (paramInt < i1)
        {
          localObject2[paramInt].b(((Integer)localObject1).intValue(), paramArrayOfObject.intValue());
          paramInt += 1;
        }
        break;
      }
    }
  }

  public void a(Configuration paramConfiguration)
  {
    super.a(paramConfiguration);
    if (this.q != null)
      this.q.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener()
      {
        public boolean onPreDraw()
        {
          af.e(af.this).getViewTreeObserver().removeOnPreDrawListener(this);
          af.u(af.this);
          return true;
        }
      });
  }

  public void a(g.j paramj)
  {
    this.i = paramj;
    if ((this.i != null) && (this.i.q != 0))
      this.G = (-this.i.q);
  }

  public void a_(int paramInt)
  {
  }

  public Bitmap b(org.vidogram.messenger.u paramu, g.x paramx, int paramInt)
  {
    return null;
  }

  public boolean b(int paramInt)
  {
    return false;
  }

  public void c(int paramInt)
  {
  }

  public void c(org.vidogram.messenger.u paramu, g.x paramx, int paramInt)
  {
  }

  public void d(int paramInt)
  {
  }

  public boolean f()
  {
    super.f();
    y.a().a(this, y.p);
    y.a().a(this, y.e);
    y.a().a(this, y.a);
    y.a().a(this, y.i);
    this.H = b().getLong("dialog_id", 0L);
    int i1 = 0;
    if (i1 < this.K.length)
    {
      this.K[i1] = new d(null);
      int[] arrayOfInt = d.a(this.K[i1]);
      if ((int)this.H == 0);
      for (int i2 = -2147483648; ; i2 = 2147483647)
      {
        arrayOfInt[0] = i2;
        if ((this.G != 0L) && (this.i != null))
        {
          d.a(this.K[i1])[1] = this.i.r;
          d.b(this.K[i1])[1] = 0;
        }
        i1 += 1;
        break;
      }
    }
    d.a(this.K[0], true);
    org.vidogram.messenger.d.f.a(this.H, 0, 50, 0, 0, true, this.e);
    return true;
  }

  public void g()
  {
    super.g();
    y.a().b(this, y.p);
    y.a().b(this, y.a);
    y.a().b(this, y.e);
    y.a().b(this, y.i);
  }

  public void i()
  {
    super.i();
    this.F = true;
    if (this.j != null)
      this.j.notifyDataSetChanged();
    if (this.l != null)
      this.l.notifyDataSetChanged();
    if (this.k != null)
      this.k.notifyDataSetChanged();
    r();
  }

  public void j()
  {
    super.j();
    if (this.w != null)
      this.w.c();
  }

  public boolean w()
  {
    return true;
  }

  public boolean x()
  {
    return false;
  }

  public void y()
  {
  }

  public boolean z()
  {
    return true;
  }

  public class a extends org.vidogram.ui.b.a
  {
    protected ArrayList<org.vidogram.messenger.u> a = new ArrayList();
    private Context c;
    private ArrayList<org.vidogram.messenger.u> d = new ArrayList();
    private Timer e;
    private int f = 0;
    private int g;
    private int h;

    public a(Context paramInt, int arg3)
    {
      this.c = paramInt;
      int i;
      this.h = i;
    }

    private void a(ArrayList<org.vidogram.messenger.u> paramArrayList)
    {
      org.vidogram.messenger.a.a(new Runnable(paramArrayList)
      {
        public void run()
        {
          af.a.b(af.a.this, this.a);
          af.a.this.notifyDataSetChanged();
        }
      });
    }

    private void b(String paramString)
    {
      org.vidogram.messenger.a.a(new Runnable(paramString)
      {
        public void run()
        {
          Object localObject;
          if (!af.d.d(af.q(af.this)[af.a.b(af.a.this)]).isEmpty())
          {
            if ((af.a.b(af.a.this) != 1) && (af.a.b(af.a.this) != 4))
              break label194;
            localObject = (org.vidogram.messenger.u)af.d.d(af.q(af.this)[af.a.b(af.a.this)]).get(af.d.d(af.q(af.this)[af.a.b(af.a.this)]).size() - 1);
            af.a.this.a(this.a, ((org.vidogram.messenger.u)localObject).q(), ((org.vidogram.messenger.u)localObject).u());
          }
          while (true)
          {
            if ((af.a.b(af.a.this) == 1) || (af.a.b(af.a.this) == 4))
            {
              localObject = new ArrayList();
              ((ArrayList)localObject).addAll(af.d.d(af.q(af.this)[af.a.b(af.a.this)]));
              Utilities.e.b(new Runnable((ArrayList)localObject)
              {
                public void run()
                {
                  Object localObject2 = af.a.3.this.a.trim().toLowerCase();
                  if (((String)localObject2).length() == 0)
                  {
                    af.a.a(af.a.this, new ArrayList());
                    return;
                  }
                  Object localObject1 = r.a().a((String)localObject2);
                  if ((((String)localObject2).equals(localObject1)) || (((String)localObject1).length() == 0))
                    localObject1 = null;
                  while (true)
                  {
                    int i;
                    label115: org.vidogram.messenger.u localu;
                    int j;
                    label141: String str;
                    if (localObject1 != null)
                    {
                      i = 1;
                      String[] arrayOfString = new String[i + 1];
                      arrayOfString[0] = localObject2;
                      if (localObject1 != null)
                        arrayOfString[1] = localObject1;
                      localObject2 = new ArrayList();
                      i = 0;
                      if (i >= this.a.size())
                        break label378;
                      localu = (org.vidogram.messenger.u)this.a.get(i);
                      j = 0;
                      if (j >= arrayOfString.length)
                        break label207;
                      str = arrayOfString[j];
                      localObject1 = localu.z();
                      if ((localObject1 != null) && (((String)localObject1).length() != 0))
                        break label186;
                    }
                    label391: label394: label400: label404: 
                    while (true)
                    {
                      j += 1;
                      break label141;
                      i = 0;
                      break;
                      label186: if (((String)localObject1).toLowerCase().contains(str))
                      {
                        ((ArrayList)localObject2).add(localu);
                        label207: i += 1;
                        break label115;
                      }
                      if (af.a.b(af.a.this) != 4)
                        continue;
                      label252: int k;
                      label254: boolean bool;
                      if (localu.f == 0)
                      {
                        localObject1 = localu.a.j.r.s;
                        k = 0;
                        if (k >= ((g.q)localObject1).o.size())
                          break label400;
                        g.r localr = (g.r)((g.q)localObject1).o.get(k);
                        if (!(localr instanceof g.hu))
                          break label371;
                        if (localr.l == null)
                          break label394;
                        bool = localr.l.toLowerCase().contains(str);
                        label311: if ((bool) || (localr.k == null))
                          break label391;
                        bool = localr.k.toLowerCase().contains(str);
                      }
                      while (true)
                      {
                        if (!bool)
                          break label404;
                        ((ArrayList)localObject2).add(localu);
                        break;
                        localObject1 = localu.a.j.k;
                        break label252;
                        label371: k += 1;
                        break label254;
                        label378: af.a.a(af.a.this, (ArrayList)localObject2);
                        return;
                        continue;
                        bool = false;
                        break label311;
                        bool = false;
                      }
                    }
                  }
                }
              });
            }
            return;
            label194: if (af.a.b(af.a.this) != 3)
              continue;
            af.a.this.a(this.a, 0, af.a(af.this));
          }
        }
      });
    }

    public org.vidogram.messenger.u a(int paramInt)
    {
      if (paramInt < this.d.size())
        return (org.vidogram.messenger.u)this.d.get(paramInt);
      return (org.vidogram.messenger.u)this.a.get(paramInt - this.d.size());
    }

    public void a(String paramString)
    {
      try
      {
        if (this.e != null)
          this.e.cancel();
        if (paramString == null)
        {
          this.d.clear();
          notifyDataSetChanged();
          return;
        }
      }
      catch (Exception localException)
      {
        while (true)
          n.a("tmessages", localException);
        this.e = new Timer();
        this.e.schedule(new TimerTask(paramString)
        {
          public void run()
          {
            try
            {
              af.a.a(af.a.this).cancel();
              af.a.a(af.a.this, null);
              af.a.a(af.a.this, this.a);
              return;
            }
            catch (Exception localException)
            {
              while (true)
                n.a("tmessages", localException);
            }
          }
        }
        , 200L, 300L);
      }
    }

    public void a(String paramString, int paramInt, long paramLong)
    {
      int i = (int)paramLong;
      if (i == 0)
        return;
      if (this.f != 0)
      {
        ConnectionsManager.a().a(this.f, true);
        this.f = 0;
      }
      if ((paramString == null) || (paramString.length() == 0))
      {
        this.a.clear();
        this.g = 0;
        notifyDataSetChanged();
        return;
      }
      g.qt localqt = new g.qt();
      localqt.i = 0;
      localqt.k = 50;
      localqt.j = paramInt;
      if (this.h == 1)
        localqt.f = new g.kp();
      while (true)
      {
        localqt.e = paramString;
        localqt.d = org.vidogram.messenger.v.c(i);
        if (localqt.d == null)
          break;
        i = this.g + 1;
        this.g = i;
        this.f = ConnectionsManager.a().a(localqt, new org.vidogram.tgnet.c(paramInt, i)
        {
        }
        , 2);
        ConnectionsManager.a().a(this.f, af.C(af.this));
        return;
        if (this.h == 3)
        {
          localqt.f = new g.kt();
          continue;
        }
        if (this.h != 4)
          continue;
        localqt.f = new g.kr();
      }
    }

    public boolean areAllItemsEnabled()
    {
      return false;
    }

    public int getCount()
    {
      int j = this.d.size();
      int k = this.a.size();
      int i = j;
      if (k != 0)
        i = j + k;
      return i;
    }

    public long getItemId(int paramInt)
    {
      return paramInt;
    }

    public int getItemViewType(int paramInt)
    {
      return 0;
    }

    public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      boolean bool4 = true;
      boolean bool3 = true;
      boolean bool5 = true;
      boolean bool2 = true;
      if ((this.h == 1) || (this.h == 4))
      {
        if (paramView != null)
          break label408;
        paramView = new ar(this.c);
      }
      label408: 
      while (true)
      {
        paramViewGroup = (ar)paramView;
        org.vidogram.messenger.u localu = a(paramInt);
        HashMap[] arrayOfHashMap;
        if (paramInt != getCount() - 1)
        {
          bool1 = true;
          paramViewGroup.a(localu, bool1);
          if (!af.D(af.this).f())
            break label175;
          arrayOfHashMap = af.c(af.this);
          if (localu.u() != af.a(af.this))
            break label164;
          paramInt = 0;
          label117: bool3 = arrayOfHashMap[paramInt].containsKey(Integer.valueOf(localu.q()));
          if (af.x(af.this))
            break label169;
        }
        label164: label169: for (boolean bool1 = bool2; ; bool1 = false)
        {
          paramViewGroup.a(bool3, bool1);
          return paramView;
          bool1 = false;
          break;
          paramInt = 1;
          break label117;
        }
        label175: if (!af.x(af.this));
        for (bool1 = bool4; ; bool1 = false)
        {
          paramViewGroup.a(false, bool1);
          return paramView;
        }
        if (this.h == 3)
        {
          if (paramView == null)
          {
            paramView = new as(this.c);
            ((as)paramView).setDelegate(new as.a()
            {
              public void a(g.wb paramwb)
              {
                af.a(af.this, paramwb);
              }

              public boolean a()
              {
                return !af.E(af.this).f();
              }
            });
          }
          while (true)
          {
            paramViewGroup = (as)paramView;
            localu = a(paramInt);
            if (paramInt != getCount() - 1)
            {
              bool1 = true;
              paramViewGroup.a(localu, bool1);
              if (!af.F(af.this).f())
                break label374;
              arrayOfHashMap = af.c(af.this);
              if (localu.u() != af.a(af.this))
                break label363;
              paramInt = 0;
              label316: bool2 = arrayOfHashMap[paramInt].containsKey(Integer.valueOf(localu.q()));
              if (af.x(af.this))
                break label368;
            }
            label363: label368: for (bool1 = bool3; ; bool1 = false)
            {
              paramViewGroup.a(bool2, bool1);
              return paramView;
              bool1 = false;
              break;
              paramInt = 1;
              break label316;
            }
            label374: if (!af.x(af.this));
            for (bool1 = bool5; ; bool1 = false)
            {
              paramViewGroup.a(false, bool1);
              return paramView;
            }
          }
        }
        return paramView;
      }
    }

    public int getViewTypeCount()
    {
      return 1;
    }

    public boolean hasStableIds()
    {
      return true;
    }

    public boolean isEmpty()
    {
      return (this.d.isEmpty()) && (this.a.isEmpty());
    }

    public boolean isEnabled(int paramInt)
    {
      return paramInt != this.d.size() + this.a.size();
    }
  }

  private class b extends org.vidogram.ui.b.e
  {
    private Context b;
    private int c;

    public b(Context paramInt, int arg3)
    {
      this.b = paramInt;
      int i;
      this.c = i;
    }

    public int a()
    {
      int j = 1;
      int k = af.d.e(af.q(af.this)[this.c]).size();
      int i;
      if (!af.d.e(af.q(af.this)[this.c]).isEmpty())
      {
        i = j;
        if (af.d.b(af.q(af.this)[this.c])[0] != 0)
        {
          i = j;
          if (af.d.b(af.q(af.this)[this.c])[1] == 0);
        }
      }
      else
      {
        i = 0;
      }
      return i + k;
    }

    public View a(int paramInt1, int paramInt2, View paramView, ViewGroup paramViewGroup)
    {
      if (paramInt1 < af.d.e(af.q(af.this)[this.c]).size())
      {
        paramViewGroup = (String)af.d.e(af.q(af.this)[this.c]).get(paramInt1);
        paramViewGroup = (ArrayList)af.d.f(af.q(af.this)[this.c]).get(paramViewGroup);
        if (paramInt2 == 0)
        {
          if (paramView != null)
            break label382;
          paramView = new org.vidogram.ui.c.u(this.b);
        }
      }
      label274: label321: label326: label332: label382: 
      while (true)
      {
        paramViewGroup = (org.vidogram.messenger.u)paramViewGroup.get(0);
        ((org.vidogram.ui.c.u)paramView).setText(r.a().g.a(paramViewGroup.a.e * 1000L).toUpperCase());
        return paramView;
        if (paramView == null)
          paramView = new ar(this.b);
        while (true)
        {
          ar localar = (ar)paramView;
          org.vidogram.messenger.u localu = (org.vidogram.messenger.u)paramViewGroup.get(paramInt2 - 1);
          boolean bool2;
          if ((paramInt2 != paramViewGroup.size()) || ((paramInt1 == af.d.e(af.q(af.this)[this.c]).size() - 1) && (af.d.c(af.q(af.this)[this.c]))))
          {
            bool1 = true;
            localar.a(localu, bool1);
            if (!af.y(af.this).f())
              break label332;
            paramViewGroup = af.c(af.this);
            if (localu.u() != af.a(af.this))
              break label321;
            paramInt1 = 0;
            bool2 = paramViewGroup[paramInt1].containsKey(Integer.valueOf(localu.q()));
            if (af.x(af.this))
              break label326;
          }
          for (boolean bool1 = true; ; bool1 = false)
          {
            localar.a(bool2, bool1);
            return paramView;
            bool1 = false;
            break;
            paramInt1 = 1;
            break label274;
          }
          if (!af.x(af.this));
          for (bool1 = true; ; bool1 = false)
          {
            localar.a(false, bool1);
            return paramView;
          }
          if (paramView == null)
            return new z(this.b);
          return paramView;
        }
      }
    }

    public View a(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      if (paramView == null)
        paramView = new org.vidogram.ui.c.u(this.b);
      while (true)
      {
        if (paramInt < af.d.e(af.q(af.this)[this.c]).size())
        {
          paramViewGroup = (String)af.d.e(af.q(af.this)[this.c]).get(paramInt);
          paramViewGroup = (org.vidogram.messenger.u)((ArrayList)af.d.f(af.q(af.this)[this.c]).get(paramViewGroup)).get(0);
          ((org.vidogram.ui.c.u)paramView).setText(r.a().g.a(paramViewGroup.a.e * 1000L).toUpperCase());
        }
        return paramView;
      }
    }

    public boolean a(int paramInt1, int paramInt2)
    {
      return paramInt2 != 0;
    }

    public int b(int paramInt1, int paramInt2)
    {
      if (paramInt1 < af.d.e(af.q(af.this)[this.c]).size())
      {
        if (paramInt2 == 0)
          return 0;
        return 1;
      }
      return 2;
    }

    public int c(int paramInt)
    {
      if (paramInt < af.d.e(af.q(af.this)[this.c]).size())
        return ((ArrayList)af.d.f(af.q(af.this)[this.c]).get(af.d.e(af.q(af.this)[this.c]).get(paramInt))).size() + 1;
      return 1;
    }

    public Object c(int paramInt1, int paramInt2)
    {
      return null;
    }

    public int getViewTypeCount()
    {
      return 3;
    }
  }

  private class c extends org.vidogram.ui.b.e
  {
    private Context b;

    public c(Context arg2)
    {
      Object localObject;
      this.b = localObject;
    }

    public int a()
    {
      int j = 1;
      int k = af.d.e(af.q(af.this)[3]).size();
      int i;
      if (!af.d.e(af.q(af.this)[3]).isEmpty())
      {
        i = j;
        if (af.d.b(af.q(af.this)[3])[0] != 0)
        {
          i = j;
          if (af.d.b(af.q(af.this)[3])[1] == 0);
        }
      }
      else
      {
        i = 0;
      }
      return i + k;
    }

    public View a(int paramInt1, int paramInt2, View paramView, ViewGroup paramViewGroup)
    {
      if (paramInt1 < af.d.e(af.q(af.this)[3]).size())
      {
        paramViewGroup = (String)af.d.e(af.q(af.this)[3]).get(paramInt1);
        paramViewGroup = (ArrayList)af.d.f(af.q(af.this)[3]).get(paramViewGroup);
        if (paramInt2 == 0)
        {
          if (paramView != null)
            break label382;
          paramView = new org.vidogram.ui.c.u(this.b);
        }
      }
      label274: label321: label326: label332: label382: 
      while (true)
      {
        paramViewGroup = (org.vidogram.messenger.u)paramViewGroup.get(0);
        ((org.vidogram.ui.c.u)paramView).setText(r.a().g.a(paramViewGroup.a.e * 1000L).toUpperCase());
        return paramView;
        if (paramView == null)
        {
          paramView = new as(this.b);
          ((as)paramView).setDelegate(new as.a()
          {
            public void a(g.wb paramwb)
            {
              af.a(af.this, paramwb);
            }

            public boolean a()
            {
              return !af.v(af.this).f();
            }
          });
        }
        while (true)
        {
          as localas = (as)paramView;
          org.vidogram.messenger.u localu = (org.vidogram.messenger.u)paramViewGroup.get(paramInt2 - 1);
          boolean bool2;
          if ((paramInt2 != paramViewGroup.size()) || ((paramInt1 == af.d.e(af.q(af.this)[3]).size() - 1) && (af.d.c(af.q(af.this)[3]))))
          {
            bool1 = true;
            localas.a(localu, bool1);
            if (!af.w(af.this).f())
              break label332;
            paramViewGroup = af.c(af.this);
            if (localu.u() != af.a(af.this))
              break label321;
            paramInt1 = 0;
            bool2 = paramViewGroup[paramInt1].containsKey(Integer.valueOf(localu.q()));
            if (af.x(af.this))
              break label326;
          }
          for (boolean bool1 = true; ; bool1 = false)
          {
            localas.a(bool2, bool1);
            return paramView;
            bool1 = false;
            break;
            paramInt1 = 1;
            break label274;
          }
          if (!af.x(af.this));
          for (bool1 = true; ; bool1 = false)
          {
            localas.a(false, bool1);
            return paramView;
          }
          if (paramView == null)
            return new z(this.b);
          return paramView;
        }
      }
    }

    public View a(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      if (paramView == null)
        paramView = new org.vidogram.ui.c.u(this.b);
      while (true)
      {
        if (paramInt < af.d.e(af.q(af.this)[3]).size())
        {
          paramViewGroup = (String)af.d.e(af.q(af.this)[3]).get(paramInt);
          paramViewGroup = (org.vidogram.messenger.u)((ArrayList)af.d.f(af.q(af.this)[3]).get(paramViewGroup)).get(0);
          ((org.vidogram.ui.c.u)paramView).setText(r.a().g.a(paramViewGroup.a.e * 1000L).toUpperCase());
        }
        return paramView;
      }
    }

    public boolean a(int paramInt1, int paramInt2)
    {
      return paramInt2 != 0;
    }

    public int b(int paramInt1, int paramInt2)
    {
      if (paramInt1 < af.d.e(af.q(af.this)[3]).size())
      {
        if (paramInt2 == 0)
          return 0;
        return 1;
      }
      return 2;
    }

    public int c(int paramInt)
    {
      if (paramInt < af.d.e(af.q(af.this)[3]).size())
        return ((ArrayList)af.d.f(af.q(af.this)[3]).get(af.d.e(af.q(af.this)[3]).get(paramInt))).size() + 1;
      return 1;
    }

    public Object c(int paramInt1, int paramInt2)
    {
      return null;
    }

    public int getViewTypeCount()
    {
      return 3;
    }
  }

  private class d
  {
    private ArrayList<org.vidogram.messenger.u> b = new ArrayList();
    private HashMap<Integer, org.vidogram.messenger.u>[] c = { new HashMap(), new HashMap() };
    private ArrayList<String> d = new ArrayList();
    private HashMap<String, ArrayList<org.vidogram.messenger.u>> e = new HashMap();
    private int f;
    private boolean g;
    private boolean[] h = { 0, 1 };
    private int[] i = { 0, 0 };

    private d()
    {
    }

    public boolean a(int paramInt1, int paramInt2)
    {
      org.vidogram.messenger.u localu = (org.vidogram.messenger.u)this.c[paramInt2].get(Integer.valueOf(paramInt1));
      if (localu == null)
        return false;
      ArrayList localArrayList = (ArrayList)this.e.get(localu.i);
      if (localArrayList == null)
        return false;
      localArrayList.remove(localu);
      this.b.remove(localu);
      this.c[paramInt2].remove(Integer.valueOf(localu.q()));
      if (localArrayList.isEmpty())
      {
        this.e.remove(localu.i);
        this.d.remove(localu.i);
      }
      this.f -= 1;
      return true;
    }

    public boolean a(org.vidogram.messenger.u paramu, boolean paramBoolean1, boolean paramBoolean2)
    {
      if (paramu.u() == af.a(af.this));
      for (int j = 0; this.c[j].containsKey(Integer.valueOf(paramu.q())); j = 1)
        return false;
      ArrayList localArrayList2 = (ArrayList)this.e.get(paramu.i);
      ArrayList localArrayList1 = localArrayList2;
      if (localArrayList2 == null)
      {
        localArrayList1 = new ArrayList();
        this.e.put(paramu.i, localArrayList1);
        if (paramBoolean1)
          this.d.add(0, paramu.i);
      }
      else
      {
        if (!paramBoolean1)
          break label198;
        localArrayList1.add(0, paramu);
        this.b.add(0, paramu);
        label130: this.c[j].put(Integer.valueOf(paramu.q()), paramu);
        if (paramBoolean2)
          break label217;
        if (paramu.q() > 0)
          this.i[j] = Math.min(paramu.q(), this.i[j]);
      }
      while (true)
      {
        return true;
        this.d.add(paramu.i);
        break;
        label198: localArrayList1.add(paramu);
        this.b.add(paramu);
        break label130;
        label217: this.i[j] = Math.max(paramu.q(), this.i[j]);
      }
    }

    public void b(int paramInt1, int paramInt2)
    {
      org.vidogram.messenger.u localu = (org.vidogram.messenger.u)this.c[0].get(Integer.valueOf(paramInt1));
      if (localu != null)
      {
        this.c[0].remove(Integer.valueOf(paramInt1));
        this.c[0].put(Integer.valueOf(paramInt2), localu);
        localu.a.b = paramInt2;
      }
    }
  }

  private class e extends org.vidogram.ui.b.e
  {
    private Context b;

    public e(Context arg2)
    {
      Object localObject;
      this.b = localObject;
    }

    public int a()
    {
      int j = 1;
      int k = af.d.e(af.q(af.this)[0]).size();
      int i;
      if (!af.d.e(af.q(af.this)[0]).isEmpty())
      {
        i = j;
        if (af.d.b(af.q(af.this)[0])[0] != 0)
        {
          i = j;
          if (af.d.b(af.q(af.this)[0])[1] == 0);
        }
      }
      else
      {
        i = 0;
      }
      return i + k;
    }

    public View a(int paramInt1, int paramInt2, View paramView, ViewGroup paramViewGroup)
    {
      ArrayList localArrayList;
      if (paramInt1 < af.d.e(af.q(af.this)[0]).size())
      {
        paramViewGroup = (String)af.d.e(af.q(af.this)[0]).get(paramInt1);
        localArrayList = (ArrayList)af.d.f(af.q(af.this)[0]).get(paramViewGroup);
        if (paramInt2 == 0)
        {
          if (paramView != null)
            break label491;
          paramView = new at(this.b);
        }
      }
      label190: label204: label333: label466: label491: 
      while (true)
      {
        paramViewGroup = (org.vidogram.messenger.u)localArrayList.get(0);
        ((at)paramView).setText(r.a().g.a(paramViewGroup.a.e * 1000L).toUpperCase());
        return paramView;
        int i;
        boolean bool1;
        if (paramView == null)
          if (!af.A(af.this).isEmpty())
          {
            paramView = (View)af.A(af.this).get(0);
            af.A(af.this).remove(0);
            paramViewGroup = (au)paramView;
            paramViewGroup.setDelegate(new au.b()
            {
              public void a(au paramau, int paramInt1, org.vidogram.messenger.u paramu, int paramInt2)
              {
                af.a(af.this, paramInt1, paramau, paramu, paramInt2);
              }

              public boolean b(au paramau, int paramInt1, org.vidogram.messenger.u paramu, int paramInt2)
              {
                return af.a(af.this, paramu, paramau, paramInt2);
              }
            });
            paramViewGroup.setItemsCount(af.z(af.this));
            paramInt1 = 0;
            if (paramInt1 >= af.z(af.this))
              break label466;
            i = (paramInt2 - 1) * af.z(af.this) + paramInt1;
            if (i >= localArrayList.size())
              break label454;
            org.vidogram.messenger.u localu = (org.vidogram.messenger.u)localArrayList.get(i);
            if (paramInt2 != 1)
              break label405;
            bool1 = true;
            paramViewGroup.setIsFirst(bool1);
            paramViewGroup.a(paramInt1, af.d.d(af.q(af.this)[0]).indexOf(localu), localu);
            if (!af.B(af.this).f())
              break label423;
            HashMap[] arrayOfHashMap = af.c(af.this);
            if (localu.u() != af.a(af.this))
              break label411;
            i = 0;
            boolean bool2 = arrayOfHashMap[i].containsKey(Integer.valueOf(localu.q()));
            if (af.x(af.this))
              break label417;
            bool1 = true;
            label364: paramViewGroup.a(paramInt1, bool2, bool1);
          }
        while (true)
        {
          paramInt1 += 1;
          break label204;
          paramView = new au(this.b);
          break;
          paramViewGroup = (au)paramView;
          break label190;
          bool1 = false;
          break label260;
          i = 1;
          break label333;
          bool1 = false;
          break label364;
          if (!af.x(af.this));
          for (bool1 = true; ; bool1 = false)
          {
            paramViewGroup.a(paramInt1, false, bool1);
            break;
          }
          paramViewGroup.a(paramInt1, i, null);
        }
        paramViewGroup.requestLayout();
        return paramView;
        if (paramView == null)
          return new z(this.b);
        return paramView;
      }
    }

    public View a(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      if (paramView == null)
      {
        paramView = new at(this.b);
        paramView.setBackgroundColor(-1);
      }
      while (true)
      {
        if (paramInt < af.d.e(af.q(af.this)[0]).size())
        {
          paramViewGroup = (String)af.d.e(af.q(af.this)[0]).get(paramInt);
          paramViewGroup = (org.vidogram.messenger.u)((ArrayList)af.d.f(af.q(af.this)[0]).get(paramViewGroup)).get(0);
          ((at)paramView).setText(r.a().g.a(paramViewGroup.a.e * 1000L).toUpperCase());
        }
        return paramView;
      }
    }

    public boolean a(int paramInt1, int paramInt2)
    {
      return false;
    }

    public int b(int paramInt1, int paramInt2)
    {
      if (paramInt1 < af.d.e(af.q(af.this)[0]).size())
      {
        if (paramInt2 == 0)
          return 0;
        return 1;
      }
      return 2;
    }

    public int c(int paramInt)
    {
      if (paramInt < af.d.e(af.q(af.this)[0]).size())
        return (int)Math.ceil(((ArrayList)af.d.f(af.q(af.this)[0]).get(af.d.e(af.q(af.this)[0]).get(paramInt))).size() / af.z(af.this)) + 1;
      return 1;
    }

    public Object c(int paramInt1, int paramInt2)
    {
      return null;
    }

    public int getViewTypeCount()
    {
      return 3;
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.af
 * JD-Core Version:    0.6.0
 */