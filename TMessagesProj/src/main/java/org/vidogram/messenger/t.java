package org.vidogram.messenger;

import org.vidogram.tgnet.e;

public class t
{
  public byte[] a;
  public byte[] b;

  public static t a(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, boolean paramBoolean)
  {
    t localt = new t();
    if ((paramArrayOfByte1 == null) || (paramArrayOfByte1.length == 0))
    {
      localt.b = null;
      localt.a = null;
      return localt;
    }
    if (paramBoolean);
    for (int i = 8; ; i = 0)
    {
      Object localObject1 = new e();
      ((e)localObject1).b(paramArrayOfByte2);
      ((e)localObject1).a(paramArrayOfByte1, i, 32);
      byte[] arrayOfByte = Utilities.b(((e)localObject1).c());
      ((e)localObject1).b();
      Object localObject2 = new e();
      ((e)localObject2).a(paramArrayOfByte1, i + 32, 16);
      ((e)localObject2).b(paramArrayOfByte2);
      ((e)localObject2).a(paramArrayOfByte1, i + 48, 16);
      localObject1 = Utilities.b(((e)localObject2).c());
      ((e)localObject2).b();
      e locale = new e();
      locale.a(paramArrayOfByte1, i + 64, 32);
      locale.b(paramArrayOfByte2);
      localObject2 = Utilities.b(locale.c());
      locale.b();
      locale = new e();
      locale.b(paramArrayOfByte2);
      locale.a(paramArrayOfByte1, i + 96, 32);
      paramArrayOfByte1 = Utilities.b(locale.c());
      locale.b();
      paramArrayOfByte2 = new e();
      paramArrayOfByte2.a(arrayOfByte, 0, 8);
      paramArrayOfByte2.a(localObject1, 8, 12);
      paramArrayOfByte2.a(localObject2, 4, 12);
      localt.a = paramArrayOfByte2.c();
      paramArrayOfByte2.b();
      paramArrayOfByte2 = new e();
      paramArrayOfByte2.a(arrayOfByte, 8, 12);
      paramArrayOfByte2.a(localObject1, 0, 8);
      paramArrayOfByte2.a(localObject2, 16, 4);
      paramArrayOfByte2.a(paramArrayOfByte1, 0, 8);
      localt.b = paramArrayOfByte2.c();
      paramArrayOfByte2.b();
      return localt;
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.t
 * JD-Core Version:    0.6.0
 */