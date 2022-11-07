public abstract class com.nvidia.devtech.NvGLESActivity extends com.nvidia.devtech.NvActivity {
	 /* .source "NvGLESActivity.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/nvidia/devtech/NvGLESActivity$RawData;, */
	 /* Lcom/nvidia/devtech/NvGLESActivity$RawTexture; */
	 /* } */
} // .end annotation
/* # instance fields */
protected Integer alphaSize;
protected Integer blueSize;
protected configAttrs;
protected contextAttrs;
protected Integer depthSize;
javax.microedition.khronos.egl.EGL10 egl;
protected javax.microedition.khronos.egl.EGLConfig eglConfig;
protected javax.microedition.khronos.egl.EGLContext eglContext;
protected javax.microedition.khronos.egl.EGLDisplay eglDisplay;
protected javax.microedition.khronos.egl.EGLSurface eglSurface;
private Integer fixedHeight;
private Integer fixedWidth;
private android.widget.TextView fpsText;
javax.microedition.khronos.opengles.GL11 gl;
protected Integer greenSize;
private java.lang.Runnable initRunnable;
private java.lang.Runnable painter;
private Boolean paused;
private Boolean ranInit;
protected Integer redSize;
protected Integer stencilSize;
private Integer surfaceHeight;
private Integer surfaceWidth;
/* # direct methods */
public com.nvidia.devtech.NvGLESActivity ( ) {
	 /* .locals 4 */
	 /* .prologue */
	 int v3 = 5; // const/4 v3, 0x5
	 int v2 = 0; // const/4 v2, 0x0
	 int v1 = 0; // const/4 v1, 0x0
	 /* .line 52 */
	 /* invoke-direct {p0}, Lcom/nvidia/devtech/NvActivity;-><init>()V */
	 /* .line 55 */
	 this.egl = v1;
	 /* .line 56 */
	 this.gl = v1;
	 /* .line 58 */
	 /* iput-boolean v2, p0, Lcom/nvidia/devtech/NvGLESActivity;->ranInit:Z */
	 /* .line 59 */
	 /* iput-boolean v2, p0, Lcom/nvidia/devtech/NvGLESActivity;->paused:Z */
	 /* .line 60 */
	 this.eglSurface = v1;
	 /* .line 61 */
	 this.eglDisplay = v1;
	 /* .line 62 */
	 this.eglContext = v1;
	 /* .line 63 */
	 this.eglConfig = v1;
	 /* .line 65 */
	 this.initRunnable = v1;
	 /* .line 66 */
	 this.painter = v1;
	 /* .line 68 */
	 /* iput v2, p0, Lcom/nvidia/devtech/NvGLESActivity;->surfaceWidth:I */
	 /* .line 69 */
	 /* iput v2, p0, Lcom/nvidia/devtech/NvGLESActivity;->surfaceHeight:I */
	 /* .line 71 */
	 this.fpsText = v1;
	 /* .line 73 */
	 /* iput v2, p0, Lcom/nvidia/devtech/NvGLESActivity;->fixedWidth:I */
	 /* .line 74 */
	 /* iput v2, p0, Lcom/nvidia/devtech/NvGLESActivity;->fixedHeight:I */
	 /* .line 403 */
	 /* iput v3, p0, Lcom/nvidia/devtech/NvGLESActivity;->redSize:I */
	 /* .line 405 */
	 int v0 = 6; // const/4 v0, 0x6
	 /* iput v0, p0, Lcom/nvidia/devtech/NvGLESActivity;->greenSize:I */
	 /* .line 407 */
	 /* iput v3, p0, Lcom/nvidia/devtech/NvGLESActivity;->blueSize:I */
	 /* .line 409 */
	 /* iput v2, p0, Lcom/nvidia/devtech/NvGLESActivity;->alphaSize:I */
	 /* .line 411 */
	 /* iput v2, p0, Lcom/nvidia/devtech/NvGLESActivity;->stencilSize:I */
	 /* .line 413 */
	 /* const/16 v0, 0x10 */
	 /* iput v0, p0, Lcom/nvidia/devtech/NvGLESActivity;->depthSize:I */
	 /* .line 416 */
	 this.configAttrs = v1;
	 /* .line 418 */
	 this.contextAttrs = v1;
	 /* .line 52 */
	 return;
} // .end method
static void access$0 ( com.nvidia.devtech.NvGLESActivity p0, Boolean p1 ) { //synthethic
	 /* .locals 0 */
	 /* .prologue */
	 /* .line 58 */
	 /* iput-boolean p1, p0, Lcom/nvidia/devtech/NvGLESActivity;->ranInit:Z */
	 return;
} // .end method
static Integer access$1 ( com.nvidia.devtech.NvGLESActivity p0 ) { //synthethic
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 68 */
	 /* iget v0, p0, Lcom/nvidia/devtech/NvGLESActivity;->surfaceWidth:I */
} // .end method
static void access$10 ( com.nvidia.devtech.NvGLESActivity p0, Integer p1 ) { //synthethic
	 /* .locals 0 */
	 /* .prologue */
	 /* .line 68 */
	 /* iput p1, p0, Lcom/nvidia/devtech/NvGLESActivity;->surfaceWidth:I */
	 return;
} // .end method
static void access$11 ( com.nvidia.devtech.NvGLESActivity p0, Integer p1 ) { //synthethic
	 /* .locals 0 */
	 /* .prologue */
	 /* .line 69 */
	 /* iput p1, p0, Lcom/nvidia/devtech/NvGLESActivity;->surfaceHeight:I */
	 return;
} // .end method
static Integer access$2 ( com.nvidia.devtech.NvGLESActivity p0 ) { //synthethic
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 69 */
	 /* iget v0, p0, Lcom/nvidia/devtech/NvGLESActivity;->surfaceHeight:I */
} // .end method
static Boolean access$3 ( com.nvidia.devtech.NvGLESActivity p0 ) { //synthethic
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 59 */
	 /* iget-boolean v0, p0, Lcom/nvidia/devtech/NvGLESActivity;->paused:Z */
} // .end method
static android.widget.TextView access$4 ( com.nvidia.devtech.NvGLESActivity p0 ) { //synthethic
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 71 */
	 v0 = this.fpsText;
} // .end method
static void access$5 ( com.nvidia.devtech.NvGLESActivity p0, java.lang.Runnable p1 ) { //synthethic
	 /* .locals 0 */
	 /* .prologue */
	 /* .line 66 */
	 this.painter = p1;
	 return;
} // .end method
static java.lang.Runnable access$6 ( com.nvidia.devtech.NvGLESActivity p0 ) { //synthethic
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 66 */
	 v0 = this.painter;
} // .end method
static Integer access$7 ( com.nvidia.devtech.NvGLESActivity p0 ) { //synthethic
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 73 */
	 /* iget v0, p0, Lcom/nvidia/devtech/NvGLESActivity;->fixedWidth:I */
} // .end method
static Integer access$8 ( com.nvidia.devtech.NvGLESActivity p0 ) { //synthethic
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 74 */
	 /* iget v0, p0, Lcom/nvidia/devtech/NvGLESActivity;->fixedHeight:I */
} // .end method
static java.lang.Runnable access$9 ( com.nvidia.devtech.NvGLESActivity p0 ) { //synthethic
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 65 */
	 v0 = this.initRunnable;
} // .end method
/* # virtual methods */
protected void cleanupEGL ( ) {
	 /* .locals 6 */
	 /* .prologue */
	 int v5 = 0; // const/4 v5, 0x0
	 /* .line 559 */
	 (( com.nvidia.devtech.NvGLESActivity ) p0 ).destroyEGLSurface ( ); // invoke-virtual {p0}, Lcom/nvidia/devtech/NvGLESActivity;->destroyEGLSurface()V
	 /* .line 560 */
	 v0 = this.eglDisplay;
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 561 */
		 v0 = this.egl;
		 v1 = this.eglDisplay;
		 v2 = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE;
		 v3 = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE;
		 v4 = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT;
		 /* .line 562 */
	 } // :cond_0
	 v0 = this.eglContext;
	 if ( v0 != null) { // if-eqz v0, :cond_1
		 /* .line 563 */
		 v0 = this.egl;
		 v1 = this.eglDisplay;
		 v2 = this.eglContext;
		 /* .line 564 */
	 } // :cond_1
	 v0 = this.eglDisplay;
	 if ( v0 != null) { // if-eqz v0, :cond_2
		 /* .line 565 */
		 v0 = this.egl;
		 v1 = this.eglDisplay;
		 /* .line 567 */
	 } // :cond_2
	 this.eglDisplay = v5;
	 /* .line 568 */
	 this.eglContext = v5;
	 /* .line 569 */
	 this.eglSurface = v5;
	 /* .line 570 */
	 return;
} // .end method
protected Boolean createEGLSurface ( android.view.SurfaceHolder p0 ) {
	 /* .locals 5 */
	 /* .param p1, "surface" # Landroid/view/SurfaceHolder; */
	 /* .prologue */
	 /* .line 533 */
	 v0 = this.egl;
	 v1 = this.eglDisplay;
	 v2 = this.eglConfig;
	 int v3 = 0; // const/4 v3, 0x0
	 this.eglSurface = v0;
	 /* .line 534 */
	 v0 = java.lang.System.out;
	 /* new-instance v1, Ljava/lang/StringBuilder; */
	 final String v2 = "eglSurface: "; // const-string v2, "eglSurface: "
	 /* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
	 v2 = this.eglSurface;
	 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
	 final String v2 = ", err: "; // const-string v2, ", err: "
	 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 v2 = 	 v2 = this.egl;
	 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 (( java.io.PrintStream ) v0 ).println ( v1 ); // invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
	 /* .line 535 */
	 v0 = this.egl;
	 v1 = this.eglDisplay;
	 v2 = this.eglSurface;
	 v3 = this.eglSurface;
	 v4 = this.eglContext;
	 /* .line 536 */
	 v0 = java.lang.System.out;
	 /* new-instance v1, Ljava/lang/StringBuilder; */
	 final String v2 = "eglMakeCurrent err: "; // const-string v2, "eglMakeCurrent err: "
	 /* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
	 v2 = 	 v2 = this.egl;
	 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 (( java.io.PrintStream ) v0 ).println ( v1 ); // invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
	 /* .line 537 */
	 int v0 = 1; // const/4 v0, 0x1
} // .end method
protected void destroyEGLSurface ( ) {
	 /* .locals 5 */
	 /* .prologue */
	 /* .line 546 */
	 v0 = this.eglDisplay;
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 v0 = this.eglSurface;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 547 */
			 v0 = this.egl;
			 v1 = this.eglDisplay;
			 v2 = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE;
			 v3 = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE;
			 v4 = this.eglContext;
			 /* .line 548 */
		 } // :cond_0
		 v0 = this.eglSurface;
		 if ( v0 != null) { // if-eqz v0, :cond_1
			 /* .line 549 */
			 v0 = this.egl;
			 v1 = this.eglDisplay;
			 v2 = this.eglSurface;
			 /* .line 550 */
		 } // :cond_1
		 int v0 = 0; // const/4 v0, 0x0
		 this.eglSurface = v0;
		 /* .line 551 */
		 return;
	 } // .end method
	 public void enableOnScreenFPS ( ) {
		 /* .locals 3 */
		 /* .prologue */
		 /* const/16 v2, 0x64 */
		 /* .line 395 */
		 v0 = this.fpsText;
		 /* if-nez v0, :cond_0 */
		 /* .line 397 */
		 /* new-instance v0, Landroid/widget/TextView; */
		 /* invoke-direct {v0, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V */
		 this.fpsText = v0;
		 /* .line 398 */
		 v0 = this.fpsText;
		 /* new-instance v1, Landroid/view/ViewGroup$LayoutParams; */
		 /* invoke-direct {v1, v2, v2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V */
		 (( com.nvidia.devtech.NvGLESActivity ) p0 ).addContentView ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lcom/nvidia/devtech/NvGLESActivity;->addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
		 /* .line 400 */
	 } // :cond_0
	 return;
} // .end method
protected Boolean initEGL ( ) {
	 /* .locals 25 */
	 /* .prologue */
	 /* .line 428 */
	 /* move-object/from16 v0, p0 */
	 v1 = this.configAttrs;
	 /* if-nez v1, :cond_0 */
	 /* .line 429 */
	 int v1 = 1; // const/4 v1, 0x1
	 /* new-array v1, v1, [I */
	 int v2 = 0; // const/4 v2, 0x0
	 /* const/16 v3, 0x3038 */
	 /* aput v3, v1, v2 */
	 /* move-object/from16 v0, p0 */
	 this.configAttrs = v1;
	 /* .line 430 */
} // :cond_0
/* move-object/from16 v0, p0 */
v0 = this.configAttrs;
/* move-object/from16 v17, v0 */
/* .line 432 */
/* .local v17, "oldConf":[I */
/* move-object/from16 v0, v17 */
/* array-length v1, v0 */
/* add-int/lit8 v1, v1, 0xd */
/* add-int/lit8 v1, v1, -0x1 */
/* new-array v1, v1, [I */
/* move-object/from16 v0, p0 */
this.configAttrs = v1;
/* .line 433 */
int v14 = 0; // const/4 v14, 0x0
/* .line 434 */
/* .local v14, "i":I */
int v14 = 0; // const/4 v14, 0x0
} // :goto_0
/* move-object/from16 v0, v17 */
/* array-length v1, v0 */
/* add-int/lit8 v1, v1, -0x1 */
/* if-lt v14, v1, :cond_1 */
/* .line 436 */
/* move-object/from16 v0, p0 */
v1 = this.configAttrs;
/* add-int/lit8 v15, v14, 0x1 */
} // .end local v14 # "i":I
/* .local v15, "i":I */
/* const/16 v2, 0x3024 */
/* aput v2, v1, v14 */
/* .line 437 */
/* move-object/from16 v0, p0 */
v1 = this.configAttrs;
/* add-int/lit8 v14, v15, 0x1 */
} // .end local v15 # "i":I
/* .restart local v14 # "i":I */
/* move-object/from16 v0, p0 */
/* iget v2, v0, Lcom/nvidia/devtech/NvGLESActivity;->redSize:I */
/* aput v2, v1, v15 */
/* .line 438 */
/* move-object/from16 v0, p0 */
v1 = this.configAttrs;
/* add-int/lit8 v15, v14, 0x1 */
} // .end local v14 # "i":I
/* .restart local v15 # "i":I */
/* const/16 v2, 0x3023 */
/* aput v2, v1, v14 */
/* .line 439 */
/* move-object/from16 v0, p0 */
v1 = this.configAttrs;
/* add-int/lit8 v14, v15, 0x1 */
} // .end local v15 # "i":I
/* .restart local v14 # "i":I */
/* move-object/from16 v0, p0 */
/* iget v2, v0, Lcom/nvidia/devtech/NvGLESActivity;->greenSize:I */
/* aput v2, v1, v15 */
/* .line 440 */
/* move-object/from16 v0, p0 */
v1 = this.configAttrs;
/* add-int/lit8 v15, v14, 0x1 */
} // .end local v14 # "i":I
/* .restart local v15 # "i":I */
/* const/16 v2, 0x3022 */
/* aput v2, v1, v14 */
/* .line 441 */
/* move-object/from16 v0, p0 */
v1 = this.configAttrs;
/* add-int/lit8 v14, v15, 0x1 */
} // .end local v15 # "i":I
/* .restart local v14 # "i":I */
/* move-object/from16 v0, p0 */
/* iget v2, v0, Lcom/nvidia/devtech/NvGLESActivity;->blueSize:I */
/* aput v2, v1, v15 */
/* .line 442 */
/* move-object/from16 v0, p0 */
v1 = this.configAttrs;
/* add-int/lit8 v15, v14, 0x1 */
} // .end local v14 # "i":I
/* .restart local v15 # "i":I */
/* const/16 v2, 0x3021 */
/* aput v2, v1, v14 */
/* .line 443 */
/* move-object/from16 v0, p0 */
v1 = this.configAttrs;
/* add-int/lit8 v14, v15, 0x1 */
} // .end local v15 # "i":I
/* .restart local v14 # "i":I */
/* move-object/from16 v0, p0 */
/* iget v2, v0, Lcom/nvidia/devtech/NvGLESActivity;->alphaSize:I */
/* aput v2, v1, v15 */
/* .line 444 */
/* move-object/from16 v0, p0 */
v1 = this.configAttrs;
/* add-int/lit8 v15, v14, 0x1 */
} // .end local v14 # "i":I
/* .restart local v15 # "i":I */
/* const/16 v2, 0x3026 */
/* aput v2, v1, v14 */
/* .line 445 */
/* move-object/from16 v0, p0 */
v1 = this.configAttrs;
/* add-int/lit8 v14, v15, 0x1 */
} // .end local v15 # "i":I
/* .restart local v14 # "i":I */
/* move-object/from16 v0, p0 */
/* iget v2, v0, Lcom/nvidia/devtech/NvGLESActivity;->stencilSize:I */
/* aput v2, v1, v15 */
/* .line 446 */
/* move-object/from16 v0, p0 */
v1 = this.configAttrs;
/* add-int/lit8 v15, v14, 0x1 */
} // .end local v14 # "i":I
/* .restart local v15 # "i":I */
/* const/16 v2, 0x3025 */
/* aput v2, v1, v14 */
/* .line 447 */
/* move-object/from16 v0, p0 */
v1 = this.configAttrs;
/* add-int/lit8 v14, v15, 0x1 */
} // .end local v15 # "i":I
/* .restart local v14 # "i":I */
/* move-object/from16 v0, p0 */
/* iget v2, v0, Lcom/nvidia/devtech/NvGLESActivity;->depthSize:I */
/* aput v2, v1, v15 */
/* .line 448 */
/* move-object/from16 v0, p0 */
v1 = this.configAttrs;
/* add-int/lit8 v15, v14, 0x1 */
} // .end local v14 # "i":I
/* .restart local v15 # "i":I */
/* const/16 v2, 0x3038 */
/* aput v2, v1, v14 */
/* .line 450 */
javax.microedition.khronos.egl.EGLContext .getEGL ( );
/* check-cast v1, Ljavax/microedition/khronos/egl/EGL10; */
/* move-object/from16 v0, p0 */
this.egl = v1;
/* .line 451 */
/* move-object/from16 v0, p0 */
v1 = this.egl;
/* .line 452 */
/* move-object/from16 v0, p0 */
v1 = this.egl;
v2 = javax.microedition.khronos.egl.EGL10.EGL_DEFAULT_DISPLAY;
/* move-object/from16 v0, p0 */
this.eglDisplay = v1;
/* .line 453 */
v1 = java.lang.System.out;
/* new-instance v2, Ljava/lang/StringBuilder; */
final String v3 = "eglDisplay: "; // const-string v3, "eglDisplay: "
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* move-object/from16 v0, p0 */
v3 = this.eglDisplay;
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v3 = ", err: "; // const-string v3, ", err: "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* move-object/from16 v0, p0 */
v3 = v3 = this.egl;
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( java.io.PrintStream ) v1 ).println ( v2 ); // invoke-virtual {v1, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
/* .line 454 */
int v1 = 2; // const/4 v1, 0x2
/* new-array v0, v1, [I */
/* move-object/from16 v23, v0 */
/* .line 455 */
/* .local v23, "version":[I */
/* move-object/from16 v0, p0 */
v1 = this.egl;
/* move-object/from16 v0, p0 */
v2 = this.eglDisplay;
v19 = /* move-object/from16 v0, v23 */
/* .line 456 */
/* .local v19, "ret":Z */
v1 = java.lang.System.out;
/* new-instance v2, Ljava/lang/StringBuilder; */
final String v3 = "EglInitialize returned: "; // const-string v3, "EglInitialize returned: "
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* move/from16 v0, v19 */
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( java.io.PrintStream ) v1 ).println ( v2 ); // invoke-virtual {v1, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
/* .line 457 */
/* if-nez v19, :cond_2 */
/* .line 459 */
int v1 = 0; // const/4 v1, 0x0
/* move v14, v15 */
/* .line 521 */
} // .end local v15 # "i":I
/* .restart local v14 # "i":I */
} // :goto_1
/* .line 435 */
} // .end local v19 # "ret":Z
} // .end local v23 # "version":[I
} // :cond_1
/* move-object/from16 v0, p0 */
v1 = this.configAttrs;
/* aget v2, v17, v14 */
/* aput v2, v1, v14 */
/* .line 434 */
/* add-int/lit8 v14, v14, 0x1 */
/* goto/16 :goto_0 */
/* .line 461 */
} // .end local v14 # "i":I
/* .restart local v15 # "i":I */
/* .restart local v19 # "ret":Z */
/* .restart local v23 # "version":[I */
} // :cond_2
/* move-object/from16 v0, p0 */
v12 = v1 = this.egl;
/* .line 462 */
/* .local v12, "eglErr":I */
/* const/16 v1, 0x3000 */
/* if-eq v12, v1, :cond_3 */
/* .line 463 */
int v1 = 0; // const/4 v1, 0x0
/* move v14, v15 */
} // .end local v15 # "i":I
/* .restart local v14 # "i":I */
/* .line 464 */
} // .end local v14 # "i":I
/* .restart local v15 # "i":I */
} // :cond_3
v1 = java.lang.System.out;
/* new-instance v2, Ljava/lang/StringBuilder; */
final String v3 = "eglInitialize err: "; // const-string v3, "eglInitialize err: "
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v2 ).append ( v12 ); // invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( java.io.PrintStream ) v1 ).println ( v2 ); // invoke-virtual {v1, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
/* .line 466 */
/* const/16 v1, 0x14 */
/* new-array v4, v1, [Ljavax/microedition/khronos/egl/EGLConfig; */
/* .line 467 */
/* .local v4, "config":[Ljavax/microedition/khronos/egl/EGLConfig; */
int v1 = 1; // const/4 v1, 0x1
/* new-array v6, v1, [I */
/* .line 468 */
/* .local v6, "num_configs":[I */
/* move-object/from16 v0, p0 */
v1 = this.egl;
/* move-object/from16 v0, p0 */
v2 = this.eglDisplay;
/* move-object/from16 v0, p0 */
v3 = this.configAttrs;
/* array-length v5, v4 */
/* invoke-interface/range {v1 ..v6}, Ljavax/microedition/khronos/egl/EGL10;->eglChooseConfig(Ljavax/microedition/khronos/egl/EGLDisplay;[I[Ljavax/microedition/khronos/egl/EGLConfig;I[I)Z */
/* .line 469 */
v1 = java.lang.System.out;
/* new-instance v2, Ljava/lang/StringBuilder; */
final String v3 = "eglChooseConfig err: "; // const-string v3, "eglChooseConfig err: "
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* move-object/from16 v0, p0 */
v3 = v3 = this.egl;
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( java.io.PrintStream ) v1 ).println ( v2 ); // invoke-virtual {v1, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
/* .line 471 */
/* const/high16 v21, 0x1000000 */
/* .line 472 */
/* .local v21, "score":I */
int v1 = 1; // const/4 v1, 0x1
/* new-array v0, v1, [I */
/* move-object/from16 v22, v0 */
/* .line 473 */
/* .local v22, "val":[I */
int v14 = 0; // const/4 v14, 0x0
} // .end local v15 # "i":I
/* .restart local v14 # "i":I */
} // :goto_2
int v1 = 0; // const/4 v1, 0x0
/* aget v1, v6, v1 */
/* if-lt v14, v1, :cond_4 */
/* .line 517 */
/* move-object/from16 v0, p0 */
v1 = this.egl;
/* move-object/from16 v0, p0 */
v2 = this.eglDisplay;
/* move-object/from16 v0, p0 */
v3 = this.eglConfig;
v5 = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT;
/* move-object/from16 v0, p0 */
v0 = this.contextAttrs;
/* move-object/from16 v24, v0 */
/* move-object/from16 v0, v24 */
/* move-object/from16 v0, p0 */
this.eglContext = v1;
/* .line 518 */
v1 = java.lang.System.out;
/* new-instance v2, Ljava/lang/StringBuilder; */
final String v3 = "eglCreateContext: "; // const-string v3, "eglCreateContext: "
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* move-object/from16 v0, p0 */
v3 = v3 = this.egl;
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( java.io.PrintStream ) v1 ).println ( v2 ); // invoke-virtual {v1, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
/* .line 520 */
/* move-object/from16 v0, p0 */
v1 = this.eglContext;
(( javax.microedition.khronos.egl.EGLContext ) v1 ).getGL ( ); // invoke-virtual {v1}, Ljavax/microedition/khronos/egl/EGLContext;->getGL()Ljavax/microedition/khronos/opengles/GL;
/* check-cast v1, Ljavax/microedition/khronos/opengles/GL11; */
/* move-object/from16 v0, p0 */
this.gl = v1;
/* .line 521 */
int v1 = 1; // const/4 v1, 0x1
/* goto/16 :goto_1 */
/* .line 475 */
} // :cond_4
int v9 = 1; // const/4 v9, 0x1
/* .line 476 */
/* .local v9, "cont":Z */
int v10 = 0; // const/4 v10, 0x0
/* .line 478 */
/* .local v10, "currScore":I */
/* const/16 v16, 0x0 */
/* .local v16, "j":I */
} // :goto_3
/* move-object/from16 v0, v17 */
/* array-length v1, v0 */
/* add-int/lit8 v1, v1, -0x1 */
/* shr-int/lit8 v1, v1, 0x1 */
/* move/from16 v0, v16 */
/* if-lt v0, v1, :cond_6 */
/* .line 487 */
} // :goto_4
/* if-nez v9, :cond_8 */
/* .line 473 */
} // :cond_5
} // :goto_5
/* add-int/lit8 v14, v14, 0x1 */
/* .line 480 */
} // :cond_6
/* move-object/from16 v0, p0 */
v1 = this.egl;
/* move-object/from16 v0, p0 */
v2 = this.eglDisplay;
/* aget-object v3, v4, v14 */
/* move-object/from16 v0, p0 */
v5 = this.configAttrs;
/* mul-int/lit8 v24, v16, 0x2 */
/* aget v5, v5, v24 */
/* move-object/from16 v0, v22 */
/* .line 481 */
int v1 = 0; // const/4 v1, 0x0
/* aget v1, v22, v1 */
/* move-object/from16 v0, p0 */
v2 = this.configAttrs;
/* mul-int/lit8 v3, v16, 0x2 */
/* add-int/lit8 v3, v3, 0x1 */
/* aget v2, v2, v3 */
/* and-int/2addr v1, v2 */
/* move-object/from16 v0, p0 */
v2 = this.configAttrs;
/* mul-int/lit8 v3, v16, 0x2 */
/* add-int/lit8 v3, v3, 0x1 */
/* aget v2, v2, v3 */
/* if-eq v1, v2, :cond_7 */
/* .line 483 */
int v9 = 0; // const/4 v9, 0x0
/* .line 484 */
/* .line 478 */
} // :cond_7
/* add-int/lit8 v16, v16, 0x1 */
/* .line 489 */
} // :cond_8
/* move-object/from16 v0, p0 */
v1 = this.egl;
/* move-object/from16 v0, p0 */
v2 = this.eglDisplay;
/* aget-object v3, v4, v14 */
/* const/16 v5, 0x3024 */
/* move-object/from16 v0, v22 */
int v1 = 0; // const/4 v1, 0x0
/* aget v18, v22, v1 */
/* .line 490 */
/* .local v18, "r":I */
/* move-object/from16 v0, p0 */
v1 = this.egl;
/* move-object/from16 v0, p0 */
v2 = this.eglDisplay;
/* aget-object v3, v4, v14 */
/* const/16 v5, 0x3023 */
/* move-object/from16 v0, v22 */
int v1 = 0; // const/4 v1, 0x0
/* aget v13, v22, v1 */
/* .line 491 */
/* .local v13, "g":I */
/* move-object/from16 v0, p0 */
v1 = this.egl;
/* move-object/from16 v0, p0 */
v2 = this.eglDisplay;
/* aget-object v3, v4, v14 */
/* const/16 v5, 0x3022 */
/* move-object/from16 v0, v22 */
int v1 = 0; // const/4 v1, 0x0
/* aget v8, v22, v1 */
/* .line 492 */
/* .local v8, "b":I */
/* move-object/from16 v0, p0 */
v1 = this.egl;
/* move-object/from16 v0, p0 */
v2 = this.eglDisplay;
/* aget-object v3, v4, v14 */
/* const/16 v5, 0x3021 */
/* move-object/from16 v0, v22 */
int v1 = 0; // const/4 v1, 0x0
/* aget v7, v22, v1 */
/* .line 493 */
/* .local v7, "a":I */
/* move-object/from16 v0, p0 */
v1 = this.egl;
/* move-object/from16 v0, p0 */
v2 = this.eglDisplay;
/* aget-object v3, v4, v14 */
/* const/16 v5, 0x3025 */
/* move-object/from16 v0, v22 */
int v1 = 0; // const/4 v1, 0x0
/* aget v11, v22, v1 */
/* .line 494 */
/* .local v11, "d":I */
/* move-object/from16 v0, p0 */
v1 = this.egl;
/* move-object/from16 v0, p0 */
v2 = this.eglDisplay;
/* aget-object v3, v4, v14 */
/* const/16 v5, 0x3026 */
/* move-object/from16 v0, v22 */
int v1 = 0; // const/4 v1, 0x0
/* aget v20, v22, v1 */
/* .line 496 */
/* .local v20, "s":I */
v1 = java.lang.System.out;
/* new-instance v2, Ljava/lang/StringBuilder; */
final String v3 = ">>> EGL Config ["; // const-string v3, ">>> EGL Config ["
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v2 ).append ( v14 ); // invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v3 = "] R"; // const-string v3, "] R"
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* move/from16 v0, v18 */
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v3 = "G"; // const-string v3, "G"
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( v13 ); // invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v3 = "B"; // const-string v3, "B"
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( v8 ); // invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v3 = "A"; // const-string v3, "A"
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( v7 ); // invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v3 = " D"; // const-string v3, " D"
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( v11 ); // invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v3 = "S"; // const-string v3, "S"
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* move/from16 v0, v20 */
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( java.io.PrintStream ) v1 ).println ( v2 ); // invoke-virtual {v1, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
/* .line 498 */
/* move-object/from16 v0, p0 */
/* iget v1, v0, Lcom/nvidia/devtech/NvGLESActivity;->redSize:I */
/* sub-int v1, v18, v1 */
v1 = java.lang.Math .abs ( v1 );
/* move-object/from16 v0, p0 */
/* iget v2, v0, Lcom/nvidia/devtech/NvGLESActivity;->greenSize:I */
/* sub-int v2, v13, v2 */
v2 = java.lang.Math .abs ( v2 );
/* add-int/2addr v1, v2 */
/* move-object/from16 v0, p0 */
/* iget v2, v0, Lcom/nvidia/devtech/NvGLESActivity;->blueSize:I */
/* sub-int v2, v8, v2 */
v2 = java.lang.Math .abs ( v2 );
/* add-int/2addr v1, v2 */
/* move-object/from16 v0, p0 */
/* iget v2, v0, Lcom/nvidia/devtech/NvGLESActivity;->alphaSize:I */
/* sub-int v2, v7, v2 */
v2 = java.lang.Math .abs ( v2 );
/* add-int/2addr v1, v2 */
/* shl-int/lit8 v10, v1, 0x10 */
/* .line 499 */
/* move-object/from16 v0, p0 */
/* iget v1, v0, Lcom/nvidia/devtech/NvGLESActivity;->depthSize:I */
/* sub-int v1, v11, v1 */
v1 = java.lang.Math .abs ( v1 );
/* shl-int/lit8 v1, v1, 0x8 */
/* add-int/2addr v10, v1 */
/* .line 500 */
/* move-object/from16 v0, p0 */
/* iget v1, v0, Lcom/nvidia/devtech/NvGLESActivity;->stencilSize:I */
/* sub-int v1, v20, v1 */
v1 = java.lang.Math .abs ( v1 );
/* add-int/2addr v10, v1 */
/* .line 502 */
/* move/from16 v0, v21 */
/* if-ge v10, v0, :cond_5 */
/* .line 504 */
v1 = java.lang.System.out;
final String v2 = "--------------------------"; // const-string v2, "--------------------------"
(( java.io.PrintStream ) v1 ).println ( v2 ); // invoke-virtual {v1, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
/* .line 505 */
v1 = java.lang.System.out;
/* new-instance v2, Ljava/lang/StringBuilder; */
final String v3 = "New config chosen: "; // const-string v3, "New config chosen: "
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v2 ).append ( v14 ); // invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( java.io.PrintStream ) v1 ).println ( v2 ); // invoke-virtual {v1, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
/* .line 506 */
/* const/16 v16, 0x0 */
} // :goto_6
/* move-object/from16 v0, p0 */
v1 = this.configAttrs;
/* array-length v1, v1 */
/* add-int/lit8 v1, v1, -0x1 */
/* shr-int/lit8 v1, v1, 0x1 */
/* move/from16 v0, v16 */
/* if-lt v0, v1, :cond_9 */
/* .line 513 */
/* move/from16 v21, v10 */
/* .line 514 */
/* aget-object v1, v4, v14 */
/* move-object/from16 v0, p0 */
this.eglConfig = v1;
/* goto/16 :goto_5 */
/* .line 508 */
} // :cond_9
/* move-object/from16 v0, p0 */
v1 = this.egl;
/* move-object/from16 v0, p0 */
v2 = this.eglDisplay;
/* aget-object v3, v4, v14 */
/* move-object/from16 v0, p0 */
v5 = this.configAttrs;
/* mul-int/lit8 v24, v16, 0x2 */
/* aget v5, v5, v24 */
/* move-object/from16 v0, v22 */
/* .line 509 */
int v1 = 0; // const/4 v1, 0x0
/* aget v1, v22, v1 */
/* move-object/from16 v0, p0 */
v2 = this.configAttrs;
/* mul-int/lit8 v3, v16, 0x2 */
/* add-int/lit8 v3, v3, 0x1 */
/* aget v2, v2, v3 */
/* if-lt v1, v2, :cond_a */
/* .line 510 */
v1 = java.lang.System.out;
/* new-instance v2, Ljava/lang/StringBuilder; */
final String v3 = "setting "; // const-string v3, "setting "
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* move/from16 v0, v16 */
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v3 = ", matches: "; // const-string v3, ", matches: "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
int v3 = 0; // const/4 v3, 0x0
/* aget v3, v22, v3 */
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( java.io.PrintStream ) v1 ).println ( v2 ); // invoke-virtual {v1, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
/* .line 506 */
} // :cond_a
/* add-int/lit8 v16, v16, 0x1 */
} // .end method
public com.nvidia.devtech.NvGLESActivity$RawData loadFile ( java.lang.String p0 ) {
/* .locals 7 */
/* .param p1, "filename" # Ljava/lang/String; */
/* .prologue */
/* .line 121 */
int v1 = 0; // const/4 v1, 0x0
/* .line 122 */
/* .local v1, "is":Ljava/io/InputStream; */
/* new-instance v3, Lcom/nvidia/devtech/NvGLESActivity$RawData; */
/* invoke-direct {v3, p0}, Lcom/nvidia/devtech/NvGLESActivity$RawData;-><init>(Lcom/nvidia/devtech/NvGLESActivity;)V */
/* .line 126 */
/* .local v3, "ret":Lcom/nvidia/devtech/NvGLESActivity$RawData; */
try { // :try_start_0
/* new-instance v2, Ljava/io/FileInputStream; */
/* new-instance v5, Ljava/lang/StringBuilder; */
final String v6 = "/data/"; // const-string v6, "/data/"
/* invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v5 ).append ( p1 ); // invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v5 ).toString ( ); // invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v2, v5}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V */
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
} // .end local v1 # "is":Ljava/io/InputStream;
/* .local v2, "is":Ljava/io/InputStream; */
/* move-object v1, v2 */
/* .line 138 */
} // .end local v2 # "is":Ljava/io/InputStream;
/* .restart local v1 # "is":Ljava/io/InputStream; */
} // :goto_0
try { // :try_start_1
v4 = (( java.io.InputStream ) v1 ).available ( ); // invoke-virtual {v1}, Ljava/io/InputStream;->available()I
/* .line 139 */
/* .local v4, "size":I */
/* iput v4, v3, Lcom/nvidia/devtech/NvGLESActivity$RawData;->length:I */
/* .line 140 */
/* new-array v5, v4, [B */
this.data = v5;
/* .line 141 */
v5 = this.data;
(( java.io.InputStream ) v1 ).read ( v5 ); // invoke-virtual {v1, v5}, Ljava/io/InputStream;->read([B)I
/* :try_end_1 */
/* .catch Ljava/io/IOException; {:try_start_1 ..:try_end_1} :catch_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 148 */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 150 */
try { // :try_start_2
(( java.io.InputStream ) v1 ).close ( ); // invoke-virtual {v1}, Ljava/io/InputStream;->close()V
/* :try_end_2 */
/* .catch Ljava/lang/Exception; {:try_start_2 ..:try_end_2} :catch_4 */
/* .line 153 */
} // .end local v4 # "size":I
} // :cond_0
} // :goto_1
/* .line 128 */
/* :catch_0 */
/* move-exception v0 */
/* .line 132 */
/* .local v0, "e":Ljava/lang/Exception; */
try { // :try_start_3
(( com.nvidia.devtech.NvGLESActivity ) p0 ).getAssets ( ); // invoke-virtual {p0}, Lcom/nvidia/devtech/NvGLESActivity;->getAssets()Landroid/content/res/AssetManager;
(( android.content.res.AssetManager ) v5 ).open ( p1 ); // invoke-virtual {v5, p1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;
/* :try_end_3 */
/* .catch Ljava/lang/Exception; {:try_start_3 ..:try_end_3} :catch_5 */
/* .catch Ljava/io/IOException; {:try_start_3 ..:try_end_3} :catch_1 */
/* .catchall {:try_start_3 ..:try_end_3} :catchall_0 */
/* .line 143 */
} // .end local v0 # "e":Ljava/lang/Exception;
/* :catch_1 */
/* move-exception v5 */
/* .line 148 */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 150 */
try { // :try_start_4
(( java.io.InputStream ) v1 ).close ( ); // invoke-virtual {v1}, Ljava/io/InputStream;->close()V
/* :try_end_4 */
/* .catch Ljava/lang/Exception; {:try_start_4 ..:try_end_4} :catch_2 */
/* :catch_2 */
/* move-exception v5 */
/* .line 147 */
/* :catchall_0 */
/* move-exception v5 */
/* .line 148 */
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 150 */
try { // :try_start_5
(( java.io.InputStream ) v1 ).close ( ); // invoke-virtual {v1}, Ljava/io/InputStream;->close()V
/* :try_end_5 */
/* .catch Ljava/lang/Exception; {:try_start_5 ..:try_end_5} :catch_3 */
/* .line 152 */
} // :cond_1
} // :goto_2
/* throw v5 */
/* .line 150 */
/* :catch_3 */
/* move-exception v6 */
/* .restart local v4 # "size":I */
/* :catch_4 */
/* move-exception v5 */
/* .line 134 */
} // .end local v4 # "size":I
/* .restart local v0 # "e":Ljava/lang/Exception; */
/* :catch_5 */
/* move-exception v5 */
} // .end method
public com.nvidia.devtech.NvGLESActivity$RawTexture loadTexture ( java.lang.String p0 ) {
/* .locals 24 */
/* .param p1, "filename" # Ljava/lang/String; */
/* .prologue */
/* .line 174 */
/* new-instance v19, Lcom/nvidia/devtech/NvGLESActivity$RawTexture; */
/* move-object/from16 v0, v19 */
/* move-object/from16 v1, p0 */
/* invoke-direct {v0, v1}, Lcom/nvidia/devtech/NvGLESActivity$RawTexture;-><init>(Lcom/nvidia/devtech/NvGLESActivity;)V */
/* .line 176 */
/* .local v19, "ret":Lcom/nvidia/devtech/NvGLESActivity$RawTexture; */
int v15 = 0; // const/4 v15, 0x0
/* .line 179 */
/* .local v15, "is":Ljava/io/InputStream; */
try { // :try_start_0
/* new-instance v16, Ljava/io/FileInputStream; */
/* new-instance v4, Ljava/lang/StringBuilder; */
final String v5 = "/data/"; // const-string v5, "/data/"
/* invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* move-object/from16 v0, p1 */
(( java.lang.StringBuilder ) v4 ).append ( v0 ); // invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* move-object/from16 v0, v16 */
/* invoke-direct {v0, v4}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V */
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
} // .end local v15 # "is":Ljava/io/InputStream;
/* .local v16, "is":Ljava/io/InputStream; */
/* move-object/from16 v15, v16 */
/* .line 192 */
} // .end local v16 # "is":Ljava/io/InputStream;
/* .restart local v15 # "is":Ljava/io/InputStream; */
} // :goto_0
try { // :try_start_1
android.graphics.BitmapFactory .decodeStream ( v15 );
/* .line 193 */
/* .local v2, "bmp":Landroid/graphics/Bitmap; */
v4 = (( android.graphics.Bitmap ) v2 ).getWidth ( ); // invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I
/* move-object/from16 v0, v19 */
/* iput v4, v0, Lcom/nvidia/devtech/NvGLESActivity$RawTexture;->width:I */
/* .line 194 */
v4 = (( android.graphics.Bitmap ) v2 ).getHeight ( ); // invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I
/* move-object/from16 v0, v19 */
/* iput v4, v0, Lcom/nvidia/devtech/NvGLESActivity$RawTexture;->height:I */
/* .line 195 */
v4 = (( android.graphics.Bitmap ) v2 ).getWidth ( ); // invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I
v5 = (( android.graphics.Bitmap ) v2 ).getHeight ( ); // invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I
/* mul-int/2addr v4, v5 */
/* new-array v3, v4, [I */
/* .line 196 */
/* .local v3, "pixels":[I */
int v4 = 0; // const/4 v4, 0x0
v5 = (( android.graphics.Bitmap ) v2 ).getWidth ( ); // invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I
int v6 = 0; // const/4 v6, 0x0
int v7 = 0; // const/4 v7, 0x0
v8 = (( android.graphics.Bitmap ) v2 ).getWidth ( ); // invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I
v9 = (( android.graphics.Bitmap ) v2 ).getHeight ( ); // invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I
/* invoke-virtual/range {v2 ..v9}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V */
/* .line 199 */
v4 = (( android.graphics.Bitmap ) v2 ).getWidth ( ); // invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I
/* new-array v0, v4, [I */
/* move-object/from16 v20, v0 */
/* .line 200 */
/* .local v20, "tmp":[I */
v21 = (( android.graphics.Bitmap ) v2 ).getWidth ( ); // invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I
/* .line 201 */
/* .local v21, "w":I */
v13 = (( android.graphics.Bitmap ) v2 ).getHeight ( ); // invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I
/* .line 202 */
/* .local v13, "h":I */
int v14 = 0; // const/4 v14, 0x0
/* .local v14, "i":I */
} // :goto_1
/* shr-int/lit8 v4, v13, 0x1 */
/* if-lt v14, v4, :cond_0 */
/* .line 210 */
/* array-length v4, v3 */
/* mul-int/lit8 v4, v4, 0x4 */
/* move-object/from16 v0, v19 */
/* iput v4, v0, Lcom/nvidia/devtech/NvGLESActivity$RawTexture;->length:I */
/* .line 211 */
/* move-object/from16 v0, v19 */
/* iget v4, v0, Lcom/nvidia/devtech/NvGLESActivity$RawTexture;->length:I */
/* new-array v4, v4, [B */
/* move-object/from16 v0, v19 */
this.data = v4;
/* :try_end_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_1 */
/* .line 212 */
/* const/16 v18, 0x0 */
/* .line 213 */
/* .local v18, "pos":I */
int v10 = 0; // const/4 v10, 0x0
/* .line 214 */
/* .local v10, "bpos":I */
/* const/16 v23, 0x0 */
/* .local v23, "y":I */
} // :goto_2
/* move/from16 v0, v23 */
/* if-lt v0, v13, :cond_1 */
/* .line 230 */
} // .end local v2 # "bmp":Landroid/graphics/Bitmap;
} // .end local v3 # "pixels":[I
} // .end local v10 # "bpos":I
} // .end local v13 # "h":I
} // .end local v14 # "i":I
} // .end local v18 # "pos":I
} // .end local v20 # "tmp":[I
} // .end local v21 # "w":I
} // .end local v23 # "y":I
} // :goto_3
/* .line 181 */
/* :catch_0 */
/* move-exception v12 */
/* .line 185 */
/* .local v12, "e":Ljava/lang/Exception; */
try { // :try_start_2
/* invoke-virtual/range {p0 ..p0}, Lcom/nvidia/devtech/NvGLESActivity;->getAssets()Landroid/content/res/AssetManager; */
/* move-object/from16 v0, p1 */
(( android.content.res.AssetManager ) v4 ).open ( v0 ); // invoke-virtual {v4, v0}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;
/* :try_end_2 */
/* .catch Ljava/lang/Exception; {:try_start_2 ..:try_end_2} :catch_2 */
/* .line 204 */
} // .end local v12 # "e":Ljava/lang/Exception;
/* .restart local v2 # "bmp":Landroid/graphics/Bitmap; */
/* .restart local v3 # "pixels":[I */
/* .restart local v13 # "h":I */
/* .restart local v14 # "i":I */
/* .restart local v20 # "tmp":[I */
/* .restart local v21 # "w":I */
} // :cond_0
/* mul-int v4, v14, v21 */
int v5 = 0; // const/4 v5, 0x0
try { // :try_start_3
/* move-object/from16 v0, v20 */
/* move/from16 v1, v21 */
java.lang.System .arraycopy ( v3,v4,v0,v5,v1 );
/* .line 205 */
/* add-int/lit8 v4, v13, -0x1 */
/* sub-int/2addr v4, v14 */
/* mul-int v4, v4, v21 */
/* mul-int v5, v14, v21 */
/* move/from16 v0, v21 */
java.lang.System .arraycopy ( v3,v4,v3,v5,v0 );
/* .line 206 */
int v4 = 0; // const/4 v4, 0x0
/* add-int/lit8 v5, v13, -0x1 */
/* sub-int/2addr v5, v14 */
/* mul-int v5, v5, v21 */
/* move-object/from16 v0, v20 */
/* move/from16 v1, v21 */
java.lang.System .arraycopy ( v0,v4,v3,v5,v1 );
/* .line 202 */
/* add-int/lit8 v14, v14, 0x1 */
/* .line 216 */
/* .restart local v10 # "bpos":I */
/* .restart local v18 # "pos":I */
/* .restart local v23 # "y":I */
} // :cond_1
/* const/16 v22, 0x0 */
/* .local v22, "x":I */
/* move v11, v10 */
} // .end local v10 # "bpos":I
/* .local v11, "bpos":I */
} // :goto_4
/* move/from16 v0, v22 */
/* move/from16 v1, v21 */
/* if-lt v0, v1, :cond_2 */
/* .line 214 */
/* add-int/lit8 v23, v23, 0x1 */
/* move v10, v11 */
} // .end local v11 # "bpos":I
/* .restart local v10 # "bpos":I */
/* .line 218 */
} // .end local v10 # "bpos":I
/* .restart local v11 # "bpos":I */
} // :cond_2
/* aget v17, v3, v18 */
/* .line 219 */
/* .local v17, "p":I */
/* move-object/from16 v0, v19 */
v4 = this.data;
/* add-int/lit8 v10, v11, 0x1 */
} // .end local v11 # "bpos":I
/* .restart local v10 # "bpos":I */
/* shr-int/lit8 v5, v17, 0x10 */
/* and-int/lit16 v5, v5, 0xff */
/* int-to-byte v5, v5 */
/* aput-byte v5, v4, v11 */
/* .line 220 */
/* move-object/from16 v0, v19 */
v4 = this.data;
/* add-int/lit8 v11, v10, 0x1 */
} // .end local v10 # "bpos":I
/* .restart local v11 # "bpos":I */
/* shr-int/lit8 v5, v17, 0x8 */
/* and-int/lit16 v5, v5, 0xff */
/* int-to-byte v5, v5 */
/* aput-byte v5, v4, v10 */
/* .line 221 */
/* move-object/from16 v0, v19 */
v4 = this.data;
/* add-int/lit8 v10, v11, 0x1 */
} // .end local v11 # "bpos":I
/* .restart local v10 # "bpos":I */
/* shr-int/lit8 v5, v17, 0x0 */
/* and-int/lit16 v5, v5, 0xff */
/* int-to-byte v5, v5 */
/* aput-byte v5, v4, v11 */
/* .line 222 */
/* move-object/from16 v0, v19 */
v4 = this.data;
/* add-int/lit8 v11, v10, 0x1 */
} // .end local v10 # "bpos":I
/* .restart local v11 # "bpos":I */
/* shr-int/lit8 v5, v17, 0x18 */
/* and-int/lit16 v5, v5, 0xff */
/* int-to-byte v5, v5 */
/* aput-byte v5, v4, v10 */
/* :try_end_3 */
/* .catch Ljava/lang/Exception; {:try_start_3 ..:try_end_3} :catch_1 */
/* .line 216 */
/* add-int/lit8 v22, v22, 0x1 */
/* add-int/lit8 v18, v18, 0x1 */
/* .line 226 */
} // .end local v2 # "bmp":Landroid/graphics/Bitmap;
} // .end local v3 # "pixels":[I
} // .end local v11 # "bpos":I
} // .end local v13 # "h":I
} // .end local v14 # "i":I
} // .end local v17 # "p":I
} // .end local v18 # "pos":I
} // .end local v20 # "tmp":[I
} // .end local v21 # "w":I
} // .end local v22 # "x":I
} // .end local v23 # "y":I
/* :catch_1 */
/* move-exception v12 */
/* .line 228 */
/* .restart local v12 # "e":Ljava/lang/Exception; */
(( java.lang.Exception ) v12 ).printStackTrace ( ); // invoke-virtual {v12}, Ljava/lang/Exception;->printStackTrace()V
/* .line 187 */
/* :catch_2 */
/* move-exception v4 */
/* goto/16 :goto_0 */
} // .end method
protected void onPause ( ) {
/* .locals 2 */
/* .prologue */
/* .line 236 */
/* invoke-super {p0}, Lcom/nvidia/devtech/NvActivity;->onPause()V */
/* .line 237 */
v0 = this.handler;
v1 = this.painter;
(( android.os.Handler ) v0 ).removeCallbacks ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V
/* .line 238 */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/nvidia/devtech/NvGLESActivity;->paused:Z */
/* .line 239 */
return;
} // .end method
protected void onResume ( ) {
/* .locals 2 */
/* .prologue */
/* .line 244 */
/* invoke-super {p0}, Lcom/nvidia/devtech/NvActivity;->onResume()V */
/* .line 245 */
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lcom/nvidia/devtech/NvGLESActivity;->paused:Z */
/* .line 246 */
v0 = this.handler;
v1 = this.painter;
(( android.os.Handler ) v0 ).post ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
/* .line 247 */
return;
} // .end method
public abstract Boolean render ( Float p0, Integer p1, Integer p2, Boolean p3 ) {
} // .end method
public void setFixedSize ( Integer p0, Integer p1 ) {
/* .locals 0 */
/* .param p1, "fw" # I */
/* .param p2, "fh" # I */
/* .prologue */
/* .line 81 */
/* iput p1, p0, Lcom/nvidia/devtech/NvGLESActivity;->fixedWidth:I */
/* .line 82 */
/* iput p2, p0, Lcom/nvidia/devtech/NvGLESActivity;->fixedHeight:I */
/* .line 83 */
return;
} // .end method
protected void swap ( ) {
/* .locals 3 */
/* .prologue */
/* .line 578 */
v0 = this.eglSurface;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 579 */
v0 = this.egl;
v1 = this.eglDisplay;
v2 = this.eglSurface;
/* .line 580 */
} // :cond_0
return;
} // .end method
protected void systemCleanup ( ) {
/* .locals 2 */
/* .prologue */
/* .line 601 */
/* iget-boolean v0, p0, Lcom/nvidia/devtech/NvGLESActivity;->ranInit:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 602 */
(( com.nvidia.devtech.NvGLESActivity ) p0 ).cleanup ( ); // invoke-virtual {p0}, Lcom/nvidia/devtech/NvGLESActivity;->cleanup()V
/* .line 603 */
} // :cond_0
v0 = this.handler;
v1 = this.painter;
(( android.os.Handler ) v0 ).removeCallbacks ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V
/* .line 604 */
(( com.nvidia.devtech.NvGLESActivity ) p0 ).cleanupEGL ( ); // invoke-virtual {p0}, Lcom/nvidia/devtech/NvGLESActivity;->cleanupEGL()V
/* .line 605 */
return;
} // .end method
protected Boolean systemInit ( ) {
/* .locals 4 */
/* .prologue */
/* .line 252 */
/* move-object v0, p0 */
/* .line 254 */
/* .local v0, "act":Lcom/nvidia/devtech/NvActivity; */
/* new-instance v3, Lcom/nvidia/devtech/NvGLESActivity$1; */
/* invoke-direct {v3, p0, v0}, Lcom/nvidia/devtech/NvGLESActivity$1;-><init>(Lcom/nvidia/devtech/NvGLESActivity;Lcom/nvidia/devtech/NvActivity;)V */
this.initRunnable = v3;
/* .line 314 */
/* new-instance v2, Landroid/view/SurfaceView; */
/* invoke-direct {v2, p0}, Landroid/view/SurfaceView;-><init>(Landroid/content/Context;)V */
/* .line 315 */
/* .local v2, "view":Landroid/view/SurfaceView; */
(( android.view.SurfaceView ) v2 ).getHolder ( ); // invoke-virtual {v2}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;
/* .line 316 */
/* .local v1, "holder":Landroid/view/SurfaceHolder; */
int v3 = 2; // const/4 v3, 0x2
/* .line 318 */
/* new-instance v3, Lcom/nvidia/devtech/NvGLESActivity$2; */
/* invoke-direct {v3, p0, v0}, Lcom/nvidia/devtech/NvGLESActivity$2;-><init>(Lcom/nvidia/devtech/NvGLESActivity;Lcom/nvidia/devtech/NvActivity;)V */
/* .line 386 */
(( com.nvidia.devtech.NvGLESActivity ) p0 ).setContentView ( v2 ); // invoke-virtual {p0, v2}, Lcom/nvidia/devtech/NvGLESActivity;->setContentView(Landroid/view/View;)V
/* .line 387 */
int v3 = 1; // const/4 v3, 0x1
} // .end method
