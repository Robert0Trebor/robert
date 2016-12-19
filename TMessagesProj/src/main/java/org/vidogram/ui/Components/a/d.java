package org.vidogram.ui.Components.a;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.opengl.GLES20;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import org.vidogram.ui.Components.bf;

public class d
{
  private b a;
  private e b;
  private i c = new i();
  private j d;
  private bf e;
  private RectF f;
  private a g;
  private o h;
  private o i;
  private ByteBuffer j;
  private ByteBuffer k;
  private int l;
  private int m;
  private Map<String, k> n;
  private int o;
  private int[] p = new int[1];
  private ByteBuffer q;
  private boolean r;
  private m s;
  private float[] t;
  private float[] u;

  public d(bf parambf)
  {
    this.e = parambf;
    this.q = ByteBuffer.allocateDirect((int)this.e.a * (int)this.e.b * 4);
    this.t = b.a(0.0F, this.e.a, 0.0F, this.e.b, -1.0F, 1.0F);
    if (this.j == null)
    {
      this.j = ByteBuffer.allocateDirect(32);
      this.j.order(ByteOrder.nativeOrder());
    }
    this.j.putFloat(0.0F);
    this.j.putFloat(0.0F);
    this.j.putFloat(this.e.a);
    this.j.putFloat(0.0F);
    this.j.putFloat(0.0F);
    this.j.putFloat(this.e.b);
    this.j.putFloat(this.e.a);
    this.j.putFloat(this.e.b);
    this.j.rewind();
    if (this.k == null)
    {
      this.k = ByteBuffer.allocateDirect(32);
      this.k.order(ByteOrder.nativeOrder());
      this.k.putFloat(0.0F);
      this.k.putFloat(0.0F);
      this.k.putFloat(1.0F);
      this.k.putFloat(0.0F);
      this.k.putFloat(0.0F);
      this.k.putFloat(1.0F);
      this.k.putFloat(1.0F);
      this.k.putFloat(1.0F);
      this.k.rewind();
    }
  }

