package org.vidogram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.SpannableStringBuilder;
import android.text.TextUtils.TruncateAt;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.TextView;
import org.vidogram.messenger.MediaController;
import org.vidogram.messenger.a;
import org.vidogram.messenger.u;
import org.vidogram.messenger.y;
import org.vidogram.messenger.y.b;
import org.vidogram.ui.a.g;

public class ao extends FrameLayout
  implements y.b
{
  private ImageView a;
  private TextView b;
  private u c;
  private AnimatorSet d;
  private float e;
  private g f;
  private float g;
  private boolean h;

  public ao(Context paramContext, g paramg)
  {
    super(paramContext);
    this.f = paramg;
    this.h = true;
    ((ViewGroup)this.f.a()).setClipToPadding(false);
    setTag(Integer.valueOf(1));
    paramg = new FrameLayout(paramContext);
    paramg.setBackgroundColor(-1);
    addView(paramg, v.a(-1, 36.0F, 51, 0.0F, 0.0F, 0.0F, 0.0F));
    paramg = new View(paramContext);
    paramg.setBackgroundResource(2130837787);
    addView(paramg, v.a(-1, 3.0F, 51, 0.0F, 36.0F, 0.0F, 0.0F));
    this.a = new ImageView(paramContext);
    this.a.setScaleType(ImageView.ScaleType.CENTER);
    addView(this.a, v.a(36, 36.0F, 51, 0.0F, 0.0F, 0.0F, 0.0F));
    this.a.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramView)
      {
        if (MediaController.a().s())
        {
          MediaController.a().a(MediaController.a().j());
          return;
        }
        MediaController.a().b(MediaController.a().j());
      }
    });
    this.b = new TextView(paramContext);
    this.b.setTextColor(-13683656);
    this.b.setMaxLines(1);
    this.b.setLines(1);
    this.b.setSingleLine(true);
    this.b.setEllipsize(TextUtils.TruncateAt.END);
    this.b.setTextSize(1, 15.0F);
    this.b.setGravity(19);
    addView(this.b, v.a(-1, 36.0F, 51, 35.0F, 0.0F, 36.0F, 0.0F));
    paramContext = new ImageView(paramContext);
    paramContext.setImageResource(2130837979);
    paramContext.setScaleType(ImageView.ScaleType.CENTER);
    addView(paramContext, v.b(36, 36, 53));
    paramContext.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramView)
      {
        MediaController.a().a(true, true);
      }
    });
    setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramView)
      {
        paramView = MediaController.a().j();
        if ((paramView != null) && (paramView.G()) && (ao.a(ao.this) != null))
          ao.a(ao.this).a(new org.vidogram.ui.b());
      }
    });
  }

  private void a(boolean paramBoolean)
  {
    u localu = MediaController.a().j();
    Object localObject = this.f.a();
    boolean bool = paramBoolean;
    if (!paramBoolean)
    {
      bool = paramBoolean;
      if (localObject != null)
        if (((View)localObject).getParent() != null)
        {
          bool = paramBoolean;
          if (((View)((View)localObject).getParent()).getVisibility() == 0);
        }
        else
        {
          bool = true;
        }
    }
    if ((localu == null) || (localu.q() == 0))
    {
      this.c = null;
      if (this.h)
      {
        this.h = false;
        if (bool)
        {
          if (getVisibility() != 8)
            setVisibility(8);
          setTopPadding(0.0F);
        }
      }
      else
      {
        return;
      }
      if (this.d != null)
      {
        this.d.cancel();
        this.d = null;
      }
      this.d = new AnimatorSet();
      this.d.playTogether(new Animator[] { ObjectAnimator.ofFloat(this, "translationY", new float[] { -a.a(36.0F) }), ObjectAnimator.ofFloat(this, "topPadding", new float[] { 0.0F }) });
      this.d.setDuration(200L);
      this.d.addListener(new org.vidogram.messenger.b()
      {
        public void onAnimationEnd(Animator paramAnimator)
        {
          if ((ao.b(ao.this) != null) && (ao.b(ao.this).equals(paramAnimator)))
          {
            ao.this.setVisibility(8);
            ao.a(ao.this, null);
          }
        }
      });
      this.d.start();
      return;
    }
    if ((bool) && (this.g == 0.0F))
    {
      setTopPadding(a.a(36.0F));
      setTranslationY(0.0F);
      this.e = 0.0F;
    }
    if (!this.h)
    {
      if (!bool)
      {
        if (this.d != null)
        {
          this.d.cancel();
          this.d = null;
        }
        this.d = new AnimatorSet();
        this.d.playTogether(new Animator[] { ObjectAnimator.ofFloat(this, "translationY", new float[] { -a.a(36.0F), 0.0F }), ObjectAnimator.ofFloat(this, "topPadding", new float[] { a.a(36.0F) }) });
        this.d.setDuration(200L);
        this.d.addListener(new org.vidogram.messenger.b()
        {
          public void onAnimationEnd(Animator paramAnimator)
          {
            if ((ao.b(ao.this) != null) && (ao.b(ao.this).equals(paramAnimator)))
              ao.a(ao.this, null);
          }
        });
        this.d.start();
      }
      this.h = true;
      setVisibility(0);
    }
    if (MediaController.a().s())
    {
      this.a.setImageResource(2130837981);
      label413: if (this.c == localu)
        break label532;
      this.c = localu;
      if (!this.c.H())
        break label534;
      localObject = new SpannableStringBuilder(String.format("%s %s", new Object[] { localu.Q(), localu.O() }));
      this.b.setEllipsize(TextUtils.TruncateAt.MIDDLE);
    }
    while (true)
    {
      ((SpannableStringBuilder)localObject).setSpan(new bo(a.a("fonts/rmedium.ttf"), 0, -13683656), 0, localu.Q().length(), 18);
      this.b.setText((CharSequence)localObject);
      return;
      this.a.setImageResource(2130837980);
      break label413;
      label532: break;
      label534: localObject = new SpannableStringBuilder(String.format("%s - %s", new Object[] { localu.Q(), localu.O() }));
      this.b.setEllipsize(TextUtils.TruncateAt.END);
    }
  }

  public void a(int paramInt, Object[] paramArrayOfObject)
  {
    if ((paramInt == y.aO) || (paramInt == y.aG) || (paramInt == y.aF))
      a(false);
  }

  protected boolean drawChild(Canvas paramCanvas, View paramView, long paramLong)
  {
    int i = paramCanvas.save();
    if (this.e < 0.0F)
      paramCanvas.clipRect(0, (int)(-this.e), paramView.getMeasuredWidth(), a.a(39.0F));
    boolean bool = super.drawChild(paramCanvas, paramView, paramLong);
    paramCanvas.restoreToCount(i);
    return bool;
  }

  public float getTopPadding()
  {
    return this.g;
  }

  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    y.a().a(this, y.aF);
    y.a().a(this, y.aG);
    y.a().a(this, y.aO);
    a(true);
  }

  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    this.g = 0.0F;
    y.a().b(this, y.aF);
    y.a().b(this, y.aG);
    y.a().b(this, y.aO);
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, a.a(39.0F));
  }

  public void setTopPadding(float paramFloat)
  {
    this.g = paramFloat;
    if (this.f != null)
    {
      View localView = this.f.a();
      if (localView != null)
        localView.setPadding(0, (int)this.g, 0, 0);
    }
  }

  public void setTranslationY(float paramFloat)
  {
    super.setTranslationY(paramFloat);
    this.e = paramFloat;
    invalidate();
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.Components.ao
 * JD-Core Version:    0.6.0
 */