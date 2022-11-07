public abstract class com.openfeint.internal.request.JSONRequest extends com.openfeint.internal.request.JSONContentRequest {
	 /* .source "JSONRequest.java" */
	 /* # direct methods */
	 public com.openfeint.internal.request.JSONRequest ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 15 */
		 /* invoke-direct {p0}, Lcom/openfeint/internal/request/JSONContentRequest;-><init>()V */
		 /* .line 16 */
		 return;
	 } // .end method
	 public com.openfeint.internal.request.JSONRequest ( ) {
		 /* .locals 0 */
		 /* .param p1, "args" # Lcom/openfeint/internal/request/OrderedArgList; */
		 /* .prologue */
		 /* .line 19 */
		 /* invoke-direct {p0, p1}, Lcom/openfeint/internal/request/JSONContentRequest;-><init>(Lcom/openfeint/internal/request/OrderedArgList;)V */
		 /* .line 20 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 protected void onFailure ( java.lang.Object p0 ) {
		 /* .locals 3 */
		 /* .param p1, "responseBody" # Ljava/lang/Object; */
		 /* .prologue */
		 /* .line 46 */
		 com.openfeint.internal.OpenFeintInternal .getRString ( v2 );
		 /* .line 48 */
		 /* .local v1, "exceptionMessage":Ljava/lang/String; */
		 if ( p1 != null) { // if-eqz p1, :cond_0
			 /* instance-of v2, p1, Lcom/openfeint/internal/resource/ServerException; */
			 if ( v2 != null) { // if-eqz v2, :cond_0
				 /* move-object v0, p1 */
				 /* .line 49 */
				 /* check-cast v0, Lcom/openfeint/internal/resource/ServerException; */
				 /* .line 50 */
				 /* .local v0, "e":Lcom/openfeint/internal/resource/ServerException; */
				 v1 = this.message;
				 /* .line 52 */
				 /* iget-boolean v2, v0, Lcom/openfeint/internal/resource/ServerException;->needsDeveloperAttention:Z */
				 if ( v2 != null) { // if-eqz v2, :cond_0
					 /* .line 53 */
					 final String v2 = "ServerException"; // const-string v2, "ServerException"
					 com.openfeint.internal.OpenFeintInternal .log ( v2,v1 );
					 /* .line 54 */
					 com.openfeint.internal.OpenFeintInternal .getInstance ( );
					 (( com.openfeint.internal.OpenFeintInternal ) v2 ).displayErrorDialog ( v1 ); // invoke-virtual {v2, v1}, Lcom/openfeint/internal/OpenFeintInternal;->displayErrorDialog(Ljava/lang/CharSequence;)V
					 /* .line 58 */
				 } // .end local v0 # "e":Lcom/openfeint/internal/resource/ServerException;
			 } // :cond_0
			 (( com.openfeint.internal.request.JSONRequest ) p0 ).onFailure ( v1 ); // invoke-virtual {p0, v1}, Lcom/openfeint/internal/request/JSONRequest;->onFailure(Ljava/lang/String;)V
			 /* .line 59 */
			 return;
		 } // .end method
		 public void onFailure ( java.lang.String p0 ) {
			 /* .locals 0 */
			 /* .param p1, "exceptionMessage" # Ljava/lang/String; */
			 /* .prologue */
			 /* .line 12 */
			 return;
		 } // .end method
		 protected void onResponse ( Integer p0, java.lang.Object p1 ) {
			 /* .locals 1 */
			 /* .param p1, "responseCode" # I */
			 /* .param p2, "responseBody" # Ljava/lang/Object; */
			 /* .prologue */
			 /* .line 38 */
			 /* const/16 v0, 0xc8 */
			 /* if-gt v0, p1, :cond_1 */
			 /* const/16 v0, 0x12c */
			 /* if-ge p1, v0, :cond_1 */
			 if ( p2 != null) { // if-eqz p2, :cond_0
				 /* instance-of v0, p2, Lcom/openfeint/internal/resource/ServerException; */
				 /* if-nez v0, :cond_1 */
				 /* .line 39 */
			 } // :cond_0
			 (( com.openfeint.internal.request.JSONRequest ) p0 ).onSuccess ( p2 ); // invoke-virtual {p0, p2}, Lcom/openfeint/internal/request/JSONRequest;->onSuccess(Ljava/lang/Object;)V
			 /* .line 43 */
		 } // :goto_0
		 return;
		 /* .line 41 */
	 } // :cond_1
	 (( com.openfeint.internal.request.JSONRequest ) p0 ).onFailure ( p2 ); // invoke-virtual {p0, p2}, Lcom/openfeint/internal/request/JSONRequest;->onFailure(Ljava/lang/Object;)V
} // .end method
public void onResponse ( Integer p0, Object[] p1 ) {
	 /* .locals 3 */
	 /* .param p1, "responseCode" # I */
	 /* .param p2, "bodyStream" # [B */
	 /* .prologue */
	 /* .line 24 */
	 /* array-length v1, p2 */
	 if ( v1 != null) { // if-eqz v1, :cond_1
		 /* array-length v1, p2 */
		 int v2 = 1; // const/4 v2, 0x1
		 /* if-ne v1, v2, :cond_0 */
		 int v1 = 0; // const/4 v1, 0x0
		 /* aget-byte v1, p2, v1 */
		 /* const/16 v2, 0x20 */
		 /* if-eq v1, v2, :cond_1 */
	 } // :cond_0
	 v1 = 	 (( com.openfeint.internal.request.JSONRequest ) p0 ).isResponseJSON ( ); // invoke-virtual {p0}, Lcom/openfeint/internal/request/JSONRequest;->isResponseJSON()Z
	 if ( v1 != null) { // if-eqz v1, :cond_2
		 /* .line 25 */
	 } // :cond_1
	 (( com.openfeint.internal.request.JSONRequest ) p0 ).parseJson ( p2 ); // invoke-virtual {p0, p2}, Lcom/openfeint/internal/request/JSONRequest;->parseJson([B)Ljava/lang/Object;
	 /* .line 26 */
	 /* .local v0, "responseBody":Ljava/lang/Object; */
	 (( com.openfeint.internal.request.JSONRequest ) p0 ).onResponse ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lcom/openfeint/internal/request/JSONRequest;->onResponse(ILjava/lang/Object;)V
	 /* .line 31 */
} // .end local v0 # "responseBody":Ljava/lang/Object;
} // :goto_0
return;
/* .line 29 */
} // :cond_2
com.openfeint.internal.request.JSONRequest .notJSONError ( p1 );
(( com.openfeint.internal.request.JSONRequest ) p0 ).onResponse ( p1, v1 ); // invoke-virtual {p0, p1, v1}, Lcom/openfeint/internal/request/JSONRequest;->onResponse(ILjava/lang/Object;)V
} // .end method
public void onSuccess ( java.lang.Object p0 ) {
/* .locals 0 */
/* .param p1, "responseBody" # Ljava/lang/Object; */
/* .prologue */
/* .line 11 */
return;
} // .end method
protected java.lang.Object parseJson ( Object[] p0 ) {
/* .locals 1 */
/* .param p1, "bodyStream" # [B */
/* .prologue */
/* .line 34 */
com.openfeint.internal.Util .getObjFromJson ( p1 );
} // .end method
