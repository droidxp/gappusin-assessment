public class com.openfeint.internal.request.GenericRequest extends com.openfeint.internal.request.JSONContentRequest {
	 /* .source "GenericRequest.java" */
	 /* # instance fields */
	 private com.openfeint.internal.request.IRawRequestDelegate mDelegate;
	 final java.lang.String mMethod;
	 final java.lang.String mPath;
	 private Integer mRetries;
	 private Long mTimeout;
	 /* # direct methods */
	 public com.openfeint.internal.request.GenericRequest ( ) {
		 /* .locals 8 */
		 /* .param p1, "path" # Ljava/lang/String; */
		 /* .param p2, "method" # Ljava/lang/String; */
		 /* .param p5, "delegate" # Lcom/openfeint/internal/request/IRawRequestDelegate; */
		 /* .annotation system Ldalvik/annotation/Signature; */
		 /* value = { */
		 /* "(", */
		 /* "Ljava/lang/String;", */
		 /* "Ljava/lang/String;", */
		 /* "Ljava/util/Map", */
		 /* "<", */
		 /* "Ljava/lang/String;", */
		 /* "Ljava/lang/Object;", */
		 /* ">;", */
		 /* "Ljava/util/Map", */
		 /* "<", */
		 /* "Ljava/lang/String;", */
		 /* "Ljava/lang/Object;", */
		 /* ">;", */
		 /* "Lcom/openfeint/internal/request/IRawRequestDelegate;", */
		 /* ")V" */
		 /* } */
	 } // .end annotation
	 /* .prologue */
	 /* .line 25 */
	 /* .local p3, "args":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;" */
	 /* .local p4, "httpParams":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;" */
	 /* invoke-direct {p0}, Lcom/openfeint/internal/request/JSONContentRequest;-><init>()V */
	 /* .line 13 */
	 /* invoke-super {p0}, Lcom/openfeint/internal/request/JSONContentRequest;->timeout()J */
	 /* move-result-wide v6 */
	 /* iput-wide v6, p0, Lcom/openfeint/internal/request/GenericRequest;->mTimeout:J */
	 /* .line 14 */
	 v6 = 	 /* invoke-super {p0}, Lcom/openfeint/internal/request/JSONContentRequest;->numRetries()I */
	 /* iput v6, p0, Lcom/openfeint/internal/request/GenericRequest;->mRetries:I */
	 /* .line 27 */
	 if ( p4 != null) { // if-eqz p4, :cond_5
		 /* .line 28 */
		 /* .local v3, "i$":Ljava/util/Iterator; */
	 } // :cond_0
v6 = } // :goto_0
if ( v6 != null) { // if-eqz v6, :cond_5
	 /* check-cast v1, Ljava/util/Map$Entry; */
	 /* .line 29 */
	 /* .local v1, "e":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Ljava/lang/Object;>;" */
	 /* check-cast v4, Ljava/lang/String; */
	 /* .line 30 */
	 /* .local v4, "k":Ljava/lang/String; */
	 (( java.lang.Object ) v6 ).toString ( ); // invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;
	 /* .line 31 */
	 /* .local v5, "v":Ljava/lang/String; */
	 v2 = 	 java.lang.Integer .parseInt ( v5 );
	 /* .line 32 */
	 /* .local v2, "i":I */
	 final String v6 = "connectionTimeout"; // const-string v6, "connectionTimeout"
	 v6 = 	 (( java.lang.String ) v4 ).equals ( v6 ); // invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
	 if ( v6 != null) { // if-eqz v6, :cond_1
		 /* .line 33 */
		 (( com.openfeint.internal.request.GenericRequest ) p0 ).getHttpParams ( ); // invoke-virtual {p0}, Lcom/openfeint/internal/request/GenericRequest;->getHttpParams()Lorg/apache/http/params/HttpParams;
		 org.apache.http.params.HttpConnectionParams .setConnectionTimeout ( v6,v2 );
		 /* .line 34 */
	 } // :cond_1
	 final String v6 = "socketTimeout"; // const-string v6, "socketTimeout"
	 v6 = 	 (( java.lang.String ) v4 ).equals ( v6 ); // invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
	 if ( v6 != null) { // if-eqz v6, :cond_2
		 /* .line 35 */
		 (( com.openfeint.internal.request.GenericRequest ) p0 ).getHttpParams ( ); // invoke-virtual {p0}, Lcom/openfeint/internal/request/GenericRequest;->getHttpParams()Lorg/apache/http/params/HttpParams;
		 org.apache.http.params.HttpConnectionParams .setSoTimeout ( v6,v2 );
		 /* .line 36 */
	 } // :cond_2
	 final String v6 = "lingerTimeout"; // const-string v6, "lingerTimeout"
	 v6 = 	 (( java.lang.String ) v4 ).equals ( v6 ); // invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
	 if ( v6 != null) { // if-eqz v6, :cond_3
		 /* .line 37 */
		 (( com.openfeint.internal.request.GenericRequest ) p0 ).getHttpParams ( ); // invoke-virtual {p0}, Lcom/openfeint/internal/request/GenericRequest;->getHttpParams()Lorg/apache/http/params/HttpParams;
		 org.apache.http.params.HttpConnectionParams .setLinger ( v6,v2 );
		 /* .line 38 */
	 } // :cond_3
	 final String v6 = "timeout"; // const-string v6, "timeout"
	 v6 = 	 (( java.lang.String ) v4 ).equals ( v6 ); // invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
	 if ( v6 != null) { // if-eqz v6, :cond_4
		 /* .line 39 */
		 /* int-to-long v6, v2 */
		 /* iput-wide v6, p0, Lcom/openfeint/internal/request/GenericRequest;->mTimeout:J */
		 /* .line 40 */
	 } // :cond_4
	 final String v6 = "retries"; // const-string v6, "retries"
	 v6 = 	 (( java.lang.String ) v4 ).equals ( v6 ); // invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
	 if ( v6 != null) { // if-eqz v6, :cond_0
		 /* .line 41 */
		 /* iput v2, p0, Lcom/openfeint/internal/request/GenericRequest;->mRetries:I */
		 /* .line 48 */
	 } // .end local v1 # "e":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Ljava/lang/Object;>;"
} // .end local v2 # "i":I
} // .end local v3 # "i$":Ljava/util/Iterator;
} // .end local v4 # "k":Ljava/lang/String;
} // .end local v5 # "v":Ljava/lang/String;
} // :cond_5
/* new-instance v0, Lcom/openfeint/internal/request/OrderedArgList; */
/* invoke-direct {v0, p3}, Lcom/openfeint/internal/request/OrderedArgList;-><init>(Ljava/util/Map;)V */
/* .line 49 */
/* .local v0, "argList":Lcom/openfeint/internal/request/OrderedArgList; */
final String v6 = "format"; // const-string v6, "format"
final String v7 = "json"; // const-string v7, "json"
(( com.openfeint.internal.request.OrderedArgList ) v0 ).put ( v6, v7 ); // invoke-virtual {v0, v6, v7}, Lcom/openfeint/internal/request/OrderedArgList;->put(Ljava/lang/String;Ljava/lang/String;)V
/* .line 50 */
(( com.openfeint.internal.request.GenericRequest ) p0 ).setArgs ( v0 ); // invoke-virtual {p0, v0}, Lcom/openfeint/internal/request/GenericRequest;->setArgs(Lcom/openfeint/internal/request/OrderedArgList;)V
/* .line 52 */
this.mMethod = p2;
/* .line 53 */
this.mPath = p1;
/* .line 55 */
(( com.openfeint.internal.request.GenericRequest ) p0 ).setDelegate ( p5 ); // invoke-virtual {p0, p5}, Lcom/openfeint/internal/request/GenericRequest;->setDelegate(Lcom/openfeint/internal/request/IRawRequestDelegate;)V
/* .line 56 */
return;
} // .end method
/* # virtual methods */
public java.lang.String method ( ) {
/* .locals 1 */
/* .prologue */
/* .line 59 */
v0 = this.mMethod;
} // .end method
public Integer numRetries ( ) {
/* .locals 1 */
/* .prologue */
/* .line 17 */
/* iget v0, p0, Lcom/openfeint/internal/request/GenericRequest;->mRetries:I */
} // .end method
public void onResponse ( Integer p0, Object[] p1 ) {
/* .locals 3 */
/* .param p1, "responseCode" # I */
/* .param p2, "body" # [B */
/* .prologue */
/* .line 65 */
try { // :try_start_0
v2 = (( com.openfeint.internal.request.GenericRequest ) p0 ).isResponseJSON ( ); // invoke-virtual {p0}, Lcom/openfeint/internal/request/GenericRequest;->isResponseJSON()Z
/* if-nez v2, :cond_1 */
/* .line 66 */
com.openfeint.internal.request.GenericRequest .notJSONError ( p1 );
(( com.openfeint.internal.resource.ServerException ) v2 ).generate ( ); // invoke-virtual {v2}, Lcom/openfeint/internal/resource/ServerException;->generate()Ljava/lang/String;
/* .line 71 */
/* .local v1, "respText":Ljava/lang/String; */
} // :goto_0
v2 = this.mDelegate;
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 72 */
v2 = this.mDelegate;
/* .line 79 */
} // .end local v1 # "respText":Ljava/lang/String;
} // :cond_0
} // :goto_1
return;
/* .line 68 */
} // :cond_1
if ( p2 != null) { // if-eqz p2, :cond_2
/* new-instance v1, Ljava/lang/String; */
/* invoke-direct {v1, p2}, Ljava/lang/String;-><init>([B)V */
/* .restart local v1 # "respText":Ljava/lang/String; */
} // :goto_2
} // .end local v1 # "respText":Ljava/lang/String;
} // :cond_2
final String v1 = ""; // const-string v1, ""
/* :try_end_0 */
/* .catch Ljava/lang/IllegalStateException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 75 */
/* :catch_0 */
/* move-exception v0 */
/* .line 77 */
/* .local v0, "e":Ljava/lang/IllegalStateException; */
(( java.lang.IllegalStateException ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/IllegalStateException;->printStackTrace()V
} // .end method
public java.lang.String path ( ) {
/* .locals 1 */
/* .prologue */
/* .line 60 */
v0 = this.mPath;
} // .end method
public void setDelegate ( com.openfeint.internal.request.IRawRequestDelegate p0 ) {
/* .locals 0 */
/* .param p1, "mDelegate" # Lcom/openfeint/internal/request/IRawRequestDelegate; */
/* .prologue */
/* .line 82 */
this.mDelegate = p1;
/* .line 83 */
return;
} // .end method
public Long timeout ( ) {
/* .locals 2 */
/* .prologue */
/* .line 16 */
/* iget-wide v0, p0, Lcom/openfeint/internal/request/GenericRequest;->mTimeout:J */
/* return-wide v0 */
} // .end method
