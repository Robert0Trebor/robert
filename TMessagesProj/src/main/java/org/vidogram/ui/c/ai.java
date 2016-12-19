package org.vidogram.ui.c;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import org.vidogram.messenger.a;
import org.vidogram.messenger.b;
import org.vidogram.ui.Components.BackupImageView;
import org.vidogram.ui.Components.i;
import org.vidogram.ui.Components.v;

public class ai extends FrameLayout
{
  public BackupImageView a;
  public FrameLayout b;
  public i c;
  public int d;
  private AnimatorSet e;

  public ai(Context paramContext)
  {
    super(paramContext);
    this.a = new BackupImageView(paramContext);
    addView(this.a, v.a(-1, -1.0F));
    this.b = new FrameLayout(paramContext);
    addView(this.b, v.b(42, 42, 53));
    this.c = new i(paramContext, 2130837686);
    this.c.setSize(30);
    this.c.setCheckOffset(a.a(1.0F));
    this.c.setDrawBackground(true);
    this.c.setColor(-12793105);
    addView(this.c, v.a(30, 30.0F, 53, 0.0F, 4.0F, 4.0F, 0.0F));
  }

  public void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    int i = -16119286;
    float f1 = 0.85F;
    this.c.a(paramBoolean1, paramBoolean2);
    if (this.e != null)
    {
      this.e.cancel();
      this.e = null;
    }
    Object localObject1;
    float f2;
    if (paramBoolean2)
    {
      if (paramBoolean1)
        setBackgroundColor(-16119286);
      this.e = new AnimatorSet();
      localObject1 = this.e;
      Object localObject2 = this.a;
      BackupImageView localBackupImageView;
      if (paramBoolean1)
      {
        f2 = 0.85F;
        localObject2 = ObjectAnimator.ofFloat(localObject2, "scaleX", new float[] { f2 });
        localBackupImageView = this.a;
        if (!paramBoolean1)
          break label179;
      }
      while (true)
      {
        ((AnimatorSet)localObject1).playTogether(new Animator[] { localObject2, ObjectAnimator.ofFloat(localBackupImageView, "scaleY", new float[] { f1 }) });
        this.e.setDuration(200L);
        this.e.addListener(new b(paramBoolean1)
        {
          public void onAnimationCancel(Animator paramAnimator)
          {
            if ((ai.a(ai.this) != null) && (ai.a(ai.this).equals(paramAnimator)))
              ai.a(ai.this, null);
          }

          public void onAnimationEnd(Animator paramAnimator)
          {
            if ((ai.a(ai.this) != null) && (ai.a(ai.this).equals(paramAnimator)))
            {
              ai.a(ai.this, null);
              if (!this.a)
                ai.this.setBackgroundColor(0);
            }
          }
        });
        this.e.start();
        return;
        f2 = 1.0F;
        break;
        label179: f1 = 1.0F;
      }
    }
    if (paramBoolean1)
    {
      setBackgroundColor(i);
      localObject1 = this.a;
      if (!paramBoolean1)
        break label238;
      f2 = 0.85F;
      label208: ((BackupImageView)localObject1).setScaleX(f2);
      localObject1 = this.a;
      if (!paramBoolean1)
        break label244;
    }
    while (true)
    {
      ((BackupImageView)localObject1).setScaleY(f1);
      return;
      i = 0;
      break;
      label238: f2 = 1.0F;
      break label208;
      label244: f1 = 1.0F;
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.d, 1073741824), View.MeasureSpec.makeMeasureSpec(this.d, 1073741824));
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.c.ai
 * JD-Core Version:    0.6.0
 */