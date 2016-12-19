package org.vidogram.ui.c;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout.Alignment;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import org.vidogram.messenger.j;
import org.vidogram.messenger.n;
import org.vidogram.messenger.r;
import org.vidogram.messenger.u;
import org.vidogram.ui.Components.v;
import org.vidogram.ui.Components.z;

public class a extends FrameLayout
{
  private StaticLayout a;
  private TextPaint b = new TextPaint(1);
  private Paint c;
  private String d;
  private int e;
  private int f;
  private SpannableStringBuilder g;
  private ImageView h;
  private ClickableSpan i;
  private z j = new z();
  private a k;

  public a(Context paramContext)
  {
    super(paramContext);
    this.b.setTextSize(org.vidogram.messenger.a.a(16.0F));
    this.b.setColor(-16777216);
    this.b.linkColor = -14255946;
    this.c = new Paint();
    this.c.setColor(862104035);
    this.h = new ImageView(paramContext);
    this.h.setScaleType(ImageView.ScaleType.CENTER);
    paramContext = this.h;
    int m;
    float f1;
    if (r.a)
    {
      m = 5;
      if (!r.a)
        break label166;
      f1 = 0.0F;
      label126: if (!r.a)
        break label172;
    }
    while (true)
    {
      addView(paramContext, v.a(-2, -2.0F, m | 0x30, f1, 5.0F, f2, 0.0F));
      setWillNotDraw(false);
      return;
      m = 3;
      break;
      label166: f1 = 16.0F;
      break label126;
      label172: f2 = 0.0F;
    }
  }

  private void a()
  {
    if (this.i != null)
      this.i = null;
    invalidate();
  }

  public void a(String paramString, int paramInt)
  {
    if ((paramString == null) || (paramString.length() == 0))
      setVisibility(8);
    do
      return;
    while ((paramString != null) && (this.d != null) && (paramString.equals(this.d)));
    this.d = paramString;
    this.g = new SpannableStringBuilder(this.d);
    u.a(this.g, false);
    j.a(this.g, this.b.getFontMetricsInt(), org.vidogram.messenger.a.a(20.0F), false);
    requestLayout();
    if (paramInt == 0)
    {
      this.h.setImageDrawable(null);
      return;
    }
    this.h.setImageResource(paramInt);
  }

  protected void onDraw(Canvas paramCanvas)
  {
    paramCanvas.save();
    float f1;
    if (r.a)
      f1 = 16.0F;
    while (true)
    {
      int m = org.vidogram.messenger.a.a(f1);
      this.e = m;
      f1 = m;
      m = org.vidogram.messenger.a.a(8.0F);
      this.f = m;
      paramCanvas.translate(f1, m);
      if (this.i != null)
        paramCanvas.drawPath(this.j, this.c);
      try
      {
        if (this.a != null)
          this.a.draw(paramCanvas);
        paramCanvas.restore();
        return;
        f1 = 71.0F;
      }
      catch (Exception localException)
      {
        while (true)
          n.a("tmessages", localException);
      }
    }
  }

