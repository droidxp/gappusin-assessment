public abstract class com.openfeint.internal.request.DownloadRequest extends com.openfeint.internal.request.BaseRequest {
	 /* .source "DownloadRequest.java" */
	 /* # direct methods */
	 public com.openfeint.internal.request.DownloadRequest ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 16 */
		 /* invoke-direct {p0}, Lcom/openfeint/internal/request/BaseRequest;-><init>()V */
		 /* .line 17 */
		 return;
	 } // .end method
	 public com.openfeint.internal.request.DownloadRequest ( ) {
		 /* .locals 0 */
		 /* .param p1, "args" # Lcom/openfeint/internal/request/OrderedArgList; */
		 /* .prologue */
		 /* .line 20 */
		 /* invoke-direct {p0, p1}, Lcom/openfeint/internal/request/BaseRequest;-><init>(Lcom/openfeint/internal/request/OrderedArgList;)V */
		 /* .line 21 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public java.lang.String method ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 23 */
		 final String v0 = "GET"; // const-string v0, "GET"
	 } // .end method
	 public void onFailure ( java.lang.String p0 ) {
		 /* .locals 1 */
		 /* .param p1, "exceptionMessage" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 26 */
		 final String v0 = "ServerException"; // const-string v0, "ServerException"
		 com.openfeint.internal.OpenFeintInternal .log ( v0,p1 );
		 /* .line 27 */
		 return;
	 } // .end method
	 public void onResponse ( Integer p0, Object[] p1 ) {
		 /* .locals 9 */
		 /* .param p1, "responseCode" # I */
		 /* .param p2, "body" # [B */
		 /* .prologue */
		 /* .line 31 */
		 com.openfeint.internal.OpenFeintInternal .getRString ( v7 );
		 /* .line 32 */
		 /* .local v2, "exceptionMessage":Ljava/lang/String; */
		 /* const/16 v7, 0xc8 */
		 /* if-gt v7, p1, :cond_0 */
		 /* const/16 v7, 0x12c */
		 /* if-ge p1, v7, :cond_0 */
		 if ( p2 != null) { // if-eqz p2, :cond_0
			 /* .line 33 */
			 (( com.openfeint.internal.request.DownloadRequest ) p0 ).onSuccess ( p2 ); // invoke-virtual {p0, p2}, Lcom/openfeint/internal/request/DownloadRequest;->onSuccess([B)V
			 /* .line 51 */
		 } // :goto_0
		 return;
		 /* .line 35 */
	 } // :cond_0
	 /* const/16 v7, 0x194 */
	 /* if-ne v7, p1, :cond_2 */
	 /* .line 36 */
	 com.openfeint.internal.OpenFeintInternal .getRString ( v7 );
	 /* .line 50 */
} // :cond_1
} // :goto_1
(( com.openfeint.internal.request.DownloadRequest ) p0 ).onFailure ( v2 ); // invoke-virtual {p0, v2}, Lcom/openfeint/internal/request/DownloadRequest;->onFailure(Ljava/lang/String;)V
/* .line 39 */
} // :cond_2
try { // :try_start_0
/* new-instance v5, Lorg/codehaus/jackson/JsonFactory; */
/* invoke-direct {v5}, Lorg/codehaus/jackson/JsonFactory;-><init>()V */
/* .line 40 */
/* .local v5, "jsonFactory":Lorg/codehaus/jackson/JsonFactory; */
(( org.codehaus.jackson.JsonFactory ) v5 ).createJsonParser ( p2 ); // invoke-virtual {v5, p2}, Lorg/codehaus/jackson/JsonFactory;->createJsonParser([B)Lorg/codehaus/jackson/JsonParser;
/* .line 41 */
/* .local v3, "jp":Lorg/codehaus/jackson/JsonParser; */
/* new-instance v4, Lcom/openfeint/internal/JsonResourceParser; */
/* invoke-direct {v4, v3}, Lcom/openfeint/internal/JsonResourceParser;-><init>(Lorg/codehaus/jackson/JsonParser;)V */
/* .line 42 */
/* .local v4, "jrp":Lcom/openfeint/internal/JsonResourceParser; */
(( com.openfeint.internal.JsonResourceParser ) v4 ).parse ( ); // invoke-virtual {v4}, Lcom/openfeint/internal/JsonResourceParser;->parse()Ljava/lang/Object;
/* .line 43 */
/* .local v6, "responseBody":Ljava/lang/Object; */
if ( v6 != null) { // if-eqz v6, :cond_1
/* instance-of v7, v6, Lcom/openfeint/internal/resource/ServerException; */
if ( v7 != null) { // if-eqz v7, :cond_1
	 /* .line 44 */
	 /* move-object v0, v6 */
	 /* check-cast v0, Lcom/openfeint/internal/resource/ServerException; */
	 /* move-object v1, v0 */
	 /* .line 45 */
	 /* .local v1, "e":Lcom/openfeint/internal/resource/ServerException; */
	 /* new-instance v7, Ljava/lang/StringBuilder; */
	 /* invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V */
	 v8 = this.exceptionClass;
	 (( java.lang.StringBuilder ) v7 ).append ( v8 ); // invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 final String v8 = ": "; // const-string v8, ": "
	 (( java.lang.StringBuilder ) v7 ).append ( v8 ); // invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 v8 = this.message;
	 (( java.lang.StringBuilder ) v7 ).append ( v8 ); // invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v7 ).toString ( ); // invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 /* :try_end_0 */
	 /* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* .line 47 */
} // .end local v1 # "e":Lcom/openfeint/internal/resource/ServerException;
} // .end local v3 # "jp":Lorg/codehaus/jackson/JsonParser;
} // .end local v4 # "jrp":Lcom/openfeint/internal/JsonResourceParser;
} // .end local v5 # "jsonFactory":Lorg/codehaus/jackson/JsonFactory;
} // .end local v6 # "responseBody":Ljava/lang/Object;
/* :catch_0 */
/* move-exception v1 */
/* .line 48 */
/* .local v1, "e":Ljava/io/IOException; */
com.openfeint.internal.OpenFeintInternal .getRString ( v7 );
} // .end method
protected abstract void onSuccess ( Object[] p0 ) {
} // .end method
