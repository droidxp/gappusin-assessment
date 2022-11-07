class com.wiyun.engine.nodes.TextBox$1$5 implements android.view.View$OnFocusChangeListener {
	 /* .source "TextBox.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/wiyun/engine/nodes/TextBox$1;->run()V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.wiyun.engine.nodes.TextBox$1 this$1; //synthetic
private final android.app.Dialog val$d; //synthetic
/* # direct methods */
 com.wiyun.engine.nodes.TextBox$1$5 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1 */
this.this$1 = p1;
this.val$d = p2;
/* .line 271 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void onFocusChange ( android.view.View p0, Boolean p1 ) {
/* .locals 2 */
/* .param p1, "v" # Landroid/view/View; */
/* .param p2, "hasFocus" # Z */
/* .prologue */
/* .line 274 */
if ( p2 != null) { // if-eqz p2, :cond_0
	 /* .line 275 */
	 v0 = this.val$d;
	 (( android.app.Dialog ) v0 ).getWindow ( ); // invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;
	 int v1 = 5; // const/4 v1, 0x5
	 (( android.view.Window ) v0 ).setSoftInputMode ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/Window;->setSoftInputMode(I)V
	 /* .line 276 */
} // :cond_0
return;
} // .end method
