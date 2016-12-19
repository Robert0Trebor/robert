package org.vidogram.ui.Components.a.a;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.vidogram.messenger.a;
import org.vidogram.messenger.q;
import org.vidogram.tgnet.g.az;
import org.vidogram.tgnet.g.ia;
import org.vidogram.tgnet.g.mf;
import org.vidogram.tgnet.g.q;
import org.vidogram.tgnet.g.r;
import org.vidogram.ui.Components.ap;
import org.vidogram.ui.Components.av;
import org.vidogram.ui.Components.bf;
import org.vidogram.ui.Components.v;

public class f extends d
{
  private g.q c;
  private int d = -1;
  private boolean e = false;
  private bf f;
  private a g;
  private q h = new q();

  public f(Context paramContext, f paramf, ap paramap)
  {
    this(paramContext, paramap, paramf.getRotation(), paramf.getScale(), paramf.f, paramf.c);
    if (paramf.e)
      e();
  }

  public f(Context paramContext, ap paramap, float paramFloat1, float paramFloat2, bf parambf, g.q paramq)
  {
    super(paramContext, paramap);
    setRotation(paramFloat1);
    setScale(paramFloat2);
    this.c = paramq;
    this.f = parambf;
    int i = 0;
    while (true)
    {
      if (i < paramq.o.size())
      {
        paramap = (g.r)paramq.o.get(i);
        if (!(paramap instanceof g.ia))
          break label186;
        if (paramap.f != null)
          this.d = paramap.f.c;
      }
      this.g = new a(paramContext);
      addView(this.g, v.a(-1, -1.0F));
      this.h.c(true);
      this.h.b(true);
      this.h.a(this.g);
      this.h.a(paramq, null, paramq.i.c, null, "webp", true);
      a();
      return;
      label186: i += 1;
    }
  }

  protected void a()
  {
    float f1 = this.f.a / 2.0F;
    float f2 = this.f.b / 2.0F;
    setX(this.a.a - f1);
    setY(this.a.b - f2);
    c();
  }

  protected void a(Canvas paramCanvas)
  {
    if (this.g == null)
      return;
    paramCanvas.save();
    if (this.h.h() != null)
    {
      if (this.e)
      {
        paramCanvas.scale(-1.0F, 1.0F);
        paramCanvas.translate(-this.f.a, 0.0F);
      }
      this.h.a(0, 0, (int)this.f.a, (int)this.f.b);
      this.h.a(paramCanvas);
    }
    paramCanvas.restore();
  }

  protected d.b b()
  {
    return new b(getContext());
  }

  public void e()
  {
    if (!this.e);
    for (boolean bool = true; ; bool = false)
    {
      this.e = bool;
      this.g.invalidate();
      return;
    }
  }

  public int getAnchor()
  {
    return this.d;
  }

  protected av getSelectionBounds()
  {
    float f1 = ((ViewGroup)getParent()).getScaleX();
    float f2 = getWidth() * (getScale() + 0.4F);
    return new av((this.a.a - f2 / 2.0F) * f1, (this.a.b - f2 / 2.0F) * f1, f2 * f1, f1 * f2);
  }

  public g.q getSticker()
  {
    return this.c;
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(View.MeasureSpec.makeMeasureSpec((int)this.f.a, 1073741824), View.MeasureSpec.makeMeasureSpec((int)this.f.b, 1073741824));
  }

  private class a extends FrameLayout
  {
    public a(Context arg2)
    {
      super();
      setWillNotDraw(false);
    }

    protected void onDraw(Canvas paramCanvas)
    {
      f.this.a(paramCanvas);
    }
  }

  public class b extends d.b
  {
    private Paint f = new Paint(1);
    private RectF g = new RectF();

    public b(Context arg2)
    {
      super(localContext);
      this.f.setColor(-1);
      this.f.setStrokeWidth(a.a(1.0F));
      this.f.setStyle(Paint.Style.STROKE);
    }

    protected int a(float paramFloat1, float paramFloat2)
    {
      float f2 = a.a(1.0F);
      float f1 = a.a(19.5F);
      f2 += f1;
      float f3 = (getHeight() - f2 * 2.0F) / 2.0F + f2;
      if ((paramFloat1 > f2 - f1) && (paramFloat2 > f3 - f1) && (paramFloat1 < f2 + f1) && (paramFloat2 < f3 + f1))
        return 1;
      if ((paramFloat1 > getWidth() - f2 * 2.0F + f2 - f1) && (paramFloat2 > f3 - f1) && (paramFloat1 < f2 + (getWidth() - f2 * 2.0F) + f1) && (paramFloat2 < f3 + f1))
        return 2;
      f1 = getWidth() / 2.0F;
      if (Math.pow(paramFloat1 - f1, 2.0D) + Math.pow(paramFloat2 - f1, 2.0D) < Math.pow(f1, 2.0D))
        return 3;
      return 0;
    }

    protected void onDraw(Canvas paramCanvas)
    {
      super.onDraw(paramCanvas);
      float f2 = a.a(1.0F);
      float f1 = a.a(4.5F);
      f2 = f2 + f1 + a.a(15.0F);
      float f3 = getWidth() / 2 - f2;
      this.g.set(f2, f2, f3 * 2.0F + f2, f3 * 2.0F + f2);
      int i = 0;
      while (i < 48)
      {
        paramCanvas.drawArc(this.g, (4.0F + 4.0F) * i, 4.0F, false, this.f);
        i += 1;
      }
      paramCanvas.drawCircle(f2, f2 + f3, f1, this.b);
      paramCanvas.drawCircle(f2, f2 + f3, f1, this.c);
      paramCanvas.drawCircle(f3 * 2.0F + f2, f2 + f3, f1, this.b);
      paramCanvas.drawCircle(f3 * 2.0F + f2, f2 + f3, f1, this.c);
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.Components.a.a.f
 * JD-Core Version:    0.6.0
 */