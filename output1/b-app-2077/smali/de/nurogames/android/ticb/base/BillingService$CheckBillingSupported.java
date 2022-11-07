class de.nurogames.android.ticb.base.BillingService$CheckBillingSupported extends de.nurogames.android.ticb.base.BillingService$BillingRequest {
	 /* .source "BillingService.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lde/nurogames/android/ticb/base/BillingService; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = "CheckBillingSupported" */
} // .end annotation
/* # instance fields */
public java.lang.String mProductType;
final de.nurogames.android.ticb.base.BillingService this$0; //synthetic
/* # direct methods */
public de.nurogames.android.ticb.base.BillingService$CheckBillingSupported ( ) {
/* .locals 1 */
/* .annotation runtime Ljava/lang/Deprecated; */
} // .end annotation
/* .prologue */
/* .line 195 */
this.this$0 = p1;
/* .line 199 */
int v0 = -1; // const/4 v0, -0x1
/* invoke-direct {p0, p1, v0}, Lde/nurogames/android/ticb/base/BillingService$BillingRequest;-><init>(Lde/nurogames/android/ticb/base/BillingService;I)V */
/* .line 187 */
int v0 = 0; // const/4 v0, 0x0
this.mProductType = v0;
/* .line 200 */
return;
} // .end method
public de.nurogames.android.ticb.base.BillingService$CheckBillingSupported ( ) {
/* .locals 1 */
/* .param p2, "itemType" # Ljava/lang/String; */
/* .prologue */
/* .line 213 */
this.this$0 = p1;
/* .line 214 */
int v0 = -1; // const/4 v0, -0x1
/* invoke-direct {p0, p1, v0}, Lde/nurogames/android/ticb/base/BillingService$BillingRequest;-><init>(Lde/nurogames/android/ticb/base/BillingService;I)V */
/* .line 187 */
int v0 = 0; // const/4 v0, 0x0
this.mProductType = v0;
/* .line 215 */
this.mProductType = p2;
/* .line 216 */
return;
} // .end method
/* # virtual methods */
protected Long run ( ) {
/* .locals 6 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Landroid/os/RemoteException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 220 */
final String v4 = "CHECK_BILLING_SUPPORTED"; // const-string v4, "CHECK_BILLING_SUPPORTED"
(( de.nurogames.android.ticb.base.BillingService$CheckBillingSupported ) p0 ).makeRequestBundle ( v4 ); // invoke-virtual {p0, v4}, Lde/nurogames/android/ticb/base/BillingService$CheckBillingSupported;->makeRequestBundle(Ljava/lang/String;)Landroid/os/Bundle;
/* .line 221 */
/* .local v1, "request":Landroid/os/Bundle; */
v4 = this.mProductType;
if ( v4 != null) { // if-eqz v4, :cond_0
/* .line 222 */
final String v4 = "ITEM_TYPE"; // const-string v4, "ITEM_TYPE"
v5 = this.mProductType;
(( android.os.Bundle ) v1 ).putString ( v4, v5 ); // invoke-virtual {v1, v4, v5}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
/* .line 224 */
} // :cond_0
de.nurogames.android.ticb.base.BillingService .access$2 ( );
/* .line 225 */
/* .local v2, "response":Landroid/os/Bundle; */
final String v4 = "RESPONSE_CODE"; // const-string v4, "RESPONSE_CODE"
v3 = (( android.os.Bundle ) v2 ).getInt ( v4 ); // invoke-virtual {v2, v4}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I
/* .line 230 */
/* .local v3, "responseCode":I */
v4 = de.nurogames.android.ticb.base.Consts$ResponseCode.RESULT_OK;
v4 = (( de.nurogames.android.ticb.base.Consts$ResponseCode ) v4 ).ordinal ( ); // invoke-virtual {v4}, Lde/nurogames/android/ticb/base/Consts$ResponseCode;->ordinal()I
/* if-ne v3, v4, :cond_1 */
int v0 = 1; // const/4 v0, 0x1
/* .line 231 */
/* .local v0, "billingSupported":Z */
} // :goto_0
v4 = this.mProductType;
de.nurogames.android.ticb.base.ResponseHandler .checkBillingSupportedResponse ( v0,v4 );
/* .line 232 */
/* sget-wide v4, Lde/nurogames/android/ticb/base/Consts;->BILLING_RESPONSE_INVALID_REQUEST_ID:J */
/* return-wide v4 */
/* .line 230 */
} // .end local v0 # "billingSupported":Z
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // .end method
