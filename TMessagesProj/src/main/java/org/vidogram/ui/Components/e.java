package org.vidogram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.os.SystemClock;
import android.text.Editable;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.Layout.Alignment;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnKeyListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import android.widget.Toast;
import java.io.File;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import org.vidogram.messenger.ApplicationLoader;
import org.vidogram.messenger.MediaController;
import org.vidogram.messenger.ac;
import org.vidogram.messenger.ad;
import org.vidogram.messenger.d.c;
import org.vidogram.messenger.j;
import org.vidogram.messenger.n;
import org.vidogram.messenger.r;
import org.vidogram.messenger.u;
import org.vidogram.messenger.y;
import org.vidogram.messenger.y.b;
import org.vidogram.messenger.z;
import org.vidogram.tgnet.ConnectionsManager;
import org.vidogram.tgnet.g.ap;
import org.vidogram.tgnet.g.aq;
import org.vidogram.tgnet.g.ar;
import org.vidogram.tgnet.g.at;
import org.vidogram.tgnet.g.aw;
import org.vidogram.tgnet.g.bb;
import org.vidogram.tgnet.g.be;
import org.vidogram.tgnet.g.bf;
import org.vidogram.tgnet.g.hs;
import org.vidogram.tgnet.g.hu;
import org.vidogram.tgnet.g.i;
import org.vidogram.tgnet.g.kn;
import org.vidogram.tgnet.g.lr;
import org.vidogram.tgnet.g.lx;
import org.vidogram.tgnet.g.ly;
import org.vidogram.tgnet.g.lz;
import org.vidogram.tgnet.g.ma;
import org.vidogram.tgnet.g.mb;
import org.vidogram.tgnet.g.md;
import org.vidogram.tgnet.g.me;
import org.vidogram.tgnet.g.mg;
import org.vidogram.tgnet.g.nh;
import org.vidogram.tgnet.g.nn;
import org.vidogram.tgnet.g.nw;
import org.vidogram.tgnet.g.q;
import org.vidogram.tgnet.g.r;
import org.vidogram.tgnet.g.ro;
import org.vidogram.tgnet.g.si;
import org.vidogram.tgnet.g.vw;
import org.vidogram.tgnet.g.vy;
import org.vidogram.tgnet.g.wb;
import org.vidogram.ui.a.l;
import org.vidogram.ui.ay;
import org.vidogram.ui.q;
import org.vidogram.ui.v.a;

