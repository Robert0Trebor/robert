package org.vidogram.tgnet;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.vidogram.messenger.n;

public class NativeByteBuffer extends a
{
  private static final ThreadLocal<NativeByteBuffer> f = new ThreadLocal()
  {
    protected NativeByteBuffer a()
    {
      return new NativeByteBuffer(0, true, null);
    }
  };
  protected int a;
  public ByteBuffer b;
  public boolean c = true;
  private boolean d;
  private int e;

  public NativeByteBuffer(int paramInt)
  {
    if (paramInt >= 0)
    {
      this.a = native_getFreeBuffer(paramInt);
      if (this.a != 0)
      {
        this.b = native_getJavaByteBuffer(this.a);
        this.b.position(0);
        this.b.limit(paramInt);
        this.b.order(ByteOrder.LITTLE_ENDIAN);
      }
      return;
    }
    throw new Exception("invalid NativeByteBuffer size");
  }

  private NativeByteBuffer(int paramInt, boolean paramBoolean)
  {
  }

  public NativeByteBuffer(boolean paramBoolean)
  {
    this.d = paramBoolean;
  }

  public static NativeByteBuffer b(int paramInt)
  {
    NativeByteBuffer localNativeByteBuffer = (NativeByteBuffer)f.get();
    if (paramInt != 0)
    {
      if (!localNativeByteBuffer.c)
        n.a("tmessages", "forgot to reuse?");
      localNativeByteBuffer.a = paramInt;
      localNativeByteBuffer.c = false;
      localNativeByteBuffer.b = native_getJavaByteBuffer(paramInt);
      localNativeByteBuffer.b.limit(native_limit(paramInt));
      paramInt = native_position(paramInt);
      if (paramInt <= localNativeByteBuffer.b.limit())
        localNativeByteBuffer.b.position(paramInt);
      localNativeByteBuffer.b.order(ByteOrder.LITTLE_ENDIAN);
    }
    return localNativeByteBuffer;
  }

  public static native int native_getFreeBuffer(int paramInt);

  public static native ByteBuffer native_getJavaByteBuffer(int paramInt);

  public static native int native_limit(int paramInt);

  public static native int native_position(int paramInt);

  public static native void native_reuse(int paramInt);

  public int a()
  {
    return this.b.position();
  }

  public void a(byte paramByte)
  {
    try
    {
      if (!this.d)
      {
        this.b.put(paramByte);
        return;
      }
      this.e += 1;
      return;
    }
    catch (Exception localException)
    {
      n.a("tmessages", "write byte error");
    }
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
    try
    {
      if (!this.d)
      {
        this.b.putInt(paramInt);
        return;
      }
      this.e += 4;
      return;
    }
    catch (Exception localException)
    {
      n.a("tmessages", "write int32 error");
    }
  }

  public void a(long paramLong)
  {
    try
    {
      if (!this.d)
      {
        this.b.putLong(paramLong);
        return;
      }
      this.e += 8;
      return;
    }
    catch (Exception localException)
    {
      n.a("tmessages", "write int64 error");
    }
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
    while (true)
    {
      int j;
      try
      {
        j = paramNativeByteBuffer.b();
        if (j > 253)
          break label103;
        if (this.d)
          continue;
        this.b.put((byte)j);
        if (this.d)
          break label172;
        paramNativeByteBuffer.c();
        this.b.put(paramNativeByteBuffer.b);
        break label198;
        if ((j + i) % 4 != 0)
        {
          if (this.d)
            break label185;
          this.b.put(0);
          break label210;
          this.e += 1;
          continue;
        }
      }
      catch (Exception paramNativeByteBuffer)
      {
        n.a("tmessages", paramNativeByteBuffer);
      }
      return;
      label103: if (!this.d)
      {
        this.b.put(-2);
        this.b.put((byte)j);
        this.b.put((byte)(j >> 8));
        this.b.put((byte)(j >> 16));
        continue;
      }
      this.e += 4;
      continue;
      label172: this.e += j;
      break label198;
      label185: this.e += 1;
      label198: if (j <= 253)
      {
        i = 1;
        continue;
        label210: i += 1;
        continue;
      }
      int i = 4;
    }
  }

  public void a(boolean paramBoolean)
  {
    if (!this.d)
    {
      if (paramBoolean)
      {
        a(-1720552011);
        return;
      }
      a(-1132882121);
      return;
    }
    this.e += 4;
  }

  public void a(byte[] paramArrayOfByte)
  {
    while (true)
    {
      try
      {
        if (paramArrayOfByte.length > 253)
          break label102;
        if (this.d)
          continue;
        this.b.put((byte)paramArrayOfByte.length);
        if (this.d)
          break label174;
        this.b.put(paramArrayOfByte);
        if (paramArrayOfByte.length > 253)
          break label205;
        i = 1;
        if ((paramArrayOfByte.length + i) % 4 != 0)
        {
          if (this.d)
            break label188;
          this.b.put(0);
          break label198;
          this.e += 1;
          continue;
        }
      }
      catch (Exception paramArrayOfByte)
      {
        n.a("tmessages", "write byte array error");
      }
      return;
      label102: if (!this.d)
      {
        this.b.put(-2);
        this.b.put((byte)paramArrayOfByte.length);
        this.b.put((byte)(paramArrayOfByte.length >> 8));
        this.b.put((byte)(paramArrayOfByte.length >> 16));
        continue;
      }
      this.e += 4;
      continue;
      label174: this.e += paramArrayOfByte.length;
      continue;
      label188: this.e += 1;
      label198: i += 1;
      continue;
      label205: int i = 4;
    }
  }

