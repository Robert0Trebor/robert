package org.vidogram.ui;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.Build.VERSION;
import android.text.Editable;
import android.util.Base64;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ProgressBar;
import android.widget.TextView;
import java.io.File;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;
import org.vidogram.messenger.ApplicationLoader;
import org.vidogram.messenger.MediaController.a;
import org.vidogram.messenger.MediaController.i;
import org.vidogram.messenger.MediaController.j;
import org.vidogram.messenger.ad;
import org.vidogram.messenger.g.a.h;
import org.vidogram.messenger.g.a.k;
import org.vidogram.messenger.g.n.a;
import org.vidogram.messenger.g.n.b;
import org.vidogram.messenger.g.s;
import org.vidogram.messenger.n;
import org.vidogram.messenger.r;
import org.vidogram.messenger.u;
import org.vidogram.messenger.w;
import org.vidogram.messenger.y;
import org.vidogram.messenger.y.b;
import org.vidogram.tgnet.ConnectionsManager;
import org.vidogram.tgnet.g.az;
import org.vidogram.tgnet.g.q;
import org.vidogram.tgnet.g.qu;
import org.vidogram.tgnet.g.vw;
import org.vidogram.tgnet.g.x;
import org.vidogram.ui.Components.BackupImageView;
import org.vidogram.ui.Components.i;
import org.vidogram.ui.a.a.a;
import org.vidogram.ui.a.d.b;
import org.vidogram.ui.a.g;
import org.vidogram.ui.c.ai;

