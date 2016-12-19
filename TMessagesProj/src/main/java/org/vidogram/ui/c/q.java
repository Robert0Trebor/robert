package org.vidogram.ui.c;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.TextUtils.TruncateAt;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.TextView;
import org.vidogram.messenger.ApplicationLoader;
import org.vidogram.messenger.a;
import org.vidogram.messenger.ae;
import org.vidogram.messenger.n;
import org.vidogram.tgnet.g.vw;
import org.vidogram.tgnet.g.vx;
import org.vidogram.tgnet.g.x;
import org.vidogram.ui.Components.BackupImageView;
import org.vidogram.ui.Components.v;
import org.vidogram.ui.a.l;

public class q extends FrameLayout
{
  private BackupImageView a;
  private TextView b;
  private TextView c;
  private ImageView d;
  private a e;
  private Rect f = new Rect();
  private Rect g = new Rect();
  private Paint h = new Paint();
  private int i;

  public q(Context paramContext)
  {
    super(paramContext);
    setBackgroundColor(l.b);
    this.d = new ImageView(paramContext);
    this.d.setVisibility(4);
    this.d.setScaleType(ImageView.ScaleType.FIT_XY);
    this.d.setImageResource(2130837661);
    addView(this.d, v.b(-1, 70, 83));
    this.a = new BackupImageView(paramContext);
    this.a.getImageReceiver().a(a.a(32.0F));
    addView(this.a, v.a(64, 64.0F, 83, 16.0F, 0.0F, 0.0F, 67.0F));
    this.b = new TextView(paramContext);
    this.b.setTextColor(-1);
    this.b.setTextSize(1, 15.0F);
    this.b.setTypeface(a.a("fonts/rmedium.ttf"));
    this.b.setLines(1);
    this.b.setMaxLines(1);
    this.b.setSingleLine(true);
    this.b.setGravity(3);
    this.b.setEllipsize(TextUtils.TruncateAt.END);
    addView(this.b, v.a(-1, -2.0F, 83, 16.0F, 0.0F, 76.0F, 28.0F));
    this.c = new TextView(paramContext);
    this.c.setTextColor(-4004353);
    this.c.setTextSize(1, 13.0F);
    this.c.setLines(1);
    this.c.setMaxLines(1);
    this.c.setSingleLine(true);
    this.c.setGravity(3);
    addView(this.c, v.a(-1, -2.0F, 83, 16.0F, 0.0F, 76.0F, 9.0F));
    this.e = new a(paramContext);
    addView(this.e, v.b(61, 61, 85));
  }

  public void invalidate()
  {
    super.invalidate();
    this.e.invalidate();
  }

  protected void onDraw(Canvas paramCanvas)
  {
    Object localObject = ApplicationLoader.g();
    int j = ApplicationLoader.d();
    if (this.i != j)
    {
      this.i = j;
      this.d.getDrawable().setColorFilter(new PorterDuffColorFilter(j | 0xFF000000, PorterDuff.Mode.MULTIPLY));
    }
    if ((ApplicationLoader.b()) && (localObject != null))
    {
      this.c.setTextColor(-1);
      this.d.setVisibility(0);
      if ((localObject instanceof ColorDrawable))
      {
        ((Drawable)localObject).setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
        ((Drawable)localObject).draw(paramCanvas);
      }
      do
        return;
      while (!(localObject instanceof BitmapDrawable));
      localObject = ((BitmapDrawable)localObject).getBitmap();
      float f1 = getMeasuredWidth() / ((Bitmap)localObject).getWidth();
      float f2 = getMeasuredHeight() / ((Bitmap)localObject).getHeight();
      if (f1 < f2)
        f1 = f2;
      while (true)
      {
        j = (int)(getMeasuredWidth() / f1);
        int k = (int)(getMeasuredHeight() / f1);
        int m = (((Bitmap)localObject).getWidth() - j) / 2;
        int n = (((Bitmap)localObject).getHeight() - k) / 2;
        this.f.set(m, n, j + m, k + n);
        this.g.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
        paramCanvas.drawBitmap((Bitmap)localObject, this.f, this.g, this.h);
        return;
      }
    }
    this.d.setVisibility(4);
    this.c.setTextColor(-4004353);
    super.onDraw(paramCanvas);
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    if (Build.VERSION.SDK_INT >= 21)
    {
      super.onMeasure(paramInt1, View.MeasureSpec.makeMeasureSpec(a.a(148.0F) + a.a, 1073741824));
      return;
    }
    try
    {
      super.onMeasure(paramInt1, View.MeasureSpec.makeMeasureSpec(a.a(148.0F), 1073741824));
      return;
    }
    catch (Exception localException)
    {
      setMeasuredDimension(View.MeasureSpec.getSize(paramInt1), a.a(148.0F));
      n.a("tmessages", localException);
    }
  }

  public void setUser(g.vw paramvw)
  {
    if (paramvw == null)
      return;
    g.x localx = null;
    if (paramvw.j != null)
      localx = paramvw.j.e;
    this.b.setText(ae.c(paramvw));
    this.c.setText(org.vidogram.a.b.a().e("+" + paramvw.i));
    paramvw = new org.vidogram.ui.Components.b(paramvw);
    paramvw.h(-11500111);
    this.a.a(localx, "50_50", paramvw);
  }

  private class a extends View
  {
    private Drawable b = getResources().getDrawable(2130837690);
    private Paint c = new Paint(1);

    public a(Context arg2)
    {
      super();
    }

    protected void onDraw(Canvas paramCanvas)
    {
      if ((ApplicationLoader.b()) && (ApplicationLoader.g() != null))
        this.c.setColor(ApplicationLoader.d());
      while (true)
      {
        paramCanvas.drawCircle(getMeasuredWidth() / 2.0F, getMeasuredHeight() / 2.0F, a.a(34.0F) / 2.0F, this.c);
        int i = (getMeasuredWidth() - a.a(33.0F)) / 2;
        int j = (getMeasuredHeight() - a.a(33.0F)) / 2;
        this.b.setBounds(i, j, a.a(33.0F) + i, a.a(33.0F) + j);
        this.b.draw(paramCanvas);
        return;
        this.c.setColor(l.a);
      }
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.c.q
 * JD-Core Version:    0.6.0
 */