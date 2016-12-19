package org.vidogram.tgnet;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import org.vidogram.messenger.n;

public class e extends a
{
  protected boolean a = true;
  private ByteArrayOutputStream b;
  private DataOutputStream c;
  private ByteArrayInputStream d;
  private DataInputStream e;
  private boolean f = false;
  private int g;

  public e()
  {
    this.b = new ByteArrayOutputStream();
    this.c = new DataOutputStream(this.b);
  }

  public e(int paramInt)
  {
    this.b = new ByteArrayOutputStream(paramInt);
    this.c = new DataOutputStream(this.b);
  }

  public e(File paramFile)
  {
    FileInputStream localFileInputStream = new FileInputStream(paramFile);
    paramFile = new byte[(int)paramFile.length()];
    new DataInputStream(localFileInputStream).readFully(paramFile);
    localFileInputStream.close();
    this.a = false;
    this.d = new ByteArrayInputStream(paramFile);
    this.e = new DataInputStream(this.d);
  }

  public e(byte[] paramArrayOfByte)
  {
    this.a = false;
    this.d = new ByteArrayInputStream(paramArrayOfByte);
    this.e = new DataInputStream(this.d);
    this.g = 0;
  }

  private void a(int paramInt, DataOutputStream paramDataOutputStream)
  {
    int i = 0;
    while (true)
      if (i < 4)
        try
        {
          paramDataOutputStream.write(paramInt >> i * 8);
          i += 1;
        }
        catch (Exception paramDataOutputStream)
        {
          n.a("tmessages", "write int32 error");
        }
  }

  private void a(long paramLong, DataOutputStream paramDataOutputStream)
  {
    int i = 0;
    while (true)
      if (i < 8)
      {
        int j = (int)(paramLong >> i * 8);
        try
        {
          paramDataOutputStream.write(j);
          i += 1;
        }
        catch (Exception paramDataOutputStream)
        {
          n.a("tmessages", "write int64 error");
        }
      }
  }

  public int a()
  {
    return this.g;
  }

  public void a(double paramDouble)
  {
    try
    {
      a(Double.doubleToRawLongBits(paramDouble));
      return;
    }
    catch (Exception localException)
    {
      n.a("tmessages", "write double error");
    }
  }

  public void a(int paramInt)
  {
    if (!this.f)
    {
      a(paramInt, this.c);
      return;
    }
    this.g += 4;
  }

  public void a(long paramLong)
  {
    if (!this.f)
    {
      a(paramLong, this.c);
      return;
    }
    this.g += 8;
  }

  public void a(String paramString)
  {
    try
    {
      a(paramString.getBytes("UTF-8"));
      return;
    }
    catch (Exception paramString)
    {
      n.a("tmessages", "write string error");
    }
  }

  public void a(NativeByteBuffer paramNativeByteBuffer)
  {
  }

  public void a(boolean paramBoolean)
  {
    if (!this.f)
    {
      if (paramBoolean)
      {
        a(-1720552011);
        return;
      }
      a(-1132882121);
      return;
    }
    this.g += 4;
  }

  public void a(byte[] paramArrayOfByte)
  {
    while (true)
    {
      try
      {
        if (paramArrayOfByte.length > 253)
          break label98;
        if (this.f)
          continue;
        this.c.write(paramArrayOfByte.length);
        if (this.f)
          break label164;
        this.c.write(paramArrayOfByte);
        if (paramArrayOfByte.length > 253)
          break label195;
        i = 1;
        if ((paramArrayOfByte.length + i) % 4 != 0)
        {
          if (this.f)
            break label178;
          this.c.write(0);
          break label188;
          this.g += 1;
          continue;
        }
      }
      catch (Exception paramArrayOfByte)
      {
        n.a("tmessages", "write byte array error");
      }
      return;
      label98: if (!this.f)
      {
        this.c.write(254);
        this.c.write(paramArrayOfByte.length);
        this.c.write(paramArrayOfByte.length >> 8);
        this.c.write(paramArrayOfByte.length >> 16);
        continue;
      }
      this.g += 4;
      continue;
      label164: this.g += paramArrayOfByte.length;
      continue;
      label178: this.g += 1;
      label188: i += 1;
      continue;
      label195: int i = 4;
    }
  }