public class al extends g
  implements y.b, am.d
{
  private GridView A;
  private a B;
  private org.vidogram.ui.Components.am C;
  private FrameLayout D;
  private TextView E;
  private org.vidogram.ui.a.d F;
  private int G = 100;
  private boolean H;
  private boolean I;
  private q J;
  private b K;
  private org.vidogram.messenger.g.m i;
  private int j;
  private HashMap<String, MediaController.j> k;
  private HashMap<Integer, MediaController.i> l;
  private ArrayList<MediaController.j> m;
  private ArrayList<MediaController.j> n = new ArrayList();
  private HashMap<String, MediaController.j> o = new HashMap();
  private HashMap<String, MediaController.j> p = new HashMap();
  private boolean q;
  private String r;
  private boolean s = true;
  private String t;
  private boolean u;
  private int v;
  private int w;
  private int x;
  private boolean y = true;
  private MediaController.a z;

  public al(int paramInt, MediaController.a parama, HashMap<Integer, MediaController.i> paramHashMap, HashMap<String, MediaController.j> paramHashMap1, ArrayList<MediaController.j> paramArrayList, boolean paramBoolean1, boolean paramBoolean2, q paramq)
  {
    this.z = parama;
    this.l = paramHashMap;
    this.k = paramHashMap1;
    this.j = paramInt;
    this.m = paramArrayList;
    this.I = paramBoolean1;
    this.J = paramq;
    this.y = paramBoolean2;
    if ((parama != null) && (parama.f))
      this.I = true;
  }

  private void a(String paramString, int paramInt)
  {
    if (this.q)
    {
      this.q = false;
      if (this.w != 0)
      {
        ConnectionsManager.a().a(this.w, true);
        this.w = 0;
      }
      this.i.a("search");
    }
    this.q = true;
    g.qu localqu = new g.qu();
    localqu.c = paramString;
    localqu.d = paramInt;
    paramInt = this.x + 1;
    this.x = paramInt;
    this.w = ConnectionsManager.a().a(localqu, new org.vidogram.tgnet.c(paramInt, paramString)
    {
    });
    ConnectionsManager.a().a(this.w, this.e);
  }

  private void a(String paramString, int paramInt1, int paramInt2)
  {
    int i2 = 1;
    if (this.q)
    {
      this.q = false;
      if (this.w != 0)
      {
        ConnectionsManager.a().a(this.w, true);
        this.w = 0;
      }
      this.i.a("search");
    }
    while (true)
    {
      try
      {
        this.q = true;
        if (this.r == null)
          continue;
        paramString = this.r;
        paramString = new h(0, paramString, null, new n.b()
        {
          // ERROR //
          public void a(JSONObject paramJSONObject)
          {
            // Byte code:
            //   0: aload_0
            //   1: getfield 17	org/vidogram/ui/al$2:a	Lorg/vidogram/ui/al;
            //   4: aconst_null
            //   5: invokestatic 33	org/vidogram/ui/al:b	(Lorg/vidogram/ui/al;Ljava/lang/String;)Ljava/lang/String;
            //   8: pop
            //   9: aload_1
            //   10: ldc 35
            //   12: invokevirtual 39	org/json/JSONObject:getJSONObject	(Ljava/lang/String;)Lorg/json/JSONObject;
            //   15: astore 5
            //   17: aload 5
            //   19: ldc 41
            //   21: invokevirtual 45	org/json/JSONObject:getJSONArray	(Ljava/lang/String;)Lorg/json/JSONArray;
            //   24: astore_1
            //   25: aload_0
            //   26: getfield 17	org/vidogram/ui/al$2:a	Lorg/vidogram/ui/al;
            //   29: aload 5
            //   31: ldc 47
            //   33: invokevirtual 51	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
            //   36: invokestatic 33	org/vidogram/ui/al:b	(Lorg/vidogram/ui/al;Ljava/lang/String;)Ljava/lang/String;
            //   39: pop
            //   40: iconst_0
            //   41: istore_2
            //   42: aload_1
            //   43: invokevirtual 57	org/json/JSONArray:length	()I
            //   46: istore_3
            //   47: iload_2
            //   48: iload_3
            //   49: if_icmpge +76 -> 125
            //   52: aload_1
            //   53: iload_2
            //   54: invokevirtual 60	org/json/JSONArray:getJSONObject	(I)Lorg/json/JSONObject;
            //   57: astore 5
            //   59: aload 5
            //   61: ldc 62
            //   63: invokevirtual 51	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
            //   66: invokestatic 67	org/vidogram/messenger/Utilities:e	(Ljava/lang/String;)Ljava/lang/String;
            //   69: astore 6
            //   71: aload_0
            //   72: getfield 17	org/vidogram/ui/al$2:a	Lorg/vidogram/ui/al;
            //   75: invokestatic 70	org/vidogram/ui/al:b	(Lorg/vidogram/ui/al;)Ljava/util/HashMap;
            //   78: aload 6
            //   80: invokevirtual 76	java/util/HashMap:containsKey	(Ljava/lang/Object;)Z
            //   83: istore 4
            //   85: iload 4
            //   87: ifeq +113 -> 200
            //   90: iload_2
            //   91: iconst_1
            //   92: iadd
            //   93: istore_2
            //   94: goto -52 -> 42
            //   97: astore 5
            //   99: aload_0
            //   100: getfield 17	org/vidogram/ui/al$2:a	Lorg/vidogram/ui/al;
            //   103: aconst_null
            //   104: invokestatic 33	org/vidogram/ui/al:b	(Lorg/vidogram/ui/al;Ljava/lang/String;)Ljava/lang/String;
            //   107: pop
            //   108: ldc 78
            //   110: aload 5
            //   112: invokestatic 83	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
            //   115: goto -75 -> 40
            //   118: astore_1
            //   119: ldc 78
            //   121: aload_1
            //   122: invokestatic 83	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
            //   125: aload_0
            //   126: getfield 17	org/vidogram/ui/al$2:a	Lorg/vidogram/ui/al;
            //   129: iconst_0
            //   130: invokestatic 86	org/vidogram/ui/al:b	(Lorg/vidogram/ui/al;Z)Z
            //   133: pop
            //   134: aload_0
            //   135: getfield 17	org/vidogram/ui/al$2:a	Lorg/vidogram/ui/al;
            //   138: invokestatic 90	org/vidogram/ui/al:p	(Lorg/vidogram/ui/al;)Ljava/lang/String;
            //   141: ifnull +51 -> 192
            //   144: aload_0
            //   145: getfield 17	org/vidogram/ui/al$2:a	Lorg/vidogram/ui/al;
            //   148: invokestatic 90	org/vidogram/ui/al:p	(Lorg/vidogram/ui/al;)Ljava/lang/String;
            //   151: ldc 92
            //   153: invokevirtual 98	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
            //   156: ifne +36 -> 192
            //   159: aload_0
            //   160: getfield 17	org/vidogram/ui/al$2:a	Lorg/vidogram/ui/al;
            //   163: new 100	java/lang/StringBuilder
            //   166: dup
            //   167: invokespecial 101	java/lang/StringBuilder:<init>	()V
            //   170: aload_0
            //   171: getfield 17	org/vidogram/ui/al$2:a	Lorg/vidogram/ui/al;
            //   174: invokestatic 90	org/vidogram/ui/al:p	(Lorg/vidogram/ui/al;)Ljava/lang/String;
            //   177: invokevirtual 105	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
            //   180: ldc 107
            //   182: invokevirtual 105	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
            //   185: invokevirtual 111	java/lang/StringBuilder:toString	()Ljava/lang/String;
            //   188: invokestatic 33	org/vidogram/ui/al:b	(Lorg/vidogram/ui/al;Ljava/lang/String;)Ljava/lang/String;
            //   191: pop
            //   192: aload_0
            //   193: getfield 17	org/vidogram/ui/al$2:a	Lorg/vidogram/ui/al;
            //   196: invokestatic 114	org/vidogram/ui/al:f	(Lorg/vidogram/ui/al;)V
            //   199: return
            //   200: new 116	org/vidogram/messenger/MediaController$j
            //   203: dup
            //   204: invokespecial 117	org/vidogram/messenger/MediaController$j:<init>	()V
            //   207: astore 7
            //   209: aload 7
            //   211: aload 6
            //   213: putfield 120	org/vidogram/messenger/MediaController$j:a	Ljava/lang/String;
            //   216: aload 7
            //   218: aload 5
            //   220: ldc 122
            //   222: invokevirtual 126	org/json/JSONObject:getInt	(Ljava/lang/String;)I
            //   225: putfield 129	org/vidogram/messenger/MediaController$j:e	I
            //   228: aload 7
            //   230: aload 5
            //   232: ldc 131
            //   234: invokevirtual 126	org/json/JSONObject:getInt	(Ljava/lang/String;)I
            //   237: putfield 133	org/vidogram/messenger/MediaController$j:f	I
            //   240: aload 7
            //   242: aload 5
            //   244: ldc 135
            //   246: invokevirtual 126	org/json/JSONObject:getInt	(Ljava/lang/String;)I
            //   249: putfield 138	org/vidogram/messenger/MediaController$j:g	I
            //   252: aload 7
            //   254: aload 5
            //   256: ldc 62
            //   258: invokevirtual 51	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
            //   261: putfield 140	org/vidogram/messenger/MediaController$j:b	Ljava/lang/String;
            //   264: aload 7
            //   266: aload 5
            //   268: ldc 142
            //   270: invokevirtual 39	org/json/JSONObject:getJSONObject	(Ljava/lang/String;)Lorg/json/JSONObject;
            //   273: ldc 62
            //   275: invokevirtual 51	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
            //   278: putfield 145	org/vidogram/messenger/MediaController$j:c	Ljava/lang/String;
            //   281: aload_0
            //   282: getfield 17	org/vidogram/ui/al$2:a	Lorg/vidogram/ui/al;
            //   285: invokestatic 148	org/vidogram/ui/al:a	(Lorg/vidogram/ui/al;)Ljava/util/ArrayList;
            //   288: aload 7
            //   290: invokevirtual 153	java/util/ArrayList:add	(Ljava/lang/Object;)Z
            //   293: pop
            //   294: aload_0
            //   295: getfield 17	org/vidogram/ui/al$2:a	Lorg/vidogram/ui/al;
            //   298: invokestatic 70	org/vidogram/ui/al:b	(Lorg/vidogram/ui/al;)Ljava/util/HashMap;
            //   301: aload 6
            //   303: aload 7
            //   305: invokevirtual 157	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
            //   308: pop
            //   309: goto -219 -> 90
            //   312: astore 5
            //   314: ldc 78
            //   316: aload 5
            //   318: invokestatic 83	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
            //   321: goto -231 -> 90
            //
            // Exception table:
            //   from	to	target	type
            //   25	40	97	java/lang/Exception
            //   9	25	118	java/lang/Exception
            //   42	47	118	java/lang/Exception
            //   99	115	118	java/lang/Exception
            //   314	321	118	java/lang/Exception
            //   52	85	312	java/lang/Exception
            //   200	309	312	java/lang/Exception
          }
        }
        , new n.a()
        {
          public void a(s params)
          {
            n.a("tmessages", "Error: " + params.getMessage());
            al.b(al.this, null);
            al.b(al.this, false);
            al.f(al.this);
          }
        })
        {
          public Map<String, String> i()
          {
            HashMap localHashMap = new HashMap();
            localHashMap.put("Authorization", "Basic " + Base64.encodeToString(new StringBuilder().append(org.vidogram.messenger.d.j).append(":").append(org.vidogram.messenger.d.j).toString().getBytes(), 2));
            return localHashMap;
          }
        };
        paramString.a(false);
        paramString.a("search");
        this.i.a(paramString);
        return;
        Object localObject = ad.d().i;
        i1 = i2;
        if (((String)localObject).startsWith("44"))
          continue;
        i1 = i2;
        if (((String)localObject).startsWith("49"))
          continue;
        i1 = i2;
        if (((String)localObject).startsWith("43"))
          continue;
        i1 = i2;
        if (((String)localObject).startsWith("31"))
          continue;
        if (((String)localObject).startsWith("1"))
        {
          i1 = i2;
          localObject = Locale.US;
          String str = URLEncoder.encode(paramString, "UTF-8");
          if (i1 == 0)
            continue;
          paramString = "";
          paramString = String.format((Locale)localObject, "https://api.datamarket.azure.com/Bing/Search/v1/Image?Query='%s'&$skip=%d&$top=%d&$format=json%s", new Object[] { str, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
          continue;
          paramString = "&Adult='Off'";
          continue;
        }
      }
      catch (java.lang.Exception paramString)
      {
        n.a("tmessages", paramString);
        this.r = null;
        this.q = false;
        q();
        return;
      }
      int i1 = 0;
    }
  }

  private ai e(int paramInt)
  {
    int i2 = this.A.getChildCount();
    int i1 = 0;
    if (i1 < i2)
    {
      Object localObject = this.A.getChildAt(i1);
      ai localai;
      int i3;
      if ((localObject instanceof ai))
      {
        localai = (ai)localObject;
        i3 = ((Integer)localai.a.getTag()).intValue();
        if (this.z == null)
          break label90;
        if ((i3 >= 0) && (i3 < this.z.d.size()))
          break label128;
      }
      label128: label144: 
      while (true)
      {
        i1 += 1;
        break;
        label90: if ((this.n.isEmpty()) && (this.t == null));
        for (localObject = this.m; ; localObject = this.n)
        {
          if ((i3 < 0) || (i3 >= ((ArrayList)localObject).size()))
            break label144;
          if (i3 != paramInt)
            break;
          return localai;
        }
      }
    }
    return (ai)null;
  }

  private void q()
  {
    if (this.B != null)
      this.B.notifyDataSetChanged();
    if (((this.q) && (this.n.isEmpty())) || ((this.u) && (this.t == null)))
    {
      this.D.setVisibility(0);
      this.A.setEmptyView(null);
      this.E.setVisibility(8);
      return;
    }
    this.D.setVisibility(8);
    this.E.setVisibility(0);
    this.A.setEmptyView(this.E);
  }

  private void r()
  {
    if (((this.l.isEmpty()) && (this.k.isEmpty())) || (this.K == null) || (this.H))
      return;
    this.H = true;
    this.K.a(false);
    d();
  }

  private void s()
  {
    if (this.A != null)
      this.A.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener()
      {
        public boolean onPreDraw()
        {
          al.u(al.this);
          if (al.v(al.this) != null)
            al.v(al.this).getViewTreeObserver().removeOnPreDrawListener(this);
          return true;
        }
      });
  }

  private void t()
  {
    if (l() == null)
      return;
    int i2 = this.A.getFirstVisiblePosition();
    int i1 = ((WindowManager)ApplicationLoader.a.getSystemService("window")).getDefaultDisplay().getRotation();
    if (org.vidogram.messenger.a.c())
    {
      i1 = 3;
      label45: this.A.setNumColumns(i1);
      if (!org.vidogram.messenger.a.c())
        break label162;
    }
    label162: for (this.G = ((org.vidogram.messenger.a.a(490.0F) - (i1 + 1) * org.vidogram.messenger.a.a(4.0F)) / i1); ; this.G = ((org.vidogram.messenger.a.c.x - (i1 + 1) * org.vidogram.messenger.a.a(4.0F)) / i1))
    {
      this.A.setColumnWidth(this.G);
      this.B.notifyDataSetChanged();
      this.A.setSelection(i2);
      if (this.z != null)
        break;
      this.E.setPadding(0, 0, 0, (int)((org.vidogram.messenger.a.c.y - org.vidogram.ui.a.a.getCurrentActionBarHeight()) * 0.4F));
      return;
      if ((i1 == 3) || (i1 == 1))
      {
        i1 = 5;
        break label45;
      }
      i1 = 3;
      break label45;
    }
  }

  public int A()
  {
    return this.l.size() + this.k.size();
  }

  public View a(Context paramContext)
  {
    int i2 = 0;
    this.d.setBackgroundColor(-13421773);
    this.d.setItemsBackgroundColor(-12763843);
    this.d.setBackButtonImage(2130837794);
    label141: FrameLayout localFrameLayout;
    Object localObject1;
    label339: Object localObject2;
    if (this.z != null)
    {
      this.d.setTitle(this.z.b);
      this.d.setActionBarMenuOnItemClick(new a.a()
      {
        public void a(int paramInt)
        {
          if (paramInt == -1)
            al.this.d();
        }
      });
      if (this.z == null)
        this.F = this.d.a().b(0, 2130837806).d(true).a(new d.b()
        {
          public void a()
          {
          }

          public void a(EditText paramEditText)
          {
            if (paramEditText.getText().length() == 0)
            {
              al.a(al.this).clear();
              al.b(al.this).clear();
              al.a(al.this, null);
              al.b(al.this, null);
              al.a(al.this, true);
              al.b(al.this, false);
              al.c(al.this).a("search");
              if (al.d(al.this) != 0)
                break label115;
              al.e(al.this).setText(r.a("NoRecentPhotos", 2131231508));
            }
            while (true)
            {
              al.f(al.this);
              return;
              label115: if (al.d(al.this) != 1)
                continue;
              al.e(al.this).setText(r.a("NoRecentGIFs", 2131231507));
            }
          }

          public void b(EditText paramEditText)
          {
            if (paramEditText.getText().toString().length() == 0)
              return;
            al.a(al.this).clear();
            al.b(al.this).clear();
            al.b(al.this, null);
            al.a(al.this, true);
            if (al.d(al.this) == 0)
            {
              al.a(al.this, paramEditText.getText().toString(), 0, 53);
              al.a(al.this, paramEditText.getText().toString());
              if (al.g(al.this).length() != 0)
                break label220;
              al.a(al.this, null);
              if (al.d(al.this) != 0)
                break label189;
              al.e(al.this).setText(r.a("NoRecentPhotos", 2131231508));
            }
            while (true)
            {
              al.f(al.this);
              return;
              if (al.d(al.this) != 1)
                break;
              al.a(al.this, 0);
              al.a(al.this, paramEditText.getText().toString(), 0);
              break;
              label189: if (al.d(al.this) != 1)
                continue;
              al.e(al.this).setText(r.a("NoRecentGIFs", 2131231507));
              continue;
              label220: al.e(al.this).setText(r.a("NoResult", 2131231509));
            }
          }

          public boolean b()
          {
            al.this.d();
            return false;
          }
        });
      if (this.z == null)
      {
        if (this.j != 0)
          break label942;
        this.F.getSearchField().setHint(r.a("SearchImagesTitle", 2131231771));
      }
      this.b = new FrameLayout(paramContext);
      localFrameLayout = (FrameLayout)this.b;
      localFrameLayout.setBackgroundColor(-16777216);
      this.A = new GridView(paramContext);
      this.A.setPadding(org.vidogram.messenger.a.a(4.0F), org.vidogram.messenger.a.a(4.0F), org.vidogram.messenger.a.a(4.0F), org.vidogram.messenger.a.a(4.0F));
      this.A.setClipToPadding(false);
      this.A.setDrawSelectorOnTop(true);
      this.A.setStretchMode(2);
      this.A.setHorizontalScrollBarEnabled(false);
      this.A.setVerticalScrollBarEnabled(false);
      this.A.setNumColumns(-1);
      this.A.setVerticalSpacing(org.vidogram.messenger.a.a(4.0F));
      this.A.setHorizontalSpacing(org.vidogram.messenger.a.a(4.0F));
      this.A.setSelector(2130837946);
      localFrameLayout.addView(this.A);
      localObject1 = (FrameLayout.LayoutParams)this.A.getLayoutParams();
      ((FrameLayout.LayoutParams)localObject1).width = -1;
      ((FrameLayout.LayoutParams)localObject1).height = -1;
      if (!this.I)
        break label972;
      i1 = 0;
      ((FrameLayout.LayoutParams)localObject1).bottomMargin = i1;
      this.A.setLayoutParams((ViewGroup.LayoutParams)localObject1);
      localObject1 = this.A;
      localObject2 = new a(paramContext);
      this.B = ((a)localObject2);
      ((GridView)localObject1).setAdapter((ListAdapter)localObject2);
      org.vidogram.messenger.a.a(this.A, -13421773);
      this.A.setOnItemClickListener(new AdapterView.OnItemClickListener()
      {
        public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
        {
          if ((al.h(al.this) != null) && (al.h(al.this).f))
          {
            if ((paramInt < 0) || (paramInt >= al.h(al.this).d.size()));
            do
              return;
            while (!al.i(al.this).a(((MediaController.i)al.h(al.this).d.get(paramInt)).d));
            al.this.d();
            return;
          }
          if (al.h(al.this) != null)
          {
            paramAdapterView = al.h(al.this).d;
            label109: if ((paramInt < 0) || (paramInt >= paramAdapterView.size()))
              break label238;
            if (al.k(al.this) != null)
              org.vidogram.messenger.a.b(al.k(al.this).getSearchField());
            am.a().a(al.this.l());
            paramView = am.a();
            if (!al.l(al.this))
              break label240;
          }
          label238: label240: for (int i = 1; ; i = 0)
          {
            paramView.a(paramAdapterView, paramInt, i, al.this, al.m(al.this));
            return;
            if ((al.a(al.this).isEmpty()) && (al.g(al.this) == null))
            {
              paramAdapterView = al.j(al.this);
              break label109;
            }
            paramAdapterView = al.a(al.this);
            break label109;
            break;
          }
        }
      });
      if (this.z == null)
        this.A.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener()
        {
          public boolean onItemLongClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
          {
            if ((al.a(al.this).isEmpty()) && (al.g(al.this) == null))
            {
              paramAdapterView = new AlertDialog.Builder(al.this.l());
              paramAdapterView.setTitle(r.a("AppName", 2131230856));
              paramAdapterView.setMessage(r.a("ClearSearch", 2131231071));
              paramAdapterView.setPositiveButton(r.a("ClearButton", 2131231065).toUpperCase(), new DialogInterface.OnClickListener()
              {
                public void onClick(DialogInterface paramDialogInterface, int paramInt)
                {
                  al.j(al.this).clear();
                  if (al.n(al.this) != null)
                    al.n(al.this).notifyDataSetChanged();
                  w.a().c(al.d(al.this));
                }
              });
              paramAdapterView.setNegativeButton(r.a("Cancel", 2131230943), null);
              al.this.b(paramAdapterView.create());
              return true;
            }
            return false;
          }
        });
      this.E = new TextView(paramContext);
      this.E.setTextColor(-8355712);
      this.E.setTextSize(20.0F);
      this.E.setGravity(17);
      this.E.setVisibility(8);
      if (this.z == null)
        break label982;
      this.E.setText(r.a("NoPhotos", 2131231503));
      label504: localFrameLayout.addView(this.E);
      localObject1 = (FrameLayout.LayoutParams)this.E.getLayoutParams();
      ((FrameLayout.LayoutParams)localObject1).width = -1;
      ((FrameLayout.LayoutParams)localObject1).height = -1;
      if (!this.I)
        break label1035;
      i1 = 0;
      label546: ((FrameLayout.LayoutParams)localObject1).bottomMargin = i1;
      this.E.setLayoutParams((ViewGroup.LayoutParams)localObject1);
      this.E.setOnTouchListener(new View.OnTouchListener()
      {
        public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
        {
          return true;
        }
      });
      if (this.z == null)
      {
        this.A.setOnScrollListener(new AbsListView.OnScrollListener()
        {
          public void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
          {
            if ((paramInt2 != 0) && (paramInt1 + paramInt2 > paramInt3 - 2) && (!al.o(al.this)))
            {
              if ((al.d(al.this) != 0) || (al.p(al.this) == null))
                break label71;
              al.a(al.this, al.g(al.this), al.a(al.this).size(), 54);
            }
            label71: 
            do
              return;
            while ((al.d(al.this) != 1) || (al.q(al.this)));
            al.a(al.this, al.k(al.this).getSearchField().getText().toString(), al.r(al.this));
          }

          public void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
          {
            if (paramInt == 1)
              org.vidogram.messenger.a.b(al.this.l().getCurrentFocus());
          }
        });
        this.D = new FrameLayout(paramContext);
        this.D.setVisibility(8);
        localFrameLayout.addView(this.D);
        localObject1 = (FrameLayout.LayoutParams)this.D.getLayoutParams();
        ((FrameLayout.LayoutParams)localObject1).width = -1;
        ((FrameLayout.LayoutParams)localObject1).height = -1;
        if (!this.I)
          break label1045;
      }
    }
    label1035: label1045: for (int i1 = i2; ; i1 = org.vidogram.messenger.a.a(48.0F))
    {
      ((FrameLayout.LayoutParams)localObject1).bottomMargin = i1;
      this.D.setLayoutParams((ViewGroup.LayoutParams)localObject1);
      localObject1 = new ProgressBar(paramContext);
      this.D.addView((View)localObject1);
      localObject2 = (FrameLayout.LayoutParams)((ProgressBar)localObject1).getLayoutParams();
      ((FrameLayout.LayoutParams)localObject2).width = -2;
      ((FrameLayout.LayoutParams)localObject2).height = -2;
      ((FrameLayout.LayoutParams)localObject2).gravity = 17;
      ((ProgressBar)localObject1).setLayoutParams((ViewGroup.LayoutParams)localObject2);
      q();
      this.C = new org.vidogram.ui.Components.am(paramContext);
      localFrameLayout.addView(this.C);
      paramContext = (FrameLayout.LayoutParams)this.C.getLayoutParams();
      paramContext.width = -1;
      paramContext.height = org.vidogram.messenger.a.a(48.0F);
      paramContext.gravity = 80;
      this.C.setLayoutParams(paramContext);
      this.C.b.setOnClickListener(new View.OnClickListener()
      {
        public void onClick(View paramView)
        {
          al.i(al.this).a(true);
          al.this.d();
        }
      });
      this.C.a.setOnClickListener(new View.OnClickListener()
      {
        public void onClick(View paramView)
        {
          al.s(al.this);
        }
      });
      if (this.I)
        this.C.setVisibility(8);
      this.A.setEmptyView(this.E);
      this.C.a(this.l.size() + this.k.size(), true);
      return this.b;
      if (this.j == 0)
      {
        this.d.setTitle(r.a("SearchImagesTitle", 2131231771));
        break;
      }
      if (this.j != 1)
        break;
      this.d.setTitle(r.a("SearchGifsTitle", 2131231768));
      break;
      label942: if (this.j != 1)
        break label141;
      this.F.getSearchField().setHint(r.a("SearchGifsTitle", 2131231768));
      break label141;
      label972: i1 = org.vidogram.messenger.a.a(48.0F);
      break label339;
      label982: if (this.j == 0)
      {
        this.E.setText(r.a("NoRecentPhotos", 2131231508));
        break label504;
      }
      if (this.j != 1)
        break label504;
      this.E.setText(r.a("NoRecentGIFs", 2131231507));
      break label504;
      i1 = org.vidogram.messenger.a.a(48.0F);
      break label546;
    }
  }

  public am.e a(u paramu, g.x paramx, int paramInt)
  {
    int i1 = 0;
    paramu = e(paramInt);
    if (paramu != null)
    {
      paramx = new int[2];
      paramu.a.getLocationInWindow(paramx);
      am.e locale = new am.e();
      locale.b = paramx[0];
      int i2 = paramx[1];
      if (Build.VERSION.SDK_INT >= 21);
      for (paramInt = i1; ; paramInt = org.vidogram.messenger.a.a)
      {
        locale.c = (i2 - paramInt);
        locale.d = this.A;
        locale.a = paramu.a.getImageReceiver();
        locale.e = locale.a.h();
        locale.k = paramu.a.getScaleX();
        paramu.c.setVisibility(8);
        return locale;
      }
    }
    return null;
  }

  public void a(int paramInt, Object[] paramArrayOfObject)
  {
    if (paramInt == y.d)
      e();
    do
      return;
    while ((paramInt != y.F) || (this.z != null) || (this.j != ((Integer)paramArrayOfObject[0]).intValue()));
    this.m = ((ArrayList)paramArrayOfObject[1]);
    this.u = false;
    q();
  }

  public void a(Configuration paramConfiguration)
  {
    super.a(paramConfiguration);
    s();
  }

  public void a(b paramb)
  {
    this.K = paramb;
  }

  public void a_(int paramInt)
  {
    ai localai = e(paramInt);
    if (localai != null)
    {
      if (this.z == null)
        break label227;
      localai.a.a(0, true);
      localObject = (MediaController.i)this.z.d.get(paramInt);
      if (((MediaController.i)localObject).f != null)
        localai.a.a(((MediaController.i)localObject).f, null, localai.getContext().getResources().getDrawable(2130838008));
    }
    else
    {
      return;
    }
    if (((MediaController.i)localObject).d != null)
    {
      localai.a.a(((MediaController.i)localObject).e, true);
      if (((MediaController.i)localObject).h)
      {
        localai.a.a("vthumb://" + ((MediaController.i)localObject).b + ":" + ((MediaController.i)localObject).d, null, localai.getContext().getResources().getDrawable(2130838008));
        return;
      }
      localai.a.a("thumb://" + ((MediaController.i)localObject).b + ":" + ((MediaController.i)localObject).d, null, localai.getContext().getResources().getDrawable(2130838008));
      return;
    }
    localai.a.setImageResource(2130838008);
    return;
    label227: if ((this.n.isEmpty()) && (this.t == null));
    for (Object localObject = this.m; ; localObject = this.n)
    {
      localObject = (MediaController.j)((ArrayList)localObject).get(paramInt);
      if ((((MediaController.j)localObject).m == null) || (((MediaController.j)localObject).m.i == null))
        break;
      localai.a.a(((MediaController.j)localObject).m.i.c, null, localai.getContext().getResources().getDrawable(2130838008));
      return;
    }
    if (((MediaController.j)localObject).j != null)
    {
      localai.a.a(((MediaController.j)localObject).j, null, localai.getContext().getResources().getDrawable(2130838008));
      return;
    }
    if ((((MediaController.j)localObject).c != null) && (((MediaController.j)localObject).c.length() > 0))
    {
      localai.a.a(((MediaController.j)localObject).c, null, localai.getContext().getResources().getDrawable(2130838008));
      return;
    }
    localai.a.setImageResource(2130838008);
  }

  public Bitmap b(u paramu, g.x paramx, int paramInt)
  {
    paramu = e(paramInt);
    if (paramu != null)
      return paramu.a.getImageReceiver().h();
    return null;
  }

  public void b(boolean paramBoolean1, boolean paramBoolean2)
  {
    if ((paramBoolean1) && (this.F != null))
      org.vidogram.messenger.a.a(this.F.getSearchField());
  }

  public boolean b(int paramInt)
  {
    int i1 = 1;
    if (this.z != null)
      return (paramInt >= 0) && (paramInt < this.z.d.size()) && (this.l.containsKey(Integer.valueOf(((MediaController.i)this.z.d.get(paramInt)).b)));
    ArrayList localArrayList;
    if ((this.n.isEmpty()) && (this.t == null))
    {
      localArrayList = this.m;
      if ((paramInt < 0) || (paramInt >= localArrayList.size()) || (!this.k.containsKey(((MediaController.j)localArrayList.get(paramInt)).a)))
        break label126;
    }
    while (true)
    {
      return i1;
      localArrayList = this.n;
      break;
      label126: i1 = 0;
    }
  }

  public void c(int paramInt)
  {
    Object localObject;
    boolean bool;
    label79: int i2;
    int i1;
    if (this.z != null)
    {
      if ((paramInt < 0) || (paramInt >= this.z.d.size()))
        return;
      localObject = (MediaController.i)this.z.d.get(paramInt);
      if (this.l.containsKey(Integer.valueOf(((MediaController.i)localObject).b)))
      {
        this.l.remove(Integer.valueOf(((MediaController.i)localObject).b));
        bool = false;
        i2 = this.A.getChildCount();
        i1 = 0;
      }
    }
    while (true)
    {
      if (i1 < i2)
      {
        localObject = this.A.getChildAt(i1);
        if (((Integer)((View)localObject).getTag()).intValue() == paramInt)
          ((ai)localObject).a(bool, false);
      }
      else
      {
        this.C.a(this.l.size() + this.k.size(), true);
        this.K.a();
        return;
        this.l.put(Integer.valueOf(((MediaController.i)localObject).b), localObject);
        bool = true;
        break label79;
        if ((this.n.isEmpty()) && (this.t == null));
        for (localObject = this.m; ; localObject = this.n)
        {
          if ((paramInt < 0) || (paramInt >= ((ArrayList)localObject).size()))
            break label275;
          localObject = (MediaController.j)((ArrayList)localObject).get(paramInt);
          if (!this.k.containsKey(((MediaController.j)localObject).a))
            break label277;
          this.k.remove(((MediaController.j)localObject).a);
          bool = false;
          break;
        }
        label275: break;
        label277: this.k.put(((MediaController.j)localObject).a, localObject);
        bool = true;
        break label79;
      }
      i1 += 1;
    }
  }

  public void c(u paramu, g.x paramx, int paramInt)
  {
    int i2 = this.A.getChildCount();
    int i1 = 0;
    if (i1 < i2)
    {
      paramu = this.A.getChildAt(i1);
      if (paramu.getTag() == null)
        break label89;
    }
    label149: 
    while (true)
    {
      label36: i1 += 1;
      break;
      paramx = (ai)paramu;
      int i3 = ((Integer)paramu.getTag()).intValue();
      if (this.z != null)
      {
        if ((i3 < 0) || (i3 >= this.z.d.size()))
          continue;
        label89: if (i3 != paramInt)
          continue;
        paramx.c.setVisibility(0);
        return;
      }
      if ((this.n.isEmpty()) && (this.t == null));
      for (paramu = this.m; ; paramu = this.n)
      {
        if (i3 < 0)
          break label149;
        if (i3 < paramu.size())
          break;
        break label36;
      }
    }
  }

  public void d(int paramInt)
  {
    if (this.z != null)
      if (this.l.isEmpty())
        if ((paramInt >= 0) && (paramInt < this.z.d.size()));
    label147: 
    while (true)
    {
      return;
      Object localObject = (MediaController.i)this.z.d.get(paramInt);
      this.l.put(Integer.valueOf(((MediaController.i)localObject).b), localObject);
      do
      {
        r();
        return;
      }
      while (!this.l.isEmpty());
      if ((this.n.isEmpty()) && (this.t == null));
      for (localObject = this.m; ; localObject = this.n)
      {
        if ((paramInt < 0) || (paramInt >= ((ArrayList)localObject).size()))
          break label147;
        localObject = (MediaController.j)((ArrayList)localObject).get(paramInt);
        this.k.put(((MediaController.j)localObject).a, localObject);
        break;
      }
    }
  }

  public boolean f()
  {
    y.a().a(this, y.d);
    y.a().a(this, y.F);
    if (this.z == null)
    {
      this.i = k.a(ApplicationLoader.a);
      if (this.m.isEmpty())
      {
        w.a().b(this.j);
        this.u = true;
      }
    }
    return super.f();
  }

  public void g()
  {
    y.a().b(this, y.d);
    y.a().b(this, y.F);
    if (this.i != null)
    {
      this.i.a("search");
      this.i.b();
    }
    super.g();
  }

  public void i()
  {
    super.i();
    if (this.B != null)
      this.B.notifyDataSetChanged();
    if (this.F != null)
    {
      this.F.a(true);
      l().getWindow().setSoftInputMode(32);
    }
    s();
  }

  public boolean w()
  {
    return this.y;
  }

  public boolean x()
  {
    return false;
  }

  public void y()
  {
    if (this.B != null)
      this.B.notifyDataSetChanged();
  }

  public boolean z()
  {
    this.K.a(true);
    d();
    return true;
  }

  private class a extends org.vidogram.ui.b.a
  {
    private Context b;

    public a(Context arg2)
    {
      Object localObject;
      this.b = localObject;
    }

    public boolean areAllItemsEnabled()
    {
      return al.h(al.this) != null;
    }

    public int getCount()
    {
      int j = 0;
      int i = 0;
      if (al.h(al.this) == null)
      {
        if ((al.a(al.this).isEmpty()) && (al.g(al.this) == null))
          return al.j(al.this).size();
        if (al.d(al.this) == 0)
        {
          j = al.a(al.this).size();
          if (al.p(al.this) == null);
          while (true)
          {
            return i + j;
            i = 1;
          }
        }
        if (al.d(al.this) == 1)
        {
          int k = al.a(al.this).size();
          if (al.q(al.this));
          for (i = j; ; i = 1)
            return i + k;
        }
      }
      return al.h(al.this).d.size();
    }

    public Object getItem(int paramInt)
    {
      return null;
    }

    public long getItemId(int paramInt)
    {
      return paramInt;
    }

    public int getItemViewType(int paramInt)
    {
      if ((al.h(al.this) != null) || ((al.a(al.this).isEmpty()) && (al.g(al.this) == null) && (paramInt < al.j(al.this).size())) || (paramInt < al.a(al.this).size()))
        return 0;
      return 1;
    }

    public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      int j = 0;
      int i = getItemViewType(paramInt);
      Object localObject;
      if (i == 0)
      {
        paramViewGroup = (ai)paramView;
        if (paramView != null)
          break label784;
        paramView = new ai(this.b);
        paramViewGroup = (ai)paramView;
        paramViewGroup.b.setOnClickListener(new View.OnClickListener()
        {
          public void onClick(View paramView)
          {
            int i = ((Integer)((View)paramView.getParent()).getTag()).intValue();
            Object localObject;
            if (al.h(al.this) != null)
            {
              localObject = (MediaController.i)al.h(al.this).d.get(i);
              if (al.w(al.this).containsKey(Integer.valueOf(((MediaController.i)localObject).b)))
              {
                al.w(al.this).remove(Integer.valueOf(((MediaController.i)localObject).b));
                ((MediaController.i)localObject).g = null;
                ((MediaController.i)localObject).f = null;
                ((MediaController.i)localObject).j.clear();
                al.this.a_(i);
              }
              while (true)
              {
                ((ai)paramView.getParent()).a(al.w(al.this).containsKey(Integer.valueOf(((MediaController.i)localObject).b)), true);
                al.y(al.this).a(al.w(al.this).size() + al.x(al.this).size(), true);
                al.i(al.this).a();
                return;
                al.w(al.this).put(Integer.valueOf(((MediaController.i)localObject).b), localObject);
              }
            }
            org.vidogram.messenger.a.b(al.this.l().getCurrentFocus());
            if ((al.a(al.this).isEmpty()) && (al.g(al.this) == null))
            {
              localObject = (MediaController.j)al.j(al.this).get(((Integer)((View)paramView.getParent()).getTag()).intValue());
              label314: if (!al.x(al.this).containsKey(((MediaController.j)localObject).a))
                break label440;
              al.x(al.this).remove(((MediaController.j)localObject).a);
              ((MediaController.j)localObject).k = null;
              ((MediaController.j)localObject).j = null;
              al.this.a_(i);
            }
            while (true)
            {
              ((ai)paramView.getParent()).a(al.x(al.this).containsKey(((MediaController.j)localObject).a), true);
              break;
              localObject = (MediaController.j)al.a(al.this).get(((Integer)((View)paramView.getParent()).getTag()).intValue());
              break label314;
              label440: al.x(al.this).put(((MediaController.j)localObject).a, localObject);
            }
          }
        });
        localObject = paramViewGroup.b;
        if (al.l(al.this))
        {
          i = 8;
          ((FrameLayout)localObject).setVisibility(i);
        }
      }
      label784: 
      while (true)
      {
        paramViewGroup.d = al.t(al.this);
        BackupImageView localBackupImageView = ((ai)paramView).a;
        localBackupImageView.setTag(Integer.valueOf(paramInt));
        paramView.setTag(Integer.valueOf(paramInt));
        localBackupImageView.a(0, true);
        label187: boolean bool1;
        label223: boolean bool2;
        if (al.h(al.this) != null)
        {
          localObject = (MediaController.i)al.h(al.this).d.get(paramInt);
          if (((MediaController.i)localObject).f != null)
          {
            localBackupImageView.a(((MediaController.i)localObject).f, null, this.b.getResources().getDrawable(2130838008));
            paramViewGroup.a(al.w(al.this).containsKey(Integer.valueOf(((MediaController.i)localObject).b)), false);
            bool1 = am.a().a(((MediaController.i)localObject).d);
            localObject = localBackupImageView.getImageReceiver();
            if (bool1)
              break label702;
            bool2 = true;
            label238: ((org.vidogram.messenger.q)localObject).a(bool2, true);
            paramViewGroup = paramViewGroup.c;
            if (!al.l(al.this))
            {
              paramInt = j;
              if (!bool1);
            }
            else
            {
              paramInt = 8;
            }
            paramViewGroup.setVisibility(paramInt);
            localObject = paramView;
          }
        }
        label479: 
        do
        {
          return localObject;
          i = 0;
          break;
          if (((MediaController.i)localObject).d != null)
          {
            localBackupImageView.a(((MediaController.i)localObject).e, true);
            if (((MediaController.i)localObject).h)
            {
              localBackupImageView.a("vthumb://" + ((MediaController.i)localObject).b + ":" + ((MediaController.i)localObject).d, null, this.b.getResources().getDrawable(2130838008));
              break label187;
            }
            localBackupImageView.a("thumb://" + ((MediaController.i)localObject).b + ":" + ((MediaController.i)localObject).d, null, this.b.getResources().getDrawable(2130838008));
            break label187;
          }
          localBackupImageView.setImageResource(2130838008);
          break label187;
          if ((al.a(al.this).isEmpty()) && (al.g(al.this) == null))
          {
            localObject = (MediaController.j)al.j(al.this).get(paramInt);
            if (((MediaController.j)localObject).j == null)
              break label580;
            localBackupImageView.a(((MediaController.j)localObject).j, null, this.b.getResources().getDrawable(2130838008));
          }
          while (true)
          {
            paramViewGroup.a(al.x(al.this).containsKey(((MediaController.j)localObject).a), false);
            if (((MediaController.j)localObject).m == null)
              break label686;
            bool1 = am.a().a(org.vidogram.messenger.m.a(((MediaController.j)localObject).m, true).getAbsolutePath());
            break;
            localObject = (MediaController.j)al.a(al.this).get(paramInt);
            break label479;
            if ((((MediaController.j)localObject).c != null) && (((MediaController.j)localObject).c.length() > 0))
            {
              localBackupImageView.a(((MediaController.j)localObject).c, null, this.b.getResources().getDrawable(2130838008));
              continue;
            }
            if ((((MediaController.j)localObject).m != null) && (((MediaController.j)localObject).m.i != null))
            {
              localBackupImageView.a(((MediaController.j)localObject).m.i.c, null, this.b.getResources().getDrawable(2130838008));
              continue;
            }
            localBackupImageView.setImageResource(2130838008);
          }
          bool1 = am.a().a(((MediaController.j)localObject).b);
          break label223;
          bool2 = false;
          break label238;
          localObject = paramView;
        }
        while (i != 1);
        label580: localObject = paramView;
        label686: label702: if (paramView == null)
          localObject = ((LayoutInflater)this.b.getSystemService("layout_inflater")).inflate(2130968635, paramViewGroup, false);
        paramView = ((View)localObject).getLayoutParams();
        paramView.width = al.t(al.this);
        paramView.height = al.t(al.this);
        ((View)localObject).setLayoutParams(paramView);
        return localObject;
      }
    }

    public int getViewTypeCount()
    {
      return 2;
    }

    public boolean hasStableIds()
    {
      return true;
    }

    public boolean isEmpty()
    {
      if (al.h(al.this) != null)
        return al.h(al.this).d.isEmpty();
      if ((al.a(al.this).isEmpty()) && (al.g(al.this) == null))
        return al.j(al.this).isEmpty();
      return al.a(al.this).isEmpty();
    }

    public boolean isEnabled(int paramInt)
    {
      if (al.h(al.this) == null)
      {
        if ((!al.a(al.this).isEmpty()) || (al.g(al.this) != null))
          break label51;
        if (paramInt >= al.j(al.this).size())
          break label49;
      }
      label49: label51: 
      do
      {
        return true;
        return false;
      }
      while (paramInt < al.a(al.this).size());
      return false;
    }
  }

  public static abstract interface b
  {
    public abstract void a();

    public abstract void a(boolean paramBoolean);

    public abstract boolean a(String paramString);
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.al
 * JD-Core Version:    0.6.0
 */