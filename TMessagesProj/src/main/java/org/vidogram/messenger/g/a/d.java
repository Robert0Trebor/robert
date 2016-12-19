package org.vidogram.messenger.g.a;

import java.net.URI;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpOptions;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpTrace;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.params.HttpConnectionParams;
import org.vidogram.messenger.g.l;

public class d
  implements f
{
  protected final HttpClient a;

  public d(HttpClient paramHttpClient)
  {
    this.a = paramHttpClient;
  }

  private static void a(HttpEntityEnclosingRequestBase paramHttpEntityEnclosingRequestBase, l<?> paraml)
  {
    paraml = paraml.q();
    if (paraml != null)
      paramHttpEntityEnclosingRequestBase.setEntity(new ByteArrayEntity(paraml));
  }

  private static void a(HttpUriRequest paramHttpUriRequest, Map<String, String> paramMap)
  {
    Iterator localIterator = paramMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      paramHttpUriRequest.setHeader(str, (String)paramMap.get(str));
    }
  }

  static HttpUriRequest b(l<?> paraml, Map<String, String> paramMap)
  {
    switch (paraml.a())
    {
    default:
      throw new IllegalStateException("Unknown request method.");
    case -1:
      paramMap = paraml.m();
      if (paramMap != null)
      {
        HttpPost localHttpPost = new HttpPost(paraml.d());
        localHttpPost.addHeader("Content-Type", paraml.l());
        localHttpPost.setEntity(new ByteArrayEntity(paramMap));
        return localHttpPost;
      }
      return new HttpGet(paraml.d());
    case 0:
      return new HttpGet(paraml.d());
    case 3:
      return new HttpDelete(paraml.d());
    case 1:
      paramMap = new HttpPost(paraml.d());
      paramMap.addHeader("Content-Type", paraml.p());
      a(paramMap, paraml);
      return paramMap;
    case 2:
      paramMap = new HttpPut(paraml.d());
      paramMap.addHeader("Content-Type", paraml.p());
      a(paramMap, paraml);
      return paramMap;
    case 4:
      return new HttpHead(paraml.d());
    case 5:
      return new HttpOptions(paraml.d());
    case 6:
      return new HttpTrace(paraml.d());
    case 7:
    }
    paramMap = new a(paraml.d());
    paramMap.addHeader("Content-Type", paraml.p());
    a(paramMap, paraml);
    return paramMap;
  }

  public HttpResponse a(l<?> paraml, Map<String, String> paramMap)
  {
    HttpUriRequest localHttpUriRequest = b(paraml, paramMap);
    a(localHttpUriRequest, paramMap);
    a(localHttpUriRequest, paraml.i());
    a(localHttpUriRequest);
    paramMap = localHttpUriRequest.getParams();
    int i = paraml.t();
    HttpConnectionParams.setConnectionTimeout(paramMap, 5000);
    HttpConnectionParams.setSoTimeout(paramMap, i);
    return this.a.execute(localHttpUriRequest);
  }

  protected void a(HttpUriRequest paramHttpUriRequest)
  {
  }

  public static final class a extends HttpEntityEnclosingRequestBase
  {
    public a()
    {
    }

    public a(String paramString)
    {
      setURI(URI.create(paramString));
    }

    public String getMethod()
    {
      return "PATCH";
    }
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.g.a.d
 * JD-Core Version:    0.6.0
 */