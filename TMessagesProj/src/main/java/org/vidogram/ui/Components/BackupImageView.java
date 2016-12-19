package org.vidogram.ui.Components;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import org.vidogram.messenger.q;
import org.vidogram.tgnet.f;
import org.vidogram.tgnet.g.x;

public class BackupImageView extends View
{
  private q a;
  private int b = -1;
  private int c = -1;

  public BackupImageView(Context paramContext)
  {
    super(paramContext);
    a();
  }

  public BackupImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a();
  }

  public BackupImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a();
  }

  private void a()
  {
    this.a = new q(this);
  }

  public void a(int paramInt1, int paramInt2)
  {
    this.b = paramInt1;
    this.c = paramInt2;
  }

  public void a(int paramInt, boolean paramBoolean)
  {
    this.a.a(paramInt, paramBoolean);
  }

  public void a(String paramString1, String paramString2, Drawable paramDrawable)
  {
    a(null, paramString1, paramString2, paramDrawable, null, null, null, null, 0);
  }

  public void a(f paramf, String paramString, Drawable paramDrawable)
  {
    a(paramf, null, paramString, paramDrawable, null, null, null, null, 0);
  }

  public void a(f paramf, String paramString1, String paramString2, Drawable paramDrawable)
  {
    a(paramf, null, paramString1, paramDrawable, null, null, null, paramString2, 0);
  }

  public void a(f paramf, String paramString1, String paramString2, Drawable paramDrawable, Bitmap paramBitmap, g.x paramx, String paramString3, String paramString4, int paramInt)
  {
    if (paramBitmap != null)
      paramDrawable = new BitmapDrawable(null, paramBitmap);
    while (true)
    {
      this.a.a(paramf, paramString1, paramString2, paramDrawable, paramx, paramString3, paramInt, paramString4, false);
      return;
    }
  }

  public void a(f paramf, String paramString, g.x paramx, int paramInt)
  {
    a(paramf, null, paramString, null, null, paramx, null, null, paramInt);
  }

  public q getImageReceiver()
  {
    return this.a;
  }

  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    this.a.g();
  }

  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    this.a.f();
  }

  protected void onDraw(Canvas paramCanvas)
  {
    if ((this.b != -1) && (this.c != -1))
      this.a.a((getWidth() - this.b) / 2, (getHeight() - this.c) / 2, this.b, this.c);
    while (true)
    {
      this.a.a(paramCanvas);
      return;
      this.a.a(0, 0, getWidth(), getHeight());
    }
  }

  public void setAspectFit(boolean paramBoolean)
  {
    this.a.c(paramBoolean);
  }

  public void setImageBitmap(Bitmap paramBitmap)
  {
    this.a.a(paramBitmap);
  }

  public void setImageDrawable(Drawable paramDrawable)
  {
    this.a.a(paramDrawable);
  }

  public void setImageResource(int paramInt)
  {
    this.a.a(getResources().getDrawable(paramInt));
  }

  public void setRoundRadius(int paramInt)
  {
    this.a.a(paramInt);
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.Components.BackupImageView
 * JD-Core Version:    0.6.0
 */