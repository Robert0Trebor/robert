package org.vidogram.messenger.g;

public class n<T>
{
  public final T a;
  public final b.a b;
  public final s c;
  public boolean d = false;

  private n(T paramT, b.a parama)
  {
    this.a = paramT;
    this.b = parama;
    this.c = null;
  }

  private n(s params)
  {
    this.a = null;
    this.b = null;
    this.c = params;
  }

  public static <T> n<T> a(T paramT, b.a parama)
  {
    return new n(paramT, parama);
  }

  public static <T> n<T> a(s params)
  {
    return new n(params);
  }

  public boolean a()
  {
    return this.c == null;
  }

  public static abstract interface a
  {
    public abstract void a(s params);
  }

  public static abstract interface b<T>
  {
    public abstract void a(T paramT);
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.g.n
 * JD-Core Version:    0.6.0
 */