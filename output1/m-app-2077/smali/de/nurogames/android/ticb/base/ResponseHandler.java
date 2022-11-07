public class de.nurogames.android.ticb.base.ResponseHandler {
	 /* .source "ResponseHandler.java" */
	 /* # static fields */
	 private static final java.lang.String TAG;
	 private static de.nurogames.android.ticb.base.PurchaseObserver sPurchaseObserver;
	 /* # direct methods */
	 public de.nurogames.android.ticb.base.ResponseHandler ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 26 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 static de.nurogames.android.ticb.base.PurchaseObserver access$0 ( ) { //synthethic
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 34 */
		 v0 = de.nurogames.android.ticb.base.ResponseHandler.sPurchaseObserver;
	 } // .end method
	 public static void buyPageIntentResponse ( android.app.PendingIntent p0, android.content.Intent p1 ) {
		 /* .locals 1 */
		 /* .param p0, "pendingIntent" # Landroid/app/PendingIntent; */
		 /* .param p1, "intent" # Landroid/content/Intent; */
		 /* .prologue */
		 /* .line 75 */
		 v0 = de.nurogames.android.ticb.base.ResponseHandler.sPurchaseObserver;
		 /* if-nez v0, :cond_0 */
		 /* .line 82 */
	 } // :goto_0
	 return;
	 /* .line 81 */
} // :cond_0
v0 = de.nurogames.android.ticb.base.ResponseHandler.sPurchaseObserver;
(( de.nurogames.android.ticb.base.PurchaseObserver ) v0 ).startBuyPageActivity ( p0, p1 ); // invoke-virtual {v0, p0, p1}, Lde/nurogames/android/ticb/base/PurchaseObserver;->startBuyPageActivity(Landroid/app/PendingIntent;Landroid/content/Intent;)V
} // .end method
public static void checkBillingSupportedResponse ( Boolean p0, java.lang.String p1 ) {
/* .locals 1 */
/* .param p0, "supported" # Z */
/* .param p1, "type" # Ljava/lang/String; */
/* .prologue */
/* .line 59 */
v0 = de.nurogames.android.ticb.base.ResponseHandler.sPurchaseObserver;
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 60 */
	 v0 = de.nurogames.android.ticb.base.ResponseHandler.sPurchaseObserver;
	 (( de.nurogames.android.ticb.base.PurchaseObserver ) v0 ).onBillingSupported ( p0, p1 ); // invoke-virtual {v0, p0, p1}, Lde/nurogames/android/ticb/base/PurchaseObserver;->onBillingSupported(ZLjava/lang/String;)V
	 /* .line 62 */
} // :cond_0
return;
} // .end method
public static void purchaseResponse ( android.content.Context p0, de.nurogames.android.ticb.base.Consts$PurchaseState p1, java.lang.String p2, java.lang.String p3, Long p4, java.lang.String p5 ) {
/* .locals 9 */
/* .param p0, "context" # Landroid/content/Context; */
/* .param p1, "purchaseState" # Lde/nurogames/android/ticb/base/Consts$PurchaseState; */
/* .param p2, "productId" # Ljava/lang/String; */
/* .param p3, "orderId" # Ljava/lang/String; */
/* .param p4, "purchaseTime" # J */
/* .param p6, "developerPayload" # Ljava/lang/String; */
/* .prologue */
/* .line 112 */
/* new-instance v8, Ljava/lang/Thread; */
/* new-instance v0, Lde/nurogames/android/ticb/base/ResponseHandler$1; */
/* move-object v1, p0 */
/* move-object v2, p3 */
/* move-object v3, p2 */
/* move-object v4, p1 */
/* move-wide v5, p4 */
/* move-object v7, p6 */
/* invoke-direct/range {v0 ..v7}, Lde/nurogames/android/ticb/base/ResponseHandler$1;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lde/nurogames/android/ticb/base/Consts$PurchaseState;JLjava/lang/String;)V */
/* invoke-direct {v8, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V */
/* .line 129 */
(( java.lang.Thread ) v8 ).start ( ); // invoke-virtual {v8}, Ljava/lang/Thread;->start()V
/* .line 130 */
return;
} // .end method
public static synchronized void register ( de.nurogames.android.ticb.base.PurchaseObserver p0 ) {
/* .locals 2 */
/* .param p0, "observer" # Lde/nurogames/android/ticb/base/PurchaseObserver; */
/* .prologue */
/* .line 41 */
/* const-class v0, Lde/nurogames/android/ticb/base/ResponseHandler; */
/* monitor-enter v0 */
try { // :try_start_0
	 /* :try_end_0 */
	 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
	 /* .line 42 */
	 /* monitor-exit v0 */
	 return;
	 /* .line 41 */
	 /* :catchall_0 */
	 /* move-exception v1 */
	 /* monitor-exit v0 */
	 /* throw v1 */
} // .end method
public static void responseCodeReceived ( android.content.Context p0, de.nurogames.android.ticb.base.BillingService$RequestPurchase p1, de.nurogames.android.ticb.base.Consts$ResponseCode p2 ) {
	 /* .locals 1 */
	 /* .param p0, "context" # Landroid/content/Context; */
	 /* .param p1, "request" # Lde/nurogames/android/ticb/base/BillingService$RequestPurchase; */
	 /* .param p2, "responseCode" # Lde/nurogames/android/ticb/base/Consts$ResponseCode; */
	 /* .prologue */
	 /* .line 147 */
	 v0 = de.nurogames.android.ticb.base.ResponseHandler.sPurchaseObserver;
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 148 */
		 v0 = de.nurogames.android.ticb.base.ResponseHandler.sPurchaseObserver;
		 (( de.nurogames.android.ticb.base.PurchaseObserver ) v0 ).onRequestPurchaseResponse ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lde/nurogames/android/ticb/base/PurchaseObserver;->onRequestPurchaseResponse(Lde/nurogames/android/ticb/base/BillingService$RequestPurchase;Lde/nurogames/android/ticb/base/Consts$ResponseCode;)V
		 /* .line 150 */
	 } // :cond_0
	 return;
} // .end method
public static void responseCodeReceived ( android.content.Context p0, de.nurogames.android.ticb.base.BillingService$RestoreTransactions p1, de.nurogames.android.ticb.base.Consts$ResponseCode p2 ) {
	 /* .locals 1 */
	 /* .param p0, "context" # Landroid/content/Context; */
	 /* .param p1, "request" # Lde/nurogames/android/ticb/base/BillingService$RestoreTransactions; */
	 /* .param p2, "responseCode" # Lde/nurogames/android/ticb/base/Consts$ResponseCode; */
	 /* .prologue */
	 /* .line 163 */
	 v0 = de.nurogames.android.ticb.base.ResponseHandler.sPurchaseObserver;
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 164 */
		 v0 = de.nurogames.android.ticb.base.ResponseHandler.sPurchaseObserver;
		 (( de.nurogames.android.ticb.base.PurchaseObserver ) v0 ).onRestoreTransactionsResponse ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lde/nurogames/android/ticb/base/PurchaseObserver;->onRestoreTransactionsResponse(Lde/nurogames/android/ticb/base/BillingService$RestoreTransactions;Lde/nurogames/android/ticb/base/Consts$ResponseCode;)V
		 /* .line 166 */
	 } // :cond_0
	 return;
} // .end method
public static synchronized void unregister ( de.nurogames.android.ticb.base.PurchaseObserver p0 ) {
	 /* .locals 2 */
	 /* .param p0, "observer" # Lde/nurogames/android/ticb/base/PurchaseObserver; */
	 /* .prologue */
	 /* .line 49 */
	 /* const-class v0, Lde/nurogames/android/ticb/base/ResponseHandler; */
	 /* monitor-enter v0 */
	 int v1 = 0; // const/4 v1, 0x0
	 try { // :try_start_0
		 /* :try_end_0 */
		 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
		 /* .line 50 */
		 /* monitor-exit v0 */
		 return;
		 /* .line 49 */
		 /* :catchall_0 */
		 /* move-exception v1 */
		 /* monitor-exit v0 */
		 /* throw v1 */
	 } // .end method
