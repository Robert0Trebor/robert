package org.vidogram.ui.Components;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Point;
import android.os.Build.VERSION;
import android.text.TextUtils.TruncateAt;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.WebChromeClient;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import java.util.regex.Pattern;
import org.vidogram.messenger.ApplicationLoader;
import org.vidogram.messenger.n;
import org.vidogram.messenger.r;
import org.vidogram.ui.a.h;
import org.vidogram.ui.a.h.b;
import org.vidogram.ui.a.l;

public class bt extends FrameLayout
{
  static final Pattern a = Pattern.compile("(?:youtube(?:-nocookie)?\\.com\\/(?:[^\\/\\n\\s]+\\/\\S+\\/|(?:v|e(?:mbed)?)\\/|\\S*?[?&]v=)|youtu\\.be\\/)([a-zA-Z0-9_-]{11})");
  private WebView b;
  private h c;
  private View d;
  private FrameLayout e;
  private WebChromeClient.CustomViewCallback f;
  private ProgressBar g;
  private int h;
  private int i;
  private String j;
  private boolean k;
  private String l;
  private final String m = "<!DOCTYPE html><html><head><style>body { margin: 0; width:100%%; height:100%%;  background-color:#000; }html { width:100%%; height:100%%; background-color:#000; }.embed-container iframe,.embed-container object,    .embed-container embed {        position: absolute;        top: 0;        left: 0;        width: 100%% !important;        height: 100%% !important;    }    </style></head><body>    <div class=\"embed-container\">        <div id=\"player\"></div>    </div>    <script src=\"https://www.youtube.com/iframe_api\"></script>    <script>    var player;    YT.ready(function() {         player = new YT.Player(\"player\", {                                \"width\" : \"100%%\",                                \"events\" : {                                \"onReady\" : \"onReady\",                                },                                \"videoId\" : \"%1$s\",                                \"height\" : \"100%%\",                                \"playerVars\" : {                                \"start\" : 0,                                \"rel\" : 0,                                \"showinfo\" : 0,                                \"modestbranding\" : 1,                                \"iv_load_policy\" : 3,                                \"autohide\" : 1,                                \"cc_load_policy\" : 1,                                \"playsinline\" : 1,                                \"controls\" : 1                                }                                });        player.setSize(window.innerWidth, window.innerHeight);    });    function onReady(event) {        player.playVideo();    }    window.onresize = function() {        player.setSize(window.innerWidth, window.innerHeight);    }    </script></body></html>";

