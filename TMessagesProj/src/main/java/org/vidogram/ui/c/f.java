package org.vidogram.ui.c;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.text.Layout.Alignment;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.View.MeasureSpec;
import org.vidogram.messenger.a;
import org.vidogram.messenger.j;
import org.vidogram.messenger.n;
import org.vidogram.messenger.r;
import org.vidogram.messenger.u;
import org.vidogram.ui.Components.bo;
import org.vidogram.ui.Components.z;
import org.vidogram.ui.a.l;

public class f extends View
{
  private StaticLayout a;
  private TextPaint b = new TextPaint(1);
  private Paint c;
  private String d;
  private int e;
  private int f;
  private int g;
  private int h;
  private ClickableSpan i;
  private z j = new z();
  private a k;

  public f(Context paramContext)
  {
    super(paramContext);
    this.b.setTextSize(a.a(16.0F));
    this.b.setColor(-16777216);
    this.b.linkColor = -14255946;
    this.c = new Paint();
    this.c.setColor(862104035);
  }

  private void a()
  {
    if (this.i != null)
      this.i = null;
    invalidate();
  }

  protected void onDraw(Canvas paramCanvas)
  {
    int n = (paramCanvas.getWidth() - this.e) / 2;
    int m = a.a(4.0F);
    l.g.setBounds(n, m, this.e + n, this.f + m);
    l.g.draw(paramCanvas);
    paramCanvas.save();
    n += a.a(11.0F);
    this.g = n;
    float f1 = n;
    m += a.a(11.0F);
    this.h = m;
    paramCanvas.translate(f1, m);
    if (this.i != null)
      paramCanvas.drawPath(this.j, this.c);
    if (this.a != null)
      this.a.draw(paramCanvas);
    paramCanvas.restore();
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(paramInt1), 1073741824), this.f + a.a(8.0F));
  }

  // ERROR //
  public boolean onTouchEvent(android.view.MotionEvent paramMotionEvent)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore 7
    //   3: aload_1
    //   4: invokevirtual 152	android/view/MotionEvent:getX	()F
    //   7: fstore_2
    //   8: aload_1
    //   9: invokevirtual 155	android/view/MotionEvent:getY	()F
    //   12: fstore_3
    //   13: aload_0
    //   14: getfield 119	org/vidogram/ui/c/f:a	Landroid/text/StaticLayout;
    //   17: ifnull +449 -> 466
    //   20: aload_1
    //   21: invokevirtual 158	android/view/MotionEvent:getAction	()I
    //   24: ifeq +18 -> 42
    //   27: aload_0
    //   28: getfield 71	org/vidogram/ui/c/f:i	Landroid/text/style/ClickableSpan;
    //   31: ifnull +412 -> 443
    //   34: aload_1
    //   35: invokevirtual 158	android/view/MotionEvent:getAction	()I
    //   38: iconst_1
    //   39: if_icmpne +404 -> 443
    //   42: aload_1
    //   43: invokevirtual 158	android/view/MotionEvent:getAction	()I
    //   46: ifne +257 -> 303
    //   49: aload_0
    //   50: invokespecial 160	org/vidogram/ui/c/f:a	()V
    //   53: fload_2
    //   54: aload_0
    //   55: getfield 107	org/vidogram/ui/c/f:g	I
    //   58: i2f
    //   59: fsub
    //   60: f2i
    //   61: istore 4
    //   63: fload_3
    //   64: aload_0
    //   65: getfield 109	org/vidogram/ui/c/f:h	I
    //   68: i2f
    //   69: fsub
    //   70: f2i
    //   71: istore 5
    //   73: aload_0
    //   74: getfield 119	org/vidogram/ui/c/f:a	Landroid/text/StaticLayout;
    //   77: iload 5
    //   79: invokevirtual 163	android/text/StaticLayout:getLineForVertical	(I)I
    //   82: istore 5
    //   84: aload_0
    //   85: getfield 119	org/vidogram/ui/c/f:a	Landroid/text/StaticLayout;
    //   88: iload 5
    //   90: iload 4
    //   92: i2f
    //   93: invokevirtual 167	android/text/StaticLayout:getOffsetForHorizontal	(IF)I
    //   96: istore 6
    //   98: aload_0
    //   99: getfield 119	org/vidogram/ui/c/f:a	Landroid/text/StaticLayout;
    //   102: iload 5
    //   104: invokevirtual 171	android/text/StaticLayout:getLineLeft	(I)F
    //   107: fstore_2
    //   108: fload_2
    //   109: iload 4
    //   111: i2f
    //   112: fcmpg
    //   113: ifgt +164 -> 277
    //   116: aload_0
    //   117: getfield 119	org/vidogram/ui/c/f:a	Landroid/text/StaticLayout;
    //   120: iload 5
    //   122: invokevirtual 174	android/text/StaticLayout:getLineWidth	(I)F
    //   125: fload_2
    //   126: fadd
    //   127: iload 4
    //   129: i2f
    //   130: fcmpl
    //   131: iflt +146 -> 277
    //   134: aload_0
    //   135: getfield 119	org/vidogram/ui/c/f:a	Landroid/text/StaticLayout;
    //   138: invokevirtual 178	android/text/StaticLayout:getText	()Ljava/lang/CharSequence;
    //   141: checkcast 180	android/text/Spannable
    //   144: astore 8
    //   146: aload 8
    //   148: iload 6
    //   150: iload 6
    //   152: ldc 182
    //   154: invokeinterface 186 4 0
    //   159: checkcast 188	[Landroid/text/style/ClickableSpan;
    //   162: astore 9
    //   164: aload 9
    //   166: arraylength
    //   167: ifeq +103 -> 270
    //   170: aload_0
    //   171: invokespecial 160	org/vidogram/ui/c/f:a	()V
    //   174: aload_0
    //   175: aload 9
    //   177: iconst_0
    //   178: aaload
    //   179: putfield 71	org/vidogram/ui/c/f:i	Landroid/text/style/ClickableSpan;
    //   182: aload 8
    //   184: aload_0
    //   185: getfield 71	org/vidogram/ui/c/f:i	Landroid/text/style/ClickableSpan;
    //   188: invokeinterface 192 2 0
    //   193: istore 4
    //   195: aload_0
    //   196: getfield 36	org/vidogram/ui/c/f:j	Lorg/vidogram/ui/Components/z;
    //   199: aload_0
    //   200: getfield 119	org/vidogram/ui/c/f:a	Landroid/text/StaticLayout;
    //   203: iload 4
    //   205: fconst_0
    //   206: invokevirtual 195	org/vidogram/ui/Components/z:a	(Landroid/text/StaticLayout;IF)V
    //   209: aload_0
    //   210: getfield 119	org/vidogram/ui/c/f:a	Landroid/text/StaticLayout;
    //   213: iload 4
    //   215: aload 8
    //   217: aload_0
    //   218: getfield 71	org/vidogram/ui/c/f:i	Landroid/text/style/ClickableSpan;
    //   221: invokeinterface 198 2 0
    //   226: aload_0
    //   227: getfield 36	org/vidogram/ui/c/f:j	Lorg/vidogram/ui/Components/z;
    //   230: invokevirtual 202	android/text/StaticLayout:getSelectionPath	(IILandroid/graphics/Path;)V
    //   233: iconst_1
    //   234: istore 4
    //   236: iload 4
    //   238: ifne +11 -> 249
    //   241: aload_0
    //   242: aload_1
    //   243: invokespecial 204	android/view/View:onTouchEvent	(Landroid/view/MotionEvent;)Z
    //   246: ifeq +6 -> 252
    //   249: iconst_1
    //   250: istore 7
    //   252: iload 7
    //   254: ireturn
    //   255: astore 8
    //   257: ldc 206
    //   259: aload 8
    //   261: invokestatic 211	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   264: iconst_1
    //   265: istore 4
    //   267: goto -31 -> 236
    //   270: aload_0
    //   271: invokespecial 160	org/vidogram/ui/c/f:a	()V
    //   274: goto +192 -> 466
    //   277: aload_0
    //   278: invokespecial 160	org/vidogram/ui/c/f:a	()V
    //   281: goto +185 -> 466
    //   284: astore 8
    //   286: iconst_0
    //   287: istore 4
    //   289: aload_0
    //   290: invokespecial 160	org/vidogram/ui/c/f:a	()V
    //   293: ldc 206
    //   295: aload 8
    //   297: invokestatic 211	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   300: goto -64 -> 236
    //   303: aload_0
    //   304: getfield 71	org/vidogram/ui/c/f:i	Landroid/text/style/ClickableSpan;
    //   307: ifnull +159 -> 466
    //   310: aload_0
    //   311: getfield 71	org/vidogram/ui/c/f:i	Landroid/text/style/ClickableSpan;
    //   314: instanceof 213
    //   317: ifeq +73 -> 390
    //   320: aload_0
    //   321: getfield 71	org/vidogram/ui/c/f:i	Landroid/text/style/ClickableSpan;
    //   324: checkcast 213	org/vidogram/ui/Components/URLSpanNoUnderline
    //   327: invokevirtual 217	org/vidogram/ui/Components/URLSpanNoUnderline:getURL	()Ljava/lang/String;
    //   330: astore 8
    //   332: aload 8
    //   334: ldc 219
    //   336: invokevirtual 225	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   339: ifne +23 -> 362
    //   342: aload 8
    //   344: ldc 227
    //   346: invokevirtual 225	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   349: ifne +13 -> 362
    //   352: aload 8
    //   354: ldc 229
    //   356: invokevirtual 225	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   359: ifeq +21 -> 380
    //   362: aload_0
    //   363: getfield 231	org/vidogram/ui/c/f:k	Lorg/vidogram/ui/c/f$a;
    //   366: ifnull +14 -> 380
    //   369: aload_0
    //   370: getfield 231	org/vidogram/ui/c/f:k	Lorg/vidogram/ui/c/f$a;
    //   373: aload 8
    //   375: invokeinterface 234 2 0
    //   380: aload_0
    //   381: invokespecial 160	org/vidogram/ui/c/f:a	()V
    //   384: iconst_1
    //   385: istore 4
    //   387: goto -151 -> 236
    //   390: aload_0
    //   391: getfield 71	org/vidogram/ui/c/f:i	Landroid/text/style/ClickableSpan;
    //   394: instanceof 236
    //   397: ifeq +35 -> 432
    //   400: aload_0
    //   401: invokevirtual 240	org/vidogram/ui/c/f:getContext	()Landroid/content/Context;
    //   404: aload_0
    //   405: getfield 71	org/vidogram/ui/c/f:i	Landroid/text/style/ClickableSpan;
    //   408: checkcast 236	android/text/style/URLSpan
    //   411: invokevirtual 241	android/text/style/URLSpan:getURL	()Ljava/lang/String;
    //   414: invokestatic 246	org/vidogram/messenger/b/a:a	(Landroid/content/Context;Ljava/lang/String;)V
    //   417: goto -37 -> 380
    //   420: astore 8
    //   422: ldc 206
    //   424: aload 8
    //   426: invokestatic 211	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   429: goto -49 -> 380
    //   432: aload_0
    //   433: getfield 71	org/vidogram/ui/c/f:i	Landroid/text/style/ClickableSpan;
    //   436: aload_0
    //   437: invokevirtual 250	android/text/style/ClickableSpan:onClick	(Landroid/view/View;)V
    //   440: goto -60 -> 380
    //   443: aload_1
    //   444: invokevirtual 158	android/view/MotionEvent:getAction	()I
    //   447: iconst_3
    //   448: if_icmpne +18 -> 466
    //   451: aload_0
    //   452: invokespecial 160	org/vidogram/ui/c/f:a	()V
    //   455: goto +11 -> 466
    //   458: astore 8
    //   460: iconst_1
    //   461: istore 4
    //   463: goto -174 -> 289
    //   466: iconst_0
    //   467: istore 4
    //   469: goto -233 -> 236
    //
    // Exception table:
    //   from	to	target	type
    //   182	233	255	java/lang/Exception
    //   53	108	284	java/lang/Exception
    //   116	182	284	java/lang/Exception
    //   270	274	284	java/lang/Exception
    //   277	281	284	java/lang/Exception
    //   310	362	420	java/lang/Exception
    //   362	380	420	java/lang/Exception
    //   390	417	420	java/lang/Exception
    //   432	440	420	java/lang/Exception
    //   257	264	458	java/lang/Exception
  }

  public void setDelegate(a parama)
  {
    this.k = parama;
  }

  public void setText(String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0))
      setVisibility(8);
    do
      return;
    while ((paramString != null) && (this.d != null) && (paramString.equals(this.d)));
    this.d = paramString;
    setVisibility(0);
    if (a.c())
      this.e = (int)(a.e() * 0.7F);
    while (true)
    {
      SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder();
      String str = r.a("BotInfoTitle", 2131230925);
      localSpannableStringBuilder.append(str);
      localSpannableStringBuilder.append("\n\n");
      localSpannableStringBuilder.append(paramString);
      u.a(localSpannableStringBuilder);
      localSpannableStringBuilder.setSpan(new bo(a.a("fonts/rmedium.ttf")), 0, str.length(), 33);
      j.a(localSpannableStringBuilder, this.b.getFontMetricsInt(), a.a(20.0F), false);
      try
      {
        this.a = new StaticLayout(localSpannableStringBuilder, this.b, this.e, Layout.Alignment.ALIGN_NORMAL, 1.0F, 0.0F, false);
        this.e = 0;
        this.f = (this.a.getHeight() + a.a(22.0F));
        int n = this.a.getLineCount();
        int m = 0;
        while (m < n)
        {
          this.e = (int)Math.ceil(Math.max(this.e, this.a.getLineWidth(m) + this.a.getLineLeft(m)));
          m += 1;
          continue;
          this.e = (int)(Math.min(a.c.x, a.c.y) * 0.7F);
        }
      }
      catch (java.lang.Exception paramString)
      {
        n.a("tmessage", paramString);
        this.e += a.a(22.0F);
      }
    }
  }

  public static abstract interface a
  {
    public abstract void a(String paramString);
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.c.f
 * JD-Core Version:    0.6.0
 */