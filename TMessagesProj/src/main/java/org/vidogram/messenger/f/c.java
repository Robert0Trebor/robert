package org.vidogram.messenger.f;

import android.annotation.TargetApi;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaFormat;
import java.io.File;
import java.util.ArrayList;

@TargetApi(16)
public class c
{
  private com.b.a.b.g a = com.b.a.b.g.j;
  private ArrayList<g> b = new ArrayList();
  private File c;
  private int d;
  private int e;

  public int a(MediaFormat paramMediaFormat, boolean paramBoolean)
  {
    this.b.add(new g(this.b.size(), paramMediaFormat, paramBoolean));
    return this.b.size() - 1;
  }

  public com.b.a.b.g a()
  {
    return this.a;
  }

  public void a(int paramInt)
  {
    if (paramInt == 0)
      this.a = com.b.a.b.g.j;
    do
    {
      return;
      if (paramInt == 90)
      {
        this.a = com.b.a.b.g.k;
        return;
      }
      if (paramInt != 180)
        continue;
      this.a = com.b.a.b.g.l;
      return;
    }
    while (paramInt != 270);
    this.a = com.b.a.b.g.m;
  }

  public void a(int paramInt1, int paramInt2)
  {
    this.d = paramInt1;
    this.e = paramInt2;
  }

  public void a(int paramInt, long paramLong, MediaCodec.BufferInfo paramBufferInfo)
  {
    if ((paramInt < 0) || (paramInt >= this.b.size()))
      return;
    ((g)this.b.get(paramInt)).a(paramLong, paramBufferInfo);
  }

  public void a(File paramFile)
  {
    this.c = paramFile;
  }

  public ArrayList<g> b()
  {
    return this.b;
  }

  public File c()
  {
    return this.c;
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.f.c
 * JD-Core Version:    0.6.0
 */