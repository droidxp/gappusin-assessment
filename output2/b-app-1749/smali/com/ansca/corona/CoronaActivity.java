public class com.ansca.corona.CoronaActivity extends android.app.Activity {
	 /* .source "CoronaActivity.java" */
	 /* # static fields */
	 static final Integer CORONA_ORIENTATION_SIDEWAYS_LEFT;
	 static final Integer CORONA_ORIENTATION_SIDEWAYS_RIGHT;
	 static final Integer CORONA_ORIENTATION_UNKNOWN;
	 static final Integer CORONA_ORIENTATION_UPRIGHT;
	 static final Integer CORONA_ORIENTATION_UPSIDE_DOWN;
	 private static final java.lang.String CORONA_PREFERENCES_LAST_INSTALL_TIME_KEY;
	 private static final java.lang.String CORONA_PREFERENCES_NAME;
	 static final Integer CORONA_STATUSBAR_MODE_DARK;
	 static final Integer CORONA_STATUSBAR_MODE_DEFAULT;
	 static final Integer CORONA_STATUSBAR_MODE_HIDDEN;
	 static final Integer CORONA_STATUSBAR_MODE_TRANSLUCENT;
	 static final Integer FACEBOOK_LOGIN_REQUEST;
	 static final Integer SELECT_IMAGE_REQUEST;
	 static final Integer SEND_MAIL_REQUEST;
	 static final Integer SEND_SMS_REQUEST;
	 static final Integer TAKE_PICTURE_WITH_CORONA_REQUEST;
	 static final Integer TAKE_PICTURE_WITH_EXTERNAL_APP_REQUEST;
	 private static Integer sId;
	 private static Integer sTouchId;
	 private static java.util.HashMap sTouches;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/HashMap", */
	 /* "<", */
	 /* "Ljava/lang/Integer;", */
	 /* "Lcom/ansca/corona/events/TouchData;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
/* # instance fields */
private android.widget.ImageView fSplashScreenView;
private java.io.File myCameraShotDestinationFile;
private android.net.Uri myCameraShotSourceUri;
private Integer myDeviceOrientation;
private Integer myDisplayOrientation;
private Float myFirstTapX;
private Float myFirstTapY;
private com.ansca.corona.version.ISurfaceView myGLView;
private android.os.Handler myHandler;
private Integer myImmediateTapCount;
private Boolean myIsActivityResumed;
private Long myLastTapTime;
private android.view.OrientationEventListener myOrientationListener;
private Integer myPreviousDeviceOrientation;
private Integer myPreviousDisplayOrientation;
private com.ansca.corona.CoronaRuntimeTaskDispatcher myRuntimeTaskDispatcher;
private java.lang.String mySelectImageDestinationFilePath;
private Integer myStatusBarMode;
private com.ansca.corona.purchasing.StoreProxy myStore;
private com.ansca.corona.SystemMonitor mySystemMonitor;
private Boolean myTapHasStarted;
private Float myTapStartX;
private Float myTapStartY;
/* # direct methods */
static com.ansca.corona.CoronaActivity ( ) {
/* .locals 1 */
/* .prologue */
/* .line 1167 */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
/* .line 1168 */
int v0 = 1; // const/4 v0, 0x1
/* .line 1170 */
int v0 = -1; // const/4 v0, -0x1
return;
} // .end method
public com.ansca.corona.CoronaActivity ( ) {
/* .locals 4 */
/* .prologue */
int v3 = 0; // const/4 v3, 0x0
int v0 = 0; // const/4 v0, 0x0
int v2 = 0; // const/4 v2, 0x0
/* .line 31 */
/* invoke-direct {p0}, Landroid/app/Activity;-><init>()V */
/* .line 47 */
/* iput-boolean v3, p0, Lcom/ansca/corona/CoronaActivity;->myIsActivityResumed:Z */
/* .line 49 */
this.fSplashScreenView = v2;
/* .line 50 */
this.myStore = v2;
/* .line 58 */
this.mySelectImageDestinationFilePath = v2;
/* .line 59 */
this.myCameraShotSourceUri = v2;
/* .line 60 */
this.myCameraShotDestinationFile = v2;
/* .line 61 */
/* iput-boolean v3, p0, Lcom/ansca/corona/CoronaActivity;->myTapHasStarted:Z */
/* .line 62 */
/* iput v0, p0, Lcom/ansca/corona/CoronaActivity;->myTapStartX:F */
/* .line 63 */
/* iput v0, p0, Lcom/ansca/corona/CoronaActivity;->myTapStartY:F */
/* .line 64 */
/* iput v0, p0, Lcom/ansca/corona/CoronaActivity;->myFirstTapX:F */
/* .line 65 */
/* iput v0, p0, Lcom/ansca/corona/CoronaActivity;->myFirstTapY:F */
/* .line 66 */
/* const-wide/16 v0, 0x0 */
/* iput-wide v0, p0, Lcom/ansca/corona/CoronaActivity;->myLastTapTime:J */
/* .line 69 */
/* iput v3, p0, Lcom/ansca/corona/CoronaActivity;->myImmediateTapCount:I */
/* .line 72 */
this.myHandler = v2;
/* .line 75 */
this.myRuntimeTaskDispatcher = v2;
return;
} // .end method
static com.ansca.corona.version.ISurfaceView access$000 ( com.ansca.corona.CoronaActivity p0 ) { //synthethic
/* .locals 1 */
/* .param p0, "x0" # Lcom/ansca/corona/CoronaActivity; */
/* .prologue */
/* .line 31 */
v0 = this.myGLView;
} // .end method
static Integer access$100 ( com.ansca.corona.CoronaActivity p0, Integer p1 ) { //synthethic
/* .locals 1 */
/* .param p0, "x0" # Lcom/ansca/corona/CoronaActivity; */
/* .param p1, "x1" # I */
/* .prologue */
/* .line 31 */
v0 = /* invoke-direct {p0, p1}, Lcom/ansca/corona/CoronaActivity;->getCoronaOrientationFromDegrees(I)I */
} // .end method
static Integer access$200 ( com.ansca.corona.CoronaActivity p0 ) { //synthethic
/* .locals 1 */
/* .param p0, "x0" # Lcom/ansca/corona/CoronaActivity; */
/* .prologue */
/* .line 31 */
/* iget v0, p0, Lcom/ansca/corona/CoronaActivity;->myDeviceOrientation:I */
} // .end method
static Integer access$202 ( com.ansca.corona.CoronaActivity p0, Integer p1 ) { //synthethic
/* .locals 0 */
/* .param p0, "x0" # Lcom/ansca/corona/CoronaActivity; */
/* .param p1, "x1" # I */
/* .prologue */
/* .line 31 */
/* iput p1, p0, Lcom/ansca/corona/CoronaActivity;->myDeviceOrientation:I */
} // .end method
static Integer access$300 ( com.ansca.corona.CoronaActivity p0 ) { //synthethic
/* .locals 1 */
/* .param p0, "x0" # Lcom/ansca/corona/CoronaActivity; */
/* .prologue */
/* .line 31 */
/* iget v0, p0, Lcom/ansca/corona/CoronaActivity;->myPreviousDeviceOrientation:I */
} // .end method
static Integer access$302 ( com.ansca.corona.CoronaActivity p0, Integer p1 ) { //synthethic
/* .locals 0 */
/* .param p0, "x0" # Lcom/ansca/corona/CoronaActivity; */
/* .param p1, "x1" # I */
/* .prologue */
/* .line 31 */
/* iput p1, p0, Lcom/ansca/corona/CoronaActivity;->myPreviousDeviceOrientation:I */
} // .end method
static android.widget.ImageView access$400 ( com.ansca.corona.CoronaActivity p0 ) { //synthethic
/* .locals 1 */
/* .param p0, "x0" # Lcom/ansca/corona/CoronaActivity; */
/* .prologue */
/* .line 31 */
v0 = this.fSplashScreenView;
} // .end method
static android.widget.ImageView access$402 ( com.ansca.corona.CoronaActivity p0, android.widget.ImageView p1 ) { //synthethic
/* .locals 0 */
/* .param p0, "x0" # Lcom/ansca/corona/CoronaActivity; */
/* .param p1, "x1" # Landroid/widget/ImageView; */
/* .prologue */
/* .line 31 */
this.fSplashScreenView = p1;
} // .end method
private Boolean areCoordinatesWithinTapBounds ( Float p0, Float p1, Float p2, Float p3 ) {
/* .locals 4 */
/* .param p1, "x1" # F */
/* .param p2, "y1" # F */
/* .param p3, "x2" # F */
/* .param p4, "y2" # F */
/* .prologue */
/* const/high16 v3, 0x42200000 # 40.0f */
/* .line 1395 */
/* sub-float v2, p3, p1 */
v0 = java.lang.Math .abs ( v2 );
/* .line 1396 */
/* .local v0, "deltaX":F */
/* sub-float v2, p4, p2 */
v1 = java.lang.Math .abs ( v2 );
/* .line 1397 */
/* .local v1, "deltaY":F */
/* cmpg-float v2, v0, v3 */
/* if-gtz v2, :cond_0 */
/* cmpg-float v2, v1, v3 */
/* if-gtz v2, :cond_0 */
int v2 = 1; // const/4 v2, 0x1
} // :goto_0
} // :cond_0
int v2 = 0; // const/4 v2, 0x0
} // .end method
private void deleteDirectoryTree ( java.io.File p0 ) {
/* .locals 5 */
/* .param p1, "target" # Ljava/io/File; */
/* .prologue */
/* .line 417 */
v4 = (( java.io.File ) p1 ).isDirectory ( ); // invoke-virtual {p1}, Ljava/io/File;->isDirectory()Z
if ( v4 != null) { // if-eqz v4, :cond_0
/* .line 418 */
(( java.io.File ) p1 ).listFiles ( ); // invoke-virtual {p1}, Ljava/io/File;->listFiles()[Ljava/io/File;
/* .local v0, "arr$":[Ljava/io/File; */
/* array-length v3, v0 */
/* .local v3, "len$":I */
int v2 = 0; // const/4 v2, 0x0
/* .local v2, "i$":I */
} // :goto_0
/* if-ge v2, v3, :cond_0 */
/* aget-object v1, v0, v2 */
/* .line 419 */
/* .local v1, "file":Ljava/io/File; */
/* invoke-direct {p0, v1}, Lcom/ansca/corona/CoronaActivity;->deleteDirectoryTree(Ljava/io/File;)V */
/* .line 418 */
/* add-int/lit8 v2, v2, 0x1 */
/* .line 422 */
} // .end local v0 # "arr$":[Ljava/io/File;
} // .end local v1 # "file":Ljava/io/File;
} // .end local v2 # "i$":I
} // .end local v3 # "len$":I
} // :cond_0
(( java.io.File ) p1 ).delete ( ); // invoke-virtual {p1}, Ljava/io/File;->delete()Z
/* .line 423 */
return;
} // .end method
private Integer getCoronaOrientationFromDegrees ( Integer p0 ) {
/* .locals 4 */
/* .param p1, "degrees" # I */
/* .prologue */
/* const/16 v3, 0xe1 */
/* const/16 v2, 0x87 */
/* .line 339 */
v1 = com.ansca.corona.Controller .isValid ( );
if ( v1 != null) { // if-eqz v1, :cond_0
com.ansca.corona.Controller .getController ( );
v1 = (( com.ansca.corona.Controller ) v1 ).isNaturalOrientationPortrait ( ); // invoke-virtual {v1}, Lcom/ansca/corona/Controller;->isNaturalOrientationPortrait()Z
/* if-nez v1, :cond_0 */
/* .line 340 */
/* add-int/lit8 v1, p1, 0x5a */
/* rem-int/lit16 p1, v1, 0x168 */
/* .line 344 */
} // :cond_0
/* const/16 v1, 0x2d */
/* if-lt p1, v1, :cond_1 */
/* if-ge p1, v2, :cond_1 */
/* .line 345 */
int v0 = 2; // const/4 v0, 0x2
/* .line 356 */
/* .local v0, "orientation":I */
} // :goto_0
/* .line 347 */
} // .end local v0 # "orientation":I
} // :cond_1
/* if-lt p1, v2, :cond_2 */
/* if-ge p1, v3, :cond_2 */
/* .line 348 */
int v0 = 3; // const/4 v0, 0x3
/* .restart local v0 # "orientation":I */
/* .line 350 */
} // .end local v0 # "orientation":I
} // :cond_2
/* if-lt p1, v3, :cond_3 */
/* const/16 v1, 0x13b */
/* if-ge p1, v1, :cond_3 */
/* .line 351 */
int v0 = 4; // const/4 v0, 0x4
/* .restart local v0 # "orientation":I */
/* .line 354 */
} // .end local v0 # "orientation":I
} // :cond_3
int v0 = 1; // const/4 v0, 0x1
/* .restart local v0 # "orientation":I */
} // .end method
private Integer getCoronaOrientationFromWindowManager ( ) {
/* .locals 2 */
/* .prologue */
/* .line 311 */
(( com.ansca.corona.CoronaActivity ) p0 ).getWindowManager ( ); // invoke-virtual {p0}, Lcom/ansca/corona/CoronaActivity;->getWindowManager()Landroid/view/WindowManager;
v1 = (( android.view.Display ) v1 ).getRotation ( ); // invoke-virtual {v1}, Landroid/view/Display;->getRotation()I
/* packed-switch v1, :pswitch_data_0 */
/* .line 322 */
int v0 = 0; // const/4 v0, 0x0
/* .line 325 */
/* .local v0, "displayAngle":I */
} // :goto_0
v1 = /* invoke-direct {p0, v0}, Lcom/ansca/corona/CoronaActivity;->getCoronaOrientationFromDegrees(I)I */
/* .line 313 */
} // .end local v0 # "displayAngle":I
/* :pswitch_0 */
/* const/16 v0, 0xb4 */
/* .line 314 */
/* .restart local v0 # "displayAngle":I */
/* .line 316 */
} // .end local v0 # "displayAngle":I
/* :pswitch_1 */
/* const/16 v0, 0x10e */
/* .line 317 */
/* .restart local v0 # "displayAngle":I */
/* .line 319 */
} // .end local v0 # "displayAngle":I
/* :pswitch_2 */
/* const/16 v0, 0x5a */
/* .line 320 */
/* .restart local v0 # "displayAngle":I */
/* .line 311 */
/* :pswitch_data_0 */
/* .packed-switch 0x1 */
/* :pswitch_2 */
/* :pswitch_0 */
/* :pswitch_1 */
} // .end packed-switch
} // .end method
private void requestResumeCoronaRuntime ( ) {
/* .locals 1 */
/* .prologue */
/* .line 650 */
/* iget-boolean v0, p0, Lcom/ansca/corona/CoronaActivity;->myIsActivityResumed:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.mySystemMonitor;
v0 = (( com.ansca.corona.SystemMonitor ) v0 ).isScreenUnlocked ( ); // invoke-virtual {v0}, Lcom/ansca/corona/SystemMonitor;->isScreenUnlocked()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 651 */
com.ansca.corona.Controller .getController ( );
(( com.ansca.corona.Controller ) v0 ).start ( ); // invoke-virtual {v0}, Lcom/ansca/corona/Controller;->start()V
/* .line 652 */
v0 = this.myOrientationListener;
v0 = (( android.view.OrientationEventListener ) v0 ).canDetectOrientation ( ); // invoke-virtual {v0}, Landroid/view/OrientationEventListener;->canDetectOrientation()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 653 */
v0 = this.myOrientationListener;
(( android.view.OrientationEventListener ) v0 ).enable ( ); // invoke-virtual {v0}, Landroid/view/OrientationEventListener;->enable()V
/* .line 656 */
} // :cond_0
return;
} // .end method
private void requestSuspendCoronaRuntime ( ) {
/* .locals 1 */
/* .prologue */
/* .line 660 */
com.ansca.corona.Controller .getController ( );
(( com.ansca.corona.Controller ) v0 ).stop ( ); // invoke-virtual {v0}, Lcom/ansca/corona/Controller;->stop()V
/* .line 661 */
v0 = this.myOrientationListener;
v0 = (( android.view.OrientationEventListener ) v0 ).canDetectOrientation ( ); // invoke-virtual {v0}, Landroid/view/OrientationEventListener;->canDetectOrientation()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 662 */
v0 = this.myOrientationListener;
(( android.view.OrientationEventListener ) v0 ).disable ( ); // invoke-virtual {v0}, Landroid/view/OrientationEventListener;->disable()V
/* .line 664 */
} // :cond_0
return;
} // .end method
/* # virtual methods */
void clearNeedsSwap ( ) {
/* .locals 1 */
/* .prologue */
/* .line 1408 */
v0 = this.myGLView;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 1409 */
v0 = this.myGLView;
/* .line 1410 */
} // :cond_0
return;
} // .end method
java.io.File getCoronaCachesDir ( ) {
/* .locals 3 */
/* .prologue */
/* .line 1423 */
/* new-instance v0, Ljava/io/File; */
(( com.ansca.corona.CoronaActivity ) p0 ).getCacheDir ( ); // invoke-virtual {p0}, Lcom/ansca/corona/CoronaActivity;->getCacheDir()Ljava/io/File;
final String v2 = "Caches"; // const-string v2, "Caches"
/* invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V */
/* .line 1424 */
/* .local v0, "directory":Ljava/io/File; */
(( java.io.File ) v0 ).mkdirs ( ); // invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z
/* .line 1425 */
} // .end method
java.io.File getCoronaDocumentsDir ( ) {
/* .locals 2 */
/* .prologue */
/* .line 1413 */
final String v0 = "data"; // const-string v0, "data"
int v1 = 0; // const/4 v1, 0x0
(( com.ansca.corona.CoronaActivity ) p0 ).getDir ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lcom/ansca/corona/CoronaActivity;->getDir(Ljava/lang/String;I)Ljava/io/File;
} // .end method
Integer getCoronaOrientationOfDevice ( ) {
/* .locals 1 */
/* .prologue */
/* .line 275 */
/* iget v0, p0, Lcom/ansca/corona/CoronaActivity;->myDeviceOrientation:I */
} // .end method
Integer getCoronaOrientationOfDisplay ( ) {
/* .locals 1 */
/* .prologue */
/* .line 292 */
/* iget v0, p0, Lcom/ansca/corona/CoronaActivity;->myDisplayOrientation:I */
} // .end method
java.io.File getCoronaSystemCachesDir ( ) {
/* .locals 3 */
/* .prologue */
/* .line 1429 */
/* new-instance v0, Ljava/io/File; */
(( com.ansca.corona.CoronaActivity ) p0 ).getCacheDir ( ); // invoke-virtual {p0}, Lcom/ansca/corona/CoronaActivity;->getCacheDir()Ljava/io/File;
final String v2 = ".system"; // const-string v2, ".system"
/* invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V */
/* .line 1430 */
/* .local v0, "directory":Ljava/io/File; */
(( java.io.File ) v0 ).mkdirs ( ); // invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z
/* .line 1431 */
} // .end method
java.io.File getCoronaTemporaryDir ( ) {
/* .locals 3 */
/* .prologue */
/* .line 1417 */
/* new-instance v0, Ljava/io/File; */
(( com.ansca.corona.CoronaActivity ) p0 ).getCacheDir ( ); // invoke-virtual {p0}, Lcom/ansca/corona/CoronaActivity;->getCacheDir()Ljava/io/File;
final String v2 = "tmp"; // const-string v2, "tmp"
/* invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V */
/* .line 1418 */
/* .local v0, "directory":Ljava/io/File; */
(( java.io.File ) v0 ).mkdirs ( ); // invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z
/* .line 1419 */
} // .end method
android.view.View getGLView ( ) {
/* .locals 1 */
/* .prologue */
/* .line 367 */
v0 = this.myGLView;
} // .end method
public android.os.Handler getHandler ( ) {
/* .locals 1 */
/* .prologue */
/* .line 396 */
v0 = this.myHandler;
} // .end method
public android.widget.FrameLayout getOverlayView ( ) {
/* .locals 2 */
/* .prologue */
/* .line 381 */
com.ansca.corona.ViewManager .getViewManager ( );
/* .line 382 */
/* .local v0, "viewManager":Lcom/ansca/corona/ViewManager; */
/* if-nez v0, :cond_0 */
/* .line 383 */
int v1 = 0; // const/4 v1, 0x0
/* .line 385 */
} // :goto_0
} // :cond_0
(( com.ansca.corona.ViewManager ) v0 ).getOverlayView ( ); // invoke-virtual {v0}, Lcom/ansca/corona/ViewManager;->getOverlayView()Landroid/widget/FrameLayout;
} // .end method
Integer getPreviousCoronaOrientationOfDevice ( ) {
/* .locals 1 */
/* .prologue */
/* .line 284 */
/* iget v0, p0, Lcom/ansca/corona/CoronaActivity;->myPreviousDeviceOrientation:I */
} // .end method
Integer getPreviousCoronaOrientationOfDisplay ( ) {
/* .locals 1 */
/* .prologue */
/* .line 300 */
/* iget v0, p0, Lcom/ansca/corona/CoronaActivity;->myPreviousDisplayOrientation:I */
} // .end method
public com.ansca.corona.CoronaRuntimeTaskDispatcher getRuntimeTaskDispatcher ( ) {
/* .locals 1 */
/* .prologue */
/* .line 409 */
v0 = this.myRuntimeTaskDispatcher;
} // .end method
Integer getStatusBarHeight ( ) {
/* .locals 3 */
/* .prologue */
/* .line 460 */
v1 = android.os.Build.MODEL;
(( java.lang.String ) v1 ).toLowerCase ( ); // invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
final String v2 = "kindle"; // const-string v2, "kindle"
v1 = (( java.lang.String ) v1 ).contains ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 462 */
/* const/16 v0, 0x28 */
/* .line 484 */
/* .local v0, "height":I */
} // :goto_0
/* .line 464 */
} // .end local v0 # "height":I
} // :cond_0
/* const/16 v2, 0xb */
/* if-ge v1, v2, :cond_1 */
/* .line 467 */
(( com.ansca.corona.CoronaActivity ) p0 ).getResources ( ); // invoke-virtual {p0}, Lcom/ansca/corona/CoronaActivity;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v1 ).getDisplayMetrics ( ); // invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
/* iget v1, v1, Landroid/util/DisplayMetrics;->densityDpi:I */
/* sparse-switch v1, :sswitch_data_0 */
/* .line 476 */
/* const/16 v0, 0x19 */
/* .line 477 */
/* .restart local v0 # "height":I */
/* .line 469 */
} // .end local v0 # "height":I
/* :sswitch_0 */
/* const/16 v0, 0x26 */
/* .line 470 */
/* .restart local v0 # "height":I */
/* .line 472 */
} // .end local v0 # "height":I
/* :sswitch_1 */
/* const/16 v0, 0x13 */
/* .line 473 */
/* .restart local v0 # "height":I */
/* .line 482 */
} // .end local v0 # "height":I
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
/* .restart local v0 # "height":I */
/* .line 467 */
/* nop */
/* :sswitch_data_0 */
/* .sparse-switch */
/* 0x78 -> :sswitch_1 */
/* 0xf0 -> :sswitch_0 */
} // .end sparse-switch
} // .end method
Integer getStatusBarMode ( ) {
/* .locals 1 */
/* .prologue */
/* .line 454 */
/* iget v0, p0, Lcom/ansca/corona/CoronaActivity;->myStatusBarMode:I */
} // .end method
com.ansca.corona.purchasing.StoreProxy getStore ( ) {
/* .locals 1 */
/* .prologue */
/* .line 497 */
v0 = this.myStore;
} // .end method
public Boolean hasFixedOrientation ( ) {
/* .locals 1 */
/* .prologue */
/* .line 230 */
v0 = (( com.ansca.corona.CoronaActivity ) p0 ).supportsOrientationChanges ( ); // invoke-virtual {p0}, Lcom/ansca/corona/CoronaActivity;->supportsOrientationChanges()Z
/* if-nez v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
void hideSplashScreen ( ) {
/* .locals 3 */
/* .prologue */
/* .line 836 */
v1 = this.fSplashScreenView;
/* if-nez v1, :cond_1 */
/* .line 876 */
} // :cond_0
} // :goto_0
return;
/* .line 841 */
} // :cond_1
v1 = this.fSplashScreenView;
(( android.widget.ImageView ) v1 ).getAnimation ( ); // invoke-virtual {v1}, Landroid/widget/ImageView;->getAnimation()Landroid/view/animation/Animation;
/* if-nez v1, :cond_0 */
/* .line 846 */
/* new-instance v0, Landroid/view/animation/AlphaAnimation; */
/* const/high16 v1, 0x3f800000 # 1.0f */
int v2 = 0; // const/4 v2, 0x0
/* invoke-direct {v0, v1, v2}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V */
/* .line 847 */
/* .local v0, "animation":Landroid/view/animation/Animation; */
/* const-wide/16 v1, 0x1f4 */
(( android.view.animation.Animation ) v0 ).setDuration ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/view/animation/Animation;->setDuration(J)V
/* .line 848 */
/* new-instance v1, Lcom/ansca/corona/CoronaActivity$2; */
/* invoke-direct {v1, p0}, Lcom/ansca/corona/CoronaActivity$2;-><init>(Lcom/ansca/corona/CoronaActivity;)V */
(( android.view.animation.Animation ) v0 ).setAnimationListener ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V
/* .line 875 */
v1 = this.fSplashScreenView;
(( android.widget.ImageView ) v1 ).startAnimation ( v0 ); // invoke-virtual {v1, v0}, Landroid/widget/ImageView;->startAnimation(Landroid/view/animation/Animation;)V
} // .end method
Boolean isSplashScreenShown ( ) {
/* .locals 1 */
/* .prologue */
/* .line 883 */
v0 = this.fSplashScreenView;
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
protected void onActivityResult ( Integer p0, Integer p1, android.content.Intent p2 ) {
/* .locals 12 */
/* .param p1, "requestCode" # I */
/* .param p2, "resultCode" # I */
/* .param p3, "data" # Landroid/content/Intent; */
/* .prologue */
/* .line 1047 */
/* invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onActivityResult(IILandroid/content/Intent;)V */
/* .line 1049 */
/* packed-switch p1, :pswitch_data_0 */
/* .line 1165 */
} // :goto_0
return;
/* .line 1053 */
/* :pswitch_0 */
final String v11 = ""; // const-string v11, ""
/* .line 1054 */
/* .local v11, "selectedImageFileName":Ljava/lang/String; */
int v0 = -1; // const/4 v0, -0x1
/* if-ne p2, v0, :cond_0 */
/* .line 1056 */
try { // :try_start_0
(( android.content.Intent ) p3 ).getData ( ); // invoke-virtual {p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;
/* .line 1057 */
/* .local v1, "uri":Landroid/net/Uri; */
int v0 = 1; // const/4 v0, 0x1
/* new-array v2, v0, [Ljava/lang/String; */
int v0 = 0; // const/4 v0, 0x0
final String v3 = "_data"; // const-string v3, "_data"
/* aput-object v3, v2, v0 */
/* .line 1058 */
/* .local v2, "filePathColumn":[Ljava/lang/String; */
(( com.ansca.corona.CoronaActivity ) p0 ).getContentResolver ( ); // invoke-virtual {p0}, Lcom/ansca/corona/CoronaActivity;->getContentResolver()Landroid/content/ContentResolver;
int v3 = 0; // const/4 v3, 0x0
int v4 = 0; // const/4 v4, 0x0
int v5 = 0; // const/4 v5, 0x0
/* invoke-virtual/range {v0 ..v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor; */
/* .line 1059 */
/* .local v8, "cursor":Landroid/database/Cursor; */
/* .line 1060 */
int v0 = 0; // const/4 v0, 0x0
v7 = /* aget-object v0, v2, v0 */
/* .line 1061 */
/* .local v7, "columnIndex":I */
/* .line 1062 */
/* .local v10, "imageFilePath":Ljava/lang/String; */
/* .line 1063 */
(( java.lang.String ) v10 ).toString ( ); // invoke-virtual {v10}, Ljava/lang/String;->toString()Ljava/lang/String;
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 1070 */
} // .end local v1 # "uri":Landroid/net/Uri;
} // .end local v2 # "filePathColumn":[Ljava/lang/String;
} // .end local v7 # "columnIndex":I
} // .end local v8 # "cursor":Landroid/database/Cursor;
} // .end local v10 # "imageFilePath":Ljava/lang/String;
} // :cond_0
} // :goto_1
if ( v11 != null) { // if-eqz v11, :cond_1
v0 = (( java.lang.String ) v11 ).length ( ); // invoke-virtual {v11}, Ljava/lang/String;->length()I
/* if-lez v0, :cond_1 */
v0 = this.mySelectImageDestinationFilePath;
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = this.mySelectImageDestinationFilePath;
v0 = (( java.lang.String ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/lang/String;->length()I
/* if-lez v0, :cond_1 */
/* .line 1072 */
v0 = this.mySelectImageDestinationFilePath;
v9 = com.ansca.corona.FileServices .copyFile ( v11,v0 );
/* .line 1073 */
/* .local v9, "hasSucceeded":Z */
if ( v9 != null) { // if-eqz v9, :cond_2
/* .line 1074 */
v11 = this.mySelectImageDestinationFilePath;
/* .line 1079 */
} // :goto_2
int v0 = 0; // const/4 v0, 0x0
this.mySelectImageDestinationFilePath = v0;
/* .line 1084 */
} // .end local v9 # "hasSucceeded":Z
} // :cond_1
com.ansca.corona.Controller .getEventManager ( );
(( com.ansca.corona.events.EventManager ) v0 ).imagePickerEvent ( v11 ); // invoke-virtual {v0, v11}, Lcom/ansca/corona/events/EventManager;->imagePickerEvent(Ljava/lang/String;)V
/* .line 1077 */
/* .restart local v9 # "hasSucceeded":Z */
} // :cond_2
final String v11 = ""; // const-string v11, ""
/* .line 1090 */
} // .end local v9 # "hasSucceeded":Z
} // .end local v11 # "selectedImageFileName":Ljava/lang/String;
/* :pswitch_1 */
final String v11 = ""; // const-string v11, ""
/* .line 1091 */
/* .restart local v11 # "selectedImageFileName":Ljava/lang/String; */
int v0 = -1; // const/4 v0, -0x1
/* if-ne p2, v0, :cond_3 */
v0 = this.myCameraShotSourceUri;
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 1092 */
/* new-instance v6, Ljava/io/File; */
v0 = this.myCameraShotSourceUri;
(( android.net.Uri ) v0 ).getPath ( ); // invoke-virtual {v0}, Landroid/net/Uri;->getPath()Ljava/lang/String;
/* invoke-direct {v6, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V */
/* .line 1093 */
/* .local v6, "cameraShotSourceFile":Ljava/io/File; */
v0 = (( java.io.File ) v6 ).exists ( ); // invoke-virtual {v6}, Ljava/io/File;->exists()Z
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 1094 */
v0 = this.myCameraShotDestinationFile;
if ( v0 != null) { // if-eqz v0, :cond_4
/* .line 1096 */
v0 = this.myCameraShotDestinationFile;
v0 = com.ansca.corona.FileServices .moveFile ( v6,v0 );
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 1097 */
v0 = this.myCameraShotDestinationFile;
(( java.io.File ) v0 ).getAbsolutePath ( ); // invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
/* .line 1109 */
} // .end local v6 # "cameraShotSourceFile":Ljava/io/File;
} // :cond_3
} // :goto_3
com.ansca.corona.Controller .getEventManager ( );
(( com.ansca.corona.events.EventManager ) v0 ).imagePickerEvent ( v11 ); // invoke-virtual {v0, v11}, Lcom/ansca/corona/events/EventManager;->imagePickerEvent(Ljava/lang/String;)V
/* goto/16 :goto_0 */
/* .line 1102 */
/* .restart local v6 # "cameraShotSourceFile":Ljava/io/File; */
} // :cond_4
(( java.io.File ) v6 ).getAbsolutePath ( ); // invoke-virtual {v6}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
/* .line 1115 */
} // .end local v6 # "cameraShotSourceFile":Ljava/io/File;
} // .end local v11 # "selectedImageFileName":Ljava/lang/String;
/* :pswitch_2 */
final String v11 = ""; // const-string v11, ""
/* .line 1116 */
/* .restart local v11 # "selectedImageFileName":Ljava/lang/String; */
int v0 = -1; // const/4 v0, -0x1
/* if-ne p2, v0, :cond_5 */
if ( p3 != null) { // if-eqz p3, :cond_5
/* .line 1117 */
(( android.content.Intent ) p3 ).getData ( ); // invoke-virtual {p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;
/* .line 1118 */
/* .restart local v1 # "uri":Landroid/net/Uri; */
if ( v1 != null) { // if-eqz v1, :cond_5
/* .line 1119 */
(( android.net.Uri ) v1 ).getPath ( ); // invoke-virtual {v1}, Landroid/net/Uri;->getPath()Ljava/lang/String;
/* .line 1125 */
} // .end local v1 # "uri":Landroid/net/Uri;
} // :cond_5
com.ansca.corona.Controller .getEventManager ( );
(( com.ansca.corona.events.EventManager ) v0 ).imagePickerEvent ( v11 ); // invoke-virtual {v0, v11}, Lcom/ansca/corona/events/EventManager;->imagePickerEvent(Ljava/lang/String;)V
/* goto/16 :goto_0 */
/* .line 1131 */
} // .end local v11 # "selectedImageFileName":Ljava/lang/String;
/* :pswitch_3 */
com.ansca.corona.Controller .getController ( );
(( com.ansca.corona.Controller ) v0 ).facebookApplyActivityResult ( p1, p2, p3 ); // invoke-virtual {v0, p1, p2, p3}, Lcom/ansca/corona/Controller;->facebookApplyActivityResult(IILandroid/content/Intent;)V
/* goto/16 :goto_0 */
/* .line 1139 */
/* :pswitch_4 */
com.ansca.corona.Controller .getEventManager ( );
/* new-instance v3, Lcom/ansca/corona/events/RunnableEvent; */
/* new-instance v4, Lcom/ansca/corona/CoronaActivity$3; */
/* invoke-direct {v4, p0}, Lcom/ansca/corona/CoronaActivity$3;-><init>(Lcom/ansca/corona/CoronaActivity;)V */
/* invoke-direct {v3, v4}, Lcom/ansca/corona/events/RunnableEvent;-><init>(Ljava/lang/Runnable;)V */
(( com.ansca.corona.events.EventManager ) v0 ).addEvent ( v3 ); // invoke-virtual {v0, v3}, Lcom/ansca/corona/events/EventManager;->addEvent(Lcom/ansca/corona/events/Event;)V
/* goto/16 :goto_0 */
/* .line 1154 */
/* :pswitch_5 */
com.ansca.corona.Controller .getEventManager ( );
/* new-instance v3, Lcom/ansca/corona/events/RunnableEvent; */
/* new-instance v4, Lcom/ansca/corona/CoronaActivity$4; */
/* invoke-direct {v4, p0}, Lcom/ansca/corona/CoronaActivity$4;-><init>(Lcom/ansca/corona/CoronaActivity;)V */
/* invoke-direct {v3, v4}, Lcom/ansca/corona/events/RunnableEvent;-><init>(Ljava/lang/Runnable;)V */
(( com.ansca.corona.events.EventManager ) v0 ).addEvent ( v3 ); // invoke-virtual {v0, v3}, Lcom/ansca/corona/events/EventManager;->addEvent(Lcom/ansca/corona/events/Event;)V
/* goto/16 :goto_0 */
/* .line 1065 */
/* .restart local v11 # "selectedImageFileName":Ljava/lang/String; */
/* :catch_0 */
/* move-exception v0 */
/* goto/16 :goto_1 */
/* .line 1049 */
/* :pswitch_data_0 */
/* .packed-switch 0x1 */
/* :pswitch_4 */
/* :pswitch_0 */
/* :pswitch_1 */
/* :pswitch_2 */
/* :pswitch_3 */
/* :pswitch_5 */
} // .end packed-switch
} // .end method
public void onConfigurationChanged ( android.content.res.Configuration p0 ) {
/* .locals 4 */
/* .param p1, "newConfig" # Landroid/content/res/Configuration; */
/* .prologue */
/* .line 614 */
/* invoke-super {p0, p1}, Landroid/app/Activity;->onConfigurationChanged(Landroid/content/res/Configuration;)V */
/* .line 618 */
v1 = this.myOrientationListener;
v1 = (( android.view.OrientationEventListener ) v1 ).canDetectOrientation ( ); // invoke-virtual {v1}, Landroid/view/OrientationEventListener;->canDetectOrientation()Z
/* if-nez v1, :cond_1 */
/* .line 619 */
/* iget v1, p1, Landroid/content/res/Configuration;->orientation:I */
int v2 = 2; // const/4 v2, 0x2
/* if-ne v1, v2, :cond_4 */
/* .line 620 */
int v0 = 2; // const/4 v0, 0x2
/* .line 625 */
/* .local v0, "currentOrientation":I */
} // :goto_0
/* iget v1, p0, Lcom/ansca/corona/CoronaActivity;->myDeviceOrientation:I */
/* if-ne v0, v1, :cond_0 */
/* iget v1, p0, Lcom/ansca/corona/CoronaActivity;->myPreviousDeviceOrientation:I */
/* if-nez v1, :cond_1 */
/* .line 626 */
} // :cond_0
/* iget v1, p0, Lcom/ansca/corona/CoronaActivity;->myDeviceOrientation:I */
/* iput v1, p0, Lcom/ansca/corona/CoronaActivity;->myPreviousDeviceOrientation:I */
/* .line 627 */
/* iput v0, p0, Lcom/ansca/corona/CoronaActivity;->myDeviceOrientation:I */
/* .line 628 */
v1 = (( com.ansca.corona.CoronaActivity ) p0 ).hasFixedOrientation ( ); // invoke-virtual {p0}, Lcom/ansca/corona/CoronaActivity;->hasFixedOrientation()Z
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 629 */
com.ansca.corona.Controller .getEventManager ( );
/* iget v2, p0, Lcom/ansca/corona/CoronaActivity;->myDeviceOrientation:I */
/* iget v3, p0, Lcom/ansca/corona/CoronaActivity;->myPreviousDeviceOrientation:I */
(( com.ansca.corona.events.EventManager ) v1 ).orientationChanged ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Lcom/ansca/corona/events/EventManager;->orientationChanged(II)V
/* .line 636 */
} // .end local v0 # "currentOrientation":I
} // :cond_1
v0 = /* invoke-direct {p0}, Lcom/ansca/corona/CoronaActivity;->getCoronaOrientationFromWindowManager()I */
/* .line 637 */
/* .restart local v0 # "currentOrientation":I */
/* iget v1, p0, Lcom/ansca/corona/CoronaActivity;->myDisplayOrientation:I */
/* if-eq v1, v0, :cond_2 */
/* .line 638 */
/* iget v1, p0, Lcom/ansca/corona/CoronaActivity;->myDisplayOrientation:I */
/* iput v1, p0, Lcom/ansca/corona/CoronaActivity;->myPreviousDisplayOrientation:I */
/* .line 639 */
/* iput v0, p0, Lcom/ansca/corona/CoronaActivity;->myDisplayOrientation:I */
/* .line 643 */
} // :cond_2
v1 = (( com.ansca.corona.CoronaActivity ) p0 ).isSplashScreenShown ( ); // invoke-virtual {p0}, Lcom/ansca/corona/CoronaActivity;->isSplashScreenShown()Z
if ( v1 != null) { // if-eqz v1, :cond_3
/* .line 644 */
(( com.ansca.corona.CoronaActivity ) p0 ).showSplashScreen ( ); // invoke-virtual {p0}, Lcom/ansca/corona/CoronaActivity;->showSplashScreen()V
/* .line 646 */
} // :cond_3
return;
/* .line 623 */
} // .end local v0 # "currentOrientation":I
} // :cond_4
int v0 = 1; // const/4 v0, 0x1
/* .restart local v0 # "currentOrientation":I */
} // .end method
protected void onCreate ( android.os.Bundle p0 ) {
/* .locals 11 */
/* .param p1, "savedInstanceState" # Landroid/os/Bundle; */
/* .prologue */
/* const/16 v8, 0x200 */
int v10 = 0; // const/4 v10, 0x0
/* .line 86 */
/* invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V */
/* .line 89 */
int v7 = 1; // const/4 v7, 0x1
(( com.ansca.corona.CoronaActivity ) p0 ).requestWindowFeature ( v7 ); // invoke-virtual {p0, v7}, Lcom/ansca/corona/CoronaActivity;->requestWindowFeature(I)Z
/* .line 90 */
(( com.ansca.corona.CoronaActivity ) p0 ).getWindow ( ); // invoke-virtual {p0}, Lcom/ansca/corona/CoronaActivity;->getWindow()Landroid/view/Window;
(( android.view.Window ) v7 ).setFlags ( v8, v8 ); // invoke-virtual {v7, v8, v8}, Landroid/view/Window;->setFlags(II)V
/* .line 91 */
(( com.ansca.corona.CoronaActivity ) p0 ).setStatusBarMode ( v10 ); // invoke-virtual {p0, v10}, Lcom/ansca/corona/CoronaActivity;->setStatusBarMode(I)V
/* .line 94 */
(( com.ansca.corona.CoronaActivity ) p0 ).getWindow ( ); // invoke-virtual {p0}, Lcom/ansca/corona/CoronaActivity;->getWindow()Landroid/view/Window;
/* const/16 v8, 0x12 */
(( android.view.Window ) v7 ).setSoftInputMode ( v8 ); // invoke-virtual {v7, v8}, Landroid/view/Window;->setSoftInputMode(I)V
/* .line 100 */
v7 = (( com.ansca.corona.CoronaActivity ) p0 ).getRequestedOrientation ( ); // invoke-virtual {p0}, Lcom/ansca/corona/CoronaActivity;->getRequestedOrientation()I
(( com.ansca.corona.CoronaActivity ) p0 ).setRequestedOrientation ( v7 ); // invoke-virtual {p0, v7}, Lcom/ansca/corona/CoronaActivity;->setRequestedOrientation(I)V
/* .line 105 */
try { // :try_start_0
final String v7 = "Corona"; // const-string v7, "Corona"
int v8 = 0; // const/4 v8, 0x0
(( com.ansca.corona.CoronaActivity ) p0 ).getSharedPreferences ( v7, v8 ); // invoke-virtual {p0, v7, v8}, Lcom/ansca/corona/CoronaActivity;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
/* .line 106 */
/* .local v5, "preferencesReader":Landroid/content/SharedPreferences; */
if ( v5 != null) { // if-eqz v5, :cond_0
/* .line 107 */
/* new-instance v0, Ljava/io/File; */
(( com.ansca.corona.CoronaActivity ) p0 ).getPackageCodePath ( ); // invoke-virtual {p0}, Lcom/ansca/corona/CoronaActivity;->getPackageCodePath()Ljava/lang/String;
/* invoke-direct {v0, v7}, Ljava/io/File;-><init>(Ljava/lang/String;)V */
/* .line 108 */
/* .local v0, "apkFile":Ljava/io/File; */
(( java.io.File ) v0 ).lastModified ( ); // invoke-virtual {v0}, Ljava/io/File;->lastModified()J
/* move-result-wide v1 */
/* .line 109 */
/* .local v1, "currentTimestamp":J */
final String v7 = "lastInstallTime"; // const-string v7, "lastInstallTime"
/* const-wide/16 v8, 0x0 */
/* move-result-wide v3 */
/* .line 110 */
/* .local v3, "lastTimestamp":J */
/* cmp-long v7, v1, v3 */
if ( v7 != null) { // if-eqz v7, :cond_0
/* .line 112 */
final String v7 = "coronaResources"; // const-string v7, "coronaResources"
(( com.ansca.corona.CoronaActivity ) p0 ).getFileStreamPath ( v7 ); // invoke-virtual {p0, v7}, Lcom/ansca/corona/CoronaActivity;->getFileStreamPath(Ljava/lang/String;)Ljava/io/File;
/* invoke-direct {p0, v7}, Lcom/ansca/corona/CoronaActivity;->deleteDirectoryTree(Ljava/io/File;)V */
/* .line 115 */
/* .line 116 */
/* .local v6, "preferencesWriter":Landroid/content/SharedPreferences$Editor; */
final String v7 = "lastInstallTime"; // const-string v7, "lastInstallTime"
/* .line 117 */
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 124 */
} // .end local v0 # "apkFile":Ljava/io/File;
} // .end local v1 # "currentTimestamp":J
} // .end local v3 # "lastTimestamp":J
} // .end local v5 # "preferencesReader":Landroid/content/SharedPreferences;
} // .end local v6 # "preferencesWriter":Landroid/content/SharedPreferences$Editor;
} // :cond_0
} // :goto_0
com.ansca.corona.CoronaEnvironment .setCoronaActivity ( p0 );
/* .line 128 */
com.ansca.corona.Controller .create ( p0 );
/* .line 131 */
/* new-instance v7, Lcom/ansca/corona/SystemMonitor; */
/* invoke-direct {v7, p0}, Lcom/ansca/corona/SystemMonitor;-><init>(Lcom/ansca/corona/CoronaActivity;)V */
this.mySystemMonitor = v7;
/* .line 132 */
v7 = this.mySystemMonitor;
(( com.ansca.corona.SystemMonitor ) v7 ).start ( ); // invoke-virtual {v7}, Lcom/ansca/corona/SystemMonitor;->start()V
/* .line 135 */
/* new-instance v7, Lcom/ansca/corona/purchasing/StoreProxy; */
/* invoke-direct {v7}, Lcom/ansca/corona/purchasing/StoreProxy;-><init>()V */
this.myStore = v7;
/* .line 136 */
v7 = this.myStore;
(( com.ansca.corona.purchasing.StoreProxy ) v7 ).setActivity ( p0 ); // invoke-virtual {v7, p0}, Lcom/ansca/corona/purchasing/StoreProxy;->setActivity(Landroid/app/Activity;)V
/* .line 139 */
/* new-instance v7, Landroid/os/Handler; */
/* invoke-direct {v7}, Landroid/os/Handler;-><init>()V */
this.myHandler = v7;
/* .line 143 */
/* new-instance v7, Lcom/ansca/corona/CoronaRuntimeTaskDispatcher; */
com.ansca.corona.Controller .getRuntime ( );
/* invoke-direct {v7, v8}, Lcom/ansca/corona/CoronaRuntimeTaskDispatcher;-><init>(Lcom/ansca/corona/CoronaRuntime;)V */
this.myRuntimeTaskDispatcher = v7;
/* .line 147 */
com.ansca.corona.Controller .getAndroidVersionSpecific ( );
this.myGLView = v7;
/* .line 148 */
com.ansca.corona.ViewManager .initialize ( p0 );
/* .line 149 */
com.ansca.corona.ViewManager .getViewManager ( );
v8 = this.myGLView;
(( com.ansca.corona.ViewManager ) v7 ).setGLView ( v8 ); // invoke-virtual {v7, v8}, Lcom/ansca/corona/ViewManager;->setGLView(Landroid/view/View;)V
/* .line 150 */
com.ansca.corona.ViewManager .getViewManager ( );
(( com.ansca.corona.ViewManager ) v7 ).getContentView ( ); // invoke-virtual {v7}, Lcom/ansca/corona/ViewManager;->getContentView()Landroid/view/ViewGroup;
(( com.ansca.corona.CoronaActivity ) p0 ).setContentView ( v7 ); // invoke-virtual {p0, v7}, Lcom/ansca/corona/CoronaActivity;->setContentView(Landroid/view/View;)V
/* .line 154 */
(( com.ansca.corona.CoronaActivity ) p0 ).showSplashScreen ( ); // invoke-virtual {p0}, Lcom/ansca/corona/CoronaActivity;->showSplashScreen()V
/* .line 159 */
com.ansca.corona.JavaToNativeShim .init ( );
/* .line 162 */
int v7 = 3; // const/4 v7, 0x3
(( com.ansca.corona.CoronaActivity ) p0 ).setVolumeControlStream ( v7 ); // invoke-virtual {p0, v7}, Lcom/ansca/corona/CoronaActivity;->setVolumeControlStream(I)V
/* .line 166 */
v7 = /* invoke-direct {p0}, Lcom/ansca/corona/CoronaActivity;->getCoronaOrientationFromWindowManager()I */
/* iput v7, p0, Lcom/ansca/corona/CoronaActivity;->myDisplayOrientation:I */
/* .line 167 */
/* iget v7, p0, Lcom/ansca/corona/CoronaActivity;->myDisplayOrientation:I */
/* iput v7, p0, Lcom/ansca/corona/CoronaActivity;->myPreviousDisplayOrientation:I */
/* .line 172 */
/* iget v7, p0, Lcom/ansca/corona/CoronaActivity;->myDisplayOrientation:I */
/* iput v7, p0, Lcom/ansca/corona/CoronaActivity;->myDeviceOrientation:I */
/* .line 173 */
/* iput v10, p0, Lcom/ansca/corona/CoronaActivity;->myPreviousDeviceOrientation:I */
/* .line 174 */
/* new-instance v7, Lcom/ansca/corona/CoronaActivity$1; */
/* invoke-direct {v7, p0, p0}, Lcom/ansca/corona/CoronaActivity$1;-><init>(Lcom/ansca/corona/CoronaActivity;Landroid/content/Context;)V */
this.myOrientationListener = v7;
/* .line 201 */
com.bc.Gb .a ( p0 );
return;
/* .line 121 */
/* :catch_0 */
/* move-exception v7 */
} // .end method
protected void onDestroy ( ) {
/* .locals 1 */
/* .prologue */
int v0 = 0; // const/4 v0, 0x0
/* .line 505 */
com.ansca.corona.CoronaEnvironment .setCoronaActivity ( v0 );
/* .line 506 */
com.ansca.corona.CameraActivity .clearCachedPhotos ( p0 );
/* .line 507 */
this.myGLView = v0;
/* .line 508 */
v0 = this.myStore;
(( com.ansca.corona.purchasing.StoreProxy ) v0 ).disable ( ); // invoke-virtual {v0}, Lcom/ansca/corona/purchasing/StoreProxy;->disable()V
/* .line 509 */
v0 = this.mySystemMonitor;
(( com.ansca.corona.SystemMonitor ) v0 ).stop ( ); // invoke-virtual {v0}, Lcom/ansca/corona/SystemMonitor;->stop()V
/* .line 510 */
com.ansca.corona.Controller .getController ( );
(( com.ansca.corona.Controller ) v0 ).destroy ( ); // invoke-virtual {v0}, Lcom/ansca/corona/Controller;->destroy()V
/* .line 511 */
com.ansca.corona.ViewManager .destroy ( );
/* .line 512 */
/* invoke-super {p0}, Landroid/app/Activity;->onDestroy()V */
/* .line 513 */
com.bc.Gb .b ( p0 );
return;
} // .end method
public Boolean onKeyDown ( Integer p0, android.view.KeyEvent p1 ) {
/* .locals 5 */
/* .param p1, "keyCode" # I */
/* .param p2, "event" # Landroid/view/KeyEvent; */
/* .prologue */
/* const/16 v4, 0x18 */
int v3 = 1; // const/4 v3, 0x1
/* .line 1443 */
v2 = (( android.view.KeyEvent ) p2 ).getRepeatCount ( ); // invoke-virtual {p2}, Landroid/view/KeyEvent;->getRepeatCount()I
/* if-lez v2, :cond_0 */
/* move v2, v3 */
/* .line 1488 */
} // :goto_0
/* .line 1448 */
} // :cond_0
/* instance-of v2, p2, Lcom/ansca/corona/events/KeyboardEvent$NonOverriddenKeyEvent; */
/* if-nez v2, :cond_1 */
/* .line 1450 */
v2 = (( android.view.KeyEvent ) p2 ).getKeyCode ( ); // invoke-virtual {p2}, Landroid/view/KeyEvent;->getKeyCode()I
com.ansca.corona.events.KeyboardEvent .getStringForKeyCode ( v2 );
if ( v2 != null) { // if-eqz v2, :cond_1
/* .line 1453 */
com.ansca.corona.Controller .getEventManager ( );
(( com.ansca.corona.events.EventManager ) v2 ).keyboardEvent ( p2 ); // invoke-virtual {v2, p2}, Lcom/ansca/corona/events/EventManager;->keyboardEvent(Landroid/view/KeyEvent;)V
/* move v2, v3 */
/* .line 1454 */
/* .line 1461 */
} // :cond_1
/* if-eq p1, v4, :cond_2 */
/* const/16 v2, 0x19 */
/* if-ne p1, v2, :cond_4 */
/* .line 1465 */
} // :cond_2
/* if-ne p1, v4, :cond_3 */
/* .line 1466 */
int v0 = 1; // const/4 v0, 0x1
/* .line 1471 */
/* .local v0, "audioDirection":I */
} // :goto_1
/* const/16 v1, 0x15 */
/* .line 1474 */
/* .local v1, "flags":I */
try { // :try_start_0
final String v2 = "audio"; // const-string v2, "audio"
(( com.ansca.corona.CoronaActivity ) p0 ).getSystemService ( v2 ); // invoke-virtual {p0, v2}, Lcom/ansca/corona/CoronaActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v2, Landroid/media/AudioManager; */
(( android.media.AudioManager ) v2 ).adjustVolume ( v0, v1 ); // invoke-virtual {v2, v0, v1}, Landroid/media/AudioManager;->adjustVolume(II)V
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* move v2, v3 */
/* .line 1475 */
/* .line 1469 */
} // .end local v0 # "audioDirection":I
} // .end local v1 # "flags":I
} // :cond_3
int v0 = -1; // const/4 v0, -0x1
/* .restart local v0 # "audioDirection":I */
/* .line 1477 */
/* .restart local v1 # "flags":I */
/* :catch_0 */
/* move-exception v2 */
/* .line 1481 */
} // .end local v0 # "audioDirection":I
} // .end local v1 # "flags":I
} // :cond_4
int v2 = 4; // const/4 v2, 0x4
/* if-ne p1, v2, :cond_5 */
/* .line 1482 */
com.ansca.corona.ViewManager .getViewManager ( );
v2 = (( com.ansca.corona.ViewManager ) v2 ).goBack ( ); // invoke-virtual {v2}, Lcom/ansca/corona/ViewManager;->goBack()Z
if ( v2 != null) { // if-eqz v2, :cond_5
/* move v2, v3 */
/* .line 1483 */
/* .line 1488 */
} // :cond_5
v2 = /* invoke-super {p0, p1, p2}, Landroid/app/Activity;->onKeyDown(ILandroid/view/KeyEvent;)Z */
} // .end method
public Boolean onKeyUp ( Integer p0, android.view.KeyEvent p1 ) {
/* .locals 1 */
/* .param p1, "keyCode" # I */
/* .param p2, "event" # Landroid/view/KeyEvent; */
/* .prologue */
/* .line 1500 */
/* instance-of v0, p2, Lcom/ansca/corona/events/KeyboardEvent$NonOverriddenKeyEvent; */
/* if-nez v0, :cond_0 */
/* .line 1502 */
v0 = (( android.view.KeyEvent ) p2 ).getKeyCode ( ); // invoke-virtual {p2}, Landroid/view/KeyEvent;->getKeyCode()I
com.ansca.corona.events.KeyboardEvent .getStringForKeyCode ( v0 );
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 1505 */
com.ansca.corona.Controller .getEventManager ( );
(( com.ansca.corona.events.EventManager ) v0 ).keyboardEvent ( p2 ); // invoke-virtual {v0, p2}, Lcom/ansca/corona/events/EventManager;->keyboardEvent(Landroid/view/KeyEvent;)V
/* .line 1506 */
int v0 = 1; // const/4 v0, 0x1
/* .line 1511 */
} // :goto_0
} // :cond_0
v0 = /* invoke-super {p0, p1, p2}, Landroid/app/Activity;->onKeyUp(ILandroid/view/KeyEvent;)Z */
} // .end method
protected void onPause ( ) {
/* .locals 1 */
/* .prologue */
/* .line 548 */
/* invoke-super {p0}, Landroid/app/Activity;->onPause()V */
/* .line 552 */
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lcom/ansca/corona/CoronaActivity;->myIsActivityResumed:Z */
/* .line 553 */
/* invoke-direct {p0}, Lcom/ansca/corona/CoronaActivity;->requestSuspendCoronaRuntime()V */
/* .line 554 */
return;
} // .end method
protected void onResume ( ) {
/* .locals 1 */
/* .prologue */
/* .line 531 */
/* invoke-super {p0}, Landroid/app/Activity;->onResume()V */
/* .line 534 */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/ansca/corona/CoronaActivity;->myIsActivityResumed:Z */
/* .line 535 */
/* invoke-direct {p0}, Lcom/ansca/corona/CoronaActivity;->requestResumeCoronaRuntime()V */
/* .line 536 */
return;
} // .end method
void onScreenLockStateChanged ( Boolean p0 ) {
/* .locals 0 */
/* .param p1, "isScreenLocked" # Z */
/* .prologue */
/* .line 602 */
/* invoke-direct {p0}, Lcom/ansca/corona/CoronaActivity;->requestResumeCoronaRuntime()V */
/* .line 603 */
return;
} // .end method
protected void onStart ( ) {
/* .locals 1 */
/* .prologue */
/* .line 520 */
/* invoke-super {p0}, Landroid/app/Activity;->onStart()V */
/* .line 523 */
v0 = this.myGLView;
/* .line 524 */
return;
} // .end method
protected void onStop ( ) {
/* .locals 1 */
/* .prologue */
/* .line 563 */
/* invoke-super {p0}, Landroid/app/Activity;->onStop()V */
/* .line 567 */
com.ansca.corona.JavaToNativeShim .unloadResources ( );
/* .line 570 */
v0 = this.myGLView;
/* .line 571 */
return;
} // .end method
public Boolean onTouchEvent ( android.view.MotionEvent p0 ) {
/* .locals 26 */
/* .param p1, "event" # Landroid/view/MotionEvent; */
/* .prologue */
/* .line 1178 */
com.ansca.corona.Controller .getAndroidVersionSpecific ( );
/* .line 1179 */
/* .local v19, "version":Lcom/ansca/corona/version/IAndroidVersionSpecific; */
com.ansca.corona.Controller .getEventManager ( );
/* .line 1182 */
/* .local v9, "manager":Lcom/ansca/corona/events/EventManager; */
v8 = com.ansca.corona.Controller .isMultitouchEnabled ( );
/* .line 1183 */
/* .local v8, "isMultitouch":Z */
if ( v8 != null) { // if-eqz v8, :cond_3
com.ansca.corona.Controller .getEventManager ( );
/* invoke-virtual/range {v22 ..v22}, Lcom/ansca/corona/events/EventManager;->newMultitouchEvent()Lcom/ansca/corona/events/MultitouchEvent; */
/* .line 1184 */
/* .local v10, "multitouch":Lcom/ansca/corona/events/MultitouchEvent; */
} // :goto_0
/* move-object/from16 v0, v19 */
v5 = /* move-object/from16 v1, p1 */
/* .line 1185 */
/* .local v5, "action":I */
/* packed-switch v5, :pswitch_data_0 */
/* .line 1279 */
if ( v8 != null) { // if-eqz v8, :cond_0
/* .line 1280 */
v22 = /* invoke-interface/range {v19 ..v19}, Lcom/ansca/corona/version/IAndroidVersionSpecific;->motionEventACTION_POINTER_DOWN()I */
/* move/from16 v0, v22 */
/* if-ne v0, v5, :cond_e */
/* .line 1282 */
/* move-object/from16 v0, v19 */
v17 = /* move-object/from16 v1, p1 */
/* .line 1283 */
/* .local v17, "pointerIndex":I */
/* move-object/from16 v0, v19 */
/* move-object/from16 v1, p1 */
v16 = /* move/from16 v2, v17 */
/* .line 1285 */
/* .local v16, "pointerId":I */
/* move-object/from16 v0, v19 */
/* move-object/from16 v1, p1 */
v20 = /* move/from16 v2, v17 */
/* .line 1286 */
/* .local v20, "x":F */
/* move-object/from16 v0, v19 */
/* move-object/from16 v1, p1 */
v21 = /* move/from16 v2, v17 */
/* .line 1287 */
/* .local v21, "y":F */
/* new-instance v18, Lcom/ansca/corona/events/TouchData; */
/* const/16 v23, 0x0 */
/* move-object/from16 v0, v18 */
/* move/from16 v1, v22 */
/* move/from16 v2, v20 */
/* move/from16 v3, v21 */
/* move/from16 v4, v23 */
/* invoke-direct {v0, v1, v2, v3, v4}, Lcom/ansca/corona/events/TouchData;-><init>(IFFI)V */
/* .line 1291 */
/* .local v18, "t":Lcom/ansca/corona/events/TouchData; */
/* add-int/lit8 v22, v22, 0x1 */
/* .line 1293 */
v22 = com.ansca.corona.CoronaActivity.sTouches;
/* invoke-static/range {v16 ..v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer; */
/* move-object/from16 v0, v22 */
/* move-object/from16 v1, v23 */
/* move-object/from16 v2, v18 */
(( java.util.HashMap ) v0 ).put ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 1295 */
/* move-object/from16 v0, v18 */
(( com.ansca.corona.events.MultitouchEvent ) v10 ).add ( v0 ); // invoke-virtual {v10, v0}, Lcom/ansca/corona/events/MultitouchEvent;->add(Lcom/ansca/corona/events/TouchData;)V
/* .line 1324 */
} // .end local v16 # "pointerId":I
} // .end local v17 # "pointerIndex":I
} // .end local v18 # "t":Lcom/ansca/corona/events/TouchData;
} // .end local v20 # "x":F
} // .end local v21 # "y":F
} // :cond_0
} // :goto_1
if ( v8 != null) { // if-eqz v8, :cond_1
/* .line 1325 */
if ( v10 != null) { // if-eqz v10, :cond_1
/* .line 1327 */
(( com.ansca.corona.events.EventManager ) v9 ).addEvent ( v10 ); // invoke-virtual {v9, v10}, Lcom/ansca/corona/events/EventManager;->addEvent(Lcom/ansca/corona/events/Event;)V
/* .line 1333 */
} // :cond_1
/* move-object/from16 v0, v19 */
v22 = /* move-object/from16 v1, p1 */
/* const/16 v23, 0x1 */
/* move/from16 v0, v22 */
/* move/from16 v1, v23 */
/* if-ne v0, v1, :cond_13 */
/* .line 1335 */
/* if-nez v5, :cond_10 */
/* .line 1339 */
v22 = /* invoke-virtual/range {p1 ..p1}, Landroid/view/MotionEvent;->getX()F */
/* move/from16 v0, v22 */
/* move-object/from16 v1, p0 */
/* iput v0, v1, Lcom/ansca/corona/CoronaActivity;->myTapStartX:F */
/* .line 1340 */
v22 = /* invoke-virtual/range {p1 ..p1}, Landroid/view/MotionEvent;->getY()F */
/* move/from16 v0, v22 */
/* move-object/from16 v1, p0 */
/* iput v0, v1, Lcom/ansca/corona/CoronaActivity;->myTapStartY:F */
/* .line 1341 */
/* const/16 v22, 0x1 */
/* move/from16 v0, v22 */
/* move-object/from16 v1, p0 */
/* iput-boolean v0, v1, Lcom/ansca/corona/CoronaActivity;->myTapHasStarted:Z */
/* .line 1344 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lcom/ansca/corona/CoronaActivity;->myTapStartX:F */
/* move/from16 v22, v0 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lcom/ansca/corona/CoronaActivity;->myTapStartY:F */
/* move/from16 v23, v0 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lcom/ansca/corona/CoronaActivity;->myFirstTapX:F */
/* move/from16 v24, v0 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lcom/ansca/corona/CoronaActivity;->myFirstTapY:F */
/* move/from16 v25, v0 */
/* move-object/from16 v0, p0 */
/* move/from16 v1, v22 */
/* move/from16 v2, v23 */
/* move/from16 v3, v24 */
/* move/from16 v4, v25 */
v22 = /* invoke-direct {v0, v1, v2, v3, v4}, Lcom/ansca/corona/CoronaActivity;->areCoordinatesWithinTapBounds(FFFF)Z */
/* if-nez v22, :cond_2 */
/* .line 1346 */
/* const/16 v22, 0x0 */
/* move/from16 v0, v22 */
/* move-object/from16 v1, p0 */
/* iput v0, v1, Lcom/ansca/corona/CoronaActivity;->myImmediateTapCount:I */
/* .line 1347 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lcom/ansca/corona/CoronaActivity;->myTapStartX:F */
/* move/from16 v22, v0 */
/* move/from16 v0, v22 */
/* move-object/from16 v1, p0 */
/* iput v0, v1, Lcom/ansca/corona/CoronaActivity;->myFirstTapX:F */
/* .line 1348 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lcom/ansca/corona/CoronaActivity;->myTapStartY:F */
/* move/from16 v22, v0 */
/* move/from16 v0, v22 */
/* move-object/from16 v1, p0 */
/* iput v0, v1, Lcom/ansca/corona/CoronaActivity;->myFirstTapY:F */
/* .line 1382 */
} // :cond_2
} // :goto_2
/* const/16 v22, 0x1 */
/* .line 1183 */
} // .end local v5 # "action":I
} // .end local v10 # "multitouch":Lcom/ansca/corona/events/MultitouchEvent;
} // :cond_3
int v10 = 0; // const/4 v10, 0x0
/* goto/16 :goto_0 */
/* .line 1191 */
/* .restart local v5 # "action":I */
/* .restart local v10 # "multitouch":Lcom/ansca/corona/events/MultitouchEvent; */
/* :pswitch_0 */
v22 = com.ansca.corona.CoronaActivity.sTouches;
/* invoke-virtual/range {v22 ..v22}, Ljava/util/HashMap;->clear()V */
/* .line 1192 */
/* new-instance v18, Lcom/ansca/corona/events/TouchData; */
v23 = /* invoke-virtual/range {p1 ..p1}, Landroid/view/MotionEvent;->getX()F */
v24 = /* invoke-virtual/range {p1 ..p1}, Landroid/view/MotionEvent;->getY()F */
/* const/16 v25, 0x0 */
/* move-object/from16 v0, v18 */
/* move/from16 v1, v22 */
/* move/from16 v2, v23 */
/* move/from16 v3, v24 */
/* move/from16 v4, v25 */
/* invoke-direct {v0, v1, v2, v3, v4}, Lcom/ansca/corona/events/TouchData;-><init>(IFFI)V */
/* .line 1193 */
/* .restart local v18 # "t":Lcom/ansca/corona/events/TouchData; */
if ( v8 != null) { // if-eqz v8, :cond_4
/* .line 1194 */
/* move-object/from16 v0, v18 */
(( com.ansca.corona.events.MultitouchEvent ) v10 ).add ( v0 ); // invoke-virtual {v10, v0}, Lcom/ansca/corona/events/MultitouchEvent;->add(Lcom/ansca/corona/events/TouchData;)V
/* .line 1198 */
} // :goto_3
/* .line 1202 */
/* add-int/lit8 v22, v22, 0x1 */
/* .line 1203 */
/* const/16 v22, 0x0 */
/* move-object/from16 v0, v19 */
/* move-object/from16 v1, p1 */
v16 = /* move/from16 v2, v22 */
/* .line 1205 */
/* .restart local v16 # "pointerId":I */
v22 = com.ansca.corona.CoronaActivity.sTouches;
/* invoke-static/range {v16 ..v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer; */
/* move-object/from16 v0, v22 */
/* move-object/from16 v1, v23 */
/* move-object/from16 v2, v18 */
(( java.util.HashMap ) v0 ).put ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* goto/16 :goto_1 */
/* .line 1196 */
} // .end local v16 # "pointerId":I
} // :cond_4
/* move-object/from16 v0, v18 */
(( com.ansca.corona.events.EventManager ) v9 ).touchEvent ( v0 ); // invoke-virtual {v9, v0}, Lcom/ansca/corona/events/EventManager;->touchEvent(Lcom/ansca/corona/events/TouchData;)V
/* .line 1212 */
} // .end local v18 # "t":Lcom/ansca/corona/events/TouchData;
/* :pswitch_1 */
/* move-object/from16 v0, v19 */
v12 = /* move-object/from16 v1, p1 */
/* .line 1213 */
/* .local v12, "numPointers":I */
/* const/16 v22, 0x2 */
/* move/from16 v0, v22 */
/* if-ne v0, v5, :cond_7 */
int v7 = 1; // const/4 v7, 0x1
/* .line 1214 */
/* .local v7, "isMoved":Z */
} // :goto_4
int v15 = 1; // const/4 v15, 0x1
/* .line 1215 */
/* .local v15, "phase":I */
/* const/16 v22, 0x1 */
/* move/from16 v0, v22 */
/* if-ne v0, v5, :cond_8 */
/* .line 1216 */
int v15 = 3; // const/4 v15, 0x3
/* .line 1221 */
} // :cond_5
} // :goto_5
int v11 = 0; // const/4 v11, 0x0
/* .line 1222 */
/* .local v11, "numAdded":I */
int v6 = 0; // const/4 v6, 0x0
/* .local v6, "i":I */
} // :goto_6
/* if-ge v6, v12, :cond_c */
/* .line 1225 */
/* move-object/from16 v0, v19 */
v16 = /* move-object/from16 v1, p1 */
/* .line 1227 */
/* .restart local v16 # "pointerId":I */
v22 = com.ansca.corona.CoronaActivity.sTouches;
/* invoke-static/range {v16 ..v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer; */
/* invoke-virtual/range {v22 ..v23}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object; */
/* check-cast v18, Lcom/ansca/corona/events/TouchData; */
/* .line 1229 */
/* .restart local v18 # "t":Lcom/ansca/corona/events/TouchData; */
/* if-nez v18, :cond_9 */
/* .line 1231 */
if ( v8 != null) { // if-eqz v8, :cond_6
/* .line 1233 */
final String v22 = "Corona"; // const-string v22, "Corona"
/* new-instance v23, Ljava/lang/StringBuilder; */
/* invoke-direct/range {v23 ..v23}, Ljava/lang/StringBuilder;-><init>()V */
final String v24 = "ERROR: unknown touch detected while multitouch was enabled.numpointers("; // const-string v24, "ERROR: unknown touch detected while multitouch was enabled.numpointers("
/* invoke-virtual/range {v23 ..v24}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
/* move-object/from16 v0, v23 */
(( java.lang.StringBuilder ) v0 ).append ( v12 ); // invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v24 = ") pointerId("; // const-string v24, ") pointerId("
/* invoke-virtual/range {v23 ..v24}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
/* move-object/from16 v0, v23 */
/* move/from16 v1, v16 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v24 = ") i( "; // const-string v24, ") i( "
/* invoke-virtual/range {v23 ..v24}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
/* move-object/from16 v0, v23 */
(( java.lang.StringBuilder ) v0 ).append ( v6 ); // invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v24 = ")"; // const-string v24, ")"
/* invoke-virtual/range {v23 ..v24}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
/* invoke-virtual/range {v23 ..v23}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String; */
/* invoke-static/range {v22 ..v23}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I */
/* .line 1222 */
} // :cond_6
} // :goto_7
/* add-int/lit8 v6, v6, 0x1 */
/* .line 1213 */
} // .end local v6 # "i":I
} // .end local v7 # "isMoved":Z
} // .end local v11 # "numAdded":I
} // .end local v15 # "phase":I
} // .end local v16 # "pointerId":I
} // .end local v18 # "t":Lcom/ansca/corona/events/TouchData;
} // :cond_7
int v7 = 0; // const/4 v7, 0x0
/* .line 1217 */
/* .restart local v7 # "isMoved":Z */
/* .restart local v15 # "phase":I */
} // :cond_8
/* const/16 v22, 0x3 */
/* move/from16 v0, v22 */
/* if-ne v0, v5, :cond_5 */
/* .line 1218 */
int v15 = 4; // const/4 v15, 0x4
/* .line 1240 */
/* .restart local v6 # "i":I */
/* .restart local v11 # "numAdded":I */
/* .restart local v16 # "pointerId":I */
/* .restart local v18 # "t":Lcom/ansca/corona/events/TouchData; */
} // :cond_9
/* move-object/from16 v0, v19 */
v20 = /* move-object/from16 v1, p1 */
/* .line 1241 */
/* .restart local v20 # "x":F */
/* move-object/from16 v0, v19 */
v21 = /* move-object/from16 v1, p1 */
/* .line 1244 */
/* .restart local v21 # "y":F */
if ( v7 != null) { // if-eqz v7, :cond_a
/* .line 1245 */
v13 = /* invoke-virtual/range {v18 ..v18}, Lcom/ansca/corona/events/TouchData;->getX()I */
/* .line 1246 */
/* .local v13, "oldX":I */
v14 = /* invoke-virtual/range {v18 ..v18}, Lcom/ansca/corona/events/TouchData;->getY()I */
/* .line 1247 */
/* .local v14, "oldY":I */
/* move/from16 v0, v20 */
/* float-to-int v0, v0 */
/* move/from16 v22, v0 */
/* move/from16 v0, v22 */
/* if-ne v13, v0, :cond_a */
/* move/from16 v0, v21 */
/* float-to-int v0, v0 */
/* move/from16 v22, v0 */
/* move/from16 v0, v22 */
/* if-eq v14, v0, :cond_6 */
/* .line 1252 */
} // .end local v13 # "oldX":I
} // .end local v14 # "oldY":I
} // :cond_a
/* move-object/from16 v0, v18 */
/* move/from16 v1, v20 */
(( com.ansca.corona.events.TouchData ) v0 ).setX ( v1 ); // invoke-virtual {v0, v1}, Lcom/ansca/corona/events/TouchData;->setX(F)V
/* .line 1253 */
/* move-object/from16 v0, v18 */
/* move/from16 v1, v21 */
(( com.ansca.corona.events.TouchData ) v0 ).setY ( v1 ); // invoke-virtual {v0, v1}, Lcom/ansca/corona/events/TouchData;->setY(F)V
/* .line 1254 */
/* move-object/from16 v0, v18 */
(( com.ansca.corona.events.TouchData ) v0 ).setPhase ( v15 ); // invoke-virtual {v0, v15}, Lcom/ansca/corona/events/TouchData;->setPhase(I)V
/* .line 1256 */
if ( v8 != null) { // if-eqz v8, :cond_b
/* .line 1257 */
/* move-object/from16 v0, v18 */
(( com.ansca.corona.events.MultitouchEvent ) v10 ).add ( v0 ); // invoke-virtual {v10, v0}, Lcom/ansca/corona/events/MultitouchEvent;->add(Lcom/ansca/corona/events/TouchData;)V
/* .line 1258 */
/* add-int/lit8 v11, v11, 0x1 */
/* .line 1261 */
} // :cond_b
/* move-object/from16 v0, v18 */
(( com.ansca.corona.events.EventManager ) v9 ).touchEvent ( v0 ); // invoke-virtual {v9, v0}, Lcom/ansca/corona/events/EventManager;->touchEvent(Lcom/ansca/corona/events/TouchData;)V
/* .line 1265 */
} // .end local v16 # "pointerId":I
} // .end local v18 # "t":Lcom/ansca/corona/events/TouchData;
} // .end local v20 # "x":F
} // .end local v21 # "y":F
} // :cond_c
/* if-gtz v11, :cond_d */
/* .line 1267 */
int v10 = 0; // const/4 v10, 0x0
/* .line 1271 */
} // :cond_d
/* if-nez v7, :cond_0 */
/* .line 1273 */
v22 = com.ansca.corona.CoronaActivity.sTouches;
/* invoke-virtual/range {v22 ..v22}, Ljava/util/HashMap;->clear()V */
/* goto/16 :goto_1 */
/* .line 1296 */
} // .end local v6 # "i":I
} // .end local v7 # "isMoved":Z
} // .end local v11 # "numAdded":I
} // .end local v12 # "numPointers":I
} // .end local v15 # "phase":I
} // :cond_e
v22 = /* invoke-interface/range {v19 ..v19}, Lcom/ansca/corona/version/IAndroidVersionSpecific;->motionEventACTION_POINTER_UP()I */
/* move/from16 v0, v22 */
/* if-ne v0, v5, :cond_0 */
/* .line 1298 */
/* move-object/from16 v0, v19 */
v17 = /* move-object/from16 v1, p1 */
/* .line 1299 */
/* .restart local v17 # "pointerIndex":I */
/* move-object/from16 v0, v19 */
/* move-object/from16 v1, p1 */
v16 = /* move/from16 v2, v17 */
/* .line 1301 */
/* .restart local v16 # "pointerId":I */
v22 = com.ansca.corona.CoronaActivity.sTouches;
/* invoke-static/range {v16 ..v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer; */
/* invoke-virtual/range {v22 ..v23}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object; */
/* check-cast v18, Lcom/ansca/corona/events/TouchData; */
/* .line 1302 */
/* .restart local v18 # "t":Lcom/ansca/corona/events/TouchData; */
/* if-nez v18, :cond_f */
/* .line 1304 */
final String v22 = "Corona"; // const-string v22, "Corona"
/* new-instance v23, Ljava/lang/StringBuilder; */
/* invoke-direct/range {v23 ..v23}, Ljava/lang/StringBuilder;-><init>()V */
final String v24 = "ERROR: ACTION_POINTER_DOWN unknown touch detected while multitouch was enabled.pointerId("; // const-string v24, "ERROR: ACTION_POINTER_DOWN unknown touch detected while multitouch was enabled.pointerId("
/* invoke-virtual/range {v23 ..v24}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
/* move-object/from16 v0, v23 */
/* move/from16 v1, v16 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v24 = ")"; // const-string v24, ")"
/* invoke-virtual/range {v23 ..v24}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
/* invoke-virtual/range {v23 ..v23}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String; */
/* invoke-static/range {v22 ..v23}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I */
/* .line 1305 */
int v10 = 0; // const/4 v10, 0x0
/* goto/16 :goto_1 */
/* .line 1309 */
} // :cond_f
/* move-object/from16 v0, v19 */
/* move-object/from16 v1, p1 */
v20 = /* move/from16 v2, v17 */
/* .line 1310 */
/* .restart local v20 # "x":F */
/* move-object/from16 v0, v19 */
/* move-object/from16 v1, p1 */
v21 = /* move/from16 v2, v17 */
/* .line 1311 */
/* .restart local v21 # "y":F */
/* move-object/from16 v0, v18 */
/* move/from16 v1, v20 */
(( com.ansca.corona.events.TouchData ) v0 ).setX ( v1 ); // invoke-virtual {v0, v1}, Lcom/ansca/corona/events/TouchData;->setX(F)V
/* .line 1312 */
/* move-object/from16 v0, v18 */
/* move/from16 v1, v21 */
(( com.ansca.corona.events.TouchData ) v0 ).setY ( v1 ); // invoke-virtual {v0, v1}, Lcom/ansca/corona/events/TouchData;->setY(F)V
/* .line 1313 */
/* const/16 v22, 0x3 */
/* move-object/from16 v0, v18 */
/* move/from16 v1, v22 */
(( com.ansca.corona.events.TouchData ) v0 ).setPhase ( v1 ); // invoke-virtual {v0, v1}, Lcom/ansca/corona/events/TouchData;->setPhase(I)V
/* .line 1315 */
/* move-object/from16 v0, v18 */
(( com.ansca.corona.events.MultitouchEvent ) v10 ).add ( v0 ); // invoke-virtual {v10, v0}, Lcom/ansca/corona/events/MultitouchEvent;->add(Lcom/ansca/corona/events/TouchData;)V
/* .line 1317 */
v22 = com.ansca.corona.CoronaActivity.sTouches;
/* invoke-static/range {v16 ..v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer; */
/* invoke-virtual/range {v22 ..v23}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object; */
/* goto/16 :goto_1 */
/* .line 1351 */
} // .end local v16 # "pointerId":I
} // .end local v17 # "pointerIndex":I
} // .end local v18 # "t":Lcom/ansca/corona/events/TouchData;
} // .end local v20 # "x":F
} // .end local v21 # "y":F
} // :cond_10
/* move-object/from16 v0, p0 */
/* iget-boolean v0, v0, Lcom/ansca/corona/CoronaActivity;->myTapHasStarted:Z */
/* move/from16 v22, v0 */
if ( v22 != null) { // if-eqz v22, :cond_2
/* const/16 v22, 0x1 */
/* move/from16 v0, v22 */
/* if-ne v0, v5, :cond_2 */
/* .line 1355 */
v22 = /* invoke-virtual/range {p1 ..p1}, Landroid/view/MotionEvent;->getX()F */
v23 = /* invoke-virtual/range {p1 ..p1}, Landroid/view/MotionEvent;->getY()F */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lcom/ansca/corona/CoronaActivity;->myTapStartX:F */
/* move/from16 v24, v0 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lcom/ansca/corona/CoronaActivity;->myTapStartY:F */
/* move/from16 v25, v0 */
/* move-object/from16 v0, p0 */
/* move/from16 v1, v22 */
/* move/from16 v2, v23 */
/* move/from16 v3, v24 */
/* move/from16 v4, v25 */
v22 = /* invoke-direct {v0, v1, v2, v3, v4}, Lcom/ansca/corona/CoronaActivity;->areCoordinatesWithinTapBounds(FFFF)Z */
if ( v22 != null) { // if-eqz v22, :cond_2
/* .line 1358 */
/* invoke-virtual/range {p1 ..p1}, Landroid/view/MotionEvent;->getEventTime()J */
/* move-result-wide v22 */
/* move-object/from16 v0, p0 */
/* iget-wide v0, v0, Lcom/ansca/corona/CoronaActivity;->myLastTapTime:J */
/* move-wide/from16 v24, v0 */
/* sub-long v22, v22, v24 */
/* const-wide/16 v24, 0x1f4 */
/* cmp-long v22, v22, v24 */
/* if-lez v22, :cond_12 */
/* .line 1360 */
/* const/16 v22, 0x1 */
/* move/from16 v0, v22 */
/* move-object/from16 v1, p0 */
/* iput v0, v1, Lcom/ansca/corona/CoronaActivity;->myImmediateTapCount:I */
/* .line 1366 */
} // :cond_11
} // :goto_8
/* invoke-virtual/range {p1 ..p1}, Landroid/view/MotionEvent;->getEventTime()J */
/* move-result-wide v22 */
/* move-wide/from16 v0, v22 */
/* move-object/from16 v2, p0 */
/* iput-wide v0, v2, Lcom/ansca/corona/CoronaActivity;->myLastTapTime:J */
/* .line 1367 */
/* const/16 v22, 0x0 */
/* move/from16 v0, v22 */
/* move-object/from16 v1, p0 */
/* iput-boolean v0, v1, Lcom/ansca/corona/CoronaActivity;->myTapHasStarted:Z */
/* .line 1370 */
v22 = /* invoke-virtual/range {p1 ..p1}, Landroid/view/MotionEvent;->getX()F */
/* move/from16 v0, v22 */
/* float-to-int v0, v0 */
/* move/from16 v22, v0 */
v23 = /* invoke-virtual/range {p1 ..p1}, Landroid/view/MotionEvent;->getY()F */
/* move/from16 v0, v23 */
/* float-to-int v0, v0 */
/* move/from16 v23, v0 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lcom/ansca/corona/CoronaActivity;->myImmediateTapCount:I */
/* move/from16 v24, v0 */
/* move/from16 v0, v22 */
/* move/from16 v1, v23 */
/* move/from16 v2, v24 */
(( com.ansca.corona.events.EventManager ) v9 ).tapEvent ( v0, v1, v2 ); // invoke-virtual {v9, v0, v1, v2}, Lcom/ansca/corona/events/EventManager;->tapEvent(III)V
/* goto/16 :goto_2 */
/* .line 1362 */
} // :cond_12
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lcom/ansca/corona/CoronaActivity;->myImmediateTapCount:I */
/* move/from16 v22, v0 */
/* const v23, 0x7fffffff */
/* move/from16 v0, v22 */
/* move/from16 v1, v23 */
/* if-ge v0, v1, :cond_11 */
/* .line 1364 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lcom/ansca/corona/CoronaActivity;->myImmediateTapCount:I */
/* move/from16 v22, v0 */
/* add-int/lit8 v22, v22, 0x1 */
/* move/from16 v0, v22 */
/* move-object/from16 v1, p0 */
/* iput v0, v1, Lcom/ansca/corona/CoronaActivity;->myImmediateTapCount:I */
/* .line 1378 */
} // :cond_13
/* const/16 v22, 0x0 */
/* move/from16 v0, v22 */
/* move-object/from16 v1, p0 */
/* iput-boolean v0, v1, Lcom/ansca/corona/CoronaActivity;->myTapHasStarted:Z */
/* .line 1379 */
/* const/16 v22, 0x0 */
/* move/from16 v0, v22 */
/* move-object/from16 v1, p0 */
/* iput v0, v1, Lcom/ansca/corona/CoronaActivity;->myImmediateTapCount:I */
/* goto/16 :goto_2 */
/* .line 1185 */
/* nop */
/* :pswitch_data_0 */
/* .packed-switch 0x0 */
/* :pswitch_0 */
/* :pswitch_1 */
/* :pswitch_1 */
/* :pswitch_1 */
} // .end packed-switch
} // .end method
public void onWindowFocusChanged ( Boolean p0 ) {
/* .locals 0 */
/* .param p1, "hasFocus" # Z */
/* .prologue */
/* .line 586 */
/* invoke-super {p0, p1}, Landroid/app/Activity;->onWindowFocusChanged(Z)V */
/* .line 588 */
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 594 */
} // :cond_0
return;
} // .end method
void requestRender ( ) {
/* .locals 1 */
/* .prologue */
/* .line 668 */
v0 = this.mySystemMonitor;
(( com.ansca.corona.SystemMonitor ) v0 ).update ( ); // invoke-virtual {v0}, Lcom/ansca/corona/SystemMonitor;->update()V
/* .line 669 */
v0 = this.myGLView;
/* .line 670 */
return;
} // .end method
void setNeedsSwap ( ) {
/* .locals 1 */
/* .prologue */
/* .line 1402 */
v0 = this.myGLView;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 1403 */
v0 = this.myGLView;
/* .line 1404 */
} // :cond_0
return;
} // .end method
public void setRequestedOrientation ( Integer p0 ) {
/* .locals 0 */
/* .param p1, "requestedOrientation" # I */
/* .prologue */
/* .line 254 */
/* packed-switch p1, :pswitch_data_0 */
/* .line 266 */
} // :goto_0
/* :pswitch_0 */
/* invoke-super {p0, p1}, Landroid/app/Activity;->setRequestedOrientation(I)V */
/* .line 267 */
return;
/* .line 256 */
/* :pswitch_1 */
int p1 = 4; // const/4 p1, 0x4
/* .line 257 */
/* .line 261 */
/* :pswitch_2 */
int p1 = 1; // const/4 p1, 0x1
/* .line 254 */
/* nop */
/* :pswitch_data_0 */
/* .packed-switch -0x1 */
/* :pswitch_1 */
/* :pswitch_0 */
/* :pswitch_0 */
/* :pswitch_2 */
/* :pswitch_2 */
/* :pswitch_0 */
/* :pswitch_2 */
} // .end packed-switch
} // .end method
void setStatusBarMode ( Integer p0 ) {
/* .locals 3 */
/* .param p1, "mode" # I */
/* .prologue */
/* const/16 v2, 0x800 */
/* const/16 v1, 0x400 */
/* .line 427 */
/* iget v0, p0, Lcom/ansca/corona/CoronaActivity;->myStatusBarMode:I */
/* if-ne p1, v0, :cond_0 */
/* .line 451 */
} // :goto_0
return;
/* .line 432 */
} // :cond_0
/* packed-switch p1, :pswitch_data_0 */
/* .line 434 */
/* :pswitch_0 */
(( com.ansca.corona.CoronaActivity ) p0 ).getWindow ( ); // invoke-virtual {p0}, Lcom/ansca/corona/CoronaActivity;->getWindow()Landroid/view/Window;
(( android.view.Window ) v0 ).addFlags ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/Window;->addFlags(I)V
/* .line 435 */
(( com.ansca.corona.CoronaActivity ) p0 ).getWindow ( ); // invoke-virtual {p0}, Lcom/ansca/corona/CoronaActivity;->getWindow()Landroid/view/Window;
(( android.view.Window ) v0 ).clearFlags ( v2 ); // invoke-virtual {v0, v2}, Landroid/view/Window;->clearFlags(I)V
/* .line 450 */
} // :cond_1
} // :goto_1
/* iput p1, p0, Lcom/ansca/corona/CoronaActivity;->myStatusBarMode:I */
/* .line 441 */
/* :pswitch_1 */
/* iget v0, p0, Lcom/ansca/corona/CoronaActivity;->myStatusBarMode:I */
/* if-nez v0, :cond_1 */
/* .line 442 */
(( com.ansca.corona.CoronaActivity ) p0 ).getWindow ( ); // invoke-virtual {p0}, Lcom/ansca/corona/CoronaActivity;->getWindow()Landroid/view/Window;
(( android.view.Window ) v0 ).addFlags ( v2 ); // invoke-virtual {v0, v2}, Landroid/view/Window;->addFlags(I)V
/* .line 443 */
(( com.ansca.corona.CoronaActivity ) p0 ).getWindow ( ); // invoke-virtual {p0}, Lcom/ansca/corona/CoronaActivity;->getWindow()Landroid/view/Window;
(( android.view.Window ) v0 ).clearFlags ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/Window;->clearFlags(I)V
/* .line 432 */
/* nop */
/* :pswitch_data_0 */
/* .packed-switch 0x0 */
/* :pswitch_0 */
/* :pswitch_1 */
/* :pswitch_1 */
/* :pswitch_1 */
} // .end packed-switch
} // .end method
void showCameraWindowUsing ( java.lang.String p0 ) {
/* .locals 18 */
/* .param p1, "destinationFilePath" # Ljava/lang/String; */
/* .prologue */
/* .line 905 */
v5 = com.ansca.corona.CameraServices .hasCamera ( );
/* .line 906 */
/* .local v5, "hasCamera":Z */
/* if-nez v5, :cond_0 */
/* .line 907 */
final String v10 = "Camera not found."; // const-string v10, "Camera not found."
/* .line 908 */
/* .local v10, "message":Ljava/lang/String; */
final String v13 = "Corona"; // const-string v13, "Corona"
/* new-instance v14, Ljava/lang/StringBuilder; */
/* invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V */
final String v15 = "Warning: "; // const-string v15, "Warning: "
(( java.lang.StringBuilder ) v14 ).append ( v15 ); // invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v14 ).append ( v10 ); // invoke-virtual {v14, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v14 ).toString ( ); // invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .v ( v13,v14 );
/* .line 909 */
com.ansca.corona.Controller .getController ( );
final String v14 = "Warning"; // const-string v14, "Warning"
int v15 = 1; // const/4 v15, 0x1
/* new-array v15, v15, [Ljava/lang/String; */
/* const/16 v16, 0x0 */
final String v17 = "OK"; // const-string v17, "OK"
/* aput-object v17, v15, v16 */
(( com.ansca.corona.Controller ) v13 ).showNativeAlert ( v14, v10, v15 ); // invoke-virtual {v13, v14, v10, v15}, Lcom/ansca/corona/Controller;->showNativeAlert(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V
/* .line 913 */
} // .end local v10 # "message":Ljava/lang/String;
} // :cond_0
int v2 = 0; // const/4 v2, 0x0
/* .line 914 */
/* .local v2, "canWriteToExternalStorage":Z */
final String v13 = "mounted"; // const-string v13, "mounted"
android.os.Environment .getExternalStorageState ( );
v13 = (( java.lang.String ) v13 ).equals ( v14 ); // invoke-virtual {v13, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v13 != null) { // if-eqz v13, :cond_1
/* .line 915 */
final String v12 = "android.permission.WRITE_EXTERNAL_STORAGE"; // const-string v12, "android.permission.WRITE_EXTERNAL_STORAGE"
/* .line 916 */
/* .local v12, "permissionName":Ljava/lang/String; */
/* move-object/from16 v0, p0 */
v13 = (( com.ansca.corona.CoronaActivity ) v0 ).checkCallingOrSelfPermission ( v12 ); // invoke-virtual {v0, v12}, Lcom/ansca/corona/CoronaActivity;->checkCallingOrSelfPermission(Ljava/lang/String;)I
/* if-nez v13, :cond_1 */
/* .line 917 */
int v2 = 1; // const/4 v2, 0x1
/* .line 922 */
} // .end local v12 # "permissionName":Ljava/lang/String;
} // :cond_1
v6 = com.ansca.corona.CameraServices .hasPermission ( );
/* .line 923 */
/* .local v6, "hasPermission":Z */
/* if-nez v6, :cond_2 */
/* .line 924 */
final String v10 = "This application does not have permission to use the camera."; // const-string v10, "This application does not have permission to use the camera."
/* .line 925 */
/* .restart local v10 # "message":Ljava/lang/String; */
final String v13 = "Corona"; // const-string v13, "Corona"
/* new-instance v14, Ljava/lang/StringBuilder; */
/* invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V */
final String v15 = "Warning: "; // const-string v15, "Warning: "
(( java.lang.StringBuilder ) v14 ).append ( v15 ); // invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v14 ).append ( v10 ); // invoke-virtual {v14, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v14 ).toString ( ); // invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .v ( v13,v14 );
/* .line 926 */
com.ansca.corona.Controller .getController ( );
final String v14 = "Warning"; // const-string v14, "Warning"
int v15 = 1; // const/4 v15, 0x1
/* new-array v15, v15, [Ljava/lang/String; */
/* const/16 v16, 0x0 */
final String v17 = "OK"; // const-string v17, "OK"
/* aput-object v17, v15, v16 */
(( com.ansca.corona.Controller ) v13 ).showNativeAlert ( v14, v10, v15 ); // invoke-virtual {v13, v14, v10, v15}, Lcom/ansca/corona/Controller;->showNativeAlert(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V
/* .line 931 */
} // .end local v10 # "message":Ljava/lang/String;
} // :cond_2
if ( v5 != null) { // if-eqz v5, :cond_3
/* if-nez v6, :cond_4 */
/* .line 932 */
} // :cond_3
com.ansca.corona.Controller .getEventManager ( );
final String v14 = ""; // const-string v14, ""
(( com.ansca.corona.events.EventManager ) v13 ).imagePickerEvent ( v14 ); // invoke-virtual {v13, v14}, Lcom/ansca/corona/events/EventManager;->imagePickerEvent(Ljava/lang/String;)V
/* .line 988 */
} // :goto_0
return;
/* .line 937 */
} // :cond_4
if ( v2 != null) { // if-eqz v2, :cond_b
/* .line 939 */
v13 = android.os.Environment.DIRECTORY_PICTURES;
android.os.Environment .getExternalStoragePublicDirectory ( v13 );
/* .line 940 */
/* .local v3, "directory":Ljava/io/File; */
(( java.io.File ) v3 ).mkdirs ( ); // invoke-virtual {v3}, Ljava/io/File;->mkdirs()Z
/* .line 943 */
int v7 = 0; // const/4 v7, 0x0
/* .line 944 */
/* .local v7, "imageFile":Ljava/io/File; */
/* invoke-virtual/range {p0 ..p0}, Lcom/ansca/corona/CoronaActivity;->getPackageManager()Landroid/content/pm/PackageManager; */
/* invoke-virtual/range {p0 ..p0}, Lcom/ansca/corona/CoronaActivity;->getApplicationInfo()Landroid/content/pm/ApplicationInfo; */
(( android.content.pm.PackageManager ) v13 ).getApplicationLabel ( v14 ); // invoke-virtual {v13, v14}, Landroid/content/pm/PackageManager;->getApplicationLabel(Landroid/content/pm/ApplicationInfo;)Ljava/lang/CharSequence;
/* check-cast v1, Ljava/lang/String; */
/* .line 945 */
/* .local v1, "applicationName":Ljava/lang/String; */
if ( v1 != null) { // if-eqz v1, :cond_5
v13 = (( java.lang.String ) v1 ).length ( ); // invoke-virtual {v1}, Ljava/lang/String;->length()I
/* if-gtz v13, :cond_6 */
/* .line 946 */
} // :cond_5
final String v1 = "Corona"; // const-string v1, "Corona"
/* .line 949 */
} // :cond_6
int v8 = 1; // const/4 v8, 0x1
/* .local v8, "index":I */
} // :goto_1
/* const/16 v13, 0x2710 */
/* if-gt v8, v13, :cond_7 */
/* .line 950 */
try { // :try_start_0
/* new-instance v11, Ljava/io/File; */
/* new-instance v13, Ljava/lang/StringBuilder; */
/* invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v13 ).append ( v1 ); // invoke-virtual {v13, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v14 = " Picture "; // const-string v14, " Picture "
(( java.lang.StringBuilder ) v13 ).append ( v14 ); // invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
java.lang.Integer .toString ( v8 );
(( java.lang.StringBuilder ) v13 ).append ( v14 ); // invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v14 = ".jpg"; // const-string v14, ".jpg"
(( java.lang.StringBuilder ) v13 ).append ( v14 ); // invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v13 ).toString ( ); // invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v11, v3, v13}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V */
/* .line 951 */
/* .local v11, "nextFile":Ljava/io/File; */
(( java.io.File ) v11 ).exists ( ); // invoke-virtual {v11}, Ljava/io/File;->exists()Z
/* :try_end_0 */
v13 = /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* if-nez v13, :cond_8 */
/* .line 952 */
/* move-object v7, v11 */
/* .line 960 */
} // .end local v11 # "nextFile":Ljava/io/File;
} // :cond_7
} // :goto_2
/* if-nez v7, :cond_9 */
/* .line 961 */
final String v13 = "Corona"; // const-string v13, "Corona"
final String v14 = "Failed to generate a unique image file name for the camera shot."; // const-string v14, "Failed to generate a unique image file name for the camera shot."
android.util.Log .v ( v13,v14 );
/* .line 962 */
com.ansca.corona.Controller .getEventManager ( );
final String v14 = ""; // const-string v14, ""
(( com.ansca.corona.events.EventManager ) v13 ).imagePickerEvent ( v14 ); // invoke-virtual {v13, v14}, Lcom/ansca/corona/events/EventManager;->imagePickerEvent(Ljava/lang/String;)V
/* .line 949 */
/* .restart local v11 # "nextFile":Ljava/io/File; */
} // :cond_8
/* add-int/lit8 v8, v8, 0x1 */
/* .line 957 */
} // .end local v11 # "nextFile":Ljava/io/File;
/* :catch_0 */
/* move-exception v4 */
/* .line 958 */
/* .local v4, "ex":Ljava/lang/Exception; */
(( java.lang.Exception ) v4 ).printStackTrace ( ); // invoke-virtual {v4}, Ljava/lang/Exception;->printStackTrace()V
/* .line 965 */
} // .end local v4 # "ex":Ljava/lang/Exception;
} // :cond_9
android.net.Uri .fromFile ( v7 );
/* move-object/from16 v0, p0 */
this.myCameraShotSourceUri = v13;
/* .line 969 */
int v13 = 0; // const/4 v13, 0x0
/* move-object/from16 v0, p0 */
this.myCameraShotDestinationFile = v13;
/* .line 970 */
if ( p1 != null) { // if-eqz p1, :cond_a
v13 = /* invoke-virtual/range {p1 ..p1}, Ljava/lang/String;->length()I */
/* if-lez v13, :cond_a */
/* .line 971 */
/* new-instance v13, Ljava/io/File; */
/* move-object/from16 v0, p1 */
/* invoke-direct {v13, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V */
/* move-object/from16 v0, p0 */
this.myCameraShotDestinationFile = v13;
/* .line 975 */
} // :cond_a
/* new-instance v9, Landroid/content/Intent; */
final String v13 = "android.media.action.IMAGE_CAPTURE"; // const-string v13, "android.media.action.IMAGE_CAPTURE"
/* invoke-direct {v9, v13}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V */
/* .line 976 */
/* .local v9, "intent":Landroid/content/Intent; */
final String v13 = "output"; // const-string v13, "output"
/* move-object/from16 v0, p0 */
v14 = this.myCameraShotSourceUri;
(( android.content.Intent ) v9 ).putExtra ( v13, v14 ); // invoke-virtual {v9, v13, v14}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;
/* .line 977 */
int v13 = 3; // const/4 v13, 0x3
/* move-object/from16 v0, p0 */
(( com.ansca.corona.CoronaActivity ) v0 ).startActivityForResult ( v9, v13 ); // invoke-virtual {v0, v9, v13}, Lcom/ansca/corona/CoronaActivity;->startActivityForResult(Landroid/content/Intent;I)V
/* goto/16 :goto_0 */
/* .line 982 */
} // .end local v1 # "applicationName":Ljava/lang/String;
} // .end local v3 # "directory":Ljava/io/File;
} // .end local v7 # "imageFile":Ljava/io/File;
} // .end local v8 # "index":I
} // .end local v9 # "intent":Landroid/content/Intent;
} // :cond_b
/* new-instance v9, Landroid/content/Intent; */
/* const-class v13, Lcom/ansca/corona/CameraActivity; */
/* move-object/from16 v0, p0 */
/* invoke-direct {v9, v0, v13}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V */
/* .line 983 */
/* .restart local v9 # "intent":Landroid/content/Intent; */
if ( p1 != null) { // if-eqz p1, :cond_c
v13 = /* invoke-virtual/range {p1 ..p1}, Ljava/lang/String;->length()I */
/* if-lez v13, :cond_c */
/* .line 984 */
/* invoke-static/range {p1 ..p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri; */
(( android.content.Intent ) v9 ).setData ( v13 ); // invoke-virtual {v9, v13}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;
/* .line 986 */
} // :cond_c
int v13 = 4; // const/4 v13, 0x4
/* move-object/from16 v0, p0 */
(( com.ansca.corona.CoronaActivity ) v0 ).startActivityForResult ( v9, v13 ); // invoke-virtual {v0, v9, v13}, Lcom/ansca/corona/CoronaActivity;->startActivityForResult(Landroid/content/Intent;I)V
/* goto/16 :goto_0 */
} // .end method
void showSelectImageWindowUsing ( java.lang.String p0 ) {
/* .locals 2 */
/* .param p1, "destinationFilePath" # Ljava/lang/String; */
/* .prologue */
/* .line 891 */
this.mySelectImageDestinationFilePath = p1;
/* .line 892 */
/* new-instance v0, Landroid/content/Intent; */
final String v1 = "android.intent.action.GET_CONTENT"; // const-string v1, "android.intent.action.GET_CONTENT"
/* invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V */
/* .line 893 */
/* .local v0, "intent":Landroid/content/Intent; */
final String v1 = "image/*"; // const-string v1, "image/*"
(( android.content.Intent ) v0 ).setType ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;
/* .line 894 */
final String v1 = ""; // const-string v1, ""
android.content.Intent .createChooser ( v0,v1 );
/* .line 895 */
int v1 = 2; // const/4 v1, 0x2
(( com.ansca.corona.CoronaActivity ) p0 ).startActivityForResult ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lcom/ansca/corona/CoronaActivity;->startActivityForResult(Landroid/content/Intent;I)V
/* .line 896 */
return;
} // .end method
void showSendMailWindowUsing ( com.ansca.corona.MailSettings p0 ) {
/* .locals 3 */
/* .param p1, "settings" # Lcom/ansca/corona/MailSettings; */
/* .prologue */
/* .line 996 */
/* if-nez p1, :cond_0 */
/* .line 997 */
/* new-instance p1, Lcom/ansca/corona/MailSettings; */
} // .end local p1 # "settings":Lcom/ansca/corona/MailSettings;
/* invoke-direct {p1}, Lcom/ansca/corona/MailSettings;-><init>()V */
/* .line 1001 */
/* .restart local p1 # "settings":Lcom/ansca/corona/MailSettings; */
} // :cond_0
(( com.ansca.corona.MailSettings ) p1 ).toIntent ( ); // invoke-virtual {p1}, Lcom/ansca/corona/MailSettings;->toIntent()Landroid/content/Intent;
/* .line 1002 */
/* .local v0, "intent":Landroid/content/Intent; */
final String v1 = "Send mail..."; // const-string v1, "Send mail..."
android.content.Intent .createChooser ( v0,v1 );
int v2 = 1; // const/4 v2, 0x1
(( com.ansca.corona.CoronaActivity ) p0 ).startActivityForResult ( v1, v2 ); // invoke-virtual {p0, v1, v2}, Lcom/ansca/corona/CoronaActivity;->startActivityForResult(Landroid/content/Intent;I)V
/* .line 1003 */
return;
} // .end method
void showSendSmsWindowUsing ( com.ansca.corona.SmsSettings p0 ) {
/* .locals 3 */
/* .param p1, "settings" # Lcom/ansca/corona/SmsSettings; */
/* .prologue */
/* .line 1011 */
/* if-nez p1, :cond_0 */
/* .line 1012 */
/* new-instance p1, Lcom/ansca/corona/SmsSettings; */
} // .end local p1 # "settings":Lcom/ansca/corona/SmsSettings;
/* invoke-direct {p1}, Lcom/ansca/corona/SmsSettings;-><init>()V */
/* .line 1016 */
/* .restart local p1 # "settings":Lcom/ansca/corona/SmsSettings; */
} // :cond_0
(( com.ansca.corona.SmsSettings ) p1 ).toIntent ( ); // invoke-virtual {p1}, Lcom/ansca/corona/SmsSettings;->toIntent()Landroid/content/Intent;
/* .line 1017 */
/* .local v0, "intent":Landroid/content/Intent; */
final String v1 = "Send text..."; // const-string v1, "Send text..."
android.content.Intent .createChooser ( v0,v1 );
int v2 = 6; // const/4 v2, 0x6
(( com.ansca.corona.CoronaActivity ) p0 ).startActivityForResult ( v1, v2 ); // invoke-virtual {p0, v1, v2}, Lcom/ansca/corona/CoronaActivity;->startActivityForResult(Landroid/content/Intent;I)V
/* .line 1018 */
return;
} // .end method
void showSplashScreen ( ) {
/* .locals 26 */
/* .prologue */
/* .line 674 */
int v3 = 3; // const/4 v3, 0x3
/* .line 675 */
/* .local v3, "ACCESS_BUFFER":I */
/* const/16 v20, 0x0 */
/* .line 676 */
/* .local v20, "stream":Ljava/io/InputStream; */
int v8 = 0; // const/4 v8, 0x0
/* .line 677 */
/* .local v8, "fileName":Ljava/lang/String; */
int v10 = 0; // const/4 v10, 0x0
/* .line 680 */
/* .local v10, "imageRotation":I */
/* invoke-virtual/range {p0 ..p0}, Lcom/ansca/corona/CoronaActivity;->getWindowManager()Landroid/view/WindowManager; */
/* invoke-interface/range {v23 ..v23}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display; */
/* .line 681 */
/* .local v6, "display":Landroid/view/Display; */
v4 = /* invoke-direct/range {p0 ..p0}, Lcom/ansca/corona/CoronaActivity;->getCoronaOrientationFromWindowManager()I */
/* .line 687 */
/* .local v4, "appOrientation":I */
try { // :try_start_0
v23 = (( android.view.Display ) v6 ).getHeight ( ); // invoke-virtual {v6}, Landroid/view/Display;->getHeight()I
v24 = (( android.view.Display ) v6 ).getWidth ( ); // invoke-virtual {v6}, Landroid/view/Display;->getWidth()I
/* move/from16 v0, v23 */
/* move/from16 v1, v24 */
/* if-le v0, v1, :cond_4 */
v14 = (( android.view.Display ) v6 ).getHeight ( ); // invoke-virtual {v6}, Landroid/view/Display;->getHeight()I
/* .line 688 */
/* .local v14, "longestScreenLength":I */
} // :goto_0
/* const/16 v23, 0x1e0 */
/* move/from16 v0, v23 */
/* if-le v14, v0, :cond_0 */
/* .line 689 */
/* packed-switch v4, :pswitch_data_0 */
/* .line 716 */
final String v8 = "Default-Portrait.png"; // const-string v8, "Default-Portrait.png"
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_4 */
/* .line 717 */
try { // :try_start_1
/* invoke-virtual/range {p0 ..p0}, Lcom/ansca/corona/CoronaActivity;->getAssets()Landroid/content/res/AssetManager; */
/* const/16 v24, 0x3 */
/* move-object/from16 v0, v23 */
/* move/from16 v1, v24 */
(( android.content.res.AssetManager ) v0 ).open ( v8, v1 ); // invoke-virtual {v0, v8, v1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;I)Ljava/io/InputStream;
/* :try_end_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_7 */
/* .line 723 */
} // :cond_0
} // :goto_1
/* if-nez v20, :cond_3 */
/* .line 724 */
/* const/16 v23, 0x1e0 */
/* move/from16 v0, v23 */
/* if-le v14, v0, :cond_1 */
/* .line 725 */
try { // :try_start_2
final String v8 = "Default@2x.png"; // const-string v8, "Default@2x.png"
/* :try_end_2 */
/* .catch Ljava/lang/Exception; {:try_start_2 ..:try_end_2} :catch_4 */
/* .line 726 */
try { // :try_start_3
/* invoke-virtual/range {p0 ..p0}, Lcom/ansca/corona/CoronaActivity;->getAssets()Landroid/content/res/AssetManager; */
/* const/16 v24, 0x3 */
/* move-object/from16 v0, v23 */
/* move/from16 v1, v24 */
(( android.content.res.AssetManager ) v0 ).open ( v8, v1 ); // invoke-virtual {v0, v8, v1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;I)Ljava/io/InputStream;
/* :try_end_3 */
/* .catch Ljava/lang/Exception; {:try_start_3 ..:try_end_3} :catch_6 */
/* .line 728 */
} // :cond_1
} // :goto_2
/* if-nez v20, :cond_2 */
/* .line 729 */
try { // :try_start_4
final String v8 = "Default.png"; // const-string v8, "Default.png"
/* :try_end_4 */
/* .catch Ljava/lang/Exception; {:try_start_4 ..:try_end_4} :catch_4 */
/* .line 730 */
try { // :try_start_5
/* invoke-virtual/range {p0 ..p0}, Lcom/ansca/corona/CoronaActivity;->getAssets()Landroid/content/res/AssetManager; */
/* const/16 v24, 0x3 */
/* move-object/from16 v0, v23 */
/* move/from16 v1, v24 */
(( android.content.res.AssetManager ) v0 ).open ( v8, v1 ); // invoke-virtual {v0, v8, v1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;I)Ljava/io/InputStream;
/* :try_end_5 */
/* .catch Ljava/lang/Exception; {:try_start_5 ..:try_end_5} :catch_5 */
/* .line 732 */
} // :cond_2
} // :goto_3
/* packed-switch v4, :pswitch_data_1 */
/* .line 746 */
} // .end local v14 # "longestScreenLength":I
} // :cond_3
} // :goto_4
/* if-nez v20, :cond_5 */
/* .line 831 */
} // :goto_5
return;
/* .line 687 */
} // :cond_4
try { // :try_start_6
v14 = (( android.view.Display ) v6 ).getWidth ( ); // invoke-virtual {v6}, Landroid/view/Display;->getWidth()I
/* .line 691 */
/* .restart local v14 # "longestScreenLength":I */
/* :pswitch_0 */
final String v8 = "Default-LandscapeRight.png"; // const-string v8, "Default-LandscapeRight.png"
/* :try_end_6 */
/* .catch Ljava/lang/Exception; {:try_start_6 ..:try_end_6} :catch_4 */
/* .line 692 */
try { // :try_start_7
/* invoke-virtual/range {p0 ..p0}, Lcom/ansca/corona/CoronaActivity;->getAssets()Landroid/content/res/AssetManager; */
/* const/16 v24, 0x3 */
/* move-object/from16 v0, v23 */
/* move/from16 v1, v24 */
(( android.content.res.AssetManager ) v0 ).open ( v8, v1 ); // invoke-virtual {v0, v8, v1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;I)Ljava/io/InputStream;
/* :try_end_7 */
/* .catch Ljava/lang/Exception; {:try_start_7 ..:try_end_7} :catch_d */
/* .line 693 */
} // :goto_6
/* if-nez v20, :cond_0 */
/* .line 694 */
try { // :try_start_8
final String v8 = "Default-Landscape.png"; // const-string v8, "Default-Landscape.png"
/* :try_end_8 */
/* .catch Ljava/lang/Exception; {:try_start_8 ..:try_end_8} :catch_4 */
/* .line 695 */
try { // :try_start_9
/* invoke-virtual/range {p0 ..p0}, Lcom/ansca/corona/CoronaActivity;->getAssets()Landroid/content/res/AssetManager; */
/* const/16 v24, 0x3 */
/* move-object/from16 v0, v23 */
/* move/from16 v1, v24 */
(( android.content.res.AssetManager ) v0 ).open ( v8, v1 ); // invoke-virtual {v0, v8, v1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;I)Ljava/io/InputStream;
/* :try_end_9 */
/* .catch Ljava/lang/Exception; {:try_start_9 ..:try_end_9} :catch_c */
/* .line 699 */
/* :pswitch_1 */
try { // :try_start_a
final String v8 = "Default-LandscapeLeft.png"; // const-string v8, "Default-LandscapeLeft.png"
/* :try_end_a */
/* .catch Ljava/lang/Exception; {:try_start_a ..:try_end_a} :catch_4 */
/* .line 700 */
try { // :try_start_b
/* invoke-virtual/range {p0 ..p0}, Lcom/ansca/corona/CoronaActivity;->getAssets()Landroid/content/res/AssetManager; */
/* const/16 v24, 0x3 */
/* move-object/from16 v0, v23 */
/* move/from16 v1, v24 */
(( android.content.res.AssetManager ) v0 ).open ( v8, v1 ); // invoke-virtual {v0, v8, v1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;I)Ljava/io/InputStream;
/* :try_end_b */
/* .catch Ljava/lang/Exception; {:try_start_b ..:try_end_b} :catch_b */
/* .line 701 */
} // :goto_7
/* if-nez v20, :cond_0 */
/* .line 702 */
try { // :try_start_c
final String v8 = "Default-Landscape.png"; // const-string v8, "Default-Landscape.png"
/* :try_end_c */
/* .catch Ljava/lang/Exception; {:try_start_c ..:try_end_c} :catch_4 */
/* .line 703 */
try { // :try_start_d
/* invoke-virtual/range {p0 ..p0}, Lcom/ansca/corona/CoronaActivity;->getAssets()Landroid/content/res/AssetManager; */
/* const/16 v24, 0x3 */
/* move-object/from16 v0, v23 */
/* move/from16 v1, v24 */
(( android.content.res.AssetManager ) v0 ).open ( v8, v1 ); // invoke-virtual {v0, v8, v1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;I)Ljava/io/InputStream;
/* :try_end_d */
/* .catch Ljava/lang/Exception; {:try_start_d ..:try_end_d} :catch_a */
/* .line 707 */
/* :pswitch_2 */
try { // :try_start_e
final String v8 = "Default-PortraitUpsideDown.png"; // const-string v8, "Default-PortraitUpsideDown.png"
/* :try_end_e */
/* .catch Ljava/lang/Exception; {:try_start_e ..:try_end_e} :catch_4 */
/* .line 708 */
try { // :try_start_f
/* invoke-virtual/range {p0 ..p0}, Lcom/ansca/corona/CoronaActivity;->getAssets()Landroid/content/res/AssetManager; */
/* const/16 v24, 0x3 */
/* move-object/from16 v0, v23 */
/* move/from16 v1, v24 */
(( android.content.res.AssetManager ) v0 ).open ( v8, v1 ); // invoke-virtual {v0, v8, v1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;I)Ljava/io/InputStream;
/* :try_end_f */
/* .catch Ljava/lang/Exception; {:try_start_f ..:try_end_f} :catch_9 */
/* .line 709 */
} // :goto_8
/* if-nez v20, :cond_0 */
/* .line 710 */
try { // :try_start_10
final String v8 = "Default-Portrait.png"; // const-string v8, "Default-Portrait.png"
/* :try_end_10 */
/* .catch Ljava/lang/Exception; {:try_start_10 ..:try_end_10} :catch_4 */
/* .line 711 */
try { // :try_start_11
/* invoke-virtual/range {p0 ..p0}, Lcom/ansca/corona/CoronaActivity;->getAssets()Landroid/content/res/AssetManager; */
/* const/16 v24, 0x3 */
/* move-object/from16 v0, v23 */
/* move/from16 v1, v24 */
(( android.content.res.AssetManager ) v0 ).open ( v8, v1 ); // invoke-virtual {v0, v8, v1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;I)Ljava/io/InputStream;
/* :try_end_11 */
/* .catch Ljava/lang/Exception; {:try_start_11 ..:try_end_11} :catch_8 */
/* goto/16 :goto_1 */
/* .line 734 */
/* :pswitch_3 */
/* const/16 v10, 0x10e */
/* .line 735 */
/* .line 737 */
/* :pswitch_4 */
/* const/16 v10, 0x5a */
/* .line 738 */
/* .line 740 */
/* :pswitch_5 */
/* const/16 v10, 0xb4 */
/* .line 752 */
} // .end local v14 # "longestScreenLength":I
} // :cond_5
int v5 = 0; // const/4 v5, 0x0
/* .line 753 */
/* .local v5, "bitmap":Landroid/graphics/Bitmap; */
/* new-instance v19, Landroid/graphics/BitmapFactory$Options; */
/* invoke-direct/range {v19 ..v19}, Landroid/graphics/BitmapFactory$Options;-><init>()V */
/* .line 755 */
/* .local v19, "options":Landroid/graphics/BitmapFactory$Options; */
try { // :try_start_12
v23 = android.graphics.Bitmap$Config.ARGB_8888;
/* move-object/from16 v0, v23 */
/* move-object/from16 v1, v19 */
this.inPreferredConfig = v0;
/* .line 756 */
/* const/16 v23, 0x0 */
/* move-object/from16 v0, v20 */
/* move-object/from16 v1, v23 */
/* move-object/from16 v2, v19 */
android.graphics.BitmapFactory .decodeStream ( v0,v1,v2 );
/* :try_end_12 */
/* .catch Ljava/lang/OutOfMemoryError; {:try_start_12 ..:try_end_12} :catch_0 */
/* .catch Ljava/lang/Exception; {:try_start_12 ..:try_end_12} :catch_2 */
/* .line 779 */
} // :goto_9
try { // :try_start_13
/* invoke-virtual/range {v20 ..v20}, Ljava/io/InputStream;->close()V */
/* :try_end_13 */
/* .catch Ljava/lang/Exception; {:try_start_13 ..:try_end_13} :catch_3 */
/* .line 783 */
} // :goto_a
/* if-nez v5, :cond_7 */
/* .line 784 */
final String v23 = "Corona"; // const-string v23, "Corona"
/* new-instance v24, Ljava/lang/StringBuilder; */
/* invoke-direct/range {v24 ..v24}, Ljava/lang/StringBuilder;-><init>()V */
final String v25 = "Unable to load file \'"; // const-string v25, "Unable to load file \'"
/* invoke-virtual/range {v24 ..v25}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
/* move-object/from16 v0, v24 */
(( java.lang.StringBuilder ) v0 ).append ( v8 ); // invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v25 = "\' as an image file for the splash screen."; // const-string v25, "\' as an image file for the splash screen."
/* invoke-virtual/range {v24 ..v25}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
/* invoke-virtual/range {v24 ..v24}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String; */
/* invoke-static/range {v23 ..v24}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I */
/* goto/16 :goto_5 */
/* .line 758 */
/* :catch_0 */
/* move-exception v16 */
/* .line 762 */
/* .local v16, "memoryException":Ljava/lang/OutOfMemoryError; */
try { // :try_start_14
/* move-object/from16 v0, v19 */
v0 = this.inPreferredConfig;
/* move-object/from16 v23, v0 */
v24 = android.graphics.Bitmap$Config.ARGB_8888;
/* move-object/from16 v0, v23 */
/* move-object/from16 v1, v24 */
/* if-ne v0, v1, :cond_6 */
/* .line 763 */
final String v23 = "Corona"; // const-string v23, "Corona"
/* new-instance v24, Ljava/lang/StringBuilder; */
/* invoke-direct/range {v24 ..v24}, Ljava/lang/StringBuilder;-><init>()V */
final String v25 = "Failed to load splash screen image file \'"; // const-string v25, "Failed to load splash screen image file \'"
/* invoke-virtual/range {v24 ..v25}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
/* move-object/from16 v0, v24 */
(( java.lang.StringBuilder ) v0 ).append ( v8 ); // invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v25 = "\' as a 32-bit image.Reducing the image quality to 16-bit."; // const-string v25, "\' as a 32-bit image.Reducing the image quality to 16-bit."
/* invoke-virtual/range {v24 ..v25}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
/* invoke-virtual/range {v24 ..v24}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String; */
/* invoke-static/range {v23 ..v24}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I */
/* .line 765 */
v23 = android.graphics.Bitmap$Config.RGB_565;
/* move-object/from16 v0, v23 */
/* move-object/from16 v1, v19 */
this.inPreferredConfig = v0;
/* .line 766 */
/* const/16 v23, 0x0 */
/* move-object/from16 v0, v20 */
/* move-object/from16 v1, v23 */
/* move-object/from16 v2, v19 */
android.graphics.BitmapFactory .decodeStream ( v0,v1,v2 );
/* .line 769 */
} // :cond_6
/* throw v16 */
/* :try_end_14 */
/* .catch Ljava/lang/Exception; {:try_start_14 ..:try_end_14} :catch_1 */
/* .line 772 */
/* :catch_1 */
/* move-exception v7 */
/* .line 773 */
/* .local v7, "ex":Ljava/lang/Exception; */
(( java.lang.Exception ) v7 ).printStackTrace ( ); // invoke-virtual {v7}, Ljava/lang/Exception;->printStackTrace()V
/* .line 776 */
} // .end local v7 # "ex":Ljava/lang/Exception;
} // .end local v16 # "memoryException":Ljava/lang/OutOfMemoryError;
/* :catch_2 */
/* move-exception v7 */
/* .line 777 */
/* .restart local v7 # "ex":Ljava/lang/Exception; */
(( java.lang.Exception ) v7 ).printStackTrace ( ); // invoke-virtual {v7}, Ljava/lang/Exception;->printStackTrace()V
/* .line 780 */
} // .end local v7 # "ex":Ljava/lang/Exception;
/* :catch_3 */
/* move-exception v7 */
/* .line 781 */
/* .restart local v7 # "ex":Ljava/lang/Exception; */
(( java.lang.Exception ) v7 ).printStackTrace ( ); // invoke-virtual {v7}, Ljava/lang/Exception;->printStackTrace()V
/* .line 789 */
} // .end local v7 # "ex":Ljava/lang/Exception;
} // :cond_7
/* move-object/from16 v0, p0 */
v0 = this.fSplashScreenView;
/* move-object/from16 v23, v0 */
/* if-nez v23, :cond_8 */
/* .line 791 */
/* new-instance v23, Landroid/widget/ImageView; */
/* move-object/from16 v0, v23 */
/* move-object/from16 v1, p0 */
/* invoke-direct {v0, v1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V */
/* move-object/from16 v0, v23 */
/* move-object/from16 v1, p0 */
this.fSplashScreenView = v0;
/* .line 792 */
/* move-object/from16 v0, p0 */
v0 = this.fSplashScreenView;
/* move-object/from16 v23, v0 */
/* const/high16 v24, -0x1000000 */
/* invoke-virtual/range {v23 ..v24}, Landroid/widget/ImageView;->setBackgroundColor(I)V */
/* .line 794 */
/* new-instance v12, Landroid/widget/FrameLayout$LayoutParams; */
/* const/16 v23, -0x1 */
/* const/16 v24, -0x1 */
/* const/16 v25, 0x11 */
/* move/from16 v0, v23 */
/* move/from16 v1, v24 */
/* move/from16 v2, v25 */
/* invoke-direct {v12, v0, v1, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V */
/* .line 798 */
/* .local v12, "layoutParams":Landroid/widget/FrameLayout$LayoutParams; */
com.ansca.corona.ViewManager .getViewManager ( );
/* invoke-virtual/range {v23 ..v23}, Lcom/ansca/corona/ViewManager;->getContentView()Landroid/view/ViewGroup; */
/* move-object/from16 v0, p0 */
v0 = this.fSplashScreenView;
/* move-object/from16 v24, v0 */
/* move-object/from16 v0, v23 */
/* move-object/from16 v1, v24 */
(( android.view.ViewGroup ) v0 ).addView ( v1, v12 ); // invoke-virtual {v0, v1, v12}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
/* .line 800 */
} // .end local v12 # "layoutParams":Landroid/widget/FrameLayout$LayoutParams;
} // :cond_8
/* move-object/from16 v0, p0 */
v0 = this.fSplashScreenView;
/* move-object/from16 v23, v0 */
/* invoke-virtual/range {v23 ..v23}, Landroid/widget/ImageView;->getImageMatrix()Landroid/graphics/Matrix; */
if ( v23 != null) { // if-eqz v23, :cond_a
/* if-nez v10, :cond_a */
/* .line 802 */
/* move-object/from16 v0, p0 */
v0 = this.fSplashScreenView;
/* move-object/from16 v23, v0 */
/* invoke-virtual/range {v23 ..v23}, Landroid/widget/ImageView;->getImageMatrix()Landroid/graphics/Matrix; */
/* invoke-virtual/range {v23 ..v23}, Landroid/graphics/Matrix;->reset()V */
/* .line 830 */
} // :cond_9
} // :goto_b
/* move-object/from16 v0, p0 */
v0 = this.fSplashScreenView;
/* move-object/from16 v23, v0 */
/* move-object/from16 v0, v23 */
(( android.widget.ImageView ) v0 ).setImageBitmap ( v5 ); // invoke-virtual {v0, v5}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V
/* goto/16 :goto_5 */
/* .line 804 */
} // :cond_a
if ( v10 != null) { // if-eqz v10, :cond_9
/* .line 808 */
if ( v10 != null) { // if-eqz v10, :cond_b
/* const/16 v23, 0xb4 */
/* move/from16 v0, v23 */
/* if-ne v10, v0, :cond_c */
/* .line 809 */
} // :cond_b
v23 = (( android.graphics.Bitmap ) v5 ).getWidth ( ); // invoke-virtual {v5}, Landroid/graphics/Bitmap;->getWidth()I
/* move/from16 v0, v23 */
/* int-to-float v11, v0 */
/* .line 810 */
/* .local v11, "imageWidth":F */
v23 = (( android.graphics.Bitmap ) v5 ).getHeight ( ); // invoke-virtual {v5}, Landroid/graphics/Bitmap;->getHeight()I
/* move/from16 v0, v23 */
/* int-to-float v9, v0 */
/* .line 816 */
/* .local v9, "imageHeight":F */
} // :goto_c
v23 = (( android.view.Display ) v6 ).getWidth ( ); // invoke-virtual {v6}, Landroid/view/Display;->getWidth()I
/* move/from16 v0, v23 */
/* int-to-float v0, v0 */
/* move/from16 v23, v0 */
/* div-float v21, v23, v11 */
/* .line 817 */
/* .local v21, "xScale":F */
v23 = (( android.view.Display ) v6 ).getHeight ( ); // invoke-virtual {v6}, Landroid/view/Display;->getHeight()I
/* move/from16 v0, v23 */
/* int-to-float v0, v0 */
/* move/from16 v23, v0 */
/* div-float v22, v23, v9 */
/* .line 818 */
/* .local v22, "yScale":F */
v13 = /* invoke-static/range {v21 ..v22}, Ljava/lang/Math;->min(FF)F */
/* .line 819 */
/* .local v13, "letterboxScale":F */
/* new-instance v15, Landroid/graphics/Matrix; */
/* invoke-direct {v15}, Landroid/graphics/Matrix;-><init>()V */
/* .line 820 */
/* .local v15, "matrix":Landroid/graphics/Matrix; */
v23 = (( android.graphics.Bitmap ) v5 ).getWidth ( ); // invoke-virtual {v5}, Landroid/graphics/Bitmap;->getWidth()I
/* move/from16 v0, v23 */
/* int-to-float v0, v0 */
/* move/from16 v23, v0 */
/* const/high16 v24, 0x40000000 # 2.0f */
/* div-float v23, v23, v24 */
/* move/from16 v0, v23 */
/* neg-float v0, v0 */
/* move/from16 v23, v0 */
v24 = (( android.graphics.Bitmap ) v5 ).getHeight ( ); // invoke-virtual {v5}, Landroid/graphics/Bitmap;->getHeight()I
/* move/from16 v0, v24 */
/* int-to-float v0, v0 */
/* move/from16 v24, v0 */
/* const/high16 v25, 0x40000000 # 2.0f */
/* div-float v24, v24, v25 */
/* move/from16 v0, v24 */
/* neg-float v0, v0 */
/* move/from16 v24, v0 */
/* move/from16 v0, v23 */
/* move/from16 v1, v24 */
(( android.graphics.Matrix ) v15 ).postTranslate ( v0, v1 ); // invoke-virtual {v15, v0, v1}, Landroid/graphics/Matrix;->postTranslate(FF)Z
/* .line 821 */
/* int-to-float v0, v10 */
/* move/from16 v23, v0 */
/* move/from16 v0, v23 */
(( android.graphics.Matrix ) v15 ).postRotate ( v0 ); // invoke-virtual {v15, v0}, Landroid/graphics/Matrix;->postRotate(F)Z
/* .line 822 */
/* const/high16 v23, 0x40000000 # 2.0f */
/* div-float v23, v11, v23 */
/* const/high16 v24, 0x40000000 # 2.0f */
/* div-float v24, v9, v24 */
/* move/from16 v0, v23 */
/* move/from16 v1, v24 */
(( android.graphics.Matrix ) v15 ).postTranslate ( v0, v1 ); // invoke-virtual {v15, v0, v1}, Landroid/graphics/Matrix;->postTranslate(FF)Z
/* .line 823 */
(( android.graphics.Matrix ) v15 ).postScale ( v13, v13 ); // invoke-virtual {v15, v13, v13}, Landroid/graphics/Matrix;->postScale(FF)Z
/* .line 824 */
v23 = (( android.view.Display ) v6 ).getWidth ( ); // invoke-virtual {v6}, Landroid/view/Display;->getWidth()I
/* move/from16 v0, v23 */
/* int-to-float v0, v0 */
/* move/from16 v23, v0 */
/* mul-float v24, v11, v13 */
/* sub-float v23, v23, v24 */
/* const/high16 v24, 0x40000000 # 2.0f */
/* div-float v17, v23, v24 */
/* .line 825 */
/* .local v17, "offsetX":F */
v23 = (( android.view.Display ) v6 ).getHeight ( ); // invoke-virtual {v6}, Landroid/view/Display;->getHeight()I
/* move/from16 v0, v23 */
/* int-to-float v0, v0 */
/* move/from16 v23, v0 */
/* mul-float v24, v9, v13 */
/* sub-float v23, v23, v24 */
/* const/high16 v24, 0x40000000 # 2.0f */
/* div-float v18, v23, v24 */
/* .line 826 */
/* .local v18, "offsetY":F */
/* move/from16 v0, v17 */
/* move/from16 v1, v18 */
(( android.graphics.Matrix ) v15 ).postTranslate ( v0, v1 ); // invoke-virtual {v15, v0, v1}, Landroid/graphics/Matrix;->postTranslate(FF)Z
/* .line 827 */
/* move-object/from16 v0, p0 */
v0 = this.fSplashScreenView;
/* move-object/from16 v23, v0 */
v24 = android.widget.ImageView$ScaleType.MATRIX;
/* invoke-virtual/range {v23 ..v24}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V */
/* .line 828 */
/* move-object/from16 v0, p0 */
v0 = this.fSplashScreenView;
/* move-object/from16 v23, v0 */
/* move-object/from16 v0, v23 */
(( android.widget.ImageView ) v0 ).setImageMatrix ( v15 ); // invoke-virtual {v0, v15}, Landroid/widget/ImageView;->setImageMatrix(Landroid/graphics/Matrix;)V
/* goto/16 :goto_b */
/* .line 813 */
} // .end local v9 # "imageHeight":F
} // .end local v11 # "imageWidth":F
} // .end local v13 # "letterboxScale":F
} // .end local v15 # "matrix":Landroid/graphics/Matrix;
} // .end local v17 # "offsetX":F
} // .end local v18 # "offsetY":F
} // .end local v21 # "xScale":F
} // .end local v22 # "yScale":F
} // :cond_c
v23 = (( android.graphics.Bitmap ) v5 ).getHeight ( ); // invoke-virtual {v5}, Landroid/graphics/Bitmap;->getHeight()I
/* move/from16 v0, v23 */
/* int-to-float v11, v0 */
/* .line 814 */
/* .restart local v11 # "imageWidth":F */
v23 = (( android.graphics.Bitmap ) v5 ).getWidth ( ); // invoke-virtual {v5}, Landroid/graphics/Bitmap;->getWidth()I
/* move/from16 v0, v23 */
/* int-to-float v9, v0 */
/* .restart local v9 # "imageHeight":F */
/* goto/16 :goto_c */
/* .line 745 */
} // .end local v5 # "bitmap":Landroid/graphics/Bitmap;
} // .end local v9 # "imageHeight":F
} // .end local v11 # "imageWidth":F
} // .end local v19 # "options":Landroid/graphics/BitmapFactory$Options;
/* :catch_4 */
/* move-exception v23 */
/* goto/16 :goto_4 */
/* .line 730 */
/* .restart local v14 # "longestScreenLength":I */
/* :catch_5 */
/* move-exception v23 */
/* goto/16 :goto_3 */
/* .line 726 */
/* :catch_6 */
/* move-exception v23 */
/* goto/16 :goto_2 */
/* .line 717 */
/* :catch_7 */
/* move-exception v23 */
/* goto/16 :goto_1 */
/* .line 711 */
/* :catch_8 */
/* move-exception v23 */
/* goto/16 :goto_1 */
/* .line 708 */
/* :catch_9 */
/* move-exception v23 */
/* goto/16 :goto_8 */
/* .line 703 */
/* :catch_a */
/* move-exception v23 */
/* goto/16 :goto_1 */
/* .line 700 */
/* :catch_b */
/* move-exception v23 */
/* goto/16 :goto_7 */
/* .line 695 */
/* :catch_c */
/* move-exception v23 */
/* goto/16 :goto_1 */
/* .line 692 */
/* :catch_d */
/* move-exception v23 */
/* goto/16 :goto_6 */
/* .line 689 */
/* :pswitch_data_0 */
/* .packed-switch 0x2 */
/* :pswitch_0 */
/* :pswitch_2 */
/* :pswitch_1 */
} // .end packed-switch
/* .line 732 */
/* :pswitch_data_1 */
/* .packed-switch 0x2 */
/* :pswitch_3 */
/* :pswitch_5 */
/* :pswitch_4 */
} // .end packed-switch
} // .end method
public Boolean supportsOrientationChanges ( ) {
/* .locals 2 */
/* .prologue */
/* .line 210 */
v1 = (( com.ansca.corona.CoronaActivity ) p0 ).getRequestedOrientation ( ); // invoke-virtual {p0}, Lcom/ansca/corona/CoronaActivity;->getRequestedOrientation()I
/* sparse-switch v1, :sswitch_data_0 */
/* .line 219 */
int v0 = 0; // const/4 v0, 0x0
/* .line 222 */
/* .local v0, "supportsOrientationChanges":Z */
} // :goto_0
/* .line 216 */
} // .end local v0 # "supportsOrientationChanges":Z
/* :sswitch_0 */
int v0 = 1; // const/4 v0, 0x1
/* .line 217 */
/* .restart local v0 # "supportsOrientationChanges":Z */
/* .line 210 */
/* nop */
/* :sswitch_data_0 */
/* .sparse-switch */
/* -0x1 -> :sswitch_0 */
/* 0x4 -> :sswitch_0 */
/* 0x6 -> :sswitch_0 */
/* 0x7 -> :sswitch_0 */
/* 0xa -> :sswitch_0 */
} // .end sparse-switch
} // .end method
