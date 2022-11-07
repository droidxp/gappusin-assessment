class com.openfeint.internal.ui.WebNav$WebNavClient$1 implements android.content.DialogInterface$OnClickListener {
	 /* .source "WebNav.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/openfeint/internal/ui/WebNav$WebNavClient;->attemptRecovery(Landroid/webkit/WebView;Ljava/lang/String;)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.openfeint.internal.ui.WebNav$WebNavClient this$1; //synthetic
/* # direct methods */
 com.openfeint.internal.ui.WebNav$WebNavClient$1 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 422 */
this.this$1 = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void onClick ( android.content.DialogInterface p0, Integer p1 ) {
/* .locals 1 */
/* .param p1, "dialog" # Landroid/content/DialogInterface; */
/* .param p2, "which" # I */
/* .prologue */
/* .line 425 */
v0 = this.this$1;
(( com.openfeint.internal.ui.WebNav$WebNavClient ) v0 ).submitCrashReport ( ); // invoke-virtual {v0}, Lcom/openfeint/internal/ui/WebNav$WebNavClient;->submitCrashReport()V
/* .line 426 */
return;
} // .end method
