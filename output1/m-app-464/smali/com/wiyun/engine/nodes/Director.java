public class com.wiyun.engine.nodes.Director implements android.opengl.GLSurfaceView$Renderer {
	 /* # interfaces */
	 /* # static fields */
	 private static final Integer MSG_SET_VIEW_INVISIBLE;
	 private static final Integer MSG_SET_VIEW_VISIBLE;
	 public static final Integer PROJECTION_2D;
	 public static final Integer PROJECTION_3D;
	 public static final Integer PROJECTION_CUSTOM;
	 public static final Integer SCALE_MODE_BASE_SIZE_FIT_XY;
	 public static final Integer SCALE_MODE_BY_DENSITY;
	 private static com.wiyun.engine.nodes.Director sInstance;
	 /* # instance fields */
	 public javax.microedition.khronos.opengles.GL10 gl;
	 private Integer mAccelDelay;
	 private android.os.Handler mHandler;
	 private android.content.BroadcastReceiver mReceiver;
	 /* # direct methods */
	 protected com.wiyun.engine.nodes.Director ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 int v0 = 1; // const/4 v0, 0x1
		 /* iput v0, p0, Lcom/wiyun/engine/nodes/Director;->mAccelDelay:I */
		 /* new-instance v0, Lcom/wiyun/engine/nodes/Director$1; */
		 /* invoke-direct {v0, p0}, Lcom/wiyun/engine/nodes/Director$1;-><init>(Lcom/wiyun/engine/nodes/Director;)V */
		 this.mHandler = v0;
		 /* new-instance v0, Lcom/wiyun/engine/nodes/Director$2; */
		 /* invoke-direct {v0, p0}, Lcom/wiyun/engine/nodes/Director$2;-><init>(Lcom/wiyun/engine/nodes/Director;)V */
		 this.mReceiver = v0;
		 /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/Director;->nativeInit()V */
		 return;
	 } // .end method
	 static void access$0 ( com.wiyun.engine.nodes.Director p0 ) { //synthethic
		 /* .locals 0 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/Director;->drainAutoReleasePool()V */
		 return;
	 } // .end method
	 private native void drainAutoReleasePool ( ) {
	 } // .end method
	 static java.lang.String getCountry ( ) {
		 /* .locals 1 */
		 java.util.Locale .getDefault ( );
		 (( java.util.Locale ) v0 ).getCountry ( ); // invoke-virtual {v0}, Ljava/util/Locale;->getCountry()Ljava/lang/String;
	 } // .end method
	 public static native Float getDefaultInDensity ( ) {
	 } // .end method
	 static java.lang.String getDeviceIMEI ( ) {
		 /* .locals 3 */
		 int v1 = 0; // const/4 v1, 0x0
		 com.wiyun.engine.nodes.Director .getInstance ( );
		 (( com.wiyun.engine.nodes.Director ) v0 ).getContext ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/nodes/Director;->getContext()Landroid/content/Context;
		 /* if-nez v0, :cond_0 */
	 } // :goto_0
} // :cond_0
final String v2 = "android.permission.READ_PHONE_STATE"; // const-string v2, "android.permission.READ_PHONE_STATE"
v2 = (( android.content.Context ) v0 ).checkCallingOrSelfPermission ( v2 ); // invoke-virtual {v0, v2}, Landroid/content/Context;->checkCallingOrSelfPermission(Ljava/lang/String;)I
/* if-nez v2, :cond_1 */
final String v2 = "phone"; // const-string v2, "phone"
(( android.content.Context ) v0 ).getSystemService ( v2 ); // invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v0, Landroid/telephony/TelephonyManager; */
if ( v0 != null) { // if-eqz v0, :cond_1
	 (( android.telephony.TelephonyManager ) v0 ).getDeviceId ( ); // invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getDeviceId()Ljava/lang/String;
} // :goto_1
/* move-object v1, v0 */
} // :cond_1
/* move-object v0, v1 */
} // .end method
static java.lang.String getDeviceUniqueString ( ) {
/* .locals 4 */
int v0 = 0; // const/4 v0, 0x0
com.wiyun.engine.nodes.Director .getInstance ( );
(( com.wiyun.engine.nodes.Director ) v1 ).getContext ( ); // invoke-virtual {v1}, Lcom/wiyun/engine/nodes/Director;->getContext()Landroid/content/Context;
/* if-nez v1, :cond_1 */
} // :cond_0
} // :goto_0
} // :cond_1
com.wiyun.engine.nodes.Director .getDeviceIMEI ( );
if ( v2 != null) { // if-eqz v2, :cond_0
/* new-instance v3, Ljava/lang/StringBuilder; */
/* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v3 ).append ( v2 ); // invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( android.content.Context ) v1 ).getContentResolver ( ); // invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;
final String v2 = "android_id"; // const-string v2, "android_id"
android.provider.Settings$Secure .getString ( v0,v2 );
(( java.lang.StringBuilder ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( android.content.Context ) v1 ).getResources ( ); // invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v0 ).getDisplayMetrics ( ); // invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
/* iget v0, v0, Landroid/util/DisplayMetrics;->density:F */
(( java.lang.StringBuilder ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
final String v0 = "wifi"; // const-string v0, "wifi"
(( android.content.Context ) v1 ).getSystemService ( v0 ); // invoke-virtual {v1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v0, Landroid/net/wifi/WifiManager; */
if ( v0 != null) { // if-eqz v0, :cond_2
(( android.net.wifi.WifiManager ) v0 ).getConnectionInfo ( ); // invoke-virtual {v0}, Landroid/net/wifi/WifiManager;->getConnectionInfo()Landroid/net/wifi/WifiInfo;
if ( v0 != null) { // if-eqz v0, :cond_2
(( android.net.wifi.WifiInfo ) v0 ).getMacAddress ( ); // invoke-virtual {v0}, Landroid/net/wifi/WifiInfo;->getMacAddress()Ljava/lang/String;
(( java.lang.StringBuilder ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
} // :cond_2
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
public static com.wiyun.engine.nodes.Director getInstance ( ) {
/* .locals 2 */
/* const-class v1, Lcom/wiyun/engine/nodes/Director; */
/* monitor-enter v1 */
try { // :try_start_0
v0 = com.wiyun.engine.nodes.Director.sInstance;
/* if-nez v0, :cond_0 */
/* new-instance v0, Lcom/wiyun/engine/nodes/Director; */
/* invoke-direct {v0}, Lcom/wiyun/engine/nodes/Director;-><init>()V */
} // :cond_0
v0 = com.wiyun.engine.nodes.Director.sInstance;
/* monitor-exit v1 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit v1 */
/* throw v0 */
} // .end method
public static com.wiyun.engine.nodes.Director getInstanceNoCreate ( ) {
/* .locals 1 */
v0 = com.wiyun.engine.nodes.Director.sInstance;
} // .end method
static java.lang.String getLanguage ( ) {
/* .locals 1 */
java.util.Locale .getDefault ( );
(( java.util.Locale ) v0 ).getLanguage ( ); // invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;
} // .end method
private native Integer getRealHeight ( ) {
} // .end method
private native Integer getRealWidth ( ) {
} // .end method
private native Integer getScaleMode ( ) {
} // .end method
private native Integer getSurfaceHeight ( ) {
} // .end method
private native Integer getSurfaceWidth ( ) {
} // .end method
public static native java.lang.String getVersion ( ) {
} // .end method
static Boolean hasExternalStorage ( ) {
/* .locals 2 */
android.os.Environment .getExternalStorageState ( );
final String v1 = "mounted"; // const-string v1, "mounted"
v0 = (( java.lang.String ) v1 ).equals ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
} // .end method
static Boolean hasPermission ( java.lang.String p0 ) {
/* .locals 3 */
int v0 = 0; // const/4 v0, 0x0
com.wiyun.engine.nodes.Director .getInstance ( );
(( com.wiyun.engine.nodes.Director ) v1 ).getContext ( ); // invoke-virtual {v1}, Lcom/wiyun/engine/nodes/Director;->getContext()Landroid/content/Context;
/* if-nez v1, :cond_1 */
} // :cond_0
} // :goto_0
} // :cond_1
v1 = (( android.content.Context ) v1 ).checkCallingOrSelfPermission ( p0 ); // invoke-virtual {v1, p0}, Landroid/content/Context;->checkCallingOrSelfPermission(Ljava/lang/String;)I
int v2 = -1; // const/4 v2, -0x1
/* if-ne v1, v2, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // .end method
static native void invokeNativeTargetSelector ( Integer p0 ) {
} // .end method
public static native Boolean isEnding ( ) {
} // .end method
private native void nativeAttachContext ( android.content.Context p0 ) {
} // .end method
private native void nativeDestroy ( ) {
} // .end method
private native Integer nativeGetPreviousScene ( ) {
} // .end method
private native Integer nativeGetRunningScene ( ) {
} // .end method
private native void nativeInit ( ) {
} // .end method
private native void nativeOnDrawFrame ( ) {
} // .end method
private native void nativeOnSurfaceChanged ( Integer p0, Integer p1 ) {
} // .end method
private native void nativeOnSurfaceCreated ( ) {
} // .end method
private native void nativeOnSurfaceDestroyed ( ) {
} // .end method
static void openUrl ( java.lang.String p0 ) {
/* .locals 3 */
try { // :try_start_0
v0 = com.wiyun.engine.nodes.Director.sInstance;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = com.wiyun.engine.nodes.Director.sInstance;
(( com.wiyun.engine.nodes.Director ) v0 ).getContext ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/nodes/Director;->getContext()Landroid/content/Context;
/* new-instance v1, Landroid/content/Intent; */
final String v2 = "android.intent.action.VIEW"; // const-string v2, "android.intent.action.VIEW"
/* invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V */
android.net.Uri .parse ( p0 );
(( android.content.Intent ) v1 ).setData ( v2 ); // invoke-virtual {v1, v2}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;
(( android.content.Context ) v0 ).startActivity ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
} // :cond_0
} // :goto_0
return;
/* :catch_0 */
/* move-exception v0 */
} // .end method
static void preloadClasses ( ) {
/* .locals 0 */
return;
} // .end method
public static native void printMemoryUsage ( ) {
} // .end method
public static native void printUnreleasedMemory ( Boolean p0 ) {
} // .end method
public static native void printUnreleasedObjects ( ) {
} // .end method
public static native void setDefaultInDensity ( Float p0 ) {
} // .end method
public static native void setResourceDecoder ( com.wiyun.engine.utils.ResourceDecoder p0 ) {
} // .end method
public static native void setResourceDecoderFlag ( Integer p0 ) {
} // .end method
static void setViewInvisible ( android.view.View p0 ) {
/* .locals 2 */
v0 = com.wiyun.engine.nodes.Director.sInstance;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = com.wiyun.engine.nodes.Director.sInstance;
v0 = this.mHandler;
int v1 = 5; // const/4 v1, 0x5
android.os.Message .obtain ( v0,v1,p0 );
v1 = com.wiyun.engine.nodes.Director.sInstance;
v1 = this.mHandler;
(( android.os.Handler ) v1 ).sendMessage ( v0 ); // invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
} // :cond_0
return;
} // .end method
static void setViewVisible ( android.view.View p0 ) {
/* .locals 2 */
v0 = com.wiyun.engine.nodes.Director.sInstance;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = com.wiyun.engine.nodes.Director.sInstance;
v0 = this.mHandler;
int v1 = 4; // const/4 v1, 0x4
android.os.Message .obtain ( v0,v1,p0 );
v1 = com.wiyun.engine.nodes.Director.sInstance;
v1 = this.mHandler;
(( android.os.Handler ) v1 ).sendMessage ( v0 ); // invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
} // :cond_0
return;
} // .end method
static void showAlertDialog ( java.lang.String p0, java.lang.String p1, java.lang.String p2, Integer p3 ) {
/* .locals 6 */
com.wiyun.engine.nodes.Director .getInstance ( );
(( com.wiyun.engine.nodes.Director ) v0 ).getContext ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/nodes/Director;->getContext()Landroid/content/Context;
/* check-cast v1, Landroid/app/Activity; */
/* new-instance v0, Lcom/wiyun/engine/nodes/Director$4; */
/* move-object v2, p0 */
/* move-object v3, p1 */
/* move-object v4, p2 */
/* move v5, p3 */
/* invoke-direct/range {v0 ..v5}, Lcom/wiyun/engine/nodes/Director$4;-><init>(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V */
(( android.app.Activity ) v1 ).runOnUiThread ( v0 ); // invoke-virtual {v1, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V
return;
} // .end method
static void showConfirmDialog ( java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, Integer p4, Integer p5 ) {
/* .locals 8 */
com.wiyun.engine.nodes.Director .getInstance ( );
(( com.wiyun.engine.nodes.Director ) v0 ).getContext ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/nodes/Director;->getContext()Landroid/content/Context;
/* check-cast v1, Landroid/app/Activity; */
/* new-instance v0, Lcom/wiyun/engine/nodes/Director$3; */
/* move-object v2, p0 */
/* move-object v3, p1 */
/* move-object v4, p2 */
/* move-object v5, p3 */
/* move v6, p4 */
/* move v7, p5 */
/* invoke-direct/range {v0 ..v7}, Lcom/wiyun/engine/nodes/Director$3;-><init>(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V */
(( android.app.Activity ) v1 ).runOnUiThread ( v0 ); // invoke-virtual {v1, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V
return;
} // .end method
/* # virtual methods */
public native void addLifecycleListener ( com.wiyun.engine.nodes.Director$IDirectorLifecycleListener p0 ) {
} // .end method
public void attachContext ( android.content.Context p0 ) {
/* .locals 3 */
/* invoke-direct {p0, p1}, Lcom/wiyun/engine/nodes/Director;->nativeAttachContext(Landroid/content/Context;)V */
(( com.wiyun.engine.nodes.Director ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/nodes/Director;->getContext()Landroid/content/Context;
if ( v0 != null) { // if-eqz v0, :cond_0
/* new-instance v1, Landroid/content/IntentFilter; */
/* invoke-direct {v1}, Landroid/content/IntentFilter;-><init>()V */
final String v2 = "android.intent.action.SCREEN_OFF"; // const-string v2, "android.intent.action.SCREEN_OFF"
(( android.content.IntentFilter ) v1 ).addAction ( v2 ); // invoke-virtual {v1, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V
v2 = this.mReceiver;
(( android.content.Context ) v0 ).registerReceiver ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
} // :cond_0
return;
} // .end method
public native void attachInView ( com.wiyun.engine.opengl.WYGLSurfaceView p0 ) {
} // .end method
public native void changeBaseSize ( Integer p0, Integer p1 ) {
} // .end method
public com.wiyun.engine.types.WYPoint convertToGL ( Float p0, Float p1 ) {
/* .locals 3 */
v0 = /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/Director;->getScaleMode()I */
/* if-nez v0, :cond_0 */
v0 = /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/Director;->getSurfaceHeight()I */
/* int-to-float v0, v0 */
/* sub-float/2addr v0, p2 */
com.wiyun.engine.types.WYPoint .make ( p1,v0 );
} // :goto_0
} // :cond_0
v0 = /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/Director;->getSurfaceWidth()I */
/* int-to-float v0, v0 */
/* mul-float/2addr v0, p1 */
v1 = /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/Director;->getRealWidth()I */
/* int-to-float v1, v1 */
/* div-float/2addr v0, v1 */
v1 = /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/Director;->getRealHeight()I */
/* int-to-float v1, v1 */
/* sub-float/2addr v1, p2 */
v2 = /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/Director;->getSurfaceHeight()I */
/* int-to-float v2, v2 */
/* mul-float/2addr v1, v2 */
v2 = /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/Director;->getRealHeight()I */
/* int-to-float v2, v2 */
/* div-float/2addr v1, v2 */
com.wiyun.engine.types.WYPoint .make ( v0,v1 );
} // .end method
public void end ( ) {
/* .locals 3 */
int v2 = 0; // const/4 v2, 0x0
(( com.wiyun.engine.nodes.Director ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/nodes/Director;->getContext()Landroid/content/Context;
if ( v0 != null) { // if-eqz v0, :cond_1
v1 = this.mReceiver;
if ( v1 != null) { // if-eqz v1, :cond_0
v1 = this.mReceiver;
(( android.content.Context ) v0 ).unregisterReceiver ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
this.mReceiver = v2;
} // :cond_0
v0 = com.wiyun.engine.nodes.Director.sInstance;
if ( v0 != null) { // if-eqz v0, :cond_1
/* invoke-direct {p0}, Lcom/wiyun/engine/nodes/Director;->nativeDestroy()V */
} // :cond_1
return;
} // .end method
public Integer getAccelerometerDelay ( ) {
/* .locals 1 */
/* iget v0, p0, Lcom/wiyun/engine/nodes/Director;->mAccelDelay:I */
} // .end method
public native android.content.Context getContext ( ) {
} // .end method
public native Float getCurrentFrameRate ( ) {
} // .end method
public android.os.Handler getHandler ( ) {
/* .locals 1 */
v0 = this.mHandler;
} // .end method
public native Integer getMaxFrameRate ( ) {
} // .end method
public native Integer getMaxTextureSize ( ) {
} // .end method
public native com.wiyun.engine.opengl.WYGLSurfaceView getOpenGLView ( ) {
} // .end method
public com.wiyun.engine.nodes.Scene getPreviousScene ( ) {
/* .locals 2 */
/* new-instance v0, Lcom/wiyun/engine/nodes/Scene; */
v1 = /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/Director;->nativeGetPreviousScene()I */
/* invoke-direct {v0, v1}, Lcom/wiyun/engine/nodes/Scene;-><init>(I)V */
} // .end method
public native Integer getProjection ( ) {
} // .end method
public com.wiyun.engine.nodes.Scene getRunningScene ( ) {
/* .locals 2 */
/* new-instance v0, Lcom/wiyun/engine/nodes/Scene; */
v1 = /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/Director;->nativeGetRunningScene()I */
/* invoke-direct {v0, v1}, Lcom/wiyun/engine/nodes/Scene;-><init>(I)V */
} // .end method
public native Float getTickFactor ( ) {
} // .end method
public com.wiyun.engine.types.WYSize getWindowSize ( ) {
/* .locals 2 */
v0 = /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/Director;->getSurfaceWidth()I */
/* int-to-float v0, v0 */
v1 = /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/Director;->getSurfaceHeight()I */
/* int-to-float v1, v1 */
com.wiyun.engine.types.WYSize .make ( v0,v1 );
} // .end method
void internalEnd ( ) {
/* .locals 3 */
int v2 = 0; // const/4 v2, 0x0
(( com.wiyun.engine.nodes.Director ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/nodes/Director;->getContext()Landroid/content/Context;
if ( v0 != null) { // if-eqz v0, :cond_1
v1 = this.mReceiver;
if ( v1 != null) { // if-eqz v1, :cond_0
v1 = this.mReceiver;
(( android.content.Context ) v0 ).unregisterReceiver ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
this.mReceiver = v2;
} // :cond_0
/* instance-of v1, v0, Landroid/app/Activity; */
if ( v1 != null) { // if-eqz v1, :cond_2
/* check-cast v0, Landroid/app/Activity; */
(( android.app.Activity ) v0 ).finish ( ); // invoke-virtual {v0}, Landroid/app/Activity;->finish()V
} // :cond_1
} // :goto_0
return;
} // :cond_2
v0 = com.wiyun.engine.nodes.Director.sInstance;
if ( v0 != null) { // if-eqz v0, :cond_1
/* invoke-direct {p0}, Lcom/wiyun/engine/nodes/Director;->nativeDestroy()V */
} // .end method
public native Boolean isAllowBackgroundRunning ( ) {
} // .end method
public native Boolean isExtensionSupported ( java.lang.String p0 ) {
} // .end method
public native Boolean isFocusEnabled ( ) {
} // .end method
public Boolean isPortrait ( ) {
/* .locals 2 */
(( com.wiyun.engine.nodes.Director ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/nodes/Director;->getContext()Landroid/content/Context;
final String v1 = "window"; // const-string v1, "window"
(( android.content.Context ) v0 ).getSystemService ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v0, Landroid/view/WindowManager; */
v0 = (( android.view.Display ) v0 ).getOrientation ( ); // invoke-virtual {v0}, Landroid/view/Display;->getOrientation()I
/* if-nez v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public native Boolean isUIPaused ( ) {
} // .end method
public native void makeScreenshot ( java.lang.String p0 ) {
} // .end method
public native void makeScreenshot ( java.lang.String p0, com.wiyun.engine.nodes.Node p1 ) {
} // .end method
public native void makeScreenshot ( java.lang.String p0, com.wiyun.engine.types.WYRect p1 ) {
} // .end method
public void onDrawFrame ( javax.microedition.khronos.opengles.GL10 p0 ) {
/* .locals 0 */
/* invoke-direct {p0}, Lcom/wiyun/engine/nodes/Director;->nativeOnDrawFrame()V */
return;
} // .end method
public void onSurfaceChanged ( javax.microedition.khronos.opengles.GL10 p0, Integer p1, Integer p2 ) {
/* .locals 0 */
/* invoke-direct {p0, p2, p3}, Lcom/wiyun/engine/nodes/Director;->nativeOnSurfaceChanged(II)V */
return;
} // .end method
public void onSurfaceCreated ( javax.microedition.khronos.opengles.GL10 p0, javax.microedition.khronos.egl.EGLConfig p1 ) {
/* .locals 1 */
com.wiyun.engine.nodes.Director .getInstance ( );
this.gl = p1;
/* invoke-direct {p0}, Lcom/wiyun/engine/nodes/Director;->nativeOnSurfaceCreated()V */
return;
} // .end method
public void onSurfaceDestroyed ( ) {
/* .locals 2 */
com.wiyun.engine.nodes.Director .getInstance ( );
int v1 = 0; // const/4 v1, 0x0
this.gl = v1;
/* invoke-direct {p0}, Lcom/wiyun/engine/nodes/Director;->nativeOnSurfaceDestroyed()V */
return;
} // .end method
public native void pause ( ) {
} // .end method
public native void pauseUI ( ) {
} // .end method
public native void popScene ( ) {
} // .end method
public native void popSceneWithTransition ( com.wiyun.engine.transitions.TransitionScene p0 ) {
} // .end method
public native void pushScene ( com.wiyun.engine.nodes.Scene p0 ) {
} // .end method
public native void replaceScene ( com.wiyun.engine.nodes.Scene p0 ) {
} // .end method
public native void resume ( ) {
} // .end method
public native void resumeUI ( ) {
} // .end method
public native void runOnGLThread ( java.lang.Runnable p0 ) {
} // .end method
public void runThread ( java.lang.Runnable p0 ) {
/* .locals 1 */
/* new-instance v0, Lcom/wiyun/engine/nodes/Director$5; */
/* invoke-direct {v0, p0, p1}, Lcom/wiyun/engine/nodes/Director$5;-><init>(Lcom/wiyun/engine/nodes/Director;Ljava/lang/Runnable;)V */
(( com.wiyun.engine.nodes.Director$5 ) v0 ).start ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/nodes/Director$5;->start()V
return;
} // .end method
public native void runWithScene ( com.wiyun.engine.nodes.Scene p0 ) {
} // .end method
public native void set2DProjection ( ) {
} // .end method
public native void set3DProjection ( ) {
} // .end method
public void setAccelerometerDelay ( Integer p0 ) {
/* .locals 1 */
/* iput p1, p0, Lcom/wiyun/engine/nodes/Director;->mAccelDelay:I */
com.wiyun.engine.events.Accelerometer .getInstance ( );
(( com.wiyun.engine.events.Accelerometer ) v0 ).updateAccelerometerDelay ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/events/Accelerometer;->updateAccelerometerDelay()V
return;
} // .end method
public native void setAllowBackgroundRunning ( Boolean p0 ) {
} // .end method
public native void setAlphaBlending ( Boolean p0 ) {
} // .end method
public native void setBaseSize ( Integer p0, Integer p1 ) {
} // .end method
public native void setCalculateFPS ( Boolean p0 ) {
} // .end method
public native void setCullFace ( Boolean p0 ) {
} // .end method
public native void setDepthTest ( Boolean p0 ) {
} // .end method
public native void setDisplayFPS ( Boolean p0 ) {
} // .end method
public native void setFocusEnabled ( Boolean p0 ) {
} // .end method
public native void setMaxFrameRate ( Integer p0 ) {
} // .end method
public native void setNextDeltaTimeZero ( Boolean p0 ) {
} // .end method
public native void setProjection ( Integer p0 ) {
} // .end method
public native void setScaleMode ( Integer p0 ) {
} // .end method
public native void setTickFactor ( Float p0 ) {
} // .end method
