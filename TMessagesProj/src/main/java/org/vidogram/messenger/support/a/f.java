package org.vidogram.messenger.support.a;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public abstract interface f extends IInterface
{
  public abstract void a(int paramInt, Bundle paramBundle);

  public abstract void a(String paramString, Bundle paramBundle);

  public static abstract class a extends Binder
    implements f
  {
    public a()
    {
      attachInterface(this, "android.support.customtabs.ICustomTabsCallback");
    }

    public static f a(IBinder paramIBinder)
    {
      if (paramIBinder == null)
        return null;
      IInterface localIInterface = paramIBinder.queryLocalInterface("android.support.customtabs.ICustomTabsCallback");
      if ((localIInterface != null) && ((localIInterface instanceof f)))
        return (f)localIInterface;
      return new a(paramIBinder);
    }

    public IBinder asBinder()
    {
      return this;
    }

    public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    {
      Object localObject = null;
      String str = null;
      switch (paramInt1)
      {
      default:
        return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
      case 2:
        paramParcel1.enforceInterface("android.support.customtabs.ICustomTabsCallback");
        paramInt1 = paramParcel1.readInt();
        paramParcel2 = str;
        if (paramParcel1.readInt() != 0)
          paramParcel2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
        a(paramInt1, paramParcel2);
        return true;
      case 3:
        paramParcel1.enforceInterface("android.support.customtabs.ICustomTabsCallback");
        str = paramParcel1.readString();
        paramParcel2 = localObject;
        if (paramParcel1.readInt() != 0)
          paramParcel2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
        a(str, paramParcel2);
        return true;
      case 1598968902:
      }
      paramParcel2.writeString("android.support.customtabs.ICustomTabsCallback");
      return true;
    }

    private static class a
      implements f
    {
      private IBinder a;

      a(IBinder paramIBinder)
      {
        this.a = paramIBinder;
      }

      public void a(int paramInt, Bundle paramBundle)
      {
        Parcel localParcel = Parcel.obtain();
        try
        {
          localParcel.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
          localParcel.writeInt(paramInt);
          if (paramBundle != null)
          {
            localParcel.writeInt(1);
            paramBundle.writeToParcel(localParcel, 0);
          }
          while (true)
          {
            this.a.transact(2, localParcel, null, 1);
            return;
            localParcel.writeInt(0);
          }
        }
        finally
        {
          localParcel.recycle();
        }
        throw paramBundle;
      }

      public void a(String paramString, Bundle paramBundle)
      {
        Parcel localParcel = Parcel.obtain();
        try
        {
          localParcel.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
          localParcel.writeString(paramString);
          if (paramBundle != null)
          {
            localParcel.writeInt(1);
            paramBundle.writeToParcel(localParcel, 0);
          }
          while (true)
          {
            this.a.transact(3, localParcel, null, 1);
            return;
            localParcel.writeInt(0);
          }
        }
        finally
        {
          localParcel.recycle();
        }
        throw paramString;
      }

      public IBinder asBinder()
      {
        return this.a;
      }
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.support.a.f
 * JD-Core Version:    0.6.0
 */