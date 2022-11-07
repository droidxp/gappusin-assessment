public abstract class com.nobleempire.GunDisassembly2.NvEventQueueActivity extends android.app.Activity implements android.hardware.SensorEventListener {
	 /* .source "NvEventQueueActivity.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity$DungeonsPurchaseObserver;, */
	 /* Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity$ScreenReceiver; */
	 /* } */
} // .end annotation
/* # static fields */
private static final Integer EGL_CONTEXT_CLIENT_VERSION;
private static final Integer EGL_OPENGL_ES2_BIT;
private static final Integer EGL_RENDERABLE_TYPE;
private static final java.lang.String TAG;
protected static Integer start_counter;
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
javax.microedition.khronos.opengles.GL11 gl;
protected Integer greenSize;
protected android.os.Handler handler;
private com.nobleempire.GunDisassembly2.BillingService mBillingService;
private com.nobleempire.GunDisassembly2.NvEventQueueActivity$DungeonsPurchaseObserver mDungeonsPurchaseObserver;
private android.os.Handler mHandler;
protected Integer mSensorDelay;
protected android.hardware.SensorManager mSensorManager;
protected Boolean paused;
private Boolean ranInit;
protected Integer redSize;
protected Integer stencilSize;
protected Boolean supportPauseResume;
private Integer surfaceHeight;
private Integer surfaceWidth;
protected Boolean surface_was_created;
protected Boolean surface_was_destroyed;
private android.view.SurfaceView view;
protected Boolean wantsAccelerometer;
protected Boolean wantsMultitouch;
/* # direct methods */
static com.nobleempire.GunDisassembly2.NvEventQueueActivity ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 156 */
	 int v0 = 0; // const/4 v0, 0x0
	 /* .line 78 */
	 return;
} // .end method
public com.nobleempire.GunDisassembly2.NvEventQueueActivity ( ) {
	 /* .locals 4 */
	 /* .prologue */
	 int v3 = 5; // const/4 v3, 0x5
	 int v2 = 0; // const/4 v2, 0x0
	 int v1 = 0; // const/4 v1, 0x0
	 /* .line 78 */
	 /* invoke-direct {p0}, Landroid/app/Activity;-><init>()V */
	 /* .line 153 */
	 this.handler = v1;
	 /* .line 154 */
	 this.view = v1;
	 /* .line 155 */
	 /* iput-boolean v2, p0, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;->paused:Z */
	 /* .line 157 */
	 /* iput-boolean v2, p0, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;->wantsMultitouch:Z */
	 /* .line 158 */
	 /* iput-boolean v2, p0, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;->supportPauseResume:Z */
	 /* .line 160 */
	 /* iput-boolean v2, p0, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;->wantsAccelerometer:Z */
	 /* .line 161 */
	 this.mSensorManager = v1;
	 /* .line 162 */
	 int v0 = 1; // const/4 v0, 0x1
	 /* iput v0, p0, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;->mSensorDelay:I */
	 /* .line 163 */
	 this.display = v1;
	 /* .line 167 */
	 this.egl = v1;
	 /* .line 168 */
	 this.gl = v1;
	 /* .line 169 */
	 /* iput-boolean v2, p0, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;->ranInit:Z */
	 /* .line 170 */
	 this.eglSurface = v1;
	 /* .line 171 */
	 this.eglDisplay = v1;
	 /* .line 172 */
	 this.eglContext = v1;
	 /* .line 173 */
	 this.eglConfig = v1;
	 /* .line 174 */
	 this.cachedSurfaceHolder = v1;
	 /* .line 175 */
	 /* iput v2, p0, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;->surfaceWidth:I */
	 /* .line 176 */
	 /* iput v2, p0, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;->surfaceHeight:I */
	 /* .line 177 */
	 /* iput-boolean v2, p0, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;->surface_was_destroyed:Z */
	 /* .line 178 */
	 /* iput-boolean v2, p0, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;->surface_was_created:Z */
	 /* .line 594 */
	 /* iput v3, p0, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;->redSize:I */
	 /* .line 595 */
	 int v0 = 6; // const/4 v0, 0x6
	 /* iput v0, p0, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;->greenSize:I */
	 /* .line 596 */
	 /* iput v3, p0, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;->blueSize:I */
	 /* .line 597 */
	 /* iput v2, p0, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;->alphaSize:I */
	 /* .line 598 */
	 /* iput v2, p0, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;->stencilSize:I */
	 /* .line 599 */
	 /* const/16 v0, 0x10 */
	 /* iput v0, p0, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;->depthSize:I */
	 /* .line 600 */
	 this.configAttrs = v1;
	 /* .line 601 */
	 this.contextAttrs = v1;
	 /* .line 78 */
	 return;
} // .end method
static void access$0 ( com.nobleempire.GunDisassembly2.NvEventQueueActivity p0, java.lang.String p1, java.lang.String p2 ) { //synthethic
	 /* .locals 0 */
	 /* .prologue */
	 /* .line 145 */
	 /* invoke-direct {p0, p1, p2}, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;->logProductActivity(Ljava/lang/String;Ljava/lang/String;)V */
	 return;
} // .end method
static Boolean access$1 ( com.nobleempire.GunDisassembly2.NvEventQueueActivity p0 ) { //synthethic
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 169 */
	 /* iget-boolean v0, p0, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;->ranInit:Z */
} // .end method
static void access$2 ( com.nobleempire.GunDisassembly2.NvEventQueueActivity p0, Boolean p1 ) { //synthethic
	 /* .locals 0 */
	 /* .prologue */
	 /* .line 169 */
	 /* iput-boolean p1, p0, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;->ranInit:Z */
	 return;
} // .end method
static Integer access$3 ( com.nobleempire.GunDisassembly2.NvEventQueueActivity p0 ) { //synthethic
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 175 */
	 /* iget v0, p0, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;->surfaceWidth:I */
} // .end method
static Integer access$4 ( com.nobleempire.GunDisassembly2.NvEventQueueActivity p0 ) { //synthethic
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 176 */
	 /* iget v0, p0, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;->surfaceHeight:I */
} // .end method
static void access$5 ( com.nobleempire.GunDisassembly2.NvEventQueueActivity p0, Integer p1 ) { //synthethic
	 /* .locals 0 */
	 /* .prologue */
	 /* .line 175 */
	 /* iput p1, p0, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;->surfaceWidth:I */
	 return;
} // .end method
static void access$6 ( com.nobleempire.GunDisassembly2.NvEventQueueActivity p0, Integer p1 ) { //synthethic
	 /* .locals 0 */
	 /* .prologue */
	 /* .line 176 */
	 /* iput p1, p0, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;->surfaceHeight:I */
	 return;
} // .end method
private void logProductActivity ( java.lang.String p0, java.lang.String p1 ) {
	 /* .locals 3 */
	 /* .param p1, "product" # Ljava/lang/String; */
	 /* .param p2, "activity" # Ljava/lang/String; */
	 /* .prologue */
	 /* .line 146 */
	 final String v0 = "NvEventQueueActivity.java"; // const-string v0, "NvEventQueueActivity.java"
	 /* new-instance v1, Ljava/lang/StringBuilder; */
	 final String v2 = "~~logProductActivity "; // const-string v2, "~~logProductActivity "
	 /* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
	 (( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 final String v2 = " "; // const-string v2, " "
	 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v1 ).append ( p2 ); // invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 android.util.Log .v ( v0,v1 );
	 /* .line 151 */
	 return;
} // .end method
/* # virtual methods */
public Boolean InitEGLAndGLES2 ( ) {
	 /* .locals 10 */
	 /* .prologue */
	 int v4 = 1; // const/4 v4, 0x1
	 int v3 = 0; // const/4 v3, 0x0
	 /* .line 486 */
	 final String v5 = "NvEventQueueActivity.java"; // const-string v5, "NvEventQueueActivity.java"
	 final String v6 = "~~InitEGLAndGLES2()"; // const-string v6, "~~InitEGLAndGLES2()"
	 android.util.Log .v ( v5,v6 );
	 /* .line 487 */
	 v5 = this.cachedSurfaceHolder;
	 /* if-nez v5, :cond_0 */
	 /* .line 488 */
	 final String v4 = "NvEventQueueActivity.java"; // const-string v4, "NvEventQueueActivity.java"
	 final String v5 = "~~InitEGLAndGLES2 failed, cachedSurfaceHolder is null"; // const-string v5, "~~InitEGLAndGLES2 failed, cachedSurfaceHolder is null"
	 android.util.Log .v ( v4,v5 );
	 /* .line 522 */
} // :goto_0
/* .line 491 */
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
/* .line 492 */
/* .local v0, "eglInitialized":Z */
v5 = this.eglContext;
/* if-nez v5, :cond_1 */
/* .line 493 */
final String v5 = "NvEventQueueActivity.java"; // const-string v5, "NvEventQueueActivity.java"
final String v6 = "~~zero context, calling initEGL()"; // const-string v6, "~~zero context, calling initEGL()"
android.util.Log .v ( v5,v6 );
/* .line 494 */
v0 = (( com.nobleempire.GunDisassembly2.NvEventQueueActivity ) p0 ).initEGL ( ); // invoke-virtual {p0}, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;->initEGL()Z
/* .line 496 */
} // :cond_1
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 499 */
final String v5 = "NvEventQueueActivity.java"; // const-string v5, "NvEventQueueActivity.java"
/* new-instance v6, Ljava/lang/StringBuilder; */
final String v7 = "~~createEGLSurface.eglDisplay="; // const-string v7, "~~createEGLSurface.eglDisplay="
/* invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v7 = this.eglDisplay;
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v7 = ", eglConfig="; // const-string v7, ", eglConfig="
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v7 = this.eglConfig;
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).toString ( ); // invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .v ( v5,v6 );
/* .line 500 */
/* iput v3, p0, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;->surfaceWidth:I */
/* .line 501 */
/* iput v3, p0, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;->surfaceHeight:I */
/* .line 502 */
v5 = this.egl;
/* .line 503 */
v5 = this.egl;
v6 = this.eglDisplay;
v7 = this.eglConfig;
v8 = this.cachedSurfaceHolder;
int v9 = 0; // const/4 v9, 0x0
this.eglSurface = v5;
/* .line 504 */
v1 = v5 = this.egl;
/* .line 505 */
/* .local v1, "error":I */
/* const/16 v5, 0x3000 */
/* if-eq v1, v5, :cond_2 */
/* .line 506 */
final String v5 = "NvEventQueueActivity.java"; // const-string v5, "NvEventQueueActivity.java"
/* new-instance v6, Ljava/lang/StringBuilder; */
final String v7 = "~~~*** failed to create surface.Error: "; // const-string v7, "~~~*** failed to create surface.Error: "
/* invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v6 ).append ( v1 ); // invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).toString ( ); // invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .e ( v5,v6 );
/* .line 507 */
(( com.nobleempire.GunDisassembly2.NvEventQueueActivity ) p0 ).kill_self ( ); // invoke-virtual {p0}, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;->kill_self()V
/* .line 509 */
} // :cond_2
/* new-array v2, v4, [I */
/* .line 510 */
/* .local v2, "sizes":[I */
v5 = this.egl;
v6 = this.eglDisplay;
v7 = this.eglSurface;
/* const/16 v8, 0x3057 */
/* aget v5, v2, v3 */
/* iput v5, p0, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;->surfaceWidth:I */
/* .line 511 */
v5 = this.egl;
v6 = this.eglDisplay;
v7 = this.eglSurface;
/* const/16 v8, 0x3056 */
/* aget v5, v2, v3 */
/* iput v5, p0, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;->surfaceHeight:I */
/* .line 512 */
final String v5 = "NvEventQueueActivity.java"; // const-string v5, "NvEventQueueActivity.java"
/* new-instance v6, Ljava/lang/StringBuilder; */
final String v7 = "~~ surface: "; // const-string v7, "~~ surface: "
/* invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v7 = this.eglSurface;
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).toString ( ); // invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .v ( v5,v6 );
/* .line 513 */
final String v5 = "NvEventQueueActivity.java"; // const-string v5, "NvEventQueueActivity.java"
/* new-instance v6, Ljava/lang/StringBuilder; */
final String v7 = "~~ size: "; // const-string v7, "~~ size: "
/* invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* iget v7, p0, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;->surfaceWidth:I */
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v7 = "x"; // const-string v7, "x"
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v7, p0, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;->surfaceHeight:I */
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).toString ( ); // invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .v ( v5,v6 );
/* .line 514 */
/* iput-boolean v3, p0, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;->surface_was_destroyed:Z */
/* .line 515 */
/* iput-boolean v4, p0, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;->surface_was_created:Z */
/* .line 516 */
final String v3 = "NvEventQueueActivity.java"; // const-string v3, "NvEventQueueActivity.java"
final String v5 = "~~surface_was_destroyed = false"; // const-string v5, "~~surface_was_destroyed = false"
android.util.Log .i ( v3,v5 );
/* .line 521 */
final String v3 = "NvEventQueueActivity.java"; // const-string v3, "NvEventQueueActivity.java"
final String v5 = "~~InitEGLAndGLES2() succeeded"; // const-string v5, "~~InitEGLAndGLES2() succeeded"
android.util.Log .v ( v3,v5 );
/* move v3, v4 */
/* .line 522 */
/* goto/16 :goto_0 */
/* .line 518 */
} // .end local v1 # "error":I
} // .end local v2 # "sizes":[I
} // :cond_3
final String v4 = "NvEventQueueActivity.java"; // const-string v4, "NvEventQueueActivity.java"
final String v5 = "~~initEGLAndGLES2 failed, core EGL init failure"; // const-string v5, "~~initEGLAndGLES2 failed, core EGL init failure"
android.util.Log .v ( v4,v5 );
/* goto/16 :goto_0 */
} // .end method
public native Boolean accelerometerEvent ( Float p0, Float p1, Float p2 ) {
} // .end method
public Boolean check_billing_supported ( ) {
/* .locals 4 */
/* .prologue */
/* .line 927 */
v1 = this.mBillingService;
v0 = (( com.nobleempire.GunDisassembly2.BillingService ) v1 ).checkBillingSupported ( ); // invoke-virtual {v1}, Lcom/nobleempire/GunDisassembly2/BillingService;->checkBillingSupported()Z
/* .line 928 */
/* .local v0, "bres":Z */
final String v1 = "NvEventQueueActivity.java"; // const-string v1, "NvEventQueueActivity.java"
/* new-instance v2, Ljava/lang/StringBuilder; */
final String v3 = "~~ check_billing_supported ( ) => "; // const-string v3, "~~ check_billing_supported ( ) => "
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .v ( v1,v2 );
/* .line 929 */
} // .end method
public native void cleanup ( ) {
} // .end method
protected void cleanupEGL ( ) {
/* .locals 7 */
/* .prologue */
int v6 = 0; // const/4 v6, 0x0
int v5 = 0; // const/4 v5, 0x0
/* .line 717 */
final String v0 = "NvEventQueueActivity.java"; // const-string v0, "NvEventQueueActivity.java"
final String v1 = "~~cleanupEGL"; // const-string v1, "~~cleanupEGL"
android.util.Log .v ( v0,v1 );
/* .line 718 */
(( com.nobleempire.GunDisassembly2.NvEventQueueActivity ) p0 ).destroyEGLSurface ( ); // invoke-virtual {p0}, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;->destroyEGLSurface()V
/* .line 719 */
v0 = this.eglDisplay;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.egl;
v1 = this.eglDisplay;
v2 = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE;
v3 = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE;
v4 = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT;
/* .line 720 */
} // :cond_0
v0 = this.eglContext;
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = this.egl;
v1 = this.eglDisplay;
v2 = this.eglContext;
/* .line 721 */
} // :cond_1
v0 = this.eglDisplay;
if ( v0 != null) { // if-eqz v0, :cond_2
v0 = this.egl;
v1 = this.eglDisplay;
/* .line 722 */
} // :cond_2
this.eglDisplay = v5;
/* .line 723 */
this.eglContext = v5;
/* .line 724 */
this.eglSurface = v5;
/* .line 725 */
/* iput-boolean v6, p0, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;->ranInit:Z */
final String v0 = "NvEventQueueActivity.java"; // const-string v0, "NvEventQueueActivity.java"
final String v1 = "~~>>>>>>>>>>>>>> ranInit set to false"; // const-string v1, "~~>>>>>>>>>>>>>> ranInit set to false"
android.util.Log .v ( v0,v1 );
/* .line 726 */
this.eglConfig = v5;
/* .line 727 */
this.cachedSurfaceHolder = v5;
/* .line 728 */
/* iput v6, p0, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;->surfaceWidth:I */
/* .line 729 */
/* iput v6, p0, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;->surfaceHeight:I */
/* .line 730 */
return;
} // .end method
protected void destroyEGLSurface ( ) {
/* .locals 5 */
/* .prologue */
/* .line 710 */
final String v0 = "NvEventQueueActivity.java"; // const-string v0, "NvEventQueueActivity.java"
final String v1 = "~~destroyEGLSurface"; // const-string v1, "~~destroyEGLSurface"
android.util.Log .v ( v0,v1 );
/* .line 711 */
v0 = this.eglDisplay;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.eglSurface;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.egl;
v1 = this.eglDisplay;
v2 = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE;
v3 = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE;
v4 = this.eglContext;
/* .line 712 */
} // :cond_0
v0 = this.eglSurface;
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = this.egl;
v1 = this.eglDisplay;
v2 = this.eglSurface;
/* .line 713 */
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
this.eglSurface = v0;
/* .line 714 */
return;
} // .end method
public Boolean do_purchase ( java.lang.String p0 ) {
/* .locals 4 */
/* .param p1, "sku" # Ljava/lang/String; */
/* .prologue */
/* .line 909 */
v1 = this.mBillingService;
final String v2 = ""; // const-string v2, ""
v0 = (( com.nobleempire.GunDisassembly2.BillingService ) v1 ).requestPurchase ( p1, v2 ); // invoke-virtual {v1, p1, v2}, Lcom/nobleempire/GunDisassembly2/BillingService;->requestPurchase(Ljava/lang/String;Ljava/lang/String;)Z
/* .line 910 */
/* .local v0, "bres":Z */
final String v1 = "NvEventQueueActivity.java"; // const-string v1, "NvEventQueueActivity.java"
/* new-instance v2, Ljava/lang/StringBuilder; */
final String v3 = "~~ do_purchase ( "; // const-string v3, "~~ do_purchase ( "
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v2 ).append ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v3 = " ) => "; // const-string v3, " ) => "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .v ( v1,v2 );
/* .line 911 */
} // .end method
public Integer getOrientation ( ) {
/* .locals 1 */
/* .prologue */
/* .line 764 */
v0 = this.display;
v0 = (( android.view.Display ) v0 ).getOrientation ( ); // invoke-virtual {v0}, Landroid/view/Display;->getOrientation()I
} // .end method
public Boolean getSupportPauseResume ( ) {
/* .locals 1 */
/* .prologue */
/* .line 743 */
/* iget-boolean v0, p0, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;->supportPauseResume:Z */
} // .end method
public Integer getSurfaceHeight ( ) {
/* .locals 1 */
/* .prologue */
/* .line 745 */
/* iget v0, p0, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;->surfaceHeight:I */
} // .end method
public Integer getSurfaceWidth ( ) {
/* .locals 1 */
/* .prologue */
/* .line 744 */
/* iget v0, p0, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;->surfaceWidth:I */
} // .end method
public java.lang.String get_bundle_version ( ) {
/* .locals 5 */
/* .prologue */
/* .line 963 */
try { // :try_start_0
(( com.nobleempire.GunDisassembly2.NvEventQueueActivity ) p0 ).getPackageManager ( ); // invoke-virtual {p0}, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;->getPackageManager()Landroid/content/pm/PackageManager;
(( com.nobleempire.GunDisassembly2.NvEventQueueActivity ) p0 ).getPackageName ( ); // invoke-virtual {p0}, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;->getPackageName()Ljava/lang/String;
int v4 = 0; // const/4 v4, 0x0
(( android.content.pm.PackageManager ) v2 ).getPackageInfo ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
v1 = this.versionName;
/* :try_end_0 */
/* .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 967 */
} // :goto_0
/* .line 965 */
/* :catch_0 */
/* move-exception v0 */
/* .line 966 */
/* .local v0, "e":Landroid/content/pm/PackageManager$NameNotFoundException; */
final String v2 = "tag"; // const-string v2, "tag"
(( android.content.pm.PackageManager$NameNotFoundException ) v0 ).getMessage ( ); // invoke-virtual {v0}, Landroid/content/pm/PackageManager$NameNotFoundException;->getMessage()Ljava/lang/String;
android.util.Log .e ( v2,v3 );
/* .line 967 */
final String v1 = "1.0"; // const-string v1, "1.0"
} // .end method
public Integer get_density_dpi ( ) {
/* .locals 3 */
/* .prologue */
/* .line 189 */
/* new-instance v0, Landroid/util/DisplayMetrics; */
/* invoke-direct {v0}, Landroid/util/DisplayMetrics;-><init>()V */
/* .line 190 */
/* .local v0, "metrics":Landroid/util/DisplayMetrics; */
(( com.nobleempire.GunDisassembly2.NvEventQueueActivity ) p0 ).getWindowManager ( ); // invoke-virtual {p0}, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;->getWindowManager()Landroid/view/WindowManager;
(( android.view.Display ) v2 ).getMetrics ( v0 ); // invoke-virtual {v2, v0}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V
/* .line 191 */
/* iget v1, v0, Landroid/util/DisplayMetrics;->densityDpi:I */
/* .line 193 */
/* .local v1, "nres":I */
} // .end method
public java.lang.String get_external_storage_directory ( ) {
/* .locals 1 */
/* .prologue */
/* .line 971 */
android.os.Environment .getExternalStorageDirectory ( );
(( java.io.File ) v0 ).getPath ( ); // invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;
} // .end method
public java.lang.String get_heap_state ( ) {
/* .locals 11 */
/* .prologue */
/* const-wide/16 v9, 0x400 */
/* .line 893 */
android.os.Debug .getNativeHeapAllocatedSize ( );
/* move-result-wide v7 */
/* div-long v0, v7, v9 */
/* .line 894 */
/* .local v0, "allocated":J */
android.os.Debug .getNativeHeapSize ( );
/* move-result-wide v7 */
/* div-long v2, v7, v9 */
/* .line 895 */
/* .local v2, "available":J */
android.os.Debug .getNativeHeapFreeSize ( );
/* move-result-wide v7 */
/* div-long v4, v7, v9 */
/* .line 896 */
/* .local v4, "free":J */
/* new-instance v7, Ljava/lang/StringBuilder; */
final String v8 = "~~ HEAP AVAILABLE = "; // const-string v8, "~~ HEAP AVAILABLE = "
/* invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v7 ).append ( v2, v3 ); // invoke-virtual {v7, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
final String v8 = " KB; ALLOCATED = "; // const-string v8, " KB; ALLOCATED = "
(( java.lang.StringBuilder ) v7 ).append ( v8 ); // invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v7 ).append ( v0, v1 ); // invoke-virtual {v7, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
final String v8 = " KB; FREE = "; // const-string v8, " KB; FREE = "
(( java.lang.StringBuilder ) v7 ).append ( v8 ); // invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v7 ).append ( v4, v5 ); // invoke-virtual {v7, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
final String v8 = " KB"; // const-string v8, " KB"
(( java.lang.StringBuilder ) v7 ).append ( v8 ); // invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v7 ).toString ( ); // invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 897 */
/* .local v6, "res":Ljava/lang/String; */
} // .end method
public java.lang.String get_package_name ( ) {
/* .locals 1 */
/* .prologue */
/* .line 974 */
(( com.nobleempire.GunDisassembly2.NvEventQueueActivity ) p0 ).getPackageName ( ); // invoke-virtual {p0}, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;->getPackageName()Ljava/lang/String;
} // .end method
public Integer get_ram_free ( ) {
/* .locals 8 */
/* .prologue */
/* .line 886 */
/* new-instance v3, Landroid/app/ActivityManager$MemoryInfo; */
/* invoke-direct {v3}, Landroid/app/ActivityManager$MemoryInfo;-><init>()V */
/* .line 887 */
/* .local v3, "mi":Landroid/app/ActivityManager$MemoryInfo; */
final String v4 = "activity"; // const-string v4, "activity"
(( com.nobleempire.GunDisassembly2.NvEventQueueActivity ) p0 ).getSystemService ( v4 ); // invoke-virtual {p0, v4}, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v0, Landroid/app/ActivityManager; */
/* .line 888 */
/* .local v0, "activityManager":Landroid/app/ActivityManager; */
(( android.app.ActivityManager ) v0 ).getMemoryInfo ( v3 ); // invoke-virtual {v0, v3}, Landroid/app/ActivityManager;->getMemoryInfo(Landroid/app/ActivityManager$MemoryInfo;)V
/* .line 889 */
/* iget-wide v4, v3, Landroid/app/ActivityManager$MemoryInfo;->availMem:J */
/* const-wide/32 v6, 0x100000 */
/* div-long v1, v4, v6 */
/* .line 890 */
/* .local v1, "availableMegs":J */
/* long-to-int v4, v1 */
} // .end method
public java.lang.String get_settings_string ( java.lang.String p0 ) {
/* .locals 4 */
/* .param p1, "str" # Ljava/lang/String; */
/* .prologue */
/* .line 180 */
(( com.nobleempire.GunDisassembly2.NvEventQueueActivity ) p0 ).getContentResolver ( ); // invoke-virtual {p0}, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;->getContentResolver()Landroid/content/ContentResolver;
android.provider.Settings$Secure .getString ( v2,p1 );
/* .line 181 */
/* .local v1, "value":Ljava/lang/String; */
final String v2 = "android_id"; // const-string v2, "android_id"
v2 = (( java.lang.String ) p1 ).equals ( v2 ); // invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 182 */
(( com.nobleempire.GunDisassembly2.NvEventQueueActivity ) p0 ).getBaseContext ( ); // invoke-virtual {p0}, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;->getBaseContext()Landroid/content/Context;
final String v3 = "phone"; // const-string v3, "phone"
(( android.content.Context ) v2 ).getSystemService ( v3 ); // invoke-virtual {v2, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v0, Landroid/telephony/TelephonyManager; */
/* .line 183 */
/* .local v0, "tm":Landroid/telephony/TelephonyManager; */
/* new-instance v2, Ljava/lang/StringBuilder; */
java.lang.String .valueOf ( v1 );
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v3 = "-"; // const-string v3, "-"
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( android.telephony.TelephonyManager ) v0 ).getDeviceId ( ); // invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getDeviceId()Ljava/lang/String;
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 184 */
/* new-instance v2, Ljava/lang/StringBuilder; */
java.lang.String .valueOf ( v1 );
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v3 = "-"; // const-string v3, "-"
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( android.telephony.TelephonyManager ) v0 ).getSimSerialNumber ( ); // invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getSimSerialNumber()Ljava/lang/String;
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 186 */
} // .end local v0 # "tm":Landroid/telephony/TelephonyManager;
} // :cond_0
} // .end method
public java.lang.String get_user_email ( ) {
/* .locals 4 */
/* .prologue */
/* .line 933 */
android.accounts.AccountManager .get ( p0 );
/* .line 934 */
/* .local v0, "accountManager":Landroid/accounts/AccountManager; */
final String v2 = "com.google"; // const-string v2, "com.google"
(( android.accounts.AccountManager ) v0 ).getAccountsByType ( v2 ); // invoke-virtual {v0, v2}, Landroid/accounts/AccountManager;->getAccountsByType(Ljava/lang/String;)[Landroid/accounts/Account;
/* .line 935 */
/* .local v1, "accounts":[Landroid/accounts/Account; */
/* array-length v2, v1 */
/* if-nez v2, :cond_0 */
final String v2 = "NvEventQueueActivity.java"; // const-string v2, "NvEventQueueActivity.java"
final String v3 = "~~get_user_email(): no account"; // const-string v3, "~~get_user_email(): no account"
android.util.Log .v ( v2,v3 );
int v2 = 0; // const/4 v2, 0x0
/* .line 937 */
} // :goto_0
} // :cond_0
int v2 = 0; // const/4 v2, 0x0
/* aget-object v2, v1, v2 */
v2 = this.name;
} // .end method
public native Boolean init ( ) {
} // .end method
protected Boolean initEGL ( ) {
/* .locals 26 */
/* .prologue */
/* .line 605 */
final String v1 = "NvEventQueueActivity.java"; // const-string v1, "NvEventQueueActivity.java"
final String v2 = "~~$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$"; // const-string v2, "~~$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$"
android.util.Log .v ( v1,v2 );
/* .line 606 */
final String v1 = "NvEventQueueActivity.java"; // const-string v1, "NvEventQueueActivity.java"
final String v2 = "~~$$$ initEGL() $$$"; // const-string v2, "~~$$$ initEGL() $$$"
android.util.Log .v ( v1,v2 );
/* .line 607 */
final String v1 = "NvEventQueueActivity.java"; // const-string v1, "NvEventQueueActivity.java"
final String v2 = "~~$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$"; // const-string v2, "~~$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$"
android.util.Log .v ( v1,v2 );
/* .line 608 */
/* move-object/from16 v0, p0 */
v1 = this.configAttrs;
/* if-nez v1, :cond_0 */
/* .line 609 */
int v1 = 1; // const/4 v1, 0x1
/* new-array v1, v1, [I */
int v2 = 0; // const/4 v2, 0x0
/* const/16 v3, 0x3038 */
/* aput v3, v1, v2 */
/* move-object/from16 v0, p0 */
this.configAttrs = v1;
/* .line 611 */
} // :cond_0
/* move-object/from16 v0, p0 */
v0 = this.configAttrs;
/* move-object/from16 v17, v0 */
/* .line 612 */
/* .local v17, "oldConf":[I */
/* move-object/from16 v0, v17 */
/* array-length v1, v0 */
/* add-int/lit8 v1, v1, 0x3 */
/* add-int/lit8 v1, v1, -0x1 */
/* new-array v1, v1, [I */
/* move-object/from16 v0, p0 */
this.configAttrs = v1;
/* .line 613 */
int v14 = 0; // const/4 v14, 0x0
/* .line 614 */
/* .local v14, "i":I */
int v14 = 0; // const/4 v14, 0x0
} // :goto_0
/* move-object/from16 v0, v17 */
/* array-length v1, v0 */
/* add-int/lit8 v1, v1, -0x1 */
/* if-lt v14, v1, :cond_3 */
/* .line 617 */
/* move-object/from16 v0, p0 */
v1 = this.configAttrs;
/* add-int/lit8 v15, v14, 0x1 */
} // .end local v14 # "i":I
/* .local v15, "i":I */
/* const/16 v2, 0x3040 */
/* aput v2, v1, v14 */
/* .line 618 */
/* move-object/from16 v0, p0 */
v1 = this.configAttrs;
/* add-int/lit8 v14, v15, 0x1 */
} // .end local v15 # "i":I
/* .restart local v14 # "i":I */
int v2 = 4; // const/4 v2, 0x4
/* aput v2, v1, v15 */
/* .line 619 */
/* move-object/from16 v0, p0 */
v1 = this.configAttrs;
/* add-int/lit8 v15, v14, 0x1 */
} // .end local v14 # "i":I
/* .restart local v15 # "i":I */
/* const/16 v2, 0x3038 */
/* aput v2, v1, v14 */
/* .line 620 */
int v1 = 3; // const/4 v1, 0x3
/* new-array v1, v1, [I */
/* fill-array-data v1, :array_0 */
/* move-object/from16 v0, p0 */
this.contextAttrs = v1;
/* .line 621 */
/* move-object/from16 v0, p0 */
v1 = this.configAttrs;
/* if-nez v1, :cond_1 */
/* .line 622 */
int v1 = 1; // const/4 v1, 0x1
/* new-array v1, v1, [I */
int v2 = 0; // const/4 v2, 0x0
/* const/16 v3, 0x3038 */
/* aput v3, v1, v2 */
/* move-object/from16 v0, p0 */
this.configAttrs = v1;
/* .line 624 */
} // :cond_1
/* move-object/from16 v0, p0 */
v0 = this.configAttrs;
/* move-object/from16 v18, v0 */
/* .line 625 */
/* .local v18, "oldConfES2":[I */
/* move-object/from16 v0, v18 */
/* array-length v1, v0 */
/* add-int/lit8 v1, v1, 0xd */
/* add-int/lit8 v1, v1, -0x1 */
/* new-array v1, v1, [I */
/* move-object/from16 v0, p0 */
this.configAttrs = v1;
/* .line 626 */
int v14 = 0; // const/4 v14, 0x0
} // .end local v15 # "i":I
/* .restart local v14 # "i":I */
} // :goto_1
/* move-object/from16 v0, v18 */
/* array-length v1, v0 */
/* add-int/lit8 v1, v1, -0x1 */
/* if-lt v14, v1, :cond_4 */
/* .line 629 */
/* move-object/from16 v0, p0 */
v1 = this.configAttrs;
/* add-int/lit8 v15, v14, 0x1 */
} // .end local v14 # "i":I
/* .restart local v15 # "i":I */
/* const/16 v2, 0x3024 */
/* aput v2, v1, v14 */
/* move-object/from16 v0, p0 */
v1 = this.configAttrs;
/* add-int/lit8 v14, v15, 0x1 */
} // .end local v15 # "i":I
/* .restart local v14 # "i":I */
/* move-object/from16 v0, p0 */
/* iget v2, v0, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;->redSize:I */
/* aput v2, v1, v15 */
/* .line 630 */
/* move-object/from16 v0, p0 */
v1 = this.configAttrs;
/* add-int/lit8 v15, v14, 0x1 */
} // .end local v14 # "i":I
/* .restart local v15 # "i":I */
/* const/16 v2, 0x3023 */
/* aput v2, v1, v14 */
/* move-object/from16 v0, p0 */
v1 = this.configAttrs;
/* add-int/lit8 v14, v15, 0x1 */
} // .end local v15 # "i":I
/* .restart local v14 # "i":I */
/* move-object/from16 v0, p0 */
/* iget v2, v0, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;->greenSize:I */
/* aput v2, v1, v15 */
/* .line 631 */
/* move-object/from16 v0, p0 */
v1 = this.configAttrs;
/* add-int/lit8 v15, v14, 0x1 */
} // .end local v14 # "i":I
/* .restart local v15 # "i":I */
/* const/16 v2, 0x3022 */
/* aput v2, v1, v14 */
/* move-object/from16 v0, p0 */
v1 = this.configAttrs;
/* add-int/lit8 v14, v15, 0x1 */
} // .end local v15 # "i":I
/* .restart local v14 # "i":I */
/* move-object/from16 v0, p0 */
/* iget v2, v0, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;->blueSize:I */
/* aput v2, v1, v15 */
/* .line 632 */
/* move-object/from16 v0, p0 */
v1 = this.configAttrs;
/* add-int/lit8 v15, v14, 0x1 */
} // .end local v14 # "i":I
/* .restart local v15 # "i":I */
/* const/16 v2, 0x3021 */
/* aput v2, v1, v14 */
/* move-object/from16 v0, p0 */
v1 = this.configAttrs;
/* add-int/lit8 v14, v15, 0x1 */
} // .end local v15 # "i":I
/* .restart local v14 # "i":I */
/* move-object/from16 v0, p0 */
/* iget v2, v0, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;->alphaSize:I */
/* aput v2, v1, v15 */
/* .line 633 */
/* move-object/from16 v0, p0 */
v1 = this.configAttrs;
/* add-int/lit8 v15, v14, 0x1 */
} // .end local v14 # "i":I
/* .restart local v15 # "i":I */
/* const/16 v2, 0x3026 */
/* aput v2, v1, v14 */
/* move-object/from16 v0, p0 */
v1 = this.configAttrs;
/* add-int/lit8 v14, v15, 0x1 */
} // .end local v15 # "i":I
/* .restart local v14 # "i":I */
/* move-object/from16 v0, p0 */
/* iget v2, v0, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;->stencilSize:I */
/* aput v2, v1, v15 */
/* .line 634 */
/* move-object/from16 v0, p0 */
v1 = this.configAttrs;
/* add-int/lit8 v15, v14, 0x1 */
} // .end local v14 # "i":I
/* .restart local v15 # "i":I */
/* const/16 v2, 0x3025 */
/* aput v2, v1, v14 */
/* move-object/from16 v0, p0 */
v1 = this.configAttrs;
/* add-int/lit8 v14, v15, 0x1 */
} // .end local v15 # "i":I
/* .restart local v14 # "i":I */
/* move-object/from16 v0, p0 */
/* iget v2, v0, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;->depthSize:I */
/* aput v2, v1, v15 */
/* .line 635 */
/* move-object/from16 v0, p0 */
v1 = this.configAttrs;
/* add-int/lit8 v15, v14, 0x1 */
} // .end local v14 # "i":I
/* .restart local v15 # "i":I */
/* const/16 v2, 0x3038 */
/* aput v2, v1, v14 */
/* .line 636 */
javax.microedition.khronos.egl.EGLContext .getEGL ( );
/* check-cast v1, Ljavax/microedition/khronos/egl/EGL10; */
/* move-object/from16 v0, p0 */
this.egl = v1;
/* .line 637 */
/* move-object/from16 v0, p0 */
v1 = this.egl;
/* .line 638 */
/* move-object/from16 v0, p0 */
v1 = this.egl;
v2 = javax.microedition.khronos.egl.EGL10.EGL_DEFAULT_DISPLAY;
/* move-object/from16 v0, p0 */
this.eglDisplay = v1;
/* .line 639 */
/* move-object/from16 v0, p0 */
v12 = v1 = this.egl;
/* .line 640 */
/* .local v12, "eglErr":I */
/* const/16 v1, 0x3000 */
/* if-eq v12, v1, :cond_2 */
/* .line 641 */
final String v1 = "NvEventQueueActivity.java"; // const-string v1, "NvEventQueueActivity.java"
/* new-instance v2, Ljava/lang/StringBuilder; */
final String v3 = "~~eglDisplay: "; // const-string v3, "~~eglDisplay: "
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* move-object/from16 v0, p0 */
v3 = this.eglDisplay;
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v3 = ", err: "; // const-string v3, ", err: "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( v12 ); // invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .e ( v1,v2 );
/* .line 643 */
} // :cond_2
int v1 = 2; // const/4 v1, 0x2
/* new-array v0, v1, [I */
/* move-object/from16 v24, v0 */
/* .line 644 */
/* .local v24, "version":[I */
/* move-object/from16 v0, p0 */
v1 = this.egl;
/* move-object/from16 v0, p0 */
v2 = this.eglDisplay;
v20 = /* move-object/from16 v0, v24 */
/* .line 645 */
/* .local v20, "ret":Z */
final String v1 = "NvEventQueueActivity.java"; // const-string v1, "NvEventQueueActivity.java"
/* new-instance v2, Ljava/lang/StringBuilder; */
final String v3 = "~~EglInitialize returned: "; // const-string v3, "~~EglInitialize returned: "
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* move/from16 v0, v20 */
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .v ( v1,v2 );
/* .line 646 */
/* if-nez v20, :cond_5 */
/* .line 647 */
int v1 = 0; // const/4 v1, 0x0
/* move v14, v15 */
/* .line 706 */
} // .end local v15 # "i":I
/* .restart local v14 # "i":I */
} // :goto_2
/* .line 615 */
} // .end local v12 # "eglErr":I
} // .end local v18 # "oldConfES2":[I
} // .end local v20 # "ret":Z
} // .end local v24 # "version":[I
} // :cond_3
/* move-object/from16 v0, p0 */
v1 = this.configAttrs;
/* aget v2, v17, v14 */
/* aput v2, v1, v14 */
/* .line 614 */
/* add-int/lit8 v14, v14, 0x1 */
/* goto/16 :goto_0 */
/* .line 627 */
/* .restart local v18 # "oldConfES2":[I */
} // :cond_4
/* move-object/from16 v0, p0 */
v1 = this.configAttrs;
/* aget v2, v18, v14 */
/* aput v2, v1, v14 */
/* .line 626 */
/* add-int/lit8 v14, v14, 0x1 */
/* goto/16 :goto_1 */
/* .line 649 */
} // .end local v14 # "i":I
/* .restart local v12 # "eglErr":I */
/* .restart local v15 # "i":I */
/* .restart local v20 # "ret":Z */
/* .restart local v24 # "version":[I */
} // :cond_5
/* move-object/from16 v0, p0 */
v12 = v1 = this.egl;
/* .line 650 */
/* const/16 v1, 0x3000 */
/* if-eq v12, v1, :cond_6 */
/* .line 651 */
final String v1 = "NvEventQueueActivity.java"; // const-string v1, "NvEventQueueActivity.java"
/* new-instance v2, Ljava/lang/StringBuilder; */
final String v3 = "~~*** eglInitialize err: "; // const-string v3, "~~*** eglInitialize err: "
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v2 ).append ( v12 ); // invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .e ( v1,v2 );
/* .line 652 */
int v1 = 0; // const/4 v1, 0x0
/* move v14, v15 */
} // .end local v15 # "i":I
/* .restart local v14 # "i":I */
/* .line 654 */
} // .end local v14 # "i":I
/* .restart local v15 # "i":I */
} // :cond_6
/* const/16 v1, 0x14 */
/* new-array v4, v1, [Ljavax/microedition/khronos/egl/EGLConfig; */
/* .line 655 */
/* .local v4, "config":[Ljavax/microedition/khronos/egl/EGLConfig; */
int v1 = 1; // const/4 v1, 0x1
/* new-array v6, v1, [I */
/* .line 656 */
/* .local v6, "num_configs":[I */
/* move-object/from16 v0, p0 */
v1 = this.egl;
/* move-object/from16 v0, p0 */
v2 = this.eglDisplay;
/* move-object/from16 v0, p0 */
v3 = this.configAttrs;
/* array-length v5, v4 */
/* invoke-interface/range {v1 ..v6}, Ljavax/microedition/khronos/egl/EGL10;->eglChooseConfig(Ljavax/microedition/khronos/egl/EGLDisplay;[I[Ljavax/microedition/khronos/egl/EGLConfig;I[I)Z */
/* .line 657 */
/* move-object/from16 v0, p0 */
v12 = v1 = this.egl;
/* .line 658 */
/* const/16 v1, 0x3000 */
/* if-eq v12, v1, :cond_7 */
/* .line 659 */
final String v1 = "NvEventQueueActivity.java"; // const-string v1, "NvEventQueueActivity.java"
/* new-instance v2, Ljava/lang/StringBuilder; */
final String v3 = "~~eglChooseConfig err: "; // const-string v3, "~~eglChooseConfig err: "
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v2 ).append ( v12 ); // invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .e ( v1,v2 );
/* .line 661 */
} // :cond_7
/* const/high16 v22, 0x1000000 */
/* .line 662 */
/* .local v22, "score":I */
int v1 = 1; // const/4 v1, 0x1
/* new-array v0, v1, [I */
/* move-object/from16 v23, v0 */
/* .line 663 */
/* .local v23, "val":[I */
int v14 = 0; // const/4 v14, 0x0
} // .end local v15 # "i":I
/* .restart local v14 # "i":I */
} // :goto_3
int v1 = 0; // const/4 v1, 0x0
/* aget v1, v6, v1 */
/* if-lt v14, v1, :cond_8 */
/* .line 698 */
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
/* .line 699 */
/* move-object/from16 v0, p0 */
v12 = v1 = this.egl;
/* .line 700 */
/* const/16 v1, 0x3000 */
/* if-eq v12, v1, :cond_e */
/* .line 701 */
final String v1 = "NvEventQueueActivity.java"; // const-string v1, "NvEventQueueActivity.java"
/* new-instance v2, Ljava/lang/StringBuilder; */
final String v3 = "~~eglCreateContext: "; // const-string v3, "~~eglCreateContext: "
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v2 ).append ( v12 ); // invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .e ( v1,v2 );
/* .line 705 */
} // :goto_4
/* move-object/from16 v0, p0 */
v1 = this.eglContext;
(( javax.microedition.khronos.egl.EGLContext ) v1 ).getGL ( ); // invoke-virtual {v1}, Ljavax/microedition/khronos/egl/EGLContext;->getGL()Ljavax/microedition/khronos/opengles/GL;
/* check-cast v1, Ljavax/microedition/khronos/opengles/GL11; */
/* move-object/from16 v0, p0 */
this.gl = v1;
/* .line 706 */
int v1 = 1; // const/4 v1, 0x1
/* goto/16 :goto_2 */
/* .line 664 */
} // :cond_8
int v9 = 1; // const/4 v9, 0x1
/* .line 665 */
/* .local v9, "cont":Z */
int v10 = 0; // const/4 v10, 0x0
/* .line 667 */
/* .local v10, "currScore":I */
/* const/16 v16, 0x0 */
/* .local v16, "j":I */
} // :goto_5
/* move-object/from16 v0, v17 */
/* array-length v1, v0 */
/* add-int/lit8 v1, v1, -0x1 */
/* shr-int/lit8 v1, v1, 0x1 */
/* move/from16 v0, v16 */
/* if-lt v0, v1, :cond_a */
/* .line 674 */
} // :goto_6
/* if-nez v9, :cond_c */
/* .line 663 */
} // :cond_9
} // :goto_7
/* add-int/lit8 v14, v14, 0x1 */
/* .line 668 */
} // :cond_a
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
/* .line 669 */
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
/* if-eq v1, v2, :cond_b */
/* .line 670 */
int v9 = 0; // const/4 v9, 0x0
/* .line 671 */
/* .line 667 */
} // :cond_b
/* add-int/lit8 v16, v16, 0x1 */
/* .line 675 */
} // :cond_c
/* move-object/from16 v0, p0 */
v1 = this.egl;
/* move-object/from16 v0, p0 */
v2 = this.eglDisplay;
/* aget-object v3, v4, v14 */
/* const/16 v5, 0x3024 */
/* move-object/from16 v0, v23 */
int v1 = 0; // const/4 v1, 0x0
/* aget v19, v23, v1 */
/* .line 676 */
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
/* .line 677 */
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
/* .line 678 */
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
/* .line 679 */
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
/* .line 680 */
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
/* .line 682 */
/* .local v21, "s":I */
/* move-object/from16 v0, p0 */
/* iget v1, v0, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;->redSize:I */
/* sub-int v1, v19, v1 */
v1 = java.lang.Math .abs ( v1 );
/* move-object/from16 v0, p0 */
/* iget v2, v0, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;->greenSize:I */
/* sub-int v2, v13, v2 */
v2 = java.lang.Math .abs ( v2 );
/* add-int/2addr v1, v2 */
/* move-object/from16 v0, p0 */
/* iget v2, v0, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;->blueSize:I */
/* sub-int v2, v8, v2 */
v2 = java.lang.Math .abs ( v2 );
/* add-int/2addr v1, v2 */
/* move-object/from16 v0, p0 */
/* iget v2, v0, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;->alphaSize:I */
/* sub-int v2, v7, v2 */
v2 = java.lang.Math .abs ( v2 );
/* add-int/2addr v1, v2 */
/* shl-int/lit8 v10, v1, 0x10 */
/* .line 683 */
/* move-object/from16 v0, p0 */
/* iget v1, v0, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;->depthSize:I */
/* sub-int v1, v11, v1 */
v1 = java.lang.Math .abs ( v1 );
/* shl-int/lit8 v1, v1, 0x8 */
/* add-int/2addr v10, v1 */
/* .line 684 */
/* move-object/from16 v0, p0 */
/* iget v1, v0, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;->stencilSize:I */
/* sub-int v1, v21, v1 */
v1 = java.lang.Math .abs ( v1 );
/* add-int/2addr v10, v1 */
/* .line 685 */
/* move/from16 v0, v22 */
/* if-ge v10, v0, :cond_9 */
/* .line 688 */
/* const/16 v16, 0x0 */
} // :goto_8
/* move-object/from16 v0, p0 */
v1 = this.configAttrs;
/* array-length v1, v1 */
/* add-int/lit8 v1, v1, -0x1 */
/* shr-int/lit8 v1, v1, 0x1 */
/* move/from16 v0, v16 */
/* if-lt v0, v1, :cond_d */
/* .line 694 */
/* move/from16 v22, v10 */
/* .line 695 */
/* aget-object v1, v4, v14 */
/* move-object/from16 v0, p0 */
this.eglConfig = v1;
/* goto/16 :goto_7 */
/* .line 689 */
} // :cond_d
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
/* .line 690 */
int v1 = 0; // const/4 v1, 0x0
/* aget v1, v23, v1 */
/* move-object/from16 v0, p0 */
v1 = this.configAttrs;
/* mul-int/lit8 v2, v16, 0x2 */
/* add-int/lit8 v2, v2, 0x1 */
/* aget v1, v1, v2 */
/* .line 688 */
/* add-int/lit8 v16, v16, 0x1 */
/* .line 703 */
} // .end local v7 # "a":I
} // .end local v8 # "b":I
} // .end local v9 # "cont":Z
} // .end local v10 # "currScore":I
} // .end local v11 # "d":I
} // .end local v13 # "g":I
} // .end local v16 # "j":I
} // .end local v19 # "r":I
} // .end local v21 # "s":I
} // :cond_e
final String v1 = "NvEventQueueActivity.java"; // const-string v1, "NvEventQueueActivity.java"
/* new-instance v2, Ljava/lang/StringBuilder; */
final String v3 = "~~eglContext = "; // const-string v3, "~~eglContext = "
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* move-object/from16 v0, p0 */
v3 = this.eglContext;
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .v ( v1,v2 );
/* goto/16 :goto_4 */
/* .line 620 */
/* nop */
/* :array_0 */
/* .array-data 4 */
/* 0x3098 */
/* 0x2 */
/* 0x3038 */
} // .end array-data
} // .end method
public native Boolean keyEvent ( Integer p0, Integer p1, Integer p2, android.view.KeyEvent p3 ) {
} // .end method
public void kill_self ( ) {
/* .locals 4 */
/* .prologue */
/* .line 900 */
final String v1 = "NvEventQueueActivity.java"; // const-string v1, "NvEventQueueActivity.java"
final String v2 = "~~****************** KILLING SELF ******************"; // const-string v2, "~~****************** KILLING SELF ******************"
android.util.Log .v ( v1,v2 );
/* .line 902 */
final String v1 = "NvEventQueueActivity.java"; // const-string v1, "NvEventQueueActivity.java"
final String v2 = "~~ aquiring process id"; // const-string v2, "~~ aquiring process id"
android.util.Log .v ( v1,v2 );
/* .line 903 */
v0 = android.os.Process .myPid ( );
/* .line 904 */
/* .local v0, "pid":I */
final String v1 = "NvEventQueueActivity.java"; // const-string v1, "NvEventQueueActivity.java"
/* new-instance v2, Ljava/lang/StringBuilder; */
final String v3 = "~~ pid = "; // const-string v3, "~~ pid = "
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .v ( v1,v2 );
/* .line 905 */
android.os.Process .killProcess ( v0 );
/* .line 906 */
return;
} // .end method
public Boolean makeCurrent ( ) {
/* .locals 6 */
/* .prologue */
int v0 = 0; // const/4 v0, 0x0
/* .line 748 */
final String v1 = "NvEventQueueActivity.java"; // const-string v1, "NvEventQueueActivity.java"
final String v2 = "~~make Current"; // const-string v2, "~~make Current"
android.util.Log .v ( v1,v2 );
/* .line 749 */
v1 = this.eglContext;
/* if-nez v1, :cond_0 */
/* .line 750 */
final String v1 = "NvEventQueueActivity.java"; // const-string v1, "NvEventQueueActivity.java"
final String v2 = "~~eglContext is NULL"; // const-string v2, "~~eglContext is NULL"
android.util.Log .v ( v1,v2 );
/* .line 761 */
} // :goto_0
/* .line 753 */
} // :cond_0
v1 = this.eglSurface;
/* if-nez v1, :cond_1 */
/* .line 754 */
final String v1 = "NvEventQueueActivity.java"; // const-string v1, "NvEventQueueActivity.java"
final String v2 = "~~eglSurface is NULL"; // const-string v2, "~~eglSurface is NULL"
android.util.Log .v ( v1,v2 );
/* .line 756 */
} // :cond_1
v1 = this.egl;
v2 = this.eglDisplay;
v3 = this.eglSurface;
v4 = this.eglSurface;
v1 = v5 = this.eglContext;
/* if-nez v1, :cond_2 */
/* .line 757 */
final String v1 = "NvEventQueueActivity.java"; // const-string v1, "NvEventQueueActivity.java"
/* new-instance v2, Ljava/lang/StringBuilder; */
final String v3 = "~~eglMakeCurrent err: "; // const-string v3, "~~eglMakeCurrent err: "
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v3 = v3 = this.egl;
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .e ( v1,v2 );
/* .line 758 */
(( com.nobleempire.GunDisassembly2.NvEventQueueActivity ) p0 ).kill_self ( ); // invoke-virtual {p0}, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;->kill_self()V
/* .line 761 */
} // :cond_2
int v0 = 1; // const/4 v0, 0x1
} // .end method
public native Boolean multiTouchEvent ( Integer p0, Integer p1, Integer p2, Integer p3, Integer p4, Integer p5, android.view.MotionEvent p6 ) {
} // .end method
public native void nvInputBoxHandler ( Integer p0, Integer p1, java.lang.String p2 ) {
} // .end method
public void onAccuracyChanged ( android.hardware.Sensor p0, Integer p1 ) {
/* .locals 0 */
/* .param p1, "sensor" # Landroid/hardware/Sensor; */
/* .param p2, "accuracy" # I */
/* .prologue */
/* .line 416 */
return;
} // .end method
public void onConfigurationChanged ( android.content.res.Configuration p0 ) {
/* .locals 2 */
/* .param p1, "newConfig" # Landroid/content/res/Configuration; */
/* .prologue */
/* .line 359 */
final String v0 = "NvEventQueueActivity.java"; // const-string v0, "NvEventQueueActivity.java"
final String v1 = "~~**** onConfigurationChanged ****************************************************************"; // const-string v1, "~~**** onConfigurationChanged ****************************************************************"
android.util.Log .v ( v0,v1 );
/* .line 360 */
/* invoke-super {p0, p1}, Landroid/app/Activity;->onConfigurationChanged(Landroid/content/res/Configuration;)V */
/* .line 361 */
return;
} // .end method
public void onCreate ( android.os.Bundle p0 ) {
/* .locals 4 */
/* .param p1, "savedInstanceState" # Landroid/os/Bundle; */
/* .prologue */
/* .line 260 */
final String v2 = "NvEventQueueActivity.java"; // const-string v2, "NvEventQueueActivity.java"
final String v3 = "~~**** onCreate ****************************************************************"; // const-string v3, "~~**** onCreate ****************************************************************"
android.util.Log .v ( v2,v3 );
/* .line 261 */
/* invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V */
/* .line 262 */
/* iget-boolean v2, p0, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;->supportPauseResume:Z */
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 263 */
(( com.nobleempire.GunDisassembly2.NvEventQueueActivity ) p0 ).init ( ); // invoke-virtual {p0}, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;->init()Z
/* .line 265 */
} // :cond_0
/* new-instance v2, Landroid/os/Handler; */
/* invoke-direct {v2}, Landroid/os/Handler;-><init>()V */
this.handler = v2;
/* .line 266 */
/* iget-boolean v2, p0, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;->wantsAccelerometer:Z */
if ( v2 != null) { // if-eqz v2, :cond_1
v2 = this.mSensorManager;
/* if-nez v2, :cond_1 */
/* .line 267 */
final String v2 = "sensor"; // const-string v2, "sensor"
(( com.nobleempire.GunDisassembly2.NvEventQueueActivity ) p0 ).getSystemService ( v2 ); // invoke-virtual {p0, v2}, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v2, Landroid/hardware/SensorManager; */
this.mSensorManager = v2;
/* .line 269 */
} // :cond_1
com.nobleempire.GunDisassembly2.NvUtil .getInstance ( );
(( com.nobleempire.GunDisassembly2.NvUtil ) v2 ).setActivity ( p0 ); // invoke-virtual {v2, p0}, Lcom/nobleempire/GunDisassembly2/NvUtil;->setActivity(Landroid/app/Activity;)V
/* .line 270 */
com.nobleempire.GunDisassembly2.NvAPKFileHelper .getInstance ( );
(( com.nobleempire.GunDisassembly2.NvAPKFileHelper ) v2 ).setContext ( p0 ); // invoke-virtual {v2, p0}, Lcom/nobleempire/GunDisassembly2/NvAPKFileHelper;->setContext(Landroid/content/Context;)V
/* .line 271 */
com.nobleempire.GunDisassembly2.AudioHelper .getInstance ( );
(( com.nobleempire.GunDisassembly2.AudioHelper ) v2 ).setContext ( p0 ); // invoke-virtual {v2, p0}, Lcom/nobleempire/GunDisassembly2/AudioHelper;->setContext(Landroid/content/Context;)V
/* .line 272 */
final String v2 = "window"; // const-string v2, "window"
(( com.nobleempire.GunDisassembly2.NvEventQueueActivity ) p0 ).getSystemService ( v2 ); // invoke-virtual {p0, v2}, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v2, Landroid/view/WindowManager; */
this.display = v2;
/* .line 273 */
(( com.nobleempire.GunDisassembly2.NvEventQueueActivity ) p0 ).systemInit ( ); // invoke-virtual {p0}, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;->systemInit()Z
/* .line 275 */
/* new-instance v0, Landroid/content/IntentFilter; */
final String v2 = "android.intent.action.SCREEN_ON"; // const-string v2, "android.intent.action.SCREEN_ON"
/* invoke-direct {v0, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V */
/* .line 276 */
/* .local v0, "filter":Landroid/content/IntentFilter; */
final String v2 = "android.intent.action.SCREEN_OFF"; // const-string v2, "android.intent.action.SCREEN_OFF"
(( android.content.IntentFilter ) v0 ).addAction ( v2 ); // invoke-virtual {v0, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V
/* .line 277 */
final String v2 = "android.intent.action.USER_PRESENT"; // const-string v2, "android.intent.action.USER_PRESENT"
(( android.content.IntentFilter ) v0 ).addAction ( v2 ); // invoke-virtual {v0, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V
/* .line 278 */
final String v2 = "android.intent.action.MAIN"; // const-string v2, "android.intent.action.MAIN"
(( android.content.IntentFilter ) v0 ).addAction ( v2 ); // invoke-virtual {v0, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V
/* .line 279 */
/* new-instance v1, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity$ScreenReceiver; */
/* invoke-direct {v1, p0}, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity$ScreenReceiver;-><init>(Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;)V */
/* .line 280 */
/* .local v1, "mReceiver":Landroid/content/BroadcastReceiver; */
(( com.nobleempire.GunDisassembly2.NvEventQueueActivity ) p0 ).registerReceiver ( v1, v0 ); // invoke-virtual {p0, v1, v0}, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
/* .line 282 */
/* new-instance v2, Landroid/os/Handler; */
/* invoke-direct {v2}, Landroid/os/Handler;-><init>()V */
this.mHandler = v2;
/* .line 283 */
/* new-instance v2, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity$DungeonsPurchaseObserver; */
v3 = this.mHandler;
/* invoke-direct {v2, p0, v3}, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity$DungeonsPurchaseObserver;-><init>(Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;Landroid/os/Handler;)V */
this.mDungeonsPurchaseObserver = v2;
/* .line 284 */
/* new-instance v2, Lcom/nobleempire/GunDisassembly2/BillingService; */
/* invoke-direct {v2}, Lcom/nobleempire/GunDisassembly2/BillingService;-><init>()V */
this.mBillingService = v2;
/* .line 285 */
v2 = this.mBillingService;
(( com.nobleempire.GunDisassembly2.BillingService ) v2 ).setContext ( p0 ); // invoke-virtual {v2, p0}, Lcom/nobleempire/GunDisassembly2/BillingService;->setContext(Landroid/content/Context;)V
/* .line 286 */
v2 = this.mDungeonsPurchaseObserver;
com.nobleempire.GunDisassembly2.ResponseHandler .register ( v2 );
/* .line 287 */
v2 = this.mBillingService;
(( com.nobleempire.GunDisassembly2.BillingService ) v2 ).checkBillingSupported ( ); // invoke-virtual {v2}, Lcom/nobleempire/GunDisassembly2/BillingService;->checkBillingSupported()Z
/* .line 290 */
return;
} // .end method
public void onDestroy ( ) {
/* .locals 3 */
/* .prologue */
/* .line 382 */
final String v0 = "NvEventQueueActivity.java"; // const-string v0, "NvEventQueueActivity.java"
/* new-instance v1, Ljava/lang/StringBuilder; */
final String v2 = "~~**** onDestroy.isFinishing() = "; // const-string v2, "~~**** onDestroy.isFinishing() = "
/* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v2 = (( com.nobleempire.GunDisassembly2.NvEventQueueActivity ) p0 ).isFinishing ( ); // invoke-virtual {p0}, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;->isFinishing()Z
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
final String v2 = " ****************************************************************"; // const-string v2, " ****************************************************************"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .v ( v0,v1 );
/* .line 383 */
/* iget-boolean v0, p0, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;->supportPauseResume:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 384 */
(( com.nobleempire.GunDisassembly2.NvEventQueueActivity ) p0 ).quitAndWait ( ); // invoke-virtual {p0}, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;->quitAndWait()V
/* .line 385 */
(( com.nobleempire.GunDisassembly2.NvEventQueueActivity ) p0 ).finish ( ); // invoke-virtual {p0}, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;->finish()V
/* .line 387 */
} // :cond_0
/* invoke-super {p0}, Landroid/app/Activity;->onDestroy()V */
/* .line 388 */
(( com.nobleempire.GunDisassembly2.NvEventQueueActivity ) p0 ).systemCleanup ( ); // invoke-virtual {p0}, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;->systemCleanup()V
/* .line 389 */
v0 = this.mBillingService;
(( com.nobleempire.GunDisassembly2.BillingService ) v0 ).unbind ( ); // invoke-virtual {v0}, Lcom/nobleempire/GunDisassembly2/BillingService;->unbind()V
/* .line 390 */
return;
} // .end method
public Boolean onKeyDown ( Integer p0, android.view.KeyEvent p1 ) {
/* .locals 4 */
/* .param p1, "keyCode" # I */
/* .param p2, "event" # Landroid/view/KeyEvent; */
/* .prologue */
/* .line 462 */
/* const/16 v1, 0x18 */
/* if-eq p1, v1, :cond_0 */
/* const/16 v1, 0x19 */
/* if-ne p1, v1, :cond_2 */
/* .line 463 */
} // :cond_0
v0 = /* invoke-super {p0, p1, p2}, Landroid/app/Activity;->onKeyDown(ILandroid/view/KeyEvent;)Z */
/* .line 472 */
} // :cond_1
} // :goto_0
/* .line 467 */
} // :cond_2
v1 = (( android.view.KeyEvent ) p2 ).getAction ( ); // invoke-virtual {p2}, Landroid/view/KeyEvent;->getAction()I
v2 = (( android.view.KeyEvent ) p2 ).getUnicodeChar ( ); // invoke-virtual {p2}, Landroid/view/KeyEvent;->getUnicodeChar()I
v0 = (( com.nobleempire.GunDisassembly2.NvEventQueueActivity ) p0 ).keyEvent ( v1, p1, v2, p2 ); // invoke-virtual {p0, v1, p1, v2, p2}, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;->keyEvent(IIILandroid/view/KeyEvent;)Z
/* .line 468 */
/* .local v0, "ret":Z */
/* if-nez v0, :cond_1 */
/* .line 469 */
final String v1 = "NvEventQueueActivity.java"; // const-string v1, "NvEventQueueActivity.java"
/* new-instance v2, Ljava/lang/StringBuilder; */
final String v3 = "~~app can\'t handle keycode "; // const-string v3, "~~app can\'t handle keycode "
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v2 ).append ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v3 = "..calling super...."; // const-string v3, "..calling super...."
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .v ( v1,v2 );
/* .line 470 */
v0 = /* invoke-super {p0, p1, p2}, Landroid/app/Activity;->onKeyDown(ILandroid/view/KeyEvent;)Z */
} // .end method
public Boolean onKeyUp ( Integer p0, android.view.KeyEvent p1 ) {
/* .locals 3 */
/* .param p1, "keyCode" # I */
/* .param p2, "event" # Landroid/view/KeyEvent; */
/* .prologue */
/* .line 479 */
v0 = /* invoke-super {p0, p1, p2}, Landroid/app/Activity;->onKeyUp(ILandroid/view/KeyEvent;)Z */
/* .line 480 */
/* .local v0, "ret":Z */
/* if-nez v0, :cond_0 */
/* .line 481 */
v1 = (( android.view.KeyEvent ) p2 ).getAction ( ); // invoke-virtual {p2}, Landroid/view/KeyEvent;->getAction()I
v2 = (( android.view.KeyEvent ) p2 ).getUnicodeChar ( ); // invoke-virtual {p2}, Landroid/view/KeyEvent;->getUnicodeChar()I
v0 = (( com.nobleempire.GunDisassembly2.NvEventQueueActivity ) p0 ).keyEvent ( v1, p1, v2, p2 ); // invoke-virtual {p0, v1, p1, v2, p2}, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;->keyEvent(IIILandroid/view/KeyEvent;)Z
/* .line 483 */
} // :cond_0
} // .end method
protected void onNewIntent ( android.content.Intent p0 ) {
/* .locals 2 */
/* .param p1, "intent" # Landroid/content/Intent; */
/* .prologue */
/* .line 409 */
final String v0 = "NvEventQueueActivity.java"; // const-string v0, "NvEventQueueActivity.java"
final String v1 = "~~*** onNewIntent **********************************************"; // const-string v1, "~~*** onNewIntent **********************************************"
android.util.Log .v ( v0,v1 );
/* .line 410 */
/* invoke-super {p0, p1}, Landroid/app/Activity;->onNewIntent(Landroid/content/Intent;)V */
/* .line 411 */
return;
} // .end method
protected void onPause ( ) {
/* .locals 2 */
/* .prologue */
/* .line 345 */
final String v0 = "NvEventQueueActivity.java"; // const-string v0, "NvEventQueueActivity.java"
final String v1 = "~~**** onPause ****************************************************************"; // const-string v1, "~~**** onPause ****************************************************************"
android.util.Log .v ( v0,v1 );
/* .line 346 */
/* invoke-super {p0}, Landroid/app/Activity;->onPause()V */
/* .line 347 */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;->paused:Z */
/* .line 348 */
/* iget-boolean v0, p0, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;->supportPauseResume:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 349 */
final String v0 = "NvEventQueueActivity.java"; // const-string v0, "NvEventQueueActivity.java"
final String v1 = "~~java is invoking pauseEvent(), this will block until the client calls NVEventPause processed"; // const-string v1, "~~java is invoking pauseEvent(), this will block until the client calls NVEventPause processed"
android.util.Log .v ( v0,v1 );
/* .line 350 */
(( com.nobleempire.GunDisassembly2.NvEventQueueActivity ) p0 ).pauseEvent ( ); // invoke-virtual {p0}, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;->pauseEvent()V
/* .line 351 */
final String v0 = "NvEventQueueActivity.java"; // const-string v0, "NvEventQueueActivity.java"
final String v1 = "~~pauseEvent() returned"; // const-string v1, "~~pauseEvent() returned"
android.util.Log .v ( v0,v1 );
/* .line 356 */
} // :goto_0
return;
/* .line 353 */
} // :cond_0
(( com.nobleempire.GunDisassembly2.NvEventQueueActivity ) p0 ).quitAndWait ( ); // invoke-virtual {p0}, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;->quitAndWait()V
/* .line 354 */
(( com.nobleempire.GunDisassembly2.NvEventQueueActivity ) p0 ).finish ( ); // invoke-virtual {p0}, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;->finish()V
} // .end method
protected void onPostCreate ( android.os.Bundle p0 ) {
/* .locals 2 */
/* .param p1, "savedInstanceState" # Landroid/os/Bundle; */
/* .prologue */
/* .line 328 */
final String v0 = "NvEventQueueActivity.java"; // const-string v0, "NvEventQueueActivity.java"
final String v1 = "~~**** onPostCreate ****************************************************************"; // const-string v1, "~~**** onPostCreate ****************************************************************"
android.util.Log .v ( v0,v1 );
/* .line 329 */
/* invoke-super {p0, p1}, Landroid/app/Activity;->onPostCreate(Landroid/os/Bundle;)V */
/* .line 330 */
return;
} // .end method
protected void onPostResume ( ) {
/* .locals 2 */
/* .prologue */
/* .line 333 */
final String v0 = "NvEventQueueActivity.java"; // const-string v0, "NvEventQueueActivity.java"
final String v1 = "~~**** onPostResume ****************************************************************"; // const-string v1, "~~**** onPostResume ****************************************************************"
android.util.Log .v ( v0,v1 );
/* .line 334 */
/* invoke-super {p0}, Landroid/app/Activity;->onPostResume()V */
/* .line 335 */
return;
} // .end method
protected void onRestart ( ) {
/* .locals 2 */
/* .prologue */
/* .line 339 */
final String v0 = "NvEventQueueActivity.java"; // const-string v0, "NvEventQueueActivity.java"
final String v1 = "~~**** onRestart ****************************************************************"; // const-string v1, "~~**** onRestart ****************************************************************"
android.util.Log .v ( v0,v1 );
/* .line 340 */
/* invoke-super {p0}, Landroid/app/Activity;->onRestart()V */
/* .line 341 */
return;
} // .end method
protected void onRestoreInstanceState ( android.os.Bundle p0 ) {
/* .locals 2 */
/* .param p1, "savedInstanceState" # Landroid/os/Bundle; */
/* .prologue */
/* .line 401 */
final String v0 = "NvEventQueueActivity.java"; // const-string v0, "NvEventQueueActivity.java"
final String v1 = "~~*** onRestoreInstanceState **********************************************"; // const-string v1, "~~*** onRestoreInstanceState **********************************************"
android.util.Log .v ( v0,v1 );
/* .line 402 */
/* invoke-super {p0, p1}, Landroid/app/Activity;->onRestoreInstanceState(Landroid/os/Bundle;)V */
/* .line 406 */
return;
} // .end method
protected void onResume ( ) {
/* .locals 5 */
/* .prologue */
int v0 = 1; // const/4 v0, 0x1
int v1 = 0; // const/4 v1, 0x0
/* .line 309 */
final String v2 = "NvEventQueueActivity.java"; // const-string v2, "NvEventQueueActivity.java"
final String v3 = "~~**** onResume ****************************************************************"; // const-string v3, "~~**** onResume ****************************************************************"
android.util.Log .v ( v2,v3 );
/* .line 310 */
/* invoke-super {p0}, Landroid/app/Activity;->onResume()V */
/* .line 311 */
v2 = this.mSensorManager;
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 312 */
v2 = this.mSensorManager;
v3 = this.mSensorManager;
(( android.hardware.SensorManager ) v3 ).getDefaultSensor ( v0 ); // invoke-virtual {v3, v0}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;
/* iget v4, p0, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;->mSensorDelay:I */
(( android.hardware.SensorManager ) v2 ).registerListener ( p0, v3, v4 ); // invoke-virtual {v2, p0, v3, v4}, Landroid/hardware/SensorManager;->registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z
/* .line 314 */
} // :cond_0
/* iget-boolean v2, p0, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;->paused:Z */
if ( v2 != null) { // if-eqz v2, :cond_2
/* iget-boolean v2, p0, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;->surface_was_destroyed:Z */
/* if-nez v2, :cond_2 */
/* iget-boolean v2, p0, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;->surface_was_created:Z */
if ( v2 != null) { // if-eqz v2, :cond_2
/* .line 315 */
/* .local v0, "paused_without_stopping":Z */
} // :goto_0
/* iput-boolean v1, p0, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;->paused:Z */
/* .line 316 */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 317 */
final String v1 = "NvEventQueueActivity.java"; // const-string v1, "NvEventQueueActivity.java"
final String v2 = "~~!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!"; // const-string v2, "~~!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!"
android.util.Log .v ( v1,v2 );
/* .line 318 */
final String v1 = "NvEventQueueActivity.java"; // const-string v1, "NvEventQueueActivity.java"
final String v2 = "~~!!!!!!!!!!!! App was paused without stopping !!!!!!!!!!!!"; // const-string v2, "~~!!!!!!!!!!!! App was paused without stopping !!!!!!!!!!!!"
android.util.Log .v ( v1,v2 );
/* .line 319 */
final String v1 = "NvEventQueueActivity.java"; // const-string v1, "NvEventQueueActivity.java"
final String v2 = "~~!!!!!!!!!!!! destroying surface"; // const-string v2, "~~!!!!!!!!!!!! destroying surface"
android.util.Log .v ( v1,v2 );
/* .line 320 */
(( com.nobleempire.GunDisassembly2.NvEventQueueActivity ) p0 ).destroyEGLSurface ( ); // invoke-virtual {p0}, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;->destroyEGLSurface()V
/* .line 321 */
final String v1 = "NvEventQueueActivity.java"; // const-string v1, "NvEventQueueActivity.java"
final String v2 = "~~!!!!!!!!!!!! sending resume event"; // const-string v2, "~~!!!!!!!!!!!! sending resume event"
android.util.Log .v ( v1,v2 );
/* .line 322 */
(( com.nobleempire.GunDisassembly2.NvEventQueueActivity ) p0 ).resumeEvent ( ); // invoke-virtual {p0}, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;->resumeEvent()V
/* .line 323 */
final String v1 = "NvEventQueueActivity.java"; // const-string v1, "NvEventQueueActivity.java"
final String v2 = "~~!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!"; // const-string v2, "~~!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!"
android.util.Log .v ( v1,v2 );
/* .line 325 */
} // :cond_1
return;
} // .end local v0 # "paused_without_stopping":Z
} // :cond_2
/* move v0, v1 */
/* .line 314 */
} // .end method
protected void onSaveInstanceState ( android.os.Bundle p0 ) {
/* .locals 2 */
/* .param p1, "outState" # Landroid/os/Bundle; */
/* .prologue */
/* .line 394 */
final String v0 = "NvEventQueueActivity.java"; // const-string v0, "NvEventQueueActivity.java"
final String v1 = "~~*** onSaveInstanceState **********************************************"; // const-string v1, "~~*** onSaveInstanceState **********************************************"
android.util.Log .v ( v0,v1 );
/* .line 395 */
/* invoke-super {p0, p1}, Landroid/app/Activity;->onSaveInstanceState(Landroid/os/Bundle;)V */
/* .line 397 */
return;
} // .end method
public void onSensorChanged ( android.hardware.SensorEvent p0 ) {
/* .locals 4 */
/* .param p1, "event" # Landroid/hardware/SensorEvent; */
/* .prologue */
int v2 = 1; // const/4 v2, 0x1
/* .line 421 */
v0 = this.sensor;
v0 = (( android.hardware.Sensor ) v0 ).getType ( ); // invoke-virtual {v0}, Landroid/hardware/Sensor;->getType()I
/* if-ne v0, v2, :cond_0 */
/* .line 422 */
v0 = this.values;
int v1 = 0; // const/4 v1, 0x0
/* aget v0, v0, v1 */
v1 = this.values;
/* aget v1, v1, v2 */
v2 = this.values;
int v3 = 2; // const/4 v3, 0x2
/* aget v2, v2, v3 */
(( com.nobleempire.GunDisassembly2.NvEventQueueActivity ) p0 ).accelerometerEvent ( v0, v1, v2 ); // invoke-virtual {p0, v0, v1, v2}, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;->accelerometerEvent(FFF)Z
/* .line 424 */
} // :cond_0
return;
} // .end method
protected void onStart ( ) {
/* .locals 3 */
/* .prologue */
/* .line 294 */
final String v0 = "NvEventQueueActivity.java"; // const-string v0, "NvEventQueueActivity.java"
/* new-instance v1, Ljava/lang/StringBuilder; */
final String v2 = "~~**** onStart "; // const-string v2, "~~**** onStart "
/* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v2 = " ****************************************************************"; // const-string v2, " ****************************************************************"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .v ( v0,v1 );
/* .line 295 */
/* invoke-super {p0}, Landroid/app/Activity;->onStart()V */
/* .line 296 */
/* add-int/lit8 v0, v0, 0x1 */
/* .line 304 */
v0 = this.mDungeonsPurchaseObserver;
com.nobleempire.GunDisassembly2.ResponseHandler .register ( v0 );
/* .line 305 */
return;
} // .end method
protected void onStop ( ) {
/* .locals 2 */
/* .prologue */
/* .line 366 */
final String v0 = "NvEventQueueActivity.java"; // const-string v0, "NvEventQueueActivity.java"
final String v1 = "~~**** onStop ****************************************************************"; // const-string v1, "~~**** onStop ****************************************************************"
android.util.Log .v ( v0,v1 );
/* .line 367 */
final String v0 = "NvEventQueueActivity.java"; // const-string v0, "NvEventQueueActivity.java"
final String v1 = "~~"; // const-string v1, "~~"
android.util.Log .v ( v0,v1 );
/* .line 368 */
final String v0 = "NvEventQueueActivity.java"; // const-string v0, "NvEventQueueActivity.java"
final String v1 = "~~"; // const-string v1, "~~"
android.util.Log .v ( v0,v1 );
/* .line 369 */
final String v0 = "NvEventQueueActivity.java"; // const-string v0, "NvEventQueueActivity.java"
final String v1 = "~~"; // const-string v1, "~~"
android.util.Log .v ( v0,v1 );
/* .line 370 */
final String v0 = "NvEventQueueActivity.java"; // const-string v0, "NvEventQueueActivity.java"
final String v1 = "~~"; // const-string v1, "~~"
android.util.Log .v ( v0,v1 );
/* .line 371 */
v0 = this.mSensorManager;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.mSensorManager;
(( android.hardware.SensorManager ) v0 ).unregisterListener ( p0 ); // invoke-virtual {v0, p0}, Landroid/hardware/SensorManager;->unregisterListener(Landroid/hardware/SensorEventListener;)V
/* .line 372 */
} // :cond_0
/* invoke-super {p0}, Landroid/app/Activity;->onStop()V */
/* .line 373 */
(( com.nobleempire.GunDisassembly2.NvEventQueueActivity ) p0 ).stopEvent ( ); // invoke-virtual {p0}, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;->stopEvent()V
/* .line 374 */
v0 = this.mDungeonsPurchaseObserver;
com.nobleempire.GunDisassembly2.ResponseHandler .unregister ( v0 );
/* .line 375 */
return;
} // .end method
public Boolean onTouchEvent ( android.view.MotionEvent p0 ) {
/* .locals 12 */
/* .param p1, "event" # Landroid/view/MotionEvent; */
/* .prologue */
/* .line 429 */
v11 = /* invoke-super {p0, p1}, Landroid/app/Activity;->onTouchEvent(Landroid/view/MotionEvent;)Z */
/* .line 430 */
/* .local v11, "ret":Z */
/* if-nez v11, :cond_0 */
/* .line 431 */
/* iget-boolean v0, p0, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;->wantsMultitouch:Z */
if ( v0 != null) { // if-eqz v0, :cond_4
/* .line 432 */
int v2 = 0; // const/4 v2, 0x0
/* .local v2, "count":I */
int v3 = 0; // const/4 v3, 0x0
/* .local v3, "x1":I */
int v4 = 0; // const/4 v4, 0x0
/* .local v4, "y1":I */
int v5 = 0; // const/4 v5, 0x0
/* .local v5, "x2":I */
int v6 = 0; // const/4 v6, 0x0
/* .line 434 */
/* .local v6, "y2":I */
v10 = (( android.view.MotionEvent ) p1 ).getPointerCount ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I
/* .line 435 */
/* .local v10, "numEvents":I */
int v8 = 0; // const/4 v8, 0x0
/* .local v8, "i":I */
} // :goto_0
/* if-lt v8, v10, :cond_1 */
/* .line 450 */
v1 = (( android.view.MotionEvent ) p1 ).getAction ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I
/* move-object v0, p0 */
/* move-object v7, p1 */
v11 = /* invoke-virtual/range {v0 ..v7}, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;->multiTouchEvent(IIIIIILandroid/view/MotionEvent;)Z */
/* .line 455 */
} // .end local v2 # "count":I
} // .end local v3 # "x1":I
} // .end local v4 # "y1":I
} // .end local v5 # "x2":I
} // .end local v6 # "y2":I
} // .end local v8 # "i":I
} // .end local v10 # "numEvents":I
} // :cond_0
} // :goto_1
/* .line 437 */
/* .restart local v2 # "count":I */
/* .restart local v3 # "x1":I */
/* .restart local v4 # "y1":I */
/* .restart local v5 # "x2":I */
/* .restart local v6 # "y2":I */
/* .restart local v8 # "i":I */
/* .restart local v10 # "numEvents":I */
} // :cond_1
v9 = (( android.view.MotionEvent ) p1 ).getPointerId ( v8 ); // invoke-virtual {p1, v8}, Landroid/view/MotionEvent;->getPointerId(I)I
/* .line 438 */
/* .local v9, "index":I */
int v0 = 2; // const/4 v0, 0x2
/* if-ge v9, v0, :cond_2 */
/* .line 439 */
/* if-nez v2, :cond_3 */
/* .line 440 */
v0 = (( android.view.MotionEvent ) p1 ).getX ( v8 ); // invoke-virtual {p1, v8}, Landroid/view/MotionEvent;->getX(I)F
/* float-to-int v3, v0 */
/* .line 441 */
v0 = (( android.view.MotionEvent ) p1 ).getY ( v8 ); // invoke-virtual {p1, v8}, Landroid/view/MotionEvent;->getY(I)F
/* float-to-int v4, v0 */
/* .line 442 */
/* add-int/lit8 v2, v2, 0x1 */
/* .line 435 */
} // :cond_2
} // :goto_2
/* add-int/lit8 v8, v8, 0x1 */
/* .line 443 */
} // :cond_3
int v0 = 1; // const/4 v0, 0x1
/* if-ne v2, v0, :cond_2 */
/* .line 444 */
v0 = (( android.view.MotionEvent ) p1 ).getX ( v8 ); // invoke-virtual {p1, v8}, Landroid/view/MotionEvent;->getX(I)F
/* float-to-int v5, v0 */
/* .line 445 */
v0 = (( android.view.MotionEvent ) p1 ).getY ( v8 ); // invoke-virtual {p1, v8}, Landroid/view/MotionEvent;->getY(I)F
/* float-to-int v6, v0 */
/* .line 446 */
/* add-int/lit8 v2, v2, 0x1 */
/* .line 452 */
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
v11 = (( com.nobleempire.GunDisassembly2.NvEventQueueActivity ) p0 ).touchEvent ( v0, v1, v7, p1 ); // invoke-virtual {p0, v0, v1, v7, p1}, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;->touchEvent(IIILandroid/view/MotionEvent;)Z
} // .end method
public void open_url ( java.lang.String p0 ) {
/* .locals 3 */
/* .param p1, "url" # Ljava/lang/String; */
/* .prologue */
/* .line 791 */
final String v0 = "NvEventQueueActivity.java"; // const-string v0, "NvEventQueueActivity.java"
/* new-instance v1, Ljava/lang/StringBuilder; */
final String v2 = "~~ opening url "; // const-string v2, "~~ opening url "
/* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .v ( v0,v1 );
/* .line 792 */
/* new-instance v0, Landroid/content/Intent; */
final String v1 = "android.intent.action.VIEW"; // const-string v1, "android.intent.action.VIEW"
android.net.Uri .parse ( p1 );
/* invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V */
(( com.nobleempire.GunDisassembly2.NvEventQueueActivity ) p0 ).startActivity ( v0 ); // invoke-virtual {p0, v0}, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;->startActivity(Landroid/content/Intent;)V
/* .line 793 */
return;
} // .end method
public native void pauseEvent ( ) {
} // .end method
public native void postCleanup ( ) {
} // .end method
public java.lang.String print_android_info ( ) {
/* .locals 21 */
/* .prologue */
/* .line 196 */
int v15 = 2; // const/4 v15, 0x2
/* new-array v2, v15, [Ljava/lang/String; */
int v15 = 0; // const/4 v15, 0x0
final String v16 = "/system/bin/cat"; // const-string v16, "/system/bin/cat"
/* aput-object v16, v2, v15 */
int v15 = 1; // const/4 v15, 0x1
final String v16 = "/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq"; // const-string v16, "/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq"
/* aput-object v16, v2, v15 */
/* .line 197 */
/* .local v2, "args":[Ljava/lang/String; */
/* new-instance v3, Ljava/lang/ProcessBuilder; */
/* invoke-direct {v3, v2}, Ljava/lang/ProcessBuilder;-><init>([Ljava/lang/String;)V */
/* .line 198 */
/* .local v3, "cmd":Ljava/lang/ProcessBuilder; */
final String v4 = ""; // const-string v4, ""
/* .line 200 */
/* .local v4, "cpu_freq":Ljava/lang/String; */
try { // :try_start_0
(( java.lang.ProcessBuilder ) v3 ).start ( ); // invoke-virtual {v3}, Ljava/lang/ProcessBuilder;->start()Ljava/lang/Process;
/* .line 201 */
/* .local v8, "process":Ljava/lang/Process; */
(( java.lang.Process ) v8 ).getInputStream ( ); // invoke-virtual {v8}, Ljava/lang/Process;->getInputStream()Ljava/io/InputStream;
/* .line 202 */
/* .local v6, "in":Ljava/io/InputStream; */
/* const/16 v15, 0x400 */
/* new-array v9, v15, [B */
/* .line 203 */
/* .local v9, "re":[B */
} // :goto_0
v15 = (( java.io.InputStream ) v6 ).read ( v9 ); // invoke-virtual {v6, v9}, Ljava/io/InputStream;->read([B)I
/* const/16 v16, -0x1 */
/* move/from16 v0, v16 */
/* if-ne v15, v0, :cond_0 */
/* .line 206 */
(( java.io.InputStream ) v6 ).close ( ); // invoke-virtual {v6}, Ljava/io/InputStream;->close()V
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 211 */
} // .end local v6 # "in":Ljava/io/InputStream;
} // .end local v8 # "process":Ljava/lang/Process;
} // .end local v9 # "re":[B
} // :goto_1
/* new-instance v7, Landroid/util/DisplayMetrics; */
/* invoke-direct {v7}, Landroid/util/DisplayMetrics;-><init>()V */
/* .line 212 */
/* .local v7, "metrics":Landroid/util/DisplayMetrics; */
/* invoke-virtual/range {p0 ..p0}, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;->getWindowManager()Landroid/view/WindowManager; */
(( android.view.Display ) v15 ).getMetrics ( v7 ); // invoke-virtual {v15, v7}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V
/* .line 213 */
/* iget v15, v7, Landroid/util/DisplayMetrics;->widthPixels:I */
/* int-to-float v15, v15 */
/* iget v0, v7, Landroid/util/DisplayMetrics;->xdpi:F */
/* move/from16 v16, v0 */
/* div-float v15, v15, v16 */
/* float-to-double v15, v15 */
/* const-wide/high16 v17, 0x4000000000000000L # 2.0 */
/* invoke-static/range {v15 ..v18}, Ljava/lang/Math;->pow(DD)D */
/* move-result-wide v15 */
/* iget v0, v7, Landroid/util/DisplayMetrics;->heightPixels:I */
/* move/from16 v17, v0 */
/* move/from16 v0, v17 */
/* int-to-float v0, v0 */
/* move/from16 v17, v0 */
/* iget v0, v7, Landroid/util/DisplayMetrics;->ydpi:F */
/* move/from16 v18, v0 */
/* div-float v17, v17, v18 */
/* move/from16 v0, v17 */
/* float-to-double v0, v0 */
/* move-wide/from16 v17, v0 */
/* const-wide/high16 v19, 0x4000000000000000L # 2.0 */
/* invoke-static/range {v17 ..v20}, Ljava/lang/Math;->pow(DD)D */
/* move-result-wide v17 */
/* add-double v15, v15, v17 */
/* invoke-static/range {v15 ..v16}, Ljava/lang/Math;->sqrt(D)D */
/* move-result-wide v12 */
/* .line 214 */
/* .local v12, "screenInches":D */
/* new-instance v10, Landroid/os/StatFs; */
android.os.Environment .getDataDirectory ( );
(( java.io.File ) v15 ).getAbsolutePath ( ); // invoke-virtual {v15}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
/* invoke-direct {v10, v15}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V */
/* .line 215 */
/* .local v10, "s_data":Landroid/os/StatFs; */
/* new-instance v11, Landroid/os/StatFs; */
android.os.Environment .getExternalStorageDirectory ( );
(( java.io.File ) v15 ).getAbsolutePath ( ); // invoke-virtual {v15}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
/* invoke-direct {v11, v15}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V */
/* .line 216 */
/* .local v11, "s_extl":Landroid/os/StatFs; */
/* new-instance v15, Ljava/lang/StringBuilder; */
final String v16 = "STATVER=2&RELEASE="; // const-string v16, "STATVER=2&RELEASE="
/* invoke-direct/range {v15 ..v16}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* .line 217 */
v16 = android.os.Build$VERSION.RELEASE;
/* invoke-virtual/range {v15 ..v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
final String v16 = "&"; // const-string v16, "&"
/* invoke-virtual/range {v15 ..v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
/* .line 218 */
final String v16 = "SDK="; // const-string v16, "SDK="
/* invoke-virtual/range {v15 ..v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
v16 = android.os.Build$VERSION.SDK;
/* invoke-virtual/range {v15 ..v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
final String v16 = "&"; // const-string v16, "&"
/* invoke-virtual/range {v15 ..v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
/* .line 219 */
final String v16 = "BOARD="; // const-string v16, "BOARD="
/* invoke-virtual/range {v15 ..v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
v16 = android.os.Build.BOARD;
/* invoke-virtual/range {v15 ..v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
final String v16 = "&"; // const-string v16, "&"
/* invoke-virtual/range {v15 ..v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
/* .line 220 */
final String v16 = "BRAND="; // const-string v16, "BRAND="
/* invoke-virtual/range {v15 ..v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
v16 = android.os.Build.BRAND;
/* invoke-virtual/range {v15 ..v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
final String v16 = "&"; // const-string v16, "&"
/* invoke-virtual/range {v15 ..v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
/* .line 221 */
final String v16 = "CPU="; // const-string v16, "CPU="
/* invoke-virtual/range {v15 ..v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
v16 = android.os.Build.CPU_ABI;
/* invoke-virtual/range {v15 ..v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
final String v16 = "&"; // const-string v16, "&"
/* invoke-virtual/range {v15 ..v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
/* .line 222 */
final String v16 = "ADEVICE="; // const-string v16, "ADEVICE="
/* invoke-virtual/range {v15 ..v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
v16 = android.os.Build.DEVICE;
/* invoke-virtual/range {v15 ..v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
final String v16 = "&"; // const-string v16, "&"
/* invoke-virtual/range {v15 ..v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
/* .line 223 */
final String v16 = "DISPLAY="; // const-string v16, "DISPLAY="
/* invoke-virtual/range {v15 ..v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
v16 = android.os.Build.DISPLAY;
/* invoke-virtual/range {v15 ..v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
final String v16 = "&"; // const-string v16, "&"
/* invoke-virtual/range {v15 ..v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
/* .line 224 */
final String v16 = "HOST="; // const-string v16, "HOST="
/* invoke-virtual/range {v15 ..v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
v16 = android.os.Build.HOST;
/* invoke-virtual/range {v15 ..v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
final String v16 = "&"; // const-string v16, "&"
/* invoke-virtual/range {v15 ..v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
/* .line 225 */
final String v16 = "MODEL="; // const-string v16, "MODEL="
/* invoke-virtual/range {v15 ..v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
v16 = android.os.Build.MODEL;
/* invoke-virtual/range {v15 ..v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
final String v16 = "&"; // const-string v16, "&"
/* invoke-virtual/range {v15 ..v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
/* .line 226 */
final String v16 = "TAGS="; // const-string v16, "TAGS="
/* invoke-virtual/range {v15 ..v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
v16 = android.os.Build.TAGS;
/* invoke-virtual/range {v15 ..v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
final String v16 = "&"; // const-string v16, "&"
/* invoke-virtual/range {v15 ..v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
/* .line 227 */
final String v16 = "TYPE="; // const-string v16, "TYPE="
/* invoke-virtual/range {v15 ..v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
v16 = android.os.Build.TYPE;
/* invoke-virtual/range {v15 ..v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
final String v16 = "&"; // const-string v16, "&"
/* invoke-virtual/range {v15 ..v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
/* .line 228 */
final String v16 = "USER="; // const-string v16, "USER="
/* invoke-virtual/range {v15 ..v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
v16 = android.os.Build.USER;
/* invoke-virtual/range {v15 ..v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
final String v16 = "&"; // const-string v16, "&"
/* invoke-virtual/range {v15 ..v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
/* .line 229 */
final String v16 = "RAM_FREE="; // const-string v16, "RAM_FREE="
/* invoke-virtual/range {v15 ..v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
v16 = /* invoke-virtual/range {p0 ..p0}, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;->get_ram_free()I */
/* invoke-virtual/range {v15 ..v16}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder; */
final String v16 = "&"; // const-string v16, "&"
/* invoke-virtual/range {v15 ..v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
/* .line 230 */
final String v16 = "DATA_FREE="; // const-string v16, "DATA_FREE="
/* invoke-virtual/range {v15 ..v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
v16 = (( android.os.StatFs ) v10 ).getAvailableBlocks ( ); // invoke-virtual {v10}, Landroid/os/StatFs;->getAvailableBlocks()I
/* move/from16 v0, v16 */
/* int-to-long v0, v0 */
/* move-wide/from16 v16, v0 */
v18 = (( android.os.StatFs ) v10 ).getBlockSize ( ); // invoke-virtual {v10}, Landroid/os/StatFs;->getBlockSize()I
/* move/from16 v0, v18 */
/* int-to-long v0, v0 */
/* move-wide/from16 v18, v0 */
/* mul-long v16, v16, v18 */
/* const-wide/32 v18, 0x100000 */
/* div-long v16, v16, v18 */
/* invoke-virtual/range {v15 ..v17}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder; */
final String v16 = "&"; // const-string v16, "&"
/* invoke-virtual/range {v15 ..v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
/* .line 231 */
final String v16 = "DATA_TOTAL="; // const-string v16, "DATA_TOTAL="
/* invoke-virtual/range {v15 ..v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
v16 = (( android.os.StatFs ) v10 ).getBlockCount ( ); // invoke-virtual {v10}, Landroid/os/StatFs;->getBlockCount()I
/* move/from16 v0, v16 */
/* int-to-long v0, v0 */
/* move-wide/from16 v16, v0 */
v18 = (( android.os.StatFs ) v10 ).getBlockSize ( ); // invoke-virtual {v10}, Landroid/os/StatFs;->getBlockSize()I
/* move/from16 v0, v18 */
/* int-to-long v0, v0 */
/* move-wide/from16 v18, v0 */
/* mul-long v16, v16, v18 */
/* const-wide/32 v18, 0x100000 */
/* div-long v16, v16, v18 */
/* invoke-virtual/range {v15 ..v17}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder; */
final String v16 = "&"; // const-string v16, "&"
/* invoke-virtual/range {v15 ..v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
/* .line 232 */
final String v16 = "EXT_FREE="; // const-string v16, "EXT_FREE="
/* invoke-virtual/range {v15 ..v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
v16 = (( android.os.StatFs ) v11 ).getAvailableBlocks ( ); // invoke-virtual {v11}, Landroid/os/StatFs;->getAvailableBlocks()I
/* move/from16 v0, v16 */
/* int-to-long v0, v0 */
/* move-wide/from16 v16, v0 */
v18 = (( android.os.StatFs ) v11 ).getBlockSize ( ); // invoke-virtual {v11}, Landroid/os/StatFs;->getBlockSize()I
/* move/from16 v0, v18 */
/* int-to-long v0, v0 */
/* move-wide/from16 v18, v0 */
/* mul-long v16, v16, v18 */
/* const-wide/32 v18, 0x100000 */
/* div-long v16, v16, v18 */
/* invoke-virtual/range {v15 ..v17}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder; */
final String v16 = "&"; // const-string v16, "&"
/* invoke-virtual/range {v15 ..v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
/* .line 233 */
final String v16 = "EXT_TOTAL="; // const-string v16, "EXT_TOTAL="
/* invoke-virtual/range {v15 ..v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
v16 = (( android.os.StatFs ) v11 ).getBlockCount ( ); // invoke-virtual {v11}, Landroid/os/StatFs;->getBlockCount()I
/* move/from16 v0, v16 */
/* int-to-long v0, v0 */
/* move-wide/from16 v16, v0 */
v18 = (( android.os.StatFs ) v11 ).getBlockSize ( ); // invoke-virtual {v11}, Landroid/os/StatFs;->getBlockSize()I
/* move/from16 v0, v18 */
/* int-to-long v0, v0 */
/* move-wide/from16 v18, v0 */
/* mul-long v16, v16, v18 */
/* const-wide/32 v18, 0x100000 */
/* div-long v16, v16, v18 */
/* invoke-virtual/range {v15 ..v17}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder; */
final String v16 = "&"; // const-string v16, "&"
/* invoke-virtual/range {v15 ..v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
/* .line 234 */
final String v16 = "CPU_FREQ="; // const-string v16, "CPU_FREQ="
/* invoke-virtual/range {v15 ..v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
(( java.lang.StringBuilder ) v15 ).append ( v4 ); // invoke-virtual {v15, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v16 = "&"; // const-string v16, "&"
/* invoke-virtual/range {v15 ..v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
/* .line 235 */
final String v16 = "DENS="; // const-string v16, "DENS="
/* invoke-virtual/range {v15 ..v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
/* iget v0, v7, Landroid/util/DisplayMetrics;->densityDpi:I */
/* move/from16 v16, v0 */
/* invoke-virtual/range {v15 ..v16}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder; */
final String v16 = "&"; // const-string v16, "&"
/* invoke-virtual/range {v15 ..v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
/* .line 236 */
final String v16 = "INCH="; // const-string v16, "INCH="
/* invoke-virtual/range {v15 ..v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
final String v16 = "%.2f"; // const-string v16, "%.2f"
/* const/16 v17, 0x1 */
/* move/from16 v0, v17 */
/* new-array v0, v0, [Ljava/lang/Object; */
/* move-object/from16 v17, v0 */
/* const/16 v18, 0x0 */
java.lang.Double .valueOf ( v12,v13 );
/* aput-object v19, v17, v18 */
/* invoke-static/range {v16 ..v17}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String; */
/* invoke-virtual/range {v15 ..v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
final String v16 = "("; // const-string v16, "("
/* invoke-virtual/range {v15 ..v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
final String v16 = "%.2f"; // const-string v16, "%.2f"
/* const/16 v17, 0x1 */
/* move/from16 v0, v17 */
/* new-array v0, v0, [Ljava/lang/Object; */
/* move-object/from16 v17, v0 */
/* const/16 v18, 0x0 */
/* iget v0, v7, Landroid/util/DisplayMetrics;->xdpi:F */
/* move/from16 v19, v0 */
/* invoke-static/range {v19 ..v19}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float; */
/* aput-object v19, v17, v18 */
/* invoke-static/range {v16 ..v17}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String; */
/* invoke-virtual/range {v15 ..v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
final String v16 = "x"; // const-string v16, "x"
/* invoke-virtual/range {v15 ..v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
final String v16 = "%.2f"; // const-string v16, "%.2f"
/* const/16 v17, 0x1 */
/* move/from16 v0, v17 */
/* new-array v0, v0, [Ljava/lang/Object; */
/* move-object/from16 v17, v0 */
/* const/16 v18, 0x0 */
/* iget v0, v7, Landroid/util/DisplayMetrics;->ydpi:F */
/* move/from16 v19, v0 */
/* invoke-static/range {v19 ..v19}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float; */
/* aput-object v19, v17, v18 */
/* invoke-static/range {v16 ..v17}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String; */
/* invoke-virtual/range {v15 ..v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
final String v16 = ")"; // const-string v16, ")"
/* invoke-virtual/range {v15 ..v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
/* .line 216 */
(( java.lang.StringBuilder ) v15 ).toString ( ); // invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 237 */
/* .local v14, "str":Ljava/lang/String; */
/* .line 204 */
} // .end local v7 # "metrics":Landroid/util/DisplayMetrics;
} // .end local v10 # "s_data":Landroid/os/StatFs;
} // .end local v11 # "s_extl":Landroid/os/StatFs;
} // .end local v12 # "screenInches":D
} // .end local v14 # "str":Ljava/lang/String;
/* .restart local v6 # "in":Ljava/io/InputStream; */
/* .restart local v8 # "process":Ljava/lang/Process; */
/* .restart local v9 # "re":[B */
} // :cond_0
try { // :try_start_1
/* new-instance v15, Ljava/lang/StringBuilder; */
java.lang.String .valueOf ( v4 );
/* invoke-direct/range {v15 ..v16}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* new-instance v16, Ljava/lang/String; */
/* move-object/from16 v0, v16 */
/* invoke-direct {v0, v9}, Ljava/lang/String;-><init>([B)V */
/* invoke-virtual/range {v15 ..v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
(( java.lang.StringBuilder ) v15 ).toString ( ); // invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* :try_end_1 */
/* .catch Ljava/io/IOException; {:try_start_1 ..:try_end_1} :catch_0 */
/* goto/16 :goto_0 */
/* .line 207 */
} // .end local v6 # "in":Ljava/io/InputStream;
} // .end local v8 # "process":Ljava/lang/Process;
} // .end local v9 # "re":[B
/* :catch_0 */
/* move-exception v5 */
/* .line 208 */
/* .local v5, "ex":Ljava/io/IOException; */
(( java.io.IOException ) v5 ).printStackTrace ( ); // invoke-virtual {v5}, Ljava/io/IOException;->printStackTrace()V
/* goto/16 :goto_1 */
} // .end method
public native void quitAndWait ( ) {
} // .end method
public native void resumeEvent ( ) {
} // .end method
public native void setWindowSize ( Integer p0, Integer p1 ) {
} // .end method
public native void stopEvent ( ) {
} // .end method
public Boolean swapBuffers ( ) {
/* .locals 4 */
/* .prologue */
int v0 = 0; // const/4 v0, 0x0
/* .line 733 */
v1 = this.eglSurface;
/* if-nez v1, :cond_0 */
/* .line 734 */
final String v1 = "NvEventQueueActivity.java"; // const-string v1, "NvEventQueueActivity.java"
final String v2 = "~~eglSurface is NULL"; // const-string v2, "~~eglSurface is NULL"
android.util.Log .e ( v1,v2 );
/* .line 741 */
} // :goto_0
/* .line 736 */
} // :cond_0
v1 = this.egl;
v2 = this.eglDisplay;
v1 = v3 = this.eglSurface;
/* if-nez v1, :cond_1 */
/* .line 737 */
final String v1 = "NvEventQueueActivity.java"; // const-string v1, "NvEventQueueActivity.java"
/* new-instance v2, Ljava/lang/StringBuilder; */
final String v3 = "~~eglSwapBufferrr: "; // const-string v3, "~~eglSwapBufferrr: "
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v3 = v3 = this.egl;
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .e ( v1,v2 );
/* .line 738 */
(( com.nobleempire.GunDisassembly2.NvEventQueueActivity ) p0 ).kill_self ( ); // invoke-virtual {p0}, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;->kill_self()V
/* .line 741 */
} // :cond_1
int v0 = 1; // const/4 v0, 0x1
} // .end method
protected void systemCleanup ( ) {
/* .locals 3 */
/* .prologue */
/* .line 779 */
final String v0 = "NvEventQueueActivity.java"; // const-string v0, "NvEventQueueActivity.java"
/* new-instance v1, Ljava/lang/StringBuilder; */
final String v2 = "~~systemCleanup() ranInit = "; // const-string v2, "~~systemCleanup() ranInit = "
/* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* iget-boolean v2, p0, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;->ranInit:Z */
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .v ( v0,v1 );
/* .line 780 */
/* iget-boolean v0, p0, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;->ranInit:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 781 */
final String v0 = "NvEventQueueActivity.java"; // const-string v0, "NvEventQueueActivity.java"
final String v1 = "~~ calling native cleanup()"; // const-string v1, "~~ calling native cleanup()"
android.util.Log .v ( v0,v1 );
/* .line 782 */
(( com.nobleempire.GunDisassembly2.NvEventQueueActivity ) p0 ).cleanup ( ); // invoke-virtual {p0}, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;->cleanup()V
/* .line 784 */
} // :cond_0
final String v0 = "NvEventQueueActivity.java"; // const-string v0, "NvEventQueueActivity.java"
final String v1 = "~~ calling cleanupEGL()"; // const-string v1, "~~ calling cleanupEGL()"
android.util.Log .v ( v0,v1 );
/* .line 785 */
(( com.nobleempire.GunDisassembly2.NvEventQueueActivity ) p0 ).cleanupEGL ( ); // invoke-virtual {p0}, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;->cleanupEGL()V
/* .line 786 */
final String v0 = "NvEventQueueActivity.java"; // const-string v0, "NvEventQueueActivity.java"
final String v1 = "~~ calling postCleanup()"; // const-string v1, "~~ calling postCleanup()"
android.util.Log .v ( v0,v1 );
/* .line 787 */
(( com.nobleempire.GunDisassembly2.NvEventQueueActivity ) p0 ).postCleanup ( ); // invoke-virtual {p0}, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;->postCleanup()V
/* .line 788 */
return;
} // .end method
protected Boolean systemInit ( ) {
/* .locals 4 */
/* .prologue */
/* .line 527 */
/* move-object v0, p0 */
/* .line 528 */
/* .local v0, "act":Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity; */
final String v2 = "NvEventQueueActivity.java"; // const-string v2, "NvEventQueueActivity.java"
final String v3 = "~~In systemInit"; // const-string v3, "~~In systemInit"
android.util.Log .v ( v2,v3 );
/* .line 530 */
/* new-instance v2, Landroid/view/SurfaceView; */
/* invoke-direct {v2, p0}, Landroid/view/SurfaceView;-><init>(Landroid/content/Context;)V */
this.view = v2;
/* .line 532 */
v2 = this.view;
(( android.view.SurfaceView ) v2 ).getHolder ( ); // invoke-virtual {v2}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;
/* .line 533 */
/* .local v1, "holder":Landroid/view/SurfaceHolder; */
int v2 = 2; // const/4 v2, 0x2
/* .line 534 */
/* new-instance v2, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity$1; */
/* invoke-direct {v2, p0, v0}, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity$1;-><init>(Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;)V */
/* .line 591 */
v2 = this.view;
(( com.nobleempire.GunDisassembly2.NvEventQueueActivity ) p0 ).setContentView ( v2 ); // invoke-virtual {p0, v2}, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;->setContentView(Landroid/view/View;)V
/* .line 592 */
int v2 = 1; // const/4 v2, 0x1
} // .end method
public void test_alert_dialog ( Integer p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, java.lang.String p5 ) {
/* .locals 18 */
/* .param p1, "dlg_id" # I */
/* .param p2, "title" # Ljava/lang/String; */
/* .param p3, "message" # Ljava/lang/String; */
/* .param p4, "text" # Ljava/lang/String; */
/* .param p5, "ok_btn" # Ljava/lang/String; */
/* .param p6, "cancel_btn" # Ljava/lang/String; */
/* .prologue */
/* .line 796 */
final String v1 = "NvEventQueueActivity.java"; // const-string v1, "NvEventQueueActivity.java"
/* new-instance v2, Ljava/lang/StringBuilder; */
final String v10 = "~~test_alert_dialog() msg="; // const-string v10, "~~test_alert_dialog() msg="
/* invoke-direct {v2, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* move-object/from16 v0, p3 */
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v10 = " text="; // const-string v10, " text="
(( java.lang.StringBuilder ) v2 ).append ( v10 ); // invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* move-object/from16 v0, p4 */
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v10 = " ok="; // const-string v10, " ok="
(( java.lang.StringBuilder ) v2 ).append ( v10 ); // invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* move-object/from16 v0, p5 */
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v10 = " cancel="; // const-string v10, " cancel="
(( java.lang.StringBuilder ) v2 ).append ( v10 ); // invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* move-object/from16 v0, p6 */
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .v ( v1,v2 );
/* .line 797 */
/* move-object/from16 v3, p0 */
/* .line 798 */
/* .local v3, "act":Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity; */
/* move/from16 v9, p1 */
/* .line 799 */
/* .local v9, "f_dlg_id":I */
/* move-object/from16 v5, p2 */
/* .line 800 */
/* .local v5, "f_title":Ljava/lang/String; */
/* move-object/from16 v6, p3 */
/* .line 801 */
/* .local v6, "f_message":Ljava/lang/String; */
/* move-object/from16 v4, p4 */
/* .line 802 */
/* .local v4, "f_text":Ljava/lang/String; */
/* move-object/from16 v7, p5 */
/* .line 803 */
/* .local v7, "f_ok_btn":Ljava/lang/String; */
/* move-object/from16 v8, p6 */
/* .line 804 */
/* .local v8, "f_cancel_btn":Ljava/lang/String; */
final String v1 = "-"; // const-string v1, "-"
v1 = (( java.lang.String ) v4 ).equals ( v1 ); // invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v1, :cond_0 */
/* .line 805 */
/* move-object/from16 v0, p0 */
v10 = this.handler;
/* new-instance v1, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity$2; */
/* move-object/from16 v2, p0 */
/* invoke-direct/range {v1 ..v9}, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity$2;-><init>(Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V */
(( android.os.Handler ) v10 ).post ( v1 ); // invoke-virtual {v10, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
/* .line 859 */
} // :goto_0
return;
/* .line 837 */
} // :cond_0
/* move-object/from16 v0, p0 */
v1 = this.handler;
/* new-instance v10, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity$3; */
/* move-object/from16 v11, p0 */
/* move-object v12, v3 */
/* move-object v13, v5 */
/* move-object v14, v6 */
/* move-object v15, v7 */
/* move-object/from16 v16, v8 */
/* move/from16 v17, v9 */
/* invoke-direct/range {v10 ..v17}, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity$3;-><init>(Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V */
(( android.os.Handler ) v1 ).post ( v10 ); // invoke-virtual {v1, v10}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
} // .end method
public void test_alert_dialog2 ( Integer p0, java.lang.String p1, java.lang.String p2 ) {
/* .locals 7 */
/* .param p1, "dlg_id" # I */
/* .param p2, "title" # Ljava/lang/String; */
/* .param p3, "message" # Ljava/lang/String; */
/* .prologue */
/* .line 861 */
final String v0 = "NvEventQueueActivity.java"; // const-string v0, "NvEventQueueActivity.java"
/* new-instance v1, Ljava/lang/StringBuilder; */
final String v6 = "~~test_alert_dialog2() "; // const-string v6, "~~test_alert_dialog2() "
/* invoke-direct {v1, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v1 ).append ( p3 ); // invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .v ( v0,v1 );
/* .line 862 */
/* move-object v2, p0 */
/* .line 863 */
/* .local v2, "act":Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity; */
/* move v5, p1 */
/* .line 864 */
/* .local v5, "f_dlg_id":I */
/* move-object v3, p2 */
/* .line 865 */
/* .local v3, "f_title":Ljava/lang/String; */
/* move-object v4, p3 */
/* .line 866 */
/* .local v4, "f_message":Ljava/lang/String; */
v6 = this.handler;
/* new-instance v0, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity$4; */
/* move-object v1, p0 */
/* invoke-direct/range {v0 ..v5}, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity$4;-><init>(Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;Ljava/lang/String;Ljava/lang/String;I)V */
(( android.os.Handler ) v6 ).post ( v0 ); // invoke-virtual {v6, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
/* .line 884 */
return;
} // .end method
public native Boolean touchEvent ( Integer p0, Integer p1, Integer p2, android.view.MotionEvent p3 ) {
} // .end method
public Boolean unMakeCurrent ( ) {
/* .locals 5 */
/* .prologue */
/* .line 768 */
final String v0 = "NvEventQueueActivity.java"; // const-string v0, "NvEventQueueActivity.java"
final String v1 = "~~unMakeCurrent()"; // const-string v1, "~~unMakeCurrent()"
android.util.Log .v ( v0,v1 );
/* .line 769 */
v0 = this.egl;
v1 = this.eglDisplay;
v2 = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE;
v3 = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE;
v0 = v4 = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT;
/* if-nez v0, :cond_0 */
/* .line 770 */
final String v0 = "NvEventQueueActivity.java"; // const-string v0, "NvEventQueueActivity.java"
/* new-instance v1, Ljava/lang/StringBuilder; */
final String v2 = "~~egl(Un)MakeCurrent err: "; // const-string v2, "~~egl(Un)MakeCurrent err: "
/* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v2 = v2 = this.egl;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .e ( v0,v1 );
/* .line 771 */
(( com.nobleempire.GunDisassembly2.NvEventQueueActivity ) p0 ).kill_self ( ); // invoke-virtual {p0}, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;->kill_self()V
/* .line 772 */
int v0 = 0; // const/4 v0, 0x0
/* .line 774 */
} // :goto_0
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
} // .end method
public native void userPresentEvent ( ) {
} // .end method
