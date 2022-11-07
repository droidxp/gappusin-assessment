public class com.nobleempire.GunDisassembly2.BillingService extends android.app.Service implements android.content.ServiceConnection {
	 /* .source "BillingService.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/nobleempire/GunDisassembly2/BillingService$BillingRequest;, */
	 /* Lcom/nobleempire/GunDisassembly2/BillingService$CheckBillingSupported;, */
	 /* Lcom/nobleempire/GunDisassembly2/BillingService$ConfirmNotifications;, */
	 /* Lcom/nobleempire/GunDisassembly2/BillingService$GetPurchaseInformation;, */
	 /* Lcom/nobleempire/GunDisassembly2/BillingService$RequestPurchase;, */
	 /* Lcom/nobleempire/GunDisassembly2/BillingService$RestoreTransactions; */
	 /* } */
} // .end annotation
/* # static fields */
private static final java.lang.String TAG;
private static java.util.LinkedList mPendingRequests;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/LinkedList", */
/* "<", */
/* "Lcom/nobleempire/GunDisassembly2/BillingService$BillingRequest;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
private static java.util.HashMap mSentRequests;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/HashMap", */
/* "<", */
/* "Ljava/lang/Long;", */
/* "Lcom/nobleempire/GunDisassembly2/BillingService$BillingRequest;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
private static com.android.vending.billing.IMarketBillingService mService;
/* # direct methods */
static com.nobleempire.GunDisassembly2.BillingService ( ) {
/* .locals 1 */
/* .prologue */
/* .line 36 */
/* new-instance v0, Ljava/util/LinkedList; */
/* invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V */
/* .line 38 */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
/* .line 31 */
return;
} // .end method
public com.nobleempire.GunDisassembly2.BillingService ( ) {
/* .locals 0 */
/* .prologue */
/* .line 243 */
/* invoke-direct {p0}, Landroid/app/Service;-><init>()V */
/* .line 244 */
return;
} // .end method
static Boolean access$0 ( com.nobleempire.GunDisassembly2.BillingService p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 282 */
v0 = /* invoke-direct {p0}, Lcom/nobleempire/GunDisassembly2/BillingService;->bindToMarketBillingService()Z */
} // .end method
static java.util.LinkedList access$1 ( ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 36 */
v0 = com.nobleempire.GunDisassembly2.BillingService.mPendingRequests;
} // .end method
static com.android.vending.billing.IMarketBillingService access$2 ( ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 34 */
v0 = com.nobleempire.GunDisassembly2.BillingService.mService;
} // .end method
static java.util.HashMap access$3 ( ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 38 */
v0 = com.nobleempire.GunDisassembly2.BillingService.mSentRequests;
} // .end method
static void access$4 ( com.android.vending.billing.IMarketBillingService p0 ) { //synthethic
/* .locals 0 */
/* .prologue */
/* .line 34 */
return;
} // .end method
private Boolean bindToMarketBillingService ( ) {
/* .locals 5 */
/* .prologue */
int v2 = 1; // const/4 v2, 0x1
/* .line 286 */
try { // :try_start_0
/* new-instance v3, Landroid/content/Intent; */
final String v4 = "com.android.vending.billing.MarketBillingService.BIND"; // const-string v4, "com.android.vending.billing.MarketBillingService.BIND"
/* invoke-direct {v3, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V */
int v4 = 1; // const/4 v4, 0x1
v0 = (( com.nobleempire.GunDisassembly2.BillingService ) p0 ).bindService ( v3, p0, v4 ); // invoke-virtual {p0, v3, p0, v4}, Lcom/nobleempire/GunDisassembly2/BillingService;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z
/* .line 287 */
/* .local v0, "bindResult":Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 292 */
} // .end local v0 # "bindResult":Z
} // :goto_0
/* .line 288 */
/* .restart local v0 # "bindResult":Z */
} // :cond_0
final String v2 = "BillingService.java"; // const-string v2, "BillingService.java"
final String v3 = "~~Could not bind to service."; // const-string v3, "~~Could not bind to service."
android.util.Log .e ( v2,v3 );
/* :try_end_0 */
/* .catch Ljava/lang/SecurityException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 292 */
} // .end local v0 # "bindResult":Z
} // :goto_1
int v2 = 0; // const/4 v2, 0x0
/* .line 289 */
/* :catch_0 */
/* move-exception v1 */
/* .line 290 */
/* .local v1, "e":Ljava/lang/SecurityException; */
final String v2 = "BillingService.java"; // const-string v2, "BillingService.java"
/* new-instance v3, Ljava/lang/StringBuilder; */
final String v4 = "~~Security exception: "; // const-string v4, "~~Security exception: "
/* invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v3 ).append ( v1 ); // invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .e ( v2,v3 );
} // .end method
private void checkResponseCode ( Long p0, com.nobleempire.GunDisassembly2.Consts$ResponseCode p1 ) {
/* .locals 3 */
/* .param p1, "requestId" # J */
/* .param p3, "responseCode" # Lcom/nobleempire/GunDisassembly2/Consts$ResponseCode; */
/* .prologue */
/* .line 361 */
v1 = com.nobleempire.GunDisassembly2.BillingService.mSentRequests;
java.lang.Long .valueOf ( p1,p2 );
(( java.util.HashMap ) v1 ).get ( v2 ); // invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v0, Lcom/nobleempire/GunDisassembly2/BillingService$BillingRequest; */
/* .line 362 */
/* .local v0, "request":Lcom/nobleempire/GunDisassembly2/BillingService$BillingRequest; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 364 */
(( com.nobleempire.GunDisassembly2.BillingService$BillingRequest ) v0 ).responseCodeReceived ( p3 ); // invoke-virtual {v0, p3}, Lcom/nobleempire/GunDisassembly2/BillingService$BillingRequest;->responseCodeReceived(Lcom/nobleempire/GunDisassembly2/Consts$ResponseCode;)V
/* .line 366 */
} // :cond_0
v1 = com.nobleempire.GunDisassembly2.BillingService.mSentRequests;
java.lang.Long .valueOf ( p1,p2 );
(( java.util.HashMap ) v1 ).remove ( v2 ); // invoke-virtual {v1, v2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
/* .line 367 */
return;
} // .end method
private Boolean confirmNotifications ( Integer p0, java.lang.String[] p1 ) {
/* .locals 1 */
/* .param p1, "startId" # I */
/* .param p2, "notifyIds" # [Ljava/lang/String; */
/* .prologue */
/* .line 321 */
/* new-instance v0, Lcom/nobleempire/GunDisassembly2/BillingService$ConfirmNotifications; */
/* invoke-direct {v0, p0, p1, p2}, Lcom/nobleempire/GunDisassembly2/BillingService$ConfirmNotifications;-><init>(Lcom/nobleempire/GunDisassembly2/BillingService;I[Ljava/lang/String;)V */
v0 = (( com.nobleempire.GunDisassembly2.BillingService$ConfirmNotifications ) v0 ).runRequest ( ); // invoke-virtual {v0}, Lcom/nobleempire/GunDisassembly2/BillingService$ConfirmNotifications;->runRequest()Z
} // .end method
private Boolean getPurchaseInformation ( Integer p0, java.lang.String[] p1 ) {
/* .locals 1 */
/* .param p1, "startId" # I */
/* .param p2, "notifyIds" # [Ljava/lang/String; */
/* .prologue */
/* .line 331 */
/* new-instance v0, Lcom/nobleempire/GunDisassembly2/BillingService$GetPurchaseInformation; */
/* invoke-direct {v0, p0, p1, p2}, Lcom/nobleempire/GunDisassembly2/BillingService$GetPurchaseInformation;-><init>(Lcom/nobleempire/GunDisassembly2/BillingService;I[Ljava/lang/String;)V */
v0 = (( com.nobleempire.GunDisassembly2.BillingService$GetPurchaseInformation ) v0 ).runRequest ( ); // invoke-virtual {v0}, Lcom/nobleempire/GunDisassembly2/BillingService$GetPurchaseInformation;->runRequest()Z
} // .end method
private void purchaseStateChanged ( Integer p0, java.lang.String p1, java.lang.String p2 ) {
/* .locals 12 */
/* .param p1, "startId" # I */
/* .param p2, "signedData" # Ljava/lang/String; */
/* .param p3, "signature" # Ljava/lang/String; */
/* .prologue */
/* .line 340 */
com.nobleempire.GunDisassembly2.Security .verifyPurchase ( p2,p3 );
/* .line 341 */
/* .local v9, "purchases":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/nobleempire/GunDisassembly2/Security$VerifiedPurchase;>;" */
/* if-nez v9, :cond_1 */
/* .line 353 */
} // :cond_0
} // :goto_0
return;
/* .line 342 */
} // :cond_1
/* new-instance v8, Ljava/util/ArrayList; */
/* invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V */
/* .line 343 */
/* .local v8, "notifyList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;" */
(( java.util.ArrayList ) v9 ).iterator ( ); // invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
v0 = } // :goto_1
/* if-nez v0, :cond_2 */
/* .line 349 */
v0 = (( java.util.ArrayList ) v8 ).isEmpty ( ); // invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z
/* if-nez v0, :cond_0 */
/* .line 350 */
v0 = (( java.util.ArrayList ) v8 ).size ( ); // invoke-virtual {v8}, Ljava/util/ArrayList;->size()I
/* new-array v0, v0, [Ljava/lang/String; */
(( java.util.ArrayList ) v8 ).toArray ( v0 ); // invoke-virtual {v8, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;
/* check-cast v7, [Ljava/lang/String; */
/* .line 351 */
/* .local v7, "notifyIds":[Ljava/lang/String; */
/* invoke-direct {p0, p1, v7}, Lcom/nobleempire/GunDisassembly2/BillingService;->confirmNotifications(I[Ljava/lang/String;)Z */
/* .line 343 */
} // .end local v7 # "notifyIds":[Ljava/lang/String;
} // :cond_2
/* check-cast v10, Lcom/nobleempire/GunDisassembly2/Security$VerifiedPurchase; */
/* .line 344 */
/* .local v10, "vp":Lcom/nobleempire/GunDisassembly2/Security$VerifiedPurchase; */
v0 = this.notificationId;
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 345 */
v0 = this.notificationId;
(( java.util.ArrayList ) v8 ).add ( v0 ); // invoke-virtual {v8, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* .line 347 */
} // :cond_3
v1 = this.purchaseState;
v2 = this.productId;
v3 = this.orderId;
/* iget-wide v4, v10, Lcom/nobleempire/GunDisassembly2/Security$VerifiedPurchase;->purchaseTime:J */
v6 = this.developerPayload;
/* move-object v0, p0 */
/* invoke-static/range {v0 ..v6}, Lcom/nobleempire/GunDisassembly2/ResponseHandler;->purchaseResponse(Landroid/content/Context;Lcom/nobleempire/GunDisassembly2/Consts$PurchaseState;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V */
} // .end method
private void runPendingRequests ( ) {
/* .locals 3 */
/* .prologue */
/* .line 371 */
int v0 = -1; // const/4 v0, -0x1
/* .line 373 */
/* .local v0, "maxStartId":I */
} // :cond_0
} // :goto_0
v2 = com.nobleempire.GunDisassembly2.BillingService.mPendingRequests;
(( java.util.LinkedList ) v2 ).peek ( ); // invoke-virtual {v2}, Ljava/util/LinkedList;->peek()Ljava/lang/Object;
/* check-cast v1, Lcom/nobleempire/GunDisassembly2/BillingService$BillingRequest; */
/* .local v1, "request":Lcom/nobleempire/GunDisassembly2/BillingService$BillingRequest; */
/* if-nez v1, :cond_2 */
/* .line 388 */
/* if-ltz v0, :cond_1 */
/* .line 390 */
(( com.nobleempire.GunDisassembly2.BillingService ) p0 ).stopSelf ( v0 ); // invoke-virtual {p0, v0}, Lcom/nobleempire/GunDisassembly2/BillingService;->stopSelf(I)V
/* .line 392 */
} // :cond_1
} // :goto_1
return;
/* .line 374 */
} // :cond_2
v2 = (( com.nobleempire.GunDisassembly2.BillingService$BillingRequest ) v1 ).runIfConnected ( ); // invoke-virtual {v1}, Lcom/nobleempire/GunDisassembly2/BillingService$BillingRequest;->runIfConnected()Z
if ( v2 != null) { // if-eqz v2, :cond_3
/* .line 376 */
v2 = com.nobleempire.GunDisassembly2.BillingService.mPendingRequests;
(( java.util.LinkedList ) v2 ).remove ( ); // invoke-virtual {v2}, Ljava/util/LinkedList;->remove()Ljava/lang/Object;
/* .line 378 */
v2 = (( com.nobleempire.GunDisassembly2.BillingService$BillingRequest ) v1 ).getStartId ( ); // invoke-virtual {v1}, Lcom/nobleempire/GunDisassembly2/BillingService$BillingRequest;->getStartId()I
/* if-ge v0, v2, :cond_0 */
/* .line 379 */
v0 = (( com.nobleempire.GunDisassembly2.BillingService$BillingRequest ) v1 ).getStartId ( ); // invoke-virtual {v1}, Lcom/nobleempire/GunDisassembly2/BillingService$BillingRequest;->getStartId()I
/* .line 383 */
} // :cond_3
/* invoke-direct {p0}, Lcom/nobleempire/GunDisassembly2/BillingService;->bindToMarketBillingService()Z */
} // .end method
/* # virtual methods */
public Boolean checkBillingSupported ( ) {
/* .locals 1 */
/* .prologue */
/* .line 297 */
/* new-instance v0, Lcom/nobleempire/GunDisassembly2/BillingService$CheckBillingSupported; */
/* invoke-direct {v0, p0}, Lcom/nobleempire/GunDisassembly2/BillingService$CheckBillingSupported;-><init>(Lcom/nobleempire/GunDisassembly2/BillingService;)V */
v0 = (( com.nobleempire.GunDisassembly2.BillingService$CheckBillingSupported ) v0 ).runRequest ( ); // invoke-virtual {v0}, Lcom/nobleempire/GunDisassembly2/BillingService$CheckBillingSupported;->runRequest()Z
} // .end method
public void handleCommand ( android.content.Intent p0, Integer p1 ) {
/* .locals 12 */
/* .param p1, "intent" # Landroid/content/Intent; */
/* .param p2, "startId" # I */
/* .prologue */
/* .line 262 */
(( android.content.Intent ) p1 ).getAction ( ); // invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;
/* .line 264 */
/* .local v0, "action":Ljava/lang/String; */
final String v9 = "com.nobleempire.dungeons.CONFIRM_NOTIFICATION"; // const-string v9, "com.nobleempire.dungeons.CONFIRM_NOTIFICATION"
v9 = (( java.lang.String ) v9 ).equals ( v0 ); // invoke-virtual {v9, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v9 != null) { // if-eqz v9, :cond_1
/* .line 265 */
final String v9 = "notification_id"; // const-string v9, "notification_id"
(( android.content.Intent ) p1 ).getStringArrayExtra ( v9 ); // invoke-virtual {p1, v9}, Landroid/content/Intent;->getStringArrayExtra(Ljava/lang/String;)[Ljava/lang/String;
/* .line 266 */
/* .local v2, "notifyIds":[Ljava/lang/String; */
/* invoke-direct {p0, p2, v2}, Lcom/nobleempire/GunDisassembly2/BillingService;->confirmNotifications(I[Ljava/lang/String;)Z */
/* .line 280 */
} // .end local v2 # "notifyIds":[Ljava/lang/String;
} // :cond_0
} // :goto_0
return;
/* .line 267 */
} // :cond_1
final String v9 = "com.nobleempire.dungeons.GET_PURCHASE_INFORMATION"; // const-string v9, "com.nobleempire.dungeons.GET_PURCHASE_INFORMATION"
v9 = (( java.lang.String ) v9 ).equals ( v0 ); // invoke-virtual {v9, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v9 != null) { // if-eqz v9, :cond_2
/* .line 268 */
final String v9 = "notification_id"; // const-string v9, "notification_id"
(( android.content.Intent ) p1 ).getStringExtra ( v9 ); // invoke-virtual {p1, v9}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
/* .line 269 */
/* .local v1, "notifyId":Ljava/lang/String; */
int v9 = 1; // const/4 v9, 0x1
/* new-array v9, v9, [Ljava/lang/String; */
int v10 = 0; // const/4 v10, 0x0
/* aput-object v1, v9, v10 */
/* invoke-direct {p0, p2, v9}, Lcom/nobleempire/GunDisassembly2/BillingService;->getPurchaseInformation(I[Ljava/lang/String;)Z */
/* .line 270 */
} // .end local v1 # "notifyId":Ljava/lang/String;
} // :cond_2
final String v9 = "com.android.vending.billing.PURCHASE_STATE_CHANGED"; // const-string v9, "com.android.vending.billing.PURCHASE_STATE_CHANGED"
v9 = (( java.lang.String ) v9 ).equals ( v0 ); // invoke-virtual {v9, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v9 != null) { // if-eqz v9, :cond_3
/* .line 271 */
final String v9 = "inapp_signed_data"; // const-string v9, "inapp_signed_data"
(( android.content.Intent ) p1 ).getStringExtra ( v9 ); // invoke-virtual {p1, v9}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
/* .line 272 */
/* .local v8, "signedData":Ljava/lang/String; */
final String v9 = "inapp_signature"; // const-string v9, "inapp_signature"
(( android.content.Intent ) p1 ).getStringExtra ( v9 ); // invoke-virtual {p1, v9}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
/* .line 273 */
/* .local v7, "signature":Ljava/lang/String; */
/* invoke-direct {p0, p2, v8, v7}, Lcom/nobleempire/GunDisassembly2/BillingService;->purchaseStateChanged(ILjava/lang/String;Ljava/lang/String;)V */
/* .line 274 */
} // .end local v7 # "signature":Ljava/lang/String;
} // .end local v8 # "signedData":Ljava/lang/String;
} // :cond_3
final String v9 = "com.android.vending.billing.RESPONSE_CODE"; // const-string v9, "com.android.vending.billing.RESPONSE_CODE"
v9 = (( java.lang.String ) v9 ).equals ( v0 ); // invoke-virtual {v9, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v9 != null) { // if-eqz v9, :cond_0
/* .line 275 */
final String v9 = "request_id"; // const-string v9, "request_id"
/* const-wide/16 v10, -0x1 */
(( android.content.Intent ) p1 ).getLongExtra ( v9, v10, v11 ); // invoke-virtual {p1, v9, v10, v11}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J
/* move-result-wide v3 */
/* .line 276 */
/* .local v3, "requestId":J */
final String v9 = "response_code"; // const-string v9, "response_code"
v10 = com.nobleempire.GunDisassembly2.Consts$ResponseCode.RESULT_ERROR;
v10 = (( com.nobleempire.GunDisassembly2.Consts$ResponseCode ) v10 ).ordinal ( ); // invoke-virtual {v10}, Lcom/nobleempire/GunDisassembly2/Consts$ResponseCode;->ordinal()I
v6 = (( android.content.Intent ) p1 ).getIntExtra ( v9, v10 ); // invoke-virtual {p1, v9, v10}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I
/* .line 277 */
/* .local v6, "responseCodeIndex":I */
com.nobleempire.GunDisassembly2.Consts$ResponseCode .valueOf ( v6 );
/* .line 278 */
/* .local v5, "responseCode":Lcom/nobleempire/GunDisassembly2/Consts$ResponseCode; */
/* invoke-direct {p0, v3, v4, v5}, Lcom/nobleempire/GunDisassembly2/BillingService;->checkResponseCode(JLcom/nobleempire/GunDisassembly2/Consts$ResponseCode;)V */
} // .end method
public android.os.IBinder onBind ( android.content.Intent p0 ) {
/* .locals 1 */
/* .param p1, "intent" # Landroid/content/Intent; */
/* .prologue */
/* .line 251 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public void onServiceConnected ( android.content.ComponentName p0, android.os.IBinder p1 ) {
/* .locals 1 */
/* .param p1, "name" # Landroid/content/ComponentName; */
/* .param p2, "service" # Landroid/os/IBinder; */
/* .prologue */
/* .line 397 */
com.android.vending.billing.IMarketBillingService$Stub .asInterface ( p2 );
/* .line 398 */
/* invoke-direct {p0}, Lcom/nobleempire/GunDisassembly2/BillingService;->runPendingRequests()V */
/* .line 399 */
return;
} // .end method
public void onServiceDisconnected ( android.content.ComponentName p0 ) {
/* .locals 2 */
/* .param p1, "name" # Landroid/content/ComponentName; */
/* .prologue */
/* .line 402 */
final String v0 = "BillingService.java"; // const-string v0, "BillingService.java"
final String v1 = "~~Billing service disconnected"; // const-string v1, "~~Billing service disconnected"
android.util.Log .w ( v0,v1 );
/* .line 403 */
int v0 = 0; // const/4 v0, 0x0
/* .line 404 */
return;
} // .end method
public void onStart ( android.content.Intent p0, Integer p1 ) {
/* .locals 0 */
/* .param p1, "intent" # Landroid/content/Intent; */
/* .param p2, "startId" # I */
/* .prologue */
/* .line 255 */
(( com.nobleempire.GunDisassembly2.BillingService ) p0 ).handleCommand ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lcom/nobleempire/GunDisassembly2/BillingService;->handleCommand(Landroid/content/Intent;I)V
/* .line 256 */
return;
} // .end method
public Boolean requestPurchase ( java.lang.String p0, java.lang.String p1 ) {
/* .locals 1 */
/* .param p1, "productId" # Ljava/lang/String; */
/* .param p2, "developerPayload" # Ljava/lang/String; */
/* .prologue */
/* .line 306 */
/* new-instance v0, Lcom/nobleempire/GunDisassembly2/BillingService$RequestPurchase; */
/* invoke-direct {v0, p0, p1, p2}, Lcom/nobleempire/GunDisassembly2/BillingService$RequestPurchase;-><init>(Lcom/nobleempire/GunDisassembly2/BillingService;Ljava/lang/String;Ljava/lang/String;)V */
v0 = (( com.nobleempire.GunDisassembly2.BillingService$RequestPurchase ) v0 ).runRequest ( ); // invoke-virtual {v0}, Lcom/nobleempire/GunDisassembly2/BillingService$RequestPurchase;->runRequest()Z
} // .end method
public Boolean restoreTransactions ( ) {
/* .locals 1 */
/* .prologue */
/* .line 312 */
/* new-instance v0, Lcom/nobleempire/GunDisassembly2/BillingService$RestoreTransactions; */
/* invoke-direct {v0, p0}, Lcom/nobleempire/GunDisassembly2/BillingService$RestoreTransactions;-><init>(Lcom/nobleempire/GunDisassembly2/BillingService;)V */
v0 = (( com.nobleempire.GunDisassembly2.BillingService$RestoreTransactions ) v0 ).runRequest ( ); // invoke-virtual {v0}, Lcom/nobleempire/GunDisassembly2/BillingService$RestoreTransactions;->runRequest()Z
} // .end method
public void setContext ( android.content.Context p0 ) {
/* .locals 0 */
/* .param p1, "context" # Landroid/content/Context; */
/* .prologue */
/* .line 246 */
(( com.nobleempire.GunDisassembly2.BillingService ) p0 ).attachBaseContext ( p1 ); // invoke-virtual {p0, p1}, Lcom/nobleempire/GunDisassembly2/BillingService;->attachBaseContext(Landroid/content/Context;)V
/* .line 247 */
return;
} // .end method
public void unbind ( ) {
/* .locals 1 */
/* .prologue */
/* .line 409 */
try { // :try_start_0
(( com.nobleempire.GunDisassembly2.BillingService ) p0 ).unbindService ( p0 ); // invoke-virtual {p0, p0}, Lcom/nobleempire/GunDisassembly2/BillingService;->unbindService(Landroid/content/ServiceConnection;)V
/* :try_end_0 */
/* .catch Ljava/lang/IllegalArgumentException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 413 */
} // :goto_0
return;
/* .line 410 */
/* :catch_0 */
/* move-exception v0 */
} // .end method
