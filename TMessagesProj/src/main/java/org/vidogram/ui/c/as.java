package org.vidogram.ui.c;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.view.MotionEvent;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import java.io.File;
import java.util.ArrayList;
import java.util.Locale;
import org.vidogram.messenger.MediaController;
import org.vidogram.messenger.m;
import org.vidogram.messenger.n;
import org.vidogram.messenger.q;
import org.vidogram.messenger.r;
import org.vidogram.messenger.u;
import org.vidogram.tgnet.f;
import org.vidogram.tgnet.g.ar;
import org.vidogram.tgnet.g.at;
import org.vidogram.tgnet.g.au;
import org.vidogram.tgnet.g.az;
import org.vidogram.tgnet.g.ni;
import org.vidogram.tgnet.g.no;
import org.vidogram.tgnet.g.nq;
import org.vidogram.tgnet.g.oi;
import org.vidogram.tgnet.g.vp;
import org.vidogram.tgnet.g.wb;
import org.vidogram.tgnet.g.x;
import org.vidogram.ui.Components.i;
import org.vidogram.ui.Components.v;
import org.vidogram.ui.Components.w;
import org.vidogram.ui.Components.z;

public class as extends FrameLayout
{
  private static Paint d;
  private static TextPaint u;
  private static TextPaint v;
  private static Paint w;
  ArrayList<String> a = new ArrayList();
  private boolean b;
  private z c = new z();
  private int e;
  private q f;
  private boolean g;
  private w h;
  private i i;
  private a j;
  private boolean k;
  private int l;
  private ArrayList<StaticLayout> m = new ArrayList();
  private int n = org.vidogram.messenger.a.a(7.0F);
  private StaticLayout o;
  private int p = org.vidogram.messenger.a.a(27.0F);
  private StaticLayout q;
  private int r = org.vidogram.messenger.a.a(27.0F);
  private StaticLayout s;
  private u t;

  public as(Context paramContext)
  {
    super(paramContext);
    if (u == null)
    {
      u = new TextPaint(1);
      u.setTypeface(org.vidogram.messenger.a.a("fonts/rmedium.ttf"));
      u.setColor(-14606047);
      v = new TextPaint(1);
      w = new Paint();
      w.setColor(-2500135);
      w.setStrokeWidth(1.0F);
      d = new Paint();
      d.setColor(862104035);
    }
    u.setTextSize(org.vidogram.messenger.a.a(16.0F));
    v.setTextSize(org.vidogram.messenger.a.a(16.0F));
    setWillNotDraw(false);
    this.f = new q(this);
    this.h = new w();
    this.i = new i(paramContext, 2130838112);
    this.i.setVisibility(4);
    paramContext = this.i;
    int i1;
    float f1;
    label252: float f2;
    if (r.a)
    {
      i1 = 5;
      if (!r.a)
        break label290;
      f1 = 0.0F;
      if (!r.a)
        break label296;
      f2 = 44.0F;
    }
    while (true)
    {
      addView(paramContext, v.a(22, 22.0F, i1 | 0x30, f1, 44.0F, f2, 0.0F));
      return;
      i1 = 3;
      break;
      label290: f1 = 44.0F;
      break label252;
      label296: f2 = 0.0F;
    }
  }

  public String a(int paramInt)
  {
    if ((paramInt < 0) || (paramInt >= this.a.size()))
      return null;
    return (String)this.a.get(paramInt);
  }

  protected void a()
  {
    this.e = -1;
    this.b = false;
    invalidate();
  }

  public void a(u paramu, boolean paramBoolean)
  {
    this.k = paramBoolean;
    a();
    this.t = paramu;
    requestLayout();
  }

