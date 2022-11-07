class com.openfeint.internal.OpenFeintInternal$3 implements java.lang.Runnable {
	 /* .source "OpenFeintInternal.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/openfeint/internal/OpenFeintInternal;->loginUser(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/openfeint/internal/request/IRawRequestDelegate;)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.openfeint.internal.OpenFeintInternal this$0; //synthetic
final com.openfeint.internal.request.IRawRequestDelegate val$delegate; //synthetic
final java.lang.String val$password; //synthetic
final java.lang.String val$userID; //synthetic
final java.lang.String val$userName; //synthetic
/* # direct methods */
 com.openfeint.internal.OpenFeintInternal$3 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 408 */
this.this$0 = p1;
this.val$userName = p2;
this.val$password = p3;
this.val$userID = p4;
this.val$delegate = p5;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 5 */
/* .prologue */
/* .line 410 */
v0 = this.this$0;
v1 = this.val$userName;
v2 = this.val$password;
v3 = this.val$userID;
v4 = this.val$delegate;
(( com.openfeint.internal.OpenFeintInternal ) v0 ).loginUser ( v1, v2, v3, v4 ); // invoke-virtual {v0, v1, v2, v3, v4}, Lcom/openfeint/internal/OpenFeintInternal;->loginUser(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/openfeint/internal/request/IRawRequestDelegate;)V
/* .line 411 */
return;
} // .end method
