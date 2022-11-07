class com.openfeint.internal.ui.NativeBrowser$JSInterface$1 implements java.lang.Runnable {
	 /* .source "NativeBrowser.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/openfeint/internal/ui/NativeBrowser$JSInterface;->returnValue(Ljava/lang/String;)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.openfeint.internal.ui.NativeBrowser$JSInterface this$1; //synthetic
final java.lang.String val$returnValue; //synthetic
/* # direct methods */
 com.openfeint.internal.ui.NativeBrowser$JSInterface$1 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 23 */
this.this$1 = p1;
this.val$returnValue = p2;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 4 */
/* .prologue */
/* .line 25 */
v1 = this.this$1;
v1 = this.this$0;
com.openfeint.internal.ui.NativeBrowser .access$000 ( v1 );
int v2 = 0; // const/4 v2, 0x0
int v3 = 1; // const/4 v3, 0x1
v1 = (( java.util.concurrent.atomic.AtomicBoolean ) v1 ).compareAndSet ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z
if ( v1 != null) { // if-eqz v1, :cond_1
	 /* .line 26 */
	 /* new-instance v0, Landroid/content/Intent; */
	 /* invoke-direct {v0}, Landroid/content/Intent;-><init>()V */
	 /* .line 27 */
	 /* .local v0, "returnIntent":Landroid/content/Intent; */
	 v1 = this.val$returnValue;
	 if ( v1 != null) { // if-eqz v1, :cond_0
		 final String v1 = "com.openfeint.internal.ui.NativeBrowser.argument.result"; // const-string v1, "com.openfeint.internal.ui.NativeBrowser.argument.result"
		 v2 = this.val$returnValue;
		 (( android.content.Intent ) v0 ).putExtra ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
		 /* .line 28 */
	 } // :cond_0
	 v1 = this.this$1;
	 v1 = this.this$0;
	 int v2 = -1; // const/4 v2, -0x1
	 (( com.openfeint.internal.ui.NativeBrowser ) v1 ).setResult ( v2, v0 ); // invoke-virtual {v1, v2, v0}, Lcom/openfeint/internal/ui/NativeBrowser;->setResult(ILandroid/content/Intent;)V
	 /* .line 29 */
	 v1 = this.this$1;
	 v1 = this.this$0;
	 (( com.openfeint.internal.ui.NativeBrowser ) v1 ).finish ( ); // invoke-virtual {v1}, Lcom/openfeint/internal/ui/NativeBrowser;->finish()V
	 /* .line 31 */
} // .end local v0 # "returnIntent":Landroid/content/Intent;
} // :cond_1
return;
} // .end method
