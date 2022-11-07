public abstract class com.nvidia.devtech.NvEventQueueActivity extends android.app.Activity implements android.hardware.SensorEventListener {
	 /* .source "NvEventQueueActivity.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/nvidia/devtech/NvEventQueueActivity$RawData;, */
	 /* Lcom/nvidia/devtech/NvEventQueueActivity$RawTexture; */
	 /* } */
} // .end annotation
/* # static fields */
private static final Integer EGL_CONTEXT_CLIENT_VERSION;
private static final Integer EGL_OPENGL_ES2_BIT;
private static final Integer EGL_RENDERABLE_TYPE;
/* # instance fields */
protected Integer alphaSize;
protected Integer blueSize;
protected android.view.SurfaceHolder cachedSurfaceHolder;
protected configAttrs;
protected contextAttrs;
protected Integer depthSize;
protected android.view.Display display;
javax.microedition.khronos.egl.EGL10 egl;
protected javax.microedition.khronos.egl.EGLConfig eglConfig;
protected javax.microedition.khronos.egl.EGLContext eglContext;
protected javax.microedition.khronos.egl.EGLDisplay eglDisplay;
protected javax.microedition.khronos.egl.EGLSurface eglSurface;
private Integer fixedHeight;
private Integer fixedWidth;
javax.microedition.khronos.opengles.GL11 gl;
protected Integer greenSize;
protected android.os.Handler handler;
protected Integer mSensorDelay;
protected android.hardware.SensorManager mSensorManager;
protected Boolean paused;
private Boolean ranInit;
protected Integer redSize;
protected Integer stencilSize;
protected Boolean supportPauseResume;
private Integer surfaceHeight;
private Integer surfaceWidth;
protected Boolean wantsAccelerometer;
protected Boolean wantsMultitouch;
/* # direct methods */
public com.nvidia.devtech.NvEventQueueActivity ( ) {
	 /* .locals 4 */
	 /* .prologue */
	 int v3 = 5; // const/4 v3, 0x5
	 int v2 = 0; // const/4 v2, 0x0
	 int v1 = 0; // const/4 v1, 0x0
	 /* .line 68 */
	 /* invoke-direct {p0}, Landroid/app/Activity;-><init>()V */
	 /* .line 72 */
	 this.handler = v1;
	 /* .line 74 */
	 /* iput-boolean v2, p0, Lcom/nvidia/devtech/NvEventQueueActivity;->paused:Z */
	 /* .line 76 */
	 /* iput-boolean v2, p0, Lcom/nvidia/devtech/NvEventQueueActivity;->wantsMultitouch:Z */
	 /* .line 78 */
	 /* iput-boolean v2, p0, Lcom/nvidia/devtech/NvEventQueueActivity;->supportPauseResume:Z */
	 /* .line 81 */
	 /* iput-boolean v2, p0, Lcom/nvidia/devtech/NvEventQueueActivity;->wantsAccelerometer:Z */
	 /* .line 82 */
	 this.mSensorManager = v1;
	 /* .line 83 */
	 int v0 = 1; // const/4 v0, 0x1
	 /* iput v0, p0, Lcom/nvidia/devtech/NvEventQueueActivity;->mSensorDelay:I */
	 /* .line 84 */
	 this.display = v1;
	 /* .line 89 */
	 this.egl = v1;
	 /* .line 90 */
	 this.gl = v1;
	 /* .line 92 */
	 /* iput-boolean v2, p0, Lcom/nvidia/devtech/NvEventQueueActivity;->ranInit:Z */
	 /* .line 93 */
	 this.eglSurface = v1;
	 /* .line 94 */
	 this.eglDisplay = v1;
	 /* .line 95 */
	 this.eglContext = v1;
	 /* .line 96 */
	 this.eglConfig = v1;
	 /* .line 98 */
	 this.cachedSurfaceHolder = v1;
	 /* .line 99 */
	 /* iput v2, p0, Lcom/nvidia/devtech/NvEventQueueActivity;->surfaceWidth:I */
	 /* .line 100 */
	 /* iput v2, p0, Lcom/nvidia/devtech/NvEventQueueActivity;->surfaceHeight:I */
	 /* .line 102 */
	 /* iput v2, p0, Lcom/nvidia/devtech/NvEventQueueActivity;->fixedWidth:I */
	 /* .line 103 */
	 /* iput v2, p0, Lcom/nvidia/devtech/NvEventQueueActivity;->fixedHeight:I */
	 /* .line 635 */
	 /* iput v3, p0, Lcom/nvidia/devtech/NvEventQueueActivity;->redSize:I */
	 /* .line 637 */
	 int v0 = 6; // const/4 v0, 0x6
	 /* iput v0, p0, Lcom/nvidia/devtech/NvEventQueueActivity;->greenSize:I */
	 /* .line 639 */
	 /* iput v3, p0, Lcom/nvidia/devtech/NvEventQueueActivity;->blueSize:I */
	 /* .line 641 */
	 /* iput v2, p0, Lcom/nvidia/devtech/NvEventQueueActivity;->alphaSize:I */
	 /* .line 643 */
	 /* iput v2, p0, Lcom/nvidia/devtech/NvEventQueueActivity;->stencilSize:I */
	 /* .line 645 */
	 /* const/16 v0, 0x10 */
	 /* iput v0, p0, Lcom/nvidia/devtech/NvEventQueueActivity;->depthSize:I */
	 /* .line 648 */
	 this.configAttrs = v1;
	 /* .line 650 */
	 this.contextAttrs = v1;
	 /* .line 68 */
	 return;
} // .end method
static Integer access$0 ( com.nvidia.devtech.NvEventQueueActivity p0 ) { //synthethic
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 102 */
	 /* iget v0, p0, Lcom/nvidia/devtech/NvEventQueueActivity;->fixedWidth:I */
} // .end method
static Integer access$1 ( com.nvidia.devtech.NvEventQueueActivity p0 ) { //synthethic
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 103 */
	 /* iget v0, p0, Lcom/nvidia/devtech/NvEventQueueActivity;->fixedHeight:I */
} // .end method
static void access$2 ( com.nvidia.devtech.NvEventQueueActivity p0, Boolean p1 ) { //synthethic
	 /* .locals 0 */
	 /* .prologue */
	 /* .line 92 */
	 /* iput-boolean p1, p0, Lcom/nvidia/devtech/NvEventQueueActivity;->ranInit:Z */
	 return;
} // .end method
static Integer access$3 ( com.nvidia.devtech.NvEventQueueActivity p0 ) { //synthethic
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 99 */
	 /* iget v0, p0, Lcom/nvidia/devtech/NvEventQueueActivity;->surfaceWidth:I */
} // .end method
static Integer access$4 ( com.nvidia.devtech.NvEventQueueActivity p0 ) { //synthethic
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 100 */
	 /* iget v0, p0, Lcom/nvidia/devtech/NvEventQueueActivity;->surfaceHeight:I */
} // .end method
static void access$5 ( com.nvidia.devtech.NvEventQueueActivity p0, Integer p1 ) { //synthethic
	 /* .locals 0 */
	 /* .prologue */
	 /* .line 99 */
	 /* iput p1, p0, Lcom/nvidia/devtech/NvEventQueueActivity;->surfaceWidth:I */
	 return;
} // .end method
static void access$6 ( com.nvidia.devtech.NvEventQueueActivity p0, Integer p1 ) { //synthethic
	 /* .locals 0 */
	 /* .prologue */
	 /* .line 100 */
	 /* iput p1, p0, Lcom/nvidia/devtech/NvEventQueueActivity;->surfaceHeight:I */
	 return;
} // .end method
/* # virtual methods */
public Boolean InitEGLAndGLES2 ( ) {
	 /* .locals 4 */
	 /* .prologue */
	 int v1 = 0; // const/4 v1, 0x0
	 /* .line 513 */
	 v2 = this.cachedSurfaceHolder;
	 /* if-nez v2, :cond_0 */
	 /* .line 515 */
	 v2 = java.lang.System.out;
	 final String v3 = "InitEGLAndGLES2 failed, cachedSurfaceHolder is null"; // const-string v3, "InitEGLAndGLES2 failed, cachedSurfaceHolder is null"
	 (( java.io.PrintStream ) v2 ).println ( v3 ); // invoke-virtual {v2, v3}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
	 /* .line 535 */
} // :goto_0
/* .line 519 */
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
/* .line 520 */
/* .local v0, "eglInitialized":Z */
v2 = this.eglContext;
/* if-nez v2, :cond_1 */
/* .line 522 */
v0 = (( com.nvidia.devtech.NvEventQueueActivity ) p0 ).initEGL ( ); // invoke-virtual {p0}, Lcom/nvidia/devtech/NvEventQueueActivity;->initEGL()Z
/* .line 524 */
} // :cond_1
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 526 */
v1 = java.lang.System.out;
final String v2 = "Calling create surface"; // const-string v2, "Calling create surface"
(( java.io.PrintStream ) v1 ).println ( v2 ); // invoke-virtual {v1, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
/* .line 527 */
v1 = this.cachedSurfaceHolder;
(( com.nvidia.devtech.NvEventQueueActivity ) p0 ).createEGLSurface ( v1 ); // invoke-virtual {p0, v1}, Lcom/nvidia/devtech/NvEventQueueActivity;->createEGLSurface(Landroid/view/SurfaceHolder;)Z
/* .line 535 */
int v1 = 1; // const/4 v1, 0x1
/* .line 531 */
} // :cond_2
v2 = java.lang.System.out;
final String v3 = "initEGLAndGLES2 failed, core EGL init failure"; // const-string v3, "initEGLAndGLES2 failed, core EGL init failure"
(( java.io.PrintStream ) v2 ).println ( v3 ); // invoke-virtual {v2, v3}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
} // .end method
public native Boolean accelerometerEvent ( Float p0, Float p1, Float p2 ) {
} // .end method
public native void cleanup ( ) {
} // .end method
protected void cleanupEGL ( ) {
/* .locals 7 */
/* .prologue */
int v6 = 0; // const/4 v6, 0x0
int v5 = 0; // const/4 v5, 0x0
/* .line 813 */
v0 = java.lang.System.out;
final String v1 = "cleanupEGL"; // const-string v1, "cleanupEGL"
(( java.io.PrintStream ) v0 ).println ( v1 ); // invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
/* .line 814 */
(( com.nvidia.devtech.NvEventQueueActivity ) p0 ).destroyEGLSurface ( ); // invoke-virtual {p0}, Lcom/nvidia/devtech/NvEventQueueActivity;->destroyEGLSurface()V
/* .line 815 */
v0 = this.eglDisplay;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 816 */
v0 = this.egl;
v1 = this.eglDisplay;
v2 = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE;
v3 = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE;
v4 = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT;
/* .line 817 */
} // :cond_0
v0 = this.eglContext;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 818 */
v0 = this.egl;
v1 = this.eglDisplay;
v2 = this.eglContext;
/* .line 819 */
} // :cond_1
v0 = this.eglDisplay;
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 820 */
v0 = this.egl;
v1 = this.eglDisplay;
/* .line 822 */
} // :cond_2
this.eglDisplay = v5;
/* .line 823 */
this.eglContext = v5;
/* .line 824 */
this.eglSurface = v5;
/* .line 826 */
/* iput-boolean v6, p0, Lcom/nvidia/devtech/NvEventQueueActivity;->ranInit:Z */
/* .line 827 */
this.eglConfig = v5;
/* .line 829 */
this.cachedSurfaceHolder = v5;
/* .line 830 */
/* iput v6, p0, Lcom/nvidia/devtech/NvEventQueueActivity;->surfaceWidth:I */
/* .line 831 */
/* iput v6, p0, Lcom/nvidia/devtech/NvEventQueueActivity;->surfaceHeight:I */
/* .line 832 */
return;
} // .end method
protected Boolean createEGLSurface ( android.view.SurfaceHolder p0 ) {
/* .locals 7 */
/* .param p1, "surface" # Landroid/view/SurfaceHolder; */
/* .prologue */
int v6 = 1; // const/4 v6, 0x1
int v5 = 0; // const/4 v5, 0x0
/* .line 782 */
v1 = this.egl;
v2 = this.eglDisplay;
v3 = this.eglConfig;
int v4 = 0; // const/4 v4, 0x0
this.eglSurface = v1;
/* .line 783 */
v1 = java.lang.System.out;
/* new-instance v2, Ljava/lang/StringBuilder; */
final String v3 = "eglSurface: "; // const-string v3, "eglSurface: "
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v3 = this.eglSurface;
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v3 = ", err: "; // const-string v3, ", err: "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v3 = v3 = this.egl;
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( java.io.PrintStream ) v1 ).println ( v2 ); // invoke-virtual {v1, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
/* .line 784 */
/* new-array v0, v6, [I */
/* .line 786 */
/* .local v0, "sizes":[I */
v1 = this.egl;
v2 = this.eglDisplay;
v3 = this.eglSurface;
/* const/16 v4, 0x3057 */
/* .line 787 */
/* aget v1, v0, v5 */
/* iput v1, p0, Lcom/nvidia/devtech/NvEventQueueActivity;->surfaceWidth:I */
/* .line 788 */
v1 = this.egl;
v2 = this.eglDisplay;
v3 = this.eglSurface;
/* const/16 v4, 0x3056 */
/* .line 789 */
/* aget v1, v0, v5 */
/* iput v1, p0, Lcom/nvidia/devtech/NvEventQueueActivity;->surfaceHeight:I */
/* .line 791 */
} // .end method
protected void destroyEGLSurface ( ) {
/* .locals 5 */
/* .prologue */
/* .line 800 */
v0 = this.eglDisplay;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.eglSurface;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 801 */
v0 = this.egl;
v1 = this.eglDisplay;
v2 = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE;
v3 = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE;
v4 = this.eglContext;
/* .line 802 */
} // :cond_0
v0 = this.eglSurface;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 803 */
v0 = this.egl;
v1 = this.eglDisplay;
v2 = this.eglSurface;
/* .line 804 */
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
this.eglSurface = v0;
/* .line 805 */
return;
} // .end method
public Integer getOrientation ( ) {
/* .locals 1 */
/* .prologue */
/* .line 907 */
v0 = this.display;
v0 = (( android.view.Display ) v0 ).getOrientation ( ); // invoke-virtual {v0}, Landroid/view/Display;->getOrientation()I
} // .end method
public Boolean getSupportPauseResume ( ) {
/* .locals 1 */
/* .prologue */
/* .line 863 */
/* iget-boolean v0, p0, Lcom/nvidia/devtech/NvEventQueueActivity;->supportPauseResume:Z */
} // .end method
public Integer getSurfaceHeight ( ) {
/* .locals 1 */
/* .prologue */
/* .line 873 */
/* iget v0, p0, Lcom/nvidia/devtech/NvEventQueueActivity;->surfaceHeight:I */
} // .end method
public Integer getSurfaceWidth ( ) {
/* .locals 1 */
/* .prologue */
/* .line 868 */
/* iget v0, p0, Lcom/nvidia/devtech/NvEventQueueActivity;->surfaceWidth:I */
} // .end method
public native Boolean init ( ) {
} // .end method
protected Boolean initEGL ( ) {
/* .locals 26 */
/* .prologue */
/* .line 660 */
/* move-object/from16 v0, p0 */
v1 = this.configAttrs;
/* if-nez v1, :cond_0 */
/* .line 661 */
int v1 = 1; // const/4 v1, 0x1
/* new-array v1, v1, [I */
int v2 = 0; // const/4 v2, 0x0
/* const/16 v3, 0x3038 */
/* aput v3, v1, v2 */
/* move-object/from16 v0, p0 */
this.configAttrs = v1;
/* .line 662 */
} // :cond_0
/* move-object/from16 v0, p0 */
v0 = this.configAttrs;
/* move-object/from16 v17, v0 */
/* .line 664 */
/* .local v17, "oldConf":[I */
/* move-object/from16 v0, v17 */
/* array-length v1, v0 */
/* add-int/lit8 v1, v1, 0x3 */
/* add-int/lit8 v1, v1, -0x1 */
/* new-array v1, v1, [I */
/* move-object/from16 v0, p0 */
this.configAttrs = v1;
/* .line 665 */
int v14 = 0; // const/4 v14, 0x0
/* .line 666 */
/* .local v14, "i":I */
int v14 = 0; // const/4 v14, 0x0
} // :goto_0
/* move-object/from16 v0, v17 */
/* array-length v1, v0 */
/* add-int/lit8 v1, v1, -0x1 */
/* if-lt v14, v1, :cond_2 */
/* .line 668 */
/* move-object/from16 v0, p0 */
v1 = this.configAttrs;
/* add-int/lit8 v15, v14, 0x1 */
} // .end local v14 # "i":I
/* .local v15, "i":I */
/* const/16 v2, 0x3040 */
/* aput v2, v1, v14 */
/* .line 669 */
/* move-object/from16 v0, p0 */
v1 = this.configAttrs;
/* add-int/lit8 v14, v15, 0x1 */
} // .end local v15 # "i":I
/* .restart local v14 # "i":I */
int v2 = 4; // const/4 v2, 0x4
/* aput v2, v1, v15 */
/* .line 670 */
/* move-object/from16 v0, p0 */
v1 = this.configAttrs;
/* add-int/lit8 v15, v14, 0x1 */
} // .end local v14 # "i":I
/* .restart local v15 # "i":I */
/* const/16 v2, 0x3038 */
/* aput v2, v1, v14 */
/* .line 673 */
int v1 = 3; // const/4 v1, 0x3
/* new-array v1, v1, [I */
/* fill-array-data v1, :array_0 */
/* .line 672 */
/* move-object/from16 v0, p0 */
this.contextAttrs = v1;
/* .line 678 */
/* move-object/from16 v0, p0 */
v1 = this.configAttrs;
/* if-nez v1, :cond_1 */
/* .line 679 */
int v1 = 1; // const/4 v1, 0x1
/* new-array v1, v1, [I */
int v2 = 0; // const/4 v2, 0x0
/* const/16 v3, 0x3038 */
/* aput v3, v1, v2 */
/* move-object/from16 v0, p0 */
this.configAttrs = v1;
/* .line 680 */
} // :cond_1
/* move-object/from16 v0, p0 */
v0 = this.configAttrs;
/* move-object/from16 v18, v0 */
/* .line 682 */
/* .local v18, "oldConfES2":[I */
/* move-object/from16 v0, v18 */
/* array-length v1, v0 */
/* add-int/lit8 v1, v1, 0xd */
/* add-int/lit8 v1, v1, -0x1 */
/* new-array v1, v1, [I */
/* move-object/from16 v0, p0 */
this.configAttrs = v1;
/* .line 683 */
int v14 = 0; // const/4 v14, 0x0
} // .end local v15 # "i":I
/* .restart local v14 # "i":I */
} // :goto_1
/* move-object/from16 v0, v18 */
/* array-length v1, v0 */
/* add-int/lit8 v1, v1, -0x1 */
/* if-lt v14, v1, :cond_3 */
/* .line 685 */
/* move-object/from16 v0, p0 */
v1 = this.configAttrs;
/* add-int/lit8 v15, v14, 0x1 */
} // .end local v14 # "i":I
/* .restart local v15 # "i":I */
/* const/16 v2, 0x3024 */
/* aput v2, v1, v14 */
/* .line 686 */
/* move-object/from16 v0, p0 */
v1 = this.configAttrs;
/* add-int/lit8 v14, v15, 0x1 */
} // .end local v15 # "i":I
/* .restart local v14 # "i":I */
/* move-object/from16 v0, p0 */
/* iget v2, v0, Lcom/nvidia/devtech/NvEventQueueActivity;->redSize:I */
/* aput v2, v1, v15 */
/* .line 687 */
/* move-object/from16 v0, p0 */
v1 = this.configAttrs;
/* add-int/lit8 v15, v14, 0x1 */
} // .end local v14 # "i":I
/* .restart local v15 # "i":I */
/* const/16 v2, 0x3023 */
/* aput v2, v1, v14 */
/* .line 688 */
/* move-object/from16 v0, p0 */
v1 = this.configAttrs;
/* add-int/lit8 v14, v15, 0x1 */
} // .end local v15 # "i":I
/* .restart local v14 # "i":I */
/* move-object/from16 v0, p0 */
/* iget v2, v0, Lcom/nvidia/devtech/NvEventQueueActivity;->greenSize:I */
/* aput v2, v1, v15 */
/* .line 689 */
/* move-object/from16 v0, p0 */
v1 = this.configAttrs;
/* add-int/lit8 v15, v14, 0x1 */
} // .end local v14 # "i":I
/* .restart local v15 # "i":I */
/* const/16 v2, 0x3022 */
/* aput v2, v1, v14 */
/* .line 690 */
/* move-object/from16 v0, p0 */
v1 = this.configAttrs;
/* add-int/lit8 v14, v15, 0x1 */
} // .end local v15 # "i":I
/* .restart local v14 # "i":I */
/* move-object/from16 v0, p0 */
/* iget v2, v0, Lcom/nvidia/devtech/NvEventQueueActivity;->blueSize:I */
/* aput v2, v1, v15 */
/* .line 691 */
/* move-object/from16 v0, p0 */
v1 = this.configAttrs;
/* add-int/lit8 v15, v14, 0x1 */
} // .end local v14 # "i":I
/* .restart local v15 # "i":I */
/* const/16 v2, 0x3021 */
/* aput v2, v1, v14 */
/* .line 692 */
/* move-object/from16 v0, p0 */
v1 = this.configAttrs;
/* add-int/lit8 v14, v15, 0x1 */
} // .end local v15 # "i":I
/* .restart local v14 # "i":I */
/* move-object/from16 v0, p0 */
/* iget v2, v0, Lcom/nvidia/devtech/NvEventQueueActivity;->alphaSize:I */
/* aput v2, v1, v15 */
/* .line 693 */
/* move-object/from16 v0, p0 */
v1 = this.configAttrs;
/* add-int/lit8 v15, v14, 0x1 */
} // .end local v14 # "i":I
/* .restart local v15 # "i":I */
/* const/16 v2, 0x3026 */
/* aput v2, v1, v14 */
/* .line 694 */
/* move-object/from16 v0, p0 */
v1 = this.configAttrs;
/* add-int/lit8 v14, v15, 0x1 */
} // .end local v15 # "i":I
/* .restart local v14 # "i":I */
/* move-object/from16 v0, p0 */
/* iget v2, v0, Lcom/nvidia/devtech/NvEventQueueActivity;->stencilSize:I */
/* aput v2, v1, v15 */
/* .line 695 */
/* move-object/from16 v0, p0 */
v1 = this.configAttrs;
/* add-int/lit8 v15, v14, 0x1 */
} // .end local v14 # "i":I
/* .restart local v15 # "i":I */
/* const/16 v2, 0x3025 */
/* aput v2, v1, v14 */
/* .line 696 */
/* move-object/from16 v0, p0 */
v1 = this.configAttrs;
/* add-int/lit8 v14, v15, 0x1 */
} // .end local v15 # "i":I
/* .restart local v14 # "i":I */
/* move-object/from16 v0, p0 */
/* iget v2, v0, Lcom/nvidia/devtech/NvEventQueueActivity;->depthSize:I */
/* aput v2, v1, v15 */
/* .line 697 */
/* move-object/from16 v0, p0 */
v1 = this.configAttrs;
/* add-int/lit8 v15, v14, 0x1 */
} // .end local v14 # "i":I
/* .restart local v15 # "i":I */
/* const/16 v2, 0x3038 */
/* aput v2, v1, v14 */
/* .line 699 */
javax.microedition.khronos.egl.EGLContext .getEGL ( );
/* check-cast v1, Ljavax/microedition/khronos/egl/EGL10; */
/* move-object/from16 v0, p0 */
this.egl = v1;
/* .line 700 */
/* move-object/from16 v0, p0 */
v1 = this.egl;
/* .line 701 */
/* move-object/from16 v0, p0 */
v1 = this.egl;
v2 = javax.microedition.khronos.egl.EGL10.EGL_DEFAULT_DISPLAY;
/* move-object/from16 v0, p0 */
this.eglDisplay = v1;
/* .line 702 */
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
/* .line 703 */
int v1 = 2; // const/4 v1, 0x2
/* new-array v0, v1, [I */
/* move-object/from16 v24, v0 */
/* .line 704 */
/* .local v24, "version":[I */
/* move-object/from16 v0, p0 */
v1 = this.egl;
/* move-object/from16 v0, p0 */
v2 = this.eglDisplay;
v20 = /* move-object/from16 v0, v24 */
/* .line 705 */
/* .local v20, "ret":Z */
v1 = java.lang.System.out;
/* new-instance v2, Ljava/lang/StringBuilder; */
final String v3 = "EglInitialize returned: "; // const-string v3, "EglInitialize returned: "
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* move/from16 v0, v20 */
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( java.io.PrintStream ) v1 ).println ( v2 ); // invoke-virtual {v1, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
/* .line 706 */
/* if-nez v20, :cond_4 */
/* .line 708 */
int v1 = 0; // const/4 v1, 0x0
/* move v14, v15 */
/* .line 770 */
} // .end local v15 # "i":I
/* .restart local v14 # "i":I */
} // :goto_2
/* .line 667 */
} // .end local v18 # "oldConfES2":[I
} // .end local v20 # "ret":Z
} // .end local v24 # "version":[I
} // :cond_2
/* move-object/from16 v0, p0 */
v1 = this.configAttrs;
/* aget v2, v17, v14 */
/* aput v2, v1, v14 */
/* .line 666 */
/* add-int/lit8 v14, v14, 0x1 */
/* goto/16 :goto_0 */
/* .line 684 */
/* .restart local v18 # "oldConfES2":[I */
} // :cond_3
/* move-object/from16 v0, p0 */
v1 = this.configAttrs;
/* aget v2, v18, v14 */
/* aput v2, v1, v14 */
/* .line 683 */
/* add-int/lit8 v14, v14, 0x1 */
/* goto/16 :goto_1 */
/* .line 710 */
} // .end local v14 # "i":I
/* .restart local v15 # "i":I */
/* .restart local v20 # "ret":Z */
/* .restart local v24 # "version":[I */
} // :cond_4
/* move-object/from16 v0, p0 */
v12 = v1 = this.egl;
/* .line 711 */
/* .local v12, "eglErr":I */
/* const/16 v1, 0x3000 */
/* if-eq v12, v1, :cond_5 */
/* .line 712 */
int v1 = 0; // const/4 v1, 0x0
/* move v14, v15 */
} // .end local v15 # "i":I
/* .restart local v14 # "i":I */
/* .line 713 */
} // .end local v14 # "i":I
/* .restart local v15 # "i":I */
} // :cond_5
v1 = java.lang.System.out;
/* new-instance v2, Ljava/lang/StringBuilder; */
final String v3 = "eglInitialize err: "; // const-string v3, "eglInitialize err: "
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v2 ).append ( v12 ); // invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( java.io.PrintStream ) v1 ).println ( v2 ); // invoke-virtual {v1, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
/* .line 715 */
/* const/16 v1, 0x14 */
/* new-array v4, v1, [Ljavax/microedition/khronos/egl/EGLConfig; */
/* .line 716 */
/* .local v4, "config":[Ljavax/microedition/khronos/egl/EGLConfig; */
int v1 = 1; // const/4 v1, 0x1
/* new-array v6, v1, [I */
/* .line 717 */
/* .local v6, "num_configs":[I */
/* move-object/from16 v0, p0 */
v1 = this.egl;
/* move-object/from16 v0, p0 */
v2 = this.eglDisplay;
/* move-object/from16 v0, p0 */
v3 = this.configAttrs;
/* array-length v5, v4 */
/* invoke-interface/range {v1 ..v6}, Ljavax/microedition/khronos/egl/EGL10;->eglChooseConfig(Ljavax/microedition/khronos/egl/EGLDisplay;[I[Ljavax/microedition/khronos/egl/EGLConfig;I[I)Z */
/* .line 718 */
v1 = java.lang.System.out;
/* new-instance v2, Ljava/lang/StringBuilder; */
final String v3 = "eglChooseConfig err: "; // const-string v3, "eglChooseConfig err: "
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* move-object/from16 v0, p0 */
v3 = v3 = this.egl;
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( java.io.PrintStream ) v1 ).println ( v2 ); // invoke-virtual {v1, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
/* .line 720 */
/* const/high16 v22, 0x1000000 */
/* .line 721 */
/* .local v22, "score":I */
int v1 = 1; // const/4 v1, 0x1
/* new-array v0, v1, [I */
/* move-object/from16 v23, v0 */
/* .line 722 */
/* .local v23, "val":[I */
int v14 = 0; // const/4 v14, 0x0
} // .end local v15 # "i":I
/* .restart local v14 # "i":I */
} // :goto_3
int v1 = 0; // const/4 v1, 0x0
/* aget v1, v6, v1 */
/* if-lt v14, v1, :cond_6 */
/* .line 766 */
/* move-object/from16 v0, p0 */
v1 = this.egl;
/* move-object/from16 v0, p0 */
v2 = this.eglDisplay;
/* move-object/from16 v0, p0 */
v3 = this.eglConfig;
v5 = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT;
/* move-object/from16 v0, p0 */
v0 = this.contextAttrs;
/* move-object/from16 v25, v0 */
/* move-object/from16 v0, v25 */
/* move-object/from16 v0, p0 */
this.eglContext = v1;
/* .line 767 */
v1 = java.lang.System.out;
/* new-instance v2, Ljava/lang/StringBuilder; */
final String v3 = "eglCreateContext: "; // const-string v3, "eglCreateContext: "
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* move-object/from16 v0, p0 */
v3 = v3 = this.egl;
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( java.io.PrintStream ) v1 ).println ( v2 ); // invoke-virtual {v1, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
/* .line 769 */
/* move-object/from16 v0, p0 */
v1 = this.eglContext;
(( javax.microedition.khronos.egl.EGLContext ) v1 ).getGL ( ); // invoke-virtual {v1}, Ljavax/microedition/khronos/egl/EGLContext;->getGL()Ljavax/microedition/khronos/opengles/GL;
/* check-cast v1, Ljavax/microedition/khronos/opengles/GL11; */
/* move-object/from16 v0, p0 */
this.gl = v1;
/* .line 770 */
int v1 = 1; // const/4 v1, 0x1
/* goto/16 :goto_2 */
/* .line 724 */
} // :cond_6
int v9 = 1; // const/4 v9, 0x1
/* .line 725 */
/* .local v9, "cont":Z */
int v10 = 0; // const/4 v10, 0x0
/* .line 727 */
/* .local v10, "currScore":I */
/* const/16 v16, 0x0 */
/* .local v16, "j":I */
} // :goto_4
/* move-object/from16 v0, v17 */
/* array-length v1, v0 */
/* add-int/lit8 v1, v1, -0x1 */
/* shr-int/lit8 v1, v1, 0x1 */
/* move/from16 v0, v16 */
/* if-lt v0, v1, :cond_8 */
/* .line 736 */
} // :goto_5
/* if-nez v9, :cond_a */
/* .line 722 */
} // :cond_7
} // :goto_6
/* add-int/lit8 v14, v14, 0x1 */
/* .line 729 */
} // :cond_8
/* move-object/from16 v0, p0 */
v1 = this.egl;
/* move-object/from16 v0, p0 */
v2 = this.eglDisplay;
/* aget-object v3, v4, v14 */
/* move-object/from16 v0, p0 */
v5 = this.configAttrs;
/* mul-int/lit8 v25, v16, 0x2 */
/* aget v5, v5, v25 */
/* move-object/from16 v0, v23 */
/* .line 730 */
int v1 = 0; // const/4 v1, 0x0
/* aget v1, v23, v1 */
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
/* if-eq v1, v2, :cond_9 */
/* .line 732 */
int v9 = 0; // const/4 v9, 0x0
/* .line 733 */
/* .line 727 */
} // :cond_9
/* add-int/lit8 v16, v16, 0x1 */
/* .line 738 */
} // :cond_a
/* move-object/from16 v0, p0 */
v1 = this.egl;
/* move-object/from16 v0, p0 */
v2 = this.eglDisplay;
/* aget-object v3, v4, v14 */
/* const/16 v5, 0x3024 */
/* move-object/from16 v0, v23 */
int v1 = 0; // const/4 v1, 0x0
/* aget v19, v23, v1 */
/* .line 739 */
/* .local v19, "r":I */
/* move-object/from16 v0, p0 */
v1 = this.egl;
/* move-object/from16 v0, p0 */
v2 = this.eglDisplay;
/* aget-object v3, v4, v14 */
/* const/16 v5, 0x3023 */
/* move-object/from16 v0, v23 */
int v1 = 0; // const/4 v1, 0x0
/* aget v13, v23, v1 */
/* .line 740 */
/* .local v13, "g":I */
/* move-object/from16 v0, p0 */
v1 = this.egl;
/* move-object/from16 v0, p0 */
v2 = this.eglDisplay;
/* aget-object v3, v4, v14 */
/* const/16 v5, 0x3022 */
/* move-object/from16 v0, v23 */
int v1 = 0; // const/4 v1, 0x0
/* aget v8, v23, v1 */
/* .line 741 */
/* .local v8, "b":I */
/* move-object/from16 v0, p0 */
v1 = this.egl;
/* move-object/from16 v0, p0 */
v2 = this.eglDisplay;
/* aget-object v3, v4, v14 */
/* const/16 v5, 0x3021 */
/* move-object/from16 v0, v23 */
int v1 = 0; // const/4 v1, 0x0
/* aget v7, v23, v1 */
/* .line 742 */
/* .local v7, "a":I */
/* move-object/from16 v0, p0 */
v1 = this.egl;
/* move-object/from16 v0, p0 */
v2 = this.eglDisplay;
/* aget-object v3, v4, v14 */
/* const/16 v5, 0x3025 */
/* move-object/from16 v0, v23 */
int v1 = 0; // const/4 v1, 0x0
/* aget v11, v23, v1 */
/* .line 743 */
/* .local v11, "d":I */
/* move-object/from16 v0, p0 */
v1 = this.egl;
/* move-object/from16 v0, p0 */
v2 = this.eglDisplay;
/* aget-object v3, v4, v14 */
/* const/16 v5, 0x3026 */
/* move-object/from16 v0, v23 */
int v1 = 0; // const/4 v1, 0x0
/* aget v21, v23, v1 */
/* .line 745 */
/* .local v21, "s":I */
v1 = java.lang.System.out;
/* new-instance v2, Ljava/lang/StringBuilder; */
final String v3 = ">>> EGL Config ["; // const-string v3, ">>> EGL Config ["
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v2 ).append ( v14 ); // invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v3 = "] R"; // const-string v3, "] R"
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* move/from16 v0, v19 */
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
/* move/from16 v0, v21 */
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( java.io.PrintStream ) v1 ).println ( v2 ); // invoke-virtual {v1, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
/* .line 747 */
/* move-object/from16 v0, p0 */
/* iget v1, v0, Lcom/nvidia/devtech/NvEventQueueActivity;->redSize:I */
/* sub-int v1, v19, v1 */
v1 = java.lang.Math .abs ( v1 );
/* move-object/from16 v0, p0 */
/* iget v2, v0, Lcom/nvidia/devtech/NvEventQueueActivity;->greenSize:I */
/* sub-int v2, v13, v2 */
v2 = java.lang.Math .abs ( v2 );
/* add-int/2addr v1, v2 */
/* move-object/from16 v0, p0 */
/* iget v2, v0, Lcom/nvidia/devtech/NvEventQueueActivity;->blueSize:I */
/* sub-int v2, v8, v2 */
v2 = java.lang.Math .abs ( v2 );
/* add-int/2addr v1, v2 */
/* move-object/from16 v0, p0 */
/* iget v2, v0, Lcom/nvidia/devtech/NvEventQueueActivity;->alphaSize:I */
/* sub-int v2, v7, v2 */
v2 = java.lang.Math .abs ( v2 );
/* add-int/2addr v1, v2 */
/* shl-int/lit8 v10, v1, 0x10 */
/* .line 748 */
/* move-object/from16 v0, p0 */
/* iget v1, v0, Lcom/nvidia/devtech/NvEventQueueActivity;->depthSize:I */
/* sub-int v1, v11, v1 */
v1 = java.lang.Math .abs ( v1 );
/* shl-int/lit8 v1, v1, 0x8 */
/* add-int/2addr v10, v1 */
/* .line 749 */
/* move-object/from16 v0, p0 */
/* iget v1, v0, Lcom/nvidia/devtech/NvEventQueueActivity;->stencilSize:I */
/* sub-int v1, v21, v1 */
v1 = java.lang.Math .abs ( v1 );
/* add-int/2addr v10, v1 */
/* .line 751 */
/* move/from16 v0, v22 */
/* if-ge v10, v0, :cond_7 */
/* .line 753 */
v1 = java.lang.System.out;
final String v2 = "--------------------------"; // const-string v2, "--------------------------"
(( java.io.PrintStream ) v1 ).println ( v2 ); // invoke-virtual {v1, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
/* .line 754 */
v1 = java.lang.System.out;
/* new-instance v2, Ljava/lang/StringBuilder; */
final String v3 = "New config chosen: "; // const-string v3, "New config chosen: "
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v2 ).append ( v14 ); // invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( java.io.PrintStream ) v1 ).println ( v2 ); // invoke-virtual {v1, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
/* .line 755 */
/* const/16 v16, 0x0 */
} // :goto_7
/* move-object/from16 v0, p0 */
v1 = this.configAttrs;
/* array-length v1, v1 */
/* add-int/lit8 v1, v1, -0x1 */
/* shr-int/lit8 v1, v1, 0x1 */
/* move/from16 v0, v16 */
/* if-lt v0, v1, :cond_b */
/* .line 762 */
/* move/from16 v22, v10 */
/* .line 763 */
/* aget-object v1, v4, v14 */
/* move-object/from16 v0, p0 */
this.eglConfig = v1;
/* goto/16 :goto_6 */
/* .line 757 */
} // :cond_b
/* move-object/from16 v0, p0 */
v1 = this.egl;
/* move-object/from16 v0, p0 */
v2 = this.eglDisplay;
/* aget-object v3, v4, v14 */
/* move-object/from16 v0, p0 */
v5 = this.configAttrs;
/* mul-int/lit8 v25, v16, 0x2 */
/* aget v5, v5, v25 */
/* move-object/from16 v0, v23 */
/* .line 758 */
int v1 = 0; // const/4 v1, 0x0
/* aget v1, v23, v1 */
/* move-object/from16 v0, p0 */
v2 = this.configAttrs;
/* mul-int/lit8 v3, v16, 0x2 */
/* add-int/lit8 v3, v3, 0x1 */
/* aget v2, v2, v3 */
/* if-lt v1, v2, :cond_c */
/* .line 759 */
v1 = java.lang.System.out;
/* new-instance v2, Ljava/lang/StringBuilder; */
final String v3 = "setting "; // const-string v3, "setting "
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* move/from16 v0, v16 */
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v3 = ", matches: "; // const-string v3, ", matches: "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
int v3 = 0; // const/4 v3, 0x0
/* aget v3, v23, v3 */
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( java.io.PrintStream ) v1 ).println ( v2 ); // invoke-virtual {v1, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
/* .line 755 */
} // :cond_c
/* add-int/lit8 v16, v16, 0x1 */
/* .line 673 */
/* :array_0 */
/* .array-data 4 */
/* 0x3098 */
/* 0x2 */
/* 0x3038 */
} // .end array-data
} // .end method
public native Boolean keyEvent ( Integer p0, Integer p1, Integer p2, android.view.KeyEvent p3 ) {
} // .end method
public com.nvidia.devtech.NvEventQueueActivity$RawData loadFile ( java.lang.String p0 ) {
/* .locals 7 */
/* .param p1, "filename" # Ljava/lang/String; */
/* .prologue */
/* .line 150 */
int v1 = 0; // const/4 v1, 0x0
/* .line 151 */
/* .local v1, "is":Ljava/io/InputStream; */
/* new-instance v3, Lcom/nvidia/devtech/NvEventQueueActivity$RawData; */
/* invoke-direct {v3, p0}, Lcom/nvidia/devtech/NvEventQueueActivity$RawData;-><init>(Lcom/nvidia/devtech/NvEventQueueActivity;)V */
/* .line 155 */
/* .local v3, "ret":Lcom/nvidia/devtech/NvEventQueueActivity$RawData; */
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
/* .line 167 */
} // .end local v2 # "is":Ljava/io/InputStream;
/* .restart local v1 # "is":Ljava/io/InputStream; */
} // :goto_0
try { // :try_start_1
v4 = (( java.io.InputStream ) v1 ).available ( ); // invoke-virtual {v1}, Ljava/io/InputStream;->available()I
/* .line 168 */
/* .local v4, "size":I */
/* iput v4, v3, Lcom/nvidia/devtech/NvEventQueueActivity$RawData;->length:I */
/* .line 169 */
/* new-array v5, v4, [B */
this.data = v5;
/* .line 170 */
v5 = this.data;
(( java.io.InputStream ) v1 ).read ( v5 ); // invoke-virtual {v1, v5}, Ljava/io/InputStream;->read([B)I
/* :try_end_1 */
/* .catch Ljava/io/IOException; {:try_start_1 ..:try_end_1} :catch_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 177 */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 179 */
try { // :try_start_2
(( java.io.InputStream ) v1 ).close ( ); // invoke-virtual {v1}, Ljava/io/InputStream;->close()V
/* :try_end_2 */
/* .catch Ljava/lang/Exception; {:try_start_2 ..:try_end_2} :catch_4 */
/* .line 182 */
} // .end local v4 # "size":I
} // :cond_0
} // :goto_1
/* .line 157 */
/* :catch_0 */
/* move-exception v0 */
/* .line 161 */
/* .local v0, "e":Ljava/lang/Exception; */
try { // :try_start_3
(( com.nvidia.devtech.NvEventQueueActivity ) p0 ).getAssets ( ); // invoke-virtual {p0}, Lcom/nvidia/devtech/NvEventQueueActivity;->getAssets()Landroid/content/res/AssetManager;
(( android.content.res.AssetManager ) v5 ).open ( p1 ); // invoke-virtual {v5, p1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;
/* :try_end_3 */
/* .catch Ljava/lang/Exception; {:try_start_3 ..:try_end_3} :catch_5 */
/* .catch Ljava/io/IOException; {:try_start_3 ..:try_end_3} :catch_1 */
/* .catchall {:try_start_3 ..:try_end_3} :catchall_0 */
/* .line 172 */
} // .end local v0 # "e":Ljava/lang/Exception;
/* :catch_1 */
/* move-exception v5 */
/* .line 177 */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 179 */
try { // :try_start_4
(( java.io.InputStream ) v1 ).close ( ); // invoke-virtual {v1}, Ljava/io/InputStream;->close()V
/* :try_end_4 */
/* .catch Ljava/lang/Exception; {:try_start_4 ..:try_end_4} :catch_2 */
/* :catch_2 */
/* move-exception v5 */
/* .line 176 */
/* :catchall_0 */
/* move-exception v5 */
/* .line 177 */
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 179 */
try { // :try_start_5
(( java.io.InputStream ) v1 ).close ( ); // invoke-virtual {v1}, Ljava/io/InputStream;->close()V
/* :try_end_5 */
/* .catch Ljava/lang/Exception; {:try_start_5 ..:try_end_5} :catch_3 */
/* .line 181 */
} // :cond_1
} // :goto_2
/* throw v5 */
/* .line 179 */
/* :catch_3 */
/* move-exception v6 */
/* .restart local v4 # "size":I */
/* :catch_4 */
/* move-exception v5 */
/* .line 163 */
} // .end local v4 # "size":I
/* .restart local v0 # "e":Ljava/lang/Exception; */
/* :catch_5 */
/* move-exception v5 */
} // .end method
public com.nvidia.devtech.NvEventQueueActivity$RawTexture loadTexture ( java.lang.String p0 ) {
/* .locals 24 */
/* .param p1, "filename" # Ljava/lang/String; */
/* .prologue */
/* .line 203 */
/* new-instance v19, Lcom/nvidia/devtech/NvEventQueueActivity$RawTexture; */
/* move-object/from16 v0, v19 */
/* move-object/from16 v1, p0 */
/* invoke-direct {v0, v1}, Lcom/nvidia/devtech/NvEventQueueActivity$RawTexture;-><init>(Lcom/nvidia/devtech/NvEventQueueActivity;)V */
/* .line 205 */
/* .local v19, "ret":Lcom/nvidia/devtech/NvEventQueueActivity$RawTexture; */
int v15 = 0; // const/4 v15, 0x0
/* .line 208 */
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
/* .line 221 */
} // .end local v16 # "is":Ljava/io/InputStream;
/* .restart local v15 # "is":Ljava/io/InputStream; */
} // :goto_0
try { // :try_start_1
android.graphics.BitmapFactory .decodeStream ( v15 );
/* .line 222 */
/* .local v2, "bmp":Landroid/graphics/Bitmap; */
v4 = (( android.graphics.Bitmap ) v2 ).getWidth ( ); // invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I
/* move-object/from16 v0, v19 */
/* iput v4, v0, Lcom/nvidia/devtech/NvEventQueueActivity$RawTexture;->width:I */
/* .line 223 */
v4 = (( android.graphics.Bitmap ) v2 ).getHeight ( ); // invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I
/* move-object/from16 v0, v19 */
/* iput v4, v0, Lcom/nvidia/devtech/NvEventQueueActivity$RawTexture;->height:I */
/* .line 224 */
v4 = (( android.graphics.Bitmap ) v2 ).getWidth ( ); // invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I
v5 = (( android.graphics.Bitmap ) v2 ).getHeight ( ); // invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I
/* mul-int/2addr v4, v5 */
/* new-array v3, v4, [I */
/* .line 225 */
/* .local v3, "pixels":[I */
int v4 = 0; // const/4 v4, 0x0
v5 = (( android.graphics.Bitmap ) v2 ).getWidth ( ); // invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I
int v6 = 0; // const/4 v6, 0x0
int v7 = 0; // const/4 v7, 0x0
v8 = (( android.graphics.Bitmap ) v2 ).getWidth ( ); // invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I
v9 = (( android.graphics.Bitmap ) v2 ).getHeight ( ); // invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I
/* invoke-virtual/range {v2 ..v9}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V */
/* .line 228 */
v4 = (( android.graphics.Bitmap ) v2 ).getWidth ( ); // invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I
/* new-array v0, v4, [I */
/* move-object/from16 v20, v0 */
/* .line 229 */
/* .local v20, "tmp":[I */
v21 = (( android.graphics.Bitmap ) v2 ).getWidth ( ); // invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I
/* .line 230 */
/* .local v21, "w":I */
v13 = (( android.graphics.Bitmap ) v2 ).getHeight ( ); // invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I
/* .line 231 */
/* .local v13, "h":I */
int v14 = 0; // const/4 v14, 0x0
/* .local v14, "i":I */
} // :goto_1
/* shr-int/lit8 v4, v13, 0x1 */
/* if-lt v14, v4, :cond_0 */
/* .line 239 */
/* array-length v4, v3 */
/* mul-int/lit8 v4, v4, 0x4 */
/* move-object/from16 v0, v19 */
/* iput v4, v0, Lcom/nvidia/devtech/NvEventQueueActivity$RawTexture;->length:I */
/* .line 240 */
/* move-object/from16 v0, v19 */
/* iget v4, v0, Lcom/nvidia/devtech/NvEventQueueActivity$RawTexture;->length:I */
/* new-array v4, v4, [B */
/* move-object/from16 v0, v19 */
this.data = v4;
/* :try_end_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_1 */
/* .line 241 */
/* const/16 v18, 0x0 */
/* .line 242 */
/* .local v18, "pos":I */
int v10 = 0; // const/4 v10, 0x0
/* .line 243 */
/* .local v10, "bpos":I */
/* const/16 v23, 0x0 */
/* .local v23, "y":I */
} // :goto_2
/* move/from16 v0, v23 */
/* if-lt v0, v13, :cond_1 */
/* .line 259 */
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
/* .line 210 */
/* :catch_0 */
/* move-exception v12 */
/* .line 214 */
/* .local v12, "e":Ljava/lang/Exception; */
try { // :try_start_2
/* invoke-virtual/range {p0 ..p0}, Lcom/nvidia/devtech/NvEventQueueActivity;->getAssets()Landroid/content/res/AssetManager; */
/* move-object/from16 v0, p1 */
(( android.content.res.AssetManager ) v4 ).open ( v0 ); // invoke-virtual {v4, v0}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;
/* :try_end_2 */
/* .catch Ljava/lang/Exception; {:try_start_2 ..:try_end_2} :catch_2 */
/* .line 233 */
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
/* .line 234 */
/* add-int/lit8 v4, v13, -0x1 */
/* sub-int/2addr v4, v14 */
/* mul-int v4, v4, v21 */
/* mul-int v5, v14, v21 */
/* move/from16 v0, v21 */
java.lang.System .arraycopy ( v3,v4,v3,v5,v0 );
/* .line 235 */
int v4 = 0; // const/4 v4, 0x0
/* add-int/lit8 v5, v13, -0x1 */
/* sub-int/2addr v5, v14 */
/* mul-int v5, v5, v21 */
/* move-object/from16 v0, v20 */
/* move/from16 v1, v21 */
java.lang.System .arraycopy ( v0,v4,v3,v5,v1 );
/* .line 231 */
/* add-int/lit8 v14, v14, 0x1 */
/* .line 245 */
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
/* .line 243 */
/* add-int/lit8 v23, v23, 0x1 */
/* move v10, v11 */
} // .end local v11 # "bpos":I
/* .restart local v10 # "bpos":I */
/* .line 247 */
} // .end local v10 # "bpos":I
/* .restart local v11 # "bpos":I */
} // :cond_2
/* aget v17, v3, v18 */
/* .line 248 */
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
/* .line 249 */
/* move-object/from16 v0, v19 */
v4 = this.data;
/* add-int/lit8 v11, v10, 0x1 */
} // .end local v10 # "bpos":I
/* .restart local v11 # "bpos":I */
/* shr-int/lit8 v5, v17, 0x8 */
/* and-int/lit16 v5, v5, 0xff */
/* int-to-byte v5, v5 */
/* aput-byte v5, v4, v10 */
/* .line 250 */
/* move-object/from16 v0, v19 */
v4 = this.data;
/* add-int/lit8 v10, v11, 0x1 */
} // .end local v11 # "bpos":I
/* .restart local v10 # "bpos":I */
/* shr-int/lit8 v5, v17, 0x0 */
/* and-int/lit16 v5, v5, 0xff */
/* int-to-byte v5, v5 */
/* aput-byte v5, v4, v11 */
/* .line 251 */
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
/* .line 245 */
/* add-int/lit8 v22, v22, 0x1 */
/* add-int/lit8 v18, v18, 0x1 */
/* .line 255 */
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
/* .line 257 */
/* .restart local v12 # "e":Ljava/lang/Exception; */
(( java.lang.Exception ) v12 ).printStackTrace ( ); // invoke-virtual {v12}, Ljava/lang/Exception;->printStackTrace()V
/* .line 216 */
/* :catch_2 */
/* move-exception v4 */
/* goto/16 :goto_0 */
} // .end method
public Boolean makeCurrent ( ) {
/* .locals 6 */
/* .prologue */
int v0 = 0; // const/4 v0, 0x0
/* .line 884 */
v1 = this.eglContext;
/* if-nez v1, :cond_0 */
/* .line 886 */
v1 = java.lang.System.out;
final String v2 = "eglContext is NULL"; // const-string v2, "eglContext is NULL"
(( java.io.PrintStream ) v1 ).println ( v2 ); // invoke-virtual {v1, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
/* .line 902 */
} // :goto_0
/* .line 889 */
} // :cond_0
v1 = this.eglSurface;
/* if-nez v1, :cond_1 */
/* .line 891 */
v1 = java.lang.System.out;
final String v2 = "eglSurface is NULL"; // const-string v2, "eglSurface is NULL"
(( java.io.PrintStream ) v1 ).println ( v2 ); // invoke-virtual {v1, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
/* .line 894 */
} // :cond_1
v1 = this.egl;
v2 = this.eglDisplay;
v3 = this.eglSurface;
v4 = this.eglSurface;
v1 = v5 = this.eglContext;
/* if-nez v1, :cond_2 */
/* .line 896 */
v1 = java.lang.System.out;
/* new-instance v2, Ljava/lang/StringBuilder; */
final String v3 = "eglMakeCurrent err: "; // const-string v3, "eglMakeCurrent err: "
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v3 = v3 = this.egl;
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( java.io.PrintStream ) v1 ).println ( v2 ); // invoke-virtual {v1, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
/* .line 901 */
} // :cond_2
(( com.nvidia.devtech.NvEventQueueActivity ) p0 ).nvAcquireTimeExtension ( ); // invoke-virtual {p0}, Lcom/nvidia/devtech/NvEventQueueActivity;->nvAcquireTimeExtension()V
/* .line 902 */
int v0 = 1; // const/4 v0, 0x1
} // .end method
public native Boolean multiTouchEvent ( Integer p0, Integer p1, Integer p2, Integer p3, Integer p4, Integer p5, android.view.MotionEvent p6 ) {
} // .end method
public native void nvAcquireTimeExtension ( ) {
} // .end method
public native Long nvGetSystemTime ( ) {
} // .end method
public void onAccuracyChanged ( android.hardware.Sensor p0, Integer p1 ) {
/* .locals 0 */
/* .param p1, "sensor" # Landroid/hardware/Sensor; */
/* .param p2, "accuracy" # I */
/* .prologue */
/* .line 423 */
return;
} // .end method
public void onCreate ( android.os.Bundle p0 ) {
/* .locals 2 */
/* .param p1, "savedInstanceState" # Landroid/os/Bundle; */
/* .prologue */
/* .line 309 */
v0 = java.lang.System.out;
final String v1 = "**** onCreate"; // const-string v1, "**** onCreate"
(( java.io.PrintStream ) v0 ).println ( v1 ); // invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
/* .line 310 */
/* invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V */
/* .line 311 */
/* iget-boolean v0, p0, Lcom/nvidia/devtech/NvEventQueueActivity;->supportPauseResume:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 312 */
(( com.nvidia.devtech.NvEventQueueActivity ) p0 ).init ( ); // invoke-virtual {p0}, Lcom/nvidia/devtech/NvEventQueueActivity;->init()Z
/* .line 313 */
} // :cond_0
/* new-instance v0, Landroid/os/Handler; */
/* invoke-direct {v0}, Landroid/os/Handler;-><init>()V */
this.handler = v0;
/* .line 314 */
/* iget-boolean v0, p0, Lcom/nvidia/devtech/NvEventQueueActivity;->wantsAccelerometer:Z */
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = this.mSensorManager;
/* if-nez v0, :cond_1 */
/* .line 315 */
final String v0 = "sensor"; // const-string v0, "sensor"
(( com.nvidia.devtech.NvEventQueueActivity ) p0 ).getSystemService ( v0 ); // invoke-virtual {p0, v0}, Lcom/nvidia/devtech/NvEventQueueActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v0, Landroid/hardware/SensorManager; */
this.mSensorManager = v0;
/* .line 317 */
} // :cond_1
com.nvidia.devtech.NvUtil .getInstance ( );
(( com.nvidia.devtech.NvUtil ) v0 ).setActivity ( p0 ); // invoke-virtual {v0, p0}, Lcom/nvidia/devtech/NvUtil;->setActivity(Landroid/app/Activity;)V
/* .line 318 */
com.nvidia.devtech.NvAPKFileHelper .getInstance ( );
(( com.nvidia.devtech.NvAPKFileHelper ) v0 ).setContext ( p0 ); // invoke-virtual {v0, p0}, Lcom/nvidia/devtech/NvAPKFileHelper;->setContext(Landroid/content/Context;)V
/* .line 320 */
final String v0 = "window"; // const-string v0, "window"
(( com.nvidia.devtech.NvEventQueueActivity ) p0 ).getSystemService ( v0 ); // invoke-virtual {p0, v0}, Lcom/nvidia/devtech/NvEventQueueActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v0, Landroid/view/WindowManager; */
this.display = v0;
/* .line 321 */
(( com.nvidia.devtech.NvEventQueueActivity ) p0 ).systemInit ( ); // invoke-virtual {p0}, Lcom/nvidia/devtech/NvEventQueueActivity;->systemInit()Z
/* .line 322 */
return;
} // .end method
public void onDestroy ( ) {
/* .locals 2 */
/* .prologue */
/* .line 406 */
v0 = java.lang.System.out;
final String v1 = "**** onDestroy"; // const-string v1, "**** onDestroy"
(( java.io.PrintStream ) v0 ).println ( v1 ); // invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
/* .line 407 */
/* iget-boolean v0, p0, Lcom/nvidia/devtech/NvEventQueueActivity;->supportPauseResume:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 409 */
(( com.nvidia.devtech.NvEventQueueActivity ) p0 ).quitAndWait ( ); // invoke-virtual {p0}, Lcom/nvidia/devtech/NvEventQueueActivity;->quitAndWait()V
/* .line 410 */
(( com.nvidia.devtech.NvEventQueueActivity ) p0 ).finish ( ); // invoke-virtual {p0}, Lcom/nvidia/devtech/NvEventQueueActivity;->finish()V
/* .line 412 */
} // :cond_0
/* invoke-super {p0}, Landroid/app/Activity;->onDestroy()V */
/* .line 413 */
(( com.nvidia.devtech.NvEventQueueActivity ) p0 ).systemCleanup ( ); // invoke-virtual {p0}, Lcom/nvidia/devtech/NvEventQueueActivity;->systemCleanup()V
/* .line 414 */
return;
} // .end method
public Boolean onKeyDown ( Integer p0, android.view.KeyEvent p1 ) {
/* .locals 3 */
/* .param p1, "keyCode" # I */
/* .param p2, "event" # Landroid/view/KeyEvent; */
/* .prologue */
/* .line 491 */
v0 = /* invoke-super {p0, p1, p2}, Landroid/app/Activity;->onKeyDown(ILandroid/view/KeyEvent;)Z */
/* .line 492 */
/* .local v0, "ret":Z */
/* if-nez v0, :cond_0 */
/* .line 493 */
v1 = (( android.view.KeyEvent ) p2 ).getAction ( ); // invoke-virtual {p2}, Landroid/view/KeyEvent;->getAction()I
v2 = (( android.view.KeyEvent ) p2 ).getUnicodeChar ( ); // invoke-virtual {p2}, Landroid/view/KeyEvent;->getUnicodeChar()I
v0 = (( com.nvidia.devtech.NvEventQueueActivity ) p0 ).keyEvent ( v1, p1, v2, p2 ); // invoke-virtual {p0, v1, p1, v2, p2}, Lcom/nvidia/devtech/NvEventQueueActivity;->keyEvent(IIILandroid/view/KeyEvent;)Z
/* .line 494 */
} // :cond_0
} // .end method
public Boolean onKeyUp ( Integer p0, android.view.KeyEvent p1 ) {
/* .locals 3 */
/* .param p1, "keyCode" # I */
/* .param p2, "event" # Landroid/view/KeyEvent; */
/* .prologue */
/* .line 505 */
v0 = /* invoke-super {p0, p1, p2}, Landroid/app/Activity;->onKeyUp(ILandroid/view/KeyEvent;)Z */
/* .line 506 */
/* .local v0, "ret":Z */
/* if-nez v0, :cond_0 */
/* .line 507 */
v1 = (( android.view.KeyEvent ) p2 ).getAction ( ); // invoke-virtual {p2}, Landroid/view/KeyEvent;->getAction()I
v2 = (( android.view.KeyEvent ) p2 ).getUnicodeChar ( ); // invoke-virtual {p2}, Landroid/view/KeyEvent;->getUnicodeChar()I
v0 = (( com.nvidia.devtech.NvEventQueueActivity ) p0 ).keyEvent ( v1, p1, v2, p2 ); // invoke-virtual {p0, v1, p1, v2, p2}, Lcom/nvidia/devtech/NvEventQueueActivity;->keyEvent(IIILandroid/view/KeyEvent;)Z
/* .line 508 */
} // :cond_0
} // .end method
protected void onPause ( ) {
/* .locals 2 */
/* .prologue */
/* .line 362 */
v0 = java.lang.System.out;
final String v1 = "**** onPause"; // const-string v1, "**** onPause"
(( java.io.PrintStream ) v0 ).println ( v1 ); // invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
/* .line 363 */
/* invoke-super {p0}, Landroid/app/Activity;->onPause()V */
/* .line 364 */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/nvidia/devtech/NvEventQueueActivity;->paused:Z */
/* .line 366 */
/* iget-boolean v0, p0, Lcom/nvidia/devtech/NvEventQueueActivity;->supportPauseResume:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 368 */
v0 = java.lang.System.out;
final String v1 = "java is invoking pauseEvent(), this will block until\nthe client calls NVEventPauseProcessed"; // const-string v1, "java is invoking pauseEvent(), this will block until\nthe client calls NVEventPauseProcessed"
(( java.io.PrintStream ) v0 ).println ( v1 ); // invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
/* .line 369 */
(( com.nvidia.devtech.NvEventQueueActivity ) p0 ).pauseEvent ( ); // invoke-virtual {p0}, Lcom/nvidia/devtech/NvEventQueueActivity;->pauseEvent()V
/* .line 370 */
v0 = java.lang.System.out;
final String v1 = "pauseEvent() returned"; // const-string v1, "pauseEvent() returned"
(( java.io.PrintStream ) v0 ).println ( v1 ); // invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
/* .line 377 */
} // :goto_0
return;
/* .line 374 */
} // :cond_0
(( com.nvidia.devtech.NvEventQueueActivity ) p0 ).quitAndWait ( ); // invoke-virtual {p0}, Lcom/nvidia/devtech/NvEventQueueActivity;->quitAndWait()V
/* .line 375 */
(( com.nvidia.devtech.NvEventQueueActivity ) p0 ).finish ( ); // invoke-virtual {p0}, Lcom/nvidia/devtech/NvEventQueueActivity;->finish()V
} // .end method
protected void onRestart ( ) {
/* .locals 2 */
/* .prologue */
/* .line 350 */
v0 = java.lang.System.out;
final String v1 = "**** onRestart"; // const-string v1, "**** onRestart"
(( java.io.PrintStream ) v0 ).println ( v1 ); // invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
/* .line 351 */
/* invoke-super {p0}, Landroid/app/Activity;->onRestart()V */
/* .line 352 */
return;
} // .end method
protected void onResume ( ) {
/* .locals 3 */
/* .prologue */
/* .line 332 */
v0 = java.lang.System.out;
final String v1 = "**** onResume"; // const-string v1, "**** onResume"
(( java.io.PrintStream ) v0 ).println ( v1 ); // invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
/* .line 333 */
/* invoke-super {p0}, Landroid/app/Activity;->onResume()V */
/* .line 334 */
v0 = this.mSensorManager;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 335 */
v0 = this.mSensorManager;
/* .line 337 */
v1 = this.mSensorManager;
int v2 = 1; // const/4 v2, 0x1
(( android.hardware.SensorManager ) v1 ).getDefaultSensor ( v2 ); // invoke-virtual {v1, v2}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;
/* .line 338 */
/* iget v2, p0, Lcom/nvidia/devtech/NvEventQueueActivity;->mSensorDelay:I */
/* .line 335 */
(( android.hardware.SensorManager ) v0 ).registerListener ( p0, v1, v2 ); // invoke-virtual {v0, p0, v1, v2}, Landroid/hardware/SensorManager;->registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z
/* .line 339 */
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lcom/nvidia/devtech/NvEventQueueActivity;->paused:Z */
/* .line 340 */
return;
} // .end method
public void onSensorChanged ( android.hardware.SensorEvent p0 ) {
/* .locals 4 */
/* .param p1, "event" # Landroid/hardware/SensorEvent; */
/* .prologue */
int v2 = 1; // const/4 v2, 0x1
/* .line 432 */
v0 = this.sensor;
v0 = (( android.hardware.Sensor ) v0 ).getType ( ); // invoke-virtual {v0}, Landroid/hardware/Sensor;->getType()I
/* if-ne v0, v2, :cond_0 */
/* .line 433 */
v0 = this.values;
int v1 = 0; // const/4 v1, 0x0
/* aget v0, v0, v1 */
v1 = this.values;
/* aget v1, v1, v2 */
v2 = this.values;
int v3 = 2; // const/4 v3, 0x2
/* aget v2, v2, v3 */
(( com.nvidia.devtech.NvEventQueueActivity ) p0 ).accelerometerEvent ( v0, v1, v2 ); // invoke-virtual {p0, v0, v1, v2}, Lcom/nvidia/devtech/NvEventQueueActivity;->accelerometerEvent(FFF)Z
/* .line 434 */
} // :cond_0
return;
} // .end method
protected void onStop ( ) {
/* .locals 2 */
/* .prologue */
/* .line 387 */
v0 = java.lang.System.out;
final String v1 = "**** onStop"; // const-string v1, "**** onStop"
(( java.io.PrintStream ) v0 ).println ( v1 ); // invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
/* .line 388 */
v0 = this.mSensorManager;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 389 */
v0 = this.mSensorManager;
(( android.hardware.SensorManager ) v0 ).unregisterListener ( p0 ); // invoke-virtual {v0, p0}, Landroid/hardware/SensorManager;->unregisterListener(Landroid/hardware/SensorEventListener;)V
/* .line 390 */
} // :cond_0
/* invoke-super {p0}, Landroid/app/Activity;->onStop()V */
/* .line 391 */
return;
} // .end method
public Boolean onTouchEvent ( android.view.MotionEvent p0 ) {
/* .locals 12 */
/* .param p1, "event" # Landroid/view/MotionEvent; */
/* .prologue */
/* .line 444 */
v11 = /* invoke-super {p0, p1}, Landroid/app/Activity;->onTouchEvent(Landroid/view/MotionEvent;)Z */
/* .line 445 */
/* .local v11, "ret":Z */
/* if-nez v11, :cond_0 */
/* .line 447 */
/* iget-boolean v0, p0, Lcom/nvidia/devtech/NvEventQueueActivity;->wantsMultitouch:Z */
if ( v0 != null) { // if-eqz v0, :cond_4
/* .line 449 */
int v2 = 0; // const/4 v2, 0x0
/* .line 450 */
/* .local v2, "count":I */
int v3 = 0; // const/4 v3, 0x0
/* .local v3, "x1":I */
int v4 = 0; // const/4 v4, 0x0
/* .local v4, "y1":I */
int v5 = 0; // const/4 v5, 0x0
/* .local v5, "x2":I */
int v6 = 0; // const/4 v6, 0x0
/* .line 452 */
/* .local v6, "y2":I */
v10 = (( android.view.MotionEvent ) p1 ).getPointerCount ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I
/* .line 453 */
/* .local v10, "numEvents":I */
int v8 = 0; // const/4 v8, 0x0
/* .local v8, "i":I */
} // :goto_0
/* if-lt v8, v10, :cond_1 */
/* .line 473 */
v1 = (( android.view.MotionEvent ) p1 ).getAction ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I
/* move-object v0, p0 */
/* move-object v7, p1 */
v11 = /* invoke-virtual/range {v0 ..v7}, Lcom/nvidia/devtech/NvEventQueueActivity;->multiTouchEvent(IIIIIILandroid/view/MotionEvent;)Z */
/* .line 480 */
} // .end local v2 # "count":I
} // .end local v3 # "x1":I
} // .end local v4 # "y1":I
} // .end local v5 # "x2":I
} // .end local v6 # "y2":I
} // .end local v8 # "i":I
} // .end local v10 # "numEvents":I
} // :cond_0
} // :goto_1
/* .line 456 */
/* .restart local v2 # "count":I */
/* .restart local v3 # "x1":I */
/* .restart local v4 # "y1":I */
/* .restart local v5 # "x2":I */
/* .restart local v6 # "y2":I */
/* .restart local v8 # "i":I */
/* .restart local v10 # "numEvents":I */
} // :cond_1
v9 = (( android.view.MotionEvent ) p1 ).getPointerId ( v8 ); // invoke-virtual {p1, v8}, Landroid/view/MotionEvent;->getPointerId(I)I
/* .line 457 */
/* .local v9, "index":I */
int v0 = 2; // const/4 v0, 0x2
/* if-ge v9, v0, :cond_2 */
/* .line 459 */
/* if-nez v2, :cond_3 */
/* .line 461 */
v0 = (( android.view.MotionEvent ) p1 ).getX ( v8 ); // invoke-virtual {p1, v8}, Landroid/view/MotionEvent;->getX(I)F
/* float-to-int v3, v0 */
/* .line 462 */
v0 = (( android.view.MotionEvent ) p1 ).getY ( v8 ); // invoke-virtual {p1, v8}, Landroid/view/MotionEvent;->getY(I)F
/* float-to-int v4, v0 */
/* .line 463 */
/* add-int/lit8 v2, v2, 0x1 */
/* .line 453 */
} // :cond_2
} // :goto_2
/* add-int/lit8 v8, v8, 0x1 */
/* .line 465 */
} // :cond_3
int v0 = 1; // const/4 v0, 0x1
/* if-ne v2, v0, :cond_2 */
/* .line 467 */
v0 = (( android.view.MotionEvent ) p1 ).getX ( v8 ); // invoke-virtual {p1, v8}, Landroid/view/MotionEvent;->getX(I)F
/* float-to-int v5, v0 */
/* .line 468 */
v0 = (( android.view.MotionEvent ) p1 ).getY ( v8 ); // invoke-virtual {p1, v8}, Landroid/view/MotionEvent;->getY(I)F
/* float-to-int v6, v0 */
/* .line 469 */
/* add-int/lit8 v2, v2, 0x1 */
/* .line 477 */
} // .end local v2 # "count":I
} // .end local v3 # "x1":I
} // .end local v4 # "y1":I
} // .end local v5 # "x2":I
} // .end local v6 # "y2":I
} // .end local v8 # "i":I
} // .end local v9 # "index":I
} // .end local v10 # "numEvents":I
} // :cond_4
v0 = (( android.view.MotionEvent ) p1 ).getAction ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I
v1 = (( android.view.MotionEvent ) p1 ).getX ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F
/* float-to-int v1, v1 */
v7 = (( android.view.MotionEvent ) p1 ).getY ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
/* float-to-int v7, v7 */
v11 = (( com.nvidia.devtech.NvEventQueueActivity ) p0 ).touchEvent ( v0, v1, v7, p1 ); // invoke-virtual {p0, v0, v1, v7, p1}, Lcom/nvidia/devtech/NvEventQueueActivity;->touchEvent(IIILandroid/view/MotionEvent;)Z
} // .end method
public native void pauseEvent ( ) {
} // .end method
public native void postCleanup ( ) {
} // .end method
public native void quitAndWait ( ) {
} // .end method
public native void resumeEvent ( ) {
} // .end method
public void setFixedSize ( Integer p0, Integer p1 ) {
/* .locals 0 */
/* .param p1, "fw" # I */
/* .param p2, "fh" # I */
/* .prologue */
/* .line 110 */
/* iput p1, p0, Lcom/nvidia/devtech/NvEventQueueActivity;->fixedWidth:I */
/* .line 111 */
/* iput p2, p0, Lcom/nvidia/devtech/NvEventQueueActivity;->fixedHeight:I */
/* .line 112 */
return;
} // .end method
public native void setWindowSize ( Integer p0, Integer p1 ) {
} // .end method
public Boolean swapBuffers ( ) {
/* .locals 4 */
/* .prologue */
int v0 = 0; // const/4 v0, 0x0
/* .line 844 */
v1 = this.eglSurface;
/* if-nez v1, :cond_0 */
/* .line 846 */
v1 = java.lang.System.out;
final String v2 = "eglSurface is NULL"; // const-string v2, "eglSurface is NULL"
(( java.io.PrintStream ) v1 ).println ( v2 ); // invoke-virtual {v1, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
/* .line 858 */
} // :goto_0
/* .line 849 */
} // :cond_0
v1 = this.egl;
v2 = this.eglDisplay;
v1 = v3 = this.eglSurface;
/* if-nez v1, :cond_1 */
/* .line 851 */
v1 = java.lang.System.out;
/* new-instance v2, Ljava/lang/StringBuilder; */
final String v3 = "eglSwapBufferrr: "; // const-string v3, "eglSwapBufferrr: "
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v3 = v3 = this.egl;
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( java.io.PrintStream ) v1 ).println ( v2 ); // invoke-virtual {v1, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
/* .line 858 */
} // :cond_1
int v0 = 1; // const/4 v0, 0x1
} // .end method
protected void systemCleanup ( ) {
/* .locals 1 */
/* .prologue */
/* .line 938 */
/* iget-boolean v0, p0, Lcom/nvidia/devtech/NvEventQueueActivity;->ranInit:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 939 */
(( com.nvidia.devtech.NvEventQueueActivity ) p0 ).cleanup ( ); // invoke-virtual {p0}, Lcom/nvidia/devtech/NvEventQueueActivity;->cleanup()V
/* .line 940 */
} // :cond_0
(( com.nvidia.devtech.NvEventQueueActivity ) p0 ).cleanupEGL ( ); // invoke-virtual {p0}, Lcom/nvidia/devtech/NvEventQueueActivity;->cleanupEGL()V
/* .line 942 */
(( com.nvidia.devtech.NvEventQueueActivity ) p0 ).postCleanup ( ); // invoke-virtual {p0}, Lcom/nvidia/devtech/NvEventQueueActivity;->postCleanup()V
/* .line 943 */
return;
} // .end method
protected Boolean systemInit ( ) {
/* .locals 5 */
/* .prologue */
/* .line 545 */
/* move-object v0, p0 */
/* .line 547 */
/* .local v0, "act":Lcom/nvidia/devtech/NvEventQueueActivity; */
v3 = java.lang.System.out;
final String v4 = "In systemInit"; // const-string v4, "In systemInit"
(( java.io.PrintStream ) v3 ).println ( v4 ); // invoke-virtual {v3, v4}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
/* .line 550 */
/* new-instance v2, Landroid/view/SurfaceView; */
/* invoke-direct {v2, p0}, Landroid/view/SurfaceView;-><init>(Landroid/content/Context;)V */
/* .line 551 */
/* .local v2, "view":Landroid/view/SurfaceView; */
(( android.view.SurfaceView ) v2 ).getHolder ( ); // invoke-virtual {v2}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;
/* .line 552 */
/* .local v1, "holder":Landroid/view/SurfaceHolder; */
int v3 = 2; // const/4 v3, 0x2
/* .line 554 */
/* new-instance v3, Lcom/nvidia/devtech/NvEventQueueActivity$1; */
/* invoke-direct {v3, p0, v0}, Lcom/nvidia/devtech/NvEventQueueActivity$1;-><init>(Lcom/nvidia/devtech/NvEventQueueActivity;Lcom/nvidia/devtech/NvEventQueueActivity;)V */
/* .line 629 */
(( com.nvidia.devtech.NvEventQueueActivity ) p0 ).setContentView ( v2 ); // invoke-virtual {p0, v2}, Lcom/nvidia/devtech/NvEventQueueActivity;->setContentView(Landroid/view/View;)V
/* .line 630 */
int v3 = 1; // const/4 v3, 0x1
} // .end method
public native Boolean touchEvent ( Integer p0, Integer p1, Integer p2, android.view.MotionEvent p3 ) {
} // .end method
public Boolean unMakeCurrent ( ) {
/* .locals 5 */
/* .prologue */
/* .line 918 */
v0 = this.egl;
v1 = this.eglDisplay;
v2 = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE;
v3 = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE;
v0 = v4 = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT;
/* if-nez v0, :cond_0 */
/* .line 920 */
v0 = java.lang.System.out;
/* new-instance v1, Ljava/lang/StringBuilder; */
final String v2 = "egl(Un)MakeCurrent err: "; // const-string v2, "egl(Un)MakeCurrent err: "
/* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v2 = v2 = this.egl;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( java.io.PrintStream ) v0 ).println ( v1 ); // invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
/* .line 921 */
int v0 = 0; // const/4 v0, 0x0
/* .line 924 */
} // :goto_0
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
} // .end method
