package org.vidogram.messenger.exoplayer;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.vidogram.messenger.exoplayer.f.b;
import org.vidogram.messenger.exoplayer.f.r;

public final class MediaFormat
  implements Parcelable
{
  public static final Parcelable.Creator<MediaFormat> CREATOR = new Parcelable.Creator()
  {
    public MediaFormat a(Parcel paramParcel)
    {
      return new MediaFormat(paramParcel);
    }

    public MediaFormat[] a(int paramInt)
    {
      return new MediaFormat[paramInt];
    }
  };
  public final String a;
  public final String b;
  public final int c;
  public final int d;
  public final long e;
  public final List<byte[]> f;
  public final boolean g;
  public final int h;
  public final int i;
  public final int j;
  public final int k;
  public final int l;
  public final float m;
  public final int n;
  public final int o;
  public final int p;
  public final int q;
  public final int r;
  public final String s;
  public final long t;
  private int u;
  private android.media.MediaFormat v;

  MediaFormat(Parcel paramParcel)
  {
    this.a = paramParcel.readString();
    this.b = paramParcel.readString();
    this.c = paramParcel.readInt();
    this.d = paramParcel.readInt();
    this.e = paramParcel.readLong();
    this.h = paramParcel.readInt();
    this.i = paramParcel.readInt();
    this.l = paramParcel.readInt();
    this.m = paramParcel.readFloat();
    this.n = paramParcel.readInt();
    this.o = paramParcel.readInt();
    this.s = paramParcel.readString();
    this.t = paramParcel.readLong();
    this.f = new ArrayList();
    paramParcel.readList(this.f, null);
    if (paramParcel.readInt() == 1);
    while (true)
    {
      this.g = bool;
      this.j = paramParcel.readInt();
      this.k = paramParcel.readInt();
      this.p = paramParcel.readInt();
      this.q = paramParcel.readInt();
      this.r = paramParcel.readInt();
      return;
      bool = false;
    }
  }

  MediaFormat(String paramString1, String paramString2, int paramInt1, int paramInt2, long paramLong1, int paramInt3, int paramInt4, int paramInt5, float paramFloat, int paramInt6, int paramInt7, String paramString3, long paramLong2, List<byte[]> paramList, boolean paramBoolean, int paramInt8, int paramInt9, int paramInt10, int paramInt11, int paramInt12)
  {
    this.a = paramString1;
    this.b = b.a(paramString2);
    this.c = paramInt1;
    this.d = paramInt2;
    this.e = paramLong1;
    this.h = paramInt3;
    this.i = paramInt4;
    this.l = paramInt5;
    this.m = paramFloat;
    this.n = paramInt6;
    this.o = paramInt7;
    this.s = paramString3;
    this.t = paramLong2;
    paramString1 = paramList;
    if (paramList == null)
      paramString1 = Collections.emptyList();
    this.f = paramString1;
    this.g = paramBoolean;
    this.j = paramInt8;
    this.k = paramInt9;
    this.p = paramInt10;
    this.q = paramInt11;
    this.r = paramInt12;
  }

  public static MediaFormat a()
  {
    return a(null, "application/id3", -1, -1L);
  }

  public static MediaFormat a(String paramString1, String paramString2, int paramInt1, int paramInt2, long paramLong, int paramInt3, int paramInt4, List<byte[]> paramList, int paramInt5, float paramFloat)
  {
    return new MediaFormat(paramString1, paramString2, paramInt1, paramInt2, paramLong, paramInt3, paramInt4, paramInt5, paramFloat, -1, -1, null, 9223372036854775807L, paramList, false, -1, -1, -1, -1, -1);
  }

  public static MediaFormat a(String paramString1, String paramString2, int paramInt1, int paramInt2, long paramLong, int paramInt3, int paramInt4, List<byte[]> paramList, String paramString3)
  {
    return a(paramString1, paramString2, paramInt1, paramInt2, paramLong, paramInt3, paramInt4, paramList, paramString3, -1);
  }

  public static MediaFormat a(String paramString1, String paramString2, int paramInt1, int paramInt2, long paramLong, int paramInt3, int paramInt4, List<byte[]> paramList, String paramString3, int paramInt5)
  {
    return new MediaFormat(paramString1, paramString2, paramInt1, paramInt2, paramLong, -1, -1, -1, -1.0F, paramInt3, paramInt4, paramString3, 9223372036854775807L, paramList, false, -1, -1, paramInt5, -1, -1);
  }

  public static MediaFormat a(String paramString1, String paramString2, int paramInt, long paramLong)
  {
    return new MediaFormat(paramString1, paramString2, paramInt, -1, paramLong, -1, -1, -1, -1.0F, -1, -1, null, 9223372036854775807L, null, false, -1, -1, -1, -1, -1);
  }

  public static MediaFormat a(String paramString1, String paramString2, int paramInt, long paramLong, String paramString3)
  {
    return a(paramString1, paramString2, paramInt, paramLong, paramString3, 9223372036854775807L);
  }

  public static MediaFormat a(String paramString1, String paramString2, int paramInt, long paramLong1, String paramString3, long paramLong2)
  {
    return new MediaFormat(paramString1, paramString2, paramInt, -1, paramLong1, -1, -1, -1, -1.0F, -1, -1, paramString3, paramLong2, null, false, -1, -1, -1, -1, -1);
  }

  public static MediaFormat a(String paramString1, String paramString2, int paramInt, long paramLong, List<byte[]> paramList, String paramString3)
  {
    return new MediaFormat(paramString1, paramString2, paramInt, -1, paramLong, -1, -1, -1, -1.0F, -1, -1, paramString3, 9223372036854775807L, paramList, false, -1, -1, -1, -1, -1);
  }

  @TargetApi(16)
  private static final void a(android.media.MediaFormat paramMediaFormat, String paramString, int paramInt)
  {
    if (paramInt != -1)
      paramMediaFormat.setInteger(paramString, paramInt);
  }

  @TargetApi(16)
  private static final void a(android.media.MediaFormat paramMediaFormat, String paramString1, String paramString2)
  {
    if (paramString2 != null)
      paramMediaFormat.setString(paramString1, paramString2);
  }

  public MediaFormat a(int paramInt)
  {
    return new MediaFormat(this.a, this.b, this.c, paramInt, this.e, this.h, this.i, this.l, this.m, this.n, this.o, this.s, this.t, this.f, this.g, this.j, this.k, this.p, this.q, this.r);
  }

  public MediaFormat a(int paramInt1, int paramInt2)
  {
    return new MediaFormat(this.a, this.b, this.c, this.d, this.e, this.h, this.i, this.l, this.m, this.n, this.o, this.s, this.t, this.f, this.g, this.j, this.k, this.p, paramInt1, paramInt2);
  }

  @SuppressLint({"InlinedApi"})
  @TargetApi(16)
  public final android.media.MediaFormat b()
  {
    if (this.v == null)
    {
      android.media.MediaFormat localMediaFormat = new android.media.MediaFormat();
      localMediaFormat.setString("mime", this.b);
      a(localMediaFormat, "language", this.s);
      a(localMediaFormat, "max-input-size", this.d);
      a(localMediaFormat, "width", this.h);
      a(localMediaFormat, "height", this.i);
      a(localMediaFormat, "rotation-degrees", this.l);
      a(localMediaFormat, "max-width", this.j);
      a(localMediaFormat, "max-height", this.k);
      a(localMediaFormat, "channel-count", this.n);
      a(localMediaFormat, "sample-rate", this.o);
      a(localMediaFormat, "encoder-delay", this.q);
      a(localMediaFormat, "encoder-padding", this.r);
      int i1 = 0;
      while (i1 < this.f.size())
      {
        localMediaFormat.setByteBuffer("csd-" + i1, ByteBuffer.wrap((byte[])this.f.get(i1)));
        i1 += 1;
      }
      if (this.e != -1L)
        localMediaFormat.setLong("durationUs", this.e);
      this.v = localMediaFormat;
    }
    return this.v;
  }

  public int describeContents()
  {
    return 0;
  }

  public boolean equals(Object paramObject)
  {
    int i3 = 0;
    int i2;
    if (this == paramObject)
      i2 = 1;
    do
    {
      do
      {
        do
        {
          do
          {
            do
            {
              do
              {
                do
                {
                  do
                  {
                    do
                    {
                      do
                      {
                        do
                        {
                          do
                          {
                            do
                            {
                              do
                              {
                                do
                                {
                                  do
                                  {
                                    do
                                    {
                                      do
                                      {
                                        do
                                        {
                                          do
                                          {
                                            do
                                            {
                                              do
                                              {
                                                return i2;
                                                i2 = i3;
                                              }
                                              while (paramObject == null);
                                              i2 = i3;
                                            }
                                            while (getClass() != paramObject.getClass());
                                            paramObject = (MediaFormat)paramObject;
                                            i2 = i3;
                                          }
                                          while (this.g != paramObject.g);
                                          i2 = i3;
                                        }
                                        while (this.c != paramObject.c);
                                        i2 = i3;
                                      }
                                      while (this.d != paramObject.d);
                                      i2 = i3;
                                    }
                                    while (this.e != paramObject.e);
                                    i2 = i3;
                                  }
                                  while (this.h != paramObject.h);
                                  i2 = i3;
                                }
                                while (this.i != paramObject.i);
                                i2 = i3;
                              }
                              while (this.l != paramObject.l);
                              i2 = i3;
                            }
                            while (this.m != paramObject.m);
                            i2 = i3;
                          }
                          while (this.j != paramObject.j);
                          i2 = i3;
                        }
                        while (this.k != paramObject.k);
                        i2 = i3;
                      }
                      while (this.n != paramObject.n);
                      i2 = i3;
                    }
                    while (this.o != paramObject.o);
                    i2 = i3;
                  }
                  while (this.p != paramObject.p);
                  i2 = i3;
                }
                while (this.q != paramObject.q);
                i2 = i3;
              }
              while (this.r != paramObject.r);
              i2 = i3;
            }
            while (this.t != paramObject.t);
            i2 = i3;
          }
          while (!r.a(this.a, paramObject.a));
          i2 = i3;
        }
        while (!r.a(this.s, paramObject.s));
        i2 = i3;
      }
      while (!r.a(this.b, paramObject.b));
      i2 = i3;
    }
    while (this.f.size() != paramObject.f.size());
    int i1 = 0;
    while (true)
    {
      if (i1 >= this.f.size())
        break label397;
      i2 = i3;
      if (!Arrays.equals((byte[])this.f.get(i1), (byte[])paramObject.f.get(i1)))
        break;
      i1 += 1;
    }
    label397: return true;
  }

  public int hashCode()
  {
    int i5 = 0;
    if (this.u == 0)
    {
      int i1;
      int i2;
      label28: int i6;
      int i7;
      int i8;
      int i9;
      int i10;
      int i11;
      int i12;
      int i3;
      label85: int i13;
      int i14;
      int i15;
      int i16;
      int i17;
      int i18;
      int i19;
      if (this.a == null)
      {
        i1 = 0;
        if (this.b != null)
          break label308;
        i2 = 0;
        i6 = this.c;
        i7 = this.d;
        i8 = this.h;
        i9 = this.i;
        i10 = this.l;
        i11 = Float.floatToRawIntBits(this.m);
        i12 = (int)this.e;
        if (!this.g)
          break label319;
        i3 = 1231;
        i13 = this.j;
        i14 = this.k;
        i15 = this.n;
        i16 = this.o;
        i17 = this.p;
        i18 = this.q;
        i19 = this.r;
        if (this.s != null)
          break label326;
      }
      label308: label319: label326: for (int i4 = 0; ; i4 = this.s.hashCode())
      {
        i2 = (i4 + ((((((((i3 + ((((((((i2 + (i1 + 527) * 31) * 31 + i6) * 31 + i7) * 31 + i8) * 31 + i9) * 31 + i10) * 31 + i11) * 31 + i12) * 31) * 31 + i13) * 31 + i14) * 31 + i15) * 31 + i16) * 31 + i17) * 31 + i18) * 31 + i19) * 31) * 31 + (int)this.t;
        i1 = i5;
        while (i1 < this.f.size())
        {
          i2 = Arrays.hashCode((byte[])this.f.get(i1)) + i2 * 31;
          i1 += 1;
        }
        i1 = this.a.hashCode();
        break;
        i2 = this.b.hashCode();
        break label28;
        i3 = 1237;
        break label85;
      }
      this.u = i2;
    }
    return this.u;
  }

  public String toString()
  {
    return "MediaFormat(" + this.a + ", " + this.b + ", " + this.c + ", " + this.d + ", " + this.h + ", " + this.i + ", " + this.l + ", " + this.m + ", " + this.n + ", " + this.o + ", " + this.s + ", " + this.e + ", " + this.g + ", " + this.j + ", " + this.k + ", " + this.p + ", " + this.q + ", " + this.r + ")";
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.a);
    paramParcel.writeString(this.b);
    paramParcel.writeInt(this.c);
    paramParcel.writeInt(this.d);
    paramParcel.writeLong(this.e);
    paramParcel.writeInt(this.h);
    paramParcel.writeInt(this.i);
    paramParcel.writeInt(this.l);
    paramParcel.writeFloat(this.m);
    paramParcel.writeInt(this.n);
    paramParcel.writeInt(this.o);
    paramParcel.writeString(this.s);
    paramParcel.writeLong(this.t);
    paramParcel.writeList(this.f);
    if (this.g);
    for (paramInt = 1; ; paramInt = 0)
    {
      paramParcel.writeInt(paramInt);
      paramParcel.writeInt(this.j);
      paramParcel.writeInt(this.k);
      paramParcel.writeInt(this.p);
      paramParcel.writeInt(this.q);
      paramParcel.writeInt(this.r);
      return;
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.exoplayer.MediaFormat
 * JD-Core Version:    0.6.0
 */