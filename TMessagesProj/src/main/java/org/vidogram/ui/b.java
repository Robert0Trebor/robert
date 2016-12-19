package org.vidogram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import org.vidogram.messenger.MediaController;
import org.vidogram.messenger.MediaController.e;
import org.vidogram.messenger.m;
import org.vidogram.messenger.p;
import org.vidogram.messenger.u;
import org.vidogram.messenger.y.b;
import org.vidogram.tgnet.g.ar;
import org.vidogram.tgnet.g.hu;
import org.vidogram.tgnet.g.q;
import org.vidogram.tgnet.g.r;
import org.vidogram.ui.Components.v;
import org.vidogram.ui.a.a.a;
import org.vidogram.ui.a.g;
import org.vidogram.ui.a.k;

public class b extends g
  implements MediaController.e, y.b
{
  private ImageView i;
  private ImageView j;
  private ImageView k;
  private ImageView l;
  private ImageView m;
  private org.vidogram.ui.Components.y n;
  private ImageView o;
  private ImageView[] p = new ImageView[5];
  private TextView q;
  private TextView r;
  private a s;
  private int t;
  private String u;

  private void a(float paramFloat)
  {
    MediaController.a().a(MediaController.a().j(), paramFloat);
  }

  private void a(u paramu)
  {
    if (this.s != null)
    {
      if (!this.s.a())
        this.s.a(paramu.k);
      paramu = String.format("%d:%02d", new Object[] { Integer.valueOf(paramu.l / 60), Integer.valueOf(paramu.l % 60) });
      if ((this.u == null) || ((this.u != null) && (!this.u.equals(paramu))))
      {
        this.u = paramu;
        this.r.setText(paramu);
      }
    }
  }

  private void b(u paramu)
  {
    Object localObject2 = null;
    Object localObject1 = localObject2;
    if (paramu.a.A != null)
    {
      localObject1 = localObject2;
      if (paramu.a.A.length() > 0)
      {
        localObject1 = new File(paramu.a.A);
        if (((File)localObject1).exists())
          break label184;
        localObject1 = localObject2;
      }
    }
    label184: 
    while (true)
    {
      localObject2 = localObject1;
      if (localObject1 == null)
        localObject2 = m.b(paramu.a);
      if (!((File)localObject2).exists())
      {
        paramu = paramu.f();
        MediaController.a().a(paramu, this);
        paramu = p.a().a(paramu);
        localObject1 = this.n;
        float f;
        if (paramu != null)
          f = paramu.floatValue();
        while (true)
        {
          ((org.vidogram.ui.Components.y)localObject1).a(f, false);
          this.n.setVisibility(0);
          this.s.setVisibility(4);
          this.j.setEnabled(false);
          return;
          f = 0.0F;
        }
      }
      MediaController.a().a(this);
      this.n.setVisibility(4);
      this.s.setVisibility(0);
      this.j.setEnabled(true);
      return;
    }
  }

  private void b(boolean paramBoolean)
  {
    Object localObject1 = MediaController.a().j();
    if (((localObject1 == null) && (paramBoolean)) || ((localObject1 != null) && (!((u)localObject1).G())))
      if ((this.c != null) && (!this.c.e.isEmpty()) && (this.c.e.get(this.c.e.size() - 1) == this))
        d();
    do
    {
      return;
      e();
      return;
    }
    while (localObject1 == null);
    b((u)localObject1);
    a((u)localObject1);
    label114: Object localObject2;
    if (MediaController.a().s())
    {
      this.j.setImageResource(2130838091);
      if (this.d != null)
      {
        this.d.setTitle(((u)localObject1).O());
        this.d.getTitleTextView().setTextColor(-14606047);
        this.d.setSubtitle(((u)localObject1).Q());
        this.d.getSubtitleTextView().setTextColor(-7697782);
      }
      localObject2 = MediaController.a().n();
      if ((localObject2 == null) || (((org.vidogram.messenger.a.a)localObject2).r() == null))
        break label338;
      this.i.setImageBitmap(((org.vidogram.messenger.a.a)localObject2).r());
      this.i.setPadding(0, 0, 0, 0);
      this.i.setScaleType(ImageView.ScaleType.CENTER_CROP);
      label222: if (this.q == null)
        break label375;
      localObject1 = ((u)localObject1).A();
      if (localObject1 == null)
        break label391;
      i1 = 0;
      label240: if (i1 >= ((g.q)localObject1).o.size())
        break label391;
      localObject2 = (g.r)((g.q)localObject1).o.get(i1);
      if (!(localObject2 instanceof g.hu))
        break label377;
    }
    label391: for (int i1 = ((g.r)localObject2).d; ; i1 = 0)
    {
      localObject2 = this.q;
      if (i1 != 0);
      for (localObject1 = String.format("%d:%02d", new Object[] { Integer.valueOf(i1 / 60), Integer.valueOf(i1 % 60) }); ; localObject1 = "-:--")
      {
        ((TextView)localObject2).setText((CharSequence)localObject1);
        return;
        this.j.setImageResource(2130838090);
        break label114;
        label338: this.i.setImageResource(2130838005);
        this.i.setPadding(0, 0, 0, org.vidogram.messenger.a.a(30.0F));
        this.i.setScaleType(ImageView.ScaleType.CENTER);
        break label222;
        label375: break;
        label377: i1 += 1;
        break label240;
      }
    }
  }

  private void q()
  {
    if (MediaController.a().o())
    {
      this.m.setImageResource(2130838081);
      return;
    }
    this.m.setImageResource(2130838080);
  }

  private void r()
  {
    int i1 = MediaController.a().p();
    if (i1 == 0)
      this.o.setImageResource(2130838077);
    do
    {
      return;
      if (i1 != 1)
        continue;
      this.o.setImageResource(2130838079);
      return;
    }
    while (i1 != 2);
    this.o.setImageResource(2130838078);
  }

  public View a(Context paramContext)
  {
    FrameLayout localFrameLayout = new FrameLayout(paramContext);
    localFrameLayout.setBackgroundColor(-986896);
    localFrameLayout.setOnTouchListener(new View.OnTouchListener()
    {
      public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
      {
        return true;
      }
    });
    this.b = localFrameLayout;
    this.d.setBackgroundColor(-1);
    this.d.setBackButtonImage(2130838068);
    this.d.setItemsBackgroundColor(788529152);
    if (!org.vidogram.messenger.a.c())
      this.d.e();
    this.d.setActionBarMenuOnItemClick(new a.a()
    {
      public void a(int paramInt)
      {
        if (paramInt == -1)
          b.this.d();
      }
    });
    this.i = new ImageView(paramContext);
    localFrameLayout.addView(this.i, v.a(-1, -1.0F, 51, 0.0F, 0.0F, 0.0F, 66.0F));
    Object localObject = new View(paramContext);
    ((View)localObject).setBackgroundResource(2130837788);
    localFrameLayout.addView((View)localObject, v.a(-1, 3.0F, 83, 0.0F, 0.0F, 0.0F, 96.0F));
    localObject = new FrameLayout(paramContext);
    ((FrameLayout)localObject).setBackgroundColor(-436207617);
    localFrameLayout.addView((View)localObject, v.a(-1, 30.0F, 83, 0.0F, 0.0F, 0.0F, 66.0F));
    this.r = new TextView(paramContext);
    this.r.setTextSize(1, 12.0F);
    this.r.setTextColor(-15095832);
    this.r.setGravity(17);
    this.r.setText("0:00");
    ((FrameLayout)localObject).addView(this.r, v.b(44, -1, 51));
    this.q = new TextView(paramContext);
    this.q.setTextSize(1, 12.0F);
    this.q.setTextColor(-7697782);
    this.q.setGravity(17);
    this.q.setText("3:00");
    ((FrameLayout)localObject).addView(this.q, v.b(44, -1, 53));
    this.s = new a(paramContext);
    ((FrameLayout)localObject).addView(this.s, v.a(-1, -1.0F, 51, 32.0F, 0.0F, 32.0F, 0.0F));
    this.n = new org.vidogram.ui.Components.y(paramContext);
    this.n.setVisibility(4);
    this.n.setBackgroundColor(419430400);
    this.n.setProgressColor(-14438417);
    ((FrameLayout)localObject).addView(this.n, v.a(-1, 2.0F, 19, 44.0F, 0.0F, 44.0F, 0.0F));
    localObject = new FrameLayout(paramContext)
    {
      protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
      {
        paramInt2 = (paramInt3 - paramInt1 - org.vidogram.messenger.a.a(270.0F)) / 4;
        paramInt1 = 0;
        while (paramInt1 < 5)
        {
          paramInt3 = org.vidogram.messenger.a.a(paramInt1 * 48 + 15) + paramInt2 * paramInt1;
          paramInt4 = org.vidogram.messenger.a.a(9.0F);
          b.a(b.this)[paramInt1].layout(paramInt3, paramInt4, b.a(b.this)[paramInt1].getMeasuredWidth() + paramInt3, b.a(b.this)[paramInt1].getMeasuredHeight() + paramInt4);
          paramInt1 += 1;
        }
      }
    };
    ((FrameLayout)localObject).setBackgroundColor(-1);
    localFrameLayout.addView((View)localObject, v.b(-1, 66, 83));
    ImageView[] arrayOfImageView = this.p;
    ImageView localImageView = new ImageView(paramContext);
    this.o = localImageView;
    arrayOfImageView[0] = localImageView;
    this.o.setScaleType(ImageView.ScaleType.CENTER);
    ((FrameLayout)localObject).addView(this.o, v.b(48, 48, 51));
    this.o.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramView)
      {
        MediaController.a().r();
        b.b(b.this);
      }
    });
    arrayOfImageView = this.p;
    localImageView = new ImageView(paramContext);
    this.l = localImageView;
    arrayOfImageView[1] = localImageView;
    this.l.setScaleType(ImageView.ScaleType.CENTER);
    this.l.setImageResource(2130838092);
    ((FrameLayout)localObject).addView(this.l, v.b(48, 48, 51));
    this.l.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramView)
      {
        MediaController.a().m();
      }
    });
    arrayOfImageView = this.p;
    localImageView = new ImageView(paramContext);
    this.j = localImageView;
    arrayOfImageView[2] = localImageView;
    this.j.setScaleType(ImageView.ScaleType.CENTER);
    this.j.setImageResource(2130838091);
    ((FrameLayout)localObject).addView(this.j, v.b(48, 48, 51));
    this.j.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramView)
      {
        if (MediaController.a().t())
          return;
        if (MediaController.a().s())
        {
          MediaController.a().a(MediaController.a().j());
          return;
        }
        MediaController.a().b(MediaController.a().j());
      }
    });
    arrayOfImageView = this.p;
    localImageView = new ImageView(paramContext);
    this.k = localImageView;
    arrayOfImageView[3] = localImageView;
    this.k.setScaleType(ImageView.ScaleType.CENTER);
    this.k.setImageResource(2130838089);
    ((FrameLayout)localObject).addView(this.k, v.b(48, 48, 51));
    this.k.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramView)
      {
        MediaController.a().l();
      }
    });
    arrayOfImageView = this.p;
    paramContext = new ImageView(paramContext);
    this.m = paramContext;
    arrayOfImageView[4] = paramContext;
    this.m.setScaleType(ImageView.ScaleType.CENTER);
    ((FrameLayout)localObject).addView(this.m, v.b(48, 48, 51));
    this.m.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramView)
      {
        MediaController.a().q();
        b.c(b.this);
      }
    });
    b(false);
    r();
    q();
    return (View)localFrameLayout;
  }

  public void a(int paramInt, Object[] paramArrayOfObject)
  {
    boolean bool;
    if ((paramInt == org.vidogram.messenger.y.aO) || (paramInt == org.vidogram.messenger.y.aG) || (paramInt == org.vidogram.messenger.y.aF))
      if ((paramInt == org.vidogram.messenger.y.aF) && (((Boolean)paramArrayOfObject[1]).booleanValue()))
      {
        bool = true;
        b(bool);
      }
    do
    {
      do
      {
        return;
        bool = false;
        break;
      }
      while (paramInt != org.vidogram.messenger.y.aE);
      paramArrayOfObject = MediaController.a().j();
    }
    while ((paramArrayOfObject == null) || (!paramArrayOfObject.G()));
    a(paramArrayOfObject);
  }

  public void a(String paramString)
  {
  }

  public void a(String paramString, float paramFloat)
  {
    this.n.a(paramFloat, true);
  }

  public void a(String paramString, float paramFloat, boolean paramBoolean)
  {
  }

  public void b(String paramString)
  {
  }

  public boolean f()
  {
    this.t = MediaController.a().g();
    org.vidogram.messenger.y.a().a(this, org.vidogram.messenger.y.aF);
    org.vidogram.messenger.y.a().a(this, org.vidogram.messenger.y.aG);
    org.vidogram.messenger.y.a().a(this, org.vidogram.messenger.y.aO);
    org.vidogram.messenger.y.a().a(this, org.vidogram.messenger.y.aE);
    return super.f();
  }

  public void g()
  {
    org.vidogram.messenger.y.a().b(this, org.vidogram.messenger.y.aF);
    org.vidogram.messenger.y.a().b(this, org.vidogram.messenger.y.aG);
    org.vidogram.messenger.y.a().b(this, org.vidogram.messenger.y.aO);
    org.vidogram.messenger.y.a().b(this, org.vidogram.messenger.y.aE);
    MediaController.a().a(this);
    super.g();
  }

  public int getObserverTag()
  {
    return this.t;
  }

  private class a extends FrameLayout
  {
    public int a = 0;
    public int b = 0;
    private Paint d;
    private Paint e;
    private int f;
    private int g;
    private boolean h = false;

    public a(Context arg2)
    {
      super();
      setWillNotDraw(false);
      this.d = new Paint(1);
      this.d.setColor(419430400);
      this.e = new Paint(1);
      this.e.setColor(-14438417);
      this.f = org.vidogram.messenger.a.a(24.0F);
      this.g = org.vidogram.messenger.a.a(24.0F);
    }

    public void a(float paramFloat)
    {
      int i = (int)Math.ceil((getMeasuredWidth() - this.f) * paramFloat);
      if (this.a != i)
      {
        this.a = i;
        if (this.a >= 0)
          break label48;
        this.a = 0;
      }
      while (true)
      {
        invalidate();
        return;
        label48: if (this.a <= getMeasuredWidth() - this.f)
          continue;
        this.a = (getMeasuredWidth() - this.f);
      }
    }

    public boolean a()
    {
      return this.h;
    }

    boolean a(MotionEvent paramMotionEvent)
    {
      if (paramMotionEvent.getAction() == 0)
      {
        getParent().requestDisallowInterceptTouchEvent(true);
        int i = (getMeasuredHeight() - this.f) / 2;
        if ((this.a - i <= paramMotionEvent.getX()) && (paramMotionEvent.getX() <= i + (this.a + this.f)) && (paramMotionEvent.getY() >= 0.0F) && (paramMotionEvent.getY() <= getMeasuredHeight()))
        {
          this.h = true;
          this.b = (int)(paramMotionEvent.getX() - this.a);
          invalidate();
          return true;
        }
      }
      else if ((paramMotionEvent.getAction() == 1) || (paramMotionEvent.getAction() == 3))
      {
        if (this.h)
        {
          if (paramMotionEvent.getAction() == 1)
            b.a(b.this, this.a / (getMeasuredWidth() - this.f));
          this.h = false;
          invalidate();
          return true;
        }
      }
      else if ((paramMotionEvent.getAction() == 2) && (this.h))
      {
        this.a = (int)(paramMotionEvent.getX() - this.b);
        if (this.a < 0)
          this.a = 0;
        while (true)
        {
          invalidate();
          return true;
          if (this.a <= getMeasuredWidth() - this.f)
            continue;
          this.a = (getMeasuredWidth() - this.f);
        }
      }
      return false;
    }

    protected void onDraw(Canvas paramCanvas)
    {
      int i = (getMeasuredHeight() - this.g) / 2;
      paramCanvas.drawRect(this.f / 2, getMeasuredHeight() / 2 - org.vidogram.messenger.a.a(1.0F), getMeasuredWidth() - this.f / 2, getMeasuredHeight() / 2 + org.vidogram.messenger.a.a(1.0F), this.d);
      paramCanvas.drawRect(this.f / 2, getMeasuredHeight() / 2 - org.vidogram.messenger.a.a(1.0F), this.f / 2 + this.a, getMeasuredHeight() / 2 + org.vidogram.messenger.a.a(1.0F), this.e);
      float f2 = this.a + this.f / 2;
      float f3 = this.g / 2 + i;
      float f1;
      if (this.h)
        f1 = 8.0F;
      while (true)
      {
        paramCanvas.drawCircle(f2, f3, org.vidogram.messenger.a.a(f1), this.e);
        return;
        f1 = 6.0F;
      }
    }

    public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
    {
      return a(paramMotionEvent);
    }

    public boolean onTouchEvent(MotionEvent paramMotionEvent)
    {
      return a(paramMotionEvent);
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.b
 * JD-Core Version:    0.6.0
 */