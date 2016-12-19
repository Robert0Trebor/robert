package org.vidogram.ui.c;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.TextUtils.TruncateAt;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.vidogram.messenger.a;
import org.vidogram.messenger.r;
import org.vidogram.tgnet.g.az;
import org.vidogram.tgnet.g.be;
import org.vidogram.tgnet.g.bf;
import org.vidogram.tgnet.g.q;
import org.vidogram.ui.Components.BackupImageView;
import org.vidogram.ui.Components.bm;
import org.vidogram.ui.Components.v;

public class c extends FrameLayout
{
  private static Paint i;
  private TextView a;
  private TextView b;
  private BackupImageView c;
  private boolean d;
  private bm e;
  private g.bf f;
  private Rect g = new Rect();
  private CompoundButton.OnCheckedChangeListener h;

  public c(Context paramContext, boolean paramBoolean)
  {
    super(paramContext);
    if (i == null)
    {
      i = new Paint();
      i.setColor(-2500135);
    }
    this.a = new TextView(paramContext);
    this.a.setTextColor(-14606047);
    this.a.setTextSize(1, 16.0F);
    this.a.setLines(1);
    this.a.setMaxLines(1);
    this.a.setSingleLine(true);
    this.a.setEllipsize(TextUtils.TruncateAt.END);
    Object localObject = this.a;
    label145: float f1;
    label154: float f2;
    if (r.a)
    {
      j = 5;
      ((TextView)localObject).setGravity(j);
      localObject = this.a;
      if (!r.a)
        break label479;
      j = 5;
      if (!r.a)
        break label485;
      f1 = 40.0F;
      if (!r.a)
        break label491;
      f2 = 71.0F;
      label164: addView((View)localObject, v.a(-2, -2.0F, j, f1, 10.0F, f2, 0.0F));
      this.b = new TextView(paramContext);
      this.b.setTextColor(-7697782);
      this.b.setTextSize(1, 13.0F);
      this.b.setLines(1);
      this.b.setMaxLines(1);
      this.b.setSingleLine(true);
      localObject = this.b;
      if (!r.a)
        break label498;
      j = 5;
      label255: ((TextView)localObject).setGravity(j);
      localObject = this.b;
      if (!r.a)
        break label504;
      j = 5;
      label277: if (!r.a)
        break label510;
      f1 = 40.0F;
      label286: if (!r.a)
        break label516;
      f2 = 71.0F;
      label296: addView((View)localObject, v.a(-2, -2.0F, j, f1, 35.0F, f2, 0.0F));
      this.c = new BackupImageView(paramContext);
      this.c.setAspectFit(true);
      localObject = this.c;
      if (!r.a)
        break label523;
      j = 5;
      label352: if (!r.a)
        break label529;
      f1 = 0.0F;
      label360: if (!r.a)
        break label535;
      f2 = 12.0F;
      label370: addView((View)localObject, v.a(48, 48.0F, j | 0x30, f1, 8.0F, f2, 0.0F));
      if (paramBoolean)
      {
        this.e = new bm(paramContext);
        this.e.setDuplicateParentStateEnabled(false);
        this.e.setFocusable(false);
        this.e.setFocusableInTouchMode(false);
        paramContext = this.e;
        if (!r.a)
          break label541;
      }
    }
    label516: label523: label529: label535: label541: for (int j = k; ; j = 5)
    {
      addView(paramContext, v.a(-2, -2.0F, j | 0x10, 14.0F, 0.0F, 14.0F, 0.0F));
      return;
      j = 3;
      break;
      label479: j = 3;
      break label145;
      label485: f1 = 71.0F;
      break label154;
      label491: f2 = 40.0F;
      break label164;
      label498: j = 3;
      break label255;
      label504: j = 3;
      break label277;
      label510: f1 = 71.0F;
      break label286;
      f2 = 40.0F;
      break label296;
      j = 3;
      break label352;
      f1 = 12.0F;
      break label360;
      f2 = 0.0F;
      break label370;
    }
  }

  public void a(g.bf parambf, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.d = paramBoolean1;
    this.f = parambf;
    1 local1;
    Object localObject;
    if (!this.d)
    {
      paramBoolean1 = true;
      setWillNotDraw(paramBoolean1);
      this.a.setText(this.f.b.d);
      if (!paramBoolean2)
        break label176;
      local1 = new Drawable()
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
        break label163;
      localObject = null;
      label70: if (!r.a)
        break label170;
      label76: localTextView.setCompoundDrawablesWithIntrinsicBounds((Drawable)localObject, null, local1, null);
      label87: this.b.setText(r.b("Stickers", parambf.b.k));
      if ((parambf.d == null) || (parambf.d.i == null) || (parambf.d.i.c == null))
        break label190;
      this.c.a(parambf.d.i.c, null, "webp", null);
    }
    label163: label170: label176: label190: 
    do
    {
      return;
      paramBoolean1 = false;
      break;
      localObject = local1;
      break label70;
      local1 = null;
      break label76;
      this.a.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
      break label87;
    }
    while (parambf.c.isEmpty());
    this.c.a(((g.q)parambf.c.get(0)).i.c, null, "webp", null);
  }

  public g.bf getStickersSet()
  {
    return this.f;
  }

  protected void onDraw(Canvas paramCanvas)
  {
    if (this.d)
      paramCanvas.drawLine(0.0F, getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, i);
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    paramInt2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(paramInt1), 1073741824);
    int j = a.a(64.0F);
    if (this.d);
    for (paramInt1 = 1; ; paramInt1 = 0)
    {
      super.onMeasure(paramInt2, View.MeasureSpec.makeMeasureSpec(paramInt1 + j, 1073741824));
      return;
    }
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (this.e != null)
    {
      this.e.getHitRect(this.g);
      if (this.g.contains((int)paramMotionEvent.getX(), (int)paramMotionEvent.getY()))
      {
        paramMotionEvent.offsetLocation(-this.e.getX(), -this.e.getY());
        return this.e.onTouchEvent(paramMotionEvent);
      }
    }
    if ((Build.VERSION.SDK_INT >= 21) && (getBackground() != null) && ((paramMotionEvent.getAction() == 0) || (paramMotionEvent.getAction() == 2)))
      getBackground().setHotspot(paramMotionEvent.getX(), paramMotionEvent.getY());
    return super.onTouchEvent(paramMotionEvent);
  }

  public void setChecked(boolean paramBoolean)
  {
    this.e.setOnCheckedChangeListener(null);
    this.e.setChecked(paramBoolean);
    this.e.setOnCheckedChangeListener(this.h);
  }

  public void setOnCheckClick(CompoundButton.OnCheckedChangeListener paramOnCheckedChangeListener)
  {
    bm localbm = this.e;
    this.h = paramOnCheckedChangeListener;
    localbm.setOnCheckedChangeListener(paramOnCheckedChangeListener);
    this.e.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramView)
      {
      }
    });
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.c.c
 * JD-Core Version:    0.6.0
 */