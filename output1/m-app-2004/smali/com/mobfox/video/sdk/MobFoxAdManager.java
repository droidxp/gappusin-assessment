public class com.mobfox.video.sdk.MobFoxAdManager {
	 /* .source "MobFoxAdManager.java" */
	 /* # static fields */
	 public static Boolean LOGGING_ENABLED;
	 private static java.util.HashMap sRunningAds;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/HashMap", */
	 /* "<", */
	 /* "Ljava/lang/Long;", */
	 /* "Lcom/mobfox/video/sdk/MobFoxAdManager;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
/* # instance fields */
private android.content.Context mContext;
private Boolean mEnabled;
private android.os.Handler mHandler;
private Boolean mIncludeLocation;
private com.mobfox.video.sdk.MobFoxAdListener mListener;
private Boolean mPreDownload;
private java.lang.String mPublisherId;
private com.mobfox.video.sdk.RequestData mRequest;
private java.lang.Thread mRequestThread;
private com.mobfox.video.sdk.RichMediaAdData mResponse;
private java.lang.String mUniqueId1;
private java.lang.String mUniqueId2;
/* # direct methods */
static com.mobfox.video.sdk.MobFoxAdManager ( ) {
/* .locals 1 */
/* .prologue */
/* .line 18 */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
/* .line 33 */
int v0 = 0; // const/4 v0, 0x0
com.mobfox.video.sdk.MobFoxAdManager.LOGGING_ENABLED = (v0!= 0);
/* .line 16 */
return;
} // .end method
public com.mobfox.video.sdk.MobFoxAdManager ( ) {
/* .locals 2 */
/* .param p1, "ctx" # Landroid/content/Context; */
/* .param p2, "publisherId" # Ljava/lang/String; */
/* .param p3, "includeLocation" # Z */
/* .param p4, "preDownload" # Z */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/IllegalArgumentException; */
/* } */
} // .end annotation
/* .prologue */
int v1 = 0; // const/4 v1, 0x0
int v0 = 1; // const/4 v0, 0x1
/* .line 74 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 27 */
this.mRequest = v1;
/* .line 29 */
/* iput-boolean v0, p0, Lcom/mobfox/video/sdk/MobFoxAdManager;->mEnabled:Z */
/* .line 30 */
/* iput-boolean v0, p0, Lcom/mobfox/video/sdk/MobFoxAdManager;->mPreDownload:Z */
/* .line 77 */
this.mContext = p1;
/* .line 78 */
this.mPublisherId = p2;
/* .line 79 */
/* iput-boolean p3, p0, Lcom/mobfox/video/sdk/MobFoxAdManager;->mIncludeLocation:Z */
/* .line 80 */
this.mRequestThread = v1;
/* .line 81 */
/* new-instance v0, Landroid/os/Handler; */
/* invoke-direct {v0}, Landroid/os/Handler;-><init>()V */
this.mHandler = v0;
/* .line 82 */
/* iput-boolean p4, p0, Lcom/mobfox/video/sdk/MobFoxAdManager;->mPreDownload:Z */
/* .line 83 */
/* invoke-direct {p0}, Lcom/mobfox/video/sdk/MobFoxAdManager;->initialize()V */
/* .line 84 */
return;
} // .end method
static com.mobfox.video.sdk.RequestData access$0 ( com.mobfox.video.sdk.MobFoxAdManager p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 423 */
/* invoke-direct {p0}, Lcom/mobfox/video/sdk/MobFoxAdManager;->getRequest()Lcom/mobfox/video/sdk/RequestData; */
} // .end method
static void access$1 ( com.mobfox.video.sdk.MobFoxAdManager p0, com.mobfox.video.sdk.RichMediaAdData p1 ) { //synthethic
/* .locals 0 */
/* .prologue */
/* .line 31 */
this.mResponse = p1;
return;
} // .end method
static com.mobfox.video.sdk.RichMediaAdData access$2 ( com.mobfox.video.sdk.MobFoxAdManager p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 31 */
v0 = this.mResponse;
} // .end method
static com.mobfox.video.sdk.MobFoxAdListener access$3 ( com.mobfox.video.sdk.MobFoxAdManager p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 28 */
v0 = this.mListener;
} // .end method
static android.os.Handler access$4 ( com.mobfox.video.sdk.MobFoxAdManager p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 26 */
v0 = this.mHandler;
} // .end method
static void access$5 ( com.mobfox.video.sdk.MobFoxAdManager p0, java.lang.Thread p1 ) { //synthethic
/* .locals 0 */
/* .prologue */
/* .line 25 */
this.mRequestThread = p1;
return;
} // .end method
public static void closeRunningAd ( com.mobfox.video.sdk.RichMediaAdData p0, Boolean p1 ) {
/* .locals 5 */
/* .param p0, "ad" # Lcom/mobfox/video/sdk/RichMediaAdData; */
/* .param p1, "result" # Z */
/* .prologue */
int v4 = 3; // const/4 v4, 0x3
/* .line 48 */
v1 = com.mobfox.video.sdk.MobFoxAdManager.sRunningAds;
(( com.mobfox.video.sdk.RichMediaAdData ) p0 ).getTimestamp ( ); // invoke-virtual {p0}, Lcom/mobfox/video/sdk/RichMediaAdData;->getTimestamp()J
/* move-result-wide v2 */
java.lang.Long .valueOf ( v2,v3 );
(( java.util.HashMap ) v1 ).remove ( v2 ); // invoke-virtual {v1, v2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v0, Lcom/mobfox/video/sdk/MobFoxAdManager; */
/* .line 49 */
/* .local v0, "adManager":Lcom/mobfox/video/sdk/MobFoxAdManager; */
/* if-nez v0, :cond_1 */
/* .line 50 */
final String v1 = "MOBFOX"; // const-string v1, "MOBFOX"
v1 = android.util.Log .isLoggable ( v1,v4 );
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 51 */
final String v1 = "MOBFOX"; // const-string v1, "MOBFOX"
/* .line 52 */
/* new-instance v2, Ljava/lang/StringBuilder; */
final String v3 = "Cannot find MobFoxAdManager with running ad:"; // const-string v3, "Cannot find MobFoxAdManager with running ad:"
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* .line 53 */
(( com.mobfox.video.sdk.RichMediaAdData ) p0 ).getTimestamp ( ); // invoke-virtual {p0}, Lcom/mobfox/video/sdk/RichMediaAdData;->getTimestamp()J
/* move-result-wide v3 */
(( java.lang.StringBuilder ) v2 ).append ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
/* .line 52 */
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 51 */
android.util.Log .d ( v1,v2 );
/* .line 63 */
} // :cond_0
} // :goto_0
return;
/* .line 57 */
} // :cond_1
final String v1 = "MOBFOX"; // const-string v1, "MOBFOX"
v1 = android.util.Log .isLoggable ( v1,v4 );
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 58 */
final String v1 = "MOBFOX"; // const-string v1, "MOBFOX"
/* .line 59 */
/* new-instance v2, Ljava/lang/StringBuilder; */
final String v3 = "Notify closing event to MobFoxAdManager with running ad:"; // const-string v3, "Notify closing event to MobFoxAdManager with running ad:"
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* .line 60 */
(( com.mobfox.video.sdk.RichMediaAdData ) p0 ).getTimestamp ( ); // invoke-virtual {p0}, Lcom/mobfox/video/sdk/RichMediaAdData;->getTimestamp()J
/* move-result-wide v3 */
(( java.lang.StringBuilder ) v2 ).append ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
/* .line 59 */
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 58 */
android.util.Log .d ( v1,v2 );
/* .line 62 */
} // :cond_2
/* invoke-direct {v0, p0, p1}, Lcom/mobfox/video/sdk/MobFoxAdManager;->notifyAdClose(Lcom/mobfox/video/sdk/RichMediaAdData;Z)V */
} // .end method
public static com.mobfox.video.sdk.MobFoxAdManager getMobFoxAdManager ( com.mobfox.video.sdk.RichMediaAdData p0 ) {
/* .locals 5 */
/* .param p0, "ad" # Lcom/mobfox/video/sdk/RichMediaAdData; */
/* .prologue */
/* .line 36 */
v1 = com.mobfox.video.sdk.MobFoxAdManager.sRunningAds;
(( com.mobfox.video.sdk.RichMediaAdData ) p0 ).getTimestamp ( ); // invoke-virtual {p0}, Lcom/mobfox/video/sdk/RichMediaAdData;->getTimestamp()J
/* move-result-wide v2 */
java.lang.Long .valueOf ( v2,v3 );
(( java.util.HashMap ) v1 ).remove ( v2 ); // invoke-virtual {v1, v2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v0, Lcom/mobfox/video/sdk/MobFoxAdManager; */
/* .line 37 */
/* .local v0, "adManager":Lcom/mobfox/video/sdk/MobFoxAdManager; */
/* if-nez v0, :cond_0 */
/* .line 38 */
final String v1 = "MOBFOX"; // const-string v1, "MOBFOX"
int v2 = 3; // const/4 v2, 0x3
v1 = android.util.Log .isLoggable ( v1,v2 );
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 39 */
final String v1 = "MOBFOX"; // const-string v1, "MOBFOX"
/* .line 40 */
/* new-instance v2, Ljava/lang/StringBuilder; */
final String v3 = "Cannot find MobFoxAdManager with running ad:"; // const-string v3, "Cannot find MobFoxAdManager with running ad:"
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* .line 41 */
(( com.mobfox.video.sdk.RichMediaAdData ) p0 ).getTimestamp ( ); // invoke-virtual {p0}, Lcom/mobfox/video/sdk/RichMediaAdData;->getTimestamp()J
/* move-result-wide v3 */
(( java.lang.StringBuilder ) v2 ).append ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
/* .line 40 */
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 39 */
android.util.Log .d ( v1,v2 );
/* .line 44 */
} // :cond_0
} // .end method
private com.mobfox.video.sdk.RequestData getRequest ( ) {
/* .locals 6 */
/* .prologue */
int v5 = 3; // const/4 v5, 0x3
/* const-wide/16 v3, 0x0 */
/* .line 424 */
v1 = this.mRequest;
/* if-nez v1, :cond_0 */
/* .line 425 */
/* new-instance v1, Lcom/mobfox/video/sdk/RequestData; */
/* invoke-direct {v1}, Lcom/mobfox/video/sdk/RequestData;-><init>()V */
this.mRequest = v1;
/* .line 426 */
v1 = this.mRequest;
v2 = this.mUniqueId1;
(( com.mobfox.video.sdk.RequestData ) v1 ).setDeviceId ( v2 ); // invoke-virtual {v1, v2}, Lcom/mobfox/video/sdk/RequestData;->setDeviceId(Ljava/lang/String;)V
/* .line 427 */
v1 = this.mRequest;
v2 = this.mUniqueId2;
(( com.mobfox.video.sdk.RequestData ) v1 ).setDeviceId2 ( v2 ); // invoke-virtual {v1, v2}, Lcom/mobfox/video/sdk/RequestData;->setDeviceId2(Ljava/lang/String;)V
/* .line 428 */
v1 = this.mRequest;
v2 = this.mPublisherId;
(( com.mobfox.video.sdk.RequestData ) v1 ).setPublisherId ( v2 ); // invoke-virtual {v1, v2}, Lcom/mobfox/video/sdk/RequestData;->setPublisherId(Ljava/lang/String;)V
/* .line 429 */
v1 = this.mRequest;
(( com.mobfox.video.sdk.MobFoxAdManager ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/mobfox/video/sdk/MobFoxAdManager;->getContext()Landroid/content/Context;
com.mobfox.video.sdk.Util .getDefaultUserAgentString ( v2 );
(( com.mobfox.video.sdk.RequestData ) v1 ).setUserAgent ( v2 ); // invoke-virtual {v1, v2}, Lcom/mobfox/video/sdk/RequestData;->setUserAgent(Ljava/lang/String;)V
/* .line 430 */
v1 = this.mRequest;
com.mobfox.video.sdk.Util .buildUserAgent ( );
(( com.mobfox.video.sdk.RequestData ) v1 ).setUserAgent2 ( v2 ); // invoke-virtual {v1, v2}, Lcom/mobfox/video/sdk/RequestData;->setUserAgent2(Ljava/lang/String;)V
/* .line 432 */
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
/* .line 433 */
/* .local v0, "location":Landroid/location/Location; */
/* iget-boolean v1, p0, Lcom/mobfox/video/sdk/MobFoxAdManager;->mIncludeLocation:Z */
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 434 */
(( com.mobfox.video.sdk.MobFoxAdManager ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/mobfox/video/sdk/MobFoxAdManager;->getContext()Landroid/content/Context;
com.mobfox.video.sdk.Util .getLocation ( v1 );
/* .line 436 */
} // :cond_1
if ( v0 != null) { // if-eqz v0, :cond_4
/* .line 437 */
final String v1 = "MOBFOX"; // const-string v1, "MOBFOX"
v1 = android.util.Log .isLoggable ( v1,v5 );
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 438 */
final String v1 = "MOBFOX"; // const-string v1, "MOBFOX"
/* new-instance v2, Ljava/lang/StringBuilder; */
final String v3 = "location is longitude: "; // const-string v3, "location is longitude: "
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( android.location.Location ) v0 ).getLongitude ( ); // invoke-virtual {v0}, Landroid/location/Location;->getLongitude()D
/* move-result-wide v3 */
(( java.lang.StringBuilder ) v2 ).append ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;
/* .line 439 */
final String v3 = ", latitude: "; // const-string v3, ", latitude: "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( android.location.Location ) v0 ).getLatitude ( ); // invoke-virtual {v0}, Landroid/location/Location;->getLatitude()D
/* move-result-wide v3 */
(( java.lang.StringBuilder ) v2 ).append ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 438 */
android.util.Log .d ( v1,v2 );
/* .line 441 */
} // :cond_2
v1 = this.mRequest;
(( android.location.Location ) v0 ).getLatitude ( ); // invoke-virtual {v0}, Landroid/location/Location;->getLatitude()D
/* move-result-wide v2 */
(( com.mobfox.video.sdk.RequestData ) v1 ).setLatitude ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Lcom/mobfox/video/sdk/RequestData;->setLatitude(D)V
/* .line 442 */
v1 = this.mRequest;
(( android.location.Location ) v0 ).getLongitude ( ); // invoke-virtual {v0}, Landroid/location/Location;->getLongitude()D
/* move-result-wide v2 */
(( com.mobfox.video.sdk.RequestData ) v1 ).setLongitude ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Lcom/mobfox/video/sdk/RequestData;->setLongitude(D)V
/* .line 447 */
} // :goto_0
v1 = this.mRequest;
(( com.mobfox.video.sdk.MobFoxAdManager ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/mobfox/video/sdk/MobFoxAdManager;->getContext()Landroid/content/Context;
com.mobfox.video.sdk.Util .getConnectionType ( v2 );
(( com.mobfox.video.sdk.RequestData ) v1 ).setConnectionType ( v2 ); // invoke-virtual {v1, v2}, Lcom/mobfox/video/sdk/RequestData;->setConnectionType(Ljava/lang/String;)V
/* .line 448 */
v1 = this.mRequest;
com.mobfox.video.sdk.Util .getLocalIpAddress ( );
(( com.mobfox.video.sdk.RequestData ) v1 ).setIpAddress ( v2 ); // invoke-virtual {v1, v2}, Lcom/mobfox/video/sdk/RequestData;->setIpAddress(Ljava/lang/String;)V
/* .line 449 */
v1 = this.mRequest;
java.lang.System .currentTimeMillis ( );
/* move-result-wide v2 */
(( com.mobfox.video.sdk.RequestData ) v1 ).setTimestamp ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Lcom/mobfox/video/sdk/RequestData;->setTimestamp(J)V
/* .line 450 */
final String v1 = "MOBFOX"; // const-string v1, "MOBFOX"
v1 = android.util.Log .isLoggable ( v1,v5 );
if ( v1 != null) { // if-eqz v1, :cond_3
/* .line 451 */
final String v1 = "MOBFOX"; // const-string v1, "MOBFOX"
/* new-instance v2, Ljava/lang/StringBuilder; */
final String v3 = "Getting new request:"; // const-string v3, "Getting new request:"
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v3 = this.mRequest;
(( com.mobfox.video.sdk.RequestData ) v3 ).toString ( ); // invoke-virtual {v3}, Lcom/mobfox/video/sdk/RequestData;->toString()Ljava/lang/String;
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .d ( v1,v2 );
/* .line 453 */
} // :cond_3
v1 = this.mRequest;
/* .line 444 */
} // :cond_4
v1 = this.mRequest;
(( com.mobfox.video.sdk.RequestData ) v1 ).setLatitude ( v3, v4 ); // invoke-virtual {v1, v3, v4}, Lcom/mobfox/video/sdk/RequestData;->setLatitude(D)V
/* .line 445 */
v1 = this.mRequest;
(( com.mobfox.video.sdk.RequestData ) v1 ).setLongitude ( v3, v4 ); // invoke-virtual {v1, v3, v4}, Lcom/mobfox/video/sdk/RequestData;->setLongitude(D)V
} // .end method
private void initialize ( ) {
/* .locals 5 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/IllegalArgumentException; */
/* } */
} // .end annotation
/* .prologue */
int v4 = 3; // const/4 v4, 0x3
int v2 = 0; // const/4 v2, 0x0
/* .line 365 */
final String v1 = "MOBFOX"; // const-string v1, "MOBFOX"
v1 = android.util.Log .isLoggable ( v1,v4 );
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 366 */
final String v1 = "MOBFOX"; // const-string v1, "MOBFOX"
final String v3 = "MobFox Video SDK Version:1.0"; // const-string v3, "MobFox Video SDK Version:1.0"
android.util.Log .d ( v1,v3 );
/* .line 368 */
} // :cond_0
(( com.mobfox.video.sdk.MobFoxAdManager ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/mobfox/video/sdk/MobFoxAdManager;->getContext()Landroid/content/Context;
com.mobfox.video.sdk.Util .getTelephonyDeviceId ( v1 );
this.mUniqueId1 = v1;
/* .line 369 */
(( com.mobfox.video.sdk.MobFoxAdManager ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/mobfox/video/sdk/MobFoxAdManager;->getContext()Landroid/content/Context;
com.mobfox.video.sdk.Util .getDeviceId ( v1 );
this.mUniqueId2 = v1;
/* .line 370 */
v1 = this.mPublisherId;
if ( v1 != null) { // if-eqz v1, :cond_1
v1 = this.mPublisherId;
v1 = (( java.lang.String ) v1 ).length ( ); // invoke-virtual {v1}, Ljava/lang/String;->length()I
/* if-nez v1, :cond_2 */
/* .line 371 */
} // :cond_1
final String v1 = "MOBFOX"; // const-string v1, "MOBFOX"
final String v2 = "Publisher Id cannot be null or empty"; // const-string v2, "Publisher Id cannot be null or empty"
android.util.Log .e ( v1,v2 );
/* .line 372 */
/* new-instance v1, Ljava/lang/IllegalArgumentException; */
/* .line 373 */
final String v2 = "User Id cannot be null or empty"; // const-string v2, "User Id cannot be null or empty"
/* .line 372 */
/* invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v1 */
/* .line 375 */
} // :cond_2
v1 = this.mUniqueId2;
if ( v1 != null) { // if-eqz v1, :cond_3
v1 = this.mUniqueId2;
v1 = (( java.lang.String ) v1 ).length ( ); // invoke-virtual {v1}, Ljava/lang/String;->length()I
/* if-nez v1, :cond_4 */
/* .line 376 */
} // :cond_3
final String v1 = "MOBFOX"; // const-string v1, "MOBFOX"
final String v2 = "Cannot get system device Id"; // const-string v2, "Cannot get system device Id"
android.util.Log .e ( v1,v2 );
/* .line 377 */
/* new-instance v1, Ljava/lang/IllegalArgumentException; */
/* .line 378 */
final String v2 = "System Device Id cannot be null or empty"; // const-string v2, "System Device Id cannot be null or empty"
/* .line 377 */
/* invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v1 */
/* .line 380 */
} // :cond_4
final String v1 = "MOBFOX"; // const-string v1, "MOBFOX"
v1 = android.util.Log .isLoggable ( v1,v4 );
if ( v1 != null) { // if-eqz v1, :cond_5
/* .line 381 */
final String v1 = "MOBFOX"; // const-string v1, "MOBFOX"
/* new-instance v3, Ljava/lang/StringBuilder; */
final String v4 = "MobFox AdManager Publisher Id:"; // const-string v4, "MobFox AdManager Publisher Id:"
/* invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v4 = this.mPublisherId;
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 382 */
final String v4 = " Device Id:"; // const-string v4, " Device Id:"
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v4 = this.mUniqueId1;
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v4 = " DeviceId2:"; // const-string v4, " DeviceId2:"
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v4 = this.mUniqueId2;
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 381 */
android.util.Log .d ( v1,v3 );
/* .line 384 */
} // :cond_5
(( com.mobfox.video.sdk.MobFoxAdManager ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/mobfox/video/sdk/MobFoxAdManager;->getContext()Landroid/content/Context;
v1 = com.mobfox.video.sdk.Util .getMemoryClass ( v1 );
/* const/16 v3, 0x10 */
/* if-le v1, v3, :cond_7 */
int v1 = 1; // const/4 v1, 0x1
} // :goto_0
/* iput-boolean v1, p0, Lcom/mobfox/video/sdk/MobFoxAdManager;->mEnabled:Z */
/* .line 385 */
(( com.mobfox.video.sdk.MobFoxAdManager ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/mobfox/video/sdk/MobFoxAdManager;->getContext()Landroid/content/Context;
com.mobfox.video.sdk.Util .initializeAnimations ( v1 );
/* .line 386 */
(( com.mobfox.video.sdk.MobFoxAdManager ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/mobfox/video/sdk/MobFoxAdManager;->getContext()Landroid/content/Context;
com.mobfox.video.sdk.Util .buildUserAgent ( );
com.mobfox.video.sdk.ResourceManager .downloadResources ( v1,v3,v2 );
/* .line 388 */
com.mobfox.video.sdk.CacheManager .getInstance ( p0 );
/* .line 389 */
/* .local v0, "cache":Lcom/mobfox/video/sdk/CacheManager; */
if ( v0 != null) { // if-eqz v0, :cond_6
/* iget-boolean v1, p0, Lcom/mobfox/video/sdk/MobFoxAdManager;->mPreDownload:Z */
if ( v1 != null) { // if-eqz v1, :cond_6
/* .line 390 */
/* invoke-direct {p0}, Lcom/mobfox/video/sdk/MobFoxAdManager;->getRequest()Lcom/mobfox/video/sdk/RequestData; */
(( com.mobfox.video.sdk.CacheManager ) v0 ).downloadVideoInfo ( v1 ); // invoke-virtual {v0, v1}, Lcom/mobfox/video/sdk/CacheManager;->downloadVideoInfo(Lcom/mobfox/video/sdk/RequestData;)V
/* .line 392 */
} // :cond_6
return;
} // .end local v0 # "cache":Lcom/mobfox/video/sdk/CacheManager;
} // :cond_7
/* move v1, v2 */
/* .line 384 */
} // .end method
private void notifyAdClose ( com.mobfox.video.sdk.RichMediaAdData p0, Boolean p1 ) {
/* .locals 3 */
/* .param p1, "ad" # Lcom/mobfox/video/sdk/RichMediaAdData; */
/* .param p2, "ok" # Z */
/* .prologue */
/* .line 410 */
v0 = this.mListener;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 411 */
final String v0 = "MOBFOX"; // const-string v0, "MOBFOX"
int v1 = 3; // const/4 v1, 0x3
v0 = android.util.Log .isLoggable ( v0,v1 );
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 412 */
final String v0 = "MOBFOX"; // const-string v0, "MOBFOX"
/* new-instance v1, Ljava/lang/StringBuilder; */
final String v2 = "Ad Close.Result:"; // const-string v2, "Ad Close.Result:"
/* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v1 ).append ( p2 ); // invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .d ( v0,v1 );
/* .line 414 */
} // :cond_0
v0 = this.mHandler;
/* new-instance v1, Lcom/mobfox/video/sdk/MobFoxAdManager$4; */
/* invoke-direct {v1, p0, p1, p2}, Lcom/mobfox/video/sdk/MobFoxAdManager$4;-><init>(Lcom/mobfox/video/sdk/MobFoxAdManager;Lcom/mobfox/video/sdk/RichMediaAdData;Z)V */
(( android.os.Handler ) v0 ).post ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
/* .line 421 */
} // :cond_1
return;
} // .end method
private void notifyAdShown ( com.mobfox.video.sdk.RichMediaAdData p0, Boolean p1 ) {
/* .locals 3 */
/* .param p1, "ad" # Lcom/mobfox/video/sdk/RichMediaAdData; */
/* .param p2, "ok" # Z */
/* .prologue */
/* .line 395 */
v0 = this.mListener;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 396 */
final String v0 = "MOBFOX"; // const-string v0, "MOBFOX"
int v1 = 3; // const/4 v1, 0x3
v0 = android.util.Log .isLoggable ( v0,v1 );
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 397 */
final String v0 = "MOBFOX"; // const-string v0, "MOBFOX"
/* new-instance v1, Ljava/lang/StringBuilder; */
final String v2 = "Ad Shown.Result:"; // const-string v2, "Ad Shown.Result:"
/* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v1 ).append ( p2 ); // invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .d ( v0,v1 );
/* .line 399 */
} // :cond_0
v0 = this.mHandler;
/* new-instance v1, Lcom/mobfox/video/sdk/MobFoxAdManager$3; */
/* invoke-direct {v1, p0, p1, p2}, Lcom/mobfox/video/sdk/MobFoxAdManager$3;-><init>(Lcom/mobfox/video/sdk/MobFoxAdManager;Lcom/mobfox/video/sdk/RichMediaAdData;Z)V */
(( android.os.Handler ) v0 ).post ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
/* .line 406 */
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
this.mResponse = v0;
/* .line 407 */
return;
} // .end method
/* # virtual methods */
public android.content.Context getContext ( ) {
/* .locals 1 */
/* .prologue */
/* .line 457 */
v0 = this.mContext;
} // .end method
public android.os.Handler getHandler ( ) {
/* .locals 1 */
/* .prologue */
/* .line 461 */
v0 = this.mHandler;
} // .end method
public Boolean isAdLoaded ( ) {
/* .locals 1 */
/* .prologue */
/* .line 300 */
v0 = this.mResponse;
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public void release ( ) {
/* .locals 1 */
/* .prologue */
/* .line 66 */
com.mobfox.video.sdk.TrackerService .release ( );
/* .line 67 */
com.mobfox.video.sdk.ResourceManager .cancel ( );
/* .line 68 */
com.mobfox.video.sdk.CacheManager .getInstance ( p0 );
/* .line 69 */
/* .local v0, "cache":Lcom/mobfox/video/sdk/CacheManager; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 70 */
(( com.mobfox.video.sdk.CacheManager ) v0 ).cancel ( ); // invoke-virtual {v0}, Lcom/mobfox/video/sdk/CacheManager;->cancel()V
/* .line 72 */
} // :cond_0
return;
} // .end method
public void requestAd ( ) {
/* .locals 2 */
/* .prologue */
int v1 = 5; // const/4 v1, 0x5
/* .line 91 */
/* iget-boolean v0, p0, Lcom/mobfox/video/sdk/MobFoxAdManager;->mEnabled:Z */
/* if-nez v0, :cond_1 */
/* .line 92 */
final String v0 = "MOBFOX"; // const-string v0, "MOBFOX"
v0 = android.util.Log .isLoggable ( v0,v1 );
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 93 */
final String v0 = "MOBFOX"; // const-string v0, "MOBFOX"
final String v1 = "Cannot request rich adds on low memory devices"; // const-string v1, "Cannot request rich adds on low memory devices"
android.util.Log .w ( v0,v1 );
/* .line 192 */
} // :cond_0
} // :goto_0
return;
/* .line 97 */
} // :cond_1
v0 = this.mRequestThread;
/* if-nez v0, :cond_3 */
/* .line 98 */
final String v0 = "MOBFOX"; // const-string v0, "MOBFOX"
int v1 = 3; // const/4 v1, 0x3
v0 = android.util.Log .isLoggable ( v0,v1 );
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 99 */
final String v0 = "MOBFOX"; // const-string v0, "MOBFOX"
final String v1 = "Requesting Ad (v1.0-1.0)"; // const-string v1, "Requesting Ad (v1.0-1.0)"
android.util.Log .d ( v0,v1 );
/* .line 102 */
} // :cond_2
int v0 = 0; // const/4 v0, 0x0
this.mResponse = v0;
/* .line 103 */
/* new-instance v0, Ljava/lang/Thread; */
/* new-instance v1, Lcom/mobfox/video/sdk/MobFoxAdManager$1; */
/* invoke-direct {v1, p0}, Lcom/mobfox/video/sdk/MobFoxAdManager$1;-><init>(Lcom/mobfox/video/sdk/MobFoxAdManager;)V */
/* invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V */
this.mRequestThread = v0;
/* .line 170 */
v0 = this.mRequestThread;
/* .line 171 */
/* new-instance v1, Lcom/mobfox/video/sdk/MobFoxAdManager$2; */
/* invoke-direct {v1, p0}, Lcom/mobfox/video/sdk/MobFoxAdManager$2;-><init>(Lcom/mobfox/video/sdk/MobFoxAdManager;)V */
(( java.lang.Thread ) v0 ).setUncaughtExceptionHandler ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/Thread;->setUncaughtExceptionHandler(Ljava/lang/Thread$UncaughtExceptionHandler;)V
/* .line 186 */
v0 = this.mRequestThread;
(( java.lang.Thread ) v0 ).start ( ); // invoke-virtual {v0}, Ljava/lang/Thread;->start()V
/* .line 188 */
} // :cond_3
final String v0 = "MOBFOX"; // const-string v0, "MOBFOX"
v0 = android.util.Log .isLoggable ( v0,v1 );
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 189 */
final String v0 = "MOBFOX"; // const-string v0, "MOBFOX"
final String v1 = "Request thread already running"; // const-string v1, "Request thread already running"
android.util.Log .w ( v0,v1 );
} // .end method
public void requestAdAndShow ( Long p0 ) {
/* .locals 7 */
/* .param p1, "timeout" # J */
/* .prologue */
/* .line 304 */
v0 = this.mListener;
/* .line 306 */
/* .local v0, "l":Lcom/mobfox/video/sdk/MobFoxAdListener; */
int v5 = 0; // const/4 v5, 0x0
this.mListener = v5;
/* .line 307 */
(( com.mobfox.video.sdk.MobFoxAdManager ) p0 ).requestAd ( ); // invoke-virtual {p0}, Lcom/mobfox/video/sdk/MobFoxAdManager;->requestAd()V
/* .line 308 */
java.lang.System .currentTimeMillis ( );
/* move-result-wide v1 */
/* .line 309 */
/* .local v1, "now":J */
/* add-long v3, v1, p1 */
/* .line 310 */
/* .local v3, "timeoutTime":J */
} // :goto_0
v5 = (( com.mobfox.video.sdk.MobFoxAdManager ) p0 ).isAdLoaded ( ); // invoke-virtual {p0}, Lcom/mobfox/video/sdk/MobFoxAdManager;->isAdLoaded()Z
/* if-nez v5, :cond_0 */
/* cmp-long v5, v1, v3 */
/* if-ltz v5, :cond_1 */
/* .line 317 */
} // :cond_0
this.mListener = v0;
/* .line 318 */
(( com.mobfox.video.sdk.MobFoxAdManager ) p0 ).showAd ( ); // invoke-virtual {p0}, Lcom/mobfox/video/sdk/MobFoxAdManager;->showAd()V
/* .line 319 */
return;
/* .line 312 */
} // :cond_1
/* const-wide/16 v5, 0xc8 */
try { // :try_start_0
java.lang.Thread .sleep ( v5,v6 );
/* :try_end_0 */
/* .catch Ljava/lang/InterruptedException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 315 */
} // :goto_1
java.lang.System .currentTimeMillis ( );
/* move-result-wide v1 */
/* .line 313 */
/* :catch_0 */
/* move-exception v5 */
} // .end method
public void setListener ( com.mobfox.video.sdk.MobFoxAdListener p0 ) {
/* .locals 0 */
/* .param p1, "listener" # Lcom/mobfox/video/sdk/MobFoxAdListener; */
/* .prologue */
/* .line 87 */
this.mListener = p1;
/* .line 88 */
return;
} // .end method
public void showAd ( ) {
/* .locals 10 */
/* .prologue */
int v9 = 0; // const/4 v9, 0x0
/* .line 322 */
(( com.mobfox.video.sdk.MobFoxAdManager ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/mobfox/video/sdk/MobFoxAdManager;->getContext()Landroid/content/Context;
/* check-cast v0, Landroid/app/Activity; */
/* .line 323 */
/* .local v0, "activity":Landroid/app/Activity; */
v7 = this.mResponse;
if ( v7 != null) { // if-eqz v7, :cond_0
/* .line 324 */
v7 = this.mResponse;
v7 = (( com.mobfox.video.sdk.RichMediaAdData ) v7 ).getType ( ); // invoke-virtual {v7}, Lcom/mobfox/video/sdk/RichMediaAdData;->getType()I
if ( v7 != null) { // if-eqz v7, :cond_0
/* .line 325 */
v7 = this.mResponse;
v7 = (( com.mobfox.video.sdk.RichMediaAdData ) v7 ).getType ( ); // invoke-virtual {v7}, Lcom/mobfox/video/sdk/RichMediaAdData;->getType()I
int v8 = -1; // const/4 v8, -0x1
/* if-ne v7, v8, :cond_1 */
/* .line 326 */
} // :cond_0
v7 = this.mResponse;
/* invoke-direct {p0, v7, v9}, Lcom/mobfox/video/sdk/MobFoxAdManager;->notifyAdShown(Lcom/mobfox/video/sdk/RichMediaAdData;Z)V */
/* .line 357 */
} // :goto_0
return;
/* .line 329 */
} // :cond_1
v1 = this.mResponse;
/* .line 330 */
/* .local v1, "ad":Lcom/mobfox/video/sdk/RichMediaAdData; */
int v6 = 0; // const/4 v6, 0x0
/* .line 332 */
/* .local v6, "result":Z */
try { // :try_start_0
(( com.mobfox.video.sdk.MobFoxAdManager ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/mobfox/video/sdk/MobFoxAdManager;->getContext()Landroid/content/Context;
v7 = com.mobfox.video.sdk.Util .isNetworkAvailable ( v7 );
if ( v7 != null) { // if-eqz v7, :cond_4
/* .line 333 */
java.lang.System .currentTimeMillis ( );
/* move-result-wide v7 */
(( com.mobfox.video.sdk.RichMediaAdData ) v1 ).setTimestamp ( v7, v8 ); // invoke-virtual {v1, v7, v8}, Lcom/mobfox/video/sdk/RichMediaAdData;->setTimestamp(J)V
/* .line 334 */
final String v7 = "MOBFOX"; // const-string v7, "MOBFOX"
int v8 = 3; // const/4 v8, 0x3
v7 = android.util.Log .isLoggable ( v7,v8 );
if ( v7 != null) { // if-eqz v7, :cond_2
/* .line 335 */
final String v7 = "MOBFOX"; // const-string v7, "MOBFOX"
/* new-instance v8, Ljava/lang/StringBuilder; */
final String v9 = "Showing Ad:"; // const-string v9, "Showing Ad:"
/* invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v8 ).append ( v1 ); // invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v8 ).toString ( ); // invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .v ( v7,v8 );
/* .line 337 */
} // :cond_2
/* new-instance v5, Landroid/content/Intent; */
/* .line 338 */
/* const-class v7, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity; */
/* .line 337 */
/* invoke-direct {v5, v0, v7}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V */
/* .line 339 */
/* .local v5, "intent":Landroid/content/Intent; */
final String v7 = "MOBFOX_RICH_AD_DATA"; // const-string v7, "MOBFOX_RICH_AD_DATA"
(( android.content.Intent ) v5 ).putExtra ( v7, v1 ); // invoke-virtual {v5, v7, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;
/* .line 340 */
int v7 = 0; // const/4 v7, 0x0
(( android.app.Activity ) v0 ).startActivityForResult ( v5, v7 ); // invoke-virtual {v0, v5, v7}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V
/* .line 341 */
v7 = (( com.mobfox.video.sdk.RichMediaAdData ) v1 ).getAnimation ( ); // invoke-virtual {v1}, Lcom/mobfox/video/sdk/RichMediaAdData;->getAnimation()I
v3 = com.mobfox.video.sdk.Util .getEnterAnimation ( v7 );
/* .line 342 */
/* .local v3, "enterAnim":I */
v7 = (( com.mobfox.video.sdk.RichMediaAdData ) v1 ).getAnimation ( ); // invoke-virtual {v1}, Lcom/mobfox/video/sdk/RichMediaAdData;->getAnimation()I
v4 = com.mobfox.video.sdk.Util .getExitAnimation ( v7 );
/* .line 343 */
/* .local v4, "exitAnim":I */
com.mobfox.video.sdk.MobFoxRichMediaActivity .setActivityAnimation ( v0,v3,v4 );
/* .line 345 */
int v6 = 1; // const/4 v6, 0x1
/* .line 346 */
v7 = com.mobfox.video.sdk.MobFoxAdManager.sRunningAds;
(( com.mobfox.video.sdk.RichMediaAdData ) v1 ).getTimestamp ( ); // invoke-virtual {v1}, Lcom/mobfox/video/sdk/RichMediaAdData;->getTimestamp()J
/* move-result-wide v8 */
java.lang.Long .valueOf ( v8,v9 );
(( java.util.HashMap ) v7 ).put ( v8, p0 ); // invoke-virtual {v7, v8, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 355 */
} // .end local v3 # "enterAnim":I
} // .end local v4 # "exitAnim":I
} // .end local v5 # "intent":Landroid/content/Intent;
} // :cond_3
} // :goto_1
/* invoke-direct {p0, v1, v6}, Lcom/mobfox/video/sdk/MobFoxAdManager;->notifyAdShown(Lcom/mobfox/video/sdk/RichMediaAdData;Z)V */
/* .line 348 */
} // :cond_4
try { // :try_start_1
final String v7 = "MOBFOX"; // const-string v7, "MOBFOX"
int v8 = 3; // const/4 v8, 0x3
v7 = android.util.Log .isLoggable ( v7,v8 );
if ( v7 != null) { // if-eqz v7, :cond_3
/* .line 349 */
final String v7 = "MOBFOX"; // const-string v7, "MOBFOX"
final String v8 = "No network available.Cannot show Ad."; // const-string v8, "No network available.Cannot show Ad."
android.util.Log .d ( v7,v8 );
/* :try_end_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_0 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 352 */
/* :catch_0 */
/* move-exception v2 */
/* .line 353 */
/* .local v2, "e":Ljava/lang/Exception; */
try { // :try_start_2
final String v7 = "MOBFOX"; // const-string v7, "MOBFOX"
final String v8 = "Unknown exception when showing Ad"; // const-string v8, "Unknown exception when showing Ad"
android.util.Log .e ( v7,v8,v2 );
/* :try_end_2 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
/* .line 355 */
/* invoke-direct {p0, v1, v6}, Lcom/mobfox/video/sdk/MobFoxAdManager;->notifyAdShown(Lcom/mobfox/video/sdk/RichMediaAdData;Z)V */
/* goto/16 :goto_0 */
/* .line 354 */
} // .end local v2 # "e":Ljava/lang/Exception;
/* :catchall_0 */
/* move-exception v7 */
/* .line 355 */
/* invoke-direct {p0, v1, v6}, Lcom/mobfox/video/sdk/MobFoxAdManager;->notifyAdShown(Lcom/mobfox/video/sdk/RichMediaAdData;Z)V */
/* .line 356 */
/* throw v7 */
} // .end method
public void showTestAd ( Integer p0 ) {
/* .locals 1 */
/* .param p1, "type" # I */
/* .prologue */
/* .line 360 */
com.mobfox.video.sdk.Util .buildTestAd ( p1 );
this.mResponse = v0;
/* .line 361 */
(( com.mobfox.video.sdk.MobFoxAdManager ) p0 ).showAd ( ); // invoke-virtual {p0}, Lcom/mobfox/video/sdk/MobFoxAdManager;->showAd()V
/* .line 362 */
return;
} // .end method
