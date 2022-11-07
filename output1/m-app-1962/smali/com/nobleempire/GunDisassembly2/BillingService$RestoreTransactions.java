class com.nobleempire.GunDisassembly2.BillingService$RestoreTransactions extends com.nobleempire.GunDisassembly2.BillingService$BillingRequest {
	 /* .source "BillingService.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/nobleempire/GunDisassembly2/BillingService; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = "RestoreTransactions" */
} // .end annotation
/* # instance fields */
Long mNonce;
final com.nobleempire.GunDisassembly2.BillingService this$0; //synthetic
/* # direct methods */
public com.nobleempire.GunDisassembly2.BillingService$RestoreTransactions ( ) {
/* .locals 1 */
/* .prologue */
/* .line 215 */
this.this$0 = p1;
/* .line 219 */
int v0 = -1; // const/4 v0, -0x1
/* invoke-direct {p0, p1, v0}, Lcom/nobleempire/GunDisassembly2/BillingService$BillingRequest;-><init>(Lcom/nobleempire/GunDisassembly2/BillingService;I)V */
/* .line 220 */
return;
} // .end method
/* # virtual methods */
protected void onRemoteException ( android.os.RemoteException p0 ) {
/* .locals 2 */
/* .param p1, "e" # Landroid/os/RemoteException; */
/* .prologue */
/* .line 233 */
/* invoke-super {p0, p1}, Lcom/nobleempire/GunDisassembly2/BillingService$BillingRequest;->onRemoteException(Landroid/os/RemoteException;)V */
/* .line 234 */
/* iget-wide v0, p0, Lcom/nobleempire/GunDisassembly2/BillingService$RestoreTransactions;->mNonce:J */
com.nobleempire.GunDisassembly2.Security .removeNonce ( v0,v1 );
/* .line 235 */
return;
} // .end method
protected void responseCodeReceived ( com.nobleempire.GunDisassembly2.Consts$ResponseCode p0 ) {
/* .locals 1 */
/* .param p1, "responseCode" # Lcom/nobleempire/GunDisassembly2/Consts$ResponseCode; */
/* .prologue */
/* .line 238 */
v0 = this.this$0;
com.nobleempire.GunDisassembly2.ResponseHandler .responseCodeReceived ( v0,p0,p1 );
/* .line 239 */
return;
} // .end method
protected Long run ( ) {
/* .locals 5 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Landroid/os/RemoteException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 224 */
com.nobleempire.GunDisassembly2.Security .generateNonce ( );
/* move-result-wide v2 */
/* iput-wide v2, p0, Lcom/nobleempire/GunDisassembly2/BillingService$RestoreTransactions;->mNonce:J */
/* .line 225 */
final String v2 = "RESTORE_TRANSACTIONS"; // const-string v2, "RESTORE_TRANSACTIONS"
(( com.nobleempire.GunDisassembly2.BillingService$RestoreTransactions ) p0 ).makeRequestBundle ( v2 ); // invoke-virtual {p0, v2}, Lcom/nobleempire/GunDisassembly2/BillingService$RestoreTransactions;->makeRequestBundle(Ljava/lang/String;)Landroid/os/Bundle;
/* .line 226 */
/* .local v0, "request":Landroid/os/Bundle; */
final String v2 = "NONCE"; // const-string v2, "NONCE"
/* iget-wide v3, p0, Lcom/nobleempire/GunDisassembly2/BillingService$RestoreTransactions;->mNonce:J */
(( android.os.Bundle ) v0 ).putLong ( v2, v3, v4 ); // invoke-virtual {v0, v2, v3, v4}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V
/* .line 227 */
com.nobleempire.GunDisassembly2.BillingService .access$2 ( );
/* .line 228 */
/* .local v1, "response":Landroid/os/Bundle; */
final String v2 = "~~restoreTransactions"; // const-string v2, "~~restoreTransactions"
(( com.nobleempire.GunDisassembly2.BillingService$RestoreTransactions ) p0 ).logResponseCode ( v2, v1 ); // invoke-virtual {p0, v2, v1}, Lcom/nobleempire/GunDisassembly2/BillingService$RestoreTransactions;->logResponseCode(Ljava/lang/String;Landroid/os/Bundle;)V
/* .line 229 */
final String v2 = "REQUEST_ID"; // const-string v2, "REQUEST_ID"
/* sget-wide v3, Lcom/nobleempire/GunDisassembly2/Consts;->BILLING_RESPONSE_INVALID_REQUEST_ID:J */
(( android.os.Bundle ) v1 ).getLong ( v2, v3, v4 ); // invoke-virtual {v1, v2, v3, v4}, Landroid/os/Bundle;->getLong(Ljava/lang/String;J)J
/* move-result-wide v2 */
/* return-wide v2 */
} // .end method
