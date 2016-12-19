package org.vidogram.ui.c;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.TextUtils.TruncateAt;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.vidogram.messenger.a;
import org.vidogram.messenger.b;
import org.vidogram.messenger.d.g;
import org.vidogram.messenger.r;
import org.vidogram.tgnet.g.az;
import org.vidogram.tgnet.g.be;
import org.vidogram.tgnet.g.bf;
import org.vidogram.tgnet.g.q;
import org.vidogram.ui.Components.BackupImageView;
import org.vidogram.ui.Components.v;

public class s extends FrameLayout
{
  private static Paint p;
  private static Paint r;
  private TextView a;
  private TextView b;
  private BackupImageView c;
  private TextView d;
  private ImageView e;
  private boolean f;
  private g.bf g;
  private Rect h = new Rect();
  private AnimatorSet i;
  private boolean j;
  private boolean k;
  private boolean l;
  private float m;
  private RectF n = new RectF();
  private long o;
  private int q;

  public s(Context paramContext)
  {
    super(paramContext);
    if (r == null)
    {
      r = new Paint();
      r.setColor(-2500135);
    }
    if (p == null)
    {
      p = new Paint(1);
      p.setColor(-1);
      p.setStrokeCap(Paint.Cap.ROUND);
      p.setStyle(Paint.Style.STROKE);
    }
    p.setStrokeWidth(a.a(2.0F));
    this.a = new TextView(paramContext);
    this.a.setTextColor(-14606047);
    this.a.setTextSize(1, 16.0F);
    this.a.setLines(1);
    this.a.setMaxLines(1);
    this.a.setSingleLine(true);
    this.a.setEllipsize(TextUtils.TruncateAt.END);
    Object localObject = this.a;
    int i1;
    label209: float f1;
    label218: float f2;
    if (r.a)
    {
      i1 = 5;
      ((TextView)localObject).setGravity(i1);
      localObject = this.a;
      if (!r.a)
        break label658;
      i1 = 5;
      if (!r.a)
        break label664;
      f1 = 100.0F;
      if (!r.a)
        break label670;
      f2 = 71.0F;
      label227: addView((View)localObject, v.a(-2, -2.0F, i1, f1, 10.0F, f2, 0.0F));
      this.b = new TextView(paramContext);
      this.b.setTextColor(-7697782);
      this.b.setTextSize(1, 13.0F);
      this.b.setLines(1);
      this.b.setMaxLines(1);
      this.b.setSingleLine(true);
      this.b.setEllipsize(TextUtils.TruncateAt.END);
      localObject = this.b;
      if (!r.a)
        break label676;
      i1 = 5;
      label327: ((TextView)localObject).setGravity(i1);
      localObject = this.b;
      if (!r.a)
        break label682;
      i1 = 5;
      label349: if (!r.a)
        break label688;
      f1 = 100.0F;
      label358: if (!r.a)
        break label694;
      f2 = 71.0F;
      label367: addView((View)localObject, v.a(-2, -2.0F, i1, f1, 35.0F, f2, 0.0F));
      this.c = new BackupImageView(paramContext);
      this.c.setAspectFit(true);
      localObject = this.c;
      if (!r.a)
        break label700;
      i1 = 5;
      label422: if (!r.a)
        break label706;
      f1 = 0.0F;
      label430: if (!r.a)
        break label712;
      f2 = 12.0F;
      label439: addView((View)localObject, v.a(48, 48.0F, i1 | 0x30, f1, 8.0F, f2, 0.0F));
      this.d = new TextView(paramContext)
      {
        protected void onDraw(Canvas paramCanvas)
        {
          super.onDraw(paramCanvas);
          long l1;
          long l2;
          if ((s.a(s.this)) || ((!s.a(s.this)) && (s.b(s.this) != 0.0F)))
          {
            s.b().setAlpha(Math.min(255, (int)(s.b(s.this) * 255.0F)));
            int i = getMeasuredWidth() - a.a(11.0F);
            s.c(s.this).set(i, a.a(3.0F), i + a.a(8.0F), a.a(11.0F));
            paramCanvas.drawArc(s.c(s.this), s.d(s.this), 220.0F, false, s.b());
            invalidate((int)s.c(s.this).left - a.a(2.0F), (int)s.c(s.this).top - a.a(2.0F), (int)s.c(s.this).right + a.a(2.0F), (int)s.c(s.this).bottom + a.a(2.0F));
            l1 = System.currentTimeMillis();
            if (Math.abs(s.e(s.this) - System.currentTimeMillis()) < 1000L)
            {
              l2 = l1 - s.e(s.this);
              float f = (float)(360L * l2) / 2000.0F;
              s.a(s.this, (int)(f + s.d(s.this)));
              s.a(s.this, s.d(s.this) - s.d(s.this) / 360 * 360);
              if (!s.a(s.this))
                break label379;
              if (s.b(s.this) < 1.0F)
              {
                paramCanvas = s.this;
                f = s.b(s.this);
                s.a(paramCanvas, (float)l2 / 200.0F + f);
                if (s.b(s.this) > 1.0F)
                  s.a(s.this, 1.0F);
              }
            }
          }
          while (true)
          {
            s.a(s.this, l1);
            invalidate();
            return;
            label379: if (s.b(s.this) <= 0.0F)
              continue;
            s.a(s.this, s.b(s.this) - (float)l2 / 200.0F);
            if (s.b(s.this) >= 0.0F)
              continue;
            s.a(s.this, 0.0F);
          }
        }
      };
      this.d.setPadding(a.a(17.0F), 0, a.a(17.0F), 0);
      this.d.setGravity(17);
      this.d.setTextColor(-1);
      this.d.setTextSize(1, 14.0F);
      this.d.setTypeface(a.a("fonts/rmedium.ttf"));
      this.d.setBackgroundResource(2130837591);
      this.d.setText(r.a("Add", 2131230811).toUpperCase());
      localObject = this.d;
      if (!r.a)
        break label717;
      i1 = i2;
      label575: if (!r.a)
        break label723;
      f1 = 14.0F;
      label584: if (!r.a)
        break label728;
      f2 = 0.0F;
    }
    while (true)
    {
      addView((View)localObject, v.a(-2, 28.0F, i1 | 0x30, f1, 18.0F, f2, 0.0F));
      this.e = new ImageView(paramContext);
      this.e.setImageResource(2130838151);
      addView(this.e, v.a(19, 14.0F));
      return;
      i1 = 3;
      break;
      label658: i1 = 3;
      break label209;
      label664: f1 = 71.0F;
      break label218;
      label670: f2 = 100.0F;
      break label227;
      label676: i1 = 3;
      break label327;
      label682: i1 = 3;
      break label349;
      label688: f1 = 71.0F;
      break label358;
      label694: f2 = 100.0F;
      break label367;
      label700: i1 = 3;
      break label422;
      label706: f1 = 12.0F;
      break label430;
      label712: f2 = 0.0F;
      break label439;
      label717: i1 = 5;
      break label575;
      label723: f1 = 0.0F;
      break label584;
      label728: f2 = 14.0F;
    }
  }

