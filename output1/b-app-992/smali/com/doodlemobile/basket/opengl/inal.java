class inal {
	 /* # instance fields */
	 private Boolean a;
	 private Integer b;
	 private Boolean c;
	 private Boolean d;
	 private com.doodlemobile.basket.opengl.d e;
	 /* # direct methods */
	 inal ( ) { //synthethic
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* invoke-direct {p0, v0}, Lcom/doodlemobile/basket/opengl/f;-><init>(B)V */
		 return;
	 } // .end method
	 private inal ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 private void d ( ) {
		 /* .locals 1 */
		 /* iget-boolean v0, p0, Lcom/doodlemobile/basket/opengl/f;->a:Z */
		 /* if-nez v0, :cond_0 */
		 int v0 = 1; // const/4 v0, 0x1
		 /* iput-boolean v0, p0, Lcom/doodlemobile/basket/opengl/f;->a:Z */
	 } // :cond_0
	 return;
} // .end method
/* # virtual methods */
public synchronized final void a ( Object p0 ) {
	 /* .locals 1 */
	 /* monitor-enter p0 */
	 try { // :try_start_0
		 com.doodlemobile.basket.opengl.d .a ( p1 );
		 v0 = this.e;
		 /* if-ne v0, p1, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
		 this.e = v0;
	 } // :cond_0
	 (( java.lang.Object ) p0 ).notifyAll ( ); // invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V
	 /* :try_end_0 */
	 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
	 /* monitor-exit p0 */
	 return;
	 /* :catchall_0 */
	 /* move-exception v0 */
	 /* monitor-exit p0 */
	 /* throw v0 */
} // .end method
public synchronized final Boolean a ( ) {
	 /* .locals 1 */
	 /* monitor-enter p0 */
	 int v0 = 1; // const/4 v0, 0x1
	 /* monitor-exit p0 */
} // .end method
public synchronized final Boolean b ( ) {
	 /* .locals 1 */
	 /* monitor-enter p0 */
	 try { // :try_start_0
		 /* invoke-direct {p0}, Lcom/doodlemobile/basket/opengl/f;->d()V */
		 /* iget-boolean v0, p0, Lcom/doodlemobile/basket/opengl/f;->d:Z */
		 /* :try_end_0 */
		 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
		 /* if-nez v0, :cond_0 */
		 int v0 = 1; // const/4 v0, 0x1
	 } // :goto_0
	 /* monitor-exit p0 */
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
public final Boolean b ( Object p0 ) {
/* .locals 2 */
int v1 = 1; // const/4 v1, 0x1
v0 = this.e;
/* if-eq v0, p1, :cond_0 */
v0 = this.e;
/* if-nez v0, :cond_1 */
} // :cond_0
this.e = p1;
(( java.lang.Object ) p0 ).notifyAll ( ); // invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V
/* move v0, v1 */
} // :goto_0
} // :cond_1
/* invoke-direct {p0}, Lcom/doodlemobile/basket/opengl/f;->d()V */
/* iget-boolean v0, p0, Lcom/doodlemobile/basket/opengl/f;->d:Z */
if ( v0 != null) { // if-eqz v0, :cond_2
/* move v0, v1 */
} // :cond_2
int v0 = 0; // const/4 v0, 0x0
} // .end method
public synchronized final void c ( ) {
/* .locals 2 */
/* monitor-enter p0 */
try { // :try_start_0
/* iget-boolean v0, p0, Lcom/doodlemobile/basket/opengl/f;->c:Z */
/* if-nez v0, :cond_1 */
/* invoke-direct {p0}, Lcom/doodlemobile/basket/opengl/f;->d()V */
/* iget v0, p0, Lcom/doodlemobile/basket/opengl/f;->b:I */
/* const/high16 v1, 0x20000 */
/* if-ge v0, v1, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lcom/doodlemobile/basket/opengl/f;->d:Z */
(( java.lang.Object ) p0 ).notifyAll ( ); // invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/doodlemobile/basket/opengl/f;->c:Z */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
} // :cond_1
/* monitor-exit p0 */
return;
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
public final void c ( Object p0 ) {
/* .locals 1 */
v0 = this.e;
/* if-ne v0, p1, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
this.e = v0;
} // :cond_0
(( java.lang.Object ) p0 ).notifyAll ( ); // invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V
return;
} // .end method
                                                                                                                                                                                                     this.f;
/* if-nez v0, :cond_8 */
final String v0 = "eglMakeCurrent"; // const-string v0, "eglMakeCurrent"
/* invoke-direct {p0, v0}, Lcom/doodlemobile/basket/opengl/a;->a(Ljava/lang/String;)V */
} // :cond_8
v0 = this.d;
v0 = com.doodlemobile.basket.opengl.l .a ( v0 );
int v1 = 2; // const/4 v1, 0x2
/* if-ne v0, v1, :cond_9 */
/* new-instance v0, Lcom/doodlemobile/basket/opengl/GLES20; */
/* invoke-direct {v0}, Lcom/doodlemobile/basket/opengl/GLES20;-><init>()V */
} // :goto_1
v1 = this.d;
com.doodlemobile.basket.opengl.l .f ( v1 );
if ( v1 != null) { // if-eqz v1, :cond_5
v0 = this.d;
com.doodlemobile.basket.opengl.l .f ( v0 );
} // :cond_9
/* new-instance v0, Lcom/doodlemobile/basket/opengl/GLES10; */
/* invoke-direct {v0}, Lcom/doodlemobile/basket/opengl/GLES10;-><init>()V */
} // .end method
public final void a ( ) {
/* .locals 7 */
int v3 = 2; // const/4 v3, 0x2
int v4 = 0; // const/4 v4, 0x0
final String v6 = "createContext"; // const-string v6, "createContext"
final String v5 = "Basket"; // const-string v5, "Basket"
javax.microedition.khronos.egl.EGLContext .getEGL ( );
/* check-cast v0, Ljavax/microedition/khronos/egl/EGL10; */
this.a = v0;
v0 = this.a;
v1 = javax.microedition.khronos.egl.EGL10.EGL_DEFAULT_DISPLAY;
this.b = v0;
v0 = this.b;
v1 = javax.microedition.khronos.egl.EGL10.EGL_NO_DISPLAY;
/* if-ne v0, v1, :cond_0 */
/* new-instance v0, Ljava/lang/RuntimeException; */
final String v1 = "eglGetDisplay failed"; // const-string v1, "eglGetDisplay failed"
/* invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // :cond_0
/* new-array v0, v3, [I */
v1 = this.a;
v0 = v2 = this.b;
/* if-nez v0, :cond_1 */
/* new-instance v0, Ljava/lang/RuntimeException; */
final String v1 = "eglInitialize failed"; // const-string v1, "eglInitialize failed"
/* invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // :cond_1
v0 = this.d;
v0 = com.doodlemobile.basket.opengl.l .a ( v0 );
/* if-ne v0, v3, :cond_4 */
try { // :try_start_0
v0 = this.d;
com.doodlemobile.basket.opengl.l .b ( v0 );
v1 = this.a;
v2 = this.b;
this.e = v0;
v0 = this.d;
com.doodlemobile.basket.opengl.l .c ( v0 );
v1 = this.a;
v2 = this.b;
v3 = this.e;
this.f = v0;
v0 = this.f;
if ( v0 != null) { // if-eqz v0, :cond_2
v0 = this.f;
v1 = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT;
/* if-ne v0, v1, :cond_3 */
} // :cond_2
final String v0 = "createContext"; // const-string v0, "createContext"
/* invoke-direct {p0, v0}, Lcom/doodlemobile/basket/opengl/a;->a(Ljava/lang/String;)V */
} // :cond_3
int v0 = 0; // const/4 v0, 0x0
this.c = v0;
final String v0 = "basketgl2"; // const-string v0, "basketgl2"
java.lang.System .loadLibrary ( v0 );
final String v0 = "Basket"; // const-string v0, "Basket"
final String v1 = "Create OpenGL ES 2.0 successed."; // const-string v1, "Create OpenGL ES 2.0 successed."
android.util.Log .d ( v0,v1 );
/* :try_end_0 */
/* .catch Ljava/lang/Throwable; {:try_start_0 ..:try_end_0} :catch_0 */
} // :goto_0
return;
/* :catch_0 */
/* move-exception v0 */
this.f = v4;
this.e = v4;
final String v0 = "Basket"; // const-string v0, "Basket"
final String v0 = "Create OpenGL ES 2.0 Failed, try 1.0 instead"; // const-string v0, "Create OpenGL ES 2.0 Failed, try 1.0 instead"
android.util.Log .d ( v5,v0 );
} // :cond_4
v0 = this.d;
com.doodlemobile.basket.opengl.l .d ( v0 );
v0 = this.d;
com.doodlemobile.basket.opengl.l .b ( v0 );
v1 = this.a;
v2 = this.b;
this.e = v0;
v0 = this.d;
com.doodlemobile.basket.opengl.l .c ( v0 );
v1 = this.a;
v2 = this.b;
v3 = this.e;
this.f = v0;
v0 = this.f;
if ( v0 != null) { // if-eqz v0, :cond_5
v0 = this.f;
v1 = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT;
/* if-ne v0, v1, :cond_6 */
} // :cond_5
this.f = v4;
final String v0 = "createContext"; // const-string v0, "createContext"
/* invoke-direct {p0, v6}, Lcom/doodlemobile/basket/opengl/a;->a(Ljava/lang/String;)V */
} // :cond_6
this.c = v4;
final String v0 = "basketgl1"; // const-string v0, "basketgl1"
java.lang.System .loadLibrary ( v0 );
final String v0 = "Basket"; // const-string v0, "Basket"
final String v0 = "Create OpenGL ES 1.0 successed."; // const-string v0, "Create OpenGL ES 1.0 successed."
android.util.Log .d ( v5,v0 );
} // .end method
public final void b ( ) {
/* .locals 5 */
int v4 = 0; // const/4 v4, 0x0
v0 = this.f;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.d;
com.doodlemobile.basket.opengl.l .c ( v0 );
v1 = this.a;
v2 = this.b;
v3 = this.f;
this.f = v4;
} // :cond_0
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = this.a;
v1 = this.b;
this.b = v4;
} // :cond_1
return;
} // .end method
