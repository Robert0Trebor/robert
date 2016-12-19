package org.vidogram.ui.Components;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;
import org.vidogram.SQLite.SQLiteCursor;
import org.vidogram.SQLite.SQLiteDatabase;
import org.vidogram.messenger.ApplicationLoader;
import org.vidogram.messenger.ac;
import org.vidogram.messenger.e;
import org.vidogram.messenger.n;
import org.vidogram.messenger.r;
import org.vidogram.messenger.support.widget.RecyclerView;
import org.vidogram.messenger.support.widget.RecyclerView.a;
import org.vidogram.messenger.support.widget.RecyclerView.g;
import org.vidogram.messenger.support.widget.RecyclerView.i;
import org.vidogram.messenger.support.widget.RecyclerView.l;
import org.vidogram.messenger.support.widget.RecyclerView.r;
import org.vidogram.messenger.support.widget.RecyclerView.u;
import org.vidogram.messenger.support.widget.d;
import org.vidogram.messenger.u;
import org.vidogram.messenger.w;
import org.vidogram.messenger.y;
import org.vidogram.messenger.y.b;
import org.vidogram.tgnet.ConnectionsManager;
import org.vidogram.tgnet.NativeByteBuffer;
import org.vidogram.tgnet.c;
import org.vidogram.tgnet.g.ar;
import org.vidogram.tgnet.g.aw;
import org.vidogram.tgnet.g.en;
import org.vidogram.tgnet.g.hq;
import org.vidogram.tgnet.g.i;
import org.vidogram.tgnet.g.ix;
import org.vidogram.tgnet.g.vw;
import org.vidogram.ui.a.l;
import org.vidogram.ui.c.aq;

