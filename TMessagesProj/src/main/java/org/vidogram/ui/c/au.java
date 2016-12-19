package org.vidogram.ui.c;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build.VERSION;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.vidogram.messenger.ApplicationLoader;
import org.vidogram.messenger.a;
import org.vidogram.messenger.b;
import org.vidogram.messenger.m;
import org.vidogram.messenger.q;
import org.vidogram.messenger.u;
import org.vidogram.tgnet.g.ar;
import org.vidogram.tgnet.g.au;
import org.vidogram.tgnet.g.az;
import org.vidogram.tgnet.g.ie;
import org.vidogram.tgnet.g.ob;
import org.vidogram.tgnet.g.q;
import org.vidogram.tgnet.g.r;
import org.vidogram.ui.Components.BackupImageView;
import org.vidogram.ui.Components.i;
import org.vidogram.ui.Components.v;
import org.vidogram.ui.am;

public class au extends FrameLayout
{
  private a[] a = new a[6];
  private u[] b = new u[6];
  private int[] c = new int[6];
  private b d;
  private int e;
  private boolean f;

  public au(Context paramContext)
  {
    super(paramContext);
    int i = 0;
    while (i < 6)
    {
      this.a[i] = new a(paramContext);
      addView(this.a[i]);
      this.a[i].setVisibility(4);
      this.a[i].setTag(Integer.valueOf(i));
      this.a[i].setOnClickListener(new View.OnClickListener()
      {
        public void onClick(View paramView)
        {
          if (au.a(au.this) != null)
          {
            int i = ((Integer)paramView.getTag()).intValue();
            au.a(au.this).a(au.this, au.b(au.this)[i], au.c(au.this)[i], i);
          }
        }
      });
      this.a[i].setOnLongClickListener(new View.OnLongClickListener()
      {
        public boolean onLongClick(View paramView)
        {
          if (au.a(au.this) != null)
          {
            int i = ((Integer)paramView.getTag()).intValue();
            return au.a(au.this).b(au.this, au.b(au.this)[i], au.c(au.this)[i], i);
          }
          return false;
        }
      });
      i += 1;
    }
  }

  public BackupImageView a(int paramInt)
  {
    if (paramInt >= this.e)
      return null;
    return a.b(this.a[paramInt]);
  }

