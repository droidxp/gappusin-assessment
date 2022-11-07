class com.openfeint.internal.ui.WebNav$2$1 implements java.lang.Runnable {
	 /* .source "WebNav.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/openfeint/internal/ui/WebNav$2;->action(Ljava/lang/String;)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.openfeint.internal.ui.WebNav$2 this$1; //synthetic
final java.lang.String val$actionUri; //synthetic
/* # direct methods */
 com.openfeint.internal.ui.WebNav$2$1 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 134 */
this.this$1 = p1;
this.val$actionUri = p2;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 2 */
/* .prologue */
/* .line 137 */
v0 = this.this$1;
v0 = this.this$0;
(( com.openfeint.internal.ui.WebNav ) v0 ).getActionHandler ( ); // invoke-virtual {v0}, Lcom/openfeint/internal/ui/WebNav;->getActionHandler()Lcom/openfeint/internal/ui/WebNav$ActionHandler;
v1 = this.val$actionUri;
android.net.Uri .parse ( v1 );
(( com.openfeint.internal.ui.WebNav$ActionHandler ) v0 ).dispatch ( v1 ); // invoke-virtual {v0, v1}, Lcom/openfeint/internal/ui/WebNav$ActionHandler;->dispatch(Landroid/net/Uri;)V
/* .line 138 */
return;
} // .end method