public class e extends FrameLayout
  implements y.b, bg.a, bl.b
{
  private u A;
  private int B;
  private boolean C;
  private int D = -1;
  private boolean E;
  private boolean F;
  private boolean G = true;
  private boolean H;
  private u I;
  private g.si J;
  private int K;
  private boolean L;
  private PowerManager.WakeLock M;
  private AnimatorSet N;
  private AnimatorSet O;
  private AnimatorSet P;
  private int Q;
  private int R;
  private int S;
  private int T;
  private boolean U;
  private int V;
  private boolean W;
  private b a;
  private AnimatorSet aA;
  private u aB;
  private g.aq aC;
  private boolean aD;
  private Runnable aE = new Runnable()
  {
    public void run()
    {
      if ((e.c(e.this) != null) && (e.d(e.this)) && (!e.e(e.this)) && (!org.vidogram.messenger.a.h) && (!org.vidogram.messenger.a.i))
      {
        e.c(e.this).requestFocus();
        org.vidogram.messenger.a.a(e.c(e.this));
        org.vidogram.messenger.a.b(e.f(e.this));
        org.vidogram.messenger.a.a(e.f(e.this), 100L);
      }
    }
  };
  private long aa;
  private String ab;
  private float ac = -1.0F;
  private float ad = org.vidogram.messenger.a.a(80.0F);
  private boolean ae;
  private boolean af;
  private boolean ag;
  private boolean ah;
  private int ai;
  private boolean aj;
  private Activity ak;
  private q al;
  private long am;
  private boolean an;
  private int ao;
  private u ap;
  private u aq;
  private g.wb ar;
  private boolean as = true;
  private a at;
  private g.hs au;
  private String av;
  private u aw;
  private boolean ax;
  private boolean ay;
  private boolean az;
  private ImageView b;
  private ImageView c;
  private ImageView d;
  private p e;
  private TextView f;
  private ImageView g;
  private FrameLayout h;
  private FrameLayout i;
  private e j;
  private ImageView k;
  private TextView l;
  private LinearLayout m;
  private d n;
  private bg o;
  private LinearLayout p;
  private ImageView q;
  private LinearLayout r;
  private FrameLayout s;
  private View t;
  private d u;
  private ImageView v;
  private c w;
  private m x;
  private Drawable y;
  private Drawable z;

  public e(Activity paramActivity, bg parambg, q paramq, boolean paramBoolean)
  {
    super(paramActivity);
    this.y = paramActivity.getResources().getDrawable(2130837714);
    this.z = paramActivity.getResources().getDrawable(2130837635);
    setFocusable(true);
    setFocusableInTouchMode(true);
    setWillNotDraw(false);
    y.a().a(this, y.aI);
    y.a().a(this, y.aJ);
    y.a().a(this, y.aK);
    y.a().a(this, y.aH);
    y.a().a(this, y.d);
    y.a().a(this, y.aN);
    y.a().a(this, y.at);
    y.a().a(this, y.aP);
    y.a().a(this, y.aF);
    y.a().a(this, y.aE);
    y.a().a(this, y.Q);
    this.ak = paramActivity;
    this.al = paramq;
    this.o = parambg;
    this.o.setDelegate(this);
    this.W = ApplicationLoader.a.getSharedPreferences("mainconfig", 0).getBoolean("send_by_enter", false);
    this.r = new LinearLayout(paramActivity);
    this.r.setOrientation(0);
    addView(this.r, v.a(-1, -2.0F, 51, 0.0F, 2.0F, 0.0F, 0.0F));
    parambg = new FrameLayout(paramActivity);
    this.r.addView(parambg, v.a(0, -2, 1.0F));
    this.d = new ImageView(paramActivity)
    {
      protected void onDraw(Canvas paramCanvas)
      {
        super.onDraw(paramCanvas);
        if (((e.g(e.this) == null) || (e.g(e.this).getVisibility() != 0)) && (!org.vidogram.messenger.d.g.f().isEmpty()) && (e.h(e.this) != null))
        {
          int i = paramCanvas.getWidth() / 2 + org.vidogram.messenger.a.a(4.0F);
          int j = paramCanvas.getHeight() / 2 - org.vidogram.messenger.a.a(13.0F);
          e.h(e.this).setBounds(i, j, e.h(e.this).getIntrinsicWidth() + i, e.h(e.this).getIntrinsicHeight() + j);
          e.h(e.this).draw(paramCanvas);
        }
      }
    };
    this.d.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
    this.d.setPadding(0, org.vidogram.messenger.a.a(1.0F), 0, 0);
    if (Build.VERSION.SDK_INT >= 21)
      this.d.setBackgroundDrawable(l.a(-2697514));
    w();
    parambg.addView(this.d, v.a(48, 48.0F, 83, 3.0F, 0.0F, 0.0F, 0.0F));
    this.d.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramView)
      {
        boolean bool = true;
        if ((!e.this.o()) || (e.i(e.this) != 0))
        {
          e.a(e.this, 1, 0);
          paramView = e.g(e.this);
          if (e.c(e.this).length() > 0);
          while (true)
          {
            paramView.a(bool);
            return;
            bool = false;
          }
        }
        e.b(e.this);
        e.j(e.this);
      }
    });
    this.a = new b(paramActivity);
    q();
    this.a.setImeOptions(268435456);
    this.a.setInputType(this.a.getInputType() | 0x4000 | 0x20000);
    this.a.setSingleLine(false);
    this.a.setMaxLines(4);
    this.a.setTextSize(1, 18.0F);
    this.a.setGravity(80);
    this.a.setPadding(0, org.vidogram.messenger.a.a(11.0F), 0, org.vidogram.messenger.a.a(12.0F));
    this.a.setBackgroundDrawable(null);
    this.a.setTextColor(-16777216);
    this.a.setHintTextColor(-5066062);
    paramq = this.a;
    float f1;
    if (paramBoolean)
      f1 = 50.0F;
    while (true)
    {
      parambg.addView(paramq, v.a(-1, -2.0F, 80, 52.0F, 0.0F, f1, 0.0F));
      this.a.setOnKeyListener(new View.OnKeyListener()
      {
        boolean a = false;

        public boolean onKey(View paramView, int paramInt, KeyEvent paramKeyEvent)
        {
          boolean bool = false;
          if ((paramInt == 4) && (!e.e(e.this)) && (e.this.o()))
          {
            if (paramKeyEvent.getAction() == 1)
            {
              if ((e.i(e.this) == 1) && (e.k(e.this) != null))
                ApplicationLoader.a.getSharedPreferences("mainconfig", 0).edit().putInt("hidekeyboard_" + e.l(e.this), e.k(e.this).q()).commit();
              e.a(e.this, 0, 0);
              e.j(e.this);
            }
            return true;
          }
          if ((paramInt == 66) && ((this.a) || (e.m(e.this))) && (paramKeyEvent.getAction() == 0) && (e.n(e.this) == null))
          {
            e.o(e.this);
            return true;
          }
          if ((paramInt == 113) || (paramInt == 114))
          {
            if (paramKeyEvent.getAction() == 0)
              bool = true;
            this.a = bool;
            return true;
          }
          return false;
        }
      });
      this.a.setOnEditorActionListener(new TextView.OnEditorActionListener()
      {
        boolean a = false;

        public boolean onEditorAction(TextView paramTextView, int paramInt, KeyEvent paramKeyEvent)
        {
          boolean bool = false;
          if (paramInt == 4)
          {
            e.o(e.this);
            return true;
          }
          if ((paramKeyEvent != null) && (paramInt == 0))
          {
            if (((this.a) || (e.m(e.this))) && (paramKeyEvent.getAction() == 0) && (e.n(e.this) == null))
            {
              e.o(e.this);
              return true;
            }
            if ((paramInt == 113) || (paramInt == 114))
            {
              if (paramKeyEvent.getAction() == 0)
                bool = true;
              this.a = bool;
              return true;
            }
          }
          return false;
        }
      });
      this.a.addTextChangedListener(new TextWatcher()
      {
        boolean a = false;

        public void afterTextChanged(Editable paramEditable)
        {
          if (e.p(e.this) != 0);
          do
          {
            return;
            if ((!e.m(e.this)) || (paramEditable.length() <= 0) || (paramEditable.charAt(paramEditable.length() - 1) != '\n') || (e.n(e.this) != null))
              continue;
            e.o(e.this);
          }
          while (!this.a);
          ImageSpan[] arrayOfImageSpan = (ImageSpan[])paramEditable.getSpans(0, paramEditable.length(), ImageSpan.class);
          int i = 0;
          while (i < arrayOfImageSpan.length)
          {
            paramEditable.removeSpan(arrayOfImageSpan[i]);
            i += 1;
          }
          j.a(paramEditable, e.c(e.this).getPaint().getFontMetricsInt(), org.vidogram.messenger.a.a(20.0F), false);
          this.a = false;
        }

        public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
        {
        }

        public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
        {
          if (e.p(e.this) == 1)
            return;
          e.a(e.this, true);
          CharSequence localCharSequence = org.vidogram.messenger.a.a(paramCharSequence.toString());
          e.a locala;
          if ((e.q(e.this) != null) && (!e.r(e.this)))
          {
            if ((paramInt3 > 2) || (paramCharSequence == null) || (paramCharSequence.length() == 0))
              e.b(e.this, true);
            locala = e.q(e.this);
            if ((paramInt2 <= paramInt3 + 1) && (paramInt3 - paramInt2 <= 2))
              break label328;
          }
          label328: for (boolean bool = true; ; bool = false)
          {
            locala.a(paramCharSequence, bool);
            if ((e.p(e.this) != 2) && (paramInt2 != paramInt3) && (paramInt3 - paramInt2 > 1))
              this.a = true;
            if ((e.n(e.this) != null) || (e.s(e.this)) || (localCharSequence.length() == 0) || (e.t(e.this) >= System.currentTimeMillis() - 5000L) || (e.r(e.this)))
              break;
            paramInt1 = ConnectionsManager.a().b();
            paramCharSequence = null;
            if ((int)e.l(e.this) > 0)
              paramCharSequence = org.vidogram.messenger.v.a().a(Integer.valueOf((int)e.l(e.this)));
            if ((paramCharSequence != null) && ((paramCharSequence.d == ad.c()) || ((paramCharSequence.k != null) && (paramCharSequence.k.c < paramInt1) && (!org.vidogram.messenger.v.a().o.containsKey(Integer.valueOf(paramCharSequence.d))))))
              break;
            e.a(e.this, System.currentTimeMillis());
            if (e.q(e.this) == null)
              break;
            e.q(e.this).a();
            return;
          }
        }
      });
      try
      {
        paramq = TextView.class.getDeclaredField("mCursorDrawableRes");
        paramq.setAccessible(true);
        paramq.set(this.a, Integer.valueOf(2130837753));
        label655: if (paramBoolean)
        {
          this.p = new LinearLayout(paramActivity);
          this.p.setOrientation(0);
          this.p.setEnabled(false);
          this.p.setPivotX(org.vidogram.messenger.a.a(48.0F));
          parambg.addView(this.p, v.b(-2, 48, 85));
          this.q = new ImageView(paramActivity);
          this.q.setImageResource(2130837652);
          this.q.setScaleType(ImageView.ScaleType.CENTER);
          this.q.setVisibility(8);
          if (Build.VERSION.SDK_INT >= 21)
            this.q.setBackgroundDrawable(l.a(-2697514));
          this.p.addView(this.q, v.b(48, 48));
          this.q.setOnClickListener(new View.OnClickListener()
          {
            public void onClick(View paramView)
            {
              if (e.u(e.this) != null)
                if ((!e.this.o()) || (e.i(e.this) != 1))
                {
                  e.a(e.this, 1, 1);
                  ApplicationLoader.a.getSharedPreferences("mainconfig", 0).edit().remove("hidekeyboard_" + e.l(e.this)).commit();
                }
              do
              {
                return;
                if ((e.i(e.this) == 1) && (e.k(e.this) != null))
                  ApplicationLoader.a.getSharedPreferences("mainconfig", 0).edit().putInt("hidekeyboard_" + e.l(e.this), e.k(e.this).q()).commit();
                e.b(e.this);
                return;
              }
              while (!e.v(e.this));
              e.this.setFieldText("/");
              e.this.m();
            }
          });
          this.v = new ImageView(paramActivity);
          paramq = this.v;
          if (this.E)
          {
            i1 = 2130838010;
            label843: paramq.setImageResource(i1);
            this.v.setScaleType(ImageView.ScaleType.CENTER);
            paramq = this.v;
            if (!this.F)
              break label2108;
            i1 = 0;
            label874: paramq.setVisibility(i1);
            if (Build.VERSION.SDK_INT >= 21)
              this.v.setBackgroundDrawable(l.a(-2697514));
            this.p.addView(this.v, v.b(48, 48));
            this.v.setOnClickListener(new View.OnClickListener()
            {
              private Toast b;

              public void onClick(View paramView)
              {
                paramView = e.this;
                boolean bool;
                if (!e.w(e.this))
                  bool = true;
                while (true)
                {
                  e.c(paramView, bool);
                  paramView = e.x(e.this);
                  int i;
                  if (e.w(e.this))
                  {
                    i = 2130838010;
                    paramView.setImageResource(i);
                    ApplicationLoader.a.getSharedPreferences("Notifications", 0).edit().putBoolean("silent_" + e.l(e.this), e.w(e.this)).commit();
                    z.c(e.l(e.this));
                  }
                  try
                  {
                    if (this.b != null)
                      this.b.cancel();
                    if (e.w(e.this))
                    {
                      this.b = Toast.makeText(e.y(e.this), r.a("ChannelNotifyMembersInfoOff", 2131231019), 0);
                      this.b.show();
                      e.z(e.this);
                      return;
                      bool = false;
                      continue;
                      i = 2130838011;
                    }
                  }
                  catch (Exception paramView)
                  {
                    while (true)
                    {
                      n.a("tmessages", paramView);
                      continue;
                      this.b = Toast.makeText(e.y(e.this), r.a("ChannelNotifyMembersInfoOn", 2131231020), 0);
                    }
                  }
                }
              }
            });
          }
        }
        else
        {
          this.i = new FrameLayout(paramActivity);
          paramq = this.i;
          if (this.au != null)
            break label2115;
        }
        label2108: label2115: for (int i1 = 8; ; i1 = 0)
        {
          paramq.setVisibility(i1);
          this.i.setBackgroundColor(-1);
          this.i.setFocusable(true);
          this.i.setFocusableInTouchMode(true);
          this.i.setClickable(true);
          parambg.addView(this.i, v.b(-1, 48, 80));
          paramq = new ImageView(paramActivity);
          paramq.setScaleType(ImageView.ScaleType.CENTER);
          paramq.setImageResource(2130837799);
          this.i.addView(paramq, v.a(48, 48.0F));
          paramq.setOnClickListener(new View.OnClickListener()
          {
            public void onClick(View paramView)
            {
              paramView = MediaController.a().j();
              if ((paramView != null) && (paramView == e.a(e.this)))
                MediaController.a().a(true, true);
              if (e.A(e.this) != null)
                new File(e.A(e.this)).delete();
              e.B(e.this);
              e.a(e.this, true);
            }
          });
          paramq = new View(paramActivity);
          paramq.setBackgroundResource(2130838106);
          this.i.addView(paramq, v.a(-1, 32.0F, 19, 48.0F, 0.0F, 0.0F, 0.0F));
          this.j = new e(paramActivity);
          this.i.addView(this.j, v.a(-1, 32.0F, 19, 92.0F, 0.0F, 52.0F, 0.0F));
          this.k = new ImageView(paramActivity);
          this.k.setImageResource(2130838119);
          this.k.setScaleType(ImageView.ScaleType.CENTER);
          this.i.addView(this.k, v.a(48, 48.0F, 83, 48.0F, 0.0F, 0.0F, 0.0F));
          this.k.setOnClickListener(new View.OnClickListener()
          {
            public void onClick(View paramView)
            {
              if (e.C(e.this) == null)
                return;
              if ((MediaController.a().d(e.a(e.this))) && (!MediaController.a().s()))
              {
                MediaController.a().b(e.a(e.this));
                e.D(e.this).setImageResource(2130838119);
                return;
              }
              e.D(e.this).setImageResource(2130838118);
              MediaController.a().a(e.a(e.this));
            }
          });
          this.l = new TextView(paramActivity);
          this.l.setTextColor(-1);
          this.l.setTextSize(1, 13.0F);
          this.l.setText("0:13");
          this.i.addView(this.l, v.a(-2, -2.0F, 21, 0.0F, 0.0F, 13.0F, 0.0F));
          this.h = new FrameLayout(paramActivity);
          this.h.setVisibility(8);
          this.h.setBackgroundColor(-1);
          parambg.addView(this.h, v.b(-1, 48, 80));
          this.m = new LinearLayout(paramActivity);
          this.m.setOrientation(0);
          this.h.addView(this.m, v.a(-2, -2.0F, 17, 30.0F, 0.0F, 0.0F, 0.0F));
          parambg = new ImageView(paramActivity);
          parambg.setImageResource(2130838148);
          this.m.addView(parambg, v.b(-2, -2, 16, 0, 1, 0, 0));
          parambg = new TextView(paramActivity);
          parambg.setText(r.a("SlideToCancel", 2131231852));
          parambg.setTextColor(-6710887);
          parambg.setTextSize(1, 12.0F);
          this.m.addView(parambg, v.b(-2, -2, 16, 6, 0, 0, 0));
          parambg = new LinearLayout(paramActivity);
          parambg.setOrientation(0);
          parambg.setPadding(org.vidogram.messenger.a.a(13.0F), 0, 0, 0);
          parambg.setBackgroundColor(-1);
          this.h.addView(parambg, v.b(-2, -2, 16));
          this.n = new d(paramActivity);
          parambg.addView(this.n, v.b(11, 11, 16, 0, 1, 0, 0));
          this.f = new TextView(paramActivity);
          this.f.setText("00:00");
          this.f.setTextColor(-11711413);
          this.f.setTextSize(1, 16.0F);
          parambg.addView(this.f, v.b(-2, -2, 16, 6, 0, 0, 0));
          this.s = new FrameLayout(paramActivity);
          this.r.addView(this.s, v.d(48, 48, 80));
          this.g = new ImageView(paramActivity);
          this.g.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
          this.g.setImageResource(2130837977);
          this.g.setBackgroundColor(-1);
          this.g.setSoundEffectsEnabled(false);
          this.g.setPadding(0, 0, org.vidogram.messenger.a.a(4.0F), 0);
          this.s.addView(this.g, v.a(48, 48.0F));
          this.g.setOnTouchListener(new View.OnTouchListener()
          {
            public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
            {
              Object localObject;
              if (paramMotionEvent.getAction() == 0)
              {
                if (e.E(e.this) != null)
                {
                  if ((Build.VERSION.SDK_INT >= 23) && (e.y(e.this).checkSelfPermission("android.permission.RECORD_AUDIO") != 0))
                  {
                    e.y(e.this).requestPermissions(new String[] { "android.permission.RECORD_AUDIO" }, 3);
                    return false;
                  }
                  if ((int)e.l(e.this) < 0)
                  {
                    localObject = org.vidogram.messenger.v.a().b(Integer.valueOf(-(int)e.l(e.this)));
                    if ((localObject != null) && (((g.i)localObject).k > org.vidogram.messenger.v.a().H))
                      localObject = "bigchat_upload_audio";
                  }
                  while (!org.vidogram.messenger.v.a((String)localObject, e.E(e.this)))
                  {
                    return false;
                    localObject = "chat_upload_audio";
                    continue;
                    localObject = "pm_upload_audio";
                  }
                }
                e.a(e.this, -1.0F);
                MediaController.a().a(e.l(e.this), e.F(e.this));
                e.G(e.this);
                e.H(e.this).getParent().requestDisallowInterceptTouchEvent(true);
              }
              label648: label680: 
              while (true)
              {
                paramView.onTouchEvent(paramMotionEvent);
                return true;
                if ((paramMotionEvent.getAction() == 1) || (paramMotionEvent.getAction() == 3))
                {
                  e.a(e.this, -1.0F);
                  MediaController.a().d(1);
                  e.d(e.this, false);
                  e.G(e.this);
                  continue;
                }
                if ((paramMotionEvent.getAction() != 2) || (!e.I(e.this)))
                  continue;
                float f1 = paramMotionEvent.getX();
                if (f1 < -e.J(e.this))
                {
                  MediaController.a().d(0);
                  e.d(e.this, false);
                  e.G(e.this);
                }
                float f3 = f1 + e.H(e.this).getX();
                localObject = (FrameLayout.LayoutParams)e.K(e.this).getLayoutParams();
                float f2;
                if (e.L(e.this) != -1.0F)
                {
                  f1 = f3 - e.L(e.this);
                  e.M(e.this).setTranslationX(f1);
                  ((FrameLayout.LayoutParams)localObject).leftMargin = (org.vidogram.messenger.a.a(30.0F) + (int)f1);
                  e.K(e.this).setLayoutParams((ViewGroup.LayoutParams)localObject);
                  f2 = f1 / e.J(e.this) + 1.0F;
                  if (f2 > 1.0F)
                  {
                    f1 = 1.0F;
                    label430: e.K(e.this).setAlpha(f1);
                  }
                }
                else if ((f3 <= e.K(e.this).getX() + e.K(e.this).getWidth() + org.vidogram.messenger.a.a(30.0F)) && (e.L(e.this) == -1.0F))
                {
                  e.a(e.this, f3);
                  e.b(e.this, (e.N(e.this).getMeasuredWidth() - e.K(e.this).getMeasuredWidth() - org.vidogram.messenger.a.a(48.0F)) / 2.0F);
                  if (e.J(e.this) > 0.0F)
                    break label648;
                  e.b(e.this, org.vidogram.messenger.a.a(80.0F));
                }
                while (true)
                {
                  if (((FrameLayout.LayoutParams)localObject).leftMargin <= org.vidogram.messenger.a.a(30.0F))
                    break label680;
                  ((FrameLayout.LayoutParams)localObject).leftMargin = org.vidogram.messenger.a.a(30.0F);
                  e.M(e.this).setTranslationX(0.0F);
                  e.K(e.this).setLayoutParams((ViewGroup.LayoutParams)localObject);
                  e.K(e.this).setAlpha(1.0F);
                  e.a(e.this, -1.0F);
                  break;
                  f1 = f2;
                  if (f2 >= 0.0F)
                    break label430;
                  f1 = 0.0F;
                  break label430;
                  if (e.J(e.this) <= org.vidogram.messenger.a.a(80.0F))
                    continue;
                  e.b(e.this, org.vidogram.messenger.a.a(80.0F));
                }
              }
            }
          });
          this.w = new c(paramActivity);
          this.w.setVisibility(8);
          this.o.addView(this.w, v.a(124, 124.0F, 85, 0.0F, 0.0F, -36.0F, -38.0F));
          this.c = new ImageView(paramActivity);
          this.c.setVisibility(4);
          this.c.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
          parambg = this.c;
          paramq = new m();
          this.x = paramq;
          parambg.setImageDrawable(paramq);
          this.c.setSoundEffectsEnabled(false);
          this.c.setScaleX(0.1F);
          this.c.setScaleY(0.1F);
          this.c.setAlpha(0.0F);
          this.s.addView(this.c, v.a(48, 48.0F));
          this.c.setOnClickListener(new View.OnClickListener()
          {
            public void onClick(View paramView)
            {
              paramView = e.c(e.this).getText().toString();
              int i = paramView.indexOf(' ');
              if ((i == -1) || (i == paramView.length() - 1))
              {
                e.this.setFieldText("");
                return;
              }
              e.this.setFieldText(paramView.substring(0, i + 1));
            }
          });
          this.b = new ImageView(paramActivity);
          this.b.setVisibility(4);
          this.b.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
          this.b.setImageResource(2130837874);
          this.b.setSoundEffectsEnabled(false);
          this.b.setScaleX(0.1F);
          this.b.setScaleY(0.1F);
          this.b.setAlpha(0.0F);
          this.s.addView(this.b, v.a(48, 48.0F));
          this.b.setOnClickListener(new View.OnClickListener()
          {
            public void onClick(View paramView)
            {
              e.o(e.this);
            }
          });
          paramActivity = ApplicationLoader.a.getSharedPreferences("emoji", 0);
          this.S = paramActivity.getInt("kbd_height", org.vidogram.messenger.a.a(200.0F));
          this.T = paramActivity.getInt("kbd_height_land3", org.vidogram.messenger.a.a(200.0F));
          e(false);
          return;
          f1 = 2.0F;
          break;
          i1 = 2130838011;
          break label843;
          i1 = 8;
          break label874;
        }
      }
      catch (Exception paramq)
      {
        break label655;
      }
    }
  }

  private void a(int paramInt)
  {
    if ((this.a == null) || (this.A != null))
      return;
    FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)this.a.getLayoutParams();
    if (paramInt == 1)
      if (((this.q != null) && (this.q.getVisibility() == 0)) || ((this.v != null) && (this.v.getVisibility() == 0)))
        localLayoutParams.rightMargin = org.vidogram.messenger.a.a(98.0F);
    while (true)
    {
      this.a.setLayoutParams(localLayoutParams);
      return;
      localLayoutParams.rightMargin = org.vidogram.messenger.a.a(50.0F);
      continue;
      if (paramInt == 2)
      {
        if (localLayoutParams.rightMargin == org.vidogram.messenger.a.a(2.0F))
          continue;
        if (((this.q != null) && (this.q.getVisibility() == 0)) || ((this.v != null) && (this.v.getVisibility() == 0)))
        {
          localLayoutParams.rightMargin = org.vidogram.messenger.a.a(98.0F);
          continue;
        }
        localLayoutParams.rightMargin = org.vidogram.messenger.a.a(50.0F);
        continue;
      }
      localLayoutParams.rightMargin = org.vidogram.messenger.a.a(2.0F);
    }
  }

  private void a(int paramInt1, int paramInt2)
  {
    Object localObject;
    if (paramInt1 == 1)
    {
      if ((paramInt2 == 0) && (this.e == null))
      {
        if (this.ak == null)
          return;
        v();
      }
      if (paramInt2 == 0)
      {
        this.e.setVisibility(0);
        if ((this.u != null) && (this.u.getVisibility() != 8))
          this.u.setVisibility(8);
        localObject = this.e;
      }
    }
    while (true)
    {
      this.D = paramInt2;
      if (this.S <= 0)
        this.S = ApplicationLoader.a.getSharedPreferences("emoji", 0).getInt("kbd_height", org.vidogram.messenger.a.a(200.0F));
      if (this.T <= 0)
        this.T = ApplicationLoader.a.getSharedPreferences("emoji", 0).getInt("kbd_height_land3", org.vidogram.messenger.a.a(200.0F));
      if (org.vidogram.messenger.a.c.x > org.vidogram.messenger.a.c.y)
      {
        paramInt1 = this.T;
        label168: if (paramInt2 != 1)
          break label425;
        paramInt1 = Math.min(this.u.getKeyboardHeight(), paramInt1);
      }
      label425: 
      while (true)
      {
        if (this.u != null)
          this.u.setPanelHeight(paramInt1);
        FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)((View)localObject).getLayoutParams();
        localLayoutParams.height = paramInt1;
        ((View)localObject).setLayoutParams(localLayoutParams);
        if (!org.vidogram.messenger.a.i)
          org.vidogram.messenger.a.b(this.a);
        if (this.o == null)
          break;
        this.V = paramInt1;
        this.o.requestLayout();
        if (paramInt2 == 0)
          this.d.setImageResource(2130837861);
        while (true)
        {
          u();
          p();
          return;
          if (paramInt2 != 1)
            break label428;
          if ((this.e != null) && (this.e.getVisibility() != 8))
            this.e.setVisibility(8);
          this.u.setVisibility(0);
          localObject = this.u;
          break;
          paramInt1 = this.S;
          break label168;
          if (paramInt2 != 1)
            continue;
          w();
        }
        if (this.d != null)
          w();
        this.D = -1;
        if (this.e != null)
          this.e.setVisibility(8);
        if (this.u != null)
          this.u.setVisibility(8);
        if (this.o != null)
        {
          if (paramInt1 == 0)
            this.V = 0;
          this.o.requestLayout();
          p();
        }
        u();
        return;
      }
      label428: localObject = null;
    }
  }

  private void d(boolean paramBoolean)
  {
    FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)this.r.getLayoutParams();
    int i2 = org.vidogram.messenger.a.a(2.0F);
    if (paramBoolean);
    for (int i1 = this.t.getLayoutParams().height; ; i1 = 0)
    {
      localLayoutParams.topMargin = (i1 + i2);
      this.r.setLayoutParams(localLayoutParams);
      return;
    }
  }

  private void e(boolean paramBoolean)
  {
    if (this.A != null);
    label71: label93: label499: label639: 
    do
    {
      while (true)
      {
        return;
        if (this.G)
          paramBoolean = false;
        if ((org.vidogram.messenger.a.a(this.a.getText()).length() > 0) || (this.af) || (this.au != null))
        {
          int i1;
          int i2;
          if ((b.a(this.a) != null) && (this.b.getVisibility() == 0))
          {
            i1 = 1;
            if ((b.a(this.a) != null) || (this.c.getVisibility() != 0))
              break label639;
            i2 = 1;
            if ((this.g.getVisibility() != 0) && (i1 == 0) && (i2 == 0))
              break label642;
            if (!paramBoolean)
              break label809;
            if (((this.Q == 1) && (b.a(this.a) == null)) || ((this.Q == 3) && (b.a(this.a) != null)))
              continue;
            if (this.N != null)
            {
              this.N.cancel();
              this.N = null;
            }
            if (this.O != null)
            {
              this.O.cancel();
              this.O = null;
            }
            if (this.p != null)
            {
              this.O = new AnimatorSet();
              this.O.playTogether(new Animator[] { ObjectAnimator.ofFloat(this.p, "alpha", new float[] { 0.0F }), ObjectAnimator.ofFloat(this.p, "scaleX", new float[] { 0.0F }) });
              this.O.setDuration(100L);
              this.O.addListener(new org.vidogram.messenger.b()
              {
                public void onAnimationCancel(Animator paramAnimator)
                {
                  if ((e.S(e.this) != null) && (e.S(e.this).equals(paramAnimator)))
                    e.b(e.this, null);
                }

                public void onAnimationEnd(Animator paramAnimator)
                {
                  if ((e.S(e.this) != null) && (e.S(e.this).equals(paramAnimator)))
                    e.T(e.this).setVisibility(8);
                }
              });
              this.O.start();
              a(0);
              if ((this.at != null) && (getVisibility() == 0))
                this.at.b();
            }
            this.N = new AnimatorSet();
            localArrayList = new ArrayList();
            if (this.g.getVisibility() == 0)
            {
              localArrayList.add(ObjectAnimator.ofFloat(this.g, "scaleX", new float[] { 0.1F }));
              localArrayList.add(ObjectAnimator.ofFloat(this.g, "scaleY", new float[] { 0.1F }));
              localArrayList.add(ObjectAnimator.ofFloat(this.g, "alpha", new float[] { 0.0F }));
            }
            if (i1 == 0)
              break label644;
            localArrayList.add(ObjectAnimator.ofFloat(this.b, "scaleX", new float[] { 0.1F }));
            localArrayList.add(ObjectAnimator.ofFloat(this.b, "scaleY", new float[] { 0.1F }));
            localArrayList.add(ObjectAnimator.ofFloat(this.b, "alpha", new float[] { 0.0F }));
            if (b.a(this.a) == null)
              break label724;
            this.Q = 3;
            localArrayList.add(ObjectAnimator.ofFloat(this.c, "scaleX", new float[] { 1.0F }));
            localArrayList.add(ObjectAnimator.ofFloat(this.c, "scaleY", new float[] { 1.0F }));
            localArrayList.add(ObjectAnimator.ofFloat(this.c, "alpha", new float[] { 1.0F }));
            this.c.setVisibility(0);
          }
          while (true)
          {
            this.N.playTogether(localArrayList);
            this.N.setDuration(150L);
            this.N.addListener(new org.vidogram.messenger.b()
            {
              public void onAnimationCancel(Animator paramAnimator)
              {
                if ((e.U(e.this) != null) && (e.U(e.this).equals(paramAnimator)))
                  e.c(e.this, null);
              }

              public void onAnimationEnd(Animator paramAnimator)
              {
                if ((e.U(e.this) != null) && (e.U(e.this).equals(paramAnimator)))
                {
                  if (e.b.a(e.c(e.this)) == null)
                    break label91;
                  e.V(e.this).setVisibility(0);
                  e.W(e.this).setVisibility(8);
                }
                while (true)
                {
                  e.H(e.this).setVisibility(8);
                  e.c(e.this, null);
                  e.b(e.this, 0);
                  return;
                  label91: e.W(e.this).setVisibility(0);
                  e.V(e.this).setVisibility(8);
                }
              }
            });
            this.N.start();
            return;
            i1 = 0;
            break label71;
            i2 = 0;
            break label93;
            break;
            if (i2 == 0)
              break label499;
            localArrayList.add(ObjectAnimator.ofFloat(this.c, "scaleX", new float[] { 0.1F }));
            localArrayList.add(ObjectAnimator.ofFloat(this.c, "scaleY", new float[] { 0.1F }));
            localArrayList.add(ObjectAnimator.ofFloat(this.c, "alpha", new float[] { 0.0F }));
            break label499;
            this.Q = 1;
            localArrayList.add(ObjectAnimator.ofFloat(this.b, "scaleX", new float[] { 1.0F }));
            localArrayList.add(ObjectAnimator.ofFloat(this.b, "scaleY", new float[] { 1.0F }));
            localArrayList.add(ObjectAnimator.ofFloat(this.b, "alpha", new float[] { 1.0F }));
            this.b.setVisibility(0);
          }
          this.g.setScaleX(0.1F);
          this.g.setScaleY(0.1F);
          this.g.setAlpha(0.0F);
          if (b.a(this.a) != null)
          {
            this.b.setScaleX(0.1F);
            this.b.setScaleY(0.1F);
            this.b.setAlpha(0.0F);
            this.c.setScaleX(1.0F);
            this.c.setScaleY(1.0F);
            this.c.setAlpha(1.0F);
            this.c.setVisibility(0);
            this.b.setVisibility(8);
          }
          while (true)
          {
            this.g.setVisibility(8);
            if (this.p == null)
              break;
            this.p.setVisibility(8);
            if ((this.at != null) && (getVisibility() == 0))
              this.at.b();
            a(0);
            return;
            this.c.setScaleX(0.1F);
            this.c.setScaleY(0.1F);
            this.c.setAlpha(0.0F);
            this.b.setScaleX(1.0F);
            this.b.setScaleY(1.0F);
            this.b.setAlpha(1.0F);
            this.b.setVisibility(0);
            this.c.setVisibility(8);
          }
        }
        if ((this.b.getVisibility() != 0) && (this.c.getVisibility() != 0))
          continue;
        if (!paramBoolean)
          break;
        if (this.Q == 2)
          continue;
        if (this.N != null)
        {
          this.N.cancel();
          this.N = null;
        }
        if (this.O != null)
        {
          this.O.cancel();
          this.O = null;
        }
        if (this.p != null)
        {
          this.p.setVisibility(0);
          this.O = new AnimatorSet();
          this.O.playTogether(new Animator[] { ObjectAnimator.ofFloat(this.p, "alpha", new float[] { 1.0F }), ObjectAnimator.ofFloat(this.p, "scaleX", new float[] { 1.0F }) });
          this.O.setDuration(100L);
          this.O.start();
          a(1);
          if (getVisibility() == 0)
            this.at.c();
        }
        this.g.setVisibility(0);
        this.N = new AnimatorSet();
        this.Q = 2;
        ArrayList localArrayList = new ArrayList();
        localArrayList.add(ObjectAnimator.ofFloat(this.g, "scaleX", new float[] { 1.0F }));
        localArrayList.add(ObjectAnimator.ofFloat(this.g, "scaleY", new float[] { 1.0F }));
        localArrayList.add(ObjectAnimator.ofFloat(this.g, "alpha", new float[] { 1.0F }));
        if (this.c.getVisibility() == 0)
        {
          localArrayList.add(ObjectAnimator.ofFloat(this.c, "scaleX", new float[] { 0.1F }));
          localArrayList.add(ObjectAnimator.ofFloat(this.c, "scaleY", new float[] { 0.1F }));
          localArrayList.add(ObjectAnimator.ofFloat(this.c, "alpha", new float[] { 0.0F }));
        }
        while (true)
        {
          this.N.playTogether(localArrayList);
          this.N.setDuration(150L);
          this.N.addListener(new org.vidogram.messenger.b()
          {
            public void onAnimationCancel(Animator paramAnimator)
            {
              if ((e.U(e.this) != null) && (e.U(e.this).equals(paramAnimator)))
                e.c(e.this, null);
            }

            public void onAnimationEnd(Animator paramAnimator)
            {
              if ((e.U(e.this) != null) && (e.U(e.this).equals(paramAnimator)))
              {
                e.W(e.this).setVisibility(8);
                e.V(e.this).setVisibility(8);
                e.H(e.this).setVisibility(0);
                e.c(e.this, null);
                e.b(e.this, 0);
              }
            }
          });
          this.N.start();
          return;
          localArrayList.add(ObjectAnimator.ofFloat(this.b, "scaleX", new float[] { 0.1F }));
          localArrayList.add(ObjectAnimator.ofFloat(this.b, "scaleY", new float[] { 0.1F }));
          localArrayList.add(ObjectAnimator.ofFloat(this.b, "alpha", new float[] { 0.0F }));
        }
      }
      this.b.setScaleX(0.1F);
      this.b.setScaleY(0.1F);
      this.b.setAlpha(0.0F);
      this.c.setScaleX(0.1F);
      this.c.setScaleY(0.1F);
      this.c.setAlpha(0.0F);
      this.g.setScaleX(1.0F);
      this.g.setScaleY(1.0F);
      this.g.setAlpha(1.0F);
      this.c.setVisibility(8);
      this.b.setVisibility(8);
      this.g.setVisibility(0);
    }
    while (this.p == null);
    label642: label644: label724: if (getVisibility() == 0)
      this.at.c();
    label809: this.p.setVisibility(0);
    a(1);
  }

  private void p()
  {
    int i2 = this.o.getHeight();
    int i1 = i2;
    if (!this.U)
      i1 = i2 - this.V;
    if (this.at != null)
      this.at.a(i1);
    if (this.t != null)
    {
      if (i1 >= org.vidogram.messenger.a.a(72.0F) + org.vidogram.ui.a.a.getCurrentActionBarHeight())
        break label114;
      if (this.az)
      {
        this.az = false;
        if (this.ay)
        {
          this.t.setVisibility(8);
          d(false);
          this.t.setTranslationY(this.t.getLayoutParams().height);
        }
      }
    }
    label114: 
    do
    {
      do
        return;
      while (this.az);
      this.az = true;
    }
    while (!this.ay);
    this.t.setVisibility(0);
    d(true);
    this.t.setTranslationY(0.0F);
  }

  private void q()
  {
    int i2 = 0;
    int i1 = i2;
    Object localObject;
    if ((int)this.am < 0)
    {
      localObject = org.vidogram.messenger.v.a().b(Integer.valueOf(-(int)this.am));
      i1 = i2;
      if (org.vidogram.messenger.e.d((g.i)localObject))
      {
        i1 = i2;
        if (!((g.i)localObject).r)
          i1 = 1;
      }
    }
    if (i1 != 0)
    {
      if (this.A != null)
      {
        b localb = this.a;
        if (this.C);
        for (localObject = r.a("Caption", 2131230949); ; localObject = r.a("TypeMessage", 2131231907))
        {
          localb.setHint((CharSequence)localObject);
          return;
        }
      }
      if (this.E)
      {
        this.a.setHint(r.a("ChannelSilentBroadcast", 2131231033));
        return;
      }
      this.a.setHint(r.a("ChannelBroadcast", 2131230972));
      return;
    }
    this.a.setHint(r.a("TypeMessage", 2131231907));
  }

  private void r()
  {
    this.av = null;
    this.au = null;
    this.aw = null;
    AnimatorSet localAnimatorSet = new AnimatorSet();
    localAnimatorSet.playTogether(new Animator[] { ObjectAnimator.ofFloat(this.i, "alpha", new float[] { 0.0F }) });
    localAnimatorSet.setDuration(200L);
    localAnimatorSet.addListener(new org.vidogram.messenger.b()
    {
      public void onAnimationEnd(Animator paramAnimator)
      {
        e.P(e.this).setVisibility(8);
      }
    });
    localAnimatorSet.start();
  }

  private void s()
  {
    Object localObject;
    if (this.al != null)
      if ((int)this.am < 0)
      {
        localObject = org.vidogram.messenger.v.a().b(Integer.valueOf(-(int)this.am));
        if ((localObject != null) && (((g.i)localObject).k > org.vidogram.messenger.v.a().H))
        {
          localObject = "bigchat_message";
          if (org.vidogram.messenger.v.a((String)localObject, this.al))
            break label78;
        }
      }
    label78: label213: 
    do
    {
      do
      {
        return;
        localObject = "chat_message";
        break;
        localObject = "pm_message";
        break;
        if (this.au != null)
        {
          localObject = MediaController.a().j();
          if ((localObject != null) && (localObject == this.aw))
            MediaController.a().a(true, true);
          ac.a().a(this.au, null, this.av, this.am, this.ap, null, null);
          if (this.at != null)
            this.at.a(null);
          r();
          e(true);
          return;
        }
        localObject = this.a.getText();
        if (!a((CharSequence)localObject))
          break label213;
        this.a.setText("");
        this.aa = 0L;
      }
      while (this.at == null);
      this.at.a((CharSequence)localObject);
      return;
    }
    while ((!this.af) || (this.at == null));
    this.at.a(null);
  }

  private void t()
  {
    if (this.ae)
      if (this.R != 1);
    while (true)
    {
      return;
      this.R = 1;
      try
      {
        if (this.M == null)
        {
          this.M = ((PowerManager)ApplicationLoader.a.getSystemService("power")).newWakeLock(536870918, "audio record lock");
          this.M.acquire();
        }
        org.vidogram.messenger.a.a(this.ak);
        this.h.setVisibility(0);
        this.w.setVisibility(0);
        this.w.a(0.0D);
        this.f.setText("00:00");
        this.n.a();
        this.ab = null;
        FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)this.m.getLayoutParams();
        localLayoutParams.leftMargin = org.vidogram.messenger.a.a(30.0F);
        this.m.setLayoutParams(localLayoutParams);
        this.m.setAlpha(1.0F);
        this.h.setX(org.vidogram.messenger.a.c.x);
        this.w.setTranslationX(0.0F);
        if (this.P != null)
          this.P.cancel();
        this.P = new AnimatorSet();
        this.P.playTogether(new Animator[] { ObjectAnimator.ofFloat(this.h, "translationX", new float[] { 0.0F }), ObjectAnimator.ofFloat(this.w, "scale", new float[] { 1.0F }), ObjectAnimator.ofFloat(this.g, "alpha", new float[] { 0.0F }) });
        this.P.setDuration(300L);
        this.P.addListener(new org.vidogram.messenger.b()
        {
          public void onAnimationEnd(Animator paramAnimator)
          {
            if ((e.X(e.this) != null) && (e.X(e.this).equals(paramAnimator)))
            {
              e.N(e.this).setX(0.0F);
              e.d(e.this, null);
            }
          }
        });
        this.P.setInterpolator(new DecelerateInterpolator());
        this.P.start();
        return;
      }
      catch (Exception localException1)
      {
        while (true)
          n.a("tmessages", localException1);
      }
      if (this.M != null);
      try
      {
        this.M.release();
        this.M = null;
        org.vidogram.messenger.a.b(this.ak);
        if (this.R == 0)
          continue;
        this.R = 0;
        if (this.P != null)
          this.P.cancel();
        this.P = new AnimatorSet();
        this.P.playTogether(new Animator[] { ObjectAnimator.ofFloat(this.h, "translationX", new float[] { org.vidogram.messenger.a.c.x }), ObjectAnimator.ofFloat(this.w, "scale", new float[] { 0.0F }), ObjectAnimator.ofFloat(this.g, "alpha", new float[] { 1.0F }) });
        this.P.setDuration(300L);
        this.P.addListener(new org.vidogram.messenger.b()
        {
          public void onAnimationEnd(Animator paramAnimator)
          {
            if ((e.X(e.this) != null) && (e.X(e.this).equals(paramAnimator)))
            {
              paramAnimator = (FrameLayout.LayoutParams)e.K(e.this).getLayoutParams();
              paramAnimator.leftMargin = org.vidogram.messenger.a.a(30.0F);
              e.K(e.this).setLayoutParams(paramAnimator);
              e.K(e.this).setAlpha(1.0F);
              e.N(e.this).setVisibility(8);
              e.M(e.this).setVisibility(8);
              e.d(e.this, null);
            }
          }
        });
        this.P.setInterpolator(new AccelerateInterpolator());
        this.P.start();
        return;
      }
      catch (Exception localException2)
      {
        while (true)
          n.a("tmessages", localException2);
      }
    }
  }

  private void u()
  {
    if (this.q == null)
      return;
    LinearLayout localLinearLayout;
    float f1;
    if ((this.L) || (this.J != null))
    {
      if (this.q.getVisibility() != 0)
        this.q.setVisibility(0);
      if (this.J != null)
        if ((o()) && (this.D == 1))
        {
          this.q.setImageResource(2130837861);
          a(2);
          localLinearLayout = this.p;
          if (((this.q != null) && (this.q.getVisibility() != 8)) || ((this.v != null) && (this.v.getVisibility() != 8)))
            break label172;
          f1 = 48.0F;
        }
    }
    while (true)
    {
      localLinearLayout.setPivotX(org.vidogram.messenger.a.a(f1));
      return;
      this.q.setImageResource(2130837652);
      break;
      this.q.setImageResource(2130837651);
      break;
      this.q.setVisibility(8);
      break;
      label172: f1 = 96.0F;
    }
  }

  private void v()
  {
    if (this.e != null)
      return;
    this.e = new p(this.ag, this.ah, this.ak);
    this.e.setVisibility(8);
    this.e.setListener(new p.h()
    {
      public void a(String paramString)
      {
        int j = e.c(e.this).getSelectionEnd();
        int i = j;
        if (j < 0)
          i = 0;
        try
        {
          e.c(e.this, 2);
          paramString = j.a(paramString, e.c(e.this).getPaint().getFontMetricsInt(), org.vidogram.messenger.a.a(20.0F), false);
          e.c(e.this).setText(e.c(e.this).getText().insert(i, paramString));
          i += paramString.length();
          e.c(e.this).setSelection(i, i);
          return;
        }
        catch (Exception paramString)
        {
          n.a("tmessages", paramString);
          return;
        }
        finally
        {
          e.c(e.this, 0);
        }
        throw paramString;
      }

      public void a(g.bf parambf)
      {
        if ((e.E(e.this) == null) || (e.y(e.this) == null))
          return;
        g.lr locallr = new g.lr();
        locallr.c = parambf.b.c;
        locallr.b = parambf.b.b;
        e.E(e.this).b(new bl(e.y(e.this), e.E(e.this), locallr, null, e.this));
      }

      public void a(g.q paramq)
      {
        e.this.a(paramq);
        org.vidogram.messenger.d.g.a(0, paramq, (int)(System.currentTimeMillis() / 1000L));
        if ((int)e.l(e.this) == 0)
          org.vidogram.messenger.v.a().a(paramq);
      }

      public void a(boolean paramBoolean)
      {
        if (!org.vidogram.messenger.a.h)
        {
          if (!paramBoolean)
            break label56;
          if (e.c(e.this).length() == 0)
          {
            e.c(e.this).setText("@gif ");
            e.c(e.this).setSelection(e.c(e.this).length());
          }
        }
        label56: 
        do
          return;
        while (!e.c(e.this).getText().toString().equals("@gif "));
        e.c(e.this).setText("");
      }

      public boolean a()
      {
        if (e.c(e.this).length() == 0)
          return false;
        e.c(e.this).dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
      }

      public void b()
      {
        if (e.E(e.this) != null)
          e.E(e.this).a(new ay(0));
      }

      public void b(g.bf parambf)
      {
        org.vidogram.messenger.d.g.a(e.y(e.this), parambf.b, 2, e.E(e.this), false);
      }

      public void b(g.q paramq)
      {
        ac.a().a(paramq, e.l(e.this), e.F(e.this));
        org.vidogram.messenger.d.g.a(paramq, (int)(System.currentTimeMillis() / 1000L));
        if ((int)e.l(e.this) == 0)
          org.vidogram.messenger.v.a().a(paramq);
        if (e.q(e.this) != null)
          e.q(e.this).a(null);
      }

      public void b(boolean paramBoolean)
      {
        e.q(e.this).b(paramBoolean);
      }

      public void c()
      {
        if ((e.E(e.this) == null) || (e.y(e.this) == null))
          return;
        AlertDialog.Builder localBuilder = new AlertDialog.Builder(e.y(e.this));
        localBuilder.setTitle(r.a("AppName", 2131230856));
        localBuilder.setMessage(r.a("ClearRecentEmoji", 2131231070));
        localBuilder.setPositiveButton(r.a("ClearButton", 2131231065).toUpperCase(), new DialogInterface.OnClickListener()
        {
          public void onClick(DialogInterface paramDialogInterface, int paramInt)
          {
            e.g(e.this).a();
          }
        });
        localBuilder.setNegativeButton(r.a("Cancel", 2131230943), null);
        e.E(e.this).b(localBuilder.create());
      }

      public void c(g.bf parambf)
      {
        org.vidogram.messenger.d.g.a(e.y(e.this), parambf.b, 0, e.E(e.this), false);
      }
    });
    this.e.setVisibility(8);
    this.o.addView(this.e);
  }

  private void w()
  {
    int i1;
    if (this.e == null)
    {
      i1 = getContext().getSharedPreferences("emoji", 0).getInt("selected_page", 0);
      if ((i1 != 0) && ((this.ag) || (this.ah)))
        break label68;
      this.d.setImageResource(2130837862);
    }
    label68: 
    do
    {
      return;
      i1 = this.e.getCurrentPage();
      break;
      if (i1 != 1)
        continue;
      this.d.setImageResource(2130837863);
      return;
    }
    while (i1 != 2);
    this.d.setImageResource(2130837860);
  }

  private void x()
  {
    if ((!org.vidogram.messenger.a.h) && (this.a.getText().toString().equals("@gif ")))
      this.a.setText("");
  }

  private void y()
  {
    int i1;
    if ((org.vidogram.messenger.a.h) || (this.G))
    {
      i1 = 0;
      a(i1, 0);
      this.a.requestFocus();
      org.vidogram.messenger.a.a(this.a);
      if (!this.G)
        break label54;
      this.H = true;
    }
    label54: 
    do
    {
      return;
      i1 = 2;
      break;
    }
    while ((org.vidogram.messenger.a.h) || (this.U) || (org.vidogram.messenger.a.i));
    this.aD = true;
    org.vidogram.messenger.a.b(this.aE);
    org.vidogram.messenger.a.a(this.aE, 100L);
  }

  public void a()
  {
    v();
    org.vidogram.messenger.d.g.a(0, true, true);
    this.e.b();
  }

  public void a(int paramInt1, int paramInt2, CharSequence paramCharSequence)
  {
    try
    {
      SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder(this.a.getText());
      localSpannableStringBuilder.replace(paramInt1, paramInt1 + paramInt2, paramCharSequence);
      this.a.setText(localSpannableStringBuilder);
      this.a.setSelection(paramCharSequence.length() + paramInt1);
      return;
    }
    catch (Exception paramCharSequence)
    {
      n.a("tmessages", paramCharSequence);
    }
  }

  public void a(int paramInt, boolean paramBoolean)
  {
    this.K = paramInt;
    if (this.L != paramBoolean)
    {
      this.L = paramBoolean;
      u();
    }
  }

  public void a(int paramInt, Object[] paramArrayOfObject)
  {
    int i1 = 0;
    if (paramInt == y.at)
    {
      if (this.e != null)
        this.e.d();
      if (this.u != null)
        this.u.a();
    }
    while (true)
    {
      return;
      Object localObject;
      if (paramInt == y.aH)
      {
        long l1 = ((Long)paramArrayOfObject[0]).longValue();
        localObject = Long.valueOf(l1 / 1000L);
        paramInt = (int)(l1 % 1000L) / 10;
        String str = String.format("%02d:%02d.%02d", new Object[] { Long.valueOf(((Long)localObject).longValue() / 60L), Long.valueOf(((Long)localObject).longValue() % 60L), Integer.valueOf(paramInt) });
        if ((this.ab == null) || (!this.ab.equals(str)))
        {
          if (((Long)localObject).longValue() % 5L == 0L)
            org.vidogram.messenger.v.a().a(this.am, 1, 0);
          if (this.f != null)
            this.f.setText(str);
        }
        if (this.w == null)
          continue;
        this.w.a(((Double)paramArrayOfObject[1]).doubleValue());
        return;
      }
      if (paramInt == y.d)
      {
        if ((this.a == null) || (!this.a.isFocused()))
          continue;
        org.vidogram.messenger.a.b(this.a);
        return;
      }
      if ((paramInt == y.aJ) || (paramInt == y.aK))
      {
        if (!this.ae)
          continue;
        org.vidogram.messenger.v.a().a(this.am, 2, 0);
        this.ae = false;
        t();
        return;
      }
      if (paramInt == y.aI)
      {
        if (this.ae)
          continue;
        this.ae = true;
        t();
        return;
      }
      if (paramInt != y.aN)
        break label698;
      this.au = ((g.hs)paramArrayOfObject[0]);
      this.av = ((String)paramArrayOfObject[1]);
      if (this.au != null)
      {
        if (this.i == null)
          continue;
        paramArrayOfObject = new g.mg();
        paramArrayOfObject.n = true;
        paramArrayOfObject.b = 0;
        paramArrayOfObject.d = new g.ro();
        localObject = paramArrayOfObject.d;
        paramInt = ad.c();
        paramArrayOfObject.c = paramInt;
        ((g.aw)localObject).c = paramInt;
        paramArrayOfObject.e = (int)(System.currentTimeMillis() / 1000L);
        paramArrayOfObject.i = "-1";
        paramArrayOfObject.A = this.av;
        paramArrayOfObject.j = new g.nw();
        paramArrayOfObject.j.k = this.au;
        paramArrayOfObject.k |= 768;
        this.aw = new u(paramArrayOfObject, null, false);
        this.i.setAlpha(1.0F);
        this.i.setVisibility(0);
        paramInt = 0;
        if (paramInt >= this.au.o.size())
          break label904;
        paramArrayOfObject = (g.r)this.au.o.get(paramInt);
        if (!(paramArrayOfObject instanceof g.hu))
          break;
      }
    }
    label904: for (paramInt = paramArrayOfObject.d; ; paramInt = 0)
    {
      i1 = 0;
      while (true)
      {
        if (i1 < this.au.o.size())
        {
          paramArrayOfObject = (g.r)this.au.o.get(i1);
          if ((paramArrayOfObject instanceof g.hu))
          {
            if ((paramArrayOfObject.n == null) || (paramArrayOfObject.n.length == 0))
              paramArrayOfObject.n = MediaController.a().getWaveform(this.av);
            this.j.a(paramArrayOfObject.n);
          }
        }
        else
        {
          this.l.setText(String.format("%d:%02d", new Object[] { Integer.valueOf(paramInt / 60), Integer.valueOf(paramInt % 60) }));
          n();
          c(false);
          e(false);
          return;
          paramInt += 1;
          break;
        }
        i1 += 1;
      }
      if (this.at == null)
        break;
      this.at.a(null);
      return;
      label698: if (paramInt == y.aP)
      {
        if (this.ak == null)
          break;
        boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
        paramArrayOfObject = this.ak;
        if (bool);
        for (paramInt = i1; ; paramInt = -2147483648)
        {
          paramArrayOfObject.setVolumeControlStream(paramInt);
          return;
        }
      }
      if (paramInt == y.aF)
      {
        if ((this.aw == null) || (MediaController.a().d(this.aw)))
          break;
        this.k.setImageResource(2130838119);
        this.j.a(0.0F);
        return;
      }
      if (paramInt == y.aE)
      {
        paramArrayOfObject = (Integer)paramArrayOfObject[0];
        if ((this.aw == null) || (!MediaController.a().d(this.aw)))
          break;
        paramArrayOfObject = MediaController.a().j();
        this.aw.k = paramArrayOfObject.k;
        this.aw.l = paramArrayOfObject.l;
        if (this.j.a())
          break;
        this.j.a(this.aw.k);
        return;
      }
      if ((paramInt != y.Q) || (this.d == null))
        break;
      this.d.invalidate();
      return;
    }
  }

  public void a(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    if ((paramInt == 2) && (this.aC != null))
    {
      if ((paramArrayOfInt.length > 0) && (paramArrayOfInt[0] == 0))
        ac.a().a(this.aB, this.aC);
      this.aC = null;
      this.aB = null;
    }
  }

  public void a(View paramView)
  {
    if (this.p == null)
      return;
    if (paramView.getParent() != null)
      ((ViewGroup)paramView.getParent()).removeView(paramView);
    if (Build.VERSION.SDK_INT >= 21)
      paramView.setBackgroundDrawable(l.a(-2697514));
    this.p.addView(paramView, v.b(48, 48));
  }

  public void a(View paramView, int paramInt)
  {
    if (paramView == null)
      return;
    this.t = paramView;
    this.t.setVisibility(8);
    this.t.setTranslationY(paramInt);
    addView(this.t, 0, v.a(-1, paramInt, 51, 0.0F, 2.0F, 0.0F, 0.0F));
    this.ay = false;
  }

  public void a(u paramu, String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    Object localObject2 = null;
    if ((paramString == null) || (getVisibility() != 0))
      return;
    if (paramBoolean1)
    {
      String str = this.a.getText().toString();
      Object localObject1 = localObject2;
      if (paramu != null)
      {
        localObject1 = localObject2;
        if ((int)this.am < 0)
          localObject1 = org.vidogram.messenger.v.a().a(Integer.valueOf(paramu.a.c));
      }
      if (((this.K != 1) || (paramBoolean2)) && (localObject1 != null) && (((g.vw)localObject1).r) && (!paramString.contains("@")));
      for (paramu = String.format(Locale.US, "%s@%s", new Object[] { paramString, ((g.vw)localObject1).g }) + " " + str.replaceFirst("^/[a-zA-Z@\\d_]{1,255}(\\s|$)", ""); ; paramu = paramString + " " + str.replaceFirst("^/[a-zA-Z@\\d_]{1,255}(\\s|$)", ""))
      {
        this.an = true;
        this.a.setText(paramu);
        this.a.setSelection(this.a.getText().length());
        this.an = false;
        if (this.at != null)
          this.at.a(this.a.getText(), true);
        if ((this.U) || (this.D != -1))
          break;
        m();
        return;
      }
    }
    if ((paramu != null) && ((int)this.am < 0));
    for (paramu = org.vidogram.messenger.v.a().a(Integer.valueOf(paramu.a.c)); ((this.K != 1) || (paramBoolean2)) && (paramu != null) && (paramu.r) && (!paramString.contains("@")); paramu = null)
    {
      ac.a().a(String.format(Locale.US, "%s@%s", new Object[] { paramString, paramu.g }), this.am, null, null, false, null, null, null);
      return;
    }
    ac.a().a(paramString, this.am, null, null, false, null, null, null);
  }

  public void a(u paramu, boolean paramBoolean)
  {
    if ((this.au != null) || (this.A == paramu))
      return;
    if (this.B != 0)
    {
      ConnectionsManager.a().a(this.B, true);
      this.B = 0;
    }
    this.A = paramu;
    this.C = paramBoolean;
    label217: Object localObject;
    int i2;
    int i1;
    label306: g.at localat;
    if (this.A != null)
    {
      paramu = new InputFilter[1];
      if (paramBoolean)
      {
        paramu[0] = new InputFilter.LengthFilter(200);
        if (this.A.d != null)
          setFieldText(j.a(new SpannableStringBuilder(this.A.d.toString()), this.a.getPaint().getFontMetricsInt(), org.vidogram.messenger.a.a(20.0F), false));
        while (true)
        {
          this.a.setFilters(paramu);
          m();
          paramu = (FrameLayout.LayoutParams)this.a.getLayoutParams();
          paramu.rightMargin = org.vidogram.messenger.a.a(4.0F);
          this.a.setLayoutParams(paramu);
          this.b.setVisibility(8);
          this.c.setVisibility(8);
          this.g.setVisibility(8);
          this.p.setVisibility(8);
          this.s.setVisibility(8);
          q();
          return;
          setFieldText("");
        }
      }
      paramu[0] = new InputFilter.LengthFilter(4096);
      if (this.A.b != null)
      {
        localObject = this.A.b;
        ArrayList localArrayList = this.A.a.p;
        localObject = new SpannableStringBuilder(new CharSequence[] { localObject }[0]);
        if (localArrayList != null)
        {
          i2 = 0;
          i1 = 0;
          if (i2 < localArrayList.size())
          {
            localat = (g.at)localArrayList.get(i2);
            if ((localat instanceof g.kn))
            {
              if ((localat.b + localat.c + i1 < ((SpannableStringBuilder)localObject).length()) && (((SpannableStringBuilder)localObject).charAt(localat.b + localat.c + i1) == ' '))
                localat.c += 1;
              URLSpanUserMention localURLSpanUserMention = new URLSpanUserMention("" + ((g.kn)localat).g.b);
              int i3 = localat.b;
              int i4 = localat.b;
              ((SpannableStringBuilder)localObject).setSpan(localURLSpanUserMention, i3 + i1, localat.c + i4 + i1, 33);
            }
          }
        }
      }
    }
    while (true)
    {
      i2 += 1;
      break label306;
      if ((localat instanceof g.nh))
      {
        ((SpannableStringBuilder)localObject).insert(localat.b + localat.c + i1, "`");
        ((SpannableStringBuilder)localObject).insert(localat.b + i1, "`");
        i1 += 2;
        continue;
      }
      if ((localat instanceof g.nn))
      {
        ((SpannableStringBuilder)localObject).insert(localat.b + localat.c + i1, "```");
        ((SpannableStringBuilder)localObject).insert(localat.b + i1, "```");
        i1 += 6;
        continue;
        setFieldText(j.a((CharSequence)localObject, this.a.getPaint().getFontMetricsInt(), org.vidogram.messenger.a.a(20.0F), false));
        break;
        setFieldText("");
        break;
        this.a.setFilters(new InputFilter[0]);
        this.at.a(false);
        this.g.setVisibility(0);
        this.p.setVisibility(0);
        this.s.setVisibility(0);
        this.p.setScaleX(1.0F);
        this.p.setAlpha(1.0F);
        this.b.setScaleX(0.1F);
        this.b.setScaleY(0.1F);
        this.b.setAlpha(0.0F);
        this.c.setScaleX(0.1F);
        this.c.setScaleY(0.1F);
        this.c.setAlpha(0.0F);
        this.g.setScaleX(1.0F);
        this.g.setScaleY(1.0F);
        this.g.setAlpha(1.0F);
        this.b.setVisibility(8);
        this.c.setVisibility(8);
        this.a.setText("");
        if (getVisibility() == 0)
          this.at.c();
        a(1);
        break label217;
      }
    }
  }

  public void a(g.aq paramaq, u paramu1, u paramu2)
  {
    if ((paramaq == null) || (paramu2 == null));
    while (true)
    {
      return;
      if ((paramaq instanceof g.lx))
      {
        ac.a().a(paramaq.b, this.am, paramu1, null, false, null, null, null);
        return;
      }
      if ((paramaq instanceof g.me))
      {
        this.al.a(paramaq.g, true);
        return;
      }
      if ((paramaq instanceof g.mb))
      {
        this.al.a(paramu2);
        return;
      }
      if ((paramaq instanceof g.ma))
      {
        paramu1 = new AlertDialog.Builder(this.ak);
        paramu1.setTitle(r.a("ShareYouLocationTitle", 2131231841));
        paramu1.setMessage(r.a("ShareYouLocationInfo", 2131231839));
        paramu1.setPositiveButton(r.a("OK", 2131231604), new DialogInterface.OnClickListener(paramu2, paramaq)
        {
          public void onClick(DialogInterface paramDialogInterface, int paramInt)
          {
            if ((Build.VERSION.SDK_INT >= 23) && (e.y(e.this).checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0))
            {
              e.y(e.this).requestPermissions(new String[] { "android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION" }, 2);
              e.a(e.this, this.a);
              e.a(e.this, this.b);
              return;
            }
            ac.a().a(this.a, this.b);
          }
        });
        paramu1.setNegativeButton(r.a("Cancel", 2131230943), null);
        this.al.b(paramu1.create());
        return;
      }
      if (((paramaq instanceof g.ly)) || ((paramaq instanceof g.lz)))
      {
        ac.a().a(paramu2, paramaq, this.al);
        return;
      }
      if ((!(paramaq instanceof g.md)) || (this.al.a((g.md)paramaq)))
        continue;
      if (!paramaq.d)
        break;
      int i1 = paramu2.a.c;
      if (paramu2.a.x != 0)
        i1 = paramu2.a.x;
      paramu1 = org.vidogram.messenger.v.a().a(Integer.valueOf(i1));
      if (paramu1 == null)
        continue;
      setFieldText("@" + paramu1.g + " " + paramaq.e);
      return;
    }
    paramu1 = new Bundle();
    paramu1.putBoolean("onlySelect", true);
    paramu1.putInt("dialogsType", 1);
    paramu1 = new org.vidogram.ui.v(paramu1);
    paramu1.a(new v.a(paramu2, paramaq)
    {
      public void a(org.vidogram.ui.v paramv, long paramLong, boolean paramBoolean)
      {
        int i = this.a.a.c;
        if (this.a.a.x != 0)
          i = this.a.a.x;
        Object localObject = org.vidogram.messenger.v.a().a(Integer.valueOf(i));
        if (localObject == null)
          paramv.d();
        while (true)
        {
          return;
          org.vidogram.messenger.d.b.a(paramLong, "@" + ((g.vw)localObject).g + " " + this.b.e, null, null, true);
          if (paramLong == e.l(e.this))
            break label230;
          i = (int)paramLong;
          if (i == 0)
            break;
          localObject = new Bundle();
          if (i > 0)
            ((Bundle)localObject).putInt("user_id", i);
          while (true)
          {
            if (!org.vidogram.messenger.v.a((Bundle)localObject, paramv))
              break label218;
            localObject = new q((Bundle)localObject);
            if (!e.E(e.this).a((org.vidogram.ui.a.g)localObject, true))
              break label220;
            if (org.vidogram.messenger.a.c())
              break;
            e.E(e.this).e();
            return;
            if (i >= 0)
              continue;
            ((Bundle)localObject).putInt("chat_id", -i);
          }
          label218: continue;
          label220: paramv.d();
          return;
        }
        paramv.d();
        return;
        label230: paramv.d();
      }
    });
    this.al.a(paramu1);
  }

  public void a(g.q paramq)
  {
    ac.a().a(paramq, this.am, this.ap);
    if (this.at != null)
      this.at.a(null);
  }

  public void a(g.wb paramwb, boolean paramBoolean)
  {
    this.ar = paramwb;
    this.as = paramBoolean;
  }

  public void a(boolean paramBoolean)
  {
    if (this.x == null)
      return;
    if (paramBoolean)
    {
      this.x.a();
      return;
    }
    this.x.b();
  }

  public void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    this.af = paramBoolean1;
    e(paramBoolean2);
  }

  public boolean a(CharSequence paramCharSequence)
  {
    paramCharSequence = org.vidogram.messenger.a.a(paramCharSequence);
    if (paramCharSequence.length() != 0)
    {
      int i2 = (int)Math.ceil(paramCharSequence.length() / 4096.0F);
      int i1 = 0;
      while (i1 < i2)
      {
        CharSequence[] arrayOfCharSequence = new CharSequence[1];
        arrayOfCharSequence[0] = paramCharSequence.subSequence(i1 * 4096, Math.min((i1 + 1) * 4096, paramCharSequence.length()));
        ArrayList localArrayList = c.a(arrayOfCharSequence);
        ac.a().a(arrayOfCharSequence[0].toString(), this.am, this.ap, this.ar, this.as, localArrayList, null, null);
        i1 += 1;
      }
      return true;
    }
    return false;
  }

  public void b(int paramInt, boolean paramBoolean)
  {
    int i1;
    if ((paramInt > org.vidogram.messenger.a.a(50.0F)) && (this.U) && (!org.vidogram.messenger.a.i))
    {
      if (paramBoolean)
      {
        this.T = paramInt;
        ApplicationLoader.a.getSharedPreferences("emoji", 0).edit().putInt("kbd_height_land3", this.T).commit();
      }
    }
    else if (o())
    {
      if (!paramBoolean)
        break label285;
      i1 = this.T;
      label81: if ((this.D != 1) || (this.u.b()))
        break label444;
      i1 = Math.min(this.u.getKeyboardHeight(), i1);
    }
    label285: label444: 
    while (true)
    {
      Object localObject;
      if (this.D == 0)
        localObject = this.e;
      while (true)
      {
        if (this.u != null)
          this.u.setPanelHeight(i1);
        FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)((View)localObject).getLayoutParams();
        if ((localLayoutParams.width != org.vidogram.messenger.a.c.x) || (localLayoutParams.height != i1))
        {
          localLayoutParams.width = org.vidogram.messenger.a.c.x;
          localLayoutParams.height = i1;
          ((View)localObject).setLayoutParams(localLayoutParams);
          if (this.o != null)
          {
            this.V = localLayoutParams.height;
            this.o.requestLayout();
            p();
          }
        }
        if ((this.ai == paramInt) && (this.aj == paramBoolean))
        {
          p();
          return;
          this.S = paramInt;
          ApplicationLoader.a.getSharedPreferences("emoji", 0).edit().putInt("kbd_height", this.S).commit();
          break;
          i1 = this.S;
          break label81;
          if (this.D == 1)
          {
            localObject = this.u;
            continue;
          }
        }
        else
        {
          this.ai = paramInt;
          this.aj = paramBoolean;
          boolean bool = this.U;
          if (paramInt > 0);
          for (paramBoolean = true; ; paramBoolean = false)
          {
            this.U = paramBoolean;
            if ((this.U) && (o()))
              a(0, this.D);
            if ((this.V != 0) && (!this.U) && (this.U != bool) && (!o()))
            {
              this.V = 0;
              this.o.requestLayout();
            }
            if ((this.U) && (this.aD))
            {
              this.aD = false;
              org.vidogram.messenger.a.b(this.aE);
            }
            p();
            return;
          }
        }
        localObject = null;
      }
    }
  }

  public void b(u paramu, boolean paramBoolean)
  {
    Object localObject2 = null;
    if ((this.ap != null) && (this.ap == this.I) && (this.ap != paramu))
      this.aq = paramu;
    do
      return;
    while ((this.q == null) || ((this.I != null) && (this.I == paramu)) || ((this.I == null) && (paramu == null)));
    if (this.u == null)
    {
      this.u = new d(this.ak);
      this.u.setVisibility(8);
      this.u.setDelegate(new d.a()
      {
        public void a(g.aq paramaq)
        {
          u localu1;
          u localu2;
          if (e.F(e.this) != null)
          {
            localu1 = e.F(e.this);
            e locale = e.this;
            if (e.F(e.this) == null)
              break label133;
            localu2 = e.F(e.this);
            label42: locale.a(paramaq, localu1, localu2);
            if (e.F(e.this) == null)
              break label144;
            e.b(e.this);
            e.this.b(e.Y(e.this), false);
          }
          while (true)
          {
            if (e.q(e.this) != null)
              e.q(e.this).a(null);
            return;
            if ((int)e.l(e.this) < 0)
            {
              localu1 = e.k(e.this);
              break;
            }
            localu1 = null;
            break;
            label133: localu2 = e.k(e.this);
            break label42;
            label144: if (!e.k(e.this).a.r.e)
              continue;
            e.b(e.this);
            ApplicationLoader.a.getSharedPreferences("mainconfig", 0).edit().putInt("answered_" + e.l(e.this), e.k(e.this).q()).commit();
          }
        }
      });
      this.o.addView(this.u);
    }
    this.I = paramu;
    Object localObject1;
    label159: int i1;
    if ((paramu != null) && ((paramu.a.r instanceof g.si)))
    {
      localObject1 = (g.si)paramu.a.r;
      this.J = ((g.si)localObject1);
      localObject1 = this.u;
      if (org.vidogram.messenger.a.c.x <= org.vidogram.messenger.a.c.y)
        break label383;
      i1 = this.T;
      label191: ((d)localObject1).setPanelHeight(i1);
      d locald = this.u;
      localObject1 = localObject2;
      if (this.J != null)
        localObject1 = this.J;
      locald.setButtons((g.si)localObject1);
      if (this.J == null)
        break label396;
      localObject1 = ApplicationLoader.a.getSharedPreferences("mainconfig", 0);
      if (((SharedPreferences)localObject1).getInt("hidekeyboard_" + this.am, 0) != paramu.q())
        break label391;
      i1 = 1;
      label286: if ((this.I != this.ap) && (this.J.e) && (((SharedPreferences)localObject1).getInt("answered_" + this.am, 0) == paramu.q()))
        break label394;
      if ((i1 == 0) && (this.a.length() == 0) && (!o()))
        a(1, 1);
    }
    while (true)
    {
      u();
      return;
      localObject1 = null;
      break label159;
      label383: i1 = this.S;
      break label191;
      label391: i1 = 0;
      break label286;
      label394: break;
      label396: if ((!o()) || (this.D != 1))
        continue;
      if (paramBoolean)
      {
        y();
        continue;
      }
      a(0, 1);
    }
  }

  public void b(g.q paramq)
  {
    v();
    this.e.a(paramq);
  }

  public void b(boolean paramBoolean)
  {
    if ((this.t == null) || (!this.ax));
    do
    {
      return;
      this.ax = false;
      this.ay = false;
    }
    while (!this.az);
    if (this.aA != null)
    {
      this.aA.cancel();
      this.aA = null;
    }
    if (paramBoolean)
    {
      this.aA = new AnimatorSet();
      this.aA.playTogether(new Animator[] { ObjectAnimator.ofFloat(this.t, "translationY", new float[] { this.t.getLayoutParams().height }) });
      this.aA.addListener(new org.vidogram.messenger.b()
      {
        public void onAnimationCancel(Animator paramAnimator)
        {
          if ((e.O(e.this) != null) && (e.O(e.this).equals(paramAnimator)))
            e.a(e.this, null);
        }

        public void onAnimationEnd(Animator paramAnimator)
        {
          if ((e.O(e.this) != null) && (e.O(e.this).equals(paramAnimator)))
          {
            e.R(e.this).setVisibility(8);
            e.e(e.this, false);
            e.a(e.this, null);
          }
        }
      });
      this.aA.setDuration(200L);
      this.aA.start();
      return;
    }
    this.t.setVisibility(8);
    this.t.setTranslationY(this.t.getLayoutParams().height);
  }

  public void b(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (((this.ag != paramBoolean1) || (this.ah != paramBoolean2)) && (this.e != null))
    {
      if (this.e.getVisibility() == 0)
        c(false);
      this.o.removeView(this.e);
      this.e = null;
    }
    this.ag = paramBoolean1;
    this.ah = paramBoolean2;
    w();
  }

  public boolean b()
  {
    return (this.t != null) && (this.t.getVisibility() == 0);
  }

  public boolean b(View paramView)
  {
    return (paramView == this.u) || (paramView == this.e);
  }

  public void c()
  {
    y.a().b(this, y.aI);
    y.a().b(this, y.aJ);
    y.a().b(this, y.aK);
    y.a().b(this, y.aH);
    y.a().b(this, y.d);
    y.a().b(this, y.aN);
    y.a().b(this, y.at);
    y.a().b(this, y.aP);
    y.a().b(this, y.aF);
    y.a().b(this, y.aE);
    y.a().b(this, y.Q);
    if (this.e != null)
      this.e.e();
    if (this.M != null);
    try
    {
      this.M.release();
      this.M = null;
      if (this.o != null)
        this.o.setDelegate(null);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        n.a("tmessages", localException);
    }
  }

  public void c(g.q paramq)
  {
    if (this.e == null)
      return;
    this.e.b(paramq);
  }

  public void c(boolean paramBoolean)
  {
    if (o())
    {
      if ((this.D == 1) && (paramBoolean) && (this.I != null))
        ApplicationLoader.a.getSharedPreferences("mainconfig", 0).edit().putInt("hidekeyboard_" + this.am, this.I.q()).commit();
      a(0, 0);
      x();
    }
  }

  public void c(boolean paramBoolean1, boolean paramBoolean2)
  {
    if ((this.t == null) || (this.ax) || (getVisibility() != 0));
    while (true)
    {
      return;
      this.ay = true;
      this.ax = true;
      if (!this.az)
        continue;
      this.t.setVisibility(0);
      if (this.aA != null)
      {
        this.aA.cancel();
        this.aA = null;
      }
      d(true);
      if (!paramBoolean1)
        break;
      if ((this.U) || (o()))
      {
        this.aA = new AnimatorSet();
        this.aA.playTogether(new Animator[] { ObjectAnimator.ofFloat(this.t, "translationY", new float[] { 0.0F }) });
        this.aA.addListener(new org.vidogram.messenger.b(paramBoolean2)
        {
          public void onAnimationCancel(Animator paramAnimator)
          {
            if ((e.O(e.this) != null) && (e.O(e.this).equals(paramAnimator)))
              e.a(e.this, null);
          }

          public void onAnimationEnd(Animator paramAnimator)
          {
            if ((e.O(e.this) != null) && (e.O(e.this).equals(paramAnimator)))
            {
              if ((e.P(e.this).getVisibility() != 0) && ((!e.Q(e.this)) || (this.a)))
                e.this.m();
              e.a(e.this, null);
            }
          }
        });
        this.aA.setDuration(200L);
        this.aA.start();
        return;
      }
      this.t.setTranslationY(0.0F);
      if ((this.i.getVisibility() == 0) || ((this.af) && (!paramBoolean2)))
        continue;
      m();
      return;
    }
    this.t.setTranslationY(0.0F);
  }

  public boolean c(View paramView)
  {
    return paramView == this.w;
  }

  public void d()
  {
    this.G = true;
    n();
  }

  protected boolean drawChild(Canvas paramCanvas, View paramView, long paramLong)
  {
    if (paramView == this.t)
    {
      paramCanvas.save();
      paramCanvas.clipRect(0, 0, getMeasuredWidth(), paramView.getLayoutParams().height + org.vidogram.messenger.a.a(2.0F));
    }
    boolean bool = super.drawChild(paramCanvas, paramView, paramLong);
    if (paramView == this.t)
      paramCanvas.restore();
    return bool;
  }

  public void e()
  {
    this.G = false;
    if (this.H)
    {
      this.H = false;
      this.a.requestFocus();
      org.vidogram.messenger.a.a(this.a);
      if ((!org.vidogram.messenger.a.h) && (!this.U) && (!org.vidogram.messenger.a.i))
      {
        this.aD = true;
        org.vidogram.messenger.a.b(this.aE);
        org.vidogram.messenger.a.a(this.aE, 100L);
      }
    }
  }

  public boolean f()
  {
    return this.as;
  }

  public void g()
  {
    if (this.A != null)
    {
      this.at.a(true);
      CharSequence[] arrayOfCharSequence = new CharSequence[1];
      arrayOfCharSequence[0] = this.a.getText();
      ArrayList localArrayList = c.a(arrayOfCharSequence);
      this.B = ac.a().a(this.A, arrayOfCharSequence[0].toString(), this.as, this.al, localArrayList, new Runnable()
      {
        public void run()
        {
          e.a(e.this, 0);
          e.this.a(null, false);
        }
      });
    }
  }

  public int getCursorPosition()
  {
    if (this.a == null)
      return 0;
    return this.a.getSelectionStart();
  }

  public u getEditingMessageObject()
  {
    return this.A;
  }

  public int getEmojiPadding()
  {
    return this.V;
  }

  public CharSequence getFieldText()
  {
    if ((this.a != null) && (this.a.length() > 0))
      return this.a.getText();
    return null;
  }

  public void h()
  {
    if (this.a != null);
    try
    {
      this.a.requestFocus();
      return;
    }
    catch (Exception localException)
    {
      n.a("tmessages", localException);
    }
  }

  public boolean hasOverlappingRendering()
  {
    return false;
  }

  public boolean i()
  {
    return (this.a != null) && (this.a.length() > 0);
  }

  public boolean j()
  {
    return this.A != null;
  }

  public boolean k()
  {
    return this.C;
  }

  public boolean l()
  {
    return this.aw != null;
  }

  public void m()
  {
    org.vidogram.messenger.a.a(this.a);
  }

  public void n()
  {
    org.vidogram.messenger.a.b(this.a);
  }

  public boolean o()
  {
    return ((this.e != null) && (this.e.getVisibility() == 0)) || ((this.u != null) && (this.u.getVisibility() == 0));
  }

  protected void onDraw(Canvas paramCanvas)
  {
    if ((this.t != null) && (this.t.getVisibility() == 0));
    for (int i1 = (int)this.t.getTranslationY(); ; i1 = 0)
    {
      this.y.setBounds(0, i1, getMeasuredWidth(), getMeasuredHeight());
      this.y.draw(paramCanvas);
      return;
    }
  }

  public void setButtons(u paramu)
  {
    b(paramu, true);
  }

  public void setCaption(String paramString)
  {
    if (this.a != null)
    {
      this.a.a(paramString);
      e(true);
    }
  }

  public void setDelegate(a parama)
  {
    this.at = parama;
  }

  public void setDialogId(long paramLong)
  {
    int i2 = 1;
    this.am = paramLong;
    boolean bool;
    label140: label165: float f1;
    if ((int)this.am < 0)
    {
      Object localObject = org.vidogram.messenger.v.a().b(Integer.valueOf(-(int)this.am));
      this.E = ApplicationLoader.a.getSharedPreferences("Notifications", 0).getBoolean("silent_" + this.am, false);
      if ((!org.vidogram.messenger.e.d((g.i)localObject)) || ((!((g.i)localObject).c) && (!((g.i)localObject).n)) || (((g.i)localObject).r))
        break label262;
      bool = true;
      this.F = bool;
      if (this.v != null)
      {
        localObject = this.v;
        if (!this.F)
          break label268;
        i1 = 0;
        ((ImageView)localObject).setVisibility(i1);
        localObject = this.v;
        if (!this.E)
          break label275;
        i1 = 2130838010;
        ((ImageView)localObject).setImageResource(i1);
        localObject = this.p;
        if (((this.q != null) && (this.q.getVisibility() != 8)) || ((this.v != null) && (this.v.getVisibility() != 8)))
          break label283;
        f1 = 48.0F;
        label220: ((LinearLayout)localObject).setPivotX(org.vidogram.messenger.a.a(f1));
      }
      if (this.p != null)
        if (this.p.getVisibility() != 0)
          break label290;
    }
    label262: label268: label275: label283: label290: for (int i1 = i2; ; i1 = 0)
    {
      a(i1);
      q();
      return;
      bool = false;
      break;
      i1 = 8;
      break label140;
      i1 = 2130838011;
      break label165;
      f1 = 96.0F;
      break label220;
    }
  }

  public void setFieldFocused(boolean paramBoolean)
  {
    if (this.a == null);
    do
      while (true)
      {
        return;
        if (!paramBoolean)
          break;
        if (this.a.isFocused())
          continue;
        this.a.postDelayed(new Runnable()
        {
          public void run()
          {
            if (e.c(e.this) != null);
            try
            {
              e.c(e.this).requestFocus();
              return;
            }
            catch (Exception localException)
            {
              n.a("tmessages", localException);
            }
          }
        }
        , 600L);
        return;
      }
    while ((!this.a.isFocused()) || (this.U));
    this.a.clearFocus();
  }

  public void setFieldText(CharSequence paramCharSequence)
  {
    if (this.a == null);
    do
    {
      return;
      this.an = true;
      this.a.setText(paramCharSequence);
      this.a.setSelection(this.a.getText().length());
      this.an = false;
    }
    while (this.at == null);
    this.at.a(this.a.getText(), true);
  }

  public void setReplyingMessageObject(u paramu)
  {
    if (paramu != null)
    {
      if ((this.aq == null) && (this.I != this.ap))
        this.aq = this.I;
      this.ap = paramu;
      b(this.ap, true);
      return;
    }
    if ((paramu == null) && (this.ap == this.I))
    {
      this.ap = null;
      b(this.aq, false);
      this.aq = null;
      return;
    }
    this.ap = paramu;
  }

  public void setSelection(int paramInt)
  {
    if (this.a == null)
      return;
    this.a.setSelection(paramInt, this.a.length());
  }

  public static abstract interface a
  {
    public abstract void a();

    public abstract void a(int paramInt);

    public abstract void a(CharSequence paramCharSequence);

    public abstract void a(CharSequence paramCharSequence, boolean paramBoolean);

    public abstract void a(boolean paramBoolean);

    public abstract void b();

    public abstract void b(boolean paramBoolean);

    public abstract void c();
  }

  private class b extends EditText
  {
    private String b;
    private StaticLayout c;
    private int d;
    private int e;
    private int f;
    private Object g;
    private Field h;
    private Drawable[] i;
    private Field j;
    private int k = 0;

    public b(Context arg2)
    {
      super();
      try
      {
        this$1 = TextView.class.getDeclaredField("mEditor");
        e.this.setAccessible(true);
        this.g = e.this.get(this);
        this$1 = Class.forName("android.widget.Editor");
        this.h = e.this.getDeclaredField("mShowCursor");
        this.h.setAccessible(true);
        this.j = e.this.getDeclaredField("mCursorDrawable");
        this.j.setAccessible(true);
        this.i = ((Drawable[])(Drawable[])this.j.get(this.g));
        return;
      }
      catch (java.lang.Throwable this$1)
      {
      }
    }

    public void a(String paramString)
    {
      if (((this.b != null) && (this.b.length() != 0)) || ((paramString == null) || (paramString.length() == 0) || ((this.b != null) && (paramString != null) && (this.b.equals(paramString)))))
        return;
      this.b = paramString;
      if (this.b != null)
        this.b = this.b.replace('\n', ' ');
      requestLayout();
    }

    protected void onDraw(Canvas paramCanvas)
    {
      try
      {
        super.onDraw(paramCanvas);
        if ((this.c != null) && (this.d == length()))
        {
          TextPaint localTextPaint = getPaint();
          m = getPaint().getColor();
          localTextPaint.setColor(-5066062);
          paramCanvas.save();
          paramCanvas.translate(this.e, this.f);
          this.c.draw(paramCanvas);
          paramCanvas.restore();
          localTextPaint.setColor(m);
        }
      }
      catch (Exception localException)
      {
        try
        {
          if ((this.h != null) && (this.i != null) && (this.i[0] != null))
          {
            long l = this.h.getLong(this.g);
            if ((SystemClock.uptimeMillis() - l) % 1000L >= 500L)
              break label180;
          }
          label180: for (int m = 1; ; m = 0)
          {
            if (m != 0)
            {
              paramCanvas.save();
              paramCanvas.translate(0.0F, getPaddingTop());
              this.i[0].draw(paramCanvas);
              paramCanvas.restore();
            }
            return;
            localException = localException;
            n.a("tmessages", localException);
            break;
          }
        }
        catch (java.lang.Throwable paramCanvas)
        {
        }
      }
    }

    @SuppressLint({"DrawAllocation"})
    protected void onMeasure(int paramInt1, int paramInt2)
    {
      try
      {
        super.onMeasure(paramInt1, paramInt2);
        this.c = null;
        if ((this.b != null) && (this.b.length() > 0))
        {
          localObject = getText();
          if ((((CharSequence)localObject).length() > 1) && (((CharSequence)localObject).charAt(0) == '@'))
          {
            paramInt1 = TextUtils.indexOf((CharSequence)localObject, ' ');
            if (paramInt1 != -1)
            {
              TextPaint localTextPaint = getPaint();
              CharSequence localCharSequence = ((CharSequence)localObject).subSequence(0, paramInt1 + 1);
              paramInt1 = (int)Math.ceil(localTextPaint.measureText((CharSequence)localObject, 0, paramInt1 + 1));
              paramInt2 = getMeasuredWidth() - getPaddingLeft() - getPaddingRight();
              this.d = localCharSequence.length();
              localObject = TextUtils.ellipsize(this.b, localTextPaint, paramInt2 - paramInt1, TextUtils.TruncateAt.END);
              this.e = paramInt1;
            }
          }
        }
      }
      catch (Exception localException2)
      {
        try
        {
          Object localObject;
          this.c = new StaticLayout((CharSequence)localObject, getPaint(), paramInt2 - paramInt1, Layout.Alignment.ALIGN_NORMAL, 1.0F, 0.0F, false);
          if (this.c.getLineCount() > 0)
            this.e = (int)(this.e + -this.c.getLineLeft(0));
          this.f = ((getMeasuredHeight() - this.c.getLineBottom(0)) / 2 + org.vidogram.messenger.a.a(0.5F));
          return;
          localException1 = localException1;
          setMeasuredDimension(View.MeasureSpec.getSize(paramInt1), org.vidogram.messenger.a.a(51.0F));
          n.a("tmessages", localException1);
        }
        catch (Exception localException2)
        {
          n.a("tmessages", localException2);
        }
      }
    }

    public boolean onTouchEvent(MotionEvent paramMotionEvent)
    {
      e locale;
      int m;
      if ((e.this.o()) && (paramMotionEvent.getAction() == 0))
      {
        locale = e.this;
        if (!org.vidogram.messenger.a.h)
          break label53;
        m = 0;
      }
      while (true)
      {
        e.a(locale, m, 0);
        e.b(e.this);
        try
        {
          boolean bool = super.onTouchEvent(paramMotionEvent);
          return bool;
          label53: m = 2;
        }
        catch (Exception paramMotionEvent)
        {
          n.a("tmessages", paramMotionEvent);
        }
      }
      return false;
    }
  }

  private class c extends View
  {
    private Paint b = new Paint(1);
    private Paint c = new Paint(1);
    private Drawable d;
    private float e;
    private float f;
    private float g;
    private float h;
    private long i;

    public c(Context arg2)
    {
      super();
      this.b.setColor(-11037236);
      this.c.setColor(218103808);
      this.d = getResources().getDrawable(2130837978);
    }

    public void a(double paramDouble)
    {
      this.g = ((float)Math.min(100.0D, paramDouble) / 100.0F);
      this.h = ((this.g - this.f) / 150.0F);
      this.i = System.currentTimeMillis();
      invalidate();
    }

    protected void onDraw(Canvas paramCanvas)
    {
      float f2 = 1.0F;
      int j = getMeasuredWidth() / 2;
      int k = getMeasuredHeight() / 2;
      float f1;
      if (this.e <= 0.5F)
      {
        f2 = this.e / 0.5F;
        f1 = f2;
        long l1 = System.currentTimeMillis();
        long l2 = this.i;
        if (this.g != this.f)
        {
          float f3 = this.f;
          float f4 = this.h;
          this.f = ((float)(l1 - l2) * f4 + f3);
          if (this.h <= 0.0F)
            break label338;
          if (this.f > this.g)
            this.f = this.g;
        }
      }
      while (true)
      {
        invalidate();
        this.i = System.currentTimeMillis();
        if (this.f != 0.0F)
          paramCanvas.drawCircle(getMeasuredWidth() / 2.0F, getMeasuredHeight() / 2.0F, (org.vidogram.messenger.a.a(42.0F) + org.vidogram.messenger.a.a(20.0F) * this.f) * this.e, this.c);
        paramCanvas.drawCircle(getMeasuredWidth() / 2.0F, getMeasuredHeight() / 2.0F, f1 * org.vidogram.messenger.a.a(42.0F), this.b);
        this.d.setBounds(j - this.d.getIntrinsicWidth() / 2, k - this.d.getIntrinsicHeight() / 2, j + this.d.getIntrinsicWidth() / 2, k + this.d.getIntrinsicHeight() / 2);
        this.d.setAlpha((int)(f2 * 255.0F));
        this.d.draw(paramCanvas);
        return;
        if (this.e <= 0.75F)
        {
          f1 = 1.0F - (this.e - 0.5F) / 0.25F * 0.1F;
          break;
        }
        f1 = 0.9F + (this.e - 0.75F) / 0.25F * 0.1F;
        break;
        label338: if (this.f >= this.g)
          continue;
        this.f = this.g;
      }
    }
  }

  private class d extends View
  {
    private Drawable b = getResources().getDrawable(2130838105);
    private float c;
    private long d;
    private boolean e;

    public d(Context arg2)
    {
      super();
    }

    public void a()
    {
      this.c = 1.0F;
      this.d = System.currentTimeMillis();
      this.e = false;
      invalidate();
    }

    protected void onDraw(Canvas paramCanvas)
    {
      this.b.setBounds(0, 0, org.vidogram.messenger.a.a(11.0F), org.vidogram.messenger.a.a(11.0F));
      this.b.setAlpha((int)(255.0F * this.c));
      long l = System.currentTimeMillis() - this.d;
      if (!this.e)
      {
        this.c -= (float)l / 400.0F;
        if (this.c <= 0.0F)
        {
          this.c = 0.0F;
          this.e = true;
        }
      }
      while (true)
      {
        this.d = System.currentTimeMillis();
        this.b.draw(paramCanvas);
        invalidate();
        return;
        float f = this.c;
        this.c = ((float)l / 400.0F + f);
        if (this.c < 1.0F)
          continue;
        this.c = 1.0F;
        this.e = false;
      }
    }
  }

  private class e extends View
  {
    private bb b;

    public e(Context arg2)
    {
      super();
      this.b = new bb(localContext);
      this.b.a(-6107400, -1, -6107400);
      this.b.a(new ba.a(e.this)
      {
        public void a(float paramFloat)
        {
          if (e.a(e.this) != null)
          {
            e.a(e.this).k = paramFloat;
            MediaController.a().a(e.a(e.this), paramFloat);
          }
        }
      });
    }

    public void a(float paramFloat)
    {
      this.b.a(paramFloat);
      invalidate();
    }

    public void a(byte[] paramArrayOfByte)
    {
      this.b.a(paramArrayOfByte);
      invalidate();
    }

    public boolean a()
    {
      return this.b.b();
    }

    protected void onDraw(Canvas paramCanvas)
    {
      super.onDraw(paramCanvas);
      this.b.a(paramCanvas);
    }

    protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
      this.b.a(paramInt3 - paramInt1, paramInt4 - paramInt2);
    }

    public boolean onTouchEvent(MotionEvent paramMotionEvent)
    {
      boolean bool = this.b.a(paramMotionEvent.getAction(), paramMotionEvent.getX(), paramMotionEvent.getY());
      if (bool)
      {
        if (paramMotionEvent.getAction() == 0)
          e.this.requestDisallowInterceptTouchEvent(true);
        invalidate();
      }
      return (bool) || (super.onTouchEvent(paramMotionEvent));
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.Components.e
 * JD-Core Version:    0.6.0
 */