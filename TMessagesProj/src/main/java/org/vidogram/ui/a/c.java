package org.vidogram.ui.a;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;

public class c extends LinearLayout
{
  protected a a;

  public c(Context paramContext, a parama)
  {
    super(paramContext);
    setOrientation(0);
    this.a = parama;
  }

  public View a(int paramInt1, int paramInt2)
  {
    View localView = ((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(paramInt2, null);
    localView.setTag(Integer.valueOf(paramInt1));
    addView(localView);
    LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)localView.getLayoutParams();
    localLayoutParams.height = -1;
    localView.setBackgroundDrawable(l.a(this.a.b));
    localView.setLayoutParams(localLayoutParams);
    localView.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramView)
      {
        c.this.a(((Integer)paramView.getTag()).intValue());
      }
    });
    return localView;
  }

  public d a(int paramInt1, int paramInt2, int paramInt3)
  {
    return a(paramInt1, paramInt2, paramInt3, null, org.vidogram.messenger.a.a(48.0F));
  }

  public d a(int paramInt1, int paramInt2, int paramInt3, Drawable paramDrawable, int paramInt4)
  {
    d locald = new d(getContext(), this, paramInt3);
    locald.setTag(Integer.valueOf(paramInt1));
    if (paramDrawable != null)
      locald.a.setImageDrawable(paramDrawable);
    while (true)
    {
      addView(locald);
      paramDrawable = (LinearLayout.LayoutParams)locald.getLayoutParams();
      paramDrawable.height = -1;
      paramDrawable.width = paramInt4;
      locald.setLayoutParams(paramDrawable);
      locald.setOnClickListener(new View.OnClickListener()
      {
        public void onClick(View paramView)
        {
          d locald = (d)paramView;
          if (locald.a())
          {
            if (c.this.a.d.a())
              locald.b();
            return;
          }
          if (locald.d())
          {
            c.this.a.a(locald.b(true));
            return;
          }
          c.this.a(((Integer)paramView.getTag()).intValue());
        }
      });
      return locald;
      locald.a.setImageResource(paramInt2);
    }
  }

  public void a()
  {
    int j = getChildCount();
    int i = 0;
    while (i < j)
    {
      View localView = getChildAt(i);
      if ((localView instanceof d))
        ((d)localView).c();
      i += 1;
    }
  }

  public void a(int paramInt)
  {
    if (this.a.d != null)
      this.a.d.a(paramInt);
  }

  public void a(boolean paramBoolean, String paramString)
  {
    int j = getChildCount();
    int i = 0;
    while (true)
    {
      if (i < j)
      {
        Object localObject = getChildAt(i);
        if ((localObject instanceof d))
        {
          localObject = (d)localObject;
          if (((d)localObject).d())
          {
            if (paramBoolean)
              this.a.a(((d)localObject).b(true));
            ((d)localObject).getSearchField().setText(paramString);
            ((d)localObject).getSearchField().setSelection(paramString.length());
          }
        }
      }
      else
      {
        return;
      }
      i += 1;
    }
  }

  public d b(int paramInt)
  {
    View localView = findViewWithTag(Integer.valueOf(paramInt));
    if ((localView instanceof d))
      return (d)localView;
    return null;
  }

  public d b(int paramInt1, int paramInt2)
  {
    return a(paramInt1, paramInt2, this.a.b);
  }

  public d b(int paramInt1, int paramInt2, int paramInt3)
  {
    return a(paramInt1, paramInt2, this.a.b, null, paramInt3);
  }

  public void b()
  {
    removeAllViews();
  }

  public void c()
  {
    int j = getChildCount();
    int i = 0;
    Object localObject;
    if (i < j)
    {
      localObject = getChildAt(i);
      if ((localObject instanceof d))
      {
        localObject = (d)localObject;
        if (((d)localObject).getVisibility() == 0)
          break label44;
      }
    }
    label44: 
    do
    {
      i += 1;
      break;
      if (!((d)localObject).a())
        continue;
      ((d)localObject).b();
      return;
    }
    while (!((d)localObject).b);
    a(((Integer)((d)localObject).getTag()).intValue());
  }

  public void d()
  {
    int j = getChildCount();
    int i = 0;
    while (true)
    {
      if (i < j)
      {
        Object localObject = getChildAt(i);
        if ((localObject instanceof d))
        {
          localObject = (d)localObject;
          if (((d)localObject).d())
            this.a.a(((d)localObject).b(false));
        }
      }
      else
      {
        return;
      }
      i += 1;
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.a.c
 * JD-Core Version:    0.6.0
 */