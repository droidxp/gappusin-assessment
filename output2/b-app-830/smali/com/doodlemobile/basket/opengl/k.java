class com.doodlemobile.basket.opengl.k extends com.doodlemobile.basket.opengl.n {
	 /* # instance fields */
	 private a;
	 private Integer b;
	 private Integer c;
	 private Integer d;
	 private Integer e;
	 private Integer f;
	 private Integer g;
	 private com.doodlemobile.basket.opengl.l h; //synthetic
	 /* # direct methods */
	 public com.doodlemobile.basket.opengl.k ( ) {
		 /* .locals 3 */
		 int v2 = 5; // const/4 v2, 0x5
		 int v1 = 0; // const/4 v1, 0x0
		 this.h = p1;
		 /* const/16 v0, 0xd */
		 /* new-array v0, v0, [I */
		 /* fill-array-data v0, :array_0 */
		 /* invoke-direct {p0, p1, v0}, Lcom/doodlemobile/basket/opengl/n;-><init>(Lcom/doodlemobile/basket/opengl/l;[I)V */
		 int v0 = 1; // const/4 v0, 0x1
		 /* new-array v0, v0, [I */
		 this.a = v0;
		 /* iput v2, p0, Lcom/doodlemobile/basket/opengl/k;->b:I */
		 int v0 = 6; // const/4 v0, 0x6
		 /* iput v0, p0, Lcom/doodlemobile/basket/opengl/k;->c:I */
		 /* iput v2, p0, Lcom/doodlemobile/basket/opengl/k;->d:I */
		 /* iput v1, p0, Lcom/doodlemobile/basket/opengl/k;->e:I */
		 /* const/16 v0, 0x10 */
		 /* iput v0, p0, Lcom/doodlemobile/basket/opengl/k;->f:I */
		 /* iput v1, p0, Lcom/doodlemobile/basket/opengl/k;->g:I */
		 return;
		 /* nop */
		 /* :array_0 */
		 /* .array-data 4 */
		 /* 0x3024 */
		 /* 0x5 */
		 /* 0x3023 */
		 /* 0x6 */
		 /* 0x3022 */
		 /* 0x5 */
		 /* 0x3021 */
		 /* 0x0 */
		 /* 0x3025 */
		 /* 0x10 */
		 /* 0x3026 */
		 /* 0x0 */
		 /* 0x3038 */
	 } // .end array-data
} // .end method
private Integer a ( javax.microedition.khronos.egl.EGL10 p0, javax.microedition.khronos.egl.EGLDisplay p1, javax.microedition.khronos.egl.EGLConfig p2, Integer p3 ) {
	 /* .locals 2 */
	 int v1 = 0; // const/4 v1, 0x0
	 v0 = 	 v0 = this.a;
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 v0 = this.a;
		 /* aget v0, v0, v1 */
	 } // :goto_0
} // :cond_0
/* move v0, v1 */
} // .end method
/* # virtual methods */
public final javax.microedition.khronos.egl.EGLConfig a ( javax.microedition.khronos.egl.EGL10 p0, javax.microedition.khronos.egl.EGLDisplay p1, javax.microedition.khronos.egl.EGLConfig[] p2 ) {
/* .locals 8 */
/* array-length v0, p3 */
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* if-ge v1, v0, :cond_1 */
/* aget-object v2, p3, v1 */
/* const/16 v3, 0x3025 */
v3 = /* invoke-direct {p0, p1, p2, v2, v3}, Lcom/doodlemobile/basket/opengl/k;->a(Ljavax/microedition/khronos/egl/EGL10;Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLConfig;I)I */
/* const/16 v4, 0x3026 */
v4 = /* invoke-direct {p0, p1, p2, v2, v4}, Lcom/doodlemobile/basket/opengl/k;->a(Ljavax/microedition/khronos/egl/EGL10;Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLConfig;I)I */
/* iget v5, p0, Lcom/doodlemobile/basket/opengl/k;->f:I */
/* if-lt v3, v5, :cond_0 */
/* iget v3, p0, Lcom/doodlemobile/basket/opengl/k;->g:I */
/* if-lt v4, v3, :cond_0 */
/* const/16 v3, 0x3024 */
v3 = /* invoke-direct {p0, p1, p2, v2, v3}, Lcom/doodlemobile/basket/opengl/k;->a(Ljavax/microedition/khronos/egl/EGL10;Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLConfig;I)I */
/* const/16 v4, 0x3023 */
v4 = /* invoke-direct {p0, p1, p2, v2, v4}, Lcom/doodlemobile/basket/opengl/k;->a(Ljavax/microedition/khronos/egl/EGL10;Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLConfig;I)I */
/* const/16 v5, 0x3022 */
v5 = /* invoke-direct {p0, p1, p2, v2, v5}, Lcom/doodlemobile/basket/opengl/k;->a(Ljavax/microedition/khronos/egl/EGL10;Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLConfig;I)I */
/* const/16 v6, 0x3021 */
v6 = /* invoke-direct {p0, p1, p2, v2, v6}, Lcom/doodlemobile/basket/opengl/k;->a(Ljavax/microedition/khronos/egl/EGL10;Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLConfig;I)I */
/* iget v7, p0, Lcom/doodlemobile/basket/opengl/k;->b:I */
/* if-ne v3, v7, :cond_0 */
/* iget v3, p0, Lcom/doodlemobile/basket/opengl/k;->c:I */
/* if-ne v4, v3, :cond_0 */
/* iget v3, p0, Lcom/doodlemobile/basket/opengl/k;->d:I */
/* if-ne v5, v3, :cond_0 */
/* iget v3, p0, Lcom/doodlemobile/basket/opengl/k;->e:I */
/* if-ne v6, v3, :cond_0 */
/* move-object v0, v2 */
} // :goto_1
} // :cond_0
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // .end method