  public void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    try
    {
      if (!this.d)
      {
        this.b.put(paramArrayOfByte, paramInt1, paramInt2);
        return;
      }
      this.e += paramInt2;
      return;
    }
    catch (Exception paramArrayOfByte)
    {
      n.a("tmessages", "write raw error");
    }
  }

  public int b()
  {
    return this.b.limit();
  }

  public int b(byte paramByte)
  {
    if (paramByte >= 0)
      return paramByte;
    return paramByte + 256;
  }

  public int b(boolean paramBoolean)
  {
    try
    {
      int i = this.b.getInt();
      return i;
    }
    catch (Exception localException)
    {
      if (paramBoolean)
        throw new RuntimeException("read int32 error", localException);
      n.a("tmessages", "read int32 error");
    }
    return 0;
  }

  public void b(NativeByteBuffer paramNativeByteBuffer)
  {
    if (this.d)
    {
      this.e += paramNativeByteBuffer.b();
      return;
    }
    paramNativeByteBuffer.c();
    this.b.put(paramNativeByteBuffer.b);
  }

  public void b(byte[] paramArrayOfByte)
  {
    try
    {
      if (!this.d)
      {
        this.b.put(paramArrayOfByte);
        return;
      }
      this.e += paramArrayOfByte.length;
      return;
    }
    catch (Exception paramArrayOfByte)
    {
      n.a("tmessages", "write raw error");
    }
  }

  public void c()
  {
    if (this.d)
    {
      this.e = 0;
      return;
    }
    this.b.rewind();
  }

  public void c(int paramInt)
  {
    this.b.position(paramInt);
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

  public int d()
  {
    if (!this.d)
      return this.b.position();
    return this.e;
  }

  public long d(boolean paramBoolean)
  {
    try
    {
      long l = this.b.getLong();
      return l;
    }
    catch (Exception localException)
    {
      if (paramBoolean)
        throw new RuntimeException("read int64 error", localException);
      n.a("tmessages", "read int64 error");
    }
    return 0L;
  }

  public void d(int paramInt)
  {
    a((byte)paramInt);
  }

  public String e(boolean paramBoolean)
  {
    while (true)
    {
      try
      {
        int j = b(this.b.get());
        if (j >= 254)
        {
          j = b(this.b.get());
          int k = b(this.b.get());
          int m = b(this.b.get());
          i = 4;
          j = j | k << 8 | m << 16;
          Object localObject = new byte[j];
          this.b.get(localObject);
          if ((j + i) % 4 == 0)
            continue;
          this.b.get();
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
        return "";
      }
      int i = 1;
    }
  }

  public void e()
  {
    if (this.a != 0)
    {
      this.c = true;
      native_reuse(this.a);
    }
  }

  public byte[] f(boolean paramBoolean)
  {
    int i = 1;
    label150: 
    while (true)
    {
      byte[] arrayOfByte2;
      try
      {
        int j = b(this.b.get());
        if (j < 254)
          break label150;
        j = b(this.b.get());
        int k = b(this.b.get());
        int m = b(this.b.get());
        i = 4;
        j = j | k << 8 | m << 16;
        byte[] arrayOfByte3 = new byte[j];
        this.b.get(arrayOfByte3);
        byte[] arrayOfByte1 = arrayOfByte3;
        if ((j + i) % 4 != 0)
        {
          this.b.get();
          i += 1;
          continue;
        }
      }
      catch (Exception arrayOfByte2)
      {
        if (!paramBoolean)
          continue;
        throw new RuntimeException("read byte array error", localException);
        n.a("tmessages", "read byte array error");
        arrayOfByte2 = new byte[0];
      }
      return arrayOfByte2;
    }
  }

  public NativeByteBuffer g(boolean paramBoolean)
  {
    int i = 1;
    label202: 
    while (true)
    {
      Object localObject;
      try
      {
        int j = b(this.b.get());
        if (j < 254)
          break label202;
        j = b(this.b.get());
        int k = b(this.b.get());
        int m = b(this.b.get());
        i = 4;
        j = j | k << 8 | m << 16;
        NativeByteBuffer localNativeByteBuffer2 = new NativeByteBuffer(j);
        k = this.b.limit();
        this.b.limit(this.b.position() + j);
        localNativeByteBuffer2.b.put(this.b);
        this.b.limit(k);
        localNativeByteBuffer2.b.position(0);
        NativeByteBuffer localNativeByteBuffer1 = localNativeByteBuffer2;
        if ((j + i) % 4 != 0)
        {
          this.b.get();
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
 * Qualified Name:     org.vidogram.tgnet.NativeByteBuffer
 * JD-Core Version:    0.6.0
 */