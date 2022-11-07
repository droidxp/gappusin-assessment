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
/* .line 85 */
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
/* .line 87 */
int v12 = 0; // const/4 v12, 0x0
/* .line 88 */
/* .local v12, "depth":I */
int v13 = 0; // const/4 v13, 0x0
/* .line 90 */
/* .local v13, "stencil":I */
int v0 = 1; // const/4 v0, 0x1
/* new-array v3, v0, [Ljavax/microedition/khronos/egl/EGLConfig; */
/* .line 91 */
/* .local v3, "configs":[Ljavax/microedition/khronos/egl/EGLConfig; */
int v0 = 1; // const/4 v0, 0x1
/* new-array v5, v0, [I */
/* .line 149 */
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
/* .line 154 */
/* .local v2, "attrs1":[I */
int v4 = 1; // const/4 v4, 0x1
/* move-object v0, p1 */
/* move-object/from16 v1, p2 */
/* invoke-interface/range {v0 ..v5}, Ljavax/microedition/khronos/egl/EGL10;->eglChooseConfig(Ljavax/microedition/khronos/egl/EGLDisplay;[I[Ljavax/microedition/khronos/egl/EGLConfig;I[I)Z */
/* .line 155 */
final String v0 = "EGL"; // const-string v0, "EGL"
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v4 = "Matched depth + stencil : "; // const-string v4, "Matched depth + stencil : "
(( java.lang.StringBuilder ) v1 ).append ( v4 ); // invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
int v4 = 0; // const/4 v4, 0x0
/* aget v4, v5, v4 */
(( java.lang.StringBuilder ) v1 ).append ( v4 ); // invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .v ( v0,v1 );
/* .line 156 */
int v0 = 0; // const/4 v0, 0x0
/* aget v0, v5, v0 */
int v1 = 1; // const/4 v1, 0x1
/* if-ne v0, v1, :cond_0 */
/* .line 157 */
int v0 = 0; // const/4 v0, 0x0
/* aget-object v0, v3, v0 */
/* .line 166 */
} // :goto_0
/* .line 160 */
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
/* new-array v8, v0, [I */
int v0 = 0; // const/4 v0, 0x0
/* const/16 v1, 0x3038 */
/* aput v1, v8, v0 */
/* .line 161 */
/* .local v8, "attrs2":[I */
int v10 = 1; // const/4 v10, 0x1
/* move-object v6, p1 */
/* move-object/from16 v7, p2 */
/* move-object v9, v3 */
/* move-object v11, v5 */
/* invoke-interface/range {v6 ..v11}, Ljavax/microedition/khronos/egl/EGL10;->eglChooseConfig(Ljavax/microedition/khronos/egl/EGLDisplay;[I[Ljavax/microedition/khronos/egl/EGLConfig;I[I)Z */
/* .line 162 */
int v0 = 0; // const/4 v0, 0x0
/* aget v0, v5, v0 */
int v1 = 1; // const/4 v1, 0x1
/* if-ne v0, v1, :cond_1 */
/* .line 163 */
int v0 = 0; // const/4 v0, 0x0
/* aget-object v0, v3, v0 */
/* .line 164 */
} // :cond_1
final String v0 = "EGL"; // const-string v0, "EGL"
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v4 = "Matched any : "; // const-string v4, "Matched any : "
(( java.lang.StringBuilder ) v1 ).append ( v4 ); // invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
int v4 = 0; // const/4 v4, 0x0
/* aget v4, v5, v4 */
(( java.lang.StringBuilder ) v1 ).append ( v4 ); // invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .v ( v0,v1 );
/* .line 166 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
