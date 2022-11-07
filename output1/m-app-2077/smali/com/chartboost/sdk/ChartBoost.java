public class com.chartboost.sdk.ChartBoost {
	 /* .source "ChartBoost.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/chartboost/sdk/ChartBoost$GenericConnection;, */
	 /* Lcom/chartboost/sdk/ChartBoost$LoadDataConnection; */
	 /* } */
} // .end annotation
/* # static fields */
public static final java.lang.String DEFAULT_LOCATION;
public static final java.lang.String TAG;
private static com.chartboost.sdk.ChartBoost sharedChartBoost;
private static Integer timeoutConnect;
private static Integer timeoutRead;
/* # instance fields */
protected Integer activityHeight;
protected Integer activityWidth;
private java.lang.String appId;
private java.lang.String appSignature;
private java.util.Map cacheMap;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Map", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Lorg/json/JSONObject;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
private java.util.Map connectionMap;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Map", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Lcom/chartboost/sdk/ChartBoost$LoadDataConnection;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
private android.content.Context context;
private com.chartboost.sdk.ChartBoostDelegate delegate;
public Long preloadTime;
/* # direct methods */
static com.chartboost.sdk.ChartBoost ( ) {
/* .locals 2 */
/* .prologue */
/* const/16 v1, 0x7530 */
/* .line 28 */
int v0 = 0; // const/4 v0, 0x0
/* .line 36 */
/* .line 37 */
/* .line 15 */
return;
} // .end method
private com.chartboost.sdk.ChartBoost ( ) {
/* .locals 3 */
/* .prologue */
int v2 = 0; // const/4 v2, 0x0
/* .line 99 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 32 */
/* const-wide/16 v0, 0x0 */
/* iput-wide v0, p0, Lcom/chartboost/sdk/ChartBoost;->preloadTime:J */
/* .line 33 */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
this.cacheMap = v0;
/* .line 34 */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
this.connectionMap = v0;
/* .line 39 */
/* iput v2, p0, Lcom/chartboost/sdk/ChartBoost;->activityWidth:I */
/* .line 40 */
/* iput v2, p0, Lcom/chartboost/sdk/ChartBoost;->activityHeight:I */
/* .line 101 */
return;
} // .end method
static void access$0 ( com.chartboost.sdk.ChartBoost p0, com.chartboost.sdk.CBWebView$CBViewType p1, java.lang.String p2 ) { //synthethic
/* .locals 0 */
/* .prologue */
/* .line 269 */
/* invoke-direct {p0, p1, p2}, Lcom/chartboost/sdk/ChartBoost;->invokeCallbackFailed(Lcom/chartboost/sdk/CBWebView$CBViewType;Ljava/lang/String;)V */
return;
} // .end method
static void access$1 ( com.chartboost.sdk.ChartBoost p0, com.chartboost.sdk.CBWebView$CBViewType p1, java.lang.String p2, org.json.JSONObject p3 ) { //synthethic
/* .locals 0 */
/* .prologue */
/* .line 215 */
/* invoke-direct {p0, p1, p2, p3}, Lcom/chartboost/sdk/ChartBoost;->putCache(Lcom/chartboost/sdk/CBWebView$CBViewType;Ljava/lang/String;Lorg/json/JSONObject;)V */
return;
} // .end method
static void access$2 ( com.chartboost.sdk.ChartBoost p0, com.chartboost.sdk.CBWebView$CBViewType p1, java.lang.String p2 ) { //synthethic
/* .locals 0 */
/* .prologue */
/* .line 336 */
/* invoke-direct {p0, p1, p2}, Lcom/chartboost/sdk/ChartBoost;->showCache(Lcom/chartboost/sdk/CBWebView$CBViewType;Ljava/lang/String;)V */
return;
} // .end method
private Boolean cacheExists ( com.chartboost.sdk.CBWebView$CBViewType p0, java.lang.String p1 ) {
/* .locals 1 */
/* .param p1, "viewType" # Lcom/chartboost/sdk/CBWebView$CBViewType; */
/* .param p2, "location" # Ljava/lang/String; */
/* .prologue */
/* .line 207 */
/* invoke-direct {p0, p1, p2}, Lcom/chartboost/sdk/ChartBoost;->getCache(Lcom/chartboost/sdk/CBWebView$CBViewType;Ljava/lang/String;)Lorg/json/JSONObject; */
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
private org.json.JSONObject getCache ( com.chartboost.sdk.CBWebView$CBViewType p0, java.lang.String p1 ) {
/* .locals 3 */
/* .param p1, "viewType" # Lcom/chartboost/sdk/CBWebView$CBViewType; */
/* .param p2, "location" # Ljava/lang/String; */
/* .prologue */
/* .line 212 */
v0 = this.cacheMap;
/* new-instance v1, Ljava/lang/StringBuilder; */
java.lang.String .valueOf ( p2 );
/* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* check-cast v0, Lorg/json/JSONObject; */
} // .end method
private com.chartboost.sdk.ChartBoost$LoadDataConnection getConnection ( com.chartboost.sdk.CBWebView$CBViewType p0, java.lang.String p1 ) {
/* .locals 3 */
/* .param p1, "viewType" # Lcom/chartboost/sdk/CBWebView$CBViewType; */
/* .param p2, "location" # Ljava/lang/String; */
/* .prologue */
/* .line 224 */
v0 = this.connectionMap;
/* new-instance v1, Ljava/lang/StringBuilder; */
java.lang.String .valueOf ( p2 );
/* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* check-cast v0, Lcom/chartboost/sdk/ChartBoost$LoadDataConnection; */
} // .end method
public static synchronized com.chartboost.sdk.ChartBoost getSharedChartBoost ( android.content.Context p0 ) {
/* .locals 3 */
/* .param p0, "context" # Landroid/content/Context; */
/* .prologue */
/* .line 89 */
/* const-class v1, Lcom/chartboost/sdk/ChartBoost; */
/* monitor-enter v1 */
try { // :try_start_0
v0 = com.chartboost.sdk.ChartBoost.sharedChartBoost;
/* if-nez v0, :cond_0 */
/* .line 90 */
/* new-instance v0, Lcom/chartboost/sdk/ChartBoost; */
/* invoke-direct {v0}, Lcom/chartboost/sdk/ChartBoost;-><init>()V */
/* .line 91 */
} // :cond_0
/* instance-of v0, p0, Landroid/app/Activity; */
/* if-nez v0, :cond_1 */
/* .line 93 */
final String v0 = "ChartBoost"; // const-string v0, "ChartBoost"
final String v2 = "Chartboost context should be instance of activity"; // const-string v2, "Chartboost context should be instance of activity"
android.util.Log .e ( v0,v2 );
/* .line 95 */
} // :cond_1
v0 = com.chartboost.sdk.ChartBoost.sharedChartBoost;
this.context = p0;
/* .line 96 */
v0 = com.chartboost.sdk.ChartBoost.sharedChartBoost;
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* monitor-exit v1 */
/* .line 89 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit v1 */
/* throw v0 */
} // .end method
private void invokeCallbackFailed ( com.chartboost.sdk.CBWebView$CBViewType p0, java.lang.String p1 ) {
/* .locals 1 */
/* .param p1, "viewType" # Lcom/chartboost/sdk/CBWebView$CBViewType; */
/* .param p2, "location" # Ljava/lang/String; */
/* .prologue */
int v0 = 0; // const/4 v0, 0x0
/* .line 271 */
/* invoke-direct {p0, p1, p2, v0}, Lcom/chartboost/sdk/ChartBoost;->putCache(Lcom/chartboost/sdk/CBWebView$CBViewType;Ljava/lang/String;Lorg/json/JSONObject;)V */
/* .line 272 */
/* invoke-direct {p0, p1, p2, v0}, Lcom/chartboost/sdk/ChartBoost;->putConnection(Lcom/chartboost/sdk/CBWebView$CBViewType;Ljava/lang/String;Lcom/chartboost/sdk/ChartBoost$LoadDataConnection;)V */
/* .line 274 */
v0 = this.delegate;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 276 */
v0 = com.chartboost.sdk.CBWebView$CBViewType.CBViewTypeInterstitial;
/* if-ne p1, v0, :cond_0 */
/* .line 278 */
v0 = this.delegate;
(( com.chartboost.sdk.ChartBoostDelegate ) v0 ).didFailToLoadInterstitial ( ); // invoke-virtual {v0}, Lcom/chartboost/sdk/ChartBoostDelegate;->didFailToLoadInterstitial()V
/* .line 280 */
} // :cond_0
v0 = com.chartboost.sdk.CBWebView$CBViewType.CBViewTypeMoreApps;
/* if-ne p1, v0, :cond_1 */
/* .line 282 */
v0 = this.delegate;
(( com.chartboost.sdk.ChartBoostDelegate ) v0 ).didFailToLoadMoreApps ( ); // invoke-virtual {v0}, Lcom/chartboost/sdk/ChartBoostDelegate;->didFailToLoadMoreApps()V
/* .line 285 */
} // :cond_1
return;
} // .end method
private void loadChartBoostView ( org.json.JSONObject p0, com.chartboost.sdk.CBWebView$CBViewType p1 ) {
/* .locals 3 */
/* .param p1, "response" # Lorg/json/JSONObject; */
/* .param p2, "type" # Lcom/chartboost/sdk/CBWebView$CBViewType; */
/* .prologue */
/* .line 387 */
/* new-instance v0, Landroid/content/Intent; */
v1 = this.context;
/* const-class v2, Lcom/chartboost/sdk/CBDialogActivity; */
/* invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V */
/* .line 389 */
/* .local v0, "i":Landroid/content/Intent; */
final String v1 = "bk_type"; // const-string v1, "bk_type"
v2 = (( com.chartboost.sdk.CBWebView$CBViewType ) p2 ).ordinal ( ); // invoke-virtual {p2}, Lcom/chartboost/sdk/CBWebView$CBViewType;->ordinal()I
(( android.content.Intent ) v0 ).putExtra ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
/* .line 392 */
final String v1 = "bk_cfgo"; // const-string v1, "bk_cfgo"
(( org.json.JSONObject ) p1 ).toString ( ); // invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
(( android.content.Intent ) v0 ).putExtra ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
/* .line 395 */
v1 = this.context;
(( android.content.Context ) v1 ).startActivity ( v0 ); // invoke-virtual {v1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
/* .line 396 */
return;
} // .end method
private void putCache ( com.chartboost.sdk.CBWebView$CBViewType p0, java.lang.String p1, org.json.JSONObject p2 ) {
/* .locals 3 */
/* .param p1, "viewType" # Lcom/chartboost/sdk/CBWebView$CBViewType; */
/* .param p2, "location" # Ljava/lang/String; */
/* .param p3, "object" # Lorg/json/JSONObject; */
/* .prologue */
/* .line 217 */
/* new-instance v1, Ljava/lang/StringBuilder; */
java.lang.String .valueOf ( p2 );
/* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 218 */
/* .local v0, "key":Ljava/lang/String; */
/* if-nez p3, :cond_0 */
v1 = this.cacheMap;
/* .line 220 */
} // :goto_0
return;
/* .line 219 */
} // :cond_0
v1 = this.cacheMap;
} // .end method
private void putConnection ( com.chartboost.sdk.CBWebView$CBViewType p0, java.lang.String p1, com.chartboost.sdk.ChartBoost$LoadDataConnection p2 ) {
/* .locals 3 */
/* .param p1, "viewType" # Lcom/chartboost/sdk/CBWebView$CBViewType; */
/* .param p2, "location" # Ljava/lang/String; */
/* .param p3, "object" # Lcom/chartboost/sdk/ChartBoost$LoadDataConnection; */
/* .prologue */
/* .line 229 */
/* new-instance v1, Ljava/lang/StringBuilder; */
java.lang.String .valueOf ( p2 );
/* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 230 */
/* .local v0, "key":Ljava/lang/String; */
/* if-nez p3, :cond_0 */
v1 = this.connectionMap;
/* .line 232 */
} // :goto_0
return;
/* .line 231 */
} // :cond_0
v1 = this.connectionMap;
} // .end method
private void showCache ( com.chartboost.sdk.CBWebView$CBViewType p0, java.lang.String p1 ) {
/* .locals 7 */
/* .param p1, "viewType" # Lcom/chartboost/sdk/CBWebView$CBViewType; */
/* .param p2, "location" # Ljava/lang/String; */
/* .prologue */
int v4 = 0; // const/4 v4, 0x0
/* .line 339 */
/* invoke-direct {p0, p1, p2}, Lcom/chartboost/sdk/ChartBoost;->getCache(Lcom/chartboost/sdk/CBWebView$CBViewType;Ljava/lang/String;)Lorg/json/JSONObject; */
/* .line 340 */
/* .local v0, "cache":Lorg/json/JSONObject; */
/* invoke-direct {p0, p1, p2, v4}, Lcom/chartboost/sdk/ChartBoost;->putCache(Lcom/chartboost/sdk/CBWebView$CBViewType;Ljava/lang/String;Lorg/json/JSONObject;)V */
/* .line 341 */
/* invoke-direct {p0, p1, p2, v4}, Lcom/chartboost/sdk/ChartBoost;->putConnection(Lcom/chartboost/sdk/CBWebView$CBViewType;Ljava/lang/String;Lcom/chartboost/sdk/ChartBoost$LoadDataConnection;)V */
/* .line 347 */
try { // :try_start_0
v4 = com.chartboost.sdk.CBWebView$CBViewType.CBViewTypeInterstitial;
/* if-ne p1, v4, :cond_0 */
/* .line 350 */
/* new-instance v3, Lcom/chartboost/sdk/CBAPIRequest; */
v4 = this.context;
final String v5 = "api"; // const-string v5, "api"
final String v6 = "show"; // const-string v6, "show"
/* invoke-direct {v3, v4, v5, v6}, Lcom/chartboost/sdk/CBAPIRequest;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V */
/* .line 351 */
/* .local v3, "request":Lcom/chartboost/sdk/CBAPIRequest; */
(( com.chartboost.sdk.CBAPIRequest ) v3 ).appendDeviceInfoParams ( ); // invoke-virtual {v3}, Lcom/chartboost/sdk/CBAPIRequest;->appendDeviceInfoParams()V
/* .line 352 */
final String v4 = "ad_id"; // const-string v4, "ad_id"
final String v5 = "ad_id"; // const-string v5, "ad_id"
(( org.json.JSONObject ) v0 ).getString ( v5 ); // invoke-virtual {v0, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
(( com.chartboost.sdk.CBAPIRequest ) v3 ).appendBodyArgument ( v4, v5 ); // invoke-virtual {v3, v4, v5}, Lcom/chartboost/sdk/CBAPIRequest;->appendBodyArgument(Ljava/lang/String;Ljava/lang/String;)V
/* .line 353 */
v4 = this.appId;
v5 = this.appSignature;
(( com.chartboost.sdk.CBAPIRequest ) v3 ).sign ( v4, v5 ); // invoke-virtual {v3, v4, v5}, Lcom/chartboost/sdk/CBAPIRequest;->sign(Ljava/lang/String;Ljava/lang/String;)V
/* .line 355 */
/* new-instance v2, Lcom/chartboost/sdk/ChartBoost$GenericConnection; */
v4 = this.context;
/* invoke-direct {v2, p0, v4}, Lcom/chartboost/sdk/ChartBoost$GenericConnection;-><init>(Lcom/chartboost/sdk/ChartBoost;Landroid/content/Context;)V */
/* .line 356 */
/* .local v2, "gc":Lcom/chartboost/sdk/ChartBoost$GenericConnection; */
int v4 = 1; // const/4 v4, 0x1
/* new-array v4, v4, [Lcom/chartboost/sdk/CBAPIRequest; */
int v5 = 0; // const/4 v5, 0x0
/* aput-object v3, v4, v5 */
(( com.chartboost.sdk.ChartBoost$GenericConnection ) v2 ).execute ( v4 ); // invoke-virtual {v2, v4}, Lcom/chartboost/sdk/ChartBoost$GenericConnection;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 371 */
} // .end local v2 # "gc":Lcom/chartboost/sdk/ChartBoost$GenericConnection;
} // .end local v3 # "request":Lcom/chartboost/sdk/CBAPIRequest;
} // :cond_0
} // :goto_0
/* invoke-direct {p0, v0, p1}, Lcom/chartboost/sdk/ChartBoost;->loadChartBoostView(Lorg/json/JSONObject;Lcom/chartboost/sdk/CBWebView$CBViewType;)V */
/* .line 372 */
return;
/* .line 364 */
/* :catch_0 */
/* move-exception v1 */
/* .line 365 */
/* .local v1, "e":Ljava/lang/Exception; */
final String v4 = "ChartBoost"; // const-string v4, "ChartBoost"
final String v5 = "error generating request!"; // const-string v5, "error generating request!"
android.util.Log .e ( v4,v5 );
} // .end method
private void showView ( com.chartboost.sdk.CBWebView$CBViewType p0, java.lang.String p1, java.lang.Boolean p2 ) {
/* .locals 8 */
/* .param p1, "viewType" # Lcom/chartboost/sdk/CBWebView$CBViewType; */
/* .param p2, "location" # Ljava/lang/String; */
/* .param p3, "shouldCache" # Ljava/lang/Boolean; */
/* .prologue */
int v6 = 0; // const/4 v6, 0x0
int v5 = 1; // const/4 v5, 0x1
/* .line 290 */
v7 = com.chartboost.sdk.CBWebView$CBViewType.CBViewTypeInterstitial;
/* if-ne p1, v7, :cond_1 */
} // :goto_0
java.lang.Boolean .valueOf ( v5 );
/* .line 291 */
/* .local v0, "isInterstitial":Ljava/lang/Boolean; */
v5 = /* invoke-direct {p0, p1, p2}, Lcom/chartboost/sdk/ChartBoost;->cacheExists(Lcom/chartboost/sdk/CBWebView$CBViewType;Ljava/lang/String;)Z */
if ( v5 != null) { // if-eqz v5, :cond_2
/* .line 292 */
/* invoke-direct {p0, p1, p2}, Lcom/chartboost/sdk/ChartBoost;->showCache(Lcom/chartboost/sdk/CBWebView$CBViewType;Ljava/lang/String;)V */
/* .line 334 */
} // :cond_0
} // :goto_1
return;
} // .end local v0 # "isInterstitial":Ljava/lang/Boolean;
} // :cond_1
/* move v5, v6 */
/* .line 290 */
/* .line 296 */
/* .restart local v0 # "isInterstitial":Ljava/lang/Boolean; */
} // :cond_2
v5 = this.delegate;
if ( v5 != null) { // if-eqz v5, :cond_3
/* .line 297 */
v5 = (( java.lang.Boolean ) v0 ).booleanValue ( ); // invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
if ( v5 != null) { // if-eqz v5, :cond_6
v5 = this.delegate;
v5 = (( com.chartboost.sdk.ChartBoostDelegate ) v5 ).shouldRequestInterstitial ( ); // invoke-virtual {v5}, Lcom/chartboost/sdk/ChartBoostDelegate;->shouldRequestInterstitial()Z
} // :goto_2
java.lang.Boolean .valueOf ( v5 );
/* .line 298 */
/* .local v4, "shouldShowView":Ljava/lang/Boolean; */
v5 = (( java.lang.Boolean ) v4 ).booleanValue ( ); // invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z
if ( v5 != null) { // if-eqz v5, :cond_0
/* .line 301 */
} // .end local v4 # "shouldShowView":Ljava/lang/Boolean;
} // :cond_3
/* invoke-direct {p0, p1, p2}, Lcom/chartboost/sdk/ChartBoost;->getConnection(Lcom/chartboost/sdk/CBWebView$CBViewType;Ljava/lang/String;)Lcom/chartboost/sdk/ChartBoost$LoadDataConnection; */
/* .line 302 */
/* .local v1, "ldc":Lcom/chartboost/sdk/ChartBoost$LoadDataConnection; */
/* if-nez v1, :cond_9 */
/* .line 304 */
/* new-instance v3, Lcom/chartboost/sdk/CBAPIRequest; */
v6 = this.context;
final String v7 = "api"; // const-string v7, "api"
v5 = (( java.lang.Boolean ) v0 ).booleanValue ( ); // invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
if ( v5 != null) { // if-eqz v5, :cond_7
final String v5 = "get"; // const-string v5, "get"
} // :goto_3
/* invoke-direct {v3, v6, v7, v5}, Lcom/chartboost/sdk/CBAPIRequest;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V */
/* .line 307 */
/* .local v3, "request":Lcom/chartboost/sdk/CBAPIRequest; */
try { // :try_start_0
(( com.chartboost.sdk.CBAPIRequest ) v3 ).appendDeviceInfoParams ( ); // invoke-virtual {v3}, Lcom/chartboost/sdk/CBAPIRequest;->appendDeviceInfoParams()V
/* .line 308 */
v5 = (( java.lang.Boolean ) v0 ).booleanValue ( ); // invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
if ( v5 != null) { // if-eqz v5, :cond_4
final String v5 = "location"; // const-string v5, "location"
(( com.chartboost.sdk.CBAPIRequest ) v3 ).appendBodyArgument ( v5, p2 ); // invoke-virtual {v3, v5, p2}, Lcom/chartboost/sdk/CBAPIRequest;->appendBodyArgument(Ljava/lang/String;Ljava/lang/String;)V
/* .line 309 */
} // :cond_4
v5 = this.appId;
v6 = this.appSignature;
(( com.chartboost.sdk.CBAPIRequest ) v3 ).sign ( v5, v6 ); // invoke-virtual {v3, v5, v6}, Lcom/chartboost/sdk/CBAPIRequest;->sign(Ljava/lang/String;Ljava/lang/String;)V
/* .line 310 */
/* new-instance v2, Lcom/chartboost/sdk/ChartBoost$LoadDataConnection; */
v5 = this.context;
/* invoke-direct {v2, p0, v5}, Lcom/chartboost/sdk/ChartBoost$LoadDataConnection;-><init>(Lcom/chartboost/sdk/ChartBoost;Landroid/content/Context;)V */
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_1 */
/* .line 311 */
} // .end local v1 # "ldc":Lcom/chartboost/sdk/ChartBoost$LoadDataConnection;
/* .local v2, "ldc":Lcom/chartboost/sdk/ChartBoost$LoadDataConnection; */
try { // :try_start_1
v5 = (( java.lang.Boolean ) p3 ).booleanValue ( ); // invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z
/* iput-boolean v5, v2, Lcom/chartboost/sdk/ChartBoost$LoadDataConnection;->shouldCache:Z */
/* .line 312 */
v5 = com.chartboost.sdk.CBWebView$CBViewType.CBViewTypeMoreApps;
/* if-ne p1, v5, :cond_5 */
v5 = (( java.lang.Boolean ) p3 ).booleanValue ( ); // invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z
/* if-nez v5, :cond_5 */
/* .line 313 */
v5 = this.delegate;
if ( v5 != null) { // if-eqz v5, :cond_8
/* .line 315 */
v5 = this.delegate;
v5 = (( com.chartboost.sdk.ChartBoostDelegate ) v5 ).shouldDisplayLoadingViewForMoreApps ( ); // invoke-virtual {v5}, Lcom/chartboost/sdk/ChartBoostDelegate;->shouldDisplayLoadingViewForMoreApps()Z
/* iput-boolean v5, v2, Lcom/chartboost/sdk/ChartBoost$LoadDataConnection;->shouldShowProgress:Z */
/* .line 319 */
} // :cond_5
} // :goto_4
this.viewType = p1;
/* .line 320 */
this.location = p2;
/* .line 321 */
/* invoke-direct {p0, p1, p2, v2}, Lcom/chartboost/sdk/ChartBoost;->putConnection(Lcom/chartboost/sdk/CBWebView$CBViewType;Ljava/lang/String;Lcom/chartboost/sdk/ChartBoost$LoadDataConnection;)V */
/* .line 322 */
int v5 = 1; // const/4 v5, 0x1
/* new-array v5, v5, [Lcom/chartboost/sdk/CBAPIRequest; */
int v6 = 0; // const/4 v6, 0x0
/* aput-object v3, v5, v6 */
(( com.chartboost.sdk.ChartBoost$LoadDataConnection ) v2 ).execute ( v5 ); // invoke-virtual {v2, v5}, Lcom/chartboost/sdk/ChartBoost$LoadDataConnection;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;
/* :try_end_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_0 */
/* .line 323 */
/* :catch_0 */
/* move-exception v5 */
/* move-object v1, v2 */
} // .end local v2 # "ldc":Lcom/chartboost/sdk/ChartBoost$LoadDataConnection;
/* .restart local v1 # "ldc":Lcom/chartboost/sdk/ChartBoost$LoadDataConnection; */
/* .line 297 */
} // .end local v1 # "ldc":Lcom/chartboost/sdk/ChartBoost$LoadDataConnection;
} // .end local v3 # "request":Lcom/chartboost/sdk/CBAPIRequest;
} // :cond_6
v5 = this.delegate;
v5 = (( com.chartboost.sdk.ChartBoostDelegate ) v5 ).shouldRequestMoreApps ( ); // invoke-virtual {v5}, Lcom/chartboost/sdk/ChartBoostDelegate;->shouldRequestMoreApps()Z
/* .line 304 */
/* .restart local v1 # "ldc":Lcom/chartboost/sdk/ChartBoost$LoadDataConnection; */
} // :cond_7
final String v5 = "more"; // const-string v5, "more"
/* .line 317 */
} // .end local v1 # "ldc":Lcom/chartboost/sdk/ChartBoost$LoadDataConnection;
/* .restart local v2 # "ldc":Lcom/chartboost/sdk/ChartBoost$LoadDataConnection; */
/* .restart local v3 # "request":Lcom/chartboost/sdk/CBAPIRequest; */
} // :cond_8
int v5 = 1; // const/4 v5, 0x1
try { // :try_start_2
/* iput-boolean v5, v2, Lcom/chartboost/sdk/ChartBoost$LoadDataConnection;->shouldShowProgress:Z */
/* :try_end_2 */
/* .catch Ljava/lang/Exception; {:try_start_2 ..:try_end_2} :catch_0 */
/* .line 330 */
} // .end local v2 # "ldc":Lcom/chartboost/sdk/ChartBoost$LoadDataConnection;
} // .end local v3 # "request":Lcom/chartboost/sdk/CBAPIRequest;
/* .restart local v1 # "ldc":Lcom/chartboost/sdk/ChartBoost$LoadDataConnection; */
} // :cond_9
v5 = (( java.lang.Boolean ) p3 ).booleanValue ( ); // invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z
/* if-nez v5, :cond_0 */
v5 = (( java.lang.Boolean ) p3 ).booleanValue ( ); // invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z
/* iput-boolean v5, v1, Lcom/chartboost/sdk/ChartBoost$LoadDataConnection;->shouldCache:Z */
/* goto/16 :goto_1 */
/* .line 323 */
/* .restart local v3 # "request":Lcom/chartboost/sdk/CBAPIRequest; */
/* :catch_1 */
/* move-exception v5 */
/* goto/16 :goto_1 */
} // .end method
/* # virtual methods */
public void cacheInterstitial ( ) {
/* .locals 3 */
/* .prologue */
/* .line 156 */
v0 = com.chartboost.sdk.CBWebView$CBViewType.CBViewTypeInterstitial;
final String v1 = "Default"; // const-string v1, "Default"
int v2 = 1; // const/4 v2, 0x1
java.lang.Boolean .valueOf ( v2 );
/* invoke-direct {p0, v0, v1, v2}, Lcom/chartboost/sdk/ChartBoost;->showView(Lcom/chartboost/sdk/CBWebView$CBViewType;Ljava/lang/String;Ljava/lang/Boolean;)V */
/* .line 157 */
return;
} // .end method
public void cacheInterstitial ( java.lang.String p0 ) {
/* .locals 2 */
/* .param p1, "location" # Ljava/lang/String; */
/* .prologue */
/* .line 163 */
v0 = com.chartboost.sdk.CBWebView$CBViewType.CBViewTypeInterstitial;
int v1 = 1; // const/4 v1, 0x1
java.lang.Boolean .valueOf ( v1 );
/* invoke-direct {p0, v0, p1, v1}, Lcom/chartboost/sdk/ChartBoost;->showView(Lcom/chartboost/sdk/CBWebView$CBViewType;Ljava/lang/String;Ljava/lang/Boolean;)V */
/* .line 164 */
return;
} // .end method
public void cacheMoreApps ( ) {
/* .locals 3 */
/* .prologue */
/* .line 177 */
v0 = com.chartboost.sdk.CBWebView$CBViewType.CBViewTypeMoreApps;
final String v1 = "Default"; // const-string v1, "Default"
int v2 = 1; // const/4 v2, 0x1
java.lang.Boolean .valueOf ( v2 );
/* invoke-direct {p0, v0, v1, v2}, Lcom/chartboost/sdk/ChartBoost;->showView(Lcom/chartboost/sdk/CBWebView$CBViewType;Ljava/lang/String;Ljava/lang/Boolean;)V */
/* .line 178 */
return;
} // .end method
public void clearCache ( ) {
/* .locals 2 */
/* .prologue */
/* .line 411 */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
this.cacheMap = v0;
/* .line 412 */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
this.connectionMap = v0;
/* .line 413 */
/* const-wide/16 v0, 0x0 */
/* iput-wide v0, p0, Lcom/chartboost/sdk/ChartBoost;->preloadTime:J */
/* .line 414 */
return;
} // .end method
public java.lang.String getAppId ( ) {
/* .locals 1 */
/* .prologue */
/* .line 48 */
v0 = this.appId;
} // .end method
public java.lang.String getAppSignature ( ) {
/* .locals 1 */
/* .prologue */
/* .line 61 */
v0 = this.appSignature;
} // .end method
public android.content.Context getContext ( ) {
/* .locals 1 */
/* .prologue */
/* .line 403 */
v0 = this.context;
} // .end method
public com.chartboost.sdk.ChartBoostDelegate getDelegate ( ) {
/* .locals 1 */
/* .prologue */
/* .line 74 */
v0 = this.delegate;
} // .end method
public Integer getTimeoutConnect ( ) {
/* .locals 1 */
/* .prologue */
/* .line 429 */
} // .end method
public Integer getTimeoutRead ( ) {
/* .locals 1 */
/* .prologue */
/* .line 433 */
} // .end method
public Boolean hasCachedInterstitial ( ) {
/* .locals 2 */
/* .prologue */
/* .line 194 */
v0 = com.chartboost.sdk.CBWebView$CBViewType.CBViewTypeInterstitial;
final String v1 = "Default"; // const-string v1, "Default"
v0 = /* invoke-direct {p0, v0, v1}, Lcom/chartboost/sdk/ChartBoost;->cacheExists(Lcom/chartboost/sdk/CBWebView$CBViewType;Ljava/lang/String;)Z */
} // .end method
public Boolean hasCachedInterstitial ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p1, "location" # Ljava/lang/String; */
/* .prologue */
/* .line 202 */
v0 = com.chartboost.sdk.CBWebView$CBViewType.CBViewTypeInterstitial;
v0 = /* invoke-direct {p0, v0, p1}, Lcom/chartboost/sdk/ChartBoost;->cacheExists(Lcom/chartboost/sdk/CBWebView$CBViewType;Ljava/lang/String;)Z */
} // .end method
public Boolean hasCachedMoreApps ( ) {
/* .locals 2 */
/* .prologue */
/* .line 185 */
v0 = com.chartboost.sdk.CBWebView$CBViewType.CBViewTypeMoreApps;
final String v1 = "Default"; // const-string v1, "Default"
v0 = /* invoke-direct {p0, v0, v1}, Lcom/chartboost/sdk/ChartBoost;->cacheExists(Lcom/chartboost/sdk/CBWebView$CBViewType;Ljava/lang/String;)Z */
} // .end method
public void install ( ) {
/* .locals 6 */
/* .prologue */
/* .line 108 */
try { // :try_start_0
/* new-instance v2, Lcom/chartboost/sdk/CBAPIRequest; */
v3 = this.context;
final String v4 = "api"; // const-string v4, "api"
final String v5 = "install"; // const-string v5, "install"
/* invoke-direct {v2, v3, v4, v5}, Lcom/chartboost/sdk/CBAPIRequest;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V */
/* .line 109 */
/* .local v2, "request":Lcom/chartboost/sdk/CBAPIRequest; */
(( com.chartboost.sdk.CBAPIRequest ) v2 ).appendDeviceInfoParams ( ); // invoke-virtual {v2}, Lcom/chartboost/sdk/CBAPIRequest;->appendDeviceInfoParams()V
/* .line 110 */
v3 = this.appId;
v4 = this.appSignature;
(( com.chartboost.sdk.CBAPIRequest ) v2 ).sign ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Lcom/chartboost/sdk/CBAPIRequest;->sign(Ljava/lang/String;Ljava/lang/String;)V
/* .line 111 */
/* new-instance v1, Lcom/chartboost/sdk/ChartBoost$GenericConnection; */
v3 = this.context;
/* invoke-direct {v1, p0, v3}, Lcom/chartboost/sdk/ChartBoost$GenericConnection;-><init>(Lcom/chartboost/sdk/ChartBoost;Landroid/content/Context;)V */
/* .line 112 */
/* .local v1, "gc":Lcom/chartboost/sdk/ChartBoost$GenericConnection; */
int v3 = 1; // const/4 v3, 0x1
/* new-array v3, v3, [Lcom/chartboost/sdk/CBAPIRequest; */
int v4 = 0; // const/4 v4, 0x0
/* aput-object v2, v3, v4 */
(( com.chartboost.sdk.ChartBoost$GenericConnection ) v1 ).execute ( v3 ); // invoke-virtual {v1, v3}, Lcom/chartboost/sdk/ChartBoost$GenericConnection;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 117 */
} // .end local v1 # "gc":Lcom/chartboost/sdk/ChartBoost$GenericConnection;
} // .end local v2 # "request":Lcom/chartboost/sdk/CBAPIRequest;
} // :goto_0
return;
/* .line 114 */
/* :catch_0 */
/* move-exception v0 */
/* .line 115 */
/* .local v0, "e":Ljava/lang/Exception; */
(( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
} // .end method
public void setAppId ( java.lang.String p0 ) {
/* .locals 0 */
/* .param p1, "appId" # Ljava/lang/String; */
/* .prologue */
/* .line 54 */
this.appId = p1;
/* .line 55 */
return;
} // .end method
public void setAppSignature ( java.lang.String p0 ) {
/* .locals 0 */
/* .param p1, "appSignature" # Ljava/lang/String; */
/* .prologue */
/* .line 67 */
this.appSignature = p1;
/* .line 68 */
return;
} // .end method
public void setConnectionTimeout ( Integer p0 ) {
/* .locals 3 */
/* .param p1, "time_millis" # I */
/* .prologue */
/* const/16 v2, 0x2710 */
/* .line 418 */
/* if-ge p1, v2, :cond_0 */
final String v0 = "ChartBoost"; // const-string v0, "ChartBoost"
final String v1 = "Timeout less than minimum of 10000 milliseconds"; // const-string v1, "Timeout less than minimum of 10000 milliseconds"
android.util.Log .w ( v0,v1 );
/* .line 419 */
} // :cond_0
v0 = java.lang.Math .max ( p1,v2 );
/* .line 420 */
return;
} // .end method
public void setDelegate ( com.chartboost.sdk.ChartBoostDelegate p0 ) {
/* .locals 0 */
/* .param p1, "delegate" # Lcom/chartboost/sdk/ChartBoostDelegate; */
/* .prologue */
/* .line 80 */
this.delegate = p1;
/* .line 81 */
return;
} // .end method
public void setReadTimeout ( Integer p0 ) {
/* .locals 3 */
/* .param p1, "time_millis" # I */
/* .prologue */
/* const/16 v2, 0x2710 */
/* .line 424 */
/* if-ge p1, v2, :cond_0 */
final String v0 = "ChartBoost"; // const-string v0, "ChartBoost"
final String v1 = "Timeout less than minimum of 10000 milliseconds"; // const-string v1, "Timeout less than minimum of 10000 milliseconds"
android.util.Log .w ( v0,v1 );
/* .line 425 */
} // :cond_0
v0 = java.lang.Math .max ( p1,v2 );
/* .line 426 */
return;
} // .end method
public void showInterstitial ( ) {
/* .locals 3 */
/* .prologue */
/* .line 141 */
v0 = com.chartboost.sdk.CBWebView$CBViewType.CBViewTypeInterstitial;
final String v1 = "Default"; // const-string v1, "Default"
int v2 = 0; // const/4 v2, 0x0
java.lang.Boolean .valueOf ( v2 );
/* invoke-direct {p0, v0, v1, v2}, Lcom/chartboost/sdk/ChartBoost;->showView(Lcom/chartboost/sdk/CBWebView$CBViewType;Ljava/lang/String;Ljava/lang/Boolean;)V */
/* .line 142 */
return;
} // .end method
public void showInterstitial ( java.lang.String p0 ) {
/* .locals 2 */
/* .param p1, "location" # Ljava/lang/String; */
/* .prologue */
/* .line 148 */
v0 = com.chartboost.sdk.CBWebView$CBViewType.CBViewTypeInterstitial;
int v1 = 0; // const/4 v1, 0x0
java.lang.Boolean .valueOf ( v1 );
/* invoke-direct {p0, v0, p1, v1}, Lcom/chartboost/sdk/ChartBoost;->showView(Lcom/chartboost/sdk/CBWebView$CBViewType;Ljava/lang/String;Ljava/lang/Boolean;)V */
/* .line 149 */
return;
} // .end method
public void showMoreApps ( ) {
/* .locals 3 */
/* .prologue */
/* .line 170 */
v0 = com.chartboost.sdk.CBWebView$CBViewType.CBViewTypeMoreApps;
final String v1 = "Default"; // const-string v1, "Default"
int v2 = 0; // const/4 v2, 0x0
java.lang.Boolean .valueOf ( v2 );
/* invoke-direct {p0, v0, v1, v2}, Lcom/chartboost/sdk/ChartBoost;->showView(Lcom/chartboost/sdk/CBWebView$CBViewType;Ljava/lang/String;Ljava/lang/Boolean;)V */
/* .line 171 */
return;
} // .end method