  private void a(int paramInt1, int paramInt2)
  {
    Map localMap = this.n;
    if (this.g.e());
    for (Object localObject = "blitWithMaskLight"; ; localObject = "blitWithMask")
    {
      localObject = (k)localMap.get(localObject);
      if (localObject != null)
        break;
      return;
    }
    GLES20.glUseProgram(((k)localObject).a);
    GLES20.glUniformMatrix4fv(((k)localObject).a("mvpMatrix"), 1, false, FloatBuffer.wrap(this.u));
    GLES20.glUniform1i(((k)localObject).a("texture"), 0);
    GLES20.glUniform1i(((k)localObject).a("mask"), 1);
    k.a(((k)localObject).a("color"), paramInt2);
    GLES20.glActiveTexture(33984);
    GLES20.glBindTexture(3553, l());
    GLES20.glActiveTexture(33985);
    GLES20.glBindTexture(3553, paramInt1);
    GLES20.glBlendFunc(1, 771);
    GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, this.j);
    GLES20.glEnableVertexAttribArray(0);
    GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, this.k);
    GLES20.glEnableVertexAttribArray(1);
    GLES20.glDrawArrays(5, 0, 4);
    q.a();
  }

  private void a(RectF paramRectF)
  {
    if (paramRectF == null);
    do
      return;
    while (!paramRectF.setIntersect(paramRectF, b()));
    paramRectF = new m(a(paramRectF, true).b, paramRectF, this.a.b());
    this.a.a().a(UUID.randomUUID(), new Runnable(paramRectF)
    {
      public void run()
      {
        d.a(d.this, this.a);
      }
    });
  }

  private void a(RectF paramRectF, Runnable paramRunnable)
  {
    GLES20.glBindFramebuffer(36160, k());
    GLES20.glFramebufferTexture2D(36160, 36064, 3553, l(), 0);
    if (GLES20.glCheckFramebufferStatus(36160) == 36053)
    {
      GLES20.glViewport(0, 0, (int)this.e.a, (int)this.e.b);
      paramRunnable.run();
    }
    GLES20.glBindFramebuffer(36160, 0);
    if ((!g()) && (this.a != null))
      this.a.a(paramRectF);
  }

  private void a(m paramm)
  {
    this.d.a(new Runnable(paramm)
    {
      public void run()
      {
        ByteBuffer localByteBuffer = this.a.b();
        GLES20.glBindTexture(3553, d.l(d.this));
        GLES20.glTexSubImage2D(3553, 0, this.a.c(), this.a.d(), this.a.e(), this.a.f(), 6408, 5121, localByteBuffer);
        if ((!d.p(d.this)) && (d.i(d.this) != null))
          d.i(d.this).a(this.a.g());
        this.a.a();
      }
    });
  }

  private boolean g()
  {
    return this.o > 0;
  }

  private void h()
  {
    this.o += 1;
  }

  private void i()
  {
    this.o -= 1;
  }

  private void j()
  {
    k localk = (k)this.n.get("blit");
    if (localk == null)
      return;
    GLES20.glUseProgram(localk.a);
    GLES20.glUniformMatrix4fv(localk.a("mvpMatrix"), 1, false, FloatBuffer.wrap(this.u));
    GLES20.glUniform1i(localk.a("texture"), 0);
    GLES20.glActiveTexture(33984);
    GLES20.glBindTexture(3553, l());
    GLES20.glBlendFunc(1, 771);
    GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, this.j);
    GLES20.glEnableVertexAttribArray(0);
    GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, this.k);
    GLES20.glEnableVertexAttribArray(1);
    GLES20.glDrawArrays(5, 0, 4);
    q.a();
  }

  private int k()
  {
    if (this.l == 0)
    {
      int[] arrayOfInt = new int[1];
      GLES20.glGenFramebuffers(1, arrayOfInt, 0);
      this.l = arrayOfInt[0];
      q.a();
    }
    return this.l;
  }

  private int l()
  {
    if (this.i != null)
      return this.i.a();
    return 0;
  }

  private int m()
  {
    if (this.m == 0)
      this.m = o.a(this.e);
    return this.m;
  }

  public a a(RectF paramRectF, boolean paramBoolean)
  {
    int i1 = (int)paramRectF.left;
    int i2 = (int)paramRectF.top;
    int i3 = (int)paramRectF.width();
    int i4 = (int)paramRectF.height();
    GLES20.glGenFramebuffers(1, this.p, 0);
    int i5 = this.p[0];
    GLES20.glBindFramebuffer(36160, i5);
    GLES20.glGenTextures(1, this.p, 0);
    int i6 = this.p[0];
    GLES20.glBindTexture(3553, i6);
    GLES20.glTexParameteri(3553, 10241, 9729);
    GLES20.glTexParameteri(3553, 10240, 9729);
    GLES20.glTexParameteri(3553, 10242, 33071);
    GLES20.glTexParameteri(3553, 10243, 33071);
    GLES20.glTexImage2D(3553, 0, 6408, i3, i4, 0, 6408, 5121, null);
    GLES20.glFramebufferTexture2D(36160, 36064, 3553, i6, 0);
    GLES20.glViewport(0, 0, (int)this.e.a, (int)this.e.b);
    if (this.n == null)
      return null;
    Object localObject = this.n;
    if (paramBoolean);
    for (paramRectF = "nonPremultipliedBlit"; ; paramRectF = "blit")
    {
      paramRectF = (k)((Map)localObject).get(paramRectF);
      if (paramRectF != null)
        break;
      return null;
    }
    GLES20.glUseProgram(paramRectF.a);
    localObject = new Matrix();
    ((Matrix)localObject).preTranslate(-i1, -i2);
    localObject = b.a((Matrix)localObject);
    localObject = b.a(this.t, localObject);
    GLES20.glUniformMatrix4fv(paramRectF.a("mvpMatrix"), 1, false, FloatBuffer.wrap(localObject));
    if (paramBoolean)
    {
      GLES20.glUniform1i(paramRectF.a("texture"), 0);
      GLES20.glActiveTexture(33984);
      GLES20.glBindTexture(3553, l());
      GLES20.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
      GLES20.glClear(16384);
      GLES20.glBlendFunc(1, 771);
      GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, this.j);
      GLES20.glEnableVertexAttribArray(0);
      GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, this.k);
      GLES20.glEnableVertexAttribArray(1);
      GLES20.glDrawArrays(5, 0, 4);
      this.q.limit(i3 * i4 * 4);
      GLES20.glReadPixels(0, 0, i3, i4, 6408, 5121, this.q);
      if (!paramBoolean)
        break label521;
    }
    for (paramRectF = new a(null, this.q); ; paramRectF = new a(paramRectF, null))
    {
      this.p[0] = i5;
      GLES20.glDeleteFramebuffers(1, this.p, 0);
      this.p[0] = i6;
      GLES20.glDeleteTextures(1, this.p, 0);
      return paramRectF;
      GLES20.glUniform1i(paramRectF.a("texture"), 0);
      GLES20.glActiveTexture(33984);
      GLES20.glBindTexture(3553, this.i.a());
      GLES20.glActiveTexture(33984);
      GLES20.glBindTexture(3553, l());
      break;
      label521: paramRectF = Bitmap.createBitmap(i3, i4, Bitmap.Config.ARGB_8888);
      paramRectF.copyPixelsFromBuffer(this.q);
    }
  }

  public bf a()
  {
    return this.e;
  }

  public void a(int paramInt)
  {
    this.d.a(new Runnable(paramInt)
    {
      public void run()
      {
        d.b(d.this, d.j(d.this));
        d.k(d.this);
        d.a(d.this, null, new Runnable()
        {
          public void run()
          {
            if (d.d(d.this) == null)
              return;
            Map localMap = d.d(d.this);
            if (d.e(d.this).e());
            for (Object localObject = "compositeWithMaskLight"; ; localObject = "compositeWithMask")
            {
              localObject = (k)localMap.get(localObject);
              if (localObject == null)
                break;
              GLES20.glUseProgram(((k)localObject).a);
              GLES20.glUniformMatrix4fv(((k)localObject).a("mvpMatrix"), 1, false, FloatBuffer.wrap(d.g(d.this)));
              GLES20.glUniform1i(((k)localObject).a("texture"), 0);
              GLES20.glUniform1i(((k)localObject).a("mask"), 1);
              k.a(((k)localObject).a("color"), d.2.this.a);
              GLES20.glActiveTexture(33984);
              GLES20.glBindTexture(3553, d.l(d.this));
              GLES20.glActiveTexture(33985);
              GLES20.glBindTexture(3553, d.b(d.this));
              GLES20.glBlendFunc(1, 0);
              GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, d.m(d.this));
              GLES20.glEnableVertexAttribArray(0);
              GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, d.n(d.this));
              GLES20.glEnableVertexAttribArray(1);
              GLES20.glDrawArrays(5, 0, 4);
              GLES20.glBindTexture(3553, d.l(d.this));
              return;
            }
          }
        });
        d.o(d.this);
        d.h(d.this).e();
        d.a(d.this, null);
        d.a(d.this, null);
      }
    });
  }

  public void a(Bitmap paramBitmap)
  {
    if (this.i != null)
      return;
    this.i = new o(paramBitmap);
  }

  public void a(Runnable paramRunnable)
  {
    this.d.a(new Runnable(paramRunnable)
    {
      public void run()
      {
        d.a(d.this, true);
        d.a locala = d.this.a(d.this.b(), true);
        d.b(d.this, new m(locala.b, d.this.b(), d.i(d.this).b()));
        d.this.a(false);
        if (this.a != null)
          this.a.run();
      }
    });
  }

  public void a(a parama)
  {
    this.g = parama;
    if (this.h != null)
    {
      this.h.a(true);
      this.h = null;
    }
  }

  public void a(b paramb)
  {
    this.a = paramb;
  }

  public void a(e parame, boolean paramBoolean, Runnable paramRunnable)
  {
    this.d.a(new Runnable(parame, paramBoolean, paramRunnable)
    {
      public void run()
      {
        d.a(d.this, this.a);
        Object localObject = null;
        GLES20.glBindFramebuffer(36160, d.a(d.this));
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, d.b(d.this), 0);
        q.a();
        if (GLES20.glCheckFramebufferStatus(36160) == 36053)
        {
          GLES20.glViewport(0, 0, (int)d.c(d.this).a, (int)d.c(d.this).b);
          if (this.b)
          {
            GLES20.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
            GLES20.glClear(16384);
          }
          if (d.d(d.this) != null);
        }
        label340: label350: 
        while (true)
        {
          return;
          Map localMap = d.d(d.this);
          if (d.e(d.this).e())
          {
            localObject = "brushLight";
            localObject = (k)localMap.get(localObject);
            if (localObject == null)
              continue;
            GLES20.glUseProgram(((k)localObject).a);
            if (d.f(d.this) == null)
              d.a(d.this, new o(d.e(d.this).f()));
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, d.f(d.this).a());
            GLES20.glUniformMatrix4fv(((k)localObject).a("mvpMatrix"), 1, false, FloatBuffer.wrap(d.g(d.this)));
            GLES20.glUniform1i(((k)localObject).a("texture"), 0);
            localObject = h.a(this.a, d.h(d.this));
            GLES20.glBindFramebuffer(36160, 0);
            if (d.i(d.this) != null)
              d.i(d.this).a((RectF)localObject);
            if (d.j(d.this) == null)
              break label340;
            d.j(d.this).union((RectF)localObject);
          }
          while (true)
          {
            if (this.c == null)
              break label350;
            this.c.run();
            return;
            localObject = "brush";
            break;
            d.a(d.this, (RectF)localObject);
          }
        }
      }
    });
  }

  public void a(j paramj)
  {
    this.d = paramj;
  }

  public void a(boolean paramBoolean)
  {
    if (this.l != 0)
    {
      this.p[0] = this.l;
      GLES20.glDeleteFramebuffers(1, this.p, 0);
      this.l = 0;
    }
    this.i.a(paramBoolean);
    if (this.m != 0)
    {
      this.p[0] = this.m;
      GLES20.glDeleteTextures(1, this.p, 0);
      this.m = 0;
    }
    if (this.h != null)
    {
      this.h.a(true);
      this.h = null;
    }
    if (this.n != null)
    {
      Iterator localIterator = this.n.values().iterator();
      while (localIterator.hasNext())
        ((k)localIterator.next()).a();
      this.n = null;
    }
  }

  public void a(float[] paramArrayOfFloat)
  {
    this.u = paramArrayOfFloat;
  }

  public RectF b()
  {
    return new RectF(0.0F, 0.0F, this.e.a, this.e.b);
  }

  public void c()
  {
    if (this.n == null)
      return;
    if (this.b != null)
    {
      a(m(), this.b.c());
      return;
    }
    j();
  }

  public boolean d()
  {
    return this.r;
  }

  public void e()
  {
    a(this.s);
    this.s = null;
    this.r = false;
  }

  public void f()
  {
    this.n = l.a();
  }

  public class a
  {
    public Bitmap a;
    public ByteBuffer b;

    a(Bitmap paramByteBuffer, ByteBuffer arg3)
    {
      this.a = paramByteBuffer;
      Object localObject;
      this.b = localObject;
    }
  }

  public static abstract interface b
  {
    public abstract p a();

    public abstract void a(RectF paramRectF);

    public abstract org.vidogram.messenger.h b();
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     org.vidogram.ui.Components.a.d
 * JD-Core Version:    0.6.0
 */