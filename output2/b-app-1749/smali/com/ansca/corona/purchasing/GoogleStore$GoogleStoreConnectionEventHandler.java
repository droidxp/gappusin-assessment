class com.ansca.corona.purchasing.GoogleStore$GoogleStoreConnectionEventHandler implements com.ansca.corona.purchasing.GoogleStoreConnectionListener {
	 /* .source "GoogleStore.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/ansca/corona/purchasing/GoogleStore; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x2 */
/* name = "GoogleStoreConnectionEventHandler" */
} // .end annotation
/* # instance fields */
private com.ansca.corona.purchasing.GoogleStore fStore;
final com.ansca.corona.purchasing.GoogleStore this$0; //synthetic
/* # direct methods */
public com.ansca.corona.purchasing.GoogleStore$GoogleStoreConnectionEventHandler ( ) {
/* .locals 1 */
/* .param p2, "store" # Lcom/ansca/corona/purchasing/GoogleStore; */
/* .prologue */
/* .line 227 */
this.this$0 = p1;
/* .line 228 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 231 */
/* if-nez p2, :cond_0 */
/* .line 232 */
/* new-instance v0, Ljava/lang/NullPointerException; */
/* invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V */
/* throw v0 */
/* .line 236 */
} // :cond_0
this.fStore = p2;
/* .line 237 */
return;
} // .end method
/* # virtual methods */
public void onConnectionClosed ( ) {
/* .locals 0 */
/* .prologue */
/* .line 261 */
return;
} // .end method
public void onConnectionLost ( ) {
/* .locals 2 */
/* .prologue */
/* .line 251 */
v0 = this.fStore;
v0 = (( com.ansca.corona.purchasing.GoogleStore ) v0 ).isEnabled ( ); // invoke-virtual {v0}, Lcom/ansca/corona/purchasing/GoogleStore;->isEnabled()Z
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.fStore;
com.ansca.corona.purchasing.GoogleStore .access$100 ( v0 );
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 252 */
	 final String v0 = "Corona"; // const-string v0, "Corona"
	 final String v1 = "The connection to the Google Marketplace was lost unexpectedly.Attempting to restore the connection."; // const-string v1, "The connection to the Google Marketplace was lost unexpectedly.Attempting to restore the connection."
	 android.util.Log .v ( v0,v1 );
	 /* .line 254 */
	 v0 = this.fStore;
	 com.ansca.corona.purchasing.GoogleStore .access$100 ( v0 );
	 (( com.ansca.corona.purchasing.GoogleStoreConnection ) v0 ).open ( ); // invoke-virtual {v0}, Lcom/ansca/corona/purchasing/GoogleStoreConnection;->open()V
	 /* .line 256 */
} // :cond_0
return;
} // .end method
public void onConnectionOpened ( ) {
/* .locals 1 */
/* .prologue */
/* .line 242 */
v0 = this.fStore;
com.ansca.corona.purchasing.GoogleStore .access$000 ( v0 );
/* .line 243 */
return;
} // .end method
public void onReceivedNotification ( com.ansca.corona.purchasing.GoogleStoreNotification p0 ) {
/* .locals 7 */
/* .param p1, "notification" # Lcom/ansca/corona/purchasing/GoogleStoreNotification; */
/* .prologue */
/* .line 308 */
/* if-nez p1, :cond_0 */
/* .line 343 */
} // :goto_0
return;
/* .line 313 */
} // :cond_0
/* instance-of v5, p1, Lcom/ansca/corona/purchasing/GoogleStorePurchaseNotification; */
if ( v5 != null) { // if-eqz v5, :cond_2
/* move-object v2, p1 */
/* .line 315 */
/* check-cast v2, Lcom/ansca/corona/purchasing/GoogleStorePurchaseNotification; */
/* .line 318 */
/* .local v2, "purchaseNotification":Lcom/ansca/corona/purchasing/GoogleStorePurchaseNotification; */
v0 = com.ansca.corona.purchasing.StoreTransactionErrorType.NONE;
/* .line 319 */
/* .local v0, "errorType":Lcom/ansca/corona/purchasing/StoreTransactionErrorType; */
(( com.ansca.corona.purchasing.GoogleStorePurchaseNotification ) v2 ).getPurchaseState ( ); // invoke-virtual {v2}, Lcom/ansca/corona/purchasing/GoogleStorePurchaseNotification;->getPurchaseState()Lcom/ansca/corona/purchasing/GoogleStorePurchaseState;
v6 = com.ansca.corona.purchasing.GoogleStorePurchaseState.CANCELED;
/* if-ne v5, v6, :cond_1 */
/* .line 320 */
v0 = com.ansca.corona.purchasing.StoreTransactionErrorType.PAYMENT_CANCELED;
/* .line 324 */
} // :cond_1
/* new-instance v4, Lcom/ansca/corona/purchasing/StoreTransactionResultSettings; */
/* invoke-direct {v4}, Lcom/ansca/corona/purchasing/StoreTransactionResultSettings;-><init>()V */
/* .line 325 */
/* .local v4, "result":Lcom/ansca/corona/purchasing/StoreTransactionResultSettings; */
(( com.ansca.corona.purchasing.GoogleStorePurchaseNotification ) v2 ).getPurchaseState ( ); // invoke-virtual {v2}, Lcom/ansca/corona/purchasing/GoogleStorePurchaseNotification;->getPurchaseState()Lcom/ansca/corona/purchasing/GoogleStorePurchaseState;
(( com.ansca.corona.purchasing.GoogleStorePurchaseState ) v5 ).toTransactionState ( ); // invoke-virtual {v5}, Lcom/ansca/corona/purchasing/GoogleStorePurchaseState;->toTransactionState()Lcom/ansca/corona/purchasing/StoreTransactionState;
(( com.ansca.corona.purchasing.StoreTransactionResultSettings ) v4 ).setState ( v5 ); // invoke-virtual {v4, v5}, Lcom/ansca/corona/purchasing/StoreTransactionResultSettings;->setState(Lcom/ansca/corona/purchasing/StoreTransactionState;)V
/* .line 326 */
(( com.ansca.corona.purchasing.StoreTransactionResultSettings ) v4 ).setErrorType ( v0 ); // invoke-virtual {v4, v0}, Lcom/ansca/corona/purchasing/StoreTransactionResultSettings;->setErrorType(Lcom/ansca/corona/purchasing/StoreTransactionErrorType;)V
/* .line 327 */
(( com.ansca.corona.purchasing.GoogleStorePurchaseNotification ) v2 ).getProductStringId ( ); // invoke-virtual {v2}, Lcom/ansca/corona/purchasing/GoogleStorePurchaseNotification;->getProductStringId()Ljava/lang/String;
(( com.ansca.corona.purchasing.StoreTransactionResultSettings ) v4 ).setProductName ( v5 ); // invoke-virtual {v4, v5}, Lcom/ansca/corona/purchasing/StoreTransactionResultSettings;->setProductName(Ljava/lang/String;)V
/* .line 328 */
(( com.ansca.corona.purchasing.GoogleStorePurchaseNotification ) v2 ).getPurchaseOrderStringId ( ); // invoke-virtual {v2}, Lcom/ansca/corona/purchasing/GoogleStorePurchaseNotification;->getPurchaseOrderStringId()Ljava/lang/String;
(( com.ansca.corona.purchasing.StoreTransactionResultSettings ) v4 ).setReceipt ( v5 ); // invoke-virtual {v4, v5}, Lcom/ansca/corona/purchasing/StoreTransactionResultSettings;->setReceipt(Ljava/lang/String;)V
/* .line 329 */
(( com.ansca.corona.purchasing.GoogleStorePurchaseNotification ) v2 ).getNotificationStringId ( ); // invoke-virtual {v2}, Lcom/ansca/corona/purchasing/GoogleStorePurchaseNotification;->getNotificationStringId()Ljava/lang/String;
(( com.ansca.corona.purchasing.StoreTransactionResultSettings ) v4 ).setTransactionStringId ( v5 ); // invoke-virtual {v4, v5}, Lcom/ansca/corona/purchasing/StoreTransactionResultSettings;->setTransactionStringId(Ljava/lang/String;)V
/* .line 330 */
(( com.ansca.corona.purchasing.GoogleStorePurchaseNotification ) v2 ).getPurchaseTime ( ); // invoke-virtual {v2}, Lcom/ansca/corona/purchasing/GoogleStorePurchaseNotification;->getPurchaseTime()Ljava/util/Date;
(( com.ansca.corona.purchasing.StoreTransactionResultSettings ) v4 ).setTransactionTime ( v5 ); // invoke-virtual {v4, v5}, Lcom/ansca/corona/purchasing/StoreTransactionResultSettings;->setTransactionTime(Ljava/util/Date;)V
/* .line 331 */
v5 = this.this$0;
(( com.ansca.corona.purchasing.GoogleStore ) v5 ).raiseTransactionEventFor ( v4 ); // invoke-virtual {v5, v4}, Lcom/ansca/corona/purchasing/GoogleStore;->raiseTransactionEventFor(Lcom/ansca/corona/purchasing/StoreTransactionResultSettings;)V
/* .line 337 */
} // .end local v0 # "errorType":Lcom/ansca/corona/purchasing/StoreTransactionErrorType;
} // .end local v2 # "purchaseNotification":Lcom/ansca/corona/purchasing/GoogleStorePurchaseNotification;
} // .end local v4 # "result":Lcom/ansca/corona/purchasing/StoreTransactionResultSettings;
} // :cond_2
/* new-instance v1, Ljava/util/ArrayList; */
int v5 = 1; // const/4 v5, 0x1
/* invoke-direct {v1, v5}, Ljava/util/ArrayList;-><init>(I)V */
/* .line 338 */
/* .local v1, "notificationIds":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;" */
(( com.ansca.corona.purchasing.GoogleStoreNotification ) p1 ).getNotificationStringId ( ); // invoke-virtual {p1}, Lcom/ansca/corona/purchasing/GoogleStoreNotification;->getNotificationStringId()Ljava/lang/String;
(( java.util.ArrayList ) v1 ).add ( v5 ); // invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* .line 339 */
/* new-instance v3, Lcom/ansca/corona/purchasing/GoogleStoreFetchPendingPurchasesRequest; */
v5 = this.fStore;
com.ansca.corona.purchasing.GoogleStore .access$300 ( );
(( java.security.SecureRandom ) v5 ).nextLong ( ); // invoke-virtual {v5}, Ljava/security/SecureRandom;->nextLong()J
/* move-result-wide v5 */
/* invoke-direct {v3, v5, v6, v1}, Lcom/ansca/corona/purchasing/GoogleStoreFetchPendingPurchasesRequest;-><init>(JLjava/util/Collection;)V */
/* .line 340 */
/* .local v3, "request":Lcom/ansca/corona/purchasing/GoogleStoreFetchPendingPurchasesRequest; */
v5 = this.fStore;
com.ansca.corona.purchasing.GoogleStore .access$400 ( v5 );
(( java.util.ArrayList ) v5 ).add ( v3 ); // invoke-virtual {v5, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* .line 341 */
v5 = this.fStore;
com.ansca.corona.purchasing.GoogleStore .access$000 ( v5 );
} // .end method
public void onReceivedResponse ( Long p0, com.ansca.corona.purchasing.GoogleStoreResponseCode p1 ) {
/* .locals 4 */
/* .param p1, "requestId" # J */
/* .param p3, "responseCode" # Lcom/ansca/corona/purchasing/GoogleStoreResponseCode; */
/* .prologue */
/* .line 270 */
/* if-nez p3, :cond_1 */
/* .line 299 */
} // :cond_0
} // :goto_0
return;
/* .line 275 */
} // :cond_1
java.lang.Long .valueOf ( p1,p2 );
/* .line 276 */
/* .local v1, "requestKey":Ljava/lang/Long; */
v3 = this.fStore;
com.ansca.corona.purchasing.GoogleStore .access$200 ( v3 );
(( java.util.Hashtable ) v3 ).get ( v1 ); // invoke-virtual {v3, v1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v0, Lcom/ansca/corona/purchasing/GoogleStoreRequest; */
/* .line 277 */
/* .local v0, "request":Lcom/ansca/corona/purchasing/GoogleStoreRequest; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 282 */
v3 = this.fStore;
com.ansca.corona.purchasing.GoogleStore .access$200 ( v3 );
(( java.util.Hashtable ) v3 ).remove ( v1 ); // invoke-virtual {v3, v1}, Ljava/util/Hashtable;->remove(Ljava/lang/Object;)Ljava/lang/Object;
/* .line 285 */
v3 = (( com.ansca.corona.purchasing.GoogleStoreResponseCode ) p3 ).isError ( ); // invoke-virtual {p3}, Lcom/ansca/corona/purchasing/GoogleStoreResponseCode;->isError()Z
if ( v3 != null) { // if-eqz v3, :cond_0
/* .line 286 */
/* new-instance v2, Lcom/ansca/corona/purchasing/StoreTransactionResultSettings; */
/* invoke-direct {v2}, Lcom/ansca/corona/purchasing/StoreTransactionResultSettings;-><init>()V */
/* .line 287 */
/* .local v2, "result":Lcom/ansca/corona/purchasing/StoreTransactionResultSettings; */
v3 = com.ansca.corona.purchasing.GoogleStoreResponseCode.USER_CANCELED;
/* if-ne p3, v3, :cond_3 */
/* .line 288 */
v3 = com.ansca.corona.purchasing.StoreTransactionState.CANCELED;
(( com.ansca.corona.purchasing.StoreTransactionResultSettings ) v2 ).setState ( v3 ); // invoke-virtual {v2, v3}, Lcom/ansca/corona/purchasing/StoreTransactionResultSettings;->setState(Lcom/ansca/corona/purchasing/StoreTransactionState;)V
/* .line 293 */
} // :goto_1
(( com.ansca.corona.purchasing.GoogleStoreResponseCode ) p3 ).toTransactionErrorType ( ); // invoke-virtual {p3}, Lcom/ansca/corona/purchasing/GoogleStoreResponseCode;->toTransactionErrorType()Lcom/ansca/corona/purchasing/StoreTransactionErrorType;
(( com.ansca.corona.purchasing.StoreTransactionResultSettings ) v2 ).setErrorType ( v3 ); // invoke-virtual {v2, v3}, Lcom/ansca/corona/purchasing/StoreTransactionResultSettings;->setErrorType(Lcom/ansca/corona/purchasing/StoreTransactionErrorType;)V
/* .line 294 */
/* instance-of v3, v0, Lcom/ansca/corona/purchasing/GoogleStorePurchaseRequest; */
if ( v3 != null) { // if-eqz v3, :cond_2
/* .line 295 */
/* check-cast v0, Lcom/ansca/corona/purchasing/GoogleStorePurchaseRequest; */
} // .end local v0 # "request":Lcom/ansca/corona/purchasing/GoogleStoreRequest;
(( com.ansca.corona.purchasing.GoogleStorePurchaseRequest ) v0 ).getProductName ( ); // invoke-virtual {v0}, Lcom/ansca/corona/purchasing/GoogleStorePurchaseRequest;->getProductName()Ljava/lang/String;
(( com.ansca.corona.purchasing.StoreTransactionResultSettings ) v2 ).setProductName ( v3 ); // invoke-virtual {v2, v3}, Lcom/ansca/corona/purchasing/StoreTransactionResultSettings;->setProductName(Ljava/lang/String;)V
/* .line 297 */
} // :cond_2
v3 = this.this$0;
(( com.ansca.corona.purchasing.GoogleStore ) v3 ).raiseTransactionEventFor ( v2 ); // invoke-virtual {v3, v2}, Lcom/ansca/corona/purchasing/GoogleStore;->raiseTransactionEventFor(Lcom/ansca/corona/purchasing/StoreTransactionResultSettings;)V
/* .line 291 */
/* .restart local v0 # "request":Lcom/ansca/corona/purchasing/GoogleStoreRequest; */
} // :cond_3
v3 = com.ansca.corona.purchasing.StoreTransactionState.FAILED;
(( com.ansca.corona.purchasing.StoreTransactionResultSettings ) v2 ).setState ( v3 ); // invoke-virtual {v2, v3}, Lcom/ansca/corona/purchasing/StoreTransactionResultSettings;->setState(Lcom/ansca/corona/purchasing/StoreTransactionState;)V
} // .end method
