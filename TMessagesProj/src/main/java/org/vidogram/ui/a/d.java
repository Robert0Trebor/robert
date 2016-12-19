package org.vidogram.ui.a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnKeyListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import java.lang.reflect.Field;
import org.vidogram.messenger.r;
import org.vidogram.ui.Components.v;

public class d extends FrameLayout
{
  protected ImageView a;
  protected boolean b;
  private e.a c;
  private c d;
  private e e;
  private EditText f;
  private ImageView g;
  private FrameLayout h;
  private boolean i = false;
  private b j;
  private Rect k;
  private int[] l;
  private View m;
  private Runnable n;
  private boolean o;
  private int p = org.vidogram.messenger.a.a(16.0F);
  private int q = 0;
  private a r;
  private boolean s = true;
  private boolean t;

  public d(Context paramContext, c paramc, int paramInt)
  {
    super(paramContext);
    if (paramInt != 0)
      setBackgroundDrawable(l.a(paramInt));
    this.d = paramc;
    this.a = new ImageView(paramContext);
    this.a.setScaleType(ImageView.ScaleType.CENTER);
    addView(this.a, v.a(-1, -1.0F));
  }

  private void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    int i1;
    Object localObject;
    if (this.o)
    {
      getLocationOnScreen(this.l);
      int i3 = this.l[1] - org.vidogram.messenger.a.a + getMeasuredHeight() - this.p;
      int i2 = -this.p;
      i1 = i2;
      if (i3 < 0)
        i1 = i2 - i3;
      if (paramBoolean1)
        this.c.b();
      if (this.q != 0)
        break label384;
      if (!this.o)
        break label192;
      if (paramBoolean1)
        this.e.showAsDropDown(this, -this.c.getMeasuredWidth() + getMeasuredWidth(), i1);
      if (paramBoolean2)
      {
        localObject = this.e;
        i2 = -this.c.getMeasuredWidth();
        ((e)localObject).update(this, getMeasuredWidth() + i2, i1, -1, -1);
      }
    }
    label192: 
    do
    {
      do
      {
        do
        {
          do
          {
            return;
            if ((this.d != null) && (this.q == 0))
            {
              i1 = -this.d.a.getMeasuredHeight() + this.d.getTop();
              break;
            }
            i1 = -getMeasuredHeight();
            break;
            if (this.d == null)
              break label289;
            localObject = this.d.a;
            if (!paramBoolean1)
              continue;
            this.e.showAsDropDown((View)localObject, getLeft() + this.d.getLeft() + getMeasuredWidth() - this.c.getMeasuredWidth(), i1);
          }
          while (!paramBoolean2);
          this.e.update((View)localObject, getLeft() + this.d.getLeft() + getMeasuredWidth() - this.c.getMeasuredWidth(), i1, -1, -1);
          return;
        }
        while (getParent() == null);
        localObject = (View)getParent();
        if (!paramBoolean1)
          continue;
        this.e.showAsDropDown((View)localObject, ((View)localObject).getMeasuredWidth() - this.c.getMeasuredWidth() - getLeft() - ((View)localObject).getLeft(), i1);
      }
      while (!paramBoolean2);
      this.e.update((View)localObject, ((View)localObject).getMeasuredWidth() - this.c.getMeasuredWidth() - getLeft() - ((View)localObject).getLeft(), i1, -1, -1);
      return;
      if (!paramBoolean1)
        continue;
      this.e.showAsDropDown(this, -org.vidogram.messenger.a.a(8.0F), i1);
    }
    while (!paramBoolean2);
    label289: this.e.update(this, -org.vidogram.messenger.a.a(8.0F), i1, -1, -1);
    label384:
  }

  public TextView a(int paramInt1, String paramString, int paramInt2)
  {
    if (this.c == null)
    {
      this.k = new Rect();
      this.l = new int[2];
      this.c = new e.a(getContext());
      this.c.setOnTouchListener(new View.OnTouchListener()
      {
        public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
        {
          if ((paramMotionEvent.getActionMasked() == 0) && (d.a(d.this) != null) && (d.a(d.this).isShowing()))
          {
            paramView.getHitRect(d.b(d.this));
            if (!d.b(d.this).contains((int)paramMotionEvent.getX(), (int)paramMotionEvent.getY()))
              d.a(d.this).dismiss();
          }
          return false;
        }
      });
      this.c.setDispatchKeyEventListener(new e.b()
      {
        public void a(KeyEvent paramKeyEvent)
        {
          if ((paramKeyEvent.getKeyCode() == 4) && (paramKeyEvent.getRepeatCount() == 0) && (d.a(d.this) != null) && (d.a(d.this).isShowing()))
            d.a(d.this).dismiss();
        }
      });
    }
    TextView localTextView = new TextView(getContext());
    localTextView.setTextColor(-14606047);
    localTextView.setBackgroundResource(2130837946);
    if (!r.a)
    {
      localTextView.setGravity(16);
      localTextView.setPadding(org.vidogram.messenger.a.a(16.0F), 0, org.vidogram.messenger.a.a(16.0F), 0);
      localTextView.setTextSize(1, 18.0F);
      localTextView.setMinWidth(org.vidogram.messenger.a.a(196.0F));
      localTextView.setTag(Integer.valueOf(paramInt1));
      localTextView.setText(paramString);
      if (paramInt2 != 0)
      {
        localTextView.setCompoundDrawablePadding(org.vidogram.messenger.a.a(12.0F));
        if (r.a)
          break label299;
        localTextView.setCompoundDrawablesWithIntrinsicBounds(getResources().getDrawable(paramInt2), null, null, null);
      }
    }
    while (true)
    {
      this.c.setShowedFromBotton(this.o);
      this.c.addView(localTextView);
      paramString = (LinearLayout.LayoutParams)localTextView.getLayoutParams();
      if (r.a)
        paramString.gravity = 5;
      paramString.width = -1;
      paramString.height = org.vidogram.messenger.a.a(48.0F);
      localTextView.setLayoutParams(paramString);
      localTextView.setOnClickListener(new View.OnClickListener()
      {
        public void onClick(View paramView)
        {
          if ((d.a(d.this) != null) && (d.a(d.this).isShowing()))
            if (!d.c(d.this));
          do
          {
            return;
            d.a(d.this, true);
            d.a(d.this).b(d.d(d.this));
            if (d.e(d.this) == null)
              continue;
            d.e(d.this).a(((Integer)paramView.getTag()).intValue());
            return;
          }
          while (d.f(d.this) == null);
          d.f(d.this).a(((Integer)paramView.getTag()).intValue());
        }
      });
      paramInt1 = this.p;
      this.p = (paramString.height + paramInt1);
      return localTextView;
      localTextView.setGravity(21);
      break;
      label299: localTextView.setCompoundDrawablesWithIntrinsicBounds(null, null, getResources().getDrawable(paramInt2), null);
    }
  }

  public d a(b paramb)
  {
    this.j = paramb;
    return this;
  }

  public void a(int paramInt)
  {
    View localView = this.c.findViewWithTag(Integer.valueOf(paramInt));
    if (localView != null)
      localView.setVisibility(8);
  }

  public void a(boolean paramBoolean)
  {
    if ((this.h == null) || (this.h.getVisibility() == 0) || (this.d == null))
      return;
    this.d.a.a(b(paramBoolean));
  }

  public boolean a()
  {
    return this.c != null;
  }

  public void b()
  {
    if (this.c == null)
      return;
    if (this.n != null)
    {
      org.vidogram.messenger.a.b(this.n);
      this.n = null;
    }
    if ((this.e != null) && (this.e.isShowing()))
    {
      this.e.dismiss();
      return;
    }
    if (this.e == null)
    {
      this.e = new e(this.c, -2, -2);
      if (Build.VERSION.SDK_INT >= 19)
      {
        this.e.setAnimationStyle(0);
        this.e.setOutsideTouchable(true);
        this.e.setClippingEnabled(true);
        this.e.setInputMethodMode(2);
        this.e.setSoftInputMode(0);
        this.c.measure(View.MeasureSpec.makeMeasureSpec(org.vidogram.messenger.a.a(1000.0F), -2147483648), View.MeasureSpec.makeMeasureSpec(org.vidogram.messenger.a.a(1000.0F), -2147483648));
        this.e.getContentView().setFocusableInTouchMode(true);
        this.e.getContentView().setOnKeyListener(new View.OnKeyListener()
        {
          public boolean onKey(View paramView, int paramInt, KeyEvent paramKeyEvent)
          {
            if ((paramInt == 82) && (paramKeyEvent.getRepeatCount() == 0) && (paramKeyEvent.getAction() == 1) && (d.a(d.this) != null) && (d.a(d.this).isShowing()))
            {
              d.a(d.this).dismiss();
              return true;
            }
            return false;
          }
        });
      }
    }
    else
    {
      this.t = false;
      this.e.setFocusable(true);
      if (this.c.getMeasuredWidth() != 0)
        break label236;
      a(true, true);
    }
    while (true)
    {
      this.e.a();
      return;
      this.e.setAnimationStyle(2131427549);
      break;
      label236: a(true, false);
    }
  }

  public void b(int paramInt)
  {
    View localView = this.c.findViewWithTag(Integer.valueOf(paramInt));
    if (localView != null)
      localView.setVisibility(0);
  }

  public boolean b(boolean paramBoolean)
  {
    if (this.h == null);
    while (true)
    {
      return false;
      if (this.h.getVisibility() != 0)
        break;
      if ((this.j != null) && ((this.j == null) || (!this.j.b())))
        continue;
      this.h.setVisibility(8);
      this.f.clearFocus();
      setVisibility(0);
      org.vidogram.messenger.a.b(this.f);
      if (this.j == null)
        continue;
      this.j.c();
      return false;
    }
    this.h.setVisibility(0);
    setVisibility(8);
    this.f.setText("");
    this.f.requestFocus();
    if (paramBoolean)
      org.vidogram.messenger.a.a(this.f);
    if (this.j != null)
      this.j.a();
    return true;
  }

  public d c(boolean paramBoolean)
  {
    this.b = paramBoolean;
    return this;
  }

  public void c()
  {
    if ((this.e != null) && (this.e.isShowing()))
      this.e.dismiss();
  }

  public d d(boolean paramBoolean)
  {
    if (this.d == null)
      return this;
    Object localObject;
    if ((paramBoolean) && (this.h == null))
    {
      this.h = new FrameLayout(getContext());
      this.d.addView(this.h, 0);
      localObject = (LinearLayout.LayoutParams)this.h.getLayoutParams();
      ((LinearLayout.LayoutParams)localObject).weight = 1.0F;
      ((LinearLayout.LayoutParams)localObject).width = 0;
      ((LinearLayout.LayoutParams)localObject).height = -1;
      ((LinearLayout.LayoutParams)localObject).leftMargin = org.vidogram.messenger.a.a(6.0F);
      this.h.setLayoutParams((ViewGroup.LayoutParams)localObject);
      this.h.setVisibility(8);
      this.f = new EditText(getContext());
      this.f.setTextSize(1, 18.0F);
      this.f.setHintTextColor(-1996488705);
      this.f.setTextColor(-1);
      this.f.setSingleLine(true);
      this.f.setBackgroundResource(0);
      this.f.setPadding(0, 0, 0, 0);
      int i1 = this.f.getInputType();
      this.f.setInputType(i1 | 0x80000);
      this.f.setCustomSelectionActionModeCallback(new ActionMode.Callback()
      {
        public boolean onActionItemClicked(ActionMode paramActionMode, MenuItem paramMenuItem)
        {
          return false;
        }

        public boolean onCreateActionMode(ActionMode paramActionMode, Menu paramMenu)
        {
          return false;
        }

        public void onDestroyActionMode(ActionMode paramActionMode)
        {
        }

        public boolean onPrepareActionMode(ActionMode paramActionMode, Menu paramMenu)
        {
          return false;
        }
      });
      this.f.setOnEditorActionListener(new TextView.OnEditorActionListener()
      {
        public boolean onEditorAction(TextView paramTextView, int paramInt, KeyEvent paramKeyEvent)
        {
          if ((paramKeyEvent != null) && (((paramKeyEvent.getAction() == 1) && (paramKeyEvent.getKeyCode() == 84)) || ((paramKeyEvent.getAction() == 0) && (paramKeyEvent.getKeyCode() == 66))))
          {
            org.vidogram.messenger.a.b(d.g(d.this));
            if (d.h(d.this) != null)
              d.h(d.this).b(d.g(d.this));
          }
          return false;
        }
      });
      this.f.addTextChangedListener(new TextWatcher()
      {
        public void afterTextChanged(Editable paramEditable)
        {
        }

        public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
        {
        }

        public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
        {
          if (d.h(d.this) != null)
            d.h(d.this).a(d.g(d.this));
          ImageView localImageView;
          float f;
          if (d.i(d.this) != null)
          {
            localImageView = d.i(d.this);
            if ((paramCharSequence != null) && (paramCharSequence.length() != 0))
              break label71;
            f = 0.6F;
          }
          while (true)
          {
            localImageView.setAlpha(f);
            return;
            label71: f = 1.0F;
          }
        }
      });
    }
    try
    {
      localObject = TextView.class.getDeclaredField("mCursorDrawableRes");
      ((Field)localObject).setAccessible(true);
      ((Field)localObject).set(this.f, Integer.valueOf(2130838121));
      label263: this.f.setImeOptions(33554435);
      this.f.setTextIsSelectable(false);
      this.h.addView(this.f);
      localObject = (FrameLayout.LayoutParams)this.f.getLayoutParams();
      ((FrameLayout.LayoutParams)localObject).width = -1;
      ((FrameLayout.LayoutParams)localObject).gravity = 16;
      ((FrameLayout.LayoutParams)localObject).height = org.vidogram.messenger.a.a(36.0F);
      ((FrameLayout.LayoutParams)localObject).rightMargin = org.vidogram.messenger.a.a(48.0F);
      this.f.setLayoutParams((ViewGroup.LayoutParams)localObject);
      this.g = new ImageView(getContext());
      this.g.setImageResource(2130837822);
      this.g.setScaleType(ImageView.ScaleType.CENTER);
      this.g.setOnClickListener(new View.OnClickListener()
      {
        public void onClick(View paramView)
        {
          d.g(d.this).setText("");
          d.g(d.this).requestFocus();
          org.vidogram.messenger.a.a(d.g(d.this));
        }
      });
      this.h.addView(this.g);
      localObject = (FrameLayout.LayoutParams)this.g.getLayoutParams();
      ((FrameLayout.LayoutParams)localObject).width = org.vidogram.messenger.a.a(48.0F);
      ((FrameLayout.LayoutParams)localObject).gravity = 21;
      ((FrameLayout.LayoutParams)localObject).height = -1;
      this.g.setLayoutParams((ViewGroup.LayoutParams)localObject);
      this.i = paramBoolean;
      return this;
    }
    catch (Exception localException)
    {
      break label263;
    }
  }

  public boolean d()
  {
    return this.i;
  }

  public d e(boolean paramBoolean)
  {
    this.s = paramBoolean;
    return this;
  }

  public ImageView getImageView()
  {
    return this.a;
  }

  public EditText getSearchField()
  {
    return this.f;
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if ((this.e != null) && (this.e.isShowing()))
      a(false, true);
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (paramMotionEvent.getActionMasked() == 0)
      if ((a()) && ((this.e == null) || ((this.e != null) && (!this.e.isShowing()))))
      {
        this.n = new Runnable()
        {
          public void run()
          {
            if (d.this.getParent() != null)
              d.this.getParent().requestDisallowInterceptTouchEvent(true);
            d.this.b();
          }
        };
        org.vidogram.messenger.a.a(this.n, 200L);
      }
    while (true)
    {
      return super.onTouchEvent(paramMotionEvent);
      if (paramMotionEvent.getActionMasked() == 2)
      {
        if ((a()) && ((this.e == null) || ((this.e != null) && (!this.e.isShowing()))))
        {
          if (paramMotionEvent.getY() <= getHeight())
            continue;
          if (getParent() != null)
            getParent().requestDisallowInterceptTouchEvent(true);
          b();
          return true;
        }
        if ((this.e == null) || (!this.e.isShowing()))
          continue;
        getLocationOnScreen(this.l);
        float f3 = paramMotionEvent.getX();
        float f4 = this.l[0];
        float f1 = paramMotionEvent.getY();
        float f2 = this.l[1];
        this.c.getLocationOnScreen(this.l);
        f3 = f3 + f4 - this.l[0];
        f1 = f1 + f2 - this.l[1];
        this.m = null;
        int i1 = 0;
        label240: View localView;
        if (i1 < this.c.getItemsCount())
        {
          localView = this.c.a(i1);
          localView.getHitRect(this.k);
          if (((Integer)localView.getTag()).intValue() < 100)
          {
            if (this.k.contains((int)f3, (int)f1))
              break label343;
            localView.setPressed(false);
            localView.setSelected(false);
            if (Build.VERSION.SDK_INT == 21)
              localView.getBackground().setVisible(false, false);
          }
        }
        while (true)
        {
          i1 += 1;
          break label240;
          break;
          label343: localView.setPressed(true);
          localView.setSelected(true);
          if (Build.VERSION.SDK_INT >= 21)
          {
            if (Build.VERSION.SDK_INT == 21)
              localView.getBackground().setVisible(true, false);
            localView.drawableHotspotChanged(f3, f1 - localView.getTop());
          }
          this.m = localView;
        }
      }
      if ((this.e != null) && (this.e.isShowing()) && (paramMotionEvent.getActionMasked() == 1))
      {
        if (this.m != null)
        {
          this.m.setSelected(false);
          if (this.d != null)
            this.d.a(((Integer)this.m.getTag()).intValue());
          while (true)
          {
            this.e.b(this.s);
            break;
            if (this.r == null)
              continue;
            this.r.a(((Integer)this.m.getTag()).intValue());
          }
        }
        this.e.dismiss();
        continue;
      }
      if (this.m == null)
        continue;
      this.m.setSelected(false);
      this.m = null;
    }
  }

  public void setDelegate(a parama)
  {
    this.r = parama;
  }

  public void setIcon(int paramInt)
  {
    this.a.setImageResource(paramInt);
  }

  public void setShowFromBottom(boolean paramBoolean)
  {
    this.o = paramBoolean;
    if (this.c != null)
      this.c.setShowedFromBotton(this.o);
  }

  public void setSubMenuOpenSide(int paramInt)
  {
    this.q = paramInt;
  }

  public static abstract interface a
  {
    public abstract void a(int paramInt);
  }

  public static class b
  {
    public void a()
    {
    }

    public void a(EditText paramEditText)
    {
    }

    public void b(EditText paramEditText)
    {
    }

    public boolean b()
    {
      return true;
    }

    public void c()
    {
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.a.d
 * JD-Core Version:    0.6.0
 */