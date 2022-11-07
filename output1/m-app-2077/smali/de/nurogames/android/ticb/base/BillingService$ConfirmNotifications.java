class de.nurogames.android.ticb.base.BillingService$ConfirmNotifications extends de.nurogames.android.ticb.base.BillingService$BillingRequest {
	 /* .source "BillingService.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lde/nurogames/android/ticb/base/BillingService; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = "ConfirmNotifications" */
} // .end annotation
/* # instance fields */
final java.lang.String mNotifyIds;
final de.nurogames.android.ticb.base.BillingService this$0; //synthetic
/* # direct methods */
public de.nurogames.android.ticb.base.BillingService$ConfirmNotifications ( ) {
/* .locals 0 */
/* .param p2, "startId" # I */
/* .param p3, "notifyIds" # [Ljava/lang/String; */
/* .prologue */
/* .line 318 */
this.this$0 = p1;
/* .line 319 */
/* invoke-direct {p0, p1, p2}, Lde/nurogames/android/ticb/base/BillingService$BillingRequest;-><init>(Lde/nurogames/android/ticb/base/BillingService;I)V */
/* .line 320 */
this.mNotifyIds = p3;
/* .line 321 */
return;
} // .end method
/* # virtual methods */
protected Long run ( ) {
/* .locals 5 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Landroid/os/RemoteException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 325 */
final String v2 = "CONFIRM_NOTIFICATIONS"; // const-string v2, "CONFIRM_NOTIFICATIONS"
(( de.nurogames.android.ticb.base.BillingService$ConfirmNotifications ) p0 ).makeRequestBundle ( v2 ); // invoke-virtual {p0, v2}, Lde/nurogames/android/ticb/base/BillingService$ConfirmNotifications;->makeRequestBundle(Ljava/lang/String;)Landroid/os/Bundle;
/* .line 326 */
/* .local v0, "request":Landroid/os/Bundle; */
final String v2 = "NOTIFY_IDS"; // const-string v2, "NOTIFY_IDS"
v3 = this.mNotifyIds;
(( android.os.Bundle ) v0 ).putStringArray ( v2, v3 ); // invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->putStringArray(Ljava/lang/String;[Ljava/lang/String;)V
/* .line 327 */
de.nurogames.android.ticb.base.BillingService .access$2 ( );
/* .line 328 */
/* .local v1, "response":Landroid/os/Bundle; */
final String v2 = "confirmNotifications"; // const-string v2, "confirmNotifications"
(( de.nurogames.android.ticb.base.BillingService$ConfirmNotifications ) p0 ).logResponseCode ( v2, v1 ); // invoke-virtual {p0, v2, v1}, Lde/nurogames/android/ticb/base/BillingService$ConfirmNotifications;->logResponseCode(Ljava/lang/String;Landroid/os/Bundle;)V
/* .line 329 */
final String v2 = "REQUEST_ID"; // const-string v2, "REQUEST_ID"
/* .line 330 */
/* sget-wide v3, Lde/nurogames/android/ticb/base/Consts;->BILLING_RESPONSE_INVALID_REQUEST_ID:J */
/* .line 329 */
(( android.os.Bundle ) v1 ).getLong ( v2, v3, v4 ); // invoke-virtual {v1, v2, v3, v4}, Landroid/os/Bundle;->getLong(Ljava/lang/String;J)J
/* move-result-wide v2 */
/* return-wide v2 */
} // .end method
