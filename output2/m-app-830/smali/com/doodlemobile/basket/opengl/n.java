abstract class com.doodlemobile.basket.opengl.n implements com.doodlemobile.basket.opengl.p {
	 /* # interfaces */
	 /* # instance fields */
	 private a;
	 private com.doodlemobile.basket.opengl.l b; //synthetic
	 /* # direct methods */
	 public com.doodlemobile.basket.opengl.n ( ) {
		 /* .locals 0 */
		 this.b = p1;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 this.a = p2;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final javax.microedition.khronos.egl.EGLConfig a ( javax.microedition.khronos.egl.EGL10 p0, javax.microedition.khronos.egl.EGLDisplay p1 ) {
		 /* .locals 6 */
		 int v5 = 1; // const/4 v5, 0x1
		 int v4 = 0; // const/4 v4, 0x0
		 v0 = this.a;
		 v1 = this.b;
		 v1 = 		 com.doodlemobile.basket.opengl.l .a ( v1 );
		 int v2 = 2; // const/4 v2, 0x2
		 /* if-eq v1, v2, :cond_0 */
		 /* move-object v2, v0 */
	 } // :goto_0
	 /* new-array v5, v5, [I */
	 int v3 = 0; // const/4 v3, 0x0
	 /* move-object v0, p1 */
	 /* move-object v1, p2 */
	 v0 = 	 /* invoke-interface/range {v0 ..v5}, Ljavax/microedition/khronos/egl/EGL10;->eglChooseConfig(Ljavax/microedition/khronos/egl/EGLDisplay;[I[Ljavax/microedition/khronos/egl/EGLConfig;I[I)Z */
	 /* if-nez v0, :cond_1 */
	 /* new-instance v0, Ljava/lang/IllegalArgumentException; */
	 final String v1 = "eglChooseConfig failed"; // const-string v1, "eglChooseConfig failed"
	 /* invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
	 /* throw v0 */
} // :cond_0
/* array-length v1, v0 */
/* add-int/lit8 v2, v1, 0x2 */
/* new-array v2, v2, [I */
/* sub-int v3, v1, v5 */
java.lang.System .arraycopy ( v0,v4,v2,v4,v3 );
/* sub-int v0, v1, v5 */
/* const/16 v3, 0x3040 */
/* aput v3, v2, v0 */
int v0 = 4; // const/4 v0, 0x4
/* aput v0, v2, v1 */
/* add-int/lit8 v0, v1, 0x1 */
/* const/16 v1, 0x3038 */
/* aput v1, v2, v0 */
} // :cond_1
/* aget v4, v5, v4 */
/* if-gtz v4, :cond_2 */
/* new-instance v0, Ljava/lang/IllegalArgumentException; */
final String v1 = "No configs match configSpec"; // const-string v1, "No configs match configSpec"
/* invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // :cond_2
/* new-array v3, v4, [Ljavax/microedition/khronos/egl/EGLConfig; */
/* move-object v0, p1 */
/* move-object v1, p2 */
v0 = /* invoke-interface/range {v0 ..v5}, Ljavax/microedition/khronos/egl/EGL10;->eglChooseConfig(Ljavax/microedition/khronos/egl/EGLDisplay;[I[Ljavax/microedition/khronos/egl/EGLConfig;I[I)Z */
/* if-nez v0, :cond_3 */
/* new-instance v0, Ljava/lang/IllegalArgumentException; */
final String v1 = "eglChooseConfig#2 failed"; // const-string v1, "eglChooseConfig#2 failed"
/* invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // :cond_3
(( com.doodlemobile.basket.opengl.n ) p0 ).a ( p1, p2, v3 ); // invoke-virtual {p0, p1, p2, v3}, Lcom/doodlemobile/basket/opengl/n;->a(Ljavax/microedition/khronos/egl/EGL10;Ljavax/microedition/khronos/egl/EGLDisplay;[Ljavax/microedition/khronos/egl/EGLConfig;)Ljavax/microedition/khronos/egl/EGLConfig;
/* if-nez v0, :cond_4 */
/* new-instance v0, Ljava/lang/IllegalArgumentException; */
final String v1 = "No config chosen"; // const-string v1, "No config chosen"
/* invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // :cond_4
} // .end method
abstract javax.microedition.khronos.egl.EGLConfig a ( javax.microedition.khronos.egl.EGL10 p0, javax.microedition.khronos.egl.EGLDisplay p1, javax.microedition.khronos.egl.EGLConfig[] p2 ) {
} // .end method
