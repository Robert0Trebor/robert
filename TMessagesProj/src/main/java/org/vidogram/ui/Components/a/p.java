package org.vidogram.ui.Components.a;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.vidogram.messenger.a;

public class p
{
  private a a;
  private Map<UUID, Runnable> b = new HashMap();
  private List<UUID> c = new ArrayList();

  private void c()
  {
    a.a(new Runnable()
    {
      public void run()
      {
        if (p.a(p.this) != null)
          p.a(p.this).a();
      }
    });
  }

  public void a(UUID paramUUID)
  {
    this.b.remove(paramUUID);
    this.c.remove(paramUUID);
    c();
  }

  public void a(UUID paramUUID, Runnable paramRunnable)
  {
    this.b.put(paramUUID, paramRunnable);
    this.c.add(paramUUID);
    c();
  }

  public void a(a parama)
  {
    this.a = parama;
  }

  public boolean a()
  {
    return !this.c.isEmpty();
  }

  public void b()
  {
    if (this.c.size() == 0)
      return;
    int i = this.c.size() - 1;
    UUID localUUID = (UUID)this.c.get(i);
    Runnable localRunnable = (Runnable)this.b.get(localUUID);
    this.b.remove(localUUID);
    this.c.remove(i);
    localRunnable.run();
    c();
  }

  public static abstract interface a
  {
    public abstract void a();
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.Components.a.p
 * JD-Core Version:    0.6.0
 */