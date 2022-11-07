public abstract class com.openfeint.internal.request.JSONContentRequest extends com.openfeint.internal.request.BaseRequest {
	 /* .source "JSONContentRequest.java" */
	 /* # static fields */
	 private static final java.lang.String CONTENT_TYPE;
	 public static final java.lang.String DESIRED_RESPONSE_PREFIX;
	 /* # direct methods */
	 public com.openfeint.internal.request.JSONContentRequest ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 19 */
		 /* invoke-direct {p0}, Lcom/openfeint/internal/request/BaseRequest;-><init>()V */
		 /* .line 20 */
		 return;
	 } // .end method
	 public com.openfeint.internal.request.JSONContentRequest ( ) {
		 /* .locals 0 */
		 /* .param p1, "args" # Lcom/openfeint/internal/request/OrderedArgList; */
		 /* .prologue */
		 /* .line 34 */
		 /* invoke-direct {p0, p1}, Lcom/openfeint/internal/request/BaseRequest;-><init>(Lcom/openfeint/internal/request/OrderedArgList;)V */
		 /* .line 35 */
		 return;
	 } // .end method
	 protected static com.openfeint.internal.resource.ServerException notJSONError ( Integer p0 ) {
		 /* .locals 6 */
		 /* .param p0, "responseCode" # I */
		 /* .prologue */
		 /* .line 15 */
		 /* new-instance v0, Lcom/openfeint/internal/resource/ServerException; */
		 final String v1 = "ServerError"; // const-string v1, "ServerError"
		 com.openfeint.internal.OpenFeintInternal .getRString ( v2 );
		 int v3 = 1; // const/4 v3, 0x1
		 /* new-array v3, v3, [Ljava/lang/Object; */
		 int v4 = 0; // const/4 v4, 0x0
		 java.lang.Integer .valueOf ( p0 );
		 /* aput-object v5, v3, v4 */
		 java.lang.String .format ( v2,v3 );
		 /* invoke-direct {v0, v1, v2}, Lcom/openfeint/internal/resource/ServerException;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
	 } // .end method
	 /* # virtual methods */
	 protected org.apache.http.client.methods.HttpUriRequest generateRequest ( ) {
		 /* .locals 3 */
		 /* .prologue */
		 /* .line 23 */
		 /* invoke-super {p0}, Lcom/openfeint/internal/request/BaseRequest;->generateRequest()Lorg/apache/http/client/methods/HttpUriRequest; */
		 /* .line 24 */
		 /* .local v0, "req":Lorg/apache/http/client/methods/HttpUriRequest; */
		 final String v1 = "Accept"; // const-string v1, "Accept"
		 final String v2 = "application/json"; // const-string v2, "application/json"
		 /* .line 25 */
	 } // .end method
	 protected Boolean isResponseJSON ( ) {
		 /* .locals 2 */
		 /* .prologue */
		 /* .line 29 */
		 (( com.openfeint.internal.request.JSONContentRequest ) p0 ).getResponseType ( ); // invoke-virtual {p0}, Lcom/openfeint/internal/request/JSONContentRequest;->getResponseType()Ljava/lang/String;
		 /* .line 30 */
		 /* .local v0, "responseType":Ljava/lang/String; */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 final String v1 = "application/json;"; // const-string v1, "application/json;"
			 v1 = 			 (( java.lang.String ) v0 ).startsWith ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
			 if ( v1 != null) { // if-eqz v1, :cond_0
				 int v1 = 1; // const/4 v1, 0x1
			 } // :goto_0
		 } // :cond_0
		 int v1 = 0; // const/4 v1, 0x0
	 } // .end method
