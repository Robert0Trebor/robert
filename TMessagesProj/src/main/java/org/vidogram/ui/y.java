package org.vidogram.ui;

import android.app.AlertDialog.Builder;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnTouchListener;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.vidogram.a.b;
import org.vidogram.messenger.ApplicationLoader;
import org.vidogram.messenger.ae;
import org.vidogram.messenger.n;
import org.vidogram.messenger.r;
import org.vidogram.messenger.y.b;
import org.vidogram.tgnet.g.vw;
import org.vidogram.ui.Components.k;
import org.vidogram.ui.Components.x;
import org.vidogram.ui.a.a.a;
import org.vidogram.ui.a.c;
import org.vidogram.ui.a.g;
import org.vidogram.ui.b.f;
import org.vidogram.ui.b.o;
import org.vidogram.ui.c.bh;

public class y extends g
  implements y.b
{
  private f i;
  private TextView j;
  private EditText k;
  private x l;
  private o m;
  private a n;
  private int o;
  private boolean p;
  private CharSequence q;
  private int r = 5000;
  private int s = 0;
  private boolean t;
  private boolean u;
  private boolean v;
  private boolean w;
  private boolean x;
  private HashMap<Integer, k> y = new HashMap();
  private ArrayList<k> z = new ArrayList();

  public y()
  {
  }

  public y(Bundle paramBundle)
  {
    super(paramBundle);
    this.s = paramBundle.getInt("chatType", 0);
    this.t = paramBundle.getBoolean("isAlwaysShare", false);
    this.u = paramBundle.getBoolean("isNeverShare", false);
    this.x = paramBundle.getBoolean("isGroup", false);
    if (this.s == 0);
    for (int i1 = org.vidogram.messenger.v.a().E; ; i1 = org.vidogram.messenger.v.a().D)
    {
      this.r = i1;
      return;
    }
  }

  private k a(g.vw paramvw)
  {
    Object localObject3 = ((LayoutInflater)ApplicationLoader.a.getSystemService("layout_inflater")).inflate(2130968616, null);
    TextView localTextView = (TextView)((View)localObject3).findViewById(2131624078);
    Object localObject2 = ae.c(paramvw);
    Object localObject1 = localObject2;
    if (((String)localObject2).length() == 0)
    {
      localObject1 = localObject2;
      if (paramvw.i != null)
      {
        localObject1 = localObject2;
        if (paramvw.i.length() != 0)
          localObject1 = b.a().e("+" + paramvw.i);
      }
    }
    localTextView.setText((String)localObject1 + ", ");
    int i1 = View.MeasureSpec.makeMeasureSpec(0, 0);
    ((View)localObject3).measure(i1, i1);
    ((View)localObject3).layout(0, 0, ((View)localObject3).getMeasuredWidth(), ((View)localObject3).getMeasuredHeight());
    localObject1 = Bitmap.createBitmap(((View)localObject3).getWidth(), ((View)localObject3).getHeight(), Bitmap.Config.ARGB_8888);
    localObject2 = new Canvas((Bitmap)localObject1);
    ((Canvas)localObject2).translate(-((View)localObject3).getScrollX(), -((View)localObject3).getScrollY());
    ((View)localObject3).draw((Canvas)localObject2);
    ((View)localObject3).setDrawingCacheEnabled(true);
    ((View)localObject3).getDrawingCache().copy(Bitmap.Config.ARGB_8888, true);
    ((View)localObject3).destroyDrawingCache();
    localObject2 = new BitmapDrawable((Bitmap)localObject1);
    ((BitmapDrawable)localObject2).setBounds(0, 0, ((Bitmap)localObject1).getWidth(), ((Bitmap)localObject1).getHeight());
    localObject1 = new SpannableStringBuilder("");
    localObject2 = new k((Drawable)localObject2, 1);
    this.z.add(localObject2);
    this.y.put(Integer.valueOf(paramvw.d), localObject2);
    paramvw = this.z.iterator();
    while (paramvw.hasNext())
    {
      localObject3 = (ImageSpan)paramvw.next();
      ((SpannableStringBuilder)localObject1).append("<<");
      ((SpannableStringBuilder)localObject1).setSpan(localObject3, ((SpannableStringBuilder)localObject1).length() - 2, ((SpannableStringBuilder)localObject1).length(), 33);
    }
    this.k.setText((CharSequence)localObject1);
    this.k.setSelection(((SpannableStringBuilder)localObject1).length());
    return (k)(k)(k)localObject2;
  }

  private void a(int paramInt)
  {
    if (this.l != null)
    {
      int i2 = this.l.getChildCount();
      int i1 = 0;
      while (i1 < i2)
      {
        View localView = this.l.getChildAt(i1);
        if ((localView instanceof bh))
          ((bh)localView).a(paramInt);
        i1 += 1;
      }
    }
  }

  public View a(Context paramContext)
  {
    this.w = false;
    this.v = false;
    this.d.setBackButtonImage(2130837794);
    this.d.setAllowOverlayTitle(true);
    Object localObject1;
    Object localObject2;
    if (this.t)
      if (this.x)
      {
        this.d.setTitle(r.a("AlwaysAllow", 2131230838));
        this.d.setActionBarMenuOnItemClick(new a.a()
        {
          public void a(int paramInt)
          {
            if (paramInt == -1)
              y.this.d();
            do
              return;
            while ((paramInt != 1) || (y.a(y.this).isEmpty()));
            ArrayList localArrayList = new ArrayList();
            localArrayList.addAll(y.a(y.this).keySet());
            if ((y.b(y.this)) || (y.c(y.this)))
            {
              if (y.d(y.this) != null)
                y.d(y.this).a(localArrayList);
              y.this.d();
              return;
            }
            Bundle localBundle = new Bundle();
            localBundle.putIntegerArrayList("result", localArrayList);
            localBundle.putInt("chatType", y.e(y.this));
            y.this.a(new z(localBundle));
          }
        });
        this.d.a().b(1, 2130837825, org.vidogram.messenger.a.a(56.0F));
        this.m = new o(paramContext, null, false, false, false, false);
        this.m.a(this.y);
        this.m.a(true);
        this.i = new f(paramContext, 1, false, null, false);
        this.i.a(this.y);
        this.b = new LinearLayout(paramContext);
        localObject1 = (LinearLayout)this.b;
        ((LinearLayout)localObject1).setOrientation(1);
        localObject2 = new FrameLayout(paramContext);
        ((LinearLayout)localObject1).addView((View)localObject2, org.vidogram.ui.Components.v.b(-1, -2));
        this.k = new EditText(paramContext);
        this.k.setTextSize(1, 16.0F);
        this.k.setHintTextColor(-6842473);
        this.k.setTextColor(-14606047);
        this.k.setInputType(655536);
        this.k.setMinimumHeight(org.vidogram.messenger.a.a(54.0F));
        this.k.setSingleLine(false);
        this.k.setLines(2);
        this.k.setMaxLines(2);
        this.k.setVerticalScrollBarEnabled(true);
        this.k.setHorizontalScrollBarEnabled(false);
        this.k.setPadding(0, 0, 0, 0);
        this.k.setImeOptions(268435462);
        EditText localEditText = this.k;
        if (!r.a)
          break label888;
        i1 = 5;
        label345: localEditText.setGravity(i1 | 0x10);
        org.vidogram.messenger.a.a(this.k);
        ((FrameLayout)localObject2).addView(this.k, org.vidogram.ui.Components.v.a(-1, -2.0F, 51, 10.0F, 0.0F, 10.0F, 0.0F));
        if (!this.t)
          break label912;
        if (!this.x)
          break label893;
        this.k.setHint(r.a("AlwaysAllowPlaceholder", 2131230839));
        label417: this.k.setTextIsSelectable(false);
        this.k.addTextChangedListener(new TextWatcher()
        {
          public void afterTextChanged(Editable paramEditable)
          {
            int i;
            if (!y.f(y.this))
            {
              i = y.g(y.this).getSelectionEnd();
              if (paramEditable.toString().length() >= y.h(y.this).toString().length())
                break label456;
              paramEditable = "";
            }
            while (true)
            {
              try
              {
                Object localObject = y.h(y.this).toString().substring(i, y.i(y.this));
                paramEditable = (Editable)localObject;
                if (paramEditable.length() > 0)
                {
                  if ((!y.j(y.this)) || (!y.k(y.this)))
                    break label568;
                  i = 1;
                  paramEditable = y.g(y.this).getText();
                  int j = 0;
                  if (j >= y.l(y.this).size())
                    continue;
                  localObject = (k)y.l(y.this).get(j);
                  if (paramEditable.getSpanStart(localObject) != -1)
                    continue;
                  y.l(y.this).remove(localObject);
                  y.a(y.this).remove(Integer.valueOf(((k)localObject).a));
                  j += 1;
                  continue;
                }
              }
              catch (Exception localException)
              {
                n.a("tmessages", localException);
                continue;
                if ((y.b(y.this)) || (y.c(y.this)))
                  continue;
                y.n(y.this).setSubtitle(r.a("MembersCount", 2131231424, new Object[] { Integer.valueOf(y.a(y.this).size()), Integer.valueOf(y.m(y.this)) }));
                y.o(y.this).invalidateViews();
              }
              while (true)
              {
                if (i != 0)
                {
                  paramEditable = y.g(y.this).getText().toString().replace("<", "");
                  if (paramEditable.length() == 0)
                    break;
                  y.a(y.this, true);
                  y.b(y.this, true);
                  if (y.o(y.this) != null)
                  {
                    y.o(y.this).setAdapter(y.p(y.this));
                    y.p(y.this).notifyDataSetChanged();
                    y.o(y.this).setFastScrollAlwaysVisible(false);
                    y.o(y.this).setFastScrollEnabled(false);
                    y.o(y.this).setVerticalScrollBarEnabled(true);
                  }
                  if (y.q(y.this) != null)
                    y.q(y.this).setText(r.a("NoResult", 2131231509));
                  y.p(y.this).a(paramEditable);
                }
                return;
                i = 1;
                continue;
                label456: i = 1;
              }
              y.p(y.this).a(null);
              y.a(y.this, false);
              y.b(y.this, false);
              y.o(y.this).setAdapter(y.r(y.this));
              y.r(y.this).notifyDataSetChanged();
              y.o(y.this).setFastScrollAlwaysVisible(true);
              y.o(y.this).setFastScrollEnabled(true);
              y.o(y.this).setVerticalScrollBarEnabled(false);
              y.q(y.this).setText(r.a("NoContacts", 2131231492));
              return;
              label568: i = 0;
            }
          }

          public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
          {
            if (!y.f(y.this))
            {
              y.a(y.this, y.g(y.this).getSelectionStart());
              y.a(y.this, new SpannableString(paramCharSequence));
            }
          }

          public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
          {
          }
        });
        localObject2 = new LinearLayout(paramContext);
        ((LinearLayout)localObject2).setVisibility(4);
        ((LinearLayout)localObject2).setOrientation(1);
        ((LinearLayout)localObject1).addView((View)localObject2, org.vidogram.ui.Components.v.b(-1, -1));
        ((LinearLayout)localObject2).setOnTouchListener(new View.OnTouchListener()
        {
          public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
          {
            return true;
          }
        });
        this.j = new TextView(paramContext);
        this.j.setTextColor(-8355712);
        this.j.setTextSize(20.0F);
        this.j.setGravity(17);
        this.j.setText(r.a("NoContacts", 2131231492));
        ((LinearLayout)localObject2).addView(this.j, org.vidogram.ui.Components.v.a(-1, -1, 0.5F));
        ((LinearLayout)localObject2).addView(new FrameLayout(paramContext), org.vidogram.ui.Components.v.a(-1, -1, 0.5F));
        this.l = new x(paramContext);
        this.l.setEmptyView((View)localObject2);
        this.l.setVerticalScrollBarEnabled(false);
        this.l.setDivider(null);
        this.l.setDividerHeight(0);
        this.l.setFastScrollEnabled(true);
        this.l.setScrollBarStyle(33554432);
        this.l.setAdapter(this.i);
        this.l.setFastScrollAlwaysVisible(true);
        paramContext = this.l;
        if (!r.a)
          break label983;
      }
    label912: label983: for (int i1 = 1; ; i1 = 2)
    {
      paramContext.setVerticalScrollbarPosition(i1);
      ((LinearLayout)localObject1).addView(this.l, org.vidogram.ui.Components.v.b(-1, -1));
      this.l.setOnItemClickListener(new AdapterView.OnItemClickListener()
      {
        public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
        {
          if ((y.j(y.this)) && (y.k(y.this)))
          {
            paramAdapterView = (g.vw)y.p(y.this).b(paramInt);
            if (paramAdapterView != null)
              break label94;
          }
          label94: boolean bool;
          label592: label735: 
          do
          {
            int i;
            do
            {
              return;
              i = y.r(y.this).a(paramInt);
              paramInt = y.r(y.this).b(paramInt);
            }
            while ((paramInt < 0) || (i < 0));
            paramAdapterView = (g.vw)y.r(y.this).c(i, paramInt);
            break;
            if (y.a(y.this).containsKey(Integer.valueOf(paramAdapterView.d)));
            while (true)
            {
              try
              {
                Object localObject = (k)y.a(y.this).get(Integer.valueOf(paramAdapterView.d));
                y.a(y.this).remove(Integer.valueOf(paramAdapterView.d));
                paramAdapterView = new SpannableStringBuilder(y.g(y.this).getText());
                paramAdapterView.delete(paramAdapterView.getSpanStart(localObject), paramAdapterView.getSpanEnd(localObject));
                y.l(y.this).remove(localObject);
                y.c(y.this, true);
                y.g(y.this).setText(paramAdapterView);
                y.g(y.this).setSelection(paramAdapterView.length());
                y.c(y.this, false);
                bool = false;
                if ((y.b(y.this)) || (y.c(y.this)))
                  continue;
                y.s(y.this).setSubtitle(r.a("MembersCount", 2131231424, new Object[] { Integer.valueOf(y.a(y.this).size()), Integer.valueOf(y.m(y.this)) }));
                if ((!y.j(y.this)) && (!y.k(y.this)))
                  break label735;
                y.c(y.this, true);
                paramAdapterView = new SpannableStringBuilder("");
                paramView = y.l(y.this).iterator();
                if (!paramView.hasNext())
                  break label592;
                localObject = (ImageSpan)paramView.next();
                paramAdapterView.append("<<");
                paramAdapterView.setSpan(localObject, paramAdapterView.length() - 2, paramAdapterView.length(), 33);
                continue;
              }
              catch (Exception paramAdapterView)
              {
                n.a("tmessages", paramAdapterView);
                bool = false;
                continue;
              }
              if ((y.m(y.this) != 0) && (y.a(y.this).size() == y.m(y.this)))
                break;
              if ((y.e(y.this) == 0) && (y.a(y.this).size() == org.vidogram.messenger.v.a().C))
              {
                paramAdapterView = new AlertDialog.Builder(y.this.l());
                paramAdapterView.setTitle(r.a("AppName", 2131230856));
                paramAdapterView.setMessage(r.a("SoftUserLimitAlert", 2131231861));
                paramAdapterView.setPositiveButton(r.a("OK", 2131231604), null);
                y.this.b(paramAdapterView.create());
                return;
              }
              y.c(y.this, true);
              y.a(y.this, paramAdapterView).a = paramAdapterView.d;
              y.c(y.this, false);
              bool = true;
            }
            y.g(y.this).setText(paramAdapterView);
            y.g(y.this).setSelection(paramAdapterView.length());
            y.c(y.this, false);
            y.p(y.this).a(null);
            y.a(y.this, false);
            y.b(y.this, false);
            y.o(y.this).setAdapter(y.r(y.this));
            y.r(y.this).notifyDataSetChanged();
            y.o(y.this).setFastScrollAlwaysVisible(true);
            y.o(y.this).setFastScrollEnabled(true);
            y.o(y.this).setVerticalScrollBarEnabled(false);
            y.q(y.this).setText(r.a("NoContacts", 2131231492));
            return;
          }
          while (!(paramView instanceof bh));
          ((bh)paramView).a(bool, true);
        }
      });
      this.l.setOnScrollListener(new AbsListView.OnScrollListener()
      {
        public void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
        {
          if (paramAbsListView.isFastScrollEnabled())
            org.vidogram.messenger.a.d(paramAbsListView);
        }

        public void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
        {
          boolean bool = true;
          if (paramInt == 1)
            org.vidogram.messenger.a.b(y.g(y.this));
          if (y.r(y.this) != null)
          {
            paramAbsListView = y.r(y.this);
            if (paramInt == 0)
              break label45;
          }
          while (true)
          {
            paramAbsListView.a(bool);
            return;
            label45: bool = false;
          }
        }
      });
      return this.b;
      this.d.setTitle(r.a("AlwaysShareWithTitle", 2131230842));
      break;
      if (this.u)
      {
        if (this.x)
        {
          this.d.setTitle(r.a("NeverAllow", 2131231470));
          break;
        }
        this.d.setTitle(r.a("NeverShareWithTitle", 2131231474));
        break;
      }
      localObject2 = this.d;
      if (this.s == 0);
      for (localObject1 = r.a("NewGroup", 2131231477); ; localObject1 = r.a("NewBroadcastList", 2131231475))
      {
        ((org.vidogram.ui.a.a)localObject2).setTitle((CharSequence)localObject1);
        this.d.setSubtitle(r.a("MembersCount", 2131231424, new Object[] { Integer.valueOf(this.y.size()), Integer.valueOf(this.r) }));
        break;
      }
      label888: i1 = 3;
      break label345;
      label893: this.k.setHint(r.a("AlwaysShareWithPlaceholder", 2131230841));
      break label417;
      if (this.u)
      {
        if (this.x)
        {
          this.k.setHint(r.a("NeverAllowPlaceholder", 2131231471));
          break label417;
        }
        this.k.setHint(r.a("NeverShareWithPlaceholder", 2131231473));
        break label417;
      }
      this.k.setHint(r.a("SendMessageTo", 2131231801));
      break label417;
    }
  }

  public void a(int paramInt, Object[] paramArrayOfObject)
  {
    if (paramInt == org.vidogram.messenger.y.k)
      if (this.i != null)
        this.i.notifyDataSetChanged();
    do
      while (true)
      {
        return;
        if (paramInt != org.vidogram.messenger.y.b)
          break;
        paramInt = ((Integer)paramArrayOfObject[0]).intValue();
        if (((paramInt & 0x2) == 0) && ((paramInt & 0x1) == 0) && ((paramInt & 0x4) == 0))
          continue;
        a(paramInt);
        return;
      }
    while (paramInt != org.vidogram.messenger.y.l);
    e();
  }

  public void a(a parama)
  {
    this.n = parama;
  }

  public boolean f()
  {
    org.vidogram.messenger.y.a().a(this, org.vidogram.messenger.y.k);
    org.vidogram.messenger.y.a().a(this, org.vidogram.messenger.y.b);
    org.vidogram.messenger.y.a().a(this, org.vidogram.messenger.y.l);
    return super.f();
  }

  public void g()
  {
    super.g();
    org.vidogram.messenger.y.a().b(this, org.vidogram.messenger.y.k);
    org.vidogram.messenger.y.a().b(this, org.vidogram.messenger.y.b);
    org.vidogram.messenger.y.a().b(this, org.vidogram.messenger.y.l);
  }

  public static abstract interface a
  {
    public abstract void a(ArrayList<Integer> paramArrayList);
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.y
 * JD-Core Version:    0.6.0
 */