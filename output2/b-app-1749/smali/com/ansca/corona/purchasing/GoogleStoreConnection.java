public class com.ansca.corona.purchasing.GoogleStoreConnection implements android.content.ServiceConnection {
	 /* .source "GoogleStoreConnection.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/ansca/corona/purchasing/GoogleStoreConnection$GoogleStoreEventHandler; */
	 /* } */
} // .end annotation
/* # instance fields */
private com.ansca.corona.purchasing.GoogleStoreConnectionListener fConnectionListener;
private com.ansca.corona.purchasing.GoogleStoreConnectionState fConnectionState;
private android.content.Context fContext;
private com.android.vending.billing.IMarketBillingService fServiceInterface;
private com.ansca.corona.purchasing.GoogleStoreConnection$GoogleStoreEventHandler fStoreEventHandler;
/* # direct methods */
public com.ansca.corona.purchasing.GoogleStoreConnection ( ) {
	 /* .locals 2 */
	 /* .param p1, "context" # Landroid/content/Context; */
	 /* .prologue */
	 int v1 = 0; // const/4 v1, 0x0
	 /* .line 34 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 /* .line 37 */
	 /* if-nez p1, :cond_0 */
	 /* .line 38 */
	 /* new-instance v0, Ljava/lang/NullPointerException; */
	 /* invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V */
	 /* throw v0 */
	 /* .line 42 */
} // :cond_0
this.fContext = p1;
/* .line 43 */
v0 = com.ansca.corona.purchasing.GoogleStoreConnectionState.CLOSED;
this.fConnectionState = v0;
/* .line 44 */
this.fServiceInterface = v1;
/* .line 45 */
this.fStoreEventHandler = v1;
/* .line 46 */
this.fConnectionListener = v1;
/* .line 47 */
return;
} // .end method
static com.ansca.corona.purchasing.GoogleStoreConnectionListener access$000 ( com.ansca.corona.purchasing.GoogleStoreConnection p0 ) { //synthethic
/* .locals 1 */
/* .param p0, "x0" # Lcom/ansca/corona/purchasing/GoogleStoreConnection; */
/* .prologue */
/* .line 8 */
v0 = this.fConnectionListener;
} // .end method
/* # virtual methods */
public void close ( ) {
/* .locals 3 */
/* .prologue */
/* .line 93 */
v1 = this.fConnectionState;
v2 = com.ansca.corona.purchasing.GoogleStoreConnectionState.OPEN;
/* if-eq v1, v2, :cond_0 */
/* .line 105 */
} // :goto_0
return;
/* .line 99 */
} // :cond_0
try { // :try_start_0
v1 = com.ansca.corona.purchasing.GoogleStoreConnectionState.CLOSING;
this.fConnectionState = v1;
/* .line 100 */
v1 = this.fContext;
(( android.content.Context ) v1 ).unbindService ( p0 ); // invoke-virtual {v1, p0}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 102 */
/* :catch_0 */
/* move-exception v0 */
/* .line 103 */
/* .local v0, "ex":Ljava/lang/Exception; */
(( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
} // .end method
public com.ansca.corona.purchasing.GoogleStoreConnectionState getConnectionState ( ) {
/* .locals 1 */
/* .prologue */
/* .line 120 */
v0 = this.fConnectionState;
} // .end method
public com.ansca.corona.purchasing.GoogleStoreConnectionListener getListener ( ) {
/* .locals 1 */
/* .prologue */
/* .line 64 */
v0 = this.fConnectionListener;
} // .end method
public Boolean isOpen ( ) {
/* .locals 2 */
/* .prologue */
/* .line 112 */
v0 = this.fConnectionState;
v1 = com.ansca.corona.purchasing.GoogleStoreConnectionState.OPEN;
/* if-ne v0, v1, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public void onServiceConnected ( android.content.ComponentName p0, android.os.IBinder p1 ) {
/* .locals 1 */
/* .param p1, "name" # Landroid/content/ComponentName; */
/* .param p2, "service" # Landroid/os/IBinder; */
/* .prologue */
/* .line 193 */
/* if-nez p2, :cond_1 */
/* .line 210 */
} // :cond_0
} // :goto_0
return;
/* .line 198 */
} // :cond_1
com.android.vending.billing.IMarketBillingService$Stub .asInterface ( p2 );
this.fServiceInterface = v0;
/* .line 199 */
v0 = com.ansca.corona.purchasing.GoogleStoreConnectionState.OPEN;
this.fConnectionState = v0;
/* .line 202 */
v0 = this.fStoreEventHandler;
/* if-nez v0, :cond_2 */
/* .line 203 */
/* new-instance v0, Lcom/ansca/corona/purchasing/GoogleStoreConnection$GoogleStoreEventHandler; */
/* invoke-direct {v0, p0, p0}, Lcom/ansca/corona/purchasing/GoogleStoreConnection$GoogleStoreEventHandler;-><init>(Lcom/ansca/corona/purchasing/GoogleStoreConnection;Lcom/ansca/corona/purchasing/GoogleStoreConnection;)V */
this.fStoreEventHandler = v0;
/* .line 207 */
} // :cond_2
v0 = this.fConnectionListener;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 208 */
v0 = this.fConnectionListener;
} // .end method
public void onServiceDisconnected ( android.content.ComponentName p0 ) {
/* .locals 4 */
/* .param p1, "name" # Landroid/content/ComponentName; */
/* .prologue */
int v3 = 0; // const/4 v3, 0x0
/* .line 218 */
v1 = this.fConnectionState;
v2 = com.ansca.corona.purchasing.GoogleStoreConnectionState.CLOSING;
/* if-eq v1, v2, :cond_2 */
int v0 = 1; // const/4 v0, 0x1
/* .line 221 */
/* .local v0, "wasConnectionLost":Z */
} // :goto_0
this.fServiceInterface = v3;
/* .line 222 */
v1 = com.ansca.corona.purchasing.GoogleStoreConnectionState.CLOSED;
this.fConnectionState = v1;
/* .line 225 */
v1 = this.fStoreEventHandler;
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 226 */
v1 = this.fStoreEventHandler;
(( com.ansca.corona.purchasing.GoogleStoreConnection$GoogleStoreEventHandler ) v1 ).dispose ( ); // invoke-virtual {v1}, Lcom/ansca/corona/purchasing/GoogleStoreConnection$GoogleStoreEventHandler;->dispose()V
/* .line 227 */
this.fStoreEventHandler = v3;
/* .line 231 */
} // :cond_0
v1 = this.fConnectionListener;
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 232 */
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 233 */
v1 = this.fConnectionListener;
/* .line 239 */
} // :cond_1
} // :goto_1
return;
/* .line 218 */
} // .end local v0 # "wasConnectionLost":Z
} // :cond_2
int v0 = 0; // const/4 v0, 0x0
/* .line 236 */
/* .restart local v0 # "wasConnectionLost":Z */
} // :cond_3
v1 = this.fConnectionListener;
} // .end method
public void open ( ) {
/* .locals 6 */
/* .prologue */
/* .line 70 */
v4 = this.fConnectionState;
v5 = com.ansca.corona.purchasing.GoogleStoreConnectionState.CLOSED;
/* if-eq v4, v5, :cond_1 */
/* .line 88 */
} // :cond_0
} // :goto_0
return;
/* .line 75 */
} // :cond_1
int v3 = 0; // const/4 v3, 0x0
/* .line 77 */
/* .local v3, "wasSuccessful":Z */
try { // :try_start_0
v4 = com.ansca.corona.purchasing.GoogleStoreConnectionState.OPENING;
this.fConnectionState = v4;
/* .line 78 */
/* new-instance v2, Landroid/content/Intent; */
final String v4 = "com.android.vending.billing.MarketBillingService.BIND"; // const-string v4, "com.android.vending.billing.MarketBillingService.BIND"
/* invoke-direct {v2, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V */
/* .line 79 */
/* .local v2, "intent":Landroid/content/Intent; */
int v1 = 1; // const/4 v1, 0x1
/* .line 80 */
/* .local v1, "flags":I */
v4 = this.fContext;
(( android.content.Context ) v4 ).bindService ( v2, p0, v1 ); // invoke-virtual {v4, v2, p0, v1}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z
/* :try_end_0 */
v3 = /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 85 */
} // .end local v1 # "flags":I
} // .end local v2 # "intent":Landroid/content/Intent;
} // :goto_1
/* if-nez v3, :cond_0 */
/* .line 86 */
v4 = com.ansca.corona.purchasing.GoogleStoreConnectionState.CLOSED;
this.fConnectionState = v4;
/* .line 82 */
/* :catch_0 */
/* move-exception v0 */
/* .line 83 */
/* .local v0, "ex":Ljava/lang/Exception; */
(( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
} // .end method
public com.ansca.corona.purchasing.GoogleStoreSendRequestResult send ( com.ansca.corona.purchasing.GoogleStoreRequest p0 ) {
/* .locals 12 */
/* .param p1, "request" # Lcom/ansca/corona/purchasing/GoogleStoreRequest; */
/* .prologue */
/* .line 130 */
/* if-nez p1, :cond_1 */
/* .line 131 */
v0 = com.ansca.corona.purchasing.GoogleStoreRequestError.INVALID_REQUEST;
com.ansca.corona.purchasing.GoogleStoreSendRequestResult .failedWith ( v0 );
/* .line 183 */
} // :cond_0
} // :goto_0
/* .line 135 */
} // :cond_1
v0 = (( com.ansca.corona.purchasing.GoogleStoreConnection ) p0 ).isOpen ( ); // invoke-virtual {p0}, Lcom/ansca/corona/purchasing/GoogleStoreConnection;->isOpen()Z
/* if-nez v0, :cond_2 */
/* .line 136 */
v0 = com.ansca.corona.purchasing.GoogleStoreRequestError.CONNECTION_ERROR;
com.ansca.corona.purchasing.GoogleStoreSendRequestResult .failedWith ( v0 );
/* .line 140 */
} // :cond_2
(( com.ansca.corona.purchasing.GoogleStoreRequest ) p1 ).toBundle ( ); // invoke-virtual {p1}, Lcom/ansca/corona/purchasing/GoogleStoreRequest;->toBundle()Landroid/os/Bundle;
/* .line 141 */
/* .local v8, "requestBundle":Landroid/os/Bundle; */
int v10 = 0; // const/4 v10, 0x0
/* .line 143 */
/* .local v10, "resultBundle":Landroid/os/Bundle; */
try { // :try_start_0
v0 = this.fServiceInterface;
if ( v0 != null) { // if-eqz v0, :cond_3
if ( v8 != null) { // if-eqz v8, :cond_3
/* .line 144 */
final String v0 = "API_VERSION"; // const-string v0, "API_VERSION"
int v1 = 1; // const/4 v1, 0x1
(( android.os.Bundle ) v8 ).putInt ( v0, v1 ); // invoke-virtual {v8, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
/* .line 145 */
final String v0 = "PACKAGE_NAME"; // const-string v0, "PACKAGE_NAME"
v1 = this.fContext;
(( android.content.Context ) v1 ).getPackageName ( ); // invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
(( android.os.Bundle ) v8 ).putString ( v0, v1 ); // invoke-virtual {v8, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
/* .line 146 */
v0 = this.fServiceInterface;
/* :try_end_0 */
/* .catch Landroid/os/RemoteException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_1 */
/* .line 159 */
} // :cond_3
com.ansca.corona.purchasing.GoogleStoreSendRequestResult .from ( v10 );
/* .line 160 */
/* .local v9, "result":Lcom/ansca/corona/purchasing/GoogleStoreSendRequestResult; */
v0 = (( com.ansca.corona.purchasing.GoogleStoreSendRequestResult ) v9 ).hasFailed ( ); // invoke-virtual {v9}, Lcom/ansca/corona/purchasing/GoogleStoreSendRequestResult;->hasFailed()Z
/* if-nez v0, :cond_0 */
/* .line 165 */
/* instance-of v0, p1, Lcom/ansca/corona/purchasing/GoogleStorePurchaseRequest; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 166 */
int v11 = 0; // const/4 v11, 0x0
/* .line 168 */
/* .local v11, "wasWindowDisplayed":Z */
try { // :try_start_1
final String v0 = "PURCHASE_INTENT"; // const-string v0, "PURCHASE_INTENT"
(( android.os.Bundle ) v10 ).getParcelable ( v0 ); // invoke-virtual {v10, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;
/* check-cast v7, Landroid/app/PendingIntent; */
/* .line 169 */
/* .local v7, "pendingIntent":Landroid/app/PendingIntent; */
if ( v7 != null) { // if-eqz v7, :cond_4
/* .line 170 */
v0 = this.fContext;
(( android.app.PendingIntent ) v7 ).getIntentSender ( ); // invoke-virtual {v7}, Landroid/app/PendingIntent;->getIntentSender()Landroid/content/IntentSender;
/* new-instance v2, Landroid/content/Intent; */
/* invoke-direct {v2}, Landroid/content/Intent;-><init>()V */
int v3 = 0; // const/4 v3, 0x0
int v4 = 0; // const/4 v4, 0x0
int v5 = 0; // const/4 v5, 0x0
/* invoke-virtual/range {v0 ..v5}, Landroid/content/Context;->startIntentSender(Landroid/content/IntentSender;Landroid/content/Intent;III)V */
/* :try_end_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_2 */
/* .line 171 */
int v11 = 1; // const/4 v11, 0x1
/* .line 177 */
} // .end local v7 # "pendingIntent":Landroid/app/PendingIntent;
} // :cond_4
} // :goto_1
/* if-nez v11, :cond_0 */
/* .line 178 */
v0 = com.ansca.corona.purchasing.GoogleStoreRequestError.MARKETPLACE_ERROR;
com.ansca.corona.purchasing.GoogleStoreSendRequestResult .failedWith ( v0 );
/* .line 149 */
} // .end local v9 # "result":Lcom/ansca/corona/purchasing/GoogleStoreSendRequestResult;
} // .end local v11 # "wasWindowDisplayed":Z
/* :catch_0 */
/* move-exception v6 */
/* .line 150 */
/* .local v6, "ex":Landroid/os/RemoteException; */
int v0 = 0; // const/4 v0, 0x0
(( com.ansca.corona.purchasing.GoogleStoreConnection ) p0 ).onServiceDisconnected ( v0 ); // invoke-virtual {p0, v0}, Lcom/ansca/corona/purchasing/GoogleStoreConnection;->onServiceDisconnected(Landroid/content/ComponentName;)V
/* .line 151 */
v0 = com.ansca.corona.purchasing.GoogleStoreRequestError.CONNECTION_ERROR;
com.ansca.corona.purchasing.GoogleStoreSendRequestResult .failedWith ( v0 );
/* .line 153 */
} // .end local v6 # "ex":Landroid/os/RemoteException;
/* :catch_1 */
/* move-exception v6 */
/* .line 154 */
/* .local v6, "ex":Ljava/lang/Exception; */
(( java.lang.Exception ) v6 ).printStackTrace ( ); // invoke-virtual {v6}, Ljava/lang/Exception;->printStackTrace()V
/* .line 155 */
v0 = com.ansca.corona.purchasing.GoogleStoreRequestError.MARKETPLACE_ERROR;
com.ansca.corona.purchasing.GoogleStoreSendRequestResult .failedWith ( v0 );
/* .line 174 */
} // .end local v6 # "ex":Ljava/lang/Exception;
/* .restart local v9 # "result":Lcom/ansca/corona/purchasing/GoogleStoreSendRequestResult; */
/* .restart local v11 # "wasWindowDisplayed":Z */
/* :catch_2 */
/* move-exception v6 */
/* .line 175 */
/* .restart local v6 # "ex":Ljava/lang/Exception; */
(( java.lang.Exception ) v6 ).printStackTrace ( ); // invoke-virtual {v6}, Ljava/lang/Exception;->printStackTrace()V
} // .end method
public void setListener ( com.ansca.corona.purchasing.GoogleStoreConnectionListener p0 ) {
/* .locals 0 */
/* .param p1, "listener" # Lcom/ansca/corona/purchasing/GoogleStoreConnectionListener; */
/* .prologue */
/* .line 55 */
this.fConnectionListener = p1;
/* .line 56 */
return;
} // .end method
