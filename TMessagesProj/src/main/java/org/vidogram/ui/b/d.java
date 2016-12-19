package org.vidogram.ui.b;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.vidogram.SQLite.SQLiteCursor;
import org.vidogram.SQLite.SQLiteDatabase;
import org.vidogram.SQLite.SQLitePreparedStatement;
import org.vidogram.messenger.a;
import org.vidogram.messenger.h;
import org.vidogram.messenger.n;
import org.vidogram.messenger.support.widget.RecyclerView.a;
import org.vidogram.messenger.w;
import org.vidogram.tgnet.ConnectionsManager;
import org.vidogram.tgnet.c;
import org.vidogram.tgnet.f;
import org.vidogram.tgnet.g.gg;

public abstract class d extends RecyclerView.a
{
  protected ArrayList<f> a = new ArrayList();
  protected String b = null;
  protected ArrayList<a> c;
  protected HashMap<String, a> d;
  protected boolean e = false;
  private int f = 0;
  private int g;

  private void a(ArrayList<a> paramArrayList)
  {
    w.a().c().b(new Runnable(paramArrayList)
    {
      public void run()
      {
        int j = 100;
        try
        {
          w.a().b().d();
          SQLitePreparedStatement localSQLitePreparedStatement = w.a().b().a("REPLACE INTO hashtag_recent_v2 VALUES(?, ?)");
          int i = 0;
          while (true)
            if ((i >= this.a.size()) || (i == 100))
            {
              localSQLitePreparedStatement.e();
              w.a().b().e();
              if (this.a.size() < 100)
                break;
              w.a().b().d();
              i = j;
            }
            else
            {
              while (true)
                if (i < this.a.size())
                {
                  w.a().b().a("DELETE FROM hashtag_recent_v2 WHERE id = '" + ((d.a)this.a.get(i)).a + "'").c().e();
                  i += 1;
                  continue;
                  d.a locala = (d.a)this.a.get(i);
                  localSQLitePreparedStatement.d();
                  localSQLitePreparedStatement.a(1, locala.a);
                  localSQLitePreparedStatement.a(2, locala.b);
                  localSQLitePreparedStatement.b();
                  i += 1;
                  break;
                }
              w.a().b().e();
            }
          return;
        }
        catch (Exception localException)
        {
          n.a("tmessages", localException);
        }
      }
    });
  }

  public void a(CharSequence paramCharSequence)
  {
    if (paramCharSequence == null);
    int i;
    do
    {
      return;
      Matcher localMatcher = Pattern.compile("(^|\\s)#[\\w@\\.]+").matcher(paramCharSequence);
      i = 0;
      if (!localMatcher.find())
        continue;
      int j = localMatcher.start();
      int k = localMatcher.end();
      i = j;
      if (paramCharSequence.charAt(j) != '@')
      {
        i = j;
        if (paramCharSequence.charAt(j) != '#')
          i = j + 1;
      }
      String str = paramCharSequence.subSequence(i, k).toString();
      if (this.d == null)
      {
        this.d = new HashMap();
        this.c = new ArrayList();
      }
      a locala = (a)this.d.get(str);
      if (locala == null)
      {
        locala = new a();
        locala.a = str;
        this.d.put(locala.a, locala);
      }
      while (true)
      {
        locala.b = (int)(System.currentTimeMillis() / 1000L);
        this.c.add(0, locala);
        i = 1;
        break;
        this.c.remove(locala);
      }
    }
    while (i == 0);
    a(this.c);
  }

  public void a(String paramString, boolean paramBoolean)
  {
    if (this.f != 0)
    {
      ConnectionsManager.a().a(this.f, true);
      this.f = 0;
    }
    if ((paramString == null) || (paramString.length() < 5))
    {
      this.a.clear();
      this.g = 0;
      c();
      return;
    }
    g.gg localgg = new g.gg();
    localgg.c = paramString;
    localgg.d = 50;
    int i = this.g + 1;
    this.g = i;
    this.f = ConnectionsManager.a().a(localgg, new c(i, paramBoolean, paramString)
    {
    }
    , 2);
  }

  protected void a(ArrayList<a> paramArrayList, HashMap<String, a> paramHashMap)
  {
    this.c = paramArrayList;
    this.d = paramHashMap;
    this.e = true;
  }

  public void d()
  {
    w.a().c().b(new Runnable()
    {
      public void run()
      {
        ArrayList localArrayList;
        HashMap localHashMap;
        try
        {
          SQLiteCursor localSQLiteCursor = w.a().b().b("SELECT id, date FROM hashtag_recent_v2 WHERE 1", new Object[0]);
          localArrayList = new ArrayList();
          localHashMap = new HashMap();
          while (localSQLiteCursor.a())
          {
            d.a locala = new d.a();
            locala.a = localSQLiteCursor.e(0);
            locala.b = localSQLiteCursor.b(1);
            localArrayList.add(locala);
            localHashMap.put(locala.a, locala);
          }
        }
        catch (Exception localException)
        {
          n.a("tmessages", localException);
          return;
        }
        localException.b();
        Collections.sort(localArrayList, new Comparator()
        {
          public int a(d.a parama1, d.a parama2)
          {
            if (parama1.b < parama2.b)
              return 1;
            if (parama1.b > parama2.b)
              return -1;
            return 0;
          }
        });
        a.a(new Runnable(localArrayList, localHashMap)
        {
          public void run()
          {
            d.this.a(this.a, this.b);
          }
        });
      }
    });
  }

  public void e()
  {
    this.c = new ArrayList();
    this.d = new HashMap();
    w.a().c().b(new Runnable()
    {
      public void run()
      {
        try
        {
          w.a().b().a("DELETE FROM hashtag_recent_v2 WHERE 1").c().e();
          return;
        }
        catch (Exception localException)
        {
          n.a("tmessages", localException);
        }
      }
    });
  }

  protected static class a
  {
    String a;
    int b;
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.b.d
 * JD-Core Version:    0.6.0
 */