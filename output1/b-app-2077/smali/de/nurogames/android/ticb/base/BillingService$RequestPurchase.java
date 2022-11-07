class de.nurogames.android.ticb.base.BillingService$RequestPurchase extends de.nurogames.android.ticb.base.BillingService$BillingRequest {
	 /* .source "BillingService.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lde/nurogames/android/ticb/base/BillingService; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = "RequestPurchase" */
} // .end annotation
/* # instance fields */
public final java.lang.String mDeveloperPayload;
public final java.lang.String mProductId;
public final java.lang.String mProductType;
final de.nurogames.android.ticb.base.BillingService this$0; //synthetic
/* # direct methods */
public de.nurogames.android.ticb.base.BillingService$RequestPurchase ( ) {
/* .locals 1 */
/* .param p2, "itemId" # Ljava/lang/String; */
/* .annotation runtime Ljava/lang/Deprecated; */
} // .end annotation
/* .prologue */
int v0 = 0; // const/4 v0, 0x0
/* .line 251 */
/* invoke-direct {p0, p1, p2, v0, v0}, Lde/nurogames/android/ticb/base/BillingService$RequestPurchase;-><init>(Lde/nurogames/android/ticb/base/BillingService;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V */
/* .line 252 */
return;
} // .end method
public de.nurogames.android.ticb.base.BillingService$RequestPurchase ( ) {
/* .locals 1 */
/* .param p2, "itemId" # Ljava/lang/String; */
/* .param p3, "developerPayload" # Ljava/lang/String; */
/* .annotation runtime Ljava/lang/Deprecated; */
} // .end annotation
/* .prologue */
/* .line 262 */
int v0 = 0; // const/4 v0, 0x0
/* invoke-direct {p0, p1, p2, v0, p3}, Lde/nurogames/android/ticb/base/BillingService$RequestPurchase;-><init>(Lde/nurogames/android/ticb/base/BillingService;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V */
/* .line 263 */
return;
} // .end method
public de.nurogames.android.ticb.base.BillingService$RequestPurchase ( ) {
/* .locals 1 */
/* .param p2, "itemId" # Ljava/lang/String; */
/* .param p3, "itemType" # Ljava/lang/String; */
/* .param p4, "developerPayload" # Ljava/lang/String; */
/* .prologue */
/* .line 273 */
this.this$0 = p1;
/* .line 277 */
int v0 = -1; // const/4 v0, -0x1
/* invoke-direct {p0, p1, v0}, Lde/nurogames/android/ticb/base/BillingService$BillingRequest;-><init>(Lde/nurogames/android/ticb/base/BillingService;I)V */
/* .line 278 */
this.mProductId = p2;
/* .line 279 */
this.mDeveloperPayload = p4;
/* .line 280 */
this.mProductType = p3;
/* .line 281 */
return;
} // .end method
/* # virtual methods */
protected void responseCodeReceived ( de.nurogames.android.ticb.base.Consts$ResponseCode p0 ) {
/* .locals 1 */
/* .param p1, "responseCode" # Lde/nurogames/android/ticb/base/Consts$ResponseCode; */
/* .prologue */
/* .line 308 */
v0 = this.this$0;
de.nurogames.android.ticb.base.ResponseHandler .responseCodeReceived ( v0,p0,p1 );
/* .line 309 */
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
/* .line 285 */
final String v4 = "REQUEST_PURCHASE"; // const-string v4, "REQUEST_PURCHASE"
(( de.nurogames.android.ticb.base.BillingService$RequestPurchase ) p0 ).makeRequestBundle ( v4 ); // invoke-virtual {p0, v4}, Lde/nurogames/android/ticb/base/BillingService$RequestPurchase;->makeRequestBundle(Ljava/lang/String;)Landroid/os/Bundle;
/* .line 286 */
/* .local v2, "request":Landroid/os/Bundle; */
final String v4 = "ITEM_ID"; // const-string v4, "ITEM_ID"
v5 = this.mProductId;
(( android.os.Bundle ) v2 ).putString ( v4, v5 ); // invoke-virtual {v2, v4, v5}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
/* .line 287 */
final String v4 = "ITEM_TYPE"; // const-string v4, "ITEM_TYPE"
v5 = this.mProductType;
(( android.os.Bundle ) v2 ).putString ( v4, v5 ); // invoke-virtual {v2, v4, v5}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
/* .line 289 */
v4 = this.mDeveloperPayload;
if ( v4 != null) { // if-eqz v4, :cond_0
/* .line 290 */
final String v4 = "DEVELOPER_PAYLOAD"; // const-string v4, "DEVELOPER_PAYLOAD"
v5 = this.mDeveloperPayload;
(( android.os.Bundle ) v2 ).putString ( v4, v5 ); // invoke-virtual {v2, v4, v5}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
/* .line 292 */
} // :cond_0
de.nurogames.android.ticb.base.BillingService .access$2 ( );
/* .line 294 */
/* .local v3, "response":Landroid/os/Bundle; */
final String v4 = "PURCHASE_INTENT"; // const-string v4, "PURCHASE_INTENT"
(( android.os.Bundle ) v3 ).getParcelable ( v4 ); // invoke-virtual {v3, v4}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;
/* check-cast v1, Landroid/app/PendingIntent; */
/* .line 295 */
/* .local v1, "pendingIntent":Landroid/app/PendingIntent; */
/* if-nez v1, :cond_1 */
/* .line 296 */
final String v4 = "BillingService"; // const-string v4, "BillingService"
final String v5 = "Error with requestPurchase"; // const-string v5, "Error with requestPurchase"
android.util.Log .e ( v4,v5 );
/* .line 297 */
/* sget-wide v4, Lde/nurogames/android/ticb/base/Consts;->BILLING_RESPONSE_INVALID_REQUEST_ID:J */
/* .line 302 */
} // :goto_0
/* return-wide v4 */
/* .line 300 */
} // :cond_1
/* new-instance v0, Landroid/content/Intent; */
/* invoke-direct {v0}, Landroid/content/Intent;-><init>()V */
/* .line 301 */
/* .local v0, "intent":Landroid/content/Intent; */
de.nurogames.android.ticb.base.ResponseHandler .buyPageIntentResponse ( v1,v0 );
/* .line 302 */
final String v4 = "REQUEST_ID"; // const-string v4, "REQUEST_ID"
/* .line 303 */
/* sget-wide v5, Lde/nurogames/android/ticb/base/Consts;->BILLING_RESPONSE_INVALID_REQUEST_ID:J */
/* .line 302 */
(( android.os.Bundle ) v3 ).getLong ( v4, v5, v6 ); // invoke-virtual {v3, v4, v5, v6}, Landroid/os/Bundle;->getLong(Ljava/lang/String;J)J
/* move-result-wide v4 */
} // .end method
