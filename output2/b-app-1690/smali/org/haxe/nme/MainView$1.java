class org.haxe.nme.MainView$1 implements android.opengl.GLSurfaceView$EGLConfigChooser {
	 /* .source "MainView.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lorg/haxe/nme/MainView;-><init>(Landroid/content/Context;Landroid/app/Activity;)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final org.haxe.nme.MainView this$0; //synthetic
final Integer val$renderType; //synthetic
/* # direct methods */
 org.haxe.nme.MainView$1 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 70 */
this.this$0 = p1;
/* iput p2, p0, Lorg/haxe/nme/MainView$1;->val$renderType:I */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public javax.microedition.khronos.egl.EGLConfig chooseConfig ( javax.microedition.khronos.egl.EGL10 p0, javax.microedition.khronos.egl.EGLDisplay p1 ) {
/* .locals 14 */
/* .param p1, "egl" # Ljavax/microedition/khronos/egl/EGL10; */
/* .param p2, "display" # Ljavax/microedition/khronos/egl/EGLDisplay; */
/* .prologue */
/* .line 74 */
int v12 = 0; // const/4 v12, 0x0
/* .line 75 */
/* .local v12, "depth":I */
int v13 = 0; // const/4 v13, 0x0
/* .line 76 */
/* .local v13, "stencil":I */
int v0 = 1; // const/4 v0, 0x1
/* new-array v3, v0, [Ljavax/microedition/khronos/egl/EGLConfig; */
/* .line 77 */
/* .local v3, "configs":[Ljavax/microedition/khronos/egl/EGLConfig; */
int v0 = 1; // const/4 v0, 0x1
/* new-array v5, v0, [I */
/* .line 147 */
/* .local v5, "num_config":[I */
int v0 = 7; // const/4 v0, 0x7
/* new-array v2, v0, [I */
int v0 = 0; // const/4 v0, 0x0
/* const/16 v1, 0x3025 */
/* aput v1, v2, v0 */
int v0 = 1; // const/4 v0, 0x1
/* aput v12, v2, v0 */
int v0 = 2; // const/4 v0, 0x2
/* const/16 v1, 0x3026 */
/* aput v1, v2, v0 */
int v0 = 3; // const/4 v0, 0x3
/* aput v13, v2, v0 */
int v0 = 4; // const/4 v0, 0x4
/* const/16 v1, 0x3040 */
/* aput v1, v2, v0 */
int v0 = 5; // const/4 v0, 0x5
/* iget v1, p0, Lorg/haxe/nme/MainView$1;->val$renderType:I */
/* aput v1, v2, v0 */
int v0 = 6; // const/4 v0, 0x6
/* const/16 v1, 0x3038 */
/* aput v1, v2, v0 */
/* .line 156 */
/* .local v2, "attrs1":[I */
int v4 = 1; // const/4 v4, 0x1
/* move-object v0, p1 */
/* move-object/from16 v1, p2 */
/* invoke-interface/range {v0 ..v5}, Ljavax/microedition/khronos/egl/EGL10;->eglChooseConfig(Ljavax/microedition/khronos/egl/EGLDisplay;[I[Ljavax/microedition/khronos/egl/EGLConfig;I[I)Z */
/* .line 158 */
int v0 = 0; // const/4 v0, 0x0
/* aget v0, v5, v0 */
int v1 = 1; // const/4 v1, 0x1
/* if-ne v0, v1, :cond_0 */
/* .line 160 */
int v0 = 0; // const/4 v0, 0x0
/* aget-object v0, v3, v0 */
/* .line 178 */
} // :goto_0
/* .line 164 */
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
/* new-array v8, v0, [I */
int v0 = 0; // const/4 v0, 0x0
/* const/16 v1, 0x3038 */
/* aput v1, v8, v0 */
/* .line 170 */
/* .local v8, "attrs2":[I */
int v10 = 1; // const/4 v10, 0x1
/* move-object v6, p1 */
/* move-object/from16 v7, p2 */
/* move-object v9, v3 */
/* move-object v11, v5 */
/* invoke-interface/range {v6 ..v11}, Ljavax/microedition/khronos/egl/EGL10;->eglChooseConfig(Ljavax/microedition/khronos/egl/EGLDisplay;[I[Ljavax/microedition/khronos/egl/EGLConfig;I[I)Z */
/* .line 172 */
int v0 = 0; // const/4 v0, 0x0
/* aget v0, v5, v0 */
int v1 = 1; // const/4 v1, 0x1
/* if-ne v0, v1, :cond_1 */
/* .line 174 */
int v0 = 0; // const/4 v0, 0x0
/* aget-object v0, v3, v0 */
/* .line 178 */
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // .end method
