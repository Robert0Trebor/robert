package org.vidogram.ui.Components.a;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Map<Ljava.lang.String;Lorg.vidogram.ui.Components.a.k;>;
import java.util.Set;

public class l
{
  private static final Map<String, Map<String, Object>> a = b();

  public static Map<String, k> a()
  {
    HashMap localHashMap = new HashMap();
    Iterator localIterator = a.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      Object localObject = (Map)localEntry.getValue();
      localObject = new k((String)((Map)localObject).get("vertex"), (String)((Map)localObject).get("fragment"), (String[])(String[])((Map)localObject).get("attributes"), (String[])(String[])((Map)localObject).get("uniforms"));
      localHashMap.put(localEntry.getKey(), localObject);
    }
    return (Map<String, k>)Collections.unmodifiableMap(localHashMap);
  }

  private static Map<String, Map<String, Object>> b()
  {
    HashMap localHashMap1 = new HashMap();
    HashMap localHashMap2 = new HashMap();
    localHashMap2.put("vertex", "precision highp float; uniform mat4 mvpMatrix; attribute vec4 inPosition; attribute vec2 inTexcoord; attribute float alpha; varying vec2 varTexcoord; varying float varIntensity; void main (void) { gl_Position = mvpMatrix * inPosition; varTexcoord = inTexcoord; varIntensity = alpha; }");
    localHashMap2.put("fragment", "precision highp float; varying vec2 varTexcoord; varying float varIntensity; uniform sampler2D texture; void main (void) { gl_FragColor = vec4(0, 0, 0, varIntensity * texture2D(texture, varTexcoord.st, 0.0).r); }");
    localHashMap2.put("attributes", new String[] { "inPosition", "inTexcoord", "alpha" });
    localHashMap2.put("uniforms", new String[] { "mvpMatrix", "texture" });
    localHashMap1.put("brush", Collections.unmodifiableMap(localHashMap2));
    localHashMap2 = new HashMap();
    localHashMap2.put("vertex", "precision highp float; uniform mat4 mvpMatrix; attribute vec4 inPosition; attribute vec2 inTexcoord; attribute float alpha; varying vec2 varTexcoord; varying float varIntensity; void main (void) { gl_Position = mvpMatrix * inPosition; varTexcoord = inTexcoord; varIntensity = alpha; }");
    localHashMap2.put("fragment", "precision highp float; varying vec2 varTexcoord; varying float varIntensity; uniform sampler2D texture; void main (void) { vec4 f = texture2D(texture, varTexcoord.st, 0.0); gl_FragColor = vec4(f.r * varIntensity, f.g, f.b, 0.0); }");
    localHashMap2.put("attributes", new String[] { "inPosition", "inTexcoord", "alpha" });
    localHashMap2.put("uniforms", new String[] { "mvpMatrix", "texture" });
    localHashMap1.put("brushLight", Collections.unmodifiableMap(localHashMap2));
    localHashMap2 = new HashMap();
    localHashMap2.put("vertex", "precision highp float; uniform mat4 mvpMatrix; attribute vec4 inPosition; attribute vec2 inTexcoord; varying vec2 varTexcoord; void main (void) { gl_Position = mvpMatrix * inPosition; varTexcoord = inTexcoord; }");
    localHashMap2.put("fragment", "precision highp float; varying vec2 varTexcoord; uniform sampler2D texture; void main (void) { vec4 tex = texture2D(texture, varTexcoord.st, 0.0); gl_FragColor = texture2D(texture, varTexcoord.st, 0.0); gl_FragColor.rgb *= gl_FragColor.a; }");
    localHashMap2.put("attributes", new String[] { "inPosition", "inTexcoord" });
    localHashMap2.put("uniforms", new String[] { "mvpMatrix", "texture" });
    localHashMap1.put("blit", Collections.unmodifiableMap(localHashMap2));
    localHashMap2 = new HashMap();
    localHashMap2.put("vertex", "precision highp float; uniform mat4 mvpMatrix; attribute vec4 inPosition; attribute vec2 inTexcoord; varying vec2 varTexcoord; void main (void) { gl_Position = mvpMatrix * inPosition; varTexcoord = inTexcoord; }");
    localHashMap2.put("fragment", "precision highp float; varying vec2 varTexcoord; uniform sampler2D texture; uniform sampler2D mask; uniform vec4 color; void main (void) { vec4 dst = texture2D(texture, varTexcoord.st, 0.0); vec3 maskColor = texture2D(mask, varTexcoord.st, 0.0).rgb; float srcAlpha = clamp(0.78 * maskColor.r + maskColor.b + maskColor.g, 0.0, 1.0); vec3 borderColor = mix(color.rgb, vec3(1.0, 1.0, 1.0), 0.86); vec3 finalColor = mix(color.rgb, borderColor, maskColor.g); finalColor = mix(finalColor.rgb, vec3(1.0, 1.0, 1.0), maskColor.b); float outAlpha = srcAlpha + dst.a * (1.0 - srcAlpha); gl_FragColor.rgb = (finalColor * srcAlpha + dst.rgb * dst.a * (1.0 - srcAlpha)) / outAlpha; gl_FragColor.a = outAlpha; gl_FragColor.rgb *= gl_FragColor.a; }");
    localHashMap2.put("attributes", new String[] { "inPosition", "inTexcoord" });
    localHashMap2.put("uniforms", new String[] { "mvpMatrix", "texture", "mask", "color" });
    localHashMap1.put("blitWithMaskLight", Collections.unmodifiableMap(localHashMap2));
    localHashMap2 = new HashMap();
    localHashMap2.put("vertex", "precision highp float; uniform mat4 mvpMatrix; attribute vec4 inPosition; attribute vec2 inTexcoord; varying vec2 varTexcoord; void main (void) { gl_Position = mvpMatrix * inPosition; varTexcoord = inTexcoord; }");
    localHashMap2.put("fragment", "precision highp float; varying vec2 varTexcoord; uniform sampler2D texture; uniform sampler2D mask; uniform vec4 color; void main (void) { vec4 dst = texture2D(texture, varTexcoord.st, 0.0); float srcAlpha = color.a * texture2D(mask, varTexcoord.st, 0.0).a; float outAlpha = srcAlpha + dst.a * (1.0 - srcAlpha); gl_FragColor.rgb = (color.rgb * srcAlpha + dst.rgb * dst.a * (1.0 - srcAlpha)) / outAlpha; gl_FragColor.a = outAlpha; gl_FragColor.rgb *= gl_FragColor.a; }");
    localHashMap2.put("attributes", new String[] { "inPosition", "inTexcoord" });
    localHashMap2.put("uniforms", new String[] { "mvpMatrix", "texture", "mask", "color" });
    localHashMap1.put("blitWithMask", Collections.unmodifiableMap(localHashMap2));
    localHashMap2 = new HashMap();
    localHashMap2.put("vertex", "precision highp float; uniform mat4 mvpMatrix; attribute vec4 inPosition; attribute vec2 inTexcoord; varying vec2 varTexcoord; void main (void) { gl_Position = mvpMatrix * inPosition; varTexcoord = inTexcoord; }");
    localHashMap2.put("fragment", "precision highp float; varying vec2 varTexcoord; uniform sampler2D texture; uniform sampler2D mask; uniform vec4 color; void main (void) { vec4 dst = texture2D(texture, varTexcoord.st, 0.0); float srcAlpha = color.a * texture2D(mask, varTexcoord.st, 0.0).a; float outAlpha = srcAlpha + dst.a * (1.0 - srcAlpha); gl_FragColor.rgb = (color.rgb * srcAlpha + dst.rgb * dst.a * (1.0 - srcAlpha)) / outAlpha; gl_FragColor.a = outAlpha; }");
    localHashMap2.put("attributes", new String[] { "inPosition", "inTexcoord" });
    localHashMap2.put("uniforms", new String[] { "mvpMatrix", "texture", "mask", "color" });
    localHashMap1.put("compositeWithMask", Collections.unmodifiableMap(localHashMap2));
    localHashMap2 = new HashMap();
    localHashMap2.put("vertex", "precision highp float; uniform mat4 mvpMatrix; attribute vec4 inPosition; attribute vec2 inTexcoord; varying vec2 varTexcoord; void main (void) { gl_Position = mvpMatrix * inPosition; varTexcoord = inTexcoord; }");
    localHashMap2.put("fragment", "precision highp float; varying vec2 varTexcoord; uniform sampler2D texture; uniform sampler2D mask; uniform vec4 color; void main (void) { vec4 dst = texture2D(texture, varTexcoord.st, 0.0); vec3 maskColor = texture2D(mask, varTexcoord.st, 0.0).rgb; float srcAlpha = clamp(0.78 * maskColor.r + maskColor.b + maskColor.g, 0.0, 1.0); vec3 borderColor = mix(color.rgb, vec3(1.0, 1.0, 1.0), 0.86); vec3 finalColor = mix(color.rgb, borderColor, maskColor.g); finalColor = mix(finalColor.rgb, vec3(1.0, 1.0, 1.0), maskColor.b); float outAlpha = srcAlpha + dst.a * (1.0 - srcAlpha); gl_FragColor.rgb = (finalColor * srcAlpha + dst.rgb * dst.a * (1.0 - srcAlpha)) / outAlpha; gl_FragColor.a = outAlpha; }");
    localHashMap2.put("attributes", new String[] { "inPosition", "inTexcoord" });
    localHashMap2.put("uniforms", new String[] { "mvpMatrix", "texture", "mask", "color" });
    localHashMap1.put("compositeWithMaskLight", Collections.unmodifiableMap(localHashMap2));
    localHashMap2 = new HashMap();
    localHashMap2.put("vertex", "precision highp float; uniform mat4 mvpMatrix; attribute vec4 inPosition; attribute vec2 inTexcoord; varying vec2 varTexcoord; void main (void) { gl_Position = mvpMatrix * inPosition; varTexcoord = inTexcoord; }");
    localHashMap2.put("fragment", "precision highp float; varying vec2 varTexcoord; uniform sampler2D texture; void main (void) { gl_FragColor = texture2D(texture, varTexcoord.st, 0.0); }");
    localHashMap2.put("attributes", new String[] { "inPosition", "inTexcoord" });
    localHashMap2.put("uniforms", new String[] { "mvpMatrix", "texture" });
    localHashMap1.put("nonPremultipliedBlit", Collections.unmodifiableMap(localHashMap2));
    return Collections.unmodifiableMap(localHashMap1);
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.Components.a.l
 * JD-Core Version:    0.6.0
 */