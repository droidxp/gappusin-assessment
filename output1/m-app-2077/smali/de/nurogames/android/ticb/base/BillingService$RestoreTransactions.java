class de.nurogames.android.ticb.base.BillingService$RestoreTransactions extends de.nurogames.android.ticb.base.BillingService$BillingRequest {
	 /* .source "BillingService.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lde/nurogames/android/ticb/base/BillingService; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = "RestoreTransactions" */
} // .end annotation
/* # instance fields */
Long mNonce;
final de.nurogames.android.ticb.base.BillingService this$0; //synthetic
/* # direct methods */
public de.nurogames.android.ticb.base.BillingService$RestoreTransactions ( ) {
/* .locals 1 */
/* .prologue */
/* .line 372 */
this.this$0 = p1;
/* .line 376 */
int v0 = -1; // const/4 v0, -0x1
/* invoke-direct {p0, p1, v0}, Lde/nurogames/android/ticb/base/BillingService$BillingRequest;-><init>(Lde/nurogames/android/ticb/base/BillingService;I)V */
/* .line 377 */
return;
} // .end method
/* # virtual methods */
protected void onRemoteException ( android.os.RemoteException p0 ) {
/* .locals 2 */
/* .param p1, "e" # Landroid/os/RemoteException; */
/* .prologue */
/* .line 393 */
/* invoke-super {p0, p1}, Lde/nurogames/android/ticb/base/BillingService$BillingRequest;->onRemoteException(Landroid/os/RemoteException;)V */
/* .line 394 */
/* iget-wide v0, p0, Lde/nurogames/android/ticb/base/BillingService$RestoreTransactions;->mNonce:J */
de.nurogames.android.ticb.base.Security .removeNonce ( v0,v1 );
/* .line 395 */
return;
} // .end method
protected void responseCodeReceived ( de.nurogames.android.ticb.base.Consts$ResponseCode p0 ) {
/* .locals 1 */
/* .param p1, "responseCode" # Lde/nurogames/android/ticb/base/Consts$ResponseCode; */
/* .prologue */
/* .line 399 */
v0 = this.this$0;
de.nurogames.android.ticb.base.ResponseHandler .responseCodeReceived ( v0,p0,p1 );
/* .line 400 */
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
/* .line 381 */
de.nurogames.android.ticb.base.Security .generateNonce ( );
/* move-result-wide v2 */
/* iput-wide v2, p0, Lde/nurogames/android/ticb/base/BillingService$RestoreTransactions;->mNonce:J */
/* .line 383 */
final String v2 = "RESTORE_TRANSACTIONS"; // const-string v2, "RESTORE_TRANSACTIONS"
(( de.nurogames.android.ticb.base.BillingService$RestoreTransactions ) p0 ).makeRequestBundle ( v2 ); // invoke-virtual {p0, v2}, Lde/nurogames/android/ticb/base/BillingService$RestoreTransactions;->makeRequestBundle(Ljava/lang/String;)Landroid/os/Bundle;
/* .line 384 */
/* .local v0, "request":Landroid/os/Bundle; */
final String v2 = "NONCE"; // const-string v2, "NONCE"
/* iget-wide v3, p0, Lde/nurogames/android/ticb/base/BillingService$RestoreTransactions;->mNonce:J */
(( android.os.Bundle ) v0 ).putLong ( v2, v3, v4 ); // invoke-virtual {v0, v2, v3, v4}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V
/* .line 385 */
de.nurogames.android.ticb.base.BillingService .access$2 ( );
/* .line 386 */
/* .local v1, "response":Landroid/os/Bundle; */
final String v2 = "restoreTransactions"; // const-string v2, "restoreTransactions"
(( de.nurogames.android.ticb.base.BillingService$RestoreTransactions ) p0 ).logResponseCode ( v2, v1 ); // invoke-virtual {p0, v2, v1}, Lde/nurogames/android/ticb/base/BillingService$RestoreTransactions;->logResponseCode(Ljava/lang/String;Landroid/os/Bundle;)V
/* .line 387 */
final String v2 = "REQUEST_ID"; // const-string v2, "REQUEST_ID"
/* .line 388 */
/* sget-wide v3, Lde/nurogames/android/ticb/base/Consts;->BILLING_RESPONSE_INVALID_REQUEST_ID:J */
/* .line 387 */
(( android.os.Bundle ) v1 ).getLong ( v2, v3, v4 ); // invoke-virtual {v1, v2, v3, v4}, Landroid/os/Bundle;->getLong(Ljava/lang/String;J)J
/* move-result-wide v2 */
/* return-wide v2 */
} // .end method
