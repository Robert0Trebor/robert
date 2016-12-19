package org.vidogram.ui.Components;

import android.content.Context;
import android.text.TextPaint;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ScrollView;
import android.widget.TextView;
import java.util.ArrayList;
import org.vidogram.messenger.a;
import org.vidogram.messenger.j;
import org.vidogram.tgnet.g.aq;
import org.vidogram.tgnet.g.mc;
import org.vidogram.tgnet.g.si;

public class d extends LinearLayout
{
  private LinearLayout a;
  private g.si b;
  private a c;
  private int d;
  private boolean e;
  private int f;
  private ArrayList<TextView> g = new ArrayList();

  public d(Context paramContext)
  {
    super(paramContext);
    setOrientation(1);
    ScrollView localScrollView = new ScrollView(paramContext);
    addView(localScrollView);
    this.a = new LinearLayout(paramContext);
    this.a.setOrientation(1);
    localScrollView.addView(this.a);
    setBackgroundColor(-657673);
  }

  public void a()
  {
    int i = 0;
    while (i < this.g.size())
    {
      ((TextView)this.g.get(i)).invalidate();
      i += 1;
    }
  }

  public boolean b()
  {
    return this.e;
  }

  public int getKeyboardHeight()
  {
    if (this.e)
      return this.d;
    return this.b.b.size() * a.a(this.f) + a.a(30.0F) + (this.b.b.size() - 1) * a.a(10.0F);
  }

  public void setButtons(g.si paramsi)
  {
    this.b = paramsi;
    this.a.removeAllViews();
    this.g.clear();
    if ((paramsi != null) && (this.b.b.size() != 0))
    {
      boolean bool;
      int i;
      if (!paramsi.f)
      {
        bool = true;
        this.e = bool;
        if (this.e)
          break label384;
        i = 42;
        label63: this.f = i;
        i = 0;
      }
      while (true)
      {
        if (i >= paramsi.b.size())
          return;
        g.mc localmc = (g.mc)paramsi.b.get(i);
        LinearLayout localLinearLayout = new LinearLayout(getContext());
        localLinearLayout.setOrientation(0);
        Object localObject = this.a;
        int j = this.f;
        float f1;
        label137: float f2;
        label154: label188: TextView localTextView;
        if (i == 0)
        {
          f1 = 15.0F;
          if (i != paramsi.b.size() - 1)
            break label446;
          f2 = 15.0F;
          ((LinearLayout)localObject).addView(localLinearLayout, v.a(-1, j, 15.0F, f1, 15.0F, f2));
          f1 = 1.0F / localmc.c.size();
          j = 0;
          if (j >= localmc.c.size())
            break label457;
          localObject = (g.aq)localmc.c.get(j);
          localTextView = new TextView(getContext());
          localTextView.setTag(localObject);
          localTextView.setTextColor(-13220017);
          localTextView.setTextSize(1, 16.0F);
          localTextView.setGravity(17);
          localTextView.setBackgroundResource(2130837655);
          localTextView.setPadding(a.a(4.0F), 0, a.a(4.0F), 0);
          localTextView.setText(j.a(((g.aq)localObject).b, localTextView.getPaint().getFontMetricsInt(), a.a(16.0F), false));
          if (j == localmc.c.size() - 1)
            break label451;
        }
        label384: label446: label451: for (int k = 10; ; k = 0)
        {
          localLinearLayout.addView(localTextView, v.a(0, -1, f1, 0, 0, k, 0));
          localTextView.setOnClickListener(new View.OnClickListener()
          {
            public void onClick(View paramView)
            {
              d.a(d.this).a((g.aq)paramView.getTag());
            }
          });
          this.g.add(localTextView);
          j += 1;
          break label188;
          bool = false;
          break;
          i = (int)Math.max(42.0F, (this.d - a.a(30.0F) - (this.b.b.size() - 1) * a.a(10.0F)) / this.b.b.size() / a.b);
          break label63;
          f1 = 10.0F;
          break label137;
          f2 = 0.0F;
          break label154;
        }
        label457: i += 1;
      }
    }
  }

  public void setDelegate(a parama)
  {
    this.c = parama;
  }

  public void setPanelHeight(int paramInt)
  {
    this.d = paramInt;
    if ((this.e) && (this.b != null) && (this.b.b.size() != 0))
    {
      if (!this.e);
      for (paramInt = 42; ; paramInt = (int)Math.max(42.0F, (this.d - a.a(30.0F) - (this.b.b.size() - 1) * a.a(10.0F)) / this.b.b.size() / a.b))
      {
        this.f = paramInt;
        int i = this.a.getChildCount();
        int j = a.a(this.f);
        paramInt = 0;
        while (paramInt < i)
        {
          View localView = this.a.getChildAt(paramInt);
          LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)localView.getLayoutParams();
          if (localLayoutParams.height != j)
          {
            localLayoutParams.height = j;
            localView.setLayoutParams(localLayoutParams);
          }
          paramInt += 1;
        }
      }
    }
  }

  public static abstract interface a
  {
    public abstract void a(g.aq paramaq);
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.Components.d
 * JD-Core Version:    0.6.0
 */