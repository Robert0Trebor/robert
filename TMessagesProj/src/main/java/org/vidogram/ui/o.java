package org.vidogram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.TextView;
import org.vidogram.messenger.r;
import org.vidogram.ui.a.a.a;
import org.vidogram.ui.a.g;

public class o extends g
{
  private ImageView i;
  private TextView j;
  private TextView k;
  private TextView l;

  public View a(Context paramContext)
  {
    this.d.setBackgroundColor(-1);
    this.d.setBackButtonImage(2130838068);
    this.d.setItemsBackgroundColor(788529152);
    this.d.setCastShadows(false);
    if (!org.vidogram.messenger.a.c())
      this.d.e();
    this.d.setActionBarMenuOnItemClick(new a.a()
    {
      public void a(int paramInt)
      {
        if (paramInt == -1)
          o.this.d();
      }
    });
    this.b = new ViewGroup(paramContext)
    {
      protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
      {
        int i = paramInt3 - paramInt1;
        paramInt1 = paramInt4 - paramInt2;
        if (paramInt3 > paramInt4)
        {
          paramInt2 = (int)(paramInt1 * 0.05F);
          o.a(o.this).layout(0, paramInt2, o.a(o.this).getMeasuredWidth(), o.a(o.this).getMeasuredHeight() + paramInt2);
          paramInt2 = (int)(i * 0.4F);
          paramInt3 = (int)(paramInt1 * 0.14F);
          o.b(o.this).layout(paramInt2, paramInt3, o.b(o.this).getMeasuredWidth() + paramInt2, o.b(o.this).getMeasuredHeight() + paramInt3);
          paramInt3 = (int)(paramInt1 * 0.61F);
          o.d(o.this).layout(paramInt2, paramInt3, o.d(o.this).getMeasuredWidth() + paramInt2, o.d(o.this).getMeasuredHeight() + paramInt3);
          paramInt2 = (int)(i * 0.45F);
          paramInt1 = (int)(paramInt1 * 0.31F);
          o.c(o.this).layout(paramInt2, paramInt1, o.c(o.this).getMeasuredWidth() + paramInt2, o.c(o.this).getMeasuredHeight() + paramInt1);
          return;
        }
        paramInt2 = (int)(paramInt1 * 0.05F);
        o.a(o.this).layout(0, paramInt2, o.a(o.this).getMeasuredWidth(), o.a(o.this).getMeasuredHeight() + paramInt2);
        paramInt2 = (int)(paramInt1 * 0.59F);
        o.b(o.this).layout(0, paramInt2, o.b(o.this).getMeasuredWidth(), o.b(o.this).getMeasuredHeight() + paramInt2);
        paramInt2 = (int)(paramInt1 * 0.68F);
        paramInt3 = (int)(i * 0.05F);
        o.c(o.this).layout(paramInt3, paramInt2, o.c(o.this).getMeasuredWidth() + paramInt3, o.c(o.this).getMeasuredHeight() + paramInt2);
        paramInt1 = (int)(paramInt1 * 0.86F);
        o.d(o.this).layout(0, paramInt1, o.d(o.this).getMeasuredWidth(), o.d(o.this).getMeasuredHeight() + paramInt1);
      }

      protected void onMeasure(int paramInt1, int paramInt2)
      {
        paramInt1 = View.MeasureSpec.getSize(paramInt1);
        paramInt2 = View.MeasureSpec.getSize(paramInt2);
        if (paramInt1 > paramInt2)
        {
          o.a(o.this).measure(View.MeasureSpec.makeMeasureSpec((int)(paramInt1 * 0.45F), 1073741824), View.MeasureSpec.makeMeasureSpec((int)(paramInt2 * 0.78F), 1073741824));
          o.b(o.this).measure(View.MeasureSpec.makeMeasureSpec((int)(paramInt1 * 0.6F), 1073741824), View.MeasureSpec.makeMeasureSpec(paramInt2, 0));
          o.c(o.this).measure(View.MeasureSpec.makeMeasureSpec((int)(paramInt1 * 0.5F), 1073741824), View.MeasureSpec.makeMeasureSpec(paramInt2, 0));
          o.d(o.this).measure(View.MeasureSpec.makeMeasureSpec((int)(paramInt1 * 0.6F), 1073741824), View.MeasureSpec.makeMeasureSpec(org.vidogram.messenger.a.a(24.0F), 1073741824));
        }
        while (true)
        {
          setMeasuredDimension(paramInt1, paramInt2);
          return;
          o.a(o.this).measure(View.MeasureSpec.makeMeasureSpec(paramInt1, 1073741824), View.MeasureSpec.makeMeasureSpec((int)(paramInt2 * 0.44F), 1073741824));
          o.b(o.this).measure(View.MeasureSpec.makeMeasureSpec(paramInt1, 1073741824), View.MeasureSpec.makeMeasureSpec(paramInt2, 0));
          o.c(o.this).measure(View.MeasureSpec.makeMeasureSpec((int)(paramInt1 * 0.9F), 1073741824), View.MeasureSpec.makeMeasureSpec(paramInt2, 0));
          o.d(o.this).measure(View.MeasureSpec.makeMeasureSpec(paramInt1, 1073741824), View.MeasureSpec.makeMeasureSpec(org.vidogram.messenger.a.a(24.0F), 1073741824));
        }
      }
    };
    this.b.setBackgroundColor(-1);
    ViewGroup localViewGroup = (ViewGroup)this.b;
    localViewGroup.setOnTouchListener(new View.OnTouchListener()
    {
      public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
      {
        return true;
      }
    });
    this.i = new ImageView(paramContext);
    this.i.setImageResource(2130837680);
    this.i.setScaleType(ImageView.ScaleType.FIT_CENTER);
    localViewGroup.addView(this.i);
    this.k = new TextView(paramContext);
    this.k.setTextColor(-14606047);
    this.k.setGravity(1);
    this.k.setTextSize(1, 24.0F);
    this.k.setText(r.a("ChannelAlertTitle", 2131230970));
    localViewGroup.addView(this.k);
    this.l = new TextView(paramContext);
    this.l.setTextColor(-8882056);
    this.l.setGravity(1);
    this.l.setTextSize(1, 16.0F);
    this.l.setText(r.a("ChannelAlertText", 2131230969));
    localViewGroup.addView(this.l);
    this.j = new TextView(paramContext);
    this.j.setTextColor(-11759926);
    this.j.setGravity(17);
    this.j.setTextSize(1, 16.0F);
    this.j.setTypeface(org.vidogram.messenger.a.a("fonts/rmedium.ttf"));
    this.j.setText(r.a("ChannelAlertCreate", 2131230968));
    localViewGroup.addView(this.j);
    this.j.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramView)
      {
        paramView = new Bundle();
        paramView.putInt("step", 0);
        o.this.a(new l(paramView), true);
      }
    });
    return this.b;
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.o
 * JD-Core Version:    0.6.0
 */