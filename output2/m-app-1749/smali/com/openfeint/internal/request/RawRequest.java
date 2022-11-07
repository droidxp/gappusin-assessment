public abstract class com.openfeint.internal.request.RawRequest extends com.openfeint.internal.request.JSONRequest {
	 /* .source "RawRequest.java" */
	 /* # instance fields */
	 private com.openfeint.internal.request.IRawRequestDelegate mDelegate;
	 /* # direct methods */
	 public com.openfeint.internal.request.RawRequest ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 9 */
		 /* invoke-direct {p0}, Lcom/openfeint/internal/request/JSONRequest;-><init>()V */
		 /* .line 10 */
		 return;
	 } // .end method
	 public com.openfeint.internal.request.RawRequest ( ) {
		 /* .locals 0 */
		 /* .param p1, "args" # Lcom/openfeint/internal/request/OrderedArgList; */
		 /* .prologue */
		 /* .line 13 */
		 /* invoke-direct {p0, p1}, Lcom/openfeint/internal/request/JSONRequest;-><init>(Lcom/openfeint/internal/request/OrderedArgList;)V */
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
		 try { // :try_start_0
			 /* invoke-super {p0, p1, p2}, Lcom/openfeint/internal/request/JSONRequest;->onResponse(I[B)V */
			 /* .line 19 */
			 v2 = this.mDelegate;
			 if ( v2 != null) { // if-eqz v2, :cond_0
				 /* .line 22 */
				 v2 = 				 (( com.openfeint.internal.request.RawRequest ) p0 ).isResponseJSON ( ); // invoke-virtual {p0}, Lcom/openfeint/internal/request/RawRequest;->isResponseJSON()Z
				 /* if-nez v2, :cond_1 */
				 /* .line 23 */
				 com.openfeint.internal.request.RawRequest .notJSONError ( p1 );
				 (( com.openfeint.internal.resource.ServerException ) v2 ).generate ( ); // invoke-virtual {v2}, Lcom/openfeint/internal/resource/ServerException;->generate()Ljava/lang/String;
				 /* .line 28 */
				 /* .local v1, "respText":Ljava/lang/String; */
			 } // :goto_0
			 v2 = this.mDelegate;
			 /* .line 34 */
		 } // .end local v1 # "respText":Ljava/lang/String;
	 } // :cond_0
} // :goto_1
return;
/* .line 25 */
} // :cond_1
/* new-instance v1, Ljava/lang/String; */
/* invoke-direct {v1, p2}, Ljava/lang/String;-><init>([B)V */
/* :try_end_0 */
/* .catch Ljava/lang/IllegalStateException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .restart local v1 # "respText":Ljava/lang/String; */
/* .line 30 */
} // .end local v1 # "respText":Ljava/lang/String;
/* :catch_0 */
/* move-exception v0 */
/* .line 32 */
/* .local v0, "e":Ljava/lang/IllegalStateException; */
(( java.lang.IllegalStateException ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/IllegalStateException;->printStackTrace()V
} // .end method
public void setDelegate ( com.openfeint.internal.request.IRawRequestDelegate p0 ) {
/* .locals 0 */
/* .param p1, "mDelegate" # Lcom/openfeint/internal/request/IRawRequestDelegate; */
/* .prologue */
/* .line 37 */
this.mDelegate = p1;
/* .line 38 */
return;
} // .end method