  public void a(g.bf parambf, boolean paramBoolean1, boolean paramBoolean2)
  {
    int i1;
    label44: 2 local2;
    Object localObject;
    if ((parambf == this.g) && (this.j))
    {
      i1 = 1;
      this.f = paramBoolean1;
      this.g = parambf;
      this.o = System.currentTimeMillis();
      if (this.f)
        break label468;
      paramBoolean1 = true;
      setWillNotDraw(paramBoolean1);
      if (this.i != null)
      {
        this.i.cancel();
        this.i = null;
      }
      this.a.setText(this.g.b.d);
      if (!paramBoolean2)
        break label486;
      local2 = new Drawable()
      {
        Paint a = new Paint(1);

        public void draw(Canvas paramCanvas)
        {
          this.a.setColor(-12277526);
          paramCanvas.drawCircle(a.a(4.0F), a.a(5.0F), a.a(3.0F), this.a);
        }

        public int getIntrinsicHeight()
        {
          return a.a(8.0F);
        }

        public int getIntrinsicWidth()
        {
          return a.a(12.0F);
        }

        public int getOpacity()
        {
          return 0;
        }

        public void setAlpha(int paramInt)
        {
        }

        public void setColorFilter(ColorFilter paramColorFilter)
        {
        }
      };
      TextView localTextView = this.a;
      if (!r.a)
        break label473;
      localObject = null;
      label114: if (!r.a)
        break label480;
      label120: localTextView.setCompoundDrawablesWithIntrinsicBounds((Drawable)localObject, null, local2, null);
      label131: this.b.setText(r.b("Stickers", parambf.b.k));
      if ((parambf.d == null) || (parambf.d.i == null) || (parambf.d.i.c == null))
        break label500;
      this.c.a(parambf.d.i.c, null, "webp", null);
      label203: if (i1 == 0)
        break label771;
      paramBoolean1 = this.k;
      paramBoolean2 = g.a(parambf.b.b);
      this.k = paramBoolean2;
      if (!paramBoolean2)
        break label542;
      if (!paramBoolean1)
      {
        this.e.setVisibility(0);
        this.d.setClickable(false);
        this.i = new AnimatorSet();
        this.i.setDuration(200L);
        this.i.playTogether(new Animator[] { ObjectAnimator.ofFloat(this.d, "alpha", new float[] { 1.0F, 0.0F }), ObjectAnimator.ofFloat(this.d, "scaleX", new float[] { 1.0F, 0.01F }), ObjectAnimator.ofFloat(this.d, "scaleY", new float[] { 1.0F, 0.01F }), ObjectAnimator.ofFloat(this.e, "alpha", new float[] { 0.0F, 1.0F }), ObjectAnimator.ofFloat(this.e, "scaleX", new float[] { 0.01F, 1.0F }), ObjectAnimator.ofFloat(this.e, "scaleY", new float[] { 0.01F, 1.0F }) });
        this.i.addListener(new b()
        {
          public void onAnimationCancel(Animator paramAnimator)
          {
            if ((s.f(s.this) != null) && (s.f(s.this).equals(paramAnimator)))
              s.a(s.this, null);
          }

          public void onAnimationEnd(Animator paramAnimator)
          {
            if ((s.f(s.this) != null) && (s.f(s.this).equals(paramAnimator)))
              s.g(s.this).setVisibility(4);
          }
        });
        this.i.start();
      }
    }
    label468: label473: label480: label486: label500: 
    do
    {
      return;
      i1 = 0;
      break;
      paramBoolean1 = false;
      break label44;
      localObject = local2;
      break label114;
      local2 = null;
      break label120;
      this.a.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
      break label131;
      if (parambf.c.isEmpty())
        break label203;
      this.c.a(((g.q)parambf.c.get(0)).i.c, null, "webp", null);
      break label203;
    }
    while (!paramBoolean1);
    label542: this.d.setVisibility(0);
    this.d.setClickable(true);
    this.i = new AnimatorSet();
    this.i.setDuration(200L);
    this.i.playTogether(new Animator[] { ObjectAnimator.ofFloat(this.e, "alpha", new float[] { 1.0F, 0.0F }), ObjectAnimator.ofFloat(this.e, "scaleX", new float[] { 1.0F, 0.01F }), ObjectAnimator.ofFloat(this.e, "scaleY", new float[] { 1.0F, 0.01F }), ObjectAnimator.ofFloat(this.d, "alpha", new float[] { 0.0F, 1.0F }), ObjectAnimator.ofFloat(this.d, "scaleX", new float[] { 0.01F, 1.0F }), ObjectAnimator.ofFloat(this.d, "scaleY", new float[] { 0.01F, 1.0F }) });
    this.i.addListener(new b()
    {
      public void onAnimationCancel(Animator paramAnimator)
      {
        if ((s.f(s.this) != null) && (s.f(s.this).equals(paramAnimator)))
          s.a(s.this, null);
      }

      public void onAnimationEnd(Animator paramAnimator)
      {
        if ((s.f(s.this) != null) && (s.f(s.this).equals(paramAnimator)))
          s.h(s.this).setVisibility(4);
      }
    });
    this.i.start();
    return;
    label771: paramBoolean1 = g.a(parambf.b.b);
    this.k = paramBoolean1;
    if (paramBoolean1)
    {
      this.d.setVisibility(4);
      this.d.setClickable(false);
      this.e.setVisibility(0);
      this.e.setScaleX(1.0F);
      this.e.setScaleY(1.0F);
      this.e.setAlpha(1.0F);
      return;
    }
    this.d.setVisibility(0);
    this.d.setClickable(true);
    this.e.setVisibility(4);
    this.d.setScaleX(1.0F);
    this.d.setScaleY(1.0F);
    this.d.setAlpha(1.0F);
  }

