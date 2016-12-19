package org.vidogram.messenger.c;

import android.hardware.Camera;
import android.hardware.Camera.CameraInfo;
import java.util.ArrayList;

public class b
{
  protected int a;
  protected Camera b;
  protected ArrayList<e> c = new ArrayList();
  protected ArrayList<e> d = new ArrayList();
  protected final int e;

  public b(int paramInt, Camera.CameraInfo paramCameraInfo)
  {
    this.a = paramInt;
    this.e = paramCameraInfo.facing;
  }

  public int a()
  {
    return this.a;
  }

  public ArrayList<e> b()
  {
    return this.d;
  }

  public ArrayList<e> c()
  {
    return this.c;
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.c.b
 * JD-Core Version:    0.6.0
 */