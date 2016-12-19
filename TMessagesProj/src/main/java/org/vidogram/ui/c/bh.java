package org.vidogram.ui.c;

import android.content.Context;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import java.util.concurrent.ConcurrentHashMap;
import org.vidogram.messenger.a;
import org.vidogram.messenger.ad;
import org.vidogram.messenger.ae;
import org.vidogram.messenger.r;
import org.vidogram.tgnet.ConnectionsManager;
import org.vidogram.tgnet.f;
import org.vidogram.tgnet.g.i;
import org.vidogram.tgnet.g.m;
import org.vidogram.tgnet.g.vw;
import org.vidogram.tgnet.g.vx;
import org.vidogram.tgnet.g.vy;
import org.vidogram.tgnet.g.x;
import org.vidogram.ui.Components.BackupImageView;
import org.vidogram.ui.Components.b;
import org.vidogram.ui.Components.i;
import org.vidogram.ui.Components.j;
import org.vidogram.ui.a.k;

public class bh extends FrameLayout
{
  private BackupImageView a;
  private k b;
  private k c;
  private ImageView d;
  private i e;
  private j f;
  private ImageView g;
  private b h = new b();
  private f i;
  private CharSequence j;
  private CharSequence k;
  private int l;
  private String m;
  private int n;
  private g.x o;
  private int p = -5723992;
  private int q = -12876608;

  public bh(Context paramContext, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    super(paramContext);
    this.a = new BackupImageView(paramContext);
    this.a.setRoundRadius(a.a(24.0F));
    Object localObject = this.a;
    int i1;
    float f1;
    label76: float f2;
    label89: int i2;
    if (r.a)
    {
      i1 = 5;
      if (!r.a)
        break label593;
      f1 = 0.0F;
      if (!r.a)
        break label603;
      f2 = paramInt1 + 7;
      addView((View)localObject, org.vidogram.ui.Components.v.a(48, 48.0F, i1 | 0x30, f1, 8.0F, f2, 0.0F));
      this.b = new k(paramContext);
      this.b.setTextColor(-14606047);
      this.b.setTextSize(17);
      localObject = this.b;
      if (!r.a)
        break label609;
      i1 = 5;
      label159: ((k)localObject).setGravity(i1 | 0x30);
      localObject = this.b;
      if (!r.a)
        break label615;
      i1 = 5;
      label184: if (!r.a)
        break label627;
      if (paramInt2 != 2)
        break label621;
      i2 = 18;
      label199: f1 = i2 + 28;
      label207: if (!r.a)
        break label637;
      f2 = paramInt1 + 68;
      addView((View)localObject, org.vidogram.ui.Components.v.a(-1, 20.0F, i1 | 0x30, f1, 11.5F, f2, 0.0F));
      this.c = new k(paramContext);
      this.c.setTextSize(14);
      localObject = this.c;
      if (!r.a)
        break label663;
      i1 = 5;
      label280: ((k)localObject).setGravity(i1 | 0x30);
      localObject = this.c;
      if (!r.a)
        break label669;
      i1 = 5;
      label305: if (!r.a)
        break label675;
      f1 = 28.0F;
      label315: if (!r.a)
        break label685;
      f2 = paramInt1 + 68;
      label328: addView((View)localObject, org.vidogram.ui.Components.v.a(-1, 20.0F, i1 | 0x30, f1, 34.5F, f2, 0.0F));
      this.d = new ImageView(paramContext);
      this.d.setScaleType(ImageView.ScaleType.CENTER);
      this.d.setVisibility(8);
      localObject = this.d;
      if (!r.a)
        break label692;
      i1 = 5;
      label398: if (!r.a)
        break label698;
      f1 = 0.0F;
      label407: if (!r.a)
        break label705;
      f2 = 16.0F;
      label417: addView((View)localObject, org.vidogram.ui.Components.v.a(-2, -2.0F, i1 | 0x10, f1, 0.0F, f2, 0.0F));
      if (paramInt2 != 2)
        break label729;
      this.f = new j(paramContext);
      localObject = this.f;
      if (!r.a)
        break label711;
      paramInt1 = 3;
      label472: if (!r.a)
        break label716;
      f1 = 19.0F;
      label482: if (!r.a)
        break label722;
      f2 = 0.0F;
      label491: addView((View)localObject, org.vidogram.ui.Components.v.a(18, 18.0F, paramInt1 | 0x10, f1, 0.0F, f2, 0.0F));
      label514: if (paramBoolean)
      {
        this.g = new ImageView(paramContext);
        paramContext = this.g;
        if (!r.a)
          break label840;
        paramInt1 = 3;
        label544: if (!r.a)
          break label845;
        f1 = 24.0F;
        label554: if (!r.a)
          break label851;
        f2 = 0.0F;
      }
    }
    while (true)
    {
      addView(paramContext, org.vidogram.ui.Components.v.a(16, 16.0F, paramInt1 | 0x30, f1, 13.5F, f2, 0.0F));
      return;
      i1 = 3;
      break;
      label593: f1 = paramInt1 + 7;
      break label76;
      label603: f2 = 0.0F;
      break label89;
      label609: i1 = 3;
      break label159;
      label615: i1 = 3;
      break label184;
      label621: i2 = 0;
      break label199;
      label627: f1 = paramInt1 + 68;
      break label207;
      label637: if (paramInt2 == 2);
      for (i2 = 18; ; i2 = 0)
      {
        f2 = i2 + 28;
        break;
      }
      label663: i1 = 3;
      break label280;
      label669: i1 = 3;
      break label305;
      label675: f1 = paramInt1 + 68;
      break label315;
      label685: f2 = 28.0F;
      break label328;
      label692: i1 = 3;
      break label398;
      label698: f1 = 16.0F;
      break label407;
      label705: f2 = 0.0F;
      break label417;
      label711: paramInt1 = 5;
      break label472;
      label716: f1 = 0.0F;
      break label482;
      label722: f2 = 19.0F;
      break label491;
      label729: if (paramInt2 != 1)
        break label514;
      this.e = new i(paramContext, 2130838112);
      this.e.setVisibility(4);
      localObject = this.e;
      if (r.a)
      {
        paramInt2 = 5;
        label770: if (!r.a)
          break label824;
        f1 = 0.0F;
        label779: if (!r.a)
          break label834;
        f2 = paramInt1 + 37;
      }
      while (true)
      {
        addView((View)localObject, org.vidogram.ui.Components.v.a(22, 22.0F, paramInt2 | 0x30, f1, 38.0F, f2, 0.0F));
        break;
        paramInt2 = 3;
        break label770;
        label824: f1 = paramInt1 + 37;
        break label779;
        label834: f2 = 0.0F;
      }
      label840: paramInt1 = 5;
      break label544;
      label845: f1 = 0.0F;
      break label554;
      label851: f2 = 24.0F;
    }
  }