  public boolean a()
  {
    return this.k;
  }

  public g.bf getStickerSet()
  {
    return this.g;
  }

  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    this.j = false;
  }

  protected void onDraw(Canvas paramCanvas)
  {
    if (this.f)
      paramCanvas.drawLine(0.0F, getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, r);
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    paramInt1 = this.d.getLeft() + this.d.getMeasuredWidth() / 2 - this.e.getMeasuredWidth() / 2;
    paramInt2 = this.d.getTop() + this.d.getMeasuredHeight() / 2 - this.e.getMeasuredHeight() / 2;
    this.e.layout(paramInt1, paramInt2, this.e.getMeasuredWidth() + paramInt1, this.e.getMeasuredHeight() + paramInt2);
    this.j = true;
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    paramInt2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(paramInt1), 1073741824);
    int i1 = a.a(64.0F);
    if (this.f);
    for (paramInt1 = 1; ; paramInt1 = 0)
    {
      super.onMeasure(paramInt2, View.MeasureSpec.makeMeasureSpec(paramInt1 + i1, 1073741824));
      return;
    }
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if ((Build.VERSION.SDK_INT >= 21) && (getBackground() != null) && ((paramMotionEvent.getAction() == 0) || (paramMotionEvent.getAction() == 2)))
      getBackground().setHotspot(paramMotionEvent.getX(), paramMotionEvent.getY());
    return super.onTouchEvent(paramMotionEvent);
  }

  public void setAddOnClickListener(View.OnClickListener paramOnClickListener)
  {
    this.d.setOnClickListener(paramOnClickListener);
  }

  public void setDrawProgress(boolean paramBoolean)
  {
    this.l = paramBoolean;
    this.o = System.currentTimeMillis();
    this.d.invalidate();
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.c.s
 * JD-Core Version:    0.6.0
 */