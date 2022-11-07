abstract class com.nobleempire.GunDisassembly2.BillingService$BillingRequest {
	 /* .source "BillingService.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/nobleempire/GunDisassembly2/BillingService; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x400 */
/* name = "BillingRequest" */
} // .end annotation
/* # instance fields */
protected Long mRequestId;
private final Integer mStartId;
final com.nobleempire.GunDisassembly2.BillingService this$0; //synthetic
/* # direct methods */
public com.nobleempire.GunDisassembly2.BillingService$BillingRequest ( ) {
/* .locals 0 */
/* .param p2, "startId" # I */
/* .prologue */
/* .line 47 */
this.this$0 = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 48 */
/* iput p2, p0, Lcom/nobleempire/GunDisassembly2/BillingService$BillingRequest;->mStartId:I */
/* .line 50 */
return;
} // .end method
/* # virtual methods */
public Integer getStartId ( ) {
/* .locals 1 */
/* .prologue */
/* .line 51 */
/* iget v0, p0, Lcom/nobleempire/GunDisassembly2/BillingService$BillingRequest;->mStartId:I */
} // .end method
protected void logResponseCode ( java.lang.String p0, android.os.Bundle p1 ) {
/* .locals 2 */
/* .param p1, "method" # Ljava/lang/String; */
/* .param p2, "response" # Landroid/os/Bundle; */
/* .prologue */
/* .line 104 */
final String v1 = "RESPONSE_CODE"; // const-string v1, "RESPONSE_CODE"
v1 = (( android.os.Bundle ) p2 ).getInt ( v1 ); // invoke-virtual {p2, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I
com.nobleempire.GunDisassembly2.Consts$ResponseCode .valueOf ( v1 );
/* .line 106 */
/* .local v0, "responseCode":Lcom/nobleempire/GunDisassembly2/Consts$ResponseCode; */
return;
} // .end method
protected android.os.Bundle makeRequestBundle ( java.lang.String p0 ) {
/* .locals 3 */
/* .param p1, "method" # Ljava/lang/String; */
/* .prologue */
/* .line 96 */
/* new-instance v0, Landroid/os/Bundle; */
/* invoke-direct {v0}, Landroid/os/Bundle;-><init>()V */
/* .line 97 */
/* .local v0, "request":Landroid/os/Bundle; */
final String v1 = "BILLING_REQUEST"; // const-string v1, "BILLING_REQUEST"
(( android.os.Bundle ) v0 ).putString ( v1, p1 ); // invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
/* .line 98 */
final String v1 = "API_VERSION"; // const-string v1, "API_VERSION"
int v2 = 1; // const/4 v2, 0x1
(( android.os.Bundle ) v0 ).putInt ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
/* .line 99 */
final String v1 = "PACKAGE_NAME"; // const-string v1, "PACKAGE_NAME"
v2 = this.this$0;
(( com.nobleempire.GunDisassembly2.BillingService ) v2 ).getPackageName ( ); // invoke-virtual {v2}, Lcom/nobleempire/GunDisassembly2/BillingService;->getPackageName()Ljava/lang/String;
(( android.os.Bundle ) v0 ).putString ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
/* .line 100 */
} // .end method
protected void onRemoteException ( android.os.RemoteException p0 ) {
/* .locals 1 */
/* .param p1, "e" # Landroid/os/RemoteException; */
/* .prologue */
/* .line 84 */
int v0 = 0; // const/4 v0, 0x0
com.nobleempire.GunDisassembly2.BillingService .access$4 ( v0 );
/* .line 85 */
return;
} // .end method
protected void responseCodeReceived ( com.nobleempire.GunDisassembly2.Consts$ResponseCode p0 ) {
/* .locals 0 */
/* .param p1, "responseCode" # Lcom/nobleempire/GunDisassembly2/Consts$ResponseCode; */
/* .prologue */
/* .line 93 */
return;
} // .end method
protected abstract Long run ( ) {
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Landroid/os/RemoteException; */
/* } */
} // .end annotation
} // .end method
public Boolean runIfConnected ( ) {
/* .locals 5 */
/* .prologue */
/* .line 68 */
com.nobleempire.GunDisassembly2.BillingService .access$2 ( );
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 70 */
try { // :try_start_0
	 (( com.nobleempire.GunDisassembly2.BillingService$BillingRequest ) p0 ).run ( ); // invoke-virtual {p0}, Lcom/nobleempire/GunDisassembly2/BillingService$BillingRequest;->run()J
	 /* move-result-wide v1 */
	 /* iput-wide v1, p0, Lcom/nobleempire/GunDisassembly2/BillingService$BillingRequest;->mRequestId:J */
	 /* .line 72 */
	 /* iget-wide v1, p0, Lcom/nobleempire/GunDisassembly2/BillingService$BillingRequest;->mRequestId:J */
	 /* const-wide/16 v3, 0x0 */
	 /* cmp-long v1, v1, v3 */
	 /* if-ltz v1, :cond_0 */
	 com.nobleempire.GunDisassembly2.BillingService .access$3 ( );
	 /* iget-wide v2, p0, Lcom/nobleempire/GunDisassembly2/BillingService$BillingRequest;->mRequestId:J */
	 java.lang.Long .valueOf ( v2,v3 );
	 (( java.util.HashMap ) v1 ).put ( v2, p0 ); // invoke-virtual {v1, v2, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
	 /* :try_end_0 */
	 /* .catch Landroid/os/RemoteException; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* .line 73 */
} // :cond_0
int v1 = 1; // const/4 v1, 0x1
/* .line 78 */
} // :goto_0
/* .line 74 */
/* :catch_0 */
/* move-exception v0 */
/* .line 75 */
/* .local v0, "e":Landroid/os/RemoteException; */
(( com.nobleempire.GunDisassembly2.BillingService$BillingRequest ) p0 ).onRemoteException ( v0 ); // invoke-virtual {p0, v0}, Lcom/nobleempire/GunDisassembly2/BillingService$BillingRequest;->onRemoteException(Landroid/os/RemoteException;)V
/* .line 78 */
} // .end local v0 # "e":Landroid/os/RemoteException;
} // :cond_1
int v1 = 0; // const/4 v1, 0x0
} // .end method
public Boolean runRequest ( ) {
/* .locals 2 */
/* .prologue */
int v0 = 1; // const/4 v0, 0x1
/* .line 56 */
v1 = (( com.nobleempire.GunDisassembly2.BillingService$BillingRequest ) p0 ).runIfConnected ( ); // invoke-virtual {p0}, Lcom/nobleempire/GunDisassembly2/BillingService$BillingRequest;->runIfConnected()Z
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 61 */
} // :goto_0
/* .line 57 */
} // :cond_0
v1 = this.this$0;
v1 = com.nobleempire.GunDisassembly2.BillingService .access$0 ( v1 );
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 58 */
com.nobleempire.GunDisassembly2.BillingService .access$1 ( );
(( java.util.LinkedList ) v1 ).add ( p0 ); // invoke-virtual {v1, p0}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z
/* .line 61 */
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // .end method