public class bd extends org.vidogram.ui.a.h
  implements y.b
{
  private boolean A;
  private String B;
  private int C;
  private int D;
  private FrameLayout i;
  private TextView j;
  private TextView k;
  private LinearLayout l;
  private EditText m;
  private View n;
  private aw o;
  private d p;
  private b q;
  private c r;
  private u s;
  private String t;
  private q u;
  private Drawable v;
  private HashMap<Long, g.hq> w = new HashMap();
  private g.ix x;
  private boolean y;
  private boolean z;

  public bd(Context paramContext, u paramu, String paramString1, boolean paramBoolean, String paramString2)
  {
    super(paramContext, true);
    this.v = paramContext.getResources().getDrawable(2130838147);
    this.B = paramString2;
    this.s = paramu;
    this.r = new c(paramContext);
    this.A = paramBoolean;
    this.t = paramString1;
    if (paramBoolean)
    {
      this.y = true;
      paramString1 = new g.en();
      paramString1.d = paramu.q();
      paramString1.c = org.vidogram.messenger.v.b(paramu.a.d.b);
      ConnectionsManager.a().a(paramString1, new c(paramContext)
      {
      });
    }
    this.a = new FrameLayout(paramContext)
    {
      private boolean b = false;

      protected void onDraw(Canvas paramCanvas)
      {
        bd.f(bd.this).setBounds(0, bd.a(bd.this) - bd.k(), getMeasuredWidth(), getMeasuredHeight());
        bd.f(bd.this).draw(paramCanvas);
      }

      public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
      {
        if ((paramMotionEvent.getAction() == 0) && (bd.a(bd.this) != 0) && (paramMotionEvent.getY() < bd.a(bd.this)))
        {
          bd.this.dismiss();
          return true;
        }
        return super.onInterceptTouchEvent(paramMotionEvent);
      }

      protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
      {
        super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
        bd.e(bd.this);
      }

      protected void onMeasure(int paramInt1, int paramInt2)
      {
        int i = View.MeasureSpec.getSize(paramInt2);
        paramInt2 = i;
        if (Build.VERSION.SDK_INT >= 21)
          paramInt2 = i - org.vidogram.messenger.a.a;
        int j = Math.max(bd.b(bd.this).a(), bd.c(bd.this).a());
        i = org.vidogram.messenger.a.a(48.0F);
        j = Math.max(3, (int)Math.ceil(j / 4.0F));
        int k = org.vidogram.messenger.a.a(100.0F);
        j = bd.j() + (j * k + i);
        if (j < paramInt2);
        for (i = 0; ; i = paramInt2 - paramInt2 / 5 * 3 + org.vidogram.messenger.a.a(8.0F))
        {
          if (bd.d(bd.this).getPaddingTop() != i)
          {
            this.b = true;
            bd.d(bd.this).setPadding(0, i, 0, org.vidogram.messenger.a.a(8.0F));
            this.b = false;
          }
          super.onMeasure(paramInt1, View.MeasureSpec.makeMeasureSpec(Math.min(j, paramInt2), 1073741824));
          return;
        }
      }

      public boolean onTouchEvent(MotionEvent paramMotionEvent)
      {
        return (!bd.this.e()) && (super.onTouchEvent(paramMotionEvent));
      }

      public void requestLayout()
      {
        if (this.b)
          return;
        super.requestLayout();
      }
    };
    this.a.setWillNotDraw(false);
    this.a.setPadding(g, 0, g, 0);
    this.i = new FrameLayout(paramContext);
    this.i.setBackgroundColor(-1);
    this.i.setOnTouchListener(new View.OnTouchListener()
    {
      public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
      {
        return true;
      }
    });
    this.l = new LinearLayout(paramContext);
    this.l.setOrientation(0);
    this.l.setBackgroundDrawable(l.a(788529152, false));
    this.l.setPadding(org.vidogram.messenger.a.a(21.0F), 0, org.vidogram.messenger.a.a(21.0F), 0);
    this.i.addView(this.l, v.b(-2, -1, 53));
    this.l.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramView)
      {
        if ((bd.g(bd.this).isEmpty()) && ((bd.h(bd.this)) || (bd.i(bd.this) != null)))
        {
          if ((bd.i(bd.this) == null) && (bd.j(bd.this)))
          {
            bd.a(bd.this, true);
            Toast.makeText(bd.this.getContext(), r.a("Loading", 2131231394), 0).show();
          }
          while (true)
          {
            bd.this.dismiss();
            return;
            bd.a(bd.this, bd.this.getContext());
          }
        }
        Object localObject;
        if (bd.k(bd.this) != null)
        {
          paramView = new ArrayList();
          paramView.add(bd.k(bd.this));
          localObject = bd.g(bd.this).entrySet().iterator();
          while (((Iterator)localObject).hasNext())
          {
            Map.Entry localEntry = (Map.Entry)((Iterator)localObject).next();
            ac.a().a(paramView, ((Long)localEntry.getKey()).longValue());
          }
        }
        if (bd.l(bd.this) != null)
        {
          paramView = bd.g(bd.this).entrySet().iterator();
          while (paramView.hasNext())
          {
            localObject = (Map.Entry)paramView.next();
            ac.a().a(bd.l(bd.this), ((Long)((Map.Entry)localObject).getKey()).longValue(), null, null, true, null, null, null);
          }
        }
        bd.this.dismiss();
      }
    });
    this.j = new TextView(paramContext);
    this.j.setTypeface(org.vidogram.messenger.a.a("fonts/rmedium.ttf"));
    this.j.setTextSize(1, 13.0F);
    this.j.setTextColor(-1);
    this.j.setGravity(17);
    this.j.setBackgroundResource(2130837636);
    this.j.setMinWidth(org.vidogram.messenger.a.a(23.0F));
    this.j.setPadding(org.vidogram.messenger.a.a(8.0F), 0, org.vidogram.messenger.a.a(8.0F), org.vidogram.messenger.a.a(1.0F));
    this.l.addView(this.j, v.b(-2, 23, 16, 0, 0, 10, 0));
    this.k = new TextView(paramContext);
    this.k.setTextSize(1, 14.0F);
    this.k.setGravity(17);
    this.k.setCompoundDrawablePadding(org.vidogram.messenger.a.a(8.0F));
    this.k.setTypeface(org.vidogram.messenger.a.a("fonts/rmedium.ttf"));
    this.l.addView(this.k, v.d(-2, -2, 16));
    paramu = new ImageView(paramContext);
    paramu.setImageResource(2130838128);
    paramu.setScaleType(ImageView.ScaleType.CENTER);
    paramu.setPadding(0, org.vidogram.messenger.a.a(2.0F), 0, 0);
    this.i.addView(paramu, v.b(48, 48, 19));
    this.m = new EditText(paramContext);
    this.m.setHint(r.a("ShareSendTo", 2131231838));
    this.m.setMaxLines(1);
    this.m.setSingleLine(true);
    this.m.setGravity(19);
    this.m.setTextSize(1, 16.0F);
    this.m.setBackgroundDrawable(null);
    this.m.setHintTextColor(-6842473);
    this.m.setImeOptions(268435456);
    this.m.setInputType(16385);
    org.vidogram.messenger.a.a(this.m);
    this.m.setTextColor(-14606047);
    this.i.addView(this.m, v.a(-1, -1.0F, 51, 48.0F, 2.0F, 96.0F, 0.0F));
    this.m.addTextChangedListener(new TextWatcher()
    {
      public void afterTextChanged(Editable paramEditable)
      {
        paramEditable = bd.m(bd.this).getText().toString();
        if (paramEditable.length() != 0)
        {
          if (bd.d(bd.this).getAdapter() != bd.b(bd.this))
          {
            bd.a(bd.this, bd.n(bd.this));
            bd.d(bd.this).setAdapter(bd.b(bd.this));
            bd.b(bd.this).c();
          }
          if (bd.o(bd.this) != null)
            bd.o(bd.this).setText(r.a("NoResult", 2131231509));
        }
        while (true)
        {
          if (bd.b(bd.this) != null)
            bd.b(bd.this).a(paramEditable);
          return;
          if (bd.d(bd.this).getAdapter() == bd.c(bd.this))
            continue;
          int i = bd.n(bd.this);
          bd.o(bd.this).setText(r.a("NoChats", 2131231490));
          bd.d(bd.this).setAdapter(bd.c(bd.this));
          bd.c(bd.this).c();
          if (i <= 0)
            continue;
          bd.p(bd.this).a(0, -i);
        }
      }

      public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
      {
      }

      public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
      {
      }
    });
    this.o = new aw(paramContext);
    this.o.setTag(Integer.valueOf(13));
    this.o.setPadding(0, 0, 0, org.vidogram.messenger.a.a(8.0F));
    this.o.setClipToPadding(false);
    paramu = this.o;
    paramString1 = new d(getContext(), 4);
    this.p = paramString1;
    paramu.setLayoutManager(paramString1);
    this.o.setHorizontalScrollBarEnabled(false);
    this.o.setVerticalScrollBarEnabled(false);
    this.o.a(new RecyclerView.g()
    {
      public void a(Rect paramRect, View paramView, RecyclerView paramRecyclerView, RecyclerView.r paramr)
      {
        int j = 0;
        paramView = (bd.a)paramRecyclerView.a(paramView);
        if (paramView != null)
        {
          int k = paramView.e();
          if (k % 4 == 0)
          {
            i = 0;
            paramRect.left = i;
            if (k % 4 != 3)
              break label67;
          }
          label67: for (int i = j; ; i = org.vidogram.messenger.a.a(4.0F))
          {
            paramRect.right = i;
            return;
            i = org.vidogram.messenger.a.a(4.0F);
            break;
          }
        }
        paramRect.left = org.vidogram.messenger.a.a(4.0F);
        paramRect.right = org.vidogram.messenger.a.a(4.0F);
      }
    });
    this.a.addView(this.o, v.a(-1, -1.0F, 51, 0.0F, 48.0F, 0.0F, 0.0F));
    paramu = this.o;
    paramString1 = new b(paramContext);
    this.q = paramString1;
    paramu.setAdapter(paramString1);
    this.o.setGlowColor(-657673);
    this.o.setOnItemClickListener(new aw.b()
    {
      public void a(View paramView, int paramInt)
      {
        if (paramInt < 0)
          return;
        g.hq localhq;
        if (bd.d(bd.this).getAdapter() == bd.c(bd.this))
        {
          localhq = bd.c(bd.this).e(paramInt);
          label37: if (localhq == null)
            break label111;
          paramView = (aq)paramView;
          if (!bd.g(bd.this).containsKey(Long.valueOf(localhq.m)))
            break label113;
          bd.g(bd.this).remove(Long.valueOf(localhq.m));
          paramView.a(false, true);
        }
        while (true)
        {
          bd.this.i();
          return;
          localhq = bd.b(bd.this).e(paramInt);
          break label37;
          label111: break;
          label113: bd.g(bd.this).put(Long.valueOf(localhq.m), localhq);
          paramView.a(true, true);
        }
      }
    });
    this.o.setOnScrollListener(new RecyclerView.l()
    {
      public void a(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
      {
        bd.e(bd.this);
      }
    });
    this.u = new q(paramContext);
    this.u.setShowAtCenter(true);
    this.u.b();
    this.u.setText(r.a("NoChats", 2131231490));
    this.o.setEmptyView(this.u);
    this.a.addView(this.u, v.a(-1, -1.0F, 51, 0.0F, 48.0F, 0.0F, 0.0F));
    this.a.addView(this.i, v.b(-1, 48, 51));
    this.n = new View(paramContext);
    this.n.setBackgroundResource(2130837787);
    this.a.addView(this.n, v.a(-1, 3.0F, 51, 0.0F, 48.0F, 0.0F, 0.0F));
    i();
    if (!org.vidogram.ui.v.i)
    {
      org.vidogram.messenger.v.a().b(0, 100, true);
      org.vidogram.messenger.f.a().c();
      org.vidogram.ui.v.i = true;
    }
    if (b.a(this.q).isEmpty())
      y.a().a(this, y.c);
  }

  private void a(Context paramContext)
  {
    if ((this.x == null) && (this.B == null))
      return;
    while (true)
    {
      try
      {
        ClipboardManager localClipboardManager = (ClipboardManager)ApplicationLoader.a.getSystemService("clipboard");
        if (this.B != null)
        {
          str = this.B;
          localClipboardManager.setPrimaryClip(ClipData.newPlainText("label", str));
          Toast.makeText(paramContext, r.a("LinkCopied", 2131231383), 0).show();
          return;
        }
      }
      catch (Exception paramContext)
      {
        n.a("tmessages", paramContext);
        return;
      }
      String str = this.x.c;
    }
  }

  private int l()
  {
    if (this.o.getChildCount() != 0)
    {
      View localView = this.o.getChildAt(0);
      a locala = (a)this.o.c(localView);
      if (locala != null)
      {
        int i2 = this.o.getPaddingTop();
        if ((locala.e() == 0) && (localView.getTop() >= 0));
        for (int i1 = localView.getTop(); ; i1 = 0)
          return i2 - i1;
      }
    }
    return -1000;
  }

  @SuppressLint({"NewApi"})
  private void m()
  {
    if (this.o.getChildCount() <= 0);
    while (true)
    {
      return;
      Object localObject = this.o.getChildAt(0);
      a locala = (a)this.o.c((View)localObject);
      int i1 = ((View)localObject).getTop() - org.vidogram.messenger.a.a(8.0F);
      if ((i1 > 0) && (locala != null) && (locala.e() == 0));
      while (this.C != i1)
      {
        localObject = this.o;
        this.C = i1;
        ((aw)localObject).setTopGlowOffset(i1);
        this.i.setTranslationY(this.C);
        this.n.setTranslationY(this.C);
        this.u.setTranslationY(this.C);
        this.a.invalidate();
        return;
        i1 = 0;
      }
    }
  }

  public void a(int paramInt, Object[] paramArrayOfObject)
  {
    if (paramInt == y.c)
    {
      if (this.q != null)
        this.q.d();
      y.a().b(this, y.c);
    }
  }

  protected boolean a()
  {
    return false;
  }

  public void dismiss()
  {
    super.dismiss();
    y.a().b(this, y.c);
  }

  public void i()
  {
    if (this.w.isEmpty())
    {
      this.j.setVisibility(8);
      if ((!this.A) && (this.B == null))
      {
        this.k.setTextColor(-5000269);
        this.l.setEnabled(false);
        this.k.setText(r.a("Send", 2131231793).toUpperCase());
        return;
      }
      this.k.setTextColor(-12940081);
      this.l.setEnabled(true);
      this.k.setText(r.a("CopyLink", 2131231089).toUpperCase());
      return;
    }
    this.k.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
    this.j.setVisibility(0);
    this.j.setText(String.format("%d", new Object[] { Integer.valueOf(this.w.size()) }));
    this.k.setTextColor(-12664327);
    this.l.setEnabled(true);
    this.k.setText(r.a("Send", 2131231793).toUpperCase());
  }

  private class a extends RecyclerView.u
  {
    public a(View arg2)
    {
      super();
    }
  }

  private class b extends RecyclerView.a
  {
    private Context b;
    private ArrayList<g.hq> c = new ArrayList();

    public b(Context arg2)
    {
      Object localObject;
      this.b = localObject;
      d();
    }

    public int a()
    {
      return this.c.size();
    }

    public int a(int paramInt)
    {
      return 0;
    }

    public RecyclerView.u a(ViewGroup paramViewGroup, int paramInt)
    {
      paramViewGroup = new aq(this.b);
      paramViewGroup.setLayoutParams(new RecyclerView.i(-1, org.vidogram.messenger.a.a(100.0F)));
      return new bd.a(bd.this, paramViewGroup);
    }

    public void a(RecyclerView.u paramu, int paramInt)
    {
      paramu = (aq)paramu.a;
      g.hq localhq = e(paramInt);
      paramu.a((int)localhq.m, bd.g(bd.this).containsKey(Long.valueOf(localhq.m)), null);
    }

    public long b(int paramInt)
    {
      return paramInt;
    }

    public void d()
    {
      this.c.clear();
      int i = 0;
      if (i < org.vidogram.messenger.v.a().b.size())
      {
        g.hq localhq = (g.hq)org.vidogram.messenger.v.a().b.get(i);
        int j = (int)localhq.m;
        int k = (int)(localhq.m >> 32);
        if ((j != 0) && (k != 1))
        {
          if (j <= 0)
            break label84;
          this.c.add(localhq);
        }
        while (true)
        {
          i += 1;
          break;
          label84: g.i locali = org.vidogram.messenger.v.a().b(Integer.valueOf(-j));
          if ((locali == null) || (e.c(locali)) || ((e.d(locali)) && (!locali.c) && (!locali.n) && (!locali.r)))
            continue;
          this.c.add(localhq);
        }
      }
      c();
    }

    public g.hq e(int paramInt)
    {
      if ((paramInt < 0) || (paramInt >= this.c.size()))
        return null;
      return (g.hq)this.c.get(paramInt);
    }
  }

  public class c extends RecyclerView.a
  {
    private Context b;
    private Timer c;
    private ArrayList<a> d = new ArrayList();
    private String e;
    private int f = 0;
    private int g = 0;

    public c(Context arg2)
    {
      Object localObject;
      this.b = localObject;
    }

    private void a(String paramString, int paramInt)
    {
      w.a().c().b(new Runnable(paramString, paramInt)
      {
        public void run()
        {
          Object localObject3;
          int i;
          String[] arrayOfString;
          Object localObject4;
          int j;
          HashMap localHashMap;
          Object localObject5;
          int k;
          int m;
          while (true)
          {
            try
            {
              localObject3 = this.a.trim().toLowerCase();
              if (((String)localObject3).length() != 0)
                continue;
              bd.c.a(bd.c.this, -1);
              bd.c.a(bd.c.this, new ArrayList(), bd.c.a(bd.c.this));
              return;
              Object localObject1 = r.a().a((String)localObject3);
              if (((String)localObject3).equals(localObject1))
                break label1615;
              if (((String)localObject1).length() != 0)
                break label1612;
              break label1615;
              arrayOfString = new String[i + 1];
              arrayOfString[0] = localObject3;
              if (localObject1 == null)
                continue;
              arrayOfString[1] = localObject1;
              localObject1 = new ArrayList();
              localObject4 = new ArrayList();
              i = 0;
              j = 0;
              localHashMap = new HashMap();
              localObject3 = w.a().b().b("SELECT did, date FROM dialogs ORDER BY date DESC LIMIT 400", new Object[0]);
              if (!((SQLiteCursor)localObject3).a())
                break;
              long l = ((SQLiteCursor)localObject3).d(0);
              localObject5 = new bd.c.a(bd.c.this, null);
              ((bd.c.a)localObject5).c = ((SQLiteCursor)localObject3).b(1);
              localHashMap.put(Long.valueOf(l), localObject5);
              k = (int)l;
              m = (int)(l >> 32);
              if ((k == 0) || (m == 1))
                continue;
              if (k <= 0)
                break label275;
              if (((ArrayList)localObject1).contains(Integer.valueOf(k)))
                continue;
              ((ArrayList)localObject1).add(Integer.valueOf(k));
              continue;
            }
            catch (Exception localException)
            {
              n.a("tmessages", localException);
              return;
            }
            label270: i = 0;
            continue;
            label275: m = -k;
            if (((ArrayList)localObject4).contains(Integer.valueOf(m)))
              continue;
            ((ArrayList)localObject4).add(Integer.valueOf(-k));
          }
          ((SQLiteCursor)localObject3).b();
          label358: String str1;
          Object localObject2;
          label397: label420: label429: String str2;
          if (!localException.isEmpty())
          {
            localObject5 = w.a().b().b(String.format(Locale.US, "SELECT data, status, name FROM users WHERE uid IN(%s)", new Object[] { TextUtils.join(",", localException) }), new Object[0]);
            i = j;
            if (((SQLiteCursor)localObject5).a())
            {
              str1 = ((SQLiteCursor)localObject5).e(2);
              localObject2 = r.a().a(str1);
              if (!str1.equals(localObject2))
                break label1609;
              localObject2 = null;
              j = str1.lastIndexOf(";;;");
              if (j == -1)
                break label1603;
              localObject3 = str1.substring(j + 3);
              m = arrayOfString.length;
              k = 0;
              j = 0;
              if (k < m)
              {
                str2 = arrayOfString[k];
                if ((str1.startsWith(str2)) || (str1.contains(" " + str2)))
                  break label1628;
                if (localObject2 != null)
                {
                  if (((String)localObject2).startsWith(str2))
                    break label1628;
                  if (((String)localObject2).contains(" " + str2))
                  {
                    break label1628;
                    label525: if (j == 0)
                      break label1636;
                    localObject3 = ((SQLiteCursor)localObject5).g(0);
                    if (localObject3 == null)
                      break label1597;
                    localObject2 = g.vw.a((org.vidogram.tgnet.a)localObject3, ((NativeByteBuffer)localObject3).b(false), false);
                    ((NativeByteBuffer)localObject3).e();
                    localObject3 = (bd.c.a)localHashMap.get(Long.valueOf(((g.vw)localObject2).d));
                    if (((g.vw)localObject2).k != null)
                      ((g.vw)localObject2).k.c = ((SQLiteCursor)localObject5).b(1);
                    if (j != 1)
                      break label675;
                  }
                }
                label675: for (((bd.c.a)localObject3).d = org.vidogram.messenger.a.a(((g.vw)localObject2).e, ((g.vw)localObject2).f, str2); ; ((bd.c.a)localObject3).d = org.vidogram.messenger.a.a("@" + ((g.vw)localObject2).g, null, "@" + str2))
                {
                  ((bd.c.a)localObject3).b = ((org.vidogram.tgnet.f)localObject2);
                  ((bd.c.a)localObject3).a.m = ((g.vw)localObject2).d;
                  i += 1;
                  break label1633;
                  if ((localObject3 == null) || (!((String)localObject3).startsWith(str2)))
                    break label1600;
                  j = 2;
                  break;
                }
              }
            }
            else
            {
              ((SQLiteCursor)localObject5).b();
            }
          }
          else
          {
            j = i;
            if (!((ArrayList)localObject4).isEmpty())
            {
              localObject4 = w.a().b().b(String.format(Locale.US, "SELECT data, name FROM chats WHERE uid IN(%s)", new Object[] { TextUtils.join(",", (Iterable)localObject4) }), new Object[0]);
              label782: 
              while (((SQLiteCursor)localObject4).a())
              {
                localObject5 = ((SQLiteCursor)localObject4).e(1);
                localObject3 = r.a().a((String)localObject5);
                localObject2 = localObject3;
                if (!((String)localObject5).equals(localObject3))
                  break label1643;
                localObject2 = null;
                break label1643;
                label828: if (j >= arrayOfString.length)
                  break label1656;
                localObject3 = arrayOfString[j];
                if ((!((String)localObject5).startsWith((String)localObject3)) && (!((String)localObject5).contains(" " + (String)localObject3)) && ((localObject2 == null) || ((!((String)localObject2).startsWith((String)localObject3)) && (!((String)localObject2).contains(" " + (String)localObject3)))))
                  break label1651;
                localObject5 = ((SQLiteCursor)localObject4).g(0);
                if (localObject5 == null)
                  continue;
                localObject2 = g.i.a((org.vidogram.tgnet.a)localObject5, ((NativeByteBuffer)localObject5).b(false), false);
                ((NativeByteBuffer)localObject5).e();
                if ((localObject2 == null) || (e.c((g.i)localObject2)) || ((e.d((g.i)localObject2)) && (!((g.i)localObject2).c) && (!((g.i)localObject2).n) && (!((g.i)localObject2).r)))
                  break label1594;
                localObject5 = (bd.c.a)localHashMap.get(Long.valueOf(-((g.i)localObject2).h));
                ((bd.c.a)localObject5).d = org.vidogram.messenger.a.a(((g.i)localObject2).i, null, (String)localObject3);
                ((bd.c.a)localObject5).b = ((org.vidogram.tgnet.f)localObject2);
                ((bd.c.a)localObject5).a.m = (-((g.i)localObject2).h);
                i += 1;
                break label1648;
              }
              ((SQLiteCursor)localObject4).b();
              j = i;
            }
            localObject4 = new ArrayList(j);
            localObject2 = localHashMap.values().iterator();
            while (((Iterator)localObject2).hasNext())
            {
              localObject3 = (bd.c.a)((Iterator)localObject2).next();
              if ((((bd.c.a)localObject3).b == null) || (((bd.c.a)localObject3).d == null))
                continue;
              ((ArrayList)localObject4).add(localObject3);
            }
            localObject5 = w.a().b().b("SELECT u.data, u.status, u.name, u.uid FROM users as u INNER JOIN contacts as c ON u.uid = c.uid", new Object[0]);
          }
          label1670: 
          while (true)
          {
            label1160: if (((SQLiteCursor)localObject5).a())
            {
              if (localHashMap.containsKey(Long.valueOf(((SQLiteCursor)localObject5).b(3))))
                continue;
              str1 = ((SQLiteCursor)localObject5).e(2);
              localObject2 = r.a().a(str1);
              if (!str1.equals(localObject2))
                break label1591;
              localObject2 = null;
              label1217: i = str1.lastIndexOf(";;;");
              if (i == -1)
                break label1585;
              localObject3 = str1.substring(i + 3);
              label1240: m = arrayOfString.length;
              k = 0;
              j = 0;
            }
            while (true)
            {
              if (j >= m)
                break label1670;
              str2 = arrayOfString[j];
              if ((!str1.startsWith(str2)) && (!str1.contains(" " + str2)))
                if (localObject2 != null)
                {
                  if (((String)localObject2).startsWith(str2))
                    break label1658;
                  if (((String)localObject2).contains(" " + str2))
                    break label1658;
                }
              while (true)
              {
                label1345: if (i == 0)
                  break label1663;
                localObject3 = ((SQLiteCursor)localObject5).g(0);
                if (localObject3 == null)
                  break label1160;
                localObject2 = g.vw.a((org.vidogram.tgnet.a)localObject3, ((NativeByteBuffer)localObject3).b(false), false);
                ((NativeByteBuffer)localObject3).e();
                localObject3 = new bd.c.a(bd.c.this, null);
                if (((g.vw)localObject2).k != null)
                  ((g.vw)localObject2).k.c = ((SQLiteCursor)localObject5).b(1);
                ((bd.c.a)localObject3).a.m = ((g.vw)localObject2).d;
                ((bd.c.a)localObject3).b = ((org.vidogram.tgnet.f)localObject2);
                if (i == 1);
                for (((bd.c.a)localObject3).d = org.vidogram.messenger.a.a(((g.vw)localObject2).e, ((g.vw)localObject2).f, str2); ; ((bd.c.a)localObject3).d = org.vidogram.messenger.a.a("@" + ((g.vw)localObject2).g, null, "@" + str2))
                {
                  ((ArrayList)localObject4).add(localObject3);
                  break;
                  i = k;
                  if (localObject3 == null)
                    break label1345;
                  i = k;
                  if (!((String)localObject3).startsWith(str2))
                    break label1345;
                  i = 2;
                  break label1345;
                }
                ((SQLiteCursor)localObject5).b();
                Collections.sort((List)localObject4, new Comparator()
                {
                  public int a(bd.c.a parama1, bd.c.a parama2)
                  {
                    if (parama1.c < parama2.c)
                      return 1;
                    if (parama1.c > parama2.c)
                      return -1;
                    return 0;
                  }
                });
                bd.c.a(bd.c.this, (ArrayList)localObject4, this.b);
                return;
                label1585: localObject3 = null;
                break label1240;
                label1591: break label1217;
                label1594: break label1648;
                label1597: break label1633;
                label1600: break label525;
                label1603: localObject3 = null;
                break label420;
                label1609: break label397;
                label1612: break label1618;
                label1615: localObject2 = null;
                label1618: if (localObject2 == null)
                  break label270;
                i = 1;
                break;
                label1628: j = 1;
                break label525;
                label1633: break label358;
                label1636: k += 1;
                break label429;
                label1643: j = 0;
                break label828;
                label1648: break label782;
                label1651: j += 1;
                break label828;
                label1656: break label782;
                label1658: i = 1;
              }
              label1663: j += 1;
              k = i;
            }
          }
        }
      });
    }

    private void a(ArrayList<a> paramArrayList, int paramInt)
    {
      org.vidogram.messenger.a.a(new Runnable(paramInt, paramArrayList)
      {
        public void run()
        {
          int j = 1;
          if (this.a != bd.c.a(bd.c.this))
            return;
          int i = 0;
          if (i < this.b.size())
          {
            Object localObject = (bd.c.a)this.b.get(i);
            if ((((bd.c.a)localObject).b instanceof g.vw))
            {
              localObject = (g.vw)((bd.c.a)localObject).b;
              org.vidogram.messenger.v.a().a((g.vw)localObject, true);
            }
            while (true)
            {
              i += 1;
              break;
              if (!(((bd.c.a)localObject).b instanceof g.i))
                continue;
              localObject = (g.i)((bd.c.a)localObject).b;
              org.vidogram.messenger.v.a().a((g.i)localObject, true);
            }
          }
          if ((!bd.c.b(bd.c.this).isEmpty()) && (this.b.isEmpty()))
          {
            i = 1;
            label130: if ((!bd.c.b(bd.c.this).isEmpty()) || (!this.b.isEmpty()))
              break label263;
          }
          while (true)
          {
            if (i != 0)
              bd.a(bd.this, bd.n(bd.this));
            bd.c.a(bd.c.this, this.b);
            bd.c.this.c();
            if ((j != 0) || (i != 0) || (bd.q(bd.this) <= 0))
              break;
            bd.p(bd.this).a(0, -bd.q(bd.this));
            bd.a(bd.this, -1000);
            return;
            i = 0;
            break label130;
            label263: j = 0;
          }
        }
      });
    }

    public int a()
    {
      return this.d.size();
    }

    public int a(int paramInt)
    {
      return 0;
    }

    public RecyclerView.u a(ViewGroup paramViewGroup, int paramInt)
    {
      paramViewGroup = new aq(this.b);
      paramViewGroup.setLayoutParams(new RecyclerView.i(-1, org.vidogram.messenger.a.a(100.0F)));
      return new bd.a(bd.this, paramViewGroup);
    }

    public void a(String paramString)
    {
      if ((paramString != null) && (this.e != null) && (paramString.equals(this.e)))
        return;
      this.e = paramString;
      try
      {
        if (this.c != null)
        {
          this.c.cancel();
          this.c = null;
        }
        if ((paramString == null) || (paramString.length() == 0))
        {
          this.d.clear();
          bd.a(bd.this, bd.n(bd.this));
          c();
          return;
        }
      }
      catch (Exception localException)
      {
        while (true)
          n.a("tmessages", localException);
        int i = this.g + 1;
        this.g = i;
        this.c = new Timer();
        this.c.schedule(new TimerTask(paramString, i)
        {
          public void run()
          {
            try
            {
              cancel();
              bd.c.c(bd.c.this).cancel();
              bd.c.a(bd.c.this, null);
              bd.c.a(bd.c.this, this.a, this.b);
              return;
            }
            catch (Exception localException)
            {
              while (true)
                n.a("tmessages", localException);
            }
          }
        }
        , 200L, 300L);
      }
    }

    public void a(RecyclerView.u paramu, int paramInt)
    {
      paramu = (aq)paramu.a;
      a locala = (a)this.d.get(paramInt);
      paramu.a((int)locala.a.m, bd.g(bd.this).containsKey(Long.valueOf(locala.a.m)), locala.d);
    }

    public long b(int paramInt)
    {
      return paramInt;
    }

    public g.hq e(int paramInt)
    {
      return ((a)this.d.get(paramInt)).a;
    }

    private class a
    {
      public g.hq a = new g.hq();
      public org.vidogram.tgnet.f b;
      public int c;
      public CharSequence d;

      private a()
      {
      }
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.Components.bd
 * JD-Core Version:    0.6.0
 */