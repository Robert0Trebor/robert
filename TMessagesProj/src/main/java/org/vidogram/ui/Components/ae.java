package org.vidogram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Vibrator;
import android.support.v4.c.a.a.b;
import android.support.v4.c.a.a.c;
import android.support.v4.e.d;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import java.util.ArrayList;
import java.util.Locale;
import org.vidogram.messenger.ApplicationLoader;
import org.vidogram.messenger.ad;
import org.vidogram.messenger.b;
import org.vidogram.messenger.n;
import org.vidogram.messenger.r;
import org.vidogram.messenger.y;

public class ae extends FrameLayout
{
  private Drawable a;
  private FrameLayout b;
  private ArrayList<TextView> c;
  private ArrayList<TextView> d;
  private ArrayList<FrameLayout> e;
  private FrameLayout f;
  private ImageView g;
  private EditText h;
  private a i;
  private FrameLayout j;
  private TextView k;
  private ImageView l;
  private int m = 0;
  private d n;
  private ImageView o;
  private TextView p;
  private boolean q;
  private AlertDialog r;
  private Rect s = new Rect();
  private b t;

  public ae(Context paramContext)
  {
    super(paramContext);
    setWillNotDraw(false);
    setVisibility(8);
    this.j = new FrameLayout(paramContext);
    addView(this.j);
    Object localObject = (FrameLayout.LayoutParams)this.j.getLayoutParams();
    ((FrameLayout.LayoutParams)localObject).width = -1;
    ((FrameLayout.LayoutParams)localObject).height = -1;
    this.j.setLayoutParams((ViewGroup.LayoutParams)localObject);
    this.f = new FrameLayout(paramContext);
    addView(this.f);
    localObject = (FrameLayout.LayoutParams)this.f.getLayoutParams();
    ((FrameLayout.LayoutParams)localObject).width = -1;
    ((FrameLayout.LayoutParams)localObject).height = -1;
    ((FrameLayout.LayoutParams)localObject).gravity = 51;
    this.f.setLayoutParams((ViewGroup.LayoutParams)localObject);
    localObject = new ImageView(paramContext);
    ((ImageView)localObject).setScaleType(ImageView.ScaleType.FIT_XY);
    ((ImageView)localObject).setImageResource(2130838024);
    this.f.addView((View)localObject);
    FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)((ImageView)localObject).getLayoutParams();
    if (org.vidogram.messenger.a.b < 1.0F)
    {
      localLayoutParams.width = org.vidogram.messenger.a.a(30.0F);
      localLayoutParams.height = org.vidogram.messenger.a.a(30.0F);
      localLayoutParams.gravity = 81;
      localLayoutParams.bottomMargin = org.vidogram.messenger.a.a(100.0F);
      ((ImageView)localObject).setLayoutParams(localLayoutParams);
      this.k = new TextView(paramContext);
      this.k.setTextColor(-1);
      this.k.setTextSize(1, 14.0F);
      this.k.setGravity(1);
      this.f.addView(this.k);
      localObject = (FrameLayout.LayoutParams)this.k.getLayoutParams();
      ((FrameLayout.LayoutParams)localObject).width = -2;
      ((FrameLayout.LayoutParams)localObject).height = -2;
      ((FrameLayout.LayoutParams)localObject).bottomMargin = org.vidogram.messenger.a.a(62.0F);
      ((FrameLayout.LayoutParams)localObject).gravity = 81;
      this.k.setLayoutParams((ViewGroup.LayoutParams)localObject);
      this.i = new a(paramContext);
      this.f.addView(this.i);
      localObject = (FrameLayout.LayoutParams)this.i.getLayoutParams();
      ((FrameLayout.LayoutParams)localObject).height = -2;
      ((FrameLayout.LayoutParams)localObject).width = -1;
      ((FrameLayout.LayoutParams)localObject).leftMargin = org.vidogram.messenger.a.a(70.0F);
      ((FrameLayout.LayoutParams)localObject).rightMargin = org.vidogram.messenger.a.a(70.0F);
      ((FrameLayout.LayoutParams)localObject).bottomMargin = org.vidogram.messenger.a.a(6.0F);
      ((FrameLayout.LayoutParams)localObject).gravity = 81;
      this.i.setLayoutParams((ViewGroup.LayoutParams)localObject);
      this.h = new EditText(paramContext);
      this.h.setTextSize(1, 36.0F);
      this.h.setTextColor(-1);
      this.h.setMaxLines(1);
      this.h.setLines(1);
      this.h.setGravity(1);
      this.h.setSingleLine(true);
      this.h.setImeOptions(6);
      this.h.setTypeface(Typeface.DEFAULT);
      this.h.setBackgroundDrawable(null);
      org.vidogram.messenger.a.a(this.h);
      this.f.addView(this.h);
      localObject = (FrameLayout.LayoutParams)this.h.getLayoutParams();
      ((FrameLayout.LayoutParams)localObject).height = -2;
      ((FrameLayout.LayoutParams)localObject).width = -1;
      ((FrameLayout.LayoutParams)localObject).leftMargin = org.vidogram.messenger.a.a(70.0F);
      ((FrameLayout.LayoutParams)localObject).rightMargin = org.vidogram.messenger.a.a(70.0F);
      ((FrameLayout.LayoutParams)localObject).bottomMargin = org.vidogram.messenger.a.a(6.0F);
      ((FrameLayout.LayoutParams)localObject).gravity = 81;
      this.h.setLayoutParams((ViewGroup.LayoutParams)localObject);
      this.h.setOnEditorActionListener(new TextView.OnEditorActionListener()
      {
        public boolean onEditorAction(TextView paramTextView, int paramInt, KeyEvent paramKeyEvent)
        {
          int i = 0;
          if (paramInt == 6)
          {
            ae.a(ae.this, false);
            i = 1;
          }
          return i;
        }
      });
      this.h.addTextChangedListener(new TextWatcher()
      {
        public void afterTextChanged(Editable paramEditable)
        {
          if ((ae.a(ae.this).length() == 4) && (ad.l == 0))
            ae.a(ae.this, false);
        }

        public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
        {
        }

        public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
        {
        }
      });
      this.h.setCustomSelectionActionModeCallback(new ActionMode.Callback()
      {
        public boolean onActionItemClicked(ActionMode paramActionMode, MenuItem paramMenuItem)
        {
          return false;
        }

        public boolean onCreateActionMode(ActionMode paramActionMode, Menu paramMenu)
        {
          return false;
        }

        public void onDestroyActionMode(ActionMode paramActionMode)
        {
        }

        public boolean onPrepareActionMode(ActionMode paramActionMode, Menu paramMenu)
        {
          return false;
        }
      });
      this.l = new ImageView(paramContext);
      this.l.setImageResource(2130838022);
      this.l.setScaleType(ImageView.ScaleType.CENTER);
      this.l.setBackgroundResource(2130837630);
      this.f.addView(this.l);
      localObject = (FrameLayout.LayoutParams)this.l.getLayoutParams();
      ((FrameLayout.LayoutParams)localObject).width = org.vidogram.messenger.a.a(60.0F);
      ((FrameLayout.LayoutParams)localObject).height = org.vidogram.messenger.a.a(60.0F);
      ((FrameLayout.LayoutParams)localObject).bottomMargin = org.vidogram.messenger.a.a(4.0F);
      ((FrameLayout.LayoutParams)localObject).rightMargin = org.vidogram.messenger.a.a(10.0F);
      ((FrameLayout.LayoutParams)localObject).gravity = 85;
      this.l.setLayoutParams((ViewGroup.LayoutParams)localObject);
      this.l.setOnClickListener(new View.OnClickListener()
      {
        public void onClick(View paramView)
        {
          ae.a(ae.this, false);
        }
      });
      localObject = new FrameLayout(paramContext);
      ((FrameLayout)localObject).setBackgroundColor(654311423);
      this.f.addView((View)localObject);
      localLayoutParams = (FrameLayout.LayoutParams)((FrameLayout)localObject).getLayoutParams();
      localLayoutParams.width = -1;
      localLayoutParams.height = org.vidogram.messenger.a.a(1.0F);
      localLayoutParams.gravity = 83;
      localLayoutParams.leftMargin = org.vidogram.messenger.a.a(20.0F);
      localLayoutParams.rightMargin = org.vidogram.messenger.a.a(20.0F);
      ((FrameLayout)localObject).setLayoutParams(localLayoutParams);
      this.b = new FrameLayout(paramContext);
      addView(this.b);
      localObject = (FrameLayout.LayoutParams)this.b.getLayoutParams();
      ((FrameLayout.LayoutParams)localObject).width = -1;
      ((FrameLayout.LayoutParams)localObject).height = -1;
      ((FrameLayout.LayoutParams)localObject).gravity = 51;
      this.b.setLayoutParams((ViewGroup.LayoutParams)localObject);
      this.d = new ArrayList(10);
      this.c = new ArrayList(10);
      this.e = new ArrayList(10);
      i1 = 0;
      label934: if (i1 >= 10)
        break label1319;
      localObject = new TextView(paramContext);
      ((TextView)localObject).setTextColor(-1);
      ((TextView)localObject).setTextSize(1, 36.0F);
      ((TextView)localObject).setGravity(17);
      ((TextView)localObject).setText(String.format(Locale.US, "%d", new Object[] { Integer.valueOf(i1) }));
      this.b.addView((View)localObject);
      localLayoutParams = (FrameLayout.LayoutParams)((TextView)localObject).getLayoutParams();
      localLayoutParams.width = org.vidogram.messenger.a.a(50.0F);
      localLayoutParams.height = org.vidogram.messenger.a.a(50.0F);
      localLayoutParams.gravity = 51;
      ((TextView)localObject).setLayoutParams(localLayoutParams);
      this.c.add(localObject);
      localObject = new TextView(paramContext);
      ((TextView)localObject).setTextSize(1, 12.0F);
      ((TextView)localObject).setTextColor(2147483647);
      ((TextView)localObject).setGravity(17);
      this.b.addView((View)localObject);
      localLayoutParams = (FrameLayout.LayoutParams)((TextView)localObject).getLayoutParams();
      localLayoutParams.width = org.vidogram.messenger.a.a(50.0F);
      localLayoutParams.height = org.vidogram.messenger.a.a(20.0F);
      localLayoutParams.gravity = 51;
      ((TextView)localObject).setLayoutParams(localLayoutParams);
      switch (i1)
      {
      case 1:
      default:
      case 0:
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      case 7:
      case 8:
      case 9:
      }
    }
    while (true)
    {
      this.d.add(localObject);
      i1 += 1;
      break label934;
      localLayoutParams.width = org.vidogram.messenger.a.a(40.0F);
      localLayoutParams.height = org.vidogram.messenger.a.a(40.0F);
      break;
      ((TextView)localObject).setText("+");
      continue;
      ((TextView)localObject).setText("ABC");
      continue;
      ((TextView)localObject).setText("DEF");
      continue;
      ((TextView)localObject).setText("GHI");
      continue;
      ((TextView)localObject).setText("JKL");
      continue;
      ((TextView)localObject).setText("MNO");
      continue;
      ((TextView)localObject).setText("PQRS");
      continue;
      ((TextView)localObject).setText("TUV");
      continue;
      ((TextView)localObject).setText("WXYZ");
    }
    label1319: this.g = new ImageView(paramContext);
    this.g.setScaleType(ImageView.ScaleType.CENTER);
    this.g.setImageResource(2130838023);
    this.b.addView(this.g);
    localObject = (FrameLayout.LayoutParams)this.g.getLayoutParams();
    ((FrameLayout.LayoutParams)localObject).width = org.vidogram.messenger.a.a(50.0F);
    ((FrameLayout.LayoutParams)localObject).height = org.vidogram.messenger.a.a(50.0F);
    ((FrameLayout.LayoutParams)localObject).gravity = 51;
    this.g.setLayoutParams((ViewGroup.LayoutParams)localObject);
    int i1 = 0;
    while (i1 < 11)
    {
      localObject = new FrameLayout(paramContext);
      ((FrameLayout)localObject).setBackgroundResource(2130837630);
      ((FrameLayout)localObject).setTag(Integer.valueOf(i1));
      if (i1 == 10)
        ((FrameLayout)localObject).setOnLongClickListener(new View.OnLongClickListener()
        {
          public boolean onLongClick(View paramView)
          {
            ae.a(ae.this).setText("");
            ae.a.a(ae.b(ae.this), true);
            return true;
          }
        });
      ((FrameLayout)localObject).setOnClickListener(new View.OnClickListener()
      {
        public void onClick(View paramView)
        {
          switch (((Integer)paramView.getTag()).intValue())
          {
          default:
          case 0:
          case 1:
          case 2:
          case 3:
          case 4:
          case 5:
          case 6:
          case 7:
          case 8:
          case 9:
          case 10:
          }
          while (true)
          {
            if (ae.b(ae.this).b() == 4)
              ae.a(ae.this, false);
            return;
            ae.b(ae.this).a("0");
            continue;
            ae.b(ae.this).a("1");
            continue;
            ae.b(ae.this).a("2");
            continue;
            ae.b(ae.this).a("3");
            continue;
            ae.b(ae.this).a("4");
            continue;
            ae.b(ae.this).a("5");
            continue;
            ae.b(ae.this).a("6");
            continue;
            ae.b(ae.this).a("7");
            continue;
            ae.b(ae.this).a("8");
            continue;
            ae.b(ae.this).a("9");
            continue;
            ae.b(ae.this).c();
          }
        }
      });
      this.e.add(localObject);
      i1 += 1;
    }
    i1 = 10;
    while (i1 >= 0)
    {
      paramContext = (FrameLayout)this.e.get(i1);
      this.b.addView(paramContext);
      localObject = (FrameLayout.LayoutParams)paramContext.getLayoutParams();
      ((FrameLayout.LayoutParams)localObject).width = org.vidogram.messenger.a.a(100.0F);
      ((FrameLayout.LayoutParams)localObject).height = org.vidogram.messenger.a.a(100.0F);
      ((FrameLayout.LayoutParams)localObject).gravity = 51;
      paramContext.setLayoutParams((ViewGroup.LayoutParams)localObject);
      i1 -= 1;
    }
  }

  private void a(float paramFloat, int paramInt)
  {
    if (paramInt == 6)
      return;
    AnimatorSet localAnimatorSet = new AnimatorSet();
    localAnimatorSet.playTogether(new Animator[] { ObjectAnimator.ofFloat(this.k, "translationX", new float[] { org.vidogram.messenger.a.a(paramFloat) }) });
    localAnimatorSet.setDuration(50L);
    localAnimatorSet.addListener(new b(paramInt, paramFloat)
    {
      public void onAnimationEnd(Animator paramAnimator)
      {
        paramAnimator = ae.this;
        float f;
        if (this.a == 5)
          f = 0.0F;
        while (true)
        {
          ae.a(paramAnimator, f, this.a + 1);
          return;
          f = -this.b;
        }
      }
    });
    localAnimatorSet.start();
  }

  private void a(CharSequence paramCharSequence)
  {
    this.o.setImageResource(2130837835);
    this.p.setText(paramCharSequence);
    this.p.setTextColor(-765666);
    paramCharSequence = (Vibrator)getContext().getSystemService("vibrator");
    if (paramCharSequence != null)
      paramCharSequence.vibrate(200L);
    org.vidogram.messenger.a.a(this.p, 2.0F, 0);
  }

  private void a(boolean paramBoolean)
  {
    Object localObject;
    if (!paramBoolean)
    {
      localObject = "";
      if (ad.l != 0);
    }
    do
    {
      localObject = this.i.a();
      while (((String)localObject).length() == 0)
      {
        d();
        return;
        if (ad.l != 1)
          continue;
        localObject = this.h.getText().toString();
      }
      if (!ad.a((String)localObject))
      {
        this.h.setText("");
        a.a(this.i, true);
        d();
        return;
      }
      this.h.clearFocus();
      org.vidogram.messenger.a.b(this.h);
      localObject = new AnimatorSet();
      ((AnimatorSet)localObject).setDuration(200L);
      ((AnimatorSet)localObject).playTogether(new Animator[] { ObjectAnimator.ofFloat(this, "translationY", new float[] { org.vidogram.messenger.a.a(20.0F) }), ObjectAnimator.ofFloat(this, "alpha", new float[] { org.vidogram.messenger.a.a(0.0F) }) });
      ((AnimatorSet)localObject).addListener(new b()
      {
        public void onAnimationEnd(Animator paramAnimator)
        {
          ae.this.setVisibility(8);
        }
      });
      ((AnimatorSet)localObject).start();
      ad.k = false;
      ad.a(false);
      y.a().a(y.H, new Object[0]);
      setOnTouchListener(null);
    }
    while (this.t == null);
    this.t.a();
  }

  private void d()
  {
    Vibrator localVibrator = (Vibrator)getContext().getSystemService("vibrator");
    if (localVibrator != null)
      localVibrator.vibrate(200L);
    a(2.0F, 0);
  }

  private void e()
  {
    Activity localActivity = (Activity)getContext();
    if ((Build.VERSION.SDK_INT >= 23) && (localActivity != null) && (ad.p) && (!ApplicationLoader.d));
    try
    {
      if (this.r != null)
      {
        boolean bool = this.r.isShowing();
        if (bool)
          return;
      }
    }
    catch (Exception localThrowable)
    {
      while (true)
      {
        n.a("tmessages", localException1);
        try
        {
          android.support.v4.c.a.a locala = android.support.v4.c.a.a.a(ApplicationLoader.a);
          if ((!locala.b()) || (!locala.a()))
            continue;
          Object localObject1 = new RelativeLayout(getContext());
          ((RelativeLayout)localObject1).setPadding(org.vidogram.messenger.a.a(24.0F), org.vidogram.messenger.a.a(16.0F), org.vidogram.messenger.a.a(24.0F), org.vidogram.messenger.a.a(8.0F));
          Object localObject2 = new TextView(getContext());
          ((TextView)localObject2).setTextColor(-7105645);
          ((TextView)localObject2).setId(1000);
          ((TextView)localObject2).setTextAppearance(16974344);
          ((TextView)localObject2).setText(r.a("FingerprintInfo", 2131231196));
          ((RelativeLayout)localObject1).addView((View)localObject2);
          RelativeLayout.LayoutParams localLayoutParams = v.a(-2, -2);
          localLayoutParams.addRule(10);
          localLayoutParams.addRule(20);
          ((TextView)localObject2).setLayoutParams(localLayoutParams);
          this.o = new ImageView(getContext());
          this.o.setImageResource(2130837836);
          this.o.setId(1001);
          ((RelativeLayout)localObject1).addView(this.o, v.a(-2.0F, -2.0F, 0, 20, 0, 0, 20, 3, 1000));
          this.p = new TextView(getContext());
          this.p.setGravity(16);
          this.p.setText(r.a("FingerprintHelp", 2131231195));
          this.p.setTextAppearance(16974320);
          this.p.setTextColor(1107296256);
          ((RelativeLayout)localObject1).addView(this.p);
          localObject2 = v.a(-2, -2);
          ((RelativeLayout.LayoutParams)localObject2).setMarginStart(org.vidogram.messenger.a.a(16.0F));
          ((RelativeLayout.LayoutParams)localObject2).addRule(8, 1001);
          ((RelativeLayout.LayoutParams)localObject2).addRule(6, 1001);
          ((RelativeLayout.LayoutParams)localObject2).addRule(17, 1001);
          this.p.setLayoutParams((ViewGroup.LayoutParams)localObject2);
          localObject2 = new AlertDialog.Builder(getContext());
          ((AlertDialog.Builder)localObject2).setTitle(r.a("AppName", 2131230856));
          ((AlertDialog.Builder)localObject2).setView((View)localObject1);
          ((AlertDialog.Builder)localObject2).setNegativeButton(r.a("Cancel", 2131230943), null);
          ((AlertDialog.Builder)localObject2).setOnDismissListener(new DialogInterface.OnDismissListener()
          {
            public void onDismiss(DialogInterface paramDialogInterface)
            {
              if (ae.c(ae.this) != null)
              {
                ae.b(ae.this, true);
                ae.c(ae.this).a();
                ae.a(ae.this, null);
              }
            }
          });
          localObject1 = this.r;
          if (localObject1 != null);
          try
          {
            if (this.r.isShowing())
              this.r.dismiss();
            this.r = ((AlertDialog.Builder)localObject2).show();
            this.n = new d();
            this.q = false;
            locala.a(null, 0, this.n, new a.b()
            {
              public void a()
              {
                ae.a(ae.this, r.a("FingerprintNotRecognized", 2131231197));
              }

              public void a(int paramInt, CharSequence paramCharSequence)
              {
                if (!ae.d(ae.this))
                  ae.a(ae.this, paramCharSequence);
              }

              public void a(a.c paramc)
              {
                try
                {
                  if (ae.e(ae.this).isShowing())
                    ae.e(ae.this).dismiss();
                  ae.a(ae.this, null);
                  ae.a(ae.this, true);
                  return;
                }
                catch (Exception paramc)
                {
                  while (true)
                    n.a("tmessages", paramc);
                }
              }

              public void b(int paramInt, CharSequence paramCharSequence)
              {
                ae.a(ae.this, paramCharSequence);
              }
            }
            , null);
            return;
          }
          catch (Exception localException2)
          {
            while (true)
              n.a("tmessages", localException2);
          }
        }
        catch (Throwable localThrowable)
        {
        }
      }
    }
  }

  public void a()
  {
    if (ad.l == 1)
    {
      if (this.h != null)
      {
        this.h.requestFocus();
        org.vidogram.messenger.a.a(this.h);
      }
      org.vidogram.messenger.a.a(new Runnable()
      {
        public void run()
        {
          if (ae.a(ae.this) != null)
          {
            ae.a(ae.this).requestFocus();
            org.vidogram.messenger.a.a(ae.a(ae.this));
          }
        }
      }
      , 200L);
    }
    e();
  }

  public void b()
  {
    if (this.r != null);
    try
    {
      if (this.r.isShowing())
        this.r.dismiss();
      this.r = null;
    }
    catch (Exception localException2)
    {
      try
      {
        while (true)
        {
          if ((Build.VERSION.SDK_INT >= 23) && (this.n != null))
          {
            this.n.a();
            this.n = null;
          }
          return;
          localException1 = localException1;
          n.a("tmessages", localException1);
        }
      }
      catch (Exception localException2)
      {
        n.a("tmessages", localException2);
      }
    }
  }

  public void c()
  {
    Object localObject = (Activity)getContext();
    if (ad.l == 1)
      if (this.h != null)
      {
        this.h.requestFocus();
        org.vidogram.messenger.a.a(this.h);
      }
    while (true)
    {
      e();
      if (getVisibility() != 0)
        break;
      return;
      if (localObject == null)
        continue;
      localObject = ((Activity)localObject).getCurrentFocus();
      if (localObject == null)
        continue;
      ((View)localObject).clearFocus();
      org.vidogram.messenger.a.b(((Activity)getContext()).getCurrentFocus());
    }
    setAlpha(1.0F);
    setTranslationY(0.0F);
    if (ApplicationLoader.a.getSharedPreferences("mainconfig", 0).getInt("selectedBackground", 1000001) == 1000001)
    {
      this.j.setBackgroundColor(-11436898);
      this.k.setText(r.a("EnterYourPasscode", 2131231185));
      if (ad.l != 0)
        break label271;
      this.b.setVisibility(0);
      this.h.setVisibility(8);
      this.i.setVisibility(0);
      this.l.setVisibility(8);
    }
    while (true)
    {
      setVisibility(0);
      this.h.setTransformationMethod(PasswordTransformationMethod.getInstance());
      this.h.setText("");
      a.a(this.i, false);
      setOnTouchListener(new View.OnTouchListener()
      {
        public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
        {
          return true;
        }
      });
      return;
      this.a = ApplicationLoader.g();
      if (this.a != null)
      {
        this.j.setBackgroundColor(-1090519040);
        break;
      }
      this.j.setBackgroundColor(-11436898);
      break;
      label271: if (ad.l != 1)
        continue;
      this.h.setFilters(new InputFilter[0]);
      this.h.setInputType(129);
      this.b.setVisibility(8);
      this.h.setFocusable(true);
      this.h.setFocusableInTouchMode(true);
      this.h.setVisibility(0);
      this.i.setVisibility(8);
      this.l.setVisibility(0);
    }
  }

  protected void onDraw(Canvas paramCanvas)
  {
    if (getVisibility() != 0)
      return;
    if (this.a != null)
    {
      if ((this.a instanceof ColorDrawable))
      {
        this.a.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
        this.a.draw(paramCanvas);
        return;
      }
      float f1 = getMeasuredWidth() / this.a.getIntrinsicWidth();
      float f2 = (getMeasuredHeight() + this.m) / this.a.getIntrinsicHeight();
      if (f1 < f2)
        f1 = f2;
      while (true)
      {
        int i1 = (int)Math.ceil(this.a.getIntrinsicWidth() * f1);
        int i2 = (int)Math.ceil(f1 * this.a.getIntrinsicHeight());
        int i3 = (getMeasuredWidth() - i1) / 2;
        int i4 = (getMeasuredHeight() - i2 + this.m) / 2;
        this.a.setBounds(i3, i4, i1 + i3, i2 + i4);
        this.a.draw(paramCanvas);
        return;
      }
    }
    super.onDraw(paramCanvas);
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i2 = 0;
    Object localObject = getRootView();
    int i1 = ((View)localObject).getHeight();
    int i3 = org.vidogram.messenger.a.a;
    int i4 = org.vidogram.messenger.a.c((View)localObject);
    getWindowVisibleDisplayFrame(this.s);
    this.m = (i1 - i3 - i4 - (this.s.bottom - this.s.top));
    if ((ad.l == 1) && ((org.vidogram.messenger.a.c()) || (getContext().getResources().getConfiguration().orientation != 2)))
      if (this.f.getTag() == null)
        break label196;
    label196: for (i1 = ((Integer)this.f.getTag()).intValue(); ; i1 = 0)
    {
      localObject = (FrameLayout.LayoutParams)this.f.getLayoutParams();
      i3 = ((FrameLayout.LayoutParams)localObject).height;
      i4 = this.m / 2;
      if (Build.VERSION.SDK_INT >= 21)
        i2 = org.vidogram.messenger.a.a;
      ((FrameLayout.LayoutParams)localObject).topMargin = (i1 + i3 - i4 - i2);
      this.f.setLayoutParams((ViewGroup.LayoutParams)localObject);
      super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
      return;
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i2 = View.MeasureSpec.getSize(paramInt1);
    int i3 = org.vidogram.messenger.a.c.y;
    int i4;
    FrameLayout.LayoutParams localLayoutParams1;
    if (Build.VERSION.SDK_INT >= 21)
    {
      i1 = 0;
      i4 = i3 - i1;
      if ((org.vidogram.messenger.a.c()) || (getContext().getResources().getConfiguration().orientation != 2))
        break label469;
      localLayoutParams1 = (FrameLayout.LayoutParams)this.f.getLayoutParams();
      if (ad.l != 0)
        break label463;
    }
    label231: int i6;
    int i5;
    label386: label463: for (int i1 = i2 / 2; ; i1 = i2)
    {
      localLayoutParams1.width = i1;
      localLayoutParams1.height = org.vidogram.messenger.a.a(140.0F);
      localLayoutParams1.topMargin = ((i4 - org.vidogram.messenger.a.a(140.0F)) / 2);
      this.f.setLayoutParams(localLayoutParams1);
      localLayoutParams1 = (FrameLayout.LayoutParams)this.b.getLayoutParams();
      localLayoutParams1.height = i4;
      localLayoutParams1.leftMargin = (i2 / 2);
      localLayoutParams1.topMargin = (i4 - localLayoutParams1.height);
      localLayoutParams1.width = (i2 / 2);
      this.b.setLayoutParams(localLayoutParams1);
      i3 = (localLayoutParams1.width - org.vidogram.messenger.a.a(50.0F) * 3) / 4;
      i4 = (localLayoutParams1.height - org.vidogram.messenger.a.a(50.0F) * 4) / 5;
      i2 = 0;
      while (true)
      {
        if (i2 >= 11)
          break label779;
        if (i2 != 0)
          break;
        i1 = 10;
        i6 = i1 / 3;
        i5 = i1 % 3;
        if (i2 >= 10)
          break label693;
        Object localObject1 = (TextView)this.c.get(i2);
        Object localObject2 = (TextView)this.d.get(i2);
        localLayoutParams1 = (FrameLayout.LayoutParams)((TextView)localObject1).getLayoutParams();
        FrameLayout.LayoutParams localLayoutParams2 = (FrameLayout.LayoutParams)((TextView)localObject2).getLayoutParams();
        i1 = i6 * (org.vidogram.messenger.a.a(50.0F) + i4) + i4;
        localLayoutParams1.topMargin = i1;
        localLayoutParams2.topMargin = i1;
        i5 = i5 * (org.vidogram.messenger.a.a(50.0F) + i3) + i3;
        localLayoutParams1.leftMargin = i5;
        localLayoutParams2.leftMargin = i5;
        localLayoutParams2.topMargin += org.vidogram.messenger.a.a(40.0F);
        ((TextView)localObject1).setLayoutParams(localLayoutParams1);
        ((TextView)localObject2).setLayoutParams(localLayoutParams2);
        localObject1 = (FrameLayout)this.e.get(i2);
        localObject2 = (FrameLayout.LayoutParams)((FrameLayout)localObject1).getLayoutParams();
        ((FrameLayout.LayoutParams)localObject2).topMargin = (i1 - org.vidogram.messenger.a.a(17.0F));
        ((FrameLayout.LayoutParams)localObject2).leftMargin = (localLayoutParams1.leftMargin - org.vidogram.messenger.a.a(25.0F));
        ((FrameLayout)localObject1).setLayoutParams((ViewGroup.LayoutParams)localObject2);
        i2 += 1;
      }
      i1 = org.vidogram.messenger.a.a;
      break;
    }
    label469: if (org.vidogram.messenger.a.c())
      if (i2 > org.vidogram.messenger.a.a(498.0F))
      {
        i1 = (i2 - org.vidogram.messenger.a.a(498.0F)) / 2;
        i2 = org.vidogram.messenger.a.a(498.0F);
        label506: if (i4 > org.vidogram.messenger.a.a(528.0F))
        {
          i5 = (i4 - org.vidogram.messenger.a.a(528.0F)) / 2;
          i4 = org.vidogram.messenger.a.a(528.0F);
          i3 = i2;
          i2 = i5;
        }
      }
    while (true)
    {
      localLayoutParams1 = (FrameLayout.LayoutParams)this.f.getLayoutParams();
      localLayoutParams1.height = (i4 / 3);
      localLayoutParams1.width = i3;
      localLayoutParams1.topMargin = i2;
      localLayoutParams1.leftMargin = i1;
      this.f.setTag(Integer.valueOf(i2));
      this.f.setLayoutParams(localLayoutParams1);
      localLayoutParams1 = (FrameLayout.LayoutParams)this.b.getLayoutParams();
      localLayoutParams1.height = (i4 / 3 * 2);
      localLayoutParams1.leftMargin = i1;
      localLayoutParams1.topMargin = (i4 - localLayoutParams1.height + i2);
      localLayoutParams1.width = i3;
      this.b.setLayoutParams(localLayoutParams1);
      break;
      if (i2 == 10)
      {
        i1 = 11;
        break label231;
      }
      i1 = i2 - 1;
      break label231;
      label693: localLayoutParams1 = (FrameLayout.LayoutParams)this.g.getLayoutParams();
      i1 = (org.vidogram.messenger.a.a(50.0F) + i4) * i6 + i4 + org.vidogram.messenger.a.a(8.0F);
      localLayoutParams1.topMargin = i1;
      localLayoutParams1.leftMargin = ((org.vidogram.messenger.a.a(50.0F) + i3) * i5 + i3);
      i5 = org.vidogram.messenger.a.a(8.0F);
      this.g.setLayoutParams(localLayoutParams1);
      i1 -= i5;
      break label386;
      label779: super.onMeasure(paramInt1, paramInt2);
      return;
      i3 = i2;
      i2 = 0;
      continue;
      i1 = 0;
      break label506;
      i1 = 0;
      i3 = i2;
      i2 = 0;
    }
  }

  public void setDelegate(b paramb)
  {
    this.t = paramb;
  }

  private class a extends FrameLayout
  {
    private ArrayList<TextView> b = new ArrayList(4);
    private ArrayList<TextView> c = new ArrayList(4);
    private StringBuilder d = new StringBuilder(4);
    private String e = "•";
    private AnimatorSet f;
    private Runnable g;

    public a(Context arg2)
    {
      super();
      int i = 0;
      while (i < 4)
      {
        this$1 = new TextView(localContext);
        ae.this.setTextColor(-1);
        ae.this.setTextSize(1, 36.0F);
        ae.this.setGravity(17);
        ae.this.setAlpha(0.0F);
        ae.this.setPivotX(org.vidogram.messenger.a.a(25.0F));
        ae.this.setPivotY(org.vidogram.messenger.a.a(25.0F));
        addView(ae.this);
        FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)ae.this.getLayoutParams();
        localLayoutParams.width = org.vidogram.messenger.a.a(50.0F);
        localLayoutParams.height = org.vidogram.messenger.a.a(50.0F);
        localLayoutParams.gravity = 51;
        ae.this.setLayoutParams(localLayoutParams);
        this.b.add(ae.this);
        this$1 = new TextView(localContext);
        ae.this.setTextColor(-1);
        ae.this.setTextSize(1, 36.0F);
        ae.this.setGravity(17);
        ae.this.setAlpha(0.0F);
        ae.this.setText(this.e);
        ae.this.setPivotX(org.vidogram.messenger.a.a(25.0F));
        ae.this.setPivotY(org.vidogram.messenger.a.a(25.0F));
        addView(ae.this);
        localLayoutParams = (FrameLayout.LayoutParams)ae.this.getLayoutParams();
        localLayoutParams.width = org.vidogram.messenger.a.a(50.0F);
        localLayoutParams.height = org.vidogram.messenger.a.a(50.0F);
        localLayoutParams.gravity = 51;
        ae.this.setLayoutParams(localLayoutParams);
        this.c.add(ae.this);
        i += 1;
      }
    }

    private int a(int paramInt)
    {
      return (getMeasuredWidth() - this.d.length() * org.vidogram.messenger.a.a(30.0F)) / 2 + org.vidogram.messenger.a.a(30.0F) * paramInt - org.vidogram.messenger.a.a(10.0F);
    }

    private void a(boolean paramBoolean)
    {
      int i = 0;
      if (this.d.length() == 0);
      while (true)
      {
        return;
        if (this.g != null)
        {
          org.vidogram.messenger.a.b(this.g);
          this.g = null;
        }
        if (this.f != null)
        {
          this.f.cancel();
          this.f = null;
        }
        this.d.delete(0, this.d.length());
        if (paramBoolean)
        {
          ArrayList localArrayList = new ArrayList();
          i = 0;
          while (i < 4)
          {
            TextView localTextView = (TextView)this.b.get(i);
            if (localTextView.getAlpha() != 0.0F)
            {
              localArrayList.add(ObjectAnimator.ofFloat(localTextView, "scaleX", new float[] { 0.0F }));
              localArrayList.add(ObjectAnimator.ofFloat(localTextView, "scaleY", new float[] { 0.0F }));
              localArrayList.add(ObjectAnimator.ofFloat(localTextView, "alpha", new float[] { 0.0F }));
            }
            localTextView = (TextView)this.c.get(i);
            if (localTextView.getAlpha() != 0.0F)
            {
              localArrayList.add(ObjectAnimator.ofFloat(localTextView, "scaleX", new float[] { 0.0F }));
              localArrayList.add(ObjectAnimator.ofFloat(localTextView, "scaleY", new float[] { 0.0F }));
              localArrayList.add(ObjectAnimator.ofFloat(localTextView, "alpha", new float[] { 0.0F }));
            }
            i += 1;
          }
          this.f = new AnimatorSet();
          this.f.setDuration(150L);
          this.f.playTogether(localArrayList);
          this.f.addListener(new b()
          {
            public void onAnimationEnd(Animator paramAnimator)
            {
              if ((ae.a.d(ae.a.this) != null) && (ae.a.d(ae.a.this).equals(paramAnimator)))
                ae.a.a(ae.a.this, null);
            }
          });
          this.f.start();
          return;
        }
        while (i < 4)
        {
          ((TextView)this.b.get(i)).setAlpha(0.0F);
          ((TextView)this.c.get(i)).setAlpha(0.0F);
          i += 1;
        }
      }
    }

    public String a()
    {
      return this.d.toString();
    }

    public void a(String paramString)
    {
      if (this.d.length() == 4)
        return;
      try
      {
        performHapticFeedback(3);
        ArrayList localArrayList = new ArrayList();
        j = this.d.length();
        this.d.append(paramString);
        TextView localTextView = (TextView)this.b.get(j);
        localTextView.setText(paramString);
        localTextView.setTranslationX(a(j));
        localArrayList.add(ObjectAnimator.ofFloat(localTextView, "scaleX", new float[] { 0.0F, 1.0F }));
        localArrayList.add(ObjectAnimator.ofFloat(localTextView, "scaleY", new float[] { 0.0F, 1.0F }));
        localArrayList.add(ObjectAnimator.ofFloat(localTextView, "alpha", new float[] { 0.0F, 1.0F }));
        localArrayList.add(ObjectAnimator.ofFloat(localTextView, "translationY", new float[] { org.vidogram.messenger.a.a(20.0F), 0.0F }));
        paramString = (TextView)this.c.get(j);
        paramString.setTranslationX(a(j));
        paramString.setAlpha(0.0F);
        localArrayList.add(ObjectAnimator.ofFloat(paramString, "scaleX", new float[] { 0.0F, 1.0F }));
        localArrayList.add(ObjectAnimator.ofFloat(paramString, "scaleY", new float[] { 0.0F, 1.0F }));
        localArrayList.add(ObjectAnimator.ofFloat(paramString, "translationY", new float[] { org.vidogram.messenger.a.a(20.0F), 0.0F }));
        i = j + 1;
        while (i < 4)
        {
          paramString = (TextView)this.b.get(i);
          if (paramString.getAlpha() != 0.0F)
          {
            localArrayList.add(ObjectAnimator.ofFloat(paramString, "scaleX", new float[] { 0.0F }));
            localArrayList.add(ObjectAnimator.ofFloat(paramString, "scaleY", new float[] { 0.0F }));
            localArrayList.add(ObjectAnimator.ofFloat(paramString, "alpha", new float[] { 0.0F }));
          }
          paramString = (TextView)this.c.get(i);
          if (paramString.getAlpha() != 0.0F)
          {
            localArrayList.add(ObjectAnimator.ofFloat(paramString, "scaleX", new float[] { 0.0F }));
            localArrayList.add(ObjectAnimator.ofFloat(paramString, "scaleY", new float[] { 0.0F }));
            localArrayList.add(ObjectAnimator.ofFloat(paramString, "alpha", new float[] { 0.0F }));
          }
          i += 1;
        }
      }
      catch (Exception localException)
      {
        int j;
        while (true)
          n.a("tmessages", localException);
        if (this.g != null)
          org.vidogram.messenger.a.b(this.g);
        this.g = new Runnable(j)
        {
          public void run()
          {
            if (ae.a.a(ae.a.this) != this)
              return;
            ArrayList localArrayList = new ArrayList();
            TextView localTextView = (TextView)ae.a.b(ae.a.this).get(this.a);
            localArrayList.add(ObjectAnimator.ofFloat(localTextView, "scaleX", new float[] { 0.0F }));
            localArrayList.add(ObjectAnimator.ofFloat(localTextView, "scaleY", new float[] { 0.0F }));
            localArrayList.add(ObjectAnimator.ofFloat(localTextView, "alpha", new float[] { 0.0F }));
            localTextView = (TextView)ae.a.c(ae.a.this).get(this.a);
            localArrayList.add(ObjectAnimator.ofFloat(localTextView, "scaleX", new float[] { 1.0F }));
            localArrayList.add(ObjectAnimator.ofFloat(localTextView, "scaleY", new float[] { 1.0F }));
            localArrayList.add(ObjectAnimator.ofFloat(localTextView, "alpha", new float[] { 1.0F }));
            ae.a.a(ae.a.this, new AnimatorSet());
            ae.a.d(ae.a.this).setDuration(150L);
            ae.a.d(ae.a.this).playTogether(localArrayList);
            ae.a.d(ae.a.this).addListener(new b()
            {
              public void onAnimationEnd(Animator paramAnimator)
              {
                if ((ae.a.d(ae.a.this) != null) && (ae.a.d(ae.a.this).equals(paramAnimator)))
                  ae.a.a(ae.a.this, null);
              }
            });
            ae.a.d(ae.a.this).start();
          }
        };
        org.vidogram.messenger.a.a(this.g, 1500L);
        int i = 0;
        while (i < j)
        {
          paramString = (TextView)this.b.get(i);
          localException.add(ObjectAnimator.ofFloat(paramString, "translationX", new float[] { a(i) }));
          localException.add(ObjectAnimator.ofFloat(paramString, "scaleX", new float[] { 0.0F }));
          localException.add(ObjectAnimator.ofFloat(paramString, "scaleY", new float[] { 0.0F }));
          localException.add(ObjectAnimator.ofFloat(paramString, "alpha", new float[] { 0.0F }));
          localException.add(ObjectAnimator.ofFloat(paramString, "translationY", new float[] { 0.0F }));
          paramString = (TextView)this.c.get(i);
          localException.add(ObjectAnimator.ofFloat(paramString, "translationX", new float[] { a(i) }));
          localException.add(ObjectAnimator.ofFloat(paramString, "scaleX", new float[] { 1.0F }));
          localException.add(ObjectAnimator.ofFloat(paramString, "scaleY", new float[] { 1.0F }));
          localException.add(ObjectAnimator.ofFloat(paramString, "alpha", new float[] { 1.0F }));
          localException.add(ObjectAnimator.ofFloat(paramString, "translationY", new float[] { 0.0F }));
          i += 1;
        }
        if (this.f != null)
          this.f.cancel();
        this.f = new AnimatorSet();
        this.f.setDuration(150L);
        this.f.playTogether(localException);
        this.f.addListener(new b()
        {
          public void onAnimationEnd(Animator paramAnimator)
          {
            if ((ae.a.d(ae.a.this) != null) && (ae.a.d(ae.a.this).equals(paramAnimator)))
              ae.a.a(ae.a.this, null);
          }
        });
        this.f.start();
      }
    }

    public int b()
    {
      return this.d.length();
    }

    public void c()
    {
      if (this.d.length() == 0)
        return;
      try
      {
        performHapticFeedback(3);
        ArrayList localArrayList = new ArrayList();
        j = this.d.length() - 1;
        if (j != 0)
          this.d.deleteCharAt(j);
        i = j;
        while (i < 4)
        {
          TextView localTextView = (TextView)this.b.get(i);
          if (localTextView.getAlpha() != 0.0F)
          {
            localArrayList.add(ObjectAnimator.ofFloat(localTextView, "scaleX", new float[] { 0.0F }));
            localArrayList.add(ObjectAnimator.ofFloat(localTextView, "scaleY", new float[] { 0.0F }));
            localArrayList.add(ObjectAnimator.ofFloat(localTextView, "alpha", new float[] { 0.0F }));
            localArrayList.add(ObjectAnimator.ofFloat(localTextView, "translationY", new float[] { 0.0F }));
            localArrayList.add(ObjectAnimator.ofFloat(localTextView, "translationX", new float[] { a(i) }));
          }
          localTextView = (TextView)this.c.get(i);
          if (localTextView.getAlpha() != 0.0F)
          {
            localArrayList.add(ObjectAnimator.ofFloat(localTextView, "scaleX", new float[] { 0.0F }));
            localArrayList.add(ObjectAnimator.ofFloat(localTextView, "scaleY", new float[] { 0.0F }));
            localArrayList.add(ObjectAnimator.ofFloat(localTextView, "alpha", new float[] { 0.0F }));
            localArrayList.add(ObjectAnimator.ofFloat(localTextView, "translationY", new float[] { 0.0F }));
            localArrayList.add(ObjectAnimator.ofFloat(localTextView, "translationX", new float[] { a(i) }));
          }
          i += 1;
        }
      }
      catch (Exception localException)
      {
        int j;
        while (true)
          n.a("tmessages", localException);
        if (j == 0)
          this.d.deleteCharAt(j);
        int i = 0;
        while (i < j)
        {
          localException.add(ObjectAnimator.ofFloat((TextView)this.b.get(i), "translationX", new float[] { a(i) }));
          localException.add(ObjectAnimator.ofFloat((TextView)this.c.get(i), "translationX", new float[] { a(i) }));
          i += 1;
        }
        if (this.g != null)
        {
          org.vidogram.messenger.a.b(this.g);
          this.g = null;
        }
        if (this.f != null)
          this.f.cancel();
        this.f = new AnimatorSet();
        this.f.setDuration(150L);
        this.f.playTogether(localException);
        this.f.addListener(new b()
        {
          public void onAnimationEnd(Animator paramAnimator)
          {
            if ((ae.a.d(ae.a.this) != null) && (ae.a.d(ae.a.this).equals(paramAnimator)))
              ae.a.a(ae.a.this, null);
          }
        });
        this.f.start();
      }
    }

    protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      if (this.g != null)
      {
        org.vidogram.messenger.a.b(this.g);
        this.g = null;
      }
      if (this.f != null)
      {
        this.f.cancel();
        this.f = null;
      }
      int i = 0;
      if (i < 4)
      {
        if (i < this.d.length())
        {
          TextView localTextView = (TextView)this.b.get(i);
          localTextView.setAlpha(0.0F);
          localTextView.setScaleX(1.0F);
          localTextView.setScaleY(1.0F);
          localTextView.setTranslationY(0.0F);
          localTextView.setTranslationX(a(i));
          localTextView = (TextView)this.c.get(i);
          localTextView.setAlpha(1.0F);
          localTextView.setScaleX(1.0F);
          localTextView.setScaleY(1.0F);
          localTextView.setTranslationY(0.0F);
          localTextView.setTranslationX(a(i));
        }
        while (true)
        {
          i += 1;
          break;
          ((TextView)this.b.get(i)).setAlpha(0.0F);
          ((TextView)this.c.get(i)).setAlpha(0.0F);
        }
      }
      super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    }
  }

  public static abstract interface b
  {
    public abstract void a();
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.Components.ae
 * JD-Core Version:    0.6.0
 */