package org.vidogram.ui;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.graphics.Outline;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Build.VERSION;
import android.text.TextUtils.TruncateAt;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewOutlineProvider;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.gms.maps.c.a;
import com.google.android.gms.maps.e;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.vidogram.messenger.ApplicationLoader;
import org.vidogram.messenger.ae;
import org.vidogram.messenger.n;
import org.vidogram.messenger.r;
import org.vidogram.messenger.u;
import org.vidogram.messenger.y;
import org.vidogram.messenger.y.b;
import org.vidogram.tgnet.g.ar;
import org.vidogram.tgnet.g.au;
import org.vidogram.tgnet.g.i;
import org.vidogram.tgnet.g.jd;
import org.vidogram.tgnet.g.m;
import org.vidogram.tgnet.g.nt;
import org.vidogram.tgnet.g.oa;
import org.vidogram.tgnet.g.of;
import org.vidogram.tgnet.g.vw;
import org.vidogram.tgnet.g.vx;
import org.vidogram.tgnet.g.y;
import org.vidogram.ui.Components.BackupImageView;
import org.vidogram.ui.Components.aa;
import org.vidogram.ui.a.a.a;
import org.vidogram.ui.a.d.b;
import org.vidogram.ui.a.g;
import org.vidogram.ui.b.b.a;
import org.vidogram.ui.b.l;
import org.vidogram.ui.b.m;

