package org.vidogram.ui.Components.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import org.vidogram.messenger.ApplicationLoader;

public abstract interface a
{
  public abstract float a();

  public abstract float b();

  public abstract float c();

  public abstract float d();

  public abstract boolean e();

  public abstract Bitmap f();

  public static class a
    implements a
  {
    public float a()
    {
      return 0.04F;
    }

    public float b()
    {
      return 0.3F;
    }

    public float c()
    {
      return (float)Math.toRadians(125.0D);
    }

    public float d()
    {
      return 1.5F;
    }

    public boolean e()
    {
      return false;
    }

    public Bitmap f()
    {
      BitmapFactory.Options localOptions = new BitmapFactory.Options();
      localOptions.inScaled = false;
      return BitmapFactory.decodeResource(ApplicationLoader.a.getResources(), 2130838016, localOptions);
    }
  }

  public static class b
    implements a
  {
    public float a()
    {
      return 0.07F;
    }

    public float b()
    {
      return 0.7F;
    }

    public float c()
    {
      return 0.0F;
    }

    public float d()
    {
      return 1.45F;
    }

    public boolean e()
    {
      return true;
    }

    public Bitmap f()
    {
      BitmapFactory.Options localOptions = new BitmapFactory.Options();
      localOptions.inScaled = false;
      return BitmapFactory.decodeResource(ApplicationLoader.a.getResources(), 2130838018, localOptions);
    }
  }

  public static class c
    implements a
  {
    public float a()
    {
      return 0.15F;
    }

    public float b()
    {
      return 0.85F;
    }

    public float c()
    {
      return 0.0F;
    }

    public float d()
    {
      return 1.0F;
    }

    public boolean e()
    {
      return false;
    }

    public Bitmap f()
    {
      BitmapFactory.Options localOptions = new BitmapFactory.Options();
      localOptions.inScaled = false;
      return BitmapFactory.decodeResource(ApplicationLoader.a.getResources(), 2130838020, localOptions);
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.Components.a.a
 * JD-Core Version:    0.6.0
 */