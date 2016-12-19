package org.vidogram.ui;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Locale;
import org.vidogram.messenger.ApplicationLoader;
import org.vidogram.messenger.n;
import org.vidogram.messenger.r;
import org.vidogram.messenger.support.widget.LinearLayoutManager;
import org.vidogram.messenger.support.widget.RecyclerView;
import org.vidogram.messenger.support.widget.RecyclerView.a;
import org.vidogram.messenger.support.widget.RecyclerView.i;
import org.vidogram.messenger.support.widget.RecyclerView.u;
import org.vidogram.messenger.y;
import org.vidogram.messenger.y.b;
import org.vidogram.tgnet.ConnectionsManager;
import org.vidogram.tgnet.c;
import org.vidogram.tgnet.g.be;
import org.vidogram.tgnet.g.qo;
import org.vidogram.tgnet.g.rg;
import org.vidogram.ui.Components.aw;
import org.vidogram.ui.Components.aw.b;
import org.vidogram.ui.Components.bl;
import org.vidogram.ui.Components.v;
import org.vidogram.ui.c.ap;
import org.vidogram.ui.c.ax;
import org.vidogram.ui.c.bf;
import org.vidogram.ui.c.bg;

public class ay extends org.vidogram.ui.a.g
  implements y.b
{
  private aw i;
  private a j;
  private boolean k;
  private int l;
  private int m;
  private int n;
  private int o;
  private int p;
  private int q;
  private int r;
  private int s;
  private int t;
  private int u;
  private int v;

  public ay(int paramInt)
  {
    this.l = paramInt;
  }

  private void q()
  {
    if (!this.k)
      return;
    org.vidogram.messenger.d.g.e(this.l);
    this.k = false;
    g.qo localqo = new g.qo();
    ArrayList localArrayList = org.vidogram.messenger.d.g.d(this.l);
    int i1 = 0;
    while (i1 < localArrayList.size())
    {
      localqo.e.add(Long.valueOf(((g.rg)localArrayList.get(i1)).c.b));
      i1 += 1;
    }
    ConnectionsManager.a().a(localqo, new c()
    {
    });
    y.a().a(y.P, new Object[] { Integer.valueOf(this.l) });
  }

  private void r()
  {
    this.v = 0;
    int i1;
    if (this.l == 0)
    {
      i1 = this.v;
      this.v = (i1 + 1);
      this.m = i1;
      i1 = this.v;
      this.v = (i1 + 1);
      this.n = i1;
      i1 = this.v;
      this.v = (i1 + 1);
      this.o = i1;
      i1 = this.v;
      this.v = (i1 + 1);
      this.p = i1;
      i1 = this.v;
      this.v = (i1 + 1);
      this.q = i1;
      i1 = this.v;
      this.v = (i1 + 1);
      this.r = i1;
      ArrayList localArrayList = org.vidogram.messenger.d.g.d(this.l);
      if (localArrayList.isEmpty())
        break label254;
      this.s = this.v;
      this.t = (this.v + localArrayList.size());
      i1 = this.v;
      this.v = (localArrayList.size() + i1);
      i1 = this.v;
      this.v = (i1 + 1);
    }
    for (this.u = i1; ; this.u = -1)
    {
      if (this.j != null)
        this.j.c();
      return;
      this.m = -1;
      this.n = -1;
      this.o = -1;
      this.p = -1;
      i1 = this.v;
      this.v = (i1 + 1);
      this.q = i1;
      i1 = this.v;
      this.v = (i1 + 1);
      this.r = i1;
      break;
      label254: this.s = -1;
      this.t = -1;
    }
  }

  public View a(Context paramContext)
  {
    this.d.setBackButtonImage(2130837794);
    this.d.setAllowOverlayTitle(true);
    if (this.l == 0)
      this.d.setTitle(r.a("Stickers", 2131231870));
    while (true)
    {
      this.d.setActionBarMenuOnItemClick(new org.vidogram.ui.a.a.a()
      {
        public void a(int paramInt)
        {
          if (paramInt == -1)
            ay.this.d();
        }
      });
      this.j = new a(paramContext);
      this.b = new FrameLayout(paramContext);
      FrameLayout localFrameLayout = (FrameLayout)this.b;
      localFrameLayout.setBackgroundColor(-986896);
      this.i = new aw(paramContext);
      this.i.setFocusable(true);
      this.i.setTag(Integer.valueOf(7));
      paramContext = new LinearLayoutManager(paramContext);
      paramContext.b(1);
      this.i.setLayoutManager(paramContext);
      new org.vidogram.messenger.support.widget.a.a(new b()).a(this.i);
      localFrameLayout.addView(this.i, v.a(-1, -1.0F));
      this.i.setAdapter(this.j);
      this.i.setOnItemClickListener(new aw.b()
      {
        public void a(View paramView, int paramInt)
        {
          if ((paramInt >= ay.c(ay.this)) && (paramInt < ay.d(ay.this)) && (ay.this.l() != null))
          {
            ay.e(ay.this);
            paramView = (g.rg)org.vidogram.messenger.d.g.d(ay.f(ay.this)).get(paramInt - ay.c(ay.this));
            ArrayList localArrayList = paramView.e;
            if ((localArrayList != null) && (!localArrayList.isEmpty()));
          }
          do
          {
            return;
            ay.this.b(new bl(ay.this.l(), ay.this, null, paramView, null));
            return;
            if (paramInt == ay.g(ay.this))
            {
              ay.this.a(new x());
              return;
            }
            if (paramInt != ay.h(ay.this))
              continue;
            ay.this.a(new a(ay.f(ay.this)));
            return;
          }
          while (paramInt != ay.i(ay.this));
          ay.this.a(new ay(1));
        }
      });
      return this.b;
      this.d.setTitle(r.a("Masks", 2131231409));
    }
  }

  public void a(int paramInt, Object[] paramArrayOfObject)
  {
    if (paramInt == y.P)
      if (((Integer)paramArrayOfObject[0]).intValue() == this.l)
        r();
    do
      return;
    while ((paramInt != y.Q) || (this.j == null));
    this.j.c(0);
  }

  public boolean f()
  {
    super.f();
    org.vidogram.messenger.d.g.a(this.l);
    if (this.l == 0)
      org.vidogram.messenger.d.g.b();
    y.a().a(this, y.P);
    y.a().a(this, y.Q);
    r();
    return true;
  }

  public void g()
  {
    super.g();
    y.a().b(this, y.P);
    y.a().b(this, y.Q);
    q();
  }

  public void i()
  {
    super.i();
    if (this.j != null)
      this.j.c();
  }

  private class a extends RecyclerView.a
  {
    private Context b;

    public a(Context arg2)
    {
      Object localObject;
      this.b = localObject;
    }

    private void a(int paramInt, g.rg paramrg)
    {
      int i = 2;
      Object localObject;
      if (paramInt == 0)
      {
        localObject = ay.this.l();
        g.be localbe = paramrg.c;
        paramInt = i;
        if (!paramrg.c.h)
          paramInt = 1;
        org.vidogram.messenger.d.g.a((Context)localObject, localbe, paramInt, ay.this, true);
      }
      do
      {
        return;
        if (paramInt == 1)
        {
          org.vidogram.messenger.d.g.a(ay.this.l(), paramrg.c, 0, ay.this, true);
          return;
        }
        if (paramInt != 2)
          continue;
        try
        {
          localObject = new Intent("android.intent.action.SEND");
          ((Intent)localObject).setType("text/plain");
          ((Intent)localObject).putExtra("android.intent.extra.TEXT", String.format(Locale.US, "https://telegram.me/addstickers/%s", new Object[] { paramrg.c.e }));
          ay.this.l().startActivityForResult(Intent.createChooser((Intent)localObject, r.a("StickersShare", 2131231875)), 500);
          return;
        }
        catch (Exception paramrg)
        {
          n.a("tmessages", paramrg);
          return;
        }
      }
      while (paramInt != 3);
      try
      {
        ((ClipboardManager)ApplicationLoader.a.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", String.format(Locale.US, "https://telegram.me/addstickers/%s", new Object[] { paramrg.c.e })));
        Toast.makeText(ay.this.l(), r.a("LinkCopied", 2131231383), 0).show();
        return;
      }
      catch (Exception paramrg)
      {
        n.a("tmessages", paramrg);
      }
    }

    public int a()
    {
      return ay.j(ay.this);
    }

    public int a(int paramInt)
    {
      if ((paramInt >= ay.c(ay.this)) && (paramInt < ay.d(ay.this)));
      do
      {
        return 0;
        if ((paramInt == ay.l(ay.this)) || (paramInt == ay.k(ay.this)) || (paramInt == ay.m(ay.this)))
          return 1;
        if ((paramInt == ay.g(ay.this)) || (paramInt == ay.h(ay.this)) || (paramInt == ay.i(ay.this)))
          return 2;
      }
      while (paramInt != ay.n(ay.this));
      return 3;
    }

    public RecyclerView.u a(ViewGroup paramViewGroup, int paramInt)
    {
      paramViewGroup = null;
      switch (paramInt)
      {
      default:
      case 0:
      case 1:
      case 2:
      case 3:
      }
      while (true)
      {
        paramViewGroup.setLayoutParams(new RecyclerView.i(-1, -2));
        return new a(paramViewGroup);
        paramViewGroup = new ax(this.b);
        paramViewGroup.setBackgroundResource(2130837949);
        ((ax)paramViewGroup).setOnOptionsClick(new View.OnClickListener()
        {
          public void onClick(View paramView)
          {
            ay.e(ay.this);
            g.rg localrg = ((ax)paramView.getParent()).getStickersSet();
            AlertDialog.Builder localBuilder = new AlertDialog.Builder(ay.this.l());
            localBuilder.setTitle(localrg.c.d);
            CharSequence[] arrayOfCharSequence;
            if (ay.f(ay.this) == 0)
              if (localrg.c.i)
              {
                paramView = new int[1];
                paramView[0] = 0;
                arrayOfCharSequence = new CharSequence[1];
                arrayOfCharSequence[0] = r.a("StickersHide", 2131231872);
              }
            while (true)
            {
              localBuilder.setItems(arrayOfCharSequence, new DialogInterface.OnClickListener(paramView, localrg)
              {
                public void onClick(DialogInterface paramDialogInterface, int paramInt)
                {
                  ay.a.a(ay.a.this, this.a[paramInt], this.b);
                }
              });
              ay.this.b(localBuilder.create());
              return;
              paramView = new int[4];
              View tmp138_137 = paramView;
              tmp138_137[0] = 0;
              View tmp142_138 = tmp138_137;
              tmp142_138[1] = 1;
              View tmp146_142 = tmp142_138;
              tmp146_142[2] = 2;
              View tmp150_146 = tmp146_142;
              tmp150_146[3] = 3;
              tmp150_146;
              arrayOfCharSequence = new CharSequence[4];
              arrayOfCharSequence[0] = r.a("StickersHide", 2131231872);
              arrayOfCharSequence[1] = r.a("StickersRemove", 2131231873);
              arrayOfCharSequence[2] = r.a("StickersShare", 2131231875);
              arrayOfCharSequence[3] = r.a("StickersCopy", 2131231871);
              continue;
              if (localrg.c.i)
              {
                paramView = new int[1];
                paramView[0] = 0;
                arrayOfCharSequence = new CharSequence[1];
                arrayOfCharSequence[0] = r.a("StickersRemove", 2131231872);
                continue;
              }
              paramView = new int[4];
              View tmp244_243 = paramView;
              tmp244_243[0] = 0;
              View tmp248_244 = tmp244_243;
              tmp248_244[1] = 1;
              View tmp252_248 = tmp248_244;
              tmp252_248[2] = 2;
              View tmp256_252 = tmp252_248;
              tmp256_252[3] = 3;
              tmp256_252;
              arrayOfCharSequence = new CharSequence[4];
              arrayOfCharSequence[0] = r.a("StickersHide", 2131231872);
              arrayOfCharSequence[1] = r.a("StickersRemove", 2131231873);
              arrayOfCharSequence[2] = r.a("StickersShare", 2131231875);
              arrayOfCharSequence[3] = r.a("StickersCopy", 2131231871);
            }
          }
        });
        continue;
        paramViewGroup = new bf(this.b);
        paramViewGroup.setBackgroundResource(2130837783);
        continue;
        paramViewGroup = new bg(this.b)
        {
          public boolean onTouchEvent(MotionEvent paramMotionEvent)
          {
            if ((Build.VERSION.SDK_INT >= 21) && (getBackground() != null) && ((paramMotionEvent.getAction() == 0) || (paramMotionEvent.getAction() == 2)))
              getBackground().setHotspot(paramMotionEvent.getX(), paramMotionEvent.getY());
            return super.onTouchEvent(paramMotionEvent);
          }
        };
        paramViewGroup.setBackgroundResource(2130837949);
        continue;
        paramViewGroup = new ap(this.b);
        paramViewGroup.setBackgroundResource(2130837783);
      }
    }

    public void a(RecyclerView.u paramu, int paramInt)
    {
      boolean bool = true;
      switch (paramu.h())
      {
      default:
      case 0:
      case 1:
      case 2:
      }
      do
      {
        Object localObject1;
        do
        {
          return;
          localObject1 = org.vidogram.messenger.d.g.d(ay.f(ay.this));
          paramInt -= ay.c(ay.this);
          paramu = (ax)paramu.a;
          Object localObject2 = (g.rg)((ArrayList)localObject1).get(paramInt);
          if (paramInt != ((ArrayList)localObject1).size() - 1);
          while (true)
          {
            paramu.a((g.rg)localObject2, bool);
            return;
            bool = false;
          }
          if (paramInt == ay.l(ay.this))
          {
            localObject1 = r.a("FeaturedStickersInfo", 2131231193);
            paramInt = ((String)localObject1).indexOf("@stickers");
            if (paramInt != -1)
              try
              {
                localObject2 = new SpannableStringBuilder((CharSequence)localObject1);
                ((SpannableStringBuilder)localObject2).setSpan(new StickersActivity.ListAdapter.1(this, "@stickers"), paramInt, "@stickers".length() + paramInt, 18);
                ((bf)paramu.a).setText((CharSequence)localObject2);
                return;
              }
              catch (Exception localException)
              {
                n.a("tmessages", localException);
                ((bf)paramu.a).setText((CharSequence)localObject1);
                return;
              }
            ((bf)paramu.a).setText((CharSequence)localObject1);
            return;
          }
          if (paramInt != ay.k(ay.this))
            continue;
          if (ay.f(ay.this) == 0)
          {
            ((bf)paramu.a).setText(r.a("ArchivedStickersInfo", 2131230868));
            return;
          }
          ((bf)paramu.a).setText(r.a("ArchivedMasksInfo", 2131230863));
          return;
        }
        while (paramInt != ay.m(ay.this));
        ((bf)paramu.a).setText(r.a("MasksInfo", 2131231410));
        return;
        if (paramInt == ay.g(ay.this))
        {
          paramInt = org.vidogram.messenger.d.g.f().size();
          localObject1 = (bg)paramu.a;
          String str = r.a("FeaturedStickers", 2131231192);
          if (paramInt != 0);
          for (paramu = String.format("%d", new Object[] { Integer.valueOf(paramInt) }); ; paramu = "")
          {
            ((bg)localObject1).a(str, paramu, false);
            return;
          }
        }
        if (paramInt != ay.h(ay.this))
          continue;
        if (ay.f(ay.this) == 0)
        {
          ((bg)paramu.a).a(r.a("ArchivedStickers", 2131230864), false);
          return;
        }
        ((bg)paramu.a).a(r.a("ArchivedMasks", 2131230859), false);
        return;
      }
      while (paramInt != ay.i(ay.this));
      ((bg)paramu.a).a(r.a("Masks", 2131231409), true);
    }

    public long b(int paramInt)
    {
      if ((paramInt >= ay.c(ay.this)) && (paramInt < ay.d(ay.this)))
        return ((g.rg)org.vidogram.messenger.d.g.d(ay.f(ay.this)).get(paramInt - ay.c(ay.this))).c.b;
      if ((paramInt == ay.h(ay.this)) || (paramInt == ay.k(ay.this)) || (paramInt == ay.g(ay.this)) || (paramInt == ay.l(ay.this)) || (paramInt == ay.i(ay.this)) || (paramInt == ay.m(ay.this)))
        return -2147483648L;
      return paramInt;
    }

    public void d(int paramInt1, int paramInt2)
    {
      if (paramInt1 != paramInt2)
        ay.a(ay.this, true);
      ArrayList localArrayList = org.vidogram.messenger.d.g.d(ay.f(ay.this));
      g.rg localrg = (g.rg)localArrayList.get(paramInt1 - ay.c(ay.this));
      localArrayList.set(paramInt1 - ay.c(ay.this), localArrayList.get(paramInt2 - ay.c(ay.this)));
      localArrayList.set(paramInt2 - ay.c(ay.this), localrg);
      b(paramInt1, paramInt2);
    }

    private class a extends RecyclerView.u
    {
      public a(View arg2)
      {
        super();
      }
    }
  }

  public class b extends org.vidogram.messenger.support.widget.a.a.a
  {
    public b()
    {
    }

    public int a(RecyclerView paramRecyclerView, RecyclerView.u paramu)
    {
      if (paramu.h() != 0)
        return b(0, 0);
      return b(3, 0);
    }

    public void a(Canvas paramCanvas, RecyclerView paramRecyclerView, RecyclerView.u paramu, float paramFloat1, float paramFloat2, int paramInt, boolean paramBoolean)
    {
      super.a(paramCanvas, paramRecyclerView, paramu, paramFloat1, paramFloat2, paramInt, paramBoolean);
    }

    public void a(RecyclerView.u paramu, int paramInt)
    {
    }

    public boolean a()
    {
      return true;
    }

    public void b(RecyclerView.u paramu, int paramInt)
    {
      if (paramInt != 0)
      {
        ay.b(ay.this).b(false);
        paramu.a.setPressed(true);
      }
      super.b(paramu, paramInt);
    }

    public boolean b(RecyclerView paramRecyclerView, RecyclerView.u paramu1, RecyclerView.u paramu2)
    {
      if (paramu1.h() != paramu2.h())
        return false;
      ay.a(ay.this).d(paramu1.e(), paramu2.e());
      return true;
    }

    public void c(RecyclerView paramRecyclerView, RecyclerView.u paramu)
    {
      super.c(paramRecyclerView, paramu);
      paramu.a.setPressed(false);
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.ay
 * JD-Core Version:    0.6.0
 */