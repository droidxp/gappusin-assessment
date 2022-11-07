public class com.openfeint.internal.request.CacheFileRequest extends com.openfeint.internal.request.CacheRequest {
	 /* .source "CacheFileRequest.java" */
	 /* # static fields */
	 private static final java.lang.String TAG;
	 /* # instance fields */
	 protected java.lang.String path;
	 protected java.lang.String url;
	 /* # direct methods */
	 public com.openfeint.internal.request.CacheFileRequest ( ) {
		 /* .locals 0 */
		 /* .param p1, "path" # Ljava/lang/String; */
		 /* .param p2, "url" # Ljava/lang/String; */
		 /* .param p3, "key" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 11 */
		 /* invoke-direct {p0, p3}, Lcom/openfeint/internal/request/CacheRequest;-><init>(Ljava/lang/String;)V */
		 /* .line 12 */
		 this.path = p1;
		 /* .line 13 */
		 this.url = p2;
		 /* .line 14 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void onResponse ( Integer p0, Object[] p1 ) {
		 /* .locals 3 */
		 /* .param p1, "responseCode" # I */
		 /* .param p2, "body" # [B */
		 /* .prologue */
		 /* .line 18 */
		 /* const/16 v1, 0xc8 */
		 /* if-ne p1, v1, :cond_0 */
		 /* .line 20 */
		 try { // :try_start_0
			 v1 = this.path;
			 com.openfeint.internal.Util .saveFile ( p2,v1 );
			 /* .line 21 */
			 /* invoke-super {p0}, Lcom/openfeint/internal/request/CacheRequest;->on200Response()V */
			 /* :try_end_0 */
			 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* .line 26 */
		 } // :cond_0
	 } // :goto_0
	 return;
	 /* .line 22 */
	 /* :catch_0 */
	 /* move-exception v0 */
	 /* .line 23 */
	 /* .local v0, "e":Ljava/lang/Exception; */
	 final String v1 = "CacheFile"; // const-string v1, "CacheFile"
	 (( java.lang.Exception ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;
	 com.openfeint.internal.OpenFeintInternal .log ( v1,v2 );
} // .end method
public java.lang.String path ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 30 */
	 v0 = this.url;
} // .end method
