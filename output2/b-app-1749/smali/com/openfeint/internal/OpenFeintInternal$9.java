class com.openfeint.internal.OpenFeintInternal$9 extends com.openfeint.internal.request.JSONRequest {
	 /* .source "OpenFeintInternal.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/openfeint/internal/OpenFeintInternal;->uploadFile(Ljava/lang/String;Lcom/openfeint/internal/request/multipart/PartSource;Ljava/lang/String;Lcom/openfeint/internal/OpenFeintInternal$IUploadDelegate;)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.openfeint.internal.OpenFeintInternal this$0; //synthetic
final java.lang.String val$contentType; //synthetic
final com.openfeint.internal.OpenFeintInternal$IUploadDelegate val$delegate; //synthetic
final com.openfeint.internal.request.multipart.PartSource val$partSource; //synthetic
final java.lang.String val$xpApiPath; //synthetic
/* # direct methods */
 com.openfeint.internal.OpenFeintInternal$9 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 711 */
this.this$0 = p1;
this.val$xpApiPath = p2;
this.val$partSource = p3;
this.val$contentType = p4;
this.val$delegate = p5;
/* invoke-direct {p0}, Lcom/openfeint/internal/request/JSONRequest;-><init>()V */
return;
} // .end method
/* # virtual methods */
public java.lang.String method ( ) {
/* .locals 1 */
/* .prologue */
/* .line 713 */
final String v0 = "POST"; // const-string v0, "POST"
} // .end method
public void onFailure ( java.lang.String p0 ) {
/* .locals 3 */
/* .param p1, "reason" # Ljava/lang/String; */
/* .prologue */
/* .line 728 */
v0 = this.val$delegate;
if ( v0 != null) { // if-eqz v0, :cond_0
	 v0 = this.val$delegate;
	 final String v1 = ""; // const-string v1, ""
	 int v2 = 0; // const/4 v2, 0x0
	 /* .line 729 */
} // :cond_0
return;
} // .end method
public void onSuccess ( java.lang.Object p0 ) {
/* .locals 4 */
/* .param p1, "responseBody" # Ljava/lang/Object; */
/* .prologue */
/* .line 716 */
/* move-object v1, p1 */
/* check-cast v1, Lcom/openfeint/internal/resource/BlobUploadParameters; */
/* .line 717 */
/* .local v1, "params":Lcom/openfeint/internal/resource/BlobUploadParameters; */
/* new-instance v0, Lcom/openfeint/internal/request/BlobPostRequest; */
v2 = this.val$partSource;
v3 = this.val$contentType;
/* invoke-direct {v0, v1, v2, v3}, Lcom/openfeint/internal/request/BlobPostRequest;-><init>(Lcom/openfeint/internal/resource/BlobUploadParameters;Lcom/openfeint/internal/request/multipart/PartSource;Ljava/lang/String;)V */
/* .line 718 */
/* .local v0, "bp":Lcom/openfeint/internal/request/BlobPostRequest; */
v2 = this.val$delegate;
if ( v2 != null) { // if-eqz v2, :cond_0
	 /* .line 719 */
	 /* new-instance v2, Lcom/openfeint/internal/OpenFeintInternal$9$1; */
	 /* invoke-direct {v2, p0, v1}, Lcom/openfeint/internal/OpenFeintInternal$9$1;-><init>(Lcom/openfeint/internal/OpenFeintInternal$9;Lcom/openfeint/internal/resource/BlobUploadParameters;)V */
	 (( com.openfeint.internal.request.BlobPostRequest ) v0 ).setDelegate ( v2 ); // invoke-virtual {v0, v2}, Lcom/openfeint/internal/request/BlobPostRequest;->setDelegate(Lcom/openfeint/internal/request/IRawRequestDelegate;)V
	 /* .line 725 */
} // :cond_0
v2 = this.this$0;
com.openfeint.internal.OpenFeintInternal .access$900 ( v2,v0 );
/* .line 726 */
return;
} // .end method
public java.lang.String path ( ) {
/* .locals 1 */
/* .prologue */
/* .line 714 */
v0 = this.val$xpApiPath;
} // .end method
public Boolean wantsLogin ( ) {
/* .locals 1 */
/* .prologue */
/* .line 712 */
int v0 = 1; // const/4 v0, 0x1
} // .end method
