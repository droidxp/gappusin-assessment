public class de.nurogames.android.ticb.base.BillingService extends android.app.Service implements android.content.ServiceConnection {
	 /* .source "BillingService.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lde/nurogames/android/ticb/base/BillingService$BillingRequest;, */
	 /* Lde/nurogames/android/ticb/base/BillingService$CheckBillingSupported;, */
	 /* Lde/nurogames/android/ticb/base/BillingService$ConfirmNotifications;, */
	 /* Lde/nurogames/android/ticb/base/BillingService$GetPurchaseInformation;, */
	 /* Lde/nurogames/android/ticb/base/BillingService$RequestPurchase;, */
	 /* Lde/nurogames/android/ticb/base/BillingService$RestoreTransactions; */
	 /* } */
} // .end annotation
/* # static fields */
private static final java.lang.String TAG;
private static java.util.LinkedList mPendingRequests;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/LinkedList", */
/* "<", */
/* "Lde/nurogames/android/ticb/base/BillingService$BillingRequest;", */
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
/* "Lde/nurogames/android/ticb/base/BillingService$BillingRequest;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
private static com.android.vending.billing.IMarketBillingService mService;
/* # direct methods */
static de.nurogames.android.ticb.base.BillingService ( ) {
/* .locals 1 */
/* .prologue */
/* .line 61 */
/* new-instance v0, Ljava/util/LinkedList; */
/* invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V */
/* .line 69 */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
/* .line 68 */
/* .line 69 */
return;
} // .end method
public de.nurogames.android.ticb.base.BillingService ( ) {
/* .locals 0 */
/* .prologue */
/* .line 404 */
/* invoke-direct {p0}, Landroid/app/Service;-><init>()V */
/* .line 405 */
return;
} // .end method
static Boolean access$0 ( de.nurogames.android.ticb.base.BillingService p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 462 */
v0 = /* invoke-direct {p0}, Lde/nurogames/android/ticb/base/BillingService;->bindToMarketBillingService()Z */
} // .end method
static java.util.LinkedList access$1 ( ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 61 */
v0 = de.nurogames.android.ticb.base.BillingService.mPendingRequests;
} // .end method
static com.android.vending.billing.IMarketBillingService access$2 ( ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 55 */
v0 = de.nurogames.android.ticb.base.BillingService.mService;
} // .end method
static java.util.HashMap access$3 ( ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 68 */
v0 = de.nurogames.android.ticb.base.BillingService.mSentRequests;
} // .end method
static void access$4 ( com.android.vending.billing.IMarketBillingService p0 ) { //synthethic
/* .locals 0 */
/* .prologue */
/* .line 55 */
return;
} // .end method
private Boolean bindToMarketBillingService ( ) {
/* .locals 5 */
/* .prologue */
int v2 = 1; // const/4 v2, 0x1
/* .line 467 */
/* .line 468 */
try { // :try_start_0
/* new-instance v3, Landroid/content/Intent; */
final String v4 = "com.android.vending.billing.MarketBillingService.BIND"; // const-string v4, "com.android.vending.billing.MarketBillingService.BIND"
/* invoke-direct {v3, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V */
/* .line 470 */
int v4 = 1; // const/4 v4, 0x1
/* .line 467 */
v0 = (( de.nurogames.android.ticb.base.BillingService ) p0 ).bindService ( v3, p0, v4 ); // invoke-virtual {p0, v3, p0, v4}, Lde/nurogames/android/ticb/base/BillingService;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z
/* .line 472 */
/* .local v0, "bindResult":Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 480 */
} // .end local v0 # "bindResult":Z
} // :goto_0
/* .line 475 */
/* .restart local v0 # "bindResult":Z */
} // :cond_0
final String v2 = "BillingService"; // const-string v2, "BillingService"
final String v3 = "Could not bind to service."; // const-string v3, "Could not bind to service."
android.util.Log .e ( v2,v3 );
/* :try_end_0 */
/* .catch Ljava/lang/SecurityException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 480 */
} // .end local v0 # "bindResult":Z
} // :goto_1
int v2 = 0; // const/4 v2, 0x0
/* .line 477 */
/* :catch_0 */
/* move-exception v1 */
/* .line 478 */
/* .local v1, "e":Ljava/lang/SecurityException; */
final String v2 = "BillingService"; // const-string v2, "BillingService"
/* new-instance v3, Ljava/lang/StringBuilder; */
final String v4 = "Security exception: "; // const-string v4, "Security exception: "
/* invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v3 ).append ( v1 ); // invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .e ( v2,v3 );
} // .end method
private void checkResponseCode ( Long p0, de.nurogames.android.ticb.base.Consts$ResponseCode p1 ) {
/* .locals 3 */
/* .param p1, "requestId" # J */
/* .param p3, "responseCode" # Lde/nurogames/android/ticb/base/Consts$ResponseCode; */
/* .prologue */
/* .line 603 */
v1 = de.nurogames.android.ticb.base.BillingService.mSentRequests;
java.lang.Long .valueOf ( p1,p2 );
(( java.util.HashMap ) v1 ).get ( v2 ); // invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v0, Lde/nurogames/android/ticb/base/BillingService$BillingRequest; */
/* .line 604 */
/* .local v0, "request":Lde/nurogames/android/ticb/base/BillingService$BillingRequest; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 608 */
(( de.nurogames.android.ticb.base.BillingService$BillingRequest ) v0 ).responseCodeReceived ( p3 ); // invoke-virtual {v0, p3}, Lde/nurogames/android/ticb/base/BillingService$BillingRequest;->responseCodeReceived(Lde/nurogames/android/ticb/base/Consts$ResponseCode;)V
/* .line 610 */
} // :cond_0
v1 = de.nurogames.android.ticb.base.BillingService.mSentRequests;
java.lang.Long .valueOf ( p1,p2 );
(( java.util.HashMap ) v1 ).remove ( v2 ); // invoke-virtual {v1, v2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
/* .line 611 */
return;
} // .end method
private Boolean confirmNotifications ( Integer p0, java.lang.String[] p1 ) {
/* .locals 1 */
/* .param p1, "startId" # I */
/* .param p2, "notifyIds" # [Ljava/lang/String; */
/* .prologue */
/* .line 541 */
/* new-instance v0, Lde/nurogames/android/ticb/base/BillingService$ConfirmNotifications; */
/* invoke-direct {v0, p0, p1, p2}, Lde/nurogames/android/ticb/base/BillingService$ConfirmNotifications;-><init>(Lde/nurogames/android/ticb/base/BillingService;I[Ljava/lang/String;)V */
v0 = (( de.nurogames.android.ticb.base.BillingService$ConfirmNotifications ) v0 ).runRequest ( ); // invoke-virtual {v0}, Lde/nurogames/android/ticb/base/BillingService$ConfirmNotifications;->runRequest()Z
} // .end method
private Boolean getPurchaseInformation ( Integer p0, java.lang.String[] p1 ) {
/* .locals 1 */
/* .param p1, "startId" # I */
/* .param p2, "notifyIds" # [Ljava/lang/String; */
/* .prologue */
/* .line 558 */
/* new-instance v0, Lde/nurogames/android/ticb/base/BillingService$GetPurchaseInformation; */
/* invoke-direct {v0, p0, p1, p2}, Lde/nurogames/android/ticb/base/BillingService$GetPurchaseInformation;-><init>(Lde/nurogames/android/ticb/base/BillingService;I[Ljava/lang/String;)V */
v0 = (( de.nurogames.android.ticb.base.BillingService$GetPurchaseInformation ) v0 ).runRequest ( ); // invoke-virtual {v0}, Lde/nurogames/android/ticb/base/BillingService$GetPurchaseInformation;->runRequest()Z
} // .end method
private void purchaseStateChanged ( Integer p0, java.lang.String p1, java.lang.String p2 ) {
/* .locals 12 */
/* .param p1, "startId" # I */
/* .param p2, "signedData" # Ljava/lang/String; */
/* .param p3, "signature" # Ljava/lang/String; */
/* .prologue */
/* .line 571 */
de.nurogames.android.ticb.base.Security .verifyPurchase ( p2,p3 );
/* .line 572 */
/* .local v9, "purchases":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lde/nurogames/android/ticb/base/Security$VerifiedPurchase;>;" */
/* if-nez v9, :cond_1 */
/* .line 588 */
} // :cond_0
} // :goto_0
return;
/* .line 576 */
} // :cond_1
/* new-instance v8, Ljava/util/ArrayList; */
/* invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V */
/* .line 577 */
/* .local v8, "notifyList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;" */
(( java.util.ArrayList ) v9 ).iterator ( ); // invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
v0 = } // :goto_1
/* if-nez v0, :cond_2 */
/* .line 584 */
v0 = (( java.util.ArrayList ) v8 ).isEmpty ( ); // invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z
/* if-nez v0, :cond_0 */
/* .line 585 */
v0 = (( java.util.ArrayList ) v8 ).size ( ); // invoke-virtual {v8}, Ljava/util/ArrayList;->size()I
/* new-array v0, v0, [Ljava/lang/String; */
(( java.util.ArrayList ) v8 ).toArray ( v0 ); // invoke-virtual {v8, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;
/* check-cast v7, [Ljava/lang/String; */
/* .line 586 */
/* .local v7, "notifyIds":[Ljava/lang/String; */
/* invoke-direct {p0, p1, v7}, Lde/nurogames/android/ticb/base/BillingService;->confirmNotifications(I[Ljava/lang/String;)Z */
/* .line 577 */
} // .end local v7 # "notifyIds":[Ljava/lang/String;
} // :cond_2
/* check-cast v10, Lde/nurogames/android/ticb/base/Security$VerifiedPurchase; */
/* .line 578 */
/* .local v10, "vp":Lde/nurogames/android/ticb/base/Security$VerifiedPurchase; */
v0 = this.notificationId;
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 579 */
v0 = this.notificationId;
(( java.util.ArrayList ) v8 ).add ( v0 ); // invoke-virtual {v8, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* .line 581 */
} // :cond_3
v1 = this.purchaseState;
v2 = this.productId;
/* .line 582 */
v3 = this.orderId;
/* iget-wide v4, v10, Lde/nurogames/android/ticb/base/Security$VerifiedPurchase;->purchaseTime:J */
v6 = this.developerPayload;
/* move-object v0, p0 */
/* .line 581 */
/* invoke-static/range {v0 ..v6}, Lde/nurogames/android/ticb/base/ResponseHandler;->purchaseResponse(Landroid/content/Context;Lde/nurogames/android/ticb/base/Consts$PurchaseState;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V */
} // .end method
private void runPendingRequests ( ) {
/* .locals 3 */
/* .prologue */
/* .line 618 */
int v0 = -1; // const/4 v0, -0x1
/* .line 620 */
/* .local v0, "maxStartId":I */
} // :cond_0
} // :goto_0
v2 = de.nurogames.android.ticb.base.BillingService.mPendingRequests;
(( java.util.LinkedList ) v2 ).peek ( ); // invoke-virtual {v2}, Ljava/util/LinkedList;->peek()Ljava/lang/Object;
/* check-cast v1, Lde/nurogames/android/ticb/base/BillingService$BillingRequest; */
/* .local v1, "request":Lde/nurogames/android/ticb/base/BillingService$BillingRequest; */
/* if-nez v1, :cond_2 */
/* .line 641 */
/* if-ltz v0, :cond_1 */
/* .line 645 */
(( de.nurogames.android.ticb.base.BillingService ) p0 ).stopSelf ( v0 ); // invoke-virtual {p0, v0}, Lde/nurogames/android/ticb/base/BillingService;->stopSelf(I)V
/* .line 647 */
} // :cond_1
} // :goto_1
return;
/* .line 621 */
} // :cond_2
v2 = (( de.nurogames.android.ticb.base.BillingService$BillingRequest ) v1 ).runIfConnected ( ); // invoke-virtual {v1}, Lde/nurogames/android/ticb/base/BillingService$BillingRequest;->runIfConnected()Z
if ( v2 != null) { // if-eqz v2, :cond_3
/* .line 623 */
v2 = de.nurogames.android.ticb.base.BillingService.mPendingRequests;
(( java.util.LinkedList ) v2 ).remove ( ); // invoke-virtual {v2}, Ljava/util/LinkedList;->remove()Ljava/lang/Object;
/* .line 627 */
v2 = (( de.nurogames.android.ticb.base.BillingService$BillingRequest ) v1 ).getStartId ( ); // invoke-virtual {v1}, Lde/nurogames/android/ticb/base/BillingService$BillingRequest;->getStartId()I
/* if-ge v0, v2, :cond_0 */
/* .line 628 */
v0 = (( de.nurogames.android.ticb.base.BillingService$BillingRequest ) v1 ).getStartId ( ); // invoke-virtual {v1}, Lde/nurogames/android/ticb/base/BillingService$BillingRequest;->getStartId()I
/* .line 630 */
/* .line 633 */
} // :cond_3
/* invoke-direct {p0}, Lde/nurogames/android/ticb/base/BillingService;->bindToMarketBillingService()Z */
} // .end method
/* # virtual methods */
public Boolean checkBillingSupported ( ) {
/* .locals 1 */
/* .annotation runtime Ljava/lang/Deprecated; */
} // .end annotation
/* .prologue */
/* .line 490 */
/* new-instance v0, Lde/nurogames/android/ticb/base/BillingService$CheckBillingSupported; */
/* invoke-direct {v0, p0}, Lde/nurogames/android/ticb/base/BillingService$CheckBillingSupported;-><init>(Lde/nurogames/android/ticb/base/BillingService;)V */
v0 = (( de.nurogames.android.ticb.base.BillingService$CheckBillingSupported ) v0 ).runRequest ( ); // invoke-virtual {v0}, Lde/nurogames/android/ticb/base/BillingService$CheckBillingSupported;->runRequest()Z
} // .end method
public Boolean checkBillingSupported ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p1, "itemType" # Ljava/lang/String; */
/* .prologue */
/* .line 500 */
/* new-instance v0, Lde/nurogames/android/ticb/base/BillingService$CheckBillingSupported; */
/* invoke-direct {v0, p0, p1}, Lde/nurogames/android/ticb/base/BillingService$CheckBillingSupported;-><init>(Lde/nurogames/android/ticb/base/BillingService;Ljava/lang/String;)V */
v0 = (( de.nurogames.android.ticb.base.BillingService$CheckBillingSupported ) v0 ).runRequest ( ); // invoke-virtual {v0}, Lde/nurogames/android/ticb/base/BillingService$CheckBillingSupported;->runRequest()Z
} // .end method
public void handleCommand ( android.content.Intent p0, Integer p1 ) {
/* .locals 12 */
/* .param p1, "intent" # Landroid/content/Intent; */
/* .param p2, "startId" # I */
/* .prologue */
/* .line 432 */
/* if-nez p1, :cond_1 */
/* .line 455 */
} // :cond_0
} // :goto_0
return;
/* .line 434 */
} // :cond_1
(( android.content.Intent ) p1 ).getAction ( ); // invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;
/* .line 438 */
/* .local v0, "action":Ljava/lang/String; */
final String v9 = "com.example.subscriptions.CONFIRM_NOTIFICATION"; // const-string v9, "com.example.subscriptions.CONFIRM_NOTIFICATION"
v9 = (( java.lang.String ) v9 ).equals ( v0 ); // invoke-virtual {v9, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v9 != null) { // if-eqz v9, :cond_2
/* .line 439 */
final String v9 = "notification_id"; // const-string v9, "notification_id"
(( android.content.Intent ) p1 ).getStringArrayExtra ( v9 ); // invoke-virtual {p1, v9}, Landroid/content/Intent;->getStringArrayExtra(Ljava/lang/String;)[Ljava/lang/String;
/* .line 440 */
/* .local v2, "notifyIds":[Ljava/lang/String; */
/* invoke-direct {p0, p2, v2}, Lde/nurogames/android/ticb/base/BillingService;->confirmNotifications(I[Ljava/lang/String;)Z */
/* .line 441 */
} // .end local v2 # "notifyIds":[Ljava/lang/String;
} // :cond_2
final String v9 = "com.example.subscriptions.GET_PURCHASE_INFORMATION"; // const-string v9, "com.example.subscriptions.GET_PURCHASE_INFORMATION"
v9 = (( java.lang.String ) v9 ).equals ( v0 ); // invoke-virtual {v9, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v9 != null) { // if-eqz v9, :cond_3
/* .line 442 */
final String v9 = "notification_id"; // const-string v9, "notification_id"
(( android.content.Intent ) p1 ).getStringExtra ( v9 ); // invoke-virtual {p1, v9}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
/* .line 443 */
/* .local v1, "notifyId":Ljava/lang/String; */
int v9 = 1; // const/4 v9, 0x1
/* new-array v9, v9, [Ljava/lang/String; */
int v10 = 0; // const/4 v10, 0x0
/* aput-object v1, v9, v10 */
/* invoke-direct {p0, p2, v9}, Lde/nurogames/android/ticb/base/BillingService;->getPurchaseInformation(I[Ljava/lang/String;)Z */
/* .line 444 */
} // .end local v1 # "notifyId":Ljava/lang/String;
} // :cond_3
final String v9 = "com.android.vending.billing.PURCHASE_STATE_CHANGED"; // const-string v9, "com.android.vending.billing.PURCHASE_STATE_CHANGED"
v9 = (( java.lang.String ) v9 ).equals ( v0 ); // invoke-virtual {v9, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v9 != null) { // if-eqz v9, :cond_4
/* .line 445 */
final String v9 = "inapp_signed_data"; // const-string v9, "inapp_signed_data"
(( android.content.Intent ) p1 ).getStringExtra ( v9 ); // invoke-virtual {p1, v9}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
/* .line 446 */
/* .local v8, "signedData":Ljava/lang/String; */
final String v9 = "inapp_signature"; // const-string v9, "inapp_signature"
(( android.content.Intent ) p1 ).getStringExtra ( v9 ); // invoke-virtual {p1, v9}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
/* .line 447 */
/* .local v7, "signature":Ljava/lang/String; */
/* invoke-direct {p0, p2, v8, v7}, Lde/nurogames/android/ticb/base/BillingService;->purchaseStateChanged(ILjava/lang/String;Ljava/lang/String;)V */
/* .line 448 */
} // .end local v7 # "signature":Ljava/lang/String;
} // .end local v8 # "signedData":Ljava/lang/String;
} // :cond_4
final String v9 = "com.android.vending.billing.RESPONSE_CODE"; // const-string v9, "com.android.vending.billing.RESPONSE_CODE"
v9 = (( java.lang.String ) v9 ).equals ( v0 ); // invoke-virtual {v9, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v9 != null) { // if-eqz v9, :cond_0
/* .line 449 */
final String v9 = "request_id"; // const-string v9, "request_id"
/* const-wide/16 v10, -0x1 */
(( android.content.Intent ) p1 ).getLongExtra ( v9, v10, v11 ); // invoke-virtual {p1, v9, v10, v11}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J
/* move-result-wide v3 */
/* .line 450 */
/* .local v3, "requestId":J */
final String v9 = "response_code"; // const-string v9, "response_code"
/* .line 451 */
v10 = de.nurogames.android.ticb.base.Consts$ResponseCode.RESULT_ERROR;
v10 = (( de.nurogames.android.ticb.base.Consts$ResponseCode ) v10 ).ordinal ( ); // invoke-virtual {v10}, Lde/nurogames/android/ticb/base/Consts$ResponseCode;->ordinal()I
/* .line 450 */
v6 = (( android.content.Intent ) p1 ).getIntExtra ( v9, v10 ); // invoke-virtual {p1, v9, v10}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I
/* .line 452 */
/* .local v6, "responseCodeIndex":I */
de.nurogames.android.ticb.base.Consts$ResponseCode .valueOf ( v6 );
/* .line 453 */
/* .local v5, "responseCode":Lde/nurogames/android/ticb/base/Consts$ResponseCode; */
/* invoke-direct {p0, v3, v4, v5}, Lde/nurogames/android/ticb/base/BillingService;->checkResponseCode(JLde/nurogames/android/ticb/base/Consts$ResponseCode;)V */
} // .end method
public android.os.IBinder onBind ( android.content.Intent p0 ) {
/* .locals 1 */
/* .param p1, "intent" # Landroid/content/Intent; */
/* .prologue */
/* .line 416 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public void onServiceConnected ( android.content.ComponentName p0, android.os.IBinder p1 ) {
/* .locals 1 */
/* .param p1, "name" # Landroid/content/ComponentName; */
/* .param p2, "service" # Landroid/os/IBinder; */
/* .prologue */
/* .line 658 */
com.android.vending.billing.IMarketBillingService$Stub .asInterface ( p2 );
/* .line 659 */
/* invoke-direct {p0}, Lde/nurogames/android/ticb/base/BillingService;->runPendingRequests()V */
/* .line 660 */
return;
} // .end method
public void onServiceDisconnected ( android.content.ComponentName p0 ) {
/* .locals 2 */
/* .param p1, "name" # Landroid/content/ComponentName; */
/* .prologue */
/* .line 667 */
final String v0 = "BillingService"; // const-string v0, "BillingService"
final String v1 = "Billing service disconnected"; // const-string v1, "Billing service disconnected"
android.util.Log .w ( v0,v1 );
/* .line 668 */
int v0 = 0; // const/4 v0, 0x0
/* .line 669 */
return;
} // .end method
public void onStart ( android.content.Intent p0, Integer p1 ) {
/* .locals 0 */
/* .param p1, "intent" # Landroid/content/Intent; */
/* .param p2, "startId" # I */
/* .prologue */
/* .line 421 */
(( de.nurogames.android.ticb.base.BillingService ) p0 ).handleCommand ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lde/nurogames/android/ticb/base/BillingService;->handleCommand(Landroid/content/Intent;I)V
/* .line 422 */
return;
} // .end method
public Boolean requestPurchase ( java.lang.String p0, java.lang.String p1, java.lang.String p2 ) {
/* .locals 1 */
/* .param p1, "productId" # Ljava/lang/String; */
/* .param p2, "itemType" # Ljava/lang/String; */
/* .param p3, "developerPayload" # Ljava/lang/String; */
/* .prologue */
/* .line 516 */
/* new-instance v0, Lde/nurogames/android/ticb/base/BillingService$RequestPurchase; */
/* invoke-direct {v0, p0, p1, p2, p3}, Lde/nurogames/android/ticb/base/BillingService$RequestPurchase;-><init>(Lde/nurogames/android/ticb/base/BillingService;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V */
v0 = (( de.nurogames.android.ticb.base.BillingService$RequestPurchase ) v0 ).runRequest ( ); // invoke-virtual {v0}, Lde/nurogames/android/ticb/base/BillingService$RequestPurchase;->runRequest()Z
} // .end method
public Boolean restoreTransactions ( ) {
/* .locals 1 */
/* .prologue */
/* .line 526 */
/* new-instance v0, Lde/nurogames/android/ticb/base/BillingService$RestoreTransactions; */
/* invoke-direct {v0, p0}, Lde/nurogames/android/ticb/base/BillingService$RestoreTransactions;-><init>(Lde/nurogames/android/ticb/base/BillingService;)V */
v0 = (( de.nurogames.android.ticb.base.BillingService$RestoreTransactions ) v0 ).runRequest ( ); // invoke-virtual {v0}, Lde/nurogames/android/ticb/base/BillingService$RestoreTransactions;->runRequest()Z
} // .end method
public void setContext ( android.content.Context p0 ) {
/* .locals 0 */
/* .param p1, "context" # Landroid/content/Context; */
/* .prologue */
/* .line 408 */
(( de.nurogames.android.ticb.base.BillingService ) p0 ).attachBaseContext ( p1 ); // invoke-virtual {p0, p1}, Lde/nurogames/android/ticb/base/BillingService;->attachBaseContext(Landroid/content/Context;)V
/* .line 409 */
return;
} // .end method
public void unbind ( ) {
/* .locals 1 */
/* .prologue */
/* .line 677 */
try { // :try_start_0
(( de.nurogames.android.ticb.base.BillingService ) p0 ).unbindService ( p0 ); // invoke-virtual {p0, p0}, Lde/nurogames/android/ticb/base/BillingService;->unbindService(Landroid/content/ServiceConnection;)V
/* :try_end_0 */
/* .catch Ljava/lang/IllegalArgumentException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 681 */
} // :goto_0
return;
/* .line 678 */
/* :catch_0 */
/* move-exception v0 */
} // .end method
