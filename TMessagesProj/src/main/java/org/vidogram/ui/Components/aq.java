package org.vidogram.ui.Components;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View.MeasureSpec;
import android.view.ViewParent;
import java.io.File;
import java.lang.reflect.Array;
import java.util.ArrayList;
import org.vidogram.messenger.MediaController;
import org.vidogram.messenger.MediaController.e;
import org.vidogram.messenger.a;
import org.vidogram.messenger.m;
import org.vidogram.messenger.p;
import org.vidogram.messenger.u;
import org.vidogram.messenger.v;
import org.vidogram.tgnet.g.ar;
import org.vidogram.tgnet.g.aw;
import org.vidogram.tgnet.g.hu;
import org.vidogram.tgnet.g.q;
import org.vidogram.tgnet.g.r;
import org.vidogram.ui.c.e;

public class aq extends e
  implements MediaController.e, ba.a
{
  private static Drawable d;
  private static Drawable[][] e = (Drawable[][])Array.newInstance(Drawable.class, new int[] { 8, 2 });
  private static TextPaint f;
  protected u a;
  int b = 0;
  private boolean c = false;
  private ba g;
  private ar h;
  private int i;
  private int j;
  private int k = 0;
  private int l;
  private int m;
  private int n = 0;
  private StaticLayout o;
  private int p;
  private String q = null;
  private int r;

  public aq(Context paramContext)
  {
    super(paramContext);
    if (d == null)
    {
      d = getResources().getDrawable(2130837991);
      e[0][0] = getResources().getDrawable(2130838086);
      e[0][1] = getResources().getDrawable(2130838087);
      e[1][0] = getResources().getDrawable(2130838027);
      e[1][1] = getResources().getDrawable(2130838028);
      e[2][0] = getResources().getDrawable(2130837763);
      e[2][1] = getResources().getDrawable(2130837764);
      e[3][0] = getResources().getDrawable(2130837761);
      e[3][1] = getResources().getDrawable(2130837762);
      e[4][0] = getResources().getDrawable(2130838083);
      e[4][1] = getResources().getDrawable(2130838084);
      e[5][0] = getResources().getDrawable(2130838025);
      e[5][1] = getResources().getDrawable(2130838026);
      e[6][0] = getResources().getDrawable(2130837757);
      e[6][1] = getResources().getDrawable(2130837758);
      e[7][0] = getResources().getDrawable(2130837755);
      e[7][1] = getResources().getDrawable(2130837756);
      f = new TextPaint(1);
    }
    f.setTextSize(a.a(16.0F));
    this.r = MediaController.a().g();
    this.g = new ba(getContext());
    this.g.a(this);
    this.h = new ar();
  }

  private void g()
  {
    if (this.k == 0)
    {
      boolean bool = MediaController.a().a(this.a);
      if ((!this.a.j()) && (this.a.n()) && (this.a.a.d.b == 0))
      {
        v.a().a(this.a);
        this.a.p();
      }
      if (bool)
      {
        this.k = 1;
        invalidate();
      }
    }
    do
    {
      while (true)
      {
        return;
        if (this.k != 1)
          break;
        if (!MediaController.a().b(this.a))
          continue;
        this.k = 0;
        invalidate();
        return;
      }
      if (this.k != 2)
        continue;
      m.a().a(this.a.A(), true, false);
      this.k = 3;
      invalidate();
      return;
    }
    while (this.k != 3);
    m.a().a(this.a.A());
    this.k = 2;
    invalidate();
  }

  public void a(float paramFloat)
  {
    if (this.a == null)
      return;
    this.a.k = paramFloat;
    MediaController.a().a(this.a, paramFloat);
  }

  public void a(String paramString)
  {
    f();
  }

  public void a(String paramString, float paramFloat)
  {
    this.h.a(paramFloat);
    if (this.k != 3)
      f();
    invalidate();
  }

  public void a(String paramString, float paramFloat, boolean paramBoolean)
  {
  }

  public void b(String paramString)
  {
    f();
  }

  public void d()
  {
    if (this.a == null)
      return;
    if (!this.g.a())
      this.g.a(this.a.k);
    int i1;
    Object localObject;
    if (!MediaController.a().d(this.a))
    {
      i1 = 0;
      if (i1 >= this.a.A().o.size())
        break label213;
      localObject = (g.r)this.a.A().o.get(i1);
      if ((localObject instanceof g.hu))
        i1 = ((g.r)localObject).d;
    }
    while (true)
    {
      localObject = String.format("%02d:%02d", new Object[] { Integer.valueOf(i1 / 60), Integer.valueOf(i1 % 60) });
      if ((this.q == null) || ((this.q != null) && (!this.q.equals(localObject))))
      {
        this.b = (int)Math.ceil(f.measureText((String)localObject));
        this.o = new StaticLayout((CharSequence)localObject, f, this.b, Layout.Alignment.ALIGN_NORMAL, 1.0F, 0.0F, false);
      }
      invalidate();
      return;
      i1 += 1;
      break;
      i1 = this.a.l;
      continue;
      label213: i1 = 0;
    }
  }

  public void e()
  {
    if (this.k == 2)
    {
      m.a().a(this.a.A(), true, false);
      this.k = 3;
      invalidate();
    }
  }

  public void f()
  {
    Object localObject = this.a.f();
    if (m.b(this.a.a).exists())
    {
      MediaController.a().a(this);
      boolean bool = MediaController.a().d(this.a);
      if ((!bool) || ((bool) && (MediaController.a().s())))
      {
        this.k = 0;
        this.h.a(0.0F);
      }
    }
    while (true)
    {
      d();
      return;
      this.k = 1;
      break;
      MediaController.a().a((String)localObject, this);
      if (!m.a().a((String)localObject))
      {
        this.k = 2;
        this.h.a(0.0F);
        continue;
      }
      this.k = 3;
      localObject = p.a().a((String)localObject);
      if (localObject != null)
      {
        this.h.a(((Float)localObject).floatValue());
        continue;
      }
      this.h.a(0.0F);
    }
  }

  public final u getMessageObject()
  {
    return this.a;
  }

  public int getObserverTag()
  {
    return this.r;
  }

  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    MediaController.a().a(this);
  }

  protected void onDraw(Canvas paramCanvas)
  {
    if (this.a == null);
    do
    {
      return;
      if (!this.c)
      {
        requestLayout();
        return;
      }
      a(d, 0, 0, getMeasuredWidth(), getMeasuredHeight());
      d.draw(paramCanvas);
    }
    while (this.a == null);
    paramCanvas.save();
    if ((this.k == 0) || (this.k == 1))
    {
      paramCanvas.translate(this.i, this.j);
      this.g.a(paramCanvas);
    }
    while (true)
    {
      paramCanvas.restore();
      int i1 = this.k;
      f.setColor(-6182221);
      Drawable localDrawable = e[(i1 + 4)][this.n];
      int i2 = a.a(36.0F);
      i1 = (i2 - localDrawable.getIntrinsicWidth()) / 2;
      i2 = (i2 - localDrawable.getIntrinsicHeight()) / 2;
      a(localDrawable, i1 + this.l, i2 + this.m);
      localDrawable.draw(paramCanvas);
      paramCanvas.save();
      paramCanvas.translate(this.p, a.a(18.0F));
      this.o.draw(paramCanvas);
      paramCanvas.restore();
      return;
      paramCanvas.translate(this.i + a.a(12.0F), this.j);
      this.h.a(paramCanvas);
    }
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (this.a == null)
      super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    do
    {
      return;
      this.i = a.a(54.0F);
      this.l = a.a(10.0F);
      this.p = (getMeasuredWidth() - this.b - a.a(16.0F));
      this.g.a(getMeasuredWidth() - a.a(70.0F) - this.b, a.a(30.0F));
      this.h.b = (getMeasuredWidth() - a.a(94.0F) - this.b);
      this.h.c = a.a(30.0F);
      this.j = a.a(13.0F);
      this.m = a.a(10.0F);
      d();
    }
    while ((!paramBoolean) && (this.c));
    this.c = true;
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    setMeasuredDimension(View.MeasureSpec.getSize(paramInt1), a.a(56.0F));
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    float f1 = paramMotionEvent.getX();
    float f2 = paramMotionEvent.getY();
    boolean bool2 = this.g.a(paramMotionEvent.getAction(), paramMotionEvent.getX() - this.i, paramMotionEvent.getY() - this.j);
    if (bool2)
    {
      if (paramMotionEvent.getAction() == 0)
        getParent().requestDisallowInterceptTouchEvent(true);
      invalidate();
      return bool2;
    }
    int i1 = a.a(36.0F);
    boolean bool1;
    if (paramMotionEvent.getAction() == 0)
    {
      bool1 = bool2;
      if (f1 >= this.l)
      {
        bool1 = bool2;
        if (f1 <= this.l + i1)
        {
          bool1 = bool2;
          if (f2 >= this.m)
          {
            bool1 = bool2;
            if (f2 <= this.m + i1)
            {
              this.n = 1;
              invalidate();
              bool1 = true;
            }
          }
        }
      }
    }
    while (true)
    {
      bool2 = bool1;
      if (bool1)
        break;
      return super.onTouchEvent(paramMotionEvent);
      bool1 = bool2;
      if (this.n != 1)
        continue;
      if (paramMotionEvent.getAction() == 1)
      {
        this.n = 0;
        playSoundEffect(0);
        g();
        invalidate();
        bool1 = bool2;
        continue;
      }
      if (paramMotionEvent.getAction() == 3)
      {
        this.n = 0;
        invalidate();
        bool1 = bool2;
        continue;
      }
      bool1 = bool2;
      if (paramMotionEvent.getAction() != 2)
        continue;
      if ((f1 >= this.l) && (f1 <= this.l + i1) && (f2 >= this.m))
      {
        bool1 = bool2;
        if (f2 <= this.m + i1)
          continue;
      }
      this.n = 0;
      invalidate();
      bool1 = bool2;
    }
  }

  public void setMessageObject(u paramu)
  {
    if (this.a != paramu)
    {
      this.g.a(-1774864, -9259544, -4399384);
      this.h.a(-2497813, -7944712);
      this.a = paramu;
      this.c = false;
      requestLayout();
    }
    f();
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.Components.aq
 * JD-Core Version:    0.6.0
 */