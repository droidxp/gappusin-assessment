public class com.ansca.corona.purchasing.GoogleStoreSendRequestResult {
	 /* .source "GoogleStoreSendRequestResult.java" */
	 /* # instance fields */
	 private com.ansca.corona.purchasing.GoogleStoreRequestError fErrorType;
	 private Long fRequestId;
	 /* # direct methods */
	 protected com.ansca.corona.purchasing.GoogleStoreSendRequestResult ( ) {
		 /* .locals 2 */
		 /* .param p1, "requestId" # J */
		 /* .param p3, "errorType" # Lcom/ansca/corona/purchasing/GoogleStoreRequestError; */
		 /* .prologue */
		 /* .line 27 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 30 */
		 /* if-nez p3, :cond_2 */
		 /* .line 33 */
		 /* const-wide/16 v0, 0x0 */
		 /* cmp-long v0, p1, v0 */
		 /* if-ltz v0, :cond_1 */
		 p3 = com.ansca.corona.purchasing.GoogleStoreRequestError.NONE;
		 /* .line 43 */
	 } // :cond_0
} // :goto_0
/* iput-wide p1, p0, Lcom/ansca/corona/purchasing/GoogleStoreSendRequestResult;->fRequestId:J */
/* .line 44 */
this.fErrorType = p3;
/* .line 45 */
return;
/* .line 33 */
} // :cond_1
p3 = com.ansca.corona.purchasing.GoogleStoreRequestError.INVALID_REQUEST;
/* .line 37 */
} // :cond_2
v0 = com.ansca.corona.purchasing.GoogleStoreRequestError.NONE;
/* if-eq p3, v0, :cond_0 */
/* .line 38 */
/* const-wide/16 p1, -0x1 */
} // .end method
public static com.ansca.corona.purchasing.GoogleStoreSendRequestResult failedWith ( com.ansca.corona.purchasing.GoogleStoreRequestError p0 ) {
/* .locals 3 */
/* .param p0, "error" # Lcom/ansca/corona/purchasing/GoogleStoreRequestError; */
/* .prologue */
/* .line 102 */
/* new-instance v0, Lcom/ansca/corona/purchasing/GoogleStoreSendRequestResult; */
/* const-wide/16 v1, -0x1 */
/* invoke-direct {v0, v1, v2, p0}, Lcom/ansca/corona/purchasing/GoogleStoreSendRequestResult;-><init>(JLcom/ansca/corona/purchasing/GoogleStoreRequestError;)V */
} // .end method
public static com.ansca.corona.purchasing.GoogleStoreSendRequestResult from ( android.os.Bundle p0 ) {
/* .locals 5 */
/* .param p0, "responseBundle" # Landroid/os/Bundle; */
/* .prologue */
/* .line 114 */
/* const-wide/16 v0, -0x1 */
/* .line 115 */
/* .local v0, "requestId":J */
if ( p0 != null) { // if-eqz p0, :cond_0
/* .line 116 */
final String v2 = "REQUEST_ID"; // const-string v2, "REQUEST_ID"
/* const-wide/16 v3, -0x1 */
(( android.os.Bundle ) p0 ).getLong ( v2, v3, v4 ); // invoke-virtual {p0, v2, v3, v4}, Landroid/os/Bundle;->getLong(Ljava/lang/String;J)J
/* move-result-wide v0 */
/* .line 121 */
} // :cond_0
com.ansca.corona.purchasing.GoogleStoreSendRequestResult .fromRequestId ( v0,v1 );
} // .end method
public static com.ansca.corona.purchasing.GoogleStoreSendRequestResult fromRequestId ( Long p0 ) {
/* .locals 2 */
/* .param p0, "requestId" # J */
/* .prologue */
/* .line 91 */
/* new-instance v0, Lcom/ansca/corona/purchasing/GoogleStoreSendRequestResult; */
v1 = com.ansca.corona.purchasing.GoogleStoreRequestError.NONE;
/* invoke-direct {v0, p0, p1, v1}, Lcom/ansca/corona/purchasing/GoogleStoreSendRequestResult;-><init>(JLcom/ansca/corona/purchasing/GoogleStoreRequestError;)V */
} // .end method
/* # virtual methods */
public com.ansca.corona.purchasing.GoogleStoreRequestError getError ( ) {
/* .locals 1 */
/* .prologue */
/* .line 70 */
v0 = this.fErrorType;
} // .end method
public Long getRequestId ( ) {
/* .locals 2 */
/* .prologue */
/* .line 81 */
/* iget-wide v0, p0, Lcom/ansca/corona/purchasing/GoogleStoreSendRequestResult;->fRequestId:J */
/* return-wide v0 */
} // .end method
public Boolean hasFailed ( ) {
/* .locals 1 */
/* .prologue */
/* .line 60 */
v0 = (( com.ansca.corona.purchasing.GoogleStoreSendRequestResult ) p0 ).wasSuccessful ( ); // invoke-virtual {p0}, Lcom/ansca/corona/purchasing/GoogleStoreSendRequestResult;->wasSuccessful()Z
/* if-nez v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Boolean wasSuccessful ( ) {
/* .locals 2 */
/* .prologue */
/* .line 52 */
v0 = this.fErrorType;
v1 = com.ansca.corona.purchasing.GoogleStoreRequestError.NONE;
/* if-ne v0, v1, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
