package org.vidogram.ui;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.TargetApi;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.media.MediaCodecInfo;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.media.MediaPlayer.OnSeekCompleteListener;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.Surface;
import android.view.TextureView;
import android.view.TextureView.SurfaceTextureListener;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.a.a.a.k;
import com.a.a.a.m;
import com.a.a.a.x;
import com.b.a.b.h;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import org.vidogram.messenger.ApplicationLoader;
import org.vidogram.messenger.MediaController;
import org.vidogram.messenger.support.widget.LinearLayoutManager;
import org.vidogram.messenger.y.b;
import org.vidogram.tgnet.g.d;
import org.vidogram.tgnet.g.vw;
import org.vidogram.ui.Components.al;
import org.vidogram.ui.Components.al.a;
import org.vidogram.ui.Components.an;
import org.vidogram.ui.Components.aw;
import org.vidogram.ui.Components.aw.b;
import org.vidogram.ui.Components.aw.c;
import org.vidogram.ui.Components.bh;
import org.vidogram.ui.Components.br;
import org.vidogram.ui.Components.br.a;
import org.vidogram.ui.Components.bs;
import org.vidogram.ui.Components.bs.a;
import org.vidogram.ui.Components.v;
import org.vidogram.ui.a.a.a;
import org.vidogram.ui.a.c;
import org.vidogram.ui.b.n.b;

