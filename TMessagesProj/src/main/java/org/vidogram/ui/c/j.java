package org.vidogram.ui.c;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.Layout.Alignment;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.MotionEvent;
import android.view.View.MeasureSpec;
import android.view.ViewParent;
import android.view.ViewStructure;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import org.vidogram.messenger.MediaController;
import org.vidogram.messenger.MediaController.e;
import org.vidogram.messenger.ac;
import org.vidogram.messenger.ae;
import org.vidogram.messenger.m;
import org.vidogram.messenger.n;
import org.vidogram.messenger.p;
import org.vidogram.messenger.q;
import org.vidogram.messenger.q.a;
import org.vidogram.messenger.r;
import org.vidogram.messenger.u;
import org.vidogram.messenger.u.a;
import org.vidogram.messenger.v;
import org.vidogram.tgnet.ConnectionsManager;
import org.vidogram.tgnet.g.aq;
import org.vidogram.tgnet.g.ar;
import org.vidogram.tgnet.g.au;
import org.vidogram.tgnet.g.aw;
import org.vidogram.tgnet.g.az;
import org.vidogram.tgnet.g.hu;
import org.vidogram.tgnet.g.i;
import org.vidogram.tgnet.g.ie;
import org.vidogram.tgnet.g.ja;
import org.vidogram.tgnet.g.ly;
import org.vidogram.tgnet.g.lz;
import org.vidogram.tgnet.g.m;
import org.vidogram.tgnet.g.ma;
import org.vidogram.tgnet.g.md;
import org.vidogram.tgnet.g.me;
import org.vidogram.tgnet.g.nt;
import org.vidogram.tgnet.g.nv;
import org.vidogram.tgnet.g.ny;
import org.vidogram.tgnet.g.nz;
import org.vidogram.tgnet.g.oa;
import org.vidogram.tgnet.g.oi;
import org.vidogram.tgnet.g.q;
import org.vidogram.tgnet.g.r;
import org.vidogram.tgnet.g.rs;
import org.vidogram.tgnet.g.vp;
import org.vidogram.tgnet.g.vw;
import org.vidogram.tgnet.g.vx;
import org.vidogram.tgnet.g.wb;
import org.vidogram.tgnet.g.x;
import org.vidogram.tgnet.g.y;
import org.vidogram.ui.Components.URLSpanBotCommand;
import org.vidogram.ui.Components.URLSpanNoUnderline;
import org.vidogram.ui.Components.as;
import org.vidogram.ui.Components.b;
import org.vidogram.ui.Components.ba;
import org.vidogram.ui.Components.ba.a;
import org.vidogram.ui.Components.bb;
import org.vidogram.ui.Components.bj;
import org.vidogram.ui.Components.z;
import org.vidogram.ui.a.l;
import org.vidogram.ui.am;

public class j extends e
  implements MediaController.e, q.a, ba.a
{
  private static TextPaint aN;
  private static TextPaint aO;
  private static TextPaint aP;
  private static TextPaint aQ;
  private static TextPaint aR;
  private static TextPaint aS;
  private static TextPaint am;
  private static TextPaint an;
  private static Paint ao;
  private static Paint ap;
  private static Paint aq;
  private static TextPaint ar;
  private static TextPaint as;
  private static Paint at;
  private static Paint au;
  private static TextPaint av;
  private static TextPaint aw;
  private static TextPaint br;
  private static TextPaint bs;
  private static TextPaint bt;
  private static TextPaint bu;
  private static TextPaint bv;
  private static Paint bw;
  private int A;
  private int B;
  private int C;
  private int D;
  private int E;
  private StaticLayout F;
  private StaticLayout G;
  private StaticLayout H;
  private StaticLayout I;
  private StaticLayout J;
  private StaticLayout K;
  private int L;
  private StaticLayout M;
  private int N;
  private int O;
  private int P;
  private StaticLayout Q;
  private int R;
  private String S;
  private int T;
  private int U;
  private int V;
  private int W;
  public boolean a;
  private boolean aA;
  private ArrayList<z> aB = new ArrayList();
  private ArrayList<z> aC = new ArrayList();
  private ArrayList<z> aD = new ArrayList();
  private boolean aE;
  private ba aF;
  private bb aG;
  private int aH;
  private int aI;
  private StaticLayout aJ;
  private String aK;
  private int aL;
  private int aM;
  private StaticLayout aT;
  private int aU;
  private StaticLayout aV;
  private int aW;
  private ArrayList<a> aX = new ArrayList();
  private HashMap<String, a> aY = new HashMap();
  private int aZ;
  private int aa;
  private int ab;
  private boolean ac;
  private boolean ad;
  private boolean ae;
  private RectF af = new RectF();
  private RectF ag = new RectF();
  private g.az ah;
  private g.az ai;
  private String aj;
  private String ak;
  private boolean al;
  private ClickableSpan ax;
  private int ay;
  private boolean az;
  private int b;
  private q bA;
  private b bB;
  private boolean bC;
  private boolean bD;
  private boolean bE;
  private StaticLayout bF;
  private StaticLayout bG;
  private q bH;
  private int bI;
  private int bJ;
  private int bK;
  private float bL;
  private int bM;
  private float bN;
  private boolean bO;
  private boolean bP;
  private g.x bQ;
  private boolean bR;
  private boolean bS;
  private int bT;
  private int bU;
  private StaticLayout bV;
  private int bW;
  private float bX;
  private float bY;
  private float bZ;
  private int ba;
  private int bb;
  private boolean bc;
  private boolean bd;
  private boolean be;
  private boolean bf = true;
  private boolean bg;
  private boolean bh;
  private boolean bi = true;
  private int bj;
  private boolean bk;
  private Drawable bl;
  private int bm;
  private u bn;
  private int bo;
  private int bp;
  private int bq;
  private int bx = 100;
  private int by;
  private int bz;
  private int c;
  private int cA;
  private int cB;
  private int cC;
  private int cD;
  private boolean ca;
  private boolean cb;
  private StaticLayout[] cc = new StaticLayout[2];
  private int cd;
  private boolean ce;
  private int cf;
  private int cg;
  private float[] ch = new float[2];
  private StaticLayout ci;
  private int cj;
  private int ck;
  private int cl;
  private String cm;
  private boolean cn = true;
  private StaticLayout co;
  private int cp;
  private String cq;
  private g.vw cr;
  private g.i cs;
  private g.x ct;
  private String cu;
  private g.vw cv;
  private g.vw cw;
  private g.i cx;
  private String cy;
  private b cz;
  private int d;
  private int e;
  private int f;
  private int g;
  private boolean h;
  private Rect i = new Rect();
  private int j;
  private int k;
  private int l;
  private boolean m;
  private as n;
  private q o;
  private b p;
  private boolean q;
  private boolean r;
  private boolean s;
  private int t;
  private g.q u;
  private boolean v;
  private boolean w;
  private boolean x;
  private int y;
  private int z;

  public j(Context paramContext)
  {
    super(paramContext);
    if (am == null)
    {
      am = new TextPaint(1);
      an = new TextPaint(1);
      an.setTypeface(org.vidogram.messenger.a.a("fonts/rmedium.ttf"));
      ao = new Paint(1);
      ap = new Paint(1);
      ap.setColor(-1776928);
      aq = new Paint(1);
      aq.setColor(-1);
      aq.setStrokeCap(Paint.Cap.ROUND);
      aq.setStyle(Paint.Style.STROKE);
      ar = new TextPaint(1);
      ar.setTypeface(org.vidogram.messenger.a.a("fonts/rmedium.ttf"));
      as = new TextPaint(1);
      at = new Paint();
      at.setColor(862104035);
      au = new Paint();
      au.setColor(1717742051);
      aN = new TextPaint(1);
      aO = new TextPaint(1);
      aO.setTypeface(org.vidogram.messenger.a.a("fonts/rmedium.ttf"));
      aP = new TextPaint(1);
      aQ = new TextPaint(1);
      aQ.setColor(-1);
      aQ.setTypeface(org.vidogram.messenger.a.a("fonts/rmedium.ttf"));
      aR = new TextPaint(1);
      aR.setTypeface(org.vidogram.messenger.a.a("fonts/rmedium.ttf"));
      aS = new TextPaint(1);
      av = new TextPaint(1);
      av.setColor(-1);
      aw = new TextPaint(1);
      aw.setColor(-1);
      aw.setTypeface(org.vidogram.messenger.a.a("fonts/rmedium.ttf"));
      br = new TextPaint(1);
      bs = new TextPaint(1);
      bs.setTypeface(org.vidogram.messenger.a.a("fonts/rmedium.ttf"));
      bt = new TextPaint(1);
      bu = new TextPaint(1);
      bu.setTypeface(org.vidogram.messenger.a.a("fonts/rmedium.ttf"));
      bv = new TextPaint(1);
      bv.linkColor = -14255946;
      bw = new Paint();
    }
    aq.setStrokeWidth(org.vidogram.messenger.a.a(2.0F));
    am.setTextSize(org.vidogram.messenger.a.a(12.0F));
    an.setTextSize(org.vidogram.messenger.a.a(15.0F));
    ar.setTextSize(org.vidogram.messenger.a.a(15.0F));
    as.setTextSize(org.vidogram.messenger.a.a(13.0F));
    aN.setTextSize(org.vidogram.messenger.a.a(12.0F));
    aO.setTextSize(org.vidogram.messenger.a.a(16.0F));
    aP.setTextSize(org.vidogram.messenger.a.a(15.0F));
    aQ.setTextSize(org.vidogram.messenger.a.a(15.0F));
    aR.setTextSize(org.vidogram.messenger.a.a(15.0F));
    aS.setTextSize(org.vidogram.messenger.a.a(13.0F));
    av.setTextSize(org.vidogram.messenger.a.a(12.0F));
    br.setTextSize(org.vidogram.messenger.a.a(12.0F));
    bs.setTextSize(org.vidogram.messenger.a.a(14.0F));
    bt.setTextSize(org.vidogram.messenger.a.a(14.0F));
    bu.setTextSize(org.vidogram.messenger.a.a(14.0F));
    bv.setTextSize(org.vidogram.messenger.a.a(14.0F));
    aw.setTextSize(org.vidogram.messenger.a.a(13.0F));
    this.bA = new q(this);
    this.bA.a(org.vidogram.messenger.a.a(21.0F));
    this.bB = new b();
    this.bH = new q(this);
    this.bb = MediaController.a().g();
    this.p = new b();
    this.o = new q(this);
    this.o.a(this);
    this.n = new as(this);
    this.aF = new ba(paramContext);
    this.aF.a(this);
    this.aG = new bb(paramContext);
    this.aG.a(this);
    this.aG.a(this);
    this.n = new as(this);
  }

  private int a(int paramInt, u paramu)
  {
    if (paramu.f == 0);
    for (this.u = paramu.a.j.r.s; this.u == null; this.u = paramu.a.j.k)
    {
      paramInt = 0;
      return paramInt;
    }
    Object localObject1;
    if (u.e(this.u))
    {
      this.t = 3;
      i1 = 0;
      if (i1 >= this.u.o.size())
        break label1330;
      localObject1 = (g.r)this.u.o.get(i1);
      if (!(localObject1 instanceof g.hu));
    }
    label642: label1317: label1320: label1325: label1330: for (int i1 = ((g.r)localObject1).d; ; i1 = 0)
    {
      this.bq = (paramInt - org.vidogram.messenger.a.a(94.0F) - (int)Math.ceil(aN.measureText("00:00")));
      c(paramu);
      int i2 = org.vidogram.messenger.a.a(174.0F);
      int i3 = this.cj;
      if (!this.w)
        this.bx = Math.min(paramInt, i1 * org.vidogram.messenger.a.a(10.0F) + (i2 + i3));
      if (paramu.k())
      {
        this.aG.a(-4463700, -8863118, -5644906);
        this.aF.a(-4463700, -8863118, -5644906);
      }
      while (true)
      {
        this.aG.a(paramu);
        return 0;
        i1 += 1;
        break;
        this.aG.a(-2169365, -9259544, -4399384);
        this.aF.a(-1774864, -9259544, -4399384);
      }
      if (u.f(this.u))
      {
        this.t = 5;
        if (paramu.k())
        {
          this.aF.a(-4463700, -8863118, -5644906);
          label317: paramInt -= org.vidogram.messenger.a.a(86.0F);
          this.aT = new StaticLayout(TextUtils.ellipsize(paramu.O().replace('\n', ' '), aO, paramInt - org.vidogram.messenger.a.a(12.0F), TextUtils.TruncateAt.END), aO, paramInt, Layout.Alignment.ALIGN_NORMAL, 1.0F, 0.0F, false);
          if (this.aT.getLineCount() > 0)
            this.aU = (-(int)Math.ceil(this.aT.getLineLeft(0)));
          this.aV = new StaticLayout(TextUtils.ellipsize(paramu.Q().replace('\n', ' '), aP, paramInt, TextUtils.TruncateAt.END), aP, paramInt, Layout.Alignment.ALIGN_NORMAL, 1.0F, 0.0F, false);
          if (this.aV.getLineCount() > 0)
            this.aW = (-(int)Math.ceil(this.aV.getLineLeft(0)));
          paramInt = 0;
          label477: if (paramInt >= this.u.o.size())
            break label1325;
          paramu = (g.r)this.u.o.get(paramInt);
          if (!(paramu instanceof g.hu))
            break label618;
        }
      }
      for (paramInt = paramu.d; ; paramInt = 0)
      {
        paramInt = (int)Math.ceil(aN.measureText(String.format("%d:%02d / %d:%02d", new Object[] { Integer.valueOf(paramInt / 60), Integer.valueOf(paramInt % 60), Integer.valueOf(paramInt / 60), Integer.valueOf(paramInt % 60) })));
        this.bq = (this.bx - org.vidogram.messenger.a.a(94.0F) - paramInt);
        return paramInt;
        this.aF.a(-1774864, -9259544, -4399384);
        break label317;
        label618: paramInt += 1;
        break label477;
        if (u.g(this.u))
        {
          this.t = 4;
          paramInt = 0;
          if (paramInt >= this.u.o.size())
            break label1320;
          paramu = (g.r)this.u.o.get(paramInt);
          if (!(paramu instanceof g.ie));
        }
        for (paramInt = paramu.d; ; paramInt = 0)
        {
          i1 = paramInt / 60;
          paramu = String.format("%d:%02d, %s", new Object[] { Integer.valueOf(i1), Integer.valueOf(paramInt - i1 * 60), org.vidogram.messenger.a.c(this.u.h) });
          this.R = (int)Math.ceil(am.measureText(paramu));
          this.Q = new StaticLayout(paramu, am, this.R, Layout.Alignment.ALIGN_NORMAL, 1.0F, 0.0F, false);
          return 0;
          paramInt += 1;
          break label642;
          boolean bool;
          if (((this.u.g != null) && (this.u.g.toLowerCase().startsWith("image/"))) || (((this.u.i instanceof g.rs)) && (!(this.u.i.c instanceof g.ja))))
          {
            bool = true;
            this.v = bool;
            if (this.v)
              break label1317;
            paramInt += org.vidogram.messenger.a.a(30.0F);
          }
          while (true)
            while (true)
            {
              this.t = 1;
              Object localObject2 = m.b(this.u);
              if (localObject2 != null)
              {
                localObject1 = localObject2;
                if (((String)localObject2).length() != 0);
              }
              else
              {
                localObject1 = r.a("AttachDocument", 2131230895);
              }
              localObject2 = an;
              Layout.Alignment localAlignment = Layout.Alignment.ALIGN_NORMAL;
              TextUtils.TruncateAt localTruncateAt = TextUtils.TruncateAt.MIDDLE;
              if (this.v);
              for (i1 = 2; ; i1 = 1)
              {
                this.K = bj.a((CharSequence)localObject1, (TextPaint)localObject2, paramInt, localAlignment, 1.0F, 0.0F, false, localTruncateAt, paramInt, i1);
                this.L = -2147483648;
                if ((this.K == null) || (this.K.getLineCount() <= 0))
                  break label1281;
                i2 = 0;
                i1 = 0;
                while (i1 < this.K.getLineCount())
                {
                  i2 = Math.max(i2, (int)Math.ceil(this.K.getLineWidth(i1)));
                  this.L = Math.max(this.L, (int)Math.ceil(-this.K.getLineLeft(i1)));
                  i1 += 1;
                }
                bool = false;
                break;
              }
              i1 = Math.min(paramInt, i2);
              localObject1 = org.vidogram.messenger.a.c(this.u.h) + " " + m.c(this.u);
              this.R = Math.min(paramInt - org.vidogram.messenger.a.a(30.0F), (int)Math.ceil(am.measureText((String)localObject1)));
              localObject1 = TextUtils.ellipsize((CharSequence)localObject1, am, this.R, TextUtils.TruncateAt.END);
              try
              {
                if (this.R < 0)
                  this.R = org.vidogram.messenger.a.a(10.0F);
                this.Q = new StaticLayout((CharSequence)localObject1, am, this.R, Layout.Alignment.ALIGN_NORMAL, 1.0F, 0.0F, false);
                paramInt = i1;
                if (!this.v)
                  break;
                this.ah = m.a(paramu.m, org.vidogram.messenger.a.f());
                this.o.e(true);
                this.o.f(true);
                this.o.a(paramu);
                if (this.ah != null)
                {
                  this.aj = "86_86_b";
                  this.o.a(null, null, null, null, this.ah.c, this.aj, 0, null, true);
                  return i1;
                  this.L = 0;
                  i1 = paramInt;
                }
              }
              catch (Exception localException)
              {
                while (true)
                  n.a("tmessages", localException);
                this.o.a((BitmapDrawable)null);
                return i1;
              }
            }
        }
      }
    }
  }

  public static StaticLayout a(CharSequence paramCharSequence, TextPaint paramTextPaint, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder(paramCharSequence);
    StaticLayout localStaticLayout = new StaticLayout(paramCharSequence, paramTextPaint, paramInt2, Layout.Alignment.ALIGN_NORMAL, 1.0F, 0.0F, false);
    int i2 = 0;
    int i3 = 0;
    int i1 = paramInt1;
    if (i2 < paramInt3)
    {
      localStaticLayout.getLineDirections(i2);
      if ((localStaticLayout.getLineLeft(i2) != 0.0F) || (localStaticLayout.isRtlCharAt(localStaticLayout.getLineStart(i2))) || (localStaticLayout.isRtlCharAt(localStaticLayout.getLineEnd(i2))))
        paramInt1 = paramInt2;
      i1 = localStaticLayout.getLineEnd(i2);
      if (i1 != paramCharSequence.length());
    }
    while (true)
    {
      return bj.a(localSpannableStringBuilder, paramTextPaint, paramInt1, Layout.Alignment.ALIGN_NORMAL, 1.0F, org.vidogram.messenger.a.a(1.0F), false, TextUtils.TruncateAt.END, paramInt1, paramInt4);
      i1 -= 1;
      int i4;
      if (localSpannableStringBuilder.charAt(i1 + i3) == ' ')
      {
        localSpannableStringBuilder.replace(i1 + i3, i1 + i3 + 1, "\n");
        i4 = i3;
      }
      while (true)
      {
        i1 = paramInt1;
        if (i2 == localStaticLayout.getLineCount() - 1)
          break label268;
        if (i2 != paramInt4 - 1)
          break label255;
        break;
        i4 = i3;
        if (localSpannableStringBuilder.charAt(i1 + i3) == '\n')
          continue;
        localSpannableStringBuilder.insert(i1 + i3, "\n");
        i4 = i3 + 1;
      }
      label255: i2 += 1;
      i3 = i4;
      break;
      label268: paramInt1 = i1;
    }
  }

  private void a(int paramInt)
  {
    if ((this.ax == null) || ((this.ay != paramInt) && (paramInt != -1)))
      return;
    b(false);
    this.ax = null;
    this.ay = -1;
    invalidate();
  }

  private void a(int paramInt1, int paramInt2, int paramInt3)
  {
    if ((this.w) || (this.x) || (paramInt1 - this.bn.v < paramInt2))
    {
      this.d += org.vidogram.messenger.a.a(14.0F);
      this.bx = (Math.max(paramInt3, this.bn.v) + org.vidogram.messenger.a.a(31.0F));
      this.bx = Math.max(this.bx, this.cj + org.vidogram.messenger.a.a(31.0F));
      return;
    }
    paramInt1 = paramInt3 - this.bn.v;
    if ((paramInt1 >= 0) && (paramInt1 <= paramInt2))
    {
      this.bx = (paramInt3 + paramInt2 - paramInt1 + org.vidogram.messenger.a.a(31.0F));
      return;
    }
    this.bx = (Math.max(paramInt3, this.bn.v + paramInt2) + org.vidogram.messenger.a.a(31.0F));
  }

  private void a(Canvas paramCanvas)
  {
    if ((this.m) && (this.bn.f == 0))
    {
      getLocalVisibleRect(this.i);
      a(this.i.top, this.i.bottom - this.i.top);
      this.m = false;
    }
    this.o.a(i());
    Object localObject1 = this.o;
    boolean bool;
    label158: label227: int i1;
    int i23;
    label336: int i7;
    if (!am.a().a(this.bn))
    {
      bool = true;
      ((q)localObject1).a(bool, false);
      this.n.b(false);
      this.n.a(-1);
      bool = false;
      if (this.bn.f != 0)
        break label2574;
      if (!this.bn.k())
        break label945;
      this.b = (this.bl.getBounds().left + org.vidogram.messenger.a.a(11.0F));
      if (!this.x)
        break label969;
      this.b += org.vidogram.messenger.a.a(11.0F);
      this.c = (org.vidogram.messenger.a.a(14.0F) + this.cA);
      if (this.F != null)
        this.c += this.F.getLineBottom(this.F.getLineCount() - 1);
      if ((this.bn.z != null) && (!this.bn.z.isEmpty()) && (this.k >= 0))
      {
        i1 = this.k;
        if ((i1 <= this.j) && (i1 < this.bn.z.size()))
          break label987;
      }
      if ((!this.w) && (!this.x))
        break label6159;
      if (!this.x)
        break label1191;
      i1 = org.vidogram.messenger.a.a(14.0F);
      int i6 = this.cA;
      i23 = this.b - org.vidogram.messenger.a.a(10.0F);
      i1 = i6 + i1;
      localObject1 = bw;
      if (!this.bn.k())
        break label1235;
      i7 = -7812741;
      label356: ((Paint)localObject1).setColor(i7);
      paramCanvas.drawRect(i23, i1 - org.vidogram.messenger.a.a(3.0F), org.vidogram.messenger.a.a(2.0F) + i23, this.y + i1 + org.vidogram.messenger.a.a(3.0F), bw);
      if (this.F == null)
        break label6193;
      localObject1 = bu;
      if (!this.bn.k())
        break label1243;
      i7 = -11162801;
      label431: ((TextPaint)localObject1).setColor(i7);
      paramCanvas.save();
      paramCanvas.translate(org.vidogram.messenger.a.a(10.0F) + i23, i1 - org.vidogram.messenger.a.a(3.0F));
      this.F.draw(paramCanvas);
      paramCanvas.restore();
    }
    label838: label969: label987: label1251: label2679: label3064: label3449: label3707: label4092: int i5;
    label945: label1235: label1243: label1890: label3188: int i17;
    label1191: label2605: label3373: label5167: label6193: for (int i14 = this.F.getLineBottom(this.F.getLineCount() - 1) + i1; ; i17 = i5)
    {
      i7 = i14;
      int i25 = i1;
      int i26;
      if (this.x)
      {
        i7 = i14;
        i25 = i1;
        if (this.bn.x != 0)
        {
          i26 = i1 + (this.bn.x + org.vidogram.messenger.a.a(4.0F));
          i7 = i14 + (this.bn.x + org.vidogram.messenger.a.a(4.0F));
        }
      }
      bu.setColor(-16777216);
      bv.setColor(-16777216);
      if (this.G != null)
      {
        i1 = i7;
        if (i7 != i26)
          i1 = i7 + org.vidogram.messenger.a.a(2.0F);
        i7 = org.vidogram.messenger.a.a(1.0F);
        paramCanvas.save();
        paramCanvas.translate(org.vidogram.messenger.a.a(10.0F) + i23 + this.D, i1 - org.vidogram.messenger.a.a(3.0F));
        this.G.draw(paramCanvas);
        paramCanvas.restore();
        i14 = i1 + this.G.getLineBottom(this.G.getLineCount() - 1);
        i1 -= i7;
      }
      while (true)
      {
        while (true)
        {
          i7 = i1;
          int i18 = i14;
          int i19;
          if (this.J != null)
          {
            i18 = i14;
            if (i14 != i26)
              i19 = i14 + org.vidogram.messenger.a.a(2.0F);
            i7 = i1;
            if (i1 == 0)
              i8 = i19 - org.vidogram.messenger.a.a(1.0F);
            paramCanvas.save();
            paramCanvas.translate(org.vidogram.messenger.a.a(10.0F) + i23 + this.E, i19 - org.vidogram.messenger.a.a(3.0F));
            this.J.draw(paramCanvas);
            paramCanvas.restore();
            i19 += this.J.getLineBottom(this.J.getLineCount() - 1);
          }
          if (this.H == null)
            break label6178;
          if (i19 == i26)
            break label6171;
          i14 = i19 + org.vidogram.messenger.a.a(2.0F);
          if (i8 != 0)
            break label6165;
          i1 = i14 - org.vidogram.messenger.a.a(1.0F);
          this.A = (i14 - org.vidogram.messenger.a.a(3.0F));
          paramCanvas.save();
          paramCanvas.translate(org.vidogram.messenger.a.a(10.0F) + i23 + this.C, this.A);
          if ((this.ax == null) || (this.f != -10))
            break label1251;
          i8 = 0;
          while (i8 < this.aC.size())
          {
            paramCanvas.drawPath((Path)this.aC.get(i8), at);
            i8 += 1;
          }
          bool = false;
          break;
          this.b = (this.bl.getBounds().left + org.vidogram.messenger.a.a(17.0F));
          break label158;
          this.c = (org.vidogram.messenger.a.a(10.0F) + this.cA);
          break label227;
          localObject1 = (u.a)this.bn.z.get(i1);
          paramCanvas.save();
          paramCanvas.translate(this.b - (int)Math.ceil(((u.a)localObject1).b), this.c + ((u.a)localObject1).c);
          if ((this.ax != null) && (i1 == this.f))
          {
            i8 = 0;
            while (i8 < this.aC.size())
            {
              paramCanvas.drawPath((Path)this.aC.get(i8), at);
              i8 += 1;
            }
          }
          if ((i1 == this.g) && (!this.aD.isEmpty()))
          {
            i8 = 0;
            while (i8 < this.aD.size())
            {
              paramCanvas.drawPath((Path)this.aD.get(i8), au);
              i8 += 1;
            }
          }
          try
          {
            ((u.a)localObject1).a.draw(paramCanvas);
            paramCanvas.restore();
            i1 += 1;
          }
          catch (Exception localException1)
          {
            while (true)
              n.a("tmessages", localException1);
          }
        }
        i1 = this.c;
        int i8 = this.bn.x;
        i14 = org.vidogram.messenger.a.a(8.0F);
        int i24 = this.b + org.vidogram.messenger.a.a(1.0F);
        i1 = i14 + (i1 + i8);
        break label336;
        int i9 = -9390872;
        break label356;
        i9 = -12940081;
        break label431;
        this.H.draw(paramCanvas);
        paramCanvas.restore();
        i14 = this.H.getLineBottom(this.H.getLineCount() - 1) + i14;
        i9 = i1;
        label1467: label1498: label2781: label3424: int i22;
        label2994: label3036: int i13;
        for (i1 = i14; ; i5 = i22)
        {
          if (this.v)
          {
            i14 = i1;
            if (i1 != i26)
              i14 = i1 + org.vidogram.messenger.a.a(2.0F);
            if (this.r)
            {
              this.o.a(this.bx + i24 - org.vidogram.messenger.a.a(81.0F), i9, this.o.p(), this.o.q());
              bool = this.o.a(paramCanvas);
              if (this.I != null)
              {
                if (!this.x)
                  break label2467;
                i1 = this.o.n();
                i9 = org.vidogram.messenger.a.a(8.5F) + i1;
                i1 = this.o.o() + org.vidogram.messenger.a.a(6.0F);
                l.u.setBounds(i9 - org.vidogram.messenger.a.a(4.0F), i1 - org.vidogram.messenger.a.a(1.5F), this.B + i9 + org.vidogram.messenger.a.a(4.0F), org.vidogram.messenger.a.a(16.5F) + i1);
                l.u.draw(paramCanvas);
                paramCanvas.save();
                paramCanvas.translate(i9, i1);
                this.I.draw(paramCanvas);
                paramCanvas.restore();
              }
            }
          }
          while (true)
          {
            this.cn = true;
            int i2;
            long l1;
            long l2;
            float f1;
            if ((this.V == -1) && (this.bn.r()))
            {
              i2 = 4;
              if (this.bn.a.G != 0)
              {
                if (!this.bn.k())
                  break label2605;
                i2 = 6;
              }
              a(l.N[i2][this.W], this.T, this.U);
              l.N[i2][this.W].setAlpha((int)(255.0F * (1.0F - this.n.a())));
              l.N[i2][this.W].draw(paramCanvas);
              if ((!this.bn.k()) && (this.bn.a.G != 0))
              {
                l1 = System.currentTimeMillis();
                l2 = ConnectionsManager.a().c() * 1000;
                f1 = (float)Math.max(0L, this.bn.a.G * 1000L - (l1 + l2)) / (this.bn.a.F * 1000.0F);
                paramCanvas.drawArc(this.af, -90.0F, -360.0F * f1, true, ap);
                if (f1 != 0.0F)
                {
                  i2 = org.vidogram.messenger.a.a(2.0F);
                  invalidate((int)this.af.left - i2, (int)this.af.top - i2, (int)this.af.right + i2 * 2, i2 * 2 + (int)this.af.bottom);
                }
                a(this.bn);
              }
            }
            if ((this.t == 2) || (this.bn.f == 8))
            {
              int i10;
              if ((this.o.k()) && (!this.x))
              {
                localObject2 = l.O[3];
                i2 = this.o.n() + this.o.p() - org.vidogram.messenger.a.a(14.0F);
                this.aa = i2;
                i10 = this.o.o() + org.vidogram.messenger.a.a(8.1F);
                this.ab = i10;
                a((Drawable)localObject2, i2, i10);
                l.O[3].draw(paramCanvas);
              }
              if ((this.bn.f != 1) && (this.t != 4))
                break label3456;
              if (this.o.k())
              {
                if (this.t == 4)
                {
                  localObject2 = l.O[3];
                  i2 = this.o.n() + this.o.p() - org.vidogram.messenger.a.a(14.0F);
                  this.aa = i2;
                  i10 = this.o.o() + org.vidogram.messenger.a.a(8.1F);
                  this.ab = i10;
                  a((Drawable)localObject2, i2, i10);
                  l.O[3].draw(paramCanvas);
                }
                if ((this.Q != null) && ((this.V == 1) || (this.V == 0) || (this.V == 3) || (this.bn.r())))
                {
                  am.setColor(-1);
                  localObject2 = l.u;
                  i2 = this.o.n();
                  i10 = org.vidogram.messenger.a.a(4.0F);
                  i14 = this.o.o();
                  int i20 = org.vidogram.messenger.a.a(4.0F);
                  i24 = this.R;
                  a((Drawable)localObject2, i10 + i2, i20 + i14, org.vidogram.messenger.a.a(8.0F) + i24, org.vidogram.messenger.a.a(16.5F));
                  l.u.draw(paramCanvas);
                  paramCanvas.save();
                  paramCanvas.translate(this.o.n() + org.vidogram.messenger.a.a(8.0F), this.o.o() + org.vidogram.messenger.a.a(5.5F));
                  this.Q.draw(paramCanvas);
                  paramCanvas.restore();
                }
              }
            }
            int i12;
            label3133: label3419: 
            do
            {
              do
              {
                if (this.M == null)
                  break label4104;
                paramCanvas.save();
                if ((this.bn.f != 1) && (this.t != 4) && (this.bn.f != 8))
                  break label4019;
                i2 = this.o.n() + org.vidogram.messenger.a.a(5.0F);
                this.N = i2;
                f1 = i2;
                i2 = this.o.o() + this.o.q() + org.vidogram.messenger.a.a(6.0F);
                this.O = i2;
                paramCanvas.translate(f1, i2);
                if (this.ax == null)
                  break label4092;
                i3 = 0;
                while (i3 < this.aC.size())
                {
                  paramCanvas.drawPath((Path)this.aC.get(i3), at);
                  i3 += 1;
                }
                this.o.a(org.vidogram.messenger.a.a(10.0F) + i24, i14, this.o.p(), this.o.q());
                if (!this.s)
                  break;
                i3 = org.vidogram.messenger.a.a(48.0F);
                this.T = (int)(this.o.n() + (this.o.p() - i3) / 2.0F);
                f1 = this.o.o();
                this.U = (int)((this.o.q() - i3) / 2.0F + f1);
                this.n.a(this.T, this.U, this.T + org.vidogram.messenger.a.a(48.0F), this.U + org.vidogram.messenger.a.a(48.0F));
                break;
                int i11 = this.o.n() + this.o.p() - org.vidogram.messenger.a.a(8.0F) - this.B;
                i3 = this.o.o() + this.o.q() - org.vidogram.messenger.a.a(19.0F);
                l.u.setBounds(i11 - org.vidogram.messenger.a.a(4.0F), i3 - org.vidogram.messenger.a.a(1.5F), this.B + i11 + org.vidogram.messenger.a.a(4.0F), org.vidogram.messenger.a.a(14.5F) + i3);
                l.u.draw(paramCanvas);
                break label1467;
                if (!this.v)
                  break label1498;
                bool = this.o.a(paramCanvas);
                this.cn = this.o.k();
                break label1498;
                i3 = 5;
                break label1544;
                if (this.t == 5)
                {
                  if (this.bn.k())
                  {
                    aO.setColor(-11162801);
                    aP.setColor(-13286860);
                    aN.setColor(-10112933);
                    localObject2 = this.n;
                    if ((i()) || (this.W != 0))
                    {
                      i3 = -2820676;
                      ((as)localObject2).a(i3);
                      this.n.a(paramCanvas);
                      paramCanvas.save();
                      paramCanvas.translate(this.aM + this.aU, org.vidogram.messenger.a.a(13.0F) + this.cA + this.z);
                      this.aT.draw(paramCanvas);
                      paramCanvas.restore();
                      paramCanvas.save();
                      if (!MediaController.a().d(this.bn))
                        break label2994;
                      paramCanvas.translate(this.aH, this.aI);
                      this.aF.a(paramCanvas);
                      paramCanvas.restore();
                      paramCanvas.save();
                      paramCanvas.translate(this.aM, org.vidogram.messenger.a.a(57.0F) + this.cA + this.z);
                      this.aJ.draw(paramCanvas);
                      paramCanvas.restore();
                      if (!this.bn.k())
                        break label3036;
                      localObject2 = l.O[1];
                      i3 = this.T;
                      i11 = this.bx;
                      if (this.bn.f != 0)
                        break label3064;
                      f1 = 58.0F;
                    }
                  }
                  while (true)
                  {
                    i3 = i11 + i3 - org.vidogram.messenger.a.a(f1);
                    this.aa = i3;
                    i12 = this.U - org.vidogram.messenger.a.a(5.0F);
                    this.ab = i12;
                    a((Drawable)localObject2, i3, i12);
                    ((Drawable)localObject2).draw(paramCanvas);
                    break;
                    i3 = -1048610;
                    break label2679;
                    aO.setColor(-11625772);
                    aP.setColor(-13683656);
                    aN.setColor(-6182221);
                    localObject2 = this.n;
                    if ((i()) || (this.W != 0));
                    for (i3 = -1902337; ; i3 = -1)
                    {
                      ((as)localObject2).a(i3);
                      break;
                    }
                    paramCanvas.translate(this.aM + this.aW, org.vidogram.messenger.a.a(35.0F) + this.cA + this.z);
                    this.aV.draw(paramCanvas);
                    break label2781;
                    localObject2 = l.O;
                    if (i());
                    for (i3 = 2; ; i3 = 0)
                    {
                      localObject2 = localObject2[i3];
                      break;
                    }
                    f1 = 48.0F;
                  }
                }
                if (this.t != 3)
                  break label1890;
                if (this.bn.k())
                {
                  localObject2 = aN;
                  if (i())
                  {
                    ((TextPaint)localObject2).setColor(-10112933);
                    localObject2 = this.n;
                    if ((!i()) && (this.W == 0))
                      break label3350;
                    i3 = -2820676;
                    ((as)localObject2).a(i3);
                    this.n.a(paramCanvas);
                    paramCanvas.save();
                    if (!this.aE)
                      break label3424;
                    paramCanvas.translate(this.aH + org.vidogram.messenger.a.a(13.0F), this.aI);
                    this.aG.a(paramCanvas);
                    paramCanvas.restore();
                    paramCanvas.save();
                    paramCanvas.translate(this.aM, org.vidogram.messenger.a.a(44.0F) + this.cA + this.z);
                    this.aJ.draw(paramCanvas);
                    paramCanvas.restore();
                    if ((this.bn.f == 0) || (this.bn.a.d.b != 0) || (!this.bn.n()))
                      break label1890;
                    localObject2 = ao;
                    if (!this.bn.k())
                      break label3449;
                  }
                }
                for (i3 = -8863118; ; i3 = -9259544)
                {
                  ((Paint)localObject2).setColor(i3);
                  paramCanvas.drawCircle(this.aM + this.aL + org.vidogram.messenger.a.a(6.0F), org.vidogram.messenger.a.a(51.0F) + this.cA + this.z, org.vidogram.messenger.a.a(3.0F), ao);
                  break;
                  break label3101;
                  i3 = -1048610;
                  break label3133;
                  localObject2 = aN;
                  if (i())
                  {
                    i3 = -7752511;
                    ((TextPaint)localObject2).setColor(i3);
                    localObject2 = this.n;
                    if ((!i()) && (this.W == 0))
                      break label3419;
                  }
                  for (i3 = -1902337; ; i3 = -1)
                  {
                    ((as)localObject2).a(i3);
                    break;
                    i3 = -6182221;
                    break label3373;
                  }
                  paramCanvas.translate(this.aH, this.aI);
                  this.aF.a(paramCanvas);
                  break label3188;
                }
                if (this.bn.f != 4)
                  break label3707;
              }
              while (this.K == null);
              if (this.bn.k())
              {
                ar.setColor(-11162801);
                localObject2 = as;
                if (i());
                while (true)
                {
                  ((TextPaint)localObject2).setColor(-10112933);
                  paramCanvas.save();
                  paramCanvas.translate(this.L + this.o.n() + this.o.p() + org.vidogram.messenger.a.a(10.0F), this.o.o() + org.vidogram.messenger.a.a(8.0F));
                  this.K.draw(paramCanvas);
                  paramCanvas.restore();
                  if (this.Q == null)
                    break;
                  paramCanvas.save();
                  paramCanvas.translate(this.o.n() + this.o.p() + org.vidogram.messenger.a.a(10.0F), this.o.o() + this.K.getLineBottom(this.K.getLineCount() - 1) + org.vidogram.messenger.a.a(13.0F));
                  this.Q.draw(paramCanvas);
                  paramCanvas.restore();
                  break;
                }
              }
              ar.setColor(-11625772);
              localObject2 = as;
              if (i());
              for (i3 = -7752511; ; i3 = -6182221)
              {
                ((TextPaint)localObject2).setColor(i3);
                break;
              }
            }
            while (this.bn.f != 12);
            Object localObject2 = aR;
            if (this.bn.k())
            {
              i3 = -11162801;
              ((TextPaint)localObject2).setColor(i3);
              localObject2 = aS;
              if (!this.bn.k())
                break label3984;
            }
            for (int i3 = -13286860; ; i3 = -13683656)
            {
              ((TextPaint)localObject2).setColor(i3);
              if (this.G != null)
              {
                paramCanvas.save();
                paramCanvas.translate(this.o.n() + this.o.p() + org.vidogram.messenger.a.a(9.0F), org.vidogram.messenger.a.a(16.0F) + this.cA);
                this.G.draw(paramCanvas);
                paramCanvas.restore();
              }
              if (this.K != null)
              {
                paramCanvas.save();
                paramCanvas.translate(this.o.n() + this.o.p() + org.vidogram.messenger.a.a(9.0F), org.vidogram.messenger.a.a(39.0F) + this.cA);
                this.K.draw(paramCanvas);
                paramCanvas.restore();
              }
              if (!this.bn.k())
                break label3991;
              localObject2 = l.O[1];
              i3 = this.o.n() + this.bx - org.vidogram.messenger.a.a(48.0F);
              this.aa = i3;
              i12 = this.o.o() - org.vidogram.messenger.a.a(5.0F);
              this.ab = i12;
              a((Drawable)localObject2, i3, i12);
              ((Drawable)localObject2).draw(paramCanvas);
              break;
              i3 = -11625772;
              break label3738;
            }
            localObject2 = l.O;
            if (i());
            for (i3 = 2; ; i3 = 0)
            {
              localObject2 = localObject2[i3];
              break;
            }
            label4019: i3 = this.bm;
            if (this.bn.k())
              f1 = 11.0F;
            while (true)
            {
              i3 = org.vidogram.messenger.a.a(f1) + i3;
              this.N = i3;
              f1 = i3;
              i3 = this.d - this.P - org.vidogram.messenger.a.a(10.0F);
              this.O = i3;
              paramCanvas.translate(f1, i3);
              break;
              f1 = 17.0F;
            }
            try
            {
              this.M.draw(paramCanvas);
              paramCanvas.restore();
              if (this.t == 1)
              {
                if (!this.bn.k())
                  break label4979;
                an.setColor(-11162801);
                localObject2 = am;
                if (!i())
                  break label4969;
                ((TextPaint)localObject2).setColor(-10112933);
                localObject2 = ao;
                if (!i())
                  break label4972;
                i4 = -3806041;
                ((Paint)localObject2).setColor(i4);
                localObject2 = l.O[1];
                if (!this.v)
                  break label5293;
                if (this.bn.f != 0)
                  break label5074;
                i4 = this.o.n() + this.bx - org.vidogram.messenger.a.a(56.0F);
                this.aa = i4;
                i12 = this.o.o() + org.vidogram.messenger.a.a(1.0F);
                this.ab = i12;
                a((Drawable)localObject2, i4, i12);
                i12 = this.o.n() + this.o.p() + org.vidogram.messenger.a.a(10.0F);
                i14 = this.o.o() + org.vidogram.messenger.a.a(8.0F);
                i4 = this.o.o();
                int i21 = this.K.getLineBottom(this.K.getLineCount() - 1);
                i22 = org.vidogram.messenger.a.a(13.0F) + (i4 + i21);
                if ((this.V >= 0) && (this.V < 4))
                {
                  if (bool)
                    break label5172;
                  i4 = this.V;
                  if (this.V != 0)
                    break label5137;
                  if (!this.bn.k())
                    break label5131;
                  i4 = 7;
                  localObject4 = this.n;
                  localObject5 = l.N[i4];
                  if ((!i()) && (this.W == 0))
                    break label5167;
                  i4 = 1;
                  ((as)localObject4).a(localObject5[i4]);
                }
                if (bool)
                  break label5251;
                this.ag.set(this.o.n(), this.o.o(), this.o.n() + this.o.p(), this.o.o() + this.o.q());
                paramCanvas.drawRoundRect(this.ag, org.vidogram.messenger.a.a(3.0F), org.vidogram.messenger.a.a(3.0F), ao);
                if (!this.bn.k())
                  break label5203;
                localObject4 = this.n;
                if (!i())
                  break label5196;
                i4 = -3806041;
                ((as)localObject4).a(i4);
                i4 = i22;
                i22 = i14;
                i14 = i12;
                i12 = i22;
                ((Drawable)localObject2).draw(paramCanvas);
              }
            }
            catch (Exception localPorterDuffColorFilter)
            {
              try
              {
                if (this.K != null)
                {
                  paramCanvas.save();
                  paramCanvas.translate(this.L + i14, i12);
                  this.K.draw(paramCanvas);
                  paramCanvas.restore();
                }
              }
              catch (Exception localPorterDuffColorFilter)
              {
                try
                {
                  while (true)
                  {
                    int i4;
                    Object localObject5;
                    if (this.Q != null)
                    {
                      paramCanvas.save();
                      paramCanvas.translate(i14, i4);
                      this.Q.draw(paramCanvas);
                      paramCanvas.restore();
                    }
                    if ((this.s) && (this.o.k()))
                      this.n.a(paramCanvas);
                    if (this.aX.isEmpty())
                      break label6158;
                    if (!this.bn.k())
                      break;
                    i5 = getMeasuredWidth() - this.aZ - org.vidogram.messenger.a.a(10.0F);
                    i13 = 0;
                    while (true)
                    {
                      if (i13 >= this.aX.size())
                        break label6158;
                      localObject4 = (a)this.aX.get(i13);
                      i22 = a.b((a)localObject4) + this.bz - org.vidogram.messenger.a.a(2.0F);
                      localObject5 = l.t;
                      if (i13 != this.ba)
                        break;
                      localObject2 = l.Q;
                      ((Drawable)localObject5).setColorFilter((ColorFilter)localObject2);
                      l.t.setBounds(a.c((a)localObject4) + i5, i22, a.c((a)localObject4) + i5 + a.d((a)localObject4), a.e((a)localObject4) + i22);
                      l.t.draw(paramCanvas);
                      paramCanvas.save();
                      paramCanvas.translate(a.c((a)localObject4) + i5 + org.vidogram.messenger.a.a(5.0F), (org.vidogram.messenger.a.a(44.0F) - a.i((a)localObject4).getLineBottom(a.i((a)localObject4).getLineCount() - 1)) / 2 + i22);
                      a.i((a)localObject4).draw(paramCanvas);
                      paramCanvas.restore();
                      if (!(a.a((a)localObject4) instanceof g.me))
                        break label5589;
                      i15 = a.c((a)localObject4);
                      i24 = a.d((a)localObject4);
                      i27 = org.vidogram.messenger.a.a(3.0F);
                      i28 = l.w.getIntrinsicWidth();
                      a(l.w, i15 + i24 - i27 - i28 + i5, i22 + org.vidogram.messenger.a.a(3.0F));
                      l.w.draw(paramCanvas);
                      i13 += 1;
                    }
                    localException2 = localException2;
                    n.a("tmessages", localException2);
                    continue;
                    label4969: continue;
                    label4972: i5 = -2427453;
                    continue;
                    label4979: an.setColor(-11625772);
                    Object localObject3 = am;
                    if (i())
                    {
                      i5 = -7752511;
                      ((TextPaint)localObject3).setColor(i5);
                      localObject3 = ao;
                      if (!i())
                        break label5062;
                      i5 = -3413258;
                      ((Paint)localObject3).setColor(i5);
                      localObject3 = l.O;
                      if (!i())
                        break label5069;
                    }
                    label5062: label5069: for (i5 = 2; ; i5 = 0)
                    {
                      localObject3 = localObject3[i5];
                      break;
                      i5 = -6182221;
                      break label5004;
                      i5 = -1314571;
                      break label5026;
                    }
                    label5074: i5 = this.o.n() + this.bx - org.vidogram.messenger.a.a(40.0F);
                    this.aa = i5;
                    i13 = this.o.o() + org.vidogram.messenger.a.a(1.0F);
                    this.ab = i13;
                    a((Drawable)localObject3, i5, i13);
                    continue;
                    i5 = 10;
                    continue;
                    if (this.V != 1)
                      continue;
                    if (this.bn.k())
                    {
                      i5 = 8;
                      continue;
                    }
                    i5 = 11;
                    continue;
                    i5 = 0;
                    continue;
                    label5172: this.n.a(l.N[this.V][this.W]);
                    continue;
                    label5196: i5 = -2427453;
                    continue;
                    label5203: localObject4 = this.n;
                    if (i());
                    for (i5 = -3413258; ; i5 = -1314571)
                    {
                      ((as)localObject4).a(i5);
                      i5 = i22;
                      i22 = i13;
                      i13 = i15;
                      i15 = i22;
                      break;
                    }
                    if (this.V == -1)
                      this.n.b(true);
                    this.n.a(-1);
                    i5 = i22;
                    i22 = i13;
                    i13 = i15;
                    int i15 = i22;
                    continue;
                    i5 = this.T;
                    i13 = this.bx;
                    if (this.bn.f == 0)
                    {
                      f1 = 58.0F;
                      label5318: i5 = i13 + i5 - org.vidogram.messenger.a.a(f1);
                      this.aa = i5;
                      i13 = this.U - org.vidogram.messenger.a.a(5.0F);
                      this.ab = i13;
                      a((Drawable)localObject3, i5, i13);
                      i5 = this.T + org.vidogram.messenger.a.a(53.0F);
                      i13 = this.U + org.vidogram.messenger.a.a(4.0F);
                      i16 = this.U;
                      i16 = org.vidogram.messenger.a.a(27.0F) + i16;
                      if (!this.bn.k())
                        break label5473;
                      localObject4 = this.n;
                      if ((!i()) && (this.W == 0))
                        break label5465;
                    }
                    label5465: for (i22 = -2820676; ; i22 = -1048610)
                    {
                      ((as)localObject4).a(i22);
                      i22 = i5;
                      i5 = i16;
                      i16 = i22;
                      break;
                      f1 = 48.0F;
                      break label5318;
                    }
                    label5473: localObject4 = this.n;
                    if ((i()) || (this.W != 0));
                    for (i22 = -1902337; ; i22 = -1)
                    {
                      ((as)localObject4).a(i22);
                      i22 = i5;
                      i5 = i16;
                      i16 = i22;
                      break;
                    }
                    localException3 = localException3;
                    n.a("tmessages", localException3);
                  }
                }
                catch (Exception localPorterDuffColorFilter)
                {
                  Object localObject4;
                  label5589: 
                  do
                  {
                    do
                      while (true)
                      {
                        n.a("tmessages", localException4);
                        continue;
                        i5 = this.bm;
                        if (this.be)
                          f1 = 1.0F;
                        while (true)
                        {
                          i5 = org.vidogram.messenger.a.a(f1) + i5;
                          break;
                          f1 = 7.0F;
                        }
                        PorterDuffColorFilter localPorterDuffColorFilter = l.P;
                        continue;
                        if (!(a.a((a)localObject4) instanceof g.md))
                          break;
                        int i16 = a.c((a)localObject4);
                        i24 = a.d((a)localObject4);
                        int i27 = org.vidogram.messenger.a.a(3.0F);
                        int i28 = l.x.getIntrinsicWidth();
                        a(l.x, i16 + i24 - i27 - i28 + i5, i22 + org.vidogram.messenger.a.a(3.0F));
                        l.x.draw(paramCanvas);
                      }
                    while ((!(a.a((a)localObject4) instanceof g.ly)) && (!(a.a((a)localObject4) instanceof g.ma)) && (!(a.a((a)localObject4) instanceof g.lz)));
                    if ((((a.a((a)localObject4) instanceof g.ly)) || ((a.a((a)localObject4) instanceof g.lz))) && ((!ac.a().c(this.bn, a.a((a)localObject4))) && ((!(a.a((a)localObject4) instanceof g.ma)) || (!ac.a().b(this.bn, a.a((a)localObject4))))))
                      break;
                    i17 = 1;
                  }
                  while ((i17 == 0) && ((i17 != 0) || (a.f((a)localObject4) == 0.0F)));
                  aq.setAlpha(Math.min(255, (int)(a.f((a)localObject4) * 255.0F)));
                  i24 = a.c((a)localObject4) + a.d((a)localObject4) - org.vidogram.messenger.a.a(12.0F) + i5;
                  this.ag.set(i24, org.vidogram.messenger.a.a(4.0F) + i22, i24 + org.vidogram.messenger.a.a(8.0F), i22 + org.vidogram.messenger.a.a(12.0F));
                  paramCanvas.drawArc(this.ag, a.g((a)localObject4), 220.0F, false, aq);
                  invalidate((int)this.ag.left - org.vidogram.messenger.a.a(2.0F), (int)this.ag.top - org.vidogram.messenger.a.a(2.0F), (int)this.ag.right + org.vidogram.messenger.a.a(2.0F), (int)this.ag.bottom + org.vidogram.messenger.a.a(2.0F));
                  l1 = System.currentTimeMillis();
                  if (Math.abs(a.h((a)localObject4) - System.currentTimeMillis()) < 1000L)
                  {
                    l2 = l1 - a.h((a)localObject4);
                    a.a((a)localObject4, (int)((float)(360L * l2) / 2000.0F + a.g((a)localObject4)));
                    a.a((a)localObject4, a.g((a)localObject4) - a.g((a)localObject4) / 360 * 360);
                    if (i17 == 0)
                      break label6109;
                    if (a.f((a)localObject4) < 1.0F)
                    {
                      f1 = a.f((a)localObject4);
                      a.a((a)localObject4, (float)l2 / 200.0F + f1);
                      if (a.f((a)localObject4) > 1.0F)
                        a.a((a)localObject4, 1.0F);
                    }
                  }
                  while (true)
                  {
                    a.a((a)localObject4, l1);
                    break;
                    i17 = 0;
                    break label5774;
                    label6109: if (a.f((a)localObject4) <= 0.0F)
                      continue;
                    a.a((a)localObject4, a.f((a)localObject4) - (float)l2 / 200.0F);
                    if (a.f((a)localObject4) >= 0.0F)
                      continue;
                    a.a((a)localObject4, 0.0F);
                  }
                }
              }
            }
            return;
            bool = false;
          }
          i5 = i13;
          break label838;
          i17 = i22;
          break;
        }
        i5 = 0;
        i17 = i13;
      }
    }
  }

  private void a(u paramu)
  {
    if ((paramu == null) || (paramu.j()));
    do
    {
      return;
      paramu = paramu.y();
    }
    while (paramu == null);
    this.R = (int)Math.ceil(am.measureText(paramu));
    this.Q = new StaticLayout(TextUtils.ellipsize(paramu, am, this.R, TextUtils.TruncateAt.END), am, this.R, Layout.Alignment.ALIGN_NORMAL, 1.0F, 0.0F, false);
    invalidate();
  }

  private boolean a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    if (paramFloat1 <= paramFloat3)
      if (paramFloat2 < paramFloat3);
    do
    {
      return true;
      return false;
    }
    while (paramFloat1 <= paramFloat4);
    return false;
  }

  private boolean a(MotionEvent paramMotionEvent)
  {
    if ((this.bn.f != 0) || (this.bn.z == null) || (this.bn.z.isEmpty()) || (!(this.bn.b instanceof Spannable)));
    do
      return false;
    while ((paramMotionEvent.getAction() != 0) && ((paramMotionEvent.getAction() != 1) || (this.ay != 1)));
    int i4 = (int)paramMotionEvent.getX();
    int i1 = (int)paramMotionEvent.getY();
    int i5;
    int i3;
    if ((i4 >= this.b) && (i1 >= this.c) && (i4 <= this.b + this.bn.w) && (i1 <= this.c + this.bn.x))
    {
      i5 = i1 - this.c;
      i1 = 0;
      i3 = 0;
      if ((i1 < this.bn.z.size()) && (((u.a)this.bn.z.get(i1)).c <= i5));
    }
    while (true)
    {
      Object localObject2;
      try
      {
        while (true)
        {
          Object localObject1 = (u.a)this.bn.z.get(i3);
          i1 = i4 - (this.b - (int)Math.ceil(((u.a)localObject1).b));
          i4 = (int)(i5 - ((u.a)localObject1).c);
          i4 = ((u.a)localObject1).a.getLineForVertical(i4);
          i5 = ((u.a)localObject1).a.getOffsetForHorizontal(i4, i1) + ((u.a)localObject1).d;
          float f1 = ((u.a)localObject1).a.getLineLeft(i4);
          if ((f1 > i1) || (((u.a)localObject1).a.getLineWidth(i4) + f1 < i1))
            break;
          Spannable localSpannable = (Spannable)this.bn.b;
          localObject2 = (ClickableSpan[])localSpannable.getSpans(i5, i5, ClickableSpan.class);
          if (localObject2.length == 0)
            break label912;
          if ((localObject2.length == 0) || (!(localObject2[0] instanceof URLSpanBotCommand)) || (URLSpanBotCommand.a))
            break label907;
          break label912;
          if (i1 != 0)
            break;
          if (paramMotionEvent.getAction() == 0)
          {
            this.ax = localObject2[0];
            this.f = i3;
            this.ay = 1;
            b(false);
            try
            {
              paramMotionEvent = c(false);
              i4 = localSpannable.getSpanStart(this.ax) - ((u.a)localObject1).d;
              i5 = localSpannable.getSpanEnd(this.ax);
              i2 = ((u.a)localObject1).a.getText().length();
              paramMotionEvent.a(((u.a)localObject1).a, i4, 0.0F);
              ((u.a)localObject1).a.getSelectionPath(i4, i5 - ((u.a)localObject1).d, paramMotionEvent);
              if (i5 < ((u.a)localObject1).d + i2)
                break label917;
              i2 = i3 + 1;
              label498: if (i2 >= this.bn.z.size())
                break label917;
              paramMotionEvent = (u.a)this.bn.z.get(i2);
              int i6 = paramMotionEvent.a.getText().length();
              localObject2 = (ClickableSpan[])localSpannable.getSpans(paramMotionEvent.d, paramMotionEvent.d, ClickableSpan.class);
              if ((localObject2 == null) || (localObject2.length == 0))
                break label917;
              if (localObject2[0] != this.ax)
                break label917;
              while (true)
              {
                if (i2 >= 0)
                {
                  paramMotionEvent = (u.a)this.bn.z.get(i2);
                  i3 = paramMotionEvent.a.getText().length();
                  localObject1 = (ClickableSpan[])localSpannable.getSpans(paramMotionEvent.d + i3 - 1, i3 + paramMotionEvent.d - 1, ClickableSpan.class);
                  if ((localObject1 != null) && (localObject1.length != 0))
                  {
                    localObject1 = localObject1[0];
                    localObject2 = this.ax;
                    if (localObject1 == localObject2)
                      break label762;
                  }
                }
                label762: 
                do
                {
                  invalidate();
                  return true;
                  i3 = i2;
                  i2 += 1;
                  break;
                  localObject2 = c(false);
                  ((z)localObject2).a(paramMotionEvent.a, 0, paramMotionEvent.e);
                  paramMotionEvent.a.getSelectionPath(0, i5 - paramMotionEvent.d, (Path)localObject2);
                  if (i5 < ((u.a)localObject1).d + i6 - 1)
                    break label917;
                  i2 += 1;
                  break label498;
                  localObject1 = c(false);
                  i3 = localSpannable.getSpanStart(this.ax) - paramMotionEvent.d;
                  ((z)localObject1).a(paramMotionEvent.a, i3, -paramMotionEvent.e);
                  paramMotionEvent.a.getSelectionPath(i3, localSpannable.getSpanEnd(this.ax) - paramMotionEvent.d, (Path)localObject1);
                }
                while (i3 >= 0);
                i2 -= 1;
              }
            }
            catch (Exception paramMotionEvent)
            {
              while (true)
                n.a("tmessages", paramMotionEvent);
            }
          }
        }
      }
      catch (Exception paramMotionEvent)
      {
        n.a("tmessages", paramMotionEvent);
        return false;
      }
      if (localObject2[0] != this.ax)
        break;
      this.cz.a(this.bn, this.ax, false);
      a(1);
      return true;
      a(1);
      return false;
      label907: int i2 = 0;
      continue;
      label912: i2 = 1;
      continue;
      label917: if (i4 >= 0)
        continue;
      i2 = i3 - 1;
    }
  }

  private void b(boolean paramBoolean)
  {
    if (paramBoolean)
      if (!this.aD.isEmpty());
    do
    {
      return;
      this.aB.addAll(this.aD);
      this.aD.clear();
      return;
    }
    while (this.aC.isEmpty());
    this.aB.addAll(this.aC);
    this.aC.clear();
  }

  private boolean b(MotionEvent paramMotionEvent)
  {
    if ((!(this.bn.d instanceof Spannable)) || (this.M == null))
      return false;
    int i1;
    int i3;
    if ((paramMotionEvent.getAction() == 0) || (((this.az) || (this.ax != null)) && (paramMotionEvent.getAction() == 1)))
    {
      i1 = (int)paramMotionEvent.getX();
      i3 = (int)paramMotionEvent.getY();
      if ((i1 < this.N) || (i1 > this.N + this.bx) || (i3 < this.O) || (i3 > this.O + this.P))
        break label380;
      if (paramMotionEvent.getAction() != 0)
        break label347;
    }
    while (true)
    {
      try
      {
        i1 -= this.N;
        int i4 = this.O;
        i3 = this.M.getLineForVertical(i3 - i4);
        i4 = this.M.getOffsetForHorizontal(i3, i1);
        float f1 = this.M.getLineLeft(i3);
        if ((f1 <= i1) && (this.M.getLineWidth(i3) + f1 >= i1))
        {
          paramMotionEvent = (Spannable)this.bn.d;
          Object localObject = (ClickableSpan[])paramMotionEvent.getSpans(i4, i4, ClickableSpan.class);
          if (localObject.length == 0)
            break label393;
          if ((localObject.length == 0) || (!(localObject[0] instanceof URLSpanBotCommand)) || (URLSpanBotCommand.a))
            break label388;
          break label393;
          if (i1 == 0)
          {
            this.ax = localObject[0];
            this.ay = 3;
            b(false);
            try
            {
              localObject = c(false);
              i2 = paramMotionEvent.getSpanStart(this.ax);
              ((z)localObject).a(this.M, i2, 0.0F);
              this.M.getSelectionPath(i2, paramMotionEvent.getSpanEnd(this.ax), (Path)localObject);
              invalidate();
              return true;
            }
            catch (Exception paramMotionEvent)
            {
              n.a("tmessages", paramMotionEvent);
              continue;
            }
          }
        }
      }
      catch (Exception paramMotionEvent)
      {
        n.a("tmessages", paramMotionEvent);
      }
      while (true)
      {
        return false;
        label347: if (this.ay != 3)
          continue;
        this.cz.a(this.bn, this.ax, false);
        a(3);
        return true;
        label380: a(3);
      }
      label388: int i2 = 0;
      continue;
      label393: i2 = 1;
    }
  }

  private boolean b(u paramu)
  {
    int i2 = 1;
    int i1;
    if ((paramu.f == 0) || (paramu.f == 14))
      i1 = 0;
    double d1;
    double d2;
    do
    {
      do
      {
        return i1;
        if (paramu.f != 4)
          break;
        i1 = i2;
      }
      while (this.S == null);
      d1 = paramu.a.j.e.c;
      d2 = paramu.a.j.e.b;
      i1 = i2;
    }
    while (!String.format(Locale.US, "https://maps.googleapis.com/maps/api/staticmap?center=%f,%f&zoom=15&size=100x100&maptype=roadmap&scale=%d&markers=color:red|size:mid|%f,%f&sensor=false", new Object[] { Double.valueOf(d1), Double.valueOf(d2), Integer.valueOf(Math.min(2, (int)Math.ceil(org.vidogram.messenger.a.b))), Double.valueOf(d1), Double.valueOf(d2) }).equals(this.S));
    do
    {
      return false;
      i1 = i2;
      if (this.ah == null)
        break;
      i1 = i2;
      if ((this.ah.c instanceof g.ja))
        break;
    }
    while ((this.bn == null) || (!this.ae) || (!m.b(this.bn.a).exists()));
    return true;
  }

  private z c(boolean paramBoolean)
  {
    z localz;
    if (!this.aB.isEmpty())
    {
      localz = (z)this.aB.get(0);
      this.aB.remove(0);
    }
    while (paramBoolean)
    {
      this.aD.add(localz);
      return localz;
      localz = new z();
    }
    this.aC.add(localz);
    return localz;
  }

  private void c(u paramu)
  {
    int i1;
    g.vw localvw;
    int i4;
    if ((!paramu.k()) && (paramu.a.c > 0) && (paramu.a.v))
    {
      i1 = 1;
      localvw = v.a().a(Integer.valueOf(paramu.a.c));
      int i3 = i1;
      if (i1 != 0)
      {
        i3 = i1;
        if (localvw == null)
          i4 = 0;
      }
      if (!this.bn.l())
        break label521;
    }
    label516: label521: for (Object localObject = v.a().a(Integer.valueOf(paramu.a.c)); ; localObject = null)
    {
      if ((paramu.a.x == 0) && (paramu.a.q == null) && ((localObject == null) || (!((g.vw)localObject).r)) && ((paramu.a.k & 0x8000) != 0))
      {
        localObject = r.a("EditedMessage", 2131231155) + " " + r.a().c.a(paramu.a.e * 1000L);
        label191: if (i4 == 0)
          break label507;
        this.cm = (", " + (String)localObject);
        label220: i1 = (int)Math.ceil(br.measureText(this.cm));
        this.cj = i1;
        this.ck = i1;
        if ((paramu.a.k & 0x400) != 0)
        {
          this.cq = String.format("%s", new Object[] { r.a(Math.max(1, paramu.a.s), null) });
          this.cp = (int)Math.ceil(br.measureText(this.cq));
          this.cj += this.cp + l.D[0].getIntrinsicWidth() + org.vidogram.messenger.a.a(10.0F);
        }
        if (i4 != 0)
        {
          if (this.bq == 0)
            this.bq = org.vidogram.messenger.a.a(1000.0F);
          paramu = org.vidogram.messenger.f.a(localvw.e, localvw.f).replace('\n', ' ');
          i1 = this.bq - this.cj;
          i4 = (int)Math.ceil(br.measureText(paramu, 0, paramu.length()));
          if (i4 <= i1)
            break label516;
          paramu = TextUtils.ellipsize(paramu, br, i1, TextUtils.TruncateAt.END);
        }
      }
      while (true)
      {
        this.cm = (paramu + this.cm);
        this.ck += i1;
        this.cj = (i1 + this.cj);
        return;
        int i2 = 0;
        break;
        localObject = r.a().c.a(paramu.a.e * 1000L);
        break label191;
        label507: this.cm = ((String)localObject);
        break label220;
        i2 = i4;
      }
    }
  }

  private boolean c(MotionEvent paramMotionEvent)
  {
    if (!this.x);
    int i1;
    int i4;
    do
    {
      return false;
      i1 = (int)paramMotionEvent.getX();
      i4 = (int)paramMotionEvent.getY();
      if (paramMotionEvent.getAction() != 0)
        break;
      if ((!this.v) || (!this.o.a(i1, i4)))
        continue;
      this.aA = true;
      return true;
    }
    while ((this.H == null) || (i4 < this.A));
    while (true)
    {
      try
      {
        int i2;
        i1 -= this.b + org.vidogram.messenger.a.a(10.0F) + this.C;
        int i6 = this.A;
        int i5 = this.H.getLineForVertical(i4 - i6);
        int i7 = this.H.getOffsetForHorizontal(i5, i2);
        float f1 = this.H.getLineLeft(i5);
        if ((f1 > i2) || (this.H.getLineWidth(i5) + f1 < i2))
          break;
        paramMotionEvent = (Spannable)this.bn.c;
        Object localObject = (ClickableSpan[])paramMotionEvent.getSpans(i7, i7, ClickableSpan.class);
        if (localObject.length == 0)
          break label488;
        if ((localObject.length == 0) || (!(localObject[0] instanceof URLSpanBotCommand)) || (URLSpanBotCommand.a))
          break label483;
        break label488;
        if (i2 != 0)
          break;
        this.ax = localObject[0];
        this.f = -10;
        this.ay = 2;
        b(false);
        try
        {
          localObject = c(false);
          i3 = paramMotionEvent.getSpanStart(this.ax);
          ((z)localObject).a(this.H, i3, 0.0F);
          this.H.getSelectionPath(i3, paramMotionEvent.getSpanEnd(this.ax), (Path)localObject);
          invalidate();
          return true;
        }
        catch (Exception paramMotionEvent)
        {
          n.a("tmessages", paramMotionEvent);
          continue;
        }
      }
      catch (Exception paramMotionEvent)
      {
        n.a("tmessages", paramMotionEvent);
        return false;
      }
      if (paramMotionEvent.getAction() != 1)
        break;
      if ((this.ay == 2) || (this.aA))
      {
        if (this.ax != null)
        {
          if ((this.ax instanceof URLSpan))
            org.vidogram.messenger.b.a.a(getContext(), ((URLSpan)this.ax).getURL());
          while (true)
          {
            a(2);
            return false;
            this.ax.onClick(this);
          }
        }
        this.aA = false;
        i3 = 0;
        while (true)
        {
          if (i3 < this.aX.size())
          {
            paramMotionEvent = (a)this.aX.get(i3);
            if ((a.a(paramMotionEvent) instanceof g.lz))
            {
              playSoundEffect(0);
              this.cz.a(this, a.a(paramMotionEvent));
              invalidate();
            }
          }
          else
          {
            a(2);
            return true;
          }
          i3 += 1;
        }
      }
      a(2);
      return false;
      label483: int i3 = 0;
      continue;
      label488: i3 = 1;
    }
  }

  private void d(boolean paramBoolean)
  {
    if (this.V == 0)
      if ((this.t == 3) || (this.t == 5))
        if (this.cz.a(this.bn))
        {
          this.V = 1;
          this.n.a(getDrawableForCurrentState(), false, false);
          invalidate();
        }
    while (true)
    {
      return;
      this.al = false;
      this.n.a(0.0F, false);
      if (this.bn.f == 1)
      {
        localq = this.o;
        localObject = this.ah.c;
        str = this.aj;
        if (this.ai != null)
        {
          localx = this.ai.c;
          localq.a((org.vidogram.tgnet.f)localObject, str, localx, this.aj, this.ah.f, null, false);
        }
      }
      while (true)
      {
        this.V = 1;
        this.n.a(getDrawableForCurrentState(), true, paramBoolean);
        invalidate();
        return;
        localx = null;
        break;
        if (this.bn.f == 8)
        {
          this.bn.k = 2.0F;
          localq = this.o;
          localObject = this.bn.a.j.k;
          if (this.ah != null);
          for (localx = this.ah.c; ; localx = null)
          {
            localq.a((org.vidogram.tgnet.f)localObject, null, localx, this.aj, this.bn.a.j.k.h, null, false);
            break;
          }
        }
        if (this.bn.f == 9)
        {
          m.a().a(this.bn.a.j.k, false, false);
          continue;
        }
        if (this.t == 4)
        {
          m.a().a(this.u, true, false);
          continue;
        }
        if ((this.bn.f != 0) || (this.t == 0))
          break label451;
        if (this.t == 2)
        {
          this.o.a(this.bn.a.j.r.s, null, this.ah.c, this.aj, this.bn.a.j.r.s.h, null, false);
          this.bn.k = 2.0F;
          continue;
        }
        if (this.t != 1)
          continue;
        m.a().a(this.bn.a.j.r.s, false, false);
      }
      label451: q localq = this.o;
      Object localObject = this.ah.c;
      String str = this.aj;
      if (this.ai != null);
      for (g.x localx = this.ai.c; ; localx = null)
      {
        localq.a((org.vidogram.tgnet.f)localObject, str, localx, this.ak, 0, null, false);
        break;
      }
      if (this.V == 1)
      {
        if ((this.t == 3) || (this.t == 5))
        {
          if (!MediaController.a().b(this.bn))
            continue;
          this.V = 0;
          this.n.a(getDrawableForCurrentState(), false, false);
          invalidate();
          return;
        }
        if ((this.bn.j()) && (this.bn.v()))
        {
          this.cz.a(this);
          return;
        }
        this.al = true;
        if ((this.t == 4) || (this.t == 1))
          m.a().a(this.u);
        while (true)
        {
          this.V = 0;
          this.n.a(getDrawableForCurrentState(), false, paramBoolean);
          invalidate();
          return;
          if ((this.bn.f == 0) || (this.bn.f == 1) || (this.bn.f == 8))
          {
            this.o.a();
            continue;
          }
          if (this.bn.f != 9)
            continue;
          m.a().a(this.bn.a.j.k);
        }
      }
      if (this.V == 2)
      {
        if ((this.t == 3) || (this.t == 5))
        {
          this.n.a(0.0F, false);
          m.a().a(this.u, true, false);
          this.V = 4;
          this.n.a(getDrawableForCurrentState(), true, false);
          invalidate();
          return;
        }
        this.o.g(true);
        this.o.I();
        this.bn.k = 0.0F;
        this.V = -1;
        this.n.a(getDrawableForCurrentState(), false, paramBoolean);
        return;
      }
      if (this.V == 3)
      {
        this.cz.c(this);
        return;
      }
      if ((this.V != 4) || ((this.t != 3) && (this.t != 5)))
        continue;
      if (((!this.bn.j()) || (!this.bn.v())) && (!this.bn.w()))
        break;
      if (this.cz == null)
        continue;
      this.cz.a(this);
      return;
    }
    m.a().a(this.u);
    this.V = 2;
    this.n.a(getDrawableForCurrentState(), false, false);
    invalidate();
  }

  private boolean d(MotionEvent paramMotionEvent)
  {
    if ((this.bn.f != 0) || (!this.w))
      return false;
    int i1 = (int)paramMotionEvent.getX();
    int i4 = (int)paramMotionEvent.getY();
    if ((i1 >= this.b) && (i1 <= this.b + this.bx) && (i4 >= this.c + this.bn.x) && (i4 <= this.c + this.bn.x + this.y + org.vidogram.messenger.a.a(8.0F)))
    {
      if (paramMotionEvent.getAction() != 0)
        break label545;
      if ((this.t != 1) && (this.v) && (this.o.a(i1, i4)))
      {
        if ((this.s) && (this.V != -1) && (i1 >= this.T) && (i1 <= this.T + org.vidogram.messenger.a.a(48.0F)) && (i4 >= this.U) && (i4 <= this.U + org.vidogram.messenger.a.a(48.0F)))
        {
          this.W = 1;
          return true;
        }
        this.az = true;
        paramMotionEvent = this.bn.a.j.r;
        if ((this.t == 2) && (this.V == -1) && (MediaController.a().B()) && ((this.o.K() == null) || (!TextUtils.isEmpty(paramMotionEvent.l))))
        {
          this.az = false;
          return false;
        }
        return true;
      }
      if ((this.H == null) || (i4 < this.A));
    }
    while (true)
    {
      try
      {
        int i2;
        i1 -= this.b + org.vidogram.messenger.a.a(10.0F) + this.C;
        int i6 = this.A;
        int i5 = this.H.getLineForVertical(i4 - i6);
        int i7 = this.H.getOffsetForHorizontal(i5, i2);
        float f1 = this.H.getLineLeft(i5);
        if ((f1 <= i2) && (this.H.getLineWidth(i5) + f1 >= i2))
        {
          paramMotionEvent = (Spannable)this.bn.c;
          Object localObject = (ClickableSpan[])paramMotionEvent.getSpans(i7, i7, ClickableSpan.class);
          if (localObject.length == 0)
            break label924;
          if ((localObject.length == 0) || (!(localObject[0] instanceof URLSpanBotCommand)) || (URLSpanBotCommand.a))
            break label919;
          break label924;
          if (i2 == 0)
          {
            this.ax = localObject[0];
            this.f = -10;
            this.ay = 2;
            b(false);
            try
            {
              localObject = c(false);
              i3 = paramMotionEvent.getSpanStart(this.ax);
              ((z)localObject).a(this.H, i3, 0.0F);
              this.H.getSelectionPath(i3, paramMotionEvent.getSpanEnd(this.ax), (Path)localObject);
              invalidate();
              return true;
            }
            catch (Exception paramMotionEvent)
            {
              n.a("tmessages", paramMotionEvent);
              continue;
            }
          }
        }
      }
      catch (Exception paramMotionEvent)
      {
        n.a("tmessages", paramMotionEvent);
      }
      while (true)
      {
        return false;
        label545: if (paramMotionEvent.getAction() != 1)
          continue;
        if ((this.ay == 2) || (this.W != 0) || (this.az))
        {
          if (this.W != 0)
          {
            if (paramMotionEvent.getAction() != 1)
              continue;
            this.W = 0;
            playSoundEffect(0);
            d(false);
            invalidate();
            continue;
          }
          if (this.ax != null)
          {
            if ((this.ax instanceof URLSpan))
              org.vidogram.messenger.b.a.a(getContext(), ((URLSpan)this.ax).getURL());
            while (true)
            {
              a(2);
              break;
              this.ax.onClick(this);
            }
          }
          if ((this.t == 2) && (this.s))
            if (this.V == -1)
              if (MediaController.a().B())
                this.cz.c(this);
          while (true)
          {
            a(2);
            return true;
            this.V = 2;
            this.bn.k = 1.0F;
            this.o.g(false);
            this.o.J();
            this.n.a(getDrawableForCurrentState(), false, false);
            invalidate();
            playSoundEffect(0);
            continue;
            if ((this.V != 2) && (this.V != 0))
              continue;
            d(false);
            playSoundEffect(0);
            continue;
            paramMotionEvent = this.bn.a.j.r;
            if ((paramMotionEvent != null) && (Build.VERSION.SDK_INT >= 16) && (!TextUtils.isEmpty(paramMotionEvent.l)))
            {
              this.cz.a(paramMotionEvent.l, paramMotionEvent.h, paramMotionEvent.j, paramMotionEvent.e, paramMotionEvent.n, paramMotionEvent.o);
              continue;
            }
            if (this.V == -1)
            {
              this.cz.c(this);
              playSoundEffect(0);
              continue;
            }
            if (paramMotionEvent == null)
              continue;
            org.vidogram.messenger.b.a.a(getContext(), paramMotionEvent.e);
          }
        }
        a(2);
      }
      label919: int i3 = 0;
      continue;
      label924: i3 = 1;
    }
  }

  private boolean d(u paramu)
  {
    int i2 = 1;
    int i1;
    if (paramu.f == 13)
      i1 = 0;
    do
    {
      do
      {
        while (true)
        {
          return i1;
          if ((paramu.a.w != null) && (paramu.a.w.f != 0))
          {
            i1 = i2;
            if (!paramu.j())
              continue;
          }
          if (!paramu.l())
            break;
          if (((paramu.a.j instanceof g.ny)) || (paramu.a.j == null) || (((paramu.a.j instanceof g.oi)) && (!(paramu.a.j.r instanceof g.vp))))
            return false;
          Object localObject = v.a().a(Integer.valueOf(paramu.a.c));
          if (localObject != null)
          {
            i1 = i2;
            if (((g.vw)localObject).r)
              continue;
          }
          if (paramu.j())
            break label311;
          i1 = i2;
          if ((paramu.a.j instanceof g.nz))
            continue;
          if (!paramu.t())
            break label311;
          localObject = v.a().b(Integer.valueOf(paramu.a.d.b));
          if ((localObject != null) && (((g.i)localObject).v != null) && (((g.i)localObject).v.length() > 0) && (!(paramu.a.j instanceof g.nv)))
          {
            i1 = i2;
            if (!(paramu.a.j instanceof g.oa))
              continue;
          }
          return false;
        }
        if (((paramu.a.c >= 0) && (!paramu.a.v)) || (paramu.a.d.b == 0))
          break label311;
        if (paramu.a.x != 0)
          break;
        i1 = i2;
      }
      while (paramu.a.g == 0);
      i1 = i2;
    }
    while (paramu.f != 13);
    label311: return false;
  }

  private boolean e(MotionEvent paramMotionEvent)
  {
    if (((this.t != 1) && (this.bn.f != 12) && (this.t != 5) && (this.t != 4) && (this.t != 2) && (this.bn.f != 8)) || (this.x))
      return false;
    int i1 = (int)paramMotionEvent.getX();
    int i2 = (int)paramMotionEvent.getY();
    if (paramMotionEvent.getAction() == 0)
    {
      if ((i1 >= this.aa - org.vidogram.messenger.a.a(20.0F)) && (i1 <= this.aa + org.vidogram.messenger.a.a(20.0F)) && (i2 >= this.ab - org.vidogram.messenger.a.a(4.0F)) && (i2 <= this.ab + org.vidogram.messenger.a.a(30.0F)))
      {
        this.ad = true;
        return true;
      }
    }
    else if ((paramMotionEvent.getAction() == 1) && (this.ad))
    {
      this.ad = false;
      playSoundEffect(0);
      this.cz.e(this);
    }
    return false;
  }

  private void f()
  {
    if ((this.bn.f == 1) || (this.bn.f == 13))
      if (this.V == -1)
        this.cz.c(this);
    label41: Object localObject;
    do
    {
      do
        while (true)
        {
          break label41;
          break label41;
          break label41;
          do
            return;
          while (this.V != 0);
          d(false);
          return;
          if (this.bn.f == 12)
          {
            localObject = v.a().a(Integer.valueOf(this.bn.a.j.q));
            this.cz.a(this, (g.vw)localObject);
            return;
          }
          if (this.bn.f == 8)
          {
            if (this.V == -1)
            {
              if (MediaController.a().B())
              {
                this.cz.c(this);
                return;
              }
              this.V = 2;
              this.bn.k = 1.0F;
              this.o.g(false);
              this.o.J();
              this.n.a(getDrawableForCurrentState(), false, false);
              invalidate();
              return;
            }
            if ((this.V != 2) && (this.V != 0))
              continue;
            d(false);
            return;
          }
          if (this.t == 4)
          {
            if ((this.V != 0) && (this.V != 3))
              continue;
            d(false);
            return;
          }
          if (this.bn.f == 4)
          {
            this.cz.c(this);
            return;
          }
          if (this.t != 1)
            break;
          if (this.V != -1)
            continue;
          this.cz.c(this);
          return;
        }
      while ((this.t != 2) || (this.V != -1));
      localObject = this.bn.a.j.r;
    }
    while (localObject == null);
    if ((Build.VERSION.SDK_INT >= 16) && (((g.wb)localObject).l != null) && (((g.wb)localObject).l.length() != 0))
    {
      this.cz.a(((g.wb)localObject).l, ((g.wb)localObject).h, ((g.wb)localObject).j, ((g.wb)localObject).e, ((g.wb)localObject).n, ((g.wb)localObject).o);
      return;
    }
    org.vidogram.messenger.b.a.a(getContext(), ((g.wb)localObject).e);
  }

  private boolean f(MotionEvent paramMotionEvent)
  {
    int i4 = 1;
    int i3 = 1;
    if ((!this.v) && (this.t != 1))
      return false;
    int i1 = (int)paramMotionEvent.getX();
    int i2 = (int)paramMotionEvent.getY();
    if (paramMotionEvent.getAction() == 0)
      if ((this.V != -1) && (i1 >= this.T) && (i1 <= this.T + org.vidogram.messenger.a.a(48.0F)) && (i2 >= this.U) && (i2 <= this.U + org.vidogram.messenger.a.a(48.0F)))
      {
        this.W = 1;
        invalidate();
      }
    while (true)
    {
      i4 = i3;
      if (this.ac)
      {
        if (this.bn.r())
        {
          this.ac = false;
          i4 = i3;
        }
      }
      else
      {
        label135: return i4;
        if (this.t == 1)
        {
          if ((i1 < this.o.n()) || (i1 > this.o.n() + this.bx - org.vidogram.messenger.a.a(50.0F)) || (i2 < this.o.o()) || (i2 > this.o.o() + this.o.q()))
            break label587;
          this.ac = true;
          continue;
        }
        if ((this.bn.f == 13) && (this.bn.R() == null))
          break label587;
        if ((i1 < this.o.n()) || (i1 > this.o.n() + this.bx) || (i2 < this.o.o()) || (i2 > this.o.o() + this.o.q()))
          break label581;
        this.ac = true;
      }
      while (true)
      {
        i3 = i4;
        if (this.bn.f != 12)
          break;
        i3 = i4;
        if (v.a().a(Integer.valueOf(this.bn.a.j.q)) != null)
          break;
        this.ac = false;
        i3 = 0;
        break;
        if (this.bn.w())
        {
          this.ac = false;
          i4 = 0;
          break label135;
        }
        i4 = i3;
        if (this.bn.f != 8)
          break label135;
        i4 = i3;
        if (this.V != -1)
          break label135;
        i4 = i3;
        if (!MediaController.a().B())
          break label135;
        i4 = i3;
        if (this.o.K() != null)
          break label135;
        this.ac = false;
        i4 = 0;
        break label135;
        if (paramMotionEvent.getAction() == 1)
        {
          if (this.W == 1)
          {
            this.W = 0;
            playSoundEffect(0);
            d(false);
            this.n.a(getDrawableForCurrentState());
            invalidate();
            i4 = 0;
            break label135;
          }
          if (this.ac)
          {
            this.ac = false;
            if ((this.V != -1) && (this.V != 2) && (this.V != 3))
              break label553;
            playSoundEffect(0);
            f();
          }
        }
        while (true)
        {
          invalidate();
          i4 = 0;
          break;
          label553: if ((this.V != 0) || (this.t != 1))
            continue;
          playSoundEffect(0);
          d(false);
        }
        label581: i4 = 0;
      }
      label587: i3 = 0;
    }
  }

  private boolean g()
  {
    Object localObject3 = null;
    if ((this.bn != null) && (!this.w) && (this.bn.a.j != null) && ((this.bn.a.j.r instanceof g.vp)));
    do
    {
      return true;
      if ((this.bn == null) || ((this.cr == null) && (this.cs == null)))
        return false;
    }
    while ((this.cB != this.bn.a.y) || (this.cC != this.bn.a.G) || (this.cD != this.bn.a.s));
    g.vw localvw;
    Object localObject1;
    if (this.bn.l())
    {
      localvw = v.a().a(Integer.valueOf(this.bn.a.c));
      localObject1 = null;
    }
    while (true)
    {
      label157: Object localObject2;
      if (this.bh)
        if ((localvw != null) && (localvw.j != null))
          localObject2 = localvw.j.e;
      while (true)
      {
        label184: if (((this.bG == null) && (this.bn.e != null)) || ((this.ct == null) && (localObject2 != null)) || ((this.ct != null) && (localObject2 == null)) || ((this.ct != null) && (localObject2 != null) && ((this.ct.d != ((g.x)localObject2).d) || (this.ct.c != ((g.x)localObject2).c))))
          break label628;
        if (this.bn.e != null)
        {
          localObject2 = m.a(this.bn.e.m, 80);
          if ((localObject2 == null) || (this.bn.e.f == 13));
        }
        for (localObject2 = ((g.az)localObject2).c; ; localObject2 = null)
        {
          if ((this.bQ == null) && (localObject2 != null))
            break label622;
          localObject2 = localObject3;
          if (this.ca)
          {
            localObject2 = localObject3;
            if (this.a)
            {
              localObject2 = localObject3;
              if (!this.bn.k())
              {
                if (localvw == null)
                  break label594;
                localObject2 = ae.c(localvw);
              }
            }
          }
          label380: if (((this.cu != null) || (localObject2 == null)) && ((this.cu == null) || (localObject2 != null)) && ((this.cu == null) || (localObject2 == null) || (this.cu.equals(localObject2))))
          {
            if (!this.ce)
              break label616;
            localObject1 = this.bn.V();
            if (((this.cy != null) || (localObject1 == null)) && ((this.cy == null) || (localObject1 != null)) && ((this.cy == null) || (localObject1 == null) || (this.cy.equals(localObject1))))
              break label611;
          }
          label594: label611: for (int i1 = 1; ; i1 = 0)
          {
            return i1;
            if (this.bn.a.c < 0)
            {
              localObject1 = v.a().b(Integer.valueOf(-this.bn.a.c));
              localvw = null;
              break label157;
            }
            if (!this.bn.a.v)
              break label630;
            localObject1 = v.a().b(Integer.valueOf(this.bn.a.d.b));
            localvw = null;
            break label157;
            if ((localObject1 == null) || (((g.i)localObject1).j == null))
              break label624;
            localObject2 = ((g.i)localObject1).j.b;
            break label184;
            localObject2 = localObject3;
            if (localObject1 == null)
              break label380;
            localObject2 = ((g.i)localObject1).i;
            break label380;
            break;
          }
          label616: return false;
        }
        label622: break;
        label624: localObject2 = null;
      }
      label628: break;
      label630: localObject1 = null;
      localvw = null;
    }
  }

  private boolean g(MotionEvent paramMotionEvent)
  {
    boolean bool2 = true;
    if ((this.t != 3) && (this.t != 5))
      return false;
    int i1 = (int)paramMotionEvent.getX();
    int i2 = (int)paramMotionEvent.getY();
    boolean bool1;
    if (this.aE)
    {
      bool1 = this.aG.a(paramMotionEvent.getAction(), paramMotionEvent.getX() - this.aH - org.vidogram.messenger.a.a(13.0F), paramMotionEvent.getY() - this.aI);
      if (!bool1)
        break label191;
      if ((this.aE) || (paramMotionEvent.getAction() != 0))
        break label158;
      getParent().requestDisallowInterceptTouchEvent(true);
    }
    while (true)
    {
      this.q = true;
      invalidate();
      return bool1;
      bool1 = this.aF.a(paramMotionEvent.getAction(), paramMotionEvent.getX() - this.aH, paramMotionEvent.getY() - this.aI);
      break;
      label158: if ((!this.aE) || (this.aG.a()) || (paramMotionEvent.getAction() != 1))
        continue;
      d(true);
    }
    label191: int i3 = org.vidogram.messenger.a.a(36.0F);
    if ((this.V == 0) || (this.V == 1) || (this.V == 2))
      if ((i1 >= this.T - org.vidogram.messenger.a.a(12.0F)) && (i1 <= this.T - org.vidogram.messenger.a.a(12.0F) + this.bx) && (i2 >= this.cA + this.z) && (i2 <= this.bz))
        i1 = 1;
    while (true)
    {
      if (paramMotionEvent.getAction() != 0)
        break label372;
      if (i1 == 0)
        break label418;
      this.W = 1;
      invalidate();
      this.n.a(getDrawableForCurrentState());
      bool1 = bool2;
      break;
      i1 = 0;
      continue;
      if ((i1 >= this.T) && (i1 <= this.T + i3) && (i2 >= this.U) && (i2 <= this.U + i3))
      {
        i1 = 1;
        continue;
      }
      i1 = 0;
    }
    label372: if (this.W != 0)
    {
      if (paramMotionEvent.getAction() != 1)
        break label421;
      this.W = 0;
      playSoundEffect(0);
      d(true);
      invalidate();
    }
    while (true)
    {
      this.n.a(getDrawableForCurrentState());
      label418: break;
      label421: if (paramMotionEvent.getAction() == 3)
      {
        this.W = 0;
        invalidate();
        continue;
      }
      if ((paramMotionEvent.getAction() != 2) || (i1 != 0))
        continue;
      this.W = 0;
      invalidate();
    }
  }

  private Drawable getDrawableForCurrentState()
  {
    int i1 = 3;
    int i2 = 0;
    int i3 = 1;
    int i4 = 1;
    int i5 = 1;
    int i6 = 1;
    Object localObject;
    if ((this.t == 3) || (this.t == 5))
    {
      if (this.V == -1)
        return null;
      this.n.a(false);
      localObject = l.M;
      if (this.bn.k())
      {
        i1 = this.V;
        localObject = localObject[i1];
        if ((!i()) && (this.W == 0))
          break label106;
      }
      label106: for (i1 = 1; ; i1 = 0)
      {
        return localObject[i1];
        i1 = this.V + 5;
        break;
      }
    }
    if ((this.t == 1) && (!this.v))
    {
      this.n.a(false);
      if (this.V == -1)
      {
        localObject = l.M;
        if (this.bn.k())
        {
          localObject = localObject[i1];
          if (!i())
            break label184;
        }
        label184: for (i1 = i6; ; i1 = 0)
        {
          return localObject[i1];
          i1 = 8;
          break;
        }
      }
      if (this.V == 0)
      {
        localObject = l.M;
        if (this.bn.k())
        {
          i1 = 2;
          localObject = localObject[i1];
          if (!i())
            break label239;
        }
        label239: for (i1 = i3; ; i1 = 0)
        {
          return localObject[i1];
          i1 = 7;
          break;
        }
      }
      if (this.V == 1)
      {
        localObject = l.M;
        if (this.bn.k())
        {
          i1 = 4;
          localObject = localObject[i1];
          if (!i())
            break label296;
        }
        label296: for (i1 = i4; ; i1 = 0)
        {
          return localObject[i1];
          i1 = 9;
          break;
        }
      }
    }
    else
    {
      this.n.a(true);
      if ((this.V >= 0) && (this.V < 4))
      {
        if (this.t == 1)
        {
          i1 = this.V;
          if (this.V == 0)
            if (this.bn.k())
              i1 = 7;
          while (true)
          {
            localObject = l.N[i1];
            if (!i())
            {
              i1 = i2;
              if (this.W == 0);
            }
            else
            {
              i1 = 1;
            }
            return localObject[i1];
            i1 = 10;
            continue;
            if (this.V != 1)
              continue;
            if (this.bn.k())
            {
              i1 = 8;
              continue;
            }
            i1 = 11;
          }
        }
        return l.N[this.V][this.W];
      }
      if ((this.V == -1) && (this.t == 1))
      {
        localObject = l.N;
        if (this.bn.k())
        {
          i1 = 9;
          localObject = localObject[i1];
          if (!i())
            break label498;
        }
        label498: for (i1 = i5; ; i1 = 0)
        {
          return localObject[i1];
          i1 = 12;
          break;
        }
      }
    }
    return (Drawable)null;
  }

  private int getMaxNameWidth()
  {
    if (this.t == 6)
    {
      if (org.vidogram.messenger.a.c())
        if ((this.a) && (!this.bn.k()) && (this.bn.l()))
          i1 = org.vidogram.messenger.a.e() - org.vidogram.messenger.a.a(42.0F);
      while (true)
      {
        return i1 - this.bx - org.vidogram.messenger.a.a(57.0F);
        i1 = org.vidogram.messenger.a.e();
        continue;
        if ((this.a) && (!this.bn.k()) && (this.bn.l()))
        {
          i1 = Math.min(org.vidogram.messenger.a.c.x, org.vidogram.messenger.a.c.y) - org.vidogram.messenger.a.a(42.0F);
          continue;
        }
        i1 = Math.min(org.vidogram.messenger.a.c.x, org.vidogram.messenger.a.c.y);
      }
    }
    int i1 = this.bx;
    float f1;
    if (this.be)
      f1 = 22.0F;
    while (true)
    {
      return i1 - org.vidogram.messenger.a.a(f1);
      f1 = 31.0F;
    }
  }

  private void h()
  {
    boolean bool = false;
    if ((this.bn == null) || (this.t != 3));
    while (true)
    {
      return;
      int i1 = 0;
      while (i1 < this.u.o.size())
      {
        g.r localr = (g.r)this.u.o.get(i1);
        if ((localr instanceof g.hu))
        {
          if ((localr.n == null) || (localr.n.length == 0))
            MediaController.a().e(this.bn);
          if (localr.n != null)
            bool = true;
          this.aE = bool;
          this.aG.a(localr.n);
          return;
        }
        i1 += 1;
      }
    }
  }

  private boolean h(MotionEvent paramMotionEvent)
  {
    if (this.aX.isEmpty());
    label200: 
    do
      while (true)
      {
        return false;
        int i3 = (int)paramMotionEvent.getX();
        int i4 = (int)paramMotionEvent.getY();
        if (paramMotionEvent.getAction() != 0)
          break;
        int i1;
        int i2;
        if (this.bn.k())
        {
          i1 = getMeasuredWidth() - this.aZ - org.vidogram.messenger.a.a(10.0F);
          i2 = 0;
        }
        while (true)
        {
          if (i2 >= this.aX.size())
            break label200;
          paramMotionEvent = (a)this.aX.get(i2);
          int i5 = a.b(paramMotionEvent) + this.bz - org.vidogram.messenger.a.a(2.0F);
          if ((i3 >= a.c(paramMotionEvent) + i1) && (i3 <= a.c(paramMotionEvent) + i1 + a.d(paramMotionEvent)) && (i4 >= i5) && (i4 <= a.e(paramMotionEvent) + i5))
          {
            this.ba = i2;
            invalidate();
            return true;
            i1 = this.bm;
            float f1;
            if (this.be)
              f1 = 1.0F;
            while (true)
            {
              i1 = org.vidogram.messenger.a.a(f1) + i1;
              break;
              f1 = 7.0F;
            }
          }
          i2 += 1;
        }
      }
    while ((paramMotionEvent.getAction() != 1) || (this.ba == -1));
    playSoundEffect(0);
    this.cz.a(this, a.a((a)this.aX.get(this.ba)));
    this.ba = -1;
    invalidate();
    return false;
  }

  private boolean i()
  {
    return ((isPressed()) && (this.bf)) || ((!this.bf) && (this.bc)) || (this.bd);
  }

  // ERROR //
  private void setMessageObjectInternal(u paramu)
  {
    // Byte code:
    //   0: aload_1
    //   1: getfield 453	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   4: getfield 1345	org/vidogram/tgnet/g$ar:k	I
    //   7: sipush 1024
    //   10: iand
    //   11: ifeq +44 -> 55
    //   14: aload_0
    //   15: getfield 773	org/vidogram/ui/c/j:bn	Lorg/vidogram/messenger/u;
    //   18: invokevirtual 1066	org/vidogram/messenger/u:n	()Z
    //   21: ifeq +1891 -> 1912
    //   24: aload_0
    //   25: getfield 773	org/vidogram/ui/c/j:bn	Lorg/vidogram/messenger/u;
    //   28: invokevirtual 1193	org/vidogram/messenger/u:j	()Z
    //   31: ifne +1881 -> 1912
    //   34: invokestatic 1333	org/vidogram/messenger/v:a	()Lorg/vidogram/messenger/v;
    //   37: aload_0
    //   38: getfield 773	org/vidogram/ui/c/j:bn	Lorg/vidogram/messenger/u;
    //   41: getfield 453	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   44: iconst_0
    //   45: invokevirtual 1662	org/vidogram/messenger/v:a	(Lorg/vidogram/tgnet/g$ar;Z)V
    //   48: aload_0
    //   49: getfield 773	org/vidogram/ui/c/j:bn	Lorg/vidogram/messenger/u;
    //   52: invokevirtual 1664	org/vidogram/messenger/u:p	()V
    //   55: aload_0
    //   56: getfield 773	org/vidogram/ui/c/j:bn	Lorg/vidogram/messenger/u;
    //   59: invokevirtual 1338	org/vidogram/messenger/u:l	()Z
    //   62: ifeq +1885 -> 1947
    //   65: aload_0
    //   66: invokestatic 1333	org/vidogram/messenger/v:a	()Lorg/vidogram/messenger/v;
    //   69: aload_0
    //   70: getfield 773	org/vidogram/ui/c/j:bn	Lorg/vidogram/messenger/u;
    //   73: getfield 453	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   76: getfield 1327	org/vidogram/tgnet/g$ar:c	I
    //   79: invokestatic 597	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   82: invokevirtual 1336	org/vidogram/messenger/v:a	(Ljava/lang/Integer;)Lorg/vidogram/tgnet/g$vw;
    //   85: putfield 1552	org/vidogram/ui/c/j:cr	Lorg/vidogram/tgnet/g$vw;
    //   88: aload_0
    //   89: getfield 1586	org/vidogram/ui/c/j:a	Z
    //   92: ifeq +84 -> 176
    //   95: aload_1
    //   96: invokevirtual 524	org/vidogram/messenger/u:k	()Z
    //   99: ifne +77 -> 176
    //   102: aload_1
    //   103: invokevirtual 1338	org/vidogram/messenger/u:l	()Z
    //   106: ifeq +70 -> 176
    //   109: aload_0
    //   110: iconst_1
    //   111: putfield 1563	org/vidogram/ui/c/j:bh	Z
    //   114: aload_0
    //   115: getfield 1552	org/vidogram/ui/c/j:cr	Lorg/vidogram/tgnet/g$vw;
    //   118: ifnull +1919 -> 2037
    //   121: aload_0
    //   122: getfield 1552	org/vidogram/ui/c/j:cr	Lorg/vidogram/tgnet/g$vw;
    //   125: getfield 1566	org/vidogram/tgnet/g$vw:j	Lorg/vidogram/tgnet/g$vx;
    //   128: ifnull +1901 -> 2029
    //   131: aload_0
    //   132: aload_0
    //   133: getfield 1552	org/vidogram/ui/c/j:cr	Lorg/vidogram/tgnet/g$vw;
    //   136: getfield 1566	org/vidogram/tgnet/g$vw:j	Lorg/vidogram/tgnet/g$vx;
    //   139: getfield 1570	org/vidogram/tgnet/g$vx:e	Lorg/vidogram/tgnet/g$x;
    //   142: putfield 1576	org/vidogram/ui/c/j:ct	Lorg/vidogram/tgnet/g$x;
    //   145: aload_0
    //   146: getfield 402	org/vidogram/ui/c/j:bB	Lorg/vidogram/ui/Components/b;
    //   149: aload_0
    //   150: getfield 1552	org/vidogram/ui/c/j:cr	Lorg/vidogram/tgnet/g$vw;
    //   153: invokevirtual 1667	org/vidogram/ui/Components/b:a	(Lorg/vidogram/tgnet/g$vw;)V
    //   156: aload_0
    //   157: getfield 394	org/vidogram/ui/c/j:bA	Lorg/vidogram/messenger/q;
    //   160: aload_0
    //   161: getfield 1576	org/vidogram/ui/c/j:ct	Lorg/vidogram/tgnet/g$x;
    //   164: ldc_w 1669
    //   167: aload_0
    //   168: getfield 402	org/vidogram/ui/c/j:bB	Lorg/vidogram/ui/Components/b;
    //   171: aconst_null
    //   172: iconst_0
    //   173: invokevirtual 1672	org/vidogram/messenger/q:a	(Lorg/vidogram/tgnet/f;Ljava/lang/String;Landroid/graphics/drawable/Drawable;Ljava/lang/String;Z)V
    //   176: aload_0
    //   177: aload_1
    //   178: invokespecial 511	org/vidogram/ui/c/j:c	(Lorg/vidogram/messenger/u;)V
    //   181: aload_0
    //   182: iconst_0
    //   183: putfield 826	org/vidogram/ui/c/j:cA	I
    //   186: aconst_null
    //   187: astore 7
    //   189: aconst_null
    //   190: astore 8
    //   192: aload_1
    //   193: getfield 453	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   196: getfield 1339	org/vidogram/tgnet/g$ar:x	I
    //   199: ifeq +1916 -> 2115
    //   202: invokestatic 1333	org/vidogram/messenger/v:a	()Lorg/vidogram/messenger/v;
    //   205: aload_1
    //   206: getfield 453	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   209: getfield 1339	org/vidogram/tgnet/g$ar:x	I
    //   212: invokestatic 597	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   215: invokevirtual 1336	org/vidogram/messenger/v:a	(Ljava/lang/Integer;)Lorg/vidogram/tgnet/g$vw;
    //   218: astore 9
    //   220: aload 8
    //   222: astore 6
    //   224: aload 7
    //   226: astore 5
    //   228: aload 9
    //   230: ifnull +115 -> 345
    //   233: aload 8
    //   235: astore 6
    //   237: aload 7
    //   239: astore 5
    //   241: aload 9
    //   243: getfield 1673	org/vidogram/tgnet/g$vw:g	Ljava/lang/String;
    //   246: ifnull +99 -> 345
    //   249: aload 8
    //   251: astore 6
    //   253: aload 7
    //   255: astore 5
    //   257: aload 9
    //   259: getfield 1673	org/vidogram/tgnet/g$vw:g	Ljava/lang/String;
    //   262: invokevirtual 648	java/lang/String:length	()I
    //   265: ifle +80 -> 345
    //   268: new 677	java/lang/StringBuilder
    //   271: dup
    //   272: invokespecial 678	java/lang/StringBuilder:<init>	()V
    //   275: ldc_w 1675
    //   278: invokevirtual 682	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   281: aload 9
    //   283: getfield 1673	org/vidogram/tgnet/g$vw:g	Ljava/lang/String;
    //   286: invokevirtual 682	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   289: invokevirtual 689	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   292: astore 5
    //   294: ldc_w 1677
    //   297: iconst_1
    //   298: anewarray 591	java/lang/Object
    //   301: dup
    //   302: iconst_0
    //   303: aload 5
    //   305: aastore
    //   306: invokestatic 601	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   309: invokestatic 1680	org/vidogram/messenger/a:b	(Ljava/lang/String;)Landroid/text/SpannableStringBuilder;
    //   312: astore 6
    //   314: aload_0
    //   315: getstatic 364	org/vidogram/ui/c/j:bu	Landroid/text/TextPaint;
    //   318: aload 6
    //   320: iconst_0
    //   321: aload 6
    //   323: invokeinterface 747 1 0
    //   328: invokevirtual 1391	android/text/TextPaint:measureText	(Ljava/lang/CharSequence;II)F
    //   331: f2d
    //   332: invokestatic 506	java/lang/Math:ceil	(D)D
    //   335: d2i
    //   336: putfield 1682	org/vidogram/ui/c/j:bo	I
    //   339: aload_0
    //   340: aload 9
    //   342: putfield 1684	org/vidogram/ui/c/j:cw	Lorg/vidogram/tgnet/g$vw;
    //   345: aload 6
    //   347: astore 7
    //   349: aload 5
    //   351: astore 6
    //   353: aload 7
    //   355: astore 5
    //   357: aload_0
    //   358: getfield 1585	org/vidogram/ui/c/j:ca	Z
    //   361: ifeq +1853 -> 2214
    //   364: aload_0
    //   365: getfield 1586	org/vidogram/ui/c/j:a	Z
    //   368: ifeq +1846 -> 2214
    //   371: aload_0
    //   372: getfield 773	org/vidogram/ui/c/j:bn	Lorg/vidogram/messenger/u;
    //   375: invokevirtual 524	org/vidogram/messenger/u:k	()Z
    //   378: ifne +1836 -> 2214
    //   381: iconst_1
    //   382: istore_3
    //   383: aload_1
    //   384: getfield 453	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   387: getfield 1507	org/vidogram/tgnet/g$ar:w	Lorg/vidogram/tgnet/g$nt;
    //   390: ifnull +12 -> 402
    //   393: aload_1
    //   394: getfield 450	org/vidogram/messenger/u:f	I
    //   397: bipush 14
    //   399: if_icmpne +1820 -> 2219
    //   402: aload 6
    //   404: ifnull +1815 -> 2219
    //   407: iconst_1
    //   408: istore_2
    //   409: iload_3
    //   410: ifne +7 -> 417
    //   413: iload_2
    //   414: ifeq +1977 -> 2391
    //   417: aload_0
    //   418: iconst_1
    //   419: putfield 1686	org/vidogram/ui/c/j:cb	Z
    //   422: aload_0
    //   423: aload_0
    //   424: invokespecial 1688	org/vidogram/ui/c/j:getMaxNameWidth	()I
    //   427: putfield 1690	org/vidogram/ui/c/j:bW	I
    //   430: aload_0
    //   431: getfield 1690	org/vidogram/ui/c/j:bW	I
    //   434: ifge +13 -> 447
    //   437: aload_0
    //   438: ldc_w 1691
    //   441: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   444: putfield 1690	org/vidogram/ui/c/j:bW	I
    //   447: iload_3
    //   448: ifeq +1807 -> 2255
    //   451: aload_0
    //   452: getfield 1552	org/vidogram/ui/c/j:cr	Lorg/vidogram/tgnet/g$vw;
    //   455: ifnull +1769 -> 2224
    //   458: aload_0
    //   459: aload_0
    //   460: getfield 1552	org/vidogram/ui/c/j:cr	Lorg/vidogram/tgnet/g$vw;
    //   463: invokestatic 1591	org/vidogram/messenger/ae:c	(Lorg/vidogram/tgnet/g$vw;)Ljava/lang/String;
    //   466: putfield 1593	org/vidogram/ui/c/j:cu	Ljava/lang/String;
    //   469: aload_0
    //   470: getfield 1593	org/vidogram/ui/c/j:cu	Ljava/lang/String;
    //   473: bipush 10
    //   475: bipush 32
    //   477: invokevirtual 549	java/lang/String:replace	(CC)Ljava/lang/String;
    //   480: astore 7
    //   482: getstatic 360	org/vidogram/ui/c/j:bs	Landroid/text/TextPaint;
    //   485: astore 8
    //   487: aload_0
    //   488: getfield 1690	org/vidogram/ui/c/j:bW	I
    //   491: istore 4
    //   493: iload_2
    //   494: ifeq +1771 -> 2265
    //   497: aload_0
    //   498: getfield 1682	org/vidogram/ui/c/j:bo	I
    //   501: istore_3
    //   502: aload 7
    //   504: aload 8
    //   506: iload 4
    //   508: iload_3
    //   509: isub
    //   510: i2f
    //   511: getstatic 555	android/text/TextUtils$TruncateAt:END	Landroid/text/TextUtils$TruncateAt;
    //   514: invokestatic 561	android/text/TextUtils:ellipsize	(Ljava/lang/CharSequence;Landroid/text/TextPaint;FLandroid/text/TextUtils$TruncateAt;)Ljava/lang/CharSequence;
    //   517: astore 7
    //   519: iload_2
    //   520: ifeq +2296 -> 2816
    //   523: aload_0
    //   524: getstatic 360	org/vidogram/ui/c/j:bs	Landroid/text/TextPaint;
    //   527: aload 7
    //   529: iconst_0
    //   530: aload 7
    //   532: invokeinterface 747 1 0
    //   537: invokevirtual 1391	android/text/TextPaint:measureText	(Ljava/lang/CharSequence;II)F
    //   540: f2d
    //   541: invokestatic 506	java/lang/Math:ceil	(D)D
    //   544: d2i
    //   545: putfield 1693	org/vidogram/ui/c/j:bp	I
    //   548: aload_0
    //   549: getfield 1693	org/vidogram/ui/c/j:bp	I
    //   552: ifeq +18 -> 570
    //   555: aload_0
    //   556: aload_0
    //   557: getfield 1693	org/vidogram/ui/c/j:bp	I
    //   560: ldc_w 869
    //   563: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   566: iadd
    //   567: putfield 1693	org/vidogram/ui/c/j:bp	I
    //   570: aload_0
    //   571: getfield 773	org/vidogram/ui/c/j:bn	Lorg/vidogram/messenger/u;
    //   574: getfield 450	org/vidogram/messenger/u:f	I
    //   577: bipush 13
    //   579: if_icmpne +1691 -> 2270
    //   582: iconst_m1
    //   583: istore_2
    //   584: aload_0
    //   585: getfield 1593	org/vidogram/ui/c/j:cu	Ljava/lang/String;
    //   588: invokevirtual 648	java/lang/String:length	()I
    //   591: ifle +1703 -> 2294
    //   594: new 726	android/text/SpannableStringBuilder
    //   597: dup
    //   598: ldc_w 1695
    //   601: iconst_2
    //   602: anewarray 591	java/lang/Object
    //   605: dup
    //   606: iconst_0
    //   607: aload 7
    //   609: aastore
    //   610: dup
    //   611: iconst_1
    //   612: aload 6
    //   614: aastore
    //   615: invokestatic 601	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   618: invokespecial 729	android/text/SpannableStringBuilder:<init>	(Ljava/lang/CharSequence;)V
    //   621: astore 8
    //   623: aload 8
    //   625: new 1697	org/vidogram/ui/Components/bo
    //   628: dup
    //   629: getstatic 1703	android/graphics/Typeface:DEFAULT	Landroid/graphics/Typeface;
    //   632: iconst_0
    //   633: iload_2
    //   634: invokespecial 1706	org/vidogram/ui/Components/bo:<init>	(Landroid/graphics/Typeface;II)V
    //   637: aload 7
    //   639: invokeinterface 747 1 0
    //   644: iconst_1
    //   645: iadd
    //   646: aload 7
    //   648: invokeinterface 747 1 0
    //   653: iconst_4
    //   654: iadd
    //   655: bipush 33
    //   657: invokevirtual 1710	android/text/SpannableStringBuilder:setSpan	(Ljava/lang/Object;III)V
    //   660: aload 8
    //   662: new 1697	org/vidogram/ui/Components/bo
    //   665: dup
    //   666: ldc_w 286
    //   669: invokestatic 291	org/vidogram/messenger/a:a	(Ljava/lang/String;)Landroid/graphics/Typeface;
    //   672: iconst_0
    //   673: iload_2
    //   674: invokespecial 1706	org/vidogram/ui/Components/bo:<init>	(Landroid/graphics/Typeface;II)V
    //   677: aload 7
    //   679: invokeinterface 747 1 0
    //   684: iconst_5
    //   685: iadd
    //   686: aload 8
    //   688: invokevirtual 1711	android/text/SpannableStringBuilder:length	()I
    //   691: bipush 33
    //   693: invokevirtual 1710	android/text/SpannableStringBuilder:setSpan	(Ljava/lang/Object;III)V
    //   696: aload 8
    //   698: astore 7
    //   700: aload 7
    //   702: getstatic 360	org/vidogram/ui/c/j:bs	Landroid/text/TextPaint;
    //   705: aload_0
    //   706: getfield 1690	org/vidogram/ui/c/j:bW	I
    //   709: i2f
    //   710: getstatic 555	android/text/TextUtils$TruncateAt:END	Landroid/text/TextUtils$TruncateAt;
    //   713: invokestatic 561	android/text/TextUtils:ellipsize	(Ljava/lang/CharSequence;Landroid/text/TextPaint;FLandroid/text/TextUtils$TruncateAt;)Ljava/lang/CharSequence;
    //   716: astore 7
    //   718: aload_0
    //   719: new 269	android/text/StaticLayout
    //   722: dup
    //   723: aload 7
    //   725: getstatic 360	org/vidogram/ui/c/j:bs	Landroid/text/TextPaint;
    //   728: aload_0
    //   729: getfield 1690	org/vidogram/ui/c/j:bW	I
    //   732: fconst_2
    //   733: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   736: iadd
    //   737: getstatic 567	android/text/Layout$Alignment:ALIGN_NORMAL	Landroid/text/Layout$Alignment;
    //   740: fconst_1
    //   741: fconst_0
    //   742: iconst_0
    //   743: invokespecial 570	android/text/StaticLayout:<init>	(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;FFZ)V
    //   746: putfield 1713	org/vidogram/ui/c/j:bV	Landroid/text/StaticLayout;
    //   749: aload_0
    //   750: getfield 1713	org/vidogram/ui/c/j:bV	Landroid/text/StaticLayout;
    //   753: ifnull +1617 -> 2370
    //   756: aload_0
    //   757: getfield 1713	org/vidogram/ui/c/j:bV	Landroid/text/StaticLayout;
    //   760: invokevirtual 575	android/text/StaticLayout:getLineCount	()I
    //   763: ifle +1607 -> 2370
    //   766: aload_0
    //   767: aload_0
    //   768: getfield 1713	org/vidogram/ui/c/j:bV	Landroid/text/StaticLayout;
    //   771: iconst_0
    //   772: invokevirtual 672	android/text/StaticLayout:getLineWidth	(I)F
    //   775: f2d
    //   776: invokestatic 506	java/lang/Math:ceil	(D)D
    //   779: d2i
    //   780: putfield 1690	org/vidogram/ui/c/j:bW	I
    //   783: aload_1
    //   784: getfield 450	org/vidogram/messenger/u:f	I
    //   787: bipush 13
    //   789: if_icmpeq +18 -> 807
    //   792: aload_0
    //   793: aload_0
    //   794: getfield 826	org/vidogram/ui/c/j:cA	I
    //   797: ldc_w 1027
    //   800: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   803: iadd
    //   804: putfield 826	org/vidogram/ui/c/j:cA	I
    //   807: aload_0
    //   808: aload_0
    //   809: getfield 1713	org/vidogram/ui/c/j:bV	Landroid/text/StaticLayout;
    //   812: iconst_0
    //   813: invokevirtual 579	android/text/StaticLayout:getLineLeft	(I)F
    //   816: putfield 1715	org/vidogram/ui/c/j:bX	F
    //   819: aload_0
    //   820: getfield 1593	org/vidogram/ui/c/j:cu	Ljava/lang/String;
    //   823: invokevirtual 648	java/lang/String:length	()I
    //   826: ifne +8 -> 834
    //   829: aload_0
    //   830: aconst_null
    //   831: putfield 1593	org/vidogram/ui/c/j:cu	Ljava/lang/String;
    //   834: aload_0
    //   835: aconst_null
    //   836: putfield 1717	org/vidogram/ui/c/j:cv	Lorg/vidogram/tgnet/g$vw;
    //   839: aload_0
    //   840: aconst_null
    //   841: putfield 1599	org/vidogram/ui/c/j:cy	Ljava/lang/String;
    //   844: aload_0
    //   845: aconst_null
    //   846: putfield 1719	org/vidogram/ui/c/j:cx	Lorg/vidogram/tgnet/g$i;
    //   849: aload_0
    //   850: getfield 271	org/vidogram/ui/c/j:cc	[Landroid/text/StaticLayout;
    //   853: iconst_0
    //   854: aconst_null
    //   855: aastore
    //   856: aload_0
    //   857: getfield 271	org/vidogram/ui/c/j:cc	[Landroid/text/StaticLayout;
    //   860: iconst_1
    //   861: aconst_null
    //   862: aastore
    //   863: aload_0
    //   864: iconst_0
    //   865: putfield 1721	org/vidogram/ui/c/j:cd	I
    //   868: aload_0
    //   869: getfield 1595	org/vidogram/ui/c/j:ce	Z
    //   872: ifeq +512 -> 1384
    //   875: aload_1
    //   876: invokevirtual 1723	org/vidogram/messenger/u:S	()Z
    //   879: ifeq +505 -> 1384
    //   882: aload_1
    //   883: getfield 453	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   886: getfield 1507	org/vidogram/tgnet/g$ar:w	Lorg/vidogram/tgnet/g$nt;
    //   889: getfield 1510	org/vidogram/tgnet/g$nt:f	I
    //   892: ifeq +26 -> 918
    //   895: aload_0
    //   896: invokestatic 1333	org/vidogram/messenger/v:a	()Lorg/vidogram/messenger/v;
    //   899: aload_1
    //   900: getfield 453	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   903: getfield 1507	org/vidogram/tgnet/g$ar:w	Lorg/vidogram/tgnet/g$nt;
    //   906: getfield 1510	org/vidogram/tgnet/g$nt:f	I
    //   909: invokestatic 597	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   912: invokevirtual 1523	org/vidogram/messenger/v:b	(Ljava/lang/Integer;)Lorg/vidogram/tgnet/g$i;
    //   915: putfield 1719	org/vidogram/ui/c/j:cx	Lorg/vidogram/tgnet/g$i;
    //   918: aload_1
    //   919: getfield 453	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   922: getfield 1507	org/vidogram/tgnet/g$ar:w	Lorg/vidogram/tgnet/g$nt;
    //   925: getfield 1724	org/vidogram/tgnet/g$nt:d	I
    //   928: ifeq +26 -> 954
    //   931: aload_0
    //   932: invokestatic 1333	org/vidogram/messenger/v:a	()Lorg/vidogram/messenger/v;
    //   935: aload_1
    //   936: getfield 453	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   939: getfield 1507	org/vidogram/tgnet/g$ar:w	Lorg/vidogram/tgnet/g$nt;
    //   942: getfield 1724	org/vidogram/tgnet/g$nt:d	I
    //   945: invokestatic 597	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   948: invokevirtual 1336	org/vidogram/messenger/v:a	(Ljava/lang/Integer;)Lorg/vidogram/tgnet/g$vw;
    //   951: putfield 1717	org/vidogram/ui/c/j:cv	Lorg/vidogram/tgnet/g$vw;
    //   954: aload_0
    //   955: getfield 1717	org/vidogram/ui/c/j:cv	Lorg/vidogram/tgnet/g$vw;
    //   958: ifnonnull +10 -> 968
    //   961: aload_0
    //   962: getfield 1719	org/vidogram/ui/c/j:cx	Lorg/vidogram/tgnet/g$i;
    //   965: ifnull +419 -> 1384
    //   968: aload_0
    //   969: getfield 1719	org/vidogram/ui/c/j:cx	Lorg/vidogram/tgnet/g$i;
    //   972: ifnull +1451 -> 2423
    //   975: aload_0
    //   976: getfield 1717	org/vidogram/ui/c/j:cv	Lorg/vidogram/tgnet/g$vw;
    //   979: ifnull +1430 -> 2409
    //   982: aload_0
    //   983: ldc_w 1726
    //   986: iconst_2
    //   987: anewarray 591	java/lang/Object
    //   990: dup
    //   991: iconst_0
    //   992: aload_0
    //   993: getfield 1719	org/vidogram/ui/c/j:cx	Lorg/vidogram/tgnet/g$i;
    //   996: getfield 1608	org/vidogram/tgnet/g$i:i	Ljava/lang/String;
    //   999: aastore
    //   1000: dup
    //   1001: iconst_1
    //   1002: aload_0
    //   1003: getfield 1717	org/vidogram/ui/c/j:cv	Lorg/vidogram/tgnet/g$vw;
    //   1006: invokestatic 1591	org/vidogram/messenger/ae:c	(Lorg/vidogram/tgnet/g$vw;)Ljava/lang/String;
    //   1009: aastore
    //   1010: invokestatic 601	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   1013: putfield 1599	org/vidogram/ui/c/j:cy	Ljava/lang/String;
    //   1016: aload_0
    //   1017: aload_0
    //   1018: invokespecial 1688	org/vidogram/ui/c/j:getMaxNameWidth	()I
    //   1021: putfield 1721	org/vidogram/ui/c/j:cd	I
    //   1024: getstatic 362	org/vidogram/ui/c/j:bt	Landroid/text/TextPaint;
    //   1027: new 677	java/lang/StringBuilder
    //   1030: dup
    //   1031: invokespecial 678	java/lang/StringBuilder:<init>	()V
    //   1034: ldc_w 1728
    //   1037: ldc_w 1729
    //   1040: invokestatic 656	org/vidogram/messenger/r:a	(Ljava/lang/String;I)Ljava/lang/String;
    //   1043: invokevirtual 682	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1046: ldc_w 684
    //   1049: invokevirtual 682	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1052: invokevirtual 689	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1055: invokevirtual 500	android/text/TextPaint:measureText	(Ljava/lang/String;)F
    //   1058: f2d
    //   1059: invokestatic 506	java/lang/Math:ceil	(D)D
    //   1062: d2i
    //   1063: istore_2
    //   1064: aload_0
    //   1065: getfield 1599	org/vidogram/ui/c/j:cy	Ljava/lang/String;
    //   1068: bipush 10
    //   1070: bipush 32
    //   1072: invokevirtual 549	java/lang/String:replace	(CC)Ljava/lang/String;
    //   1075: getstatic 364	org/vidogram/ui/c/j:bu	Landroid/text/TextPaint;
    //   1078: aload_0
    //   1079: getfield 1721	org/vidogram/ui/c/j:cd	I
    //   1082: iload_2
    //   1083: isub
    //   1084: aload_0
    //   1085: getfield 1682	org/vidogram/ui/c/j:bo	I
    //   1088: isub
    //   1089: i2f
    //   1090: getstatic 555	android/text/TextUtils$TruncateAt:END	Landroid/text/TextUtils$TruncateAt;
    //   1093: invokestatic 561	android/text/TextUtils:ellipsize	(Ljava/lang/CharSequence;Landroid/text/TextPaint;FLandroid/text/TextUtils$TruncateAt;)Ljava/lang/CharSequence;
    //   1096: astore 7
    //   1098: aload 5
    //   1100: ifnull +1344 -> 2444
    //   1103: aload_0
    //   1104: getstatic 362	org/vidogram/ui/c/j:bt	Landroid/text/TextPaint;
    //   1107: new 677	java/lang/StringBuilder
    //   1110: dup
    //   1111: invokespecial 678	java/lang/StringBuilder:<init>	()V
    //   1114: ldc_w 1728
    //   1117: ldc_w 1729
    //   1120: invokestatic 656	org/vidogram/messenger/r:a	(Ljava/lang/String;I)Ljava/lang/String;
    //   1123: invokevirtual 682	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1126: ldc_w 684
    //   1129: invokevirtual 682	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1132: aload 7
    //   1134: invokevirtual 1394	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   1137: invokevirtual 689	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1140: invokevirtual 500	android/text/TextPaint:measureText	(Ljava/lang/String;)F
    //   1143: f2d
    //   1144: invokestatic 506	java/lang/Math:ceil	(D)D
    //   1147: d2i
    //   1148: putfield 1693	org/vidogram/ui/c/j:bp	I
    //   1151: ldc_w 1731
    //   1154: iconst_3
    //   1155: anewarray 591	java/lang/Object
    //   1158: dup
    //   1159: iconst_0
    //   1160: ldc_w 1728
    //   1163: ldc_w 1729
    //   1166: invokestatic 656	org/vidogram/messenger/r:a	(Ljava/lang/String;I)Ljava/lang/String;
    //   1169: aastore
    //   1170: dup
    //   1171: iconst_1
    //   1172: aload 7
    //   1174: aastore
    //   1175: dup
    //   1176: iconst_2
    //   1177: aload 6
    //   1179: aastore
    //   1180: invokestatic 601	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   1183: invokestatic 1680	org/vidogram/messenger/a:b	(Ljava/lang/String;)Landroid/text/SpannableStringBuilder;
    //   1186: astore 5
    //   1188: aload 5
    //   1190: getstatic 362	org/vidogram/ui/c/j:bt	Landroid/text/TextPaint;
    //   1193: aload_0
    //   1194: getfield 1721	org/vidogram/ui/c/j:cd	I
    //   1197: i2f
    //   1198: getstatic 555	android/text/TextUtils$TruncateAt:END	Landroid/text/TextUtils$TruncateAt;
    //   1201: invokestatic 561	android/text/TextUtils:ellipsize	(Ljava/lang/CharSequence;Landroid/text/TextPaint;FLandroid/text/TextUtils$TruncateAt;)Ljava/lang/CharSequence;
    //   1204: astore 5
    //   1206: aload_0
    //   1207: getfield 271	org/vidogram/ui/c/j:cc	[Landroid/text/StaticLayout;
    //   1210: iconst_1
    //   1211: new 269	android/text/StaticLayout
    //   1214: dup
    //   1215: aload 5
    //   1217: getstatic 362	org/vidogram/ui/c/j:bt	Landroid/text/TextPaint;
    //   1220: aload_0
    //   1221: getfield 1721	org/vidogram/ui/c/j:cd	I
    //   1224: fconst_2
    //   1225: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   1228: iadd
    //   1229: getstatic 567	android/text/Layout$Alignment:ALIGN_NORMAL	Landroid/text/Layout$Alignment;
    //   1232: fconst_1
    //   1233: fconst_0
    //   1234: iconst_0
    //   1235: invokespecial 570	android/text/StaticLayout:<init>	(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;FFZ)V
    //   1238: aastore
    //   1239: ldc_w 1733
    //   1242: ldc_w 1734
    //   1245: invokestatic 656	org/vidogram/messenger/r:a	(Ljava/lang/String;I)Ljava/lang/String;
    //   1248: invokestatic 1680	org/vidogram/messenger/a:b	(Ljava/lang/String;)Landroid/text/SpannableStringBuilder;
    //   1251: getstatic 362	org/vidogram/ui/c/j:bt	Landroid/text/TextPaint;
    //   1254: aload_0
    //   1255: getfield 1721	org/vidogram/ui/c/j:cd	I
    //   1258: i2f
    //   1259: getstatic 555	android/text/TextUtils$TruncateAt:END	Landroid/text/TextUtils$TruncateAt;
    //   1262: invokestatic 561	android/text/TextUtils:ellipsize	(Ljava/lang/CharSequence;Landroid/text/TextPaint;FLandroid/text/TextUtils$TruncateAt;)Ljava/lang/CharSequence;
    //   1265: astore 5
    //   1267: aload_0
    //   1268: getfield 271	org/vidogram/ui/c/j:cc	[Landroid/text/StaticLayout;
    //   1271: iconst_0
    //   1272: new 269	android/text/StaticLayout
    //   1275: dup
    //   1276: aload 5
    //   1278: getstatic 362	org/vidogram/ui/c/j:bt	Landroid/text/TextPaint;
    //   1281: aload_0
    //   1282: getfield 1721	org/vidogram/ui/c/j:cd	I
    //   1285: fconst_2
    //   1286: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   1289: iadd
    //   1290: getstatic 567	android/text/Layout$Alignment:ALIGN_NORMAL	Landroid/text/Layout$Alignment;
    //   1293: fconst_1
    //   1294: fconst_0
    //   1295: iconst_0
    //   1296: invokespecial 570	android/text/StaticLayout:<init>	(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;FFZ)V
    //   1299: aastore
    //   1300: aload_0
    //   1301: aload_0
    //   1302: getfield 271	org/vidogram/ui/c/j:cc	[Landroid/text/StaticLayout;
    //   1305: iconst_0
    //   1306: aaload
    //   1307: iconst_0
    //   1308: invokevirtual 672	android/text/StaticLayout:getLineWidth	(I)F
    //   1311: f2d
    //   1312: invokestatic 506	java/lang/Math:ceil	(D)D
    //   1315: d2i
    //   1316: aload_0
    //   1317: getfield 271	org/vidogram/ui/c/j:cc	[Landroid/text/StaticLayout;
    //   1320: iconst_1
    //   1321: aaload
    //   1322: iconst_0
    //   1323: invokevirtual 672	android/text/StaticLayout:getLineWidth	(I)F
    //   1326: f2d
    //   1327: invokestatic 506	java/lang/Math:ceil	(D)D
    //   1330: d2i
    //   1331: invokestatic 675	java/lang/Math:max	(II)I
    //   1334: putfield 1721	org/vidogram/ui/c/j:cd	I
    //   1337: aload_0
    //   1338: getfield 273	org/vidogram/ui/c/j:ch	[F
    //   1341: iconst_0
    //   1342: aload_0
    //   1343: getfield 271	org/vidogram/ui/c/j:cc	[Landroid/text/StaticLayout;
    //   1346: iconst_0
    //   1347: aaload
    //   1348: iconst_0
    //   1349: invokevirtual 579	android/text/StaticLayout:getLineLeft	(I)F
    //   1352: fastore
    //   1353: aload_0
    //   1354: getfield 273	org/vidogram/ui/c/j:ch	[F
    //   1357: iconst_1
    //   1358: aload_0
    //   1359: getfield 271	org/vidogram/ui/c/j:cc	[Landroid/text/StaticLayout;
    //   1362: iconst_1
    //   1363: aaload
    //   1364: iconst_0
    //   1365: invokevirtual 579	android/text/StaticLayout:getLineLeft	(I)F
    //   1368: fastore
    //   1369: aload_0
    //   1370: aload_0
    //   1371: getfield 826	org/vidogram/ui/c/j:cA	I
    //   1374: ldc_w 1626
    //   1377: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   1380: iadd
    //   1381: putfield 826	org/vidogram/ui/c/j:cA	I
    //   1384: aload_1
    //   1385: invokevirtual 1736	org/vidogram/messenger/u:T	()Z
    //   1388: ifeq +519 -> 1907
    //   1391: aload_0
    //   1392: aload_0
    //   1393: getfield 826	org/vidogram/ui/c/j:cA	I
    //   1396: ldc_w 1635
    //   1399: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   1402: iadd
    //   1403: putfield 826	org/vidogram/ui/c/j:cA	I
    //   1406: aload_1
    //   1407: getfield 450	org/vidogram/messenger/u:f	I
    //   1410: ifeq +27 -> 1437
    //   1413: aload_1
    //   1414: getfield 450	org/vidogram/messenger/u:f	I
    //   1417: bipush 13
    //   1419: if_icmpne +1073 -> 2492
    //   1422: aload_0
    //   1423: aload_0
    //   1424: getfield 826	org/vidogram/ui/c/j:cA	I
    //   1427: ldc_w 1635
    //   1430: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   1433: isub
    //   1434: putfield 826	org/vidogram/ui/c/j:cA	I
    //   1437: aload_0
    //   1438: invokespecial 1688	org/vidogram/ui/c/j:getMaxNameWidth	()I
    //   1441: istore_2
    //   1442: aload_1
    //   1443: getfield 450	org/vidogram/messenger/u:f	I
    //   1446: bipush 13
    //   1448: if_icmpeq +1365 -> 2813
    //   1451: iload_2
    //   1452: ldc_w 517
    //   1455: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   1458: isub
    //   1459: istore_2
    //   1460: aconst_null
    //   1461: astore 6
    //   1463: aload_1
    //   1464: getfield 1574	org/vidogram/messenger/u:e	Lorg/vidogram/messenger/u;
    //   1467: ifnull +1337 -> 2804
    //   1470: aload_1
    //   1471: getfield 1574	org/vidogram/messenger/u:e	Lorg/vidogram/messenger/u;
    //   1474: getfield 1738	org/vidogram/messenger/u:n	Ljava/util/ArrayList;
    //   1477: bipush 80
    //   1479: invokestatic 696	org/vidogram/messenger/m:a	(Ljava/util/ArrayList;I)Lorg/vidogram/tgnet/g$az;
    //   1482: astore 5
    //   1484: aload 5
    //   1486: ifnonnull +1315 -> 2801
    //   1489: aload_1
    //   1490: getfield 1574	org/vidogram/messenger/u:e	Lorg/vidogram/messenger/u;
    //   1493: getfield 691	org/vidogram/messenger/u:m	Ljava/util/ArrayList;
    //   1496: bipush 80
    //   1498: invokestatic 696	org/vidogram/messenger/m:a	(Ljava/util/ArrayList;I)Lorg/vidogram/tgnet/g$az;
    //   1501: astore 5
    //   1503: aload 5
    //   1505: ifnull +40 -> 1545
    //   1508: aload_1
    //   1509: getfield 1574	org/vidogram/messenger/u:e	Lorg/vidogram/messenger/u;
    //   1512: getfield 450	org/vidogram/messenger/u:f	I
    //   1515: bipush 13
    //   1517: if_icmpeq +28 -> 1545
    //   1520: aload_1
    //   1521: getfield 450	org/vidogram/messenger/u:f	I
    //   1524: bipush 13
    //   1526: if_icmpne +9 -> 1535
    //   1529: invokestatic 1632	org/vidogram/messenger/a:c	()Z
    //   1532: ifeq +13 -> 1545
    //   1535: aload_1
    //   1536: getfield 1574	org/vidogram/messenger/u:e	Lorg/vidogram/messenger/u;
    //   1539: invokevirtual 1740	org/vidogram/messenger/u:s	()Z
    //   1542: ifeq +968 -> 2510
    //   1545: aload_0
    //   1546: getfield 404	org/vidogram/ui/c/j:bH	Lorg/vidogram/messenger/q;
    //   1549: aconst_null
    //   1550: checkcast 814	android/graphics/drawable/Drawable
    //   1553: invokevirtual 723	org/vidogram/messenger/q:a	(Landroid/graphics/drawable/Drawable;)V
    //   1556: aload_0
    //   1557: iconst_0
    //   1558: putfield 1742	org/vidogram/ui/c/j:bO	Z
    //   1561: aconst_null
    //   1562: astore 5
    //   1564: aload_1
    //   1565: getfield 1574	org/vidogram/messenger/u:e	Lorg/vidogram/messenger/u;
    //   1568: invokevirtual 1338	org/vidogram/messenger/u:l	()Z
    //   1571: ifeq +983 -> 2554
    //   1574: invokestatic 1333	org/vidogram/messenger/v:a	()Lorg/vidogram/messenger/v;
    //   1577: aload_1
    //   1578: getfield 1574	org/vidogram/messenger/u:e	Lorg/vidogram/messenger/u;
    //   1581: getfield 453	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   1584: getfield 1327	org/vidogram/tgnet/g$ar:c	I
    //   1587: invokestatic 597	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1590: invokevirtual 1336	org/vidogram/messenger/v:a	(Ljava/lang/Integer;)Lorg/vidogram/tgnet/g$vw;
    //   1593: astore 7
    //   1595: aload 7
    //   1597: ifnull +10 -> 1607
    //   1600: aload 7
    //   1602: invokestatic 1591	org/vidogram/messenger/ae:c	(Lorg/vidogram/tgnet/g$vw;)Ljava/lang/String;
    //   1605: astore 5
    //   1607: aload 5
    //   1609: ifnull +1186 -> 2795
    //   1612: aload 5
    //   1614: bipush 10
    //   1616: bipush 32
    //   1618: invokevirtual 549	java/lang/String:replace	(CC)Ljava/lang/String;
    //   1621: getstatic 364	org/vidogram/ui/c/j:bu	Landroid/text/TextPaint;
    //   1624: iload_2
    //   1625: i2f
    //   1626: getstatic 555	android/text/TextUtils$TruncateAt:END	Landroid/text/TextUtils$TruncateAt;
    //   1629: invokestatic 561	android/text/TextUtils:ellipsize	(Ljava/lang/CharSequence;Landroid/text/TextPaint;FLandroid/text/TextUtils$TruncateAt;)Ljava/lang/CharSequence;
    //   1632: astore 5
    //   1634: aload_1
    //   1635: getfield 1574	org/vidogram/messenger/u:e	Lorg/vidogram/messenger/u;
    //   1638: getfield 453	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   1641: getfield 458	org/vidogram/tgnet/g$ar:j	Lorg/vidogram/tgnet/g$au;
    //   1644: instanceof 1518
    //   1647: ifeq +996 -> 2643
    //   1650: aload_1
    //   1651: getfield 1574	org/vidogram/messenger/u:e	Lorg/vidogram/messenger/u;
    //   1654: getfield 453	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   1657: getfield 458	org/vidogram/tgnet/g$ar:j	Lorg/vidogram/tgnet/g$au;
    //   1660: getfield 1745	org/vidogram/tgnet/g$au:m	Lorg/vidogram/tgnet/g$jb;
    //   1663: getfield 1748	org/vidogram/tgnet/g$jb:g	Ljava/lang/String;
    //   1666: getstatic 366	org/vidogram/ui/c/j:bv	Landroid/text/TextPaint;
    //   1669: invokevirtual 1752	android/text/TextPaint:getFontMetricsInt	()Landroid/graphics/Paint$FontMetricsInt;
    //   1672: ldc_w 387
    //   1675: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   1678: iconst_0
    //   1679: invokestatic 1757	org/vidogram/messenger/j:a	(Ljava/lang/CharSequence;Landroid/graphics/Paint$FontMetricsInt;IZ)Ljava/lang/CharSequence;
    //   1682: getstatic 366	org/vidogram/ui/c/j:bv	Landroid/text/TextPaint;
    //   1685: iload_2
    //   1686: i2f
    //   1687: getstatic 555	android/text/TextUtils$TruncateAt:END	Landroid/text/TextUtils$TruncateAt;
    //   1690: invokestatic 561	android/text/TextUtils:ellipsize	(Ljava/lang/CharSequence;Landroid/text/TextPaint;FLandroid/text/TextUtils$TruncateAt;)Ljava/lang/CharSequence;
    //   1693: astore 6
    //   1695: aload 5
    //   1697: astore_1
    //   1698: aload 6
    //   1700: astore 5
    //   1702: aload_1
    //   1703: astore 6
    //   1705: aload_1
    //   1706: ifnonnull +14 -> 1720
    //   1709: ldc_w 1759
    //   1712: ldc_w 1760
    //   1715: invokestatic 656	org/vidogram/messenger/r:a	(Ljava/lang/String;I)Ljava/lang/String;
    //   1718: astore 6
    //   1720: aload_0
    //   1721: new 269	android/text/StaticLayout
    //   1724: dup
    //   1725: aload 6
    //   1727: getstatic 364	org/vidogram/ui/c/j:bu	Landroid/text/TextPaint;
    //   1730: ldc_w 926
    //   1733: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   1736: iload_2
    //   1737: iadd
    //   1738: getstatic 567	android/text/Layout$Alignment:ALIGN_NORMAL	Landroid/text/Layout$Alignment;
    //   1741: fconst_1
    //   1742: fconst_0
    //   1743: iconst_0
    //   1744: invokespecial 570	android/text/StaticLayout:<init>	(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;FFZ)V
    //   1747: putfield 1762	org/vidogram/ui/c/j:bF	Landroid/text/StaticLayout;
    //   1750: aload_0
    //   1751: getfield 1762	org/vidogram/ui/c/j:bF	Landroid/text/StaticLayout;
    //   1754: invokevirtual 575	android/text/StaticLayout:getLineCount	()I
    //   1757: ifle +55 -> 1812
    //   1760: aload_0
    //   1761: getfield 1762	org/vidogram/ui/c/j:bF	Landroid/text/StaticLayout;
    //   1764: iconst_0
    //   1765: invokevirtual 672	android/text/StaticLayout:getLineWidth	(I)F
    //   1768: f2d
    //   1769: invokestatic 506	java/lang/Math:ceil	(D)D
    //   1772: d2i
    //   1773: istore 4
    //   1775: aload_0
    //   1776: getfield 1742	org/vidogram/ui/c/j:bO	Z
    //   1779: ifeq +974 -> 2753
    //   1782: bipush 44
    //   1784: istore_3
    //   1785: aload_0
    //   1786: iload_3
    //   1787: bipush 12
    //   1789: iadd
    //   1790: i2f
    //   1791: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   1794: iload 4
    //   1796: iadd
    //   1797: putfield 1764	org/vidogram/ui/c/j:bK	I
    //   1800: aload_0
    //   1801: aload_0
    //   1802: getfield 1762	org/vidogram/ui/c/j:bF	Landroid/text/StaticLayout;
    //   1805: iconst_0
    //   1806: invokevirtual 579	android/text/StaticLayout:getLineLeft	(I)F
    //   1809: putfield 1766	org/vidogram/ui/c/j:bL	F
    //   1812: aload 5
    //   1814: ifnull +93 -> 1907
    //   1817: aload_0
    //   1818: new 269	android/text/StaticLayout
    //   1821: dup
    //   1822: aload 5
    //   1824: getstatic 366	org/vidogram/ui/c/j:bv	Landroid/text/TextPaint;
    //   1827: iload_2
    //   1828: ldc_w 926
    //   1831: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   1834: iadd
    //   1835: getstatic 567	android/text/Layout$Alignment:ALIGN_NORMAL	Landroid/text/Layout$Alignment;
    //   1838: fconst_1
    //   1839: fconst_0
    //   1840: iconst_0
    //   1841: invokespecial 570	android/text/StaticLayout:<init>	(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;FFZ)V
    //   1844: putfield 1572	org/vidogram/ui/c/j:bG	Landroid/text/StaticLayout;
    //   1847: aload_0
    //   1848: getfield 1572	org/vidogram/ui/c/j:bG	Landroid/text/StaticLayout;
    //   1851: invokevirtual 575	android/text/StaticLayout:getLineCount	()I
    //   1854: ifle +53 -> 1907
    //   1857: aload_0
    //   1858: getfield 1572	org/vidogram/ui/c/j:bG	Landroid/text/StaticLayout;
    //   1861: iconst_0
    //   1862: invokevirtual 672	android/text/StaticLayout:getLineWidth	(I)F
    //   1865: f2d
    //   1866: invokestatic 506	java/lang/Math:ceil	(D)D
    //   1869: d2i
    //   1870: istore_3
    //   1871: aload_0
    //   1872: getfield 1742	org/vidogram/ui/c/j:bO	Z
    //   1875: ifeq +894 -> 2769
    //   1878: bipush 44
    //   1880: istore_2
    //   1881: aload_0
    //   1882: iload_2
    //   1883: bipush 12
    //   1885: iadd
    //   1886: i2f
    //   1887: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   1890: iload_3
    //   1891: iadd
    //   1892: putfield 1768	org/vidogram/ui/c/j:bM	I
    //   1895: aload_0
    //   1896: aload_0
    //   1897: getfield 1572	org/vidogram/ui/c/j:bG	Landroid/text/StaticLayout;
    //   1900: iconst_0
    //   1901: invokevirtual 579	android/text/StaticLayout:getLineLeft	(I)F
    //   1904: putfield 1770	org/vidogram/ui/c/j:bN	F
    //   1907: aload_0
    //   1908: invokevirtual 1773	org/vidogram/ui/c/j:requestLayout	()V
    //   1911: return
    //   1912: aload_0
    //   1913: getfield 773	org/vidogram/ui/c/j:bn	Lorg/vidogram/messenger/u;
    //   1916: getfield 1775	org/vidogram/messenger/u:p	Z
    //   1919: ifne -1864 -> 55
    //   1922: invokestatic 1333	org/vidogram/messenger/v:a	()Lorg/vidogram/messenger/v;
    //   1925: aload_0
    //   1926: getfield 773	org/vidogram/ui/c/j:bn	Lorg/vidogram/messenger/u;
    //   1929: getfield 453	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   1932: iconst_1
    //   1933: invokevirtual 1662	org/vidogram/messenger/v:a	(Lorg/vidogram/tgnet/g$ar;Z)V
    //   1936: aload_0
    //   1937: getfield 773	org/vidogram/ui/c/j:bn	Lorg/vidogram/messenger/u;
    //   1940: iconst_1
    //   1941: putfield 1775	org/vidogram/messenger/u:p	Z
    //   1944: goto -1889 -> 55
    //   1947: aload_0
    //   1948: getfield 773	org/vidogram/ui/c/j:bn	Lorg/vidogram/messenger/u;
    //   1951: getfield 453	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   1954: getfield 1327	org/vidogram/tgnet/g$ar:c	I
    //   1957: ifge +30 -> 1987
    //   1960: aload_0
    //   1961: invokestatic 1333	org/vidogram/messenger/v:a	()Lorg/vidogram/messenger/v;
    //   1964: aload_0
    //   1965: getfield 773	org/vidogram/ui/c/j:bn	Lorg/vidogram/messenger/u;
    //   1968: getfield 453	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   1971: getfield 1327	org/vidogram/tgnet/g$ar:c	I
    //   1974: ineg
    //   1975: invokestatic 597	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1978: invokevirtual 1523	org/vidogram/messenger/v:b	(Ljava/lang/Integer;)Lorg/vidogram/tgnet/g$i;
    //   1981: putfield 1554	org/vidogram/ui/c/j:cs	Lorg/vidogram/tgnet/g$i;
    //   1984: goto -1896 -> 88
    //   1987: aload_0
    //   1988: getfield 773	org/vidogram/ui/c/j:bn	Lorg/vidogram/messenger/u;
    //   1991: getfield 453	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   1994: getfield 1328	org/vidogram/tgnet/g$ar:v	Z
    //   1997: ifeq -1909 -> 88
    //   2000: aload_0
    //   2001: invokestatic 1333	org/vidogram/messenger/v:a	()Lorg/vidogram/messenger/v;
    //   2004: aload_0
    //   2005: getfield 773	org/vidogram/ui/c/j:bn	Lorg/vidogram/messenger/u;
    //   2008: getfield 453	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   2011: getfield 1061	org/vidogram/tgnet/g$ar:d	Lorg/vidogram/tgnet/g$aw;
    //   2014: getfield 1064	org/vidogram/tgnet/g$aw:b	I
    //   2017: invokestatic 597	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   2020: invokevirtual 1523	org/vidogram/messenger/v:b	(Ljava/lang/Integer;)Lorg/vidogram/tgnet/g$i;
    //   2023: putfield 1554	org/vidogram/ui/c/j:cs	Lorg/vidogram/tgnet/g$i;
    //   2026: goto -1938 -> 88
    //   2029: aload_0
    //   2030: aconst_null
    //   2031: putfield 1576	org/vidogram/ui/c/j:ct	Lorg/vidogram/tgnet/g$x;
    //   2034: goto -1889 -> 145
    //   2037: aload_0
    //   2038: getfield 1554	org/vidogram/ui/c/j:cs	Lorg/vidogram/tgnet/g$i;
    //   2041: ifnull +49 -> 2090
    //   2044: aload_0
    //   2045: getfield 1554	org/vidogram/ui/c/j:cs	Lorg/vidogram/tgnet/g$i;
    //   2048: getfield 1602	org/vidogram/tgnet/g$i:j	Lorg/vidogram/tgnet/g$m;
    //   2051: ifnull +31 -> 2082
    //   2054: aload_0
    //   2055: aload_0
    //   2056: getfield 1554	org/vidogram/ui/c/j:cs	Lorg/vidogram/tgnet/g$i;
    //   2059: getfield 1602	org/vidogram/tgnet/g$i:j	Lorg/vidogram/tgnet/g$m;
    //   2062: getfield 1606	org/vidogram/tgnet/g$m:b	Lorg/vidogram/tgnet/g$x;
    //   2065: putfield 1576	org/vidogram/ui/c/j:ct	Lorg/vidogram/tgnet/g$x;
    //   2068: aload_0
    //   2069: getfield 402	org/vidogram/ui/c/j:bB	Lorg/vidogram/ui/Components/b;
    //   2072: aload_0
    //   2073: getfield 1554	org/vidogram/ui/c/j:cs	Lorg/vidogram/tgnet/g$i;
    //   2076: invokevirtual 1778	org/vidogram/ui/Components/b:a	(Lorg/vidogram/tgnet/g$i;)V
    //   2079: goto -1923 -> 156
    //   2082: aload_0
    //   2083: aconst_null
    //   2084: putfield 1576	org/vidogram/ui/c/j:ct	Lorg/vidogram/tgnet/g$x;
    //   2087: goto -19 -> 2068
    //   2090: aload_0
    //   2091: aconst_null
    //   2092: putfield 1576	org/vidogram/ui/c/j:ct	Lorg/vidogram/tgnet/g$x;
    //   2095: aload_0
    //   2096: getfield 402	org/vidogram/ui/c/j:bB	Lorg/vidogram/ui/Components/b;
    //   2099: aload_1
    //   2100: getfield 453	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   2103: getfield 1327	org/vidogram/tgnet/g$ar:c	I
    //   2106: aconst_null
    //   2107: aconst_null
    //   2108: iconst_0
    //   2109: invokevirtual 1781	org/vidogram/ui/Components/b:a	(ILjava/lang/String;Ljava/lang/String;Z)V
    //   2112: goto -1956 -> 156
    //   2115: aload_1
    //   2116: getfield 453	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   2119: getfield 1341	org/vidogram/tgnet/g$ar:q	Ljava/lang/String;
    //   2122: ifnull +697 -> 2819
    //   2125: aload_1
    //   2126: getfield 453	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   2129: getfield 1341	org/vidogram/tgnet/g$ar:q	Ljava/lang/String;
    //   2132: invokevirtual 648	java/lang/String:length	()I
    //   2135: ifle +684 -> 2819
    //   2138: new 677	java/lang/StringBuilder
    //   2141: dup
    //   2142: invokespecial 678	java/lang/StringBuilder:<init>	()V
    //   2145: ldc_w 1675
    //   2148: invokevirtual 682	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2151: aload_1
    //   2152: getfield 453	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   2155: getfield 1341	org/vidogram/tgnet/g$ar:q	Ljava/lang/String;
    //   2158: invokevirtual 682	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2161: invokevirtual 689	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2164: astore 6
    //   2166: ldc_w 1677
    //   2169: iconst_1
    //   2170: anewarray 591	java/lang/Object
    //   2173: dup
    //   2174: iconst_0
    //   2175: aload 6
    //   2177: aastore
    //   2178: invokestatic 601	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   2181: invokestatic 1680	org/vidogram/messenger/a:b	(Ljava/lang/String;)Landroid/text/SpannableStringBuilder;
    //   2184: astore 5
    //   2186: aload_0
    //   2187: getstatic 364	org/vidogram/ui/c/j:bu	Landroid/text/TextPaint;
    //   2190: aload 5
    //   2192: iconst_0
    //   2193: aload 5
    //   2195: invokeinterface 747 1 0
    //   2200: invokevirtual 1391	android/text/TextPaint:measureText	(Ljava/lang/CharSequence;II)F
    //   2203: f2d
    //   2204: invokestatic 506	java/lang/Math:ceil	(D)D
    //   2207: d2i
    //   2208: putfield 1682	org/vidogram/ui/c/j:bo	I
    //   2211: goto -1854 -> 357
    //   2214: iconst_0
    //   2215: istore_3
    //   2216: goto -1833 -> 383
    //   2219: iconst_0
    //   2220: istore_2
    //   2221: goto -1812 -> 409
    //   2224: aload_0
    //   2225: getfield 1554	org/vidogram/ui/c/j:cs	Lorg/vidogram/tgnet/g$i;
    //   2228: ifnull +17 -> 2245
    //   2231: aload_0
    //   2232: aload_0
    //   2233: getfield 1554	org/vidogram/ui/c/j:cs	Lorg/vidogram/tgnet/g$i;
    //   2236: getfield 1608	org/vidogram/tgnet/g$i:i	Ljava/lang/String;
    //   2239: putfield 1593	org/vidogram/ui/c/j:cu	Ljava/lang/String;
    //   2242: goto -1773 -> 469
    //   2245: aload_0
    //   2246: ldc_w 1783
    //   2249: putfield 1593	org/vidogram/ui/c/j:cu	Ljava/lang/String;
    //   2252: goto -1783 -> 469
    //   2255: aload_0
    //   2256: ldc_w 1785
    //   2259: putfield 1593	org/vidogram/ui/c/j:cu	Ljava/lang/String;
    //   2262: goto -1793 -> 469
    //   2265: iconst_0
    //   2266: istore_3
    //   2267: goto -1765 -> 502
    //   2270: aload_0
    //   2271: getfield 773	org/vidogram/ui/c/j:bn	Lorg/vidogram/messenger/u;
    //   2274: invokevirtual 524	org/vidogram/messenger/u:k	()Z
    //   2277: ifeq +10 -> 2287
    //   2280: ldc_w 853
    //   2283: istore_2
    //   2284: goto -1700 -> 584
    //   2287: ldc_w 905
    //   2290: istore_2
    //   2291: goto -1707 -> 584
    //   2294: new 726	android/text/SpannableStringBuilder
    //   2297: dup
    //   2298: ldc_w 1787
    //   2301: iconst_1
    //   2302: anewarray 591	java/lang/Object
    //   2305: dup
    //   2306: iconst_0
    //   2307: aload 6
    //   2309: aastore
    //   2310: invokestatic 601	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   2313: invokespecial 729	android/text/SpannableStringBuilder:<init>	(Ljava/lang/CharSequence;)V
    //   2316: astore 7
    //   2318: aload 7
    //   2320: new 1697	org/vidogram/ui/Components/bo
    //   2323: dup
    //   2324: getstatic 1703	android/graphics/Typeface:DEFAULT	Landroid/graphics/Typeface;
    //   2327: iconst_0
    //   2328: iload_2
    //   2329: invokespecial 1706	org/vidogram/ui/Components/bo:<init>	(Landroid/graphics/Typeface;II)V
    //   2332: iconst_0
    //   2333: iconst_4
    //   2334: bipush 33
    //   2336: invokevirtual 1710	android/text/SpannableStringBuilder:setSpan	(Ljava/lang/Object;III)V
    //   2339: aload 7
    //   2341: new 1697	org/vidogram/ui/Components/bo
    //   2344: dup
    //   2345: ldc_w 286
    //   2348: invokestatic 291	org/vidogram/messenger/a:a	(Ljava/lang/String;)Landroid/graphics/Typeface;
    //   2351: iconst_0
    //   2352: iload_2
    //   2353: invokespecial 1706	org/vidogram/ui/Components/bo:<init>	(Landroid/graphics/Typeface;II)V
    //   2356: iconst_4
    //   2357: aload 7
    //   2359: invokevirtual 1711	android/text/SpannableStringBuilder:length	()I
    //   2362: bipush 33
    //   2364: invokevirtual 1710	android/text/SpannableStringBuilder:setSpan	(Ljava/lang/Object;III)V
    //   2367: goto -1667 -> 700
    //   2370: aload_0
    //   2371: iconst_0
    //   2372: putfield 1690	org/vidogram/ui/c/j:bW	I
    //   2375: goto -1556 -> 819
    //   2378: astore 7
    //   2380: ldc_w 713
    //   2383: aload 7
    //   2385: invokestatic 718	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   2388: goto -1569 -> 819
    //   2391: aload_0
    //   2392: aconst_null
    //   2393: putfield 1593	org/vidogram/ui/c/j:cu	Ljava/lang/String;
    //   2396: aload_0
    //   2397: aconst_null
    //   2398: putfield 1713	org/vidogram/ui/c/j:bV	Landroid/text/StaticLayout;
    //   2401: aload_0
    //   2402: iconst_0
    //   2403: putfield 1690	org/vidogram/ui/c/j:bW	I
    //   2406: goto -1572 -> 834
    //   2409: aload_0
    //   2410: aload_0
    //   2411: getfield 1719	org/vidogram/ui/c/j:cx	Lorg/vidogram/tgnet/g$i;
    //   2414: getfield 1608	org/vidogram/tgnet/g$i:i	Ljava/lang/String;
    //   2417: putfield 1599	org/vidogram/ui/c/j:cy	Ljava/lang/String;
    //   2420: goto -1404 -> 1016
    //   2423: aload_0
    //   2424: getfield 1717	org/vidogram/ui/c/j:cv	Lorg/vidogram/tgnet/g$vw;
    //   2427: ifnull -1411 -> 1016
    //   2430: aload_0
    //   2431: aload_0
    //   2432: getfield 1717	org/vidogram/ui/c/j:cv	Lorg/vidogram/tgnet/g$vw;
    //   2435: invokestatic 1591	org/vidogram/messenger/ae:c	(Lorg/vidogram/tgnet/g$vw;)Ljava/lang/String;
    //   2438: putfield 1599	org/vidogram/ui/c/j:cy	Ljava/lang/String;
    //   2441: goto -1425 -> 1016
    //   2444: ldc_w 1789
    //   2447: iconst_2
    //   2448: anewarray 591	java/lang/Object
    //   2451: dup
    //   2452: iconst_0
    //   2453: ldc_w 1728
    //   2456: ldc_w 1729
    //   2459: invokestatic 656	org/vidogram/messenger/r:a	(Ljava/lang/String;I)Ljava/lang/String;
    //   2462: aastore
    //   2463: dup
    //   2464: iconst_1
    //   2465: aload 7
    //   2467: aastore
    //   2468: invokestatic 601	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   2471: invokestatic 1680	org/vidogram/messenger/a:b	(Ljava/lang/String;)Landroid/text/SpannableStringBuilder;
    //   2474: astore 5
    //   2476: goto -1288 -> 1188
    //   2479: astore 5
    //   2481: ldc_w 713
    //   2484: aload 5
    //   2486: invokestatic 718	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   2489: goto -1105 -> 1384
    //   2492: aload_0
    //   2493: aload_0
    //   2494: getfield 826	org/vidogram/ui/c/j:cA	I
    //   2497: ldc_w 1018
    //   2500: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   2503: iadd
    //   2504: putfield 826	org/vidogram/ui/c/j:cA	I
    //   2507: goto -1070 -> 1437
    //   2510: aload_0
    //   2511: aload 5
    //   2513: getfield 635	org/vidogram/tgnet/g$az:c	Lorg/vidogram/tgnet/g$x;
    //   2516: putfield 1583	org/vidogram/ui/c/j:bQ	Lorg/vidogram/tgnet/g$x;
    //   2519: aload_0
    //   2520: getfield 404	org/vidogram/ui/c/j:bH	Lorg/vidogram/messenger/q;
    //   2523: aload 5
    //   2525: getfield 635	org/vidogram/tgnet/g$az:c	Lorg/vidogram/tgnet/g$x;
    //   2528: ldc_w 1669
    //   2531: aconst_null
    //   2532: aconst_null
    //   2533: iconst_1
    //   2534: invokevirtual 1672	org/vidogram/messenger/q:a	(Lorg/vidogram/tgnet/f;Ljava/lang/String;Landroid/graphics/drawable/Drawable;Ljava/lang/String;Z)V
    //   2537: aload_0
    //   2538: iconst_1
    //   2539: putfield 1742	org/vidogram/ui/c/j:bO	Z
    //   2542: iload_2
    //   2543: ldc_w 1058
    //   2546: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   2549: isub
    //   2550: istore_2
    //   2551: goto -990 -> 1561
    //   2554: aload_1
    //   2555: getfield 1574	org/vidogram/messenger/u:e	Lorg/vidogram/messenger/u;
    //   2558: getfield 453	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   2561: getfield 1327	org/vidogram/tgnet/g$ar:c	I
    //   2564: ifge +40 -> 2604
    //   2567: invokestatic 1333	org/vidogram/messenger/v:a	()Lorg/vidogram/messenger/v;
    //   2570: aload_1
    //   2571: getfield 1574	org/vidogram/messenger/u:e	Lorg/vidogram/messenger/u;
    //   2574: getfield 453	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   2577: getfield 1327	org/vidogram/tgnet/g$ar:c	I
    //   2580: ineg
    //   2581: invokestatic 597	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   2584: invokevirtual 1523	org/vidogram/messenger/v:b	(Ljava/lang/Integer;)Lorg/vidogram/tgnet/g$i;
    //   2587: astore 7
    //   2589: aload 7
    //   2591: ifnull -984 -> 1607
    //   2594: aload 7
    //   2596: getfield 1608	org/vidogram/tgnet/g$i:i	Ljava/lang/String;
    //   2599: astore 5
    //   2601: goto -994 -> 1607
    //   2604: invokestatic 1333	org/vidogram/messenger/v:a	()Lorg/vidogram/messenger/v;
    //   2607: aload_1
    //   2608: getfield 1574	org/vidogram/messenger/u:e	Lorg/vidogram/messenger/u;
    //   2611: getfield 453	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   2614: getfield 1061	org/vidogram/tgnet/g$ar:d	Lorg/vidogram/tgnet/g$aw;
    //   2617: getfield 1064	org/vidogram/tgnet/g$aw:b	I
    //   2620: invokestatic 597	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   2623: invokevirtual 1523	org/vidogram/messenger/v:b	(Ljava/lang/Integer;)Lorg/vidogram/tgnet/g$i;
    //   2626: astore 7
    //   2628: aload 7
    //   2630: ifnull -1023 -> 1607
    //   2633: aload 7
    //   2635: getfield 1608	org/vidogram/tgnet/g$i:i	Ljava/lang/String;
    //   2638: astore 5
    //   2640: goto -1033 -> 1607
    //   2643: aload_1
    //   2644: getfield 1574	org/vidogram/messenger/u:e	Lorg/vidogram/messenger/u;
    //   2647: getfield 1200	org/vidogram/messenger/u:b	Ljava/lang/CharSequence;
    //   2650: ifnull +135 -> 2785
    //   2653: aload_1
    //   2654: getfield 1574	org/vidogram/messenger/u:e	Lorg/vidogram/messenger/u;
    //   2657: getfield 1200	org/vidogram/messenger/u:b	Ljava/lang/CharSequence;
    //   2660: invokeinterface 747 1 0
    //   2665: ifle +120 -> 2785
    //   2668: aload_1
    //   2669: getfield 1574	org/vidogram/messenger/u:e	Lorg/vidogram/messenger/u;
    //   2672: getfield 1200	org/vidogram/messenger/u:b	Ljava/lang/CharSequence;
    //   2675: invokeinterface 1790 1 0
    //   2680: astore 6
    //   2682: aload 6
    //   2684: astore_1
    //   2685: aload 6
    //   2687: invokevirtual 648	java/lang/String:length	()I
    //   2690: sipush 150
    //   2693: if_icmple +13 -> 2706
    //   2696: aload 6
    //   2698: iconst_0
    //   2699: sipush 150
    //   2702: invokevirtual 1794	java/lang/String:substring	(II)Ljava/lang/String;
    //   2705: astore_1
    //   2706: aload_1
    //   2707: bipush 10
    //   2709: bipush 32
    //   2711: invokevirtual 549	java/lang/String:replace	(CC)Ljava/lang/String;
    //   2714: getstatic 366	org/vidogram/ui/c/j:bv	Landroid/text/TextPaint;
    //   2717: invokevirtual 1752	android/text/TextPaint:getFontMetricsInt	()Landroid/graphics/Paint$FontMetricsInt;
    //   2720: ldc_w 387
    //   2723: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   2726: iconst_0
    //   2727: invokestatic 1757	org/vidogram/messenger/j:a	(Ljava/lang/CharSequence;Landroid/graphics/Paint$FontMetricsInt;IZ)Ljava/lang/CharSequence;
    //   2730: getstatic 366	org/vidogram/ui/c/j:bv	Landroid/text/TextPaint;
    //   2733: iload_2
    //   2734: i2f
    //   2735: getstatic 555	android/text/TextUtils$TruncateAt:END	Landroid/text/TextUtils$TruncateAt;
    //   2738: invokestatic 561	android/text/TextUtils:ellipsize	(Ljava/lang/CharSequence;Landroid/text/TextPaint;FLandroid/text/TextUtils$TruncateAt;)Ljava/lang/CharSequence;
    //   2741: astore 6
    //   2743: aload 5
    //   2745: astore_1
    //   2746: aload 6
    //   2748: astore 5
    //   2750: goto -1048 -> 1702
    //   2753: iconst_0
    //   2754: istore_3
    //   2755: goto -970 -> 1785
    //   2758: astore_1
    //   2759: ldc_w 713
    //   2762: aload_1
    //   2763: invokestatic 718	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   2766: goto -954 -> 1812
    //   2769: iconst_0
    //   2770: istore_2
    //   2771: goto -890 -> 1881
    //   2774: astore_1
    //   2775: ldc_w 713
    //   2778: aload_1
    //   2779: invokestatic 718	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   2782: goto -875 -> 1907
    //   2785: aload 5
    //   2787: astore_1
    //   2788: aload 6
    //   2790: astore 5
    //   2792: goto -1090 -> 1702
    //   2795: aconst_null
    //   2796: astore 5
    //   2798: goto -1164 -> 1634
    //   2801: goto -1298 -> 1503
    //   2804: aconst_null
    //   2805: astore_1
    //   2806: aload 6
    //   2808: astore 5
    //   2810: goto -1108 -> 1702
    //   2813: goto -1353 -> 1460
    //   2816: goto -2098 -> 718
    //   2819: aconst_null
    //   2820: astore 5
    //   2822: aconst_null
    //   2823: astore 6
    //   2825: goto -2468 -> 357
    //
    // Exception table:
    //   from	to	target	type
    //   718	807	2378	java/lang/Exception
    //   807	819	2378	java/lang/Exception
    //   2370	2375	2378	java/lang/Exception
    //   1206	1384	2479	java/lang/Exception
    //   1720	1782	2758	java/lang/Exception
    //   1785	1812	2758	java/lang/Exception
    //   1817	1878	2774	java/lang/Exception
    //   1881	1907	2774	java/lang/Exception
  }

  public void a(float paramFloat)
  {
    if (this.bn == null)
      return;
    this.bn.k = paramFloat;
    MediaController.a().a(this.bn, paramFloat);
  }

  public void a(int paramInt1, int paramInt2)
  {
    int i3 = 0;
    if ((this.bn == null) || (this.bn.z == null))
      return;
    int i5 = paramInt1 - this.c;
    int i1 = 0;
    paramInt1 = 0;
    label34: int i2;
    label80: float f1;
    if ((i1 >= this.bn.z.size()) || (((u.a)this.bn.z.get(i1)).c > i5))
    {
      i2 = -1;
      i1 = -1;
      if (paramInt1 >= this.bn.z.size())
        break label201;
      u.a locala = (u.a)this.bn.z.get(paramInt1);
      f1 = locala.c;
      if (!a(f1, locala.e + f1, i5, i5 + paramInt2))
        break label193;
      i2 = i1;
      if (i1 == -1)
        i2 = paramInt1;
      i3 += 1;
      i1 = paramInt1;
    }
    while (true)
    {
      paramInt1 += 1;
      int i4 = i2;
      i2 = i1;
      i1 = i4;
      break label80;
      paramInt1 = i1;
      i1 += 1;
      break label34;
      label193: if (f1 > i5)
      {
        label201: if ((this.j == i2) && (this.k == i1) && (this.l == i3))
          break;
        this.j = i2;
        this.k = i1;
        this.l = i3;
        invalidate();
        return;
      }
      i4 = i1;
      i1 = i2;
      i2 = i4;
    }
  }

  public void a(String paramString)
  {
    if ((this.t == 3) || (this.t == 5));
    for (boolean bool = true; ; bool = false)
    {
      a(bool);
      return;
    }
  }

  public void a(String paramString, float paramFloat)
  {
    this.n.a(paramFloat, true);
    if ((this.t == 3) || (this.t == 5))
      if (this.V != 4)
        a(false);
    do
      return;
    while (this.V == 1);
    a(false);
  }

  public void a(String paramString, float paramFloat, boolean paramBoolean)
  {
    this.n.a(paramFloat, true);
  }

  public void a(q paramq, boolean paramBoolean1, boolean paramBoolean2)
  {
    if ((this.bn != null) && (paramBoolean1) && (!paramBoolean2) && (!this.bn.s) && (!this.bn.r))
    {
      this.bn.s = true;
      a(true);
    }
  }

  public void a(boolean paramBoolean)
  {
    float f2 = 0.0F;
    float f3 = 0.0F;
    float f1 = 0.0F;
    boolean bool2 = true;
    boolean bool3 = true;
    boolean bool4 = true;
    Object localObject1;
    boolean bool1;
    if (this.bn.f == 1)
    {
      if (this.ah == null)
        return;
      localObject1 = m.b(this.ah);
      bool1 = this.bn.s;
    }
    while (true)
    {
      if (TextUtils.isEmpty((CharSequence)localObject1))
      {
        this.n.a(null, false, false);
        return;
        if ((this.bn.f == 8) || (this.t == 4) || (this.bn.f == 9) || (this.t == 3) || (this.t == 5))
        {
          if (this.bn.r)
          {
            localObject1 = this.bn.a.A;
            bool1 = true;
            continue;
          }
          if ((!this.bn.w()) || (this.t == 3) || (this.t == 5))
          {
            localObject1 = this.bn.f();
            bool1 = this.bn.s;
            continue;
          }
        }
        else
        {
          if (this.t != 0)
          {
            localObject1 = m.b(this.u);
            bool1 = this.bn.s;
            continue;
          }
          if (this.ah != null)
          {
            localObject1 = m.b(this.ah);
            bool1 = this.bn.s;
            continue;
          }
        }
      }
      else
      {
        int i1;
        Object localObject2;
        if ((this.bn.a.B != null) && (this.bn.a.B.containsKey("query_id")))
        {
          i1 = 1;
          if ((this.t != 3) && (this.t != 5))
            break label697;
          if (((!this.bn.j()) || (!this.bn.v())) && ((!this.bn.w()) || (i1 == 0)))
            break label510;
          MediaController.a().a(this.bn.a.A, this.bn, this);
          this.V = 4;
          localObject1 = this.n;
          localObject2 = getDrawableForCurrentState();
          if (i1 != 0)
            break label487;
          bool1 = bool4;
          label384: ((as)localObject1).a((Drawable)localObject2, bool1, paramBoolean);
          if (i1 != 0)
            break label498;
          localObject2 = p.a().a(this.bn.a.A);
          localObject1 = localObject2;
          if (localObject2 == null)
          {
            localObject1 = localObject2;
            if (ac.a().b(this.bn.q()))
              localObject1 = Float.valueOf(1.0F);
          }
          localObject2 = this.n;
          if (localObject1 == null)
            break label493;
          f1 = ((Float)localObject1).floatValue();
          label469: ((as)localObject2).a(f1, false);
        }
        while (true)
        {
          d();
          return;
          i1 = 0;
          break;
          label487: bool1 = false;
          break label384;
          label493: f1 = 0.0F;
          break label469;
          label498: this.n.a(0.0F, false);
          continue;
          label510: if (bool1)
          {
            MediaController.a().a(this);
            bool1 = MediaController.a().d(this.bn);
            if ((!bool1) || ((bool1) && (MediaController.a().s())));
            for (this.V = 0; ; this.V = 1)
            {
              this.n.a(getDrawableForCurrentState(), false, paramBoolean);
              break;
            }
          }
          MediaController.a().a((String)localObject1, this.bn, this);
          if (m.a().a((String)localObject1))
            break label636;
          this.V = 2;
          this.n.a(0.0F, paramBoolean);
          this.n.a(getDrawableForCurrentState(), false, paramBoolean);
        }
        label636: this.V = 4;
        localObject1 = p.a().a((String)localObject1);
        if (localObject1 != null)
          this.n.a(((Float)localObject1).floatValue(), paramBoolean);
        while (true)
        {
          this.n.a(getDrawableForCurrentState(), true, paramBoolean);
          break;
          this.n.a(0.0F, paramBoolean);
        }
        label697: if ((this.bn.f == 0) && (this.t != 1) && (this.t != 4))
        {
          if ((this.ah == null) || (!this.s))
            break;
          if (!bool1)
          {
            MediaController.a().a((String)localObject1, this.bn, this);
            if (!m.a().a((String)localObject1))
              if ((!this.al) && (((this.t == 0) && (MediaController.a().a(1))) || ((this.t == 2) && (MediaController.a().a(32)))))
              {
                this.V = 1;
                bool1 = bool2;
              }
            while (true)
            {
              this.n.a(f1, false);
              this.n.a(getDrawableForCurrentState(), bool1, paramBoolean);
              invalidate();
              return;
              this.V = 0;
              bool1 = false;
              continue;
              this.V = 1;
              localObject1 = p.a().a((String)localObject1);
              bool1 = bool2;
              if (localObject1 == null)
                continue;
              f1 = ((Float)localObject1).floatValue();
              bool1 = bool2;
            }
          }
          MediaController.a().a(this);
          if ((this.t == 2) && (!this.o.H()));
          for (this.V = 2; ; this.V = -1)
          {
            this.n.a(getDrawableForCurrentState(), false, paramBoolean);
            invalidate();
            return;
          }
        }
        if ((this.bn.j()) && (this.bn.v()))
        {
          if ((this.bn.a.A == null) || (this.bn.a.A.length() <= 0))
            break;
          MediaController.a().a(this.bn.a.A, this.bn, this);
          if ((this.bn.a.A == null) || (!this.bn.a.A.startsWith("http")))
          {
            bool1 = true;
            localObject1 = this.bn.a.B;
            if ((this.bn.a.i == null) || (localObject1 == null) || ((!((HashMap)localObject1).containsKey("url")) && (!((HashMap)localObject1).containsKey("bot"))))
              break label1224;
            this.V = -1;
            bool1 = false;
            label1115: this.n.a(getDrawableForCurrentState(), bool1, paramBoolean);
            if (!bool1)
              break label1232;
            localObject2 = p.a().a(this.bn.a.A);
            localObject1 = localObject2;
            if (localObject2 == null)
            {
              localObject1 = localObject2;
              if (ac.a().b(this.bn.q()))
                localObject1 = Float.valueOf(1.0F);
            }
            localObject2 = this.n;
            f1 = f2;
            if (localObject1 != null)
              f1 = ((Float)localObject1).floatValue();
            ((as)localObject2).a(f1, false);
          }
          while (true)
          {
            invalidate();
            return;
            bool1 = false;
            break;
            label1224: this.V = 1;
            break label1115;
            label1232: this.n.a(0.0F, false);
          }
        }
        if ((this.bn.a.A != null) && (this.bn.a.A.length() != 0))
          MediaController.a().a(this);
        if (!bool1)
        {
          MediaController.a().a((String)localObject1, this.bn, this);
          if (!m.a().a((String)localObject1))
            if ((!this.al) && (((this.bn.f == 1) && (MediaController.a().a(1))) || ((this.bn.f == 8) && (MediaController.a().a(32)) && (u.b(this.bn.a.j.k)))))
            {
              this.V = 1;
              f1 = f3;
              bool1 = bool3;
            }
          while (true)
          {
            this.n.a(getDrawableForCurrentState(), bool1, paramBoolean);
            this.n.a(f1, false);
            invalidate();
            return;
            this.V = 0;
            bool1 = false;
            f1 = f3;
            continue;
            this.V = 1;
            localObject1 = p.a().a((String)localObject1);
            bool1 = bool3;
            f1 = f3;
            if (localObject1 == null)
              continue;
            f1 = ((Float)localObject1).floatValue();
            bool1 = bool3;
          }
        }
        MediaController.a().a(this);
        if ((this.bn.f == 8) && (!this.o.H()))
          this.V = 2;
        while (true)
        {
          this.n.a(getDrawableForCurrentState(), false, paramBoolean);
          if (this.ae)
            setMessageObject(this.bn);
          invalidate();
          return;
          if (this.t == 4)
          {
            this.V = 3;
            continue;
          }
          this.V = -1;
        }
      }
      localObject1 = null;
      bool1 = false;
    }
  }

  public void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    this.bf = paramBoolean1;
    this.bc = paramBoolean2;
    this.n.a(getDrawableForCurrentState());
    if (this.aE)
      this.aG.a(i());
    while (true)
    {
      invalidate();
      return;
      this.aF.a(i());
    }
  }

  public void b(String paramString)
  {
    if ((this.t == 3) || (this.t == 5))
    {
      a(true);
      h();
    }
    while (true)
    {
      return;
      this.n.a(1.0F, true);
      if (this.bn.f == 0)
      {
        if ((this.t == 2) && (this.bn.k != 1.0F))
        {
          this.V = 2;
          d(true);
          return;
        }
        if (!this.ae)
        {
          a(true);
          return;
        }
        setMessageObject(this.bn);
        return;
      }
      if ((!this.ae) || ((this.bn.f == 8) && (this.bn.k != 1.0F)))
      {
        if ((this.bn.f != 8) || (this.bn.k == 1.0F))
          break label184;
        this.ae = false;
        this.V = 2;
        d(true);
      }
      while (this.ae)
      {
        setMessageObject(this.bn);
        return;
        label184: a(true);
      }
    }
  }

  protected void c()
  {
    if ((this.ax instanceof URLSpanNoUnderline))
    {
      if (!((URLSpanNoUnderline)this.ax).getURL().startsWith("/"))
        break label77;
      this.cz.a(this.bn, this.ax, true);
    }
    label77: 
    do
    {
      return;
      if ((this.ax instanceof URLSpan))
      {
        this.cz.a(this.bn, this.ax, true);
        return;
      }
      a(-1);
      if ((this.W == 0) && (this.ba == -1))
        continue;
      this.W = 0;
      this.ba = -1;
      invalidate();
    }
    while (this.cz == null);
    this.cz.b(this);
  }

  public void d()
  {
    if ((this.bn == null) || (this.u == null))
      return;
    int i1;
    label69: Object localObject;
    if (this.aE)
    {
      if (!this.aG.b())
        this.aG.a(this.bn.k);
      if (this.t != 3)
        break label262;
      if (MediaController.a().d(this.bn))
        break label251;
      i1 = 0;
      if (i1 >= this.u.o.size())
        break label462;
      localObject = (g.r)this.u.o.get(i1);
      if (!(localObject instanceof g.hu))
        break label244;
      i1 = ((g.r)localObject).d;
    }
    while (true)
    {
      localObject = String.format("%02d:%02d", new Object[] { Integer.valueOf(i1 / 60), Integer.valueOf(i1 % 60) });
      if ((this.aK == null) || ((this.aK != null) && (!this.aK.equals(localObject))))
      {
        this.aK = ((String)localObject);
        this.aL = (int)Math.ceil(aN.measureText((String)localObject));
        this.aJ = new StaticLayout((CharSequence)localObject, aN, this.aL, Layout.Alignment.ALIGN_NORMAL, 1.0F, 0.0F, false);
      }
      invalidate();
      return;
      if (this.aF.a())
        break;
      this.aF.a(this.bn.k);
      break;
      label244: i1 += 1;
      break label69;
      label251: i1 = this.bn.l;
      continue;
      label262: i1 = 0;
      label264: if (i1 < this.u.o.size())
      {
        localObject = (g.r)this.u.o.get(i1);
        if (!(localObject instanceof g.hu));
      }
      for (i1 = ((g.r)localObject).d; ; i1 = 0)
      {
        if (MediaController.a().d(this.bn));
        for (int i2 = this.bn.l; ; i2 = 0)
        {
          localObject = String.format("%d:%02d / %d:%02d", new Object[] { Integer.valueOf(i2 / 60), Integer.valueOf(i2 % 60), Integer.valueOf(i1 / 60), Integer.valueOf(i1 % 60) });
          if ((this.aK != null) && ((this.aK == null) || (this.aK.equals(localObject))))
            break;
          this.aK = ((String)localObject);
          i1 = (int)Math.ceil(aN.measureText((String)localObject));
          this.aJ = new StaticLayout((CharSequence)localObject, aN, i1, Layout.Alignment.ALIGN_NORMAL, 1.0F, 0.0F, false);
          break;
          i1 += 1;
          break label264;
        }
      }
      label462: i1 = 0;
    }
  }

  public void e()
  {
    if ((this.t != 3) || (this.u.h >= 1048576));
    do
      return;
    while (this.V != 2);
    m.a().a(this.u, true, false);
    this.V = 4;
    this.n.a(getDrawableForCurrentState(), false, false);
  }

  public u getMessageObject()
  {
    return this.bn;
  }

  public int getObserverTag()
  {
    return this.bb;
  }

  public q getPhotoImage()
  {
    return this.o;
  }

  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    this.bA.g();
    this.bH.g();
    if (this.v)
    {
      if (this.o.g())
        a(false);
      return;
    }
    a(false);
  }

  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    this.bA.f();
    this.bH.f();
    this.o.f();
    MediaController.a().a(this);
  }

  protected void onDraw(Canvas paramCanvas)
  {
    int i3 = 1;
    int i5 = 0;
    if (this.bn == null);
    label87: Object localObject;
    int i2;
    int i4;
    int i1;
    while (true)
    {
      return;
      if (!this.bg)
      {
        requestLayout();
        return;
      }
      if (this.bh)
        this.bA.a(paramCanvas);
      if (this.be)
      {
        br.setColor(-1);
        if (!this.bn.k())
          break label819;
        if (!i())
          break label770;
        if (this.be)
          break label760;
        this.bl = l.f;
        localObject = this.bl;
        i2 = this.by;
        i4 = this.bx;
        if (this.be)
          break label797;
        i1 = 0;
        label115: i2 = i2 - i4 - i1;
        this.bm = i2;
        i4 = org.vidogram.messenger.a.a(1.0F);
        i6 = this.bx;
        if (!this.be)
          break label808;
        i1 = 0;
        label153: a((Drawable)localObject, i2, i4, i6 - i1, this.bz - org.vidogram.messenger.a.a(2.0F));
        if ((this.bi) && (this.bl != null))
          this.bl.draw(paramCanvas);
        a(paramCanvas);
        if (this.bR)
        {
          Drawable localDrawable = l.B;
          if (!this.bS)
            break label1092;
          localObject = l.Q;
          label228: localDrawable.setColorFilter((ColorFilter)localObject);
          if (!this.bn.k())
            break label1100;
          this.bT = (this.bl.getBounds().left - org.vidogram.messenger.a.a(8.0F) - l.B.getIntrinsicWidth());
          label273: localObject = l.B;
          i1 = this.bT;
          i2 = this.bz - org.vidogram.messenger.a.a(41.0F);
          this.bU = i2;
          a((Drawable)localObject, i1, i2);
          l.B.draw(paramCanvas);
          a(l.C, this.bT + org.vidogram.messenger.a.a(9.0F), this.bU + org.vidogram.messenger.a.a(9.0F));
          l.C.draw(paramCanvas);
        }
        if ((this.cb) && (this.bV != null))
        {
          paramCanvas.save();
          if (this.bn.f != 13)
            break label1149;
          bs.setColor(-1);
          if (!this.bn.k())
            break label1124;
          this.bY = org.vidogram.messenger.a.a(28.0F);
          label415: this.bZ = (this.bz - org.vidogram.messenger.a.a(38.0F));
          l.t.setColorFilter(l.P);
          l.t.setBounds((int)this.bY - org.vidogram.messenger.a.a(12.0F), (int)this.bZ - org.vidogram.messenger.a.a(5.0F), (int)this.bY + org.vidogram.messenger.a.a(12.0F) + this.bW, (int)this.bZ + org.vidogram.messenger.a.a(22.0F));
          l.t.draw(paramCanvas);
          paramCanvas.translate(this.bY, this.bZ);
          this.bV.draw(paramCanvas);
          paramCanvas.restore();
        }
        if ((!this.ce) || (this.cc[0] == null) || (this.cc[1] == null))
          break label1369;
        if (!this.cb)
          break label1299;
        i1 = 19;
        label566: this.cg = org.vidogram.messenger.a.a(i1 + 10);
        if (!this.bn.k())
          break label1305;
        bt.setColor(-11162801);
        this.cf = (this.bl.getBounds().left + org.vidogram.messenger.a.a(11.0F));
      }
      while (true)
      {
        i1 = 0;
        while (i1 < 2)
        {
          paramCanvas.save();
          paramCanvas.translate(this.cf - this.ch[i1], this.cg + org.vidogram.messenger.a.a(16.0F) * i1);
          this.cc[i1].draw(paramCanvas);
          paramCanvas.restore();
          i1 += 1;
        }
        if (this.bn.k())
        {
          localObject = br;
          if (i());
          while (true)
          {
            ((TextPaint)localObject).setColor(-9391780);
            break;
          }
        }
        localObject = br;
        if (i());
        for (i1 = -7752511; ; i1 = -6182221)
        {
          ((TextPaint)localObject).setColor(i1);
          break;
        }
        label760: this.bl = l.j;
        break label87;
        label770: if (!this.be)
        {
          this.bl = l.e;
          break label87;
        }
        this.bl = l.i;
        break label87;
        label797: i1 = org.vidogram.messenger.a.a(9.0F);
        break label115;
        label808: i1 = org.vidogram.messenger.a.a(3.0F);
        break label153;
        label819: if (i())
          if (!this.be)
          {
            this.bl = l.d;
            label840: if ((!this.a) || (!this.bn.l()))
              break label994;
            localObject = this.bl;
            if (this.be)
              break label976;
            i1 = 3;
            label873: i2 = org.vidogram.messenger.a.a(i1 + 48);
            this.bm = i2;
            i4 = org.vidogram.messenger.a.a(1.0F);
            i6 = this.bx;
            if (!this.be)
              break label983;
          }
        label976: label983: for (i1 = 0; ; i1 = org.vidogram.messenger.a.a(3.0F))
        {
          a((Drawable)localObject, i2, i4, i6 - i1, this.bz - org.vidogram.messenger.a.a(2.0F));
          break;
          this.bl = l.h;
          break label840;
          if (!this.be)
          {
            this.bl = l.c;
            break label840;
          }
          this.bl = l.g;
          break label840;
          i1 = 9;
          break label873;
        }
        label994: localObject = this.bl;
        if (!this.be)
        {
          i1 = org.vidogram.messenger.a.a(3.0F);
          label1015: this.bm = i1;
          i4 = org.vidogram.messenger.a.a(1.0F);
          i6 = this.bx;
          if (!this.be)
            break label1081;
        }
        label1081: for (i2 = 0; ; i2 = org.vidogram.messenger.a.a(3.0F))
        {
          a((Drawable)localObject, i1, i4, i6 - i2, this.bz - org.vidogram.messenger.a.a(2.0F));
          break;
          i1 = org.vidogram.messenger.a.a(9.0F);
          break label1015;
        }
        label1092: localObject = l.P;
        break label228;
        label1100: this.bT = (this.bl.getBounds().right + org.vidogram.messenger.a.a(8.0F));
        break label273;
        label1124: this.bY = (this.bl.getBounds().right + org.vidogram.messenger.a.a(22.0F));
        break label415;
        label1149: if ((this.be) || (this.bn.k()))
        {
          this.bY = (this.bl.getBounds().left + org.vidogram.messenger.a.a(11.0F) - this.bX);
          if (this.cr == null)
            break label1260;
          bs.setColor(b.g(this.cr.d));
        }
        while (true)
        {
          label1193: this.bZ = org.vidogram.messenger.a.a(10.0F);
          break;
          this.bY = (this.bl.getBounds().left + org.vidogram.messenger.a.a(17.0F) - this.bX);
          break label1193;
          label1260: if (this.cs != null)
          {
            bs.setColor(b.g(this.cs.h));
            continue;
          }
          bs.setColor(b.g(0));
        }
        label1299: i1 = 0;
        break label566;
        label1305: bt.setColor(-13072697);
        if (this.be)
        {
          this.cf = (this.bl.getBounds().left + org.vidogram.messenger.a.a(11.0F));
          continue;
        }
        this.cf = (this.bl.getBounds().left + org.vidogram.messenger.a.a(17.0F));
      }
      label1369: if (this.bn.T())
      {
        if (this.bn.f != 13)
          break label2361;
        bw.setColor(-1);
        bu.setColor(-1);
        bv.setColor(-1);
        if (!this.bn.k())
          break label2331;
        this.bI = org.vidogram.messenger.a.a(23.0F);
        this.bJ = (this.bz - org.vidogram.messenger.a.a(58.0F));
        if (this.bV != null)
          this.bJ -= org.vidogram.messenger.a.a(31.0F);
        i2 = Math.max(this.bK, this.bM);
        if (!this.bO)
          break label2355;
        i1 = 44;
        i1 = org.vidogram.messenger.a.a(i1 + 14);
        l.t.setColorFilter(l.P);
        l.t.setBounds(this.bI - org.vidogram.messenger.a.a(7.0F), this.bJ - org.vidogram.messenger.a.a(6.0F), i1 + i2 + (this.bI - org.vidogram.messenger.a.a(7.0F)), this.bJ + org.vidogram.messenger.a.a(41.0F));
        l.t.draw(paramCanvas);
        paramCanvas.drawRect(this.bI, this.bJ, this.bI + org.vidogram.messenger.a.a(2.0F), this.bJ + org.vidogram.messenger.a.a(35.0F), bw);
        if (this.bO)
        {
          this.bH.a(this.bI + org.vidogram.messenger.a.a(10.0F), this.bJ, org.vidogram.messenger.a.a(35.0F), org.vidogram.messenger.a.a(35.0F));
          this.bH.a(paramCanvas);
        }
        float f1;
        float f2;
        if (this.bF != null)
        {
          paramCanvas.save();
          f1 = this.bI;
          f2 = this.bL;
          if (!this.bO)
            break label2715;
          i1 = 44;
          paramCanvas.translate(org.vidogram.messenger.a.a(i1 + 10) + (f1 - f2), this.bJ);
          this.bF.draw(paramCanvas);
          paramCanvas.restore();
        }
        if (this.bG != null)
        {
          paramCanvas.save();
          f1 = this.bI;
          f2 = this.bN;
          if (!this.bO)
            break label2721;
          i1 = 44;
          label1768: paramCanvas.translate(org.vidogram.messenger.a.a(i1 + 10) + (f1 - f2), this.bJ + org.vidogram.messenger.a.a(19.0F));
          this.bG.draw(paramCanvas);
          paramCanvas.restore();
        }
      }
      label1432: label1493: if ((!this.cn) && (this.be))
        continue;
      label1699: if (!this.be)
        break label2936;
      if (this.bn.f != 13)
        break label2727;
      localObject = l.v;
      label1848: i2 = this.cl;
      i4 = org.vidogram.messenger.a.a(4.0F);
      int i6 = this.bz;
      int i7 = org.vidogram.messenger.a.a(27.0F);
      int i8 = this.cj;
      if (!this.bn.k())
        break label2735;
      i1 = 20;
      label1896: a((Drawable)localObject, i2 - i4, i6 - i7, i8 + org.vidogram.messenger.a.a(i1 + 8), org.vidogram.messenger.a.a(17.0F));
      ((Drawable)localObject).draw(paramCanvas);
      if ((this.bn.a.k & 0x400) == 0)
        break label3962;
      i2 = (int)(this.cj - this.ci.getLineWidth(0));
      if (!this.bn.v())
        break label2741;
      i1 = i2;
      if (this.bn.k())
        break;
      a(l.q, this.cl + org.vidogram.messenger.a.a(11.0F), this.bz - org.vidogram.messenger.a.a(13.0F) - l.q.getIntrinsicHeight());
      l.q.draw(paramCanvas);
      i1 = i2;
    }
    while (true)
    {
      paramCanvas.save();
      paramCanvas.translate(i1 + this.cl, this.bz - org.vidogram.messenger.a.a(11.3F) - this.ci.getHeight());
      this.ci.draw(paramCanvas);
      paramCanvas.restore();
      label2090: if (this.bn.k())
      {
        if ((int)(this.bn.u() >> 32) != 1)
          break label3379;
        i4 = 1;
        label2118: if (!this.bn.v())
          break label3385;
        i1 = 0;
        i2 = 0;
        label2134: if (i3 != 0)
        {
          if (this.be)
            break label3452;
          a(l.m, this.by - org.vidogram.messenger.a.a(18.5F) - l.m.getIntrinsicWidth(), this.bz - org.vidogram.messenger.a.a(8.5F) - l.m.getIntrinsicHeight());
          l.m.draw(paramCanvas);
        }
        if (i4 == 0)
          break label3558;
        if ((i2 != 0) || (i1 != 0))
        {
          if (this.be)
            break label3505;
          a(l.n, this.by - org.vidogram.messenger.a.a(20.5F) - l.n.getIntrinsicWidth(), this.bz - org.vidogram.messenger.a.a(8.0F) - l.n.getIntrinsicHeight());
          l.n.draw(paramCanvas);
        }
        label2268: if (i5 == 0)
          break label3891;
        if (this.be)
          break label3893;
        a(l.s, this.by - org.vidogram.messenger.a.a(18.0F) - l.s.getIntrinsicWidth(), this.bz - org.vidogram.messenger.a.a(7.0F) - l.s.getIntrinsicHeight());
        l.s.draw(paramCanvas);
        return;
        this.bI = (this.bl.getBounds().right + org.vidogram.messenger.a.a(17.0F));
        break label1432;
        label2355: i1 = 0;
        break label1493;
        label2361: if (this.bn.k())
        {
          bw.setColor(-7812741);
          bu.setColor(-11162801);
          if ((this.bn.e != null) && (this.bn.e.f == 0) && (!(this.bn.e.a.j instanceof g.nz)))
          {
            bv.setColor(-16777216);
            this.bI = (this.bl.getBounds().left + org.vidogram.messenger.a.a(12.0F));
            if ((!this.ce) || (this.cc[0] == null))
              break label2703;
            i1 = 36;
            if ((!this.cb) || (this.bV == null))
              break label2709;
          }
        }
        label2481: for (i2 = 20; ; i2 = 0)
        {
          this.bJ = org.vidogram.messenger.a.a(i2 + (i1 + 12));
          break;
          localObject = bv;
          if (i());
          while (true)
          {
            ((TextPaint)localObject).setColor(-10112933);
            break;
          }
          bw.setColor(-9390872);
          bu.setColor(-12940081);
          if ((this.bn.e != null) && (this.bn.e.f == 0) && (!(this.bn.e.a.j instanceof g.nz)))
          {
            bv.setColor(-16777216);
            if (this.be)
            {
              this.bI = (this.bl.getBounds().left + org.vidogram.messenger.a.a(12.0F));
              break label2461;
            }
          }
          else
          {
            localObject = bv;
            if (i());
            for (i1 = -7752511; ; i1 = -6182221)
            {
              ((TextPaint)localObject).setColor(i1);
              break;
            }
          }
          this.bI = (this.bl.getBounds().left + org.vidogram.messenger.a.a(18.0F));
          break label2461;
          i1 = 0;
          break label2481;
        }
        i1 = 0;
        break label1699;
        i1 = 0;
        break label1768;
        localObject = l.u;
        break label1848;
        label2735: i1 = 0;
        break label1896;
        label2741: if (this.bn.w())
        {
          i1 = i2;
          if (this.bn.k())
            continue;
          a(l.s, this.cl + org.vidogram.messenger.a.a(11.0F), this.bz - org.vidogram.messenger.a.a(12.5F) - l.s.getIntrinsicHeight());
          l.s.draw(paramCanvas);
          i1 = i2;
          continue;
        }
        localObject = l.F;
        a((Drawable)localObject, this.cl, this.bz - org.vidogram.messenger.a.a(9.5F) - this.ci.getHeight());
        ((Drawable)localObject).draw(paramCanvas);
        i1 = i2;
        if (this.co == null)
          continue;
        paramCanvas.save();
        i1 = this.cl;
        paramCanvas.translate(((Drawable)localObject).getIntrinsicWidth() + i1 + org.vidogram.messenger.a.a(3.0F), this.bz - org.vidogram.messenger.a.a(11.3F) - this.ci.getHeight());
        this.co.draw(paramCanvas);
        paramCanvas.restore();
        i1 = i2;
        continue;
        label2936: if ((this.bn.a.k & 0x400) == 0)
          break label3956;
        i1 = (int)(this.cj - this.ci.getLineWidth(0));
        if (!this.bn.v())
          break label3110;
        if (this.bn.k())
          break label3324;
        localObject = l.y;
        if (!i())
          break label3104;
        i2 = 1;
        label3005: localObject = localObject[i2];
        a((Drawable)localObject, this.cl + org.vidogram.messenger.a.a(11.0F), this.bz - org.vidogram.messenger.a.a(8.5F) - ((Drawable)localObject).getIntrinsicHeight());
        ((Drawable)localObject).draw(paramCanvas);
      }
      while (true)
      {
        label2196: label2331: label2461: label2721: label2727: paramCanvas.save();
        label2703: label2709: label2715: paramCanvas.translate(i1 + this.cl, this.bz - org.vidogram.messenger.a.a(6.5F) - this.ci.getHeight());
        this.ci.draw(paramCanvas);
        paramCanvas.restore();
        break label2090;
        break;
        label3104: i2 = 0;
        break label3005;
        label3110: if (this.bn.w())
        {
          if (!this.bn.k())
          {
            a(l.s, this.cl + org.vidogram.messenger.a.a(11.0F), this.bz - org.vidogram.messenger.a.a(6.5F) - l.s.getIntrinsicHeight());
            l.s.draw(paramCanvas);
            continue;
          }
        }
        else
        {
          if (this.bn.k())
            break label3339;
          localObject = l.D;
          if (!i())
            break label3327;
          i2 = 1;
          a(localObject[i2], this.cl, this.bz - org.vidogram.messenger.a.a(4.5F) - this.ci.getHeight());
          localObject = l.D;
          if (!i())
            break label3333;
          i2 = 1;
          label3248: localObject[i2].draw(paramCanvas);
        }
        while (true)
        {
          label3201: if (this.co != null)
          {
            paramCanvas.save();
            paramCanvas.translate(this.cl + l.E.getIntrinsicWidth() + org.vidogram.messenger.a.a(3.0F), this.bz - org.vidogram.messenger.a.a(6.5F) - this.ci.getHeight());
            this.co.draw(paramCanvas);
            paramCanvas.restore();
          }
          label3324: break;
          label3327: i2 = 0;
          break label3201;
          label3333: i2 = 0;
          break label3248;
          label3339: a(l.E, this.cl, this.bz - org.vidogram.messenger.a.a(4.5F) - this.ci.getHeight());
          l.E.draw(paramCanvas);
        }
        label3379: i4 = 0;
        break label2118;
        label3385: if (this.bn.w())
        {
          i1 = 0;
          i2 = 0;
          i3 = 0;
          i5 = 1;
          break label2134;
        }
        if (this.bn.x())
        {
          if (!this.bn.m());
          for (i1 = 1; ; i1 = 0)
          {
            i2 = i1;
            i1 = 1;
            i3 = 0;
            break;
          }
          label3452: a(l.q, this.by - org.vidogram.messenger.a.a(22.0F) - l.q.getIntrinsicWidth(), this.bz - org.vidogram.messenger.a.a(12.5F) - l.q.getIntrinsicHeight());
          l.q.draw(paramCanvas);
          break label2196;
          label3505: a(l.r, this.by - org.vidogram.messenger.a.a(24.0F) - l.r.getIntrinsicWidth(), this.bz - org.vidogram.messenger.a.a(13.0F) - l.r.getIntrinsicHeight());
          l.r.draw(paramCanvas);
          break label2268;
          label3558: if (i1 != 0)
          {
            if (this.be)
              break label3736;
            if (i2 == 0)
              break label3690;
            a(l.k, this.by - org.vidogram.messenger.a.a(22.5F) - l.k.getIntrinsicWidth(), this.bz - org.vidogram.messenger.a.a(8.0F) - l.k.getIntrinsicHeight());
          }
          while (true)
          {
            l.k.draw(paramCanvas);
            label3625: if (i2 == 0)
              break label3792;
            if (this.be)
              break label3840;
            a(l.l, this.by - org.vidogram.messenger.a.a(18.0F) - l.l.getIntrinsicWidth(), this.bz - org.vidogram.messenger.a.a(8.0F) - l.l.getIntrinsicHeight());
            l.l.draw(paramCanvas);
            break;
            label3690: a(l.k, this.by - org.vidogram.messenger.a.a(18.5F) - l.k.getIntrinsicWidth(), this.bz - org.vidogram.messenger.a.a(8.0F) - l.k.getIntrinsicHeight());
          }
          label3736: if (i2 != 0)
            a(l.o, this.by - org.vidogram.messenger.a.a(26.299999F) - l.o.getIntrinsicWidth(), this.bz - org.vidogram.messenger.a.a(12.5F) - l.o.getIntrinsicHeight());
          while (true)
          {
            l.o.draw(paramCanvas);
            break label3625;
            label3792: break;
            a(l.o, this.by - org.vidogram.messenger.a.a(21.5F) - l.o.getIntrinsicWidth(), this.bz - org.vidogram.messenger.a.a(12.5F) - l.o.getIntrinsicHeight());
          }
          label3840: a(l.p, this.by - org.vidogram.messenger.a.a(21.5F) - l.p.getIntrinsicWidth(), this.bz - org.vidogram.messenger.a.a(12.5F) - l.p.getIntrinsicHeight());
          l.p.draw(paramCanvas);
          break label2268;
          label3891: break;
          label3893: a(l.s, this.by - org.vidogram.messenger.a.a(20.5F) - l.s.getIntrinsicWidth(), this.bz - org.vidogram.messenger.a.a(11.5F) - l.s.getIntrinsicHeight());
          l.s.draw(paramCanvas);
          return;
        }
        i3 = 0;
        i1 = 0;
        i2 = 0;
        break label2134;
        label3956: i1 = 0;
      }
      label3962: i1 = 0;
    }
  }

  @SuppressLint({"DrawAllocation"})
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (this.bn == null)
    {
      super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
      return;
    }
    label176: label221: label372: Object localObject;
    if ((paramBoolean) || (!this.bg))
    {
      this.by = getMeasuredWidth();
      this.bz = (getMeasuredHeight() - this.bj);
      if (this.ck < 0)
        this.ck = org.vidogram.messenger.a.a(10.0F);
      this.ci = new StaticLayout(this.cm, br, this.ck + org.vidogram.messenger.a.a(6.0F), Layout.Alignment.ALIGN_NORMAL, 1.0F, 0.0F, false);
      if (this.be)
        break label618;
      if (this.bn.k())
        break label595;
      paramInt2 = this.bx;
      paramInt3 = org.vidogram.messenger.a.a(9.0F);
      paramInt4 = this.cj;
      if ((this.a) && (this.bn.l()))
      {
        paramInt1 = org.vidogram.messenger.a.a(48.0F);
        this.cl = (paramInt1 + (paramInt2 - paramInt3 - paramInt4));
        if ((this.bn.a.k & 0x400) == 0)
          break label715;
        this.co = new StaticLayout(this.cq, br, this.cp, Layout.Alignment.ALIGN_NORMAL, 1.0F, 0.0F, false);
        if (this.bh)
          this.bA.a(org.vidogram.messenger.a.a(6.0F), this.bz - org.vidogram.messenger.a.a(44.0F), org.vidogram.messenger.a.a(42.0F), org.vidogram.messenger.a.a(42.0F));
        this.bg = true;
      }
    }
    else
    {
      if (this.bn.f == 0)
        this.c = (org.vidogram.messenger.a.a(10.0F) + this.cA);
      if (this.t != 3)
        break label816;
      if (!this.bn.k())
        break label723;
      this.aH = (this.by - this.bx + org.vidogram.messenger.a.a(57.0F));
      this.T = (this.by - this.bx + org.vidogram.messenger.a.a(14.0F));
      this.aM = (this.by - this.bx + org.vidogram.messenger.a.a(67.0F));
      if (this.w)
      {
        this.aH += org.vidogram.messenger.a.a(10.0F);
        this.T += org.vidogram.messenger.a.a(10.0F);
        this.aM += org.vidogram.messenger.a.a(10.0F);
      }
      localObject = this.aG;
      paramInt2 = this.bx;
      if (!this.w)
        break label806;
      paramInt1 = 10;
      label445: ((bb)localObject).a(paramInt2 - org.vidogram.messenger.a.a(paramInt1 + 92), org.vidogram.messenger.a.a(30.0F));
      localObject = this.aF;
      paramInt2 = this.bx;
      if (!this.w)
        break label811;
    }
    label806: label811: for (paramInt1 = 10; ; paramInt1 = 0)
    {
      ((ba)localObject).a(paramInt2 - org.vidogram.messenger.a.a(paramInt1 + 72), org.vidogram.messenger.a.a(30.0F));
      this.aI = (org.vidogram.messenger.a.a(13.0F) + this.cA + this.z);
      this.U = (org.vidogram.messenger.a.a(13.0F) + this.cA + this.z);
      this.n.a(this.T, this.U, this.T + org.vidogram.messenger.a.a(44.0F), this.U + org.vidogram.messenger.a.a(44.0F));
      d();
      return;
      paramInt1 = 0;
      break;
      label595: this.cl = (this.by - this.cj - org.vidogram.messenger.a.a(38.5F));
      break label176;
      label618: if (!this.bn.k())
      {
        paramInt2 = this.bx;
        paramInt3 = org.vidogram.messenger.a.a(4.0F);
        paramInt4 = this.cj;
        if ((this.a) && (this.bn.l()));
        for (paramInt1 = org.vidogram.messenger.a.a(48.0F); ; paramInt1 = 0)
        {
          this.cl = (paramInt1 + (paramInt2 - paramInt3 - paramInt4));
          break;
        }
      }
      this.cl = (this.by - this.cj - org.vidogram.messenger.a.a(42.0F));
      break label176;
      label715: this.co = null;
      break label221;
      label723: if ((this.a) && (this.bn.l()))
      {
        this.aH = org.vidogram.messenger.a.a(114.0F);
        this.T = org.vidogram.messenger.a.a(71.0F);
        this.aM = org.vidogram.messenger.a.a(124.0F);
        break label372;
      }
      this.aH = org.vidogram.messenger.a.a(66.0F);
      this.T = org.vidogram.messenger.a.a(23.0F);
      this.aM = org.vidogram.messenger.a.a(76.0F);
      break label372;
      paramInt1 = 0;
      break label445;
    }
    label816: if (this.t == 5)
    {
      if (this.bn.k())
      {
        this.aH = (this.by - this.bx + org.vidogram.messenger.a.a(56.0F));
        this.T = (this.by - this.bx + org.vidogram.messenger.a.a(14.0F));
        this.aM = (this.by - this.bx + org.vidogram.messenger.a.a(67.0F));
        if (this.w)
        {
          this.aH += org.vidogram.messenger.a.a(10.0F);
          this.T += org.vidogram.messenger.a.a(10.0F);
          this.aM += org.vidogram.messenger.a.a(10.0F);
        }
        localObject = this.aF;
        paramInt2 = this.bx;
        if (!this.w)
          break label1153;
      }
      for (paramInt1 = 10; ; paramInt1 = 0)
      {
        ((ba)localObject).a(paramInt2 - org.vidogram.messenger.a.a(paramInt1 + 65), org.vidogram.messenger.a.a(30.0F));
        this.aI = (org.vidogram.messenger.a.a(29.0F) + this.cA + this.z);
        this.U = (org.vidogram.messenger.a.a(13.0F) + this.cA + this.z);
        this.n.a(this.T, this.U, this.T + org.vidogram.messenger.a.a(44.0F), this.U + org.vidogram.messenger.a.a(44.0F));
        d();
        return;
        if ((this.a) && (this.bn.l()))
        {
          this.aH = org.vidogram.messenger.a.a(113.0F);
          this.T = org.vidogram.messenger.a.a(71.0F);
          this.aM = org.vidogram.messenger.a.a(124.0F);
          break;
        }
        this.aH = org.vidogram.messenger.a.a(65.0F);
        this.T = org.vidogram.messenger.a.a(23.0F);
        this.aM = org.vidogram.messenger.a.a(76.0F);
        break;
      }
    }
    label1153: if ((this.t == 1) && (!this.v))
    {
      if (this.bn.k())
        this.T = (this.by - this.bx + org.vidogram.messenger.a.a(14.0F));
      while (true)
      {
        if (this.w)
          this.T += org.vidogram.messenger.a.a(10.0F);
        this.U = (org.vidogram.messenger.a.a(13.0F) + this.cA + this.z);
        this.n.a(this.T, this.U, this.T + org.vidogram.messenger.a.a(44.0F), this.U + org.vidogram.messenger.a.a(44.0F));
        this.o.a(this.T - org.vidogram.messenger.a.a(10.0F), this.U - org.vidogram.messenger.a.a(10.0F), this.o.p(), this.o.q());
        return;
        if ((this.a) && (this.bn.l()))
        {
          this.T = org.vidogram.messenger.a.a(71.0F);
          continue;
        }
        this.T = org.vidogram.messenger.a.a(23.0F);
      }
    }
    if (this.bn.f == 12)
    {
      if (this.bn.k())
        paramInt1 = this.by - this.bx + org.vidogram.messenger.a.a(14.0F);
      while (true)
      {
        this.o.a(paramInt1, org.vidogram.messenger.a.a(13.0F) + this.cA, org.vidogram.messenger.a.a(44.0F), org.vidogram.messenger.a.a(44.0F));
        return;
        if ((this.a) && (this.bn.l()))
        {
          paramInt1 = org.vidogram.messenger.a.a(72.0F);
          continue;
        }
        paramInt1 = org.vidogram.messenger.a.a(23.0F);
      }
    }
    if (this.bn.k())
      if (this.be)
        paramInt1 = this.by - this.bx - org.vidogram.messenger.a.a(3.0F);
    while (true)
    {
      this.o.a(paramInt1, this.o.o(), this.o.p(), this.o.q());
      this.T = (int)(paramInt1 + (this.o.p() - org.vidogram.messenger.a.a(48.0F)) / 2.0F);
      this.U = ((int)(org.vidogram.messenger.a.a(7.0F) + (this.o.q() - org.vidogram.messenger.a.a(48.0F)) / 2.0F) + this.cA);
      this.n.a(this.T, this.U, this.T + org.vidogram.messenger.a.a(48.0F), this.U + org.vidogram.messenger.a.a(48.0F));
      this.af.set(this.T + org.vidogram.messenger.a.a(3.0F), this.U + org.vidogram.messenger.a.a(3.0F), this.T + org.vidogram.messenger.a.a(45.0F), this.U + org.vidogram.messenger.a.a(45.0F));
      return;
      paramInt1 = this.by - this.bx + org.vidogram.messenger.a.a(6.0F);
      continue;
      if ((this.a) && (this.bn.l()))
      {
        paramInt1 = org.vidogram.messenger.a.a(63.0F);
        continue;
      }
      paramInt1 = org.vidogram.messenger.a.a(15.0F);
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    if ((this.bn != null) && (this.bn.e()))
    {
      this.h = true;
      u localu = this.bn;
      this.bn = null;
      setMessageObject(localu);
      this.h = false;
    }
    setMeasuredDimension(View.MeasureSpec.getSize(paramInt1), this.d + this.e);
  }

  public void onProvideStructure(ViewStructure paramViewStructure)
  {
    super.onProvideStructure(paramViewStructure);
    if ((this.bk) && (Build.VERSION.SDK_INT >= 23))
    {
      if ((this.bn.b == null) || (this.bn.b.length() <= 0))
        break label57;
      paramViewStructure.setText(this.bn.b);
    }
    label57: 
    do
      return;
    while ((this.bn.d == null) || (this.bn.d.length() <= 0));
    paramViewStructure.setText(this.bn.d);
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool3;
    if ((this.bn == null) || (!this.cz.a()))
      bool3 = super.onTouchEvent(paramMotionEvent);
    boolean bool2;
    float f1;
    float f2;
    do
    {
      while (true)
      {
        return bool3;
        this.q = false;
        bool2 = a(paramMotionEvent);
        boolean bool1 = bool2;
        if (!bool2)
          bool1 = e(paramMotionEvent);
        bool2 = bool1;
        if (!bool1)
          bool2 = d(paramMotionEvent);
        bool1 = bool2;
        if (!bool2)
          bool1 = c(paramMotionEvent);
        bool2 = bool1;
        if (!bool1)
          bool2 = b(paramMotionEvent);
        bool1 = bool2;
        if (!bool2)
          bool1 = g(paramMotionEvent);
        bool2 = bool1;
        if (!bool1)
          bool2 = f(paramMotionEvent);
        bool1 = bool2;
        if (!bool2)
          bool1 = h(paramMotionEvent);
        bool2 = bool1;
        if (paramMotionEvent.getAction() == 3)
        {
          this.W = 0;
          this.ba = -1;
          this.az = false;
          this.ad = false;
          this.ac = false;
          a(-1);
          bool2 = false;
        }
        if ((!this.q) && (bool2) && (paramMotionEvent.getAction() == 0))
          a();
        if ((paramMotionEvent.getAction() != 0) && (paramMotionEvent.getAction() != 2))
          b();
        bool3 = bool2;
        if (bool2)
          continue;
        f1 = paramMotionEvent.getX();
        f2 = paramMotionEvent.getY();
        if (paramMotionEvent.getAction() == 0)
        {
          if (this.cz != null)
          {
            bool3 = bool2;
            if (!this.cz.a())
              continue;
          }
          if ((this.bh) && (this.bA.a(f1, f2)))
          {
            this.bC = true;
            bool1 = true;
          }
          while (true)
          {
            bool3 = bool1;
            if (!bool1)
              break;
            a();
            return bool1;
            if ((this.ce) && (this.cc[0] != null) && (f1 >= this.cf) && (f1 <= this.cf + this.cd) && (f2 >= this.cg) && (f2 <= this.cg + org.vidogram.messenger.a.a(32.0F)))
            {
              if ((this.bo != 0) && (f1 >= this.cf + this.bp + org.vidogram.messenger.a.a(4.0F)))
                this.bE = true;
              while (true)
              {
                bool1 = true;
                break;
                this.bD = true;
              }
            }
            if ((this.cb) && (this.bV != null) && (this.bo != 0) && (f1 >= this.bY + this.bp) && (f1 <= this.bY + this.bp + this.bo) && (f2 >= this.bZ - org.vidogram.messenger.a.a(4.0F)) && (f2 <= this.bZ + org.vidogram.messenger.a.a(20.0F)))
            {
              this.bE = true;
              bool1 = true;
              continue;
            }
            if ((this.bn.T()) && (f1 >= this.bI) && (f1 <= this.bI + Math.max(this.bK, this.bM)) && (f2 >= this.bJ) && (f2 <= this.bJ + org.vidogram.messenger.a.a(35.0F)))
            {
              this.bP = true;
              bool1 = true;
              continue;
            }
            bool1 = bool2;
            if (!this.bR)
              continue;
            bool1 = bool2;
            if (f1 < this.bT)
              continue;
            bool1 = bool2;
            if (f1 > this.bT + org.vidogram.messenger.a.a(40.0F))
              continue;
            bool1 = bool2;
            if (f2 < this.bU)
              continue;
            bool1 = bool2;
            if (f2 > this.bU + org.vidogram.messenger.a.a(32.0F))
              continue;
            this.bS = true;
            invalidate();
            bool1 = true;
          }
        }
        if (paramMotionEvent.getAction() != 2)
          b();
        if (this.bC)
        {
          if (paramMotionEvent.getAction() == 1)
          {
            this.bC = false;
            playSoundEffect(0);
            bool3 = bool2;
            if (this.cz == null)
              continue;
            if (this.cr != null)
            {
              this.cz.a(this, this.cr);
              return bool2;
            }
            bool3 = bool2;
            if (this.cs == null)
              continue;
            this.cz.a(this, this.cs, 0);
            return bool2;
          }
          if (paramMotionEvent.getAction() == 3)
          {
            this.bC = false;
            return bool2;
          }
          bool3 = bool2;
          if (paramMotionEvent.getAction() != 2)
            continue;
          bool3 = bool2;
          if (!this.bh)
            continue;
          bool3 = bool2;
          if (this.bA.a(f1, f2))
            continue;
          this.bC = false;
          return bool2;
        }
        if (this.bD)
        {
          if (paramMotionEvent.getAction() == 1)
          {
            this.bD = false;
            playSoundEffect(0);
            bool3 = bool2;
            if (this.cz == null)
              continue;
            if (this.cx != null)
            {
              this.cz.a(this, this.cx, this.bn.a.w.g);
              return bool2;
            }
            bool3 = bool2;
            if (this.cv == null)
              continue;
            this.cz.a(this, this.cv);
            return bool2;
          }
          if (paramMotionEvent.getAction() == 3)
          {
            this.bD = false;
            return bool2;
          }
          bool3 = bool2;
          if (paramMotionEvent.getAction() != 2)
            continue;
          if ((f1 >= this.cf) && (f1 <= this.cf + this.cd) && (f2 >= this.cg))
          {
            bool3 = bool2;
            if (f2 <= this.cg + org.vidogram.messenger.a.a(32.0F))
              continue;
          }
          this.bD = false;
          return bool2;
        }
        if (this.bE)
        {
          if (paramMotionEvent.getAction() == 1)
          {
            this.bE = false;
            playSoundEffect(0);
            bool3 = bool2;
            if (this.cz == null)
              continue;
            b localb = this.cz;
            if (this.cw != null);
            for (paramMotionEvent = this.cw.g; ; paramMotionEvent = this.bn.a.q)
            {
              localb.a(this, paramMotionEvent);
              return bool2;
            }
          }
          if (paramMotionEvent.getAction() == 3)
          {
            this.bE = false;
            return bool2;
          }
          bool3 = bool2;
          if (paramMotionEvent.getAction() != 2)
            continue;
          if ((this.ce) && (this.cc[0] != null))
          {
            if ((f1 >= this.cf) && (f1 <= this.cf + this.cd) && (f2 >= this.cg))
            {
              bool3 = bool2;
              if (f2 <= this.cg + org.vidogram.messenger.a.a(32.0F))
                continue;
            }
            this.bE = false;
            return bool2;
          }
          if ((f1 >= this.bY + this.bp) && (f1 <= this.bY + this.bp + this.bo) && (f2 >= this.bZ - org.vidogram.messenger.a.a(4.0F)))
          {
            bool3 = bool2;
            if (f2 <= this.bZ + org.vidogram.messenger.a.a(20.0F))
              continue;
          }
          this.bE = false;
          return bool2;
        }
        if (!this.bP)
          break;
        if (paramMotionEvent.getAction() == 1)
        {
          this.bP = false;
          playSoundEffect(0);
          bool3 = bool2;
          if (this.cz == null)
            continue;
          this.cz.a(this, this.bn.a.g);
          return bool2;
        }
        if (paramMotionEvent.getAction() == 3)
        {
          this.bP = false;
          return bool2;
        }
        bool3 = bool2;
        if (paramMotionEvent.getAction() != 2)
          continue;
        if ((f1 >= this.bI) && (f1 <= this.bI + Math.max(this.bK, this.bM)) && (f2 >= this.bJ))
        {
          bool3 = bool2;
          if (f2 <= this.bJ + org.vidogram.messenger.a.a(35.0F))
            continue;
        }
        this.bP = false;
        return bool2;
      }
      bool3 = bool2;
    }
    while (!this.bS);
    if (paramMotionEvent.getAction() == 1)
    {
      this.bS = false;
      playSoundEffect(0);
      if (this.cz != null)
        this.cz.d(this);
    }
    while (true)
    {
      invalidate();
      return bool2;
      if (paramMotionEvent.getAction() == 3)
      {
        this.bS = false;
        continue;
      }
      if ((paramMotionEvent.getAction() != 2) || ((f1 >= this.bT) && (f1 <= this.bT + org.vidogram.messenger.a.a(40.0F)) && (f2 >= this.bU) && (f2 <= this.bU + org.vidogram.messenger.a.a(32.0F))))
        continue;
      this.bS = false;
    }
  }

  public void requestLayout()
  {
    if (this.h)
      return;
    super.requestLayout();
  }

  public void setAllowAssistant(boolean paramBoolean)
  {
    this.bk = paramBoolean;
  }

  public void setDelegate(b paramb)
  {
    this.cz = paramb;
  }

  public void setHighlighted(boolean paramBoolean)
  {
    if (this.bd == paramBoolean)
      return;
    this.bd = paramBoolean;
    this.n.a(getDrawableForCurrentState());
    if (this.aE)
      this.aG.a(i());
    while (true)
    {
      invalidate();
      return;
      this.aF.a(i());
    }
  }

  public void setHighlightedText(String paramString)
  {
    if ((this.bn.a.i == null) || (this.bn == null) || (this.bn.f != 0) || (TextUtils.isEmpty(this.bn.b)) || (paramString == null))
      if (!this.aD.isEmpty())
      {
        this.g = -1;
        b(true);
        invalidate();
      }
    while (true)
    {
      return;
      int i3 = TextUtils.indexOf(this.bn.a.i.toLowerCase(), paramString.toLowerCase());
      if (i3 == -1)
      {
        if (this.aD.isEmpty())
          continue;
        this.g = -1;
        b(true);
        invalidate();
        return;
      }
      int i2 = i3 + paramString.length();
      int i1 = 0;
      while (i1 < this.bn.z.size())
      {
        paramString = (u.a)this.bn.z.get(i1);
        if ((i3 >= paramString.d) && (i3 < paramString.d + paramString.a.getText().length()))
        {
          this.g = i1;
          b(true);
          try
          {
            Object localObject = c(true);
            int i4 = paramString.a.getText().length();
            ((z)localObject).a(paramString.a, i3, 0.0F);
            paramString.a.getSelectionPath(i3, i2 - paramString.d, (Path)localObject);
            if (i2 >= paramString.d + i4)
              i1 += 1;
            while (true)
            {
              if (i1 < this.bn.z.size())
              {
                localObject = (u.a)this.bn.z.get(i1);
                i3 = ((u.a)localObject).a.getText().length();
                z localz = c(true);
                localz.a(((u.a)localObject).a, 0, ((u.a)localObject).e);
                ((u.a)localObject).a.getSelectionPath(0, i2 - ((u.a)localObject).d, localz);
                i4 = paramString.d;
                if (i2 >= i4 + i3 - 1);
              }
              else
              {
                invalidate();
                return;
              }
              i1 += 1;
            }
          }
          catch (Exception paramString)
          {
            while (true)
              n.a("tmessages", paramString);
          }
        }
        i1 += 1;
      }
    }
  }

  // ERROR //
  public void setMessageObject(u paramu)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual 2051	org/vidogram/messenger/u:e	()Z
    //   4: ifeq +8 -> 12
    //   7: aload_0
    //   8: aconst_null
    //   9: putfield 773	org/vidogram/ui/c/j:bn	Lorg/vidogram/messenger/u;
    //   12: aload_0
    //   13: getfield 773	org/vidogram/ui/c/j:bn	Lorg/vidogram/messenger/u;
    //   16: ifnull +17 -> 33
    //   19: aload_0
    //   20: getfield 773	org/vidogram/ui/c/j:bn	Lorg/vidogram/messenger/u;
    //   23: invokevirtual 1834	org/vidogram/messenger/u:q	()I
    //   26: aload_1
    //   27: invokevirtual 1834	org/vidogram/messenger/u:q	()I
    //   30: if_icmpeq +1655 -> 1685
    //   33: iconst_1
    //   34: istore 18
    //   36: aload_0
    //   37: getfield 773	org/vidogram/ui/c/j:bn	Lorg/vidogram/messenger/u;
    //   40: aload_1
    //   41: if_acmpne +10 -> 51
    //   44: aload_1
    //   45: getfield 2129	org/vidogram/messenger/u:u	Z
    //   48: ifeq +1643 -> 1691
    //   51: iconst_1
    //   52: istore 8
    //   54: aload_0
    //   55: getfield 773	org/vidogram/ui/c/j:bn	Lorg/vidogram/messenger/u;
    //   58: aload_1
    //   59: if_acmpne +1638 -> 1697
    //   62: aload_0
    //   63: invokespecial 2130	org/vidogram/ui/c/j:g	()Z
    //   66: ifne +10 -> 76
    //   69: aload_0
    //   70: getfield 1311	org/vidogram/ui/c/j:ae	Z
    //   73: ifeq +1624 -> 1697
    //   76: iconst_1
    //   77: istore 27
    //   79: iload 8
    //   81: ifne +16 -> 97
    //   84: iload 27
    //   86: ifne +11 -> 97
    //   89: aload_0
    //   90: aload_1
    //   91: invokespecial 2131	org/vidogram/ui/c/j:b	(Lorg/vidogram/messenger/u;)Z
    //   94: ifeq +11440 -> 11534
    //   97: aload_0
    //   98: aload_1
    //   99: putfield 773	org/vidogram/ui/c/j:bn	Lorg/vidogram/messenger/u;
    //   102: aload_0
    //   103: aload_1
    //   104: getfield 453	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   107: getfield 1557	org/vidogram/tgnet/g$ar:y	I
    //   110: putfield 1556	org/vidogram/ui/c/j:cB	I
    //   113: aload_0
    //   114: aload_1
    //   115: getfield 453	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   118: getfield 944	org/vidogram/tgnet/g$ar:G	I
    //   121: putfield 1559	org/vidogram/ui/c/j:cC	I
    //   124: aload_0
    //   125: aload_1
    //   126: getfield 453	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   129: getfield 1370	org/vidogram/tgnet/g$ar:s	I
    //   132: putfield 1561	org/vidogram/ui/c/j:cD	I
    //   135: aload_0
    //   136: iconst_0
    //   137: putfield 1656	org/vidogram/ui/c/j:bc	Z
    //   140: aload_0
    //   141: iconst_1
    //   142: putfield 263	org/vidogram/ui/c/j:bf	Z
    //   145: aload_0
    //   146: iconst_0
    //   147: putfield 1563	org/vidogram/ui/c/j:bh	Z
    //   150: aload_0
    //   151: iconst_0
    //   152: putfield 1908	org/vidogram/ui/c/j:bg	Z
    //   155: aload_0
    //   156: aload_0
    //   157: aload_1
    //   158: invokespecial 2132	org/vidogram/ui/c/j:d	(Lorg/vidogram/messenger/u;)Z
    //   161: putfield 1915	org/vidogram/ui/c/j:bR	Z
    //   164: aload_0
    //   165: aconst_null
    //   166: putfield 1762	org/vidogram/ui/c/j:bF	Landroid/text/StaticLayout;
    //   169: aload_0
    //   170: aconst_null
    //   171: putfield 1572	org/vidogram/ui/c/j:bG	Landroid/text/StaticLayout;
    //   174: aload_0
    //   175: iconst_0
    //   176: putfield 1764	org/vidogram/ui/c/j:bK	I
    //   179: aload_0
    //   180: iconst_0
    //   181: putfield 1768	org/vidogram/ui/c/j:bM	I
    //   184: aload_0
    //   185: iconst_0
    //   186: putfield 1682	org/vidogram/ui/c/j:bo	I
    //   189: aload_0
    //   190: iconst_0
    //   191: putfield 1693	org/vidogram/ui/c/j:bp	I
    //   194: aload_0
    //   195: aconst_null
    //   196: putfield 1583	org/vidogram/ui/c/j:bQ	Lorg/vidogram/tgnet/g$x;
    //   199: aload_0
    //   200: aconst_null
    //   201: putfield 1552	org/vidogram/ui/c/j:cr	Lorg/vidogram/tgnet/g$vw;
    //   204: aload_0
    //   205: aconst_null
    //   206: putfield 1554	org/vidogram/ui/c/j:cs	Lorg/vidogram/tgnet/g$i;
    //   209: aload_0
    //   210: aconst_null
    //   211: putfield 1684	org/vidogram/ui/c/j:cw	Lorg/vidogram/tgnet/g$vw;
    //   214: aload_0
    //   215: iconst_0
    //   216: putfield 1686	org/vidogram/ui/c/j:cb	Z
    //   219: aload_0
    //   220: iconst_m1
    //   221: invokespecial 1266	org/vidogram/ui/c/j:a	(I)V
    //   224: aload_1
    //   225: iconst_0
    //   226: putfield 2129	org/vidogram/messenger/u:u	Z
    //   229: aload_0
    //   230: iconst_0
    //   231: putfield 639	org/vidogram/ui/c/j:v	Z
    //   234: aload_0
    //   235: iconst_0
    //   236: putfield 516	org/vidogram/ui/c/j:w	Z
    //   239: aload_0
    //   240: iconst_0
    //   241: putfield 771	org/vidogram/ui/c/j:x	Z
    //   244: aload_0
    //   245: iconst_0
    //   246: putfield 1277	org/vidogram/ui/c/j:az	Z
    //   249: aload_0
    //   250: iconst_0
    //   251: putfield 949	org/vidogram/ui/c/j:W	I
    //   254: aload_0
    //   255: iconst_m1
    //   256: putfield 1107	org/vidogram/ui/c/j:ba	I
    //   259: aload_0
    //   260: iconst_0
    //   261: putfield 846	org/vidogram/ui/c/j:y	I
    //   264: aload_0
    //   265: iconst_0
    //   266: putfield 1037	org/vidogram/ui/c/j:z	I
    //   269: aload_0
    //   270: iconst_0
    //   271: putfield 476	org/vidogram/ui/c/j:t	I
    //   274: aload_0
    //   275: aconst_null
    //   276: putfield 469	org/vidogram/ui/c/j:u	Lorg/vidogram/tgnet/g$q;
    //   279: aload_0
    //   280: aconst_null
    //   281: putfield 880	org/vidogram/ui/c/j:H	Landroid/text/StaticLayout;
    //   284: aload_0
    //   285: aconst_null
    //   286: putfield 872	org/vidogram/ui/c/j:G	Landroid/text/StaticLayout;
    //   289: aload_0
    //   290: aconst_null
    //   291: putfield 920	org/vidogram/ui/c/j:I	Landroid/text/StaticLayout;
    //   294: aload_0
    //   295: aconst_null
    //   296: putfield 830	org/vidogram/ui/c/j:F	Landroid/text/StaticLayout;
    //   299: aload_0
    //   300: aconst_null
    //   301: putfield 876	org/vidogram/ui/c/j:J	Landroid/text/StaticLayout;
    //   304: aload_0
    //   305: aconst_null
    //   306: putfield 1017	org/vidogram/ui/c/j:M	Landroid/text/StaticLayout;
    //   309: aload_0
    //   310: aconst_null
    //   311: putfield 666	org/vidogram/ui/c/j:K	Landroid/text/StaticLayout;
    //   314: aload_0
    //   315: iconst_0
    //   316: putfield 1024	org/vidogram/ui/c/j:s	Z
    //   319: aload_0
    //   320: aconst_null
    //   321: putfield 698	org/vidogram/ui/c/j:ah	Lorg/vidogram/tgnet/g$az;
    //   324: aload_0
    //   325: aconst_null
    //   326: putfield 1439	org/vidogram/ui/c/j:ai	Lorg/vidogram/tgnet/g$az;
    //   329: aload_0
    //   330: aconst_null
    //   331: putfield 708	org/vidogram/ui/c/j:aj	Ljava/lang/String;
    //   334: aload_0
    //   335: aconst_null
    //   336: putfield 616	org/vidogram/ui/c/j:Q	Landroid/text/StaticLayout;
    //   339: aload_0
    //   340: iconst_0
    //   341: putfield 1434	org/vidogram/ui/c/j:al	Z
    //   344: aload_0
    //   345: iconst_m1
    //   346: putfield 940	org/vidogram/ui/c/j:V	I
    //   349: aload_0
    //   350: aconst_null
    //   351: putfield 1279	org/vidogram/ui/c/j:S	Ljava/lang/String;
    //   354: aload_0
    //   355: iconst_0
    //   356: putfield 1311	org/vidogram/ui/c/j:ae	Z
    //   359: aload_0
    //   360: iconst_1
    //   361: putfield 265	org/vidogram/ui/c/j:bi	Z
    //   364: aload_0
    //   365: iconst_0
    //   366: putfield 1585	org/vidogram/ui/c/j:ca	Z
    //   369: aload_0
    //   370: iconst_0
    //   371: putfield 1056	org/vidogram/ui/c/j:aE	Z
    //   374: aload_0
    //   375: iconst_0
    //   376: putfield 1595	org/vidogram/ui/c/j:ce	Z
    //   379: aload_0
    //   380: iconst_0
    //   381: putfield 1141	org/vidogram/ui/c/j:be	Z
    //   384: aload_0
    //   385: iconst_0
    //   386: putfield 508	org/vidogram/ui/c/j:bq	I
    //   389: aload_0
    //   390: getfield 418	org/vidogram/ui/c/j:o	Lorg/vidogram/messenger/q;
    //   393: iconst_0
    //   394: invokevirtual 701	org/vidogram/messenger/q:e	(Z)V
    //   397: aload_0
    //   398: getfield 418	org/vidogram/ui/c/j:o	Lorg/vidogram/messenger/q;
    //   401: iconst_0
    //   402: invokevirtual 703	org/vidogram/messenger/q:f	(Z)V
    //   405: aload_0
    //   406: getfield 418	org/vidogram/ui/c/j:o	Lorg/vidogram/messenger/q;
    //   409: aconst_null
    //   410: invokevirtual 704	org/vidogram/messenger/q:a	(Lorg/vidogram/messenger/u;)V
    //   413: aload_0
    //   414: getfield 418	org/vidogram/ui/c/j:o	Lorg/vidogram/messenger/q;
    //   417: ldc_w 844
    //   420: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   423: invokevirtual 397	org/vidogram/messenger/q:a	(I)V
    //   426: iload 8
    //   428: ifeq +18 -> 446
    //   431: aload_0
    //   432: iconst_0
    //   433: putfield 840	org/vidogram/ui/c/j:k	I
    //   436: aload_0
    //   437: iconst_0
    //   438: putfield 842	org/vidogram/ui/c/j:j	I
    //   441: aload_0
    //   442: iconst_1
    //   443: putfield 780	org/vidogram/ui/c/j:m	Z
    //   446: aload_1
    //   447: getfield 450	org/vidogram/messenger/u:f	I
    //   450: ifne +5837 -> 6287
    //   453: aload_0
    //   454: iconst_1
    //   455: putfield 1595	org/vidogram/ui/c/j:ce	Z
    //   458: invokestatic 1632	org/vidogram/messenger/a:c	()Z
    //   461: ifeq +1292 -> 1753
    //   464: aload_0
    //   465: getfield 1586	org/vidogram/ui/c/j:a	Z
    //   468: ifeq +1235 -> 1703
    //   471: aload_1
    //   472: invokevirtual 524	org/vidogram/messenger/u:k	()Z
    //   475: ifne +1228 -> 1703
    //   478: aload_1
    //   479: invokevirtual 1338	org/vidogram/messenger/u:l	()Z
    //   482: ifeq +1221 -> 1703
    //   485: invokestatic 1634	org/vidogram/messenger/a:e	()I
    //   488: istore 8
    //   490: ldc_w 2133
    //   493: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   496: istore 9
    //   498: aload_0
    //   499: iconst_1
    //   500: putfield 1585	org/vidogram/ui/c/j:ca	Z
    //   503: iload 8
    //   505: iload 9
    //   507: isub
    //   508: istore 10
    //   510: aload_0
    //   511: iload 10
    //   513: putfield 508	org/vidogram/ui/c/j:bq	I
    //   516: aload_0
    //   517: aload_1
    //   518: invokespecial 511	org/vidogram/ui/c/j:c	(Lorg/vidogram/messenger/u;)V
    //   521: aload_0
    //   522: getfield 514	org/vidogram/ui/c/j:cj	I
    //   525: ldc_w 926
    //   528: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   531: iadd
    //   532: istore 19
    //   534: aload_1
    //   535: invokevirtual 524	org/vidogram/messenger/u:k	()Z
    //   538: ifeq +11285 -> 11823
    //   541: iload 19
    //   543: ldc_w 1986
    //   546: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   549: iadd
    //   550: istore 19
    //   552: aload_1
    //   553: getfield 453	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   556: getfield 458	org/vidogram/tgnet/g$ar:j	Lorg/vidogram/tgnet/g$au;
    //   559: instanceof 1518
    //   562: ifeq +1322 -> 1884
    //   565: aload_1
    //   566: getfield 453	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   569: getfield 458	org/vidogram/tgnet/g$ar:j	Lorg/vidogram/tgnet/g$au;
    //   572: getfield 1745	org/vidogram/tgnet/g$au:m	Lorg/vidogram/tgnet/g$jb;
    //   575: instanceof 1747
    //   578: ifeq +1306 -> 1884
    //   581: iconst_1
    //   582: istore 28
    //   584: aload_0
    //   585: iload 28
    //   587: putfield 771	org/vidogram/ui/c/j:x	Z
    //   590: aload_1
    //   591: getfield 453	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   594: getfield 458	org/vidogram/tgnet/g$ar:j	Lorg/vidogram/tgnet/g$au;
    //   597: instanceof 1514
    //   600: ifeq +1290 -> 1890
    //   603: aload_1
    //   604: getfield 453	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   607: getfield 458	org/vidogram/tgnet/g$ar:j	Lorg/vidogram/tgnet/g$au;
    //   610: getfield 463	org/vidogram/tgnet/g$au:r	Lorg/vidogram/tgnet/g$wb;
    //   613: instanceof 1516
    //   616: ifeq +1274 -> 1890
    //   619: iconst_1
    //   620: istore 28
    //   622: aload_0
    //   623: iload 28
    //   625: putfield 516	org/vidogram/ui/c/j:w	Z
    //   628: aload_0
    //   629: iload 10
    //   631: putfield 267	org/vidogram/ui/c/j:bx	I
    //   634: aload_0
    //   635: getfield 516	org/vidogram/ui/c/j:w	Z
    //   638: ifne +22 -> 660
    //   641: aload_0
    //   642: getfield 771	org/vidogram/ui/c/j:x	Z
    //   645: ifne +15 -> 660
    //   648: iload 10
    //   650: aload_1
    //   651: getfield 775	org/vidogram/messenger/u:v	I
    //   654: isub
    //   655: iload 19
    //   657: if_icmpge +1239 -> 1896
    //   660: aload_0
    //   661: aload_0
    //   662: getfield 267	org/vidogram/ui/c/j:bx	I
    //   665: aload_1
    //   666: getfield 775	org/vidogram/messenger/u:v	I
    //   669: invokestatic 675	java/lang/Math:max	(II)I
    //   672: ldc_w 777
    //   675: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   678: iadd
    //   679: putfield 267	org/vidogram/ui/c/j:bx	I
    //   682: aload_0
    //   683: aload_0
    //   684: getfield 267	org/vidogram/ui/c/j:bx	I
    //   687: aload_0
    //   688: getfield 514	org/vidogram/ui/c/j:cj	I
    //   691: ldc_w 777
    //   694: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   697: iadd
    //   698: invokestatic 675	java/lang/Math:max	(II)I
    //   701: putfield 267	org/vidogram/ui/c/j:bx	I
    //   704: aload_0
    //   705: aload_0
    //   706: getfield 267	org/vidogram/ui/c/j:bx	I
    //   709: ldc_w 777
    //   712: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   715: isub
    //   716: putfield 508	org/vidogram/ui/c/j:bq	I
    //   719: aload_0
    //   720: aload_1
    //   721: invokespecial 2135	org/vidogram/ui/c/j:setMessageObjectInternal	(Lorg/vidogram/messenger/u;)V
    //   724: aload_1
    //   725: getfield 1215	org/vidogram/messenger/u:w	I
    //   728: istore 9
    //   730: aload_0
    //   731: getfield 771	org/vidogram/ui/c/j:x	Z
    //   734: ifeq +1237 -> 1971
    //   737: ldc_w 517
    //   740: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   743: istore 8
    //   745: aload_0
    //   746: iload 8
    //   748: iload 9
    //   750: iadd
    //   751: putfield 267	org/vidogram/ui/c/j:bx	I
    //   754: aload_0
    //   755: aload_1
    //   756: getfield 868	org/vidogram/messenger/u:x	I
    //   759: ldc_w 2136
    //   762: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   765: iadd
    //   766: aload_0
    //   767: getfield 826	org/vidogram/ui/c/j:cA	I
    //   770: iadd
    //   771: putfield 776	org/vidogram/ui/c/j:d	I
    //   774: aload_0
    //   775: getfield 267	org/vidogram/ui/c/j:bx	I
    //   778: aload_0
    //   779: getfield 1690	org/vidogram/ui/c/j:bW	I
    //   782: invokestatic 675	java/lang/Math:max	(II)I
    //   785: aload_0
    //   786: getfield 1721	org/vidogram/ui/c/j:cd	I
    //   789: invokestatic 675	java/lang/Math:max	(II)I
    //   792: aload_0
    //   793: getfield 1764	org/vidogram/ui/c/j:bK	I
    //   796: invokestatic 675	java/lang/Math:max	(II)I
    //   799: aload_0
    //   800: getfield 1768	org/vidogram/ui/c/j:bM	I
    //   803: invokestatic 675	java/lang/Math:max	(II)I
    //   806: istore 9
    //   808: iconst_0
    //   809: istore 12
    //   811: aload_0
    //   812: getfield 516	org/vidogram/ui/c/j:w	Z
    //   815: ifne +10 -> 825
    //   818: aload_0
    //   819: getfield 771	org/vidogram/ui/c/j:x	Z
    //   822: ifeq +5441 -> 6263
    //   825: invokestatic 1632	org/vidogram/messenger/a:c	()Z
    //   828: ifeq +1164 -> 1992
    //   831: aload_1
    //   832: invokevirtual 1338	org/vidogram/messenger/u:l	()Z
    //   835: ifeq +1142 -> 1977
    //   838: aload_0
    //   839: getfield 773	org/vidogram/ui/c/j:bn	Lorg/vidogram/messenger/u;
    //   842: getfield 453	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   845: getfield 1061	org/vidogram/tgnet/g$ar:d	Lorg/vidogram/tgnet/g$aw;
    //   848: getfield 1064	org/vidogram/tgnet/g$aw:b	I
    //   851: ifne +19 -> 870
    //   854: aload_0
    //   855: getfield 773	org/vidogram/ui/c/j:bn	Lorg/vidogram/messenger/u;
    //   858: getfield 453	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   861: getfield 1061	org/vidogram/tgnet/g$ar:d	Lorg/vidogram/tgnet/g$aw;
    //   864: getfield 2137	org/vidogram/tgnet/g$aw:d	I
    //   867: ifeq +1110 -> 1977
    //   870: aload_0
    //   871: getfield 773	org/vidogram/ui/c/j:bn	Lorg/vidogram/messenger/u;
    //   874: invokevirtual 1193	org/vidogram/messenger/u:j	()Z
    //   877: ifne +1100 -> 1977
    //   880: invokestatic 1634	org/vidogram/messenger/a:e	()I
    //   883: ldc_w 2133
    //   886: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   889: isub
    //   890: istore 8
    //   892: aload_0
    //   893: getfield 1915	org/vidogram/ui/c/j:bR	Z
    //   896: ifeq +10924 -> 11820
    //   899: iload 8
    //   901: ldc_w 1533
    //   904: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   907: isub
    //   908: istore 8
    //   910: aload_1
    //   911: getfield 453	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   914: getfield 458	org/vidogram/tgnet/g$ar:j	Lorg/vidogram/tgnet/g$au;
    //   917: getfield 463	org/vidogram/tgnet/g$au:r	Lorg/vidogram/tgnet/g$wb;
    //   920: ifnull +1187 -> 2107
    //   923: aload_1
    //   924: getfield 453	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   927: getfield 458	org/vidogram/tgnet/g$ar:j	Lorg/vidogram/tgnet/g$au;
    //   930: getfield 463	org/vidogram/tgnet/g$au:r	Lorg/vidogram/tgnet/g$wb;
    //   933: checkcast 1516	org/vidogram/tgnet/g$vp
    //   936: astore 29
    //   938: aload 29
    //   940: getfield 2138	org/vidogram/tgnet/g$vp:h	Ljava/lang/String;
    //   943: astore 32
    //   945: aload 29
    //   947: getfield 2139	org/vidogram/tgnet/g$vp:i	Ljava/lang/String;
    //   950: astore 36
    //   952: aload 29
    //   954: getfield 2140	org/vidogram/tgnet/g$vp:q	Ljava/lang/String;
    //   957: astore 35
    //   959: aload 29
    //   961: getfield 2141	org/vidogram/tgnet/g$vp:j	Ljava/lang/String;
    //   964: astore 34
    //   966: aload 29
    //   968: getfield 2144	org/vidogram/tgnet/g$vp:k	Lorg/vidogram/tgnet/g$ay;
    //   971: astore 33
    //   973: aload 29
    //   975: getfield 2145	org/vidogram/tgnet/g$vp:s	Lorg/vidogram/tgnet/g$q;
    //   978: astore 31
    //   980: aload 29
    //   982: getfield 2146	org/vidogram/tgnet/g$vp:g	Ljava/lang/String;
    //   985: astore 30
    //   987: aload 29
    //   989: getfield 2148	org/vidogram/tgnet/g$vp:p	I
    //   992: istore 20
    //   994: aload 32
    //   996: ifnull +10821 -> 11817
    //   999: aload 33
    //   1001: ifnull +10816 -> 11817
    //   1004: aload 32
    //   1006: invokevirtual 621	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   1009: ldc_w 2150
    //   1012: invokevirtual 1309	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   1015: ifeq +10802 -> 11817
    //   1018: getstatic 1638	org/vidogram/messenger/a:c	Landroid/graphics/Point;
    //   1021: getfield 1642	android/graphics/Point:y	I
    //   1024: iconst_3
    //   1025: idiv
    //   1026: aload_0
    //   1027: getfield 773	org/vidogram/ui/c/j:bn	Lorg/vidogram/messenger/u;
    //   1030: getfield 1215	org/vidogram/messenger/u:w	I
    //   1033: invokestatic 675	java/lang/Math:max	(II)I
    //   1036: istore 8
    //   1038: aload 30
    //   1040: ifnull +1055 -> 2095
    //   1043: aload 30
    //   1045: ldc_w 2152
    //   1048: invokevirtual 1309	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   1051: ifne +25 -> 1076
    //   1054: aload 30
    //   1056: ldc_w 2154
    //   1059: invokevirtual 1309	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   1062: ifne +14 -> 1076
    //   1065: aload 30
    //   1067: ldc_w 2156
    //   1070: invokevirtual 1309	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   1073: ifeq +1022 -> 2095
    //   1076: iconst_1
    //   1077: istore 11
    //   1079: aload 34
    //   1081: ifnull +1020 -> 2101
    //   1084: aload 30
    //   1086: ifnull +1015 -> 2101
    //   1089: aload 30
    //   1091: ldc_w 2152
    //   1094: invokevirtual 1309	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   1097: ifne +25 -> 1122
    //   1100: aload 30
    //   1102: ldc_w 2154
    //   1105: invokevirtual 1309	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   1108: ifne +14 -> 1122
    //   1111: aload 30
    //   1113: ldc_w 2156
    //   1116: invokevirtual 1309	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   1119: ifeq +982 -> 2101
    //   1122: aload_0
    //   1123: getfield 773	org/vidogram/ui/c/j:bn	Lorg/vidogram/messenger/u;
    //   1126: getfield 691	org/vidogram/messenger/u:m	Ljava/util/ArrayList;
    //   1129: ifnull +972 -> 2101
    //   1132: iconst_1
    //   1133: istore 28
    //   1135: aload_0
    //   1136: iload 28
    //   1138: putfield 907	org/vidogram/ui/c/j:r	Z
    //   1141: iload 11
    //   1143: istore 14
    //   1145: ldc_w 517
    //   1148: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   1151: istore 25
    //   1153: iconst_3
    //   1154: istore 21
    //   1156: iload 8
    //   1158: iload 25
    //   1160: isub
    //   1161: istore 24
    //   1163: aload_0
    //   1164: getfield 773	org/vidogram/ui/c/j:bn	Lorg/vidogram/messenger/u;
    //   1167: getfield 691	org/vidogram/messenger/u:m	Ljava/util/ArrayList;
    //   1170: ifnonnull +16 -> 1186
    //   1173: aload 33
    //   1175: ifnull +11 -> 1186
    //   1178: aload_0
    //   1179: getfield 773	org/vidogram/ui/c/j:bn	Lorg/vidogram/messenger/u;
    //   1182: iconst_1
    //   1183: invokevirtual 2157	org/vidogram/messenger/u:a	(Z)V
    //   1186: aload 32
    //   1188: ifnull +10615 -> 11803
    //   1191: getstatic 364	org/vidogram/ui/c/j:bu	Landroid/text/TextPaint;
    //   1194: aload 32
    //   1196: invokevirtual 500	android/text/TextPaint:measureText	(Ljava/lang/String;)F
    //   1199: f2d
    //   1200: invokestatic 506	java/lang/Math:ceil	(D)D
    //   1203: d2i
    //   1204: istore 8
    //   1206: aload_0
    //   1207: new 269	android/text/StaticLayout
    //   1210: dup
    //   1211: aload 32
    //   1213: getstatic 364	org/vidogram/ui/c/j:bu	Landroid/text/TextPaint;
    //   1216: iload 8
    //   1218: iload 24
    //   1220: invokestatic 521	java/lang/Math:min	(II)I
    //   1223: getstatic 567	android/text/Layout$Alignment:ALIGN_NORMAL	Landroid/text/Layout$Alignment;
    //   1226: fconst_1
    //   1227: fconst_0
    //   1228: iconst_0
    //   1229: invokespecial 570	android/text/StaticLayout:<init>	(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;FFZ)V
    //   1232: putfield 830	org/vidogram/ui/c/j:F	Landroid/text/StaticLayout;
    //   1235: aload_0
    //   1236: getfield 830	org/vidogram/ui/c/j:F	Landroid/text/StaticLayout;
    //   1239: aload_0
    //   1240: getfield 830	org/vidogram/ui/c/j:F	Landroid/text/StaticLayout;
    //   1243: invokevirtual 575	android/text/StaticLayout:getLineCount	()I
    //   1246: iconst_1
    //   1247: isub
    //   1248: invokevirtual 833	android/text/StaticLayout:getLineBottom	(I)I
    //   1251: istore 8
    //   1253: aload_0
    //   1254: aload_0
    //   1255: getfield 846	org/vidogram/ui/c/j:y	I
    //   1258: iload 8
    //   1260: iadd
    //   1261: putfield 846	org/vidogram/ui/c/j:y	I
    //   1264: aload_0
    //   1265: aload_0
    //   1266: getfield 776	org/vidogram/ui/c/j:d	I
    //   1269: iload 8
    //   1271: iadd
    //   1272: putfield 776	org/vidogram/ui/c/j:d	I
    //   1275: iconst_0
    //   1276: iload 8
    //   1278: iadd
    //   1279: istore 11
    //   1281: aload_0
    //   1282: getfield 830	org/vidogram/ui/c/j:F	Landroid/text/StaticLayout;
    //   1285: invokevirtual 2160	android/text/StaticLayout:getWidth	()I
    //   1288: istore 13
    //   1290: iload 9
    //   1292: iload 13
    //   1294: iload 25
    //   1296: iadd
    //   1297: invokestatic 675	java/lang/Math:max	(II)I
    //   1300: istore 8
    //   1302: iconst_0
    //   1303: iload 13
    //   1305: iload 25
    //   1307: iadd
    //   1308: invokestatic 675	java/lang/Math:max	(II)I
    //   1311: istore 9
    //   1313: iload 11
    //   1315: istore 13
    //   1317: aload 36
    //   1319: ifnull +10467 -> 11786
    //   1322: aload_0
    //   1323: ldc_w 2161
    //   1326: putfield 874	org/vidogram/ui/c/j:D	I
    //   1329: aload_0
    //   1330: getfield 846	org/vidogram/ui/c/j:y	I
    //   1333: ifeq +29 -> 1362
    //   1336: aload_0
    //   1337: aload_0
    //   1338: getfield 846	org/vidogram/ui/c/j:y	I
    //   1341: fconst_2
    //   1342: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   1345: iadd
    //   1346: putfield 846	org/vidogram/ui/c/j:y	I
    //   1349: aload_0
    //   1350: aload_0
    //   1351: getfield 776	org/vidogram/ui/c/j:d	I
    //   1354: fconst_2
    //   1355: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   1358: iadd
    //   1359: putfield 776	org/vidogram/ui/c/j:d	I
    //   1362: aload_0
    //   1363: getfield 907	org/vidogram/ui/c/j:r	Z
    //   1366: ifeq +8 -> 1374
    //   1369: aload 34
    //   1371: ifnonnull +853 -> 2224
    //   1374: aload_0
    //   1375: aload 36
    //   1377: getstatic 364	org/vidogram/ui/c/j:bu	Landroid/text/TextPaint;
    //   1380: iload 24
    //   1382: getstatic 567	android/text/Layout$Alignment:ALIGN_NORMAL	Landroid/text/Layout$Alignment;
    //   1385: fconst_1
    //   1386: fconst_1
    //   1387: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   1390: i2f
    //   1391: iconst_0
    //   1392: getstatic 555	android/text/TextUtils$TruncateAt:END	Landroid/text/TextUtils$TruncateAt;
    //   1395: iload 24
    //   1397: iconst_4
    //   1398: invokestatic 664	org/vidogram/ui/Components/bj:a	(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;FFZLandroid/text/TextUtils$TruncateAt;II)Landroid/text/StaticLayout;
    //   1401: putfield 872	org/vidogram/ui/c/j:G	Landroid/text/StaticLayout;
    //   1404: iconst_3
    //   1405: istore 11
    //   1407: iconst_0
    //   1408: istore 21
    //   1410: aload_0
    //   1411: getfield 872	org/vidogram/ui/c/j:G	Landroid/text/StaticLayout;
    //   1414: aload_0
    //   1415: getfield 872	org/vidogram/ui/c/j:G	Landroid/text/StaticLayout;
    //   1418: invokevirtual 575	android/text/StaticLayout:getLineCount	()I
    //   1421: iconst_1
    //   1422: isub
    //   1423: invokevirtual 833	android/text/StaticLayout:getLineBottom	(I)I
    //   1426: istore 12
    //   1428: aload_0
    //   1429: aload_0
    //   1430: getfield 846	org/vidogram/ui/c/j:y	I
    //   1433: iload 12
    //   1435: iadd
    //   1436: putfield 846	org/vidogram/ui/c/j:y	I
    //   1439: aload_0
    //   1440: iload 12
    //   1442: aload_0
    //   1443: getfield 776	org/vidogram/ui/c/j:d	I
    //   1446: iadd
    //   1447: putfield 776	org/vidogram/ui/c/j:d	I
    //   1450: iconst_0
    //   1451: istore 22
    //   1453: iconst_0
    //   1454: istore 15
    //   1456: iload 9
    //   1458: istore 12
    //   1460: iload 8
    //   1462: istore 9
    //   1464: iload 12
    //   1466: istore 8
    //   1468: iload 15
    //   1470: istore 12
    //   1472: iload 12
    //   1474: istore 15
    //   1476: iload 9
    //   1478: istore 16
    //   1480: iload 22
    //   1482: aload_0
    //   1483: getfield 872	org/vidogram/ui/c/j:G	Landroid/text/StaticLayout;
    //   1486: invokevirtual 575	android/text/StaticLayout:getLineCount	()I
    //   1489: if_icmpge +1284 -> 2773
    //   1492: iload 12
    //   1494: istore 15
    //   1496: iload 9
    //   1498: istore 16
    //   1500: aload_0
    //   1501: getfield 872	org/vidogram/ui/c/j:G	Landroid/text/StaticLayout;
    //   1504: iload 22
    //   1506: invokevirtual 579	android/text/StaticLayout:getLineLeft	(I)F
    //   1509: f2i
    //   1510: istore 26
    //   1512: iload 26
    //   1514: ifeq +6 -> 1520
    //   1517: iconst_1
    //   1518: istore 12
    //   1520: iload 12
    //   1522: istore 15
    //   1524: iload 9
    //   1526: istore 16
    //   1528: aload_0
    //   1529: getfield 874	org/vidogram/ui/c/j:D	I
    //   1532: ldc_w 2161
    //   1535: if_icmpne +732 -> 2267
    //   1538: iload 12
    //   1540: istore 15
    //   1542: iload 9
    //   1544: istore 16
    //   1546: aload_0
    //   1547: iload 26
    //   1549: ineg
    //   1550: putfield 874	org/vidogram/ui/c/j:D	I
    //   1553: iload 26
    //   1555: ifeq +1189 -> 2744
    //   1558: iload 12
    //   1560: istore 15
    //   1562: iload 9
    //   1564: istore 16
    //   1566: aload_0
    //   1567: getfield 872	org/vidogram/ui/c/j:G	Landroid/text/StaticLayout;
    //   1570: invokevirtual 2160	android/text/StaticLayout:getWidth	()I
    //   1573: iload 26
    //   1575: isub
    //   1576: istore 17
    //   1578: iload 22
    //   1580: iload 21
    //   1582: if_icmplt +31 -> 1613
    //   1585: iload 17
    //   1587: istore 23
    //   1589: iload 26
    //   1591: ifeq +41 -> 1632
    //   1594: iload 17
    //   1596: istore 23
    //   1598: iload 12
    //   1600: istore 15
    //   1602: iload 9
    //   1604: istore 16
    //   1606: aload_0
    //   1607: getfield 907	org/vidogram/ui/c/j:r	Z
    //   1610: ifeq +22 -> 1632
    //   1613: iload 12
    //   1615: istore 15
    //   1617: iload 9
    //   1619: istore 16
    //   1621: iload 17
    //   1623: ldc_w 2162
    //   1626: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   1629: iadd
    //   1630: istore 23
    //   1632: iload 12
    //   1634: istore 15
    //   1636: iload 9
    //   1638: istore 16
    //   1640: iload 9
    //   1642: iload 23
    //   1644: iload 25
    //   1646: iadd
    //   1647: invokestatic 675	java/lang/Math:max	(II)I
    //   1650: istore 9
    //   1652: iload 12
    //   1654: istore 15
    //   1656: iload 9
    //   1658: istore 16
    //   1660: iload 8
    //   1662: iload 23
    //   1664: iload 25
    //   1666: iadd
    //   1667: invokestatic 675	java/lang/Math:max	(II)I
    //   1670: istore 17
    //   1672: iload 17
    //   1674: istore 8
    //   1676: iload 22
    //   1678: iconst_1
    //   1679: iadd
    //   1680: istore 22
    //   1682: goto -210 -> 1472
    //   1685: iconst_0
    //   1686: istore 18
    //   1688: goto -1652 -> 36
    //   1691: iconst_0
    //   1692: istore 8
    //   1694: goto -1640 -> 54
    //   1697: iconst_0
    //   1698: istore 27
    //   1700: goto -1621 -> 79
    //   1703: aload_1
    //   1704: getfield 453	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   1707: getfield 1061	org/vidogram/tgnet/g$ar:d	Lorg/vidogram/tgnet/g$aw;
    //   1710: getfield 1064	org/vidogram/tgnet/g$aw:b	I
    //   1713: ifeq +34 -> 1747
    //   1716: aload_1
    //   1717: invokevirtual 524	org/vidogram/messenger/u:k	()Z
    //   1720: ifne +27 -> 1747
    //   1723: iconst_1
    //   1724: istore 28
    //   1726: aload_0
    //   1727: iload 28
    //   1729: putfield 1585	org/vidogram/ui/c/j:ca	Z
    //   1732: invokestatic 1634	org/vidogram/messenger/a:e	()I
    //   1735: ldc_w 2163
    //   1738: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   1741: isub
    //   1742: istore 10
    //   1744: goto -1234 -> 510
    //   1747: iconst_0
    //   1748: istore 28
    //   1750: goto -24 -> 1726
    //   1753: aload_0
    //   1754: getfield 1586	org/vidogram/ui/c/j:a	Z
    //   1757: ifeq +57 -> 1814
    //   1760: aload_1
    //   1761: invokevirtual 524	org/vidogram/messenger/u:k	()Z
    //   1764: ifne +50 -> 1814
    //   1767: aload_1
    //   1768: invokevirtual 1338	org/vidogram/messenger/u:l	()Z
    //   1771: ifeq +43 -> 1814
    //   1774: getstatic 1638	org/vidogram/messenger/a:c	Landroid/graphics/Point;
    //   1777: getfield 1641	android/graphics/Point:x	I
    //   1780: getstatic 1638	org/vidogram/messenger/a:c	Landroid/graphics/Point;
    //   1783: getfield 1642	android/graphics/Point:y	I
    //   1786: invokestatic 521	java/lang/Math:min	(II)I
    //   1789: istore 8
    //   1791: ldc_w 2133
    //   1794: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   1797: istore 9
    //   1799: aload_0
    //   1800: iconst_1
    //   1801: putfield 1585	org/vidogram/ui/c/j:ca	Z
    //   1804: iload 8
    //   1806: iload 9
    //   1808: isub
    //   1809: istore 10
    //   1811: goto -1301 -> 510
    //   1814: getstatic 1638	org/vidogram/messenger/a:c	Landroid/graphics/Point;
    //   1817: getfield 1641	android/graphics/Point:x	I
    //   1820: getstatic 1638	org/vidogram/messenger/a:c	Landroid/graphics/Point;
    //   1823: getfield 1642	android/graphics/Point:y	I
    //   1826: invokestatic 521	java/lang/Math:min	(II)I
    //   1829: istore 8
    //   1831: ldc_w 2163
    //   1834: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   1837: istore 9
    //   1839: aload_1
    //   1840: getfield 453	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   1843: getfield 1061	org/vidogram/tgnet/g$ar:d	Lorg/vidogram/tgnet/g$aw;
    //   1846: getfield 1064	org/vidogram/tgnet/g$aw:b	I
    //   1849: ifeq +29 -> 1878
    //   1852: aload_1
    //   1853: invokevirtual 524	org/vidogram/messenger/u:k	()Z
    //   1856: ifne +22 -> 1878
    //   1859: iconst_1
    //   1860: istore 28
    //   1862: aload_0
    //   1863: iload 28
    //   1865: putfield 1585	org/vidogram/ui/c/j:ca	Z
    //   1868: iload 8
    //   1870: iload 9
    //   1872: isub
    //   1873: istore 10
    //   1875: goto -1365 -> 510
    //   1878: iconst_0
    //   1879: istore 28
    //   1881: goto -19 -> 1862
    //   1884: iconst_0
    //   1885: istore 28
    //   1887: goto -1303 -> 584
    //   1890: iconst_0
    //   1891: istore 28
    //   1893: goto -1271 -> 622
    //   1896: aload_0
    //   1897: getfield 267	org/vidogram/ui/c/j:bx	I
    //   1900: aload_1
    //   1901: getfield 775	org/vidogram/messenger/u:v	I
    //   1904: isub
    //   1905: istore 8
    //   1907: iload 8
    //   1909: iflt +34 -> 1943
    //   1912: iload 8
    //   1914: iload 19
    //   1916: if_icmpgt +27 -> 1943
    //   1919: aload_0
    //   1920: aload_0
    //   1921: getfield 267	org/vidogram/ui/c/j:bx	I
    //   1924: iload 19
    //   1926: iadd
    //   1927: iload 8
    //   1929: isub
    //   1930: ldc_w 777
    //   1933: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   1936: iadd
    //   1937: putfield 267	org/vidogram/ui/c/j:bx	I
    //   1940: goto -1236 -> 704
    //   1943: aload_0
    //   1944: aload_0
    //   1945: getfield 267	org/vidogram/ui/c/j:bx	I
    //   1948: aload_1
    //   1949: getfield 775	org/vidogram/messenger/u:v	I
    //   1952: iload 19
    //   1954: iadd
    //   1955: invokestatic 675	java/lang/Math:max	(II)I
    //   1958: ldc_w 777
    //   1961: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   1964: iadd
    //   1965: putfield 267	org/vidogram/ui/c/j:bx	I
    //   1968: goto -1264 -> 704
    //   1971: iconst_0
    //   1972: istore 8
    //   1974: goto -1229 -> 745
    //   1977: invokestatic 1634	org/vidogram/messenger/a:e	()I
    //   1980: ldc_w 2163
    //   1983: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   1986: isub
    //   1987: istore 8
    //   1989: goto -1097 -> 892
    //   1992: aload_1
    //   1993: invokevirtual 1338	org/vidogram/messenger/u:l	()Z
    //   1996: ifeq +72 -> 2068
    //   1999: aload_0
    //   2000: getfield 773	org/vidogram/ui/c/j:bn	Lorg/vidogram/messenger/u;
    //   2003: getfield 453	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   2006: getfield 1061	org/vidogram/tgnet/g$ar:d	Lorg/vidogram/tgnet/g$aw;
    //   2009: getfield 1064	org/vidogram/tgnet/g$aw:b	I
    //   2012: ifne +19 -> 2031
    //   2015: aload_0
    //   2016: getfield 773	org/vidogram/ui/c/j:bn	Lorg/vidogram/messenger/u;
    //   2019: getfield 453	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   2022: getfield 1061	org/vidogram/tgnet/g$ar:d	Lorg/vidogram/tgnet/g$aw;
    //   2025: getfield 2137	org/vidogram/tgnet/g$aw:d	I
    //   2028: ifeq +40 -> 2068
    //   2031: aload_0
    //   2032: getfield 773	org/vidogram/ui/c/j:bn	Lorg/vidogram/messenger/u;
    //   2035: invokevirtual 524	org/vidogram/messenger/u:k	()Z
    //   2038: ifne +30 -> 2068
    //   2041: getstatic 1638	org/vidogram/messenger/a:c	Landroid/graphics/Point;
    //   2044: getfield 1641	android/graphics/Point:x	I
    //   2047: getstatic 1638	org/vidogram/messenger/a:c	Landroid/graphics/Point;
    //   2050: getfield 1642	android/graphics/Point:y	I
    //   2053: invokestatic 521	java/lang/Math:min	(II)I
    //   2056: ldc_w 2133
    //   2059: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   2062: isub
    //   2063: istore 8
    //   2065: goto -1173 -> 892
    //   2068: getstatic 1638	org/vidogram/messenger/a:c	Landroid/graphics/Point;
    //   2071: getfield 1641	android/graphics/Point:x	I
    //   2074: getstatic 1638	org/vidogram/messenger/a:c	Landroid/graphics/Point;
    //   2077: getfield 1642	android/graphics/Point:y	I
    //   2080: invokestatic 521	java/lang/Math:min	(II)I
    //   2083: ldc_w 2163
    //   2086: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   2089: isub
    //   2090: istore 8
    //   2092: goto -1200 -> 892
    //   2095: iconst_0
    //   2096: istore 11
    //   2098: goto -1019 -> 1079
    //   2101: iconst_0
    //   2102: istore 28
    //   2104: goto -969 -> 1135
    //   2107: aload_1
    //   2108: getfield 453	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   2111: getfield 458	org/vidogram/tgnet/g$ar:j	Lorg/vidogram/tgnet/g$au;
    //   2114: getfield 1745	org/vidogram/tgnet/g$au:m	Lorg/vidogram/tgnet/g$jb;
    //   2117: astore 30
    //   2119: aload 30
    //   2121: getfield 1748	org/vidogram/tgnet/g$jb:g	Ljava/lang/String;
    //   2124: astore 32
    //   2126: aload_1
    //   2127: getfield 1200	org/vidogram/messenger/u:b	Ljava/lang/CharSequence;
    //   2130: invokestatic 1483	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   2133: ifeq +53 -> 2186
    //   2136: aload 30
    //   2138: getfield 2164	org/vidogram/tgnet/g$jb:h	Ljava/lang/String;
    //   2141: astore 29
    //   2143: aload 30
    //   2145: getfield 2166	org/vidogram/tgnet/g$jb:i	Lorg/vidogram/tgnet/g$ay;
    //   2148: astore 33
    //   2150: aload 30
    //   2152: getfield 2168	org/vidogram/tgnet/g$jb:j	Lorg/vidogram/tgnet/g$q;
    //   2155: astore 31
    //   2157: aload_0
    //   2158: iconst_0
    //   2159: putfield 907	org/vidogram/ui/c/j:r	Z
    //   2162: ldc_w 2170
    //   2165: astore 30
    //   2167: iconst_0
    //   2168: istore 14
    //   2170: iconst_0
    //   2171: istore 20
    //   2173: aconst_null
    //   2174: astore 35
    //   2176: aconst_null
    //   2177: astore 36
    //   2179: aload 29
    //   2181: astore 34
    //   2183: goto -1038 -> 1145
    //   2186: aconst_null
    //   2187: astore 29
    //   2189: goto -46 -> 2143
    //   2192: astore 29
    //   2194: iconst_0
    //   2195: istore 11
    //   2197: iload 9
    //   2199: istore 8
    //   2201: iload 11
    //   2203: istore 9
    //   2205: ldc_w 713
    //   2208: aload 29
    //   2210: invokestatic 718	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   2213: iload 9
    //   2215: istore 13
    //   2217: iload 12
    //   2219: istore 9
    //   2221: goto -904 -> 1317
    //   2224: aload_0
    //   2225: aload 36
    //   2227: getstatic 364	org/vidogram/ui/c/j:bu	Landroid/text/TextPaint;
    //   2230: iload 24
    //   2232: iload 24
    //   2234: ldc_w 2162
    //   2237: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   2240: isub
    //   2241: iconst_3
    //   2242: iconst_4
    //   2243: invokestatic 2172	org/vidogram/ui/c/j:a	(Ljava/lang/CharSequence;Landroid/text/TextPaint;IIII)Landroid/text/StaticLayout;
    //   2246: putfield 872	org/vidogram/ui/c/j:G	Landroid/text/StaticLayout;
    //   2249: aload_0
    //   2250: getfield 872	org/vidogram/ui/c/j:G	Landroid/text/StaticLayout;
    //   2253: invokevirtual 575	android/text/StaticLayout:getLineCount	()I
    //   2256: istore 11
    //   2258: iconst_3
    //   2259: iload 11
    //   2261: isub
    //   2262: istore 11
    //   2264: goto -854 -> 1410
    //   2267: iload 12
    //   2269: istore 15
    //   2271: iload 9
    //   2273: istore 16
    //   2275: aload_0
    //   2276: aload_0
    //   2277: getfield 874	org/vidogram/ui/c/j:D	I
    //   2280: iload 26
    //   2282: ineg
    //   2283: invokestatic 675	java/lang/Math:max	(II)I
    //   2286: putfield 874	org/vidogram/ui/c/j:D	I
    //   2289: goto -736 -> 1553
    //   2292: astore 29
    //   2294: iload 16
    //   2296: istore 12
    //   2298: iload 8
    //   2300: istore 9
    //   2302: iload 15
    //   2304: istore 8
    //   2306: ldc_w 713
    //   2309: aload 29
    //   2311: invokestatic 718	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   2314: iload 11
    //   2316: istore 16
    //   2318: iload 8
    //   2320: istore 15
    //   2322: iload 9
    //   2324: istore 11
    //   2326: iload 12
    //   2328: istore 8
    //   2330: iload 16
    //   2332: istore 9
    //   2334: aload 35
    //   2336: ifnull +9428 -> 11764
    //   2339: aload_0
    //   2340: getfield 846	org/vidogram/ui/c/j:y	I
    //   2343: ifeq +29 -> 2372
    //   2346: aload_0
    //   2347: aload_0
    //   2348: getfield 846	org/vidogram/ui/c/j:y	I
    //   2351: fconst_2
    //   2352: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   2355: iadd
    //   2356: putfield 846	org/vidogram/ui/c/j:y	I
    //   2359: aload_0
    //   2360: aload_0
    //   2361: getfield 776	org/vidogram/ui/c/j:d	I
    //   2364: fconst_2
    //   2365: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   2368: iadd
    //   2369: putfield 776	org/vidogram/ui/c/j:d	I
    //   2372: iload 9
    //   2374: iconst_3
    //   2375: if_icmpne +421 -> 2796
    //   2378: aload_0
    //   2379: getfield 907	org/vidogram/ui/c/j:r	Z
    //   2382: ifeq +8 -> 2390
    //   2385: aload 34
    //   2387: ifnonnull +409 -> 2796
    //   2390: aload_0
    //   2391: new 269	android/text/StaticLayout
    //   2394: dup
    //   2395: aload 35
    //   2397: getstatic 364	org/vidogram/ui/c/j:bu	Landroid/text/TextPaint;
    //   2400: iload 24
    //   2402: getstatic 567	android/text/Layout$Alignment:ALIGN_NORMAL	Landroid/text/Layout$Alignment;
    //   2405: fconst_1
    //   2406: fconst_0
    //   2407: iconst_0
    //   2408: invokespecial 570	android/text/StaticLayout:<init>	(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;FFZ)V
    //   2411: putfield 876	org/vidogram/ui/c/j:J	Landroid/text/StaticLayout;
    //   2414: aload_0
    //   2415: getfield 876	org/vidogram/ui/c/j:J	Landroid/text/StaticLayout;
    //   2418: aload_0
    //   2419: getfield 876	org/vidogram/ui/c/j:J	Landroid/text/StaticLayout;
    //   2422: invokevirtual 575	android/text/StaticLayout:getLineCount	()I
    //   2425: iconst_1
    //   2426: isub
    //   2427: invokevirtual 833	android/text/StaticLayout:getLineBottom	(I)I
    //   2430: istore 12
    //   2432: aload_0
    //   2433: aload_0
    //   2434: getfield 846	org/vidogram/ui/c/j:y	I
    //   2437: iload 12
    //   2439: iadd
    //   2440: putfield 846	org/vidogram/ui/c/j:y	I
    //   2443: aload_0
    //   2444: iload 12
    //   2446: aload_0
    //   2447: getfield 776	org/vidogram/ui/c/j:d	I
    //   2450: iadd
    //   2451: putfield 776	org/vidogram/ui/c/j:d	I
    //   2454: aload_0
    //   2455: getfield 876	org/vidogram/ui/c/j:J	Landroid/text/StaticLayout;
    //   2458: iconst_0
    //   2459: invokevirtual 579	android/text/StaticLayout:getLineLeft	(I)F
    //   2462: f2i
    //   2463: istore 12
    //   2465: aload_0
    //   2466: iload 12
    //   2468: ineg
    //   2469: putfield 878	org/vidogram/ui/c/j:E	I
    //   2472: iload 12
    //   2474: ifeq +367 -> 2841
    //   2477: aload_0
    //   2478: getfield 876	org/vidogram/ui/c/j:J	Landroid/text/StaticLayout;
    //   2481: invokevirtual 2160	android/text/StaticLayout:getWidth	()I
    //   2484: istore 16
    //   2486: iload 16
    //   2488: iload 12
    //   2490: isub
    //   2491: istore 16
    //   2493: iconst_1
    //   2494: istore 12
    //   2496: iload 8
    //   2498: iload 16
    //   2500: iload 25
    //   2502: iadd
    //   2503: invokestatic 675	java/lang/Math:max	(II)I
    //   2506: istore 17
    //   2508: iload 17
    //   2510: istore 8
    //   2512: iload 11
    //   2514: iload 16
    //   2516: iload 25
    //   2518: iadd
    //   2519: invokestatic 675	java/lang/Math:max	(II)I
    //   2522: istore 16
    //   2524: iload 16
    //   2526: istore 11
    //   2528: iload 9
    //   2530: istore 16
    //   2532: iload 11
    //   2534: istore 9
    //   2536: iload 16
    //   2538: istore 11
    //   2540: aload 34
    //   2542: ifnull +9219 -> 11761
    //   2545: aload_0
    //   2546: iconst_0
    //   2547: putfield 884	org/vidogram/ui/c/j:C	I
    //   2550: aload_0
    //   2551: getfield 773	org/vidogram/ui/c/j:bn	Lorg/vidogram/messenger/u;
    //   2554: invokevirtual 2173	org/vidogram/messenger/u:h	()V
    //   2557: aload_0
    //   2558: getfield 846	org/vidogram/ui/c/j:y	I
    //   2561: ifeq +29 -> 2590
    //   2564: aload_0
    //   2565: aload_0
    //   2566: getfield 846	org/vidogram/ui/c/j:y	I
    //   2569: fconst_2
    //   2570: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   2573: iadd
    //   2574: putfield 846	org/vidogram/ui/c/j:y	I
    //   2577: aload_0
    //   2578: aload_0
    //   2579: getfield 776	org/vidogram/ui/c/j:d	I
    //   2582: fconst_2
    //   2583: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   2586: iadd
    //   2587: putfield 776	org/vidogram/ui/c/j:d	I
    //   2590: iload 11
    //   2592: iconst_3
    //   2593: if_icmpne +299 -> 2892
    //   2596: aload_0
    //   2597: getfield 907	org/vidogram/ui/c/j:r	Z
    //   2600: ifne +292 -> 2892
    //   2603: aload_0
    //   2604: aload_1
    //   2605: getfield 1401	org/vidogram/messenger/u:c	Ljava/lang/CharSequence;
    //   2608: getstatic 366	org/vidogram/ui/c/j:bv	Landroid/text/TextPaint;
    //   2611: iload 24
    //   2613: getstatic 567	android/text/Layout$Alignment:ALIGN_NORMAL	Landroid/text/Layout$Alignment;
    //   2616: fconst_1
    //   2617: fconst_1
    //   2618: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   2621: i2f
    //   2622: iconst_0
    //   2623: getstatic 555	android/text/TextUtils$TruncateAt:END	Landroid/text/TextUtils$TruncateAt;
    //   2626: iload 24
    //   2628: bipush 6
    //   2630: invokestatic 664	org/vidogram/ui/Components/bj:a	(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;FFZLandroid/text/TextUtils$TruncateAt;II)Landroid/text/StaticLayout;
    //   2633: putfield 880	org/vidogram/ui/c/j:H	Landroid/text/StaticLayout;
    //   2636: iconst_0
    //   2637: istore 16
    //   2639: aload_0
    //   2640: getfield 880	org/vidogram/ui/c/j:H	Landroid/text/StaticLayout;
    //   2643: aload_0
    //   2644: getfield 880	org/vidogram/ui/c/j:H	Landroid/text/StaticLayout;
    //   2647: invokevirtual 575	android/text/StaticLayout:getLineCount	()I
    //   2650: iconst_1
    //   2651: isub
    //   2652: invokevirtual 833	android/text/StaticLayout:getLineBottom	(I)I
    //   2655: istore 11
    //   2657: aload_0
    //   2658: aload_0
    //   2659: getfield 846	org/vidogram/ui/c/j:y	I
    //   2662: iload 11
    //   2664: iadd
    //   2665: putfield 846	org/vidogram/ui/c/j:y	I
    //   2668: aload_0
    //   2669: iload 11
    //   2671: aload_0
    //   2672: getfield 776	org/vidogram/ui/c/j:d	I
    //   2675: iadd
    //   2676: putfield 776	org/vidogram/ui/c/j:d	I
    //   2679: iconst_0
    //   2680: istore 17
    //   2682: iconst_0
    //   2683: istore 11
    //   2685: iload 11
    //   2687: aload_0
    //   2688: getfield 880	org/vidogram/ui/c/j:H	Landroid/text/StaticLayout;
    //   2691: invokevirtual 575	android/text/StaticLayout:getLineCount	()I
    //   2694: if_icmpge +1588 -> 4282
    //   2697: aload_0
    //   2698: getfield 880	org/vidogram/ui/c/j:H	Landroid/text/StaticLayout;
    //   2701: iload 11
    //   2703: invokevirtual 579	android/text/StaticLayout:getLineLeft	(I)F
    //   2706: f2d
    //   2707: invokestatic 506	java/lang/Math:ceil	(D)D
    //   2710: d2i
    //   2711: istore 21
    //   2713: iload 21
    //   2715: ifeq +20 -> 2735
    //   2718: iconst_1
    //   2719: istore 17
    //   2721: aload_0
    //   2722: getfield 884	org/vidogram/ui/c/j:C	I
    //   2725: ifne +203 -> 2928
    //   2728: aload_0
    //   2729: iload 21
    //   2731: ineg
    //   2732: putfield 884	org/vidogram/ui/c/j:C	I
    //   2735: iload 11
    //   2737: iconst_1
    //   2738: iadd
    //   2739: istore 11
    //   2741: goto -56 -> 2685
    //   2744: iload 12
    //   2746: istore 15
    //   2748: iload 9
    //   2750: istore 16
    //   2752: aload_0
    //   2753: getfield 872	org/vidogram/ui/c/j:G	Landroid/text/StaticLayout;
    //   2756: iload 22
    //   2758: invokevirtual 672	android/text/StaticLayout:getLineWidth	(I)F
    //   2761: f2d
    //   2762: invokestatic 506	java/lang/Math:ceil	(D)D
    //   2765: dstore_2
    //   2766: dload_2
    //   2767: d2i
    //   2768: istore 17
    //   2770: goto -1192 -> 1578
    //   2773: iload 11
    //   2775: istore 15
    //   2777: iload 8
    //   2779: istore 11
    //   2781: iload 9
    //   2783: istore 8
    //   2785: iload 15
    //   2787: istore 9
    //   2789: iload 12
    //   2791: istore 15
    //   2793: goto -459 -> 2334
    //   2796: aload_0
    //   2797: aload 35
    //   2799: getstatic 364	org/vidogram/ui/c/j:bu	Landroid/text/TextPaint;
    //   2802: iload 24
    //   2804: iload 24
    //   2806: ldc_w 2162
    //   2809: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   2812: isub
    //   2813: iload 9
    //   2815: iconst_1
    //   2816: invokestatic 2172	org/vidogram/ui/c/j:a	(Ljava/lang/CharSequence;Landroid/text/TextPaint;IIII)Landroid/text/StaticLayout;
    //   2819: putfield 876	org/vidogram/ui/c/j:J	Landroid/text/StaticLayout;
    //   2822: aload_0
    //   2823: getfield 876	org/vidogram/ui/c/j:J	Landroid/text/StaticLayout;
    //   2826: invokevirtual 575	android/text/StaticLayout:getLineCount	()I
    //   2829: istore 12
    //   2831: iload 9
    //   2833: iload 12
    //   2835: isub
    //   2836: istore 9
    //   2838: goto -424 -> 2414
    //   2841: aload_0
    //   2842: getfield 876	org/vidogram/ui/c/j:J	Landroid/text/StaticLayout;
    //   2845: iconst_0
    //   2846: invokevirtual 672	android/text/StaticLayout:getLineWidth	(I)F
    //   2849: f2d
    //   2850: invokestatic 506	java/lang/Math:ceil	(D)D
    //   2853: dstore_2
    //   2854: dload_2
    //   2855: d2i
    //   2856: istore 16
    //   2858: iconst_0
    //   2859: istore 12
    //   2861: goto -365 -> 2496
    //   2864: astore 29
    //   2866: iconst_0
    //   2867: istore 12
    //   2869: ldc_w 713
    //   2872: aload 29
    //   2874: invokestatic 718	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   2877: iload 9
    //   2879: istore 16
    //   2881: iload 11
    //   2883: istore 9
    //   2885: iload 16
    //   2887: istore 11
    //   2889: goto -349 -> 2540
    //   2892: aload_0
    //   2893: aload_1
    //   2894: getfield 1401	org/vidogram/messenger/u:c	Ljava/lang/CharSequence;
    //   2897: getstatic 366	org/vidogram/ui/c/j:bv	Landroid/text/TextPaint;
    //   2900: iload 24
    //   2902: iload 24
    //   2904: ldc_w 2162
    //   2907: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   2910: isub
    //   2911: iload 11
    //   2913: bipush 6
    //   2915: invokestatic 2172	org/vidogram/ui/c/j:a	(Ljava/lang/CharSequence;Landroid/text/TextPaint;IIII)Landroid/text/StaticLayout;
    //   2918: putfield 880	org/vidogram/ui/c/j:H	Landroid/text/StaticLayout;
    //   2921: iload 11
    //   2923: istore 16
    //   2925: goto -286 -> 2639
    //   2928: aload_0
    //   2929: aload_0
    //   2930: getfield 884	org/vidogram/ui/c/j:C	I
    //   2933: iload 21
    //   2935: ineg
    //   2936: invokestatic 675	java/lang/Math:max	(II)I
    //   2939: putfield 884	org/vidogram/ui/c/j:C	I
    //   2942: goto -207 -> 2735
    //   2945: astore 29
    //   2947: ldc_w 713
    //   2950: aload 29
    //   2952: invokestatic 718	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   2955: iload 14
    //   2957: istore 11
    //   2959: iload 14
    //   2961: ifeq +44 -> 3005
    //   2964: aload_0
    //   2965: getfield 880	org/vidogram/ui/c/j:H	Landroid/text/StaticLayout;
    //   2968: ifnull +29 -> 2997
    //   2971: iload 14
    //   2973: istore 11
    //   2975: aload_0
    //   2976: getfield 880	org/vidogram/ui/c/j:H	Landroid/text/StaticLayout;
    //   2979: ifnull +26 -> 3005
    //   2982: iload 14
    //   2984: istore 11
    //   2986: aload_0
    //   2987: getfield 880	org/vidogram/ui/c/j:H	Landroid/text/StaticLayout;
    //   2990: invokevirtual 575	android/text/StaticLayout:getLineCount	()I
    //   2993: iconst_1
    //   2994: if_icmpne +11 -> 3005
    //   2997: iconst_0
    //   2998: istore 11
    //   3000: aload_0
    //   3001: iconst_0
    //   3002: putfield 907	org/vidogram/ui/c/j:r	Z
    //   3005: iload 11
    //   3007: ifeq +1506 -> 4513
    //   3010: ldc_w 1025
    //   3013: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   3016: istore 9
    //   3018: aload 31
    //   3020: ifnull +2439 -> 5459
    //   3023: aload 31
    //   3025: invokestatic 2175	org/vidogram/messenger/u:a	(Lorg/vidogram/tgnet/g$q;)Z
    //   3028: ifeq +1507 -> 4535
    //   3031: invokestatic 409	org/vidogram/messenger/MediaController:a	()Lorg/vidogram/messenger/MediaController;
    //   3034: invokevirtual 1475	org/vidogram/messenger/MediaController:B	()Z
    //   3037: ifne +8 -> 3045
    //   3040: aload_1
    //   3041: fconst_1
    //   3042: putfield 1445	org/vidogram/messenger/u:k	F
    //   3045: aload_0
    //   3046: getfield 418	org/vidogram/ui/c/j:o	Lorg/vidogram/messenger/q;
    //   3049: astore 29
    //   3051: aload_1
    //   3052: getfield 1445	org/vidogram/messenger/u:k	F
    //   3055: fconst_1
    //   3056: fcmpl
    //   3057: ifeq +1463 -> 4520
    //   3060: iconst_1
    //   3061: istore 28
    //   3063: aload 29
    //   3065: iload 28
    //   3067: invokevirtual 1467	org/vidogram/messenger/q:g	(Z)V
    //   3070: aload_0
    //   3071: aload 31
    //   3073: getfield 629	org/vidogram/tgnet/g$q:i	Lorg/vidogram/tgnet/g$az;
    //   3076: putfield 698	org/vidogram/ui/c/j:ah	Lorg/vidogram/tgnet/g$az;
    //   3079: aload_0
    //   3080: getfield 698	org/vidogram/ui/c/j:ah	Lorg/vidogram/tgnet/g$az;
    //   3083: ifnull +148 -> 3231
    //   3086: aload_0
    //   3087: getfield 698	org/vidogram/ui/c/j:ah	Lorg/vidogram/tgnet/g$az;
    //   3090: getfield 2176	org/vidogram/tgnet/g$az:d	I
    //   3093: ifeq +13 -> 3106
    //   3096: aload_0
    //   3097: getfield 698	org/vidogram/ui/c/j:ah	Lorg/vidogram/tgnet/g$az;
    //   3100: getfield 2177	org/vidogram/tgnet/g$az:e	I
    //   3103: ifne +128 -> 3231
    //   3106: iconst_0
    //   3107: istore 12
    //   3109: iload 12
    //   3111: aload 31
    //   3113: getfield 480	org/vidogram/tgnet/g$q:o	Ljava/util/ArrayList;
    //   3116: invokevirtual 483	java/util/ArrayList:size	()I
    //   3119: if_icmpge +58 -> 3177
    //   3122: aload 31
    //   3124: getfield 480	org/vidogram/tgnet/g$q:o	Ljava/util/ArrayList;
    //   3127: iload 12
    //   3129: invokevirtual 487	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   3132: checkcast 489	org/vidogram/tgnet/g$r
    //   3135: astore 29
    //   3137: aload 29
    //   3139: instanceof 2179
    //   3142: ifne +11 -> 3153
    //   3145: aload 29
    //   3147: instanceof 605
    //   3150: ifeq +1376 -> 4526
    //   3153: aload_0
    //   3154: getfield 698	org/vidogram/ui/c/j:ah	Lorg/vidogram/tgnet/g$az;
    //   3157: aload 29
    //   3159: getfield 2180	org/vidogram/tgnet/g$r:h	I
    //   3162: putfield 2176	org/vidogram/tgnet/g$az:d	I
    //   3165: aload_0
    //   3166: getfield 698	org/vidogram/ui/c/j:ah	Lorg/vidogram/tgnet/g$az;
    //   3169: aload 29
    //   3171: getfield 2182	org/vidogram/tgnet/g$r:i	I
    //   3174: putfield 2177	org/vidogram/tgnet/g$az:e	I
    //   3177: aload_0
    //   3178: getfield 698	org/vidogram/ui/c/j:ah	Lorg/vidogram/tgnet/g$az;
    //   3181: getfield 2176	org/vidogram/tgnet/g$az:d	I
    //   3184: ifeq +13 -> 3197
    //   3187: aload_0
    //   3188: getfield 698	org/vidogram/ui/c/j:ah	Lorg/vidogram/tgnet/g$az;
    //   3191: getfield 2177	org/vidogram/tgnet/g$az:e	I
    //   3194: ifne +37 -> 3231
    //   3197: aload_0
    //   3198: getfield 698	org/vidogram/ui/c/j:ah	Lorg/vidogram/tgnet/g$az;
    //   3201: astore 29
    //   3203: aload_0
    //   3204: getfield 698	org/vidogram/ui/c/j:ah	Lorg/vidogram/tgnet/g$az;
    //   3207: astore 33
    //   3209: ldc_w 2183
    //   3212: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   3215: istore 12
    //   3217: aload 33
    //   3219: iload 12
    //   3221: putfield 2177	org/vidogram/tgnet/g$az:e	I
    //   3224: aload 29
    //   3226: iload 12
    //   3228: putfield 2176	org/vidogram/tgnet/g$az:d	I
    //   3231: aload_0
    //   3232: iconst_2
    //   3233: putfield 476	org/vidogram/ui/c/j:t	I
    //   3236: aload_0
    //   3237: getfield 476	org/vidogram/ui/c/j:t	I
    //   3240: iconst_5
    //   3241: if_icmpeq +596 -> 3837
    //   3244: aload_0
    //   3245: getfield 476	org/vidogram/ui/c/j:t	I
    //   3248: iconst_3
    //   3249: if_icmpeq +588 -> 3837
    //   3252: aload_0
    //   3253: getfield 476	org/vidogram/ui/c/j:t	I
    //   3256: iconst_1
    //   3257: if_icmpeq +580 -> 3837
    //   3260: aload_0
    //   3261: getfield 698	org/vidogram/ui/c/j:ah	Lorg/vidogram/tgnet/g$az;
    //   3264: ifnull +2955 -> 6219
    //   3267: aload 30
    //   3269: ifnull +2312 -> 5581
    //   3272: aload 30
    //   3274: ldc_w 2185
    //   3277: invokevirtual 1309	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   3280: ifne +42 -> 3322
    //   3283: aload 30
    //   3285: ldc_w 2187
    //   3288: invokevirtual 1309	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   3291: ifeq +12 -> 3303
    //   3294: aload_0
    //   3295: getfield 476	org/vidogram/ui/c/j:t	I
    //   3298: bipush 6
    //   3300: if_icmpne +22 -> 3322
    //   3303: aload 30
    //   3305: ldc_w 2189
    //   3308: invokevirtual 1309	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   3311: ifne +11 -> 3322
    //   3314: aload_0
    //   3315: getfield 476	org/vidogram/ui/c/j:t	I
    //   3318: iconst_4
    //   3319: if_icmpne +2262 -> 5581
    //   3322: iconst_1
    //   3323: istore 28
    //   3325: aload_0
    //   3326: iload 28
    //   3328: putfield 1024	org/vidogram/ui/c/j:s	Z
    //   3331: aload_0
    //   3332: getfield 846	org/vidogram/ui/c/j:y	I
    //   3335: ifeq +29 -> 3364
    //   3338: aload_0
    //   3339: aload_0
    //   3340: getfield 846	org/vidogram/ui/c/j:y	I
    //   3343: fconst_2
    //   3344: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   3347: iadd
    //   3348: putfield 846	org/vidogram/ui/c/j:y	I
    //   3351: aload_0
    //   3352: aload_0
    //   3353: getfield 776	org/vidogram/ui/c/j:d	I
    //   3356: fconst_2
    //   3357: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   3360: iadd
    //   3361: putfield 776	org/vidogram/ui/c/j:d	I
    //   3364: aload_0
    //   3365: getfield 476	org/vidogram/ui/c/j:t	I
    //   3368: bipush 6
    //   3370: if_icmpne +20 -> 3390
    //   3373: invokestatic 1632	org/vidogram/messenger/a:c	()Z
    //   3376: ifeq +2211 -> 5587
    //   3379: invokestatic 1634	org/vidogram/messenger/a:e	()I
    //   3382: i2f
    //   3383: ldc_w 2190
    //   3386: fmul
    //   3387: f2i
    //   3388: istore 9
    //   3390: iload 8
    //   3392: iload 9
    //   3394: iload 25
    //   3396: iadd
    //   3397: invokestatic 675	java/lang/Math:max	(II)I
    //   3400: istore 12
    //   3402: aload_0
    //   3403: getfield 698	org/vidogram/ui/c/j:ah	Lorg/vidogram/tgnet/g$az;
    //   3406: iconst_m1
    //   3407: putfield 1440	org/vidogram/tgnet/g$az:f	I
    //   3410: aload_0
    //   3411: getfield 1439	org/vidogram/ui/c/j:ai	Lorg/vidogram/tgnet/g$az;
    //   3414: ifnull +11 -> 3425
    //   3417: aload_0
    //   3418: getfield 1439	org/vidogram/ui/c/j:ai	Lorg/vidogram/tgnet/g$az;
    //   3421: iconst_m1
    //   3422: putfield 1440	org/vidogram/tgnet/g$az:f	I
    //   3425: iload 11
    //   3427: ifeq +2177 -> 5604
    //   3430: iload 9
    //   3432: istore 8
    //   3434: aload_0
    //   3435: getfield 907	org/vidogram/ui/c/j:r	Z
    //   3438: ifeq +2326 -> 5764
    //   3441: ldc_w 1545
    //   3444: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   3447: iload 13
    //   3449: iadd
    //   3450: aload_0
    //   3451: getfield 846	org/vidogram/ui/c/j:y	I
    //   3454: if_icmple +46 -> 3500
    //   3457: aload_0
    //   3458: aload_0
    //   3459: getfield 776	org/vidogram/ui/c/j:d	I
    //   3462: ldc_w 1545
    //   3465: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   3468: iload 13
    //   3470: iadd
    //   3471: aload_0
    //   3472: getfield 846	org/vidogram/ui/c/j:y	I
    //   3475: isub
    //   3476: ldc_w 903
    //   3479: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   3482: iadd
    //   3483: iadd
    //   3484: putfield 776	org/vidogram/ui/c/j:d	I
    //   3487: aload_0
    //   3488: ldc_w 1545
    //   3491: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   3494: iload 13
    //   3496: iadd
    //   3497: putfield 846	org/vidogram/ui/c/j:y	I
    //   3500: aload_0
    //   3501: aload_0
    //   3502: getfield 846	org/vidogram/ui/c/j:y	I
    //   3505: ldc_w 903
    //   3508: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   3511: isub
    //   3512: putfield 846	org/vidogram/ui/c/j:y	I
    //   3515: aload_0
    //   3516: getfield 418	org/vidogram/ui/c/j:o	Lorg/vidogram/messenger/q;
    //   3519: iconst_0
    //   3520: iconst_0
    //   3521: iload 9
    //   3523: iload 8
    //   3525: invokevirtual 915	org/vidogram/messenger/q:a	(IIII)V
    //   3528: aload_0
    //   3529: getstatic 1294	java/util/Locale:US	Ljava/util/Locale;
    //   3532: ldc_w 2192
    //   3535: iconst_2
    //   3536: anewarray 591	java/lang/Object
    //   3539: dup
    //   3540: iconst_0
    //   3541: iload 9
    //   3543: invokestatic 597	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   3546: aastore
    //   3547: dup
    //   3548: iconst_1
    //   3549: iload 8
    //   3551: invokestatic 597	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   3554: aastore
    //   3555: invokestatic 1305	java/lang/String:format	(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   3558: putfield 708	org/vidogram/ui/c/j:aj	Ljava/lang/String;
    //   3561: aload_0
    //   3562: getstatic 1294	java/util/Locale:US	Ljava/util/Locale;
    //   3565: ldc_w 2194
    //   3568: iconst_2
    //   3569: anewarray 591	java/lang/Object
    //   3572: dup
    //   3573: iconst_0
    //   3574: iload 9
    //   3576: invokestatic 597	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   3579: aastore
    //   3580: dup
    //   3581: iconst_1
    //   3582: iload 8
    //   3584: invokestatic 597	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   3587: aastore
    //   3588: invokestatic 1305	java/lang/String:format	(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   3591: putfield 1453	org/vidogram/ui/c/j:ak	Ljava/lang/String;
    //   3594: aload_0
    //   3595: getfield 476	org/vidogram/ui/c/j:t	I
    //   3598: bipush 6
    //   3600: if_icmpne +2202 -> 5802
    //   3603: aload_0
    //   3604: getfield 418	org/vidogram/ui/c/j:o	Lorg/vidogram/messenger/q;
    //   3607: astore 31
    //   3609: aload_0
    //   3610: getfield 469	org/vidogram/ui/c/j:u	Lorg/vidogram/tgnet/g$q;
    //   3613: astore 32
    //   3615: aload_0
    //   3616: getfield 708	org/vidogram/ui/c/j:aj	Ljava/lang/String;
    //   3619: astore 33
    //   3621: aload_0
    //   3622: getfield 698	org/vidogram/ui/c/j:ah	Lorg/vidogram/tgnet/g$az;
    //   3625: ifnull +2171 -> 5796
    //   3628: aload_0
    //   3629: getfield 698	org/vidogram/ui/c/j:ah	Lorg/vidogram/tgnet/g$az;
    //   3632: getfield 635	org/vidogram/tgnet/g$az:c	Lorg/vidogram/tgnet/g$x;
    //   3635: astore 29
    //   3637: aload 31
    //   3639: aload 32
    //   3641: aconst_null
    //   3642: aload 33
    //   3644: aconst_null
    //   3645: aload 29
    //   3647: ldc_w 2196
    //   3650: aload_0
    //   3651: getfield 469	org/vidogram/ui/c/j:u	Lorg/vidogram/tgnet/g$q;
    //   3654: getfield 609	org/vidogram/tgnet/g$q:h	I
    //   3657: ldc_w 2198
    //   3660: iconst_1
    //   3661: invokevirtual 711	org/vidogram/messenger/q:a	(Lorg/vidogram/tgnet/f;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/drawable/Drawable;Lorg/vidogram/tgnet/g$x;Ljava/lang/String;ILjava/lang/String;Z)V
    //   3664: aload_0
    //   3665: iconst_1
    //   3666: putfield 639	org/vidogram/ui/c/j:v	Z
    //   3669: aload 30
    //   3671: ifnull +2481 -> 6152
    //   3674: aload 30
    //   3676: ldc_w 2200
    //   3679: invokevirtual 1309	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   3682: ifeq +2470 -> 6152
    //   3685: iload 20
    //   3687: ifeq +2465 -> 6152
    //   3690: iload 20
    //   3692: bipush 60
    //   3694: idiv
    //   3695: istore 8
    //   3697: ldc_w 2202
    //   3700: iconst_2
    //   3701: anewarray 591	java/lang/Object
    //   3704: dup
    //   3705: iconst_0
    //   3706: iload 8
    //   3708: invokestatic 597	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   3711: aastore
    //   3712: dup
    //   3713: iconst_1
    //   3714: iload 20
    //   3716: iload 8
    //   3718: bipush 60
    //   3720: imul
    //   3721: isub
    //   3722: invokestatic 597	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   3725: aastore
    //   3726: invokestatic 601	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   3729: astore 29
    //   3731: aload_0
    //   3732: getstatic 354	org/vidogram/ui/c/j:av	Landroid/text/TextPaint;
    //   3735: aload 29
    //   3737: invokevirtual 500	android/text/TextPaint:measureText	(Ljava/lang/String;)F
    //   3740: f2d
    //   3741: invokestatic 506	java/lang/Math:ceil	(D)D
    //   3744: d2i
    //   3745: putfield 933	org/vidogram/ui/c/j:B	I
    //   3748: aload_0
    //   3749: new 269	android/text/StaticLayout
    //   3752: dup
    //   3753: aload 29
    //   3755: getstatic 354	org/vidogram/ui/c/j:av	Landroid/text/TextPaint;
    //   3758: aload_0
    //   3759: getfield 933	org/vidogram/ui/c/j:B	I
    //   3762: getstatic 567	android/text/Layout$Alignment:ALIGN_NORMAL	Landroid/text/Layout$Alignment;
    //   3765: fconst_1
    //   3766: fconst_0
    //   3767: iconst_0
    //   3768: invokespecial 570	android/text/StaticLayout:<init>	(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;FFZ)V
    //   3771: putfield 920	org/vidogram/ui/c/j:I	Landroid/text/StaticLayout;
    //   3774: iload 12
    //   3776: istore 8
    //   3778: aload_0
    //   3779: getfield 771	org/vidogram/ui/c/j:x	Z
    //   3782: ifeq +45 -> 3827
    //   3785: aload_1
    //   3786: getfield 868	org/vidogram/messenger/u:x	I
    //   3789: ifeq +38 -> 3827
    //   3792: aload_0
    //   3793: aload_0
    //   3794: getfield 846	org/vidogram/ui/c/j:y	I
    //   3797: aload_1
    //   3798: getfield 868	org/vidogram/messenger/u:x	I
    //   3801: ldc_w 926
    //   3804: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   3807: iadd
    //   3808: iadd
    //   3809: putfield 846	org/vidogram/ui/c/j:y	I
    //   3812: aload_0
    //   3813: aload_0
    //   3814: getfield 776	org/vidogram/ui/c/j:d	I
    //   3817: ldc_w 869
    //   3820: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   3823: iadd
    //   3824: putfield 776	org/vidogram/ui/c/j:d	I
    //   3827: aload_0
    //   3828: iload 10
    //   3830: iload 19
    //   3832: iload 8
    //   3834: invokespecial 2203	org/vidogram/ui/c/j:a	(III)V
    //   3837: aload_0
    //   3838: getfield 1017	org/vidogram/ui/c/j:M	Landroid/text/StaticLayout;
    //   3841: ifnonnull +219 -> 4060
    //   3844: aload_1
    //   3845: getfield 1275	org/vidogram/messenger/u:d	Ljava/lang/CharSequence;
    //   3848: ifnull +212 -> 4060
    //   3851: aload_1
    //   3852: getfield 450	org/vidogram/messenger/u:f	I
    //   3855: bipush 13
    //   3857: if_icmpeq +203 -> 4060
    //   3860: aload_0
    //   3861: getfield 267	org/vidogram/ui/c/j:bx	I
    //   3864: ldc_w 777
    //   3867: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   3870: isub
    //   3871: istore 9
    //   3873: aload_0
    //   3874: new 269	android/text/StaticLayout
    //   3877: dup
    //   3878: aload_1
    //   3879: getfield 1275	org/vidogram/messenger/u:d	Ljava/lang/CharSequence;
    //   3882: invokestatic 2206	org/vidogram/messenger/u:b	()Landroid/text/TextPaint;
    //   3885: iload 9
    //   3887: ldc_w 517
    //   3890: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   3893: isub
    //   3894: getstatic 567	android/text/Layout$Alignment:ALIGN_NORMAL	Landroid/text/Layout$Alignment;
    //   3897: fconst_1
    //   3898: fconst_0
    //   3899: iconst_0
    //   3900: invokespecial 570	android/text/StaticLayout:<init>	(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;FFZ)V
    //   3903: putfield 1017	org/vidogram/ui/c/j:M	Landroid/text/StaticLayout;
    //   3906: aload_0
    //   3907: getfield 1017	org/vidogram/ui/c/j:M	Landroid/text/StaticLayout;
    //   3910: invokevirtual 575	android/text/StaticLayout:getLineCount	()I
    //   3913: ifle +147 -> 4060
    //   3916: aload_0
    //   3917: getfield 514	org/vidogram/ui/c/j:cj	I
    //   3920: istore 10
    //   3922: aload_1
    //   3923: invokevirtual 524	org/vidogram/messenger/u:k	()Z
    //   3926: ifeq +7168 -> 11094
    //   3929: ldc_w 1533
    //   3932: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   3935: istore 8
    //   3937: aload_0
    //   3938: aload_0
    //   3939: getfield 1017	org/vidogram/ui/c/j:M	Landroid/text/StaticLayout;
    //   3942: invokevirtual 1978	android/text/StaticLayout:getHeight	()I
    //   3945: putfield 1080	org/vidogram/ui/c/j:P	I
    //   3948: aload_0
    //   3949: aload_0
    //   3950: getfield 776	org/vidogram/ui/c/j:d	I
    //   3953: aload_0
    //   3954: getfield 1080	org/vidogram/ui/c/j:P	I
    //   3957: ldc_w 1075
    //   3960: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   3963: iadd
    //   3964: iadd
    //   3965: putfield 776	org/vidogram/ui/c/j:d	I
    //   3968: aload_0
    //   3969: getfield 1017	org/vidogram/ui/c/j:M	Landroid/text/StaticLayout;
    //   3972: aload_0
    //   3973: getfield 1017	org/vidogram/ui/c/j:M	Landroid/text/StaticLayout;
    //   3976: invokevirtual 575	android/text/StaticLayout:getLineCount	()I
    //   3979: iconst_1
    //   3980: isub
    //   3981: invokevirtual 672	android/text/StaticLayout:getLineWidth	(I)F
    //   3984: fstore 6
    //   3986: aload_0
    //   3987: getfield 1017	org/vidogram/ui/c/j:M	Landroid/text/StaticLayout;
    //   3990: aload_0
    //   3991: getfield 1017	org/vidogram/ui/c/j:M	Landroid/text/StaticLayout;
    //   3994: invokevirtual 575	android/text/StaticLayout:getLineCount	()I
    //   3997: iconst_1
    //   3998: isub
    //   3999: invokevirtual 579	android/text/StaticLayout:getLineLeft	(I)F
    //   4002: fstore 7
    //   4004: iload 9
    //   4006: ldc_w 903
    //   4009: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   4012: isub
    //   4013: i2f
    //   4014: fload 6
    //   4016: fload 7
    //   4018: fadd
    //   4019: fsub
    //   4020: iload 8
    //   4022: iload 10
    //   4024: iadd
    //   4025: i2f
    //   4026: fcmpg
    //   4027: ifge +33 -> 4060
    //   4030: aload_0
    //   4031: aload_0
    //   4032: getfield 776	org/vidogram/ui/c/j:d	I
    //   4035: ldc_w 387
    //   4038: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   4041: iadd
    //   4042: putfield 776	org/vidogram/ui/c/j:d	I
    //   4045: aload_0
    //   4046: aload_0
    //   4047: getfield 1080	org/vidogram/ui/c/j:P	I
    //   4050: ldc_w 387
    //   4053: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   4056: iadd
    //   4057: putfield 1080	org/vidogram/ui/c/j:P	I
    //   4060: aload_0
    //   4061: getfield 256	org/vidogram/ui/c/j:aX	Ljava/util/ArrayList;
    //   4064: invokevirtual 1273	java/util/ArrayList:clear	()V
    //   4067: iload 18
    //   4069: ifeq +10 -> 4079
    //   4072: aload_0
    //   4073: getfield 261	org/vidogram/ui/c/j:aY	Ljava/util/HashMap;
    //   4076: invokevirtual 2207	java/util/HashMap:clear	()V
    //   4079: aload_1
    //   4080: getfield 453	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   4083: getfield 2210	org/vidogram/tgnet/g$ar:r	Lorg/vidogram/tgnet/g$bb;
    //   4086: instanceof 2212
    //   4089: ifeq +7456 -> 11545
    //   4092: aload_1
    //   4093: getfield 453	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   4096: getfield 2210	org/vidogram/tgnet/g$ar:r	Lorg/vidogram/tgnet/g$bb;
    //   4099: getfield 2216	org/vidogram/tgnet/g$bb:b	Ljava/util/ArrayList;
    //   4102: invokevirtual 483	java/util/ArrayList:size	()I
    //   4105: istore 12
    //   4107: ldc_w 1025
    //   4110: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   4113: iload 12
    //   4115: imul
    //   4116: fconst_1
    //   4117: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   4120: iadd
    //   4121: istore 8
    //   4123: aload_0
    //   4124: iload 8
    //   4126: putfield 2059	org/vidogram/ui/c/j:e	I
    //   4129: aload_0
    //   4130: iload 8
    //   4132: putfield 2032	org/vidogram/ui/c/j:bj	I
    //   4135: aload_0
    //   4136: aload_0
    //   4137: getfield 267	org/vidogram/ui/c/j:bx	I
    //   4140: putfield 1098	org/vidogram/ui/c/j:aZ	I
    //   4143: aload_1
    //   4144: getfield 2217	org/vidogram/messenger/u:q	I
    //   4147: aload_0
    //   4148: getfield 1098	org/vidogram/ui/c/j:aZ	I
    //   4151: if_icmple +7502 -> 11653
    //   4154: aload_0
    //   4155: getfield 1586	org/vidogram/ui/c/j:a	Z
    //   4158: ifeq +6955 -> 11113
    //   4161: aload_1
    //   4162: invokevirtual 1338	org/vidogram/messenger/u:l	()Z
    //   4165: ifeq +6948 -> 11113
    //   4168: aload_1
    //   4169: invokevirtual 524	org/vidogram/messenger/u:k	()Z
    //   4172: ifne +6941 -> 11113
    //   4175: ldc_w 2218
    //   4178: fstore 6
    //   4180: fload 6
    //   4182: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   4185: ineg
    //   4186: istore 8
    //   4188: invokestatic 1632	org/vidogram/messenger/a:c	()Z
    //   4191: ifeq +6930 -> 11121
    //   4194: iload 8
    //   4196: invokestatic 1634	org/vidogram/messenger/a:e	()I
    //   4199: iadd
    //   4200: istore 8
    //   4202: aload_0
    //   4203: aload_0
    //   4204: getfield 267	org/vidogram/ui/c/j:bx	I
    //   4207: aload_1
    //   4208: getfield 2217	org/vidogram/messenger/u:q	I
    //   4211: iload 8
    //   4213: invokestatic 521	java/lang/Math:min	(II)I
    //   4216: invokestatic 675	java/lang/Math:max	(II)I
    //   4219: putfield 1098	org/vidogram/ui/c/j:aZ	I
    //   4222: iconst_1
    //   4223: istore 9
    //   4225: iconst_0
    //   4226: istore 8
    //   4228: iconst_0
    //   4229: istore 10
    //   4231: iload 10
    //   4233: iload 12
    //   4235: if_icmpge +7293 -> 11528
    //   4238: aload_1
    //   4239: getfield 453	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   4242: getfield 2210	org/vidogram/tgnet/g$ar:r	Lorg/vidogram/tgnet/g$bb;
    //   4245: getfield 2216	org/vidogram/tgnet/g$bb:b	Ljava/util/ArrayList;
    //   4248: iload 10
    //   4250: invokevirtual 487	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   4253: checkcast 2220	org/vidogram/tgnet/g$mc
    //   4256: astore 29
    //   4258: aload 29
    //   4260: getfield 2222	org/vidogram/tgnet/g$mc:c	Ljava/util/ArrayList;
    //   4263: invokevirtual 483	java/util/ArrayList:size	()I
    //   4266: istore 11
    //   4268: iload 11
    //   4270: ifne +6874 -> 11144
    //   4273: iload 10
    //   4275: iconst_1
    //   4276: iadd
    //   4277: istore 10
    //   4279: goto -48 -> 4231
    //   4282: iconst_0
    //   4283: istore 21
    //   4285: iload 9
    //   4287: istore 11
    //   4289: iload 21
    //   4291: aload_0
    //   4292: getfield 880	org/vidogram/ui/c/j:H	Landroid/text/StaticLayout;
    //   4295: invokevirtual 575	android/text/StaticLayout:getLineCount	()I
    //   4298: if_icmpge +212 -> 4510
    //   4301: aload_0
    //   4302: getfield 880	org/vidogram/ui/c/j:H	Landroid/text/StaticLayout;
    //   4305: iload 21
    //   4307: invokevirtual 579	android/text/StaticLayout:getLineLeft	(I)F
    //   4310: f2d
    //   4311: invokestatic 506	java/lang/Math:ceil	(D)D
    //   4314: d2i
    //   4315: istore 22
    //   4317: iload 22
    //   4319: ifne +15 -> 4334
    //   4322: aload_0
    //   4323: getfield 884	org/vidogram/ui/c/j:C	I
    //   4326: ifeq +8 -> 4334
    //   4329: aload_0
    //   4330: iconst_0
    //   4331: putfield 884	org/vidogram/ui/c/j:C	I
    //   4334: iload 22
    //   4336: ifeq +136 -> 4472
    //   4339: aload_0
    //   4340: getfield 880	org/vidogram/ui/c/j:H	Landroid/text/StaticLayout;
    //   4343: invokevirtual 2160	android/text/StaticLayout:getWidth	()I
    //   4346: iload 22
    //   4348: isub
    //   4349: istore 9
    //   4351: iload 21
    //   4353: iload 16
    //   4355: if_icmplt +20 -> 4375
    //   4358: iload 16
    //   4360: ifeq +7394 -> 11754
    //   4363: iload 22
    //   4365: ifeq +7389 -> 11754
    //   4368: aload_0
    //   4369: getfield 907	org/vidogram/ui/c/j:r	Z
    //   4372: ifeq +7382 -> 11754
    //   4375: iload 9
    //   4377: ldc_w 2162
    //   4380: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   4383: iadd
    //   4384: istore 22
    //   4386: iload 11
    //   4388: iload 22
    //   4390: iload 25
    //   4392: iadd
    //   4393: if_icmpge +7354 -> 11747
    //   4396: iload 15
    //   4398: ifeq +20 -> 4418
    //   4401: aload_0
    //   4402: aload_0
    //   4403: getfield 874	org/vidogram/ui/c/j:D	I
    //   4406: iload 22
    //   4408: iload 25
    //   4410: iadd
    //   4411: iload 11
    //   4413: isub
    //   4414: iadd
    //   4415: putfield 874	org/vidogram/ui/c/j:D	I
    //   4418: iload 12
    //   4420: ifeq +7406 -> 11826
    //   4423: aload_0
    //   4424: aload_0
    //   4425: getfield 878	org/vidogram/ui/c/j:E	I
    //   4428: iload 22
    //   4430: iload 25
    //   4432: iadd
    //   4433: iload 11
    //   4435: isub
    //   4436: iadd
    //   4437: putfield 878	org/vidogram/ui/c/j:E	I
    //   4440: goto +7386 -> 11826
    //   4443: iload 8
    //   4445: iload 22
    //   4447: iload 25
    //   4449: iadd
    //   4450: invokestatic 675	java/lang/Math:max	(II)I
    //   4453: istore 11
    //   4455: iload 21
    //   4457: iconst_1
    //   4458: iadd
    //   4459: istore 21
    //   4461: iload 11
    //   4463: istore 8
    //   4465: iload 9
    //   4467: istore 11
    //   4469: goto -180 -> 4289
    //   4472: iload 17
    //   4474: ifeq +15 -> 4489
    //   4477: aload_0
    //   4478: getfield 880	org/vidogram/ui/c/j:H	Landroid/text/StaticLayout;
    //   4481: invokevirtual 2160	android/text/StaticLayout:getWidth	()I
    //   4484: istore 9
    //   4486: goto -135 -> 4351
    //   4489: aload_0
    //   4490: getfield 880	org/vidogram/ui/c/j:H	Landroid/text/StaticLayout;
    //   4493: iload 21
    //   4495: invokevirtual 672	android/text/StaticLayout:getLineWidth	(I)F
    //   4498: f2d
    //   4499: invokestatic 506	java/lang/Math:ceil	(D)D
    //   4502: dstore_2
    //   4503: dload_2
    //   4504: d2i
    //   4505: istore 9
    //   4507: goto -156 -> 4351
    //   4510: goto -1555 -> 2955
    //   4513: iload 24
    //   4515: istore 9
    //   4517: goto -1499 -> 3018
    //   4520: iconst_0
    //   4521: istore 28
    //   4523: goto -1460 -> 3063
    //   4526: iload 12
    //   4528: iconst_1
    //   4529: iadd
    //   4530: istore 12
    //   4532: goto -1423 -> 3109
    //   4535: aload 31
    //   4537: invokestatic 603	org/vidogram/messenger/u:g	(Lorg/vidogram/tgnet/g$q;)Z
    //   4540: ifeq +175 -> 4715
    //   4543: aload_0
    //   4544: aload 31
    //   4546: getfield 629	org/vidogram/tgnet/g$q:i	Lorg/vidogram/tgnet/g$az;
    //   4549: putfield 698	org/vidogram/ui/c/j:ah	Lorg/vidogram/tgnet/g$az;
    //   4552: aload_0
    //   4553: getfield 698	org/vidogram/ui/c/j:ah	Lorg/vidogram/tgnet/g$az;
    //   4556: ifnull +140 -> 4696
    //   4559: aload_0
    //   4560: getfield 698	org/vidogram/ui/c/j:ah	Lorg/vidogram/tgnet/g$az;
    //   4563: getfield 2176	org/vidogram/tgnet/g$az:d	I
    //   4566: ifeq +13 -> 4579
    //   4569: aload_0
    //   4570: getfield 698	org/vidogram/ui/c/j:ah	Lorg/vidogram/tgnet/g$az;
    //   4573: getfield 2177	org/vidogram/tgnet/g$az:e	I
    //   4576: ifne +120 -> 4696
    //   4579: iconst_0
    //   4580: istore 12
    //   4582: iload 12
    //   4584: aload 31
    //   4586: getfield 480	org/vidogram/tgnet/g$q:o	Ljava/util/ArrayList;
    //   4589: invokevirtual 483	java/util/ArrayList:size	()I
    //   4592: if_icmpge +50 -> 4642
    //   4595: aload 31
    //   4597: getfield 480	org/vidogram/tgnet/g$q:o	Ljava/util/ArrayList;
    //   4600: iload 12
    //   4602: invokevirtual 487	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   4605: checkcast 489	org/vidogram/tgnet/g$r
    //   4608: astore 29
    //   4610: aload 29
    //   4612: instanceof 605
    //   4615: ifeq +91 -> 4706
    //   4618: aload_0
    //   4619: getfield 698	org/vidogram/ui/c/j:ah	Lorg/vidogram/tgnet/g$az;
    //   4622: aload 29
    //   4624: getfield 2180	org/vidogram/tgnet/g$r:h	I
    //   4627: putfield 2176	org/vidogram/tgnet/g$az:d	I
    //   4630: aload_0
    //   4631: getfield 698	org/vidogram/ui/c/j:ah	Lorg/vidogram/tgnet/g$az;
    //   4634: aload 29
    //   4636: getfield 2182	org/vidogram/tgnet/g$r:i	I
    //   4639: putfield 2177	org/vidogram/tgnet/g$az:e	I
    //   4642: aload_0
    //   4643: getfield 698	org/vidogram/ui/c/j:ah	Lorg/vidogram/tgnet/g$az;
    //   4646: getfield 2176	org/vidogram/tgnet/g$az:d	I
    //   4649: ifeq +13 -> 4662
    //   4652: aload_0
    //   4653: getfield 698	org/vidogram/ui/c/j:ah	Lorg/vidogram/tgnet/g$az;
    //   4656: getfield 2177	org/vidogram/tgnet/g$az:e	I
    //   4659: ifne +37 -> 4696
    //   4662: aload_0
    //   4663: getfield 698	org/vidogram/ui/c/j:ah	Lorg/vidogram/tgnet/g$az;
    //   4666: astore 29
    //   4668: aload_0
    //   4669: getfield 698	org/vidogram/ui/c/j:ah	Lorg/vidogram/tgnet/g$az;
    //   4672: astore 33
    //   4674: ldc_w 2183
    //   4677: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   4680: istore 12
    //   4682: aload 33
    //   4684: iload 12
    //   4686: putfield 2177	org/vidogram/tgnet/g$az:e	I
    //   4689: aload 29
    //   4691: iload 12
    //   4693: putfield 2176	org/vidogram/tgnet/g$az:d	I
    //   4696: aload_0
    //   4697: iconst_0
    //   4698: aload_1
    //   4699: invokespecial 2224	org/vidogram/ui/c/j:a	(ILorg/vidogram/messenger/u;)I
    //   4702: pop
    //   4703: goto -1467 -> 3236
    //   4706: iload 12
    //   4708: iconst_1
    //   4709: iadd
    //   4710: istore 12
    //   4712: goto -130 -> 4582
    //   4715: aload 31
    //   4717: invokestatic 2226	org/vidogram/messenger/u:c	(Lorg/vidogram/tgnet/g$q;)Z
    //   4720: ifeq +180 -> 4900
    //   4723: aload_0
    //   4724: aload 31
    //   4726: getfield 629	org/vidogram/tgnet/g$q:i	Lorg/vidogram/tgnet/g$az;
    //   4729: putfield 698	org/vidogram/ui/c/j:ah	Lorg/vidogram/tgnet/g$az;
    //   4732: aload_0
    //   4733: getfield 698	org/vidogram/ui/c/j:ah	Lorg/vidogram/tgnet/g$az;
    //   4736: ifnull +140 -> 4876
    //   4739: aload_0
    //   4740: getfield 698	org/vidogram/ui/c/j:ah	Lorg/vidogram/tgnet/g$az;
    //   4743: getfield 2176	org/vidogram/tgnet/g$az:d	I
    //   4746: ifeq +13 -> 4759
    //   4749: aload_0
    //   4750: getfield 698	org/vidogram/ui/c/j:ah	Lorg/vidogram/tgnet/g$az;
    //   4753: getfield 2177	org/vidogram/tgnet/g$az:e	I
    //   4756: ifne +120 -> 4876
    //   4759: iconst_0
    //   4760: istore 12
    //   4762: iload 12
    //   4764: aload 31
    //   4766: getfield 480	org/vidogram/tgnet/g$q:o	Ljava/util/ArrayList;
    //   4769: invokevirtual 483	java/util/ArrayList:size	()I
    //   4772: if_icmpge +50 -> 4822
    //   4775: aload 31
    //   4777: getfield 480	org/vidogram/tgnet/g$q:o	Ljava/util/ArrayList;
    //   4780: iload 12
    //   4782: invokevirtual 487	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   4785: checkcast 489	org/vidogram/tgnet/g$r
    //   4788: astore 29
    //   4790: aload 29
    //   4792: instanceof 2179
    //   4795: ifeq +96 -> 4891
    //   4798: aload_0
    //   4799: getfield 698	org/vidogram/ui/c/j:ah	Lorg/vidogram/tgnet/g$az;
    //   4802: aload 29
    //   4804: getfield 2180	org/vidogram/tgnet/g$r:h	I
    //   4807: putfield 2176	org/vidogram/tgnet/g$az:d	I
    //   4810: aload_0
    //   4811: getfield 698	org/vidogram/ui/c/j:ah	Lorg/vidogram/tgnet/g$az;
    //   4814: aload 29
    //   4816: getfield 2182	org/vidogram/tgnet/g$r:i	I
    //   4819: putfield 2177	org/vidogram/tgnet/g$az:e	I
    //   4822: aload_0
    //   4823: getfield 698	org/vidogram/ui/c/j:ah	Lorg/vidogram/tgnet/g$az;
    //   4826: getfield 2176	org/vidogram/tgnet/g$az:d	I
    //   4829: ifeq +13 -> 4842
    //   4832: aload_0
    //   4833: getfield 698	org/vidogram/ui/c/j:ah	Lorg/vidogram/tgnet/g$az;
    //   4836: getfield 2177	org/vidogram/tgnet/g$az:e	I
    //   4839: ifne +37 -> 4876
    //   4842: aload_0
    //   4843: getfield 698	org/vidogram/ui/c/j:ah	Lorg/vidogram/tgnet/g$az;
    //   4846: astore 29
    //   4848: aload_0
    //   4849: getfield 698	org/vidogram/ui/c/j:ah	Lorg/vidogram/tgnet/g$az;
    //   4852: astore 33
    //   4854: ldc_w 2183
    //   4857: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   4860: istore 12
    //   4862: aload 33
    //   4864: iload 12
    //   4866: putfield 2177	org/vidogram/tgnet/g$az:e	I
    //   4869: aload 29
    //   4871: iload 12
    //   4873: putfield 2176	org/vidogram/tgnet/g$az:d	I
    //   4876: aload_0
    //   4877: aload 31
    //   4879: putfield 469	org/vidogram/ui/c/j:u	Lorg/vidogram/tgnet/g$q;
    //   4882: aload_0
    //   4883: bipush 6
    //   4885: putfield 476	org/vidogram/ui/c/j:t	I
    //   4888: goto -1652 -> 3236
    //   4891: iload 12
    //   4893: iconst_1
    //   4894: iadd
    //   4895: istore 12
    //   4897: goto -135 -> 4762
    //   4900: aload_0
    //   4901: iload 10
    //   4903: iload 19
    //   4905: iload 8
    //   4907: invokespecial 2203	org/vidogram/ui/c/j:a	(III)V
    //   4910: aload 31
    //   4912: invokestatic 2226	org/vidogram/messenger/u:c	(Lorg/vidogram/tgnet/g$q;)Z
    //   4915: ifne +644 -> 5559
    //   4918: aload_0
    //   4919: getfield 267	org/vidogram/ui/c/j:bx	I
    //   4922: ldc_w 1533
    //   4925: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   4928: iload 10
    //   4930: iadd
    //   4931: if_icmpge +16 -> 4947
    //   4934: aload_0
    //   4935: ldc_w 1533
    //   4938: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   4941: iload 10
    //   4943: iadd
    //   4944: putfield 267	org/vidogram/ui/c/j:bx	I
    //   4947: aload 31
    //   4949: invokestatic 474	org/vidogram/messenger/u:e	(Lorg/vidogram/tgnet/g$q;)Z
    //   4952: ifeq +86 -> 5038
    //   4955: aload_0
    //   4956: aload_0
    //   4957: getfield 267	org/vidogram/ui/c/j:bx	I
    //   4960: ldc_w 517
    //   4963: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   4966: isub
    //   4967: aload_1
    //   4968: invokespecial 2224	org/vidogram/ui/c/j:a	(ILorg/vidogram/messenger/u;)I
    //   4971: pop
    //   4972: aload_0
    //   4973: aload_0
    //   4974: getfield 773	org/vidogram/ui/c/j:bn	Lorg/vidogram/messenger/u;
    //   4977: getfield 868	org/vidogram/messenger/u:x	I
    //   4980: ldc_w 903
    //   4983: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   4986: iadd
    //   4987: aload_0
    //   4988: getfield 846	org/vidogram/ui/c/j:y	I
    //   4991: iadd
    //   4992: putfield 1037	org/vidogram/ui/c/j:z	I
    //   4995: aload_0
    //   4996: aload_0
    //   4997: getfield 776	org/vidogram/ui/c/j:d	I
    //   5000: ldc_w 1058
    //   5003: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   5006: iadd
    //   5007: putfield 776	org/vidogram/ui/c/j:d	I
    //   5010: aload_0
    //   5011: aload_0
    //   5012: getfield 846	org/vidogram/ui/c/j:y	I
    //   5015: ldc_w 1058
    //   5018: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   5021: iadd
    //   5022: putfield 846	org/vidogram/ui/c/j:y	I
    //   5025: aload_0
    //   5026: iload 10
    //   5028: iload 19
    //   5030: iload 8
    //   5032: invokespecial 2203	org/vidogram/ui/c/j:a	(III)V
    //   5035: goto -1799 -> 3236
    //   5038: aload 31
    //   5040: invokestatic 539	org/vidogram/messenger/u:f	(Lorg/vidogram/tgnet/g$q;)Z
    //   5043: ifeq +233 -> 5276
    //   5046: aload_0
    //   5047: aload_0
    //   5048: getfield 267	org/vidogram/ui/c/j:bx	I
    //   5051: ldc_w 517
    //   5054: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   5057: isub
    //   5058: aload_1
    //   5059: invokespecial 2224	org/vidogram/ui/c/j:a	(ILorg/vidogram/messenger/u;)I
    //   5062: istore 14
    //   5064: aload_0
    //   5065: aload_0
    //   5066: getfield 773	org/vidogram/ui/c/j:bn	Lorg/vidogram/messenger/u;
    //   5069: getfield 868	org/vidogram/messenger/u:x	I
    //   5072: ldc_w 903
    //   5075: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   5078: iadd
    //   5079: aload_0
    //   5080: getfield 846	org/vidogram/ui/c/j:y	I
    //   5083: iadd
    //   5084: putfield 1037	org/vidogram/ui/c/j:z	I
    //   5087: aload_0
    //   5088: aload_0
    //   5089: getfield 776	org/vidogram/ui/c/j:d	I
    //   5092: ldc_w 1082
    //   5095: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   5098: iadd
    //   5099: putfield 776	org/vidogram/ui/c/j:d	I
    //   5102: aload_0
    //   5103: aload_0
    //   5104: getfield 846	org/vidogram/ui/c/j:y	I
    //   5107: ldc_w 1082
    //   5110: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   5113: iadd
    //   5114: putfield 846	org/vidogram/ui/c/j:y	I
    //   5117: iload 10
    //   5119: ldc_w 540
    //   5122: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   5125: isub
    //   5126: istore 12
    //   5128: iload 8
    //   5130: iload 14
    //   5132: iload 25
    //   5134: iadd
    //   5135: ldc_w 494
    //   5138: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   5141: iadd
    //   5142: invokestatic 675	java/lang/Math:max	(II)I
    //   5145: istore 10
    //   5147: iload 10
    //   5149: istore 8
    //   5151: aload_0
    //   5152: getfield 572	org/vidogram/ui/c/j:aT	Landroid/text/StaticLayout;
    //   5155: ifnull +46 -> 5201
    //   5158: iload 10
    //   5160: istore 8
    //   5162: aload_0
    //   5163: getfield 572	org/vidogram/ui/c/j:aT	Landroid/text/StaticLayout;
    //   5166: invokevirtual 575	android/text/StaticLayout:getLineCount	()I
    //   5169: ifle +32 -> 5201
    //   5172: iload 10
    //   5174: i2f
    //   5175: aload_0
    //   5176: getfield 572	org/vidogram/ui/c/j:aT	Landroid/text/StaticLayout;
    //   5179: iconst_0
    //   5180: invokevirtual 672	android/text/StaticLayout:getLineWidth	(I)F
    //   5183: iload 25
    //   5185: i2f
    //   5186: fadd
    //   5187: ldc_w 540
    //   5190: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   5193: i2f
    //   5194: fadd
    //   5195: invokestatic 2229	java/lang/Math:max	(FF)F
    //   5198: f2i
    //   5199: istore 8
    //   5201: iload 8
    //   5203: istore 10
    //   5205: aload_0
    //   5206: getfield 585	org/vidogram/ui/c/j:aV	Landroid/text/StaticLayout;
    //   5209: ifnull +46 -> 5255
    //   5212: iload 8
    //   5214: istore 10
    //   5216: aload_0
    //   5217: getfield 585	org/vidogram/ui/c/j:aV	Landroid/text/StaticLayout;
    //   5220: invokevirtual 575	android/text/StaticLayout:getLineCount	()I
    //   5223: ifle +32 -> 5255
    //   5226: iload 8
    //   5228: i2f
    //   5229: aload_0
    //   5230: getfield 585	org/vidogram/ui/c/j:aV	Landroid/text/StaticLayout;
    //   5233: iconst_0
    //   5234: invokevirtual 672	android/text/StaticLayout:getLineWidth	(I)F
    //   5237: iload 25
    //   5239: i2f
    //   5240: fadd
    //   5241: ldc_w 540
    //   5244: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   5247: i2f
    //   5248: fadd
    //   5249: invokestatic 2229	java/lang/Math:max	(FF)F
    //   5252: f2i
    //   5253: istore 10
    //   5255: aload_0
    //   5256: iload 12
    //   5258: iload 19
    //   5260: iload 10
    //   5262: invokespecial 2203	org/vidogram/ui/c/j:a	(III)V
    //   5265: iload 10
    //   5267: istore 8
    //   5269: iload 12
    //   5271: istore 10
    //   5273: goto -2037 -> 3236
    //   5276: aload_0
    //   5277: aload_0
    //   5278: getfield 267	org/vidogram/ui/c/j:bx	I
    //   5281: ldc_w 2230
    //   5284: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   5287: isub
    //   5288: aload_1
    //   5289: invokespecial 2224	org/vidogram/ui/c/j:a	(ILorg/vidogram/messenger/u;)I
    //   5292: pop
    //   5293: aload_0
    //   5294: iconst_1
    //   5295: putfield 1024	org/vidogram/ui/c/j:s	Z
    //   5298: aload_0
    //   5299: getfield 639	org/vidogram/ui/c/j:v	Z
    //   5302: ifeq +65 -> 5367
    //   5305: aload_0
    //   5306: aload_0
    //   5307: getfield 776	org/vidogram/ui/c/j:d	I
    //   5310: ldc_w 1691
    //   5313: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   5316: iadd
    //   5317: putfield 776	org/vidogram/ui/c/j:d	I
    //   5320: aload_0
    //   5321: aload_0
    //   5322: getfield 846	org/vidogram/ui/c/j:y	I
    //   5325: ldc_w 540
    //   5328: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   5331: iadd
    //   5332: putfield 846	org/vidogram/ui/c/j:y	I
    //   5335: aload_0
    //   5336: getfield 418	org/vidogram/ui/c/j:o	Lorg/vidogram/messenger/q;
    //   5339: iconst_0
    //   5340: aload_0
    //   5341: getfield 776	org/vidogram/ui/c/j:d	I
    //   5344: aload_0
    //   5345: getfield 826	org/vidogram/ui/c/j:cA	I
    //   5348: iadd
    //   5349: ldc_w 540
    //   5352: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   5355: ldc_w 540
    //   5358: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   5361: invokevirtual 915	org/vidogram/messenger/q:a	(IIII)V
    //   5364: goto -2128 -> 3236
    //   5367: aload_0
    //   5368: aload_0
    //   5369: getfield 773	org/vidogram/ui/c/j:bn	Lorg/vidogram/messenger/u;
    //   5372: getfield 868	org/vidogram/messenger/u:x	I
    //   5375: ldc_w 903
    //   5378: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   5381: iadd
    //   5382: aload_0
    //   5383: getfield 846	org/vidogram/ui/c/j:y	I
    //   5386: iadd
    //   5387: putfield 1037	org/vidogram/ui/c/j:z	I
    //   5390: aload_0
    //   5391: getfield 418	org/vidogram/ui/c/j:o	Lorg/vidogram/messenger/q;
    //   5394: iconst_0
    //   5395: aload_0
    //   5396: getfield 776	org/vidogram/ui/c/j:d	I
    //   5399: aload_0
    //   5400: getfield 826	org/vidogram/ui/c/j:cA	I
    //   5403: iadd
    //   5404: ldc_w 387
    //   5407: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   5410: isub
    //   5411: ldc_w 1082
    //   5414: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   5417: ldc_w 1082
    //   5420: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   5423: invokevirtual 915	org/vidogram/messenger/q:a	(IIII)V
    //   5426: aload_0
    //   5427: aload_0
    //   5428: getfield 776	org/vidogram/ui/c/j:d	I
    //   5431: ldc_w 2231
    //   5434: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   5437: iadd
    //   5438: putfield 776	org/vidogram/ui/c/j:d	I
    //   5441: aload_0
    //   5442: aload_0
    //   5443: getfield 846	org/vidogram/ui/c/j:y	I
    //   5446: ldc_w 1545
    //   5449: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   5452: iadd
    //   5453: putfield 846	org/vidogram/ui/c/j:y	I
    //   5456: goto -2220 -> 3236
    //   5459: aload 33
    //   5461: ifnull +98 -> 5559
    //   5464: aload 30
    //   5466: ifnull +96 -> 5562
    //   5469: aload 30
    //   5471: ldc_w 2185
    //   5474: invokevirtual 1309	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   5477: ifeq +85 -> 5562
    //   5480: iconst_1
    //   5481: istore 28
    //   5483: aload_0
    //   5484: iload 28
    //   5486: putfield 1024	org/vidogram/ui/c/j:s	Z
    //   5489: aload_1
    //   5490: getfield 691	org/vidogram/messenger/u:m	Ljava/util/ArrayList;
    //   5493: astore 29
    //   5495: aload_0
    //   5496: getfield 1024	org/vidogram/ui/c/j:s	Z
    //   5499: ifeq +69 -> 5568
    //   5502: invokestatic 693	org/vidogram/messenger/a:f	()I
    //   5505: istore 12
    //   5507: aload_0
    //   5508: getfield 1024	org/vidogram/ui/c/j:s	Z
    //   5511: ifne +64 -> 5575
    //   5514: iconst_1
    //   5515: istore 28
    //   5517: aload_0
    //   5518: aload 29
    //   5520: iload 12
    //   5522: iload 28
    //   5524: invokestatic 2234	org/vidogram/messenger/m:a	(Ljava/util/ArrayList;IZ)Lorg/vidogram/tgnet/g$az;
    //   5527: putfield 698	org/vidogram/ui/c/j:ah	Lorg/vidogram/tgnet/g$az;
    //   5530: aload_0
    //   5531: aload_1
    //   5532: getfield 691	org/vidogram/messenger/u:m	Ljava/util/ArrayList;
    //   5535: bipush 80
    //   5537: invokestatic 696	org/vidogram/messenger/m:a	(Ljava/util/ArrayList;I)Lorg/vidogram/tgnet/g$az;
    //   5540: putfield 1439	org/vidogram/ui/c/j:ai	Lorg/vidogram/tgnet/g$az;
    //   5543: aload_0
    //   5544: getfield 1439	org/vidogram/ui/c/j:ai	Lorg/vidogram/tgnet/g$az;
    //   5547: aload_0
    //   5548: getfield 698	org/vidogram/ui/c/j:ah	Lorg/vidogram/tgnet/g$az;
    //   5551: if_acmpne +8 -> 5559
    //   5554: aload_0
    //   5555: aconst_null
    //   5556: putfield 1439	org/vidogram/ui/c/j:ai	Lorg/vidogram/tgnet/g$az;
    //   5559: goto -2323 -> 3236
    //   5562: iconst_0
    //   5563: istore 28
    //   5565: goto -82 -> 5483
    //   5568: iload 9
    //   5570: istore 12
    //   5572: goto -65 -> 5507
    //   5575: iconst_0
    //   5576: istore 28
    //   5578: goto -61 -> 5517
    //   5581: iconst_0
    //   5582: istore 28
    //   5584: goto -2259 -> 3325
    //   5587: getstatic 1638	org/vidogram/messenger/a:c	Landroid/graphics/Point;
    //   5590: getfield 1641	android/graphics/Point:x	I
    //   5593: i2f
    //   5594: ldc_w 2190
    //   5597: fmul
    //   5598: f2i
    //   5599: istore 9
    //   5601: goto -2211 -> 3390
    //   5604: aload_0
    //   5605: getfield 771	org/vidogram/ui/c/j:x	Z
    //   5608: ifeq +41 -> 5649
    //   5611: sipush 640
    //   5614: i2f
    //   5615: iload 9
    //   5617: fconst_2
    //   5618: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   5621: isub
    //   5622: i2f
    //   5623: fdiv
    //   5624: fstore 6
    //   5626: sipush 640
    //   5629: i2f
    //   5630: fload 6
    //   5632: fdiv
    //   5633: f2i
    //   5634: istore 9
    //   5636: sipush 360
    //   5639: i2f
    //   5640: fload 6
    //   5642: fdiv
    //   5643: f2i
    //   5644: istore 8
    //   5646: goto -2212 -> 3434
    //   5649: aload_0
    //   5650: getfield 698	org/vidogram/ui/c/j:ah	Lorg/vidogram/tgnet/g$az;
    //   5653: getfield 2176	org/vidogram/tgnet/g$az:d	I
    //   5656: istore 8
    //   5658: aload_0
    //   5659: getfield 698	org/vidogram/ui/c/j:ah	Lorg/vidogram/tgnet/g$az;
    //   5662: getfield 2177	org/vidogram/tgnet/g$az:e	I
    //   5665: istore 11
    //   5667: iload 8
    //   5669: i2f
    //   5670: iload 9
    //   5672: fconst_2
    //   5673: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   5676: isub
    //   5677: i2f
    //   5678: fdiv
    //   5679: fstore 6
    //   5681: iload 8
    //   5683: i2f
    //   5684: fload 6
    //   5686: fdiv
    //   5687: f2i
    //   5688: istore 8
    //   5690: iload 11
    //   5692: i2f
    //   5693: fload 6
    //   5695: fdiv
    //   5696: f2i
    //   5697: istore 9
    //   5699: aload 32
    //   5701: ifnull +29 -> 5730
    //   5704: aload 32
    //   5706: ifnull +6026 -> 11732
    //   5709: aload 32
    //   5711: invokevirtual 621	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   5714: ldc_w 2150
    //   5717: invokevirtual 1309	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   5720: ifne +6012 -> 11732
    //   5723: aload_0
    //   5724: getfield 476	org/vidogram/ui/c/j:t	I
    //   5727: ifne +6005 -> 11732
    //   5730: iload 9
    //   5732: getstatic 1638	org/vidogram/messenger/a:c	Landroid/graphics/Point;
    //   5735: getfield 1642	android/graphics/Point:y	I
    //   5738: iconst_3
    //   5739: idiv
    //   5740: if_icmple +5992 -> 11732
    //   5743: getstatic 1638	org/vidogram/messenger/a:c	Landroid/graphics/Point;
    //   5746: getfield 1642	android/graphics/Point:y	I
    //   5749: iconst_3
    //   5750: idiv
    //   5751: istore 11
    //   5753: iload 8
    //   5755: istore 9
    //   5757: iload 11
    //   5759: istore 8
    //   5761: goto -2327 -> 3434
    //   5764: aload_0
    //   5765: aload_0
    //   5766: getfield 776	org/vidogram/ui/c/j:d	I
    //   5769: ldc_w 380
    //   5772: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   5775: iload 8
    //   5777: iadd
    //   5778: iadd
    //   5779: putfield 776	org/vidogram/ui/c/j:d	I
    //   5782: aload_0
    //   5783: aload_0
    //   5784: getfield 846	org/vidogram/ui/c/j:y	I
    //   5787: iload 8
    //   5789: iadd
    //   5790: putfield 846	org/vidogram/ui/c/j:y	I
    //   5793: goto -2278 -> 3515
    //   5796: aconst_null
    //   5797: astore 29
    //   5799: goto -2162 -> 3637
    //   5802: aload_0
    //   5803: getfield 476	org/vidogram/ui/c/j:t	I
    //   5806: iconst_4
    //   5807: if_icmpne +29 -> 5836
    //   5810: aload_0
    //   5811: getfield 418	org/vidogram/ui/c/j:o	Lorg/vidogram/messenger/q;
    //   5814: aconst_null
    //   5815: aconst_null
    //   5816: aload_0
    //   5817: getfield 698	org/vidogram/ui/c/j:ah	Lorg/vidogram/tgnet/g$az;
    //   5820: getfield 635	org/vidogram/tgnet/g$az:c	Lorg/vidogram/tgnet/g$x;
    //   5823: aload_0
    //   5824: getfield 708	org/vidogram/ui/c/j:aj	Ljava/lang/String;
    //   5827: iconst_0
    //   5828: aconst_null
    //   5829: iconst_0
    //   5830: invokevirtual 1443	org/vidogram/messenger/q:a	(Lorg/vidogram/tgnet/f;Ljava/lang/String;Lorg/vidogram/tgnet/g$x;Ljava/lang/String;ILjava/lang/String;Z)V
    //   5833: goto -2169 -> 3664
    //   5836: aload_0
    //   5837: getfield 476	org/vidogram/ui/c/j:t	I
    //   5840: iconst_2
    //   5841: if_icmpne +117 -> 5958
    //   5844: aload_1
    //   5845: getfield 1807	org/vidogram/messenger/u:s	Z
    //   5848: istore 28
    //   5850: aload 31
    //   5852: invokestatic 1811	org/vidogram/messenger/m:b	(Lorg/vidogram/tgnet/f;)Ljava/lang/String;
    //   5855: astore 29
    //   5857: aload_0
    //   5858: getfield 771	org/vidogram/ui/c/j:x	Z
    //   5861: ifne +30 -> 5891
    //   5864: iload 28
    //   5866: ifne +25 -> 5891
    //   5869: invokestatic 409	org/vidogram/messenger/MediaController:a	()Lorg/vidogram/messenger/MediaController;
    //   5872: bipush 32
    //   5874: invokevirtual 1854	org/vidogram/messenger/MediaController:a	(I)Z
    //   5877: ifne +14 -> 5891
    //   5880: invokestatic 1448	org/vidogram/messenger/m:a	()Lorg/vidogram/messenger/m;
    //   5883: aload 29
    //   5885: invokevirtual 1852	org/vidogram/messenger/m:a	(Ljava/lang/String;)Z
    //   5888: ifeq +39 -> 5927
    //   5891: aload_0
    //   5892: iconst_0
    //   5893: putfield 1311	org/vidogram/ui/c/j:ae	Z
    //   5896: aload_0
    //   5897: getfield 418	org/vidogram/ui/c/j:o	Lorg/vidogram/messenger/q;
    //   5900: aload 31
    //   5902: aconst_null
    //   5903: aload_0
    //   5904: getfield 698	org/vidogram/ui/c/j:ah	Lorg/vidogram/tgnet/g$az;
    //   5907: getfield 635	org/vidogram/tgnet/g$az:c	Lorg/vidogram/tgnet/g$x;
    //   5910: aload_0
    //   5911: getfield 708	org/vidogram/ui/c/j:aj	Ljava/lang/String;
    //   5914: aload 31
    //   5916: getfield 609	org/vidogram/tgnet/g$q:h	I
    //   5919: aconst_null
    //   5920: iconst_0
    //   5921: invokevirtual 1443	org/vidogram/messenger/q:a	(Lorg/vidogram/tgnet/f;Ljava/lang/String;Lorg/vidogram/tgnet/g$x;Ljava/lang/String;ILjava/lang/String;Z)V
    //   5924: goto -2260 -> 3664
    //   5927: aload_0
    //   5928: iconst_1
    //   5929: putfield 1311	org/vidogram/ui/c/j:ae	Z
    //   5932: aload_0
    //   5933: getfield 418	org/vidogram/ui/c/j:o	Lorg/vidogram/messenger/q;
    //   5936: aconst_null
    //   5937: aconst_null
    //   5938: aload_0
    //   5939: getfield 698	org/vidogram/ui/c/j:ah	Lorg/vidogram/tgnet/g$az;
    //   5942: getfield 635	org/vidogram/tgnet/g$az:c	Lorg/vidogram/tgnet/g$x;
    //   5945: aload_0
    //   5946: getfield 708	org/vidogram/ui/c/j:aj	Ljava/lang/String;
    //   5949: iconst_0
    //   5950: aconst_null
    //   5951: iconst_0
    //   5952: invokevirtual 1443	org/vidogram/messenger/q:a	(Lorg/vidogram/tgnet/f;Ljava/lang/String;Lorg/vidogram/tgnet/g$x;Ljava/lang/String;ILjava/lang/String;Z)V
    //   5955: goto -2291 -> 3664
    //   5958: aload_1
    //   5959: getfield 1807	org/vidogram/messenger/u:s	Z
    //   5962: istore 28
    //   5964: aload_0
    //   5965: getfield 698	org/vidogram/ui/c/j:ah	Lorg/vidogram/tgnet/g$az;
    //   5968: invokestatic 1811	org/vidogram/messenger/m:b	(Lorg/vidogram/tgnet/f;)Ljava/lang/String;
    //   5971: astore 29
    //   5973: aload_0
    //   5974: getfield 771	org/vidogram/ui/c/j:x	Z
    //   5977: ifne +29 -> 6006
    //   5980: iload 28
    //   5982: ifne +24 -> 6006
    //   5985: invokestatic 409	org/vidogram/messenger/MediaController:a	()Lorg/vidogram/messenger/MediaController;
    //   5988: iconst_1
    //   5989: invokevirtual 1854	org/vidogram/messenger/MediaController:a	(I)Z
    //   5992: ifne +14 -> 6006
    //   5995: invokestatic 1448	org/vidogram/messenger/m:a	()Lorg/vidogram/messenger/m;
    //   5998: aload 29
    //   6000: invokevirtual 1852	org/vidogram/messenger/m:a	(Ljava/lang/String;)Z
    //   6003: ifeq +72 -> 6075
    //   6006: aload_0
    //   6007: iconst_0
    //   6008: putfield 1311	org/vidogram/ui/c/j:ae	Z
    //   6011: aload_0
    //   6012: getfield 418	org/vidogram/ui/c/j:o	Lorg/vidogram/messenger/q;
    //   6015: astore 31
    //   6017: aload_0
    //   6018: getfield 698	org/vidogram/ui/c/j:ah	Lorg/vidogram/tgnet/g$az;
    //   6021: getfield 635	org/vidogram/tgnet/g$az:c	Lorg/vidogram/tgnet/g$x;
    //   6024: astore 32
    //   6026: aload_0
    //   6027: getfield 708	org/vidogram/ui/c/j:aj	Ljava/lang/String;
    //   6030: astore 33
    //   6032: aload_0
    //   6033: getfield 1439	org/vidogram/ui/c/j:ai	Lorg/vidogram/tgnet/g$az;
    //   6036: ifnull +33 -> 6069
    //   6039: aload_0
    //   6040: getfield 1439	org/vidogram/ui/c/j:ai	Lorg/vidogram/tgnet/g$az;
    //   6043: getfield 635	org/vidogram/tgnet/g$az:c	Lorg/vidogram/tgnet/g$x;
    //   6046: astore 29
    //   6048: aload 31
    //   6050: aload 32
    //   6052: aload 33
    //   6054: aload 29
    //   6056: aload_0
    //   6057: getfield 1453	org/vidogram/ui/c/j:ak	Ljava/lang/String;
    //   6060: iconst_0
    //   6061: aconst_null
    //   6062: iconst_0
    //   6063: invokevirtual 1443	org/vidogram/messenger/q:a	(Lorg/vidogram/tgnet/f;Ljava/lang/String;Lorg/vidogram/tgnet/g$x;Ljava/lang/String;ILjava/lang/String;Z)V
    //   6066: goto -2402 -> 3664
    //   6069: aconst_null
    //   6070: astore 29
    //   6072: goto -24 -> 6048
    //   6075: aload_0
    //   6076: iconst_1
    //   6077: putfield 1311	org/vidogram/ui/c/j:ae	Z
    //   6080: aload_0
    //   6081: getfield 1439	org/vidogram/ui/c/j:ai	Lorg/vidogram/tgnet/g$az;
    //   6084: ifnull +54 -> 6138
    //   6087: aload_0
    //   6088: getfield 418	org/vidogram/ui/c/j:o	Lorg/vidogram/messenger/q;
    //   6091: aconst_null
    //   6092: aconst_null
    //   6093: aload_0
    //   6094: getfield 1439	org/vidogram/ui/c/j:ai	Lorg/vidogram/tgnet/g$az;
    //   6097: getfield 635	org/vidogram/tgnet/g$az:c	Lorg/vidogram/tgnet/g$x;
    //   6100: getstatic 1294	java/util/Locale:US	Ljava/util/Locale;
    //   6103: ldc_w 2194
    //   6106: iconst_2
    //   6107: anewarray 591	java/lang/Object
    //   6110: dup
    //   6111: iconst_0
    //   6112: iload 9
    //   6114: invokestatic 597	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   6117: aastore
    //   6118: dup
    //   6119: iconst_1
    //   6120: iload 8
    //   6122: invokestatic 597	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   6125: aastore
    //   6126: invokestatic 1305	java/lang/String:format	(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   6129: iconst_0
    //   6130: aconst_null
    //   6131: iconst_0
    //   6132: invokevirtual 1443	org/vidogram/messenger/q:a	(Lorg/vidogram/tgnet/f;Ljava/lang/String;Lorg/vidogram/tgnet/g$x;Ljava/lang/String;ILjava/lang/String;Z)V
    //   6135: goto -2471 -> 3664
    //   6138: aload_0
    //   6139: getfield 418	org/vidogram/ui/c/j:o	Lorg/vidogram/messenger/q;
    //   6142: aconst_null
    //   6143: checkcast 814	android/graphics/drawable/Drawable
    //   6146: invokevirtual 723	org/vidogram/messenger/q:a	(Landroid/graphics/drawable/Drawable;)V
    //   6149: goto -2485 -> 3664
    //   6152: aload_0
    //   6153: getfield 771	org/vidogram/ui/c/j:x	Z
    //   6156: ifeq -2382 -> 3774
    //   6159: ldc_w 2236
    //   6162: ldc_w 2237
    //   6165: invokestatic 656	org/vidogram/messenger/r:a	(Ljava/lang/String;I)Ljava/lang/String;
    //   6168: invokevirtual 2240	java/lang/String:toUpperCase	()Ljava/lang/String;
    //   6171: astore 29
    //   6173: aload_0
    //   6174: getstatic 356	org/vidogram/ui/c/j:aw	Landroid/text/TextPaint;
    //   6177: aload 29
    //   6179: invokevirtual 500	android/text/TextPaint:measureText	(Ljava/lang/String;)F
    //   6182: f2d
    //   6183: invokestatic 506	java/lang/Math:ceil	(D)D
    //   6186: d2i
    //   6187: putfield 933	org/vidogram/ui/c/j:B	I
    //   6190: aload_0
    //   6191: new 269	android/text/StaticLayout
    //   6194: dup
    //   6195: aload 29
    //   6197: getstatic 356	org/vidogram/ui/c/j:aw	Landroid/text/TextPaint;
    //   6200: aload_0
    //   6201: getfield 933	org/vidogram/ui/c/j:B	I
    //   6204: getstatic 567	android/text/Layout$Alignment:ALIGN_NORMAL	Landroid/text/Layout$Alignment;
    //   6207: fconst_1
    //   6208: fconst_0
    //   6209: iconst_0
    //   6210: invokespecial 570	android/text/StaticLayout:<init>	(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;FFZ)V
    //   6213: putfield 920	org/vidogram/ui/c/j:I	Landroid/text/StaticLayout;
    //   6216: goto -2442 -> 3774
    //   6219: aload_0
    //   6220: getfield 418	org/vidogram/ui/c/j:o	Lorg/vidogram/messenger/q;
    //   6223: aconst_null
    //   6224: checkcast 814	android/graphics/drawable/Drawable
    //   6227: invokevirtual 723	org/vidogram/messenger/q:a	(Landroid/graphics/drawable/Drawable;)V
    //   6230: aload_0
    //   6231: aload_0
    //   6232: getfield 846	org/vidogram/ui/c/j:y	I
    //   6235: ldc_w 926
    //   6238: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   6241: isub
    //   6242: putfield 846	org/vidogram/ui/c/j:y	I
    //   6245: aload_0
    //   6246: aload_0
    //   6247: getfield 776	org/vidogram/ui/c/j:d	I
    //   6250: ldc_w 869
    //   6253: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   6256: iadd
    //   6257: putfield 776	org/vidogram/ui/c/j:d	I
    //   6260: goto -2482 -> 3778
    //   6263: aload_0
    //   6264: getfield 418	org/vidogram/ui/c/j:o	Lorg/vidogram/messenger/q;
    //   6267: aconst_null
    //   6268: checkcast 814	android/graphics/drawable/Drawable
    //   6271: invokevirtual 723	org/vidogram/messenger/q:a	(Landroid/graphics/drawable/Drawable;)V
    //   6274: aload_0
    //   6275: iload 10
    //   6277: iload 19
    //   6279: iload 9
    //   6281: invokespecial 2203	org/vidogram/ui/c/j:a	(III)V
    //   6284: goto -2447 -> 3837
    //   6287: aload_1
    //   6288: getfield 450	org/vidogram/messenger/u:f	I
    //   6291: bipush 12
    //   6293: if_icmpne +654 -> 6947
    //   6296: aload_0
    //   6297: iconst_0
    //   6298: putfield 1585	org/vidogram/ui/c/j:ca	Z
    //   6301: aload_0
    //   6302: iconst_1
    //   6303: putfield 1595	org/vidogram/ui/c/j:ce	Z
    //   6306: aload_0
    //   6307: iconst_1
    //   6308: putfield 639	org/vidogram/ui/c/j:v	Z
    //   6311: aload_0
    //   6312: getfield 418	org/vidogram/ui/c/j:o	Lorg/vidogram/messenger/q;
    //   6315: ldc_w 1643
    //   6318: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   6321: invokevirtual 397	org/vidogram/messenger/q:a	(I)V
    //   6324: invokestatic 1632	org/vidogram/messenger/a:c	()Z
    //   6327: ifeq +474 -> 6801
    //   6330: invokestatic 1634	org/vidogram/messenger/a:e	()I
    //   6333: istore 8
    //   6335: aload_0
    //   6336: getfield 1586	org/vidogram/ui/c/j:a	Z
    //   6339: ifeq +454 -> 6793
    //   6342: aload_1
    //   6343: invokevirtual 1338	org/vidogram/messenger/u:l	()Z
    //   6346: ifeq +447 -> 6793
    //   6349: aload_1
    //   6350: invokevirtual 524	org/vidogram/messenger/u:k	()Z
    //   6353: ifne +440 -> 6793
    //   6356: ldc_w 2241
    //   6359: fstore 6
    //   6361: aload_0
    //   6362: iload 8
    //   6364: fload 6
    //   6366: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   6369: isub
    //   6370: ldc_w 2242
    //   6373: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   6376: invokestatic 521	java/lang/Math:min	(II)I
    //   6379: putfield 267	org/vidogram/ui/c/j:bx	I
    //   6382: aload_0
    //   6383: aload_0
    //   6384: getfield 267	org/vidogram/ui/c/j:bx	I
    //   6387: ldc_w 777
    //   6390: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   6393: isub
    //   6394: putfield 508	org/vidogram/ui/c/j:bq	I
    //   6397: aload_1
    //   6398: getfield 453	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   6401: getfield 458	org/vidogram/tgnet/g$ar:j	Lorg/vidogram/tgnet/g$au;
    //   6404: getfield 1539	org/vidogram/tgnet/g$au:q	I
    //   6407: istore 8
    //   6409: invokestatic 1333	org/vidogram/messenger/v:a	()Lorg/vidogram/messenger/v;
    //   6412: iload 8
    //   6414: invokestatic 597	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   6417: invokevirtual 1336	org/vidogram/messenger/v:a	(Ljava/lang/Integer;)Lorg/vidogram/tgnet/g$vw;
    //   6420: astore 30
    //   6422: aload_0
    //   6423: invokespecial 1688	org/vidogram/ui/c/j:getMaxNameWidth	()I
    //   6426: ldc_w 2243
    //   6429: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   6432: isub
    //   6433: istore 8
    //   6435: iload 8
    //   6437: ifge +5292 -> 11729
    //   6440: ldc_w 517
    //   6443: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   6446: istore 8
    //   6448: aconst_null
    //   6449: astore 29
    //   6451: aload 30
    //   6453: ifnull +5270 -> 11723
    //   6456: aload 30
    //   6458: getfield 1566	org/vidogram/tgnet/g$vw:j	Lorg/vidogram/tgnet/g$vx;
    //   6461: ifnull +13 -> 6474
    //   6464: aload 30
    //   6466: getfield 1566	org/vidogram/tgnet/g$vw:j	Lorg/vidogram/tgnet/g$vx;
    //   6469: getfield 1570	org/vidogram/tgnet/g$vx:e	Lorg/vidogram/tgnet/g$x;
    //   6472: astore 29
    //   6474: aload_0
    //   6475: getfield 416	org/vidogram/ui/c/j:p	Lorg/vidogram/ui/Components/b;
    //   6478: aload 30
    //   6480: invokevirtual 1667	org/vidogram/ui/Components/b:a	(Lorg/vidogram/tgnet/g$vw;)V
    //   6483: aload_0
    //   6484: getfield 418	org/vidogram/ui/c/j:o	Lorg/vidogram/messenger/q;
    //   6487: astore 31
    //   6489: aload 30
    //   6491: ifnull +376 -> 6867
    //   6494: aload_0
    //   6495: getfield 416	org/vidogram/ui/c/j:p	Lorg/vidogram/ui/Components/b;
    //   6498: astore 30
    //   6500: aload 31
    //   6502: aload 29
    //   6504: ldc_w 1669
    //   6507: aload 30
    //   6509: aconst_null
    //   6510: iconst_0
    //   6511: invokevirtual 1672	org/vidogram/messenger/q:a	(Lorg/vidogram/tgnet/f;Ljava/lang/String;Landroid/graphics/drawable/Drawable;Ljava/lang/String;Z)V
    //   6514: aload_1
    //   6515: getfield 453	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   6518: getfield 458	org/vidogram/tgnet/g$ar:j	Lorg/vidogram/tgnet/g$au;
    //   6521: getfield 2245	org/vidogram/tgnet/g$au:n	Ljava/lang/String;
    //   6524: astore 29
    //   6526: aload 29
    //   6528: ifnull +370 -> 6898
    //   6531: aload 29
    //   6533: invokevirtual 648	java/lang/String:length	()I
    //   6536: ifeq +362 -> 6898
    //   6539: invokestatic 2250	org/vidogram/a/b:a	()Lorg/vidogram/a/b;
    //   6542: aload 29
    //   6544: invokevirtual 2253	org/vidogram/a/b:e	(Ljava/lang/String;)Ljava/lang/String;
    //   6547: astore 29
    //   6549: aload_1
    //   6550: getfield 453	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   6553: getfield 458	org/vidogram/tgnet/g$ar:j	Lorg/vidogram/tgnet/g$au;
    //   6556: getfield 2255	org/vidogram/tgnet/g$au:o	Ljava/lang/String;
    //   6559: aload_1
    //   6560: getfield 453	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   6563: getfield 458	org/vidogram/tgnet/g$ar:j	Lorg/vidogram/tgnet/g$au;
    //   6566: getfield 2257	org/vidogram/tgnet/g$au:p	Ljava/lang/String;
    //   6569: invokestatic 1388	org/vidogram/messenger/f:a	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   6572: bipush 10
    //   6574: bipush 32
    //   6576: invokevirtual 549	java/lang/String:replace	(CC)Ljava/lang/String;
    //   6579: astore 30
    //   6581: aload 30
    //   6583: invokeinterface 747 1 0
    //   6588: ifne +5132 -> 11720
    //   6591: aload 29
    //   6593: astore 30
    //   6595: aload_0
    //   6596: new 269	android/text/StaticLayout
    //   6599: dup
    //   6600: aload 30
    //   6602: getstatic 350	org/vidogram/ui/c/j:aR	Landroid/text/TextPaint;
    //   6605: iload 8
    //   6607: i2f
    //   6608: getstatic 555	android/text/TextUtils$TruncateAt:END	Landroid/text/TextUtils$TruncateAt;
    //   6611: invokestatic 561	android/text/TextUtils:ellipsize	(Ljava/lang/CharSequence;Landroid/text/TextPaint;FLandroid/text/TextUtils$TruncateAt;)Ljava/lang/CharSequence;
    //   6614: getstatic 350	org/vidogram/ui/c/j:aR	Landroid/text/TextPaint;
    //   6617: fconst_2
    //   6618: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   6621: iload 8
    //   6623: iadd
    //   6624: getstatic 567	android/text/Layout$Alignment:ALIGN_NORMAL	Landroid/text/Layout$Alignment;
    //   6627: fconst_1
    //   6628: fconst_0
    //   6629: iconst_0
    //   6630: invokespecial 570	android/text/StaticLayout:<init>	(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;FFZ)V
    //   6633: putfield 872	org/vidogram/ui/c/j:G	Landroid/text/StaticLayout;
    //   6636: aload_0
    //   6637: new 269	android/text/StaticLayout
    //   6640: dup
    //   6641: aload 29
    //   6643: bipush 10
    //   6645: bipush 32
    //   6647: invokevirtual 549	java/lang/String:replace	(CC)Ljava/lang/String;
    //   6650: getstatic 352	org/vidogram/ui/c/j:aS	Landroid/text/TextPaint;
    //   6653: iload 8
    //   6655: i2f
    //   6656: getstatic 555	android/text/TextUtils$TruncateAt:END	Landroid/text/TextUtils$TruncateAt;
    //   6659: invokestatic 561	android/text/TextUtils:ellipsize	(Ljava/lang/CharSequence;Landroid/text/TextPaint;FLandroid/text/TextUtils$TruncateAt;)Ljava/lang/CharSequence;
    //   6662: getstatic 352	org/vidogram/ui/c/j:aS	Landroid/text/TextPaint;
    //   6665: fconst_2
    //   6666: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   6669: iload 8
    //   6671: iadd
    //   6672: getstatic 567	android/text/Layout$Alignment:ALIGN_NORMAL	Landroid/text/Layout$Alignment;
    //   6675: fconst_1
    //   6676: fconst_0
    //   6677: iconst_0
    //   6678: invokespecial 570	android/text/StaticLayout:<init>	(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;FFZ)V
    //   6681: putfield 666	org/vidogram/ui/c/j:K	Landroid/text/StaticLayout;
    //   6684: aload_0
    //   6685: aload_1
    //   6686: invokespecial 2135	org/vidogram/ui/c/j:setMessageObjectInternal	(Lorg/vidogram/messenger/u;)V
    //   6689: aload_0
    //   6690: getfield 1595	org/vidogram/ui/c/j:ce	Z
    //   6693: ifeq +219 -> 6912
    //   6696: aload_1
    //   6697: invokevirtual 1723	org/vidogram/messenger/u:S	()Z
    //   6700: ifeq +212 -> 6912
    //   6703: aload_0
    //   6704: aload_0
    //   6705: getfield 826	org/vidogram/ui/c/j:cA	I
    //   6708: ldc_w 1018
    //   6711: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   6714: iadd
    //   6715: putfield 826	org/vidogram/ui/c/j:cA	I
    //   6718: aload_0
    //   6719: ldc_w 2258
    //   6722: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   6725: aload_0
    //   6726: getfield 826	org/vidogram/ui/c/j:cA	I
    //   6729: iadd
    //   6730: putfield 776	org/vidogram/ui/c/j:d	I
    //   6733: aload_0
    //   6734: getfield 666	org/vidogram/ui/c/j:K	Landroid/text/StaticLayout;
    //   6737: invokevirtual 575	android/text/StaticLayout:getLineCount	()I
    //   6740: ifle -2903 -> 3837
    //   6743: aload_0
    //   6744: getfield 267	org/vidogram/ui/c/j:bx	I
    //   6747: ldc_w 2243
    //   6750: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   6753: isub
    //   6754: aload_0
    //   6755: getfield 666	org/vidogram/ui/c/j:K	Landroid/text/StaticLayout;
    //   6758: iconst_0
    //   6759: invokevirtual 672	android/text/StaticLayout:getLineWidth	(I)F
    //   6762: f2d
    //   6763: invokestatic 506	java/lang/Math:ceil	(D)D
    //   6766: d2i
    //   6767: isub
    //   6768: aload_0
    //   6769: getfield 514	org/vidogram/ui/c/j:cj	I
    //   6772: if_icmpge -2935 -> 3837
    //   6775: aload_0
    //   6776: aload_0
    //   6777: getfield 776	org/vidogram/ui/c/j:d	I
    //   6780: ldc_w 903
    //   6783: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   6786: iadd
    //   6787: putfield 776	org/vidogram/ui/c/j:d	I
    //   6790: goto -2953 -> 3837
    //   6793: ldc_w 1545
    //   6796: fstore 6
    //   6798: goto -437 -> 6361
    //   6801: getstatic 1638	org/vidogram/messenger/a:c	Landroid/graphics/Point;
    //   6804: getfield 1641	android/graphics/Point:x	I
    //   6807: istore 8
    //   6809: aload_0
    //   6810: getfield 1586	org/vidogram/ui/c/j:a	Z
    //   6813: ifeq +46 -> 6859
    //   6816: aload_1
    //   6817: invokevirtual 1338	org/vidogram/messenger/u:l	()Z
    //   6820: ifeq +39 -> 6859
    //   6823: aload_1
    //   6824: invokevirtual 524	org/vidogram/messenger/u:k	()Z
    //   6827: ifne +32 -> 6859
    //   6830: ldc_w 2241
    //   6833: fstore 6
    //   6835: aload_0
    //   6836: iload 8
    //   6838: fload 6
    //   6840: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   6843: isub
    //   6844: ldc_w 2242
    //   6847: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   6850: invokestatic 521	java/lang/Math:min	(II)I
    //   6853: putfield 267	org/vidogram/ui/c/j:bx	I
    //   6856: goto -474 -> 6382
    //   6859: ldc_w 1545
    //   6862: fstore 6
    //   6864: goto -29 -> 6835
    //   6867: getstatic 2260	org/vidogram/ui/a/l:L	[Landroid/graphics/drawable/Drawable;
    //   6870: astore 30
    //   6872: aload_1
    //   6873: invokevirtual 524	org/vidogram/messenger/u:k	()Z
    //   6876: ifeq +16 -> 6892
    //   6879: iconst_1
    //   6880: istore 9
    //   6882: aload 30
    //   6884: iload 9
    //   6886: aaload
    //   6887: astore 30
    //   6889: goto -389 -> 6500
    //   6892: iconst_0
    //   6893: istore 9
    //   6895: goto -13 -> 6882
    //   6898: ldc_w 2262
    //   6901: ldc_w 2263
    //   6904: invokestatic 656	org/vidogram/messenger/r:a	(Ljava/lang/String;I)Ljava/lang/String;
    //   6907: astore 29
    //   6909: goto -360 -> 6549
    //   6912: aload_0
    //   6913: getfield 1686	org/vidogram/ui/c/j:cb	Z
    //   6916: ifeq -198 -> 6718
    //   6919: aload_1
    //   6920: getfield 453	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   6923: getfield 1532	org/vidogram/tgnet/g$ar:g	I
    //   6926: ifne -208 -> 6718
    //   6929: aload_0
    //   6930: aload_0
    //   6931: getfield 826	org/vidogram/ui/c/j:cA	I
    //   6934: ldc_w 1142
    //   6937: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   6940: iadd
    //   6941: putfield 826	org/vidogram/ui/c/j:cA	I
    //   6944: goto -226 -> 6718
    //   6947: aload_1
    //   6948: getfield 450	org/vidogram/messenger/u:f	I
    //   6951: iconst_2
    //   6952: if_icmpne +173 -> 7125
    //   6955: aload_0
    //   6956: iconst_1
    //   6957: putfield 1595	org/vidogram/ui/c/j:ce	Z
    //   6960: invokestatic 1632	org/vidogram/messenger/a:c	()Z
    //   6963: ifeq +96 -> 7059
    //   6966: invokestatic 1634	org/vidogram/messenger/a:e	()I
    //   6969: istore 8
    //   6971: aload_0
    //   6972: getfield 1586	org/vidogram/ui/c/j:a	Z
    //   6975: ifeq +76 -> 7051
    //   6978: aload_1
    //   6979: invokevirtual 1338	org/vidogram/messenger/u:l	()Z
    //   6982: ifeq +69 -> 7051
    //   6985: aload_1
    //   6986: invokevirtual 524	org/vidogram/messenger/u:k	()Z
    //   6989: ifne +62 -> 7051
    //   6992: ldc_w 2241
    //   6995: fstore 6
    //   6997: aload_0
    //   6998: iload 8
    //   7000: fload 6
    //   7002: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   7005: isub
    //   7006: ldc_w 2242
    //   7009: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   7012: invokestatic 521	java/lang/Math:min	(II)I
    //   7015: putfield 267	org/vidogram/ui/c/j:bx	I
    //   7018: aload_0
    //   7019: aload_0
    //   7020: getfield 267	org/vidogram/ui/c/j:bx	I
    //   7023: aload_1
    //   7024: invokespecial 2224	org/vidogram/ui/c/j:a	(ILorg/vidogram/messenger/u;)I
    //   7027: pop
    //   7028: aload_0
    //   7029: aload_1
    //   7030: invokespecial 2135	org/vidogram/ui/c/j:setMessageObjectInternal	(Lorg/vidogram/messenger/u;)V
    //   7033: aload_0
    //   7034: ldc_w 2258
    //   7037: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   7040: aload_0
    //   7041: getfield 826	org/vidogram/ui/c/j:cA	I
    //   7044: iadd
    //   7045: putfield 776	org/vidogram/ui/c/j:d	I
    //   7048: goto -3211 -> 3837
    //   7051: ldc_w 1545
    //   7054: fstore 6
    //   7056: goto -59 -> 6997
    //   7059: getstatic 1638	org/vidogram/messenger/a:c	Landroid/graphics/Point;
    //   7062: getfield 1641	android/graphics/Point:x	I
    //   7065: istore 8
    //   7067: aload_0
    //   7068: getfield 1586	org/vidogram/ui/c/j:a	Z
    //   7071: ifeq +46 -> 7117
    //   7074: aload_1
    //   7075: invokevirtual 1338	org/vidogram/messenger/u:l	()Z
    //   7078: ifeq +39 -> 7117
    //   7081: aload_1
    //   7082: invokevirtual 524	org/vidogram/messenger/u:k	()Z
    //   7085: ifne +32 -> 7117
    //   7088: ldc_w 2241
    //   7091: fstore 6
    //   7093: aload_0
    //   7094: iload 8
    //   7096: fload 6
    //   7098: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   7101: isub
    //   7102: ldc_w 2242
    //   7105: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   7108: invokestatic 521	java/lang/Math:min	(II)I
    //   7111: putfield 267	org/vidogram/ui/c/j:bx	I
    //   7114: goto -96 -> 7018
    //   7117: ldc_w 1545
    //   7120: fstore 6
    //   7122: goto -29 -> 7093
    //   7125: aload_1
    //   7126: getfield 450	org/vidogram/messenger/u:f	I
    //   7129: bipush 14
    //   7131: if_icmpne +168 -> 7299
    //   7134: invokestatic 1632	org/vidogram/messenger/a:c	()Z
    //   7137: ifeq +96 -> 7233
    //   7140: invokestatic 1634	org/vidogram/messenger/a:e	()I
    //   7143: istore 8
    //   7145: aload_0
    //   7146: getfield 1586	org/vidogram/ui/c/j:a	Z
    //   7149: ifeq +76 -> 7225
    //   7152: aload_1
    //   7153: invokevirtual 1338	org/vidogram/messenger/u:l	()Z
    //   7156: ifeq +69 -> 7225
    //   7159: aload_1
    //   7160: invokevirtual 524	org/vidogram/messenger/u:k	()Z
    //   7163: ifne +62 -> 7225
    //   7166: ldc_w 2241
    //   7169: fstore 6
    //   7171: aload_0
    //   7172: iload 8
    //   7174: fload 6
    //   7176: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   7179: isub
    //   7180: ldc_w 2242
    //   7183: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   7186: invokestatic 521	java/lang/Math:min	(II)I
    //   7189: putfield 267	org/vidogram/ui/c/j:bx	I
    //   7192: aload_0
    //   7193: aload_0
    //   7194: getfield 267	org/vidogram/ui/c/j:bx	I
    //   7197: aload_1
    //   7198: invokespecial 2224	org/vidogram/ui/c/j:a	(ILorg/vidogram/messenger/u;)I
    //   7201: pop
    //   7202: aload_0
    //   7203: aload_1
    //   7204: invokespecial 2135	org/vidogram/ui/c/j:setMessageObjectInternal	(Lorg/vidogram/messenger/u;)V
    //   7207: aload_0
    //   7208: ldc_w 2264
    //   7211: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   7214: aload_0
    //   7215: getfield 826	org/vidogram/ui/c/j:cA	I
    //   7218: iadd
    //   7219: putfield 776	org/vidogram/ui/c/j:d	I
    //   7222: goto -3385 -> 3837
    //   7225: ldc_w 1545
    //   7228: fstore 6
    //   7230: goto -59 -> 7171
    //   7233: getstatic 1638	org/vidogram/messenger/a:c	Landroid/graphics/Point;
    //   7236: getfield 1641	android/graphics/Point:x	I
    //   7239: istore 8
    //   7241: aload_0
    //   7242: getfield 1586	org/vidogram/ui/c/j:a	Z
    //   7245: ifeq +46 -> 7291
    //   7248: aload_1
    //   7249: invokevirtual 1338	org/vidogram/messenger/u:l	()Z
    //   7252: ifeq +39 -> 7291
    //   7255: aload_1
    //   7256: invokevirtual 524	org/vidogram/messenger/u:k	()Z
    //   7259: ifne +32 -> 7291
    //   7262: ldc_w 2241
    //   7265: fstore 6
    //   7267: aload_0
    //   7268: iload 8
    //   7270: fload 6
    //   7272: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   7275: isub
    //   7276: ldc_w 2242
    //   7279: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   7282: invokestatic 521	java/lang/Math:min	(II)I
    //   7285: putfield 267	org/vidogram/ui/c/j:bx	I
    //   7288: goto -96 -> 7192
    //   7291: ldc_w 1545
    //   7294: fstore 6
    //   7296: goto -29 -> 7267
    //   7299: aload_1
    //   7300: getfield 453	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   7303: getfield 1507	org/vidogram/tgnet/g$ar:w	Lorg/vidogram/tgnet/g$nt;
    //   7306: ifnull +461 -> 7767
    //   7309: aload_1
    //   7310: getfield 450	org/vidogram/messenger/u:f	I
    //   7313: bipush 13
    //   7315: if_icmpeq +452 -> 7767
    //   7318: iconst_1
    //   7319: istore 28
    //   7321: aload_0
    //   7322: iload 28
    //   7324: putfield 1595	org/vidogram/ui/c/j:ce	Z
    //   7327: aload_1
    //   7328: getfield 450	org/vidogram/messenger/u:f	I
    //   7331: bipush 9
    //   7333: if_icmpeq +440 -> 7773
    //   7336: iconst_1
    //   7337: istore 28
    //   7339: aload_0
    //   7340: iload 28
    //   7342: putfield 1141	org/vidogram/ui/c/j:be	Z
    //   7345: aload_0
    //   7346: iconst_1
    //   7347: putfield 1024	org/vidogram/ui/c/j:s	Z
    //   7350: aload_0
    //   7351: iconst_1
    //   7352: putfield 639	org/vidogram/ui/c/j:v	Z
    //   7355: iconst_0
    //   7356: istore 15
    //   7358: iconst_0
    //   7359: istore 13
    //   7361: aload_1
    //   7362: getfield 1445	org/vidogram/messenger/u:k	F
    //   7365: fconst_2
    //   7366: fcmpl
    //   7367: ifeq +26 -> 7393
    //   7370: invokestatic 409	org/vidogram/messenger/MediaController:a	()Lorg/vidogram/messenger/MediaController;
    //   7373: invokevirtual 1475	org/vidogram/messenger/MediaController:B	()Z
    //   7376: ifne +17 -> 7393
    //   7379: aload_1
    //   7380: getfield 450	org/vidogram/messenger/u:f	I
    //   7383: bipush 8
    //   7385: if_icmpne +8 -> 7393
    //   7388: aload_1
    //   7389: fconst_1
    //   7390: putfield 1445	org/vidogram/messenger/u:k	F
    //   7393: aload_0
    //   7394: getfield 418	org/vidogram/ui/c/j:o	Lorg/vidogram/messenger/q;
    //   7397: astore 29
    //   7399: aload_1
    //   7400: getfield 1445	org/vidogram/messenger/u:k	F
    //   7403: fconst_0
    //   7404: fcmpl
    //   7405: ifne +374 -> 7779
    //   7408: iconst_1
    //   7409: istore 28
    //   7411: aload 29
    //   7413: iload 28
    //   7415: invokevirtual 1467	org/vidogram/messenger/q:g	(Z)V
    //   7418: aload_0
    //   7419: getfield 418	org/vidogram/ui/c/j:o	Lorg/vidogram/messenger/q;
    //   7422: aload_1
    //   7423: invokevirtual 942	org/vidogram/messenger/u:r	()Z
    //   7426: invokevirtual 2265	org/vidogram/messenger/q:d	(Z)V
    //   7429: aload_1
    //   7430: getfield 450	org/vidogram/messenger/u:f	I
    //   7433: bipush 9
    //   7435: if_icmpne +476 -> 7911
    //   7438: invokestatic 1632	org/vidogram/messenger/a:c	()Z
    //   7441: ifeq +352 -> 7793
    //   7444: invokestatic 1634	org/vidogram/messenger/a:e	()I
    //   7447: istore 8
    //   7449: aload_0
    //   7450: getfield 1586	org/vidogram/ui/c/j:a	Z
    //   7453: ifeq +332 -> 7785
    //   7456: aload_1
    //   7457: invokevirtual 1338	org/vidogram/messenger/u:l	()Z
    //   7460: ifeq +325 -> 7785
    //   7463: aload_1
    //   7464: invokevirtual 524	org/vidogram/messenger/u:k	()Z
    //   7467: ifne +318 -> 7785
    //   7470: ldc_w 2241
    //   7473: fstore 6
    //   7475: aload_0
    //   7476: iload 8
    //   7478: fload 6
    //   7480: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   7483: isub
    //   7484: ldc_w 2242
    //   7487: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   7490: invokestatic 521	java/lang/Math:min	(II)I
    //   7493: putfield 267	org/vidogram/ui/c/j:bx	I
    //   7496: aload_0
    //   7497: aload_1
    //   7498: invokespecial 2132	org/vidogram/ui/c/j:d	(Lorg/vidogram/messenger/u;)Z
    //   7501: ifeq +18 -> 7519
    //   7504: aload_0
    //   7505: aload_0
    //   7506: getfield 267	org/vidogram/ui/c/j:bx	I
    //   7509: ldc_w 1533
    //   7512: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   7515: isub
    //   7516: putfield 267	org/vidogram/ui/c/j:bx	I
    //   7519: aload_0
    //   7520: getfield 267	org/vidogram/ui/c/j:bx	I
    //   7523: ldc_w 2266
    //   7526: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   7529: isub
    //   7530: istore 9
    //   7532: aload_0
    //   7533: iload 9
    //   7535: aload_1
    //   7536: invokespecial 2224	org/vidogram/ui/c/j:a	(ILorg/vidogram/messenger/u;)I
    //   7539: pop
    //   7540: iload 9
    //   7542: istore 8
    //   7544: aload_1
    //   7545: getfield 1275	org/vidogram/messenger/u:d	Ljava/lang/CharSequence;
    //   7548: invokestatic 1483	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   7551: ifne +14 -> 7565
    //   7554: iload 9
    //   7556: ldc_w 540
    //   7559: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   7562: iadd
    //   7563: istore 8
    //   7565: aload_0
    //   7566: getfield 639	org/vidogram/ui/c/j:v	Z
    //   7569: ifeq +290 -> 7859
    //   7572: ldc_w 540
    //   7575: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   7578: istore 9
    //   7580: ldc_w 540
    //   7583: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   7586: istore 10
    //   7588: aload_0
    //   7589: iload 8
    //   7591: putfield 508	org/vidogram/ui/c/j:bq	I
    //   7594: iload 10
    //   7596: istore 8
    //   7598: aload_0
    //   7599: getfield 639	org/vidogram/ui/c/j:v	Z
    //   7602: ifne +83 -> 7685
    //   7605: iload 10
    //   7607: istore 8
    //   7609: aload_1
    //   7610: getfield 1275	org/vidogram/messenger/u:d	Ljava/lang/CharSequence;
    //   7613: invokestatic 1483	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   7616: ifeq +69 -> 7685
    //   7619: iload 10
    //   7621: istore 8
    //   7623: aload_0
    //   7624: getfield 616	org/vidogram/ui/c/j:Q	Landroid/text/StaticLayout;
    //   7627: invokevirtual 575	android/text/StaticLayout:getLineCount	()I
    //   7630: ifle +55 -> 7685
    //   7633: aload_0
    //   7634: aload_1
    //   7635: invokespecial 511	org/vidogram/ui/c/j:c	(Lorg/vidogram/messenger/u;)V
    //   7638: iload 10
    //   7640: istore 8
    //   7642: aload_0
    //   7643: getfield 267	org/vidogram/ui/c/j:bx	I
    //   7646: ldc_w 2133
    //   7649: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   7652: isub
    //   7653: aload_0
    //   7654: getfield 616	org/vidogram/ui/c/j:Q	Landroid/text/StaticLayout;
    //   7657: iconst_0
    //   7658: invokevirtual 672	android/text/StaticLayout:getLineWidth	(I)F
    //   7661: f2d
    //   7662: invokestatic 506	java/lang/Math:ceil	(D)D
    //   7665: d2i
    //   7666: isub
    //   7667: aload_0
    //   7668: getfield 514	org/vidogram/ui/c/j:cj	I
    //   7671: if_icmpge +14 -> 7685
    //   7674: iload 10
    //   7676: ldc_w 903
    //   7679: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   7682: iadd
    //   7683: istore 8
    //   7685: iload 13
    //   7687: istore 12
    //   7689: aload_0
    //   7690: aload_1
    //   7691: invokespecial 2135	org/vidogram/ui/c/j:setMessageObjectInternal	(Lorg/vidogram/messenger/u;)V
    //   7694: aload_0
    //   7695: getfield 1595	org/vidogram/ui/c/j:ce	Z
    //   7698: ifeq +3361 -> 11059
    //   7701: aload_0
    //   7702: aload_0
    //   7703: getfield 826	org/vidogram/ui/c/j:cA	I
    //   7706: ldc_w 1018
    //   7709: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   7712: iadd
    //   7713: putfield 826	org/vidogram/ui/c/j:cA	I
    //   7716: aload_0
    //   7717: invokevirtual 769	org/vidogram/ui/c/j:invalidate	()V
    //   7720: aload_0
    //   7721: getfield 418	org/vidogram/ui/c/j:o	Lorg/vidogram/messenger/q;
    //   7724: iconst_0
    //   7725: ldc_w 1142
    //   7728: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   7731: aload_0
    //   7732: getfield 826	org/vidogram/ui/c/j:cA	I
    //   7735: iadd
    //   7736: iload 9
    //   7738: iload 8
    //   7740: invokevirtual 915	org/vidogram/messenger/q:a	(IIII)V
    //   7743: aload_0
    //   7744: ldc_w 387
    //   7747: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   7750: iload 8
    //   7752: iadd
    //   7753: aload_0
    //   7754: getfield 826	org/vidogram/ui/c/j:cA	I
    //   7757: iadd
    //   7758: iload 12
    //   7760: iadd
    //   7761: putfield 776	org/vidogram/ui/c/j:d	I
    //   7764: goto -3927 -> 3837
    //   7767: iconst_0
    //   7768: istore 28
    //   7770: goto -449 -> 7321
    //   7773: iconst_0
    //   7774: istore 28
    //   7776: goto -437 -> 7339
    //   7779: iconst_0
    //   7780: istore 28
    //   7782: goto -371 -> 7411
    //   7785: ldc_w 1545
    //   7788: fstore 6
    //   7790: goto -315 -> 7475
    //   7793: getstatic 1638	org/vidogram/messenger/a:c	Landroid/graphics/Point;
    //   7796: getfield 1641	android/graphics/Point:x	I
    //   7799: istore 8
    //   7801: aload_0
    //   7802: getfield 1586	org/vidogram/ui/c/j:a	Z
    //   7805: ifeq +46 -> 7851
    //   7808: aload_1
    //   7809: invokevirtual 1338	org/vidogram/messenger/u:l	()Z
    //   7812: ifeq +39 -> 7851
    //   7815: aload_1
    //   7816: invokevirtual 524	org/vidogram/messenger/u:k	()Z
    //   7819: ifne +32 -> 7851
    //   7822: ldc_w 2241
    //   7825: fstore 6
    //   7827: aload_0
    //   7828: iload 8
    //   7830: fload 6
    //   7832: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   7835: isub
    //   7836: ldc_w 2242
    //   7839: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   7842: invokestatic 521	java/lang/Math:min	(II)I
    //   7845: putfield 267	org/vidogram/ui/c/j:bx	I
    //   7848: goto -352 -> 7496
    //   7851: ldc_w 1545
    //   7854: fstore 6
    //   7856: goto -29 -> 7827
    //   7859: ldc_w 1082
    //   7862: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   7865: istore 9
    //   7867: ldc_w 1082
    //   7870: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   7873: istore 10
    //   7875: aload_1
    //   7876: getfield 1275	org/vidogram/messenger/u:d	Ljava/lang/CharSequence;
    //   7879: invokestatic 1483	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   7882: ifeq +21 -> 7903
    //   7885: ldc_w 1069
    //   7888: fstore 6
    //   7890: iload 8
    //   7892: fload 6
    //   7894: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   7897: iadd
    //   7898: istore 8
    //   7900: goto -312 -> 7588
    //   7903: ldc_w 395
    //   7906: fstore 6
    //   7908: goto -18 -> 7890
    //   7911: aload_1
    //   7912: getfield 450	org/vidogram/messenger/u:f	I
    //   7915: iconst_4
    //   7916: if_icmpne +612 -> 8528
    //   7919: aload_1
    //   7920: getfield 453	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   7923: getfield 458	org/vidogram/tgnet/g$ar:j	Lorg/vidogram/tgnet/g$au;
    //   7926: getfield 1282	org/vidogram/tgnet/g$au:e	Lorg/vidogram/tgnet/g$y;
    //   7929: getfield 1286	org/vidogram/tgnet/g$y:c	D
    //   7932: dstore_2
    //   7933: aload_1
    //   7934: getfield 453	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   7937: getfield 458	org/vidogram/tgnet/g$ar:j	Lorg/vidogram/tgnet/g$au;
    //   7940: getfield 1282	org/vidogram/tgnet/g$au:e	Lorg/vidogram/tgnet/g$y;
    //   7943: getfield 1288	org/vidogram/tgnet/g$y:b	D
    //   7946: dstore 4
    //   7948: aload_1
    //   7949: getfield 453	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   7952: getfield 458	org/vidogram/tgnet/g$ar:j	Lorg/vidogram/tgnet/g$au;
    //   7955: getfield 2267	org/vidogram/tgnet/g$au:f	Ljava/lang/String;
    //   7958: ifnull +455 -> 8413
    //   7961: aload_1
    //   7962: getfield 453	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   7965: getfield 458	org/vidogram/tgnet/g$ar:j	Lorg/vidogram/tgnet/g$au;
    //   7968: getfield 2267	org/vidogram/tgnet/g$au:f	Ljava/lang/String;
    //   7971: invokevirtual 648	java/lang/String:length	()I
    //   7974: ifle +439 -> 8413
    //   7977: invokestatic 1632	org/vidogram/messenger/a:c	()Z
    //   7980: ifeq +359 -> 8339
    //   7983: invokestatic 1634	org/vidogram/messenger/a:e	()I
    //   7986: istore 8
    //   7988: aload_0
    //   7989: getfield 1586	org/vidogram/ui/c/j:a	Z
    //   7992: ifeq +339 -> 8331
    //   7995: aload_1
    //   7996: invokevirtual 1338	org/vidogram/messenger/u:l	()Z
    //   7999: ifeq +332 -> 8331
    //   8002: aload_1
    //   8003: invokevirtual 524	org/vidogram/messenger/u:k	()Z
    //   8006: ifne +325 -> 8331
    //   8009: ldc_w 2241
    //   8012: fstore 6
    //   8014: aload_0
    //   8015: iload 8
    //   8017: fload 6
    //   8019: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   8022: isub
    //   8023: ldc_w 2242
    //   8026: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   8029: invokestatic 521	java/lang/Math:min	(II)I
    //   8032: putfield 267	org/vidogram/ui/c/j:bx	I
    //   8035: aload_0
    //   8036: aload_1
    //   8037: invokespecial 2132	org/vidogram/ui/c/j:d	(Lorg/vidogram/messenger/u;)Z
    //   8040: ifeq +18 -> 8058
    //   8043: aload_0
    //   8044: aload_0
    //   8045: getfield 267	org/vidogram/ui/c/j:bx	I
    //   8048: ldc_w 1533
    //   8051: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   8054: isub
    //   8055: putfield 267	org/vidogram/ui/c/j:bx	I
    //   8058: aload_0
    //   8059: getfield 267	org/vidogram/ui/c/j:bx	I
    //   8062: ldc_w 2268
    //   8065: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   8068: isub
    //   8069: istore 8
    //   8071: aload_0
    //   8072: aload_1
    //   8073: getfield 453	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   8076: getfield 458	org/vidogram/tgnet/g$ar:j	Lorg/vidogram/tgnet/g$au;
    //   8079: getfield 2267	org/vidogram/tgnet/g$au:f	Ljava/lang/String;
    //   8082: getstatic 330	org/vidogram/ui/c/j:ar	Landroid/text/TextPaint;
    //   8085: iload 8
    //   8087: getstatic 567	android/text/Layout$Alignment:ALIGN_NORMAL	Landroid/text/Layout$Alignment;
    //   8090: fconst_1
    //   8091: fconst_0
    //   8092: iconst_0
    //   8093: getstatic 555	android/text/TextUtils$TruncateAt:END	Landroid/text/TextUtils$TruncateAt;
    //   8096: iload 8
    //   8098: iconst_2
    //   8099: invokestatic 664	org/vidogram/ui/Components/bj:a	(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;FFZLandroid/text/TextUtils$TruncateAt;II)Landroid/text/StaticLayout;
    //   8102: putfield 666	org/vidogram/ui/c/j:K	Landroid/text/StaticLayout;
    //   8105: aload_0
    //   8106: getfield 666	org/vidogram/ui/c/j:K	Landroid/text/StaticLayout;
    //   8109: invokevirtual 575	android/text/StaticLayout:getLineCount	()I
    //   8112: istore 9
    //   8114: aload_1
    //   8115: getfield 453	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   8118: getfield 458	org/vidogram/tgnet/g$ar:j	Lorg/vidogram/tgnet/g$au;
    //   8121: getfield 2269	org/vidogram/tgnet/g$au:g	Ljava/lang/String;
    //   8124: ifnull +281 -> 8405
    //   8127: aload_1
    //   8128: getfield 453	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   8131: getfield 458	org/vidogram/tgnet/g$ar:j	Lorg/vidogram/tgnet/g$au;
    //   8134: getfield 2269	org/vidogram/tgnet/g$au:g	Ljava/lang/String;
    //   8137: invokevirtual 648	java/lang/String:length	()I
    //   8140: ifle +265 -> 8405
    //   8143: aload_0
    //   8144: aload_1
    //   8145: getfield 453	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   8148: getfield 458	org/vidogram/tgnet/g$ar:j	Lorg/vidogram/tgnet/g$au;
    //   8151: getfield 2269	org/vidogram/tgnet/g$au:g	Ljava/lang/String;
    //   8154: getstatic 332	org/vidogram/ui/c/j:as	Landroid/text/TextPaint;
    //   8157: iload 8
    //   8159: getstatic 567	android/text/Layout$Alignment:ALIGN_NORMAL	Landroid/text/Layout$Alignment;
    //   8162: fconst_1
    //   8163: fconst_0
    //   8164: iconst_0
    //   8165: getstatic 555	android/text/TextUtils$TruncateAt:END	Landroid/text/TextUtils$TruncateAt;
    //   8168: iload 8
    //   8170: iconst_3
    //   8171: iconst_3
    //   8172: iload 9
    //   8174: isub
    //   8175: invokestatic 521	java/lang/Math:min	(II)I
    //   8178: invokestatic 664	org/vidogram/ui/Components/bj:a	(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;FFZLandroid/text/TextUtils$TruncateAt;II)Landroid/text/StaticLayout;
    //   8181: putfield 616	org/vidogram/ui/c/j:Q	Landroid/text/StaticLayout;
    //   8184: aload_0
    //   8185: iconst_0
    //   8186: putfield 1141	org/vidogram/ui/c/j:be	Z
    //   8189: aload_0
    //   8190: iload 8
    //   8192: putfield 508	org/vidogram/ui/c/j:bq	I
    //   8195: ldc_w 540
    //   8198: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   8201: istore 8
    //   8203: ldc_w 540
    //   8206: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   8209: istore 9
    //   8211: aload_0
    //   8212: getstatic 1294	java/util/Locale:US	Ljava/util/Locale;
    //   8215: ldc_w 2271
    //   8218: iconst_5
    //   8219: anewarray 591	java/lang/Object
    //   8222: dup
    //   8223: iconst_0
    //   8224: dload_2
    //   8225: invokestatic 1301	java/lang/Double:valueOf	(D)Ljava/lang/Double;
    //   8228: aastore
    //   8229: dup
    //   8230: iconst_1
    //   8231: dload 4
    //   8233: invokestatic 1301	java/lang/Double:valueOf	(D)Ljava/lang/Double;
    //   8236: aastore
    //   8237: dup
    //   8238: iconst_2
    //   8239: iconst_2
    //   8240: getstatic 1302	org/vidogram/messenger/a:b	F
    //   8243: f2d
    //   8244: invokestatic 506	java/lang/Math:ceil	(D)D
    //   8247: d2i
    //   8248: invokestatic 521	java/lang/Math:min	(II)I
    //   8251: invokestatic 597	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   8254: aastore
    //   8255: dup
    //   8256: iconst_3
    //   8257: dload_2
    //   8258: invokestatic 1301	java/lang/Double:valueOf	(D)Ljava/lang/Double;
    //   8261: aastore
    //   8262: dup
    //   8263: iconst_4
    //   8264: dload 4
    //   8266: invokestatic 1301	java/lang/Double:valueOf	(D)Ljava/lang/Double;
    //   8269: aastore
    //   8270: invokestatic 1305	java/lang/String:format	(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   8273: putfield 1279	org/vidogram/ui/c/j:S	Ljava/lang/String;
    //   8276: aload_0
    //   8277: getfield 418	org/vidogram/ui/c/j:o	Lorg/vidogram/messenger/q;
    //   8280: astore 30
    //   8282: aload_0
    //   8283: getfield 1279	org/vidogram/ui/c/j:S	Ljava/lang/String;
    //   8286: astore 31
    //   8288: aload_1
    //   8289: invokevirtual 524	org/vidogram/messenger/u:k	()Z
    //   8292: ifeq +228 -> 8520
    //   8295: getstatic 2273	org/vidogram/ui/a/l:H	Landroid/graphics/drawable/Drawable;
    //   8298: astore 29
    //   8300: aload 30
    //   8302: aload 31
    //   8304: aconst_null
    //   8305: aload 29
    //   8307: aconst_null
    //   8308: iconst_0
    //   8309: invokevirtual 2276	org/vidogram/messenger/q:a	(Ljava/lang/String;Ljava/lang/String;Landroid/graphics/drawable/Drawable;Ljava/lang/String;I)V
    //   8312: iload 8
    //   8314: istore 10
    //   8316: iload 9
    //   8318: istore 8
    //   8320: iload 10
    //   8322: istore 9
    //   8324: iload 13
    //   8326: istore 12
    //   8328: goto -639 -> 7689
    //   8331: ldc_w 1545
    //   8334: fstore 6
    //   8336: goto -322 -> 8014
    //   8339: getstatic 1638	org/vidogram/messenger/a:c	Landroid/graphics/Point;
    //   8342: getfield 1641	android/graphics/Point:x	I
    //   8345: istore 8
    //   8347: aload_0
    //   8348: getfield 1586	org/vidogram/ui/c/j:a	Z
    //   8351: ifeq +46 -> 8397
    //   8354: aload_1
    //   8355: invokevirtual 1338	org/vidogram/messenger/u:l	()Z
    //   8358: ifeq +39 -> 8397
    //   8361: aload_1
    //   8362: invokevirtual 524	org/vidogram/messenger/u:k	()Z
    //   8365: ifne +32 -> 8397
    //   8368: ldc_w 2241
    //   8371: fstore 6
    //   8373: aload_0
    //   8374: iload 8
    //   8376: fload 6
    //   8378: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   8381: isub
    //   8382: ldc_w 2242
    //   8385: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   8388: invokestatic 521	java/lang/Math:min	(II)I
    //   8391: putfield 267	org/vidogram/ui/c/j:bx	I
    //   8394: goto -359 -> 8035
    //   8397: ldc_w 1545
    //   8400: fstore 6
    //   8402: goto -29 -> 8373
    //   8405: aload_0
    //   8406: aconst_null
    //   8407: putfield 616	org/vidogram/ui/c/j:Q	Landroid/text/StaticLayout;
    //   8410: goto -226 -> 8184
    //   8413: aload_0
    //   8414: ldc_w 2277
    //   8417: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   8420: putfield 508	org/vidogram/ui/c/j:bq	I
    //   8423: ldc_w 1185
    //   8426: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   8429: istore 8
    //   8431: ldc_w 1691
    //   8434: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   8437: istore 9
    //   8439: aload_0
    //   8440: ldc_w 380
    //   8443: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   8446: iload 8
    //   8448: iadd
    //   8449: putfield 267	org/vidogram/ui/c/j:bx	I
    //   8452: aload_0
    //   8453: getstatic 1294	java/util/Locale:US	Ljava/util/Locale;
    //   8456: ldc_w 2279
    //   8459: iconst_5
    //   8460: anewarray 591	java/lang/Object
    //   8463: dup
    //   8464: iconst_0
    //   8465: dload_2
    //   8466: invokestatic 1301	java/lang/Double:valueOf	(D)Ljava/lang/Double;
    //   8469: aastore
    //   8470: dup
    //   8471: iconst_1
    //   8472: dload 4
    //   8474: invokestatic 1301	java/lang/Double:valueOf	(D)Ljava/lang/Double;
    //   8477: aastore
    //   8478: dup
    //   8479: iconst_2
    //   8480: iconst_2
    //   8481: getstatic 1302	org/vidogram/messenger/a:b	F
    //   8484: f2d
    //   8485: invokestatic 506	java/lang/Math:ceil	(D)D
    //   8488: d2i
    //   8489: invokestatic 521	java/lang/Math:min	(II)I
    //   8492: invokestatic 597	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   8495: aastore
    //   8496: dup
    //   8497: iconst_3
    //   8498: dload_2
    //   8499: invokestatic 1301	java/lang/Double:valueOf	(D)Ljava/lang/Double;
    //   8502: aastore
    //   8503: dup
    //   8504: iconst_4
    //   8505: dload 4
    //   8507: invokestatic 1301	java/lang/Double:valueOf	(D)Ljava/lang/Double;
    //   8510: aastore
    //   8511: invokestatic 1305	java/lang/String:format	(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   8514: putfield 1279	org/vidogram/ui/c/j:S	Ljava/lang/String;
    //   8517: goto -241 -> 8276
    //   8520: getstatic 2281	org/vidogram/ui/a/l:G	Landroid/graphics/drawable/Drawable;
    //   8523: astore 29
    //   8525: goto -225 -> 8300
    //   8528: aload_1
    //   8529: getfield 450	org/vidogram/messenger/u:f	I
    //   8532: bipush 13
    //   8534: if_icmpne +530 -> 9064
    //   8537: aload_0
    //   8538: iconst_0
    //   8539: putfield 265	org/vidogram/ui/c/j:bi	Z
    //   8542: iconst_0
    //   8543: istore 8
    //   8545: iload 8
    //   8547: aload_1
    //   8548: getfield 453	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   8551: getfield 458	org/vidogram/tgnet/g$ar:j	Lorg/vidogram/tgnet/g$au;
    //   8554: getfield 471	org/vidogram/tgnet/g$au:k	Lorg/vidogram/tgnet/g$q;
    //   8557: getfield 480	org/vidogram/tgnet/g$q:o	Ljava/util/ArrayList;
    //   8560: invokevirtual 483	java/util/ArrayList:size	()I
    //   8563: if_icmpge +3148 -> 11711
    //   8566: aload_1
    //   8567: getfield 453	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   8570: getfield 458	org/vidogram/tgnet/g$ar:j	Lorg/vidogram/tgnet/g$au;
    //   8573: getfield 471	org/vidogram/tgnet/g$au:k	Lorg/vidogram/tgnet/g$q;
    //   8576: getfield 480	org/vidogram/tgnet/g$q:o	Ljava/util/ArrayList;
    //   8579: iload 8
    //   8581: invokevirtual 487	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   8584: checkcast 489	org/vidogram/tgnet/g$r
    //   8587: astore 29
    //   8589: aload 29
    //   8591: instanceof 2179
    //   8594: ifeq +277 -> 8871
    //   8597: aload 29
    //   8599: getfield 2180	org/vidogram/tgnet/g$r:h	I
    //   8602: istore 8
    //   8604: aload 29
    //   8606: getfield 2182	org/vidogram/tgnet/g$r:i	I
    //   8609: istore 9
    //   8611: invokestatic 1632	org/vidogram/messenger/a:c	()Z
    //   8614: ifeq +266 -> 8880
    //   8617: invokestatic 1634	org/vidogram/messenger/a:e	()I
    //   8620: i2f
    //   8621: ldc_w 2282
    //   8624: fmul
    //   8625: fstore 7
    //   8627: fload 7
    //   8629: fstore 6
    //   8631: iload 9
    //   8633: istore 10
    //   8635: iload 8
    //   8637: istore 9
    //   8639: iload 8
    //   8641: ifne +19 -> 8660
    //   8644: fload 6
    //   8646: f2i
    //   8647: istore 10
    //   8649: ldc_w 1691
    //   8652: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   8655: iload 10
    //   8657: iadd
    //   8658: istore 9
    //   8660: iload 10
    //   8662: i2f
    //   8663: fload 7
    //   8665: iload 9
    //   8667: i2f
    //   8668: fdiv
    //   8669: fmul
    //   8670: f2i
    //   8671: istore 10
    //   8673: fload 7
    //   8675: f2i
    //   8676: istore 11
    //   8678: iload 10
    //   8680: i2f
    //   8681: fload 6
    //   8683: fcmpl
    //   8684: ifle +3024 -> 11708
    //   8687: iload 11
    //   8689: i2f
    //   8690: fstore 7
    //   8692: fload 6
    //   8694: iload 10
    //   8696: i2f
    //   8697: fdiv
    //   8698: fload 7
    //   8700: fmul
    //   8701: f2i
    //   8702: istore 11
    //   8704: fload 6
    //   8706: f2i
    //   8707: istore 10
    //   8709: aload_0
    //   8710: bipush 6
    //   8712: putfield 476	org/vidogram/ui/c/j:t	I
    //   8715: aload_0
    //   8716: iload 11
    //   8718: ldc_w 387
    //   8721: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   8724: isub
    //   8725: putfield 508	org/vidogram/ui/c/j:bq	I
    //   8728: aload_0
    //   8729: ldc_w 380
    //   8732: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   8735: iload 11
    //   8737: iadd
    //   8738: putfield 267	org/vidogram/ui/c/j:bx	I
    //   8741: aload_0
    //   8742: aload_1
    //   8743: getfield 691	org/vidogram/messenger/u:m	Ljava/util/ArrayList;
    //   8746: bipush 80
    //   8748: invokestatic 696	org/vidogram/messenger/m:a	(Ljava/util/ArrayList;I)Lorg/vidogram/tgnet/g$az;
    //   8751: putfield 1439	org/vidogram/ui/c/j:ai	Lorg/vidogram/tgnet/g$az;
    //   8754: aload_1
    //   8755: getfield 1808	org/vidogram/messenger/u:r	Z
    //   8758: ifeq +157 -> 8915
    //   8761: aload_0
    //   8762: getfield 418	org/vidogram/ui/c/j:o	Lorg/vidogram/messenger/q;
    //   8765: astore 30
    //   8767: aload_1
    //   8768: getfield 453	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   8771: getfield 1813	org/vidogram/tgnet/g$ar:A	Ljava/lang/String;
    //   8774: astore 31
    //   8776: getstatic 1294	java/util/Locale:US	Ljava/util/Locale;
    //   8779: ldc_w 2192
    //   8782: iconst_2
    //   8783: anewarray 591	java/lang/Object
    //   8786: dup
    //   8787: iconst_0
    //   8788: iload 11
    //   8790: invokestatic 597	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   8793: aastore
    //   8794: dup
    //   8795: iconst_1
    //   8796: iload 10
    //   8798: invokestatic 597	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   8801: aastore
    //   8802: invokestatic 1305	java/lang/String:format	(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   8805: astore 32
    //   8807: aload_0
    //   8808: getfield 1439	org/vidogram/ui/c/j:ai	Lorg/vidogram/tgnet/g$az;
    //   8811: ifnull +98 -> 8909
    //   8814: aload_0
    //   8815: getfield 1439	org/vidogram/ui/c/j:ai	Lorg/vidogram/tgnet/g$az;
    //   8818: getfield 635	org/vidogram/tgnet/g$az:c	Lorg/vidogram/tgnet/g$x;
    //   8821: astore 29
    //   8823: aload 30
    //   8825: aconst_null
    //   8826: aload 31
    //   8828: aload 32
    //   8830: aconst_null
    //   8831: aload 29
    //   8833: ldc_w 2196
    //   8836: aload_1
    //   8837: getfield 453	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   8840: getfield 458	org/vidogram/tgnet/g$ar:j	Lorg/vidogram/tgnet/g$au;
    //   8843: getfield 471	org/vidogram/tgnet/g$au:k	Lorg/vidogram/tgnet/g$q;
    //   8846: getfield 609	org/vidogram/tgnet/g$q:h	I
    //   8849: ldc_w 2198
    //   8852: iconst_1
    //   8853: invokevirtual 711	org/vidogram/messenger/q:a	(Lorg/vidogram/tgnet/f;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/drawable/Drawable;Lorg/vidogram/tgnet/g$x;Ljava/lang/String;ILjava/lang/String;Z)V
    //   8856: iload 10
    //   8858: istore 8
    //   8860: iload 11
    //   8862: istore 9
    //   8864: iload 13
    //   8866: istore 12
    //   8868: goto -1179 -> 7689
    //   8871: iload 8
    //   8873: iconst_1
    //   8874: iadd
    //   8875: istore 8
    //   8877: goto -332 -> 8545
    //   8880: getstatic 1638	org/vidogram/messenger/a:c	Landroid/graphics/Point;
    //   8883: getfield 1641	android/graphics/Point:x	I
    //   8886: getstatic 1638	org/vidogram/messenger/a:c	Landroid/graphics/Point;
    //   8889: getfield 1642	android/graphics/Point:y	I
    //   8892: invokestatic 521	java/lang/Math:min	(II)I
    //   8895: i2f
    //   8896: ldc_w 2190
    //   8899: fmul
    //   8900: fstore 7
    //   8902: fload 7
    //   8904: fstore 6
    //   8906: goto -275 -> 8631
    //   8909: aconst_null
    //   8910: astore 29
    //   8912: goto -89 -> 8823
    //   8915: iload 10
    //   8917: istore 8
    //   8919: iload 11
    //   8921: istore 9
    //   8923: iload 13
    //   8925: istore 12
    //   8927: aload_1
    //   8928: getfield 453	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   8931: getfield 458	org/vidogram/tgnet/g$ar:j	Lorg/vidogram/tgnet/g$au;
    //   8934: getfield 471	org/vidogram/tgnet/g$au:k	Lorg/vidogram/tgnet/g$q;
    //   8937: getfield 2284	org/vidogram/tgnet/g$q:b	J
    //   8940: lconst_0
    //   8941: lcmp
    //   8942: ifeq -1253 -> 7689
    //   8945: aload_0
    //   8946: getfield 418	org/vidogram/ui/c/j:o	Lorg/vidogram/messenger/q;
    //   8949: astore 30
    //   8951: aload_1
    //   8952: getfield 453	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   8955: getfield 458	org/vidogram/tgnet/g$ar:j	Lorg/vidogram/tgnet/g$au;
    //   8958: getfield 471	org/vidogram/tgnet/g$au:k	Lorg/vidogram/tgnet/g$q;
    //   8961: astore 31
    //   8963: getstatic 1294	java/util/Locale:US	Ljava/util/Locale;
    //   8966: ldc_w 2192
    //   8969: iconst_2
    //   8970: anewarray 591	java/lang/Object
    //   8973: dup
    //   8974: iconst_0
    //   8975: iload 11
    //   8977: invokestatic 597	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   8980: aastore
    //   8981: dup
    //   8982: iconst_1
    //   8983: iload 10
    //   8985: invokestatic 597	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   8988: aastore
    //   8989: invokestatic 1305	java/lang/String:format	(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   8992: astore 32
    //   8994: aload_0
    //   8995: getfield 1439	org/vidogram/ui/c/j:ai	Lorg/vidogram/tgnet/g$az;
    //   8998: ifnull +60 -> 9058
    //   9001: aload_0
    //   9002: getfield 1439	org/vidogram/ui/c/j:ai	Lorg/vidogram/tgnet/g$az;
    //   9005: getfield 635	org/vidogram/tgnet/g$az:c	Lorg/vidogram/tgnet/g$x;
    //   9008: astore 29
    //   9010: aload 30
    //   9012: aload 31
    //   9014: aconst_null
    //   9015: aload 32
    //   9017: aconst_null
    //   9018: aload 29
    //   9020: ldc_w 2196
    //   9023: aload_1
    //   9024: getfield 453	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   9027: getfield 458	org/vidogram/tgnet/g$ar:j	Lorg/vidogram/tgnet/g$au;
    //   9030: getfield 471	org/vidogram/tgnet/g$au:k	Lorg/vidogram/tgnet/g$q;
    //   9033: getfield 609	org/vidogram/tgnet/g$q:h	I
    //   9036: ldc_w 2198
    //   9039: iconst_1
    //   9040: invokevirtual 711	org/vidogram/messenger/q:a	(Lorg/vidogram/tgnet/f;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/drawable/Drawable;Lorg/vidogram/tgnet/g$x;Ljava/lang/String;ILjava/lang/String;Z)V
    //   9043: iload 10
    //   9045: istore 8
    //   9047: iload 11
    //   9049: istore 9
    //   9051: iload 13
    //   9053: istore 12
    //   9055: goto -1366 -> 7689
    //   9058: aconst_null
    //   9059: astore 29
    //   9061: goto -51 -> 9010
    //   9064: invokestatic 1632	org/vidogram/messenger/a:c	()Z
    //   9067: ifeq +1099 -> 10166
    //   9070: invokestatic 1634	org/vidogram/messenger/a:e	()I
    //   9073: i2f
    //   9074: ldc_w 2285
    //   9077: fmul
    //   9078: f2i
    //   9079: istore 8
    //   9081: iload 8
    //   9083: istore 9
    //   9085: ldc_w 1691
    //   9088: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   9091: iload 9
    //   9093: iadd
    //   9094: istore 10
    //   9096: aload_0
    //   9097: aload_1
    //   9098: invokespecial 2132	org/vidogram/ui/c/j:d	(Lorg/vidogram/messenger/u;)Z
    //   9101: ifeq +2600 -> 11701
    //   9104: ldc_w 1533
    //   9107: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   9110: istore 11
    //   9112: iload 9
    //   9114: ldc_w 1533
    //   9117: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   9120: isub
    //   9121: istore 9
    //   9123: iload 8
    //   9125: iload 11
    //   9127: isub
    //   9128: istore 13
    //   9130: iload 9
    //   9132: invokestatic 693	org/vidogram/messenger/a:f	()I
    //   9135: if_icmple +2559 -> 11694
    //   9138: invokestatic 693	org/vidogram/messenger/a:f	()I
    //   9141: istore 14
    //   9143: iload 10
    //   9145: invokestatic 693	org/vidogram/messenger/a:f	()I
    //   9148: if_icmple +2543 -> 11691
    //   9151: invokestatic 693	org/vidogram/messenger/a:f	()I
    //   9154: istore 10
    //   9156: aload_1
    //   9157: getfield 450	org/vidogram/messenger/u:f	I
    //   9160: iconst_1
    //   9161: if_icmpne +1035 -> 10196
    //   9164: aload_0
    //   9165: aload_1
    //   9166: invokespecial 1002	org/vidogram/ui/c/j:a	(Lorg/vidogram/messenger/u;)V
    //   9169: aload_0
    //   9170: aload_1
    //   9171: getfield 691	org/vidogram/messenger/u:m	Ljava/util/ArrayList;
    //   9174: bipush 80
    //   9176: invokestatic 696	org/vidogram/messenger/m:a	(Ljava/util/ArrayList;I)Lorg/vidogram/tgnet/g$az;
    //   9179: putfield 1439	org/vidogram/ui/c/j:ai	Lorg/vidogram/tgnet/g$az;
    //   9182: aload_1
    //   9183: getfield 1275	org/vidogram/messenger/u:d	Ljava/lang/CharSequence;
    //   9186: ifnull +8 -> 9194
    //   9189: aload_0
    //   9190: iconst_0
    //   9191: putfield 1141	org/vidogram/ui/c/j:be	Z
    //   9194: aload_0
    //   9195: aload_1
    //   9196: getfield 691	org/vidogram/messenger/u:m	Ljava/util/ArrayList;
    //   9199: invokestatic 693	org/vidogram/messenger/a:f	()I
    //   9202: invokestatic 696	org/vidogram/messenger/m:a	(Ljava/util/ArrayList;I)Lorg/vidogram/tgnet/g$az;
    //   9205: putfield 698	org/vidogram/ui/c/j:ah	Lorg/vidogram/tgnet/g$az;
    //   9208: iconst_0
    //   9209: istore 9
    //   9211: iconst_0
    //   9212: istore 8
    //   9214: aload_0
    //   9215: getfield 698	org/vidogram/ui/c/j:ah	Lorg/vidogram/tgnet/g$az;
    //   9218: ifnull +19 -> 9237
    //   9221: aload_0
    //   9222: getfield 698	org/vidogram/ui/c/j:ah	Lorg/vidogram/tgnet/g$az;
    //   9225: aload_0
    //   9226: getfield 1439	org/vidogram/ui/c/j:ai	Lorg/vidogram/tgnet/g$az;
    //   9229: if_acmpne +8 -> 9237
    //   9232: aload_0
    //   9233: aconst_null
    //   9234: putfield 1439	org/vidogram/ui/c/j:ai	Lorg/vidogram/tgnet/g$az;
    //   9237: aload_0
    //   9238: getfield 698	org/vidogram/ui/c/j:ah	Lorg/vidogram/tgnet/g$az;
    //   9241: ifnull +108 -> 9349
    //   9244: aload_0
    //   9245: getfield 698	org/vidogram/ui/c/j:ah	Lorg/vidogram/tgnet/g$az;
    //   9248: getfield 2176	org/vidogram/tgnet/g$az:d	I
    //   9251: i2f
    //   9252: iload 14
    //   9254: i2f
    //   9255: fdiv
    //   9256: fstore 6
    //   9258: aload_0
    //   9259: getfield 698	org/vidogram/ui/c/j:ah	Lorg/vidogram/tgnet/g$az;
    //   9262: getfield 2176	org/vidogram/tgnet/g$az:d	I
    //   9265: i2f
    //   9266: fload 6
    //   9268: fdiv
    //   9269: f2i
    //   9270: istore 9
    //   9272: aload_0
    //   9273: getfield 698	org/vidogram/ui/c/j:ah	Lorg/vidogram/tgnet/g$az;
    //   9276: getfield 2177	org/vidogram/tgnet/g$az:e	I
    //   9279: i2f
    //   9280: fload 6
    //   9282: fdiv
    //   9283: f2i
    //   9284: istore 8
    //   9286: iload 9
    //   9288: istore 11
    //   9290: iload 9
    //   9292: ifne +11 -> 9303
    //   9295: ldc_w 2183
    //   9298: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   9301: istore 11
    //   9303: iload 8
    //   9305: istore 12
    //   9307: iload 8
    //   9309: ifne +11 -> 9320
    //   9312: ldc_w 2183
    //   9315: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   9318: istore 12
    //   9320: iload 12
    //   9322: iload 10
    //   9324: if_icmple +1012 -> 10336
    //   9327: iload 12
    //   9329: i2f
    //   9330: iload 10
    //   9332: i2f
    //   9333: fdiv
    //   9334: fstore 6
    //   9336: iload 11
    //   9338: i2f
    //   9339: fload 6
    //   9341: fdiv
    //   9342: f2i
    //   9343: istore 9
    //   9345: iload 10
    //   9347: istore 8
    //   9349: iload 9
    //   9351: ifeq +8 -> 9359
    //   9354: iload 8
    //   9356: ifne +2332 -> 11688
    //   9359: aload_1
    //   9360: getfield 450	org/vidogram/messenger/u:f	I
    //   9363: bipush 8
    //   9365: if_icmpne +2323 -> 11688
    //   9368: iconst_0
    //   9369: istore 11
    //   9371: iload 11
    //   9373: aload_1
    //   9374: getfield 453	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   9377: getfield 458	org/vidogram/tgnet/g$ar:j	Lorg/vidogram/tgnet/g$au;
    //   9380: getfield 471	org/vidogram/tgnet/g$au:k	Lorg/vidogram/tgnet/g$q;
    //   9383: getfield 480	org/vidogram/tgnet/g$q:o	Ljava/util/ArrayList;
    //   9386: invokevirtual 483	java/util/ArrayList:size	()I
    //   9389: if_icmpge +2299 -> 11688
    //   9392: aload_1
    //   9393: getfield 453	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   9396: getfield 458	org/vidogram/tgnet/g$ar:j	Lorg/vidogram/tgnet/g$au;
    //   9399: getfield 471	org/vidogram/tgnet/g$au:k	Lorg/vidogram/tgnet/g$q;
    //   9402: getfield 480	org/vidogram/tgnet/g$q:o	Ljava/util/ArrayList;
    //   9405: iload 11
    //   9407: invokevirtual 487	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   9410: checkcast 489	org/vidogram/tgnet/g$r
    //   9413: astore 29
    //   9415: aload 29
    //   9417: instanceof 2179
    //   9420: ifne +11 -> 9431
    //   9423: aload 29
    //   9425: instanceof 605
    //   9428: ifeq +1066 -> 10494
    //   9431: aload 29
    //   9433: getfield 2180	org/vidogram/tgnet/g$r:h	I
    //   9436: i2f
    //   9437: iload 14
    //   9439: i2f
    //   9440: fdiv
    //   9441: fstore 6
    //   9443: aload 29
    //   9445: getfield 2180	org/vidogram/tgnet/g$r:h	I
    //   9448: i2f
    //   9449: fload 6
    //   9451: fdiv
    //   9452: f2i
    //   9453: istore 9
    //   9455: aload 29
    //   9457: getfield 2182	org/vidogram/tgnet/g$r:i	I
    //   9460: i2f
    //   9461: fload 6
    //   9463: fdiv
    //   9464: f2i
    //   9465: istore 8
    //   9467: iload 8
    //   9469: iload 10
    //   9471: if_icmple +953 -> 10424
    //   9474: iload 8
    //   9476: i2f
    //   9477: iload 10
    //   9479: i2f
    //   9480: fdiv
    //   9481: fstore 6
    //   9483: iload 9
    //   9485: i2f
    //   9486: fload 6
    //   9488: fdiv
    //   9489: f2i
    //   9490: istore 9
    //   9492: iload 10
    //   9494: istore 8
    //   9496: iload 9
    //   9498: ifeq +12 -> 9510
    //   9501: iload 8
    //   9503: istore 10
    //   9505: iload 8
    //   9507: ifne +15 -> 9522
    //   9510: ldc_w 2183
    //   9513: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   9516: istore 10
    //   9518: iload 10
    //   9520: istore 9
    //   9522: iload 9
    //   9524: istore 8
    //   9526: aload_1
    //   9527: getfield 450	org/vidogram/messenger/u:f	I
    //   9530: iconst_3
    //   9531: if_icmpne +36 -> 9567
    //   9534: iload 9
    //   9536: istore 8
    //   9538: iload 9
    //   9540: aload_0
    //   9541: getfield 614	org/vidogram/ui/c/j:R	I
    //   9544: ldc_w 1137
    //   9547: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   9550: iadd
    //   9551: if_icmpge +16 -> 9567
    //   9554: aload_0
    //   9555: getfield 614	org/vidogram/ui/c/j:R	I
    //   9558: ldc_w 1137
    //   9561: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   9564: iadd
    //   9565: istore 8
    //   9567: aload_0
    //   9568: iload 13
    //   9570: ldc_w 387
    //   9573: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   9576: isub
    //   9577: putfield 508	org/vidogram/ui/c/j:bq	I
    //   9580: aload_0
    //   9581: aload_1
    //   9582: invokespecial 511	org/vidogram/ui/c/j:c	(Lorg/vidogram/messenger/u;)V
    //   9585: aload_0
    //   9586: getfield 514	org/vidogram/ui/c/j:cj	I
    //   9589: istore 11
    //   9591: aload_1
    //   9592: invokevirtual 524	org/vidogram/messenger/u:k	()Z
    //   9595: ifeq +908 -> 10503
    //   9598: bipush 20
    //   9600: istore 9
    //   9602: iload 11
    //   9604: iload 9
    //   9606: bipush 14
    //   9608: iadd
    //   9609: i2f
    //   9610: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   9613: iadd
    //   9614: istore 12
    //   9616: iload 8
    //   9618: istore 9
    //   9620: iload 8
    //   9622: iload 12
    //   9624: if_icmpge +7 -> 9631
    //   9627: iload 12
    //   9629: istore 9
    //   9631: aload_1
    //   9632: invokevirtual 942	org/vidogram/messenger/u:r	()Z
    //   9635: ifeq +2036 -> 11671
    //   9638: invokestatic 1632	org/vidogram/messenger/a:c	()Z
    //   9641: ifeq +868 -> 10509
    //   9644: invokestatic 1634	org/vidogram/messenger/a:e	()I
    //   9647: i2f
    //   9648: ldc_w 2190
    //   9651: fmul
    //   9652: f2i
    //   9653: istore 9
    //   9655: iload 9
    //   9657: istore 8
    //   9659: aload_0
    //   9660: ldc_w 380
    //   9663: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   9666: iload 9
    //   9668: iadd
    //   9669: putfield 267	org/vidogram/ui/c/j:bx	I
    //   9672: aload_0
    //   9673: getfield 1141	org/vidogram/ui/c/j:be	Z
    //   9676: ifne +18 -> 9694
    //   9679: aload_0
    //   9680: aload_0
    //   9681: getfield 267	org/vidogram/ui/c/j:bx	I
    //   9684: ldc_w 1075
    //   9687: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   9690: iadd
    //   9691: putfield 267	org/vidogram/ui/c/j:bx	I
    //   9694: iload 15
    //   9696: istore 10
    //   9698: aload_1
    //   9699: getfield 1275	org/vidogram/messenger/u:d	Ljava/lang/CharSequence;
    //   9702: ifnull +158 -> 9860
    //   9705: aload_0
    //   9706: new 269	android/text/StaticLayout
    //   9709: dup
    //   9710: aload_1
    //   9711: getfield 1275	org/vidogram/messenger/u:d	Ljava/lang/CharSequence;
    //   9714: invokestatic 2206	org/vidogram/messenger/u:b	()Landroid/text/TextPaint;
    //   9717: iload 9
    //   9719: ldc_w 517
    //   9722: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   9725: isub
    //   9726: getstatic 567	android/text/Layout$Alignment:ALIGN_NORMAL	Landroid/text/Layout$Alignment;
    //   9729: fconst_1
    //   9730: fconst_0
    //   9731: iconst_0
    //   9732: invokespecial 570	android/text/StaticLayout:<init>	(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;FFZ)V
    //   9735: putfield 1017	org/vidogram/ui/c/j:M	Landroid/text/StaticLayout;
    //   9738: aload_0
    //   9739: getfield 1017	org/vidogram/ui/c/j:M	Landroid/text/StaticLayout;
    //   9742: invokevirtual 575	android/text/StaticLayout:getLineCount	()I
    //   9745: ifle +1920 -> 11665
    //   9748: aload_0
    //   9749: aload_0
    //   9750: getfield 1017	org/vidogram/ui/c/j:M	Landroid/text/StaticLayout;
    //   9753: invokevirtual 1978	android/text/StaticLayout:getHeight	()I
    //   9756: putfield 1080	org/vidogram/ui/c/j:P	I
    //   9759: aload_0
    //   9760: getfield 1080	org/vidogram/ui/c/j:P	I
    //   9763: istore 10
    //   9765: ldc_w 1075
    //   9768: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   9771: istore 11
    //   9773: iload 10
    //   9775: iload 11
    //   9777: iadd
    //   9778: iconst_0
    //   9779: iadd
    //   9780: istore 11
    //   9782: aload_0
    //   9783: getfield 1017	org/vidogram/ui/c/j:M	Landroid/text/StaticLayout;
    //   9786: aload_0
    //   9787: getfield 1017	org/vidogram/ui/c/j:M	Landroid/text/StaticLayout;
    //   9790: invokevirtual 575	android/text/StaticLayout:getLineCount	()I
    //   9793: iconst_1
    //   9794: isub
    //   9795: invokevirtual 672	android/text/StaticLayout:getLineWidth	(I)F
    //   9798: fstore 6
    //   9800: aload_0
    //   9801: getfield 1017	org/vidogram/ui/c/j:M	Landroid/text/StaticLayout;
    //   9804: aload_0
    //   9805: getfield 1017	org/vidogram/ui/c/j:M	Landroid/text/StaticLayout;
    //   9808: invokevirtual 575	android/text/StaticLayout:getLineCount	()I
    //   9811: iconst_1
    //   9812: isub
    //   9813: invokevirtual 579	android/text/StaticLayout:getLineLeft	(I)F
    //   9816: fstore 7
    //   9818: iload 11
    //   9820: istore 10
    //   9822: iload 9
    //   9824: ldc_w 903
    //   9827: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   9830: isub
    //   9831: i2f
    //   9832: fload 6
    //   9834: fload 7
    //   9836: fadd
    //   9837: fsub
    //   9838: iload 12
    //   9840: i2f
    //   9841: fcmpg
    //   9842: ifge +18 -> 9860
    //   9845: ldc_w 387
    //   9848: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   9851: istore 10
    //   9853: iload 11
    //   9855: iload 10
    //   9857: iadd
    //   9858: istore 10
    //   9860: aload_0
    //   9861: getstatic 1294	java/util/Locale:US	Ljava/util/Locale;
    //   9864: ldc_w 2192
    //   9867: iconst_2
    //   9868: anewarray 591	java/lang/Object
    //   9871: dup
    //   9872: iconst_0
    //   9873: iload 9
    //   9875: i2f
    //   9876: getstatic 1302	org/vidogram/messenger/a:b	F
    //   9879: fdiv
    //   9880: f2i
    //   9881: invokestatic 597	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   9884: aastore
    //   9885: dup
    //   9886: iconst_1
    //   9887: iload 8
    //   9889: i2f
    //   9890: getstatic 1302	org/vidogram/messenger/a:b	F
    //   9893: fdiv
    //   9894: f2i
    //   9895: invokestatic 597	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   9898: aastore
    //   9899: invokestatic 1305	java/lang/String:format	(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   9902: putfield 708	org/vidogram/ui/c/j:aj	Ljava/lang/String;
    //   9905: aload_1
    //   9906: getfield 691	org/vidogram/messenger/u:m	Ljava/util/ArrayList;
    //   9909: ifnull +14 -> 9923
    //   9912: aload_1
    //   9913: getfield 691	org/vidogram/messenger/u:m	Ljava/util/ArrayList;
    //   9916: invokevirtual 483	java/util/ArrayList:size	()I
    //   9919: iconst_1
    //   9920: if_icmpgt +20 -> 9940
    //   9923: aload_1
    //   9924: getfield 450	org/vidogram/messenger/u:f	I
    //   9927: iconst_3
    //   9928: if_icmpeq +12 -> 9940
    //   9931: aload_1
    //   9932: getfield 450	org/vidogram/messenger/u:f	I
    //   9935: bipush 8
    //   9937: if_icmpne +37 -> 9974
    //   9940: aload_1
    //   9941: invokevirtual 942	org/vidogram/messenger/u:r	()Z
    //   9944: ifeq +611 -> 10555
    //   9947: aload_0
    //   9948: new 677	java/lang/StringBuilder
    //   9951: dup
    //   9952: invokespecial 678	java/lang/StringBuilder:<init>	()V
    //   9955: aload_0
    //   9956: getfield 708	org/vidogram/ui/c/j:aj	Ljava/lang/String;
    //   9959: invokevirtual 682	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   9962: ldc_w 2287
    //   9965: invokevirtual 682	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   9968: invokevirtual 689	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   9971: putfield 708	org/vidogram/ui/c/j:aj	Ljava/lang/String;
    //   9974: aload_1
    //   9975: getfield 450	org/vidogram/messenger/u:f	I
    //   9978: iconst_3
    //   9979: if_icmpeq +12 -> 9991
    //   9982: aload_1
    //   9983: getfield 450	org/vidogram/messenger/u:f	I
    //   9986: bipush 8
    //   9988: if_icmpne +1671 -> 11659
    //   9991: iconst_1
    //   9992: istore 11
    //   9994: aload_0
    //   9995: getfield 698	org/vidogram/ui/c/j:ah	Lorg/vidogram/tgnet/g$az;
    //   9998: ifnull +26 -> 10024
    //   10001: iload 11
    //   10003: ifne +21 -> 10024
    //   10006: aload_0
    //   10007: getfield 698	org/vidogram/ui/c/j:ah	Lorg/vidogram/tgnet/g$az;
    //   10010: getfield 1440	org/vidogram/tgnet/g$az:f	I
    //   10013: ifne +11 -> 10024
    //   10016: aload_0
    //   10017: getfield 698	org/vidogram/ui/c/j:ah	Lorg/vidogram/tgnet/g$az;
    //   10020: iconst_m1
    //   10021: putfield 1440	org/vidogram/tgnet/g$az:f	I
    //   10024: aload_1
    //   10025: getfield 450	org/vidogram/messenger/u:f	I
    //   10028: iconst_1
    //   10029: if_icmpne +658 -> 10687
    //   10032: aload_0
    //   10033: getfield 698	org/vidogram/ui/c/j:ah	Lorg/vidogram/tgnet/g$az;
    //   10036: ifnull +633 -> 10669
    //   10039: iconst_1
    //   10040: istore 12
    //   10042: aload_0
    //   10043: getfield 698	org/vidogram/ui/c/j:ah	Lorg/vidogram/tgnet/g$az;
    //   10046: invokestatic 1811	org/vidogram/messenger/m:b	(Lorg/vidogram/tgnet/f;)Ljava/lang/String;
    //   10049: astore 29
    //   10051: aload_1
    //   10052: getfield 1807	org/vidogram/messenger/u:s	Z
    //   10055: ifeq +530 -> 10585
    //   10058: invokestatic 409	org/vidogram/messenger/MediaController:a	()Lorg/vidogram/messenger/MediaController;
    //   10061: aload_0
    //   10062: invokevirtual 1849	org/vidogram/messenger/MediaController:a	(Lorg/vidogram/messenger/MediaController$e;)V
    //   10065: iload 12
    //   10067: ifne +24 -> 10091
    //   10070: invokestatic 409	org/vidogram/messenger/MediaController:a	()Lorg/vidogram/messenger/MediaController;
    //   10073: iconst_1
    //   10074: invokevirtual 1854	org/vidogram/messenger/MediaController:a	(I)Z
    //   10077: ifne +14 -> 10091
    //   10080: invokestatic 1448	org/vidogram/messenger/m:a	()Lorg/vidogram/messenger/m;
    //   10083: aload 29
    //   10085: invokevirtual 1852	org/vidogram/messenger/m:a	(Ljava/lang/String;)Z
    //   10088: ifeq +521 -> 10609
    //   10091: aload_0
    //   10092: getfield 418	org/vidogram/ui/c/j:o	Lorg/vidogram/messenger/q;
    //   10095: astore 30
    //   10097: aload_0
    //   10098: getfield 698	org/vidogram/ui/c/j:ah	Lorg/vidogram/tgnet/g$az;
    //   10101: getfield 635	org/vidogram/tgnet/g$az:c	Lorg/vidogram/tgnet/g$x;
    //   10104: astore 31
    //   10106: aload_0
    //   10107: getfield 708	org/vidogram/ui/c/j:aj	Ljava/lang/String;
    //   10110: astore 32
    //   10112: aload_0
    //   10113: getfield 1439	org/vidogram/ui/c/j:ai	Lorg/vidogram/tgnet/g$az;
    //   10116: ifnull +475 -> 10591
    //   10119: aload_0
    //   10120: getfield 1439	org/vidogram/ui/c/j:ai	Lorg/vidogram/tgnet/g$az;
    //   10123: getfield 635	org/vidogram/tgnet/g$az:c	Lorg/vidogram/tgnet/g$x;
    //   10126: astore 29
    //   10128: aload_0
    //   10129: getfield 708	org/vidogram/ui/c/j:aj	Ljava/lang/String;
    //   10132: astore 33
    //   10134: iload 11
    //   10136: ifeq +461 -> 10597
    //   10139: iconst_0
    //   10140: istore 11
    //   10142: aload 30
    //   10144: aload 31
    //   10146: aload 32
    //   10148: aload 29
    //   10150: aload 33
    //   10152: iload 11
    //   10154: aconst_null
    //   10155: iconst_0
    //   10156: invokevirtual 1443	org/vidogram/messenger/q:a	(Lorg/vidogram/tgnet/f;Ljava/lang/String;Lorg/vidogram/tgnet/g$x;Ljava/lang/String;ILjava/lang/String;Z)V
    //   10159: iload 10
    //   10161: istore 12
    //   10163: goto -2474 -> 7689
    //   10166: getstatic 1638	org/vidogram/messenger/a:c	Landroid/graphics/Point;
    //   10169: getfield 1641	android/graphics/Point:x	I
    //   10172: getstatic 1638	org/vidogram/messenger/a:c	Landroid/graphics/Point;
    //   10175: getfield 1642	android/graphics/Point:y	I
    //   10178: invokestatic 521	java/lang/Math:min	(II)I
    //   10181: i2f
    //   10182: ldc_w 2285
    //   10185: fmul
    //   10186: f2i
    //   10187: istore 8
    //   10189: iload 8
    //   10191: istore 9
    //   10193: goto -1108 -> 9085
    //   10196: aload_1
    //   10197: getfield 450	org/vidogram/messenger/u:f	I
    //   10200: iconst_3
    //   10201: if_icmpne +37 -> 10238
    //   10204: aload_0
    //   10205: iconst_0
    //   10206: aload_1
    //   10207: invokespecial 2224	org/vidogram/ui/c/j:a	(ILorg/vidogram/messenger/u;)I
    //   10210: pop
    //   10211: aload_0
    //   10212: getfield 418	org/vidogram/ui/c/j:o	Lorg/vidogram/messenger/q;
    //   10215: iconst_1
    //   10216: invokevirtual 701	org/vidogram/messenger/q:e	(Z)V
    //   10219: aload_0
    //   10220: getfield 418	org/vidogram/ui/c/j:o	Lorg/vidogram/messenger/q;
    //   10223: iconst_1
    //   10224: invokevirtual 703	org/vidogram/messenger/q:f	(Z)V
    //   10227: aload_0
    //   10228: getfield 418	org/vidogram/ui/c/j:o	Lorg/vidogram/messenger/q;
    //   10231: aload_1
    //   10232: invokevirtual 704	org/vidogram/messenger/q:a	(Lorg/vidogram/messenger/u;)V
    //   10235: goto -1053 -> 9182
    //   10238: aload_1
    //   10239: getfield 450	org/vidogram/messenger/u:f	I
    //   10242: bipush 8
    //   10244: if_icmpne -1062 -> 9182
    //   10247: aload_1
    //   10248: getfield 453	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   10251: getfield 458	org/vidogram/tgnet/g$ar:j	Lorg/vidogram/tgnet/g$au;
    //   10254: getfield 471	org/vidogram/tgnet/g$au:k	Lorg/vidogram/tgnet/g$q;
    //   10257: getfield 609	org/vidogram/tgnet/g$q:h	I
    //   10260: i2l
    //   10261: invokestatic 612	org/vidogram/messenger/a:c	(J)Ljava/lang/String;
    //   10264: astore 29
    //   10266: aload_0
    //   10267: getstatic 277	org/vidogram/ui/c/j:am	Landroid/text/TextPaint;
    //   10270: aload 29
    //   10272: invokevirtual 500	android/text/TextPaint:measureText	(Ljava/lang/String;)F
    //   10275: f2d
    //   10276: invokestatic 506	java/lang/Math:ceil	(D)D
    //   10279: d2i
    //   10280: putfield 614	org/vidogram/ui/c/j:R	I
    //   10283: aload_0
    //   10284: new 269	android/text/StaticLayout
    //   10287: dup
    //   10288: aload 29
    //   10290: getstatic 277	org/vidogram/ui/c/j:am	Landroid/text/TextPaint;
    //   10293: aload_0
    //   10294: getfield 614	org/vidogram/ui/c/j:R	I
    //   10297: getstatic 567	android/text/Layout$Alignment:ALIGN_NORMAL	Landroid/text/Layout$Alignment;
    //   10300: fconst_1
    //   10301: fconst_0
    //   10302: iconst_0
    //   10303: invokespecial 570	android/text/StaticLayout:<init>	(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;FFZ)V
    //   10306: putfield 616	org/vidogram/ui/c/j:Q	Landroid/text/StaticLayout;
    //   10309: aload_0
    //   10310: getfield 418	org/vidogram/ui/c/j:o	Lorg/vidogram/messenger/q;
    //   10313: iconst_1
    //   10314: invokevirtual 701	org/vidogram/messenger/q:e	(Z)V
    //   10317: aload_0
    //   10318: getfield 418	org/vidogram/ui/c/j:o	Lorg/vidogram/messenger/q;
    //   10321: iconst_1
    //   10322: invokevirtual 703	org/vidogram/messenger/q:f	(Z)V
    //   10325: aload_0
    //   10326: getfield 418	org/vidogram/ui/c/j:o	Lorg/vidogram/messenger/q;
    //   10329: aload_1
    //   10330: invokevirtual 704	org/vidogram/messenger/q:a	(Lorg/vidogram/messenger/u;)V
    //   10333: goto -1151 -> 9182
    //   10336: iload 12
    //   10338: istore 8
    //   10340: iload 11
    //   10342: istore 9
    //   10344: iload 12
    //   10346: ldc_w 2288
    //   10349: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   10352: if_icmpge -1003 -> 9349
    //   10355: ldc_w 2288
    //   10358: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   10361: istore 12
    //   10363: aload_0
    //   10364: getfield 698	org/vidogram/ui/c/j:ah	Lorg/vidogram/tgnet/g$az;
    //   10367: getfield 2177	org/vidogram/tgnet/g$az:e	I
    //   10370: i2f
    //   10371: iload 12
    //   10373: i2f
    //   10374: fdiv
    //   10375: fstore 6
    //   10377: iload 12
    //   10379: istore 8
    //   10381: iload 11
    //   10383: istore 9
    //   10385: aload_0
    //   10386: getfield 698	org/vidogram/ui/c/j:ah	Lorg/vidogram/tgnet/g$az;
    //   10389: getfield 2176	org/vidogram/tgnet/g$az:d	I
    //   10392: i2f
    //   10393: fload 6
    //   10395: fdiv
    //   10396: iload 14
    //   10398: i2f
    //   10399: fcmpg
    //   10400: ifge -1051 -> 9349
    //   10403: aload_0
    //   10404: getfield 698	org/vidogram/ui/c/j:ah	Lorg/vidogram/tgnet/g$az;
    //   10407: getfield 2176	org/vidogram/tgnet/g$az:d	I
    //   10410: i2f
    //   10411: fload 6
    //   10413: fdiv
    //   10414: f2i
    //   10415: istore 9
    //   10417: iload 12
    //   10419: istore 8
    //   10421: goto -1072 -> 9349
    //   10424: iload 8
    //   10426: ldc_w 2288
    //   10429: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   10432: if_icmpge +1253 -> 11685
    //   10435: ldc_w 2288
    //   10438: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   10441: istore 10
    //   10443: aload 29
    //   10445: getfield 2182	org/vidogram/tgnet/g$r:i	I
    //   10448: i2f
    //   10449: iload 10
    //   10451: i2f
    //   10452: fdiv
    //   10453: fstore 6
    //   10455: aload 29
    //   10457: getfield 2180	org/vidogram/tgnet/g$r:h	I
    //   10460: i2f
    //   10461: fload 6
    //   10463: fdiv
    //   10464: iload 14
    //   10466: i2f
    //   10467: fcmpg
    //   10468: ifge +1210 -> 11678
    //   10471: aload 29
    //   10473: getfield 2180	org/vidogram/tgnet/g$r:h	I
    //   10476: i2f
    //   10477: fload 6
    //   10479: fdiv
    //   10480: f2i
    //   10481: istore 8
    //   10483: iload 8
    //   10485: istore 9
    //   10487: iload 10
    //   10489: istore 8
    //   10491: goto -995 -> 9496
    //   10494: iload 11
    //   10496: iconst_1
    //   10497: iadd
    //   10498: istore 11
    //   10500: goto -1129 -> 9371
    //   10503: iconst_0
    //   10504: istore 9
    //   10506: goto -904 -> 9602
    //   10509: getstatic 1638	org/vidogram/messenger/a:c	Landroid/graphics/Point;
    //   10512: getfield 1641	android/graphics/Point:x	I
    //   10515: getstatic 1638	org/vidogram/messenger/a:c	Landroid/graphics/Point;
    //   10518: getfield 1642	android/graphics/Point:y	I
    //   10521: invokestatic 521	java/lang/Math:min	(II)I
    //   10524: i2f
    //   10525: ldc_w 2190
    //   10528: fmul
    //   10529: f2i
    //   10530: istore 9
    //   10532: iload 9
    //   10534: istore 8
    //   10536: goto -877 -> 9659
    //   10539: astore 29
    //   10541: iconst_0
    //   10542: istore 10
    //   10544: ldc_w 713
    //   10547: aload 29
    //   10549: invokestatic 718	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   10552: goto -692 -> 9860
    //   10555: aload_0
    //   10556: new 677	java/lang/StringBuilder
    //   10559: dup
    //   10560: invokespecial 678	java/lang/StringBuilder:<init>	()V
    //   10563: aload_0
    //   10564: getfield 708	org/vidogram/ui/c/j:aj	Ljava/lang/String;
    //   10567: invokevirtual 682	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   10570: ldc_w 2290
    //   10573: invokevirtual 682	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   10576: invokevirtual 689	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   10579: putfield 708	org/vidogram/ui/c/j:aj	Ljava/lang/String;
    //   10582: goto -608 -> 9974
    //   10585: iconst_0
    //   10586: istore 12
    //   10588: goto -523 -> 10065
    //   10591: aconst_null
    //   10592: astore 29
    //   10594: goto -466 -> 10128
    //   10597: aload_0
    //   10598: getfield 698	org/vidogram/ui/c/j:ah	Lorg/vidogram/tgnet/g$az;
    //   10601: getfield 1440	org/vidogram/tgnet/g$az:f	I
    //   10604: istore 11
    //   10606: goto -464 -> 10142
    //   10609: aload_0
    //   10610: iconst_1
    //   10611: putfield 1311	org/vidogram/ui/c/j:ae	Z
    //   10614: aload_0
    //   10615: getfield 1439	org/vidogram/ui/c/j:ai	Lorg/vidogram/tgnet/g$az;
    //   10618: ifnull +33 -> 10651
    //   10621: aload_0
    //   10622: getfield 418	org/vidogram/ui/c/j:o	Lorg/vidogram/messenger/q;
    //   10625: aconst_null
    //   10626: aconst_null
    //   10627: aload_0
    //   10628: getfield 1439	org/vidogram/ui/c/j:ai	Lorg/vidogram/tgnet/g$az;
    //   10631: getfield 635	org/vidogram/tgnet/g$az:c	Lorg/vidogram/tgnet/g$x;
    //   10634: aload_0
    //   10635: getfield 708	org/vidogram/ui/c/j:aj	Ljava/lang/String;
    //   10638: iconst_0
    //   10639: aconst_null
    //   10640: iconst_0
    //   10641: invokevirtual 1443	org/vidogram/messenger/q:a	(Lorg/vidogram/tgnet/f;Ljava/lang/String;Lorg/vidogram/tgnet/g$x;Ljava/lang/String;ILjava/lang/String;Z)V
    //   10644: iload 10
    //   10646: istore 12
    //   10648: goto -2959 -> 7689
    //   10651: aload_0
    //   10652: getfield 418	org/vidogram/ui/c/j:o	Lorg/vidogram/messenger/q;
    //   10655: aconst_null
    //   10656: checkcast 814	android/graphics/drawable/Drawable
    //   10659: invokevirtual 723	org/vidogram/messenger/q:a	(Landroid/graphics/drawable/Drawable;)V
    //   10662: iload 10
    //   10664: istore 12
    //   10666: goto -2977 -> 7689
    //   10669: aload_0
    //   10670: getfield 418	org/vidogram/ui/c/j:o	Lorg/vidogram/messenger/q;
    //   10673: aconst_null
    //   10674: checkcast 720	android/graphics/drawable/BitmapDrawable
    //   10677: invokevirtual 723	org/vidogram/messenger/q:a	(Landroid/graphics/drawable/Drawable;)V
    //   10680: iload 10
    //   10682: istore 12
    //   10684: goto -2995 -> 7689
    //   10687: aload_1
    //   10688: getfield 450	org/vidogram/messenger/u:f	I
    //   10691: bipush 8
    //   10693: if_icmpne +315 -> 11008
    //   10696: aload_1
    //   10697: getfield 453	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   10700: getfield 458	org/vidogram/tgnet/g$ar:j	Lorg/vidogram/tgnet/g$au;
    //   10703: getfield 471	org/vidogram/tgnet/g$au:k	Lorg/vidogram/tgnet/g$q;
    //   10706: invokestatic 1811	org/vidogram/messenger/m:b	(Lorg/vidogram/tgnet/f;)Ljava/lang/String;
    //   10709: astore 29
    //   10711: iconst_0
    //   10712: istore 11
    //   10714: aload_1
    //   10715: getfield 1808	org/vidogram/messenger/u:r	Z
    //   10718: ifeq +127 -> 10845
    //   10721: invokestatic 409	org/vidogram/messenger/MediaController:a	()Lorg/vidogram/messenger/MediaController;
    //   10724: aload_0
    //   10725: invokevirtual 1849	org/vidogram/messenger/MediaController:a	(Lorg/vidogram/messenger/MediaController$e;)V
    //   10728: iconst_1
    //   10729: istore 11
    //   10731: aload_1
    //   10732: invokevirtual 1457	org/vidogram/messenger/u:v	()Z
    //   10735: ifne +217 -> 10952
    //   10738: iload 11
    //   10740: ifne +41 -> 10781
    //   10743: invokestatic 409	org/vidogram/messenger/MediaController:a	()Lorg/vidogram/messenger/MediaController;
    //   10746: bipush 32
    //   10748: invokevirtual 1854	org/vidogram/messenger/MediaController:a	(I)Z
    //   10751: ifeq +19 -> 10770
    //   10754: aload_1
    //   10755: getfield 453	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   10758: getfield 458	org/vidogram/tgnet/g$ar:j	Lorg/vidogram/tgnet/g$au;
    //   10761: getfield 471	org/vidogram/tgnet/g$au:k	Lorg/vidogram/tgnet/g$q;
    //   10764: invokestatic 1865	org/vidogram/messenger/u:b	(Lorg/vidogram/tgnet/g$q;)Z
    //   10767: ifne +14 -> 10781
    //   10770: invokestatic 1448	org/vidogram/messenger/m:a	()Lorg/vidogram/messenger/m;
    //   10773: aload 29
    //   10775: invokevirtual 1852	org/vidogram/messenger/m:a	(Ljava/lang/String;)Z
    //   10778: ifeq +174 -> 10952
    //   10781: iload 11
    //   10783: iconst_1
    //   10784: if_icmpne +92 -> 10876
    //   10787: aload_0
    //   10788: getfield 418	org/vidogram/ui/c/j:o	Lorg/vidogram/messenger/q;
    //   10791: astore 31
    //   10793: aload_1
    //   10794: invokevirtual 1473	org/vidogram/messenger/u:w	()Z
    //   10797: ifeq +61 -> 10858
    //   10800: aconst_null
    //   10801: astore 29
    //   10803: aload_0
    //   10804: getfield 698	org/vidogram/ui/c/j:ah	Lorg/vidogram/tgnet/g$az;
    //   10807: ifnull +63 -> 10870
    //   10810: aload_0
    //   10811: getfield 698	org/vidogram/ui/c/j:ah	Lorg/vidogram/tgnet/g$az;
    //   10814: getfield 635	org/vidogram/tgnet/g$az:c	Lorg/vidogram/tgnet/g$x;
    //   10817: astore 30
    //   10819: aload 31
    //   10821: aconst_null
    //   10822: aload 29
    //   10824: aconst_null
    //   10825: aconst_null
    //   10826: aload 30
    //   10828: aload_0
    //   10829: getfield 708	org/vidogram/ui/c/j:aj	Ljava/lang/String;
    //   10832: iconst_0
    //   10833: aconst_null
    //   10834: iconst_0
    //   10835: invokevirtual 711	org/vidogram/messenger/q:a	(Lorg/vidogram/tgnet/f;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/drawable/Drawable;Lorg/vidogram/tgnet/g$x;Ljava/lang/String;ILjava/lang/String;Z)V
    //   10838: iload 10
    //   10840: istore 12
    //   10842: goto -3153 -> 7689
    //   10845: aload_1
    //   10846: getfield 1807	org/vidogram/messenger/u:s	Z
    //   10849: ifeq -118 -> 10731
    //   10852: iconst_2
    //   10853: istore 11
    //   10855: goto -124 -> 10731
    //   10858: aload_1
    //   10859: getfield 453	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   10862: getfield 1813	org/vidogram/tgnet/g$ar:A	Ljava/lang/String;
    //   10865: astore 29
    //   10867: goto -64 -> 10803
    //   10870: aconst_null
    //   10871: astore 30
    //   10873: goto -54 -> 10819
    //   10876: aload_0
    //   10877: getfield 418	org/vidogram/ui/c/j:o	Lorg/vidogram/messenger/q;
    //   10880: astore 30
    //   10882: aload_1
    //   10883: getfield 453	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   10886: getfield 458	org/vidogram/tgnet/g$ar:j	Lorg/vidogram/tgnet/g$au;
    //   10889: getfield 471	org/vidogram/tgnet/g$au:k	Lorg/vidogram/tgnet/g$q;
    //   10892: astore 31
    //   10894: aload_0
    //   10895: getfield 698	org/vidogram/ui/c/j:ah	Lorg/vidogram/tgnet/g$az;
    //   10898: ifnull +48 -> 10946
    //   10901: aload_0
    //   10902: getfield 698	org/vidogram/ui/c/j:ah	Lorg/vidogram/tgnet/g$az;
    //   10905: getfield 635	org/vidogram/tgnet/g$az:c	Lorg/vidogram/tgnet/g$x;
    //   10908: astore 29
    //   10910: aload 30
    //   10912: aload 31
    //   10914: aconst_null
    //   10915: aload 29
    //   10917: aload_0
    //   10918: getfield 708	org/vidogram/ui/c/j:aj	Ljava/lang/String;
    //   10921: aload_1
    //   10922: getfield 453	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   10925: getfield 458	org/vidogram/tgnet/g$ar:j	Lorg/vidogram/tgnet/g$au;
    //   10928: getfield 471	org/vidogram/tgnet/g$au:k	Lorg/vidogram/tgnet/g$q;
    //   10931: getfield 609	org/vidogram/tgnet/g$q:h	I
    //   10934: aconst_null
    //   10935: iconst_0
    //   10936: invokevirtual 1443	org/vidogram/messenger/q:a	(Lorg/vidogram/tgnet/f;Ljava/lang/String;Lorg/vidogram/tgnet/g$x;Ljava/lang/String;ILjava/lang/String;Z)V
    //   10939: iload 10
    //   10941: istore 12
    //   10943: goto -3254 -> 7689
    //   10946: aconst_null
    //   10947: astore 29
    //   10949: goto -39 -> 10910
    //   10952: aload_0
    //   10953: iconst_1
    //   10954: putfield 1311	org/vidogram/ui/c/j:ae	Z
    //   10957: aload_0
    //   10958: getfield 418	org/vidogram/ui/c/j:o	Lorg/vidogram/messenger/q;
    //   10961: astore 30
    //   10963: aload_0
    //   10964: getfield 698	org/vidogram/ui/c/j:ah	Lorg/vidogram/tgnet/g$az;
    //   10967: ifnull +35 -> 11002
    //   10970: aload_0
    //   10971: getfield 698	org/vidogram/ui/c/j:ah	Lorg/vidogram/tgnet/g$az;
    //   10974: getfield 635	org/vidogram/tgnet/g$az:c	Lorg/vidogram/tgnet/g$x;
    //   10977: astore 29
    //   10979: aload 30
    //   10981: aconst_null
    //   10982: aconst_null
    //   10983: aload 29
    //   10985: aload_0
    //   10986: getfield 708	org/vidogram/ui/c/j:aj	Ljava/lang/String;
    //   10989: iconst_0
    //   10990: aconst_null
    //   10991: iconst_0
    //   10992: invokevirtual 1443	org/vidogram/messenger/q:a	(Lorg/vidogram/tgnet/f;Ljava/lang/String;Lorg/vidogram/tgnet/g$x;Ljava/lang/String;ILjava/lang/String;Z)V
    //   10995: iload 10
    //   10997: istore 12
    //   10999: goto -3310 -> 7689
    //   11002: aconst_null
    //   11003: astore 29
    //   11005: goto -26 -> 10979
    //   11008: aload_0
    //   11009: getfield 418	org/vidogram/ui/c/j:o	Lorg/vidogram/messenger/q;
    //   11012: astore 30
    //   11014: aload_0
    //   11015: getfield 698	org/vidogram/ui/c/j:ah	Lorg/vidogram/tgnet/g$az;
    //   11018: ifnull +35 -> 11053
    //   11021: aload_0
    //   11022: getfield 698	org/vidogram/ui/c/j:ah	Lorg/vidogram/tgnet/g$az;
    //   11025: getfield 635	org/vidogram/tgnet/g$az:c	Lorg/vidogram/tgnet/g$x;
    //   11028: astore 29
    //   11030: aload 30
    //   11032: aconst_null
    //   11033: aconst_null
    //   11034: aload 29
    //   11036: aload_0
    //   11037: getfield 708	org/vidogram/ui/c/j:aj	Ljava/lang/String;
    //   11040: iconst_0
    //   11041: aconst_null
    //   11042: iconst_0
    //   11043: invokevirtual 1443	org/vidogram/messenger/q:a	(Lorg/vidogram/tgnet/f;Ljava/lang/String;Lorg/vidogram/tgnet/g$x;Ljava/lang/String;ILjava/lang/String;Z)V
    //   11046: iload 10
    //   11048: istore 12
    //   11050: goto -3361 -> 7689
    //   11053: aconst_null
    //   11054: astore 29
    //   11056: goto -26 -> 11030
    //   11059: aload_0
    //   11060: getfield 1686	org/vidogram/ui/c/j:cb	Z
    //   11063: ifeq -3347 -> 7716
    //   11066: aload_1
    //   11067: getfield 453	org/vidogram/messenger/u:a	Lorg/vidogram/tgnet/g$ar;
    //   11070: getfield 1532	org/vidogram/tgnet/g$ar:g	I
    //   11073: ifne -3357 -> 7716
    //   11076: aload_0
    //   11077: aload_0
    //   11078: getfield 826	org/vidogram/ui/c/j:cA	I
    //   11081: ldc_w 1142
    //   11084: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   11087: iadd
    //   11088: putfield 826	org/vidogram/ui/c/j:cA	I
    //   11091: goto -3375 -> 7716
    //   11094: iconst_0
    //   11095: istore 8
    //   11097: goto -7160 -> 3937
    //   11100: astore 29
    //   11102: ldc_w 713
    //   11105: aload 29
    //   11107: invokestatic 718	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   11110: goto -7050 -> 4060
    //   11113: ldc_w 517
    //   11116: fstore 6
    //   11118: goto -6938 -> 4180
    //   11121: iload 8
    //   11123: getstatic 1638	org/vidogram/messenger/a:c	Landroid/graphics/Point;
    //   11126: getfield 1641	android/graphics/Point:x	I
    //   11129: getstatic 1638	org/vidogram/messenger/a:c	Landroid/graphics/Point;
    //   11132: getfield 1642	android/graphics/Point:y	I
    //   11135: invokestatic 521	java/lang/Math:min	(II)I
    //   11138: iadd
    //   11139: istore 8
    //   11141: goto -6939 -> 4202
    //   11144: aload_0
    //   11145: getfield 1098	org/vidogram/ui/c/j:aZ	I
    //   11148: istore 13
    //   11150: ldc_w 1018
    //   11153: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   11156: istore 14
    //   11158: iload 9
    //   11160: ifne +348 -> 11508
    //   11163: aload_0
    //   11164: getfield 1141	org/vidogram/ui/c/j:be	Z
    //   11167: ifeq +341 -> 11508
    //   11170: fconst_0
    //   11171: fstore 6
    //   11173: iload 13
    //   11175: iload 14
    //   11177: iload 11
    //   11179: iconst_1
    //   11180: isub
    //   11181: imul
    //   11182: isub
    //   11183: fload 6
    //   11185: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   11188: isub
    //   11189: fconst_2
    //   11190: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   11193: isub
    //   11194: iload 11
    //   11196: idiv
    //   11197: istore 13
    //   11199: iconst_0
    //   11200: istore 11
    //   11202: iload 11
    //   11204: aload 29
    //   11206: getfield 2222	org/vidogram/tgnet/g$mc:c	Ljava/util/ArrayList;
    //   11209: invokevirtual 483	java/util/ArrayList:size	()I
    //   11212: if_icmpge +438 -> 11650
    //   11215: new 14	org/vidogram/ui/c/j$a
    //   11218: dup
    //   11219: aload_0
    //   11220: aconst_null
    //   11221: invokespecial 2293	org/vidogram/ui/c/j$a:<init>	(Lorg/vidogram/ui/c/j;Lorg/vidogram/ui/c/j$1;)V
    //   11224: astore 30
    //   11226: aload 30
    //   11228: aload 29
    //   11230: getfield 2222	org/vidogram/tgnet/g$mc:c	Ljava/util/ArrayList;
    //   11233: iload 11
    //   11235: invokevirtual 487	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   11238: checkcast 2295	org/vidogram/tgnet/g$aq
    //   11241: invokestatic 2298	org/vidogram/ui/c/j$a:a	(Lorg/vidogram/ui/c/j$a;Lorg/vidogram/tgnet/g$aq;)Lorg/vidogram/tgnet/g$aq;
    //   11244: pop
    //   11245: aload 30
    //   11247: invokestatic 1126	org/vidogram/ui/c/j$a:a	(Lorg/vidogram/ui/c/j$a;)Lorg/vidogram/tgnet/g$aq;
    //   11250: getfield 2300	org/vidogram/tgnet/g$aq:f	[B
    //   11253: invokestatic 2305	org/vidogram/messenger/Utilities:a	([B)Ljava/lang/String;
    //   11256: astore 31
    //   11258: aload_0
    //   11259: getfield 261	org/vidogram/ui/c/j:aY	Ljava/util/HashMap;
    //   11262: aload 31
    //   11264: invokevirtual 2308	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   11267: checkcast 14	org/vidogram/ui/c/j$a
    //   11270: astore 32
    //   11272: aload 32
    //   11274: ifnull +242 -> 11516
    //   11277: aload 30
    //   11279: aload 32
    //   11281: invokestatic 1167	org/vidogram/ui/c/j$a:f	(Lorg/vidogram/ui/c/j$a;)F
    //   11284: invokestatic 1188	org/vidogram/ui/c/j$a:a	(Lorg/vidogram/ui/c/j$a;F)F
    //   11287: pop
    //   11288: aload 30
    //   11290: aload 32
    //   11292: invokestatic 1170	org/vidogram/ui/c/j$a:g	(Lorg/vidogram/ui/c/j$a;)I
    //   11295: invokestatic 1184	org/vidogram/ui/c/j$a:a	(Lorg/vidogram/ui/c/j$a;I)I
    //   11298: pop
    //   11299: aload 30
    //   11301: aload 32
    //   11303: invokestatic 1174	org/vidogram/ui/c/j$a:h	(Lorg/vidogram/ui/c/j$a;)J
    //   11306: invokestatic 1191	org/vidogram/ui/c/j$a:a	(Lorg/vidogram/ui/c/j$a;J)J
    //   11309: pop2
    //   11310: aload_0
    //   11311: getfield 261	org/vidogram/ui/c/j:aY	Ljava/util/HashMap;
    //   11314: aload 31
    //   11316: aload 30
    //   11318: invokevirtual 2312	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   11321: pop
    //   11322: aload 30
    //   11324: ldc_w 1018
    //   11327: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   11330: iload 13
    //   11332: iadd
    //   11333: iload 11
    //   11335: imul
    //   11336: invokestatic 2314	org/vidogram/ui/c/j$a:b	(Lorg/vidogram/ui/c/j$a;I)I
    //   11339: pop
    //   11340: aload 30
    //   11342: ldc_w 1025
    //   11345: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   11348: iload 10
    //   11350: imul
    //   11351: ldc_w 1018
    //   11354: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   11357: iadd
    //   11358: invokestatic 2316	org/vidogram/ui/c/j$a:c	(Lorg/vidogram/ui/c/j$a;I)I
    //   11361: pop
    //   11362: aload 30
    //   11364: iload 13
    //   11366: invokestatic 2318	org/vidogram/ui/c/j$a:d	(Lorg/vidogram/ui/c/j$a;I)I
    //   11369: pop
    //   11370: aload 30
    //   11372: ldc_w 1058
    //   11375: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   11378: invokestatic 2320	org/vidogram/ui/c/j$a:e	(Lorg/vidogram/ui/c/j$a;I)I
    //   11381: pop
    //   11382: aload 30
    //   11384: new 269	android/text/StaticLayout
    //   11387: dup
    //   11388: aload 30
    //   11390: invokestatic 1126	org/vidogram/ui/c/j$a:a	(Lorg/vidogram/ui/c/j$a;)Lorg/vidogram/tgnet/g$aq;
    //   11393: getfield 2322	org/vidogram/tgnet/g$aq:b	Ljava/lang/String;
    //   11396: getstatic 347	org/vidogram/ui/c/j:aQ	Landroid/text/TextPaint;
    //   11399: invokevirtual 1752	android/text/TextPaint:getFontMetricsInt	()Landroid/graphics/Paint$FontMetricsInt;
    //   11402: ldc_w 384
    //   11405: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   11408: iconst_0
    //   11409: invokestatic 1757	org/vidogram/messenger/j:a	(Ljava/lang/CharSequence;Landroid/graphics/Paint$FontMetricsInt;IZ)Ljava/lang/CharSequence;
    //   11412: getstatic 347	org/vidogram/ui/c/j:aQ	Landroid/text/TextPaint;
    //   11415: iload 13
    //   11417: ldc_w 517
    //   11420: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   11423: isub
    //   11424: i2f
    //   11425: getstatic 555	android/text/TextUtils$TruncateAt:END	Landroid/text/TextUtils$TruncateAt;
    //   11428: invokestatic 561	android/text/TextUtils:ellipsize	(Ljava/lang/CharSequence;Landroid/text/TextPaint;FLandroid/text/TextUtils$TruncateAt;)Ljava/lang/CharSequence;
    //   11431: getstatic 347	org/vidogram/ui/c/j:aQ	Landroid/text/TextPaint;
    //   11434: iload 13
    //   11436: ldc_w 517
    //   11439: invokestatic 375	org/vidogram/messenger/a:a	(F)I
    //   11442: isub
    //   11443: getstatic 2325	android/text/Layout$Alignment:ALIGN_CENTER	Landroid/text/Layout$Alignment;
    //   11446: fconst_1
    //   11447: fconst_0
    //   11448: iconst_0
    //   11449: invokespecial 570	android/text/StaticLayout:<init>	(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;FFZ)V
    //   11452: invokestatic 2328	org/vidogram/ui/c/j$a:a	(Lorg/vidogram/ui/c/j$a;Landroid/text/StaticLayout;)Landroid/text/StaticLayout;
    //   11455: pop
    //   11456: aload_0
    //   11457: getfield 256	org/vidogram/ui/c/j:aX	Ljava/util/ArrayList;
    //   11460: aload 30
    //   11462: invokevirtual 1325	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   11465: pop
    //   11466: iload 11
    //   11468: aload 29
    //   11470: getfield 2222	org/vidogram/tgnet/g$mc:c	Ljava/util/ArrayList;
    //   11473: invokevirtual 483	java/util/ArrayList:size	()I
    //   11476: iconst_1
    //   11477: isub
    //   11478: if_icmpne +169 -> 11647
    //   11481: iload 8
    //   11483: aload 30
    //   11485: invokestatic 1116	org/vidogram/ui/c/j$a:c	(Lorg/vidogram/ui/c/j$a;)I
    //   11488: aload 30
    //   11490: invokestatic 1118	org/vidogram/ui/c/j$a:d	(Lorg/vidogram/ui/c/j$a;)I
    //   11493: iadd
    //   11494: invokestatic 675	java/lang/Math:max	(II)I
    //   11497: istore 8
    //   11499: iload 11
    //   11501: iconst_1
    //   11502: iadd
    //   11503: istore 11
    //   11505: goto -303 -> 11202
    //   11508: ldc_w 1075
    //   11511: fstore 6
    //   11513: goto -340 -> 11173
    //   11516: aload 30
    //   11518: invokestatic 969	java/lang/System:currentTimeMillis	()J
    //   11521: invokestatic 1191	org/vidogram/ui/c/j$a:a	(Lorg/vidogram/ui/c/j$a;J)J
    //   11524: pop2
    //   11525: goto -215 -> 11310
    //   11528: aload_0
    //   11529: iload 8
    //   11531: putfield 1098	org/vidogram/ui/c/j:aZ	I
    //   11534: aload_0
    //   11535: invokespecial 1872	org/vidogram/ui/c/j:h	()V
    //   11538: aload_0
    //   11539: iload 27
    //   11541: invokevirtual 1803	org/vidogram/ui/c/j:a	(Z)V
    //   11544: return
    //   11545: aload_0
    //   11546: iconst_0
    //   11547: putfield 2032	org/vidogram/ui/c/j:bj	I
    //   11550: aload_0
    //   11551: iconst_0
    //   11552: putfield 2059	org/vidogram/ui/c/j:e	I
    //   11555: goto -21 -> 11534
    //   11558: astore 29
    //   11560: iload 11
    //   11562: istore 10
    //   11564: goto -1020 -> 10544
    //   11567: astore 29
    //   11569: goto -8622 -> 2947
    //   11572: astore 29
    //   11574: iconst_0
    //   11575: istore 12
    //   11577: goto -8708 -> 2869
    //   11580: astore 29
    //   11582: goto -8713 -> 2869
    //   11585: astore 29
    //   11587: goto -8718 -> 2869
    //   11590: astore 29
    //   11592: iconst_0
    //   11593: istore 15
    //   11595: iconst_3
    //   11596: istore 11
    //   11598: iload 8
    //   11600: istore 12
    //   11602: iload 15
    //   11604: istore 8
    //   11606: goto -9300 -> 2306
    //   11609: astore 29
    //   11611: iconst_0
    //   11612: istore 15
    //   11614: iload 8
    //   11616: istore 12
    //   11618: iload 15
    //   11620: istore 8
    //   11622: goto -9316 -> 2306
    //   11625: astore 29
    //   11627: iload 9
    //   11629: istore 8
    //   11631: iload 11
    //   11633: istore 9
    //   11635: goto -9430 -> 2205
    //   11638: astore 29
    //   11640: iload 11
    //   11642: istore 9
    //   11644: goto -9439 -> 2205
    //   11647: goto -148 -> 11499
    //   11650: goto -7377 -> 4273
    //   11653: iconst_0
    //   11654: istore 9
    //   11656: goto -7431 -> 4225
    //   11659: iconst_0
    //   11660: istore 11
    //   11662: goto -1668 -> 9994
    //   11665: iconst_0
    //   11666: istore 10
    //   11668: goto -1808 -> 9860
    //   11671: iload 10
    //   11673: istore 8
    //   11675: goto -2016 -> 9659
    //   11678: iload 9
    //   11680: istore 8
    //   11682: goto -1199 -> 10483
    //   11685: goto -2189 -> 9496
    //   11688: goto -2192 -> 9496
    //   11691: goto -2535 -> 9156
    //   11694: iload 9
    //   11696: istore 14
    //   11698: goto -2555 -> 9143
    //   11701: iload 8
    //   11703: istore 13
    //   11705: goto -2575 -> 9130
    //   11708: goto -2999 -> 8709
    //   11711: iconst_0
    //   11712: istore 9
    //   11714: iconst_0
    //   11715: istore 8
    //   11717: goto -3106 -> 8611
    //   11720: goto -5125 -> 6595
    //   11723: aconst_null
    //   11724: astore 29
    //   11726: goto -5243 -> 6483
    //   11729: goto -5281 -> 6448
    //   11732: iload 8
    //   11734: istore 11
    //   11736: iload 9
    //   11738: istore 8
    //   11740: iload 11
    //   11742: istore 9
    //   11744: goto -8310 -> 3434
    //   11747: iload 11
    //   11749: istore 9
    //   11751: goto -7308 -> 4443
    //   11754: iload 9
    //   11756: istore 22
    //   11758: goto -7372 -> 4386
    //   11761: goto -8806 -> 2955
    //   11764: iload 11
    //   11766: istore 12
    //   11768: iconst_0
    //   11769: istore 16
    //   11771: iload 9
    //   11773: istore 11
    //   11775: iload 12
    //   11777: istore 9
    //   11779: iload 16
    //   11781: istore 12
    //   11783: goto -9243 -> 2540
    //   11786: iconst_3
    //   11787: istore 12
    //   11789: iload 9
    //   11791: istore 11
    //   11793: iconst_0
    //   11794: istore 15
    //   11796: iload 12
    //   11798: istore 9
    //   11800: goto -9466 -> 2334
    //   11803: iconst_0
    //   11804: istore 13
    //   11806: iload 9
    //   11808: istore 8
    //   11810: iload 12
    //   11812: istore 9
    //   11814: goto -10497 -> 1317
    //   11817: goto -10779 -> 1038
    //   11820: goto -10910 -> 910
    //   11823: goto -11271 -> 552
    //   11826: iload 22
    //   11828: iload 25
    //   11830: iadd
    //   11831: istore 9
    //   11833: goto -7390 -> 4443
    //
    // Exception table:
    //   from	to	target	type
    //   1191	1275	2192	java/lang/Exception
    //   1480	1492	2292	java/lang/Exception
    //   1500	1512	2292	java/lang/Exception
    //   1528	1538	2292	java/lang/Exception
    //   1546	1553	2292	java/lang/Exception
    //   1566	1578	2292	java/lang/Exception
    //   1606	1613	2292	java/lang/Exception
    //   1621	1632	2292	java/lang/Exception
    //   1640	1652	2292	java/lang/Exception
    //   1660	1672	2292	java/lang/Exception
    //   2275	2289	2292	java/lang/Exception
    //   2752	2766	2292	java/lang/Exception
    //   2339	2372	2864	java/lang/Exception
    //   2378	2385	2864	java/lang/Exception
    //   2390	2414	2864	java/lang/Exception
    //   2796	2831	2864	java/lang/Exception
    //   2545	2590	2945	java/lang/Exception
    //   2596	2636	2945	java/lang/Exception
    //   2639	2679	2945	java/lang/Exception
    //   2685	2713	2945	java/lang/Exception
    //   2721	2735	2945	java/lang/Exception
    //   2892	2921	2945	java/lang/Exception
    //   2928	2942	2945	java/lang/Exception
    //   9705	9773	10539	java/lang/Exception
    //   3860	3937	11100	java/lang/Exception
    //   3937	4060	11100	java/lang/Exception
    //   9782	9818	11558	java/lang/Exception
    //   9822	9853	11558	java/lang/Exception
    //   4289	4317	11567	java/lang/Exception
    //   4322	4334	11567	java/lang/Exception
    //   4339	4351	11567	java/lang/Exception
    //   4368	4375	11567	java/lang/Exception
    //   4375	4386	11567	java/lang/Exception
    //   4401	4418	11567	java/lang/Exception
    //   4423	4440	11567	java/lang/Exception
    //   4443	4455	11567	java/lang/Exception
    //   4477	4486	11567	java/lang/Exception
    //   4489	4503	11567	java/lang/Exception
    //   2414	2472	11572	java/lang/Exception
    //   2477	2486	11572	java/lang/Exception
    //   2841	2854	11572	java/lang/Exception
    //   2496	2508	11580	java/lang/Exception
    //   2512	2524	11585	java/lang/Exception
    //   1322	1362	11590	java/lang/Exception
    //   1362	1369	11590	java/lang/Exception
    //   1374	1404	11590	java/lang/Exception
    //   2224	2258	11590	java/lang/Exception
    //   1410	1450	11609	java/lang/Exception
    //   1281	1302	11625	java/lang/Exception
    //   1302	1313	11638	java/lang/Exception
  }

  public void setPressed(boolean paramBoolean)
  {
    super.setPressed(paramBoolean);
    this.n.a(getDrawableForCurrentState());
    if (this.aE)
      this.aG.a(i());
    while (true)
    {
      invalidate();
      return;
      this.aF.a(i());
    }
  }

  private class a
  {
    private int b;
    private int c;
    private int d;
    private int e;
    private StaticLayout f;
    private g.aq g;
    private int h;
    private float i;
    private long j;

    private a()
    {
    }
  }

  public static abstract interface b
  {
    public abstract void a(String paramString1, String paramString2, String paramString3, String paramString4, int paramInt1, int paramInt2);

    public abstract void a(u paramu, ClickableSpan paramClickableSpan, boolean paramBoolean);

    public abstract void a(j paramj);

    public abstract void a(j paramj, int paramInt);

    public abstract void a(j paramj, String paramString);

    public abstract void a(j paramj, g.aq paramaq);

    public abstract void a(j paramj, g.i parami, int paramInt);

    public abstract void a(j paramj, g.vw paramvw);

    public abstract boolean a();

    public abstract boolean a(u paramu);

    public abstract void b(j paramj);

    public abstract void c(j paramj);

    public abstract void d(j paramj);

    public abstract void e(j paramj);
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.c.j
 * JD-Core Version:    0.6.0
 */