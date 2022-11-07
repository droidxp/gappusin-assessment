public class com.ansca.corona.purchasing.GoogleStoreRestoreRequest extends com.ansca.corona.purchasing.GoogleStoreRequest {
	 /* .source "GoogleStoreRestoreRequest.java" */
	 /* # instance fields */
	 private Long fNonce;
	 /* # direct methods */
	 public com.ansca.corona.purchasing.GoogleStoreRestoreRequest ( ) {
		 /* .locals 0 */
		 /* .param p1, "nonce" # J */
		 /* .prologue */
		 /* .line 19 */
		 /* invoke-direct {p0}, Lcom/ansca/corona/purchasing/GoogleStoreRequest;-><init>()V */
		 /* .line 21 */
		 /* iput-wide p1, p0, Lcom/ansca/corona/purchasing/GoogleStoreRestoreRequest;->fNonce:J */
		 /* .line 22 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Long getNonce ( ) {
		 /* .locals 2 */
		 /* .prologue */
		 /* .line 29 */
		 /* iget-wide v0, p0, Lcom/ansca/corona/purchasing/GoogleStoreRestoreRequest;->fNonce:J */
		 /* return-wide v0 */
	 } // .end method
	 public android.os.Bundle toBundle ( ) {
		 /* .locals 4 */
		 /* .prologue */
		 /* .line 37 */
		 /* new-instance v0, Landroid/os/Bundle; */
		 /* invoke-direct {v0}, Landroid/os/Bundle;-><init>()V */
		 /* .line 38 */
		 /* .local v0, "bundle":Landroid/os/Bundle; */
		 final String v1 = "BILLING_REQUEST"; // const-string v1, "BILLING_REQUEST"
		 final String v2 = "RESTORE_TRANSACTIONS"; // const-string v2, "RESTORE_TRANSACTIONS"
		 (( android.os.Bundle ) v0 ).putString ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
		 /* .line 39 */
		 final String v1 = "NONCE"; // const-string v1, "NONCE"
		 /* iget-wide v2, p0, Lcom/ansca/corona/purchasing/GoogleStoreRestoreRequest;->fNonce:J */
		 (( android.os.Bundle ) v0 ).putLong ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V
		 /* .line 40 */
	 } // .end method
