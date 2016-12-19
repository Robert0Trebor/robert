package org.vidogram.messenger.exoplayer.c.c;

import android.util.Log;
import android.util.Pair;
import java.util.UUID;
import org.vidogram.messenger.exoplayer.f.m;

public final class g
{
  public static UUID a(byte[] paramArrayOfByte)
  {
    paramArrayOfByte = b(paramArrayOfByte);
    if (paramArrayOfByte == null)
      return null;
    return (UUID)paramArrayOfByte.first;
  }

  private static Pair<UUID, byte[]> b(byte[] paramArrayOfByte)
  {
    paramArrayOfByte = new m(paramArrayOfByte);
    if (paramArrayOfByte.c() < 32);
    int i;
    UUID localUUID;
    do
    {
      do
      {
        return null;
        paramArrayOfByte.b(0);
      }
      while ((paramArrayOfByte.m() != paramArrayOfByte.b() + 4) || (paramArrayOfByte.m() != a.T));
      i = a.a(paramArrayOfByte.m());
      if (i > 1)
      {
        Log.w("PsshAtomUtil", "Unsupported pssh version: " + i);
        return null;
      }
      localUUID = new UUID(paramArrayOfByte.o(), paramArrayOfByte.o());
      if (i == 1)
        paramArrayOfByte.c(paramArrayOfByte.s() * 16);
      i = paramArrayOfByte.s();
    }
    while (i != paramArrayOfByte.b());
    byte[] arrayOfByte = new byte[i];
    paramArrayOfByte.a(arrayOfByte, 0, i);
    return Pair.create(localUUID, arrayOfByte);
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.exoplayer.c.c.g
 * JD-Core Version:    0.6.0
 */