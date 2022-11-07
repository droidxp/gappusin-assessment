public class com.wiyun.engine.nodes.Director implements android.opengl.GLSurfaceView$Renderer {
	 /* .source "Director.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/wiyun/engine/nodes/Director$IDirectorLifecycleListener; */
	 /* } */
} // .end annotation
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
	 /* .prologue */
	 /* .line 240 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 /* .line 186 */
	 int v0 = 1; // const/4 v0, 0x1
	 /* iput v0, p0, Lcom/wiyun/engine/nodes/Director;->mAccelDelay:I */
	 /* .line 193 */
	 /* new-instance v0, Lcom/wiyun/engine/nodes/Director$1; */
	 /* invoke-direct {v0, p0}, Lcom/wiyun/engine/nodes/Director$1;-><init>(Lcom/wiyun/engine/nodes/Director;)V */
	 this.mHandler = v0;
	 /* .line 211 */
	 /* new-instance v0, Lcom/wiyun/engine/nodes/Director$2; */
	 /* invoke-direct {v0, p0}, Lcom/wiyun/engine/nodes/Director$2;-><init>(Lcom/wiyun/engine/nodes/Director;)V */
	 this.mReceiver = v0;
	 /* .line 242 */
	 /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/Director;->nativeInit()V */
	 /* .line 243 */
	 return;
} // .end method
static void access$0 ( com.wiyun.engine.nodes.Director p0 ) { //synthethic
	 /* .locals 0 */
	 /* .prologue */
	 /* .line 918 */
	 /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/Director;->drainAutoReleasePool()V */
	 return;
} // .end method
private native void drainAutoReleasePool ( ) {
} // .end method
static java.lang.String getCountry ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 545 */
	 java.util.Locale .getDefault ( );
	 (( java.util.Locale ) v0 ).getCountry ( ); // invoke-virtual {v0}, Ljava/util/Locale;->getCountry()Ljava/lang/String;
} // .end method
public static native Float getDefaultInDensity ( ) {
} // .end method
static java.lang.String getDeviceIMEI ( ) {
	 /* .locals 4 */
	 /* .prologue */
	 /* .line 962 */
	 com.wiyun.engine.nodes.Director .getInstance ( );
	 (( com.wiyun.engine.nodes.Director ) v3 ).getContext ( ); // invoke-virtual {v3}, Lcom/wiyun/engine/nodes/Director;->getContext()Landroid/content/Context;
	 /* .line 963 */
	 /* .local v0, "context":Landroid/content/Context; */
	 /* if-nez v0, :cond_1 */
	 /* .line 964 */
	 int v1 = 0; // const/4 v1, 0x0
	 /* .line 976 */
} // :cond_0
} // :goto_0
/* .line 967 */
} // :cond_1
int v1 = 0; // const/4 v1, 0x0
/* .line 968 */
/* .local v1, "deviceId":Ljava/lang/String; */
final String v3 = "android.permission.READ_PHONE_STATE"; // const-string v3, "android.permission.READ_PHONE_STATE"
v3 = (( android.content.Context ) v0 ).checkCallingOrSelfPermission ( v3 ); // invoke-virtual {v0, v3}, Landroid/content/Context;->checkCallingOrSelfPermission(Ljava/lang/String;)I
/* if-nez v3, :cond_0 */
/* .line 970 */
final String v3 = "phone"; // const-string v3, "phone"
(( android.content.Context ) v0 ).getSystemService ( v3 ); // invoke-virtual {v0, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v2, Landroid/telephony/TelephonyManager; */
/* .line 971 */
/* .local v2, "manager":Landroid/telephony/TelephonyManager; */
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 972 */
(( android.telephony.TelephonyManager ) v2 ).getDeviceId ( ); // invoke-virtual {v2}, Landroid/telephony/TelephonyManager;->getDeviceId()Ljava/lang/String;
} // .end method
static java.lang.String getDeviceUniqueString ( ) {
/* .locals 9 */
/* .prologue */
int v7 = 0; // const/4 v7, 0x0
/* .line 984 */
com.wiyun.engine.nodes.Director .getInstance ( );
(( com.wiyun.engine.nodes.Director ) v8 ).getContext ( ); // invoke-virtual {v8}, Lcom/wiyun/engine/nodes/Director;->getContext()Landroid/content/Context;
/* .line 985 */
/* .local v2, "context":Landroid/content/Context; */
/* if-nez v2, :cond_1 */
/* .line 1013 */
} // :cond_0
} // :goto_0
/* .line 989 */
} // :cond_1
com.wiyun.engine.nodes.Director .getDeviceIMEI ( );
/* .line 990 */
/* .local v3, "deviceId":Ljava/lang/String; */
if ( v3 != null) { // if-eqz v3, :cond_0
/* .line 994 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
/* .line 995 */
/* .local v1, "buf":Ljava/lang/StringBuilder; */
(( java.lang.StringBuilder ) v1 ).append ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 998 */
(( android.content.Context ) v2 ).getContentResolver ( ); // invoke-virtual {v2}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;
final String v8 = "android_id"; // const-string v8, "android_id"
android.provider.Settings$Secure .getString ( v7,v8 );
/* .line 999 */
/* .local v0, "androidId":Ljava/lang/String; */
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 1002 */
(( android.content.Context ) v2 ).getResources ( ); // invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v7 ).getDisplayMetrics ( ); // invoke-virtual {v7}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
/* .line 1003 */
/* .local v4, "dm":Landroid/util/DisplayMetrics; */
/* iget v7, v4, Landroid/util/DisplayMetrics;->density:F */
(( java.lang.StringBuilder ) v1 ).append ( v7 ); // invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
/* .line 1006 */
final String v7 = "wifi"; // const-string v7, "wifi"
(( android.content.Context ) v2 ).getSystemService ( v7 ); // invoke-virtual {v2, v7}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v6, Landroid/net/wifi/WifiManager; */
/* .line 1007 */
/* .local v6, "wm":Landroid/net/wifi/WifiManager; */
if ( v6 != null) { // if-eqz v6, :cond_2
/* .line 1008 */
(( android.net.wifi.WifiManager ) v6 ).getConnectionInfo ( ); // invoke-virtual {v6}, Landroid/net/wifi/WifiManager;->getConnectionInfo()Landroid/net/wifi/WifiInfo;
/* .line 1009 */
/* .local v5, "info":Landroid/net/wifi/WifiInfo; */
if ( v5 != null) { // if-eqz v5, :cond_2
/* .line 1010 */
(( android.net.wifi.WifiInfo ) v5 ).getMacAddress ( ); // invoke-virtual {v5}, Landroid/net/wifi/WifiInfo;->getMacAddress()Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( v7 ); // invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 1013 */
} // .end local v5 # "info":Landroid/net/wifi/WifiInfo;
} // :cond_2
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
public static com.wiyun.engine.nodes.Director getInstance ( ) {
/* .locals 2 */
/* .prologue */
/* .line 227 */
/* const-class v1, Lcom/wiyun/engine/nodes/Director; */
/* monitor-enter v1 */
/* .line 228 */
try { // :try_start_0
v0 = com.wiyun.engine.nodes.Director.sInstance;
/* if-nez v0, :cond_0 */
/* .line 229 */
/* new-instance v0, Lcom/wiyun/engine/nodes/Director; */
/* invoke-direct {v0}, Lcom/wiyun/engine/nodes/Director;-><init>()V */
/* .line 230 */
com.wiyun.engine.nodes.Director .preloadClasses ( );
/* .line 232 */
} // :cond_0
v0 = com.wiyun.engine.nodes.Director.sInstance;
/* monitor-exit v1 */
/* .line 227 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit v1 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v0 */
} // .end method
public static com.wiyun.engine.nodes.Director getInstanceNoCreate ( ) {
/* .locals 1 */
/* .prologue */
/* .line 237 */
v0 = com.wiyun.engine.nodes.Director.sInstance;
} // .end method
static java.lang.String getLanguage ( ) {
/* .locals 1 */
/* .prologue */
/* .line 541 */
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
/* .prologue */
/* .line 1021 */
android.os.Environment .getExternalStorageState ( );
/* .line 1022 */
/* .local v0, "t":Ljava/lang/String; */
final String v1 = "mounted"; // const-string v1, "mounted"
v1 = (( java.lang.String ) v1 ).equals ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
} // .end method
static Boolean hasPermission ( java.lang.String p0 ) {
/* .locals 4 */
/* .param p0, "permission" # Ljava/lang/String; */
/* .prologue */
int v1 = 0; // const/4 v1, 0x0
/* .line 953 */
com.wiyun.engine.nodes.Director .getInstance ( );
(( com.wiyun.engine.nodes.Director ) v2 ).getContext ( ); // invoke-virtual {v2}, Lcom/wiyun/engine/nodes/Director;->getContext()Landroid/content/Context;
/* .line 954 */
/* .local v0, "context":Landroid/content/Context; */
/* if-nez v0, :cond_1 */
/* .line 957 */
} // :cond_0
} // :goto_0
} // :cond_1
v2 = (( android.content.Context ) v0 ).checkCallingOrSelfPermission ( p0 ); // invoke-virtual {v0, p0}, Landroid/content/Context;->checkCallingOrSelfPermission(Ljava/lang/String;)I
int v3 = -1; // const/4 v3, -0x1
/* if-ne v2, v3, :cond_0 */
int v1 = 1; // const/4 v1, 0x1
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
/* .param p0, "url" # Ljava/lang/String; */
/* .prologue */
/* .line 564 */
try { // :try_start_0
v2 = com.wiyun.engine.nodes.Director.sInstance;
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 565 */
v2 = com.wiyun.engine.nodes.Director.sInstance;
(( com.wiyun.engine.nodes.Director ) v2 ).getContext ( ); // invoke-virtual {v2}, Lcom/wiyun/engine/nodes/Director;->getContext()Landroid/content/Context;
/* .line 566 */
/* .local v0, "context":Landroid/content/Context; */
/* new-instance v1, Landroid/content/Intent; */
final String v2 = "android.intent.action.VIEW"; // const-string v2, "android.intent.action.VIEW"
/* invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V */
/* .line 567 */
/* .local v1, "intent":Landroid/content/Intent; */
android.net.Uri .parse ( p0 );
(( android.content.Intent ) v1 ).setData ( v2 ); // invoke-virtual {v1, v2}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;
/* .line 568 */
(( android.content.Context ) v0 ).startActivity ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 572 */
} // .end local v0 # "context":Landroid/content/Context;
} // .end local v1 # "intent":Landroid/content/Intent;
} // :cond_0
} // :goto_0
return;
/* .line 570 */
/* :catch_0 */
/* move-exception v2 */
} // .end method
static void preloadClasses ( ) {
/* .locals 1 */
/* .prologue */
/* .line 255 */
/* const-class v0, Lcom/wiyun/engine/sound/AudioManager; */
/* .line 256 */
/* .local v0, "klass":Ljava/lang/Class;, "Ljava/lang/Class<*>;" */
/* const-class v0, Landroid/media/MediaPlayer; */
/* .line 257 */
/* const-class v0, Landroid/media/SoundPool; */
/* .line 258 */
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
/* .locals 3 */
/* .param p0, "v" # Landroid/view/View; */
/* .prologue */
/* .line 556 */
v1 = com.wiyun.engine.nodes.Director.sInstance;
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 557 */
v1 = com.wiyun.engine.nodes.Director.sInstance;
v1 = this.mHandler;
int v2 = 5; // const/4 v2, 0x5
android.os.Message .obtain ( v1,v2,p0 );
/* .line 558 */
/* .local v0, "msg":Landroid/os/Message; */
v1 = com.wiyun.engine.nodes.Director.sInstance;
v1 = this.mHandler;
(( android.os.Handler ) v1 ).sendMessage ( v0 ); // invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
/* .line 560 */
} // .end local v0 # "msg":Landroid/os/Message;
} // :cond_0
return;
} // .end method
static void setViewVisible ( android.view.View p0 ) {
/* .locals 3 */
/* .param p0, "v" # Landroid/view/View; */
/* .prologue */
/* .line 549 */
v1 = com.wiyun.engine.nodes.Director.sInstance;
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 550 */
v1 = com.wiyun.engine.nodes.Director.sInstance;
v1 = this.mHandler;
int v2 = 4; // const/4 v2, 0x4
android.os.Message .obtain ( v1,v2,p0 );
/* .line 551 */
/* .local v0, "msg":Landroid/os/Message; */
v1 = com.wiyun.engine.nodes.Director.sInstance;
v1 = this.mHandler;
(( android.os.Handler ) v1 ).sendMessage ( v0 ); // invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
/* .line 553 */
} // .end local v0 # "msg":Landroid/os/Message;
} // :cond_0
return;
} // .end method
static void showAlertDialog ( java.lang.String p0, java.lang.String p1, java.lang.String p2, Integer p3 ) {
/* .locals 6 */
/* .param p0, "title" # Ljava/lang/String; */
/* .param p1, "text" # Ljava/lang/String; */
/* .param p2, "positiveButton" # Ljava/lang/String; */
/* .param p3, "okSelectorPointer" # I */
/* .prologue */
/* .line 501 */
com.wiyun.engine.nodes.Director .getInstance ( );
(( com.wiyun.engine.nodes.Director ) v0 ).getContext ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/nodes/Director;->getContext()Landroid/content/Context;
/* check-cast v1, Landroid/app/Activity; */
/* .line 502 */
/* .local v1, "act":Landroid/app/Activity; */
/* new-instance v0, Lcom/wiyun/engine/nodes/Director$4; */
/* move-object v2, p0 */
/* move-object v3, p1 */
/* move-object v4, p2 */
/* move v5, p3 */
/* invoke-direct/range {v0 ..v5}, Lcom/wiyun/engine/nodes/Director$4;-><init>(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V */
(( android.app.Activity ) v1 ).runOnUiThread ( v0 ); // invoke-virtual {v1, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V
/* .line 524 */
return;
} // .end method
static void showConfirmDialog ( java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, Integer p4, Integer p5 ) {
/* .locals 8 */
/* .param p0, "title" # Ljava/lang/String; */
/* .param p1, "text" # Ljava/lang/String; */
/* .param p2, "positiveButton" # Ljava/lang/String; */
/* .param p3, "negativeButton" # Ljava/lang/String; */
/* .param p4, "okSelectorPointer" # I */
/* .param p5, "cancelSelectorPointer" # I */
/* .prologue */
/* .line 461 */
com.wiyun.engine.nodes.Director .getInstance ( );
(( com.wiyun.engine.nodes.Director ) v0 ).getContext ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/nodes/Director;->getContext()Landroid/content/Context;
/* check-cast v1, Landroid/app/Activity; */
/* .line 462 */
/* .local v1, "act":Landroid/app/Activity; */
/* new-instance v0, Lcom/wiyun/engine/nodes/Director$3; */
/* move-object v2, p0 */
/* move-object v3, p1 */
/* move-object v4, p2 */
/* move-object v5, p3 */
/* move v6, p4 */
/* move v7, p5 */
/* invoke-direct/range {v0 ..v7}, Lcom/wiyun/engine/nodes/Director$3;-><init>(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V */
(( android.app.Activity ) v1 ).runOnUiThread ( v0 ); // invoke-virtual {v1, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V
/* .line 497 */
return;
} // .end method
/* # virtual methods */
public native void addLifecycleListener ( com.wiyun.engine.nodes.Director$IDirectorLifecycleListener p0 ) {
} // .end method
public void attachContext ( android.content.Context p0 ) {
/* .locals 4 */
/* .param p1, "context" # Landroid/content/Context; */
/* .prologue */
/* .line 298 */
/* invoke-direct {p0, p1}, Lcom/wiyun/engine/nodes/Director;->nativeAttachContext(Landroid/content/Context;)V */
/* .line 300 */
(( com.wiyun.engine.nodes.Director ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/nodes/Director;->getContext()Landroid/content/Context;
/* .line 301 */
/* .local v1, "newCtx":Landroid/content/Context; */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 302 */
/* new-instance v0, Landroid/content/IntentFilter; */
/* invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V */
/* .line 303 */
/* .local v0, "filter":Landroid/content/IntentFilter; */
final String v2 = "android.intent.action.SCREEN_OFF"; // const-string v2, "android.intent.action.SCREEN_OFF"
(( android.content.IntentFilter ) v0 ).addAction ( v2 ); // invoke-virtual {v0, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V
/* .line 304 */
v2 = this.mReceiver;
(( android.content.Context ) v1 ).registerReceiver ( v2, v0 ); // invoke-virtual {v1, v2, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
/* .line 307 */
final String v2 = "com.wiyun.engine"; // const-string v2, "com.wiyun.engine"
(( android.content.Context ) v1 ).getPackageName ( ); // invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
v2 = (( java.lang.String ) v2 ).equals ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v2, :cond_0 */
/* .line 308 */
com.wiyun.engine.nodes._A .s ( v1 );
/* .line 310 */
} // .end local v0 # "filter":Landroid/content/IntentFilter;
} // :cond_0
return;
} // .end method
public native void attachInView ( com.wiyun.engine.opengl.WYGLSurfaceView p0 ) {
} // .end method
public com.wiyun.engine.types.WYPoint convertToGL ( Float p0, Float p1 ) {
/* .locals 3 */
/* .param p1, "uiPointX" # F */
/* .param p2, "uiPointY" # F */
/* .prologue */
/* .line 331 */
v0 = /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/Director;->getScaleMode()I */
/* if-nez v0, :cond_0 */
/* .line 332 */
v0 = /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/Director;->getSurfaceHeight()I */
/* int-to-float v0, v0 */
/* sub-float/2addr v0, p2 */
com.wiyun.engine.types.WYPoint .make ( p1,v0 );
/* .line 334 */
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
/* .prologue */
int v2 = 0; // const/4 v2, 0x0
/* .line 367 */
(( com.wiyun.engine.nodes.Director ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/nodes/Director;->getContext()Landroid/content/Context;
/* .line 368 */
/* .local v0, "context":Landroid/content/Context; */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 370 */
v1 = this.mReceiver;
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 371 */
v1 = this.mReceiver;
(( android.content.Context ) v0 ).unregisterReceiver ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
/* .line 372 */
this.mReceiver = v2;
/* .line 376 */
} // :cond_0
v1 = com.wiyun.engine.nodes.Director.sInstance;
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 378 */
/* invoke-direct {p0}, Lcom/wiyun/engine/nodes/Director;->nativeDestroy()V */
/* .line 381 */
/* .line 384 */
} // :cond_1
return;
} // .end method
public Integer getAccelerometerDelay ( ) {
/* .locals 1 */
/* .prologue */
/* .line 279 */
/* iget v0, p0, Lcom/wiyun/engine/nodes/Director;->mAccelDelay:I */
} // .end method
public native android.content.Context getContext ( ) {
} // .end method
public native Float getCurrentFrameRate ( ) {
} // .end method
public android.os.Handler getHandler ( ) {
/* .locals 1 */
/* .prologue */
/* .line 1017 */
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
/* .prologue */
/* .line 624 */
/* new-instance v0, Lcom/wiyun/engine/nodes/Scene; */
v1 = /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/Director;->nativeGetPreviousScene()I */
/* invoke-direct {v0, v1}, Lcom/wiyun/engine/nodes/Scene;-><init>(I)V */
} // .end method
public native Integer getProjection ( ) {
} // .end method
public com.wiyun.engine.nodes.Scene getRunningScene ( ) {
/* .locals 2 */
/* .prologue */
/* .line 674 */
/* new-instance v0, Lcom/wiyun/engine/nodes/Scene; */
v1 = /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/Director;->nativeGetRunningScene()I */
/* invoke-direct {v0, v1}, Lcom/wiyun/engine/nodes/Scene;-><init>(I)V */
} // .end method
public native Float getTickFactor ( ) {
} // .end method
public com.wiyun.engine.types.WYSize getWindowSize ( ) {
/* .locals 2 */
/* .prologue */
/* .line 769 */
v0 = /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/Director;->getSurfaceWidth()I */
/* int-to-float v0, v0 */
v1 = /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/Director;->getSurfaceHeight()I */
/* int-to-float v1, v1 */
com.wiyun.engine.types.WYSize .make ( v0,v1 );
} // .end method
void internalEnd ( ) {
/* .locals 4 */
/* .prologue */
int v3 = 0; // const/4 v3, 0x0
/* .line 344 */
(( com.wiyun.engine.nodes.Director ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/nodes/Director;->getContext()Landroid/content/Context;
/* .line 345 */
/* .local v1, "context":Landroid/content/Context; */
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 347 */
v2 = this.mReceiver;
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 348 */
v2 = this.mReceiver;
(( android.content.Context ) v1 ).unregisterReceiver ( v2 ); // invoke-virtual {v1, v2}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
/* .line 349 */
this.mReceiver = v3;
/* .line 353 */
} // :cond_0
/* instance-of v2, v1, Landroid/app/Activity; */
if ( v2 != null) { // if-eqz v2, :cond_2
/* move-object v0, v1 */
/* .line 354 */
/* check-cast v0, Landroid/app/Activity; */
/* .line 355 */
/* .local v0, "act":Landroid/app/Activity; */
(( android.app.Activity ) v0 ).finish ( ); // invoke-virtual {v0}, Landroid/app/Activity;->finish()V
/* .line 364 */
} // .end local v0 # "act":Landroid/app/Activity;
} // :cond_1
} // :goto_0
return;
/* .line 356 */
} // :cond_2
v2 = com.wiyun.engine.nodes.Director.sInstance;
if ( v2 != null) { // if-eqz v2, :cond_1
/* .line 358 */
/* invoke-direct {p0}, Lcom/wiyun/engine/nodes/Director;->nativeDestroy()V */
/* .line 361 */
} // .end method
public native Boolean isAllowBackgroundRunning ( ) {
} // .end method
public native Boolean isExtensionSupported ( java.lang.String p0 ) {
} // .end method
public native Boolean isFocusEnabled ( ) {
} // .end method
public Boolean isPortrait ( ) {
/* .locals 3 */
/* .prologue */
/* .line 389 */
(( com.wiyun.engine.nodes.Director ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/nodes/Director;->getContext()Landroid/content/Context;
final String v2 = "window"; // const-string v2, "window"
(( android.content.Context ) v1 ).getSystemService ( v2 ); // invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v1, Landroid/view/WindowManager; */
/* .line 390 */
/* .local v0, "display":Landroid/view/Display; */
v1 = (( android.view.Display ) v0 ).getOrientation ( ); // invoke-virtual {v0}, Landroid/view/Display;->getOrientation()I
/* if-nez v1, :cond_0 */
int v1 = 1; // const/4 v1, 0x1
} // :goto_0
} // :cond_0
int v1 = 0; // const/4 v1, 0x0
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
/* .param p1, "gl" # Ljavax/microedition/khronos/opengles/GL10; */
/* .prologue */
/* .line 575 */
/* invoke-direct {p0}, Lcom/wiyun/engine/nodes/Director;->nativeOnDrawFrame()V */
/* .line 576 */
return;
} // .end method
public void onSurfaceChanged ( javax.microedition.khronos.opengles.GL10 p0, Integer p1, Integer p2 ) {
/* .locals 0 */
/* .param p1, "gl" # Ljavax/microedition/khronos/opengles/GL10; */
/* .param p2, "width" # I */
/* .param p3, "height" # I */
/* .prologue */
/* .line 581 */
/* invoke-direct {p0, p2, p3}, Lcom/wiyun/engine/nodes/Director;->nativeOnSurfaceChanged(II)V */
/* .line 582 */
return;
} // .end method
public void onSurfaceCreated ( javax.microedition.khronos.opengles.GL10 p0, javax.microedition.khronos.egl.EGLConfig p1 ) {
/* .locals 1 */
/* .param p1, "gl" # Ljavax/microedition/khronos/opengles/GL10; */
/* .param p2, "config" # Ljavax/microedition/khronos/egl/EGLConfig; */
/* .prologue */
/* .line 585 */
com.wiyun.engine.nodes.Director .getInstance ( );
this.gl = p1;
/* .line 586 */
/* invoke-direct {p0}, Lcom/wiyun/engine/nodes/Director;->nativeOnSurfaceCreated()V */
/* .line 587 */
return;
} // .end method
public void onSurfaceDestroyed ( ) {
/* .locals 2 */
/* .prologue */
/* .line 590 */
com.wiyun.engine.nodes.Director .getInstance ( );
int v1 = 0; // const/4 v1, 0x0
this.gl = v1;
/* .line 591 */
/* invoke-direct {p0}, Lcom/wiyun/engine/nodes/Director;->nativeOnSurfaceDestroyed()V */
/* .line 592 */
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
/* .param p1, "runnable" # Ljava/lang/Runnable; */
/* .prologue */
/* .line 909 */
/* new-instance v0, Lcom/wiyun/engine/nodes/Director$5; */
/* invoke-direct {v0, p0, p1}, Lcom/wiyun/engine/nodes/Director$5;-><init>(Lcom/wiyun/engine/nodes/Director;Ljava/lang/Runnable;)V */
/* .line 914 */
(( com.wiyun.engine.nodes.Director$5 ) v0 ).start ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/nodes/Director$5;->start()V
/* .line 915 */
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
/* .param p1, "delay" # I */
/* .prologue */
/* .line 269 */
/* iput p1, p0, Lcom/wiyun/engine/nodes/Director;->mAccelDelay:I */
/* .line 270 */
com.wiyun.engine.events.Accelerometer .getInstance ( );
(( com.wiyun.engine.events.Accelerometer ) v0 ).updateAccelerometerDelay ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/events/Accelerometer;->updateAccelerometerDelay()V
/* .line 271 */
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
