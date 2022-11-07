public class com.ansca.corona.purchasing.GoogleStorePurchaseRequest extends com.ansca.corona.purchasing.GoogleStoreRequest {
	 /* .source "GoogleStorePurchaseRequest.java" */
	 /* # instance fields */
	 private java.lang.String fProductName;
	 /* # direct methods */
	 public com.ansca.corona.purchasing.GoogleStorePurchaseRequest ( ) {
		 /* .locals 1 */
		 /* .param p1, "productName" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 17 */
		 /* invoke-direct {p0}, Lcom/ansca/corona/purchasing/GoogleStoreRequest;-><init>()V */
		 /* .line 20 */
		 if ( p1 != null) { // if-eqz p1, :cond_0
			 v0 = 			 (( java.lang.String ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/String;->length()I
			 /* if-gtz v0, :cond_1 */
			 /* .line 21 */
		 } // :cond_0
		 /* new-instance v0, Ljava/lang/NullPointerException; */
		 /* invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V */
		 /* throw v0 */
		 /* .line 25 */
	 } // :cond_1
	 this.fProductName = p1;
	 /* .line 26 */
	 return;
} // .end method
/* # virtual methods */
public java.lang.String getProductName ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 33 */
	 v0 = this.fProductName;
} // .end method
public android.os.Bundle toBundle ( ) {
	 /* .locals 3 */
	 /* .prologue */
	 /* .line 41 */
	 /* new-instance v0, Landroid/os/Bundle; */
	 /* invoke-direct {v0}, Landroid/os/Bundle;-><init>()V */
	 /* .line 42 */
	 /* .local v0, "bundle":Landroid/os/Bundle; */
	 final String v1 = "BILLING_REQUEST"; // const-string v1, "BILLING_REQUEST"
	 final String v2 = "REQUEST_PURCHASE"; // const-string v2, "REQUEST_PURCHASE"
	 (( android.os.Bundle ) v0 ).putString ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
	 /* .line 43 */
	 final String v1 = "ITEM_ID"; // const-string v1, "ITEM_ID"
	 v2 = this.fProductName;
	 (( android.os.Bundle ) v0 ).putString ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
	 /* .line 44 */
} // .end method
