package org.vidogram.ui.c;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextUtils.TruncateAt;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import org.vidogram.messenger.MediaController;
import org.vidogram.messenger.MediaController.e;
import org.vidogram.messenger.m;
import org.vidogram.messenger.p;
import org.vidogram.messenger.q;
import org.vidogram.messenger.q.a;
import org.vidogram.messenger.r;
import org.vidogram.messenger.u;
import org.vidogram.tgnet.g.ar;
import org.vidogram.tgnet.g.au;
import org.vidogram.tgnet.g.az;
import org.vidogram.tgnet.g.hu;
import org.vidogram.tgnet.g.q;
import org.vidogram.tgnet.g.r;
import org.vidogram.tgnet.g.rt;
import org.vidogram.tgnet.g.wb;
import org.vidogram.ui.Components.BackupImageView;
import org.vidogram.ui.Components.i;
import org.vidogram.ui.Components.v;
import org.vidogram.ui.Components.y;

public class ar extends FrameLayout
  implements MediaController.e
{
  private static Paint j;
  private ImageView a;
  private BackupImageView b;
  private TextView c;
  private TextView d;
  private TextView e;
  private ImageView f;
  private y g;
  private i h;
  private boolean i;
  private int k;
  private u l;
  private boolean m;
  private boolean n;
  private int[] o = { 2130837962, 2130837963, 2130837966, 2130837967 };

  public ar(Context paramContext)
  {
    super(paramContext);
    if (j == null)
    {
      j = new Paint();
      j.setColor(-2500135);
      j.setStrokeWidth(1.0F);
    }
    this.k = MediaController.a().g();
    this.a = new ImageView(paramContext);
    Object localObject = this.a;
    int i1;
    float f1;
    label108: float f2;
    if (r.a)
    {
      i1 = 5;
      if (!r.a)
        break label890;
      f1 = 0.0F;
      if (!r.a)
        break label896;
      f2 = 12.0F;
      label117: addView((View)localObject, v.a(40, 40.0F, i1 | 0x30, f1, 8.0F, f2, 0.0F));
      this.d = new TextView(paramContext);
      this.d.setTextColor(-1);
      this.d.setTextSize(1, 14.0F);
      this.d.setTypeface(org.vidogram.messenger.a.a("fonts/rmedium.ttf"));
      this.d.setLines(1);
      this.d.setMaxLines(1);
      this.d.setSingleLine(true);
      this.d.setGravity(17);
      this.d.setEllipsize(TextUtils.TruncateAt.END);
      localObject = this.d;
      if (!r.a)
        break label901;
      i1 = 5;
      label240: if (!r.a)
        break label907;
      f1 = 0.0F;
      label248: if (!r.a)
        break label913;
      f2 = 16.0F;
      label257: addView((View)localObject, v.a(32, -2.0F, i1 | 0x30, f1, 22.0F, f2, 0.0F));
      this.b = new BackupImageView(paramContext);
      localObject = this.b;
      if (!r.a)
        break label918;
      i1 = 5;
      label307: if (!r.a)
        break label924;
      f1 = 0.0F;
      label315: if (!r.a)
        break label930;
      f2 = 12.0F;
      label324: addView((View)localObject, v.a(40, 40.0F, i1 | 0x30, f1, 8.0F, f2, 0.0F));
      this.b.getImageReceiver().a(new q.a()
      {
        public void a(q paramq, boolean paramBoolean1, boolean paramBoolean2)
        {
          int j = 4;
          paramq = ar.a(ar.this);
          if (paramBoolean1)
          {
            i = 4;
            paramq.setVisibility(i);
            paramq = ar.b(ar.this);
            if (!paramBoolean1)
              break label53;
          }
          label53: for (int i = j; ; i = 0)
          {
            paramq.setVisibility(i);
            return;
            i = 0;
            break;
          }
        }
      });
      this.c = new TextView(paramContext);
      this.c.setTextColor(-14606047);
      this.c.setTextSize(1, 16.0F);
      this.c.setTypeface(org.vidogram.messenger.a.a("fonts/rmedium.ttf"));
      this.c.setLines(1);
      this.c.setMaxLines(1);
      this.c.setSingleLine(true);
      this.c.setEllipsize(TextUtils.TruncateAt.END);
      localObject = this.c;
      if (!r.a)
        break label935;
      i1 = 5;
      label457: ((TextView)localObject).setGravity(i1 | 0x10);
      localObject = this.c;
      if (!r.a)
        break label941;
      i1 = 5;
      label482: if (!r.a)
        break label947;
      f1 = 8.0F;
      label491: if (!r.a)
        break label953;
      f2 = 72.0F;
      label500: addView((View)localObject, v.a(-1, -2.0F, i1 | 0x30, f1, 5.0F, f2, 0.0F));
      this.f = new ImageView(paramContext);
      this.f.setVisibility(4);
      localObject = this.f;
      if (!r.a)
        break label959;
      i1 = 5;
      label557: if (!r.a)
        break label965;
      f1 = 8.0F;
      label566: if (!r.a)
        break label971;
      f2 = 72.0F;
      label575: addView((View)localObject, v.a(-2, -2.0F, i1 | 0x30, f1, 35.0F, f2, 0.0F));
      this.e = new TextView(paramContext);
      this.e.setTextColor(-6710887);
      this.e.setTextSize(1, 14.0F);
      this.e.setLines(1);
      this.e.setMaxLines(1);
      this.e.setSingleLine(true);
      this.e.setEllipsize(TextUtils.TruncateAt.END);
      localObject = this.e;
      if (!r.a)
        break label977;
      i1 = 5;
      label678: ((TextView)localObject).setGravity(i1 | 0x10);
      localObject = this.e;
      if (!r.a)
        break label983;
      i1 = 5;
      label703: if (!r.a)
        break label989;
      f1 = 8.0F;
      label712: if (!r.a)
        break label995;
      f2 = 72.0F;
      label721: addView((View)localObject, v.a(-1, -2.0F, i1 | 0x30, f1, 30.0F, f2, 0.0F));
      this.g = new y(paramContext);
      localObject = this.g;
      if (!r.a)
        break label1001;
      i1 = 5;
      label770: if (!r.a)
        break label1007;
      f1 = 0.0F;
      label778: if (!r.a)
        break label1013;
      f2 = 72.0F;
      label787: addView((View)localObject, v.a(-1, 2.0F, i1 | 0x30, f1, 54.0F, f2, 0.0F));
      this.h = new i(paramContext, 2130838112);
      this.h.setVisibility(4);
      paramContext = this.h;
      if (!r.a)
        break label1018;
      i1 = 5;
      label844: if (!r.a)
        break label1024;
      f1 = 0.0F;
      label852: if (!r.a)
        break label1030;
      f2 = 34.0F;
    }
    while (true)
    {
      addView(paramContext, v.a(22, 22.0F, i1 | 0x30, f1, 30.0F, f2, 0.0F));
      return;
      i1 = 3;
      break;
      label890: f1 = 12.0F;
      break label108;
      label896: f2 = 0.0F;
      break label117;
      label901: i1 = 3;
      break label240;
      label907: f1 = 16.0F;
      break label248;
      label913: f2 = 0.0F;
      break label257;
      label918: i1 = 3;
      break label307;
      label924: f1 = 12.0F;
      break label315;
      label930: f2 = 0.0F;
      break label324;
      label935: i1 = 3;
      break label457;
      label941: i1 = 3;
      break label482;
      label947: f1 = 72.0F;
      break label491;
      label953: f2 = 8.0F;
      break label500;
      label959: i1 = 3;
      break label557;
      label965: f1 = 72.0F;
      break label566;
      label971: f2 = 8.0F;
      break label575;
      label977: i1 = 3;
      break label678;
      label983: i1 = 3;
      break label703;
      label989: f1 = 72.0F;
      break label712;
      label995: f2 = 8.0F;
      break label721;
      label1001: i1 = 3;
      break label770;
      label1007: f1 = 72.0F;
      break label778;
      label1013: f2 = 0.0F;
      break label787;
      label1018: i1 = 3;
      break label844;
      label1024: f1 = 34.0F;
      break label852;
      label1030: f2 = 0.0F;
    }
  }

  private int a(String paramString1, String paramString2)
  {
    int i1;
    if ((paramString1 != null) && (paramString1.length() != 0))
      if ((paramString1.contains(".doc")) || (paramString1.contains(".txt")) || (paramString1.contains(".psd")))
        i1 = 0;
    while (true)
    {
      int i2 = i1;
      if (i1 == -1)
      {
        i1 = paramString1.lastIndexOf('.');
        if (i1 != -1)
          break label205;
        paramString2 = "";
        label63: if (paramString2.length() == 0)
          break label216;
      }
      label205: label216: for (i2 = paramString2.charAt(0) % this.o.length; ; i2 = paramString1.charAt(0) % this.o.length)
      {
        return this.o[i2];
        if ((paramString1.contains(".xls")) || (paramString1.contains(".csv")))
        {
          i1 = 1;
          break;
        }
        if ((paramString1.contains(".pdf")) || (paramString1.contains(".ppt")) || (paramString1.contains(".key")))
        {
          i1 = 2;
          break;
        }
        if ((!paramString1.contains(".zip")) && (!paramString1.contains(".rar")) && (!paramString1.contains(".ai")) && (!paramString1.contains(".mp3")) && (!paramString1.contains(".mov")) && (!paramString1.contains(".avi")))
          break label239;
        i1 = 3;
        break;
        paramString2 = paramString1.substring(i1 + 1);
        break label63;
      }
      return this.o[0];
      label239: i1 = -1;
    }
  }

  public void a()
  {
    if ((this.l != null) && (this.l.a.j != null))
    {
      Object localObject2 = null;
      Object localObject1;
      if ((this.l.a.A != null) && (this.l.a.A.length() != 0))
      {
        localObject1 = localObject2;
        if (new File(this.l.a.A).exists());
      }
      else
      {
        localObject1 = localObject2;
        if (!m.b(this.l.a).exists())
          localObject1 = m.b(this.l.A());
      }
      this.n = false;
      if (localObject1 == null)
      {
        this.f.setVisibility(4);
        this.e.setPadding(0, 0, 0, 0);
        this.m = false;
        this.n = true;
        MediaController.a().a(this);
        return;
      }
      MediaController.a().a((String)localObject1, this);
      this.m = m.a().a((String)localObject1);
      this.f.setVisibility(0);
      localObject2 = this.f;
      int i1;
      if (this.m)
      {
        i1 = 2130837965;
        ((ImageView)localObject2).setImageResource(i1);
        localObject2 = this.e;
        if (!r.a)
          break label296;
        i1 = 0;
        label218: if (!r.a)
          break label305;
      }
      label296: label305: for (int i2 = org.vidogram.messenger.a.a(14.0F); ; i2 = 0)
      {
        ((TextView)localObject2).setPadding(i1, 0, i2, 0);
        if (!this.m)
          break label310;
        this.g.setVisibility(0);
        localObject2 = p.a().a((String)localObject1);
        localObject1 = localObject2;
        if (localObject2 == null)
          localObject1 = Float.valueOf(0.0F);
        this.g.a(((Float)localObject1).floatValue(), false);
        return;
        i1 = 2130837964;
        break;
        i1 = org.vidogram.messenger.a.a(14.0F);
        break label218;
      }
      label310: this.g.setVisibility(4);
      return;
    }
    this.m = false;
    this.n = true;
    this.g.setVisibility(4);
    this.g.a(0.0F, false);
    this.f.setVisibility(4);
    this.e.setPadding(0, 0, 0, 0);
    MediaController.a().a(this);
  }

  public void a(String paramString)
  {
    a();
  }

  public void a(String paramString, float paramFloat)
  {
    if (this.g.getVisibility() != 0)
      a();
    this.g.a(paramFloat, true);
  }

  public void a(String paramString, float paramFloat, boolean paramBoolean)
  {
  }

  public void a(String paramString1, String paramString2, String paramString3, String paramString4, int paramInt)
  {
    this.c.setText(paramString1);
    this.e.setText(paramString2);
    if (paramString3 != null)
    {
      this.d.setVisibility(0);
      this.d.setText(paramString3);
      if (paramInt != 0)
        break label110;
      this.a.setImageResource(a(paramString1, paramString3));
      this.a.setVisibility(0);
      label62: if ((paramString4 == null) && (paramInt == 0))
        break label133;
      if (paramString4 == null)
        break label121;
      this.b.a(paramString4, "40_40", null);
    }
    while (true)
    {
      this.b.setVisibility(0);
      return;
      this.d.setVisibility(4);
      break;
      label110: this.a.setVisibility(4);
      break label62;
      label121: this.b.setImageResource(paramInt);
    }
    label133: this.b.setVisibility(4);
  }

  public void a(u paramu, boolean paramBoolean)
  {
    this.i = paramBoolean;
    this.l = paramu;
    this.n = false;
    this.m = false;
    Object localObject3;
    int i1;
    Object localObject1;
    label65: Object localObject2;
    if ((paramu != null) && (paramu.A() != null))
      if (paramu.G())
        if (paramu.f == 0)
        {
          localObject3 = paramu.a.j.r.s;
          i1 = 0;
          localObject1 = null;
          localObject2 = localObject1;
          if (i1 >= ((g.q)localObject3).o.size())
            break label198;
          localObject2 = (g.r)((g.q)localObject3).o.get(i1);
          if ((!(localObject2 instanceof g.hu)) || (((((g.r)localObject2).l == null) || (((g.r)localObject2).l.length() == 0)) && ((((g.r)localObject2).k == null) || (((g.r)localObject2).k.length() == 0))))
            break label583;
          localObject1 = paramu.Q() + " - " + paramu.O();
        }
    label198: label583: 
    while (true)
    {
      i1 += 1;
      break label65;
      localObject3 = paramu.a.j.k;
      break;
      localObject2 = null;
      localObject3 = m.b(paramu.A());
      localObject1 = localObject2;
      if (localObject2 == null)
        localObject1 = localObject3;
      this.c.setText((CharSequence)localObject1);
      this.a.setVisibility(0);
      this.d.setVisibility(0);
      this.a.setImageResource(a((String)localObject3, paramu.A().g));
      localObject2 = this.d;
      i1 = ((String)localObject3).lastIndexOf('.');
      if (i1 == -1)
      {
        localObject1 = "";
        ((TextView)localObject2).setText((CharSequence)localObject1);
        if ((!(paramu.A().i instanceof g.rt)) && (paramu.A().i != null))
          break label481;
        this.b.setVisibility(4);
        this.b.setImageBitmap(null);
        label334: long l1 = paramu.a.e * 1000L;
        this.e.setText(String.format("%s, %s", new Object[] { org.vidogram.messenger.a.c(paramu.A().h), r.a("formatDateAtTime", 2131231995, new Object[] { r.a().f.a(new Date(l1)), r.a().c.a(new Date(l1)) }) }));
        if (this.i)
          break label578;
      }
      for (paramBoolean = true; ; paramBoolean = false)
      {
        setWillNotDraw(paramBoolean);
        this.g.a(0.0F, false);
        a();
        return;
        localObject1 = ((String)localObject3).substring(i1 + 1).toLowerCase();
        break;
        label481: this.b.setVisibility(0);
        this.b.a(paramu.A().i.c, "40_40", (Drawable)null);
        break label334;
        this.c.setText("");
        this.d.setText("");
        this.e.setText("");
        this.a.setVisibility(0);
        this.d.setVisibility(0);
        this.b.setVisibility(4);
        this.b.setImageBitmap(null);
        break label437;
      }
    }
  }

  public void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (this.h.getVisibility() != 0)
      this.h.setVisibility(0);
    this.h.a(paramBoolean1, paramBoolean2);
  }

  public void b(String paramString)
  {
    this.g.a(1.0F, true);
    a();
  }

  public boolean b()
  {
    return this.n;
  }

  public boolean c()
  {
    return this.m;
  }

  public u getMessage()
  {
    return this.l;
  }

  public int getObserverTag()
  {
    return this.k;
  }

  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    MediaController.a().a(this);
  }

  protected void onDraw(Canvas paramCanvas)
  {
    if (this.i)
      paramCanvas.drawLine(org.vidogram.messenger.a.a(72.0F), getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, j);
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i1 = org.vidogram.messenger.a.a(56.0F);
    if (this.i);
    for (paramInt2 = 1; ; paramInt2 = 0)
    {
      super.onMeasure(paramInt1, View.MeasureSpec.makeMeasureSpec(paramInt2 + i1, 1073741824));
      return;
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.c.ar
 * JD-Core Version:    0.6.0
 */