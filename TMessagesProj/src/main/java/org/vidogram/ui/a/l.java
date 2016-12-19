package org.vidogram.ui.a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build.VERSION;
import java.lang.reflect.Array;
import org.vidogram.messenger.ApplicationLoader;

public class l
{
  public static Drawable[] A;
  public static Drawable B;
  public static Drawable C;
  public static Drawable[] D;
  public static Drawable E;
  public static Drawable F;
  public static Drawable G;
  public static Drawable H;
  public static Drawable I;
  public static Drawable J;
  public static Drawable K;
  public static Drawable[] L;
  public static Drawable[][] M;
  public static Drawable[][] N;
  public static Drawable[] O;
  public static PorterDuffColorFilter P;
  public static PorterDuffColorFilter Q;
  public static Drawable[] R;
  private static int S;
  private static Paint T;
  public static final int a = new itman.robert.a().b(ApplicationLoader.a);
  public static final int b = new itman.robert.a().b(ApplicationLoader.a);
  public static Drawable c;
  public static Drawable d;
  public static Drawable e;
  public static Drawable f;
  public static Drawable g;
  public static Drawable h;
  public static Drawable i;
  public static Drawable j;
  public static Drawable k;
  public static Drawable l;
  public static Drawable m;
  public static Drawable n;
  public static Drawable o;
  public static Drawable p;
  public static Drawable q;
  public static Drawable r;
  public static Drawable s;
  public static Drawable t;
  public static Drawable u;
  public static Drawable v;
  public static Drawable w;
  public static Drawable x;
  public static Drawable[] y = new Drawable[2];
  public static Drawable[] z = new Drawable[4];

  static
  {
    A = new Drawable[4];
    D = new Drawable[2];
    L = new Drawable[2];
    M = (Drawable[][])Array.newInstance(Drawable.class, new int[] { 10, 2 });
    N = (Drawable[][])Array.newInstance(Drawable.class, new int[] { 13, 2 });
    O = new Drawable[4];
    R = new Drawable[8];
    T = new Paint(1);
  }

  public static Drawable a(int paramInt)
  {
    return a(paramInt, true);
  }

  public static Drawable a(int paramInt, boolean paramBoolean)
  {
    if (Build.VERSION.SDK_INT >= 21)
    {
      if (!paramBoolean)
        break label176;
      T.setColor(-1);
    }
    label176: for (Object localObject = new Drawable()
    {
      public void draw(Canvas paramCanvas)
      {
        Rect localRect = getBounds();
        paramCanvas.drawCircle(localRect.centerX(), localRect.centerY(), org.vidogram.messenger.a.a(18.0F), l.a());
      }

      public int getOpacity()
      {
        return 0;
      }

      public void setAlpha(int paramInt)
      {
      }

      public void setColorFilter(ColorFilter paramColorFilter)
      {
      }
    }
    ; ; localObject = null)
    {
      return new RippleDrawable(new ColorStateList(new int[][] { new int[0] }, new int[] { paramInt }), null, (Drawable)localObject);
      localObject = new StateListDrawable();
      ColorDrawable localColorDrawable = new ColorDrawable(paramInt);
      ((StateListDrawable)localObject).addState(new int[] { 16842919 }, localColorDrawable);
      localColorDrawable = new ColorDrawable(paramInt);
      ((StateListDrawable)localObject).addState(new int[] { 16842908 }, localColorDrawable);
      localColorDrawable = new ColorDrawable(paramInt);
      ((StateListDrawable)localObject).addState(new int[] { 16842913 }, localColorDrawable);
      localColorDrawable = new ColorDrawable(paramInt);
      ((StateListDrawable)localObject).addState(new int[] { 16843518 }, localColorDrawable);
      localColorDrawable = new ColorDrawable(0);
      ((StateListDrawable)localObject).addState(new int[0], localColorDrawable);
      return localObject;
    }
  }

