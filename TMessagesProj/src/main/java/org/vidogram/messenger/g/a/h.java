package org.vidogram.messenger.g.a;

import org.json.JSONObject;
import org.vidogram.messenger.g.k;
import org.vidogram.messenger.g.n;
import org.vidogram.messenger.g.n.a;
import org.vidogram.messenger.g.n.b;

public class h extends i<JSONObject>
{
  public h(int paramInt, String paramString, JSONObject paramJSONObject, n.b<JSONObject> paramb, n.a parama)
  {
  }

  protected n<JSONObject> a(org.vidogram.messenger.g.i parami)
  {
    try
    {
      parami = n.a(new JSONObject(new String(parami.b, e.a(parami.c, "utf-8"))), e.a(parami));
      return parami;
    }
    catch (java.io.UnsupportedEncodingException parami)
    {
      return n.a(new k(parami));
    }
    catch (org.json.JSONException parami)
    {
    }
    return n.a(new k(parami));
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.messenger.g.a.h
 * JD-Core Version:    0.6.0
 */