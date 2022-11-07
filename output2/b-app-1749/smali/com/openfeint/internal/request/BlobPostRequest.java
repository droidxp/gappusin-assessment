public class com.openfeint.internal.request.BlobPostRequest extends com.openfeint.internal.request.BaseRequest {
	 /* .source "BlobPostRequest.java" */
	 /* # instance fields */
	 java.lang.String mContentType;
	 private com.openfeint.internal.request.IRawRequestDelegate mDelegate;
	 com.openfeint.internal.resource.BlobUploadParameters mParams;
	 protected com.openfeint.internal.request.multipart.PartSource mPartSource;
	 /* # direct methods */
	 public com.openfeint.internal.request.BlobPostRequest ( ) {
		 /* .locals 1 */
		 /* .param p1, "params" # Lcom/openfeint/internal/resource/BlobUploadParameters; */
		 /* .param p2, "partSource" # Lcom/openfeint/internal/request/multipart/PartSource; */
		 /* .param p3, "contentType" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 66 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* invoke-direct {p0, v0}, Lcom/openfeint/internal/request/BaseRequest;-><init>(Lcom/openfeint/internal/request/OrderedArgList;)V */
		 /* .line 68 */
		 this.mParams = p1;
		 /* .line 69 */
		 this.mPartSource = p2;
		 /* .line 70 */
		 this.mContentType = p3;
		 /* .line 71 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 protected org.apache.http.client.methods.HttpUriRequest generateRequest ( ) {
		 /* .locals 10 */
		 /* .prologue */
		 int v5 = 0; // const/4 v5, 0x0
		 /* .line 39 */
		 v6 = this.mPartSource;
		 /* if-nez v6, :cond_0 */
		 /* move-object v4, v5 */
		 /* .line 60 */
	 } // :goto_0
	 /* .line 44 */
} // :cond_0
/* new-instance v4, Lorg/apache/http/client/methods/HttpPost; */
(( com.openfeint.internal.request.BlobPostRequest ) p0 ).url ( ); // invoke-virtual {p0}, Lcom/openfeint/internal/request/BlobPostRequest;->url()Ljava/lang/String;
/* invoke-direct {v4, v6}, Lorg/apache/http/client/methods/HttpPost;-><init>(Ljava/lang/String;)V */
/* .line 46 */
/* .local v4, "retval":Lorg/apache/http/client/methods/HttpPost; */
int v1 = 0; // const/4 v1, 0x0
/* .line 47 */
/* .local v1, "idx":I */
int v6 = 6; // const/4 v6, 0x6
/* new-array v3, v6, [Lcom/openfeint/internal/request/multipart/Part; */
/* .line 48 */
/* .local v3, "parts":[Lcom/openfeint/internal/request/multipart/Part; */
/* add-int/lit8 v2, v1, 0x1 */
} // .end local v1 # "idx":I
/* .local v2, "idx":I */
/* new-instance v6, Lcom/openfeint/internal/request/multipart/StringPart; */
final String v7 = "AWSAccessKeyId"; // const-string v7, "AWSAccessKeyId"
v8 = this.mParams;
v8 = this.AWSAccessKeyId;
/* invoke-direct {v6, v7, v8}, Lcom/openfeint/internal/request/multipart/StringPart;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
/* aput-object v6, v3, v1 */
/* .line 49 */
/* add-int/lit8 v1, v2, 0x1 */
} // .end local v2 # "idx":I
/* .restart local v1 # "idx":I */
/* new-instance v6, Lcom/openfeint/internal/request/multipart/StringPart; */
final String v7 = "acl"; // const-string v7, "acl"
v8 = this.mParams;
v8 = this.acl;
/* invoke-direct {v6, v7, v8}, Lcom/openfeint/internal/request/multipart/StringPart;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
/* aput-object v6, v3, v2 */
/* .line 50 */
/* add-int/lit8 v2, v1, 0x1 */
} // .end local v1 # "idx":I
/* .restart local v2 # "idx":I */
/* new-instance v6, Lcom/openfeint/internal/request/multipart/StringPart; */
final String v7 = "key"; // const-string v7, "key"
v8 = this.mParams;
v8 = this.key;
/* invoke-direct {v6, v7, v8}, Lcom/openfeint/internal/request/multipart/StringPart;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
/* aput-object v6, v3, v1 */
/* .line 51 */
/* add-int/lit8 v1, v2, 0x1 */
} // .end local v2 # "idx":I
/* .restart local v1 # "idx":I */
/* new-instance v6, Lcom/openfeint/internal/request/multipart/StringPart; */
final String v7 = "policy"; // const-string v7, "policy"
v8 = this.mParams;
v8 = this.policy;
/* invoke-direct {v6, v7, v8}, Lcom/openfeint/internal/request/multipart/StringPart;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
/* aput-object v6, v3, v2 */
/* .line 52 */
/* add-int/lit8 v2, v1, 0x1 */
} // .end local v1 # "idx":I
/* .restart local v2 # "idx":I */
/* new-instance v6, Lcom/openfeint/internal/request/multipart/StringPart; */
final String v7 = "signature"; // const-string v7, "signature"
v8 = this.mParams;
v8 = this.signature;
/* invoke-direct {v6, v7, v8}, Lcom/openfeint/internal/request/multipart/StringPart;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
/* aput-object v6, v3, v1 */
/* .line 53 */
/* add-int/lit8 v1, v2, 0x1 */
} // .end local v2 # "idx":I
/* .restart local v1 # "idx":I */
/* new-instance v6, Lcom/openfeint/internal/request/multipart/FilePart; */
final String v7 = "file"; // const-string v7, "file"
v8 = this.mPartSource;
v9 = this.mContentType;
/* invoke-direct {v6, v7, v8, v9, v5}, Lcom/openfeint/internal/request/multipart/FilePart;-><init>(Ljava/lang/String;Lcom/openfeint/internal/request/multipart/PartSource;Ljava/lang/String;Ljava/lang/String;)V */
/* aput-object v6, v3, v2 */
/* .line 55 */
/* new-instance v0, Lcom/openfeint/internal/request/multipart/MultipartHttpEntity; */
/* invoke-direct {v0, v3}, Lcom/openfeint/internal/request/multipart/MultipartHttpEntity;-><init>([Lcom/openfeint/internal/request/multipart/Part;)V */
/* .line 56 */
/* .local v0, "e":Lorg/apache/http/HttpEntity; */
(( org.apache.http.client.methods.HttpPost ) v4 ).setEntity ( v0 ); // invoke-virtual {v4, v0}, Lorg/apache/http/client/methods/HttpPost;->setEntity(Lorg/apache/http/HttpEntity;)V
/* .line 58 */
(( com.openfeint.internal.request.BlobPostRequest ) p0 ).addParams ( v4 ); // invoke-virtual {p0, v4}, Lcom/openfeint/internal/request/BlobPostRequest;->addParams(Lorg/apache/http/client/methods/HttpUriRequest;)V
} // .end method
public java.lang.String method ( ) {
/* .locals 1 */
/* .prologue */
/* .line 24 */
final String v0 = "POST"; // const-string v0, "POST"
} // .end method
public void onResponse ( Integer p0, Object[] p1 ) {
/* .locals 2 */
/* .param p1, "responseCode" # I */
/* .param p2, "body" # [B */
/* .prologue */
/* .line 74 */
v0 = this.mDelegate;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 75 */
v0 = this.mDelegate;
/* new-instance v1, Ljava/lang/String; */
/* invoke-direct {v1, p2}, Ljava/lang/String;-><init>([B)V */
/* .line 77 */
} // :cond_0
return;
} // .end method
public java.lang.String path ( ) {
/* .locals 1 */
/* .prologue */
/* .line 36 */
final String v0 = ""; // const-string v0, ""
} // .end method
public void setDelegate ( com.openfeint.internal.request.IRawRequestDelegate p0 ) {
/* .locals 0 */
/* .param p1, "mDelegate" # Lcom/openfeint/internal/request/IRawRequestDelegate; */
/* .prologue */
/* .line 80 */
this.mDelegate = p1;
/* .line 81 */
return;
} // .end method
public void sign ( ) {
/* .locals 0 */
/* .prologue */
/* .line 34 */
return;
} // .end method
public Boolean signed ( ) {
/* .locals 1 */
/* .prologue */
/* .line 16 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public java.lang.String url ( ) {
/* .locals 1 */
/* .prologue */
/* .line 29 */
v0 = this.mParams;
v0 = this.action;
} // .end method
