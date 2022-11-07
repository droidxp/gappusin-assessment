public class com.ansca.corona.purchasing.GoogleStoreConfirmPendingPurchasesRequest extends com.ansca.corona.purchasing.GoogleStoreRequest {
	 /* .source "GoogleStoreConfirmPendingPurchasesRequest.java" */
	 /* # instance fields */
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
public com.ansca.corona.purchasing.GoogleStoreConfirmPendingPurchasesRequest ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/Collection", */
/* "<", */
/* "Ljava/lang/String;", */
/* ">;)V" */
/* } */
} // .end annotation
/* .prologue */
/* .line 19 */
/* .local p1, "notificationStringIds":Ljava/util/Collection;, "Ljava/util/Collection<Ljava/lang/String;>;" */
/* invoke-direct {p0}, Lcom/ansca/corona/purchasing/GoogleStoreRequest;-><init>()V */
/* .line 22 */
/* if-nez p1, :cond_0 */
/* .line 23 */
/* new-instance v0, Ljava/lang/NullPointerException; */
/* invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V */
/* throw v0 */
/* .line 25 */
v0 = } // :cond_0
/* if-gtz v0, :cond_1 */
/* .line 26 */
/* new-instance v0, Ljava/lang/IllegalArgumentException; */
/* invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V */
/* throw v0 */
/* .line 30 */
} // :cond_1
java.util.Collections .unmodifiableCollection ( p1 );
this.fNotificationStringIds = v0;
/* .line 31 */
return;
} // .end method
/* # virtual methods */
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
/* .line 38 */
v0 = this.fNotificationStringIds;
} // .end method
public android.os.Bundle toBundle ( ) {
/* .locals 4 */
/* .prologue */
/* .line 46 */
/* new-instance v0, Landroid/os/Bundle; */
/* invoke-direct {v0}, Landroid/os/Bundle;-><init>()V */
/* .line 47 */
/* .local v0, "bundle":Landroid/os/Bundle; */
final String v1 = "BILLING_REQUEST"; // const-string v1, "BILLING_REQUEST"
final String v2 = "CONFIRM_NOTIFICATIONS"; // const-string v2, "CONFIRM_NOTIFICATIONS"
(( android.os.Bundle ) v0 ).putString ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
/* .line 48 */
final String v2 = "NOTIFY_IDS"; // const-string v2, "NOTIFY_IDS"
v1 = this.fNotificationStringIds;
int v3 = 0; // const/4 v3, 0x0
/* new-array v3, v3, [Ljava/lang/String; */
/* check-cast v1, [Ljava/lang/String; */
(( android.os.Bundle ) v0 ).putStringArray ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putStringArray(Ljava/lang/String;[Ljava/lang/String;)V
/* .line 49 */
} // .end method
