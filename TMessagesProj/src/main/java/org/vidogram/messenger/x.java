package org.vidogram.messenger;

import android.app.Activity;
import android.content.ContentResolver;
import android.net.Uri;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Date;
import java.util.UUID;
import net.hockeyapp.android.a;
import net.hockeyapp.android.e.h;

public class x
{
  public static String a()
  {
    Object localObject = new Date();
    try
    {
      String str = UUID.randomUUID().toString();
      BufferedWriter localBufferedWriter = new BufferedWriter(new FileWriter(a.a + "/" + str + ".faketrace"));
      localBufferedWriter.write("Package: " + a.d + "\n");
      localBufferedWriter.write("Version Code: " + a.b + "\n");
      localBufferedWriter.write("Version Name: " + a.c + "\n");
      localBufferedWriter.write("Android: " + a.e + "\n");
      localBufferedWriter.write("Manufacturer: " + a.h + "\n");
      localBufferedWriter.write("Model: " + a.g + "\n");
      localBufferedWriter.write("Date: " + localObject + "\n");
      localBufferedWriter.write("\n");
      localBufferedWriter.write("MinidumpContainer");
      localBufferedWriter.flush();
      localBufferedWriter.close();
      localObject = str + ".faketrace";
      return localObject;
    }
    catch (Exception localException)
    {
      n.a("tmessages", localException);
    }
    return (String)null;
  }

  public static void a(Activity paramActivity)
  {
    String[] arrayOfString = b();
    int j = arrayOfString.length;
    int i = 0;
    if (i < j)
    {
      String str2 = arrayOfString[i];
      String str3 = a();
      if (str3 != null)
        if (!d.a)
          break label58;
      label58: for (String str1 = d.g; ; str1 = d.f)
      {
        a(paramActivity, str1, str2, str3);
        i += 1;
        break;
      }
    }
  }

  public static void a(Activity paramActivity, String paramString1, String paramString2, String paramString3)
  {
    new Thread(paramString2, paramActivity, paramString3, paramString1)
    {
      public void run()
      {
        try
        {
          h localh = new h();
          localh.b();
          Object localObject2 = Uri.fromFile(new File(a.a, this.a));
          Object localObject3 = this.b.getContentResolver().openInputStream((Uri)localObject2);
          localh.a("attachment0", ((Uri)localObject2).getLastPathSegment(), (InputStream)localObject3, false);
          localObject2 = Uri.fromFile(new File(a.a, this.c));
          localObject3 = this.b.getContentResolver().openInputStream((Uri)localObject2);
          localh.a("log", ((Uri)localObject2).getLastPathSegment(), (InputStream)localObject3, true);
          localh.c();
          localObject2 = (HttpURLConnection)new URL("https://rink.hockeyapp.net/api/2/apps/" + this.d + "/crashes/upload").openConnection();
          ((HttpURLConnection)localObject2).setDoOutput(true);
          ((HttpURLConnection)localObject2).setRequestMethod("POST");
          ((HttpURLConnection)localObject2).setRequestProperty("Content-Type", localh.e());
          ((HttpURLConnection)localObject2).setRequestProperty("Content-Length", String.valueOf(localh.d()));
          localObject3 = new BufferedOutputStream(((HttpURLConnection)localObject2).getOutputStream());
          ((BufferedOutputStream)localObject3).write(localh.f().toByteArray());
          ((BufferedOutputStream)localObject3).flush();
          ((BufferedOutputStream)localObject3).close();
          ((HttpURLConnection)localObject2).connect();
          n.a("tmessages", "response code = " + ((HttpURLConnection)localObject2).getResponseCode() + " message = " + ((HttpURLConnection)localObject2).getResponseMessage());
          return;
        }
        catch (IOException localIOException)
        {
          localIOException.printStackTrace();
          return;
        }
        finally
        {
          this.b.deleteFile(this.c);
          this.b.deleteFile(this.a);
        }
        throw localObject1;
      }
    }
    .start();
  }

  private static String[] b()
  {
    if (a.a != null)
    {
      File localFile = new File(a.a + "/");
      if ((!localFile.mkdir()) && (!localFile.exists()))
        return new String[0];
      return localFile.list(new FilenameFilter()
      {
        public boolean accept(File paramFile, String paramString)
        {
          return paramString.endsWith(".dmp");
        }
      });
    }
    return new String[0];
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.x
 * JD-Core Version:    0.6.0
 */