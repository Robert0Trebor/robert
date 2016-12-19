package org.vidogram.ui.Components;

import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout.LayoutParams;
import org.vidogram.messenger.a;

public class v
{
  private static int a(float paramFloat)
  {
    if (paramFloat < 0.0F);
    while (true)
    {
      return (int)paramFloat;
      paramFloat = a.a(paramFloat);
    }
  }

  public static FrameLayout.LayoutParams a(int paramInt, float paramFloat)
  {
    return new FrameLayout.LayoutParams(a(paramInt), a(paramFloat));
  }

  public static FrameLayout.LayoutParams a(int paramInt1, float paramFloat1, int paramInt2, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5)
  {
    FrameLayout.LayoutParams localLayoutParams = new FrameLayout.LayoutParams(a(paramInt1), a(paramFloat1), paramInt2);
    localLayoutParams.setMargins(a.a(paramFloat2), a.a(paramFloat3), a.a(paramFloat4), a.a(paramFloat5));
    return localLayoutParams;
  }

  public static FrameLayout.LayoutParams a(int paramInt1, int paramInt2, int paramInt3)
  {
    return new FrameLayout.LayoutParams(a(paramInt1), a(paramInt2), paramInt3);
  }

  public static LinearLayout.LayoutParams a(int paramInt1, int paramInt2, float paramFloat)
  {
    return new LinearLayout.LayoutParams(a(paramInt1), a(paramInt2), paramFloat);
  }

  public static LinearLayout.LayoutParams a(int paramInt1, int paramInt2, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(a(paramInt1), a(paramInt2));
    localLayoutParams.setMargins(a.a(paramFloat1), a.a(paramFloat2), a.a(paramFloat3), a.a(paramFloat4));
    return localLayoutParams;
  }

  public static LinearLayout.LayoutParams a(int paramInt1, int paramInt2, float paramFloat, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(a(paramInt1), a(paramInt2), paramFloat);
    localLayoutParams.setMargins(a.a(paramInt3), a.a(paramInt4), a.a(paramInt5), a.a(paramInt6));
    return localLayoutParams;
  }

  public static LinearLayout.LayoutParams a(int paramInt1, int paramInt2, float paramFloat, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
  {
    LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(a(paramInt1), a(paramInt2), paramFloat);
    localLayoutParams.setMargins(a.a(paramInt4), a.a(paramInt5), a.a(paramInt6), a.a(paramInt7));
    localLayoutParams.gravity = paramInt3;
    return localLayoutParams;
  }

  public static RelativeLayout.LayoutParams a(float paramFloat1, float paramFloat2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
  {
    RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(a(paramFloat1), a(paramFloat2));
    if (paramInt5 >= 0)
      localLayoutParams.addRule(paramInt5);
    if ((paramInt6 >= 0) && (paramInt7 >= 0))
      localLayoutParams.addRule(paramInt6, paramInt7);
    localLayoutParams.leftMargin = a.a(paramInt1);
    localLayoutParams.topMargin = a.a(paramInt2);
    localLayoutParams.rightMargin = a.a(paramInt3);
    localLayoutParams.bottomMargin = a.a(paramInt4);
    return localLayoutParams;
  }

  public static RelativeLayout.LayoutParams a(int paramInt1, int paramInt2)
  {
    return a(paramInt1, paramInt2, 0, 0, 0, 0, -1, -1, -1);
  }

  public static RelativeLayout.LayoutParams a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
  {
    return a(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, -1, -1);
  }

  public static FrameLayout.LayoutParams b(int paramInt1, int paramInt2, int paramInt3)
  {
    return new FrameLayout.LayoutParams(a(paramInt1), a(paramInt2), paramInt3);
  }

  public static LinearLayout.LayoutParams b(int paramInt1, int paramInt2)
  {
    return new LinearLayout.LayoutParams(a(paramInt1), a(paramInt2));
  }

  public static LinearLayout.LayoutParams b(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
  {
    LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(a(paramInt1), a(paramInt2));
    localLayoutParams.setMargins(a.a(paramInt4), a.a(paramInt5), a.a(paramInt6), a.a(paramInt7));
    localLayoutParams.gravity = paramInt3;
    return localLayoutParams;
  }

  public static RelativeLayout.LayoutParams c(int paramInt1, int paramInt2, int paramInt3)
  {
    return a(paramInt1, paramInt2, 0, 0, 0, 0, paramInt3, -1, -1);
  }

  public static LinearLayout.LayoutParams d(int paramInt1, int paramInt2, int paramInt3)
  {
    LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(a(paramInt1), a(paramInt2));
    localLayoutParams.gravity = paramInt3;
    return localLayoutParams;
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.Components.v
 * JD-Core Version:    0.6.0
 */