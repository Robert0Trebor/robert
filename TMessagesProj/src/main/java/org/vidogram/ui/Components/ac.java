package org.vidogram.ui.Components;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import java.util.ArrayList;
import java.util.Locale;
import org.vidogram.messenger.a;
import org.vidogram.messenger.b;

public class ac extends View
{
  private ArrayList<StaticLayout> a = new ArrayList();
  private ArrayList<StaticLayout> b = new ArrayList();
  private TextPaint c = new TextPaint(1);
  private ObjectAnimator d;
  private float e = 0.0F;
  private int f = 1;

  public ac(Context paramContext)
  {
    super(paramContext);
  }

  public void a(int paramInt, boolean paramBoolean)
  {
    if ((this.f == paramInt) && (paramBoolean))
      return;
    if (this.d != null)
    {
      this.d.cancel();
      this.d = null;
    }
    this.b.clear();
    this.b.addAll(this.a);
    this.a.clear();
    String str1 = String.format(Locale.US, "%d", new Object[] { Integer.valueOf(this.f) });
    String str2 = String.format(Locale.US, "%d", new Object[] { Integer.valueOf(paramInt) });
    int i;
    label126: String str3;
    Object localObject;
    if (paramInt > this.f)
    {
      i = 1;
      this.f = paramInt;
      this.e = 0.0F;
      paramInt = 0;
      if (paramInt >= str2.length())
        break label284;
      str3 = str2.substring(paramInt, paramInt + 1);
      if ((this.b.isEmpty()) || (paramInt >= str1.length()))
        break label230;
      localObject = str1.substring(paramInt, paramInt + 1);
      label176: if ((localObject == null) || (!((String)localObject).equals(str3)))
        break label236;
      this.a.add(this.b.get(paramInt));
      this.b.set(paramInt, null);
    }
    while (true)
    {
      paramInt += 1;
      break label126;
      i = 0;
      break;
      label230: localObject = null;
      break label176;
      label236: localObject = new StaticLayout(str3, this.c, (int)Math.ceil(this.c.measureText(str3)), Layout.Alignment.ALIGN_NORMAL, 1.0F, 0.0F, false);
      this.a.add(localObject);
    }
    label284: float f1;
    if ((paramBoolean) && (!this.b.isEmpty()))
    {
      if (i == 0)
        break label365;
      f1 = -1.0F;
    }
    while (true)
    {
      this.d = ObjectAnimator.ofFloat(this, "progress", new float[] { f1, 0.0F });
      this.d.setDuration(150L);
      this.d.addListener(new b()
      {
        public void onAnimationEnd(Animator paramAnimator)
        {
          ac.a(ac.this, null);
          ac.a(ac.this).clear();
        }
      });
      this.d.start();
      invalidate();
      return;
      label365: f1 = 1.0F;
    }
  }

  public float getProgress()
  {
    return this.e;
  }

  protected void onDraw(Canvas paramCanvas)
  {
    if (this.a.isEmpty())
      return;
    float f2 = ((StaticLayout)this.a.get(0)).getHeight();
    paramCanvas.save();
    paramCanvas.translate(getPaddingLeft(), (getMeasuredHeight() - f2) / 2.0F);
    int j = Math.max(this.a.size(), this.b.size());
    int i = 0;
    if (i < j)
    {
      paramCanvas.save();
      StaticLayout localStaticLayout1;
      label110: StaticLayout localStaticLayout2;
      label136: label226: float f1;
      if (i < this.b.size())
      {
        localStaticLayout1 = (StaticLayout)this.b.get(i);
        if (i >= this.a.size())
          break label274;
        localStaticLayout2 = (StaticLayout)this.a.get(i);
        if (this.e <= 0.0F)
          break label293;
        if (localStaticLayout1 == null)
          break label280;
        this.c.setAlpha((int)(this.e * 255.0F));
        paramCanvas.save();
        paramCanvas.translate(0.0F, (this.e - 1.0F) * f2);
        localStaticLayout1.draw(paramCanvas);
        paramCanvas.restore();
        if (localStaticLayout2 != null)
        {
          this.c.setAlpha((int)((1.0F - this.e) * 255.0F));
          paramCanvas.translate(0.0F, this.e * f2);
        }
        if (localStaticLayout2 != null)
          localStaticLayout2.draw(paramCanvas);
        paramCanvas.restore();
        if (localStaticLayout2 == null)
          break label432;
        f1 = localStaticLayout2.getLineWidth(0);
      }
      while (true)
      {
        paramCanvas.translate(f1, 0.0F);
        i += 1;
        break;
        localStaticLayout1 = null;
        break label110;
        label274: localStaticLayout2 = null;
        break label136;
        label280: this.c.setAlpha(255);
        break label226;
        label293: if (this.e < 0.0F)
        {
          if (localStaticLayout1 != null)
          {
            this.c.setAlpha((int)(-this.e * 255.0F));
            paramCanvas.save();
            paramCanvas.translate(0.0F, (this.e + 1.0F) * f2);
            localStaticLayout1.draw(paramCanvas);
            paramCanvas.restore();
          }
          if (localStaticLayout2 == null)
            break label226;
          if ((i == j - 1) || (localStaticLayout1 != null))
          {
            this.c.setAlpha((int)((this.e + 1.0F) * 255.0F));
            paramCanvas.translate(0.0F, this.e * f2);
            break label226;
          }
          this.c.setAlpha(255);
          break label226;
        }
        if (localStaticLayout2 == null)
          break label226;
        this.c.setAlpha(255);
        break label226;
        label432: f1 = localStaticLayout1.getLineWidth(0) + a.a(1.0F);
      }
    }
    paramCanvas.restore();
  }

  public void setProgress(float paramFloat)
  {
    if (this.e == paramFloat)
      return;
    this.e = paramFloat;
    invalidate();
  }

  public void setTextColor(int paramInt)
  {
    this.c.setColor(paramInt);
    invalidate();
  }

  public void setTextSize(int paramInt)
  {
    this.c.setTextSize(a.a(paramInt));
    this.b.clear();
    this.a.clear();
    a(this.f, false);
  }

  public void setTypeface(Typeface paramTypeface)
  {
    this.c.setTypeface(paramTypeface);
    this.b.clear();
    this.a.clear();
    a(this.f, false);
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.Components.ac
 * JD-Core Version:    0.6.0
 */