  public void a(int paramInt1, int paramInt2, u paramu)
  {
    this.b[paramInt1] = paramu;
    this.c[paramInt1] = paramInt2;
    a locala;
    Object localObject;
    boolean bool;
    if (paramu != null)
    {
      this.a[paramInt1].setVisibility(0);
      locala = this.a[paramInt1];
      a.b(locala).getImageReceiver().a(paramu);
      localObject = a.b(locala).getImageReceiver();
      if (!am.a().a(paramu))
      {
        bool = true;
        ((q)localObject).a(bool, false);
        if (!paramu.I())
          break label256;
        a.c(locala).setVisibility(0);
        paramInt1 = 0;
        label97: if (paramInt1 >= paramu.A().o.size())
          break label390;
        localObject = (g.r)paramu.A().o.get(paramInt1);
        if (!(localObject instanceof g.ie))
          break label238;
      }
    }
    label256: label390: for (paramInt1 = ((g.r)localObject).d; ; paramInt1 = 0)
    {
      paramInt2 = paramInt1 / 60;
      a.d(locala).setText(String.format("%d:%02d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt1 - paramInt2 * 60) }));
      if (paramu.A().i != null)
      {
        paramu = paramu.A().i.c;
        a.b(locala).a(null, null, null, ApplicationLoader.a.getResources().getDrawable(2130838039), null, paramu, "b", null, 0);
        return;
        bool = false;
        break;
        label238: paramInt1 += 1;
        break label97;
      }
      a.b(locala).setImageResource(2130838039);
      return;
      if (((paramu.a.j instanceof g.ob)) && (paramu.a.j.d != null) && (!paramu.m.isEmpty()))
      {
        a.c(locala).setVisibility(4);
        paramu = m.a(paramu.m, 80);
        a.b(locala).a(null, null, null, ApplicationLoader.a.getResources().getDrawable(2130838039), null, paramu.c, "b", null, 0);
        return;
      }
      a.c(locala).setVisibility(4);
      a.b(locala).setImageResource(2130838039);
      return;
      this.a[paramInt1].clearAnimation();
      this.a[paramInt1].setVisibility(4);
      this.b[paramInt1] = null;
      return;
    }
  }

  public void a(int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.a[paramInt].a(paramBoolean1, paramBoolean2);
  }

  public u b(int paramInt)
  {
    if (paramInt >= this.e)
      return null;
    return this.b[paramInt];
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int k = 0;
    label35: FrameLayout.LayoutParams localLayoutParams;
    if (a.c())
    {
      paramInt2 = (a.a(490.0F) - (this.e + 1) * a.a(4.0F)) / this.e;
      i = 0;
      if (i >= this.e)
        break label169;
      localLayoutParams = (FrameLayout.LayoutParams)this.a[i].getLayoutParams();
      if (!this.f)
        break label159;
    }
    label159: for (int j = 0; ; j = a.a(4.0F))
    {
      localLayoutParams.topMargin = j;
      localLayoutParams.leftMargin = ((a.a(4.0F) + paramInt2) * i + a.a(4.0F));
      localLayoutParams.width = paramInt2;
      localLayoutParams.height = paramInt2;
      localLayoutParams.gravity = 51;
      this.a[i].setLayoutParams(localLayoutParams);
      i += 1;
      break label35;
      paramInt2 = (a.c.x - (this.e + 1) * a.a(4.0F)) / this.e;
      break;
    }
    label169: if (this.f);
    for (int i = k; ; i = a.a(4.0F))
    {
      super.onMeasure(paramInt1, View.MeasureSpec.makeMeasureSpec(i + paramInt2, 1073741824));
      return;
    }
  }

  public void setDelegate(b paramb)
  {
    this.d = paramb;
  }

  public void setIsFirst(boolean paramBoolean)
  {
    this.f = paramBoolean;
  }

  public void setItemsCount(int paramInt)
  {
    int i = 0;
    if (i < this.a.length)
    {
      this.a[i].clearAnimation();
      a locala = this.a[i];
      if (i < paramInt);
      for (int j = 0; ; j = 4)
      {
        locala.setVisibility(j);
        i += 1;
        break;
      }
    }
    this.e = paramInt;
  }

  private class a extends FrameLayout
  {
    private BackupImageView b;
    private TextView c;
    private LinearLayout d;
    private View e;
    private i f;
    private FrameLayout g;
    private AnimatorSet h;

    public a(Context arg2)
    {
      super();
      this.g = new FrameLayout(localContext);
      addView(this.g, v.a(-1, -1.0F));
      this.b = new BackupImageView(localContext);
      this.b.getImageReceiver().e(true);
      this.b.getImageReceiver().f(true);
      this.g.addView(this.b, v.a(-1, -1.0F));
      this.d = new LinearLayout(localContext);
      this.d.setOrientation(0);
      this.d.setBackgroundResource(2130838063);
      this.d.setPadding(a.a(3.0F), 0, a.a(3.0F), 0);
      this.d.setGravity(16);
      this.g.addView(this.d, v.b(-1, 16, 83));
      this$1 = new ImageView(localContext);
      au.this.setImageResource(2130837911);
      this.d.addView(au.this, v.b(-2, -2));
      this.c = new TextView(localContext);
      this.c.setTextColor(-1);
      this.c.setTextSize(1, 12.0F);
      this.c.setGravity(16);
      this.d.addView(this.c, v.b(-2, -2, 16, 4, 0, 0, 1));
      this.e = new View(localContext);
      this.e.setBackgroundResource(2130837946);
      addView(this.e, v.a(-1, -1.0F));
      this.f = new i(localContext, 2130838112);
      this.f.setVisibility(4);
      addView(this.f, v.a(22, 22.0F, 53, 0.0F, 2.0F, 2.0F, 0.0F));
    }

    public void a(boolean paramBoolean1, boolean paramBoolean2)
    {
      int i = -657931;
      float f1 = 0.85F;
      if (this.f.getVisibility() != 0)
        this.f.setVisibility(0);
      this.f.a(paramBoolean1, paramBoolean2);
      if (this.h != null)
      {
        this.h.cancel();
        this.h = null;
      }
      Object localObject1;
      float f2;
      if (paramBoolean2)
      {
        if (paramBoolean1)
          setBackgroundColor(-657931);
        this.h = new AnimatorSet();
        localObject1 = this.h;
        Object localObject2 = this.g;
        FrameLayout localFrameLayout;
        if (paramBoolean1)
        {
          f2 = 0.85F;
          localObject2 = ObjectAnimator.ofFloat(localObject2, "scaleX", new float[] { f2 });
          localFrameLayout = this.g;
          if (!paramBoolean1)
            break label197;
        }
        while (true)
        {
          ((AnimatorSet)localObject1).playTogether(new Animator[] { localObject2, ObjectAnimator.ofFloat(localFrameLayout, "scaleY", new float[] { f1 }) });
          this.h.setDuration(200L);
          this.h.addListener(new b(paramBoolean1)
          {
            public void onAnimationCancel(Animator paramAnimator)
            {
              if ((au.a.a(au.a.this) != null) && (au.a.a(au.a.this).equals(paramAnimator)))
                au.a.a(au.a.this, null);
            }

            public void onAnimationEnd(Animator paramAnimator)
            {
              if ((au.a.a(au.a.this) != null) && (au.a.a(au.a.this).equals(paramAnimator)))
              {
                au.a.a(au.a.this, null);
                if (!this.a)
                  au.a.this.setBackgroundColor(0);
              }
            }
          });
          this.h.start();
          return;
          f2 = 1.0F;
          break;
          label197: f1 = 1.0F;
        }
      }
      if (paramBoolean1)
      {
        setBackgroundColor(i);
        localObject1 = this.g;
        if (!paramBoolean1)
          break label256;
        f2 = 0.85F;
        label226: ((FrameLayout)localObject1).setScaleX(f2);
        localObject1 = this.g;
        if (!paramBoolean1)
          break label262;
      }
      while (true)
      {
        ((FrameLayout)localObject1).setScaleY(f1);
        return;
        i = 0;
        break;
        label256: f2 = 1.0F;
        break label226;
        label262: f1 = 1.0F;
      }
    }

    public void clearAnimation()
    {
      super.clearAnimation();
      if (this.h != null)
      {
        this.h.cancel();
        this.h = null;
      }
    }

    public boolean onTouchEvent(MotionEvent paramMotionEvent)
    {
      if (Build.VERSION.SDK_INT >= 21)
        this.e.drawableHotspotChanged(paramMotionEvent.getX(), paramMotionEvent.getY());
      return super.onTouchEvent(paramMotionEvent);
    }
  }

  public static abstract interface b
  {
    public abstract void a(au paramau, int paramInt1, u paramu, int paramInt2);

    public abstract boolean b(au paramau, int paramInt1, u paramu, int paramInt2);
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.c.au
 * JD-Core Version:    0.6.0
 */