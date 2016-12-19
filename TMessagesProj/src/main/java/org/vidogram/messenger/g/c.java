package org.vidogram.messenger.g;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

public class c extends Thread
{
  private static final boolean a = t.b;
  private final BlockingQueue<l<?>> b;
  private final BlockingQueue<l<?>> c;
  private final b d;
  private final o e;
  private volatile boolean f = false;

  public c(BlockingQueue<l<?>> paramBlockingQueue1, BlockingQueue<l<?>> paramBlockingQueue2, b paramb, o paramo)
  {
    this.b = paramBlockingQueue1;
    this.c = paramBlockingQueue2;
    this.d = paramb;
    this.e = paramo;
  }

  public void a()
  {
    this.f = true;
    interrupt();
  }

  public void run()
  {
    if (a)
      t.a("start new dispatcher", new Object[0]);
    Process.setThreadPriority(10);
    this.d.a();
    while (true)
    {
      try
      {
        l locall = (l)this.b.take();
        locall.a("cache-queue-take");
        if (!locall.h())
          break label73;
        locall.b("cache-discard-canceled");
        continue;
      }
      catch (InterruptedException localInterruptedException)
      {
      }
      if (this.f)
      {
        return;
        label73: b.a locala = this.d.a(localInterruptedException.e());
        if (locala == null)
        {
          localInterruptedException.a("cache-miss");
          this.c.put(localInterruptedException);
          continue;
        }
        if (locala.a())
        {
          localInterruptedException.a("cache-hit-expired");
          localInterruptedException.a(locala);
          this.c.put(localInterruptedException);
          continue;
        }
        localInterruptedException.a("cache-hit");
        n localn = localInterruptedException.a(new i(locala.a, locala.g));
        localInterruptedException.a("cache-hit-parsed");
        if (!locala.b())
        {
          this.e.a(localInterruptedException, localn);
          continue;
        }
        localInterruptedException.a("cache-hit-refresh-needed");
        localInterruptedException.a(locala);
        localn.d = true;
        this.e.a(localInterruptedException, localn, new Runnable(localInterruptedException)
        {
          public void run()
          {
            try
            {
              c.a(c.this).put(this.a);
              return;
            }
            catch (InterruptedException localInterruptedException)
            {
            }
          }
        });
      }
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.g.c
 * JD-Core Version:    0.6.0
 */