@TargetApi(16)
public class ba extends org.vidogram.ui.a.g
  implements y.b
{
  private boolean A;
  private boolean B;
  private boolean C;
  private String D;
  private String E;
  private float F;
  private boolean G;
  private a H;
  private CharSequence I;
  private final Object J = new Object();
  private Thread K;
  private int L;
  private int M;
  private int N;
  private int O;
  private int P;
  private int Q;
  private int R;
  private float S;
  private long T;
  private long U;
  private long V;
  private long W;
  private int X;
  private long Y;
  private long Z;
  private Runnable aa = new Runnable()
  {
    // ERROR //
    public void run()
    {
      // Byte code:
      //   0: aload_0
      //   1: getfield 16	org/vidogram/ui/ba$1:a	Lorg/vidogram/ui/ba;
      //   4: invokestatic 26	org/vidogram/ui/ba:a	(Lorg/vidogram/ui/ba;)Ljava/lang/Object;
      //   7: astore_3
      //   8: aload_3
      //   9: monitorenter
      //   10: aload_0
      //   11: getfield 16	org/vidogram/ui/ba$1:a	Lorg/vidogram/ui/ba;
      //   14: invokestatic 30	org/vidogram/ui/ba:b	(Lorg/vidogram/ui/ba;)Landroid/media/MediaPlayer;
      //   17: ifnull +48 -> 65
      //   20: aload_0
      //   21: getfield 16	org/vidogram/ui/ba$1:a	Lorg/vidogram/ui/ba;
      //   24: invokestatic 30	org/vidogram/ui/ba:b	(Lorg/vidogram/ui/ba;)Landroid/media/MediaPlayer;
      //   27: invokevirtual 36	android/media/MediaPlayer:isPlaying	()Z
      //   30: istore_2
      //   31: iload_2
      //   32: ifeq +33 -> 65
      //   35: iconst_1
      //   36: istore_1
      //   37: aload_3
      //   38: monitorexit
      //   39: iload_1
      //   40: ifne +51 -> 91
      //   43: aload_0
      //   44: getfield 16	org/vidogram/ui/ba$1:a	Lorg/vidogram/ui/ba;
      //   47: invokestatic 26	org/vidogram/ui/ba:a	(Lorg/vidogram/ui/ba;)Ljava/lang/Object;
      //   50: astore_3
      //   51: aload_3
      //   52: monitorenter
      //   53: aload_0
      //   54: getfield 16	org/vidogram/ui/ba$1:a	Lorg/vidogram/ui/ba;
      //   57: aconst_null
      //   58: invokestatic 39	org/vidogram/ui/ba:a	(Lorg/vidogram/ui/ba;Ljava/lang/Thread;)Ljava/lang/Thread;
      //   61: pop
      //   62: aload_3
      //   63: monitorexit
      //   64: return
      //   65: iconst_0
      //   66: istore_1
      //   67: goto -30 -> 37
      //   70: astore 4
      //   72: ldc 41
      //   74: aload 4
      //   76: invokestatic 46	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
      //   79: iconst_0
      //   80: istore_1
      //   81: goto -44 -> 37
      //   84: astore 4
      //   86: aload_3
      //   87: monitorexit
      //   88: aload 4
      //   90: athrow
      //   91: new 10	org/vidogram/ui/ba$1$1
      //   94: dup
      //   95: aload_0
      //   96: invokespecial 49	org/vidogram/ui/ba$1$1:<init>	(Lorg/vidogram/ui/ba$1;)V
      //   99: invokestatic 54	org/vidogram/messenger/a:a	(Ljava/lang/Runnable;)V
      //   102: ldc2_w 55
      //   105: invokestatic 62	java/lang/Thread:sleep	(J)V
      //   108: goto -108 -> 0
      //   111: astore_3
      //   112: ldc 41
      //   114: aload_3
      //   115: invokestatic 46	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
      //   118: goto -118 -> 0
      //   121: astore 4
      //   123: aload_3
      //   124: monitorexit
      //   125: aload 4
      //   127: athrow
      //
      // Exception table:
      //   from	to	target	type
      //   10	31	70	java/lang/Exception
      //   10	31	84	finally
      //   37	39	84	finally
      //   72	79	84	finally
      //   86	88	84	finally
      //   102	108	111	java/lang/Exception
      //   53	64	121	finally
      //   123	125	121	finally
    }
  };
  private TextureView i;
  private MediaPlayer j;
  private br k;
  private bs l;
  private ImageView m;
  private ImageView n;
  private ImageView o;
  private ImageView p;
  private org.vidogram.ui.a.d q;
  private al r;
  private an s;
  private q t;
  private org.vidogram.ui.b.n u;
  private aw v;
  private LinearLayoutManager w;
  private AnimatorSet x;
  private boolean y;
  private boolean z;

  public ba(Bundle paramBundle)
  {
    super(paramBundle);
    this.E = paramBundle.getString("videoPath");
  }

  private void b(boolean paramBoolean)
  {
    if (paramBoolean)
      this.I = this.r.getFieldCharSequence();
    this.d.setSubtitle(this.D);
    this.q.setVisibility(8);
    this.s.setVisibility(0);
    this.k.setVisibility(0);
    this.l.setVisibility(0);
    Object localObject = (FrameLayout.LayoutParams)this.r.getLayoutParams();
    ((FrameLayout.LayoutParams)localObject).bottomMargin = (-org.vidogram.messenger.a.a(400.0F));
    this.r.setLayoutParams((ViewGroup.LayoutParams)localObject);
    localObject = (FrameLayout.LayoutParams)this.v.getLayoutParams();
    ((FrameLayout.LayoutParams)localObject).bottomMargin = (-org.vidogram.messenger.a.a(400.0F));
    this.v.setLayoutParams((ViewGroup.LayoutParams)localObject);
    org.vidogram.ui.a.a locala = this.d;
    if (this.B)
    {
      localObject = org.vidogram.messenger.r.a("AttachGif", 2131230897);
      locala.setTitle((CharSequence)localObject);
      localObject = this.n;
      if (!TextUtils.isEmpty(this.I))
        break label203;
    }
    label203: for (int i1 = 2130838041; ; i1 = 2130838042)
    {
      ((ImageView)localObject).setImageResource(i1);
      if (!this.r.f())
        break label210;
      this.r.d();
      return;
      localObject = org.vidogram.messenger.r.a("AttachVideo", 2131230902);
      break;
    }
    label210: this.r.g();
  }

  private void r()
  {
    if (this.p != null)
      this.p.setImageResource(2130838193);
    if ((this.k != null) && (this.l != null))
      this.k.setProgress(this.l.getLeftProgress());
    try
    {
      if ((this.j != null) && (this.l != null))
        this.j.seekTo((int)(this.l.getLeftProgress() * this.S));
      return;
    }
    catch (Exception localException)
    {
      org.vidogram.messenger.n.a("tmessages", localException);
    }
  }

  private void s()
  {
    if (this.d == null)
      return;
    this.Y = ()Math.ceil((this.l.getRightProgress() - this.l.getLeftProgress()) * this.S);
    int i1;
    int i2;
    if ((this.o.getVisibility() == 8) || ((this.o.getVisibility() == 0) && (!this.C)))
      if ((this.L == 90) || (this.L == 270))
      {
        i1 = this.N;
        if ((this.L != 90) && (this.L != 270))
          break label301;
        i2 = this.M;
        label114: this.X = (int)((float)this.Z * ((float)this.Y / this.S));
        if (this.l.getLeftProgress() != 0.0F)
          break label422;
        this.T = -1L;
        label154: if (this.l.getRightProgress() != 1.0F)
          break label446;
      }
    label301: label446: for (this.U = -1L; ; this.U = (()(this.l.getRightProgress() * this.S) * 1000L))
    {
      String str1 = String.format("%dx%d", new Object[] { Integer.valueOf(i1), Integer.valueOf(i2) });
      i1 = (int)(this.Y / 1000L / 60L);
      String str2 = String.format("%d:%02d, ~%s", new Object[] { Integer.valueOf(i1), Integer.valueOf((int)Math.ceil(this.Y / 1000L) - i1 * 60), org.vidogram.messenger.a.c(this.X) });
      this.d.setSubtitle(String.format("%s, %s", new Object[] { str1, str2 }));
      return;
      i1 = this.M;
      break;
      i2 = this.N;
      break label114;
      if ((this.L == 90) || (this.L == 270))
      {
        i1 = this.P;
        label333: if ((this.L != 90) && (this.L != 270))
          break label414;
      }
      for (i2 = this.O; ; i2 = this.P)
      {
        this.X = (int)((float)(this.V + this.W) * ((float)this.Y / this.S));
        this.X += this.X / 32768 * 16;
        break;
        i1 = this.O;
        break label333;
      }
      this.T = (()(this.l.getLeftProgress() * this.S) * 1000L);
      break label154;
    }
  }

  private boolean t()
  {
    label596: label613: label631: label636: 
    do
      while (true)
      {
        Object localObject2;
        long l1;
        Object localObject4;
        int i3;
        try
        {
          this.Z = new File(this.E).length();
          localObject2 = new com.a.a.d(this.E);
          Object localObject3 = h.b((com.a.a.a.d)localObject2, "/moov/trak/");
          Object localObject1 = null;
          i1 = 1;
          if (h.a((com.a.a.a.d)localObject2, "/moov/trak/mdia/minf/stbl/stsd/mp4a/") != null)
            break label636;
          i1 = 0;
          break label636;
          if (h.a((com.a.a.a.d)localObject2, "/moov/trak/mdia/minf/stbl/stsd/avc1/") != null)
            break label631;
          i1 = 0;
          localObject3 = ((List)localObject3).iterator();
          if (!((Iterator)localObject3).hasNext())
            break;
          localObject2 = (x)(com.a.a.a.b)((Iterator)localObject3).next();
          l1 = 0L;
          long l2 = l1;
          try
          {
            localObject4 = ((x)localObject2).f();
            l2 = l1;
            com.a.a.a.l locall = ((k)localObject4).f();
            l2 = l1;
            localObject4 = ((k)localObject4).e().e().e().g();
            l2 = l1;
            i3 = localObject4.length;
            i2 = 0;
            break label642;
            l2 = l1;
            this.S = ((float)locall.h() / (float)locall.g());
            f1 = (float)(8L * l1);
            l2 = l1;
            f2 = this.S;
            long l3 = (int)(f1 / f2);
            l2 = l1;
            l1 = l3;
            localObject2 = ((x)localObject2).e();
            if ((((com.a.a.a.y)localObject2).m() == 0.0D) || (((com.a.a.a.y)localObject2).n() == 0.0D))
              continue;
            i2 = (int)(l1 / 100000L * 100000L);
            this.Q = i2;
            this.R = i2;
            if (this.Q <= 900000)
              continue;
            this.Q = 900000;
            this.W += l2;
            localObject1 = localObject2;
          }
          catch (Exception localException2)
          {
            org.vidogram.messenger.n.a("tmessages", localException2);
            l1 = 0L;
            continue;
            this.V += l2;
          }
          localObject2 = localObject1.l();
          if (!((com.b.a.b.g)localObject2).equals(com.b.a.b.g.k))
            continue;
          this.L = 90;
          i2 = (int)localObject1.m();
          this.M = i2;
          this.O = i2;
          i2 = (int)localObject1.n();
          this.N = i2;
          this.P = i2;
          if ((this.O <= 640) && (this.P <= 640))
            continue;
          if (this.O <= this.P)
            break label596;
          f1 = 640.0F / this.O;
          this.O = (int)(this.O * f1);
          this.P = (int)(this.P * f1);
          if (this.Q == 0)
            continue;
          float f2 = this.Q;
          this.Q = (int)(Math.max(0.5F, f1) * f2);
          this.W = ()(this.Q / 8 * this.S);
          if (i1 != 0)
            break label613;
          if (this.O == this.M)
            break label678;
          if (this.P != this.N)
            break label613;
          break label678;
          if (((com.b.a.b.g)localObject2).equals(com.b.a.b.g.l))
          {
            this.L = 180;
            continue;
          }
        }
        catch (Exception localException1)
        {
          org.vidogram.messenger.n.a("tmessages", localException1);
          return false;
        }
        if (!((com.b.a.b.g)localObject2).equals(com.b.a.b.g.m))
          continue;
        this.L = 270;
        continue;
        int i2 = this.P;
        float f1 = 640.0F / i2;
        continue;
        this.S *= 1000.0F;
        s();
        return true;
        int i1 = 1;
        continue;
        if (i1 == 0)
        {
          return false;
          while (i2 < i3)
          {
            l1 += localObject4[i2];
            i2 += 1;
          }
        }
      }
    while (localException1 != null);
    label642: return false;
    label678: return false;
  }

  public View a(Context paramContext)
  {
    this.C = ApplicationLoader.a.getSharedPreferences("mainconfig", 0).getBoolean("compress_video", true);
    this.d.setBackgroundColor(-16777216);
    this.d.setItemsBackgroundColor(-12763843);
    this.d.setBackButtonImage(2130837794);
    this.d.setTitle(org.vidogram.messenger.r.a("AttachVideo", 2131230902));
    this.d.setSubtitleColor(-1);
    this.d.setActionBarMenuOnItemClick(new a.a()
    {
      public void a(int paramInt)
      {
        if (paramInt == -1)
          if ((ba.h(ba.this).f()) || (ba.h(ba.this).h()))
            ba.b(ba.this, false);
        do
        {
          return;
          ba.this.d();
          return;
        }
        while (paramInt != 1);
        ba.b(ba.this, true);
      }
    });
    this.q = this.d.a().b(1, 2130837825, org.vidogram.messenger.a.a(56.0F));
    this.q.setVisibility(8);
    this.b = new bh(paramContext)
    {
      int a;

      public boolean dispatchKeyEventPreIme(KeyEvent paramKeyEvent)
      {
        if ((paramKeyEvent != null) && (paramKeyEvent.getKeyCode() == 4) && (paramKeyEvent.getAction() == 1) && ((ba.h(ba.this).f()) || (ba.h(ba.this).h())))
        {
          ba.b(ba.this, false);
          return false;
        }
        return super.dispatchKeyEventPreIme(paramKeyEvent);
      }

      protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
      {
        int i1 = getChildCount();
        int m;
        if ((getKeyboardHeight() <= org.vidogram.messenger.a.a(20.0F)) && (!org.vidogram.messenger.a.i))
          m = ba.h(ba.this).getEmojiPadding();
        int i2;
        View localView;
        FrameLayout.LayoutParams localLayoutParams;
        int i3;
        int i4;
        int i;
        int j;
        while (true)
        {
          i2 = org.vidogram.messenger.a.c.y - org.vidogram.ui.a.a.getCurrentActionBarHeight();
          int n = 0;
          while (true)
          {
            if (n >= i1)
              break label702;
            localView = getChildAt(n);
            if (localView.getVisibility() == 8)
            {
              n += 1;
              continue;
              m = 0;
              break;
            }
          }
          localLayoutParams = (FrameLayout.LayoutParams)localView.getLayoutParams();
          i3 = localView.getMeasuredWidth();
          i4 = localView.getMeasuredHeight();
          i = localLayoutParams.gravity;
          j = i;
          if (i == -1)
            j = 51;
          switch (j & 0x7 & 0x7)
          {
          default:
            i = localLayoutParams.leftMargin;
            label179: switch (j & 0x70)
            {
            default:
              j = localLayoutParams.topMargin;
              label227: if (localView == ba.m(ba.this))
              {
                j = paramInt4 - m - paramInt2 - i4 - localLayoutParams.bottomMargin;
                if ((!ba.h(ba.this).f()) && (!ba.h(ba.this).h()) && (ba.h(ba.this).getEmojiPadding() == 0))
                  j = org.vidogram.messenger.a.a(400.0F) + j;
              }
            case 48:
            case 16:
            case 80:
            }
          case 1:
          case 5:
          }
        }
        while (true)
        {
          localView.layout(i, j, i + i3, j + i4);
          break;
          i = (paramInt3 - paramInt1 - i3) / 2 + localLayoutParams.leftMargin - localLayoutParams.rightMargin;
          break label179;
          i = paramInt3 - i3 - localLayoutParams.rightMargin;
          break label179;
          j = localLayoutParams.topMargin;
          break label227;
          j = (i2 - i4) / 2 + localLayoutParams.topMargin - localLayoutParams.bottomMargin;
          break label227;
          j = i2 - i4 - localLayoutParams.bottomMargin;
          break label227;
          j -= ba.h(ba.this).getMeasuredHeight();
          continue;
          int k;
          if (localView == ba.h(ba.this))
          {
            j = paramInt4 - m - paramInt2 - i4 - localLayoutParams.bottomMargin;
            k = j;
            if (!ba.h(ba.this).f())
            {
              k = j;
              if (!ba.h(ba.this).h())
              {
                k = j;
                if (ba.h(ba.this).getEmojiPadding() == 0)
                {
                  j += org.vidogram.messenger.a.a(400.0F);
                  continue;
                }
              }
            }
          }
          else if (localView == ba.n(ba.this))
          {
            if (!ba.h(ba.this).f())
            {
              k = j;
              if (!ba.h(ba.this).h());
            }
            else
            {
              j += org.vidogram.messenger.a.a(400.0F);
              continue;
            }
          }
          else
          {
            if (ba.h(ba.this).a(localView))
            {
              if (org.vidogram.messenger.a.i)
              {
                j = ba.h(ba.this).getTop();
                k = localView.getMeasuredHeight();
                j = org.vidogram.messenger.a.a(1.0F) + (j - k);
                continue;
              }
              j = ba.h(ba.this).getBottom();
              continue;
            }
            k = j;
            if (localView == ba.i(ba.this))
            {
              i = (paramInt3 - paramInt1 - ba.i(ba.this).getMeasuredWidth()) / 2;
              j = org.vidogram.messenger.a.a(14.0F);
              continue;
              label702: a();
              return;
            }
          }
          j = k;
        }
      }

      protected void onMeasure(int paramInt1, int paramInt2)
      {
        int m = View.MeasureSpec.getSize(paramInt1);
        setMeasuredDimension(m, View.MeasureSpec.getSize(paramInt2));
        int i1 = org.vidogram.messenger.a.c.y - org.vidogram.ui.a.a.getCurrentActionBarHeight();
        measureChildWithMargins(ba.h(ba.this), paramInt1, 0, paramInt2, 0);
        int i2 = ba.h(ba.this).getMeasuredHeight();
        int i3 = getChildCount();
        int i = 0;
        if (i < i3)
        {
          View localView = getChildAt(i);
          if ((localView.getVisibility() == 8) || (localView == ba.h(ba.this)));
          while (true)
          {
            i += 1;
            break;
            if (ba.h(ba.this).a(localView))
            {
              if (org.vidogram.messenger.a.i)
              {
                if (org.vidogram.messenger.a.c())
                {
                  localView.measure(View.MeasureSpec.makeMeasureSpec(m, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(org.vidogram.messenger.a.a(320.0F), i1 - i2 - org.vidogram.messenger.a.a), 1073741824));
                  continue;
                }
                localView.measure(View.MeasureSpec.makeMeasureSpec(m, 1073741824), View.MeasureSpec.makeMeasureSpec(i1 - i2 - org.vidogram.messenger.a.a, 1073741824));
                continue;
              }
              localView.measure(View.MeasureSpec.makeMeasureSpec(m, 1073741824), View.MeasureSpec.makeMeasureSpec(localView.getLayoutParams().height, 1073741824));
              continue;
            }
            if (localView == ba.i(ba.this))
            {
              int n = i1 - org.vidogram.messenger.a.a(166.0F);
              int j;
              label287: int k;
              label321: float f3;
              if ((ba.j(ba.this) == 90) || (ba.j(ba.this) == 270))
              {
                j = ba.k(ba.this);
                if ((ba.j(ba.this) != 90) && (ba.j(ba.this) != 270))
                  break label401;
                k = ba.l(ba.this);
                float f1 = m / j;
                float f2 = n / k;
                f3 = j / k;
                if (f1 <= f2)
                  break label413;
                k = (int)(f3 * n);
                j = n;
              }
              while (true)
              {
                localView.measure(View.MeasureSpec.makeMeasureSpec(k, 1073741824), View.MeasureSpec.makeMeasureSpec(j, 1073741824));
                break;
                j = ba.l(ba.this);
                break label287;
                label401: k = ba.k(ba.this);
                break label321;
                label413: j = (int)(m / f3);
                k = m;
              }
            }
            measureChildWithMargins(localView, paramInt1, 0, paramInt2, 0);
          }
        }
        if (this.a != m)
        {
          ba.c(ba.this).b();
          this.a = m;
        }
      }
    };
    this.b.setBackgroundColor(-16777216);
    Object localObject1 = (bh)this.b;
    ((bh)localObject1).setWithoutWindow(true);
    this.s = new an(paramContext);
    this.s.setBackgroundColor(0);
    this.s.a(0, false);
    ((bh)localObject1).addView(this.s, v.b(-1, 48, 83));
    this.s.a.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramView)
      {
        ba.this.d();
      }
    });
    this.s.b.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View arg1)
      {
        int i;
        long l3;
        long l4;
        while (true)
        {
          synchronized (ba.a(ba.this))
          {
            Object localObject1 = ba.b(ba.this);
            if (localObject1 == null)
              continue;
            try
            {
              ba.b(ba.this).stop();
              ba.b(ba.this).release();
              ba.a(ba.this, null);
              if (ba.o(ba.this) == null)
                continue;
              if ((ba.p(ba.this).getVisibility() != 8) && ((ba.p(ba.this).getVisibility() != 0) || (ba.q(ba.this))))
                break;
              localObject1 = ba.o(ba.this);
              str = ba.r(ba.this);
              l1 = ba.s(ba.this);
              l2 = ba.t(ba.this);
              j = ba.l(ba.this);
              k = ba.k(ba.this);
              m = ba.j(ba.this);
              n = ba.l(ba.this);
              i1 = ba.k(ba.this);
              if (ba.u(ba.this))
              {
                i = -1;
                l3 = ba.w(ba.this);
                l4 = ba.x(ba.this);
                if (ba.y(ba.this) == null)
                  break label303;
                ??? = ba.y(ba.this).toString();
                ((ba.a)localObject1).a(str, l1, l2, j, k, m, n, i1, i, l3, l4, ???);
                ba.this.d();
                return;
              }
            }
            catch (Exception localException)
            {
              org.vidogram.messenger.n.a("tmessages", localException);
              continue;
            }
          }
          i = ba.v(ba.this);
          continue;
          label303: ??? = null;
        }
        ba.a locala = ba.o(ba.this);
        String str = ba.r(ba.this);
        long l1 = ba.s(ba.this);
        long l2 = ba.t(ba.this);
        int j = ba.z(ba.this);
        int k = ba.A(ba.this);
        int m = ba.j(ba.this);
        int n = ba.l(ba.this);
        int i1 = ba.k(ba.this);
        if (ba.u(ba.this))
        {
          i = -1;
          label400: l3 = ba.w(ba.this);
          l4 = ba.x(ba.this);
          if (ba.y(ba.this) == null)
            break label484;
        }
        label484: for (??? = ba.y(ba.this).toString(); ; ??? = null)
        {
          locala.a(str, l1, l2, j, k, m, n, i1, i, l3, l4, ???);
          break;
          i = ba.B(ba.this);
          break label400;
        }
      }
    });
    LinearLayout localLinearLayout = new LinearLayout(paramContext);
    localLinearLayout.setOrientation(0);
    this.s.addView(localLinearLayout, v.b(-2, 48, 49));
    this.n = new ImageView(paramContext);
    this.n.setScaleType(ImageView.ScaleType.CENTER);
    Object localObject2 = this.n;
    int i1;
    if (TextUtils.isEmpty(this.I))
      i1 = 2130838041;
    while (true)
    {
      ((ImageView)localObject2).setImageResource(i1);
      this.n.setBackgroundDrawable(org.vidogram.ui.a.l.a(1090519039));
      localLinearLayout.addView(this.n, v.b(56, 48));
      this.n.setOnClickListener(new View.OnClickListener()
      {
        public void onClick(View paramView)
        {
          ba.h(ba.this).setFieldText(ba.y(ba.this));
          ba.C(ba.this).setVisibility(0);
          ba.f(ba.this).setVisibility(8);
          ba.c(ba.this).setVisibility(8);
          ba.n(ba.this).setVisibility(8);
          paramView = (FrameLayout.LayoutParams)ba.h(ba.this).getLayoutParams();
          paramView.bottomMargin = 0;
          ba.h(ba.this).setLayoutParams(paramView);
          paramView = (FrameLayout.LayoutParams)ba.m(ba.this).getLayoutParams();
          paramView.bottomMargin = 0;
          ba.m(ba.this).setLayoutParams(paramView);
          ba.h(ba.this).e();
          ba.a(ba.this, ba.D(ba.this).getSubtitle());
          ba.E(ba.this).setTitle(org.vidogram.messenger.r.a("VideoCaption", 2131231945));
          ba.F(ba.this).setSubtitle(null);
        }
      });
      this.o = new ImageView(paramContext);
      this.o.setScaleType(ImageView.ScaleType.CENTER);
      localObject2 = this.o;
      if (this.C)
      {
        i1 = 2130837785;
        label407: ((ImageView)localObject2).setImageResource(i1);
        this.o.setBackgroundDrawable(org.vidogram.ui.a.l.a(1090519039));
        localObject2 = this.o;
        if ((this.N == this.P) && (this.M == this.O))
          break label1105;
        i1 = 0;
        label456: ((ImageView)localObject2).setVisibility(i1);
        localLinearLayout.addView(this.o, v.b(56, 48));
        this.o.setOnClickListener(new View.OnClickListener()
        {
          public void onClick(View paramView)
          {
            paramView = ba.this;
            boolean bool;
            if (!ba.q(ba.this))
            {
              bool = true;
              ba.c(paramView, bool);
              paramView = ApplicationLoader.a.getSharedPreferences("mainconfig", 0).edit();
              paramView.putBoolean("compress_video", ba.q(ba.this));
              paramView.commit();
              paramView = ba.p(ba.this);
              if (!ba.q(ba.this))
                break label100;
            }
            label100: for (int i = 2130837785; ; i = 2130837786)
            {
              paramView.setImageResource(i);
              ba.G(ba.this);
              return;
              bool = false;
              break;
            }
          }
        });
        if (Build.VERSION.SDK_INT >= 18);
      }
      try
      {
        localObject2 = MediaController.a("video/avc");
        if (localObject2 == null)
          this.o.setVisibility(8);
        while (true)
        {
          this.m = new ImageView(paramContext);
          this.m.setScaleType(ImageView.ScaleType.CENTER);
          this.m.setBackgroundDrawable(org.vidogram.ui.a.l.a(1090519039));
          localLinearLayout.addView(this.m, v.b(56, 48));
          this.m.setOnClickListener(new View.OnClickListener()
          {
            public void onClick(View paramView)
            {
              paramView = ba.this;
              if (!ba.u(ba.this));
              for (boolean bool = true; ; bool = false)
              {
                ba.d(paramView, bool);
                ba.this.q();
                return;
              }
            }
          });
          this.l = new bs(paramContext);
          this.l.setVideoPath(this.E);
          this.l.setDelegate(new bs.a()
          {
            public void a(float paramFloat)
            {
              if ((ba.b(ba.this) == null) || (!ba.H(ba.this)))
                return;
              try
              {
                if (ba.b(ba.this).isPlaying())
                {
                  ba.b(ba.this).pause();
                  ba.I(ba.this).setImageResource(2130838193);
                }
                ba.b(ba.this).setOnSeekCompleteListener(null);
                ba.b(ba.this).seekTo((int)(ba.d(ba.this) * paramFloat));
                ba.e(ba.this, true);
                ba.f(ba.this).setProgress(ba.c(ba.this).getLeftProgress());
                ba.G(ba.this);
                return;
              }
              catch (Exception localException)
              {
                while (true)
                  org.vidogram.messenger.n.a("tmessages", localException);
              }
            }

            public void b(float paramFloat)
            {
              if ((ba.b(ba.this) == null) || (!ba.H(ba.this)))
                return;
              try
              {
                if (ba.b(ba.this).isPlaying())
                {
                  ba.b(ba.this).pause();
                  ba.I(ba.this).setImageResource(2130838193);
                }
                ba.b(ba.this).setOnSeekCompleteListener(null);
                ba.b(ba.this).seekTo((int)(ba.d(ba.this) * paramFloat));
                ba.e(ba.this, true);
                ba.f(ba.this).setProgress(ba.c(ba.this).getLeftProgress());
                ba.G(ba.this);
                return;
              }
              catch (Exception localException)
              {
                while (true)
                  org.vidogram.messenger.n.a("tmessages", localException);
              }
            }
          });
          ((bh)localObject1).addView(this.l, v.a(-1, 44.0F, 83, 0.0F, 0.0F, 0.0F, 67.0F));
          this.k = new br(paramContext);
          this.k.setDelegate(new br.a()
          {
            public void a(float paramFloat)
            {
              float f;
              if (paramFloat < ba.c(ba.this).getLeftProgress())
              {
                f = ba.c(ba.this).getLeftProgress();
                ba.f(ba.this).setProgress(f);
              }
              while ((ba.b(ba.this) == null) || (!ba.H(ba.this)))
              {
                return;
                f = paramFloat;
                if (paramFloat <= ba.c(ba.this).getRightProgress())
                  continue;
                f = ba.c(ba.this).getRightProgress();
                ba.f(ba.this).setProgress(f);
              }
              if (ba.b(ba.this).isPlaying())
                try
                {
                  ba.b(ba.this).seekTo((int)(ba.d(ba.this) * f));
                  ba.a(ba.this, f);
                  return;
                }
                catch (Exception localException)
                {
                  org.vidogram.messenger.n.a("tmessages", localException);
                  return;
                }
              ba.a(ba.this, f);
              ba.e(ba.this, true);
            }
          });
          ((bh)localObject1).addView(this.k, v.a(-1, 40.0F, 83, 11.0F, 0.0F, 11.0F, 112.0F));
          this.i = new TextureView(paramContext);
          this.i.setSurfaceTextureListener(new TextureView.SurfaceTextureListener()
          {
            public void onSurfaceTextureAvailable(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
            {
              if ((ba.i(ba.this) == null) || (!ba.i(ba.this).isAvailable()) || (ba.b(ba.this) == null));
              while (true)
              {
                return;
                try
                {
                  paramSurfaceTexture = new Surface(ba.i(ba.this).getSurfaceTexture());
                  ba.b(ba.this).setSurface(paramSurfaceTexture);
                  if (!ba.H(ba.this))
                    continue;
                  ba.b(ba.this).seekTo((int)(ba.c(ba.this).getLeftProgress() * ba.d(ba.this)));
                  return;
                }
                catch (Exception paramSurfaceTexture)
                {
                  org.vidogram.messenger.n.a("tmessages", paramSurfaceTexture);
                }
              }
            }

            public boolean onSurfaceTextureDestroyed(SurfaceTexture paramSurfaceTexture)
            {
              if (ba.b(ba.this) == null)
                return true;
              ba.b(ba.this).setDisplay(null);
              return true;
            }

            public void onSurfaceTextureSizeChanged(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
            {
            }

            public void onSurfaceTextureUpdated(SurfaceTexture paramSurfaceTexture)
            {
            }
          });
          ((bh)localObject1).addView(this.i, v.a(-1, -1.0F, 51, 0.0F, 14.0F, 0.0F, 140.0F));
          this.p = new ImageView(paramContext);
          this.p.setScaleType(ImageView.ScaleType.CENTER);
          this.p.setImageResource(2130838193);
          this.p.setOnClickListener(new View.OnClickListener()
          {
            public void onClick(View arg1)
            {
              if ((ba.b(ba.this) == null) || (!ba.H(ba.this)))
                return;
              if (ba.b(ba.this).isPlaying())
              {
                ba.b(ba.this).pause();
                ba.I(ba.this).setImageResource(2130838193);
                return;
              }
              try
              {
                ba.I(ba.this).setImageDrawable(null);
                ba.a(ba.this, 0.0F);
                if (ba.J(ba.this))
                {
                  ba.b(ba.this).seekTo((int)(ba.d(ba.this) * ba.f(ba.this).getProgress()));
                  ba.e(ba.this, false);
                }
                ba.b(ba.this).setOnSeekCompleteListener(new MediaPlayer.OnSeekCompleteListener()
                {
                  public void onSeekComplete(MediaPlayer paramMediaPlayer)
                  {
                    float f2 = ba.c(ba.this).getLeftProgress() * ba.d(ba.this);
                    float f3 = ba.c(ba.this).getRightProgress() * ba.d(ba.this);
                    float f1 = f2;
                    if (f2 == f3)
                      f1 = f3 - 0.01F;
                    ba.a(ba.this, (ba.b(ba.this).getCurrentPosition() - f1) / (f3 - f1));
                    f1 = ba.c(ba.this).getRightProgress();
                    f2 = ba.c(ba.this).getLeftProgress();
                    paramMediaPlayer = ba.this;
                    f3 = ba.c(ba.this).getLeftProgress();
                    ba.a(paramMediaPlayer, (f1 - f2) * ba.e(ba.this) + f3);
                    ba.f(ba.this).setProgress(ba.e(ba.this));
                  }
                });
                ba.b(ba.this).start();
                synchronized (ba.a(ba.this))
                {
                  if (ba.K(ba.this) == null)
                  {
                    ba.a(ba.this, new Thread(ba.L(ba.this)));
                    ba.K(ba.this).start();
                  }
                  return;
                }
              }
              catch (Exception )
              {
                org.vidogram.messenger.n.a("tmessages", ???);
              }
            }
          });
          ((bh)localObject1).addView(this.p, v.a(100, 100.0F, 17, 0.0F, 0.0F, 0.0F, 70.0F));
          if (this.r != null)
            this.r.c();
          this.r = new al(paramContext, (bh)localObject1, null);
          this.r.setDelegate(new al.a()
          {
            public void a(int paramInt)
            {
              int j = Math.min(3, ba.M(ba.this).a());
              int i;
              if (ba.M(ba.this).a() > 3)
              {
                i = 18;
                i = org.vidogram.messenger.a.a(i + j * 36);
                if (paramInt - org.vidogram.ui.a.a.getCurrentActionBarHeight() * 2 >= i)
                  break label113;
                ba.f(ba.this, false);
                if ((ba.m(ba.this) != null) && (ba.m(ba.this).getVisibility() == 0))
                  ba.m(ba.this).setVisibility(4);
              }
              while (true)
              {
                ba.O(ba.this).requestLayout();
                return;
                i = 0;
                break;
                label113: ba.f(ba.this, true);
                if ((ba.m(ba.this) == null) || (ba.m(ba.this).getVisibility() != 4))
                  continue;
                ba.m(ba.this).setVisibility(0);
              }
            }

            public void a(CharSequence paramCharSequence)
            {
              if ((ba.M(ba.this) != null) && (ba.h(ba.this) != null) && (ba.N(ba.this) != null) && (paramCharSequence != null))
                ba.M(ba.this).a(paramCharSequence.toString(), ba.h(ba.this).getCursorPosition(), ba.N(ba.this).m);
            }
          });
          ((bh)localObject1).addView(this.r, v.a(-1, -2.0F, 83, 0.0F, 0.0F, 0.0F, -400.0F));
          this.r.b();
          this.v = new aw(paramContext);
          this.v.setTag(Integer.valueOf(5));
          this.w = new LinearLayoutManager(paramContext)
          {
            public boolean c()
            {
              return false;
            }
          };
          this.w.b(1);
          this.v.setLayoutManager(this.w);
          this.v.setBackgroundColor(2130706432);
          this.v.setVisibility(8);
          this.v.setClipToPadding(true);
          this.v.setOverScrollMode(2);
          ((bh)localObject1).addView(this.v, v.b(-1, 110, 83));
          localObject1 = this.v;
          paramContext = new org.vidogram.ui.b.n(paramContext, true, 0L, new n.b()
          {
            public void a(g.d paramd)
            {
            }

            public void a(boolean paramBoolean)
            {
              if (paramBoolean)
              {
                FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)ba.m(ba.this).getLayoutParams();
                int k = Math.min(3, ba.M(ba.this).a());
                if (ba.M(ba.this).a() > 3)
                {
                  int i = 18;
                  i += k * 36;
                  localLayoutParams.height = org.vidogram.messenger.a.a(i);
                  localLayoutParams.topMargin = (-org.vidogram.messenger.a.a(i));
                  ba.m(ba.this).setLayoutParams(localLayoutParams);
                  if (ba.P(ba.this) != null)
                  {
                    ba.P(ba.this).cancel();
                    ba.a(ba.this, null);
                  }
                  if (ba.m(ba.this).getVisibility() != 0)
                    break label150;
                  ba.m(ba.this).setAlpha(1.0F);
                }
              }
              label150: 
              do
              {
                return;
                int j = 0;
                break;
                ba.Q(ba.this).a(0, 10000);
                if (ba.R(ba.this))
                {
                  ba.m(ba.this).setVisibility(0);
                  ba.a(ba.this, new AnimatorSet());
                  ba.P(ba.this).playTogether(new Animator[] { ObjectAnimator.ofFloat(ba.m(ba.this), "alpha", new float[] { 0.0F, 1.0F }) });
                  ba.P(ba.this).addListener(new org.vidogram.messenger.b()
                  {
                    public void onAnimationEnd(Animator paramAnimator)
                    {
                      if ((ba.P(ba.this) != null) && (ba.P(ba.this).equals(paramAnimator)))
                        ba.a(ba.this, null);
                    }
                  });
                  ba.P(ba.this).setDuration(200L);
                  ba.P(ba.this).start();
                  return;
                }
                ba.m(ba.this).setAlpha(1.0F);
                ba.m(ba.this).setVisibility(4);
                return;
                if (ba.P(ba.this) == null)
                  continue;
                ba.P(ba.this).cancel();
                ba.a(ba.this, null);
              }
              while (ba.m(ba.this).getVisibility() == 8);
              if (ba.R(ba.this))
              {
                ba.a(ba.this, new AnimatorSet());
                ba.P(ba.this).playTogether(new Animator[] { ObjectAnimator.ofFloat(ba.m(ba.this), "alpha", new float[] { 0.0F }) });
                ba.P(ba.this).addListener(new org.vidogram.messenger.b()
                {
                  public void onAnimationEnd(Animator paramAnimator)
                  {
                    if ((ba.P(ba.this) != null) && (ba.P(ba.this).equals(paramAnimator)))
                    {
                      ba.m(ba.this).setVisibility(8);
                      ba.a(ba.this, null);
                    }
                  }
                });
                ba.P(ba.this).setDuration(200L);
                ba.P(ba.this).start();
                return;
              }
              ba.m(ba.this).setVisibility(8);
            }

            public void b(boolean paramBoolean)
            {
            }
          });
          this.u = paramContext;
          ((aw)localObject1).setAdapter(paramContext);
          this.u.a(false);
          this.v.setOnItemClickListener(new aw.b()
          {
            public void a(View paramView, int paramInt)
            {
              paramView = ba.M(ba.this).g(paramInt);
              paramInt = ba.M(ba.this).m();
              int i = ba.M(ba.this).n();
              if ((paramView instanceof g.vw))
              {
                paramView = (g.vw)paramView;
                if (paramView != null)
                  ba.h(ba.this).a(paramInt, i, "@" + paramView.g + " ");
              }
              do
                return;
              while (!(paramView instanceof String));
              ba.h(ba.this).a(paramInt, i, paramView + " ");
            }
          });
          this.v.setOnItemLongClickListener(new aw.c()
          {
            public boolean a(View paramView, int paramInt)
            {
              if (ba.this.l() == null);
              do
                return false;
              while (!(ba.M(ba.this).g(paramInt) instanceof String));
              paramView = new AlertDialog.Builder(ba.this.l());
              paramView.setTitle(org.vidogram.messenger.r.a("AppName", 2131230856));
              paramView.setMessage(org.vidogram.messenger.r.a("ClearSearch", 2131231071));
              paramView.setPositiveButton(org.vidogram.messenger.r.a("ClearButton", 2131231065).toUpperCase(), new DialogInterface.OnClickListener()
              {
                public void onClick(DialogInterface paramDialogInterface, int paramInt)
                {
                  ba.M(ba.this).e();
                }
              });
              paramView.setNegativeButton(org.vidogram.messenger.r.a("Cancel", 2131230943), null);
              ba.this.b(paramView.create());
              return true;
            }
          });
          s();
          q();
          return this.b;
          i1 = 2130838042;
          break;
          i1 = 2130837786;
          break label407;
          label1105: i1 = 8;
          break label456;
          String str = ((MediaCodecInfo)localObject2).getName();
          if ((!str.equals("OMX.google.h264.encoder")) && (!str.equals("OMX.ST.VFM.H264Enc")) && (!str.equals("OMX.Exynos.avc.enc")) && (!str.equals("OMX.MARVELL.VIDEO.HW.CODA7542ENCODER")) && (!str.equals("OMX.MARVELL.VIDEO.H264ENCODER")) && (!str.equals("OMX.k3.video.encoder.avc")) && (!str.equals("OMX.TI.DUCATI1.VIDEO.H264E")))
            break label1229;
          this.o.setVisibility(8);
        }
      }
      catch (Exception localException)
      {
        while (true)
        {
          this.o.setVisibility(8);
          org.vidogram.messenger.n.a("tmessages", localException);
          continue;
          label1229: if (MediaController.a(localException, "video/avc") != 0)
            continue;
          this.o.setVisibility(8);
        }
      }
    }
  }

  public void a(int paramInt, Object[] paramArrayOfObject)
  {
    if (paramInt == org.vidogram.messenger.y.d)
      e();
  }

  public void a(a parama)
  {
    this.H = parama;
  }

  public void a(q paramq)
  {
    this.t = paramq;
  }

  public boolean f()
  {
    if (this.z)
      return true;
    if ((this.E == null) || (!t()))
      return false;
    this.j = new MediaPlayer();
    this.j.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
    {
      public void onCompletion(MediaPlayer paramMediaPlayer)
      {
        org.vidogram.messenger.a.a(new Runnable()
        {
          public void run()
          {
            ba.g(ba.this);
          }
        });
      }
    });
    this.j.setOnPreparedListener(new MediaPlayer.OnPreparedListener()
    {
      public void onPrepared(MediaPlayer paramMediaPlayer)
      {
        ba.a(ba.this, true);
        if ((ba.c(ba.this) != null) && (ba.b(ba.this) != null))
          ba.b(ba.this).seekTo((int)(ba.c(ba.this).getLeftProgress() * ba.d(ba.this)));
      }
    });
    try
    {
      this.j.setDataSource(this.E);
      this.j.prepareAsync();
      org.vidogram.messenger.y.a().a(this, org.vidogram.messenger.y.d);
      this.z = true;
      return super.f();
    }
    catch (Exception localException)
    {
      org.vidogram.messenger.n.a("tmessages", localException);
    }
    return false;
  }

  public void g()
  {
    if (this.l != null)
      this.l.a();
    if (this.j != null);
    try
    {
      this.j.stop();
      this.j.release();
      this.j = null;
      if (this.r != null)
        this.r.c();
      org.vidogram.messenger.y.a().b(this, org.vidogram.messenger.y.d);
      super.g();
      return;
    }
    catch (Exception localException)
    {
      while (true)
        org.vidogram.messenger.n.a("tmessages", localException);
    }
  }

  public void j()
  {
    super.j();
    if (this.q.getVisibility() != 8)
      b(true);
  }

  public void q()
  {
    float f;
    if (this.j != null)
    {
      if (!this.B)
        break label117;
      f = 0.0F;
      if (this.j != null)
        this.j.setVolume(f, f);
    }
    if (this.B)
    {
      this.d.setTitle(org.vidogram.messenger.r.a("AttachGif", 2131230897));
      this.m.setImageResource(2130838197);
      if (this.n.getVisibility() == 0)
      {
        this.C = true;
        this.o.setImageResource(2130837785);
        this.o.setClickable(false);
        this.o.setAlpha(0.8F);
        this.o.setEnabled(false);
      }
    }
    label117: 
    do
    {
      return;
      f = 1.0F;
      break;
      this.d.setTitle(org.vidogram.messenger.r.a("AttachVideo", 2131230902));
      this.m.setImageResource(2130838198);
    }
    while (this.n.getVisibility() != 0);
    this.o.setClickable(true);
    this.o.setAlpha(1.0F);
    this.o.setEnabled(true);
  }

  public static abstract interface a
  {
    public abstract void a(String paramString1, long paramLong1, long paramLong2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, long paramLong3, long paramLong4, String paramString2);
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.ba
 * JD-Core Version:    0.6.0
 */