public class com.ansca.corona.Controller {
	 /* .source "Controller.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/ansca/corona/Controller$SuperRewardsRequestUpdateTask; */
	 /* } */
} // .end annotation
/* # static fields */
private static final java.lang.String FACEBOOK_SESSION_PREFERENCES_NAME;
private static final java.lang.String FACEBOOK_SESSION_PREFERENCE_ACCESS_TOKEN_KEY;
private static final java.lang.String FACEBOOK_SESSION_PREFERENCE_EXPIRATION_TIME_KEY;
private static final Integer IMAGE_SOURCE_CAMERA;
private static final Integer IMAGE_SOURCE_PHOTO_LIBRARY;
private static final Integer IMAGE_SOURCE_SAVED_PHOTOS_ALBUM;
static final Integer kLocaleCountry;
static final Integer kLocaleIdentifier;
static final Integer kLocaleLanguage;
static final Integer kUILanguage;
static com.ansca.corona.Controller theController;
/* # instance fields */
private com.ansca.corona.CoronaActivity myActivity;
private com.ansca.corona.ActivityIndicatorDialog myActivityIndicatorDialog;
private com.ansca.corona.AdManager myAdManager;
private android.app.AlertDialog myAlertDialog;
private com.ansca.corona.version.IAndroidVersionSpecific myAndroidVersion;
private com.ansca.corona.NativeToJavaBridge myBridge;
private com.ansca.corona.events.EventManager myEventManager;
private com.facebook.android.Facebook myFacebook;
private com.facebook.android.AsyncFacebookRunner myFacebookRunner;
private Boolean myFlurrySessionStarted;
private Boolean myIdleEnabled;
private Boolean myInitialResume;
private Boolean myIsNaturalOrientationPortrait;
private Boolean myIsResumed;
private com.ansca.corona.MediaManager myMediaManager;
private Boolean myOpenFeintInited;
private java.lang.String myRewardsAppId;
private Boolean myRewardsInitialized;
private com.adknowledge.superrewards.tracking.SRAppInstallTracker myRewardsTracker;
private java.lang.String myRewardsUid;
private com.ansca.corona.CoronaRuntime myRuntime;
private com.ansca.corona.CoronaSensorManager mySensorManager;
private android.os.Handler myTimerHandler;
private Integer myTimerMilliseconds;
private java.lang.Runnable myTimerTask;
/* # direct methods */
private com.ansca.corona.Controller ( ) {
	 /* .locals 6 */
	 /* .param p1, "activity" # Lcom/ansca/corona/CoronaActivity; */
	 /* .prologue */
	 int v3 = 1; // const/4 v3, 0x1
	 int v4 = 0; // const/4 v4, 0x0
	 /* .line 120 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 /* .line 75 */
	 /* iput-boolean v4, p0, Lcom/ansca/corona/Controller;->myIsResumed:Z */
	 /* .line 77 */
	 /* iput-boolean v3, p0, Lcom/ansca/corona/Controller;->myIsNaturalOrientationPortrait:Z */
	 /* .line 79 */
	 /* new-instance v2, Landroid/os/Handler; */
	 /* invoke-direct {v2}, Landroid/os/Handler;-><init>()V */
	 this.myTimerHandler = v2;
	 /* .line 87 */
	 int v2 = 0; // const/4 v2, 0x0
	 this.myActivityIndicatorDialog = v2;
	 /* .line 96 */
	 /* iput-boolean v4, p0, Lcom/ansca/corona/Controller;->myOpenFeintInited:Z */
	 /* .line 97 */
	 /* iput-boolean v4, p0, Lcom/ansca/corona/Controller;->myFlurrySessionStarted:Z */
	 /* .line 103 */
	 /* iput-boolean v4, p0, Lcom/ansca/corona/Controller;->myRewardsInitialized:Z */
	 /* .line 122 */
	 this.myActivity = p1;
	 /* .line 125 */
	 /* new-instance v2, Lcom/ansca/corona/CoronaRuntime; */
	 /* invoke-direct {v2}, Lcom/ansca/corona/CoronaRuntime;-><init>()V */
	 this.myRuntime = v2;
	 /* .line 126 */
	 /* new-instance v2, Lcom/ansca/corona/NativeToJavaBridge; */
	 /* invoke-direct {v2, p1}, Lcom/ansca/corona/NativeToJavaBridge;-><init>(Lcom/ansca/corona/CoronaActivity;)V */
	 this.myBridge = v2;
	 /* .line 127 */
	 /* new-instance v2, Lcom/ansca/corona/AdManager; */
	 /* invoke-direct {v2, p1}, Lcom/ansca/corona/AdManager;-><init>(Landroid/app/Activity;)V */
	 this.myAdManager = v2;
	 /* .line 128 */
	 /* new-instance v2, Lcom/ansca/corona/MediaManager; */
	 /* invoke-direct {v2, p1}, Lcom/ansca/corona/MediaManager;-><init>(Lcom/ansca/corona/CoronaActivity;)V */
	 this.myMediaManager = v2;
	 /* .line 129 */
	 /* new-instance v2, Lcom/ansca/corona/CoronaSensorManager; */
	 /* invoke-direct {v2}, Lcom/ansca/corona/CoronaSensorManager;-><init>()V */
	 this.mySensorManager = v2;
	 /* .line 130 */
	 /* new-instance v2, Lcom/ansca/corona/events/EventManager; */
	 /* invoke-direct {v2}, Lcom/ansca/corona/events/EventManager;-><init>()V */
	 this.myEventManager = v2;
	 /* .line 134 */
	 final String v1 = "window"; // const-string v1, "window"
	 /* .line 135 */
	 /* .local v1, "windowServiceName":Ljava/lang/String; */
	 (( com.ansca.corona.CoronaActivity ) p1 ).getSystemService ( v1 ); // invoke-virtual {p1, v1}, Lcom/ansca/corona/CoronaActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
	 /* check-cast v2, Landroid/view/WindowManager; */
	 /* .line 136 */
	 /* .local v0, "display":Landroid/view/Display; */
	 v2 = 	 (( android.view.Display ) v0 ).getRotation ( ); // invoke-virtual {v0}, Landroid/view/Display;->getRotation()I
	 /* packed-switch v2, :pswitch_data_0 */
	 /* .line 147 */
	 /* iput-boolean v3, p0, Lcom/ansca/corona/Controller;->myIsNaturalOrientationPortrait:Z */
	 /* .line 150 */
} // :goto_0
return;
/* .line 139 */
/* :pswitch_0 */
v2 = (( android.view.Display ) v0 ).getWidth ( ); // invoke-virtual {v0}, Landroid/view/Display;->getWidth()I
v5 = (( android.view.Display ) v0 ).getHeight ( ); // invoke-virtual {v0}, Landroid/view/Display;->getHeight()I
/* if-ge v2, v5, :cond_0 */
/* move v2, v3 */
} // :goto_1
/* iput-boolean v2, p0, Lcom/ansca/corona/Controller;->myIsNaturalOrientationPortrait:Z */
} // :cond_0
/* move v2, v4 */
/* .line 143 */
/* :pswitch_1 */
v2 = (( android.view.Display ) v0 ).getWidth ( ); // invoke-virtual {v0}, Landroid/view/Display;->getWidth()I
v5 = (( android.view.Display ) v0 ).getHeight ( ); // invoke-virtual {v0}, Landroid/view/Display;->getHeight()I
/* if-le v2, v5, :cond_1 */
} // :goto_2
/* iput-boolean v3, p0, Lcom/ansca/corona/Controller;->myIsNaturalOrientationPortrait:Z */
} // :cond_1
/* move v3, v4 */
/* .line 136 */
/* :pswitch_data_0 */
/* .packed-switch 0x0 */
/* :pswitch_0 */
/* :pswitch_1 */
/* :pswitch_0 */
/* :pswitch_1 */
} // .end packed-switch
} // .end method
static Boolean access$000 ( com.ansca.corona.Controller p0 ) { //synthethic
/* .locals 1 */
/* .param p0, "x0" # Lcom/ansca/corona/Controller; */
/* .prologue */
/* .line 71 */
/* iget-boolean v0, p0, Lcom/ansca/corona/Controller;->myIsResumed:Z */
} // .end method
static Boolean access$002 ( com.ansca.corona.Controller p0, Boolean p1 ) { //synthethic
/* .locals 0 */
/* .param p0, "x0" # Lcom/ansca/corona/Controller; */
/* .param p1, "x1" # Z */
/* .prologue */
/* .line 71 */
/* iput-boolean p1, p0, Lcom/ansca/corona/Controller;->myIsResumed:Z */
} // .end method
static Integer access$100 ( com.ansca.corona.Controller p0 ) { //synthethic
/* .locals 1 */
/* .param p0, "x0" # Lcom/ansca/corona/Controller; */
/* .prologue */
/* .line 71 */
/* iget v0, p0, Lcom/ansca/corona/Controller;->myTimerMilliseconds:I */
} // .end method
static java.lang.String access$1000 ( com.ansca.corona.Controller p0 ) { //synthethic
/* .locals 1 */
/* .param p0, "x0" # Lcom/ansca/corona/Controller; */
/* .prologue */
/* .line 71 */
v0 = this.myRewardsUid;
} // .end method
static android.os.Handler access$200 ( com.ansca.corona.Controller p0 ) { //synthethic
/* .locals 1 */
/* .param p0, "x0" # Lcom/ansca/corona/Controller; */
/* .prologue */
/* .line 71 */
v0 = this.myTimerHandler;
} // .end method
static com.ansca.corona.CoronaActivity access$300 ( com.ansca.corona.Controller p0 ) { //synthethic
/* .locals 1 */
/* .param p0, "x0" # Lcom/ansca/corona/Controller; */
/* .prologue */
/* .line 71 */
v0 = this.myActivity;
} // .end method
static android.app.AlertDialog access$400 ( com.ansca.corona.Controller p0 ) { //synthethic
/* .locals 1 */
/* .param p0, "x0" # Lcom/ansca/corona/Controller; */
/* .prologue */
/* .line 71 */
v0 = this.myAlertDialog;
} // .end method
static android.app.AlertDialog access$402 ( com.ansca.corona.Controller p0, android.app.AlertDialog p1 ) { //synthethic
/* .locals 0 */
/* .param p0, "x0" # Lcom/ansca/corona/Controller; */
/* .param p1, "x1" # Landroid/app/AlertDialog; */
/* .prologue */
/* .line 71 */
this.myAlertDialog = p1;
} // .end method
static com.ansca.corona.ActivityIndicatorDialog access$500 ( com.ansca.corona.Controller p0 ) { //synthethic
/* .locals 1 */
/* .param p0, "x0" # Lcom/ansca/corona/Controller; */
/* .prologue */
/* .line 71 */
v0 = this.myActivityIndicatorDialog;
} // .end method
static com.ansca.corona.ActivityIndicatorDialog access$502 ( com.ansca.corona.Controller p0, com.ansca.corona.ActivityIndicatorDialog p1 ) { //synthethic
/* .locals 0 */
/* .param p0, "x0" # Lcom/ansca/corona/Controller; */
/* .param p1, "x1" # Lcom/ansca/corona/ActivityIndicatorDialog; */
/* .prologue */
/* .line 71 */
this.myActivityIndicatorDialog = p1;
} // .end method
static com.facebook.android.Facebook access$600 ( com.ansca.corona.Controller p0 ) { //synthethic
/* .locals 1 */
/* .param p0, "x0" # Lcom/ansca/corona/Controller; */
/* .prologue */
/* .line 71 */
v0 = this.myFacebook;
} // .end method
static Boolean access$702 ( com.ansca.corona.Controller p0, Boolean p1 ) { //synthethic
/* .locals 0 */
/* .param p0, "x0" # Lcom/ansca/corona/Controller; */
/* .param p1, "x1" # Z */
/* .prologue */
/* .line 71 */
/* iput-boolean p1, p0, Lcom/ansca/corona/Controller;->myOpenFeintInited:Z */
} // .end method
static com.adknowledge.superrewards.tracking.SRAppInstallTracker access$800 ( com.ansca.corona.Controller p0 ) { //synthethic
/* .locals 1 */
/* .param p0, "x0" # Lcom/ansca/corona/Controller; */
/* .prologue */
/* .line 71 */
v0 = this.myRewardsTracker;
} // .end method
static com.adknowledge.superrewards.tracking.SRAppInstallTracker access$802 ( com.ansca.corona.Controller p0, com.adknowledge.superrewards.tracking.SRAppInstallTracker p1 ) { //synthethic
/* .locals 0 */
/* .param p0, "x0" # Lcom/ansca/corona/Controller; */
/* .param p1, "x1" # Lcom/adknowledge/superrewards/tracking/SRAppInstallTracker; */
/* .prologue */
/* .line 71 */
this.myRewardsTracker = p1;
} // .end method
static java.lang.String access$900 ( com.ansca.corona.Controller p0 ) { //synthethic
/* .locals 1 */
/* .param p0, "x0" # Lcom/ansca/corona/Controller; */
/* .prologue */
/* .line 71 */
v0 = this.myRewardsAppId;
} // .end method
public static void create ( com.ansca.corona.CoronaActivity p0 ) {
/* .locals 1 */
/* .param p0, "activity" # Lcom/ansca/corona/CoronaActivity; */
/* .prologue */
/* .line 110 */
v0 = com.ansca.corona.Controller.theController;
/* if-nez v0, :cond_0 */
/* .line 111 */
/* new-instance v0, Lcom/ansca/corona/Controller; */
/* invoke-direct {v0, p0}, Lcom/ansca/corona/Controller;-><init>(Lcom/ansca/corona/CoronaActivity;)V */
/* .line 112 */
v0 = com.ansca.corona.Controller.theController;
/* invoke-direct {v0}, Lcom/ansca/corona/Controller;->init()V */
/* .line 114 */
} // :cond_0
return;
} // .end method
public static com.ansca.corona.CoronaActivity getActivity ( ) {
/* .locals 1 */
/* .prologue */
/* .line 254 */
v0 = com.ansca.corona.Controller.theController;
/* if-nez v0, :cond_0 */
/* .line 255 */
int v0 = 0; // const/4 v0, 0x0
/* .line 257 */
} // :goto_0
} // :cond_0
v0 = com.ansca.corona.Controller.theController;
v0 = this.myActivity;
} // .end method
public static com.ansca.corona.AdManager getAdManager ( ) {
/* .locals 1 */
/* .prologue */
/* .line 282 */
v0 = com.ansca.corona.Controller.theController;
/* if-nez v0, :cond_0 */
/* .line 283 */
int v0 = 0; // const/4 v0, 0x0
/* .line 285 */
} // :goto_0
} // :cond_0
v0 = com.ansca.corona.Controller.theController;
v0 = this.myAdManager;
} // .end method
public static com.ansca.corona.version.IAndroidVersionSpecific getAndroidVersionSpecific ( ) {
/* .locals 1 */
/* .prologue */
/* .line 163 */
v0 = com.ansca.corona.Controller.theController;
/* if-nez v0, :cond_0 */
/* .line 164 */
int v0 = 0; // const/4 v0, 0x0
/* .line 166 */
} // :goto_0
} // :cond_0
v0 = com.ansca.corona.Controller.theController;
v0 = this.myAndroidVersion;
} // .end method
public static com.ansca.corona.NativeToJavaBridge getBridge ( ) {
/* .locals 1 */
/* .prologue */
/* .line 275 */
v0 = com.ansca.corona.Controller.theController;
/* if-nez v0, :cond_0 */
/* .line 276 */
int v0 = 0; // const/4 v0, 0x0
/* .line 278 */
} // :goto_0
} // :cond_0
v0 = com.ansca.corona.Controller.theController;
v0 = this.myBridge;
} // .end method
public static com.ansca.corona.Controller getController ( ) {
/* .locals 1 */
/* .prologue */
/* .line 117 */
v0 = com.ansca.corona.Controller.theController;
} // .end method
public static com.ansca.corona.events.EventManager getEventManager ( ) {
/* .locals 1 */
/* .prologue */
/* .line 268 */
v0 = com.ansca.corona.Controller.theController;
/* if-nez v0, :cond_0 */
/* .line 269 */
int v0 = 0; // const/4 v0, 0x0
/* .line 271 */
} // :goto_0
} // :cond_0
v0 = com.ansca.corona.Controller.theController;
v0 = this.myEventManager;
} // .end method
public static com.ansca.corona.MediaManager getMediaManager ( ) {
/* .locals 1 */
/* .prologue */
/* .line 289 */
v0 = com.ansca.corona.Controller.theController;
/* if-nez v0, :cond_0 */
/* .line 290 */
int v0 = 0; // const/4 v0, 0x0
/* .line 292 */
} // :goto_0
} // :cond_0
v0 = com.ansca.corona.Controller.theController;
v0 = this.myMediaManager;
} // .end method
public static com.ansca.corona.CoronaRuntime getRuntime ( ) {
/* .locals 1 */
/* .prologue */
/* .line 261 */
v0 = com.ansca.corona.Controller.theController;
/* if-nez v0, :cond_0 */
/* .line 262 */
int v0 = 0; // const/4 v0, 0x0
/* .line 264 */
} // :goto_0
} // :cond_0
v0 = com.ansca.corona.Controller.theController;
v0 = this.myRuntime;
} // .end method
private synchronized void init ( ) {
/* .locals 1 */
/* .prologue */
/* .line 153 */
/* monitor-enter p0 */
try { // :try_start_0
v0 = this.myMediaManager;
(( com.ansca.corona.MediaManager ) v0 ).init ( ); // invoke-virtual {v0}, Lcom/ansca/corona/MediaManager;->init()V
/* .line 154 */
v0 = this.mySensorManager;
(( com.ansca.corona.CoronaSensorManager ) v0 ).init ( ); // invoke-virtual {v0}, Lcom/ansca/corona/CoronaSensorManager;->init()V
/* .line 155 */
int v0 = 0; // const/4 v0, 0x0
/* iput v0, p0, Lcom/ansca/corona/Controller;->myTimerMilliseconds:I */
/* .line 156 */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/ansca/corona/Controller;->myInitialResume:Z */
/* .line 157 */
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lcom/ansca/corona/Controller;->myIsResumed:Z */
/* .line 158 */
com.ansca.corona.version.AndroidVersionSpecificFactory .create ( );
this.myAndroidVersion = v0;
/* .line 159 */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/ansca/corona/Controller;->myIdleEnabled:Z */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 160 */
/* monitor-exit p0 */
return;
/* .line 153 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
private void internalSetIdleTimer ( Boolean p0 ) {
/* .locals 2 */
/* .param p1, "enabled" # Z */
/* .prologue */
/* .line 562 */
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 565 */
v0 = this.myActivity;
/* new-instance v1, Lcom/ansca/corona/Controller$5; */
/* invoke-direct {v1, p0}, Lcom/ansca/corona/Controller$5;-><init>(Lcom/ansca/corona/Controller;)V */
(( com.ansca.corona.CoronaActivity ) v0 ).runOnUiThread ( v1 ); // invoke-virtual {v0, v1}, Lcom/ansca/corona/CoronaActivity;->runOnUiThread(Ljava/lang/Runnable;)V
/* .line 592 */
} // :goto_0
return;
/* .line 580 */
} // :cond_0
v0 = this.myActivity;
/* new-instance v1, Lcom/ansca/corona/Controller$6; */
/* invoke-direct {v1, p0}, Lcom/ansca/corona/Controller$6;-><init>(Lcom/ansca/corona/Controller;)V */
(( com.ansca.corona.CoronaActivity ) v0 ).runOnUiThread ( v1 ); // invoke-virtual {v0, v1}, Lcom/ansca/corona/CoronaActivity;->runOnUiThread(Ljava/lang/Runnable;)V
} // .end method
public static Boolean isMultitouchEnabled ( ) {
/* .locals 3 */
/* .prologue */
int v2 = 5; // const/4 v2, 0x5
int v0 = 0; // const/4 v0, 0x0
/* .line 170 */
v1 = com.ansca.corona.Controller.theController;
/* if-nez v1, :cond_1 */
/* .line 173 */
} // :cond_0
} // :goto_0
} // :cond_1
v1 = com.ansca.corona.Controller .getAndroidVersionSpecific ( );
/* if-lt v1, v2, :cond_0 */
v1 = com.ansca.corona.Controller.theController;
v1 = this.mySensorManager;
v1 = (( com.ansca.corona.CoronaSensorManager ) v1 ).isActive ( v2 ); // invoke-virtual {v1, v2}, Lcom/ansca/corona/CoronaSensorManager;->isActive(I)Z
if ( v1 != null) { // if-eqz v1, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // .end method
public static Boolean isRunning ( ) {
/* .locals 1 */
/* .prologue */
/* .line 250 */
v0 = com.ansca.corona.Controller.theController;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = com.ansca.corona.Controller.theController;
/* iget-boolean v0, v0, Lcom/ansca/corona/Controller;->myIsResumed:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public static Boolean isValid ( ) {
/* .locals 1 */
/* .prologue */
/* .line 230 */
v0 = com.ansca.corona.Controller.theController;
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public static void onDrawFrame ( ) {
/* .locals 2 */
/* .prologue */
/* .line 234 */
v0 = com.ansca.corona.Controller.theController;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 235 */
v1 = com.ansca.corona.Controller.theController;
/* monitor-enter v1 */
/* .line 237 */
try { // :try_start_0
com.ansca.corona.Controller .getEventManager ( );
(( com.ansca.corona.events.EventManager ) v0 ).sendEvents ( ); // invoke-virtual {v0}, Lcom/ansca/corona/events/EventManager;->sendEvents()V
/* .line 242 */
v0 = com.ansca.corona.Controller .isRunning ( );
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 243 */
com.ansca.corona.JavaToNativeShim .render ( );
/* .line 245 */
} // :cond_0
/* monitor-exit v1 */
/* .line 247 */
} // :cond_1
return;
/* .line 245 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit v1 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v0 */
} // .end method
public static void requestEventRender ( ) {
/* .locals 1 */
/* .prologue */
/* .line 301 */
v0 = com.ansca.corona.Controller .isValid ( );
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = com.ansca.corona.Controller.theController;
v0 = this.myTimerTask;
/* if-nez v0, :cond_0 */
/* .line 302 */
v0 = com.ansca.corona.Controller.theController;
v0 = this.myActivity;
(( com.ansca.corona.CoronaActivity ) v0 ).requestRender ( ); // invoke-virtual {v0}, Lcom/ansca/corona/CoronaActivity;->requestRender()V
/* .line 303 */
} // :cond_0
return;
} // .end method
public static void requestRender ( ) {
/* .locals 1 */
/* .prologue */
/* .line 296 */
v0 = com.ansca.corona.Controller .isValid ( );
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = com.ansca.corona.Controller.theController;
v0 = this.myActivity;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 297 */
v0 = com.ansca.corona.Controller.theController;
v0 = this.myActivity;
(( com.ansca.corona.CoronaActivity ) v0 ).requestRender ( ); // invoke-virtual {v0}, Lcom/ansca/corona/CoronaActivity;->requestRender()V
/* .line 298 */
} // :cond_0
return;
} // .end method
/* # virtual methods */
protected java.lang.String GetHardwareIdentifier ( ) {
/* .locals 5 */
/* .prologue */
/* .line 947 */
int v1 = 0; // const/4 v1, 0x0
/* .line 950 */
/* .local v1, "stringId":Ljava/lang/String; */
try { // :try_start_0
final String v0 = "android.permission.READ_PHONE_STATE"; // const-string v0, "android.permission.READ_PHONE_STATE"
/* .line 951 */
/* .local v0, "permissionName":Ljava/lang/String; */
v3 = this.myActivity;
v3 = (( com.ansca.corona.CoronaActivity ) v3 ).checkCallingOrSelfPermission ( v0 ); // invoke-virtual {v3, v0}, Lcom/ansca/corona/CoronaActivity;->checkCallingOrSelfPermission(Ljava/lang/String;)I
/* if-nez v3, :cond_0 */
/* .line 952 */
v3 = this.myActivity;
final String v4 = "phone"; // const-string v4, "phone"
(( com.ansca.corona.CoronaActivity ) v3 ).getSystemService ( v4 ); // invoke-virtual {v3, v4}, Lcom/ansca/corona/CoronaActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v2, Landroid/telephony/TelephonyManager; */
/* .line 953 */
/* .local v2, "telephonyManager":Landroid/telephony/TelephonyManager; */
if ( v2 != null) { // if-eqz v2, :cond_0
(( android.telephony.TelephonyManager ) v2 ).getDeviceId ( ); // invoke-virtual {v2}, Landroid/telephony/TelephonyManager;->getDeviceId()Ljava/lang/String;
if ( v3 != null) { // if-eqz v3, :cond_0
/* .line 954 */
(( android.telephony.TelephonyManager ) v2 ).getDeviceId ( ); // invoke-virtual {v2}, Landroid/telephony/TelephonyManager;->getDeviceId()Ljava/lang/String;
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 960 */
} // .end local v0 # "permissionName":Ljava/lang/String;
} // .end local v2 # "telephonyManager":Landroid/telephony/TelephonyManager;
} // :cond_0
} // :goto_0
/* .line 958 */
/* :catch_0 */
/* move-exception v3 */
} // .end method
protected java.lang.String GetOSIdentifier ( ) {
/* .locals 3 */
/* .prologue */
/* .line 965 */
int v0 = 0; // const/4 v0, 0x0
/* .line 969 */
/* .local v0, "stringId":Ljava/lang/String; */
v1 = this.myActivity;
(( com.ansca.corona.CoronaActivity ) v1 ).getContentResolver ( ); // invoke-virtual {v1}, Lcom/ansca/corona/CoronaActivity;->getContentResolver()Landroid/content/ContentResolver;
final String v2 = "android_id"; // const-string v2, "android_id"
android.provider.Settings$Secure .getString ( v1,v2 );
} // .end method
public void addImageFileToPhotoGallery ( java.lang.String p0 ) {
/* .locals 4 */
/* .param p1, "imageFilePathName" # Ljava/lang/String; */
/* .prologue */
/* .line 544 */
v0 = com.ansca.corona.Controller .isValid ( );
if ( v0 != null) { // if-eqz v0, :cond_0
if ( p1 != null) { // if-eqz p1, :cond_0
v0 = (( java.lang.String ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/String;->length()I
/* if-gtz v0, :cond_1 */
/* .line 554 */
} // :cond_0
} // :goto_0
return;
/* .line 549 */
} // :cond_1
com.ansca.corona.Controller .getActivity ( );
int v1 = 1; // const/4 v1, 0x1
/* new-array v1, v1, [Ljava/lang/String; */
int v2 = 0; // const/4 v2, 0x0
/* aput-object p1, v1, v2 */
int v2 = 0; // const/4 v2, 0x0
/* new-instance v3, Lcom/ansca/corona/Controller$4; */
/* invoke-direct {v3, p0}, Lcom/ansca/corona/Controller$4;-><init>(Lcom/ansca/corona/Controller;)V */
android.media.MediaScannerConnection .scanFile ( v0,v1,v2,v3 );
} // .end method
public void cancelNativeAlert ( Integer p0 ) {
/* .locals 3 */
/* .param p1, "buttonIndex" # I */
/* .prologue */
/* .line 684 */
v1 = this.myAlertDialog;
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 687 */
/* monitor-enter p0 */
/* .line 688 */
try { // :try_start_0
v0 = this.myAlertDialog;
/* .line 689 */
/* .local v0, "theDialog":Landroid/app/AlertDialog; */
int v1 = 0; // const/4 v1, 0x0
this.myAlertDialog = v1;
/* .line 690 */
/* monitor-exit p0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 691 */
v1 = this.myActivity;
/* new-instance v2, Lcom/ansca/corona/Controller$10; */
/* invoke-direct {v2, p0, v0, p1}, Lcom/ansca/corona/Controller$10;-><init>(Lcom/ansca/corona/Controller;Landroid/app/AlertDialog;I)V */
(( com.ansca.corona.CoronaActivity ) v1 ).runOnUiThread ( v2 ); // invoke-virtual {v1, v2}, Lcom/ansca/corona/CoronaActivity;->runOnUiThread(Ljava/lang/Runnable;)V
/* .line 700 */
} // .end local v0 # "theDialog":Landroid/app/AlertDialog;
} // :cond_0
return;
/* .line 690 */
/* :catchall_0 */
/* move-exception v1 */
try { // :try_start_1
/* monitor-exit p0 */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* throw v1 */
} // .end method
public void cancelTimer ( ) {
/* .locals 1 */
/* .prologue */
/* .line 340 */
(( com.ansca.corona.Controller ) p0 ).stopTimer ( ); // invoke-virtual {p0}, Lcom/ansca/corona/Controller;->stopTimer()V
/* .line 341 */
int v0 = 0; // const/4 v0, 0x0
/* iput v0, p0, Lcom/ansca/corona/Controller;->myTimerMilliseconds:I */
/* .line 342 */
return;
} // .end method
public void closeNativeActivityIndicator ( ) {
/* .locals 1 */
/* .prologue */
/* .line 770 */
v0 = this.myActivityIndicatorDialog;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 771 */
v0 = this.myActivityIndicatorDialog;
(( com.ansca.corona.ActivityIndicatorDialog ) v0 ).dismiss ( ); // invoke-virtual {v0}, Lcom/ansca/corona/ActivityIndicatorDialog;->dismiss()V
/* .line 772 */
int v0 = 0; // const/4 v0, 0x0
this.myActivityIndicatorDialog = v0;
/* .line 774 */
} // :cond_0
return;
} // .end method
protected android.os.Bundle createFacebookBundle ( java.util.HashMap p0 ) {
/* .locals 11 */
/* .param p1, "map" # Ljava/util/HashMap; */
/* .prologue */
int v8 = 0; // const/4 v8, 0x0
/* .line 1231 */
/* new-instance v4, Landroid/os/Bundle; */
/* invoke-direct {v4}, Landroid/os/Bundle;-><init>()V */
/* .line 1233 */
/* .local v4, "result":Landroid/os/Bundle; */
if ( p1 != null) { // if-eqz p1, :cond_e
/* .line 1234 */
/* move-object v3, p1 */
/* .line 1235 */
/* .local v3, "m":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;" */
(( java.util.HashMap ) v3 ).entrySet ( ); // invoke-virtual {v3}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;
/* .line 1236 */
/* .local v5, "s":Ljava/util/Set;, "Ljava/util/Set<Ljava/util/Map$Entry<Ljava/lang/String;Ljava/lang/Object;>;>;" */
if ( v5 != null) { // if-eqz v5, :cond_e
/* .line 1237 */
/* .local v1, "i$":Ljava/util/Iterator; */
} // :cond_0
v7 = } // :goto_0
if ( v7 != null) { // if-eqz v7, :cond_e
/* check-cast v0, Ljava/util/Map$Entry; */
/* .line 1238 */
/* .local v0, "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Ljava/lang/Object;>;" */
/* check-cast v2, Ljava/lang/String; */
/* .line 1239 */
/* .local v2, "key":Ljava/lang/String; */
/* .line 1240 */
/* .local v6, "value":Ljava/lang/Object; */
/* instance-of v7, v6, Ljava/lang/Boolean; */
if ( v7 != null) { // if-eqz v7, :cond_2
/* .line 1241 */
if ( v6 != null) { // if-eqz v6, :cond_1
/* check-cast v6, Ljava/lang/Boolean; */
} // .end local v6 # "value":Ljava/lang/Object;
v7 = (( java.lang.Boolean ) v6 ).booleanValue ( ); // invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z
} // :goto_1
(( android.os.Bundle ) v4 ).putBoolean ( v2, v7 ); // invoke-virtual {v4, v2, v7}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V
/* .restart local v6 # "value":Ljava/lang/Object; */
} // :cond_1
/* move v7, v8 */
/* .line 1243 */
} // :cond_2
/* instance-of v7, v6, Ljava/lang/Byte; */
if ( v7 != null) { // if-eqz v7, :cond_4
/* .line 1244 */
if ( v6 != null) { // if-eqz v6, :cond_3
/* check-cast v6, Ljava/lang/Byte; */
} // .end local v6 # "value":Ljava/lang/Object;
v7 = (( java.lang.Byte ) v6 ).byteValue ( ); // invoke-virtual {v6}, Ljava/lang/Byte;->byteValue()B
} // :goto_2
(( android.os.Bundle ) v4 ).putByte ( v2, v7 ); // invoke-virtual {v4, v2, v7}, Landroid/os/Bundle;->putByte(Ljava/lang/String;B)V
/* .restart local v6 # "value":Ljava/lang/Object; */
} // :cond_3
/* move v7, v8 */
/* .line 1246 */
} // :cond_4
/* instance-of v7, v6, Ljava/lang/Integer; */
if ( v7 != null) { // if-eqz v7, :cond_6
/* .line 1247 */
if ( v6 != null) { // if-eqz v6, :cond_5
/* check-cast v6, Ljava/lang/Integer; */
} // .end local v6 # "value":Ljava/lang/Object;
v7 = (( java.lang.Integer ) v6 ).intValue ( ); // invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I
} // :goto_3
(( android.os.Bundle ) v4 ).putInt ( v2, v7 ); // invoke-virtual {v4, v2, v7}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
/* .restart local v6 # "value":Ljava/lang/Object; */
} // :cond_5
/* move v7, v8 */
/* .line 1249 */
} // :cond_6
/* instance-of v7, v6, Ljava/lang/Float; */
if ( v7 != null) { // if-eqz v7, :cond_8
/* .line 1250 */
if ( v6 != null) { // if-eqz v6, :cond_7
/* check-cast v6, Ljava/lang/Float; */
} // .end local v6 # "value":Ljava/lang/Object;
v7 = (( java.lang.Float ) v6 ).floatValue ( ); // invoke-virtual {v6}, Ljava/lang/Float;->floatValue()F
} // :goto_4
(( android.os.Bundle ) v4 ).putFloat ( v2, v7 ); // invoke-virtual {v4, v2, v7}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V
/* .restart local v6 # "value":Ljava/lang/Object; */
} // :cond_7
int v7 = 0; // const/4 v7, 0x0
/* .line 1252 */
} // :cond_8
/* instance-of v7, v6, Ljava/lang/Double; */
if ( v7 != null) { // if-eqz v7, :cond_a
/* .line 1253 */
if ( v6 != null) { // if-eqz v6, :cond_9
/* check-cast v6, Ljava/lang/Double; */
} // .end local v6 # "value":Ljava/lang/Object;
(( java.lang.Double ) v6 ).doubleValue ( ); // invoke-virtual {v6}, Ljava/lang/Double;->doubleValue()D
/* move-result-wide v9 */
} // :goto_5
(( android.os.Bundle ) v4 ).putDouble ( v2, v9, v10 ); // invoke-virtual {v4, v2, v9, v10}, Landroid/os/Bundle;->putDouble(Ljava/lang/String;D)V
/* .restart local v6 # "value":Ljava/lang/Object; */
} // :cond_9
/* const-wide/16 v9, 0x0 */
/* .line 1255 */
} // :cond_a
/* instance-of v7, v6, Ljava/lang/String; */
if ( v7 != null) { // if-eqz v7, :cond_b
/* .line 1256 */
/* check-cast v6, Ljava/lang/String; */
} // .end local v6 # "value":Ljava/lang/Object;
(( android.os.Bundle ) v4 ).putString ( v2, v6 ); // invoke-virtual {v4, v2, v6}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
/* .line 1258 */
/* .restart local v6 # "value":Ljava/lang/Object; */
} // :cond_b
/* instance-of v7, v6, Ljava/io/File; */
if ( v7 != null) { // if-eqz v7, :cond_c
/* .line 1259 */
v7 = this.myBridge;
/* check-cast v6, Ljava/io/File; */
} // .end local v6 # "value":Ljava/lang/Object;
(( java.io.File ) v6 ).getPath ( ); // invoke-virtual {v6}, Ljava/io/File;->getPath()Ljava/lang/String;
(( com.ansca.corona.NativeToJavaBridge ) v7 ).getBytesFromFile ( v9 ); // invoke-virtual {v7, v9}, Lcom/ansca/corona/NativeToJavaBridge;->getBytesFromFile(Ljava/lang/String;)[B
(( android.os.Bundle ) v4 ).putByteArray ( v2, v7 ); // invoke-virtual {v4, v2, v7}, Landroid/os/Bundle;->putByteArray(Ljava/lang/String;[B)V
/* goto/16 :goto_0 */
/* .line 1261 */
/* .restart local v6 # "value":Ljava/lang/Object; */
} // :cond_c
/* instance-of v7, v6, [B */
if ( v7 != null) { // if-eqz v7, :cond_d
/* .line 1262 */
/* check-cast v6, [B */
} // .end local v6 # "value":Ljava/lang/Object;
/* check-cast v6, [B */
(( android.os.Bundle ) v4 ).putByteArray ( v2, v6 ); // invoke-virtual {v4, v2, v6}, Landroid/os/Bundle;->putByteArray(Ljava/lang/String;[B)V
/* goto/16 :goto_0 */
/* .line 1264 */
/* .restart local v6 # "value":Ljava/lang/Object; */
} // :cond_d
/* instance-of v7, v6, [Ljava/lang/String; */
if ( v7 != null) { // if-eqz v7, :cond_0
/* .line 1265 */
/* check-cast v6, [Ljava/lang/String; */
} // .end local v6 # "value":Ljava/lang/Object;
/* check-cast v6, [Ljava/lang/String; */
(( android.os.Bundle ) v4 ).putStringArray ( v2, v6 ); // invoke-virtual {v4, v2, v6}, Landroid/os/Bundle;->putStringArray(Ljava/lang/String;[Ljava/lang/String;)V
/* goto/16 :goto_0 */
/* .line 1270 */
} // .end local v0 # "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Ljava/lang/Object;>;"
} // .end local v1 # "i$":Ljava/util/Iterator;
} // .end local v2 # "key":Ljava/lang/String;
} // .end local v3 # "m":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;"
} // .end local v5 # "s":Ljava/util/Set;, "Ljava/util/Set<Ljava/util/Map$Entry<Ljava/lang/String;Ljava/lang/Object;>;>;"
} // :cond_e
} // .end method
public synchronized void destroy ( ) {
/* .locals 1 */
/* .prologue */
/* .line 219 */
/* monitor-enter p0 */
try { // :try_start_0
(( com.ansca.corona.Controller ) p0 ).stopTimer ( ); // invoke-virtual {p0}, Lcom/ansca/corona/Controller;->stopTimer()V
/* .line 220 */
v0 = this.myEventManager;
(( com.ansca.corona.events.EventManager ) v0 ).removeAllEvents ( ); // invoke-virtual {v0}, Lcom/ansca/corona/events/EventManager;->removeAllEvents()V
/* .line 221 */
v0 = this.myAdManager;
(( com.ansca.corona.AdManager ) v0 ).hideAllAds ( ); // invoke-virtual {v0}, Lcom/ansca/corona/AdManager;->hideAllAds()V
/* .line 222 */
v0 = this.mySensorManager;
(( com.ansca.corona.CoronaSensorManager ) v0 ).stop ( ); // invoke-virtual {v0}, Lcom/ansca/corona/CoronaSensorManager;->stop()V
/* .line 223 */
v0 = this.myMediaManager;
(( com.ansca.corona.MediaManager ) v0 ).release ( ); // invoke-virtual {v0}, Lcom/ansca/corona/MediaManager;->release()V
/* .line 224 */
v0 = this.myRuntime;
(( com.ansca.corona.CoronaRuntime ) v0 ).dispose ( ); // invoke-virtual {v0}, Lcom/ansca/corona/CoronaRuntime;->dispose()V
/* .line 225 */
com.ansca.corona.JavaToNativeShim .destroy ( );
/* .line 226 */
int v0 = 0; // const/4 v0, 0x0
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 227 */
/* monitor-exit p0 */
return;
/* .line 219 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
public void displayUpdate ( ) {
/* .locals 1 */
/* .prologue */
/* .line 352 */
v0 = this.myActivity;
(( com.ansca.corona.CoronaActivity ) v0 ).setNeedsSwap ( ); // invoke-virtual {v0}, Lcom/ansca/corona/CoronaActivity;->setNeedsSwap()V
/* .line 353 */
return;
} // .end method
public void facebookApplyActivityResult ( Integer p0, Integer p1, android.content.Intent p2 ) {
/* .locals 1 */
/* .param p1, "requestCode" # I */
/* .param p2, "resultCode" # I */
/* .param p3, "data" # Landroid/content/Intent; */
/* .prologue */
/* .line 1172 */
v0 = this.myFacebook;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 1173 */
v0 = this.myFacebook;
(( com.facebook.android.Facebook ) v0 ).authorizeCallback ( p1, p2, p3 ); // invoke-virtual {v0, p1, p2, p3}, Lcom/facebook/android/Facebook;->authorizeCallback(IILandroid/content/Intent;)V
/* .line 1175 */
} // :cond_0
return;
} // .end method
public void facebookDialog ( java.lang.String p0, java.util.HashMap p1 ) {
/* .locals 2 */
/* .param p1, "action" # Ljava/lang/String; */
/* .param p2, "params" # Ljava/util/HashMap; */
/* .prologue */
/* .line 1310 */
v0 = this.myFacebook;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 1312 */
v0 = this.myActivity;
/* new-instance v1, Lcom/ansca/corona/Controller$20; */
/* invoke-direct {v1, p0, p1, p2}, Lcom/ansca/corona/Controller$20;-><init>(Lcom/ansca/corona/Controller;Ljava/lang/String;Ljava/util/HashMap;)V */
(( com.ansca.corona.CoronaActivity ) v0 ).runOnUiThread ( v1 ); // invoke-virtual {v0, v1}, Lcom/ansca/corona/CoronaActivity;->runOnUiThread(Ljava/lang/Runnable;)V
/* .line 1344 */
} // :cond_0
return;
} // .end method
public void facebookLogin ( java.lang.String p0, java.lang.String[] p1 ) {
/* .locals 7 */
/* .param p1, "appId" # Ljava/lang/String; */
/* .param p2, "permissions" # [Ljava/lang/String; */
/* .prologue */
int v6 = 0; // const/4 v6, 0x0
int v5 = 0; // const/4 v5, 0x0
/* .line 1062 */
v2 = this.myActivity;
if ( v2 != null) { // if-eqz v2, :cond_0
/* if-nez p1, :cond_1 */
/* .line 1162 */
} // :cond_0
} // :goto_0
return;
/* .line 1067 */
} // :cond_1
v2 = this.myFacebook;
/* if-nez v2, :cond_2 */
/* .line 1069 */
try { // :try_start_0
/* new-instance v2, Lcom/facebook/android/Facebook; */
/* invoke-direct {v2, p1}, Lcom/facebook/android/Facebook;-><init>(Ljava/lang/String;)V */
this.myFacebook = v2;
/* .line 1070 */
/* new-instance v2, Lcom/facebook/android/AsyncFacebookRunner; */
v3 = this.myFacebook;
/* invoke-direct {v2, v3}, Lcom/facebook/android/AsyncFacebookRunner;-><init>(Lcom/facebook/android/Facebook;)V */
this.myFacebookRunner = v2;
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 1081 */
} // :cond_2
v2 = this.myFacebook;
(( com.facebook.android.Facebook ) v2 ).getAppId ( ); // invoke-virtual {v2}, Lcom/facebook/android/Facebook;->getAppId()Ljava/lang/String;
v2 = (( java.lang.String ) p1 ).equals ( v2 ); // invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v2, :cond_3 */
/* .line 1082 */
final String v2 = "Corona"; // const-string v2, "Corona"
/* new-instance v3, Ljava/lang/StringBuilder; */
/* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
final String v4 = "ERROR: In previous call to facebook.login(), the appId was "; // const-string v4, "ERROR: In previous call to facebook.login(), the appId was "
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v4 = this.myFacebook;
(( com.facebook.android.Facebook ) v4 ).getAppId ( ); // invoke-virtual {v4}, Lcom/facebook/android/Facebook;->getAppId()Ljava/lang/String;
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v4 = " not "; // const-string v4, " not "
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).append ( p1 ); // invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v4 = ".The app id will be the former not the latter."; // const-string v4, ".The app id will be the former not the latter."
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .v ( v2,v3 );
/* .line 1087 */
} // :cond_3
v2 = this.myFacebook;
v2 = (( com.facebook.android.Facebook ) v2 ).isSessionValid ( ); // invoke-virtual {v2}, Lcom/facebook/android/Facebook;->isSessionValid()Z
/* if-nez v2, :cond_4 */
/* .line 1088 */
v2 = this.myActivity;
final String v3 = "facebook-session"; // const-string v3, "facebook-session"
(( com.ansca.corona.CoronaActivity ) v2 ).getSharedPreferences ( v3, v6 ); // invoke-virtual {v2, v3, v6}, Lcom/ansca/corona/CoronaActivity;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
/* .line 1090 */
/* .local v1, "savedSession":Landroid/content/SharedPreferences; */
if ( v1 != null) { // if-eqz v1, :cond_4
/* .line 1091 */
v2 = this.myFacebook;
final String v3 = "access_token"; // const-string v3, "access_token"
(( com.facebook.android.Facebook ) v2 ).setAccessToken ( v3 ); // invoke-virtual {v2, v3}, Lcom/facebook/android/Facebook;->setAccessToken(Ljava/lang/String;)V
/* .line 1092 */
v2 = this.myFacebook;
final String v3 = "expires_in"; // const-string v3, "expires_in"
/* const-wide/16 v4, 0x0 */
/* move-result-wide v3 */
(( com.facebook.android.Facebook ) v2 ).setAccessExpires ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Lcom/facebook/android/Facebook;->setAccessExpires(J)V
/* .line 1098 */
} // .end local v1 # "savedSession":Landroid/content/SharedPreferences;
} // :cond_4
v2 = this.myFacebook;
v2 = (( com.facebook.android.Facebook ) v2 ).isSessionValid ( ); // invoke-virtual {v2}, Lcom/facebook/android/Facebook;->isSessionValid()Z
if ( v2 != null) { // if-eqz v2, :cond_5
/* .line 1099 */
com.ansca.corona.Controller .getEventManager ( );
v3 = this.myFacebook;
(( com.facebook.android.Facebook ) v3 ).getAccessToken ( ); // invoke-virtual {v3}, Lcom/facebook/android/Facebook;->getAccessToken()Ljava/lang/String;
v4 = this.myFacebook;
(( com.facebook.android.Facebook ) v4 ).getAccessExpires ( ); // invoke-virtual {v4}, Lcom/facebook/android/Facebook;->getAccessExpires()J
/* move-result-wide v4 */
(( com.ansca.corona.events.EventManager ) v2 ).fbConnectSessionEvent ( v6, v3, v4, v5 ); // invoke-virtual {v2, v6, v3, v4, v5}, Lcom/ansca/corona/events/EventManager;->fbConnectSessionEvent(ILjava/lang/String;J)V
/* goto/16 :goto_0 */
/* .line 1072 */
/* :catch_0 */
/* move-exception v0 */
/* .line 1073 */
/* .local v0, "ex":Ljava/lang/Exception; */
this.myFacebook = v5;
/* .line 1074 */
this.myFacebookRunner = v5;
/* .line 1075 */
com.ansca.corona.Controller .getEventManager ( );
(( java.lang.Exception ) v0 ).getLocalizedMessage ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->getLocalizedMessage()Ljava/lang/String;
(( com.ansca.corona.events.EventManager ) v2 ).fbConnectSessionEventError ( v3 ); // invoke-virtual {v2, v3}, Lcom/ansca/corona/events/EventManager;->fbConnectSessionEventError(Ljava/lang/String;)V
/* goto/16 :goto_0 */
/* .line 1108 */
} // .end local v0 # "ex":Ljava/lang/Exception;
} // :cond_5
v2 = this.myActivity;
/* new-instance v3, Lcom/ansca/corona/Controller$17; */
/* invoke-direct {v3, p0, p2}, Lcom/ansca/corona/Controller$17;-><init>(Lcom/ansca/corona/Controller;[Ljava/lang/String;)V */
(( com.ansca.corona.CoronaActivity ) v2 ).runOnUiThread ( v3 ); // invoke-virtual {v2, v3}, Lcom/ansca/corona/CoronaActivity;->runOnUiThread(Ljava/lang/Runnable;)V
/* goto/16 :goto_0 */
} // .end method
public void facebookLogout ( ) {
/* .locals 4 */
/* .prologue */
/* .line 1180 */
v1 = this.myActivity;
/* if-nez v1, :cond_1 */
/* .line 1227 */
} // :cond_0
} // :goto_0
return;
/* .line 1186 */
} // :cond_1
v1 = this.myActivity;
final String v2 = "facebook-session"; // const-string v2, "facebook-session"
int v3 = 0; // const/4 v3, 0x0
(( com.ansca.corona.CoronaActivity ) v1 ).getSharedPreferences ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Lcom/ansca/corona/CoronaActivity;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
/* .line 1188 */
/* .local v0, "editor":Landroid/content/SharedPreferences$Editor; */
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 1189 */
/* .line 1190 */
/* .line 1194 */
} // :cond_2
v1 = this.myFacebook;
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 1195 */
v1 = this.myFacebook;
v1 = (( com.facebook.android.Facebook ) v1 ).isSessionValid ( ); // invoke-virtual {v1}, Lcom/facebook/android/Facebook;->isSessionValid()Z
if ( v1 != null) { // if-eqz v1, :cond_3
/* .line 1197 */
v1 = this.myFacebookRunner;
v2 = this.myActivity;
/* new-instance v3, Lcom/ansca/corona/Controller$18; */
/* invoke-direct {v3, p0}, Lcom/ansca/corona/Controller$18;-><init>(Lcom/ansca/corona/Controller;)V */
(( com.facebook.android.AsyncFacebookRunner ) v1 ).logout ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Lcom/facebook/android/AsyncFacebookRunner;->logout(Landroid/content/Context;Lcom/facebook/android/AsyncFacebookRunner$RequestListener;)V
/* .line 1224 */
} // :cond_3
com.ansca.corona.Controller .getEventManager ( );
int v2 = 3; // const/4 v2, 0x3
(( com.ansca.corona.events.EventManager ) v1 ).fbConnectSessionEvent ( v2 ); // invoke-virtual {v1, v2}, Lcom/ansca/corona/events/EventManager;->fbConnectSessionEvent(I)V
} // .end method
public void facebookRequest ( java.lang.String p0, java.lang.String p1, java.util.HashMap p2 ) {
/* .locals 6 */
/* .param p1, "path" # Ljava/lang/String; */
/* .param p2, "method" # Ljava/lang/String; */
/* .param p3, "params" # Ljava/util/HashMap; */
/* .prologue */
/* .line 1275 */
v0 = this.myFacebookRunner;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 1278 */
/* new-instance v4, Lcom/ansca/corona/Controller$19; */
/* invoke-direct {v4, p0}, Lcom/ansca/corona/Controller$19;-><init>(Lcom/ansca/corona/Controller;)V */
/* .line 1303 */
/* .local v4, "listener":Lcom/facebook/android/AsyncFacebookRunner$RequestListener; */
(( com.ansca.corona.Controller ) p0 ).createFacebookBundle ( p3 ); // invoke-virtual {p0, p3}, Lcom/ansca/corona/Controller;->createFacebookBundle(Ljava/util/HashMap;)Landroid/os/Bundle;
/* .line 1304 */
/* .local v2, "bundle":Landroid/os/Bundle; */
v0 = this.myFacebookRunner;
int v5 = 0; // const/4 v5, 0x0
/* move-object v1, p1 */
/* move-object v3, p2 */
/* invoke-virtual/range {v0 ..v5}, Lcom/facebook/android/AsyncFacebookRunner;->request(Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;Lcom/facebook/android/AsyncFacebookRunner$RequestListener;Ljava/lang/Object;)V */
/* .line 1306 */
} // .end local v2 # "bundle":Landroid/os/Bundle;
} // .end local v4 # "listener":Lcom/facebook/android/AsyncFacebookRunner$RequestListener;
} // :cond_0
return;
} // .end method
public void flurryEvent ( java.lang.String p0 ) {
/* .locals 2 */
/* .param p1, "eventId" # Ljava/lang/String; */
/* .prologue */
/* .line 1363 */
/* iget-boolean v0, p0, Lcom/ansca/corona/Controller;->myFlurrySessionStarted:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 1364 */
v0 = this.myActivity;
/* new-instance v1, Lcom/ansca/corona/Controller$22; */
/* invoke-direct {v1, p0, p1}, Lcom/ansca/corona/Controller$22;-><init>(Lcom/ansca/corona/Controller;Ljava/lang/String;)V */
(( com.ansca.corona.CoronaActivity ) v0 ).runOnUiThread ( v1 ); // invoke-virtual {v0, v1}, Lcom/ansca/corona/CoronaActivity;->runOnUiThread(Ljava/lang/Runnable;)V
/* .line 1372 */
} // :cond_0
return;
} // .end method
public void flurryInit ( java.lang.String p0 ) {
/* .locals 2 */
/* .param p1, "applicationId" # Ljava/lang/String; */
/* .prologue */
/* .line 1348 */
/* iget-boolean v0, p0, Lcom/ansca/corona/Controller;->myFlurrySessionStarted:Z */
/* if-nez v0, :cond_0 */
/* .line 1349 */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/ansca/corona/Controller;->myFlurrySessionStarted:Z */
/* .line 1351 */
v0 = this.myActivity;
/* new-instance v1, Lcom/ansca/corona/Controller$21; */
/* invoke-direct {v1, p0, p1}, Lcom/ansca/corona/Controller$21;-><init>(Lcom/ansca/corona/Controller;Ljava/lang/String;)V */
(( com.ansca.corona.CoronaActivity ) v0 ).runOnUiThread ( v1 ); // invoke-virtual {v0, v1}, Lcom/ansca/corona/CoronaActivity;->runOnUiThread(Ljava/lang/Runnable;)V
/* .line 1359 */
} // :cond_0
return;
} // .end method
public void flurryStop ( ) {
/* .locals 1 */
/* .prologue */
/* .line 1376 */
/* iget-boolean v0, p0, Lcom/ansca/corona/Controller;->myFlurrySessionStarted:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 1377 */
v0 = this.myActivity;
com.flurry.android.FlurryAgent .onEndSession ( v0 );
/* .line 1378 */
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lcom/ansca/corona/Controller;->myFlurrySessionStarted:Z */
/* .line 1380 */
} // :cond_0
return;
} // .end method
public Boolean getIdleTimer ( ) {
/* .locals 1 */
/* .prologue */
/* .line 602 */
/* iget-boolean v0, p0, Lcom/ansca/corona/Controller;->myIdleEnabled:Z */
} // .end method
public java.lang.String getManufacturerName ( ) {
/* .locals 1 */
/* .prologue */
/* .line 933 */
v0 = android.os.Build.MANUFACTURER;
} // .end method
public java.lang.String getModel ( ) {
/* .locals 1 */
/* .prologue */
/* .line 937 */
v0 = android.os.Build.MODEL;
} // .end method
public java.lang.String getName ( ) {
/* .locals 1 */
/* .prologue */
/* .line 942 */
final String v0 = "unknown"; // const-string v0, "unknown"
} // .end method
public java.lang.String getPlatformVersion ( ) {
/* .locals 1 */
/* .prologue */
/* .line 1018 */
v0 = android.os.Build$VERSION.RELEASE;
} // .end method
public java.lang.String getPreference ( Integer p0 ) {
/* .locals 4 */
/* .param p1, "category" # I */
/* .prologue */
/* .line 1032 */
final String v0 = ""; // const-string v0, ""
/* .line 1034 */
/* .local v0, "result":Ljava/lang/String; */
/* packed-switch p1, :pswitch_data_0 */
/* .line 1048 */
v1 = java.lang.System.err;
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "getPreference: Unknown category "; // const-string v3, "getPreference: Unknown category "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( java.io.PrintStream ) v1 ).println ( v2 ); // invoke-virtual {v1, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
/* .line 1052 */
} // :goto_0
/* .line 1036 */
/* :pswitch_0 */
java.util.Locale .getDefault ( );
(( java.util.Locale ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/util/Locale;->toString()Ljava/lang/String;
/* .line 1037 */
/* .line 1039 */
/* :pswitch_1 */
java.util.Locale .getDefault ( );
(( java.util.Locale ) v1 ).getLanguage ( ); // invoke-virtual {v1}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;
/* .line 1040 */
/* .line 1042 */
/* :pswitch_2 */
java.util.Locale .getDefault ( );
(( java.util.Locale ) v1 ).getCountry ( ); // invoke-virtual {v1}, Ljava/util/Locale;->getCountry()Ljava/lang/String;
/* .line 1043 */
/* .line 1045 */
/* :pswitch_3 */
java.util.Locale .getDefault ( );
(( java.util.Locale ) v1 ).getDisplayLanguage ( ); // invoke-virtual {v1}, Ljava/util/Locale;->getDisplayLanguage()Ljava/lang/String;
/* .line 1046 */
/* .line 1034 */
/* :pswitch_data_0 */
/* .packed-switch 0x0 */
/* :pswitch_0 */
/* :pswitch_1 */
/* :pswitch_2 */
/* :pswitch_3 */
} // .end packed-switch
} // .end method
public java.lang.String getProductName ( ) {
/* .locals 1 */
/* .prologue */
/* .line 1022 */
v0 = android.os.Build.PRODUCT;
} // .end method
public java.lang.String getUniqueIdentifier ( Integer p0 ) {
/* .locals 3 */
/* .param p1, "identifierType" # I */
/* .prologue */
/* .line 973 */
int v1 = 0; // const/4 v1, 0x0
/* .line 976 */
/* .local v1, "stringId":Ljava/lang/String; */
v2 = this.myActivity;
/* if-nez v2, :cond_0 */
/* .line 977 */
final String v2 = ""; // const-string v2, ""
/* .line 1014 */
} // :goto_0
/* .line 980 */
} // :cond_0
/* packed-switch p1, :pswitch_data_0 */
/* .line 1010 */
} // :cond_1
} // :goto_1
/* if-nez v1, :cond_2 */
/* .line 1011 */
final String v1 = ""; // const-string v1, ""
} // :cond_2
/* move-object v2, v1 */
/* .line 1014 */
/* .line 984 */
/* :pswitch_0 */
(( com.ansca.corona.Controller ) p0 ).GetHardwareIdentifier ( ); // invoke-virtual {p0}, Lcom/ansca/corona/Controller;->GetHardwareIdentifier()Ljava/lang/String;
/* .line 985 */
/* .local v0, "hardwareId":Ljava/lang/String; */
if ( v0 != null) { // if-eqz v0, :cond_3
v2 = (( java.lang.String ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/lang/String;->length()I
/* if-lez v2, :cond_3 */
/* .line 986 */
/* move-object v1, v0 */
/* .line 991 */
} // :cond_3
/* if-nez v1, :cond_1 */
/* .line 992 */
(( com.ansca.corona.Controller ) p0 ).GetOSIdentifier ( ); // invoke-virtual {p0}, Lcom/ansca/corona/Controller;->GetOSIdentifier()Ljava/lang/String;
/* .line 997 */
} // .end local v0 # "hardwareId":Ljava/lang/String;
/* :pswitch_1 */
(( com.ansca.corona.Controller ) p0 ).GetHardwareIdentifier ( ); // invoke-virtual {p0}, Lcom/ansca/corona/Controller;->GetHardwareIdentifier()Ljava/lang/String;
/* .line 998 */
/* .line 1001 */
/* :pswitch_2 */
(( com.ansca.corona.Controller ) p0 ).GetOSIdentifier ( ); // invoke-virtual {p0}, Lcom/ansca/corona/Controller;->GetOSIdentifier()Ljava/lang/String;
/* .line 1002 */
/* .line 980 */
/* nop */
/* :pswitch_data_0 */
/* .packed-switch 0x0 */
/* :pswitch_0 */
/* :pswitch_1 */
/* :pswitch_2 */
} // .end packed-switch
} // .end method
public Boolean hasAccelerometer ( ) {
/* .locals 1 */
/* .prologue */
/* .line 911 */
v0 = this.mySensorManager;
v0 = (( com.ansca.corona.CoronaSensorManager ) v0 ).hasAccelerometer ( ); // invoke-virtual {v0}, Lcom/ansca/corona/CoronaSensorManager;->hasAccelerometer()Z
} // .end method
public Boolean hasGyroscope ( ) {
/* .locals 1 */
/* .prologue */
/* .line 920 */
v0 = this.mySensorManager;
v0 = (( com.ansca.corona.CoronaSensorManager ) v0 ).hasGyroscope ( ); // invoke-virtual {v0}, Lcom/ansca/corona/CoronaSensorManager;->hasGyroscope()Z
} // .end method
public Boolean hasMediaSource ( Integer p0 ) {
/* .locals 2 */
/* .param p1, "mediaSourceType" # I */
/* .prologue */
/* .line 787 */
int v0 = 0; // const/4 v0, 0x0
/* .line 788 */
/* .local v0, "hasSource":Z */
/* packed-switch p1, :pswitch_data_0 */
/* .line 797 */
} // :goto_0
/* .line 791 */
/* :pswitch_0 */
int v0 = 1; // const/4 v0, 0x1
/* .line 792 */
/* .line 794 */
/* :pswitch_1 */
v1 = com.ansca.corona.CameraServices .hasCamera ( );
if ( v1 != null) { // if-eqz v1, :cond_0
v1 = com.ansca.corona.CameraServices .hasPermission ( );
if ( v1 != null) { // if-eqz v1, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :goto_1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
/* .line 788 */
/* nop */
/* :pswitch_data_0 */
/* .packed-switch 0x0 */
/* :pswitch_0 */
/* :pswitch_1 */
/* :pswitch_0 */
} // .end packed-switch
} // .end method
public void httpPost ( java.lang.String p0, java.lang.String p1, java.lang.String p2 ) {
/* .locals 8 */
/* .param p1, "url" # Ljava/lang/String; */
/* .param p2, "key" # Ljava/lang/String; */
/* .param p3, "value" # Ljava/lang/String; */
/* .prologue */
/* .line 356 */
/* new-instance v3, Lorg/apache/http/impl/client/DefaultHttpClient; */
/* invoke-direct {v3}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>()V */
/* .line 357 */
/* .local v3, "httpClient":Lorg/apache/http/impl/client/DefaultHttpClient; */
/* new-instance v5, Lorg/apache/http/protocol/BasicHttpContext; */
/* invoke-direct {v5}, Lorg/apache/http/protocol/BasicHttpContext;-><init>()V */
/* .line 359 */
/* .local v5, "localContext":Lorg/apache/http/protocol/HttpContext; */
/* new-instance v4, Lorg/apache/http/client/methods/HttpPost; */
/* invoke-direct {v4, p1}, Lorg/apache/http/client/methods/HttpPost;-><init>(Ljava/lang/String;)V */
/* .line 361 */
/* .local v4, "httpPost":Lorg/apache/http/client/methods/HttpPost; */
final String v6 = "Content-Type"; // const-string v6, "Content-Type"
final String v7 = "application/x-www-form-urlencoded"; // const-string v7, "application/x-www-form-urlencoded"
(( org.apache.http.client.methods.HttpPost ) v4 ).setHeader ( v6, v7 ); // invoke-virtual {v4, v6, v7}, Lorg/apache/http/client/methods/HttpPost;->setHeader(Ljava/lang/String;Ljava/lang/String;)V
/* .line 365 */
try { // :try_start_0
/* new-instance v2, Lorg/apache/http/entity/StringEntity; */
/* new-instance v6, Ljava/lang/StringBuilder; */
/* invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v6 ).append ( p2 ); // invoke-virtual {v6, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v7 = "="; // const-string v7, "="
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).append ( p3 ); // invoke-virtual {v6, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).toString ( ); // invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String v7 = "UTF-8"; // const-string v7, "UTF-8"
/* invoke-direct {v2, v6, v7}, Lorg/apache/http/entity/StringEntity;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
/* .line 367 */
/* .local v2, "entity":Lorg/apache/http/entity/StringEntity; */
(( org.apache.http.client.methods.HttpPost ) v4 ).setEntity ( v2 ); // invoke-virtual {v4, v2}, Lorg/apache/http/client/methods/HttpPost;->setEntity(Lorg/apache/http/HttpEntity;)V
/* .line 369 */
(( org.apache.http.impl.client.DefaultHttpClient ) v3 ).execute ( v4, v5 ); // invoke-virtual {v3, v4, v5}, Lorg/apache/http/impl/client/DefaultHttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;Lorg/apache/http/protocol/HttpContext;)Lorg/apache/http/HttpResponse;
/* :try_end_0 */
/* .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_2 */
/* .line 381 */
} // .end local v2 # "entity":Lorg/apache/http/entity/StringEntity;
} // :goto_0
return;
/* .line 374 */
/* :catch_0 */
/* move-exception v1 */
/* .line 375 */
/* .local v1, "e1":Ljava/io/UnsupportedEncodingException; */
(( java.io.UnsupportedEncodingException ) v1 ).printStackTrace ( ); // invoke-virtual {v1}, Ljava/io/UnsupportedEncodingException;->printStackTrace()V
/* .line 376 */
} // .end local v1 # "e1":Ljava/io/UnsupportedEncodingException;
/* :catch_1 */
/* move-exception v0 */
/* .line 377 */
/* .local v0, "e":Lorg/apache/http/client/ClientProtocolException; */
(( org.apache.http.client.ClientProtocolException ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Lorg/apache/http/client/ClientProtocolException;->printStackTrace()V
/* .line 378 */
} // .end local v0 # "e":Lorg/apache/http/client/ClientProtocolException;
/* :catch_2 */
/* move-exception v0 */
/* .line 379 */
/* .local v0, "e":Ljava/io/IOException; */
(( java.io.IOException ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
} // .end method
public Boolean isNaturalOrientationPortrait ( ) {
/* .locals 1 */
/* .prologue */
/* .line 313 */
/* iget-boolean v0, p0, Lcom/ansca/corona/Controller;->myIsNaturalOrientationPortrait:Z */
} // .end method
public void openFeintInit ( java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3 ) {
/* .locals 7 */
/* .param p1, "appName" # Ljava/lang/String; */
/* .param p2, "appKey" # Ljava/lang/String; */
/* .param p3, "appSecret" # Ljava/lang/String; */
/* .param p4, "appId" # Ljava/lang/String; */
/* .prologue */
/* .line 1384 */
v6 = this.myActivity;
/* new-instance v0, Lcom/ansca/corona/Controller$23; */
/* move-object v1, p0 */
/* move-object v2, p1 */
/* move-object v3, p2 */
/* move-object v4, p3 */
/* move-object v5, p4 */
/* invoke-direct/range {v0 ..v5}, Lcom/ansca/corona/Controller$23;-><init>(Lcom/ansca/corona/Controller;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V */
(( com.ansca.corona.CoronaActivity ) v6 ).runOnUiThread ( v0 ); // invoke-virtual {v6, v0}, Lcom/ansca/corona/CoronaActivity;->runOnUiThread(Ljava/lang/Runnable;)V
/* .line 1395 */
return;
} // .end method
public void openFeintLaunchDashboard ( java.lang.String p0 ) {
/* .locals 2 */
/* .param p1, "dashboardName" # Ljava/lang/String; */
/* .prologue */
/* .line 1402 */
v0 = this.myActivity;
/* new-instance v1, Lcom/ansca/corona/Controller$24; */
/* invoke-direct {v1, p0, p1}, Lcom/ansca/corona/Controller$24;-><init>(Lcom/ansca/corona/Controller;Ljava/lang/String;)V */
(( com.ansca.corona.CoronaActivity ) v0 ).runOnUiThread ( v1 ); // invoke-virtual {v0, v1}, Lcom/ansca/corona/CoronaActivity;->runOnUiThread(Ljava/lang/Runnable;)V
/* .line 1437 */
return;
} // .end method
public void openFeintResume ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1399 */
return;
} // .end method
public void openFeintSetHighScore ( java.lang.String p0, Long p1, java.lang.String p2 ) {
/* .locals 7 */
/* .param p1, "leaderboardId" # Ljava/lang/String; */
/* .param p2, "score" # J */
/* .param p4, "displayText" # Ljava/lang/String; */
/* .prologue */
/* .line 1460 */
v6 = this.myActivity;
/* new-instance v0, Lcom/ansca/corona/Controller$26; */
/* move-object v1, p0 */
/* move-object v2, p4 */
/* move-wide v3, p2 */
/* move-object v5, p1 */
/* invoke-direct/range {v0 ..v5}, Lcom/ansca/corona/Controller$26;-><init>(Lcom/ansca/corona/Controller;Ljava/lang/String;JLjava/lang/String;)V */
(( com.ansca.corona.CoronaActivity ) v6 ).runOnUiThread ( v0 ); // invoke-virtual {v6, v0}, Lcom/ansca/corona/CoronaActivity;->runOnUiThread(Ljava/lang/Runnable;)V
/* .line 1487 */
return;
} // .end method
public void openFeintUnlockAchievement ( java.lang.String p0 ) {
/* .locals 2 */
/* .param p1, "achievementId" # Ljava/lang/String; */
/* .prologue */
/* .line 1440 */
v0 = this.myActivity;
/* new-instance v1, Lcom/ansca/corona/Controller$25; */
/* invoke-direct {v1, p0, p1}, Lcom/ansca/corona/Controller$25;-><init>(Lcom/ansca/corona/Controller;Ljava/lang/String;)V */
(( com.ansca.corona.CoronaActivity ) v0 ).runOnUiThread ( v1 ); // invoke-virtual {v0, v1}, Lcom/ansca/corona/CoronaActivity;->runOnUiThread(Ljava/lang/Runnable;)V
/* .line 1457 */
return;
} // .end method
public void openUrl ( java.lang.String p0 ) {
/* .locals 12 */
/* .param p1, "url" # Ljava/lang/String; */
/* .prologue */
/* .line 384 */
final String v0 = "android.intent.action.VIEW"; // const-string v0, "android.intent.action.VIEW"
/* .line 387 */
/* .local v0, "action":Ljava/lang/String; */
if ( p1 != null) { // if-eqz p1, :cond_0
v10 = (( java.lang.String ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/String;->length()I
/* if-gtz v10, :cond_1 */
/* .line 474 */
} // :cond_0
} // :goto_0
return;
/* .line 393 */
} // :cond_1
android.net.Uri .parse ( p1 );
/* .line 396 */
/* .local v9, "uri":Landroid/net/Uri; */
/* new-instance v10, Ljava/lang/StringBuilder; */
/* invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V */
final String v11 = "/data/data/"; // const-string v11, "/data/data/"
(( java.lang.StringBuilder ) v10 ).append ( v11 ); // invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v11 = this.myActivity;
(( com.ansca.corona.CoronaActivity ) v11 ).getApplicationContext ( ); // invoke-virtual {v11}, Lcom/ansca/corona/CoronaActivity;->getApplicationContext()Landroid/content/Context;
(( android.content.Context ) v11 ).getPackageName ( ); // invoke-virtual {v11}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
(( java.lang.StringBuilder ) v10 ).append ( v11 ); // invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v10 ).toString ( ); // invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 399 */
/* .local v1, "applicationPath":Ljava/lang/String; */
v10 = (( java.lang.String ) p1 ).indexOf ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
/* if-gez v10, :cond_2 */
final String v10 = "content://"; // const-string v10, "content://"
v10 = (( java.lang.String ) p1 ).startsWith ( v10 ); // invoke-virtual {p1, v10}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
/* if-nez v10, :cond_2 */
(( android.net.Uri ) v9 ).getScheme ( ); // invoke-virtual {v9}, Landroid/net/Uri;->getScheme()Ljava/lang/String;
/* if-nez v10, :cond_8 */
/* .line 405 */
} // :cond_2
(( android.net.Uri ) v9 ).getScheme ( ); // invoke-virtual {v9}, Landroid/net/Uri;->getScheme()Ljava/lang/String;
if ( v10 != null) { // if-eqz v10, :cond_3
(( android.net.Uri ) v9 ).getScheme ( ); // invoke-virtual {v9}, Landroid/net/Uri;->getScheme()Ljava/lang/String;
final String v11 = "content"; // const-string v11, "content"
v10 = (( java.lang.String ) v10 ).equals ( v11 ); // invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v10, :cond_4 */
/* .line 407 */
} // :cond_3
v10 = this.myActivity;
com.ansca.corona.FileContentProvider .getContentUriFromFilePath ( v10,p1 );
/* .line 411 */
} // :cond_4
int v8 = 0; // const/4 v8, 0x0
/* .line 412 */
/* .local v8, "mimeTypeName":Ljava/lang/String; */
/* const/16 v10, 0x2e */
v4 = (( java.lang.String ) p1 ).lastIndexOf ( v10 ); // invoke-virtual {p1, v10}, Ljava/lang/String;->lastIndexOf(I)I
/* .line 413 */
/* .local v4, "index":I */
/* if-ltz v4, :cond_6 */
/* add-int/lit8 v10, v4, 0x1 */
v11 = (( java.lang.String ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/String;->length()I
/* if-ge v10, v11, :cond_6 */
/* .line 415 */
/* add-int/lit8 v10, v4, 0x1 */
(( java.lang.String ) p1 ).substring ( v10 ); // invoke-virtual {p1, v10}, Ljava/lang/String;->substring(I)Ljava/lang/String;
/* .line 416 */
/* .local v3, "fileExtension":Ljava/lang/String; */
android.webkit.MimeTypeMap .getSingleton ( );
/* .line 417 */
/* .local v7, "mapping":Landroid/webkit/MimeTypeMap; */
v10 = (( android.webkit.MimeTypeMap ) v7 ).hasExtension ( v3 ); // invoke-virtual {v7, v3}, Landroid/webkit/MimeTypeMap;->hasExtension(Ljava/lang/String;)Z
if ( v10 != null) { // if-eqz v10, :cond_5
/* .line 419 */
(( android.webkit.MimeTypeMap ) v7 ).getMimeTypeFromExtension ( v3 ); // invoke-virtual {v7, v3}, Landroid/webkit/MimeTypeMap;->getMimeTypeFromExtension(Ljava/lang/String;)Ljava/lang/String;
/* .line 421 */
} // :cond_5
/* if-nez v8, :cond_6 */
/* .line 423 */
/* new-instance v10, Ljava/lang/StringBuilder; */
/* invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V */
final String v11 = "application/"; // const-string v11, "application/"
(( java.lang.StringBuilder ) v10 ).append ( v11 ); // invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v10 ).append ( v3 ); // invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v10 ).toString ( ); // invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 430 */
} // .end local v3 # "fileExtension":Ljava/lang/String;
} // .end local v7 # "mapping":Landroid/webkit/MimeTypeMap;
} // :cond_6
try { // :try_start_0
/* new-instance v5, Landroid/content/Intent; */
final String v10 = "android.intent.action.VIEW"; // const-string v10, "android.intent.action.VIEW"
/* invoke-direct {v5, v10, v9}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V */
/* .line 431 */
/* .local v5, "intent":Landroid/content/Intent; */
if ( v8 != null) { // if-eqz v8, :cond_7
/* .line 433 */
(( android.content.Intent ) v5 ).setDataAndType ( v9, v8 ); // invoke-virtual {v5, v9, v8}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;
/* .line 435 */
} // :cond_7
v10 = this.myActivity;
(( com.ansca.corona.CoronaActivity ) v10 ).startActivity ( v5 ); // invoke-virtual {v10, v5}, Lcom/ansca/corona/CoronaActivity;->startActivity(Landroid/content/Intent;)V
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* goto/16 :goto_0 */
/* .line 437 */
} // .end local v5 # "intent":Landroid/content/Intent;
/* :catch_0 */
/* move-exception v10 */
/* goto/16 :goto_0 */
/* .line 439 */
} // .end local v4 # "index":I
} // .end local v8 # "mimeTypeName":Ljava/lang/String;
} // :cond_8
v10 = android.net.MailTo .isMailTo ( p1 );
if ( v10 != null) { // if-eqz v10, :cond_9
/* .line 442 */
com.ansca.corona.MailSettings .fromUrl ( p1 );
/* .line 447 */
/* .local v6, "mailSettings":Lcom/ansca/corona/MailSettings; */
try { // :try_start_1
(( com.ansca.corona.MailSettings ) v6 ).toIntent ( ); // invoke-virtual {v6}, Lcom/ansca/corona/MailSettings;->toIntent()Landroid/content/Intent;
/* .line 448 */
/* .local v2, "emailIntent":Landroid/content/Intent; */
v10 = this.myActivity;
final String v11 = "Send mail..."; // const-string v11, "Send mail..."
android.content.Intent .createChooser ( v2,v11 );
(( com.ansca.corona.CoronaActivity ) v10 ).startActivity ( v11 ); // invoke-virtual {v10, v11}, Lcom/ansca/corona/CoronaActivity;->startActivity(Landroid/content/Intent;)V
/* :try_end_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_1 */
/* goto/16 :goto_0 */
/* .line 450 */
} // .end local v2 # "emailIntent":Landroid/content/Intent;
/* :catch_1 */
/* move-exception v10 */
/* goto/16 :goto_0 */
/* .line 455 */
} // .end local v6 # "mailSettings":Lcom/ansca/corona/MailSettings;
} // :cond_9
(( android.net.Uri ) v9 ).getScheme ( ); // invoke-virtual {v9}, Landroid/net/Uri;->getScheme()Ljava/lang/String;
/* if-nez v10, :cond_b */
/* .line 458 */
final String v10 = "http://"; // const-string v10, "http://"
v10 = (( java.lang.String ) p1 ).startsWith ( v10 ); // invoke-virtual {p1, v10}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
/* if-nez v10, :cond_a */
/* .line 460 */
/* new-instance v10, Ljava/lang/StringBuilder; */
/* invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V */
final String v11 = "http://"; // const-string v11, "http://"
(( java.lang.StringBuilder ) v10 ).append ( v11 ); // invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v10 ).append ( p1 ); // invoke-virtual {v10, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v10 ).toString ( ); // invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.net.Uri .parse ( v10 );
/* .line 470 */
} // :cond_a
} // :goto_1
try { // :try_start_2
v10 = this.myActivity;
/* new-instance v11, Landroid/content/Intent; */
/* invoke-direct {v11, v0, v9}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V */
(( com.ansca.corona.CoronaActivity ) v10 ).startActivity ( v11 ); // invoke-virtual {v10, v11}, Lcom/ansca/corona/CoronaActivity;->startActivity(Landroid/content/Intent;)V
/* :try_end_2 */
/* .catch Ljava/lang/Exception; {:try_start_2 ..:try_end_2} :catch_2 */
/* goto/16 :goto_0 */
/* .line 472 */
/* :catch_2 */
/* move-exception v10 */
/* goto/16 :goto_0 */
/* .line 463 */
} // :cond_b
(( android.net.Uri ) v9 ).getScheme ( ); // invoke-virtual {v9}, Landroid/net/Uri;->getScheme()Ljava/lang/String;
final String v11 = "tel"; // const-string v11, "tel"
v10 = (( java.lang.String ) v10 ).equals ( v11 ); // invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v10 != null) { // if-eqz v10, :cond_a
/* .line 466 */
final String v0 = "android.intent.action.CALL"; // const-string v0, "android.intent.action.CALL"
} // .end method
public Boolean saveBitmap ( android.graphics.Bitmap p0, Integer p1, java.lang.String p2 ) {
/* .locals 6 */
/* .param p1, "bitmap" # Landroid/graphics/Bitmap; */
/* .param p2, "quality" # I */
/* .param p3, "filePathName" # Ljava/lang/String; */
/* .prologue */
/* .line 511 */
int v2 = 0; // const/4 v2, 0x0
/* .line 514 */
/* .local v2, "result":Z */
if ( p1 != null) { // if-eqz p1, :cond_0
if ( p3 != null) { // if-eqz p3, :cond_0
v4 = (( java.lang.String ) p3 ).length ( ); // invoke-virtual {p3}, Ljava/lang/String;->length()I
/* if-gtz v4, :cond_1 */
/* .line 515 */
} // :cond_0
int v4 = 0; // const/4 v4, 0x0
/* .line 539 */
} // :goto_0
/* .line 520 */
} // :cond_1
(( java.lang.String ) p3 ).toLowerCase ( ); // invoke-virtual {p3}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
final String v5 = ".png"; // const-string v5, ".png"
v4 = (( java.lang.String ) v4 ).endsWith ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
if ( v4 != null) { // if-eqz v4, :cond_2
/* .line 521 */
v1 = android.graphics.Bitmap$CompressFormat.PNG;
/* .line 529 */
/* .local v1, "format":Landroid/graphics/Bitmap$CompressFormat; */
} // :goto_1
try { // :try_start_0
/* new-instance v3, Ljava/io/FileOutputStream; */
/* invoke-direct {v3, p3}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;)V */
/* .line 530 */
/* .local v3, "stream":Ljava/io/FileOutputStream; */
v2 = (( android.graphics.Bitmap ) p1 ).compress ( v1, p2, v3 ); // invoke-virtual {p1, v1, p2, v3}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
/* .line 531 */
(( java.io.FileOutputStream ) v3 ).flush ( ); // invoke-virtual {v3}, Ljava/io/FileOutputStream;->flush()V
/* .line 532 */
(( java.io.FileOutputStream ) v3 ).close ( ); // invoke-virtual {v3}, Ljava/io/FileOutputStream;->close()V
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
} // .end local v3 # "stream":Ljava/io/FileOutputStream;
} // :goto_2
/* move v4, v2 */
/* .line 539 */
/* .line 524 */
} // .end local v1 # "format":Landroid/graphics/Bitmap$CompressFormat;
} // :cond_2
v1 = android.graphics.Bitmap$CompressFormat.JPEG;
/* .restart local v1 # "format":Landroid/graphics/Bitmap$CompressFormat; */
/* .line 534 */
/* :catch_0 */
/* move-exception v0 */
/* .line 535 */
/* .local v0, "ex":Ljava/lang/Exception; */
(( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
} // .end method
public Boolean saveBitmap ( android.graphics.Bitmap p0, android.net.Uri p1 ) {
/* .locals 8 */
/* .param p1, "bitmap" # Landroid/graphics/Bitmap; */
/* .param p2, "uri" # Landroid/net/Uri; */
/* .prologue */
/* .line 477 */
int v5 = 0; // const/4 v5, 0x0
/* .line 480 */
/* .local v5, "result":Z */
v6 = this.myActivity;
if ( v6 != null) { // if-eqz v6, :cond_0
if ( p1 != null) { // if-eqz p1, :cond_0
/* if-nez p2, :cond_1 */
/* .line 481 */
} // :cond_0
int v6 = 0; // const/4 v6, 0x0
/* .line 507 */
} // :goto_0
/* .line 487 */
} // :cond_1
v6 = this.myActivity;
(( com.ansca.corona.CoronaActivity ) v6 ).getContentResolver ( ); // invoke-virtual {v6}, Lcom/ansca/corona/CoronaActivity;->getContentResolver()Landroid/content/ContentResolver;
(( android.content.ContentResolver ) v6 ).getType ( p2 ); // invoke-virtual {v6, p2}, Landroid/content/ContentResolver;->getType(Landroid/net/Uri;)Ljava/lang/String;
/* .line 488 */
/* .local v2, "mimeTypeName":Ljava/lang/String; */
if ( v2 != null) { // if-eqz v2, :cond_2
(( java.lang.String ) v2 ).toLowerCase ( ); // invoke-virtual {v2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
final String v7 = "png"; // const-string v7, "png"
v6 = (( java.lang.String ) v6 ).endsWith ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
if ( v6 != null) { // if-eqz v6, :cond_2
/* .line 489 */
v1 = android.graphics.Bitmap$CompressFormat.PNG;
/* .line 490 */
/* .local v1, "format":Landroid/graphics/Bitmap$CompressFormat; */
/* const/16 v4, 0x64 */
/* .line 499 */
/* .local v4, "quality":I */
} // :goto_1
try { // :try_start_0
v6 = this.myActivity;
(( com.ansca.corona.CoronaActivity ) v6 ).getContentResolver ( ); // invoke-virtual {v6}, Lcom/ansca/corona/CoronaActivity;->getContentResolver()Landroid/content/ContentResolver;
(( android.content.ContentResolver ) v6 ).openOutputStream ( p2 ); // invoke-virtual {v6, p2}, Landroid/content/ContentResolver;->openOutputStream(Landroid/net/Uri;)Ljava/io/OutputStream;
/* .line 500 */
/* .local v3, "outStream":Ljava/io/OutputStream; */
v5 = (( android.graphics.Bitmap ) p1 ).compress ( v1, v4, v3 ); // invoke-virtual {p1, v1, v4, v3}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
/* .line 501 */
(( java.io.OutputStream ) v3 ).flush ( ); // invoke-virtual {v3}, Ljava/io/OutputStream;->flush()V
/* .line 502 */
(( java.io.OutputStream ) v3 ).close ( ); // invoke-virtual {v3}, Ljava/io/OutputStream;->close()V
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
} // .end local v3 # "outStream":Ljava/io/OutputStream;
} // :goto_2
/* move v6, v5 */
/* .line 507 */
/* .line 493 */
} // .end local v1 # "format":Landroid/graphics/Bitmap$CompressFormat;
} // .end local v4 # "quality":I
} // :cond_2
v1 = android.graphics.Bitmap$CompressFormat.JPEG;
/* .line 494 */
/* .restart local v1 # "format":Landroid/graphics/Bitmap$CompressFormat; */
/* const/16 v4, 0x5a */
/* .restart local v4 # "quality":I */
/* .line 504 */
/* :catch_0 */
/* move-exception v0 */
/* .line 505 */
/* .local v0, "ex":Ljava/lang/Exception; */
(( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
} // .end method
public void setAccelerometerInterval ( Integer p0 ) {
/* .locals 1 */
/* .param p1, "frequency" # I */
/* .prologue */
/* .line 894 */
v0 = this.mySensorManager;
(( com.ansca.corona.CoronaSensorManager ) v0 ).setAccelerometerInterval ( p1 ); // invoke-virtual {v0, p1}, Lcom/ansca/corona/CoronaSensorManager;->setAccelerometerInterval(I)V
/* .line 895 */
return;
} // .end method
public void setEventNotification ( Integer p0, Boolean p1 ) {
/* .locals 1 */
/* .param p1, "eventType" # I */
/* .param p2, "enable" # Z */
/* .prologue */
/* .line 924 */
v0 = this.mySensorManager;
(( com.ansca.corona.CoronaSensorManager ) v0 ).setEventNotification ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lcom/ansca/corona/CoronaSensorManager;->setEventNotification(IZ)V
/* .line 925 */
return;
} // .end method
public void setGyroscopeInterval ( Integer p0 ) {
/* .locals 1 */
/* .param p1, "frequency" # I */
/* .prologue */
/* .line 898 */
v0 = this.mySensorManager;
(( com.ansca.corona.CoronaSensorManager ) v0 ).setGyroscopeInterval ( p1 ); // invoke-virtual {v0, p1}, Lcom/ansca/corona/CoronaSensorManager;->setGyroscopeInterval(I)V
/* .line 899 */
return;
} // .end method
public void setIdleTimer ( Boolean p0 ) {
/* .locals 0 */
/* .param p1, "enabled" # Z */
/* .prologue */
/* .line 596 */
/* invoke-direct {p0, p1}, Lcom/ansca/corona/Controller;->internalSetIdleTimer(Z)V */
/* .line 597 */
/* iput-boolean p1, p0, Lcom/ansca/corona/Controller;->myIdleEnabled:Z */
/* .line 598 */
return;
} // .end method
public void setLocationThreshold ( Double p0 ) {
/* .locals 1 */
/* .param p1, "meters" # D */
/* .prologue */
/* .line 902 */
v0 = this.mySensorManager;
(( com.ansca.corona.CoronaSensorManager ) v0 ).setLocationThreshold ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lcom/ansca/corona/CoronaSensorManager;->setLocationThreshold(D)V
/* .line 903 */
return;
} // .end method
public void setTimer ( Integer p0 ) {
/* .locals 0 */
/* .param p1, "milliseconds" # I */
/* .prologue */
/* .line 317 */
/* iput p1, p0, Lcom/ansca/corona/Controller;->myTimerMilliseconds:I */
/* .line 318 */
(( com.ansca.corona.Controller ) p0 ).startTimer ( ); // invoke-virtual {p0}, Lcom/ansca/corona/Controller;->startTimer()V
/* .line 319 */
return;
} // .end method
public void showImagePickerWindow ( Integer p0, java.lang.String p1 ) {
/* .locals 2 */
/* .param p1, "imageSourceType" # I */
/* .param p2, "destinationFilePath" # Ljava/lang/String; */
/* .prologue */
/* .line 810 */
v0 = this.myActivity;
/* if-nez v0, :cond_0 */
/* .line 841 */
} // :goto_0
return;
/* .line 815 */
} // :cond_0
v0 = this.myActivity;
/* new-instance v1, Lcom/ansca/corona/Controller$14; */
/* invoke-direct {v1, p0, p1, p2}, Lcom/ansca/corona/Controller$14;-><init>(Lcom/ansca/corona/Controller;ILjava/lang/String;)V */
(( com.ansca.corona.CoronaActivity ) v0 ).runOnUiThread ( v1 ); // invoke-virtual {v0, v1}, Lcom/ansca/corona/CoronaActivity;->runOnUiThread(Ljava/lang/Runnable;)V
} // .end method
public void showNativeActivityIndicator ( ) {
/* .locals 2 */
/* .prologue */
/* .line 735 */
v0 = this.myActivity;
/* if-nez v0, :cond_0 */
/* .line 762 */
} // :goto_0
return;
/* .line 740 */
} // :cond_0
v0 = this.myActivity;
/* new-instance v1, Lcom/ansca/corona/Controller$13; */
/* invoke-direct {v1, p0}, Lcom/ansca/corona/Controller$13;-><init>(Lcom/ansca/corona/Controller;)V */
(( com.ansca.corona.CoronaActivity ) v0 ).runOnUiThread ( v1 ); // invoke-virtual {v0, v1}, Lcom/ansca/corona/CoronaActivity;->runOnUiThread(Ljava/lang/Runnable;)V
} // .end method
public void showNativeAlert ( java.lang.String p0, java.lang.String p1, java.lang.String[] p2 ) {
/* .locals 8 */
/* .param p1, "title" # Ljava/lang/String; */
/* .param p2, "msg" # Ljava/lang/String; */
/* .param p3, "buttonLabels" # [Ljava/lang/String; */
/* .prologue */
int v7 = 2; // const/4 v7, 0x2
int v6 = 1; // const/4 v6, 0x1
int v4 = 0; // const/4 v4, 0x0
/* .line 607 */
/* monitor-enter p0 */
/* .line 609 */
try { // :try_start_0
v5 = this.myAlertDialog;
if ( v5 != null) { // if-eqz v5, :cond_0
/* .line 610 */
/* monitor-exit p0 */
/* .line 681 */
} // :goto_0
return;
/* .line 612 */
} // :cond_0
/* monitor-exit p0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 615 */
/* new-instance v0, Landroid/app/AlertDialog$Builder; */
v5 = this.myActivity;
/* invoke-direct {v0, v5}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V */
/* .line 616 */
/* .local v0, "builder":Landroid/app/AlertDialog$Builder; */
/* new-instance v3, Lcom/ansca/corona/Controller$7; */
/* invoke-direct {v3, p0}, Lcom/ansca/corona/Controller$7;-><init>(Lcom/ansca/corona/Controller;)V */
/* .line 639 */
/* .local v3, "clickListener":Landroid/content/DialogInterface$OnClickListener; */
/* new-instance v2, Lcom/ansca/corona/Controller$8; */
/* invoke-direct {v2, p0}, Lcom/ansca/corona/Controller$8;-><init>(Lcom/ansca/corona/Controller;)V */
/* .line 649 */
/* .local v2, "cancelListener":Landroid/content/DialogInterface$OnCancelListener; */
if ( p3 != null) { // if-eqz p3, :cond_2
/* array-length v1, p3 */
/* .line 650 */
/* .local v1, "buttonCount":I */
} // :goto_1
/* if-gtz v1, :cond_3 */
/* .line 651 */
(( android.app.AlertDialog$Builder ) v0 ).setTitle ( p1 ); // invoke-virtual {v0, p1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
/* .line 652 */
(( android.app.AlertDialog$Builder ) v0 ).setMessage ( p2 ); // invoke-virtual {v0, p2}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
/* .line 669 */
} // :cond_1
} // :goto_2
(( android.app.AlertDialog$Builder ) v0 ).setOnCancelListener ( v2 ); // invoke-virtual {v0, v2}, Landroid/app/AlertDialog$Builder;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)Landroid/app/AlertDialog$Builder;
/* .line 672 */
v4 = this.myActivity;
/* new-instance v5, Lcom/ansca/corona/Controller$9; */
/* invoke-direct {v5, p0, v0}, Lcom/ansca/corona/Controller$9;-><init>(Lcom/ansca/corona/Controller;Landroid/app/AlertDialog$Builder;)V */
(( com.ansca.corona.CoronaActivity ) v4 ).runOnUiThread ( v5 ); // invoke-virtual {v4, v5}, Lcom/ansca/corona/CoronaActivity;->runOnUiThread(Ljava/lang/Runnable;)V
/* .line 612 */
} // .end local v0 # "builder":Landroid/app/AlertDialog$Builder;
} // .end local v1 # "buttonCount":I
} // .end local v2 # "cancelListener":Landroid/content/DialogInterface$OnCancelListener;
} // .end local v3 # "clickListener":Landroid/content/DialogInterface$OnClickListener;
/* :catchall_0 */
/* move-exception v4 */
try { // :try_start_1
/* monitor-exit p0 */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* throw v4 */
/* .restart local v0 # "builder":Landroid/app/AlertDialog$Builder; */
/* .restart local v2 # "cancelListener":Landroid/content/DialogInterface$OnCancelListener; */
/* .restart local v3 # "clickListener":Landroid/content/DialogInterface$OnClickListener; */
} // :cond_2
/* move v1, v4 */
/* .line 649 */
/* .line 654 */
/* .restart local v1 # "buttonCount":I */
} // :cond_3
int v5 = 3; // const/4 v5, 0x3
/* if-gt v1, v5, :cond_5 */
/* .line 655 */
(( android.app.AlertDialog$Builder ) v0 ).setTitle ( p1 ); // invoke-virtual {v0, p1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
/* .line 656 */
(( android.app.AlertDialog$Builder ) v0 ).setMessage ( p2 ); // invoke-virtual {v0, p2}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
/* .line 657 */
/* aget-object v4, p3, v4 */
(( android.app.AlertDialog$Builder ) v0 ).setPositiveButton ( v4, v3 ); // invoke-virtual {v0, v4, v3}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
/* .line 658 */
/* if-le v1, v6, :cond_4 */
/* .line 659 */
/* aget-object v4, p3, v6 */
(( android.app.AlertDialog$Builder ) v0 ).setNeutralButton ( v4, v3 ); // invoke-virtual {v0, v4, v3}, Landroid/app/AlertDialog$Builder;->setNeutralButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
/* .line 661 */
} // :cond_4
/* if-le v1, v7, :cond_1 */
/* .line 662 */
/* aget-object v4, p3, v7 */
(( android.app.AlertDialog$Builder ) v0 ).setNegativeButton ( v4, v3 ); // invoke-virtual {v0, v4, v3}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
/* .line 666 */
} // :cond_5
/* new-instance v4, Ljava/lang/StringBuilder; */
/* invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v4 ).append ( p1 ); // invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v5 = ": "; // const-string v5, ": "
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).append ( p2 ); // invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( android.app.AlertDialog$Builder ) v0 ).setTitle ( v4 ); // invoke-virtual {v0, v4}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
/* .line 667 */
(( android.app.AlertDialog$Builder ) v0 ).setItems ( p3, v3 ); // invoke-virtual {v0, p3, v3}, Landroid/app/AlertDialog$Builder;->setItems([Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
} // .end method
public void showSendMailWindow ( java.util.HashMap p0 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/HashMap", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/Object;", */
/* ">;)V" */
/* } */
} // .end annotation
/* .prologue */
/* .line 849 */
/* .local p1, "settings":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;" */
v1 = this.myActivity;
/* if-nez v1, :cond_0 */
/* .line 866 */
} // :goto_0
return;
/* .line 854 */
} // :cond_0
v1 = this.myActivity;
com.ansca.corona.MailSettings .from ( v1,p1 );
/* .line 857 */
/* .local v0, "mailSettings":Lcom/ansca/corona/MailSettings; */
v1 = this.myActivity;
/* new-instance v2, Lcom/ansca/corona/Controller$15; */
/* invoke-direct {v2, p0, v0}, Lcom/ansca/corona/Controller$15;-><init>(Lcom/ansca/corona/Controller;Lcom/ansca/corona/MailSettings;)V */
(( com.ansca.corona.CoronaActivity ) v1 ).runOnUiThread ( v2 ); // invoke-virtual {v1, v2}, Lcom/ansca/corona/CoronaActivity;->runOnUiThread(Ljava/lang/Runnable;)V
} // .end method
public void showSendSmsWindow ( java.util.HashMap p0 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/HashMap", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/Object;", */
/* ">;)V" */
/* } */
} // .end annotation
/* .prologue */
/* .line 874 */
/* .local p1, "settings":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;" */
v1 = this.myActivity;
/* if-nez v1, :cond_0 */
/* .line 891 */
} // :goto_0
return;
/* .line 879 */
} // :cond_0
com.ansca.corona.SmsSettings .from ( p1 );
/* .line 882 */
/* .local v0, "smsSettings":Lcom/ansca/corona/SmsSettings; */
v1 = this.myActivity;
/* new-instance v2, Lcom/ansca/corona/Controller$16; */
/* invoke-direct {v2, p0, v0}, Lcom/ansca/corona/Controller$16;-><init>(Lcom/ansca/corona/Controller;Lcom/ansca/corona/SmsSettings;)V */
(( com.ansca.corona.CoronaActivity ) v1 ).runOnUiThread ( v2 ); // invoke-virtual {v1, v2}, Lcom/ansca/corona/CoronaActivity;->runOnUiThread(Ljava/lang/Runnable;)V
} // .end method
public void showTrialAlert ( ) {
/* .locals 4 */
/* .prologue */
/* .line 709 */
/* new-instance v0, Landroid/app/AlertDialog$Builder; */
v2 = this.myActivity;
/* invoke-direct {v0, v2}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V */
/* .line 710 */
/* .local v0, "builder":Landroid/app/AlertDialog$Builder; */
/* new-instance v1, Lcom/ansca/corona/Controller$11; */
/* invoke-direct {v1, p0}, Lcom/ansca/corona/Controller$11;-><init>(Lcom/ansca/corona/Controller;)V */
/* .line 716 */
/* .local v1, "clickListener":Landroid/content/DialogInterface$OnClickListener; */
final String v2 = "Corona SDK Trial"; // const-string v2, "Corona SDK Trial"
(( android.app.AlertDialog$Builder ) v0 ).setTitle ( v2 ); // invoke-virtual {v0, v2}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
/* .line 717 */
final String v2 = "This message only appears in the trial version"; // const-string v2, "This message only appears in the trial version"
(( android.app.AlertDialog$Builder ) v0 ).setMessage ( v2 ); // invoke-virtual {v0, v2}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
/* .line 718 */
final String v2 = "OK"; // const-string v2, "OK"
int v3 = 0; // const/4 v3, 0x0
(( android.app.AlertDialog$Builder ) v0 ).setPositiveButton ( v2, v3 ); // invoke-virtual {v0, v2, v3}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
/* .line 719 */
final String v2 = "Learn More"; // const-string v2, "Learn More"
(( android.app.AlertDialog$Builder ) v0 ).setNeutralButton ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Landroid/app/AlertDialog$Builder;->setNeutralButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
/* .line 722 */
v2 = this.myActivity;
/* new-instance v3, Lcom/ansca/corona/Controller$12; */
/* invoke-direct {v3, p0, v0}, Lcom/ansca/corona/Controller$12;-><init>(Lcom/ansca/corona/Controller;Landroid/app/AlertDialog$Builder;)V */
(( com.ansca.corona.CoronaActivity ) v2 ).runOnUiThread ( v3 ); // invoke-virtual {v2, v3}, Lcom/ansca/corona/CoronaActivity;->runOnUiThread(Ljava/lang/Runnable;)V
/* .line 728 */
return;
} // .end method
public synchronized void start ( ) {
/* .locals 3 */
/* .prologue */
/* .line 178 */
/* monitor-enter p0 */
try { // :try_start_0
/* iget-boolean v0, p0, Lcom/ansca/corona/Controller;->myInitialResume:Z */
/* if-nez v0, :cond_0 */
/* .line 179 */
v0 = this.myEventManager;
/* new-instance v1, Lcom/ansca/corona/events/RunnableEvent; */
/* new-instance v2, Lcom/ansca/corona/Controller$1; */
/* invoke-direct {v2, p0}, Lcom/ansca/corona/Controller$1;-><init>(Lcom/ansca/corona/Controller;)V */
/* invoke-direct {v1, v2}, Lcom/ansca/corona/events/RunnableEvent;-><init>(Ljava/lang/Runnable;)V */
(( com.ansca.corona.events.EventManager ) v0 ).addEvent ( v1 ); // invoke-virtual {v0, v1}, Lcom/ansca/corona/events/EventManager;->addEvent(Lcom/ansca/corona/events/Event;)V
/* .line 194 */
} // :goto_0
v0 = this.myMediaManager;
(( com.ansca.corona.MediaManager ) v0 ).resumeAll ( ); // invoke-virtual {v0}, Lcom/ansca/corona/MediaManager;->resumeAll()V
/* .line 195 */
v0 = this.mySensorManager;
(( com.ansca.corona.CoronaSensorManager ) v0 ).resume ( ); // invoke-virtual {v0}, Lcom/ansca/corona/CoronaSensorManager;->resume()V
/* .line 196 */
(( com.ansca.corona.Controller ) p0 ).startTimer ( ); // invoke-virtual {p0}, Lcom/ansca/corona/Controller;->startTimer()V
/* .line 197 */
(( com.ansca.corona.Controller ) p0 ).openFeintResume ( ); // invoke-virtual {p0}, Lcom/ansca/corona/Controller;->openFeintResume()V
/* .line 198 */
/* iget-boolean v0, p0, Lcom/ansca/corona/Controller;->myIdleEnabled:Z */
/* invoke-direct {p0, v0}, Lcom/ansca/corona/Controller;->internalSetIdleTimer(Z)V */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 199 */
/* monitor-exit p0 */
return;
/* .line 191 */
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
try { // :try_start_1
/* iput-boolean v0, p0, Lcom/ansca/corona/Controller;->myInitialResume:Z */
/* .line 192 */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/ansca/corona/Controller;->myIsResumed:Z */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 178 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
public void startTimer ( ) {
/* .locals 4 */
/* .prologue */
/* .line 322 */
/* iget v0, p0, Lcom/ansca/corona/Controller;->myTimerMilliseconds:I */
/* if-nez v0, :cond_1 */
/* .line 337 */
} // :cond_0
} // :goto_0
return;
/* .line 325 */
} // :cond_1
v0 = this.myTimerTask;
/* if-nez v0, :cond_0 */
/* .line 326 */
/* new-instance v0, Lcom/ansca/corona/Controller$3; */
/* invoke-direct {v0, p0}, Lcom/ansca/corona/Controller$3;-><init>(Lcom/ansca/corona/Controller;)V */
this.myTimerTask = v0;
/* .line 335 */
v0 = this.myTimerHandler;
v1 = this.myTimerTask;
/* iget v2, p0, Lcom/ansca/corona/Controller;->myTimerMilliseconds:I */
/* int-to-long v2, v2 */
(( android.os.Handler ) v0 ).postDelayed ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z
} // .end method
public synchronized void stop ( ) {
/* .locals 3 */
/* .prologue */
/* .line 202 */
/* monitor-enter p0 */
try { // :try_start_0
(( com.ansca.corona.Controller ) p0 ).stopTimer ( ); // invoke-virtual {p0}, Lcom/ansca/corona/Controller;->stopTimer()V
/* .line 203 */
v0 = this.mySensorManager;
(( com.ansca.corona.CoronaSensorManager ) v0 ).pause ( ); // invoke-virtual {v0}, Lcom/ansca/corona/CoronaSensorManager;->pause()V
/* .line 204 */
v0 = this.myEventManager;
/* new-instance v1, Lcom/ansca/corona/events/RunnableEvent; */
/* new-instance v2, Lcom/ansca/corona/Controller$2; */
/* invoke-direct {v2, p0}, Lcom/ansca/corona/Controller$2;-><init>(Lcom/ansca/corona/Controller;)V */
/* invoke-direct {v1, v2}, Lcom/ansca/corona/events/RunnableEvent;-><init>(Ljava/lang/Runnable;)V */
(( com.ansca.corona.events.EventManager ) v0 ).addEvent ( v1 ); // invoke-virtual {v0, v1}, Lcom/ansca/corona/events/EventManager;->addEvent(Lcom/ansca/corona/events/Event;)V
/* .line 213 */
v0 = this.myMediaManager;
(( com.ansca.corona.MediaManager ) v0 ).pauseAll ( ); // invoke-virtual {v0}, Lcom/ansca/corona/MediaManager;->pauseAll()V
/* .line 214 */
int v0 = 1; // const/4 v0, 0x1
/* invoke-direct {p0, v0}, Lcom/ansca/corona/Controller;->internalSetIdleTimer(Z)V */
/* .line 215 */
(( com.ansca.corona.Controller ) p0 ).flurryStop ( ); // invoke-virtual {p0}, Lcom/ansca/corona/Controller;->flurryStop()V
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 216 */
/* monitor-exit p0 */
return;
/* .line 202 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
public void stopTimer ( ) {
/* .locals 2 */
/* .prologue */
/* .line 345 */
v0 = this.myTimerTask;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 346 */
v0 = this.myTimerHandler;
v1 = this.myTimerTask;
(( android.os.Handler ) v0 ).removeCallbacks ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V
/* .line 347 */
int v0 = 0; // const/4 v0, 0x0
this.myTimerTask = v0;
/* .line 349 */
} // :cond_0
return;
} // .end method
public void superRewardsInit ( java.lang.String p0, java.lang.String p1 ) {
/* .locals 2 */
/* .param p1, "appId" # Ljava/lang/String; */
/* .param p2, "uid" # Ljava/lang/String; */
/* .prologue */
/* .line 1490 */
/* iget-boolean v0, p0, Lcom/ansca/corona/Controller;->myRewardsInitialized:Z */
/* if-nez v0, :cond_0 */
/* .line 1491 */
/* new-instance v0, Ljava/lang/String; */
/* invoke-direct {v0, p1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V */
this.myRewardsAppId = v0;
/* .line 1492 */
/* new-instance v0, Ljava/lang/String; */
/* invoke-direct {v0, p2}, Ljava/lang/String;-><init>(Ljava/lang/String;)V */
this.myRewardsUid = v0;
/* .line 1493 */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/ansca/corona/Controller;->myRewardsInitialized:Z */
/* .line 1494 */
v0 = this.myActivity;
/* new-instance v1, Lcom/ansca/corona/Controller$27; */
/* invoke-direct {v1, p0}, Lcom/ansca/corona/Controller$27;-><init>(Lcom/ansca/corona/Controller;)V */
(( com.ansca.corona.CoronaActivity ) v0 ).runOnUiThread ( v1 ); // invoke-virtual {v0, v1}, Lcom/ansca/corona/CoronaActivity;->runOnUiThread(Ljava/lang/Runnable;)V
/* .line 1503 */
} // :cond_0
return;
} // .end method
public void superRewardsRequestUpdate ( ) {
/* .locals 2 */
/* .prologue */
/* .line 1548 */
/* iget-boolean v0, p0, Lcom/ansca/corona/Controller;->myRewardsInitialized:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 1549 */
v0 = this.myActivity;
/* new-instance v1, Lcom/ansca/corona/Controller$29; */
/* invoke-direct {v1, p0}, Lcom/ansca/corona/Controller$29;-><init>(Lcom/ansca/corona/Controller;)V */
(( com.ansca.corona.CoronaActivity ) v0 ).runOnUiThread ( v1 ); // invoke-virtual {v0, v1}, Lcom/ansca/corona/CoronaActivity;->runOnUiThread(Ljava/lang/Runnable;)V
/* .line 1560 */
} // :cond_0
return;
} // .end method
public void superRewardsShowOffers ( ) {
/* .locals 2 */
/* .prologue */
/* .line 1506 */
/* iget-boolean v0, p0, Lcom/ansca/corona/Controller;->myRewardsInitialized:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 1507 */
v0 = this.myActivity;
/* new-instance v1, Lcom/ansca/corona/Controller$28; */
/* invoke-direct {v1, p0}, Lcom/ansca/corona/Controller$28;-><init>(Lcom/ansca/corona/Controller;)V */
(( com.ansca.corona.CoronaActivity ) v0 ).runOnUiThread ( v1 ); // invoke-virtual {v0, v1}, Lcom/ansca/corona/CoronaActivity;->runOnUiThread(Ljava/lang/Runnable;)V
/* .line 1516 */
} // :cond_0
return;
} // .end method
public void vibrate ( ) {
/* .locals 3 */
/* .prologue */
/* .line 928 */
v1 = this.myActivity;
final String v2 = "vibrator"; // const-string v2, "vibrator"
(( com.ansca.corona.CoronaActivity ) v1 ).getSystemService ( v2 ); // invoke-virtual {v1, v2}, Lcom/ansca/corona/CoronaActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v0, Landroid/os/Vibrator; */
/* .line 929 */
/* .local v0, "v":Landroid/os/Vibrator; */
/* const-wide/16 v1, 0x64 */
(( android.os.Vibrator ) v0 ).vibrate ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/os/Vibrator;->vibrate(J)V
/* .line 930 */
return;
} // .end method
