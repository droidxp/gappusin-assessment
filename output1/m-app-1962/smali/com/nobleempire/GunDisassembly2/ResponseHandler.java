public class com.nobleempire.GunDisassembly2.ResponseHandler {
	 /* .source "ResponseHandler.java" */
	 /* # static fields */
	 private static final java.lang.String TAG;
	 private static com.nobleempire.GunDisassembly2.PurchaseObserver sPurchaseObserver;
	 /* # direct methods */
	 public com.nobleempire.GunDisassembly2.ResponseHandler ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 18 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static void buyPageIntentResponse ( android.app.PendingIntent p0, android.content.Intent p1 ) {
		 /* .locals 1 */
		 /* .param p0, "pendingIntent" # Landroid/app/PendingIntent; */
		 /* .param p1, "intent" # Landroid/content/Intent; */
		 /* .prologue */
		 /* .line 47 */
		 v0 = com.nobleempire.GunDisassembly2.ResponseHandler.sPurchaseObserver;
		 /* if-nez v0, :cond_0 */
		 /* .line 52 */
	 } // :goto_0
	 return;
	 /* .line 51 */
} // :cond_0
v0 = com.nobleempire.GunDisassembly2.ResponseHandler.sPurchaseObserver;
(( com.nobleempire.GunDisassembly2.PurchaseObserver ) v0 ).startBuyPageActivity ( p0, p1 ); // invoke-virtual {v0, p0, p1}, Lcom/nobleempire/GunDisassembly2/PurchaseObserver;->startBuyPageActivity(Landroid/app/PendingIntent;Landroid/content/Intent;)V
} // .end method
public static void checkBillingSupportedResponse ( Boolean p0 ) {
/* .locals 1 */
/* .param p0, "supported" # Z */
/* .prologue */
/* .line 37 */
v0 = com.nobleempire.GunDisassembly2.ResponseHandler.sPurchaseObserver;
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 38 */
	 v0 = com.nobleempire.GunDisassembly2.ResponseHandler.sPurchaseObserver;
	 (( com.nobleempire.GunDisassembly2.PurchaseObserver ) v0 ).onBillingSupported ( p0 ); // invoke-virtual {v0, p0}, Lcom/nobleempire/GunDisassembly2/PurchaseObserver;->onBillingSupported(Z)V
	 /* .line 40 */
} // :cond_0
return;
} // .end method
public static native void notifyPurchase ( Integer p0, java.lang.String p1, java.lang.String p2 ) {
} // .end method
public static void purchaseResponse ( android.content.Context p0, com.nobleempire.GunDisassembly2.Consts$PurchaseState p1, java.lang.String p2, java.lang.String p3, Long p4, java.lang.String p5 ) {
/* .locals 3 */
/* .param p0, "context" # Landroid/content/Context; */
/* .param p1, "purchaseState" # Lcom/nobleempire/GunDisassembly2/Consts$PurchaseState; */
/* .param p2, "productId" # Ljava/lang/String; */
/* .param p3, "orderId" # Ljava/lang/String; */
/* .param p4, "purchaseTime" # J */
/* .param p6, "developerPayload" # Ljava/lang/String; */
/* .prologue */
/* .line 67 */
final String v0 = "ResponseHandler.java"; // const-string v0, "ResponseHandler.java"
/* new-instance v1, Ljava/lang/StringBuilder; */
final String v2 = "~~purchaseResponse context="; // const-string v2, "~~purchaseResponse context="
/* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v2 = " state="; // const-string v2, " state="
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v2 = " product="; // const-string v2, " product="
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p2 ); // invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = " order="; // const-string v2, " order="
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p3 ); // invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .v ( v0,v1 );
/* .line 68 */
v0 = (( com.nobleempire.GunDisassembly2.Consts$PurchaseState ) p1 ).ordinal ( ); // invoke-virtual {p1}, Lcom/nobleempire/GunDisassembly2/Consts$PurchaseState;->ordinal()I
com.nobleempire.GunDisassembly2.ResponseHandler .notifyPurchase ( v0,p2,p3 );
/* .line 84 */
return;
} // .end method
public static synchronized void register ( com.nobleempire.GunDisassembly2.PurchaseObserver p0 ) {
/* .locals 2 */
/* .param p0, "observer" # Lcom/nobleempire/GunDisassembly2/PurchaseObserver; */
/* .prologue */
/* .line 25 */
/* const-class v0, Lcom/nobleempire/GunDisassembly2/ResponseHandler; */
/* monitor-enter v0 */
try { // :try_start_0
	 /* :try_end_0 */
	 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
	 /* .line 26 */
	 /* monitor-exit v0 */
	 return;
	 /* .line 25 */
	 /* :catchall_0 */
	 /* move-exception v1 */
	 /* monitor-exit v0 */
	 /* throw v1 */
} // .end method
public static void responseCodeReceived ( android.content.Context p0, com.nobleempire.GunDisassembly2.BillingService$RequestPurchase p1, com.nobleempire.GunDisassembly2.Consts$ResponseCode p2 ) {
	 /* .locals 1 */
	 /* .param p0, "context" # Landroid/content/Context; */
	 /* .param p1, "request" # Lcom/nobleempire/GunDisassembly2/BillingService$RequestPurchase; */
	 /* .param p2, "responseCode" # Lcom/nobleempire/GunDisassembly2/Consts$ResponseCode; */
	 /* .prologue */
	 /* .line 93 */
	 v0 = com.nobleempire.GunDisassembly2.ResponseHandler.sPurchaseObserver;
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 94 */
		 v0 = com.nobleempire.GunDisassembly2.ResponseHandler.sPurchaseObserver;
		 (( com.nobleempire.GunDisassembly2.PurchaseObserver ) v0 ).onRequestPurchaseResponse ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lcom/nobleempire/GunDisassembly2/PurchaseObserver;->onRequestPurchaseResponse(Lcom/nobleempire/GunDisassembly2/BillingService$RequestPurchase;Lcom/nobleempire/GunDisassembly2/Consts$ResponseCode;)V
		 /* .line 96 */
	 } // :cond_0
	 return;
} // .end method
public static void responseCodeReceived ( android.content.Context p0, com.nobleempire.GunDisassembly2.BillingService$RestoreTransactions p1, com.nobleempire.GunDisassembly2.Consts$ResponseCode p2 ) {
	 /* .locals 1 */
	 /* .param p0, "context" # Landroid/content/Context; */
	 /* .param p1, "request" # Lcom/nobleempire/GunDisassembly2/BillingService$RestoreTransactions; */
	 /* .param p2, "responseCode" # Lcom/nobleempire/GunDisassembly2/Consts$ResponseCode; */
	 /* .prologue */
	 /* .line 103 */
	 v0 = com.nobleempire.GunDisassembly2.ResponseHandler.sPurchaseObserver;
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 104 */
		 v0 = com.nobleempire.GunDisassembly2.ResponseHandler.sPurchaseObserver;
		 (( com.nobleempire.GunDisassembly2.PurchaseObserver ) v0 ).onRestoreTransactionsResponse ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lcom/nobleempire/GunDisassembly2/PurchaseObserver;->onRestoreTransactionsResponse(Lcom/nobleempire/GunDisassembly2/BillingService$RestoreTransactions;Lcom/nobleempire/GunDisassembly2/Consts$ResponseCode;)V
		 /* .line 106 */
	 } // :cond_0
	 return;
} // .end method
public static synchronized void unregister ( com.nobleempire.GunDisassembly2.PurchaseObserver p0 ) {
	 /* .locals 2 */
	 /* .param p0, "observer" # Lcom/nobleempire/GunDisassembly2/PurchaseObserver; */
	 /* .prologue */
	 /* .line 31 */
	 /* const-class v0, Lcom/nobleempire/GunDisassembly2/ResponseHandler; */
	 /* monitor-enter v0 */
	 int v1 = 0; // const/4 v1, 0x0
	 try { // :try_start_0
		 /* :try_end_0 */
		 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
		 /* .line 32 */
		 /* monitor-exit v0 */
		 return;
		 /* .line 31 */
		 /* :catchall_0 */
		 /* move-exception v1 */
		 /* monitor-exit v0 */
		 /* throw v1 */
	 } // .end method
