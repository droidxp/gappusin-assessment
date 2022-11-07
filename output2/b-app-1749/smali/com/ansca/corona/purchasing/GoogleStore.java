public class com.ansca.corona.purchasing.GoogleStore extends com.ansca.corona.purchasing.Store {
	 /* .source "GoogleStore.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/ansca/corona/purchasing/GoogleStore$GoogleStoreConnectionEventHandler; */
	 /* } */
} // .end annotation
/* # static fields */
private static java.security.SecureRandom sRandomNumberGenerator;
/* # instance fields */
private com.ansca.corona.purchasing.GoogleStoreConnection fConnection;
private Boolean fHasPermission;
private java.util.ArrayList fRequestQueue;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/ArrayList", */
/* "<", */
/* "Lcom/ansca/corona/purchasing/GoogleStoreRequest;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
private java.util.Hashtable fSentRequests;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Hashtable", */
/* "<", */
/* "Ljava/lang/Long;", */
/* "Lcom/ansca/corona/purchasing/GoogleStoreRequest;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
static com.ansca.corona.purchasing.GoogleStore ( ) {
/* .locals 1 */
/* .prologue */
/* .line 24 */
/* new-instance v0, Ljava/security/SecureRandom; */
/* invoke-direct {v0}, Ljava/security/SecureRandom;-><init>()V */
return;
} // .end method
public com.ansca.corona.purchasing.GoogleStore ( ) {
/* .locals 3 */
/* .prologue */
/* .line 29 */
/* invoke-direct {p0}, Lcom/ansca/corona/purchasing/Store;-><init>()V */
/* .line 32 */
int v2 = 0; // const/4 v2, 0x0
this.fConnection = v2;
/* .line 33 */
/* new-instance v2, Ljava/util/ArrayList; */
/* invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V */
this.fRequestQueue = v2;
/* .line 34 */
/* new-instance v2, Ljava/util/Hashtable; */
/* invoke-direct {v2}, Ljava/util/Hashtable;-><init>()V */
this.fSentRequests = v2;
/* .line 38 */
int v2 = 0; // const/4 v2, 0x0
/* iput-boolean v2, p0, Lcom/ansca/corona/purchasing/GoogleStore;->fHasPermission:Z */
/* .line 40 */
try { // :try_start_0
final String v1 = "com.android.vending.BILLING"; // const-string v1, "com.android.vending.BILLING"
/* .line 41 */
/* .local v1, "permissionName":Ljava/lang/String; */
com.ansca.corona.CoronaEnvironment .getApplicationContext ( );
/* .line 42 */
/* .local v0, "context":Landroid/content/Context; */
v2 = (( android.content.Context ) v0 ).checkCallingOrSelfPermission ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/Context;->checkCallingOrSelfPermission(Ljava/lang/String;)I
/* if-nez v2, :cond_0 */
/* .line 43 */
int v2 = 1; // const/4 v2, 0x1
/* iput-boolean v2, p0, Lcom/ansca/corona/purchasing/GoogleStore;->fHasPermission:Z */
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 47 */
} // .end local v0 # "context":Landroid/content/Context;
} // .end local v1 # "permissionName":Ljava/lang/String;
} // :cond_0
} // :goto_0
return;
/* .line 46 */
/* :catch_0 */
/* move-exception v2 */
} // .end method
static void access$000 ( com.ansca.corona.purchasing.GoogleStore p0 ) { //synthethic
/* .locals 0 */
/* .param p0, "x0" # Lcom/ansca/corona/purchasing/GoogleStore; */
/* .prologue */
/* .line 7 */
/* invoke-direct {p0}, Lcom/ansca/corona/purchasing/GoogleStore;->sendRequests()V */
return;
} // .end method
static com.ansca.corona.purchasing.GoogleStoreConnection access$100 ( com.ansca.corona.purchasing.GoogleStore p0 ) { //synthethic
/* .locals 1 */
/* .param p0, "x0" # Lcom/ansca/corona/purchasing/GoogleStore; */
/* .prologue */
/* .line 7 */
v0 = this.fConnection;
} // .end method
static java.util.Hashtable access$200 ( com.ansca.corona.purchasing.GoogleStore p0 ) { //synthethic
/* .locals 1 */
/* .param p0, "x0" # Lcom/ansca/corona/purchasing/GoogleStore; */
/* .prologue */
/* .line 7 */
v0 = this.fSentRequests;
} // .end method
static java.security.SecureRandom access$300 ( ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 7 */
v0 = com.ansca.corona.purchasing.GoogleStore.sRandomNumberGenerator;
} // .end method
static java.util.ArrayList access$400 ( com.ansca.corona.purchasing.GoogleStore p0 ) { //synthethic
/* .locals 1 */
/* .param p0, "x0" # Lcom/ansca/corona/purchasing/GoogleStore; */
/* .prologue */
/* .line 7 */
v0 = this.fRequestQueue;
} // .end method
private void sendRequests ( ) {
/* .locals 7 */
/* .prologue */
int v6 = 0; // const/4 v6, 0x0
/* .line 155 */
v3 = (( com.ansca.corona.purchasing.GoogleStore ) p0 ).isDisabled ( ); // invoke-virtual {p0}, Lcom/ansca/corona/purchasing/GoogleStore;->isDisabled()Z
if ( v3 != null) { // if-eqz v3, :cond_1
/* .line 212 */
} // :cond_0
return;
/* .line 160 */
} // :cond_1
v3 = this.fConnection;
if ( v3 != null) { // if-eqz v3, :cond_2
v3 = this.fConnection;
v3 = (( com.ansca.corona.purchasing.GoogleStoreConnection ) v3 ).isOpen ( ); // invoke-virtual {v3}, Lcom/ansca/corona/purchasing/GoogleStoreConnection;->isOpen()Z
/* if-nez v3, :cond_2 */
/* .line 161 */
v3 = this.fConnection;
(( com.ansca.corona.purchasing.GoogleStoreConnection ) v3 ).open ( ); // invoke-virtual {v3}, Lcom/ansca/corona/purchasing/GoogleStoreConnection;->open()V
/* .line 165 */
} // :cond_2
} // :goto_0
v3 = this.fRequestQueue;
v3 = (( java.util.ArrayList ) v3 ).size ( ); // invoke-virtual {v3}, Ljava/util/ArrayList;->size()I
/* if-lez v3, :cond_0 */
/* .line 168 */
v3 = (( com.ansca.corona.purchasing.GoogleStore ) p0 ).isDisabled ( ); // invoke-virtual {p0}, Lcom/ansca/corona/purchasing/GoogleStore;->isDisabled()Z
/* if-nez v3, :cond_0 */
v3 = this.fConnection;
if ( v3 != null) { // if-eqz v3, :cond_0
v3 = this.fConnection;
v3 = (( com.ansca.corona.purchasing.GoogleStoreConnection ) v3 ).isOpen ( ); // invoke-virtual {v3}, Lcom/ansca/corona/purchasing/GoogleStoreConnection;->isOpen()Z
if ( v3 != null) { // if-eqz v3, :cond_0
/* .line 173 */
v3 = this.fRequestQueue;
(( java.util.ArrayList ) v3 ).get ( v6 ); // invoke-virtual {v3, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Lcom/ansca/corona/purchasing/GoogleStoreRequest; */
/* .line 174 */
/* .local v0, "request":Lcom/ansca/corona/purchasing/GoogleStoreRequest; */
v3 = this.fConnection;
(( com.ansca.corona.purchasing.GoogleStoreConnection ) v3 ).send ( v0 ); // invoke-virtual {v3, v0}, Lcom/ansca/corona/purchasing/GoogleStoreConnection;->send(Lcom/ansca/corona/purchasing/GoogleStoreRequest;)Lcom/ansca/corona/purchasing/GoogleStoreSendRequestResult;
/* .line 175 */
/* .local v1, "result":Lcom/ansca/corona/purchasing/GoogleStoreSendRequestResult; */
if ( v1 != null) { // if-eqz v1, :cond_3
v3 = (( com.ansca.corona.purchasing.GoogleStoreSendRequestResult ) v1 ).wasSuccessful ( ); // invoke-virtual {v1}, Lcom/ansca/corona/purchasing/GoogleStoreSendRequestResult;->wasSuccessful()Z
if ( v3 != null) { // if-eqz v3, :cond_3
/* .line 178 */
v3 = this.fRequestQueue;
(( java.util.ArrayList ) v3 ).remove ( v6 ); // invoke-virtual {v3, v6}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;
/* .line 179 */
v3 = this.fSentRequests;
(( com.ansca.corona.purchasing.GoogleStoreSendRequestResult ) v1 ).getRequestId ( ); // invoke-virtual {v1}, Lcom/ansca/corona/purchasing/GoogleStoreSendRequestResult;->getRequestId()J
/* move-result-wide v4 */
java.lang.Long .valueOf ( v4,v5 );
(( java.util.Hashtable ) v3 ).put ( v4, v0 ); // invoke-virtual {v3, v4, v0}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 183 */
} // :cond_3
if ( v1 != null) { // if-eqz v1, :cond_4
(( com.ansca.corona.purchasing.GoogleStoreSendRequestResult ) v1 ).getError ( ); // invoke-virtual {v1}, Lcom/ansca/corona/purchasing/GoogleStoreSendRequestResult;->getError()Lcom/ansca/corona/purchasing/GoogleStoreRequestError;
v4 = com.ansca.corona.purchasing.GoogleStoreRequestError.INVALID_REQUEST;
/* if-eq v3, v4, :cond_4 */
(( com.ansca.corona.purchasing.GoogleStoreSendRequestResult ) v1 ).getError ( ); // invoke-virtual {v1}, Lcom/ansca/corona/purchasing/GoogleStoreSendRequestResult;->getError()Lcom/ansca/corona/purchasing/GoogleStoreRequestError;
v4 = com.ansca.corona.purchasing.GoogleStoreRequestError.MARKETPLACE_ERROR;
/* if-ne v3, v4, :cond_0 */
/* .line 188 */
} // :cond_4
v3 = this.fRequestQueue;
(( java.util.ArrayList ) v3 ).remove ( v6 ); // invoke-virtual {v3, v6}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;
/* .line 189 */
/* new-instance v2, Lcom/ansca/corona/purchasing/StoreTransactionResultSettings; */
/* invoke-direct {v2}, Lcom/ansca/corona/purchasing/StoreTransactionResultSettings;-><init>()V */
/* .line 190 */
/* .local v2, "transactionResult":Lcom/ansca/corona/purchasing/StoreTransactionResultSettings; */
v3 = com.ansca.corona.purchasing.StoreTransactionState.FAILED;
(( com.ansca.corona.purchasing.StoreTransactionResultSettings ) v2 ).setState ( v3 ); // invoke-virtual {v2, v3}, Lcom/ansca/corona/purchasing/StoreTransactionResultSettings;->setState(Lcom/ansca/corona/purchasing/StoreTransactionState;)V
/* .line 191 */
v3 = com.ansca.corona.purchasing.StoreTransactionErrorType.CLIENT_INVALID;
(( com.ansca.corona.purchasing.StoreTransactionResultSettings ) v2 ).setErrorType ( v3 ); // invoke-virtual {v2, v3}, Lcom/ansca/corona/purchasing/StoreTransactionResultSettings;->setErrorType(Lcom/ansca/corona/purchasing/StoreTransactionErrorType;)V
/* .line 192 */
/* instance-of v3, v0, Lcom/ansca/corona/purchasing/GoogleStorePurchaseRequest; */
if ( v3 != null) { // if-eqz v3, :cond_5
/* .line 193 */
/* check-cast v0, Lcom/ansca/corona/purchasing/GoogleStorePurchaseRequest; */
} // .end local v0 # "request":Lcom/ansca/corona/purchasing/GoogleStoreRequest;
(( com.ansca.corona.purchasing.GoogleStorePurchaseRequest ) v0 ).getProductName ( ); // invoke-virtual {v0}, Lcom/ansca/corona/purchasing/GoogleStorePurchaseRequest;->getProductName()Ljava/lang/String;
(( com.ansca.corona.purchasing.StoreTransactionResultSettings ) v2 ).setProductName ( v3 ); // invoke-virtual {v2, v3}, Lcom/ansca/corona/purchasing/StoreTransactionResultSettings;->setProductName(Ljava/lang/String;)V
/* .line 195 */
} // :cond_5
if ( v1 != null) { // if-eqz v1, :cond_6
/* .line 196 */
(( com.ansca.corona.purchasing.GoogleStoreSendRequestResult ) v1 ).getError ( ); // invoke-virtual {v1}, Lcom/ansca/corona/purchasing/GoogleStoreSendRequestResult;->getError()Lcom/ansca/corona/purchasing/GoogleStoreRequestError;
v4 = com.ansca.corona.purchasing.GoogleStoreRequestError.INVALID_REQUEST;
/* if-ne v3, v4, :cond_7 */
/* .line 197 */
final String v3 = "The request was invalid."; // const-string v3, "The request was invalid."
(( com.ansca.corona.purchasing.StoreTransactionResultSettings ) v2 ).setErrorMessage ( v3 ); // invoke-virtual {v2, v3}, Lcom/ansca/corona/purchasing/StoreTransactionResultSettings;->setErrorMessage(Ljava/lang/String;)V
/* .line 203 */
} // :cond_6
} // :goto_1
(( com.ansca.corona.purchasing.GoogleStore ) p0 ).raiseTransactionEventFor ( v2 ); // invoke-virtual {p0, v2}, Lcom/ansca/corona/purchasing/GoogleStore;->raiseTransactionEventFor(Lcom/ansca/corona/purchasing/StoreTransactionResultSettings;)V
/* goto/16 :goto_0 */
/* .line 199 */
} // :cond_7
(( com.ansca.corona.purchasing.GoogleStoreSendRequestResult ) v1 ).getError ( ); // invoke-virtual {v1}, Lcom/ansca/corona/purchasing/GoogleStoreSendRequestResult;->getError()Lcom/ansca/corona/purchasing/GoogleStoreRequestError;
v4 = com.ansca.corona.purchasing.GoogleStoreRequestError.MARKETPLACE_ERROR;
/* if-ne v3, v4, :cond_6 */
/* .line 200 */
final String v3 = "The Android Marketplace app has not been properly configured with an account."; // const-string v3, "The Android Marketplace app has not been properly configured with an account."
(( com.ansca.corona.purchasing.StoreTransactionResultSettings ) v2 ).setErrorMessage ( v3 ); // invoke-virtual {v2, v3}, Lcom/ansca/corona/purchasing/StoreTransactionResultSettings;->setErrorMessage(Ljava/lang/String;)V
} // .end method
/* # virtual methods */
public Boolean canMakePurchases ( ) {
/* .locals 1 */
/* .prologue */
/* .line 88 */
/* iget-boolean v0, p0, Lcom/ansca/corona/purchasing/GoogleStore;->fHasPermission:Z */
/* if-nez v0, :cond_0 */
/* .line 89 */
int v0 = 0; // const/4 v0, 0x0
/* .line 95 */
} // :goto_0
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
} // .end method
public void confirmTransaction ( java.lang.String p0 ) {
/* .locals 3 */
/* .param p1, "transactionStringId" # Ljava/lang/String; */
/* .prologue */
/* .line 138 */
v2 = (( com.ansca.corona.purchasing.GoogleStore ) p0 ).isDisabled ( ); // invoke-virtual {p0}, Lcom/ansca/corona/purchasing/GoogleStore;->isDisabled()Z
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 150 */
} // :goto_0
return;
/* .line 145 */
} // :cond_0
/* new-instance v0, Ljava/util/ArrayList; */
int v2 = 1; // const/4 v2, 0x1
/* invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V */
/* .line 146 */
/* .local v0, "notificationIds":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;" */
(( java.util.ArrayList ) v0 ).add ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* .line 147 */
/* new-instance v1, Lcom/ansca/corona/purchasing/GoogleStoreConfirmPendingPurchasesRequest; */
/* invoke-direct {v1, v0}, Lcom/ansca/corona/purchasing/GoogleStoreConfirmPendingPurchasesRequest;-><init>(Ljava/util/Collection;)V */
/* .line 148 */
/* .local v1, "request":Lcom/ansca/corona/purchasing/GoogleStoreRequest; */
v2 = this.fRequestQueue;
(( java.util.ArrayList ) v2 ).add ( v1 ); // invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* .line 149 */
/* invoke-direct {p0}, Lcom/ansca/corona/purchasing/GoogleStore;->sendRequests()V */
} // .end method
protected void onDisabled ( ) {
/* .locals 2 */
/* .prologue */
int v1 = 0; // const/4 v1, 0x0
/* .line 72 */
v0 = this.fConnection;
/* if-nez v0, :cond_0 */
/* .line 80 */
} // :goto_0
return;
/* .line 77 */
} // :cond_0
v0 = this.fConnection;
(( com.ansca.corona.purchasing.GoogleStoreConnection ) v0 ).setListener ( v1 ); // invoke-virtual {v0, v1}, Lcom/ansca/corona/purchasing/GoogleStoreConnection;->setListener(Lcom/ansca/corona/purchasing/GoogleStoreConnectionListener;)V
/* .line 78 */
v0 = this.fConnection;
(( com.ansca.corona.purchasing.GoogleStoreConnection ) v0 ).close ( ); // invoke-virtual {v0}, Lcom/ansca/corona/purchasing/GoogleStoreConnection;->close()V
/* .line 79 */
this.fConnection = v1;
} // .end method
protected void onEnabled ( ) {
/* .locals 2 */
/* .prologue */
/* .line 56 */
v0 = this.fConnection;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 57 */
(( com.ansca.corona.purchasing.GoogleStore ) p0 ).onDisabled ( ); // invoke-virtual {p0}, Lcom/ansca/corona/purchasing/GoogleStore;->onDisabled()V
/* .line 61 */
} // :cond_0
/* new-instance v0, Lcom/ansca/corona/purchasing/GoogleStoreConnection; */
(( com.ansca.corona.purchasing.GoogleStore ) p0 ).getActivity ( ); // invoke-virtual {p0}, Lcom/ansca/corona/purchasing/GoogleStore;->getActivity()Landroid/app/Activity;
/* invoke-direct {v0, v1}, Lcom/ansca/corona/purchasing/GoogleStoreConnection;-><init>(Landroid/content/Context;)V */
this.fConnection = v0;
/* .line 62 */
v0 = this.fConnection;
/* new-instance v1, Lcom/ansca/corona/purchasing/GoogleStore$GoogleStoreConnectionEventHandler; */
/* invoke-direct {v1, p0, p0}, Lcom/ansca/corona/purchasing/GoogleStore$GoogleStoreConnectionEventHandler;-><init>(Lcom/ansca/corona/purchasing/GoogleStore;Lcom/ansca/corona/purchasing/GoogleStore;)V */
(( com.ansca.corona.purchasing.GoogleStoreConnection ) v0 ).setListener ( v1 ); // invoke-virtual {v0, v1}, Lcom/ansca/corona/purchasing/GoogleStoreConnection;->setListener(Lcom/ansca/corona/purchasing/GoogleStoreConnectionListener;)V
/* .line 63 */
v0 = this.fConnection;
(( com.ansca.corona.purchasing.GoogleStoreConnection ) v0 ).open ( ); // invoke-virtual {v0}, Lcom/ansca/corona/purchasing/GoogleStoreConnection;->open()V
/* .line 64 */
return;
} // .end method
public void purchase ( java.lang.String p0 ) {
/* .locals 2 */
/* .param p1, "productName" # Ljava/lang/String; */
/* .prologue */
/* .line 104 */
v1 = (( com.ansca.corona.purchasing.GoogleStore ) p0 ).isDisabled ( ); // invoke-virtual {p0}, Lcom/ansca/corona/purchasing/GoogleStore;->isDisabled()Z
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 117 */
} // :cond_0
} // :goto_0
return;
/* .line 109 */
} // :cond_1
if ( p1 != null) { // if-eqz p1, :cond_0
v1 = (( java.lang.String ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/String;->length()I
/* if-lez v1, :cond_0 */
/* .line 114 */
/* new-instance v0, Lcom/ansca/corona/purchasing/GoogleStorePurchaseRequest; */
/* invoke-direct {v0, p1}, Lcom/ansca/corona/purchasing/GoogleStorePurchaseRequest;-><init>(Ljava/lang/String;)V */
/* .line 115 */
/* .local v0, "request":Lcom/ansca/corona/purchasing/GoogleStorePurchaseRequest; */
v1 = this.fRequestQueue;
(( java.util.ArrayList ) v1 ).add ( v0 ); // invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* .line 116 */
/* invoke-direct {p0}, Lcom/ansca/corona/purchasing/GoogleStore;->sendRequests()V */
} // .end method
public void restorePurchases ( ) {
/* .locals 3 */
/* .prologue */
/* .line 122 */
v1 = (( com.ansca.corona.purchasing.GoogleStore ) p0 ).isDisabled ( ); // invoke-virtual {p0}, Lcom/ansca/corona/purchasing/GoogleStore;->isDisabled()Z
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 130 */
} // :goto_0
return;
/* .line 127 */
} // :cond_0
/* new-instance v0, Lcom/ansca/corona/purchasing/GoogleStoreRestoreRequest; */
v1 = com.ansca.corona.purchasing.GoogleStore.sRandomNumberGenerator;
(( java.security.SecureRandom ) v1 ).nextLong ( ); // invoke-virtual {v1}, Ljava/security/SecureRandom;->nextLong()J
/* move-result-wide v1 */
/* invoke-direct {v0, v1, v2}, Lcom/ansca/corona/purchasing/GoogleStoreRestoreRequest;-><init>(J)V */
/* .line 128 */
/* .local v0, "request":Lcom/ansca/corona/purchasing/GoogleStoreRestoreRequest; */
v1 = this.fRequestQueue;
(( java.util.ArrayList ) v1 ).add ( v0 ); // invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* .line 129 */
/* invoke-direct {p0}, Lcom/ansca/corona/purchasing/GoogleStore;->sendRequests()V */
} // .end method
