package org.vidogram.messenger.g.a;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Map<Ljava.lang.String;Ljava.lang.String;>;
import java.util.Set;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolVersion;
import org.apache.http.StatusLine;
import org.apache.http.entity.BasicHttpEntity;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.message.BasicStatusLine;
import org.vidogram.messenger.g.l;

public class g
  implements f
{
  private final a a;
  private final SSLSocketFactory b;

  public g()
  {
    this(null);
  }

  public g(a parama)
  {
    this(parama, null);
  }

  public g(a parama, SSLSocketFactory paramSSLSocketFactory)
  {
    this.a = parama;
    this.b = paramSSLSocketFactory;
  }

  private HttpURLConnection a(URL paramURL, l<?> paraml)
  {
    HttpURLConnection localHttpURLConnection = a(paramURL);
    int i = paraml.t();
    localHttpURLConnection.setConnectTimeout(i);
    localHttpURLConnection.setReadTimeout(i);
    localHttpURLConnection.setUseCaches(false);
    localHttpURLConnection.setDoInput(true);
    if (("https".equals(paramURL.getProtocol())) && (this.b != null))
      ((HttpsURLConnection)localHttpURLConnection).setSSLSocketFactory(this.b);
    return localHttpURLConnection;
  }

  private static HttpEntity a(HttpURLConnection paramHttpURLConnection)
  {
    BasicHttpEntity localBasicHttpEntity = new BasicHttpEntity();
    try
    {
      InputStream localInputStream1 = paramHttpURLConnection.getInputStream();
      localBasicHttpEntity.setContent(localInputStream1);
      localBasicHttpEntity.setContentLength(paramHttpURLConnection.getContentLength());
      localBasicHttpEntity.setContentEncoding(paramHttpURLConnection.getContentEncoding());
      localBasicHttpEntity.setContentType(paramHttpURLConnection.getContentType());
      return localBasicHttpEntity;
    }
    catch (IOException localInputStream2)
    {
      while (true)
        InputStream localInputStream2 = paramHttpURLConnection.getErrorStream();
    }
  }

  static void a(HttpURLConnection paramHttpURLConnection, l<?> paraml)
  {
    switch (paraml.a())
    {
    default:
      throw new IllegalStateException("Unknown method type.");
    case -1:
      byte[] arrayOfByte = paraml.m();
      if (arrayOfByte != null)
      {
        paramHttpURLConnection.setDoOutput(true);
        paramHttpURLConnection.setRequestMethod("POST");
        paramHttpURLConnection.addRequestProperty("Content-Type", paraml.l());
        paramHttpURLConnection = new DataOutputStream(paramHttpURLConnection.getOutputStream());
        paramHttpURLConnection.write(arrayOfByte);
        paramHttpURLConnection.close();
      }
      return;
    case 0:
      paramHttpURLConnection.setRequestMethod("GET");
      return;
    case 3:
      paramHttpURLConnection.setRequestMethod("DELETE");
      return;
    case 1:
      paramHttpURLConnection.setRequestMethod("POST");
      b(paramHttpURLConnection, paraml);
      return;
    case 2:
      paramHttpURLConnection.setRequestMethod("PUT");
      b(paramHttpURLConnection, paraml);
      return;
    case 4:
      paramHttpURLConnection.setRequestMethod("HEAD");
      return;
    case 5:
      paramHttpURLConnection.setRequestMethod("OPTIONS");
      return;
    case 6:
      paramHttpURLConnection.setRequestMethod("TRACE");
      return;
    case 7:
    }
    paramHttpURLConnection.setRequestMethod("PATCH");
    b(paramHttpURLConnection, paraml);
  }

  private static boolean a(int paramInt1, int paramInt2)
  {
    return (paramInt1 != 4) && ((100 > paramInt2) || (paramInt2 >= 200)) && (paramInt2 != 204) && (paramInt2 != 304);
  }

  private static void b(HttpURLConnection paramHttpURLConnection, l<?> paraml)
  {
    byte[] arrayOfByte = paraml.q();
    if (arrayOfByte != null)
    {
      paramHttpURLConnection.setDoOutput(true);
      paramHttpURLConnection.addRequestProperty("Content-Type", paraml.p());
      paramHttpURLConnection = new DataOutputStream(paramHttpURLConnection.getOutputStream());
      paramHttpURLConnection.write(arrayOfByte);
      paramHttpURLConnection.close();
    }
  }

  protected HttpURLConnection a(URL paramURL)
  {
    return (HttpURLConnection)paramURL.openConnection();
  }

  public HttpResponse a(l<?> paraml, Map<String, String> paramMap)
  {
    Object localObject1 = paraml.d();
    HashMap localHashMap = new HashMap();
    localHashMap.putAll(paraml.i());
    localHashMap.putAll(paramMap);
    if (this.a != null)
    {
      localObject2 = this.a.a((String)localObject1);
      paramMap = (Map<String, String>)localObject2;
      if (localObject2 == null)
        throw new IOException("URL blocked by rewriter: " + (String)localObject1);
    }
    else
    {
      paramMap = (Map<String, String>)localObject1;
    }
    paramMap = a(new URL(paramMap), paraml);
    localObject1 = localHashMap.keySet().iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (String)((Iterator)localObject1).next();
      paramMap.addRequestProperty((String)localObject2, (String)localHashMap.get(localObject2));
    }
    a(paramMap, paraml);
    localObject1 = new ProtocolVersion("HTTP", 1, 1);
    if (paramMap.getResponseCode() == -1)
      throw new IOException("Could not retrieve response code from HttpUrlConnection.");
    Object localObject2 = new BasicStatusLine((ProtocolVersion)localObject1, paramMap.getResponseCode(), paramMap.getResponseMessage());
    localObject1 = new BasicHttpResponse((StatusLine)localObject2);
    if (a(paraml.a(), ((StatusLine)localObject2).getStatusCode()))
      ((BasicHttpResponse)localObject1).setEntity(a(paramMap));
    paraml = paramMap.getHeaderFields().entrySet().iterator();
    while (paraml.hasNext())
    {
      paramMap = (Map.Entry)paraml.next();
      if (paramMap.getKey() == null)
        continue;
      ((BasicHttpResponse)localObject1).addHeader(new BasicHeader((String)paramMap.getKey(), (String)((List)paramMap.getValue()).get(0)));
    }
    return (HttpResponse)(HttpResponse)localObject1;
  }

  public static abstract interface a
  {
    public abstract String a(String paramString);
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.g.a.g
 * JD-Core Version:    0.6.0
 */