  @SuppressLint({"SetJavaScriptEnabled"})
  public bt(Context paramContext, h paramh, String paramString1, String paramString2, String paramString3, String paramString4, int paramInt1, int paramInt2)
  {
    super(paramContext);
    this.l = paramString4;
    boolean bool;
    if ((paramString2 != null) && (paramString2.length() > 0))
    {
      bool = true;
      this.k = bool;
      this.j = paramString3;
      this.h = paramInt1;
      this.i = paramInt2;
      if ((this.h == 0) || (this.i == 0))
      {
        this.h = org.vidogram.messenger.a.c.x;
        this.i = (org.vidogram.messenger.a.c.y / 2);
      }
      this.c = paramh;
      this.e = new FrameLayout(paramContext);
      this.e.setBackgroundColor(-16777216);
      if (Build.VERSION.SDK_INT >= 21)
        this.e.setFitsSystemWindows(true);
      paramh.a(false);
      paramh.b(false);
      this.c.c().addView(this.e, v.a(-1, -1.0F));
      this.e.setVisibility(4);
      this.b = new WebView(paramContext);
      this.b.getSettings().setJavaScriptEnabled(true);
      this.b.getSettings().setDomStorageEnabled(true);
      if (Build.VERSION.SDK_INT >= 17)
        this.b.getSettings().setMediaPlaybackRequiresUserGesture(false);
      paramString3 = this.b.getSettings().getUserAgentString();
      if (paramString3 != null)
      {
        paramString3 = paramString3.replace("Android", "");
        this.b.getSettings().setUserAgentString(paramString3);
      }
      if (Build.VERSION.SDK_INT >= 21)
      {
        this.b.getSettings().setMixedContentMode(0);
        CookieManager.getInstance().setAcceptThirdPartyCookies(this.b, true);
      }
      this.b.setWebChromeClient(new WebChromeClient()
      {
        public void onHideCustomView()
        {
          super.onHideCustomView();
          if (bt.a(bt.this) == null)
            return;
          if (bt.b(bt.this) != null)
          {
            bt.b(bt.this).d().setVisibility(0);
            bt.c(bt.this).setVisibility(4);
            bt.c(bt.this).removeView(bt.a(bt.this));
          }
          if ((bt.d(bt.this) != null) && (!bt.d(bt.this).getClass().getName().contains(".chromium.")))
            bt.d(bt.this).onCustomViewHidden();
          bt.a(bt.this, null);
        }

        public void onShowCustomView(View paramView, int paramInt, WebChromeClient.CustomViewCallback paramCustomViewCallback)
        {
          onShowCustomView(paramView, paramCustomViewCallback);
        }

        public void onShowCustomView(View paramView, WebChromeClient.CustomViewCallback paramCustomViewCallback)
        {
          if (bt.a(bt.this) != null)
          {
            paramCustomViewCallback.onCustomViewHidden();
            return;
          }
          bt.a(bt.this, paramView);
          if (bt.b(bt.this) != null)
          {
            bt.b(bt.this).d().setVisibility(4);
            bt.c(bt.this).setVisibility(0);
            bt.c(bt.this).addView(paramView, v.a(-1, -1.0F));
          }
          bt.a(bt.this, paramCustomViewCallback);
        }
      });
      this.b.setWebViewClient(new WebViewClient()
      {
        public void onLoadResource(WebView paramWebView, String paramString)
        {
          super.onLoadResource(paramWebView, paramString);
        }

        public void onPageFinished(WebView paramWebView, String paramString)
        {
          super.onPageFinished(paramWebView, paramString);
          bt.e(bt.this).setVisibility(4);
        }
      });
      paramString3 = this.b;
      if (!this.k)
        break label1068;
      paramInt1 = 22;
      label343: addView(paramString3, v.a(-1, -1.0F, 51, 0.0F, 0.0F, 0.0F, paramInt1 + 84));
      this.g = new ProgressBar(paramContext);
      paramString3 = this.g;
      if (!this.k)
        break label1074;
    }
    label1068: label1074: for (paramInt1 = 22; ; paramInt1 = 0)
    {
      addView(paramString3, v.a(-2, -2.0F, 17, 0.0F, 0.0F, 0.0F, (paramInt1 + 84) / 2));
      if (this.k)
      {
        paramString3 = new TextView(paramContext);
        paramString3.setTextSize(1, 16.0F);
        paramString3.setTextColor(-14540254);
        paramString3.setText(paramString2);
        paramString3.setSingleLine(true);
        paramString3.setTypeface(org.vidogram.messenger.a.a("fonts/rmedium.ttf"));
        paramString3.setEllipsize(TextUtils.TruncateAt.END);
        paramString3.setPadding(org.vidogram.messenger.a.a(18.0F), 0, org.vidogram.messenger.a.a(18.0F), 0);
        addView(paramString3, v.a(-1, -2.0F, 83, 0.0F, 0.0F, 0.0F, 77.0F));
      }
      paramString2 = new TextView(paramContext);
      paramString2.setTextSize(1, 14.0F);
      paramString2.setTextColor(-7697782);
      paramString2.setText(paramString1);
      paramString2.setSingleLine(true);
      paramString2.setEllipsize(TextUtils.TruncateAt.END);
      paramString2.setPadding(org.vidogram.messenger.a.a(18.0F), 0, org.vidogram.messenger.a.a(18.0F), 0);
      addView(paramString2, v.a(-1, -2.0F, 83, 0.0F, 0.0F, 0.0F, 57.0F));
      paramString1 = new View(paramContext);
      paramString1.setBackgroundColor(-2368549);
      addView(paramString1, new FrameLayout.LayoutParams(-1, 1, 83));
      ((FrameLayout.LayoutParams)paramString1.getLayoutParams()).bottomMargin = org.vidogram.messenger.a.a(48.0F);
      paramString2 = new FrameLayout(paramContext);
      paramString2.setBackgroundColor(-1);
      addView(paramString2, v.b(-1, 48, 83));
      paramString1 = new TextView(paramContext);
      paramString1.setTextSize(1, 14.0F);
      paramString1.setTextColor(-15095832);
      paramString1.setGravity(17);
      paramString1.setBackgroundDrawable(l.a(788529152, false));
      paramString1.setPadding(org.vidogram.messenger.a.a(18.0F), 0, org.vidogram.messenger.a.a(18.0F), 0);
      paramString1.setText(r.a("Close", 2131231072).toUpperCase());
      paramString1.setTypeface(org.vidogram.messenger.a.a("fonts/rmedium.ttf"));
      paramString2.addView(paramString1, v.b(-2, -1, 51));
      paramString1.setOnClickListener(new View.OnClickListener()
      {
        public void onClick(View paramView)
        {
          if (bt.b(bt.this) != null)
            bt.b(bt.this).dismiss();
        }
      });
      paramString1 = new LinearLayout(paramContext);
      paramString1.setOrientation(0);
      paramString2.addView(paramString1, v.b(-2, -1, 53));
      paramString2 = new TextView(paramContext);
      paramString2.setTextSize(1, 14.0F);
      paramString2.setTextColor(-15095832);
      paramString2.setGravity(17);
      paramString2.setBackgroundDrawable(l.a(788529152, false));
      paramString2.setPadding(org.vidogram.messenger.a.a(18.0F), 0, org.vidogram.messenger.a.a(18.0F), 0);
      paramString2.setText(r.a("Copy", 2131231088).toUpperCase());
      paramString2.setTypeface(org.vidogram.messenger.a.a("fonts/rmedium.ttf"));
      paramString1.addView(paramString2, v.b(-2, -1, 51));
      paramString2.setOnClickListener(new View.OnClickListener()
      {
        public void onClick(View paramView)
        {
          try
          {
            ((ClipboardManager)ApplicationLoader.a.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", bt.f(bt.this)));
            Toast.makeText(bt.this.getContext(), r.a("LinkCopied", 2131231383), 0).show();
            if (bt.b(bt.this) != null)
              bt.b(bt.this).dismiss();
            return;
          }
          catch (Exception paramView)
          {
            while (true)
              n.a("tmessages", paramView);
          }
        }
      });
      paramContext = new TextView(paramContext);
      paramContext.setTextSize(1, 14.0F);
      paramContext.setTextColor(-15095832);
      paramContext.setGravity(17);
      paramContext.setBackgroundDrawable(l.a(788529152, false));
      paramContext.setPadding(org.vidogram.messenger.a.a(18.0F), 0, org.vidogram.messenger.a.a(18.0F), 0);
      paramContext.setText(r.a("OpenInBrowser", 2131231617).toUpperCase());
      paramContext.setTypeface(org.vidogram.messenger.a.a("fonts/rmedium.ttf"));
      paramString1.addView(paramContext, v.b(-2, -1, 51));
      paramContext.setOnClickListener(new View.OnClickListener()
      {
        public void onClick(View paramView)
        {
          org.vidogram.messenger.b.a.a(bt.this.getContext(), bt.f(bt.this));
          if (bt.b(bt.this) != null)
            bt.b(bt.this).dismiss();
        }
      });
      setOnTouchListener(new View.OnTouchListener()
      {
        public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
        {
          return true;
        }
      });
      paramh.a(new h.b()
      {
        // ERROR //
        public void d_()
        {
          // Byte code:
          //   0: iconst_0
          //   1: istore_2
          //   2: iconst_1
          //   3: istore 4
          //   5: iconst_1
          //   6: istore_3
          //   7: new 23	java/util/HashMap
          //   10: dup
          //   11: invokespecial 24	java/util/HashMap:<init>	()V
          //   14: astore 6
          //   16: aload 6
          //   18: ldc 26
          //   20: ldc 28
          //   22: invokevirtual 32	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
          //   25: pop
          //   26: aload_0
          //   27: getfield 14	org/vidogram/ui/Components/bt$7:a	Lorg/vidogram/ui/Components/bt;
          //   30: invokestatic 36	org/vidogram/ui/Components/bt:f	(Lorg/vidogram/ui/Components/bt;)Ljava/lang/String;
          //   33: invokestatic 42	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
          //   36: invokevirtual 46	android/net/Uri:getHost	()Ljava/lang/String;
          //   39: invokevirtual 51	java/lang/String:toLowerCase	()Ljava/lang/String;
          //   42: astore 5
          //   44: aload 5
          //   46: ifnull +13 -> 59
          //   49: aload 5
          //   51: ldc 53
          //   53: invokevirtual 57	java/lang/String:endsWith	(Ljava/lang/String;)Z
          //   56: ifne +15 -> 71
          //   59: iload_2
          //   60: istore_1
          //   61: aload 5
          //   63: ldc 59
          //   65: invokevirtual 57	java/lang/String:endsWith	(Ljava/lang/String;)Z
          //   68: ifeq +75 -> 143
          //   71: getstatic 62	org/vidogram/ui/Components/bt:a	Ljava/util/regex/Pattern;
          //   74: aload_0
          //   75: getfield 14	org/vidogram/ui/Components/bt$7:a	Lorg/vidogram/ui/Components/bt;
          //   78: invokestatic 36	org/vidogram/ui/Components/bt:f	(Lorg/vidogram/ui/Components/bt;)Ljava/lang/String;
          //   81: invokevirtual 68	java/util/regex/Pattern:matcher	(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
          //   84: astore 5
          //   86: aload 5
          //   88: invokevirtual 74	java/util/regex/Matcher:find	()Z
          //   91: ifeq +108 -> 199
          //   94: aload 5
          //   96: iconst_1
          //   97: invokevirtual 78	java/util/regex/Matcher:group	(I)Ljava/lang/String;
          //   100: astore 5
          //   102: iload_2
          //   103: istore_1
          //   104: aload 5
          //   106: ifnull +37 -> 143
          //   109: aload_0
          //   110: getfield 14	org/vidogram/ui/Components/bt$7:a	Lorg/vidogram/ui/Components/bt;
          //   113: invokestatic 82	org/vidogram/ui/Components/bt:g	(Lorg/vidogram/ui/Components/bt;)Landroid/webkit/WebView;
          //   116: ldc 28
          //   118: ldc 84
          //   120: iconst_1
          //   121: anewarray 86	java/lang/Object
          //   124: dup
          //   125: iconst_0
          //   126: aload 5
          //   128: aastore
          //   129: invokestatic 90	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
          //   132: ldc 92
          //   134: ldc 94
          //   136: ldc 28
          //   138: invokevirtual 100	android/webkit/WebView:loadDataWithBaseURL	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
          //   141: iload_3
          //   142: istore_1
          //   143: iload_1
          //   144: ifne +22 -> 166
          //   147: aload_0
          //   148: getfield 14	org/vidogram/ui/Components/bt$7:a	Lorg/vidogram/ui/Components/bt;
          //   151: invokestatic 82	org/vidogram/ui/Components/bt:g	(Lorg/vidogram/ui/Components/bt;)Landroid/webkit/WebView;
          //   154: aload_0
          //   155: getfield 14	org/vidogram/ui/Components/bt$7:a	Lorg/vidogram/ui/Components/bt;
          //   158: invokestatic 103	org/vidogram/ui/Components/bt:h	(Lorg/vidogram/ui/Components/bt;)Ljava/lang/String;
          //   161: aload 6
          //   163: invokevirtual 107	android/webkit/WebView:loadUrl	(Ljava/lang/String;Ljava/util/Map;)V
          //   166: return
          //   167: astore 5
          //   169: iconst_0
          //   170: istore_1
          //   171: ldc 109
          //   173: aload 5
          //   175: invokestatic 114	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
          //   178: goto -35 -> 143
          //   181: astore 5
          //   183: ldc 109
          //   185: aload 5
          //   187: invokestatic 114	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
          //   190: return
          //   191: astore 5
          //   193: iload 4
          //   195: istore_1
          //   196: goto -25 -> 171
          //   199: aconst_null
          //   200: astore 5
          //   202: goto -100 -> 102
          //
          // Exception table:
          //   from	to	target	type
          //   26	44	167	java/lang/Exception
          //   49	59	167	java/lang/Exception
          //   61	71	167	java/lang/Exception
          //   71	102	167	java/lang/Exception
          //   147	166	181	java/lang/Exception
          //   109	141	191	java/lang/Exception
        }
      });
      return;
      bool = false;
      break;
      paramInt1 = 0;
      break label343;
    }
  }

  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    try
    {
      removeView(this.b);
      this.b.stopLoading();
      this.b.loadUrl("about:blank");
      this.b.destroy();
      return;
    }
    catch (Exception localException)
    {
      n.a("tmessages", localException);
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    paramInt2 = View.MeasureSpec.getSize(paramInt1);
    float f1 = this.h / paramInt2;
    int n = (int)Math.min(this.i / f1, org.vidogram.messenger.a.c.y / 2);
    if (this.k);
    for (paramInt2 = 22; ; paramInt2 = 0)
    {
      super.onMeasure(paramInt1, View.MeasureSpec.makeMeasureSpec(org.vidogram.messenger.a.a(paramInt2 + 84) + n + 1, 1073741824));
      return;
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.Components.bt
 * JD-Core Version:    0.6.0
 */