  @SuppressLint({"DrawAllocation"})
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    this.a = new StaticLayout(this.g, this.b, View.MeasureSpec.getSize(paramInt1) - org.vidogram.messenger.a.a(87.0F), Layout.Alignment.ALIGN_NORMAL, 1.0F, 0.0F, false);
    super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(paramInt1), 1073741824), View.MeasureSpec.makeMeasureSpec(this.a.getHeight() + org.vidogram.messenger.a.a(16.0F), 1073741824));
  }

  // ERROR //
  public boolean onTouchEvent(android.view.MotionEvent paramMotionEvent)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore 7
    //   3: aload_1
    //   4: invokevirtual 239	android/view/MotionEvent:getX	()F
    //   7: fstore_2
    //   8: aload_1
    //   9: invokevirtual 242	android/view/MotionEvent:getY	()F
    //   12: fstore_3
    //   13: getstatic 247	android/os/Build$VERSION:SDK_INT	I
    //   16: bipush 21
    //   18: if_icmplt +34 -> 52
    //   21: aload_0
    //   22: invokevirtual 251	org/vidogram/ui/c/a:getBackground	()Landroid/graphics/drawable/Drawable;
    //   25: ifnull +27 -> 52
    //   28: aload_1
    //   29: invokevirtual 254	android/view/MotionEvent:getAction	()I
    //   32: ifeq +11 -> 43
    //   35: aload_1
    //   36: invokevirtual 254	android/view/MotionEvent:getAction	()I
    //   39: iconst_2
    //   40: if_icmpne +12 -> 52
    //   43: aload_0
    //   44: invokevirtual 251	org/vidogram/ui/c/a:getBackground	()Landroid/graphics/drawable/Drawable;
    //   47: fload_2
    //   48: fload_3
    //   49: invokevirtual 259	android/graphics/drawable/Drawable:setHotspot	(FF)V
    //   52: aload_0
    //   53: getfield 183	org/vidogram/ui/c/a:a	Landroid/text/StaticLayout;
    //   56: ifnull +453 -> 509
    //   59: aload_1
    //   60: invokevirtual 254	android/view/MotionEvent:getAction	()I
    //   63: ifeq +18 -> 81
    //   66: aload_0
    //   67: getfield 108	org/vidogram/ui/c/a:i	Landroid/text/style/ClickableSpan;
    //   70: ifnull +416 -> 486
    //   73: aload_1
    //   74: invokevirtual 254	android/view/MotionEvent:getAction	()I
    //   77: iconst_1
    //   78: if_icmpne +408 -> 486
    //   81: aload_1
    //   82: invokevirtual 254	android/view/MotionEvent:getAction	()I
    //   85: ifne +258 -> 343
    //   88: aload_0
    //   89: invokespecial 261	org/vidogram/ui/c/a:a	()V
    //   92: fload_2
    //   93: aload_0
    //   94: getfield 170	org/vidogram/ui/c/a:e	I
    //   97: i2f
    //   98: fsub
    //   99: f2i
    //   100: istore 4
    //   102: fload_3
    //   103: aload_0
    //   104: getfield 173	org/vidogram/ui/c/a:f	I
    //   107: i2f
    //   108: fsub
    //   109: f2i
    //   110: istore 5
    //   112: aload_0
    //   113: getfield 183	org/vidogram/ui/c/a:a	Landroid/text/StaticLayout;
    //   116: iload 5
    //   118: invokevirtual 264	android/text/StaticLayout:getLineForVertical	(I)I
    //   121: istore 5
    //   123: aload_0
    //   124: getfield 183	org/vidogram/ui/c/a:a	Landroid/text/StaticLayout;
    //   127: iload 5
    //   129: iload 4
    //   131: i2f
    //   132: invokevirtual 268	android/text/StaticLayout:getOffsetForHorizontal	(IF)I
    //   135: istore 6
    //   137: aload_0
    //   138: getfield 183	org/vidogram/ui/c/a:a	Landroid/text/StaticLayout;
    //   141: iload 5
    //   143: invokevirtual 272	android/text/StaticLayout:getLineLeft	(I)F
    //   146: fstore_2
    //   147: fload_2
    //   148: iload 4
    //   150: i2f
    //   151: fcmpg
    //   152: ifgt +165 -> 317
    //   155: aload_0
    //   156: getfield 183	org/vidogram/ui/c/a:a	Landroid/text/StaticLayout;
    //   159: iload 5
    //   161: invokevirtual 275	android/text/StaticLayout:getLineWidth	(I)F
    //   164: fload_2
    //   165: fadd
    //   166: iload 4
    //   168: i2f
    //   169: fcmpl
    //   170: iflt +147 -> 317
    //   173: aload_0
    //   174: getfield 183	org/vidogram/ui/c/a:a	Landroid/text/StaticLayout;
    //   177: invokevirtual 279	android/text/StaticLayout:getText	()Ljava/lang/CharSequence;
    //   180: checkcast 281	android/text/Spannable
    //   183: astore 8
    //   185: aload 8
    //   187: iload 6
    //   189: iload 6
    //   191: ldc_w 283
    //   194: invokeinterface 287 4 0
    //   199: checkcast 289	[Landroid/text/style/ClickableSpan;
    //   202: astore 9
    //   204: aload 9
    //   206: arraylength
    //   207: ifeq +103 -> 310
    //   210: aload_0
    //   211: invokespecial 261	org/vidogram/ui/c/a:a	()V
    //   214: aload_0
    //   215: aload 9
    //   217: iconst_0
    //   218: aaload
    //   219: putfield 108	org/vidogram/ui/c/a:i	Landroid/text/style/ClickableSpan;
    //   222: aload 8
    //   224: aload_0
    //   225: getfield 108	org/vidogram/ui/c/a:i	Landroid/text/style/ClickableSpan;
    //   228: invokeinterface 293 2 0
    //   233: istore 4
    //   235: aload_0
    //   236: getfield 39	org/vidogram/ui/c/a:j	Lorg/vidogram/ui/Components/z;
    //   239: aload_0
    //   240: getfield 183	org/vidogram/ui/c/a:a	Landroid/text/StaticLayout;
    //   243: iload 4
    //   245: fconst_0
    //   246: invokevirtual 296	org/vidogram/ui/Components/z:a	(Landroid/text/StaticLayout;IF)V
    //   249: aload_0
    //   250: getfield 183	org/vidogram/ui/c/a:a	Landroid/text/StaticLayout;
    //   253: iload 4
    //   255: aload 8
    //   257: aload_0
    //   258: getfield 108	org/vidogram/ui/c/a:i	Landroid/text/style/ClickableSpan;
    //   261: invokeinterface 299 2 0
    //   266: aload_0
    //   267: getfield 39	org/vidogram/ui/c/a:j	Lorg/vidogram/ui/Components/z;
    //   270: invokevirtual 303	android/text/StaticLayout:getSelectionPath	(IILandroid/graphics/Path;)V
    //   273: iconst_1
    //   274: istore 4
    //   276: iload 4
    //   278: ifne +11 -> 289
    //   281: aload_0
    //   282: aload_1
    //   283: invokespecial 305	android/widget/FrameLayout:onTouchEvent	(Landroid/view/MotionEvent;)Z
    //   286: ifeq +6 -> 292
    //   289: iconst_1
    //   290: istore 7
    //   292: iload 7
    //   294: ireturn
    //   295: astore 8
    //   297: ldc 194
    //   299: aload 8
    //   301: invokestatic 199	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   304: iconst_1
    //   305: istore 4
    //   307: goto -31 -> 276
    //   310: aload_0
    //   311: invokespecial 261	org/vidogram/ui/c/a:a	()V
    //   314: goto +195 -> 509
    //   317: aload_0
    //   318: invokespecial 261	org/vidogram/ui/c/a:a	()V
    //   321: goto +188 -> 509
    //   324: astore 8
    //   326: iconst_0
    //   327: istore 4
    //   329: aload_0
    //   330: invokespecial 261	org/vidogram/ui/c/a:a	()V
    //   333: ldc 194
    //   335: aload 8
    //   337: invokestatic 199	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   340: goto -64 -> 276
    //   343: aload_0
    //   344: getfield 108	org/vidogram/ui/c/a:i	Landroid/text/style/ClickableSpan;
    //   347: ifnull +162 -> 509
    //   350: aload_0
    //   351: getfield 108	org/vidogram/ui/c/a:i	Landroid/text/style/ClickableSpan;
    //   354: instanceof 307
    //   357: ifeq +76 -> 433
    //   360: aload_0
    //   361: getfield 108	org/vidogram/ui/c/a:i	Landroid/text/style/ClickableSpan;
    //   364: checkcast 307	org/vidogram/ui/Components/URLSpanNoUnderline
    //   367: invokevirtual 311	org/vidogram/ui/Components/URLSpanNoUnderline:getURL	()Ljava/lang/String;
    //   370: astore 8
    //   372: aload 8
    //   374: ldc_w 313
    //   377: invokevirtual 317	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   380: ifne +25 -> 405
    //   383: aload 8
    //   385: ldc_w 319
    //   388: invokevirtual 317	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   391: ifne +14 -> 405
    //   394: aload 8
    //   396: ldc_w 321
    //   399: invokevirtual 317	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   402: ifeq +21 -> 423
    //   405: aload_0
    //   406: getfield 323	org/vidogram/ui/c/a:k	Lorg/vidogram/ui/c/a$a;
    //   409: ifnull +14 -> 423
    //   412: aload_0
    //   413: getfield 323	org/vidogram/ui/c/a:k	Lorg/vidogram/ui/c/a$a;
    //   416: aload 8
    //   418: invokeinterface 326 2 0
    //   423: aload_0
    //   424: invokespecial 261	org/vidogram/ui/c/a:a	()V
    //   427: iconst_1
    //   428: istore 4
    //   430: goto -154 -> 276
    //   433: aload_0
    //   434: getfield 108	org/vidogram/ui/c/a:i	Landroid/text/style/ClickableSpan;
    //   437: instanceof 328
    //   440: ifeq +35 -> 475
    //   443: aload_0
    //   444: invokevirtual 332	org/vidogram/ui/c/a:getContext	()Landroid/content/Context;
    //   447: aload_0
    //   448: getfield 108	org/vidogram/ui/c/a:i	Landroid/text/style/ClickableSpan;
    //   451: checkcast 328	android/text/style/URLSpan
    //   454: invokevirtual 333	android/text/style/URLSpan:getURL	()Ljava/lang/String;
    //   457: invokestatic 338	org/vidogram/messenger/b/a:a	(Landroid/content/Context;Ljava/lang/String;)V
    //   460: goto -37 -> 423
    //   463: astore 8
    //   465: ldc 194
    //   467: aload 8
    //   469: invokestatic 199	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   472: goto -49 -> 423
    //   475: aload_0
    //   476: getfield 108	org/vidogram/ui/c/a:i	Landroid/text/style/ClickableSpan;
    //   479: aload_0
    //   480: invokevirtual 342	android/text/style/ClickableSpan:onClick	(Landroid/view/View;)V
    //   483: goto -60 -> 423
    //   486: aload_1
    //   487: invokevirtual 254	android/view/MotionEvent:getAction	()I
    //   490: iconst_3
    //   491: if_icmpne +18 -> 509
    //   494: aload_0
    //   495: invokespecial 261	org/vidogram/ui/c/a:a	()V
    //   498: goto +11 -> 509
    //   501: astore 8
    //   503: iconst_1
    //   504: istore 4
    //   506: goto -177 -> 329
    //   509: iconst_0
    //   510: istore 4
    //   512: goto -236 -> 276
    //
    // Exception table:
    //   from	to	target	type
    //   222	273	295	java/lang/Exception
    //   92	147	324	java/lang/Exception
    //   155	222	324	java/lang/Exception
    //   310	314	324	java/lang/Exception
    //   317	321	324	java/lang/Exception
    //   350	405	463	java/lang/Exception
    //   405	423	463	java/lang/Exception
    //   433	460	463	java/lang/Exception
    //   475	483	463	java/lang/Exception
    //   297	304	501	java/lang/Exception
  }

  public void setDelegate(a parama)
  {
    this.k = parama;
  }

  public static abstract interface a
  {
    public abstract void a(String paramString);
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.c.a
 * JD-Core Version:    0.6.0
 */