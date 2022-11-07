class com.openfeint.internal.ui.Settings$1 implements android.content.DialogInterface$OnClickListener {
	 /* .source "Settings.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/openfeint/internal/ui/Settings;->onResume()V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.openfeint.internal.ui.Settings this$0; //synthetic
/* # direct methods */
 com.openfeint.internal.ui.Settings$1 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 37 */
this.this$0 = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void onClick ( android.content.DialogInterface p0, Integer p1 ) {
/* .locals 1 */
/* .param p1, "dialog" # Landroid/content/DialogInterface; */
/* .param p2, "which" # I */
/* .prologue */
/* .line 39 */
v0 = this.this$0;
(( com.openfeint.internal.ui.Settings ) v0 ).finish ( ); // invoke-virtual {v0}, Lcom/openfeint/internal/ui/Settings;->finish()V
/* .line 40 */
return;
} // .end method
