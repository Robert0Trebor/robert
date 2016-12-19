package org.vidogram.ui.c;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build.VERSION;
import android.text.TextUtils.TruncateAt;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.vidogram.messenger.MediaController.a;
import org.vidogram.messenger.MediaController.i;
import org.vidogram.messenger.a;
import org.vidogram.ui.Components.BackupImageView;
import org.vidogram.ui.Components.v;

public class ah extends FrameLayout
{
  private a[] a = new a[4];
  private MediaController.a[] b = new MediaController.a[4];
  private int c;
  private b d;

  public ah(Context paramContext)
  {
    super(paramContext);
    int i = 0;
    while (i < 4)
    {
      this.a[i] = new a(paramContext);
      addView(this.a[i]);
      this.a[i].setVisibility(4);
      this.a[i].setTag(Integer.valueOf(i));
      this.a[i].setOnClickListener(new View.OnClickListener()
      {
        public void onClick(View paramView)
        {
          if (ah.a(ah.this) != null)
            ah.a(ah.this).a(ah.b(ah.this)[((Integer)paramView.getTag()).intValue()]);
        }
      });
      i += 1;
    }
  }

  public void a(int paramInt, MediaController.a parama)
  {
    this.b[paramInt] = parama;
    if (parama != null)
    {
      a locala = this.a[paramInt];
      a.a(locala).a(0, true);
      if ((parama.c != null) && (parama.c.d != null))
      {
        a.a(locala).a(parama.c.e, true);
        if (parama.c.h)
          a.a(locala).a("vthumb://" + parama.c.b + ":" + parama.c.d, null, getContext().getResources().getDrawable(2130838008));
      }
      while (true)
      {
        a.b(locala).setText(parama.b);
        a.c(locala).setText(String.format("%d", new Object[] { Integer.valueOf(parama.d.size()) }));
        return;
        a.a(locala).a("thumb://" + parama.c.b + ":" + parama.c.d, null, getContext().getResources().getDrawable(2130838008));
        continue;
        a.a(locala).setImageResource(2130838008);
      }
    }
    this.a[paramInt].setVisibility(4);
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    if (a.c());
    for (paramInt2 = (a.a(490.0F) - (this.c + 1) * a.a(4.0F)) / this.c; ; paramInt2 = (a.c.x - (this.c + 1) * a.a(4.0F)) / this.c)
    {
      int i = 0;
      while (i < this.c)
      {
        FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)this.a[i].getLayoutParams();
        localLayoutParams.topMargin = a.a(4.0F);
        localLayoutParams.leftMargin = ((a.a(4.0F) + paramInt2) * i);
        localLayoutParams.width = paramInt2;
        localLayoutParams.height = paramInt2;
        localLayoutParams.gravity = 51;
        this.a[i].setLayoutParams(localLayoutParams);
        i += 1;
      }
    }
    super.onMeasure(paramInt1, View.MeasureSpec.makeMeasureSpec(a.a(4.0F) + paramInt2, 1073741824));
  }

  public void setAlbumsCount(int paramInt)
  {
    int i = 0;
    if (i < this.a.length)
    {
      a locala = this.a[i];
      if (i < paramInt);
      for (int j = 0; ; j = 4)
      {
        locala.setVisibility(j);
        i += 1;
        break;
      }
    }
    this.c = paramInt;
  }

  public void setDelegate(b paramb)
  {
    this.d = paramb;
  }

  private class a extends FrameLayout
  {
    private BackupImageView b;
    private TextView c;
    private TextView d;
    private View e;

    public a(Context arg2)
    {
      super();
      this.b = new BackupImageView(localContext);
      addView(this.b, v.a(-1, -1.0F));
      this$1 = new LinearLayout(localContext);
      ah.this.setOrientation(0);
      ah.this.setBackgroundColor(2130706432);
      addView(ah.this, v.b(-1, 28, 83));
      this.c = new TextView(localContext);
      this.c.setTextSize(1, 13.0F);
      this.c.setTextColor(-1);
      this.c.setSingleLine(true);
      this.c.setEllipsize(TextUtils.TruncateAt.END);
      this.c.setMaxLines(1);
      this.c.setGravity(16);
      ah.this.addView(this.c, v.a(0, -1, 1.0F, 8, 0, 0, 0));
      this.d = new TextView(localContext);
      this.d.setTextSize(1, 13.0F);
      this.d.setTextColor(-5592406);
      this.d.setSingleLine(true);
      this.d.setEllipsize(TextUtils.TruncateAt.END);
      this.d.setMaxLines(1);
      this.d.setGravity(16);
      ah.this.addView(this.d, v.a(-2, -1, 4.0F, 0.0F, 4.0F, 0.0F));
      this.e = new View(localContext);
      this.e.setBackgroundResource(2130837946);
      addView(this.e, v.a(-1, -1.0F));
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
    public abstract void a(MediaController.a parama);
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.c.ah
 * JD-Core Version:    0.6.0
 */