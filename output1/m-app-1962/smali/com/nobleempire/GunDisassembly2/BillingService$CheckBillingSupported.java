class com.nobleempire.GunDisassembly2.BillingService$CheckBillingSupported extends com.nobleempire.GunDisassembly2.BillingService$BillingRequest {
	 /* .source "BillingService.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/nobleempire/GunDisassembly2/BillingService; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = "CheckBillingSupported" */
} // .end annotation
/* # instance fields */
final com.nobleempire.GunDisassembly2.BillingService this$0; //synthetic
/* # direct methods */
public com.nobleempire.GunDisassembly2.BillingService$CheckBillingSupported ( ) {
/* .locals 1 */
/* .prologue */
/* .line 111 */
this.this$0 = p1;
/* .line 112 */
int v0 = -1; // const/4 v0, -0x1
/* invoke-direct {p0, p1, v0}, Lcom/nobleempire/GunDisassembly2/BillingService$BillingRequest;-><init>(Lcom/nobleempire/GunDisassembly2/BillingService;I)V */
/* .line 113 */
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
/* .line 117 */
final String v4 = "CHECK_BILLING_SUPPORTED"; // const-string v4, "CHECK_BILLING_SUPPORTED"
(( com.nobleempire.GunDisassembly2.BillingService$CheckBillingSupported ) p0 ).makeRequestBundle ( v4 ); // invoke-virtual {p0, v4}, Lcom/nobleempire/GunDisassembly2/BillingService$CheckBillingSupported;->makeRequestBundle(Ljava/lang/String;)Landroid/os/Bundle;
/* .line 118 */
/* .local v1, "request":Landroid/os/Bundle; */
com.nobleempire.GunDisassembly2.BillingService .access$2 ( );
/* .line 119 */
/* .local v2, "response":Landroid/os/Bundle; */
final String v4 = "RESPONSE_CODE"; // const-string v4, "RESPONSE_CODE"
v3 = (( android.os.Bundle ) v2 ).getInt ( v4 ); // invoke-virtual {v2, v4}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I
/* .line 121 */
/* .local v3, "responseCode":I */
v4 = com.nobleempire.GunDisassembly2.Consts$ResponseCode.RESULT_OK;
v4 = (( com.nobleempire.GunDisassembly2.Consts$ResponseCode ) v4 ).ordinal ( ); // invoke-virtual {v4}, Lcom/nobleempire/GunDisassembly2/Consts$ResponseCode;->ordinal()I
/* if-ne v3, v4, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
/* .line 122 */
/* .local v0, "billingSupported":Z */
} // :goto_0
com.nobleempire.GunDisassembly2.ResponseHandler .checkBillingSupportedResponse ( v0 );
/* .line 123 */
/* sget-wide v4, Lcom/nobleempire/GunDisassembly2/Consts;->BILLING_RESPONSE_INVALID_REQUEST_ID:J */
/* return-wide v4 */
/* .line 121 */
} // .end local v0 # "billingSupported":Z
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
