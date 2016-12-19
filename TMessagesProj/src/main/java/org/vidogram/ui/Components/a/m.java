package org.vidogram.ui.Components.a;

import android.content.Context;
import android.graphics.RectF;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.util.zip.Deflater;
import java.util.zip.Inflater;
import org.vidogram.messenger.ApplicationLoader;
import org.vidogram.messenger.h;
import org.vidogram.messenger.n;

public class m
{
  private RectF a;
  private File b;

  public m(ByteBuffer paramByteBuffer, RectF paramRectF, h paramh)
  {
    this.a = paramRectF;
    try
    {
      this.b = File.createTempFile("paint", ".bin", ApplicationLoader.a.getCacheDir());
      if (this.b == null)
        return;
    }
    catch (Exception paramRectF)
    {
      while (true)
        n.a("tmessages", paramRectF);
      a(paramByteBuffer);
    }
  }

  private void a(ByteBuffer paramByteBuffer)
  {
    FileOutputStream localFileOutputStream;
    Deflater localDeflater;
    try
    {
      byte[] arrayOfByte = paramByteBuffer.array();
      localFileOutputStream = new FileOutputStream(this.b);
      localDeflater = new Deflater(1, true);
      localDeflater.setInput(arrayOfByte, paramByteBuffer.arrayOffset(), paramByteBuffer.remaining());
      localDeflater.finish();
      paramByteBuffer = new byte[1024];
      while (!localDeflater.finished())
        localFileOutputStream.write(paramByteBuffer, 0, localDeflater.deflate(paramByteBuffer));
    }
    catch (Exception paramByteBuffer)
    {
      n.a("tmessages", paramByteBuffer);
      return;
    }
    localDeflater.end();
    localFileOutputStream.close();
  }

  public void a()
  {
    if (this.b != null)
    {
      this.b.delete();
      this.b = null;
    }
  }

  public ByteBuffer b()
  {
    while (true)
    {
      Object localObject;
      ByteArrayOutputStream localByteArrayOutputStream;
      Inflater localInflater;
      try
      {
        localObject = new byte[1024];
        byte[] arrayOfByte = new byte[1024];
        FileInputStream localFileInputStream = new FileInputStream(this.b);
        localByteArrayOutputStream = new ByteArrayOutputStream();
        localInflater = new Inflater(true);
        int i = localFileInputStream.read(localObject);
        if (i == -1)
          continue;
        localInflater.setInput(localObject, 0, i);
        i = localInflater.inflate(arrayOfByte, 0, arrayOfByte.length);
        if (i != 0)
        {
          localByteArrayOutputStream.write(arrayOfByte, 0, i);
          continue;
        }
      }
      catch (Exception localException)
      {
        n.a("tmessages", localException);
        return null;
      }
      if (localInflater.finished())
      {
        localInflater.end();
        localObject = ByteBuffer.wrap(localByteArrayOutputStream.toByteArray(), 0, localByteArrayOutputStream.size());
        localByteArrayOutputStream.close();
        localException.close();
        return localObject;
      }
      boolean bool = localInflater.needsInput();
      if (!bool)
        continue;
    }
  }

  public int c()
  {
    return (int)this.a.left;
  }

  public int d()
  {
    return (int)this.a.top;
  }

  public int e()
  {
    return (int)this.a.width();
  }

  public int f()
  {
    return (int)this.a.height();
  }

  public RectF g()
  {
    return new RectF(this.a);
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.Components.a.m
 * JD-Core Version:    0.6.0
 */