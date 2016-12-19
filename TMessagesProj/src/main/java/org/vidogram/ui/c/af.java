package org.vidogram.ui.c;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewParent;
import android.widget.FrameLayout;
import org.vidogram.messenger.MediaController.i;
import org.vidogram.messenger.a;
import org.vidogram.messenger.q;
import org.vidogram.ui.Components.BackupImageView;
import org.vidogram.ui.Components.i;
import org.vidogram.ui.Components.v;
import org.vidogram.ui.am;

public class af extends FrameLayout
{
  private static Rect f = new Rect();
  private BackupImageView a;
  private FrameLayout b;
  private i c;
  private boolean d;
  private boolean e;
  private a g;
  private MediaController.i h;

  public af(Context paramContext)
  {
    super(paramContext);
    this.a = new BackupImageView(paramContext);
    addView(this.a, v.a(80, 80.0F));
    this.b = new FrameLayout(paramContext);
    addView(this.b, v.a(42, 42.0F, 51, 38.0F, 0.0F, 0.0F, 0.0F));
    this.c = new i(paramContext, 2130837686);
    this.c.setSize(30);
    this.c.setCheckOffset(a.a(1.0F));
    this.c.setDrawBackground(true);
    this.c.setColor(-12793105);
    addView(this.c, v.a(30, 30.0F, 51, 46.0F, 4.0F, 0.0F, 0.0F));
    this.c.setVisibility(0);
  }

  public void a(MediaController.i parami, boolean paramBoolean)
  {
    int i = 0;
    this.e = false;
    this.h = parami;
    this.d = paramBoolean;
    boolean bool;
    if (this.h.f != null)
    {
      this.a.a(this.h.f, null, getResources().getDrawable(2130838008));
      bool = am.a().a(this.h.d);
      parami = this.a.getImageReceiver();
      if (bool)
        break label206;
    }
    label206: for (paramBoolean = true; ; paramBoolean = false)
    {
      parami.a(paramBoolean, true);
      parami = this.c;
      if (bool)
        i = 4;
      parami.setVisibility(i);
      requestLayout();
      return;
      if (this.h.d != null)
      {
        this.a.a(this.h.e, true);
        this.a.a("thumb://" + this.h.b + ":" + this.h.d, null, getResources().getDrawable(2130838008));
        break;
      }
      this.a.setImageResource(2130838008);
      break;
    }
  }

  public void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    this.c.a(paramBoolean1, paramBoolean2);
  }

  public i getCheckBox()
  {
    return this.c;
  }

  public BackupImageView getImageView()
  {
    return this.a;
  }

  public MediaController.i getPhotoEntry()
  {
    return this.h;
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    if (this.d);
    for (paramInt1 = 0; ; paramInt1 = 6)
    {
      super.onMeasure(View.MeasureSpec.makeMeasureSpec(a.a(paramInt1 + 80), 1073741824), View.MeasureSpec.makeMeasureSpec(a.a(80.0F), 1073741824));
      return;
    }
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool1 = true;
    this.b.getHitRect(f);
    if (paramMotionEvent.getAction() == 0)
    {
      if (!f.contains((int)paramMotionEvent.getX(), (int)paramMotionEvent.getY()))
        break label173;
      this.e = true;
      invalidate();
    }
    while (true)
    {
      boolean bool2 = bool1;
      if (!bool1)
        bool2 = super.onTouchEvent(paramMotionEvent);
      return bool2;
      if (this.e)
      {
        if (paramMotionEvent.getAction() == 1)
        {
          getParent().requestDisallowInterceptTouchEvent(true);
          this.e = false;
          playSoundEffect(0);
          this.g.a(this);
          invalidate();
          bool1 = false;
          continue;
        }
        if (paramMotionEvent.getAction() == 3)
        {
          this.e = false;
          invalidate();
          bool1 = false;
          continue;
        }
        if ((paramMotionEvent.getAction() == 2) && (!f.contains((int)paramMotionEvent.getX(), (int)paramMotionEvent.getY())))
        {
          this.e = false;
          invalidate();
        }
      }
      label173: bool1 = false;
    }
  }

  public void setDelegate(a parama)
  {
    this.g = parama;
  }

  public void setOnCheckClickLisnener(View.OnClickListener paramOnClickListener)
  {
    this.b.setOnClickListener(paramOnClickListener);
  }

  public static abstract interface a
  {
    public abstract void a(af paramaf);
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.c.af
 * JD-Core Version:    0.6.0
 */