public class de.nurogames.android.ticb.base.tinysanta extends android.app.Activity implements android.hardware.SensorEventListener {
	 /* .source "tinysanta.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lde/nurogames/android/ticb/base/tinysanta$CatalogAdapter;, */
	 /* Lde/nurogames/android/ticb/base/tinysanta$CatalogEntry;, */
	 /* Lde/nurogames/android/ticb/base/tinysanta$Managed;, */
	 /* Lde/nurogames/android/ticb/base/tinysanta$TinyBeePurchaseObserver; */
	 /* } */
} // .end annotation
/* # static fields */
public static final de.nurogames.android.ticb.base.tinysanta$CatalogEntry CATALOG;
private static final java.lang.String DB_INITIALIZED;
public static java.lang.String INFO_DEVICE;
public static java.lang.String INFO_MODEL;
public static Integer INFO_OS_API_NR;
public static java.lang.String INFO_OS_VERSION;
public static Boolean NO_NETCONNCETION_AVAIL;
public static Boolean NO_SDCARD_AVAIL;
private static final java.lang.String TAG;
public static de.nurogames.android.ticb.base.core.FlurryAnalyticsManager analytics;
public static de.nurogames.android.ticb.base.CBMngr chartboost;
public static android.content.Context cntx;
public static Integer currentViewChild;
public static de.nurogames.android.ticb.base.core.DataManager data_mngr;
public static Boolean device_is_upside_down;
public static de.nurogames.android.ticb.base.core.systemDiagnostic diag;
public static android.view.animation.Animation fade_in;
public static android.view.animation.Animation fade_out;
public static android.view.animation.Animation fade_splash_in;
public static android.widget.ViewFlipper flipper;
public static de.nurogames.android.ticb.base.core.InAppMngr inAppMngr;
public static Boolean isHellowinsGame;
public static java.util.Vector loaded_purchase_items;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Vector", */
/* "<", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
private static de.nurogames.android.ticb.base.BillingService mBillingService;
public static java.util.Timer market_timer;
public static android.os.Handler sHandler;
public static final android.util.DisplayMetrics sMetrics;
public static android.app.Activity sTinyBee;
public static de.nurogames.android.ticb.base.core.ShopMngr shopMngr;
public static Boolean showHellowinsDialog;
public static de.nurogames.android.ticb.base.core.UpdateMngr tkom_update_mngr;
public static android.os.Vibrator vibrator;
public static Boolean wasHellowinsSessionRunnning;
public static android.view.Window win;
/* # instance fields */
private Integer APP_ID;
private Integer APP_SECRET;
public Integer ROTATED_UPSIDEDOWN;
private android.hardware.Sensor mAccelerometer;
private de.nurogames.android.ticb.base.tinysanta$CatalogAdapter mCatalogAdapter;
private android.os.Handler mHandler;
private java.util.Set mOwnedItems;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Set", */
/* "<", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
private android.database.Cursor mOwnedItemsCursor;
private de.nurogames.android.ticb.base.PurchaseDatabase mPurchaseDatabase;
private android.hardware.SensorManager mSensorManager;
private de.nurogames.android.ticb.base.tinysanta$TinyBeePurchaseObserver mTinyBeePurchaseObserver;
android.os.PowerManager$WakeLock wl;
/* # direct methods */
static de.nurogames.android.ticb.base.tinysanta ( ) {
/* .locals 6 */
/* .prologue */
int v5 = 0; // const/4 v5, 0x0
/* .line 201 */
de.nurogames.android.ticb.base.tinysanta.showHellowinsDialog = (v5!= 0);
/* .line 202 */
de.nurogames.android.ticb.base.tinysanta.isHellowinsGame = (v5!= 0);
/* .line 203 */
de.nurogames.android.ticb.base.tinysanta.wasHellowinsSessionRunnning = (v5!= 0);
/* .line 206 */
/* new-instance v0, Landroid/util/DisplayMetrics; */
/* invoke-direct {v0}, Landroid/util/DisplayMetrics;-><init>()V */
/* .line 213 */
int v0 = -1; // const/4 v0, -0x1
/* .line 243 */
de.nurogames.android.ticb.base.tinysanta.NO_SDCARD_AVAIL = (v5!= 0);
/* .line 244 */
de.nurogames.android.ticb.base.tinysanta.NO_NETCONNCETION_AVAIL = (v5!= 0);
/* .line 246 */
/* new-instance v0, Landroid/os/Handler; */
/* invoke-direct {v0}, Landroid/os/Handler;-><init>()V */
/* .line 253 */
final String v0 = "0.0"; // const-string v0, "0.0"
/* .line 254 */
/* .line 260 */
de.nurogames.android.ticb.base.tinysanta.device_is_upside_down = (v5!= 0);
/* .line 264 */
/* new-instance v0, Ljava/util/Timer; */
/* invoke-direct {v0}, Ljava/util/Timer;-><init>()V */
/* .line 297 */
/* new-instance v0, Ljava/util/Vector; */
/* invoke-direct {v0}, Ljava/util/Vector;-><init>()V */
/* .line 361 */
int v0 = 6; // const/4 v0, 0x6
/* new-array v0, v0, [Lde/nurogames/android/ticb/base/tinysanta$CatalogEntry; */
/* .line 363 */
/* new-instance v1, Lde/nurogames/android/ticb/base/tinysanta$CatalogEntry; */
final String v2 = "tiger_bee"; // const-string v2, "tiger_bee"
v4 = de.nurogames.android.ticb.base.tinysanta$Managed.MANAGED;
/* invoke-direct {v1, v2, v3, v4}, Lde/nurogames/android/ticb/base/tinysanta$CatalogEntry;-><init>(Ljava/lang/String;ILde/nurogames/android/ticb/base/tinysanta$Managed;)V */
/* aput-object v1, v0, v5 */
int v1 = 1; // const/4 v1, 0x1
/* .line 364 */
/* new-instance v2, Lde/nurogames/android/ticb/base/tinysanta$CatalogEntry; */
final String v3 = "ladybug_bee"; // const-string v3, "ladybug_bee"
v5 = de.nurogames.android.ticb.base.tinysanta$Managed.MANAGED;
/* invoke-direct {v2, v3, v4, v5}, Lde/nurogames/android/ticb/base/tinysanta$CatalogEntry;-><init>(Ljava/lang/String;ILde/nurogames/android/ticb/base/tinysanta$Managed;)V */
/* aput-object v2, v0, v1 */
int v1 = 2; // const/4 v1, 0x2
/* .line 365 */
/* new-instance v2, Lde/nurogames/android/ticb/base/tinysanta$CatalogEntry; */
final String v3 = "golden_bee"; // const-string v3, "golden_bee"
v5 = de.nurogames.android.ticb.base.tinysanta$Managed.MANAGED;
/* invoke-direct {v2, v3, v4, v5}, Lde/nurogames/android/ticb/base/tinysanta$CatalogEntry;-><init>(Ljava/lang/String;ILde/nurogames/android/ticb/base/tinysanta$Managed;)V */
/* aput-object v2, v0, v1 */
int v1 = 3; // const/4 v1, 0x3
/* .line 366 */
/* new-instance v2, Lde/nurogames/android/ticb/base/tinysanta$CatalogEntry; */
final String v3 = "character_pack"; // const-string v3, "character_pack"
v5 = de.nurogames.android.ticb.base.tinysanta$Managed.MANAGED;
/* invoke-direct {v2, v3, v4, v5}, Lde/nurogames/android/ticb/base/tinysanta$CatalogEntry;-><init>(Ljava/lang/String;ILde/nurogames/android/ticb/base/tinysanta$Managed;)V */
/* aput-object v2, v0, v1 */
int v1 = 4; // const/4 v1, 0x4
/* .line 367 */
/* new-instance v2, Lde/nurogames/android/ticb/base/tinysanta$CatalogEntry; */
final String v3 = "level_pack"; // const-string v3, "level_pack"
v5 = de.nurogames.android.ticb.base.tinysanta$Managed.MANAGED;
/* invoke-direct {v2, v3, v4, v5}, Lde/nurogames/android/ticb/base/tinysanta$CatalogEntry;-><init>(Ljava/lang/String;ILde/nurogames/android/ticb/base/tinysanta$Managed;)V */
/* aput-object v2, v0, v1 */
int v1 = 5; // const/4 v1, 0x5
/* .line 368 */
/* new-instance v2, Lde/nurogames/android/ticb/base/tinysanta$CatalogEntry; */
final String v3 = "level_and_character_pack"; // const-string v3, "level_and_character_pack"
v5 = de.nurogames.android.ticb.base.tinysanta$Managed.MANAGED;
/* invoke-direct {v2, v3, v4, v5}, Lde/nurogames/android/ticb/base/tinysanta$CatalogEntry;-><init>(Ljava/lang/String;ILde/nurogames/android/ticb/base/tinysanta$Managed;)V */
/* aput-object v2, v0, v1 */
/* .line 361 */
/* .line 370 */
return;
} // .end method
public de.nurogames.android.ticb.base.tinysanta ( ) {
/* .locals 1 */
/* .prologue */
/* .line 199 */
/* invoke-direct {p0}, Landroid/app/Activity;-><init>()V */
/* .line 239 */
int v0 = 1; // const/4 v0, 0x1
/* iput v0, p0, Lde/nurogames/android/ticb/base/tinysanta;->APP_ID:I */
/* .line 240 */
int v0 = 2; // const/4 v0, 0x2
/* iput v0, p0, Lde/nurogames/android/ticb/base/tinysanta;->APP_SECRET:I */
/* .line 259 */
/* const/16 v0, -0x28 */
/* iput v0, p0, Lde/nurogames/android/ticb/base/tinysanta;->ROTATED_UPSIDEDOWN:I */
/* .line 298 */
/* new-instance v0, Ljava/util/HashSet; */
/* invoke-direct {v0}, Ljava/util/HashSet;-><init>()V */
this.mOwnedItems = v0;
/* .line 199 */
return;
} // .end method
static void access$0 ( de.nurogames.android.ticb.base.tinysanta p0 ) { //synthethic
/* .locals 0 */
/* .prologue */
/* .line 1065 */
/* invoke-direct {p0}, Lde/nurogames/android/ticb/base/tinysanta;->restoreDatabase()V */
return;
} // .end method
static java.util.Set access$1 ( de.nurogames.android.ticb.base.tinysanta p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 298 */
v0 = this.mOwnedItems;
} // .end method
static de.nurogames.android.ticb.base.tinysanta$CatalogAdapter access$2 ( de.nurogames.android.ticb.base.tinysanta p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 301 */
v0 = this.mCatalogAdapter;
} // .end method
static android.database.Cursor access$3 ( de.nurogames.android.ticb.base.tinysanta p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 299 */
v0 = this.mOwnedItemsCursor;
} // .end method
static void access$4 ( de.nurogames.android.ticb.base.tinysanta p0 ) { //synthethic
/* .locals 0 */
/* .prologue */
/* .line 1094 */
/* invoke-direct {p0}, Lde/nurogames/android/ticb/base/tinysanta;->initializeOwnedItems()V */
return;
} // .end method
static void access$5 ( de.nurogames.android.ticb.base.tinysanta p0 ) { //synthethic
/* .locals 0 */
/* .prologue */
/* .line 1208 */
/* invoke-direct {p0}, Lde/nurogames/android/ticb/base/tinysanta;->doInitializeOwnedItems()V */
return;
} // .end method
static void access$6 ( de.nurogames.android.ticb.base.tinysanta p0 ) { //synthethic
/* .locals 0 */
/* .prologue */
/* .line 1242 */
/* invoke-direct {p0}, Lde/nurogames/android/ticb/base/tinysanta;->unlockGoogleGamePurchses()V */
return;
} // .end method
public static void buyPurchaseItem ( java.lang.String p0, java.lang.String p1, Boolean p2 ) {
/* .locals 4 */
/* .param p0, "item_name" # Ljava/lang/String; */
/* .param p1, "item_sku" # Ljava/lang/String; */
/* .param p2, "isSubscription" # Z */
/* .prologue */
/* .line 349 */
int v0 = 0; // const/4 v0, 0x0
/* .line 351 */
/* .local v0, "mPayloadContents":Ljava/lang/String; */
/* if-nez p2, :cond_0 */
v1 = de.nurogames.android.ticb.base.tinysanta.mBillingService;
final String v2 = "inapp"; // const-string v2, "inapp"
v1 = (( de.nurogames.android.ticb.base.BillingService ) v1 ).requestPurchase ( p1, v2, v0 ); // invoke-virtual {v1, p1, v2, v0}, Lde/nurogames/android/ticb/base/BillingService;->requestPurchase(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
/* if-nez v1, :cond_0 */
/* .line 353 */
v1 = de.nurogames.android.ticb.base.tinysanta.cntx;
final String v2 = "DIALOG_BILLING_NOT_SUPPORTED_ID"; // const-string v2, "DIALOG_BILLING_NOT_SUPPORTED_ID"
int v3 = 1; // const/4 v3, 0x1
android.widget.Toast .makeText ( v1,v2,v3 );
(( android.widget.Toast ) v1 ).show ( ); // invoke-virtual {v1}, Landroid/widget/Toast;->show()V
/* .line 356 */
} // :cond_0
return;
} // .end method
private void doInitializeOwnedItems ( ) {
/* .locals 6 */
/* .prologue */
/* .line 1210 */
v4 = this.mPurchaseDatabase;
(( de.nurogames.android.ticb.base.PurchaseDatabase ) v4 ).queryAllPurchasedItems ( ); // invoke-virtual {v4}, Lde/nurogames/android/ticb/base/PurchaseDatabase;->queryAllPurchasedItems()Landroid/database/Cursor;
/* .line 1212 */
/* .local v0, "cursor":Landroid/database/Cursor; */
/* if-nez v0, :cond_0 */
/* .line 1239 */
} // :goto_0
return;
/* .line 1214 */
} // :cond_0
/* new-instance v1, Ljava/util/HashSet; */
/* invoke-direct {v1}, Ljava/util/HashSet;-><init>()V */
/* .line 1216 */
/* .local v1, "ownedItems":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;" */
try { // :try_start_0
v3 = final String v4 = "_id"; // const-string v4, "_id"
/* .line 1217 */
/* .local v3, "productIdCol":I */
} // :goto_1
/* :try_end_0 */
v4 = /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* if-nez v4, :cond_1 */
/* .line 1227 */
/* .line 1232 */
v4 = this.mHandler;
/* new-instance v5, Lde/nurogames/android/ticb/base/tinysanta$5; */
/* invoke-direct {v5, p0, v1}, Lde/nurogames/android/ticb/base/tinysanta$5;-><init>(Lde/nurogames/android/ticb/base/tinysanta;Ljava/util/Set;)V */
(( android.os.Handler ) v4 ).post ( v5 ); // invoke-virtual {v4, v5}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
/* .line 1219 */
} // :cond_1
try { // :try_start_1
/* .line 1220 */
/* .local v2, "productId":Ljava/lang/String; */
/* .line 1223 */
v4 = de.nurogames.android.ticb.base.tinysanta.loaded_purchase_items;
(( java.util.Vector ) v4 ).add ( v2 ); // invoke-virtual {v4, v2}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 1227 */
} // .end local v2 # "productId":Ljava/lang/String;
} // .end local v3 # "productIdCol":I
/* :catchall_0 */
/* move-exception v4 */
/* throw v4 */
} // .end method
public static void flipView ( Integer p0 ) {
/* .locals 2 */
/* .param p0, "viewID" # I */
/* .prologue */
/* .line 728 */
v0 = de.nurogames.android.ticb.base.tinysanta.flipper;
(( android.widget.ViewFlipper ) v0 ).getCurrentView ( ); // invoke-virtual {v0}, Landroid/widget/ViewFlipper;->getCurrentView()Landroid/view/View;
/* check-cast v0, Lde/nurogames/android/ticb/base/views/ViewPlus; */
int v1 = 0; // const/4 v1, 0x0
(( de.nurogames.android.ticb.base.views.ViewPlus ) v0 ).setState ( v1 ); // invoke-virtual {v0, v1}, Lde/nurogames/android/ticb/base/views/ViewPlus;->setState(I)V
/* .line 729 */
v0 = de.nurogames.android.ticb.base.tinysanta.flipper;
(( android.widget.ViewFlipper ) v0 ).setDisplayedChild ( p0 ); // invoke-virtual {v0, p0}, Landroid/widget/ViewFlipper;->setDisplayedChild(I)V
/* .line 730 */
/* .line 731 */
v0 = de.nurogames.android.ticb.base.tinysanta.flipper;
(( android.widget.ViewFlipper ) v0 ).getCurrentView ( ); // invoke-virtual {v0}, Landroid/widget/ViewFlipper;->getCurrentView()Landroid/view/View;
/* check-cast v0, Lde/nurogames/android/ticb/base/views/ViewPlus; */
int v1 = 1; // const/4 v1, 0x1
(( de.nurogames.android.ticb.base.views.ViewPlus ) v0 ).setState ( v1 ); // invoke-virtual {v0, v1}, Lde/nurogames/android/ticb/base/views/ViewPlus;->setState(I)V
/* .line 732 */
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = de.nurogames.android.ticb.base.tinysanta.flipper;
v1 = de.nurogames.android.ticb.base.tinysanta.fade_in;
(( android.widget.ViewFlipper ) v0 ).startAnimation ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/ViewFlipper;->startAnimation(Landroid/view/animation/Animation;)V
/* .line 734 */
} // :cond_0
return;
} // .end method
private void initTinyBeeBillingService ( ) {
/* .locals 2 */
/* .prologue */
/* .line 312 */
v0 = java.lang.System.out;
final String v1 = "initalizing billing service..."; // const-string v1, "initalizing billing service..."
(( java.io.PrintStream ) v0 ).println ( v1 ); // invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
/* .line 314 */
/* new-instance v0, Landroid/os/Handler; */
/* invoke-direct {v0}, Landroid/os/Handler;-><init>()V */
this.mHandler = v0;
/* .line 315 */
/* new-instance v0, Lde/nurogames/android/ticb/base/tinysanta$TinyBeePurchaseObserver; */
v1 = this.mHandler;
/* invoke-direct {v0, p0, v1}, Lde/nurogames/android/ticb/base/tinysanta$TinyBeePurchaseObserver;-><init>(Lde/nurogames/android/ticb/base/tinysanta;Landroid/os/Handler;)V */
this.mTinyBeePurchaseObserver = v0;
/* .line 317 */
/* new-instance v0, Lde/nurogames/android/ticb/base/tinysanta$CatalogAdapter; */
v1 = de.nurogames.android.ticb.base.tinysanta.CATALOG;
/* invoke-direct {v0, p0, v1}, Lde/nurogames/android/ticb/base/tinysanta$CatalogAdapter;-><init>(Landroid/content/Context;[Lde/nurogames/android/ticb/base/tinysanta$CatalogEntry;)V */
this.mCatalogAdapter = v0;
/* .line 319 */
/* new-instance v0, Lde/nurogames/android/ticb/base/BillingService; */
/* invoke-direct {v0}, Lde/nurogames/android/ticb/base/BillingService;-><init>()V */
/* .line 320 */
v0 = de.nurogames.android.ticb.base.tinysanta.mBillingService;
(( de.nurogames.android.ticb.base.BillingService ) v0 ).setContext ( p0 ); // invoke-virtual {v0, p0}, Lde/nurogames/android/ticb/base/BillingService;->setContext(Landroid/content/Context;)V
/* .line 322 */
/* new-instance v0, Lde/nurogames/android/ticb/base/PurchaseDatabase; */
v1 = de.nurogames.android.ticb.base.tinysanta.cntx;
/* invoke-direct {v0, v1}, Lde/nurogames/android/ticb/base/PurchaseDatabase;-><init>(Landroid/content/Context;)V */
this.mPurchaseDatabase = v0;
/* .line 324 */
v0 = this.mPurchaseDatabase;
(( de.nurogames.android.ticb.base.PurchaseDatabase ) v0 ).queryAllPurchasedItems ( ); // invoke-virtual {v0}, Lde/nurogames/android/ticb/base/PurchaseDatabase;->queryAllPurchasedItems()Landroid/database/Cursor;
this.mOwnedItemsCursor = v0;
/* .line 325 */
v0 = this.mOwnedItemsCursor;
(( de.nurogames.android.ticb.base.tinysanta ) p0 ).startManagingCursor ( v0 ); // invoke-virtual {p0, v0}, Lde/nurogames/android/ticb/base/tinysanta;->startManagingCursor(Landroid/database/Cursor;)V
/* .line 328 */
v0 = this.mTinyBeePurchaseObserver;
de.nurogames.android.ticb.base.ResponseHandler .register ( v0 );
/* .line 329 */
v0 = de.nurogames.android.ticb.base.tinysanta.mBillingService;
final String v1 = "inapp"; // const-string v1, "inapp"
v0 = (( de.nurogames.android.ticb.base.BillingService ) v0 ).checkBillingSupported ( v1 ); // invoke-virtual {v0, v1}, Lde/nurogames/android/ticb/base/BillingService;->checkBillingSupported(Ljava/lang/String;)Z
/* if-nez v0, :cond_0 */
/* .line 331 */
v0 = java.lang.System.out;
final String v1 = "DEVICE HAS NO GOOGLE PLAY BILLING SUPPORT!"; // const-string v1, "DEVICE HAS NO GOOGLE PLAY BILLING SUPPORT!"
(( java.io.PrintStream ) v0 ).println ( v1 ); // invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
/* .line 332 */
int v0 = 1; // const/4 v0, 0x1
de.nurogames.android.ticb.base.core.AppResources.device_has_no_google_support = (v0!= 0);
/* .line 333 */
int v0 = 0; // const/4 v0, 0x0
de.nurogames.android.ticb.base.core.AppResources.use_inapp_market = (v0!= 0);
/* .line 338 */
} // :goto_0
return;
/* .line 336 */
} // :cond_0
v0 = java.lang.System.out;
final String v1 = "DEVICE HAS!!! GOOGLE PLAY BILLING SUPPORT!"; // const-string v1, "DEVICE HAS!!! GOOGLE PLAY BILLING SUPPORT!"
(( java.io.PrintStream ) v0 ).println ( v1 ); // invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
} // .end method
private void initializeOwnedItems ( ) {
/* .locals 2 */
/* .prologue */
/* .line 1096 */
/* sget-boolean v0, Lde/nurogames/android/ticb/base/core/AppResources;->device_has_no_google_support:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 1119 */
} // :goto_0
return;
/* .line 1099 */
} // :cond_0
v0 = java.lang.System.out;
final String v1 = "initalizing owned purchase items:"; // const-string v1, "initalizing owned purchase items:"
(( java.io.PrintStream ) v0 ).println ( v1 ); // invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
/* .line 1102 */
v0 = java.lang.System.out;
final String v1 = "checking google play market..."; // const-string v1, "checking google play market..."
(( java.io.PrintStream ) v0 ).println ( v1 ); // invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
/* .line 1103 */
/* new-instance v0, Ljava/lang/Thread; */
/* new-instance v1, Lde/nurogames/android/ticb/base/tinysanta$4; */
/* invoke-direct {v1, p0}, Lde/nurogames/android/ticb/base/tinysanta$4;-><init>(Lde/nurogames/android/ticb/base/tinysanta;)V */
/* invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V */
/* .line 1112 */
(( java.lang.Thread ) v0 ).start ( ); // invoke-virtual {v0}, Ljava/lang/Thread;->start()V
} // .end method
private void pauseView ( ) {
/* .locals 2 */
/* .prologue */
/* .line 737 */
v0 = de.nurogames.android.ticb.base.tinysanta.flipper;
v0 = (( android.widget.ViewFlipper ) v0 ).getDisplayedChild ( ); // invoke-virtual {v0}, Landroid/widget/ViewFlipper;->getDisplayedChild()I
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 738 */
v0 = de.nurogames.android.ticb.base.tinysanta.flipper;
(( android.widget.ViewFlipper ) v0 ).getCurrentView ( ); // invoke-virtual {v0}, Landroid/widget/ViewFlipper;->getCurrentView()Landroid/view/View;
/* check-cast v0, Lde/nurogames/android/ticb/base/views/ViewPlus; */
int v1 = 0; // const/4 v1, 0x0
(( de.nurogames.android.ticb.base.views.ViewPlus ) v0 ).setState ( v1 ); // invoke-virtual {v0, v1}, Lde/nurogames/android/ticb/base/views/ViewPlus;->setState(I)V
/* .line 739 */
} // :cond_0
return;
} // .end method
private void restoreDatabase ( ) {
/* .locals 4 */
/* .prologue */
int v3 = 0; // const/4 v3, 0x0
/* .line 1066 */
(( de.nurogames.android.ticb.base.tinysanta ) p0 ).getPreferences ( v3 ); // invoke-virtual {p0, v3}, Lde/nurogames/android/ticb/base/tinysanta;->getPreferences(I)Landroid/content/SharedPreferences;
/* .line 1067 */
/* .local v1, "prefs":Landroid/content/SharedPreferences; */
v0 = final String v2 = "db_initialized"; // const-string v2, "db_initialized"
/* .line 1068 */
/* .local v0, "initialized":Z */
/* if-nez v0, :cond_0 */
/* .line 1069 */
v2 = de.nurogames.android.ticb.base.tinysanta.mBillingService;
(( de.nurogames.android.ticb.base.BillingService ) v2 ).restoreTransactions ( ); // invoke-virtual {v2}, Lde/nurogames/android/ticb/base/BillingService;->restoreTransactions()Z
/* .line 1071 */
} // :cond_0
return;
} // .end method
private void resumeView ( ) {
/* .locals 2 */
/* .prologue */
/* .line 742 */
v0 = de.nurogames.android.ticb.base.tinysanta.flipper;
v0 = (( android.widget.ViewFlipper ) v0 ).getDisplayedChild ( ); // invoke-virtual {v0}, Landroid/widget/ViewFlipper;->getDisplayedChild()I
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 743 */
v0 = de.nurogames.android.ticb.base.tinysanta.flipper;
(( android.widget.ViewFlipper ) v0 ).getCurrentView ( ); // invoke-virtual {v0}, Landroid/widget/ViewFlipper;->getCurrentView()Landroid/view/View;
/* check-cast v0, Lde/nurogames/android/ticb/base/views/ViewPlus; */
int v1 = 1; // const/4 v1, 0x1
(( de.nurogames.android.ticb.base.views.ViewPlus ) v0 ).setState ( v1 ); // invoke-virtual {v0, v1}, Lde/nurogames/android/ticb/base/views/ViewPlus;->setState(I)V
/* .line 744 */
} // :cond_0
return;
} // .end method
private void setLanguage ( java.lang.String p0 ) {
/* .locals 4 */
/* .param p1, "locale" # Ljava/lang/String; */
/* .prologue */
/* .line 841 */
/* const/16 v3, -0x63 */
/* if-ne v2, v3, :cond_3 */
/* .line 843 */
final String v2 = "DE"; // const-string v2, "DE"
v2 = (( java.lang.String ) p1 ).equalsIgnoreCase ( v2 ); // invoke-virtual {p1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v2 != null) { // if-eqz v2, :cond_4
/* .line 844 */
/* .line 862 */
} // :goto_0
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
android.os.Environment .getExternalStorageDirectory ( );
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v3 = "/tinybee_english.txt"; // const-string v3, "/tinybee_english.txt"
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 863 */
/* .local v0, "fileName":Ljava/lang/String; */
/* new-instance v1, Ljava/io/File; */
/* invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V */
/* .line 864 */
/* .local v1, "update":Ljava/io/File; */
v2 = (( java.io.File ) v1 ).exists ( ); // invoke-virtual {v1}, Ljava/io/File;->exists()Z
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 866 */
} // :cond_0
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
android.os.Environment .getExternalStorageDirectory ( );
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v3 = "/tinybee_korean.txt"; // const-string v3, "/tinybee_korean.txt"
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 867 */
/* new-instance v1, Ljava/io/File; */
} // .end local v1 # "update":Ljava/io/File;
/* invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V */
/* .line 868 */
/* .restart local v1 # "update":Ljava/io/File; */
v2 = (( java.io.File ) v1 ).exists ( ); // invoke-virtual {v1}, Ljava/io/File;->exists()Z
if ( v2 != null) { // if-eqz v2, :cond_1
/* .line 870 */
} // :cond_1
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
android.os.Environment .getExternalStorageDirectory ( );
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v3 = "/tinybee_german.txt"; // const-string v3, "/tinybee_german.txt"
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 871 */
/* new-instance v1, Ljava/io/File; */
} // .end local v1 # "update":Ljava/io/File;
/* invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V */
/* .line 872 */
/* .restart local v1 # "update":Ljava/io/File; */
v2 = (( java.io.File ) v1 ).exists ( ); // invoke-virtual {v1}, Ljava/io/File;->exists()Z
if ( v2 != null) { // if-eqz v2, :cond_2
/* .line 874 */
} // :cond_2
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
android.os.Environment .getExternalStorageDirectory ( );
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v3 = "/tinybee_italia.txt"; // const-string v3, "/tinybee_italia.txt"
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 875 */
/* new-instance v1, Ljava/io/File; */
} // .end local v1 # "update":Ljava/io/File;
/* invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V */
/* .line 876 */
/* .restart local v1 # "update":Ljava/io/File; */
v2 = (( java.io.File ) v1 ).exists ( ); // invoke-virtual {v1}, Ljava/io/File;->exists()Z
if ( v2 != null) { // if-eqz v2, :cond_3
/* .line 880 */
} // .end local v0 # "fileName":Ljava/lang/String;
} // .end local v1 # "update":Ljava/io/File;
} // :cond_3
return;
/* .line 846 */
} // :cond_4
final String v2 = "EN"; // const-string v2, "EN"
v2 = (( java.lang.String ) p1 ).equalsIgnoreCase ( v2 ); // invoke-virtual {p1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v2 != null) { // if-eqz v2, :cond_5
/* .line 847 */
/* goto/16 :goto_0 */
/* .line 849 */
} // :cond_5
final String v2 = "KR"; // const-string v2, "KR"
v2 = (( java.lang.String ) p1 ).equalsIgnoreCase ( v2 ); // invoke-virtual {p1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v2 != null) { // if-eqz v2, :cond_6
/* .line 850 */
/* goto/16 :goto_0 */
/* .line 852 */
} // :cond_6
final String v2 = "IT"; // const-string v2, "IT"
v2 = (( java.lang.String ) p1 ).equalsIgnoreCase ( v2 ); // invoke-virtual {p1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v2 != null) { // if-eqz v2, :cond_7
/* .line 853 */
/* goto/16 :goto_0 */
/* .line 856 */
} // :cond_7
/* goto/16 :goto_0 */
} // .end method
private void startMarketPingTimer ( ) {
/* .locals 8 */
/* .prologue */
/* .line 1076 */
/* const/16 v6, 0x3e8 */
/* .line 1077 */
/* .local v6, "delay":I */
/* const v7, 0xea60 */
/* .line 1079 */
/* .local v7, "period":I */
/* new-instance v0, Ljava/util/Timer; */
/* invoke-direct {v0}, Ljava/util/Timer;-><init>()V */
/* .line 1080 */
v0 = de.nurogames.android.ticb.base.tinysanta.market_timer;
/* new-instance v1, Lde/nurogames/android/ticb/base/tinysanta$3; */
/* invoke-direct {v1, p0}, Lde/nurogames/android/ticb/base/tinysanta$3;-><init>(Lde/nurogames/android/ticb/base/tinysanta;)V */
/* .line 1085 */
/* int-to-long v2, v6 */
/* int-to-long v4, v7 */
/* .line 1080 */
/* invoke-virtual/range {v0 ..v5}, Ljava/util/Timer;->scheduleAtFixedRate(Ljava/util/TimerTask;JJ)V */
/* .line 1087 */
return;
} // .end method
private void unlockGoogleGamePurchses ( ) {
/* .locals 9 */
/* .prologue */
int v8 = 5; // const/4 v8, 0x5
int v7 = 4; // const/4 v7, 0x4
int v6 = 3; // const/4 v6, 0x3
int v5 = 2; // const/4 v5, 0x2
int v4 = 1; // const/4 v4, 0x1
/* .line 1244 */
v1 = java.lang.System.out;
/* new-instance v2, Ljava/lang/StringBuilder; */
final String v3 = "google purchase items found: "; // const-string v3, "google purchase items found: "
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v3 = de.nurogames.android.ticb.base.tinysanta.loaded_purchase_items;
v3 = (( java.util.Vector ) v3 ).size ( ); // invoke-virtual {v3}, Ljava/util/Vector;->size()I
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( java.io.PrintStream ) v1 ).println ( v2 ); // invoke-virtual {v1, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
/* .line 1246 */
int v0 = 0; // const/4 v0, 0x0
/* .local v0, "x":I */
} // :goto_0
v1 = de.nurogames.android.ticb.base.tinysanta.loaded_purchase_items;
v1 = (( java.util.Vector ) v1 ).size ( ); // invoke-virtual {v1}, Ljava/util/Vector;->size()I
/* if-lt v0, v1, :cond_0 */
/* .line 1301 */
return;
/* .line 1249 */
} // :cond_0
v1 = de.nurogames.android.ticb.base.tinysanta.loaded_purchase_items;
(( java.util.Vector ) v1 ).elementAt ( v0 ); // invoke-virtual {v1, v0}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;
/* check-cast v1, Ljava/lang/String; */
final String v2 = "tiger_bee"; // const-string v2, "tiger_bee"
v1 = (( java.lang.String ) v1 ).equalsIgnoreCase ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v1 != null) { // if-eqz v1, :cond_5
/* .line 1250 */
v1 = java.lang.System.out;
final String v2 = "unlocked: tiger bee!"; // const-string v2, "unlocked: tiger bee!"
(( java.io.PrintStream ) v1 ).println ( v2 ); // invoke-virtual {v1, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
/* .line 1251 */
v1 = de.nurogames.android.ticb.base.core.InAppMngr.owned;
/* aput-boolean v4, v1, v4 */
/* .line 1291 */
} // :cond_1
} // :goto_1
v1 = de.nurogames.android.ticb.base.core.InAppMngr.owned;
/* aget-boolean v1, v1, v4 */
if ( v1 != null) { // if-eqz v1, :cond_2
v1 = de.nurogames.android.ticb.base.core.InAppMngr.owned;
/* aget-boolean v1, v1, v5 */
if ( v1 != null) { // if-eqz v1, :cond_2
v1 = de.nurogames.android.ticb.base.core.InAppMngr.owned;
/* aget-boolean v1, v1, v6 */
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 1292 */
v1 = de.nurogames.android.ticb.base.core.InAppMngr.owned;
/* aput-boolean v4, v1, v7 */
/* .line 1294 */
} // :cond_2
v1 = de.nurogames.android.ticb.base.core.InAppMngr.owned;
/* aget-boolean v1, v1, v7 */
/* if-nez v1, :cond_3 */
v1 = de.nurogames.android.ticb.base.core.InAppMngr.owned;
/* aget-boolean v1, v1, v8 */
if ( v1 != null) { // if-eqz v1, :cond_4
/* .line 1295 */
} // :cond_3
v1 = de.nurogames.android.ticb.base.core.InAppMngr.owned;
int v2 = 6; // const/4 v2, 0x6
/* aput-boolean v4, v1, v2 */
/* .line 1296 */
v1 = de.nurogames.android.ticb.base.tinysanta.inAppMngr;
int v2 = 6; // const/4 v2, 0x6
(( de.nurogames.android.ticb.base.core.InAppMngr ) v1 ).removeItem ( v2 ); // invoke-virtual {v1, v2}, Lde/nurogames/android/ticb/base/core/InAppMngr;->removeItem(I)V
/* .line 1246 */
} // :cond_4
/* add-int/lit8 v0, v0, 0x1 */
/* .line 1254 */
} // :cond_5
v1 = de.nurogames.android.ticb.base.tinysanta.loaded_purchase_items;
(( java.util.Vector ) v1 ).elementAt ( v0 ); // invoke-virtual {v1, v0}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;
/* check-cast v1, Ljava/lang/String; */
final String v2 = "ladybug_bee"; // const-string v2, "ladybug_bee"
v1 = (( java.lang.String ) v1 ).equalsIgnoreCase ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v1 != null) { // if-eqz v1, :cond_6
/* .line 1255 */
v1 = java.lang.System.out;
final String v2 = "unlocked: lady bug bee!"; // const-string v2, "unlocked: lady bug bee!"
(( java.io.PrintStream ) v1 ).println ( v2 ); // invoke-virtual {v1, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
/* .line 1256 */
v1 = de.nurogames.android.ticb.base.core.InAppMngr.owned;
/* aput-boolean v4, v1, v5 */
/* .line 1259 */
} // :cond_6
v1 = de.nurogames.android.ticb.base.tinysanta.loaded_purchase_items;
(( java.util.Vector ) v1 ).elementAt ( v0 ); // invoke-virtual {v1, v0}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;
/* check-cast v1, Ljava/lang/String; */
final String v2 = "golden_bee"; // const-string v2, "golden_bee"
v1 = (( java.lang.String ) v1 ).equalsIgnoreCase ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v1 != null) { // if-eqz v1, :cond_7
/* .line 1260 */
v1 = java.lang.System.out;
final String v2 = "unlocked: golden bee!"; // const-string v2, "unlocked: golden bee!"
(( java.io.PrintStream ) v1 ).println ( v2 ); // invoke-virtual {v1, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
/* .line 1261 */
v1 = de.nurogames.android.ticb.base.core.InAppMngr.owned;
/* aput-boolean v4, v1, v6 */
/* .line 1264 */
} // :cond_7
v1 = de.nurogames.android.ticb.base.tinysanta.loaded_purchase_items;
(( java.util.Vector ) v1 ).elementAt ( v0 ); // invoke-virtual {v1, v0}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;
/* check-cast v1, Ljava/lang/String; */
final String v2 = "character_pack"; // const-string v2, "character_pack"
v1 = (( java.lang.String ) v1 ).equalsIgnoreCase ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v1 != null) { // if-eqz v1, :cond_8
/* .line 1265 */
v1 = java.lang.System.out;
final String v2 = "unlocked: character pack!"; // const-string v2, "unlocked: character pack!"
(( java.io.PrintStream ) v1 ).println ( v2 ); // invoke-virtual {v1, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
/* .line 1266 */
v1 = de.nurogames.android.ticb.base.core.InAppMngr.owned;
/* aput-boolean v4, v1, v4 */
/* .line 1267 */
v1 = de.nurogames.android.ticb.base.core.InAppMngr.owned;
/* aput-boolean v4, v1, v5 */
/* .line 1268 */
v1 = de.nurogames.android.ticb.base.core.InAppMngr.owned;
/* aput-boolean v4, v1, v6 */
/* .line 1269 */
v1 = de.nurogames.android.ticb.base.core.InAppMngr.owned;
/* aput-boolean v4, v1, v7 */
/* goto/16 :goto_1 */
/* .line 1272 */
} // :cond_8
v1 = de.nurogames.android.ticb.base.tinysanta.loaded_purchase_items;
(( java.util.Vector ) v1 ).elementAt ( v0 ); // invoke-virtual {v1, v0}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;
/* check-cast v1, Ljava/lang/String; */
final String v2 = "level_pack"; // const-string v2, "level_pack"
v1 = (( java.lang.String ) v1 ).equalsIgnoreCase ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v1 != null) { // if-eqz v1, :cond_9
/* .line 1273 */
v1 = java.lang.System.out;
final String v2 = "unlocked: level pack!"; // const-string v2, "unlocked: level pack!"
(( java.io.PrintStream ) v1 ).println ( v2 ); // invoke-virtual {v1, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
/* .line 1274 */
v1 = de.nurogames.android.ticb.base.core.InAppMngr.owned;
/* aput-boolean v4, v1, v8 */
/* .line 1275 */
/* .line 1276 */
de.nurogames.android.ticb.base.core.AppResources.purchased_all_levels = (v4!= 0);
/* goto/16 :goto_1 */
/* .line 1279 */
} // :cond_9
v1 = de.nurogames.android.ticb.base.tinysanta.loaded_purchase_items;
(( java.util.Vector ) v1 ).elementAt ( v0 ); // invoke-virtual {v1, v0}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;
/* check-cast v1, Ljava/lang/String; */
final String v2 = "level_and_character_pack"; // const-string v2, "level_and_character_pack"
v1 = (( java.lang.String ) v1 ).equalsIgnoreCase ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 1280 */
v1 = java.lang.System.out;
final String v2 = "unlocked: level and character pack!"; // const-string v2, "unlocked: level and character pack!"
(( java.io.PrintStream ) v1 ).println ( v2 ); // invoke-virtual {v1, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
/* .line 1281 */
v1 = de.nurogames.android.ticb.base.core.InAppMngr.owned;
/* aput-boolean v4, v1, v4 */
/* .line 1282 */
v1 = de.nurogames.android.ticb.base.core.InAppMngr.owned;
/* aput-boolean v4, v1, v5 */
/* .line 1283 */
v1 = de.nurogames.android.ticb.base.core.InAppMngr.owned;
/* aput-boolean v4, v1, v6 */
/* .line 1284 */
v1 = de.nurogames.android.ticb.base.core.InAppMngr.owned;
/* aput-boolean v4, v1, v7 */
/* .line 1285 */
v1 = de.nurogames.android.ticb.base.core.InAppMngr.owned;
/* aput-boolean v4, v1, v8 */
/* .line 1286 */
v1 = de.nurogames.android.ticb.base.core.InAppMngr.owned;
int v2 = 6; // const/4 v2, 0x6
/* aput-boolean v4, v1, v2 */
/* .line 1287 */
/* .line 1288 */
de.nurogames.android.ticb.base.core.AppResources.purchased_all_levels = (v4!= 0);
/* goto/16 :goto_1 */
} // .end method
/* # virtual methods */
public void onAccuracyChanged ( android.hardware.Sensor p0, Integer p1 ) {
/* .locals 0 */
/* .param p1, "arg0" # Landroid/hardware/Sensor; */
/* .param p2, "arg1" # I */
/* .prologue */
/* .line 821 */
return;
} // .end method
public void onConfigurationChanged ( android.content.res.Configuration p0 ) {
/* .locals 0 */
/* .param p1, "newConfig" # Landroid/content/res/Configuration; */
/* .prologue */
/* .line 718 */
/* invoke-super {p0, p1}, Landroid/app/Activity;->onConfigurationChanged(Landroid/content/res/Configuration;)V */
/* .line 719 */
return;
} // .end method
public void onCreate ( android.os.Bundle p0 ) {
/* .locals 9 */
/* .param p1, "savedInstanceState" # Landroid/os/Bundle; */
/* .prologue */
int v8 = 0; // const/4 v8, 0x0
/* .line 377 */
/* invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V */
/* .line 380 */
(( de.nurogames.android.ticb.base.tinysanta ) p0 ).getApplicationContext ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/tinysanta;->getApplicationContext()Landroid/content/Context;
/* .line 382 */
/* .line 384 */
/* sget-boolean v5, Lde/nurogames/android/ticb/base/core/AppResources;->use_inapp_market:Z */
if ( v5 != null) { // if-eqz v5, :cond_0
/* .line 385 */
/* invoke-direct {p0}, Lde/nurogames/android/ticb/base/tinysanta;->initTinyBeeBillingService()V */
/* .line 404 */
} // :cond_0
/* new-instance v4, Lde/nurogames/android/ticb/base/tinysanta$1; */
/* invoke-direct {v4, p0}, Lde/nurogames/android/ticb/base/tinysanta$1;-><init>(Lde/nurogames/android/ticb/base/tinysanta;)V */
/* .line 411 */
/* .local v4, "screenoff":Landroid/content/BroadcastReceiver; */
/* new-instance v0, Landroid/content/IntentFilter; */
final String v5 = "android.intent.action.SCREEN_OFF"; // const-string v5, "android.intent.action.SCREEN_OFF"
/* invoke-direct {v0, v5}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V */
/* .line 412 */
/* .local v0, "intentFilter":Landroid/content/IntentFilter; */
(( de.nurogames.android.ticb.base.tinysanta ) p0 ).registerReceiver ( v4, v0 ); // invoke-virtual {p0, v4, v0}, Lde/nurogames/android/ticb/base/tinysanta;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
/* .line 415 */
final String v5 = "vibrator"; // const-string v5, "vibrator"
(( de.nurogames.android.ticb.base.tinysanta ) p0 ).getSystemService ( v5 ); // invoke-virtual {p0, v5}, Lde/nurogames/android/ticb/base/tinysanta;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v5, Landroid/os/Vibrator; */
/* .line 418 */
final String v5 = "sensor"; // const-string v5, "sensor"
(( de.nurogames.android.ticb.base.tinysanta ) p0 ).getSystemService ( v5 ); // invoke-virtual {p0, v5}, Lde/nurogames/android/ticb/base/tinysanta;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v5, Landroid/hardware/SensorManager; */
this.mSensorManager = v5;
/* .line 419 */
v5 = this.mSensorManager;
int v6 = 3; // const/4 v6, 0x3
(( android.hardware.SensorManager ) v5 ).getDefaultSensor ( v6 ); // invoke-virtual {v5, v6}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;
this.mAccelerometer = v5;
/* .line 422 */
java.util.Locale .getDefault ( );
(( java.util.Locale ) v5 ).getCountry ( ); // invoke-virtual {v5}, Ljava/util/Locale;->getCountry()Ljava/lang/String;
/* .line 423 */
v5 = de.nurogames.android.ticb.base.core.AppResources.locale;
/* invoke-direct {p0, v5}, Lde/nurogames/android/ticb/base/tinysanta;->setLanguage(Ljava/lang/String;)V */
/* .line 447 */
v5 = android.os.Build$VERSION.RELEASE;
/* .line 448 */
/* .line 449 */
v5 = android.os.Build.DEVICE;
/* .line 450 */
v5 = android.os.Build.MODEL;
/* .line 451 */
v5 = java.lang.System.out;
/* new-instance v6, Ljava/lang/StringBuilder; */
final String v7 = "-- INFO: <"; // const-string v7, "-- INFO: <"
/* invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v7 = de.nurogames.android.ticb.base.tinysanta.INFO_DEVICE;
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v7 = ">, <"; // const-string v7, ">, <"
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v7 = de.nurogames.android.ticb.base.tinysanta.INFO_MODEL;
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v7 = "> RUNNING ON ANDROID: v"; // const-string v7, "> RUNNING ON ANDROID: v"
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v7 = de.nurogames.android.ticb.base.tinysanta.INFO_OS_VERSION;
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).toString ( ); // invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( java.io.PrintStream ) v5 ).println ( v6 ); // invoke-virtual {v5, v6}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
/* .line 454 */
(( de.nurogames.android.ticb.base.tinysanta ) p0 ).setRequestedOrientation ( v8 ); // invoke-virtual {p0, v8}, Lde/nurogames/android/ticb/base/tinysanta;->setRequestedOrientation(I)V
/* .line 457 */
int v5 = 1; // const/4 v5, 0x1
(( de.nurogames.android.ticb.base.tinysanta ) p0 ).requestWindowFeature ( v5 ); // invoke-virtual {p0, v5}, Lde/nurogames/android/ticb/base/tinysanta;->requestWindowFeature(I)Z
/* .line 458 */
int v5 = -2; // const/4 v5, -0x2
(( de.nurogames.android.ticb.base.tinysanta ) p0 ).requestWindowFeature ( v5 ); // invoke-virtual {p0, v5}, Lde/nurogames/android/ticb/base/tinysanta;->requestWindowFeature(I)Z
/* .line 461 */
(( de.nurogames.android.ticb.base.tinysanta ) p0 ).getWindow ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/tinysanta;->getWindow()Landroid/view/Window;
/* .line 462 */
v5 = de.nurogames.android.ticb.base.tinysanta.win;
/* const/16 v6, 0x400 */
(( android.view.Window ) v5 ).addFlags ( v6 ); // invoke-virtual {v5, v6}, Landroid/view/Window;->addFlags(I)V
/* .line 464 */
v5 = de.nurogames.android.ticb.base.tinysanta.win;
/* const/16 v6, 0x80 */
(( android.view.Window ) v5 ).addFlags ( v6 ); // invoke-virtual {v5, v6}, Landroid/view/Window;->addFlags(I)V
/* .line 467 */
v5 = de.nurogames.android.ticb.base.tinysanta.win;
int v6 = -1; // const/4 v6, -0x1
(( android.view.Window ) v5 ).setFormat ( v6 ); // invoke-virtual {v5, v6}, Landroid/view/Window;->setFormat(I)V
/* .line 469 */
final String v5 = "power"; // const-string v5, "power"
(( de.nurogames.android.ticb.base.tinysanta ) p0 ).getSystemService ( v5 ); // invoke-virtual {p0, v5}, Lde/nurogames/android/ticb/base/tinysanta;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v1, Landroid/os/PowerManager; */
/* .line 470 */
/* .local v1, "pm":Landroid/os/PowerManager; */
/* const/16 v5, 0x1a */
final String v6 = "FULL_WAKE_LOCK"; // const-string v6, "FULL_WAKE_LOCK"
(( android.os.PowerManager ) v1 ).newWakeLock ( v5, v6 ); // invoke-virtual {v1, v5, v6}, Landroid/os/PowerManager;->newWakeLock(ILjava/lang/String;)Landroid/os/PowerManager$WakeLock;
this.wl = v5;
/* .line 476 */
v5 = de.nurogames.android.ticb.base.tinysanta.win;
(( android.view.Window ) v5 ).getWindowManager ( ); // invoke-virtual {v5}, Landroid/view/Window;->getWindowManager()Landroid/view/WindowManager;
v2 = (( android.view.Display ) v5 ).getHeight ( ); // invoke-virtual {v5}, Landroid/view/Display;->getHeight()I
/* .line 477 */
/* .local v2, "screenHeight":I */
v5 = de.nurogames.android.ticb.base.tinysanta.win;
(( android.view.Window ) v5 ).getWindowManager ( ); // invoke-virtual {v5}, Landroid/view/Window;->getWindowManager()Landroid/view/WindowManager;
v3 = (( android.view.Display ) v5 ).getWidth ( ); // invoke-virtual {v5}, Landroid/view/Display;->getWidth()I
/* .line 478 */
/* .local v3, "screenWidth":I */
/* if-ge v3, v2, :cond_6 */
/* .line 479 */
de.nurogames.android.ticb.base.core._Display .setDisplay ( v2,v3 );
/* .line 484 */
} // :goto_0
(( de.nurogames.android.ticb.base.tinysanta ) p0 ).getWindowManager ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/tinysanta;->getWindowManager()Landroid/view/WindowManager;
v6 = de.nurogames.android.ticb.base.tinysanta.sMetrics;
(( android.view.Display ) v5 ).getMetrics ( v6 ); // invoke-virtual {v5, v6}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V
/* .line 487 */
/* new-instance v5, Lde/nurogames/android/ticb/base/core/systemDiagnostic; */
/* invoke-direct {v5}, Lde/nurogames/android/ticb/base/core/systemDiagnostic;-><init>()V */
/* .line 490 */
/* new-instance v5, Lde/nurogames/android/ticb/base/core/DataManager; */
/* invoke-direct {v5}, Lde/nurogames/android/ticb/base/core/DataManager;-><init>()V */
/* .line 493 */
v5 = de.nurogames.android.ticb.base.tinysanta.data_mngr;
(( de.nurogames.android.ticb.base.core.DataManager ) v5 ).loadSettings ( ); // invoke-virtual {v5}, Lde/nurogames/android/ticb/base/core/DataManager;->loadSettings()V
/* .line 496 */
de.nurogames.android.ticb.base.core.AppResources .loadGraphics ( );
/* .line 499 */
de.nurogames.android.ticb.base.core.AppResources .loadMediaPlayers ( );
/* .line 500 */
de.nurogames.android.ticb.base.core.AppResources .loadSFX ( );
/* .line 503 */
v5 = de.nurogames.android.ticb.base.tinysanta.data_mngr;
(( de.nurogames.android.ticb.base.core.DataManager ) v5 ).restoreHighscores ( v6 ); // invoke-virtual {v5, v6}, Lde/nurogames/android/ticb/base/core/DataManager;->restoreHighscores(I)V
/* .line 504 */
v5 = de.nurogames.android.ticb.base.tinysanta.data_mngr;
(( de.nurogames.android.ticb.base.core.DataManager ) v5 ).loadOverall ( ); // invoke-virtual {v5}, Lde/nurogames/android/ticb/base/core/DataManager;->loadOverall()V
/* .line 507 */
android.view.animation.AnimationUtils .loadAnimation ( p0,v5 );
/* .line 508 */
android.view.animation.AnimationUtils .loadAnimation ( p0,v5 );
/* .line 509 */
android.view.animation.AnimationUtils .loadAnimation ( p0,v5 );
/* .line 511 */
/* sget-boolean v5, Lde/nurogames/android/ticb/base/core/AppResources;->use_crosspromo_shop:Z */
if ( v5 != null) { // if-eqz v5, :cond_1
/* .line 512 */
/* new-instance v5, Lde/nurogames/android/ticb/base/core/ShopMngr; */
/* iget v6, p0, Lde/nurogames/android/ticb/base/tinysanta;->APP_ID:I */
/* iget v7, p0, Lde/nurogames/android/ticb/base/tinysanta;->APP_SECRET:I */
/* invoke-direct {v5, v6, v7, v8, p0}, Lde/nurogames/android/ticb/base/core/ShopMngr;-><init>(IIZLandroid/app/Activity;)V */
/* .line 514 */
} // :cond_1
/* sget-boolean v5, Lde/nurogames/android/ticb/base/core/AppResources;->TELEKOM_BUILD:Z */
if ( v5 != null) { // if-eqz v5, :cond_2
/* .line 515 */
/* new-instance v5, Lde/nurogames/android/ticb/base/core/UpdateMngr; */
/* invoke-direct {v5, p0}, Lde/nurogames/android/ticb/base/core/UpdateMngr;-><init>(Landroid/app/Activity;)V */
/* .line 520 */
} // :cond_2
/* sget-boolean v5, Lde/nurogames/android/ticb/base/core/AppResources;->use_inapp_market:Z */
if ( v5 != null) { // if-eqz v5, :cond_3
/* .line 521 */
/* new-instance v5, Lde/nurogames/android/ticb/base/core/InAppMngr; */
/* invoke-direct {v5}, Lde/nurogames/android/ticb/base/core/InAppMngr;-><init>()V */
/* .line 524 */
} // :cond_3
/* sget-boolean v5, Lde/nurogames/android/ticb/base/core/AppResources;->use_chartboost:Z */
if ( v5 != null) { // if-eqz v5, :cond_4
/* .line 525 */
/* new-instance v5, Lde/nurogames/android/ticb/base/CBMngr; */
/* invoke-direct {v5, p0}, Lde/nurogames/android/ticb/base/CBMngr;-><init>(Landroid/app/Activity;)V */
/* .line 528 */
} // :cond_4
v5 = java.lang.System.out;
/* new-instance v6, Ljava/lang/StringBuilder; */
final String v7 = "hellowin try init..."; // const-string v7, "hellowin try init..."
/* invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v7 = de.hellowins.Hellowins .getInstance ( );
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).toString ( ); // invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( java.io.PrintStream ) v5 ).println ( v6 ); // invoke-virtual {v5, v6}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
/* .line 529 */
v5 = de.hellowins.Hellowins .getInstance ( );
if ( v5 != null) { // if-eqz v5, :cond_5
/* .line 532 */
(( de.nurogames.android.ticb.base.tinysanta ) p0 ).getIntent ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/tinysanta;->getIntent()Landroid/content/Intent;
(( android.content.Intent ) v5 ).getExtras ( ); // invoke-virtual {v5}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;
final String v6 = "isHellowinsGame"; // const-string v6, "isHellowinsGame"
v5 = (( android.os.Bundle ) v5 ).getBoolean ( v6 ); // invoke-virtual {v5, v6}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z
de.nurogames.android.ticb.base.tinysanta.isHellowinsGame = (v5!= 0);
/* .line 533 */
/* sget-boolean v5, Lde/nurogames/android/ticb/base/tinysanta;->isHellowinsGame:Z */
de.nurogames.android.ticb.base.tinysanta.showHellowinsDialog = (v5!= 0);
/* .line 535 */
v5 = java.lang.System.out;
final String v6 = "-- Hellowin Info:"; // const-string v6, "-- Hellowin Info:"
(( java.io.PrintStream ) v5 ).println ( v6 ); // invoke-virtual {v5, v6}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
/* .line 536 */
v5 = java.lang.System.out;
/* new-instance v6, Ljava/lang/StringBuilder; */
final String v7 = "Level: "; // const-string v7, "Level: "
/* invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v7 = de.hellowins.Hellowins .getInstance ( );
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).toString ( ); // invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( java.io.PrintStream ) v5 ).println ( v6 ); // invoke-virtual {v5, v6}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
/* .line 537 */
v5 = java.lang.System.out;
/* new-instance v6, Ljava/lang/StringBuilder; */
final String v7 = "Ranking: "; // const-string v7, "Ranking: "
/* invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
de.hellowins.Hellowins .getInstance ( );
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).toString ( ); // invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( java.io.PrintStream ) v5 ).println ( v6 ); // invoke-virtual {v5, v6}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
/* .line 538 */
v5 = java.lang.System.out;
/* new-instance v6, Ljava/lang/StringBuilder; */
final String v7 = "RemainingTime: "; // const-string v7, "RemainingTime: "
/* invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
de.hellowins.Hellowins .getInstance ( );
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).toString ( ); // invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( java.io.PrintStream ) v5 ).println ( v6 ); // invoke-virtual {v5, v6}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
/* .line 539 */
v5 = java.lang.System.out;
/* new-instance v6, Ljava/lang/StringBuilder; */
final String v7 = "isRunning: "; // const-string v7, "isRunning: "
/* invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v7 = de.hellowins.Hellowins .getInstance ( );
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).toString ( ); // invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( java.io.PrintStream ) v5 ).println ( v6 ); // invoke-virtual {v5, v6}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
/* .line 540 */
v5 = java.lang.System.out;
/* new-instance v6, Ljava/lang/StringBuilder; */
final String v7 = "isInitialized: "; // const-string v7, "isInitialized: "
/* invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v7 = de.hellowins.Hellowins .getInstance ( );
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).toString ( ); // invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( java.io.PrintStream ) v5 ).println ( v6 ); // invoke-virtual {v5, v6}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
/* .line 544 */
de.hellowins.Hellowins .getInstance ( );
/* new-instance v6, Lde/nurogames/android/ticb/base/tinysanta$2; */
/* invoke-direct {v6, p0}, Lde/nurogames/android/ticb/base/tinysanta$2;-><init>(Lde/nurogames/android/ticb/base/tinysanta;)V */
/* .line 598 */
} // :cond_5
(( de.nurogames.android.ticb.base.tinysanta ) p0 ).setContentView ( v5 ); // invoke-virtual {p0, v5}, Lde/nurogames/android/ticb/base/tinysanta;->setContentView(I)V
/* .line 599 */
(( de.nurogames.android.ticb.base.tinysanta ) p0 ).findViewById ( v5 ); // invoke-virtual {p0, v5}, Lde/nurogames/android/ticb/base/tinysanta;->findViewById(I)Landroid/view/View;
/* check-cast v5, Landroid/widget/ViewFlipper; */
/* .line 600 */
de.nurogames.android.ticb.base.tinysanta .flipView ( v8 );
/* .line 602 */
return;
/* .line 481 */
} // :cond_6
de.nurogames.android.ticb.base.core._Display .setDisplay ( v3,v2 );
/* goto/16 :goto_0 */
} // .end method
protected void onDestroy ( ) {
/* .locals 1 */
/* .prologue */
/* .line 659 */
/* invoke-super {p0}, Landroid/app/Activity;->onDestroy()V */
/* .line 661 */
/* sget-boolean v0, Lde/nurogames/android/ticb/base/core/AppResources;->use_inapp_market:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 662 */
v0 = this.mPurchaseDatabase;
(( de.nurogames.android.ticb.base.PurchaseDatabase ) v0 ).close ( ); // invoke-virtual {v0}, Lde/nurogames/android/ticb/base/PurchaseDatabase;->close()V
/* .line 663 */
v0 = de.nurogames.android.ticb.base.tinysanta.mBillingService;
(( de.nurogames.android.ticb.base.BillingService ) v0 ).unbind ( ); // invoke-virtual {v0}, Lde/nurogames/android/ticb/base/BillingService;->unbind()V
/* .line 665 */
} // :cond_0
return;
} // .end method
public Boolean onKeyDown ( Integer p0, android.view.KeyEvent p1 ) {
/* .locals 8 */
/* .param p1, "keyCode" # I */
/* .param p2, "msg" # Landroid/view/KeyEvent; */
/* .prologue */
int v4 = 2; // const/4 v4, 0x2
int v7 = 0; // const/4 v7, 0x0
int v6 = 3; // const/4 v6, 0x3
int v5 = 1; // const/4 v5, 0x1
/* .line 754 */
int v3 = 4; // const/4 v3, 0x4
/* if-ne p1, v3, :cond_0 */
/* .line 755 */
/* if-ne v3, v4, :cond_2 */
/* .line 758 */
(( de.nurogames.android.ticb.base.tinysanta ) p0 ).findViewById ( v3 ); // invoke-virtual {p0, v3}, Lde/nurogames/android/ticb/base/tinysanta;->findViewById(I)Landroid/view/View;
/* check-cast v2, Landroid/widget/ViewFlipper; */
/* .line 759 */
/* .local v2, "vf":Landroid/widget/ViewFlipper; */
(( android.widget.ViewFlipper ) v2 ).getChildAt ( v4 ); // invoke-virtual {v2, v4}, Landroid/widget/ViewFlipper;->getChildAt(I)Landroid/view/View;
/* check-cast v1, Lde/nurogames/android/ticb/base/views/TinyBeeView; */
/* .line 762 */
/* .local v1, "game":Lde/nurogames/android/ticb/base/views/TinyBeeView; */
(( de.nurogames.android.ticb.base.views.TinyBeeView ) v1 ).cancelGame ( ); // invoke-virtual {v1}, Lde/nurogames/android/ticb/base/views/TinyBeeView;->cancelGame()V
/* .line 790 */
} // .end local v1 # "game":Lde/nurogames/android/ticb/base/views/TinyBeeView;
} // .end local v2 # "vf":Landroid/widget/ViewFlipper;
} // :cond_0
} // :goto_0
/* const/16 v3, 0x18 */
/* if-ne p1, v3, :cond_5 */
/* .line 791 */
final String v3 = "audio"; // const-string v3, "audio"
(( de.nurogames.android.ticb.base.tinysanta ) p0 ).getSystemService ( v3 ); // invoke-virtual {p0, v3}, Lde/nurogames/android/ticb/base/tinysanta;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v0, Landroid/media/AudioManager; */
/* .line 792 */
/* .local v0, "audioMgr":Landroid/media/AudioManager; */
(( android.media.AudioManager ) v0 ).adjustStreamVolume ( v6, v5, v5 ); // invoke-virtual {v0, v6, v5, v5}, Landroid/media/AudioManager;->adjustStreamVolume(III)V
/* .line 797 */
v3 = (( android.media.AudioManager ) v0 ).getStreamVolume ( v6 ); // invoke-virtual {v0, v6}, Landroid/media/AudioManager;->getStreamVolume(I)I
/* int-to-float v3, v3 */
/* .line 798 */
v4 = (( android.media.AudioManager ) v0 ).getStreamMaxVolume ( v6 ); // invoke-virtual {v0, v6}, Landroid/media/AudioManager;->getStreamMaxVolume(I)I
/* int-to-float v4, v4 */
/* div-float/2addr v3, v4 */
/* .line 800 */
de.nurogames.android.ticb.base.core.AppResources .playSFX ( v7 );
/* .line 815 */
} // .end local v0 # "audioMgr":Landroid/media/AudioManager;
} // :cond_1
} // :goto_1
/* .line 764 */
} // :cond_2
/* if-ne v3, v5, :cond_4 */
/* .line 769 */
v3 = de.nurogames.android.ticb.base.views.MenuView.difficulty_chooser;
/* if-nez v3, :cond_3 */
/* .line 772 */
v3 = de.nurogames.android.ticb.base.tinysanta.data_mngr;
(( de.nurogames.android.ticb.base.core.DataManager ) v3 ).saveSettings ( ); // invoke-virtual {v3}, Lde/nurogames/android/ticb/base/core/DataManager;->saveSettings()V
/* .line 775 */
v3 = de.nurogames.android.ticb.base.tinysanta.data_mngr;
(( de.nurogames.android.ticb.base.core.DataManager ) v3 ).saveHighscores ( v4 ); // invoke-virtual {v3, v4}, Lde/nurogames/android/ticb/base/core/DataManager;->saveHighscores(I)V
/* .line 777 */
java.lang.System .exit ( v5 );
/* .line 780 */
} // :cond_3
int v3 = 0; // const/4 v3, 0x0
/* .line 783 */
} // :cond_4
if ( v3 != null) { // if-eqz v3, :cond_0
/* .line 785 */
de.nurogames.android.ticb.base.tinysanta .flipView ( v5 );
/* .line 802 */
} // :cond_5
/* const/16 v3, 0x19 */
/* if-ne p1, v3, :cond_1 */
/* .line 803 */
final String v3 = "audio"; // const-string v3, "audio"
(( de.nurogames.android.ticb.base.tinysanta ) p0 ).getSystemService ( v3 ); // invoke-virtual {p0, v3}, Lde/nurogames/android/ticb/base/tinysanta;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v0, Landroid/media/AudioManager; */
/* .line 806 */
/* .restart local v0 # "audioMgr":Landroid/media/AudioManager; */
int v3 = -1; // const/4 v3, -0x1
/* .line 804 */
(( android.media.AudioManager ) v0 ).adjustStreamVolume ( v6, v3, v5 ); // invoke-virtual {v0, v6, v3, v5}, Landroid/media/AudioManager;->adjustStreamVolume(III)V
/* .line 809 */
v3 = (( android.media.AudioManager ) v0 ).getStreamVolume ( v6 ); // invoke-virtual {v0, v6}, Landroid/media/AudioManager;->getStreamVolume(I)I
/* int-to-float v3, v3 */
/* .line 810 */
v4 = (( android.media.AudioManager ) v0 ).getStreamMaxVolume ( v6 ); // invoke-virtual {v0, v6}, Landroid/media/AudioManager;->getStreamMaxVolume(I)I
/* int-to-float v4, v4 */
/* div-float/2addr v3, v4 */
/* .line 812 */
de.nurogames.android.ticb.base.core.AppResources .playSFX ( v7 );
} // .end method
protected void onPause ( ) {
/* .locals 1 */
/* .prologue */
/* .line 701 */
/* invoke-super {p0}, Landroid/app/Activity;->onPause()V */
/* .line 703 */
v0 = this.mSensorManager;
(( android.hardware.SensorManager ) v0 ).unregisterListener ( p0 ); // invoke-virtual {v0, p0}, Landroid/hardware/SensorManager;->unregisterListener(Landroid/hardware/SensorEventListener;)V
/* .line 705 */
v0 = this.wl;
(( android.os.PowerManager$WakeLock ) v0 ).release ( ); // invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->release()V
/* .line 707 */
/* invoke-direct {p0}, Lde/nurogames/android/ticb/base/tinysanta;->pauseView()V */
/* .line 708 */
de.nurogames.android.ticb.base.core.AppResources .pauseMusic ( );
/* .line 710 */
return;
} // .end method
protected void onResume ( ) {
/* .locals 3 */
/* .prologue */
/* .line 672 */
/* invoke-super {p0}, Landroid/app/Activity;->onResume()V */
/* .line 674 */
v0 = this.mSensorManager;
v1 = this.mAccelerometer;
int v2 = 0; // const/4 v2, 0x0
(( android.hardware.SensorManager ) v0 ).registerListener ( p0, v1, v2 ); // invoke-virtual {v0, p0, v1, v2}, Landroid/hardware/SensorManager;->registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z
/* .line 676 */
int v1 = 6; // const/4 v1, 0x6
/* if-ne v0, v1, :cond_0 */
/* .line 679 */
/* invoke-direct {p0}, Lde/nurogames/android/ticb/base/tinysanta;->startMarketPingTimer()V */
/* .line 682 */
/* new-instance v0, Lde/nurogames/android/ticb/base/core/InAppMngr; */
/* invoke-direct {v0}, Lde/nurogames/android/ticb/base/core/InAppMngr;-><init>()V */
/* .line 685 */
} // :cond_0
v0 = this.wl;
(( android.os.PowerManager$WakeLock ) v0 ).acquire ( ); // invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->acquire()V
/* .line 687 */
/* invoke-direct {p0}, Lde/nurogames/android/ticb/base/tinysanta;->resumeView()V */
/* .line 688 */
de.nurogames.android.ticb.base.core.AppResources .playMusic ( );
/* .line 690 */
/* sget-boolean v0, Lde/nurogames/android/ticb/base/core/AppResources;->use_chartboost:Z */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 691 */
v0 = de.nurogames.android.ticb.base.tinysanta.chartboost;
(( de.nurogames.android.ticb.base.CBMngr ) v0 ).onResume ( ); // invoke-virtual {v0}, Lde/nurogames/android/ticb/base/CBMngr;->onResume()V
/* .line 693 */
} // :cond_1
return;
} // .end method
public void onSensorChanged ( android.hardware.SensorEvent p0 ) {
/* .locals 2 */
/* .param p1, "arg0" # Landroid/hardware/SensorEvent; */
/* .prologue */
/* .line 827 */
v0 = this.values;
int v1 = 2; // const/4 v1, 0x2
/* aget v0, v0, v1 */
/* iget v1, p0, Lde/nurogames/android/ticb/base/tinysanta;->ROTATED_UPSIDEDOWN:I */
/* int-to-float v1, v1 */
/* cmpg-float v0, v0, v1 */
/* if-gtz v0, :cond_0 */
/* .line 828 */
int v0 = 1; // const/4 v0, 0x1
de.nurogames.android.ticb.base.tinysanta.device_is_upside_down = (v0!= 0);
/* .line 832 */
} // :goto_0
return;
/* .line 830 */
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
de.nurogames.android.ticb.base.tinysanta.device_is_upside_down = (v0!= 0);
} // .end method
protected void onStart ( ) {
/* .locals 4 */
/* .prologue */
/* .line 631 */
/* invoke-super {p0}, Landroid/app/Activity;->onStart()V */
/* .line 633 */
/* sget-boolean v1, Lde/nurogames/android/ticb/base/core/AppResources;->use_flurry:Z */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 634 */
v1 = de.nurogames.android.ticb.base.core.FlurryAnalyticsManager.FLURRY_APP_ID;
com.flurry.android.FlurryAgent .onStartSession ( p0,v1 );
/* .line 636 */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
/* .line 637 */
/* .local v0, "data":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;" */
final String v1 = "vendor"; // const-string v1, "vendor"
v2 = de.nurogames.android.ticb.base.tinysanta.INFO_DEVICE;
/* .line 638 */
final String v1 = "model"; // const-string v1, "model"
v2 = de.nurogames.android.ticb.base.tinysanta.INFO_MODEL;
/* .line 639 */
final String v1 = "display"; // const-string v1, "display"
/* new-instance v2, Ljava/lang/StringBuilder; */
java.lang.String .valueOf ( v3 );
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v3 = "x"; // const-string v3, "x"
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 640 */
final String v1 = "hardware_acceleration"; // const-string v1, "hardware_acceleration"
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
/* sget-boolean v3, Lde/nurogames/android/ticb/base/core/_Display;->isHardwareAccelerated:Z */
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 641 */
final String v1 = "os-version"; // const-string v1, "os-version"
v2 = de.nurogames.android.ticb.base.tinysanta.INFO_OS_VERSION;
/* .line 642 */
final String v1 = "dpi"; // const-string v1, "dpi"
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
v3 = de.nurogames.android.ticb.base.tinysanta.sMetrics;
/* iget v3, v3, Landroid/util/DisplayMetrics;->densityDpi:I */
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 644 */
final String v1 = "CPU_CORES"; // const-string v1, "CPU_CORES"
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
v3 = de.nurogames.android.ticb.base.core.systemDiagnostic .getNumCores ( );
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 645 */
final String v1 = "CPU_DETAILS"; // const-string v1, "CPU_DETAILS"
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
de.nurogames.android.ticb.base.core.systemDiagnostic .readCPUinfo ( );
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 647 */
v1 = de.nurogames.android.ticb.base.core.FlurryAnalyticsManager.EVENT_22_DEVICE_INFO;
int v2 = 1; // const/4 v2, 0x1
de.nurogames.android.ticb.base.core.FlurryAnalyticsManager .logEvent ( v1,v0,v2 );
/* .line 650 */
} // .end local v0 # "data":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
} // :cond_0
/* sget-boolean v1, Lde/nurogames/android/ticb/base/core/AppResources;->use_inapp_market:Z */
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 651 */
v1 = this.mTinyBeePurchaseObserver;
de.nurogames.android.ticb.base.ResponseHandler .register ( v1 );
/* .line 652 */
/* invoke-direct {p0}, Lde/nurogames/android/ticb/base/tinysanta;->initializeOwnedItems()V */
/* .line 655 */
} // :cond_1
return;
} // .end method
protected void onStop ( ) {
/* .locals 4 */
/* .prologue */
/* .line 610 */
/* invoke-super {p0}, Landroid/app/Activity;->onStop()V */
/* .line 612 */
/* sget-boolean v2, Lde/nurogames/android/ticb/base/core/AppResources;->use_inapp_market:Z */
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 613 */
v2 = this.mTinyBeePurchaseObserver;
de.nurogames.android.ticb.base.ResponseHandler .unregister ( v2 );
/* .line 615 */
} // :cond_0
com.flurry.android.FlurryAgent .onEndSession ( p0 );
/* .line 617 */
de.nurogames.android.ticb.base.core.AppResources .pauseMusic ( );
/* .line 619 */
/* sget-boolean v2, Lde/nurogames/android/ticb/base/core/AppResources;->TELEKOM_BUILD:Z */
if ( v2 != null) { // if-eqz v2, :cond_1
/* .line 620 */
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
android.os.Environment .getExternalStorageDirectory ( );
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v3 = "/tinybee_update.apk"; // const-string v3, "/tinybee_update.apk"
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 621 */
/* .local v0, "fileName":Ljava/lang/String; */
/* new-instance v1, Ljava/io/File; */
/* invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V */
/* .line 622 */
/* .local v1, "update":Ljava/io/File; */
v2 = (( java.io.File ) v1 ).exists ( ); // invoke-virtual {v1}, Ljava/io/File;->exists()Z
if ( v2 != null) { // if-eqz v2, :cond_1
/* .line 623 */
(( java.io.File ) v1 ).delete ( ); // invoke-virtual {v1}, Ljava/io/File;->delete()Z
/* .line 627 */
} // .end local v0 # "fileName":Ljava/lang/String;
} // .end local v1 # "update":Ljava/io/File;
} // :cond_1
return;
} // .end method
