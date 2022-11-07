class com.openfeint.internal.ui.WebViewCache$6 implements java.lang.Runnable {
	 /* .source "WebViewCache.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/openfeint/internal/ui/WebViewCache;->handleBatchBody(I[BLjava/lang/String;Ljava/lang/String;ILjava/util/Set;)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.openfeint.internal.ui.WebViewCache this$0; //synthetic
final java.lang.String val$currentUrl; //synthetic
final java.lang.String val$originalUrl; //synthetic
final java.util.Set val$paths; //synthetic
final Integer val$retriesLeft; //synthetic
/* # direct methods */
 com.openfeint.internal.ui.WebViewCache$6 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 879 */
this.this$0 = p1;
this.val$originalUrl = p2;
this.val$currentUrl = p3;
this.val$paths = p4;
/* iput p5, p0, Lcom/openfeint/internal/ui/WebViewCache$6;->val$retriesLeft:I */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 5 */
/* .prologue */
/* .line 881 */
v0 = this.val$originalUrl;
v1 = this.val$currentUrl;
v0 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 883 */
	 v0 = this.this$0;
	 v1 = this.val$paths;
	 /* iget v2, p0, Lcom/openfeint/internal/ui/WebViewCache$6;->val$retriesLeft:I */
	 /* add-int/lit8 v2, v2, -0x1 */
	 com.openfeint.internal.ui.WebViewCache .access$1300 ( v0,v1,v2 );
	 /* .line 887 */
} // :goto_0
return;
/* .line 885 */
} // :cond_0
v0 = this.this$0;
v1 = this.val$originalUrl;
v2 = this.val$currentUrl;
/* iget v3, p0, Lcom/openfeint/internal/ui/WebViewCache$6;->val$retriesLeft:I */
/* add-int/lit8 v3, v3, -0x1 */
v4 = this.val$paths;
com.openfeint.internal.ui.WebViewCache .access$1400 ( v0,v1,v2,v3,v4 );
} // .end method
