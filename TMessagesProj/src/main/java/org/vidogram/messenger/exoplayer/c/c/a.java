package org.vidogram.messenger.exoplayer.c.c;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.vidogram.messenger.exoplayer.f.m;
import org.vidogram.messenger.exoplayer.f.r;

abstract class a
{
  public static final int A;
  public static final int B;
  public static final int C;
  public static final int D;
  public static final int E;
  public static final int F;
  public static final int G;
  public static final int H;
  public static final int I;
  public static final int J;
  public static final int K;
  public static final int L;
  public static final int M;
  public static final int N;
  public static final int O;
  public static final int P;
  public static final int Q;
  public static final int R;
  public static final int S;
  public static final int T;
  public static final int U;
  public static final int V;
  public static final int W;
  public static final int X;
  public static final int Y;
  public static final int Z;
  public static final int a = r.c("ftyp");
  public static final int aA;
  public static final int aB;
  public static final int aC;
  public static final int aD;
  public static final int aE;
  public static final int aF;
  public static final int aG;
  public static final int aH;
  public static final int aI;
  public static final int aa;
  public static final int ab;
  public static final int ac;
  public static final int ad;
  public static final int ae;
  public static final int af;
  public static final int ag;
  public static final int ah;
  public static final int ai;
  public static final int aj;
  public static final int ak;
  public static final int al;
  public static final int am;
  public static final int an;
  public static final int ao;
  public static final int ap;
  public static final int aq;
  public static final int ar;
  public static final int as;
  public static final int at;
  public static final int au;
  public static final int av;
  public static final int aw;
  public static final int ax;
  public static final int ay;
  public static final int az;
  public static final int b = r.c("avc1");
  public static final int c = r.c("avc3");
  public static final int d = r.c("hvc1");
  public static final int e = r.c("hev1");
  public static final int f = r.c("s263");
  public static final int g = r.c("d263");
  public static final int h = r.c("mdat");
  public static final int i = r.c("mp4a");
  public static final int j = r.c("wave");
  public static final int k = r.c("lpcm");
  public static final int l = r.c("sowt");
  public static final int m = r.c("ac-3");
  public static final int n = r.c("dac3");
  public static final int o = r.c("ec-3");
  public static final int p = r.c("dec3");
  public static final int q = r.c("dtsc");
  public static final int r = r.c("dtsh");
  public static final int s = r.c("dtsl");
  public static final int t = r.c("dtse");
  public static final int u = r.c("ddts");
  public static final int v = r.c("tfdt");
  public static final int w = r.c("tfhd");
  public static final int x = r.c("trex");
  public static final int y = r.c("trun");
  public static final int z = r.c("sidx");
  public final int aJ;

  static
  {
    A = r.c("moov");
    B = r.c("mvhd");
    C = r.c("trak");
    D = r.c("mdia");
    E = r.c("minf");
    F = r.c("stbl");
    G = r.c("avcC");
    H = r.c("hvcC");
    I = r.c("esds");
    J = r.c("moof");
    K = r.c("traf");
    L = r.c("mvex");
    M = r.c("mehd");
    N = r.c("tkhd");
    O = r.c("edts");
    P = r.c("elst");
    Q = r.c("mdhd");
    R = r.c("hdlr");
    S = r.c("stsd");
    T = r.c("pssh");
    U = r.c("sinf");
    V = r.c("schm");
    W = r.c("schi");
    X = r.c("tenc");
    Y = r.c("encv");
    Z = r.c("enca");
    aa = r.c("frma");
    ab = r.c("saiz");
    ac = r.c("saio");
    ad = r.c("sbgp");
    ae = r.c("sgpd");
    af = r.c("uuid");
    ag = r.c("senc");
    ah = r.c("pasp");
    ai = r.c("TTML");
    aj = r.c("vmhd");
    ak = r.c("mp4v");
    al = r.c("stts");
    am = r.c("stss");
    an = r.c("ctts");
    ao = r.c("stsc");
    ap = r.c("stsz");
    aq = r.c("stz2");
    ar = r.c("stco");
    as = r.c("co64");
    at = r.c("tx3g");
    au = r.c("wvtt");
    av = r.c("stpp");
    aw = r.c("samr");
    ax = r.c("sawb");
    ay = r.c("udta");
    az = r.c("meta");
    aA = r.c("ilst");
    aB = r.c("mean");
    aC = r.c("name");
    aD = r.c("data");
    aE = r.c("emsg");
    aF = r.c("vp08");
    aG = r.c("vp09");
    aH = r.c("vpcC");
    aI = r.c("----");
  }

  public a(int paramInt)
  {
    this.aJ = paramInt;
  }

  public static int a(int paramInt)
  {
    return paramInt >> 24 & 0xFF;
  }

  public static int b(int paramInt)
  {
    return 0xFFFFFF & paramInt;
  }

  public static String c(int paramInt)
  {
    return "" + (char)(paramInt >> 24) + (char)(paramInt >> 16 & 0xFF) + (char)(paramInt >> 8 & 0xFF) + (char)(paramInt & 0xFF);
  }

  public String toString()
  {
    return c(this.aJ);
  }

  static final class a extends a
  {
    public final long aK;
    public final List<a.b> aL;
    public final List<a> aM;

    public a(int paramInt, long paramLong)
    {
      super();
      this.aK = paramLong;
      this.aL = new ArrayList();
      this.aM = new ArrayList();
    }

    public void a(a parama)
    {
      this.aM.add(parama);
    }

    public void a(a.b paramb)
    {
      this.aL.add(paramb);
    }

    public a.b d(int paramInt)
    {
      int j = this.aL.size();
      int i = 0;
      while (i < j)
      {
        a.b localb = (a.b)this.aL.get(i);
        if (localb.aJ == paramInt)
          return localb;
        i += 1;
      }
      return null;
    }

    public a e(int paramInt)
    {
      int j = this.aM.size();
      int i = 0;
      while (i < j)
      {
        a locala = (a)this.aM.get(i);
        if (locala.aJ == paramInt)
          return locala;
        i += 1;
      }
      return null;
    }

    public int f(int paramInt)
    {
      int k = 0;
      int m = this.aL.size();
      int j = 0;
      int i = 0;
      if (j < m)
      {
        if (((a.b)this.aL.get(j)).aJ != paramInt)
          break label111;
        i += 1;
      }
      label108: label111: 
      while (true)
      {
        j += 1;
        break;
        m = this.aM.size();
        j = k;
        if (j < m)
        {
          if (((a)this.aM.get(j)).aJ != paramInt)
            break label108;
          i += 1;
        }
        while (true)
        {
          j += 1;
          break;
          return i;
        }
      }
    }

    public String toString()
    {
      return c(this.aJ) + " leaves: " + Arrays.toString(this.aL.toArray(new a.b[0])) + " containers: " + Arrays.toString(this.aM.toArray(new a[0]));
    }
  }

  static final class b extends a
  {
    public final m aK;

    public b(int paramInt, m paramm)
    {
      super();
      this.aK = paramm;
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.exoplayer.c.c.a
 * JD-Core Version:    0.6.0
 */