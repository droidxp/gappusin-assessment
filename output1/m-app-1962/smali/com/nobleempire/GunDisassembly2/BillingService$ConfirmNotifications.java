class com.nobleempire.GunDisassembly2.BillingService$ConfirmNotifications extends com.nobleempire.GunDisassembly2.BillingService$BillingRequest {
	 /* .source "BillingService.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/nobleempire/GunDisassembly2/BillingService; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = "ConfirmNotifications" */
} // .end annotation
/* # instance fields */
final java.lang.String mNotifyIds;
final com.nobleempire.GunDisassembly2.BillingService this$0; //synthetic
/* # direct methods */
public com.nobleempire.GunDisassembly2.BillingService$ConfirmNotifications ( ) {
/* .locals 0 */
/* .param p2, "startId" # I */
/* .param p3, "notifyIds" # [Ljava/lang/String; */
/* .prologue */
/* .line 171 */
this.this$0 = p1;
/* .line 172 */
/* invoke-direct {p0, p1, p2}, Lcom/nobleempire/GunDisassembly2/BillingService$BillingRequest;-><init>(Lcom/nobleempire/GunDisassembly2/BillingService;I)V */
/* .line 173 */
this.mNotifyIds = p3;
/* .line 174 */
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
/* .line 178 */
final String v2 = "CONFIRM_NOTIFICATIONS"; // const-string v2, "CONFIRM_NOTIFICATIONS"
(( com.nobleempire.GunDisassembly2.BillingService$ConfirmNotifications ) p0 ).makeRequestBundle ( v2 ); // invoke-virtual {p0, v2}, Lcom/nobleempire/GunDisassembly2/BillingService$ConfirmNotifications;->makeRequestBundle(Ljava/lang/String;)Landroid/os/Bundle;
/* .line 179 */
/* .local v0, "request":Landroid/os/Bundle; */
final String v2 = "NOTIFY_IDS"; // const-string v2, "NOTIFY_IDS"
v3 = this.mNotifyIds;
(( android.os.Bundle ) v0 ).putStringArray ( v2, v3 ); // invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->putStringArray(Ljava/lang/String;[Ljava/lang/String;)V
/* .line 180 */
com.nobleempire.GunDisassembly2.BillingService .access$2 ( );
/* .line 181 */
/* .local v1, "response":Landroid/os/Bundle; */
final String v2 = "~~confirmNotifications"; // const-string v2, "~~confirmNotifications"
(( com.nobleempire.GunDisassembly2.BillingService$ConfirmNotifications ) p0 ).logResponseCode ( v2, v1 ); // invoke-virtual {p0, v2, v1}, Lcom/nobleempire/GunDisassembly2/BillingService$ConfirmNotifications;->logResponseCode(Ljava/lang/String;Landroid/os/Bundle;)V
/* .line 182 */
final String v2 = "REQUEST_ID"; // const-string v2, "REQUEST_ID"
/* sget-wide v3, Lcom/nobleempire/GunDisassembly2/Consts;->BILLING_RESPONSE_INVALID_REQUEST_ID:J */
(( android.os.Bundle ) v1 ).getLong ( v2, v3, v4 ); // invoke-virtual {v1, v2, v3, v4}, Landroid/os/Bundle;->getLong(Ljava/lang/String;J)J
/* move-result-wide v2 */
/* return-wide v2 */
} // .end method