  public void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (this.i.getVisibility() != 0)
      this.i.setVisibility(0);
    this.i.a(paramBoolean1, paramBoolean2);
  }

  public u getMessage()
  {
    return this.t;
  }

  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    if (this.g)
      this.f.g();
  }

  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    if (this.g)
      this.f.f();
  }

  protected void onDraw(Canvas paramCanvas)
  {
    int i1 = 0;
    float f1;
    label78: int i2;
    label133: label180: StaticLayout localStaticLayout;
    int i3;
    if (this.o != null)
    {
      paramCanvas.save();
      if (r.a)
      {
        f1 = 8.0F;
        paramCanvas.translate(org.vidogram.messenger.a.a(f1), this.n);
        this.o.draw(paramCanvas);
        paramCanvas.restore();
      }
    }
    else
    {
      if (this.q != null)
      {
        v.setColor(-14606047);
        paramCanvas.save();
        if (!r.a)
          break label312;
        f1 = 8.0F;
        paramCanvas.translate(org.vidogram.messenger.a.a(f1), this.p);
        this.q.draw(paramCanvas);
        paramCanvas.restore();
      }
      if (this.s != null)
      {
        v.setColor(-14606047);
        paramCanvas.save();
        if (!r.a)
          break label320;
        f1 = 8.0F;
        paramCanvas.translate(org.vidogram.messenger.a.a(f1), this.r);
        this.s.draw(paramCanvas);
        paramCanvas.restore();
      }
      if (this.m.isEmpty())
        break label336;
      v.setColor(-14255946);
      i2 = 0;
      if (i1 >= this.m.size())
        break label336;
      localStaticLayout = (StaticLayout)this.m.get(i1);
      i3 = i2;
      if (localStaticLayout.getLineCount() > 0)
      {
        paramCanvas.save();
        if (!r.a)
          break label328;
        f1 = 8.0F;
      }
    }
    while (true)
    {
      paramCanvas.translate(org.vidogram.messenger.a.a(f1), this.l + i2);
      if (this.e == i1)
        paramCanvas.drawPath(this.c, d);
      localStaticLayout.draw(paramCanvas);
      paramCanvas.restore();
      i3 = i2 + localStaticLayout.getLineBottom(localStaticLayout.getLineCount() - 1);
      i1 += 1;
      i2 = i3;
      break label180;
      f1 = org.vidogram.messenger.a.g;
      break;
      label312: f1 = org.vidogram.messenger.a.g;
      break label78;
      label320: f1 = org.vidogram.messenger.a.g;
      break label133;
      label328: f1 = org.vidogram.messenger.a.g;
    }
    label336: this.h.draw(paramCanvas);
    if (this.g)
      this.f.a(paramCanvas);
    if (this.k)
    {
      if (r.a)
        paramCanvas.drawLine(0.0F, getMeasuredHeight() - 1, getMeasuredWidth() - org.vidogram.messenger.a.a(org.vidogram.messenger.a.g), getMeasuredHeight() - 1, w);
    }
    else
      return;
    paramCanvas.drawLine(org.vidogram.messenger.a.a(org.vidogram.messenger.a.g), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, w);
  }

  @SuppressLint({"DrawAllocation"})
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    this.g = false;
    this.q = null;
    this.o = null;
    this.s = null;
    this.r = this.p;
    this.m.clear();
    this.a.clear();
    int i1 = View.MeasureSpec.getSize(paramInt1) - org.vidogram.messenger.a.a(org.vidogram.messenger.a.g) - org.vidogram.messenger.a.a(8.0F);
    String str2 = null;
    Object localObject7;
    Object localObject3;
    Object localObject1;
    Object localObject6;
    int i2;
    if (((this.t.a.j instanceof g.oi)) && ((this.t.a.j.r instanceof g.vp)))
    {
      localObject7 = this.t.a.j.r;
      if ((this.t.m == null) && (((g.wb)localObject7).k != null))
        this.t.a(true);
      if ((((g.wb)localObject7).k != null) && (this.t.m != null))
      {
        paramInt2 = 1;
        localObject3 = ((g.wb)localObject7).i;
        localObject1 = localObject3;
        if (localObject3 == null)
          localObject1 = ((g.wb)localObject7).h;
        localObject6 = ((g.wb)localObject7).j;
        str2 = ((g.wb)localObject7).e;
        i2 = paramInt2;
        localObject3 = localObject1;
        localObject1 = localObject6;
      }
    }
    while (true)
    {
      g.at localat;
      Object localObject9;
      if ((this.t != null) && (!this.t.a.p.isEmpty()))
      {
        paramInt2 = 0;
        localObject7 = null;
        localObject6 = localObject1;
        localObject1 = localObject7;
        while (true)
        {
          if (paramInt2 >= this.t.a.p.size())
            break label1121;
          localat = (g.at)this.t.a.p.get(paramInt2);
          if ((localat.c <= 0) || (localat.b < 0))
            break label2239;
          if (localat.b >= this.t.a.i.length())
          {
            paramInt2 += 1;
            continue;
            paramInt2 = 0;
            break;
          }
        }
        if (localat.b + localat.c > this.t.a.i.length())
          localat.c = (this.t.a.i.length() - localat.b);
        localObject9 = localObject1;
        if (paramInt2 == 0)
        {
          localObject9 = localObject1;
          if (str2 != null)
            if (localat.b == 0)
            {
              localObject9 = localObject1;
              if (localat.c == this.t.a.i.length());
            }
            else
            {
              if (this.t.a.p.size() != 1)
                break label852;
              localObject9 = localObject1;
              if (localObject6 == null)
                localObject9 = this.t.a.i;
            }
        }
        label468: localObject7 = null;
        localObject1 = localObject3;
      }
      while (true)
      {
        label542: Object localObject11;
        Object localObject10;
        try
        {
          if ((localat instanceof g.no))
            continue;
          localObject1 = localObject3;
          if (!(localat instanceof g.nq))
            continue;
          localObject1 = localObject3;
          if (!(localat instanceof g.nq))
            continue;
          localObject1 = localObject3;
          localObject7 = this.t.a.i.substring(localat.b, localat.b + localat.c);
          if (localObject3 == null)
            continue;
          localObject1 = localObject3;
          i3 = ((String)localObject3).length();
          localObject11 = localObject3;
          localObject10 = localObject7;
          if (i3 != 0)
            break label2242;
        }
        catch (Exception localException6)
        {
          try
          {
            int i3;
            while (true)
            {
              localObject1 = Uri.parse((String)localObject7).getHost();
              localObject10 = localObject1;
              if (localObject1 == null)
                localObject10 = localObject7;
              localObject3 = localObject10;
              if (localObject10 != null)
              {
                localObject1 = localObject10;
                i3 = ((String)localObject10).lastIndexOf('.');
                localObject3 = localObject10;
                if (i3 >= 0)
                {
                  localObject1 = localObject10;
                  localObject10 = ((String)localObject10).substring(0, i3);
                  localObject1 = localObject10;
                  i3 = ((String)localObject10).lastIndexOf('.');
                  localObject3 = localObject10;
                  if (i3 >= 0)
                  {
                    localObject1 = localObject10;
                    localObject3 = ((String)localObject10).substring(i3 + 1);
                  }
                  localObject1 = localObject3;
                  localObject3 = ((String)localObject3).substring(0, 1).toUpperCase() + ((String)localObject3).substring(1);
                }
              }
              localObject1 = localObject3;
              if (localat.b == 0)
              {
                localObject1 = localObject3;
                if (localat.c == this.t.a.i.length())
                  break label2253;
              }
              localObject1 = localObject3;
              localObject10 = this.t.a.i;
              localObject1 = localObject10;
              localObject6 = localObject1;
              localObject1 = localObject3;
              label779: if (localObject7 != null);
              try
              {
                if ((((String)localObject7).toLowerCase().indexOf("http") != 0) && (((String)localObject7).toLowerCase().indexOf("mailto") != 0))
                  this.a.add("http://" + (String)localObject7);
                while (true)
                {
                  localObject3 = localObject1;
                  localObject1 = localObject9;
                  break;
                  label852: localObject9 = this.t.a.i;
                  break label468;
                  localObject1 = localObject3;
                  localObject7 = localat.d;
                  break label542;
                  localObject1 = localObject3;
                  localObject11 = localObject3;
                  localObject10 = localObject7;
                  if (!(localat instanceof g.ni))
                    break label2242;
                  if (localObject3 != null)
                  {
                    localObject1 = localObject3;
                    localObject11 = localObject3;
                    localObject10 = localObject7;
                    if (((String)localObject3).length() != 0)
                      break label2242;
                  }
                  localObject1 = localObject3;
                  localObject7 = "mailto:" + this.t.a.i.substring(localat.b, localat.b + localat.c);
                  localObject1 = localObject3;
                  localObject3 = this.t.a.i.substring(localat.b, localat.b + localat.c);
                  localObject1 = localObject3;
                  if (localat.b == 0)
                  {
                    localObject1 = localObject3;
                    localObject11 = localObject3;
                    localObject10 = localObject7;
                    if (localat.c == this.t.a.i.length())
                      break label2242;
                  }
                  localObject1 = localObject3;
                  localObject10 = this.t.a.i;
                  localObject1 = localObject3;
                  localObject6 = localObject10;
                  break label779;
                  this.a.add(localObject7);
                }
              }
              catch (Exception localException3)
              {
              }
            }
            n.a("tmessages", localException3);
            Object localObject4 = localObject1;
            localObject1 = localObject9;
            break;
            label1121: localObject7 = localObject6;
            localObject6 = localObject4;
            localObject4 = localObject7;
            if ((str2 == null) || (!this.a.isEmpty()))
              continue;
            this.a.add(str2);
            if (localObject6 == null)
              continue;
            try
            {
              paramInt2 = (int)Math.ceil(u.measureText((String)localObject6));
              this.o = new StaticLayout(TextUtils.ellipsize(((String)localObject6).replace('\n', ' '), u, Math.min(paramInt2, i1), TextUtils.TruncateAt.END), u, i1, Layout.Alignment.ALIGN_NORMAL, 1.0F, 0.0F, false);
              this.h.a((String)localObject6);
              if (localObject4 == null)
                continue;
            }
            catch (Exception localObject2)
            {
              try
              {
                this.q = j.a(localObject4, v, i1, i1, 0, 3);
                if (this.q.getLineCount() <= 0)
                  continue;
                this.r = (this.p + this.q.getLineBottom(this.q.getLineCount() - 1) + org.vidogram.messenger.a.a(1.0F));
                if (localObject1 == null)
                  continue;
              }
              catch (Exception localObject2)
              {
                try
                {
                  this.s = j.a((CharSequence)localObject1, v, i1, i1, 0, 3);
                  this.s.getLineBottom(this.s.getLineCount() - 1);
                  if (this.q == null)
                    continue;
                  this.r += org.vidogram.messenger.a.a(10.0F);
                  if (this.a.isEmpty())
                    continue;
                  paramInt2 = 0;
                  if (paramInt2 >= this.a.size())
                    continue;
                }
                catch (Exception localObject2)
                {
                  try
                  {
                    localObject1 = (String)this.a.get(paramInt2);
                    i3 = (int)Math.ceil(v.measureText((String)localObject1));
                    localObject1 = new StaticLayout(TextUtils.ellipsize(((String)localObject1).replace('\n', ' '), v, Math.min(i3, i1), TextUtils.TruncateAt.MIDDLE), v, i1, Layout.Alignment.ALIGN_NORMAL, 1.0F, 0.0F, false);
                    this.l = this.r;
                    if ((this.s == null) || (this.s.getLineCount() == 0))
                      continue;
                    this.l += this.s.getLineBottom(this.s.getLineCount() - 1) + org.vidogram.messenger.a.a(1.0F);
                    this.m.add(localObject1);
                    paramInt2 += 1;
                    continue;
                    localException7 = localException7;
                    n.a("tmessages", localException7);
                    continue;
                    localException4 = localException4;
                    n.a("tmessages", localException4);
                    continue;
                    localException1 = localException1;
                    n.a("tmessages", localException1);
                  }
                  catch (Exception localException2)
                  {
                    n.a("tmessages", localException2);
                    continue;
                  }
                  i1 = org.vidogram.messenger.a.a(52.0F);
                  if (!r.a)
                    continue;
                  paramInt2 = View.MeasureSpec.getSize(paramInt1) - org.vidogram.messenger.a.a(10.0F) - i1;
                  this.h.setBounds(paramInt2, org.vidogram.messenger.a.a(10.0F), paramInt2 + i1, org.vidogram.messenger.a.a(62.0F));
                  if (i2 == 0)
                    continue;
                  localObject6 = m.a(this.t.m, i1, true);
                  localObject2 = m.a(this.t.m, 80);
                  if (localObject2 != localObject6)
                    continue;
                  localObject2 = null;
                  ((g.az)localObject6).f = -1;
                  if (localObject2 == null)
                    continue;
                  ((g.az)localObject2).f = -1;
                  this.f.a(paramInt2, org.vidogram.messenger.a.a(10.0F), i1, i1);
                  localObject8 = m.b((f)localObject6);
                  paramInt2 = 1;
                  if (m.a((f)localObject6, true).exists())
                    continue;
                  paramInt2 = 0;
                  String str1 = String.format(Locale.US, "%d_%d", new Object[] { Integer.valueOf(i1), Integer.valueOf(i1) });
                  if ((paramInt2 == 0) && (!MediaController.a().a(1)) && (!m.a().a((String)localObject8)))
                    continue;
                  localObject8 = this.f;
                  localObject6 = ((g.az)localObject6).c;
                  if (localObject2 == null)
                    continue;
                  localObject2 = ((g.az)localObject2).c;
                  ((q)localObject8).a((f)localObject6, str1, (g.x)localObject2, String.format(Locale.US, "%d_%d_b", new Object[] { Integer.valueOf(i1), Integer.valueOf(i1) }), 0, null, false);
                  this.g = true;
                  i1 = 0;
                  paramInt2 = i1;
                  if (this.o == null)
                    continue;
                  paramInt2 = i1;
                  if (this.o.getLineCount() == 0)
                    continue;
                  paramInt2 = 0 + this.o.getLineBottom(this.o.getLineCount() - 1);
                  i1 = paramInt2;
                  if (this.q == null)
                    continue;
                  i1 = paramInt2;
                  if (this.q.getLineCount() == 0)
                    continue;
                  i1 = paramInt2 + this.q.getLineBottom(this.q.getLineCount() - 1);
                  paramInt2 = i1;
                  if (this.s == null)
                    continue;
                  paramInt2 = i1;
                  if (this.s.getLineCount() == 0)
                    continue;
                  i1 += this.s.getLineBottom(this.s.getLineCount() - 1);
                  paramInt2 = i1;
                  if (this.q == null)
                    continue;
                  paramInt2 = i1 + org.vidogram.messenger.a.a(10.0F);
                  i1 = 0;
                  if (i1 >= this.m.size())
                    continue;
                  localObject2 = (StaticLayout)this.m.get(i1);
                  i3 = paramInt2;
                  if (((StaticLayout)localObject2).getLineCount() <= 0)
                    continue;
                  i3 = paramInt2 + ((StaticLayout)localObject2).getLineBottom(((StaticLayout)localObject2).getLineCount() - 1);
                  i1 += 1;
                  paramInt2 = i3;
                  continue;
                  paramInt2 = org.vidogram.messenger.a.a(10.0F);
                  continue;
                  localObject2 = null;
                  continue;
                  if (localObject2 == null)
                    continue;
                  this.f.a(null, null, ((g.az)localObject2).c, String.format(Locale.US, "%d_%d_b", new Object[] { Integer.valueOf(i1), Integer.valueOf(i1) }), 0, null, false);
                  continue;
                  this.f.a((Drawable)null);
                  continue;
                  i1 = paramInt2;
                  if (i2 == 0)
                    continue;
                  i1 = Math.max(org.vidogram.messenger.a.a(48.0F), paramInt2);
                  this.i.measure(View.MeasureSpec.makeMeasureSpec(org.vidogram.messenger.a.a(22.0F), 1073741824), View.MeasureSpec.makeMeasureSpec(org.vidogram.messenger.a.a(22.0F), 1073741824));
                  paramInt2 = View.MeasureSpec.getSize(paramInt1);
                  i1 = Math.max(org.vidogram.messenger.a.a(72.0F), i1 + org.vidogram.messenger.a.a(16.0F));
                  if (!this.k)
                    continue;
                  paramInt1 = 1;
                  setMeasuredDimension(paramInt2, paramInt1 + i1);
                  return;
                  paramInt1 = 0;
                  continue;
                }
              }
            }
            localException5 = localException5;
            continue;
          }
          catch (Exception localException6)
          {
            localObject2 = localObject8;
            continue;
            continue;
          }
        }
        label2239: break;
        label2242: localObject2 = localObject11;
        Object localObject8 = localObject10;
        continue;
        label2253: localObject2 = localObject6;
        continue;
        localObject9 = null;
        localObject6 = localObject2;
        localObject8 = localException6;
        localObject2 = localObject9;
        localObject5 = localObject6;
        localObject6 = localObject8;
      }
      i2 = 0;
      Object localObject2 = null;
      Object localObject5 = null;
    }
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int i7 = 0;
    int i1;
    int i2;
    StaticLayout localStaticLayout;
    int i3;
    float f1;
    if ((this.t != null) && (!this.m.isEmpty()) && (this.j != null) && (this.j.a()))
      if ((paramMotionEvent.getAction() == 0) || ((this.b) && (paramMotionEvent.getAction() == 1)))
      {
        int i4 = (int)paramMotionEvent.getX();
        int i5 = (int)paramMotionEvent.getY();
        i1 = 0;
        i2 = 0;
        if (i1 >= this.m.size())
          break label512;
        localStaticLayout = (StaticLayout)this.m.get(i1);
        i3 = i2;
        if (localStaticLayout.getLineCount() > 0)
        {
          i3 = localStaticLayout.getLineBottom(localStaticLayout.getLineCount() - 1);
          if (r.a)
          {
            f1 = 8.0F;
            int i6 = org.vidogram.messenger.a.a(f1);
            if ((i4 < i6 + localStaticLayout.getLineLeft(0)) || (i4 > i6 + localStaticLayout.getLineWidth(0)) || (i5 < this.l + i2) || (i5 > this.l + i2 + i3))
              break label458;
            if (paramMotionEvent.getAction() != 0)
              break label318;
            a();
            this.e = i1;
            this.b = true;
          }
        }
      }
    while (true)
    {
      try
      {
        this.c.a(localStaticLayout, 0, 0.0F);
        localStaticLayout.getSelectionPath(0, localStaticLayout.getText().length(), this.c);
        i2 = 1;
        i1 = 1;
        i3 = i1;
        if (i2 != 0)
          continue;
        a();
        i3 = i1;
        if ((i3 == 0) && (!super.onTouchEvent(paramMotionEvent)))
          continue;
        i7 = 1;
        return i7;
        f1 = org.vidogram.messenger.a.g;
      }
      catch (Exception localException1)
      {
        n.a("tmessages", localException1);
        continue;
      }
      label318: if (this.b)
      {
        try
        {
          g.wb localwb;
          if ((this.e == 0) && (this.t.a.j != null))
          {
            localwb = this.t.a.j.r;
            label360: if ((localwb == null) || (Build.VERSION.SDK_INT < 16) || (localwb.l == null) || (localwb.l.length() == 0))
              break label421;
            this.j.a(localwb);
          }
          while (true)
          {
            a();
            i2 = 1;
            i1 = 1;
            break;
            localwb = null;
            break label360;
            org.vidogram.messenger.b.a.a(getContext(), (String)this.a.get(this.e));
          }
        }
        catch (Exception localException2)
        {
          while (true)
            n.a("tmessages", localException2);
        }
        label458: i3 = i2 + i3;
        i1 += 1;
        i2 = i3;
        break;
        if (paramMotionEvent.getAction() == 3)
        {
          a();
          i3 = 0;
          continue;
          a();
        }
        i3 = 0;
        continue;
      }
      label421: i2 = 1;
      i1 = 0;
      continue;
      label512: i2 = 0;
      i1 = 0;
    }
  }

  public void setDelegate(a parama)
  {
    this.j = parama;
  }

  public static abstract interface a
  {
    public abstract void a(g.wb paramwb);

    public abstract boolean a();
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.c.as
 * JD-Core Version:    0.6.0
 */