public class com.ansca.corona.purchasing.GoogleStoreFetchPendingPurchasesRequest extends com.ansca.corona.purchasing.GoogleStoreRequest {
	 /* .source "GoogleStoreFetchPendingPurchasesRequest.java" */
	 /* # instance fields */
	 private Long fNonce;
	 private java.util.Collection fNotificationStringIds;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/Collection", */
	 /* "<", */
	 /* "Ljava/lang/String;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
/* # direct methods */
public com.ansca.corona.purchasing.GoogleStoreFetchPendingPurchasesRequest ( ) {
/* .locals 1 */
/* .param p1, "nonce" # J */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(J", */
/* "Ljava/util/Collection", */
/* "<", */
/* "Ljava/lang/String;", */
/* ">;)V" */
/* } */
} // .end annotation
/* .prologue */
/* .line 24 */
/* .local p3, "notificationStringIds":Ljava/util/Collection;, "Ljava/util/Collection<Ljava/lang/String;>;" */
/* invoke-direct {p0}, Lcom/ansca/corona/purchasing/GoogleStoreRequest;-><init>()V */
/* .line 27 */
/* if-nez p3, :cond_0 */
/* .line 28 */
/* new-instance v0, Ljava/lang/NullPointerException; */
/* invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V */
/* throw v0 */
/* .line 30 */
v0 = } // :cond_0
/* if-gtz v0, :cond_1 */
/* .line 31 */
/* new-instance v0, Ljava/lang/IllegalArgumentException; */
/* invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V */
/* throw v0 */
/* .line 36 */
} // :cond_1
/* iput-wide p1, p0, Lcom/ansca/corona/purchasing/GoogleStoreFetchPendingPurchasesRequest;->fNonce:J */
/* .line 37 */
java.util.Collections .unmodifiableCollection ( p3 );
this.fNotificationStringIds = v0;
/* .line 38 */
return;
} // .end method
/* # virtual methods */
public Long getNonce ( ) {
/* .locals 2 */
/* .prologue */
/* .line 45 */
/* iget-wide v0, p0, Lcom/ansca/corona/purchasing/GoogleStoreFetchPendingPurchasesRequest;->fNonce:J */
/* return-wide v0 */
} // .end method
public java.lang.Iterable getNotificationStringIds ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/lang/Iterable", */
/* "<", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
/* .prologue */
/* .line 54 */
v0 = this.fNotificationStringIds;
} // .end method
public android.os.Bundle toBundle ( ) {
/* .locals 4 */
/* .prologue */
/* .line 62 */
/* new-instance v0, Landroid/os/Bundle; */
/* invoke-direct {v0}, Landroid/os/Bundle;-><init>()V */
/* .line 63 */
/* .local v0, "bundle":Landroid/os/Bundle; */
final String v1 = "BILLING_REQUEST"; // const-string v1, "BILLING_REQUEST"
final String v2 = "GET_PURCHASE_INFORMATION"; // const-string v2, "GET_PURCHASE_INFORMATION"
(( android.os.Bundle ) v0 ).putString ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
/* .line 64 */
final String v1 = "NONCE"; // const-string v1, "NONCE"
/* iget-wide v2, p0, Lcom/ansca/corona/purchasing/GoogleStoreFetchPendingPurchasesRequest;->fNonce:J */
(( android.os.Bundle ) v0 ).putLong ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V
/* .line 65 */
final String v2 = "NOTIFY_IDS"; // const-string v2, "NOTIFY_IDS"
v1 = this.fNotificationStringIds;
int v3 = 0; // const/4 v3, 0x0
/* new-array v3, v3, [Ljava/lang/String; */
/* check-cast v1, [Ljava/lang/String; */
(( android.os.Bundle ) v0 ).putStringArray ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putStringArray(Ljava/lang/String;[Ljava/lang/String;)V
/* .line 66 */
} // .end method
