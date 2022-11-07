abstract class android.opengl.derived.SwapGLSurfaceView$BaseConfigChooser implements android.opengl.GLSurfaceView$EGLConfigChooser {
	 /* .source "SwapGLSurfaceView.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Landroid/opengl/derived/SwapGLSurfaceView; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x40a */
/* name = "BaseConfigChooser" */
} // .end annotation
/* # instance fields */
protected mConfigSpec;
/* # direct methods */
public android.opengl.derived.SwapGLSurfaceView$BaseConfigChooser ( ) {
/* .locals 0 */
/* .param p1, "configSpec" # [I */
/* .prologue */
/* .line 490 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 491 */
this.mConfigSpec = p1;
/* .line 492 */
return;
} // .end method
/* # virtual methods */
public javax.microedition.khronos.egl.EGLConfig chooseConfig ( javax.microedition.khronos.egl.EGL10 p0, javax.microedition.khronos.egl.EGLDisplay p1 ) {
/* .locals 7 */
/* .param p1, "egl" # Ljavax/microedition/khronos/egl/EGL10; */
/* .param p2, "display" # Ljavax/microedition/khronos/egl/EGLDisplay; */
/* .prologue */
int v4 = 0; // const/4 v4, 0x0
/* .line 494 */
int v0 = 1; // const/4 v0, 0x1
/* new-array v5, v0, [I */
/* .line 495 */
/* .local v5, "num_config":[I */
v2 = this.mConfigSpec;
int v3 = 0; // const/4 v3, 0x0
/* move-object v0, p1 */
/* move-object v1, p2 */
/* invoke-interface/range {v0 ..v5}, Ljavax/microedition/khronos/egl/EGL10;->eglChooseConfig(Ljavax/microedition/khronos/egl/EGLDisplay;[I[Ljavax/microedition/khronos/egl/EGLConfig;I[I)Z */
/* .line 497 */
/* aget v4, v5, v4 */
/* .line 499 */
/* .local v4, "numConfigs":I */
/* if-gtz v4, :cond_0 */
/* .line 500 */
/* new-instance v0, Ljava/lang/IllegalArgumentException; */
final String v1 = "No configs match configSpec"; // const-string v1, "No configs match configSpec"
/* invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
/* .line 504 */
} // :cond_0
/* new-array v3, v4, [Ljavax/microedition/khronos/egl/EGLConfig; */
/* .line 505 */
/* .local v3, "configs":[Ljavax/microedition/khronos/egl/EGLConfig; */
v2 = this.mConfigSpec;
/* move-object v0, p1 */
/* move-object v1, p2 */
/* invoke-interface/range {v0 ..v5}, Ljavax/microedition/khronos/egl/EGL10;->eglChooseConfig(Ljavax/microedition/khronos/egl/EGLDisplay;[I[Ljavax/microedition/khronos/egl/EGLConfig;I[I)Z */
/* .line 507 */
(( android.opengl.derived.SwapGLSurfaceView$BaseConfigChooser ) p0 ).chooseConfig ( p1, p2, v3 ); // invoke-virtual {p0, p1, p2, v3}, Landroid/opengl/derived/SwapGLSurfaceView$BaseConfigChooser;->chooseConfig(Ljavax/microedition/khronos/egl/EGL10;Ljavax/microedition/khronos/egl/EGLDisplay;[Ljavax/microedition/khronos/egl/EGLConfig;)Ljavax/microedition/khronos/egl/EGLConfig;
/* .line 508 */
/* .local v6, "config":Ljavax/microedition/khronos/egl/EGLConfig; */
/* if-nez v6, :cond_1 */
/* .line 509 */
/* new-instance v0, Ljava/lang/IllegalArgumentException; */
final String v1 = "No config chosen"; // const-string v1, "No config chosen"
/* invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
/* .line 511 */
} // :cond_1
} // .end method
abstract javax.microedition.khronos.egl.EGLConfig chooseConfig ( javax.microedition.khronos.egl.EGL10 p0, javax.microedition.khronos.egl.EGLDisplay p1, javax.microedition.khronos.egl.EGLConfig[] p2 ) {
} // .end method
