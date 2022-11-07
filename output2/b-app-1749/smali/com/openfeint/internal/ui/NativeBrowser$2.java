class com.openfeint.internal.ui.NativeBrowser$2 implements java.lang.Runnable {
	 /* .source "NativeBrowser.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/openfeint/internal/ui/NativeBrowser;->onCreate(Landroid/os/Bundle;)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.openfeint.internal.ui.NativeBrowser this$0; //synthetic
/* # direct methods */
 com.openfeint.internal.ui.NativeBrowser$2 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 80 */
this.this$0 = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 4 */
/* .prologue */
int v3 = 1; // const/4 v3, 0x1
int v2 = 0; // const/4 v2, 0x0
/* .line 82 */
v1 = this.this$0;
com.openfeint.internal.ui.NativeBrowser .access$000 ( v1 );
v1 = (( java.util.concurrent.atomic.AtomicBoolean ) v1 ).compareAndSet ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z
if ( v1 != null) { // if-eqz v1, :cond_0
	 /* .line 83 */
	 /* new-instance v0, Landroid/content/Intent; */
	 /* invoke-direct {v0}, Landroid/content/Intent;-><init>()V */
	 /* .line 84 */
	 /* .local v0, "returnIntent":Landroid/content/Intent; */
	 final String v1 = "com.openfeint.internal.ui.NativeBrowser.argument.failed"; // const-string v1, "com.openfeint.internal.ui.NativeBrowser.argument.failed"
	 (( android.content.Intent ) v0 ).putExtra ( v1, v3 ); // invoke-virtual {v0, v1, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;
	 /* .line 85 */
	 final String v1 = "com.openfeint.internal.ui.NativeBrowser.argument.failure_code"; // const-string v1, "com.openfeint.internal.ui.NativeBrowser.argument.failure_code"
	 (( android.content.Intent ) v0 ).putExtra ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
	 /* .line 86 */
	 final String v1 = "com.openfeint.internal.ui.NativeBrowser.argument.failure_desc"; // const-string v1, "com.openfeint.internal.ui.NativeBrowser.argument.failure_desc"
	 final String v2 = "Timeout"; // const-string v2, "Timeout"
	 (( android.content.Intent ) v0 ).putExtra ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
	 /* .line 87 */
	 v1 = this.this$0;
	 int v2 = -1; // const/4 v2, -0x1
	 (( com.openfeint.internal.ui.NativeBrowser ) v1 ).setResult ( v2, v0 ); // invoke-virtual {v1, v2, v0}, Lcom/openfeint/internal/ui/NativeBrowser;->setResult(ILandroid/content/Intent;)V
	 /* .line 88 */
	 v1 = this.this$0;
	 (( com.openfeint.internal.ui.NativeBrowser ) v1 ).finish ( ); // invoke-virtual {v1}, Lcom/openfeint/internal/ui/NativeBrowser;->finish()V
	 /* .line 90 */
} // .end local v0 # "returnIntent":Landroid/content/Intent;
} // :cond_0
return;
} // .end method