  public void a(int paramInt)
  {
    int i5 = 1;
    int i4 = 0;
    if (this.i == null)
      return;
    Object localObject1;
    g.x localx;
    Object localObject2;
    if ((this.i instanceof g.vw))
    {
      localObject1 = (g.vw)this.i;
      if (((g.vw)localObject1).j == null)
        break label777;
      localx = ((g.vw)localObject1).j.e;
      localObject2 = null;
    }
    while (true)
    {
      int i2;
      label133: int i1;
      int i3;
      label172: String str1;
      if (paramInt != 0)
        if (((paramInt & 0x2) != 0) && (((this.o != null) && (localx == null)) || ((this.o == null) && (localx != null) && (this.o != null) && (localx != null) && ((this.o.c != localx.c) || (this.o.d != localx.d)))))
        {
          i2 = 1;
          i1 = i2;
          if (localObject1 != null)
          {
            i1 = i2;
            if (i2 == 0)
            {
              i1 = i2;
              if ((paramInt & 0x4) != 0)
              {
                if (((g.vw)localObject1).k == null)
                  break label751;
                i3 = ((g.vw)localObject1).k.c;
                i1 = i2;
                if (i3 != this.n)
                  i1 = 1;
              }
            }
          }
          if ((i1 == 0) && (this.j == null) && (this.m != null) && ((paramInt & 0x1) != 0))
            if (localObject1 != null)
            {
              str1 = ae.c((g.vw)localObject1);
              label221: if (str1.equals(this.m))
                break label738;
              paramInt = i5;
              label236: if (paramInt == 0)
                break label749;
            }
        }
      while (true)
      {
        if (localObject1 != null)
        {
          this.h.a((g.vw)localObject1);
          if (((g.vw)localObject1).k != null)
          {
            this.n = ((g.vw)localObject1).k.c;
            label274: if (this.j == null)
              break label477;
            this.m = null;
            this.b.setText(this.j);
            if (this.k == null)
              break label543;
            this.c.setTextColor(this.p);
            this.c.setText(this.k);
          }
        }
        while (true)
        {
          if (((this.d.getVisibility() == 0) && (this.l == 0)) || ((this.d.getVisibility() == 8) && (this.l != 0)))
          {
            localObject1 = this.d;
            paramInt = i4;
            if (this.l == 0)
              paramInt = 8;
            ((ImageView)localObject1).setVisibility(paramInt);
            this.d.setImageResource(this.l);
          }
          this.a.a(localx, "50_50", this.h);
          return;
          localObject2 = (g.i)this.i;
          if (((g.i)localObject2).j == null)
            break label768;
          localx = ((g.i)localObject2).j.b;
          localObject1 = null;
          break;
          str1 = ((g.i)localObject2).i;
          break label221;
          this.n = 0;
          break label274;
          this.h.a((g.i)localObject2);
          break label274;
          label477: if (localObject1 != null)
          {
            localObject2 = str1;
            if (str1 == null)
              localObject2 = ae.c((g.vw)localObject1);
          }
          String str2;
          for (this.m = ((String)localObject2); ; this.m = str2)
          {
            this.b.setText(this.m);
            break;
            str2 = str1;
            if (str1 != null)
              continue;
            str2 = ((g.i)localObject2).i;
          }
          label543: if (localObject1 == null)
            continue;
          if (((g.vw)localObject1).r)
          {
            this.c.setTextColor(this.p);
            if ((((g.vw)localObject1).s) || ((this.g != null) && (this.g.getVisibility() == 0)))
            {
              this.c.setText(r.a("BotStatusRead", 2131230933));
              continue;
            }
            this.c.setText(r.a("BotStatusCantRead", 2131230932));
            continue;
          }
          if ((((g.vw)localObject1).d == ad.c()) || ((((g.vw)localObject1).k != null) && (((g.vw)localObject1).k.c > ConnectionsManager.a().b())) || (org.vidogram.messenger.v.a().o.containsKey(Integer.valueOf(((g.vw)localObject1).d))))
          {
            this.c.setTextColor(this.q);
            this.c.setText(r.a("Online", 2131231606));
            continue;
          }
          this.c.setTextColor(this.p);
          this.c.setText(r.a((g.vw)localObject1));
        }
        label738: paramInt = i1;
        break label236;
        paramInt = i1;
        str1 = null;
        break label236;
        label749: break;
        label751: i3 = 0;
        break label172;
        i2 = 0;
        break label133;
        str1 = null;
      }
      label768: localObject1 = null;
      localx = null;
      continue;
      label777: localObject2 = null;
      localx = null;
    }
  }

