class de.nurogames.android.ticb.base.BillingService$GetPurchaseInformation extends de.nurogames.android.ticb.base.BillingService$BillingRequest {
	 /* .source "BillingService.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lde/nurogames/android/ticb/base/BillingService; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = "GetPurchaseInformation" */
} // .end annotation
/* # instance fields */
Long mNonce;
final java.lang.String mNotifyIds;
final de.nurogames.android.ticb.base.BillingService this$0; //synthetic
/* # direct methods */
public de.nurogames.android.ticb.base.BillingService$GetPurchaseInformation ( ) {
/* .locals 0 */
/* .param p2, "startId" # I */
/* .param p3, "notifyIds" # [Ljava/lang/String; */
/* .prologue */
/* .line 341 */
this.this$0 = p1;
/* .line 342 */
/* invoke-direct {p0, p1, p2}, Lde/nurogames/android/ticb/base/BillingService$BillingRequest;-><init>(Lde/nurogames/android/ticb/base/BillingService;I)V */
/* .line 343 */
this.mNotifyIds = p3;
/* .line 344 */
return;
} // .end method
/* # virtual methods */
protected void onRemoteException ( android.os.RemoteException p0 ) {
/* .locals 2 */
/* .param p1, "e" # Landroid/os/RemoteException; */
/* .prologue */
/* .line 361 */
/* invoke-super {p0, p1}, Lde/nurogames/android/ticb/base/BillingService$BillingRequest;->onRemoteException(Landroid/os/RemoteException;)V */
/* .line 362 */
/* iget-wide v0, p0, Lde/nurogames/android/ticb/base/BillingService$GetPurchaseInformation;->mNonce:J */
de.nurogames.android.ticb.base.Security .removeNonce ( v0,v1 );
/* .line 363 */
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
/* .line 348 */
de.nurogames.android.ticb.base.Security .generateNonce ( );
/* move-result-wide v2 */
/* iput-wide v2, p0, Lde/nurogames/android/ticb/base/BillingService$GetPurchaseInformation;->mNonce:J */
/* .line 350 */
final String v2 = "GET_PURCHASE_INFORMATION"; // const-string v2, "GET_PURCHASE_INFORMATION"
(( de.nurogames.android.ticb.base.BillingService$GetPurchaseInformation ) p0 ).makeRequestBundle ( v2 ); // invoke-virtual {p0, v2}, Lde/nurogames/android/ticb/base/BillingService$GetPurchaseInformation;->makeRequestBundle(Ljava/lang/String;)Landroid/os/Bundle;
/* .line 351 */
/* .local v0, "request":Landroid/os/Bundle; */
final String v2 = "NONCE"; // const-string v2, "NONCE"
/* iget-wide v3, p0, Lde/nurogames/android/ticb/base/BillingService$GetPurchaseInformation;->mNonce:J */
(( android.os.Bundle ) v0 ).putLong ( v2, v3, v4 ); // invoke-virtual {v0, v2, v3, v4}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V
/* .line 352 */
final String v2 = "NOTIFY_IDS"; // const-string v2, "NOTIFY_IDS"
v3 = this.mNotifyIds;
(( android.os.Bundle ) v0 ).putStringArray ( v2, v3 ); // invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->putStringArray(Ljava/lang/String;[Ljava/lang/String;)V
/* .line 353 */
de.nurogames.android.ticb.base.BillingService .access$2 ( );
/* .line 354 */
/* .local v1, "response":Landroid/os/Bundle; */
final String v2 = "getPurchaseInformation"; // const-string v2, "getPurchaseInformation"
(( de.nurogames.android.ticb.base.BillingService$GetPurchaseInformation ) p0 ).logResponseCode ( v2, v1 ); // invoke-virtual {p0, v2, v1}, Lde/nurogames/android/ticb/base/BillingService$GetPurchaseInformation;->logResponseCode(Ljava/lang/String;Landroid/os/Bundle;)V
/* .line 355 */
final String v2 = "REQUEST_ID"; // const-string v2, "REQUEST_ID"
/* .line 356 */
/* sget-wide v3, Lde/nurogames/android/ticb/base/Consts;->BILLING_RESPONSE_INVALID_REQUEST_ID:J */
/* .line 355 */
(( android.os.Bundle ) v1 ).getLong ( v2, v3, v4 ); // invoke-virtual {v1, v2, v3, v4}, Landroid/os/Bundle;->getLong(Ljava/lang/String;J)J
/* move-result-wide v2 */
/* return-wide v2 */
} // .end method