  public static void a(Context paramContext)
  {
    int i1 = 0;
    if (c == null)
    {
      c = paramContext.getResources().getDrawable(2130837990);
      d = paramContext.getResources().getDrawable(2130837993);
      e = paramContext.getResources().getDrawable(2130837994);
      f = paramContext.getResources().getDrawable(2130837997);
      g = paramContext.getResources().getDrawable(2130837991);
      h = paramContext.getResources().getDrawable(2130837992);
      i = paramContext.getResources().getDrawable(2130837995);
      j = paramContext.getResources().getDrawable(2130837996);
      k = paramContext.getResources().getDrawable(2130837982);
      l = paramContext.getResources().getDrawable(2130837988);
      m = paramContext.getResources().getDrawable(2130837984);
      o = paramContext.getResources().getDrawable(2130837983);
      p = paramContext.getResources().getDrawable(2130837989);
      q = paramContext.getResources().getDrawable(2130837987);
      y[0] = paramContext.getResources().getDrawable(2130837985);
      y[1] = paramContext.getResources().getDrawable(2130837986);
      s = paramContext.getResources().getDrawable(2130837998);
      u = paramContext.getResources().getDrawable(2130838065);
      v = paramContext.getResources().getDrawable(2130838064);
      n = paramContext.getResources().getDrawable(2130837664);
      r = paramContext.getResources().getDrawable(2130837665);
      t = paramContext.getResources().getDrawable(2130838163);
      w = paramContext.getResources().getDrawable(2130837657);
      x = paramContext.getResources().getDrawable(2130837656);
      D[0] = paramContext.getResources().getDrawable(2130838097);
      D[1] = paramContext.getResources().getDrawable(2130838098);
      E = paramContext.getResources().getDrawable(2130838100);
      F = paramContext.getResources().getDrawable(2130838099);
      M[0][0] = paramContext.getResources().getDrawable(2130838086);
      M[0][1] = paramContext.getResources().getDrawable(2130838087);
      M[1][0] = paramContext.getResources().getDrawable(2130838027);
      M[1][1] = paramContext.getResources().getDrawable(2130838028);
      M[2][0] = paramContext.getResources().getDrawable(2130837763);
      M[2][1] = paramContext.getResources().getDrawable(2130837764);
      M[3][0] = paramContext.getResources().getDrawable(2130837760);
      M[3][1] = paramContext.getResources().getDrawable(2130837765);
      M[4][0] = paramContext.getResources().getDrawable(2130837761);
      M[4][1] = paramContext.getResources().getDrawable(2130837762);
      M[5][0] = paramContext.getResources().getDrawable(2130838083);
      M[5][1] = paramContext.getResources().getDrawable(2130838084);
      M[6][0] = paramContext.getResources().getDrawable(2130838025);
      M[6][1] = paramContext.getResources().getDrawable(2130838026);
      M[7][0] = paramContext.getResources().getDrawable(2130837757);
      M[7][1] = paramContext.getResources().getDrawable(2130837758);
      M[8][0] = paramContext.getResources().getDrawable(2130837754);
      M[8][1] = paramContext.getResources().getDrawable(2130837759);
      M[9][0] = paramContext.getResources().getDrawable(2130837755);
      M[9][1] = paramContext.getResources().getDrawable(2130837756);
      N[0][0] = paramContext.getResources().getDrawable(2130838057);
      N[0][1] = paramContext.getResources().getDrawable(2130838062);
      N[1][0] = paramContext.getResources().getDrawable(2130838048);
      N[1][1] = paramContext.getResources().getDrawable(2130838053);
      N[2][0] = paramContext.getResources().getDrawable(2130838055);
      N[2][1] = paramContext.getResources().getDrawable(2130838056);
      N[3][0] = paramContext.getResources().getDrawable(2130838093);
      N[3][1] = paramContext.getResources().getDrawable(2130838094);
      Drawable[] arrayOfDrawable1 = N[4];
      Drawable[] arrayOfDrawable2 = N[4];
      Drawable localDrawable = paramContext.getResources().getDrawable(2130837670);
      arrayOfDrawable2[1] = localDrawable;
      arrayOfDrawable1[0] = localDrawable;
      arrayOfDrawable1 = N[5];
      arrayOfDrawable2 = N[5];
      localDrawable = paramContext.getResources().getDrawable(2130837687);
      arrayOfDrawable2[1] = localDrawable;
      arrayOfDrawable1[0] = localDrawable;
      arrayOfDrawable1 = N[6];
      arrayOfDrawable2 = N[6];
      localDrawable = paramContext.getResources().getDrawable(2130838054);
      arrayOfDrawable2[1] = localDrawable;
      arrayOfDrawable1[0] = localDrawable;
      N[7][0] = paramContext.getResources().getDrawable(2130838060);
      N[7][1] = paramContext.getResources().getDrawable(2130838061);
      N[8][0] = paramContext.getResources().getDrawable(2130838051);
      N[8][1] = paramContext.getResources().getDrawable(2130838052);
      N[9][0] = paramContext.getResources().getDrawable(2130837740);
      N[9][1] = paramContext.getResources().getDrawable(2130837740);
      N[10][0] = paramContext.getResources().getDrawable(2130838058);
      N[10][1] = paramContext.getResources().getDrawable(2130838059);
      N[11][0] = paramContext.getResources().getDrawable(2130838049);
      N[11][1] = paramContext.getResources().getDrawable(2130838050);
      N[12][0] = paramContext.getResources().getDrawable(2130837738);
      N[12][1] = paramContext.getResources().getDrawable(2130837739);
      O[0] = paramContext.getResources().getDrawable(2130837735);
      O[1] = paramContext.getResources().getDrawable(2130837737);
      O[2] = paramContext.getResources().getDrawable(2130837736);
      O[3] = paramContext.getResources().getDrawable(2130838192);
      L[0] = paramContext.getResources().getDrawable(2130837715);
      L[1] = paramContext.getResources().getDrawable(2130837716);
      B = paramContext.getResources().getDrawable(2130838145);
      C = paramContext.getResources().getDrawable(2130838144);
      G = paramContext.getResources().getDrawable(2130837953);
      H = paramContext.getResources().getDrawable(2130837954);
      z[0] = paramContext.getResources().getDrawable(2130837723);
      z[1] = paramContext.getResources().getDrawable(2130837724);
      z[2] = paramContext.getResources().getDrawable(2130837722);
      z[3] = paramContext.getResources().getDrawable(2130837721);
      A[0] = paramContext.getResources().getDrawable(2130837720);
      A[1] = paramContext.getResources().getDrawable(2130837719);
      A[2] = paramContext.getResources().getDrawable(2130837718);
      A[3] = paramContext.getResources().getDrawable(2130837717);
      I = paramContext.getResources().getDrawable(2130837649);
      J = paramContext.getResources().getDrawable(2130837660);
      K = paramContext.getResources().getDrawable(2130837659);
    }
    int i2 = ApplicationLoader.d();
    if (S != i2)
    {
      P = new PorterDuffColorFilter(i2, PorterDuff.Mode.MULTIPLY);
      Q = new PorterDuffColorFilter(ApplicationLoader.e(), PorterDuff.Mode.MULTIPLY);
      S = i2;
      while (i1 < 4)
      {
        z[i1].setColorFilter(P);
        A[i1].setColorFilter(P);
        i1 += 1;
      }
      v.setColorFilter(P);
    }
  }

  public static void b(Context paramContext)
  {
    if (R[0] == null)
    {
      R[0] = paramContext.getResources().getDrawable(2130837603);
      R[1] = paramContext.getResources().getDrawable(2130837612);
      R[2] = paramContext.getResources().getDrawable(2130837626);
      R[3] = paramContext.getResources().getDrawable(2130837600);
      R[4] = paramContext.getResources().getDrawable(2130837609);
      R[5] = paramContext.getResources().getDrawable(2130837606);
      R[6] = paramContext.getResources().getDrawable(2130837619);
      R[7] = paramContext.getResources().getDrawable(2130837616);
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.a.l
 * JD-Core Version:    0.6.0
 */