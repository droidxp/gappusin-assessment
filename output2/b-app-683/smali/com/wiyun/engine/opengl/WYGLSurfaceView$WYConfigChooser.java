class com.wiyun.engine.opengl.WYGLSurfaceView$WYConfigChooser implements android.opengl.GLSurfaceView$EGLConfigChooser {
	 /* .source "WYGLSurfaceView.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/wiyun/engine/opengl/WYGLSurfaceView; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x2 */
/* name = "WYConfigChooser" */
} // .end annotation
/* # instance fields */
private Boolean mTransparent;
final com.wiyun.engine.opengl.WYGLSurfaceView this$0; //synthetic
/* # direct methods */
 com.wiyun.engine.opengl.WYGLSurfaceView$WYConfigChooser ( ) {
/* .locals 0 */
/* .param p2, "transparent" # Z */
/* .prologue */
/* .line 367 */
this.this$0 = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 368 */
/* iput-boolean p2, p0, Lcom/wiyun/engine/opengl/WYGLSurfaceView$WYConfigChooser;->mTransparent:Z */
/* .line 369 */
return;
} // .end method
/* # virtual methods */
public javax.microedition.khronos.egl.EGLConfig chooseConfig ( javax.microedition.khronos.egl.EGL10 p0, javax.microedition.khronos.egl.EGLDisplay p1 ) {
/* .locals 16 */
/* .param p1, "egl" # Ljavax/microedition/khronos/egl/EGL10; */
/* .param p2, "display" # Ljavax/microedition/khronos/egl/EGLDisplay; */
/* .prologue */
/* .line 377 */
int v14 = 5; // const/4 v14, 0x5
/* .local v14, "r":I */
int v10 = 6; // const/4 v10, 0x6
/* .local v10, "g":I */
int v9 = 5; // const/4 v9, 0x5
/* .local v9, "b":I */
int v8 = 0; // const/4 v8, 0x0
/* .line 378 */
/* .local v8, "a":I */
/* move-object/from16 v0, p0 */
/* iget-boolean v2, v0, Lcom/wiyun/engine/opengl/WYGLSurfaceView$WYConfigChooser;->mTransparent:Z */
if ( v2 != null) { // if-eqz v2, :cond_0
	 /* .line 379 */
	 /* const/16 v14, 0x8 */
	 /* .line 380 */
	 /* const/16 v10, 0x8 */
	 /* .line 381 */
	 /* const/16 v9, 0x8 */
	 /* .line 382 */
	 /* const/16 v8, 0x8 */
	 /* .line 384 */
} // :cond_0
int v11 = 0; // const/4 v11, 0x0
/* .line 385 */
/* .local v11, "i":I */
/* const/16 v2, 0x20 */
/* new-array v4, v2, [I */
/* .line 386 */
/* .local v4, "config_attribs":[I */
/* const/16 v2, 0x1f */
/* const/16 v3, 0x3038 */
/* aput v3, v4, v2 */
/* .line 387 */
/* add-int/lit8 v12, v11, 0x1 */
} // .end local v11 # "i":I
/* .local v12, "i":I */
/* const/16 v2, 0x3024 */
/* aput v2, v4, v11 */
/* .line 388 */
/* add-int/lit8 v11, v12, 0x1 */
} // .end local v12 # "i":I
/* .restart local v11 # "i":I */
/* aput v14, v4, v12 */
/* .line 389 */
/* add-int/lit8 v12, v11, 0x1 */
} // .end local v11 # "i":I
/* .restart local v12 # "i":I */
/* const/16 v2, 0x3023 */
/* aput v2, v4, v11 */
/* .line 390 */
/* add-int/lit8 v11, v12, 0x1 */
} // .end local v12 # "i":I
/* .restart local v11 # "i":I */
/* aput v10, v4, v12 */
/* .line 391 */
/* add-int/lit8 v12, v11, 0x1 */
} // .end local v11 # "i":I
/* .restart local v12 # "i":I */
/* const/16 v2, 0x3022 */
/* aput v2, v4, v11 */
/* .line 392 */
/* add-int/lit8 v11, v12, 0x1 */
} // .end local v12 # "i":I
/* .restart local v11 # "i":I */
/* aput v9, v4, v12 */
/* .line 393 */
/* add-int/lit8 v12, v11, 0x1 */
} // .end local v11 # "i":I
/* .restart local v12 # "i":I */
/* const/16 v2, 0x3021 */
/* aput v2, v4, v11 */
/* .line 394 */
/* add-int/lit8 v11, v12, 0x1 */
} // .end local v12 # "i":I
/* .restart local v11 # "i":I */
/* aput v8, v4, v12 */
/* .line 397 */
/* move-object/from16 v0, p0 */
v2 = this.this$0;
v2 = com.wiyun.engine.opengl.WYGLSurfaceView .access$0 ( v2 );
if ( v2 != null) { // if-eqz v2, :cond_1
/* .line 398 */
/* add-int/lit8 v12, v11, 0x1 */
} // .end local v11 # "i":I
/* .restart local v12 # "i":I */
/* const/16 v2, 0x3025 */
/* aput v2, v4, v11 */
/* .line 399 */
/* add-int/lit8 v11, v12, 0x1 */
} // .end local v12 # "i":I
/* .restart local v11 # "i":I */
/* const/16 v2, 0x10 */
/* aput v2, v4, v12 */
/* .line 403 */
} // :cond_1
/* move-object/from16 v0, p0 */
v2 = this.this$0;
v2 = com.wiyun.engine.opengl.WYGLSurfaceView .access$1 ( v2 );
if ( v2 != null) { // if-eqz v2, :cond_2
/* .line 404 */
/* add-int/lit8 v12, v11, 0x1 */
} // .end local v11 # "i":I
/* .restart local v12 # "i":I */
/* const/16 v2, 0x3026 */
/* aput v2, v4, v11 */
/* .line 405 */
/* add-int/lit8 v11, v12, 0x1 */
} // .end local v12 # "i":I
/* .restart local v11 # "i":I */
/* const/16 v2, 0x8 */
/* aput v2, v4, v12 */
/* .line 409 */
} // :cond_2
/* add-int/lit8 v12, v11, 0x1 */
} // .end local v11 # "i":I
/* .restart local v12 # "i":I */
/* const/16 v2, 0x3033 */
/* aput v2, v4, v11 */
/* .line 410 */
/* add-int/lit8 v11, v12, 0x1 */
} // .end local v12 # "i":I
/* .restart local v11 # "i":I */
int v2 = 4; // const/4 v2, 0x4
/* aput v2, v4, v12 */
/* .line 413 */
/* const/16 v2, 0x3038 */
/* aput v2, v4, v11 */
/* .line 416 */
int v2 = 1; // const/4 v2, 0x1
/* new-array v7, v2, [I */
/* .line 417 */
/* .local v7, "num_config":[I */
int v5 = 0; // const/4 v5, 0x0
int v6 = 0; // const/4 v6, 0x0
/* move-object/from16 v2, p1 */
/* move-object/from16 v3, p2 */
/* invoke-interface/range {v2 ..v7}, Ljavax/microedition/khronos/egl/EGL10;->eglChooseConfig(Ljavax/microedition/khronos/egl/EGLDisplay;[I[Ljavax/microedition/khronos/egl/EGLConfig;I[I)Z */
/* .line 420 */
int v2 = 0; // const/4 v2, 0x0
/* aget v2, v7, v2 */
/* if-gtz v2, :cond_3 */
/* .line 421 */
/* new-instance v2, Ljava/lang/IllegalArgumentException; */
final String v3 = "Failed to find a suitable config"; // const-string v3, "Failed to find a suitable config"
/* invoke-direct {v2, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v2 */
/* .line 424 */
} // :cond_3
int v2 = 0; // const/4 v2, 0x0
/* aget v2, v7, v2 */
/* new-array v5, v2, [Ljavax/microedition/khronos/egl/EGLConfig; */
/* .line 425 */
/* .local v5, "configs":[Ljavax/microedition/khronos/egl/EGLConfig; */
int v2 = 0; // const/4 v2, 0x0
/* aget v6, v7, v2 */
/* move-object/from16 v2, p1 */
/* move-object/from16 v3, p2 */
/* invoke-interface/range {v2 ..v7}, Ljavax/microedition/khronos/egl/EGL10;->eglChooseConfig(Ljavax/microedition/khronos/egl/EGLDisplay;[I[Ljavax/microedition/khronos/egl/EGLConfig;I[I)Z */
/* .line 428 */
int v2 = 1; // const/4 v2, 0x1
/* new-array v15, v2, [I */
/* .line 429 */
/* .local v15, "value":[I */
int v13 = 0; // const/4 v13, 0x0
/* .local v13, "j":I */
} // :goto_0
int v2 = 0; // const/4 v2, 0x0
/* aget v2, v7, v2 */
/* if-lt v13, v2, :cond_4 */
/* .line 436 */
int v2 = 0; // const/4 v2, 0x0
} // :goto_1
/* .line 430 */
} // :cond_4
/* aget-object v2, v5, v13 */
/* const/16 v3, 0x3024 */
/* move-object/from16 v0, p1 */
v2 = /* move-object/from16 v1, p2 */
if ( v2 != null) { // if-eqz v2, :cond_5
int v2 = 0; // const/4 v2, 0x0
/* aget v2, v15, v2 */
/* if-ne v2, v14, :cond_5 */
/* .line 431 */
/* aget-object v2, v5, v13 */
/* const/16 v3, 0x3023 */
/* move-object/from16 v0, p1 */
v2 = /* move-object/from16 v1, p2 */
if ( v2 != null) { // if-eqz v2, :cond_5
int v2 = 0; // const/4 v2, 0x0
/* aget v2, v15, v2 */
/* if-ne v2, v10, :cond_5 */
/* .line 432 */
/* aget-object v2, v5, v13 */
/* const/16 v3, 0x3022 */
/* move-object/from16 v0, p1 */
v2 = /* move-object/from16 v1, p2 */
if ( v2 != null) { // if-eqz v2, :cond_5
int v2 = 0; // const/4 v2, 0x0
/* aget v2, v15, v2 */
/* if-ne v2, v9, :cond_5 */
/* .line 433 */
/* aget-object v2, v5, v13 */
/* const/16 v3, 0x3021 */
/* move-object/from16 v0, p1 */
v2 = /* move-object/from16 v1, p2 */
if ( v2 != null) { // if-eqz v2, :cond_5
int v2 = 0; // const/4 v2, 0x0
/* aget v2, v15, v2 */
/* if-ne v2, v8, :cond_5 */
/* .line 434 */
/* aget-object v2, v5, v13 */
/* .line 429 */
} // :cond_5
/* add-int/lit8 v13, v13, 0x1 */
} // .end method
