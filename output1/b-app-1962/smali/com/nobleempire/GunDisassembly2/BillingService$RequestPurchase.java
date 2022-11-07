class com.nobleempire.GunDisassembly2.BillingService$RequestPurchase extends com.nobleempire.GunDisassembly2.BillingService$BillingRequest {
	 /* .source "BillingService.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/nobleempire/GunDisassembly2/BillingService; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = "RequestPurchase" */
} // .end annotation
/* # instance fields */
public final java.lang.String mDeveloperPayload;
public final java.lang.String mProductId;
final com.nobleempire.GunDisassembly2.BillingService this$0; //synthetic
/* # direct methods */
public com.nobleempire.GunDisassembly2.BillingService$RequestPurchase ( ) {
/* .locals 1 */
/* .param p2, "itemId" # Ljava/lang/String; */
/* .prologue */
/* .line 132 */
int v0 = 0; // const/4 v0, 0x0
/* invoke-direct {p0, p1, p2, v0}, Lcom/nobleempire/GunDisassembly2/BillingService$RequestPurchase;-><init>(Lcom/nobleempire/GunDisassembly2/BillingService;Ljava/lang/String;Ljava/lang/String;)V */
/* .line 134 */
return;
} // .end method
public com.nobleempire.GunDisassembly2.BillingService$RequestPurchase ( ) {
/* .locals 1 */
/* .param p2, "itemId" # Ljava/lang/String; */
/* .param p3, "developerPayload" # Ljava/lang/String; */
/* .prologue */
/* .line 135 */
this.this$0 = p1;
/* .line 137 */
int v0 = -1; // const/4 v0, -0x1
/* invoke-direct {p0, p1, v0}, Lcom/nobleempire/GunDisassembly2/BillingService$BillingRequest;-><init>(Lcom/nobleempire/GunDisassembly2/BillingService;I)V */
/* .line 139 */
this.mProductId = p2;
/* .line 140 */
this.mDeveloperPayload = p3;
/* .line 141 */
return;
} // .end method
/* # virtual methods */
protected void responseCodeReceived ( com.nobleempire.GunDisassembly2.Consts$ResponseCode p0 ) {
/* .locals 1 */
/* .param p1, "responseCode" # Lcom/nobleempire/GunDisassembly2/Consts$ResponseCode; */
/* .prologue */
/* .line 164 */
v0 = this.this$0;
com.nobleempire.GunDisassembly2.ResponseHandler .responseCodeReceived ( v0,p0,p1 );
/* .line 165 */
return;
} // .end method
protected Long run ( ) {
/* .locals 7 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Landroid/os/RemoteException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 145 */
final String v4 = "REQUEST_PURCHASE"; // const-string v4, "REQUEST_PURCHASE"
(( com.nobleempire.GunDisassembly2.BillingService$RequestPurchase ) p0 ).makeRequestBundle ( v4 ); // invoke-virtual {p0, v4}, Lcom/nobleempire/GunDisassembly2/BillingService$RequestPurchase;->makeRequestBundle(Ljava/lang/String;)Landroid/os/Bundle;
/* .line 146 */
/* .local v2, "request":Landroid/os/Bundle; */
final String v4 = "ITEM_ID"; // const-string v4, "ITEM_ID"
v5 = this.mProductId;
(( android.os.Bundle ) v2 ).putString ( v4, v5 ); // invoke-virtual {v2, v4, v5}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
/* .line 148 */
v4 = this.mDeveloperPayload;
if ( v4 != null) { // if-eqz v4, :cond_0
/* .line 149 */
final String v4 = "DEVELOPER_PAYLOAD"; // const-string v4, "DEVELOPER_PAYLOAD"
v5 = this.mDeveloperPayload;
(( android.os.Bundle ) v2 ).putString ( v4, v5 ); // invoke-virtual {v2, v4, v5}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
/* .line 151 */
} // :cond_0
com.nobleempire.GunDisassembly2.BillingService .access$2 ( );
/* .line 152 */
/* .local v3, "response":Landroid/os/Bundle; */
final String v4 = "PURCHASE_INTENT"; // const-string v4, "PURCHASE_INTENT"
(( android.os.Bundle ) v3 ).getParcelable ( v4 ); // invoke-virtual {v3, v4}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;
/* check-cast v1, Landroid/app/PendingIntent; */
/* .line 153 */
/* .local v1, "pendingIntent":Landroid/app/PendingIntent; */
/* if-nez v1, :cond_1 */
/* .line 155 */
/* sget-wide v4, Lcom/nobleempire/GunDisassembly2/Consts;->BILLING_RESPONSE_INVALID_REQUEST_ID:J */
/* .line 159 */
} // :goto_0
/* return-wide v4 */
/* .line 157 */
} // :cond_1
/* new-instance v0, Landroid/content/Intent; */
/* invoke-direct {v0}, Landroid/content/Intent;-><init>()V */
/* .line 158 */
/* .local v0, "intent":Landroid/content/Intent; */
com.nobleempire.GunDisassembly2.ResponseHandler .buyPageIntentResponse ( v1,v0 );
/* .line 159 */
final String v4 = "REQUEST_ID"; // const-string v4, "REQUEST_ID"
/* sget-wide v5, Lcom/nobleempire/GunDisassembly2/Consts;->BILLING_RESPONSE_INVALID_REQUEST_ID:J */
(( android.os.Bundle ) v3 ).getLong ( v4, v5, v6 ); // invoke-virtual {v3, v4, v5, v6}, Landroid/os/Bundle;->getLong(Ljava/lang/String;J)J
/* move-result-wide v4 */
} // .end method
