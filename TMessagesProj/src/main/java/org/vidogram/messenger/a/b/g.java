package org.vidogram.messenger.a.b;

public class g
{
  private String a;
  private int b;
  private int c;
  private boolean d;
  private boolean e;
  private boolean f;
  private int g;

  public g(i parami)
  {
    long l = parami.b();
    c localc = parami.a();
    label99: int i1;
    int m;
    int n;
    int j;
    int i;
    int k;
    label151: boolean bool1;
    if (parami.d().a() == 2)
    {
      this.a = new String(localc.a(3), "ISO-8859-1");
      if (parami.d().a() != 2)
        break label321;
      this.c = ((localc.a() & 0xFF) << 16 | (localc.a() & 0xFF) << 8 | localc.a() & 0xFF);
      if (parami.d().a() > 2)
      {
        localc.a();
        i1 = localc.a();
        if (parami.d().a() != 3)
          break label356;
        m = 32;
        n = 64;
        j = 0;
        i = 128;
        k = 0;
        if ((i & i1) == 0)
          break label374;
        bool1 = true;
        label161: this.e = bool1;
        if ((i1 & k) == 0)
          break label380;
        bool1 = true;
        label178: this.d = bool1;
        if ((i1 & n) == 0)
          break label386;
        bool1 = bool2;
        label196: this.f = bool1;
        if (parami.d().a() != 3)
          break label392;
        if (this.e)
        {
          this.g = localc.b();
          this.c -= 4;
        }
        if (this.f)
        {
          localc.a();
          this.c -= 1;
        }
        if ((i1 & m) != 0)
        {
          localc.a();
          this.c -= 1;
        }
      }
    }
    while (true)
    {
      this.b = (int)(parami.b() - l);
      return;
      this.a = new String(localc.a(4), "ISO-8859-1");
      break;
      label321: if (parami.d().a() == 3)
      {
        this.c = localc.b();
        break label99;
      }
      this.c = localc.c();
      break label99;
      label356: n = 4;
      k = 2;
      i = 8;
      m = 64;
      j = 1;
      break label151;
      label374: bool1 = false;
      break label161;
      label380: bool1 = false;
      break label178;
      label386: bool1 = false;
      break label196;
      label392: if ((i1 & m) != 0)
      {
        localc.a();
        this.c -= 1;
      }
      if (this.f)
      {
        localc.a();
        this.c -= 1;
      }
      if ((i1 & j) == 0)
        continue;
      this.g = localc.c();
      this.c -= 4;
    }
  }

  public String a()
  {
    return this.a;
  }

  public int b()
  {
    return this.b;
  }

  public int c()
  {
    return this.c;
  }

  public boolean d()
  {
    return this.e;
  }

  public boolean e()
  {
    return this.f;
  }

  public boolean f()
  {
    return this.d;
  }

  public int g()
  {
    return this.g;
  }

  public boolean h()
  {
    int i = 0;
    if (i < this.a.length())
      if (((this.a.charAt(i) >= 'A') && (this.a.charAt(i) <= 'Z')) || ((this.a.charAt(i) >= '0') && (this.a.charAt(i) <= '9')));
    do
    {
      return false;
      i += 1;
      break;
    }
    while (this.c <= 0);
    return true;
  }

  public boolean i()
  {
    int i = 0;
    if (i < this.a.length())
      if (this.a.charAt(0) == 0);
    do
    {
      return false;
      i += 1;
      break;
    }
    while (this.c != 0);
    return true;
  }

  public String toString()
  {
    return String.format("%s[id=%s, bodysize=%d]", new Object[] { getClass().getSimpleName(), this.a, Integer.valueOf(this.c) });
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.a.b.g
 * JD-Core Version:    0.6.0
 */