public class ad extends g
  implements y.b
{
  private boolean A;
  private boolean B;
  private boolean C;
  private Location D;
  private Location E;
  private int F;
  private u G;
  private boolean H = false;
  private boolean I = false;
  private a J;
  private int K = org.vidogram.messenger.a.c.x - org.vidogram.ui.a.a.getCurrentActionBarHeight() - org.vidogram.messenger.a.a(66.0F);
  private com.google.android.gms.maps.c i;
  private TextView j;
  private BackupImageView k;
  private TextView l;
  private com.google.android.gms.maps.d m;
  private FrameLayout n;
  private l o;
  private ListView p;
  private ListView q;
  private m r;
  private LinearLayout s;
  private ImageView t;
  private ImageView u;
  private ImageView v;
  private AnimatorSet w;
  private boolean x = true;
  private boolean y;
  private boolean z;

  private void a(int paramInt)
  {
    Object localObject = this.p.getChildAt(0);
    int i3;
    int i2;
    if (localObject != null)
    {
      if (paramInt != 0)
        break label280;
      paramInt = ((View)localObject).getTop();
      i3 = this.K;
      if (paramInt >= 0)
        break label245;
      int i1 = paramInt;
      i1 += i3;
    }
    while (true)
    {
      if ((FrameLayout.LayoutParams)this.n.getLayoutParams() != null)
      {
        if (i2 > 0)
          break label250;
        if (this.m.getVisibility() == 0)
        {
          this.m.setVisibility(4);
          this.n.setVisibility(4);
        }
      }
      while (true)
      {
        this.n.setTranslationY(Math.min(0, paramInt));
        this.m.setTranslationY(Math.max(0, -paramInt / 2));
        localObject = this.t;
        i3 = -paramInt - org.vidogram.messenger.a.a(42.0F) + i2 / 2;
        this.F = i3;
        ((ImageView)localObject).setTranslationY(i3);
        this.u.setTranslationY(-paramInt - org.vidogram.messenger.a.a(7.0F) + i2 / 2);
        localObject = (FrameLayout.LayoutParams)this.m.getLayoutParams();
        if ((localObject != null) && (((FrameLayout.LayoutParams)localObject).height != this.K + org.vidogram.messenger.a.a(10.0F)))
        {
          ((FrameLayout.LayoutParams)localObject).height = (this.K + org.vidogram.messenger.a.a(10.0F));
          if (this.i != null)
            this.i.a(0, 0, 0, org.vidogram.messenger.a.a(10.0F));
          this.m.setLayoutParams((ViewGroup.LayoutParams)localObject);
        }
        return;
        label245: i2 = 0;
        break;
        label250: if (this.m.getVisibility() != 4)
          continue;
        this.m.setVisibility(0);
        this.n.setVisibility(0);
      }
      label280: paramInt = 0;
      i2 = 0;
    }
  }

  private void a(Location paramLocation)
  {
    if (paramLocation == null);
    LatLng localLatLng;
    do
    {
      do
        while (true)
        {
          return;
          this.D = new Location(paramLocation);
          if (this.G == null)
            break;
          if ((this.E == null) || (this.j == null))
            continue;
          float f = paramLocation.distanceTo(this.E);
          if (f < 1000.0F)
          {
            this.j.setText(String.format("%d %s", new Object[] { Integer.valueOf((int)f), r.a("MetersAway", 2131231440) }));
            return;
          }
          this.j.setText(String.format("%.2f %s", new Object[] { Float.valueOf(f / 1000.0F), r.a("KMetersAway", 2131231338) }));
          return;
        }
      while (this.i == null);
      localLatLng = new LatLng(paramLocation.getLatitude(), paramLocation.getLongitude());
      if (this.o == null)
        continue;
      this.o.b(null, this.D);
      this.o.a(this.D);
    }
    while (this.H);
    this.E = new Location(paramLocation);
    if (this.I)
    {
      paramLocation = com.google.android.gms.maps.b.a(localLatLng);
      this.i.b(paramLocation);
      return;
    }
    this.I = true;
    paramLocation = com.google.android.gms.maps.b.a(localLatLng, this.i.b() - 4.0F);
    this.i.a(paramLocation);
  }

  private void b(boolean paramBoolean)
  {
    if (l() == null)
      return;
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(l());
    localBuilder.setTitle(r.a("AppName", 2131230856));
    if (paramBoolean)
      localBuilder.setMessage(r.a("PermissionNoLocationPosition", 2131231660));
    while (true)
    {
      localBuilder.setNegativeButton(r.a("PermissionOpenSettings", 2131231661), new DialogInterface.OnClickListener()
      {
        @TargetApi(9)
        public void onClick(DialogInterface paramDialogInterface, int paramInt)
        {
          if (ad.this.l() == null)
            return;
          try
          {
            paramDialogInterface = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            paramDialogInterface.setData(Uri.parse("package:" + ApplicationLoader.a.getPackageName()));
            ad.this.l().startActivity(paramDialogInterface);
            return;
          }
          catch (Exception paramDialogInterface)
          {
            n.a("tmessages", paramDialogInterface);
          }
        }
      });
      localBuilder.setPositiveButton(r.a("OK", 2131231604), null);
      b(localBuilder.create());
      return;
      localBuilder.setMessage(r.a("PermissionNoLocation", 2131231659));
    }
  }

  private void c(boolean paramBoolean)
  {
    if (this.p != null)
      if (!this.d.getOccupyStatusBar())
        break label40;
    int i2;
    label40: for (int i1 = org.vidogram.messenger.a.a; ; i1 = 0)
    {
      i1 = org.vidogram.ui.a.a.getCurrentActionBarHeight() + i1;
      i2 = this.b.getMeasuredHeight();
      if (i2 != 0)
        break;
      return;
    }
    this.K = (i2 - org.vidogram.messenger.a.a(66.0F) - i1);
    FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)this.p.getLayoutParams();
    localLayoutParams.topMargin = i1;
    this.p.setLayoutParams(localLayoutParams);
    localLayoutParams = (FrameLayout.LayoutParams)this.n.getLayoutParams();
    localLayoutParams.topMargin = i1;
    localLayoutParams.height = this.K;
    this.n.setLayoutParams(localLayoutParams);
    localLayoutParams = (FrameLayout.LayoutParams)this.q.getLayoutParams();
    localLayoutParams.topMargin = i1;
    this.q.setLayoutParams(localLayoutParams);
    this.o.a(this.K);
    localLayoutParams = (FrameLayout.LayoutParams)this.m.getLayoutParams();
    if (localLayoutParams != null)
    {
      localLayoutParams.height = (this.K + org.vidogram.messenger.a.a(10.0F));
      if (this.i != null)
        this.i.a(0, 0, 0, org.vidogram.messenger.a.a(10.0F));
      this.m.setLayoutParams(localLayoutParams);
    }
    this.o.notifyDataSetChanged();
    if (paramBoolean)
    {
      this.p.setSelectionFromTop(0, -(int)(org.vidogram.messenger.a.a(56.0F) * 2.5F + org.vidogram.messenger.a.a(102.0F)));
      a(this.p.getFirstVisiblePosition());
      this.p.post(new Runnable()
      {
        public void run()
        {
          ad.c(ad.this).setSelectionFromTop(0, -(int)(org.vidogram.messenger.a.a(56.0F) * 2.5F + org.vidogram.messenger.a.a(102.0F)));
          ad.a(ad.this, ad.c(ad.this).getFirstVisiblePosition());
        }
      });
      return;
    }
    a(this.p.getFirstVisiblePosition());
  }

  // ERROR //
  private void q()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 142	org/vidogram/ui/ad:i	Lcom/google/android/gms/maps/c;
    //   4: ifnonnull +4 -> 8
    //   7: return
    //   8: aload_0
    //   9: getfield 226	org/vidogram/ui/ad:G	Lorg/vidogram/messenger/u;
    //   12: ifnull +160 -> 172
    //   15: new 277	com/google/android/gms/maps/model/LatLng
    //   18: dup
    //   19: aload_0
    //   20: getfield 228	org/vidogram/ui/ad:E	Landroid/location/Location;
    //   23: invokevirtual 281	android/location/Location:getLatitude	()D
    //   26: aload_0
    //   27: getfield 228	org/vidogram/ui/ad:E	Landroid/location/Location;
    //   30: invokevirtual 284	android/location/Location:getLongitude	()D
    //   33: invokespecial 287	com/google/android/gms/maps/model/LatLng:<init>	(DD)V
    //   36: astore_1
    //   37: aload_0
    //   38: getfield 142	org/vidogram/ui/ad:i	Lcom/google/android/gms/maps/c;
    //   41: new 454	com/google/android/gms/maps/model/MarkerOptions
    //   44: dup
    //   45: invokespecial 455	com/google/android/gms/maps/model/MarkerOptions:<init>	()V
    //   48: aload_1
    //   49: invokevirtual 458	com/google/android/gms/maps/model/MarkerOptions:a	(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/MarkerOptions;
    //   52: ldc_w 459
    //   55: invokestatic 464	com/google/android/gms/maps/model/b:a	(I)Lcom/google/android/gms/maps/model/a;
    //   58: invokevirtual 467	com/google/android/gms/maps/model/MarkerOptions:a	(Lcom/google/android/gms/maps/model/a;)Lcom/google/android/gms/maps/model/MarkerOptions;
    //   61: invokevirtual 470	com/google/android/gms/maps/c:a	(Lcom/google/android/gms/maps/model/MarkerOptions;)Lcom/google/android/gms/maps/model/c;
    //   64: pop
    //   65: aload_1
    //   66: aload_0
    //   67: getfield 142	org/vidogram/ui/ad:i	Lcom/google/android/gms/maps/c;
    //   70: invokevirtual 308	com/google/android/gms/maps/c:b	()F
    //   73: ldc_w 309
    //   76: fsub
    //   77: invokestatic 312	com/google/android/gms/maps/b:a	(Lcom/google/android/gms/maps/model/LatLng;F)Lcom/google/android/gms/maps/a;
    //   80: astore_1
    //   81: aload_0
    //   82: getfield 142	org/vidogram/ui/ad:i	Lcom/google/android/gms/maps/c;
    //   85: aload_1
    //   86: invokevirtual 314	com/google/android/gms/maps/c:a	(Lcom/google/android/gms/maps/a;)V
    //   89: aload_0
    //   90: getfield 142	org/vidogram/ui/ad:i	Lcom/google/android/gms/maps/c;
    //   93: iconst_1
    //   94: invokevirtual 472	com/google/android/gms/maps/c:a	(Z)V
    //   97: aload_0
    //   98: getfield 142	org/vidogram/ui/ad:i	Lcom/google/android/gms/maps/c;
    //   101: invokevirtual 475	com/google/android/gms/maps/c:c	()Lcom/google/android/gms/maps/g;
    //   104: iconst_0
    //   105: invokevirtual 478	com/google/android/gms/maps/g:c	(Z)V
    //   108: aload_0
    //   109: getfield 142	org/vidogram/ui/ad:i	Lcom/google/android/gms/maps/c;
    //   112: invokevirtual 475	com/google/android/gms/maps/c:c	()Lcom/google/android/gms/maps/g;
    //   115: iconst_0
    //   116: invokevirtual 479	com/google/android/gms/maps/g:a	(Z)V
    //   119: aload_0
    //   120: getfield 142	org/vidogram/ui/ad:i	Lcom/google/android/gms/maps/c;
    //   123: invokevirtual 475	com/google/android/gms/maps/c:c	()Lcom/google/android/gms/maps/g;
    //   126: iconst_0
    //   127: invokevirtual 480	com/google/android/gms/maps/g:b	(Z)V
    //   130: aload_0
    //   131: getfield 142	org/vidogram/ui/ad:i	Lcom/google/android/gms/maps/c;
    //   134: new 12	org/vidogram/ui/ad$11
    //   137: dup
    //   138: aload_0
    //   139: invokespecial 481	org/vidogram/ui/ad$11:<init>	(Lorg/vidogram/ui/ad;)V
    //   142: invokevirtual 484	com/google/android/gms/maps/c:a	(Lcom/google/android/gms/maps/c$a;)V
    //   145: aload_0
    //   146: invokespecial 487	org/vidogram/ui/ad:r	()Landroid/location/Location;
    //   149: astore_1
    //   150: aload_0
    //   151: aload_1
    //   152: putfield 224	org/vidogram/ui/ad:D	Landroid/location/Location;
    //   155: aload_0
    //   156: aload_1
    //   157: invokespecial 319	org/vidogram/ui/ad:a	(Landroid/location/Location;)V
    //   160: return
    //   161: astore_2
    //   162: ldc_w 489
    //   165: aload_2
    //   166: invokestatic 494	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   169: goto -104 -> 65
    //   172: aload_0
    //   173: new 220	android/location/Location
    //   176: dup
    //   177: ldc_w 496
    //   180: invokespecial 499	android/location/Location:<init>	(Ljava/lang/String;)V
    //   183: putfield 228	org/vidogram/ui/ad:E	Landroid/location/Location;
    //   186: aload_0
    //   187: getfield 228	org/vidogram/ui/ad:E	Landroid/location/Location;
    //   190: ldc2_w 500
    //   193: invokevirtual 505	android/location/Location:setLatitude	(D)V
    //   196: aload_0
    //   197: getfield 228	org/vidogram/ui/ad:E	Landroid/location/Location;
    //   200: ldc2_w 506
    //   203: invokevirtual 510	android/location/Location:setLongitude	(D)V
    //   206: goto -117 -> 89
    //   209: astore_1
    //   210: ldc_w 489
    //   213: aload_1
    //   214: invokestatic 494	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   217: goto -120 -> 97
    //
    // Exception table:
    //   from	to	target	type
    //   37	65	161	java/lang/Exception
    //   89	97	209	java/lang/Exception
  }

  private Location r()
  {
    LocationManager localLocationManager = (LocationManager)ApplicationLoader.a.getSystemService("location");
    List localList = localLocationManager.getProviders(true);
    int i1 = localList.size();
    Location localLocation = null;
    i1 -= 1;
    while (i1 >= 0)
    {
      localLocation = localLocationManager.getLastKnownLocation((String)localList.get(i1));
      if (localLocation != null)
        return localLocation;
      i1 -= 1;
    }
    return localLocation;
  }

  private void s()
  {
    int i1;
    Object localObject2;
    Object localObject1;
    label100: org.vidogram.ui.Components.b localb;
    String str;
    if ((this.G != null) && (this.k != null))
    {
      i1 = this.G.a.c;
      if (this.G.S())
      {
        if (this.G.a.w.f == 0)
          break label145;
        i1 = -this.G.a.w.f;
      }
      if (i1 <= 0)
        break label162;
      localObject2 = org.vidogram.messenger.v.a().a(Integer.valueOf(i1));
      if (localObject2 == null)
        break label248;
      if (((g.vw)localObject2).j == null)
        break label243;
      localObject1 = ((g.vw)localObject2).j.e;
      localb = new org.vidogram.ui.Components.b((g.vw)localObject2);
      str = ae.c((g.vw)localObject2);
      localObject2 = localObject1;
      localObject1 = localb;
    }
    while (true)
    {
      if (localObject1 != null)
      {
        this.k.a((org.vidogram.tgnet.f)localObject2, null, (Drawable)localObject1);
        this.l.setText(str);
        return;
        label145: i1 = this.G.a.w.d;
        break;
        label162: localObject2 = org.vidogram.messenger.v.a().b(Integer.valueOf(-i1));
        if (localObject2 == null)
          break label231;
        if (((g.i)localObject2).j == null)
          break label226;
      }
      label226: for (localObject1 = ((g.i)localObject2).j.b; ; localObject1 = null)
      {
        localb = new org.vidogram.ui.Components.b((g.i)localObject2);
        str = ((g.i)localObject2).i;
        localObject2 = localObject1;
        localObject1 = localb;
        break;
        this.k.setImageDrawable(null);
        return;
      }
      label231: localObject1 = null;
      str = "";
      localObject2 = null;
      continue;
      label243: localObject1 = null;
      break label100;
      label248: localObject1 = null;
      str = "";
      localObject2 = null;
    }
  }

  public View a(Context paramContext)
  {
    int i1 = 3;
    this.d.setBackButtonImage(2130837794);
    this.d.setAllowOverlayTitle(true);
    if (org.vidogram.messenger.a.c())
      this.d.setOccupyStatusBar(false);
    Object localObject1 = this.d;
    boolean bool;
    label199: label209: int i2;
    label619: float f1;
    label627: float f2;
    if (this.G != null)
    {
      bool = true;
      ((org.vidogram.ui.a.a)localObject1).setAddToContainer(bool);
      this.d.setActionBarMenuOnItemClick(new a.a()
      {
        public void a(int paramInt)
        {
          if (paramInt == -1)
            ad.this.d();
          do
            while (true)
            {
              return;
              if (paramInt == 2)
              {
                if (ad.a(ad.this) == null)
                  continue;
                ad.a(ad.this).a(1);
                return;
              }
              if (paramInt == 3)
              {
                if (ad.a(ad.this) == null)
                  continue;
                ad.a(ad.this).a(2);
                return;
              }
              if (paramInt != 4)
                break;
              if (ad.a(ad.this) == null)
                continue;
              ad.a(ad.this).a(4);
              return;
            }
          while (paramInt != 1);
          try
          {
            double d1 = ad.b(ad.this).a.j.e.c;
            double d2 = ad.b(ad.this).a.j.e.b;
            ad.this.l().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d1 + "," + d2 + "?q=" + d1 + "," + d2)));
            return;
          }
          catch (Exception localException)
          {
            n.a("tmessages", localException);
          }
        }
      });
      localObject1 = this.d.a();
      if (this.G == null)
        break label1345;
      if ((this.G.a.j.f == null) || (this.G.a.j.f.length() <= 0))
        break label1326;
      this.d.setTitle(this.G.a.j.f);
      if ((this.G.a.j.g != null) && (this.G.a.j.g.length() > 0))
        this.d.setSubtitle(this.G.a.j.g);
      ((org.vidogram.ui.a.c)localObject1).b(1, 2130838143);
      localObject1 = ((org.vidogram.ui.a.c)localObject1).b(0, 2130837803);
      ((org.vidogram.ui.a.d)localObject1).a(2, r.a("Map", 2131231408), 0);
      ((org.vidogram.ui.a.d)localObject1).a(3, r.a("Satellite", 2131231757), 0);
      ((org.vidogram.ui.a.d)localObject1).a(4, r.a("Hybrid", 2131231304), 0);
      this.b = new FrameLayout(paramContext)
      {
        private boolean b = true;

        protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
        {
          super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
          if (paramBoolean)
          {
            ad.c(ad.this, this.b);
            this.b = false;
          }
        }
      };
      localObject1 = (FrameLayout)this.b;
      this.v = new ImageView(paramContext);
      this.v.setBackgroundResource(2130837779);
      this.v.setImageResource(2130838002);
      this.v.setScaleType(ImageView.ScaleType.CENTER);
      if (Build.VERSION.SDK_INT >= 21)
      {
        localObject2 = new StateListAnimator();
        localObject3 = ObjectAnimator.ofFloat(this.v, "translationZ", new float[] { org.vidogram.messenger.a.a(2.0F), org.vidogram.messenger.a.a(4.0F) }).setDuration(200L);
        ((StateListAnimator)localObject2).addState(new int[] { 16842919 }, (Animator)localObject3);
        localObject3 = ObjectAnimator.ofFloat(this.v, "translationZ", new float[] { org.vidogram.messenger.a.a(4.0F), org.vidogram.messenger.a.a(2.0F) }).setDuration(200L);
        ((StateListAnimator)localObject2).addState(new int[0], (Animator)localObject3);
        this.v.setStateListAnimator((StateListAnimator)localObject2);
        this.v.setOutlineProvider(new ViewOutlineProvider()
        {
          @SuppressLint({"NewApi"})
          public void getOutline(View paramView, Outline paramOutline)
          {
            paramOutline.setOval(0, 0, org.vidogram.messenger.a.a(56.0F), org.vidogram.messenger.a.a(56.0F));
          }
        });
      }
      if (this.G == null)
        break label1509;
      this.m = new com.google.android.gms.maps.d(paramContext);
      ((FrameLayout)localObject1).setBackgroundDrawable(new aa());
      new Thread(new Runnable(this.m)
      {
        public void run()
        {
          try
          {
            this.a.a(null);
            label8: org.vidogram.messenger.a.a(new Runnable()
            {
              public void run()
              {
                if ((ad.i(ad.this) != null) && (ad.this.l() != null));
                try
                {
                  ad.17.this.a.a(null);
                  e.a(ad.this.l());
                  ad.i(ad.this).a(new com.google.android.gms.maps.f()
                  {
                    public void a(com.google.android.gms.maps.c paramc)
                    {
                      ad.a(ad.this, paramc);
                      ad.a(ad.this).a(0, 0, 0, org.vidogram.messenger.a.a(10.0F));
                      ad.j(ad.this);
                    }
                  });
                  ad.d(ad.this, true);
                  if (ad.k(ad.this))
                    ad.i(ad.this).a();
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
          catch (Exception localException)
          {
            break label8;
          }
        }
      }).start();
      localObject2 = new FrameLayout(paramContext);
      ((FrameLayout)localObject2).setBackgroundResource(2130837955);
      ((FrameLayout)localObject1).addView((View)localObject2, org.vidogram.ui.Components.v.b(-1, 60, 83));
      ((FrameLayout)localObject2).setOnClickListener(new View.OnClickListener()
      {
        public void onClick(View paramView)
        {
          if (ad.h(ad.this) != null)
          {
            paramView = new LatLng(ad.h(ad.this).getLatitude(), ad.h(ad.this).getLongitude());
            if (ad.a(ad.this) != null)
            {
              paramView = com.google.android.gms.maps.b.a(paramView, ad.a(ad.this).b() - 4.0F);
              ad.a(ad.this).b(paramView);
            }
          }
        }
      });
      this.k = new BackupImageView(paramContext);
      this.k.setRoundRadius(org.vidogram.messenger.a.a(20.0F));
      localObject3 = this.k;
      if (!r.a)
        break label1403;
      i2 = 5;
      if (!r.a)
        break label1409;
      f1 = 0.0F;
      if (!r.a)
        break label1416;
      f2 = 12.0F;
      label637: ((FrameLayout)localObject2).addView((View)localObject3, org.vidogram.ui.Components.v.a(40, 40.0F, i2 | 0x30, f1, 12.0F, f2, 0.0F));
      this.l = new TextView(paramContext);
      this.l.setTextSize(1, 16.0F);
      this.l.setTextColor(-14606047);
      this.l.setMaxLines(1);
      this.l.setTypeface(org.vidogram.messenger.a.a("fonts/rmedium.ttf"));
      this.l.setEllipsize(TextUtils.TruncateAt.END);
      this.l.setSingleLine(true);
      localObject3 = this.l;
      if (!r.a)
        break label1421;
      i2 = 5;
      label750: ((TextView)localObject3).setGravity(i2);
      localObject3 = this.l;
      if (!r.a)
        break label1427;
      i2 = 5;
      label772: if (!r.a)
        break label1433;
      f1 = 12.0F;
      label782: if (!r.a)
        break label1440;
      f2 = 72.0F;
      label792: ((FrameLayout)localObject2).addView((View)localObject3, org.vidogram.ui.Components.v.a(-2, -2.0F, i2 | 0x30, f1, 10.0F, f2, 0.0F));
      this.j = new TextView(paramContext);
      this.j.setTextSize(1, 14.0F);
      this.j.setTextColor(-13660983);
      this.j.setMaxLines(1);
      this.j.setEllipsize(TextUtils.TruncateAt.END);
      this.j.setSingleLine(true);
      localObject3 = this.j;
      if (!r.a)
        break label1447;
      i2 = 5;
      label891: ((TextView)localObject3).setGravity(i2);
      localObject3 = this.j;
      if (!r.a)
        break label1453;
      i2 = 5;
      label913: if (!r.a)
        break label1459;
      f1 = 12.0F;
      label923: if (!r.a)
        break label1466;
      f2 = 72.0F;
      label933: ((FrameLayout)localObject2).addView((View)localObject3, org.vidogram.ui.Components.v.a(-2, -2.0F, i2 | 0x30, f1, 33.0F, f2, 0.0F));
      this.E = new Location("network");
      this.E.setLatitude(this.G.a.j.e.c);
      this.E.setLongitude(this.G.a.j.e.b);
      paramContext = new ImageView(paramContext);
      paramContext.setBackgroundResource(2130837778);
      paramContext.setImageResource(2130838003);
      paramContext.setScaleType(ImageView.ScaleType.CENTER);
      if (Build.VERSION.SDK_INT >= 21)
      {
        localObject2 = new StateListAnimator();
        localObject3 = ObjectAnimator.ofFloat(paramContext, "translationZ", new float[] { org.vidogram.messenger.a.a(2.0F), org.vidogram.messenger.a.a(4.0F) }).setDuration(200L);
        ((StateListAnimator)localObject2).addState(new int[] { 16842919 }, (Animator)localObject3);
        localObject3 = ObjectAnimator.ofFloat(paramContext, "translationZ", new float[] { org.vidogram.messenger.a.a(4.0F), org.vidogram.messenger.a.a(2.0F) }).setDuration(200L);
        ((StateListAnimator)localObject2).addState(new int[0], (Animator)localObject3);
        paramContext.setStateListAnimator((StateListAnimator)localObject2);
        paramContext.setOutlineProvider(new ViewOutlineProvider()
        {
          @SuppressLint({"NewApi"})
          public void getOutline(View paramView, Outline paramOutline)
          {
            paramOutline.setOval(0, 0, org.vidogram.messenger.a.a(56.0F), org.vidogram.messenger.a.a(56.0F));
          }
        });
      }
      if (!r.a)
        break label1473;
      i2 = 3;
      label1191: if (!r.a)
        break label1479;
      f1 = 14.0F;
      label1201: if (!r.a)
        break label1484;
      f2 = 0.0F;
      label1209: ((FrameLayout)localObject1).addView(paramContext, org.vidogram.ui.Components.v.a(-2, -2.0F, i2 | 0x50, f1, 0.0F, f2, 28.0F));
      paramContext.setOnClickListener(new View.OnClickListener()
      {
        public void onClick(View paramView)
        {
          if (Build.VERSION.SDK_INT >= 23)
          {
            paramView = ad.this.l();
            if ((paramView != null) && (paramView.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0))
              ad.e(ad.this, true);
          }
          do
            return;
          while (ad.l(ad.this) == null);
          try
          {
            paramView = new Intent("android.intent.action.VIEW", Uri.parse(String.format(Locale.US, "http://maps.google.com/maps?saddr=%f,%f&daddr=%f,%f", new Object[] { Double.valueOf(ad.l(ad.this).getLatitude()), Double.valueOf(ad.l(ad.this).getLongitude()), Double.valueOf(ad.b(ad.this).a.j.e.c), Double.valueOf(ad.b(ad.this).a.j.e.b) })));
            ad.this.l().startActivity(paramView);
            return;
          }
          catch (Exception paramView)
          {
            n.a("tmessages", paramView);
          }
        }
      });
      paramContext = this.v;
      if (!r.a)
        break label1491;
      label1257: if (!r.a)
        break label1497;
      f1 = 14.0F;
      label1267: if (!r.a)
        break label1502;
      f2 = 0.0F;
    }
    while (true)
    {
      ((FrameLayout)localObject1).addView(paramContext, org.vidogram.ui.Components.v.a(-2, -2.0F, i1 | 0x50, f1, 0.0F, f2, 100.0F));
      this.v.setOnClickListener(new View.OnClickListener()
      {
        public void onClick(View paramView)
        {
          if (Build.VERSION.SDK_INT >= 23)
          {
            paramView = ad.this.l();
            if ((paramView != null) && (paramView.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0))
              ad.e(ad.this, true);
          }
          do
            return;
          while ((ad.l(ad.this) == null) || (ad.a(ad.this) == null));
          ad.a(ad.this).b(com.google.android.gms.maps.b.a(new LatLng(ad.l(ad.this).getLatitude(), ad.l(ad.this).getLongitude()), ad.a(ad.this).b() - 4.0F));
        }
      });
      return this.b;
      bool = false;
      break;
      label1326: this.d.setTitle(r.a("ChatLocation", 2131231052));
      break label199;
      label1345: this.d.setTitle(r.a("ShareLocation", 2131231836));
      ((org.vidogram.ui.a.c)localObject1).b(0, 2130837806).d(true).a(new d.b()
      {
        public void a()
        {
          ad.a(ad.this, true);
          ad.c(ad.this).setVisibility(8);
          ad.d(ad.this).setVisibility(8);
          ad.e(ad.this).setVisibility(0);
          ad.e(ad.this).setEmptyView(ad.f(ad.this));
        }

        public void a(EditText paramEditText)
        {
          if (ad.g(ad.this) == null)
            return;
          paramEditText = paramEditText.getText().toString();
          if (paramEditText.length() != 0)
            ad.b(ad.this, true);
          ad.g(ad.this).a(paramEditText, ad.h(ad.this));
        }

        public void c()
        {
          ad.a(ad.this, false);
          ad.b(ad.this, false);
          ad.e(ad.this).setEmptyView(null);
          ad.c(ad.this).setVisibility(0);
          ad.d(ad.this).setVisibility(0);
          ad.e(ad.this).setVisibility(8);
          ad.f(ad.this).setVisibility(8);
          ad.g(ad.this).a(null, null);
        }
      }).getSearchField().setHint(r.a("Search", 2131231766));
      break label209;
      label1403: i2 = 3;
      break label619;
      label1409: f1 = 12.0F;
      break label627;
      label1416: f2 = 0.0F;
      break label637;
      label1421: i2 = 3;
      break label750;
      label1427: i2 = 3;
      break label772;
      label1433: f1 = 72.0F;
      break label782;
      label1440: f2 = 12.0F;
      break label792;
      label1447: i2 = 3;
      break label891;
      label1453: i2 = 3;
      break label913;
      label1459: f1 = 72.0F;
      break label923;
      label1466: f2 = 12.0F;
      break label933;
      label1473: i2 = 5;
      break label1191;
      label1479: f1 = 0.0F;
      break label1201;
      label1484: f2 = 14.0F;
      break label1209;
      label1491: i1 = 5;
      break label1257;
      label1497: f1 = 0.0F;
      break label1267;
      label1502: f2 = 14.0F;
    }
    label1509: this.z = false;
    this.y = false;
    this.n = new FrameLayout(paramContext);
    this.n.setBackgroundDrawable(new aa());
    if (this.o != null)
      this.o.a();
    if (this.r != null)
      this.r.a();
    this.p = new ListView(paramContext);
    Object localObject2 = this.p;
    Object localObject3 = new l(paramContext);
    this.o = ((l)localObject3);
    ((ListView)localObject2).setAdapter((ListAdapter)localObject3);
    this.p.setVerticalScrollBarEnabled(false);
    this.p.setDividerHeight(0);
    this.p.setDivider(null);
    ((FrameLayout)localObject1).addView(this.p, org.vidogram.ui.Components.v.b(-1, -1, 51));
    this.p.setOnScrollListener(new AbsListView.OnScrollListener()
    {
      public void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
      {
        if (paramInt3 == 0)
          return;
        ad.a(ad.this, paramInt1);
      }

      public void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
      {
      }
    });
    this.p.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
      {
        if (paramInt == 1)
        {
          if ((ad.m(ad.this) != null) && (ad.h(ad.this) != null))
          {
            paramAdapterView = new g.oa();
            paramAdapterView.e = new g.jd();
            paramAdapterView.e.c = ad.h(ad.this).getLatitude();
            paramAdapterView.e.b = ad.h(ad.this).getLongitude();
            ad.m(ad.this).a(paramAdapterView);
          }
          ad.this.d();
          return;
        }
        paramAdapterView = ad.n(ad.this).b(paramInt);
        if ((paramAdapterView != null) && (ad.m(ad.this) != null))
          ad.m(ad.this).a(paramAdapterView);
        ad.this.d();
      }
    });
    this.o.a(new b.a()
    {
      public void a(ArrayList<g.of> paramArrayList)
      {
        if ((!ad.o(ad.this)) && (!paramArrayList.isEmpty()))
          ad.f(ad.this, true);
      }
    });
    this.o.a(this.K);
    ((FrameLayout)localObject1).addView(this.n, org.vidogram.ui.Components.v.b(-1, -1, 51));
    this.m = new com.google.android.gms.maps.d(paramContext)
    {
      public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
      {
        if (paramMotionEvent.getAction() == 0)
        {
          if (ad.p(ad.this) != null)
            ad.p(ad.this).cancel();
          ad.a(ad.this, new AnimatorSet());
          ad.p(ad.this).setDuration(200L);
          ad.p(ad.this).playTogether(new Animator[] { ObjectAnimator.ofFloat(ad.q(ad.this), "translationY", new float[] { ad.r(ad.this) + -org.vidogram.messenger.a.a(10.0F) }), ObjectAnimator.ofFloat(ad.s(ad.this), "alpha", new float[] { 1.0F }) });
          ad.p(ad.this).start();
        }
        while (true)
        {
          if (paramMotionEvent.getAction() == 2)
          {
            if (!ad.t(ad.this))
            {
              AnimatorSet localAnimatorSet = new AnimatorSet();
              localAnimatorSet.setDuration(200L);
              localAnimatorSet.play(ObjectAnimator.ofFloat(ad.u(ad.this), "alpha", new float[] { 1.0F }));
              localAnimatorSet.start();
              ad.g(ad.this, true);
            }
            if ((ad.a(ad.this) != null) && (ad.h(ad.this) != null))
            {
              ad.h(ad.this).setLatitude(ad.a(ad.this).a().a.a);
              ad.h(ad.this).setLongitude(ad.a(ad.this).a().a.b);
            }
            ad.n(ad.this).b(ad.h(ad.this));
          }
          return super.onInterceptTouchEvent(paramMotionEvent);
          if (paramMotionEvent.getAction() != 1)
            continue;
          if (ad.p(ad.this) != null)
            ad.p(ad.this).cancel();
          ad.a(ad.this, new AnimatorSet());
          ad.p(ad.this).setDuration(200L);
          ad.p(ad.this).playTogether(new Animator[] { ObjectAnimator.ofFloat(ad.q(ad.this), "translationY", new float[] { ad.r(ad.this) }), ObjectAnimator.ofFloat(ad.s(ad.this), "alpha", new float[] { 0.0F }) });
          ad.p(ad.this).start();
        }
      }
    };
    new Thread(new Runnable(this.m)
    {
      public void run()
      {
        try
        {
          this.a.a(null);
          label8: org.vidogram.messenger.a.a(new Runnable()
          {
            public void run()
            {
              if ((ad.i(ad.this) != null) && (ad.this.l() != null));
              try
              {
                ad.6.this.a.a(null);
                e.a(ad.this.l());
                ad.i(ad.this).a(new com.google.android.gms.maps.f()
                {
                  public void a(com.google.android.gms.maps.c paramc)
                  {
                    ad.a(ad.this, paramc);
                    ad.a(ad.this).a(0, 0, 0, org.vidogram.messenger.a.a(10.0F));
                    ad.j(ad.this);
                  }
                });
                ad.d(ad.this, true);
                if (ad.k(ad.this))
                  ad.i(ad.this).a();
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
        catch (Exception localException)
        {
          break label8;
        }
      }
    }).start();
    localObject2 = new View(paramContext);
    ((View)localObject2).setBackgroundResource(2130837788);
    this.n.addView((View)localObject2, org.vidogram.ui.Components.v.b(-1, 3, 83));
    this.t = new ImageView(paramContext);
    this.t.setImageResource(2130837961);
    this.n.addView(this.t, org.vidogram.ui.Components.v.b(24, 42, 49));
    this.u = new ImageView(paramContext);
    this.u.setAlpha(0.0F);
    this.u.setImageResource(2130838082);
    this.n.addView(this.u, org.vidogram.ui.Components.v.b(14, 14, 49));
    localObject2 = this.n;
    localObject3 = this.v;
    label1911: float f3;
    if (Build.VERSION.SDK_INT >= 21)
    {
      i2 = 56;
      if (Build.VERSION.SDK_INT < 21)
        break label2284;
      f1 = 56.0F;
      label1923: if (!r.a)
        break label2291;
      label1929: if (!r.a)
        break label2297;
      f2 = 14.0F;
      label1939: if (!r.a)
        break label2302;
      f3 = 0.0F;
    }
    while (true)
    {
      ((FrameLayout)localObject2).addView((View)localObject3, org.vidogram.ui.Components.v.a(i2, f1, i1 | 0x50, f2, 0.0F, f3, 14.0F));
      this.v.setOnClickListener(new View.OnClickListener()
      {
        public void onClick(View paramView)
        {
          if (Build.VERSION.SDK_INT >= 23)
          {
            paramView = ad.this.l();
            if ((paramView != null) && (paramView.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0))
              ad.e(ad.this, false);
          }
          do
            return;
          while ((ad.l(ad.this) == null) || (ad.a(ad.this) == null));
          paramView = new AnimatorSet();
          paramView.setDuration(200L);
          paramView.play(ObjectAnimator.ofFloat(ad.u(ad.this), "alpha", new float[] { 0.0F }));
          paramView.start();
          ad.n(ad.this).b(null);
          ad.g(ad.this, false);
          ad.a(ad.this).b(com.google.android.gms.maps.b.a(new LatLng(ad.l(ad.this).getLatitude(), ad.l(ad.this).getLongitude())));
        }
      });
      this.v.setAlpha(0.0F);
      this.s = new LinearLayout(paramContext);
      this.s.setVisibility(8);
      this.s.setOrientation(1);
      ((FrameLayout)localObject1).addView(this.s, org.vidogram.ui.Components.v.a(-1, -1.0F, 51, 0.0F, 100.0F, 0.0F, 0.0F));
      this.s.setOnTouchListener(new View.OnTouchListener()
      {
        public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
        {
          return true;
        }
      });
      localObject2 = new TextView(paramContext);
      ((TextView)localObject2).setTextColor(-8355712);
      ((TextView)localObject2).setTextSize(1, 20.0F);
      ((TextView)localObject2).setGravity(17);
      ((TextView)localObject2).setText(r.a("NoResult", 2131231509));
      this.s.addView((View)localObject2, org.vidogram.ui.Components.v.a(-1, -1, 0.5F));
      localObject2 = new FrameLayout(paramContext);
      this.s.addView((View)localObject2, org.vidogram.ui.Components.v.a(-1, -1, 0.5F));
      this.q = new ListView(paramContext);
      this.q.setVisibility(8);
      this.q.setDividerHeight(0);
      this.q.setDivider(null);
      localObject2 = this.q;
      paramContext = new m(paramContext);
      this.r = paramContext;
      ((ListView)localObject2).setAdapter(paramContext);
      ((FrameLayout)localObject1).addView(this.q, org.vidogram.ui.Components.v.b(-1, -1, 51));
      this.q.setOnScrollListener(new AbsListView.OnScrollListener()
      {
        public void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
        {
        }

        public void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
        {
          if ((paramInt == 1) && (ad.v(ad.this)) && (ad.w(ad.this)))
            org.vidogram.messenger.a.b(ad.this.l().getCurrentFocus());
        }
      });
      this.q.setOnItemClickListener(new AdapterView.OnItemClickListener()
      {
        public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
        {
          paramAdapterView = ad.g(ad.this).a(paramInt);
          if ((paramAdapterView != null) && (ad.m(ad.this) != null))
            ad.m(ad.this).a(paramAdapterView);
          ad.this.d();
        }
      });
      ((FrameLayout)localObject1).addView(this.d);
      break;
      i2 = 60;
      break label1911;
      label2284: f1 = 60.0F;
      break label1923;
      label2291: i1 = 5;
      break label1929;
      label2297: f2 = 0.0F;
      break label1939;
      label2302: f3 = 14.0F;
    }
  }

  public void a(int paramInt, Object[] paramArrayOfObject)
  {
    if (paramInt == y.b)
    {
      paramInt = ((Integer)paramArrayOfObject[0]).intValue();
      if (((paramInt & 0x2) != 0) || ((paramInt & 0x1) != 0))
        s();
    }
    do
    {
      return;
      if (paramInt != y.d)
        continue;
      e();
      return;
    }
    while ((paramInt != y.ab) || (this.i == null));
    try
    {
      this.i.a(true);
      return;
    }
    catch (Exception paramArrayOfObject)
    {
      n.a("tmessages", paramArrayOfObject);
    }
  }

  public void a(u paramu)
  {
    this.G = paramu;
  }

  public void a(a parama)
  {
    this.J = parama;
  }

  public void b(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (paramBoolean1);
    try
    {
      if ((this.m.getParent() instanceof ViewGroup))
        ((ViewGroup)this.m.getParent()).removeView(this.m);
      if (this.n != null)
      {
        this.n.addView(this.m, 0, org.vidogram.ui.Components.v.b(-1, this.K + org.vidogram.messenger.a.a(10.0F), 51));
        a(this.p.getFirstVisiblePosition());
        return;
      }
    }
    catch (Exception localException)
    {
      do
        while (true)
          n.a("tmessages", localException);
      while (this.b == null);
      ((FrameLayout)this.b).addView(this.m, 0, org.vidogram.ui.Components.v.b(-1, -1, 51));
    }
  }

  public boolean f()
  {
    super.f();
    this.g = false;
    y.a().a(this, y.d);
    y.a().a(this, y.ab);
    if (this.G != null)
      y.a().a(this, y.b);
    return true;
  }

  public void g()
  {
    super.g();
    y.a().b(this, y.b);
    y.a().b(this, y.ab);
    y.a().b(this, y.d);
    try
    {
      if (this.m != null)
        this.m.c();
      if (this.o != null)
        this.o.a();
      if (this.r != null)
        this.r.a();
      return;
    }
    catch (Exception localException)
    {
      while (true)
        n.a("tmessages", localException);
    }
  }

  public void i()
  {
    super.i();
    org.vidogram.messenger.a.b(l(), this.e);
    if ((this.m != null) && (this.B));
    try
    {
      this.m.a();
      this.C = true;
      if (this.i == null);
    }
    catch (Throwable localException)
    {
      try
      {
        this.i.a(true);
        s();
        c(true);
        if ((this.x) && (Build.VERSION.SDK_INT >= 23))
        {
          Activity localActivity = l();
          if (localActivity != null)
          {
            this.x = false;
            if (localActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0)
              localActivity.requestPermissions(new String[] { "android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION" }, 2);
          }
        }
        return;
        localThrowable = localThrowable;
        n.a("tmessages", localThrowable);
      }
      catch (Exception localException)
      {
        while (true)
          n.a("tmessages", localException);
      }
    }
  }

  public void j()
  {
    super.j();
    if ((this.m != null) && (this.B));
    try
    {
      this.m.b();
      this.C = false;
      return;
    }
    catch (Exception localException)
    {
      while (true)
        n.a("tmessages", localException);
    }
  }

  public void p()
  {
    super.p();
    if ((this.m != null) && (this.B))
      this.m.d();
  }

  public static abstract interface a
  {
    public abstract void a(g.au paramau);
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.ad
 * JD-Core Version:    0.6.0
 */