package org.vidogram.ui.Components;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.graphics.Point;
import android.os.Build.VERSION;
import android.text.Editable;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.TextPaint;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnKeyListener;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import org.vidogram.messenger.ApplicationLoader;
import org.vidogram.messenger.a;
import org.vidogram.messenger.j;
import org.vidogram.messenger.n;
import org.vidogram.messenger.r;
import org.vidogram.messenger.y;
import org.vidogram.messenger.y.b;
import org.vidogram.tgnet.g.bf;
import org.vidogram.tgnet.g.q;

public class al extends FrameLayout
  implements y.b, bh.a
{
  private EditText a;
  private ImageView b;
  private p c;
  private bh d;
  private ActionMode e;
  private int f;
  private boolean g;
  private int h;
  private int i;
  private boolean j;
  private int k;
  private boolean l;
  private final int m = 200;
  private a n;
  private View o;

  public al(Context paramContext, bh parambh, View paramView)
  {
    super(paramContext);
    setBackgroundColor(2130706432);
    setFocusable(true);
    setFocusableInTouchMode(true);
    this.o = paramView;
    this.d = parambh;
    paramView = new LinearLayout(paramContext);
    paramView.setOrientation(0);
    addView(paramView, v.a(-1, -2.0F, 51, 2.0F, 0.0F, 0.0F, 0.0F));
    parambh = new FrameLayout(paramContext);
    paramView.addView(parambh, v.a(0, -2, 1.0F));
    this.b = new ImageView(paramContext);
    this.b.setImageResource(2130837875);
    this.b.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
    this.b.setPadding(a.a(4.0F), a.a(1.0F), 0, 0);
    parambh.addView(this.b, v.b(48, 48, 83));
    this.b.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramView)
      {
        if (!al.this.f())
        {
          al.a(al.this, 1);
          return;
        }
        al.a(al.this);
      }
    });
    this.a = new EditText(paramContext)
    {
      protected void onMeasure(int paramInt1, int paramInt2)
      {
        try
        {
          super.onMeasure(paramInt1, paramInt2);
          return;
        }
        catch (Exception localException)
        {
          setMeasuredDimension(View.MeasureSpec.getSize(paramInt1), a.a(51.0F));
          n.a("tmessages", localException);
        }
      }
    };
    if ((Build.VERSION.SDK_INT >= 23) && (this.o != null))
    {
      this.a.setCustomSelectionActionModeCallback(new ActionMode.Callback()
      {
        public boolean onActionItemClicked(ActionMode paramActionMode, MenuItem paramMenuItem)
        {
          return false;
        }

        public boolean onCreateActionMode(ActionMode paramActionMode, Menu paramMenu)
        {
          al.a(al.this, paramActionMode);
          return true;
        }

        public void onDestroyActionMode(ActionMode paramActionMode)
        {
          if (al.b(al.this) == paramActionMode)
            al.a(al.this, null);
        }

        public boolean onPrepareActionMode(ActionMode paramActionMode, Menu paramMenu)
        {
          if (Build.VERSION.SDK_INT >= 23)
            al.b(al.this, paramActionMode);
          return true;
        }
      });
      this.a.setCustomInsertionActionModeCallback(new ActionMode.Callback()
      {
        public boolean onActionItemClicked(ActionMode paramActionMode, MenuItem paramMenuItem)
        {
          return false;
        }

        public boolean onCreateActionMode(ActionMode paramActionMode, Menu paramMenu)
        {
          al.a(al.this, paramActionMode);
          return true;
        }

        public void onDestroyActionMode(ActionMode paramActionMode)
        {
          if (al.b(al.this) == paramActionMode)
            al.a(al.this, null);
        }

        public boolean onPrepareActionMode(ActionMode paramActionMode, Menu paramMenu)
        {
          if (Build.VERSION.SDK_INT >= 23)
            al.b(al.this, paramActionMode);
          return true;
        }
      });
    }
    this.a.setHint(r.a("AddCaption", 2131230812));
    this.a.setImeOptions(268435456);
    this.a.setInputType(this.a.getInputType() | 0x4000);
    this.a.setMaxLines(4);
    this.a.setHorizontallyScrolling(false);
    this.a.setTextSize(1, 18.0F);
    this.a.setGravity(80);
    this.a.setPadding(0, a.a(11.0F), 0, a.a(12.0F));
    this.a.setBackgroundDrawable(null);
    a.a(this.a);
    this.a.setTextColor(-1);
    this.a.setHintTextColor(-1291845633);
    paramContext = new InputFilter.LengthFilter(200);
    this.a.setFilters(new InputFilter[] { paramContext });
    parambh.addView(this.a, v.a(-1, -2.0F, 83, 52.0F, 0.0F, 6.0F, 0.0F));
    this.a.setOnKeyListener(new View.OnKeyListener()
    {
      public boolean onKey(View paramView, int paramInt, KeyEvent paramKeyEvent)
      {
        if (paramInt == 4)
        {
          if ((al.c(al.this) != null) && (al.this.a()));
          while (true)
          {
            return true;
            if ((al.d(al.this)) || (!al.this.f()))
              break;
            if (paramKeyEvent.getAction() != 1)
              continue;
            al.a(al.this, 0);
            return true;
          }
        }
        return false;
      }
    });
    this.a.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramView)
      {
        if (al.this.f())
        {
          paramView = al.this;
          if (!a.h)
            break label29;
        }
        label29: for (int i = 0; ; i = 2)
        {
          al.a(paramView, i);
          return;
        }
      }
    });
    this.a.addTextChangedListener(new TextWatcher()
    {
      boolean a = false;

      public void afterTextChanged(Editable paramEditable)
      {
        if (al.e(al.this));
        do
          return;
        while (!this.a);
        ImageSpan[] arrayOfImageSpan = (ImageSpan[])paramEditable.getSpans(0, paramEditable.length(), ImageSpan.class);
        int i = 0;
        while (i < arrayOfImageSpan.length)
        {
          paramEditable.removeSpan(arrayOfImageSpan[i]);
          i += 1;
        }
        j.a(paramEditable, al.g(al.this).getPaint().getFontMetricsInt(), a.a(20.0F), false);
        this.a = false;
      }

      public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
      {
      }

      public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
      {
        if (al.e(al.this));
        do
        {
          return;
          if (al.f(al.this) == null)
            continue;
          al.f(al.this).a(paramCharSequence);
        }
        while ((paramInt2 == paramInt3) || (paramInt3 - paramInt2 <= 1));
        this.a = true;
      }
    });
  }

  private void a(int paramInt)
  {
    if (paramInt == 1)
    {
      if (this.c == null)
      {
        this.c = new p(false, false, getContext());
        this.c.setListener(new p.h()
        {
          public void a(String paramString)
          {
            if (al.g(al.this).length() + paramString.length() > 200)
              return;
            int j = al.g(al.this).getSelectionEnd();
            int i = j;
            if (j < 0)
              i = 0;
            try
            {
              al.a(al.this, true);
              paramString = j.a(paramString, al.g(al.this).getPaint().getFontMetricsInt(), a.a(20.0F), false);
              al.g(al.this).setText(al.g(al.this).getText().insert(i, paramString));
              i += paramString.length();
              al.g(al.this).setSelection(i, i);
              return;
            }
            catch (Exception paramString)
            {
              n.a("tmessages", paramString);
              return;
            }
            finally
            {
              al.a(al.this, false);
            }
            throw paramString;
          }

          public void a(g.bf parambf)
          {
          }

          public void a(g.q paramq)
          {
          }

          public void a(boolean paramBoolean)
          {
          }

          public boolean a()
          {
            if (al.g(al.this).length() == 0)
              return false;
            al.g(al.this).dispatchKeyEvent(new KeyEvent(0, 67));
            return true;
          }

          public void b()
          {
          }

          public void b(g.bf parambf)
          {
          }

          public void b(g.q paramq)
          {
          }

          public void b(boolean paramBoolean)
          {
          }

          public void c()
          {
          }

          public void c(g.bf parambf)
          {
          }
        });
        this.d.addView(this.c);
      }
      this.c.setVisibility(0);
      if (this.h <= 0)
        this.h = ApplicationLoader.a.getSharedPreferences("emoji", 0).getInt("kbd_height", a.a(200.0F));
      if (this.i <= 0)
        this.i = ApplicationLoader.a.getSharedPreferences("emoji", 0).getInt("kbd_height_land3", a.a(200.0F));
      if (a.c.x > a.c.y)
      {
        paramInt = this.i;
        FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)this.c.getLayoutParams();
        localLayoutParams.width = a.c.x;
        localLayoutParams.height = paramInt;
        this.c.setLayoutParams(localLayoutParams);
        if (!a.i)
          a.b(this.a);
        if (this.d != null)
        {
          this.k = paramInt;
          this.d.requestLayout();
          this.b.setImageResource(2130837845);
          i();
        }
      }
    }
    do
    {
      return;
      paramInt = this.h;
      break;
      if (this.b != null)
        this.b.setImageResource(2130837875);
      if (this.c == null)
        continue;
      this.c.setVisibility(8);
    }
    while (this.d == null);
    if (paramInt == 0)
      this.k = 0;
    this.d.requestLayout();
    i();
  }

  private void a(ActionMode paramActionMode)
  {
    try
    {
      Object localObject1 = Class.forName("com.android.internal.view.FloatingActionMode");
      Object localObject2 = ((Class)localObject1).getDeclaredField("mFloatingToolbar");
      ((Field)localObject2).setAccessible(true);
      localObject2 = ((Field)localObject2).get(paramActionMode);
      Object localObject3 = Class.forName("com.android.internal.widget.FloatingToolbar");
      Field localField = ((Class)localObject3).getDeclaredField("mPopup");
      localObject3 = ((Class)localObject3).getDeclaredField("mWidthChanged");
      localField.setAccessible(true);
      ((Field)localObject3).setAccessible(true);
      localObject2 = localField.get(localObject2);
      localField = Class.forName("com.android.internal.widget.FloatingToolbar$FloatingToolbarPopup").getDeclaredField("mParent");
      localField.setAccessible(true);
      if ((View)localField.get(localObject2) != this.o)
      {
        localField.set(localObject2, this.o);
        localObject1 = ((Class)localObject1).getDeclaredMethod("updateViewLocationInWindow", new Class[0]);
        ((Method)localObject1).setAccessible(true);
        ((Method)localObject1).invoke(paramActionMode, new Object[0]);
      }
      return;
    }
    catch (java.lang.Throwable paramActionMode)
    {
      n.a("tmessages", paramActionMode);
    }
  }

  private void i()
  {
    int i2 = this.d.getHeight();
    int i1 = i2;
    if (!this.j)
      i1 = i2 - this.k;
    if (this.n != null)
      this.n.a(i1);
  }

  private void j()
  {
    if (a.h);
    for (int i1 = 0; ; i1 = 2)
    {
      a(i1);
      a.a(this.a);
      return;
    }
  }

  public void a(int paramInt1, int paramInt2, String paramString)
  {
    try
    {
      StringBuilder localStringBuilder = new StringBuilder(this.a.getText());
      localStringBuilder.replace(paramInt1, paramInt1 + paramInt2, paramString);
      this.a.setText(localStringBuilder);
      if (paramString.length() + paramInt1 <= this.a.length())
      {
        this.a.setSelection(paramString.length() + paramInt1);
        return;
      }
      this.a.setSelection(this.a.length());
      return;
    }
    catch (Exception paramString)
    {
      n.a("tmessages", paramString);
    }
  }

  public void a(int paramInt, boolean paramBoolean)
  {
    if ((paramInt > a.a(50.0F)) && (this.j) && (!a.i))
    {
      if (paramBoolean)
      {
        this.i = paramInt;
        ApplicationLoader.a.getSharedPreferences("emoji", 0).edit().putInt("kbd_height_land3", this.i).commit();
      }
    }
    else if (f())
      if (!paramBoolean)
        break label231;
    label231: for (int i1 = this.i; ; i1 = this.h)
    {
      FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)this.c.getLayoutParams();
      if ((localLayoutParams.width != a.c.x) || (localLayoutParams.height != i1))
      {
        localLayoutParams.width = a.c.x;
        localLayoutParams.height = i1;
        this.c.setLayoutParams(localLayoutParams);
        if (this.d != null)
        {
          this.k = localLayoutParams.height;
          this.d.requestLayout();
          i();
        }
      }
      if ((this.f != paramInt) || (this.g != paramBoolean))
        break label239;
      i();
      return;
      this.h = paramInt;
      ApplicationLoader.a.getSharedPreferences("emoji", 0).edit().putInt("kbd_height", this.h).commit();
      break;
    }
    label239: this.f = paramInt;
    this.g = paramBoolean;
    boolean bool = this.j;
    if (paramInt > 0);
    for (paramBoolean = true; ; paramBoolean = false)
    {
      this.j = paramBoolean;
      if ((this.j) && (f()))
        a(0);
      if ((this.k != 0) && (!this.j) && (this.j != bool) && (!f()))
      {
        this.k = 0;
        this.d.requestLayout();
      }
      i();
      return;
    }
  }

  public void a(int paramInt, Object[] paramArrayOfObject)
  {
    if ((paramInt == y.at) && (this.c != null))
      this.c.d();
  }

  public boolean a()
  {
    if ((Build.VERSION.SDK_INT >= 23) && (this.e != null))
      try
      {
        this.e.finish();
        this.e = null;
        return true;
      }
      catch (Exception localException)
      {
        while (true)
          n.a("tmessages", localException);
      }
    return false;
  }

  public boolean a(View paramView)
  {
    return paramView == this.c;
  }

  public void b()
  {
    y.a().a(this, y.at);
    this.d.setDelegate(this);
  }

  public void c()
  {
    d();
    if (h())
      g();
    this.j = false;
    y.a().b(this, y.at);
    if (this.d != null)
      this.d.setDelegate(null);
  }

  public void d()
  {
    if (f())
      a(0);
  }

  public void e()
  {
    this.a.requestFocus();
    a.a(this.a);
  }

  public boolean f()
  {
    return (this.c != null) && (this.c.getVisibility() == 0);
  }

  public void g()
  {
    a.b(this.a);
  }

  public int getCursorPosition()
  {
    if (this.a == null)
      return 0;
    return this.a.getSelectionStart();
  }

  public int getEmojiPadding()
  {
    return this.k;
  }

  public CharSequence getFieldCharSequence()
  {
    return this.a.getText();
  }

  public boolean h()
  {
    return ((a.h) && (getLayoutParams() != null) && (((FrameLayout.LayoutParams)getLayoutParams()).bottomMargin == 0)) || (this.j);
  }

  public void setDelegate(a parama)
  {
    this.n = parama;
  }

  public void setFieldFocused(boolean paramBoolean)
  {
    if (this.a == null);
    do
      while (true)
      {
        return;
        if (!paramBoolean)
          break;
        if (this.a.isFocused())
          continue;
        this.a.postDelayed(new Runnable()
        {
          public void run()
          {
            if (al.g(al.this) != null);
            try
            {
              al.g(al.this).requestFocus();
              return;
            }
            catch (Exception localException)
            {
              n.a("tmessages", localException);
            }
          }
        }
        , 600L);
        return;
      }
    while ((!this.a.isFocused()) || (this.j));
    this.a.clearFocus();
  }

  public void setFieldText(CharSequence paramCharSequence)
  {
    if (this.a == null);
    do
    {
      return;
      this.a.setText(paramCharSequence);
      this.a.setSelection(this.a.getText().length());
    }
    while (this.n == null);
    this.n.a(this.a.getText());
  }

  public static abstract interface a
  {
    public abstract void a(int paramInt);

    public abstract void a(CharSequence paramCharSequence);
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.Components.al
 * JD-Core Version:    0.6.0
 */