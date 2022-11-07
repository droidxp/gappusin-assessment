class com.openfeint.internal.OpenFeintInternal$9$1 implements com.openfeint.internal.request.IRawRequestDelegate {
	 /* .source "OpenFeintInternal.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/openfeint/internal/OpenFeintInternal$9;->onSuccess(Ljava/lang/Object;)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.openfeint.internal.OpenFeintInternal$9 this$1; //synthetic
final com.openfeint.internal.resource.BlobUploadParameters val$params; //synthetic
/* # direct methods */
 com.openfeint.internal.OpenFeintInternal$9$1 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 719 */
this.this$1 = p1;
this.val$params = p2;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void onResponse ( Integer p0, java.lang.String p1 ) {
/* .locals 3 */
/* .param p1, "responseCode" # I */
/* .param p2, "responseBody" # Ljava/lang/String; */
/* .prologue */
/* .line 721 */
v0 = this.this$1;
v1 = this.val$delegate;
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
v2 = this.val$params;
v2 = this.action;
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = this.val$params;
v2 = this.key;
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* const/16 v0, 0xc8 */
/* if-gt v0, p1, :cond_0 */
/* const/16 v0, 0x12c */
/* if-ge p1, v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
/* .line 722 */
return;
/* .line 721 */
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