  public void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    try
    {
      if (!this.f)
      {
        this.c.write(paramArrayOfByte, paramInt1, paramInt2);
        return;
      }
      this.g += paramInt2;
      return;
    }
    catch (Exception paramArrayOfByte)
    {
      n.a("tmessages", "write bytes error");
    }
  }

  public int b(boolean paramBoolean)
  {
    int i = 0;
    int j = 0;
    while (true)
    {
      int k = i;
      if (k < 4);
      try
      {
        int m = this.e.read();
        this.g += 1;
        i = k + 1;
        j = m << k * 8 | j;
        continue;
        return j;
      }
      catch (Exception localException)
      {
        if (paramBoolean)
          throw new RuntimeException("read int32 error", localException);
        n.a("tmessages", "read int32 error");
      }
    }
    return 0;
  }

  public void b()
  {
    try
    {
      if (this.d != null)
      {
        this.d.close();
        this.d = null;
      }
    }
    catch (Exception localException4)
    {
      try
      {
        if (this.e != null)
        {
          this.e.close();
          this.e = null;
        }
      }
      catch (Exception localException4)
      {
        try
        {
          if (this.b != null)
          {
            this.b.close();
            this.b = null;
          }
        }
        catch (Exception localException4)
        {
          try
          {
            while (true)
            {
              if (this.c != null)
              {
                this.c.close();
                this.c = null;
              }
              return;
              localException1 = localException1;
              n.a("tmessages", localException1);
              continue;
              localException2 = localException2;
              n.a("tmessages", localException2);
              continue;
              localException3 = localException3;
              n.a("tmessages", localException3);
            }
          }
          catch (Exception localException4)
          {
            n.a("tmessages", localException4);
          }
        }
      }
    }
  }

  public void b(byte[] paramArrayOfByte)
  {
    try
    {
      if (!this.f)
      {
        this.c.write(paramArrayOfByte);
        return;
      }
      this.g += paramArrayOfByte.length;
      return;
    }
    catch (Exception paramArrayOfByte)
    {
      n.a("tmessages", "write raw error");
    }
  }

  public boolean c(boolean paramBoolean)
  {
    int j = 0;
    int i = b(paramBoolean);
    if (i == -1720552011)
      j = 1;
    do
      return j;
    while (i == -1132882121);
    if (paramBoolean)
      throw new RuntimeException("Not bool value!");
    n.a("tmessages", "Not bool value!");
    return false;
  }

  public byte[] c()
  {
    return this.b.toByteArray();
  }

  public long d(boolean paramBoolean)
  {
    int i = 0;
    long l1 = 0L;
    while (true)
    {
      if (i < 8);
      try
      {
        long l2 = this.e.read();
        this.g += 1;
        int j = i + 1;
        l1 = l2 << i * 8 | l1;
        i = j;
        continue;
        return l1;
      }
      catch (Exception localException)
      {
        if (paramBoolean)
          throw new RuntimeException("read int64 error", localException);
        n.a("tmessages", "read int64 error");
      }
    }
    return 0L;
  }

  public String e(boolean paramBoolean)
  {
    while (true)
    {
      try
      {
        int j = this.e.read();
        this.g += 1;
        if (j >= 254)
        {
          j = this.e.read();
          int k = this.e.read();
          int m = this.e.read();
          this.g += 3;
          i = 4;
          j = j | k << 8 | m << 16;
          Object localObject = new byte[j];
          this.e.read(localObject);
          this.g += 1;
          if ((j + i) % 4 == 0)
            continue;
          this.e.read();
          this.g += 1;
          i += 1;
          continue;
          localObject = new String(localObject, "UTF-8");
          return localObject;
        }
      }
      catch (Exception localException)
      {
        if (!paramBoolean)
          continue;
        throw new RuntimeException("read string error", localException);
        n.a("tmessages", "read string error");
        return null;
      }
      int i = 1;
    }
  }

  public byte[] f(boolean paramBoolean)
  {
    int i = 1;
    label172: 
    while (true)
    {
      Object localObject;
      try
      {
        int j = this.e.read();
        this.g += 1;
        if (j < 254)
          break label172;
        j = this.e.read();
        int k = this.e.read();
        int m = this.e.read();
        this.g += 3;
        i = 4;
        j = j | k << 8 | m << 16;
        byte[] arrayOfByte2 = new byte[j];
        this.e.read(arrayOfByte2);
        this.g += 1;
        byte[] arrayOfByte1 = arrayOfByte2;
        if ((j + i) % 4 != 0)
        {
          this.e.read();
          this.g += 1;
          i += 1;
          continue;
        }
      }
      catch (Exception localObject)
      {
        if (!paramBoolean)
          continue;
        throw new RuntimeException("read byte array error", localException);
        n.a("tmessages", "read byte array error");
        localObject = null;
      }
      return localObject;
    }
  }

  public NativeByteBuffer g(boolean paramBoolean)
  {
    return null;
  }

  public double h(boolean paramBoolean)
  {
    try
    {
      double d1 = Double.longBitsToDouble(d(paramBoolean));
      return d1;
    }
    catch (Exception localException)
    {
      if (paramBoolean)
        throw new RuntimeException("read double error", localException);
      n.a("tmessages", "read double error");
    }
    return 0.0D;
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.tgnet.e
 * JD-Core Version:    0.6.0
 */