  public void a(int paramInt1, int paramInt2)
  {
    this.p = paramInt1;
    this.q = paramInt2;
  }

  public void a(f paramf, CharSequence paramCharSequence1, CharSequence paramCharSequence2, int paramInt)
  {
    if (paramf == null)
    {
      this.k = null;
      this.j = null;
      this.i = null;
      this.b.setText("");
      this.c.setText("");
      this.a.setImageDrawable(null);
      return;
    }
    this.k = paramCharSequence2;
    this.j = paramCharSequence1;
    this.i = paramf;
    this.l = paramInt;
    a(0);
  }

  public void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (this.e != null)
    {
      if (this.e.getVisibility() != 0)
        this.e.setVisibility(0);
      this.e.a(paramBoolean1, paramBoolean2);
    }
    do
      return;
    while (this.f == null);
    if (this.f.getVisibility() != 0)
      this.f.setVisibility(0);
    this.f.a(paramBoolean1, paramBoolean2);
  }

  public boolean hasOverlappingRendering()
  {
    return false;
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(paramInt1), 1073741824), View.MeasureSpec.makeMeasureSpec(a.a(64.0F), 1073741824));
  }

  public void setCheckDisabled(boolean paramBoolean)
  {
    if (this.f != null)
      this.f.setDisabled(paramBoolean);
  }

  public void setIsAdmin(int paramInt)
  {
    if (this.g == null);
    label48: label95: label100: label105: 
    do
    {
      return;
      Object localObject = this.g;
      int i1;
      if (paramInt != 0)
      {
        i1 = 0;
        ((ImageView)localObject).setVisibility(i1);
        localObject = this.b;
        if ((!r.a) || (paramInt == 0))
          break label95;
        i1 = a.a(16.0F);
        if ((r.a) || (paramInt == 0))
          break label100;
      }
      for (int i2 = a.a(16.0F); ; i2 = 0)
      {
        ((k)localObject).setPadding(i1, 0, i2, 0);
        if (paramInt != 1)
          break label105;
        this.g.setImageResource(2130837593);
        return;
        i1 = 8;
        break;
        i1 = 0;
        break label48;
      }
    }
    while (paramInt != 2);
    this.g.setImageResource(2130837594);
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.c.bh
 * JD-Core Version:    0.6.0
 */