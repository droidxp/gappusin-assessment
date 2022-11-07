class com.openfeint.internal.ui.WebNav$1 implements android.content.DialogInterface$OnCancelListener {
	 /* .source "WebNav.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/openfeint/internal/ui/WebNav;->onCreate(Landroid/os/Bundle;)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.openfeint.internal.ui.WebNav this$0; //synthetic
/* # direct methods */
 com.openfeint.internal.ui.WebNav$1 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 108 */
this.this$0 = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void onCancel ( android.content.DialogInterface p0 ) {
/* .locals 1 */
/* .param p1, "dialog" # Landroid/content/DialogInterface; */
/* .prologue */
/* .line 111 */
v0 = this.this$0;
(( com.openfeint.internal.ui.WebNav ) v0 ).finish ( ); // invoke-virtual {v0}, Lcom/openfeint/internal/ui/WebNav;->finish()V
/* .line 112 */
return;
} // .end method
