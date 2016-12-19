package org.vidogram.ui;

import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.content.FileProvider;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.ProgressBar;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.vidogram.messenger.ApplicationLoader;
import org.vidogram.messenger.m;
import org.vidogram.messenger.n;
import org.vidogram.messenger.r;
import org.vidogram.messenger.support.widget.LinearLayoutManager;
import org.vidogram.messenger.support.widget.RecyclerView.a;
import org.vidogram.messenger.support.widget.RecyclerView.u;
import org.vidogram.messenger.w;
import org.vidogram.messenger.y;
import org.vidogram.messenger.y.b;
import org.vidogram.tgnet.ConnectionsManager;
import org.vidogram.tgnet.g.az;
import org.vidogram.tgnet.g.bq;
import org.vidogram.tgnet.g.vn;
import org.vidogram.tgnet.g.vo;
import org.vidogram.tgnet.g.wa;
import org.vidogram.tgnet.g.x;
import org.vidogram.ui.Components.aw;
import org.vidogram.ui.Components.aw.b;
import org.vidogram.ui.Components.v;
import org.vidogram.ui.a.a.a;
import org.vidogram.ui.a.g;
import org.vidogram.ui.c.bi;

public class bb extends g
  implements y.b
{
  private a i;
  private ImageView j;
  private FrameLayout k;
  private View l;
  private int m;
  private int n;
  private ArrayList<g.wa> o = new ArrayList();
  private HashMap<Integer, g.wa> p = new HashMap();
  private View q;
  private String r = null;
  private File s = null;
  private g.az t = null;
  private String u;

  private void q()
  {
    Object localObject1 = (g.wa)this.p.get(Integer.valueOf(this.m));
    int i1;
    int i2;
    int i3;
    if ((this.m != -1) && (this.m != 1000001) && (localObject1 != null) && ((localObject1 instanceof g.vn)))
    {
      i1 = org.vidogram.messenger.a.c.x;
      i2 = org.vidogram.messenger.a.c.y;
      if (i1 <= i2)
        break label568;
      i3 = i2;
      i2 = i1;
    }
    while (true)
    {
      localObject1 = m.a(((g.wa)localObject1).e, Math.min(i3, i2));
      if (localObject1 == null)
        return;
      Object localObject3 = ((g.az)localObject1).c.c + "_" + ((g.az)localObject1).c.d + ".jpg";
      File localFile = new File(m.a().b(4), (String)localObject3);
      if (!localFile.exists())
      {
        int[] arrayOfInt = org.vidogram.messenger.a.a(this.j.getDrawable());
        this.l.getBackground().setColorFilter(new PorterDuffColorFilter(arrayOfInt[0], PorterDuff.Mode.MULTIPLY));
        this.r = ((String)localObject3);
        this.s = localFile;
        this.q.setEnabled(false);
        this.k.setVisibility(0);
        this.t = ((g.az)localObject1);
        this.n = 0;
        m.a().a((g.az)localObject1, null, true);
        this.j.setBackgroundColor(0);
        return;
      }
      if (this.r != null)
        m.a().a(this.t);
      this.s = null;
      this.r = null;
      this.t = null;
      try
      {
        this.j.setImageURI(Uri.fromFile(localFile));
        this.j.setBackgroundColor(0);
        this.n = 0;
        this.q.setEnabled(true);
        this.k.setVisibility(8);
        return;
      }
      catch (Throwable localThrowable)
      {
        while (true)
          n.a("tmessages", localThrowable);
      }
      if (this.r != null)
        m.a().a(this.t);
      if (this.m == 1000001)
      {
        this.j.setImageResource(2130837629);
        this.j.setBackgroundColor(0);
        this.n = 0;
      }
      while (true)
      {
        this.s = null;
        this.r = null;
        this.t = null;
        this.q.setEnabled(true);
        this.k.setVisibility(8);
        return;
        Object localObject2;
        if (this.m == -1)
        {
          localObject3 = new File(ApplicationLoader.h(), "wallpaper-temp.jpg");
          localObject2 = localObject3;
          if (!((File)localObject3).exists())
            localObject2 = new File(ApplicationLoader.h(), "wallpaper.jpg");
          if (((File)localObject2).exists())
          {
            this.j.setImageURI(Uri.fromFile((File)localObject2));
            continue;
          }
          this.m = 1000001;
          q();
          continue;
        }
        if (localObject2 == null)
          break;
        if (!(localObject2 instanceof g.vo))
          continue;
        this.j.getDrawable();
        this.j.setImageBitmap(null);
        this.n = (((g.wa)localObject2).g | 0xFF000000);
        this.j.setBackgroundColor(this.n);
      }
      label568: i3 = i1;
    }
  }

  private void r()
  {
    g.bq localbq = new g.bq();
    int i1 = ConnectionsManager.a().a(localbq, new org.vidogram.tgnet.c()
    {
    });
    ConnectionsManager.a().a(i1, this.e);
  }

  public View a(Context paramContext)
  {
    this.d.setBackButtonImage(2130837794);
    this.d.setAllowOverlayTitle(true);
    this.d.setTitle(r.a("ChatBackground", 2131231046));
    this.d.setActionBarMenuOnItemClick(new a.a()
    {
      public void a(int paramInt)
      {
        if (paramInt == -1)
          bb.this.d();
        do
          return;
        while (paramInt != 1);
        Object localObject = (g.wa)bb.b(bb.this).get(Integer.valueOf(bb.a(bb.this)));
        int i;
        int j;
        if ((localObject != null) && (((g.wa)localObject).c != 1000001) && ((localObject instanceof g.vn)))
        {
          paramInt = org.vidogram.messenger.a.c.x;
          i = org.vidogram.messenger.a.c.y;
          if (paramInt <= i)
            break label327;
          j = i;
          i = paramInt;
        }
        while (true)
        {
          localObject = m.a(((g.wa)localObject).e, Math.min(j, i));
          localObject = ((g.az)localObject).c.c + "_" + ((g.az)localObject).c.d + ".jpg";
          localObject = new File(m.a().b(4), (String)localObject);
          File localFile = new File(ApplicationLoader.h(), "wallpaper.jpg");
          while (true)
          {
            try
            {
              bool = org.vidogram.messenger.a.a((File)localObject, localFile);
              if (!bool)
                continue;
              localObject = ApplicationLoader.a.getSharedPreferences("mainconfig", 0).edit();
              ((SharedPreferences.Editor)localObject).putInt("selectedBackground", bb.a(bb.this));
              ((SharedPreferences.Editor)localObject).putInt("selectedColor", bb.c(bb.this));
              ((SharedPreferences.Editor)localObject).commit();
              ApplicationLoader.c();
              bb.this.d();
              return;
            }
            catch (Exception localException)
            {
              n.a("tmessages", localException);
              bool = false;
              continue;
            }
            if (bb.a(bb.this) == -1)
            {
              bool = new File(ApplicationLoader.h(), "wallpaper-temp.jpg").renameTo(new File(ApplicationLoader.h(), "wallpaper.jpg"));
              continue;
            }
            boolean bool = true;
          }
          label327: j = paramInt;
        }
      }
    });
    this.q = this.d.a().b(1, 2130837825, org.vidogram.messenger.a.a(56.0F));
    FrameLayout localFrameLayout = new FrameLayout(paramContext);
    this.b = localFrameLayout;
    this.j = new ImageView(paramContext);
    this.j.setScaleType(ImageView.ScaleType.CENTER_CROP);
    localFrameLayout.addView(this.j, v.a(-1, -1.0F));
    this.j.setOnTouchListener(new View.OnTouchListener()
    {
      public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
      {
        return true;
      }
    });
    this.k = new FrameLayout(paramContext);
    this.k.setVisibility(4);
    localFrameLayout.addView(this.k, v.a(-1, -1.0F, 51, 0.0F, 0.0F, 0.0F, 52.0F));
    this.l = new View(paramContext);
    this.l.setBackgroundResource(2130838164);
    this.k.addView(this.l, v.b(36, 36, 17));
    Object localObject = new ProgressBar(paramContext);
    try
    {
      ((ProgressBar)localObject).setIndeterminateDrawable(paramContext.getResources().getDrawable(2130837951));
      label247: ((ProgressBar)localObject).setIndeterminate(true);
      org.vidogram.messenger.a.a((ProgressBar)localObject, 1500);
      this.k.addView((View)localObject, v.b(32, 32, 17));
      localObject = new aw(paramContext);
      ((aw)localObject).setClipToPadding(false);
      ((aw)localObject).setTag(Integer.valueOf(8));
      ((aw)localObject).setPadding(org.vidogram.messenger.a.a(40.0F), 0, org.vidogram.messenger.a.a(40.0F), 0);
      LinearLayoutManager localLinearLayoutManager = new LinearLayoutManager(paramContext);
      localLinearLayoutManager.b(0);
      ((aw)localObject).setLayoutManager(localLinearLayoutManager);
      ((aw)localObject).setDisallowInterceptTouchEvents(true);
      ((aw)localObject).setOverScrollMode(2);
      paramContext = new a(paramContext);
      this.i = paramContext;
      ((aw)localObject).setAdapter(paramContext);
      localFrameLayout.addView((View)localObject, v.b(-1, 102, 83));
      ((aw)localObject).setOnItemClickListener(new aw.b()
      {
        public void a(View paramView, int paramInt)
        {
          if (paramInt == 0)
            if (bb.this.l() != null);
          do
          {
            return;
            paramView = new AlertDialog.Builder(bb.this.l());
            String str1 = r.a("FromCamera", 2131231263);
            String str2 = r.a("FromGalley", 2131231270);
            String str3 = r.a("Cancel", 2131230943);
            1 local1 = new DialogInterface.OnClickListener()
            {
              public void onClick(DialogInterface paramDialogInterface, int paramInt)
              {
                if (paramInt == 0)
                  try
                  {
                    paramDialogInterface = new Intent("android.media.action.IMAGE_CAPTURE");
                    File localFile = org.vidogram.messenger.a.i();
                    if (localFile != null)
                    {
                      if (Build.VERSION.SDK_INT < 24)
                        break label94;
                      paramDialogInterface.putExtra("output", FileProvider.a(bb.this.l(), "org.vidogram.messenger.beta.provider", localFile));
                      paramDialogInterface.addFlags(2);
                      paramDialogInterface.addFlags(1);
                    }
                    while (true)
                    {
                      bb.a(bb.this, localFile.getAbsolutePath());
                      bb.this.a(paramDialogInterface, 10);
                      return;
                      label94: paramDialogInterface.putExtra("output", Uri.fromFile(localFile));
                    }
                  }
                  catch (Exception paramDialogInterface)
                  {
                    n.a("tmessages", paramDialogInterface);
                    return;
                  }
                if (paramInt == 1)
                {
                  paramDialogInterface = new Intent("android.intent.action.PICK");
                  paramDialogInterface.setType("image/*");
                  bb.this.a(paramDialogInterface, 11);
                }
              }
            };
            paramView.setItems(new CharSequence[] { str1, str2, str3 }, local1);
            bb.this.b(paramView.create());
            return;
          }
          while ((paramInt - 1 < 0) || (paramInt - 1 >= bb.d(bb.this).size()));
          paramView = (g.wa)bb.d(bb.this).get(paramInt - 1);
          bb.a(bb.this, paramView.c);
          bb.e(bb.this).c();
          bb.f(bb.this);
        }
      });
      q();
      return this.b;
    }
    catch (Exception localException)
    {
      break label247;
    }
  }

  // ERROR //
  public void a(int paramInt1, int paramInt2, Intent paramIntent)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 5
    //   3: iload_2
    //   4: iconst_m1
    //   5: if_icmpne +133 -> 138
    //   8: iload_1
    //   9: bipush 10
    //   11: if_icmpne +205 -> 216
    //   14: aload_0
    //   15: getfield 74	org/vidogram/ui/bb:u	Ljava/lang/String;
    //   18: invokestatic 456	org/vidogram/messenger/a:c	(Ljava/lang/String;)V
    //   21: invokestatic 459	org/vidogram/messenger/a:g	()Landroid/graphics/Point;
    //   24: astore_3
    //   25: aload_0
    //   26: getfield 74	org/vidogram/ui/bb:u	Ljava/lang/String;
    //   29: aconst_null
    //   30: aload_3
    //   31: getfield 116	android/graphics/Point:x	I
    //   34: i2f
    //   35: aload_3
    //   36: getfield 119	android/graphics/Point:y	I
    //   39: i2f
    //   40: iconst_1
    //   41: invokestatic 464	org/vidogram/messenger/p:a	(Ljava/lang/String;Landroid/net/Uri;FFZ)Landroid/graphics/Bitmap;
    //   44: astore 6
    //   46: new 466	java/io/FileOutputStream
    //   49: dup
    //   50: new 167	java/io/File
    //   53: dup
    //   54: invokestatic 265	org/vidogram/messenger/ApplicationLoader:h	()Ljava/io/File;
    //   57: ldc_w 267
    //   60: invokespecial 176	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   63: invokespecial 469	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   66: astore 4
    //   68: aload 4
    //   70: astore_3
    //   71: aload 6
    //   73: getstatic 475	android/graphics/Bitmap$CompressFormat:JPEG	Landroid/graphics/Bitmap$CompressFormat;
    //   76: bipush 87
    //   78: aload 4
    //   80: invokevirtual 481	android/graphics/Bitmap:compress	(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    //   83: pop
    //   84: aload 4
    //   86: astore_3
    //   87: aload_0
    //   88: iconst_m1
    //   89: putfield 70	org/vidogram/ui/bb:m	I
    //   92: aload 4
    //   94: astore_3
    //   95: aload_0
    //   96: iconst_0
    //   97: putfield 79	org/vidogram/ui/bb:n	I
    //   100: aload 4
    //   102: astore_3
    //   103: aload_0
    //   104: getfield 182	org/vidogram/ui/bb:j	Landroid/widget/ImageView;
    //   107: invokevirtual 188	android/widget/ImageView:getDrawable	()Landroid/graphics/drawable/Drawable;
    //   110: pop
    //   111: aload 4
    //   113: astore_3
    //   114: aload_0
    //   115: getfield 182	org/vidogram/ui/bb:j	Landroid/widget/ImageView;
    //   118: aload 6
    //   120: invokevirtual 275	android/widget/ImageView:setImageBitmap	(Landroid/graphics/Bitmap;)V
    //   123: aload 4
    //   125: ifnull +8 -> 133
    //   128: aload 4
    //   130: invokevirtual 484	java/io/FileOutputStream:close	()V
    //   133: aload_0
    //   134: aconst_null
    //   135: putfield 74	org/vidogram/ui/bb:u	Ljava/lang/String;
    //   138: return
    //   139: astore_3
    //   140: ldc 250
    //   142: aload_3
    //   143: invokestatic 255	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   146: goto -13 -> 133
    //   149: astore 5
    //   151: aconst_null
    //   152: astore 4
    //   154: aload 4
    //   156: astore_3
    //   157: ldc 250
    //   159: aload 5
    //   161: invokestatic 255	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   164: aload 4
    //   166: ifnull -33 -> 133
    //   169: aload 4
    //   171: invokevirtual 484	java/io/FileOutputStream:close	()V
    //   174: goto -41 -> 133
    //   177: astore_3
    //   178: ldc 250
    //   180: aload_3
    //   181: invokestatic 255	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   184: goto -51 -> 133
    //   187: astore_3
    //   188: aload 5
    //   190: astore 4
    //   192: aload 4
    //   194: ifnull +8 -> 202
    //   197: aload 4
    //   199: invokevirtual 484	java/io/FileOutputStream:close	()V
    //   202: aload_3
    //   203: athrow
    //   204: astore 4
    //   206: ldc 250
    //   208: aload 4
    //   210: invokestatic 255	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   213: goto -11 -> 202
    //   216: iload_1
    //   217: bipush 11
    //   219: if_icmpne -81 -> 138
    //   222: aload_3
    //   223: ifnull -85 -> 138
    //   226: aload_3
    //   227: invokevirtual 490	android/content/Intent:getData	()Landroid/net/Uri;
    //   230: ifnull -92 -> 138
    //   233: invokestatic 459	org/vidogram/messenger/a:g	()Landroid/graphics/Point;
    //   236: astore 4
    //   238: aconst_null
    //   239: aload_3
    //   240: invokevirtual 490	android/content/Intent:getData	()Landroid/net/Uri;
    //   243: aload 4
    //   245: getfield 116	android/graphics/Point:x	I
    //   248: i2f
    //   249: aload 4
    //   251: getfield 119	android/graphics/Point:y	I
    //   254: i2f
    //   255: iconst_1
    //   256: invokestatic 464	org/vidogram/messenger/p:a	(Ljava/lang/String;Landroid/net/Uri;FFZ)Landroid/graphics/Bitmap;
    //   259: astore_3
    //   260: new 466	java/io/FileOutputStream
    //   263: dup
    //   264: new 167	java/io/File
    //   267: dup
    //   268: invokestatic 265	org/vidogram/messenger/ApplicationLoader:h	()Ljava/io/File;
    //   271: ldc_w 267
    //   274: invokespecial 176	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   277: invokespecial 469	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   280: astore 4
    //   282: aload_3
    //   283: getstatic 475	android/graphics/Bitmap$CompressFormat:JPEG	Landroid/graphics/Bitmap$CompressFormat;
    //   286: bipush 87
    //   288: aload 4
    //   290: invokevirtual 481	android/graphics/Bitmap:compress	(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    //   293: pop
    //   294: aload_0
    //   295: iconst_m1
    //   296: putfield 70	org/vidogram/ui/bb:m	I
    //   299: aload_0
    //   300: iconst_0
    //   301: putfield 79	org/vidogram/ui/bb:n	I
    //   304: aload_0
    //   305: getfield 182	org/vidogram/ui/bb:j	Landroid/widget/ImageView;
    //   308: invokevirtual 188	android/widget/ImageView:getDrawable	()Landroid/graphics/drawable/Drawable;
    //   311: pop
    //   312: aload_0
    //   313: getfield 182	org/vidogram/ui/bb:j	Landroid/widget/ImageView;
    //   316: aload_3
    //   317: invokevirtual 275	android/widget/ImageView:setImageBitmap	(Landroid/graphics/Bitmap;)V
    //   320: return
    //   321: astore_3
    //   322: ldc 250
    //   324: aload_3
    //   325: invokestatic 255	org/vidogram/messenger/n:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   328: return
    //   329: astore 5
    //   331: aload_3
    //   332: astore 4
    //   334: aload 5
    //   336: astore_3
    //   337: goto -145 -> 192
    //   340: astore 5
    //   342: goto -188 -> 154
    //
    // Exception table:
    //   from	to	target	type
    //   128	133	139	java/lang/Exception
    //   21	68	149	java/lang/Exception
    //   169	174	177	java/lang/Exception
    //   21	68	187	finally
    //   197	202	204	java/lang/Exception
    //   233	320	321	java/lang/Exception
    //   71	84	329	finally
    //   87	92	329	finally
    //   95	100	329	finally
    //   103	111	329	finally
    //   114	123	329	finally
    //   157	164	329	finally
    //   71	84	340	java/lang/Exception
    //   87	92	340	java/lang/Exception
    //   95	100	340	java/lang/Exception
    //   103	111	340	java/lang/Exception
    //   114	123	340	java/lang/Exception
  }

  public void a(int paramInt, Object[] paramArrayOfObject)
  {
    if (paramInt == y.aA)
    {
      paramArrayOfObject = (String)paramArrayOfObject[0];
      if ((this.r != null) && (this.r.equals(paramArrayOfObject)))
      {
        this.s = null;
        this.r = null;
        this.t = null;
        this.k.setVisibility(8);
        this.q.setEnabled(false);
      }
    }
    do
      while (true)
      {
        return;
        if (paramInt != y.az)
          break;
        paramArrayOfObject = (String)paramArrayOfObject[0];
        if ((this.r == null) || (!this.r.equals(paramArrayOfObject)))
          continue;
        this.j.setImageURI(Uri.fromFile(this.s));
        this.k.setVisibility(8);
        this.j.setBackgroundColor(0);
        this.q.setEnabled(true);
        this.s = null;
        this.r = null;
        this.t = null;
        return;
      }
    while (paramInt != y.ao);
    this.o = ((ArrayList)paramArrayOfObject[0]);
    this.p.clear();
    paramArrayOfObject = this.o.iterator();
    while (paramArrayOfObject.hasNext())
    {
      g.wa localwa = (g.wa)paramArrayOfObject.next();
      this.p.put(Integer.valueOf(localwa.c), localwa);
    }
    if (this.i != null)
      this.i.c();
    if ((!this.o.isEmpty()) && (this.j != null))
      q();
    r();
  }

  public void a(Bundle paramBundle)
  {
    if (this.u != null)
      paramBundle.putString("path", this.u);
  }

  public void b(Bundle paramBundle)
  {
    this.u = paramBundle.getString("path");
  }

  public boolean f()
  {
    super.f();
    y.a().a(this, y.aA);
    y.a().a(this, y.az);
    y.a().a(this, y.ao);
    SharedPreferences localSharedPreferences = ApplicationLoader.a.getSharedPreferences("mainconfig", 0);
    this.m = localSharedPreferences.getInt("selectedBackground", 1000001);
    this.n = localSharedPreferences.getInt("selectedColor", 0);
    w.a().f();
    new File(ApplicationLoader.h(), "wallpaper-temp.jpg").delete();
    return true;
  }

  public void g()
  {
    super.g();
    y.a().b(this, y.aA);
    y.a().b(this, y.az);
    y.a().b(this, y.ao);
  }

  public void i()
  {
    super.i();
    if (this.i != null)
      this.i.c();
    q();
  }

  private class a extends RecyclerView.a
  {
    private Context b;

    public a(Context arg2)
    {
      Object localObject;
      this.b = localObject;
    }

    public int a()
    {
      return bb.d(bb.this).size() + 1;
    }

    public RecyclerView.u a(ViewGroup paramViewGroup, int paramInt)
    {
      return new a(new bi(this.b));
    }

    public void a(RecyclerView.u paramu, int paramInt)
    {
      bi localbi = (bi)paramu.a;
      if (paramInt == 0);
      for (paramu = null; ; paramu = (g.wa)bb.d(bb.this).get(paramInt - 1))
      {
        localbi.a(paramu, bb.a(bb.this));
        return;
      }
    }

    public long b(int paramInt)
    {
      return paramInt;
    }

    private class a extends RecyclerView.u
    {
      public a(View arg2)
      {
        super();
      }
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.bb
 * JD-Core Version:    0.6.0
 */